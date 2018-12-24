package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object sts {
  type Audience = String
  type Issuer = String
  type NameQualifier = String
  type SAMLAssertionType = String
  type Subject = String
  type SubjectType = String
  type accessKeyIdType = String
  type accessKeySecretType = String
  type accountType = String
  type arnType = String
  type assumedRoleIdType = String
  type clientTokenType = String
  type dateType = js.Date
  type decodedMessageType = String
  type durationSecondsType = Int
  type encodedMessageType = String
  type expiredIdentityTokenMessage = String
  type externalIdType = String
  type federatedIdType = String
  type idpCommunicationErrorMessage = String
  type idpRejectedClaimMessage = String
  type invalidAuthorizationMessage = String
  type invalidIdentityTokenMessage = String
  type malformedPolicyDocumentMessage = String
  type nonNegativeIntegerType = Int
  type packedPolicyTooLargeMessage = String
  type regionDisabledMessage = String
  type roleDurationSecondsType = Int
  type roleSessionNameType = String
  type serialNumberType = String
  type sessionPolicyDocumentType = String
  type tokenCodeType = String
  type tokenType = String
  type urlType = String
  type userIdType = String
  type userNameType = String
  type webIdentitySubjectType = String
}

package sts {
  @js.native
  @JSImport("aws-sdk", "STS")
  class STS() extends js.Object {
    def this(config: AWSConfig) = this()

    def assumeRole(params: AssumeRoleRequest): Request[AssumeRoleResponse] = js.native
    def assumeRoleWithSAML(params: AssumeRoleWithSAMLRequest): Request[AssumeRoleWithSAMLResponse] = js.native
    def assumeRoleWithWebIdentity(params: AssumeRoleWithWebIdentityRequest): Request[AssumeRoleWithWebIdentityResponse] = js.native
    def decodeAuthorizationMessage(params: DecodeAuthorizationMessageRequest): Request[DecodeAuthorizationMessageResponse] = js.native
    def getCallerIdentity(params: GetCallerIdentityRequest): Request[GetCallerIdentityResponse] = js.native
    def getFederationToken(params: GetFederationTokenRequest): Request[GetFederationTokenResponse] = js.native
    def getSessionToken(params: GetSessionTokenRequest): Request[GetSessionTokenResponse] = js.native
  }

  @js.native
  trait AssumeRoleRequest extends js.Object {
    var RoleArn: arnType
    var RoleSessionName: roleSessionNameType
    var DurationSeconds: js.UndefOr[roleDurationSecondsType]
    var ExternalId: js.UndefOr[externalIdType]
    var Policy: js.UndefOr[sessionPolicyDocumentType]
    var SerialNumber: js.UndefOr[serialNumberType]
    var TokenCode: js.UndefOr[tokenCodeType]
  }

  object AssumeRoleRequest {
    def apply(
      RoleArn: arnType,
      RoleSessionName: roleSessionNameType,
      DurationSeconds: js.UndefOr[roleDurationSecondsType] = js.undefined,
      ExternalId: js.UndefOr[externalIdType] = js.undefined,
      Policy: js.UndefOr[sessionPolicyDocumentType] = js.undefined,
      SerialNumber: js.UndefOr[serialNumberType] = js.undefined,
      TokenCode: js.UndefOr[tokenCodeType] = js.undefined): AssumeRoleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "RoleSessionName" -> RoleSessionName.asInstanceOf[js.Any],
        "DurationSeconds" -> DurationSeconds.map { x => x.asInstanceOf[js.Any] },
        "ExternalId" -> ExternalId.map { x => x.asInstanceOf[js.Any] },
        "Policy" -> Policy.map { x => x.asInstanceOf[js.Any] },
        "SerialNumber" -> SerialNumber.map { x => x.asInstanceOf[js.Any] },
        "TokenCode" -> TokenCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssumeRoleRequest]
    }
  }

  /**
   * Contains the response to a successful <a>AssumeRole</a> request, including temporary AWS credentials that can be used to make AWS requests.
   */
  @js.native
  trait AssumeRoleResponse extends js.Object {
    var AssumedRoleUser: js.UndefOr[AssumedRoleUser]
    var Credentials: js.UndefOr[Credentials]
    var PackedPolicySize: js.UndefOr[nonNegativeIntegerType]
  }

  object AssumeRoleResponse {
    def apply(
      AssumedRoleUser: js.UndefOr[AssumedRoleUser] = js.undefined,
      Credentials: js.UndefOr[Credentials] = js.undefined,
      PackedPolicySize: js.UndefOr[nonNegativeIntegerType] = js.undefined): AssumeRoleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssumedRoleUser" -> AssumedRoleUser.map { x => x.asInstanceOf[js.Any] },
        "Credentials" -> Credentials.map { x => x.asInstanceOf[js.Any] },
        "PackedPolicySize" -> PackedPolicySize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssumeRoleResponse]
    }
  }

  @js.native
  trait AssumeRoleWithSAMLRequest extends js.Object {
    var PrincipalArn: arnType
    var RoleArn: arnType
    var SAMLAssertion: SAMLAssertionType
    var DurationSeconds: js.UndefOr[roleDurationSecondsType]
    var Policy: js.UndefOr[sessionPolicyDocumentType]
  }

  object AssumeRoleWithSAMLRequest {
    def apply(
      PrincipalArn: arnType,
      RoleArn: arnType,
      SAMLAssertion: SAMLAssertionType,
      DurationSeconds: js.UndefOr[roleDurationSecondsType] = js.undefined,
      Policy: js.UndefOr[sessionPolicyDocumentType] = js.undefined): AssumeRoleWithSAMLRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PrincipalArn" -> PrincipalArn.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "SAMLAssertion" -> SAMLAssertion.asInstanceOf[js.Any],
        "DurationSeconds" -> DurationSeconds.map { x => x.asInstanceOf[js.Any] },
        "Policy" -> Policy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssumeRoleWithSAMLRequest]
    }
  }

  /**
   * Contains the response to a successful <a>AssumeRoleWithSAML</a> request, including temporary AWS credentials that can be used to make AWS requests.
   */
  @js.native
  trait AssumeRoleWithSAMLResponse extends js.Object {
    var AssumedRoleUser: js.UndefOr[AssumedRoleUser]
    var Audience: js.UndefOr[Audience]
    var Credentials: js.UndefOr[Credentials]
    var Issuer: js.UndefOr[Issuer]
    var NameQualifier: js.UndefOr[NameQualifier]
    var PackedPolicySize: js.UndefOr[nonNegativeIntegerType]
    var Subject: js.UndefOr[Subject]
    var SubjectType: js.UndefOr[SubjectType]
  }

  object AssumeRoleWithSAMLResponse {
    def apply(
      AssumedRoleUser: js.UndefOr[AssumedRoleUser] = js.undefined,
      Audience: js.UndefOr[Audience] = js.undefined,
      Credentials: js.UndefOr[Credentials] = js.undefined,
      Issuer: js.UndefOr[Issuer] = js.undefined,
      NameQualifier: js.UndefOr[NameQualifier] = js.undefined,
      PackedPolicySize: js.UndefOr[nonNegativeIntegerType] = js.undefined,
      Subject: js.UndefOr[Subject] = js.undefined,
      SubjectType: js.UndefOr[SubjectType] = js.undefined): AssumeRoleWithSAMLResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssumedRoleUser" -> AssumedRoleUser.map { x => x.asInstanceOf[js.Any] },
        "Audience" -> Audience.map { x => x.asInstanceOf[js.Any] },
        "Credentials" -> Credentials.map { x => x.asInstanceOf[js.Any] },
        "Issuer" -> Issuer.map { x => x.asInstanceOf[js.Any] },
        "NameQualifier" -> NameQualifier.map { x => x.asInstanceOf[js.Any] },
        "PackedPolicySize" -> PackedPolicySize.map { x => x.asInstanceOf[js.Any] },
        "Subject" -> Subject.map { x => x.asInstanceOf[js.Any] },
        "SubjectType" -> SubjectType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssumeRoleWithSAMLResponse]
    }
  }

  @js.native
  trait AssumeRoleWithWebIdentityRequest extends js.Object {
    var RoleArn: arnType
    var RoleSessionName: roleSessionNameType
    var WebIdentityToken: clientTokenType
    var DurationSeconds: js.UndefOr[roleDurationSecondsType]
    var Policy: js.UndefOr[sessionPolicyDocumentType]
    var ProviderId: js.UndefOr[urlType]
  }

  object AssumeRoleWithWebIdentityRequest {
    def apply(
      RoleArn: arnType,
      RoleSessionName: roleSessionNameType,
      WebIdentityToken: clientTokenType,
      DurationSeconds: js.UndefOr[roleDurationSecondsType] = js.undefined,
      Policy: js.UndefOr[sessionPolicyDocumentType] = js.undefined,
      ProviderId: js.UndefOr[urlType] = js.undefined): AssumeRoleWithWebIdentityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RoleArn" -> RoleArn.asInstanceOf[js.Any],
        "RoleSessionName" -> RoleSessionName.asInstanceOf[js.Any],
        "WebIdentityToken" -> WebIdentityToken.asInstanceOf[js.Any],
        "DurationSeconds" -> DurationSeconds.map { x => x.asInstanceOf[js.Any] },
        "Policy" -> Policy.map { x => x.asInstanceOf[js.Any] },
        "ProviderId" -> ProviderId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssumeRoleWithWebIdentityRequest]
    }
  }

  /**
   * Contains the response to a successful <a>AssumeRoleWithWebIdentity</a> request, including temporary AWS credentials that can be used to make AWS requests.
   */
  @js.native
  trait AssumeRoleWithWebIdentityResponse extends js.Object {
    var AssumedRoleUser: js.UndefOr[AssumedRoleUser]
    var Audience: js.UndefOr[Audience]
    var Credentials: js.UndefOr[Credentials]
    var PackedPolicySize: js.UndefOr[nonNegativeIntegerType]
    var Provider: js.UndefOr[Issuer]
    var SubjectFromWebIdentityToken: js.UndefOr[webIdentitySubjectType]
  }

  object AssumeRoleWithWebIdentityResponse {
    def apply(
      AssumedRoleUser: js.UndefOr[AssumedRoleUser] = js.undefined,
      Audience: js.UndefOr[Audience] = js.undefined,
      Credentials: js.UndefOr[Credentials] = js.undefined,
      PackedPolicySize: js.UndefOr[nonNegativeIntegerType] = js.undefined,
      Provider: js.UndefOr[Issuer] = js.undefined,
      SubjectFromWebIdentityToken: js.UndefOr[webIdentitySubjectType] = js.undefined): AssumeRoleWithWebIdentityResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AssumedRoleUser" -> AssumedRoleUser.map { x => x.asInstanceOf[js.Any] },
        "Audience" -> Audience.map { x => x.asInstanceOf[js.Any] },
        "Credentials" -> Credentials.map { x => x.asInstanceOf[js.Any] },
        "PackedPolicySize" -> PackedPolicySize.map { x => x.asInstanceOf[js.Any] },
        "Provider" -> Provider.map { x => x.asInstanceOf[js.Any] },
        "SubjectFromWebIdentityToken" -> SubjectFromWebIdentityToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssumeRoleWithWebIdentityResponse]
    }
  }

  /**
   * The identifiers for the temporary security credentials that the operation returns.
   */
  @js.native
  trait AssumedRoleUser extends js.Object {
    var Arn: arnType
    var AssumedRoleId: assumedRoleIdType
  }

  object AssumedRoleUser {
    def apply(
      Arn: arnType,
      AssumedRoleId: assumedRoleIdType): AssumedRoleUser = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.asInstanceOf[js.Any],
        "AssumedRoleId" -> AssumedRoleId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssumedRoleUser]
    }
  }

  /**
   * AWS credentials for API authentication.
   */
  @js.native
  trait Credentials extends js.Object {
    var AccessKeyId: accessKeyIdType
    var Expiration: dateType
    var SecretAccessKey: accessKeySecretType
    var SessionToken: tokenType
  }

  object Credentials {
    def apply(
      AccessKeyId: accessKeyIdType,
      Expiration: dateType,
      SecretAccessKey: accessKeySecretType,
      SessionToken: tokenType): Credentials = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessKeyId" -> AccessKeyId.asInstanceOf[js.Any],
        "Expiration" -> Expiration.asInstanceOf[js.Any],
        "SecretAccessKey" -> SecretAccessKey.asInstanceOf[js.Any],
        "SessionToken" -> SessionToken.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Credentials]
    }
  }

  @js.native
  trait DecodeAuthorizationMessageRequest extends js.Object {
    var EncodedMessage: encodedMessageType
  }

  object DecodeAuthorizationMessageRequest {
    def apply(
      EncodedMessage: encodedMessageType): DecodeAuthorizationMessageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EncodedMessage" -> EncodedMessage.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DecodeAuthorizationMessageRequest]
    }
  }

  /**
   * A document that contains additional information about the authorization status of a request from an encoded message that is returned in response to an AWS request.
   */
  @js.native
  trait DecodeAuthorizationMessageResponse extends js.Object {
    var DecodedMessage: js.UndefOr[decodedMessageType]
  }

  object DecodeAuthorizationMessageResponse {
    def apply(
      DecodedMessage: js.UndefOr[decodedMessageType] = js.undefined): DecodeAuthorizationMessageResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DecodedMessage" -> DecodedMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DecodeAuthorizationMessageResponse]
    }
  }

  /**
   * The web identity token that was passed is expired or is not valid. Get a new identity token from the identity provider and then retry the request.
   */
  @js.native
  trait ExpiredTokenExceptionException extends js.Object {
    val message: expiredIdentityTokenMessage
  }

  /**
   * Identifiers for the federated user that is associated with the credentials.
   */
  @js.native
  trait FederatedUser extends js.Object {
    var Arn: arnType
    var FederatedUserId: federatedIdType
  }

  object FederatedUser {
    def apply(
      Arn: arnType,
      FederatedUserId: federatedIdType): FederatedUser = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.asInstanceOf[js.Any],
        "FederatedUserId" -> FederatedUserId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FederatedUser]
    }
  }

  @js.native
  trait GetCallerIdentityRequest extends js.Object {

  }

  object GetCallerIdentityRequest {
    def apply(): GetCallerIdentityRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCallerIdentityRequest]
    }
  }

  /**
   * Contains the response to a successful <a>GetCallerIdentity</a> request, including information about the entity making the request.
   */
  @js.native
  trait GetCallerIdentityResponse extends js.Object {
    var Account: js.UndefOr[accountType]
    var Arn: js.UndefOr[arnType]
    var UserId: js.UndefOr[userIdType]
  }

  object GetCallerIdentityResponse {
    def apply(
      Account: js.UndefOr[accountType] = js.undefined,
      Arn: js.UndefOr[arnType] = js.undefined,
      UserId: js.UndefOr[userIdType] = js.undefined): GetCallerIdentityResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Account" -> Account.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "UserId" -> UserId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCallerIdentityResponse]
    }
  }

  @js.native
  trait GetFederationTokenRequest extends js.Object {
    var Name: userNameType
    var DurationSeconds: js.UndefOr[durationSecondsType]
    var Policy: js.UndefOr[sessionPolicyDocumentType]
  }

  object GetFederationTokenRequest {
    def apply(
      Name: userNameType,
      DurationSeconds: js.UndefOr[durationSecondsType] = js.undefined,
      Policy: js.UndefOr[sessionPolicyDocumentType] = js.undefined): GetFederationTokenRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "DurationSeconds" -> DurationSeconds.map { x => x.asInstanceOf[js.Any] },
        "Policy" -> Policy.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFederationTokenRequest]
    }
  }

  /**
   * Contains the response to a successful <a>GetFederationToken</a> request, including temporary AWS credentials that can be used to make AWS requests.
   */
  @js.native
  trait GetFederationTokenResponse extends js.Object {
    var Credentials: js.UndefOr[Credentials]
    var FederatedUser: js.UndefOr[FederatedUser]
    var PackedPolicySize: js.UndefOr[nonNegativeIntegerType]
  }

  object GetFederationTokenResponse {
    def apply(
      Credentials: js.UndefOr[Credentials] = js.undefined,
      FederatedUser: js.UndefOr[FederatedUser] = js.undefined,
      PackedPolicySize: js.UndefOr[nonNegativeIntegerType] = js.undefined): GetFederationTokenResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Credentials" -> Credentials.map { x => x.asInstanceOf[js.Any] },
        "FederatedUser" -> FederatedUser.map { x => x.asInstanceOf[js.Any] },
        "PackedPolicySize" -> PackedPolicySize.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFederationTokenResponse]
    }
  }

  @js.native
  trait GetSessionTokenRequest extends js.Object {
    var DurationSeconds: js.UndefOr[durationSecondsType]
    var SerialNumber: js.UndefOr[serialNumberType]
    var TokenCode: js.UndefOr[tokenCodeType]
  }

  object GetSessionTokenRequest {
    def apply(
      DurationSeconds: js.UndefOr[durationSecondsType] = js.undefined,
      SerialNumber: js.UndefOr[serialNumberType] = js.undefined,
      TokenCode: js.UndefOr[tokenCodeType] = js.undefined): GetSessionTokenRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DurationSeconds" -> DurationSeconds.map { x => x.asInstanceOf[js.Any] },
        "SerialNumber" -> SerialNumber.map { x => x.asInstanceOf[js.Any] },
        "TokenCode" -> TokenCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSessionTokenRequest]
    }
  }

  /**
   * Contains the response to a successful <a>GetSessionToken</a> request, including temporary AWS credentials that can be used to make AWS requests.
   */
  @js.native
  trait GetSessionTokenResponse extends js.Object {
    var Credentials: js.UndefOr[Credentials]
  }

  object GetSessionTokenResponse {
    def apply(
      Credentials: js.UndefOr[Credentials] = js.undefined): GetSessionTokenResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Credentials" -> Credentials.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSessionTokenResponse]
    }
  }

  /**
   * The request could not be fulfilled because the non-AWS identity provider (IDP) that was asked to verify the incoming identity token could not be reached. This is often a transient error caused by network conditions. Retry the request a limited number of times so that you don't exceed the request rate. If the error persists, the non-AWS identity provider might be down or not responding.
   */
  @js.native
  trait IDPCommunicationErrorExceptionException extends js.Object {
    val message: idpCommunicationErrorMessage
  }

  /**
   * The identity provider (IdP) reported that authentication failed. This might be because the claim is invalid.
   *  If this error is returned for the <code>AssumeRoleWithWebIdentity</code> operation, it can also mean that the claim has expired or has been explicitly revoked.
   */
  @js.native
  trait IDPRejectedClaimExceptionException extends js.Object {
    val message: idpRejectedClaimMessage
  }

  /**
   * The error returned if the message passed to <code>DecodeAuthorizationMessage</code> was invalid. This can happen if the token contains invalid characters, such as linebreaks.
   */
  @js.native
  trait InvalidAuthorizationMessageExceptionException extends js.Object {
    val message: invalidAuthorizationMessage
  }

  /**
   * The web identity token that was passed could not be validated by AWS. Get a new identity token from the identity provider and then retry the request.
   */
  @js.native
  trait InvalidIdentityTokenExceptionException extends js.Object {
    val message: invalidIdentityTokenMessage
  }

  /**
   * The request was rejected because the policy document was malformed. The error message describes the specific error.
   */
  @js.native
  trait MalformedPolicyDocumentExceptionException extends js.Object {
    val message: malformedPolicyDocumentMessage
  }

  /**
   * The request was rejected because the policy document was too large. The error message describes how big the policy document is, in packed form, as a percentage of what the API allows.
   */
  @js.native
  trait PackedPolicyTooLargeExceptionException extends js.Object {
    val message: packedPolicyTooLargeMessage
  }

  /**
   * STS is not activated in the requested region for the account that is being asked to generate credentials. The account administrator must use the IAM console to activate STS in that region. For more information, see [[http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html|Activating and Deactivating AWS STS in an AWS Region]] in the <i>IAM User Guide</i>.
   */
  @js.native
  trait RegionDisabledExceptionException extends js.Object {
    val message: regionDisabledMessage
  }
}
