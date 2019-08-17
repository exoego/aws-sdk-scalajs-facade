package facade.amazonaws

import scala.scalajs.js

@js.native
trait Error extends js.Object {
  val code: String    = js.native
  val message: String = js.native
}
