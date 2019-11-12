package facade.amazonaws

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("aws-sdk", "HttpRequest")
class HttpRequest(
    val endpoint: Endpoint,
    region: String
) extends js.Object {
  /**
    * The part of the path excluding the query string.
    */
  val pathname: String = js.native

  /**
    * The query string portion of the path.
    */
  val search: String = js.native

  /**
    * The request body payload.
    */
  val body: String = js.native

  /**
    * A map of header keys and their respective values.
    */
  val headers: js.Dictionary[String] = js.native

  /**
    * The HTTP method of the request.
    */
  val method: String = js.native

  /**
    * The path portion of the URI, e.g., "/list/?start=5&num=10".
    */
  val path: String = js.native
}
