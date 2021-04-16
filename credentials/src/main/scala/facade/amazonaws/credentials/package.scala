package facade.amazonaws

import facade.amazonaws.services.{cognitoidentity, sts}

import scala.scalajs.js
import scala.scalajs.js.|

package object credentials {
  type Provider = js.Function0[AWSCredentials]

  trait HasLoginId extends js.Object {
    var LoginId: js.UndefOr[String]
  }
  type CognitoIdentityCredentialsInputs = cognitoidentity.GetIdInput | cognitoidentity.GetCredentialsForIdentityInput | cognitoidentity.GetOpenIdTokenInput | sts.AssumeRoleWithWebIdentityRequest
  type CognitoIdentityOptions = CognitoIdentityCredentialsInputs with HasLoginId
}
