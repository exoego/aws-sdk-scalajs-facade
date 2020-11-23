package facade.amazonaws

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("aws-sdk/lib/node_loader", "Credentials", "AWS.Credentials")
class AWSCredentials extends js.Object {
  def this(accessKeyId: String, secretAccessKey: String, sessionToken: js.UndefOr[String] = js.undefined) = this()

  def getPromise(): js.Promise[Unit] = js.native

  def needsRefresh(): Boolean = js.native

  def refreshPromise(): js.Promise[Unit] = js.native

  val accessKeyId: String = js.native
  val secretAccessKey: String = js.native
  val sessionToken: String = js.native
  val expired: Boolean = js.native
  val expireTime: js.Date = js.native

  var expiryWindow: Int = js.native
}
