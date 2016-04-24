package facade.amazonaws

import scala.scalajs._
import scala.scalajs.js.Dynamic.{ global => g, newInstance => jsnew }
import scala.scalajs.js.annotation.JSName

import facade.amazonaws.services.s3._

object AWS {

  private lazy val aws = g.require("aws-sdk")

  val config: AWSConfig = aws.config.asInstanceOf[AWSConfig]

  def S3(): S3 = jsnew(aws.S3)().asInstanceOf[S3]
}

@js.native
trait AWSConfig extends js.Object {

  var region: String = js.native

}

@js.native
trait Request[T <: js.Object] extends js.Object {
  def on(event: String, callback: Callback[T]): Request[T] = js.native
  def send(): Response[T] = js.native
}

object Event {
  val success = "success"
  val error = "error"
  val complete = "complete"
  
  val validate = "validate"
  val build = "build"
  val sign = "sign"
  
  val send = "send"
  val retry = "retry"
  
  val extractError = "extractError"
  val extractData = "extractData"
  
  val httpHeaders = "httpHeaders"
  val httpData = "httpData"
  val httpUploadProgress = "httpUploadProgress"
  val httpDownloadProgress = "httpDownloadProgress"
  val httpError = "httpError"
  val httpDone = "httpDone"
}

@js.native
trait Response[T <: js.Object] extends js.Object {
  val error: Error = js.native
  val data: T = js.native
  val request: Request[T] = js.native

  def hasNextPage(): Boolean = js.native
  def nextPage(): Request[T] = js.native
}

@js.native
trait Error extends js.Object {
  val code: String = js.native
  val message: String = js.native
}

