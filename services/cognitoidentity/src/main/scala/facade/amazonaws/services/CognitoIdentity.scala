package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object cognitoidentity {
  type ARNString                         = String
  type AccessKeyString                   = String
  type AccountId                         = String
  type AmbiguousRoleResolutionType       = String
  type ClaimName                         = String
  type ClaimValue                        = String
  type CognitoIdentityProviderClientId   = String
  type CognitoIdentityProviderList       = js.Array[CognitoIdentityProvider]
  type CognitoIdentityProviderName       = String
  type CognitoIdentityProviderTokenCheck = Boolean
  type DateType                          = js.Date
  type DeveloperProviderName             = String
  type DeveloperUserIdentifier           = String
  type DeveloperUserIdentifierList       = js.Array[DeveloperUserIdentifier]
  type ErrorCode                         = String
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
  type MappingRuleMatchType              = String
  type MappingRulesList                  = js.Array[MappingRule]
  type OIDCProviderList                  = js.Array[ARNString]
  type OIDCToken                         = String
  type PaginationKey                     = String
  type QueryLimit                        = Int
  type RoleMappingMap                    = js.Dictionary[RoleMapping]
  type RoleMappingType                   = String
  type RoleType                          = String
  type RolesMap                          = js.Dictionary[ARNString]
  type SAMLProviderList                  = js.Array[ARNString]
  type SecretKeyString                   = String
  type SessionTokenString                = String
  type TagKeysType                       = String
  type TagValueType                      = String
  type TokenDuration                     = Double
  type UnprocessedIdentityIdList         = js.Array[UnprocessedIdentityId]

  implicit final class CognitoIdentityOps(val service: CognitoIdentity) extends AnyVal {

    def createIdentityPoolFuture(params: CreateIdentityPoolInput): Future[IdentityPool] =
      service.createIdentityPool(params).promise.toFuture
    def deleteIdentitiesFuture(params: DeleteIdentitiesInput): Future[DeleteIdentitiesResponse] =
      service.deleteIdentities(params).promise.toFuture
    def deleteIdentityPoolFuture(params: DeleteIdentityPoolInput): Future[js.Object] =
      service.deleteIdentityPool(params).promise.toFuture
    def describeIdentityFuture(params: DescribeIdentityInput): Future[IdentityDescription] =
      service.describeIdentity(params).promise.toFuture
    def describeIdentityPoolFuture(params: DescribeIdentityPoolInput): Future[IdentityPool] =
      service.describeIdentityPool(params).promise.toFuture
    def getCredentialsForIdentityFuture(
        params: GetCredentialsForIdentityInput
    ): Future[GetCredentialsForIdentityResponse]               = service.getCredentialsForIdentity(params).promise.toFuture
    def getIdFuture(params: GetIdInput): Future[GetIdResponse] = service.getId(params).promise.toFuture
    def getIdentityPoolRolesFuture(params: GetIdentityPoolRolesInput): Future[GetIdentityPoolRolesResponse] =
      service.getIdentityPoolRoles(params).promise.toFuture
    def getOpenIdTokenForDeveloperIdentityFuture(
        params: GetOpenIdTokenForDeveloperIdentityInput
    ): Future[GetOpenIdTokenForDeveloperIdentityResponse] =
      service.getOpenIdTokenForDeveloperIdentity(params).promise.toFuture
    def getOpenIdTokenFuture(params: GetOpenIdTokenInput): Future[GetOpenIdTokenResponse] =
      service.getOpenIdToken(params).promise.toFuture
    def listIdentitiesFuture(params: ListIdentitiesInput): Future[ListIdentitiesResponse] =
      service.listIdentities(params).promise.toFuture
    def listIdentityPoolsFuture(params: ListIdentityPoolsInput): Future[ListIdentityPoolsResponse] =
      service.listIdentityPools(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    def lookupDeveloperIdentityFuture(params: LookupDeveloperIdentityInput): Future[LookupDeveloperIdentityResponse] =
      service.lookupDeveloperIdentity(params).promise.toFuture
    def mergeDeveloperIdentitiesFuture(
        params: MergeDeveloperIdentitiesInput
    ): Future[MergeDeveloperIdentitiesResponse] = service.mergeDeveloperIdentities(params).promise.toFuture
    def setIdentityPoolRolesFuture(params: SetIdentityPoolRolesInput): Future[js.Object] =
      service.setIdentityPoolRoles(params).promise.toFuture
    def tagResourceFuture(params: TagResourceInput): Future[TagResourceResponse] =
      service.tagResource(params).promise.toFuture
    def unlinkDeveloperIdentityFuture(params: UnlinkDeveloperIdentityInput): Future[js.Object] =
      service.unlinkDeveloperIdentity(params).promise.toFuture
    def unlinkIdentityFuture(params: UnlinkIdentityInput): Future[js.Object] =
      service.unlinkIdentity(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceInput): Future[UntagResourceResponse] =
      service.untagResource(params).promise.toFuture
    def updateIdentityPoolFuture(params: IdentityPool): Future[IdentityPool] =
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

  object AmbiguousRoleResolutionTypeEnum {
    val AuthenticatedRole = "AuthenticatedRole"
    val Deny              = "Deny"

    val values = IndexedSeq(AuthenticatedRole, Deny)
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
    def apply(
        ClientId: js.UndefOr[CognitoIdentityProviderClientId] = js.undefined,
        ProviderName: js.UndefOr[CognitoIdentityProviderName] = js.undefined,
        ServerSideTokenCheck: js.UndefOr[CognitoIdentityProviderTokenCheck] = js.undefined
    ): CognitoIdentityProvider = {
      val __obj = js.Dictionary.empty[js.Any]
      ClientId.foreach(__v => __obj.update("ClientId", __v.asInstanceOf[js.Any]))
      ProviderName.foreach(__v => __obj.update("ProviderName", __v.asInstanceOf[js.Any]))
      ServerSideTokenCheck.foreach(__v => __obj.update("ServerSideTokenCheck", __v.asInstanceOf[js.Any]))
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
    var CognitoIdentityProviders: js.UndefOr[CognitoIdentityProviderList]
    var DeveloperProviderName: js.UndefOr[DeveloperProviderName]
    var IdentityPoolTags: js.UndefOr[IdentityPoolTagsType]
    var OpenIdConnectProviderARNs: js.UndefOr[OIDCProviderList]
    var SamlProviderARNs: js.UndefOr[SAMLProviderList]
    var SupportedLoginProviders: js.UndefOr[IdentityProviders]
  }

  object CreateIdentityPoolInput {
    def apply(
        AllowUnauthenticatedIdentities: IdentityPoolUnauthenticated,
        IdentityPoolName: IdentityPoolName,
        CognitoIdentityProviders: js.UndefOr[CognitoIdentityProviderList] = js.undefined,
        DeveloperProviderName: js.UndefOr[DeveloperProviderName] = js.undefined,
        IdentityPoolTags: js.UndefOr[IdentityPoolTagsType] = js.undefined,
        OpenIdConnectProviderARNs: js.UndefOr[OIDCProviderList] = js.undefined,
        SamlProviderARNs: js.UndefOr[SAMLProviderList] = js.undefined,
        SupportedLoginProviders: js.UndefOr[IdentityProviders] = js.undefined
    ): CreateIdentityPoolInput = {
      val __obj = js.Dictionary[js.Any](
        "AllowUnauthenticatedIdentities" -> AllowUnauthenticatedIdentities.asInstanceOf[js.Any],
        "IdentityPoolName"               -> IdentityPoolName.asInstanceOf[js.Any]
      )

      CognitoIdentityProviders.foreach(__v => __obj.update("CognitoIdentityProviders", __v.asInstanceOf[js.Any]))
      DeveloperProviderName.foreach(__v => __obj.update("DeveloperProviderName", __v.asInstanceOf[js.Any]))
      IdentityPoolTags.foreach(__v => __obj.update("IdentityPoolTags", __v.asInstanceOf[js.Any]))
      OpenIdConnectProviderARNs.foreach(__v => __obj.update("OpenIdConnectProviderARNs", __v.asInstanceOf[js.Any]))
      SamlProviderARNs.foreach(__v => __obj.update("SamlProviderARNs", __v.asInstanceOf[js.Any]))
      SupportedLoginProviders.foreach(__v => __obj.update("SupportedLoginProviders", __v.asInstanceOf[js.Any]))
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
    def apply(
        AccessKeyId: js.UndefOr[AccessKeyString] = js.undefined,
        Expiration: js.UndefOr[DateType] = js.undefined,
        SecretKey: js.UndefOr[SecretKeyString] = js.undefined,
        SessionToken: js.UndefOr[SessionTokenString] = js.undefined
    ): Credentials = {
      val __obj = js.Dictionary.empty[js.Any]
      AccessKeyId.foreach(__v => __obj.update("AccessKeyId", __v.asInstanceOf[js.Any]))
      Expiration.foreach(__v => __obj.update("Expiration", __v.asInstanceOf[js.Any]))
      SecretKey.foreach(__v => __obj.update("SecretKey", __v.asInstanceOf[js.Any]))
      SessionToken.foreach(__v => __obj.update("SessionToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        IdentityIdsToDelete: IdentityIdList
    ): DeleteIdentitiesInput = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        UnprocessedIdentityIds: js.UndefOr[UnprocessedIdentityIdList] = js.undefined
    ): DeleteIdentitiesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      UnprocessedIdentityIds.foreach(__v => __obj.update("UnprocessedIdentityIds", __v.asInstanceOf[js.Any]))
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
    def apply(
        IdentityPoolId: IdentityPoolId
    ): DeleteIdentityPoolInput = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        IdentityId: IdentityId
    ): DescribeIdentityInput = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        IdentityPoolId: IdentityPoolId
    ): DescribeIdentityPoolInput = {
      val __obj = js.Dictionary[js.Any](
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeIdentityPoolInput]
    }
  }

  object ErrorCodeEnum {
    val AccessDenied        = "AccessDenied"
    val InternalServerError = "InternalServerError"

    val values = IndexedSeq(AccessDenied, InternalServerError)
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
    def apply(
        IdentityId: IdentityId,
        CustomRoleArn: js.UndefOr[ARNString] = js.undefined,
        Logins: js.UndefOr[LoginsMap] = js.undefined
    ): GetCredentialsForIdentityInput = {
      val __obj = js.Dictionary[js.Any](
        "IdentityId" -> IdentityId.asInstanceOf[js.Any]
      )

      CustomRoleArn.foreach(__v => __obj.update("CustomRoleArn", __v.asInstanceOf[js.Any]))
      Logins.foreach(__v => __obj.update("Logins", __v.asInstanceOf[js.Any]))
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
    def apply(
        Credentials: js.UndefOr[Credentials] = js.undefined,
        IdentityId: js.UndefOr[IdentityId] = js.undefined
    ): GetCredentialsForIdentityResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Credentials.foreach(__v => __obj.update("Credentials", __v.asInstanceOf[js.Any]))
      IdentityId.foreach(__v => __obj.update("IdentityId", __v.asInstanceOf[js.Any]))
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
    def apply(
        IdentityPoolId: IdentityPoolId,
        AccountId: js.UndefOr[AccountId] = js.undefined,
        Logins: js.UndefOr[LoginsMap] = js.undefined
    ): GetIdInput = {
      val __obj = js.Dictionary[js.Any](
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]
      )

      AccountId.foreach(__v => __obj.update("AccountId", __v.asInstanceOf[js.Any]))
      Logins.foreach(__v => __obj.update("Logins", __v.asInstanceOf[js.Any]))
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
    def apply(
        IdentityId: js.UndefOr[IdentityId] = js.undefined
    ): GetIdResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      IdentityId.foreach(__v => __obj.update("IdentityId", __v.asInstanceOf[js.Any]))
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
    def apply(
        IdentityPoolId: IdentityPoolId
    ): GetIdentityPoolRolesInput = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
        RoleMappings: js.UndefOr[RoleMappingMap] = js.undefined,
        Roles: js.UndefOr[RolesMap] = js.undefined
    ): GetIdentityPoolRolesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      IdentityPoolId.foreach(__v => __obj.update("IdentityPoolId", __v.asInstanceOf[js.Any]))
      RoleMappings.foreach(__v => __obj.update("RoleMappings", __v.asInstanceOf[js.Any]))
      Roles.foreach(__v => __obj.update("Roles", __v.asInstanceOf[js.Any]))
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
    def apply(
        IdentityPoolId: IdentityPoolId,
        Logins: LoginsMap,
        IdentityId: js.UndefOr[IdentityId] = js.undefined,
        TokenDuration: js.UndefOr[TokenDuration] = js.undefined
    ): GetOpenIdTokenForDeveloperIdentityInput = {
      val __obj = js.Dictionary[js.Any](
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any],
        "Logins"         -> Logins.asInstanceOf[js.Any]
      )

      IdentityId.foreach(__v => __obj.update("IdentityId", __v.asInstanceOf[js.Any]))
      TokenDuration.foreach(__v => __obj.update("TokenDuration", __v.asInstanceOf[js.Any]))
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
    def apply(
        IdentityId: js.UndefOr[IdentityId] = js.undefined,
        Token: js.UndefOr[OIDCToken] = js.undefined
    ): GetOpenIdTokenForDeveloperIdentityResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      IdentityId.foreach(__v => __obj.update("IdentityId", __v.asInstanceOf[js.Any]))
      Token.foreach(__v => __obj.update("Token", __v.asInstanceOf[js.Any]))
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
    def apply(
        IdentityId: IdentityId,
        Logins: js.UndefOr[LoginsMap] = js.undefined
    ): GetOpenIdTokenInput = {
      val __obj = js.Dictionary[js.Any](
        "IdentityId" -> IdentityId.asInstanceOf[js.Any]
      )

      Logins.foreach(__v => __obj.update("Logins", __v.asInstanceOf[js.Any]))
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
    def apply(
        IdentityId: js.UndefOr[IdentityId] = js.undefined,
        Token: js.UndefOr[OIDCToken] = js.undefined
    ): GetOpenIdTokenResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      IdentityId.foreach(__v => __obj.update("IdentityId", __v.asInstanceOf[js.Any]))
      Token.foreach(__v => __obj.update("Token", __v.asInstanceOf[js.Any]))
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
    def apply(
        CreationDate: js.UndefOr[DateType] = js.undefined,
        IdentityId: js.UndefOr[IdentityId] = js.undefined,
        LastModifiedDate: js.UndefOr[DateType] = js.undefined,
        Logins: js.UndefOr[LoginsList] = js.undefined
    ): IdentityDescription = {
      val __obj = js.Dictionary.empty[js.Any]
      CreationDate.foreach(__v => __obj.update("CreationDate", __v.asInstanceOf[js.Any]))
      IdentityId.foreach(__v => __obj.update("IdentityId", __v.asInstanceOf[js.Any]))
      LastModifiedDate.foreach(__v => __obj.update("LastModifiedDate", __v.asInstanceOf[js.Any]))
      Logins.foreach(__v => __obj.update("Logins", __v.asInstanceOf[js.Any]))
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
    var CognitoIdentityProviders: js.UndefOr[CognitoIdentityProviderList]
    var DeveloperProviderName: js.UndefOr[DeveloperProviderName]
    var IdentityPoolTags: js.UndefOr[IdentityPoolTagsType]
    var OpenIdConnectProviderARNs: js.UndefOr[OIDCProviderList]
    var SamlProviderARNs: js.UndefOr[SAMLProviderList]
    var SupportedLoginProviders: js.UndefOr[IdentityProviders]
  }

  object IdentityPool {
    def apply(
        AllowUnauthenticatedIdentities: IdentityPoolUnauthenticated,
        IdentityPoolId: IdentityPoolId,
        IdentityPoolName: IdentityPoolName,
        CognitoIdentityProviders: js.UndefOr[CognitoIdentityProviderList] = js.undefined,
        DeveloperProviderName: js.UndefOr[DeveloperProviderName] = js.undefined,
        IdentityPoolTags: js.UndefOr[IdentityPoolTagsType] = js.undefined,
        OpenIdConnectProviderARNs: js.UndefOr[OIDCProviderList] = js.undefined,
        SamlProviderARNs: js.UndefOr[SAMLProviderList] = js.undefined,
        SupportedLoginProviders: js.UndefOr[IdentityProviders] = js.undefined
    ): IdentityPool = {
      val __obj = js.Dictionary[js.Any](
        "AllowUnauthenticatedIdentities" -> AllowUnauthenticatedIdentities.asInstanceOf[js.Any],
        "IdentityPoolId"                 -> IdentityPoolId.asInstanceOf[js.Any],
        "IdentityPoolName"               -> IdentityPoolName.asInstanceOf[js.Any]
      )

      CognitoIdentityProviders.foreach(__v => __obj.update("CognitoIdentityProviders", __v.asInstanceOf[js.Any]))
      DeveloperProviderName.foreach(__v => __obj.update("DeveloperProviderName", __v.asInstanceOf[js.Any]))
      IdentityPoolTags.foreach(__v => __obj.update("IdentityPoolTags", __v.asInstanceOf[js.Any]))
      OpenIdConnectProviderARNs.foreach(__v => __obj.update("OpenIdConnectProviderARNs", __v.asInstanceOf[js.Any]))
      SamlProviderARNs.foreach(__v => __obj.update("SamlProviderARNs", __v.asInstanceOf[js.Any]))
      SupportedLoginProviders.foreach(__v => __obj.update("SupportedLoginProviders", __v.asInstanceOf[js.Any]))
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
    def apply(
        IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
        IdentityPoolName: js.UndefOr[IdentityPoolName] = js.undefined
    ): IdentityPoolShortDescription = {
      val __obj = js.Dictionary.empty[js.Any]
      IdentityPoolId.foreach(__v => __obj.update("IdentityPoolId", __v.asInstanceOf[js.Any]))
      IdentityPoolName.foreach(__v => __obj.update("IdentityPoolName", __v.asInstanceOf[js.Any]))
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
    def apply(
        IdentityPoolId: IdentityPoolId,
        MaxResults: QueryLimit,
        HideDisabled: js.UndefOr[HideDisabled] = js.undefined,
        NextToken: js.UndefOr[PaginationKey] = js.undefined
    ): ListIdentitiesInput = {
      val __obj = js.Dictionary[js.Any](
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any],
        "MaxResults"     -> MaxResults.asInstanceOf[js.Any]
      )

      HideDisabled.foreach(__v => __obj.update("HideDisabled", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        Identities: js.UndefOr[IdentitiesList] = js.undefined,
        IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
        NextToken: js.UndefOr[PaginationKey] = js.undefined
    ): ListIdentitiesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Identities.foreach(__v => __obj.update("Identities", __v.asInstanceOf[js.Any]))
      IdentityPoolId.foreach(__v => __obj.update("IdentityPoolId", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        MaxResults: QueryLimit,
        NextToken: js.UndefOr[PaginationKey] = js.undefined
    ): ListIdentityPoolsInput = {
      val __obj = js.Dictionary[js.Any](
        "MaxResults" -> MaxResults.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        IdentityPools: js.UndefOr[IdentityPoolsList] = js.undefined,
        NextToken: js.UndefOr[PaginationKey] = js.undefined
    ): ListIdentityPoolsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      IdentityPools.foreach(__v => __obj.update("IdentityPools", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIdentityPoolsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceInput extends js.Object {
    var ResourceArn: ARNString
  }

  object ListTagsForResourceInput {
    def apply(
        ResourceArn: ARNString
    ): ListTagsForResourceInput = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        Tags: js.UndefOr[IdentityPoolTagsType] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
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
    def apply(
        IdentityPoolId: IdentityPoolId,
        DeveloperUserIdentifier: js.UndefOr[DeveloperUserIdentifier] = js.undefined,
        IdentityId: js.UndefOr[IdentityId] = js.undefined,
        MaxResults: js.UndefOr[QueryLimit] = js.undefined,
        NextToken: js.UndefOr[PaginationKey] = js.undefined
    ): LookupDeveloperIdentityInput = {
      val __obj = js.Dictionary[js.Any](
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]
      )

      DeveloperUserIdentifier.foreach(__v => __obj.update("DeveloperUserIdentifier", __v.asInstanceOf[js.Any]))
      IdentityId.foreach(__v => __obj.update("IdentityId", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        DeveloperUserIdentifierList: js.UndefOr[DeveloperUserIdentifierList] = js.undefined,
        IdentityId: js.UndefOr[IdentityId] = js.undefined,
        NextToken: js.UndefOr[PaginationKey] = js.undefined
    ): LookupDeveloperIdentityResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      DeveloperUserIdentifierList.foreach(__v => __obj.update("DeveloperUserIdentifierList", __v.asInstanceOf[js.Any]))
      IdentityId.foreach(__v => __obj.update("IdentityId", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        Claim: ClaimName,
        MatchType: MappingRuleMatchType,
        RoleARN: ARNString,
        Value: ClaimValue
    ): MappingRule = {
      val __obj = js.Dictionary[js.Any](
        "Claim"     -> Claim.asInstanceOf[js.Any],
        "MatchType" -> MatchType.asInstanceOf[js.Any],
        "RoleARN"   -> RoleARN.asInstanceOf[js.Any],
        "Value"     -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[MappingRule]
    }
  }

  object MappingRuleMatchTypeEnum {
    val Equals     = "Equals"
    val Contains   = "Contains"
    val StartsWith = "StartsWith"
    val NotEqual   = "NotEqual"

    val values = IndexedSeq(Equals, Contains, StartsWith, NotEqual)
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
    def apply(
        DestinationUserIdentifier: DeveloperUserIdentifier,
        DeveloperProviderName: DeveloperProviderName,
        IdentityPoolId: IdentityPoolId,
        SourceUserIdentifier: DeveloperUserIdentifier
    ): MergeDeveloperIdentitiesInput = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        IdentityId: js.UndefOr[IdentityId] = js.undefined
    ): MergeDeveloperIdentitiesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      IdentityId.foreach(__v => __obj.update("IdentityId", __v.asInstanceOf[js.Any]))
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
    def apply(
        Type: RoleMappingType,
        AmbiguousRoleResolution: js.UndefOr[AmbiguousRoleResolutionType] = js.undefined,
        RulesConfiguration: js.UndefOr[RulesConfigurationType] = js.undefined
    ): RoleMapping = {
      val __obj = js.Dictionary[js.Any](
        "Type" -> Type.asInstanceOf[js.Any]
      )

      AmbiguousRoleResolution.foreach(__v => __obj.update("AmbiguousRoleResolution", __v.asInstanceOf[js.Any]))
      RulesConfiguration.foreach(__v => __obj.update("RulesConfiguration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RoleMapping]
    }
  }

  object RoleMappingTypeEnum {
    val Token = "Token"
    val Rules = "Rules"

    val values = IndexedSeq(Token, Rules)
  }

  /**
    * A container for rules.
    */
  @js.native
  trait RulesConfigurationType extends js.Object {
    var Rules: MappingRulesList
  }

  object RulesConfigurationType {
    def apply(
        Rules: MappingRulesList
    ): RulesConfigurationType = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        IdentityPoolId: IdentityPoolId,
        Roles: RolesMap,
        RoleMappings: js.UndefOr[RoleMappingMap] = js.undefined
    ): SetIdentityPoolRolesInput = {
      val __obj = js.Dictionary[js.Any](
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any],
        "Roles"          -> Roles.asInstanceOf[js.Any]
      )

      RoleMappings.foreach(__v => __obj.update("RoleMappings", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SetIdentityPoolRolesInput]
    }
  }

  @js.native
  trait TagResourceInput extends js.Object {
    var ResourceArn: ARNString
    var Tags: js.UndefOr[IdentityPoolTagsType]
  }

  object TagResourceInput {
    def apply(
        ResourceArn: ARNString,
        Tags: js.UndefOr[IdentityPoolTagsType] = js.undefined
    ): TagResourceInput = {
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagResourceInput]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    def apply(
        ): TagResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

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
    def apply(
        DeveloperProviderName: DeveloperProviderName,
        DeveloperUserIdentifier: DeveloperUserIdentifier,
        IdentityId: IdentityId,
        IdentityPoolId: IdentityPoolId
    ): UnlinkDeveloperIdentityInput = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        IdentityId: IdentityId,
        Logins: LoginsMap,
        LoginsToRemove: LoginsList
    ): UnlinkIdentityInput = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        IdentityId: js.UndefOr[IdentityId] = js.undefined
    ): UnprocessedIdentityId = {
      val __obj = js.Dictionary.empty[js.Any]
      ErrorCode.foreach(__v => __obj.update("ErrorCode", __v.asInstanceOf[js.Any]))
      IdentityId.foreach(__v => __obj.update("IdentityId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UnprocessedIdentityId]
    }
  }

  @js.native
  trait UntagResourceInput extends js.Object {
    var ResourceArn: ARNString
    var TagKeys: js.UndefOr[IdentityPoolTagsListType]
  }

  object UntagResourceInput {
    def apply(
        ResourceArn: ARNString,
        TagKeys: js.UndefOr[IdentityPoolTagsListType] = js.undefined
    ): UntagResourceInput = {
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      TagKeys.foreach(__v => __obj.update("TagKeys", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UntagResourceInput]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    def apply(
        ): UntagResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }
}
