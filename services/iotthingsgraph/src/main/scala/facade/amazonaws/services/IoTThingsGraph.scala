package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object iotthingsgraph {
  type Arn                               = String
  type DefinitionLanguage                = String
  type DefinitionText                    = String
  type DependencyRevisions               = js.Array[DependencyRevision]
  type DeploymentTarget                  = String
  type DeprecateExistingEntities         = Boolean
  type Enabled                           = Boolean
  type EntityDescriptions                = js.Array[EntityDescription]
  type EntityFilterName                  = String
  type EntityFilterValue                 = String
  type EntityFilterValues                = js.Array[EntityFilterValue]
  type EntityFilters                     = js.Array[EntityFilter]
  type EntityType                        = String
  type EntityTypes                       = js.Array[EntityType]
  type FlowExecutionEventType            = String
  type FlowExecutionId                   = String
  type FlowExecutionMessageId            = String
  type FlowExecutionMessagePayload       = String
  type FlowExecutionMessages             = js.Array[FlowExecutionMessage]
  type FlowExecutionStatus               = String
  type FlowExecutionSummaries            = js.Array[FlowExecutionSummary]
  type FlowTemplateFilterName            = String
  type FlowTemplateFilterValue           = String
  type FlowTemplateFilterValues          = js.Array[FlowTemplateFilterValue]
  type FlowTemplateFilters               = js.Array[FlowTemplateFilter]
  type FlowTemplateSummaries             = js.Array[FlowTemplateSummary]
  type GreengrassDeploymentId            = String
  type GreengrassGroupId                 = String
  type GreengrassGroupVersionId          = String
  type GroupName                         = String
  type MaxResults                        = Int
  type NamespaceDeletionStatus           = String
  type NamespaceDeletionStatusErrorCodes = String
  type NamespaceName                     = String
  type NextToken                         = String
  type ResourceArn                       = String
  type RoleArn                           = String
  type S3BucketName                      = String
  type StringList                        = js.Array[String]
  type SyncWithPublicNamespace           = Boolean
  type SystemInstanceDeploymentStatus    = String
  type SystemInstanceFilterName          = String
  type SystemInstanceFilterValue         = String
  type SystemInstanceFilterValues        = js.Array[SystemInstanceFilterValue]
  type SystemInstanceFilters             = js.Array[SystemInstanceFilter]
  type SystemInstanceSummaries           = js.Array[SystemInstanceSummary]
  type SystemTemplateFilterName          = String
  type SystemTemplateFilterValue         = String
  type SystemTemplateFilterValues        = js.Array[SystemTemplateFilterValue]
  type SystemTemplateFilters             = js.Array[SystemTemplateFilter]
  type SystemTemplateSummaries           = js.Array[SystemTemplateSummary]
  type TagKey                            = String
  type TagKeyList                        = js.Array[TagKey]
  type TagList                           = js.Array[Tag]
  type TagValue                          = String
  type ThingArn                          = String
  type ThingName                         = String
  type Things                            = js.Array[Thing]
  type Timestamp                         = js.Date
  type UploadId                          = String
  type UploadStatus                      = String
  type Urn                               = String
  type Urns                              = js.Array[Urn]
  type Version                           = Double

  implicit final class IoTThingsGraphOps(private val service: IoTThingsGraph) extends AnyVal {

    def associateEntityToThingFuture(params: AssociateEntityToThingRequest): Future[AssociateEntityToThingResponse] =
      service.associateEntityToThing(params).promise.toFuture
    def createFlowTemplateFuture(params: CreateFlowTemplateRequest): Future[CreateFlowTemplateResponse] =
      service.createFlowTemplate(params).promise.toFuture
    def createSystemInstanceFuture(params: CreateSystemInstanceRequest): Future[CreateSystemInstanceResponse] =
      service.createSystemInstance(params).promise.toFuture
    def createSystemTemplateFuture(params: CreateSystemTemplateRequest): Future[CreateSystemTemplateResponse] =
      service.createSystemTemplate(params).promise.toFuture
    def deleteFlowTemplateFuture(params: DeleteFlowTemplateRequest): Future[DeleteFlowTemplateResponse] =
      service.deleteFlowTemplate(params).promise.toFuture
    def deleteNamespaceFuture(params: DeleteNamespaceRequest): Future[DeleteNamespaceResponse] =
      service.deleteNamespace(params).promise.toFuture
    def deleteSystemInstanceFuture(params: DeleteSystemInstanceRequest): Future[DeleteSystemInstanceResponse] =
      service.deleteSystemInstance(params).promise.toFuture
    def deleteSystemTemplateFuture(params: DeleteSystemTemplateRequest): Future[DeleteSystemTemplateResponse] =
      service.deleteSystemTemplate(params).promise.toFuture
    def deploySystemInstanceFuture(params: DeploySystemInstanceRequest): Future[DeploySystemInstanceResponse] =
      service.deploySystemInstance(params).promise.toFuture
    def deprecateFlowTemplateFuture(params: DeprecateFlowTemplateRequest): Future[DeprecateFlowTemplateResponse] =
      service.deprecateFlowTemplate(params).promise.toFuture
    def deprecateSystemTemplateFuture(params: DeprecateSystemTemplateRequest): Future[DeprecateSystemTemplateResponse] =
      service.deprecateSystemTemplate(params).promise.toFuture
    def describeNamespaceFuture(params: DescribeNamespaceRequest): Future[DescribeNamespaceResponse] =
      service.describeNamespace(params).promise.toFuture
    def dissociateEntityFromThingFuture(
        params: DissociateEntityFromThingRequest
    ): Future[DissociateEntityFromThingResponse] = service.dissociateEntityFromThing(params).promise.toFuture
    def getEntitiesFuture(params: GetEntitiesRequest): Future[GetEntitiesResponse] =
      service.getEntities(params).promise.toFuture
    def getFlowTemplateFuture(params: GetFlowTemplateRequest): Future[GetFlowTemplateResponse] =
      service.getFlowTemplate(params).promise.toFuture
    def getFlowTemplateRevisionsFuture(
        params: GetFlowTemplateRevisionsRequest
    ): Future[GetFlowTemplateRevisionsResponse] = service.getFlowTemplateRevisions(params).promise.toFuture
    def getNamespaceDeletionStatusFuture(
        params: GetNamespaceDeletionStatusRequest
    ): Future[GetNamespaceDeletionStatusResponse] = service.getNamespaceDeletionStatus(params).promise.toFuture
    def getSystemInstanceFuture(params: GetSystemInstanceRequest): Future[GetSystemInstanceResponse] =
      service.getSystemInstance(params).promise.toFuture
    def getSystemTemplateFuture(params: GetSystemTemplateRequest): Future[GetSystemTemplateResponse] =
      service.getSystemTemplate(params).promise.toFuture
    def getSystemTemplateRevisionsFuture(
        params: GetSystemTemplateRevisionsRequest
    ): Future[GetSystemTemplateRevisionsResponse] = service.getSystemTemplateRevisions(params).promise.toFuture
    def getUploadStatusFuture(params: GetUploadStatusRequest): Future[GetUploadStatusResponse] =
      service.getUploadStatus(params).promise.toFuture
    def listFlowExecutionMessagesFuture(
        params: ListFlowExecutionMessagesRequest
    ): Future[ListFlowExecutionMessagesResponse] = service.listFlowExecutionMessages(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    def searchEntitiesFuture(params: SearchEntitiesRequest): Future[SearchEntitiesResponse] =
      service.searchEntities(params).promise.toFuture
    def searchFlowExecutionsFuture(params: SearchFlowExecutionsRequest): Future[SearchFlowExecutionsResponse] =
      service.searchFlowExecutions(params).promise.toFuture
    def searchFlowTemplatesFuture(params: SearchFlowTemplatesRequest): Future[SearchFlowTemplatesResponse] =
      service.searchFlowTemplates(params).promise.toFuture
    def searchSystemInstancesFuture(params: SearchSystemInstancesRequest): Future[SearchSystemInstancesResponse] =
      service.searchSystemInstances(params).promise.toFuture
    def searchSystemTemplatesFuture(params: SearchSystemTemplatesRequest): Future[SearchSystemTemplatesResponse] =
      service.searchSystemTemplates(params).promise.toFuture
    def searchThingsFuture(params: SearchThingsRequest): Future[SearchThingsResponse] =
      service.searchThings(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise.toFuture
    def undeploySystemInstanceFuture(params: UndeploySystemInstanceRequest): Future[UndeploySystemInstanceResponse] =
      service.undeploySystemInstance(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise.toFuture
    def updateFlowTemplateFuture(params: UpdateFlowTemplateRequest): Future[UpdateFlowTemplateResponse] =
      service.updateFlowTemplate(params).promise.toFuture
    def updateSystemTemplateFuture(params: UpdateSystemTemplateRequest): Future[UpdateSystemTemplateResponse] =
      service.updateSystemTemplate(params).promise.toFuture
    def uploadEntityDefinitionsFuture(params: UploadEntityDefinitionsRequest): Future[UploadEntityDefinitionsResponse] =
      service.uploadEntityDefinitions(params).promise.toFuture
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
  trait AssociateEntityToThingRequest extends js.Object {
    var entityId: Urn
    var thingName: ThingName
    var namespaceVersion: js.UndefOr[Version]
  }

  object AssociateEntityToThingRequest {
    def apply(
        entityId: Urn,
        thingName: ThingName,
        namespaceVersion: js.UndefOr[Version] = js.undefined
    ): AssociateEntityToThingRequest = {
      val __obj = js.Dictionary[js.Any](
        "entityId"  -> entityId.asInstanceOf[js.Any],
        "thingName" -> thingName.asInstanceOf[js.Any]
      )

      namespaceVersion.foreach(__v => __obj.update("namespaceVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateEntityToThingRequest]
    }
  }

  @js.native
  trait AssociateEntityToThingResponse extends js.Object {}

  object AssociateEntityToThingResponse {
    def apply(
        ): AssociateEntityToThingResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[AssociateEntityToThingResponse]
    }
  }

  @js.native
  trait CreateFlowTemplateRequest extends js.Object {
    var definition: DefinitionDocument
    var compatibleNamespaceVersion: js.UndefOr[Version]
  }

  object CreateFlowTemplateRequest {
    def apply(
        definition: DefinitionDocument,
        compatibleNamespaceVersion: js.UndefOr[Version] = js.undefined
    ): CreateFlowTemplateRequest = {
      val __obj = js.Dictionary[js.Any](
        "definition" -> definition.asInstanceOf[js.Any]
      )

      compatibleNamespaceVersion.foreach(__v => __obj.update("compatibleNamespaceVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFlowTemplateRequest]
    }
  }

  @js.native
  trait CreateFlowTemplateResponse extends js.Object {
    var summary: js.UndefOr[FlowTemplateSummary]
  }

  object CreateFlowTemplateResponse {
    def apply(
        summary: js.UndefOr[FlowTemplateSummary] = js.undefined
    ): CreateFlowTemplateResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      summary.foreach(__v => __obj.update("summary", __v.asInstanceOf[js.Any]))
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
    def apply(
        definition: DefinitionDocument,
        target: DeploymentTarget,
        flowActionsRoleArn: js.UndefOr[RoleArn] = js.undefined,
        greengrassGroupName: js.UndefOr[GroupName] = js.undefined,
        metricsConfiguration: js.UndefOr[MetricsConfiguration] = js.undefined,
        s3BucketName: js.UndefOr[S3BucketName] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateSystemInstanceRequest = {
      val __obj = js.Dictionary[js.Any](
        "definition" -> definition.asInstanceOf[js.Any],
        "target"     -> target.asInstanceOf[js.Any]
      )

      flowActionsRoleArn.foreach(__v => __obj.update("flowActionsRoleArn", __v.asInstanceOf[js.Any]))
      greengrassGroupName.foreach(__v => __obj.update("greengrassGroupName", __v.asInstanceOf[js.Any]))
      metricsConfiguration.foreach(__v => __obj.update("metricsConfiguration", __v.asInstanceOf[js.Any]))
      s3BucketName.foreach(__v => __obj.update("s3BucketName", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSystemInstanceRequest]
    }
  }

  @js.native
  trait CreateSystemInstanceResponse extends js.Object {
    var summary: js.UndefOr[SystemInstanceSummary]
  }

  object CreateSystemInstanceResponse {
    def apply(
        summary: js.UndefOr[SystemInstanceSummary] = js.undefined
    ): CreateSystemInstanceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      summary.foreach(__v => __obj.update("summary", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSystemInstanceResponse]
    }
  }

  @js.native
  trait CreateSystemTemplateRequest extends js.Object {
    var definition: DefinitionDocument
    var compatibleNamespaceVersion: js.UndefOr[Version]
  }

  object CreateSystemTemplateRequest {
    def apply(
        definition: DefinitionDocument,
        compatibleNamespaceVersion: js.UndefOr[Version] = js.undefined
    ): CreateSystemTemplateRequest = {
      val __obj = js.Dictionary[js.Any](
        "definition" -> definition.asInstanceOf[js.Any]
      )

      compatibleNamespaceVersion.foreach(__v => __obj.update("compatibleNamespaceVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSystemTemplateRequest]
    }
  }

  @js.native
  trait CreateSystemTemplateResponse extends js.Object {
    var summary: js.UndefOr[SystemTemplateSummary]
  }

  object CreateSystemTemplateResponse {
    def apply(
        summary: js.UndefOr[SystemTemplateSummary] = js.undefined
    ): CreateSystemTemplateResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      summary.foreach(__v => __obj.update("summary", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSystemTemplateResponse]
    }
  }

  /**
    * A document that defines an entity.
    */
  @js.native
  trait DefinitionDocument extends js.Object {
    var language: DefinitionLanguage
    var text: DefinitionText
  }

  object DefinitionDocument {
    def apply(
        language: DefinitionLanguage,
        text: DefinitionText
    ): DefinitionDocument = {
      val __obj = js.Dictionary[js.Any](
        "language" -> language.asInstanceOf[js.Any],
        "text"     -> text.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DefinitionDocument]
    }
  }

  object DefinitionLanguageEnum {
    val GRAPHQL = "GRAPHQL"

    val values = js.Object.freeze(js.Array(GRAPHQL))
  }

  @js.native
  trait DeleteFlowTemplateRequest extends js.Object {
    var id: Urn
  }

  object DeleteFlowTemplateRequest {
    def apply(
        id: Urn
    ): DeleteFlowTemplateRequest = {
      val __obj = js.Dictionary[js.Any](
        "id" -> id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteFlowTemplateRequest]
    }
  }

  @js.native
  trait DeleteFlowTemplateResponse extends js.Object {}

  object DeleteFlowTemplateResponse {
    def apply(
        ): DeleteFlowTemplateResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteFlowTemplateResponse]
    }
  }

  @js.native
  trait DeleteNamespaceRequest extends js.Object {}

  object DeleteNamespaceRequest {
    def apply(
        ): DeleteNamespaceRequest = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteNamespaceRequest]
    }
  }

  @js.native
  trait DeleteNamespaceResponse extends js.Object {
    var namespaceArn: js.UndefOr[Arn]
    var namespaceName: js.UndefOr[NamespaceName]
  }

  object DeleteNamespaceResponse {
    def apply(
        namespaceArn: js.UndefOr[Arn] = js.undefined,
        namespaceName: js.UndefOr[NamespaceName] = js.undefined
    ): DeleteNamespaceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      namespaceArn.foreach(__v => __obj.update("namespaceArn", __v.asInstanceOf[js.Any]))
      namespaceName.foreach(__v => __obj.update("namespaceName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteNamespaceResponse]
    }
  }

  @js.native
  trait DeleteSystemInstanceRequest extends js.Object {
    var id: js.UndefOr[Urn]
  }

  object DeleteSystemInstanceRequest {
    def apply(
        id: js.UndefOr[Urn] = js.undefined
    ): DeleteSystemInstanceRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      id.foreach(__v => __obj.update("id", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSystemInstanceRequest]
    }
  }

  @js.native
  trait DeleteSystemInstanceResponse extends js.Object {}

  object DeleteSystemInstanceResponse {
    def apply(
        ): DeleteSystemInstanceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteSystemInstanceResponse]
    }
  }

  @js.native
  trait DeleteSystemTemplateRequest extends js.Object {
    var id: Urn
  }

  object DeleteSystemTemplateRequest {
    def apply(
        id: Urn
    ): DeleteSystemTemplateRequest = {
      val __obj = js.Dictionary[js.Any](
        "id" -> id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteSystemTemplateRequest]
    }
  }

  @js.native
  trait DeleteSystemTemplateResponse extends js.Object {}

  object DeleteSystemTemplateResponse {
    def apply(
        ): DeleteSystemTemplateResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteSystemTemplateResponse]
    }
  }

  /**
    * An object that contains the ID and revision number of a workflow or system that is part of a deployment.
    */
  @js.native
  trait DependencyRevision extends js.Object {
    var id: js.UndefOr[Urn]
    var revisionNumber: js.UndefOr[Version]
  }

  object DependencyRevision {
    def apply(
        id: js.UndefOr[Urn] = js.undefined,
        revisionNumber: js.UndefOr[Version] = js.undefined
    ): DependencyRevision = {
      val __obj = js.Dictionary.empty[js.Any]
      id.foreach(__v => __obj.update("id", __v.asInstanceOf[js.Any]))
      revisionNumber.foreach(__v => __obj.update("revisionNumber", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DependencyRevision]
    }
  }

  @js.native
  trait DeploySystemInstanceRequest extends js.Object {
    var id: js.UndefOr[Urn]
  }

  object DeploySystemInstanceRequest {
    def apply(
        id: js.UndefOr[Urn] = js.undefined
    ): DeploySystemInstanceRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      id.foreach(__v => __obj.update("id", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeploySystemInstanceRequest]
    }
  }

  @js.native
  trait DeploySystemInstanceResponse extends js.Object {
    var summary: SystemInstanceSummary
    var greengrassDeploymentId: js.UndefOr[GreengrassDeploymentId]
  }

  object DeploySystemInstanceResponse {
    def apply(
        summary: SystemInstanceSummary,
        greengrassDeploymentId: js.UndefOr[GreengrassDeploymentId] = js.undefined
    ): DeploySystemInstanceResponse = {
      val __obj = js.Dictionary[js.Any](
        "summary" -> summary.asInstanceOf[js.Any]
      )

      greengrassDeploymentId.foreach(__v => __obj.update("greengrassDeploymentId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeploySystemInstanceResponse]
    }
  }

  object DeploymentTargetEnum {
    val GREENGRASS = "GREENGRASS"
    val CLOUD      = "CLOUD"

    val values = js.Object.freeze(js.Array(GREENGRASS, CLOUD))
  }

  @js.native
  trait DeprecateFlowTemplateRequest extends js.Object {
    var id: Urn
  }

  object DeprecateFlowTemplateRequest {
    def apply(
        id: Urn
    ): DeprecateFlowTemplateRequest = {
      val __obj = js.Dictionary[js.Any](
        "id" -> id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeprecateFlowTemplateRequest]
    }
  }

  @js.native
  trait DeprecateFlowTemplateResponse extends js.Object {}

  object DeprecateFlowTemplateResponse {
    def apply(
        ): DeprecateFlowTemplateResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeprecateFlowTemplateResponse]
    }
  }

  @js.native
  trait DeprecateSystemTemplateRequest extends js.Object {
    var id: Urn
  }

  object DeprecateSystemTemplateRequest {
    def apply(
        id: Urn
    ): DeprecateSystemTemplateRequest = {
      val __obj = js.Dictionary[js.Any](
        "id" -> id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeprecateSystemTemplateRequest]
    }
  }

  @js.native
  trait DeprecateSystemTemplateResponse extends js.Object {}

  object DeprecateSystemTemplateResponse {
    def apply(
        ): DeprecateSystemTemplateResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeprecateSystemTemplateResponse]
    }
  }

  @js.native
  trait DescribeNamespaceRequest extends js.Object {
    var namespaceName: js.UndefOr[NamespaceName]
  }

  object DescribeNamespaceRequest {
    def apply(
        namespaceName: js.UndefOr[NamespaceName] = js.undefined
    ): DescribeNamespaceRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      namespaceName.foreach(__v => __obj.update("namespaceName", __v.asInstanceOf[js.Any]))
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
    def apply(
        namespaceArn: js.UndefOr[Arn] = js.undefined,
        namespaceName: js.UndefOr[NamespaceName] = js.undefined,
        namespaceVersion: js.UndefOr[Version] = js.undefined,
        trackingNamespaceName: js.UndefOr[NamespaceName] = js.undefined,
        trackingNamespaceVersion: js.UndefOr[Version] = js.undefined
    ): DescribeNamespaceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      namespaceArn.foreach(__v => __obj.update("namespaceArn", __v.asInstanceOf[js.Any]))
      namespaceName.foreach(__v => __obj.update("namespaceName", __v.asInstanceOf[js.Any]))
      namespaceVersion.foreach(__v => __obj.update("namespaceVersion", __v.asInstanceOf[js.Any]))
      trackingNamespaceName.foreach(__v => __obj.update("trackingNamespaceName", __v.asInstanceOf[js.Any]))
      trackingNamespaceVersion.foreach(__v => __obj.update("trackingNamespaceVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeNamespaceResponse]
    }
  }

  @js.native
  trait DissociateEntityFromThingRequest extends js.Object {
    var entityType: EntityType
    var thingName: ThingName
  }

  object DissociateEntityFromThingRequest {
    def apply(
        entityType: EntityType,
        thingName: ThingName
    ): DissociateEntityFromThingRequest = {
      val __obj = js.Dictionary[js.Any](
        "entityType" -> entityType.asInstanceOf[js.Any],
        "thingName"  -> thingName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DissociateEntityFromThingRequest]
    }
  }

  @js.native
  trait DissociateEntityFromThingResponse extends js.Object {}

  object DissociateEntityFromThingResponse {
    def apply(
        ): DissociateEntityFromThingResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DissociateEntityFromThingResponse]
    }
  }

  /**
    * Describes the properties of an entity.
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
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        definition: js.UndefOr[DefinitionDocument] = js.undefined,
        id: js.UndefOr[Urn] = js.undefined,
        `type`: js.UndefOr[EntityType] = js.undefined
    ): EntityDescription = {
      val __obj = js.Dictionary.empty[js.Any]
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.update("createdAt", __v.asInstanceOf[js.Any]))
      definition.foreach(__v => __obj.update("definition", __v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.update("id", __v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EntityDescription]
    }
  }

  /**
    * An object that filters an entity search. Multiple filters function as OR criteria in the search. For example a search that includes a <code>NAMESPACE</code> and a <code>REFERENCED_ENTITY_ID</code> filter searches for entities in the specified namespace that use the entity specified by the value of <code>REFERENCED_ENTITY_ID</code>.
    */
  @js.native
  trait EntityFilter extends js.Object {
    var name: js.UndefOr[EntityFilterName]
    var value: js.UndefOr[EntityFilterValues]
  }

  object EntityFilter {
    def apply(
        name: js.UndefOr[EntityFilterName] = js.undefined,
        value: js.UndefOr[EntityFilterValues] = js.undefined
    ): EntityFilter = {
      val __obj = js.Dictionary.empty[js.Any]
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.update("value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EntityFilter]
    }
  }

  object EntityFilterNameEnum {
    val NAME                 = "NAME"
    val NAMESPACE            = "NAMESPACE"
    val SEMANTIC_TYPE_PATH   = "SEMANTIC_TYPE_PATH"
    val REFERENCED_ENTITY_ID = "REFERENCED_ENTITY_ID"

    val values = js.Object.freeze(js.Array(NAME, NAMESPACE, SEMANTIC_TYPE_PATH, REFERENCED_ENTITY_ID))
  }

  object EntityTypeEnum {
    val DEVICE       = "DEVICE"
    val SERVICE      = "SERVICE"
    val DEVICE_MODEL = "DEVICE_MODEL"
    val CAPABILITY   = "CAPABILITY"
    val STATE        = "STATE"
    val ACTION       = "ACTION"
    val EVENT        = "EVENT"
    val PROPERTY     = "PROPERTY"
    val MAPPING      = "MAPPING"
    val ENUM         = "ENUM"

    val values = js.Object.freeze(
      js.Array(DEVICE, SERVICE, DEVICE_MODEL, CAPABILITY, STATE, ACTION, EVENT, PROPERTY, MAPPING, ENUM)
    )
  }

  object FlowExecutionEventTypeEnum {
    val EXECUTION_STARTED              = "EXECUTION_STARTED"
    val EXECUTION_FAILED               = "EXECUTION_FAILED"
    val EXECUTION_ABORTED              = "EXECUTION_ABORTED"
    val EXECUTION_SUCCEEDED            = "EXECUTION_SUCCEEDED"
    val STEP_STARTED                   = "STEP_STARTED"
    val STEP_FAILED                    = "STEP_FAILED"
    val STEP_SUCCEEDED                 = "STEP_SUCCEEDED"
    val ACTIVITY_SCHEDULED             = "ACTIVITY_SCHEDULED"
    val ACTIVITY_STARTED               = "ACTIVITY_STARTED"
    val ACTIVITY_FAILED                = "ACTIVITY_FAILED"
    val ACTIVITY_SUCCEEDED             = "ACTIVITY_SUCCEEDED"
    val START_FLOW_EXECUTION_TASK      = "START_FLOW_EXECUTION_TASK"
    val SCHEDULE_NEXT_READY_STEPS_TASK = "SCHEDULE_NEXT_READY_STEPS_TASK"
    val THING_ACTION_TASK              = "THING_ACTION_TASK"
    val THING_ACTION_TASK_FAILED       = "THING_ACTION_TASK_FAILED"
    val THING_ACTION_TASK_SUCCEEDED    = "THING_ACTION_TASK_SUCCEEDED"
    val ACKNOWLEDGE_TASK_MESSAGE       = "ACKNOWLEDGE_TASK_MESSAGE"

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
  trait FlowExecutionMessage extends js.Object {
    var eventType: js.UndefOr[FlowExecutionEventType]
    var messageId: js.UndefOr[FlowExecutionMessageId]
    var payload: js.UndefOr[FlowExecutionMessagePayload]
    var timestamp: js.UndefOr[Timestamp]
  }

  object FlowExecutionMessage {
    def apply(
        eventType: js.UndefOr[FlowExecutionEventType] = js.undefined,
        messageId: js.UndefOr[FlowExecutionMessageId] = js.undefined,
        payload: js.UndefOr[FlowExecutionMessagePayload] = js.undefined,
        timestamp: js.UndefOr[Timestamp] = js.undefined
    ): FlowExecutionMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      eventType.foreach(__v => __obj.update("eventType", __v.asInstanceOf[js.Any]))
      messageId.foreach(__v => __obj.update("messageId", __v.asInstanceOf[js.Any]))
      payload.foreach(__v => __obj.update("payload", __v.asInstanceOf[js.Any]))
      timestamp.foreach(__v => __obj.update("timestamp", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FlowExecutionMessage]
    }
  }

  object FlowExecutionStatusEnum {
    val RUNNING   = "RUNNING"
    val ABORTED   = "ABORTED"
    val SUCCEEDED = "SUCCEEDED"
    val FAILED    = "FAILED"

    val values = js.Object.freeze(js.Array(RUNNING, ABORTED, SUCCEEDED, FAILED))
  }

  /**
    * An object that contains summary information about a flow execution.
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
    def apply(
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        flowExecutionId: js.UndefOr[FlowExecutionId] = js.undefined,
        flowTemplateId: js.UndefOr[Urn] = js.undefined,
        status: js.UndefOr[FlowExecutionStatus] = js.undefined,
        systemInstanceId: js.UndefOr[Urn] = js.undefined,
        updatedAt: js.UndefOr[Timestamp] = js.undefined
    ): FlowExecutionSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      createdAt.foreach(__v => __obj.update("createdAt", __v.asInstanceOf[js.Any]))
      flowExecutionId.foreach(__v => __obj.update("flowExecutionId", __v.asInstanceOf[js.Any]))
      flowTemplateId.foreach(__v => __obj.update("flowTemplateId", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      systemInstanceId.foreach(__v => __obj.update("systemInstanceId", __v.asInstanceOf[js.Any]))
      updatedAt.foreach(__v => __obj.update("updatedAt", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FlowExecutionSummary]
    }
  }

  /**
    * An object that contains a workflow's definition and summary information.
    */
  @js.native
  trait FlowTemplateDescription extends js.Object {
    var definition: js.UndefOr[DefinitionDocument]
    var summary: js.UndefOr[FlowTemplateSummary]
    var validatedNamespaceVersion: js.UndefOr[Version]
  }

  object FlowTemplateDescription {
    def apply(
        definition: js.UndefOr[DefinitionDocument] = js.undefined,
        summary: js.UndefOr[FlowTemplateSummary] = js.undefined,
        validatedNamespaceVersion: js.UndefOr[Version] = js.undefined
    ): FlowTemplateDescription = {
      val __obj = js.Dictionary.empty[js.Any]
      definition.foreach(__v => __obj.update("definition", __v.asInstanceOf[js.Any]))
      summary.foreach(__v => __obj.update("summary", __v.asInstanceOf[js.Any]))
      validatedNamespaceVersion.foreach(__v => __obj.update("validatedNamespaceVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FlowTemplateDescription]
    }
  }

  /**
    * An object that filters a workflow search.
    */
  @js.native
  trait FlowTemplateFilter extends js.Object {
    var name: FlowTemplateFilterName
    var value: FlowTemplateFilterValues
  }

  object FlowTemplateFilter {
    def apply(
        name: FlowTemplateFilterName,
        value: FlowTemplateFilterValues
    ): FlowTemplateFilter = {
      val __obj = js.Dictionary[js.Any](
        "name"  -> name.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[FlowTemplateFilter]
    }
  }

  object FlowTemplateFilterNameEnum {
    val DEVICE_MODEL_ID = "DEVICE_MODEL_ID"

    val values = js.Object.freeze(js.Array(DEVICE_MODEL_ID))
  }

  /**
    * An object that contains summary information about a workflow.
    */
  @js.native
  trait FlowTemplateSummary extends js.Object {
    var arn: js.UndefOr[Arn]
    var createdAt: js.UndefOr[Timestamp]
    var id: js.UndefOr[Urn]
    var revisionNumber: js.UndefOr[Version]
  }

  object FlowTemplateSummary {
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        id: js.UndefOr[Urn] = js.undefined,
        revisionNumber: js.UndefOr[Version] = js.undefined
    ): FlowTemplateSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.update("createdAt", __v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.update("id", __v.asInstanceOf[js.Any]))
      revisionNumber.foreach(__v => __obj.update("revisionNumber", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FlowTemplateSummary]
    }
  }

  @js.native
  trait GetEntitiesRequest extends js.Object {
    var ids: Urns
    var namespaceVersion: js.UndefOr[Version]
  }

  object GetEntitiesRequest {
    def apply(
        ids: Urns,
        namespaceVersion: js.UndefOr[Version] = js.undefined
    ): GetEntitiesRequest = {
      val __obj = js.Dictionary[js.Any](
        "ids" -> ids.asInstanceOf[js.Any]
      )

      namespaceVersion.foreach(__v => __obj.update("namespaceVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEntitiesRequest]
    }
  }

  @js.native
  trait GetEntitiesResponse extends js.Object {
    var descriptions: js.UndefOr[EntityDescriptions]
  }

  object GetEntitiesResponse {
    def apply(
        descriptions: js.UndefOr[EntityDescriptions] = js.undefined
    ): GetEntitiesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      descriptions.foreach(__v => __obj.update("descriptions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEntitiesResponse]
    }
  }

  @js.native
  trait GetFlowTemplateRequest extends js.Object {
    var id: Urn
    var revisionNumber: js.UndefOr[Version]
  }

  object GetFlowTemplateRequest {
    def apply(
        id: Urn,
        revisionNumber: js.UndefOr[Version] = js.undefined
    ): GetFlowTemplateRequest = {
      val __obj = js.Dictionary[js.Any](
        "id" -> id.asInstanceOf[js.Any]
      )

      revisionNumber.foreach(__v => __obj.update("revisionNumber", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFlowTemplateRequest]
    }
  }

  @js.native
  trait GetFlowTemplateResponse extends js.Object {
    var description: js.UndefOr[FlowTemplateDescription]
  }

  object GetFlowTemplateResponse {
    def apply(
        description: js.UndefOr[FlowTemplateDescription] = js.undefined
    ): GetFlowTemplateResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
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
    def apply(
        id: Urn,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetFlowTemplateRevisionsRequest = {
      val __obj = js.Dictionary[js.Any](
        "id" -> id.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFlowTemplateRevisionsRequest]
    }
  }

  @js.native
  trait GetFlowTemplateRevisionsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var summaries: js.UndefOr[FlowTemplateSummaries]
  }

  object GetFlowTemplateRevisionsResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        summaries: js.UndefOr[FlowTemplateSummaries] = js.undefined
    ): GetFlowTemplateRevisionsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      summaries.foreach(__v => __obj.update("summaries", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFlowTemplateRevisionsResponse]
    }
  }

  @js.native
  trait GetNamespaceDeletionStatusRequest extends js.Object {}

  object GetNamespaceDeletionStatusRequest {
    def apply(
        ): GetNamespaceDeletionStatusRequest = {
      val __obj = js.Dictionary.empty[js.Any]

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
    def apply(
        errorCode: js.UndefOr[NamespaceDeletionStatusErrorCodes] = js.undefined,
        errorMessage: js.UndefOr[String] = js.undefined,
        namespaceArn: js.UndefOr[Arn] = js.undefined,
        namespaceName: js.UndefOr[NamespaceName] = js.undefined,
        status: js.UndefOr[NamespaceDeletionStatus] = js.undefined
    ): GetNamespaceDeletionStatusResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      errorCode.foreach(__v => __obj.update("errorCode", __v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.update("errorMessage", __v.asInstanceOf[js.Any]))
      namespaceArn.foreach(__v => __obj.update("namespaceArn", __v.asInstanceOf[js.Any]))
      namespaceName.foreach(__v => __obj.update("namespaceName", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetNamespaceDeletionStatusResponse]
    }
  }

  @js.native
  trait GetSystemInstanceRequest extends js.Object {
    var id: Urn
  }

  object GetSystemInstanceRequest {
    def apply(
        id: Urn
    ): GetSystemInstanceRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        description: js.UndefOr[SystemInstanceDescription] = js.undefined
    ): GetSystemInstanceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSystemInstanceResponse]
    }
  }

  @js.native
  trait GetSystemTemplateRequest extends js.Object {
    var id: Urn
    var revisionNumber: js.UndefOr[Version]
  }

  object GetSystemTemplateRequest {
    def apply(
        id: Urn,
        revisionNumber: js.UndefOr[Version] = js.undefined
    ): GetSystemTemplateRequest = {
      val __obj = js.Dictionary[js.Any](
        "id" -> id.asInstanceOf[js.Any]
      )

      revisionNumber.foreach(__v => __obj.update("revisionNumber", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSystemTemplateRequest]
    }
  }

  @js.native
  trait GetSystemTemplateResponse extends js.Object {
    var description: js.UndefOr[SystemTemplateDescription]
  }

  object GetSystemTemplateResponse {
    def apply(
        description: js.UndefOr[SystemTemplateDescription] = js.undefined
    ): GetSystemTemplateResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
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
    def apply(
        id: Urn,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetSystemTemplateRevisionsRequest = {
      val __obj = js.Dictionary[js.Any](
        "id" -> id.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSystemTemplateRevisionsRequest]
    }
  }

  @js.native
  trait GetSystemTemplateRevisionsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var summaries: js.UndefOr[SystemTemplateSummaries]
  }

  object GetSystemTemplateRevisionsResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        summaries: js.UndefOr[SystemTemplateSummaries] = js.undefined
    ): GetSystemTemplateRevisionsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      summaries.foreach(__v => __obj.update("summaries", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSystemTemplateRevisionsResponse]
    }
  }

  @js.native
  trait GetUploadStatusRequest extends js.Object {
    var uploadId: UploadId
  }

  object GetUploadStatusRequest {
    def apply(
        uploadId: UploadId
    ): GetUploadStatusRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        createdDate: Timestamp,
        uploadId: UploadId,
        uploadStatus: UploadStatus,
        failureReason: js.UndefOr[StringList] = js.undefined,
        namespaceArn: js.UndefOr[Arn] = js.undefined,
        namespaceName: js.UndefOr[NamespaceName] = js.undefined,
        namespaceVersion: js.UndefOr[Version] = js.undefined
    ): GetUploadStatusResponse = {
      val __obj = js.Dictionary[js.Any](
        "createdDate"  -> createdDate.asInstanceOf[js.Any],
        "uploadId"     -> uploadId.asInstanceOf[js.Any],
        "uploadStatus" -> uploadStatus.asInstanceOf[js.Any]
      )

      failureReason.foreach(__v => __obj.update("failureReason", __v.asInstanceOf[js.Any]))
      namespaceArn.foreach(__v => __obj.update("namespaceArn", __v.asInstanceOf[js.Any]))
      namespaceName.foreach(__v => __obj.update("namespaceName", __v.asInstanceOf[js.Any]))
      namespaceVersion.foreach(__v => __obj.update("namespaceVersion", __v.asInstanceOf[js.Any]))
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
    def apply(
        flowExecutionId: FlowExecutionId,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFlowExecutionMessagesRequest = {
      val __obj = js.Dictionary[js.Any](
        "flowExecutionId" -> flowExecutionId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFlowExecutionMessagesRequest]
    }
  }

  @js.native
  trait ListFlowExecutionMessagesResponse extends js.Object {
    var messages: js.UndefOr[FlowExecutionMessages]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListFlowExecutionMessagesResponse {
    def apply(
        messages: js.UndefOr[FlowExecutionMessages] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFlowExecutionMessagesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      messages.foreach(__v => __obj.update("messages", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        resourceArn: ResourceArn,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTagsForResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /**
    * An object that specifies whether cloud metrics are collected in a deployment and, if so, what role is used to collect metrics.
    */
  @js.native
  trait MetricsConfiguration extends js.Object {
    var cloudMetricEnabled: js.UndefOr[Enabled]
    var metricRuleRoleArn: js.UndefOr[RoleArn]
  }

  object MetricsConfiguration {
    def apply(
        cloudMetricEnabled: js.UndefOr[Enabled] = js.undefined,
        metricRuleRoleArn: js.UndefOr[RoleArn] = js.undefined
    ): MetricsConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      cloudMetricEnabled.foreach(__v => __obj.update("cloudMetricEnabled", __v.asInstanceOf[js.Any]))
      metricRuleRoleArn.foreach(__v => __obj.update("metricRuleRoleArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricsConfiguration]
    }
  }

  object NamespaceDeletionStatusEnum {
    val IN_PROGRESS = "IN_PROGRESS"
    val SUCCEEDED   = "SUCCEEDED"
    val FAILED      = "FAILED"

    val values = js.Object.freeze(js.Array(IN_PROGRESS, SUCCEEDED, FAILED))
  }

  object NamespaceDeletionStatusErrorCodesEnum {
    val VALIDATION_FAILED = "VALIDATION_FAILED"

    val values = js.Object.freeze(js.Array(VALIDATION_FAILED))
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
    def apply(
        entityTypes: EntityTypes,
        filters: js.UndefOr[EntityFilters] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        namespaceVersion: js.UndefOr[Version] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): SearchEntitiesRequest = {
      val __obj = js.Dictionary[js.Any](
        "entityTypes" -> entityTypes.asInstanceOf[js.Any]
      )

      filters.foreach(__v => __obj.update("filters", __v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      namespaceVersion.foreach(__v => __obj.update("namespaceVersion", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchEntitiesRequest]
    }
  }

  @js.native
  trait SearchEntitiesResponse extends js.Object {
    var descriptions: js.UndefOr[EntityDescriptions]
    var nextToken: js.UndefOr[NextToken]
  }

  object SearchEntitiesResponse {
    def apply(
        descriptions: js.UndefOr[EntityDescriptions] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): SearchEntitiesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      descriptions.foreach(__v => __obj.update("descriptions", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        systemInstanceId: Urn,
        endTime: js.UndefOr[Timestamp] = js.undefined,
        flowExecutionId: js.UndefOr[FlowExecutionId] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        startTime: js.UndefOr[Timestamp] = js.undefined
    ): SearchFlowExecutionsRequest = {
      val __obj = js.Dictionary[js.Any](
        "systemInstanceId" -> systemInstanceId.asInstanceOf[js.Any]
      )

      endTime.foreach(__v => __obj.update("endTime", __v.asInstanceOf[js.Any]))
      flowExecutionId.foreach(__v => __obj.update("flowExecutionId", __v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.update("startTime", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchFlowExecutionsRequest]
    }
  }

  @js.native
  trait SearchFlowExecutionsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var summaries: js.UndefOr[FlowExecutionSummaries]
  }

  object SearchFlowExecutionsResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        summaries: js.UndefOr[FlowExecutionSummaries] = js.undefined
    ): SearchFlowExecutionsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      summaries.foreach(__v => __obj.update("summaries", __v.asInstanceOf[js.Any]))
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
    def apply(
        filters: js.UndefOr[FlowTemplateFilters] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): SearchFlowTemplatesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      filters.foreach(__v => __obj.update("filters", __v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchFlowTemplatesRequest]
    }
  }

  @js.native
  trait SearchFlowTemplatesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var summaries: js.UndefOr[FlowTemplateSummaries]
  }

  object SearchFlowTemplatesResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        summaries: js.UndefOr[FlowTemplateSummaries] = js.undefined
    ): SearchFlowTemplatesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      summaries.foreach(__v => __obj.update("summaries", __v.asInstanceOf[js.Any]))
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
    def apply(
        filters: js.UndefOr[SystemInstanceFilters] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): SearchSystemInstancesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      filters.foreach(__v => __obj.update("filters", __v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchSystemInstancesRequest]
    }
  }

  @js.native
  trait SearchSystemInstancesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var summaries: js.UndefOr[SystemInstanceSummaries]
  }

  object SearchSystemInstancesResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        summaries: js.UndefOr[SystemInstanceSummaries] = js.undefined
    ): SearchSystemInstancesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      summaries.foreach(__v => __obj.update("summaries", __v.asInstanceOf[js.Any]))
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
    def apply(
        filters: js.UndefOr[SystemTemplateFilters] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): SearchSystemTemplatesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      filters.foreach(__v => __obj.update("filters", __v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchSystemTemplatesRequest]
    }
  }

  @js.native
  trait SearchSystemTemplatesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var summaries: js.UndefOr[SystemTemplateSummaries]
  }

  object SearchSystemTemplatesResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        summaries: js.UndefOr[SystemTemplateSummaries] = js.undefined
    ): SearchSystemTemplatesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      summaries.foreach(__v => __obj.update("summaries", __v.asInstanceOf[js.Any]))
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
    def apply(
        entityId: Urn,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        namespaceVersion: js.UndefOr[Version] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): SearchThingsRequest = {
      val __obj = js.Dictionary[js.Any](
        "entityId" -> entityId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      namespaceVersion.foreach(__v => __obj.update("namespaceVersion", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchThingsRequest]
    }
  }

  @js.native
  trait SearchThingsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var things: js.UndefOr[Things]
  }

  object SearchThingsResponse {
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        things: js.UndefOr[Things] = js.undefined
    ): SearchThingsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      things.foreach(__v => __obj.update("things", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchThingsResponse]
    }
  }

  object SystemInstanceDeploymentStatusEnum {
    val NOT_DEPLOYED         = "NOT_DEPLOYED"
    val BOOTSTRAP            = "BOOTSTRAP"
    val DEPLOY_IN_PROGRESS   = "DEPLOY_IN_PROGRESS"
    val DEPLOYED_IN_TARGET   = "DEPLOYED_IN_TARGET"
    val UNDEPLOY_IN_PROGRESS = "UNDEPLOY_IN_PROGRESS"
    val FAILED               = "FAILED"
    val PENDING_DELETE       = "PENDING_DELETE"
    val DELETED_IN_TARGET    = "DELETED_IN_TARGET"

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
    def apply(
        definition: js.UndefOr[DefinitionDocument] = js.undefined,
        flowActionsRoleArn: js.UndefOr[RoleArn] = js.undefined,
        metricsConfiguration: js.UndefOr[MetricsConfiguration] = js.undefined,
        s3BucketName: js.UndefOr[S3BucketName] = js.undefined,
        summary: js.UndefOr[SystemInstanceSummary] = js.undefined,
        validatedDependencyRevisions: js.UndefOr[DependencyRevisions] = js.undefined,
        validatedNamespaceVersion: js.UndefOr[Version] = js.undefined
    ): SystemInstanceDescription = {
      val __obj = js.Dictionary.empty[js.Any]
      definition.foreach(__v => __obj.update("definition", __v.asInstanceOf[js.Any]))
      flowActionsRoleArn.foreach(__v => __obj.update("flowActionsRoleArn", __v.asInstanceOf[js.Any]))
      metricsConfiguration.foreach(__v => __obj.update("metricsConfiguration", __v.asInstanceOf[js.Any]))
      s3BucketName.foreach(__v => __obj.update("s3BucketName", __v.asInstanceOf[js.Any]))
      summary.foreach(__v => __obj.update("summary", __v.asInstanceOf[js.Any]))
      validatedDependencyRevisions.foreach(
        __v => __obj.update("validatedDependencyRevisions", __v.asInstanceOf[js.Any])
      )
      validatedNamespaceVersion.foreach(__v => __obj.update("validatedNamespaceVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SystemInstanceDescription]
    }
  }

  /**
    * An object that filters a system instance search. Multiple filters function as OR criteria in the search. For example a search that includes a GREENGRASS_GROUP_NAME and a STATUS filter searches for system instances in the specified Greengrass group that have the specified status.
    */
  @js.native
  trait SystemInstanceFilter extends js.Object {
    var name: js.UndefOr[SystemInstanceFilterName]
    var value: js.UndefOr[SystemInstanceFilterValues]
  }

  object SystemInstanceFilter {
    def apply(
        name: js.UndefOr[SystemInstanceFilterName] = js.undefined,
        value: js.UndefOr[SystemInstanceFilterValues] = js.undefined
    ): SystemInstanceFilter = {
      val __obj = js.Dictionary.empty[js.Any]
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.update("value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SystemInstanceFilter]
    }
  }

  object SystemInstanceFilterNameEnum {
    val SYSTEM_TEMPLATE_ID    = "SYSTEM_TEMPLATE_ID"
    val STATUS                = "STATUS"
    val GREENGRASS_GROUP_NAME = "GREENGRASS_GROUP_NAME"

    val values = js.Object.freeze(js.Array(SYSTEM_TEMPLATE_ID, STATUS, GREENGRASS_GROUP_NAME))
  }

  /**
    * An object that contains summary information about a system instance.
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
      val __obj = js.Dictionary.empty[js.Any]
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.update("createdAt", __v.asInstanceOf[js.Any]))
      greengrassGroupId.foreach(__v => __obj.update("greengrassGroupId", __v.asInstanceOf[js.Any]))
      greengrassGroupName.foreach(__v => __obj.update("greengrassGroupName", __v.asInstanceOf[js.Any]))
      greengrassGroupVersionId.foreach(__v => __obj.update("greengrassGroupVersionId", __v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.update("id", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      target.foreach(__v => __obj.update("target", __v.asInstanceOf[js.Any]))
      updatedAt.foreach(__v => __obj.update("updatedAt", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SystemInstanceSummary]
    }
  }

  /**
    * An object that contains a system's definition document and summary information.
    */
  @js.native
  trait SystemTemplateDescription extends js.Object {
    var definition: js.UndefOr[DefinitionDocument]
    var summary: js.UndefOr[SystemTemplateSummary]
    var validatedNamespaceVersion: js.UndefOr[Version]
  }

  object SystemTemplateDescription {
    def apply(
        definition: js.UndefOr[DefinitionDocument] = js.undefined,
        summary: js.UndefOr[SystemTemplateSummary] = js.undefined,
        validatedNamespaceVersion: js.UndefOr[Version] = js.undefined
    ): SystemTemplateDescription = {
      val __obj = js.Dictionary.empty[js.Any]
      definition.foreach(__v => __obj.update("definition", __v.asInstanceOf[js.Any]))
      summary.foreach(__v => __obj.update("summary", __v.asInstanceOf[js.Any]))
      validatedNamespaceVersion.foreach(__v => __obj.update("validatedNamespaceVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SystemTemplateDescription]
    }
  }

  /**
    * An object that filters a system search.
    */
  @js.native
  trait SystemTemplateFilter extends js.Object {
    var name: SystemTemplateFilterName
    var value: SystemTemplateFilterValues
  }

  object SystemTemplateFilter {
    def apply(
        name: SystemTemplateFilterName,
        value: SystemTemplateFilterValues
    ): SystemTemplateFilter = {
      val __obj = js.Dictionary[js.Any](
        "name"  -> name.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SystemTemplateFilter]
    }
  }

  object SystemTemplateFilterNameEnum {
    val FLOW_TEMPLATE_ID = "FLOW_TEMPLATE_ID"

    val values = js.Object.freeze(js.Array(FLOW_TEMPLATE_ID))
  }

  /**
    * An object that contains information about a system.
    */
  @js.native
  trait SystemTemplateSummary extends js.Object {
    var arn: js.UndefOr[Arn]
    var createdAt: js.UndefOr[Timestamp]
    var id: js.UndefOr[Urn]
    var revisionNumber: js.UndefOr[Version]
  }

  object SystemTemplateSummary {
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        id: js.UndefOr[Urn] = js.undefined,
        revisionNumber: js.UndefOr[Version] = js.undefined
    ): SystemTemplateSummary = {
      val __obj = js.Dictionary.empty[js.Any]
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.update("createdAt", __v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.update("id", __v.asInstanceOf[js.Any]))
      revisionNumber.foreach(__v => __obj.update("revisionNumber", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SystemTemplateSummary]
    }
  }

  /**
    * Metadata assigned to an AWS IoT Things Graph resource consisting of a key-value pair.
    */
  @js.native
  trait Tag extends js.Object {
    var key: TagKey
    var value: TagValue
  }

  object Tag {
    def apply(
        key: TagKey,
        value: TagValue
    ): Tag = {
      val __obj = js.Dictionary[js.Any](
        "key"   -> key.asInstanceOf[js.Any],
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
    def apply(
        resourceArn: ResourceArn,
        tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags"        -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    def apply(
        ): TagResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /**
    * An AWS IoT thing.
    */
  @js.native
  trait Thing extends js.Object {
    var thingArn: js.UndefOr[ThingArn]
    var thingName: js.UndefOr[ThingName]
  }

  object Thing {
    def apply(
        thingArn: js.UndefOr[ThingArn] = js.undefined,
        thingName: js.UndefOr[ThingName] = js.undefined
    ): Thing = {
      val __obj = js.Dictionary.empty[js.Any]
      thingArn.foreach(__v => __obj.update("thingArn", __v.asInstanceOf[js.Any]))
      thingName.foreach(__v => __obj.update("thingName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Thing]
    }
  }

  @js.native
  trait UndeploySystemInstanceRequest extends js.Object {
    var id: js.UndefOr[Urn]
  }

  object UndeploySystemInstanceRequest {
    def apply(
        id: js.UndefOr[Urn] = js.undefined
    ): UndeploySystemInstanceRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      id.foreach(__v => __obj.update("id", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UndeploySystemInstanceRequest]
    }
  }

  @js.native
  trait UndeploySystemInstanceResponse extends js.Object {
    var summary: js.UndefOr[SystemInstanceSummary]
  }

  object UndeploySystemInstanceResponse {
    def apply(
        summary: js.UndefOr[SystemInstanceSummary] = js.undefined
    ): UndeploySystemInstanceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      summary.foreach(__v => __obj.update("summary", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UndeploySystemInstanceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    def apply(
        resourceArn: ResourceArn,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys"     -> tagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    def apply(
        ): UntagResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

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
    def apply(
        definition: DefinitionDocument,
        id: Urn,
        compatibleNamespaceVersion: js.UndefOr[Version] = js.undefined
    ): UpdateFlowTemplateRequest = {
      val __obj = js.Dictionary[js.Any](
        "definition" -> definition.asInstanceOf[js.Any],
        "id"         -> id.asInstanceOf[js.Any]
      )

      compatibleNamespaceVersion.foreach(__v => __obj.update("compatibleNamespaceVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFlowTemplateRequest]
    }
  }

  @js.native
  trait UpdateFlowTemplateResponse extends js.Object {
    var summary: js.UndefOr[FlowTemplateSummary]
  }

  object UpdateFlowTemplateResponse {
    def apply(
        summary: js.UndefOr[FlowTemplateSummary] = js.undefined
    ): UpdateFlowTemplateResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      summary.foreach(__v => __obj.update("summary", __v.asInstanceOf[js.Any]))
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
    def apply(
        definition: DefinitionDocument,
        id: Urn,
        compatibleNamespaceVersion: js.UndefOr[Version] = js.undefined
    ): UpdateSystemTemplateRequest = {
      val __obj = js.Dictionary[js.Any](
        "definition" -> definition.asInstanceOf[js.Any],
        "id"         -> id.asInstanceOf[js.Any]
      )

      compatibleNamespaceVersion.foreach(__v => __obj.update("compatibleNamespaceVersion", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSystemTemplateRequest]
    }
  }

  @js.native
  trait UpdateSystemTemplateResponse extends js.Object {
    var summary: js.UndefOr[SystemTemplateSummary]
  }

  object UpdateSystemTemplateResponse {
    def apply(
        summary: js.UndefOr[SystemTemplateSummary] = js.undefined
    ): UpdateSystemTemplateResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      summary.foreach(__v => __obj.update("summary", __v.asInstanceOf[js.Any]))
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
    def apply(
        deprecateExistingEntities: js.UndefOr[DeprecateExistingEntities] = js.undefined,
        document: js.UndefOr[DefinitionDocument] = js.undefined,
        syncWithPublicNamespace: js.UndefOr[SyncWithPublicNamespace] = js.undefined
    ): UploadEntityDefinitionsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      deprecateExistingEntities.foreach(__v => __obj.update("deprecateExistingEntities", __v.asInstanceOf[js.Any]))
      document.foreach(__v => __obj.update("document", __v.asInstanceOf[js.Any]))
      syncWithPublicNamespace.foreach(__v => __obj.update("syncWithPublicNamespace", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UploadEntityDefinitionsRequest]
    }
  }

  @js.native
  trait UploadEntityDefinitionsResponse extends js.Object {
    var uploadId: UploadId
  }

  object UploadEntityDefinitionsResponse {
    def apply(
        uploadId: UploadId
    ): UploadEntityDefinitionsResponse = {
      val __obj = js.Dictionary[js.Any](
        "uploadId" -> uploadId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UploadEntityDefinitionsResponse]
    }
  }

  object UploadStatusEnum {
    val IN_PROGRESS = "IN_PROGRESS"
    val SUCCEEDED   = "SUCCEEDED"
    val FAILED      = "FAILED"

    val values = js.Object.freeze(js.Array(IN_PROGRESS, SUCCEEDED, FAILED))
  }
}
