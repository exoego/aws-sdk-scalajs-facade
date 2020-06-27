package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object cognitoidentity {
  type ARNString                         = String
  type AccessKeyString                   = String
  type AccountId                         = String
  type ClaimName                         = String
  type ClaimValue                        = String
  type ClassicFlow                       = Boolean
  type CognitoIdentityProviderClientId   = String
  type CognitoIdentityProviderList       = js.Array[CognitoIdentityProvider]
  type CognitoIdentityProviderName       = String
  type CognitoIdentityProviderTokenCheck = Boolean
  type DateType                          = js.Date
  type DeveloperProviderName             = String
  type DeveloperUserIdentifier           = String
  type DeveloperUserIdentifierList       = js.Array[DeveloperUserIdentifier]
  type HideDisabled                      = Boolean
  type IdentitiesList                    = js.Array[IdentityDescription]
  type IdentityId                        = String
  type IdentityIdList                    = js.Array[IdentityId]
  type IdentityPoolId                    = String
  type IdentityPoolName                  = String
  type IdentityPoolTagsListType          = js.Array[TagKeysType]
  type IdentityPoolTagsType              = js.Dictionary[TagValueType]
  type IdentityPoolUnauthenticated       = Boolean
  type IdentityPoolsList                 = js.Array[IdentityPoolShortDescription]
  type IdentityProviderId                = String
  type IdentityProviderName              = String
  type IdentityProviderToken             = String
  type IdentityProviders                 = js.Dictionary[IdentityProviderId]
  type LoginsList                        = js.Array[IdentityProviderName]
  type LoginsMap                         = js.Dictionary[IdentityProviderToken]
  type MappingRulesList                  = js.Array[MappingRule]
  type OIDCProviderList                  = js.Array[ARNString]
  type OIDCToken                         = String
  type PaginationKey                     = String
  type QueryLimit                        = Int
  type RoleMappingMap                    = js.Dictionary[RoleMapping]
  type RoleType                          = String
  type RolesMap                          = js.Dictionary[ARNString]
  type SAMLProviderList                  = js.Array[ARNString]
  type SecretKeyString                   = String
  type SessionTokenString                = String
  type TagKeysType                       = String
  type TagValueType                      = String
  type TokenDuration                     = Double
  type UnprocessedIdentityIdList         = js.Array[UnprocessedIdentityId]

  implicit final class CognitoIdentityOps(private val service: CognitoIdentity) extends AnyVal {

    @inline def createIdentityPoolFuture(params: CreateIdentityPoolInput): Future[IdentityPool] =
      service.createIdentityPool(params).promise().toFuture
    @inline def deleteIdentitiesFuture(params: DeleteIdentitiesInput): Future[DeleteIdentitiesResponse] =
      service.deleteIdentities(params).promise().toFuture
    @inline def deleteIdentityPoolFuture(params: DeleteIdentityPoolInput): Future[js.Object] =
      service.deleteIdentityPool(params).promise().toFuture
    @inline def describeIdentityFuture(params: DescribeIdentityInput): Future[IdentityDescription] =
      service.describeIdentity(params).promise().toFuture
    @inline def describeIdentityPoolFuture(params: DescribeIdentityPoolInput): Future[IdentityPool] =
      service.describeIdentityPool(params).promise().toFuture
    @inline def getCredentialsForIdentityFuture(
        params: GetCredentialsForIdentityInput
    ): Future[GetCredentialsForIdentityResponse]                       = service.getCredentialsForIdentity(params).promise().toFuture
    @inline def getIdFuture(params: GetIdInput): Future[GetIdResponse] = service.getId(params).promise().toFuture
    @inline def getIdentityPoolRolesFuture(params: GetIdentityPoolRolesInput): Future[GetIdentityPoolRolesResponse] =
      service.getIdentityPoolRoles(params).promise().toFuture
    @inline def getOpenIdTokenForDeveloperIdentityFuture(
        params: GetOpenIdTokenForDeveloperIdentityInput
    ): Future[GetOpenIdTokenForDeveloperIdentityResponse] =
      service.getOpenIdTokenForDeveloperIdentity(params).promise().toFuture
    @inline def getOpenIdTokenFuture(params: GetOpenIdTokenInput): Future[GetOpenIdTokenResponse] =
      service.getOpenIdToken(params).promise().toFuture
    @inline def listIdentitiesFuture(params: ListIdentitiesInput): Future[ListIdentitiesResponse] =
      service.listIdentities(params).promise().toFuture
    @inline def listIdentityPoolsFuture(params: ListIdentityPoolsInput): Future[ListIdentityPoolsResponse] =
      service.listIdentityPools(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def lookupDeveloperIdentityFuture(
        params: LookupDeveloperIdentityInput
    ): Future[LookupDeveloperIdentityResponse] = service.lookupDeveloperIdentity(params).promise().toFuture
    @inline def mergeDeveloperIdentitiesFuture(
        params: MergeDeveloperIdentitiesInput
    ): Future[MergeDeveloperIdentitiesResponse] = service.mergeDeveloperIdentities(params).promise().toFuture
    @inline def setIdentityPoolRolesFuture(params: SetIdentityPoolRolesInput): Future[js.Object] =
      service.setIdentityPoolRoles(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceInput): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def unlinkDeveloperIdentityFuture(params: UnlinkDeveloperIdentityInput): Future[js.Object] =
      service.unlinkDeveloperIdentity(params).promise().toFuture
    @inline def unlinkIdentityFuture(params: UnlinkIdentityInput): Future[js.Object] =
      service.unlinkIdentity(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceInput): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateIdentityPoolFuture(params: IdentityPool): Future[IdentityPool] =
      service.updateIdentityPool(params).promise().toFuture
  }
}

package cognitoidentity {
  @js.native
  @JSImport("aws-sdk", "CognitoIdentity")
  class CognitoIdentity() extends js.Object {
    def this(config: AWSConfig) = this()

    def createIdentityPool(params: CreateIdentityPoolInput): Request[IdentityPool]         = js.native
    def deleteIdentities(params: DeleteIdentitiesInput): Request[DeleteIdentitiesResponse] = js.native
    def deleteIdentityPool(params: DeleteIdentityPoolInput): Request[js.Object]            = js.native
    def describeIdentity(params: DescribeIdentityInput): Request[IdentityDescription]      = js.native
    def describeIdentityPool(params: DescribeIdentityPoolInput): Request[IdentityPool]     = js.native
    def getCredentialsForIdentity(params: GetCredentialsForIdentityInput): Request[GetCredentialsForIdentityResponse] =
      js.native
    def getId(params: GetIdInput): Request[GetIdResponse]                                              = js.native
    def getIdentityPoolRoles(params: GetIdentityPoolRolesInput): Request[GetIdentityPoolRolesResponse] = js.native
    def getOpenIdToken(params: GetOpenIdTokenInput): Request[GetOpenIdTokenResponse]                   = js.native
    def getOpenIdTokenForDeveloperIdentity(
        params: GetOpenIdTokenForDeveloperIdentityInput
    ): Request[GetOpenIdTokenForDeveloperIdentityResponse]                                          = js.native
    def listIdentities(params: ListIdentitiesInput): Request[ListIdentitiesResponse]                = js.native
    def listIdentityPools(params: ListIdentityPoolsInput): Request[ListIdentityPoolsResponse]       = js.native
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceResponse] = js.native
    def lookupDeveloperIdentity(params: LookupDeveloperIdentityInput): Request[LookupDeveloperIdentityResponse] =
      js.native
    def mergeDeveloperIdentities(params: MergeDeveloperIdentitiesInput): Request[MergeDeveloperIdentitiesResponse] =
      js.native
    def setIdentityPoolRoles(params: SetIdentityPoolRolesInput): Request[js.Object]       = js.native
    def tagResource(params: TagResourceInput): Request[TagResourceResponse]               = js.native
    def unlinkDeveloperIdentity(params: UnlinkDeveloperIdentityInput): Request[js.Object] = js.native
    def unlinkIdentity(params: UnlinkIdentityInput): Request[js.Object]                   = js.native
    def untagResource(params: UntagResourceInput): Request[UntagResourceResponse]         = js.native
    def updateIdentityPool(params: IdentityPool): Request[IdentityPool]                   = js.native
  }

  @js.native
  sealed trait AmbiguousRoleResolutionType extends js.Any
  object AmbiguousRoleResolutionType extends js.Object {
    val AuthenticatedRole = "AuthenticatedRole".asInstanceOf[AmbiguousRoleResolutionType]
    val Deny              = "Deny".asInstanceOf[AmbiguousRoleResolutionType]

    val values = js.Object.freeze(js.Array(AuthenticatedRole, Deny))
  }

  /**
    * A provider representing an Amazon Cognito user pool and its client ID.
    */
  @js.native
  @Factory
  trait CognitoIdentityProvider extends js.Object {
    var ClientId: js.UndefOr[CognitoIdentityProviderClientId]
    var ProviderName: js.UndefOr[CognitoIdentityProviderName]
    var ServerSideTokenCheck: js.UndefOr[CognitoIdentityProviderTokenCheck]
  }

  /**
    * Input to the CreateIdentityPool action.
    */
  @js.native
  @Factory
  trait CreateIdentityPoolInput extends js.Object {
    var AllowUnauthenticatedIdentities: IdentityPoolUnauthenticated
    var IdentityPoolName: IdentityPoolName
    var AllowClassicFlow: js.UndefOr[ClassicFlow]
    var CognitoIdentityProviders: js.UndefOr[CognitoIdentityProviderList]
    var DeveloperProviderName: js.UndefOr[DeveloperProviderName]
    var IdentityPoolTags: js.UndefOr[IdentityPoolTagsType]
    var OpenIdConnectProviderARNs: js.UndefOr[OIDCProviderList]
    var SamlProviderARNs: js.UndefOr[SAMLProviderList]
    var SupportedLoginProviders: js.UndefOr[IdentityProviders]
  }

  /**
    * Credentials for the provided identity ID.
    */
  @js.native
  @Factory
  trait Credentials extends js.Object {
    var AccessKeyId: js.UndefOr[AccessKeyString]
    var Expiration: js.UndefOr[DateType]
    var SecretKey: js.UndefOr[SecretKeyString]
    var SessionToken: js.UndefOr[SessionTokenString]
  }

  /**
    * Input to the <code>DeleteIdentities</code> action.
    */
  @js.native
  @Factory
  trait DeleteIdentitiesInput extends js.Object {
    var IdentityIdsToDelete: IdentityIdList
  }

  /**
    * Returned in response to a successful <code>DeleteIdentities</code> operation.
    */
  @js.native
  @Factory
  trait DeleteIdentitiesResponse extends js.Object {
    var UnprocessedIdentityIds: js.UndefOr[UnprocessedIdentityIdList]
  }

  /**
    * Input to the DeleteIdentityPool action.
    */
  @js.native
  @Factory
  trait DeleteIdentityPoolInput extends js.Object {
    var IdentityPoolId: IdentityPoolId
  }

  /**
    * Input to the <code>DescribeIdentity</code> action.
    */
  @js.native
  @Factory
  trait DescribeIdentityInput extends js.Object {
    var IdentityId: IdentityId
  }

  /**
    * Input to the DescribeIdentityPool action.
    */
  @js.native
  @Factory
  trait DescribeIdentityPoolInput extends js.Object {
    var IdentityPoolId: IdentityPoolId
  }

  @js.native
  sealed trait ErrorCode extends js.Any
  object ErrorCode extends js.Object {
    val AccessDenied        = "AccessDenied".asInstanceOf[ErrorCode]
    val InternalServerError = "InternalServerError".asInstanceOf[ErrorCode]

    val values = js.Object.freeze(js.Array(AccessDenied, InternalServerError))
  }

  /**
    * Input to the <code>GetCredentialsForIdentity</code> action.
    */
  @js.native
  @Factory
  trait GetCredentialsForIdentityInput extends js.Object {
    var IdentityId: IdentityId
    var CustomRoleArn: js.UndefOr[ARNString]
    var Logins: js.UndefOr[LoginsMap]
  }

  /**
    * Returned in response to a successful <code>GetCredentialsForIdentity</code> operation.
    */
  @js.native
  @Factory
  trait GetCredentialsForIdentityResponse extends js.Object {
    var Credentials: js.UndefOr[Credentials]
    var IdentityId: js.UndefOr[IdentityId]
  }

  /**
    * Input to the GetId action.
    */
  @js.native
  @Factory
  trait GetIdInput extends js.Object {
    var IdentityPoolId: IdentityPoolId
    var AccountId: js.UndefOr[AccountId]
    var Logins: js.UndefOr[LoginsMap]
  }

  /**
    * Returned in response to a GetId request.
    */
  @js.native
  @Factory
  trait GetIdResponse extends js.Object {
    var IdentityId: js.UndefOr[IdentityId]
  }

  /**
    * Input to the <code>GetIdentityPoolRoles</code> action.
    */
  @js.native
  @Factory
  trait GetIdentityPoolRolesInput extends js.Object {
    var IdentityPoolId: IdentityPoolId
  }

  /**
    * Returned in response to a successful <code>GetIdentityPoolRoles</code> operation.
    */
  @js.native
  @Factory
  trait GetIdentityPoolRolesResponse extends js.Object {
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
    var RoleMappings: js.UndefOr[RoleMappingMap]
    var Roles: js.UndefOr[RolesMap]
  }

  /**
    * Input to the <code>GetOpenIdTokenForDeveloperIdentity</code> action.
    */
  @js.native
  @Factory
  trait GetOpenIdTokenForDeveloperIdentityInput extends js.Object {
    var IdentityPoolId: IdentityPoolId
    var Logins: LoginsMap
    var IdentityId: js.UndefOr[IdentityId]
    var TokenDuration: js.UndefOr[TokenDuration]
  }

  /**
    * Returned in response to a successful <code>GetOpenIdTokenForDeveloperIdentity</code> request.
    */
  @js.native
  @Factory
  trait GetOpenIdTokenForDeveloperIdentityResponse extends js.Object {
    var IdentityId: js.UndefOr[IdentityId]
    var Token: js.UndefOr[OIDCToken]
  }

  /**
    * Input to the GetOpenIdToken action.
    */
  @js.native
  @Factory
  trait GetOpenIdTokenInput extends js.Object {
    var IdentityId: IdentityId
    var Logins: js.UndefOr[LoginsMap]
  }

  /**
    * Returned in response to a successful GetOpenIdToken request.
    */
  @js.native
  @Factory
  trait GetOpenIdTokenResponse extends js.Object {
    var IdentityId: js.UndefOr[IdentityId]
    var Token: js.UndefOr[OIDCToken]
  }

  /**
    * A description of the identity.
    */
  @js.native
  @Factory
  trait IdentityDescription extends js.Object {
    var CreationDate: js.UndefOr[DateType]
    var IdentityId: js.UndefOr[IdentityId]
    var LastModifiedDate: js.UndefOr[DateType]
    var Logins: js.UndefOr[LoginsList]
  }

  /**
    * An object representing an Amazon Cognito identity pool.
    */
  @js.native
  @Factory
  trait IdentityPool extends js.Object {
    var AllowUnauthenticatedIdentities: IdentityPoolUnauthenticated
    var IdentityPoolId: IdentityPoolId
    var IdentityPoolName: IdentityPoolName
    var AllowClassicFlow: js.UndefOr[ClassicFlow]
    var CognitoIdentityProviders: js.UndefOr[CognitoIdentityProviderList]
    var DeveloperProviderName: js.UndefOr[DeveloperProviderName]
    var IdentityPoolTags: js.UndefOr[IdentityPoolTagsType]
    var OpenIdConnectProviderARNs: js.UndefOr[OIDCProviderList]
    var SamlProviderARNs: js.UndefOr[SAMLProviderList]
    var SupportedLoginProviders: js.UndefOr[IdentityProviders]
  }

  /**
    * A description of the identity pool.
    */
  @js.native
  @Factory
  trait IdentityPoolShortDescription extends js.Object {
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
    var IdentityPoolName: js.UndefOr[IdentityPoolName]
  }

  /**
    * Input to the ListIdentities action.
    */
  @js.native
  @Factory
  trait ListIdentitiesInput extends js.Object {
    var IdentityPoolId: IdentityPoolId
    var MaxResults: QueryLimit
    var HideDisabled: js.UndefOr[HideDisabled]
    var NextToken: js.UndefOr[PaginationKey]
  }

  /**
    * The response to a ListIdentities request.
    */
  @js.native
  @Factory
  trait ListIdentitiesResponse extends js.Object {
    var Identities: js.UndefOr[IdentitiesList]
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
    var NextToken: js.UndefOr[PaginationKey]
  }

  /**
    * Input to the ListIdentityPools action.
    */
  @js.native
  @Factory
  trait ListIdentityPoolsInput extends js.Object {
    var MaxResults: QueryLimit
    var NextToken: js.UndefOr[PaginationKey]
  }

  /**
    * The result of a successful ListIdentityPools action.
    */
  @js.native
  @Factory
  trait ListIdentityPoolsResponse extends js.Object {
    var IdentityPools: js.UndefOr[IdentityPoolsList]
    var NextToken: js.UndefOr[PaginationKey]
  }

  @js.native
  @Factory
  trait ListTagsForResourceInput extends js.Object {
    var ResourceArn: ARNString
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[IdentityPoolTagsType]
  }

  /**
    * Input to the <code>LookupDeveloperIdentityInput</code> action.
    */
  @js.native
  @Factory
  trait LookupDeveloperIdentityInput extends js.Object {
    var IdentityPoolId: IdentityPoolId
    var DeveloperUserIdentifier: js.UndefOr[DeveloperUserIdentifier]
    var IdentityId: js.UndefOr[IdentityId]
    var MaxResults: js.UndefOr[QueryLimit]
    var NextToken: js.UndefOr[PaginationKey]
  }

  /**
    * Returned in response to a successful <code>LookupDeveloperIdentity</code> action.
    */
  @js.native
  @Factory
  trait LookupDeveloperIdentityResponse extends js.Object {
    var DeveloperUserIdentifierList: js.UndefOr[DeveloperUserIdentifierList]
    var IdentityId: js.UndefOr[IdentityId]
    var NextToken: js.UndefOr[PaginationKey]
  }

  /**
    * A rule that maps a claim name, a claim value, and a match type to a role ARN.
    */
  @js.native
  @Factory
  trait MappingRule extends js.Object {
    var Claim: ClaimName
    var MatchType: MappingRuleMatchType
    var RoleARN: ARNString
    var Value: ClaimValue
  }

  @js.native
  sealed trait MappingRuleMatchType extends js.Any
  object MappingRuleMatchType extends js.Object {
    val Equals     = "Equals".asInstanceOf[MappingRuleMatchType]
    val Contains   = "Contains".asInstanceOf[MappingRuleMatchType]
    val StartsWith = "StartsWith".asInstanceOf[MappingRuleMatchType]
    val NotEqual   = "NotEqual".asInstanceOf[MappingRuleMatchType]

    val values = js.Object.freeze(js.Array(Equals, Contains, StartsWith, NotEqual))
  }

  /**
    * Input to the <code>MergeDeveloperIdentities</code> action.
    */
  @js.native
  @Factory
  trait MergeDeveloperIdentitiesInput extends js.Object {
    var DestinationUserIdentifier: DeveloperUserIdentifier
    var DeveloperProviderName: DeveloperProviderName
    var IdentityPoolId: IdentityPoolId
    var SourceUserIdentifier: DeveloperUserIdentifier
  }

  /**
    * Returned in response to a successful <code>MergeDeveloperIdentities</code> action.
    */
  @js.native
  @Factory
  trait MergeDeveloperIdentitiesResponse extends js.Object {
    var IdentityId: js.UndefOr[IdentityId]
  }

  /**
    * A role mapping.
    */
  @js.native
  @Factory
  trait RoleMapping extends js.Object {
    var Type: RoleMappingType
    var AmbiguousRoleResolution: js.UndefOr[AmbiguousRoleResolutionType]
    var RulesConfiguration: js.UndefOr[RulesConfigurationType]
  }

  @js.native
  sealed trait RoleMappingType extends js.Any
  object RoleMappingType extends js.Object {
    val Token = "Token".asInstanceOf[RoleMappingType]
    val Rules = "Rules".asInstanceOf[RoleMappingType]

    val values = js.Object.freeze(js.Array(Token, Rules))
  }

  /**
    * A container for rules.
    */
  @js.native
  @Factory
  trait RulesConfigurationType extends js.Object {
    var Rules: MappingRulesList
  }

  /**
    * Input to the <code>SetIdentityPoolRoles</code> action.
    */
  @js.native
  @Factory
  trait SetIdentityPoolRolesInput extends js.Object {
    var IdentityPoolId: IdentityPoolId
    var Roles: RolesMap
    var RoleMappings: js.UndefOr[RoleMappingMap]
  }

  @js.native
  @Factory
  trait TagResourceInput extends js.Object {
    var ResourceArn: ARNString
    var Tags: IdentityPoolTagsType
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  /**
    * Input to the <code>UnlinkDeveloperIdentity</code> action.
    */
  @js.native
  @Factory
  trait UnlinkDeveloperIdentityInput extends js.Object {
    var DeveloperProviderName: DeveloperProviderName
    var DeveloperUserIdentifier: DeveloperUserIdentifier
    var IdentityId: IdentityId
    var IdentityPoolId: IdentityPoolId
  }

  /**
    * Input to the UnlinkIdentity action.
    */
  @js.native
  @Factory
  trait UnlinkIdentityInput extends js.Object {
    var IdentityId: IdentityId
    var Logins: LoginsMap
    var LoginsToRemove: LoginsList
  }

  /**
    * An array of UnprocessedIdentityId objects, each of which contains an ErrorCode and IdentityId.
    */
  @js.native
  @Factory
  trait UnprocessedIdentityId extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var IdentityId: js.UndefOr[IdentityId]
  }

  @js.native
  @Factory
  trait UntagResourceInput extends js.Object {
    var ResourceArn: ARNString
    var TagKeys: IdentityPoolTagsListType
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}
}
