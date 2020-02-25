package facade.amazonaws.services.s3

import scala.concurrent.Future
import scala.scalajs.js

@deprecated("Use facade.amazonaws.services.s3.S3OpsExtension", "0.30.0")
object S3Extension {
  @deprecated("Use facade.amazonaws.services.s3.S3OpsExtension", "0.30.0")
  implicit final class S3Ops(s3: S3) {
    @deprecated("Use facade.amazonaws.services.s3.S3OpsExtension.getSignedUrlFuture", "0.30.0")
    def getSignedUrlFuture(operation: String, params: scalajs.js.Object, expires: Int = 900): Future[String] =
      facade.amazonaws.services.s3.S3Ops(s3).getSignedUrlFuture(operation.asInstanceOf[Operation], params, expires)
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
  @deprecated("Use facade.amazonaws.services.s3.S3OpsExtension.getSignedUrlFuture", "0.30.0")
  def getSignedUrlFuture(s3: S3, operation: String, params: js.Object, expires: Int = 900): Future[String] = {
    facade.amazonaws.services.s3.S3Ops(s3).getSignedUrlFuture(operation.asInstanceOf[Operation], params, expires)
  }
}
