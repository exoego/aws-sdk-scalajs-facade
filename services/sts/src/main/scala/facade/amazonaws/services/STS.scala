package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

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
  type tagKeyListType            = js.Array[tagKeyType]
  type tagKeyType                = String
  type tagListType               = js.Array[Tag]
  type tagValueType              = String
  type tokenCodeType             = String
  type tokenType                 = String
  type urlType                   = String
  type userIdType                = String
  type userNameType              = String
  type webIdentitySubjectType    = String

  implicit final class STSOps(private val service: STS) extends AnyVal {

    @inline def assumeRoleFuture(params: AssumeRoleRequest): Future[AssumeRoleResponse] =
      service.assumeRole(params).promise().toFuture
    @inline def assumeRoleWithSAMLFuture(params: AssumeRoleWithSAMLRequest): Future[AssumeRoleWithSAMLResponse] =
      service.assumeRoleWithSAML(params).promise().toFuture
    @inline def assumeRoleWithWebIdentityFuture(
        params: AssumeRoleWithWebIdentityRequest
    ): Future[AssumeRoleWithWebIdentityResponse] = service.assumeRoleWithWebIdentity(params).promise().toFuture
    @inline def decodeAuthorizationMessageFuture(
        params: DecodeAuthorizationMessageRequest
    ): Future[DecodeAuthorizationMessageResponse] = service.decodeAuthorizationMessage(params).promise().toFuture
    @inline def getAccessKeyInfoFuture(params: GetAccessKeyInfoRequest): Future[GetAccessKeyInfoResponse] =
      service.getAccessKeyInfo(params).promise().toFuture
    @inline def getCallerIdentityFuture(params: GetCallerIdentityRequest): Future[GetCallerIdentityResponse] =
      service.getCallerIdentity(params).promise().toFuture
    @inline def getFederationTokenFuture(params: GetFederationTokenRequest): Future[GetFederationTokenResponse] =
      service.getFederationToken(params).promise().toFuture
    @inline def getSessionTokenFuture(params: GetSessionTokenRequest): Future[GetSessionTokenResponse] =
      service.getSessionToken(params).promise().toFuture
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
  @Factory
  trait AssumeRoleRequest extends js.Object {
    var RoleArn: arnType
    var RoleSessionName: roleSessionNameType
    var DurationSeconds: js.UndefOr[roleDurationSecondsType]
    var ExternalId: js.UndefOr[externalIdType]
    var Policy: js.UndefOr[sessionPolicyDocumentType]
    var PolicyArns: js.UndefOr[policyDescriptorListType]
    var SerialNumber: js.UndefOr[serialNumberType]
    var Tags: js.UndefOr[tagListType]
    var TokenCode: js.UndefOr[tokenCodeType]
    var TransitiveTagKeys: js.UndefOr[tagKeyListType]
  }

  /**
    * Contains the response to a successful <a>AssumeRole</a> request, including temporary AWS credentials that can be used to make AWS requests.
    */
  @js.native
  @Factory
  trait AssumeRoleResponse extends js.Object {
    var AssumedRoleUser: js.UndefOr[AssumedRoleUser]
    var Credentials: js.UndefOr[Credentials]
    var PackedPolicySize: js.UndefOr[nonNegativeIntegerType]
  }

  @js.native
  @Factory
  trait AssumeRoleWithSAMLRequest extends js.Object {
    var PrincipalArn: arnType
    var RoleArn: arnType
    var SAMLAssertion: SAMLAssertionType
    var DurationSeconds: js.UndefOr[roleDurationSecondsType]
    var Policy: js.UndefOr[sessionPolicyDocumentType]
    var PolicyArns: js.UndefOr[policyDescriptorListType]
  }

  /**
    * Contains the response to a successful <a>AssumeRoleWithSAML</a> request, including temporary AWS credentials that can be used to make AWS requests.
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait AssumeRoleWithWebIdentityRequest extends js.Object {
    var RoleArn: arnType
    var RoleSessionName: roleSessionNameType
    var WebIdentityToken: clientTokenType
    var DurationSeconds: js.UndefOr[roleDurationSecondsType]
    var Policy: js.UndefOr[sessionPolicyDocumentType]
    var PolicyArns: js.UndefOr[policyDescriptorListType]
    var ProviderId: js.UndefOr[urlType]
  }

  /**
    * Contains the response to a successful <a>AssumeRoleWithWebIdentity</a> request, including temporary AWS credentials that can be used to make AWS requests.
    */
  @js.native
  @Factory
  trait AssumeRoleWithWebIdentityResponse extends js.Object {
    var AssumedRoleUser: js.UndefOr[AssumedRoleUser]
    var Audience: js.UndefOr[Audience]
    var Credentials: js.UndefOr[Credentials]
    var PackedPolicySize: js.UndefOr[nonNegativeIntegerType]
    var Provider: js.UndefOr[Issuer]
    var SubjectFromWebIdentityToken: js.UndefOr[webIdentitySubjectType]
  }

  /**
    * The identifiers for the temporary security credentials that the operation returns.
    */
  @js.native
  @Factory
  trait AssumedRoleUser extends js.Object {
    var Arn: arnType
    var AssumedRoleId: assumedRoleIdType
  }

  /**
    * AWS credentials for API authentication.
    */
  @js.native
  @Factory
  trait Credentials extends js.Object {
    var AccessKeyId: accessKeyIdType
    var Expiration: dateType
    var SecretAccessKey: accessKeySecretType
    var SessionToken: tokenType
  }

  @js.native
  @Factory
  trait DecodeAuthorizationMessageRequest extends js.Object {
    var EncodedMessage: encodedMessageType
  }

  /**
    * A document that contains additional information about the authorization status of a request from an encoded message that is returned in response to an AWS request.
    */
  @js.native
  @Factory
  trait DecodeAuthorizationMessageResponse extends js.Object {
    var DecodedMessage: js.UndefOr[decodedMessageType]
  }

  /**
    * Identifiers for the federated user that is associated with the credentials.
    */
  @js.native
  @Factory
  trait FederatedUser extends js.Object {
    var Arn: arnType
    var FederatedUserId: federatedIdType
  }

  @js.native
  @Factory
  trait GetAccessKeyInfoRequest extends js.Object {
    var AccessKeyId: accessKeyIdType
  }

  @js.native
  @Factory
  trait GetAccessKeyInfoResponse extends js.Object {
    var Account: js.UndefOr[accountType]
  }

  @js.native
  @Factory
  trait GetCallerIdentityRequest extends js.Object {}

  /**
    * Contains the response to a successful <a>GetCallerIdentity</a> request, including information about the entity making the request.
    */
  @js.native
  @Factory
  trait GetCallerIdentityResponse extends js.Object {
    var Account: js.UndefOr[accountType]
    var Arn: js.UndefOr[arnType]
    var UserId: js.UndefOr[userIdType]
  }

  @js.native
  @Factory
  trait GetFederationTokenRequest extends js.Object {
    var Name: userNameType
    var DurationSeconds: js.UndefOr[durationSecondsType]
    var Policy: js.UndefOr[sessionPolicyDocumentType]
    var PolicyArns: js.UndefOr[policyDescriptorListType]
    var Tags: js.UndefOr[tagListType]
  }

  /**
    * Contains the response to a successful <a>GetFederationToken</a> request, including temporary AWS credentials that can be used to make AWS requests.
    */
  @js.native
  @Factory
  trait GetFederationTokenResponse extends js.Object {
    var Credentials: js.UndefOr[Credentials]
    var FederatedUser: js.UndefOr[FederatedUser]
    var PackedPolicySize: js.UndefOr[nonNegativeIntegerType]
  }

  @js.native
  @Factory
  trait GetSessionTokenRequest extends js.Object {
    var DurationSeconds: js.UndefOr[durationSecondsType]
    var SerialNumber: js.UndefOr[serialNumberType]
    var TokenCode: js.UndefOr[tokenCodeType]
  }

  /**
    * Contains the response to a successful <a>GetSessionToken</a> request, including temporary AWS credentials that can be used to make AWS requests.
    */
  @js.native
  @Factory
  trait GetSessionTokenResponse extends js.Object {
    var Credentials: js.UndefOr[Credentials]
  }

  /**
    * A reference to the IAM managed policy that is passed as a session policy for a role session or a federated user session.
    */
  @js.native
  @Factory
  trait PolicyDescriptorType extends js.Object {
    var arn: js.UndefOr[arnType]
  }

  /**
    * You can pass custom key-value pair attributes when you assume a role or federate a user. These are called session tags. You can then use the session tags to control access to resources. For more information, see [[https://docs.aws.amazon.com/IAM/latest/UserGuide/id_session-tags.html|Tagging AWS STS Sessions]] in the <i>IAM User Guide</i>.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: tagKeyType
    var Value: tagValueType
  }
}
