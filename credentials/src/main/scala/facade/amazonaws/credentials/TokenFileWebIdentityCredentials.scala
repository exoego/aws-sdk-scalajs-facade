package facade.amazonaws.credentials

import facade.amazonaws.{AWSConfig, AWSCredentials}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("aws-sdk/lib/node_loader", "TokenFileWebIdentityCredentials", "AWS.TokenFileWebIdentityCredentials")
class TokenFileWebIdentityCredentials() extends AWSCredentials {
  def this(clientConfig: AWSConfig) = this()

}
