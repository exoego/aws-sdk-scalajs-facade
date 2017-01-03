package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object `cognito-identity` {
  type ARNString = String
  type AccessKeyString = String
  type AccountId = String
  type AmbiguousRoleResolutionType = String
  type ClaimName = String
  type ClaimValue = String
  type CognitoIdentityProviderClientId = String
  type CognitoIdentityProviderList = js.Array[CognitoIdentityProvider]
  type CognitoIdentityProviderName = String
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
  type QueryLimit = Integer
  type RoleMappingMap = js.Dictionary[RoleMapping]
  type RoleMappingType = String
  type RoleType = String
  type RolesMap = js.Dictionary[ARNString]
  type SAMLProviderList = js.Array[ARNString]
  type SecretKeyString = String
  type SessionTokenString = String
  type TokenDuration = Long
  type UnprocessedIdentityIdList = js.Array[UnprocessedIdentityId]
}

package `cognito-identity` {
  @js.native
  trait `cognito-identity` extends js.Object {
    def createIdentityPool(params: CreateIdentityPoolInput, callback: Callback[IdentityPool]): Unit = js.native
    def createIdentityPool(params: CreateIdentityPoolInput): Request[IdentityPool] = js.native
    def deleteIdentities(params: DeleteIdentitiesInput, callback: Callback[DeleteIdentitiesResponse]): Unit = js.native
    def deleteIdentities(params: DeleteIdentitiesInput): Request[DeleteIdentitiesResponse] = js.native
    def deleteIdentityPool(params: DeleteIdentityPoolInput, callback: Callback[js.Object]): Unit = js.native
    def deleteIdentityPool(params: DeleteIdentityPoolInput): Request[js.Object] = js.native
    def describeIdentity(params: DescribeIdentityInput, callback: Callback[IdentityDescription]): Unit = js.native
    def describeIdentity(params: DescribeIdentityInput): Request[IdentityDescription] = js.native
    def describeIdentityPool(params: DescribeIdentityPoolInput, callback: Callback[IdentityPool]): Unit = js.native
    def describeIdentityPool(params: DescribeIdentityPoolInput): Request[IdentityPool] = js.native
    def getCredentialsForIdentity(params: GetCredentialsForIdentityInput, callback: Callback[GetCredentialsForIdentityResponse]): Unit = js.native
    def getCredentialsForIdentity(params: GetCredentialsForIdentityInput): Request[GetCredentialsForIdentityResponse] = js.native
    def getId(params: GetIdInput, callback: Callback[GetIdResponse]): Unit = js.native
    def getId(params: GetIdInput): Request[GetIdResponse] = js.native
    def getIdentityPoolRoles(params: GetIdentityPoolRolesInput, callback: Callback[GetIdentityPoolRolesResponse]): Unit = js.native
    def getIdentityPoolRoles(params: GetIdentityPoolRolesInput): Request[GetIdentityPoolRolesResponse] = js.native
    def getOpenIdToken(params: GetOpenIdTokenInput, callback: Callback[GetOpenIdTokenResponse]): Unit = js.native
    def getOpenIdToken(params: GetOpenIdTokenInput): Request[GetOpenIdTokenResponse] = js.native
    def getOpenIdTokenForDeveloperIdentity(params: GetOpenIdTokenForDeveloperIdentityInput, callback: Callback[GetOpenIdTokenForDeveloperIdentityResponse]): Unit = js.native
    def getOpenIdTokenForDeveloperIdentity(params: GetOpenIdTokenForDeveloperIdentityInput): Request[GetOpenIdTokenForDeveloperIdentityResponse] = js.native
    def listIdentities(params: ListIdentitiesInput, callback: Callback[ListIdentitiesResponse]): Unit = js.native
    def listIdentities(params: ListIdentitiesInput): Request[ListIdentitiesResponse] = js.native
    def listIdentityPools(params: ListIdentityPoolsInput, callback: Callback[ListIdentityPoolsResponse]): Unit = js.native
    def listIdentityPools(params: ListIdentityPoolsInput): Request[ListIdentityPoolsResponse] = js.native
    def lookupDeveloperIdentity(params: LookupDeveloperIdentityInput, callback: Callback[LookupDeveloperIdentityResponse]): Unit = js.native
    def lookupDeveloperIdentity(params: LookupDeveloperIdentityInput): Request[LookupDeveloperIdentityResponse] = js.native
    def mergeDeveloperIdentities(params: MergeDeveloperIdentitiesInput, callback: Callback[MergeDeveloperIdentitiesResponse]): Unit = js.native
    def mergeDeveloperIdentities(params: MergeDeveloperIdentitiesInput): Request[MergeDeveloperIdentitiesResponse] = js.native
    def setIdentityPoolRoles(params: SetIdentityPoolRolesInput, callback: Callback[js.Object]): Unit = js.native
    def setIdentityPoolRoles(params: SetIdentityPoolRolesInput): Request[js.Object] = js.native
    def unlinkDeveloperIdentity(params: UnlinkDeveloperIdentityInput, callback: Callback[js.Object]): Unit = js.native
    def unlinkDeveloperIdentity(params: UnlinkDeveloperIdentityInput): Request[js.Object] = js.native
    def unlinkIdentity(params: UnlinkIdentityInput, callback: Callback[js.Object]): Unit = js.native
    def unlinkIdentity(params: UnlinkIdentityInput): Request[js.Object] = js.native
    def updateIdentityPool(params: IdentityPool, callback: Callback[IdentityPool]): Unit = js.native
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
    var ProviderName: CognitoIdentityProviderName
    var ClientId: CognitoIdentityProviderClientId
  }

  object CognitoIdentityProvider {
    def apply(
      ProviderName: js.UndefOr[CognitoIdentityProviderName] = js.undefined,
      ClientId: js.UndefOr[CognitoIdentityProviderClientId] = js.undefined
    ): CognitoIdentityProvider = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ProviderName" -> ProviderName.map { x => x: js.Any }),
        ("ClientId" -> ClientId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CognitoIdentityProvider]
    }
  }

  /**
   * <p>Thrown if there are parallel requests to modify a resource.</p>
   */
  @js.native
  trait ConcurrentModificationExceptionException extends js.Object {
    var message: String
  }

  /**
   * <p>Input to the CreateIdentityPool action.</p>
   */
  @js.native
  trait CreateIdentityPoolInput extends js.Object {
    var IdentityPoolName: IdentityPoolName
    var AllowUnauthenticatedIdentities: IdentityPoolUnauthenticated
    var SamlProviderARNs: SAMLProviderList
    var CognitoIdentityProviders: CognitoIdentityProviderList
    var DeveloperProviderName: DeveloperProviderName
    var SupportedLoginProviders: IdentityProviders
    var OpenIdConnectProviderARNs: OIDCProviderList
  }

  object CreateIdentityPoolInput {
    def apply(
      IdentityPoolName: js.UndefOr[IdentityPoolName] = js.undefined,
      AllowUnauthenticatedIdentities: js.UndefOr[IdentityPoolUnauthenticated] = js.undefined,
      SamlProviderARNs: js.UndefOr[SAMLProviderList] = js.undefined,
      CognitoIdentityProviders: js.UndefOr[CognitoIdentityProviderList] = js.undefined,
      DeveloperProviderName: js.UndefOr[DeveloperProviderName] = js.undefined,
      SupportedLoginProviders: js.UndefOr[IdentityProviders] = js.undefined,
      OpenIdConnectProviderARNs: js.UndefOr[OIDCProviderList] = js.undefined
    ): CreateIdentityPoolInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IdentityPoolName" -> IdentityPoolName.map { x => x: js.Any }),
        ("AllowUnauthenticatedIdentities" -> AllowUnauthenticatedIdentities.map { x => x: js.Any }),
        ("SamlProviderARNs" -> SamlProviderARNs.map { x => x: js.Any }),
        ("CognitoIdentityProviders" -> CognitoIdentityProviders.map { x => x: js.Any }),
        ("DeveloperProviderName" -> DeveloperProviderName.map { x => x: js.Any }),
        ("SupportedLoginProviders" -> SupportedLoginProviders.map { x => x: js.Any }),
        ("OpenIdConnectProviderARNs" -> OpenIdConnectProviderARNs.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateIdentityPoolInput]
    }
  }

  /**
   * <p>Credentials for the provided identity ID.</p>
   */
  @js.native
  trait Credentials extends js.Object {
    var AccessKeyId: AccessKeyString
    var SecretKey: SecretKeyString
    var SessionToken: SessionTokenString
    var Expiration: DateType
  }

  object Credentials {
    def apply(
      AccessKeyId: js.UndefOr[AccessKeyString] = js.undefined,
      SecretKey: js.UndefOr[SecretKeyString] = js.undefined,
      SessionToken: js.UndefOr[SessionTokenString] = js.undefined,
      Expiration: js.UndefOr[DateType] = js.undefined
    ): Credentials = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AccessKeyId" -> AccessKeyId.map { x => x: js.Any }),
        ("SecretKey" -> SecretKey.map { x => x: js.Any }),
        ("SessionToken" -> SessionToken.map { x => x: js.Any }),
        ("Expiration" -> Expiration.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      IdentityIdsToDelete: js.UndefOr[IdentityIdList] = js.undefined
    ): DeleteIdentitiesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IdentityIdsToDelete" -> IdentityIdsToDelete.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteIdentitiesInput]
    }
  }

  /**
   * <p>Returned in response to a successful <code>DeleteIdentities</code> operation.</p>
   */
  @js.native
  trait DeleteIdentitiesResponse extends js.Object {
    var UnprocessedIdentityIds: UnprocessedIdentityIdList
  }

  object DeleteIdentitiesResponse {
    def apply(
      UnprocessedIdentityIds: js.UndefOr[UnprocessedIdentityIdList] = js.undefined
    ): DeleteIdentitiesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UnprocessedIdentityIds" -> UnprocessedIdentityIds.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined
    ): DeleteIdentityPoolInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IdentityPoolId" -> IdentityPoolId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      IdentityId: js.UndefOr[IdentityId] = js.undefined
    ): DescribeIdentityInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IdentityId" -> IdentityId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined
    ): DescribeIdentityPoolInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IdentityPoolId" -> IdentityPoolId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeIdentityPoolInput]
    }
  }

  /**
   * <p>The provided developer user identifier is already registered with Cognito under a different identity ID.</p>
   */
  @js.native
  trait DeveloperUserAlreadyRegisteredExceptionException extends js.Object {
    var message: String
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
    var message: String
  }

  /**
   * <p>Input to the <code>GetCredentialsForIdentity</code> action.</p>
   */
  @js.native
  trait GetCredentialsForIdentityInput extends js.Object {
    var IdentityId: IdentityId
    var Logins: LoginsMap
    var CustomRoleArn: ARNString
  }

  object GetCredentialsForIdentityInput {
    def apply(
      IdentityId: js.UndefOr[IdentityId] = js.undefined,
      Logins: js.UndefOr[LoginsMap] = js.undefined,
      CustomRoleArn: js.UndefOr[ARNString] = js.undefined
    ): GetCredentialsForIdentityInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IdentityId" -> IdentityId.map { x => x: js.Any }),
        ("Logins" -> Logins.map { x => x: js.Any }),
        ("CustomRoleArn" -> CustomRoleArn.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCredentialsForIdentityInput]
    }
  }

  /**
   * <p>Returned in response to a successful <code>GetCredentialsForIdentity</code> operation.</p>
   */
  @js.native
  trait GetCredentialsForIdentityResponse extends js.Object {
    var IdentityId: IdentityId
    var Credentials: Credentials
  }

  object GetCredentialsForIdentityResponse {
    def apply(
      IdentityId: js.UndefOr[IdentityId] = js.undefined,
      Credentials: js.UndefOr[Credentials] = js.undefined
    ): GetCredentialsForIdentityResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IdentityId" -> IdentityId.map { x => x: js.Any }),
        ("Credentials" -> Credentials.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCredentialsForIdentityResponse]
    }
  }

  /**
   * <p>Input to the GetId action.</p>
   */
  @js.native
  trait GetIdInput extends js.Object {
    var AccountId: AccountId
    var IdentityPoolId: IdentityPoolId
    var Logins: LoginsMap
  }

  object GetIdInput {
    def apply(
      AccountId: js.UndefOr[AccountId] = js.undefined,
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
      Logins: js.UndefOr[LoginsMap] = js.undefined
    ): GetIdInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AccountId" -> AccountId.map { x => x: js.Any }),
        ("IdentityPoolId" -> IdentityPoolId.map { x => x: js.Any }),
        ("Logins" -> Logins.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIdInput]
    }
  }

  /**
   * <p>Returned in response to a GetId request.</p>
   */
  @js.native
  trait GetIdResponse extends js.Object {
    var IdentityId: IdentityId
  }

  object GetIdResponse {
    def apply(
      IdentityId: js.UndefOr[IdentityId] = js.undefined
    ): GetIdResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IdentityId" -> IdentityId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined
    ): GetIdentityPoolRolesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IdentityPoolId" -> IdentityPoolId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIdentityPoolRolesInput]
    }
  }

  /**
   * <p>Returned in response to a successful <code>GetIdentityPoolRoles</code> operation.</p>
   */
  @js.native
  trait GetIdentityPoolRolesResponse extends js.Object {
    var IdentityPoolId: IdentityPoolId
    var Roles: RolesMap
    var RoleMappings: RoleMappingMap
  }

  object GetIdentityPoolRolesResponse {
    def apply(
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
      Roles: js.UndefOr[RolesMap] = js.undefined,
      RoleMappings: js.UndefOr[RoleMappingMap] = js.undefined
    ): GetIdentityPoolRolesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IdentityPoolId" -> IdentityPoolId.map { x => x: js.Any }),
        ("Roles" -> Roles.map { x => x: js.Any }),
        ("RoleMappings" -> RoleMappings.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIdentityPoolRolesResponse]
    }
  }

  /**
   * <p>Input to the <code>GetOpenIdTokenForDeveloperIdentity</code> action.</p>
   */
  @js.native
  trait GetOpenIdTokenForDeveloperIdentityInput extends js.Object {
    var IdentityPoolId: IdentityPoolId
    var IdentityId: IdentityId
    var Logins: LoginsMap
    var TokenDuration: TokenDuration
  }

  object GetOpenIdTokenForDeveloperIdentityInput {
    def apply(
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
      IdentityId: js.UndefOr[IdentityId] = js.undefined,
      Logins: js.UndefOr[LoginsMap] = js.undefined,
      TokenDuration: js.UndefOr[TokenDuration] = js.undefined
    ): GetOpenIdTokenForDeveloperIdentityInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IdentityPoolId" -> IdentityPoolId.map { x => x: js.Any }),
        ("IdentityId" -> IdentityId.map { x => x: js.Any }),
        ("Logins" -> Logins.map { x => x: js.Any }),
        ("TokenDuration" -> TokenDuration.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOpenIdTokenForDeveloperIdentityInput]
    }
  }

  /**
   * <p>Returned in response to a successful <code>GetOpenIdTokenForDeveloperIdentity</code> request.</p>
   */
  @js.native
  trait GetOpenIdTokenForDeveloperIdentityResponse extends js.Object {
    var IdentityId: IdentityId
    var Token: OIDCToken
  }

  object GetOpenIdTokenForDeveloperIdentityResponse {
    def apply(
      IdentityId: js.UndefOr[IdentityId] = js.undefined,
      Token: js.UndefOr[OIDCToken] = js.undefined
    ): GetOpenIdTokenForDeveloperIdentityResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IdentityId" -> IdentityId.map { x => x: js.Any }),
        ("Token" -> Token.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOpenIdTokenForDeveloperIdentityResponse]
    }
  }

  /**
   * <p>Input to the GetOpenIdToken action.</p>
   */
  @js.native
  trait GetOpenIdTokenInput extends js.Object {
    var IdentityId: IdentityId
    var Logins: LoginsMap
  }

  object GetOpenIdTokenInput {
    def apply(
      IdentityId: js.UndefOr[IdentityId] = js.undefined,
      Logins: js.UndefOr[LoginsMap] = js.undefined
    ): GetOpenIdTokenInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IdentityId" -> IdentityId.map { x => x: js.Any }),
        ("Logins" -> Logins.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOpenIdTokenInput]
    }
  }

  /**
   * <p>Returned in response to a successful GetOpenIdToken request.</p>
   */
  @js.native
  trait GetOpenIdTokenResponse extends js.Object {
    var IdentityId: IdentityId
    var Token: OIDCToken
  }

  object GetOpenIdTokenResponse {
    def apply(
      IdentityId: js.UndefOr[IdentityId] = js.undefined,
      Token: js.UndefOr[OIDCToken] = js.undefined
    ): GetOpenIdTokenResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IdentityId" -> IdentityId.map { x => x: js.Any }),
        ("Token" -> Token.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOpenIdTokenResponse]
    }
  }

  /**
   * <p>A description of the identity.</p>
   */
  @js.native
  trait IdentityDescription extends js.Object {
    var IdentityId: IdentityId
    var Logins: LoginsList
    var CreationDate: DateType
    var LastModifiedDate: DateType
  }

  object IdentityDescription {
    def apply(
      IdentityId: js.UndefOr[IdentityId] = js.undefined,
      Logins: js.UndefOr[LoginsList] = js.undefined,
      CreationDate: js.UndefOr[DateType] = js.undefined,
      LastModifiedDate: js.UndefOr[DateType] = js.undefined
    ): IdentityDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IdentityId" -> IdentityId.map { x => x: js.Any }),
        ("Logins" -> Logins.map { x => x: js.Any }),
        ("CreationDate" -> CreationDate.map { x => x: js.Any }),
        ("LastModifiedDate" -> LastModifiedDate.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IdentityDescription]
    }
  }

  /**
   * <p>An object representing an Amazon Cognito identity pool.</p>
   */
  @js.native
  trait IdentityPool extends js.Object {
    var IdentityPoolName: IdentityPoolName
    var AllowUnauthenticatedIdentities: IdentityPoolUnauthenticated
    var SamlProviderARNs: SAMLProviderList
    var CognitoIdentityProviders: CognitoIdentityProviderList
    var IdentityPoolId: IdentityPoolId
    var DeveloperProviderName: DeveloperProviderName
    var SupportedLoginProviders: IdentityProviders
    var OpenIdConnectProviderARNs: OIDCProviderList
  }

  object IdentityPool {
    def apply(
      IdentityPoolName: js.UndefOr[IdentityPoolName] = js.undefined,
      AllowUnauthenticatedIdentities: js.UndefOr[IdentityPoolUnauthenticated] = js.undefined,
      SamlProviderARNs: js.UndefOr[SAMLProviderList] = js.undefined,
      CognitoIdentityProviders: js.UndefOr[CognitoIdentityProviderList] = js.undefined,
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
      DeveloperProviderName: js.UndefOr[DeveloperProviderName] = js.undefined,
      SupportedLoginProviders: js.UndefOr[IdentityProviders] = js.undefined,
      OpenIdConnectProviderARNs: js.UndefOr[OIDCProviderList] = js.undefined
    ): IdentityPool = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IdentityPoolName" -> IdentityPoolName.map { x => x: js.Any }),
        ("AllowUnauthenticatedIdentities" -> AllowUnauthenticatedIdentities.map { x => x: js.Any }),
        ("SamlProviderARNs" -> SamlProviderARNs.map { x => x: js.Any }),
        ("CognitoIdentityProviders" -> CognitoIdentityProviders.map { x => x: js.Any }),
        ("IdentityPoolId" -> IdentityPoolId.map { x => x: js.Any }),
        ("DeveloperProviderName" -> DeveloperProviderName.map { x => x: js.Any }),
        ("SupportedLoginProviders" -> SupportedLoginProviders.map { x => x: js.Any }),
        ("OpenIdConnectProviderARNs" -> OpenIdConnectProviderARNs.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IdentityPool]
    }
  }

  /**
   * <p>A description of the identity pool.</p>
   */
  @js.native
  trait IdentityPoolShortDescription extends js.Object {
    var IdentityPoolId: IdentityPoolId
    var IdentityPoolName: IdentityPoolName
  }

  object IdentityPoolShortDescription {
    def apply(
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
      IdentityPoolName: js.UndefOr[IdentityPoolName] = js.undefined
    ): IdentityPoolShortDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IdentityPoolId" -> IdentityPoolId.map { x => x: js.Any }),
        ("IdentityPoolName" -> IdentityPoolName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IdentityPoolShortDescription]
    }
  }

  /**
   * <p>Thrown when the service encounters an error during processing the request.</p>
   */
  @js.native
  trait InternalErrorExceptionException extends js.Object {
    var message: String
  }

  /**
   * <p>Thrown if the identity pool has no role associated for the given auth type (auth/unauth) or if the AssumeRole fails.</p>
   */
  @js.native
  trait InvalidIdentityPoolConfigurationExceptionException extends js.Object {
    var message: String
  }

  /**
   * <p>Thrown for missing or bad input parameter(s).</p>
   */
  @js.native
  trait InvalidParameterExceptionException extends js.Object {
    var message: String
  }

  /**
   * <p>Thrown when the total number of user pools has exceeded a preset limit.</p>
   */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    var message: String
  }

  /**
   * <p>Input to the ListIdentities action.</p>
   */
  @js.native
  trait ListIdentitiesInput extends js.Object {
    var IdentityPoolId: IdentityPoolId
    var MaxResults: QueryLimit
    var NextToken: PaginationKey
    var HideDisabled: HideDisabled
  }

  object ListIdentitiesInput {
    def apply(
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
      MaxResults: js.UndefOr[QueryLimit] = js.undefined,
      NextToken: js.UndefOr[PaginationKey] = js.undefined,
      HideDisabled: js.UndefOr[HideDisabled] = js.undefined
    ): ListIdentitiesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IdentityPoolId" -> IdentityPoolId.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any }),
        ("HideDisabled" -> HideDisabled.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIdentitiesInput]
    }
  }

  /**
   * <p>The response to a ListIdentities request.</p>
   */
  @js.native
  trait ListIdentitiesResponse extends js.Object {
    var IdentityPoolId: IdentityPoolId
    var Identities: IdentitiesList
    var NextToken: PaginationKey
  }

  object ListIdentitiesResponse {
    def apply(
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
      Identities: js.UndefOr[IdentitiesList] = js.undefined,
      NextToken: js.UndefOr[PaginationKey] = js.undefined
    ): ListIdentitiesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IdentityPoolId" -> IdentityPoolId.map { x => x: js.Any }),
        ("Identities" -> Identities.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIdentitiesResponse]
    }
  }

  /**
   * <p>Input to the ListIdentityPools action.</p>
   */
  @js.native
  trait ListIdentityPoolsInput extends js.Object {
    var MaxResults: QueryLimit
    var NextToken: PaginationKey
  }

  object ListIdentityPoolsInput {
    def apply(
      MaxResults: js.UndefOr[QueryLimit] = js.undefined,
      NextToken: js.UndefOr[PaginationKey] = js.undefined
    ): ListIdentityPoolsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIdentityPoolsInput]
    }
  }

  /**
   * <p>The result of a successful ListIdentityPools action.</p>
   */
  @js.native
  trait ListIdentityPoolsResponse extends js.Object {
    var IdentityPools: IdentityPoolsList
    var NextToken: PaginationKey
  }

  object ListIdentityPoolsResponse {
    def apply(
      IdentityPools: js.UndefOr[IdentityPoolsList] = js.undefined,
      NextToken: js.UndefOr[PaginationKey] = js.undefined
    ): ListIdentityPoolsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IdentityPools" -> IdentityPools.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIdentityPoolsResponse]
    }
  }

  /**
   * <p>Input to the <code>LookupDeveloperIdentityInput</code> action.</p>
   */
  @js.native
  trait LookupDeveloperIdentityInput extends js.Object {
    var MaxResults: QueryLimit
    var IdentityPoolId: IdentityPoolId
    var DeveloperUserIdentifier: DeveloperUserIdentifier
    var IdentityId: IdentityId
    var NextToken: PaginationKey
  }

  object LookupDeveloperIdentityInput {
    def apply(
      MaxResults: js.UndefOr[QueryLimit] = js.undefined,
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
      DeveloperUserIdentifier: js.UndefOr[DeveloperUserIdentifier] = js.undefined,
      IdentityId: js.UndefOr[IdentityId] = js.undefined,
      NextToken: js.UndefOr[PaginationKey] = js.undefined
    ): LookupDeveloperIdentityInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("IdentityPoolId" -> IdentityPoolId.map { x => x: js.Any }),
        ("DeveloperUserIdentifier" -> DeveloperUserIdentifier.map { x => x: js.Any }),
        ("IdentityId" -> IdentityId.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LookupDeveloperIdentityInput]
    }
  }

  /**
   * <p>Returned in response to a successful <code>LookupDeveloperIdentity</code> action.</p>
   */
  @js.native
  trait LookupDeveloperIdentityResponse extends js.Object {
    var IdentityId: IdentityId
    var DeveloperUserIdentifierList: DeveloperUserIdentifierList
    var NextToken: PaginationKey
  }

  object LookupDeveloperIdentityResponse {
    def apply(
      IdentityId: js.UndefOr[IdentityId] = js.undefined,
      DeveloperUserIdentifierList: js.UndefOr[DeveloperUserIdentifierList] = js.undefined,
      NextToken: js.UndefOr[PaginationKey] = js.undefined
    ): LookupDeveloperIdentityResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IdentityId" -> IdentityId.map { x => x: js.Any }),
        ("DeveloperUserIdentifierList" -> DeveloperUserIdentifierList.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    var Value: ClaimValue
    var RoleARN: ARNString
  }

  object MappingRule {
    def apply(
      Claim: js.UndefOr[ClaimName] = js.undefined,
      MatchType: js.UndefOr[MappingRuleMatchType] = js.undefined,
      Value: js.UndefOr[ClaimValue] = js.undefined,
      RoleARN: js.UndefOr[ARNString] = js.undefined
    ): MappingRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Claim" -> Claim.map { x => x: js.Any }),
        ("MatchType" -> MatchType.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any }),
        ("RoleARN" -> RoleARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    var SourceUserIdentifier: DeveloperUserIdentifier
    var DestinationUserIdentifier: DeveloperUserIdentifier
    var DeveloperProviderName: DeveloperProviderName
    var IdentityPoolId: IdentityPoolId
  }

  object MergeDeveloperIdentitiesInput {
    def apply(
      SourceUserIdentifier: js.UndefOr[DeveloperUserIdentifier] = js.undefined,
      DestinationUserIdentifier: js.UndefOr[DeveloperUserIdentifier] = js.undefined,
      DeveloperProviderName: js.UndefOr[DeveloperProviderName] = js.undefined,
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined
    ): MergeDeveloperIdentitiesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SourceUserIdentifier" -> SourceUserIdentifier.map { x => x: js.Any }),
        ("DestinationUserIdentifier" -> DestinationUserIdentifier.map { x => x: js.Any }),
        ("DeveloperProviderName" -> DeveloperProviderName.map { x => x: js.Any }),
        ("IdentityPoolId" -> IdentityPoolId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MergeDeveloperIdentitiesInput]
    }
  }

  /**
   * <p>Returned in response to a successful <code>MergeDeveloperIdentities</code> action.</p>
   */
  @js.native
  trait MergeDeveloperIdentitiesResponse extends js.Object {
    var IdentityId: IdentityId
  }

  object MergeDeveloperIdentitiesResponse {
    def apply(
      IdentityId: js.UndefOr[IdentityId] = js.undefined
    ): MergeDeveloperIdentitiesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IdentityId" -> IdentityId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MergeDeveloperIdentitiesResponse]
    }
  }

  /**
   * <p>Thrown when a user is not authorized to access the requested resource.</p>
   */
  @js.native
  trait NotAuthorizedExceptionException extends js.Object {
    var message: String
  }

  /**
   * <p>Thrown when a user tries to use a login which is already linked to another account.</p>
   */
  @js.native
  trait ResourceConflictExceptionException extends js.Object {
    var message: String
  }

  /**
   * <p>Thrown when the requested resource (for example, a dataset or record) does not exist.</p>
   */
  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {
    var message: String
  }

  /**
   * <p>A role mapping.</p>
   */
  @js.native
  trait RoleMapping extends js.Object {
    var Type: RoleMappingType
    var AmbiguousRoleResolution: AmbiguousRoleResolutionType
    var RulesConfiguration: RulesConfigurationType
  }

  object RoleMapping {
    def apply(
      Type: js.UndefOr[RoleMappingType] = js.undefined,
      AmbiguousRoleResolution: js.UndefOr[AmbiguousRoleResolutionType] = js.undefined,
      RulesConfiguration: js.UndefOr[RulesConfigurationType] = js.undefined
    ): RoleMapping = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Type" -> Type.map { x => x: js.Any }),
        ("AmbiguousRoleResolution" -> AmbiguousRoleResolution.map { x => x: js.Any }),
        ("RulesConfiguration" -> RulesConfiguration.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      Rules: js.UndefOr[MappingRulesList] = js.undefined
    ): RulesConfigurationType = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Rules" -> Rules.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    var RoleMappings: RoleMappingMap
  }

  object SetIdentityPoolRolesInput {
    def apply(
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
      Roles: js.UndefOr[RolesMap] = js.undefined,
      RoleMappings: js.UndefOr[RoleMappingMap] = js.undefined
    ): SetIdentityPoolRolesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IdentityPoolId" -> IdentityPoolId.map { x => x: js.Any }),
        ("Roles" -> Roles.map { x => x: js.Any }),
        ("RoleMappings" -> RoleMappings.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetIdentityPoolRolesInput]
    }
  }

  /**
   * <p>Thrown when a request is throttled.</p>
   */
  @js.native
  trait TooManyRequestsExceptionException extends js.Object {
    var message: String
  }

  /**
   * <p>Input to the <code>UnlinkDeveloperIdentity</code> action.</p>
   */
  @js.native
  trait UnlinkDeveloperIdentityInput extends js.Object {
    var IdentityId: IdentityId
    var IdentityPoolId: IdentityPoolId
    var DeveloperProviderName: DeveloperProviderName
    var DeveloperUserIdentifier: DeveloperUserIdentifier
  }

  object UnlinkDeveloperIdentityInput {
    def apply(
      IdentityId: js.UndefOr[IdentityId] = js.undefined,
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
      DeveloperProviderName: js.UndefOr[DeveloperProviderName] = js.undefined,
      DeveloperUserIdentifier: js.UndefOr[DeveloperUserIdentifier] = js.undefined
    ): UnlinkDeveloperIdentityInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IdentityId" -> IdentityId.map { x => x: js.Any }),
        ("IdentityPoolId" -> IdentityPoolId.map { x => x: js.Any }),
        ("DeveloperProviderName" -> DeveloperProviderName.map { x => x: js.Any }),
        ("DeveloperUserIdentifier" -> DeveloperUserIdentifier.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
      IdentityId: js.UndefOr[IdentityId] = js.undefined,
      Logins: js.UndefOr[LoginsMap] = js.undefined,
      LoginsToRemove: js.UndefOr[LoginsList] = js.undefined
    ): UnlinkIdentityInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IdentityId" -> IdentityId.map { x => x: js.Any }),
        ("Logins" -> Logins.map { x => x: js.Any }),
        ("LoginsToRemove" -> LoginsToRemove.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnlinkIdentityInput]
    }
  }

  /**
   * <p>An array of UnprocessedIdentityId objects, each of which contains an ErrorCode and IdentityId.</p>
   */
  @js.native
  trait UnprocessedIdentityId extends js.Object {
    var IdentityId: IdentityId
    var ErrorCode: ErrorCode
  }

  object UnprocessedIdentityId {
    def apply(
      IdentityId: js.UndefOr[IdentityId] = js.undefined,
      ErrorCode: js.UndefOr[ErrorCode] = js.undefined
    ): UnprocessedIdentityId = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IdentityId" -> IdentityId.map { x => x: js.Any }),
        ("ErrorCode" -> ErrorCode.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnprocessedIdentityId]
    }
  }
}
