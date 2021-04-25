package facade.amazonaws.credentials

import scala.scalajs.js

package object sts {
  type arnType = String
  type clientTokenType = String
  type policyDescriptorListType = js.Array[PolicyDescriptorType]
  type roleDurationSecondsType = Int
  type roleSessionNameType = String
  type sessionPolicyDocumentType = String
  type urlType = String

  /** A reference to the IAM managed policy that is passed as a session policy for a role session or a federated user session.
    */
  @js.native
  trait PolicyDescriptorType extends js.Object {
    var arn: js.UndefOr[arnType]
  }

  object PolicyDescriptorType {
    @inline
    def apply(
        arn: js.UndefOr[arnType] = js.undefined
    ): PolicyDescriptorType = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PolicyDescriptorType]
    }
  }

  @js.native
  trait AssumeRoleWithWebIdentityRequest extends js.Object {
    var RoleArn: arnType
    var RoleSessionName: roleSessionNameType
    var WebIdentityToken: clientTokenType
    var DurationSeconds: js.UndefOr[roleDurationSecondsType]
    var Policy: js.UndefOr[sessionPolicyDocumentType]
    var PolicyArns: js.UndefOr[policyDescriptorListType]
    var ProviderId: js.UndefOr[urlType]
  }

  object AssumeRoleWithWebIdentityRequest {
    @inline
    def apply(
        RoleArn: arnType,
        RoleSessionName: roleSessionNameType,
        WebIdentityToken: clientTokenType,
        DurationSeconds: js.UndefOr[roleDurationSecondsType] = js.undefined,
        Policy: js.UndefOr[sessionPolicyDocumentType] = js.undefined,
        PolicyArns: js.UndefOr[policyDescriptorListType] = js.undefined,
        ProviderId: js.UndefOr[urlType] = js.undefined
    ): AssumeRoleWithWebIdentityRequest = {
      val __obj = js.Dynamic.literal(
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "RoleSessionName" -> RoleSessionName.asInstanceOf[js.Any],
        "WebIdentityToken" -> WebIdentityToken.asInstanceOf[js.Any]
      )

      DurationSeconds.foreach(__v => __obj.updateDynamic("DurationSeconds")(__v.asInstanceOf[js.Any]))
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      PolicyArns.foreach(__v => __obj.updateDynamic("PolicyArns")(__v.asInstanceOf[js.Any]))
      ProviderId.foreach(__v => __obj.updateDynamic("ProviderId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssumeRoleWithWebIdentityRequest]
    }
  }

}
