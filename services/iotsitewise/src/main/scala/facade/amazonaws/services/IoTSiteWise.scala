package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object iotsitewise {
  type ARN = String
  type AccessPolicySummaries = js.Array[AccessPolicySummary]
  type AggregateTypes = js.Array[AggregateType]
  type AggregatedDoubleValue = Double
  type AggregatedValues = js.Array[AggregatedValue]
  type AmazonResourceName = String
  type AssetCompositeModels = js.Array[AssetCompositeModel]
  type AssetErrorMessage = String
  type AssetHierarchies = js.Array[AssetHierarchy]
  type AssetIDs = js.Array[ID]
  type AssetModelCompositeModelDefinitions = js.Array[AssetModelCompositeModelDefinition]
  type AssetModelCompositeModels = js.Array[AssetModelCompositeModel]
  type AssetModelHierarchies = js.Array[AssetModelHierarchy]
  type AssetModelHierarchyDefinitions = js.Array[AssetModelHierarchyDefinition]
  type AssetModelProperties = js.Array[AssetModelProperty]
  type AssetModelPropertyDefinitions = js.Array[AssetModelPropertyDefinition]
  type AssetModelSummaries = js.Array[AssetModelSummary]
  type AssetProperties = js.Array[AssetProperty]
  type AssetPropertyAlias = String
  type AssetPropertyValueHistory = js.Array[AssetPropertyValue]
  type AssetPropertyValues = js.Array[AssetPropertyValue]
  type AssetRelationshipSummaries = js.Array[AssetRelationshipSummary]
  type AssetSummaries = js.Array[AssetSummary]
  type AssociatedAssetsSummaries = js.Array[AssociatedAssetsSummary]
  type BatchAssociateProjectAssetsErrors = js.Array[AssetErrorDetails]
  type BatchDisassociateProjectAssetsErrors = js.Array[AssetErrorDetails]
  type BatchPutAssetPropertyErrorEntries = js.Array[BatchPutAssetPropertyErrorEntry]
  type BatchPutAssetPropertyErrors = js.Array[BatchPutAssetPropertyError]
  type CapabilityConfiguration = String
  type CapabilityNamespace = String
  type ClientToken = String
  type DashboardDefinition = String
  type DashboardSummaries = js.Array[DashboardSummary]
  type DefaultValue = String
  type Description = String
  type Email = String
  type EntryId = String
  type ErrorMessage = String
  type Expression = String
  type ExpressionVariables = js.Array[ExpressionVariable]
  type GatewayCapabilitySummaries = js.Array[GatewayCapabilitySummary]
  type GatewaySummaries = js.Array[GatewaySummary]
  type ID = String
  type IDs = js.Array[ID]
  type IdentityId = String
  type ImageFileData = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type Interval = String
  type KmsKeyId = String
  type Macro = String
  type MaxResults = Int
  type MonitorErrorMessage = String
  type Name = String
  type NextToken = String
  type OffsetInNanos = Int
  type PortalClientId = String
  type PortalSummaries = js.Array[PortalSummary]
  type ProjectSummaries = js.Array[ProjectSummary]
  type PropertyAlias = String
  type PropertyNotificationTopic = String
  type PropertyUnit = String
  type PropertyValueBooleanValue = Boolean
  type PropertyValueDoubleValue = Double
  type PropertyValueIntegerValue = Int
  type PropertyValueStringValue = String
  type PutAssetPropertyValueEntries = js.Array[PutAssetPropertyValueEntry]
  type Qualities = js.Array[Quality]
  type Resolution = String
  type SSOApplicationId = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type TimeInSeconds = Double
  type Timestamp = js.Date
  type Timestamps = js.Array[TimeInNanos]
  type Url = String
  type VariableName = String

  final class IoTSiteWiseOps(private val service: IoTSiteWise) extends AnyVal {

    @inline def associateAssetsFuture(params: AssociateAssetsRequest): Future[js.Object] = service.associateAssets(params).promise().toFuture
    @inline def batchAssociateProjectAssetsFuture(params: BatchAssociateProjectAssetsRequest): Future[BatchAssociateProjectAssetsResponse] = service.batchAssociateProjectAssets(params).promise().toFuture
    @inline def batchDisassociateProjectAssetsFuture(params: BatchDisassociateProjectAssetsRequest): Future[BatchDisassociateProjectAssetsResponse] = service.batchDisassociateProjectAssets(params).promise().toFuture
    @inline def batchPutAssetPropertyValueFuture(params: BatchPutAssetPropertyValueRequest): Future[BatchPutAssetPropertyValueResponse] = service.batchPutAssetPropertyValue(params).promise().toFuture
    @inline def createAccessPolicyFuture(params: CreateAccessPolicyRequest): Future[CreateAccessPolicyResponse] = service.createAccessPolicy(params).promise().toFuture
    @inline def createAssetFuture(params: CreateAssetRequest): Future[CreateAssetResponse] = service.createAsset(params).promise().toFuture
    @inline def createAssetModelFuture(params: CreateAssetModelRequest): Future[CreateAssetModelResponse] = service.createAssetModel(params).promise().toFuture
    @inline def createDashboardFuture(params: CreateDashboardRequest): Future[CreateDashboardResponse] = service.createDashboard(params).promise().toFuture
    @inline def createGatewayFuture(params: CreateGatewayRequest): Future[CreateGatewayResponse] = service.createGateway(params).promise().toFuture
    @inline def createPortalFuture(params: CreatePortalRequest): Future[CreatePortalResponse] = service.createPortal(params).promise().toFuture
    @inline def createProjectFuture(params: CreateProjectRequest): Future[CreateProjectResponse] = service.createProject(params).promise().toFuture
    @inline def deleteAccessPolicyFuture(params: DeleteAccessPolicyRequest): Future[DeleteAccessPolicyResponse] = service.deleteAccessPolicy(params).promise().toFuture
    @inline def deleteAssetFuture(params: DeleteAssetRequest): Future[DeleteAssetResponse] = service.deleteAsset(params).promise().toFuture
    @inline def deleteAssetModelFuture(params: DeleteAssetModelRequest): Future[DeleteAssetModelResponse] = service.deleteAssetModel(params).promise().toFuture
    @inline def deleteDashboardFuture(params: DeleteDashboardRequest): Future[DeleteDashboardResponse] = service.deleteDashboard(params).promise().toFuture
    @inline def deleteGatewayFuture(params: DeleteGatewayRequest): Future[js.Object] = service.deleteGateway(params).promise().toFuture
    @inline def deletePortalFuture(params: DeletePortalRequest): Future[DeletePortalResponse] = service.deletePortal(params).promise().toFuture
    @inline def deleteProjectFuture(params: DeleteProjectRequest): Future[DeleteProjectResponse] = service.deleteProject(params).promise().toFuture
    @inline def describeAccessPolicyFuture(params: DescribeAccessPolicyRequest): Future[DescribeAccessPolicyResponse] = service.describeAccessPolicy(params).promise().toFuture
    @inline def describeAssetFuture(params: DescribeAssetRequest): Future[DescribeAssetResponse] = service.describeAsset(params).promise().toFuture
    @inline def describeAssetModelFuture(params: DescribeAssetModelRequest): Future[DescribeAssetModelResponse] = service.describeAssetModel(params).promise().toFuture
    @inline def describeAssetPropertyFuture(params: DescribeAssetPropertyRequest): Future[DescribeAssetPropertyResponse] = service.describeAssetProperty(params).promise().toFuture
    @inline def describeDashboardFuture(params: DescribeDashboardRequest): Future[DescribeDashboardResponse] = service.describeDashboard(params).promise().toFuture
    @inline def describeDefaultEncryptionConfigurationFuture(params: DescribeDefaultEncryptionConfigurationRequest): Future[DescribeDefaultEncryptionConfigurationResponse] = service.describeDefaultEncryptionConfiguration(params).promise().toFuture
    @inline def describeGatewayCapabilityConfigurationFuture(params: DescribeGatewayCapabilityConfigurationRequest): Future[DescribeGatewayCapabilityConfigurationResponse] = service.describeGatewayCapabilityConfiguration(params).promise().toFuture
    @inline def describeGatewayFuture(params: DescribeGatewayRequest): Future[DescribeGatewayResponse] = service.describeGateway(params).promise().toFuture
    @inline def describeLoggingOptionsFuture(params: DescribeLoggingOptionsRequest): Future[DescribeLoggingOptionsResponse] = service.describeLoggingOptions(params).promise().toFuture
    @inline def describePortalFuture(params: DescribePortalRequest): Future[DescribePortalResponse] = service.describePortal(params).promise().toFuture
    @inline def describeProjectFuture(params: DescribeProjectRequest): Future[DescribeProjectResponse] = service.describeProject(params).promise().toFuture
    @inline def disassociateAssetsFuture(params: DisassociateAssetsRequest): Future[js.Object] = service.disassociateAssets(params).promise().toFuture
    @inline def getAssetPropertyAggregatesFuture(params: GetAssetPropertyAggregatesRequest): Future[GetAssetPropertyAggregatesResponse] = service.getAssetPropertyAggregates(params).promise().toFuture
    @inline def getAssetPropertyValueFuture(params: GetAssetPropertyValueRequest): Future[GetAssetPropertyValueResponse] = service.getAssetPropertyValue(params).promise().toFuture
    @inline def getAssetPropertyValueHistoryFuture(params: GetAssetPropertyValueHistoryRequest): Future[GetAssetPropertyValueHistoryResponse] = service.getAssetPropertyValueHistory(params).promise().toFuture
    @inline def listAccessPoliciesFuture(params: ListAccessPoliciesRequest): Future[ListAccessPoliciesResponse] = service.listAccessPolicies(params).promise().toFuture
    @inline def listAssetModelsFuture(params: ListAssetModelsRequest): Future[ListAssetModelsResponse] = service.listAssetModels(params).promise().toFuture
    @inline def listAssetRelationshipsFuture(params: ListAssetRelationshipsRequest): Future[ListAssetRelationshipsResponse] = service.listAssetRelationships(params).promise().toFuture
    @inline def listAssetsFuture(params: ListAssetsRequest): Future[ListAssetsResponse] = service.listAssets(params).promise().toFuture
    @inline def listAssociatedAssetsFuture(params: ListAssociatedAssetsRequest): Future[ListAssociatedAssetsResponse] = service.listAssociatedAssets(params).promise().toFuture
    @inline def listDashboardsFuture(params: ListDashboardsRequest): Future[ListDashboardsResponse] = service.listDashboards(params).promise().toFuture
    @inline def listGatewaysFuture(params: ListGatewaysRequest): Future[ListGatewaysResponse] = service.listGateways(params).promise().toFuture
    @inline def listPortalsFuture(params: ListPortalsRequest): Future[ListPortalsResponse] = service.listPortals(params).promise().toFuture
    @inline def listProjectAssetsFuture(params: ListProjectAssetsRequest): Future[ListProjectAssetsResponse] = service.listProjectAssets(params).promise().toFuture
    @inline def listProjectsFuture(params: ListProjectsRequest): Future[ListProjectsResponse] = service.listProjects(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def putDefaultEncryptionConfigurationFuture(params: PutDefaultEncryptionConfigurationRequest): Future[PutDefaultEncryptionConfigurationResponse] = service.putDefaultEncryptionConfiguration(params).promise().toFuture
    @inline def putLoggingOptionsFuture(params: PutLoggingOptionsRequest): Future[PutLoggingOptionsResponse] = service.putLoggingOptions(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateAccessPolicyFuture(params: UpdateAccessPolicyRequest): Future[UpdateAccessPolicyResponse] = service.updateAccessPolicy(params).promise().toFuture
    @inline def updateAssetFuture(params: UpdateAssetRequest): Future[UpdateAssetResponse] = service.updateAsset(params).promise().toFuture
    @inline def updateAssetModelFuture(params: UpdateAssetModelRequest): Future[UpdateAssetModelResponse] = service.updateAssetModel(params).promise().toFuture
    @inline def updateAssetPropertyFuture(params: UpdateAssetPropertyRequest): Future[js.Object] = service.updateAssetProperty(params).promise().toFuture
    @inline def updateDashboardFuture(params: UpdateDashboardRequest): Future[UpdateDashboardResponse] = service.updateDashboard(params).promise().toFuture
    @inline def updateGatewayCapabilityConfigurationFuture(params: UpdateGatewayCapabilityConfigurationRequest): Future[UpdateGatewayCapabilityConfigurationResponse] = service.updateGatewayCapabilityConfiguration(params).promise().toFuture
    @inline def updateGatewayFuture(params: UpdateGatewayRequest): Future[js.Object] = service.updateGateway(params).promise().toFuture
    @inline def updatePortalFuture(params: UpdatePortalRequest): Future[UpdatePortalResponse] = service.updatePortal(params).promise().toFuture
    @inline def updateProjectFuture(params: UpdateProjectRequest): Future[UpdateProjectResponse] = service.updateProject(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/iotsitewise", JSImport.Namespace, "AWS.IoTSiteWise")
  class IoTSiteWise() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateAssets(params: AssociateAssetsRequest): Request[js.Object] = js.native
    def batchAssociateProjectAssets(params: BatchAssociateProjectAssetsRequest): Request[BatchAssociateProjectAssetsResponse] = js.native
    def batchDisassociateProjectAssets(params: BatchDisassociateProjectAssetsRequest): Request[BatchDisassociateProjectAssetsResponse] = js.native
    def batchPutAssetPropertyValue(params: BatchPutAssetPropertyValueRequest): Request[BatchPutAssetPropertyValueResponse] = js.native
    def createAccessPolicy(params: CreateAccessPolicyRequest): Request[CreateAccessPolicyResponse] = js.native
    def createAsset(params: CreateAssetRequest): Request[CreateAssetResponse] = js.native
    def createAssetModel(params: CreateAssetModelRequest): Request[CreateAssetModelResponse] = js.native
    def createDashboard(params: CreateDashboardRequest): Request[CreateDashboardResponse] = js.native
    def createGateway(params: CreateGatewayRequest): Request[CreateGatewayResponse] = js.native
    def createPortal(params: CreatePortalRequest): Request[CreatePortalResponse] = js.native
    def createProject(params: CreateProjectRequest): Request[CreateProjectResponse] = js.native
    def deleteAccessPolicy(params: DeleteAccessPolicyRequest): Request[DeleteAccessPolicyResponse] = js.native
    def deleteAsset(params: DeleteAssetRequest): Request[DeleteAssetResponse] = js.native
    def deleteAssetModel(params: DeleteAssetModelRequest): Request[DeleteAssetModelResponse] = js.native
    def deleteDashboard(params: DeleteDashboardRequest): Request[DeleteDashboardResponse] = js.native
    def deleteGateway(params: DeleteGatewayRequest): Request[js.Object] = js.native
    def deletePortal(params: DeletePortalRequest): Request[DeletePortalResponse] = js.native
    def deleteProject(params: DeleteProjectRequest): Request[DeleteProjectResponse] = js.native
    def describeAccessPolicy(params: DescribeAccessPolicyRequest): Request[DescribeAccessPolicyResponse] = js.native
    def describeAsset(params: DescribeAssetRequest): Request[DescribeAssetResponse] = js.native
    def describeAssetModel(params: DescribeAssetModelRequest): Request[DescribeAssetModelResponse] = js.native
    def describeAssetProperty(params: DescribeAssetPropertyRequest): Request[DescribeAssetPropertyResponse] = js.native
    def describeDashboard(params: DescribeDashboardRequest): Request[DescribeDashboardResponse] = js.native
    def describeDefaultEncryptionConfiguration(params: DescribeDefaultEncryptionConfigurationRequest): Request[DescribeDefaultEncryptionConfigurationResponse] = js.native
    def describeGateway(params: DescribeGatewayRequest): Request[DescribeGatewayResponse] = js.native
    def describeGatewayCapabilityConfiguration(params: DescribeGatewayCapabilityConfigurationRequest): Request[DescribeGatewayCapabilityConfigurationResponse] = js.native
    def describeLoggingOptions(params: DescribeLoggingOptionsRequest): Request[DescribeLoggingOptionsResponse] = js.native
    def describePortal(params: DescribePortalRequest): Request[DescribePortalResponse] = js.native
    def describeProject(params: DescribeProjectRequest): Request[DescribeProjectResponse] = js.native
    def disassociateAssets(params: DisassociateAssetsRequest): Request[js.Object] = js.native
    def getAssetPropertyAggregates(params: GetAssetPropertyAggregatesRequest): Request[GetAssetPropertyAggregatesResponse] = js.native
    def getAssetPropertyValue(params: GetAssetPropertyValueRequest): Request[GetAssetPropertyValueResponse] = js.native
    def getAssetPropertyValueHistory(params: GetAssetPropertyValueHistoryRequest): Request[GetAssetPropertyValueHistoryResponse] = js.native
    def listAccessPolicies(params: ListAccessPoliciesRequest): Request[ListAccessPoliciesResponse] = js.native
    def listAssetModels(params: ListAssetModelsRequest): Request[ListAssetModelsResponse] = js.native
    def listAssetRelationships(params: ListAssetRelationshipsRequest): Request[ListAssetRelationshipsResponse] = js.native
    def listAssets(params: ListAssetsRequest): Request[ListAssetsResponse] = js.native
    def listAssociatedAssets(params: ListAssociatedAssetsRequest): Request[ListAssociatedAssetsResponse] = js.native
    def listDashboards(params: ListDashboardsRequest): Request[ListDashboardsResponse] = js.native
    def listGateways(params: ListGatewaysRequest): Request[ListGatewaysResponse] = js.native
    def listPortals(params: ListPortalsRequest): Request[ListPortalsResponse] = js.native
    def listProjectAssets(params: ListProjectAssetsRequest): Request[ListProjectAssetsResponse] = js.native
    def listProjects(params: ListProjectsRequest): Request[ListProjectsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putDefaultEncryptionConfiguration(params: PutDefaultEncryptionConfigurationRequest): Request[PutDefaultEncryptionConfigurationResponse] = js.native
    def putLoggingOptions(params: PutLoggingOptionsRequest): Request[PutLoggingOptionsResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateAccessPolicy(params: UpdateAccessPolicyRequest): Request[UpdateAccessPolicyResponse] = js.native
    def updateAsset(params: UpdateAssetRequest): Request[UpdateAssetResponse] = js.native
    def updateAssetModel(params: UpdateAssetModelRequest): Request[UpdateAssetModelResponse] = js.native
    def updateAssetProperty(params: UpdateAssetPropertyRequest): Request[js.Object] = js.native
    def updateDashboard(params: UpdateDashboardRequest): Request[UpdateDashboardResponse] = js.native
    def updateGateway(params: UpdateGatewayRequest): Request[js.Object] = js.native
    def updateGatewayCapabilityConfiguration(params: UpdateGatewayCapabilityConfigurationRequest): Request[UpdateGatewayCapabilityConfigurationResponse] = js.native
    def updatePortal(params: UpdatePortalRequest): Request[UpdatePortalResponse] = js.native
    def updateProject(params: UpdateProjectRequest): Request[UpdateProjectResponse] = js.native
  }
  object IoTSiteWise {
    @inline implicit def toOps(service: IoTSiteWise): IoTSiteWiseOps = {
      new IoTSiteWiseOps(service)
    }
  }

  /** Contains an access policy that defines an identity's access to an AWS IoT SiteWise Monitor resource.
    */
  @js.native
  trait AccessPolicySummary extends js.Object {
    var id: ID
    var identity: Identity
    var permission: Permission
    var resource: Resource
    var creationDate: js.UndefOr[Timestamp]
    var lastUpdateDate: js.UndefOr[Timestamp]
  }

  object AccessPolicySummary {
    @inline
    def apply(
        id: ID,
        identity: Identity,
        permission: Permission,
        resource: Resource,
        creationDate: js.UndefOr[Timestamp] = js.undefined,
        lastUpdateDate: js.UndefOr[Timestamp] = js.undefined
    ): AccessPolicySummary = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "identity" -> identity.asInstanceOf[js.Any],
        "permission" -> permission.asInstanceOf[js.Any],
        "resource" -> resource.asInstanceOf[js.Any]
      )

      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      lastUpdateDate.foreach(__v => __obj.updateDynamic("lastUpdateDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccessPolicySummary]
    }
  }

  /** Contains aggregated asset property values (for example, average, minimum, and maximum).
    */
  @js.native
  trait AggregatedValue extends js.Object {
    var timestamp: Timestamp
    var value: Aggregates
    var quality: js.UndefOr[Quality]
  }

  object AggregatedValue {
    @inline
    def apply(
        timestamp: Timestamp,
        value: Aggregates,
        quality: js.UndefOr[Quality] = js.undefined
    ): AggregatedValue = {
      val __obj = js.Dynamic.literal(
        "timestamp" -> timestamp.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )

      quality.foreach(__v => __obj.updateDynamic("quality")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AggregatedValue]
    }
  }

  /** Contains the (pre-calculated) aggregate values for an asset property.
    */
  @js.native
  trait Aggregates extends js.Object {
    var average: js.UndefOr[AggregatedDoubleValue]
    var count: js.UndefOr[AggregatedDoubleValue]
    var maximum: js.UndefOr[AggregatedDoubleValue]
    var minimum: js.UndefOr[AggregatedDoubleValue]
    var standardDeviation: js.UndefOr[AggregatedDoubleValue]
    var sum: js.UndefOr[AggregatedDoubleValue]
  }

  object Aggregates {
    @inline
    def apply(
        average: js.UndefOr[AggregatedDoubleValue] = js.undefined,
        count: js.UndefOr[AggregatedDoubleValue] = js.undefined,
        maximum: js.UndefOr[AggregatedDoubleValue] = js.undefined,
        minimum: js.UndefOr[AggregatedDoubleValue] = js.undefined,
        standardDeviation: js.UndefOr[AggregatedDoubleValue] = js.undefined,
        sum: js.UndefOr[AggregatedDoubleValue] = js.undefined
    ): Aggregates = {
      val __obj = js.Dynamic.literal()
      average.foreach(__v => __obj.updateDynamic("average")(__v.asInstanceOf[js.Any]))
      count.foreach(__v => __obj.updateDynamic("count")(__v.asInstanceOf[js.Any]))
      maximum.foreach(__v => __obj.updateDynamic("maximum")(__v.asInstanceOf[js.Any]))
      minimum.foreach(__v => __obj.updateDynamic("minimum")(__v.asInstanceOf[js.Any]))
      standardDeviation.foreach(__v => __obj.updateDynamic("standardDeviation")(__v.asInstanceOf[js.Any]))
      sum.foreach(__v => __obj.updateDynamic("sum")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Aggregates]
    }
  }

  /** Contains information about a composite model in an asset. This object contains the asset's properties that you define in the composite model.
    */
  @js.native
  trait AssetCompositeModel extends js.Object {
    var name: Name
    var properties: AssetProperties
    var `type`: Name
    var description: js.UndefOr[Description]
  }

  object AssetCompositeModel {
    @inline
    def apply(
        name: Name,
        properties: AssetProperties,
        `type`: Name,
        description: js.UndefOr[Description] = js.undefined
    ): AssetCompositeModel = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "properties" -> properties.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssetCompositeModel]
    }
  }

  /** Contains error details for the requested associate project asset action.
    */
  @js.native
  trait AssetErrorDetails extends js.Object {
    var assetId: ID
    var code: AssetErrorCode
    var message: AssetErrorMessage
  }

  object AssetErrorDetails {
    @inline
    def apply(
        assetId: ID,
        code: AssetErrorCode,
        message: AssetErrorMessage
    ): AssetErrorDetails = {
      val __obj = js.Dynamic.literal(
        "assetId" -> assetId.asInstanceOf[js.Any],
        "code" -> code.asInstanceOf[js.Any],
        "message" -> message.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssetErrorDetails]
    }
  }

  /** Describes an asset hierarchy that contains a hierarchy's name and ID.
    */
  @js.native
  trait AssetHierarchy extends js.Object {
    var name: Name
    var id: js.UndefOr[ID]
  }

  object AssetHierarchy {
    @inline
    def apply(
        name: Name,
        id: js.UndefOr[ID] = js.undefined
    ): AssetHierarchy = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssetHierarchy]
    }
  }

  /** Contains information about a parent asset and a child asset that are related through an asset hierarchy.
    */
  @js.native
  trait AssetHierarchyInfo extends js.Object {
    var childAssetId: js.UndefOr[ID]
    var parentAssetId: js.UndefOr[ID]
  }

  object AssetHierarchyInfo {
    @inline
    def apply(
        childAssetId: js.UndefOr[ID] = js.undefined,
        parentAssetId: js.UndefOr[ID] = js.undefined
    ): AssetHierarchyInfo = {
      val __obj = js.Dynamic.literal()
      childAssetId.foreach(__v => __obj.updateDynamic("childAssetId")(__v.asInstanceOf[js.Any]))
      parentAssetId.foreach(__v => __obj.updateDynamic("parentAssetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssetHierarchyInfo]
    }
  }

  /** Contains information about a composite model in an asset model. This object contains the asset property definitions that you define in the composite model.
    */
  @js.native
  trait AssetModelCompositeModel extends js.Object {
    var name: Name
    var `type`: Name
    var description: js.UndefOr[Description]
    var properties: js.UndefOr[AssetModelProperties]
  }

  object AssetModelCompositeModel {
    @inline
    def apply(
        name: Name,
        `type`: Name,
        description: js.UndefOr[Description] = js.undefined,
        properties: js.UndefOr[AssetModelProperties] = js.undefined
    ): AssetModelCompositeModel = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      properties.foreach(__v => __obj.updateDynamic("properties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssetModelCompositeModel]
    }
  }

  /** Contains a composite model definition in an asset model. This composite model definition is applied to all assets created from the asset model.
    */
  @js.native
  trait AssetModelCompositeModelDefinition extends js.Object {
    var name: Name
    var `type`: Name
    var description: js.UndefOr[Description]
    var properties: js.UndefOr[AssetModelPropertyDefinitions]
  }

  object AssetModelCompositeModelDefinition {
    @inline
    def apply(
        name: Name,
        `type`: Name,
        description: js.UndefOr[Description] = js.undefined,
        properties: js.UndefOr[AssetModelPropertyDefinitions] = js.undefined
    ): AssetModelCompositeModelDefinition = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      properties.foreach(__v => __obj.updateDynamic("properties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssetModelCompositeModelDefinition]
    }
  }

  /** Describes an asset hierarchy that contains a hierarchy's name, ID, and child asset model ID that specifies the type of asset that can be in this hierarchy.
    */
  @js.native
  trait AssetModelHierarchy extends js.Object {
    var childAssetModelId: ID
    var name: Name
    var id: js.UndefOr[ID]
  }

  object AssetModelHierarchy {
    @inline
    def apply(
        childAssetModelId: ID,
        name: Name,
        id: js.UndefOr[ID] = js.undefined
    ): AssetModelHierarchy = {
      val __obj = js.Dynamic.literal(
        "childAssetModelId" -> childAssetModelId.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssetModelHierarchy]
    }
  }

  /** Contains an asset model hierarchy used in asset model creation. An asset model hierarchy determines the kind (or type) of asset that can belong to a hierarchy.
    */
  @js.native
  trait AssetModelHierarchyDefinition extends js.Object {
    var childAssetModelId: ID
    var name: Name
  }

  object AssetModelHierarchyDefinition {
    @inline
    def apply(
        childAssetModelId: ID,
        name: Name
    ): AssetModelHierarchyDefinition = {
      val __obj = js.Dynamic.literal(
        "childAssetModelId" -> childAssetModelId.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssetModelHierarchyDefinition]
    }
  }

  /** Contains information about an asset model property.
    */
  @js.native
  trait AssetModelProperty extends js.Object {
    var dataType: PropertyDataType
    var name: Name
    var `type`: PropertyType
    var dataTypeSpec: js.UndefOr[Name]
    var id: js.UndefOr[ID]
    var unit: js.UndefOr[PropertyUnit]
  }

  object AssetModelProperty {
    @inline
    def apply(
        dataType: PropertyDataType,
        name: Name,
        `type`: PropertyType,
        dataTypeSpec: js.UndefOr[Name] = js.undefined,
        id: js.UndefOr[ID] = js.undefined,
        unit: js.UndefOr[PropertyUnit] = js.undefined
    ): AssetModelProperty = {
      val __obj = js.Dynamic.literal(
        "dataType" -> dataType.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      dataTypeSpec.foreach(__v => __obj.updateDynamic("dataTypeSpec")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      unit.foreach(__v => __obj.updateDynamic("unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssetModelProperty]
    }
  }

  /** Contains an asset model property definition. This property definition is applied to all assets created from the asset model.
    */
  @js.native
  trait AssetModelPropertyDefinition extends js.Object {
    var dataType: PropertyDataType
    var name: Name
    var `type`: PropertyType
    var dataTypeSpec: js.UndefOr[Name]
    var unit: js.UndefOr[PropertyUnit]
  }

  object AssetModelPropertyDefinition {
    @inline
    def apply(
        dataType: PropertyDataType,
        name: Name,
        `type`: PropertyType,
        dataTypeSpec: js.UndefOr[Name] = js.undefined,
        unit: js.UndefOr[PropertyUnit] = js.undefined
    ): AssetModelPropertyDefinition = {
      val __obj = js.Dynamic.literal(
        "dataType" -> dataType.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      dataTypeSpec.foreach(__v => __obj.updateDynamic("dataTypeSpec")(__v.asInstanceOf[js.Any]))
      unit.foreach(__v => __obj.updateDynamic("unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssetModelPropertyDefinition]
    }
  }

  /** Contains current status information for an asset model. For more information, see [[https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-and-model-states.html|Asset and model states]] in the <i>AWS IoT SiteWise User Guide</i>.
    */
  @js.native
  trait AssetModelStatus extends js.Object {
    var state: AssetModelState
    var error: js.UndefOr[ErrorDetails]
  }

  object AssetModelStatus {
    @inline
    def apply(
        state: AssetModelState,
        error: js.UndefOr[ErrorDetails] = js.undefined
    ): AssetModelStatus = {
      val __obj = js.Dynamic.literal(
        "state" -> state.asInstanceOf[js.Any]
      )

      error.foreach(__v => __obj.updateDynamic("error")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssetModelStatus]
    }
  }

  /** Contains a summary of an asset model.
    */
  @js.native
  trait AssetModelSummary extends js.Object {
    var arn: ARN
    var creationDate: Timestamp
    var description: Description
    var id: ID
    var lastUpdateDate: Timestamp
    var name: Name
    var status: AssetModelStatus
  }

  object AssetModelSummary {
    @inline
    def apply(
        arn: ARN,
        creationDate: Timestamp,
        description: Description,
        id: ID,
        lastUpdateDate: Timestamp,
        name: Name,
        status: AssetModelStatus
    ): AssetModelSummary = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "creationDate" -> creationDate.asInstanceOf[js.Any],
        "description" -> description.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "lastUpdateDate" -> lastUpdateDate.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssetModelSummary]
    }
  }

  /** Contains asset property information.
    */
  @js.native
  trait AssetProperty extends js.Object {
    var dataType: PropertyDataType
    var id: ID
    var name: Name
    var alias: js.UndefOr[PropertyAlias]
    var dataTypeSpec: js.UndefOr[Name]
    var notification: js.UndefOr[PropertyNotification]
    var unit: js.UndefOr[PropertyUnit]
  }

  object AssetProperty {
    @inline
    def apply(
        dataType: PropertyDataType,
        id: ID,
        name: Name,
        alias: js.UndefOr[PropertyAlias] = js.undefined,
        dataTypeSpec: js.UndefOr[Name] = js.undefined,
        notification: js.UndefOr[PropertyNotification] = js.undefined,
        unit: js.UndefOr[PropertyUnit] = js.undefined
    ): AssetProperty = {
      val __obj = js.Dynamic.literal(
        "dataType" -> dataType.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      alias.foreach(__v => __obj.updateDynamic("alias")(__v.asInstanceOf[js.Any]))
      dataTypeSpec.foreach(__v => __obj.updateDynamic("dataTypeSpec")(__v.asInstanceOf[js.Any]))
      notification.foreach(__v => __obj.updateDynamic("notification")(__v.asInstanceOf[js.Any]))
      unit.foreach(__v => __obj.updateDynamic("unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssetProperty]
    }
  }

  /** Contains asset property value information.
    */
  @js.native
  trait AssetPropertyValue extends js.Object {
    var timestamp: TimeInNanos
    var value: Variant
    var quality: js.UndefOr[Quality]
  }

  object AssetPropertyValue {
    @inline
    def apply(
        timestamp: TimeInNanos,
        value: Variant,
        quality: js.UndefOr[Quality] = js.undefined
    ): AssetPropertyValue = {
      val __obj = js.Dynamic.literal(
        "timestamp" -> timestamp.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )

      quality.foreach(__v => __obj.updateDynamic("quality")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssetPropertyValue]
    }
  }

  /** Contains information about assets that are related to one another.
    */
  @js.native
  trait AssetRelationshipSummary extends js.Object {
    var relationshipType: AssetRelationshipType
    var hierarchyInfo: js.UndefOr[AssetHierarchyInfo]
  }

  object AssetRelationshipSummary {
    @inline
    def apply(
        relationshipType: AssetRelationshipType,
        hierarchyInfo: js.UndefOr[AssetHierarchyInfo] = js.undefined
    ): AssetRelationshipSummary = {
      val __obj = js.Dynamic.literal(
        "relationshipType" -> relationshipType.asInstanceOf[js.Any]
      )

      hierarchyInfo.foreach(__v => __obj.updateDynamic("hierarchyInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssetRelationshipSummary]
    }
  }

  /** Contains information about the current status of an asset. For more information, see [[https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-and-model-states.html|Asset and model states]] in the <i>AWS IoT SiteWise User Guide</i>.
    */
  @js.native
  trait AssetStatus extends js.Object {
    var state: AssetState
    var error: js.UndefOr[ErrorDetails]
  }

  object AssetStatus {
    @inline
    def apply(
        state: AssetState,
        error: js.UndefOr[ErrorDetails] = js.undefined
    ): AssetStatus = {
      val __obj = js.Dynamic.literal(
        "state" -> state.asInstanceOf[js.Any]
      )

      error.foreach(__v => __obj.updateDynamic("error")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssetStatus]
    }
  }

  /** Contains a summary of an asset.
    */
  @js.native
  trait AssetSummary extends js.Object {
    var arn: ARN
    var assetModelId: ID
    var creationDate: Timestamp
    var hierarchies: AssetHierarchies
    var id: ID
    var lastUpdateDate: Timestamp
    var name: Name
    var status: AssetStatus
  }

  object AssetSummary {
    @inline
    def apply(
        arn: ARN,
        assetModelId: ID,
        creationDate: Timestamp,
        hierarchies: AssetHierarchies,
        id: ID,
        lastUpdateDate: Timestamp,
        name: Name,
        status: AssetStatus
    ): AssetSummary = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "assetModelId" -> assetModelId.asInstanceOf[js.Any],
        "creationDate" -> creationDate.asInstanceOf[js.Any],
        "hierarchies" -> hierarchies.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "lastUpdateDate" -> lastUpdateDate.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssetSummary]
    }
  }

  @js.native
  trait AssociateAssetsRequest extends js.Object {
    var assetId: ID
    var childAssetId: ID
    var hierarchyId: ID
    var clientToken: js.UndefOr[ClientToken]
  }

  object AssociateAssetsRequest {
    @inline
    def apply(
        assetId: ID,
        childAssetId: ID,
        hierarchyId: ID,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): AssociateAssetsRequest = {
      val __obj = js.Dynamic.literal(
        "assetId" -> assetId.asInstanceOf[js.Any],
        "childAssetId" -> childAssetId.asInstanceOf[js.Any],
        "hierarchyId" -> hierarchyId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateAssetsRequest]
    }
  }

  /** Contains a summary of an associated asset.
    */
  @js.native
  trait AssociatedAssetsSummary extends js.Object {
    var arn: ARN
    var assetModelId: ID
    var creationDate: Timestamp
    var hierarchies: AssetHierarchies
    var id: ID
    var lastUpdateDate: Timestamp
    var name: Name
    var status: AssetStatus
  }

  object AssociatedAssetsSummary {
    @inline
    def apply(
        arn: ARN,
        assetModelId: ID,
        creationDate: Timestamp,
        hierarchies: AssetHierarchies,
        id: ID,
        lastUpdateDate: Timestamp,
        name: Name,
        status: AssetStatus
    ): AssociatedAssetsSummary = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "assetModelId" -> assetModelId.asInstanceOf[js.Any],
        "creationDate" -> creationDate.asInstanceOf[js.Any],
        "hierarchies" -> hierarchies.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "lastUpdateDate" -> lastUpdateDate.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociatedAssetsSummary]
    }
  }

  /** Contains an asset attribute property. For more information, see [[https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html#attributes|Attributes]] in the <i>AWS IoT SiteWise User Guide</i>.
    */
  @js.native
  trait Attribute extends js.Object {
    var defaultValue: js.UndefOr[DefaultValue]
  }

  object Attribute {
    @inline
    def apply(
        defaultValue: js.UndefOr[DefaultValue] = js.undefined
    ): Attribute = {
      val __obj = js.Dynamic.literal()
      defaultValue.foreach(__v => __obj.updateDynamic("defaultValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Attribute]
    }
  }

  @js.native
  trait BatchAssociateProjectAssetsRequest extends js.Object {
    var assetIds: IDs
    var projectId: ID
    var clientToken: js.UndefOr[ClientToken]
  }

  object BatchAssociateProjectAssetsRequest {
    @inline
    def apply(
        assetIds: IDs,
        projectId: ID,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): BatchAssociateProjectAssetsRequest = {
      val __obj = js.Dynamic.literal(
        "assetIds" -> assetIds.asInstanceOf[js.Any],
        "projectId" -> projectId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchAssociateProjectAssetsRequest]
    }
  }

  @js.native
  trait BatchAssociateProjectAssetsResponse extends js.Object {
    var errors: js.UndefOr[BatchAssociateProjectAssetsErrors]
  }

  object BatchAssociateProjectAssetsResponse {
    @inline
    def apply(
        errors: js.UndefOr[BatchAssociateProjectAssetsErrors] = js.undefined
    ): BatchAssociateProjectAssetsResponse = {
      val __obj = js.Dynamic.literal()
      errors.foreach(__v => __obj.updateDynamic("errors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchAssociateProjectAssetsResponse]
    }
  }

  @js.native
  trait BatchDisassociateProjectAssetsRequest extends js.Object {
    var assetIds: IDs
    var projectId: ID
    var clientToken: js.UndefOr[ClientToken]
  }

  object BatchDisassociateProjectAssetsRequest {
    @inline
    def apply(
        assetIds: IDs,
        projectId: ID,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): BatchDisassociateProjectAssetsRequest = {
      val __obj = js.Dynamic.literal(
        "assetIds" -> assetIds.asInstanceOf[js.Any],
        "projectId" -> projectId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDisassociateProjectAssetsRequest]
    }
  }

  @js.native
  trait BatchDisassociateProjectAssetsResponse extends js.Object {
    var errors: js.UndefOr[BatchDisassociateProjectAssetsErrors]
  }

  object BatchDisassociateProjectAssetsResponse {
    @inline
    def apply(
        errors: js.UndefOr[BatchDisassociateProjectAssetsErrors] = js.undefined
    ): BatchDisassociateProjectAssetsResponse = {
      val __obj = js.Dynamic.literal()
      errors.foreach(__v => __obj.updateDynamic("errors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDisassociateProjectAssetsResponse]
    }
  }

  /** Contains error information from updating a batch of asset property values.
    */
  @js.native
  trait BatchPutAssetPropertyError extends js.Object {
    var errorCode: BatchPutAssetPropertyValueErrorCode
    var errorMessage: ErrorMessage
    var timestamps: Timestamps
  }

  object BatchPutAssetPropertyError {
    @inline
    def apply(
        errorCode: BatchPutAssetPropertyValueErrorCode,
        errorMessage: ErrorMessage,
        timestamps: Timestamps
    ): BatchPutAssetPropertyError = {
      val __obj = js.Dynamic.literal(
        "errorCode" -> errorCode.asInstanceOf[js.Any],
        "errorMessage" -> errorMessage.asInstanceOf[js.Any],
        "timestamps" -> timestamps.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchPutAssetPropertyError]
    }
  }

  /** Contains error information for asset property value entries that are associated with the [[https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_BatchPutAssetPropertyValue.html|BatchPutAssetPropertyValue]] API.
    */
  @js.native
  trait BatchPutAssetPropertyErrorEntry extends js.Object {
    var entryId: EntryId
    var errors: BatchPutAssetPropertyErrors
  }

  object BatchPutAssetPropertyErrorEntry {
    @inline
    def apply(
        entryId: EntryId,
        errors: BatchPutAssetPropertyErrors
    ): BatchPutAssetPropertyErrorEntry = {
      val __obj = js.Dynamic.literal(
        "entryId" -> entryId.asInstanceOf[js.Any],
        "errors" -> errors.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchPutAssetPropertyErrorEntry]
    }
  }

  @js.native
  trait BatchPutAssetPropertyValueRequest extends js.Object {
    var entries: PutAssetPropertyValueEntries
  }

  object BatchPutAssetPropertyValueRequest {
    @inline
    def apply(
        entries: PutAssetPropertyValueEntries
    ): BatchPutAssetPropertyValueRequest = {
      val __obj = js.Dynamic.literal(
        "entries" -> entries.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchPutAssetPropertyValueRequest]
    }
  }

  @js.native
  trait BatchPutAssetPropertyValueResponse extends js.Object {
    var errorEntries: BatchPutAssetPropertyErrorEntries
  }

  object BatchPutAssetPropertyValueResponse {
    @inline
    def apply(
        errorEntries: BatchPutAssetPropertyErrorEntries
    ): BatchPutAssetPropertyValueResponse = {
      val __obj = js.Dynamic.literal(
        "errorEntries" -> errorEntries.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchPutAssetPropertyValueResponse]
    }
  }

  /** Contains information about a composite model property on an asset.
    */
  @js.native
  trait CompositeModelProperty extends js.Object {
    var assetProperty: Property
    var name: Name
    var `type`: Name
  }

  object CompositeModelProperty {
    @inline
    def apply(
        assetProperty: Property,
        name: Name,
        `type`: Name
    ): CompositeModelProperty = {
      val __obj = js.Dynamic.literal(
        "assetProperty" -> assetProperty.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CompositeModelProperty]
    }
  }

  /** Contains the details of an AWS IoT SiteWise configuration error.
    */
  @js.native
  trait ConfigurationErrorDetails extends js.Object {
    var code: ErrorCode
    var message: ErrorMessage
  }

  object ConfigurationErrorDetails {
    @inline
    def apply(
        code: ErrorCode,
        message: ErrorMessage
    ): ConfigurationErrorDetails = {
      val __obj = js.Dynamic.literal(
        "code" -> code.asInstanceOf[js.Any],
        "message" -> message.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ConfigurationErrorDetails]
    }
  }

  /** Contains current status information for the configuration.
    */
  @js.native
  trait ConfigurationStatus extends js.Object {
    var state: ConfigurationState
    var error: js.UndefOr[ConfigurationErrorDetails]
  }

  object ConfigurationStatus {
    @inline
    def apply(
        state: ConfigurationState,
        error: js.UndefOr[ConfigurationErrorDetails] = js.undefined
    ): ConfigurationStatus = {
      val __obj = js.Dynamic.literal(
        "state" -> state.asInstanceOf[js.Any]
      )

      error.foreach(__v => __obj.updateDynamic("error")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigurationStatus]
    }
  }

  @js.native
  trait CreateAccessPolicyRequest extends js.Object {
    var accessPolicyIdentity: Identity
    var accessPolicyPermission: Permission
    var accessPolicyResource: Resource
    var clientToken: js.UndefOr[ClientToken]
    var tags: js.UndefOr[TagMap]
  }

  object CreateAccessPolicyRequest {
    @inline
    def apply(
        accessPolicyIdentity: Identity,
        accessPolicyPermission: Permission,
        accessPolicyResource: Resource,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateAccessPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "accessPolicyIdentity" -> accessPolicyIdentity.asInstanceOf[js.Any],
        "accessPolicyPermission" -> accessPolicyPermission.asInstanceOf[js.Any],
        "accessPolicyResource" -> accessPolicyResource.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAccessPolicyRequest]
    }
  }

  @js.native
  trait CreateAccessPolicyResponse extends js.Object {
    var accessPolicyArn: ARN
    var accessPolicyId: ID
  }

  object CreateAccessPolicyResponse {
    @inline
    def apply(
        accessPolicyArn: ARN,
        accessPolicyId: ID
    ): CreateAccessPolicyResponse = {
      val __obj = js.Dynamic.literal(
        "accessPolicyArn" -> accessPolicyArn.asInstanceOf[js.Any],
        "accessPolicyId" -> accessPolicyId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateAccessPolicyResponse]
    }
  }

  @js.native
  trait CreateAssetModelRequest extends js.Object {
    var assetModelName: Name
    var assetModelCompositeModels: js.UndefOr[AssetModelCompositeModelDefinitions]
    var assetModelDescription: js.UndefOr[Description]
    var assetModelHierarchies: js.UndefOr[AssetModelHierarchyDefinitions]
    var assetModelProperties: js.UndefOr[AssetModelPropertyDefinitions]
    var clientToken: js.UndefOr[ClientToken]
    var tags: js.UndefOr[TagMap]
  }

  object CreateAssetModelRequest {
    @inline
    def apply(
        assetModelName: Name,
        assetModelCompositeModels: js.UndefOr[AssetModelCompositeModelDefinitions] = js.undefined,
        assetModelDescription: js.UndefOr[Description] = js.undefined,
        assetModelHierarchies: js.UndefOr[AssetModelHierarchyDefinitions] = js.undefined,
        assetModelProperties: js.UndefOr[AssetModelPropertyDefinitions] = js.undefined,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateAssetModelRequest = {
      val __obj = js.Dynamic.literal(
        "assetModelName" -> assetModelName.asInstanceOf[js.Any]
      )

      assetModelCompositeModels.foreach(__v => __obj.updateDynamic("assetModelCompositeModels")(__v.asInstanceOf[js.Any]))
      assetModelDescription.foreach(__v => __obj.updateDynamic("assetModelDescription")(__v.asInstanceOf[js.Any]))
      assetModelHierarchies.foreach(__v => __obj.updateDynamic("assetModelHierarchies")(__v.asInstanceOf[js.Any]))
      assetModelProperties.foreach(__v => __obj.updateDynamic("assetModelProperties")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAssetModelRequest]
    }
  }

  @js.native
  trait CreateAssetModelResponse extends js.Object {
    var assetModelArn: ARN
    var assetModelId: ID
    var assetModelStatus: AssetModelStatus
  }

  object CreateAssetModelResponse {
    @inline
    def apply(
        assetModelArn: ARN,
        assetModelId: ID,
        assetModelStatus: AssetModelStatus
    ): CreateAssetModelResponse = {
      val __obj = js.Dynamic.literal(
        "assetModelArn" -> assetModelArn.asInstanceOf[js.Any],
        "assetModelId" -> assetModelId.asInstanceOf[js.Any],
        "assetModelStatus" -> assetModelStatus.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateAssetModelResponse]
    }
  }

  @js.native
  trait CreateAssetRequest extends js.Object {
    var assetModelId: ID
    var assetName: Name
    var clientToken: js.UndefOr[ClientToken]
    var tags: js.UndefOr[TagMap]
  }

  object CreateAssetRequest {
    @inline
    def apply(
        assetModelId: ID,
        assetName: Name,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateAssetRequest = {
      val __obj = js.Dynamic.literal(
        "assetModelId" -> assetModelId.asInstanceOf[js.Any],
        "assetName" -> assetName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAssetRequest]
    }
  }

  @js.native
  trait CreateAssetResponse extends js.Object {
    var assetArn: ARN
    var assetId: ID
    var assetStatus: AssetStatus
  }

  object CreateAssetResponse {
    @inline
    def apply(
        assetArn: ARN,
        assetId: ID,
        assetStatus: AssetStatus
    ): CreateAssetResponse = {
      val __obj = js.Dynamic.literal(
        "assetArn" -> assetArn.asInstanceOf[js.Any],
        "assetId" -> assetId.asInstanceOf[js.Any],
        "assetStatus" -> assetStatus.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateAssetResponse]
    }
  }

  @js.native
  trait CreateDashboardRequest extends js.Object {
    var dashboardDefinition: DashboardDefinition
    var dashboardName: Name
    var projectId: ID
    var clientToken: js.UndefOr[ClientToken]
    var dashboardDescription: js.UndefOr[Description]
    var tags: js.UndefOr[TagMap]
  }

  object CreateDashboardRequest {
    @inline
    def apply(
        dashboardDefinition: DashboardDefinition,
        dashboardName: Name,
        projectId: ID,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        dashboardDescription: js.UndefOr[Description] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateDashboardRequest = {
      val __obj = js.Dynamic.literal(
        "dashboardDefinition" -> dashboardDefinition.asInstanceOf[js.Any],
        "dashboardName" -> dashboardName.asInstanceOf[js.Any],
        "projectId" -> projectId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      dashboardDescription.foreach(__v => __obj.updateDynamic("dashboardDescription")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDashboardRequest]
    }
  }

  @js.native
  trait CreateDashboardResponse extends js.Object {
    var dashboardArn: ARN
    var dashboardId: ID
  }

  object CreateDashboardResponse {
    @inline
    def apply(
        dashboardArn: ARN,
        dashboardId: ID
    ): CreateDashboardResponse = {
      val __obj = js.Dynamic.literal(
        "dashboardArn" -> dashboardArn.asInstanceOf[js.Any],
        "dashboardId" -> dashboardId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateDashboardResponse]
    }
  }

  @js.native
  trait CreateGatewayRequest extends js.Object {
    var gatewayName: Name
    var gatewayPlatform: GatewayPlatform
    var tags: js.UndefOr[TagMap]
  }

  object CreateGatewayRequest {
    @inline
    def apply(
        gatewayName: Name,
        gatewayPlatform: GatewayPlatform,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateGatewayRequest = {
      val __obj = js.Dynamic.literal(
        "gatewayName" -> gatewayName.asInstanceOf[js.Any],
        "gatewayPlatform" -> gatewayPlatform.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGatewayRequest]
    }
  }

  @js.native
  trait CreateGatewayResponse extends js.Object {
    var gatewayArn: ARN
    var gatewayId: ID
  }

  object CreateGatewayResponse {
    @inline
    def apply(
        gatewayArn: ARN,
        gatewayId: ID
    ): CreateGatewayResponse = {
      val __obj = js.Dynamic.literal(
        "gatewayArn" -> gatewayArn.asInstanceOf[js.Any],
        "gatewayId" -> gatewayId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateGatewayResponse]
    }
  }

  @js.native
  trait CreatePortalRequest extends js.Object {
    var portalContactEmail: Email
    var portalName: Name
    var roleArn: ARN
    var clientToken: js.UndefOr[ClientToken]
    var portalAuthMode: js.UndefOr[AuthMode]
    var portalDescription: js.UndefOr[Description]
    var portalLogoImageFile: js.UndefOr[ImageFile]
    var tags: js.UndefOr[TagMap]
  }

  object CreatePortalRequest {
    @inline
    def apply(
        portalContactEmail: Email,
        portalName: Name,
        roleArn: ARN,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        portalAuthMode: js.UndefOr[AuthMode] = js.undefined,
        portalDescription: js.UndefOr[Description] = js.undefined,
        portalLogoImageFile: js.UndefOr[ImageFile] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreatePortalRequest = {
      val __obj = js.Dynamic.literal(
        "portalContactEmail" -> portalContactEmail.asInstanceOf[js.Any],
        "portalName" -> portalName.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      portalAuthMode.foreach(__v => __obj.updateDynamic("portalAuthMode")(__v.asInstanceOf[js.Any]))
      portalDescription.foreach(__v => __obj.updateDynamic("portalDescription")(__v.asInstanceOf[js.Any]))
      portalLogoImageFile.foreach(__v => __obj.updateDynamic("portalLogoImageFile")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePortalRequest]
    }
  }

  @js.native
  trait CreatePortalResponse extends js.Object {
    var portalArn: ARN
    var portalId: ID
    var portalStartUrl: Url
    var portalStatus: PortalStatus
    var ssoApplicationId: SSOApplicationId
  }

  object CreatePortalResponse {
    @inline
    def apply(
        portalArn: ARN,
        portalId: ID,
        portalStartUrl: Url,
        portalStatus: PortalStatus,
        ssoApplicationId: SSOApplicationId
    ): CreatePortalResponse = {
      val __obj = js.Dynamic.literal(
        "portalArn" -> portalArn.asInstanceOf[js.Any],
        "portalId" -> portalId.asInstanceOf[js.Any],
        "portalStartUrl" -> portalStartUrl.asInstanceOf[js.Any],
        "portalStatus" -> portalStatus.asInstanceOf[js.Any],
        "ssoApplicationId" -> ssoApplicationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreatePortalResponse]
    }
  }

  @js.native
  trait CreateProjectRequest extends js.Object {
    var portalId: ID
    var projectName: Name
    var clientToken: js.UndefOr[ClientToken]
    var projectDescription: js.UndefOr[Description]
    var tags: js.UndefOr[TagMap]
  }

  object CreateProjectRequest {
    @inline
    def apply(
        portalId: ID,
        projectName: Name,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        projectDescription: js.UndefOr[Description] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateProjectRequest = {
      val __obj = js.Dynamic.literal(
        "portalId" -> portalId.asInstanceOf[js.Any],
        "projectName" -> projectName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      projectDescription.foreach(__v => __obj.updateDynamic("projectDescription")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProjectRequest]
    }
  }

  @js.native
  trait CreateProjectResponse extends js.Object {
    var projectArn: ARN
    var projectId: ID
  }

  object CreateProjectResponse {
    @inline
    def apply(
        projectArn: ARN,
        projectId: ID
    ): CreateProjectResponse = {
      val __obj = js.Dynamic.literal(
        "projectArn" -> projectArn.asInstanceOf[js.Any],
        "projectId" -> projectId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateProjectResponse]
    }
  }

  /** Contains a dashboard summary.
    */
  @js.native
  trait DashboardSummary extends js.Object {
    var id: ID
    var name: Name
    var creationDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var lastUpdateDate: js.UndefOr[Timestamp]
  }

  object DashboardSummary {
    @inline
    def apply(
        id: ID,
        name: Name,
        creationDate: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        lastUpdateDate: js.UndefOr[Timestamp] = js.undefined
    ): DashboardSummary = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      lastUpdateDate.foreach(__v => __obj.updateDynamic("lastUpdateDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DashboardSummary]
    }
  }

  @js.native
  trait DeleteAccessPolicyRequest extends js.Object {
    var accessPolicyId: ID
    var clientToken: js.UndefOr[ClientToken]
  }

  object DeleteAccessPolicyRequest {
    @inline
    def apply(
        accessPolicyId: ID,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): DeleteAccessPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "accessPolicyId" -> accessPolicyId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAccessPolicyRequest]
    }
  }

  @js.native
  trait DeleteAccessPolicyResponse extends js.Object

  object DeleteAccessPolicyResponse {
    @inline
    def apply(): DeleteAccessPolicyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteAccessPolicyResponse]
    }
  }

  @js.native
  trait DeleteAssetModelRequest extends js.Object {
    var assetModelId: ID
    var clientToken: js.UndefOr[ClientToken]
  }

  object DeleteAssetModelRequest {
    @inline
    def apply(
        assetModelId: ID,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): DeleteAssetModelRequest = {
      val __obj = js.Dynamic.literal(
        "assetModelId" -> assetModelId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAssetModelRequest]
    }
  }

  @js.native
  trait DeleteAssetModelResponse extends js.Object {
    var assetModelStatus: AssetModelStatus
  }

  object DeleteAssetModelResponse {
    @inline
    def apply(
        assetModelStatus: AssetModelStatus
    ): DeleteAssetModelResponse = {
      val __obj = js.Dynamic.literal(
        "assetModelStatus" -> assetModelStatus.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAssetModelResponse]
    }
  }

  @js.native
  trait DeleteAssetRequest extends js.Object {
    var assetId: ID
    var clientToken: js.UndefOr[ClientToken]
  }

  object DeleteAssetRequest {
    @inline
    def apply(
        assetId: ID,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): DeleteAssetRequest = {
      val __obj = js.Dynamic.literal(
        "assetId" -> assetId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAssetRequest]
    }
  }

  @js.native
  trait DeleteAssetResponse extends js.Object {
    var assetStatus: AssetStatus
  }

  object DeleteAssetResponse {
    @inline
    def apply(
        assetStatus: AssetStatus
    ): DeleteAssetResponse = {
      val __obj = js.Dynamic.literal(
        "assetStatus" -> assetStatus.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAssetResponse]
    }
  }

  @js.native
  trait DeleteDashboardRequest extends js.Object {
    var dashboardId: ID
    var clientToken: js.UndefOr[ClientToken]
  }

  object DeleteDashboardRequest {
    @inline
    def apply(
        dashboardId: ID,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): DeleteDashboardRequest = {
      val __obj = js.Dynamic.literal(
        "dashboardId" -> dashboardId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDashboardRequest]
    }
  }

  @js.native
  trait DeleteDashboardResponse extends js.Object

  object DeleteDashboardResponse {
    @inline
    def apply(): DeleteDashboardResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteDashboardResponse]
    }
  }

  @js.native
  trait DeleteGatewayRequest extends js.Object {
    var gatewayId: ID
  }

  object DeleteGatewayRequest {
    @inline
    def apply(
        gatewayId: ID
    ): DeleteGatewayRequest = {
      val __obj = js.Dynamic.literal(
        "gatewayId" -> gatewayId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteGatewayRequest]
    }
  }

  @js.native
  trait DeletePortalRequest extends js.Object {
    var portalId: ID
    var clientToken: js.UndefOr[ClientToken]
  }

  object DeletePortalRequest {
    @inline
    def apply(
        portalId: ID,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): DeletePortalRequest = {
      val __obj = js.Dynamic.literal(
        "portalId" -> portalId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePortalRequest]
    }
  }

  @js.native
  trait DeletePortalResponse extends js.Object {
    var portalStatus: PortalStatus
  }

  object DeletePortalResponse {
    @inline
    def apply(
        portalStatus: PortalStatus
    ): DeletePortalResponse = {
      val __obj = js.Dynamic.literal(
        "portalStatus" -> portalStatus.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeletePortalResponse]
    }
  }

  @js.native
  trait DeleteProjectRequest extends js.Object {
    var projectId: ID
    var clientToken: js.UndefOr[ClientToken]
  }

  object DeleteProjectRequest {
    @inline
    def apply(
        projectId: ID,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): DeleteProjectRequest = {
      val __obj = js.Dynamic.literal(
        "projectId" -> projectId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteProjectRequest]
    }
  }

  @js.native
  trait DeleteProjectResponse extends js.Object

  object DeleteProjectResponse {
    @inline
    def apply(): DeleteProjectResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteProjectResponse]
    }
  }

  @js.native
  trait DescribeAccessPolicyRequest extends js.Object {
    var accessPolicyId: ID
  }

  object DescribeAccessPolicyRequest {
    @inline
    def apply(
        accessPolicyId: ID
    ): DescribeAccessPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "accessPolicyId" -> accessPolicyId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAccessPolicyRequest]
    }
  }

  @js.native
  trait DescribeAccessPolicyResponse extends js.Object {
    var accessPolicyArn: ARN
    var accessPolicyCreationDate: Timestamp
    var accessPolicyId: ID
    var accessPolicyIdentity: Identity
    var accessPolicyLastUpdateDate: Timestamp
    var accessPolicyPermission: Permission
    var accessPolicyResource: Resource
  }

  object DescribeAccessPolicyResponse {
    @inline
    def apply(
        accessPolicyArn: ARN,
        accessPolicyCreationDate: Timestamp,
        accessPolicyId: ID,
        accessPolicyIdentity: Identity,
        accessPolicyLastUpdateDate: Timestamp,
        accessPolicyPermission: Permission,
        accessPolicyResource: Resource
    ): DescribeAccessPolicyResponse = {
      val __obj = js.Dynamic.literal(
        "accessPolicyArn" -> accessPolicyArn.asInstanceOf[js.Any],
        "accessPolicyCreationDate" -> accessPolicyCreationDate.asInstanceOf[js.Any],
        "accessPolicyId" -> accessPolicyId.asInstanceOf[js.Any],
        "accessPolicyIdentity" -> accessPolicyIdentity.asInstanceOf[js.Any],
        "accessPolicyLastUpdateDate" -> accessPolicyLastUpdateDate.asInstanceOf[js.Any],
        "accessPolicyPermission" -> accessPolicyPermission.asInstanceOf[js.Any],
        "accessPolicyResource" -> accessPolicyResource.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAccessPolicyResponse]
    }
  }

  @js.native
  trait DescribeAssetModelRequest extends js.Object {
    var assetModelId: ID
  }

  object DescribeAssetModelRequest {
    @inline
    def apply(
        assetModelId: ID
    ): DescribeAssetModelRequest = {
      val __obj = js.Dynamic.literal(
        "assetModelId" -> assetModelId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAssetModelRequest]
    }
  }

  @js.native
  trait DescribeAssetModelResponse extends js.Object {
    var assetModelArn: ARN
    var assetModelCreationDate: Timestamp
    var assetModelDescription: Description
    var assetModelHierarchies: AssetModelHierarchies
    var assetModelId: ID
    var assetModelLastUpdateDate: Timestamp
    var assetModelName: Name
    var assetModelProperties: AssetModelProperties
    var assetModelStatus: AssetModelStatus
    var assetModelCompositeModels: js.UndefOr[AssetModelCompositeModels]
  }

  object DescribeAssetModelResponse {
    @inline
    def apply(
        assetModelArn: ARN,
        assetModelCreationDate: Timestamp,
        assetModelDescription: Description,
        assetModelHierarchies: AssetModelHierarchies,
        assetModelId: ID,
        assetModelLastUpdateDate: Timestamp,
        assetModelName: Name,
        assetModelProperties: AssetModelProperties,
        assetModelStatus: AssetModelStatus,
        assetModelCompositeModels: js.UndefOr[AssetModelCompositeModels] = js.undefined
    ): DescribeAssetModelResponse = {
      val __obj = js.Dynamic.literal(
        "assetModelArn" -> assetModelArn.asInstanceOf[js.Any],
        "assetModelCreationDate" -> assetModelCreationDate.asInstanceOf[js.Any],
        "assetModelDescription" -> assetModelDescription.asInstanceOf[js.Any],
        "assetModelHierarchies" -> assetModelHierarchies.asInstanceOf[js.Any],
        "assetModelId" -> assetModelId.asInstanceOf[js.Any],
        "assetModelLastUpdateDate" -> assetModelLastUpdateDate.asInstanceOf[js.Any],
        "assetModelName" -> assetModelName.asInstanceOf[js.Any],
        "assetModelProperties" -> assetModelProperties.asInstanceOf[js.Any],
        "assetModelStatus" -> assetModelStatus.asInstanceOf[js.Any]
      )

      assetModelCompositeModels.foreach(__v => __obj.updateDynamic("assetModelCompositeModels")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAssetModelResponse]
    }
  }

  @js.native
  trait DescribeAssetPropertyRequest extends js.Object {
    var assetId: ID
    var propertyId: ID
  }

  object DescribeAssetPropertyRequest {
    @inline
    def apply(
        assetId: ID,
        propertyId: ID
    ): DescribeAssetPropertyRequest = {
      val __obj = js.Dynamic.literal(
        "assetId" -> assetId.asInstanceOf[js.Any],
        "propertyId" -> propertyId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAssetPropertyRequest]
    }
  }

  @js.native
  trait DescribeAssetPropertyResponse extends js.Object {
    var assetId: ID
    var assetModelId: ID
    var assetName: Name
    var assetProperty: js.UndefOr[Property]
    var compositeModel: js.UndefOr[CompositeModelProperty]
  }

  object DescribeAssetPropertyResponse {
    @inline
    def apply(
        assetId: ID,
        assetModelId: ID,
        assetName: Name,
        assetProperty: js.UndefOr[Property] = js.undefined,
        compositeModel: js.UndefOr[CompositeModelProperty] = js.undefined
    ): DescribeAssetPropertyResponse = {
      val __obj = js.Dynamic.literal(
        "assetId" -> assetId.asInstanceOf[js.Any],
        "assetModelId" -> assetModelId.asInstanceOf[js.Any],
        "assetName" -> assetName.asInstanceOf[js.Any]
      )

      assetProperty.foreach(__v => __obj.updateDynamic("assetProperty")(__v.asInstanceOf[js.Any]))
      compositeModel.foreach(__v => __obj.updateDynamic("compositeModel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAssetPropertyResponse]
    }
  }

  @js.native
  trait DescribeAssetRequest extends js.Object {
    var assetId: ID
  }

  object DescribeAssetRequest {
    @inline
    def apply(
        assetId: ID
    ): DescribeAssetRequest = {
      val __obj = js.Dynamic.literal(
        "assetId" -> assetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAssetRequest]
    }
  }

  @js.native
  trait DescribeAssetResponse extends js.Object {
    var assetArn: ARN
    var assetCreationDate: Timestamp
    var assetHierarchies: AssetHierarchies
    var assetId: ID
    var assetLastUpdateDate: Timestamp
    var assetModelId: ID
    var assetName: Name
    var assetProperties: AssetProperties
    var assetStatus: AssetStatus
    var assetCompositeModels: js.UndefOr[AssetCompositeModels]
  }

  object DescribeAssetResponse {
    @inline
    def apply(
        assetArn: ARN,
        assetCreationDate: Timestamp,
        assetHierarchies: AssetHierarchies,
        assetId: ID,
        assetLastUpdateDate: Timestamp,
        assetModelId: ID,
        assetName: Name,
        assetProperties: AssetProperties,
        assetStatus: AssetStatus,
        assetCompositeModels: js.UndefOr[AssetCompositeModels] = js.undefined
    ): DescribeAssetResponse = {
      val __obj = js.Dynamic.literal(
        "assetArn" -> assetArn.asInstanceOf[js.Any],
        "assetCreationDate" -> assetCreationDate.asInstanceOf[js.Any],
        "assetHierarchies" -> assetHierarchies.asInstanceOf[js.Any],
        "assetId" -> assetId.asInstanceOf[js.Any],
        "assetLastUpdateDate" -> assetLastUpdateDate.asInstanceOf[js.Any],
        "assetModelId" -> assetModelId.asInstanceOf[js.Any],
        "assetName" -> assetName.asInstanceOf[js.Any],
        "assetProperties" -> assetProperties.asInstanceOf[js.Any],
        "assetStatus" -> assetStatus.asInstanceOf[js.Any]
      )

      assetCompositeModels.foreach(__v => __obj.updateDynamic("assetCompositeModels")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAssetResponse]
    }
  }

  @js.native
  trait DescribeDashboardRequest extends js.Object {
    var dashboardId: ID
  }

  object DescribeDashboardRequest {
    @inline
    def apply(
        dashboardId: ID
    ): DescribeDashboardRequest = {
      val __obj = js.Dynamic.literal(
        "dashboardId" -> dashboardId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDashboardRequest]
    }
  }

  @js.native
  trait DescribeDashboardResponse extends js.Object {
    var dashboardArn: ARN
    var dashboardCreationDate: Timestamp
    var dashboardDefinition: DashboardDefinition
    var dashboardId: ID
    var dashboardLastUpdateDate: Timestamp
    var dashboardName: Name
    var projectId: ID
    var dashboardDescription: js.UndefOr[Description]
  }

  object DescribeDashboardResponse {
    @inline
    def apply(
        dashboardArn: ARN,
        dashboardCreationDate: Timestamp,
        dashboardDefinition: DashboardDefinition,
        dashboardId: ID,
        dashboardLastUpdateDate: Timestamp,
        dashboardName: Name,
        projectId: ID,
        dashboardDescription: js.UndefOr[Description] = js.undefined
    ): DescribeDashboardResponse = {
      val __obj = js.Dynamic.literal(
        "dashboardArn" -> dashboardArn.asInstanceOf[js.Any],
        "dashboardCreationDate" -> dashboardCreationDate.asInstanceOf[js.Any],
        "dashboardDefinition" -> dashboardDefinition.asInstanceOf[js.Any],
        "dashboardId" -> dashboardId.asInstanceOf[js.Any],
        "dashboardLastUpdateDate" -> dashboardLastUpdateDate.asInstanceOf[js.Any],
        "dashboardName" -> dashboardName.asInstanceOf[js.Any],
        "projectId" -> projectId.asInstanceOf[js.Any]
      )

      dashboardDescription.foreach(__v => __obj.updateDynamic("dashboardDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDashboardResponse]
    }
  }

  @js.native
  trait DescribeDefaultEncryptionConfigurationRequest extends js.Object

  object DescribeDefaultEncryptionConfigurationRequest {
    @inline
    def apply(): DescribeDefaultEncryptionConfigurationRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeDefaultEncryptionConfigurationRequest]
    }
  }

  @js.native
  trait DescribeDefaultEncryptionConfigurationResponse extends js.Object {
    var configurationStatus: ConfigurationStatus
    var encryptionType: EncryptionType
    var kmsKeyArn: js.UndefOr[ARN]
  }

  object DescribeDefaultEncryptionConfigurationResponse {
    @inline
    def apply(
        configurationStatus: ConfigurationStatus,
        encryptionType: EncryptionType,
        kmsKeyArn: js.UndefOr[ARN] = js.undefined
    ): DescribeDefaultEncryptionConfigurationResponse = {
      val __obj = js.Dynamic.literal(
        "configurationStatus" -> configurationStatus.asInstanceOf[js.Any],
        "encryptionType" -> encryptionType.asInstanceOf[js.Any]
      )

      kmsKeyArn.foreach(__v => __obj.updateDynamic("kmsKeyArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDefaultEncryptionConfigurationResponse]
    }
  }

  @js.native
  trait DescribeGatewayCapabilityConfigurationRequest extends js.Object {
    var capabilityNamespace: CapabilityNamespace
    var gatewayId: ID
  }

  object DescribeGatewayCapabilityConfigurationRequest {
    @inline
    def apply(
        capabilityNamespace: CapabilityNamespace,
        gatewayId: ID
    ): DescribeGatewayCapabilityConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "capabilityNamespace" -> capabilityNamespace.asInstanceOf[js.Any],
        "gatewayId" -> gatewayId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeGatewayCapabilityConfigurationRequest]
    }
  }

  @js.native
  trait DescribeGatewayCapabilityConfigurationResponse extends js.Object {
    var capabilityConfiguration: CapabilityConfiguration
    var capabilityNamespace: CapabilityNamespace
    var capabilitySyncStatus: CapabilitySyncStatus
    var gatewayId: ID
  }

  object DescribeGatewayCapabilityConfigurationResponse {
    @inline
    def apply(
        capabilityConfiguration: CapabilityConfiguration,
        capabilityNamespace: CapabilityNamespace,
        capabilitySyncStatus: CapabilitySyncStatus,
        gatewayId: ID
    ): DescribeGatewayCapabilityConfigurationResponse = {
      val __obj = js.Dynamic.literal(
        "capabilityConfiguration" -> capabilityConfiguration.asInstanceOf[js.Any],
        "capabilityNamespace" -> capabilityNamespace.asInstanceOf[js.Any],
        "capabilitySyncStatus" -> capabilitySyncStatus.asInstanceOf[js.Any],
        "gatewayId" -> gatewayId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeGatewayCapabilityConfigurationResponse]
    }
  }

  @js.native
  trait DescribeGatewayRequest extends js.Object {
    var gatewayId: ID
  }

  object DescribeGatewayRequest {
    @inline
    def apply(
        gatewayId: ID
    ): DescribeGatewayRequest = {
      val __obj = js.Dynamic.literal(
        "gatewayId" -> gatewayId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeGatewayRequest]
    }
  }

  @js.native
  trait DescribeGatewayResponse extends js.Object {
    var creationDate: Timestamp
    var gatewayArn: ARN
    var gatewayCapabilitySummaries: GatewayCapabilitySummaries
    var gatewayId: ID
    var gatewayName: Name
    var lastUpdateDate: Timestamp
    var gatewayPlatform: js.UndefOr[GatewayPlatform]
  }

  object DescribeGatewayResponse {
    @inline
    def apply(
        creationDate: Timestamp,
        gatewayArn: ARN,
        gatewayCapabilitySummaries: GatewayCapabilitySummaries,
        gatewayId: ID,
        gatewayName: Name,
        lastUpdateDate: Timestamp,
        gatewayPlatform: js.UndefOr[GatewayPlatform] = js.undefined
    ): DescribeGatewayResponse = {
      val __obj = js.Dynamic.literal(
        "creationDate" -> creationDate.asInstanceOf[js.Any],
        "gatewayArn" -> gatewayArn.asInstanceOf[js.Any],
        "gatewayCapabilitySummaries" -> gatewayCapabilitySummaries.asInstanceOf[js.Any],
        "gatewayId" -> gatewayId.asInstanceOf[js.Any],
        "gatewayName" -> gatewayName.asInstanceOf[js.Any],
        "lastUpdateDate" -> lastUpdateDate.asInstanceOf[js.Any]
      )

      gatewayPlatform.foreach(__v => __obj.updateDynamic("gatewayPlatform")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeGatewayResponse]
    }
  }

  @js.native
  trait DescribeLoggingOptionsRequest extends js.Object

  object DescribeLoggingOptionsRequest {
    @inline
    def apply(): DescribeLoggingOptionsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeLoggingOptionsRequest]
    }
  }

  @js.native
  trait DescribeLoggingOptionsResponse extends js.Object {
    var loggingOptions: LoggingOptions
  }

  object DescribeLoggingOptionsResponse {
    @inline
    def apply(
        loggingOptions: LoggingOptions
    ): DescribeLoggingOptionsResponse = {
      val __obj = js.Dynamic.literal(
        "loggingOptions" -> loggingOptions.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeLoggingOptionsResponse]
    }
  }

  @js.native
  trait DescribePortalRequest extends js.Object {
    var portalId: ID
  }

  object DescribePortalRequest {
    @inline
    def apply(
        portalId: ID
    ): DescribePortalRequest = {
      val __obj = js.Dynamic.literal(
        "portalId" -> portalId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribePortalRequest]
    }
  }

  @js.native
  trait DescribePortalResponse extends js.Object {
    var portalArn: ARN
    var portalClientId: PortalClientId
    var portalContactEmail: Email
    var portalCreationDate: Timestamp
    var portalId: ID
    var portalLastUpdateDate: Timestamp
    var portalName: Name
    var portalStartUrl: Url
    var portalStatus: PortalStatus
    var portalAuthMode: js.UndefOr[AuthMode]
    var portalDescription: js.UndefOr[Description]
    var portalLogoImageLocation: js.UndefOr[ImageLocation]
    var roleArn: js.UndefOr[ARN]
  }

  object DescribePortalResponse {
    @inline
    def apply(
        portalArn: ARN,
        portalClientId: PortalClientId,
        portalContactEmail: Email,
        portalCreationDate: Timestamp,
        portalId: ID,
        portalLastUpdateDate: Timestamp,
        portalName: Name,
        portalStartUrl: Url,
        portalStatus: PortalStatus,
        portalAuthMode: js.UndefOr[AuthMode] = js.undefined,
        portalDescription: js.UndefOr[Description] = js.undefined,
        portalLogoImageLocation: js.UndefOr[ImageLocation] = js.undefined,
        roleArn: js.UndefOr[ARN] = js.undefined
    ): DescribePortalResponse = {
      val __obj = js.Dynamic.literal(
        "portalArn" -> portalArn.asInstanceOf[js.Any],
        "portalClientId" -> portalClientId.asInstanceOf[js.Any],
        "portalContactEmail" -> portalContactEmail.asInstanceOf[js.Any],
        "portalCreationDate" -> portalCreationDate.asInstanceOf[js.Any],
        "portalId" -> portalId.asInstanceOf[js.Any],
        "portalLastUpdateDate" -> portalLastUpdateDate.asInstanceOf[js.Any],
        "portalName" -> portalName.asInstanceOf[js.Any],
        "portalStartUrl" -> portalStartUrl.asInstanceOf[js.Any],
        "portalStatus" -> portalStatus.asInstanceOf[js.Any]
      )

      portalAuthMode.foreach(__v => __obj.updateDynamic("portalAuthMode")(__v.asInstanceOf[js.Any]))
      portalDescription.foreach(__v => __obj.updateDynamic("portalDescription")(__v.asInstanceOf[js.Any]))
      portalLogoImageLocation.foreach(__v => __obj.updateDynamic("portalLogoImageLocation")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePortalResponse]
    }
  }

  @js.native
  trait DescribeProjectRequest extends js.Object {
    var projectId: ID
  }

  object DescribeProjectRequest {
    @inline
    def apply(
        projectId: ID
    ): DescribeProjectRequest = {
      val __obj = js.Dynamic.literal(
        "projectId" -> projectId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeProjectRequest]
    }
  }

  @js.native
  trait DescribeProjectResponse extends js.Object {
    var portalId: ID
    var projectArn: ARN
    var projectCreationDate: Timestamp
    var projectId: ID
    var projectLastUpdateDate: Timestamp
    var projectName: Name
    var projectDescription: js.UndefOr[Description]
  }

  object DescribeProjectResponse {
    @inline
    def apply(
        portalId: ID,
        projectArn: ARN,
        projectCreationDate: Timestamp,
        projectId: ID,
        projectLastUpdateDate: Timestamp,
        projectName: Name,
        projectDescription: js.UndefOr[Description] = js.undefined
    ): DescribeProjectResponse = {
      val __obj = js.Dynamic.literal(
        "portalId" -> portalId.asInstanceOf[js.Any],
        "projectArn" -> projectArn.asInstanceOf[js.Any],
        "projectCreationDate" -> projectCreationDate.asInstanceOf[js.Any],
        "projectId" -> projectId.asInstanceOf[js.Any],
        "projectLastUpdateDate" -> projectLastUpdateDate.asInstanceOf[js.Any],
        "projectName" -> projectName.asInstanceOf[js.Any]
      )

      projectDescription.foreach(__v => __obj.updateDynamic("projectDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProjectResponse]
    }
  }

  @js.native
  trait DisassociateAssetsRequest extends js.Object {
    var assetId: ID
    var childAssetId: ID
    var hierarchyId: ID
    var clientToken: js.UndefOr[ClientToken]
  }

  object DisassociateAssetsRequest {
    @inline
    def apply(
        assetId: ID,
        childAssetId: ID,
        hierarchyId: ID,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): DisassociateAssetsRequest = {
      val __obj = js.Dynamic.literal(
        "assetId" -> assetId.asInstanceOf[js.Any],
        "childAssetId" -> childAssetId.asInstanceOf[js.Any],
        "hierarchyId" -> hierarchyId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociateAssetsRequest]
    }
  }

  /** Contains the details of an AWS IoT SiteWise error.
    */
  @js.native
  trait ErrorDetails extends js.Object {
    var code: ErrorCode
    var message: ErrorMessage
  }

  object ErrorDetails {
    @inline
    def apply(
        code: ErrorCode,
        message: ErrorMessage
    ): ErrorDetails = {
      val __obj = js.Dynamic.literal(
        "code" -> code.asInstanceOf[js.Any],
        "message" -> message.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ErrorDetails]
    }
  }

  /** Contains expression variable information.
    */
  @js.native
  trait ExpressionVariable extends js.Object {
    var name: VariableName
    var value: VariableValue
  }

  object ExpressionVariable {
    @inline
    def apply(
        name: VariableName,
        value: VariableValue
    ): ExpressionVariable = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ExpressionVariable]
    }
  }

  /** Contains a summary of a gateway capability configuration.
    */
  @js.native
  trait GatewayCapabilitySummary extends js.Object {
    var capabilityNamespace: CapabilityNamespace
    var capabilitySyncStatus: CapabilitySyncStatus
  }

  object GatewayCapabilitySummary {
    @inline
    def apply(
        capabilityNamespace: CapabilityNamespace,
        capabilitySyncStatus: CapabilitySyncStatus
    ): GatewayCapabilitySummary = {
      val __obj = js.Dynamic.literal(
        "capabilityNamespace" -> capabilityNamespace.asInstanceOf[js.Any],
        "capabilitySyncStatus" -> capabilitySyncStatus.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GatewayCapabilitySummary]
    }
  }

  /** Contains a gateway's platform information.
    */
  @js.native
  trait GatewayPlatform extends js.Object {
    var greengrass: Greengrass
  }

  object GatewayPlatform {
    @inline
    def apply(
        greengrass: Greengrass
    ): GatewayPlatform = {
      val __obj = js.Dynamic.literal(
        "greengrass" -> greengrass.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GatewayPlatform]
    }
  }

  /** Contains a summary of a gateway.
    */
  @js.native
  trait GatewaySummary extends js.Object {
    var creationDate: Timestamp
    var gatewayId: ID
    var gatewayName: Name
    var lastUpdateDate: Timestamp
    var gatewayCapabilitySummaries: js.UndefOr[GatewayCapabilitySummaries]
  }

  object GatewaySummary {
    @inline
    def apply(
        creationDate: Timestamp,
        gatewayId: ID,
        gatewayName: Name,
        lastUpdateDate: Timestamp,
        gatewayCapabilitySummaries: js.UndefOr[GatewayCapabilitySummaries] = js.undefined
    ): GatewaySummary = {
      val __obj = js.Dynamic.literal(
        "creationDate" -> creationDate.asInstanceOf[js.Any],
        "gatewayId" -> gatewayId.asInstanceOf[js.Any],
        "gatewayName" -> gatewayName.asInstanceOf[js.Any],
        "lastUpdateDate" -> lastUpdateDate.asInstanceOf[js.Any]
      )

      gatewayCapabilitySummaries.foreach(__v => __obj.updateDynamic("gatewayCapabilitySummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GatewaySummary]
    }
  }

  @js.native
  trait GetAssetPropertyAggregatesRequest extends js.Object {
    var aggregateTypes: AggregateTypes
    var endDate: Timestamp
    var resolution: Resolution
    var startDate: Timestamp
    var assetId: js.UndefOr[ID]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var propertyAlias: js.UndefOr[AssetPropertyAlias]
    var propertyId: js.UndefOr[ID]
    var qualities: js.UndefOr[Qualities]
    var timeOrdering: js.UndefOr[TimeOrdering]
  }

  object GetAssetPropertyAggregatesRequest {
    @inline
    def apply(
        aggregateTypes: AggregateTypes,
        endDate: Timestamp,
        resolution: Resolution,
        startDate: Timestamp,
        assetId: js.UndefOr[ID] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        propertyAlias: js.UndefOr[AssetPropertyAlias] = js.undefined,
        propertyId: js.UndefOr[ID] = js.undefined,
        qualities: js.UndefOr[Qualities] = js.undefined,
        timeOrdering: js.UndefOr[TimeOrdering] = js.undefined
    ): GetAssetPropertyAggregatesRequest = {
      val __obj = js.Dynamic.literal(
        "aggregateTypes" -> aggregateTypes.asInstanceOf[js.Any],
        "endDate" -> endDate.asInstanceOf[js.Any],
        "resolution" -> resolution.asInstanceOf[js.Any],
        "startDate" -> startDate.asInstanceOf[js.Any]
      )

      assetId.foreach(__v => __obj.updateDynamic("assetId")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      propertyAlias.foreach(__v => __obj.updateDynamic("propertyAlias")(__v.asInstanceOf[js.Any]))
      propertyId.foreach(__v => __obj.updateDynamic("propertyId")(__v.asInstanceOf[js.Any]))
      qualities.foreach(__v => __obj.updateDynamic("qualities")(__v.asInstanceOf[js.Any]))
      timeOrdering.foreach(__v => __obj.updateDynamic("timeOrdering")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAssetPropertyAggregatesRequest]
    }
  }

  @js.native
  trait GetAssetPropertyAggregatesResponse extends js.Object {
    var aggregatedValues: AggregatedValues
    var nextToken: js.UndefOr[NextToken]
  }

  object GetAssetPropertyAggregatesResponse {
    @inline
    def apply(
        aggregatedValues: AggregatedValues,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetAssetPropertyAggregatesResponse = {
      val __obj = js.Dynamic.literal(
        "aggregatedValues" -> aggregatedValues.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAssetPropertyAggregatesResponse]
    }
  }

  @js.native
  trait GetAssetPropertyValueHistoryRequest extends js.Object {
    var assetId: js.UndefOr[ID]
    var endDate: js.UndefOr[Timestamp]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var propertyAlias: js.UndefOr[AssetPropertyAlias]
    var propertyId: js.UndefOr[ID]
    var qualities: js.UndefOr[Qualities]
    var startDate: js.UndefOr[Timestamp]
    var timeOrdering: js.UndefOr[TimeOrdering]
  }

  object GetAssetPropertyValueHistoryRequest {
    @inline
    def apply(
        assetId: js.UndefOr[ID] = js.undefined,
        endDate: js.UndefOr[Timestamp] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        propertyAlias: js.UndefOr[AssetPropertyAlias] = js.undefined,
        propertyId: js.UndefOr[ID] = js.undefined,
        qualities: js.UndefOr[Qualities] = js.undefined,
        startDate: js.UndefOr[Timestamp] = js.undefined,
        timeOrdering: js.UndefOr[TimeOrdering] = js.undefined
    ): GetAssetPropertyValueHistoryRequest = {
      val __obj = js.Dynamic.literal()
      assetId.foreach(__v => __obj.updateDynamic("assetId")(__v.asInstanceOf[js.Any]))
      endDate.foreach(__v => __obj.updateDynamic("endDate")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      propertyAlias.foreach(__v => __obj.updateDynamic("propertyAlias")(__v.asInstanceOf[js.Any]))
      propertyId.foreach(__v => __obj.updateDynamic("propertyId")(__v.asInstanceOf[js.Any]))
      qualities.foreach(__v => __obj.updateDynamic("qualities")(__v.asInstanceOf[js.Any]))
      startDate.foreach(__v => __obj.updateDynamic("startDate")(__v.asInstanceOf[js.Any]))
      timeOrdering.foreach(__v => __obj.updateDynamic("timeOrdering")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAssetPropertyValueHistoryRequest]
    }
  }

  @js.native
  trait GetAssetPropertyValueHistoryResponse extends js.Object {
    var assetPropertyValueHistory: AssetPropertyValueHistory
    var nextToken: js.UndefOr[NextToken]
  }

  object GetAssetPropertyValueHistoryResponse {
    @inline
    def apply(
        assetPropertyValueHistory: AssetPropertyValueHistory,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetAssetPropertyValueHistoryResponse = {
      val __obj = js.Dynamic.literal(
        "assetPropertyValueHistory" -> assetPropertyValueHistory.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAssetPropertyValueHistoryResponse]
    }
  }

  @js.native
  trait GetAssetPropertyValueRequest extends js.Object {
    var assetId: js.UndefOr[ID]
    var propertyAlias: js.UndefOr[AssetPropertyAlias]
    var propertyId: js.UndefOr[ID]
  }

  object GetAssetPropertyValueRequest {
    @inline
    def apply(
        assetId: js.UndefOr[ID] = js.undefined,
        propertyAlias: js.UndefOr[AssetPropertyAlias] = js.undefined,
        propertyId: js.UndefOr[ID] = js.undefined
    ): GetAssetPropertyValueRequest = {
      val __obj = js.Dynamic.literal()
      assetId.foreach(__v => __obj.updateDynamic("assetId")(__v.asInstanceOf[js.Any]))
      propertyAlias.foreach(__v => __obj.updateDynamic("propertyAlias")(__v.asInstanceOf[js.Any]))
      propertyId.foreach(__v => __obj.updateDynamic("propertyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAssetPropertyValueRequest]
    }
  }

  @js.native
  trait GetAssetPropertyValueResponse extends js.Object {
    var propertyValue: js.UndefOr[AssetPropertyValue]
  }

  object GetAssetPropertyValueResponse {
    @inline
    def apply(
        propertyValue: js.UndefOr[AssetPropertyValue] = js.undefined
    ): GetAssetPropertyValueResponse = {
      val __obj = js.Dynamic.literal()
      propertyValue.foreach(__v => __obj.updateDynamic("propertyValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAssetPropertyValueResponse]
    }
  }

  /** Contains details for a gateway that runs on AWS IoT Greengrass. To create a gateway that runs on AWS IoT Greengrass, you must add the IoT SiteWise connector to a Greengrass group and deploy it. Your Greengrass group must also have permissions to upload data to AWS IoT SiteWise. For more information, see [[https://docs.aws.amazon.com/iot-sitewise/latest/userguide/gateway-connector.html|Ingesting data using a gateway]] in the <i>AWS IoT SiteWise User Guide</i>.
    */
  @js.native
  trait Greengrass extends js.Object {
    var groupArn: ARN
  }

  object Greengrass {
    @inline
    def apply(
        groupArn: ARN
    ): Greengrass = {
      val __obj = js.Dynamic.literal(
        "groupArn" -> groupArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Greengrass]
    }
  }

  /** Contains information for a group identity in an access policy.
    */
  @js.native
  trait GroupIdentity extends js.Object {
    var id: IdentityId
  }

  object GroupIdentity {
    @inline
    def apply(
        id: IdentityId
    ): GroupIdentity = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GroupIdentity]
    }
  }

  /** Contains information about an AWS Identity and Access Management (IAM) role. For more information, see [[https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles.html|IAM roles]] in the <i>IAM User Guide</i>.
    */
  @js.native
  trait IAMRoleIdentity extends js.Object {
    var arn: ARN
  }

  object IAMRoleIdentity {
    @inline
    def apply(
        arn: ARN
    ): IAMRoleIdentity = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[IAMRoleIdentity]
    }
  }

  /** Contains information about an AWS Identity and Access Management (IAM) user.
    */
  @js.native
  trait IAMUserIdentity extends js.Object {
    var arn: ARN
  }

  object IAMUserIdentity {
    @inline
    def apply(
        arn: ARN
    ): IAMUserIdentity = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[IAMUserIdentity]
    }
  }

  /** Contains an identity that can access an AWS IoT SiteWise Monitor resource.
    *
    * '''Note:'''Currently, you can't use AWS APIs to retrieve AWS SSO identity IDs. You can find the AWS SSO identity IDs in the URL of user and group pages in the [[https://console.aws.amazon.com/singlesignon|AWS SSO console]].
    */
  @js.native
  trait Identity extends js.Object {
    var group: js.UndefOr[GroupIdentity]
    var iamRole: js.UndefOr[IAMRoleIdentity]
    var iamUser: js.UndefOr[IAMUserIdentity]
    var user: js.UndefOr[UserIdentity]
  }

  object Identity {
    @inline
    def apply(
        group: js.UndefOr[GroupIdentity] = js.undefined,
        iamRole: js.UndefOr[IAMRoleIdentity] = js.undefined,
        iamUser: js.UndefOr[IAMUserIdentity] = js.undefined,
        user: js.UndefOr[UserIdentity] = js.undefined
    ): Identity = {
      val __obj = js.Dynamic.literal()
      group.foreach(__v => __obj.updateDynamic("group")(__v.asInstanceOf[js.Any]))
      iamRole.foreach(__v => __obj.updateDynamic("iamRole")(__v.asInstanceOf[js.Any]))
      iamUser.foreach(__v => __obj.updateDynamic("iamUser")(__v.asInstanceOf[js.Any]))
      user.foreach(__v => __obj.updateDynamic("user")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Identity]
    }
  }

  /** Contains an image that is one of the following: * An image file. Choose this option to upload a new image. * The ID of an existing image. Choose this option to keep an existing image.
    */
  @js.native
  trait Image extends js.Object {
    var file: js.UndefOr[ImageFile]
    var id: js.UndefOr[ID]
  }

  object Image {
    @inline
    def apply(
        file: js.UndefOr[ImageFile] = js.undefined,
        id: js.UndefOr[ID] = js.undefined
    ): Image = {
      val __obj = js.Dynamic.literal()
      file.foreach(__v => __obj.updateDynamic("file")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Image]
    }
  }

  /** Contains an image file.
    */
  @js.native
  trait ImageFile extends js.Object {
    var data: ImageFileData
    var `type`: ImageFileType
  }

  object ImageFile {
    @inline
    def apply(
        data: ImageFileData,
        `type`: ImageFileType
    ): ImageFile = {
      val __obj = js.Dynamic.literal(
        "data" -> data.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ImageFile]
    }
  }

  /** Contains an image that is uploaded to AWS IoT SiteWise and available at a URL.
    */
  @js.native
  trait ImageLocation extends js.Object {
    var id: ID
    var url: Url
  }

  object ImageLocation {
    @inline
    def apply(
        id: ID,
        url: Url
    ): ImageLocation = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "url" -> url.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ImageLocation]
    }
  }

  @js.native
  trait ListAccessPoliciesRequest extends js.Object {
    var iamArn: js.UndefOr[ARN]
    var identityId: js.UndefOr[IdentityId]
    var identityType: js.UndefOr[IdentityType]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var resourceId: js.UndefOr[ID]
    var resourceType: js.UndefOr[ResourceType]
  }

  object ListAccessPoliciesRequest {
    @inline
    def apply(
        iamArn: js.UndefOr[ARN] = js.undefined,
        identityId: js.UndefOr[IdentityId] = js.undefined,
        identityType: js.UndefOr[IdentityType] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        resourceId: js.UndefOr[ID] = js.undefined,
        resourceType: js.UndefOr[ResourceType] = js.undefined
    ): ListAccessPoliciesRequest = {
      val __obj = js.Dynamic.literal()
      iamArn.foreach(__v => __obj.updateDynamic("iamArn")(__v.asInstanceOf[js.Any]))
      identityId.foreach(__v => __obj.updateDynamic("identityId")(__v.asInstanceOf[js.Any]))
      identityType.foreach(__v => __obj.updateDynamic("identityType")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      resourceId.foreach(__v => __obj.updateDynamic("resourceId")(__v.asInstanceOf[js.Any]))
      resourceType.foreach(__v => __obj.updateDynamic("resourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccessPoliciesRequest]
    }
  }

  @js.native
  trait ListAccessPoliciesResponse extends js.Object {
    var accessPolicySummaries: AccessPolicySummaries
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAccessPoliciesResponse {
    @inline
    def apply(
        accessPolicySummaries: AccessPolicySummaries,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAccessPoliciesResponse = {
      val __obj = js.Dynamic.literal(
        "accessPolicySummaries" -> accessPolicySummaries.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAccessPoliciesResponse]
    }
  }

  @js.native
  trait ListAssetModelsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAssetModelsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAssetModelsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssetModelsRequest]
    }
  }

  @js.native
  trait ListAssetModelsResponse extends js.Object {
    var assetModelSummaries: AssetModelSummaries
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAssetModelsResponse {
    @inline
    def apply(
        assetModelSummaries: AssetModelSummaries,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAssetModelsResponse = {
      val __obj = js.Dynamic.literal(
        "assetModelSummaries" -> assetModelSummaries.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssetModelsResponse]
    }
  }

  @js.native
  trait ListAssetRelationshipsRequest extends js.Object {
    var assetId: ID
    var traversalType: TraversalType
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAssetRelationshipsRequest {
    @inline
    def apply(
        assetId: ID,
        traversalType: TraversalType,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAssetRelationshipsRequest = {
      val __obj = js.Dynamic.literal(
        "assetId" -> assetId.asInstanceOf[js.Any],
        "traversalType" -> traversalType.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssetRelationshipsRequest]
    }
  }

  @js.native
  trait ListAssetRelationshipsResponse extends js.Object {
    var assetRelationshipSummaries: AssetRelationshipSummaries
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAssetRelationshipsResponse {
    @inline
    def apply(
        assetRelationshipSummaries: AssetRelationshipSummaries,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAssetRelationshipsResponse = {
      val __obj = js.Dynamic.literal(
        "assetRelationshipSummaries" -> assetRelationshipSummaries.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssetRelationshipsResponse]
    }
  }

  @js.native
  trait ListAssetsRequest extends js.Object {
    var assetModelId: js.UndefOr[ID]
    var filter: js.UndefOr[ListAssetsFilter]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAssetsRequest {
    @inline
    def apply(
        assetModelId: js.UndefOr[ID] = js.undefined,
        filter: js.UndefOr[ListAssetsFilter] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAssetsRequest = {
      val __obj = js.Dynamic.literal()
      assetModelId.foreach(__v => __obj.updateDynamic("assetModelId")(__v.asInstanceOf[js.Any]))
      filter.foreach(__v => __obj.updateDynamic("filter")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssetsRequest]
    }
  }

  @js.native
  trait ListAssetsResponse extends js.Object {
    var assetSummaries: AssetSummaries
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAssetsResponse {
    @inline
    def apply(
        assetSummaries: AssetSummaries,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAssetsResponse = {
      val __obj = js.Dynamic.literal(
        "assetSummaries" -> assetSummaries.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssetsResponse]
    }
  }

  @js.native
  trait ListAssociatedAssetsRequest extends js.Object {
    var assetId: ID
    var hierarchyId: js.UndefOr[ID]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
    var traversalDirection: js.UndefOr[TraversalDirection]
  }

  object ListAssociatedAssetsRequest {
    @inline
    def apply(
        assetId: ID,
        hierarchyId: js.UndefOr[ID] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        traversalDirection: js.UndefOr[TraversalDirection] = js.undefined
    ): ListAssociatedAssetsRequest = {
      val __obj = js.Dynamic.literal(
        "assetId" -> assetId.asInstanceOf[js.Any]
      )

      hierarchyId.foreach(__v => __obj.updateDynamic("hierarchyId")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      traversalDirection.foreach(__v => __obj.updateDynamic("traversalDirection")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssociatedAssetsRequest]
    }
  }

  @js.native
  trait ListAssociatedAssetsResponse extends js.Object {
    var assetSummaries: AssociatedAssetsSummaries
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAssociatedAssetsResponse {
    @inline
    def apply(
        assetSummaries: AssociatedAssetsSummaries,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAssociatedAssetsResponse = {
      val __obj = js.Dynamic.literal(
        "assetSummaries" -> assetSummaries.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssociatedAssetsResponse]
    }
  }

  @js.native
  trait ListDashboardsRequest extends js.Object {
    var projectId: ID
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDashboardsRequest {
    @inline
    def apply(
        projectId: ID,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDashboardsRequest = {
      val __obj = js.Dynamic.literal(
        "projectId" -> projectId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDashboardsRequest]
    }
  }

  @js.native
  trait ListDashboardsResponse extends js.Object {
    var dashboardSummaries: DashboardSummaries
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDashboardsResponse {
    @inline
    def apply(
        dashboardSummaries: DashboardSummaries,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDashboardsResponse = {
      val __obj = js.Dynamic.literal(
        "dashboardSummaries" -> dashboardSummaries.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDashboardsResponse]
    }
  }

  @js.native
  trait ListGatewaysRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListGatewaysRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGatewaysRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGatewaysRequest]
    }
  }

  @js.native
  trait ListGatewaysResponse extends js.Object {
    var gatewaySummaries: GatewaySummaries
    var nextToken: js.UndefOr[NextToken]
  }

  object ListGatewaysResponse {
    @inline
    def apply(
        gatewaySummaries: GatewaySummaries,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGatewaysResponse = {
      val __obj = js.Dynamic.literal(
        "gatewaySummaries" -> gatewaySummaries.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGatewaysResponse]
    }
  }

  @js.native
  trait ListPortalsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListPortalsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListPortalsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPortalsRequest]
    }
  }

  @js.native
  trait ListPortalsResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var portalSummaries: js.UndefOr[PortalSummaries]
  }

  object ListPortalsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        portalSummaries: js.UndefOr[PortalSummaries] = js.undefined
    ): ListPortalsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      portalSummaries.foreach(__v => __obj.updateDynamic("portalSummaries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPortalsResponse]
    }
  }

  @js.native
  trait ListProjectAssetsRequest extends js.Object {
    var projectId: ID
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListProjectAssetsRequest {
    @inline
    def apply(
        projectId: ID,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListProjectAssetsRequest = {
      val __obj = js.Dynamic.literal(
        "projectId" -> projectId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProjectAssetsRequest]
    }
  }

  @js.native
  trait ListProjectAssetsResponse extends js.Object {
    var assetIds: AssetIDs
    var nextToken: js.UndefOr[NextToken]
  }

  object ListProjectAssetsResponse {
    @inline
    def apply(
        assetIds: AssetIDs,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListProjectAssetsResponse = {
      val __obj = js.Dynamic.literal(
        "assetIds" -> assetIds.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProjectAssetsResponse]
    }
  }

  @js.native
  trait ListProjectsRequest extends js.Object {
    var portalId: ID
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListProjectsRequest {
    @inline
    def apply(
        portalId: ID,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListProjectsRequest = {
      val __obj = js.Dynamic.literal(
        "portalId" -> portalId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProjectsRequest]
    }
  }

  @js.native
  trait ListProjectsResponse extends js.Object {
    var projectSummaries: ProjectSummaries
    var nextToken: js.UndefOr[NextToken]
  }

  object ListProjectsResponse {
    @inline
    def apply(
        projectSummaries: ProjectSummaries,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListProjectsResponse = {
      val __obj = js.Dynamic.literal(
        "projectSummaries" -> projectSummaries.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProjectsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: AmazonResourceName
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: AmazonResourceName
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

  /** Contains logging options.
    */
  @js.native
  trait LoggingOptions extends js.Object {
    var level: LoggingLevel
  }

  object LoggingOptions {
    @inline
    def apply(
        level: LoggingLevel
    ): LoggingOptions = {
      val __obj = js.Dynamic.literal(
        "level" -> level.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LoggingOptions]
    }
  }

  /** Contains an asset measurement property. For more information, see [[https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html#measurements|Measurements]] in the <i>AWS IoT SiteWise User Guide</i>.
    */
  @js.native
  trait Measurement extends js.Object

  object Measurement {
    @inline
    def apply(): Measurement = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Measurement]
    }
  }

  /** Contains an asset metric property. With metrics, you can calculate aggregate functions, such as an average, maximum, or minimum, as specified through an expression. A metric maps several values to a single value (such as a sum). The maximum number of dependent/cascading variables used in any one metric calculation is 10. Therefore, a <i>root</i> metric can have up to 10 cascading metrics in its computational dependency tree. Additionally, a metric can only have a data type of <code>DOUBLE</code> and consume properties with data types of <code>INTEGER</code> or <code>DOUBLE</code>. For more information, see [[https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html#metrics|Metrics]] in the <i>AWS IoT SiteWise User Guide</i>.
    */
  @js.native
  trait Metric extends js.Object {
    var expression: Expression
    var variables: ExpressionVariables
    var window: MetricWindow
  }

  object Metric {
    @inline
    def apply(
        expression: Expression,
        variables: ExpressionVariables,
        window: MetricWindow
    ): Metric = {
      val __obj = js.Dynamic.literal(
        "expression" -> expression.asInstanceOf[js.Any],
        "variables" -> variables.asInstanceOf[js.Any],
        "window" -> window.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Metric]
    }
  }

  /** Contains a time interval window used for data aggregate computations (for example, average, sum, count, and so on).
    */
  @js.native
  trait MetricWindow extends js.Object {
    var tumbling: js.UndefOr[TumblingWindow]
  }

  object MetricWindow {
    @inline
    def apply(
        tumbling: js.UndefOr[TumblingWindow] = js.undefined
    ): MetricWindow = {
      val __obj = js.Dynamic.literal()
      tumbling.foreach(__v => __obj.updateDynamic("tumbling")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricWindow]
    }
  }

  /** Contains AWS IoT SiteWise Monitor error details.
    */
  @js.native
  trait MonitorErrorDetails extends js.Object {
    var code: js.UndefOr[MonitorErrorCode]
    var message: js.UndefOr[MonitorErrorMessage]
  }

  object MonitorErrorDetails {
    @inline
    def apply(
        code: js.UndefOr[MonitorErrorCode] = js.undefined,
        message: js.UndefOr[MonitorErrorMessage] = js.undefined
    ): MonitorErrorDetails = {
      val __obj = js.Dynamic.literal()
      code.foreach(__v => __obj.updateDynamic("code")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonitorErrorDetails]
    }
  }

  /** Identifies an AWS IoT SiteWise Monitor portal.
    */
  @js.native
  trait PortalResource extends js.Object {
    var id: ID
  }

  object PortalResource {
    @inline
    def apply(
        id: ID
    ): PortalResource = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PortalResource]
    }
  }

  /** Contains information about the current status of a portal.
    */
  @js.native
  trait PortalStatus extends js.Object {
    var state: PortalState
    var error: js.UndefOr[MonitorErrorDetails]
  }

  object PortalStatus {
    @inline
    def apply(
        state: PortalState,
        error: js.UndefOr[MonitorErrorDetails] = js.undefined
    ): PortalStatus = {
      val __obj = js.Dynamic.literal(
        "state" -> state.asInstanceOf[js.Any]
      )

      error.foreach(__v => __obj.updateDynamic("error")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PortalStatus]
    }
  }

  /** Contains a portal summary.
    */
  @js.native
  trait PortalSummary extends js.Object {
    var id: ID
    var name: Name
    var startUrl: Url
    var status: PortalStatus
    var creationDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var lastUpdateDate: js.UndefOr[Timestamp]
    var roleArn: js.UndefOr[ARN]
  }

  object PortalSummary {
    @inline
    def apply(
        id: ID,
        name: Name,
        startUrl: Url,
        status: PortalStatus,
        creationDate: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        lastUpdateDate: js.UndefOr[Timestamp] = js.undefined,
        roleArn: js.UndefOr[ARN] = js.undefined
    ): PortalSummary = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "startUrl" -> startUrl.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      lastUpdateDate.foreach(__v => __obj.updateDynamic("lastUpdateDate")(__v.asInstanceOf[js.Any]))
      roleArn.foreach(__v => __obj.updateDynamic("roleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PortalSummary]
    }
  }

  /** Identifies a specific AWS IoT SiteWise Monitor project.
    */
  @js.native
  trait ProjectResource extends js.Object {
    var id: ID
  }

  object ProjectResource {
    @inline
    def apply(
        id: ID
    ): ProjectResource = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ProjectResource]
    }
  }

  /** Contains project summary information.
    */
  @js.native
  trait ProjectSummary extends js.Object {
    var id: ID
    var name: Name
    var creationDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[Description]
    var lastUpdateDate: js.UndefOr[Timestamp]
  }

  object ProjectSummary {
    @inline
    def apply(
        id: ID,
        name: Name,
        creationDate: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        lastUpdateDate: js.UndefOr[Timestamp] = js.undefined
    ): ProjectSummary = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      creationDate.foreach(__v => __obj.updateDynamic("creationDate")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      lastUpdateDate.foreach(__v => __obj.updateDynamic("lastUpdateDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProjectSummary]
    }
  }

  /** Contains asset property information.
    */
  @js.native
  trait Property extends js.Object {
    var dataType: PropertyDataType
    var id: ID
    var name: Name
    var alias: js.UndefOr[PropertyAlias]
    var notification: js.UndefOr[PropertyNotification]
    var `type`: js.UndefOr[PropertyType]
    var unit: js.UndefOr[PropertyUnit]
  }

  object Property {
    @inline
    def apply(
        dataType: PropertyDataType,
        id: ID,
        name: Name,
        alias: js.UndefOr[PropertyAlias] = js.undefined,
        notification: js.UndefOr[PropertyNotification] = js.undefined,
        `type`: js.UndefOr[PropertyType] = js.undefined,
        unit: js.UndefOr[PropertyUnit] = js.undefined
    ): Property = {
      val __obj = js.Dynamic.literal(
        "dataType" -> dataType.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      alias.foreach(__v => __obj.updateDynamic("alias")(__v.asInstanceOf[js.Any]))
      notification.foreach(__v => __obj.updateDynamic("notification")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      unit.foreach(__v => __obj.updateDynamic("unit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Property]
    }
  }

  /** Contains asset property value notification information. When the notification state is enabled, AWS IoT SiteWise publishes property value updates to a unique MQTT topic. For more information, see [[https://docs.aws.amazon.com/iot-sitewise/latest/userguide/interact-with-other-services.html|Interacting with other services]] in the <i>AWS IoT SiteWise User Guide</i>.
    */
  @js.native
  trait PropertyNotification extends js.Object {
    var state: PropertyNotificationState
    var topic: PropertyNotificationTopic
  }

  object PropertyNotification {
    @inline
    def apply(
        state: PropertyNotificationState,
        topic: PropertyNotificationTopic
    ): PropertyNotification = {
      val __obj = js.Dynamic.literal(
        "state" -> state.asInstanceOf[js.Any],
        "topic" -> topic.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PropertyNotification]
    }
  }

  /** Contains a property type, which can be one of <code>attribute</code>, <code>measurement</code>, <code>metric</code>, or <code>transform</code>.
    */
  @js.native
  trait PropertyType extends js.Object {
    var attribute: js.UndefOr[Attribute]
    var measurement: js.UndefOr[Measurement]
    var metric: js.UndefOr[Metric]
    var transform: js.UndefOr[Transform]
  }

  object PropertyType {
    @inline
    def apply(
        attribute: js.UndefOr[Attribute] = js.undefined,
        measurement: js.UndefOr[Measurement] = js.undefined,
        metric: js.UndefOr[Metric] = js.undefined,
        transform: js.UndefOr[Transform] = js.undefined
    ): PropertyType = {
      val __obj = js.Dynamic.literal()
      attribute.foreach(__v => __obj.updateDynamic("attribute")(__v.asInstanceOf[js.Any]))
      measurement.foreach(__v => __obj.updateDynamic("measurement")(__v.asInstanceOf[js.Any]))
      metric.foreach(__v => __obj.updateDynamic("metric")(__v.asInstanceOf[js.Any]))
      transform.foreach(__v => __obj.updateDynamic("transform")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PropertyType]
    }
  }

  /** Contains a list of value updates for an asset property in the list of asset entries consumed by the [[https://docs.aws.amazon.com/iot-sitewise/latest/APIReference/API_BatchPutAssetPropertyValue.html|BatchPutAssetPropertyValue]] API operation.
    */
  @js.native
  trait PutAssetPropertyValueEntry extends js.Object {
    var entryId: EntryId
    var propertyValues: AssetPropertyValues
    var assetId: js.UndefOr[ID]
    var propertyAlias: js.UndefOr[AssetPropertyAlias]
    var propertyId: js.UndefOr[ID]
  }

  object PutAssetPropertyValueEntry {
    @inline
    def apply(
        entryId: EntryId,
        propertyValues: AssetPropertyValues,
        assetId: js.UndefOr[ID] = js.undefined,
        propertyAlias: js.UndefOr[AssetPropertyAlias] = js.undefined,
        propertyId: js.UndefOr[ID] = js.undefined
    ): PutAssetPropertyValueEntry = {
      val __obj = js.Dynamic.literal(
        "entryId" -> entryId.asInstanceOf[js.Any],
        "propertyValues" -> propertyValues.asInstanceOf[js.Any]
      )

      assetId.foreach(__v => __obj.updateDynamic("assetId")(__v.asInstanceOf[js.Any]))
      propertyAlias.foreach(__v => __obj.updateDynamic("propertyAlias")(__v.asInstanceOf[js.Any]))
      propertyId.foreach(__v => __obj.updateDynamic("propertyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutAssetPropertyValueEntry]
    }
  }

  @js.native
  trait PutDefaultEncryptionConfigurationRequest extends js.Object {
    var encryptionType: EncryptionType
    var kmsKeyId: js.UndefOr[KmsKeyId]
  }

  object PutDefaultEncryptionConfigurationRequest {
    @inline
    def apply(
        encryptionType: EncryptionType,
        kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
    ): PutDefaultEncryptionConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "encryptionType" -> encryptionType.asInstanceOf[js.Any]
      )

      kmsKeyId.foreach(__v => __obj.updateDynamic("kmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutDefaultEncryptionConfigurationRequest]
    }
  }

  @js.native
  trait PutDefaultEncryptionConfigurationResponse extends js.Object {
    var configurationStatus: ConfigurationStatus
    var encryptionType: EncryptionType
    var kmsKeyArn: js.UndefOr[ARN]
  }

  object PutDefaultEncryptionConfigurationResponse {
    @inline
    def apply(
        configurationStatus: ConfigurationStatus,
        encryptionType: EncryptionType,
        kmsKeyArn: js.UndefOr[ARN] = js.undefined
    ): PutDefaultEncryptionConfigurationResponse = {
      val __obj = js.Dynamic.literal(
        "configurationStatus" -> configurationStatus.asInstanceOf[js.Any],
        "encryptionType" -> encryptionType.asInstanceOf[js.Any]
      )

      kmsKeyArn.foreach(__v => __obj.updateDynamic("kmsKeyArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutDefaultEncryptionConfigurationResponse]
    }
  }

  @js.native
  trait PutLoggingOptionsRequest extends js.Object {
    var loggingOptions: LoggingOptions
  }

  object PutLoggingOptionsRequest {
    @inline
    def apply(
        loggingOptions: LoggingOptions
    ): PutLoggingOptionsRequest = {
      val __obj = js.Dynamic.literal(
        "loggingOptions" -> loggingOptions.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutLoggingOptionsRequest]
    }
  }

  @js.native
  trait PutLoggingOptionsResponse extends js.Object

  object PutLoggingOptionsResponse {
    @inline
    def apply(): PutLoggingOptionsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutLoggingOptionsResponse]
    }
  }

  /** Contains an AWS IoT SiteWise Monitor resource ID for a portal or project.
    */
  @js.native
  trait Resource extends js.Object {
    var portal: js.UndefOr[PortalResource]
    var project: js.UndefOr[ProjectResource]
  }

  object Resource {
    @inline
    def apply(
        portal: js.UndefOr[PortalResource] = js.undefined,
        project: js.UndefOr[ProjectResource] = js.undefined
    ): Resource = {
      val __obj = js.Dynamic.literal()
      portal.foreach(__v => __obj.updateDynamic("portal")(__v.asInstanceOf[js.Any]))
      project.foreach(__v => __obj.updateDynamic("project")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Resource]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: AmazonResourceName
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: AmazonResourceName,
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

  /** Contains a timestamp with optional nanosecond granularity.
    */
  @js.native
  trait TimeInNanos extends js.Object {
    var timeInSeconds: TimeInSeconds
    var offsetInNanos: js.UndefOr[OffsetInNanos]
  }

  object TimeInNanos {
    @inline
    def apply(
        timeInSeconds: TimeInSeconds,
        offsetInNanos: js.UndefOr[OffsetInNanos] = js.undefined
    ): TimeInNanos = {
      val __obj = js.Dynamic.literal(
        "timeInSeconds" -> timeInSeconds.asInstanceOf[js.Any]
      )

      offsetInNanos.foreach(__v => __obj.updateDynamic("offsetInNanos")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimeInNanos]
    }
  }

  /** Contains an asset transform property. A transform is a one-to-one mapping of a property's data points from one form to another. For example, you can use a transform to convert a Celsius data stream to Fahrenheit by applying the transformation expression to each data point of the Celsius stream. A transform can only have a data type of <code>DOUBLE</code> and consume properties with data types of <code>INTEGER</code> or <code>DOUBLE</code>. For more information, see [[https://docs.aws.amazon.com/iot-sitewise/latest/userguide/asset-properties.html#transforms|Transforms]] in the <i>AWS IoT SiteWise User Guide</i>.
    */
  @js.native
  trait Transform extends js.Object {
    var expression: Expression
    var variables: ExpressionVariables
  }

  object Transform {
    @inline
    def apply(
        expression: Expression,
        variables: ExpressionVariables
    ): Transform = {
      val __obj = js.Dynamic.literal(
        "expression" -> expression.asInstanceOf[js.Any],
        "variables" -> variables.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Transform]
    }
  }

  /** Contains a tumbling window, which is a repeating fixed-sized, non-overlapping, and contiguous time interval. This window is used in metric and aggregation computations.
    */
  @js.native
  trait TumblingWindow extends js.Object {
    var interval: Interval
  }

  object TumblingWindow {
    @inline
    def apply(
        interval: Interval
    ): TumblingWindow = {
      val __obj = js.Dynamic.literal(
        "interval" -> interval.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TumblingWindow]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: AmazonResourceName
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: AmazonResourceName,
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
  trait UpdateAccessPolicyRequest extends js.Object {
    var accessPolicyId: ID
    var accessPolicyIdentity: Identity
    var accessPolicyPermission: Permission
    var accessPolicyResource: Resource
    var clientToken: js.UndefOr[ClientToken]
  }

  object UpdateAccessPolicyRequest {
    @inline
    def apply(
        accessPolicyId: ID,
        accessPolicyIdentity: Identity,
        accessPolicyPermission: Permission,
        accessPolicyResource: Resource,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): UpdateAccessPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "accessPolicyId" -> accessPolicyId.asInstanceOf[js.Any],
        "accessPolicyIdentity" -> accessPolicyIdentity.asInstanceOf[js.Any],
        "accessPolicyPermission" -> accessPolicyPermission.asInstanceOf[js.Any],
        "accessPolicyResource" -> accessPolicyResource.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAccessPolicyRequest]
    }
  }

  @js.native
  trait UpdateAccessPolicyResponse extends js.Object

  object UpdateAccessPolicyResponse {
    @inline
    def apply(): UpdateAccessPolicyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateAccessPolicyResponse]
    }
  }

  @js.native
  trait UpdateAssetModelRequest extends js.Object {
    var assetModelId: ID
    var assetModelName: Name
    var assetModelCompositeModels: js.UndefOr[AssetModelCompositeModels]
    var assetModelDescription: js.UndefOr[Description]
    var assetModelHierarchies: js.UndefOr[AssetModelHierarchies]
    var assetModelProperties: js.UndefOr[AssetModelProperties]
    var clientToken: js.UndefOr[ClientToken]
  }

  object UpdateAssetModelRequest {
    @inline
    def apply(
        assetModelId: ID,
        assetModelName: Name,
        assetModelCompositeModels: js.UndefOr[AssetModelCompositeModels] = js.undefined,
        assetModelDescription: js.UndefOr[Description] = js.undefined,
        assetModelHierarchies: js.UndefOr[AssetModelHierarchies] = js.undefined,
        assetModelProperties: js.UndefOr[AssetModelProperties] = js.undefined,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): UpdateAssetModelRequest = {
      val __obj = js.Dynamic.literal(
        "assetModelId" -> assetModelId.asInstanceOf[js.Any],
        "assetModelName" -> assetModelName.asInstanceOf[js.Any]
      )

      assetModelCompositeModels.foreach(__v => __obj.updateDynamic("assetModelCompositeModels")(__v.asInstanceOf[js.Any]))
      assetModelDescription.foreach(__v => __obj.updateDynamic("assetModelDescription")(__v.asInstanceOf[js.Any]))
      assetModelHierarchies.foreach(__v => __obj.updateDynamic("assetModelHierarchies")(__v.asInstanceOf[js.Any]))
      assetModelProperties.foreach(__v => __obj.updateDynamic("assetModelProperties")(__v.asInstanceOf[js.Any]))
      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAssetModelRequest]
    }
  }

  @js.native
  trait UpdateAssetModelResponse extends js.Object {
    var assetModelStatus: AssetModelStatus
  }

  object UpdateAssetModelResponse {
    @inline
    def apply(
        assetModelStatus: AssetModelStatus
    ): UpdateAssetModelResponse = {
      val __obj = js.Dynamic.literal(
        "assetModelStatus" -> assetModelStatus.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateAssetModelResponse]
    }
  }

  @js.native
  trait UpdateAssetPropertyRequest extends js.Object {
    var assetId: ID
    var propertyId: ID
    var clientToken: js.UndefOr[ClientToken]
    var propertyAlias: js.UndefOr[PropertyAlias]
    var propertyNotificationState: js.UndefOr[PropertyNotificationState]
  }

  object UpdateAssetPropertyRequest {
    @inline
    def apply(
        assetId: ID,
        propertyId: ID,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        propertyAlias: js.UndefOr[PropertyAlias] = js.undefined,
        propertyNotificationState: js.UndefOr[PropertyNotificationState] = js.undefined
    ): UpdateAssetPropertyRequest = {
      val __obj = js.Dynamic.literal(
        "assetId" -> assetId.asInstanceOf[js.Any],
        "propertyId" -> propertyId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      propertyAlias.foreach(__v => __obj.updateDynamic("propertyAlias")(__v.asInstanceOf[js.Any]))
      propertyNotificationState.foreach(__v => __obj.updateDynamic("propertyNotificationState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAssetPropertyRequest]
    }
  }

  @js.native
  trait UpdateAssetRequest extends js.Object {
    var assetId: ID
    var assetName: Name
    var clientToken: js.UndefOr[ClientToken]
  }

  object UpdateAssetRequest {
    @inline
    def apply(
        assetId: ID,
        assetName: Name,
        clientToken: js.UndefOr[ClientToken] = js.undefined
    ): UpdateAssetRequest = {
      val __obj = js.Dynamic.literal(
        "assetId" -> assetId.asInstanceOf[js.Any],
        "assetName" -> assetName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAssetRequest]
    }
  }

  @js.native
  trait UpdateAssetResponse extends js.Object {
    var assetStatus: AssetStatus
  }

  object UpdateAssetResponse {
    @inline
    def apply(
        assetStatus: AssetStatus
    ): UpdateAssetResponse = {
      val __obj = js.Dynamic.literal(
        "assetStatus" -> assetStatus.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateAssetResponse]
    }
  }

  @js.native
  trait UpdateDashboardRequest extends js.Object {
    var dashboardDefinition: DashboardDefinition
    var dashboardId: ID
    var dashboardName: Name
    var clientToken: js.UndefOr[ClientToken]
    var dashboardDescription: js.UndefOr[Description]
  }

  object UpdateDashboardRequest {
    @inline
    def apply(
        dashboardDefinition: DashboardDefinition,
        dashboardId: ID,
        dashboardName: Name,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        dashboardDescription: js.UndefOr[Description] = js.undefined
    ): UpdateDashboardRequest = {
      val __obj = js.Dynamic.literal(
        "dashboardDefinition" -> dashboardDefinition.asInstanceOf[js.Any],
        "dashboardId" -> dashboardId.asInstanceOf[js.Any],
        "dashboardName" -> dashboardName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      dashboardDescription.foreach(__v => __obj.updateDynamic("dashboardDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDashboardRequest]
    }
  }

  @js.native
  trait UpdateDashboardResponse extends js.Object

  object UpdateDashboardResponse {
    @inline
    def apply(): UpdateDashboardResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateDashboardResponse]
    }
  }

  @js.native
  trait UpdateGatewayCapabilityConfigurationRequest extends js.Object {
    var capabilityConfiguration: CapabilityConfiguration
    var capabilityNamespace: CapabilityNamespace
    var gatewayId: ID
  }

  object UpdateGatewayCapabilityConfigurationRequest {
    @inline
    def apply(
        capabilityConfiguration: CapabilityConfiguration,
        capabilityNamespace: CapabilityNamespace,
        gatewayId: ID
    ): UpdateGatewayCapabilityConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "capabilityConfiguration" -> capabilityConfiguration.asInstanceOf[js.Any],
        "capabilityNamespace" -> capabilityNamespace.asInstanceOf[js.Any],
        "gatewayId" -> gatewayId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateGatewayCapabilityConfigurationRequest]
    }
  }

  @js.native
  trait UpdateGatewayCapabilityConfigurationResponse extends js.Object {
    var capabilityNamespace: CapabilityNamespace
    var capabilitySyncStatus: CapabilitySyncStatus
  }

  object UpdateGatewayCapabilityConfigurationResponse {
    @inline
    def apply(
        capabilityNamespace: CapabilityNamespace,
        capabilitySyncStatus: CapabilitySyncStatus
    ): UpdateGatewayCapabilityConfigurationResponse = {
      val __obj = js.Dynamic.literal(
        "capabilityNamespace" -> capabilityNamespace.asInstanceOf[js.Any],
        "capabilitySyncStatus" -> capabilitySyncStatus.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateGatewayCapabilityConfigurationResponse]
    }
  }

  @js.native
  trait UpdateGatewayRequest extends js.Object {
    var gatewayId: ID
    var gatewayName: Name
  }

  object UpdateGatewayRequest {
    @inline
    def apply(
        gatewayId: ID,
        gatewayName: Name
    ): UpdateGatewayRequest = {
      val __obj = js.Dynamic.literal(
        "gatewayId" -> gatewayId.asInstanceOf[js.Any],
        "gatewayName" -> gatewayName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateGatewayRequest]
    }
  }

  @js.native
  trait UpdatePortalRequest extends js.Object {
    var portalContactEmail: Email
    var portalId: ID
    var portalName: Name
    var roleArn: ARN
    var clientToken: js.UndefOr[ClientToken]
    var portalDescription: js.UndefOr[Description]
    var portalLogoImage: js.UndefOr[Image]
  }

  object UpdatePortalRequest {
    @inline
    def apply(
        portalContactEmail: Email,
        portalId: ID,
        portalName: Name,
        roleArn: ARN,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        portalDescription: js.UndefOr[Description] = js.undefined,
        portalLogoImage: js.UndefOr[Image] = js.undefined
    ): UpdatePortalRequest = {
      val __obj = js.Dynamic.literal(
        "portalContactEmail" -> portalContactEmail.asInstanceOf[js.Any],
        "portalId" -> portalId.asInstanceOf[js.Any],
        "portalName" -> portalName.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      portalDescription.foreach(__v => __obj.updateDynamic("portalDescription")(__v.asInstanceOf[js.Any]))
      portalLogoImage.foreach(__v => __obj.updateDynamic("portalLogoImage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePortalRequest]
    }
  }

  @js.native
  trait UpdatePortalResponse extends js.Object {
    var portalStatus: PortalStatus
  }

  object UpdatePortalResponse {
    @inline
    def apply(
        portalStatus: PortalStatus
    ): UpdatePortalResponse = {
      val __obj = js.Dynamic.literal(
        "portalStatus" -> portalStatus.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdatePortalResponse]
    }
  }

  @js.native
  trait UpdateProjectRequest extends js.Object {
    var projectId: ID
    var projectName: Name
    var clientToken: js.UndefOr[ClientToken]
    var projectDescription: js.UndefOr[Description]
  }

  object UpdateProjectRequest {
    @inline
    def apply(
        projectId: ID,
        projectName: Name,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        projectDescription: js.UndefOr[Description] = js.undefined
    ): UpdateProjectRequest = {
      val __obj = js.Dynamic.literal(
        "projectId" -> projectId.asInstanceOf[js.Any],
        "projectName" -> projectName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      projectDescription.foreach(__v => __obj.updateDynamic("projectDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProjectRequest]
    }
  }

  @js.native
  trait UpdateProjectResponse extends js.Object

  object UpdateProjectResponse {
    @inline
    def apply(): UpdateProjectResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateProjectResponse]
    }
  }

  /** Contains information for a user identity in an access policy.
    */
  @js.native
  trait UserIdentity extends js.Object {
    var id: IdentityId
  }

  object UserIdentity {
    @inline
    def apply(
        id: IdentityId
    ): UserIdentity = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UserIdentity]
    }
  }

  /** Identifies a property value used in an expression.
    */
  @js.native
  trait VariableValue extends js.Object {
    var propertyId: Macro
    var hierarchyId: js.UndefOr[Macro]
  }

  object VariableValue {
    @inline
    def apply(
        propertyId: Macro,
        hierarchyId: js.UndefOr[Macro] = js.undefined
    ): VariableValue = {
      val __obj = js.Dynamic.literal(
        "propertyId" -> propertyId.asInstanceOf[js.Any]
      )

      hierarchyId.foreach(__v => __obj.updateDynamic("hierarchyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VariableValue]
    }
  }

  /** Contains an asset property value (of a single type only).
    */
  @js.native
  trait Variant extends js.Object {
    var booleanValue: js.UndefOr[PropertyValueBooleanValue]
    var doubleValue: js.UndefOr[PropertyValueDoubleValue]
    var integerValue: js.UndefOr[PropertyValueIntegerValue]
    var stringValue: js.UndefOr[PropertyValueStringValue]
  }

  object Variant {
    @inline
    def apply(
        booleanValue: js.UndefOr[PropertyValueBooleanValue] = js.undefined,
        doubleValue: js.UndefOr[PropertyValueDoubleValue] = js.undefined,
        integerValue: js.UndefOr[PropertyValueIntegerValue] = js.undefined,
        stringValue: js.UndefOr[PropertyValueStringValue] = js.undefined
    ): Variant = {
      val __obj = js.Dynamic.literal()
      booleanValue.foreach(__v => __obj.updateDynamic("booleanValue")(__v.asInstanceOf[js.Any]))
      doubleValue.foreach(__v => __obj.updateDynamic("doubleValue")(__v.asInstanceOf[js.Any]))
      integerValue.foreach(__v => __obj.updateDynamic("integerValue")(__v.asInstanceOf[js.Any]))
      stringValue.foreach(__v => __obj.updateDynamic("stringValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Variant]
    }
  }
}
