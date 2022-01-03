package facade.amazonaws.credentials

import facade.amazonaws.{AWSConfig, AWSCredentials}
import facade.amazonaws.services.sts
import facade.amazonaws.services.cognitoidentity

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

// TODO: support { LoginId: js.UndefOr[String] } in options
@js.native
@JSImport("aws-sdk/lib/node_loader", "CognitoIdentityCredentials", "AWS.CognitoIdentityCredentials")
class CognitoIdentityCredentials() extends AWSCredentials {
  def this(options: cognitoidentity.GetIdInput) = this()
  def this(options: cognitoidentity.GetIdInput, clientConfig: AWSConfig) = this()

  def this(options: cognitoidentity.GetCredentialsForIdentityInput) = this()
  def this(options: cognitoidentity.GetCredentialsForIdentityInput, clientConfig: AWSConfig) = this()

  def this(options: cognitoidentity.GetOpenIdTokenInput) = this()
  def this(options: cognitoidentity.GetOpenIdTokenInput, clientConfig: AWSConfig) = this()

  def this(options: sts.AssumeRoleWithWebIdentityRequest) = this()
  def this(options: sts.AssumeRoleWithWebIdentityRequest, clientConfig: AWSConfig) = this()

  def clearCacheId(): Unit = js.native

  def data: cognitoidentity.GetCredentialsForIdentityResponse | sts.AssumeRoleWithWebIdentityResponse = js.native

  def identityId: String = js.native

  def params: cognitoidentity.GetIdInput | cognitoidentity.GetOpenIdTokenInput | sts.AssumeRoleWithWebIdentityRequest = js.native
}
