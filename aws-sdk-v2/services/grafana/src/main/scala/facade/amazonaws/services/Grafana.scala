package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object grafana {
  type AllowedOrganization = String
  type AllowedOrganizations = js.Array[AllowedOrganization]
  type ApiKeyName = String
  type ApiKeyToken = String
  type AssertionAttribute = String
  type AuthenticationProviders = js.Array[AuthenticationProviderTypes]
  type ClientToken = String
  type CreateWorkspaceApiKeyRequestSecondsToLiveInteger = Int
  type DataSourceTypesList = js.Array[DataSourceType]
  type Description = String
  type Endpoint = String
  type GrafanaVersion = String
  type IamRoleArn = String
  type IdpMetadataUrl = String
  type ListPermissionsRequestMaxResultsInteger = Int
  type ListWorkspacesRequestMaxResultsInteger = Int
  type LoginValidityDuration = Int
  type NotificationDestinationsList = js.Array[NotificationDestinationType]
  type OrganizationRoleName = String
  type OrganizationalUnit = String
  type OrganizationalUnitList = js.Array[OrganizationalUnit]
  type OverridableConfigurationJson = String
  type PaginationToken = String
  type PermissionEntryList = js.Array[PermissionEntry]
  type RoleValue = String
  type RoleValueList = js.Array[RoleValue]
  type SSOClientId = String
  type SecurityGroupId = String
  type SecurityGroupIds = js.Array[SecurityGroupId]
  type SsoId = String
  type StackSetName = String
  type SubnetId = String
  type SubnetIds = js.Array[SubnetId]
  type TagKey = String
  type TagKeys = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type Timestamp = js.Date
  type UpdateErrorCodeInteger = Int
  type UpdateErrorList = js.Array[UpdateError]
  type UpdateInstructionBatch = js.Array[UpdateInstruction]
  type UserList = js.Array[User]
  type WorkspaceId = String
  type WorkspaceList = js.Array[WorkspaceSummary]
  type WorkspaceName = String

  final class GrafanaOps(private val service: Grafana) extends AnyVal {

    @inline def associateLicenseFuture(params: AssociateLicenseRequest): Future[AssociateLicenseResponse] = service.associateLicense(params).promise().toFuture
    @inline def createWorkspaceApiKeyFuture(params: CreateWorkspaceApiKeyRequest): Future[CreateWorkspaceApiKeyResponse] = service.createWorkspaceApiKey(params).promise().toFuture
    @inline def createWorkspaceFuture(params: CreateWorkspaceRequest): Future[CreateWorkspaceResponse] = service.createWorkspace(params).promise().toFuture
    @inline def deleteWorkspaceApiKeyFuture(params: DeleteWorkspaceApiKeyRequest): Future[DeleteWorkspaceApiKeyResponse] = service.deleteWorkspaceApiKey(params).promise().toFuture
    @inline def deleteWorkspaceFuture(params: DeleteWorkspaceRequest): Future[DeleteWorkspaceResponse] = service.deleteWorkspace(params).promise().toFuture
    @inline def describeWorkspaceAuthenticationFuture(params: DescribeWorkspaceAuthenticationRequest): Future[DescribeWorkspaceAuthenticationResponse] = service.describeWorkspaceAuthentication(params).promise().toFuture
    @inline def describeWorkspaceConfigurationFuture(params: DescribeWorkspaceConfigurationRequest): Future[DescribeWorkspaceConfigurationResponse] = service.describeWorkspaceConfiguration(params).promise().toFuture
    @inline def describeWorkspaceFuture(params: DescribeWorkspaceRequest): Future[DescribeWorkspaceResponse] = service.describeWorkspace(params).promise().toFuture
    @inline def disassociateLicenseFuture(params: DisassociateLicenseRequest): Future[DisassociateLicenseResponse] = service.disassociateLicense(params).promise().toFuture
    @inline def listPermissionsFuture(params: ListPermissionsRequest): Future[ListPermissionsResponse] = service.listPermissions(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listWorkspacesFuture(params: ListWorkspacesRequest): Future[ListWorkspacesResponse] = service.listWorkspaces(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updatePermissionsFuture(params: UpdatePermissionsRequest): Future[UpdatePermissionsResponse] = service.updatePermissions(params).promise().toFuture
    @inline def updateWorkspaceAuthenticationFuture(params: UpdateWorkspaceAuthenticationRequest): Future[UpdateWorkspaceAuthenticationResponse] = service.updateWorkspaceAuthentication(params).promise().toFuture
    @inline def updateWorkspaceConfigurationFuture(params: UpdateWorkspaceConfigurationRequest): Future[UpdateWorkspaceConfigurationResponse] = service.updateWorkspaceConfiguration(params).promise().toFuture
    @inline def updateWorkspaceFuture(params: UpdateWorkspaceRequest): Future[UpdateWorkspaceResponse] = service.updateWorkspace(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/grafana", JSImport.Namespace, "AWS.Grafana")
  class Grafana() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateLicense(params: AssociateLicenseRequest): Request[AssociateLicenseResponse] = js.native
    def createWorkspace(params: CreateWorkspaceRequest): Request[CreateWorkspaceResponse] = js.native
    def createWorkspaceApiKey(params: CreateWorkspaceApiKeyRequest): Request[CreateWorkspaceApiKeyResponse] = js.native
    def deleteWorkspace(params: DeleteWorkspaceRequest): Request[DeleteWorkspaceResponse] = js.native
    def deleteWorkspaceApiKey(params: DeleteWorkspaceApiKeyRequest): Request[DeleteWorkspaceApiKeyResponse] = js.native
    def describeWorkspace(params: DescribeWorkspaceRequest): Request[DescribeWorkspaceResponse] = js.native
    def describeWorkspaceAuthentication(params: DescribeWorkspaceAuthenticationRequest): Request[DescribeWorkspaceAuthenticationResponse] = js.native
    def describeWorkspaceConfiguration(params: DescribeWorkspaceConfigurationRequest): Request[DescribeWorkspaceConfigurationResponse] = js.native
    def disassociateLicense(params: DisassociateLicenseRequest): Request[DisassociateLicenseResponse] = js.native
    def listPermissions(params: ListPermissionsRequest): Request[ListPermissionsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listWorkspaces(params: ListWorkspacesRequest): Request[ListWorkspacesResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updatePermissions(params: UpdatePermissionsRequest): Request[UpdatePermissionsResponse] = js.native
    def updateWorkspace(params: UpdateWorkspaceRequest): Request[UpdateWorkspaceResponse] = js.native
    def updateWorkspaceAuthentication(params: UpdateWorkspaceAuthenticationRequest): Request[UpdateWorkspaceAuthenticationResponse] = js.native
    def updateWorkspaceConfiguration(params: UpdateWorkspaceConfigurationRequest): Request[UpdateWorkspaceConfigurationResponse] = js.native
  }
  object Grafana {
    @inline implicit def toOps(service: Grafana): GrafanaOps = {
      new GrafanaOps(service)
    }
  }

  /** A structure that defines which attributes in the IdP assertion are to be used to define information about the users authenticated by the IdP to use the workspace.
    */
  @js.native
  trait AssertionAttributes extends js.Object {
    var email: js.UndefOr[AssertionAttribute]
    var groups: js.UndefOr[AssertionAttribute]
    var login: js.UndefOr[AssertionAttribute]
    var name: js.UndefOr[AssertionAttribute]
    var org: js.UndefOr[AssertionAttribute]
    var role: js.UndefOr[AssertionAttribute]
  }

  object AssertionAttributes {
    @inline
    def apply(
        email: js.UndefOr[AssertionAttribute] = js.undefined,
        groups: js.UndefOr[AssertionAttribute] = js.undefined,
        login: js.UndefOr[AssertionAttribute] = js.undefined,
        name: js.UndefOr[AssertionAttribute] = js.undefined,
        org: js.UndefOr[AssertionAttribute] = js.undefined,
        role: js.UndefOr[AssertionAttribute] = js.undefined
    ): AssertionAttributes = {
      val __obj = js.Dynamic.literal()
      email.foreach(__v => __obj.updateDynamic("email")(__v.asInstanceOf[js.Any]))
      groups.foreach(__v => __obj.updateDynamic("groups")(__v.asInstanceOf[js.Any]))
      login.foreach(__v => __obj.updateDynamic("login")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      org.foreach(__v => __obj.updateDynamic("org")(__v.asInstanceOf[js.Any]))
      role.foreach(__v => __obj.updateDynamic("role")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssertionAttributes]
    }
  }

  @js.native
  trait AssociateLicenseRequest extends js.Object {
    var licenseType: LicenseType
    var workspaceId: WorkspaceId
  }

  object AssociateLicenseRequest {
    @inline
    def apply(
        licenseType: LicenseType,
        workspaceId: WorkspaceId
    ): AssociateLicenseRequest = {
      val __obj = js.Dynamic.literal(
        "licenseType" -> licenseType.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateLicenseRequest]
    }
  }

  @js.native
  trait AssociateLicenseResponse extends js.Object {
    var workspace: WorkspaceDescription
  }

  object AssociateLicenseResponse {
    @inline
    def apply(
        workspace: WorkspaceDescription
    ): AssociateLicenseResponse = {
      val __obj = js.Dynamic.literal(
        "workspace" -> workspace.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateLicenseResponse]
    }
  }

  /** A structure containing information about the user authentication methods used by the workspace.
    */
  @js.native
  trait AuthenticationDescription extends js.Object {
    var providers: AuthenticationProviders
    var awsSso: js.UndefOr[AwsSsoAuthentication]
    var saml: js.UndefOr[SamlAuthentication]
  }

  object AuthenticationDescription {
    @inline
    def apply(
        providers: AuthenticationProviders,
        awsSso: js.UndefOr[AwsSsoAuthentication] = js.undefined,
        saml: js.UndefOr[SamlAuthentication] = js.undefined
    ): AuthenticationDescription = {
      val __obj = js.Dynamic.literal(
        "providers" -> providers.asInstanceOf[js.Any]
      )

      awsSso.foreach(__v => __obj.updateDynamic("awsSso")(__v.asInstanceOf[js.Any]))
      saml.foreach(__v => __obj.updateDynamic("saml")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuthenticationDescription]
    }
  }

  /** A structure that describes whether the workspace uses SAML, IAM Identity Center, or both methods for user authentication, and whether that authentication is fully configured.
    */
  @js.native
  trait AuthenticationSummary extends js.Object {
    var providers: AuthenticationProviders
    var samlConfigurationStatus: js.UndefOr[SamlConfigurationStatus]
  }

  object AuthenticationSummary {
    @inline
    def apply(
        providers: AuthenticationProviders,
        samlConfigurationStatus: js.UndefOr[SamlConfigurationStatus] = js.undefined
    ): AuthenticationSummary = {
      val __obj = js.Dynamic.literal(
        "providers" -> providers.asInstanceOf[js.Any]
      )

      samlConfigurationStatus.foreach(__v => __obj.updateDynamic("samlConfigurationStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuthenticationSummary]
    }
  }

  /** A structure containing information about how this workspace works with IAM Identity Center.
    */
  @js.native
  trait AwsSsoAuthentication extends js.Object {
    var ssoClientId: js.UndefOr[SSOClientId]
  }

  object AwsSsoAuthentication {
    @inline
    def apply(
        ssoClientId: js.UndefOr[SSOClientId] = js.undefined
    ): AwsSsoAuthentication = {
      val __obj = js.Dynamic.literal()
      ssoClientId.foreach(__v => __obj.updateDynamic("ssoClientId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsSsoAuthentication]
    }
  }

  @js.native
  trait CreateWorkspaceApiKeyRequest extends js.Object {
    var keyName: ApiKeyName
    var keyRole: String
    var secondsToLive: CreateWorkspaceApiKeyRequestSecondsToLiveInteger
    var workspaceId: WorkspaceId
  }

  object CreateWorkspaceApiKeyRequest {
    @inline
    def apply(
        keyName: ApiKeyName,
        keyRole: String,
        secondsToLive: CreateWorkspaceApiKeyRequestSecondsToLiveInteger,
        workspaceId: WorkspaceId
    ): CreateWorkspaceApiKeyRequest = {
      val __obj = js.Dynamic.literal(
        "keyName" -> keyName.asInstanceOf[js.Any],
        "keyRole" -> keyRole.asInstanceOf[js.Any],
        "secondsToLive" -> secondsToLive.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateWorkspaceApiKeyRequest]
    }
  }

  @js.native
  trait CreateWorkspaceApiKeyResponse extends js.Object {
    var key: ApiKeyToken
    var keyName: ApiKeyName
    var workspaceId: WorkspaceId
  }

  object CreateWorkspaceApiKeyResponse {
    @inline
    def apply(
        key: ApiKeyToken,
        keyName: ApiKeyName,
        workspaceId: WorkspaceId
    ): CreateWorkspaceApiKeyResponse = {
      val __obj = js.Dynamic.literal(
        "key" -> key.asInstanceOf[js.Any],
        "keyName" -> keyName.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateWorkspaceApiKeyResponse]
    }
  }

  @js.native
  trait CreateWorkspaceRequest extends js.Object {
    var accountAccessType: AccountAccessType
    var authenticationProviders: AuthenticationProviders
    var permissionType: PermissionType
    var clientToken: js.UndefOr[ClientToken]
    var configuration: js.UndefOr[OverridableConfigurationJson]
    var organizationRoleName: js.UndefOr[OrganizationRoleName]
    var stackSetName: js.UndefOr[StackSetName]
    var tags: js.UndefOr[TagMap]
    var vpcConfiguration: js.UndefOr[VpcConfiguration]
    var workspaceDataSources: js.UndefOr[DataSourceTypesList]
    var workspaceDescription: js.UndefOr[Description]
    var workspaceName: js.UndefOr[WorkspaceName]
    var workspaceNotificationDestinations: js.UndefOr[NotificationDestinationsList]
    var workspaceOrganizationalUnits: js.UndefOr[OrganizationalUnitList]
    var workspaceRoleArn: js.UndefOr[IamRoleArn]
  }

  object CreateWorkspaceRequest {
    @inline
    def apply(
        accountAccessType: AccountAccessType,
        authenticationProviders: AuthenticationProviders,
        permissionType: PermissionType,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        configuration: js.UndefOr[OverridableConfigurationJson] = js.undefined,
        organizationRoleName: js.UndefOr[OrganizationRoleName] = js.undefined,
        stackSetName: js.UndefOr[StackSetName] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        vpcConfiguration: js.UndefOr[VpcConfiguration] = js.undefined,
        workspaceDataSources: js.UndefOr[DataSourceTypesList] = js.undefined,
        workspaceDescription: js.UndefOr[Description] = js.undefined,
        workspaceName: js.UndefOr[WorkspaceName] = js.undefined,
        workspaceNotificationDestinations: js.UndefOr[NotificationDestinationsList] = js.undefined,
        workspaceOrganizationalUnits: js.UndefOr[OrganizationalUnitList] = js.undefined,
        workspaceRoleArn: js.UndefOr[IamRoleArn] = js.undefined
    ): CreateWorkspaceRequest = {
      val __obj = js.Dynamic.literal(
        "accountAccessType" -> accountAccessType.asInstanceOf[js.Any],
        "authenticationProviders" -> authenticationProviders.asInstanceOf[js.Any],
        "permissionType" -> permissionType.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      configuration.foreach(__v => __obj.updateDynamic("configuration")(__v.asInstanceOf[js.Any]))
      organizationRoleName.foreach(__v => __obj.updateDynamic("organizationRoleName")(__v.asInstanceOf[js.Any]))
      stackSetName.foreach(__v => __obj.updateDynamic("stackSetName")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      vpcConfiguration.foreach(__v => __obj.updateDynamic("vpcConfiguration")(__v.asInstanceOf[js.Any]))
      workspaceDataSources.foreach(__v => __obj.updateDynamic("workspaceDataSources")(__v.asInstanceOf[js.Any]))
      workspaceDescription.foreach(__v => __obj.updateDynamic("workspaceDescription")(__v.asInstanceOf[js.Any]))
      workspaceName.foreach(__v => __obj.updateDynamic("workspaceName")(__v.asInstanceOf[js.Any]))
      workspaceNotificationDestinations.foreach(__v => __obj.updateDynamic("workspaceNotificationDestinations")(__v.asInstanceOf[js.Any]))
      workspaceOrganizationalUnits.foreach(__v => __obj.updateDynamic("workspaceOrganizationalUnits")(__v.asInstanceOf[js.Any]))
      workspaceRoleArn.foreach(__v => __obj.updateDynamic("workspaceRoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWorkspaceRequest]
    }
  }

  @js.native
  trait CreateWorkspaceResponse extends js.Object {
    var workspace: WorkspaceDescription
  }

  object CreateWorkspaceResponse {
    @inline
    def apply(
        workspace: WorkspaceDescription
    ): CreateWorkspaceResponse = {
      val __obj = js.Dynamic.literal(
        "workspace" -> workspace.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateWorkspaceResponse]
    }
  }

  @js.native
  trait DeleteWorkspaceApiKeyRequest extends js.Object {
    var keyName: ApiKeyName
    var workspaceId: WorkspaceId
  }

  object DeleteWorkspaceApiKeyRequest {
    @inline
    def apply(
        keyName: ApiKeyName,
        workspaceId: WorkspaceId
    ): DeleteWorkspaceApiKeyRequest = {
      val __obj = js.Dynamic.literal(
        "keyName" -> keyName.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteWorkspaceApiKeyRequest]
    }
  }

  @js.native
  trait DeleteWorkspaceApiKeyResponse extends js.Object {
    var keyName: ApiKeyName
    var workspaceId: WorkspaceId
  }

  object DeleteWorkspaceApiKeyResponse {
    @inline
    def apply(
        keyName: ApiKeyName,
        workspaceId: WorkspaceId
    ): DeleteWorkspaceApiKeyResponse = {
      val __obj = js.Dynamic.literal(
        "keyName" -> keyName.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteWorkspaceApiKeyResponse]
    }
  }

  @js.native
  trait DeleteWorkspaceRequest extends js.Object {
    var workspaceId: WorkspaceId
  }

  object DeleteWorkspaceRequest {
    @inline
    def apply(
        workspaceId: WorkspaceId
    ): DeleteWorkspaceRequest = {
      val __obj = js.Dynamic.literal(
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteWorkspaceRequest]
    }
  }

  @js.native
  trait DeleteWorkspaceResponse extends js.Object {
    var workspace: WorkspaceDescription
  }

  object DeleteWorkspaceResponse {
    @inline
    def apply(
        workspace: WorkspaceDescription
    ): DeleteWorkspaceResponse = {
      val __obj = js.Dynamic.literal(
        "workspace" -> workspace.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteWorkspaceResponse]
    }
  }

  @js.native
  trait DescribeWorkspaceAuthenticationRequest extends js.Object {
    var workspaceId: WorkspaceId
  }

  object DescribeWorkspaceAuthenticationRequest {
    @inline
    def apply(
        workspaceId: WorkspaceId
    ): DescribeWorkspaceAuthenticationRequest = {
      val __obj = js.Dynamic.literal(
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeWorkspaceAuthenticationRequest]
    }
  }

  @js.native
  trait DescribeWorkspaceAuthenticationResponse extends js.Object {
    var authentication: AuthenticationDescription
  }

  object DescribeWorkspaceAuthenticationResponse {
    @inline
    def apply(
        authentication: AuthenticationDescription
    ): DescribeWorkspaceAuthenticationResponse = {
      val __obj = js.Dynamic.literal(
        "authentication" -> authentication.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeWorkspaceAuthenticationResponse]
    }
  }

  @js.native
  trait DescribeWorkspaceConfigurationRequest extends js.Object {
    var workspaceId: WorkspaceId
  }

  object DescribeWorkspaceConfigurationRequest {
    @inline
    def apply(
        workspaceId: WorkspaceId
    ): DescribeWorkspaceConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeWorkspaceConfigurationRequest]
    }
  }

  @js.native
  trait DescribeWorkspaceConfigurationResponse extends js.Object {
    var configuration: OverridableConfigurationJson
  }

  object DescribeWorkspaceConfigurationResponse {
    @inline
    def apply(
        configuration: OverridableConfigurationJson
    ): DescribeWorkspaceConfigurationResponse = {
      val __obj = js.Dynamic.literal(
        "configuration" -> configuration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeWorkspaceConfigurationResponse]
    }
  }

  @js.native
  trait DescribeWorkspaceRequest extends js.Object {
    var workspaceId: WorkspaceId
  }

  object DescribeWorkspaceRequest {
    @inline
    def apply(
        workspaceId: WorkspaceId
    ): DescribeWorkspaceRequest = {
      val __obj = js.Dynamic.literal(
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeWorkspaceRequest]
    }
  }

  @js.native
  trait DescribeWorkspaceResponse extends js.Object {
    var workspace: WorkspaceDescription
  }

  object DescribeWorkspaceResponse {
    @inline
    def apply(
        workspace: WorkspaceDescription
    ): DescribeWorkspaceResponse = {
      val __obj = js.Dynamic.literal(
        "workspace" -> workspace.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeWorkspaceResponse]
    }
  }

  @js.native
  trait DisassociateLicenseRequest extends js.Object {
    var licenseType: LicenseType
    var workspaceId: WorkspaceId
  }

  object DisassociateLicenseRequest {
    @inline
    def apply(
        licenseType: LicenseType,
        workspaceId: WorkspaceId
    ): DisassociateLicenseRequest = {
      val __obj = js.Dynamic.literal(
        "licenseType" -> licenseType.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateLicenseRequest]
    }
  }

  @js.native
  trait DisassociateLicenseResponse extends js.Object {
    var workspace: WorkspaceDescription
  }

  object DisassociateLicenseResponse {
    @inline
    def apply(
        workspace: WorkspaceDescription
    ): DisassociateLicenseResponse = {
      val __obj = js.Dynamic.literal(
        "workspace" -> workspace.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateLicenseResponse]
    }
  }

  /** A structure containing the identity provider (IdP) metadata used to integrate the identity provider with this workspace. You can specify the metadata either by providing a URL to its location in the <code>url</code> parameter, or by specifying the full metadata in XML format in the <code>xml</code> parameter. Specifying both will cause an error.
    */
  @js.native
  trait IdpMetadata extends js.Object {
    var url: js.UndefOr[IdpMetadataUrl]
    var xml: js.UndefOr[String]
  }

  object IdpMetadata {
    @inline
    def apply(
        url: js.UndefOr[IdpMetadataUrl] = js.undefined,
        xml: js.UndefOr[String] = js.undefined
    ): IdpMetadata = {
      val __obj = js.Dynamic.literal()
      url.foreach(__v => __obj.updateDynamic("url")(__v.asInstanceOf[js.Any]))
      xml.foreach(__v => __obj.updateDynamic("xml")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IdpMetadata]
    }
  }

  @js.native
  trait ListPermissionsRequest extends js.Object {
    var workspaceId: WorkspaceId
    var groupId: js.UndefOr[SsoId]
    var maxResults: js.UndefOr[ListPermissionsRequestMaxResultsInteger]
    var nextToken: js.UndefOr[PaginationToken]
    var userId: js.UndefOr[SsoId]
    var userType: js.UndefOr[UserType]
  }

  object ListPermissionsRequest {
    @inline
    def apply(
        workspaceId: WorkspaceId,
        groupId: js.UndefOr[SsoId] = js.undefined,
        maxResults: js.UndefOr[ListPermissionsRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        userId: js.UndefOr[SsoId] = js.undefined,
        userType: js.UndefOr[UserType] = js.undefined
    ): ListPermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      groupId.foreach(__v => __obj.updateDynamic("groupId")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      userId.foreach(__v => __obj.updateDynamic("userId")(__v.asInstanceOf[js.Any]))
      userType.foreach(__v => __obj.updateDynamic("userType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPermissionsRequest]
    }
  }

  @js.native
  trait ListPermissionsResponse extends js.Object {
    var permissions: PermissionEntryList
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListPermissionsResponse {
    @inline
    def apply(
        permissions: PermissionEntryList,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListPermissionsResponse = {
      val __obj = js.Dynamic.literal(
        "permissions" -> permissions.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPermissionsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: String
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: String
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListWorkspacesRequest extends js.Object {
    var maxResults: js.UndefOr[ListWorkspacesRequestMaxResultsInteger]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListWorkspacesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[ListWorkspacesRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListWorkspacesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkspacesRequest]
    }
  }

  @js.native
  trait ListWorkspacesResponse extends js.Object {
    var workspaces: WorkspaceList
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListWorkspacesResponse {
    @inline
    def apply(
        workspaces: WorkspaceList,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListWorkspacesResponse = {
      val __obj = js.Dynamic.literal(
        "workspaces" -> workspaces.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkspacesResponse]
    }
  }

  /** A structure containing the identity of one user or group and the <code>Admin</code>, <code>Editor</code>, or <code>Viewer</code> role that they have.
    */
  @js.native
  trait PermissionEntry extends js.Object {
    var role: Role
    var user: User
  }

  object PermissionEntry {
    @inline
    def apply(
        role: Role,
        user: User
    ): PermissionEntry = {
      val __obj = js.Dynamic.literal(
        "role" -> role.asInstanceOf[js.Any],
        "user" -> user.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PermissionEntry]
    }
  }

  /** This structure defines which groups defined in the SAML assertion attribute are to be mapped to the Grafana <code>Admin</code> and <code>Editor</code> roles in the workspace. SAML authenticated users not part of <code>Admin</code> or <code>Editor</code> role groups have <code>Viewer</code> permission over the workspace.
    */
  @js.native
  trait RoleValues extends js.Object {
    var admin: js.UndefOr[RoleValueList]
    var editor: js.UndefOr[RoleValueList]
  }

  object RoleValues {
    @inline
    def apply(
        admin: js.UndefOr[RoleValueList] = js.undefined,
        editor: js.UndefOr[RoleValueList] = js.undefined
    ): RoleValues = {
      val __obj = js.Dynamic.literal()
      admin.foreach(__v => __obj.updateDynamic("admin")(__v.asInstanceOf[js.Any]))
      editor.foreach(__v => __obj.updateDynamic("editor")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RoleValues]
    }
  }

  /** A structure containing information about how this workspace works with SAML.
    */
  @js.native
  trait SamlAuthentication extends js.Object {
    var status: SamlConfigurationStatus
    var configuration: js.UndefOr[SamlConfiguration]
  }

  object SamlAuthentication {
    @inline
    def apply(
        status: SamlConfigurationStatus,
        configuration: js.UndefOr[SamlConfiguration] = js.undefined
    ): SamlAuthentication = {
      val __obj = js.Dynamic.literal(
        "status" -> status.asInstanceOf[js.Any]
      )

      configuration.foreach(__v => __obj.updateDynamic("configuration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SamlAuthentication]
    }
  }

  /** A structure containing information about how this workspace works with SAML.
    */
  @js.native
  trait SamlConfiguration extends js.Object {
    var idpMetadata: IdpMetadata
    var allowedOrganizations: js.UndefOr[AllowedOrganizations]
    var assertionAttributes: js.UndefOr[AssertionAttributes]
    var loginValidityDuration: js.UndefOr[LoginValidityDuration]
    var roleValues: js.UndefOr[RoleValues]
  }

  object SamlConfiguration {
    @inline
    def apply(
        idpMetadata: IdpMetadata,
        allowedOrganizations: js.UndefOr[AllowedOrganizations] = js.undefined,
        assertionAttributes: js.UndefOr[AssertionAttributes] = js.undefined,
        loginValidityDuration: js.UndefOr[LoginValidityDuration] = js.undefined,
        roleValues: js.UndefOr[RoleValues] = js.undefined
    ): SamlConfiguration = {
      val __obj = js.Dynamic.literal(
        "idpMetadata" -> idpMetadata.asInstanceOf[js.Any]
      )

      allowedOrganizations.foreach(__v => __obj.updateDynamic("allowedOrganizations")(__v.asInstanceOf[js.Any]))
      assertionAttributes.foreach(__v => __obj.updateDynamic("assertionAttributes")(__v.asInstanceOf[js.Any]))
      loginValidityDuration.foreach(__v => __obj.updateDynamic("loginValidityDuration")(__v.asInstanceOf[js.Any]))
      roleValues.foreach(__v => __obj.updateDynamic("roleValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SamlConfiguration]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: String
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: String,
        tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: String
    var tagKeys: TagKeys
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: String,
        tagKeys: TagKeys
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  /** A structure containing information about one error encountered while performing an [[https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdatePermissions.html|UpdatePermissions]] operation.
    */
  @js.native
  trait UpdateError extends js.Object {
    var causedBy: UpdateInstruction
    var code: UpdateErrorCodeInteger
    var message: String
  }

  object UpdateError {
    @inline
    def apply(
        causedBy: UpdateInstruction,
        code: UpdateErrorCodeInteger,
        message: String
    ): UpdateError = {
      val __obj = js.Dynamic.literal(
        "causedBy" -> causedBy.asInstanceOf[js.Any],
        "code" -> code.asInstanceOf[js.Any],
        "message" -> message.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateError]
    }
  }

  /** Contains the instructions for one Grafana role permission update in a [[https://docs.aws.amazon.com/grafana/latest/APIReference/API_UpdatePermissions.html|UpdatePermissions]] operation.
    */
  @js.native
  trait UpdateInstruction extends js.Object {
    var action: UpdateAction
    var role: Role
    var users: UserList
  }

  object UpdateInstruction {
    @inline
    def apply(
        action: UpdateAction,
        role: Role,
        users: UserList
    ): UpdateInstruction = {
      val __obj = js.Dynamic.literal(
        "action" -> action.asInstanceOf[js.Any],
        "role" -> role.asInstanceOf[js.Any],
        "users" -> users.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateInstruction]
    }
  }

  @js.native
  trait UpdatePermissionsRequest extends js.Object {
    var updateInstructionBatch: UpdateInstructionBatch
    var workspaceId: WorkspaceId
  }

  object UpdatePermissionsRequest {
    @inline
    def apply(
        updateInstructionBatch: UpdateInstructionBatch,
        workspaceId: WorkspaceId
    ): UpdatePermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "updateInstructionBatch" -> updateInstructionBatch.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdatePermissionsRequest]
    }
  }

  @js.native
  trait UpdatePermissionsResponse extends js.Object {
    var errors: UpdateErrorList
  }

  object UpdatePermissionsResponse {
    @inline
    def apply(
        errors: UpdateErrorList
    ): UpdatePermissionsResponse = {
      val __obj = js.Dynamic.literal(
        "errors" -> errors.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdatePermissionsResponse]
    }
  }

  @js.native
  trait UpdateWorkspaceAuthenticationRequest extends js.Object {
    var authenticationProviders: AuthenticationProviders
    var workspaceId: WorkspaceId
    var samlConfiguration: js.UndefOr[SamlConfiguration]
  }

  object UpdateWorkspaceAuthenticationRequest {
    @inline
    def apply(
        authenticationProviders: AuthenticationProviders,
        workspaceId: WorkspaceId,
        samlConfiguration: js.UndefOr[SamlConfiguration] = js.undefined
    ): UpdateWorkspaceAuthenticationRequest = {
      val __obj = js.Dynamic.literal(
        "authenticationProviders" -> authenticationProviders.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      samlConfiguration.foreach(__v => __obj.updateDynamic("samlConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWorkspaceAuthenticationRequest]
    }
  }

  @js.native
  trait UpdateWorkspaceAuthenticationResponse extends js.Object {
    var authentication: AuthenticationDescription
  }

  object UpdateWorkspaceAuthenticationResponse {
    @inline
    def apply(
        authentication: AuthenticationDescription
    ): UpdateWorkspaceAuthenticationResponse = {
      val __obj = js.Dynamic.literal(
        "authentication" -> authentication.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateWorkspaceAuthenticationResponse]
    }
  }

  @js.native
  trait UpdateWorkspaceConfigurationRequest extends js.Object {
    var configuration: OverridableConfigurationJson
    var workspaceId: WorkspaceId
  }

  object UpdateWorkspaceConfigurationRequest {
    @inline
    def apply(
        configuration: OverridableConfigurationJson,
        workspaceId: WorkspaceId
    ): UpdateWorkspaceConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "configuration" -> configuration.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateWorkspaceConfigurationRequest]
    }
  }

  @js.native
  trait UpdateWorkspaceConfigurationResponse extends js.Object

  object UpdateWorkspaceConfigurationResponse {
    @inline
    def apply(): UpdateWorkspaceConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateWorkspaceConfigurationResponse]
    }
  }

  @js.native
  trait UpdateWorkspaceRequest extends js.Object {
    var workspaceId: WorkspaceId
    var accountAccessType: js.UndefOr[AccountAccessType]
    var organizationRoleName: js.UndefOr[OrganizationRoleName]
    var permissionType: js.UndefOr[PermissionType]
    var removeVpcConfiguration: js.UndefOr[Boolean]
    var stackSetName: js.UndefOr[StackSetName]
    var vpcConfiguration: js.UndefOr[VpcConfiguration]
    var workspaceDataSources: js.UndefOr[DataSourceTypesList]
    var workspaceDescription: js.UndefOr[Description]
    var workspaceName: js.UndefOr[WorkspaceName]
    var workspaceNotificationDestinations: js.UndefOr[NotificationDestinationsList]
    var workspaceOrganizationalUnits: js.UndefOr[OrganizationalUnitList]
    var workspaceRoleArn: js.UndefOr[IamRoleArn]
  }

  object UpdateWorkspaceRequest {
    @inline
    def apply(
        workspaceId: WorkspaceId,
        accountAccessType: js.UndefOr[AccountAccessType] = js.undefined,
        organizationRoleName: js.UndefOr[OrganizationRoleName] = js.undefined,
        permissionType: js.UndefOr[PermissionType] = js.undefined,
        removeVpcConfiguration: js.UndefOr[Boolean] = js.undefined,
        stackSetName: js.UndefOr[StackSetName] = js.undefined,
        vpcConfiguration: js.UndefOr[VpcConfiguration] = js.undefined,
        workspaceDataSources: js.UndefOr[DataSourceTypesList] = js.undefined,
        workspaceDescription: js.UndefOr[Description] = js.undefined,
        workspaceName: js.UndefOr[WorkspaceName] = js.undefined,
        workspaceNotificationDestinations: js.UndefOr[NotificationDestinationsList] = js.undefined,
        workspaceOrganizationalUnits: js.UndefOr[OrganizationalUnitList] = js.undefined,
        workspaceRoleArn: js.UndefOr[IamRoleArn] = js.undefined
    ): UpdateWorkspaceRequest = {
      val __obj = js.Dynamic.literal(
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      accountAccessType.foreach(__v => __obj.updateDynamic("accountAccessType")(__v.asInstanceOf[js.Any]))
      organizationRoleName.foreach(__v => __obj.updateDynamic("organizationRoleName")(__v.asInstanceOf[js.Any]))
      permissionType.foreach(__v => __obj.updateDynamic("permissionType")(__v.asInstanceOf[js.Any]))
      removeVpcConfiguration.foreach(__v => __obj.updateDynamic("removeVpcConfiguration")(__v.asInstanceOf[js.Any]))
      stackSetName.foreach(__v => __obj.updateDynamic("stackSetName")(__v.asInstanceOf[js.Any]))
      vpcConfiguration.foreach(__v => __obj.updateDynamic("vpcConfiguration")(__v.asInstanceOf[js.Any]))
      workspaceDataSources.foreach(__v => __obj.updateDynamic("workspaceDataSources")(__v.asInstanceOf[js.Any]))
      workspaceDescription.foreach(__v => __obj.updateDynamic("workspaceDescription")(__v.asInstanceOf[js.Any]))
      workspaceName.foreach(__v => __obj.updateDynamic("workspaceName")(__v.asInstanceOf[js.Any]))
      workspaceNotificationDestinations.foreach(__v => __obj.updateDynamic("workspaceNotificationDestinations")(__v.asInstanceOf[js.Any]))
      workspaceOrganizationalUnits.foreach(__v => __obj.updateDynamic("workspaceOrganizationalUnits")(__v.asInstanceOf[js.Any]))
      workspaceRoleArn.foreach(__v => __obj.updateDynamic("workspaceRoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWorkspaceRequest]
    }
  }

  @js.native
  trait UpdateWorkspaceResponse extends js.Object {
    var workspace: WorkspaceDescription
  }

  object UpdateWorkspaceResponse {
    @inline
    def apply(
        workspace: WorkspaceDescription
    ): UpdateWorkspaceResponse = {
      val __obj = js.Dynamic.literal(
        "workspace" -> workspace.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateWorkspaceResponse]
    }
  }

  /** A structure that specifies one user or group in the workspace.
    */
  @js.native
  trait User extends js.Object {
    var id: SsoId
    var `type`: UserType
  }

  object User {
    @inline
    def apply(
        id: SsoId,
        `type`: UserType
    ): User = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[User]
    }
  }

  /** The configuration settings for an Amazon VPC that contains data sources for your Grafana workspace to connect to.
    */
  @js.native
  trait VpcConfiguration extends js.Object {
    var securityGroupIds: SecurityGroupIds
    var subnetIds: SubnetIds
  }

  object VpcConfiguration {
    @inline
    def apply(
        securityGroupIds: SecurityGroupIds,
        subnetIds: SubnetIds
    ): VpcConfiguration = {
      val __obj = js.Dynamic.literal(
        "securityGroupIds" -> securityGroupIds.asInstanceOf[js.Any],
        "subnetIds" -> subnetIds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VpcConfiguration]
    }
  }

  /** A structure containing information about an Amazon Managed Grafana workspace in your account.
    */
  @js.native
  trait WorkspaceDescription extends js.Object {
    var authentication: AuthenticationSummary
    var created: Timestamp
    var dataSources: DataSourceTypesList
    var endpoint: Endpoint
    var grafanaVersion: GrafanaVersion
    var id: WorkspaceId
    var modified: Timestamp
    var status: WorkspaceStatus
    var accountAccessType: js.UndefOr[AccountAccessType]
    var description: js.UndefOr[Description]
    var freeTrialConsumed: js.UndefOr[Boolean]
    var freeTrialExpiration: js.UndefOr[Timestamp]
    var licenseExpiration: js.UndefOr[Timestamp]
    var licenseType: js.UndefOr[LicenseType]
    var name: js.UndefOr[WorkspaceName]
    var notificationDestinations: js.UndefOr[NotificationDestinationsList]
    var organizationRoleName: js.UndefOr[OrganizationRoleName]
    var organizationalUnits: js.UndefOr[OrganizationalUnitList]
    var permissionType: js.UndefOr[PermissionType]
    var stackSetName: js.UndefOr[StackSetName]
    var tags: js.UndefOr[TagMap]
    var vpcConfiguration: js.UndefOr[VpcConfiguration]
    var workspaceRoleArn: js.UndefOr[IamRoleArn]
  }

  object WorkspaceDescription {
    @inline
    def apply(
        authentication: AuthenticationSummary,
        created: Timestamp,
        dataSources: DataSourceTypesList,
        endpoint: Endpoint,
        grafanaVersion: GrafanaVersion,
        id: WorkspaceId,
        modified: Timestamp,
        status: WorkspaceStatus,
        accountAccessType: js.UndefOr[AccountAccessType] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        freeTrialConsumed: js.UndefOr[Boolean] = js.undefined,
        freeTrialExpiration: js.UndefOr[Timestamp] = js.undefined,
        licenseExpiration: js.UndefOr[Timestamp] = js.undefined,
        licenseType: js.UndefOr[LicenseType] = js.undefined,
        name: js.UndefOr[WorkspaceName] = js.undefined,
        notificationDestinations: js.UndefOr[NotificationDestinationsList] = js.undefined,
        organizationRoleName: js.UndefOr[OrganizationRoleName] = js.undefined,
        organizationalUnits: js.UndefOr[OrganizationalUnitList] = js.undefined,
        permissionType: js.UndefOr[PermissionType] = js.undefined,
        stackSetName: js.UndefOr[StackSetName] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        vpcConfiguration: js.UndefOr[VpcConfiguration] = js.undefined,
        workspaceRoleArn: js.UndefOr[IamRoleArn] = js.undefined
    ): WorkspaceDescription = {
      val __obj = js.Dynamic.literal(
        "authentication" -> authentication.asInstanceOf[js.Any],
        "created" -> created.asInstanceOf[js.Any],
        "dataSources" -> dataSources.asInstanceOf[js.Any],
        "endpoint" -> endpoint.asInstanceOf[js.Any],
        "grafanaVersion" -> grafanaVersion.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "modified" -> modified.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      accountAccessType.foreach(__v => __obj.updateDynamic("accountAccessType")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      freeTrialConsumed.foreach(__v => __obj.updateDynamic("freeTrialConsumed")(__v.asInstanceOf[js.Any]))
      freeTrialExpiration.foreach(__v => __obj.updateDynamic("freeTrialExpiration")(__v.asInstanceOf[js.Any]))
      licenseExpiration.foreach(__v => __obj.updateDynamic("licenseExpiration")(__v.asInstanceOf[js.Any]))
      licenseType.foreach(__v => __obj.updateDynamic("licenseType")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      notificationDestinations.foreach(__v => __obj.updateDynamic("notificationDestinations")(__v.asInstanceOf[js.Any]))
      organizationRoleName.foreach(__v => __obj.updateDynamic("organizationRoleName")(__v.asInstanceOf[js.Any]))
      organizationalUnits.foreach(__v => __obj.updateDynamic("organizationalUnits")(__v.asInstanceOf[js.Any]))
      permissionType.foreach(__v => __obj.updateDynamic("permissionType")(__v.asInstanceOf[js.Any]))
      stackSetName.foreach(__v => __obj.updateDynamic("stackSetName")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      vpcConfiguration.foreach(__v => __obj.updateDynamic("vpcConfiguration")(__v.asInstanceOf[js.Any]))
      workspaceRoleArn.foreach(__v => __obj.updateDynamic("workspaceRoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkspaceDescription]
    }
  }

  /** A structure that contains some information about one workspace in the account.
    */
  @js.native
  trait WorkspaceSummary extends js.Object {
    var authentication: AuthenticationSummary
    var created: Timestamp
    var endpoint: Endpoint
    var grafanaVersion: GrafanaVersion
    var id: WorkspaceId
    var modified: Timestamp
    var status: WorkspaceStatus
    var description: js.UndefOr[Description]
    var name: js.UndefOr[WorkspaceName]
    var notificationDestinations: js.UndefOr[NotificationDestinationsList]
    var tags: js.UndefOr[TagMap]
  }

  object WorkspaceSummary {
    @inline
    def apply(
        authentication: AuthenticationSummary,
        created: Timestamp,
        endpoint: Endpoint,
        grafanaVersion: GrafanaVersion,
        id: WorkspaceId,
        modified: Timestamp,
        status: WorkspaceStatus,
        description: js.UndefOr[Description] = js.undefined,
        name: js.UndefOr[WorkspaceName] = js.undefined,
        notificationDestinations: js.UndefOr[NotificationDestinationsList] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): WorkspaceSummary = {
      val __obj = js.Dynamic.literal(
        "authentication" -> authentication.asInstanceOf[js.Any],
        "created" -> created.asInstanceOf[js.Any],
        "endpoint" -> endpoint.asInstanceOf[js.Any],
        "grafanaVersion" -> grafanaVersion.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "modified" -> modified.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      notificationDestinations.foreach(__v => __obj.updateDynamic("notificationDestinations")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkspaceSummary]
    }
  }
}
