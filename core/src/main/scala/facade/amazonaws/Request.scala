package facade.amazonaws

import scala.scalajs.js

@js.native
trait Request[T <: js.Object] extends js.Object {
  def on(event: String, callback: js.Function2[Error, T, Unit]): Request[T] = js.native

  def send(): Response[T] = js.native

  /**
    * This can bridge to [[scala.concurrent.Future]] by invoking `request.promise().toFuture()`
    *
    * @see http://docs.aws.amazon.com/sdk-for-javascript/v2/developer-guide/using-promises.html
    * @return js.Promise
    */
  def promise(): js.Promise[T] = js.native

  /**
    * Aborts a request, emitting the error and complete events.
    *
    * This feature is not supported in the browser environment of the SDK.
    *
    * @return the same request object, for chaining.
    *         @see https://docs.aws.amazon.com/AWSJavaScriptSDK/latest/AWS/Request.html#abort-property
    */
  def abort(): Request[T] = js.native

  /**
    * Sends the request and converts the request object into a readable stream
    *  that can be read from or piped into a writable stream.
    *
    *  The data read from a readable stream contains only
    *    the raw HTTP body contents.
    *
    *
    * @return the readable stream object that can be piped or read from (by registering 'data' event listeners).
    */
  def createReadStream(): js.Dynamic = js.native

  /**
    *
    * Iterates over each page of results given a pageable request, calling
    * the provided callback with each page of data. After all pages have been
    * retrieved, the callback is called with `null` data.
    *
    * This operation can generate multiple requests to a service.
    *
    * @param callback function(err, data, [doneCallback])
    *                 If the callback returns `false`, pagination will stop.
    *
    *                 Called with each page of resulting data from the request.
    *                 If the optional `doneCallback` is provided in the function,
    *                 it must be called when the next page is ready to be retrieved.
    *                 This is useful forcontrolling serial pagination across asynchronous operations.
    */
  def eachPage(callback: js.Function3[Error, T, js.UndefOr[js.Function0[Unit]], Boolean]): Unit = js.native

  /**
    * Returns whether the operation can return multiple pages of response data.
    */
  def isPageable(): Boolean = js.native

  def startTime: js.Date = js.native

  def httpRequest: HttpRequest = js.native
}
