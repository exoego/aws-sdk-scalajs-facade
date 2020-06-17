package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

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
      service.createIdentityPool(params).promise.toFuture
    @inline def deleteIdentitiesFuture(params: DeleteIdentitiesInput): Future[DeleteIdentitiesResponse] =
      service.deleteIdentities(params).promise.toFuture
    @inline def deleteIdentityPoolFuture(params: DeleteIdentityPoolInput): Future[js.Object] =
      service.deleteIdentityPool(params).promise.toFuture
    @inline def describeIdentityFuture(params: DescribeIdentityInput): Future[IdentityDescription] =
      service.describeIdentity(params).promise.toFuture
    @inline def describeIdentityPoolFuture(params: DescribeIdentityPoolInput): Future[IdentityPool] =
      service.describeIdentityPool(params).promise.toFuture
    @inline def getCredentialsForIdentityFuture(
        params: GetCredentialsForIdentityInput
    ): Future[GetCredentialsForIdentityResponse]                       = service.getCredentialsForIdentity(params).promise.toFuture
    @inline def getIdFuture(params: GetIdInput): Future[GetIdResponse] = service.getId(params).promise.toFuture
    @inline def getIdentityPoolRolesFuture(params: GetIdentityPoolRolesInput): Future[GetIdentityPoolRolesResponse] =
      service.getIdentityPoolRoles(params).promise.toFuture
    @inline def getOpenIdTokenForDeveloperIdentityFuture(
        params: GetOpenIdTokenForDeveloperIdentityInput
    ): Future[GetOpenIdTokenForDeveloperIdentityResponse] =
      service.getOpenIdTokenForDeveloperIdentity(params).promise.toFuture
    @inline def getOpenIdTokenFuture(params: GetOpenIdTokenInput): Future[GetOpenIdTokenResponse] =
      service.getOpenIdToken(params).promise.toFuture
    @inline def listIdentitiesFuture(params: ListIdentitiesInput): Future[ListIdentitiesResponse] =
      service.listIdentities(params).promise.toFuture
    @inline def listIdentityPoolsFuture(params: ListIdentityPoolsInput): Future[ListIdentityPoolsResponse] =
      service.listIdentityPools(params).promise.toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    @inline def lookupDeveloperIdentityFuture(
        params: LookupDeveloperIdentityInput
    ): Future[LookupDeveloperIdentityResponse] = service.lookupDeveloperIdentity(params).promise.toFuture
    @inline def mergeDeveloperIdentitiesFuture(
        params: MergeDeveloperIdentitiesInput
    ): Future[MergeDeveloperIdentitiesResponse] = service.mergeDeveloperIdentities(params).promise.toFuture
    @inline def setIdentityPoolRolesFuture(params: SetIdentityPoolRolesInput): Future[js.Object] =
      service.setIdentityPoolRoles(params).promise.toFuture
    @inline def tagResourceFuture(params: TagResourceInput): Future[TagResourceResponse] =
      service.tagResource(params).promise.toFuture
    @inline def unlinkDeveloperIdentityFuture(params: UnlinkDeveloperIdentityInput): Future[js.Object] =
      service.unlinkDeveloperIdentity(params).promise.toFuture
    @inline def unlinkIdentityFuture(params: UnlinkIdentityInput): Future[js.Object] =
      service.unlinkIdentity(params).promise.toFuture
    @inline def untagResourceFuture(params: UntagResourceInput): Future[UntagResourceResponse] =
      service.untagResource(params).promise.toFuture
    @inline def updateIdentityPoolFuture(params: IdentityPool): Future[IdentityPool] =
      service.updateIdentityPool(params).promise.toFuture
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
  trait CognitoIdentityProvider extends js.Object {
    var ClientId: js.UndefOr[CognitoIdentityProviderClientId]
    var ProviderName: js.UndefOr[CognitoIdentityProviderName]
    var ServerSideTokenCheck: js.UndefOr[CognitoIdentityProviderTokenCheck]
  }

  object CognitoIdentityProvider {
    @inline
    def apply(
        ClientId: js.UndefOr[CognitoIdentityProviderClientId] = js.undefined,
        ProviderName: js.UndefOr[CognitoIdentityProviderName] = js.undefined,
        ServerSideTokenCheck: js.UndefOr[CognitoIdentityProviderTokenCheck] = js.undefined
    ): CognitoIdentityProvider = {
      val __obj = js.Dynamic.literal()
      ClientId.foreach(__v => __obj.updateDynamic("ClientId")(__v.asInstanceOf[js.Any]))
      ProviderName.foreach(__v => __obj.updateDynamic("ProviderName")(__v.asInstanceOf[js.Any]))
      ServerSideTokenCheck.foreach(__v => __obj.updateDynamic("ServerSideTokenCheck")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CognitoIdentityProvider]
    }
  }

  /**
    * Input to the CreateIdentityPool action.
    */
  @js.native
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

  object CreateIdentityPoolInput {
    @inline
    def apply(
        AllowUnauthenticatedIdentities: IdentityPoolUnauthenticated,
        IdentityPoolName: IdentityPoolName,
        AllowClassicFlow: js.UndefOr[ClassicFlow] = js.undefined,
        CognitoIdentityProviders: js.UndefOr[CognitoIdentityProviderList] = js.undefined,
        DeveloperProviderName: js.UndefOr[DeveloperProviderName] = js.undefined,
        IdentityPoolTags: js.UndefOr[IdentityPoolTagsType] = js.undefined,
        OpenIdConnectProviderARNs: js.UndefOr[OIDCProviderList] = js.undefined,
        SamlProviderARNs: js.UndefOr[SAMLProviderList] = js.undefined,
        SupportedLoginProviders: js.UndefOr[IdentityProviders] = js.undefined
    ): CreateIdentityPoolInput = {
      val __obj = js.Dynamic.literal(
        "AllowUnauthenticatedIdentities" -> AllowUnauthenticatedIdentities.asInstanceOf[js.Any],
        "IdentityPoolName"               -> IdentityPoolName.asInstanceOf[js.Any]
      )

      AllowClassicFlow.foreach(__v => __obj.updateDynamic("AllowClassicFlow")(__v.asInstanceOf[js.Any]))
      CognitoIdentityProviders.foreach(__v => __obj.updateDynamic("CognitoIdentityProviders")(__v.asInstanceOf[js.Any]))
      DeveloperProviderName.foreach(__v => __obj.updateDynamic("DeveloperProviderName")(__v.asInstanceOf[js.Any]))
      IdentityPoolTags.foreach(__v => __obj.updateDynamic("IdentityPoolTags")(__v.asInstanceOf[js.Any]))
      OpenIdConnectProviderARNs.foreach(__v =>
        __obj.updateDynamic("OpenIdConnectProviderARNs")(__v.asInstanceOf[js.Any])
      )
      SamlProviderARNs.foreach(__v => __obj.updateDynamic("SamlProviderARNs")(__v.asInstanceOf[js.Any]))
      SupportedLoginProviders.foreach(__v => __obj.updateDynamic("SupportedLoginProviders")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateIdentityPoolInput]
    }
  }

  /**
    * Credentials for the provided identity ID.
    */
  @js.native
  trait Credentials extends js.Object {
    var AccessKeyId: js.UndefOr[AccessKeyString]
    var Expiration: js.UndefOr[DateType]
    var SecretKey: js.UndefOr[SecretKeyString]
    var SessionToken: js.UndefOr[SessionTokenString]
  }

  object Credentials {
    @inline
    def apply(
        AccessKeyId: js.UndefOr[AccessKeyString] = js.undefined,
        Expiration: js.UndefOr[DateType] = js.undefined,
        SecretKey: js.UndefOr[SecretKeyString] = js.undefined,
        SessionToken: js.UndefOr[SessionTokenString] = js.undefined
    ): Credentials = {
      val __obj = js.Dynamic.literal()
      AccessKeyId.foreach(__v => __obj.updateDynamic("AccessKeyId")(__v.asInstanceOf[js.Any]))
      Expiration.foreach(__v => __obj.updateDynamic("Expiration")(__v.asInstanceOf[js.Any]))
      SecretKey.foreach(__v => __obj.updateDynamic("SecretKey")(__v.asInstanceOf[js.Any]))
      SessionToken.foreach(__v => __obj.updateDynamic("SessionToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Credentials]
    }
  }

  /**
    * Input to the <code>DeleteIdentities</code> action.
    */
  @js.native
  trait DeleteIdentitiesInput extends js.Object {
    var IdentityIdsToDelete: IdentityIdList
  }

  object DeleteIdentitiesInput {
    @inline
    def apply(
        IdentityIdsToDelete: IdentityIdList
    ): DeleteIdentitiesInput = {
      val __obj = js.Dynamic.literal(
        "IdentityIdsToDelete" -> IdentityIdsToDelete.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteIdentitiesInput]
    }
  }

  /**
    * Returned in response to a successful <code>DeleteIdentities</code> operation.
    */
  @js.native
  trait DeleteIdentitiesResponse extends js.Object {
    var UnprocessedIdentityIds: js.UndefOr[UnprocessedIdentityIdList]
  }

  object DeleteIdentitiesResponse {
    @inline
    def apply(
        UnprocessedIdentityIds: js.UndefOr[UnprocessedIdentityIdList] = js.undefined
    ): DeleteIdentitiesResponse = {
      val __obj = js.Dynamic.literal()
      UnprocessedIdentityIds.foreach(__v => __obj.updateDynamic("UnprocessedIdentityIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteIdentitiesResponse]
    }
  }

  /**
    * Input to the DeleteIdentityPool action.
    */
  @js.native
  trait DeleteIdentityPoolInput extends js.Object {
    var IdentityPoolId: IdentityPoolId
  }

  object DeleteIdentityPoolInput {
    @inline
    def apply(
        IdentityPoolId: IdentityPoolId
    ): DeleteIdentityPoolInput = {
      val __obj = js.Dynamic.literal(
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteIdentityPoolInput]
    }
  }

  /**
    * Input to the <code>DescribeIdentity</code> action.
    */
  @js.native
  trait DescribeIdentityInput extends js.Object {
    var IdentityId: IdentityId
  }

  object DescribeIdentityInput {
    @inline
    def apply(
        IdentityId: IdentityId
    ): DescribeIdentityInput = {
      val __obj = js.Dynamic.literal(
        "IdentityId" -> IdentityId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeIdentityInput]
    }
  }

  /**
    * Input to the DescribeIdentityPool action.
    */
  @js.native
  trait DescribeIdentityPoolInput extends js.Object {
    var IdentityPoolId: IdentityPoolId
  }

  object DescribeIdentityPoolInput {
    @inline
    def apply(
        IdentityPoolId: IdentityPoolId
    ): DescribeIdentityPoolInput = {
      val __obj = js.Dynamic.literal(
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeIdentityPoolInput]
    }
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
  trait GetCredentialsForIdentityInput extends js.Object {
    var IdentityId: IdentityId
    var CustomRoleArn: js.UndefOr[ARNString]
    var Logins: js.UndefOr[LoginsMap]
  }

  object GetCredentialsForIdentityInput {
    @inline
    def apply(
        IdentityId: IdentityId,
        CustomRoleArn: js.UndefOr[ARNString] = js.undefined,
        Logins: js.UndefOr[LoginsMap] = js.undefined
    ): GetCredentialsForIdentityInput = {
      val __obj = js.Dynamic.literal(
        "IdentityId" -> IdentityId.asInstanceOf[js.Any]
      )

      CustomRoleArn.foreach(__v => __obj.updateDynamic("CustomRoleArn")(__v.asInstanceOf[js.Any]))
      Logins.foreach(__v => __obj.updateDynamic("Logins")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCredentialsForIdentityInput]
    }
  }

  /**
    * Returned in response to a successful <code>GetCredentialsForIdentity</code> operation.
    */
  @js.native
  trait GetCredentialsForIdentityResponse extends js.Object {
    var Credentials: js.UndefOr[Credentials]
    var IdentityId: js.UndefOr[IdentityId]
  }

  object GetCredentialsForIdentityResponse {
    @inline
    def apply(
        Credentials: js.UndefOr[Credentials] = js.undefined,
        IdentityId: js.UndefOr[IdentityId] = js.undefined
    ): GetCredentialsForIdentityResponse = {
      val __obj = js.Dynamic.literal()
      Credentials.foreach(__v => __obj.updateDynamic("Credentials")(__v.asInstanceOf[js.Any]))
      IdentityId.foreach(__v => __obj.updateDynamic("IdentityId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCredentialsForIdentityResponse]
    }
  }

  /**
    * Input to the GetId action.
    */
  @js.native
  trait GetIdInput extends js.Object {
    var IdentityPoolId: IdentityPoolId
    var AccountId: js.UndefOr[AccountId]
    var Logins: js.UndefOr[LoginsMap]
  }

  object GetIdInput {
    @inline
    def apply(
        IdentityPoolId: IdentityPoolId,
        AccountId: js.UndefOr[AccountId] = js.undefined,
        Logins: js.UndefOr[LoginsMap] = js.undefined
    ): GetIdInput = {
      val __obj = js.Dynamic.literal(
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]
      )

      AccountId.foreach(__v => __obj.updateDynamic("AccountId")(__v.asInstanceOf[js.Any]))
      Logins.foreach(__v => __obj.updateDynamic("Logins")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetIdInput]
    }
  }

  /**
    * Returned in response to a GetId request.
    */
  @js.native
  trait GetIdResponse extends js.Object {
    var IdentityId: js.UndefOr[IdentityId]
  }

  object GetIdResponse {
    @inline
    def apply(
        IdentityId: js.UndefOr[IdentityId] = js.undefined
    ): GetIdResponse = {
      val __obj = js.Dynamic.literal()
      IdentityId.foreach(__v => __obj.updateDynamic("IdentityId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetIdResponse]
    }
  }

  /**
    * Input to the <code>GetIdentityPoolRoles</code> action.
    */
  @js.native
  trait GetIdentityPoolRolesInput extends js.Object {
    var IdentityPoolId: IdentityPoolId
  }

  object GetIdentityPoolRolesInput {
    @inline
    def apply(
        IdentityPoolId: IdentityPoolId
    ): GetIdentityPoolRolesInput = {
      val __obj = js.Dynamic.literal(
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetIdentityPoolRolesInput]
    }
  }

  /**
    * Returned in response to a successful <code>GetIdentityPoolRoles</code> operation.
    */
  @js.native
  trait GetIdentityPoolRolesResponse extends js.Object {
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
    var RoleMappings: js.UndefOr[RoleMappingMap]
    var Roles: js.UndefOr[RolesMap]
  }

  object GetIdentityPoolRolesResponse {
    @inline
    def apply(
        IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
        RoleMappings: js.UndefOr[RoleMappingMap] = js.undefined,
        Roles: js.UndefOr[RolesMap] = js.undefined
    ): GetIdentityPoolRolesResponse = {
      val __obj = js.Dynamic.literal()
      IdentityPoolId.foreach(__v => __obj.updateDynamic("IdentityPoolId")(__v.asInstanceOf[js.Any]))
      RoleMappings.foreach(__v => __obj.updateDynamic("RoleMappings")(__v.asInstanceOf[js.Any]))
      Roles.foreach(__v => __obj.updateDynamic("Roles")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetIdentityPoolRolesResponse]
    }
  }

  /**
    * Input to the <code>GetOpenIdTokenForDeveloperIdentity</code> action.
    */
  @js.native
  trait GetOpenIdTokenForDeveloperIdentityInput extends js.Object {
    var IdentityPoolId: IdentityPoolId
    var Logins: LoginsMap
    var IdentityId: js.UndefOr[IdentityId]
    var TokenDuration: js.UndefOr[TokenDuration]
  }

  object GetOpenIdTokenForDeveloperIdentityInput {
    @inline
    def apply(
        IdentityPoolId: IdentityPoolId,
        Logins: LoginsMap,
        IdentityId: js.UndefOr[IdentityId] = js.undefined,
        TokenDuration: js.UndefOr[TokenDuration] = js.undefined
    ): GetOpenIdTokenForDeveloperIdentityInput = {
      val __obj = js.Dynamic.literal(
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any],
        "Logins"         -> Logins.asInstanceOf[js.Any]
      )

      IdentityId.foreach(__v => __obj.updateDynamic("IdentityId")(__v.asInstanceOf[js.Any]))
      TokenDuration.foreach(__v => __obj.updateDynamic("TokenDuration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOpenIdTokenForDeveloperIdentityInput]
    }
  }

  /**
    * Returned in response to a successful <code>GetOpenIdTokenForDeveloperIdentity</code> request.
    */
  @js.native
  trait GetOpenIdTokenForDeveloperIdentityResponse extends js.Object {
    var IdentityId: js.UndefOr[IdentityId]
    var Token: js.UndefOr[OIDCToken]
  }

  object GetOpenIdTokenForDeveloperIdentityResponse {
    @inline
    def apply(
        IdentityId: js.UndefOr[IdentityId] = js.undefined,
        Token: js.UndefOr[OIDCToken] = js.undefined
    ): GetOpenIdTokenForDeveloperIdentityResponse = {
      val __obj = js.Dynamic.literal()
      IdentityId.foreach(__v => __obj.updateDynamic("IdentityId")(__v.asInstanceOf[js.Any]))
      Token.foreach(__v => __obj.updateDynamic("Token")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOpenIdTokenForDeveloperIdentityResponse]
    }
  }

  /**
    * Input to the GetOpenIdToken action.
    */
  @js.native
  trait GetOpenIdTokenInput extends js.Object {
    var IdentityId: IdentityId
    var Logins: js.UndefOr[LoginsMap]
  }

  object GetOpenIdTokenInput {
    @inline
    def apply(
        IdentityId: IdentityId,
        Logins: js.UndefOr[LoginsMap] = js.undefined
    ): GetOpenIdTokenInput = {
      val __obj = js.Dynamic.literal(
        "IdentityId" -> IdentityId.asInstanceOf[js.Any]
      )

      Logins.foreach(__v => __obj.updateDynamic("Logins")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOpenIdTokenInput]
    }
  }

  /**
    * Returned in response to a successful GetOpenIdToken request.
    */
  @js.native
  trait GetOpenIdTokenResponse extends js.Object {
    var IdentityId: js.UndefOr[IdentityId]
    var Token: js.UndefOr[OIDCToken]
  }

  object GetOpenIdTokenResponse {
    @inline
    def apply(
        IdentityId: js.UndefOr[IdentityId] = js.undefined,
        Token: js.UndefOr[OIDCToken] = js.undefined
    ): GetOpenIdTokenResponse = {
      val __obj = js.Dynamic.literal()
      IdentityId.foreach(__v => __obj.updateDynamic("IdentityId")(__v.asInstanceOf[js.Any]))
      Token.foreach(__v => __obj.updateDynamic("Token")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOpenIdTokenResponse]
    }
  }

  /**
    * A description of the identity.
    */
  @js.native
  trait IdentityDescription extends js.Object {
    var CreationDate: js.UndefOr[DateType]
    var IdentityId: js.UndefOr[IdentityId]
    var LastModifiedDate: js.UndefOr[DateType]
    var Logins: js.UndefOr[LoginsList]
  }

  object IdentityDescription {
    @inline
    def apply(
        CreationDate: js.UndefOr[DateType] = js.undefined,
        IdentityId: js.UndefOr[IdentityId] = js.undefined,
        LastModifiedDate: js.UndefOr[DateType] = js.undefined,
        Logins: js.UndefOr[LoginsList] = js.undefined
    ): IdentityDescription = {
      val __obj = js.Dynamic.literal()
      CreationDate.foreach(__v => __obj.updateDynamic("CreationDate")(__v.asInstanceOf[js.Any]))
      IdentityId.foreach(__v => __obj.updateDynamic("IdentityId")(__v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.updateDynamic("LastModifiedDate")(__v.asInstanceOf[js.Any]))
      Logins.foreach(__v => __obj.updateDynamic("Logins")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IdentityDescription]
    }
  }

  /**
    * An object representing an Amazon Cognito identity pool.
    */
  @js.native
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

  object IdentityPool {
    @inline
    def apply(
        AllowUnauthenticatedIdentities: IdentityPoolUnauthenticated,
        IdentityPoolId: IdentityPoolId,
        IdentityPoolName: IdentityPoolName,
        AllowClassicFlow: js.UndefOr[ClassicFlow] = js.undefined,
        CognitoIdentityProviders: js.UndefOr[CognitoIdentityProviderList] = js.undefined,
        DeveloperProviderName: js.UndefOr[DeveloperProviderName] = js.undefined,
        IdentityPoolTags: js.UndefOr[IdentityPoolTagsType] = js.undefined,
        OpenIdConnectProviderARNs: js.UndefOr[OIDCProviderList] = js.undefined,
        SamlProviderARNs: js.UndefOr[SAMLProviderList] = js.undefined,
        SupportedLoginProviders: js.UndefOr[IdentityProviders] = js.undefined
    ): IdentityPool = {
      val __obj = js.Dynamic.literal(
        "AllowUnauthenticatedIdentities" -> AllowUnauthenticatedIdentities.asInstanceOf[js.Any],
        "IdentityPoolId"                 -> IdentityPoolId.asInstanceOf[js.Any],
        "IdentityPoolName"               -> IdentityPoolName.asInstanceOf[js.Any]
      )

      AllowClassicFlow.foreach(__v => __obj.updateDynamic("AllowClassicFlow")(__v.asInstanceOf[js.Any]))
      CognitoIdentityProviders.foreach(__v => __obj.updateDynamic("CognitoIdentityProviders")(__v.asInstanceOf[js.Any]))
      DeveloperProviderName.foreach(__v => __obj.updateDynamic("DeveloperProviderName")(__v.asInstanceOf[js.Any]))
      IdentityPoolTags.foreach(__v => __obj.updateDynamic("IdentityPoolTags")(__v.asInstanceOf[js.Any]))
      OpenIdConnectProviderARNs.foreach(__v =>
        __obj.updateDynamic("OpenIdConnectProviderARNs")(__v.asInstanceOf[js.Any])
      )
      SamlProviderARNs.foreach(__v => __obj.updateDynamic("SamlProviderARNs")(__v.asInstanceOf[js.Any]))
      SupportedLoginProviders.foreach(__v => __obj.updateDynamic("SupportedLoginProviders")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IdentityPool]
    }
  }

  /**
    * A description of the identity pool.
    */
  @js.native
  trait IdentityPoolShortDescription extends js.Object {
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
    var IdentityPoolName: js.UndefOr[IdentityPoolName]
  }

  object IdentityPoolShortDescription {
    @inline
    def apply(
        IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
        IdentityPoolName: js.UndefOr[IdentityPoolName] = js.undefined
    ): IdentityPoolShortDescription = {
      val __obj = js.Dynamic.literal()
      IdentityPoolId.foreach(__v => __obj.updateDynamic("IdentityPoolId")(__v.asInstanceOf[js.Any]))
      IdentityPoolName.foreach(__v => __obj.updateDynamic("IdentityPoolName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IdentityPoolShortDescription]
    }
  }

  /**
    * Input to the ListIdentities action.
    */
  @js.native
  trait ListIdentitiesInput extends js.Object {
    var IdentityPoolId: IdentityPoolId
    var MaxResults: QueryLimit
    var HideDisabled: js.UndefOr[HideDisabled]
    var NextToken: js.UndefOr[PaginationKey]
  }

  object ListIdentitiesInput {
    @inline
    def apply(
        IdentityPoolId: IdentityPoolId,
        MaxResults: QueryLimit,
        HideDisabled: js.UndefOr[HideDisabled] = js.undefined,
        NextToken: js.UndefOr[PaginationKey] = js.undefined
    ): ListIdentitiesInput = {
      val __obj = js.Dynamic.literal(
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any],
        "MaxResults"     -> MaxResults.asInstanceOf[js.Any]
      )

      HideDisabled.foreach(__v => __obj.updateDynamic("HideDisabled")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIdentitiesInput]
    }
  }

  /**
    * The response to a ListIdentities request.
    */
  @js.native
  trait ListIdentitiesResponse extends js.Object {
    var Identities: js.UndefOr[IdentitiesList]
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
    var NextToken: js.UndefOr[PaginationKey]
  }

  object ListIdentitiesResponse {
    @inline
    def apply(
        Identities: js.UndefOr[IdentitiesList] = js.undefined,
        IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
        NextToken: js.UndefOr[PaginationKey] = js.undefined
    ): ListIdentitiesResponse = {
      val __obj = js.Dynamic.literal()
      Identities.foreach(__v => __obj.updateDynamic("Identities")(__v.asInstanceOf[js.Any]))
      IdentityPoolId.foreach(__v => __obj.updateDynamic("IdentityPoolId")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIdentitiesResponse]
    }
  }

  /**
    * Input to the ListIdentityPools action.
    */
  @js.native
  trait ListIdentityPoolsInput extends js.Object {
    var MaxResults: QueryLimit
    var NextToken: js.UndefOr[PaginationKey]
  }

  object ListIdentityPoolsInput {
    @inline
    def apply(
        MaxResults: QueryLimit,
        NextToken: js.UndefOr[PaginationKey] = js.undefined
    ): ListIdentityPoolsInput = {
      val __obj = js.Dynamic.literal(
        "MaxResults" -> MaxResults.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIdentityPoolsInput]
    }
  }

  /**
    * The result of a successful ListIdentityPools action.
    */
  @js.native
  trait ListIdentityPoolsResponse extends js.Object {
    var IdentityPools: js.UndefOr[IdentityPoolsList]
    var NextToken: js.UndefOr[PaginationKey]
  }

  object ListIdentityPoolsResponse {
    @inline
    def apply(
        IdentityPools: js.UndefOr[IdentityPoolsList] = js.undefined,
        NextToken: js.UndefOr[PaginationKey] = js.undefined
    ): ListIdentityPoolsResponse = {
      val __obj = js.Dynamic.literal()
      IdentityPools.foreach(__v => __obj.updateDynamic("IdentityPools")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIdentityPoolsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceInput extends js.Object {
    var ResourceArn: ARNString
  }

  object ListTagsForResourceInput {
    @inline
    def apply(
        ResourceArn: ARNString
    ): ListTagsForResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceInput]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[IdentityPoolTagsType]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[IdentityPoolTagsType] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /**
    * Input to the <code>LookupDeveloperIdentityInput</code> action.
    */
  @js.native
  trait LookupDeveloperIdentityInput extends js.Object {
    var IdentityPoolId: IdentityPoolId
    var DeveloperUserIdentifier: js.UndefOr[DeveloperUserIdentifier]
    var IdentityId: js.UndefOr[IdentityId]
    var MaxResults: js.UndefOr[QueryLimit]
    var NextToken: js.UndefOr[PaginationKey]
  }

  object LookupDeveloperIdentityInput {
    @inline
    def apply(
        IdentityPoolId: IdentityPoolId,
        DeveloperUserIdentifier: js.UndefOr[DeveloperUserIdentifier] = js.undefined,
        IdentityId: js.UndefOr[IdentityId] = js.undefined,
        MaxResults: js.UndefOr[QueryLimit] = js.undefined,
        NextToken: js.UndefOr[PaginationKey] = js.undefined
    ): LookupDeveloperIdentityInput = {
      val __obj = js.Dynamic.literal(
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]
      )

      DeveloperUserIdentifier.foreach(__v => __obj.updateDynamic("DeveloperUserIdentifier")(__v.asInstanceOf[js.Any]))
      IdentityId.foreach(__v => __obj.updateDynamic("IdentityId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LookupDeveloperIdentityInput]
    }
  }

  /**
    * Returned in response to a successful <code>LookupDeveloperIdentity</code> action.
    */
  @js.native
  trait LookupDeveloperIdentityResponse extends js.Object {
    var DeveloperUserIdentifierList: js.UndefOr[DeveloperUserIdentifierList]
    var IdentityId: js.UndefOr[IdentityId]
    var NextToken: js.UndefOr[PaginationKey]
  }

  object LookupDeveloperIdentityResponse {
    @inline
    def apply(
        DeveloperUserIdentifierList: js.UndefOr[DeveloperUserIdentifierList] = js.undefined,
        IdentityId: js.UndefOr[IdentityId] = js.undefined,
        NextToken: js.UndefOr[PaginationKey] = js.undefined
    ): LookupDeveloperIdentityResponse = {
      val __obj = js.Dynamic.literal()
      DeveloperUserIdentifierList.foreach(__v =>
        __obj.updateDynamic("DeveloperUserIdentifierList")(__v.asInstanceOf[js.Any])
      )
      IdentityId.foreach(__v => __obj.updateDynamic("IdentityId")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LookupDeveloperIdentityResponse]
    }
  }

  /**
    * A rule that maps a claim name, a claim value, and a match type to a role ARN.
    */
  @js.native
  trait MappingRule extends js.Object {
    var Claim: ClaimName
    var MatchType: MappingRuleMatchType
    var RoleARN: ARNString
    var Value: ClaimValue
  }

  object MappingRule {
    @inline
    def apply(
        Claim: ClaimName,
        MatchType: MappingRuleMatchType,
        RoleARN: ARNString,
        Value: ClaimValue
    ): MappingRule = {
      val __obj = js.Dynamic.literal(
        "Claim"     -> Claim.asInstanceOf[js.Any],
        "MatchType" -> MatchType.asInstanceOf[js.Any],
        "RoleARN"   -> RoleARN.asInstanceOf[js.Any],
        "Value"     -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[MappingRule]
    }
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
  trait MergeDeveloperIdentitiesInput extends js.Object {
    var DestinationUserIdentifier: DeveloperUserIdentifier
    var DeveloperProviderName: DeveloperProviderName
    var IdentityPoolId: IdentityPoolId
    var SourceUserIdentifier: DeveloperUserIdentifier
  }

  object MergeDeveloperIdentitiesInput {
    @inline
    def apply(
        DestinationUserIdentifier: DeveloperUserIdentifier,
        DeveloperProviderName: DeveloperProviderName,
        IdentityPoolId: IdentityPoolId,
        SourceUserIdentifier: DeveloperUserIdentifier
    ): MergeDeveloperIdentitiesInput = {
      val __obj = js.Dynamic.literal(
        "DestinationUserIdentifier" -> DestinationUserIdentifier.asInstanceOf[js.Any],
        "DeveloperProviderName"     -> DeveloperProviderName.asInstanceOf[js.Any],
        "IdentityPoolId"            -> IdentityPoolId.asInstanceOf[js.Any],
        "SourceUserIdentifier"      -> SourceUserIdentifier.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[MergeDeveloperIdentitiesInput]
    }
  }

  /**
    * Returned in response to a successful <code>MergeDeveloperIdentities</code> action.
    */
  @js.native
  trait MergeDeveloperIdentitiesResponse extends js.Object {
    var IdentityId: js.UndefOr[IdentityId]
  }

  object MergeDeveloperIdentitiesResponse {
    @inline
    def apply(
        IdentityId: js.UndefOr[IdentityId] = js.undefined
    ): MergeDeveloperIdentitiesResponse = {
      val __obj = js.Dynamic.literal()
      IdentityId.foreach(__v => __obj.updateDynamic("IdentityId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MergeDeveloperIdentitiesResponse]
    }
  }

  /**
    * A role mapping.
    */
  @js.native
  trait RoleMapping extends js.Object {
    var Type: RoleMappingType
    var AmbiguousRoleResolution: js.UndefOr[AmbiguousRoleResolutionType]
    var RulesConfiguration: js.UndefOr[RulesConfigurationType]
  }

  object RoleMapping {
    @inline
    def apply(
        Type: RoleMappingType,
        AmbiguousRoleResolution: js.UndefOr[AmbiguousRoleResolutionType] = js.undefined,
        RulesConfiguration: js.UndefOr[RulesConfigurationType] = js.undefined
    ): RoleMapping = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any]
      )

      AmbiguousRoleResolution.foreach(__v => __obj.updateDynamic("AmbiguousRoleResolution")(__v.asInstanceOf[js.Any]))
      RulesConfiguration.foreach(__v => __obj.updateDynamic("RulesConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RoleMapping]
    }
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
  trait RulesConfigurationType extends js.Object {
    var Rules: MappingRulesList
  }

  object RulesConfigurationType {
    @inline
    def apply(
        Rules: MappingRulesList
    ): RulesConfigurationType = {
      val __obj = js.Dynamic.literal(
        "Rules" -> Rules.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RulesConfigurationType]
    }
  }

  /**
    * Input to the <code>SetIdentityPoolRoles</code> action.
    */
  @js.native
  trait SetIdentityPoolRolesInput extends js.Object {
    var IdentityPoolId: IdentityPoolId
    var Roles: RolesMap
    var RoleMappings: js.UndefOr[RoleMappingMap]
  }

  object SetIdentityPoolRolesInput {
    @inline
    def apply(
        IdentityPoolId: IdentityPoolId,
        Roles: RolesMap,
        RoleMappings: js.UndefOr[RoleMappingMap] = js.undefined
    ): SetIdentityPoolRolesInput = {
      val __obj = js.Dynamic.literal(
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any],
        "Roles"          -> Roles.asInstanceOf[js.Any]
      )

      RoleMappings.foreach(__v => __obj.updateDynamic("RoleMappings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetIdentityPoolRolesInput]
    }
  }

  @js.native
  trait TagResourceInput extends js.Object {
    var ResourceArn: ARNString
    var Tags: IdentityPoolTagsType
  }

  object TagResourceInput {
    @inline
    def apply(
        ResourceArn: ARNString,
        Tags: IdentityPoolTagsType
    ): TagResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags"        -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceInput]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    @inline
    def apply(
    ): TagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /**
    * Input to the <code>UnlinkDeveloperIdentity</code> action.
    */
  @js.native
  trait UnlinkDeveloperIdentityInput extends js.Object {
    var DeveloperProviderName: DeveloperProviderName
    var DeveloperUserIdentifier: DeveloperUserIdentifier
    var IdentityId: IdentityId
    var IdentityPoolId: IdentityPoolId
  }

  object UnlinkDeveloperIdentityInput {
    @inline
    def apply(
        DeveloperProviderName: DeveloperProviderName,
        DeveloperUserIdentifier: DeveloperUserIdentifier,
        IdentityId: IdentityId,
        IdentityPoolId: IdentityPoolId
    ): UnlinkDeveloperIdentityInput = {
      val __obj = js.Dynamic.literal(
        "DeveloperProviderName"   -> DeveloperProviderName.asInstanceOf[js.Any],
        "DeveloperUserIdentifier" -> DeveloperUserIdentifier.asInstanceOf[js.Any],
        "IdentityId"              -> IdentityId.asInstanceOf[js.Any],
        "IdentityPoolId"          -> IdentityPoolId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UnlinkDeveloperIdentityInput]
    }
  }

  /**
    * Input to the UnlinkIdentity action.
    */
  @js.native
  trait UnlinkIdentityInput extends js.Object {
    var IdentityId: IdentityId
    var Logins: LoginsMap
    var LoginsToRemove: LoginsList
  }

  object UnlinkIdentityInput {
    @inline
    def apply(
        IdentityId: IdentityId,
        Logins: LoginsMap,
        LoginsToRemove: LoginsList
    ): UnlinkIdentityInput = {
      val __obj = js.Dynamic.literal(
        "IdentityId"     -> IdentityId.asInstanceOf[js.Any],
        "Logins"         -> Logins.asInstanceOf[js.Any],
        "LoginsToRemove" -> LoginsToRemove.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UnlinkIdentityInput]
    }
  }

  /**
    * An array of UnprocessedIdentityId objects, each of which contains an ErrorCode and IdentityId.
    */
  @js.native
  trait UnprocessedIdentityId extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var IdentityId: js.UndefOr[IdentityId]
  }

  object UnprocessedIdentityId {
    @inline
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        IdentityId: js.UndefOr[IdentityId] = js.undefined
    ): UnprocessedIdentityId = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      IdentityId.foreach(__v => __obj.updateDynamic("IdentityId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UnprocessedIdentityId]
    }
  }

  @js.native
  trait UntagResourceInput extends js.Object {
    var ResourceArn: ARNString
    var TagKeys: IdentityPoolTagsListType
  }

  object UntagResourceInput {
    @inline
    def apply(
        ResourceArn: ARNString,
        TagKeys: IdentityPoolTagsListType
    ): UntagResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceInput]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    @inline
    def apply(
    ): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }
}
