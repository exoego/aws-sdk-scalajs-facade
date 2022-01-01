package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object proton {
  type Arn = String
  type AwsAccountId = String
  type ClientToken = String
  type CompatibleEnvironmentTemplateInputList = js.Array[CompatibleEnvironmentTemplateInput]
  type CompatibleEnvironmentTemplateList = js.Array[CompatibleEnvironmentTemplate]
  type DeploymentId = String
  type Description = String
  type DisplayName = String
  type EmptyNextToken = String
  type EnvironmentAccountConnectionArn = String
  type EnvironmentAccountConnectionId = String
  type EnvironmentAccountConnectionStatusList = js.Array[EnvironmentAccountConnectionStatus]
  type EnvironmentAccountConnectionSummaryList = js.Array[EnvironmentAccountConnectionSummary]
  type EnvironmentArn = String
  type EnvironmentSummaryList = js.Array[EnvironmentSummary]
  type EnvironmentTemplateArn = String
  type EnvironmentTemplateFilterList = js.Array[EnvironmentTemplateFilter]
  type EnvironmentTemplateSummaryList = js.Array[EnvironmentTemplateSummary]
  type EnvironmentTemplateVersionArn = String
  type EnvironmentTemplateVersionSummaryList = js.Array[EnvironmentTemplateVersionSummary]
  type FullTemplateVersionNumber = String
  type GitBranchName = String
  type MaxPageResults = Int
  type NextToken = String
  type NotifyResourceDeploymentStatusChangeInputOutputsList = js.Array[Output]
  type OutputKey = String
  type OutputValueString = String
  type OutputsList = js.Array[Output]
  type PipelineRoleArn = String
  type ProvisionedResourceIdentifier = String
  type ProvisionedResourceList = js.Array[ProvisionedResource]
  type ProvisionedResourceName = String
  type RepositoryArn = String
  type RepositoryId = String
  type RepositoryName = String
  type RepositorySummaryList = js.Array[RepositorySummary]
  type RepositorySyncDefinitionList = js.Array[RepositorySyncDefinition]
  type RepositorySyncEvents = js.Array[RepositorySyncEvent]
  type ResourceName = String
  type ResourceSyncEvents = js.Array[ResourceSyncEvent]
  type S3Bucket = String
  type S3Key = String
  type SHA = String
  type ServiceArn = String
  type ServiceInstanceArn = String
  type ServiceInstanceSummaryList = js.Array[ServiceInstanceSummary]
  type ServiceSummaryList = js.Array[ServiceSummary]
  type ServiceTemplateArn = String
  type ServiceTemplateSummaryList = js.Array[ServiceTemplateSummary]
  type ServiceTemplateVersionArn = String
  type ServiceTemplateVersionSummaryList = js.Array[ServiceTemplateVersionSummary]
  type SpecContents = String
  type StatusMessage = String
  type Subdirectory = String
  type SyntheticNotifyResourceDeploymentStatusChangeInputString = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TemplateSchema = String
  type TemplateVersionPart = String
  type Timestamp = js.Date

  final class ProtonOps(private val service: Proton) extends AnyVal {

    @inline def acceptEnvironmentAccountConnectionFuture(params: AcceptEnvironmentAccountConnectionInput): Future[AcceptEnvironmentAccountConnectionOutput] = service.acceptEnvironmentAccountConnection(params).promise().toFuture
    @inline def cancelEnvironmentDeploymentFuture(params: CancelEnvironmentDeploymentInput): Future[CancelEnvironmentDeploymentOutput] = service.cancelEnvironmentDeployment(params).promise().toFuture
    @inline def cancelServiceInstanceDeploymentFuture(params: CancelServiceInstanceDeploymentInput): Future[CancelServiceInstanceDeploymentOutput] = service.cancelServiceInstanceDeployment(params).promise().toFuture
    @inline def cancelServicePipelineDeploymentFuture(params: CancelServicePipelineDeploymentInput): Future[CancelServicePipelineDeploymentOutput] = service.cancelServicePipelineDeployment(params).promise().toFuture
    @inline def createEnvironmentAccountConnectionFuture(params: CreateEnvironmentAccountConnectionInput): Future[CreateEnvironmentAccountConnectionOutput] = service.createEnvironmentAccountConnection(params).promise().toFuture
    @inline def createEnvironmentFuture(params: CreateEnvironmentInput): Future[CreateEnvironmentOutput] = service.createEnvironment(params).promise().toFuture
    @inline def createEnvironmentTemplateFuture(params: CreateEnvironmentTemplateInput): Future[CreateEnvironmentTemplateOutput] = service.createEnvironmentTemplate(params).promise().toFuture
    @inline def createEnvironmentTemplateVersionFuture(params: CreateEnvironmentTemplateVersionInput): Future[CreateEnvironmentTemplateVersionOutput] = service.createEnvironmentTemplateVersion(params).promise().toFuture
    @inline def createRepositoryFuture(params: CreateRepositoryInput): Future[CreateRepositoryOutput] = service.createRepository(params).promise().toFuture
    @inline def createServiceFuture(params: CreateServiceInput): Future[CreateServiceOutput] = service.createService(params).promise().toFuture
    @inline def createServiceTemplateFuture(params: CreateServiceTemplateInput): Future[CreateServiceTemplateOutput] = service.createServiceTemplate(params).promise().toFuture
    @inline def createServiceTemplateVersionFuture(params: CreateServiceTemplateVersionInput): Future[CreateServiceTemplateVersionOutput] = service.createServiceTemplateVersion(params).promise().toFuture
    @inline def createTemplateSyncConfigFuture(params: CreateTemplateSyncConfigInput): Future[CreateTemplateSyncConfigOutput] = service.createTemplateSyncConfig(params).promise().toFuture
    @inline def deleteEnvironmentAccountConnectionFuture(params: DeleteEnvironmentAccountConnectionInput): Future[DeleteEnvironmentAccountConnectionOutput] = service.deleteEnvironmentAccountConnection(params).promise().toFuture
    @inline def deleteEnvironmentFuture(params: DeleteEnvironmentInput): Future[DeleteEnvironmentOutput] = service.deleteEnvironment(params).promise().toFuture
    @inline def deleteEnvironmentTemplateFuture(params: DeleteEnvironmentTemplateInput): Future[DeleteEnvironmentTemplateOutput] = service.deleteEnvironmentTemplate(params).promise().toFuture
    @inline def deleteEnvironmentTemplateVersionFuture(params: DeleteEnvironmentTemplateVersionInput): Future[DeleteEnvironmentTemplateVersionOutput] = service.deleteEnvironmentTemplateVersion(params).promise().toFuture
    @inline def deleteRepositoryFuture(params: DeleteRepositoryInput): Future[DeleteRepositoryOutput] = service.deleteRepository(params).promise().toFuture
    @inline def deleteServiceFuture(params: DeleteServiceInput): Future[DeleteServiceOutput] = service.deleteService(params).promise().toFuture
    @inline def deleteServiceTemplateFuture(params: DeleteServiceTemplateInput): Future[DeleteServiceTemplateOutput] = service.deleteServiceTemplate(params).promise().toFuture
    @inline def deleteServiceTemplateVersionFuture(params: DeleteServiceTemplateVersionInput): Future[DeleteServiceTemplateVersionOutput] = service.deleteServiceTemplateVersion(params).promise().toFuture
    @inline def deleteTemplateSyncConfigFuture(params: DeleteTemplateSyncConfigInput): Future[DeleteTemplateSyncConfigOutput] = service.deleteTemplateSyncConfig(params).promise().toFuture
    @inline def getAccountSettingsFuture(params: GetAccountSettingsInput): Future[GetAccountSettingsOutput] = service.getAccountSettings(params).promise().toFuture
    @inline def getEnvironmentAccountConnectionFuture(params: GetEnvironmentAccountConnectionInput): Future[GetEnvironmentAccountConnectionOutput] = service.getEnvironmentAccountConnection(params).promise().toFuture
    @inline def getEnvironmentFuture(params: GetEnvironmentInput): Future[GetEnvironmentOutput] = service.getEnvironment(params).promise().toFuture
    @inline def getEnvironmentTemplateFuture(params: GetEnvironmentTemplateInput): Future[GetEnvironmentTemplateOutput] = service.getEnvironmentTemplate(params).promise().toFuture
    @inline def getEnvironmentTemplateVersionFuture(params: GetEnvironmentTemplateVersionInput): Future[GetEnvironmentTemplateVersionOutput] = service.getEnvironmentTemplateVersion(params).promise().toFuture
    @inline def getRepositoryFuture(params: GetRepositoryInput): Future[GetRepositoryOutput] = service.getRepository(params).promise().toFuture
    @inline def getRepositorySyncStatusFuture(params: GetRepositorySyncStatusInput): Future[GetRepositorySyncStatusOutput] = service.getRepositorySyncStatus(params).promise().toFuture
    @inline def getServiceFuture(params: GetServiceInput): Future[GetServiceOutput] = service.getService(params).promise().toFuture
    @inline def getServiceInstanceFuture(params: GetServiceInstanceInput): Future[GetServiceInstanceOutput] = service.getServiceInstance(params).promise().toFuture
    @inline def getServiceTemplateFuture(params: GetServiceTemplateInput): Future[GetServiceTemplateOutput] = service.getServiceTemplate(params).promise().toFuture
    @inline def getServiceTemplateVersionFuture(params: GetServiceTemplateVersionInput): Future[GetServiceTemplateVersionOutput] = service.getServiceTemplateVersion(params).promise().toFuture
    @inline def getTemplateSyncConfigFuture(params: GetTemplateSyncConfigInput): Future[GetTemplateSyncConfigOutput] = service.getTemplateSyncConfig(params).promise().toFuture
    @inline def getTemplateSyncStatusFuture(params: GetTemplateSyncStatusInput): Future[GetTemplateSyncStatusOutput] = service.getTemplateSyncStatus(params).promise().toFuture
    @inline def listEnvironmentAccountConnectionsFuture(params: ListEnvironmentAccountConnectionsInput): Future[ListEnvironmentAccountConnectionsOutput] = service.listEnvironmentAccountConnections(params).promise().toFuture
    @inline def listEnvironmentOutputsFuture(params: ListEnvironmentOutputsInput): Future[ListEnvironmentOutputsOutput] = service.listEnvironmentOutputs(params).promise().toFuture
    @inline def listEnvironmentProvisionedResourcesFuture(params: ListEnvironmentProvisionedResourcesInput): Future[ListEnvironmentProvisionedResourcesOutput] = service.listEnvironmentProvisionedResources(params).promise().toFuture
    @inline def listEnvironmentTemplateVersionsFuture(params: ListEnvironmentTemplateVersionsInput): Future[ListEnvironmentTemplateVersionsOutput] = service.listEnvironmentTemplateVersions(params).promise().toFuture
    @inline def listEnvironmentTemplatesFuture(params: ListEnvironmentTemplatesInput): Future[ListEnvironmentTemplatesOutput] = service.listEnvironmentTemplates(params).promise().toFuture
    @inline def listEnvironmentsFuture(params: ListEnvironmentsInput): Future[ListEnvironmentsOutput] = service.listEnvironments(params).promise().toFuture
    @inline def listRepositoriesFuture(params: ListRepositoriesInput): Future[ListRepositoriesOutput] = service.listRepositories(params).promise().toFuture
    @inline def listRepositorySyncDefinitionsFuture(params: ListRepositorySyncDefinitionsInput): Future[ListRepositorySyncDefinitionsOutput] = service.listRepositorySyncDefinitions(params).promise().toFuture
    @inline def listServiceInstanceOutputsFuture(params: ListServiceInstanceOutputsInput): Future[ListServiceInstanceOutputsOutput] = service.listServiceInstanceOutputs(params).promise().toFuture
    @inline def listServiceInstanceProvisionedResourcesFuture(params: ListServiceInstanceProvisionedResourcesInput): Future[ListServiceInstanceProvisionedResourcesOutput] = service.listServiceInstanceProvisionedResources(params).promise().toFuture
    @inline def listServiceInstancesFuture(params: ListServiceInstancesInput): Future[ListServiceInstancesOutput] = service.listServiceInstances(params).promise().toFuture
    @inline def listServicePipelineOutputsFuture(params: ListServicePipelineOutputsInput): Future[ListServicePipelineOutputsOutput] = service.listServicePipelineOutputs(params).promise().toFuture
    @inline def listServicePipelineProvisionedResourcesFuture(params: ListServicePipelineProvisionedResourcesInput): Future[ListServicePipelineProvisionedResourcesOutput] = service.listServicePipelineProvisionedResources(params).promise().toFuture
    @inline def listServiceTemplateVersionsFuture(params: ListServiceTemplateVersionsInput): Future[ListServiceTemplateVersionsOutput] = service.listServiceTemplateVersions(params).promise().toFuture
    @inline def listServiceTemplatesFuture(params: ListServiceTemplatesInput): Future[ListServiceTemplatesOutput] = service.listServiceTemplates(params).promise().toFuture
    @inline def listServicesFuture(params: ListServicesInput): Future[ListServicesOutput] = service.listServices(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] = service.listTagsForResource(params).promise().toFuture
    @inline def notifyResourceDeploymentStatusChangeFuture(params: NotifyResourceDeploymentStatusChangeInput): Future[NotifyResourceDeploymentStatusChangeOutput] = service.notifyResourceDeploymentStatusChange(params).promise().toFuture
    @inline def rejectEnvironmentAccountConnectionFuture(params: RejectEnvironmentAccountConnectionInput): Future[RejectEnvironmentAccountConnectionOutput] = service.rejectEnvironmentAccountConnection(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceInput): Future[TagResourceOutput] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceInput): Future[UntagResourceOutput] = service.untagResource(params).promise().toFuture
    @inline def updateAccountSettingsFuture(params: UpdateAccountSettingsInput): Future[UpdateAccountSettingsOutput] = service.updateAccountSettings(params).promise().toFuture
    @inline def updateEnvironmentAccountConnectionFuture(params: UpdateEnvironmentAccountConnectionInput): Future[UpdateEnvironmentAccountConnectionOutput] = service.updateEnvironmentAccountConnection(params).promise().toFuture
    @inline def updateEnvironmentFuture(params: UpdateEnvironmentInput): Future[UpdateEnvironmentOutput] = service.updateEnvironment(params).promise().toFuture
    @inline def updateEnvironmentTemplateFuture(params: UpdateEnvironmentTemplateInput): Future[UpdateEnvironmentTemplateOutput] = service.updateEnvironmentTemplate(params).promise().toFuture
    @inline def updateEnvironmentTemplateVersionFuture(params: UpdateEnvironmentTemplateVersionInput): Future[UpdateEnvironmentTemplateVersionOutput] = service.updateEnvironmentTemplateVersion(params).promise().toFuture
    @inline def updateServiceFuture(params: UpdateServiceInput): Future[UpdateServiceOutput] = service.updateService(params).promise().toFuture
    @inline def updateServiceInstanceFuture(params: UpdateServiceInstanceInput): Future[UpdateServiceInstanceOutput] = service.updateServiceInstance(params).promise().toFuture
    @inline def updateServicePipelineFuture(params: UpdateServicePipelineInput): Future[UpdateServicePipelineOutput] = service.updateServicePipeline(params).promise().toFuture
    @inline def updateServiceTemplateFuture(params: UpdateServiceTemplateInput): Future[UpdateServiceTemplateOutput] = service.updateServiceTemplate(params).promise().toFuture
    @inline def updateServiceTemplateVersionFuture(params: UpdateServiceTemplateVersionInput): Future[UpdateServiceTemplateVersionOutput] = service.updateServiceTemplateVersion(params).promise().toFuture
    @inline def updateTemplateSyncConfigFuture(params: UpdateTemplateSyncConfigInput): Future[UpdateTemplateSyncConfigOutput] = service.updateTemplateSyncConfig(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/proton", JSImport.Namespace, "AWS.Proton")
  class Proton() extends js.Object {
    def this(config: AWSConfig) = this()

    def acceptEnvironmentAccountConnection(params: AcceptEnvironmentAccountConnectionInput): Request[AcceptEnvironmentAccountConnectionOutput] = js.native
    def cancelEnvironmentDeployment(params: CancelEnvironmentDeploymentInput): Request[CancelEnvironmentDeploymentOutput] = js.native
    def cancelServiceInstanceDeployment(params: CancelServiceInstanceDeploymentInput): Request[CancelServiceInstanceDeploymentOutput] = js.native
    def cancelServicePipelineDeployment(params: CancelServicePipelineDeploymentInput): Request[CancelServicePipelineDeploymentOutput] = js.native
    def createEnvironment(params: CreateEnvironmentInput): Request[CreateEnvironmentOutput] = js.native
    def createEnvironmentAccountConnection(params: CreateEnvironmentAccountConnectionInput): Request[CreateEnvironmentAccountConnectionOutput] = js.native
    def createEnvironmentTemplate(params: CreateEnvironmentTemplateInput): Request[CreateEnvironmentTemplateOutput] = js.native
    def createEnvironmentTemplateVersion(params: CreateEnvironmentTemplateVersionInput): Request[CreateEnvironmentTemplateVersionOutput] = js.native
    def createRepository(params: CreateRepositoryInput): Request[CreateRepositoryOutput] = js.native
    def createService(params: CreateServiceInput): Request[CreateServiceOutput] = js.native
    def createServiceTemplate(params: CreateServiceTemplateInput): Request[CreateServiceTemplateOutput] = js.native
    def createServiceTemplateVersion(params: CreateServiceTemplateVersionInput): Request[CreateServiceTemplateVersionOutput] = js.native
    def createTemplateSyncConfig(params: CreateTemplateSyncConfigInput): Request[CreateTemplateSyncConfigOutput] = js.native
    def deleteEnvironment(params: DeleteEnvironmentInput): Request[DeleteEnvironmentOutput] = js.native
    def deleteEnvironmentAccountConnection(params: DeleteEnvironmentAccountConnectionInput): Request[DeleteEnvironmentAccountConnectionOutput] = js.native
    def deleteEnvironmentTemplate(params: DeleteEnvironmentTemplateInput): Request[DeleteEnvironmentTemplateOutput] = js.native
    def deleteEnvironmentTemplateVersion(params: DeleteEnvironmentTemplateVersionInput): Request[DeleteEnvironmentTemplateVersionOutput] = js.native
    def deleteRepository(params: DeleteRepositoryInput): Request[DeleteRepositoryOutput] = js.native
    def deleteService(params: DeleteServiceInput): Request[DeleteServiceOutput] = js.native
    def deleteServiceTemplate(params: DeleteServiceTemplateInput): Request[DeleteServiceTemplateOutput] = js.native
    def deleteServiceTemplateVersion(params: DeleteServiceTemplateVersionInput): Request[DeleteServiceTemplateVersionOutput] = js.native
    def deleteTemplateSyncConfig(params: DeleteTemplateSyncConfigInput): Request[DeleteTemplateSyncConfigOutput] = js.native
    def getAccountSettings(params: GetAccountSettingsInput): Request[GetAccountSettingsOutput] = js.native
    def getEnvironment(params: GetEnvironmentInput): Request[GetEnvironmentOutput] = js.native
    def getEnvironmentAccountConnection(params: GetEnvironmentAccountConnectionInput): Request[GetEnvironmentAccountConnectionOutput] = js.native
    def getEnvironmentTemplate(params: GetEnvironmentTemplateInput): Request[GetEnvironmentTemplateOutput] = js.native
    def getEnvironmentTemplateVersion(params: GetEnvironmentTemplateVersionInput): Request[GetEnvironmentTemplateVersionOutput] = js.native
    def getRepository(params: GetRepositoryInput): Request[GetRepositoryOutput] = js.native
    def getRepositorySyncStatus(params: GetRepositorySyncStatusInput): Request[GetRepositorySyncStatusOutput] = js.native
    def getService(params: GetServiceInput): Request[GetServiceOutput] = js.native
    def getServiceInstance(params: GetServiceInstanceInput): Request[GetServiceInstanceOutput] = js.native
    def getServiceTemplate(params: GetServiceTemplateInput): Request[GetServiceTemplateOutput] = js.native
    def getServiceTemplateVersion(params: GetServiceTemplateVersionInput): Request[GetServiceTemplateVersionOutput] = js.native
    def getTemplateSyncConfig(params: GetTemplateSyncConfigInput): Request[GetTemplateSyncConfigOutput] = js.native
    def getTemplateSyncStatus(params: GetTemplateSyncStatusInput): Request[GetTemplateSyncStatusOutput] = js.native
    def listEnvironmentAccountConnections(params: ListEnvironmentAccountConnectionsInput): Request[ListEnvironmentAccountConnectionsOutput] = js.native
    def listEnvironmentOutputs(params: ListEnvironmentOutputsInput): Request[ListEnvironmentOutputsOutput] = js.native
    def listEnvironmentProvisionedResources(params: ListEnvironmentProvisionedResourcesInput): Request[ListEnvironmentProvisionedResourcesOutput] = js.native
    def listEnvironmentTemplateVersions(params: ListEnvironmentTemplateVersionsInput): Request[ListEnvironmentTemplateVersionsOutput] = js.native
    def listEnvironmentTemplates(params: ListEnvironmentTemplatesInput): Request[ListEnvironmentTemplatesOutput] = js.native
    def listEnvironments(params: ListEnvironmentsInput): Request[ListEnvironmentsOutput] = js.native
    def listRepositories(params: ListRepositoriesInput): Request[ListRepositoriesOutput] = js.native
    def listRepositorySyncDefinitions(params: ListRepositorySyncDefinitionsInput): Request[ListRepositorySyncDefinitionsOutput] = js.native
    def listServiceInstanceOutputs(params: ListServiceInstanceOutputsInput): Request[ListServiceInstanceOutputsOutput] = js.native
    def listServiceInstanceProvisionedResources(params: ListServiceInstanceProvisionedResourcesInput): Request[ListServiceInstanceProvisionedResourcesOutput] = js.native
    def listServiceInstances(params: ListServiceInstancesInput): Request[ListServiceInstancesOutput] = js.native
    def listServicePipelineOutputs(params: ListServicePipelineOutputsInput): Request[ListServicePipelineOutputsOutput] = js.native
    def listServicePipelineProvisionedResources(params: ListServicePipelineProvisionedResourcesInput): Request[ListServicePipelineProvisionedResourcesOutput] = js.native
    def listServiceTemplateVersions(params: ListServiceTemplateVersionsInput): Request[ListServiceTemplateVersionsOutput] = js.native
    def listServiceTemplates(params: ListServiceTemplatesInput): Request[ListServiceTemplatesOutput] = js.native
    def listServices(params: ListServicesInput): Request[ListServicesOutput] = js.native
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput] = js.native
    def notifyResourceDeploymentStatusChange(params: NotifyResourceDeploymentStatusChangeInput): Request[NotifyResourceDeploymentStatusChangeOutput] = js.native
    def rejectEnvironmentAccountConnection(params: RejectEnvironmentAccountConnectionInput): Request[RejectEnvironmentAccountConnectionOutput] = js.native
    def tagResource(params: TagResourceInput): Request[TagResourceOutput] = js.native
    def untagResource(params: UntagResourceInput): Request[UntagResourceOutput] = js.native
    def updateAccountSettings(params: UpdateAccountSettingsInput): Request[UpdateAccountSettingsOutput] = js.native
    def updateEnvironment(params: UpdateEnvironmentInput): Request[UpdateEnvironmentOutput] = js.native
    def updateEnvironmentAccountConnection(params: UpdateEnvironmentAccountConnectionInput): Request[UpdateEnvironmentAccountConnectionOutput] = js.native
    def updateEnvironmentTemplate(params: UpdateEnvironmentTemplateInput): Request[UpdateEnvironmentTemplateOutput] = js.native
    def updateEnvironmentTemplateVersion(params: UpdateEnvironmentTemplateVersionInput): Request[UpdateEnvironmentTemplateVersionOutput] = js.native
    def updateService(params: UpdateServiceInput): Request[UpdateServiceOutput] = js.native
    def updateServiceInstance(params: UpdateServiceInstanceInput): Request[UpdateServiceInstanceOutput] = js.native
    def updateServicePipeline(params: UpdateServicePipelineInput): Request[UpdateServicePipelineOutput] = js.native
    def updateServiceTemplate(params: UpdateServiceTemplateInput): Request[UpdateServiceTemplateOutput] = js.native
    def updateServiceTemplateVersion(params: UpdateServiceTemplateVersionInput): Request[UpdateServiceTemplateVersionOutput] = js.native
    def updateTemplateSyncConfig(params: UpdateTemplateSyncConfigInput): Request[UpdateTemplateSyncConfigOutput] = js.native
  }
  object Proton {
    @inline implicit def toOps(service: Proton): ProtonOps = {
      new ProtonOps(service)
    }
  }

  @js.native
  trait AcceptEnvironmentAccountConnectionInput extends js.Object {
    var id: EnvironmentAccountConnectionId
  }

  object AcceptEnvironmentAccountConnectionInput {
    @inline
    def apply(
        id: EnvironmentAccountConnectionId
    ): AcceptEnvironmentAccountConnectionInput = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AcceptEnvironmentAccountConnectionInput]
    }
  }

  @js.native
  trait AcceptEnvironmentAccountConnectionOutput extends js.Object {
    var environmentAccountConnection: EnvironmentAccountConnection
  }

  object AcceptEnvironmentAccountConnectionOutput {
    @inline
    def apply(
        environmentAccountConnection: EnvironmentAccountConnection
    ): AcceptEnvironmentAccountConnectionOutput = {
      val __obj = js.Dynamic.literal(
        "environmentAccountConnection" -> environmentAccountConnection.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AcceptEnvironmentAccountConnectionOutput]
    }
  }

  /** The Proton pipeline service role and repository data.
    */
  @js.native
  trait AccountSettings extends js.Object {
    var pipelineProvisioningRepository: js.UndefOr[RepositoryBranch]
    var pipelineServiceRoleArn: js.UndefOr[PipelineRoleArn]
  }

  object AccountSettings {
    @inline
    def apply(
        pipelineProvisioningRepository: js.UndefOr[RepositoryBranch] = js.undefined,
        pipelineServiceRoleArn: js.UndefOr[PipelineRoleArn] = js.undefined
    ): AccountSettings = {
      val __obj = js.Dynamic.literal()
      pipelineProvisioningRepository.foreach(__v => __obj.updateDynamic("pipelineProvisioningRepository")(__v.asInstanceOf[js.Any]))
      pipelineServiceRoleArn.foreach(__v => __obj.updateDynamic("pipelineServiceRoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountSettings]
    }
  }

  @js.native
  trait CancelEnvironmentDeploymentInput extends js.Object {
    var environmentName: ResourceName
  }

  object CancelEnvironmentDeploymentInput {
    @inline
    def apply(
        environmentName: ResourceName
    ): CancelEnvironmentDeploymentInput = {
      val __obj = js.Dynamic.literal(
        "environmentName" -> environmentName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelEnvironmentDeploymentInput]
    }
  }

  @js.native
  trait CancelEnvironmentDeploymentOutput extends js.Object {
    var environment: Environment
  }

  object CancelEnvironmentDeploymentOutput {
    @inline
    def apply(
        environment: Environment
    ): CancelEnvironmentDeploymentOutput = {
      val __obj = js.Dynamic.literal(
        "environment" -> environment.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelEnvironmentDeploymentOutput]
    }
  }

  @js.native
  trait CancelServiceInstanceDeploymentInput extends js.Object {
    var serviceInstanceName: ResourceName
    var serviceName: ResourceName
  }

  object CancelServiceInstanceDeploymentInput {
    @inline
    def apply(
        serviceInstanceName: ResourceName,
        serviceName: ResourceName
    ): CancelServiceInstanceDeploymentInput = {
      val __obj = js.Dynamic.literal(
        "serviceInstanceName" -> serviceInstanceName.asInstanceOf[js.Any],
        "serviceName" -> serviceName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelServiceInstanceDeploymentInput]
    }
  }

  @js.native
  trait CancelServiceInstanceDeploymentOutput extends js.Object {
    var serviceInstance: ServiceInstance
  }

  object CancelServiceInstanceDeploymentOutput {
    @inline
    def apply(
        serviceInstance: ServiceInstance
    ): CancelServiceInstanceDeploymentOutput = {
      val __obj = js.Dynamic.literal(
        "serviceInstance" -> serviceInstance.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelServiceInstanceDeploymentOutput]
    }
  }

  @js.native
  trait CancelServicePipelineDeploymentInput extends js.Object {
    var serviceName: ResourceName
  }

  object CancelServicePipelineDeploymentInput {
    @inline
    def apply(
        serviceName: ResourceName
    ): CancelServicePipelineDeploymentInput = {
      val __obj = js.Dynamic.literal(
        "serviceName" -> serviceName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelServicePipelineDeploymentInput]
    }
  }

  @js.native
  trait CancelServicePipelineDeploymentOutput extends js.Object {
    var pipeline: ServicePipeline
  }

  object CancelServicePipelineDeploymentOutput {
    @inline
    def apply(
        pipeline: ServicePipeline
    ): CancelServicePipelineDeploymentOutput = {
      val __obj = js.Dynamic.literal(
        "pipeline" -> pipeline.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelServicePipelineDeploymentOutput]
    }
  }

  /** Compatible environment template data.
    */
  @js.native
  trait CompatibleEnvironmentTemplate extends js.Object {
    var majorVersion: TemplateVersionPart
    var templateName: ResourceName
  }

  object CompatibleEnvironmentTemplate {
    @inline
    def apply(
        majorVersion: TemplateVersionPart,
        templateName: ResourceName
    ): CompatibleEnvironmentTemplate = {
      val __obj = js.Dynamic.literal(
        "majorVersion" -> majorVersion.asInstanceOf[js.Any],
        "templateName" -> templateName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CompatibleEnvironmentTemplate]
    }
  }

  /** Compatible environment template data.
    */
  @js.native
  trait CompatibleEnvironmentTemplateInput extends js.Object {
    var majorVersion: TemplateVersionPart
    var templateName: ResourceName
  }

  object CompatibleEnvironmentTemplateInput {
    @inline
    def apply(
        majorVersion: TemplateVersionPart,
        templateName: ResourceName
    ): CompatibleEnvironmentTemplateInput = {
      val __obj = js.Dynamic.literal(
        "majorVersion" -> majorVersion.asInstanceOf[js.Any],
        "templateName" -> templateName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CompatibleEnvironmentTemplateInput]
    }
  }

  @js.native
  trait CreateEnvironmentAccountConnectionInput extends js.Object {
    var environmentName: ResourceName
    var managementAccountId: AwsAccountId
    var roleArn: Arn
    var clientToken: js.UndefOr[ClientToken]
    var tags: js.UndefOr[TagList]
  }

  object CreateEnvironmentAccountConnectionInput {
    @inline
    def apply(
        environmentName: ResourceName,
        managementAccountId: AwsAccountId,
        roleArn: Arn,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateEnvironmentAccountConnectionInput = {
      val __obj = js.Dynamic.literal(
        "environmentName" -> environmentName.asInstanceOf[js.Any],
        "managementAccountId" -> managementAccountId.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEnvironmentAccountConnectionInput]
    }
  }

  @js.native
  trait CreateEnvironmentAccountConnectionOutput extends js.Object {
    var environmentAccountConnection: EnvironmentAccountConnection
  }

  object CreateEnvironmentAccountConnectionOutput {
    @inline
    def apply(
        environmentAccountConnection: EnvironmentAccountConnection
    ): CreateEnvironmentAccountConnectionOutput = {
      val __obj = js.Dynamic.literal(
        "environmentAccountConnection" -> environmentAccountConnection.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateEnvironmentAccountConnectionOutput]
    }
  }

  @js.native
  trait CreateEnvironmentInput extends js.Object {
    var name: ResourceName
    var spec: SpecContents
    var templateMajorVersion: TemplateVersionPart
    var templateName: ResourceName
    var description: js.UndefOr[Description]
    var environmentAccountConnectionId: js.UndefOr[EnvironmentAccountConnectionId]
    var protonServiceRoleArn: js.UndefOr[Arn]
    var provisioningRepository: js.UndefOr[RepositoryBranchInput]
    var tags: js.UndefOr[TagList]
    var templateMinorVersion: js.UndefOr[TemplateVersionPart]
  }

  object CreateEnvironmentInput {
    @inline
    def apply(
        name: ResourceName,
        spec: SpecContents,
        templateMajorVersion: TemplateVersionPart,
        templateName: ResourceName,
        description: js.UndefOr[Description] = js.undefined,
        environmentAccountConnectionId: js.UndefOr[EnvironmentAccountConnectionId] = js.undefined,
        protonServiceRoleArn: js.UndefOr[Arn] = js.undefined,
        provisioningRepository: js.UndefOr[RepositoryBranchInput] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        templateMinorVersion: js.UndefOr[TemplateVersionPart] = js.undefined
    ): CreateEnvironmentInput = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "spec" -> spec.asInstanceOf[js.Any],
        "templateMajorVersion" -> templateMajorVersion.asInstanceOf[js.Any],
        "templateName" -> templateName.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      environmentAccountConnectionId.foreach(__v => __obj.updateDynamic("environmentAccountConnectionId")(__v.asInstanceOf[js.Any]))
      protonServiceRoleArn.foreach(__v => __obj.updateDynamic("protonServiceRoleArn")(__v.asInstanceOf[js.Any]))
      provisioningRepository.foreach(__v => __obj.updateDynamic("provisioningRepository")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      templateMinorVersion.foreach(__v => __obj.updateDynamic("templateMinorVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEnvironmentInput]
    }
  }

  @js.native
  trait CreateEnvironmentOutput extends js.Object {
    var environment: Environment
  }

  object CreateEnvironmentOutput {
    @inline
    def apply(
        environment: Environment
    ): CreateEnvironmentOutput = {
      val __obj = js.Dynamic.literal(
        "environment" -> environment.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateEnvironmentOutput]
    }
  }

  @js.native
  trait CreateEnvironmentTemplateInput extends js.Object {
    var name: ResourceName
    var description: js.UndefOr[Description]
    var displayName: js.UndefOr[DisplayName]
    var encryptionKey: js.UndefOr[Arn]
    var provisioning: js.UndefOr[Provisioning]
    var tags: js.UndefOr[TagList]
  }

  object CreateEnvironmentTemplateInput {
    @inline
    def apply(
        name: ResourceName,
        description: js.UndefOr[Description] = js.undefined,
        displayName: js.UndefOr[DisplayName] = js.undefined,
        encryptionKey: js.UndefOr[Arn] = js.undefined,
        provisioning: js.UndefOr[Provisioning] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateEnvironmentTemplateInput = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      encryptionKey.foreach(__v => __obj.updateDynamic("encryptionKey")(__v.asInstanceOf[js.Any]))
      provisioning.foreach(__v => __obj.updateDynamic("provisioning")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEnvironmentTemplateInput]
    }
  }

  @js.native
  trait CreateEnvironmentTemplateOutput extends js.Object {
    var environmentTemplate: EnvironmentTemplate
  }

  object CreateEnvironmentTemplateOutput {
    @inline
    def apply(
        environmentTemplate: EnvironmentTemplate
    ): CreateEnvironmentTemplateOutput = {
      val __obj = js.Dynamic.literal(
        "environmentTemplate" -> environmentTemplate.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateEnvironmentTemplateOutput]
    }
  }

  @js.native
  trait CreateEnvironmentTemplateVersionInput extends js.Object {
    var source: TemplateVersionSourceInput
    var templateName: ResourceName
    var clientToken: js.UndefOr[ClientToken]
    var description: js.UndefOr[Description]
    var majorVersion: js.UndefOr[TemplateVersionPart]
    var tags: js.UndefOr[TagList]
  }

  object CreateEnvironmentTemplateVersionInput {
    @inline
    def apply(
        source: TemplateVersionSourceInput,
        templateName: ResourceName,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        majorVersion: js.UndefOr[TemplateVersionPart] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateEnvironmentTemplateVersionInput = {
      val __obj = js.Dynamic.literal(
        "source" -> source.asInstanceOf[js.Any],
        "templateName" -> templateName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      majorVersion.foreach(__v => __obj.updateDynamic("majorVersion")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEnvironmentTemplateVersionInput]
    }
  }

  @js.native
  trait CreateEnvironmentTemplateVersionOutput extends js.Object {
    var environmentTemplateVersion: EnvironmentTemplateVersion
  }

  object CreateEnvironmentTemplateVersionOutput {
    @inline
    def apply(
        environmentTemplateVersion: EnvironmentTemplateVersion
    ): CreateEnvironmentTemplateVersionOutput = {
      val __obj = js.Dynamic.literal(
        "environmentTemplateVersion" -> environmentTemplateVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateEnvironmentTemplateVersionOutput]
    }
  }

  @js.native
  trait CreateRepositoryInput extends js.Object {
    var connectionArn: Arn
    var name: RepositoryName
    var provider: RepositoryProvider
    var encryptionKey: js.UndefOr[Arn]
  }

  object CreateRepositoryInput {
    @inline
    def apply(
        connectionArn: Arn,
        name: RepositoryName,
        provider: RepositoryProvider,
        encryptionKey: js.UndefOr[Arn] = js.undefined
    ): CreateRepositoryInput = {
      val __obj = js.Dynamic.literal(
        "connectionArn" -> connectionArn.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "provider" -> provider.asInstanceOf[js.Any]
      )

      encryptionKey.foreach(__v => __obj.updateDynamic("encryptionKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRepositoryInput]
    }
  }

  @js.native
  trait CreateRepositoryOutput extends js.Object {
    var repository: Repository
  }

  object CreateRepositoryOutput {
    @inline
    def apply(
        repository: Repository
    ): CreateRepositoryOutput = {
      val __obj = js.Dynamic.literal(
        "repository" -> repository.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateRepositoryOutput]
    }
  }

  @js.native
  trait CreateServiceInput extends js.Object {
    var name: ResourceName
    var spec: SpecContents
    var templateMajorVersion: TemplateVersionPart
    var templateName: ResourceName
    var branchName: js.UndefOr[GitBranchName]
    var description: js.UndefOr[Description]
    var repositoryConnectionArn: js.UndefOr[Arn]
    var repositoryId: js.UndefOr[RepositoryId]
    var tags: js.UndefOr[TagList]
    var templateMinorVersion: js.UndefOr[TemplateVersionPart]
  }

  object CreateServiceInput {
    @inline
    def apply(
        name: ResourceName,
        spec: SpecContents,
        templateMajorVersion: TemplateVersionPart,
        templateName: ResourceName,
        branchName: js.UndefOr[GitBranchName] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        repositoryConnectionArn: js.UndefOr[Arn] = js.undefined,
        repositoryId: js.UndefOr[RepositoryId] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined,
        templateMinorVersion: js.UndefOr[TemplateVersionPart] = js.undefined
    ): CreateServiceInput = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "spec" -> spec.asInstanceOf[js.Any],
        "templateMajorVersion" -> templateMajorVersion.asInstanceOf[js.Any],
        "templateName" -> templateName.asInstanceOf[js.Any]
      )

      branchName.foreach(__v => __obj.updateDynamic("branchName")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      repositoryConnectionArn.foreach(__v => __obj.updateDynamic("repositoryConnectionArn")(__v.asInstanceOf[js.Any]))
      repositoryId.foreach(__v => __obj.updateDynamic("repositoryId")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      templateMinorVersion.foreach(__v => __obj.updateDynamic("templateMinorVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateServiceInput]
    }
  }

  @js.native
  trait CreateServiceOutput extends js.Object {
    var service: Service
  }

  object CreateServiceOutput {
    @inline
    def apply(
        service: Service
    ): CreateServiceOutput = {
      val __obj = js.Dynamic.literal(
        "service" -> service.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateServiceOutput]
    }
  }

  @js.native
  trait CreateServiceTemplateInput extends js.Object {
    var name: ResourceName
    var description: js.UndefOr[Description]
    var displayName: js.UndefOr[DisplayName]
    var encryptionKey: js.UndefOr[Arn]
    var pipelineProvisioning: js.UndefOr[Provisioning]
    var tags: js.UndefOr[TagList]
  }

  object CreateServiceTemplateInput {
    @inline
    def apply(
        name: ResourceName,
        description: js.UndefOr[Description] = js.undefined,
        displayName: js.UndefOr[DisplayName] = js.undefined,
        encryptionKey: js.UndefOr[Arn] = js.undefined,
        pipelineProvisioning: js.UndefOr[Provisioning] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateServiceTemplateInput = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      encryptionKey.foreach(__v => __obj.updateDynamic("encryptionKey")(__v.asInstanceOf[js.Any]))
      pipelineProvisioning.foreach(__v => __obj.updateDynamic("pipelineProvisioning")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateServiceTemplateInput]
    }
  }

  @js.native
  trait CreateServiceTemplateOutput extends js.Object {
    var serviceTemplate: ServiceTemplate
  }

  object CreateServiceTemplateOutput {
    @inline
    def apply(
        serviceTemplate: ServiceTemplate
    ): CreateServiceTemplateOutput = {
      val __obj = js.Dynamic.literal(
        "serviceTemplate" -> serviceTemplate.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateServiceTemplateOutput]
    }
  }

  @js.native
  trait CreateServiceTemplateVersionInput extends js.Object {
    var compatibleEnvironmentTemplates: CompatibleEnvironmentTemplateInputList
    var source: TemplateVersionSourceInput
    var templateName: ResourceName
    var clientToken: js.UndefOr[ClientToken]
    var description: js.UndefOr[Description]
    var majorVersion: js.UndefOr[TemplateVersionPart]
    var tags: js.UndefOr[TagList]
  }

  object CreateServiceTemplateVersionInput {
    @inline
    def apply(
        compatibleEnvironmentTemplates: CompatibleEnvironmentTemplateInputList,
        source: TemplateVersionSourceInput,
        templateName: ResourceName,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        majorVersion: js.UndefOr[TemplateVersionPart] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateServiceTemplateVersionInput = {
      val __obj = js.Dynamic.literal(
        "compatibleEnvironmentTemplates" -> compatibleEnvironmentTemplates.asInstanceOf[js.Any],
        "source" -> source.asInstanceOf[js.Any],
        "templateName" -> templateName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      majorVersion.foreach(__v => __obj.updateDynamic("majorVersion")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateServiceTemplateVersionInput]
    }
  }

  @js.native
  trait CreateServiceTemplateVersionOutput extends js.Object {
    var serviceTemplateVersion: ServiceTemplateVersion
  }

  object CreateServiceTemplateVersionOutput {
    @inline
    def apply(
        serviceTemplateVersion: ServiceTemplateVersion
    ): CreateServiceTemplateVersionOutput = {
      val __obj = js.Dynamic.literal(
        "serviceTemplateVersion" -> serviceTemplateVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateServiceTemplateVersionOutput]
    }
  }

  @js.native
  trait CreateTemplateSyncConfigInput extends js.Object {
    var branch: GitBranchName
    var repositoryName: RepositoryName
    var repositoryProvider: RepositoryProvider
    var templateName: ResourceName
    var templateType: TemplateType
    var subdirectory: js.UndefOr[Subdirectory]
  }

  object CreateTemplateSyncConfigInput {
    @inline
    def apply(
        branch: GitBranchName,
        repositoryName: RepositoryName,
        repositoryProvider: RepositoryProvider,
        templateName: ResourceName,
        templateType: TemplateType,
        subdirectory: js.UndefOr[Subdirectory] = js.undefined
    ): CreateTemplateSyncConfigInput = {
      val __obj = js.Dynamic.literal(
        "branch" -> branch.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "repositoryProvider" -> repositoryProvider.asInstanceOf[js.Any],
        "templateName" -> templateName.asInstanceOf[js.Any],
        "templateType" -> templateType.asInstanceOf[js.Any]
      )

      subdirectory.foreach(__v => __obj.updateDynamic("subdirectory")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTemplateSyncConfigInput]
    }
  }

  @js.native
  trait CreateTemplateSyncConfigOutput extends js.Object {
    var templateSyncConfig: js.UndefOr[TemplateSyncConfig]
  }

  object CreateTemplateSyncConfigOutput {
    @inline
    def apply(
        templateSyncConfig: js.UndefOr[TemplateSyncConfig] = js.undefined
    ): CreateTemplateSyncConfigOutput = {
      val __obj = js.Dynamic.literal()
      templateSyncConfig.foreach(__v => __obj.updateDynamic("templateSyncConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTemplateSyncConfigOutput]
    }
  }

  @js.native
  trait DeleteEnvironmentAccountConnectionInput extends js.Object {
    var id: EnvironmentAccountConnectionId
  }

  object DeleteEnvironmentAccountConnectionInput {
    @inline
    def apply(
        id: EnvironmentAccountConnectionId
    ): DeleteEnvironmentAccountConnectionInput = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEnvironmentAccountConnectionInput]
    }
  }

  @js.native
  trait DeleteEnvironmentAccountConnectionOutput extends js.Object {
    var environmentAccountConnection: js.UndefOr[EnvironmentAccountConnection]
  }

  object DeleteEnvironmentAccountConnectionOutput {
    @inline
    def apply(
        environmentAccountConnection: js.UndefOr[EnvironmentAccountConnection] = js.undefined
    ): DeleteEnvironmentAccountConnectionOutput = {
      val __obj = js.Dynamic.literal()
      environmentAccountConnection.foreach(__v => __obj.updateDynamic("environmentAccountConnection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteEnvironmentAccountConnectionOutput]
    }
  }

  @js.native
  trait DeleteEnvironmentInput extends js.Object {
    var name: ResourceName
  }

  object DeleteEnvironmentInput {
    @inline
    def apply(
        name: ResourceName
    ): DeleteEnvironmentInput = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEnvironmentInput]
    }
  }

  @js.native
  trait DeleteEnvironmentOutput extends js.Object {
    var environment: js.UndefOr[Environment]
  }

  object DeleteEnvironmentOutput {
    @inline
    def apply(
        environment: js.UndefOr[Environment] = js.undefined
    ): DeleteEnvironmentOutput = {
      val __obj = js.Dynamic.literal()
      environment.foreach(__v => __obj.updateDynamic("environment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteEnvironmentOutput]
    }
  }

  @js.native
  trait DeleteEnvironmentTemplateInput extends js.Object {
    var name: ResourceName
  }

  object DeleteEnvironmentTemplateInput {
    @inline
    def apply(
        name: ResourceName
    ): DeleteEnvironmentTemplateInput = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEnvironmentTemplateInput]
    }
  }

  @js.native
  trait DeleteEnvironmentTemplateOutput extends js.Object {
    var environmentTemplate: js.UndefOr[EnvironmentTemplate]
  }

  object DeleteEnvironmentTemplateOutput {
    @inline
    def apply(
        environmentTemplate: js.UndefOr[EnvironmentTemplate] = js.undefined
    ): DeleteEnvironmentTemplateOutput = {
      val __obj = js.Dynamic.literal()
      environmentTemplate.foreach(__v => __obj.updateDynamic("environmentTemplate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteEnvironmentTemplateOutput]
    }
  }

  @js.native
  trait DeleteEnvironmentTemplateVersionInput extends js.Object {
    var majorVersion: TemplateVersionPart
    var minorVersion: TemplateVersionPart
    var templateName: ResourceName
  }

  object DeleteEnvironmentTemplateVersionInput {
    @inline
    def apply(
        majorVersion: TemplateVersionPart,
        minorVersion: TemplateVersionPart,
        templateName: ResourceName
    ): DeleteEnvironmentTemplateVersionInput = {
      val __obj = js.Dynamic.literal(
        "majorVersion" -> majorVersion.asInstanceOf[js.Any],
        "minorVersion" -> minorVersion.asInstanceOf[js.Any],
        "templateName" -> templateName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEnvironmentTemplateVersionInput]
    }
  }

  @js.native
  trait DeleteEnvironmentTemplateVersionOutput extends js.Object {
    var environmentTemplateVersion: js.UndefOr[EnvironmentTemplateVersion]
  }

  object DeleteEnvironmentTemplateVersionOutput {
    @inline
    def apply(
        environmentTemplateVersion: js.UndefOr[EnvironmentTemplateVersion] = js.undefined
    ): DeleteEnvironmentTemplateVersionOutput = {
      val __obj = js.Dynamic.literal()
      environmentTemplateVersion.foreach(__v => __obj.updateDynamic("environmentTemplateVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteEnvironmentTemplateVersionOutput]
    }
  }

  @js.native
  trait DeleteRepositoryInput extends js.Object {
    var name: RepositoryName
    var provider: RepositoryProvider
  }

  object DeleteRepositoryInput {
    @inline
    def apply(
        name: RepositoryName,
        provider: RepositoryProvider
    ): DeleteRepositoryInput = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "provider" -> provider.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRepositoryInput]
    }
  }

  @js.native
  trait DeleteRepositoryOutput extends js.Object {
    var repository: js.UndefOr[Repository]
  }

  object DeleteRepositoryOutput {
    @inline
    def apply(
        repository: js.UndefOr[Repository] = js.undefined
    ): DeleteRepositoryOutput = {
      val __obj = js.Dynamic.literal()
      repository.foreach(__v => __obj.updateDynamic("repository")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRepositoryOutput]
    }
  }

  @js.native
  trait DeleteServiceInput extends js.Object {
    var name: ResourceName
  }

  object DeleteServiceInput {
    @inline
    def apply(
        name: ResourceName
    ): DeleteServiceInput = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteServiceInput]
    }
  }

  @js.native
  trait DeleteServiceOutput extends js.Object {
    var service: js.UndefOr[Service]
  }

  object DeleteServiceOutput {
    @inline
    def apply(
        service: js.UndefOr[Service] = js.undefined
    ): DeleteServiceOutput = {
      val __obj = js.Dynamic.literal()
      service.foreach(__v => __obj.updateDynamic("service")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteServiceOutput]
    }
  }

  @js.native
  trait DeleteServiceTemplateInput extends js.Object {
    var name: ResourceName
  }

  object DeleteServiceTemplateInput {
    @inline
    def apply(
        name: ResourceName
    ): DeleteServiceTemplateInput = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteServiceTemplateInput]
    }
  }

  @js.native
  trait DeleteServiceTemplateOutput extends js.Object {
    var serviceTemplate: js.UndefOr[ServiceTemplate]
  }

  object DeleteServiceTemplateOutput {
    @inline
    def apply(
        serviceTemplate: js.UndefOr[ServiceTemplate] = js.undefined
    ): DeleteServiceTemplateOutput = {
      val __obj = js.Dynamic.literal()
      serviceTemplate.foreach(__v => __obj.updateDynamic("serviceTemplate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteServiceTemplateOutput]
    }
  }

  @js.native
  trait DeleteServiceTemplateVersionInput extends js.Object {
    var majorVersion: TemplateVersionPart
    var minorVersion: TemplateVersionPart
    var templateName: ResourceName
  }

  object DeleteServiceTemplateVersionInput {
    @inline
    def apply(
        majorVersion: TemplateVersionPart,
        minorVersion: TemplateVersionPart,
        templateName: ResourceName
    ): DeleteServiceTemplateVersionInput = {
      val __obj = js.Dynamic.literal(
        "majorVersion" -> majorVersion.asInstanceOf[js.Any],
        "minorVersion" -> minorVersion.asInstanceOf[js.Any],
        "templateName" -> templateName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteServiceTemplateVersionInput]
    }
  }

  @js.native
  trait DeleteServiceTemplateVersionOutput extends js.Object {
    var serviceTemplateVersion: js.UndefOr[ServiceTemplateVersion]
  }

  object DeleteServiceTemplateVersionOutput {
    @inline
    def apply(
        serviceTemplateVersion: js.UndefOr[ServiceTemplateVersion] = js.undefined
    ): DeleteServiceTemplateVersionOutput = {
      val __obj = js.Dynamic.literal()
      serviceTemplateVersion.foreach(__v => __obj.updateDynamic("serviceTemplateVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteServiceTemplateVersionOutput]
    }
  }

  @js.native
  trait DeleteTemplateSyncConfigInput extends js.Object {
    var templateName: ResourceName
    var templateType: TemplateType
  }

  object DeleteTemplateSyncConfigInput {
    @inline
    def apply(
        templateName: ResourceName,
        templateType: TemplateType
    ): DeleteTemplateSyncConfigInput = {
      val __obj = js.Dynamic.literal(
        "templateName" -> templateName.asInstanceOf[js.Any],
        "templateType" -> templateType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteTemplateSyncConfigInput]
    }
  }

  @js.native
  trait DeleteTemplateSyncConfigOutput extends js.Object {
    var templateSyncConfig: js.UndefOr[TemplateSyncConfig]
  }

  object DeleteTemplateSyncConfigOutput {
    @inline
    def apply(
        templateSyncConfig: js.UndefOr[TemplateSyncConfig] = js.undefined
    ): DeleteTemplateSyncConfigOutput = {
      val __obj = js.Dynamic.literal()
      templateSyncConfig.foreach(__v => __obj.updateDynamic("templateSyncConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteTemplateSyncConfigOutput]
    }
  }

  /** The environment detail data. An Proton environment is a set resources shared across an Proton service.
    */
  @js.native
  trait Environment extends js.Object {
    var arn: EnvironmentArn
    var createdAt: Timestamp
    var deploymentStatus: DeploymentStatus
    var lastDeploymentAttemptedAt: Timestamp
    var lastDeploymentSucceededAt: Timestamp
    var name: ResourceName
    var templateMajorVersion: TemplateVersionPart
    var templateMinorVersion: TemplateVersionPart
    var templateName: ResourceName
    var deploymentStatusMessage: js.UndefOr[StatusMessage]
    var description: js.UndefOr[Description]
    var environmentAccountConnectionId: js.UndefOr[EnvironmentAccountConnectionId]
    var environmentAccountId: js.UndefOr[AwsAccountId]
    var protonServiceRoleArn: js.UndefOr[Arn]
    var provisioning: js.UndefOr[Provisioning]
    var provisioningRepository: js.UndefOr[RepositoryBranch]
    var spec: js.UndefOr[SpecContents]
  }

  object Environment {
    @inline
    def apply(
        arn: EnvironmentArn,
        createdAt: Timestamp,
        deploymentStatus: DeploymentStatus,
        lastDeploymentAttemptedAt: Timestamp,
        lastDeploymentSucceededAt: Timestamp,
        name: ResourceName,
        templateMajorVersion: TemplateVersionPart,
        templateMinorVersion: TemplateVersionPart,
        templateName: ResourceName,
        deploymentStatusMessage: js.UndefOr[StatusMessage] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        environmentAccountConnectionId: js.UndefOr[EnvironmentAccountConnectionId] = js.undefined,
        environmentAccountId: js.UndefOr[AwsAccountId] = js.undefined,
        protonServiceRoleArn: js.UndefOr[Arn] = js.undefined,
        provisioning: js.UndefOr[Provisioning] = js.undefined,
        provisioningRepository: js.UndefOr[RepositoryBranch] = js.undefined,
        spec: js.UndefOr[SpecContents] = js.undefined
    ): Environment = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "deploymentStatus" -> deploymentStatus.asInstanceOf[js.Any],
        "lastDeploymentAttemptedAt" -> lastDeploymentAttemptedAt.asInstanceOf[js.Any],
        "lastDeploymentSucceededAt" -> lastDeploymentSucceededAt.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "templateMajorVersion" -> templateMajorVersion.asInstanceOf[js.Any],
        "templateMinorVersion" -> templateMinorVersion.asInstanceOf[js.Any],
        "templateName" -> templateName.asInstanceOf[js.Any]
      )

      deploymentStatusMessage.foreach(__v => __obj.updateDynamic("deploymentStatusMessage")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      environmentAccountConnectionId.foreach(__v => __obj.updateDynamic("environmentAccountConnectionId")(__v.asInstanceOf[js.Any]))
      environmentAccountId.foreach(__v => __obj.updateDynamic("environmentAccountId")(__v.asInstanceOf[js.Any]))
      protonServiceRoleArn.foreach(__v => __obj.updateDynamic("protonServiceRoleArn")(__v.asInstanceOf[js.Any]))
      provisioning.foreach(__v => __obj.updateDynamic("provisioning")(__v.asInstanceOf[js.Any]))
      provisioningRepository.foreach(__v => __obj.updateDynamic("provisioningRepository")(__v.asInstanceOf[js.Any]))
      spec.foreach(__v => __obj.updateDynamic("spec")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Environment]
    }
  }

  /** The environment account connection detail data.
    */
  @js.native
  trait EnvironmentAccountConnection extends js.Object {
    var arn: EnvironmentAccountConnectionArn
    var environmentAccountId: AwsAccountId
    var environmentName: ResourceName
    var id: EnvironmentAccountConnectionId
    var lastModifiedAt: Timestamp
    var managementAccountId: AwsAccountId
    var requestedAt: Timestamp
    var roleArn: Arn
    var status: EnvironmentAccountConnectionStatus
  }

  object EnvironmentAccountConnection {
    @inline
    def apply(
        arn: EnvironmentAccountConnectionArn,
        environmentAccountId: AwsAccountId,
        environmentName: ResourceName,
        id: EnvironmentAccountConnectionId,
        lastModifiedAt: Timestamp,
        managementAccountId: AwsAccountId,
        requestedAt: Timestamp,
        roleArn: Arn,
        status: EnvironmentAccountConnectionStatus
    ): EnvironmentAccountConnection = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "environmentAccountId" -> environmentAccountId.asInstanceOf[js.Any],
        "environmentName" -> environmentName.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "lastModifiedAt" -> lastModifiedAt.asInstanceOf[js.Any],
        "managementAccountId" -> managementAccountId.asInstanceOf[js.Any],
        "requestedAt" -> requestedAt.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EnvironmentAccountConnection]
    }
  }

  /** A summary of the environment account connection detail data.
    */
  @js.native
  trait EnvironmentAccountConnectionSummary extends js.Object {
    var arn: EnvironmentAccountConnectionArn
    var environmentAccountId: AwsAccountId
    var environmentName: ResourceName
    var id: EnvironmentAccountConnectionId
    var lastModifiedAt: Timestamp
    var managementAccountId: AwsAccountId
    var requestedAt: Timestamp
    var roleArn: Arn
    var status: EnvironmentAccountConnectionStatus
  }

  object EnvironmentAccountConnectionSummary {
    @inline
    def apply(
        arn: EnvironmentAccountConnectionArn,
        environmentAccountId: AwsAccountId,
        environmentName: ResourceName,
        id: EnvironmentAccountConnectionId,
        lastModifiedAt: Timestamp,
        managementAccountId: AwsAccountId,
        requestedAt: Timestamp,
        roleArn: Arn,
        status: EnvironmentAccountConnectionStatus
    ): EnvironmentAccountConnectionSummary = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "environmentAccountId" -> environmentAccountId.asInstanceOf[js.Any],
        "environmentName" -> environmentName.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "lastModifiedAt" -> lastModifiedAt.asInstanceOf[js.Any],
        "managementAccountId" -> managementAccountId.asInstanceOf[js.Any],
        "requestedAt" -> requestedAt.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EnvironmentAccountConnectionSummary]
    }
  }

  /** A summary of the environment detail data.
    */
  @js.native
  trait EnvironmentSummary extends js.Object {
    var arn: EnvironmentArn
    var createdAt: Timestamp
    var deploymentStatus: DeploymentStatus
    var lastDeploymentAttemptedAt: Timestamp
    var lastDeploymentSucceededAt: Timestamp
    var name: ResourceName
    var templateMajorVersion: TemplateVersionPart
    var templateMinorVersion: TemplateVersionPart
    var templateName: ResourceName
    var deploymentStatusMessage: js.UndefOr[StatusMessage]
    var description: js.UndefOr[Description]
    var environmentAccountConnectionId: js.UndefOr[EnvironmentAccountConnectionId]
    var environmentAccountId: js.UndefOr[AwsAccountId]
    var protonServiceRoleArn: js.UndefOr[Arn]
    var provisioning: js.UndefOr[Provisioning]
  }

  object EnvironmentSummary {
    @inline
    def apply(
        arn: EnvironmentArn,
        createdAt: Timestamp,
        deploymentStatus: DeploymentStatus,
        lastDeploymentAttemptedAt: Timestamp,
        lastDeploymentSucceededAt: Timestamp,
        name: ResourceName,
        templateMajorVersion: TemplateVersionPart,
        templateMinorVersion: TemplateVersionPart,
        templateName: ResourceName,
        deploymentStatusMessage: js.UndefOr[StatusMessage] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        environmentAccountConnectionId: js.UndefOr[EnvironmentAccountConnectionId] = js.undefined,
        environmentAccountId: js.UndefOr[AwsAccountId] = js.undefined,
        protonServiceRoleArn: js.UndefOr[Arn] = js.undefined,
        provisioning: js.UndefOr[Provisioning] = js.undefined
    ): EnvironmentSummary = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "deploymentStatus" -> deploymentStatus.asInstanceOf[js.Any],
        "lastDeploymentAttemptedAt" -> lastDeploymentAttemptedAt.asInstanceOf[js.Any],
        "lastDeploymentSucceededAt" -> lastDeploymentSucceededAt.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "templateMajorVersion" -> templateMajorVersion.asInstanceOf[js.Any],
        "templateMinorVersion" -> templateMinorVersion.asInstanceOf[js.Any],
        "templateName" -> templateName.asInstanceOf[js.Any]
      )

      deploymentStatusMessage.foreach(__v => __obj.updateDynamic("deploymentStatusMessage")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      environmentAccountConnectionId.foreach(__v => __obj.updateDynamic("environmentAccountConnectionId")(__v.asInstanceOf[js.Any]))
      environmentAccountId.foreach(__v => __obj.updateDynamic("environmentAccountId")(__v.asInstanceOf[js.Any]))
      protonServiceRoleArn.foreach(__v => __obj.updateDynamic("protonServiceRoleArn")(__v.asInstanceOf[js.Any]))
      provisioning.foreach(__v => __obj.updateDynamic("provisioning")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnvironmentSummary]
    }
  }

  /** The environment template data.
    */
  @js.native
  trait EnvironmentTemplate extends js.Object {
    var arn: EnvironmentTemplateArn
    var createdAt: Timestamp
    var lastModifiedAt: Timestamp
    var name: ResourceName
    var description: js.UndefOr[Description]
    var displayName: js.UndefOr[DisplayName]
    var encryptionKey: js.UndefOr[Arn]
    var provisioning: js.UndefOr[Provisioning]
    var recommendedVersion: js.UndefOr[FullTemplateVersionNumber]
  }

  object EnvironmentTemplate {
    @inline
    def apply(
        arn: EnvironmentTemplateArn,
        createdAt: Timestamp,
        lastModifiedAt: Timestamp,
        name: ResourceName,
        description: js.UndefOr[Description] = js.undefined,
        displayName: js.UndefOr[DisplayName] = js.undefined,
        encryptionKey: js.UndefOr[Arn] = js.undefined,
        provisioning: js.UndefOr[Provisioning] = js.undefined,
        recommendedVersion: js.UndefOr[FullTemplateVersionNumber] = js.undefined
    ): EnvironmentTemplate = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "lastModifiedAt" -> lastModifiedAt.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      encryptionKey.foreach(__v => __obj.updateDynamic("encryptionKey")(__v.asInstanceOf[js.Any]))
      provisioning.foreach(__v => __obj.updateDynamic("provisioning")(__v.asInstanceOf[js.Any]))
      recommendedVersion.foreach(__v => __obj.updateDynamic("recommendedVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnvironmentTemplate]
    }
  }

  /** A search filter for environment templates.
    */
  @js.native
  trait EnvironmentTemplateFilter extends js.Object {
    var majorVersion: TemplateVersionPart
    var templateName: ResourceName
  }

  object EnvironmentTemplateFilter {
    @inline
    def apply(
        majorVersion: TemplateVersionPart,
        templateName: ResourceName
    ): EnvironmentTemplateFilter = {
      val __obj = js.Dynamic.literal(
        "majorVersion" -> majorVersion.asInstanceOf[js.Any],
        "templateName" -> templateName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[EnvironmentTemplateFilter]
    }
  }

  /** The environment template data.
    */
  @js.native
  trait EnvironmentTemplateSummary extends js.Object {
    var arn: EnvironmentTemplateArn
    var createdAt: Timestamp
    var lastModifiedAt: Timestamp
    var name: ResourceName
    var description: js.UndefOr[Description]
    var displayName: js.UndefOr[DisplayName]
    var provisioning: js.UndefOr[Provisioning]
    var recommendedVersion: js.UndefOr[FullTemplateVersionNumber]
  }

  object EnvironmentTemplateSummary {
    @inline
    def apply(
        arn: EnvironmentTemplateArn,
        createdAt: Timestamp,
        lastModifiedAt: Timestamp,
        name: ResourceName,
        description: js.UndefOr[Description] = js.undefined,
        displayName: js.UndefOr[DisplayName] = js.undefined,
        provisioning: js.UndefOr[Provisioning] = js.undefined,
        recommendedVersion: js.UndefOr[FullTemplateVersionNumber] = js.undefined
    ): EnvironmentTemplateSummary = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "lastModifiedAt" -> lastModifiedAt.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      provisioning.foreach(__v => __obj.updateDynamic("provisioning")(__v.asInstanceOf[js.Any]))
      recommendedVersion.foreach(__v => __obj.updateDynamic("recommendedVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnvironmentTemplateSummary]
    }
  }

  /** The environment template version data.
    */
  @js.native
  trait EnvironmentTemplateVersion extends js.Object {
    var arn: EnvironmentTemplateVersionArn
    var createdAt: Timestamp
    var lastModifiedAt: Timestamp
    var majorVersion: TemplateVersionPart
    var minorVersion: TemplateVersionPart
    var status: TemplateVersionStatus
    var templateName: ResourceName
    var description: js.UndefOr[Description]
    var recommendedMinorVersion: js.UndefOr[TemplateVersionPart]
    var schema: js.UndefOr[TemplateSchema]
    var statusMessage: js.UndefOr[StatusMessage]
  }

  object EnvironmentTemplateVersion {
    @inline
    def apply(
        arn: EnvironmentTemplateVersionArn,
        createdAt: Timestamp,
        lastModifiedAt: Timestamp,
        majorVersion: TemplateVersionPart,
        minorVersion: TemplateVersionPart,
        status: TemplateVersionStatus,
        templateName: ResourceName,
        description: js.UndefOr[Description] = js.undefined,
        recommendedMinorVersion: js.UndefOr[TemplateVersionPart] = js.undefined,
        schema: js.UndefOr[TemplateSchema] = js.undefined,
        statusMessage: js.UndefOr[StatusMessage] = js.undefined
    ): EnvironmentTemplateVersion = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "lastModifiedAt" -> lastModifiedAt.asInstanceOf[js.Any],
        "majorVersion" -> majorVersion.asInstanceOf[js.Any],
        "minorVersion" -> minorVersion.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "templateName" -> templateName.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      recommendedMinorVersion.foreach(__v => __obj.updateDynamic("recommendedMinorVersion")(__v.asInstanceOf[js.Any]))
      schema.foreach(__v => __obj.updateDynamic("schema")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnvironmentTemplateVersion]
    }
  }

  /** A summary of the version of an environment template detail data.
    */
  @js.native
  trait EnvironmentTemplateVersionSummary extends js.Object {
    var arn: EnvironmentTemplateVersionArn
    var createdAt: Timestamp
    var lastModifiedAt: Timestamp
    var majorVersion: TemplateVersionPart
    var minorVersion: TemplateVersionPart
    var status: TemplateVersionStatus
    var templateName: ResourceName
    var description: js.UndefOr[Description]
    var recommendedMinorVersion: js.UndefOr[TemplateVersionPart]
    var statusMessage: js.UndefOr[StatusMessage]
  }

  object EnvironmentTemplateVersionSummary {
    @inline
    def apply(
        arn: EnvironmentTemplateVersionArn,
        createdAt: Timestamp,
        lastModifiedAt: Timestamp,
        majorVersion: TemplateVersionPart,
        minorVersion: TemplateVersionPart,
        status: TemplateVersionStatus,
        templateName: ResourceName,
        description: js.UndefOr[Description] = js.undefined,
        recommendedMinorVersion: js.UndefOr[TemplateVersionPart] = js.undefined,
        statusMessage: js.UndefOr[StatusMessage] = js.undefined
    ): EnvironmentTemplateVersionSummary = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "lastModifiedAt" -> lastModifiedAt.asInstanceOf[js.Any],
        "majorVersion" -> majorVersion.asInstanceOf[js.Any],
        "minorVersion" -> minorVersion.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "templateName" -> templateName.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      recommendedMinorVersion.foreach(__v => __obj.updateDynamic("recommendedMinorVersion")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnvironmentTemplateVersionSummary]
    }
  }

  @js.native
  trait GetAccountSettingsInput extends js.Object

  object GetAccountSettingsInput {
    @inline
    def apply(): GetAccountSettingsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetAccountSettingsInput]
    }
  }

  @js.native
  trait GetAccountSettingsOutput extends js.Object {
    var accountSettings: js.UndefOr[AccountSettings]
  }

  object GetAccountSettingsOutput {
    @inline
    def apply(
        accountSettings: js.UndefOr[AccountSettings] = js.undefined
    ): GetAccountSettingsOutput = {
      val __obj = js.Dynamic.literal()
      accountSettings.foreach(__v => __obj.updateDynamic("accountSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAccountSettingsOutput]
    }
  }

  @js.native
  trait GetEnvironmentAccountConnectionInput extends js.Object {
    var id: EnvironmentAccountConnectionId
  }

  object GetEnvironmentAccountConnectionInput {
    @inline
    def apply(
        id: EnvironmentAccountConnectionId
    ): GetEnvironmentAccountConnectionInput = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetEnvironmentAccountConnectionInput]
    }
  }

  @js.native
  trait GetEnvironmentAccountConnectionOutput extends js.Object {
    var environmentAccountConnection: EnvironmentAccountConnection
  }

  object GetEnvironmentAccountConnectionOutput {
    @inline
    def apply(
        environmentAccountConnection: EnvironmentAccountConnection
    ): GetEnvironmentAccountConnectionOutput = {
      val __obj = js.Dynamic.literal(
        "environmentAccountConnection" -> environmentAccountConnection.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetEnvironmentAccountConnectionOutput]
    }
  }

  @js.native
  trait GetEnvironmentInput extends js.Object {
    var name: ResourceName
  }

  object GetEnvironmentInput {
    @inline
    def apply(
        name: ResourceName
    ): GetEnvironmentInput = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetEnvironmentInput]
    }
  }

  @js.native
  trait GetEnvironmentOutput extends js.Object {
    var environment: Environment
  }

  object GetEnvironmentOutput {
    @inline
    def apply(
        environment: Environment
    ): GetEnvironmentOutput = {
      val __obj = js.Dynamic.literal(
        "environment" -> environment.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetEnvironmentOutput]
    }
  }

  @js.native
  trait GetEnvironmentTemplateInput extends js.Object {
    var name: ResourceName
  }

  object GetEnvironmentTemplateInput {
    @inline
    def apply(
        name: ResourceName
    ): GetEnvironmentTemplateInput = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetEnvironmentTemplateInput]
    }
  }

  @js.native
  trait GetEnvironmentTemplateOutput extends js.Object {
    var environmentTemplate: EnvironmentTemplate
  }

  object GetEnvironmentTemplateOutput {
    @inline
    def apply(
        environmentTemplate: EnvironmentTemplate
    ): GetEnvironmentTemplateOutput = {
      val __obj = js.Dynamic.literal(
        "environmentTemplate" -> environmentTemplate.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetEnvironmentTemplateOutput]
    }
  }

  @js.native
  trait GetEnvironmentTemplateVersionInput extends js.Object {
    var majorVersion: TemplateVersionPart
    var minorVersion: TemplateVersionPart
    var templateName: ResourceName
  }

  object GetEnvironmentTemplateVersionInput {
    @inline
    def apply(
        majorVersion: TemplateVersionPart,
        minorVersion: TemplateVersionPart,
        templateName: ResourceName
    ): GetEnvironmentTemplateVersionInput = {
      val __obj = js.Dynamic.literal(
        "majorVersion" -> majorVersion.asInstanceOf[js.Any],
        "minorVersion" -> minorVersion.asInstanceOf[js.Any],
        "templateName" -> templateName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetEnvironmentTemplateVersionInput]
    }
  }

  @js.native
  trait GetEnvironmentTemplateVersionOutput extends js.Object {
    var environmentTemplateVersion: EnvironmentTemplateVersion
  }

  object GetEnvironmentTemplateVersionOutput {
    @inline
    def apply(
        environmentTemplateVersion: EnvironmentTemplateVersion
    ): GetEnvironmentTemplateVersionOutput = {
      val __obj = js.Dynamic.literal(
        "environmentTemplateVersion" -> environmentTemplateVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetEnvironmentTemplateVersionOutput]
    }
  }

  @js.native
  trait GetRepositoryInput extends js.Object {
    var name: RepositoryName
    var provider: RepositoryProvider
  }

  object GetRepositoryInput {
    @inline
    def apply(
        name: RepositoryName,
        provider: RepositoryProvider
    ): GetRepositoryInput = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "provider" -> provider.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRepositoryInput]
    }
  }

  @js.native
  trait GetRepositoryOutput extends js.Object {
    var repository: Repository
  }

  object GetRepositoryOutput {
    @inline
    def apply(
        repository: Repository
    ): GetRepositoryOutput = {
      val __obj = js.Dynamic.literal(
        "repository" -> repository.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRepositoryOutput]
    }
  }

  @js.native
  trait GetRepositorySyncStatusInput extends js.Object {
    var branch: GitBranchName
    var repositoryName: RepositoryName
    var repositoryProvider: RepositoryProvider
    var syncType: SyncType
  }

  object GetRepositorySyncStatusInput {
    @inline
    def apply(
        branch: GitBranchName,
        repositoryName: RepositoryName,
        repositoryProvider: RepositoryProvider,
        syncType: SyncType
    ): GetRepositorySyncStatusInput = {
      val __obj = js.Dynamic.literal(
        "branch" -> branch.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "repositoryProvider" -> repositoryProvider.asInstanceOf[js.Any],
        "syncType" -> syncType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRepositorySyncStatusInput]
    }
  }

  @js.native
  trait GetRepositorySyncStatusOutput extends js.Object {
    var latestSync: js.UndefOr[RepositorySyncAttempt]
  }

  object GetRepositorySyncStatusOutput {
    @inline
    def apply(
        latestSync: js.UndefOr[RepositorySyncAttempt] = js.undefined
    ): GetRepositorySyncStatusOutput = {
      val __obj = js.Dynamic.literal()
      latestSync.foreach(__v => __obj.updateDynamic("latestSync")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRepositorySyncStatusOutput]
    }
  }

  @js.native
  trait GetServiceInput extends js.Object {
    var name: ResourceName
  }

  object GetServiceInput {
    @inline
    def apply(
        name: ResourceName
    ): GetServiceInput = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetServiceInput]
    }
  }

  @js.native
  trait GetServiceInstanceInput extends js.Object {
    var name: ResourceName
    var serviceName: ResourceName
  }

  object GetServiceInstanceInput {
    @inline
    def apply(
        name: ResourceName,
        serviceName: ResourceName
    ): GetServiceInstanceInput = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "serviceName" -> serviceName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetServiceInstanceInput]
    }
  }

  @js.native
  trait GetServiceInstanceOutput extends js.Object {
    var serviceInstance: ServiceInstance
  }

  object GetServiceInstanceOutput {
    @inline
    def apply(
        serviceInstance: ServiceInstance
    ): GetServiceInstanceOutput = {
      val __obj = js.Dynamic.literal(
        "serviceInstance" -> serviceInstance.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetServiceInstanceOutput]
    }
  }

  @js.native
  trait GetServiceOutput extends js.Object {
    var service: js.UndefOr[Service]
  }

  object GetServiceOutput {
    @inline
    def apply(
        service: js.UndefOr[Service] = js.undefined
    ): GetServiceOutput = {
      val __obj = js.Dynamic.literal()
      service.foreach(__v => __obj.updateDynamic("service")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetServiceOutput]
    }
  }

  @js.native
  trait GetServiceTemplateInput extends js.Object {
    var name: ResourceName
  }

  object GetServiceTemplateInput {
    @inline
    def apply(
        name: ResourceName
    ): GetServiceTemplateInput = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetServiceTemplateInput]
    }
  }

  @js.native
  trait GetServiceTemplateOutput extends js.Object {
    var serviceTemplate: ServiceTemplate
  }

  object GetServiceTemplateOutput {
    @inline
    def apply(
        serviceTemplate: ServiceTemplate
    ): GetServiceTemplateOutput = {
      val __obj = js.Dynamic.literal(
        "serviceTemplate" -> serviceTemplate.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetServiceTemplateOutput]
    }
  }

  @js.native
  trait GetServiceTemplateVersionInput extends js.Object {
    var majorVersion: TemplateVersionPart
    var minorVersion: TemplateVersionPart
    var templateName: ResourceName
  }

  object GetServiceTemplateVersionInput {
    @inline
    def apply(
        majorVersion: TemplateVersionPart,
        minorVersion: TemplateVersionPart,
        templateName: ResourceName
    ): GetServiceTemplateVersionInput = {
      val __obj = js.Dynamic.literal(
        "majorVersion" -> majorVersion.asInstanceOf[js.Any],
        "minorVersion" -> minorVersion.asInstanceOf[js.Any],
        "templateName" -> templateName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetServiceTemplateVersionInput]
    }
  }

  @js.native
  trait GetServiceTemplateVersionOutput extends js.Object {
    var serviceTemplateVersion: ServiceTemplateVersion
  }

  object GetServiceTemplateVersionOutput {
    @inline
    def apply(
        serviceTemplateVersion: ServiceTemplateVersion
    ): GetServiceTemplateVersionOutput = {
      val __obj = js.Dynamic.literal(
        "serviceTemplateVersion" -> serviceTemplateVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetServiceTemplateVersionOutput]
    }
  }

  @js.native
  trait GetTemplateSyncConfigInput extends js.Object {
    var templateName: ResourceName
    var templateType: TemplateType
  }

  object GetTemplateSyncConfigInput {
    @inline
    def apply(
        templateName: ResourceName,
        templateType: TemplateType
    ): GetTemplateSyncConfigInput = {
      val __obj = js.Dynamic.literal(
        "templateName" -> templateName.asInstanceOf[js.Any],
        "templateType" -> templateType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetTemplateSyncConfigInput]
    }
  }

  @js.native
  trait GetTemplateSyncConfigOutput extends js.Object {
    var templateSyncConfig: js.UndefOr[TemplateSyncConfig]
  }

  object GetTemplateSyncConfigOutput {
    @inline
    def apply(
        templateSyncConfig: js.UndefOr[TemplateSyncConfig] = js.undefined
    ): GetTemplateSyncConfigOutput = {
      val __obj = js.Dynamic.literal()
      templateSyncConfig.foreach(__v => __obj.updateDynamic("templateSyncConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTemplateSyncConfigOutput]
    }
  }

  @js.native
  trait GetTemplateSyncStatusInput extends js.Object {
    var templateName: ResourceName
    var templateType: TemplateType
    var templateVersion: TemplateVersionPart
  }

  object GetTemplateSyncStatusInput {
    @inline
    def apply(
        templateName: ResourceName,
        templateType: TemplateType,
        templateVersion: TemplateVersionPart
    ): GetTemplateSyncStatusInput = {
      val __obj = js.Dynamic.literal(
        "templateName" -> templateName.asInstanceOf[js.Any],
        "templateType" -> templateType.asInstanceOf[js.Any],
        "templateVersion" -> templateVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetTemplateSyncStatusInput]
    }
  }

  @js.native
  trait GetTemplateSyncStatusOutput extends js.Object {
    var desiredState: js.UndefOr[Revision]
    var latestSuccessfulSync: js.UndefOr[ResourceSyncAttempt]
    var latestSync: js.UndefOr[ResourceSyncAttempt]
  }

  object GetTemplateSyncStatusOutput {
    @inline
    def apply(
        desiredState: js.UndefOr[Revision] = js.undefined,
        latestSuccessfulSync: js.UndefOr[ResourceSyncAttempt] = js.undefined,
        latestSync: js.UndefOr[ResourceSyncAttempt] = js.undefined
    ): GetTemplateSyncStatusOutput = {
      val __obj = js.Dynamic.literal()
      desiredState.foreach(__v => __obj.updateDynamic("desiredState")(__v.asInstanceOf[js.Any]))
      latestSuccessfulSync.foreach(__v => __obj.updateDynamic("latestSuccessfulSync")(__v.asInstanceOf[js.Any]))
      latestSync.foreach(__v => __obj.updateDynamic("latestSync")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTemplateSyncStatusOutput]
    }
  }

  @js.native
  trait ListEnvironmentAccountConnectionsInput extends js.Object {
    var requestedBy: EnvironmentAccountConnectionRequesterAccountType
    var environmentName: js.UndefOr[ResourceName]
    var maxResults: js.UndefOr[MaxPageResults]
    var nextToken: js.UndefOr[NextToken]
    var statuses: js.UndefOr[EnvironmentAccountConnectionStatusList]
  }

  object ListEnvironmentAccountConnectionsInput {
    @inline
    def apply(
        requestedBy: EnvironmentAccountConnectionRequesterAccountType,
        environmentName: js.UndefOr[ResourceName] = js.undefined,
        maxResults: js.UndefOr[MaxPageResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        statuses: js.UndefOr[EnvironmentAccountConnectionStatusList] = js.undefined
    ): ListEnvironmentAccountConnectionsInput = {
      val __obj = js.Dynamic.literal(
        "requestedBy" -> requestedBy.asInstanceOf[js.Any]
      )

      environmentName.foreach(__v => __obj.updateDynamic("environmentName")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      statuses.foreach(__v => __obj.updateDynamic("statuses")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEnvironmentAccountConnectionsInput]
    }
  }

  @js.native
  trait ListEnvironmentAccountConnectionsOutput extends js.Object {
    var environmentAccountConnections: EnvironmentAccountConnectionSummaryList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListEnvironmentAccountConnectionsOutput {
    @inline
    def apply(
        environmentAccountConnections: EnvironmentAccountConnectionSummaryList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEnvironmentAccountConnectionsOutput = {
      val __obj = js.Dynamic.literal(
        "environmentAccountConnections" -> environmentAccountConnections.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEnvironmentAccountConnectionsOutput]
    }
  }

  @js.native
  trait ListEnvironmentOutputsInput extends js.Object {
    var environmentName: ResourceName
    var nextToken: js.UndefOr[EmptyNextToken]
  }

  object ListEnvironmentOutputsInput {
    @inline
    def apply(
        environmentName: ResourceName,
        nextToken: js.UndefOr[EmptyNextToken] = js.undefined
    ): ListEnvironmentOutputsInput = {
      val __obj = js.Dynamic.literal(
        "environmentName" -> environmentName.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEnvironmentOutputsInput]
    }
  }

  @js.native
  trait ListEnvironmentOutputsOutput extends js.Object {
    var outputs: OutputsList
    var nextToken: js.UndefOr[EmptyNextToken]
  }

  object ListEnvironmentOutputsOutput {
    @inline
    def apply(
        outputs: OutputsList,
        nextToken: js.UndefOr[EmptyNextToken] = js.undefined
    ): ListEnvironmentOutputsOutput = {
      val __obj = js.Dynamic.literal(
        "outputs" -> outputs.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEnvironmentOutputsOutput]
    }
  }

  @js.native
  trait ListEnvironmentProvisionedResourcesInput extends js.Object {
    var environmentName: ResourceName
    var nextToken: js.UndefOr[EmptyNextToken]
  }

  object ListEnvironmentProvisionedResourcesInput {
    @inline
    def apply(
        environmentName: ResourceName,
        nextToken: js.UndefOr[EmptyNextToken] = js.undefined
    ): ListEnvironmentProvisionedResourcesInput = {
      val __obj = js.Dynamic.literal(
        "environmentName" -> environmentName.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEnvironmentProvisionedResourcesInput]
    }
  }

  @js.native
  trait ListEnvironmentProvisionedResourcesOutput extends js.Object {
    var provisionedResources: ProvisionedResourceList
    var nextToken: js.UndefOr[EmptyNextToken]
  }

  object ListEnvironmentProvisionedResourcesOutput {
    @inline
    def apply(
        provisionedResources: ProvisionedResourceList,
        nextToken: js.UndefOr[EmptyNextToken] = js.undefined
    ): ListEnvironmentProvisionedResourcesOutput = {
      val __obj = js.Dynamic.literal(
        "provisionedResources" -> provisionedResources.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEnvironmentProvisionedResourcesOutput]
    }
  }

  @js.native
  trait ListEnvironmentTemplateVersionsInput extends js.Object {
    var templateName: ResourceName
    var majorVersion: js.UndefOr[TemplateVersionPart]
    var maxResults: js.UndefOr[MaxPageResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListEnvironmentTemplateVersionsInput {
    @inline
    def apply(
        templateName: ResourceName,
        majorVersion: js.UndefOr[TemplateVersionPart] = js.undefined,
        maxResults: js.UndefOr[MaxPageResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEnvironmentTemplateVersionsInput = {
      val __obj = js.Dynamic.literal(
        "templateName" -> templateName.asInstanceOf[js.Any]
      )

      majorVersion.foreach(__v => __obj.updateDynamic("majorVersion")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEnvironmentTemplateVersionsInput]
    }
  }

  @js.native
  trait ListEnvironmentTemplateVersionsOutput extends js.Object {
    var templateVersions: EnvironmentTemplateVersionSummaryList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListEnvironmentTemplateVersionsOutput {
    @inline
    def apply(
        templateVersions: EnvironmentTemplateVersionSummaryList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEnvironmentTemplateVersionsOutput = {
      val __obj = js.Dynamic.literal(
        "templateVersions" -> templateVersions.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEnvironmentTemplateVersionsOutput]
    }
  }

  @js.native
  trait ListEnvironmentTemplatesInput extends js.Object {
    var maxResults: js.UndefOr[MaxPageResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListEnvironmentTemplatesInput {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxPageResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEnvironmentTemplatesInput = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEnvironmentTemplatesInput]
    }
  }

  @js.native
  trait ListEnvironmentTemplatesOutput extends js.Object {
    var templates: EnvironmentTemplateSummaryList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListEnvironmentTemplatesOutput {
    @inline
    def apply(
        templates: EnvironmentTemplateSummaryList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEnvironmentTemplatesOutput = {
      val __obj = js.Dynamic.literal(
        "templates" -> templates.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEnvironmentTemplatesOutput]
    }
  }

  @js.native
  trait ListEnvironmentsInput extends js.Object {
    var environmentTemplates: js.UndefOr[EnvironmentTemplateFilterList]
    var maxResults: js.UndefOr[MaxPageResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListEnvironmentsInput {
    @inline
    def apply(
        environmentTemplates: js.UndefOr[EnvironmentTemplateFilterList] = js.undefined,
        maxResults: js.UndefOr[MaxPageResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEnvironmentsInput = {
      val __obj = js.Dynamic.literal()
      environmentTemplates.foreach(__v => __obj.updateDynamic("environmentTemplates")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEnvironmentsInput]
    }
  }

  @js.native
  trait ListEnvironmentsOutput extends js.Object {
    var environments: EnvironmentSummaryList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListEnvironmentsOutput {
    @inline
    def apply(
        environments: EnvironmentSummaryList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEnvironmentsOutput = {
      val __obj = js.Dynamic.literal(
        "environments" -> environments.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEnvironmentsOutput]
    }
  }

  @js.native
  trait ListRepositoriesInput extends js.Object {
    var maxResults: js.UndefOr[MaxPageResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListRepositoriesInput {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxPageResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListRepositoriesInput = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRepositoriesInput]
    }
  }

  @js.native
  trait ListRepositoriesOutput extends js.Object {
    var repositories: RepositorySummaryList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListRepositoriesOutput {
    @inline
    def apply(
        repositories: RepositorySummaryList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListRepositoriesOutput = {
      val __obj = js.Dynamic.literal(
        "repositories" -> repositories.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRepositoriesOutput]
    }
  }

  @js.native
  trait ListRepositorySyncDefinitionsInput extends js.Object {
    var repositoryName: RepositoryName
    var repositoryProvider: RepositoryProvider
    var syncType: SyncType
    var nextToken: js.UndefOr[EmptyNextToken]
  }

  object ListRepositorySyncDefinitionsInput {
    @inline
    def apply(
        repositoryName: RepositoryName,
        repositoryProvider: RepositoryProvider,
        syncType: SyncType,
        nextToken: js.UndefOr[EmptyNextToken] = js.undefined
    ): ListRepositorySyncDefinitionsInput = {
      val __obj = js.Dynamic.literal(
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "repositoryProvider" -> repositoryProvider.asInstanceOf[js.Any],
        "syncType" -> syncType.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRepositorySyncDefinitionsInput]
    }
  }

  @js.native
  trait ListRepositorySyncDefinitionsOutput extends js.Object {
    var syncDefinitions: RepositorySyncDefinitionList
    var nextToken: js.UndefOr[EmptyNextToken]
  }

  object ListRepositorySyncDefinitionsOutput {
    @inline
    def apply(
        syncDefinitions: RepositorySyncDefinitionList,
        nextToken: js.UndefOr[EmptyNextToken] = js.undefined
    ): ListRepositorySyncDefinitionsOutput = {
      val __obj = js.Dynamic.literal(
        "syncDefinitions" -> syncDefinitions.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRepositorySyncDefinitionsOutput]
    }
  }

  @js.native
  trait ListServiceInstanceOutputsInput extends js.Object {
    var serviceInstanceName: ResourceName
    var serviceName: ResourceName
    var nextToken: js.UndefOr[EmptyNextToken]
  }

  object ListServiceInstanceOutputsInput {
    @inline
    def apply(
        serviceInstanceName: ResourceName,
        serviceName: ResourceName,
        nextToken: js.UndefOr[EmptyNextToken] = js.undefined
    ): ListServiceInstanceOutputsInput = {
      val __obj = js.Dynamic.literal(
        "serviceInstanceName" -> serviceInstanceName.asInstanceOf[js.Any],
        "serviceName" -> serviceName.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServiceInstanceOutputsInput]
    }
  }

  @js.native
  trait ListServiceInstanceOutputsOutput extends js.Object {
    var outputs: OutputsList
    var nextToken: js.UndefOr[EmptyNextToken]
  }

  object ListServiceInstanceOutputsOutput {
    @inline
    def apply(
        outputs: OutputsList,
        nextToken: js.UndefOr[EmptyNextToken] = js.undefined
    ): ListServiceInstanceOutputsOutput = {
      val __obj = js.Dynamic.literal(
        "outputs" -> outputs.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServiceInstanceOutputsOutput]
    }
  }

  @js.native
  trait ListServiceInstanceProvisionedResourcesInput extends js.Object {
    var serviceInstanceName: ResourceName
    var serviceName: ResourceName
    var nextToken: js.UndefOr[EmptyNextToken]
  }

  object ListServiceInstanceProvisionedResourcesInput {
    @inline
    def apply(
        serviceInstanceName: ResourceName,
        serviceName: ResourceName,
        nextToken: js.UndefOr[EmptyNextToken] = js.undefined
    ): ListServiceInstanceProvisionedResourcesInput = {
      val __obj = js.Dynamic.literal(
        "serviceInstanceName" -> serviceInstanceName.asInstanceOf[js.Any],
        "serviceName" -> serviceName.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServiceInstanceProvisionedResourcesInput]
    }
  }

  @js.native
  trait ListServiceInstanceProvisionedResourcesOutput extends js.Object {
    var provisionedResources: ProvisionedResourceList
    var nextToken: js.UndefOr[EmptyNextToken]
  }

  object ListServiceInstanceProvisionedResourcesOutput {
    @inline
    def apply(
        provisionedResources: ProvisionedResourceList,
        nextToken: js.UndefOr[EmptyNextToken] = js.undefined
    ): ListServiceInstanceProvisionedResourcesOutput = {
      val __obj = js.Dynamic.literal(
        "provisionedResources" -> provisionedResources.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServiceInstanceProvisionedResourcesOutput]
    }
  }

  @js.native
  trait ListServiceInstancesInput extends js.Object {
    var maxResults: js.UndefOr[MaxPageResults]
    var nextToken: js.UndefOr[NextToken]
    var serviceName: js.UndefOr[ResourceName]
  }

  object ListServiceInstancesInput {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxPageResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        serviceName: js.UndefOr[ResourceName] = js.undefined
    ): ListServiceInstancesInput = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      serviceName.foreach(__v => __obj.updateDynamic("serviceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServiceInstancesInput]
    }
  }

  @js.native
  trait ListServiceInstancesOutput extends js.Object {
    var serviceInstances: ServiceInstanceSummaryList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListServiceInstancesOutput {
    @inline
    def apply(
        serviceInstances: ServiceInstanceSummaryList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListServiceInstancesOutput = {
      val __obj = js.Dynamic.literal(
        "serviceInstances" -> serviceInstances.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServiceInstancesOutput]
    }
  }

  @js.native
  trait ListServicePipelineOutputsInput extends js.Object {
    var serviceName: ResourceName
    var nextToken: js.UndefOr[EmptyNextToken]
  }

  object ListServicePipelineOutputsInput {
    @inline
    def apply(
        serviceName: ResourceName,
        nextToken: js.UndefOr[EmptyNextToken] = js.undefined
    ): ListServicePipelineOutputsInput = {
      val __obj = js.Dynamic.literal(
        "serviceName" -> serviceName.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServicePipelineOutputsInput]
    }
  }

  @js.native
  trait ListServicePipelineOutputsOutput extends js.Object {
    var outputs: OutputsList
    var nextToken: js.UndefOr[EmptyNextToken]
  }

  object ListServicePipelineOutputsOutput {
    @inline
    def apply(
        outputs: OutputsList,
        nextToken: js.UndefOr[EmptyNextToken] = js.undefined
    ): ListServicePipelineOutputsOutput = {
      val __obj = js.Dynamic.literal(
        "outputs" -> outputs.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServicePipelineOutputsOutput]
    }
  }

  @js.native
  trait ListServicePipelineProvisionedResourcesInput extends js.Object {
    var serviceName: ResourceName
    var nextToken: js.UndefOr[EmptyNextToken]
  }

  object ListServicePipelineProvisionedResourcesInput {
    @inline
    def apply(
        serviceName: ResourceName,
        nextToken: js.UndefOr[EmptyNextToken] = js.undefined
    ): ListServicePipelineProvisionedResourcesInput = {
      val __obj = js.Dynamic.literal(
        "serviceName" -> serviceName.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServicePipelineProvisionedResourcesInput]
    }
  }

  @js.native
  trait ListServicePipelineProvisionedResourcesOutput extends js.Object {
    var provisionedResources: ProvisionedResourceList
    var nextToken: js.UndefOr[EmptyNextToken]
  }

  object ListServicePipelineProvisionedResourcesOutput {
    @inline
    def apply(
        provisionedResources: ProvisionedResourceList,
        nextToken: js.UndefOr[EmptyNextToken] = js.undefined
    ): ListServicePipelineProvisionedResourcesOutput = {
      val __obj = js.Dynamic.literal(
        "provisionedResources" -> provisionedResources.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServicePipelineProvisionedResourcesOutput]
    }
  }

  @js.native
  trait ListServiceTemplateVersionsInput extends js.Object {
    var templateName: ResourceName
    var majorVersion: js.UndefOr[TemplateVersionPart]
    var maxResults: js.UndefOr[MaxPageResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListServiceTemplateVersionsInput {
    @inline
    def apply(
        templateName: ResourceName,
        majorVersion: js.UndefOr[TemplateVersionPart] = js.undefined,
        maxResults: js.UndefOr[MaxPageResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListServiceTemplateVersionsInput = {
      val __obj = js.Dynamic.literal(
        "templateName" -> templateName.asInstanceOf[js.Any]
      )

      majorVersion.foreach(__v => __obj.updateDynamic("majorVersion")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServiceTemplateVersionsInput]
    }
  }

  @js.native
  trait ListServiceTemplateVersionsOutput extends js.Object {
    var templateVersions: ServiceTemplateVersionSummaryList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListServiceTemplateVersionsOutput {
    @inline
    def apply(
        templateVersions: ServiceTemplateVersionSummaryList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListServiceTemplateVersionsOutput = {
      val __obj = js.Dynamic.literal(
        "templateVersions" -> templateVersions.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServiceTemplateVersionsOutput]
    }
  }

  @js.native
  trait ListServiceTemplatesInput extends js.Object {
    var maxResults: js.UndefOr[MaxPageResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListServiceTemplatesInput {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxPageResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListServiceTemplatesInput = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServiceTemplatesInput]
    }
  }

  @js.native
  trait ListServiceTemplatesOutput extends js.Object {
    var templates: ServiceTemplateSummaryList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListServiceTemplatesOutput {
    @inline
    def apply(
        templates: ServiceTemplateSummaryList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListServiceTemplatesOutput = {
      val __obj = js.Dynamic.literal(
        "templates" -> templates.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServiceTemplatesOutput]
    }
  }

  @js.native
  trait ListServicesInput extends js.Object {
    var maxResults: js.UndefOr[MaxPageResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListServicesInput {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxPageResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListServicesInput = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServicesInput]
    }
  }

  @js.native
  trait ListServicesOutput extends js.Object {
    var services: ServiceSummaryList
    var nextToken: js.UndefOr[NextToken]
  }

  object ListServicesOutput {
    @inline
    def apply(
        services: ServiceSummaryList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListServicesOutput = {
      val __obj = js.Dynamic.literal(
        "services" -> services.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServicesOutput]
    }
  }

  @js.native
  trait ListTagsForResourceInput extends js.Object {
    var resourceArn: Arn
    var maxResults: js.UndefOr[MaxPageResults]
    var nextToken: js.UndefOr[String]
  }

  object ListTagsForResourceInput {
    @inline
    def apply(
        resourceArn: Arn,
        maxResults: js.UndefOr[MaxPageResults] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListTagsForResourceInput = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceInput]
    }
  }

  @js.native
  trait ListTagsForResourceOutput extends js.Object {
    var tags: TagList
    var nextToken: js.UndefOr[String]
  }

  object ListTagsForResourceOutput {
    @inline
    def apply(
        tags: TagList,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListTagsForResourceOutput = {
      val __obj = js.Dynamic.literal(
        "tags" -> tags.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceOutput]
    }
  }

  @js.native
  trait NotifyResourceDeploymentStatusChangeInput extends js.Object {
    var resourceArn: Arn
    var status: ResourceDeploymentStatus
    var deploymentId: js.UndefOr[DeploymentId]
    var outputs: js.UndefOr[NotifyResourceDeploymentStatusChangeInputOutputsList]
    var statusMessage: js.UndefOr[SyntheticNotifyResourceDeploymentStatusChangeInputString]
  }

  object NotifyResourceDeploymentStatusChangeInput {
    @inline
    def apply(
        resourceArn: Arn,
        status: ResourceDeploymentStatus,
        deploymentId: js.UndefOr[DeploymentId] = js.undefined,
        outputs: js.UndefOr[NotifyResourceDeploymentStatusChangeInputOutputsList] = js.undefined,
        statusMessage: js.UndefOr[SyntheticNotifyResourceDeploymentStatusChangeInputString] = js.undefined
    ): NotifyResourceDeploymentStatusChangeInput = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      deploymentId.foreach(__v => __obj.updateDynamic("deploymentId")(__v.asInstanceOf[js.Any]))
      outputs.foreach(__v => __obj.updateDynamic("outputs")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NotifyResourceDeploymentStatusChangeInput]
    }
  }

  @js.native
  trait NotifyResourceDeploymentStatusChangeOutput extends js.Object

  object NotifyResourceDeploymentStatusChangeOutput {
    @inline
    def apply(): NotifyResourceDeploymentStatusChangeOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotifyResourceDeploymentStatusChangeOutput]
    }
  }

  /** An infrastructure as code defined resource output.
    */
  @js.native
  trait Output extends js.Object {
    var key: js.UndefOr[OutputKey]
    var valueString: js.UndefOr[OutputValueString]
  }

  object Output {
    @inline
    def apply(
        key: js.UndefOr[OutputKey] = js.undefined,
        valueString: js.UndefOr[OutputValueString] = js.undefined
    ): Output = {
      val __obj = js.Dynamic.literal()
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      valueString.foreach(__v => __obj.updateDynamic("valueString")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Output]
    }
  }

  /** Detail data for a provisioned resource.
    */
  @js.native
  trait ProvisionedResource extends js.Object {
    var identifier: js.UndefOr[ProvisionedResourceIdentifier]
    var name: js.UndefOr[ProvisionedResourceName]
    var provisioningEngine: js.UndefOr[ProvisionedResourceEngine]
  }

  object ProvisionedResource {
    @inline
    def apply(
        identifier: js.UndefOr[ProvisionedResourceIdentifier] = js.undefined,
        name: js.UndefOr[ProvisionedResourceName] = js.undefined,
        provisioningEngine: js.UndefOr[ProvisionedResourceEngine] = js.undefined
    ): ProvisionedResource = {
      val __obj = js.Dynamic.literal()
      identifier.foreach(__v => __obj.updateDynamic("identifier")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      provisioningEngine.foreach(__v => __obj.updateDynamic("provisioningEngine")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProvisionedResource]
    }
  }

  @js.native
  trait RejectEnvironmentAccountConnectionInput extends js.Object {
    var id: EnvironmentAccountConnectionId
  }

  object RejectEnvironmentAccountConnectionInput {
    @inline
    def apply(
        id: EnvironmentAccountConnectionId
    ): RejectEnvironmentAccountConnectionInput = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RejectEnvironmentAccountConnectionInput]
    }
  }

  @js.native
  trait RejectEnvironmentAccountConnectionOutput extends js.Object {
    var environmentAccountConnection: EnvironmentAccountConnection
  }

  object RejectEnvironmentAccountConnectionOutput {
    @inline
    def apply(
        environmentAccountConnection: EnvironmentAccountConnection
    ): RejectEnvironmentAccountConnectionOutput = {
      val __obj = js.Dynamic.literal(
        "environmentAccountConnection" -> environmentAccountConnection.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RejectEnvironmentAccountConnectionOutput]
    }
  }

  /** Detail date for a repository that has been registered with Proton.
    */
  @js.native
  trait Repository extends js.Object {
    var arn: RepositoryArn
    var connectionArn: Arn
    var name: RepositoryName
    var provider: RepositoryProvider
    var encryptionKey: js.UndefOr[Arn]
  }

  object Repository {
    @inline
    def apply(
        arn: RepositoryArn,
        connectionArn: Arn,
        name: RepositoryName,
        provider: RepositoryProvider,
        encryptionKey: js.UndefOr[Arn] = js.undefined
    ): Repository = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "connectionArn" -> connectionArn.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "provider" -> provider.asInstanceOf[js.Any]
      )

      encryptionKey.foreach(__v => __obj.updateDynamic("encryptionKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Repository]
    }
  }

  /** Detail data for a repository branch. <important> Provisioning by pull request is currently in feature preview and is only usable with Terraform based Proton Templates. To learn more about [[https://aws.amazon.com/service-terms|Amazon Web Services Feature Preview terms]], see section 2 on Beta and Previews. </important>
    */
  @js.native
  trait RepositoryBranch extends js.Object {
    var arn: RepositoryArn
    var branch: GitBranchName
    var name: RepositoryName
    var provider: RepositoryProvider
  }

  object RepositoryBranch {
    @inline
    def apply(
        arn: RepositoryArn,
        branch: GitBranchName,
        name: RepositoryName,
        provider: RepositoryProvider
    ): RepositoryBranch = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "branch" -> branch.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "provider" -> provider.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RepositoryBranch]
    }
  }

  /** Detail input data for a repository branch. <important> Provisioning by pull request is currently in feature preview and is only usable with Terraform based Proton Templates. To learn more about [[https://aws.amazon.com/service-terms|Amazon Web Services Feature Preview terms]], see section 2 on Beta and Previews. </important>
    */
  @js.native
  trait RepositoryBranchInput extends js.Object {
    var branch: GitBranchName
    var name: RepositoryName
    var provider: RepositoryProvider
  }

  object RepositoryBranchInput {
    @inline
    def apply(
        branch: GitBranchName,
        name: RepositoryName,
        provider: RepositoryProvider
    ): RepositoryBranchInput = {
      val __obj = js.Dynamic.literal(
        "branch" -> branch.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "provider" -> provider.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RepositoryBranchInput]
    }
  }

  /** A summary of detail data for a registered repository.
    */
  @js.native
  trait RepositorySummary extends js.Object {
    var arn: RepositoryArn
    var name: RepositoryName
    var provider: RepositoryProvider
  }

  object RepositorySummary {
    @inline
    def apply(
        arn: RepositoryArn,
        name: RepositoryName,
        provider: RepositoryProvider
    ): RepositorySummary = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "provider" -> provider.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RepositorySummary]
    }
  }

  /** Detail data for a repository sync attempt activated by a push to a repository.
    */
  @js.native
  trait RepositorySyncAttempt extends js.Object {
    var events: RepositorySyncEvents
    var startedAt: Timestamp
    var status: RepositorySyncStatus
  }

  object RepositorySyncAttempt {
    @inline
    def apply(
        events: RepositorySyncEvents,
        startedAt: Timestamp,
        status: RepositorySyncStatus
    ): RepositorySyncAttempt = {
      val __obj = js.Dynamic.literal(
        "events" -> events.asInstanceOf[js.Any],
        "startedAt" -> startedAt.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RepositorySyncAttempt]
    }
  }

  /** The repository sync definition.
    */
  @js.native
  trait RepositorySyncDefinition extends js.Object {
    var branch: GitBranchName
    var directory: String
    var parent: String
    var target: String
  }

  object RepositorySyncDefinition {
    @inline
    def apply(
        branch: GitBranchName,
        directory: String,
        parent: String,
        target: String
    ): RepositorySyncDefinition = {
      val __obj = js.Dynamic.literal(
        "branch" -> branch.asInstanceOf[js.Any],
        "directory" -> directory.asInstanceOf[js.Any],
        "parent" -> parent.asInstanceOf[js.Any],
        "target" -> target.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RepositorySyncDefinition]
    }
  }

  /** Repository sync event detail data for a sync attempt.
    */
  @js.native
  trait RepositorySyncEvent extends js.Object {
    var event: String
    var time: Timestamp
    var `type`: String
    var externalId: js.UndefOr[String]
  }

  object RepositorySyncEvent {
    @inline
    def apply(
        event: String,
        time: Timestamp,
        `type`: String,
        externalId: js.UndefOr[String] = js.undefined
    ): RepositorySyncEvent = {
      val __obj = js.Dynamic.literal(
        "event" -> event.asInstanceOf[js.Any],
        "time" -> time.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      externalId.foreach(__v => __obj.updateDynamic("externalId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RepositorySyncEvent]
    }
  }

  /** Detail data for a resource sync attempt activated by a push to a repository.
    */
  @js.native
  trait ResourceSyncAttempt extends js.Object {
    var events: ResourceSyncEvents
    var initialRevision: Revision
    var startedAt: Timestamp
    var status: ResourceSyncStatus
    var target: String
    var targetRevision: Revision
  }

  object ResourceSyncAttempt {
    @inline
    def apply(
        events: ResourceSyncEvents,
        initialRevision: Revision,
        startedAt: Timestamp,
        status: ResourceSyncStatus,
        target: String,
        targetRevision: Revision
    ): ResourceSyncAttempt = {
      val __obj = js.Dynamic.literal(
        "events" -> events.asInstanceOf[js.Any],
        "initialRevision" -> initialRevision.asInstanceOf[js.Any],
        "startedAt" -> startedAt.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "target" -> target.asInstanceOf[js.Any],
        "targetRevision" -> targetRevision.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ResourceSyncAttempt]
    }
  }

  /** Detail data for a resource sync event.
    */
  @js.native
  trait ResourceSyncEvent extends js.Object {
    var event: String
    var time: Timestamp
    var `type`: String
    var externalId: js.UndefOr[String]
  }

  object ResourceSyncEvent {
    @inline
    def apply(
        event: String,
        time: Timestamp,
        `type`: String,
        externalId: js.UndefOr[String] = js.undefined
    ): ResourceSyncEvent = {
      val __obj = js.Dynamic.literal(
        "event" -> event.asInstanceOf[js.Any],
        "time" -> time.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      externalId.foreach(__v => __obj.updateDynamic("externalId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceSyncEvent]
    }
  }

  /** Revision detail data for a commit and push that activates a sync attempt
    */
  @js.native
  trait Revision extends js.Object {
    var branch: GitBranchName
    var directory: String
    var repositoryName: RepositoryName
    var repositoryProvider: RepositoryProvider
    var sha: SHA
  }

  object Revision {
    @inline
    def apply(
        branch: GitBranchName,
        directory: String,
        repositoryName: RepositoryName,
        repositoryProvider: RepositoryProvider,
        sha: SHA
    ): Revision = {
      val __obj = js.Dynamic.literal(
        "branch" -> branch.asInstanceOf[js.Any],
        "directory" -> directory.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "repositoryProvider" -> repositoryProvider.asInstanceOf[js.Any],
        "sha" -> sha.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Revision]
    }
  }

  /** Template bundle S3 bucket data.
    */
  @js.native
  trait S3ObjectSource extends js.Object {
    var bucket: S3Bucket
    var key: S3Key
  }

  object S3ObjectSource {
    @inline
    def apply(
        bucket: S3Bucket,
        key: S3Key
    ): S3ObjectSource = {
      val __obj = js.Dynamic.literal(
        "bucket" -> bucket.asInstanceOf[js.Any],
        "key" -> key.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[S3ObjectSource]
    }
  }

  /** The service detail data.
    */
  @js.native
  trait Service extends js.Object {
    var arn: ServiceArn
    var createdAt: Timestamp
    var lastModifiedAt: Timestamp
    var name: ResourceName
    var spec: SpecContents
    var status: ServiceStatus
    var templateName: ResourceName
    var branchName: js.UndefOr[GitBranchName]
    var description: js.UndefOr[Description]
    var pipeline: js.UndefOr[ServicePipeline]
    var repositoryConnectionArn: js.UndefOr[Arn]
    var repositoryId: js.UndefOr[RepositoryId]
    var statusMessage: js.UndefOr[StatusMessage]
  }

  object Service {
    @inline
    def apply(
        arn: ServiceArn,
        createdAt: Timestamp,
        lastModifiedAt: Timestamp,
        name: ResourceName,
        spec: SpecContents,
        status: ServiceStatus,
        templateName: ResourceName,
        branchName: js.UndefOr[GitBranchName] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        pipeline: js.UndefOr[ServicePipeline] = js.undefined,
        repositoryConnectionArn: js.UndefOr[Arn] = js.undefined,
        repositoryId: js.UndefOr[RepositoryId] = js.undefined,
        statusMessage: js.UndefOr[StatusMessage] = js.undefined
    ): Service = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "lastModifiedAt" -> lastModifiedAt.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "spec" -> spec.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "templateName" -> templateName.asInstanceOf[js.Any]
      )

      branchName.foreach(__v => __obj.updateDynamic("branchName")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      pipeline.foreach(__v => __obj.updateDynamic("pipeline")(__v.asInstanceOf[js.Any]))
      repositoryConnectionArn.foreach(__v => __obj.updateDynamic("repositoryConnectionArn")(__v.asInstanceOf[js.Any]))
      repositoryId.foreach(__v => __obj.updateDynamic("repositoryId")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Service]
    }
  }

  /** The service instance detail data.
    */
  @js.native
  trait ServiceInstance extends js.Object {
    var arn: ServiceInstanceArn
    var createdAt: Timestamp
    var deploymentStatus: DeploymentStatus
    var environmentName: ResourceName
    var lastDeploymentAttemptedAt: Timestamp
    var lastDeploymentSucceededAt: Timestamp
    var name: ResourceName
    var serviceName: ResourceName
    var templateMajorVersion: TemplateVersionPart
    var templateMinorVersion: TemplateVersionPart
    var templateName: ResourceName
    var deploymentStatusMessage: js.UndefOr[StatusMessage]
    var spec: js.UndefOr[SpecContents]
  }

  object ServiceInstance {
    @inline
    def apply(
        arn: ServiceInstanceArn,
        createdAt: Timestamp,
        deploymentStatus: DeploymentStatus,
        environmentName: ResourceName,
        lastDeploymentAttemptedAt: Timestamp,
        lastDeploymentSucceededAt: Timestamp,
        name: ResourceName,
        serviceName: ResourceName,
        templateMajorVersion: TemplateVersionPart,
        templateMinorVersion: TemplateVersionPart,
        templateName: ResourceName,
        deploymentStatusMessage: js.UndefOr[StatusMessage] = js.undefined,
        spec: js.UndefOr[SpecContents] = js.undefined
    ): ServiceInstance = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "deploymentStatus" -> deploymentStatus.asInstanceOf[js.Any],
        "environmentName" -> environmentName.asInstanceOf[js.Any],
        "lastDeploymentAttemptedAt" -> lastDeploymentAttemptedAt.asInstanceOf[js.Any],
        "lastDeploymentSucceededAt" -> lastDeploymentSucceededAt.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "serviceName" -> serviceName.asInstanceOf[js.Any],
        "templateMajorVersion" -> templateMajorVersion.asInstanceOf[js.Any],
        "templateMinorVersion" -> templateMinorVersion.asInstanceOf[js.Any],
        "templateName" -> templateName.asInstanceOf[js.Any]
      )

      deploymentStatusMessage.foreach(__v => __obj.updateDynamic("deploymentStatusMessage")(__v.asInstanceOf[js.Any]))
      spec.foreach(__v => __obj.updateDynamic("spec")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceInstance]
    }
  }

  /** A summary of the service instance detail data.
    */
  @js.native
  trait ServiceInstanceSummary extends js.Object {
    var arn: ServiceInstanceArn
    var createdAt: Timestamp
    var deploymentStatus: DeploymentStatus
    var environmentName: ResourceName
    var lastDeploymentAttemptedAt: Timestamp
    var lastDeploymentSucceededAt: Timestamp
    var name: ResourceName
    var serviceName: ResourceName
    var templateMajorVersion: TemplateVersionPart
    var templateMinorVersion: TemplateVersionPart
    var templateName: ResourceName
    var deploymentStatusMessage: js.UndefOr[StatusMessage]
  }

  object ServiceInstanceSummary {
    @inline
    def apply(
        arn: ServiceInstanceArn,
        createdAt: Timestamp,
        deploymentStatus: DeploymentStatus,
        environmentName: ResourceName,
        lastDeploymentAttemptedAt: Timestamp,
        lastDeploymentSucceededAt: Timestamp,
        name: ResourceName,
        serviceName: ResourceName,
        templateMajorVersion: TemplateVersionPart,
        templateMinorVersion: TemplateVersionPart,
        templateName: ResourceName,
        deploymentStatusMessage: js.UndefOr[StatusMessage] = js.undefined
    ): ServiceInstanceSummary = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "deploymentStatus" -> deploymentStatus.asInstanceOf[js.Any],
        "environmentName" -> environmentName.asInstanceOf[js.Any],
        "lastDeploymentAttemptedAt" -> lastDeploymentAttemptedAt.asInstanceOf[js.Any],
        "lastDeploymentSucceededAt" -> lastDeploymentSucceededAt.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "serviceName" -> serviceName.asInstanceOf[js.Any],
        "templateMajorVersion" -> templateMajorVersion.asInstanceOf[js.Any],
        "templateMinorVersion" -> templateMinorVersion.asInstanceOf[js.Any],
        "templateName" -> templateName.asInstanceOf[js.Any]
      )

      deploymentStatusMessage.foreach(__v => __obj.updateDynamic("deploymentStatusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceInstanceSummary]
    }
  }

  /** The service pipeline detail data.
    */
  @js.native
  trait ServicePipeline extends js.Object {
    var arn: Arn
    var createdAt: Timestamp
    var deploymentStatus: DeploymentStatus
    var lastDeploymentAttemptedAt: Timestamp
    var lastDeploymentSucceededAt: Timestamp
    var templateMajorVersion: TemplateVersionPart
    var templateMinorVersion: TemplateVersionPart
    var templateName: ResourceName
    var deploymentStatusMessage: js.UndefOr[StatusMessage]
    var spec: js.UndefOr[SpecContents]
  }

  object ServicePipeline {
    @inline
    def apply(
        arn: Arn,
        createdAt: Timestamp,
        deploymentStatus: DeploymentStatus,
        lastDeploymentAttemptedAt: Timestamp,
        lastDeploymentSucceededAt: Timestamp,
        templateMajorVersion: TemplateVersionPart,
        templateMinorVersion: TemplateVersionPart,
        templateName: ResourceName,
        deploymentStatusMessage: js.UndefOr[StatusMessage] = js.undefined,
        spec: js.UndefOr[SpecContents] = js.undefined
    ): ServicePipeline = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "deploymentStatus" -> deploymentStatus.asInstanceOf[js.Any],
        "lastDeploymentAttemptedAt" -> lastDeploymentAttemptedAt.asInstanceOf[js.Any],
        "lastDeploymentSucceededAt" -> lastDeploymentSucceededAt.asInstanceOf[js.Any],
        "templateMajorVersion" -> templateMajorVersion.asInstanceOf[js.Any],
        "templateMinorVersion" -> templateMinorVersion.asInstanceOf[js.Any],
        "templateName" -> templateName.asInstanceOf[js.Any]
      )

      deploymentStatusMessage.foreach(__v => __obj.updateDynamic("deploymentStatusMessage")(__v.asInstanceOf[js.Any]))
      spec.foreach(__v => __obj.updateDynamic("spec")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServicePipeline]
    }
  }

  /** A summary of the service detail data.
    */
  @js.native
  trait ServiceSummary extends js.Object {
    var arn: ServiceArn
    var createdAt: Timestamp
    var lastModifiedAt: Timestamp
    var name: ResourceName
    var status: ServiceStatus
    var templateName: ResourceName
    var description: js.UndefOr[Description]
    var statusMessage: js.UndefOr[StatusMessage]
  }

  object ServiceSummary {
    @inline
    def apply(
        arn: ServiceArn,
        createdAt: Timestamp,
        lastModifiedAt: Timestamp,
        name: ResourceName,
        status: ServiceStatus,
        templateName: ResourceName,
        description: js.UndefOr[Description] = js.undefined,
        statusMessage: js.UndefOr[StatusMessage] = js.undefined
    ): ServiceSummary = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "lastModifiedAt" -> lastModifiedAt.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "templateName" -> templateName.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceSummary]
    }
  }

  /** The service template detail data.
    */
  @js.native
  trait ServiceTemplate extends js.Object {
    var arn: ServiceTemplateArn
    var createdAt: Timestamp
    var lastModifiedAt: Timestamp
    var name: ResourceName
    var description: js.UndefOr[Description]
    var displayName: js.UndefOr[DisplayName]
    var encryptionKey: js.UndefOr[Arn]
    var pipelineProvisioning: js.UndefOr[Provisioning]
    var recommendedVersion: js.UndefOr[FullTemplateVersionNumber]
  }

  object ServiceTemplate {
    @inline
    def apply(
        arn: ServiceTemplateArn,
        createdAt: Timestamp,
        lastModifiedAt: Timestamp,
        name: ResourceName,
        description: js.UndefOr[Description] = js.undefined,
        displayName: js.UndefOr[DisplayName] = js.undefined,
        encryptionKey: js.UndefOr[Arn] = js.undefined,
        pipelineProvisioning: js.UndefOr[Provisioning] = js.undefined,
        recommendedVersion: js.UndefOr[FullTemplateVersionNumber] = js.undefined
    ): ServiceTemplate = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "lastModifiedAt" -> lastModifiedAt.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      encryptionKey.foreach(__v => __obj.updateDynamic("encryptionKey")(__v.asInstanceOf[js.Any]))
      pipelineProvisioning.foreach(__v => __obj.updateDynamic("pipelineProvisioning")(__v.asInstanceOf[js.Any]))
      recommendedVersion.foreach(__v => __obj.updateDynamic("recommendedVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceTemplate]
    }
  }

  /** The service template summary data.
    */
  @js.native
  trait ServiceTemplateSummary extends js.Object {
    var arn: ServiceTemplateArn
    var createdAt: Timestamp
    var lastModifiedAt: Timestamp
    var name: ResourceName
    var description: js.UndefOr[Description]
    var displayName: js.UndefOr[DisplayName]
    var pipelineProvisioning: js.UndefOr[Provisioning]
    var recommendedVersion: js.UndefOr[FullTemplateVersionNumber]
  }

  object ServiceTemplateSummary {
    @inline
    def apply(
        arn: ServiceTemplateArn,
        createdAt: Timestamp,
        lastModifiedAt: Timestamp,
        name: ResourceName,
        description: js.UndefOr[Description] = js.undefined,
        displayName: js.UndefOr[DisplayName] = js.undefined,
        pipelineProvisioning: js.UndefOr[Provisioning] = js.undefined,
        recommendedVersion: js.UndefOr[FullTemplateVersionNumber] = js.undefined
    ): ServiceTemplateSummary = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "lastModifiedAt" -> lastModifiedAt.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      pipelineProvisioning.foreach(__v => __obj.updateDynamic("pipelineProvisioning")(__v.asInstanceOf[js.Any]))
      recommendedVersion.foreach(__v => __obj.updateDynamic("recommendedVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceTemplateSummary]
    }
  }

  /** The version of a service template detail data.
    */
  @js.native
  trait ServiceTemplateVersion extends js.Object {
    var arn: ServiceTemplateVersionArn
    var compatibleEnvironmentTemplates: CompatibleEnvironmentTemplateList
    var createdAt: Timestamp
    var lastModifiedAt: Timestamp
    var majorVersion: TemplateVersionPart
    var minorVersion: TemplateVersionPart
    var status: TemplateVersionStatus
    var templateName: ResourceName
    var description: js.UndefOr[Description]
    var recommendedMinorVersion: js.UndefOr[TemplateVersionPart]
    var schema: js.UndefOr[TemplateSchema]
    var statusMessage: js.UndefOr[StatusMessage]
  }

  object ServiceTemplateVersion {
    @inline
    def apply(
        arn: ServiceTemplateVersionArn,
        compatibleEnvironmentTemplates: CompatibleEnvironmentTemplateList,
        createdAt: Timestamp,
        lastModifiedAt: Timestamp,
        majorVersion: TemplateVersionPart,
        minorVersion: TemplateVersionPart,
        status: TemplateVersionStatus,
        templateName: ResourceName,
        description: js.UndefOr[Description] = js.undefined,
        recommendedMinorVersion: js.UndefOr[TemplateVersionPart] = js.undefined,
        schema: js.UndefOr[TemplateSchema] = js.undefined,
        statusMessage: js.UndefOr[StatusMessage] = js.undefined
    ): ServiceTemplateVersion = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "compatibleEnvironmentTemplates" -> compatibleEnvironmentTemplates.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "lastModifiedAt" -> lastModifiedAt.asInstanceOf[js.Any],
        "majorVersion" -> majorVersion.asInstanceOf[js.Any],
        "minorVersion" -> minorVersion.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "templateName" -> templateName.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      recommendedMinorVersion.foreach(__v => __obj.updateDynamic("recommendedMinorVersion")(__v.asInstanceOf[js.Any]))
      schema.foreach(__v => __obj.updateDynamic("schema")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceTemplateVersion]
    }
  }

  /** A summary of the service template version detail data.
    */
  @js.native
  trait ServiceTemplateVersionSummary extends js.Object {
    var arn: ServiceTemplateVersionArn
    var createdAt: Timestamp
    var lastModifiedAt: Timestamp
    var majorVersion: TemplateVersionPart
    var minorVersion: TemplateVersionPart
    var status: TemplateVersionStatus
    var templateName: ResourceName
    var description: js.UndefOr[Description]
    var recommendedMinorVersion: js.UndefOr[TemplateVersionPart]
    var statusMessage: js.UndefOr[StatusMessage]
  }

  object ServiceTemplateVersionSummary {
    @inline
    def apply(
        arn: ServiceTemplateVersionArn,
        createdAt: Timestamp,
        lastModifiedAt: Timestamp,
        majorVersion: TemplateVersionPart,
        minorVersion: TemplateVersionPart,
        status: TemplateVersionStatus,
        templateName: ResourceName,
        description: js.UndefOr[Description] = js.undefined,
        recommendedMinorVersion: js.UndefOr[TemplateVersionPart] = js.undefined,
        statusMessage: js.UndefOr[StatusMessage] = js.undefined
    ): ServiceTemplateVersionSummary = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "lastModifiedAt" -> lastModifiedAt.asInstanceOf[js.Any],
        "majorVersion" -> majorVersion.asInstanceOf[js.Any],
        "minorVersion" -> minorVersion.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "templateName" -> templateName.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      recommendedMinorVersion.foreach(__v => __obj.updateDynamic("recommendedMinorVersion")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceTemplateVersionSummary]
    }
  }

  /** A description of a resource tag.
    */
  @js.native
  trait Tag extends js.Object {
    var key: TagKey
    var value: TagValue
  }

  object Tag {
    @inline
    def apply(
        key: TagKey,
        value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "key" -> key.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceInput extends js.Object {
    var resourceArn: Arn
    var tags: TagList
  }

  object TagResourceInput {
    @inline
    def apply(
        resourceArn: Arn,
        tags: TagList
    ): TagResourceInput = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceInput]
    }
  }

  @js.native
  trait TagResourceOutput extends js.Object

  object TagResourceOutput {
    @inline
    def apply(): TagResourceOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceOutput]
    }
  }

  /** The detail data for a template sync configuration.
    */
  @js.native
  trait TemplateSyncConfig extends js.Object {
    var branch: GitBranchName
    var repositoryName: RepositoryName
    var repositoryProvider: RepositoryProvider
    var templateName: ResourceName
    var templateType: TemplateType
    var subdirectory: js.UndefOr[Subdirectory]
  }

  object TemplateSyncConfig {
    @inline
    def apply(
        branch: GitBranchName,
        repositoryName: RepositoryName,
        repositoryProvider: RepositoryProvider,
        templateName: ResourceName,
        templateType: TemplateType,
        subdirectory: js.UndefOr[Subdirectory] = js.undefined
    ): TemplateSyncConfig = {
      val __obj = js.Dynamic.literal(
        "branch" -> branch.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "repositoryProvider" -> repositoryProvider.asInstanceOf[js.Any],
        "templateName" -> templateName.asInstanceOf[js.Any],
        "templateType" -> templateType.asInstanceOf[js.Any]
      )

      subdirectory.foreach(__v => __obj.updateDynamic("subdirectory")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TemplateSyncConfig]
    }
  }

  /** Template version source data.
    */
  @js.native
  trait TemplateVersionSourceInput extends js.Object {
    var s3: js.UndefOr[S3ObjectSource]
  }

  object TemplateVersionSourceInput {
    @inline
    def apply(
        s3: js.UndefOr[S3ObjectSource] = js.undefined
    ): TemplateVersionSourceInput = {
      val __obj = js.Dynamic.literal()
      s3.foreach(__v => __obj.updateDynamic("s3")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TemplateVersionSourceInput]
    }
  }

  @js.native
  trait UntagResourceInput extends js.Object {
    var resourceArn: Arn
    var tagKeys: TagKeyList
  }

  object UntagResourceInput {
    @inline
    def apply(
        resourceArn: Arn,
        tagKeys: TagKeyList
    ): UntagResourceInput = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceInput]
    }
  }

  @js.native
  trait UntagResourceOutput extends js.Object

  object UntagResourceOutput {
    @inline
    def apply(): UntagResourceOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceOutput]
    }
  }

  @js.native
  trait UpdateAccountSettingsInput extends js.Object {
    var pipelineProvisioningRepository: js.UndefOr[RepositoryBranchInput]
    var pipelineServiceRoleArn: js.UndefOr[PipelineRoleArn]
  }

  object UpdateAccountSettingsInput {
    @inline
    def apply(
        pipelineProvisioningRepository: js.UndefOr[RepositoryBranchInput] = js.undefined,
        pipelineServiceRoleArn: js.UndefOr[PipelineRoleArn] = js.undefined
    ): UpdateAccountSettingsInput = {
      val __obj = js.Dynamic.literal()
      pipelineProvisioningRepository.foreach(__v => __obj.updateDynamic("pipelineProvisioningRepository")(__v.asInstanceOf[js.Any]))
      pipelineServiceRoleArn.foreach(__v => __obj.updateDynamic("pipelineServiceRoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAccountSettingsInput]
    }
  }

  @js.native
  trait UpdateAccountSettingsOutput extends js.Object {
    var accountSettings: AccountSettings
  }

  object UpdateAccountSettingsOutput {
    @inline
    def apply(
        accountSettings: AccountSettings
    ): UpdateAccountSettingsOutput = {
      val __obj = js.Dynamic.literal(
        "accountSettings" -> accountSettings.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateAccountSettingsOutput]
    }
  }

  @js.native
  trait UpdateEnvironmentAccountConnectionInput extends js.Object {
    var id: EnvironmentAccountConnectionId
    var roleArn: Arn
  }

  object UpdateEnvironmentAccountConnectionInput {
    @inline
    def apply(
        id: EnvironmentAccountConnectionId,
        roleArn: Arn
    ): UpdateEnvironmentAccountConnectionInput = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateEnvironmentAccountConnectionInput]
    }
  }

  @js.native
  trait UpdateEnvironmentAccountConnectionOutput extends js.Object {
    var environmentAccountConnection: EnvironmentAccountConnection
  }

  object UpdateEnvironmentAccountConnectionOutput {
    @inline
    def apply(
        environmentAccountConnection: EnvironmentAccountConnection
    ): UpdateEnvironmentAccountConnectionOutput = {
      val __obj = js.Dynamic.literal(
        "environmentAccountConnection" -> environmentAccountConnection.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateEnvironmentAccountConnectionOutput]
    }
  }

  @js.native
  trait UpdateEnvironmentInput extends js.Object {
    var deploymentType: DeploymentUpdateType
    var name: ResourceName
    var description: js.UndefOr[Description]
    var environmentAccountConnectionId: js.UndefOr[EnvironmentAccountConnectionId]
    var protonServiceRoleArn: js.UndefOr[Arn]
    var provisioningRepository: js.UndefOr[RepositoryBranchInput]
    var spec: js.UndefOr[SpecContents]
    var templateMajorVersion: js.UndefOr[TemplateVersionPart]
    var templateMinorVersion: js.UndefOr[TemplateVersionPart]
  }

  object UpdateEnvironmentInput {
    @inline
    def apply(
        deploymentType: DeploymentUpdateType,
        name: ResourceName,
        description: js.UndefOr[Description] = js.undefined,
        environmentAccountConnectionId: js.UndefOr[EnvironmentAccountConnectionId] = js.undefined,
        protonServiceRoleArn: js.UndefOr[Arn] = js.undefined,
        provisioningRepository: js.UndefOr[RepositoryBranchInput] = js.undefined,
        spec: js.UndefOr[SpecContents] = js.undefined,
        templateMajorVersion: js.UndefOr[TemplateVersionPart] = js.undefined,
        templateMinorVersion: js.UndefOr[TemplateVersionPart] = js.undefined
    ): UpdateEnvironmentInput = {
      val __obj = js.Dynamic.literal(
        "deploymentType" -> deploymentType.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      environmentAccountConnectionId.foreach(__v => __obj.updateDynamic("environmentAccountConnectionId")(__v.asInstanceOf[js.Any]))
      protonServiceRoleArn.foreach(__v => __obj.updateDynamic("protonServiceRoleArn")(__v.asInstanceOf[js.Any]))
      provisioningRepository.foreach(__v => __obj.updateDynamic("provisioningRepository")(__v.asInstanceOf[js.Any]))
      spec.foreach(__v => __obj.updateDynamic("spec")(__v.asInstanceOf[js.Any]))
      templateMajorVersion.foreach(__v => __obj.updateDynamic("templateMajorVersion")(__v.asInstanceOf[js.Any]))
      templateMinorVersion.foreach(__v => __obj.updateDynamic("templateMinorVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEnvironmentInput]
    }
  }

  @js.native
  trait UpdateEnvironmentOutput extends js.Object {
    var environment: Environment
  }

  object UpdateEnvironmentOutput {
    @inline
    def apply(
        environment: Environment
    ): UpdateEnvironmentOutput = {
      val __obj = js.Dynamic.literal(
        "environment" -> environment.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateEnvironmentOutput]
    }
  }

  @js.native
  trait UpdateEnvironmentTemplateInput extends js.Object {
    var name: ResourceName
    var description: js.UndefOr[Description]
    var displayName: js.UndefOr[DisplayName]
  }

  object UpdateEnvironmentTemplateInput {
    @inline
    def apply(
        name: ResourceName,
        description: js.UndefOr[Description] = js.undefined,
        displayName: js.UndefOr[DisplayName] = js.undefined
    ): UpdateEnvironmentTemplateInput = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEnvironmentTemplateInput]
    }
  }

  @js.native
  trait UpdateEnvironmentTemplateOutput extends js.Object {
    var environmentTemplate: EnvironmentTemplate
  }

  object UpdateEnvironmentTemplateOutput {
    @inline
    def apply(
        environmentTemplate: EnvironmentTemplate
    ): UpdateEnvironmentTemplateOutput = {
      val __obj = js.Dynamic.literal(
        "environmentTemplate" -> environmentTemplate.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateEnvironmentTemplateOutput]
    }
  }

  @js.native
  trait UpdateEnvironmentTemplateVersionInput extends js.Object {
    var majorVersion: TemplateVersionPart
    var minorVersion: TemplateVersionPart
    var templateName: ResourceName
    var description: js.UndefOr[Description]
    var status: js.UndefOr[TemplateVersionStatus]
  }

  object UpdateEnvironmentTemplateVersionInput {
    @inline
    def apply(
        majorVersion: TemplateVersionPart,
        minorVersion: TemplateVersionPart,
        templateName: ResourceName,
        description: js.UndefOr[Description] = js.undefined,
        status: js.UndefOr[TemplateVersionStatus] = js.undefined
    ): UpdateEnvironmentTemplateVersionInput = {
      val __obj = js.Dynamic.literal(
        "majorVersion" -> majorVersion.asInstanceOf[js.Any],
        "minorVersion" -> minorVersion.asInstanceOf[js.Any],
        "templateName" -> templateName.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEnvironmentTemplateVersionInput]
    }
  }

  @js.native
  trait UpdateEnvironmentTemplateVersionOutput extends js.Object {
    var environmentTemplateVersion: EnvironmentTemplateVersion
  }

  object UpdateEnvironmentTemplateVersionOutput {
    @inline
    def apply(
        environmentTemplateVersion: EnvironmentTemplateVersion
    ): UpdateEnvironmentTemplateVersionOutput = {
      val __obj = js.Dynamic.literal(
        "environmentTemplateVersion" -> environmentTemplateVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateEnvironmentTemplateVersionOutput]
    }
  }

  @js.native
  trait UpdateServiceInput extends js.Object {
    var name: ResourceName
    var description: js.UndefOr[Description]
    var spec: js.UndefOr[SpecContents]
  }

  object UpdateServiceInput {
    @inline
    def apply(
        name: ResourceName,
        description: js.UndefOr[Description] = js.undefined,
        spec: js.UndefOr[SpecContents] = js.undefined
    ): UpdateServiceInput = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      spec.foreach(__v => __obj.updateDynamic("spec")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateServiceInput]
    }
  }

  @js.native
  trait UpdateServiceInstanceInput extends js.Object {
    var deploymentType: DeploymentUpdateType
    var name: ResourceName
    var serviceName: ResourceName
    var spec: js.UndefOr[SpecContents]
    var templateMajorVersion: js.UndefOr[TemplateVersionPart]
    var templateMinorVersion: js.UndefOr[TemplateVersionPart]
  }

  object UpdateServiceInstanceInput {
    @inline
    def apply(
        deploymentType: DeploymentUpdateType,
        name: ResourceName,
        serviceName: ResourceName,
        spec: js.UndefOr[SpecContents] = js.undefined,
        templateMajorVersion: js.UndefOr[TemplateVersionPart] = js.undefined,
        templateMinorVersion: js.UndefOr[TemplateVersionPart] = js.undefined
    ): UpdateServiceInstanceInput = {
      val __obj = js.Dynamic.literal(
        "deploymentType" -> deploymentType.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "serviceName" -> serviceName.asInstanceOf[js.Any]
      )

      spec.foreach(__v => __obj.updateDynamic("spec")(__v.asInstanceOf[js.Any]))
      templateMajorVersion.foreach(__v => __obj.updateDynamic("templateMajorVersion")(__v.asInstanceOf[js.Any]))
      templateMinorVersion.foreach(__v => __obj.updateDynamic("templateMinorVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateServiceInstanceInput]
    }
  }

  @js.native
  trait UpdateServiceInstanceOutput extends js.Object {
    var serviceInstance: ServiceInstance
  }

  object UpdateServiceInstanceOutput {
    @inline
    def apply(
        serviceInstance: ServiceInstance
    ): UpdateServiceInstanceOutput = {
      val __obj = js.Dynamic.literal(
        "serviceInstance" -> serviceInstance.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateServiceInstanceOutput]
    }
  }

  @js.native
  trait UpdateServiceOutput extends js.Object {
    var service: Service
  }

  object UpdateServiceOutput {
    @inline
    def apply(
        service: Service
    ): UpdateServiceOutput = {
      val __obj = js.Dynamic.literal(
        "service" -> service.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateServiceOutput]
    }
  }

  @js.native
  trait UpdateServicePipelineInput extends js.Object {
    var deploymentType: DeploymentUpdateType
    var serviceName: ResourceName
    var spec: SpecContents
    var templateMajorVersion: js.UndefOr[TemplateVersionPart]
    var templateMinorVersion: js.UndefOr[TemplateVersionPart]
  }

  object UpdateServicePipelineInput {
    @inline
    def apply(
        deploymentType: DeploymentUpdateType,
        serviceName: ResourceName,
        spec: SpecContents,
        templateMajorVersion: js.UndefOr[TemplateVersionPart] = js.undefined,
        templateMinorVersion: js.UndefOr[TemplateVersionPart] = js.undefined
    ): UpdateServicePipelineInput = {
      val __obj = js.Dynamic.literal(
        "deploymentType" -> deploymentType.asInstanceOf[js.Any],
        "serviceName" -> serviceName.asInstanceOf[js.Any],
        "spec" -> spec.asInstanceOf[js.Any]
      )

      templateMajorVersion.foreach(__v => __obj.updateDynamic("templateMajorVersion")(__v.asInstanceOf[js.Any]))
      templateMinorVersion.foreach(__v => __obj.updateDynamic("templateMinorVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateServicePipelineInput]
    }
  }

  @js.native
  trait UpdateServicePipelineOutput extends js.Object {
    var pipeline: ServicePipeline
  }

  object UpdateServicePipelineOutput {
    @inline
    def apply(
        pipeline: ServicePipeline
    ): UpdateServicePipelineOutput = {
      val __obj = js.Dynamic.literal(
        "pipeline" -> pipeline.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateServicePipelineOutput]
    }
  }

  @js.native
  trait UpdateServiceTemplateInput extends js.Object {
    var name: ResourceName
    var description: js.UndefOr[Description]
    var displayName: js.UndefOr[DisplayName]
  }

  object UpdateServiceTemplateInput {
    @inline
    def apply(
        name: ResourceName,
        description: js.UndefOr[Description] = js.undefined,
        displayName: js.UndefOr[DisplayName] = js.undefined
    ): UpdateServiceTemplateInput = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateServiceTemplateInput]
    }
  }

  @js.native
  trait UpdateServiceTemplateOutput extends js.Object {
    var serviceTemplate: ServiceTemplate
  }

  object UpdateServiceTemplateOutput {
    @inline
    def apply(
        serviceTemplate: ServiceTemplate
    ): UpdateServiceTemplateOutput = {
      val __obj = js.Dynamic.literal(
        "serviceTemplate" -> serviceTemplate.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateServiceTemplateOutput]
    }
  }

  @js.native
  trait UpdateServiceTemplateVersionInput extends js.Object {
    var majorVersion: TemplateVersionPart
    var minorVersion: TemplateVersionPart
    var templateName: ResourceName
    var compatibleEnvironmentTemplates: js.UndefOr[CompatibleEnvironmentTemplateInputList]
    var description: js.UndefOr[Description]
    var status: js.UndefOr[TemplateVersionStatus]
  }

  object UpdateServiceTemplateVersionInput {
    @inline
    def apply(
        majorVersion: TemplateVersionPart,
        minorVersion: TemplateVersionPart,
        templateName: ResourceName,
        compatibleEnvironmentTemplates: js.UndefOr[CompatibleEnvironmentTemplateInputList] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        status: js.UndefOr[TemplateVersionStatus] = js.undefined
    ): UpdateServiceTemplateVersionInput = {
      val __obj = js.Dynamic.literal(
        "majorVersion" -> majorVersion.asInstanceOf[js.Any],
        "minorVersion" -> minorVersion.asInstanceOf[js.Any],
        "templateName" -> templateName.asInstanceOf[js.Any]
      )

      compatibleEnvironmentTemplates.foreach(__v => __obj.updateDynamic("compatibleEnvironmentTemplates")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateServiceTemplateVersionInput]
    }
  }

  @js.native
  trait UpdateServiceTemplateVersionOutput extends js.Object {
    var serviceTemplateVersion: ServiceTemplateVersion
  }

  object UpdateServiceTemplateVersionOutput {
    @inline
    def apply(
        serviceTemplateVersion: ServiceTemplateVersion
    ): UpdateServiceTemplateVersionOutput = {
      val __obj = js.Dynamic.literal(
        "serviceTemplateVersion" -> serviceTemplateVersion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateServiceTemplateVersionOutput]
    }
  }

  @js.native
  trait UpdateTemplateSyncConfigInput extends js.Object {
    var branch: GitBranchName
    var repositoryName: RepositoryName
    var repositoryProvider: RepositoryProvider
    var templateName: ResourceName
    var templateType: TemplateType
    var subdirectory: js.UndefOr[Subdirectory]
  }

  object UpdateTemplateSyncConfigInput {
    @inline
    def apply(
        branch: GitBranchName,
        repositoryName: RepositoryName,
        repositoryProvider: RepositoryProvider,
        templateName: ResourceName,
        templateType: TemplateType,
        subdirectory: js.UndefOr[Subdirectory] = js.undefined
    ): UpdateTemplateSyncConfigInput = {
      val __obj = js.Dynamic.literal(
        "branch" -> branch.asInstanceOf[js.Any],
        "repositoryName" -> repositoryName.asInstanceOf[js.Any],
        "repositoryProvider" -> repositoryProvider.asInstanceOf[js.Any],
        "templateName" -> templateName.asInstanceOf[js.Any],
        "templateType" -> templateType.asInstanceOf[js.Any]
      )

      subdirectory.foreach(__v => __obj.updateDynamic("subdirectory")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTemplateSyncConfigInput]
    }
  }

  @js.native
  trait UpdateTemplateSyncConfigOutput extends js.Object {
    var templateSyncConfig: js.UndefOr[TemplateSyncConfig]
  }

  object UpdateTemplateSyncConfigOutput {
    @inline
    def apply(
        templateSyncConfig: js.UndefOr[TemplateSyncConfig] = js.undefined
    ): UpdateTemplateSyncConfigOutput = {
      val __obj = js.Dynamic.literal()
      templateSyncConfig.foreach(__v => __obj.updateDynamic("templateSyncConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTemplateSyncConfigOutput]
    }
  }
}
