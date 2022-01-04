package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object iottwinmaker {
  type ComponentTypeId = String
  type ComponentTypeSummaries = js.Array[ComponentTypeSummary]
  type ComponentUpdatesMapRequest = js.Dictionary[ComponentUpdateRequest]
  type ComponentsMap = js.Dictionary[ComponentResponse]
  type ComponentsMapRequest = js.Dictionary[ComponentRequest]
  type Configuration = js.Dictionary[Value]
  type DataValueList = js.Array[DataValue]
  type DataValueMap = js.Dictionary[DataValue]
  type Description = String
  type EntityId = String
  type EntityName = String
  type EntitySummaries = js.Array[EntitySummary]
  type Entries = js.Array[PropertyValueEntry]
  type ErrorEntries = js.Array[BatchPutPropertyErrorEntry]
  type ErrorMessage = String
  type Errors = js.Array[BatchPutPropertyError]
  type Expression = String
  type ExtendsFrom = js.Array[ComponentTypeId]
  type ExternalIdProperty = js.Dictionary[String]
  type FunctionsRequest = js.Dictionary[FunctionRequest]
  type FunctionsResponse = js.Dictionary[FunctionResponse]
  type Id = String
  type IdOrArn = String
  type IntervalInSeconds = Double
  type LambdaArn = String
  type ListComponentTypesFilters = js.Array[ListComponentTypesFilter]
  type ListEntitiesFilters = js.Array[ListEntitiesFilter]
  type MaxResults = Int
  type Name = String
  type NextToken = String
  type ParentEntityId = String
  type PropertyDefinitionsRequest = js.Dictionary[PropertyDefinitionRequest]
  type PropertyDefinitionsResponse = js.Dictionary[PropertyDefinitionResponse]
  type PropertyFilters = js.Array[PropertyFilter]
  type PropertyLatestValueMap = js.Dictionary[PropertyLatestValue]
  type PropertyRequests = js.Dictionary[PropertyRequest]
  type PropertyResponses = js.Dictionary[PropertyResponse]
  type PropertyValueList = js.Array[PropertyValueHistory]
  type PropertyValues = js.Array[PropertyValue]
  type RequiredProperties = js.Array[Name]
  type RoleArn = String
  type S3Location = String
  type S3Url = String
  type SceneCapabilities = js.Array[SceneCapability]
  type SceneCapability = String
  type SceneSummaries = js.Array[SceneSummary]
  type SelectedPropertyList = js.Array[String]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type Timestamp = js.Date
  type TwinMakerArn = String
  type Value = String
  type Values = js.Array[PropertyValue]
  type WorkspaceSummaries = js.Array[WorkspaceSummary]

  final class IoTTwinMakerOps(private val service: IoTTwinMaker) extends AnyVal {

    @inline def batchPutPropertyValuesFuture(params: BatchPutPropertyValuesRequest): Future[BatchPutPropertyValuesResponse] = service.batchPutPropertyValues(params).promise().toFuture
    @inline def createComponentTypeFuture(params: CreateComponentTypeRequest): Future[CreateComponentTypeResponse] = service.createComponentType(params).promise().toFuture
    @inline def createEntityFuture(params: CreateEntityRequest): Future[CreateEntityResponse] = service.createEntity(params).promise().toFuture
    @inline def createSceneFuture(params: CreateSceneRequest): Future[CreateSceneResponse] = service.createScene(params).promise().toFuture
    @inline def createWorkspaceFuture(params: CreateWorkspaceRequest): Future[CreateWorkspaceResponse] = service.createWorkspace(params).promise().toFuture
    @inline def deleteComponentTypeFuture(params: DeleteComponentTypeRequest): Future[DeleteComponentTypeResponse] = service.deleteComponentType(params).promise().toFuture
    @inline def deleteEntityFuture(params: DeleteEntityRequest): Future[DeleteEntityResponse] = service.deleteEntity(params).promise().toFuture
    @inline def deleteSceneFuture(params: DeleteSceneRequest): Future[DeleteSceneResponse] = service.deleteScene(params).promise().toFuture
    @inline def deleteWorkspaceFuture(params: DeleteWorkspaceRequest): Future[DeleteWorkspaceResponse] = service.deleteWorkspace(params).promise().toFuture
    @inline def getComponentTypeFuture(params: GetComponentTypeRequest): Future[GetComponentTypeResponse] = service.getComponentType(params).promise().toFuture
    @inline def getEntityFuture(params: GetEntityRequest): Future[GetEntityResponse] = service.getEntity(params).promise().toFuture
    @inline def getPropertyValueFuture(params: GetPropertyValueRequest): Future[GetPropertyValueResponse] = service.getPropertyValue(params).promise().toFuture
    @inline def getPropertyValueHistoryFuture(params: GetPropertyValueHistoryRequest): Future[GetPropertyValueHistoryResponse] = service.getPropertyValueHistory(params).promise().toFuture
    @inline def getSceneFuture(params: GetSceneRequest): Future[GetSceneResponse] = service.getScene(params).promise().toFuture
    @inline def getWorkspaceFuture(params: GetWorkspaceRequest): Future[GetWorkspaceResponse] = service.getWorkspace(params).promise().toFuture
    @inline def listComponentTypesFuture(params: ListComponentTypesRequest): Future[ListComponentTypesResponse] = service.listComponentTypes(params).promise().toFuture
    @inline def listEntitiesFuture(params: ListEntitiesRequest): Future[ListEntitiesResponse] = service.listEntities(params).promise().toFuture
    @inline def listScenesFuture(params: ListScenesRequest): Future[ListScenesResponse] = service.listScenes(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listWorkspacesFuture(params: ListWorkspacesRequest): Future[ListWorkspacesResponse] = service.listWorkspaces(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateComponentTypeFuture(params: UpdateComponentTypeRequest): Future[UpdateComponentTypeResponse] = service.updateComponentType(params).promise().toFuture
    @inline def updateEntityFuture(params: UpdateEntityRequest): Future[UpdateEntityResponse] = service.updateEntity(params).promise().toFuture
    @inline def updateSceneFuture(params: UpdateSceneRequest): Future[UpdateSceneResponse] = service.updateScene(params).promise().toFuture
    @inline def updateWorkspaceFuture(params: UpdateWorkspaceRequest): Future[UpdateWorkspaceResponse] = service.updateWorkspace(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/iottwinmaker", JSImport.Namespace, "AWS.IoTTwinMaker")
  class IoTTwinMaker() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchPutPropertyValues(params: BatchPutPropertyValuesRequest): Request[BatchPutPropertyValuesResponse] = js.native
    def createComponentType(params: CreateComponentTypeRequest): Request[CreateComponentTypeResponse] = js.native
    def createEntity(params: CreateEntityRequest): Request[CreateEntityResponse] = js.native
    def createScene(params: CreateSceneRequest): Request[CreateSceneResponse] = js.native
    def createWorkspace(params: CreateWorkspaceRequest): Request[CreateWorkspaceResponse] = js.native
    def deleteComponentType(params: DeleteComponentTypeRequest): Request[DeleteComponentTypeResponse] = js.native
    def deleteEntity(params: DeleteEntityRequest): Request[DeleteEntityResponse] = js.native
    def deleteScene(params: DeleteSceneRequest): Request[DeleteSceneResponse] = js.native
    def deleteWorkspace(params: DeleteWorkspaceRequest): Request[DeleteWorkspaceResponse] = js.native
    def getComponentType(params: GetComponentTypeRequest): Request[GetComponentTypeResponse] = js.native
    def getEntity(params: GetEntityRequest): Request[GetEntityResponse] = js.native
    def getPropertyValue(params: GetPropertyValueRequest): Request[GetPropertyValueResponse] = js.native
    def getPropertyValueHistory(params: GetPropertyValueHistoryRequest): Request[GetPropertyValueHistoryResponse] = js.native
    def getScene(params: GetSceneRequest): Request[GetSceneResponse] = js.native
    def getWorkspace(params: GetWorkspaceRequest): Request[GetWorkspaceResponse] = js.native
    def listComponentTypes(params: ListComponentTypesRequest): Request[ListComponentTypesResponse] = js.native
    def listEntities(params: ListEntitiesRequest): Request[ListEntitiesResponse] = js.native
    def listScenes(params: ListScenesRequest): Request[ListScenesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listWorkspaces(params: ListWorkspacesRequest): Request[ListWorkspacesResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateComponentType(params: UpdateComponentTypeRequest): Request[UpdateComponentTypeResponse] = js.native
    def updateEntity(params: UpdateEntityRequest): Request[UpdateEntityResponse] = js.native
    def updateScene(params: UpdateSceneRequest): Request[UpdateSceneResponse] = js.native
    def updateWorkspace(params: UpdateWorkspaceRequest): Request[UpdateWorkspaceResponse] = js.native
  }
  object IoTTwinMaker {
    @inline implicit def toOps(service: IoTTwinMaker): IoTTwinMakerOps = {
      new IoTTwinMakerOps(service)
    }
  }

  /** An error returned by the <code>BatchPutProperty</code> action.
    */
  @js.native
  trait BatchPutPropertyError extends js.Object {
    var entry: PropertyValueEntry
    var errorCode: String
    var errorMessage: String
  }

  object BatchPutPropertyError {
    @inline
    def apply(
        entry: PropertyValueEntry,
        errorCode: String,
        errorMessage: String
    ): BatchPutPropertyError = {
      val __obj = js.Dynamic.literal(
        "entry" -> entry.asInstanceOf[js.Any],
        "errorCode" -> errorCode.asInstanceOf[js.Any],
        "errorMessage" -> errorMessage.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchPutPropertyError]
    }
  }

  /** An object that contains information about errors returned by the <code>BatchPutProperty</code> action.
    */
  @js.native
  trait BatchPutPropertyErrorEntry extends js.Object {
    var errors: Errors
  }

  object BatchPutPropertyErrorEntry {
    @inline
    def apply(
        errors: Errors
    ): BatchPutPropertyErrorEntry = {
      val __obj = js.Dynamic.literal(
        "errors" -> errors.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchPutPropertyErrorEntry]
    }
  }

  @js.native
  trait BatchPutPropertyValuesRequest extends js.Object {
    var entries: Entries
    var workspaceId: Id
  }

  object BatchPutPropertyValuesRequest {
    @inline
    def apply(
        entries: Entries,
        workspaceId: Id
    ): BatchPutPropertyValuesRequest = {
      val __obj = js.Dynamic.literal(
        "entries" -> entries.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchPutPropertyValuesRequest]
    }
  }

  @js.native
  trait BatchPutPropertyValuesResponse extends js.Object {
    var errorEntries: ErrorEntries
  }

  object BatchPutPropertyValuesResponse {
    @inline
    def apply(
        errorEntries: ErrorEntries
    ): BatchPutPropertyValuesResponse = {
      val __obj = js.Dynamic.literal(
        "errorEntries" -> errorEntries.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchPutPropertyValuesResponse]
    }
  }

  /** An object that sets information about a component type create or update request.
    */
  @js.native
  trait ComponentRequest extends js.Object {
    var componentTypeId: js.UndefOr[ComponentTypeId]
    var description: js.UndefOr[Description]
    var properties: js.UndefOr[PropertyRequests]
  }

  object ComponentRequest {
    @inline
    def apply(
        componentTypeId: js.UndefOr[ComponentTypeId] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        properties: js.UndefOr[PropertyRequests] = js.undefined
    ): ComponentRequest = {
      val __obj = js.Dynamic.literal()
      componentTypeId.foreach(__v => __obj.updateDynamic("componentTypeId")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      properties.foreach(__v => __obj.updateDynamic("properties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComponentRequest]
    }
  }

  /** An object that returns information about a component type create or update request.
    */
  @js.native
  trait ComponentResponse extends js.Object {
    var componentName: js.UndefOr[Name]
    var componentTypeId: js.UndefOr[ComponentTypeId]
    var definedIn: js.UndefOr[String]
    var description: js.UndefOr[Description]
    var properties: js.UndefOr[PropertyResponses]
    var status: js.UndefOr[Status]
  }

  object ComponentResponse {
    @inline
    def apply(
        componentName: js.UndefOr[Name] = js.undefined,
        componentTypeId: js.UndefOr[ComponentTypeId] = js.undefined,
        definedIn: js.UndefOr[String] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        properties: js.UndefOr[PropertyResponses] = js.undefined,
        status: js.UndefOr[Status] = js.undefined
    ): ComponentResponse = {
      val __obj = js.Dynamic.literal()
      componentName.foreach(__v => __obj.updateDynamic("componentName")(__v.asInstanceOf[js.Any]))
      componentTypeId.foreach(__v => __obj.updateDynamic("componentTypeId")(__v.asInstanceOf[js.Any]))
      definedIn.foreach(__v => __obj.updateDynamic("definedIn")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      properties.foreach(__v => __obj.updateDynamic("properties")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComponentResponse]
    }
  }

  /** An object that contains information about a component type.
    */
  @js.native
  trait ComponentTypeSummary extends js.Object {
    var arn: TwinMakerArn
    var componentTypeId: ComponentTypeId
    var creationDateTime: Timestamp
    var updateDateTime: Timestamp
    var description: js.UndefOr[Description]
    var status: js.UndefOr[Status]
  }

  object ComponentTypeSummary {
    @inline
    def apply(
        arn: TwinMakerArn,
        componentTypeId: ComponentTypeId,
        creationDateTime: Timestamp,
        updateDateTime: Timestamp,
        description: js.UndefOr[Description] = js.undefined,
        status: js.UndefOr[Status] = js.undefined
    ): ComponentTypeSummary = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "componentTypeId" -> componentTypeId.asInstanceOf[js.Any],
        "creationDateTime" -> creationDateTime.asInstanceOf[js.Any],
        "updateDateTime" -> updateDateTime.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComponentTypeSummary]
    }
  }

  /** The component update request.
    */
  @js.native
  trait ComponentUpdateRequest extends js.Object {
    var componentTypeId: js.UndefOr[ComponentTypeId]
    var description: js.UndefOr[Description]
    var propertyUpdates: js.UndefOr[PropertyRequests]
    var updateType: js.UndefOr[ComponentUpdateType]
  }

  object ComponentUpdateRequest {
    @inline
    def apply(
        componentTypeId: js.UndefOr[ComponentTypeId] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        propertyUpdates: js.UndefOr[PropertyRequests] = js.undefined,
        updateType: js.UndefOr[ComponentUpdateType] = js.undefined
    ): ComponentUpdateRequest = {
      val __obj = js.Dynamic.literal()
      componentTypeId.foreach(__v => __obj.updateDynamic("componentTypeId")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      propertyUpdates.foreach(__v => __obj.updateDynamic("propertyUpdates")(__v.asInstanceOf[js.Any]))
      updateType.foreach(__v => __obj.updateDynamic("updateType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComponentUpdateRequest]
    }
  }

  @js.native
  trait CreateComponentTypeRequest extends js.Object {
    var componentTypeId: ComponentTypeId
    var workspaceId: Id
    var description: js.UndefOr[Description]
    var extendsFrom: js.UndefOr[ExtendsFrom]
    var functions: js.UndefOr[FunctionsRequest]
    var isSingleton: js.UndefOr[Boolean]
    var propertyDefinitions: js.UndefOr[PropertyDefinitionsRequest]
    var tags: js.UndefOr[TagMap]
  }

  object CreateComponentTypeRequest {
    @inline
    def apply(
        componentTypeId: ComponentTypeId,
        workspaceId: Id,
        description: js.UndefOr[Description] = js.undefined,
        extendsFrom: js.UndefOr[ExtendsFrom] = js.undefined,
        functions: js.UndefOr[FunctionsRequest] = js.undefined,
        isSingleton: js.UndefOr[Boolean] = js.undefined,
        propertyDefinitions: js.UndefOr[PropertyDefinitionsRequest] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateComponentTypeRequest = {
      val __obj = js.Dynamic.literal(
        "componentTypeId" -> componentTypeId.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      extendsFrom.foreach(__v => __obj.updateDynamic("extendsFrom")(__v.asInstanceOf[js.Any]))
      functions.foreach(__v => __obj.updateDynamic("functions")(__v.asInstanceOf[js.Any]))
      isSingleton.foreach(__v => __obj.updateDynamic("isSingleton")(__v.asInstanceOf[js.Any]))
      propertyDefinitions.foreach(__v => __obj.updateDynamic("propertyDefinitions")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateComponentTypeRequest]
    }
  }

  @js.native
  trait CreateComponentTypeResponse extends js.Object {
    var arn: TwinMakerArn
    var creationDateTime: Timestamp
    var state: State
  }

  object CreateComponentTypeResponse {
    @inline
    def apply(
        arn: TwinMakerArn,
        creationDateTime: Timestamp,
        state: State
    ): CreateComponentTypeResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "creationDateTime" -> creationDateTime.asInstanceOf[js.Any],
        "state" -> state.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateComponentTypeResponse]
    }
  }

  @js.native
  trait CreateEntityRequest extends js.Object {
    var entityName: EntityName
    var workspaceId: Id
    var components: js.UndefOr[ComponentsMapRequest]
    var description: js.UndefOr[Description]
    var entityId: js.UndefOr[EntityId]
    var parentEntityId: js.UndefOr[ParentEntityId]
    var tags: js.UndefOr[TagMap]
  }

  object CreateEntityRequest {
    @inline
    def apply(
        entityName: EntityName,
        workspaceId: Id,
        components: js.UndefOr[ComponentsMapRequest] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        entityId: js.UndefOr[EntityId] = js.undefined,
        parentEntityId: js.UndefOr[ParentEntityId] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateEntityRequest = {
      val __obj = js.Dynamic.literal(
        "entityName" -> entityName.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      components.foreach(__v => __obj.updateDynamic("components")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      entityId.foreach(__v => __obj.updateDynamic("entityId")(__v.asInstanceOf[js.Any]))
      parentEntityId.foreach(__v => __obj.updateDynamic("parentEntityId")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEntityRequest]
    }
  }

  @js.native
  trait CreateEntityResponse extends js.Object {
    var arn: TwinMakerArn
    var creationDateTime: Timestamp
    var entityId: EntityId
    var state: State
  }

  object CreateEntityResponse {
    @inline
    def apply(
        arn: TwinMakerArn,
        creationDateTime: Timestamp,
        entityId: EntityId,
        state: State
    ): CreateEntityResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "creationDateTime" -> creationDateTime.asInstanceOf[js.Any],
        "entityId" -> entityId.asInstanceOf[js.Any],
        "state" -> state.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateEntityResponse]
    }
  }

  @js.native
  trait CreateSceneRequest extends js.Object {
    var contentLocation: S3Url
    var sceneId: Id
    var workspaceId: Id
    var capabilities: js.UndefOr[SceneCapabilities]
    var description: js.UndefOr[Description]
    var tags: js.UndefOr[TagMap]
  }

  object CreateSceneRequest {
    @inline
    def apply(
        contentLocation: S3Url,
        sceneId: Id,
        workspaceId: Id,
        capabilities: js.UndefOr[SceneCapabilities] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateSceneRequest = {
      val __obj = js.Dynamic.literal(
        "contentLocation" -> contentLocation.asInstanceOf[js.Any],
        "sceneId" -> sceneId.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      capabilities.foreach(__v => __obj.updateDynamic("capabilities")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSceneRequest]
    }
  }

  @js.native
  trait CreateSceneResponse extends js.Object {
    var arn: TwinMakerArn
    var creationDateTime: Timestamp
  }

  object CreateSceneResponse {
    @inline
    def apply(
        arn: TwinMakerArn,
        creationDateTime: Timestamp
    ): CreateSceneResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "creationDateTime" -> creationDateTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateSceneResponse]
    }
  }

  @js.native
  trait CreateWorkspaceRequest extends js.Object {
    var role: RoleArn
    var s3Location: S3Location
    var workspaceId: Id
    var description: js.UndefOr[Description]
    var tags: js.UndefOr[TagMap]
  }

  object CreateWorkspaceRequest {
    @inline
    def apply(
        role: RoleArn,
        s3Location: S3Location,
        workspaceId: Id,
        description: js.UndefOr[Description] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateWorkspaceRequest = {
      val __obj = js.Dynamic.literal(
        "role" -> role.asInstanceOf[js.Any],
        "s3Location" -> s3Location.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWorkspaceRequest]
    }
  }

  @js.native
  trait CreateWorkspaceResponse extends js.Object {
    var arn: TwinMakerArn
    var creationDateTime: Timestamp
  }

  object CreateWorkspaceResponse {
    @inline
    def apply(
        arn: TwinMakerArn,
        creationDateTime: Timestamp
    ): CreateWorkspaceResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "creationDateTime" -> creationDateTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateWorkspaceResponse]
    }
  }

  /** The data connector.
    */
  @js.native
  trait DataConnector extends js.Object {
    var isNative: js.UndefOr[Boolean]
    var lambda: js.UndefOr[LambdaFunction]
  }

  object DataConnector {
    @inline
    def apply(
        isNative: js.UndefOr[Boolean] = js.undefined,
        lambda: js.UndefOr[LambdaFunction] = js.undefined
    ): DataConnector = {
      val __obj = js.Dynamic.literal()
      isNative.foreach(__v => __obj.updateDynamic("isNative")(__v.asInstanceOf[js.Any]))
      lambda.foreach(__v => __obj.updateDynamic("lambda")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataConnector]
    }
  }

  /** An object that specifies the data type of a property.
    */
  @js.native
  trait DataType extends js.Object {
    var `type`: Type
    var allowedValues: js.UndefOr[DataValueList]
    var nestedType: js.UndefOr[DataType]
    var relationship: js.UndefOr[Relationship]
    var unitOfMeasure: js.UndefOr[String]
  }

  object DataType {
    @inline
    def apply(
        `type`: Type,
        allowedValues: js.UndefOr[DataValueList] = js.undefined,
        nestedType: js.UndefOr[DataType] = js.undefined,
        relationship: js.UndefOr[Relationship] = js.undefined,
        unitOfMeasure: js.UndefOr[String] = js.undefined
    ): DataType = {
      val __obj = js.Dynamic.literal(
        "type" -> `type`.asInstanceOf[js.Any]
      )

      allowedValues.foreach(__v => __obj.updateDynamic("allowedValues")(__v.asInstanceOf[js.Any]))
      nestedType.foreach(__v => __obj.updateDynamic("nestedType")(__v.asInstanceOf[js.Any]))
      relationship.foreach(__v => __obj.updateDynamic("relationship")(__v.asInstanceOf[js.Any]))
      unitOfMeasure.foreach(__v => __obj.updateDynamic("unitOfMeasure")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataType]
    }
  }

  /** An object that specifies a value for a property.
    */
  @js.native
  trait DataValue extends js.Object {
    var booleanValue: js.UndefOr[Boolean]
    var doubleValue: js.UndefOr[Double]
    var expression: js.UndefOr[Expression]
    var integerValue: js.UndefOr[Int]
    var listValue: js.UndefOr[DataValueList]
    var longValue: js.UndefOr[Double]
    var mapValue: js.UndefOr[DataValueMap]
    var relationshipValue: js.UndefOr[RelationshipValue]
    var stringValue: js.UndefOr[String]
  }

  object DataValue {
    @inline
    def apply(
        booleanValue: js.UndefOr[Boolean] = js.undefined,
        doubleValue: js.UndefOr[Double] = js.undefined,
        expression: js.UndefOr[Expression] = js.undefined,
        integerValue: js.UndefOr[Int] = js.undefined,
        listValue: js.UndefOr[DataValueList] = js.undefined,
        longValue: js.UndefOr[Double] = js.undefined,
        mapValue: js.UndefOr[DataValueMap] = js.undefined,
        relationshipValue: js.UndefOr[RelationshipValue] = js.undefined,
        stringValue: js.UndefOr[String] = js.undefined
    ): DataValue = {
      val __obj = js.Dynamic.literal()
      booleanValue.foreach(__v => __obj.updateDynamic("booleanValue")(__v.asInstanceOf[js.Any]))
      doubleValue.foreach(__v => __obj.updateDynamic("doubleValue")(__v.asInstanceOf[js.Any]))
      expression.foreach(__v => __obj.updateDynamic("expression")(__v.asInstanceOf[js.Any]))
      integerValue.foreach(__v => __obj.updateDynamic("integerValue")(__v.asInstanceOf[js.Any]))
      listValue.foreach(__v => __obj.updateDynamic("listValue")(__v.asInstanceOf[js.Any]))
      longValue.foreach(__v => __obj.updateDynamic("longValue")(__v.asInstanceOf[js.Any]))
      mapValue.foreach(__v => __obj.updateDynamic("mapValue")(__v.asInstanceOf[js.Any]))
      relationshipValue.foreach(__v => __obj.updateDynamic("relationshipValue")(__v.asInstanceOf[js.Any]))
      stringValue.foreach(__v => __obj.updateDynamic("stringValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataValue]
    }
  }

  @js.native
  trait DeleteComponentTypeRequest extends js.Object {
    var componentTypeId: ComponentTypeId
    var workspaceId: Id
  }

  object DeleteComponentTypeRequest {
    @inline
    def apply(
        componentTypeId: ComponentTypeId,
        workspaceId: Id
    ): DeleteComponentTypeRequest = {
      val __obj = js.Dynamic.literal(
        "componentTypeId" -> componentTypeId.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteComponentTypeRequest]
    }
  }

  @js.native
  trait DeleteComponentTypeResponse extends js.Object {
    var state: State
  }

  object DeleteComponentTypeResponse {
    @inline
    def apply(
        state: State
    ): DeleteComponentTypeResponse = {
      val __obj = js.Dynamic.literal(
        "state" -> state.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteComponentTypeResponse]
    }
  }

  @js.native
  trait DeleteEntityRequest extends js.Object {
    var entityId: EntityId
    var workspaceId: Id
    var isRecursive: js.UndefOr[Boolean]
  }

  object DeleteEntityRequest {
    @inline
    def apply(
        entityId: EntityId,
        workspaceId: Id,
        isRecursive: js.UndefOr[Boolean] = js.undefined
    ): DeleteEntityRequest = {
      val __obj = js.Dynamic.literal(
        "entityId" -> entityId.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      isRecursive.foreach(__v => __obj.updateDynamic("isRecursive")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteEntityRequest]
    }
  }

  @js.native
  trait DeleteEntityResponse extends js.Object {
    var state: State
  }

  object DeleteEntityResponse {
    @inline
    def apply(
        state: State
    ): DeleteEntityResponse = {
      val __obj = js.Dynamic.literal(
        "state" -> state.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEntityResponse]
    }
  }

  @js.native
  trait DeleteSceneRequest extends js.Object {
    var sceneId: Id
    var workspaceId: Id
  }

  object DeleteSceneRequest {
    @inline
    def apply(
        sceneId: Id,
        workspaceId: Id
    ): DeleteSceneRequest = {
      val __obj = js.Dynamic.literal(
        "sceneId" -> sceneId.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSceneRequest]
    }
  }

  @js.native
  trait DeleteSceneResponse extends js.Object

  object DeleteSceneResponse {
    @inline
    def apply(): DeleteSceneResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteSceneResponse]
    }
  }

  @js.native
  trait DeleteWorkspaceRequest extends js.Object {
    var workspaceId: Id
  }

  object DeleteWorkspaceRequest {
    @inline
    def apply(
        workspaceId: Id
    ): DeleteWorkspaceRequest = {
      val __obj = js.Dynamic.literal(
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteWorkspaceRequest]
    }
  }

  @js.native
  trait DeleteWorkspaceResponse extends js.Object

  object DeleteWorkspaceResponse {
    @inline
    def apply(): DeleteWorkspaceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteWorkspaceResponse]
    }
  }

  /** An object that uniquely identifies an entity property.
    */
  @js.native
  trait EntityPropertyReference extends js.Object {
    var propertyName: Name
    var componentName: js.UndefOr[Name]
    var entityId: js.UndefOr[EntityId]
    var externalIdProperty: js.UndefOr[ExternalIdProperty]
  }

  object EntityPropertyReference {
    @inline
    def apply(
        propertyName: Name,
        componentName: js.UndefOr[Name] = js.undefined,
        entityId: js.UndefOr[EntityId] = js.undefined,
        externalIdProperty: js.UndefOr[ExternalIdProperty] = js.undefined
    ): EntityPropertyReference = {
      val __obj = js.Dynamic.literal(
        "propertyName" -> propertyName.asInstanceOf[js.Any]
      )

      componentName.foreach(__v => __obj.updateDynamic("componentName")(__v.asInstanceOf[js.Any]))
      entityId.foreach(__v => __obj.updateDynamic("entityId")(__v.asInstanceOf[js.Any]))
      externalIdProperty.foreach(__v => __obj.updateDynamic("externalIdProperty")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EntityPropertyReference]
    }
  }

  /** An object that contains information about an entity.
    */
  @js.native
  trait EntitySummary extends js.Object {
    var arn: TwinMakerArn
    var creationDateTime: Timestamp
    var entityId: EntityId
    var entityName: EntityName
    var status: Status
    var updateDateTime: Timestamp
    var description: js.UndefOr[Description]
    var hasChildEntities: js.UndefOr[Boolean]
    var parentEntityId: js.UndefOr[ParentEntityId]
  }

  object EntitySummary {
    @inline
    def apply(
        arn: TwinMakerArn,
        creationDateTime: Timestamp,
        entityId: EntityId,
        entityName: EntityName,
        status: Status,
        updateDateTime: Timestamp,
        description: js.UndefOr[Description] = js.undefined,
        hasChildEntities: js.UndefOr[Boolean] = js.undefined,
        parentEntityId: js.UndefOr[ParentEntityId] = js.undefined
    ): EntitySummary = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "creationDateTime" -> creationDateTime.asInstanceOf[js.Any],
        "entityId" -> entityId.asInstanceOf[js.Any],
        "entityName" -> entityName.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "updateDateTime" -> updateDateTime.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      hasChildEntities.foreach(__v => __obj.updateDynamic("hasChildEntities")(__v.asInstanceOf[js.Any]))
      parentEntityId.foreach(__v => __obj.updateDynamic("parentEntityId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EntitySummary]
    }
  }

  /** The error details.
    */
  @js.native
  trait ErrorDetails extends js.Object {
    var code: js.UndefOr[ErrorCode]
    var message: js.UndefOr[ErrorMessage]
  }

  object ErrorDetails {
    @inline
    def apply(
        code: js.UndefOr[ErrorCode] = js.undefined,
        message: js.UndefOr[ErrorMessage] = js.undefined
    ): ErrorDetails = {
      val __obj = js.Dynamic.literal()
      code.foreach(__v => __obj.updateDynamic("code")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ErrorDetails]
    }
  }

  /** The function request body.
    */
  @js.native
  trait FunctionRequest extends js.Object {
    var implementedBy: js.UndefOr[DataConnector]
    var requiredProperties: js.UndefOr[RequiredProperties]
    var scope: js.UndefOr[Scope]
  }

  object FunctionRequest {
    @inline
    def apply(
        implementedBy: js.UndefOr[DataConnector] = js.undefined,
        requiredProperties: js.UndefOr[RequiredProperties] = js.undefined,
        scope: js.UndefOr[Scope] = js.undefined
    ): FunctionRequest = {
      val __obj = js.Dynamic.literal()
      implementedBy.foreach(__v => __obj.updateDynamic("implementedBy")(__v.asInstanceOf[js.Any]))
      requiredProperties.foreach(__v => __obj.updateDynamic("requiredProperties")(__v.asInstanceOf[js.Any]))
      scope.foreach(__v => __obj.updateDynamic("scope")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FunctionRequest]
    }
  }

  /** The function response.
    */
  @js.native
  trait FunctionResponse extends js.Object {
    var implementedBy: js.UndefOr[DataConnector]
    var isInherited: js.UndefOr[Boolean]
    var requiredProperties: js.UndefOr[RequiredProperties]
    var scope: js.UndefOr[Scope]
  }

  object FunctionResponse {
    @inline
    def apply(
        implementedBy: js.UndefOr[DataConnector] = js.undefined,
        isInherited: js.UndefOr[Boolean] = js.undefined,
        requiredProperties: js.UndefOr[RequiredProperties] = js.undefined,
        scope: js.UndefOr[Scope] = js.undefined
    ): FunctionResponse = {
      val __obj = js.Dynamic.literal()
      implementedBy.foreach(__v => __obj.updateDynamic("implementedBy")(__v.asInstanceOf[js.Any]))
      isInherited.foreach(__v => __obj.updateDynamic("isInherited")(__v.asInstanceOf[js.Any]))
      requiredProperties.foreach(__v => __obj.updateDynamic("requiredProperties")(__v.asInstanceOf[js.Any]))
      scope.foreach(__v => __obj.updateDynamic("scope")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FunctionResponse]
    }
  }

  @js.native
  trait GetComponentTypeRequest extends js.Object {
    var componentTypeId: ComponentTypeId
    var workspaceId: Id
  }

  object GetComponentTypeRequest {
    @inline
    def apply(
        componentTypeId: ComponentTypeId,
        workspaceId: Id
    ): GetComponentTypeRequest = {
      val __obj = js.Dynamic.literal(
        "componentTypeId" -> componentTypeId.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetComponentTypeRequest]
    }
  }

  @js.native
  trait GetComponentTypeResponse extends js.Object {
    var arn: TwinMakerArn
    var componentTypeId: ComponentTypeId
    var creationDateTime: Timestamp
    var updateDateTime: Timestamp
    var workspaceId: Id
    var description: js.UndefOr[Description]
    var extendsFrom: js.UndefOr[ExtendsFrom]
    var functions: js.UndefOr[FunctionsResponse]
    var isAbstract: js.UndefOr[Boolean]
    var isSchemaInitialized: js.UndefOr[Boolean]
    var isSingleton: js.UndefOr[Boolean]
    var propertyDefinitions: js.UndefOr[PropertyDefinitionsResponse]
    var status: js.UndefOr[Status]
  }

  object GetComponentTypeResponse {
    @inline
    def apply(
        arn: TwinMakerArn,
        componentTypeId: ComponentTypeId,
        creationDateTime: Timestamp,
        updateDateTime: Timestamp,
        workspaceId: Id,
        description: js.UndefOr[Description] = js.undefined,
        extendsFrom: js.UndefOr[ExtendsFrom] = js.undefined,
        functions: js.UndefOr[FunctionsResponse] = js.undefined,
        isAbstract: js.UndefOr[Boolean] = js.undefined,
        isSchemaInitialized: js.UndefOr[Boolean] = js.undefined,
        isSingleton: js.UndefOr[Boolean] = js.undefined,
        propertyDefinitions: js.UndefOr[PropertyDefinitionsResponse] = js.undefined,
        status: js.UndefOr[Status] = js.undefined
    ): GetComponentTypeResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "componentTypeId" -> componentTypeId.asInstanceOf[js.Any],
        "creationDateTime" -> creationDateTime.asInstanceOf[js.Any],
        "updateDateTime" -> updateDateTime.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      extendsFrom.foreach(__v => __obj.updateDynamic("extendsFrom")(__v.asInstanceOf[js.Any]))
      functions.foreach(__v => __obj.updateDynamic("functions")(__v.asInstanceOf[js.Any]))
      isAbstract.foreach(__v => __obj.updateDynamic("isAbstract")(__v.asInstanceOf[js.Any]))
      isSchemaInitialized.foreach(__v => __obj.updateDynamic("isSchemaInitialized")(__v.asInstanceOf[js.Any]))
      isSingleton.foreach(__v => __obj.updateDynamic("isSingleton")(__v.asInstanceOf[js.Any]))
      propertyDefinitions.foreach(__v => __obj.updateDynamic("propertyDefinitions")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetComponentTypeResponse]
    }
  }

  @js.native
  trait GetEntityRequest extends js.Object {
    var entityId: EntityId
    var workspaceId: Id
  }

  object GetEntityRequest {
    @inline
    def apply(
        entityId: EntityId,
        workspaceId: Id
    ): GetEntityRequest = {
      val __obj = js.Dynamic.literal(
        "entityId" -> entityId.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetEntityRequest]
    }
  }

  @js.native
  trait GetEntityResponse extends js.Object {
    var arn: TwinMakerArn
    var creationDateTime: Timestamp
    var entityId: EntityId
    var entityName: EntityName
    var hasChildEntities: Boolean
    var parentEntityId: ParentEntityId
    var status: Status
    var updateDateTime: Timestamp
    var workspaceId: Id
    var components: js.UndefOr[ComponentsMap]
    var description: js.UndefOr[Description]
  }

  object GetEntityResponse {
    @inline
    def apply(
        arn: TwinMakerArn,
        creationDateTime: Timestamp,
        entityId: EntityId,
        entityName: EntityName,
        hasChildEntities: Boolean,
        parentEntityId: ParentEntityId,
        status: Status,
        updateDateTime: Timestamp,
        workspaceId: Id,
        components: js.UndefOr[ComponentsMap] = js.undefined,
        description: js.UndefOr[Description] = js.undefined
    ): GetEntityResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "creationDateTime" -> creationDateTime.asInstanceOf[js.Any],
        "entityId" -> entityId.asInstanceOf[js.Any],
        "entityName" -> entityName.asInstanceOf[js.Any],
        "hasChildEntities" -> hasChildEntities.asInstanceOf[js.Any],
        "parentEntityId" -> parentEntityId.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "updateDateTime" -> updateDateTime.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      components.foreach(__v => __obj.updateDynamic("components")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEntityResponse]
    }
  }

  @js.native
  trait GetPropertyValueHistoryRequest extends js.Object {
    var endDateTime: Timestamp
    var selectedProperties: SelectedPropertyList
    var startDateTime: Timestamp
    var workspaceId: Id
    var componentName: js.UndefOr[Name]
    var componentTypeId: js.UndefOr[ComponentTypeId]
    var entityId: js.UndefOr[EntityId]
    var interpolation: js.UndefOr[InterpolationParameters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var orderByTime: js.UndefOr[OrderByTime]
    var propertyFilters: js.UndefOr[PropertyFilters]
  }

  object GetPropertyValueHistoryRequest {
    @inline
    def apply(
        endDateTime: Timestamp,
        selectedProperties: SelectedPropertyList,
        startDateTime: Timestamp,
        workspaceId: Id,
        componentName: js.UndefOr[Name] = js.undefined,
        componentTypeId: js.UndefOr[ComponentTypeId] = js.undefined,
        entityId: js.UndefOr[EntityId] = js.undefined,
        interpolation: js.UndefOr[InterpolationParameters] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        orderByTime: js.UndefOr[OrderByTime] = js.undefined,
        propertyFilters: js.UndefOr[PropertyFilters] = js.undefined
    ): GetPropertyValueHistoryRequest = {
      val __obj = js.Dynamic.literal(
        "endDateTime" -> endDateTime.asInstanceOf[js.Any],
        "selectedProperties" -> selectedProperties.asInstanceOf[js.Any],
        "startDateTime" -> startDateTime.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      componentName.foreach(__v => __obj.updateDynamic("componentName")(__v.asInstanceOf[js.Any]))
      componentTypeId.foreach(__v => __obj.updateDynamic("componentTypeId")(__v.asInstanceOf[js.Any]))
      entityId.foreach(__v => __obj.updateDynamic("entityId")(__v.asInstanceOf[js.Any]))
      interpolation.foreach(__v => __obj.updateDynamic("interpolation")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      orderByTime.foreach(__v => __obj.updateDynamic("orderByTime")(__v.asInstanceOf[js.Any]))
      propertyFilters.foreach(__v => __obj.updateDynamic("propertyFilters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPropertyValueHistoryRequest]
    }
  }

  @js.native
  trait GetPropertyValueHistoryResponse extends js.Object {
    var propertyValues: PropertyValueList
    var nextToken: js.UndefOr[NextToken]
  }

  object GetPropertyValueHistoryResponse {
    @inline
    def apply(
        propertyValues: PropertyValueList,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetPropertyValueHistoryResponse = {
      val __obj = js.Dynamic.literal(
        "propertyValues" -> propertyValues.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPropertyValueHistoryResponse]
    }
  }

  @js.native
  trait GetPropertyValueRequest extends js.Object {
    var selectedProperties: SelectedPropertyList
    var workspaceId: Id
    var componentName: js.UndefOr[Name]
    var componentTypeId: js.UndefOr[ComponentTypeId]
    var entityId: js.UndefOr[EntityId]
  }

  object GetPropertyValueRequest {
    @inline
    def apply(
        selectedProperties: SelectedPropertyList,
        workspaceId: Id,
        componentName: js.UndefOr[Name] = js.undefined,
        componentTypeId: js.UndefOr[ComponentTypeId] = js.undefined,
        entityId: js.UndefOr[EntityId] = js.undefined
    ): GetPropertyValueRequest = {
      val __obj = js.Dynamic.literal(
        "selectedProperties" -> selectedProperties.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      componentName.foreach(__v => __obj.updateDynamic("componentName")(__v.asInstanceOf[js.Any]))
      componentTypeId.foreach(__v => __obj.updateDynamic("componentTypeId")(__v.asInstanceOf[js.Any]))
      entityId.foreach(__v => __obj.updateDynamic("entityId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPropertyValueRequest]
    }
  }

  @js.native
  trait GetPropertyValueResponse extends js.Object {
    var propertyValues: PropertyLatestValueMap
  }

  object GetPropertyValueResponse {
    @inline
    def apply(
        propertyValues: PropertyLatestValueMap
    ): GetPropertyValueResponse = {
      val __obj = js.Dynamic.literal(
        "propertyValues" -> propertyValues.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetPropertyValueResponse]
    }
  }

  @js.native
  trait GetSceneRequest extends js.Object {
    var sceneId: Id
    var workspaceId: Id
  }

  object GetSceneRequest {
    @inline
    def apply(
        sceneId: Id,
        workspaceId: Id
    ): GetSceneRequest = {
      val __obj = js.Dynamic.literal(
        "sceneId" -> sceneId.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSceneRequest]
    }
  }

  @js.native
  trait GetSceneResponse extends js.Object {
    var arn: TwinMakerArn
    var contentLocation: S3Url
    var creationDateTime: Timestamp
    var sceneId: Id
    var updateDateTime: Timestamp
    var workspaceId: Id
    var capabilities: js.UndefOr[SceneCapabilities]
    var description: js.UndefOr[Description]
  }

  object GetSceneResponse {
    @inline
    def apply(
        arn: TwinMakerArn,
        contentLocation: S3Url,
        creationDateTime: Timestamp,
        sceneId: Id,
        updateDateTime: Timestamp,
        workspaceId: Id,
        capabilities: js.UndefOr[SceneCapabilities] = js.undefined,
        description: js.UndefOr[Description] = js.undefined
    ): GetSceneResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "contentLocation" -> contentLocation.asInstanceOf[js.Any],
        "creationDateTime" -> creationDateTime.asInstanceOf[js.Any],
        "sceneId" -> sceneId.asInstanceOf[js.Any],
        "updateDateTime" -> updateDateTime.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      capabilities.foreach(__v => __obj.updateDynamic("capabilities")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSceneResponse]
    }
  }

  @js.native
  trait GetWorkspaceRequest extends js.Object {
    var workspaceId: IdOrArn
  }

  object GetWorkspaceRequest {
    @inline
    def apply(
        workspaceId: IdOrArn
    ): GetWorkspaceRequest = {
      val __obj = js.Dynamic.literal(
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetWorkspaceRequest]
    }
  }

  @js.native
  trait GetWorkspaceResponse extends js.Object {
    var arn: TwinMakerArn
    var creationDateTime: Timestamp
    var role: RoleArn
    var s3Location: S3Location
    var updateDateTime: Timestamp
    var workspaceId: Id
    var description: js.UndefOr[Description]
  }

  object GetWorkspaceResponse {
    @inline
    def apply(
        arn: TwinMakerArn,
        creationDateTime: Timestamp,
        role: RoleArn,
        s3Location: S3Location,
        updateDateTime: Timestamp,
        workspaceId: Id,
        description: js.UndefOr[Description] = js.undefined
    ): GetWorkspaceResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "creationDateTime" -> creationDateTime.asInstanceOf[js.Any],
        "role" -> role.asInstanceOf[js.Any],
        "s3Location" -> s3Location.asInstanceOf[js.Any],
        "updateDateTime" -> updateDateTime.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetWorkspaceResponse]
    }
  }

  /** An object that specifies how to interpolate data in a list.
    */
  @js.native
  trait InterpolationParameters extends js.Object {
    var interpolationType: js.UndefOr[InterpolationType]
    var intervalInSeconds: js.UndefOr[IntervalInSeconds]
  }

  object InterpolationParameters {
    @inline
    def apply(
        interpolationType: js.UndefOr[InterpolationType] = js.undefined,
        intervalInSeconds: js.UndefOr[IntervalInSeconds] = js.undefined
    ): InterpolationParameters = {
      val __obj = js.Dynamic.literal()
      interpolationType.foreach(__v => __obj.updateDynamic("interpolationType")(__v.asInstanceOf[js.Any]))
      intervalInSeconds.foreach(__v => __obj.updateDynamic("intervalInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InterpolationParameters]
    }
  }

  /** The Lambda function.
    */
  @js.native
  trait LambdaFunction extends js.Object {
    var arn: LambdaArn
  }

  object LambdaFunction {
    @inline
    def apply(
        arn: LambdaArn
    ): LambdaFunction = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LambdaFunction]
    }
  }

  /** An object that filters items in a list of component types.
    */
  @js.native
  trait ListComponentTypesFilter extends js.Object {
    var extendsFrom: js.UndefOr[ComponentTypeId]
    var isAbstract: js.UndefOr[Boolean]
    var namespace: js.UndefOr[String]
  }

  object ListComponentTypesFilter {
    @inline
    def apply(
        extendsFrom: js.UndefOr[ComponentTypeId] = js.undefined,
        isAbstract: js.UndefOr[Boolean] = js.undefined,
        namespace: js.UndefOr[String] = js.undefined
    ): ListComponentTypesFilter = {
      val __obj = js.Dynamic.literal()
      extendsFrom.foreach(__v => __obj.updateDynamic("extendsFrom")(__v.asInstanceOf[js.Any]))
      isAbstract.foreach(__v => __obj.updateDynamic("isAbstract")(__v.asInstanceOf[js.Any]))
      namespace.foreach(__v => __obj.updateDynamic("namespace")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListComponentTypesFilter]
    }
  }

  @js.native
  trait ListComponentTypesRequest extends js.Object {
    var workspaceId: Id
    var filters: js.UndefOr[ListComponentTypesFilters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListComponentTypesRequest {
    @inline
    def apply(
        workspaceId: Id,
        filters: js.UndefOr[ListComponentTypesFilters] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListComponentTypesRequest = {
      val __obj = js.Dynamic.literal(
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListComponentTypesRequest]
    }
  }

  @js.native
  trait ListComponentTypesResponse extends js.Object {
    var componentTypeSummaries: ComponentTypeSummaries
    var workspaceId: Id
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListComponentTypesResponse {
    @inline
    def apply(
        componentTypeSummaries: ComponentTypeSummaries,
        workspaceId: Id,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListComponentTypesResponse = {
      val __obj = js.Dynamic.literal(
        "componentTypeSummaries" -> componentTypeSummaries.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListComponentTypesResponse]
    }
  }

  /** An object that filters items in a list of entities.
    */
  @js.native
  trait ListEntitiesFilter extends js.Object {
    var componentTypeId: js.UndefOr[ComponentTypeId]
    var parentEntityId: js.UndefOr[ParentEntityId]
  }

  object ListEntitiesFilter {
    @inline
    def apply(
        componentTypeId: js.UndefOr[ComponentTypeId] = js.undefined,
        parentEntityId: js.UndefOr[ParentEntityId] = js.undefined
    ): ListEntitiesFilter = {
      val __obj = js.Dynamic.literal()
      componentTypeId.foreach(__v => __obj.updateDynamic("componentTypeId")(__v.asInstanceOf[js.Any]))
      parentEntityId.foreach(__v => __obj.updateDynamic("parentEntityId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEntitiesFilter]
    }
  }

  @js.native
  trait ListEntitiesRequest extends js.Object {
    var workspaceId: Id
    var filters: js.UndefOr[ListEntitiesFilters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListEntitiesRequest {
    @inline
    def apply(
        workspaceId: Id,
        filters: js.UndefOr[ListEntitiesFilters] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEntitiesRequest = {
      val __obj = js.Dynamic.literal(
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEntitiesRequest]
    }
  }

  @js.native
  trait ListEntitiesResponse extends js.Object {
    var entitySummaries: js.UndefOr[EntitySummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListEntitiesResponse {
    @inline
    def apply(
        entitySummaries: js.UndefOr[EntitySummaries] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEntitiesResponse = {
      val __obj = js.Dynamic.literal()
      entitySummaries.foreach(__v => __obj.updateDynamic("entitySummaries")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEntitiesResponse]
    }
  }

  @js.native
  trait ListScenesRequest extends js.Object {
    var workspaceId: Id
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListScenesRequest {
    @inline
    def apply(
        workspaceId: Id,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListScenesRequest = {
      val __obj = js.Dynamic.literal(
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListScenesRequest]
    }
  }

  @js.native
  trait ListScenesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var sceneSummaries: js.UndefOr[SceneSummaries]
  }

  object ListScenesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        sceneSummaries: js.UndefOr[SceneSummaries] = js.undefined
    ): ListScenesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      sceneSummaries.foreach(__v => __obj.updateDynamic("sceneSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListScenesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceARN: TwinMakerArn
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceARN: TwinMakerArn,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceARN" -> resourceARN.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListWorkspacesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListWorkspacesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListWorkspacesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkspacesRequest]
    }
  }

  @js.native
  trait ListWorkspacesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var workspaceSummaries: js.UndefOr[WorkspaceSummaries]
  }

  object ListWorkspacesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        workspaceSummaries: js.UndefOr[WorkspaceSummaries] = js.undefined
    ): ListWorkspacesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      workspaceSummaries.foreach(__v => __obj.updateDynamic("workspaceSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWorkspacesResponse]
    }
  }

  /** The parent entity update request.
    */
  @js.native
  trait ParentEntityUpdateRequest extends js.Object {
    var updateType: ParentEntityUpdateType
    var parentEntityId: js.UndefOr[ParentEntityId]
  }

  object ParentEntityUpdateRequest {
    @inline
    def apply(
        updateType: ParentEntityUpdateType,
        parentEntityId: js.UndefOr[ParentEntityId] = js.undefined
    ): ParentEntityUpdateRequest = {
      val __obj = js.Dynamic.literal(
        "updateType" -> updateType.asInstanceOf[js.Any]
      )

      parentEntityId.foreach(__v => __obj.updateDynamic("parentEntityId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParentEntityUpdateRequest]
    }
  }

  /** An object that sets information about a property.
    */
  @js.native
  trait PropertyDefinitionRequest extends js.Object {
    var configuration: js.UndefOr[Configuration]
    var dataType: js.UndefOr[DataType]
    var defaultValue: js.UndefOr[DataValue]
    var isExternalId: js.UndefOr[Boolean]
    var isRequiredInEntity: js.UndefOr[Boolean]
    var isStoredExternally: js.UndefOr[Boolean]
    var isTimeSeries: js.UndefOr[Boolean]
  }

  object PropertyDefinitionRequest {
    @inline
    def apply(
        configuration: js.UndefOr[Configuration] = js.undefined,
        dataType: js.UndefOr[DataType] = js.undefined,
        defaultValue: js.UndefOr[DataValue] = js.undefined,
        isExternalId: js.UndefOr[Boolean] = js.undefined,
        isRequiredInEntity: js.UndefOr[Boolean] = js.undefined,
        isStoredExternally: js.UndefOr[Boolean] = js.undefined,
        isTimeSeries: js.UndefOr[Boolean] = js.undefined
    ): PropertyDefinitionRequest = {
      val __obj = js.Dynamic.literal()
      configuration.foreach(__v => __obj.updateDynamic("configuration")(__v.asInstanceOf[js.Any]))
      dataType.foreach(__v => __obj.updateDynamic("dataType")(__v.asInstanceOf[js.Any]))
      defaultValue.foreach(__v => __obj.updateDynamic("defaultValue")(__v.asInstanceOf[js.Any]))
      isExternalId.foreach(__v => __obj.updateDynamic("isExternalId")(__v.asInstanceOf[js.Any]))
      isRequiredInEntity.foreach(__v => __obj.updateDynamic("isRequiredInEntity")(__v.asInstanceOf[js.Any]))
      isStoredExternally.foreach(__v => __obj.updateDynamic("isStoredExternally")(__v.asInstanceOf[js.Any]))
      isTimeSeries.foreach(__v => __obj.updateDynamic("isTimeSeries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PropertyDefinitionRequest]
    }
  }

  /** An object that contains response data from a property definition request.
    */
  @js.native
  trait PropertyDefinitionResponse extends js.Object {
    var dataType: DataType
    var isExternalId: Boolean
    var isFinal: Boolean
    var isImported: Boolean
    var isInherited: Boolean
    var isRequiredInEntity: Boolean
    var isStoredExternally: Boolean
    var isTimeSeries: Boolean
    var configuration: js.UndefOr[Configuration]
    var defaultValue: js.UndefOr[DataValue]
  }

  object PropertyDefinitionResponse {
    @inline
    def apply(
        dataType: DataType,
        isExternalId: Boolean,
        isFinal: Boolean,
        isImported: Boolean,
        isInherited: Boolean,
        isRequiredInEntity: Boolean,
        isStoredExternally: Boolean,
        isTimeSeries: Boolean,
        configuration: js.UndefOr[Configuration] = js.undefined,
        defaultValue: js.UndefOr[DataValue] = js.undefined
    ): PropertyDefinitionResponse = {
      val __obj = js.Dynamic.literal(
        "dataType" -> dataType.asInstanceOf[js.Any],
        "isExternalId" -> isExternalId.asInstanceOf[js.Any],
        "isFinal" -> isFinal.asInstanceOf[js.Any],
        "isImported" -> isImported.asInstanceOf[js.Any],
        "isInherited" -> isInherited.asInstanceOf[js.Any],
        "isRequiredInEntity" -> isRequiredInEntity.asInstanceOf[js.Any],
        "isStoredExternally" -> isStoredExternally.asInstanceOf[js.Any],
        "isTimeSeries" -> isTimeSeries.asInstanceOf[js.Any]
      )

      configuration.foreach(__v => __obj.updateDynamic("configuration")(__v.asInstanceOf[js.Any]))
      defaultValue.foreach(__v => __obj.updateDynamic("defaultValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PropertyDefinitionResponse]
    }
  }

  /** An object that filters items returned by a property request.
    */
  @js.native
  trait PropertyFilter extends js.Object {
    var operator: js.UndefOr[String]
    var propertyName: js.UndefOr[String]
    var value: js.UndefOr[DataValue]
  }

  object PropertyFilter {
    @inline
    def apply(
        operator: js.UndefOr[String] = js.undefined,
        propertyName: js.UndefOr[String] = js.undefined,
        value: js.UndefOr[DataValue] = js.undefined
    ): PropertyFilter = {
      val __obj = js.Dynamic.literal()
      operator.foreach(__v => __obj.updateDynamic("operator")(__v.asInstanceOf[js.Any]))
      propertyName.foreach(__v => __obj.updateDynamic("propertyName")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PropertyFilter]
    }
  }

  /** The latest value of the property.
    */
  @js.native
  trait PropertyLatestValue extends js.Object {
    var propertyReference: EntityPropertyReference
    var propertyValue: js.UndefOr[DataValue]
  }

  object PropertyLatestValue {
    @inline
    def apply(
        propertyReference: EntityPropertyReference,
        propertyValue: js.UndefOr[DataValue] = js.undefined
    ): PropertyLatestValue = {
      val __obj = js.Dynamic.literal(
        "propertyReference" -> propertyReference.asInstanceOf[js.Any]
      )

      propertyValue.foreach(__v => __obj.updateDynamic("propertyValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PropertyLatestValue]
    }
  }

  /** An object that sets information about a property.
    */
  @js.native
  trait PropertyRequest extends js.Object {
    var definition: js.UndefOr[PropertyDefinitionRequest]
    var updateType: js.UndefOr[PropertyUpdateType]
    var value: js.UndefOr[DataValue]
  }

  object PropertyRequest {
    @inline
    def apply(
        definition: js.UndefOr[PropertyDefinitionRequest] = js.undefined,
        updateType: js.UndefOr[PropertyUpdateType] = js.undefined,
        value: js.UndefOr[DataValue] = js.undefined
    ): PropertyRequest = {
      val __obj = js.Dynamic.literal()
      definition.foreach(__v => __obj.updateDynamic("definition")(__v.asInstanceOf[js.Any]))
      updateType.foreach(__v => __obj.updateDynamic("updateType")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PropertyRequest]
    }
  }

  /** An object that contains information about a property response.
    */
  @js.native
  trait PropertyResponse extends js.Object {
    var definition: js.UndefOr[PropertyDefinitionResponse]
    var value: js.UndefOr[DataValue]
  }

  object PropertyResponse {
    @inline
    def apply(
        definition: js.UndefOr[PropertyDefinitionResponse] = js.undefined,
        value: js.UndefOr[DataValue] = js.undefined
    ): PropertyResponse = {
      val __obj = js.Dynamic.literal()
      definition.foreach(__v => __obj.updateDynamic("definition")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PropertyResponse]
    }
  }

  /** An object that contains information about a value for a time series property.
    */
  @js.native
  trait PropertyValue extends js.Object {
    var timestamp: Timestamp
    var value: DataValue
  }

  object PropertyValue {
    @inline
    def apply(
        timestamp: Timestamp,
        value: DataValue
    ): PropertyValue = {
      val __obj = js.Dynamic.literal(
        "timestamp" -> timestamp.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PropertyValue]
    }
  }

  /** An object that specifies information about time series property values.
    */
  @js.native
  trait PropertyValueEntry extends js.Object {
    var entityPropertyReference: EntityPropertyReference
    var propertyValues: js.UndefOr[PropertyValues]
  }

  object PropertyValueEntry {
    @inline
    def apply(
        entityPropertyReference: EntityPropertyReference,
        propertyValues: js.UndefOr[PropertyValues] = js.undefined
    ): PropertyValueEntry = {
      val __obj = js.Dynamic.literal(
        "entityPropertyReference" -> entityPropertyReference.asInstanceOf[js.Any]
      )

      propertyValues.foreach(__v => __obj.updateDynamic("propertyValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PropertyValueEntry]
    }
  }

  /** The history of values for a time series property.
    */
  @js.native
  trait PropertyValueHistory extends js.Object {
    var entityPropertyReference: EntityPropertyReference
    var values: js.UndefOr[Values]
  }

  object PropertyValueHistory {
    @inline
    def apply(
        entityPropertyReference: EntityPropertyReference,
        values: js.UndefOr[Values] = js.undefined
    ): PropertyValueHistory = {
      val __obj = js.Dynamic.literal(
        "entityPropertyReference" -> entityPropertyReference.asInstanceOf[js.Any]
      )

      values.foreach(__v => __obj.updateDynamic("values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PropertyValueHistory]
    }
  }

  /** An object that specifies a relationship with another component type.
    */
  @js.native
  trait Relationship extends js.Object {
    var relationshipType: js.UndefOr[String]
    var targetComponentTypeId: js.UndefOr[ComponentTypeId]
  }

  object Relationship {
    @inline
    def apply(
        relationshipType: js.UndefOr[String] = js.undefined,
        targetComponentTypeId: js.UndefOr[ComponentTypeId] = js.undefined
    ): Relationship = {
      val __obj = js.Dynamic.literal()
      relationshipType.foreach(__v => __obj.updateDynamic("relationshipType")(__v.asInstanceOf[js.Any]))
      targetComponentTypeId.foreach(__v => __obj.updateDynamic("targetComponentTypeId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Relationship]
    }
  }

  /** A value that associates a component and an entity.
    */
  @js.native
  trait RelationshipValue extends js.Object {
    var targetComponentName: js.UndefOr[Name]
    var targetEntityId: js.UndefOr[EntityId]
  }

  object RelationshipValue {
    @inline
    def apply(
        targetComponentName: js.UndefOr[Name] = js.undefined,
        targetEntityId: js.UndefOr[EntityId] = js.undefined
    ): RelationshipValue = {
      val __obj = js.Dynamic.literal()
      targetComponentName.foreach(__v => __obj.updateDynamic("targetComponentName")(__v.asInstanceOf[js.Any]))
      targetEntityId.foreach(__v => __obj.updateDynamic("targetEntityId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RelationshipValue]
    }
  }

  /** An object that contains information about a scene.
    */
  @js.native
  trait SceneSummary extends js.Object {
    var arn: TwinMakerArn
    var contentLocation: S3Url
    var creationDateTime: Timestamp
    var sceneId: Id
    var updateDateTime: Timestamp
    var description: js.UndefOr[Description]
  }

  object SceneSummary {
    @inline
    def apply(
        arn: TwinMakerArn,
        contentLocation: S3Url,
        creationDateTime: Timestamp,
        sceneId: Id,
        updateDateTime: Timestamp,
        description: js.UndefOr[Description] = js.undefined
    ): SceneSummary = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "contentLocation" -> contentLocation.asInstanceOf[js.Any],
        "creationDateTime" -> creationDateTime.asInstanceOf[js.Any],
        "sceneId" -> sceneId.asInstanceOf[js.Any],
        "updateDateTime" -> updateDateTime.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SceneSummary]
    }
  }

  /** An object that represents the status of an entity, component, component type, or workspace.
    */
  @js.native
  trait Status extends js.Object {
    var error: js.UndefOr[ErrorDetails]
    var state: js.UndefOr[State]
  }

  object Status {
    @inline
    def apply(
        error: js.UndefOr[ErrorDetails] = js.undefined,
        state: js.UndefOr[State] = js.undefined
    ): Status = {
      val __obj = js.Dynamic.literal()
      error.foreach(__v => __obj.updateDynamic("error")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Status]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceARN: TwinMakerArn
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceARN: TwinMakerArn,
        tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceARN" -> resourceARN.asInstanceOf[js.Any],
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
    var resourceARN: TwinMakerArn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceARN: TwinMakerArn,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceARN" -> resourceARN.asInstanceOf[js.Any],
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
  trait UpdateComponentTypeRequest extends js.Object {
    var componentTypeId: ComponentTypeId
    var workspaceId: Id
    var description: js.UndefOr[Description]
    var extendsFrom: js.UndefOr[ExtendsFrom]
    var functions: js.UndefOr[FunctionsRequest]
    var isSingleton: js.UndefOr[Boolean]
    var propertyDefinitions: js.UndefOr[PropertyDefinitionsRequest]
  }

  object UpdateComponentTypeRequest {
    @inline
    def apply(
        componentTypeId: ComponentTypeId,
        workspaceId: Id,
        description: js.UndefOr[Description] = js.undefined,
        extendsFrom: js.UndefOr[ExtendsFrom] = js.undefined,
        functions: js.UndefOr[FunctionsRequest] = js.undefined,
        isSingleton: js.UndefOr[Boolean] = js.undefined,
        propertyDefinitions: js.UndefOr[PropertyDefinitionsRequest] = js.undefined
    ): UpdateComponentTypeRequest = {
      val __obj = js.Dynamic.literal(
        "componentTypeId" -> componentTypeId.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      extendsFrom.foreach(__v => __obj.updateDynamic("extendsFrom")(__v.asInstanceOf[js.Any]))
      functions.foreach(__v => __obj.updateDynamic("functions")(__v.asInstanceOf[js.Any]))
      isSingleton.foreach(__v => __obj.updateDynamic("isSingleton")(__v.asInstanceOf[js.Any]))
      propertyDefinitions.foreach(__v => __obj.updateDynamic("propertyDefinitions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateComponentTypeRequest]
    }
  }

  @js.native
  trait UpdateComponentTypeResponse extends js.Object {
    var arn: TwinMakerArn
    var componentTypeId: ComponentTypeId
    var state: State
    var workspaceId: Id
  }

  object UpdateComponentTypeResponse {
    @inline
    def apply(
        arn: TwinMakerArn,
        componentTypeId: ComponentTypeId,
        state: State,
        workspaceId: Id
    ): UpdateComponentTypeResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "componentTypeId" -> componentTypeId.asInstanceOf[js.Any],
        "state" -> state.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateComponentTypeResponse]
    }
  }

  @js.native
  trait UpdateEntityRequest extends js.Object {
    var entityId: EntityId
    var workspaceId: Id
    var componentUpdates: js.UndefOr[ComponentUpdatesMapRequest]
    var description: js.UndefOr[Description]
    var entityName: js.UndefOr[EntityName]
    var parentEntityUpdate: js.UndefOr[ParentEntityUpdateRequest]
  }

  object UpdateEntityRequest {
    @inline
    def apply(
        entityId: EntityId,
        workspaceId: Id,
        componentUpdates: js.UndefOr[ComponentUpdatesMapRequest] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        entityName: js.UndefOr[EntityName] = js.undefined,
        parentEntityUpdate: js.UndefOr[ParentEntityUpdateRequest] = js.undefined
    ): UpdateEntityRequest = {
      val __obj = js.Dynamic.literal(
        "entityId" -> entityId.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      componentUpdates.foreach(__v => __obj.updateDynamic("componentUpdates")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      entityName.foreach(__v => __obj.updateDynamic("entityName")(__v.asInstanceOf[js.Any]))
      parentEntityUpdate.foreach(__v => __obj.updateDynamic("parentEntityUpdate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEntityRequest]
    }
  }

  @js.native
  trait UpdateEntityResponse extends js.Object {
    var state: State
    var updateDateTime: Timestamp
  }

  object UpdateEntityResponse {
    @inline
    def apply(
        state: State,
        updateDateTime: Timestamp
    ): UpdateEntityResponse = {
      val __obj = js.Dynamic.literal(
        "state" -> state.asInstanceOf[js.Any],
        "updateDateTime" -> updateDateTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateEntityResponse]
    }
  }

  @js.native
  trait UpdateSceneRequest extends js.Object {
    var sceneId: Id
    var workspaceId: Id
    var capabilities: js.UndefOr[SceneCapabilities]
    var contentLocation: js.UndefOr[S3Url]
    var description: js.UndefOr[Description]
  }

  object UpdateSceneRequest {
    @inline
    def apply(
        sceneId: Id,
        workspaceId: Id,
        capabilities: js.UndefOr[SceneCapabilities] = js.undefined,
        contentLocation: js.UndefOr[S3Url] = js.undefined,
        description: js.UndefOr[Description] = js.undefined
    ): UpdateSceneRequest = {
      val __obj = js.Dynamic.literal(
        "sceneId" -> sceneId.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      capabilities.foreach(__v => __obj.updateDynamic("capabilities")(__v.asInstanceOf[js.Any]))
      contentLocation.foreach(__v => __obj.updateDynamic("contentLocation")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSceneRequest]
    }
  }

  @js.native
  trait UpdateSceneResponse extends js.Object {
    var updateDateTime: Timestamp
  }

  object UpdateSceneResponse {
    @inline
    def apply(
        updateDateTime: Timestamp
    ): UpdateSceneResponse = {
      val __obj = js.Dynamic.literal(
        "updateDateTime" -> updateDateTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateSceneResponse]
    }
  }

  @js.native
  trait UpdateWorkspaceRequest extends js.Object {
    var workspaceId: Id
    var description: js.UndefOr[Description]
    var role: js.UndefOr[RoleArn]
  }

  object UpdateWorkspaceRequest {
    @inline
    def apply(
        workspaceId: Id,
        description: js.UndefOr[Description] = js.undefined,
        role: js.UndefOr[RoleArn] = js.undefined
    ): UpdateWorkspaceRequest = {
      val __obj = js.Dynamic.literal(
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      role.foreach(__v => __obj.updateDynamic("role")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWorkspaceRequest]
    }
  }

  @js.native
  trait UpdateWorkspaceResponse extends js.Object {
    var updateDateTime: Timestamp
  }

  object UpdateWorkspaceResponse {
    @inline
    def apply(
        updateDateTime: Timestamp
    ): UpdateWorkspaceResponse = {
      val __obj = js.Dynamic.literal(
        "updateDateTime" -> updateDateTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateWorkspaceResponse]
    }
  }

  /** An object that contains information about a workspace.
    */
  @js.native
  trait WorkspaceSummary extends js.Object {
    var arn: TwinMakerArn
    var creationDateTime: Timestamp
    var updateDateTime: Timestamp
    var workspaceId: Id
    var description: js.UndefOr[Description]
  }

  object WorkspaceSummary {
    @inline
    def apply(
        arn: TwinMakerArn,
        creationDateTime: Timestamp,
        updateDateTime: Timestamp,
        workspaceId: Id,
        description: js.UndefOr[Description] = js.undefined
    ): WorkspaceSummary = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "creationDateTime" -> creationDateTime.asInstanceOf[js.Any],
        "updateDateTime" -> updateDateTime.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WorkspaceSummary]
    }
  }
}
