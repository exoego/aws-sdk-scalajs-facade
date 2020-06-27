package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object iotthingsgraph {
  type Arn                         = String
  type DefinitionText              = String
  type DependencyRevisions         = js.Array[DependencyRevision]
  type DeprecateExistingEntities   = Boolean
  type Enabled                     = Boolean
  type EntityDescriptions          = js.Array[EntityDescription]
  type EntityFilterValue           = String
  type EntityFilterValues          = js.Array[EntityFilterValue]
  type EntityFilters               = js.Array[EntityFilter]
  type EntityTypes                 = js.Array[EntityType]
  type FlowExecutionId             = String
  type FlowExecutionMessageId      = String
  type FlowExecutionMessagePayload = String
  type FlowExecutionMessages       = js.Array[FlowExecutionMessage]
  type FlowExecutionSummaries      = js.Array[FlowExecutionSummary]
  type FlowTemplateFilterValue     = String
  type FlowTemplateFilterValues    = js.Array[FlowTemplateFilterValue]
  type FlowTemplateFilters         = js.Array[FlowTemplateFilter]
  type FlowTemplateSummaries       = js.Array[FlowTemplateSummary]
  type GreengrassDeploymentId      = String
  type GreengrassGroupId           = String
  type GreengrassGroupVersionId    = String
  type GroupName                   = String
  type MaxResults                  = Int
  type NamespaceName               = String
  type NextToken                   = String
  type ResourceArn                 = String
  type RoleArn                     = String
  type S3BucketName                = String
  type StringList                  = js.Array[String]
  type SyncWithPublicNamespace     = Boolean
  type SystemInstanceFilterValue   = String
  type SystemInstanceFilterValues  = js.Array[SystemInstanceFilterValue]
  type SystemInstanceFilters       = js.Array[SystemInstanceFilter]
  type SystemInstanceSummaries     = js.Array[SystemInstanceSummary]
  type SystemTemplateFilterValue   = String
  type SystemTemplateFilterValues  = js.Array[SystemTemplateFilterValue]
  type SystemTemplateFilters       = js.Array[SystemTemplateFilter]
  type SystemTemplateSummaries     = js.Array[SystemTemplateSummary]
  type TagKey                      = String
  type TagKeyList                  = js.Array[TagKey]
  type TagList                     = js.Array[Tag]
  type TagValue                    = String
  type ThingArn                    = String
  type ThingName                   = String
  type Things                      = js.Array[Thing]
  type Timestamp                   = js.Date
  type UploadId                    = String
  type Urn                         = String
  type Urns                        = js.Array[Urn]
  type Version                     = Double

  implicit final class IoTThingsGraphOps(private val service: IoTThingsGraph) extends AnyVal {

    @inline def associateEntityToThingFuture(
        params: AssociateEntityToThingRequest
    ): Future[AssociateEntityToThingResponse] = service.associateEntityToThing(params).promise().toFuture
    @inline def createFlowTemplateFuture(params: CreateFlowTemplateRequest): Future[CreateFlowTemplateResponse] =
      service.createFlowTemplate(params).promise().toFuture
    @inline def createSystemInstanceFuture(params: CreateSystemInstanceRequest): Future[CreateSystemInstanceResponse] =
      service.createSystemInstance(params).promise().toFuture
    @inline def createSystemTemplateFuture(params: CreateSystemTemplateRequest): Future[CreateSystemTemplateResponse] =
      service.createSystemTemplate(params).promise().toFuture
    @inline def deleteFlowTemplateFuture(params: DeleteFlowTemplateRequest): Future[DeleteFlowTemplateResponse] =
      service.deleteFlowTemplate(params).promise().toFuture
    @inline def deleteNamespaceFuture(params: DeleteNamespaceRequest): Future[DeleteNamespaceResponse] =
      service.deleteNamespace(params).promise().toFuture
    @inline def deleteSystemInstanceFuture(params: DeleteSystemInstanceRequest): Future[DeleteSystemInstanceResponse] =
      service.deleteSystemInstance(params).promise().toFuture
    @inline def deleteSystemTemplateFuture(params: DeleteSystemTemplateRequest): Future[DeleteSystemTemplateResponse] =
      service.deleteSystemTemplate(params).promise().toFuture
    @inline def deploySystemInstanceFuture(params: DeploySystemInstanceRequest): Future[DeploySystemInstanceResponse] =
      service.deploySystemInstance(params).promise().toFuture
    @inline def deprecateFlowTemplateFuture(
        params: DeprecateFlowTemplateRequest
    ): Future[DeprecateFlowTemplateResponse] = service.deprecateFlowTemplate(params).promise().toFuture
    @inline def deprecateSystemTemplateFuture(
        params: DeprecateSystemTemplateRequest
    ): Future[DeprecateSystemTemplateResponse] = service.deprecateSystemTemplate(params).promise().toFuture
    @inline def describeNamespaceFuture(params: DescribeNamespaceRequest): Future[DescribeNamespaceResponse] =
      service.describeNamespace(params).promise().toFuture
    @inline def dissociateEntityFromThingFuture(
        params: DissociateEntityFromThingRequest
    ): Future[DissociateEntityFromThingResponse] = service.dissociateEntityFromThing(params).promise().toFuture
    @inline def getEntitiesFuture(params: GetEntitiesRequest): Future[GetEntitiesResponse] =
      service.getEntities(params).promise().toFuture
    @inline def getFlowTemplateFuture(params: GetFlowTemplateRequest): Future[GetFlowTemplateResponse] =
      service.getFlowTemplate(params).promise().toFuture
    @inline def getFlowTemplateRevisionsFuture(
        params: GetFlowTemplateRevisionsRequest
    ): Future[GetFlowTemplateRevisionsResponse] = service.getFlowTemplateRevisions(params).promise().toFuture
    @inline def getNamespaceDeletionStatusFuture(
        params: GetNamespaceDeletionStatusRequest
    ): Future[GetNamespaceDeletionStatusResponse] = service.getNamespaceDeletionStatus(params).promise().toFuture
    @inline def getSystemInstanceFuture(params: GetSystemInstanceRequest): Future[GetSystemInstanceResponse] =
      service.getSystemInstance(params).promise().toFuture
    @inline def getSystemTemplateFuture(params: GetSystemTemplateRequest): Future[GetSystemTemplateResponse] =
      service.getSystemTemplate(params).promise().toFuture
    @inline def getSystemTemplateRevisionsFuture(
        params: GetSystemTemplateRevisionsRequest
    ): Future[GetSystemTemplateRevisionsResponse] = service.getSystemTemplateRevisions(params).promise().toFuture
    @inline def getUploadStatusFuture(params: GetUploadStatusRequest): Future[GetUploadStatusResponse] =
      service.getUploadStatus(params).promise().toFuture
    @inline def listFlowExecutionMessagesFuture(
        params: ListFlowExecutionMessagesRequest
    ): Future[ListFlowExecutionMessagesResponse] = service.listFlowExecutionMessages(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def searchEntitiesFuture(params: SearchEntitiesRequest): Future[SearchEntitiesResponse] =
      service.searchEntities(params).promise().toFuture
    @inline def searchFlowExecutionsFuture(params: SearchFlowExecutionsRequest): Future[SearchFlowExecutionsResponse] =
      service.searchFlowExecutions(params).promise().toFuture
    @inline def searchFlowTemplatesFuture(params: SearchFlowTemplatesRequest): Future[SearchFlowTemplatesResponse] =
      service.searchFlowTemplates(params).promise().toFuture
    @inline def searchSystemInstancesFuture(
        params: SearchSystemInstancesRequest
    ): Future[SearchSystemInstancesResponse] = service.searchSystemInstances(params).promise().toFuture
    @inline def searchSystemTemplatesFuture(
        params: SearchSystemTemplatesRequest
    ): Future[SearchSystemTemplatesResponse] = service.searchSystemTemplates(params).promise().toFuture
    @inline def searchThingsFuture(params: SearchThingsRequest): Future[SearchThingsResponse] =
      service.searchThings(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def undeploySystemInstanceFuture(
        params: UndeploySystemInstanceRequest
    ): Future[UndeploySystemInstanceResponse] = service.undeploySystemInstance(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateFlowTemplateFuture(params: UpdateFlowTemplateRequest): Future[UpdateFlowTemplateResponse] =
      service.updateFlowTemplate(params).promise().toFuture
    @inline def updateSystemTemplateFuture(params: UpdateSystemTemplateRequest): Future[UpdateSystemTemplateResponse] =
      service.updateSystemTemplate(params).promise().toFuture
    @inline def uploadEntityDefinitionsFuture(
        params: UploadEntityDefinitionsRequest
    ): Future[UploadEntityDefinitionsResponse] = service.uploadEntityDefinitions(params).promise().toFuture
  }
}

package iotthingsgraph {
  @js.native
  @JSImport("aws-sdk", "IoTThingsGraph")
  class IoTThingsGraph() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateEntityToThing(params: AssociateEntityToThingRequest): Request[AssociateEntityToThingResponse] =
      js.native
    def createFlowTemplate(params: CreateFlowTemplateRequest): Request[CreateFlowTemplateResponse]          = js.native
    def createSystemInstance(params: CreateSystemInstanceRequest): Request[CreateSystemInstanceResponse]    = js.native
    def createSystemTemplate(params: CreateSystemTemplateRequest): Request[CreateSystemTemplateResponse]    = js.native
    def deleteFlowTemplate(params: DeleteFlowTemplateRequest): Request[DeleteFlowTemplateResponse]          = js.native
    def deleteNamespace(params: DeleteNamespaceRequest): Request[DeleteNamespaceResponse]                   = js.native
    def deleteSystemInstance(params: DeleteSystemInstanceRequest): Request[DeleteSystemInstanceResponse]    = js.native
    def deleteSystemTemplate(params: DeleteSystemTemplateRequest): Request[DeleteSystemTemplateResponse]    = js.native
    def deploySystemInstance(params: DeploySystemInstanceRequest): Request[DeploySystemInstanceResponse]    = js.native
    def deprecateFlowTemplate(params: DeprecateFlowTemplateRequest): Request[DeprecateFlowTemplateResponse] = js.native
    def deprecateSystemTemplate(params: DeprecateSystemTemplateRequest): Request[DeprecateSystemTemplateResponse] =
      js.native
    def describeNamespace(params: DescribeNamespaceRequest): Request[DescribeNamespaceResponse] = js.native
    def dissociateEntityFromThing(
        params: DissociateEntityFromThingRequest
    ): Request[DissociateEntityFromThingResponse]                                         = js.native
    def getEntities(params: GetEntitiesRequest): Request[GetEntitiesResponse]             = js.native
    def getFlowTemplate(params: GetFlowTemplateRequest): Request[GetFlowTemplateResponse] = js.native
    def getFlowTemplateRevisions(params: GetFlowTemplateRevisionsRequest): Request[GetFlowTemplateRevisionsResponse] =
      js.native
    def getNamespaceDeletionStatus(
        params: GetNamespaceDeletionStatusRequest
    ): Request[GetNamespaceDeletionStatusResponse]                                              = js.native
    def getSystemInstance(params: GetSystemInstanceRequest): Request[GetSystemInstanceResponse] = js.native
    def getSystemTemplate(params: GetSystemTemplateRequest): Request[GetSystemTemplateResponse] = js.native
    def getSystemTemplateRevisions(
        params: GetSystemTemplateRevisionsRequest
    ): Request[GetSystemTemplateRevisionsResponse]                                        = js.native
    def getUploadStatus(params: GetUploadStatusRequest): Request[GetUploadStatusResponse] = js.native
    def listFlowExecutionMessages(
        params: ListFlowExecutionMessagesRequest
    ): Request[ListFlowExecutionMessagesResponse]                                                           = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]       = js.native
    def searchEntities(params: SearchEntitiesRequest): Request[SearchEntitiesResponse]                      = js.native
    def searchFlowExecutions(params: SearchFlowExecutionsRequest): Request[SearchFlowExecutionsResponse]    = js.native
    def searchFlowTemplates(params: SearchFlowTemplatesRequest): Request[SearchFlowTemplatesResponse]       = js.native
    def searchSystemInstances(params: SearchSystemInstancesRequest): Request[SearchSystemInstancesResponse] = js.native
    def searchSystemTemplates(params: SearchSystemTemplatesRequest): Request[SearchSystemTemplatesResponse] = js.native
    def searchThings(params: SearchThingsRequest): Request[SearchThingsResponse]                            = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                               = js.native
    def undeploySystemInstance(params: UndeploySystemInstanceRequest): Request[UndeploySystemInstanceResponse] =
      js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                      = js.native
    def updateFlowTemplate(params: UpdateFlowTemplateRequest): Request[UpdateFlowTemplateResponse]       = js.native
    def updateSystemTemplate(params: UpdateSystemTemplateRequest): Request[UpdateSystemTemplateResponse] = js.native
    def uploadEntityDefinitions(params: UploadEntityDefinitionsRequest): Request[UploadEntityDefinitionsResponse] =
      js.native
  }

  @js.native
  @Factory
  trait AssociateEntityToThingRequest extends js.Object {
    var entityId: Urn
    var thingName: ThingName
    var namespaceVersion: js.UndefOr[Version]
  }

  @js.native
  @Factory
  trait AssociateEntityToThingResponse extends js.Object {}

  @js.native
  @Factory
  trait CreateFlowTemplateRequest extends js.Object {
    var definition: DefinitionDocument
    var compatibleNamespaceVersion: js.UndefOr[Version]
  }

  @js.native
  @Factory
  trait CreateFlowTemplateResponse extends js.Object {
    var summary: js.UndefOr[FlowTemplateSummary]
  }

  @js.native
  @Factory
  trait CreateSystemInstanceRequest extends js.Object {
    var definition: DefinitionDocument
    var target: DeploymentTarget
    var flowActionsRoleArn: js.UndefOr[RoleArn]
    var greengrassGroupName: js.UndefOr[GroupName]
    var metricsConfiguration: js.UndefOr[MetricsConfiguration]
    var s3BucketName: js.UndefOr[S3BucketName]
    var tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateSystemInstanceResponse extends js.Object {
    var summary: js.UndefOr[SystemInstanceSummary]
  }

  @js.native
  @Factory
  trait CreateSystemTemplateRequest extends js.Object {
    var definition: DefinitionDocument
    var compatibleNamespaceVersion: js.UndefOr[Version]
  }

  @js.native
  @Factory
  trait CreateSystemTemplateResponse extends js.Object {
    var summary: js.UndefOr[SystemTemplateSummary]
  }

  /**
    * A document that defines an entity.
    */
  @js.native
  @Factory
  trait DefinitionDocument extends js.Object {
    var language: DefinitionLanguage
    var text: DefinitionText
  }

  @js.native
  sealed trait DefinitionLanguage extends js.Any
  object DefinitionLanguage extends js.Object {
    val GRAPHQL = "GRAPHQL".asInstanceOf[DefinitionLanguage]

    val values = js.Object.freeze(js.Array(GRAPHQL))
  }

  @js.native
  @Factory
  trait DeleteFlowTemplateRequest extends js.Object {
    var id: Urn
  }

  @js.native
  @Factory
  trait DeleteFlowTemplateResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteNamespaceRequest extends js.Object {}

  @js.native
  @Factory
  trait DeleteNamespaceResponse extends js.Object {
    var namespaceArn: js.UndefOr[Arn]
    var namespaceName: js.UndefOr[NamespaceName]
  }

  @js.native
  @Factory
  trait DeleteSystemInstanceRequest extends js.Object {
    var id: js.UndefOr[Urn]
  }

  @js.native
  @Factory
  trait DeleteSystemInstanceResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteSystemTemplateRequest extends js.Object {
    var id: Urn
  }

  @js.native
  @Factory
  trait DeleteSystemTemplateResponse extends js.Object {}

  /**
    * An object that contains the ID and revision number of a workflow or system that is part of a deployment.
    */
  @js.native
  @Factory
  trait DependencyRevision extends js.Object {
    var id: js.UndefOr[Urn]
    var revisionNumber: js.UndefOr[Version]
  }

  @js.native
  @Factory
  trait DeploySystemInstanceRequest extends js.Object {
    var id: js.UndefOr[Urn]
  }

  @js.native
  @Factory
  trait DeploySystemInstanceResponse extends js.Object {
    var summary: SystemInstanceSummary
    var greengrassDeploymentId: js.UndefOr[GreengrassDeploymentId]
  }

  @js.native
  sealed trait DeploymentTarget extends js.Any
  object DeploymentTarget extends js.Object {
    val GREENGRASS = "GREENGRASS".asInstanceOf[DeploymentTarget]
    val CLOUD      = "CLOUD".asInstanceOf[DeploymentTarget]

    val values = js.Object.freeze(js.Array(GREENGRASS, CLOUD))
  }

  @js.native
  @Factory
  trait DeprecateFlowTemplateRequest extends js.Object {
    var id: Urn
  }

  @js.native
  @Factory
  trait DeprecateFlowTemplateResponse extends js.Object {}

  @js.native
  @Factory
  trait DeprecateSystemTemplateRequest extends js.Object {
    var id: Urn
  }

  @js.native
  @Factory
  trait DeprecateSystemTemplateResponse extends js.Object {}

  @js.native
  @Factory
  trait DescribeNamespaceRequest extends js.Object {
    var namespaceName: js.UndefOr[NamespaceName]
  }

  @js.native
  @Factory
  trait DescribeNamespaceResponse extends js.Object {
    var namespaceArn: js.UndefOr[Arn]
    var namespaceName: js.UndefOr[NamespaceName]
    var namespaceVersion: js.UndefOr[Version]
    var trackingNamespaceName: js.UndefOr[NamespaceName]
    var trackingNamespaceVersion: js.UndefOr[Version]
  }

  @js.native
  @Factory
  trait DissociateEntityFromThingRequest extends js.Object {
    var entityType: EntityType
    var thingName: ThingName
  }

  @js.native
  @Factory
  trait DissociateEntityFromThingResponse extends js.Object {}

  /**
    * Describes the properties of an entity.
    */
  @js.native
  @Factory
  trait EntityDescription extends js.Object {
    var arn: js.UndefOr[Arn]
    var createdAt: js.UndefOr[Timestamp]
    var definition: js.UndefOr[DefinitionDocument]
    var id: js.UndefOr[Urn]
    var `type`: js.UndefOr[EntityType]
  }

  /**
    * An object that filters an entity search. Multiple filters function as OR criteria in the search. For example a search that includes a <code>NAMESPACE</code> and a <code>REFERENCED_ENTITY_ID</code> filter searches for entities in the specified namespace that use the entity specified by the value of <code>REFERENCED_ENTITY_ID</code>.
    */
  @js.native
  @Factory
  trait EntityFilter extends js.Object {
    var name: js.UndefOr[EntityFilterName]
    var value: js.UndefOr[EntityFilterValues]
  }

  @js.native
  sealed trait EntityFilterName extends js.Any
  object EntityFilterName extends js.Object {
    val NAME                 = "NAME".asInstanceOf[EntityFilterName]
    val NAMESPACE            = "NAMESPACE".asInstanceOf[EntityFilterName]
    val SEMANTIC_TYPE_PATH   = "SEMANTIC_TYPE_PATH".asInstanceOf[EntityFilterName]
    val REFERENCED_ENTITY_ID = "REFERENCED_ENTITY_ID".asInstanceOf[EntityFilterName]

    val values = js.Object.freeze(js.Array(NAME, NAMESPACE, SEMANTIC_TYPE_PATH, REFERENCED_ENTITY_ID))
  }

  @js.native
  sealed trait EntityType extends js.Any
  object EntityType extends js.Object {
    val DEVICE       = "DEVICE".asInstanceOf[EntityType]
    val SERVICE      = "SERVICE".asInstanceOf[EntityType]
    val DEVICE_MODEL = "DEVICE_MODEL".asInstanceOf[EntityType]
    val CAPABILITY   = "CAPABILITY".asInstanceOf[EntityType]
    val STATE        = "STATE".asInstanceOf[EntityType]
    val ACTION       = "ACTION".asInstanceOf[EntityType]
    val EVENT        = "EVENT".asInstanceOf[EntityType]
    val PROPERTY     = "PROPERTY".asInstanceOf[EntityType]
    val MAPPING      = "MAPPING".asInstanceOf[EntityType]
    val ENUM         = "ENUM".asInstanceOf[EntityType]

    val values = js.Object.freeze(
      js.Array(DEVICE, SERVICE, DEVICE_MODEL, CAPABILITY, STATE, ACTION, EVENT, PROPERTY, MAPPING, ENUM)
    )
  }

  @js.native
  sealed trait FlowExecutionEventType extends js.Any
  object FlowExecutionEventType extends js.Object {
    val EXECUTION_STARTED              = "EXECUTION_STARTED".asInstanceOf[FlowExecutionEventType]
    val EXECUTION_FAILED               = "EXECUTION_FAILED".asInstanceOf[FlowExecutionEventType]
    val EXECUTION_ABORTED              = "EXECUTION_ABORTED".asInstanceOf[FlowExecutionEventType]
    val EXECUTION_SUCCEEDED            = "EXECUTION_SUCCEEDED".asInstanceOf[FlowExecutionEventType]
    val STEP_STARTED                   = "STEP_STARTED".asInstanceOf[FlowExecutionEventType]
    val STEP_FAILED                    = "STEP_FAILED".asInstanceOf[FlowExecutionEventType]
    val STEP_SUCCEEDED                 = "STEP_SUCCEEDED".asInstanceOf[FlowExecutionEventType]
    val ACTIVITY_SCHEDULED             = "ACTIVITY_SCHEDULED".asInstanceOf[FlowExecutionEventType]
    val ACTIVITY_STARTED               = "ACTIVITY_STARTED".asInstanceOf[FlowExecutionEventType]
    val ACTIVITY_FAILED                = "ACTIVITY_FAILED".asInstanceOf[FlowExecutionEventType]
    val ACTIVITY_SUCCEEDED             = "ACTIVITY_SUCCEEDED".asInstanceOf[FlowExecutionEventType]
    val START_FLOW_EXECUTION_TASK      = "START_FLOW_EXECUTION_TASK".asInstanceOf[FlowExecutionEventType]
    val SCHEDULE_NEXT_READY_STEPS_TASK = "SCHEDULE_NEXT_READY_STEPS_TASK".asInstanceOf[FlowExecutionEventType]
    val THING_ACTION_TASK              = "THING_ACTION_TASK".asInstanceOf[FlowExecutionEventType]
    val THING_ACTION_TASK_FAILED       = "THING_ACTION_TASK_FAILED".asInstanceOf[FlowExecutionEventType]
    val THING_ACTION_TASK_SUCCEEDED    = "THING_ACTION_TASK_SUCCEEDED".asInstanceOf[FlowExecutionEventType]
    val ACKNOWLEDGE_TASK_MESSAGE       = "ACKNOWLEDGE_TASK_MESSAGE".asInstanceOf[FlowExecutionEventType]

    val values = js.Object.freeze(
      js.Array(
        EXECUTION_STARTED,
        EXECUTION_FAILED,
        EXECUTION_ABORTED,
        EXECUTION_SUCCEEDED,
        STEP_STARTED,
        STEP_FAILED,
        STEP_SUCCEEDED,
        ACTIVITY_SCHEDULED,
        ACTIVITY_STARTED,
        ACTIVITY_FAILED,
        ACTIVITY_SUCCEEDED,
        START_FLOW_EXECUTION_TASK,
        SCHEDULE_NEXT_READY_STEPS_TASK,
        THING_ACTION_TASK,
        THING_ACTION_TASK_FAILED,
        THING_ACTION_TASK_SUCCEEDED,
        ACKNOWLEDGE_TASK_MESSAGE
      )
    )
  }

  /**
    * An object that contains information about a flow event.
    */
  @js.native
  @Factory
  trait FlowExecutionMessage extends js.Object {
    var eventType: js.UndefOr[FlowExecutionEventType]
    var messageId: js.UndefOr[FlowExecutionMessageId]
    var payload: js.UndefOr[FlowExecutionMessagePayload]
    var timestamp: js.UndefOr[Timestamp]
  }

  @js.native
  sealed trait FlowExecutionStatus extends js.Any
  object FlowExecutionStatus extends js.Object {
    val RUNNING   = "RUNNING".asInstanceOf[FlowExecutionStatus]
    val ABORTED   = "ABORTED".asInstanceOf[FlowExecutionStatus]
    val SUCCEEDED = "SUCCEEDED".asInstanceOf[FlowExecutionStatus]
    val FAILED    = "FAILED".asInstanceOf[FlowExecutionStatus]

    val values = js.Object.freeze(js.Array(RUNNING, ABORTED, SUCCEEDED, FAILED))
  }

  /**
    * An object that contains summary information about a flow execution.
    */
  @js.native
  @Factory
  trait FlowExecutionSummary extends js.Object {
    var createdAt: js.UndefOr[Timestamp]
    var flowExecutionId: js.UndefOr[FlowExecutionId]
    var flowTemplateId: js.UndefOr[Urn]
    var status: js.UndefOr[FlowExecutionStatus]
    var systemInstanceId: js.UndefOr[Urn]
    var updatedAt: js.UndefOr[Timestamp]
  }

  /**
    * An object that contains a workflow's definition and summary information.
    */
  @js.native
  @Factory
  trait FlowTemplateDescription extends js.Object {
    var definition: js.UndefOr[DefinitionDocument]
    var summary: js.UndefOr[FlowTemplateSummary]
    var validatedNamespaceVersion: js.UndefOr[Version]
  }

  /**
    * An object that filters a workflow search.
    */
  @js.native
  @Factory
  trait FlowTemplateFilter extends js.Object {
    var name: FlowTemplateFilterName
    var value: FlowTemplateFilterValues
  }

  @js.native
  sealed trait FlowTemplateFilterName extends js.Any
  object FlowTemplateFilterName extends js.Object {
    val DEVICE_MODEL_ID = "DEVICE_MODEL_ID".asInstanceOf[FlowTemplateFilterName]

    val values = js.Object.freeze(js.Array(DEVICE_MODEL_ID))
  }

  /**
    * An object that contains summary information about a workflow.
    */
  @js.native
  @Factory
  trait FlowTemplateSummary extends js.Object {
    var arn: js.UndefOr[Arn]
    var createdAt: js.UndefOr[Timestamp]
    var id: js.UndefOr[Urn]
    var revisionNumber: js.UndefOr[Version]
  }

  @js.native
  @Factory
  trait GetEntitiesRequest extends js.Object {
    var ids: Urns
    var namespaceVersion: js.UndefOr[Version]
  }

  @js.native
  @Factory
  trait GetEntitiesResponse extends js.Object {
    var descriptions: js.UndefOr[EntityDescriptions]
  }

  @js.native
  @Factory
  trait GetFlowTemplateRequest extends js.Object {
    var id: Urn
    var revisionNumber: js.UndefOr[Version]
  }

  @js.native
  @Factory
  trait GetFlowTemplateResponse extends js.Object {
    var description: js.UndefOr[FlowTemplateDescription]
  }

  @js.native
  @Factory
  trait GetFlowTemplateRevisionsRequest extends js.Object {
    var id: Urn
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetFlowTemplateRevisionsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var summaries: js.UndefOr[FlowTemplateSummaries]
  }

  @js.native
  @Factory
  trait GetNamespaceDeletionStatusRequest extends js.Object {}

  @js.native
  @Factory
  trait GetNamespaceDeletionStatusResponse extends js.Object {
    var errorCode: js.UndefOr[NamespaceDeletionStatusErrorCodes]
    var errorMessage: js.UndefOr[String]
    var namespaceArn: js.UndefOr[Arn]
    var namespaceName: js.UndefOr[NamespaceName]
    var status: js.UndefOr[NamespaceDeletionStatus]
  }

  @js.native
  @Factory
  trait GetSystemInstanceRequest extends js.Object {
    var id: Urn
  }

  @js.native
  @Factory
  trait GetSystemInstanceResponse extends js.Object {
    var description: js.UndefOr[SystemInstanceDescription]
  }

  @js.native
  @Factory
  trait GetSystemTemplateRequest extends js.Object {
    var id: Urn
    var revisionNumber: js.UndefOr[Version]
  }

  @js.native
  @Factory
  trait GetSystemTemplateResponse extends js.Object {
    var description: js.UndefOr[SystemTemplateDescription]
  }

  @js.native
  @Factory
  trait GetSystemTemplateRevisionsRequest extends js.Object {
    var id: Urn
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetSystemTemplateRevisionsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var summaries: js.UndefOr[SystemTemplateSummaries]
  }

  @js.native
  @Factory
  trait GetUploadStatusRequest extends js.Object {
    var uploadId: UploadId
  }

  @js.native
  @Factory
  trait GetUploadStatusResponse extends js.Object {
    var createdDate: Timestamp
    var uploadId: UploadId
    var uploadStatus: UploadStatus
    var failureReason: js.UndefOr[StringList]
    var namespaceArn: js.UndefOr[Arn]
    var namespaceName: js.UndefOr[NamespaceName]
    var namespaceVersion: js.UndefOr[Version]
  }

  @js.native
  @Factory
  trait ListFlowExecutionMessagesRequest extends js.Object {
    var flowExecutionId: FlowExecutionId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListFlowExecutionMessagesResponse extends js.Object {
    var messages: js.UndefOr[FlowExecutionMessages]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var tags: js.UndefOr[TagList]
  }

  /**
    * An object that specifies whether cloud metrics are collected in a deployment and, if so, what role is used to collect metrics.
    */
  @js.native
  @Factory
  trait MetricsConfiguration extends js.Object {
    var cloudMetricEnabled: js.UndefOr[Enabled]
    var metricRuleRoleArn: js.UndefOr[RoleArn]
  }

  @js.native
  sealed trait NamespaceDeletionStatus extends js.Any
  object NamespaceDeletionStatus extends js.Object {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[NamespaceDeletionStatus]
    val SUCCEEDED   = "SUCCEEDED".asInstanceOf[NamespaceDeletionStatus]
    val FAILED      = "FAILED".asInstanceOf[NamespaceDeletionStatus]

    val values = js.Object.freeze(js.Array(IN_PROGRESS, SUCCEEDED, FAILED))
  }

  @js.native
  sealed trait NamespaceDeletionStatusErrorCodes extends js.Any
  object NamespaceDeletionStatusErrorCodes extends js.Object {
    val VALIDATION_FAILED = "VALIDATION_FAILED".asInstanceOf[NamespaceDeletionStatusErrorCodes]

    val values = js.Object.freeze(js.Array(VALIDATION_FAILED))
  }

  @js.native
  @Factory
  trait SearchEntitiesRequest extends js.Object {
    var entityTypes: EntityTypes
    var filters: js.UndefOr[EntityFilters]
    var maxResults: js.UndefOr[MaxResults]
    var namespaceVersion: js.UndefOr[Version]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait SearchEntitiesResponse extends js.Object {
    var descriptions: js.UndefOr[EntityDescriptions]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait SearchFlowExecutionsRequest extends js.Object {
    var systemInstanceId: Urn
    var endTime: js.UndefOr[Timestamp]
    var flowExecutionId: js.UndefOr[FlowExecutionId]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var startTime: js.UndefOr[Timestamp]
  }

  @js.native
  @Factory
  trait SearchFlowExecutionsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var summaries: js.UndefOr[FlowExecutionSummaries]
  }

  @js.native
  @Factory
  trait SearchFlowTemplatesRequest extends js.Object {
    var filters: js.UndefOr[FlowTemplateFilters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait SearchFlowTemplatesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var summaries: js.UndefOr[FlowTemplateSummaries]
  }

  @js.native
  @Factory
  trait SearchSystemInstancesRequest extends js.Object {
    var filters: js.UndefOr[SystemInstanceFilters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait SearchSystemInstancesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var summaries: js.UndefOr[SystemInstanceSummaries]
  }

  @js.native
  @Factory
  trait SearchSystemTemplatesRequest extends js.Object {
    var filters: js.UndefOr[SystemTemplateFilters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait SearchSystemTemplatesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var summaries: js.UndefOr[SystemTemplateSummaries]
  }

  @js.native
  @Factory
  trait SearchThingsRequest extends js.Object {
    var entityId: Urn
    var maxResults: js.UndefOr[MaxResults]
    var namespaceVersion: js.UndefOr[Version]
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait SearchThingsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var things: js.UndefOr[Things]
  }

  @js.native
  sealed trait SystemInstanceDeploymentStatus extends js.Any
  object SystemInstanceDeploymentStatus extends js.Object {
    val NOT_DEPLOYED         = "NOT_DEPLOYED".asInstanceOf[SystemInstanceDeploymentStatus]
    val BOOTSTRAP            = "BOOTSTRAP".asInstanceOf[SystemInstanceDeploymentStatus]
    val DEPLOY_IN_PROGRESS   = "DEPLOY_IN_PROGRESS".asInstanceOf[SystemInstanceDeploymentStatus]
    val DEPLOYED_IN_TARGET   = "DEPLOYED_IN_TARGET".asInstanceOf[SystemInstanceDeploymentStatus]
    val UNDEPLOY_IN_PROGRESS = "UNDEPLOY_IN_PROGRESS".asInstanceOf[SystemInstanceDeploymentStatus]
    val FAILED               = "FAILED".asInstanceOf[SystemInstanceDeploymentStatus]
    val PENDING_DELETE       = "PENDING_DELETE".asInstanceOf[SystemInstanceDeploymentStatus]
    val DELETED_IN_TARGET    = "DELETED_IN_TARGET".asInstanceOf[SystemInstanceDeploymentStatus]

    val values = js.Object.freeze(
      js.Array(
        NOT_DEPLOYED,
        BOOTSTRAP,
        DEPLOY_IN_PROGRESS,
        DEPLOYED_IN_TARGET,
        UNDEPLOY_IN_PROGRESS,
        FAILED,
        PENDING_DELETE,
        DELETED_IN_TARGET
      )
    )
  }

  /**
    * An object that contains a system instance definition and summary information.
    */
  @js.native
  @Factory
  trait SystemInstanceDescription extends js.Object {
    var definition: js.UndefOr[DefinitionDocument]
    var flowActionsRoleArn: js.UndefOr[RoleArn]
    var metricsConfiguration: js.UndefOr[MetricsConfiguration]
    var s3BucketName: js.UndefOr[S3BucketName]
    var summary: js.UndefOr[SystemInstanceSummary]
    var validatedDependencyRevisions: js.UndefOr[DependencyRevisions]
    var validatedNamespaceVersion: js.UndefOr[Version]
  }

  /**
    * An object that filters a system instance search. Multiple filters function as OR criteria in the search. For example a search that includes a GREENGRASS_GROUP_NAME and a STATUS filter searches for system instances in the specified Greengrass group that have the specified status.
    */
  @js.native
  @Factory
  trait SystemInstanceFilter extends js.Object {
    var name: js.UndefOr[SystemInstanceFilterName]
    var value: js.UndefOr[SystemInstanceFilterValues]
  }

  @js.native
  sealed trait SystemInstanceFilterName extends js.Any
  object SystemInstanceFilterName extends js.Object {
    val SYSTEM_TEMPLATE_ID    = "SYSTEM_TEMPLATE_ID".asInstanceOf[SystemInstanceFilterName]
    val STATUS                = "STATUS".asInstanceOf[SystemInstanceFilterName]
    val GREENGRASS_GROUP_NAME = "GREENGRASS_GROUP_NAME".asInstanceOf[SystemInstanceFilterName]

    val values = js.Object.freeze(js.Array(SYSTEM_TEMPLATE_ID, STATUS, GREENGRASS_GROUP_NAME))
  }

  /**
    * An object that contains summary information about a system instance.
    */
  @js.native
  @Factory
  trait SystemInstanceSummary extends js.Object {
    var arn: js.UndefOr[Arn]
    var createdAt: js.UndefOr[Timestamp]
    var greengrassGroupId: js.UndefOr[GreengrassGroupId]
    var greengrassGroupName: js.UndefOr[GroupName]
    var greengrassGroupVersionId: js.UndefOr[GreengrassGroupVersionId]
    var id: js.UndefOr[Urn]
    var status: js.UndefOr[SystemInstanceDeploymentStatus]
    var target: js.UndefOr[DeploymentTarget]
    var updatedAt: js.UndefOr[Timestamp]
  }

  /**
    * An object that contains a system's definition document and summary information.
    */
  @js.native
  @Factory
  trait SystemTemplateDescription extends js.Object {
    var definition: js.UndefOr[DefinitionDocument]
    var summary: js.UndefOr[SystemTemplateSummary]
    var validatedNamespaceVersion: js.UndefOr[Version]
  }

  /**
    * An object that filters a system search.
    */
  @js.native
  @Factory
  trait SystemTemplateFilter extends js.Object {
    var name: SystemTemplateFilterName
    var value: SystemTemplateFilterValues
  }

  @js.native
  sealed trait SystemTemplateFilterName extends js.Any
  object SystemTemplateFilterName extends js.Object {
    val FLOW_TEMPLATE_ID = "FLOW_TEMPLATE_ID".asInstanceOf[SystemTemplateFilterName]

    val values = js.Object.freeze(js.Array(FLOW_TEMPLATE_ID))
  }

  /**
    * An object that contains information about a system.
    */
  @js.native
  @Factory
  trait SystemTemplateSummary extends js.Object {
    var arn: js.UndefOr[Arn]
    var createdAt: js.UndefOr[Timestamp]
    var id: js.UndefOr[Urn]
    var revisionNumber: js.UndefOr[Version]
  }

  /**
    * Metadata assigned to an AWS IoT Things Graph resource consisting of a key-value pair.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var key: TagKey
    var value: TagValue
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tags: TagList
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  /**
    * An AWS IoT thing.
    */
  @js.native
  @Factory
  trait Thing extends js.Object {
    var thingArn: js.UndefOr[ThingArn]
    var thingName: js.UndefOr[ThingName]
  }

  @js.native
  @Factory
  trait UndeploySystemInstanceRequest extends js.Object {
    var id: js.UndefOr[Urn]
  }

  @js.native
  @Factory
  trait UndeploySystemInstanceResponse extends js.Object {
    var summary: js.UndefOr[SystemInstanceSummary]
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateFlowTemplateRequest extends js.Object {
    var definition: DefinitionDocument
    var id: Urn
    var compatibleNamespaceVersion: js.UndefOr[Version]
  }

  @js.native
  @Factory
  trait UpdateFlowTemplateResponse extends js.Object {
    var summary: js.UndefOr[FlowTemplateSummary]
  }

  @js.native
  @Factory
  trait UpdateSystemTemplateRequest extends js.Object {
    var definition: DefinitionDocument
    var id: Urn
    var compatibleNamespaceVersion: js.UndefOr[Version]
  }

  @js.native
  @Factory
  trait UpdateSystemTemplateResponse extends js.Object {
    var summary: js.UndefOr[SystemTemplateSummary]
  }

  @js.native
  @Factory
  trait UploadEntityDefinitionsRequest extends js.Object {
    var deprecateExistingEntities: js.UndefOr[DeprecateExistingEntities]
    var document: js.UndefOr[DefinitionDocument]
    var syncWithPublicNamespace: js.UndefOr[SyncWithPublicNamespace]
  }

  @js.native
  @Factory
  trait UploadEntityDefinitionsResponse extends js.Object {
    var uploadId: UploadId
  }

  @js.native
  sealed trait UploadStatus extends js.Any
  object UploadStatus extends js.Object {
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[UploadStatus]
    val SUCCEEDED   = "SUCCEEDED".asInstanceOf[UploadStatus]
    val FAILED      = "FAILED".asInstanceOf[UploadStatus]

    val values = js.Object.freeze(js.Array(IN_PROGRESS, SUCCEEDED, FAILED))
  }
}
