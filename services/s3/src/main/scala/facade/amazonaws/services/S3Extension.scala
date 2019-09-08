package facade.amazonaws.services.s3

import scala.concurrent.Future
import scala.scalajs.js

object S3Extension {
  implicit class S3Ops(s3: S3) {
    @deprecated("Use getSignedUrlFuture instead", "0.25.0")
    def getSignedUrl(operation: String, params: scalajs.js.Object, expires: Int = 900): Future[String] =
      S3Extension.getSignedUrlFuture(s3, operation, params, expires)

    def getSignedUrlFuture(operation: String, params: scalajs.js.Object, expires: Int = 900): Future[String] =
      S3Extension.getSignedUrlFuture(s3, operation, params, expires)
  }

  /**
    * Get a pre-signed URL for a given operation name.
    *
    * @see http://docs.aws.amazon.com/AWSJavaScriptSDK/latest/AWS/S3.html#getSignedUrl-property
    * @param operation the name of the operation to call. E.g. `getObject`
    * @param params Parameters to pass to the operation. See the given operation for the expected operation parameters. In addition, you can also pass the "Expires" parameter to inform S3 how long the URL should work for.
    * @param expires The number of seconds to expire the pre-signed URL operation in. Defaults to 900 seconds (15 minutes).
    * @return Future of the signed URL
    */
  def getSignedUrlFuture(s3: S3, operation: String, params: js.Object, expires: Int = 900): Future[String] = {
    val paramsWithExpires = if (params.hasOwnProperty("Expires") || expires == 900) {
      params

    } else {
      val deepCloned = js.JSON.parse(js.JSON.stringify(params))
      deepCloned.Expires = expires
      deepCloned.asInstanceOf[js.Object]
    }

    s3.asInstanceOf[js.Dynamic]
      .getSignedUrlPromise(operation, paramsWithExpires)
      .asInstanceOf[js.Promise[String]]
      .toFuture
  }

  @deprecated("Use getSignedUrlFuture instead", "0.25.0")
  def getSignedUrl(s3: S3, operation: String, params: js.Object, expires: Int = 900): Future[String] =
    getSignedUrlFuture(s3, operation, params, expires)
}
