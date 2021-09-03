package facade.amazonaws.services.s3

import facade.amazonaws.{Error => AWSError}

import scala.concurrent.Future
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

package object managedupload {

  /** The managed uploader allows for easy and efficient uploading of buffers, blobs, or streams, using a configurable amount of concurrency to perform multipart uploads where possible. This abstraction also enables uploading streams of unknown size due to the use of multipart uploads.
    */
  @js.native
  @JSImport("aws-sdk/clients/s3", "ManagedUpload", "AWS.S3.ManagedUpload")
  class ManagedUpload(options: ManagedUploadOptions) extends js.Object {
    def abort(): Unit = js.native
    def promise(): js.Promise[SendData] = js.native
    def send(): Unit = js.native
    def send(callback: js.Function2[AWSError, SendData, Unit]): Unit = js.native
    def on(event: String, listener: js.Function1[Progress, Unit]): js.Dynamic = js.native

    var maxTotalParts: Double = js.native
    var minPartSize: Double = js.native
  }

  implicit final class ManagedUploadOps(private val instance: ManagedUpload) extends AnyVal {
    def sendFuture(): Future[SendData] = instance.promise().toFuture
    def onUploadProgress(handler: js.Function1[Progress, Unit]): Unit = instance.on("httpUploadProgress", handler)
  }

  @js.native
  trait Progress extends js.Object {
    var loaded: Double = js.native
    var total: Double = js.native
  }

  object Progress {
    def apply(
        loaded: Double,
        total: Double
    ): Progress = {
      val _obj$ = js.Dynamic.literal(
        "loaded" -> loaded.asInstanceOf[js.Any],
        "total" -> total.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[Progress]
    }
  }

  @js.native
  trait SendData extends js.Object {
    var Location: String = js.native
    var ETag: String = js.native
    var Bucket: String = js.native
    var Key: String = js.native
  }

  object SendData {
    def apply(
        Location: String,
        ETag: String,
        Bucket: String,
        Key: String
    ): SendData = {
      val _obj$ = js.Dynamic.literal(
        "Location" -> Location.asInstanceOf[js.Any],
        "ETag" -> ETag.asInstanceOf[js.Any],
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Key" -> Key.asInstanceOf[js.Any]
      )
      _obj$.asInstanceOf[SendData]
    }
  }

  @js.native
  trait ManagedUploadOptions extends js.Object {
    var params: js.UndefOr[PutObjectRequest] = js.native
    var queueSize: js.UndefOr[Double] = js.native
    var partSize: js.UndefOr[Double] = js.native
    var leavePartsOnError: js.UndefOr[Boolean] = js.native
    var service: js.UndefOr[S3] = js.native
    var tags: js.UndefOr[js.Array[Tag]] = js.native
  }

  object ManagedUploadOptions {
    def apply(
        params: js.UndefOr[PutObjectRequest] = js.undefined,
        queueSize: js.UndefOr[Double] = js.undefined,
        partSize: js.UndefOr[Double] = js.undefined,
        leavePartsOnError: js.UndefOr[Boolean] = js.undefined,
        service: js.UndefOr[S3] = js.undefined,
        tags: js.UndefOr[js.Array[Tag]] = js.undefined
    ): ManagedUploadOptions = {
      val _obj$ = js.Dynamic.literal()
      params.foreach(_v => _obj$.updateDynamic("params")(_v.asInstanceOf[js.Any]))
      queueSize.foreach(_v => _obj$.updateDynamic("queueSize")(_v.asInstanceOf[js.Any]))
      partSize.foreach(_v => _obj$.updateDynamic("partSize")(_v.asInstanceOf[js.Any]))
      leavePartsOnError.foreach(_v => _obj$.updateDynamic("leavePartsOnError")(_v.asInstanceOf[js.Any]))
      service.foreach(_v => _obj$.updateDynamic("service")(_v.asInstanceOf[js.Any]))
      tags.foreach(_v => _obj$.updateDynamic("tags")(_v.asInstanceOf[js.Any]))
      _obj$.asInstanceOf[ManagedUploadOptions]
    }
  }
}
