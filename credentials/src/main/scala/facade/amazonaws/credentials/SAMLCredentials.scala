package facade.amazonaws.credentials

import facade.amazonaws.AWSCredentials

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("aws-sdk/lib/node_loader", "SAMLCredentials", "AWS.SAMLCredentials")
class SAMLCredentials(options: SAMLCredentialsParams) extends AWSCredentials {
  def params: SAMLCredentialsParams = js.native
}

trait SAMLCredentialsParams extends js.Object {
  var RoleArn: String
  var PrincipalArn: String
  var SAMLAssertion: String
  var Policy: js.UndefOr[String]
  var DurationSeconds: js.UndefOr[Double]
}

object SAMLCredentialsParams {
  def apply(
      RoleArn: String,
      PrincipalArn: String,
      SAMLAssertion: String,
      Policy: js.UndefOr[String] = js.undefined,
      DurationSeconds: js.UndefOr[Double] = js.undefined
  ): SAMLCredentialsParams = {
    val _obj$ = js.Dynamic.literal(
      "RoleArn" -> RoleArn.asInstanceOf[js.Any],
      "PrincipalArn" -> PrincipalArn.asInstanceOf[js.Any],
      "SAMLAssertion" -> SAMLAssertion.asInstanceOf[js.Any]
    )
    Policy.foreach(_v => _obj$.updateDynamic("Policy")(_v.asInstanceOf[js.Any]))
    DurationSeconds.foreach(_v => _obj$.updateDynamic("DurationSeconds")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[SAMLCredentialsParams]
  }
}
