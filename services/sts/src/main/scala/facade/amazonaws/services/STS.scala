package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object sts {
  type Audience                  = String
  type Issuer                    = String
  type NameQualifier             = String
  type SAMLAssertionType         = String
  type Subject                   = String
  type SubjectType               = String
  type accessKeyIdType           = String
  type accessKeySecretType       = String
  type accountType               = String
  type arnType                   = String
  type assumedRoleIdType         = String
  type clientTokenType           = String
  type dateType                  = js.Date
  type decodedMessageType        = String
  type durationSecondsType       = Int
  type encodedMessageType        = String
  type externalIdType            = String
  type federatedIdType           = String
  type nonNegativeIntegerType    = Int
  type policyDescriptorListType  = js.Array[PolicyDescriptorType]
  type roleDurationSecondsType   = Int
  type roleSessionNameType       = String
  type serialNumberType          = String
  type sessionPolicyDocumentType = String
  type tokenCodeType             = String
  type tokenType                 = String
  type urlType                   = String
  type userIdType                = String
  type userNameType              = String
  type webIdentitySubjectType    = String

  implicit final class STSOps(val service: STS) extends AnyVal {

    def assumeRoleFuture(params: AssumeRoleRequest): Future[AssumeRoleResponse] =
      service.assumeRole(params).promise.toFuture
    def assumeRoleWithSAMLFuture(params: AssumeRoleWithSAMLRequest): Future[AssumeRoleWithSAMLResponse] =
      service.assumeRoleWithSAML(params).promise.toFuture
    def assumeRoleWithWebIdentityFuture(
        params: AssumeRoleWithWebIdentityRequest
    ): Future[AssumeRoleWithWebIdentityResponse] = service.assumeRoleWithWebIdentity(params).promise.toFuture
    def decodeAuthorizationMessageFuture(
        params: DecodeAuthorizationMessageRequest
    ): Future[DecodeAuthorizationMessageResponse] = service.decodeAuthorizationMessage(params).promise.toFuture
    def getAccessKeyInfoFuture(params: GetAccessKeyInfoRequest): Future[GetAccessKeyInfoResponse] =
      service.getAccessKeyInfo(params).promise.toFuture
    def getCallerIdentityFuture(params: GetCallerIdentityRequest): Future[GetCallerIdentityResponse] =
      service.getCallerIdentity(params).promise.toFuture
    def getFederationTokenFuture(params: GetFederationTokenRequest): Future[GetFederationTokenResponse] =
      service.getFederationToken(params).promise.toFuture
    def getSessionTokenFuture(params: GetSessionTokenRequest): Future[GetSessionTokenResponse] =
      service.getSessionToken(params).promise.toFuture
  }
}

package sts {
  @js.native
  @JSImport("aws-sdk", "STS")
  class STS() extends js.Object {
    def this(config: AWSConfig) = this()

    def assumeRole(params: AssumeRoleRequest): Request[AssumeRoleResponse]                         = js.native
    def assumeRoleWithSAML(params: AssumeRoleWithSAMLRequest): Request[AssumeRoleWithSAMLResponse] = js.native
    def assumeRoleWithWebIdentity(
        params: AssumeRoleWithWebIdentityRequest
    ): Request[AssumeRoleWithWebIdentityResponse] = js.native
    def decodeAuthorizationMessage(
        params: DecodeAuthorizationMessageRequest
    ): Request[DecodeAuthorizationMessageResponse]                                                 = js.native
    def getAccessKeyInfo(params: GetAccessKeyInfoRequest): Request[GetAccessKeyInfoResponse]       = js.native
    def getCallerIdentity(params: GetCallerIdentityRequest): Request[GetCallerIdentityResponse]    = js.native
    def getFederationToken(params: GetFederationTokenRequest): Request[GetFederationTokenResponse] = js.native
    def getSessionToken(params: GetSessionTokenRequest): Request[GetSessionTokenResponse]          = js.native
  }

  @js.native
  trait AssumeRoleRequest extends js.Object {
    var RoleArn: arnType
    var RoleSessionName: roleSessionNameType
    var DurationSeconds: js.UndefOr[roleDurationSecondsType]
    var ExternalId: js.UndefOr[externalIdType]
    var Policy: js.UndefOr[sessionPolicyDocumentType]
    var PolicyArns: js.UndefOr[policyDescriptorListType]
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
        PolicyArns: js.UndefOr[policyDescriptorListType] = js.undefined,
        SerialNumber: js.UndefOr[serialNumberType] = js.undefined,
        TokenCode: js.UndefOr[tokenCodeType] = js.undefined
    ): AssumeRoleRequest = {
      val __obj = js.Dictionary[js.Any](
        "RoleArn"         -> RoleArn.asInstanceOf[js.Any],
        "RoleSessionName" -> RoleSessionName.asInstanceOf[js.Any]
      )

      DurationSeconds.foreach(__v => __obj.update("DurationSeconds", __v.asInstanceOf[js.Any]))
      ExternalId.foreach(__v => __obj.update("ExternalId", __v.asInstanceOf[js.Any]))
      Policy.foreach(__v => __obj.update("Policy", __v.asInstanceOf[js.Any]))
      PolicyArns.foreach(__v => __obj.update("PolicyArns", __v.asInstanceOf[js.Any]))
      SerialNumber.foreach(__v => __obj.update("SerialNumber", __v.asInstanceOf[js.Any]))
      TokenCode.foreach(__v => __obj.update("TokenCode", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssumeRoleRequest]
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
        PackedPolicySize: js.UndefOr[nonNegativeIntegerType] = js.undefined
    ): AssumeRoleResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AssumedRoleUser.foreach(__v => __obj.update("AssumedRoleUser", __v.asInstanceOf[js.Any]))
      Credentials.foreach(__v => __obj.update("Credentials", __v.asInstanceOf[js.Any]))
      PackedPolicySize.foreach(__v => __obj.update("PackedPolicySize", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssumeRoleResponse]
    }
  }

  @js.native
  trait AssumeRoleWithSAMLRequest extends js.Object {
    var PrincipalArn: arnType
    var RoleArn: arnType
    var SAMLAssertion: SAMLAssertionType
    var DurationSeconds: js.UndefOr[roleDurationSecondsType]
    var Policy: js.UndefOr[sessionPolicyDocumentType]
    var PolicyArns: js.UndefOr[policyDescriptorListType]
  }

  object AssumeRoleWithSAMLRequest {
    def apply(
        PrincipalArn: arnType,
        RoleArn: arnType,
        SAMLAssertion: SAMLAssertionType,
        DurationSeconds: js.UndefOr[roleDurationSecondsType] = js.undefined,
        Policy: js.UndefOr[sessionPolicyDocumentType] = js.undefined,
        PolicyArns: js.UndefOr[policyDescriptorListType] = js.undefined
    ): AssumeRoleWithSAMLRequest = {
      val __obj = js.Dictionary[js.Any](
        "PrincipalArn"  -> PrincipalArn.asInstanceOf[js.Any],
        "RoleArn"       -> RoleArn.asInstanceOf[js.Any],
        "SAMLAssertion" -> SAMLAssertion.asInstanceOf[js.Any]
      )

      DurationSeconds.foreach(__v => __obj.update("DurationSeconds", __v.asInstanceOf[js.Any]))
      Policy.foreach(__v => __obj.update("Policy", __v.asInstanceOf[js.Any]))
      PolicyArns.foreach(__v => __obj.update("PolicyArns", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssumeRoleWithSAMLRequest]
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
        SubjectType: js.UndefOr[SubjectType] = js.undefined
    ): AssumeRoleWithSAMLResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AssumedRoleUser.foreach(__v => __obj.update("AssumedRoleUser", __v.asInstanceOf[js.Any]))
      Audience.foreach(__v => __obj.update("Audience", __v.asInstanceOf[js.Any]))
      Credentials.foreach(__v => __obj.update("Credentials", __v.asInstanceOf[js.Any]))
      Issuer.foreach(__v => __obj.update("Issuer", __v.asInstanceOf[js.Any]))
      NameQualifier.foreach(__v => __obj.update("NameQualifier", __v.asInstanceOf[js.Any]))
      PackedPolicySize.foreach(__v => __obj.update("PackedPolicySize", __v.asInstanceOf[js.Any]))
      Subject.foreach(__v => __obj.update("Subject", __v.asInstanceOf[js.Any]))
      SubjectType.foreach(__v => __obj.update("SubjectType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssumeRoleWithSAMLResponse]
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
    def apply(
        RoleArn: arnType,
        RoleSessionName: roleSessionNameType,
        WebIdentityToken: clientTokenType,
        DurationSeconds: js.UndefOr[roleDurationSecondsType] = js.undefined,
        Policy: js.UndefOr[sessionPolicyDocumentType] = js.undefined,
        PolicyArns: js.UndefOr[policyDescriptorListType] = js.undefined,
        ProviderId: js.UndefOr[urlType] = js.undefined
    ): AssumeRoleWithWebIdentityRequest = {
      val __obj = js.Dictionary[js.Any](
        "RoleArn"          -> RoleArn.asInstanceOf[js.Any],
        "RoleSessionName"  -> RoleSessionName.asInstanceOf[js.Any],
        "WebIdentityToken" -> WebIdentityToken.asInstanceOf[js.Any]
      )

      DurationSeconds.foreach(__v => __obj.update("DurationSeconds", __v.asInstanceOf[js.Any]))
      Policy.foreach(__v => __obj.update("Policy", __v.asInstanceOf[js.Any]))
      PolicyArns.foreach(__v => __obj.update("PolicyArns", __v.asInstanceOf[js.Any]))
      ProviderId.foreach(__v => __obj.update("ProviderId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssumeRoleWithWebIdentityRequest]
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
        SubjectFromWebIdentityToken: js.UndefOr[webIdentitySubjectType] = js.undefined
    ): AssumeRoleWithWebIdentityResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AssumedRoleUser.foreach(__v => __obj.update("AssumedRoleUser", __v.asInstanceOf[js.Any]))
      Audience.foreach(__v => __obj.update("Audience", __v.asInstanceOf[js.Any]))
      Credentials.foreach(__v => __obj.update("Credentials", __v.asInstanceOf[js.Any]))
      PackedPolicySize.foreach(__v => __obj.update("PackedPolicySize", __v.asInstanceOf[js.Any]))
      Provider.foreach(__v => __obj.update("Provider", __v.asInstanceOf[js.Any]))
      SubjectFromWebIdentityToken.foreach(__v => __obj.update("SubjectFromWebIdentityToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssumeRoleWithWebIdentityResponse]
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
        AssumedRoleId: assumedRoleIdType
    ): AssumedRoleUser = {
      val __obj = js.Dictionary[js.Any](
        "Arn"           -> Arn.asInstanceOf[js.Any],
        "AssumedRoleId" -> AssumedRoleId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AssumedRoleUser]
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
        SessionToken: tokenType
    ): Credentials = {
      val __obj = js.Dictionary[js.Any](
        "AccessKeyId"     -> AccessKeyId.asInstanceOf[js.Any],
        "Expiration"      -> Expiration.asInstanceOf[js.Any],
        "SecretAccessKey" -> SecretAccessKey.asInstanceOf[js.Any],
        "SessionToken"    -> SessionToken.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Credentials]
    }
  }

  @js.native
  trait DecodeAuthorizationMessageRequest extends js.Object {
    var EncodedMessage: encodedMessageType
  }

  object DecodeAuthorizationMessageRequest {
    def apply(
        EncodedMessage: encodedMessageType
    ): DecodeAuthorizationMessageRequest = {
      val __obj = js.Dictionary[js.Any](
        "EncodedMessage" -> EncodedMessage.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DecodeAuthorizationMessageRequest]
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
        DecodedMessage: js.UndefOr[decodedMessageType] = js.undefined
    ): DecodeAuthorizationMessageResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      DecodedMessage.foreach(__v => __obj.update("DecodedMessage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DecodeAuthorizationMessageResponse]
    }
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
        FederatedUserId: federatedIdType
    ): FederatedUser = {
      val __obj = js.Dictionary[js.Any](
        "Arn"             -> Arn.asInstanceOf[js.Any],
        "FederatedUserId" -> FederatedUserId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[FederatedUser]
    }
  }

  @js.native
  trait GetAccessKeyInfoRequest extends js.Object {
    var AccessKeyId: accessKeyIdType
  }

  object GetAccessKeyInfoRequest {
    def apply(
        AccessKeyId: accessKeyIdType
    ): GetAccessKeyInfoRequest = {
      val __obj = js.Dictionary[js.Any](
        "AccessKeyId" -> AccessKeyId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetAccessKeyInfoRequest]
    }
  }

  @js.native
  trait GetAccessKeyInfoResponse extends js.Object {
    var Account: js.UndefOr[accountType]
  }

  object GetAccessKeyInfoResponse {
    def apply(
        Account: js.UndefOr[accountType] = js.undefined
    ): GetAccessKeyInfoResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Account.foreach(__v => __obj.update("Account", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAccessKeyInfoResponse]
    }
  }

  @js.native
  trait GetCallerIdentityRequest extends js.Object {}

  object GetCallerIdentityRequest {
    def apply(
        ): GetCallerIdentityRequest = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[GetCallerIdentityRequest]
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
        UserId: js.UndefOr[userIdType] = js.undefined
    ): GetCallerIdentityResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Account.foreach(__v => __obj.update("Account", __v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.update("Arn", __v.asInstanceOf[js.Any]))
      UserId.foreach(__v => __obj.update("UserId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCallerIdentityResponse]
    }
  }

  @js.native
  trait GetFederationTokenRequest extends js.Object {
    var Name: userNameType
    var DurationSeconds: js.UndefOr[durationSecondsType]
    var Policy: js.UndefOr[sessionPolicyDocumentType]
    var PolicyArns: js.UndefOr[policyDescriptorListType]
  }

  object GetFederationTokenRequest {
    def apply(
        Name: userNameType,
        DurationSeconds: js.UndefOr[durationSecondsType] = js.undefined,
        Policy: js.UndefOr[sessionPolicyDocumentType] = js.undefined,
        PolicyArns: js.UndefOr[policyDescriptorListType] = js.undefined
    ): GetFederationTokenRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      DurationSeconds.foreach(__v => __obj.update("DurationSeconds", __v.asInstanceOf[js.Any]))
      Policy.foreach(__v => __obj.update("Policy", __v.asInstanceOf[js.Any]))
      PolicyArns.foreach(__v => __obj.update("PolicyArns", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFederationTokenRequest]
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
        PackedPolicySize: js.UndefOr[nonNegativeIntegerType] = js.undefined
    ): GetFederationTokenResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Credentials.foreach(__v => __obj.update("Credentials", __v.asInstanceOf[js.Any]))
      FederatedUser.foreach(__v => __obj.update("FederatedUser", __v.asInstanceOf[js.Any]))
      PackedPolicySize.foreach(__v => __obj.update("PackedPolicySize", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFederationTokenResponse]
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
        TokenCode: js.UndefOr[tokenCodeType] = js.undefined
    ): GetSessionTokenRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      DurationSeconds.foreach(__v => __obj.update("DurationSeconds", __v.asInstanceOf[js.Any]))
      SerialNumber.foreach(__v => __obj.update("SerialNumber", __v.asInstanceOf[js.Any]))
      TokenCode.foreach(__v => __obj.update("TokenCode", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSessionTokenRequest]
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
        Credentials: js.UndefOr[Credentials] = js.undefined
    ): GetSessionTokenResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Credentials.foreach(__v => __obj.update("Credentials", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSessionTokenResponse]
    }
  }

  /**
    * A reference to the IAM managed policy that is passed as a session policy for a role session or a federated user session.
    */
  @js.native
  trait PolicyDescriptorType extends js.Object {
    var arn: js.UndefOr[arnType]
  }

  object PolicyDescriptorType {
    def apply(
        arn: js.UndefOr[arnType] = js.undefined
    ): PolicyDescriptorType = {
      val __obj = js.Dictionary.empty[js.Any]
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PolicyDescriptorType]
    }
  }
}
