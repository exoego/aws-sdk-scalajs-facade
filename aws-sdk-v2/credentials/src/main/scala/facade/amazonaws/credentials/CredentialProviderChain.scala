package facade.amazonaws.credentials

import facade.amazonaws.AWSCredentials
import facade.amazonaws.{Error => AWSError}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@js.native
@JSImport("aws-sdk/lib/node_loader", "CredentialProviderChain", "AWS.CredentialProviderChain")
class CredentialProviderChain() extends AWSCredentials {
  def this(providers: js.Array[Provider]) = this()

  def resolve(callback: js.Function2[AWSError | Null, js.UndefOr[AWSCredentials], Unit]): CredentialProviderChain = js.native

  def resolvePromise(): js.Promise[AWSCredentials] = js.native

  def providers: js.Array[AWSCredentials | Provider] = js.native
}

@js.native
@JSImport("aws-sdk/lib/node_loader", "CredentialProviderChain", "AWS.CredentialProviderChain")
object CredentialProviderChain extends AWSCredentials {
  var defaultProviders: js.Array[Provider] = js.native
}
