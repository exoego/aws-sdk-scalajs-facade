package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object greengrass {
  type BulkDeploymentResults = js.Array[BulkDeploymentResult]
  type BulkDeployments = js.Array[BulkDeployment]
  type Deployments = js.Array[Deployment]
  type ErrorDetails = js.Array[ErrorDetail]
  type S3UrlSignerRole = String
  type Tags = js.Dictionary[__string]
  type UpdateTargets = js.Array[__string]
  type __boolean = Boolean
  type __integer = Int
  type __listOfConnectivityInfo = js.Array[ConnectivityInfo]
  type __listOfConnector = js.Array[Connector]
  type __listOfCore = js.Array[Core]
  type __listOfDefinitionInformation = js.Array[DefinitionInformation]
  type __listOfDevice = js.Array[Device]
  type __listOfFunction = js.Array[Function]
  type __listOfGroupCertificateAuthorityProperties = js.Array[GroupCertificateAuthorityProperties]
  type __listOfGroupInformation = js.Array[GroupInformation]
  type __listOfLogger = js.Array[Logger]
  type __listOfResource = js.Array[Resource]
  type __listOfResourceAccessPolicy = js.Array[ResourceAccessPolicy]
  type __listOfSubscription = js.Array[Subscription]
  type __listOfVersionInformation = js.Array[VersionInformation]
  type __listOf__string = js.Array[__string]
  type __mapOf__string = js.Dictionary[__string]
  type __string = String

  implicit final class GreengrassOps(private val service: Greengrass) extends AnyVal {

    @inline def associateRoleToGroupFuture(params: AssociateRoleToGroupRequest): Future[AssociateRoleToGroupResponse] = service.associateRoleToGroup(params).promise().toFuture
    @inline def associateServiceRoleToAccountFuture(params: AssociateServiceRoleToAccountRequest): Future[AssociateServiceRoleToAccountResponse] = service.associateServiceRoleToAccount(params).promise().toFuture
    @inline def createConnectorDefinitionFuture(params: CreateConnectorDefinitionRequest): Future[CreateConnectorDefinitionResponse] = service.createConnectorDefinition(params).promise().toFuture
    @inline def createConnectorDefinitionVersionFuture(params: CreateConnectorDefinitionVersionRequest): Future[CreateConnectorDefinitionVersionResponse] = service.createConnectorDefinitionVersion(params).promise().toFuture
    @inline def createCoreDefinitionFuture(params: CreateCoreDefinitionRequest): Future[CreateCoreDefinitionResponse] = service.createCoreDefinition(params).promise().toFuture
    @inline def createCoreDefinitionVersionFuture(params: CreateCoreDefinitionVersionRequest): Future[CreateCoreDefinitionVersionResponse] = service.createCoreDefinitionVersion(params).promise().toFuture
    @inline def createDeploymentFuture(params: CreateDeploymentRequest): Future[CreateDeploymentResponse] = service.createDeployment(params).promise().toFuture
    @inline def createDeviceDefinitionFuture(params: CreateDeviceDefinitionRequest): Future[CreateDeviceDefinitionResponse] = service.createDeviceDefinition(params).promise().toFuture
    @inline def createDeviceDefinitionVersionFuture(params: CreateDeviceDefinitionVersionRequest): Future[CreateDeviceDefinitionVersionResponse] = service.createDeviceDefinitionVersion(params).promise().toFuture
    @inline def createFunctionDefinitionFuture(params: CreateFunctionDefinitionRequest): Future[CreateFunctionDefinitionResponse] = service.createFunctionDefinition(params).promise().toFuture
    @inline def createFunctionDefinitionVersionFuture(params: CreateFunctionDefinitionVersionRequest): Future[CreateFunctionDefinitionVersionResponse] = service.createFunctionDefinitionVersion(params).promise().toFuture
    @inline def createGroupCertificateAuthorityFuture(params: CreateGroupCertificateAuthorityRequest): Future[CreateGroupCertificateAuthorityResponse] = service.createGroupCertificateAuthority(params).promise().toFuture
    @inline def createGroupFuture(params: CreateGroupRequest): Future[CreateGroupResponse] = service.createGroup(params).promise().toFuture
    @inline def createGroupVersionFuture(params: CreateGroupVersionRequest): Future[CreateGroupVersionResponse] = service.createGroupVersion(params).promise().toFuture
    @inline def createLoggerDefinitionFuture(params: CreateLoggerDefinitionRequest): Future[CreateLoggerDefinitionResponse] = service.createLoggerDefinition(params).promise().toFuture
    @inline def createLoggerDefinitionVersionFuture(params: CreateLoggerDefinitionVersionRequest): Future[CreateLoggerDefinitionVersionResponse] = service.createLoggerDefinitionVersion(params).promise().toFuture
    @inline def createResourceDefinitionFuture(params: CreateResourceDefinitionRequest): Future[CreateResourceDefinitionResponse] = service.createResourceDefinition(params).promise().toFuture
    @inline def createResourceDefinitionVersionFuture(params: CreateResourceDefinitionVersionRequest): Future[CreateResourceDefinitionVersionResponse] = service.createResourceDefinitionVersion(params).promise().toFuture
    @inline def createSoftwareUpdateJobFuture(params: CreateSoftwareUpdateJobRequest): Future[CreateSoftwareUpdateJobResponse] = service.createSoftwareUpdateJob(params).promise().toFuture
    @inline def createSubscriptionDefinitionFuture(params: CreateSubscriptionDefinitionRequest): Future[CreateSubscriptionDefinitionResponse] = service.createSubscriptionDefinition(params).promise().toFuture
    @inline def createSubscriptionDefinitionVersionFuture(params: CreateSubscriptionDefinitionVersionRequest): Future[CreateSubscriptionDefinitionVersionResponse] = service.createSubscriptionDefinitionVersion(params).promise().toFuture
    @inline def deleteConnectorDefinitionFuture(params: DeleteConnectorDefinitionRequest): Future[DeleteConnectorDefinitionResponse] = service.deleteConnectorDefinition(params).promise().toFuture
    @inline def deleteCoreDefinitionFuture(params: DeleteCoreDefinitionRequest): Future[DeleteCoreDefinitionResponse] = service.deleteCoreDefinition(params).promise().toFuture
    @inline def deleteDeviceDefinitionFuture(params: DeleteDeviceDefinitionRequest): Future[DeleteDeviceDefinitionResponse] = service.deleteDeviceDefinition(params).promise().toFuture
    @inline def deleteFunctionDefinitionFuture(params: DeleteFunctionDefinitionRequest): Future[DeleteFunctionDefinitionResponse] = service.deleteFunctionDefinition(params).promise().toFuture
    @inline def deleteGroupFuture(params: DeleteGroupRequest): Future[DeleteGroupResponse] = service.deleteGroup(params).promise().toFuture
    @inline def deleteLoggerDefinitionFuture(params: DeleteLoggerDefinitionRequest): Future[DeleteLoggerDefinitionResponse] = service.deleteLoggerDefinition(params).promise().toFuture
    @inline def deleteResourceDefinitionFuture(params: DeleteResourceDefinitionRequest): Future[DeleteResourceDefinitionResponse] = service.deleteResourceDefinition(params).promise().toFuture
    @inline def deleteSubscriptionDefinitionFuture(params: DeleteSubscriptionDefinitionRequest): Future[DeleteSubscriptionDefinitionResponse] = service.deleteSubscriptionDefinition(params).promise().toFuture
    @inline def disassociateRoleFromGroupFuture(params: DisassociateRoleFromGroupRequest): Future[DisassociateRoleFromGroupResponse] = service.disassociateRoleFromGroup(params).promise().toFuture
    @inline def disassociateServiceRoleFromAccountFuture(params: DisassociateServiceRoleFromAccountRequest): Future[DisassociateServiceRoleFromAccountResponse] = service.disassociateServiceRoleFromAccount(params).promise().toFuture
    @inline def getAssociatedRoleFuture(params: GetAssociatedRoleRequest): Future[GetAssociatedRoleResponse] = service.getAssociatedRole(params).promise().toFuture
    @inline def getBulkDeploymentStatusFuture(params: GetBulkDeploymentStatusRequest): Future[GetBulkDeploymentStatusResponse] = service.getBulkDeploymentStatus(params).promise().toFuture
    @inline def getConnectivityInfoFuture(params: GetConnectivityInfoRequest): Future[GetConnectivityInfoResponse] = service.getConnectivityInfo(params).promise().toFuture
    @inline def getConnectorDefinitionFuture(params: GetConnectorDefinitionRequest): Future[GetConnectorDefinitionResponse] = service.getConnectorDefinition(params).promise().toFuture
    @inline def getConnectorDefinitionVersionFuture(params: GetConnectorDefinitionVersionRequest): Future[GetConnectorDefinitionVersionResponse] = service.getConnectorDefinitionVersion(params).promise().toFuture
    @inline def getCoreDefinitionFuture(params: GetCoreDefinitionRequest): Future[GetCoreDefinitionResponse] = service.getCoreDefinition(params).promise().toFuture
    @inline def getCoreDefinitionVersionFuture(params: GetCoreDefinitionVersionRequest): Future[GetCoreDefinitionVersionResponse] = service.getCoreDefinitionVersion(params).promise().toFuture
    @inline def getDeploymentStatusFuture(params: GetDeploymentStatusRequest): Future[GetDeploymentStatusResponse] = service.getDeploymentStatus(params).promise().toFuture
    @inline def getDeviceDefinitionFuture(params: GetDeviceDefinitionRequest): Future[GetDeviceDefinitionResponse] = service.getDeviceDefinition(params).promise().toFuture
    @inline def getDeviceDefinitionVersionFuture(params: GetDeviceDefinitionVersionRequest): Future[GetDeviceDefinitionVersionResponse] = service.getDeviceDefinitionVersion(params).promise().toFuture
    @inline def getFunctionDefinitionFuture(params: GetFunctionDefinitionRequest): Future[GetFunctionDefinitionResponse] = service.getFunctionDefinition(params).promise().toFuture
    @inline def getFunctionDefinitionVersionFuture(params: GetFunctionDefinitionVersionRequest): Future[GetFunctionDefinitionVersionResponse] = service.getFunctionDefinitionVersion(params).promise().toFuture
    @inline def getGroupCertificateAuthorityFuture(params: GetGroupCertificateAuthorityRequest): Future[GetGroupCertificateAuthorityResponse] = service.getGroupCertificateAuthority(params).promise().toFuture
    @inline def getGroupCertificateConfigurationFuture(params: GetGroupCertificateConfigurationRequest): Future[GetGroupCertificateConfigurationResponse] = service.getGroupCertificateConfiguration(params).promise().toFuture
    @inline def getGroupFuture(params: GetGroupRequest): Future[GetGroupResponse] = service.getGroup(params).promise().toFuture
    @inline def getGroupVersionFuture(params: GetGroupVersionRequest): Future[GetGroupVersionResponse] = service.getGroupVersion(params).promise().toFuture
    @inline def getLoggerDefinitionFuture(params: GetLoggerDefinitionRequest): Future[GetLoggerDefinitionResponse] = service.getLoggerDefinition(params).promise().toFuture
    @inline def getLoggerDefinitionVersionFuture(params: GetLoggerDefinitionVersionRequest): Future[GetLoggerDefinitionVersionResponse] = service.getLoggerDefinitionVersion(params).promise().toFuture
    @inline def getResourceDefinitionFuture(params: GetResourceDefinitionRequest): Future[GetResourceDefinitionResponse] = service.getResourceDefinition(params).promise().toFuture
    @inline def getResourceDefinitionVersionFuture(params: GetResourceDefinitionVersionRequest): Future[GetResourceDefinitionVersionResponse] = service.getResourceDefinitionVersion(params).promise().toFuture
    @inline def getServiceRoleForAccountFuture(params: GetServiceRoleForAccountRequest): Future[GetServiceRoleForAccountResponse] = service.getServiceRoleForAccount(params).promise().toFuture
    @inline def getSubscriptionDefinitionFuture(params: GetSubscriptionDefinitionRequest): Future[GetSubscriptionDefinitionResponse] = service.getSubscriptionDefinition(params).promise().toFuture
    @inline def getSubscriptionDefinitionVersionFuture(params: GetSubscriptionDefinitionVersionRequest): Future[GetSubscriptionDefinitionVersionResponse] = service.getSubscriptionDefinitionVersion(params).promise().toFuture
    @inline def listBulkDeploymentDetailedReportsFuture(params: ListBulkDeploymentDetailedReportsRequest): Future[ListBulkDeploymentDetailedReportsResponse] = service.listBulkDeploymentDetailedReports(params).promise().toFuture
    @inline def listBulkDeploymentsFuture(params: ListBulkDeploymentsRequest): Future[ListBulkDeploymentsResponse] = service.listBulkDeployments(params).promise().toFuture
    @inline def listConnectorDefinitionVersionsFuture(params: ListConnectorDefinitionVersionsRequest): Future[ListConnectorDefinitionVersionsResponse] = service.listConnectorDefinitionVersions(params).promise().toFuture
    @inline def listConnectorDefinitionsFuture(params: ListConnectorDefinitionsRequest): Future[ListConnectorDefinitionsResponse] = service.listConnectorDefinitions(params).promise().toFuture
    @inline def listCoreDefinitionVersionsFuture(params: ListCoreDefinitionVersionsRequest): Future[ListCoreDefinitionVersionsResponse] = service.listCoreDefinitionVersions(params).promise().toFuture
    @inline def listCoreDefinitionsFuture(params: ListCoreDefinitionsRequest): Future[ListCoreDefinitionsResponse] = service.listCoreDefinitions(params).promise().toFuture
    @inline def listDeploymentsFuture(params: ListDeploymentsRequest): Future[ListDeploymentsResponse] = service.listDeployments(params).promise().toFuture
    @inline def listDeviceDefinitionVersionsFuture(params: ListDeviceDefinitionVersionsRequest): Future[ListDeviceDefinitionVersionsResponse] = service.listDeviceDefinitionVersions(params).promise().toFuture
    @inline def listDeviceDefinitionsFuture(params: ListDeviceDefinitionsRequest): Future[ListDeviceDefinitionsResponse] = service.listDeviceDefinitions(params).promise().toFuture
    @inline def listFunctionDefinitionVersionsFuture(params: ListFunctionDefinitionVersionsRequest): Future[ListFunctionDefinitionVersionsResponse] = service.listFunctionDefinitionVersions(params).promise().toFuture
    @inline def listFunctionDefinitionsFuture(params: ListFunctionDefinitionsRequest): Future[ListFunctionDefinitionsResponse] = service.listFunctionDefinitions(params).promise().toFuture
    @inline def listGroupCertificateAuthoritiesFuture(params: ListGroupCertificateAuthoritiesRequest): Future[ListGroupCertificateAuthoritiesResponse] = service.listGroupCertificateAuthorities(params).promise().toFuture
    @inline def listGroupVersionsFuture(params: ListGroupVersionsRequest): Future[ListGroupVersionsResponse] = service.listGroupVersions(params).promise().toFuture
    @inline def listGroupsFuture(params: ListGroupsRequest): Future[ListGroupsResponse] = service.listGroups(params).promise().toFuture
    @inline def listLoggerDefinitionVersionsFuture(params: ListLoggerDefinitionVersionsRequest): Future[ListLoggerDefinitionVersionsResponse] = service.listLoggerDefinitionVersions(params).promise().toFuture
    @inline def listLoggerDefinitionsFuture(params: ListLoggerDefinitionsRequest): Future[ListLoggerDefinitionsResponse] = service.listLoggerDefinitions(params).promise().toFuture
    @inline def listResourceDefinitionVersionsFuture(params: ListResourceDefinitionVersionsRequest): Future[ListResourceDefinitionVersionsResponse] = service.listResourceDefinitionVersions(params).promise().toFuture
    @inline def listResourceDefinitionsFuture(params: ListResourceDefinitionsRequest): Future[ListResourceDefinitionsResponse] = service.listResourceDefinitions(params).promise().toFuture
    @inline def listSubscriptionDefinitionVersionsFuture(params: ListSubscriptionDefinitionVersionsRequest): Future[ListSubscriptionDefinitionVersionsResponse] = service.listSubscriptionDefinitionVersions(params).promise().toFuture
    @inline def listSubscriptionDefinitionsFuture(params: ListSubscriptionDefinitionsRequest): Future[ListSubscriptionDefinitionsResponse] = service.listSubscriptionDefinitions(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def resetDeploymentsFuture(params: ResetDeploymentsRequest): Future[ResetDeploymentsResponse] = service.resetDeployments(params).promise().toFuture
    @inline def startBulkDeploymentFuture(params: StartBulkDeploymentRequest): Future[StartBulkDeploymentResponse] = service.startBulkDeployment(params).promise().toFuture
    @inline def stopBulkDeploymentFuture(params: StopBulkDeploymentRequest): Future[StopBulkDeploymentResponse] = service.stopBulkDeployment(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] = service.untagResource(params).promise().toFuture
    @inline def updateConnectivityInfoFuture(params: UpdateConnectivityInfoRequest): Future[UpdateConnectivityInfoResponse] = service.updateConnectivityInfo(params).promise().toFuture
    @inline def updateConnectorDefinitionFuture(params: UpdateConnectorDefinitionRequest): Future[UpdateConnectorDefinitionResponse] = service.updateConnectorDefinition(params).promise().toFuture
    @inline def updateCoreDefinitionFuture(params: UpdateCoreDefinitionRequest): Future[UpdateCoreDefinitionResponse] = service.updateCoreDefinition(params).promise().toFuture
    @inline def updateDeviceDefinitionFuture(params: UpdateDeviceDefinitionRequest): Future[UpdateDeviceDefinitionResponse] = service.updateDeviceDefinition(params).promise().toFuture
    @inline def updateFunctionDefinitionFuture(params: UpdateFunctionDefinitionRequest): Future[UpdateFunctionDefinitionResponse] = service.updateFunctionDefinition(params).promise().toFuture
    @inline def updateGroupCertificateConfigurationFuture(params: UpdateGroupCertificateConfigurationRequest): Future[UpdateGroupCertificateConfigurationResponse] = service.updateGroupCertificateConfiguration(params).promise().toFuture
    @inline def updateGroupFuture(params: UpdateGroupRequest): Future[UpdateGroupResponse] = service.updateGroup(params).promise().toFuture
    @inline def updateLoggerDefinitionFuture(params: UpdateLoggerDefinitionRequest): Future[UpdateLoggerDefinitionResponse] = service.updateLoggerDefinition(params).promise().toFuture
    @inline def updateResourceDefinitionFuture(params: UpdateResourceDefinitionRequest): Future[UpdateResourceDefinitionResponse] = service.updateResourceDefinition(params).promise().toFuture
    @inline def updateSubscriptionDefinitionFuture(params: UpdateSubscriptionDefinitionRequest): Future[UpdateSubscriptionDefinitionResponse] = service.updateSubscriptionDefinition(params).promise().toFuture

  }
}

package greengrass {
  @js.native
  @JSImport("aws-sdk/clients/greengrass", JSImport.Namespace, "AWS.Greengrass")
  class Greengrass() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateRoleToGroup(params: AssociateRoleToGroupRequest): Request[AssociateRoleToGroupResponse] = js.native
    def associateServiceRoleToAccount(params: AssociateServiceRoleToAccountRequest): Request[AssociateServiceRoleToAccountResponse] = js.native
    def createConnectorDefinition(params: CreateConnectorDefinitionRequest): Request[CreateConnectorDefinitionResponse] = js.native
    def createConnectorDefinitionVersion(params: CreateConnectorDefinitionVersionRequest): Request[CreateConnectorDefinitionVersionResponse] = js.native
    def createCoreDefinition(params: CreateCoreDefinitionRequest): Request[CreateCoreDefinitionResponse] = js.native
    def createCoreDefinitionVersion(params: CreateCoreDefinitionVersionRequest): Request[CreateCoreDefinitionVersionResponse] = js.native
    def createDeployment(params: CreateDeploymentRequest): Request[CreateDeploymentResponse] = js.native
    def createDeviceDefinition(params: CreateDeviceDefinitionRequest): Request[CreateDeviceDefinitionResponse] = js.native
    def createDeviceDefinitionVersion(params: CreateDeviceDefinitionVersionRequest): Request[CreateDeviceDefinitionVersionResponse] = js.native
    def createFunctionDefinition(params: CreateFunctionDefinitionRequest): Request[CreateFunctionDefinitionResponse] = js.native
    def createFunctionDefinitionVersion(params: CreateFunctionDefinitionVersionRequest): Request[CreateFunctionDefinitionVersionResponse] = js.native
    def createGroup(params: CreateGroupRequest): Request[CreateGroupResponse] = js.native
    def createGroupCertificateAuthority(params: CreateGroupCertificateAuthorityRequest): Request[CreateGroupCertificateAuthorityResponse] = js.native
    def createGroupVersion(params: CreateGroupVersionRequest): Request[CreateGroupVersionResponse] = js.native
    def createLoggerDefinition(params: CreateLoggerDefinitionRequest): Request[CreateLoggerDefinitionResponse] = js.native
    def createLoggerDefinitionVersion(params: CreateLoggerDefinitionVersionRequest): Request[CreateLoggerDefinitionVersionResponse] = js.native
    def createResourceDefinition(params: CreateResourceDefinitionRequest): Request[CreateResourceDefinitionResponse] = js.native
    def createResourceDefinitionVersion(params: CreateResourceDefinitionVersionRequest): Request[CreateResourceDefinitionVersionResponse] = js.native
    def createSoftwareUpdateJob(params: CreateSoftwareUpdateJobRequest): Request[CreateSoftwareUpdateJobResponse] = js.native
    def createSubscriptionDefinition(params: CreateSubscriptionDefinitionRequest): Request[CreateSubscriptionDefinitionResponse] = js.native
    def createSubscriptionDefinitionVersion(params: CreateSubscriptionDefinitionVersionRequest): Request[CreateSubscriptionDefinitionVersionResponse] = js.native
    def deleteConnectorDefinition(params: DeleteConnectorDefinitionRequest): Request[DeleteConnectorDefinitionResponse] = js.native
    def deleteCoreDefinition(params: DeleteCoreDefinitionRequest): Request[DeleteCoreDefinitionResponse] = js.native
    def deleteDeviceDefinition(params: DeleteDeviceDefinitionRequest): Request[DeleteDeviceDefinitionResponse] = js.native
    def deleteFunctionDefinition(params: DeleteFunctionDefinitionRequest): Request[DeleteFunctionDefinitionResponse] = js.native
    def deleteGroup(params: DeleteGroupRequest): Request[DeleteGroupResponse] = js.native
    def deleteLoggerDefinition(params: DeleteLoggerDefinitionRequest): Request[DeleteLoggerDefinitionResponse] = js.native
    def deleteResourceDefinition(params: DeleteResourceDefinitionRequest): Request[DeleteResourceDefinitionResponse] = js.native
    def deleteSubscriptionDefinition(params: DeleteSubscriptionDefinitionRequest): Request[DeleteSubscriptionDefinitionResponse] = js.native
    def disassociateRoleFromGroup(params: DisassociateRoleFromGroupRequest): Request[DisassociateRoleFromGroupResponse] = js.native
    def disassociateServiceRoleFromAccount(params: DisassociateServiceRoleFromAccountRequest): Request[DisassociateServiceRoleFromAccountResponse] = js.native
    def getAssociatedRole(params: GetAssociatedRoleRequest): Request[GetAssociatedRoleResponse] = js.native
    def getBulkDeploymentStatus(params: GetBulkDeploymentStatusRequest): Request[GetBulkDeploymentStatusResponse] = js.native
    def getConnectivityInfo(params: GetConnectivityInfoRequest): Request[GetConnectivityInfoResponse] = js.native
    def getConnectorDefinition(params: GetConnectorDefinitionRequest): Request[GetConnectorDefinitionResponse] = js.native
    def getConnectorDefinitionVersion(params: GetConnectorDefinitionVersionRequest): Request[GetConnectorDefinitionVersionResponse] = js.native
    def getCoreDefinition(params: GetCoreDefinitionRequest): Request[GetCoreDefinitionResponse] = js.native
    def getCoreDefinitionVersion(params: GetCoreDefinitionVersionRequest): Request[GetCoreDefinitionVersionResponse] = js.native
    def getDeploymentStatus(params: GetDeploymentStatusRequest): Request[GetDeploymentStatusResponse] = js.native
    def getDeviceDefinition(params: GetDeviceDefinitionRequest): Request[GetDeviceDefinitionResponse] = js.native
    def getDeviceDefinitionVersion(params: GetDeviceDefinitionVersionRequest): Request[GetDeviceDefinitionVersionResponse] = js.native
    def getFunctionDefinition(params: GetFunctionDefinitionRequest): Request[GetFunctionDefinitionResponse] = js.native
    def getFunctionDefinitionVersion(params: GetFunctionDefinitionVersionRequest): Request[GetFunctionDefinitionVersionResponse] = js.native
    def getGroup(params: GetGroupRequest): Request[GetGroupResponse] = js.native
    def getGroupCertificateAuthority(params: GetGroupCertificateAuthorityRequest): Request[GetGroupCertificateAuthorityResponse] = js.native
    def getGroupCertificateConfiguration(params: GetGroupCertificateConfigurationRequest): Request[GetGroupCertificateConfigurationResponse] = js.native
    def getGroupVersion(params: GetGroupVersionRequest): Request[GetGroupVersionResponse] = js.native
    def getLoggerDefinition(params: GetLoggerDefinitionRequest): Request[GetLoggerDefinitionResponse] = js.native
    def getLoggerDefinitionVersion(params: GetLoggerDefinitionVersionRequest): Request[GetLoggerDefinitionVersionResponse] = js.native
    def getResourceDefinition(params: GetResourceDefinitionRequest): Request[GetResourceDefinitionResponse] = js.native
    def getResourceDefinitionVersion(params: GetResourceDefinitionVersionRequest): Request[GetResourceDefinitionVersionResponse] = js.native
    def getServiceRoleForAccount(params: GetServiceRoleForAccountRequest): Request[GetServiceRoleForAccountResponse] = js.native
    def getSubscriptionDefinition(params: GetSubscriptionDefinitionRequest): Request[GetSubscriptionDefinitionResponse] = js.native
    def getSubscriptionDefinitionVersion(params: GetSubscriptionDefinitionVersionRequest): Request[GetSubscriptionDefinitionVersionResponse] = js.native
    def listBulkDeploymentDetailedReports(params: ListBulkDeploymentDetailedReportsRequest): Request[ListBulkDeploymentDetailedReportsResponse] = js.native
    def listBulkDeployments(params: ListBulkDeploymentsRequest): Request[ListBulkDeploymentsResponse] = js.native
    def listConnectorDefinitionVersions(params: ListConnectorDefinitionVersionsRequest): Request[ListConnectorDefinitionVersionsResponse] = js.native
    def listConnectorDefinitions(params: ListConnectorDefinitionsRequest): Request[ListConnectorDefinitionsResponse] = js.native
    def listCoreDefinitionVersions(params: ListCoreDefinitionVersionsRequest): Request[ListCoreDefinitionVersionsResponse] = js.native
    def listCoreDefinitions(params: ListCoreDefinitionsRequest): Request[ListCoreDefinitionsResponse] = js.native
    def listDeployments(params: ListDeploymentsRequest): Request[ListDeploymentsResponse] = js.native
    def listDeviceDefinitionVersions(params: ListDeviceDefinitionVersionsRequest): Request[ListDeviceDefinitionVersionsResponse] = js.native
    def listDeviceDefinitions(params: ListDeviceDefinitionsRequest): Request[ListDeviceDefinitionsResponse] = js.native
    def listFunctionDefinitionVersions(params: ListFunctionDefinitionVersionsRequest): Request[ListFunctionDefinitionVersionsResponse] = js.native
    def listFunctionDefinitions(params: ListFunctionDefinitionsRequest): Request[ListFunctionDefinitionsResponse] = js.native
    def listGroupCertificateAuthorities(params: ListGroupCertificateAuthoritiesRequest): Request[ListGroupCertificateAuthoritiesResponse] = js.native
    def listGroupVersions(params: ListGroupVersionsRequest): Request[ListGroupVersionsResponse] = js.native
    def listGroups(params: ListGroupsRequest): Request[ListGroupsResponse] = js.native
    def listLoggerDefinitionVersions(params: ListLoggerDefinitionVersionsRequest): Request[ListLoggerDefinitionVersionsResponse] = js.native
    def listLoggerDefinitions(params: ListLoggerDefinitionsRequest): Request[ListLoggerDefinitionsResponse] = js.native
    def listResourceDefinitionVersions(params: ListResourceDefinitionVersionsRequest): Request[ListResourceDefinitionVersionsResponse] = js.native
    def listResourceDefinitions(params: ListResourceDefinitionsRequest): Request[ListResourceDefinitionsResponse] = js.native
    def listSubscriptionDefinitionVersions(params: ListSubscriptionDefinitionVersionsRequest): Request[ListSubscriptionDefinitionVersionsResponse] = js.native
    def listSubscriptionDefinitions(params: ListSubscriptionDefinitionsRequest): Request[ListSubscriptionDefinitionsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def resetDeployments(params: ResetDeploymentsRequest): Request[ResetDeploymentsResponse] = js.native
    def startBulkDeployment(params: StartBulkDeploymentRequest): Request[StartBulkDeploymentResponse] = js.native
    def stopBulkDeployment(params: StopBulkDeploymentRequest): Request[StopBulkDeploymentResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateConnectivityInfo(params: UpdateConnectivityInfoRequest): Request[UpdateConnectivityInfoResponse] = js.native
    def updateConnectorDefinition(params: UpdateConnectorDefinitionRequest): Request[UpdateConnectorDefinitionResponse] = js.native
    def updateCoreDefinition(params: UpdateCoreDefinitionRequest): Request[UpdateCoreDefinitionResponse] = js.native
    def updateDeviceDefinition(params: UpdateDeviceDefinitionRequest): Request[UpdateDeviceDefinitionResponse] = js.native
    def updateFunctionDefinition(params: UpdateFunctionDefinitionRequest): Request[UpdateFunctionDefinitionResponse] = js.native
    def updateGroup(params: UpdateGroupRequest): Request[UpdateGroupResponse] = js.native
    def updateGroupCertificateConfiguration(params: UpdateGroupCertificateConfigurationRequest): Request[UpdateGroupCertificateConfigurationResponse] = js.native
    def updateLoggerDefinition(params: UpdateLoggerDefinitionRequest): Request[UpdateLoggerDefinitionResponse] = js.native
    def updateResourceDefinition(params: UpdateResourceDefinitionRequest): Request[UpdateResourceDefinitionResponse] = js.native
    def updateSubscriptionDefinition(params: UpdateSubscriptionDefinitionRequest): Request[UpdateSubscriptionDefinitionResponse] = js.native
  }

  @js.native
  trait AssociateRoleToGroupRequest extends js.Object {
    var GroupId: __string
    var RoleArn: __string
  }

  object AssociateRoleToGroupRequest {
    @inline
    def apply(
        GroupId: __string,
        RoleArn: __string
    ): AssociateRoleToGroupRequest = {
      val __obj = js.Dynamic.literal(
        "GroupId" -> GroupId.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateRoleToGroupRequest]
    }
  }

  @js.native
  trait AssociateRoleToGroupResponse extends js.Object {
    var AssociatedAt: js.UndefOr[__string]
  }

  object AssociateRoleToGroupResponse {
    @inline
    def apply(
        AssociatedAt: js.UndefOr[__string] = js.undefined
    ): AssociateRoleToGroupResponse = {
      val __obj = js.Dynamic.literal()
      AssociatedAt.foreach(__v => __obj.updateDynamic("AssociatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateRoleToGroupResponse]
    }
  }

  @js.native
  trait AssociateServiceRoleToAccountRequest extends js.Object {
    var RoleArn: __string
  }

  object AssociateServiceRoleToAccountRequest {
    @inline
    def apply(
        RoleArn: __string
    ): AssociateServiceRoleToAccountRequest = {
      val __obj = js.Dynamic.literal(
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateServiceRoleToAccountRequest]
    }
  }

  @js.native
  trait AssociateServiceRoleToAccountResponse extends js.Object {
    var AssociatedAt: js.UndefOr[__string]
  }

  object AssociateServiceRoleToAccountResponse {
    @inline
    def apply(
        AssociatedAt: js.UndefOr[__string] = js.undefined
    ): AssociateServiceRoleToAccountResponse = {
      val __obj = js.Dynamic.literal()
      AssociatedAt.foreach(__v => __obj.updateDynamic("AssociatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateServiceRoleToAccountResponse]
    }
  }

  /** Information about a bulk deployment. You cannot start a new bulk deployment while another one is still running or in a non-terminal state.
    */
  @js.native
  trait BulkDeployment extends js.Object {
    var BulkDeploymentArn: js.UndefOr[__string]
    var BulkDeploymentId: js.UndefOr[__string]
    var CreatedAt: js.UndefOr[__string]
  }

  object BulkDeployment {
    @inline
    def apply(
        BulkDeploymentArn: js.UndefOr[__string] = js.undefined,
        BulkDeploymentId: js.UndefOr[__string] = js.undefined,
        CreatedAt: js.UndefOr[__string] = js.undefined
    ): BulkDeployment = {
      val __obj = js.Dynamic.literal()
      BulkDeploymentArn.foreach(__v => __obj.updateDynamic("BulkDeploymentArn")(__v.asInstanceOf[js.Any]))
      BulkDeploymentId.foreach(__v => __obj.updateDynamic("BulkDeploymentId")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BulkDeployment]
    }
  }

  /** Relevant metrics on input records processed during bulk deployment.
    */
  @js.native
  trait BulkDeploymentMetrics extends js.Object {
    var InvalidInputRecords: js.UndefOr[__integer]
    var RecordsProcessed: js.UndefOr[__integer]
    var RetryAttempts: js.UndefOr[__integer]
  }

  object BulkDeploymentMetrics {
    @inline
    def apply(
        InvalidInputRecords: js.UndefOr[__integer] = js.undefined,
        RecordsProcessed: js.UndefOr[__integer] = js.undefined,
        RetryAttempts: js.UndefOr[__integer] = js.undefined
    ): BulkDeploymentMetrics = {
      val __obj = js.Dynamic.literal()
      InvalidInputRecords.foreach(__v => __obj.updateDynamic("InvalidInputRecords")(__v.asInstanceOf[js.Any]))
      RecordsProcessed.foreach(__v => __obj.updateDynamic("RecordsProcessed")(__v.asInstanceOf[js.Any]))
      RetryAttempts.foreach(__v => __obj.updateDynamic("RetryAttempts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BulkDeploymentMetrics]
    }
  }

  /** Information about an individual group deployment in a bulk deployment operation.
    */
  @js.native
  trait BulkDeploymentResult extends js.Object {
    var CreatedAt: js.UndefOr[__string]
    var DeploymentArn: js.UndefOr[__string]
    var DeploymentId: js.UndefOr[__string]
    var DeploymentStatus: js.UndefOr[__string]
    var DeploymentType: js.UndefOr[DeploymentType]
    var ErrorDetails: js.UndefOr[ErrorDetails]
    var ErrorMessage: js.UndefOr[__string]
    var GroupArn: js.UndefOr[__string]
  }

  object BulkDeploymentResult {
    @inline
    def apply(
        CreatedAt: js.UndefOr[__string] = js.undefined,
        DeploymentArn: js.UndefOr[__string] = js.undefined,
        DeploymentId: js.UndefOr[__string] = js.undefined,
        DeploymentStatus: js.UndefOr[__string] = js.undefined,
        DeploymentType: js.UndefOr[DeploymentType] = js.undefined,
        ErrorDetails: js.UndefOr[ErrorDetails] = js.undefined,
        ErrorMessage: js.UndefOr[__string] = js.undefined,
        GroupArn: js.UndefOr[__string] = js.undefined
    ): BulkDeploymentResult = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      DeploymentArn.foreach(__v => __obj.updateDynamic("DeploymentArn")(__v.asInstanceOf[js.Any]))
      DeploymentId.foreach(__v => __obj.updateDynamic("DeploymentId")(__v.asInstanceOf[js.Any]))
      DeploymentStatus.foreach(__v => __obj.updateDynamic("DeploymentStatus")(__v.asInstanceOf[js.Any]))
      DeploymentType.foreach(__v => __obj.updateDynamic("DeploymentType")(__v.asInstanceOf[js.Any]))
      ErrorDetails.foreach(__v => __obj.updateDynamic("ErrorDetails")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      GroupArn.foreach(__v => __obj.updateDynamic("GroupArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BulkDeploymentResult]
    }
  }

  /** The current status of the bulk deployment.
    */
  @js.native
  sealed trait BulkDeploymentStatus extends js.Any
  object BulkDeploymentStatus {
    val Initializing = "Initializing".asInstanceOf[BulkDeploymentStatus]
    val Running = "Running".asInstanceOf[BulkDeploymentStatus]
    val Completed = "Completed".asInstanceOf[BulkDeploymentStatus]
    val Stopping = "Stopping".asInstanceOf[BulkDeploymentStatus]
    val Stopped = "Stopped".asInstanceOf[BulkDeploymentStatus]
    val Failed = "Failed".asInstanceOf[BulkDeploymentStatus]

    @inline def values = js.Array(Initializing, Running, Completed, Stopping, Stopped, Failed)
  }

  /** Information about a Greengrass core's connectivity.
    */
  @js.native
  trait ConnectivityInfo extends js.Object {
    var HostAddress: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var Metadata: js.UndefOr[__string]
    var PortNumber: js.UndefOr[__integer]
  }

  object ConnectivityInfo {
    @inline
    def apply(
        HostAddress: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        Metadata: js.UndefOr[__string] = js.undefined,
        PortNumber: js.UndefOr[__integer] = js.undefined
    ): ConnectivityInfo = {
      val __obj = js.Dynamic.literal()
      HostAddress.foreach(__v => __obj.updateDynamic("HostAddress")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Metadata.foreach(__v => __obj.updateDynamic("Metadata")(__v.asInstanceOf[js.Any]))
      PortNumber.foreach(__v => __obj.updateDynamic("PortNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectivityInfo]
    }
  }

  /** Information about a connector. Connectors run on the Greengrass core and contain built-in integration with local infrastructure, device protocols, AWS, and other cloud services.
    */
  @js.native
  trait Connector extends js.Object {
    var ConnectorArn: __string
    var Id: __string
    var Parameters: js.UndefOr[__mapOf__string]
  }

  object Connector {
    @inline
    def apply(
        ConnectorArn: __string,
        Id: __string,
        Parameters: js.UndefOr[__mapOf__string] = js.undefined
    ): Connector = {
      val __obj = js.Dynamic.literal(
        "ConnectorArn" -> ConnectorArn.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any]
      )

      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Connector]
    }
  }

  /** Information about the connector definition version, which is a container for connectors.
    */
  @js.native
  trait ConnectorDefinitionVersion extends js.Object {
    var Connectors: js.UndefOr[__listOfConnector]
  }

  object ConnectorDefinitionVersion {
    @inline
    def apply(
        Connectors: js.UndefOr[__listOfConnector] = js.undefined
    ): ConnectorDefinitionVersion = {
      val __obj = js.Dynamic.literal()
      Connectors.foreach(__v => __obj.updateDynamic("Connectors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectorDefinitionVersion]
    }
  }

  /** Information about a core.
    */
  @js.native
  trait Core extends js.Object {
    var CertificateArn: __string
    var Id: __string
    var ThingArn: __string
    var SyncShadow: js.UndefOr[__boolean]
  }

  object Core {
    @inline
    def apply(
        CertificateArn: __string,
        Id: __string,
        ThingArn: __string,
        SyncShadow: js.UndefOr[__boolean] = js.undefined
    ): Core = {
      val __obj = js.Dynamic.literal(
        "CertificateArn" -> CertificateArn.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "ThingArn" -> ThingArn.asInstanceOf[js.Any]
      )

      SyncShadow.foreach(__v => __obj.updateDynamic("SyncShadow")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Core]
    }
  }

  /** Information about a core definition version.
    */
  @js.native
  trait CoreDefinitionVersion extends js.Object {
    var Cores: js.UndefOr[__listOfCore]
  }

  object CoreDefinitionVersion {
    @inline
    def apply(
        Cores: js.UndefOr[__listOfCore] = js.undefined
    ): CoreDefinitionVersion = {
      val __obj = js.Dynamic.literal()
      Cores.foreach(__v => __obj.updateDynamic("Cores")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CoreDefinitionVersion]
    }
  }

  @js.native
  trait CreateConnectorDefinitionRequest extends js.Object {
    var AmznClientToken: js.UndefOr[__string]
    var InitialVersion: js.UndefOr[ConnectorDefinitionVersion]
    var Name: js.UndefOr[__string]
    var tags: js.UndefOr[Tags]
  }

  object CreateConnectorDefinitionRequest {
    @inline
    def apply(
        AmznClientToken: js.UndefOr[__string] = js.undefined,
        InitialVersion: js.UndefOr[ConnectorDefinitionVersion] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateConnectorDefinitionRequest = {
      val __obj = js.Dynamic.literal()
      AmznClientToken.foreach(__v => __obj.updateDynamic("AmznClientToken")(__v.asInstanceOf[js.Any]))
      InitialVersion.foreach(__v => __obj.updateDynamic("InitialVersion")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConnectorDefinitionRequest]
    }
  }

  @js.native
  trait CreateConnectorDefinitionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var LastUpdatedTimestamp: js.UndefOr[__string]
    var LatestVersion: js.UndefOr[__string]
    var LatestVersionArn: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
  }

  object CreateConnectorDefinitionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTimestamp: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
        LatestVersion: js.UndefOr[__string] = js.undefined,
        LatestVersionArn: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined
    ): CreateConnectorDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      LatestVersion.foreach(__v => __obj.updateDynamic("LatestVersion")(__v.asInstanceOf[js.Any]))
      LatestVersionArn.foreach(__v => __obj.updateDynamic("LatestVersionArn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConnectorDefinitionResponse]
    }
  }

  @js.native
  trait CreateConnectorDefinitionVersionRequest extends js.Object {
    var ConnectorDefinitionId: __string
    var AmznClientToken: js.UndefOr[__string]
    var Connectors: js.UndefOr[__listOfConnector]
  }

  object CreateConnectorDefinitionVersionRequest {
    @inline
    def apply(
        ConnectorDefinitionId: __string,
        AmznClientToken: js.UndefOr[__string] = js.undefined,
        Connectors: js.UndefOr[__listOfConnector] = js.undefined
    ): CreateConnectorDefinitionVersionRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectorDefinitionId" -> ConnectorDefinitionId.asInstanceOf[js.Any]
      )

      AmznClientToken.foreach(__v => __obj.updateDynamic("AmznClientToken")(__v.asInstanceOf[js.Any]))
      Connectors.foreach(__v => __obj.updateDynamic("Connectors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConnectorDefinitionVersionRequest]
    }
  }

  @js.native
  trait CreateConnectorDefinitionVersionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  object CreateConnectorDefinitionVersionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTimestamp: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__string] = js.undefined
    ): CreateConnectorDefinitionVersionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConnectorDefinitionVersionResponse]
    }
  }

  /** Information needed to create a core definition.
    */
  @js.native
  trait CreateCoreDefinitionRequest extends js.Object {
    var AmznClientToken: js.UndefOr[__string]
    var InitialVersion: js.UndefOr[CoreDefinitionVersion]
    var Name: js.UndefOr[__string]
    var tags: js.UndefOr[Tags]
  }

  object CreateCoreDefinitionRequest {
    @inline
    def apply(
        AmznClientToken: js.UndefOr[__string] = js.undefined,
        InitialVersion: js.UndefOr[CoreDefinitionVersion] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateCoreDefinitionRequest = {
      val __obj = js.Dynamic.literal()
      AmznClientToken.foreach(__v => __obj.updateDynamic("AmznClientToken")(__v.asInstanceOf[js.Any]))
      InitialVersion.foreach(__v => __obj.updateDynamic("InitialVersion")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCoreDefinitionRequest]
    }
  }

  @js.native
  trait CreateCoreDefinitionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var LastUpdatedTimestamp: js.UndefOr[__string]
    var LatestVersion: js.UndefOr[__string]
    var LatestVersionArn: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
  }

  object CreateCoreDefinitionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTimestamp: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
        LatestVersion: js.UndefOr[__string] = js.undefined,
        LatestVersionArn: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined
    ): CreateCoreDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      LatestVersion.foreach(__v => __obj.updateDynamic("LatestVersion")(__v.asInstanceOf[js.Any]))
      LatestVersionArn.foreach(__v => __obj.updateDynamic("LatestVersionArn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCoreDefinitionResponse]
    }
  }

  @js.native
  trait CreateCoreDefinitionVersionRequest extends js.Object {
    var CoreDefinitionId: __string
    var AmznClientToken: js.UndefOr[__string]
    var Cores: js.UndefOr[__listOfCore]
  }

  object CreateCoreDefinitionVersionRequest {
    @inline
    def apply(
        CoreDefinitionId: __string,
        AmznClientToken: js.UndefOr[__string] = js.undefined,
        Cores: js.UndefOr[__listOfCore] = js.undefined
    ): CreateCoreDefinitionVersionRequest = {
      val __obj = js.Dynamic.literal(
        "CoreDefinitionId" -> CoreDefinitionId.asInstanceOf[js.Any]
      )

      AmznClientToken.foreach(__v => __obj.updateDynamic("AmznClientToken")(__v.asInstanceOf[js.Any]))
      Cores.foreach(__v => __obj.updateDynamic("Cores")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCoreDefinitionVersionRequest]
    }
  }

  @js.native
  trait CreateCoreDefinitionVersionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  object CreateCoreDefinitionVersionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTimestamp: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__string] = js.undefined
    ): CreateCoreDefinitionVersionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCoreDefinitionVersionResponse]
    }
  }

  @js.native
  trait CreateDeploymentRequest extends js.Object {
    var DeploymentType: DeploymentType
    var GroupId: __string
    var AmznClientToken: js.UndefOr[__string]
    var DeploymentId: js.UndefOr[__string]
    var GroupVersionId: js.UndefOr[__string]
  }

  object CreateDeploymentRequest {
    @inline
    def apply(
        DeploymentType: DeploymentType,
        GroupId: __string,
        AmznClientToken: js.UndefOr[__string] = js.undefined,
        DeploymentId: js.UndefOr[__string] = js.undefined,
        GroupVersionId: js.UndefOr[__string] = js.undefined
    ): CreateDeploymentRequest = {
      val __obj = js.Dynamic.literal(
        "DeploymentType" -> DeploymentType.asInstanceOf[js.Any],
        "GroupId" -> GroupId.asInstanceOf[js.Any]
      )

      AmznClientToken.foreach(__v => __obj.updateDynamic("AmznClientToken")(__v.asInstanceOf[js.Any]))
      DeploymentId.foreach(__v => __obj.updateDynamic("DeploymentId")(__v.asInstanceOf[js.Any]))
      GroupVersionId.foreach(__v => __obj.updateDynamic("GroupVersionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeploymentRequest]
    }
  }

  @js.native
  trait CreateDeploymentResponse extends js.Object {
    var DeploymentArn: js.UndefOr[__string]
    var DeploymentId: js.UndefOr[__string]
  }

  object CreateDeploymentResponse {
    @inline
    def apply(
        DeploymentArn: js.UndefOr[__string] = js.undefined,
        DeploymentId: js.UndefOr[__string] = js.undefined
    ): CreateDeploymentResponse = {
      val __obj = js.Dynamic.literal()
      DeploymentArn.foreach(__v => __obj.updateDynamic("DeploymentArn")(__v.asInstanceOf[js.Any]))
      DeploymentId.foreach(__v => __obj.updateDynamic("DeploymentId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeploymentResponse]
    }
  }

  @js.native
  trait CreateDeviceDefinitionRequest extends js.Object {
    var AmznClientToken: js.UndefOr[__string]
    var InitialVersion: js.UndefOr[DeviceDefinitionVersion]
    var Name: js.UndefOr[__string]
    var tags: js.UndefOr[Tags]
  }

  object CreateDeviceDefinitionRequest {
    @inline
    def apply(
        AmznClientToken: js.UndefOr[__string] = js.undefined,
        InitialVersion: js.UndefOr[DeviceDefinitionVersion] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateDeviceDefinitionRequest = {
      val __obj = js.Dynamic.literal()
      AmznClientToken.foreach(__v => __obj.updateDynamic("AmznClientToken")(__v.asInstanceOf[js.Any]))
      InitialVersion.foreach(__v => __obj.updateDynamic("InitialVersion")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeviceDefinitionRequest]
    }
  }

  @js.native
  trait CreateDeviceDefinitionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var LastUpdatedTimestamp: js.UndefOr[__string]
    var LatestVersion: js.UndefOr[__string]
    var LatestVersionArn: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
  }

  object CreateDeviceDefinitionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTimestamp: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
        LatestVersion: js.UndefOr[__string] = js.undefined,
        LatestVersionArn: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined
    ): CreateDeviceDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      LatestVersion.foreach(__v => __obj.updateDynamic("LatestVersion")(__v.asInstanceOf[js.Any]))
      LatestVersionArn.foreach(__v => __obj.updateDynamic("LatestVersionArn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeviceDefinitionResponse]
    }
  }

  @js.native
  trait CreateDeviceDefinitionVersionRequest extends js.Object {
    var DeviceDefinitionId: __string
    var AmznClientToken: js.UndefOr[__string]
    var Devices: js.UndefOr[__listOfDevice]
  }

  object CreateDeviceDefinitionVersionRequest {
    @inline
    def apply(
        DeviceDefinitionId: __string,
        AmznClientToken: js.UndefOr[__string] = js.undefined,
        Devices: js.UndefOr[__listOfDevice] = js.undefined
    ): CreateDeviceDefinitionVersionRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceDefinitionId" -> DeviceDefinitionId.asInstanceOf[js.Any]
      )

      AmznClientToken.foreach(__v => __obj.updateDynamic("AmznClientToken")(__v.asInstanceOf[js.Any]))
      Devices.foreach(__v => __obj.updateDynamic("Devices")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeviceDefinitionVersionRequest]
    }
  }

  @js.native
  trait CreateDeviceDefinitionVersionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  object CreateDeviceDefinitionVersionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTimestamp: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__string] = js.undefined
    ): CreateDeviceDefinitionVersionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeviceDefinitionVersionResponse]
    }
  }

  @js.native
  trait CreateFunctionDefinitionRequest extends js.Object {
    var AmznClientToken: js.UndefOr[__string]
    var InitialVersion: js.UndefOr[FunctionDefinitionVersion]
    var Name: js.UndefOr[__string]
    var tags: js.UndefOr[Tags]
  }

  object CreateFunctionDefinitionRequest {
    @inline
    def apply(
        AmznClientToken: js.UndefOr[__string] = js.undefined,
        InitialVersion: js.UndefOr[FunctionDefinitionVersion] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateFunctionDefinitionRequest = {
      val __obj = js.Dynamic.literal()
      AmznClientToken.foreach(__v => __obj.updateDynamic("AmznClientToken")(__v.asInstanceOf[js.Any]))
      InitialVersion.foreach(__v => __obj.updateDynamic("InitialVersion")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFunctionDefinitionRequest]
    }
  }

  @js.native
  trait CreateFunctionDefinitionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var LastUpdatedTimestamp: js.UndefOr[__string]
    var LatestVersion: js.UndefOr[__string]
    var LatestVersionArn: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
  }

  object CreateFunctionDefinitionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTimestamp: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
        LatestVersion: js.UndefOr[__string] = js.undefined,
        LatestVersionArn: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined
    ): CreateFunctionDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      LatestVersion.foreach(__v => __obj.updateDynamic("LatestVersion")(__v.asInstanceOf[js.Any]))
      LatestVersionArn.foreach(__v => __obj.updateDynamic("LatestVersionArn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFunctionDefinitionResponse]
    }
  }

  /** Information needed to create a function definition version.
    */
  @js.native
  trait CreateFunctionDefinitionVersionRequest extends js.Object {
    var FunctionDefinitionId: __string
    var AmznClientToken: js.UndefOr[__string]
    var DefaultConfig: js.UndefOr[FunctionDefaultConfig]
    var Functions: js.UndefOr[__listOfFunction]
  }

  object CreateFunctionDefinitionVersionRequest {
    @inline
    def apply(
        FunctionDefinitionId: __string,
        AmznClientToken: js.UndefOr[__string] = js.undefined,
        DefaultConfig: js.UndefOr[FunctionDefaultConfig] = js.undefined,
        Functions: js.UndefOr[__listOfFunction] = js.undefined
    ): CreateFunctionDefinitionVersionRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionDefinitionId" -> FunctionDefinitionId.asInstanceOf[js.Any]
      )

      AmznClientToken.foreach(__v => __obj.updateDynamic("AmznClientToken")(__v.asInstanceOf[js.Any]))
      DefaultConfig.foreach(__v => __obj.updateDynamic("DefaultConfig")(__v.asInstanceOf[js.Any]))
      Functions.foreach(__v => __obj.updateDynamic("Functions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFunctionDefinitionVersionRequest]
    }
  }

  @js.native
  trait CreateFunctionDefinitionVersionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  object CreateFunctionDefinitionVersionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTimestamp: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__string] = js.undefined
    ): CreateFunctionDefinitionVersionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFunctionDefinitionVersionResponse]
    }
  }

  @js.native
  trait CreateGroupCertificateAuthorityRequest extends js.Object {
    var GroupId: __string
    var AmznClientToken: js.UndefOr[__string]
  }

  object CreateGroupCertificateAuthorityRequest {
    @inline
    def apply(
        GroupId: __string,
        AmznClientToken: js.UndefOr[__string] = js.undefined
    ): CreateGroupCertificateAuthorityRequest = {
      val __obj = js.Dynamic.literal(
        "GroupId" -> GroupId.asInstanceOf[js.Any]
      )

      AmznClientToken.foreach(__v => __obj.updateDynamic("AmznClientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGroupCertificateAuthorityRequest]
    }
  }

  @js.native
  trait CreateGroupCertificateAuthorityResponse extends js.Object {
    var GroupCertificateAuthorityArn: js.UndefOr[__string]
  }

  object CreateGroupCertificateAuthorityResponse {
    @inline
    def apply(
        GroupCertificateAuthorityArn: js.UndefOr[__string] = js.undefined
    ): CreateGroupCertificateAuthorityResponse = {
      val __obj = js.Dynamic.literal()
      GroupCertificateAuthorityArn.foreach(__v => __obj.updateDynamic("GroupCertificateAuthorityArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGroupCertificateAuthorityResponse]
    }
  }

  @js.native
  trait CreateGroupRequest extends js.Object {
    var AmznClientToken: js.UndefOr[__string]
    var InitialVersion: js.UndefOr[GroupVersion]
    var Name: js.UndefOr[__string]
    var tags: js.UndefOr[Tags]
  }

  object CreateGroupRequest {
    @inline
    def apply(
        AmznClientToken: js.UndefOr[__string] = js.undefined,
        InitialVersion: js.UndefOr[GroupVersion] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateGroupRequest = {
      val __obj = js.Dynamic.literal()
      AmznClientToken.foreach(__v => __obj.updateDynamic("AmznClientToken")(__v.asInstanceOf[js.Any]))
      InitialVersion.foreach(__v => __obj.updateDynamic("InitialVersion")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGroupRequest]
    }
  }

  @js.native
  trait CreateGroupResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var LastUpdatedTimestamp: js.UndefOr[__string]
    var LatestVersion: js.UndefOr[__string]
    var LatestVersionArn: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
  }

  object CreateGroupResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTimestamp: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
        LatestVersion: js.UndefOr[__string] = js.undefined,
        LatestVersionArn: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined
    ): CreateGroupResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      LatestVersion.foreach(__v => __obj.updateDynamic("LatestVersion")(__v.asInstanceOf[js.Any]))
      LatestVersionArn.foreach(__v => __obj.updateDynamic("LatestVersionArn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGroupResponse]
    }
  }

  @js.native
  trait CreateGroupVersionRequest extends js.Object {
    var GroupId: __string
    var AmznClientToken: js.UndefOr[__string]
    var ConnectorDefinitionVersionArn: js.UndefOr[__string]
    var CoreDefinitionVersionArn: js.UndefOr[__string]
    var DeviceDefinitionVersionArn: js.UndefOr[__string]
    var FunctionDefinitionVersionArn: js.UndefOr[__string]
    var LoggerDefinitionVersionArn: js.UndefOr[__string]
    var ResourceDefinitionVersionArn: js.UndefOr[__string]
    var SubscriptionDefinitionVersionArn: js.UndefOr[__string]
  }

  object CreateGroupVersionRequest {
    @inline
    def apply(
        GroupId: __string,
        AmznClientToken: js.UndefOr[__string] = js.undefined,
        ConnectorDefinitionVersionArn: js.UndefOr[__string] = js.undefined,
        CoreDefinitionVersionArn: js.UndefOr[__string] = js.undefined,
        DeviceDefinitionVersionArn: js.UndefOr[__string] = js.undefined,
        FunctionDefinitionVersionArn: js.UndefOr[__string] = js.undefined,
        LoggerDefinitionVersionArn: js.UndefOr[__string] = js.undefined,
        ResourceDefinitionVersionArn: js.UndefOr[__string] = js.undefined,
        SubscriptionDefinitionVersionArn: js.UndefOr[__string] = js.undefined
    ): CreateGroupVersionRequest = {
      val __obj = js.Dynamic.literal(
        "GroupId" -> GroupId.asInstanceOf[js.Any]
      )

      AmznClientToken.foreach(__v => __obj.updateDynamic("AmznClientToken")(__v.asInstanceOf[js.Any]))
      ConnectorDefinitionVersionArn.foreach(__v => __obj.updateDynamic("ConnectorDefinitionVersionArn")(__v.asInstanceOf[js.Any]))
      CoreDefinitionVersionArn.foreach(__v => __obj.updateDynamic("CoreDefinitionVersionArn")(__v.asInstanceOf[js.Any]))
      DeviceDefinitionVersionArn.foreach(__v => __obj.updateDynamic("DeviceDefinitionVersionArn")(__v.asInstanceOf[js.Any]))
      FunctionDefinitionVersionArn.foreach(__v => __obj.updateDynamic("FunctionDefinitionVersionArn")(__v.asInstanceOf[js.Any]))
      LoggerDefinitionVersionArn.foreach(__v => __obj.updateDynamic("LoggerDefinitionVersionArn")(__v.asInstanceOf[js.Any]))
      ResourceDefinitionVersionArn.foreach(__v => __obj.updateDynamic("ResourceDefinitionVersionArn")(__v.asInstanceOf[js.Any]))
      SubscriptionDefinitionVersionArn.foreach(__v => __obj.updateDynamic("SubscriptionDefinitionVersionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGroupVersionRequest]
    }
  }

  @js.native
  trait CreateGroupVersionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  object CreateGroupVersionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTimestamp: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__string] = js.undefined
    ): CreateGroupVersionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGroupVersionResponse]
    }
  }

  @js.native
  trait CreateLoggerDefinitionRequest extends js.Object {
    var AmznClientToken: js.UndefOr[__string]
    var InitialVersion: js.UndefOr[LoggerDefinitionVersion]
    var Name: js.UndefOr[__string]
    var tags: js.UndefOr[Tags]
  }

  object CreateLoggerDefinitionRequest {
    @inline
    def apply(
        AmznClientToken: js.UndefOr[__string] = js.undefined,
        InitialVersion: js.UndefOr[LoggerDefinitionVersion] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateLoggerDefinitionRequest = {
      val __obj = js.Dynamic.literal()
      AmznClientToken.foreach(__v => __obj.updateDynamic("AmznClientToken")(__v.asInstanceOf[js.Any]))
      InitialVersion.foreach(__v => __obj.updateDynamic("InitialVersion")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLoggerDefinitionRequest]
    }
  }

  @js.native
  trait CreateLoggerDefinitionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var LastUpdatedTimestamp: js.UndefOr[__string]
    var LatestVersion: js.UndefOr[__string]
    var LatestVersionArn: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
  }

  object CreateLoggerDefinitionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTimestamp: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
        LatestVersion: js.UndefOr[__string] = js.undefined,
        LatestVersionArn: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined
    ): CreateLoggerDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      LatestVersion.foreach(__v => __obj.updateDynamic("LatestVersion")(__v.asInstanceOf[js.Any]))
      LatestVersionArn.foreach(__v => __obj.updateDynamic("LatestVersionArn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLoggerDefinitionResponse]
    }
  }

  @js.native
  trait CreateLoggerDefinitionVersionRequest extends js.Object {
    var LoggerDefinitionId: __string
    var AmznClientToken: js.UndefOr[__string]
    var Loggers: js.UndefOr[__listOfLogger]
  }

  object CreateLoggerDefinitionVersionRequest {
    @inline
    def apply(
        LoggerDefinitionId: __string,
        AmznClientToken: js.UndefOr[__string] = js.undefined,
        Loggers: js.UndefOr[__listOfLogger] = js.undefined
    ): CreateLoggerDefinitionVersionRequest = {
      val __obj = js.Dynamic.literal(
        "LoggerDefinitionId" -> LoggerDefinitionId.asInstanceOf[js.Any]
      )

      AmznClientToken.foreach(__v => __obj.updateDynamic("AmznClientToken")(__v.asInstanceOf[js.Any]))
      Loggers.foreach(__v => __obj.updateDynamic("Loggers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLoggerDefinitionVersionRequest]
    }
  }

  @js.native
  trait CreateLoggerDefinitionVersionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  object CreateLoggerDefinitionVersionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTimestamp: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__string] = js.undefined
    ): CreateLoggerDefinitionVersionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLoggerDefinitionVersionResponse]
    }
  }

  @js.native
  trait CreateResourceDefinitionRequest extends js.Object {
    var AmznClientToken: js.UndefOr[__string]
    var InitialVersion: js.UndefOr[ResourceDefinitionVersion]
    var Name: js.UndefOr[__string]
    var tags: js.UndefOr[Tags]
  }

  object CreateResourceDefinitionRequest {
    @inline
    def apply(
        AmznClientToken: js.UndefOr[__string] = js.undefined,
        InitialVersion: js.UndefOr[ResourceDefinitionVersion] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateResourceDefinitionRequest = {
      val __obj = js.Dynamic.literal()
      AmznClientToken.foreach(__v => __obj.updateDynamic("AmznClientToken")(__v.asInstanceOf[js.Any]))
      InitialVersion.foreach(__v => __obj.updateDynamic("InitialVersion")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateResourceDefinitionRequest]
    }
  }

  @js.native
  trait CreateResourceDefinitionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var LastUpdatedTimestamp: js.UndefOr[__string]
    var LatestVersion: js.UndefOr[__string]
    var LatestVersionArn: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
  }

  object CreateResourceDefinitionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTimestamp: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
        LatestVersion: js.UndefOr[__string] = js.undefined,
        LatestVersionArn: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined
    ): CreateResourceDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      LatestVersion.foreach(__v => __obj.updateDynamic("LatestVersion")(__v.asInstanceOf[js.Any]))
      LatestVersionArn.foreach(__v => __obj.updateDynamic("LatestVersionArn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateResourceDefinitionResponse]
    }
  }

  @js.native
  trait CreateResourceDefinitionVersionRequest extends js.Object {
    var ResourceDefinitionId: __string
    var AmznClientToken: js.UndefOr[__string]
    var Resources: js.UndefOr[__listOfResource]
  }

  object CreateResourceDefinitionVersionRequest {
    @inline
    def apply(
        ResourceDefinitionId: __string,
        AmznClientToken: js.UndefOr[__string] = js.undefined,
        Resources: js.UndefOr[__listOfResource] = js.undefined
    ): CreateResourceDefinitionVersionRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceDefinitionId" -> ResourceDefinitionId.asInstanceOf[js.Any]
      )

      AmznClientToken.foreach(__v => __obj.updateDynamic("AmznClientToken")(__v.asInstanceOf[js.Any]))
      Resources.foreach(__v => __obj.updateDynamic("Resources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateResourceDefinitionVersionRequest]
    }
  }

  @js.native
  trait CreateResourceDefinitionVersionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  object CreateResourceDefinitionVersionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTimestamp: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__string] = js.undefined
    ): CreateResourceDefinitionVersionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateResourceDefinitionVersionResponse]
    }
  }

  @js.native
  trait CreateSoftwareUpdateJobRequest extends js.Object {
    var S3UrlSignerRole: S3UrlSignerRole
    var SoftwareToUpdate: SoftwareToUpdate
    var UpdateTargets: UpdateTargets
    var UpdateTargetsArchitecture: UpdateTargetsArchitecture
    var UpdateTargetsOperatingSystem: UpdateTargetsOperatingSystem
    var AmznClientToken: js.UndefOr[__string]
    var UpdateAgentLogLevel: js.UndefOr[UpdateAgentLogLevel]
  }

  object CreateSoftwareUpdateJobRequest {
    @inline
    def apply(
        S3UrlSignerRole: S3UrlSignerRole,
        SoftwareToUpdate: SoftwareToUpdate,
        UpdateTargets: UpdateTargets,
        UpdateTargetsArchitecture: UpdateTargetsArchitecture,
        UpdateTargetsOperatingSystem: UpdateTargetsOperatingSystem,
        AmznClientToken: js.UndefOr[__string] = js.undefined,
        UpdateAgentLogLevel: js.UndefOr[UpdateAgentLogLevel] = js.undefined
    ): CreateSoftwareUpdateJobRequest = {
      val __obj = js.Dynamic.literal(
        "S3UrlSignerRole" -> S3UrlSignerRole.asInstanceOf[js.Any],
        "SoftwareToUpdate" -> SoftwareToUpdate.asInstanceOf[js.Any],
        "UpdateTargets" -> UpdateTargets.asInstanceOf[js.Any],
        "UpdateTargetsArchitecture" -> UpdateTargetsArchitecture.asInstanceOf[js.Any],
        "UpdateTargetsOperatingSystem" -> UpdateTargetsOperatingSystem.asInstanceOf[js.Any]
      )

      AmznClientToken.foreach(__v => __obj.updateDynamic("AmznClientToken")(__v.asInstanceOf[js.Any]))
      UpdateAgentLogLevel.foreach(__v => __obj.updateDynamic("UpdateAgentLogLevel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSoftwareUpdateJobRequest]
    }
  }

  @js.native
  trait CreateSoftwareUpdateJobResponse extends js.Object {
    var IotJobArn: js.UndefOr[__string]
    var IotJobId: js.UndefOr[__string]
    var PlatformSoftwareVersion: js.UndefOr[__string]
  }

  object CreateSoftwareUpdateJobResponse {
    @inline
    def apply(
        IotJobArn: js.UndefOr[__string] = js.undefined,
        IotJobId: js.UndefOr[__string] = js.undefined,
        PlatformSoftwareVersion: js.UndefOr[__string] = js.undefined
    ): CreateSoftwareUpdateJobResponse = {
      val __obj = js.Dynamic.literal()
      IotJobArn.foreach(__v => __obj.updateDynamic("IotJobArn")(__v.asInstanceOf[js.Any]))
      IotJobId.foreach(__v => __obj.updateDynamic("IotJobId")(__v.asInstanceOf[js.Any]))
      PlatformSoftwareVersion.foreach(__v => __obj.updateDynamic("PlatformSoftwareVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSoftwareUpdateJobResponse]
    }
  }

  @js.native
  trait CreateSubscriptionDefinitionRequest extends js.Object {
    var AmznClientToken: js.UndefOr[__string]
    var InitialVersion: js.UndefOr[SubscriptionDefinitionVersion]
    var Name: js.UndefOr[__string]
    var tags: js.UndefOr[Tags]
  }

  object CreateSubscriptionDefinitionRequest {
    @inline
    def apply(
        AmznClientToken: js.UndefOr[__string] = js.undefined,
        InitialVersion: js.UndefOr[SubscriptionDefinitionVersion] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateSubscriptionDefinitionRequest = {
      val __obj = js.Dynamic.literal()
      AmznClientToken.foreach(__v => __obj.updateDynamic("AmznClientToken")(__v.asInstanceOf[js.Any]))
      InitialVersion.foreach(__v => __obj.updateDynamic("InitialVersion")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSubscriptionDefinitionRequest]
    }
  }

  @js.native
  trait CreateSubscriptionDefinitionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var LastUpdatedTimestamp: js.UndefOr[__string]
    var LatestVersion: js.UndefOr[__string]
    var LatestVersionArn: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
  }

  object CreateSubscriptionDefinitionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTimestamp: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
        LatestVersion: js.UndefOr[__string] = js.undefined,
        LatestVersionArn: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined
    ): CreateSubscriptionDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      LatestVersion.foreach(__v => __obj.updateDynamic("LatestVersion")(__v.asInstanceOf[js.Any]))
      LatestVersionArn.foreach(__v => __obj.updateDynamic("LatestVersionArn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSubscriptionDefinitionResponse]
    }
  }

  @js.native
  trait CreateSubscriptionDefinitionVersionRequest extends js.Object {
    var SubscriptionDefinitionId: __string
    var AmznClientToken: js.UndefOr[__string]
    var Subscriptions: js.UndefOr[__listOfSubscription]
  }

  object CreateSubscriptionDefinitionVersionRequest {
    @inline
    def apply(
        SubscriptionDefinitionId: __string,
        AmznClientToken: js.UndefOr[__string] = js.undefined,
        Subscriptions: js.UndefOr[__listOfSubscription] = js.undefined
    ): CreateSubscriptionDefinitionVersionRequest = {
      val __obj = js.Dynamic.literal(
        "SubscriptionDefinitionId" -> SubscriptionDefinitionId.asInstanceOf[js.Any]
      )

      AmznClientToken.foreach(__v => __obj.updateDynamic("AmznClientToken")(__v.asInstanceOf[js.Any]))
      Subscriptions.foreach(__v => __obj.updateDynamic("Subscriptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSubscriptionDefinitionVersionRequest]
    }
  }

  @js.native
  trait CreateSubscriptionDefinitionVersionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  object CreateSubscriptionDefinitionVersionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTimestamp: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__string] = js.undefined
    ): CreateSubscriptionDefinitionVersionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSubscriptionDefinitionVersionResponse]
    }
  }

  /** Information about a definition.
    */
  @js.native
  trait DefinitionInformation extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var LastUpdatedTimestamp: js.UndefOr[__string]
    var LatestVersion: js.UndefOr[__string]
    var LatestVersionArn: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
    var Tags: js.UndefOr[Tags]
  }

  object DefinitionInformation {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTimestamp: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
        LatestVersion: js.UndefOr[__string] = js.undefined,
        LatestVersionArn: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): DefinitionInformation = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      LatestVersion.foreach(__v => __obj.updateDynamic("LatestVersion")(__v.asInstanceOf[js.Any]))
      LatestVersionArn.foreach(__v => __obj.updateDynamic("LatestVersionArn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DefinitionInformation]
    }
  }

  @js.native
  trait DeleteConnectorDefinitionRequest extends js.Object {
    var ConnectorDefinitionId: __string
  }

  object DeleteConnectorDefinitionRequest {
    @inline
    def apply(
        ConnectorDefinitionId: __string
    ): DeleteConnectorDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectorDefinitionId" -> ConnectorDefinitionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteConnectorDefinitionRequest]
    }
  }

  @js.native
  trait DeleteConnectorDefinitionResponse extends js.Object {}

  object DeleteConnectorDefinitionResponse {
    @inline
    def apply(
    ): DeleteConnectorDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteConnectorDefinitionResponse]
    }
  }

  @js.native
  trait DeleteCoreDefinitionRequest extends js.Object {
    var CoreDefinitionId: __string
  }

  object DeleteCoreDefinitionRequest {
    @inline
    def apply(
        CoreDefinitionId: __string
    ): DeleteCoreDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "CoreDefinitionId" -> CoreDefinitionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteCoreDefinitionRequest]
    }
  }

  @js.native
  trait DeleteCoreDefinitionResponse extends js.Object {}

  object DeleteCoreDefinitionResponse {
    @inline
    def apply(
    ): DeleteCoreDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteCoreDefinitionResponse]
    }
  }

  @js.native
  trait DeleteDeviceDefinitionRequest extends js.Object {
    var DeviceDefinitionId: __string
  }

  object DeleteDeviceDefinitionRequest {
    @inline
    def apply(
        DeviceDefinitionId: __string
    ): DeleteDeviceDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceDefinitionId" -> DeviceDefinitionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDeviceDefinitionRequest]
    }
  }

  @js.native
  trait DeleteDeviceDefinitionResponse extends js.Object {}

  object DeleteDeviceDefinitionResponse {
    @inline
    def apply(
    ): DeleteDeviceDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteDeviceDefinitionResponse]
    }
  }

  @js.native
  trait DeleteFunctionDefinitionRequest extends js.Object {
    var FunctionDefinitionId: __string
  }

  object DeleteFunctionDefinitionRequest {
    @inline
    def apply(
        FunctionDefinitionId: __string
    ): DeleteFunctionDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionDefinitionId" -> FunctionDefinitionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteFunctionDefinitionRequest]
    }
  }

  @js.native
  trait DeleteFunctionDefinitionResponse extends js.Object {}

  object DeleteFunctionDefinitionResponse {
    @inline
    def apply(
    ): DeleteFunctionDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteFunctionDefinitionResponse]
    }
  }

  @js.native
  trait DeleteGroupRequest extends js.Object {
    var GroupId: __string
  }

  object DeleteGroupRequest {
    @inline
    def apply(
        GroupId: __string
    ): DeleteGroupRequest = {
      val __obj = js.Dynamic.literal(
        "GroupId" -> GroupId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteGroupRequest]
    }
  }

  @js.native
  trait DeleteGroupResponse extends js.Object {}

  object DeleteGroupResponse {
    @inline
    def apply(
    ): DeleteGroupResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteGroupResponse]
    }
  }

  @js.native
  trait DeleteLoggerDefinitionRequest extends js.Object {
    var LoggerDefinitionId: __string
  }

  object DeleteLoggerDefinitionRequest {
    @inline
    def apply(
        LoggerDefinitionId: __string
    ): DeleteLoggerDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "LoggerDefinitionId" -> LoggerDefinitionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteLoggerDefinitionRequest]
    }
  }

  @js.native
  trait DeleteLoggerDefinitionResponse extends js.Object {}

  object DeleteLoggerDefinitionResponse {
    @inline
    def apply(
    ): DeleteLoggerDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteLoggerDefinitionResponse]
    }
  }

  @js.native
  trait DeleteResourceDefinitionRequest extends js.Object {
    var ResourceDefinitionId: __string
  }

  object DeleteResourceDefinitionRequest {
    @inline
    def apply(
        ResourceDefinitionId: __string
    ): DeleteResourceDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceDefinitionId" -> ResourceDefinitionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteResourceDefinitionRequest]
    }
  }

  @js.native
  trait DeleteResourceDefinitionResponse extends js.Object {}

  object DeleteResourceDefinitionResponse {
    @inline
    def apply(
    ): DeleteResourceDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteResourceDefinitionResponse]
    }
  }

  @js.native
  trait DeleteSubscriptionDefinitionRequest extends js.Object {
    var SubscriptionDefinitionId: __string
  }

  object DeleteSubscriptionDefinitionRequest {
    @inline
    def apply(
        SubscriptionDefinitionId: __string
    ): DeleteSubscriptionDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "SubscriptionDefinitionId" -> SubscriptionDefinitionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSubscriptionDefinitionRequest]
    }
  }

  @js.native
  trait DeleteSubscriptionDefinitionResponse extends js.Object {}

  object DeleteSubscriptionDefinitionResponse {
    @inline
    def apply(
    ): DeleteSubscriptionDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteSubscriptionDefinitionResponse]
    }
  }

  /** Information about a deployment.
    */
  @js.native
  trait Deployment extends js.Object {
    var CreatedAt: js.UndefOr[__string]
    var DeploymentArn: js.UndefOr[__string]
    var DeploymentId: js.UndefOr[__string]
    var DeploymentType: js.UndefOr[DeploymentType]
    var GroupArn: js.UndefOr[__string]
  }

  object Deployment {
    @inline
    def apply(
        CreatedAt: js.UndefOr[__string] = js.undefined,
        DeploymentArn: js.UndefOr[__string] = js.undefined,
        DeploymentId: js.UndefOr[__string] = js.undefined,
        DeploymentType: js.UndefOr[DeploymentType] = js.undefined,
        GroupArn: js.UndefOr[__string] = js.undefined
    ): Deployment = {
      val __obj = js.Dynamic.literal()
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      DeploymentArn.foreach(__v => __obj.updateDynamic("DeploymentArn")(__v.asInstanceOf[js.Any]))
      DeploymentId.foreach(__v => __obj.updateDynamic("DeploymentId")(__v.asInstanceOf[js.Any]))
      DeploymentType.foreach(__v => __obj.updateDynamic("DeploymentType")(__v.asInstanceOf[js.Any]))
      GroupArn.foreach(__v => __obj.updateDynamic("GroupArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Deployment]
    }
  }

  /** The type of deployment. When used for ''CreateDeployment'', only ''NewDeployment'' and ''Redeployment'' are valid.
    */
  @js.native
  sealed trait DeploymentType extends js.Any
  object DeploymentType {
    val NewDeployment = "NewDeployment".asInstanceOf[DeploymentType]
    val Redeployment = "Redeployment".asInstanceOf[DeploymentType]
    val ResetDeployment = "ResetDeployment".asInstanceOf[DeploymentType]
    val ForceResetDeployment = "ForceResetDeployment".asInstanceOf[DeploymentType]

    @inline def values = js.Array(NewDeployment, Redeployment, ResetDeployment, ForceResetDeployment)
  }

  /** Information about a device.
    */
  @js.native
  trait Device extends js.Object {
    var CertificateArn: __string
    var Id: __string
    var ThingArn: __string
    var SyncShadow: js.UndefOr[__boolean]
  }

  object Device {
    @inline
    def apply(
        CertificateArn: __string,
        Id: __string,
        ThingArn: __string,
        SyncShadow: js.UndefOr[__boolean] = js.undefined
    ): Device = {
      val __obj = js.Dynamic.literal(
        "CertificateArn" -> CertificateArn.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "ThingArn" -> ThingArn.asInstanceOf[js.Any]
      )

      SyncShadow.foreach(__v => __obj.updateDynamic("SyncShadow")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Device]
    }
  }

  /** Information about a device definition version.
    */
  @js.native
  trait DeviceDefinitionVersion extends js.Object {
    var Devices: js.UndefOr[__listOfDevice]
  }

  object DeviceDefinitionVersion {
    @inline
    def apply(
        Devices: js.UndefOr[__listOfDevice] = js.undefined
    ): DeviceDefinitionVersion = {
      val __obj = js.Dynamic.literal()
      Devices.foreach(__v => __obj.updateDynamic("Devices")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceDefinitionVersion]
    }
  }

  @js.native
  trait DisassociateRoleFromGroupRequest extends js.Object {
    var GroupId: __string
  }

  object DisassociateRoleFromGroupRequest {
    @inline
    def apply(
        GroupId: __string
    ): DisassociateRoleFromGroupRequest = {
      val __obj = js.Dynamic.literal(
        "GroupId" -> GroupId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateRoleFromGroupRequest]
    }
  }

  @js.native
  trait DisassociateRoleFromGroupResponse extends js.Object {
    var DisassociatedAt: js.UndefOr[__string]
  }

  object DisassociateRoleFromGroupResponse {
    @inline
    def apply(
        DisassociatedAt: js.UndefOr[__string] = js.undefined
    ): DisassociateRoleFromGroupResponse = {
      val __obj = js.Dynamic.literal()
      DisassociatedAt.foreach(__v => __obj.updateDynamic("DisassociatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateRoleFromGroupResponse]
    }
  }

  @js.native
  trait DisassociateServiceRoleFromAccountRequest extends js.Object {}

  object DisassociateServiceRoleFromAccountRequest {
    @inline
    def apply(
    ): DisassociateServiceRoleFromAccountRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateServiceRoleFromAccountRequest]
    }
  }

  @js.native
  trait DisassociateServiceRoleFromAccountResponse extends js.Object {
    var DisassociatedAt: js.UndefOr[__string]
  }

  object DisassociateServiceRoleFromAccountResponse {
    @inline
    def apply(
        DisassociatedAt: js.UndefOr[__string] = js.undefined
    ): DisassociateServiceRoleFromAccountResponse = {
      val __obj = js.Dynamic.literal()
      DisassociatedAt.foreach(__v => __obj.updateDynamic("DisassociatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateServiceRoleFromAccountResponse]
    }
  }

  @js.native
  sealed trait EncodingType extends js.Any
  object EncodingType {
    val binary = "binary".asInstanceOf[EncodingType]
    val json = "json".asInstanceOf[EncodingType]

    @inline def values = js.Array(binary, json)
  }

  /** Details about the error.
    */
  @js.native
  trait ErrorDetail extends js.Object {
    var DetailedErrorCode: js.UndefOr[__string]
    var DetailedErrorMessage: js.UndefOr[__string]
  }

  object ErrorDetail {
    @inline
    def apply(
        DetailedErrorCode: js.UndefOr[__string] = js.undefined,
        DetailedErrorMessage: js.UndefOr[__string] = js.undefined
    ): ErrorDetail = {
      val __obj = js.Dynamic.literal()
      DetailedErrorCode.foreach(__v => __obj.updateDynamic("DetailedErrorCode")(__v.asInstanceOf[js.Any]))
      DetailedErrorMessage.foreach(__v => __obj.updateDynamic("DetailedErrorMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ErrorDetail]
    }
  }

  /** Information about a Lambda function.
    */
  @js.native
  trait Function extends js.Object {
    var Id: __string
    var FunctionArn: js.UndefOr[__string]
    var FunctionConfiguration: js.UndefOr[FunctionConfiguration]
  }

  object Function {
    @inline
    def apply(
        Id: __string,
        FunctionArn: js.UndefOr[__string] = js.undefined,
        FunctionConfiguration: js.UndefOr[FunctionConfiguration] = js.undefined
    ): Function = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      FunctionArn.foreach(__v => __obj.updateDynamic("FunctionArn")(__v.asInstanceOf[js.Any]))
      FunctionConfiguration.foreach(__v => __obj.updateDynamic("FunctionConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Function]
    }
  }

  /** The configuration of the Lambda function.
    */
  @js.native
  trait FunctionConfiguration extends js.Object {
    var EncodingType: js.UndefOr[EncodingType]
    var Environment: js.UndefOr[FunctionConfigurationEnvironment]
    var ExecArgs: js.UndefOr[__string]
    var Executable: js.UndefOr[__string]
    var MemorySize: js.UndefOr[__integer]
    var Pinned: js.UndefOr[__boolean]
    var Timeout: js.UndefOr[__integer]
  }

  object FunctionConfiguration {
    @inline
    def apply(
        EncodingType: js.UndefOr[EncodingType] = js.undefined,
        Environment: js.UndefOr[FunctionConfigurationEnvironment] = js.undefined,
        ExecArgs: js.UndefOr[__string] = js.undefined,
        Executable: js.UndefOr[__string] = js.undefined,
        MemorySize: js.UndefOr[__integer] = js.undefined,
        Pinned: js.UndefOr[__boolean] = js.undefined,
        Timeout: js.UndefOr[__integer] = js.undefined
    ): FunctionConfiguration = {
      val __obj = js.Dynamic.literal()
      EncodingType.foreach(__v => __obj.updateDynamic("EncodingType")(__v.asInstanceOf[js.Any]))
      Environment.foreach(__v => __obj.updateDynamic("Environment")(__v.asInstanceOf[js.Any]))
      ExecArgs.foreach(__v => __obj.updateDynamic("ExecArgs")(__v.asInstanceOf[js.Any]))
      Executable.foreach(__v => __obj.updateDynamic("Executable")(__v.asInstanceOf[js.Any]))
      MemorySize.foreach(__v => __obj.updateDynamic("MemorySize")(__v.asInstanceOf[js.Any]))
      Pinned.foreach(__v => __obj.updateDynamic("Pinned")(__v.asInstanceOf[js.Any]))
      Timeout.foreach(__v => __obj.updateDynamic("Timeout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FunctionConfiguration]
    }
  }

  /** The environment configuration of the function.
    */
  @js.native
  trait FunctionConfigurationEnvironment extends js.Object {
    var AccessSysfs: js.UndefOr[__boolean]
    var Execution: js.UndefOr[FunctionExecutionConfig]
    var ResourceAccessPolicies: js.UndefOr[__listOfResourceAccessPolicy]
    var Variables: js.UndefOr[__mapOf__string]
  }

  object FunctionConfigurationEnvironment {
    @inline
    def apply(
        AccessSysfs: js.UndefOr[__boolean] = js.undefined,
        Execution: js.UndefOr[FunctionExecutionConfig] = js.undefined,
        ResourceAccessPolicies: js.UndefOr[__listOfResourceAccessPolicy] = js.undefined,
        Variables: js.UndefOr[__mapOf__string] = js.undefined
    ): FunctionConfigurationEnvironment = {
      val __obj = js.Dynamic.literal()
      AccessSysfs.foreach(__v => __obj.updateDynamic("AccessSysfs")(__v.asInstanceOf[js.Any]))
      Execution.foreach(__v => __obj.updateDynamic("Execution")(__v.asInstanceOf[js.Any]))
      ResourceAccessPolicies.foreach(__v => __obj.updateDynamic("ResourceAccessPolicies")(__v.asInstanceOf[js.Any]))
      Variables.foreach(__v => __obj.updateDynamic("Variables")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FunctionConfigurationEnvironment]
    }
  }

  /** The default configuration that applies to all Lambda functions in the group. Individual Lambda functions can override these settings.
    */
  @js.native
  trait FunctionDefaultConfig extends js.Object {
    var Execution: js.UndefOr[FunctionDefaultExecutionConfig]
  }

  object FunctionDefaultConfig {
    @inline
    def apply(
        Execution: js.UndefOr[FunctionDefaultExecutionConfig] = js.undefined
    ): FunctionDefaultConfig = {
      val __obj = js.Dynamic.literal()
      Execution.foreach(__v => __obj.updateDynamic("Execution")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FunctionDefaultConfig]
    }
  }

  /** Configuration information that specifies how a Lambda function runs.
    */
  @js.native
  trait FunctionDefaultExecutionConfig extends js.Object {
    var IsolationMode: js.UndefOr[FunctionIsolationMode]
    var RunAs: js.UndefOr[FunctionRunAsConfig]
  }

  object FunctionDefaultExecutionConfig {
    @inline
    def apply(
        IsolationMode: js.UndefOr[FunctionIsolationMode] = js.undefined,
        RunAs: js.UndefOr[FunctionRunAsConfig] = js.undefined
    ): FunctionDefaultExecutionConfig = {
      val __obj = js.Dynamic.literal()
      IsolationMode.foreach(__v => __obj.updateDynamic("IsolationMode")(__v.asInstanceOf[js.Any]))
      RunAs.foreach(__v => __obj.updateDynamic("RunAs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FunctionDefaultExecutionConfig]
    }
  }

  /** Information about a function definition version.
    */
  @js.native
  trait FunctionDefinitionVersion extends js.Object {
    var DefaultConfig: js.UndefOr[FunctionDefaultConfig]
    var Functions: js.UndefOr[__listOfFunction]
  }

  object FunctionDefinitionVersion {
    @inline
    def apply(
        DefaultConfig: js.UndefOr[FunctionDefaultConfig] = js.undefined,
        Functions: js.UndefOr[__listOfFunction] = js.undefined
    ): FunctionDefinitionVersion = {
      val __obj = js.Dynamic.literal()
      DefaultConfig.foreach(__v => __obj.updateDynamic("DefaultConfig")(__v.asInstanceOf[js.Any]))
      Functions.foreach(__v => __obj.updateDynamic("Functions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FunctionDefinitionVersion]
    }
  }

  /** Configuration information that specifies how a Lambda function runs.
    */
  @js.native
  trait FunctionExecutionConfig extends js.Object {
    var IsolationMode: js.UndefOr[FunctionIsolationMode]
    var RunAs: js.UndefOr[FunctionRunAsConfig]
  }

  object FunctionExecutionConfig {
    @inline
    def apply(
        IsolationMode: js.UndefOr[FunctionIsolationMode] = js.undefined,
        RunAs: js.UndefOr[FunctionRunAsConfig] = js.undefined
    ): FunctionExecutionConfig = {
      val __obj = js.Dynamic.literal()
      IsolationMode.foreach(__v => __obj.updateDynamic("IsolationMode")(__v.asInstanceOf[js.Any]))
      RunAs.foreach(__v => __obj.updateDynamic("RunAs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FunctionExecutionConfig]
    }
  }

  /** Specifies whether the Lambda function runs in a Greengrass container (default) or without containerization. Unless your scenario requires that you run without containerization, we recommend that you run in a Greengrass container. Omit this value to run the Lambda function with the default containerization for the group.
    */
  @js.native
  sealed trait FunctionIsolationMode extends js.Any
  object FunctionIsolationMode {
    val GreengrassContainer = "GreengrassContainer".asInstanceOf[FunctionIsolationMode]
    val NoContainer = "NoContainer".asInstanceOf[FunctionIsolationMode]

    @inline def values = js.Array(GreengrassContainer, NoContainer)
  }

  /** Specifies the user and group whose permissions are used when running the Lambda function. You can specify one or both values to override the default values. We recommend that you avoid running as root unless absolutely necessary to minimize the risk of unintended changes or malicious attacks. To run as root, you must set ''IsolationMode'' to ''NoContainer'' and update config.json in ''greengrass-root/config'' to set ''allowFunctionsToRunAsRoot'' to ''yes''.
    */
  @js.native
  trait FunctionRunAsConfig extends js.Object {
    var Gid: js.UndefOr[__integer]
    var Uid: js.UndefOr[__integer]
  }

  object FunctionRunAsConfig {
    @inline
    def apply(
        Gid: js.UndefOr[__integer] = js.undefined,
        Uid: js.UndefOr[__integer] = js.undefined
    ): FunctionRunAsConfig = {
      val __obj = js.Dynamic.literal()
      Gid.foreach(__v => __obj.updateDynamic("Gid")(__v.asInstanceOf[js.Any]))
      Uid.foreach(__v => __obj.updateDynamic("Uid")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FunctionRunAsConfig]
    }
  }

  @js.native
  trait GetAssociatedRoleRequest extends js.Object {
    var GroupId: __string
  }

  object GetAssociatedRoleRequest {
    @inline
    def apply(
        GroupId: __string
    ): GetAssociatedRoleRequest = {
      val __obj = js.Dynamic.literal(
        "GroupId" -> GroupId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAssociatedRoleRequest]
    }
  }

  @js.native
  trait GetAssociatedRoleResponse extends js.Object {
    var AssociatedAt: js.UndefOr[__string]
    var RoleArn: js.UndefOr[__string]
  }

  object GetAssociatedRoleResponse {
    @inline
    def apply(
        AssociatedAt: js.UndefOr[__string] = js.undefined,
        RoleArn: js.UndefOr[__string] = js.undefined
    ): GetAssociatedRoleResponse = {
      val __obj = js.Dynamic.literal()
      AssociatedAt.foreach(__v => __obj.updateDynamic("AssociatedAt")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAssociatedRoleResponse]
    }
  }

  @js.native
  trait GetBulkDeploymentStatusRequest extends js.Object {
    var BulkDeploymentId: __string
  }

  object GetBulkDeploymentStatusRequest {
    @inline
    def apply(
        BulkDeploymentId: __string
    ): GetBulkDeploymentStatusRequest = {
      val __obj = js.Dynamic.literal(
        "BulkDeploymentId" -> BulkDeploymentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetBulkDeploymentStatusRequest]
    }
  }

  @js.native
  trait GetBulkDeploymentStatusResponse extends js.Object {
    var BulkDeploymentMetrics: js.UndefOr[BulkDeploymentMetrics]
    var BulkDeploymentStatus: js.UndefOr[BulkDeploymentStatus]
    var CreatedAt: js.UndefOr[__string]
    var ErrorDetails: js.UndefOr[ErrorDetails]
    var ErrorMessage: js.UndefOr[__string]
    var tags: js.UndefOr[Tags]
  }

  object GetBulkDeploymentStatusResponse {
    @inline
    def apply(
        BulkDeploymentMetrics: js.UndefOr[BulkDeploymentMetrics] = js.undefined,
        BulkDeploymentStatus: js.UndefOr[BulkDeploymentStatus] = js.undefined,
        CreatedAt: js.UndefOr[__string] = js.undefined,
        ErrorDetails: js.UndefOr[ErrorDetails] = js.undefined,
        ErrorMessage: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): GetBulkDeploymentStatusResponse = {
      val __obj = js.Dynamic.literal()
      BulkDeploymentMetrics.foreach(__v => __obj.updateDynamic("BulkDeploymentMetrics")(__v.asInstanceOf[js.Any]))
      BulkDeploymentStatus.foreach(__v => __obj.updateDynamic("BulkDeploymentStatus")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      ErrorDetails.foreach(__v => __obj.updateDynamic("ErrorDetails")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBulkDeploymentStatusResponse]
    }
  }

  @js.native
  trait GetConnectivityInfoRequest extends js.Object {
    var ThingName: __string
  }

  object GetConnectivityInfoRequest {
    @inline
    def apply(
        ThingName: __string
    ): GetConnectivityInfoRequest = {
      val __obj = js.Dynamic.literal(
        "ThingName" -> ThingName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetConnectivityInfoRequest]
    }
  }

  @js.native
  trait GetConnectivityInfoResponse extends js.Object {
    var ConnectivityInfo: js.UndefOr[__listOfConnectivityInfo]
    var Message: js.UndefOr[__string]
  }

  object GetConnectivityInfoResponse {
    @inline
    def apply(
        ConnectivityInfo: js.UndefOr[__listOfConnectivityInfo] = js.undefined,
        Message: js.UndefOr[__string] = js.undefined
    ): GetConnectivityInfoResponse = {
      val __obj = js.Dynamic.literal()
      ConnectivityInfo.foreach(__v => __obj.updateDynamic("ConnectivityInfo")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConnectivityInfoResponse]
    }
  }

  @js.native
  trait GetConnectorDefinitionRequest extends js.Object {
    var ConnectorDefinitionId: __string
  }

  object GetConnectorDefinitionRequest {
    @inline
    def apply(
        ConnectorDefinitionId: __string
    ): GetConnectorDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectorDefinitionId" -> ConnectorDefinitionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetConnectorDefinitionRequest]
    }
  }

  @js.native
  trait GetConnectorDefinitionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var LastUpdatedTimestamp: js.UndefOr[__string]
    var LatestVersion: js.UndefOr[__string]
    var LatestVersionArn: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
    var tags: js.UndefOr[Tags]
  }

  object GetConnectorDefinitionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTimestamp: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
        LatestVersion: js.UndefOr[__string] = js.undefined,
        LatestVersionArn: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): GetConnectorDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      LatestVersion.foreach(__v => __obj.updateDynamic("LatestVersion")(__v.asInstanceOf[js.Any]))
      LatestVersionArn.foreach(__v => __obj.updateDynamic("LatestVersionArn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConnectorDefinitionResponse]
    }
  }

  @js.native
  trait GetConnectorDefinitionVersionRequest extends js.Object {
    var ConnectorDefinitionId: __string
    var ConnectorDefinitionVersionId: __string
    var NextToken: js.UndefOr[__string]
  }

  object GetConnectorDefinitionVersionRequest {
    @inline
    def apply(
        ConnectorDefinitionId: __string,
        ConnectorDefinitionVersionId: __string,
        NextToken: js.UndefOr[__string] = js.undefined
    ): GetConnectorDefinitionVersionRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectorDefinitionId" -> ConnectorDefinitionId.asInstanceOf[js.Any],
        "ConnectorDefinitionVersionId" -> ConnectorDefinitionVersionId.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConnectorDefinitionVersionRequest]
    }
  }

  @js.native
  trait GetConnectorDefinitionVersionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Definition: js.UndefOr[ConnectorDefinitionVersion]
    var Id: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  object GetConnectorDefinitionVersionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTimestamp: js.UndefOr[__string] = js.undefined,
        Definition: js.UndefOr[ConnectorDefinitionVersion] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__string] = js.undefined
    ): GetConnectorDefinitionVersionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Definition.foreach(__v => __obj.updateDynamic("Definition")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConnectorDefinitionVersionResponse]
    }
  }

  @js.native
  trait GetCoreDefinitionRequest extends js.Object {
    var CoreDefinitionId: __string
  }

  object GetCoreDefinitionRequest {
    @inline
    def apply(
        CoreDefinitionId: __string
    ): GetCoreDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "CoreDefinitionId" -> CoreDefinitionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetCoreDefinitionRequest]
    }
  }

  @js.native
  trait GetCoreDefinitionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var LastUpdatedTimestamp: js.UndefOr[__string]
    var LatestVersion: js.UndefOr[__string]
    var LatestVersionArn: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
    var tags: js.UndefOr[Tags]
  }

  object GetCoreDefinitionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTimestamp: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
        LatestVersion: js.UndefOr[__string] = js.undefined,
        LatestVersionArn: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): GetCoreDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      LatestVersion.foreach(__v => __obj.updateDynamic("LatestVersion")(__v.asInstanceOf[js.Any]))
      LatestVersionArn.foreach(__v => __obj.updateDynamic("LatestVersionArn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCoreDefinitionResponse]
    }
  }

  @js.native
  trait GetCoreDefinitionVersionRequest extends js.Object {
    var CoreDefinitionId: __string
    var CoreDefinitionVersionId: __string
  }

  object GetCoreDefinitionVersionRequest {
    @inline
    def apply(
        CoreDefinitionId: __string,
        CoreDefinitionVersionId: __string
    ): GetCoreDefinitionVersionRequest = {
      val __obj = js.Dynamic.literal(
        "CoreDefinitionId" -> CoreDefinitionId.asInstanceOf[js.Any],
        "CoreDefinitionVersionId" -> CoreDefinitionVersionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetCoreDefinitionVersionRequest]
    }
  }

  @js.native
  trait GetCoreDefinitionVersionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Definition: js.UndefOr[CoreDefinitionVersion]
    var Id: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  object GetCoreDefinitionVersionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTimestamp: js.UndefOr[__string] = js.undefined,
        Definition: js.UndefOr[CoreDefinitionVersion] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__string] = js.undefined
    ): GetCoreDefinitionVersionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Definition.foreach(__v => __obj.updateDynamic("Definition")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCoreDefinitionVersionResponse]
    }
  }

  @js.native
  trait GetDeploymentStatusRequest extends js.Object {
    var DeploymentId: __string
    var GroupId: __string
  }

  object GetDeploymentStatusRequest {
    @inline
    def apply(
        DeploymentId: __string,
        GroupId: __string
    ): GetDeploymentStatusRequest = {
      val __obj = js.Dynamic.literal(
        "DeploymentId" -> DeploymentId.asInstanceOf[js.Any],
        "GroupId" -> GroupId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDeploymentStatusRequest]
    }
  }

  @js.native
  trait GetDeploymentStatusResponse extends js.Object {
    var DeploymentStatus: js.UndefOr[__string]
    var DeploymentType: js.UndefOr[DeploymentType]
    var ErrorDetails: js.UndefOr[ErrorDetails]
    var ErrorMessage: js.UndefOr[__string]
    var UpdatedAt: js.UndefOr[__string]
  }

  object GetDeploymentStatusResponse {
    @inline
    def apply(
        DeploymentStatus: js.UndefOr[__string] = js.undefined,
        DeploymentType: js.UndefOr[DeploymentType] = js.undefined,
        ErrorDetails: js.UndefOr[ErrorDetails] = js.undefined,
        ErrorMessage: js.UndefOr[__string] = js.undefined,
        UpdatedAt: js.UndefOr[__string] = js.undefined
    ): GetDeploymentStatusResponse = {
      val __obj = js.Dynamic.literal()
      DeploymentStatus.foreach(__v => __obj.updateDynamic("DeploymentStatus")(__v.asInstanceOf[js.Any]))
      DeploymentType.foreach(__v => __obj.updateDynamic("DeploymentType")(__v.asInstanceOf[js.Any]))
      ErrorDetails.foreach(__v => __obj.updateDynamic("ErrorDetails")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      UpdatedAt.foreach(__v => __obj.updateDynamic("UpdatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeploymentStatusResponse]
    }
  }

  @js.native
  trait GetDeviceDefinitionRequest extends js.Object {
    var DeviceDefinitionId: __string
  }

  object GetDeviceDefinitionRequest {
    @inline
    def apply(
        DeviceDefinitionId: __string
    ): GetDeviceDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceDefinitionId" -> DeviceDefinitionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDeviceDefinitionRequest]
    }
  }

  @js.native
  trait GetDeviceDefinitionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var LastUpdatedTimestamp: js.UndefOr[__string]
    var LatestVersion: js.UndefOr[__string]
    var LatestVersionArn: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
    var tags: js.UndefOr[Tags]
  }

  object GetDeviceDefinitionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTimestamp: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
        LatestVersion: js.UndefOr[__string] = js.undefined,
        LatestVersionArn: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): GetDeviceDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      LatestVersion.foreach(__v => __obj.updateDynamic("LatestVersion")(__v.asInstanceOf[js.Any]))
      LatestVersionArn.foreach(__v => __obj.updateDynamic("LatestVersionArn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeviceDefinitionResponse]
    }
  }

  @js.native
  trait GetDeviceDefinitionVersionRequest extends js.Object {
    var DeviceDefinitionId: __string
    var DeviceDefinitionVersionId: __string
    var NextToken: js.UndefOr[__string]
  }

  object GetDeviceDefinitionVersionRequest {
    @inline
    def apply(
        DeviceDefinitionId: __string,
        DeviceDefinitionVersionId: __string,
        NextToken: js.UndefOr[__string] = js.undefined
    ): GetDeviceDefinitionVersionRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceDefinitionId" -> DeviceDefinitionId.asInstanceOf[js.Any],
        "DeviceDefinitionVersionId" -> DeviceDefinitionVersionId.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeviceDefinitionVersionRequest]
    }
  }

  @js.native
  trait GetDeviceDefinitionVersionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Definition: js.UndefOr[DeviceDefinitionVersion]
    var Id: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  object GetDeviceDefinitionVersionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTimestamp: js.UndefOr[__string] = js.undefined,
        Definition: js.UndefOr[DeviceDefinitionVersion] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__string] = js.undefined
    ): GetDeviceDefinitionVersionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Definition.foreach(__v => __obj.updateDynamic("Definition")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeviceDefinitionVersionResponse]
    }
  }

  @js.native
  trait GetFunctionDefinitionRequest extends js.Object {
    var FunctionDefinitionId: __string
  }

  object GetFunctionDefinitionRequest {
    @inline
    def apply(
        FunctionDefinitionId: __string
    ): GetFunctionDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionDefinitionId" -> FunctionDefinitionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetFunctionDefinitionRequest]
    }
  }

  @js.native
  trait GetFunctionDefinitionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var LastUpdatedTimestamp: js.UndefOr[__string]
    var LatestVersion: js.UndefOr[__string]
    var LatestVersionArn: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
    var tags: js.UndefOr[Tags]
  }

  object GetFunctionDefinitionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTimestamp: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
        LatestVersion: js.UndefOr[__string] = js.undefined,
        LatestVersionArn: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): GetFunctionDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      LatestVersion.foreach(__v => __obj.updateDynamic("LatestVersion")(__v.asInstanceOf[js.Any]))
      LatestVersionArn.foreach(__v => __obj.updateDynamic("LatestVersionArn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFunctionDefinitionResponse]
    }
  }

  @js.native
  trait GetFunctionDefinitionVersionRequest extends js.Object {
    var FunctionDefinitionId: __string
    var FunctionDefinitionVersionId: __string
    var NextToken: js.UndefOr[__string]
  }

  object GetFunctionDefinitionVersionRequest {
    @inline
    def apply(
        FunctionDefinitionId: __string,
        FunctionDefinitionVersionId: __string,
        NextToken: js.UndefOr[__string] = js.undefined
    ): GetFunctionDefinitionVersionRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionDefinitionId" -> FunctionDefinitionId.asInstanceOf[js.Any],
        "FunctionDefinitionVersionId" -> FunctionDefinitionVersionId.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFunctionDefinitionVersionRequest]
    }
  }

  @js.native
  trait GetFunctionDefinitionVersionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Definition: js.UndefOr[FunctionDefinitionVersion]
    var Id: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  object GetFunctionDefinitionVersionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTimestamp: js.UndefOr[__string] = js.undefined,
        Definition: js.UndefOr[FunctionDefinitionVersion] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__string] = js.undefined
    ): GetFunctionDefinitionVersionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Definition.foreach(__v => __obj.updateDynamic("Definition")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFunctionDefinitionVersionResponse]
    }
  }

  @js.native
  trait GetGroupCertificateAuthorityRequest extends js.Object {
    var CertificateAuthorityId: __string
    var GroupId: __string
  }

  object GetGroupCertificateAuthorityRequest {
    @inline
    def apply(
        CertificateAuthorityId: __string,
        GroupId: __string
    ): GetGroupCertificateAuthorityRequest = {
      val __obj = js.Dynamic.literal(
        "CertificateAuthorityId" -> CertificateAuthorityId.asInstanceOf[js.Any],
        "GroupId" -> GroupId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetGroupCertificateAuthorityRequest]
    }
  }

  @js.native
  trait GetGroupCertificateAuthorityResponse extends js.Object {
    var GroupCertificateAuthorityArn: js.UndefOr[__string]
    var GroupCertificateAuthorityId: js.UndefOr[__string]
    var PemEncodedCertificate: js.UndefOr[__string]
  }

  object GetGroupCertificateAuthorityResponse {
    @inline
    def apply(
        GroupCertificateAuthorityArn: js.UndefOr[__string] = js.undefined,
        GroupCertificateAuthorityId: js.UndefOr[__string] = js.undefined,
        PemEncodedCertificate: js.UndefOr[__string] = js.undefined
    ): GetGroupCertificateAuthorityResponse = {
      val __obj = js.Dynamic.literal()
      GroupCertificateAuthorityArn.foreach(__v => __obj.updateDynamic("GroupCertificateAuthorityArn")(__v.asInstanceOf[js.Any]))
      GroupCertificateAuthorityId.foreach(__v => __obj.updateDynamic("GroupCertificateAuthorityId")(__v.asInstanceOf[js.Any]))
      PemEncodedCertificate.foreach(__v => __obj.updateDynamic("PemEncodedCertificate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGroupCertificateAuthorityResponse]
    }
  }

  @js.native
  trait GetGroupCertificateConfigurationRequest extends js.Object {
    var GroupId: __string
  }

  object GetGroupCertificateConfigurationRequest {
    @inline
    def apply(
        GroupId: __string
    ): GetGroupCertificateConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "GroupId" -> GroupId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetGroupCertificateConfigurationRequest]
    }
  }

  @js.native
  trait GetGroupCertificateConfigurationResponse extends js.Object {
    var CertificateAuthorityExpiryInMilliseconds: js.UndefOr[__string]
    var CertificateExpiryInMilliseconds: js.UndefOr[__string]
    var GroupId: js.UndefOr[__string]
  }

  object GetGroupCertificateConfigurationResponse {
    @inline
    def apply(
        CertificateAuthorityExpiryInMilliseconds: js.UndefOr[__string] = js.undefined,
        CertificateExpiryInMilliseconds: js.UndefOr[__string] = js.undefined,
        GroupId: js.UndefOr[__string] = js.undefined
    ): GetGroupCertificateConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      CertificateAuthorityExpiryInMilliseconds.foreach(__v => __obj.updateDynamic("CertificateAuthorityExpiryInMilliseconds")(__v.asInstanceOf[js.Any]))
      CertificateExpiryInMilliseconds.foreach(__v => __obj.updateDynamic("CertificateExpiryInMilliseconds")(__v.asInstanceOf[js.Any]))
      GroupId.foreach(__v => __obj.updateDynamic("GroupId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGroupCertificateConfigurationResponse]
    }
  }

  @js.native
  trait GetGroupRequest extends js.Object {
    var GroupId: __string
  }

  object GetGroupRequest {
    @inline
    def apply(
        GroupId: __string
    ): GetGroupRequest = {
      val __obj = js.Dynamic.literal(
        "GroupId" -> GroupId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetGroupRequest]
    }
  }

  @js.native
  trait GetGroupResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var LastUpdatedTimestamp: js.UndefOr[__string]
    var LatestVersion: js.UndefOr[__string]
    var LatestVersionArn: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
    var tags: js.UndefOr[Tags]
  }

  object GetGroupResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTimestamp: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
        LatestVersion: js.UndefOr[__string] = js.undefined,
        LatestVersionArn: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): GetGroupResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      LatestVersion.foreach(__v => __obj.updateDynamic("LatestVersion")(__v.asInstanceOf[js.Any]))
      LatestVersionArn.foreach(__v => __obj.updateDynamic("LatestVersionArn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGroupResponse]
    }
  }

  @js.native
  trait GetGroupVersionRequest extends js.Object {
    var GroupId: __string
    var GroupVersionId: __string
  }

  object GetGroupVersionRequest {
    @inline
    def apply(
        GroupId: __string,
        GroupVersionId: __string
    ): GetGroupVersionRequest = {
      val __obj = js.Dynamic.literal(
        "GroupId" -> GroupId.asInstanceOf[js.Any],
        "GroupVersionId" -> GroupVersionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetGroupVersionRequest]
    }
  }

  @js.native
  trait GetGroupVersionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Definition: js.UndefOr[GroupVersion]
    var Id: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  object GetGroupVersionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTimestamp: js.UndefOr[__string] = js.undefined,
        Definition: js.UndefOr[GroupVersion] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__string] = js.undefined
    ): GetGroupVersionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Definition.foreach(__v => __obj.updateDynamic("Definition")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGroupVersionResponse]
    }
  }

  @js.native
  trait GetLoggerDefinitionRequest extends js.Object {
    var LoggerDefinitionId: __string
  }

  object GetLoggerDefinitionRequest {
    @inline
    def apply(
        LoggerDefinitionId: __string
    ): GetLoggerDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "LoggerDefinitionId" -> LoggerDefinitionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetLoggerDefinitionRequest]
    }
  }

  @js.native
  trait GetLoggerDefinitionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var LastUpdatedTimestamp: js.UndefOr[__string]
    var LatestVersion: js.UndefOr[__string]
    var LatestVersionArn: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
    var tags: js.UndefOr[Tags]
  }

  object GetLoggerDefinitionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTimestamp: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
        LatestVersion: js.UndefOr[__string] = js.undefined,
        LatestVersionArn: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): GetLoggerDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      LatestVersion.foreach(__v => __obj.updateDynamic("LatestVersion")(__v.asInstanceOf[js.Any]))
      LatestVersionArn.foreach(__v => __obj.updateDynamic("LatestVersionArn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLoggerDefinitionResponse]
    }
  }

  @js.native
  trait GetLoggerDefinitionVersionRequest extends js.Object {
    var LoggerDefinitionId: __string
    var LoggerDefinitionVersionId: __string
    var NextToken: js.UndefOr[__string]
  }

  object GetLoggerDefinitionVersionRequest {
    @inline
    def apply(
        LoggerDefinitionId: __string,
        LoggerDefinitionVersionId: __string,
        NextToken: js.UndefOr[__string] = js.undefined
    ): GetLoggerDefinitionVersionRequest = {
      val __obj = js.Dynamic.literal(
        "LoggerDefinitionId" -> LoggerDefinitionId.asInstanceOf[js.Any],
        "LoggerDefinitionVersionId" -> LoggerDefinitionVersionId.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLoggerDefinitionVersionRequest]
    }
  }

  @js.native
  trait GetLoggerDefinitionVersionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Definition: js.UndefOr[LoggerDefinitionVersion]
    var Id: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  object GetLoggerDefinitionVersionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTimestamp: js.UndefOr[__string] = js.undefined,
        Definition: js.UndefOr[LoggerDefinitionVersion] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__string] = js.undefined
    ): GetLoggerDefinitionVersionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Definition.foreach(__v => __obj.updateDynamic("Definition")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLoggerDefinitionVersionResponse]
    }
  }

  @js.native
  trait GetResourceDefinitionRequest extends js.Object {
    var ResourceDefinitionId: __string
  }

  object GetResourceDefinitionRequest {
    @inline
    def apply(
        ResourceDefinitionId: __string
    ): GetResourceDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceDefinitionId" -> ResourceDefinitionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetResourceDefinitionRequest]
    }
  }

  @js.native
  trait GetResourceDefinitionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var LastUpdatedTimestamp: js.UndefOr[__string]
    var LatestVersion: js.UndefOr[__string]
    var LatestVersionArn: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
    var tags: js.UndefOr[Tags]
  }

  object GetResourceDefinitionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTimestamp: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
        LatestVersion: js.UndefOr[__string] = js.undefined,
        LatestVersionArn: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): GetResourceDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      LatestVersion.foreach(__v => __obj.updateDynamic("LatestVersion")(__v.asInstanceOf[js.Any]))
      LatestVersionArn.foreach(__v => __obj.updateDynamic("LatestVersionArn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourceDefinitionResponse]
    }
  }

  @js.native
  trait GetResourceDefinitionVersionRequest extends js.Object {
    var ResourceDefinitionId: __string
    var ResourceDefinitionVersionId: __string
  }

  object GetResourceDefinitionVersionRequest {
    @inline
    def apply(
        ResourceDefinitionId: __string,
        ResourceDefinitionVersionId: __string
    ): GetResourceDefinitionVersionRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceDefinitionId" -> ResourceDefinitionId.asInstanceOf[js.Any],
        "ResourceDefinitionVersionId" -> ResourceDefinitionVersionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetResourceDefinitionVersionRequest]
    }
  }

  @js.native
  trait GetResourceDefinitionVersionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Definition: js.UndefOr[ResourceDefinitionVersion]
    var Id: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  object GetResourceDefinitionVersionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTimestamp: js.UndefOr[__string] = js.undefined,
        Definition: js.UndefOr[ResourceDefinitionVersion] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__string] = js.undefined
    ): GetResourceDefinitionVersionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Definition.foreach(__v => __obj.updateDynamic("Definition")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourceDefinitionVersionResponse]
    }
  }

  @js.native
  trait GetServiceRoleForAccountRequest extends js.Object {}

  object GetServiceRoleForAccountRequest {
    @inline
    def apply(
    ): GetServiceRoleForAccountRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetServiceRoleForAccountRequest]
    }
  }

  @js.native
  trait GetServiceRoleForAccountResponse extends js.Object {
    var AssociatedAt: js.UndefOr[__string]
    var RoleArn: js.UndefOr[__string]
  }

  object GetServiceRoleForAccountResponse {
    @inline
    def apply(
        AssociatedAt: js.UndefOr[__string] = js.undefined,
        RoleArn: js.UndefOr[__string] = js.undefined
    ): GetServiceRoleForAccountResponse = {
      val __obj = js.Dynamic.literal()
      AssociatedAt.foreach(__v => __obj.updateDynamic("AssociatedAt")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetServiceRoleForAccountResponse]
    }
  }

  @js.native
  trait GetSubscriptionDefinitionRequest extends js.Object {
    var SubscriptionDefinitionId: __string
  }

  object GetSubscriptionDefinitionRequest {
    @inline
    def apply(
        SubscriptionDefinitionId: __string
    ): GetSubscriptionDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "SubscriptionDefinitionId" -> SubscriptionDefinitionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSubscriptionDefinitionRequest]
    }
  }

  @js.native
  trait GetSubscriptionDefinitionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var LastUpdatedTimestamp: js.UndefOr[__string]
    var LatestVersion: js.UndefOr[__string]
    var LatestVersionArn: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
    var tags: js.UndefOr[Tags]
  }

  object GetSubscriptionDefinitionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTimestamp: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
        LatestVersion: js.UndefOr[__string] = js.undefined,
        LatestVersionArn: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): GetSubscriptionDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      LatestVersion.foreach(__v => __obj.updateDynamic("LatestVersion")(__v.asInstanceOf[js.Any]))
      LatestVersionArn.foreach(__v => __obj.updateDynamic("LatestVersionArn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSubscriptionDefinitionResponse]
    }
  }

  @js.native
  trait GetSubscriptionDefinitionVersionRequest extends js.Object {
    var SubscriptionDefinitionId: __string
    var SubscriptionDefinitionVersionId: __string
    var NextToken: js.UndefOr[__string]
  }

  object GetSubscriptionDefinitionVersionRequest {
    @inline
    def apply(
        SubscriptionDefinitionId: __string,
        SubscriptionDefinitionVersionId: __string,
        NextToken: js.UndefOr[__string] = js.undefined
    ): GetSubscriptionDefinitionVersionRequest = {
      val __obj = js.Dynamic.literal(
        "SubscriptionDefinitionId" -> SubscriptionDefinitionId.asInstanceOf[js.Any],
        "SubscriptionDefinitionVersionId" -> SubscriptionDefinitionVersionId.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSubscriptionDefinitionVersionRequest]
    }
  }

  @js.native
  trait GetSubscriptionDefinitionVersionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Definition: js.UndefOr[SubscriptionDefinitionVersion]
    var Id: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  object GetSubscriptionDefinitionVersionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTimestamp: js.UndefOr[__string] = js.undefined,
        Definition: js.UndefOr[SubscriptionDefinitionVersion] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__string] = js.undefined
    ): GetSubscriptionDefinitionVersionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Definition.foreach(__v => __obj.updateDynamic("Definition")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSubscriptionDefinitionVersionResponse]
    }
  }

  /** Information about a certificate authority for a group.
    */
  @js.native
  trait GroupCertificateAuthorityProperties extends js.Object {
    var GroupCertificateAuthorityArn: js.UndefOr[__string]
    var GroupCertificateAuthorityId: js.UndefOr[__string]
  }

  object GroupCertificateAuthorityProperties {
    @inline
    def apply(
        GroupCertificateAuthorityArn: js.UndefOr[__string] = js.undefined,
        GroupCertificateAuthorityId: js.UndefOr[__string] = js.undefined
    ): GroupCertificateAuthorityProperties = {
      val __obj = js.Dynamic.literal()
      GroupCertificateAuthorityArn.foreach(__v => __obj.updateDynamic("GroupCertificateAuthorityArn")(__v.asInstanceOf[js.Any]))
      GroupCertificateAuthorityId.foreach(__v => __obj.updateDynamic("GroupCertificateAuthorityId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GroupCertificateAuthorityProperties]
    }
  }

  /** Information about a group.
    */
  @js.native
  trait GroupInformation extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var LastUpdatedTimestamp: js.UndefOr[__string]
    var LatestVersion: js.UndefOr[__string]
    var LatestVersionArn: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
  }

  object GroupInformation {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTimestamp: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
        LatestVersion: js.UndefOr[__string] = js.undefined,
        LatestVersionArn: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined
    ): GroupInformation = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LastUpdatedTimestamp.foreach(__v => __obj.updateDynamic("LastUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      LatestVersion.foreach(__v => __obj.updateDynamic("LatestVersion")(__v.asInstanceOf[js.Any]))
      LatestVersionArn.foreach(__v => __obj.updateDynamic("LatestVersionArn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GroupInformation]
    }
  }

  /** Group owner related settings for local resources.
    */
  @js.native
  trait GroupOwnerSetting extends js.Object {
    var AutoAddGroupOwner: js.UndefOr[__boolean]
    var GroupOwner: js.UndefOr[__string]
  }

  object GroupOwnerSetting {
    @inline
    def apply(
        AutoAddGroupOwner: js.UndefOr[__boolean] = js.undefined,
        GroupOwner: js.UndefOr[__string] = js.undefined
    ): GroupOwnerSetting = {
      val __obj = js.Dynamic.literal()
      AutoAddGroupOwner.foreach(__v => __obj.updateDynamic("AutoAddGroupOwner")(__v.asInstanceOf[js.Any]))
      GroupOwner.foreach(__v => __obj.updateDynamic("GroupOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GroupOwnerSetting]
    }
  }

  /** Information about a group version.
    */
  @js.native
  trait GroupVersion extends js.Object {
    var ConnectorDefinitionVersionArn: js.UndefOr[__string]
    var CoreDefinitionVersionArn: js.UndefOr[__string]
    var DeviceDefinitionVersionArn: js.UndefOr[__string]
    var FunctionDefinitionVersionArn: js.UndefOr[__string]
    var LoggerDefinitionVersionArn: js.UndefOr[__string]
    var ResourceDefinitionVersionArn: js.UndefOr[__string]
    var SubscriptionDefinitionVersionArn: js.UndefOr[__string]
  }

  object GroupVersion {
    @inline
    def apply(
        ConnectorDefinitionVersionArn: js.UndefOr[__string] = js.undefined,
        CoreDefinitionVersionArn: js.UndefOr[__string] = js.undefined,
        DeviceDefinitionVersionArn: js.UndefOr[__string] = js.undefined,
        FunctionDefinitionVersionArn: js.UndefOr[__string] = js.undefined,
        LoggerDefinitionVersionArn: js.UndefOr[__string] = js.undefined,
        ResourceDefinitionVersionArn: js.UndefOr[__string] = js.undefined,
        SubscriptionDefinitionVersionArn: js.UndefOr[__string] = js.undefined
    ): GroupVersion = {
      val __obj = js.Dynamic.literal()
      ConnectorDefinitionVersionArn.foreach(__v => __obj.updateDynamic("ConnectorDefinitionVersionArn")(__v.asInstanceOf[js.Any]))
      CoreDefinitionVersionArn.foreach(__v => __obj.updateDynamic("CoreDefinitionVersionArn")(__v.asInstanceOf[js.Any]))
      DeviceDefinitionVersionArn.foreach(__v => __obj.updateDynamic("DeviceDefinitionVersionArn")(__v.asInstanceOf[js.Any]))
      FunctionDefinitionVersionArn.foreach(__v => __obj.updateDynamic("FunctionDefinitionVersionArn")(__v.asInstanceOf[js.Any]))
      LoggerDefinitionVersionArn.foreach(__v => __obj.updateDynamic("LoggerDefinitionVersionArn")(__v.asInstanceOf[js.Any]))
      ResourceDefinitionVersionArn.foreach(__v => __obj.updateDynamic("ResourceDefinitionVersionArn")(__v.asInstanceOf[js.Any]))
      SubscriptionDefinitionVersionArn.foreach(__v => __obj.updateDynamic("SubscriptionDefinitionVersionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GroupVersion]
    }
  }

  @js.native
  trait ListBulkDeploymentDetailedReportsRequest extends js.Object {
    var BulkDeploymentId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListBulkDeploymentDetailedReportsRequest {
    @inline
    def apply(
        BulkDeploymentId: __string,
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListBulkDeploymentDetailedReportsRequest = {
      val __obj = js.Dynamic.literal(
        "BulkDeploymentId" -> BulkDeploymentId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBulkDeploymentDetailedReportsRequest]
    }
  }

  @js.native
  trait ListBulkDeploymentDetailedReportsResponse extends js.Object {
    var Deployments: js.UndefOr[BulkDeploymentResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListBulkDeploymentDetailedReportsResponse {
    @inline
    def apply(
        Deployments: js.UndefOr[BulkDeploymentResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListBulkDeploymentDetailedReportsResponse = {
      val __obj = js.Dynamic.literal()
      Deployments.foreach(__v => __obj.updateDynamic("Deployments")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBulkDeploymentDetailedReportsResponse]
    }
  }

  @js.native
  trait ListBulkDeploymentsRequest extends js.Object {
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListBulkDeploymentsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListBulkDeploymentsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBulkDeploymentsRequest]
    }
  }

  @js.native
  trait ListBulkDeploymentsResponse extends js.Object {
    var BulkDeployments: js.UndefOr[BulkDeployments]
    var NextToken: js.UndefOr[__string]
  }

  object ListBulkDeploymentsResponse {
    @inline
    def apply(
        BulkDeployments: js.UndefOr[BulkDeployments] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListBulkDeploymentsResponse = {
      val __obj = js.Dynamic.literal()
      BulkDeployments.foreach(__v => __obj.updateDynamic("BulkDeployments")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBulkDeploymentsResponse]
    }
  }

  @js.native
  trait ListConnectorDefinitionVersionsRequest extends js.Object {
    var ConnectorDefinitionId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListConnectorDefinitionVersionsRequest {
    @inline
    def apply(
        ConnectorDefinitionId: __string,
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListConnectorDefinitionVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectorDefinitionId" -> ConnectorDefinitionId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConnectorDefinitionVersionsRequest]
    }
  }

  @js.native
  trait ListConnectorDefinitionVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Versions: js.UndefOr[__listOfVersionInformation]
  }

  object ListConnectorDefinitionVersionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        Versions: js.UndefOr[__listOfVersionInformation] = js.undefined
    ): ListConnectorDefinitionVersionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Versions.foreach(__v => __obj.updateDynamic("Versions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConnectorDefinitionVersionsResponse]
    }
  }

  @js.native
  trait ListConnectorDefinitionsRequest extends js.Object {
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListConnectorDefinitionsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListConnectorDefinitionsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConnectorDefinitionsRequest]
    }
  }

  @js.native
  trait ListConnectorDefinitionsResponse extends js.Object {
    var Definitions: js.UndefOr[__listOfDefinitionInformation]
    var NextToken: js.UndefOr[__string]
  }

  object ListConnectorDefinitionsResponse {
    @inline
    def apply(
        Definitions: js.UndefOr[__listOfDefinitionInformation] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListConnectorDefinitionsResponse = {
      val __obj = js.Dynamic.literal()
      Definitions.foreach(__v => __obj.updateDynamic("Definitions")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConnectorDefinitionsResponse]
    }
  }

  @js.native
  trait ListCoreDefinitionVersionsRequest extends js.Object {
    var CoreDefinitionId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListCoreDefinitionVersionsRequest {
    @inline
    def apply(
        CoreDefinitionId: __string,
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListCoreDefinitionVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "CoreDefinitionId" -> CoreDefinitionId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCoreDefinitionVersionsRequest]
    }
  }

  @js.native
  trait ListCoreDefinitionVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Versions: js.UndefOr[__listOfVersionInformation]
  }

  object ListCoreDefinitionVersionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        Versions: js.UndefOr[__listOfVersionInformation] = js.undefined
    ): ListCoreDefinitionVersionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Versions.foreach(__v => __obj.updateDynamic("Versions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCoreDefinitionVersionsResponse]
    }
  }

  @js.native
  trait ListCoreDefinitionsRequest extends js.Object {
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListCoreDefinitionsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListCoreDefinitionsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCoreDefinitionsRequest]
    }
  }

  @js.native
  trait ListCoreDefinitionsResponse extends js.Object {
    var Definitions: js.UndefOr[__listOfDefinitionInformation]
    var NextToken: js.UndefOr[__string]
  }

  object ListCoreDefinitionsResponse {
    @inline
    def apply(
        Definitions: js.UndefOr[__listOfDefinitionInformation] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListCoreDefinitionsResponse = {
      val __obj = js.Dynamic.literal()
      Definitions.foreach(__v => __obj.updateDynamic("Definitions")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCoreDefinitionsResponse]
    }
  }

  @js.native
  trait ListDeploymentsRequest extends js.Object {
    var GroupId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListDeploymentsRequest {
    @inline
    def apply(
        GroupId: __string,
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListDeploymentsRequest = {
      val __obj = js.Dynamic.literal(
        "GroupId" -> GroupId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeploymentsRequest]
    }
  }

  @js.native
  trait ListDeploymentsResponse extends js.Object {
    var Deployments: js.UndefOr[Deployments]
    var NextToken: js.UndefOr[__string]
  }

  object ListDeploymentsResponse {
    @inline
    def apply(
        Deployments: js.UndefOr[Deployments] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListDeploymentsResponse = {
      val __obj = js.Dynamic.literal()
      Deployments.foreach(__v => __obj.updateDynamic("Deployments")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeploymentsResponse]
    }
  }

  @js.native
  trait ListDeviceDefinitionVersionsRequest extends js.Object {
    var DeviceDefinitionId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListDeviceDefinitionVersionsRequest {
    @inline
    def apply(
        DeviceDefinitionId: __string,
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListDeviceDefinitionVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceDefinitionId" -> DeviceDefinitionId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeviceDefinitionVersionsRequest]
    }
  }

  @js.native
  trait ListDeviceDefinitionVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Versions: js.UndefOr[__listOfVersionInformation]
  }

  object ListDeviceDefinitionVersionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        Versions: js.UndefOr[__listOfVersionInformation] = js.undefined
    ): ListDeviceDefinitionVersionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Versions.foreach(__v => __obj.updateDynamic("Versions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeviceDefinitionVersionsResponse]
    }
  }

  @js.native
  trait ListDeviceDefinitionsRequest extends js.Object {
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListDeviceDefinitionsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListDeviceDefinitionsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeviceDefinitionsRequest]
    }
  }

  @js.native
  trait ListDeviceDefinitionsResponse extends js.Object {
    var Definitions: js.UndefOr[__listOfDefinitionInformation]
    var NextToken: js.UndefOr[__string]
  }

  object ListDeviceDefinitionsResponse {
    @inline
    def apply(
        Definitions: js.UndefOr[__listOfDefinitionInformation] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListDeviceDefinitionsResponse = {
      val __obj = js.Dynamic.literal()
      Definitions.foreach(__v => __obj.updateDynamic("Definitions")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeviceDefinitionsResponse]
    }
  }

  @js.native
  trait ListFunctionDefinitionVersionsRequest extends js.Object {
    var FunctionDefinitionId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListFunctionDefinitionVersionsRequest {
    @inline
    def apply(
        FunctionDefinitionId: __string,
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListFunctionDefinitionVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionDefinitionId" -> FunctionDefinitionId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFunctionDefinitionVersionsRequest]
    }
  }

  @js.native
  trait ListFunctionDefinitionVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Versions: js.UndefOr[__listOfVersionInformation]
  }

  object ListFunctionDefinitionVersionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        Versions: js.UndefOr[__listOfVersionInformation] = js.undefined
    ): ListFunctionDefinitionVersionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Versions.foreach(__v => __obj.updateDynamic("Versions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFunctionDefinitionVersionsResponse]
    }
  }

  @js.native
  trait ListFunctionDefinitionsRequest extends js.Object {
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListFunctionDefinitionsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListFunctionDefinitionsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFunctionDefinitionsRequest]
    }
  }

  @js.native
  trait ListFunctionDefinitionsResponse extends js.Object {
    var Definitions: js.UndefOr[__listOfDefinitionInformation]
    var NextToken: js.UndefOr[__string]
  }

  object ListFunctionDefinitionsResponse {
    @inline
    def apply(
        Definitions: js.UndefOr[__listOfDefinitionInformation] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListFunctionDefinitionsResponse = {
      val __obj = js.Dynamic.literal()
      Definitions.foreach(__v => __obj.updateDynamic("Definitions")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFunctionDefinitionsResponse]
    }
  }

  @js.native
  trait ListGroupCertificateAuthoritiesRequest extends js.Object {
    var GroupId: __string
  }

  object ListGroupCertificateAuthoritiesRequest {
    @inline
    def apply(
        GroupId: __string
    ): ListGroupCertificateAuthoritiesRequest = {
      val __obj = js.Dynamic.literal(
        "GroupId" -> GroupId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListGroupCertificateAuthoritiesRequest]
    }
  }

  @js.native
  trait ListGroupCertificateAuthoritiesResponse extends js.Object {
    var GroupCertificateAuthorities: js.UndefOr[__listOfGroupCertificateAuthorityProperties]
  }

  object ListGroupCertificateAuthoritiesResponse {
    @inline
    def apply(
        GroupCertificateAuthorities: js.UndefOr[__listOfGroupCertificateAuthorityProperties] = js.undefined
    ): ListGroupCertificateAuthoritiesResponse = {
      val __obj = js.Dynamic.literal()
      GroupCertificateAuthorities.foreach(__v => __obj.updateDynamic("GroupCertificateAuthorities")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupCertificateAuthoritiesResponse]
    }
  }

  @js.native
  trait ListGroupVersionsRequest extends js.Object {
    var GroupId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListGroupVersionsRequest {
    @inline
    def apply(
        GroupId: __string,
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListGroupVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "GroupId" -> GroupId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupVersionsRequest]
    }
  }

  @js.native
  trait ListGroupVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Versions: js.UndefOr[__listOfVersionInformation]
  }

  object ListGroupVersionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        Versions: js.UndefOr[__listOfVersionInformation] = js.undefined
    ): ListGroupVersionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Versions.foreach(__v => __obj.updateDynamic("Versions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupVersionsResponse]
    }
  }

  @js.native
  trait ListGroupsRequest extends js.Object {
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListGroupsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListGroupsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupsRequest]
    }
  }

  @js.native
  trait ListGroupsResponse extends js.Object {
    var Groups: js.UndefOr[__listOfGroupInformation]
    var NextToken: js.UndefOr[__string]
  }

  object ListGroupsResponse {
    @inline
    def apply(
        Groups: js.UndefOr[__listOfGroupInformation] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListGroupsResponse = {
      val __obj = js.Dynamic.literal()
      Groups.foreach(__v => __obj.updateDynamic("Groups")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupsResponse]
    }
  }

  @js.native
  trait ListLoggerDefinitionVersionsRequest extends js.Object {
    var LoggerDefinitionId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListLoggerDefinitionVersionsRequest {
    @inline
    def apply(
        LoggerDefinitionId: __string,
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListLoggerDefinitionVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "LoggerDefinitionId" -> LoggerDefinitionId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLoggerDefinitionVersionsRequest]
    }
  }

  @js.native
  trait ListLoggerDefinitionVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Versions: js.UndefOr[__listOfVersionInformation]
  }

  object ListLoggerDefinitionVersionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        Versions: js.UndefOr[__listOfVersionInformation] = js.undefined
    ): ListLoggerDefinitionVersionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Versions.foreach(__v => __obj.updateDynamic("Versions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLoggerDefinitionVersionsResponse]
    }
  }

  @js.native
  trait ListLoggerDefinitionsRequest extends js.Object {
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListLoggerDefinitionsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListLoggerDefinitionsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLoggerDefinitionsRequest]
    }
  }

  @js.native
  trait ListLoggerDefinitionsResponse extends js.Object {
    var Definitions: js.UndefOr[__listOfDefinitionInformation]
    var NextToken: js.UndefOr[__string]
  }

  object ListLoggerDefinitionsResponse {
    @inline
    def apply(
        Definitions: js.UndefOr[__listOfDefinitionInformation] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListLoggerDefinitionsResponse = {
      val __obj = js.Dynamic.literal()
      Definitions.foreach(__v => __obj.updateDynamic("Definitions")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLoggerDefinitionsResponse]
    }
  }

  @js.native
  trait ListResourceDefinitionVersionsRequest extends js.Object {
    var ResourceDefinitionId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListResourceDefinitionVersionsRequest {
    @inline
    def apply(
        ResourceDefinitionId: __string,
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListResourceDefinitionVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceDefinitionId" -> ResourceDefinitionId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourceDefinitionVersionsRequest]
    }
  }

  @js.native
  trait ListResourceDefinitionVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Versions: js.UndefOr[__listOfVersionInformation]
  }

  object ListResourceDefinitionVersionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        Versions: js.UndefOr[__listOfVersionInformation] = js.undefined
    ): ListResourceDefinitionVersionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Versions.foreach(__v => __obj.updateDynamic("Versions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourceDefinitionVersionsResponse]
    }
  }

  @js.native
  trait ListResourceDefinitionsRequest extends js.Object {
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListResourceDefinitionsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListResourceDefinitionsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourceDefinitionsRequest]
    }
  }

  @js.native
  trait ListResourceDefinitionsResponse extends js.Object {
    var Definitions: js.UndefOr[__listOfDefinitionInformation]
    var NextToken: js.UndefOr[__string]
  }

  object ListResourceDefinitionsResponse {
    @inline
    def apply(
        Definitions: js.UndefOr[__listOfDefinitionInformation] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListResourceDefinitionsResponse = {
      val __obj = js.Dynamic.literal()
      Definitions.foreach(__v => __obj.updateDynamic("Definitions")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResourceDefinitionsResponse]
    }
  }

  @js.native
  trait ListSubscriptionDefinitionVersionsRequest extends js.Object {
    var SubscriptionDefinitionId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListSubscriptionDefinitionVersionsRequest {
    @inline
    def apply(
        SubscriptionDefinitionId: __string,
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListSubscriptionDefinitionVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "SubscriptionDefinitionId" -> SubscriptionDefinitionId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSubscriptionDefinitionVersionsRequest]
    }
  }

  @js.native
  trait ListSubscriptionDefinitionVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Versions: js.UndefOr[__listOfVersionInformation]
  }

  object ListSubscriptionDefinitionVersionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        Versions: js.UndefOr[__listOfVersionInformation] = js.undefined
    ): ListSubscriptionDefinitionVersionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Versions.foreach(__v => __obj.updateDynamic("Versions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSubscriptionDefinitionVersionsResponse]
    }
  }

  @js.native
  trait ListSubscriptionDefinitionsRequest extends js.Object {
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListSubscriptionDefinitionsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListSubscriptionDefinitionsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSubscriptionDefinitionsRequest]
    }
  }

  @js.native
  trait ListSubscriptionDefinitionsResponse extends js.Object {
    var Definitions: js.UndefOr[__listOfDefinitionInformation]
    var NextToken: js.UndefOr[__string]
  }

  object ListSubscriptionDefinitionsResponse {
    @inline
    def apply(
        Definitions: js.UndefOr[__listOfDefinitionInformation] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListSubscriptionDefinitionsResponse = {
      val __obj = js.Dynamic.literal()
      Definitions.foreach(__v => __obj.updateDynamic("Definitions")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSubscriptionDefinitionsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: __string
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: __string
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[Tags]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[Tags] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** Attributes that define a local device resource.
    */
  @js.native
  trait LocalDeviceResourceData extends js.Object {
    var GroupOwnerSetting: js.UndefOr[GroupOwnerSetting]
    var SourcePath: js.UndefOr[__string]
  }

  object LocalDeviceResourceData {
    @inline
    def apply(
        GroupOwnerSetting: js.UndefOr[GroupOwnerSetting] = js.undefined,
        SourcePath: js.UndefOr[__string] = js.undefined
    ): LocalDeviceResourceData = {
      val __obj = js.Dynamic.literal()
      GroupOwnerSetting.foreach(__v => __obj.updateDynamic("GroupOwnerSetting")(__v.asInstanceOf[js.Any]))
      SourcePath.foreach(__v => __obj.updateDynamic("SourcePath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LocalDeviceResourceData]
    }
  }

  /** Attributes that define a local volume resource.
    */
  @js.native
  trait LocalVolumeResourceData extends js.Object {
    var DestinationPath: js.UndefOr[__string]
    var GroupOwnerSetting: js.UndefOr[GroupOwnerSetting]
    var SourcePath: js.UndefOr[__string]
  }

  object LocalVolumeResourceData {
    @inline
    def apply(
        DestinationPath: js.UndefOr[__string] = js.undefined,
        GroupOwnerSetting: js.UndefOr[GroupOwnerSetting] = js.undefined,
        SourcePath: js.UndefOr[__string] = js.undefined
    ): LocalVolumeResourceData = {
      val __obj = js.Dynamic.literal()
      DestinationPath.foreach(__v => __obj.updateDynamic("DestinationPath")(__v.asInstanceOf[js.Any]))
      GroupOwnerSetting.foreach(__v => __obj.updateDynamic("GroupOwnerSetting")(__v.asInstanceOf[js.Any]))
      SourcePath.foreach(__v => __obj.updateDynamic("SourcePath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LocalVolumeResourceData]
    }
  }

  /** Information about a logger
    */
  @js.native
  trait Logger extends js.Object {
    var Component: LoggerComponent
    var Id: __string
    var Level: LoggerLevel
    var Type: LoggerType
    var Space: js.UndefOr[__integer]
  }

  object Logger {
    @inline
    def apply(
        Component: LoggerComponent,
        Id: __string,
        Level: LoggerLevel,
        Type: LoggerType,
        Space: js.UndefOr[__integer] = js.undefined
    ): Logger = {
      val __obj = js.Dynamic.literal(
        "Component" -> Component.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "Level" -> Level.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      Space.foreach(__v => __obj.updateDynamic("Space")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Logger]
    }
  }

  @js.native
  sealed trait LoggerComponent extends js.Any
  object LoggerComponent {
    val GreengrassSystem = "GreengrassSystem".asInstanceOf[LoggerComponent]
    val Lambda = "Lambda".asInstanceOf[LoggerComponent]

    @inline def values = js.Array(GreengrassSystem, Lambda)
  }

  /** Information about a logger definition version.
    */
  @js.native
  trait LoggerDefinitionVersion extends js.Object {
    var Loggers: js.UndefOr[__listOfLogger]
  }

  object LoggerDefinitionVersion {
    @inline
    def apply(
        Loggers: js.UndefOr[__listOfLogger] = js.undefined
    ): LoggerDefinitionVersion = {
      val __obj = js.Dynamic.literal()
      Loggers.foreach(__v => __obj.updateDynamic("Loggers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoggerDefinitionVersion]
    }
  }

  @js.native
  sealed trait LoggerLevel extends js.Any
  object LoggerLevel {
    val DEBUG = "DEBUG".asInstanceOf[LoggerLevel]
    val INFO = "INFO".asInstanceOf[LoggerLevel]
    val WARN = "WARN".asInstanceOf[LoggerLevel]
    val ERROR = "ERROR".asInstanceOf[LoggerLevel]
    val FATAL = "FATAL".asInstanceOf[LoggerLevel]

    @inline def values = js.Array(DEBUG, INFO, WARN, ERROR, FATAL)
  }

  @js.native
  sealed trait LoggerType extends js.Any
  object LoggerType {
    val FileSystem = "FileSystem".asInstanceOf[LoggerType]
    val AWSCloudWatch = "AWSCloudWatch".asInstanceOf[LoggerType]

    @inline def values = js.Array(FileSystem, AWSCloudWatch)
  }

  /** The type of permission a function has to access a resource.
    */
  @js.native
  sealed trait Permission extends js.Any
  object Permission {
    val ro = "ro".asInstanceOf[Permission]
    val rw = "rw".asInstanceOf[Permission]

    @inline def values = js.Array(ro, rw)
  }

  /** Information needed to reset deployments.
    */
  @js.native
  trait ResetDeploymentsRequest extends js.Object {
    var GroupId: __string
    var AmznClientToken: js.UndefOr[__string]
    var Force: js.UndefOr[__boolean]
  }

  object ResetDeploymentsRequest {
    @inline
    def apply(
        GroupId: __string,
        AmznClientToken: js.UndefOr[__string] = js.undefined,
        Force: js.UndefOr[__boolean] = js.undefined
    ): ResetDeploymentsRequest = {
      val __obj = js.Dynamic.literal(
        "GroupId" -> GroupId.asInstanceOf[js.Any]
      )

      AmznClientToken.foreach(__v => __obj.updateDynamic("AmznClientToken")(__v.asInstanceOf[js.Any]))
      Force.foreach(__v => __obj.updateDynamic("Force")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResetDeploymentsRequest]
    }
  }

  @js.native
  trait ResetDeploymentsResponse extends js.Object {
    var DeploymentArn: js.UndefOr[__string]
    var DeploymentId: js.UndefOr[__string]
  }

  object ResetDeploymentsResponse {
    @inline
    def apply(
        DeploymentArn: js.UndefOr[__string] = js.undefined,
        DeploymentId: js.UndefOr[__string] = js.undefined
    ): ResetDeploymentsResponse = {
      val __obj = js.Dynamic.literal()
      DeploymentArn.foreach(__v => __obj.updateDynamic("DeploymentArn")(__v.asInstanceOf[js.Any]))
      DeploymentId.foreach(__v => __obj.updateDynamic("DeploymentId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResetDeploymentsResponse]
    }
  }

  /** Information about a resource.
    */
  @js.native
  trait Resource extends js.Object {
    var Id: __string
    var Name: __string
    var ResourceDataContainer: ResourceDataContainer
  }

  object Resource {
    @inline
    def apply(
        Id: __string,
        Name: __string,
        ResourceDataContainer: ResourceDataContainer
    ): Resource = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "ResourceDataContainer" -> ResourceDataContainer.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Resource]
    }
  }

  /** A policy used by the function to access a resource.
    */
  @js.native
  trait ResourceAccessPolicy extends js.Object {
    var ResourceId: __string
    var Permission: js.UndefOr[Permission]
  }

  object ResourceAccessPolicy {
    @inline
    def apply(
        ResourceId: __string,
        Permission: js.UndefOr[Permission] = js.undefined
    ): ResourceAccessPolicy = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )

      Permission.foreach(__v => __obj.updateDynamic("Permission")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceAccessPolicy]
    }
  }

  /** A container for resource data. The container takes only one of the following supported resource data types: ''LocalDeviceResourceData'', ''LocalVolumeResourceData'', ''SageMakerMachineLearningModelResourceData'', ''S3MachineLearningModelResourceData'', ''SecretsManagerSecretResourceData''.
    */
  @js.native
  trait ResourceDataContainer extends js.Object {
    var LocalDeviceResourceData: js.UndefOr[LocalDeviceResourceData]
    var LocalVolumeResourceData: js.UndefOr[LocalVolumeResourceData]
    var S3MachineLearningModelResourceData: js.UndefOr[S3MachineLearningModelResourceData]
    var SageMakerMachineLearningModelResourceData: js.UndefOr[SageMakerMachineLearningModelResourceData]
    var SecretsManagerSecretResourceData: js.UndefOr[SecretsManagerSecretResourceData]
  }

  object ResourceDataContainer {
    @inline
    def apply(
        LocalDeviceResourceData: js.UndefOr[LocalDeviceResourceData] = js.undefined,
        LocalVolumeResourceData: js.UndefOr[LocalVolumeResourceData] = js.undefined,
        S3MachineLearningModelResourceData: js.UndefOr[S3MachineLearningModelResourceData] = js.undefined,
        SageMakerMachineLearningModelResourceData: js.UndefOr[SageMakerMachineLearningModelResourceData] = js.undefined,
        SecretsManagerSecretResourceData: js.UndefOr[SecretsManagerSecretResourceData] = js.undefined
    ): ResourceDataContainer = {
      val __obj = js.Dynamic.literal()
      LocalDeviceResourceData.foreach(__v => __obj.updateDynamic("LocalDeviceResourceData")(__v.asInstanceOf[js.Any]))
      LocalVolumeResourceData.foreach(__v => __obj.updateDynamic("LocalVolumeResourceData")(__v.asInstanceOf[js.Any]))
      S3MachineLearningModelResourceData.foreach(__v => __obj.updateDynamic("S3MachineLearningModelResourceData")(__v.asInstanceOf[js.Any]))
      SageMakerMachineLearningModelResourceData.foreach(__v => __obj.updateDynamic("SageMakerMachineLearningModelResourceData")(__v.asInstanceOf[js.Any]))
      SecretsManagerSecretResourceData.foreach(__v => __obj.updateDynamic("SecretsManagerSecretResourceData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceDataContainer]
    }
  }

  /** Information about a resource definition version.
    */
  @js.native
  trait ResourceDefinitionVersion extends js.Object {
    var Resources: js.UndefOr[__listOfResource]
  }

  object ResourceDefinitionVersion {
    @inline
    def apply(
        Resources: js.UndefOr[__listOfResource] = js.undefined
    ): ResourceDefinitionVersion = {
      val __obj = js.Dynamic.literal()
      Resources.foreach(__v => __obj.updateDynamic("Resources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceDefinitionVersion]
    }
  }

  /** The owner setting for downloaded machine learning resources.
    */
  @js.native
  trait ResourceDownloadOwnerSetting extends js.Object {
    var GroupOwner: __string
    var GroupPermission: Permission
  }

  object ResourceDownloadOwnerSetting {
    @inline
    def apply(
        GroupOwner: __string,
        GroupPermission: Permission
    ): ResourceDownloadOwnerSetting = {
      val __obj = js.Dynamic.literal(
        "GroupOwner" -> GroupOwner.asInstanceOf[js.Any],
        "GroupPermission" -> GroupPermission.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ResourceDownloadOwnerSetting]
    }
  }

  /** Attributes that define an Amazon S3 machine learning resource.
    */
  @js.native
  trait S3MachineLearningModelResourceData extends js.Object {
    var DestinationPath: js.UndefOr[__string]
    var OwnerSetting: js.UndefOr[ResourceDownloadOwnerSetting]
    var S3Uri: js.UndefOr[__string]
  }

  object S3MachineLearningModelResourceData {
    @inline
    def apply(
        DestinationPath: js.UndefOr[__string] = js.undefined,
        OwnerSetting: js.UndefOr[ResourceDownloadOwnerSetting] = js.undefined,
        S3Uri: js.UndefOr[__string] = js.undefined
    ): S3MachineLearningModelResourceData = {
      val __obj = js.Dynamic.literal()
      DestinationPath.foreach(__v => __obj.updateDynamic("DestinationPath")(__v.asInstanceOf[js.Any]))
      OwnerSetting.foreach(__v => __obj.updateDynamic("OwnerSetting")(__v.asInstanceOf[js.Any]))
      S3Uri.foreach(__v => __obj.updateDynamic("S3Uri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3MachineLearningModelResourceData]
    }
  }

  /** Attributes that define an Amazon SageMaker machine learning resource.
    */
  @js.native
  trait SageMakerMachineLearningModelResourceData extends js.Object {
    var DestinationPath: js.UndefOr[__string]
    var OwnerSetting: js.UndefOr[ResourceDownloadOwnerSetting]
    var SageMakerJobArn: js.UndefOr[__string]
  }

  object SageMakerMachineLearningModelResourceData {
    @inline
    def apply(
        DestinationPath: js.UndefOr[__string] = js.undefined,
        OwnerSetting: js.UndefOr[ResourceDownloadOwnerSetting] = js.undefined,
        SageMakerJobArn: js.UndefOr[__string] = js.undefined
    ): SageMakerMachineLearningModelResourceData = {
      val __obj = js.Dynamic.literal()
      DestinationPath.foreach(__v => __obj.updateDynamic("DestinationPath")(__v.asInstanceOf[js.Any]))
      OwnerSetting.foreach(__v => __obj.updateDynamic("OwnerSetting")(__v.asInstanceOf[js.Any]))
      SageMakerJobArn.foreach(__v => __obj.updateDynamic("SageMakerJobArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SageMakerMachineLearningModelResourceData]
    }
  }

  /** Attributes that define a secret resource, which references a secret from AWS Secrets Manager. AWS IoT Greengrass stores a local, encrypted copy of the secret on the Greengrass core, where it can be securely accessed by connectors and Lambda functions.
    */
  @js.native
  trait SecretsManagerSecretResourceData extends js.Object {
    var ARN: js.UndefOr[__string]
    var AdditionalStagingLabelsToDownload: js.UndefOr[__listOf__string]
  }

  object SecretsManagerSecretResourceData {
    @inline
    def apply(
        ARN: js.UndefOr[__string] = js.undefined,
        AdditionalStagingLabelsToDownload: js.UndefOr[__listOf__string] = js.undefined
    ): SecretsManagerSecretResourceData = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      AdditionalStagingLabelsToDownload.foreach(__v => __obj.updateDynamic("AdditionalStagingLabelsToDownload")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecretsManagerSecretResourceData]
    }
  }

  /** The piece of software on the Greengrass core that will be updated.
    */
  @js.native
  sealed trait SoftwareToUpdate extends js.Any
  object SoftwareToUpdate {
    val core = "core".asInstanceOf[SoftwareToUpdate]
    val ota_agent = "ota_agent".asInstanceOf[SoftwareToUpdate]

    @inline def values = js.Array(core, ota_agent)
  }

  @js.native
  trait StartBulkDeploymentRequest extends js.Object {
    var ExecutionRoleArn: __string
    var InputFileUri: __string
    var AmznClientToken: js.UndefOr[__string]
    var tags: js.UndefOr[Tags]
  }

  object StartBulkDeploymentRequest {
    @inline
    def apply(
        ExecutionRoleArn: __string,
        InputFileUri: __string,
        AmznClientToken: js.UndefOr[__string] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): StartBulkDeploymentRequest = {
      val __obj = js.Dynamic.literal(
        "ExecutionRoleArn" -> ExecutionRoleArn.asInstanceOf[js.Any],
        "InputFileUri" -> InputFileUri.asInstanceOf[js.Any]
      )

      AmznClientToken.foreach(__v => __obj.updateDynamic("AmznClientToken")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartBulkDeploymentRequest]
    }
  }

  @js.native
  trait StartBulkDeploymentResponse extends js.Object {
    var BulkDeploymentArn: js.UndefOr[__string]
    var BulkDeploymentId: js.UndefOr[__string]
  }

  object StartBulkDeploymentResponse {
    @inline
    def apply(
        BulkDeploymentArn: js.UndefOr[__string] = js.undefined,
        BulkDeploymentId: js.UndefOr[__string] = js.undefined
    ): StartBulkDeploymentResponse = {
      val __obj = js.Dynamic.literal()
      BulkDeploymentArn.foreach(__v => __obj.updateDynamic("BulkDeploymentArn")(__v.asInstanceOf[js.Any]))
      BulkDeploymentId.foreach(__v => __obj.updateDynamic("BulkDeploymentId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartBulkDeploymentResponse]
    }
  }

  @js.native
  trait StopBulkDeploymentRequest extends js.Object {
    var BulkDeploymentId: __string
  }

  object StopBulkDeploymentRequest {
    @inline
    def apply(
        BulkDeploymentId: __string
    ): StopBulkDeploymentRequest = {
      val __obj = js.Dynamic.literal(
        "BulkDeploymentId" -> BulkDeploymentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopBulkDeploymentRequest]
    }
  }

  @js.native
  trait StopBulkDeploymentResponse extends js.Object {}

  object StopBulkDeploymentResponse {
    @inline
    def apply(
    ): StopBulkDeploymentResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopBulkDeploymentResponse]
    }
  }

  /** Information about a subscription.
    */
  @js.native
  trait Subscription extends js.Object {
    var Id: __string
    var Source: __string
    var Subject: __string
    var Target: __string
  }

  object Subscription {
    @inline
    def apply(
        Id: __string,
        Source: __string,
        Subject: __string,
        Target: __string
    ): Subscription = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "Source" -> Source.asInstanceOf[js.Any],
        "Subject" -> Subject.asInstanceOf[js.Any],
        "Target" -> Target.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Subscription]
    }
  }

  /** Information about a subscription definition version.
    */
  @js.native
  trait SubscriptionDefinitionVersion extends js.Object {
    var Subscriptions: js.UndefOr[__listOfSubscription]
  }

  object SubscriptionDefinitionVersion {
    @inline
    def apply(
        Subscriptions: js.UndefOr[__listOfSubscription] = js.undefined
    ): SubscriptionDefinitionVersion = {
      val __obj = js.Dynamic.literal()
      Subscriptions.foreach(__v => __obj.updateDynamic("Subscriptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SubscriptionDefinitionVersion]
    }
  }

  /** A map of the key-value pairs for the resource tag.
    */
  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: __string
    var tags: js.UndefOr[Tags]
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: __string,
        tags: js.UndefOr[Tags] = js.undefined
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: __string
    var TagKeys: __listOf__string
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: __string,
        TagKeys: __listOf__string
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  /** The minimum level of log statements that should be logged by the OTA Agent during an update.
    */
  @js.native
  sealed trait UpdateAgentLogLevel extends js.Any
  object UpdateAgentLogLevel {
    val NONE = "NONE".asInstanceOf[UpdateAgentLogLevel]
    val TRACE = "TRACE".asInstanceOf[UpdateAgentLogLevel]
    val DEBUG = "DEBUG".asInstanceOf[UpdateAgentLogLevel]
    val VERBOSE = "VERBOSE".asInstanceOf[UpdateAgentLogLevel]
    val INFO = "INFO".asInstanceOf[UpdateAgentLogLevel]
    val WARN = "WARN".asInstanceOf[UpdateAgentLogLevel]
    val ERROR = "ERROR".asInstanceOf[UpdateAgentLogLevel]
    val FATAL = "FATAL".asInstanceOf[UpdateAgentLogLevel]

    @inline def values = js.Array(NONE, TRACE, DEBUG, VERBOSE, INFO, WARN, ERROR, FATAL)
  }

  /** Connectivity information.
    */
  @js.native
  trait UpdateConnectivityInfoRequest extends js.Object {
    var ThingName: __string
    var ConnectivityInfo: js.UndefOr[__listOfConnectivityInfo]
  }

  object UpdateConnectivityInfoRequest {
    @inline
    def apply(
        ThingName: __string,
        ConnectivityInfo: js.UndefOr[__listOfConnectivityInfo] = js.undefined
    ): UpdateConnectivityInfoRequest = {
      val __obj = js.Dynamic.literal(
        "ThingName" -> ThingName.asInstanceOf[js.Any]
      )

      ConnectivityInfo.foreach(__v => __obj.updateDynamic("ConnectivityInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateConnectivityInfoRequest]
    }
  }

  @js.native
  trait UpdateConnectivityInfoResponse extends js.Object {
    var Message: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  object UpdateConnectivityInfoResponse {
    @inline
    def apply(
        Message: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__string] = js.undefined
    ): UpdateConnectivityInfoResponse = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateConnectivityInfoResponse]
    }
  }

  @js.native
  trait UpdateConnectorDefinitionRequest extends js.Object {
    var ConnectorDefinitionId: __string
    var Name: js.UndefOr[__string]
  }

  object UpdateConnectorDefinitionRequest {
    @inline
    def apply(
        ConnectorDefinitionId: __string,
        Name: js.UndefOr[__string] = js.undefined
    ): UpdateConnectorDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "ConnectorDefinitionId" -> ConnectorDefinitionId.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateConnectorDefinitionRequest]
    }
  }

  @js.native
  trait UpdateConnectorDefinitionResponse extends js.Object {}

  object UpdateConnectorDefinitionResponse {
    @inline
    def apply(
    ): UpdateConnectorDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateConnectorDefinitionResponse]
    }
  }

  @js.native
  trait UpdateCoreDefinitionRequest extends js.Object {
    var CoreDefinitionId: __string
    var Name: js.UndefOr[__string]
  }

  object UpdateCoreDefinitionRequest {
    @inline
    def apply(
        CoreDefinitionId: __string,
        Name: js.UndefOr[__string] = js.undefined
    ): UpdateCoreDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "CoreDefinitionId" -> CoreDefinitionId.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCoreDefinitionRequest]
    }
  }

  @js.native
  trait UpdateCoreDefinitionResponse extends js.Object {}

  object UpdateCoreDefinitionResponse {
    @inline
    def apply(
    ): UpdateCoreDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateCoreDefinitionResponse]
    }
  }

  @js.native
  trait UpdateDeviceDefinitionRequest extends js.Object {
    var DeviceDefinitionId: __string
    var Name: js.UndefOr[__string]
  }

  object UpdateDeviceDefinitionRequest {
    @inline
    def apply(
        DeviceDefinitionId: __string,
        Name: js.UndefOr[__string] = js.undefined
    ): UpdateDeviceDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceDefinitionId" -> DeviceDefinitionId.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDeviceDefinitionRequest]
    }
  }

  @js.native
  trait UpdateDeviceDefinitionResponse extends js.Object {}

  object UpdateDeviceDefinitionResponse {
    @inline
    def apply(
    ): UpdateDeviceDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateDeviceDefinitionResponse]
    }
  }

  @js.native
  trait UpdateFunctionDefinitionRequest extends js.Object {
    var FunctionDefinitionId: __string
    var Name: js.UndefOr[__string]
  }

  object UpdateFunctionDefinitionRequest {
    @inline
    def apply(
        FunctionDefinitionId: __string,
        Name: js.UndefOr[__string] = js.undefined
    ): UpdateFunctionDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "FunctionDefinitionId" -> FunctionDefinitionId.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFunctionDefinitionRequest]
    }
  }

  @js.native
  trait UpdateFunctionDefinitionResponse extends js.Object {}

  object UpdateFunctionDefinitionResponse {
    @inline
    def apply(
    ): UpdateFunctionDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateFunctionDefinitionResponse]
    }
  }

  @js.native
  trait UpdateGroupCertificateConfigurationRequest extends js.Object {
    var GroupId: __string
    var CertificateExpiryInMilliseconds: js.UndefOr[__string]
  }

  object UpdateGroupCertificateConfigurationRequest {
    @inline
    def apply(
        GroupId: __string,
        CertificateExpiryInMilliseconds: js.UndefOr[__string] = js.undefined
    ): UpdateGroupCertificateConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "GroupId" -> GroupId.asInstanceOf[js.Any]
      )

      CertificateExpiryInMilliseconds.foreach(__v => __obj.updateDynamic("CertificateExpiryInMilliseconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGroupCertificateConfigurationRequest]
    }
  }

  @js.native
  trait UpdateGroupCertificateConfigurationResponse extends js.Object {
    var CertificateAuthorityExpiryInMilliseconds: js.UndefOr[__string]
    var CertificateExpiryInMilliseconds: js.UndefOr[__string]
    var GroupId: js.UndefOr[__string]
  }

  object UpdateGroupCertificateConfigurationResponse {
    @inline
    def apply(
        CertificateAuthorityExpiryInMilliseconds: js.UndefOr[__string] = js.undefined,
        CertificateExpiryInMilliseconds: js.UndefOr[__string] = js.undefined,
        GroupId: js.UndefOr[__string] = js.undefined
    ): UpdateGroupCertificateConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      CertificateAuthorityExpiryInMilliseconds.foreach(__v => __obj.updateDynamic("CertificateAuthorityExpiryInMilliseconds")(__v.asInstanceOf[js.Any]))
      CertificateExpiryInMilliseconds.foreach(__v => __obj.updateDynamic("CertificateExpiryInMilliseconds")(__v.asInstanceOf[js.Any]))
      GroupId.foreach(__v => __obj.updateDynamic("GroupId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGroupCertificateConfigurationResponse]
    }
  }

  @js.native
  trait UpdateGroupRequest extends js.Object {
    var GroupId: __string
    var Name: js.UndefOr[__string]
  }

  object UpdateGroupRequest {
    @inline
    def apply(
        GroupId: __string,
        Name: js.UndefOr[__string] = js.undefined
    ): UpdateGroupRequest = {
      val __obj = js.Dynamic.literal(
        "GroupId" -> GroupId.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGroupRequest]
    }
  }

  @js.native
  trait UpdateGroupResponse extends js.Object {}

  object UpdateGroupResponse {
    @inline
    def apply(
    ): UpdateGroupResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateGroupResponse]
    }
  }

  @js.native
  trait UpdateLoggerDefinitionRequest extends js.Object {
    var LoggerDefinitionId: __string
    var Name: js.UndefOr[__string]
  }

  object UpdateLoggerDefinitionRequest {
    @inline
    def apply(
        LoggerDefinitionId: __string,
        Name: js.UndefOr[__string] = js.undefined
    ): UpdateLoggerDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "LoggerDefinitionId" -> LoggerDefinitionId.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLoggerDefinitionRequest]
    }
  }

  @js.native
  trait UpdateLoggerDefinitionResponse extends js.Object {}

  object UpdateLoggerDefinitionResponse {
    @inline
    def apply(
    ): UpdateLoggerDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateLoggerDefinitionResponse]
    }
  }

  @js.native
  trait UpdateResourceDefinitionRequest extends js.Object {
    var ResourceDefinitionId: __string
    var Name: js.UndefOr[__string]
  }

  object UpdateResourceDefinitionRequest {
    @inline
    def apply(
        ResourceDefinitionId: __string,
        Name: js.UndefOr[__string] = js.undefined
    ): UpdateResourceDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceDefinitionId" -> ResourceDefinitionId.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateResourceDefinitionRequest]
    }
  }

  @js.native
  trait UpdateResourceDefinitionResponse extends js.Object {}

  object UpdateResourceDefinitionResponse {
    @inline
    def apply(
    ): UpdateResourceDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateResourceDefinitionResponse]
    }
  }

  @js.native
  trait UpdateSubscriptionDefinitionRequest extends js.Object {
    var SubscriptionDefinitionId: __string
    var Name: js.UndefOr[__string]
  }

  object UpdateSubscriptionDefinitionRequest {
    @inline
    def apply(
        SubscriptionDefinitionId: __string,
        Name: js.UndefOr[__string] = js.undefined
    ): UpdateSubscriptionDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "SubscriptionDefinitionId" -> SubscriptionDefinitionId.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSubscriptionDefinitionRequest]
    }
  }

  @js.native
  trait UpdateSubscriptionDefinitionResponse extends js.Object {}

  object UpdateSubscriptionDefinitionResponse {
    @inline
    def apply(
    ): UpdateSubscriptionDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateSubscriptionDefinitionResponse]
    }
  }

  /** The architecture of the cores which are the targets of an update.
    */
  @js.native
  sealed trait UpdateTargetsArchitecture extends js.Any
  object UpdateTargetsArchitecture {
    val armv6l = "armv6l".asInstanceOf[UpdateTargetsArchitecture]
    val armv7l = "armv7l".asInstanceOf[UpdateTargetsArchitecture]
    val x86_64 = "x86_64".asInstanceOf[UpdateTargetsArchitecture]
    val aarch64 = "aarch64".asInstanceOf[UpdateTargetsArchitecture]

    @inline def values = js.Array(armv6l, armv7l, x86_64, aarch64)
  }

  /** The operating system of the cores which are the targets of an update.
    */
  @js.native
  sealed trait UpdateTargetsOperatingSystem extends js.Any
  object UpdateTargetsOperatingSystem {
    val ubuntu = "ubuntu".asInstanceOf[UpdateTargetsOperatingSystem]
    val raspbian = "raspbian".asInstanceOf[UpdateTargetsOperatingSystem]
    val amazon_linux = "amazon_linux".asInstanceOf[UpdateTargetsOperatingSystem]
    val openwrt = "openwrt".asInstanceOf[UpdateTargetsOperatingSystem]

    @inline def values = js.Array(ubuntu, raspbian, amazon_linux, openwrt)
  }

  /** Information about a version.
    */
  @js.native
  trait VersionInformation extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  object VersionInformation {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTimestamp: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        Version: js.UndefOr[__string] = js.undefined
    ): VersionInformation = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTimestamp.foreach(__v => __obj.updateDynamic("CreationTimestamp")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VersionInformation]
    }
  }
}
