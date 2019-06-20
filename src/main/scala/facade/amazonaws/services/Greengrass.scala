package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object greengrass {
  type BulkDeploymentResults                       = js.Array[BulkDeploymentResult]
  type BulkDeploymentStatus                        = String
  type BulkDeployments                             = js.Array[BulkDeployment]
  type DeploymentType                              = String
  type Deployments                                 = js.Array[Deployment]
  type EncodingType                                = String
  type ErrorDetails                                = js.Array[ErrorDetail]
  type FunctionIsolationMode                       = String
  type LoggerComponent                             = String
  type LoggerLevel                                 = String
  type LoggerType                                  = String
  type Permission                                  = String
  type S3UrlSignerRole                             = String
  type SoftwareToUpdate                            = String
  type UpdateAgentLogLevel                         = String
  type UpdateTargets                               = js.Array[__string]
  type UpdateTargetsArchitecture                   = String
  type UpdateTargetsOperatingSystem                = String
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
    def resetDeployments(params: ResetDeploymentsRequest): Request[ResetDeploymentsResponse]          = js.native
    def startBulkDeployment(params: StartBulkDeploymentRequest): Request[StartBulkDeploymentResponse] = js.native
    def stopBulkDeployment(params: StopBulkDeploymentRequest): Request[StopBulkDeploymentResponse]    = js.native
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
  trait AssociateRoleToGroupRequest extends js.Object {
    var GroupId: __string
    var RoleArn: js.UndefOr[__string]
  }

  object AssociateRoleToGroupRequest {
    def apply(GroupId: __string, RoleArn: js.UndefOr[__string] = js.undefined): AssociateRoleToGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("GroupId" -> GroupId.asInstanceOf[js.Any], "RoleArn" -> RoleArn.map {
        x =>
          x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateRoleToGroupRequest]
    }
  }

  @js.native
  trait AssociateRoleToGroupResponse extends js.Object {
    var AssociatedAt: js.UndefOr[__string]
  }

  object AssociateRoleToGroupResponse {
    def apply(AssociatedAt: js.UndefOr[__string] = js.undefined): AssociateRoleToGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("AssociatedAt" -> AssociatedAt.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateRoleToGroupResponse]
    }
  }

  @js.native
  trait AssociateServiceRoleToAccountRequest extends js.Object {
    var RoleArn: js.UndefOr[__string]
  }

  object AssociateServiceRoleToAccountRequest {
    def apply(RoleArn: js.UndefOr[__string] = js.undefined): AssociateServiceRoleToAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("RoleArn" -> RoleArn.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateServiceRoleToAccountRequest]
    }
  }

  @js.native
  trait AssociateServiceRoleToAccountResponse extends js.Object {
    var AssociatedAt: js.UndefOr[__string]
  }

  object AssociateServiceRoleToAccountResponse {
    def apply(AssociatedAt: js.UndefOr[__string] = js.undefined): AssociateServiceRoleToAccountResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("AssociatedAt" -> AssociatedAt.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AssociateServiceRoleToAccountResponse]
    }
  }

  /**
    * Information about a bulk deployment. You cannot start a new bulk deployment while another one is still running or in a non-terminal state.
    */
  @js.native
  trait BulkDeployment extends js.Object {
    var BulkDeploymentArn: js.UndefOr[__string]
    var BulkDeploymentId: js.UndefOr[__string]
    var CreatedAt: js.UndefOr[__string]
  }

  object BulkDeployment {
    def apply(BulkDeploymentArn: js.UndefOr[__string] = js.undefined,
              BulkDeploymentId: js.UndefOr[__string] = js.undefined,
              CreatedAt: js.UndefOr[__string] = js.undefined): BulkDeployment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BulkDeploymentArn" -> BulkDeploymentArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BulkDeploymentId" -> BulkDeploymentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreatedAt" -> CreatedAt.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BulkDeployment]
    }
  }

  /**
    * Relevant metrics on input records processed during bulk deployment.
    */
  @js.native
  trait BulkDeploymentMetrics extends js.Object {
    var InvalidInputRecords: js.UndefOr[__integer]
    var RecordsProcessed: js.UndefOr[__integer]
    var RetryAttempts: js.UndefOr[__integer]
  }

  object BulkDeploymentMetrics {
    def apply(InvalidInputRecords: js.UndefOr[__integer] = js.undefined,
              RecordsProcessed: js.UndefOr[__integer] = js.undefined,
              RetryAttempts: js.UndefOr[__integer] = js.undefined): BulkDeploymentMetrics = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InvalidInputRecords" -> InvalidInputRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RecordsProcessed" -> RecordsProcessed.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RetryAttempts" -> RetryAttempts.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BulkDeploymentMetrics]
    }
  }

  /**
    * Information about an individual group deployment in a bulk deployment operation.
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
    def apply(CreatedAt: js.UndefOr[__string] = js.undefined,
              DeploymentArn: js.UndefOr[__string] = js.undefined,
              DeploymentId: js.UndefOr[__string] = js.undefined,
              DeploymentStatus: js.UndefOr[__string] = js.undefined,
              DeploymentType: js.UndefOr[DeploymentType] = js.undefined,
              ErrorDetails: js.UndefOr[ErrorDetails] = js.undefined,
              ErrorMessage: js.UndefOr[__string] = js.undefined,
              GroupArn: js.UndefOr[__string] = js.undefined): BulkDeploymentResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreatedAt" -> CreatedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeploymentArn" -> DeploymentArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeploymentId" -> DeploymentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeploymentStatus" -> DeploymentStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeploymentType" -> DeploymentType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ErrorDetails" -> ErrorDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ErrorMessage" -> ErrorMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GroupArn" -> GroupArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BulkDeploymentResult]
    }
  }

  /**
    * The current status of the bulk deployment.
    */
  object BulkDeploymentStatusEnum {
    val Initializing = "Initializing"
    val Running      = "Running"
    val Completed    = "Completed"
    val Stopping     = "Stopping"
    val Stopped      = "Stopped"
    val Failed       = "Failed"

    val values = IndexedSeq(Initializing, Running, Completed, Stopping, Stopped, Failed)
  }

  /**
    * Information about a Greengrass core's connectivity.
    */
  @js.native
  trait ConnectivityInfo extends js.Object {
    var HostAddress: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var Metadata: js.UndefOr[__string]
    var PortNumber: js.UndefOr[__integer]
  }

  object ConnectivityInfo {
    def apply(HostAddress: js.UndefOr[__string] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              Metadata: js.UndefOr[__string] = js.undefined,
              PortNumber: js.UndefOr[__integer] = js.undefined): ConnectivityInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostAddress" -> HostAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Metadata" -> Metadata.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PortNumber" -> PortNumber.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConnectivityInfo]
    }
  }

  /**
    * Information about a connector. Connectors run on the Greengrass core and contain built-in integration with local infrastructure, device protocols, AWS, and other cloud services.
    */
  @js.native
  trait Connector extends js.Object {
    var ConnectorArn: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var Parameters: js.UndefOr[__mapOf__string]
  }

  object Connector {
    def apply(ConnectorArn: js.UndefOr[__string] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              Parameters: js.UndefOr[__mapOf__string] = js.undefined): Connector = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConnectorArn" -> ConnectorArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Parameters" -> Parameters.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Connector]
    }
  }

  /**
    * Information about the connector definition version, which is a container for connectors.
    */
  @js.native
  trait ConnectorDefinitionVersion extends js.Object {
    var Connectors: js.UndefOr[__listOfConnector]
  }

  object ConnectorDefinitionVersion {
    def apply(Connectors: js.UndefOr[__listOfConnector] = js.undefined): ConnectorDefinitionVersion = {
      val _fields = IndexedSeq[(String, js.Any)]("Connectors" -> Connectors.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConnectorDefinitionVersion]
    }
  }

  /**
    * Information about a core.
    */
  @js.native
  trait Core extends js.Object {
    var CertificateArn: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var SyncShadow: js.UndefOr[__boolean]
    var ThingArn: js.UndefOr[__string]
  }

  object Core {
    def apply(CertificateArn: js.UndefOr[__string] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              SyncShadow: js.UndefOr[__boolean] = js.undefined,
              ThingArn: js.UndefOr[__string] = js.undefined): Core = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateArn" -> CertificateArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SyncShadow" -> SyncShadow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ThingArn" -> ThingArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Core]
    }
  }

  /**
    * Information about a core definition version.
    */
  @js.native
  trait CoreDefinitionVersion extends js.Object {
    var Cores: js.UndefOr[__listOfCore]
  }

  object CoreDefinitionVersion {
    def apply(Cores: js.UndefOr[__listOfCore] = js.undefined): CoreDefinitionVersion = {
      val _fields = IndexedSeq[(String, js.Any)]("Cores" -> Cores.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CoreDefinitionVersion]
    }
  }

  @js.native
  trait CreateConnectorDefinitionRequest extends js.Object {
    var AmznClientToken: js.UndefOr[__string]
    var InitialVersion: js.UndefOr[ConnectorDefinitionVersion]
    var Name: js.UndefOr[__string]
  }

  object CreateConnectorDefinitionRequest {
    def apply(AmznClientToken: js.UndefOr[__string] = js.undefined,
              InitialVersion: js.UndefOr[ConnectorDefinitionVersion] = js.undefined,
              Name: js.UndefOr[__string] = js.undefined): CreateConnectorDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AmznClientToken" -> AmznClientToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InitialVersion" -> InitialVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateConnectorDefinitionRequest]
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
    def apply(Arn: js.UndefOr[__string] = js.undefined,
              CreationTimestamp: js.UndefOr[__string] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
              LatestVersion: js.UndefOr[__string] = js.undefined,
              LatestVersionArn: js.UndefOr[__string] = js.undefined,
              Name: js.UndefOr[__string] = js.undefined): CreateConnectorDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastUpdatedTimestamp" -> LastUpdatedTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersion" -> LatestVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersionArn" -> LatestVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateConnectorDefinitionResponse]
    }
  }

  @js.native
  trait CreateConnectorDefinitionVersionRequest extends js.Object {
    var ConnectorDefinitionId: __string
    var AmznClientToken: js.UndefOr[__string]
    var Connectors: js.UndefOr[__listOfConnector]
  }

  object CreateConnectorDefinitionVersionRequest {
    def apply(ConnectorDefinitionId: __string,
              AmznClientToken: js.UndefOr[__string] = js.undefined,
              Connectors: js.UndefOr[__listOfConnector] = js.undefined): CreateConnectorDefinitionVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConnectorDefinitionId" -> ConnectorDefinitionId.asInstanceOf[js.Any],
        "AmznClientToken" -> AmznClientToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Connectors" -> Connectors.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateConnectorDefinitionVersionRequest]
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
    def apply(Arn: js.UndefOr[__string] = js.undefined,
              CreationTimestamp: js.UndefOr[__string] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              Version: js.UndefOr[__string] = js.undefined): CreateConnectorDefinitionVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateConnectorDefinitionVersionResponse]
    }
  }

  /**
    * Information needed to create a core definition.
    */
  @js.native
  trait CreateCoreDefinitionRequest extends js.Object {
    var AmznClientToken: js.UndefOr[__string]
    var InitialVersion: js.UndefOr[CoreDefinitionVersion]
    var Name: js.UndefOr[__string]
  }

  object CreateCoreDefinitionRequest {
    def apply(AmznClientToken: js.UndefOr[__string] = js.undefined,
              InitialVersion: js.UndefOr[CoreDefinitionVersion] = js.undefined,
              Name: js.UndefOr[__string] = js.undefined): CreateCoreDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AmznClientToken" -> AmznClientToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InitialVersion" -> InitialVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCoreDefinitionRequest]
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
    def apply(Arn: js.UndefOr[__string] = js.undefined,
              CreationTimestamp: js.UndefOr[__string] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
              LatestVersion: js.UndefOr[__string] = js.undefined,
              LatestVersionArn: js.UndefOr[__string] = js.undefined,
              Name: js.UndefOr[__string] = js.undefined): CreateCoreDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastUpdatedTimestamp" -> LastUpdatedTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersion" -> LatestVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersionArn" -> LatestVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCoreDefinitionResponse]
    }
  }

  @js.native
  trait CreateCoreDefinitionVersionRequest extends js.Object {
    var CoreDefinitionId: __string
    var AmznClientToken: js.UndefOr[__string]
    var Cores: js.UndefOr[__listOfCore]
  }

  object CreateCoreDefinitionVersionRequest {
    def apply(CoreDefinitionId: __string,
              AmznClientToken: js.UndefOr[__string] = js.undefined,
              Cores: js.UndefOr[__listOfCore] = js.undefined): CreateCoreDefinitionVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CoreDefinitionId" -> CoreDefinitionId.asInstanceOf[js.Any],
        "AmznClientToken" -> AmznClientToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Cores" -> Cores.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCoreDefinitionVersionRequest]
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
    def apply(Arn: js.UndefOr[__string] = js.undefined,
              CreationTimestamp: js.UndefOr[__string] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              Version: js.UndefOr[__string] = js.undefined): CreateCoreDefinitionVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateCoreDefinitionVersionResponse]
    }
  }

  @js.native
  trait CreateDeploymentRequest extends js.Object {
    var GroupId: __string
    var AmznClientToken: js.UndefOr[__string]
    var DeploymentId: js.UndefOr[__string]
    var DeploymentType: js.UndefOr[DeploymentType]
    var GroupVersionId: js.UndefOr[__string]
  }

  object CreateDeploymentRequest {
    def apply(GroupId: __string,
              AmznClientToken: js.UndefOr[__string] = js.undefined,
              DeploymentId: js.UndefOr[__string] = js.undefined,
              DeploymentType: js.UndefOr[DeploymentType] = js.undefined,
              GroupVersionId: js.UndefOr[__string] = js.undefined): CreateDeploymentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupId" -> GroupId.asInstanceOf[js.Any],
        "AmznClientToken" -> AmznClientToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeploymentId" -> DeploymentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeploymentType" -> DeploymentType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GroupVersionId" -> GroupVersionId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDeploymentRequest]
    }
  }

  @js.native
  trait CreateDeploymentResponse extends js.Object {
    var DeploymentArn: js.UndefOr[__string]
    var DeploymentId: js.UndefOr[__string]
  }

  object CreateDeploymentResponse {
    def apply(DeploymentArn: js.UndefOr[__string] = js.undefined,
              DeploymentId: js.UndefOr[__string] = js.undefined): CreateDeploymentResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("DeploymentArn" -> DeploymentArn.map { x =>
        x.asInstanceOf[js.Any]
      }, "DeploymentId" -> DeploymentId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDeploymentResponse]
    }
  }

  @js.native
  trait CreateDeviceDefinitionRequest extends js.Object {
    var AmznClientToken: js.UndefOr[__string]
    var InitialVersion: js.UndefOr[DeviceDefinitionVersion]
    var Name: js.UndefOr[__string]
  }

  object CreateDeviceDefinitionRequest {
    def apply(AmznClientToken: js.UndefOr[__string] = js.undefined,
              InitialVersion: js.UndefOr[DeviceDefinitionVersion] = js.undefined,
              Name: js.UndefOr[__string] = js.undefined): CreateDeviceDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AmznClientToken" -> AmznClientToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InitialVersion" -> InitialVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDeviceDefinitionRequest]
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
    def apply(Arn: js.UndefOr[__string] = js.undefined,
              CreationTimestamp: js.UndefOr[__string] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
              LatestVersion: js.UndefOr[__string] = js.undefined,
              LatestVersionArn: js.UndefOr[__string] = js.undefined,
              Name: js.UndefOr[__string] = js.undefined): CreateDeviceDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastUpdatedTimestamp" -> LastUpdatedTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersion" -> LatestVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersionArn" -> LatestVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDeviceDefinitionResponse]
    }
  }

  @js.native
  trait CreateDeviceDefinitionVersionRequest extends js.Object {
    var DeviceDefinitionId: __string
    var AmznClientToken: js.UndefOr[__string]
    var Devices: js.UndefOr[__listOfDevice]
  }

  object CreateDeviceDefinitionVersionRequest {
    def apply(DeviceDefinitionId: __string,
              AmznClientToken: js.UndefOr[__string] = js.undefined,
              Devices: js.UndefOr[__listOfDevice] = js.undefined): CreateDeviceDefinitionVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceDefinitionId" -> DeviceDefinitionId.asInstanceOf[js.Any],
        "AmznClientToken" -> AmznClientToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Devices" -> Devices.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDeviceDefinitionVersionRequest]
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
    def apply(Arn: js.UndefOr[__string] = js.undefined,
              CreationTimestamp: js.UndefOr[__string] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              Version: js.UndefOr[__string] = js.undefined): CreateDeviceDefinitionVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDeviceDefinitionVersionResponse]
    }
  }

  @js.native
  trait CreateFunctionDefinitionRequest extends js.Object {
    var AmznClientToken: js.UndefOr[__string]
    var InitialVersion: js.UndefOr[FunctionDefinitionVersion]
    var Name: js.UndefOr[__string]
  }

  object CreateFunctionDefinitionRequest {
    def apply(AmznClientToken: js.UndefOr[__string] = js.undefined,
              InitialVersion: js.UndefOr[FunctionDefinitionVersion] = js.undefined,
              Name: js.UndefOr[__string] = js.undefined): CreateFunctionDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AmznClientToken" -> AmznClientToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InitialVersion" -> InitialVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFunctionDefinitionRequest]
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
    def apply(Arn: js.UndefOr[__string] = js.undefined,
              CreationTimestamp: js.UndefOr[__string] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
              LatestVersion: js.UndefOr[__string] = js.undefined,
              LatestVersionArn: js.UndefOr[__string] = js.undefined,
              Name: js.UndefOr[__string] = js.undefined): CreateFunctionDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastUpdatedTimestamp" -> LastUpdatedTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersion" -> LatestVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersionArn" -> LatestVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFunctionDefinitionResponse]
    }
  }

  /**
    * Information needed to create a function definition version.
    */
  @js.native
  trait CreateFunctionDefinitionVersionRequest extends js.Object {
    var FunctionDefinitionId: __string
    var AmznClientToken: js.UndefOr[__string]
    var DefaultConfig: js.UndefOr[FunctionDefaultConfig]
    var Functions: js.UndefOr[__listOfFunction]
  }

  object CreateFunctionDefinitionVersionRequest {
    def apply(FunctionDefinitionId: __string,
              AmznClientToken: js.UndefOr[__string] = js.undefined,
              DefaultConfig: js.UndefOr[FunctionDefaultConfig] = js.undefined,
              Functions: js.UndefOr[__listOfFunction] = js.undefined): CreateFunctionDefinitionVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionDefinitionId" -> FunctionDefinitionId.asInstanceOf[js.Any],
        "AmznClientToken" -> AmznClientToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultConfig" -> DefaultConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Functions" -> Functions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFunctionDefinitionVersionRequest]
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
    def apply(Arn: js.UndefOr[__string] = js.undefined,
              CreationTimestamp: js.UndefOr[__string] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              Version: js.UndefOr[__string] = js.undefined): CreateFunctionDefinitionVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFunctionDefinitionVersionResponse]
    }
  }

  @js.native
  trait CreateGroupCertificateAuthorityRequest extends js.Object {
    var GroupId: __string
    var AmznClientToken: js.UndefOr[__string]
  }

  object CreateGroupCertificateAuthorityRequest {
    def apply(GroupId: __string,
              AmznClientToken: js.UndefOr[__string] = js.undefined): CreateGroupCertificateAuthorityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupId" -> GroupId.asInstanceOf[js.Any],
        "AmznClientToken" -> AmznClientToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGroupCertificateAuthorityRequest]
    }
  }

  @js.native
  trait CreateGroupCertificateAuthorityResponse extends js.Object {
    var GroupCertificateAuthorityArn: js.UndefOr[__string]
  }

  object CreateGroupCertificateAuthorityResponse {
    def apply(
        GroupCertificateAuthorityArn: js.UndefOr[__string] = js.undefined
    ): CreateGroupCertificateAuthorityResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("GroupCertificateAuthorityArn" -> GroupCertificateAuthorityArn.map {
        x =>
          x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGroupCertificateAuthorityResponse]
    }
  }

  @js.native
  trait CreateGroupRequest extends js.Object {
    var AmznClientToken: js.UndefOr[__string]
    var InitialVersion: js.UndefOr[GroupVersion]
    var Name: js.UndefOr[__string]
  }

  object CreateGroupRequest {
    def apply(AmznClientToken: js.UndefOr[__string] = js.undefined,
              InitialVersion: js.UndefOr[GroupVersion] = js.undefined,
              Name: js.UndefOr[__string] = js.undefined): CreateGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AmznClientToken" -> AmznClientToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InitialVersion" -> InitialVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGroupRequest]
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
    def apply(Arn: js.UndefOr[__string] = js.undefined,
              CreationTimestamp: js.UndefOr[__string] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
              LatestVersion: js.UndefOr[__string] = js.undefined,
              LatestVersionArn: js.UndefOr[__string] = js.undefined,
              Name: js.UndefOr[__string] = js.undefined): CreateGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastUpdatedTimestamp" -> LastUpdatedTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersion" -> LatestVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersionArn" -> LatestVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGroupResponse]
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
    def apply(GroupId: __string,
              AmznClientToken: js.UndefOr[__string] = js.undefined,
              ConnectorDefinitionVersionArn: js.UndefOr[__string] = js.undefined,
              CoreDefinitionVersionArn: js.UndefOr[__string] = js.undefined,
              DeviceDefinitionVersionArn: js.UndefOr[__string] = js.undefined,
              FunctionDefinitionVersionArn: js.UndefOr[__string] = js.undefined,
              LoggerDefinitionVersionArn: js.UndefOr[__string] = js.undefined,
              ResourceDefinitionVersionArn: js.UndefOr[__string] = js.undefined,
              SubscriptionDefinitionVersionArn: js.UndefOr[__string] = js.undefined): CreateGroupVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupId" -> GroupId.asInstanceOf[js.Any],
        "AmznClientToken" -> AmznClientToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConnectorDefinitionVersionArn" -> ConnectorDefinitionVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CoreDefinitionVersionArn" -> CoreDefinitionVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeviceDefinitionVersionArn" -> DeviceDefinitionVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FunctionDefinitionVersionArn" -> FunctionDefinitionVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LoggerDefinitionVersionArn" -> LoggerDefinitionVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceDefinitionVersionArn" -> ResourceDefinitionVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SubscriptionDefinitionVersionArn" -> SubscriptionDefinitionVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGroupVersionRequest]
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
    def apply(Arn: js.UndefOr[__string] = js.undefined,
              CreationTimestamp: js.UndefOr[__string] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              Version: js.UndefOr[__string] = js.undefined): CreateGroupVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGroupVersionResponse]
    }
  }

  @js.native
  trait CreateLoggerDefinitionRequest extends js.Object {
    var AmznClientToken: js.UndefOr[__string]
    var InitialVersion: js.UndefOr[LoggerDefinitionVersion]
    var Name: js.UndefOr[__string]
  }

  object CreateLoggerDefinitionRequest {
    def apply(AmznClientToken: js.UndefOr[__string] = js.undefined,
              InitialVersion: js.UndefOr[LoggerDefinitionVersion] = js.undefined,
              Name: js.UndefOr[__string] = js.undefined): CreateLoggerDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AmznClientToken" -> AmznClientToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InitialVersion" -> InitialVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLoggerDefinitionRequest]
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
    def apply(Arn: js.UndefOr[__string] = js.undefined,
              CreationTimestamp: js.UndefOr[__string] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
              LatestVersion: js.UndefOr[__string] = js.undefined,
              LatestVersionArn: js.UndefOr[__string] = js.undefined,
              Name: js.UndefOr[__string] = js.undefined): CreateLoggerDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastUpdatedTimestamp" -> LastUpdatedTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersion" -> LatestVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersionArn" -> LatestVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLoggerDefinitionResponse]
    }
  }

  @js.native
  trait CreateLoggerDefinitionVersionRequest extends js.Object {
    var LoggerDefinitionId: __string
    var AmznClientToken: js.UndefOr[__string]
    var Loggers: js.UndefOr[__listOfLogger]
  }

  object CreateLoggerDefinitionVersionRequest {
    def apply(LoggerDefinitionId: __string,
              AmznClientToken: js.UndefOr[__string] = js.undefined,
              Loggers: js.UndefOr[__listOfLogger] = js.undefined): CreateLoggerDefinitionVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoggerDefinitionId" -> LoggerDefinitionId.asInstanceOf[js.Any],
        "AmznClientToken" -> AmznClientToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Loggers" -> Loggers.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLoggerDefinitionVersionRequest]
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
    def apply(Arn: js.UndefOr[__string] = js.undefined,
              CreationTimestamp: js.UndefOr[__string] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              Version: js.UndefOr[__string] = js.undefined): CreateLoggerDefinitionVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateLoggerDefinitionVersionResponse]
    }
  }

  @js.native
  trait CreateResourceDefinitionRequest extends js.Object {
    var AmznClientToken: js.UndefOr[__string]
    var InitialVersion: js.UndefOr[ResourceDefinitionVersion]
    var Name: js.UndefOr[__string]
  }

  object CreateResourceDefinitionRequest {
    def apply(AmznClientToken: js.UndefOr[__string] = js.undefined,
              InitialVersion: js.UndefOr[ResourceDefinitionVersion] = js.undefined,
              Name: js.UndefOr[__string] = js.undefined): CreateResourceDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AmznClientToken" -> AmznClientToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InitialVersion" -> InitialVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateResourceDefinitionRequest]
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
    def apply(Arn: js.UndefOr[__string] = js.undefined,
              CreationTimestamp: js.UndefOr[__string] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
              LatestVersion: js.UndefOr[__string] = js.undefined,
              LatestVersionArn: js.UndefOr[__string] = js.undefined,
              Name: js.UndefOr[__string] = js.undefined): CreateResourceDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastUpdatedTimestamp" -> LastUpdatedTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersion" -> LatestVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersionArn" -> LatestVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateResourceDefinitionResponse]
    }
  }

  @js.native
  trait CreateResourceDefinitionVersionRequest extends js.Object {
    var ResourceDefinitionId: __string
    var AmznClientToken: js.UndefOr[__string]
    var Resources: js.UndefOr[__listOfResource]
  }

  object CreateResourceDefinitionVersionRequest {
    def apply(ResourceDefinitionId: __string,
              AmznClientToken: js.UndefOr[__string] = js.undefined,
              Resources: js.UndefOr[__listOfResource] = js.undefined): CreateResourceDefinitionVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceDefinitionId" -> ResourceDefinitionId.asInstanceOf[js.Any],
        "AmznClientToken" -> AmznClientToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Resources" -> Resources.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateResourceDefinitionVersionRequest]
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
    def apply(Arn: js.UndefOr[__string] = js.undefined,
              CreationTimestamp: js.UndefOr[__string] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              Version: js.UndefOr[__string] = js.undefined): CreateResourceDefinitionVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateResourceDefinitionVersionResponse]
    }
  }

  @js.native
  trait CreateSoftwareUpdateJobRequest extends js.Object {
    var AmznClientToken: js.UndefOr[__string]
    var S3UrlSignerRole: js.UndefOr[S3UrlSignerRole]
    var SoftwareToUpdate: js.UndefOr[SoftwareToUpdate]
    var UpdateAgentLogLevel: js.UndefOr[UpdateAgentLogLevel]
    var UpdateTargets: js.UndefOr[UpdateTargets]
    var UpdateTargetsArchitecture: js.UndefOr[UpdateTargetsArchitecture]
    var UpdateTargetsOperatingSystem: js.UndefOr[UpdateTargetsOperatingSystem]
  }

  object CreateSoftwareUpdateJobRequest {
    def apply(
        AmznClientToken: js.UndefOr[__string] = js.undefined,
        S3UrlSignerRole: js.UndefOr[S3UrlSignerRole] = js.undefined,
        SoftwareToUpdate: js.UndefOr[SoftwareToUpdate] = js.undefined,
        UpdateAgentLogLevel: js.UndefOr[UpdateAgentLogLevel] = js.undefined,
        UpdateTargets: js.UndefOr[UpdateTargets] = js.undefined,
        UpdateTargetsArchitecture: js.UndefOr[UpdateTargetsArchitecture] = js.undefined,
        UpdateTargetsOperatingSystem: js.UndefOr[UpdateTargetsOperatingSystem] = js.undefined
    ): CreateSoftwareUpdateJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AmznClientToken" -> AmznClientToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3UrlSignerRole" -> S3UrlSignerRole.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SoftwareToUpdate" -> SoftwareToUpdate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UpdateAgentLogLevel" -> UpdateAgentLogLevel.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UpdateTargets" -> UpdateTargets.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UpdateTargetsArchitecture" -> UpdateTargetsArchitecture.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UpdateTargetsOperatingSystem" -> UpdateTargetsOperatingSystem.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSoftwareUpdateJobRequest]
    }
  }

  @js.native
  trait CreateSoftwareUpdateJobResponse extends js.Object {
    var IotJobArn: js.UndefOr[__string]
    var IotJobId: js.UndefOr[__string]
  }

  object CreateSoftwareUpdateJobResponse {
    def apply(IotJobArn: js.UndefOr[__string] = js.undefined,
              IotJobId: js.UndefOr[__string] = js.undefined): CreateSoftwareUpdateJobResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("IotJobArn" -> IotJobArn.map { x =>
        x.asInstanceOf[js.Any]
      }, "IotJobId" -> IotJobId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSoftwareUpdateJobResponse]
    }
  }

  @js.native
  trait CreateSubscriptionDefinitionRequest extends js.Object {
    var AmznClientToken: js.UndefOr[__string]
    var InitialVersion: js.UndefOr[SubscriptionDefinitionVersion]
    var Name: js.UndefOr[__string]
  }

  object CreateSubscriptionDefinitionRequest {
    def apply(AmznClientToken: js.UndefOr[__string] = js.undefined,
              InitialVersion: js.UndefOr[SubscriptionDefinitionVersion] = js.undefined,
              Name: js.UndefOr[__string] = js.undefined): CreateSubscriptionDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AmznClientToken" -> AmznClientToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InitialVersion" -> InitialVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSubscriptionDefinitionRequest]
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
    def apply(Arn: js.UndefOr[__string] = js.undefined,
              CreationTimestamp: js.UndefOr[__string] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
              LatestVersion: js.UndefOr[__string] = js.undefined,
              LatestVersionArn: js.UndefOr[__string] = js.undefined,
              Name: js.UndefOr[__string] = js.undefined): CreateSubscriptionDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastUpdatedTimestamp" -> LastUpdatedTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersion" -> LatestVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersionArn" -> LatestVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateSubscriptionDefinitionResponse]
    }
  }

  @js.native
  trait CreateSubscriptionDefinitionVersionRequest extends js.Object {
    var SubscriptionDefinitionId: __string
    var AmznClientToken: js.UndefOr[__string]
    var Subscriptions: js.UndefOr[__listOfSubscription]
  }

  object CreateSubscriptionDefinitionVersionRequest {
    def apply(
        SubscriptionDefinitionId: __string,
        AmznClientToken: js.UndefOr[__string] = js.undefined,
        Subscriptions: js.UndefOr[__listOfSubscription] = js.undefined
    ): CreateSubscriptionDefinitionVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubscriptionDefinitionId" -> SubscriptionDefinitionId.asInstanceOf[js.Any],
        "AmznClientToken" -> AmznClientToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Subscriptions" -> Subscriptions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[CreateSubscriptionDefinitionVersionRequest]
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
    def apply(Arn: js.UndefOr[__string] = js.undefined,
              CreationTimestamp: js.UndefOr[__string] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              Version: js.UndefOr[__string] = js.undefined): CreateSubscriptionDefinitionVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[CreateSubscriptionDefinitionVersionResponse]
    }
  }

  /**
    * Information about a definition.
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
  }

  object DefinitionInformation {
    def apply(Arn: js.UndefOr[__string] = js.undefined,
              CreationTimestamp: js.UndefOr[__string] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
              LatestVersion: js.UndefOr[__string] = js.undefined,
              LatestVersionArn: js.UndefOr[__string] = js.undefined,
              Name: js.UndefOr[__string] = js.undefined): DefinitionInformation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastUpdatedTimestamp" -> LastUpdatedTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersion" -> LatestVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersionArn" -> LatestVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DefinitionInformation]
    }
  }

  @js.native
  trait DeleteConnectorDefinitionRequest extends js.Object {
    var ConnectorDefinitionId: __string
  }

  object DeleteConnectorDefinitionRequest {
    def apply(ConnectorDefinitionId: __string): DeleteConnectorDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("ConnectorDefinitionId" -> ConnectorDefinitionId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConnectorDefinitionRequest]
    }
  }

  @js.native
  trait DeleteConnectorDefinitionResponse extends js.Object {}

  object DeleteConnectorDefinitionResponse {
    def apply(): DeleteConnectorDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConnectorDefinitionResponse]
    }
  }

  @js.native
  trait DeleteCoreDefinitionRequest extends js.Object {
    var CoreDefinitionId: __string
  }

  object DeleteCoreDefinitionRequest {
    def apply(CoreDefinitionId: __string): DeleteCoreDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("CoreDefinitionId" -> CoreDefinitionId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCoreDefinitionRequest]
    }
  }

  @js.native
  trait DeleteCoreDefinitionResponse extends js.Object {}

  object DeleteCoreDefinitionResponse {
    def apply(): DeleteCoreDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteCoreDefinitionResponse]
    }
  }

  @js.native
  trait DeleteDeviceDefinitionRequest extends js.Object {
    var DeviceDefinitionId: __string
  }

  object DeleteDeviceDefinitionRequest {
    def apply(DeviceDefinitionId: __string): DeleteDeviceDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("DeviceDefinitionId" -> DeviceDefinitionId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDeviceDefinitionRequest]
    }
  }

  @js.native
  trait DeleteDeviceDefinitionResponse extends js.Object {}

  object DeleteDeviceDefinitionResponse {
    def apply(): DeleteDeviceDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDeviceDefinitionResponse]
    }
  }

  @js.native
  trait DeleteFunctionDefinitionRequest extends js.Object {
    var FunctionDefinitionId: __string
  }

  object DeleteFunctionDefinitionRequest {
    def apply(FunctionDefinitionId: __string): DeleteFunctionDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("FunctionDefinitionId" -> FunctionDefinitionId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFunctionDefinitionRequest]
    }
  }

  @js.native
  trait DeleteFunctionDefinitionResponse extends js.Object {}

  object DeleteFunctionDefinitionResponse {
    def apply(): DeleteFunctionDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFunctionDefinitionResponse]
    }
  }

  @js.native
  trait DeleteGroupRequest extends js.Object {
    var GroupId: __string
  }

  object DeleteGroupRequest {
    def apply(GroupId: __string): DeleteGroupRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("GroupId" -> GroupId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGroupRequest]
    }
  }

  @js.native
  trait DeleteGroupResponse extends js.Object {}

  object DeleteGroupResponse {
    def apply(): DeleteGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGroupResponse]
    }
  }

  @js.native
  trait DeleteLoggerDefinitionRequest extends js.Object {
    var LoggerDefinitionId: __string
  }

  object DeleteLoggerDefinitionRequest {
    def apply(LoggerDefinitionId: __string): DeleteLoggerDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("LoggerDefinitionId" -> LoggerDefinitionId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLoggerDefinitionRequest]
    }
  }

  @js.native
  trait DeleteLoggerDefinitionResponse extends js.Object {}

  object DeleteLoggerDefinitionResponse {
    def apply(): DeleteLoggerDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteLoggerDefinitionResponse]
    }
  }

  @js.native
  trait DeleteResourceDefinitionRequest extends js.Object {
    var ResourceDefinitionId: __string
  }

  object DeleteResourceDefinitionRequest {
    def apply(ResourceDefinitionId: __string): DeleteResourceDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("ResourceDefinitionId" -> ResourceDefinitionId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteResourceDefinitionRequest]
    }
  }

  @js.native
  trait DeleteResourceDefinitionResponse extends js.Object {}

  object DeleteResourceDefinitionResponse {
    def apply(): DeleteResourceDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteResourceDefinitionResponse]
    }
  }

  @js.native
  trait DeleteSubscriptionDefinitionRequest extends js.Object {
    var SubscriptionDefinitionId: __string
  }

  object DeleteSubscriptionDefinitionRequest {
    def apply(SubscriptionDefinitionId: __string): DeleteSubscriptionDefinitionRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("SubscriptionDefinitionId" -> SubscriptionDefinitionId.asInstanceOf[js.Any])
          .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSubscriptionDefinitionRequest]
    }
  }

  @js.native
  trait DeleteSubscriptionDefinitionResponse extends js.Object {}

  object DeleteSubscriptionDefinitionResponse {
    def apply(): DeleteSubscriptionDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteSubscriptionDefinitionResponse]
    }
  }

  /**
    * Information about a deployment.
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
    def apply(CreatedAt: js.UndefOr[__string] = js.undefined,
              DeploymentArn: js.UndefOr[__string] = js.undefined,
              DeploymentId: js.UndefOr[__string] = js.undefined,
              DeploymentType: js.UndefOr[DeploymentType] = js.undefined,
              GroupArn: js.UndefOr[__string] = js.undefined): Deployment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreatedAt" -> CreatedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeploymentArn" -> DeploymentArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeploymentId" -> DeploymentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeploymentType" -> DeploymentType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GroupArn" -> GroupArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Deployment]
    }
  }

  /**
    * The type of deployment.
    */
  object DeploymentTypeEnum {
    val NewDeployment        = "NewDeployment"
    val Redeployment         = "Redeployment"
    val ResetDeployment      = "ResetDeployment"
    val ForceResetDeployment = "ForceResetDeployment"

    val values = IndexedSeq(NewDeployment, Redeployment, ResetDeployment, ForceResetDeployment)
  }

  /**
    * Information about a device.
    */
  @js.native
  trait Device extends js.Object {
    var CertificateArn: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var SyncShadow: js.UndefOr[__boolean]
    var ThingArn: js.UndefOr[__string]
  }

  object Device {
    def apply(CertificateArn: js.UndefOr[__string] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              SyncShadow: js.UndefOr[__boolean] = js.undefined,
              ThingArn: js.UndefOr[__string] = js.undefined): Device = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateArn" -> CertificateArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SyncShadow" -> SyncShadow.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ThingArn" -> ThingArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Device]
    }
  }

  /**
    * Information about a device definition version.
    */
  @js.native
  trait DeviceDefinitionVersion extends js.Object {
    var Devices: js.UndefOr[__listOfDevice]
  }

  object DeviceDefinitionVersion {
    def apply(Devices: js.UndefOr[__listOfDevice] = js.undefined): DeviceDefinitionVersion = {
      val _fields = IndexedSeq[(String, js.Any)]("Devices" -> Devices.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeviceDefinitionVersion]
    }
  }

  @js.native
  trait DisassociateRoleFromGroupRequest extends js.Object {
    var GroupId: __string
  }

  object DisassociateRoleFromGroupRequest {
    def apply(GroupId: __string): DisassociateRoleFromGroupRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("GroupId" -> GroupId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateRoleFromGroupRequest]
    }
  }

  @js.native
  trait DisassociateRoleFromGroupResponse extends js.Object {
    var DisassociatedAt: js.UndefOr[__string]
  }

  object DisassociateRoleFromGroupResponse {
    def apply(DisassociatedAt: js.UndefOr[__string] = js.undefined): DisassociateRoleFromGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("DisassociatedAt" -> DisassociatedAt.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateRoleFromGroupResponse]
    }
  }

  @js.native
  trait DisassociateServiceRoleFromAccountRequest extends js.Object {}

  object DisassociateServiceRoleFromAccountRequest {
    def apply(): DisassociateServiceRoleFromAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DisassociateServiceRoleFromAccountRequest]
    }
  }

  @js.native
  trait DisassociateServiceRoleFromAccountResponse extends js.Object {
    var DisassociatedAt: js.UndefOr[__string]
  }

  object DisassociateServiceRoleFromAccountResponse {
    def apply(DisassociatedAt: js.UndefOr[__string] = js.undefined): DisassociateServiceRoleFromAccountResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("DisassociatedAt" -> DisassociatedAt.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[DisassociateServiceRoleFromAccountResponse]
    }
  }

  object EncodingTypeEnum {
    val binary = "binary"
    val json   = "json"

    val values = IndexedSeq(binary, json)
  }

  /**
    * Details about the error.
    */
  @js.native
  trait ErrorDetail extends js.Object {
    var DetailedErrorCode: js.UndefOr[__string]
    var DetailedErrorMessage: js.UndefOr[__string]
  }

  object ErrorDetail {
    def apply(DetailedErrorCode: js.UndefOr[__string] = js.undefined,
              DetailedErrorMessage: js.UndefOr[__string] = js.undefined): ErrorDetail = {
      val _fields = IndexedSeq[(String, js.Any)]("DetailedErrorCode" -> DetailedErrorCode.map { x =>
        x.asInstanceOf[js.Any]
      }, "DetailedErrorMessage" -> DetailedErrorMessage.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ErrorDetail]
    }
  }

  /**
    * Information about a Lambda function.
    */
  @js.native
  trait Function extends js.Object {
    var FunctionArn: js.UndefOr[__string]
    var FunctionConfiguration: js.UndefOr[FunctionConfiguration]
    var Id: js.UndefOr[__string]
  }

  object Function {
    def apply(FunctionArn: js.UndefOr[__string] = js.undefined,
              FunctionConfiguration: js.UndefOr[FunctionConfiguration] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined): Function = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionArn" -> FunctionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FunctionConfiguration" -> FunctionConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Function]
    }
  }

  /**
    * The configuration of the Lambda function.
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
    def apply(EncodingType: js.UndefOr[EncodingType] = js.undefined,
              Environment: js.UndefOr[FunctionConfigurationEnvironment] = js.undefined,
              ExecArgs: js.UndefOr[__string] = js.undefined,
              Executable: js.UndefOr[__string] = js.undefined,
              MemorySize: js.UndefOr[__integer] = js.undefined,
              Pinned: js.UndefOr[__boolean] = js.undefined,
              Timeout: js.UndefOr[__integer] = js.undefined): FunctionConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EncodingType" -> EncodingType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Environment" -> Environment.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExecArgs" -> ExecArgs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Executable" -> Executable.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MemorySize" -> MemorySize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Pinned" -> Pinned.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Timeout" -> Timeout.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FunctionConfiguration]
    }
  }

  /**
    * The environment configuration of the function.
    */
  @js.native
  trait FunctionConfigurationEnvironment extends js.Object {
    var AccessSysfs: js.UndefOr[__boolean]
    var Execution: js.UndefOr[FunctionExecutionConfig]
    var ResourceAccessPolicies: js.UndefOr[__listOfResourceAccessPolicy]
    var Variables: js.UndefOr[__mapOf__string]
  }

  object FunctionConfigurationEnvironment {
    def apply(AccessSysfs: js.UndefOr[__boolean] = js.undefined,
              Execution: js.UndefOr[FunctionExecutionConfig] = js.undefined,
              ResourceAccessPolicies: js.UndefOr[__listOfResourceAccessPolicy] = js.undefined,
              Variables: js.UndefOr[__mapOf__string] = js.undefined): FunctionConfigurationEnvironment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessSysfs" -> AccessSysfs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Execution" -> Execution.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceAccessPolicies" -> ResourceAccessPolicies.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Variables" -> Variables.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FunctionConfigurationEnvironment]
    }
  }

  /**
    * Default configuration that will apply to all Lambda functions in the group.
    */
  @js.native
  trait FunctionDefaultConfig extends js.Object {
    var Execution: js.UndefOr[FunctionDefaultExecutionConfig]
  }

  object FunctionDefaultConfig {
    def apply(Execution: js.UndefOr[FunctionDefaultExecutionConfig] = js.undefined): FunctionDefaultConfig = {
      val _fields = IndexedSeq[(String, js.Any)]("Execution" -> Execution.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FunctionDefaultConfig]
    }
  }

  /**
    * Configuration that defines the default containerization used for when running Lambda functions in the group. Individual Lambda functions can be override this setting.
    */
  @js.native
  trait FunctionDefaultExecutionConfig extends js.Object {
    var IsolationMode: js.UndefOr[FunctionIsolationMode]
  }

  object FunctionDefaultExecutionConfig {
    def apply(IsolationMode: js.UndefOr[FunctionIsolationMode] = js.undefined): FunctionDefaultExecutionConfig = {
      val _fields = IndexedSeq[(String, js.Any)]("IsolationMode" -> IsolationMode.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FunctionDefaultExecutionConfig]
    }
  }

  /**
    * Information about a function definition version.
    */
  @js.native
  trait FunctionDefinitionVersion extends js.Object {
    var DefaultConfig: js.UndefOr[FunctionDefaultConfig]
    var Functions: js.UndefOr[__listOfFunction]
  }

  object FunctionDefinitionVersion {
    def apply(DefaultConfig: js.UndefOr[FunctionDefaultConfig] = js.undefined,
              Functions: js.UndefOr[__listOfFunction] = js.undefined): FunctionDefinitionVersion = {
      val _fields = IndexedSeq[(String, js.Any)]("DefaultConfig" -> DefaultConfig.map { x =>
        x.asInstanceOf[js.Any]
      }, "Functions" -> Functions.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FunctionDefinitionVersion]
    }
  }

  /**
    * Configuration information that specifies how the Lambda function runs.
    */
  @js.native
  trait FunctionExecutionConfig extends js.Object {
    var IsolationMode: js.UndefOr[FunctionIsolationMode]
    var RunAs: js.UndefOr[FunctionRunAsConfig]
  }

  object FunctionExecutionConfig {
    def apply(IsolationMode: js.UndefOr[FunctionIsolationMode] = js.undefined,
              RunAs: js.UndefOr[FunctionRunAsConfig] = js.undefined): FunctionExecutionConfig = {
      val _fields = IndexedSeq[(String, js.Any)]("IsolationMode" -> IsolationMode.map { x =>
        x.asInstanceOf[js.Any]
      }, "RunAs" -> RunAs.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FunctionExecutionConfig]
    }
  }

  /**
    * Specifies whether the Lambda function runs in a Greengrass container (default) or without containerization. Unless your scenario requires that you run without containerization, we recommend that you run in a Greengrass container. Omit this value to run the Lambda function with the default containerization for the group.
    */
  object FunctionIsolationModeEnum {
    val GreengrassContainer = "GreengrassContainer"
    val NoContainer         = "NoContainer"

    val values = IndexedSeq(GreengrassContainer, NoContainer)
  }

  /**
    * Specifies the user and/or group whose permissions are used when running the Lambda function. You can specify one or both values to override the default values (ggc_user/ggc_group). We recommend that you avoid running as root unless absolutely necessary to minimize the risk of unintended changes or malicious attacks. To run as root, you must set IsolationMode to NoContainer and you must update config.json in greengrass-root/config to set allowFunctionsToRunAsRoot to yes.
    */
  @js.native
  trait FunctionRunAsConfig extends js.Object {
    var Gid: js.UndefOr[__integer]
    var Uid: js.UndefOr[__integer]
  }

  object FunctionRunAsConfig {
    def apply(Gid: js.UndefOr[__integer] = js.undefined,
              Uid: js.UndefOr[__integer] = js.undefined): FunctionRunAsConfig = {
      val _fields = IndexedSeq[(String, js.Any)]("Gid" -> Gid.map { x =>
        x.asInstanceOf[js.Any]
      }, "Uid" -> Uid.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FunctionRunAsConfig]
    }
  }

  @js.native
  trait GetAssociatedRoleRequest extends js.Object {
    var GroupId: __string
  }

  object GetAssociatedRoleRequest {
    def apply(GroupId: __string): GetAssociatedRoleRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("GroupId" -> GroupId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAssociatedRoleRequest]
    }
  }

  @js.native
  trait GetAssociatedRoleResponse extends js.Object {
    var AssociatedAt: js.UndefOr[__string]
    var RoleArn: js.UndefOr[__string]
  }

  object GetAssociatedRoleResponse {
    def apply(AssociatedAt: js.UndefOr[__string] = js.undefined,
              RoleArn: js.UndefOr[__string] = js.undefined): GetAssociatedRoleResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("AssociatedAt" -> AssociatedAt.map { x =>
        x.asInstanceOf[js.Any]
      }, "RoleArn" -> RoleArn.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAssociatedRoleResponse]
    }
  }

  @js.native
  trait GetBulkDeploymentStatusRequest extends js.Object {
    var BulkDeploymentId: __string
  }

  object GetBulkDeploymentStatusRequest {
    def apply(BulkDeploymentId: __string): GetBulkDeploymentStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("BulkDeploymentId" -> BulkDeploymentId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBulkDeploymentStatusRequest]
    }
  }

  @js.native
  trait GetBulkDeploymentStatusResponse extends js.Object {
    var BulkDeploymentMetrics: js.UndefOr[BulkDeploymentMetrics]
    var BulkDeploymentStatus: js.UndefOr[BulkDeploymentStatus]
    var CreatedAt: js.UndefOr[__string]
    var ErrorDetails: js.UndefOr[ErrorDetails]
    var ErrorMessage: js.UndefOr[__string]
  }

  object GetBulkDeploymentStatusResponse {
    def apply(BulkDeploymentMetrics: js.UndefOr[BulkDeploymentMetrics] = js.undefined,
              BulkDeploymentStatus: js.UndefOr[BulkDeploymentStatus] = js.undefined,
              CreatedAt: js.UndefOr[__string] = js.undefined,
              ErrorDetails: js.UndefOr[ErrorDetails] = js.undefined,
              ErrorMessage: js.UndefOr[__string] = js.undefined): GetBulkDeploymentStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BulkDeploymentMetrics" -> BulkDeploymentMetrics.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BulkDeploymentStatus" -> BulkDeploymentStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreatedAt" -> CreatedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ErrorDetails" -> ErrorDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ErrorMessage" -> ErrorMessage.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBulkDeploymentStatusResponse]
    }
  }

  @js.native
  trait GetConnectivityInfoRequest extends js.Object {
    var ThingName: __string
  }

  object GetConnectivityInfoRequest {
    def apply(ThingName: __string): GetConnectivityInfoRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("ThingName" -> ThingName.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConnectivityInfoRequest]
    }
  }

  @js.native
  trait GetConnectivityInfoResponse extends js.Object {
    var ConnectivityInfo: js.UndefOr[__listOfConnectivityInfo]
    var Message: js.UndefOr[__string]
  }

  object GetConnectivityInfoResponse {
    def apply(ConnectivityInfo: js.UndefOr[__listOfConnectivityInfo] = js.undefined,
              Message: js.UndefOr[__string] = js.undefined): GetConnectivityInfoResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("ConnectivityInfo" -> ConnectivityInfo.map { x =>
        x.asInstanceOf[js.Any]
      }, "Message" -> Message.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConnectivityInfoResponse]
    }
  }

  @js.native
  trait GetConnectorDefinitionRequest extends js.Object {
    var ConnectorDefinitionId: __string
  }

  object GetConnectorDefinitionRequest {
    def apply(ConnectorDefinitionId: __string): GetConnectorDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("ConnectorDefinitionId" -> ConnectorDefinitionId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConnectorDefinitionRequest]
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
  }

  object GetConnectorDefinitionResponse {
    def apply(Arn: js.UndefOr[__string] = js.undefined,
              CreationTimestamp: js.UndefOr[__string] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
              LatestVersion: js.UndefOr[__string] = js.undefined,
              LatestVersionArn: js.UndefOr[__string] = js.undefined,
              Name: js.UndefOr[__string] = js.undefined): GetConnectorDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastUpdatedTimestamp" -> LastUpdatedTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersion" -> LatestVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersionArn" -> LatestVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConnectorDefinitionResponse]
    }
  }

  @js.native
  trait GetConnectorDefinitionVersionRequest extends js.Object {
    var ConnectorDefinitionId: __string
    var ConnectorDefinitionVersionId: __string
    var NextToken: js.UndefOr[__string]
  }

  object GetConnectorDefinitionVersionRequest {
    def apply(ConnectorDefinitionId: __string,
              ConnectorDefinitionVersionId: __string,
              NextToken: js.UndefOr[__string] = js.undefined): GetConnectorDefinitionVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConnectorDefinitionId"        -> ConnectorDefinitionId.asInstanceOf[js.Any],
        "ConnectorDefinitionVersionId" -> ConnectorDefinitionVersionId.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConnectorDefinitionVersionRequest]
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
    def apply(Arn: js.UndefOr[__string] = js.undefined,
              CreationTimestamp: js.UndefOr[__string] = js.undefined,
              Definition: js.UndefOr[ConnectorDefinitionVersion] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined,
              Version: js.UndefOr[__string] = js.undefined): GetConnectorDefinitionVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Definition" -> Definition.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetConnectorDefinitionVersionResponse]
    }
  }

  @js.native
  trait GetCoreDefinitionRequest extends js.Object {
    var CoreDefinitionId: __string
  }

  object GetCoreDefinitionRequest {
    def apply(CoreDefinitionId: __string): GetCoreDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("CoreDefinitionId" -> CoreDefinitionId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCoreDefinitionRequest]
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
  }

  object GetCoreDefinitionResponse {
    def apply(Arn: js.UndefOr[__string] = js.undefined,
              CreationTimestamp: js.UndefOr[__string] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
              LatestVersion: js.UndefOr[__string] = js.undefined,
              LatestVersionArn: js.UndefOr[__string] = js.undefined,
              Name: js.UndefOr[__string] = js.undefined): GetCoreDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastUpdatedTimestamp" -> LastUpdatedTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersion" -> LatestVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersionArn" -> LatestVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCoreDefinitionResponse]
    }
  }

  @js.native
  trait GetCoreDefinitionVersionRequest extends js.Object {
    var CoreDefinitionId: __string
    var CoreDefinitionVersionId: __string
  }

  object GetCoreDefinitionVersionRequest {
    def apply(CoreDefinitionId: __string, CoreDefinitionVersionId: __string): GetCoreDefinitionVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CoreDefinitionId"        -> CoreDefinitionId.asInstanceOf[js.Any],
        "CoreDefinitionVersionId" -> CoreDefinitionVersionId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCoreDefinitionVersionRequest]
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
    def apply(Arn: js.UndefOr[__string] = js.undefined,
              CreationTimestamp: js.UndefOr[__string] = js.undefined,
              Definition: js.UndefOr[CoreDefinitionVersion] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined,
              Version: js.UndefOr[__string] = js.undefined): GetCoreDefinitionVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Definition" -> Definition.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetCoreDefinitionVersionResponse]
    }
  }

  @js.native
  trait GetDeploymentStatusRequest extends js.Object {
    var DeploymentId: __string
    var GroupId: __string
  }

  object GetDeploymentStatusRequest {
    def apply(DeploymentId: __string, GroupId: __string): GetDeploymentStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeploymentId" -> DeploymentId.asInstanceOf[js.Any],
        "GroupId"      -> GroupId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeploymentStatusRequest]
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
    def apply(DeploymentStatus: js.UndefOr[__string] = js.undefined,
              DeploymentType: js.UndefOr[DeploymentType] = js.undefined,
              ErrorDetails: js.UndefOr[ErrorDetails] = js.undefined,
              ErrorMessage: js.UndefOr[__string] = js.undefined,
              UpdatedAt: js.UndefOr[__string] = js.undefined): GetDeploymentStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeploymentStatus" -> DeploymentStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeploymentType" -> DeploymentType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ErrorDetails" -> ErrorDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ErrorMessage" -> ErrorMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UpdatedAt" -> UpdatedAt.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeploymentStatusResponse]
    }
  }

  @js.native
  trait GetDeviceDefinitionRequest extends js.Object {
    var DeviceDefinitionId: __string
  }

  object GetDeviceDefinitionRequest {
    def apply(DeviceDefinitionId: __string): GetDeviceDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("DeviceDefinitionId" -> DeviceDefinitionId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeviceDefinitionRequest]
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
  }

  object GetDeviceDefinitionResponse {
    def apply(Arn: js.UndefOr[__string] = js.undefined,
              CreationTimestamp: js.UndefOr[__string] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
              LatestVersion: js.UndefOr[__string] = js.undefined,
              LatestVersionArn: js.UndefOr[__string] = js.undefined,
              Name: js.UndefOr[__string] = js.undefined): GetDeviceDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastUpdatedTimestamp" -> LastUpdatedTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersion" -> LatestVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersionArn" -> LatestVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeviceDefinitionResponse]
    }
  }

  @js.native
  trait GetDeviceDefinitionVersionRequest extends js.Object {
    var DeviceDefinitionId: __string
    var DeviceDefinitionVersionId: __string
    var NextToken: js.UndefOr[__string]
  }

  object GetDeviceDefinitionVersionRequest {
    def apply(DeviceDefinitionId: __string,
              DeviceDefinitionVersionId: __string,
              NextToken: js.UndefOr[__string] = js.undefined): GetDeviceDefinitionVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceDefinitionId"        -> DeviceDefinitionId.asInstanceOf[js.Any],
        "DeviceDefinitionVersionId" -> DeviceDefinitionVersionId.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeviceDefinitionVersionRequest]
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
    def apply(Arn: js.UndefOr[__string] = js.undefined,
              CreationTimestamp: js.UndefOr[__string] = js.undefined,
              Definition: js.UndefOr[DeviceDefinitionVersion] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined,
              Version: js.UndefOr[__string] = js.undefined): GetDeviceDefinitionVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Definition" -> Definition.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeviceDefinitionVersionResponse]
    }
  }

  @js.native
  trait GetFunctionDefinitionRequest extends js.Object {
    var FunctionDefinitionId: __string
  }

  object GetFunctionDefinitionRequest {
    def apply(FunctionDefinitionId: __string): GetFunctionDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("FunctionDefinitionId" -> FunctionDefinitionId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFunctionDefinitionRequest]
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
  }

  object GetFunctionDefinitionResponse {
    def apply(Arn: js.UndefOr[__string] = js.undefined,
              CreationTimestamp: js.UndefOr[__string] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
              LatestVersion: js.UndefOr[__string] = js.undefined,
              LatestVersionArn: js.UndefOr[__string] = js.undefined,
              Name: js.UndefOr[__string] = js.undefined): GetFunctionDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastUpdatedTimestamp" -> LastUpdatedTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersion" -> LatestVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersionArn" -> LatestVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFunctionDefinitionResponse]
    }
  }

  @js.native
  trait GetFunctionDefinitionVersionRequest extends js.Object {
    var FunctionDefinitionId: __string
    var FunctionDefinitionVersionId: __string
    var NextToken: js.UndefOr[__string]
  }

  object GetFunctionDefinitionVersionRequest {
    def apply(FunctionDefinitionId: __string,
              FunctionDefinitionVersionId: __string,
              NextToken: js.UndefOr[__string] = js.undefined): GetFunctionDefinitionVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionDefinitionId"        -> FunctionDefinitionId.asInstanceOf[js.Any],
        "FunctionDefinitionVersionId" -> FunctionDefinitionVersionId.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFunctionDefinitionVersionRequest]
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
    def apply(Arn: js.UndefOr[__string] = js.undefined,
              CreationTimestamp: js.UndefOr[__string] = js.undefined,
              Definition: js.UndefOr[FunctionDefinitionVersion] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined,
              Version: js.UndefOr[__string] = js.undefined): GetFunctionDefinitionVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Definition" -> Definition.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFunctionDefinitionVersionResponse]
    }
  }

  @js.native
  trait GetGroupCertificateAuthorityRequest extends js.Object {
    var CertificateAuthorityId: __string
    var GroupId: __string
  }

  object GetGroupCertificateAuthorityRequest {
    def apply(CertificateAuthorityId: __string, GroupId: __string): GetGroupCertificateAuthorityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateAuthorityId" -> CertificateAuthorityId.asInstanceOf[js.Any],
        "GroupId"                -> GroupId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGroupCertificateAuthorityRequest]
    }
  }

  @js.native
  trait GetGroupCertificateAuthorityResponse extends js.Object {
    var GroupCertificateAuthorityArn: js.UndefOr[__string]
    var GroupCertificateAuthorityId: js.UndefOr[__string]
    var PemEncodedCertificate: js.UndefOr[__string]
  }

  object GetGroupCertificateAuthorityResponse {
    def apply(GroupCertificateAuthorityArn: js.UndefOr[__string] = js.undefined,
              GroupCertificateAuthorityId: js.UndefOr[__string] = js.undefined,
              PemEncodedCertificate: js.UndefOr[__string] = js.undefined): GetGroupCertificateAuthorityResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupCertificateAuthorityArn" -> GroupCertificateAuthorityArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GroupCertificateAuthorityId" -> GroupCertificateAuthorityId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PemEncodedCertificate" -> PemEncodedCertificate.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGroupCertificateAuthorityResponse]
    }
  }

  @js.native
  trait GetGroupCertificateConfigurationRequest extends js.Object {
    var GroupId: __string
  }

  object GetGroupCertificateConfigurationRequest {
    def apply(GroupId: __string): GetGroupCertificateConfigurationRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("GroupId" -> GroupId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGroupCertificateConfigurationRequest]
    }
  }

  @js.native
  trait GetGroupCertificateConfigurationResponse extends js.Object {
    var CertificateAuthorityExpiryInMilliseconds: js.UndefOr[__string]
    var CertificateExpiryInMilliseconds: js.UndefOr[__string]
    var GroupId: js.UndefOr[__string]
  }

  object GetGroupCertificateConfigurationResponse {
    def apply(CertificateAuthorityExpiryInMilliseconds: js.UndefOr[__string] = js.undefined,
              CertificateExpiryInMilliseconds: js.UndefOr[__string] = js.undefined,
              GroupId: js.UndefOr[__string] = js.undefined): GetGroupCertificateConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateAuthorityExpiryInMilliseconds" -> CertificateAuthorityExpiryInMilliseconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CertificateExpiryInMilliseconds" -> CertificateExpiryInMilliseconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GroupId" -> GroupId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGroupCertificateConfigurationResponse]
    }
  }

  @js.native
  trait GetGroupRequest extends js.Object {
    var GroupId: __string
  }

  object GetGroupRequest {
    def apply(GroupId: __string): GetGroupRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("GroupId" -> GroupId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGroupRequest]
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
  }

  object GetGroupResponse {
    def apply(Arn: js.UndefOr[__string] = js.undefined,
              CreationTimestamp: js.UndefOr[__string] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
              LatestVersion: js.UndefOr[__string] = js.undefined,
              LatestVersionArn: js.UndefOr[__string] = js.undefined,
              Name: js.UndefOr[__string] = js.undefined): GetGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastUpdatedTimestamp" -> LastUpdatedTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersion" -> LatestVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersionArn" -> LatestVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGroupResponse]
    }
  }

  @js.native
  trait GetGroupVersionRequest extends js.Object {
    var GroupId: __string
    var GroupVersionId: __string
  }

  object GetGroupVersionRequest {
    def apply(GroupId: __string, GroupVersionId: __string): GetGroupVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupId"        -> GroupId.asInstanceOf[js.Any],
        "GroupVersionId" -> GroupVersionId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGroupVersionRequest]
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
    def apply(Arn: js.UndefOr[__string] = js.undefined,
              CreationTimestamp: js.UndefOr[__string] = js.undefined,
              Definition: js.UndefOr[GroupVersion] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              Version: js.UndefOr[__string] = js.undefined): GetGroupVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Definition" -> Definition.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGroupVersionResponse]
    }
  }

  @js.native
  trait GetLoggerDefinitionRequest extends js.Object {
    var LoggerDefinitionId: __string
  }

  object GetLoggerDefinitionRequest {
    def apply(LoggerDefinitionId: __string): GetLoggerDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("LoggerDefinitionId" -> LoggerDefinitionId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLoggerDefinitionRequest]
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
  }

  object GetLoggerDefinitionResponse {
    def apply(Arn: js.UndefOr[__string] = js.undefined,
              CreationTimestamp: js.UndefOr[__string] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
              LatestVersion: js.UndefOr[__string] = js.undefined,
              LatestVersionArn: js.UndefOr[__string] = js.undefined,
              Name: js.UndefOr[__string] = js.undefined): GetLoggerDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastUpdatedTimestamp" -> LastUpdatedTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersion" -> LatestVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersionArn" -> LatestVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLoggerDefinitionResponse]
    }
  }

  @js.native
  trait GetLoggerDefinitionVersionRequest extends js.Object {
    var LoggerDefinitionId: __string
    var LoggerDefinitionVersionId: __string
    var NextToken: js.UndefOr[__string]
  }

  object GetLoggerDefinitionVersionRequest {
    def apply(LoggerDefinitionId: __string,
              LoggerDefinitionVersionId: __string,
              NextToken: js.UndefOr[__string] = js.undefined): GetLoggerDefinitionVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoggerDefinitionId"        -> LoggerDefinitionId.asInstanceOf[js.Any],
        "LoggerDefinitionVersionId" -> LoggerDefinitionVersionId.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLoggerDefinitionVersionRequest]
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
    def apply(Arn: js.UndefOr[__string] = js.undefined,
              CreationTimestamp: js.UndefOr[__string] = js.undefined,
              Definition: js.UndefOr[LoggerDefinitionVersion] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              Version: js.UndefOr[__string] = js.undefined): GetLoggerDefinitionVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Definition" -> Definition.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetLoggerDefinitionVersionResponse]
    }
  }

  @js.native
  trait GetResourceDefinitionRequest extends js.Object {
    var ResourceDefinitionId: __string
  }

  object GetResourceDefinitionRequest {
    def apply(ResourceDefinitionId: __string): GetResourceDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("ResourceDefinitionId" -> ResourceDefinitionId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourceDefinitionRequest]
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
  }

  object GetResourceDefinitionResponse {
    def apply(Arn: js.UndefOr[__string] = js.undefined,
              CreationTimestamp: js.UndefOr[__string] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
              LatestVersion: js.UndefOr[__string] = js.undefined,
              LatestVersionArn: js.UndefOr[__string] = js.undefined,
              Name: js.UndefOr[__string] = js.undefined): GetResourceDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastUpdatedTimestamp" -> LastUpdatedTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersion" -> LatestVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersionArn" -> LatestVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourceDefinitionResponse]
    }
  }

  @js.native
  trait GetResourceDefinitionVersionRequest extends js.Object {
    var ResourceDefinitionId: __string
    var ResourceDefinitionVersionId: __string
  }

  object GetResourceDefinitionVersionRequest {
    def apply(ResourceDefinitionId: __string,
              ResourceDefinitionVersionId: __string): GetResourceDefinitionVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceDefinitionId"        -> ResourceDefinitionId.asInstanceOf[js.Any],
        "ResourceDefinitionVersionId" -> ResourceDefinitionVersionId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourceDefinitionVersionRequest]
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
    def apply(Arn: js.UndefOr[__string] = js.undefined,
              CreationTimestamp: js.UndefOr[__string] = js.undefined,
              Definition: js.UndefOr[ResourceDefinitionVersion] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              Version: js.UndefOr[__string] = js.undefined): GetResourceDefinitionVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Definition" -> Definition.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourceDefinitionVersionResponse]
    }
  }

  @js.native
  trait GetServiceRoleForAccountRequest extends js.Object {}

  object GetServiceRoleForAccountRequest {
    def apply(): GetServiceRoleForAccountRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetServiceRoleForAccountRequest]
    }
  }

  @js.native
  trait GetServiceRoleForAccountResponse extends js.Object {
    var AssociatedAt: js.UndefOr[__string]
    var RoleArn: js.UndefOr[__string]
  }

  object GetServiceRoleForAccountResponse {
    def apply(AssociatedAt: js.UndefOr[__string] = js.undefined,
              RoleArn: js.UndefOr[__string] = js.undefined): GetServiceRoleForAccountResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("AssociatedAt" -> AssociatedAt.map { x =>
        x.asInstanceOf[js.Any]
      }, "RoleArn" -> RoleArn.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetServiceRoleForAccountResponse]
    }
  }

  @js.native
  trait GetSubscriptionDefinitionRequest extends js.Object {
    var SubscriptionDefinitionId: __string
  }

  object GetSubscriptionDefinitionRequest {
    def apply(SubscriptionDefinitionId: __string): GetSubscriptionDefinitionRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("SubscriptionDefinitionId" -> SubscriptionDefinitionId.asInstanceOf[js.Any])
          .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSubscriptionDefinitionRequest]
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
  }

  object GetSubscriptionDefinitionResponse {
    def apply(Arn: js.UndefOr[__string] = js.undefined,
              CreationTimestamp: js.UndefOr[__string] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
              LatestVersion: js.UndefOr[__string] = js.undefined,
              LatestVersionArn: js.UndefOr[__string] = js.undefined,
              Name: js.UndefOr[__string] = js.undefined): GetSubscriptionDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastUpdatedTimestamp" -> LastUpdatedTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersion" -> LatestVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersionArn" -> LatestVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSubscriptionDefinitionResponse]
    }
  }

  @js.native
  trait GetSubscriptionDefinitionVersionRequest extends js.Object {
    var SubscriptionDefinitionId: __string
    var SubscriptionDefinitionVersionId: __string
    var NextToken: js.UndefOr[__string]
  }

  object GetSubscriptionDefinitionVersionRequest {
    def apply(SubscriptionDefinitionId: __string,
              SubscriptionDefinitionVersionId: __string,
              NextToken: js.UndefOr[__string] = js.undefined): GetSubscriptionDefinitionVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubscriptionDefinitionId"        -> SubscriptionDefinitionId.asInstanceOf[js.Any],
        "SubscriptionDefinitionVersionId" -> SubscriptionDefinitionVersionId.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSubscriptionDefinitionVersionRequest]
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
    def apply(Arn: js.UndefOr[__string] = js.undefined,
              CreationTimestamp: js.UndefOr[__string] = js.undefined,
              Definition: js.UndefOr[SubscriptionDefinitionVersion] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined,
              Version: js.UndefOr[__string] = js.undefined): GetSubscriptionDefinitionVersionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Definition" -> Definition.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSubscriptionDefinitionVersionResponse]
    }
  }

  /**
    * Information about a certificate authority for a group.
    */
  @js.native
  trait GroupCertificateAuthorityProperties extends js.Object {
    var GroupCertificateAuthorityArn: js.UndefOr[__string]
    var GroupCertificateAuthorityId: js.UndefOr[__string]
  }

  object GroupCertificateAuthorityProperties {
    def apply(GroupCertificateAuthorityArn: js.UndefOr[__string] = js.undefined,
              GroupCertificateAuthorityId: js.UndefOr[__string] = js.undefined): GroupCertificateAuthorityProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupCertificateAuthorityArn" -> GroupCertificateAuthorityArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GroupCertificateAuthorityId" -> GroupCertificateAuthorityId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GroupCertificateAuthorityProperties]
    }
  }

  /**
    * Information about a group.
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
    def apply(Arn: js.UndefOr[__string] = js.undefined,
              CreationTimestamp: js.UndefOr[__string] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined,
              LatestVersion: js.UndefOr[__string] = js.undefined,
              LatestVersionArn: js.UndefOr[__string] = js.undefined,
              Name: js.UndefOr[__string] = js.undefined): GroupInformation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastUpdatedTimestamp" -> LastUpdatedTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersion" -> LatestVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestVersionArn" -> LatestVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GroupInformation]
    }
  }

  /**
    * Group owner related settings for local resources.
    */
  @js.native
  trait GroupOwnerSetting extends js.Object {
    var AutoAddGroupOwner: js.UndefOr[__boolean]
    var GroupOwner: js.UndefOr[__string]
  }

  object GroupOwnerSetting {
    def apply(AutoAddGroupOwner: js.UndefOr[__boolean] = js.undefined,
              GroupOwner: js.UndefOr[__string] = js.undefined): GroupOwnerSetting = {
      val _fields = IndexedSeq[(String, js.Any)]("AutoAddGroupOwner" -> AutoAddGroupOwner.map { x =>
        x.asInstanceOf[js.Any]
      }, "GroupOwner" -> GroupOwner.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GroupOwnerSetting]
    }
  }

  /**
    * Information about a group version.
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
    def apply(ConnectorDefinitionVersionArn: js.UndefOr[__string] = js.undefined,
              CoreDefinitionVersionArn: js.UndefOr[__string] = js.undefined,
              DeviceDefinitionVersionArn: js.UndefOr[__string] = js.undefined,
              FunctionDefinitionVersionArn: js.UndefOr[__string] = js.undefined,
              LoggerDefinitionVersionArn: js.UndefOr[__string] = js.undefined,
              ResourceDefinitionVersionArn: js.UndefOr[__string] = js.undefined,
              SubscriptionDefinitionVersionArn: js.UndefOr[__string] = js.undefined): GroupVersion = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConnectorDefinitionVersionArn" -> ConnectorDefinitionVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CoreDefinitionVersionArn" -> CoreDefinitionVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeviceDefinitionVersionArn" -> DeviceDefinitionVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FunctionDefinitionVersionArn" -> FunctionDefinitionVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LoggerDefinitionVersionArn" -> LoggerDefinitionVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceDefinitionVersionArn" -> ResourceDefinitionVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SubscriptionDefinitionVersionArn" -> SubscriptionDefinitionVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GroupVersion]
    }
  }

  @js.native
  trait ListBulkDeploymentDetailedReportsRequest extends js.Object {
    var BulkDeploymentId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListBulkDeploymentDetailedReportsRequest {
    def apply(BulkDeploymentId: __string,
              MaxResults: js.UndefOr[__string] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListBulkDeploymentDetailedReportsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BulkDeploymentId" -> BulkDeploymentId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBulkDeploymentDetailedReportsRequest]
    }
  }

  @js.native
  trait ListBulkDeploymentDetailedReportsResponse extends js.Object {
    var Deployments: js.UndefOr[BulkDeploymentResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListBulkDeploymentDetailedReportsResponse {
    def apply(Deployments: js.UndefOr[BulkDeploymentResults] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListBulkDeploymentDetailedReportsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Deployments" -> Deployments.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBulkDeploymentDetailedReportsResponse]
    }
  }

  @js.native
  trait ListBulkDeploymentsRequest extends js.Object {
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListBulkDeploymentsRequest {
    def apply(MaxResults: js.UndefOr[__string] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListBulkDeploymentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("MaxResults" -> MaxResults.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBulkDeploymentsRequest]
    }
  }

  @js.native
  trait ListBulkDeploymentsResponse extends js.Object {
    var BulkDeployments: js.UndefOr[BulkDeployments]
    var NextToken: js.UndefOr[__string]
  }

  object ListBulkDeploymentsResponse {
    def apply(BulkDeployments: js.UndefOr[BulkDeployments] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListBulkDeploymentsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("BulkDeployments" -> BulkDeployments.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBulkDeploymentsResponse]
    }
  }

  @js.native
  trait ListConnectorDefinitionVersionsRequest extends js.Object {
    var ConnectorDefinitionId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListConnectorDefinitionVersionsRequest {
    def apply(ConnectorDefinitionId: __string,
              MaxResults: js.UndefOr[__string] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListConnectorDefinitionVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConnectorDefinitionId" -> ConnectorDefinitionId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListConnectorDefinitionVersionsRequest]
    }
  }

  @js.native
  trait ListConnectorDefinitionVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Versions: js.UndefOr[__listOfVersionInformation]
  }

  object ListConnectorDefinitionVersionsResponse {
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        Versions: js.UndefOr[__listOfVersionInformation] = js.undefined
    ): ListConnectorDefinitionVersionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }, "Versions" -> Versions.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListConnectorDefinitionVersionsResponse]
    }
  }

  @js.native
  trait ListConnectorDefinitionsRequest extends js.Object {
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListConnectorDefinitionsRequest {
    def apply(MaxResults: js.UndefOr[__string] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListConnectorDefinitionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("MaxResults" -> MaxResults.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListConnectorDefinitionsRequest]
    }
  }

  @js.native
  trait ListConnectorDefinitionsResponse extends js.Object {
    var Definitions: js.UndefOr[__listOfDefinitionInformation]
    var NextToken: js.UndefOr[__string]
  }

  object ListConnectorDefinitionsResponse {
    def apply(Definitions: js.UndefOr[__listOfDefinitionInformation] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListConnectorDefinitionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Definitions" -> Definitions.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListConnectorDefinitionsResponse]
    }
  }

  @js.native
  trait ListCoreDefinitionVersionsRequest extends js.Object {
    var CoreDefinitionId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListCoreDefinitionVersionsRequest {
    def apply(CoreDefinitionId: __string,
              MaxResults: js.UndefOr[__string] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListCoreDefinitionVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CoreDefinitionId" -> CoreDefinitionId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCoreDefinitionVersionsRequest]
    }
  }

  @js.native
  trait ListCoreDefinitionVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Versions: js.UndefOr[__listOfVersionInformation]
  }

  object ListCoreDefinitionVersionsResponse {
    def apply(NextToken: js.UndefOr[__string] = js.undefined,
              Versions: js.UndefOr[__listOfVersionInformation] = js.undefined): ListCoreDefinitionVersionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }, "Versions" -> Versions.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCoreDefinitionVersionsResponse]
    }
  }

  @js.native
  trait ListCoreDefinitionsRequest extends js.Object {
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListCoreDefinitionsRequest {
    def apply(MaxResults: js.UndefOr[__string] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListCoreDefinitionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("MaxResults" -> MaxResults.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCoreDefinitionsRequest]
    }
  }

  @js.native
  trait ListCoreDefinitionsResponse extends js.Object {
    var Definitions: js.UndefOr[__listOfDefinitionInformation]
    var NextToken: js.UndefOr[__string]
  }

  object ListCoreDefinitionsResponse {
    def apply(Definitions: js.UndefOr[__listOfDefinitionInformation] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListCoreDefinitionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Definitions" -> Definitions.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListCoreDefinitionsResponse]
    }
  }

  @js.native
  trait ListDeploymentsRequest extends js.Object {
    var GroupId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListDeploymentsRequest {
    def apply(GroupId: __string,
              MaxResults: js.UndefOr[__string] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListDeploymentsRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("GroupId" -> GroupId.asInstanceOf[js.Any], "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        }, "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeploymentsRequest]
    }
  }

  @js.native
  trait ListDeploymentsResponse extends js.Object {
    var Deployments: js.UndefOr[Deployments]
    var NextToken: js.UndefOr[__string]
  }

  object ListDeploymentsResponse {
    def apply(Deployments: js.UndefOr[Deployments] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListDeploymentsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Deployments" -> Deployments.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeploymentsResponse]
    }
  }

  @js.native
  trait ListDeviceDefinitionVersionsRequest extends js.Object {
    var DeviceDefinitionId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListDeviceDefinitionVersionsRequest {
    def apply(DeviceDefinitionId: __string,
              MaxResults: js.UndefOr[__string] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListDeviceDefinitionVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceDefinitionId" -> DeviceDefinitionId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeviceDefinitionVersionsRequest]
    }
  }

  @js.native
  trait ListDeviceDefinitionVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Versions: js.UndefOr[__listOfVersionInformation]
  }

  object ListDeviceDefinitionVersionsResponse {
    def apply(NextToken: js.UndefOr[__string] = js.undefined,
              Versions: js.UndefOr[__listOfVersionInformation] = js.undefined): ListDeviceDefinitionVersionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }, "Versions" -> Versions.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeviceDefinitionVersionsResponse]
    }
  }

  @js.native
  trait ListDeviceDefinitionsRequest extends js.Object {
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListDeviceDefinitionsRequest {
    def apply(MaxResults: js.UndefOr[__string] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListDeviceDefinitionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("MaxResults" -> MaxResults.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeviceDefinitionsRequest]
    }
  }

  @js.native
  trait ListDeviceDefinitionsResponse extends js.Object {
    var Definitions: js.UndefOr[__listOfDefinitionInformation]
    var NextToken: js.UndefOr[__string]
  }

  object ListDeviceDefinitionsResponse {
    def apply(Definitions: js.UndefOr[__listOfDefinitionInformation] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListDeviceDefinitionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Definitions" -> Definitions.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeviceDefinitionsResponse]
    }
  }

  @js.native
  trait ListFunctionDefinitionVersionsRequest extends js.Object {
    var FunctionDefinitionId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListFunctionDefinitionVersionsRequest {
    def apply(FunctionDefinitionId: __string,
              MaxResults: js.UndefOr[__string] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListFunctionDefinitionVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionDefinitionId" -> FunctionDefinitionId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFunctionDefinitionVersionsRequest]
    }
  }

  @js.native
  trait ListFunctionDefinitionVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Versions: js.UndefOr[__listOfVersionInformation]
  }

  object ListFunctionDefinitionVersionsResponse {
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        Versions: js.UndefOr[__listOfVersionInformation] = js.undefined
    ): ListFunctionDefinitionVersionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }, "Versions" -> Versions.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFunctionDefinitionVersionsResponse]
    }
  }

  @js.native
  trait ListFunctionDefinitionsRequest extends js.Object {
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListFunctionDefinitionsRequest {
    def apply(MaxResults: js.UndefOr[__string] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListFunctionDefinitionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("MaxResults" -> MaxResults.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFunctionDefinitionsRequest]
    }
  }

  @js.native
  trait ListFunctionDefinitionsResponse extends js.Object {
    var Definitions: js.UndefOr[__listOfDefinitionInformation]
    var NextToken: js.UndefOr[__string]
  }

  object ListFunctionDefinitionsResponse {
    def apply(Definitions: js.UndefOr[__listOfDefinitionInformation] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListFunctionDefinitionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Definitions" -> Definitions.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFunctionDefinitionsResponse]
    }
  }

  @js.native
  trait ListGroupCertificateAuthoritiesRequest extends js.Object {
    var GroupId: __string
  }

  object ListGroupCertificateAuthoritiesRequest {
    def apply(GroupId: __string): ListGroupCertificateAuthoritiesRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("GroupId" -> GroupId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGroupCertificateAuthoritiesRequest]
    }
  }

  @js.native
  trait ListGroupCertificateAuthoritiesResponse extends js.Object {
    var GroupCertificateAuthorities: js.UndefOr[__listOfGroupCertificateAuthorityProperties]
  }

  object ListGroupCertificateAuthoritiesResponse {
    def apply(
        GroupCertificateAuthorities: js.UndefOr[__listOfGroupCertificateAuthorityProperties] = js.undefined
    ): ListGroupCertificateAuthoritiesResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("GroupCertificateAuthorities" -> GroupCertificateAuthorities.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGroupCertificateAuthoritiesResponse]
    }
  }

  @js.native
  trait ListGroupVersionsRequest extends js.Object {
    var GroupId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListGroupVersionsRequest {
    def apply(GroupId: __string,
              MaxResults: js.UndefOr[__string] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListGroupVersionsRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("GroupId" -> GroupId.asInstanceOf[js.Any], "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        }, "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGroupVersionsRequest]
    }
  }

  @js.native
  trait ListGroupVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Versions: js.UndefOr[__listOfVersionInformation]
  }

  object ListGroupVersionsResponse {
    def apply(NextToken: js.UndefOr[__string] = js.undefined,
              Versions: js.UndefOr[__listOfVersionInformation] = js.undefined): ListGroupVersionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }, "Versions" -> Versions.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGroupVersionsResponse]
    }
  }

  @js.native
  trait ListGroupsRequest extends js.Object {
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListGroupsRequest {
    def apply(MaxResults: js.UndefOr[__string] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("MaxResults" -> MaxResults.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGroupsRequest]
    }
  }

  @js.native
  trait ListGroupsResponse extends js.Object {
    var Groups: js.UndefOr[__listOfGroupInformation]
    var NextToken: js.UndefOr[__string]
  }

  object ListGroupsResponse {
    def apply(Groups: js.UndefOr[__listOfGroupInformation] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListGroupsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Groups" -> Groups.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGroupsResponse]
    }
  }

  @js.native
  trait ListLoggerDefinitionVersionsRequest extends js.Object {
    var LoggerDefinitionId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListLoggerDefinitionVersionsRequest {
    def apply(LoggerDefinitionId: __string,
              MaxResults: js.UndefOr[__string] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListLoggerDefinitionVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoggerDefinitionId" -> LoggerDefinitionId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLoggerDefinitionVersionsRequest]
    }
  }

  @js.native
  trait ListLoggerDefinitionVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Versions: js.UndefOr[__listOfVersionInformation]
  }

  object ListLoggerDefinitionVersionsResponse {
    def apply(NextToken: js.UndefOr[__string] = js.undefined,
              Versions: js.UndefOr[__listOfVersionInformation] = js.undefined): ListLoggerDefinitionVersionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }, "Versions" -> Versions.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLoggerDefinitionVersionsResponse]
    }
  }

  @js.native
  trait ListLoggerDefinitionsRequest extends js.Object {
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListLoggerDefinitionsRequest {
    def apply(MaxResults: js.UndefOr[__string] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListLoggerDefinitionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("MaxResults" -> MaxResults.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLoggerDefinitionsRequest]
    }
  }

  @js.native
  trait ListLoggerDefinitionsResponse extends js.Object {
    var Definitions: js.UndefOr[__listOfDefinitionInformation]
    var NextToken: js.UndefOr[__string]
  }

  object ListLoggerDefinitionsResponse {
    def apply(Definitions: js.UndefOr[__listOfDefinitionInformation] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListLoggerDefinitionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Definitions" -> Definitions.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListLoggerDefinitionsResponse]
    }
  }

  @js.native
  trait ListResourceDefinitionVersionsRequest extends js.Object {
    var ResourceDefinitionId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListResourceDefinitionVersionsRequest {
    def apply(ResourceDefinitionId: __string,
              MaxResults: js.UndefOr[__string] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListResourceDefinitionVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceDefinitionId" -> ResourceDefinitionId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourceDefinitionVersionsRequest]
    }
  }

  @js.native
  trait ListResourceDefinitionVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Versions: js.UndefOr[__listOfVersionInformation]
  }

  object ListResourceDefinitionVersionsResponse {
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        Versions: js.UndefOr[__listOfVersionInformation] = js.undefined
    ): ListResourceDefinitionVersionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }, "Versions" -> Versions.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourceDefinitionVersionsResponse]
    }
  }

  @js.native
  trait ListResourceDefinitionsRequest extends js.Object {
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListResourceDefinitionsRequest {
    def apply(MaxResults: js.UndefOr[__string] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListResourceDefinitionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("MaxResults" -> MaxResults.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourceDefinitionsRequest]
    }
  }

  @js.native
  trait ListResourceDefinitionsResponse extends js.Object {
    var Definitions: js.UndefOr[__listOfDefinitionInformation]
    var NextToken: js.UndefOr[__string]
  }

  object ListResourceDefinitionsResponse {
    def apply(Definitions: js.UndefOr[__listOfDefinitionInformation] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListResourceDefinitionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Definitions" -> Definitions.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResourceDefinitionsResponse]
    }
  }

  @js.native
  trait ListSubscriptionDefinitionVersionsRequest extends js.Object {
    var SubscriptionDefinitionId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListSubscriptionDefinitionVersionsRequest {
    def apply(SubscriptionDefinitionId: __string,
              MaxResults: js.UndefOr[__string] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListSubscriptionDefinitionVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubscriptionDefinitionId" -> SubscriptionDefinitionId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSubscriptionDefinitionVersionsRequest]
    }
  }

  @js.native
  trait ListSubscriptionDefinitionVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[__string]
    var Versions: js.UndefOr[__listOfVersionInformation]
  }

  object ListSubscriptionDefinitionVersionsResponse {
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        Versions: js.UndefOr[__listOfVersionInformation] = js.undefined
    ): ListSubscriptionDefinitionVersionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }, "Versions" -> Versions.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[ListSubscriptionDefinitionVersionsResponse]
    }
  }

  @js.native
  trait ListSubscriptionDefinitionsRequest extends js.Object {
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object ListSubscriptionDefinitionsRequest {
    def apply(MaxResults: js.UndefOr[__string] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListSubscriptionDefinitionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("MaxResults" -> MaxResults.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSubscriptionDefinitionsRequest]
    }
  }

  @js.native
  trait ListSubscriptionDefinitionsResponse extends js.Object {
    var Definitions: js.UndefOr[__listOfDefinitionInformation]
    var NextToken: js.UndefOr[__string]
  }

  object ListSubscriptionDefinitionsResponse {
    def apply(Definitions: js.UndefOr[__listOfDefinitionInformation] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListSubscriptionDefinitionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Definitions" -> Definitions.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSubscriptionDefinitionsResponse]
    }
  }

  /**
    * Attributes that define a local device resource.
    */
  @js.native
  trait LocalDeviceResourceData extends js.Object {
    var GroupOwnerSetting: js.UndefOr[GroupOwnerSetting]
    var SourcePath: js.UndefOr[__string]
  }

  object LocalDeviceResourceData {
    def apply(GroupOwnerSetting: js.UndefOr[GroupOwnerSetting] = js.undefined,
              SourcePath: js.UndefOr[__string] = js.undefined): LocalDeviceResourceData = {
      val _fields = IndexedSeq[(String, js.Any)]("GroupOwnerSetting" -> GroupOwnerSetting.map { x =>
        x.asInstanceOf[js.Any]
      }, "SourcePath" -> SourcePath.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LocalDeviceResourceData]
    }
  }

  /**
    * Attributes that define a local volume resource.
    */
  @js.native
  trait LocalVolumeResourceData extends js.Object {
    var DestinationPath: js.UndefOr[__string]
    var GroupOwnerSetting: js.UndefOr[GroupOwnerSetting]
    var SourcePath: js.UndefOr[__string]
  }

  object LocalVolumeResourceData {
    def apply(DestinationPath: js.UndefOr[__string] = js.undefined,
              GroupOwnerSetting: js.UndefOr[GroupOwnerSetting] = js.undefined,
              SourcePath: js.UndefOr[__string] = js.undefined): LocalVolumeResourceData = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DestinationPath" -> DestinationPath.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GroupOwnerSetting" -> GroupOwnerSetting.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourcePath" -> SourcePath.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LocalVolumeResourceData]
    }
  }

  /**
    * Information about a logger
    */
  @js.native
  trait Logger extends js.Object {
    var Component: js.UndefOr[LoggerComponent]
    var Id: js.UndefOr[__string]
    var Level: js.UndefOr[LoggerLevel]
    var Space: js.UndefOr[__integer]
    var Type: js.UndefOr[LoggerType]
  }

  object Logger {
    def apply(Component: js.UndefOr[LoggerComponent] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              Level: js.UndefOr[LoggerLevel] = js.undefined,
              Space: js.UndefOr[__integer] = js.undefined,
              Type: js.UndefOr[LoggerType] = js.undefined): Logger = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Component" -> Component.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Level" -> Level.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Space" -> Space.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Logger]
    }
  }

  object LoggerComponentEnum {
    val GreengrassSystem = "GreengrassSystem"
    val Lambda           = "Lambda"

    val values = IndexedSeq(GreengrassSystem, Lambda)
  }

  /**
    * Information about a logger definition version.
    */
  @js.native
  trait LoggerDefinitionVersion extends js.Object {
    var Loggers: js.UndefOr[__listOfLogger]
  }

  object LoggerDefinitionVersion {
    def apply(Loggers: js.UndefOr[__listOfLogger] = js.undefined): LoggerDefinitionVersion = {
      val _fields = IndexedSeq[(String, js.Any)]("Loggers" -> Loggers.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoggerDefinitionVersion]
    }
  }

  object LoggerLevelEnum {
    val DEBUG = "DEBUG"
    val INFO  = "INFO"
    val WARN  = "WARN"
    val ERROR = "ERROR"
    val FATAL = "FATAL"

    val values = IndexedSeq(DEBUG, INFO, WARN, ERROR, FATAL)
  }

  object LoggerTypeEnum {
    val FileSystem    = "FileSystem"
    val AWSCloudWatch = "AWSCloudWatch"

    val values = IndexedSeq(FileSystem, AWSCloudWatch)
  }

  /**
    * The type of permission a function has to access a resource.
    */
  object PermissionEnum {
    val ro = "ro"
    val rw = "rw"

    val values = IndexedSeq(ro, rw)
  }

  /**
    * Information needed to reset deployments.
    */
  @js.native
  trait ResetDeploymentsRequest extends js.Object {
    var GroupId: __string
    var AmznClientToken: js.UndefOr[__string]
    var Force: js.UndefOr[__boolean]
  }

  object ResetDeploymentsRequest {
    def apply(GroupId: __string,
              AmznClientToken: js.UndefOr[__string] = js.undefined,
              Force: js.UndefOr[__boolean] = js.undefined): ResetDeploymentsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupId" -> GroupId.asInstanceOf[js.Any],
        "AmznClientToken" -> AmznClientToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Force" -> Force.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetDeploymentsRequest]
    }
  }

  @js.native
  trait ResetDeploymentsResponse extends js.Object {
    var DeploymentArn: js.UndefOr[__string]
    var DeploymentId: js.UndefOr[__string]
  }

  object ResetDeploymentsResponse {
    def apply(DeploymentArn: js.UndefOr[__string] = js.undefined,
              DeploymentId: js.UndefOr[__string] = js.undefined): ResetDeploymentsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("DeploymentArn" -> DeploymentArn.map { x =>
        x.asInstanceOf[js.Any]
      }, "DeploymentId" -> DeploymentId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResetDeploymentsResponse]
    }
  }

  /**
    * Information about a resource.
    */
  @js.native
  trait Resource extends js.Object {
    var Id: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
    var ResourceDataContainer: js.UndefOr[ResourceDataContainer]
  }

  object Resource {
    def apply(Id: js.UndefOr[__string] = js.undefined,
              Name: js.UndefOr[__string] = js.undefined,
              ResourceDataContainer: js.UndefOr[ResourceDataContainer] = js.undefined): Resource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceDataContainer" -> ResourceDataContainer.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Resource]
    }
  }

  /**
    * A policy used by the function to access a resource.
    */
  @js.native
  trait ResourceAccessPolicy extends js.Object {
    var Permission: js.UndefOr[Permission]
    var ResourceId: js.UndefOr[__string]
  }

  object ResourceAccessPolicy {
    def apply(Permission: js.UndefOr[Permission] = js.undefined,
              ResourceId: js.UndefOr[__string] = js.undefined): ResourceAccessPolicy = {
      val _fields = IndexedSeq[(String, js.Any)]("Permission" -> Permission.map { x =>
        x.asInstanceOf[js.Any]
      }, "ResourceId" -> ResourceId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceAccessPolicy]
    }
  }

  /**
    * A container for resource data. The container takes only one of the following supported resource data types: ''LocalDeviceResourceData'', ''LocalVolumeResourceData'', ''SageMakerMachineLearningModelResourceData'', ''S3MachineLearningModelResourceData'', ''SecretsManagerSecretResourceData''.
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
    def apply(
        LocalDeviceResourceData: js.UndefOr[LocalDeviceResourceData] = js.undefined,
        LocalVolumeResourceData: js.UndefOr[LocalVolumeResourceData] = js.undefined,
        S3MachineLearningModelResourceData: js.UndefOr[S3MachineLearningModelResourceData] = js.undefined,
        SageMakerMachineLearningModelResourceData: js.UndefOr[SageMakerMachineLearningModelResourceData] = js.undefined,
        SecretsManagerSecretResourceData: js.UndefOr[SecretsManagerSecretResourceData] = js.undefined
    ): ResourceDataContainer = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LocalDeviceResourceData" -> LocalDeviceResourceData.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LocalVolumeResourceData" -> LocalVolumeResourceData.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3MachineLearningModelResourceData" -> S3MachineLearningModelResourceData.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SageMakerMachineLearningModelResourceData" -> SageMakerMachineLearningModelResourceData.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecretsManagerSecretResourceData" -> SecretsManagerSecretResourceData.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceDataContainer]
    }
  }

  /**
    * Information about a resource definition version.
    */
  @js.native
  trait ResourceDefinitionVersion extends js.Object {
    var Resources: js.UndefOr[__listOfResource]
  }

  object ResourceDefinitionVersion {
    def apply(Resources: js.UndefOr[__listOfResource] = js.undefined): ResourceDefinitionVersion = {
      val _fields = IndexedSeq[(String, js.Any)]("Resources" -> Resources.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceDefinitionVersion]
    }
  }

  /**
    * Attributes that define an Amazon S3 machine learning resource.
    */
  @js.native
  trait S3MachineLearningModelResourceData extends js.Object {
    var DestinationPath: js.UndefOr[__string]
    var S3Uri: js.UndefOr[__string]
  }

  object S3MachineLearningModelResourceData {
    def apply(DestinationPath: js.UndefOr[__string] = js.undefined,
              S3Uri: js.UndefOr[__string] = js.undefined): S3MachineLearningModelResourceData = {
      val _fields = IndexedSeq[(String, js.Any)]("DestinationPath" -> DestinationPath.map { x =>
        x.asInstanceOf[js.Any]
      }, "S3Uri" -> S3Uri.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3MachineLearningModelResourceData]
    }
  }

  /**
    * Attributes that define an Amazon SageMaker machine learning resource.
    */
  @js.native
  trait SageMakerMachineLearningModelResourceData extends js.Object {
    var DestinationPath: js.UndefOr[__string]
    var SageMakerJobArn: js.UndefOr[__string]
  }

  object SageMakerMachineLearningModelResourceData {
    def apply(DestinationPath: js.UndefOr[__string] = js.undefined,
              SageMakerJobArn: js.UndefOr[__string] = js.undefined): SageMakerMachineLearningModelResourceData = {
      val _fields = IndexedSeq[(String, js.Any)]("DestinationPath" -> DestinationPath.map { x =>
        x.asInstanceOf[js.Any]
      }, "SageMakerJobArn" -> SageMakerJobArn.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SageMakerMachineLearningModelResourceData]
    }
  }

  /**
    * Attributes that define a secret resource, which references a secret from AWS Secrets Manager. AWS IoT Greengrass stores a local, encrypted copy of the secret on the Greengrass core, where it can be securely accessed by connectors and Lambda functions.
    */
  @js.native
  trait SecretsManagerSecretResourceData extends js.Object {
    var ARN: js.UndefOr[__string]
    var AdditionalStagingLabelsToDownload: js.UndefOr[__listOf__string]
  }

  object SecretsManagerSecretResourceData {
    def apply(
        ARN: js.UndefOr[__string] = js.undefined,
        AdditionalStagingLabelsToDownload: js.UndefOr[__listOf__string] = js.undefined
    ): SecretsManagerSecretResourceData = {
      val _fields = IndexedSeq[(String, js.Any)]("ARN" -> ARN.map { x =>
        x.asInstanceOf[js.Any]
      }, "AdditionalStagingLabelsToDownload" -> AdditionalStagingLabelsToDownload.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SecretsManagerSecretResourceData]
    }
  }

  /**
    * The piece of software on the Greengrass core that will be updated.
    */
  object SoftwareToUpdateEnum {
    val core      = "core"
    val ota_agent = "ota_agent"

    val values = IndexedSeq(core, ota_agent)
  }

  @js.native
  trait StartBulkDeploymentRequest extends js.Object {
    var AmznClientToken: js.UndefOr[__string]
    var ExecutionRoleArn: js.UndefOr[__string]
    var InputFileUri: js.UndefOr[__string]
  }

  object StartBulkDeploymentRequest {
    def apply(AmznClientToken: js.UndefOr[__string] = js.undefined,
              ExecutionRoleArn: js.UndefOr[__string] = js.undefined,
              InputFileUri: js.UndefOr[__string] = js.undefined): StartBulkDeploymentRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AmznClientToken" -> AmznClientToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExecutionRoleArn" -> ExecutionRoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InputFileUri" -> InputFileUri.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartBulkDeploymentRequest]
    }
  }

  @js.native
  trait StartBulkDeploymentResponse extends js.Object {
    var BulkDeploymentArn: js.UndefOr[__string]
    var BulkDeploymentId: js.UndefOr[__string]
  }

  object StartBulkDeploymentResponse {
    def apply(BulkDeploymentArn: js.UndefOr[__string] = js.undefined,
              BulkDeploymentId: js.UndefOr[__string] = js.undefined): StartBulkDeploymentResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("BulkDeploymentArn" -> BulkDeploymentArn.map { x =>
        x.asInstanceOf[js.Any]
      }, "BulkDeploymentId" -> BulkDeploymentId.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartBulkDeploymentResponse]
    }
  }

  @js.native
  trait StopBulkDeploymentRequest extends js.Object {
    var BulkDeploymentId: __string
  }

  object StopBulkDeploymentRequest {
    def apply(BulkDeploymentId: __string): StopBulkDeploymentRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("BulkDeploymentId" -> BulkDeploymentId.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopBulkDeploymentRequest]
    }
  }

  @js.native
  trait StopBulkDeploymentResponse extends js.Object {}

  object StopBulkDeploymentResponse {
    def apply(): StopBulkDeploymentResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopBulkDeploymentResponse]
    }
  }

  /**
    * Information about a subscription.
    */
  @js.native
  trait Subscription extends js.Object {
    var Id: js.UndefOr[__string]
    var Source: js.UndefOr[__string]
    var Subject: js.UndefOr[__string]
    var Target: js.UndefOr[__string]
  }

  object Subscription {
    def apply(Id: js.UndefOr[__string] = js.undefined,
              Source: js.UndefOr[__string] = js.undefined,
              Subject: js.UndefOr[__string] = js.undefined,
              Target: js.UndefOr[__string] = js.undefined): Subscription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Source" -> Source.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Subject" -> Subject.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Target" -> Target.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Subscription]
    }
  }

  /**
    * Information about a subscription definition version.
    */
  @js.native
  trait SubscriptionDefinitionVersion extends js.Object {
    var Subscriptions: js.UndefOr[__listOfSubscription]
  }

  object SubscriptionDefinitionVersion {
    def apply(Subscriptions: js.UndefOr[__listOfSubscription] = js.undefined): SubscriptionDefinitionVersion = {
      val _fields = IndexedSeq[(String, js.Any)]("Subscriptions" -> Subscriptions.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubscriptionDefinitionVersion]
    }
  }

  /**
    * The minimum level of log statements that should be logged by the OTA Agent during an update.
    */
  object UpdateAgentLogLevelEnum {
    val NONE    = "NONE"
    val TRACE   = "TRACE"
    val DEBUG   = "DEBUG"
    val VERBOSE = "VERBOSE"
    val INFO    = "INFO"
    val WARN    = "WARN"
    val ERROR   = "ERROR"
    val FATAL   = "FATAL"

    val values = IndexedSeq(NONE, TRACE, DEBUG, VERBOSE, INFO, WARN, ERROR, FATAL)
  }

  /**
    * Connectivity information.
    */
  @js.native
  trait UpdateConnectivityInfoRequest extends js.Object {
    var ThingName: __string
    var ConnectivityInfo: js.UndefOr[__listOfConnectivityInfo]
  }

  object UpdateConnectivityInfoRequest {
    def apply(ThingName: __string,
              ConnectivityInfo: js.UndefOr[__listOfConnectivityInfo] = js.undefined): UpdateConnectivityInfoRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ThingName" -> ThingName.asInstanceOf[js.Any],
        "ConnectivityInfo" -> ConnectivityInfo.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateConnectivityInfoRequest]
    }
  }

  @js.native
  trait UpdateConnectivityInfoResponse extends js.Object {
    var Message: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  object UpdateConnectivityInfoResponse {
    def apply(Message: js.UndefOr[__string] = js.undefined,
              Version: js.UndefOr[__string] = js.undefined): UpdateConnectivityInfoResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Message" -> Message.map { x =>
        x.asInstanceOf[js.Any]
      }, "Version" -> Version.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateConnectivityInfoResponse]
    }
  }

  @js.native
  trait UpdateConnectorDefinitionRequest extends js.Object {
    var ConnectorDefinitionId: __string
    var Name: js.UndefOr[__string]
  }

  object UpdateConnectorDefinitionRequest {
    def apply(ConnectorDefinitionId: __string,
              Name: js.UndefOr[__string] = js.undefined): UpdateConnectorDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConnectorDefinitionId" -> ConnectorDefinitionId.asInstanceOf[js.Any],
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateConnectorDefinitionRequest]
    }
  }

  @js.native
  trait UpdateConnectorDefinitionResponse extends js.Object {}

  object UpdateConnectorDefinitionResponse {
    def apply(): UpdateConnectorDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateConnectorDefinitionResponse]
    }
  }

  @js.native
  trait UpdateCoreDefinitionRequest extends js.Object {
    var CoreDefinitionId: __string
    var Name: js.UndefOr[__string]
  }

  object UpdateCoreDefinitionRequest {
    def apply(CoreDefinitionId: __string, Name: js.UndefOr[__string] = js.undefined): UpdateCoreDefinitionRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("CoreDefinitionId" -> CoreDefinitionId.asInstanceOf[js.Any], "Name" -> Name.map {
          x =>
            x.asInstanceOf[js.Any]
        }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateCoreDefinitionRequest]
    }
  }

  @js.native
  trait UpdateCoreDefinitionResponse extends js.Object {}

  object UpdateCoreDefinitionResponse {
    def apply(): UpdateCoreDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateCoreDefinitionResponse]
    }
  }

  @js.native
  trait UpdateDeviceDefinitionRequest extends js.Object {
    var DeviceDefinitionId: __string
    var Name: js.UndefOr[__string]
  }

  object UpdateDeviceDefinitionRequest {
    def apply(DeviceDefinitionId: __string,
              Name: js.UndefOr[__string] = js.undefined): UpdateDeviceDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceDefinitionId" -> DeviceDefinitionId.asInstanceOf[js.Any],
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDeviceDefinitionRequest]
    }
  }

  @js.native
  trait UpdateDeviceDefinitionResponse extends js.Object {}

  object UpdateDeviceDefinitionResponse {
    def apply(): UpdateDeviceDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDeviceDefinitionResponse]
    }
  }

  @js.native
  trait UpdateFunctionDefinitionRequest extends js.Object {
    var FunctionDefinitionId: __string
    var Name: js.UndefOr[__string]
  }

  object UpdateFunctionDefinitionRequest {
    def apply(FunctionDefinitionId: __string,
              Name: js.UndefOr[__string] = js.undefined): UpdateFunctionDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FunctionDefinitionId" -> FunctionDefinitionId.asInstanceOf[js.Any],
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFunctionDefinitionRequest]
    }
  }

  @js.native
  trait UpdateFunctionDefinitionResponse extends js.Object {}

  object UpdateFunctionDefinitionResponse {
    def apply(): UpdateFunctionDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFunctionDefinitionResponse]
    }
  }

  @js.native
  trait UpdateGroupCertificateConfigurationRequest extends js.Object {
    var GroupId: __string
    var CertificateExpiryInMilliseconds: js.UndefOr[__string]
  }

  object UpdateGroupCertificateConfigurationRequest {
    def apply(
        GroupId: __string,
        CertificateExpiryInMilliseconds: js.UndefOr[__string] = js.undefined
    ): UpdateGroupCertificateConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GroupId" -> GroupId.asInstanceOf[js.Any],
        "CertificateExpiryInMilliseconds" -> CertificateExpiryInMilliseconds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[UpdateGroupCertificateConfigurationRequest]
    }
  }

  @js.native
  trait UpdateGroupCertificateConfigurationResponse extends js.Object {
    var CertificateAuthorityExpiryInMilliseconds: js.UndefOr[__string]
    var CertificateExpiryInMilliseconds: js.UndefOr[__string]
    var GroupId: js.UndefOr[__string]
  }

  object UpdateGroupCertificateConfigurationResponse {
    def apply(CertificateAuthorityExpiryInMilliseconds: js.UndefOr[__string] = js.undefined,
              CertificateExpiryInMilliseconds: js.UndefOr[__string] = js.undefined,
              GroupId: js.UndefOr[__string] = js.undefined): UpdateGroupCertificateConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CertificateAuthorityExpiryInMilliseconds" -> CertificateAuthorityExpiryInMilliseconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CertificateExpiryInMilliseconds" -> CertificateExpiryInMilliseconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GroupId" -> GroupId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[UpdateGroupCertificateConfigurationResponse]
    }
  }

  @js.native
  trait UpdateGroupRequest extends js.Object {
    var GroupId: __string
    var Name: js.UndefOr[__string]
  }

  object UpdateGroupRequest {
    def apply(GroupId: __string, Name: js.UndefOr[__string] = js.undefined): UpdateGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("GroupId" -> GroupId.asInstanceOf[js.Any], "Name" -> Name.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGroupRequest]
    }
  }

  @js.native
  trait UpdateGroupResponse extends js.Object {}

  object UpdateGroupResponse {
    def apply(): UpdateGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGroupResponse]
    }
  }

  @js.native
  trait UpdateLoggerDefinitionRequest extends js.Object {
    var LoggerDefinitionId: __string
    var Name: js.UndefOr[__string]
  }

  object UpdateLoggerDefinitionRequest {
    def apply(LoggerDefinitionId: __string,
              Name: js.UndefOr[__string] = js.undefined): UpdateLoggerDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LoggerDefinitionId" -> LoggerDefinitionId.asInstanceOf[js.Any],
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateLoggerDefinitionRequest]
    }
  }

  @js.native
  trait UpdateLoggerDefinitionResponse extends js.Object {}

  object UpdateLoggerDefinitionResponse {
    def apply(): UpdateLoggerDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateLoggerDefinitionResponse]
    }
  }

  @js.native
  trait UpdateResourceDefinitionRequest extends js.Object {
    var ResourceDefinitionId: __string
    var Name: js.UndefOr[__string]
  }

  object UpdateResourceDefinitionRequest {
    def apply(ResourceDefinitionId: __string,
              Name: js.UndefOr[__string] = js.undefined): UpdateResourceDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceDefinitionId" -> ResourceDefinitionId.asInstanceOf[js.Any],
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateResourceDefinitionRequest]
    }
  }

  @js.native
  trait UpdateResourceDefinitionResponse extends js.Object {}

  object UpdateResourceDefinitionResponse {
    def apply(): UpdateResourceDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateResourceDefinitionResponse]
    }
  }

  @js.native
  trait UpdateSubscriptionDefinitionRequest extends js.Object {
    var SubscriptionDefinitionId: __string
    var Name: js.UndefOr[__string]
  }

  object UpdateSubscriptionDefinitionRequest {
    def apply(SubscriptionDefinitionId: __string,
              Name: js.UndefOr[__string] = js.undefined): UpdateSubscriptionDefinitionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SubscriptionDefinitionId" -> SubscriptionDefinitionId.asInstanceOf[js.Any],
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSubscriptionDefinitionRequest]
    }
  }

  @js.native
  trait UpdateSubscriptionDefinitionResponse extends js.Object {}

  object UpdateSubscriptionDefinitionResponse {
    def apply(): UpdateSubscriptionDefinitionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateSubscriptionDefinitionResponse]
    }
  }

  /**
    * The architecture of the cores which are the targets of an update.
    */
  object UpdateTargetsArchitectureEnum {
    val armv7l  = "armv7l"
    val x86_64  = "x86_64"
    val aarch64 = "aarch64"

    val values = IndexedSeq(armv7l, x86_64, aarch64)
  }

  /**
    * The operating system of the cores which are the targets of an update.
    */
  object UpdateTargetsOperatingSystemEnum {
    val ubuntu       = "ubuntu"
    val raspbian     = "raspbian"
    val amazon_linux = "amazon_linux"

    val values = IndexedSeq(ubuntu, raspbian, amazon_linux)
  }

  /**
    * Information about a version.
    */
  @js.native
  trait VersionInformation extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTimestamp: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var Version: js.UndefOr[__string]
  }

  object VersionInformation {
    def apply(Arn: js.UndefOr[__string] = js.undefined,
              CreationTimestamp: js.UndefOr[__string] = js.undefined,
              Id: js.UndefOr[__string] = js.undefined,
              Version: js.UndefOr[__string] = js.undefined): VersionInformation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTimestamp" -> CreationTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VersionInformation]
    }
  }
}
