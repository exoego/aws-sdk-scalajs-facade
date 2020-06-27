package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object greengrass {
  type BulkDeploymentResults                       = js.Array[BulkDeploymentResult]
  type BulkDeployments                             = js.Array[BulkDeployment]
  type Deployments                                 = js.Array[Deployment]
  type ErrorDetails                                = js.Array[ErrorDetail]
  type S3UrlSignerRole                             = String
  type Tags                                        = js.Dictionary[__string]
  type UpdateTargets                               = js.Array[__string]
  type __boolean                                   = Boolean
  type __integer                                   = Int
  type __listOfConnectivityInfo                    = js.Array[ConnectivityInfo]
  type __listOfConnector                           = js.Array[Connector]
  type __listOfCore                                = js.Array[Core]
  type __listOfDefinitionInformation               = js.Array[DefinitionInformation]
  type __listOfDevice                              = js.Array[Device]
  type __listOfFunction                            = js.Array[Function]
  type __listOfGroupCertificateAuthorityProperties = js.Array[GroupCertificateAuthorityProperties]
  type __listOfGroupInformation                    = js.Array[GroupInformation]
  type __listOfLogger                              = js.Array[Logger]
  type __listOfResource                            = js.Array[Resource]
  type __listOfResourceAccessPolicy                = js.Array[ResourceAccessPolicy]
  type __listOfSubscription                        = js.Array[Subscription]
  type __listOfVersionInformation                  = js.Array[VersionInformation]
  type __listOf__string                            = js.Array[__string]
  type __mapOf__string                             = js.Dictionary[__string]
  type __string                                    = String

  implicit final class GreengrassOps(private val service: Greengrass) extends AnyVal {

    @inline def associateRoleToGroupFuture(params: AssociateRoleToGroupRequest): Future[AssociateRoleToGroupResponse] =
      service.associateRoleToGroup(params).promise().toFuture
    @inline def associateServiceRoleToAccountFuture(
        params: AssociateServiceRoleToAccountRequest
    ): Future[AssociateServiceRoleToAccountResponse] = service.associateServiceRoleToAccount(params).promise().toFuture
    @inline def createConnectorDefinitionFuture(
        params: CreateConnectorDefinitionRequest
    ): Future[CreateConnectorDefinitionResponse] = service.createConnectorDefinition(params).promise().toFuture
    @inline def createConnectorDefinitionVersionFuture(
        params: CreateConnectorDefinitionVersionRequest
    ): Future[CreateConnectorDefinitionVersionResponse] =
      service.createConnectorDefinitionVersion(params).promise().toFuture
    @inline def createCoreDefinitionFuture(params: CreateCoreDefinitionRequest): Future[CreateCoreDefinitionResponse] =
      service.createCoreDefinition(params).promise().toFuture
    @inline def createCoreDefinitionVersionFuture(
        params: CreateCoreDefinitionVersionRequest
    ): Future[CreateCoreDefinitionVersionResponse] = service.createCoreDefinitionVersion(params).promise().toFuture
    @inline def createDeploymentFuture(params: CreateDeploymentRequest): Future[CreateDeploymentResponse] =
      service.createDeployment(params).promise().toFuture
    @inline def createDeviceDefinitionFuture(
        params: CreateDeviceDefinitionRequest
    ): Future[CreateDeviceDefinitionResponse] = service.createDeviceDefinition(params).promise().toFuture
    @inline def createDeviceDefinitionVersionFuture(
        params: CreateDeviceDefinitionVersionRequest
    ): Future[CreateDeviceDefinitionVersionResponse] = service.createDeviceDefinitionVersion(params).promise().toFuture
    @inline def createFunctionDefinitionFuture(
        params: CreateFunctionDefinitionRequest
    ): Future[CreateFunctionDefinitionResponse] = service.createFunctionDefinition(params).promise().toFuture
    @inline def createFunctionDefinitionVersionFuture(
        params: CreateFunctionDefinitionVersionRequest
    ): Future[CreateFunctionDefinitionVersionResponse] =
      service.createFunctionDefinitionVersion(params).promise().toFuture
    @inline def createGroupCertificateAuthorityFuture(
        params: CreateGroupCertificateAuthorityRequest
    ): Future[CreateGroupCertificateAuthorityResponse] =
      service.createGroupCertificateAuthority(params).promise().toFuture
    @inline def createGroupFuture(params: CreateGroupRequest): Future[CreateGroupResponse] =
      service.createGroup(params).promise().toFuture
    @inline def createGroupVersionFuture(params: CreateGroupVersionRequest): Future[CreateGroupVersionResponse] =
      service.createGroupVersion(params).promise().toFuture
    @inline def createLoggerDefinitionFuture(
        params: CreateLoggerDefinitionRequest
    ): Future[CreateLoggerDefinitionResponse] = service.createLoggerDefinition(params).promise().toFuture
    @inline def createLoggerDefinitionVersionFuture(
        params: CreateLoggerDefinitionVersionRequest
    ): Future[CreateLoggerDefinitionVersionResponse] = service.createLoggerDefinitionVersion(params).promise().toFuture
    @inline def createResourceDefinitionFuture(
        params: CreateResourceDefinitionRequest
    ): Future[CreateResourceDefinitionResponse] = service.createResourceDefinition(params).promise().toFuture
    @inline def createResourceDefinitionVersionFuture(
        params: CreateResourceDefinitionVersionRequest
    ): Future[CreateResourceDefinitionVersionResponse] =
      service.createResourceDefinitionVersion(params).promise().toFuture
    @inline def createSoftwareUpdateJobFuture(
        params: CreateSoftwareUpdateJobRequest
    ): Future[CreateSoftwareUpdateJobResponse] = service.createSoftwareUpdateJob(params).promise().toFuture
    @inline def createSubscriptionDefinitionFuture(
        params: CreateSubscriptionDefinitionRequest
    ): Future[CreateSubscriptionDefinitionResponse] = service.createSubscriptionDefinition(params).promise().toFuture
    @inline def createSubscriptionDefinitionVersionFuture(
        params: CreateSubscriptionDefinitionVersionRequest
    ): Future[CreateSubscriptionDefinitionVersionResponse] =
      service.createSubscriptionDefinitionVersion(params).promise().toFuture
    @inline def deleteConnectorDefinitionFuture(
        params: DeleteConnectorDefinitionRequest
    ): Future[DeleteConnectorDefinitionResponse] = service.deleteConnectorDefinition(params).promise().toFuture
    @inline def deleteCoreDefinitionFuture(params: DeleteCoreDefinitionRequest): Future[DeleteCoreDefinitionResponse] =
      service.deleteCoreDefinition(params).promise().toFuture
    @inline def deleteDeviceDefinitionFuture(
        params: DeleteDeviceDefinitionRequest
    ): Future[DeleteDeviceDefinitionResponse] = service.deleteDeviceDefinition(params).promise().toFuture
    @inline def deleteFunctionDefinitionFuture(
        params: DeleteFunctionDefinitionRequest
    ): Future[DeleteFunctionDefinitionResponse] = service.deleteFunctionDefinition(params).promise().toFuture
    @inline def deleteGroupFuture(params: DeleteGroupRequest): Future[DeleteGroupResponse] =
      service.deleteGroup(params).promise().toFuture
    @inline def deleteLoggerDefinitionFuture(
        params: DeleteLoggerDefinitionRequest
    ): Future[DeleteLoggerDefinitionResponse] = service.deleteLoggerDefinition(params).promise().toFuture
    @inline def deleteResourceDefinitionFuture(
        params: DeleteResourceDefinitionRequest
    ): Future[DeleteResourceDefinitionResponse] = service.deleteResourceDefinition(params).promise().toFuture
    @inline def deleteSubscriptionDefinitionFuture(
        params: DeleteSubscriptionDefinitionRequest
    ): Future[DeleteSubscriptionDefinitionResponse] = service.deleteSubscriptionDefinition(params).promise().toFuture
    @inline def disassociateRoleFromGroupFuture(
        params: DisassociateRoleFromGroupRequest
    ): Future[DisassociateRoleFromGroupResponse] = service.disassociateRoleFromGroup(params).promise().toFuture
    @inline def disassociateServiceRoleFromAccountFuture(
        params: DisassociateServiceRoleFromAccountRequest
    ): Future[DisassociateServiceRoleFromAccountResponse] =
      service.disassociateServiceRoleFromAccount(params).promise().toFuture
    @inline def getAssociatedRoleFuture(params: GetAssociatedRoleRequest): Future[GetAssociatedRoleResponse] =
      service.getAssociatedRole(params).promise().toFuture
    @inline def getBulkDeploymentStatusFuture(
        params: GetBulkDeploymentStatusRequest
    ): Future[GetBulkDeploymentStatusResponse] = service.getBulkDeploymentStatus(params).promise().toFuture
    @inline def getConnectivityInfoFuture(params: GetConnectivityInfoRequest): Future[GetConnectivityInfoResponse] =
      service.getConnectivityInfo(params).promise().toFuture
    @inline def getConnectorDefinitionFuture(
        params: GetConnectorDefinitionRequest
    ): Future[GetConnectorDefinitionResponse] = service.getConnectorDefinition(params).promise().toFuture
    @inline def getConnectorDefinitionVersionFuture(
        params: GetConnectorDefinitionVersionRequest
    ): Future[GetConnectorDefinitionVersionResponse] = service.getConnectorDefinitionVersion(params).promise().toFuture
    @inline def getCoreDefinitionFuture(params: GetCoreDefinitionRequest): Future[GetCoreDefinitionResponse] =
      service.getCoreDefinition(params).promise().toFuture
    @inline def getCoreDefinitionVersionFuture(
        params: GetCoreDefinitionVersionRequest
    ): Future[GetCoreDefinitionVersionResponse] = service.getCoreDefinitionVersion(params).promise().toFuture
    @inline def getDeploymentStatusFuture(params: GetDeploymentStatusRequest): Future[GetDeploymentStatusResponse] =
      service.getDeploymentStatus(params).promise().toFuture
    @inline def getDeviceDefinitionFuture(params: GetDeviceDefinitionRequest): Future[GetDeviceDefinitionResponse] =
      service.getDeviceDefinition(params).promise().toFuture
    @inline def getDeviceDefinitionVersionFuture(
        params: GetDeviceDefinitionVersionRequest
    ): Future[GetDeviceDefinitionVersionResponse] = service.getDeviceDefinitionVersion(params).promise().toFuture
    @inline def getFunctionDefinitionFuture(
        params: GetFunctionDefinitionRequest
    ): Future[GetFunctionDefinitionResponse] = service.getFunctionDefinition(params).promise().toFuture
    @inline def getFunctionDefinitionVersionFuture(
        params: GetFunctionDefinitionVersionRequest
    ): Future[GetFunctionDefinitionVersionResponse] = service.getFunctionDefinitionVersion(params).promise().toFuture
    @inline def getGroupCertificateAuthorityFuture(
        params: GetGroupCertificateAuthorityRequest
    ): Future[GetGroupCertificateAuthorityResponse] = service.getGroupCertificateAuthority(params).promise().toFuture
    @inline def getGroupCertificateConfigurationFuture(
        params: GetGroupCertificateConfigurationRequest
    ): Future[GetGroupCertificateConfigurationResponse] =
      service.getGroupCertificateConfiguration(params).promise().toFuture
    @inline def getGroupFuture(params: GetGroupRequest): Future[GetGroupResponse] =
      service.getGroup(params).promise().toFuture
    @inline def getGroupVersionFuture(params: GetGroupVersionRequest): Future[GetGroupVersionResponse] =
      service.getGroupVersion(params).promise().toFuture
    @inline def getLoggerDefinitionFuture(params: GetLoggerDefinitionRequest): Future[GetLoggerDefinitionResponse] =
      service.getLoggerDefinition(params).promise().toFuture
    @inline def getLoggerDefinitionVersionFuture(
        params: GetLoggerDefinitionVersionRequest
    ): Future[GetLoggerDefinitionVersionResponse] = service.getLoggerDefinitionVersion(params).promise().toFuture
    @inline def getResourceDefinitionFuture(
        params: GetResourceDefinitionRequest
    ): Future[GetResourceDefinitionResponse] = service.getResourceDefinition(params).promise().toFuture
    @inline def getResourceDefinitionVersionFuture(
        params: GetResourceDefinitionVersionRequest
    ): Future[GetResourceDefinitionVersionResponse] = service.getResourceDefinitionVersion(params).promise().toFuture
    @inline def getServiceRoleForAccountFuture(
        params: GetServiceRoleForAccountRequest
    ): Future[GetServiceRoleForAccountResponse] = service.getServiceRoleForAccount(params).promise().toFuture
    @inline def getSubscriptionDefinitionFuture(
        params: GetSubscriptionDefinitionRequest
    ): Future[GetSubscriptionDefinitionResponse] = service.getSubscriptionDefinition(params).promise().toFuture
    @inline def getSubscriptionDefinitionVersionFuture(
        params: GetSubscriptionDefinitionVersionRequest
    ): Future[GetSubscriptionDefinitionVersionResponse] =
      service.getSubscriptionDefinitionVersion(params).promise().toFuture
    @inline def listBulkDeploymentDetailedReportsFuture(
        params: ListBulkDeploymentDetailedReportsRequest
    ): Future[ListBulkDeploymentDetailedReportsResponse] =
      service.listBulkDeploymentDetailedReports(params).promise().toFuture
    @inline def listBulkDeploymentsFuture(params: ListBulkDeploymentsRequest): Future[ListBulkDeploymentsResponse] =
      service.listBulkDeployments(params).promise().toFuture
    @inline def listConnectorDefinitionVersionsFuture(
        params: ListConnectorDefinitionVersionsRequest
    ): Future[ListConnectorDefinitionVersionsResponse] =
      service.listConnectorDefinitionVersions(params).promise().toFuture
    @inline def listConnectorDefinitionsFuture(
        params: ListConnectorDefinitionsRequest
    ): Future[ListConnectorDefinitionsResponse] = service.listConnectorDefinitions(params).promise().toFuture
    @inline def listCoreDefinitionVersionsFuture(
        params: ListCoreDefinitionVersionsRequest
    ): Future[ListCoreDefinitionVersionsResponse] = service.listCoreDefinitionVersions(params).promise().toFuture
    @inline def listCoreDefinitionsFuture(params: ListCoreDefinitionsRequest): Future[ListCoreDefinitionsResponse] =
      service.listCoreDefinitions(params).promise().toFuture
    @inline def listDeploymentsFuture(params: ListDeploymentsRequest): Future[ListDeploymentsResponse] =
      service.listDeployments(params).promise().toFuture
    @inline def listDeviceDefinitionVersionsFuture(
        params: ListDeviceDefinitionVersionsRequest
    ): Future[ListDeviceDefinitionVersionsResponse] = service.listDeviceDefinitionVersions(params).promise().toFuture
    @inline def listDeviceDefinitionsFuture(
        params: ListDeviceDefinitionsRequest
    ): Future[ListDeviceDefinitionsResponse] = service.listDeviceDefinitions(params).promise().toFuture
    @inline def listFunctionDefinitionVersionsFuture(
        params: ListFunctionDefinitionVersionsRequest
    ): Future[ListFunctionDefinitionVersionsResponse] =
      service.listFunctionDefinitionVersions(params).promise().toFuture
    @inline def listFunctionDefinitionsFuture(
        params: ListFunctionDefinitionsRequest
    ): Future[ListFunctionDefinitionsResponse] = service.listFunctionDefinitions(params).promise().toFuture
    @inline def listGroupCertificateAuthoritiesFuture(
        params: ListGroupCertificateAuthoritiesRequest
    ): Future[ListGroupCertificateAuthoritiesResponse] =
      service.listGroupCertificateAuthorities(params).promise().toFuture
    @inline def listGroupVersionsFuture(params: ListGroupVersionsRequest): Future[ListGroupVersionsResponse] =
      service.listGroupVersions(params).promise().toFuture
    @inline def listGroupsFuture(params: ListGroupsRequest): Future[ListGroupsResponse] =
      service.listGroups(params).promise().toFuture
    @inline def listLoggerDefinitionVersionsFuture(
        params: ListLoggerDefinitionVersionsRequest
    ): Future[ListLoggerDefinitionVersionsResponse] = service.listLoggerDefinitionVersions(params).promise().toFuture
    @inline def listLoggerDefinitionsFuture(
        params: ListLoggerDefinitionsRequest
    ): Future[ListLoggerDefinitionsResponse] = service.listLoggerDefinitions(params).promise().toFuture
    @inline def listResourceDefinitionVersionsFuture(
        params: ListResourceDefinitionVersionsRequest
    ): Future[ListResourceDefinitionVersionsResponse] =
      service.listResourceDefinitionVersions(params).promise().toFuture
    @inline def listResourceDefinitionsFuture(
        params: ListResourceDefinitionsRequest
    ): Future[ListResourceDefinitionsResponse] = service.listResourceDefinitions(params).promise().toFuture
    @inline def listSubscriptionDefinitionVersionsFuture(
        params: ListSubscriptionDefinitionVersionsRequest
    ): Future[ListSubscriptionDefinitionVersionsResponse] =
      service.listSubscriptionDefinitionVersions(params).promise().toFuture
    @inline def listSubscriptionDefinitionsFuture(
        params: ListSubscriptionDefinitionsRequest
    ): Future[ListSubscriptionDefinitionsResponse] = service.listSubscriptionDefinitions(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def resetDeploymentsFuture(params: ResetDeploymentsRequest): Future[ResetDeploymentsResponse] =
      service.resetDeployments(params).promise().toFuture
    @inline def startBulkDeploymentFuture(params: StartBulkDeploymentRequest): Future[StartBulkDeploymentResponse] =
      service.startBulkDeployment(params).promise().toFuture
    @inline def stopBulkDeploymentFuture(params: StopBulkDeploymentRequest): Future[StopBulkDeploymentResponse] =
      service.stopBulkDeployment(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise().toFuture
    @inline def updateConnectivityInfoFuture(
        params: UpdateConnectivityInfoRequest
    ): Future[UpdateConnectivityInfoResponse] = service.updateConnectivityInfo(params).promise().toFuture
    @inline def updateConnectorDefinitionFuture(
        params: UpdateConnectorDefinitionRequest
    ): Future[UpdateConnectorDefinitionResponse] = service.updateConnectorDefinition(params).promise().toFuture
    @inline def updateCoreDefinitionFuture(params: UpdateCoreDefinitionRequest): Future[UpdateCoreDefinitionResponse] =
      service.updateCoreDefinition(params).promise().toFuture
    @inline def updateDeviceDefinitionFuture(
        params: UpdateDeviceDefinitionRequest
    ): Future[UpdateDeviceDefinitionResponse] = service.updateDeviceDefinition(params).promise().toFuture
    @inline def updateFunctionDefinitionFuture(
        params: UpdateFunctionDefinitionRequest
    ): Future[UpdateFunctionDefinitionResponse] = service.updateFunctionDefinition(params).promise().toFuture
    @inline def updateGroupCertificateConfigurationFuture(
        params: UpdateGroupCertificateConfigurationRequest
    ): Future[UpdateGroupCertificateConfigurationResponse] =
      service.updateGroupCertificateConfiguration(params).promise().toFuture
    @inline def updateGroupFuture(params: UpdateGroupRequest): Future[UpdateGroupResponse] =
      service.updateGroup(params).promise().toFuture
    @inline def updateLoggerDefinitionFuture(
        params: UpdateLoggerDefinitionRequest
    ): Future[UpdateLoggerDefinitionResponse] = service.updateLoggerDefinition(params).promise().toFuture
    @inline def updateResourceDefinitionFuture(
        params: UpdateResourceDefinitionRequest
    ): Future[UpdateResourceDefinitionResponse] = service.updateResourceDefinition(params).promise().toFuture
    @inline def updateSubscriptionDefinitionFuture(
        params: UpdateSubscriptionDefinitionRequest
    ): Future[UpdateSubscriptionDefinitionResponse] = service.updateSubscriptionDefinition(params).promise().toFuture
  }
}

package greengrass {
  @js.native
  @JSImport("aws-sdk", "Greengrass")
  class Greengrass() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateRoleToGroup(params: AssociateRoleToGroupRequest): Request[AssociateRoleToGroupResponse] = js.native
    def associateServiceRoleToAccount(
        params: AssociateServiceRoleToAccountRequest
    ): Request[AssociateServiceRoleToAccountResponse] = js.native
    def createConnectorDefinition(
        params: CreateConnectorDefinitionRequest
    ): Request[CreateConnectorDefinitionResponse] = js.native
    def createConnectorDefinitionVersion(
        params: CreateConnectorDefinitionVersionRequest
    ): Request[CreateConnectorDefinitionVersionResponse]                                                 = js.native
    def createCoreDefinition(params: CreateCoreDefinitionRequest): Request[CreateCoreDefinitionResponse] = js.native
    def createCoreDefinitionVersion(
        params: CreateCoreDefinitionVersionRequest
    ): Request[CreateCoreDefinitionVersionResponse]                                          = js.native
    def createDeployment(params: CreateDeploymentRequest): Request[CreateDeploymentResponse] = js.native
    def createDeviceDefinition(params: CreateDeviceDefinitionRequest): Request[CreateDeviceDefinitionResponse] =
      js.native
    def createDeviceDefinitionVersion(
        params: CreateDeviceDefinitionVersionRequest
    ): Request[CreateDeviceDefinitionVersionResponse] = js.native
    def createFunctionDefinition(params: CreateFunctionDefinitionRequest): Request[CreateFunctionDefinitionResponse] =
      js.native
    def createFunctionDefinitionVersion(
        params: CreateFunctionDefinitionVersionRequest
    ): Request[CreateFunctionDefinitionVersionResponse]                       = js.native
    def createGroup(params: CreateGroupRequest): Request[CreateGroupResponse] = js.native
    def createGroupCertificateAuthority(
        params: CreateGroupCertificateAuthorityRequest
    ): Request[CreateGroupCertificateAuthorityResponse]                                            = js.native
    def createGroupVersion(params: CreateGroupVersionRequest): Request[CreateGroupVersionResponse] = js.native
    def createLoggerDefinition(params: CreateLoggerDefinitionRequest): Request[CreateLoggerDefinitionResponse] =
      js.native
    def createLoggerDefinitionVersion(
        params: CreateLoggerDefinitionVersionRequest
    ): Request[CreateLoggerDefinitionVersionResponse] = js.native
    def createResourceDefinition(params: CreateResourceDefinitionRequest): Request[CreateResourceDefinitionResponse] =
      js.native
    def createResourceDefinitionVersion(
        params: CreateResourceDefinitionVersionRequest
    ): Request[CreateResourceDefinitionVersionResponse] = js.native
    def createSoftwareUpdateJob(params: CreateSoftwareUpdateJobRequest): Request[CreateSoftwareUpdateJobResponse] =
      js.native
    def createSubscriptionDefinition(
        params: CreateSubscriptionDefinitionRequest
    ): Request[CreateSubscriptionDefinitionResponse] = js.native
    def createSubscriptionDefinitionVersion(
        params: CreateSubscriptionDefinitionVersionRequest
    ): Request[CreateSubscriptionDefinitionVersionResponse] = js.native
    def deleteConnectorDefinition(
        params: DeleteConnectorDefinitionRequest
    ): Request[DeleteConnectorDefinitionResponse]                                                        = js.native
    def deleteCoreDefinition(params: DeleteCoreDefinitionRequest): Request[DeleteCoreDefinitionResponse] = js.native
    def deleteDeviceDefinition(params: DeleteDeviceDefinitionRequest): Request[DeleteDeviceDefinitionResponse] =
      js.native
    def deleteFunctionDefinition(params: DeleteFunctionDefinitionRequest): Request[DeleteFunctionDefinitionResponse] =
      js.native
    def deleteGroup(params: DeleteGroupRequest): Request[DeleteGroupResponse] = js.native
    def deleteLoggerDefinition(params: DeleteLoggerDefinitionRequest): Request[DeleteLoggerDefinitionResponse] =
      js.native
    def deleteResourceDefinition(params: DeleteResourceDefinitionRequest): Request[DeleteResourceDefinitionResponse] =
      js.native
    def deleteSubscriptionDefinition(
        params: DeleteSubscriptionDefinitionRequest
    ): Request[DeleteSubscriptionDefinitionResponse] = js.native
    def disassociateRoleFromGroup(
        params: DisassociateRoleFromGroupRequest
    ): Request[DisassociateRoleFromGroupResponse] = js.native
    def disassociateServiceRoleFromAccount(
        params: DisassociateServiceRoleFromAccountRequest
    ): Request[DisassociateServiceRoleFromAccountResponse]                                      = js.native
    def getAssociatedRole(params: GetAssociatedRoleRequest): Request[GetAssociatedRoleResponse] = js.native
    def getBulkDeploymentStatus(params: GetBulkDeploymentStatusRequest): Request[GetBulkDeploymentStatusResponse] =
      js.native
    def getConnectivityInfo(params: GetConnectivityInfoRequest): Request[GetConnectivityInfoResponse] = js.native
    def getConnectorDefinition(params: GetConnectorDefinitionRequest): Request[GetConnectorDefinitionResponse] =
      js.native
    def getConnectorDefinitionVersion(
        params: GetConnectorDefinitionVersionRequest
    ): Request[GetConnectorDefinitionVersionResponse]                                           = js.native
    def getCoreDefinition(params: GetCoreDefinitionRequest): Request[GetCoreDefinitionResponse] = js.native
    def getCoreDefinitionVersion(params: GetCoreDefinitionVersionRequest): Request[GetCoreDefinitionVersionResponse] =
      js.native
    def getDeploymentStatus(params: GetDeploymentStatusRequest): Request[GetDeploymentStatusResponse] = js.native
    def getDeviceDefinition(params: GetDeviceDefinitionRequest): Request[GetDeviceDefinitionResponse] = js.native
    def getDeviceDefinitionVersion(
        params: GetDeviceDefinitionVersionRequest
    ): Request[GetDeviceDefinitionVersionResponse]                                                          = js.native
    def getFunctionDefinition(params: GetFunctionDefinitionRequest): Request[GetFunctionDefinitionResponse] = js.native
    def getFunctionDefinitionVersion(
        params: GetFunctionDefinitionVersionRequest
    ): Request[GetFunctionDefinitionVersionResponse]                 = js.native
    def getGroup(params: GetGroupRequest): Request[GetGroupResponse] = js.native
    def getGroupCertificateAuthority(
        params: GetGroupCertificateAuthorityRequest
    ): Request[GetGroupCertificateAuthorityResponse] = js.native
    def getGroupCertificateConfiguration(
        params: GetGroupCertificateConfigurationRequest
    ): Request[GetGroupCertificateConfigurationResponse]                                              = js.native
    def getGroupVersion(params: GetGroupVersionRequest): Request[GetGroupVersionResponse]             = js.native
    def getLoggerDefinition(params: GetLoggerDefinitionRequest): Request[GetLoggerDefinitionResponse] = js.native
    def getLoggerDefinitionVersion(
        params: GetLoggerDefinitionVersionRequest
    ): Request[GetLoggerDefinitionVersionResponse]                                                          = js.native
    def getResourceDefinition(params: GetResourceDefinitionRequest): Request[GetResourceDefinitionResponse] = js.native
    def getResourceDefinitionVersion(
        params: GetResourceDefinitionVersionRequest
    ): Request[GetResourceDefinitionVersionResponse] = js.native
    def getServiceRoleForAccount(params: GetServiceRoleForAccountRequest): Request[GetServiceRoleForAccountResponse] =
      js.native
    def getSubscriptionDefinition(
        params: GetSubscriptionDefinitionRequest
    ): Request[GetSubscriptionDefinitionResponse] = js.native
    def getSubscriptionDefinitionVersion(
        params: GetSubscriptionDefinitionVersionRequest
    ): Request[GetSubscriptionDefinitionVersionResponse] = js.native
    def listBulkDeploymentDetailedReports(
        params: ListBulkDeploymentDetailedReportsRequest
    ): Request[ListBulkDeploymentDetailedReportsResponse]                                             = js.native
    def listBulkDeployments(params: ListBulkDeploymentsRequest): Request[ListBulkDeploymentsResponse] = js.native
    def listConnectorDefinitionVersions(
        params: ListConnectorDefinitionVersionsRequest
    ): Request[ListConnectorDefinitionVersionsResponse] = js.native
    def listConnectorDefinitions(params: ListConnectorDefinitionsRequest): Request[ListConnectorDefinitionsResponse] =
      js.native
    def listCoreDefinitionVersions(
        params: ListCoreDefinitionVersionsRequest
    ): Request[ListCoreDefinitionVersionsResponse]                                                    = js.native
    def listCoreDefinitions(params: ListCoreDefinitionsRequest): Request[ListCoreDefinitionsResponse] = js.native
    def listDeployments(params: ListDeploymentsRequest): Request[ListDeploymentsResponse]             = js.native
    def listDeviceDefinitionVersions(
        params: ListDeviceDefinitionVersionsRequest
    ): Request[ListDeviceDefinitionVersionsResponse]                                                        = js.native
    def listDeviceDefinitions(params: ListDeviceDefinitionsRequest): Request[ListDeviceDefinitionsResponse] = js.native
    def listFunctionDefinitionVersions(
        params: ListFunctionDefinitionVersionsRequest
    ): Request[ListFunctionDefinitionVersionsResponse] = js.native
    def listFunctionDefinitions(params: ListFunctionDefinitionsRequest): Request[ListFunctionDefinitionsResponse] =
      js.native
    def listGroupCertificateAuthorities(
        params: ListGroupCertificateAuthoritiesRequest
    ): Request[ListGroupCertificateAuthoritiesResponse]                                         = js.native
    def listGroupVersions(params: ListGroupVersionsRequest): Request[ListGroupVersionsResponse] = js.native
    def listGroups(params: ListGroupsRequest): Request[ListGroupsResponse]                      = js.native
    def listLoggerDefinitionVersions(
        params: ListLoggerDefinitionVersionsRequest
    ): Request[ListLoggerDefinitionVersionsResponse]                                                        = js.native
    def listLoggerDefinitions(params: ListLoggerDefinitionsRequest): Request[ListLoggerDefinitionsResponse] = js.native
    def listResourceDefinitionVersions(
        params: ListResourceDefinitionVersionsRequest
    ): Request[ListResourceDefinitionVersionsResponse] = js.native
    def listResourceDefinitions(params: ListResourceDefinitionsRequest): Request[ListResourceDefinitionsResponse] =
      js.native
    def listSubscriptionDefinitionVersions(
        params: ListSubscriptionDefinitionVersionsRequest
    ): Request[ListSubscriptionDefinitionVersionsResponse] = js.native
    def listSubscriptionDefinitions(
        params: ListSubscriptionDefinitionsRequest
    ): Request[ListSubscriptionDefinitionsResponse]                                                   = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def resetDeployments(params: ResetDeploymentsRequest): Request[ResetDeploymentsResponse]          = js.native
    def startBulkDeployment(params: StartBulkDeploymentRequest): Request[StartBulkDeploymentResponse] = js.native
    def stopBulkDeployment(params: StopBulkDeploymentRequest): Request[StopBulkDeploymentResponse]    = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object]                                   = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object]                               = js.native
    def updateConnectivityInfo(params: UpdateConnectivityInfoRequest): Request[UpdateConnectivityInfoResponse] =
      js.native
    def updateConnectorDefinition(
        params: UpdateConnectorDefinitionRequest
    ): Request[UpdateConnectorDefinitionResponse]                                                        = js.native
    def updateCoreDefinition(params: UpdateCoreDefinitionRequest): Request[UpdateCoreDefinitionResponse] = js.native
    def updateDeviceDefinition(params: UpdateDeviceDefinitionRequest): Request[UpdateDeviceDefinitionResponse] =
      js.native
    def updateFunctionDefinition(params: UpdateFunctionDefinitionRequest): Request[UpdateFunctionDefinitionResponse] =
      js.native
    def updateGroup(params: UpdateGroupRequest): Request[UpdateGroupResponse] = js.native
    def updateGroupCertificateConfiguration(
        params: UpdateGroupCertificateConfigurationRequest
    ): Request[UpdateGroupCertificateConfigurationResponse] = js.native
    def updateLoggerDefinition(params: UpdateLoggerDefinitionRequest): Request[UpdateLoggerDefinitionResponse] =
      js.native
    def updateResourceDefinition(params: UpdateResourceDefinitionRequest): Request[UpdateResourceDefinitionResponse] =
      js.native
    def updateSubscriptionDefinition(
        params: UpdateSubscriptionDefinitionRequest
    ): Request[UpdateSubscriptionDefinitionResponse] = js.native
  }

  @js.native
  @Factory
  trait AssociateRoleToGroupRequest extends js.Object {
    var GroupId: __string
    var RoleArn: __string
  }

  @js.native
  @Factory
  trait AssociateRoleToGroupResponse extends js.Object {
    var AssociatedAt: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait AssociateServiceRoleToAccountRequest extends js.Object {
    var RoleArn: __string
  }

  @js.native
  @Factory
  trait AssociateServiceRoleToAccountResponse extends js.Object {
    var AssociatedAt: js.UndefOr[__string]
  }

  /**
    * Information about a bulk deployment. You cannot start a new bulk deployment while another one is still running or in a non-terminal state.
    */
  @js.native
  @Factory
  trait BulkDeployment extends js.Object {
    var BulkDeploymentArn: js.UndefOr[__string]
    var BulkDeploymentId: js.UndefOr[__string]
    var CreatedAt: js.UndefOr[__string]
  }

  /**
    * Relevant metrics on input records processed during bulk deployment.
    */
  @js.native
  @Factory
  trait BulkDeploymentMetrics extends js.Object {
    var InvalidInputRecords: js.UndefOr[__integer]
    var RecordsProcessed: js.UndefOr[__integer]
    var RetryAttempts: js.UndefOr[__integer]
  }

  /**
    * Information about an individual group deployment in a bulk deployment operation.
    */
  @js.native
  @Factory
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

  /**
    * The current status of the bulk deployment.
    */
  @js.native
  sealed trait BulkDeploymentStatus extends js.Any
  object BulkDeploymentStatus extends js.Object {
    val Initializing = "Initializing".asInstanceOf[BulkDeploymentStatus]
    val Running      = "Running".asInstanceOf[BulkDeploymentStatus]
    val Completed    = "Completed".asInstanceOf[BulkDeploymentStatus]
    val Stopping     = "Stopping".asInstanceOf[BulkDeploymentStatus]
    val Stopped      = "Stopped".asInstanceOf[BulkDeploymentStatus]
    val Failed       = "Failed".asInstanceOf[BulkDeploymentStatus]

    val values = js.Object.freeze(js.Array(Initializing, Running, Completed, Stopping, Stopped, Failed))
  }

  /**
    * Information about a Greengrass core's connectivity.
    */
  @js.native
  @Factory
  trait ConnectivityInfo extends js.Object {
    var HostAddress: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var Metadata: js.UndefOr[__string]
    var PortNumber: js.UndefOr[__integer]
  }

  /**
    * Information about a connector. Connectors run on the Greengrass core and contain built-in integration with local infrastructure, device protocols, AWS, and other cloud services.
    */
  @js.native
  @Factory
  trait Connector extends js.Object {
    var ConnectorArn: __string
    var Id: __string
    var Parameters: js.UndefOr[__mapOf__string]
  }

  /**
    * Information about the connector definition version, which is a container for connectors.
    */
  @js.native
  @Factory
  trait ConnectorDefinitionVersion extends js.Object {
    var Connectors: js.UndefOr[__listOfConnector]
  }

  /**
    * Information about a core.
    */
  @js.native
  @Factory
  trait Core extends js.Object {
    var CertificateArn: __string
    var Id: __string
    var ThingArn: __string
    var SyncShadow: js.UndefOr[__boolean]
  }

  /**
    * Information about a core definition version.
    */
  @js.native
  @Factory
  trait CoreDefinitionVersion extends js.Object {
    var Cores: js.UndefOr[__listOfCore]
  }

  @js.native
  @Factory
  trait CreateConnectorDefinitionRequest extends js.Object {
    var AmznClientToken: js.UndefOr[__string]
    var InitialVersion: js.UndefOr[ConnectorDefinitionVersion]
    var Name: js.UndefOr[__string]
    var tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait CreateConnectorDefinitionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var LastUpdatedTimestamp: js.UndefOr[__string]
    var LatestVersion: js.UndefOr[__string]
    var LatestVersionArn: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait CreateConnectorDefinitionVersionRequest extends js.Object {
    var ConnectorDefinitionId: __string
    var AmznClientToken: js.UndefOr[__string]
    var Connectors: js.UndefOr[__listOfConnector]
  }

  @js.native
  @Factory
  trait CreateConnectorDefinitionVersionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  /**
    * Information needed to create a core definition.
    */
  @js.native
  @Factory
  trait CreateCoreDefinitionRequest extends js.Object {
    var AmznClientToken: js.UndefOr[__string]
    var InitialVersion: js.UndefOr[CoreDefinitionVersion]
    var Name: js.UndefOr[__string]
    var tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait CreateCoreDefinitionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var LastUpdatedTimestamp: js.UndefOr[__string]
    var LatestVersion: js.UndefOr[__string]
    var LatestVersionArn: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait CreateCoreDefinitionVersionRequest extends js.Object {
    var CoreDefinitionId: __string
    var AmznClientToken: js.UndefOr[__string]
    var Cores: js.UndefOr[__listOfCore]
  }

  @js.native
  @Factory
  trait CreateCoreDefinitionVersionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait CreateDeploymentRequest extends js.Object {
    var DeploymentType: DeploymentType
    var GroupId: __string
    var AmznClientToken: js.UndefOr[__string]
    var DeploymentId: js.UndefOr[__string]
    var GroupVersionId: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait CreateDeploymentResponse extends js.Object {
    var DeploymentArn: js.UndefOr[__string]
    var DeploymentId: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait CreateDeviceDefinitionRequest extends js.Object {
    var AmznClientToken: js.UndefOr[__string]
    var InitialVersion: js.UndefOr[DeviceDefinitionVersion]
    var Name: js.UndefOr[__string]
    var tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait CreateDeviceDefinitionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var LastUpdatedTimestamp: js.UndefOr[__string]
    var LatestVersion: js.UndefOr[__string]
    var LatestVersionArn: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait CreateDeviceDefinitionVersionRequest extends js.Object {
    var DeviceDefinitionId: __string
    var AmznClientToken: js.UndefOr[__string]
    var Devices: js.UndefOr[__listOfDevice]
  }

  @js.native
  @Factory
  trait CreateDeviceDefinitionVersionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait CreateFunctionDefinitionRequest extends js.Object {
    var AmznClientToken: js.UndefOr[__string]
    var InitialVersion: js.UndefOr[FunctionDefinitionVersion]
    var Name: js.UndefOr[__string]
    var tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait CreateFunctionDefinitionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var LastUpdatedTimestamp: js.UndefOr[__string]
    var LatestVersion: js.UndefOr[__string]
    var LatestVersionArn: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
  }

  /**
    * Information needed to create a function definition version.
    */
  @js.native
  @Factory
  trait CreateFunctionDefinitionVersionRequest extends js.Object {
    var FunctionDefinitionId: __string
    var AmznClientToken: js.UndefOr[__string]
    var DefaultConfig: js.UndefOr[FunctionDefaultConfig]
    var Functions: js.UndefOr[__listOfFunction]
  }

  @js.native
  @Factory
  trait CreateFunctionDefinitionVersionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait CreateGroupCertificateAuthorityRequest extends js.Object {
    var GroupId: __string
    var AmznClientToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait CreateGroupCertificateAuthorityResponse extends js.Object {
    var GroupCertificateAuthorityArn: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait CreateGroupRequest extends js.Object {
    var AmznClientToken: js.UndefOr[__string]
    var InitialVersion: js.UndefOr[GroupVersion]
    var Name: js.UndefOr[__string]
    var tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait CreateGroupResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var LastUpdatedTimestamp: js.UndefOr[__string]
    var LatestVersion: js.UndefOr[__string]
    var LatestVersionArn: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreateGroupVersionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait CreateLoggerDefinitionRequest extends js.Object {
    var AmznClientToken: js.UndefOr[__string]
    var InitialVersion: js.UndefOr[LoggerDefinitionVersion]
    var Name: js.UndefOr[__string]
    var tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait CreateLoggerDefinitionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var LastUpdatedTimestamp: js.UndefOr[__string]
    var LatestVersion: js.UndefOr[__string]
    var LatestVersionArn: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait CreateLoggerDefinitionVersionRequest extends js.Object {
    var LoggerDefinitionId: __string
    var AmznClientToken: js.UndefOr[__string]
    var Loggers: js.UndefOr[__listOfLogger]
  }

  @js.native
  @Factory
  trait CreateLoggerDefinitionVersionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait CreateResourceDefinitionRequest extends js.Object {
    var AmznClientToken: js.UndefOr[__string]
    var InitialVersion: js.UndefOr[ResourceDefinitionVersion]
    var Name: js.UndefOr[__string]
    var tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait CreateResourceDefinitionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var LastUpdatedTimestamp: js.UndefOr[__string]
    var LatestVersion: js.UndefOr[__string]
    var LatestVersionArn: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait CreateResourceDefinitionVersionRequest extends js.Object {
    var ResourceDefinitionId: __string
    var AmznClientToken: js.UndefOr[__string]
    var Resources: js.UndefOr[__listOfResource]
  }

  @js.native
  @Factory
  trait CreateResourceDefinitionVersionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait CreateSoftwareUpdateJobRequest extends js.Object {
    var S3UrlSignerRole: S3UrlSignerRole
    var SoftwareToUpdate: SoftwareToUpdate
    var UpdateTargets: UpdateTargets
    var UpdateTargetsArchitecture: UpdateTargetsArchitecture
    var UpdateTargetsOperatingSystem: UpdateTargetsOperatingSystem
    var AmznClientToken: js.UndefOr[__string]
    var UpdateAgentLogLevel: js.UndefOr[UpdateAgentLogLevel]
  }

  @js.native
  @Factory
  trait CreateSoftwareUpdateJobResponse extends js.Object {
    var IotJobArn: js.UndefOr[__string]
    var IotJobId: js.UndefOr[__string]
    var PlatformSoftwareVersion: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait CreateSubscriptionDefinitionRequest extends js.Object {
    var AmznClientToken: js.UndefOr[__string]
    var InitialVersion: js.UndefOr[SubscriptionDefinitionVersion]
    var Name: js.UndefOr[__string]
    var tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait CreateSubscriptionDefinitionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var LastUpdatedTimestamp: js.UndefOr[__string]
    var LatestVersion: js.UndefOr[__string]
    var LatestVersionArn: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait CreateSubscriptionDefinitionVersionRequest extends js.Object {
    var SubscriptionDefinitionId: __string
    var AmznClientToken: js.UndefOr[__string]
    var Subscriptions: js.UndefOr[__listOfSubscription]
  }

  @js.native
  @Factory
  trait CreateSubscriptionDefinitionVersionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  /**
    * Information about a definition.
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait DeleteConnectorDefinitionRequest extends js.Object {
    var ConnectorDefinitionId: __string
  }

  @js.native
  @Factory
  trait DeleteConnectorDefinitionResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteCoreDefinitionRequest extends js.Object {
    var CoreDefinitionId: __string
  }

  @js.native
  @Factory
  trait DeleteCoreDefinitionResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteDeviceDefinitionRequest extends js.Object {
    var DeviceDefinitionId: __string
  }

  @js.native
  @Factory
  trait DeleteDeviceDefinitionResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteFunctionDefinitionRequest extends js.Object {
    var FunctionDefinitionId: __string
  }

  @js.native
  @Factory
  trait DeleteFunctionDefinitionResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteGroupRequest extends js.Object {
    var GroupId: __string
  }

  @js.native
  @Factory
  trait DeleteGroupResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteLoggerDefinitionRequest extends js.Object {
    var LoggerDefinitionId: __string
  }

  @js.native
  @Factory
  trait DeleteLoggerDefinitionResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteResourceDefinitionRequest extends js.Object {
    var ResourceDefinitionId: __string
  }

  @js.native
  @Factory
  trait DeleteResourceDefinitionResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteSubscriptionDefinitionRequest extends js.Object {
    var SubscriptionDefinitionId: __string
  }

  @js.native
  @Factory
  trait DeleteSubscriptionDefinitionResponse extends js.Object {}

  /**
    * Information about a deployment.
    */
  @js.native
  @Factory
  trait Deployment extends js.Object {
    var CreatedAt: js.UndefOr[__string]
    var DeploymentArn: js.UndefOr[__string]
    var DeploymentId: js.UndefOr[__string]
    var DeploymentType: js.UndefOr[DeploymentType]
    var GroupArn: js.UndefOr[__string]
  }

  /**
    * The type of deployment. When used for ''CreateDeployment'', only ''NewDeployment'' and ''Redeployment'' are valid.
    */
  @js.native
  sealed trait DeploymentType extends js.Any
  object DeploymentType extends js.Object {
    val NewDeployment        = "NewDeployment".asInstanceOf[DeploymentType]
    val Redeployment         = "Redeployment".asInstanceOf[DeploymentType]
    val ResetDeployment      = "ResetDeployment".asInstanceOf[DeploymentType]
    val ForceResetDeployment = "ForceResetDeployment".asInstanceOf[DeploymentType]

    val values = js.Object.freeze(js.Array(NewDeployment, Redeployment, ResetDeployment, ForceResetDeployment))
  }

  /**
    * Information about a device.
    */
  @js.native
  @Factory
  trait Device extends js.Object {
    var CertificateArn: __string
    var Id: __string
    var ThingArn: __string
    var SyncShadow: js.UndefOr[__boolean]
  }

  /**
    * Information about a device definition version.
    */
  @js.native
  @Factory
  trait DeviceDefinitionVersion extends js.Object {
    var Devices: js.UndefOr[__listOfDevice]
  }

  @js.native
  @Factory
  trait DisassociateRoleFromGroupRequest extends js.Object {
    var GroupId: __string
  }

  @js.native
  @Factory
  trait DisassociateRoleFromGroupResponse extends js.Object {
    var DisassociatedAt: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait DisassociateServiceRoleFromAccountRequest extends js.Object {}

  @js.native
  @Factory
  trait DisassociateServiceRoleFromAccountResponse extends js.Object {
    var DisassociatedAt: js.UndefOr[__string]
  }

  @js.native
  sealed trait EncodingType extends js.Any
  object EncodingType extends js.Object {
    val binary = "binary".asInstanceOf[EncodingType]
    val json   = "json".asInstanceOf[EncodingType]

    val values = js.Object.freeze(js.Array(binary, json))
  }

  /**
    * Details about the error.
    */
  @js.native
  @Factory
  trait ErrorDetail extends js.Object {
    var DetailedErrorCode: js.UndefOr[__string]
    var DetailedErrorMessage: js.UndefOr[__string]
  }

  /**
    * Information about a Lambda function.
    */
  @js.native
  @Factory
  trait Function extends js.Object {
    var Id: __string
    var FunctionArn: js.UndefOr[__string]
    var FunctionConfiguration: js.UndefOr[FunctionConfiguration]
  }

  /**
    * The configuration of the Lambda function.
    */
  @js.native
  @Factory
  trait FunctionConfiguration extends js.Object {
    var EncodingType: js.UndefOr[EncodingType]
    var Environment: js.UndefOr[FunctionConfigurationEnvironment]
    var ExecArgs: js.UndefOr[__string]
    var Executable: js.UndefOr[__string]
    var MemorySize: js.UndefOr[__integer]
    var Pinned: js.UndefOr[__boolean]
    var Timeout: js.UndefOr[__integer]
  }

  /**
    * The environment configuration of the function.
    */
  @js.native
  @Factory
  trait FunctionConfigurationEnvironment extends js.Object {
    var AccessSysfs: js.UndefOr[__boolean]
    var Execution: js.UndefOr[FunctionExecutionConfig]
    var ResourceAccessPolicies: js.UndefOr[__listOfResourceAccessPolicy]
    var Variables: js.UndefOr[__mapOf__string]
  }

  /**
    * The default configuration that applies to all Lambda functions in the group. Individual Lambda functions can override these settings.
    */
  @js.native
  @Factory
  trait FunctionDefaultConfig extends js.Object {
    var Execution: js.UndefOr[FunctionDefaultExecutionConfig]
  }

  /**
    * Configuration information that specifies how a Lambda function runs.
    */
  @js.native
  @Factory
  trait FunctionDefaultExecutionConfig extends js.Object {
    var IsolationMode: js.UndefOr[FunctionIsolationMode]
    var RunAs: js.UndefOr[FunctionRunAsConfig]
  }

  /**
    * Information about a function definition version.
    */
  @js.native
  @Factory
  trait FunctionDefinitionVersion extends js.Object {
    var DefaultConfig: js.UndefOr[FunctionDefaultConfig]
    var Functions: js.UndefOr[__listOfFunction]
  }

  /**
    * Configuration information that specifies how a Lambda function runs.
    */
  @js.native
  @Factory
  trait FunctionExecutionConfig extends js.Object {
    var IsolationMode: js.UndefOr[FunctionIsolationMode]
    var RunAs: js.UndefOr[FunctionRunAsConfig]
  }

  /**
    * Specifies whether the Lambda function runs in a Greengrass container (default) or without containerization. Unless your scenario requires that you run without containerization, we recommend that you run in a Greengrass container. Omit this value to run the Lambda function with the default containerization for the group.
    */
  @js.native
  sealed trait FunctionIsolationMode extends js.Any
  object FunctionIsolationMode extends js.Object {
    val GreengrassContainer = "GreengrassContainer".asInstanceOf[FunctionIsolationMode]
    val NoContainer         = "NoContainer".asInstanceOf[FunctionIsolationMode]

    val values = js.Object.freeze(js.Array(GreengrassContainer, NoContainer))
  }

  /**
    * Specifies the user and group whose permissions are used when running the Lambda function. You can specify one or both values to override the default values. We recommend that you avoid running as root unless absolutely necessary to minimize the risk of unintended changes or malicious attacks. To run as root, you must set ''IsolationMode'' to ''NoContainer'' and update config.json in ''greengrass-root/config'' to set ''allowFunctionsToRunAsRoot'' to ''yes''.
    */
  @js.native
  @Factory
  trait FunctionRunAsConfig extends js.Object {
    var Gid: js.UndefOr[__integer]
    var Uid: js.UndefOr[__integer]
  }

  @js.native
  @Factory
  trait GetAssociatedRoleRequest extends js.Object {
    var GroupId: __string
  }

  @js.native
  @Factory
  trait GetAssociatedRoleResponse extends js.Object {
    var AssociatedAt: js.UndefOr[__string]
    var RoleArn: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetBulkDeploymentStatusRequest extends js.Object {
    var BulkDeploymentId: __string
  }

  @js.native
  @Factory
  trait GetBulkDeploymentStatusResponse extends js.Object {
    var BulkDeploymentMetrics: js.UndefOr[BulkDeploymentMetrics]
    var BulkDeploymentStatus: js.UndefOr[BulkDeploymentStatus]
    var CreatedAt: js.UndefOr[__string]
    var ErrorDetails: js.UndefOr[ErrorDetails]
    var ErrorMessage: js.UndefOr[__string]
    var tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait GetConnectivityInfoRequest extends js.Object {
    var ThingName: __string
  }

  @js.native
  @Factory
  trait GetConnectivityInfoResponse extends js.Object {
    var ConnectivityInfo: js.UndefOr[__listOfConnectivityInfo]
    var Message: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetConnectorDefinitionRequest extends js.Object {
    var ConnectorDefinitionId: __string
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait GetConnectorDefinitionVersionRequest extends js.Object {
    var ConnectorDefinitionId: __string
    var ConnectorDefinitionVersionId: __string
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetConnectorDefinitionVersionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Definition: js.UndefOr[ConnectorDefinitionVersion]
    var Id: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetCoreDefinitionRequest extends js.Object {
    var CoreDefinitionId: __string
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait GetCoreDefinitionVersionRequest extends js.Object {
    var CoreDefinitionId: __string
    var CoreDefinitionVersionId: __string
  }

  @js.native
  @Factory
  trait GetCoreDefinitionVersionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Definition: js.UndefOr[CoreDefinitionVersion]
    var Id: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetDeploymentStatusRequest extends js.Object {
    var DeploymentId: __string
    var GroupId: __string
  }

  @js.native
  @Factory
  trait GetDeploymentStatusResponse extends js.Object {
    var DeploymentStatus: js.UndefOr[__string]
    var DeploymentType: js.UndefOr[DeploymentType]
    var ErrorDetails: js.UndefOr[ErrorDetails]
    var ErrorMessage: js.UndefOr[__string]
    var UpdatedAt: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetDeviceDefinitionRequest extends js.Object {
    var DeviceDefinitionId: __string
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait GetDeviceDefinitionVersionRequest extends js.Object {
    var DeviceDefinitionId: __string
    var DeviceDefinitionVersionId: __string
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetDeviceDefinitionVersionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Definition: js.UndefOr[DeviceDefinitionVersion]
    var Id: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetFunctionDefinitionRequest extends js.Object {
    var FunctionDefinitionId: __string
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait GetFunctionDefinitionVersionRequest extends js.Object {
    var FunctionDefinitionId: __string
    var FunctionDefinitionVersionId: __string
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetFunctionDefinitionVersionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Definition: js.UndefOr[FunctionDefinitionVersion]
    var Id: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetGroupCertificateAuthorityRequest extends js.Object {
    var CertificateAuthorityId: __string
    var GroupId: __string
  }

  @js.native
  @Factory
  trait GetGroupCertificateAuthorityResponse extends js.Object {
    var GroupCertificateAuthorityArn: js.UndefOr[__string]
    var GroupCertificateAuthorityId: js.UndefOr[__string]
    var PemEncodedCertificate: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetGroupCertificateConfigurationRequest extends js.Object {
    var GroupId: __string
  }

  @js.native
  @Factory
  trait GetGroupCertificateConfigurationResponse extends js.Object {
    var CertificateAuthorityExpiryInMilliseconds: js.UndefOr[__string]
    var CertificateExpiryInMilliseconds: js.UndefOr[__string]
    var GroupId: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetGroupRequest extends js.Object {
    var GroupId: __string
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait GetGroupVersionRequest extends js.Object {
    var GroupId: __string
    var GroupVersionId: __string
  }

  @js.native
  @Factory
  trait GetGroupVersionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Definition: js.UndefOr[GroupVersion]
    var Id: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetLoggerDefinitionRequest extends js.Object {
    var LoggerDefinitionId: __string
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait GetLoggerDefinitionVersionRequest extends js.Object {
    var LoggerDefinitionId: __string
    var LoggerDefinitionVersionId: __string
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetLoggerDefinitionVersionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Definition: js.UndefOr[LoggerDefinitionVersion]
    var Id: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetResourceDefinitionRequest extends js.Object {
    var ResourceDefinitionId: __string
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait GetResourceDefinitionVersionRequest extends js.Object {
    var ResourceDefinitionId: __string
    var ResourceDefinitionVersionId: __string
  }

  @js.native
  @Factory
  trait GetResourceDefinitionVersionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Definition: js.UndefOr[ResourceDefinitionVersion]
    var Id: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetServiceRoleForAccountRequest extends js.Object {}

  @js.native
  @Factory
  trait GetServiceRoleForAccountResponse extends js.Object {
    var AssociatedAt: js.UndefOr[__string]
    var RoleArn: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetSubscriptionDefinitionRequest extends js.Object {
    var SubscriptionDefinitionId: __string
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait GetSubscriptionDefinitionVersionRequest extends js.Object {
    var SubscriptionDefinitionId: __string
    var SubscriptionDefinitionVersionId: __string
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetSubscriptionDefinitionVersionResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Definition: js.UndefOr[SubscriptionDefinitionVersion]
    var Id: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  /**
    * Information about a certificate authority for a group.
    */
  @js.native
  @Factory
  trait GroupCertificateAuthorityProperties extends js.Object {
    var GroupCertificateAuthorityArn: js.UndefOr[__string]
    var GroupCertificateAuthorityId: js.UndefOr[__string]
  }

  /**
    * Information about a group.
    */
  @js.native
  @Factory
  trait GroupInformation extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var LastUpdatedTimestamp: js.UndefOr[__string]
    var LatestVersion: js.UndefOr[__string]
    var LatestVersionArn: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
  }

  /**
    * Group owner related settings for local resources.
    */
  @js.native
  @Factory
  trait GroupOwnerSetting extends js.Object {
    var AutoAddGroupOwner: js.UndefOr[__boolean]
    var GroupOwner: js.UndefOr[__string]
  }

  /**
    * Information about a group version.
    */
  @js.native
  @Factory
  trait GroupVersion extends js.Object {
    var ConnectorDefinitionVersionArn: js.UndefOr[__string]
    var CoreDefinitionVersionArn: js.UndefOr[__string]
    var DeviceDefinitionVersionArn: js.UndefOr[__string]
    var FunctionDefinitionVersionArn: js.UndefOr[__string]
    var LoggerDefinitionVersionArn: js.UndefOr[__string]
    var ResourceDefinitionVersionArn: js.UndefOr[__string]
    var SubscriptionDefinitionVersionArn: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListBulkDeploymentDetailedReportsRequest extends js.Object {
    var BulkDeploymentId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListBulkDeploymentDetailedReportsResponse extends js.Object {
    var Deployments: js.UndefOr[BulkDeploymentResults]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListBulkDeploymentsRequest extends js.Object {
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListBulkDeploymentsResponse extends js.Object {
    var BulkDeployments: js.UndefOr[BulkDeployments]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListConnectorDefinitionVersionsRequest extends js.Object {
    var ConnectorDefinitionId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListConnectorDefinitionVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Versions: js.UndefOr[__listOfVersionInformation]
  }

  @js.native
  @Factory
  trait ListConnectorDefinitionsRequest extends js.Object {
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListConnectorDefinitionsResponse extends js.Object {
    var Definitions: js.UndefOr[__listOfDefinitionInformation]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListCoreDefinitionVersionsRequest extends js.Object {
    var CoreDefinitionId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListCoreDefinitionVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Versions: js.UndefOr[__listOfVersionInformation]
  }

  @js.native
  @Factory
  trait ListCoreDefinitionsRequest extends js.Object {
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListCoreDefinitionsResponse extends js.Object {
    var Definitions: js.UndefOr[__listOfDefinitionInformation]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListDeploymentsRequest extends js.Object {
    var GroupId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListDeploymentsResponse extends js.Object {
    var Deployments: js.UndefOr[Deployments]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListDeviceDefinitionVersionsRequest extends js.Object {
    var DeviceDefinitionId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListDeviceDefinitionVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Versions: js.UndefOr[__listOfVersionInformation]
  }

  @js.native
  @Factory
  trait ListDeviceDefinitionsRequest extends js.Object {
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListDeviceDefinitionsResponse extends js.Object {
    var Definitions: js.UndefOr[__listOfDefinitionInformation]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListFunctionDefinitionVersionsRequest extends js.Object {
    var FunctionDefinitionId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListFunctionDefinitionVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Versions: js.UndefOr[__listOfVersionInformation]
  }

  @js.native
  @Factory
  trait ListFunctionDefinitionsRequest extends js.Object {
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListFunctionDefinitionsResponse extends js.Object {
    var Definitions: js.UndefOr[__listOfDefinitionInformation]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListGroupCertificateAuthoritiesRequest extends js.Object {
    var GroupId: __string
  }

  @js.native
  @Factory
  trait ListGroupCertificateAuthoritiesResponse extends js.Object {
    var GroupCertificateAuthorities: js.UndefOr[__listOfGroupCertificateAuthorityProperties]
  }

  @js.native
  @Factory
  trait ListGroupVersionsRequest extends js.Object {
    var GroupId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListGroupVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Versions: js.UndefOr[__listOfVersionInformation]
  }

  @js.native
  @Factory
  trait ListGroupsRequest extends js.Object {
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListGroupsResponse extends js.Object {
    var Groups: js.UndefOr[__listOfGroupInformation]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListLoggerDefinitionVersionsRequest extends js.Object {
    var LoggerDefinitionId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListLoggerDefinitionVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Versions: js.UndefOr[__listOfVersionInformation]
  }

  @js.native
  @Factory
  trait ListLoggerDefinitionsRequest extends js.Object {
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListLoggerDefinitionsResponse extends js.Object {
    var Definitions: js.UndefOr[__listOfDefinitionInformation]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListResourceDefinitionVersionsRequest extends js.Object {
    var ResourceDefinitionId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListResourceDefinitionVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Versions: js.UndefOr[__listOfVersionInformation]
  }

  @js.native
  @Factory
  trait ListResourceDefinitionsRequest extends js.Object {
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListResourceDefinitionsResponse extends js.Object {
    var Definitions: js.UndefOr[__listOfDefinitionInformation]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListSubscriptionDefinitionVersionsRequest extends js.Object {
    var SubscriptionDefinitionId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListSubscriptionDefinitionVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Versions: js.UndefOr[__listOfVersionInformation]
  }

  @js.native
  @Factory
  trait ListSubscriptionDefinitionsRequest extends js.Object {
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListSubscriptionDefinitionsResponse extends js.Object {
    var Definitions: js.UndefOr[__listOfDefinitionInformation]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: __string
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[Tags]
  }

  /**
    * Attributes that define a local device resource.
    */
  @js.native
  @Factory
  trait LocalDeviceResourceData extends js.Object {
    var GroupOwnerSetting: js.UndefOr[GroupOwnerSetting]
    var SourcePath: js.UndefOr[__string]
  }

  /**
    * Attributes that define a local volume resource.
    */
  @js.native
  @Factory
  trait LocalVolumeResourceData extends js.Object {
    var DestinationPath: js.UndefOr[__string]
    var GroupOwnerSetting: js.UndefOr[GroupOwnerSetting]
    var SourcePath: js.UndefOr[__string]
  }

  /**
    * Information about a logger
    */
  @js.native
  @Factory
  trait Logger extends js.Object {
    var Component: LoggerComponent
    var Id: __string
    var Level: LoggerLevel
    var Type: LoggerType
    var Space: js.UndefOr[__integer]
  }

  @js.native
  sealed trait LoggerComponent extends js.Any
  object LoggerComponent extends js.Object {
    val GreengrassSystem = "GreengrassSystem".asInstanceOf[LoggerComponent]
    val Lambda           = "Lambda".asInstanceOf[LoggerComponent]

    val values = js.Object.freeze(js.Array(GreengrassSystem, Lambda))
  }

  /**
    * Information about a logger definition version.
    */
  @js.native
  @Factory
  trait LoggerDefinitionVersion extends js.Object {
    var Loggers: js.UndefOr[__listOfLogger]
  }

  @js.native
  sealed trait LoggerLevel extends js.Any
  object LoggerLevel extends js.Object {
    val DEBUG = "DEBUG".asInstanceOf[LoggerLevel]
    val INFO  = "INFO".asInstanceOf[LoggerLevel]
    val WARN  = "WARN".asInstanceOf[LoggerLevel]
    val ERROR = "ERROR".asInstanceOf[LoggerLevel]
    val FATAL = "FATAL".asInstanceOf[LoggerLevel]

    val values = js.Object.freeze(js.Array(DEBUG, INFO, WARN, ERROR, FATAL))
  }

  @js.native
  sealed trait LoggerType extends js.Any
  object LoggerType extends js.Object {
    val FileSystem    = "FileSystem".asInstanceOf[LoggerType]
    val AWSCloudWatch = "AWSCloudWatch".asInstanceOf[LoggerType]

    val values = js.Object.freeze(js.Array(FileSystem, AWSCloudWatch))
  }

  /**
    * The type of permission a function has to access a resource.
    */
  @js.native
  sealed trait Permission extends js.Any
  object Permission extends js.Object {
    val ro = "ro".asInstanceOf[Permission]
    val rw = "rw".asInstanceOf[Permission]

    val values = js.Object.freeze(js.Array(ro, rw))
  }

  /**
    * Information needed to reset deployments.
    */
  @js.native
  @Factory
  trait ResetDeploymentsRequest extends js.Object {
    var GroupId: __string
    var AmznClientToken: js.UndefOr[__string]
    var Force: js.UndefOr[__boolean]
  }

  @js.native
  @Factory
  trait ResetDeploymentsResponse extends js.Object {
    var DeploymentArn: js.UndefOr[__string]
    var DeploymentId: js.UndefOr[__string]
  }

  /**
    * Information about a resource.
    */
  @js.native
  @Factory
  trait Resource extends js.Object {
    var Id: __string
    var Name: __string
    var ResourceDataContainer: ResourceDataContainer
  }

  /**
    * A policy used by the function to access a resource.
    */
  @js.native
  @Factory
  trait ResourceAccessPolicy extends js.Object {
    var ResourceId: __string
    var Permission: js.UndefOr[Permission]
  }

  /**
    * A container for resource data. The container takes only one of the following supported resource data types: ''LocalDeviceResourceData'', ''LocalVolumeResourceData'', ''SageMakerMachineLearningModelResourceData'', ''S3MachineLearningModelResourceData'', ''SecretsManagerSecretResourceData''.
    */
  @js.native
  @Factory
  trait ResourceDataContainer extends js.Object {
    var LocalDeviceResourceData: js.UndefOr[LocalDeviceResourceData]
    var LocalVolumeResourceData: js.UndefOr[LocalVolumeResourceData]
    var S3MachineLearningModelResourceData: js.UndefOr[S3MachineLearningModelResourceData]
    var SageMakerMachineLearningModelResourceData: js.UndefOr[SageMakerMachineLearningModelResourceData]
    var SecretsManagerSecretResourceData: js.UndefOr[SecretsManagerSecretResourceData]
  }

  /**
    * Information about a resource definition version.
    */
  @js.native
  @Factory
  trait ResourceDefinitionVersion extends js.Object {
    var Resources: js.UndefOr[__listOfResource]
  }

  /**
    * The owner setting for downloaded machine learning resources.
    */
  @js.native
  @Factory
  trait ResourceDownloadOwnerSetting extends js.Object {
    var GroupOwner: __string
    var GroupPermission: Permission
  }

  /**
    * Attributes that define an Amazon S3 machine learning resource.
    */
  @js.native
  @Factory
  trait S3MachineLearningModelResourceData extends js.Object {
    var DestinationPath: js.UndefOr[__string]
    var OwnerSetting: js.UndefOr[ResourceDownloadOwnerSetting]
    var S3Uri: js.UndefOr[__string]
  }

  /**
    * Attributes that define an Amazon SageMaker machine learning resource.
    */
  @js.native
  @Factory
  trait SageMakerMachineLearningModelResourceData extends js.Object {
    var DestinationPath: js.UndefOr[__string]
    var OwnerSetting: js.UndefOr[ResourceDownloadOwnerSetting]
    var SageMakerJobArn: js.UndefOr[__string]
  }

  /**
    * Attributes that define a secret resource, which references a secret from AWS Secrets Manager. AWS IoT Greengrass stores a local, encrypted copy of the secret on the Greengrass core, where it can be securely accessed by connectors and Lambda functions.
    */
  @js.native
  @Factory
  trait SecretsManagerSecretResourceData extends js.Object {
    var ARN: js.UndefOr[__string]
    var AdditionalStagingLabelsToDownload: js.UndefOr[__listOf__string]
  }

  /**
    * The piece of software on the Greengrass core that will be updated.
    */
  @js.native
  sealed trait SoftwareToUpdate extends js.Any
  object SoftwareToUpdate extends js.Object {
    val core      = "core".asInstanceOf[SoftwareToUpdate]
    val ota_agent = "ota_agent".asInstanceOf[SoftwareToUpdate]

    val values = js.Object.freeze(js.Array(core, ota_agent))
  }

  @js.native
  @Factory
  trait StartBulkDeploymentRequest extends js.Object {
    var ExecutionRoleArn: __string
    var InputFileUri: __string
    var AmznClientToken: js.UndefOr[__string]
    var tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait StartBulkDeploymentResponse extends js.Object {
    var BulkDeploymentArn: js.UndefOr[__string]
    var BulkDeploymentId: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait StopBulkDeploymentRequest extends js.Object {
    var BulkDeploymentId: __string
  }

  @js.native
  @Factory
  trait StopBulkDeploymentResponse extends js.Object {}

  /**
    * Information about a subscription.
    */
  @js.native
  @Factory
  trait Subscription extends js.Object {
    var Id: __string
    var Source: __string
    var Subject: __string
    var Target: __string
  }

  /**
    * Information about a subscription definition version.
    */
  @js.native
  @Factory
  trait SubscriptionDefinitionVersion extends js.Object {
    var Subscriptions: js.UndefOr[__listOfSubscription]
  }

  /**
    * A map of the key-value pairs for the resource tag.
    */
  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceArn: __string
    var tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: __string
    var TagKeys: __listOf__string
  }

  /**
    * The minimum level of log statements that should be logged by the OTA Agent during an update.
    */
  @js.native
  sealed trait UpdateAgentLogLevel extends js.Any
  object UpdateAgentLogLevel extends js.Object {
    val NONE    = "NONE".asInstanceOf[UpdateAgentLogLevel]
    val TRACE   = "TRACE".asInstanceOf[UpdateAgentLogLevel]
    val DEBUG   = "DEBUG".asInstanceOf[UpdateAgentLogLevel]
    val VERBOSE = "VERBOSE".asInstanceOf[UpdateAgentLogLevel]
    val INFO    = "INFO".asInstanceOf[UpdateAgentLogLevel]
    val WARN    = "WARN".asInstanceOf[UpdateAgentLogLevel]
    val ERROR   = "ERROR".asInstanceOf[UpdateAgentLogLevel]
    val FATAL   = "FATAL".asInstanceOf[UpdateAgentLogLevel]

    val values = js.Object.freeze(js.Array(NONE, TRACE, DEBUG, VERBOSE, INFO, WARN, ERROR, FATAL))
  }

  /**
    * Connectivity information.
    */
  @js.native
  @Factory
  trait UpdateConnectivityInfoRequest extends js.Object {
    var ThingName: __string
    var ConnectivityInfo: js.UndefOr[__listOfConnectivityInfo]
  }

  @js.native
  @Factory
  trait UpdateConnectivityInfoResponse extends js.Object {
    var Message: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait UpdateConnectorDefinitionRequest extends js.Object {
    var ConnectorDefinitionId: __string
    var Name: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait UpdateConnectorDefinitionResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateCoreDefinitionRequest extends js.Object {
    var CoreDefinitionId: __string
    var Name: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait UpdateCoreDefinitionResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateDeviceDefinitionRequest extends js.Object {
    var DeviceDefinitionId: __string
    var Name: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait UpdateDeviceDefinitionResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateFunctionDefinitionRequest extends js.Object {
    var FunctionDefinitionId: __string
    var Name: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait UpdateFunctionDefinitionResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateGroupCertificateConfigurationRequest extends js.Object {
    var GroupId: __string
    var CertificateExpiryInMilliseconds: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait UpdateGroupCertificateConfigurationResponse extends js.Object {
    var CertificateAuthorityExpiryInMilliseconds: js.UndefOr[__string]
    var CertificateExpiryInMilliseconds: js.UndefOr[__string]
    var GroupId: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait UpdateGroupRequest extends js.Object {
    var GroupId: __string
    var Name: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait UpdateGroupResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateLoggerDefinitionRequest extends js.Object {
    var LoggerDefinitionId: __string
    var Name: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait UpdateLoggerDefinitionResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateResourceDefinitionRequest extends js.Object {
    var ResourceDefinitionId: __string
    var Name: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait UpdateResourceDefinitionResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateSubscriptionDefinitionRequest extends js.Object {
    var SubscriptionDefinitionId: __string
    var Name: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait UpdateSubscriptionDefinitionResponse extends js.Object {}

  /**
    * The architecture of the cores which are the targets of an update.
    */
  @js.native
  sealed trait UpdateTargetsArchitecture extends js.Any
  object UpdateTargetsArchitecture extends js.Object {
    val armv6l  = "armv6l".asInstanceOf[UpdateTargetsArchitecture]
    val armv7l  = "armv7l".asInstanceOf[UpdateTargetsArchitecture]
    val x86_64  = "x86_64".asInstanceOf[UpdateTargetsArchitecture]
    val aarch64 = "aarch64".asInstanceOf[UpdateTargetsArchitecture]

    val values = js.Object.freeze(js.Array(armv6l, armv7l, x86_64, aarch64))
  }

  /**
    * The operating system of the cores which are the targets of an update.
    */
  @js.native
  sealed trait UpdateTargetsOperatingSystem extends js.Any
  object UpdateTargetsOperatingSystem extends js.Object {
    val ubuntu       = "ubuntu".asInstanceOf[UpdateTargetsOperatingSystem]
    val raspbian     = "raspbian".asInstanceOf[UpdateTargetsOperatingSystem]
    val amazon_linux = "amazon_linux".asInstanceOf[UpdateTargetsOperatingSystem]
    val openwrt      = "openwrt".asInstanceOf[UpdateTargetsOperatingSystem]

    val values = js.Object.freeze(js.Array(ubuntu, raspbian, amazon_linux, openwrt))
  }

  /**
    * Information about a version.
    */
  @js.native
  @Factory
  trait VersionInformation extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }
}
