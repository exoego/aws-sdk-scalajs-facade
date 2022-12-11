package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object iottwinmaker {
  type BundleName = String
  type ColumnDescriptions = js.Array[ColumnDescription]
  type ColumnName = String
  type ComponentPropertyGroupRequests = js.Dictionary[ComponentPropertyGroupRequest]
  type ComponentPropertyGroupResponses = js.Dictionary[ComponentPropertyGroupResponse]
  type ComponentTypeId = String
  type ComponentTypeName = String
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
  type OrderByList = js.Array[OrderBy]
  type ParentEntityId = String
  type PricingBundles = js.Array[BundleName]
  type PropertyDefinitionsRequest = js.Dictionary[PropertyDefinitionRequest]
  type PropertyDefinitionsResponse = js.Dictionary[PropertyDefinitionResponse]
  type PropertyDisplayName = String
  type PropertyFilters = js.Array[PropertyFilter]
  type PropertyGroupsRequest = js.Dictionary[PropertyGroupRequest]
  type PropertyGroupsResponse = js.Dictionary[PropertyGroupResponse]
  type PropertyLatestValueMap = js.Dictionary[PropertyLatestValue]
  type PropertyNames = js.Array[Name]
  type PropertyRequests = js.Dictionary[PropertyRequest]
  type PropertyResponses = js.Dictionary[PropertyResponse]
  type PropertyTableValue = js.Dictionary[DataValue]
  type PropertyValueList = js.Array[PropertyValueHistory]
  type PropertyValues = js.Array[PropertyValue]
  type QueryServiceMaxResults = Int
  type QueryStatement = String
  type RequiredProperties = js.Array[Name]
  type RoleArn = String
  type RowData = js.Array[QueryResultValue]
  type Rows = js.Array[Row]
  type S3Location = String
  type S3Url = String
  type SceneCapabilities = js.Array[SceneCapability]
  type SceneCapability = String
  type SceneSummaries = js.Array[SceneSummary]
  type SelectedPropertyList = js.Array[String]
  type SyncJobSummaries = js.Array[SyncJobSummary]
  type SyncResourceFilters = js.Array[SyncResourceFilter]
  type SyncResourceSummaries = js.Array[SyncResourceSummary]
  type SyncSource = String
  type TabularPropertyValue = js.Array[PropertyTableValue]
  type TabularPropertyValues = js.Array[TabularPropertyValue]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type Time = String
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
    @inline def createSyncJobFuture(params: CreateSyncJobRequest): Future[CreateSyncJobResponse] = service.createSyncJob(params).promise().toFuture
    @inline def createWorkspaceFuture(params: CreateWorkspaceRequest): Future[CreateWorkspaceResponse] = service.createWorkspace(params).promise().toFuture
    @inline def deleteComponentTypeFuture(params: DeleteComponentTypeRequest): Future[DeleteComponentTypeResponse] = service.deleteComponentType(params).promise().toFuture
    @inline def deleteEntityFuture(params: DeleteEntityRequest): Future[DeleteEntityResponse] = service.deleteEntity(params).promise().toFuture
    @inline def deleteSceneFuture(params: DeleteSceneRequest): Future[DeleteSceneResponse] = service.deleteScene(params).promise().toFuture
    @inline def deleteSyncJobFuture(params: DeleteSyncJobRequest): Future[DeleteSyncJobResponse] = service.deleteSyncJob(params).promise().toFuture
    @inline def deleteWorkspaceFuture(params: DeleteWorkspaceRequest): Future[DeleteWorkspaceResponse] = service.deleteWorkspace(params).promise().toFuture
    @inline def executeQueryFuture(params: ExecuteQueryRequest): Future[ExecuteQueryResponse] = service.executeQuery(params).promise().toFuture
    @inline def getComponentTypeFuture(params: GetComponentTypeRequest): Future[GetComponentTypeResponse] = service.getComponentType(params).promise().toFuture
    @inline def getEntityFuture(params: GetEntityRequest): Future[GetEntityResponse] = service.getEntity(params).promise().toFuture
    @inline def getPricingPlanFuture(params: GetPricingPlanRequest): Future[GetPricingPlanResponse] = service.getPricingPlan(params).promise().toFuture
    @inline def getPropertyValueFuture(params: GetPropertyValueRequest): Future[GetPropertyValueResponse] = service.getPropertyValue(params).promise().toFuture
    @inline def getPropertyValueHistoryFuture(params: GetPropertyValueHistoryRequest): Future[GetPropertyValueHistoryResponse] = service.getPropertyValueHistory(params).promise().toFuture
    @inline def getSceneFuture(params: GetSceneRequest): Future[GetSceneResponse] = service.getScene(params).promise().toFuture
    @inline def getSyncJobFuture(params: GetSyncJobRequest): Future[GetSyncJobResponse] = service.getSyncJob(params).promise().toFuture
    @inline def getWorkspaceFuture(params: GetWorkspaceRequest): Future[GetWorkspaceResponse] = service.getWorkspace(params).promise().toFuture
    @inline def listComponentTypesFuture(params: ListComponentTypesRequest): Future[ListComponentTypesResponse] = service.listComponentTypes(params).promise().toFuture
    @inline def listEntitiesFuture(params: ListEntitiesRequest): Future[ListEntitiesResponse] = service.listEntities(params).promise().toFuture
    @inline def listScenesFuture(params: ListScenesRequest): Future[ListScenesResponse] = service.listScenes(params).promise().toFuture
    @inline def listSyncJobsFuture(params: ListSyncJobsRequest): Future[ListSyncJobsResponse] = service.listSyncJobs(params).promise().toFuture
    @inline def listSyncResourcesFuture(params: ListSyncResourcesRequest): Future[ListSyncResourcesResponse] = service.listSyncResources(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listWorkspacesFuture(params: ListWorkspacesRequest): Future[ListWorkspacesResponse] = service.listWorkspaces(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateComponentTypeFuture(params: UpdateComponentTypeRequest): Future[UpdateComponentTypeResponse] = service.updateComponentType(params).promise().toFuture
    @inline def updateEntityFuture(params: UpdateEntityRequest): Future[UpdateEntityResponse] = service.updateEntity(params).promise().toFuture
    @inline def updatePricingPlanFuture(params: UpdatePricingPlanRequest): Future[UpdatePricingPlanResponse] = service.updatePricingPlan(params).promise().toFuture
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
    def createSyncJob(params: CreateSyncJobRequest): Request[CreateSyncJobResponse] = js.native
    def createWorkspace(params: CreateWorkspaceRequest): Request[CreateWorkspaceResponse] = js.native
    def deleteComponentType(params: DeleteComponentTypeRequest): Request[DeleteComponentTypeResponse] = js.native
    def deleteEntity(params: DeleteEntityRequest): Request[DeleteEntityResponse] = js.native
    def deleteScene(params: DeleteSceneRequest): Request[DeleteSceneResponse] = js.native
    def deleteSyncJob(params: DeleteSyncJobRequest): Request[DeleteSyncJobResponse] = js.native
    def deleteWorkspace(params: DeleteWorkspaceRequest): Request[DeleteWorkspaceResponse] = js.native
    def executeQuery(params: ExecuteQueryRequest): Request[ExecuteQueryResponse] = js.native
    def getComponentType(params: GetComponentTypeRequest): Request[GetComponentTypeResponse] = js.native
    def getEntity(params: GetEntityRequest): Request[GetEntityResponse] = js.native
    def getPricingPlan(params: GetPricingPlanRequest): Request[GetPricingPlanResponse] = js.native
    def getPropertyValue(params: GetPropertyValueRequest): Request[GetPropertyValueResponse] = js.native
    def getPropertyValueHistory(params: GetPropertyValueHistoryRequest): Request[GetPropertyValueHistoryResponse] = js.native
    def getScene(params: GetSceneRequest): Request[GetSceneResponse] = js.native
    def getSyncJob(params: GetSyncJobRequest): Request[GetSyncJobResponse] = js.native
    def getWorkspace(params: GetWorkspaceRequest): Request[GetWorkspaceResponse] = js.native
    def listComponentTypes(params: ListComponentTypesRequest): Request[ListComponentTypesResponse] = js.native
    def listEntities(params: ListEntitiesRequest): Request[ListEntitiesResponse] = js.native
    def listScenes(params: ListScenesRequest): Request[ListScenesResponse] = js.native
    def listSyncJobs(params: ListSyncJobsRequest): Request[ListSyncJobsResponse] = js.native
    def listSyncResources(params: ListSyncResourcesRequest): Request[ListSyncResourcesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listWorkspaces(params: ListWorkspacesRequest): Request[ListWorkspacesResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateComponentType(params: UpdateComponentTypeRequest): Request[UpdateComponentTypeResponse] = js.native
    def updateEntity(params: UpdateEntityRequest): Request[UpdateEntityResponse] = js.native
    def updatePricingPlan(params: UpdatePricingPlanRequest): Request[UpdatePricingPlanResponse] = js.native
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

  /** Information about pricing bundle.
    */
  @js.native
  trait BundleInformation extends js.Object {
    var bundleNames: PricingBundles
    var pricingTier: js.UndefOr[PricingTier]
  }

  object BundleInformation {
    @inline
    def apply(
        bundleNames: PricingBundles,
        pricingTier: js.UndefOr[PricingTier] = js.undefined
    ): BundleInformation = {
      val __obj = js.Dynamic.literal(
        "bundleNames" -> bundleNames.asInstanceOf[js.Any]
      )

      pricingTier.foreach(__v => __obj.updateDynamic("pricingTier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BundleInformation]
    }
  }

  /** A description of the column in the query results.
    */
  @js.native
  trait ColumnDescription extends js.Object {
    var name: js.UndefOr[ColumnName]
    var `type`: js.UndefOr[ColumnType]
  }

  object ColumnDescription {
    @inline
    def apply(
        name: js.UndefOr[ColumnName] = js.undefined,
        `type`: js.UndefOr[ColumnType] = js.undefined
    ): ColumnDescription = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ColumnDescription]
    }
  }

  /** <p/>
    */
  @js.native
  trait ComponentPropertyGroupRequest extends js.Object {
    var groupType: js.UndefOr[GroupType]
    var propertyNames: js.UndefOr[PropertyNames]
    var updateType: js.UndefOr[PropertyGroupUpdateType]
  }

  object ComponentPropertyGroupRequest {
    @inline
    def apply(
        groupType: js.UndefOr[GroupType] = js.undefined,
        propertyNames: js.UndefOr[PropertyNames] = js.undefined,
        updateType: js.UndefOr[PropertyGroupUpdateType] = js.undefined
    ): ComponentPropertyGroupRequest = {
      val __obj = js.Dynamic.literal()
      groupType.foreach(__v => __obj.updateDynamic("groupType")(__v.asInstanceOf[js.Any]))
      propertyNames.foreach(__v => __obj.updateDynamic("propertyNames")(__v.asInstanceOf[js.Any]))
      updateType.foreach(__v => __obj.updateDynamic("updateType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComponentPropertyGroupRequest]
    }
  }

  /** The component property group response.
    */
  @js.native
  trait ComponentPropertyGroupResponse extends js.Object {
    var groupType: GroupType
    var isInherited: Boolean
    var propertyNames: PropertyNames
  }

  object ComponentPropertyGroupResponse {
    @inline
    def apply(
        groupType: GroupType,
        isInherited: Boolean,
        propertyNames: PropertyNames
    ): ComponentPropertyGroupResponse = {
      val __obj = js.Dynamic.literal(
        "groupType" -> groupType.asInstanceOf[js.Any],
        "isInherited" -> isInherited.asInstanceOf[js.Any],
        "propertyNames" -> propertyNames.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ComponentPropertyGroupResponse]
    }
  }

  /** An object that sets information about a component type create or update request.
    */
  @js.native
  trait ComponentRequest extends js.Object {
    var componentTypeId: js.UndefOr[ComponentTypeId]
    var description: js.UndefOr[Description]
    var properties: js.UndefOr[PropertyRequests]
    var propertyGroups: js.UndefOr[ComponentPropertyGroupRequests]
  }

  object ComponentRequest {
    @inline
    def apply(
        componentTypeId: js.UndefOr[ComponentTypeId] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        properties: js.UndefOr[PropertyRequests] = js.undefined,
        propertyGroups: js.UndefOr[ComponentPropertyGroupRequests] = js.undefined
    ): ComponentRequest = {
      val __obj = js.Dynamic.literal()
      componentTypeId.foreach(__v => __obj.updateDynamic("componentTypeId")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      properties.foreach(__v => __obj.updateDynamic("properties")(__v.asInstanceOf[js.Any]))
      propertyGroups.foreach(__v => __obj.updateDynamic("propertyGroups")(__v.asInstanceOf[js.Any]))
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
    var propertyGroups: js.UndefOr[ComponentPropertyGroupResponses]
    var status: js.UndefOr[Status]
    var syncSource: js.UndefOr[SyncSource]
  }

  object ComponentResponse {
    @inline
    def apply(
        componentName: js.UndefOr[Name] = js.undefined,
        componentTypeId: js.UndefOr[ComponentTypeId] = js.undefined,
        definedIn: js.UndefOr[String] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        properties: js.UndefOr[PropertyResponses] = js.undefined,
        propertyGroups: js.UndefOr[ComponentPropertyGroupResponses] = js.undefined,
        status: js.UndefOr[Status] = js.undefined,
        syncSource: js.UndefOr[SyncSource] = js.undefined
    ): ComponentResponse = {
      val __obj = js.Dynamic.literal()
      componentName.foreach(__v => __obj.updateDynamic("componentName")(__v.asInstanceOf[js.Any]))
      componentTypeId.foreach(__v => __obj.updateDynamic("componentTypeId")(__v.asInstanceOf[js.Any]))
      definedIn.foreach(__v => __obj.updateDynamic("definedIn")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      properties.foreach(__v => __obj.updateDynamic("properties")(__v.asInstanceOf[js.Any]))
      propertyGroups.foreach(__v => __obj.updateDynamic("propertyGroups")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      syncSource.foreach(__v => __obj.updateDynamic("syncSource")(__v.asInstanceOf[js.Any]))
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
    var componentTypeName: js.UndefOr[ComponentTypeName]
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
        componentTypeName: js.UndefOr[ComponentTypeName] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        status: js.UndefOr[Status] = js.undefined
    ): ComponentTypeSummary = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "componentTypeId" -> componentTypeId.asInstanceOf[js.Any],
        "creationDateTime" -> creationDateTime.asInstanceOf[js.Any],
        "updateDateTime" -> updateDateTime.asInstanceOf[js.Any]
      )

      componentTypeName.foreach(__v => __obj.updateDynamic("componentTypeName")(__v.asInstanceOf[js.Any]))
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
    var propertyGroupUpdates: js.UndefOr[ComponentPropertyGroupRequests]
    var propertyUpdates: js.UndefOr[PropertyRequests]
    var updateType: js.UndefOr[ComponentUpdateType]
  }

  object ComponentUpdateRequest {
    @inline
    def apply(
        componentTypeId: js.UndefOr[ComponentTypeId] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        propertyGroupUpdates: js.UndefOr[ComponentPropertyGroupRequests] = js.undefined,
        propertyUpdates: js.UndefOr[PropertyRequests] = js.undefined,
        updateType: js.UndefOr[ComponentUpdateType] = js.undefined
    ): ComponentUpdateRequest = {
      val __obj = js.Dynamic.literal()
      componentTypeId.foreach(__v => __obj.updateDynamic("componentTypeId")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      propertyGroupUpdates.foreach(__v => __obj.updateDynamic("propertyGroupUpdates")(__v.asInstanceOf[js.Any]))
      propertyUpdates.foreach(__v => __obj.updateDynamic("propertyUpdates")(__v.asInstanceOf[js.Any]))
      updateType.foreach(__v => __obj.updateDynamic("updateType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComponentUpdateRequest]
    }
  }

  @js.native
  trait CreateComponentTypeRequest extends js.Object {
    var componentTypeId: ComponentTypeId
    var workspaceId: Id
    var componentTypeName: js.UndefOr[ComponentTypeName]
    var description: js.UndefOr[Description]
    var extendsFrom: js.UndefOr[ExtendsFrom]
    var functions: js.UndefOr[FunctionsRequest]
    var isSingleton: js.UndefOr[Boolean]
    var propertyDefinitions: js.UndefOr[PropertyDefinitionsRequest]
    var propertyGroups: js.UndefOr[PropertyGroupsRequest]
    var tags: js.UndefOr[TagMap]
  }

  object CreateComponentTypeRequest {
    @inline
    def apply(
        componentTypeId: ComponentTypeId,
        workspaceId: Id,
        componentTypeName: js.UndefOr[ComponentTypeName] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        extendsFrom: js.UndefOr[ExtendsFrom] = js.undefined,
        functions: js.UndefOr[FunctionsRequest] = js.undefined,
        isSingleton: js.UndefOr[Boolean] = js.undefined,
        propertyDefinitions: js.UndefOr[PropertyDefinitionsRequest] = js.undefined,
        propertyGroups: js.UndefOr[PropertyGroupsRequest] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateComponentTypeRequest = {
      val __obj = js.Dynamic.literal(
        "componentTypeId" -> componentTypeId.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      componentTypeName.foreach(__v => __obj.updateDynamic("componentTypeName")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      extendsFrom.foreach(__v => __obj.updateDynamic("extendsFrom")(__v.asInstanceOf[js.Any]))
      functions.foreach(__v => __obj.updateDynamic("functions")(__v.asInstanceOf[js.Any]))
      isSingleton.foreach(__v => __obj.updateDynamic("isSingleton")(__v.asInstanceOf[js.Any]))
      propertyDefinitions.foreach(__v => __obj.updateDynamic("propertyDefinitions")(__v.asInstanceOf[js.Any]))
      propertyGroups.foreach(__v => __obj.updateDynamic("propertyGroups")(__v.asInstanceOf[js.Any]))
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
  trait CreateSyncJobRequest extends js.Object {
    var syncRole: RoleArn
    var syncSource: SyncSource
    var workspaceId: Id
    var tags: js.UndefOr[TagMap]
  }

  object CreateSyncJobRequest {
    @inline
    def apply(
        syncRole: RoleArn,
        syncSource: SyncSource,
        workspaceId: Id,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateSyncJobRequest = {
      val __obj = js.Dynamic.literal(
        "syncRole" -> syncRole.asInstanceOf[js.Any],
        "syncSource" -> syncSource.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSyncJobRequest]
    }
  }

  @js.native
  trait CreateSyncJobResponse extends js.Object {
    var arn: TwinMakerArn
    var creationDateTime: Timestamp
    var state: SyncJobState
  }

  object CreateSyncJobResponse {
    @inline
    def apply(
        arn: TwinMakerArn,
        creationDateTime: Timestamp,
        state: SyncJobState
    ): CreateSyncJobResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "creationDateTime" -> creationDateTime.asInstanceOf[js.Any],
        "state" -> state.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateSyncJobResponse]
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
  trait DeleteSyncJobRequest extends js.Object {
    var syncSource: SyncSource
    var workspaceId: Id
  }

  object DeleteSyncJobRequest {
    @inline
    def apply(
        syncSource: SyncSource,
        workspaceId: Id
    ): DeleteSyncJobRequest = {
      val __obj = js.Dynamic.literal(
        "syncSource" -> syncSource.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSyncJobRequest]
    }
  }

  @js.native
  trait DeleteSyncJobResponse extends js.Object {
    var state: SyncJobState
  }

  object DeleteSyncJobResponse {
    @inline
    def apply(
        state: SyncJobState
    ): DeleteSyncJobResponse = {
      val __obj = js.Dynamic.literal(
        "state" -> state.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSyncJobResponse]
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

  @js.native
  trait ExecuteQueryRequest extends js.Object {
    var queryStatement: QueryStatement
    var workspaceId: Id
    var maxResults: js.UndefOr[QueryServiceMaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ExecuteQueryRequest {
    @inline
    def apply(
        queryStatement: QueryStatement,
        workspaceId: Id,
        maxResults: js.UndefOr[QueryServiceMaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ExecuteQueryRequest = {
      val __obj = js.Dynamic.literal(
        "queryStatement" -> queryStatement.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecuteQueryRequest]
    }
  }

  @js.native
  trait ExecuteQueryResponse extends js.Object {
    var columnDescriptions: js.UndefOr[ColumnDescriptions]
    var nextToken: js.UndefOr[NextToken]
    var rows: js.UndefOr[Rows]
  }

  object ExecuteQueryResponse {
    @inline
    def apply(
        columnDescriptions: js.UndefOr[ColumnDescriptions] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        rows: js.UndefOr[Rows] = js.undefined
    ): ExecuteQueryResponse = {
      val __obj = js.Dynamic.literal()
      columnDescriptions.foreach(__v => __obj.updateDynamic("columnDescriptions")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      rows.foreach(__v => __obj.updateDynamic("rows")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecuteQueryResponse]
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
    var componentTypeName: js.UndefOr[ComponentTypeName]
    var description: js.UndefOr[Description]
    var extendsFrom: js.UndefOr[ExtendsFrom]
    var functions: js.UndefOr[FunctionsResponse]
    var isAbstract: js.UndefOr[Boolean]
    var isSchemaInitialized: js.UndefOr[Boolean]
    var isSingleton: js.UndefOr[Boolean]
    var propertyDefinitions: js.UndefOr[PropertyDefinitionsResponse]
    var propertyGroups: js.UndefOr[PropertyGroupsResponse]
    var status: js.UndefOr[Status]
    var syncSource: js.UndefOr[SyncSource]
  }

  object GetComponentTypeResponse {
    @inline
    def apply(
        arn: TwinMakerArn,
        componentTypeId: ComponentTypeId,
        creationDateTime: Timestamp,
        updateDateTime: Timestamp,
        workspaceId: Id,
        componentTypeName: js.UndefOr[ComponentTypeName] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        extendsFrom: js.UndefOr[ExtendsFrom] = js.undefined,
        functions: js.UndefOr[FunctionsResponse] = js.undefined,
        isAbstract: js.UndefOr[Boolean] = js.undefined,
        isSchemaInitialized: js.UndefOr[Boolean] = js.undefined,
        isSingleton: js.UndefOr[Boolean] = js.undefined,
        propertyDefinitions: js.UndefOr[PropertyDefinitionsResponse] = js.undefined,
        propertyGroups: js.UndefOr[PropertyGroupsResponse] = js.undefined,
        status: js.UndefOr[Status] = js.undefined,
        syncSource: js.UndefOr[SyncSource] = js.undefined
    ): GetComponentTypeResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "componentTypeId" -> componentTypeId.asInstanceOf[js.Any],
        "creationDateTime" -> creationDateTime.asInstanceOf[js.Any],
        "updateDateTime" -> updateDateTime.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      componentTypeName.foreach(__v => __obj.updateDynamic("componentTypeName")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      extendsFrom.foreach(__v => __obj.updateDynamic("extendsFrom")(__v.asInstanceOf[js.Any]))
      functions.foreach(__v => __obj.updateDynamic("functions")(__v.asInstanceOf[js.Any]))
      isAbstract.foreach(__v => __obj.updateDynamic("isAbstract")(__v.asInstanceOf[js.Any]))
      isSchemaInitialized.foreach(__v => __obj.updateDynamic("isSchemaInitialized")(__v.asInstanceOf[js.Any]))
      isSingleton.foreach(__v => __obj.updateDynamic("isSingleton")(__v.asInstanceOf[js.Any]))
      propertyDefinitions.foreach(__v => __obj.updateDynamic("propertyDefinitions")(__v.asInstanceOf[js.Any]))
      propertyGroups.foreach(__v => __obj.updateDynamic("propertyGroups")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      syncSource.foreach(__v => __obj.updateDynamic("syncSource")(__v.asInstanceOf[js.Any]))
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
    var syncSource: js.UndefOr[SyncSource]
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
        description: js.UndefOr[Description] = js.undefined,
        syncSource: js.UndefOr[SyncSource] = js.undefined
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
      syncSource.foreach(__v => __obj.updateDynamic("syncSource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEntityResponse]
    }
  }

  @js.native
  trait GetPricingPlanRequest extends js.Object

  object GetPricingPlanRequest {
    @inline
    def apply(): GetPricingPlanRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetPricingPlanRequest]
    }
  }

  @js.native
  trait GetPricingPlanResponse extends js.Object {
    var currentPricingPlan: PricingPlan
    var pendingPricingPlan: js.UndefOr[PricingPlan]
  }

  object GetPricingPlanResponse {
    @inline
    def apply(
        currentPricingPlan: PricingPlan,
        pendingPricingPlan: js.UndefOr[PricingPlan] = js.undefined
    ): GetPricingPlanResponse = {
      val __obj = js.Dynamic.literal(
        "currentPricingPlan" -> currentPricingPlan.asInstanceOf[js.Any]
      )

      pendingPricingPlan.foreach(__v => __obj.updateDynamic("pendingPricingPlan")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPricingPlanResponse]
    }
  }

  @js.native
  trait GetPropertyValueHistoryRequest extends js.Object {
    var selectedProperties: SelectedPropertyList
    var workspaceId: Id
    var componentName: js.UndefOr[Name]
    var componentTypeId: js.UndefOr[ComponentTypeId]
    var endDateTime: js.UndefOr[Timestamp]
    var endTime: js.UndefOr[Time]
    var entityId: js.UndefOr[EntityId]
    var interpolation: js.UndefOr[InterpolationParameters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var orderByTime: js.UndefOr[OrderByTime]
    var propertyFilters: js.UndefOr[PropertyFilters]
    var startDateTime: js.UndefOr[Timestamp]
    var startTime: js.UndefOr[Time]
  }

  object GetPropertyValueHistoryRequest {
    @inline
    def apply(
        selectedProperties: SelectedPropertyList,
        workspaceId: Id,
        componentName: js.UndefOr[Name] = js.undefined,
        componentTypeId: js.UndefOr[ComponentTypeId] = js.undefined,
        endDateTime: js.UndefOr[Timestamp] = js.undefined,
        endTime: js.UndefOr[Time] = js.undefined,
        entityId: js.UndefOr[EntityId] = js.undefined,
        interpolation: js.UndefOr[InterpolationParameters] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        orderByTime: js.UndefOr[OrderByTime] = js.undefined,
        propertyFilters: js.UndefOr[PropertyFilters] = js.undefined,
        startDateTime: js.UndefOr[Timestamp] = js.undefined,
        startTime: js.UndefOr[Time] = js.undefined
    ): GetPropertyValueHistoryRequest = {
      val __obj = js.Dynamic.literal(
        "selectedProperties" -> selectedProperties.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      componentName.foreach(__v => __obj.updateDynamic("componentName")(__v.asInstanceOf[js.Any]))
      componentTypeId.foreach(__v => __obj.updateDynamic("componentTypeId")(__v.asInstanceOf[js.Any]))
      endDateTime.foreach(__v => __obj.updateDynamic("endDateTime")(__v.asInstanceOf[js.Any]))
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      entityId.foreach(__v => __obj.updateDynamic("entityId")(__v.asInstanceOf[js.Any]))
      interpolation.foreach(__v => __obj.updateDynamic("interpolation")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      orderByTime.foreach(__v => __obj.updateDynamic("orderByTime")(__v.asInstanceOf[js.Any]))
      propertyFilters.foreach(__v => __obj.updateDynamic("propertyFilters")(__v.asInstanceOf[js.Any]))
      startDateTime.foreach(__v => __obj.updateDynamic("startDateTime")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
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
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var propertyGroupName: js.UndefOr[Name]
    var tabularConditions: js.UndefOr[TabularConditions]
  }

  object GetPropertyValueRequest {
    @inline
    def apply(
        selectedProperties: SelectedPropertyList,
        workspaceId: Id,
        componentName: js.UndefOr[Name] = js.undefined,
        componentTypeId: js.UndefOr[ComponentTypeId] = js.undefined,
        entityId: js.UndefOr[EntityId] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        propertyGroupName: js.UndefOr[Name] = js.undefined,
        tabularConditions: js.UndefOr[TabularConditions] = js.undefined
    ): GetPropertyValueRequest = {
      val __obj = js.Dynamic.literal(
        "selectedProperties" -> selectedProperties.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      componentName.foreach(__v => __obj.updateDynamic("componentName")(__v.asInstanceOf[js.Any]))
      componentTypeId.foreach(__v => __obj.updateDynamic("componentTypeId")(__v.asInstanceOf[js.Any]))
      entityId.foreach(__v => __obj.updateDynamic("entityId")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      propertyGroupName.foreach(__v => __obj.updateDynamic("propertyGroupName")(__v.asInstanceOf[js.Any]))
      tabularConditions.foreach(__v => __obj.updateDynamic("tabularConditions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPropertyValueRequest]
    }
  }

  @js.native
  trait GetPropertyValueResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var propertyValues: js.UndefOr[PropertyLatestValueMap]
    var tabularPropertyValues: js.UndefOr[TabularPropertyValues]
  }

  object GetPropertyValueResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        propertyValues: js.UndefOr[PropertyLatestValueMap] = js.undefined,
        tabularPropertyValues: js.UndefOr[TabularPropertyValues] = js.undefined
    ): GetPropertyValueResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      propertyValues.foreach(__v => __obj.updateDynamic("propertyValues")(__v.asInstanceOf[js.Any]))
      tabularPropertyValues.foreach(__v => __obj.updateDynamic("tabularPropertyValues")(__v.asInstanceOf[js.Any]))
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
  trait GetSyncJobRequest extends js.Object {
    var syncSource: SyncSource
    var workspaceId: js.UndefOr[Id]
  }

  object GetSyncJobRequest {
    @inline
    def apply(
        syncSource: SyncSource,
        workspaceId: js.UndefOr[Id] = js.undefined
    ): GetSyncJobRequest = {
      val __obj = js.Dynamic.literal(
        "syncSource" -> syncSource.asInstanceOf[js.Any]
      )

      workspaceId.foreach(__v => __obj.updateDynamic("workspaceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSyncJobRequest]
    }
  }

  @js.native
  trait GetSyncJobResponse extends js.Object {
    var arn: TwinMakerArn
    var creationDateTime: Timestamp
    var status: SyncJobStatus
    var syncRole: RoleArn
    var syncSource: SyncSource
    var updateDateTime: Timestamp
    var workspaceId: Id
  }

  object GetSyncJobResponse {
    @inline
    def apply(
        arn: TwinMakerArn,
        creationDateTime: Timestamp,
        status: SyncJobStatus,
        syncRole: RoleArn,
        syncSource: SyncSource,
        updateDateTime: Timestamp,
        workspaceId: Id
    ): GetSyncJobResponse = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "creationDateTime" -> creationDateTime.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "syncRole" -> syncRole.asInstanceOf[js.Any],
        "syncSource" -> syncSource.asInstanceOf[js.Any],
        "updateDateTime" -> updateDateTime.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSyncJobResponse]
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
    *
    * '''Note:'''Only one object is accepted as a valid input.
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
    var externalId: js.UndefOr[String]
    var parentEntityId: js.UndefOr[ParentEntityId]
  }

  object ListEntitiesFilter {
    @inline
    def apply(
        componentTypeId: js.UndefOr[ComponentTypeId] = js.undefined,
        externalId: js.UndefOr[String] = js.undefined,
        parentEntityId: js.UndefOr[ParentEntityId] = js.undefined
    ): ListEntitiesFilter = {
      val __obj = js.Dynamic.literal()
      componentTypeId.foreach(__v => __obj.updateDynamic("componentTypeId")(__v.asInstanceOf[js.Any]))
      externalId.foreach(__v => __obj.updateDynamic("externalId")(__v.asInstanceOf[js.Any]))
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
  trait ListSyncJobsRequest extends js.Object {
    var workspaceId: Id
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListSyncJobsRequest {
    @inline
    def apply(
        workspaceId: Id,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSyncJobsRequest = {
      val __obj = js.Dynamic.literal(
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSyncJobsRequest]
    }
  }

  @js.native
  trait ListSyncJobsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var syncJobSummaries: js.UndefOr[SyncJobSummaries]
  }

  object ListSyncJobsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        syncJobSummaries: js.UndefOr[SyncJobSummaries] = js.undefined
    ): ListSyncJobsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      syncJobSummaries.foreach(__v => __obj.updateDynamic("syncJobSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSyncJobsResponse]
    }
  }

  @js.native
  trait ListSyncResourcesRequest extends js.Object {
    var syncSource: SyncSource
    var workspaceId: Id
    var filters: js.UndefOr[SyncResourceFilters]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListSyncResourcesRequest {
    @inline
    def apply(
        syncSource: SyncSource,
        workspaceId: Id,
        filters: js.UndefOr[SyncResourceFilters] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSyncResourcesRequest = {
      val __obj = js.Dynamic.literal(
        "syncSource" -> syncSource.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSyncResourcesRequest]
    }
  }

  @js.native
  trait ListSyncResourcesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var syncResources: js.UndefOr[SyncResourceSummaries]
  }

  object ListSyncResourcesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        syncResources: js.UndefOr[SyncResourceSummaries] = js.undefined
    ): ListSyncResourcesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      syncResources.foreach(__v => __obj.updateDynamic("syncResources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSyncResourcesResponse]
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

  /** Filter criteria that orders the return output. It can be sorted in ascending or descending order.
    */
  @js.native
  trait OrderBy extends js.Object {
    var propertyName: String
    var order: js.UndefOr[Order]
  }

  object OrderBy {
    @inline
    def apply(
        propertyName: String,
        order: js.UndefOr[Order] = js.undefined
    ): OrderBy = {
      val __obj = js.Dynamic.literal(
        "propertyName" -> propertyName.asInstanceOf[js.Any]
      )

      order.foreach(__v => __obj.updateDynamic("order")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OrderBy]
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

  /** The pricing plan.
    */
  @js.native
  trait PricingPlan extends js.Object {
    var effectiveDateTime: Timestamp
    var pricingMode: PricingMode
    var updateDateTime: Timestamp
    var updateReason: UpdateReason
    var billableEntityCount: js.UndefOr[Double]
    var bundleInformation: js.UndefOr[BundleInformation]
  }

  object PricingPlan {
    @inline
    def apply(
        effectiveDateTime: Timestamp,
        pricingMode: PricingMode,
        updateDateTime: Timestamp,
        updateReason: UpdateReason,
        billableEntityCount: js.UndefOr[Double] = js.undefined,
        bundleInformation: js.UndefOr[BundleInformation] = js.undefined
    ): PricingPlan = {
      val __obj = js.Dynamic.literal(
        "effectiveDateTime" -> effectiveDateTime.asInstanceOf[js.Any],
        "pricingMode" -> pricingMode.asInstanceOf[js.Any],
        "updateDateTime" -> updateDateTime.asInstanceOf[js.Any],
        "updateReason" -> updateReason.asInstanceOf[js.Any]
      )

      billableEntityCount.foreach(__v => __obj.updateDynamic("billableEntityCount")(__v.asInstanceOf[js.Any]))
      bundleInformation.foreach(__v => __obj.updateDynamic("bundleInformation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PricingPlan]
    }
  }

  /** An object that sets information about a property.
    */
  @js.native
  trait PropertyDefinitionRequest extends js.Object {
    var configuration: js.UndefOr[Configuration]
    var dataType: js.UndefOr[DataType]
    var defaultValue: js.UndefOr[DataValue]
    var displayName: js.UndefOr[PropertyDisplayName]
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
        displayName: js.UndefOr[PropertyDisplayName] = js.undefined,
        isExternalId: js.UndefOr[Boolean] = js.undefined,
        isRequiredInEntity: js.UndefOr[Boolean] = js.undefined,
        isStoredExternally: js.UndefOr[Boolean] = js.undefined,
        isTimeSeries: js.UndefOr[Boolean] = js.undefined
    ): PropertyDefinitionRequest = {
      val __obj = js.Dynamic.literal()
      configuration.foreach(__v => __obj.updateDynamic("configuration")(__v.asInstanceOf[js.Any]))
      dataType.foreach(__v => __obj.updateDynamic("dataType")(__v.asInstanceOf[js.Any]))
      defaultValue.foreach(__v => __obj.updateDynamic("defaultValue")(__v.asInstanceOf[js.Any]))
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
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
    var displayName: js.UndefOr[PropertyDisplayName]
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
        defaultValue: js.UndefOr[DataValue] = js.undefined,
        displayName: js.UndefOr[PropertyDisplayName] = js.undefined
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
      displayName.foreach(__v => __obj.updateDynamic("displayName")(__v.asInstanceOf[js.Any]))
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

  /** <p/>
    */
  @js.native
  trait PropertyGroupRequest extends js.Object {
    var groupType: js.UndefOr[GroupType]
    var propertyNames: js.UndefOr[PropertyNames]
  }

  object PropertyGroupRequest {
    @inline
    def apply(
        groupType: js.UndefOr[GroupType] = js.undefined,
        propertyNames: js.UndefOr[PropertyNames] = js.undefined
    ): PropertyGroupRequest = {
      val __obj = js.Dynamic.literal()
      groupType.foreach(__v => __obj.updateDynamic("groupType")(__v.asInstanceOf[js.Any]))
      propertyNames.foreach(__v => __obj.updateDynamic("propertyNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PropertyGroupRequest]
    }
  }

  /** The property group response
    */
  @js.native
  trait PropertyGroupResponse extends js.Object {
    var groupType: GroupType
    var isInherited: Boolean
    var propertyNames: PropertyNames
  }

  object PropertyGroupResponse {
    @inline
    def apply(
        groupType: GroupType,
        isInherited: Boolean,
        propertyNames: PropertyNames
    ): PropertyGroupResponse = {
      val __obj = js.Dynamic.literal(
        "groupType" -> groupType.asInstanceOf[js.Any],
        "isInherited" -> isInherited.asInstanceOf[js.Any],
        "propertyNames" -> propertyNames.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PropertyGroupResponse]
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
    var value: DataValue
    var time: js.UndefOr[Time]
    var timestamp: js.UndefOr[Timestamp]
  }

  object PropertyValue {
    @inline
    def apply(
        value: DataValue,
        time: js.UndefOr[Time] = js.undefined,
        timestamp: js.UndefOr[Timestamp] = js.undefined
    ): PropertyValue = {
      val __obj = js.Dynamic.literal(
        "value" -> value.asInstanceOf[js.Any]
      )

      time.foreach(__v => __obj.updateDynamic("time")(__v.asInstanceOf[js.Any]))
      timestamp.foreach(__v => __obj.updateDynamic("timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PropertyValue]
    }
  }

  /** An object that specifies information about time series property values. This object is used and consumed by the [[https://docs.aws.amazon.com/iot-twinmaker/latest/apireference/API_BatchPutPropertyValues.html|BatchPutPropertyValues]] action.
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

  @js.native
  trait QueryResultValue extends js.Object

  object QueryResultValue {
    @inline
    def apply(): QueryResultValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryResultValue]
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

  /** Represents a single row in the query results.
    */
  @js.native
  trait Row extends js.Object {
    var rowData: js.UndefOr[RowData]
  }

  object Row {
    @inline
    def apply(
        rowData: js.UndefOr[RowData] = js.undefined
    ): Row = {
      val __obj = js.Dynamic.literal()
      rowData.foreach(__v => __obj.updateDynamic("rowData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Row]
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

  /** The SyncJob status.
    */
  @js.native
  trait SyncJobStatus extends js.Object {
    var error: js.UndefOr[ErrorDetails]
    var state: js.UndefOr[SyncJobState]
  }

  object SyncJobStatus {
    @inline
    def apply(
        error: js.UndefOr[ErrorDetails] = js.undefined,
        state: js.UndefOr[SyncJobState] = js.undefined
    ): SyncJobStatus = {
      val __obj = js.Dynamic.literal()
      error.foreach(__v => __obj.updateDynamic("error")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SyncJobStatus]
    }
  }

  /** The SyncJob summary.
    */
  @js.native
  trait SyncJobSummary extends js.Object {
    var arn: js.UndefOr[TwinMakerArn]
    var creationDateTime: js.UndefOr[Timestamp]
    var status: js.UndefOr[SyncJobStatus]
    var syncSource: js.UndefOr[SyncSource]
    var updateDateTime: js.UndefOr[Timestamp]
    var workspaceId: js.UndefOr[Id]
  }

  object SyncJobSummary {
    @inline
    def apply(
        arn: js.UndefOr[TwinMakerArn] = js.undefined,
        creationDateTime: js.UndefOr[Timestamp] = js.undefined,
        status: js.UndefOr[SyncJobStatus] = js.undefined,
        syncSource: js.UndefOr[SyncSource] = js.undefined,
        updateDateTime: js.UndefOr[Timestamp] = js.undefined,
        workspaceId: js.UndefOr[Id] = js.undefined
    ): SyncJobSummary = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      creationDateTime.foreach(__v => __obj.updateDynamic("creationDateTime")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      syncSource.foreach(__v => __obj.updateDynamic("syncSource")(__v.asInstanceOf[js.Any]))
      updateDateTime.foreach(__v => __obj.updateDynamic("updateDateTime")(__v.asInstanceOf[js.Any]))
      workspaceId.foreach(__v => __obj.updateDynamic("workspaceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SyncJobSummary]
    }
  }

  /** The sync resource filter.
    */
  @js.native
  trait SyncResourceFilter extends js.Object {
    var externalId: js.UndefOr[Id]
    var resourceId: js.UndefOr[Id]
    var resourceType: js.UndefOr[SyncResourceType]
    var state: js.UndefOr[SyncResourceState]
  }

  object SyncResourceFilter {
    @inline
    def apply(
        externalId: js.UndefOr[Id] = js.undefined,
        resourceId: js.UndefOr[Id] = js.undefined,
        resourceType: js.UndefOr[SyncResourceType] = js.undefined,
        state: js.UndefOr[SyncResourceState] = js.undefined
    ): SyncResourceFilter = {
      val __obj = js.Dynamic.literal()
      externalId.foreach(__v => __obj.updateDynamic("externalId")(__v.asInstanceOf[js.Any]))
      resourceId.foreach(__v => __obj.updateDynamic("resourceId")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SyncResourceFilter]
    }
  }

  /** The sync resource status.
    */
  @js.native
  trait SyncResourceStatus extends js.Object {
    var error: js.UndefOr[ErrorDetails]
    var state: js.UndefOr[SyncResourceState]
  }

  object SyncResourceStatus {
    @inline
    def apply(
        error: js.UndefOr[ErrorDetails] = js.undefined,
        state: js.UndefOr[SyncResourceState] = js.undefined
    ): SyncResourceStatus = {
      val __obj = js.Dynamic.literal()
      error.foreach(__v => __obj.updateDynamic("error")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SyncResourceStatus]
    }
  }

  /** The sync resource summary.
    */
  @js.native
  trait SyncResourceSummary extends js.Object {
    var externalId: js.UndefOr[Id]
    var resourceId: js.UndefOr[Id]
    var resourceType: js.UndefOr[SyncResourceType]
    var status: js.UndefOr[SyncResourceStatus]
    var updateDateTime: js.UndefOr[Timestamp]
  }

  object SyncResourceSummary {
    @inline
    def apply(
        externalId: js.UndefOr[Id] = js.undefined,
        resourceId: js.UndefOr[Id] = js.undefined,
        resourceType: js.UndefOr[SyncResourceType] = js.undefined,
        status: js.UndefOr[SyncResourceStatus] = js.undefined,
        updateDateTime: js.UndefOr[Timestamp] = js.undefined
    ): SyncResourceSummary = {
      val __obj = js.Dynamic.literal()
      externalId.foreach(__v => __obj.updateDynamic("externalId")(__v.asInstanceOf[js.Any]))
      resourceId.foreach(__v => __obj.updateDynamic("resourceId")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      updateDateTime.foreach(__v => __obj.updateDynamic("updateDateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SyncResourceSummary]
    }
  }

  /** The tabular conditions.
    */
  @js.native
  trait TabularConditions extends js.Object {
    var orderBy: js.UndefOr[OrderByList]
    var propertyFilters: js.UndefOr[PropertyFilters]
  }

  object TabularConditions {
    @inline
    def apply(
        orderBy: js.UndefOr[OrderByList] = js.undefined,
        propertyFilters: js.UndefOr[PropertyFilters] = js.undefined
    ): TabularConditions = {
      val __obj = js.Dynamic.literal()
      orderBy.foreach(__v => __obj.updateDynamic("orderBy")(__v.asInstanceOf[js.Any]))
      propertyFilters.foreach(__v => __obj.updateDynamic("propertyFilters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TabularConditions]
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
    var componentTypeName: js.UndefOr[ComponentTypeName]
    var description: js.UndefOr[Description]
    var extendsFrom: js.UndefOr[ExtendsFrom]
    var functions: js.UndefOr[FunctionsRequest]
    var isSingleton: js.UndefOr[Boolean]
    var propertyDefinitions: js.UndefOr[PropertyDefinitionsRequest]
    var propertyGroups: js.UndefOr[PropertyGroupsRequest]
  }

  object UpdateComponentTypeRequest {
    @inline
    def apply(
        componentTypeId: ComponentTypeId,
        workspaceId: Id,
        componentTypeName: js.UndefOr[ComponentTypeName] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        extendsFrom: js.UndefOr[ExtendsFrom] = js.undefined,
        functions: js.UndefOr[FunctionsRequest] = js.undefined,
        isSingleton: js.UndefOr[Boolean] = js.undefined,
        propertyDefinitions: js.UndefOr[PropertyDefinitionsRequest] = js.undefined,
        propertyGroups: js.UndefOr[PropertyGroupsRequest] = js.undefined
    ): UpdateComponentTypeRequest = {
      val __obj = js.Dynamic.literal(
        "componentTypeId" -> componentTypeId.asInstanceOf[js.Any],
        "workspaceId" -> workspaceId.asInstanceOf[js.Any]
      )

      componentTypeName.foreach(__v => __obj.updateDynamic("componentTypeName")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      extendsFrom.foreach(__v => __obj.updateDynamic("extendsFrom")(__v.asInstanceOf[js.Any]))
      functions.foreach(__v => __obj.updateDynamic("functions")(__v.asInstanceOf[js.Any]))
      isSingleton.foreach(__v => __obj.updateDynamic("isSingleton")(__v.asInstanceOf[js.Any]))
      propertyDefinitions.foreach(__v => __obj.updateDynamic("propertyDefinitions")(__v.asInstanceOf[js.Any]))
      propertyGroups.foreach(__v => __obj.updateDynamic("propertyGroups")(__v.asInstanceOf[js.Any]))
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
  trait UpdatePricingPlanRequest extends js.Object {
    var pricingMode: PricingMode
    var bundleNames: js.UndefOr[PricingBundles]
  }

  object UpdatePricingPlanRequest {
    @inline
    def apply(
        pricingMode: PricingMode,
        bundleNames: js.UndefOr[PricingBundles] = js.undefined
    ): UpdatePricingPlanRequest = {
      val __obj = js.Dynamic.literal(
        "pricingMode" -> pricingMode.asInstanceOf[js.Any]
      )

      bundleNames.foreach(__v => __obj.updateDynamic("bundleNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePricingPlanRequest]
    }
  }

  @js.native
  trait UpdatePricingPlanResponse extends js.Object {
    var currentPricingPlan: PricingPlan
    var pendingPricingPlan: js.UndefOr[PricingPlan]
  }

  object UpdatePricingPlanResponse {
    @inline
    def apply(
        currentPricingPlan: PricingPlan,
        pendingPricingPlan: js.UndefOr[PricingPlan] = js.undefined
    ): UpdatePricingPlanResponse = {
      val __obj = js.Dynamic.literal(
        "currentPricingPlan" -> currentPricingPlan.asInstanceOf[js.Any]
      )

      pendingPricingPlan.foreach(__v => __obj.updateDynamic("pendingPricingPlan")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePricingPlanResponse]
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
