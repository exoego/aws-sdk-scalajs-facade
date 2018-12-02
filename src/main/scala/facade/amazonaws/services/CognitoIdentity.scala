package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object cognitoidentity {
  type ARNString = String
  type AccessKeyString = String
  type AccountId = String
  type AmbiguousRoleResolutionType = String
  type ClaimName = String
  type ClaimValue = String
  type CognitoIdentityProviderClientId = String
  type CognitoIdentityProviderList = js.Array[CognitoIdentityProvider]
  type CognitoIdentityProviderName = String
  type CognitoIdentityProviderTokenCheck = Boolean
  type DateType = js.Date
  type DeveloperProviderName = String
  type DeveloperUserIdentifier = String
  type DeveloperUserIdentifierList = js.Array[DeveloperUserIdentifier]
  type ErrorCode = String
  type HideDisabled = Boolean
  type IdentitiesList = js.Array[IdentityDescription]
  type IdentityId = String
  type IdentityIdList = js.Array[IdentityId]
  type IdentityPoolId = String
  type IdentityPoolName = String
  type IdentityPoolUnauthenticated = Boolean
  type IdentityPoolsList = js.Array[IdentityPoolShortDescription]
  type IdentityProviderId = String
  type IdentityProviderName = String
  type IdentityProviderToken = String
  type IdentityProviders = js.Dictionary[IdentityProviderId]
  type LoginsList = js.Array[IdentityProviderName]
  type LoginsMap = js.Dictionary[IdentityProviderToken]
  type MappingRuleMatchType = String
  type MappingRulesList = js.Array[MappingRule]
  type OIDCProviderList = js.Array[ARNString]
  type OIDCToken = String
  type PaginationKey = String
  type QueryLimit = Int
  type RoleMappingMap = js.Dictionary[RoleMapping]
  type RoleMappingType = String
  type RoleType = String
  type RolesMap = js.Dictionary[ARNString]
  type SAMLProviderList = js.Array[ARNString]
  type SecretKeyString = String
  type SessionTokenString = String
  type TokenDuration = Double
  type UnprocessedIdentityIdList = js.Array[UnprocessedIdentityId]
}

package cognitoidentity {
  @js.native
  @JSImport("aws-sdk", "CognitoIdentity")
  class CognitoIdentity(config: AWSConfig) extends js.Object {
    def createIdentityPool(params: CreateIdentityPoolInput): Request[IdentityPool] = js.native
    def deleteIdentities(params: DeleteIdentitiesInput): Request[DeleteIdentitiesResponse] = js.native
    def deleteIdentityPool(params: DeleteIdentityPoolInput): Request[js.Object] = js.native
    def describeIdentity(params: DescribeIdentityInput): Request[IdentityDescription] = js.native
    def describeIdentityPool(params: DescribeIdentityPoolInput): Request[IdentityPool] = js.native
    def getCredentialsForIdentity(params: GetCredentialsForIdentityInput): Request[GetCredentialsForIdentityResponse] = js.native
    def getId(params: GetIdInput): Request[GetIdResponse] = js.native
    def getIdentityPoolRoles(params: GetIdentityPoolRolesInput): Request[GetIdentityPoolRolesResponse] = js.native
    def getOpenIdToken(params: GetOpenIdTokenInput): Request[GetOpenIdTokenResponse] = js.native
    def getOpenIdTokenForDeveloperIdentity(params: GetOpenIdTokenForDeveloperIdentityInput): Request[GetOpenIdTokenForDeveloperIdentityResponse] = js.native
    def listIdentities(params: ListIdentitiesInput): Request[ListIdentitiesResponse] = js.native
    def listIdentityPools(params: ListIdentityPoolsInput): Request[ListIdentityPoolsResponse] = js.native
    def lookupDeveloperIdentity(params: LookupDeveloperIdentityInput): Request[LookupDeveloperIdentityResponse] = js.native
    def mergeDeveloperIdentities(params: MergeDeveloperIdentitiesInput): Request[MergeDeveloperIdentitiesResponse] = js.native
    def setIdentityPoolRoles(params: SetIdentityPoolRolesInput): Request[js.Object] = js.native
    def unlinkDeveloperIdentity(params: UnlinkDeveloperIdentityInput): Request[js.Object] = js.native
    def unlinkIdentity(params: UnlinkIdentityInput): Request[js.Object] = js.native
    def updateIdentityPool(params: IdentityPool): Request[IdentityPool] = js.native
  }

  object AmbiguousRoleResolutionTypeEnum {
    val AuthenticatedRole = "AuthenticatedRole"
    val Deny = "Deny"

    val values = IndexedSeq(AuthenticatedRole, Deny)
  }

  /**
   * <p>A provider representing an Amazon Cognito Identity User Pool and its client ID.</p>
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
      ServerSideTokenCheck: js.UndefOr[CognitoIdentityProviderTokenCheck] = js.undefined): CognitoIdentityProvider = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientId" -> ClientId.map { x => x.asInstanceOf[js.Any] },
        "ProviderName" -> ProviderName.map { x => x.asInstanceOf[js.Any] },
        "ServerSideTokenCheck" -> ServerSideTokenCheck.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CognitoIdentityProvider]
    }
  }

  /**
   * <p>Thrown if there are parallel requests to modify a resource.</p>
   */
  @js.native
  trait ConcurrentModificationExceptionException extends js.Object {
    val message: String
  }

  /**
   * <p>Input to the CreateIdentityPool action.</p>
   */
  @js.native
  trait CreateIdentityPoolInput extends js.Object {
    var AllowUnauthenticatedIdentities: IdentityPoolUnauthenticated
    var IdentityPoolName: IdentityPoolName
    var CognitoIdentityProviders: js.UndefOr[CognitoIdentityProviderList]
    var DeveloperProviderName: js.UndefOr[DeveloperProviderName]
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
      OpenIdConnectProviderARNs: js.UndefOr[OIDCProviderList] = js.undefined,
      SamlProviderARNs: js.UndefOr[SAMLProviderList] = js.undefined,
      SupportedLoginProviders: js.UndefOr[IdentityProviders] = js.undefined): CreateIdentityPoolInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllowUnauthenticatedIdentities" -> AllowUnauthenticatedIdentities.asInstanceOf[js.Any],
        "IdentityPoolName" -> IdentityPoolName.asInstanceOf[js.Any],
        "CognitoIdentityProviders" -> CognitoIdentityProviders.map { x => x.asInstanceOf[js.Any] },
        "DeveloperProviderName" -> DeveloperProviderName.map { x => x.asInstanceOf[js.Any] },
        "OpenIdConnectProviderARNs" -> OpenIdConnectProviderARNs.map { x => x.asInstanceOf[js.Any] },
        "SamlProviderARNs" -> SamlProviderARNs.map { x => x.asInstanceOf[js.Any] },
        "SupportedLoginProviders" -> SupportedLoginProviders.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateIdentityPoolInput]
    }
  }

  /**
   * <p>Credentials for the provided identity ID.</p>
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
      SessionToken: js.UndefOr[SessionTokenString] = js.undefined): Credentials = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessKeyId" -> AccessKeyId.map { x => x.asInstanceOf[js.Any] },
        "Expiration" -> Expiration.map { x => x.asInstanceOf[js.Any] },
        "SecretKey" -> SecretKey.map { x => x.asInstanceOf[js.Any] },
        "SessionToken" -> SessionToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Credentials]
    }
  }

  /**
   * <p>Input to the <code>DeleteIdentities</code> action.</p>
   */
  @js.native
  trait DeleteIdentitiesInput extends js.Object {
    var IdentityIdsToDelete: IdentityIdList
  }

  object DeleteIdentitiesInput {
    def apply(
      IdentityIdsToDelete: IdentityIdList): DeleteIdentitiesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityIdsToDelete" -> IdentityIdsToDelete.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteIdentitiesInput]
    }
  }

  /**
   * <p>Returned in response to a successful <code>DeleteIdentities</code> operation.</p>
   */
  @js.native
  trait DeleteIdentitiesResponse extends js.Object {
    var UnprocessedIdentityIds: js.UndefOr[UnprocessedIdentityIdList]
  }

  object DeleteIdentitiesResponse {
    def apply(
      UnprocessedIdentityIds: js.UndefOr[UnprocessedIdentityIdList] = js.undefined): DeleteIdentitiesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UnprocessedIdentityIds" -> UnprocessedIdentityIds.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteIdentitiesResponse]
    }
  }

  /**
   * <p>Input to the DeleteIdentityPool action.</p>
   */
  @js.native
  trait DeleteIdentityPoolInput extends js.Object {
    var IdentityPoolId: IdentityPoolId
  }

  object DeleteIdentityPoolInput {
    def apply(
      IdentityPoolId: IdentityPoolId): DeleteIdentityPoolInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteIdentityPoolInput]
    }
  }

  /**
   * <p>Input to the <code>DescribeIdentity</code> action.</p>
   */
  @js.native
  trait DescribeIdentityInput extends js.Object {
    var IdentityId: IdentityId
  }

  object DescribeIdentityInput {
    def apply(
      IdentityId: IdentityId): DescribeIdentityInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityId" -> IdentityId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeIdentityInput]
    }
  }

  /**
   * <p>Input to the DescribeIdentityPool action.</p>
   */
  @js.native
  trait DescribeIdentityPoolInput extends js.Object {
    var IdentityPoolId: IdentityPoolId
  }

  object DescribeIdentityPoolInput {
    def apply(
      IdentityPoolId: IdentityPoolId): DescribeIdentityPoolInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeIdentityPoolInput]
    }
  }

  /**
   * <p>The provided developer user identifier is already registered with Cognito under a different identity ID.</p>
   */
  @js.native
  trait DeveloperUserAlreadyRegisteredExceptionException extends js.Object {
    val message: String
  }

  object ErrorCodeEnum {
    val AccessDenied = "AccessDenied"
    val InternalServerError = "InternalServerError"

    val values = IndexedSeq(AccessDenied, InternalServerError)
  }

  /**
   * <p>An exception thrown when a dependent service such as Facebook or Twitter is not responding</p>
   */
  @js.native
  trait ExternalServiceExceptionException extends js.Object {
    val message: String
  }

  /**
   * <p>Input to the <code>GetCredentialsForIdentity</code> action.</p>
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
      Logins: js.UndefOr[LoginsMap] = js.undefined): GetCredentialsForIdentityInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityId" -> IdentityId.asInstanceOf[js.Any],
        "CustomRoleArn" -> CustomRoleArn.map { x => x.asInstanceOf[js.Any] },
        "Logins" -> Logins.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCredentialsForIdentityInput]
    }
  }

  /**
   * <p>Returned in response to a successful <code>GetCredentialsForIdentity</code> operation.</p>
   */
  @js.native
  trait GetCredentialsForIdentityResponse extends js.Object {
    var Credentials: js.UndefOr[Credentials]
    var IdentityId: js.UndefOr[IdentityId]
  }

  object GetCredentialsForIdentityResponse {
    def apply(
      Credentials: js.UndefOr[Credentials] = js.undefined,
      IdentityId: js.UndefOr[IdentityId] = js.undefined): GetCredentialsForIdentityResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Credentials" -> Credentials.map { x => x.asInstanceOf[js.Any] },
        "IdentityId" -> IdentityId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCredentialsForIdentityResponse]
    }
  }

  /**
   * <p>Input to the GetId action.</p>
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
      Logins: js.UndefOr[LoginsMap] = js.undefined): GetIdInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any],
        "AccountId" -> AccountId.map { x => x.asInstanceOf[js.Any] },
        "Logins" -> Logins.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIdInput]
    }
  }

  /**
   * <p>Returned in response to a GetId request.</p>
   */
  @js.native
  trait GetIdResponse extends js.Object {
    var IdentityId: js.UndefOr[IdentityId]
  }

  object GetIdResponse {
    def apply(
      IdentityId: js.UndefOr[IdentityId] = js.undefined): GetIdResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityId" -> IdentityId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIdResponse]
    }
  }

  /**
   * <p>Input to the <code>GetIdentityPoolRoles</code> action.</p>
   */
  @js.native
  trait GetIdentityPoolRolesInput extends js.Object {
    var IdentityPoolId: IdentityPoolId
  }

  object GetIdentityPoolRolesInput {
    def apply(
      IdentityPoolId: IdentityPoolId): GetIdentityPoolRolesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIdentityPoolRolesInput]
    }
  }

  /**
   * <p>Returned in response to a successful <code>GetIdentityPoolRoles</code> operation.</p>
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
      Roles: js.UndefOr[RolesMap] = js.undefined): GetIdentityPoolRolesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolId" -> IdentityPoolId.map { x => x.asInstanceOf[js.Any] },
        "RoleMappings" -> RoleMappings.map { x => x.asInstanceOf[js.Any] },
        "Roles" -> Roles.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIdentityPoolRolesResponse]
    }
  }

  /**
   * <p>Input to the <code>GetOpenIdTokenForDeveloperIdentity</code> action.</p>
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
      TokenDuration: js.UndefOr[TokenDuration] = js.undefined): GetOpenIdTokenForDeveloperIdentityInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any],
        "Logins" -> Logins.asInstanceOf[js.Any],
        "IdentityId" -> IdentityId.map { x => x.asInstanceOf[js.Any] },
        "TokenDuration" -> TokenDuration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOpenIdTokenForDeveloperIdentityInput]
    }
  }

  /**
   * <p>Returned in response to a successful <code>GetOpenIdTokenForDeveloperIdentity</code> request.</p>
   */
  @js.native
  trait GetOpenIdTokenForDeveloperIdentityResponse extends js.Object {
    var IdentityId: js.UndefOr[IdentityId]
    var Token: js.UndefOr[OIDCToken]
  }

  object GetOpenIdTokenForDeveloperIdentityResponse {
    def apply(
      IdentityId: js.UndefOr[IdentityId] = js.undefined,
      Token: js.UndefOr[OIDCToken] = js.undefined): GetOpenIdTokenForDeveloperIdentityResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityId" -> IdentityId.map { x => x.asInstanceOf[js.Any] },
        "Token" -> Token.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOpenIdTokenForDeveloperIdentityResponse]
    }
  }

  /**
   * <p>Input to the GetOpenIdToken action.</p>
   */
  @js.native
  trait GetOpenIdTokenInput extends js.Object {
    var IdentityId: IdentityId
    var Logins: js.UndefOr[LoginsMap]
  }

  object GetOpenIdTokenInput {
    def apply(
      IdentityId: IdentityId,
      Logins: js.UndefOr[LoginsMap] = js.undefined): GetOpenIdTokenInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityId" -> IdentityId.asInstanceOf[js.Any],
        "Logins" -> Logins.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOpenIdTokenInput]
    }
  }

  /**
   * <p>Returned in response to a successful GetOpenIdToken request.</p>
   */
  @js.native
  trait GetOpenIdTokenResponse extends js.Object {
    var IdentityId: js.UndefOr[IdentityId]
    var Token: js.UndefOr[OIDCToken]
  }

  object GetOpenIdTokenResponse {
    def apply(
      IdentityId: js.UndefOr[IdentityId] = js.undefined,
      Token: js.UndefOr[OIDCToken] = js.undefined): GetOpenIdTokenResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityId" -> IdentityId.map { x => x.asInstanceOf[js.Any] },
        "Token" -> Token.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOpenIdTokenResponse]
    }
  }

  /**
   * <p>A description of the identity.</p>
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
      Logins: js.UndefOr[LoginsList] = js.undefined): IdentityDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationDate" -> CreationDate.map { x => x.asInstanceOf[js.Any] },
        "IdentityId" -> IdentityId.map { x => x.asInstanceOf[js.Any] },
        "LastModifiedDate" -> LastModifiedDate.map { x => x.asInstanceOf[js.Any] },
        "Logins" -> Logins.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IdentityDescription]
    }
  }

  /**
   * <p>An object representing an Amazon Cognito identity pool.</p>
   */
  @js.native
  trait IdentityPool extends js.Object {
    var AllowUnauthenticatedIdentities: IdentityPoolUnauthenticated
    var IdentityPoolId: IdentityPoolId
    var IdentityPoolName: IdentityPoolName
    var CognitoIdentityProviders: js.UndefOr[CognitoIdentityProviderList]
    var DeveloperProviderName: js.UndefOr[DeveloperProviderName]
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
      OpenIdConnectProviderARNs: js.UndefOr[OIDCProviderList] = js.undefined,
      SamlProviderARNs: js.UndefOr[SAMLProviderList] = js.undefined,
      SupportedLoginProviders: js.UndefOr[IdentityProviders] = js.undefined): IdentityPool = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AllowUnauthenticatedIdentities" -> AllowUnauthenticatedIdentities.asInstanceOf[js.Any],
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any],
        "IdentityPoolName" -> IdentityPoolName.asInstanceOf[js.Any],
        "CognitoIdentityProviders" -> CognitoIdentityProviders.map { x => x.asInstanceOf[js.Any] },
        "DeveloperProviderName" -> DeveloperProviderName.map { x => x.asInstanceOf[js.Any] },
        "OpenIdConnectProviderARNs" -> OpenIdConnectProviderARNs.map { x => x.asInstanceOf[js.Any] },
        "SamlProviderARNs" -> SamlProviderARNs.map { x => x.asInstanceOf[js.Any] },
        "SupportedLoginProviders" -> SupportedLoginProviders.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IdentityPool]
    }
  }

  /**
   * <p>A description of the identity pool.</p>
   */
  @js.native
  trait IdentityPoolShortDescription extends js.Object {
    var IdentityPoolId: js.UndefOr[IdentityPoolId]
    var IdentityPoolName: js.UndefOr[IdentityPoolName]
  }

  object IdentityPoolShortDescription {
    def apply(
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
      IdentityPoolName: js.UndefOr[IdentityPoolName] = js.undefined): IdentityPoolShortDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolId" -> IdentityPoolId.map { x => x.asInstanceOf[js.Any] },
        "IdentityPoolName" -> IdentityPoolName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IdentityPoolShortDescription]
    }
  }

  /**
   * <p>Thrown when the service encounters an error during processing the request.</p>
   */
  @js.native
  trait InternalErrorExceptionException extends js.Object {
    val message: String
  }

  /**
   * <p>Thrown if the identity pool has no role associated for the given auth type (auth/unauth) or if the AssumeRole fails.</p>
   */
  @js.native
  trait InvalidIdentityPoolConfigurationExceptionException extends js.Object {
    val message: String
  }

  /**
   * <p>Thrown for missing or bad input parameter(s).</p>
   */
  @js.native
  trait InvalidParameterExceptionException extends js.Object {
    val message: String
  }

  /**
   * <p>Thrown when the total number of user pools has exceeded a preset limit.</p>
   */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    val message: String
  }

  /**
   * <p>Input to the ListIdentities action.</p>
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
      NextToken: js.UndefOr[PaginationKey] = js.undefined): ListIdentitiesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.asInstanceOf[js.Any],
        "HideDisabled" -> HideDisabled.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIdentitiesInput]
    }
  }

  /**
   * <p>The response to a ListIdentities request.</p>
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
      NextToken: js.UndefOr[PaginationKey] = js.undefined): ListIdentitiesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Identities" -> Identities.map { x => x.asInstanceOf[js.Any] },
        "IdentityPoolId" -> IdentityPoolId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIdentitiesResponse]
    }
  }

  /**
   * <p>Input to the ListIdentityPools action.</p>
   */
  @js.native
  trait ListIdentityPoolsInput extends js.Object {
    var MaxResults: QueryLimit
    var NextToken: js.UndefOr[PaginationKey]
  }

  object ListIdentityPoolsInput {
    def apply(
      MaxResults: QueryLimit,
      NextToken: js.UndefOr[PaginationKey] = js.undefined): ListIdentityPoolsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIdentityPoolsInput]
    }
  }

  /**
   * <p>The result of a successful ListIdentityPools action.</p>
   */
  @js.native
  trait ListIdentityPoolsResponse extends js.Object {
    var IdentityPools: js.UndefOr[IdentityPoolsList]
    var NextToken: js.UndefOr[PaginationKey]
  }

  object ListIdentityPoolsResponse {
    def apply(
      IdentityPools: js.UndefOr[IdentityPoolsList] = js.undefined,
      NextToken: js.UndefOr[PaginationKey] = js.undefined): ListIdentityPoolsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPools" -> IdentityPools.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIdentityPoolsResponse]
    }
  }

  /**
   * <p>Input to the <code>LookupDeveloperIdentityInput</code> action.</p>
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
      NextToken: js.UndefOr[PaginationKey] = js.undefined): LookupDeveloperIdentityInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any],
        "DeveloperUserIdentifier" -> DeveloperUserIdentifier.map { x => x.asInstanceOf[js.Any] },
        "IdentityId" -> IdentityId.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LookupDeveloperIdentityInput]
    }
  }

  /**
   * <p>Returned in response to a successful <code>LookupDeveloperIdentity</code> action.</p>
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
      NextToken: js.UndefOr[PaginationKey] = js.undefined): LookupDeveloperIdentityResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeveloperUserIdentifierList" -> DeveloperUserIdentifierList.map { x => x.asInstanceOf[js.Any] },
        "IdentityId" -> IdentityId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LookupDeveloperIdentityResponse]
    }
  }

  /**
   * <p>A rule that maps a claim name, a claim value, and a match type to a role ARN.</p>
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
      Value: ClaimValue): MappingRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Claim" -> Claim.asInstanceOf[js.Any],
        "MatchType" -> MatchType.asInstanceOf[js.Any],
        "RoleARN" -> RoleARN.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MappingRule]
    }
  }

  object MappingRuleMatchTypeEnum {
    val Equals = "Equals"
    val Contains = "Contains"
    val StartsWith = "StartsWith"
    val NotEqual = "NotEqual"

    val values = IndexedSeq(Equals, Contains, StartsWith, NotEqual)
  }

  /**
   * <p>Input to the <code>MergeDeveloperIdentities</code> action.</p>
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
      SourceUserIdentifier: DeveloperUserIdentifier): MergeDeveloperIdentitiesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DestinationUserIdentifier" -> DestinationUserIdentifier.asInstanceOf[js.Any],
        "DeveloperProviderName" -> DeveloperProviderName.asInstanceOf[js.Any],
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any],
        "SourceUserIdentifier" -> SourceUserIdentifier.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MergeDeveloperIdentitiesInput]
    }
  }

  /**
   * <p>Returned in response to a successful <code>MergeDeveloperIdentities</code> action.</p>
   */
  @js.native
  trait MergeDeveloperIdentitiesResponse extends js.Object {
    var IdentityId: js.UndefOr[IdentityId]
  }

  object MergeDeveloperIdentitiesResponse {
    def apply(
      IdentityId: js.UndefOr[IdentityId] = js.undefined): MergeDeveloperIdentitiesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityId" -> IdentityId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MergeDeveloperIdentitiesResponse]
    }
  }

  /**
   * <p>Thrown when a user is not authorized to access the requested resource.</p>
   */
  @js.native
  trait NotAuthorizedExceptionException extends js.Object {
    val message: String
  }

  /**
   * <p>Thrown when a user tries to use a login which is already linked to another account.</p>
   */
  @js.native
  trait ResourceConflictExceptionException extends js.Object {
    val message: String
  }

  /**
   * <p>Thrown when the requested resource (for example, a dataset or record) does not exist.</p>
   */
  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {
    val message: String
  }

  /**
   * <p>A role mapping.</p>
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
      RulesConfiguration: js.UndefOr[RulesConfigurationType] = js.undefined): RoleMapping = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.asInstanceOf[js.Any],
        "AmbiguousRoleResolution" -> AmbiguousRoleResolution.map { x => x.asInstanceOf[js.Any] },
        "RulesConfiguration" -> RulesConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RoleMapping]
    }
  }

  object RoleMappingTypeEnum {
    val Token = "Token"
    val Rules = "Rules"

    val values = IndexedSeq(Token, Rules)
  }

  /**
   * <p>A container for rules.</p>
   */
  @js.native
  trait RulesConfigurationType extends js.Object {
    var Rules: MappingRulesList
  }

  object RulesConfigurationType {
    def apply(
      Rules: MappingRulesList): RulesConfigurationType = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Rules" -> Rules.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RulesConfigurationType]
    }
  }

  /**
   * <p>Input to the <code>SetIdentityPoolRoles</code> action.</p>
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
      RoleMappings: js.UndefOr[RoleMappingMap] = js.undefined): SetIdentityPoolRolesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any],
        "Roles" -> Roles.asInstanceOf[js.Any],
        "RoleMappings" -> RoleMappings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetIdentityPoolRolesInput]
    }
  }

  /**
   * <p>Thrown when a request is throttled.</p>
   */
  @js.native
  trait TooManyRequestsExceptionException extends js.Object {
    val message: String
  }

  /**
   * <p>Input to the <code>UnlinkDeveloperIdentity</code> action.</p>
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
      IdentityPoolId: IdentityPoolId): UnlinkDeveloperIdentityInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeveloperProviderName" -> DeveloperProviderName.asInstanceOf[js.Any],
        "DeveloperUserIdentifier" -> DeveloperUserIdentifier.asInstanceOf[js.Any],
        "IdentityId" -> IdentityId.asInstanceOf[js.Any],
        "IdentityPoolId" -> IdentityPoolId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnlinkDeveloperIdentityInput]
    }
  }

  /**
   * <p>Input to the UnlinkIdentity action.</p>
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
      LoginsToRemove: LoginsList): UnlinkIdentityInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdentityId" -> IdentityId.asInstanceOf[js.Any],
        "Logins" -> Logins.asInstanceOf[js.Any],
        "LoginsToRemove" -> LoginsToRemove.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnlinkIdentityInput]
    }
  }

  /**
   * <p>An array of UnprocessedIdentityId objects, each of which contains an ErrorCode and IdentityId.</p>
   */
  @js.native
  trait UnprocessedIdentityId extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var IdentityId: js.UndefOr[IdentityId]
  }

  object UnprocessedIdentityId {
    def apply(
      ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
      IdentityId: js.UndefOr[IdentityId] = js.undefined): UnprocessedIdentityId = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "IdentityId" -> IdentityId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnprocessedIdentityId]
    }
  }
}
