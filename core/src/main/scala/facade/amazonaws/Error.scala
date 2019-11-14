package facade.amazonaws

import scala.scalajs.js

@js.native
trait Error extends js.Object {
  val code: String    = js.native
  val message: String = js.native
  val time: js.Date   = js.native

  val cfId: js.UndefOr[String]              = js.native
  val errors: js.UndefOr[js.Array[Error]]   = js.native
  val extendedRequestId: js.UndefOr[String] = js.native
  val hostname: js.UndefOr[String]          = js.native
  val region: js.UndefOr[String]            = js.native
  val requestId: js.UndefOr[String]         = js.native
  val retryable: js.UndefOr[Boolean]        = js.native
  val retryDelay: js.UndefOr[Double]        = js.native
  val statusCode: js.UndefOr[Int]           = js.native
}
