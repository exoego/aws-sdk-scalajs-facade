package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object `cognito-identity` {
  type ARNString = String
  type AccessKeyString = String
  type AccountId = String
  type DateType = js.Date
  type DeveloperProviderName = String
  type DeveloperUserIdentifier = String
  type DeveloperUserIdentifierList = js.Array[DeveloperUserIdentifier]
  type IdentitiesList = js.Array[IdentityDescription]
  type IdentityId = String
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
  type OIDCProviderList = js.Array[ARNString]
  type OIDCToken = String
  type PaginationKey = String
  type QueryLimit = Integer
  type RoleType = String
  type RolesMap = js.Dictionary[ARNString]
  type SecretKeyString = String
  type SessionTokenString = String
  type TokenDuration = Long
}

package `cognito-identity` {
  @js.native
  trait `cognito-identity` extends js.Object {
    def createIdentityPool(params: CreateIdentityPoolInput, callback: Callback[IdentityPool]): Unit = js.native
    def createIdentityPool(params: CreateIdentityPoolInput): Request[IdentityPool] = js.native
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

  /**
   * <p>Input to the CreateIdentityPool action.</p>
   */
  @js.native
  trait CreateIdentityPoolInput extends js.Object {
    var IdentityPoolName: IdentityPoolName
    var AllowUnauthenticatedIdentities: IdentityPoolUnauthenticated
    var DeveloperProviderName: DeveloperProviderName
    var SupportedLoginProviders: IdentityProviders
    var OpenIdConnectProviderARNs: OIDCProviderList
  }

  object CreateIdentityPoolInput {
    def apply(
      IdentityPoolName: js.UndefOr[IdentityPoolName] = js.undefined,
      AllowUnauthenticatedIdentities: js.UndefOr[IdentityPoolUnauthenticated] = js.undefined,
      DeveloperProviderName: js.UndefOr[DeveloperProviderName] = js.undefined,
      SupportedLoginProviders: js.UndefOr[IdentityProviders] = js.undefined,
      OpenIdConnectProviderARNs: js.UndefOr[OIDCProviderList] = js.undefined
    ): CreateIdentityPoolInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IdentityPoolName" -> IdentityPoolName.map { x => x: js.Any }),
        ("AllowUnauthenticatedIdentities" -> AllowUnauthenticatedIdentities.map { x => x: js.Any }),
        ("DeveloperProviderName" -> DeveloperProviderName.map { x => x: js.Any }),
        ("SupportedLoginProviders" -> SupportedLoginProviders.map { x => x: js.Any }),
        ("OpenIdConnectProviderARNs" -> OpenIdConnectProviderARNs.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateIdentityPoolInput]
    }
  }

  /**
   * <p>Credentials for the the provided identity ID.</p>
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
   * Input to the DescribeIdentityPool action.
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

  /**
   * <p>Input to the <code>GetCredentialsForIdentity</code> action.</p>
   */
  @js.native
  trait GetCredentialsForIdentityInput extends js.Object {
    var IdentityId: IdentityId
    var Logins: LoginsMap
  }

  object GetCredentialsForIdentityInput {
    def apply(
      IdentityId: js.UndefOr[IdentityId] = js.undefined,
      Logins: js.UndefOr[LoginsMap] = js.undefined
    ): GetCredentialsForIdentityInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IdentityId" -> IdentityId.map { x => x: js.Any }),
        ("Logins" -> Logins.map { x => x: js.Any })
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
   * Input to the GetId action.
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
   * Returned in response to a GetId request.
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
  }

  object GetIdentityPoolRolesResponse {
    def apply(
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
      Roles: js.UndefOr[RolesMap] = js.undefined
    ): GetIdentityPoolRolesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IdentityPoolId" -> IdentityPoolId.map { x => x: js.Any }),
        ("Roles" -> Roles.map { x => x: js.Any })
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
   * Input to the GetOpenIdToken action.
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
   * Returned in response to a successful GetOpenIdToken request.
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
   * A description of the identity.
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
   * An object representing a Cognito identity pool.
   */
  @js.native
  trait IdentityPool extends js.Object {
    var IdentityPoolName: IdentityPoolName
    var AllowUnauthenticatedIdentities: IdentityPoolUnauthenticated
    var IdentityPoolId: IdentityPoolId
    var DeveloperProviderName: DeveloperProviderName
    var SupportedLoginProviders: IdentityProviders
    var OpenIdConnectProviderARNs: OIDCProviderList
  }

  object IdentityPool {
    def apply(
      IdentityPoolName: js.UndefOr[IdentityPoolName] = js.undefined,
      AllowUnauthenticatedIdentities: js.UndefOr[IdentityPoolUnauthenticated] = js.undefined,
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
      DeveloperProviderName: js.UndefOr[DeveloperProviderName] = js.undefined,
      SupportedLoginProviders: js.UndefOr[IdentityProviders] = js.undefined,
      OpenIdConnectProviderARNs: js.UndefOr[OIDCProviderList] = js.undefined
    ): IdentityPool = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IdentityPoolName" -> IdentityPoolName.map { x => x: js.Any }),
        ("AllowUnauthenticatedIdentities" -> AllowUnauthenticatedIdentities.map { x => x: js.Any }),
        ("IdentityPoolId" -> IdentityPoolId.map { x => x: js.Any }),
        ("DeveloperProviderName" -> DeveloperProviderName.map { x => x: js.Any }),
        ("SupportedLoginProviders" -> SupportedLoginProviders.map { x => x: js.Any }),
        ("OpenIdConnectProviderARNs" -> OpenIdConnectProviderARNs.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IdentityPool]
    }
  }

  /**
   * A description of the identity pool.
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
   * Thrown when the service encounters an error during processing the request.
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
   * Thrown for missing or bad input parameter(s).
   */
  @js.native
  trait InvalidParameterExceptionException extends js.Object {
    var message: String
  }

  /**
   * Thrown when the total number of user pools has exceeded a preset limit.
   */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    var message: String
  }

  /**
   * Input to the ListIdentities action.
   */
  @js.native
  trait ListIdentitiesInput extends js.Object {
    var IdentityPoolId: IdentityPoolId
    var MaxResults: QueryLimit
    var NextToken: PaginationKey
  }

  object ListIdentitiesInput {
    def apply(
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
      MaxResults: js.UndefOr[QueryLimit] = js.undefined,
      NextToken: js.UndefOr[PaginationKey] = js.undefined
    ): ListIdentitiesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IdentityPoolId" -> IdentityPoolId.map { x => x: js.Any }),
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListIdentitiesInput]
    }
  }

  /**
   * The response to a ListIdentities request.
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
   * Input to the ListIdentityPools action.
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
   * The result of a successful ListIdentityPools action.
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
   * Thrown when a user is not authorized to access the requested resource.
   */
  @js.native
  trait NotAuthorizedExceptionException extends js.Object {
    var message: String
  }

  /**
   * Thrown when a user tries to use a login which is already linked to another account.
   */
  @js.native
  trait ResourceConflictExceptionException extends js.Object {
    var message: String
  }

  /**
   * Thrown when the requested resource (for example, a dataset or record) does not exist.
   */
  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {
    var message: String
  }

  /**
   * <p>Input to the <code>SetIdentityPoolRoles</code> action.</p>
   */
  @js.native
  trait SetIdentityPoolRolesInput extends js.Object {
    var IdentityPoolId: IdentityPoolId
    var Roles: RolesMap
  }

  object SetIdentityPoolRolesInput {
    def apply(
      IdentityPoolId: js.UndefOr[IdentityPoolId] = js.undefined,
      Roles: js.UndefOr[RolesMap] = js.undefined
    ): SetIdentityPoolRolesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IdentityPoolId" -> IdentityPoolId.map { x => x: js.Any }),
        ("Roles" -> Roles.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SetIdentityPoolRolesInput]
    }
  }

  /**
   * Thrown when a request is throttled.
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
}
