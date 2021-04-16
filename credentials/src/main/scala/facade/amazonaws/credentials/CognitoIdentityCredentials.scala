package facade.amazonaws.credentials

import facade.amazonaws.{AWSConfig, AWSCredentials}
import facade.amazonaws.services.sts
import facade.amazonaws.services.cognitoidentity

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

@js.native
@JSImport("aws-sdk/lib/node_loader", "CognitoIdentityCredentials", "AWS.CognitoIdentityCredentials")
class CognitoIdentityCredentials() extends AWSCredentials {
  def this(options: CognitoIdentityOptions) = this()
  def this(options: CognitoIdentityOptions, clientConfig: AWSConfig) = this()

  def clearCacheId(): Unit = js.native

  def data: cognitoidentity.GetCredentialsForIdentityResponse | sts.AssumeRoleWithWebIdentityResponse = js.native

  def identityId: String = js.native

  def params: cognitoidentity.GetIdInput | cognitoidentity.GetOpenIdTokenInput | sts.AssumeRoleWithWebIdentityRequest = js.native
}
