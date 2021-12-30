package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object amplifybackend {
  type ListOfAdditionalConstraintsElement = js.Array[AdditionalConstraintsElement]
  type ListOfBackendAPIAuthType = js.Array[BackendAPIAuthType]
  type ListOfBackendJobRespObj = js.Array[BackendJobRespObj]
  type ListOfMfaTypesElement = js.Array[MfaTypesElement]
  type ListOfOAuthScopesElement = js.Array[OAuthScopesElement]
  type ListOfRequiredSignUpAttributesElement = js.Array[RequiredSignUpAttributesElement]
  type ListOf__string = js.Array[__string]
  type __boolean = Boolean
  type __double = Double
  type __integerMin1Max25 = Int
  type __string = String

  final class AmplifyBackendOps(private val service: AmplifyBackend) extends AnyVal {

    @inline def cloneBackendFuture(params: CloneBackendRequest): Future[CloneBackendResponse] = service.cloneBackend(params).promise().toFuture
    @inline def createBackendAPIFuture(params: CreateBackendAPIRequest): Future[CreateBackendAPIResponse] = service.createBackendAPI(params).promise().toFuture
    @inline def createBackendAuthFuture(params: CreateBackendAuthRequest): Future[CreateBackendAuthResponse] = service.createBackendAuth(params).promise().toFuture
    @inline def createBackendConfigFuture(params: CreateBackendConfigRequest): Future[CreateBackendConfigResponse] = service.createBackendConfig(params).promise().toFuture
    @inline def createBackendFuture(params: CreateBackendRequest): Future[CreateBackendResponse] = service.createBackend(params).promise().toFuture
    @inline def createTokenFuture(params: CreateTokenRequest): Future[CreateTokenResponse] = service.createToken(params).promise().toFuture
    @inline def deleteBackendAPIFuture(params: DeleteBackendAPIRequest): Future[DeleteBackendAPIResponse] = service.deleteBackendAPI(params).promise().toFuture
    @inline def deleteBackendAuthFuture(params: DeleteBackendAuthRequest): Future[DeleteBackendAuthResponse] = service.deleteBackendAuth(params).promise().toFuture
    @inline def deleteBackendFuture(params: DeleteBackendRequest): Future[DeleteBackendResponse] = service.deleteBackend(params).promise().toFuture
    @inline def deleteTokenFuture(params: DeleteTokenRequest): Future[DeleteTokenResponse] = service.deleteToken(params).promise().toFuture
    @inline def generateBackendAPIModelsFuture(params: GenerateBackendAPIModelsRequest): Future[GenerateBackendAPIModelsResponse] = service.generateBackendAPIModels(params).promise().toFuture
    @inline def getBackendAPIFuture(params: GetBackendAPIRequest): Future[GetBackendAPIResponse] = service.getBackendAPI(params).promise().toFuture
    @inline def getBackendAPIModelsFuture(params: GetBackendAPIModelsRequest): Future[GetBackendAPIModelsResponse] = service.getBackendAPIModels(params).promise().toFuture
    @inline def getBackendAuthFuture(params: GetBackendAuthRequest): Future[GetBackendAuthResponse] = service.getBackendAuth(params).promise().toFuture
    @inline def getBackendFuture(params: GetBackendRequest): Future[GetBackendResponse] = service.getBackend(params).promise().toFuture
    @inline def getBackendJobFuture(params: GetBackendJobRequest): Future[GetBackendJobResponse] = service.getBackendJob(params).promise().toFuture
    @inline def getTokenFuture(params: GetTokenRequest): Future[GetTokenResponse] = service.getToken(params).promise().toFuture
    @inline def listBackendJobsFuture(params: ListBackendJobsRequest): Future[ListBackendJobsResponse] = service.listBackendJobs(params).promise().toFuture
    @inline def removeAllBackendsFuture(params: RemoveAllBackendsRequest): Future[RemoveAllBackendsResponse] = service.removeAllBackends(params).promise().toFuture
    @inline def removeBackendConfigFuture(params: RemoveBackendConfigRequest): Future[RemoveBackendConfigResponse] = service.removeBackendConfig(params).promise().toFuture
    @inline def updateBackendAPIFuture(params: UpdateBackendAPIRequest): Future[UpdateBackendAPIResponse] = service.updateBackendAPI(params).promise().toFuture
    @inline def updateBackendAuthFuture(params: UpdateBackendAuthRequest): Future[UpdateBackendAuthResponse] = service.updateBackendAuth(params).promise().toFuture
    @inline def updateBackendConfigFuture(params: UpdateBackendConfigRequest): Future[UpdateBackendConfigResponse] = service.updateBackendConfig(params).promise().toFuture
    @inline def updateBackendJobFuture(params: UpdateBackendJobRequest): Future[UpdateBackendJobResponse] = service.updateBackendJob(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/amplifybackend", JSImport.Namespace, "AWS.AmplifyBackend")
  class AmplifyBackend() extends js.Object {
    def this(config: AWSConfig) = this()

    def cloneBackend(params: CloneBackendRequest): Request[CloneBackendResponse] = js.native
    def createBackend(params: CreateBackendRequest): Request[CreateBackendResponse] = js.native
    def createBackendAPI(params: CreateBackendAPIRequest): Request[CreateBackendAPIResponse] = js.native
    def createBackendAuth(params: CreateBackendAuthRequest): Request[CreateBackendAuthResponse] = js.native
    def createBackendConfig(params: CreateBackendConfigRequest): Request[CreateBackendConfigResponse] = js.native
    def createToken(params: CreateTokenRequest): Request[CreateTokenResponse] = js.native
    def deleteBackend(params: DeleteBackendRequest): Request[DeleteBackendResponse] = js.native
    def deleteBackendAPI(params: DeleteBackendAPIRequest): Request[DeleteBackendAPIResponse] = js.native
    def deleteBackendAuth(params: DeleteBackendAuthRequest): Request[DeleteBackendAuthResponse] = js.native
    def deleteToken(params: DeleteTokenRequest): Request[DeleteTokenResponse] = js.native
    def generateBackendAPIModels(params: GenerateBackendAPIModelsRequest): Request[GenerateBackendAPIModelsResponse] = js.native
    def getBackend(params: GetBackendRequest): Request[GetBackendResponse] = js.native
    def getBackendAPI(params: GetBackendAPIRequest): Request[GetBackendAPIResponse] = js.native
    def getBackendAPIModels(params: GetBackendAPIModelsRequest): Request[GetBackendAPIModelsResponse] = js.native
    def getBackendAuth(params: GetBackendAuthRequest): Request[GetBackendAuthResponse] = js.native
    def getBackendJob(params: GetBackendJobRequest): Request[GetBackendJobResponse] = js.native
    def getToken(params: GetTokenRequest): Request[GetTokenResponse] = js.native
    def listBackendJobs(params: ListBackendJobsRequest): Request[ListBackendJobsResponse] = js.native
    def removeAllBackends(params: RemoveAllBackendsRequest): Request[RemoveAllBackendsResponse] = js.native
    def removeBackendConfig(params: RemoveBackendConfigRequest): Request[RemoveBackendConfigResponse] = js.native
    def updateBackendAPI(params: UpdateBackendAPIRequest): Request[UpdateBackendAPIResponse] = js.native
    def updateBackendAuth(params: UpdateBackendAuthRequest): Request[UpdateBackendAuthResponse] = js.native
    def updateBackendConfig(params: UpdateBackendConfigRequest): Request[UpdateBackendConfigResponse] = js.native
    def updateBackendJob(params: UpdateBackendJobRequest): Request[UpdateBackendJobResponse] = js.native
  }
  object AmplifyBackend {
    @inline implicit def toOps(service: AmplifyBackend): AmplifyBackendOps = {
      new AmplifyBackendOps(service)
    }
  }

  /** The authentication settings for accessing provisioned data models in your Amplify project.
    */
  @js.native
  trait BackendAPIAppSyncAuthSettings extends js.Object {
    var CognitoUserPoolId: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
    var ExpirationTime: js.UndefOr[__double]
    var OpenIDAuthTTL: js.UndefOr[__string]
    var OpenIDClientId: js.UndefOr[__string]
    var OpenIDIatTTL: js.UndefOr[__string]
    var OpenIDIssueURL: js.UndefOr[__string]
    var OpenIDProviderName: js.UndefOr[__string]
  }

  object BackendAPIAppSyncAuthSettings {
    @inline
    def apply(
        CognitoUserPoolId: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        ExpirationTime: js.UndefOr[__double] = js.undefined,
        OpenIDAuthTTL: js.UndefOr[__string] = js.undefined,
        OpenIDClientId: js.UndefOr[__string] = js.undefined,
        OpenIDIatTTL: js.UndefOr[__string] = js.undefined,
        OpenIDIssueURL: js.UndefOr[__string] = js.undefined,
        OpenIDProviderName: js.UndefOr[__string] = js.undefined
    ): BackendAPIAppSyncAuthSettings = {
      val __obj = js.Dynamic.literal()
      CognitoUserPoolId.foreach(__v => __obj.updateDynamic("CognitoUserPoolId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ExpirationTime.foreach(__v => __obj.updateDynamic("ExpirationTime")(__v.asInstanceOf[js.Any]))
      OpenIDAuthTTL.foreach(__v => __obj.updateDynamic("OpenIDAuthTTL")(__v.asInstanceOf[js.Any]))
      OpenIDClientId.foreach(__v => __obj.updateDynamic("OpenIDClientId")(__v.asInstanceOf[js.Any]))
      OpenIDIatTTL.foreach(__v => __obj.updateDynamic("OpenIDIatTTL")(__v.asInstanceOf[js.Any]))
      OpenIDIssueURL.foreach(__v => __obj.updateDynamic("OpenIDIssueURL")(__v.asInstanceOf[js.Any]))
      OpenIDProviderName.foreach(__v => __obj.updateDynamic("OpenIDProviderName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BackendAPIAppSyncAuthSettings]
    }
  }

  /** Describes the auth types for your configured data models.
    */
  @js.native
  trait BackendAPIAuthType extends js.Object {
    var Mode: js.UndefOr[Mode]
    var Settings: js.UndefOr[BackendAPIAppSyncAuthSettings]
  }

  object BackendAPIAuthType {
    @inline
    def apply(
        Mode: js.UndefOr[Mode] = js.undefined,
        Settings: js.UndefOr[BackendAPIAppSyncAuthSettings] = js.undefined
    ): BackendAPIAuthType = {
      val __obj = js.Dynamic.literal()
      Mode.foreach(__v => __obj.updateDynamic("Mode")(__v.asInstanceOf[js.Any]))
      Settings.foreach(__v => __obj.updateDynamic("Settings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BackendAPIAuthType]
    }
  }

  /** Describes the conflict resolution configuration for the data model configured in your Amplify project.
    */
  @js.native
  trait BackendAPIConflictResolution extends js.Object {
    var ResolutionStrategy: js.UndefOr[ResolutionStrategy]
  }

  object BackendAPIConflictResolution {
    @inline
    def apply(
        ResolutionStrategy: js.UndefOr[ResolutionStrategy] = js.undefined
    ): BackendAPIConflictResolution = {
      val __obj = js.Dynamic.literal()
      ResolutionStrategy.foreach(__v => __obj.updateDynamic("ResolutionStrategy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BackendAPIConflictResolution]
    }
  }

  /** The resource configuration for the data model, configured as a part of the Amplify project.
    */
  @js.native
  trait BackendAPIResourceConfig extends js.Object {
    var AdditionalAuthTypes: js.UndefOr[ListOfBackendAPIAuthType]
    var ApiName: js.UndefOr[__string]
    var ConflictResolution: js.UndefOr[BackendAPIConflictResolution]
    var DefaultAuthType: js.UndefOr[BackendAPIAuthType]
    var Service: js.UndefOr[__string]
    var TransformSchema: js.UndefOr[__string]
  }

  object BackendAPIResourceConfig {
    @inline
    def apply(
        AdditionalAuthTypes: js.UndefOr[ListOfBackendAPIAuthType] = js.undefined,
        ApiName: js.UndefOr[__string] = js.undefined,
        ConflictResolution: js.UndefOr[BackendAPIConflictResolution] = js.undefined,
        DefaultAuthType: js.UndefOr[BackendAPIAuthType] = js.undefined,
        Service: js.UndefOr[__string] = js.undefined,
        TransformSchema: js.UndefOr[__string] = js.undefined
    ): BackendAPIResourceConfig = {
      val __obj = js.Dynamic.literal()
      AdditionalAuthTypes.foreach(__v => __obj.updateDynamic("AdditionalAuthTypes")(__v.asInstanceOf[js.Any]))
      ApiName.foreach(__v => __obj.updateDynamic("ApiName")(__v.asInstanceOf[js.Any]))
      ConflictResolution.foreach(__v => __obj.updateDynamic("ConflictResolution")(__v.asInstanceOf[js.Any]))
      DefaultAuthType.foreach(__v => __obj.updateDynamic("DefaultAuthType")(__v.asInstanceOf[js.Any]))
      Service.foreach(__v => __obj.updateDynamic("Service")(__v.asInstanceOf[js.Any]))
      TransformSchema.foreach(__v => __obj.updateDynamic("TransformSchema")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BackendAPIResourceConfig]
    }
  }

  /** Describes third-party social federation configurations for allowing your app users to sign in using OAuth.
    */
  @js.native
  trait BackendAuthSocialProviderConfig extends js.Object {
    var ClientId: js.UndefOr[__string]
    var ClientSecret: js.UndefOr[__string]
  }

  object BackendAuthSocialProviderConfig {
    @inline
    def apply(
        ClientId: js.UndefOr[__string] = js.undefined,
        ClientSecret: js.UndefOr[__string] = js.undefined
    ): BackendAuthSocialProviderConfig = {
      val __obj = js.Dynamic.literal()
      ClientId.foreach(__v => __obj.updateDynamic("ClientId")(__v.asInstanceOf[js.Any]))
      ClientSecret.foreach(__v => __obj.updateDynamic("ClientSecret")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BackendAuthSocialProviderConfig]
    }
  }

  /** The response object for this operation.
    */
  @js.native
  trait BackendJobRespObj extends js.Object {
    var AppId: __string
    var BackendEnvironmentName: __string
    var CreateTime: js.UndefOr[__string]
    var Error: js.UndefOr[__string]
    var JobId: js.UndefOr[__string]
    var Operation: js.UndefOr[__string]
    var Status: js.UndefOr[__string]
    var UpdateTime: js.UndefOr[__string]
  }

  object BackendJobRespObj {
    @inline
    def apply(
        AppId: __string,
        BackendEnvironmentName: __string,
        CreateTime: js.UndefOr[__string] = js.undefined,
        Error: js.UndefOr[__string] = js.undefined,
        JobId: js.UndefOr[__string] = js.undefined,
        Operation: js.UndefOr[__string] = js.undefined,
        Status: js.UndefOr[__string] = js.undefined,
        UpdateTime: js.UndefOr[__string] = js.undefined
    ): BackendJobRespObj = {
      val __obj = js.Dynamic.literal(
        "AppId" -> AppId.asInstanceOf[js.Any],
        "BackendEnvironmentName" -> BackendEnvironmentName.asInstanceOf[js.Any]
      )

      CreateTime.foreach(__v => __obj.updateDynamic("CreateTime")(__v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      Operation.foreach(__v => __obj.updateDynamic("Operation")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdateTime.foreach(__v => __obj.updateDynamic("UpdateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BackendJobRespObj]
    }
  }

  /** The request body for CloneBackend.
    */
  @js.native
  trait CloneBackendRequest extends js.Object {
    var AppId: __string
    var BackendEnvironmentName: __string
    var TargetEnvironmentName: __string
  }

  object CloneBackendRequest {
    @inline
    def apply(
        AppId: __string,
        BackendEnvironmentName: __string,
        TargetEnvironmentName: __string
    ): CloneBackendRequest = {
      val __obj = js.Dynamic.literal(
        "AppId" -> AppId.asInstanceOf[js.Any],
        "BackendEnvironmentName" -> BackendEnvironmentName.asInstanceOf[js.Any],
        "TargetEnvironmentName" -> TargetEnvironmentName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CloneBackendRequest]
    }
  }

  @js.native
  trait CloneBackendResponse extends js.Object {
    var AppId: js.UndefOr[__string]
    var BackendEnvironmentName: js.UndefOr[__string]
    var Error: js.UndefOr[__string]
    var JobId: js.UndefOr[__string]
    var Operation: js.UndefOr[__string]
    var Status: js.UndefOr[__string]
  }

  object CloneBackendResponse {
    @inline
    def apply(
        AppId: js.UndefOr[__string] = js.undefined,
        BackendEnvironmentName: js.UndefOr[__string] = js.undefined,
        Error: js.UndefOr[__string] = js.undefined,
        JobId: js.UndefOr[__string] = js.undefined,
        Operation: js.UndefOr[__string] = js.undefined,
        Status: js.UndefOr[__string] = js.undefined
    ): CloneBackendResponse = {
      val __obj = js.Dynamic.literal()
      AppId.foreach(__v => __obj.updateDynamic("AppId")(__v.asInstanceOf[js.Any]))
      BackendEnvironmentName.foreach(__v => __obj.updateDynamic("BackendEnvironmentName")(__v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      Operation.foreach(__v => __obj.updateDynamic("Operation")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloneBackendResponse]
    }
  }

  /** The request body for CreateBackendAPI.
    */
  @js.native
  trait CreateBackendAPIRequest extends js.Object {
    var AppId: __string
    var BackendEnvironmentName: __string
    var ResourceConfig: BackendAPIResourceConfig
    var ResourceName: __string
  }

  object CreateBackendAPIRequest {
    @inline
    def apply(
        AppId: __string,
        BackendEnvironmentName: __string,
        ResourceConfig: BackendAPIResourceConfig,
        ResourceName: __string
    ): CreateBackendAPIRequest = {
      val __obj = js.Dynamic.literal(
        "AppId" -> AppId.asInstanceOf[js.Any],
        "BackendEnvironmentName" -> BackendEnvironmentName.asInstanceOf[js.Any],
        "ResourceConfig" -> ResourceConfig.asInstanceOf[js.Any],
        "ResourceName" -> ResourceName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateBackendAPIRequest]
    }
  }

  @js.native
  trait CreateBackendAPIResponse extends js.Object {
    var AppId: js.UndefOr[__string]
    var BackendEnvironmentName: js.UndefOr[__string]
    var Error: js.UndefOr[__string]
    var JobId: js.UndefOr[__string]
    var Operation: js.UndefOr[__string]
    var Status: js.UndefOr[__string]
  }

  object CreateBackendAPIResponse {
    @inline
    def apply(
        AppId: js.UndefOr[__string] = js.undefined,
        BackendEnvironmentName: js.UndefOr[__string] = js.undefined,
        Error: js.UndefOr[__string] = js.undefined,
        JobId: js.UndefOr[__string] = js.undefined,
        Operation: js.UndefOr[__string] = js.undefined,
        Status: js.UndefOr[__string] = js.undefined
    ): CreateBackendAPIResponse = {
      val __obj = js.Dynamic.literal()
      AppId.foreach(__v => __obj.updateDynamic("AppId")(__v.asInstanceOf[js.Any]))
      BackendEnvironmentName.foreach(__v => __obj.updateDynamic("BackendEnvironmentName")(__v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      Operation.foreach(__v => __obj.updateDynamic("Operation")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBackendAPIResponse]
    }
  }

  /** Describes the forgot password policy for authenticating into the Amplify app.
    */
  @js.native
  trait CreateBackendAuthForgotPasswordConfig extends js.Object {
    var DeliveryMethod: DeliveryMethod
    var EmailSettings: js.UndefOr[EmailSettings]
    var SmsSettings: js.UndefOr[SmsSettings]
  }

  object CreateBackendAuthForgotPasswordConfig {
    @inline
    def apply(
        DeliveryMethod: DeliveryMethod,
        EmailSettings: js.UndefOr[EmailSettings] = js.undefined,
        SmsSettings: js.UndefOr[SmsSettings] = js.undefined
    ): CreateBackendAuthForgotPasswordConfig = {
      val __obj = js.Dynamic.literal(
        "DeliveryMethod" -> DeliveryMethod.asInstanceOf[js.Any]
      )

      EmailSettings.foreach(__v => __obj.updateDynamic("EmailSettings")(__v.asInstanceOf[js.Any]))
      SmsSettings.foreach(__v => __obj.updateDynamic("SmsSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBackendAuthForgotPasswordConfig]
    }
  }

  /** Describes authorization configurations for the auth resources, configured as a part of your Amplify project.
    */
  @js.native
  trait CreateBackendAuthIdentityPoolConfig extends js.Object {
    var IdentityPoolName: __string
    var UnauthenticatedLogin: __boolean
  }

  object CreateBackendAuthIdentityPoolConfig {
    @inline
    def apply(
        IdentityPoolName: __string,
        UnauthenticatedLogin: __boolean
    ): CreateBackendAuthIdentityPoolConfig = {
      val __obj = js.Dynamic.literal(
        "IdentityPoolName" -> IdentityPoolName.asInstanceOf[js.Any],
        "UnauthenticatedLogin" -> UnauthenticatedLogin.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateBackendAuthIdentityPoolConfig]
    }
  }

  /** Describes whether to apply multi-factor authentication (MFA) policies for your Amazon Cognito user pool that's configured as a part of your Amplify project.
    */
  @js.native
  trait CreateBackendAuthMFAConfig extends js.Object {
    var MFAMode: MFAMode
    var Settings: js.UndefOr[Settings]
  }

  object CreateBackendAuthMFAConfig {
    @inline
    def apply(
        MFAMode: MFAMode,
        Settings: js.UndefOr[Settings] = js.undefined
    ): CreateBackendAuthMFAConfig = {
      val __obj = js.Dynamic.literal(
        "MFAMode" -> MFAMode.asInstanceOf[js.Any]
      )

      Settings.foreach(__v => __obj.updateDynamic("Settings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBackendAuthMFAConfig]
    }
  }

  /** Creates the OAuth configuration for your Amplify project.
    */
  @js.native
  trait CreateBackendAuthOAuthConfig extends js.Object {
    var OAuthGrantType: OAuthGrantType
    var OAuthScopes: ListOfOAuthScopesElement
    var RedirectSignInURIs: ListOf__string
    var RedirectSignOutURIs: ListOf__string
    var DomainPrefix: js.UndefOr[__string]
    var SocialProviderSettings: js.UndefOr[SocialProviderSettings]
  }

  object CreateBackendAuthOAuthConfig {
    @inline
    def apply(
        OAuthGrantType: OAuthGrantType,
        OAuthScopes: ListOfOAuthScopesElement,
        RedirectSignInURIs: ListOf__string,
        RedirectSignOutURIs: ListOf__string,
        DomainPrefix: js.UndefOr[__string] = js.undefined,
        SocialProviderSettings: js.UndefOr[SocialProviderSettings] = js.undefined
    ): CreateBackendAuthOAuthConfig = {
      val __obj = js.Dynamic.literal(
        "OAuthGrantType" -> OAuthGrantType.asInstanceOf[js.Any],
        "OAuthScopes" -> OAuthScopes.asInstanceOf[js.Any],
        "RedirectSignInURIs" -> RedirectSignInURIs.asInstanceOf[js.Any],
        "RedirectSignOutURIs" -> RedirectSignOutURIs.asInstanceOf[js.Any]
      )

      DomainPrefix.foreach(__v => __obj.updateDynamic("DomainPrefix")(__v.asInstanceOf[js.Any]))
      SocialProviderSettings.foreach(__v => __obj.updateDynamic("SocialProviderSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBackendAuthOAuthConfig]
    }
  }

  /** The password policy configuration for the backend of your Amplify project.
    */
  @js.native
  trait CreateBackendAuthPasswordPolicyConfig extends js.Object {
    var MinimumLength: __double
    var AdditionalConstraints: js.UndefOr[ListOfAdditionalConstraintsElement]
  }

  object CreateBackendAuthPasswordPolicyConfig {
    @inline
    def apply(
        MinimumLength: __double,
        AdditionalConstraints: js.UndefOr[ListOfAdditionalConstraintsElement] = js.undefined
    ): CreateBackendAuthPasswordPolicyConfig = {
      val __obj = js.Dynamic.literal(
        "MinimumLength" -> MinimumLength.asInstanceOf[js.Any]
      )

      AdditionalConstraints.foreach(__v => __obj.updateDynamic("AdditionalConstraints")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBackendAuthPasswordPolicyConfig]
    }
  }

  /** The request body for CreateBackendAuth.
    */
  @js.native
  trait CreateBackendAuthRequest extends js.Object {
    var AppId: __string
    var BackendEnvironmentName: __string
    var ResourceConfig: CreateBackendAuthResourceConfig
    var ResourceName: __string
  }

  object CreateBackendAuthRequest {
    @inline
    def apply(
        AppId: __string,
        BackendEnvironmentName: __string,
        ResourceConfig: CreateBackendAuthResourceConfig,
        ResourceName: __string
    ): CreateBackendAuthRequest = {
      val __obj = js.Dynamic.literal(
        "AppId" -> AppId.asInstanceOf[js.Any],
        "BackendEnvironmentName" -> BackendEnvironmentName.asInstanceOf[js.Any],
        "ResourceConfig" -> ResourceConfig.asInstanceOf[js.Any],
        "ResourceName" -> ResourceName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateBackendAuthRequest]
    }
  }

  /** Defines the resource configuration when creating an auth resource in your Amplify project.
    */
  @js.native
  trait CreateBackendAuthResourceConfig extends js.Object {
    var AuthResources: AuthResources
    var Service: Service
    var UserPoolConfigs: CreateBackendAuthUserPoolConfig
    var IdentityPoolConfigs: js.UndefOr[CreateBackendAuthIdentityPoolConfig]
  }

  object CreateBackendAuthResourceConfig {
    @inline
    def apply(
        AuthResources: AuthResources,
        Service: Service,
        UserPoolConfigs: CreateBackendAuthUserPoolConfig,
        IdentityPoolConfigs: js.UndefOr[CreateBackendAuthIdentityPoolConfig] = js.undefined
    ): CreateBackendAuthResourceConfig = {
      val __obj = js.Dynamic.literal(
        "AuthResources" -> AuthResources.asInstanceOf[js.Any],
        "Service" -> Service.asInstanceOf[js.Any],
        "UserPoolConfigs" -> UserPoolConfigs.asInstanceOf[js.Any]
      )

      IdentityPoolConfigs.foreach(__v => __obj.updateDynamic("IdentityPoolConfigs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBackendAuthResourceConfig]
    }
  }

  @js.native
  trait CreateBackendAuthResponse extends js.Object {
    var AppId: js.UndefOr[__string]
    var BackendEnvironmentName: js.UndefOr[__string]
    var Error: js.UndefOr[__string]
    var JobId: js.UndefOr[__string]
    var Operation: js.UndefOr[__string]
    var Status: js.UndefOr[__string]
  }

  object CreateBackendAuthResponse {
    @inline
    def apply(
        AppId: js.UndefOr[__string] = js.undefined,
        BackendEnvironmentName: js.UndefOr[__string] = js.undefined,
        Error: js.UndefOr[__string] = js.undefined,
        JobId: js.UndefOr[__string] = js.undefined,
        Operation: js.UndefOr[__string] = js.undefined,
        Status: js.UndefOr[__string] = js.undefined
    ): CreateBackendAuthResponse = {
      val __obj = js.Dynamic.literal()
      AppId.foreach(__v => __obj.updateDynamic("AppId")(__v.asInstanceOf[js.Any]))
      BackendEnvironmentName.foreach(__v => __obj.updateDynamic("BackendEnvironmentName")(__v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      Operation.foreach(__v => __obj.updateDynamic("Operation")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBackendAuthResponse]
    }
  }

  /** Describes the Amazon Cognito user pool configuration for the auth resource to be configured for your Amplify project.
    */
  @js.native
  trait CreateBackendAuthUserPoolConfig extends js.Object {
    var RequiredSignUpAttributes: ListOfRequiredSignUpAttributesElement
    var SignInMethod: SignInMethod
    var UserPoolName: __string
    var ForgotPassword: js.UndefOr[CreateBackendAuthForgotPasswordConfig]
    var Mfa: js.UndefOr[CreateBackendAuthMFAConfig]
    var OAuth: js.UndefOr[CreateBackendAuthOAuthConfig]
    var PasswordPolicy: js.UndefOr[CreateBackendAuthPasswordPolicyConfig]
  }

  object CreateBackendAuthUserPoolConfig {
    @inline
    def apply(
        RequiredSignUpAttributes: ListOfRequiredSignUpAttributesElement,
        SignInMethod: SignInMethod,
        UserPoolName: __string,
        ForgotPassword: js.UndefOr[CreateBackendAuthForgotPasswordConfig] = js.undefined,
        Mfa: js.UndefOr[CreateBackendAuthMFAConfig] = js.undefined,
        OAuth: js.UndefOr[CreateBackendAuthOAuthConfig] = js.undefined,
        PasswordPolicy: js.UndefOr[CreateBackendAuthPasswordPolicyConfig] = js.undefined
    ): CreateBackendAuthUserPoolConfig = {
      val __obj = js.Dynamic.literal(
        "RequiredSignUpAttributes" -> RequiredSignUpAttributes.asInstanceOf[js.Any],
        "SignInMethod" -> SignInMethod.asInstanceOf[js.Any],
        "UserPoolName" -> UserPoolName.asInstanceOf[js.Any]
      )

      ForgotPassword.foreach(__v => __obj.updateDynamic("ForgotPassword")(__v.asInstanceOf[js.Any]))
      Mfa.foreach(__v => __obj.updateDynamic("Mfa")(__v.asInstanceOf[js.Any]))
      OAuth.foreach(__v => __obj.updateDynamic("OAuth")(__v.asInstanceOf[js.Any]))
      PasswordPolicy.foreach(__v => __obj.updateDynamic("PasswordPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBackendAuthUserPoolConfig]
    }
  }

  /** The request body for CreateBackendConfig.
    */
  @js.native
  trait CreateBackendConfigRequest extends js.Object {
    var AppId: __string
    var BackendManagerAppId: js.UndefOr[__string]
  }

  object CreateBackendConfigRequest {
    @inline
    def apply(
        AppId: __string,
        BackendManagerAppId: js.UndefOr[__string] = js.undefined
    ): CreateBackendConfigRequest = {
      val __obj = js.Dynamic.literal(
        "AppId" -> AppId.asInstanceOf[js.Any]
      )

      BackendManagerAppId.foreach(__v => __obj.updateDynamic("BackendManagerAppId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBackendConfigRequest]
    }
  }

  @js.native
  trait CreateBackendConfigResponse extends js.Object {
    var AppId: js.UndefOr[__string]
    var BackendEnvironmentName: js.UndefOr[__string]
    var JobId: js.UndefOr[__string]
    var Status: js.UndefOr[__string]
  }

  object CreateBackendConfigResponse {
    @inline
    def apply(
        AppId: js.UndefOr[__string] = js.undefined,
        BackendEnvironmentName: js.UndefOr[__string] = js.undefined,
        JobId: js.UndefOr[__string] = js.undefined,
        Status: js.UndefOr[__string] = js.undefined
    ): CreateBackendConfigResponse = {
      val __obj = js.Dynamic.literal()
      AppId.foreach(__v => __obj.updateDynamic("AppId")(__v.asInstanceOf[js.Any]))
      BackendEnvironmentName.foreach(__v => __obj.updateDynamic("BackendEnvironmentName")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBackendConfigResponse]
    }
  }

  /** The request body for CreateBackend.
    */
  @js.native
  trait CreateBackendRequest extends js.Object {
    var AppId: __string
    var AppName: __string
    var BackendEnvironmentName: __string
    var ResourceConfig: js.UndefOr[ResourceConfig]
    var ResourceName: js.UndefOr[__string]
  }

  object CreateBackendRequest {
    @inline
    def apply(
        AppId: __string,
        AppName: __string,
        BackendEnvironmentName: __string,
        ResourceConfig: js.UndefOr[ResourceConfig] = js.undefined,
        ResourceName: js.UndefOr[__string] = js.undefined
    ): CreateBackendRequest = {
      val __obj = js.Dynamic.literal(
        "AppId" -> AppId.asInstanceOf[js.Any],
        "AppName" -> AppName.asInstanceOf[js.Any],
        "BackendEnvironmentName" -> BackendEnvironmentName.asInstanceOf[js.Any]
      )

      ResourceConfig.foreach(__v => __obj.updateDynamic("ResourceConfig")(__v.asInstanceOf[js.Any]))
      ResourceName.foreach(__v => __obj.updateDynamic("ResourceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBackendRequest]
    }
  }

  @js.native
  trait CreateBackendResponse extends js.Object {
    var AppId: js.UndefOr[__string]
    var BackendEnvironmentName: js.UndefOr[__string]
    var Error: js.UndefOr[__string]
    var JobId: js.UndefOr[__string]
    var Operation: js.UndefOr[__string]
    var Status: js.UndefOr[__string]
  }

  object CreateBackendResponse {
    @inline
    def apply(
        AppId: js.UndefOr[__string] = js.undefined,
        BackendEnvironmentName: js.UndefOr[__string] = js.undefined,
        Error: js.UndefOr[__string] = js.undefined,
        JobId: js.UndefOr[__string] = js.undefined,
        Operation: js.UndefOr[__string] = js.undefined,
        Status: js.UndefOr[__string] = js.undefined
    ): CreateBackendResponse = {
      val __obj = js.Dynamic.literal()
      AppId.foreach(__v => __obj.updateDynamic("AppId")(__v.asInstanceOf[js.Any]))
      BackendEnvironmentName.foreach(__v => __obj.updateDynamic("BackendEnvironmentName")(__v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      Operation.foreach(__v => __obj.updateDynamic("Operation")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBackendResponse]
    }
  }

  @js.native
  trait CreateTokenRequest extends js.Object {
    var AppId: __string
  }

  object CreateTokenRequest {
    @inline
    def apply(
        AppId: __string
    ): CreateTokenRequest = {
      val __obj = js.Dynamic.literal(
        "AppId" -> AppId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateTokenRequest]
    }
  }

  @js.native
  trait CreateTokenResponse extends js.Object {
    var AppId: js.UndefOr[__string]
    var ChallengeCode: js.UndefOr[__string]
    var SessionId: js.UndefOr[__string]
    var Ttl: js.UndefOr[__string]
  }

  object CreateTokenResponse {
    @inline
    def apply(
        AppId: js.UndefOr[__string] = js.undefined,
        ChallengeCode: js.UndefOr[__string] = js.undefined,
        SessionId: js.UndefOr[__string] = js.undefined,
        Ttl: js.UndefOr[__string] = js.undefined
    ): CreateTokenResponse = {
      val __obj = js.Dynamic.literal()
      AppId.foreach(__v => __obj.updateDynamic("AppId")(__v.asInstanceOf[js.Any]))
      ChallengeCode.foreach(__v => __obj.updateDynamic("ChallengeCode")(__v.asInstanceOf[js.Any]))
      SessionId.foreach(__v => __obj.updateDynamic("SessionId")(__v.asInstanceOf[js.Any]))
      Ttl.foreach(__v => __obj.updateDynamic("Ttl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTokenResponse]
    }
  }

  /** The request body for DeleteBackendAPI.
    */
  @js.native
  trait DeleteBackendAPIRequest extends js.Object {
    var AppId: __string
    var BackendEnvironmentName: __string
    var ResourceName: __string
    var ResourceConfig: js.UndefOr[BackendAPIResourceConfig]
  }

  object DeleteBackendAPIRequest {
    @inline
    def apply(
        AppId: __string,
        BackendEnvironmentName: __string,
        ResourceName: __string,
        ResourceConfig: js.UndefOr[BackendAPIResourceConfig] = js.undefined
    ): DeleteBackendAPIRequest = {
      val __obj = js.Dynamic.literal(
        "AppId" -> AppId.asInstanceOf[js.Any],
        "BackendEnvironmentName" -> BackendEnvironmentName.asInstanceOf[js.Any],
        "ResourceName" -> ResourceName.asInstanceOf[js.Any]
      )

      ResourceConfig.foreach(__v => __obj.updateDynamic("ResourceConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteBackendAPIRequest]
    }
  }

  @js.native
  trait DeleteBackendAPIResponse extends js.Object {
    var AppId: js.UndefOr[__string]
    var BackendEnvironmentName: js.UndefOr[__string]
    var Error: js.UndefOr[__string]
    var JobId: js.UndefOr[__string]
    var Operation: js.UndefOr[__string]
    var Status: js.UndefOr[__string]
  }

  object DeleteBackendAPIResponse {
    @inline
    def apply(
        AppId: js.UndefOr[__string] = js.undefined,
        BackendEnvironmentName: js.UndefOr[__string] = js.undefined,
        Error: js.UndefOr[__string] = js.undefined,
        JobId: js.UndefOr[__string] = js.undefined,
        Operation: js.UndefOr[__string] = js.undefined,
        Status: js.UndefOr[__string] = js.undefined
    ): DeleteBackendAPIResponse = {
      val __obj = js.Dynamic.literal()
      AppId.foreach(__v => __obj.updateDynamic("AppId")(__v.asInstanceOf[js.Any]))
      BackendEnvironmentName.foreach(__v => __obj.updateDynamic("BackendEnvironmentName")(__v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      Operation.foreach(__v => __obj.updateDynamic("Operation")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteBackendAPIResponse]
    }
  }

  /** The request body for DeleteBackendAuth.
    */
  @js.native
  trait DeleteBackendAuthRequest extends js.Object {
    var AppId: __string
    var BackendEnvironmentName: __string
    var ResourceName: __string
  }

  object DeleteBackendAuthRequest {
    @inline
    def apply(
        AppId: __string,
        BackendEnvironmentName: __string,
        ResourceName: __string
    ): DeleteBackendAuthRequest = {
      val __obj = js.Dynamic.literal(
        "AppId" -> AppId.asInstanceOf[js.Any],
        "BackendEnvironmentName" -> BackendEnvironmentName.asInstanceOf[js.Any],
        "ResourceName" -> ResourceName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteBackendAuthRequest]
    }
  }

  @js.native
  trait DeleteBackendAuthResponse extends js.Object {
    var AppId: js.UndefOr[__string]
    var BackendEnvironmentName: js.UndefOr[__string]
    var Error: js.UndefOr[__string]
    var JobId: js.UndefOr[__string]
    var Operation: js.UndefOr[__string]
    var Status: js.UndefOr[__string]
  }

  object DeleteBackendAuthResponse {
    @inline
    def apply(
        AppId: js.UndefOr[__string] = js.undefined,
        BackendEnvironmentName: js.UndefOr[__string] = js.undefined,
        Error: js.UndefOr[__string] = js.undefined,
        JobId: js.UndefOr[__string] = js.undefined,
        Operation: js.UndefOr[__string] = js.undefined,
        Status: js.UndefOr[__string] = js.undefined
    ): DeleteBackendAuthResponse = {
      val __obj = js.Dynamic.literal()
      AppId.foreach(__v => __obj.updateDynamic("AppId")(__v.asInstanceOf[js.Any]))
      BackendEnvironmentName.foreach(__v => __obj.updateDynamic("BackendEnvironmentName")(__v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      Operation.foreach(__v => __obj.updateDynamic("Operation")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteBackendAuthResponse]
    }
  }

  @js.native
  trait DeleteBackendRequest extends js.Object {
    var AppId: __string
    var BackendEnvironmentName: __string
  }

  object DeleteBackendRequest {
    @inline
    def apply(
        AppId: __string,
        BackendEnvironmentName: __string
    ): DeleteBackendRequest = {
      val __obj = js.Dynamic.literal(
        "AppId" -> AppId.asInstanceOf[js.Any],
        "BackendEnvironmentName" -> BackendEnvironmentName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteBackendRequest]
    }
  }

  @js.native
  trait DeleteBackendResponse extends js.Object {
    var AppId: js.UndefOr[__string]
    var BackendEnvironmentName: js.UndefOr[__string]
    var Error: js.UndefOr[__string]
    var JobId: js.UndefOr[__string]
    var Operation: js.UndefOr[__string]
    var Status: js.UndefOr[__string]
  }

  object DeleteBackendResponse {
    @inline
    def apply(
        AppId: js.UndefOr[__string] = js.undefined,
        BackendEnvironmentName: js.UndefOr[__string] = js.undefined,
        Error: js.UndefOr[__string] = js.undefined,
        JobId: js.UndefOr[__string] = js.undefined,
        Operation: js.UndefOr[__string] = js.undefined,
        Status: js.UndefOr[__string] = js.undefined
    ): DeleteBackendResponse = {
      val __obj = js.Dynamic.literal()
      AppId.foreach(__v => __obj.updateDynamic("AppId")(__v.asInstanceOf[js.Any]))
      BackendEnvironmentName.foreach(__v => __obj.updateDynamic("BackendEnvironmentName")(__v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      Operation.foreach(__v => __obj.updateDynamic("Operation")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteBackendResponse]
    }
  }

  @js.native
  trait DeleteTokenRequest extends js.Object {
    var AppId: __string
    var SessionId: __string
  }

  object DeleteTokenRequest {
    @inline
    def apply(
        AppId: __string,
        SessionId: __string
    ): DeleteTokenRequest = {
      val __obj = js.Dynamic.literal(
        "AppId" -> AppId.asInstanceOf[js.Any],
        "SessionId" -> SessionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteTokenRequest]
    }
  }

  @js.native
  trait DeleteTokenResponse extends js.Object {
    var IsSuccess: js.UndefOr[__boolean]
  }

  object DeleteTokenResponse {
    @inline
    def apply(
        IsSuccess: js.UndefOr[__boolean] = js.undefined
    ): DeleteTokenResponse = {
      val __obj = js.Dynamic.literal()
      IsSuccess.foreach(__v => __obj.updateDynamic("IsSuccess")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteTokenResponse]
    }
  }

  /** The configuration for the email sent when an app user forgets their password.
    */
  @js.native
  trait EmailSettings extends js.Object {
    var EmailMessage: js.UndefOr[__string]
    var EmailSubject: js.UndefOr[__string]
  }

  object EmailSettings {
    @inline
    def apply(
        EmailMessage: js.UndefOr[__string] = js.undefined,
        EmailSubject: js.UndefOr[__string] = js.undefined
    ): EmailSettings = {
      val __obj = js.Dynamic.literal()
      EmailMessage.foreach(__v => __obj.updateDynamic("EmailMessage")(__v.asInstanceOf[js.Any]))
      EmailSubject.foreach(__v => __obj.updateDynamic("EmailSubject")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EmailSettings]
    }
  }

  /** The request body for GenerateBackendAPIModels.
    */
  @js.native
  trait GenerateBackendAPIModelsRequest extends js.Object {
    var AppId: __string
    var BackendEnvironmentName: __string
    var ResourceName: __string
  }

  object GenerateBackendAPIModelsRequest {
    @inline
    def apply(
        AppId: __string,
        BackendEnvironmentName: __string,
        ResourceName: __string
    ): GenerateBackendAPIModelsRequest = {
      val __obj = js.Dynamic.literal(
        "AppId" -> AppId.asInstanceOf[js.Any],
        "BackendEnvironmentName" -> BackendEnvironmentName.asInstanceOf[js.Any],
        "ResourceName" -> ResourceName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GenerateBackendAPIModelsRequest]
    }
  }

  @js.native
  trait GenerateBackendAPIModelsResponse extends js.Object {
    var AppId: js.UndefOr[__string]
    var BackendEnvironmentName: js.UndefOr[__string]
    var Error: js.UndefOr[__string]
    var JobId: js.UndefOr[__string]
    var Operation: js.UndefOr[__string]
    var Status: js.UndefOr[__string]
  }

  object GenerateBackendAPIModelsResponse {
    @inline
    def apply(
        AppId: js.UndefOr[__string] = js.undefined,
        BackendEnvironmentName: js.UndefOr[__string] = js.undefined,
        Error: js.UndefOr[__string] = js.undefined,
        JobId: js.UndefOr[__string] = js.undefined,
        Operation: js.UndefOr[__string] = js.undefined,
        Status: js.UndefOr[__string] = js.undefined
    ): GenerateBackendAPIModelsResponse = {
      val __obj = js.Dynamic.literal()
      AppId.foreach(__v => __obj.updateDynamic("AppId")(__v.asInstanceOf[js.Any]))
      BackendEnvironmentName.foreach(__v => __obj.updateDynamic("BackendEnvironmentName")(__v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      Operation.foreach(__v => __obj.updateDynamic("Operation")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GenerateBackendAPIModelsResponse]
    }
  }

  /** The request body for GetBackendAPIModels.
    */
  @js.native
  trait GetBackendAPIModelsRequest extends js.Object {
    var AppId: __string
    var BackendEnvironmentName: __string
    var ResourceName: __string
  }

  object GetBackendAPIModelsRequest {
    @inline
    def apply(
        AppId: __string,
        BackendEnvironmentName: __string,
        ResourceName: __string
    ): GetBackendAPIModelsRequest = {
      val __obj = js.Dynamic.literal(
        "AppId" -> AppId.asInstanceOf[js.Any],
        "BackendEnvironmentName" -> BackendEnvironmentName.asInstanceOf[js.Any],
        "ResourceName" -> ResourceName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetBackendAPIModelsRequest]
    }
  }

  @js.native
  trait GetBackendAPIModelsResponse extends js.Object {
    var Models: js.UndefOr[__string]
    var Status: js.UndefOr[Status]
  }

  object GetBackendAPIModelsResponse {
    @inline
    def apply(
        Models: js.UndefOr[__string] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): GetBackendAPIModelsResponse = {
      val __obj = js.Dynamic.literal()
      Models.foreach(__v => __obj.updateDynamic("Models")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBackendAPIModelsResponse]
    }
  }

  /** The request body for GetBackendAPI.
    */
  @js.native
  trait GetBackendAPIRequest extends js.Object {
    var AppId: __string
    var BackendEnvironmentName: __string
    var ResourceName: __string
    var ResourceConfig: js.UndefOr[BackendAPIResourceConfig]
  }

  object GetBackendAPIRequest {
    @inline
    def apply(
        AppId: __string,
        BackendEnvironmentName: __string,
        ResourceName: __string,
        ResourceConfig: js.UndefOr[BackendAPIResourceConfig] = js.undefined
    ): GetBackendAPIRequest = {
      val __obj = js.Dynamic.literal(
        "AppId" -> AppId.asInstanceOf[js.Any],
        "BackendEnvironmentName" -> BackendEnvironmentName.asInstanceOf[js.Any],
        "ResourceName" -> ResourceName.asInstanceOf[js.Any]
      )

      ResourceConfig.foreach(__v => __obj.updateDynamic("ResourceConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBackendAPIRequest]
    }
  }

  @js.native
  trait GetBackendAPIResponse extends js.Object {
    var AppId: js.UndefOr[__string]
    var BackendEnvironmentName: js.UndefOr[__string]
    var Error: js.UndefOr[__string]
    var ResourceConfig: js.UndefOr[BackendAPIResourceConfig]
    var ResourceName: js.UndefOr[__string]
  }

  object GetBackendAPIResponse {
    @inline
    def apply(
        AppId: js.UndefOr[__string] = js.undefined,
        BackendEnvironmentName: js.UndefOr[__string] = js.undefined,
        Error: js.UndefOr[__string] = js.undefined,
        ResourceConfig: js.UndefOr[BackendAPIResourceConfig] = js.undefined,
        ResourceName: js.UndefOr[__string] = js.undefined
    ): GetBackendAPIResponse = {
      val __obj = js.Dynamic.literal()
      AppId.foreach(__v => __obj.updateDynamic("AppId")(__v.asInstanceOf[js.Any]))
      BackendEnvironmentName.foreach(__v => __obj.updateDynamic("BackendEnvironmentName")(__v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      ResourceConfig.foreach(__v => __obj.updateDynamic("ResourceConfig")(__v.asInstanceOf[js.Any]))
      ResourceName.foreach(__v => __obj.updateDynamic("ResourceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBackendAPIResponse]
    }
  }

  /** The request body for GetBackendAuth.
    */
  @js.native
  trait GetBackendAuthRequest extends js.Object {
    var AppId: __string
    var BackendEnvironmentName: __string
    var ResourceName: __string
  }

  object GetBackendAuthRequest {
    @inline
    def apply(
        AppId: __string,
        BackendEnvironmentName: __string,
        ResourceName: __string
    ): GetBackendAuthRequest = {
      val __obj = js.Dynamic.literal(
        "AppId" -> AppId.asInstanceOf[js.Any],
        "BackendEnvironmentName" -> BackendEnvironmentName.asInstanceOf[js.Any],
        "ResourceName" -> ResourceName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetBackendAuthRequest]
    }
  }

  @js.native
  trait GetBackendAuthResponse extends js.Object {
    var AppId: js.UndefOr[__string]
    var BackendEnvironmentName: js.UndefOr[__string]
    var Error: js.UndefOr[__string]
    var ResourceConfig: js.UndefOr[CreateBackendAuthResourceConfig]
    var ResourceName: js.UndefOr[__string]
  }

  object GetBackendAuthResponse {
    @inline
    def apply(
        AppId: js.UndefOr[__string] = js.undefined,
        BackendEnvironmentName: js.UndefOr[__string] = js.undefined,
        Error: js.UndefOr[__string] = js.undefined,
        ResourceConfig: js.UndefOr[CreateBackendAuthResourceConfig] = js.undefined,
        ResourceName: js.UndefOr[__string] = js.undefined
    ): GetBackendAuthResponse = {
      val __obj = js.Dynamic.literal()
      AppId.foreach(__v => __obj.updateDynamic("AppId")(__v.asInstanceOf[js.Any]))
      BackendEnvironmentName.foreach(__v => __obj.updateDynamic("BackendEnvironmentName")(__v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      ResourceConfig.foreach(__v => __obj.updateDynamic("ResourceConfig")(__v.asInstanceOf[js.Any]))
      ResourceName.foreach(__v => __obj.updateDynamic("ResourceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBackendAuthResponse]
    }
  }

  @js.native
  trait GetBackendJobRequest extends js.Object {
    var AppId: __string
    var BackendEnvironmentName: __string
    var JobId: __string
  }

  object GetBackendJobRequest {
    @inline
    def apply(
        AppId: __string,
        BackendEnvironmentName: __string,
        JobId: __string
    ): GetBackendJobRequest = {
      val __obj = js.Dynamic.literal(
        "AppId" -> AppId.asInstanceOf[js.Any],
        "BackendEnvironmentName" -> BackendEnvironmentName.asInstanceOf[js.Any],
        "JobId" -> JobId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetBackendJobRequest]
    }
  }

  @js.native
  trait GetBackendJobResponse extends js.Object {
    var AppId: js.UndefOr[__string]
    var BackendEnvironmentName: js.UndefOr[__string]
    var CreateTime: js.UndefOr[__string]
    var Error: js.UndefOr[__string]
    var JobId: js.UndefOr[__string]
    var Operation: js.UndefOr[__string]
    var Status: js.UndefOr[__string]
    var UpdateTime: js.UndefOr[__string]
  }

  object GetBackendJobResponse {
    @inline
    def apply(
        AppId: js.UndefOr[__string] = js.undefined,
        BackendEnvironmentName: js.UndefOr[__string] = js.undefined,
        CreateTime: js.UndefOr[__string] = js.undefined,
        Error: js.UndefOr[__string] = js.undefined,
        JobId: js.UndefOr[__string] = js.undefined,
        Operation: js.UndefOr[__string] = js.undefined,
        Status: js.UndefOr[__string] = js.undefined,
        UpdateTime: js.UndefOr[__string] = js.undefined
    ): GetBackendJobResponse = {
      val __obj = js.Dynamic.literal()
      AppId.foreach(__v => __obj.updateDynamic("AppId")(__v.asInstanceOf[js.Any]))
      BackendEnvironmentName.foreach(__v => __obj.updateDynamic("BackendEnvironmentName")(__v.asInstanceOf[js.Any]))
      CreateTime.foreach(__v => __obj.updateDynamic("CreateTime")(__v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      Operation.foreach(__v => __obj.updateDynamic("Operation")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdateTime.foreach(__v => __obj.updateDynamic("UpdateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBackendJobResponse]
    }
  }

  /** The request body for GetBackend.
    */
  @js.native
  trait GetBackendRequest extends js.Object {
    var AppId: __string
    var BackendEnvironmentName: js.UndefOr[__string]
  }

  object GetBackendRequest {
    @inline
    def apply(
        AppId: __string,
        BackendEnvironmentName: js.UndefOr[__string] = js.undefined
    ): GetBackendRequest = {
      val __obj = js.Dynamic.literal(
        "AppId" -> AppId.asInstanceOf[js.Any]
      )

      BackendEnvironmentName.foreach(__v => __obj.updateDynamic("BackendEnvironmentName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBackendRequest]
    }
  }

  @js.native
  trait GetBackendResponse extends js.Object {
    var AmplifyMetaConfig: js.UndefOr[__string]
    var AppId: js.UndefOr[__string]
    var AppName: js.UndefOr[__string]
    var BackendEnvironmentList: js.UndefOr[ListOf__string]
    var BackendEnvironmentName: js.UndefOr[__string]
    var Error: js.UndefOr[__string]
  }

  object GetBackendResponse {
    @inline
    def apply(
        AmplifyMetaConfig: js.UndefOr[__string] = js.undefined,
        AppId: js.UndefOr[__string] = js.undefined,
        AppName: js.UndefOr[__string] = js.undefined,
        BackendEnvironmentList: js.UndefOr[ListOf__string] = js.undefined,
        BackendEnvironmentName: js.UndefOr[__string] = js.undefined,
        Error: js.UndefOr[__string] = js.undefined
    ): GetBackendResponse = {
      val __obj = js.Dynamic.literal()
      AmplifyMetaConfig.foreach(__v => __obj.updateDynamic("AmplifyMetaConfig")(__v.asInstanceOf[js.Any]))
      AppId.foreach(__v => __obj.updateDynamic("AppId")(__v.asInstanceOf[js.Any]))
      AppName.foreach(__v => __obj.updateDynamic("AppName")(__v.asInstanceOf[js.Any]))
      BackendEnvironmentList.foreach(__v => __obj.updateDynamic("BackendEnvironmentList")(__v.asInstanceOf[js.Any]))
      BackendEnvironmentName.foreach(__v => __obj.updateDynamic("BackendEnvironmentName")(__v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBackendResponse]
    }
  }

  @js.native
  trait GetTokenRequest extends js.Object {
    var AppId: __string
    var SessionId: __string
  }

  object GetTokenRequest {
    @inline
    def apply(
        AppId: __string,
        SessionId: __string
    ): GetTokenRequest = {
      val __obj = js.Dynamic.literal(
        "AppId" -> AppId.asInstanceOf[js.Any],
        "SessionId" -> SessionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetTokenRequest]
    }
  }

  @js.native
  trait GetTokenResponse extends js.Object {
    var AppId: js.UndefOr[__string]
    var ChallengeCode: js.UndefOr[__string]
    var SessionId: js.UndefOr[__string]
    var Ttl: js.UndefOr[__string]
  }

  object GetTokenResponse {
    @inline
    def apply(
        AppId: js.UndefOr[__string] = js.undefined,
        ChallengeCode: js.UndefOr[__string] = js.undefined,
        SessionId: js.UndefOr[__string] = js.undefined,
        Ttl: js.UndefOr[__string] = js.undefined
    ): GetTokenResponse = {
      val __obj = js.Dynamic.literal()
      AppId.foreach(__v => __obj.updateDynamic("AppId")(__v.asInstanceOf[js.Any]))
      ChallengeCode.foreach(__v => __obj.updateDynamic("ChallengeCode")(__v.asInstanceOf[js.Any]))
      SessionId.foreach(__v => __obj.updateDynamic("SessionId")(__v.asInstanceOf[js.Any]))
      Ttl.foreach(__v => __obj.updateDynamic("Ttl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTokenResponse]
    }
  }

  /** The request body for ListBackendJobs.
    */
  @js.native
  trait ListBackendJobsRequest extends js.Object {
    var AppId: __string
    var BackendEnvironmentName: __string
    var JobId: js.UndefOr[__string]
    var MaxResults: js.UndefOr[__integerMin1Max25]
    var NextToken: js.UndefOr[__string]
    var Operation: js.UndefOr[__string]
    var Status: js.UndefOr[__string]
  }

  object ListBackendJobsRequest {
    @inline
    def apply(
        AppId: __string,
        BackendEnvironmentName: __string,
        JobId: js.UndefOr[__string] = js.undefined,
        MaxResults: js.UndefOr[__integerMin1Max25] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        Operation: js.UndefOr[__string] = js.undefined,
        Status: js.UndefOr[__string] = js.undefined
    ): ListBackendJobsRequest = {
      val __obj = js.Dynamic.literal(
        "AppId" -> AppId.asInstanceOf[js.Any],
        "BackendEnvironmentName" -> BackendEnvironmentName.asInstanceOf[js.Any]
      )

      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Operation.foreach(__v => __obj.updateDynamic("Operation")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBackendJobsRequest]
    }
  }

  @js.native
  trait ListBackendJobsResponse extends js.Object {
    var Jobs: js.UndefOr[ListOfBackendJobRespObj]
    var NextToken: js.UndefOr[__string]
  }

  object ListBackendJobsResponse {
    @inline
    def apply(
        Jobs: js.UndefOr[ListOfBackendJobRespObj] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListBackendJobsResponse = {
      val __obj = js.Dynamic.literal()
      Jobs.foreach(__v => __obj.updateDynamic("Jobs")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBackendJobsResponse]
    }
  }

  /** The request object for this operation.
    */
  @js.native
  trait LoginAuthConfigReqObj extends js.Object {
    var AwsCognitoIdentityPoolId: js.UndefOr[__string]
    var AwsCognitoRegion: js.UndefOr[__string]
    var AwsUserPoolsId: js.UndefOr[__string]
    var AwsUserPoolsWebClientId: js.UndefOr[__string]
  }

  object LoginAuthConfigReqObj {
    @inline
    def apply(
        AwsCognitoIdentityPoolId: js.UndefOr[__string] = js.undefined,
        AwsCognitoRegion: js.UndefOr[__string] = js.undefined,
        AwsUserPoolsId: js.UndefOr[__string] = js.undefined,
        AwsUserPoolsWebClientId: js.UndefOr[__string] = js.undefined
    ): LoginAuthConfigReqObj = {
      val __obj = js.Dynamic.literal()
      AwsCognitoIdentityPoolId.foreach(__v => __obj.updateDynamic("AwsCognitoIdentityPoolId")(__v.asInstanceOf[js.Any]))
      AwsCognitoRegion.foreach(__v => __obj.updateDynamic("AwsCognitoRegion")(__v.asInstanceOf[js.Any]))
      AwsUserPoolsId.foreach(__v => __obj.updateDynamic("AwsUserPoolsId")(__v.asInstanceOf[js.Any]))
      AwsUserPoolsWebClientId.foreach(__v => __obj.updateDynamic("AwsUserPoolsWebClientId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoginAuthConfigReqObj]
    }
  }

  /** The request body for RemoveAllBackends.
    */
  @js.native
  trait RemoveAllBackendsRequest extends js.Object {
    var AppId: __string
    var CleanAmplifyApp: js.UndefOr[__boolean]
  }

  object RemoveAllBackendsRequest {
    @inline
    def apply(
        AppId: __string,
        CleanAmplifyApp: js.UndefOr[__boolean] = js.undefined
    ): RemoveAllBackendsRequest = {
      val __obj = js.Dynamic.literal(
        "AppId" -> AppId.asInstanceOf[js.Any]
      )

      CleanAmplifyApp.foreach(__v => __obj.updateDynamic("CleanAmplifyApp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveAllBackendsRequest]
    }
  }

  @js.native
  trait RemoveAllBackendsResponse extends js.Object {
    var AppId: js.UndefOr[__string]
    var Error: js.UndefOr[__string]
    var JobId: js.UndefOr[__string]
    var Operation: js.UndefOr[__string]
    var Status: js.UndefOr[__string]
  }

  object RemoveAllBackendsResponse {
    @inline
    def apply(
        AppId: js.UndefOr[__string] = js.undefined,
        Error: js.UndefOr[__string] = js.undefined,
        JobId: js.UndefOr[__string] = js.undefined,
        Operation: js.UndefOr[__string] = js.undefined,
        Status: js.UndefOr[__string] = js.undefined
    ): RemoveAllBackendsResponse = {
      val __obj = js.Dynamic.literal()
      AppId.foreach(__v => __obj.updateDynamic("AppId")(__v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      Operation.foreach(__v => __obj.updateDynamic("Operation")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveAllBackendsResponse]
    }
  }

  @js.native
  trait RemoveBackendConfigRequest extends js.Object {
    var AppId: __string
  }

  object RemoveBackendConfigRequest {
    @inline
    def apply(
        AppId: __string
    ): RemoveBackendConfigRequest = {
      val __obj = js.Dynamic.literal(
        "AppId" -> AppId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RemoveBackendConfigRequest]
    }
  }

  @js.native
  trait RemoveBackendConfigResponse extends js.Object {
    var Error: js.UndefOr[__string]
  }

  object RemoveBackendConfigResponse {
    @inline
    def apply(
        Error: js.UndefOr[__string] = js.undefined
    ): RemoveBackendConfigResponse = {
      val __obj = js.Dynamic.literal()
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveBackendConfigResponse]
    }
  }

  /** Defines the resource configuration for the data model in your Amplify project.
    */
  @js.native
  trait ResourceConfig extends js.Object

  object ResourceConfig {
    @inline
    def apply(): ResourceConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResourceConfig]
    }
  }

  /** The settings of your MFA configuration for the backend of your Amplify project.
    */
  @js.native
  trait Settings extends js.Object {
    var MfaTypes: js.UndefOr[ListOfMfaTypesElement]
    var SmsMessage: js.UndefOr[__string]
  }

  object Settings {
    @inline
    def apply(
        MfaTypes: js.UndefOr[ListOfMfaTypesElement] = js.undefined,
        SmsMessage: js.UndefOr[__string] = js.undefined
    ): Settings = {
      val __obj = js.Dynamic.literal()
      MfaTypes.foreach(__v => __obj.updateDynamic("MfaTypes")(__v.asInstanceOf[js.Any]))
      SmsMessage.foreach(__v => __obj.updateDynamic("SmsMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Settings]
    }
  }

  /** SMS settings for authentication.
    */
  @js.native
  trait SmsSettings extends js.Object {
    var SmsMessage: js.UndefOr[__string]
  }

  object SmsSettings {
    @inline
    def apply(
        SmsMessage: js.UndefOr[__string] = js.undefined
    ): SmsSettings = {
      val __obj = js.Dynamic.literal()
      SmsMessage.foreach(__v => __obj.updateDynamic("SmsMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SmsSettings]
    }
  }

  /** The settings for using the social identity providers for access to your Amplify app.
    */
  @js.native
  trait SocialProviderSettings extends js.Object {
    var Facebook: js.UndefOr[BackendAuthSocialProviderConfig]
    var Google: js.UndefOr[BackendAuthSocialProviderConfig]
    var LoginWithAmazon: js.UndefOr[BackendAuthSocialProviderConfig]
  }

  object SocialProviderSettings {
    @inline
    def apply(
        Facebook: js.UndefOr[BackendAuthSocialProviderConfig] = js.undefined,
        Google: js.UndefOr[BackendAuthSocialProviderConfig] = js.undefined,
        LoginWithAmazon: js.UndefOr[BackendAuthSocialProviderConfig] = js.undefined
    ): SocialProviderSettings = {
      val __obj = js.Dynamic.literal()
      Facebook.foreach(__v => __obj.updateDynamic("Facebook")(__v.asInstanceOf[js.Any]))
      Google.foreach(__v => __obj.updateDynamic("Google")(__v.asInstanceOf[js.Any]))
      LoginWithAmazon.foreach(__v => __obj.updateDynamic("LoginWithAmazon")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SocialProviderSettings]
    }
  }

  /** The request body for UpdateBackendAPI.
    */
  @js.native
  trait UpdateBackendAPIRequest extends js.Object {
    var AppId: __string
    var BackendEnvironmentName: __string
    var ResourceName: __string
    var ResourceConfig: js.UndefOr[BackendAPIResourceConfig]
  }

  object UpdateBackendAPIRequest {
    @inline
    def apply(
        AppId: __string,
        BackendEnvironmentName: __string,
        ResourceName: __string,
        ResourceConfig: js.UndefOr[BackendAPIResourceConfig] = js.undefined
    ): UpdateBackendAPIRequest = {
      val __obj = js.Dynamic.literal(
        "AppId" -> AppId.asInstanceOf[js.Any],
        "BackendEnvironmentName" -> BackendEnvironmentName.asInstanceOf[js.Any],
        "ResourceName" -> ResourceName.asInstanceOf[js.Any]
      )

      ResourceConfig.foreach(__v => __obj.updateDynamic("ResourceConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBackendAPIRequest]
    }
  }

  @js.native
  trait UpdateBackendAPIResponse extends js.Object {
    var AppId: js.UndefOr[__string]
    var BackendEnvironmentName: js.UndefOr[__string]
    var Error: js.UndefOr[__string]
    var JobId: js.UndefOr[__string]
    var Operation: js.UndefOr[__string]
    var Status: js.UndefOr[__string]
  }

  object UpdateBackendAPIResponse {
    @inline
    def apply(
        AppId: js.UndefOr[__string] = js.undefined,
        BackendEnvironmentName: js.UndefOr[__string] = js.undefined,
        Error: js.UndefOr[__string] = js.undefined,
        JobId: js.UndefOr[__string] = js.undefined,
        Operation: js.UndefOr[__string] = js.undefined,
        Status: js.UndefOr[__string] = js.undefined
    ): UpdateBackendAPIResponse = {
      val __obj = js.Dynamic.literal()
      AppId.foreach(__v => __obj.updateDynamic("AppId")(__v.asInstanceOf[js.Any]))
      BackendEnvironmentName.foreach(__v => __obj.updateDynamic("BackendEnvironmentName")(__v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      Operation.foreach(__v => __obj.updateDynamic("Operation")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBackendAPIResponse]
    }
  }

  /** Describes the forgot password policy for authenticating into the Amplify app.
    */
  @js.native
  trait UpdateBackendAuthForgotPasswordConfig extends js.Object {
    var DeliveryMethod: js.UndefOr[DeliveryMethod]
    var EmailSettings: js.UndefOr[EmailSettings]
    var SmsSettings: js.UndefOr[SmsSettings]
  }

  object UpdateBackendAuthForgotPasswordConfig {
    @inline
    def apply(
        DeliveryMethod: js.UndefOr[DeliveryMethod] = js.undefined,
        EmailSettings: js.UndefOr[EmailSettings] = js.undefined,
        SmsSettings: js.UndefOr[SmsSettings] = js.undefined
    ): UpdateBackendAuthForgotPasswordConfig = {
      val __obj = js.Dynamic.literal()
      DeliveryMethod.foreach(__v => __obj.updateDynamic("DeliveryMethod")(__v.asInstanceOf[js.Any]))
      EmailSettings.foreach(__v => __obj.updateDynamic("EmailSettings")(__v.asInstanceOf[js.Any]))
      SmsSettings.foreach(__v => __obj.updateDynamic("SmsSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBackendAuthForgotPasswordConfig]
    }
  }

  /** Describes the authorization configuration for the Amazon Cognito identity pool, provisioned as a part of your auth resource in the Amplify project.
    */
  @js.native
  trait UpdateBackendAuthIdentityPoolConfig extends js.Object {
    var UnauthenticatedLogin: js.UndefOr[__boolean]
  }

  object UpdateBackendAuthIdentityPoolConfig {
    @inline
    def apply(
        UnauthenticatedLogin: js.UndefOr[__boolean] = js.undefined
    ): UpdateBackendAuthIdentityPoolConfig = {
      val __obj = js.Dynamic.literal()
      UnauthenticatedLogin.foreach(__v => __obj.updateDynamic("UnauthenticatedLogin")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBackendAuthIdentityPoolConfig]
    }
  }

  /** Updates the multi-factor authentication (MFA) configuration for the backend of your Amplify project.
    */
  @js.native
  trait UpdateBackendAuthMFAConfig extends js.Object {
    var MFAMode: js.UndefOr[MFAMode]
    var Settings: js.UndefOr[Settings]
  }

  object UpdateBackendAuthMFAConfig {
    @inline
    def apply(
        MFAMode: js.UndefOr[MFAMode] = js.undefined,
        Settings: js.UndefOr[Settings] = js.undefined
    ): UpdateBackendAuthMFAConfig = {
      val __obj = js.Dynamic.literal()
      MFAMode.foreach(__v => __obj.updateDynamic("MFAMode")(__v.asInstanceOf[js.Any]))
      Settings.foreach(__v => __obj.updateDynamic("Settings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBackendAuthMFAConfig]
    }
  }

  /** The OAuth configurations for authenticating users into your Amplify app.
    */
  @js.native
  trait UpdateBackendAuthOAuthConfig extends js.Object {
    var DomainPrefix: js.UndefOr[__string]
    var OAuthGrantType: js.UndefOr[OAuthGrantType]
    var OAuthScopes: js.UndefOr[ListOfOAuthScopesElement]
    var RedirectSignInURIs: js.UndefOr[ListOf__string]
    var RedirectSignOutURIs: js.UndefOr[ListOf__string]
    var SocialProviderSettings: js.UndefOr[SocialProviderSettings]
  }

  object UpdateBackendAuthOAuthConfig {
    @inline
    def apply(
        DomainPrefix: js.UndefOr[__string] = js.undefined,
        OAuthGrantType: js.UndefOr[OAuthGrantType] = js.undefined,
        OAuthScopes: js.UndefOr[ListOfOAuthScopesElement] = js.undefined,
        RedirectSignInURIs: js.UndefOr[ListOf__string] = js.undefined,
        RedirectSignOutURIs: js.UndefOr[ListOf__string] = js.undefined,
        SocialProviderSettings: js.UndefOr[SocialProviderSettings] = js.undefined
    ): UpdateBackendAuthOAuthConfig = {
      val __obj = js.Dynamic.literal()
      DomainPrefix.foreach(__v => __obj.updateDynamic("DomainPrefix")(__v.asInstanceOf[js.Any]))
      OAuthGrantType.foreach(__v => __obj.updateDynamic("OAuthGrantType")(__v.asInstanceOf[js.Any]))
      OAuthScopes.foreach(__v => __obj.updateDynamic("OAuthScopes")(__v.asInstanceOf[js.Any]))
      RedirectSignInURIs.foreach(__v => __obj.updateDynamic("RedirectSignInURIs")(__v.asInstanceOf[js.Any]))
      RedirectSignOutURIs.foreach(__v => __obj.updateDynamic("RedirectSignOutURIs")(__v.asInstanceOf[js.Any]))
      SocialProviderSettings.foreach(__v => __obj.updateDynamic("SocialProviderSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBackendAuthOAuthConfig]
    }
  }

  /** Describes the password policy for your Amazon Cognito user pool that's configured as a part of your Amplify project.
    */
  @js.native
  trait UpdateBackendAuthPasswordPolicyConfig extends js.Object {
    var AdditionalConstraints: js.UndefOr[ListOfAdditionalConstraintsElement]
    var MinimumLength: js.UndefOr[__double]
  }

  object UpdateBackendAuthPasswordPolicyConfig {
    @inline
    def apply(
        AdditionalConstraints: js.UndefOr[ListOfAdditionalConstraintsElement] = js.undefined,
        MinimumLength: js.UndefOr[__double] = js.undefined
    ): UpdateBackendAuthPasswordPolicyConfig = {
      val __obj = js.Dynamic.literal()
      AdditionalConstraints.foreach(__v => __obj.updateDynamic("AdditionalConstraints")(__v.asInstanceOf[js.Any]))
      MinimumLength.foreach(__v => __obj.updateDynamic("MinimumLength")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBackendAuthPasswordPolicyConfig]
    }
  }

  /** The request body for UpdateBackendAuth.
    */
  @js.native
  trait UpdateBackendAuthRequest extends js.Object {
    var AppId: __string
    var BackendEnvironmentName: __string
    var ResourceConfig: UpdateBackendAuthResourceConfig
    var ResourceName: __string
  }

  object UpdateBackendAuthRequest {
    @inline
    def apply(
        AppId: __string,
        BackendEnvironmentName: __string,
        ResourceConfig: UpdateBackendAuthResourceConfig,
        ResourceName: __string
    ): UpdateBackendAuthRequest = {
      val __obj = js.Dynamic.literal(
        "AppId" -> AppId.asInstanceOf[js.Any],
        "BackendEnvironmentName" -> BackendEnvironmentName.asInstanceOf[js.Any],
        "ResourceConfig" -> ResourceConfig.asInstanceOf[js.Any],
        "ResourceName" -> ResourceName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateBackendAuthRequest]
    }
  }

  /** Defines the resource configuration when updating an authentication resource in your Amplify project.
    */
  @js.native
  trait UpdateBackendAuthResourceConfig extends js.Object {
    var AuthResources: AuthResources
    var Service: Service
    var UserPoolConfigs: UpdateBackendAuthUserPoolConfig
    var IdentityPoolConfigs: js.UndefOr[UpdateBackendAuthIdentityPoolConfig]
  }

  object UpdateBackendAuthResourceConfig {
    @inline
    def apply(
        AuthResources: AuthResources,
        Service: Service,
        UserPoolConfigs: UpdateBackendAuthUserPoolConfig,
        IdentityPoolConfigs: js.UndefOr[UpdateBackendAuthIdentityPoolConfig] = js.undefined
    ): UpdateBackendAuthResourceConfig = {
      val __obj = js.Dynamic.literal(
        "AuthResources" -> AuthResources.asInstanceOf[js.Any],
        "Service" -> Service.asInstanceOf[js.Any],
        "UserPoolConfigs" -> UserPoolConfigs.asInstanceOf[js.Any]
      )

      IdentityPoolConfigs.foreach(__v => __obj.updateDynamic("IdentityPoolConfigs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBackendAuthResourceConfig]
    }
  }

  @js.native
  trait UpdateBackendAuthResponse extends js.Object {
    var AppId: js.UndefOr[__string]
    var BackendEnvironmentName: js.UndefOr[__string]
    var Error: js.UndefOr[__string]
    var JobId: js.UndefOr[__string]
    var Operation: js.UndefOr[__string]
    var Status: js.UndefOr[__string]
  }

  object UpdateBackendAuthResponse {
    @inline
    def apply(
        AppId: js.UndefOr[__string] = js.undefined,
        BackendEnvironmentName: js.UndefOr[__string] = js.undefined,
        Error: js.UndefOr[__string] = js.undefined,
        JobId: js.UndefOr[__string] = js.undefined,
        Operation: js.UndefOr[__string] = js.undefined,
        Status: js.UndefOr[__string] = js.undefined
    ): UpdateBackendAuthResponse = {
      val __obj = js.Dynamic.literal()
      AppId.foreach(__v => __obj.updateDynamic("AppId")(__v.asInstanceOf[js.Any]))
      BackendEnvironmentName.foreach(__v => __obj.updateDynamic("BackendEnvironmentName")(__v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      Operation.foreach(__v => __obj.updateDynamic("Operation")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBackendAuthResponse]
    }
  }

  /** Describes the Amazon Cognito user pool configuration to configure the authorization resource for your Amplify project on an update.
    */
  @js.native
  trait UpdateBackendAuthUserPoolConfig extends js.Object {
    var ForgotPassword: js.UndefOr[UpdateBackendAuthForgotPasswordConfig]
    var Mfa: js.UndefOr[UpdateBackendAuthMFAConfig]
    var OAuth: js.UndefOr[UpdateBackendAuthOAuthConfig]
    var PasswordPolicy: js.UndefOr[UpdateBackendAuthPasswordPolicyConfig]
  }

  object UpdateBackendAuthUserPoolConfig {
    @inline
    def apply(
        ForgotPassword: js.UndefOr[UpdateBackendAuthForgotPasswordConfig] = js.undefined,
        Mfa: js.UndefOr[UpdateBackendAuthMFAConfig] = js.undefined,
        OAuth: js.UndefOr[UpdateBackendAuthOAuthConfig] = js.undefined,
        PasswordPolicy: js.UndefOr[UpdateBackendAuthPasswordPolicyConfig] = js.undefined
    ): UpdateBackendAuthUserPoolConfig = {
      val __obj = js.Dynamic.literal()
      ForgotPassword.foreach(__v => __obj.updateDynamic("ForgotPassword")(__v.asInstanceOf[js.Any]))
      Mfa.foreach(__v => __obj.updateDynamic("Mfa")(__v.asInstanceOf[js.Any]))
      OAuth.foreach(__v => __obj.updateDynamic("OAuth")(__v.asInstanceOf[js.Any]))
      PasswordPolicy.foreach(__v => __obj.updateDynamic("PasswordPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBackendAuthUserPoolConfig]
    }
  }

  /** The request body for UpdateBackendConfig.
    */
  @js.native
  trait UpdateBackendConfigRequest extends js.Object {
    var AppId: __string
    var LoginAuthConfig: js.UndefOr[LoginAuthConfigReqObj]
  }

  object UpdateBackendConfigRequest {
    @inline
    def apply(
        AppId: __string,
        LoginAuthConfig: js.UndefOr[LoginAuthConfigReqObj] = js.undefined
    ): UpdateBackendConfigRequest = {
      val __obj = js.Dynamic.literal(
        "AppId" -> AppId.asInstanceOf[js.Any]
      )

      LoginAuthConfig.foreach(__v => __obj.updateDynamic("LoginAuthConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBackendConfigRequest]
    }
  }

  @js.native
  trait UpdateBackendConfigResponse extends js.Object {
    var AppId: js.UndefOr[__string]
    var BackendManagerAppId: js.UndefOr[__string]
    var Error: js.UndefOr[__string]
    var LoginAuthConfig: js.UndefOr[LoginAuthConfigReqObj]
  }

  object UpdateBackendConfigResponse {
    @inline
    def apply(
        AppId: js.UndefOr[__string] = js.undefined,
        BackendManagerAppId: js.UndefOr[__string] = js.undefined,
        Error: js.UndefOr[__string] = js.undefined,
        LoginAuthConfig: js.UndefOr[LoginAuthConfigReqObj] = js.undefined
    ): UpdateBackendConfigResponse = {
      val __obj = js.Dynamic.literal()
      AppId.foreach(__v => __obj.updateDynamic("AppId")(__v.asInstanceOf[js.Any]))
      BackendManagerAppId.foreach(__v => __obj.updateDynamic("BackendManagerAppId")(__v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      LoginAuthConfig.foreach(__v => __obj.updateDynamic("LoginAuthConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBackendConfigResponse]
    }
  }

  /** The request body for GetBackendJob.
    */
  @js.native
  trait UpdateBackendJobRequest extends js.Object {
    var AppId: __string
    var BackendEnvironmentName: __string
    var JobId: __string
    var Operation: js.UndefOr[__string]
    var Status: js.UndefOr[__string]
  }

  object UpdateBackendJobRequest {
    @inline
    def apply(
        AppId: __string,
        BackendEnvironmentName: __string,
        JobId: __string,
        Operation: js.UndefOr[__string] = js.undefined,
        Status: js.UndefOr[__string] = js.undefined
    ): UpdateBackendJobRequest = {
      val __obj = js.Dynamic.literal(
        "AppId" -> AppId.asInstanceOf[js.Any],
        "BackendEnvironmentName" -> BackendEnvironmentName.asInstanceOf[js.Any],
        "JobId" -> JobId.asInstanceOf[js.Any]
      )

      Operation.foreach(__v => __obj.updateDynamic("Operation")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBackendJobRequest]
    }
  }

  @js.native
  trait UpdateBackendJobResponse extends js.Object {
    var AppId: js.UndefOr[__string]
    var BackendEnvironmentName: js.UndefOr[__string]
    var CreateTime: js.UndefOr[__string]
    var Error: js.UndefOr[__string]
    var JobId: js.UndefOr[__string]
    var Operation: js.UndefOr[__string]
    var Status: js.UndefOr[__string]
    var UpdateTime: js.UndefOr[__string]
  }

  object UpdateBackendJobResponse {
    @inline
    def apply(
        AppId: js.UndefOr[__string] = js.undefined,
        BackendEnvironmentName: js.UndefOr[__string] = js.undefined,
        CreateTime: js.UndefOr[__string] = js.undefined,
        Error: js.UndefOr[__string] = js.undefined,
        JobId: js.UndefOr[__string] = js.undefined,
        Operation: js.UndefOr[__string] = js.undefined,
        Status: js.UndefOr[__string] = js.undefined,
        UpdateTime: js.UndefOr[__string] = js.undefined
    ): UpdateBackendJobResponse = {
      val __obj = js.Dynamic.literal()
      AppId.foreach(__v => __obj.updateDynamic("AppId")(__v.asInstanceOf[js.Any]))
      BackendEnvironmentName.foreach(__v => __obj.updateDynamic("BackendEnvironmentName")(__v.asInstanceOf[js.Any]))
      CreateTime.foreach(__v => __obj.updateDynamic("CreateTime")(__v.asInstanceOf[js.Any]))
      Error.foreach(__v => __obj.updateDynamic("Error")(__v.asInstanceOf[js.Any]))
      JobId.foreach(__v => __obj.updateDynamic("JobId")(__v.asInstanceOf[js.Any]))
      Operation.foreach(__v => __obj.updateDynamic("Operation")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdateTime.foreach(__v => __obj.updateDynamic("UpdateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBackendJobResponse]
    }
  }
}
