package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object iotthingsgraph {
  type Arn = String
  type DefinitionText = String
  type DependencyRevisions = js.Array[DependencyRevision]
  type DeprecateExistingEntities = Boolean
  type Enabled = Boolean
  type EntityDescriptions = js.Array[EntityDescription]
  type EntityFilterValue = String
  type EntityFilterValues = js.Array[EntityFilterValue]
  type EntityFilters = js.Array[EntityFilter]
  type EntityTypes = js.Array[EntityType]
  type FlowExecutionId = String
  type FlowExecutionMessageId = String
  type FlowExecutionMessagePayload = String
  type FlowExecutionMessages = js.Array[FlowExecutionMessage]
  type FlowExecutionSummaries = js.Array[FlowExecutionSummary]
  type FlowTemplateFilterValue = String
  type FlowTemplateFilterValues = js.Array[FlowTemplateFilterValue]
  type FlowTemplateFilters = js.Array[FlowTemplateFilter]
  type FlowTemplateSummaries = js.Array[FlowTemplateSummary]
  type GreengrassDeploymentId = String
  type GreengrassGroupId = String
  type GreengrassGroupVersionId = String
  type GroupName = String
  type MaxResults = Int
  type NamespaceName = String
  type NextToken = String
  type ResourceArn = String
  type RoleArn = String
  type S3BucketName = String
  type StringList = js.Array[String]
  type SyncWithPublicNamespace = Boolean
  type SystemInstanceFilterValue = String
  type SystemInstanceFilterValues = js.Array[SystemInstanceFilterValue]
  type SystemInstanceFilters = js.Array[SystemInstanceFilter]
  type SystemInstanceSummaries = js.Array[SystemInstanceSummary]
  type SystemTemplateFilterValue = String
  type SystemTemplateFilterValues = js.Array[SystemTemplateFilterValue]
  type SystemTemplateFilters = js.Array[SystemTemplateFilter]
  type SystemTemplateSummaries = js.Array[SystemTemplateSummary]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type ThingArn = String
  type ThingName = String
  type Things = js.Array[Thing]
  type Timestamp = js.Date
  type UploadId = String
  type Urn = String
  type Urns = js.Array[Urn]
  type Version = Double

  final class IoTThingsGraphOps(private val service: IoTThingsGraph) extends AnyVal {}

  @js.native
  @JSImport("aws-sdk/clients/iotthingsgraph", JSImport.Namespace, "AWS.IoTThingsGraph")
  class IoTThingsGraph() extends js.Object {
    def this(config: AWSConfig) = this()

    @deprecated("since: 2022-08-30", "forever") def associateEntityToThing(params: AssociateEntityToThingRequest): Request[AssociateEntityToThingResponse] = js.native
    @deprecated("since: 2022-08-30", "forever") def createFlowTemplate(params: CreateFlowTemplateRequest): Request[CreateFlowTemplateResponse] = js.native
    @deprecated("since: 2022-08-30", "forever") def createSystemInstance(params: CreateSystemInstanceRequest): Request[CreateSystemInstanceResponse] = js.native
    @deprecated("since: 2022-08-30", "forever") def createSystemTemplate(params: CreateSystemTemplateRequest): Request[CreateSystemTemplateResponse] = js.native
    @deprecated("since: 2022-08-30", "forever") def deleteFlowTemplate(params: DeleteFlowTemplateRequest): Request[DeleteFlowTemplateResponse] = js.native
    @deprecated("since: 2022-08-30", "forever") def deleteNamespace(params: DeleteNamespaceRequest): Request[DeleteNamespaceResponse] = js.native
    @deprecated("since: 2022-08-30", "forever") def deleteSystemInstance(params: DeleteSystemInstanceRequest): Request[DeleteSystemInstanceResponse] = js.native
    @deprecated("since: 2022-08-30", "forever") def deleteSystemTemplate(params: DeleteSystemTemplateRequest): Request[DeleteSystemTemplateResponse] = js.native
    @deprecated("since: 2022-08-30", "forever") def deploySystemInstance(params: DeploySystemInstanceRequest): Request[DeploySystemInstanceResponse] = js.native
    @deprecated("since: 2022-08-30", "forever") def deprecateFlowTemplate(params: DeprecateFlowTemplateRequest): Request[DeprecateFlowTemplateResponse] = js.native
    @deprecated("since: 2022-08-30", "forever") def deprecateSystemTemplate(params: DeprecateSystemTemplateRequest): Request[DeprecateSystemTemplateResponse] = js.native
    @deprecated("since: 2022-08-30", "forever") def describeNamespace(params: DescribeNamespaceRequest): Request[DescribeNamespaceResponse] = js.native
    @deprecated("since: 2022-08-30", "forever") def dissociateEntityFromThing(params: DissociateEntityFromThingRequest): Request[DissociateEntityFromThingResponse] = js.native
    @deprecated("since: 2022-08-30", "forever") def getEntities(params: GetEntitiesRequest): Request[GetEntitiesResponse] = js.native
    @deprecated("since: 2022-08-30", "forever") def getFlowTemplate(params: GetFlowTemplateRequest): Request[GetFlowTemplateResponse] = js.native
    @deprecated("since: 2022-08-30", "forever") def getFlowTemplateRevisions(params: GetFlowTemplateRevisionsRequest): Request[GetFlowTemplateRevisionsResponse] = js.native
    @deprecated("since: 2022-08-30", "forever") def getNamespaceDeletionStatus(params: GetNamespaceDeletionStatusRequest): Request[GetNamespaceDeletionStatusResponse] = js.native
    @deprecated("since: 2022-08-30", "forever") def getSystemInstance(params: GetSystemInstanceRequest): Request[GetSystemInstanceResponse] = js.native
    @deprecated("since: 2022-08-30", "forever") def getSystemTemplate(params: GetSystemTemplateRequest): Request[GetSystemTemplateResponse] = js.native
    @deprecated("since: 2022-08-30", "forever") def getSystemTemplateRevisions(params: GetSystemTemplateRevisionsRequest): Request[GetSystemTemplateRevisionsResponse] = js.native
    @deprecated("since: 2022-08-30", "forever") def getUploadStatus(params: GetUploadStatusRequest): Request[GetUploadStatusResponse] = js.native
    @deprecated("since: 2022-08-30", "forever") def listFlowExecutionMessages(params: ListFlowExecutionMessagesRequest): Request[ListFlowExecutionMessagesResponse] = js.native
    @deprecated("since: 2022-08-30", "forever") def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    @deprecated("since: 2022-08-30", "forever") def searchEntities(params: SearchEntitiesRequest): Request[SearchEntitiesResponse] = js.native
    @deprecated("since: 2022-08-30", "forever") def searchFlowExecutions(params: SearchFlowExecutionsRequest): Request[SearchFlowExecutionsResponse] = js.native
    @deprecated("since: 2022-08-30", "forever") def searchFlowTemplates(params: SearchFlowTemplatesRequest): Request[SearchFlowTemplatesResponse] = js.native
    @deprecated("since: 2022-08-30", "forever") def searchSystemInstances(params: SearchSystemInstancesRequest): Request[SearchSystemInstancesResponse] = js.native
    @deprecated("since: 2022-08-30", "forever") def searchSystemTemplates(params: SearchSystemTemplatesRequest): Request[SearchSystemTemplatesResponse] = js.native
    @deprecated("since: 2022-08-30", "forever") def searchThings(params: SearchThingsRequest): Request[SearchThingsResponse] = js.native
    @deprecated("since: 2022-08-30", "forever") def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    @deprecated("since: 2022-08-30", "forever") def undeploySystemInstance(params: UndeploySystemInstanceRequest): Request[UndeploySystemInstanceResponse] = js.native
    @deprecated("since: 2022-08-30", "forever") def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    @deprecated("since: 2022-08-30", "forever") def updateFlowTemplate(params: UpdateFlowTemplateRequest): Request[UpdateFlowTemplateResponse] = js.native
    @deprecated("since: 2022-08-30", "forever") def updateSystemTemplate(params: UpdateSystemTemplateRequest): Request[UpdateSystemTemplateResponse] = js.native
    @deprecated("since: 2022-08-30", "forever") def uploadEntityDefinitions(params: UploadEntityDefinitionsRequest): Request[UploadEntityDefinitionsResponse] = js.native
  }
  object IoTThingsGraph {
    @inline implicit def toOps(service: IoTThingsGraph): IoTThingsGraphOps = {
      new IoTThingsGraphOps(service)
    }
  }

  @js.native
  trait AssociateEntityToThingRequest extends js.Object {
    var entityId: Urn
    var thingName: ThingName
    var namespaceVersion: js.UndefOr[Version]
  }

  object AssociateEntityToThingRequest {
    @inline
    def apply(
        entityId: Urn,
        thingName: ThingName,
        namespaceVersion: js.UndefOr[Version] = js.undefined
    ): AssociateEntityToThingRequest = {
      val __obj = js.Dynamic.literal(
        "entityId" -> entityId.asInstanceOf[js.Any],
        "thingName" -> thingName.asInstanceOf[js.Any]
      )

      namespaceVersion.foreach(__v => __obj.updateDynamic("namespaceVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateEntityToThingRequest]
    }
  }

  @js.native
  trait AssociateEntityToThingResponse extends js.Object

  object AssociateEntityToThingResponse {
    @inline
    def apply(): AssociateEntityToThingResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssociateEntityToThingResponse]
    }
  }

  @js.native
  trait CreateFlowTemplateRequest extends js.Object {
    var definition: DefinitionDocument
    var compatibleNamespaceVersion: js.UndefOr[Version]
  }

  object CreateFlowTemplateRequest {
    @inline
    def apply(
        definition: DefinitionDocument,
        compatibleNamespaceVersion: js.UndefOr[Version] = js.undefined
    ): CreateFlowTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "definition" -> definition.asInstanceOf[js.Any]
      )

      compatibleNamespaceVersion.foreach(__v => __obj.updateDynamic("compatibleNamespaceVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFlowTemplateRequest]
    }
  }

  @js.native
  trait CreateFlowTemplateResponse extends js.Object {
    var summary: js.UndefOr[FlowTemplateSummary]
  }

  object CreateFlowTemplateResponse {
    @inline
    def apply(
        summary: js.UndefOr[FlowTemplateSummary] = js.undefined
    ): CreateFlowTemplateResponse = {
      val __obj = js.Dynamic.literal()
      summary.foreach(__v => __obj.updateDynamic("summary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFlowTemplateResponse]
    }
  }

  @js.native
  trait CreateSystemInstanceRequest extends js.Object {
    var definition: DefinitionDocument
    var target: DeploymentTarget
    var flowActionsRoleArn: js.UndefOr[RoleArn]
    var greengrassGroupName: js.UndefOr[GroupName]
    var metricsConfiguration: js.UndefOr[MetricsConfiguration]
    var s3BucketName: js.UndefOr[S3BucketName]
    var tags: js.UndefOr[TagList]
  }

  object CreateSystemInstanceRequest {
    @inline
    def apply(
        definition: DefinitionDocument,
        target: DeploymentTarget,
        flowActionsRoleArn: js.UndefOr[RoleArn] = js.undefined,
        greengrassGroupName: js.UndefOr[GroupName] = js.undefined,
        metricsConfiguration: js.UndefOr[MetricsConfiguration] = js.undefined,
        s3BucketName: js.UndefOr[S3BucketName] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateSystemInstanceRequest = {
      val __obj = js.Dynamic.literal(
        "definition" -> definition.asInstanceOf[js.Any],
        "target" -> target.asInstanceOf[js.Any]
      )

      flowActionsRoleArn.foreach(__v => __obj.updateDynamic("flowActionsRoleArn")(__v.asInstanceOf[js.Any]))
      greengrassGroupName.foreach(__v => __obj.updateDynamic("greengrassGroupName")(__v.asInstanceOf[js.Any]))
      metricsConfiguration.foreach(__v => __obj.updateDynamic("metricsConfiguration")(__v.asInstanceOf[js.Any]))
      s3BucketName.foreach(__v => __obj.updateDynamic("s3BucketName")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSystemInstanceRequest]
    }
  }

  @js.native
  trait CreateSystemInstanceResponse extends js.Object {
    var summary: js.UndefOr[SystemInstanceSummary]
  }

  object CreateSystemInstanceResponse {
    @inline
    def apply(
        summary: js.UndefOr[SystemInstanceSummary] = js.undefined
    ): CreateSystemInstanceResponse = {
      val __obj = js.Dynamic.literal()
      summary.foreach(__v => __obj.updateDynamic("summary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSystemInstanceResponse]
    }
  }

  @js.native
  trait CreateSystemTemplateRequest extends js.Object {
    var definition: DefinitionDocument
    var compatibleNamespaceVersion: js.UndefOr[Version]
  }

  object CreateSystemTemplateRequest {
    @inline
    def apply(
        definition: DefinitionDocument,
        compatibleNamespaceVersion: js.UndefOr[Version] = js.undefined
    ): CreateSystemTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "definition" -> definition.asInstanceOf[js.Any]
      )

      compatibleNamespaceVersion.foreach(__v => __obj.updateDynamic("compatibleNamespaceVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSystemTemplateRequest]
    }
  }

  @js.native
  trait CreateSystemTemplateResponse extends js.Object {
    var summary: js.UndefOr[SystemTemplateSummary]
  }

  object CreateSystemTemplateResponse {
    @inline
    def apply(
        summary: js.UndefOr[SystemTemplateSummary] = js.undefined
    ): CreateSystemTemplateResponse = {
      val __obj = js.Dynamic.literal()
      summary.foreach(__v => __obj.updateDynamic("summary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSystemTemplateResponse]
    }
  }

  /** A document that defines an entity.
    */
  @js.native
  trait DefinitionDocument extends js.Object {
    var language: DefinitionLanguage
    var text: DefinitionText
  }

  object DefinitionDocument {
    @inline
    def apply(
        language: DefinitionLanguage,
        text: DefinitionText
    ): DefinitionDocument = {
      val __obj = js.Dynamic.literal(
        "language" -> language.asInstanceOf[js.Any],
        "text" -> text.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DefinitionDocument]
    }
  }

  @js.native
  trait DeleteFlowTemplateRequest extends js.Object {
    var id: Urn
  }

  object DeleteFlowTemplateRequest {
    @inline
    def apply(
        id: Urn
    ): DeleteFlowTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteFlowTemplateRequest]
    }
  }

  @js.native
  trait DeleteFlowTemplateResponse extends js.Object

  object DeleteFlowTemplateResponse {
    @inline
    def apply(): DeleteFlowTemplateResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteFlowTemplateResponse]
    }
  }

  @js.native
  trait DeleteNamespaceRequest extends js.Object

  object DeleteNamespaceRequest {
    @inline
    def apply(): DeleteNamespaceRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteNamespaceRequest]
    }
  }

  @js.native
  trait DeleteNamespaceResponse extends js.Object {
    var namespaceArn: js.UndefOr[Arn]
    var namespaceName: js.UndefOr[NamespaceName]
  }

  object DeleteNamespaceResponse {
    @inline
    def apply(
        namespaceArn: js.UndefOr[Arn] = js.undefined,
        namespaceName: js.UndefOr[NamespaceName] = js.undefined
    ): DeleteNamespaceResponse = {
      val __obj = js.Dynamic.literal()
      namespaceArn.foreach(__v => __obj.updateDynamic("namespaceArn")(__v.asInstanceOf[js.Any]))
      namespaceName.foreach(__v => __obj.updateDynamic("namespaceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteNamespaceResponse]
    }
  }

  @js.native
  trait DeleteSystemInstanceRequest extends js.Object {
    var id: js.UndefOr[Urn]
  }

  object DeleteSystemInstanceRequest {
    @inline
    def apply(
        id: js.UndefOr[Urn] = js.undefined
    ): DeleteSystemInstanceRequest = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSystemInstanceRequest]
    }
  }

  @js.native
  trait DeleteSystemInstanceResponse extends js.Object

  object DeleteSystemInstanceResponse {
    @inline
    def apply(): DeleteSystemInstanceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteSystemInstanceResponse]
    }
  }

  @js.native
  trait DeleteSystemTemplateRequest extends js.Object {
    var id: Urn
  }

  object DeleteSystemTemplateRequest {
    @inline
    def apply(
        id: Urn
    ): DeleteSystemTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSystemTemplateRequest]
    }
  }

  @js.native
  trait DeleteSystemTemplateResponse extends js.Object

  object DeleteSystemTemplateResponse {
    @inline
    def apply(): DeleteSystemTemplateResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteSystemTemplateResponse]
    }
  }

  /** An object that contains the ID and revision number of a workflow or system that is part of a deployment.
    */
  @js.native
  trait DependencyRevision extends js.Object {
    var id: js.UndefOr[Urn]
    var revisionNumber: js.UndefOr[Version]
  }

  object DependencyRevision {
    @inline
    def apply(
        id: js.UndefOr[Urn] = js.undefined,
        revisionNumber: js.UndefOr[Version] = js.undefined
    ): DependencyRevision = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      revisionNumber.foreach(__v => __obj.updateDynamic("revisionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DependencyRevision]
    }
  }

  @js.native
  trait DeploySystemInstanceRequest extends js.Object {
    var id: js.UndefOr[Urn]
  }

  object DeploySystemInstanceRequest {
    @inline
    def apply(
        id: js.UndefOr[Urn] = js.undefined
    ): DeploySystemInstanceRequest = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeploySystemInstanceRequest]
    }
  }

  @js.native
  trait DeploySystemInstanceResponse extends js.Object {
    var summary: SystemInstanceSummary
    var greengrassDeploymentId: js.UndefOr[GreengrassDeploymentId]
  }

  object DeploySystemInstanceResponse {
    @inline
    def apply(
        summary: SystemInstanceSummary,
        greengrassDeploymentId: js.UndefOr[GreengrassDeploymentId] = js.undefined
    ): DeploySystemInstanceResponse = {
      val __obj = js.Dynamic.literal(
        "summary" -> summary.asInstanceOf[js.Any]
      )

      greengrassDeploymentId.foreach(__v => __obj.updateDynamic("greengrassDeploymentId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeploySystemInstanceResponse]
    }
  }

  @js.native
  trait DeprecateFlowTemplateRequest extends js.Object {
    var id: Urn
  }

  object DeprecateFlowTemplateRequest {
    @inline
    def apply(
        id: Urn
    ): DeprecateFlowTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeprecateFlowTemplateRequest]
    }
  }

  @js.native
  trait DeprecateFlowTemplateResponse extends js.Object

  object DeprecateFlowTemplateResponse {
    @inline
    def apply(): DeprecateFlowTemplateResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeprecateFlowTemplateResponse]
    }
  }

  @js.native
  trait DeprecateSystemTemplateRequest extends js.Object {
    var id: Urn
  }

  object DeprecateSystemTemplateRequest {
    @inline
    def apply(
        id: Urn
    ): DeprecateSystemTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeprecateSystemTemplateRequest]
    }
  }

  @js.native
  trait DeprecateSystemTemplateResponse extends js.Object

  object DeprecateSystemTemplateResponse {
    @inline
    def apply(): DeprecateSystemTemplateResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeprecateSystemTemplateResponse]
    }
  }

  @js.native
  trait DescribeNamespaceRequest extends js.Object {
    var namespaceName: js.UndefOr[NamespaceName]
  }

  object DescribeNamespaceRequest {
    @inline
    def apply(
        namespaceName: js.UndefOr[NamespaceName] = js.undefined
    ): DescribeNamespaceRequest = {
      val __obj = js.Dynamic.literal()
      namespaceName.foreach(__v => __obj.updateDynamic("namespaceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeNamespaceRequest]
    }
  }

  @js.native
  trait DescribeNamespaceResponse extends js.Object {
    var namespaceArn: js.UndefOr[Arn]
    var namespaceName: js.UndefOr[NamespaceName]
    var namespaceVersion: js.UndefOr[Version]
    var trackingNamespaceName: js.UndefOr[NamespaceName]
    var trackingNamespaceVersion: js.UndefOr[Version]
  }

  object DescribeNamespaceResponse {
    @inline
    def apply(
        namespaceArn: js.UndefOr[Arn] = js.undefined,
        namespaceName: js.UndefOr[NamespaceName] = js.undefined,
        namespaceVersion: js.UndefOr[Version] = js.undefined,
        trackingNamespaceName: js.UndefOr[NamespaceName] = js.undefined,
        trackingNamespaceVersion: js.UndefOr[Version] = js.undefined
    ): DescribeNamespaceResponse = {
      val __obj = js.Dynamic.literal()
      namespaceArn.foreach(__v => __obj.updateDynamic("namespaceArn")(__v.asInstanceOf[js.Any]))
      namespaceName.foreach(__v => __obj.updateDynamic("namespaceName")(__v.asInstanceOf[js.Any]))
      namespaceVersion.foreach(__v => __obj.updateDynamic("namespaceVersion")(__v.asInstanceOf[js.Any]))
      trackingNamespaceName.foreach(__v => __obj.updateDynamic("trackingNamespaceName")(__v.asInstanceOf[js.Any]))
      trackingNamespaceVersion.foreach(__v => __obj.updateDynamic("trackingNamespaceVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeNamespaceResponse]
    }
  }

  @js.native
  trait DissociateEntityFromThingRequest extends js.Object {
    var entityType: EntityType
    var thingName: ThingName
  }

  object DissociateEntityFromThingRequest {
    @inline
    def apply(
        entityType: EntityType,
        thingName: ThingName
    ): DissociateEntityFromThingRequest = {
      val __obj = js.Dynamic.literal(
        "entityType" -> entityType.asInstanceOf[js.Any],
        "thingName" -> thingName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DissociateEntityFromThingRequest]
    }
  }

  @js.native
  trait DissociateEntityFromThingResponse extends js.Object

  object DissociateEntityFromThingResponse {
    @inline
    def apply(): DissociateEntityFromThingResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DissociateEntityFromThingResponse]
    }
  }

  /** Describes the properties of an entity.
    */
  @js.native
  trait EntityDescription extends js.Object {
    var arn: js.UndefOr[Arn]
    var createdAt: js.UndefOr[Timestamp]
    var definition: js.UndefOr[DefinitionDocument]
    var id: js.UndefOr[Urn]
    var `type`: js.UndefOr[EntityType]
  }

  object EntityDescription {
    @inline
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        definition: js.UndefOr[DefinitionDocument] = js.undefined,
        id: js.UndefOr[Urn] = js.undefined,
        `type`: js.UndefOr[EntityType] = js.undefined
    ): EntityDescription = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      definition.foreach(__v => __obj.updateDynamic("definition")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EntityDescription]
    }
  }

  /** An object that filters an entity search. Multiple filters function as OR criteria in the search. For example a search that includes a <code>NAMESPACE</code> and a <code>REFERENCED_ENTITY_ID</code> filter searches for entities in the specified namespace that use the entity specified by the value of <code>REFERENCED_ENTITY_ID</code>.
    */
  @js.native
  trait EntityFilter extends js.Object {
    var name: js.UndefOr[EntityFilterName]
    var value: js.UndefOr[EntityFilterValues]
  }

  object EntityFilter {
    @inline
    def apply(
        name: js.UndefOr[EntityFilterName] = js.undefined,
        value: js.UndefOr[EntityFilterValues] = js.undefined
    ): EntityFilter = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EntityFilter]
    }
  }

  /** An object that contains information about a flow event.
    */
  @js.native
  trait FlowExecutionMessage extends js.Object {
    var eventType: js.UndefOr[FlowExecutionEventType]
    var messageId: js.UndefOr[FlowExecutionMessageId]
    var payload: js.UndefOr[FlowExecutionMessagePayload]
    var timestamp: js.UndefOr[Timestamp]
  }

  object FlowExecutionMessage {
    @inline
    def apply(
        eventType: js.UndefOr[FlowExecutionEventType] = js.undefined,
        messageId: js.UndefOr[FlowExecutionMessageId] = js.undefined,
        payload: js.UndefOr[FlowExecutionMessagePayload] = js.undefined,
        timestamp: js.UndefOr[Timestamp] = js.undefined
    ): FlowExecutionMessage = {
      val __obj = js.Dynamic.literal()
      eventType.foreach(__v => __obj.updateDynamic("eventType")(__v.asInstanceOf[js.Any]))
      messageId.foreach(__v => __obj.updateDynamic("messageId")(__v.asInstanceOf[js.Any]))
      payload.foreach(__v => __obj.updateDynamic("payload")(__v.asInstanceOf[js.Any]))
      timestamp.foreach(__v => __obj.updateDynamic("timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FlowExecutionMessage]
    }
  }

  /** An object that contains summary information about a flow execution.
    */
  @js.native
  trait FlowExecutionSummary extends js.Object {
    var createdAt: js.UndefOr[Timestamp]
    var flowExecutionId: js.UndefOr[FlowExecutionId]
    var flowTemplateId: js.UndefOr[Urn]
    var status: js.UndefOr[FlowExecutionStatus]
    var systemInstanceId: js.UndefOr[Urn]
    var updatedAt: js.UndefOr[Timestamp]
  }

  object FlowExecutionSummary {
    @inline
    def apply(
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        flowExecutionId: js.UndefOr[FlowExecutionId] = js.undefined,
        flowTemplateId: js.UndefOr[Urn] = js.undefined,
        status: js.UndefOr[FlowExecutionStatus] = js.undefined,
        systemInstanceId: js.UndefOr[Urn] = js.undefined,
        updatedAt: js.UndefOr[Timestamp] = js.undefined
    ): FlowExecutionSummary = {
      val __obj = js.Dynamic.literal()
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      flowExecutionId.foreach(__v => __obj.updateDynamic("flowExecutionId")(__v.asInstanceOf[js.Any]))
      flowTemplateId.foreach(__v => __obj.updateDynamic("flowTemplateId")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      systemInstanceId.foreach(__v => __obj.updateDynamic("systemInstanceId")(__v.asInstanceOf[js.Any]))
      updatedAt.foreach(__v => __obj.updateDynamic("updatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FlowExecutionSummary]
    }
  }

  /** An object that contains a workflow's definition and summary information.
    */
  @js.native
  trait FlowTemplateDescription extends js.Object {
    var definition: js.UndefOr[DefinitionDocument]
    var summary: js.UndefOr[FlowTemplateSummary]
    var validatedNamespaceVersion: js.UndefOr[Version]
  }

  object FlowTemplateDescription {
    @inline
    def apply(
        definition: js.UndefOr[DefinitionDocument] = js.undefined,
        summary: js.UndefOr[FlowTemplateSummary] = js.undefined,
        validatedNamespaceVersion: js.UndefOr[Version] = js.undefined
    ): FlowTemplateDescription = {
      val __obj = js.Dynamic.literal()
      definition.foreach(__v => __obj.updateDynamic("definition")(__v.asInstanceOf[js.Any]))
      summary.foreach(__v => __obj.updateDynamic("summary")(__v.asInstanceOf[js.Any]))
      validatedNamespaceVersion.foreach(__v => __obj.updateDynamic("validatedNamespaceVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FlowTemplateDescription]
    }
  }

  /** An object that filters a workflow search.
    */
  @js.native
  trait FlowTemplateFilter extends js.Object {
    var name: FlowTemplateFilterName
    var value: FlowTemplateFilterValues
  }

  object FlowTemplateFilter {
    @inline
    def apply(
        name: FlowTemplateFilterName,
        value: FlowTemplateFilterValues
    ): FlowTemplateFilter = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FlowTemplateFilter]
    }
  }

  /** An object that contains summary information about a workflow.
    */
  @js.native
  trait FlowTemplateSummary extends js.Object {
    var arn: js.UndefOr[Arn]
    var createdAt: js.UndefOr[Timestamp]
    var id: js.UndefOr[Urn]
    var revisionNumber: js.UndefOr[Version]
  }

  object FlowTemplateSummary {
    @inline
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        id: js.UndefOr[Urn] = js.undefined,
        revisionNumber: js.UndefOr[Version] = js.undefined
    ): FlowTemplateSummary = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      revisionNumber.foreach(__v => __obj.updateDynamic("revisionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FlowTemplateSummary]
    }
  }

  @js.native
  trait GetEntitiesRequest extends js.Object {
    var ids: Urns
    var namespaceVersion: js.UndefOr[Version]
  }

  object GetEntitiesRequest {
    @inline
    def apply(
        ids: Urns,
        namespaceVersion: js.UndefOr[Version] = js.undefined
    ): GetEntitiesRequest = {
      val __obj = js.Dynamic.literal(
        "ids" -> ids.asInstanceOf[js.Any]
      )

      namespaceVersion.foreach(__v => __obj.updateDynamic("namespaceVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEntitiesRequest]
    }
  }

  @js.native
  trait GetEntitiesResponse extends js.Object {
    var descriptions: js.UndefOr[EntityDescriptions]
  }

  object GetEntitiesResponse {
    @inline
    def apply(
        descriptions: js.UndefOr[EntityDescriptions] = js.undefined
    ): GetEntitiesResponse = {
      val __obj = js.Dynamic.literal()
      descriptions.foreach(__v => __obj.updateDynamic("descriptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEntitiesResponse]
    }
  }

  @js.native
  trait GetFlowTemplateRequest extends js.Object {
    var id: Urn
    var revisionNumber: js.UndefOr[Version]
  }

  object GetFlowTemplateRequest {
    @inline
    def apply(
        id: Urn,
        revisionNumber: js.UndefOr[Version] = js.undefined
    ): GetFlowTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )

      revisionNumber.foreach(__v => __obj.updateDynamic("revisionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFlowTemplateRequest]
    }
  }

  @js.native
  trait GetFlowTemplateResponse extends js.Object {
    var description: js.UndefOr[FlowTemplateDescription]
  }

  object GetFlowTemplateResponse {
    @inline
    def apply(
        description: js.UndefOr[FlowTemplateDescription] = js.undefined
    ): GetFlowTemplateResponse = {
      val __obj = js.Dynamic.literal()
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFlowTemplateResponse]
    }
  }

  @js.native
  trait GetFlowTemplateRevisionsRequest extends js.Object {
    var id: Urn
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetFlowTemplateRevisionsRequest {
    @inline
    def apply(
        id: Urn,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetFlowTemplateRevisionsRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFlowTemplateRevisionsRequest]
    }
  }

  @js.native
  trait GetFlowTemplateRevisionsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var summaries: js.UndefOr[FlowTemplateSummaries]
  }

  object GetFlowTemplateRevisionsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        summaries: js.UndefOr[FlowTemplateSummaries] = js.undefined
    ): GetFlowTemplateRevisionsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      summaries.foreach(__v => __obj.updateDynamic("summaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFlowTemplateRevisionsResponse]
    }
  }

  @js.native
  trait GetNamespaceDeletionStatusRequest extends js.Object

  object GetNamespaceDeletionStatusRequest {
    @inline
    def apply(): GetNamespaceDeletionStatusRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetNamespaceDeletionStatusRequest]
    }
  }

  @js.native
  trait GetNamespaceDeletionStatusResponse extends js.Object {
    var errorCode: js.UndefOr[NamespaceDeletionStatusErrorCodes]
    var errorMessage: js.UndefOr[String]
    var namespaceArn: js.UndefOr[Arn]
    var namespaceName: js.UndefOr[NamespaceName]
    var status: js.UndefOr[NamespaceDeletionStatus]
  }

  object GetNamespaceDeletionStatusResponse {
    @inline
    def apply(
        errorCode: js.UndefOr[NamespaceDeletionStatusErrorCodes] = js.undefined,
        errorMessage: js.UndefOr[String] = js.undefined,
        namespaceArn: js.UndefOr[Arn] = js.undefined,
        namespaceName: js.UndefOr[NamespaceName] = js.undefined,
        status: js.UndefOr[NamespaceDeletionStatus] = js.undefined
    ): GetNamespaceDeletionStatusResponse = {
      val __obj = js.Dynamic.literal()
      errorCode.foreach(__v => __obj.updateDynamic("errorCode")(__v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      namespaceArn.foreach(__v => __obj.updateDynamic("namespaceArn")(__v.asInstanceOf[js.Any]))
      namespaceName.foreach(__v => __obj.updateDynamic("namespaceName")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetNamespaceDeletionStatusResponse]
    }
  }

  @js.native
  trait GetSystemInstanceRequest extends js.Object {
    var id: Urn
  }

  object GetSystemInstanceRequest {
    @inline
    def apply(
        id: Urn
    ): GetSystemInstanceRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSystemInstanceRequest]
    }
  }

  @js.native
  trait GetSystemInstanceResponse extends js.Object {
    var description: js.UndefOr[SystemInstanceDescription]
  }

  object GetSystemInstanceResponse {
    @inline
    def apply(
        description: js.UndefOr[SystemInstanceDescription] = js.undefined
    ): GetSystemInstanceResponse = {
      val __obj = js.Dynamic.literal()
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSystemInstanceResponse]
    }
  }

  @js.native
  trait GetSystemTemplateRequest extends js.Object {
    var id: Urn
    var revisionNumber: js.UndefOr[Version]
  }

  object GetSystemTemplateRequest {
    @inline
    def apply(
        id: Urn,
        revisionNumber: js.UndefOr[Version] = js.undefined
    ): GetSystemTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )

      revisionNumber.foreach(__v => __obj.updateDynamic("revisionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSystemTemplateRequest]
    }
  }

  @js.native
  trait GetSystemTemplateResponse extends js.Object {
    var description: js.UndefOr[SystemTemplateDescription]
  }

  object GetSystemTemplateResponse {
    @inline
    def apply(
        description: js.UndefOr[SystemTemplateDescription] = js.undefined
    ): GetSystemTemplateResponse = {
      val __obj = js.Dynamic.literal()
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSystemTemplateResponse]
    }
  }

  @js.native
  trait GetSystemTemplateRevisionsRequest extends js.Object {
    var id: Urn
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetSystemTemplateRevisionsRequest {
    @inline
    def apply(
        id: Urn,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetSystemTemplateRevisionsRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSystemTemplateRevisionsRequest]
    }
  }

  @js.native
  trait GetSystemTemplateRevisionsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var summaries: js.UndefOr[SystemTemplateSummaries]
  }

  object GetSystemTemplateRevisionsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        summaries: js.UndefOr[SystemTemplateSummaries] = js.undefined
    ): GetSystemTemplateRevisionsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      summaries.foreach(__v => __obj.updateDynamic("summaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSystemTemplateRevisionsResponse]
    }
  }

  @js.native
  trait GetUploadStatusRequest extends js.Object {
    var uploadId: UploadId
  }

  object GetUploadStatusRequest {
    @inline
    def apply(
        uploadId: UploadId
    ): GetUploadStatusRequest = {
      val __obj = js.Dynamic.literal(
        "uploadId" -> uploadId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetUploadStatusRequest]
    }
  }

  @js.native
  trait GetUploadStatusResponse extends js.Object {
    var createdDate: Timestamp
    var uploadId: UploadId
    var uploadStatus: UploadStatus
    var failureReason: js.UndefOr[StringList]
    var namespaceArn: js.UndefOr[Arn]
    var namespaceName: js.UndefOr[NamespaceName]
    var namespaceVersion: js.UndefOr[Version]
  }

  object GetUploadStatusResponse {
    @inline
    def apply(
        createdDate: Timestamp,
        uploadId: UploadId,
        uploadStatus: UploadStatus,
        failureReason: js.UndefOr[StringList] = js.undefined,
        namespaceArn: js.UndefOr[Arn] = js.undefined,
        namespaceName: js.UndefOr[NamespaceName] = js.undefined,
        namespaceVersion: js.UndefOr[Version] = js.undefined
    ): GetUploadStatusResponse = {
      val __obj = js.Dynamic.literal(
        "createdDate" -> createdDate.asInstanceOf[js.Any],
        "uploadId" -> uploadId.asInstanceOf[js.Any],
        "uploadStatus" -> uploadStatus.asInstanceOf[js.Any]
      )

      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      namespaceArn.foreach(__v => __obj.updateDynamic("namespaceArn")(__v.asInstanceOf[js.Any]))
      namespaceName.foreach(__v => __obj.updateDynamic("namespaceName")(__v.asInstanceOf[js.Any]))
      namespaceVersion.foreach(__v => __obj.updateDynamic("namespaceVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUploadStatusResponse]
    }
  }

  @js.native
  trait ListFlowExecutionMessagesRequest extends js.Object {
    var flowExecutionId: FlowExecutionId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListFlowExecutionMessagesRequest {
    @inline
    def apply(
        flowExecutionId: FlowExecutionId,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFlowExecutionMessagesRequest = {
      val __obj = js.Dynamic.literal(
        "flowExecutionId" -> flowExecutionId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFlowExecutionMessagesRequest]
    }
  }

  @js.native
  trait ListFlowExecutionMessagesResponse extends js.Object {
    var messages: js.UndefOr[FlowExecutionMessages]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListFlowExecutionMessagesResponse {
    @inline
    def apply(
        messages: js.UndefOr[FlowExecutionMessages] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFlowExecutionMessagesResponse = {
      val __obj = js.Dynamic.literal()
      messages.foreach(__v => __obj.updateDynamic("messages")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFlowExecutionMessagesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceArn,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** An object that specifies whether cloud metrics are collected in a deployment and, if so, what role is used to collect metrics.
    */
  @js.native
  trait MetricsConfiguration extends js.Object {
    var cloudMetricEnabled: js.UndefOr[Enabled]
    var metricRuleRoleArn: js.UndefOr[RoleArn]
  }

  object MetricsConfiguration {
    @inline
    def apply(
        cloudMetricEnabled: js.UndefOr[Enabled] = js.undefined,
        metricRuleRoleArn: js.UndefOr[RoleArn] = js.undefined
    ): MetricsConfiguration = {
      val __obj = js.Dynamic.literal()
      cloudMetricEnabled.foreach(__v => __obj.updateDynamic("cloudMetricEnabled")(__v.asInstanceOf[js.Any]))
      metricRuleRoleArn.foreach(__v => __obj.updateDynamic("metricRuleRoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricsConfiguration]
    }
  }

  @js.native
  trait SearchEntitiesRequest extends js.Object {
    var entityTypes: EntityTypes
    var filters: js.UndefOr[EntityFilters]
    var maxResults: js.UndefOr[MaxResults]
    var namespaceVersion: js.UndefOr[Version]
    var nextToken: js.UndefOr[NextToken]
  }

  object SearchEntitiesRequest {
    @inline
    def apply(
        entityTypes: EntityTypes,
        filters: js.UndefOr[EntityFilters] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        namespaceVersion: js.UndefOr[Version] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): SearchEntitiesRequest = {
      val __obj = js.Dynamic.literal(
        "entityTypes" -> entityTypes.asInstanceOf[js.Any]
      )

      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      namespaceVersion.foreach(__v => __obj.updateDynamic("namespaceVersion")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchEntitiesRequest]
    }
  }

  @js.native
  trait SearchEntitiesResponse extends js.Object {
    var descriptions: js.UndefOr[EntityDescriptions]
    var nextToken: js.UndefOr[NextToken]
  }

  object SearchEntitiesResponse {
    @inline
    def apply(
        descriptions: js.UndefOr[EntityDescriptions] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): SearchEntitiesResponse = {
      val __obj = js.Dynamic.literal()
      descriptions.foreach(__v => __obj.updateDynamic("descriptions")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchEntitiesResponse]
    }
  }

  @js.native
  trait SearchFlowExecutionsRequest extends js.Object {
    var systemInstanceId: Urn
    var endTime: js.UndefOr[Timestamp]
    var flowExecutionId: js.UndefOr[FlowExecutionId]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var startTime: js.UndefOr[Timestamp]
  }

  object SearchFlowExecutionsRequest {
    @inline
    def apply(
        systemInstanceId: Urn,
        endTime: js.UndefOr[Timestamp] = js.undefined,
        flowExecutionId: js.UndefOr[FlowExecutionId] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        startTime: js.UndefOr[Timestamp] = js.undefined
    ): SearchFlowExecutionsRequest = {
      val __obj = js.Dynamic.literal(
        "systemInstanceId" -> systemInstanceId.asInstanceOf[js.Any]
      )

      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      flowExecutionId.foreach(__v => __obj.updateDynamic("flowExecutionId")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchFlowExecutionsRequest]
    }
  }

  @js.native
  trait SearchFlowExecutionsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var summaries: js.UndefOr[FlowExecutionSummaries]
  }

  object SearchFlowExecutionsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        summaries: js.UndefOr[FlowExecutionSummaries] = js.undefined
    ): SearchFlowExecutionsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      summaries.foreach(__v => __obj.updateDynamic("summaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchFlowExecutionsResponse]
    }
  }

  @js.native
  trait SearchFlowTemplatesRequest extends js.Object {
    var filters: js.UndefOr[FlowTemplateFilters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object SearchFlowTemplatesRequest {
    @inline
    def apply(
        filters: js.UndefOr[FlowTemplateFilters] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): SearchFlowTemplatesRequest = {
      val __obj = js.Dynamic.literal()
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchFlowTemplatesRequest]
    }
  }

  @js.native
  trait SearchFlowTemplatesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var summaries: js.UndefOr[FlowTemplateSummaries]
  }

  object SearchFlowTemplatesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        summaries: js.UndefOr[FlowTemplateSummaries] = js.undefined
    ): SearchFlowTemplatesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      summaries.foreach(__v => __obj.updateDynamic("summaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchFlowTemplatesResponse]
    }
  }

  @js.native
  trait SearchSystemInstancesRequest extends js.Object {
    var filters: js.UndefOr[SystemInstanceFilters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object SearchSystemInstancesRequest {
    @inline
    def apply(
        filters: js.UndefOr[SystemInstanceFilters] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): SearchSystemInstancesRequest = {
      val __obj = js.Dynamic.literal()
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchSystemInstancesRequest]
    }
  }

  @js.native
  trait SearchSystemInstancesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var summaries: js.UndefOr[SystemInstanceSummaries]
  }

  object SearchSystemInstancesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        summaries: js.UndefOr[SystemInstanceSummaries] = js.undefined
    ): SearchSystemInstancesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      summaries.foreach(__v => __obj.updateDynamic("summaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchSystemInstancesResponse]
    }
  }

  @js.native
  trait SearchSystemTemplatesRequest extends js.Object {
    var filters: js.UndefOr[SystemTemplateFilters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object SearchSystemTemplatesRequest {
    @inline
    def apply(
        filters: js.UndefOr[SystemTemplateFilters] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): SearchSystemTemplatesRequest = {
      val __obj = js.Dynamic.literal()
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchSystemTemplatesRequest]
    }
  }

  @js.native
  trait SearchSystemTemplatesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var summaries: js.UndefOr[SystemTemplateSummaries]
  }

  object SearchSystemTemplatesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        summaries: js.UndefOr[SystemTemplateSummaries] = js.undefined
    ): SearchSystemTemplatesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      summaries.foreach(__v => __obj.updateDynamic("summaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchSystemTemplatesResponse]
    }
  }

  @js.native
  trait SearchThingsRequest extends js.Object {
    var entityId: Urn
    var maxResults: js.UndefOr[MaxResults]
    var namespaceVersion: js.UndefOr[Version]
    var nextToken: js.UndefOr[NextToken]
  }

  object SearchThingsRequest {
    @inline
    def apply(
        entityId: Urn,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        namespaceVersion: js.UndefOr[Version] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): SearchThingsRequest = {
      val __obj = js.Dynamic.literal(
        "entityId" -> entityId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      namespaceVersion.foreach(__v => __obj.updateDynamic("namespaceVersion")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchThingsRequest]
    }
  }

  @js.native
  trait SearchThingsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var things: js.UndefOr[Things]
  }

  object SearchThingsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        things: js.UndefOr[Things] = js.undefined
    ): SearchThingsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      things.foreach(__v => __obj.updateDynamic("things")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchThingsResponse]
    }
  }

  /** An object that contains a system instance definition and summary information.
    */
  @js.native
  trait SystemInstanceDescription extends js.Object {
    var definition: js.UndefOr[DefinitionDocument]
    var flowActionsRoleArn: js.UndefOr[RoleArn]
    var metricsConfiguration: js.UndefOr[MetricsConfiguration]
    var s3BucketName: js.UndefOr[S3BucketName]
    var summary: js.UndefOr[SystemInstanceSummary]
    var validatedDependencyRevisions: js.UndefOr[DependencyRevisions]
    var validatedNamespaceVersion: js.UndefOr[Version]
  }

  object SystemInstanceDescription {
    @inline
    def apply(
        definition: js.UndefOr[DefinitionDocument] = js.undefined,
        flowActionsRoleArn: js.UndefOr[RoleArn] = js.undefined,
        metricsConfiguration: js.UndefOr[MetricsConfiguration] = js.undefined,
        s3BucketName: js.UndefOr[S3BucketName] = js.undefined,
        summary: js.UndefOr[SystemInstanceSummary] = js.undefined,
        validatedDependencyRevisions: js.UndefOr[DependencyRevisions] = js.undefined,
        validatedNamespaceVersion: js.UndefOr[Version] = js.undefined
    ): SystemInstanceDescription = {
      val __obj = js.Dynamic.literal()
      definition.foreach(__v => __obj.updateDynamic("definition")(__v.asInstanceOf[js.Any]))
      flowActionsRoleArn.foreach(__v => __obj.updateDynamic("flowActionsRoleArn")(__v.asInstanceOf[js.Any]))
      metricsConfiguration.foreach(__v => __obj.updateDynamic("metricsConfiguration")(__v.asInstanceOf[js.Any]))
      s3BucketName.foreach(__v => __obj.updateDynamic("s3BucketName")(__v.asInstanceOf[js.Any]))
      summary.foreach(__v => __obj.updateDynamic("summary")(__v.asInstanceOf[js.Any]))
      validatedDependencyRevisions.foreach(__v => __obj.updateDynamic("validatedDependencyRevisions")(__v.asInstanceOf[js.Any]))
      validatedNamespaceVersion.foreach(__v => __obj.updateDynamic("validatedNamespaceVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SystemInstanceDescription]
    }
  }

  /** An object that filters a system instance search. Multiple filters function as OR criteria in the search. For example a search that includes a GREENGRASS_GROUP_NAME and a STATUS filter searches for system instances in the specified Greengrass group that have the specified status.
    */
  @js.native
  trait SystemInstanceFilter extends js.Object {
    var name: js.UndefOr[SystemInstanceFilterName]
    var value: js.UndefOr[SystemInstanceFilterValues]
  }

  object SystemInstanceFilter {
    @inline
    def apply(
        name: js.UndefOr[SystemInstanceFilterName] = js.undefined,
        value: js.UndefOr[SystemInstanceFilterValues] = js.undefined
    ): SystemInstanceFilter = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SystemInstanceFilter]
    }
  }

  /** An object that contains summary information about a system instance.
    */
  @js.native
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

  object SystemInstanceSummary {
    @inline
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        greengrassGroupId: js.UndefOr[GreengrassGroupId] = js.undefined,
        greengrassGroupName: js.UndefOr[GroupName] = js.undefined,
        greengrassGroupVersionId: js.UndefOr[GreengrassGroupVersionId] = js.undefined,
        id: js.UndefOr[Urn] = js.undefined,
        status: js.UndefOr[SystemInstanceDeploymentStatus] = js.undefined,
        target: js.UndefOr[DeploymentTarget] = js.undefined,
        updatedAt: js.UndefOr[Timestamp] = js.undefined
    ): SystemInstanceSummary = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      greengrassGroupId.foreach(__v => __obj.updateDynamic("greengrassGroupId")(__v.asInstanceOf[js.Any]))
      greengrassGroupName.foreach(__v => __obj.updateDynamic("greengrassGroupName")(__v.asInstanceOf[js.Any]))
      greengrassGroupVersionId.foreach(__v => __obj.updateDynamic("greengrassGroupVersionId")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      target.foreach(__v => __obj.updateDynamic("target")(__v.asInstanceOf[js.Any]))
      updatedAt.foreach(__v => __obj.updateDynamic("updatedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SystemInstanceSummary]
    }
  }

  /** An object that contains a system's definition document and summary information.
    */
  @js.native
  trait SystemTemplateDescription extends js.Object {
    var definition: js.UndefOr[DefinitionDocument]
    var summary: js.UndefOr[SystemTemplateSummary]
    var validatedNamespaceVersion: js.UndefOr[Version]
  }

  object SystemTemplateDescription {
    @inline
    def apply(
        definition: js.UndefOr[DefinitionDocument] = js.undefined,
        summary: js.UndefOr[SystemTemplateSummary] = js.undefined,
        validatedNamespaceVersion: js.UndefOr[Version] = js.undefined
    ): SystemTemplateDescription = {
      val __obj = js.Dynamic.literal()
      definition.foreach(__v => __obj.updateDynamic("definition")(__v.asInstanceOf[js.Any]))
      summary.foreach(__v => __obj.updateDynamic("summary")(__v.asInstanceOf[js.Any]))
      validatedNamespaceVersion.foreach(__v => __obj.updateDynamic("validatedNamespaceVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SystemTemplateDescription]
    }
  }

  /** An object that filters a system search.
    */
  @js.native
  trait SystemTemplateFilter extends js.Object {
    var name: SystemTemplateFilterName
    var value: SystemTemplateFilterValues
  }

  object SystemTemplateFilter {
    @inline
    def apply(
        name: SystemTemplateFilterName,
        value: SystemTemplateFilterValues
    ): SystemTemplateFilter = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SystemTemplateFilter]
    }
  }

  /** An object that contains information about a system.
    */
  @js.native
  trait SystemTemplateSummary extends js.Object {
    var arn: js.UndefOr[Arn]
    var createdAt: js.UndefOr[Timestamp]
    var id: js.UndefOr[Urn]
    var revisionNumber: js.UndefOr[Version]
  }

  object SystemTemplateSummary {
    @inline
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        id: js.UndefOr[Urn] = js.undefined,
        revisionNumber: js.UndefOr[Version] = js.undefined
    ): SystemTemplateSummary = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.updateDynamic("createdAt")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      revisionNumber.foreach(__v => __obj.updateDynamic("revisionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SystemTemplateSummary]
    }
  }

  /** Metadata assigned to an AWS IoT Things Graph resource consisting of a key-value pair.
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
  trait TagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceArn,
        tags: TagList
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

  /** An AWS IoT thing.
    */
  @js.native
  trait Thing extends js.Object {
    var thingArn: js.UndefOr[ThingArn]
    var thingName: js.UndefOr[ThingName]
  }

  object Thing {
    @inline
    def apply(
        thingArn: js.UndefOr[ThingArn] = js.undefined,
        thingName: js.UndefOr[ThingName] = js.undefined
    ): Thing = {
      val __obj = js.Dynamic.literal()
      thingArn.foreach(__v => __obj.updateDynamic("thingArn")(__v.asInstanceOf[js.Any]))
      thingName.foreach(__v => __obj.updateDynamic("thingName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Thing]
    }
  }

  @js.native
  trait UndeploySystemInstanceRequest extends js.Object {
    var id: js.UndefOr[Urn]
  }

  object UndeploySystemInstanceRequest {
    @inline
    def apply(
        id: js.UndefOr[Urn] = js.undefined
    ): UndeploySystemInstanceRequest = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UndeploySystemInstanceRequest]
    }
  }

  @js.native
  trait UndeploySystemInstanceResponse extends js.Object {
    var summary: js.UndefOr[SystemInstanceSummary]
  }

  object UndeploySystemInstanceResponse {
    @inline
    def apply(
        summary: js.UndefOr[SystemInstanceSummary] = js.undefined
    ): UndeploySystemInstanceResponse = {
      val __obj = js.Dynamic.literal()
      summary.foreach(__v => __obj.updateDynamic("summary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UndeploySystemInstanceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceArn,
        tagKeys: TagKeyList
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

  @js.native
  trait UpdateFlowTemplateRequest extends js.Object {
    var definition: DefinitionDocument
    var id: Urn
    var compatibleNamespaceVersion: js.UndefOr[Version]
  }

  object UpdateFlowTemplateRequest {
    @inline
    def apply(
        definition: DefinitionDocument,
        id: Urn,
        compatibleNamespaceVersion: js.UndefOr[Version] = js.undefined
    ): UpdateFlowTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "definition" -> definition.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any]
      )

      compatibleNamespaceVersion.foreach(__v => __obj.updateDynamic("compatibleNamespaceVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFlowTemplateRequest]
    }
  }

  @js.native
  trait UpdateFlowTemplateResponse extends js.Object {
    var summary: js.UndefOr[FlowTemplateSummary]
  }

  object UpdateFlowTemplateResponse {
    @inline
    def apply(
        summary: js.UndefOr[FlowTemplateSummary] = js.undefined
    ): UpdateFlowTemplateResponse = {
      val __obj = js.Dynamic.literal()
      summary.foreach(__v => __obj.updateDynamic("summary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFlowTemplateResponse]
    }
  }

  @js.native
  trait UpdateSystemTemplateRequest extends js.Object {
    var definition: DefinitionDocument
    var id: Urn
    var compatibleNamespaceVersion: js.UndefOr[Version]
  }

  object UpdateSystemTemplateRequest {
    @inline
    def apply(
        definition: DefinitionDocument,
        id: Urn,
        compatibleNamespaceVersion: js.UndefOr[Version] = js.undefined
    ): UpdateSystemTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "definition" -> definition.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any]
      )

      compatibleNamespaceVersion.foreach(__v => __obj.updateDynamic("compatibleNamespaceVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSystemTemplateRequest]
    }
  }

  @js.native
  trait UpdateSystemTemplateResponse extends js.Object {
    var summary: js.UndefOr[SystemTemplateSummary]
  }

  object UpdateSystemTemplateResponse {
    @inline
    def apply(
        summary: js.UndefOr[SystemTemplateSummary] = js.undefined
    ): UpdateSystemTemplateResponse = {
      val __obj = js.Dynamic.literal()
      summary.foreach(__v => __obj.updateDynamic("summary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSystemTemplateResponse]
    }
  }

  @js.native
  trait UploadEntityDefinitionsRequest extends js.Object {
    var deprecateExistingEntities: js.UndefOr[DeprecateExistingEntities]
    var document: js.UndefOr[DefinitionDocument]
    var syncWithPublicNamespace: js.UndefOr[SyncWithPublicNamespace]
  }

  object UploadEntityDefinitionsRequest {
    @inline
    def apply(
        deprecateExistingEntities: js.UndefOr[DeprecateExistingEntities] = js.undefined,
        document: js.UndefOr[DefinitionDocument] = js.undefined,
        syncWithPublicNamespace: js.UndefOr[SyncWithPublicNamespace] = js.undefined
    ): UploadEntityDefinitionsRequest = {
      val __obj = js.Dynamic.literal()
      deprecateExistingEntities.foreach(__v => __obj.updateDynamic("deprecateExistingEntities")(__v.asInstanceOf[js.Any]))
      document.foreach(__v => __obj.updateDynamic("document")(__v.asInstanceOf[js.Any]))
      syncWithPublicNamespace.foreach(__v => __obj.updateDynamic("syncWithPublicNamespace")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UploadEntityDefinitionsRequest]
    }
  }

  @js.native
  trait UploadEntityDefinitionsResponse extends js.Object {
    var uploadId: UploadId
  }

  object UploadEntityDefinitionsResponse {
    @inline
    def apply(
        uploadId: UploadId
    ): UploadEntityDefinitionsResponse = {
      val __obj = js.Dynamic.literal(
        "uploadId" -> uploadId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UploadEntityDefinitionsResponse]
    }
  }
}
