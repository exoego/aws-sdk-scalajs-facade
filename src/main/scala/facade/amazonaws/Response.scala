package facade.amazonaws

import scala.scalajs.js

@js.native
trait Response[T <: js.Object] extends js.Object {
  val error: Error        = js.native
  val data: T             = js.native
  val request: Request[T] = js.native

  def hasNextPage(): Boolean = js.native

  def nextPage(): Request[T] = js.native
}
