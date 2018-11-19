package facade.amazonaws

import scala.scalajs.js

@js.native
trait Request[T <: js.Object] extends js.Object {
  def on(event: String, callback: Callback[T]): Request[T] = js.native

  def send(): Response[T] = js.native

  /**
   * This can bridge to [[scala.concurrent.Future]] by invoking `request.promise().toFuture()`
   *
   * @see http://docs.aws.amazon.com/sdk-for-javascript/v2/developer-guide/using-promises.html
   * @return js.Promise
   */
  def promise(): js.Promise[T] = js.native
}
