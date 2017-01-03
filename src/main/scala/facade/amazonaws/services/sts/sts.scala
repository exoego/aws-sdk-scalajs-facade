package facade.amazonaws.services

import scalajs._
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
  type durationSecondsType = Integer
  type encodedMessageType = String
  type expiredIdentityTokenMessage = String
  type externalIdType = String
  type federatedIdType = String
  type idpCommunicationErrorMessage = String
  type idpRejectedClaimMessage = String
  type invalidAuthorizationMessage = String
  type invalidIdentityTokenMessage = String
  type malformedPolicyDocumentMessage = String
  type nonNegativeIntegerType = Integer
  type packedPolicyTooLargeMessage = String
  type regionDisabledMessage = String
  type roleDurationSecondsType = Integer
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
  trait Sts extends js.Object {
    def assumeRole(params: AssumeRoleRequest, callback: Callback[AssumeRoleResponse]): Unit = js.native
    def assumeRole(params: AssumeRoleRequest): Request[AssumeRoleResponse] = js.native
    def assumeRoleWithSAML(params: AssumeRoleWithSAMLRequest, callback: Callback[AssumeRoleWithSAMLResponse]): Unit = js.native
    def assumeRoleWithSAML(params: AssumeRoleWithSAMLRequest): Request[AssumeRoleWithSAMLResponse] = js.native
    def assumeRoleWithWebIdentity(params: AssumeRoleWithWebIdentityRequest, callback: Callback[AssumeRoleWithWebIdentityResponse]): Unit = js.native
    def assumeRoleWithWebIdentity(params: AssumeRoleWithWebIdentityRequest): Request[AssumeRoleWithWebIdentityResponse] = js.native
    def decodeAuthorizationMessage(params: DecodeAuthorizationMessageRequest, callback: Callback[DecodeAuthorizationMessageResponse]): Unit = js.native
    def decodeAuthorizationMessage(params: DecodeAuthorizationMessageRequest): Request[DecodeAuthorizationMessageResponse] = js.native
    def getCallerIdentity(params: GetCallerIdentityRequest, callback: Callback[GetCallerIdentityResponse]): Unit = js.native
    def getCallerIdentity(params: GetCallerIdentityRequest): Request[GetCallerIdentityResponse] = js.native
    def getFederationToken(params: GetFederationTokenRequest, callback: Callback[GetFederationTokenResponse]): Unit = js.native
    def getFederationToken(params: GetFederationTokenRequest): Request[GetFederationTokenResponse] = js.native
    def getSessionToken(params: GetSessionTokenRequest, callback: Callback[GetSessionTokenResponse]): Unit = js.native
    def getSessionToken(params: GetSessionTokenRequest): Request[GetSessionTokenResponse] = js.native
  }

  @js.native
  trait AssumeRoleRequest extends js.Object {
    var ExternalId: externalIdType
    var DurationSeconds: roleDurationSecondsType
    var Policy: sessionPolicyDocumentType
    var TokenCode: tokenCodeType
    var RoleSessionName: roleSessionNameType
    var RoleArn: arnType
    var SerialNumber: serialNumberType
  }

  object AssumeRoleRequest {
    def apply(
      ExternalId: js.UndefOr[externalIdType] = js.undefined,
      DurationSeconds: js.UndefOr[roleDurationSecondsType] = js.undefined,
      Policy: js.UndefOr[sessionPolicyDocumentType] = js.undefined,
      TokenCode: js.UndefOr[tokenCodeType] = js.undefined,
      RoleSessionName: js.UndefOr[roleSessionNameType] = js.undefined,
      RoleArn: js.UndefOr[arnType] = js.undefined,
      SerialNumber: js.UndefOr[serialNumberType] = js.undefined
    ): AssumeRoleRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ExternalId" -> ExternalId.map { x => x: js.Any }),
        ("DurationSeconds" -> DurationSeconds.map { x => x: js.Any }),
        ("Policy" -> Policy.map { x => x: js.Any }),
        ("TokenCode" -> TokenCode.map { x => x: js.Any }),
        ("RoleSessionName" -> RoleSessionName.map { x => x: js.Any }),
        ("RoleArn" -> RoleArn.map { x => x: js.Any }),
        ("SerialNumber" -> SerialNumber.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssumeRoleRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>AssumeRole</a> request, including temporary AWS credentials that can be used to make AWS requests. </p>
   */
  @js.native
  trait AssumeRoleResponse extends js.Object {
    var Credentials: Credentials
    var AssumedRoleUser: AssumedRoleUser
    var PackedPolicySize: nonNegativeIntegerType
  }

  object AssumeRoleResponse {
    def apply(
      Credentials: js.UndefOr[Credentials] = js.undefined,
      AssumedRoleUser: js.UndefOr[AssumedRoleUser] = js.undefined,
      PackedPolicySize: js.UndefOr[nonNegativeIntegerType] = js.undefined
    ): AssumeRoleResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Credentials" -> Credentials.map { x => x: js.Any }),
        ("AssumedRoleUser" -> AssumedRoleUser.map { x => x: js.Any }),
        ("PackedPolicySize" -> PackedPolicySize.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssumeRoleResponse]
    }
  }

  @js.native
  trait AssumeRoleWithSAMLRequest extends js.Object {
    var SAMLAssertion: SAMLAssertionType
    var DurationSeconds: roleDurationSecondsType
    var Policy: sessionPolicyDocumentType
    var PrincipalArn: arnType
    var RoleArn: arnType
  }

  object AssumeRoleWithSAMLRequest {
    def apply(
      SAMLAssertion: js.UndefOr[SAMLAssertionType] = js.undefined,
      DurationSeconds: js.UndefOr[roleDurationSecondsType] = js.undefined,
      Policy: js.UndefOr[sessionPolicyDocumentType] = js.undefined,
      PrincipalArn: js.UndefOr[arnType] = js.undefined,
      RoleArn: js.UndefOr[arnType] = js.undefined
    ): AssumeRoleWithSAMLRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SAMLAssertion" -> SAMLAssertion.map { x => x: js.Any }),
        ("DurationSeconds" -> DurationSeconds.map { x => x: js.Any }),
        ("Policy" -> Policy.map { x => x: js.Any }),
        ("PrincipalArn" -> PrincipalArn.map { x => x: js.Any }),
        ("RoleArn" -> RoleArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssumeRoleWithSAMLRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>AssumeRoleWithSAML</a> request, including temporary AWS credentials that can be used to make AWS requests. </p>
   */
  @js.native
  trait AssumeRoleWithSAMLResponse extends js.Object {
    var Subject: Subject
    var SubjectType: SubjectType
    var NameQualifier: NameQualifier
    var Audience: Audience
    var PackedPolicySize: nonNegativeIntegerType
    var AssumedRoleUser: AssumedRoleUser
    var Issuer: Issuer
    var Credentials: Credentials
  }

  object AssumeRoleWithSAMLResponse {
    def apply(
      Subject: js.UndefOr[Subject] = js.undefined,
      SubjectType: js.UndefOr[SubjectType] = js.undefined,
      NameQualifier: js.UndefOr[NameQualifier] = js.undefined,
      Audience: js.UndefOr[Audience] = js.undefined,
      PackedPolicySize: js.UndefOr[nonNegativeIntegerType] = js.undefined,
      AssumedRoleUser: js.UndefOr[AssumedRoleUser] = js.undefined,
      Issuer: js.UndefOr[Issuer] = js.undefined,
      Credentials: js.UndefOr[Credentials] = js.undefined
    ): AssumeRoleWithSAMLResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Subject" -> Subject.map { x => x: js.Any }),
        ("SubjectType" -> SubjectType.map { x => x: js.Any }),
        ("NameQualifier" -> NameQualifier.map { x => x: js.Any }),
        ("Audience" -> Audience.map { x => x: js.Any }),
        ("PackedPolicySize" -> PackedPolicySize.map { x => x: js.Any }),
        ("AssumedRoleUser" -> AssumedRoleUser.map { x => x: js.Any }),
        ("Issuer" -> Issuer.map { x => x: js.Any }),
        ("Credentials" -> Credentials.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssumeRoleWithSAMLResponse]
    }
  }

  @js.native
  trait AssumeRoleWithWebIdentityRequest extends js.Object {
    var DurationSeconds: roleDurationSecondsType
    var Policy: sessionPolicyDocumentType
    var WebIdentityToken: clientTokenType
    var ProviderId: urlType
    var RoleSessionName: roleSessionNameType
    var RoleArn: arnType
  }

  object AssumeRoleWithWebIdentityRequest {
    def apply(
      DurationSeconds: js.UndefOr[roleDurationSecondsType] = js.undefined,
      Policy: js.UndefOr[sessionPolicyDocumentType] = js.undefined,
      WebIdentityToken: js.UndefOr[clientTokenType] = js.undefined,
      ProviderId: js.UndefOr[urlType] = js.undefined,
      RoleSessionName: js.UndefOr[roleSessionNameType] = js.undefined,
      RoleArn: js.UndefOr[arnType] = js.undefined
    ): AssumeRoleWithWebIdentityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DurationSeconds" -> DurationSeconds.map { x => x: js.Any }),
        ("Policy" -> Policy.map { x => x: js.Any }),
        ("WebIdentityToken" -> WebIdentityToken.map { x => x: js.Any }),
        ("ProviderId" -> ProviderId.map { x => x: js.Any }),
        ("RoleSessionName" -> RoleSessionName.map { x => x: js.Any }),
        ("RoleArn" -> RoleArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssumeRoleWithWebIdentityRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>AssumeRoleWithWebIdentity</a> request, including temporary AWS credentials that can be used to make AWS requests. </p>
   */
  @js.native
  trait AssumeRoleWithWebIdentityResponse extends js.Object {
    var Provider: Issuer
    var Audience: Audience
    var PackedPolicySize: nonNegativeIntegerType
    var AssumedRoleUser: AssumedRoleUser
    var SubjectFromWebIdentityToken: webIdentitySubjectType
    var Credentials: Credentials
  }

  object AssumeRoleWithWebIdentityResponse {
    def apply(
      Provider: js.UndefOr[Issuer] = js.undefined,
      Audience: js.UndefOr[Audience] = js.undefined,
      PackedPolicySize: js.UndefOr[nonNegativeIntegerType] = js.undefined,
      AssumedRoleUser: js.UndefOr[AssumedRoleUser] = js.undefined,
      SubjectFromWebIdentityToken: js.UndefOr[webIdentitySubjectType] = js.undefined,
      Credentials: js.UndefOr[Credentials] = js.undefined
    ): AssumeRoleWithWebIdentityResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Provider" -> Provider.map { x => x: js.Any }),
        ("Audience" -> Audience.map { x => x: js.Any }),
        ("PackedPolicySize" -> PackedPolicySize.map { x => x: js.Any }),
        ("AssumedRoleUser" -> AssumedRoleUser.map { x => x: js.Any }),
        ("SubjectFromWebIdentityToken" -> SubjectFromWebIdentityToken.map { x => x: js.Any }),
        ("Credentials" -> Credentials.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssumeRoleWithWebIdentityResponse]
    }
  }

  /**
   * <p>The identifiers for the temporary security credentials that the operation returns.</p>
   */
  @js.native
  trait AssumedRoleUser extends js.Object {
    var AssumedRoleId: assumedRoleIdType
    var Arn: arnType
  }

  object AssumedRoleUser {
    def apply(
      AssumedRoleId: js.UndefOr[assumedRoleIdType] = js.undefined,
      Arn: js.UndefOr[arnType] = js.undefined
    ): AssumedRoleUser = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AssumedRoleId" -> AssumedRoleId.map { x => x: js.Any }),
        ("Arn" -> Arn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssumedRoleUser]
    }
  }

  /**
   * <p>AWS credentials for API authentication.</p>
   */
  @js.native
  trait Credentials extends js.Object {
    var AccessKeyId: accessKeyIdType
    var SecretAccessKey: accessKeySecretType
    var SessionToken: tokenType
    var Expiration: dateType
  }

  object Credentials {
    def apply(
      AccessKeyId: js.UndefOr[accessKeyIdType] = js.undefined,
      SecretAccessKey: js.UndefOr[accessKeySecretType] = js.undefined,
      SessionToken: js.UndefOr[tokenType] = js.undefined,
      Expiration: js.UndefOr[dateType] = js.undefined
    ): Credentials = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AccessKeyId" -> AccessKeyId.map { x => x: js.Any }),
        ("SecretAccessKey" -> SecretAccessKey.map { x => x: js.Any }),
        ("SessionToken" -> SessionToken.map { x => x: js.Any }),
        ("Expiration" -> Expiration.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Credentials]
    }
  }

  @js.native
  trait DecodeAuthorizationMessageRequest extends js.Object {
    var EncodedMessage: encodedMessageType
  }

  object DecodeAuthorizationMessageRequest {
    def apply(
      EncodedMessage: js.UndefOr[encodedMessageType] = js.undefined
    ): DecodeAuthorizationMessageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EncodedMessage" -> EncodedMessage.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DecodeAuthorizationMessageRequest]
    }
  }

  /**
   * <p>A document that contains additional information about the authorization status of a request from an encoded message that is returned in response to an AWS request.</p>
   */
  @js.native
  trait DecodeAuthorizationMessageResponse extends js.Object {
    var DecodedMessage: decodedMessageType
  }

  object DecodeAuthorizationMessageResponse {
    def apply(
      DecodedMessage: js.UndefOr[decodedMessageType] = js.undefined
    ): DecodeAuthorizationMessageResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DecodedMessage" -> DecodedMessage.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DecodeAuthorizationMessageResponse]
    }
  }

  /**
   * <p>The web identity token that was passed is expired or is not valid. Get a new identity token from the identity provider and then retry the request.</p>
   */
  @js.native
  trait ExpiredTokenExceptionException extends js.Object {
    var message: expiredIdentityTokenMessage
  }

  /**
   * <p>Identifiers for the federated user that is associated with the credentials.</p>
   */
  @js.native
  trait FederatedUser extends js.Object {
    var FederatedUserId: federatedIdType
    var Arn: arnType
  }

  object FederatedUser {
    def apply(
      FederatedUserId: js.UndefOr[federatedIdType] = js.undefined,
      Arn: js.UndefOr[arnType] = js.undefined
    ): FederatedUser = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("FederatedUserId" -> FederatedUserId.map { x => x: js.Any }),
        ("Arn" -> Arn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FederatedUser]
    }
  }

  @js.native
  trait GetCallerIdentityRequest extends js.Object {

  }

  object GetCallerIdentityRequest {
    def apply(

    ): GetCallerIdentityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCallerIdentityRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetCallerIdentity</a> request, including information about the entity making the request.</p>
   */
  @js.native
  trait GetCallerIdentityResponse extends js.Object {
    var UserId: userIdType
    var Account: accountType
    var Arn: arnType
  }

  object GetCallerIdentityResponse {
    def apply(
      UserId: js.UndefOr[userIdType] = js.undefined,
      Account: js.UndefOr[accountType] = js.undefined,
      Arn: js.UndefOr[arnType] = js.undefined
    ): GetCallerIdentityResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserId" -> UserId.map { x => x: js.Any }),
        ("Account" -> Account.map { x => x: js.Any }),
        ("Arn" -> Arn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCallerIdentityResponse]
    }
  }

  @js.native
  trait GetFederationTokenRequest extends js.Object {
    var Name: userNameType
    var Policy: sessionPolicyDocumentType
    var DurationSeconds: durationSecondsType
  }

  object GetFederationTokenRequest {
    def apply(
      Name: js.UndefOr[userNameType] = js.undefined,
      Policy: js.UndefOr[sessionPolicyDocumentType] = js.undefined,
      DurationSeconds: js.UndefOr[durationSecondsType] = js.undefined
    ): GetFederationTokenRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("Policy" -> Policy.map { x => x: js.Any }),
        ("DurationSeconds" -> DurationSeconds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFederationTokenRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetFederationToken</a> request, including temporary AWS credentials that can be used to make AWS requests. </p>
   */
  @js.native
  trait GetFederationTokenResponse extends js.Object {
    var Credentials: Credentials
    var FederatedUser: FederatedUser
    var PackedPolicySize: nonNegativeIntegerType
  }

  object GetFederationTokenResponse {
    def apply(
      Credentials: js.UndefOr[Credentials] = js.undefined,
      FederatedUser: js.UndefOr[FederatedUser] = js.undefined,
      PackedPolicySize: js.UndefOr[nonNegativeIntegerType] = js.undefined
    ): GetFederationTokenResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Credentials" -> Credentials.map { x => x: js.Any }),
        ("FederatedUser" -> FederatedUser.map { x => x: js.Any }),
        ("PackedPolicySize" -> PackedPolicySize.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFederationTokenResponse]
    }
  }

  @js.native
  trait GetSessionTokenRequest extends js.Object {
    var DurationSeconds: durationSecondsType
    var SerialNumber: serialNumberType
    var TokenCode: tokenCodeType
  }

  object GetSessionTokenRequest {
    def apply(
      DurationSeconds: js.UndefOr[durationSecondsType] = js.undefined,
      SerialNumber: js.UndefOr[serialNumberType] = js.undefined,
      TokenCode: js.UndefOr[tokenCodeType] = js.undefined
    ): GetSessionTokenRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DurationSeconds" -> DurationSeconds.map { x => x: js.Any }),
        ("SerialNumber" -> SerialNumber.map { x => x: js.Any }),
        ("TokenCode" -> TokenCode.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSessionTokenRequest]
    }
  }

  /**
   * <p>Contains the response to a successful <a>GetSessionToken</a> request, including temporary AWS credentials that can be used to make AWS requests. </p>
   */
  @js.native
  trait GetSessionTokenResponse extends js.Object {
    var Credentials: Credentials
  }

  object GetSessionTokenResponse {
    def apply(
      Credentials: js.UndefOr[Credentials] = js.undefined
    ): GetSessionTokenResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Credentials" -> Credentials.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSessionTokenResponse]
    }
  }

  /**
   * <p>The request could not be fulfilled because the non-AWS identity provider (IDP) that was asked to verify the incoming identity token could not be reached. This is often a transient error caused by network conditions. Retry the request a limited number of times so that you don't exceed the request rate. If the error persists, the non-AWS identity provider might be down or not responding.</p>
   */
  @js.native
  trait IDPCommunicationErrorExceptionException extends js.Object {
    var message: idpCommunicationErrorMessage
  }

  /**
   * <p>The identity provider (IdP) reported that authentication failed. This might be because the claim is invalid.</p> <p>If this error is returned for the <code>AssumeRoleWithWebIdentity</code> operation, it can also mean that the claim has expired or has been explicitly revoked. </p>
   */
  @js.native
  trait IDPRejectedClaimExceptionException extends js.Object {
    var message: idpRejectedClaimMessage
  }

  /**
   * <p>The error returned if the message passed to <code>DecodeAuthorizationMessage</code> was invalid. This can happen if the token contains invalid characters, such as linebreaks. </p>
   */
  @js.native
  trait InvalidAuthorizationMessageExceptionException extends js.Object {
    var message: invalidAuthorizationMessage
  }

  /**
   * <p>The web identity token that was passed could not be validated by AWS. Get a new identity token from the identity provider and then retry the request.</p>
   */
  @js.native
  trait InvalidIdentityTokenExceptionException extends js.Object {
    var message: invalidIdentityTokenMessage
  }

  /**
   * <p>The request was rejected because the policy document was malformed. The error message describes the specific error.</p>
   */
  @js.native
  trait MalformedPolicyDocumentExceptionException extends js.Object {
    var message: malformedPolicyDocumentMessage
  }

  /**
   * <p>The request was rejected because the policy document was too large. The error message describes how big the policy document is, in packed form, as a percentage of what the API allows.</p>
   */
  @js.native
  trait PackedPolicyTooLargeExceptionException extends js.Object {
    var message: packedPolicyTooLargeMessage
  }

  /**
   * <p>STS is not activated in the requested region for the account that is being asked to generate credentials. The account administrator must use the IAM console to activate STS in that region. For more information, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html">Activating and Deactivating AWS STS in an AWS Region</a> in the <i>IAM User Guide</i>.</p>
   */
  @js.native
  trait RegionDisabledExceptionException extends js.Object {
    var message: regionDisabledMessage
  }
}
