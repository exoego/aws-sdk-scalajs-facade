package facade.amazonaws

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("aws-sdk", "Credentials")
class AWSCredentials extends js.Object {
  def this(accessKeyId: String, secretAccessKey: String, sessionToken: js.UndefOr[String] = js.undefined) = this()

  def getPromise(): js.Promise[Unit] = js.native

  def needsRefresh(): Boolean = js.native

  def refreshPromise(): js.Promise[Unit] = js.native

  val accessKeyId: String     = js.native
  val secretAccessKey: String = js.native
  val sessionToken: String    = js.native
  val expired: Boolean        = js.native
  val expireTime: js.Date     = js.native
}

@js.native
@JSImport("aws-sdk", "Credentials")
object AWSCredentials extends js.Object {
  var expiryWindow: Double = js.native
}
