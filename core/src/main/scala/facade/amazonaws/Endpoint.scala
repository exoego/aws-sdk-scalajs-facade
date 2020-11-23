package facade.amazonaws

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("aws-sdk/lib/node_loader", "Endpoint", "AWS.Endpoint")
class Endpoint(url: String) extends js.Object {

  /** The host portion of the endpoint including the port, e.g., example.com:80.
    */
  val host: String = js.native

  /** The host portion of the endpoint, e.g., example.com.
    */
  val hostname: String = js.native

  /** The full URL of the endpoint.
    */
  val ref: String = js.native

  /** The port of the endpoint.
    */
  val port: String = js.native

  /** The protocol (http or https) of the endpoint URL.
    */
  val protocol: String = js.native
}
