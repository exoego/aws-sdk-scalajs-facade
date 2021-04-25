package facade.amazonaws

import scala.scalajs.js
import scala.scalajs.js.|

package object credentials {
  type Provider = js.Function0[AWSCredentials]

  trait HasLoginId extends js.Object {
    var LoginId: js.UndefOr[String]
  }
  type CognitoIdentityCredentialsInputs = cognito.GetIdInput | cognito.GetCredentialsForIdentityInput | cognito.GetOpenIdTokenInput | sts.AssumeRoleWithWebIdentityRequest
  type CognitoIdentityOptions = CognitoIdentityCredentialsInputs with HasLoginId
}
