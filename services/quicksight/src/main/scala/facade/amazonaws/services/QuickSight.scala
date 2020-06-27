package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object quicksight {
  type ActionList                     = js.Array[String]
  type ActiveIAMPolicyAssignmentList  = js.Array[ActiveIAMPolicyAssignment]
  type AliasName                      = String
  type Arn                            = String
  type AwsAccountId                   = String
  type CalculatedColumnList           = js.Array[CalculatedColumn]
  type Catalog                        = String
  type ClusterId                      = String
  type ColumnGroupColumnSchemaList    = js.Array[ColumnGroupColumnSchema]
  type ColumnGroupList                = js.Array[ColumnGroup]
  type ColumnGroupName                = String
  type ColumnGroupSchemaList          = js.Array[ColumnGroupSchema]
  type ColumnId                       = String
  type ColumnList                     = js.Array[ColumnName]
  type ColumnName                     = String
  type ColumnSchemaList               = js.Array[ColumnSchema]
  type ColumnTagList                  = js.Array[ColumnTag]
  type CustomSqlName                  = String
  type DashboardErrorList             = js.Array[DashboardError]
  type DashboardName                  = String
  type DashboardSummaryList           = js.Array[DashboardSummary]
  type DashboardVersionSummaryList    = js.Array[DashboardVersionSummary]
  type DataSetConfigurationList       = js.Array[DataSetConfiguration]
  type DataSetName                    = String
  type DataSetReferenceList           = js.Array[DataSetReference]
  type DataSetSummaryList             = js.Array[DataSetSummary]
  type DataSourceList                 = js.Array[DataSource]
  type Database                       = String
  type DateTimeParameterList          = js.Array[DateTimeParameter]
  type DecimalParameterList           = js.Array[DecimalParameter]
  type Delimiter                      = String
  type Domain                         = String
  type DoubleList                     = js.Array[Double]
  type EmbeddingUrl                   = String
  type Expression                     = String
  type GroupDescription               = String
  type GroupList                      = js.Array[Group]
  type GroupMemberList                = js.Array[GroupMember]
  type GroupMemberName                = String
  type GroupName                      = String
  type Host                           = String
  type IAMPolicyAssignmentName        = String
  type IAMPolicyAssignmentSummaryList = js.Array[IAMPolicyAssignmentSummary]
  type IdentityMap                    = js.Dictionary[IdentityNameList]
  type IdentityName                   = String
  type IdentityNameList               = js.Array[IdentityName]
  type IngestionId                    = String
  type IngestionMaxResults            = Int
  type Ingestions                     = js.Array[Ingestion]
  type InputColumnList                = js.Array[InputColumn]
  type InstanceId                     = String
  type IntegerParameterList           = js.Array[IntegerParameter]
  type LogicalTableAlias              = String
  type LogicalTableId                 = String
  type LogicalTableMap                = js.Dictionary[LogicalTable]
  type LongList                       = js.Array[Double]
  type MaxResults                     = Int
  type Namespace                      = String
  type NonEmptyString                 = String
  type OnClause                       = String
  type OptionalPort                   = Int
  type OutputColumnList               = js.Array[OutputColumn]
  type Password                       = String
  type PhysicalTableId                = String
  type PhysicalTableMap               = js.Dictionary[PhysicalTable]
  type Port                           = Int
  type PositiveInteger                = Int
  type Principal                      = String
  type ProjectedColumnList            = js.Array[String]
  type Query                          = String
  type RelationalTableName            = String
  type RelationalTableSchema          = String
  type ResourceId                     = String
  type ResourceName                   = String
  type ResourcePermissionList         = js.Array[ResourcePermission]
  type RestrictiveResourceId          = String
  type RoleSessionName                = String
  type S3Bucket                       = String
  type S3Key                          = String
  type SessionLifetimeInMinutes       = Double
  type SiteBaseUrl                    = String
  type SqlQuery                       = String
  type StatusCode                     = Int
  type StringList                     = js.Array[String]
  type StringParameterList            = js.Array[StringParameter]
  type TagKey                         = String
  type TagKeyList                     = js.Array[TagKey]
  type TagList                        = js.Array[Tag]
  type TagValue                       = String
  type TemplateAliasList              = js.Array[TemplateAlias]
  type TemplateErrorList              = js.Array[TemplateError]
  type TemplateName                   = String
  type TemplateSummaryList            = js.Array[TemplateSummary]
  type TemplateVersionSummaryList     = js.Array[TemplateVersionSummary]
  type Timestamp                      = js.Date
  type TimestampList                  = js.Array[Timestamp]
  type TransformOperationList         = js.Array[TransformOperation]
  type TypeCastFormat                 = String
  type UpdateResourcePermissionList   = js.Array[ResourcePermission]
  type UserList                       = js.Array[User]
  type UserName                       = String
  type Username                       = String
  type VersionDescription             = String
  type VersionNumber                  = Double
  type Warehouse                      = String
  type WorkGroup                      = String
  type timestamp                      = js.Date

  implicit final class QuickSightOps(private val service: QuickSight) extends AnyVal {

    @inline def cancelIngestionFuture(params: CancelIngestionRequest): Future[CancelIngestionResponse] =
      service.cancelIngestion(params).promise().toFuture
    @inline def createDashboardFuture(params: CreateDashboardRequest): Future[CreateDashboardResponse] =
      service.createDashboard(params).promise().toFuture
    @inline def createDataSetFuture(params: CreateDataSetRequest): Future[CreateDataSetResponse] =
      service.createDataSet(params).promise().toFuture
    @inline def createDataSourceFuture(params: CreateDataSourceRequest): Future[CreateDataSourceResponse] =
      service.createDataSource(params).promise().toFuture
    @inline def createGroupFuture(params: CreateGroupRequest): Future[CreateGroupResponse] =
      service.createGroup(params).promise().toFuture
    @inline def createGroupMembershipFuture(
        params: CreateGroupMembershipRequest
    ): Future[CreateGroupMembershipResponse] = service.createGroupMembership(params).promise().toFuture
    @inline def createIAMPolicyAssignmentFuture(
        params: CreateIAMPolicyAssignmentRequest
    ): Future[CreateIAMPolicyAssignmentResponse] = service.createIAMPolicyAssignment(params).promise().toFuture
    @inline def createIngestionFuture(params: CreateIngestionRequest): Future[CreateIngestionResponse] =
      service.createIngestion(params).promise().toFuture
    @inline def createTemplateAliasFuture(params: CreateTemplateAliasRequest): Future[CreateTemplateAliasResponse] =
      service.createTemplateAlias(params).promise().toFuture
    @inline def createTemplateFuture(params: CreateTemplateRequest): Future[CreateTemplateResponse] =
      service.createTemplate(params).promise().toFuture
    @inline def deleteDashboardFuture(params: DeleteDashboardRequest): Future[DeleteDashboardResponse] =
      service.deleteDashboard(params).promise().toFuture
    @inline def deleteDataSetFuture(params: DeleteDataSetRequest): Future[DeleteDataSetResponse] =
      service.deleteDataSet(params).promise().toFuture
    @inline def deleteDataSourceFuture(params: DeleteDataSourceRequest): Future[DeleteDataSourceResponse] =
      service.deleteDataSource(params).promise().toFuture
    @inline def deleteGroupFuture(params: DeleteGroupRequest): Future[DeleteGroupResponse] =
      service.deleteGroup(params).promise().toFuture
    @inline def deleteGroupMembershipFuture(
        params: DeleteGroupMembershipRequest
    ): Future[DeleteGroupMembershipResponse] = service.deleteGroupMembership(params).promise().toFuture
    @inline def deleteIAMPolicyAssignmentFuture(
        params: DeleteIAMPolicyAssignmentRequest
    ): Future[DeleteIAMPolicyAssignmentResponse] = service.deleteIAMPolicyAssignment(params).promise().toFuture
    @inline def deleteTemplateAliasFuture(params: DeleteTemplateAliasRequest): Future[DeleteTemplateAliasResponse] =
      service.deleteTemplateAlias(params).promise().toFuture
    @inline def deleteTemplateFuture(params: DeleteTemplateRequest): Future[DeleteTemplateResponse] =
      service.deleteTemplate(params).promise().toFuture
    @inline def deleteUserByPrincipalIdFuture(
        params: DeleteUserByPrincipalIdRequest
    ): Future[DeleteUserByPrincipalIdResponse] = service.deleteUserByPrincipalId(params).promise().toFuture
    @inline def deleteUserFuture(params: DeleteUserRequest): Future[DeleteUserResponse] =
      service.deleteUser(params).promise().toFuture
    @inline def describeDashboardFuture(params: DescribeDashboardRequest): Future[DescribeDashboardResponse] =
      service.describeDashboard(params).promise().toFuture
    @inline def describeDashboardPermissionsFuture(
        params: DescribeDashboardPermissionsRequest
    ): Future[DescribeDashboardPermissionsResponse] = service.describeDashboardPermissions(params).promise().toFuture
    @inline def describeDataSetFuture(params: DescribeDataSetRequest): Future[DescribeDataSetResponse] =
      service.describeDataSet(params).promise().toFuture
    @inline def describeDataSetPermissionsFuture(
        params: DescribeDataSetPermissionsRequest
    ): Future[DescribeDataSetPermissionsResponse] = service.describeDataSetPermissions(params).promise().toFuture
    @inline def describeDataSourceFuture(params: DescribeDataSourceRequest): Future[DescribeDataSourceResponse] =
      service.describeDataSource(params).promise().toFuture
    @inline def describeDataSourcePermissionsFuture(
        params: DescribeDataSourcePermissionsRequest
    ): Future[DescribeDataSourcePermissionsResponse] = service.describeDataSourcePermissions(params).promise().toFuture
    @inline def describeGroupFuture(params: DescribeGroupRequest): Future[DescribeGroupResponse] =
      service.describeGroup(params).promise().toFuture
    @inline def describeIAMPolicyAssignmentFuture(
        params: DescribeIAMPolicyAssignmentRequest
    ): Future[DescribeIAMPolicyAssignmentResponse] = service.describeIAMPolicyAssignment(params).promise().toFuture
    @inline def describeIngestionFuture(params: DescribeIngestionRequest): Future[DescribeIngestionResponse] =
      service.describeIngestion(params).promise().toFuture
    @inline def describeTemplateAliasFuture(
        params: DescribeTemplateAliasRequest
    ): Future[DescribeTemplateAliasResponse] = service.describeTemplateAlias(params).promise().toFuture
    @inline def describeTemplateFuture(params: DescribeTemplateRequest): Future[DescribeTemplateResponse] =
      service.describeTemplate(params).promise().toFuture
    @inline def describeTemplatePermissionsFuture(
        params: DescribeTemplatePermissionsRequest
    ): Future[DescribeTemplatePermissionsResponse] = service.describeTemplatePermissions(params).promise().toFuture
    @inline def describeUserFuture(params: DescribeUserRequest): Future[DescribeUserResponse] =
      service.describeUser(params).promise().toFuture
    @inline def getDashboardEmbedUrlFuture(params: GetDashboardEmbedUrlRequest): Future[GetDashboardEmbedUrlResponse] =
      service.getDashboardEmbedUrl(params).promise().toFuture
    @inline def listDashboardVersionsFuture(
        params: ListDashboardVersionsRequest
    ): Future[ListDashboardVersionsResponse] = service.listDashboardVersions(params).promise().toFuture
    @inline def listDashboardsFuture(params: ListDashboardsRequest): Future[ListDashboardsResponse] =
      service.listDashboards(params).promise().toFuture
    @inline def listDataSetsFuture(params: ListDataSetsRequest): Future[ListDataSetsResponse] =
      service.listDataSets(params).promise().toFuture
    @inline def listDataSourcesFuture(params: ListDataSourcesRequest): Future[ListDataSourcesResponse] =
      service.listDataSources(params).promise().toFuture
    @inline def listGroupMembershipsFuture(params: ListGroupMembershipsRequest): Future[ListGroupMembershipsResponse] =
      service.listGroupMemberships(params).promise().toFuture
    @inline def listGroupsFuture(params: ListGroupsRequest): Future[ListGroupsResponse] =
      service.listGroups(params).promise().toFuture
    @inline def listIAMPolicyAssignmentsForUserFuture(
        params: ListIAMPolicyAssignmentsForUserRequest
    ): Future[ListIAMPolicyAssignmentsForUserResponse] =
      service.listIAMPolicyAssignmentsForUser(params).promise().toFuture
    @inline def listIAMPolicyAssignmentsFuture(
        params: ListIAMPolicyAssignmentsRequest
    ): Future[ListIAMPolicyAssignmentsResponse] = service.listIAMPolicyAssignments(params).promise().toFuture
    @inline def listIngestionsFuture(params: ListIngestionsRequest): Future[ListIngestionsResponse] =
      service.listIngestions(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def listTemplateAliasesFuture(params: ListTemplateAliasesRequest): Future[ListTemplateAliasesResponse] =
      service.listTemplateAliases(params).promise().toFuture
    @inline def listTemplateVersionsFuture(params: ListTemplateVersionsRequest): Future[ListTemplateVersionsResponse] =
      service.listTemplateVersions(params).promise().toFuture
    @inline def listTemplatesFuture(params: ListTemplatesRequest): Future[ListTemplatesResponse] =
      service.listTemplates(params).promise().toFuture
    @inline def listUserGroupsFuture(params: ListUserGroupsRequest): Future[ListUserGroupsResponse] =
      service.listUserGroups(params).promise().toFuture
    @inline def listUsersFuture(params: ListUsersRequest): Future[ListUsersResponse] =
      service.listUsers(params).promise().toFuture
    @inline def registerUserFuture(params: RegisterUserRequest): Future[RegisterUserResponse] =
      service.registerUser(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateDashboardFuture(params: UpdateDashboardRequest): Future[UpdateDashboardResponse] =
      service.updateDashboard(params).promise().toFuture
    @inline def updateDashboardPermissionsFuture(
        params: UpdateDashboardPermissionsRequest
    ): Future[UpdateDashboardPermissionsResponse] = service.updateDashboardPermissions(params).promise().toFuture
    @inline def updateDashboardPublishedVersionFuture(
        params: UpdateDashboardPublishedVersionRequest
    ): Future[UpdateDashboardPublishedVersionResponse] =
      service.updateDashboardPublishedVersion(params).promise().toFuture
    @inline def updateDataSetFuture(params: UpdateDataSetRequest): Future[UpdateDataSetResponse] =
      service.updateDataSet(params).promise().toFuture
    @inline def updateDataSetPermissionsFuture(
        params: UpdateDataSetPermissionsRequest
    ): Future[UpdateDataSetPermissionsResponse] = service.updateDataSetPermissions(params).promise().toFuture
    @inline def updateDataSourceFuture(params: UpdateDataSourceRequest): Future[UpdateDataSourceResponse] =
      service.updateDataSource(params).promise().toFuture
    @inline def updateDataSourcePermissionsFuture(
        params: UpdateDataSourcePermissionsRequest
    ): Future[UpdateDataSourcePermissionsResponse] = service.updateDataSourcePermissions(params).promise().toFuture
    @inline def updateGroupFuture(params: UpdateGroupRequest): Future[UpdateGroupResponse] =
      service.updateGroup(params).promise().toFuture
    @inline def updateIAMPolicyAssignmentFuture(
        params: UpdateIAMPolicyAssignmentRequest
    ): Future[UpdateIAMPolicyAssignmentResponse] = service.updateIAMPolicyAssignment(params).promise().toFuture
    @inline def updateTemplateAliasFuture(params: UpdateTemplateAliasRequest): Future[UpdateTemplateAliasResponse] =
      service.updateTemplateAlias(params).promise().toFuture
    @inline def updateTemplateFuture(params: UpdateTemplateRequest): Future[UpdateTemplateResponse] =
      service.updateTemplate(params).promise().toFuture
    @inline def updateTemplatePermissionsFuture(
        params: UpdateTemplatePermissionsRequest
    ): Future[UpdateTemplatePermissionsResponse] = service.updateTemplatePermissions(params).promise().toFuture
    @inline def updateUserFuture(params: UpdateUserRequest): Future[UpdateUserResponse] =
      service.updateUser(params).promise().toFuture
  }
}

package quicksight {
  @js.native
  @JSImport("aws-sdk", "QuickSight")
  class QuickSight() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelIngestion(params: CancelIngestionRequest): Request[CancelIngestionResponse]                   = js.native
    def createDashboard(params: CreateDashboardRequest): Request[CreateDashboardResponse]                   = js.native
    def createDataSet(params: CreateDataSetRequest): Request[CreateDataSetResponse]                         = js.native
    def createDataSource(params: CreateDataSourceRequest): Request[CreateDataSourceResponse]                = js.native
    def createGroup(params: CreateGroupRequest): Request[CreateGroupResponse]                               = js.native
    def createGroupMembership(params: CreateGroupMembershipRequest): Request[CreateGroupMembershipResponse] = js.native
    def createIAMPolicyAssignment(
        params: CreateIAMPolicyAssignmentRequest
    ): Request[CreateIAMPolicyAssignmentResponse]                                                           = js.native
    def createIngestion(params: CreateIngestionRequest): Request[CreateIngestionResponse]                   = js.native
    def createTemplate(params: CreateTemplateRequest): Request[CreateTemplateResponse]                      = js.native
    def createTemplateAlias(params: CreateTemplateAliasRequest): Request[CreateTemplateAliasResponse]       = js.native
    def deleteDashboard(params: DeleteDashboardRequest): Request[DeleteDashboardResponse]                   = js.native
    def deleteDataSet(params: DeleteDataSetRequest): Request[DeleteDataSetResponse]                         = js.native
    def deleteDataSource(params: DeleteDataSourceRequest): Request[DeleteDataSourceResponse]                = js.native
    def deleteGroup(params: DeleteGroupRequest): Request[DeleteGroupResponse]                               = js.native
    def deleteGroupMembership(params: DeleteGroupMembershipRequest): Request[DeleteGroupMembershipResponse] = js.native
    def deleteIAMPolicyAssignment(
        params: DeleteIAMPolicyAssignmentRequest
    ): Request[DeleteIAMPolicyAssignmentResponse]                                                     = js.native
    def deleteTemplate(params: DeleteTemplateRequest): Request[DeleteTemplateResponse]                = js.native
    def deleteTemplateAlias(params: DeleteTemplateAliasRequest): Request[DeleteTemplateAliasResponse] = js.native
    def deleteUser(params: DeleteUserRequest): Request[DeleteUserResponse]                            = js.native
    def deleteUserByPrincipalId(params: DeleteUserByPrincipalIdRequest): Request[DeleteUserByPrincipalIdResponse] =
      js.native
    def describeDashboard(params: DescribeDashboardRequest): Request[DescribeDashboardResponse] = js.native
    def describeDashboardPermissions(
        params: DescribeDashboardPermissionsRequest
    ): Request[DescribeDashboardPermissionsResponse]                                      = js.native
    def describeDataSet(params: DescribeDataSetRequest): Request[DescribeDataSetResponse] = js.native
    def describeDataSetPermissions(
        params: DescribeDataSetPermissionsRequest
    ): Request[DescribeDataSetPermissionsResponse]                                                 = js.native
    def describeDataSource(params: DescribeDataSourceRequest): Request[DescribeDataSourceResponse] = js.native
    def describeDataSourcePermissions(
        params: DescribeDataSourcePermissionsRequest
    ): Request[DescribeDataSourcePermissionsResponse]                               = js.native
    def describeGroup(params: DescribeGroupRequest): Request[DescribeGroupResponse] = js.native
    def describeIAMPolicyAssignment(
        params: DescribeIAMPolicyAssignmentRequest
    ): Request[DescribeIAMPolicyAssignmentResponse]                                                         = js.native
    def describeIngestion(params: DescribeIngestionRequest): Request[DescribeIngestionResponse]             = js.native
    def describeTemplate(params: DescribeTemplateRequest): Request[DescribeTemplateResponse]                = js.native
    def describeTemplateAlias(params: DescribeTemplateAliasRequest): Request[DescribeTemplateAliasResponse] = js.native
    def describeTemplatePermissions(
        params: DescribeTemplatePermissionsRequest
    ): Request[DescribeTemplatePermissionsResponse]                                                         = js.native
    def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse]                            = js.native
    def getDashboardEmbedUrl(params: GetDashboardEmbedUrlRequest): Request[GetDashboardEmbedUrlResponse]    = js.native
    def listDashboardVersions(params: ListDashboardVersionsRequest): Request[ListDashboardVersionsResponse] = js.native
    def listDashboards(params: ListDashboardsRequest): Request[ListDashboardsResponse]                      = js.native
    def listDataSets(params: ListDataSetsRequest): Request[ListDataSetsResponse]                            = js.native
    def listDataSources(params: ListDataSourcesRequest): Request[ListDataSourcesResponse]                   = js.native
    def listGroupMemberships(params: ListGroupMembershipsRequest): Request[ListGroupMembershipsResponse]    = js.native
    def listGroups(params: ListGroupsRequest): Request[ListGroupsResponse]                                  = js.native
    def listIAMPolicyAssignments(params: ListIAMPolicyAssignmentsRequest): Request[ListIAMPolicyAssignmentsResponse] =
      js.native
    def listIAMPolicyAssignmentsForUser(
        params: ListIAMPolicyAssignmentsForUserRequest
    ): Request[ListIAMPolicyAssignmentsForUserResponse]                                                  = js.native
    def listIngestions(params: ListIngestionsRequest): Request[ListIngestionsResponse]                   = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]    = js.native
    def listTemplateAliases(params: ListTemplateAliasesRequest): Request[ListTemplateAliasesResponse]    = js.native
    def listTemplateVersions(params: ListTemplateVersionsRequest): Request[ListTemplateVersionsResponse] = js.native
    def listTemplates(params: ListTemplatesRequest): Request[ListTemplatesResponse]                      = js.native
    def listUserGroups(params: ListUserGroupsRequest): Request[ListUserGroupsResponse]                   = js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse]                                  = js.native
    def registerUser(params: RegisterUserRequest): Request[RegisterUserResponse]                         = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                            = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                      = js.native
    def updateDashboard(params: UpdateDashboardRequest): Request[UpdateDashboardResponse]                = js.native
    def updateDashboardPermissions(
        params: UpdateDashboardPermissionsRequest
    ): Request[UpdateDashboardPermissionsResponse] = js.native
    def updateDashboardPublishedVersion(
        params: UpdateDashboardPublishedVersionRequest
    ): Request[UpdateDashboardPublishedVersionResponse]                             = js.native
    def updateDataSet(params: UpdateDataSetRequest): Request[UpdateDataSetResponse] = js.native
    def updateDataSetPermissions(params: UpdateDataSetPermissionsRequest): Request[UpdateDataSetPermissionsResponse] =
      js.native
    def updateDataSource(params: UpdateDataSourceRequest): Request[UpdateDataSourceResponse] = js.native
    def updateDataSourcePermissions(
        params: UpdateDataSourcePermissionsRequest
    ): Request[UpdateDataSourcePermissionsResponse]                           = js.native
    def updateGroup(params: UpdateGroupRequest): Request[UpdateGroupResponse] = js.native
    def updateIAMPolicyAssignment(
        params: UpdateIAMPolicyAssignmentRequest
    ): Request[UpdateIAMPolicyAssignmentResponse]                                                     = js.native
    def updateTemplate(params: UpdateTemplateRequest): Request[UpdateTemplateResponse]                = js.native
    def updateTemplateAlias(params: UpdateTemplateAliasRequest): Request[UpdateTemplateAliasResponse] = js.native
    def updateTemplatePermissions(
        params: UpdateTemplatePermissionsRequest
    ): Request[UpdateTemplatePermissionsResponse]                          = js.native
    def updateUser(params: UpdateUserRequest): Request[UpdateUserResponse] = js.native
  }

  /**
    * The active AWS Identity and Access Management (IAM) policy assignment.
    */
  @js.native
  @Factory
  trait ActiveIAMPolicyAssignment extends js.Object {
    var AssignmentName: js.UndefOr[IAMPolicyAssignmentName]
    var PolicyArn: js.UndefOr[Arn]
  }

  /**
    * Ad hoc (one-time) filtering option.
    */
  @js.native
  @Factory
  trait AdHocFilteringOption extends js.Object {
    var AvailabilityStatus: js.UndefOr[DashboardBehavior]
  }

  /**
    * Amazon Elasticsearch Service parameters.
    */
  @js.native
  @Factory
  trait AmazonElasticsearchParameters extends js.Object {
    var Domain: Domain
  }

  @js.native
  sealed trait AssignmentStatus extends js.Any
  object AssignmentStatus extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[AssignmentStatus]
    val DRAFT    = "DRAFT".asInstanceOf[AssignmentStatus]
    val DISABLED = "DISABLED".asInstanceOf[AssignmentStatus]

    val values = js.Object.freeze(js.Array(ENABLED, DRAFT, DISABLED))
  }

  /**
    * Amazon Athena parameters.
    */
  @js.native
  @Factory
  trait AthenaParameters extends js.Object {
    var WorkGroup: js.UndefOr[WorkGroup]
  }

  /**
    * Amazon Aurora parameters.
    */
  @js.native
  @Factory
  trait AuroraParameters extends js.Object {
    var Database: Database
    var Host: Host
    var Port: Port
  }

  /**
    * Amazon Aurora with PostgreSQL compatibility parameters.
    */
  @js.native
  @Factory
  trait AuroraPostgreSqlParameters extends js.Object {
    var Database: Database
    var Host: Host
    var Port: Port
  }

  /**
    * AWS IoT Analytics parameters.
    */
  @js.native
  @Factory
  trait AwsIotAnalyticsParameters extends js.Object {
    var DataSetName: DataSetName
  }

  /**
    * A calculated column for a dataset.
    */
  @js.native
  @Factory
  trait CalculatedColumn extends js.Object {
    var ColumnId: ColumnId
    var ColumnName: ColumnName
    var Expression: Expression
  }

  @js.native
  @Factory
  trait CancelIngestionRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DataSetId: String
    var IngestionId: IngestionId
  }

  @js.native
  @Factory
  trait CancelIngestionResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var IngestionId: js.UndefOr[IngestionId]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  /**
    * A transform operation that casts a column to a different type.
    */
  @js.native
  @Factory
  trait CastColumnTypeOperation extends js.Object {
    var ColumnName: ColumnName
    var NewColumnType: ColumnDataType
    var Format: js.UndefOr[TypeCastFormat]
  }

  @js.native
  sealed trait ColumnDataType extends js.Any
  object ColumnDataType extends js.Object {
    val STRING   = "STRING".asInstanceOf[ColumnDataType]
    val INTEGER  = "INTEGER".asInstanceOf[ColumnDataType]
    val DECIMAL  = "DECIMAL".asInstanceOf[ColumnDataType]
    val DATETIME = "DATETIME".asInstanceOf[ColumnDataType]

    val values = js.Object.freeze(js.Array(STRING, INTEGER, DECIMAL, DATETIME))
  }

  /**
    * Groupings of columns that work together in certain Amazon QuickSight features. This is a variant type structure. For this structure to be valid, only one of the attributes can be non-null.
    */
  @js.native
  @Factory
  trait ColumnGroup extends js.Object {
    var GeoSpatialColumnGroup: js.UndefOr[GeoSpatialColumnGroup]
  }

  /**
    * A structure describing the name, data type, and geographic role of the columns.
    */
  @js.native
  @Factory
  trait ColumnGroupColumnSchema extends js.Object {
    var Name: js.UndefOr[String]
  }

  /**
    * The column group schema.
    */
  @js.native
  @Factory
  trait ColumnGroupSchema extends js.Object {
    var ColumnGroupColumnSchemaList: js.UndefOr[ColumnGroupColumnSchemaList]
    var Name: js.UndefOr[String]
  }

  /**
    * The column schema.
    */
  @js.native
  @Factory
  trait ColumnSchema extends js.Object {
    var DataType: js.UndefOr[String]
    var GeographicRole: js.UndefOr[String]
    var Name: js.UndefOr[String]
  }

  /**
    * A tag for a column in a <code>TagColumnOperation</code> structure. This is a variant type structure. For this structure to be valid, only one of the attributes can be non-null.
    */
  @js.native
  @Factory
  trait ColumnTag extends js.Object {
    var ColumnGeographicRole: js.UndefOr[GeoSpatialDataRole]
  }

  /**
    * A transform operation that creates calculated columns. Columns created in one such operation form a lexical closure.
    */
  @js.native
  @Factory
  trait CreateColumnsOperation extends js.Object {
    var Columns: CalculatedColumnList
  }

  @js.native
  @Factory
  trait CreateDashboardRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DashboardId: RestrictiveResourceId
    var Name: DashboardName
    var SourceEntity: DashboardSourceEntity
    var DashboardPublishOptions: js.UndefOr[DashboardPublishOptions]
    var Parameters: js.UndefOr[Parameters]
    var Permissions: js.UndefOr[ResourcePermissionList]
    var Tags: js.UndefOr[TagList]
    var VersionDescription: js.UndefOr[VersionDescription]
  }

  @js.native
  @Factory
  trait CreateDashboardResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreationStatus: js.UndefOr[ResourceStatus]
    var DashboardId: js.UndefOr[RestrictiveResourceId]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var VersionArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait CreateDataSetRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DataSetId: ResourceId
    var ImportMode: DataSetImportMode
    var Name: ResourceName
    var PhysicalTableMap: PhysicalTableMap
    var ColumnGroups: js.UndefOr[ColumnGroupList]
    var LogicalTableMap: js.UndefOr[LogicalTableMap]
    var Permissions: js.UndefOr[ResourcePermissionList]
    var RowLevelPermissionDataSet: js.UndefOr[RowLevelPermissionDataSet]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait CreateDataSetResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var DataSetId: js.UndefOr[ResourceId]
    var IngestionArn: js.UndefOr[Arn]
    var IngestionId: js.UndefOr[ResourceId]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait CreateDataSourceRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DataSourceId: ResourceId
    var Name: ResourceName
    var Type: DataSourceType
    var Credentials: js.UndefOr[DataSourceCredentials]
    var DataSourceParameters: js.UndefOr[DataSourceParameters]
    var Permissions: js.UndefOr[ResourcePermissionList]
    var SslProperties: js.UndefOr[SslProperties]
    var Tags: js.UndefOr[TagList]
    var VpcConnectionProperties: js.UndefOr[VpcConnectionProperties]
  }

  @js.native
  @Factory
  trait CreateDataSourceResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreationStatus: js.UndefOr[ResourceStatus]
    var DataSourceId: js.UndefOr[ResourceId]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait CreateGroupMembershipRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var GroupName: GroupName
    var MemberName: GroupMemberName
    var Namespace: Namespace
  }

  @js.native
  @Factory
  trait CreateGroupMembershipResponse extends js.Object {
    var GroupMember: js.UndefOr[GroupMember]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  /**
    * The request object for this operation.
    */
  @js.native
  @Factory
  trait CreateGroupRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var GroupName: GroupName
    var Namespace: Namespace
    var Description: js.UndefOr[GroupDescription]
  }

  /**
    * The response object for this operation.
    */
  @js.native
  @Factory
  trait CreateGroupResponse extends js.Object {
    var Group: js.UndefOr[Group]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait CreateIAMPolicyAssignmentRequest extends js.Object {
    var AssignmentName: IAMPolicyAssignmentName
    var AssignmentStatus: AssignmentStatus
    var AwsAccountId: AwsAccountId
    var Namespace: Namespace
    var Identities: js.UndefOr[IdentityMap]
    var PolicyArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait CreateIAMPolicyAssignmentResponse extends js.Object {
    var AssignmentId: js.UndefOr[String]
    var AssignmentName: js.UndefOr[IAMPolicyAssignmentName]
    var AssignmentStatus: js.UndefOr[AssignmentStatus]
    var Identities: js.UndefOr[IdentityMap]
    var PolicyArn: js.UndefOr[Arn]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait CreateIngestionRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DataSetId: String
    var IngestionId: IngestionId
  }

  @js.native
  @Factory
  trait CreateIngestionResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var IngestionId: js.UndefOr[IngestionId]
    var IngestionStatus: js.UndefOr[IngestionStatus]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait CreateTemplateAliasRequest extends js.Object {
    var AliasName: AliasName
    var AwsAccountId: AwsAccountId
    var TemplateId: RestrictiveResourceId
    var TemplateVersionNumber: VersionNumber
  }

  @js.native
  @Factory
  trait CreateTemplateAliasResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var TemplateAlias: js.UndefOr[TemplateAlias]
  }

  @js.native
  @Factory
  trait CreateTemplateRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var SourceEntity: TemplateSourceEntity
    var TemplateId: RestrictiveResourceId
    var Name: js.UndefOr[TemplateName]
    var Permissions: js.UndefOr[ResourcePermissionList]
    var Tags: js.UndefOr[TagList]
    var VersionDescription: js.UndefOr[VersionDescription]
  }

  @js.native
  @Factory
  trait CreateTemplateResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreationStatus: js.UndefOr[ResourceStatus]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var TemplateId: js.UndefOr[RestrictiveResourceId]
    var VersionArn: js.UndefOr[Arn]
  }

  /**
    * The combination of user name and password that are used as credentials.
    */
  @js.native
  @Factory
  trait CredentialPair extends js.Object {
    var Password: Password
    var Username: Username
  }

  /**
    * A physical table type built from the results of the custom SQL query.
    */
  @js.native
  @Factory
  trait CustomSql extends js.Object {
    var DataSourceArn: Arn
    var Name: CustomSqlName
    var SqlQuery: SqlQuery
    var Columns: js.UndefOr[InputColumnList]
  }

  /**
    * Dashboard.
    */
  @js.native
  @Factory
  trait Dashboard extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreatedTime: js.UndefOr[Timestamp]
    var DashboardId: js.UndefOr[RestrictiveResourceId]
    var LastPublishedTime: js.UndefOr[Timestamp]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[DashboardName]
    var Version: js.UndefOr[DashboardVersion]
  }

  @js.native
  sealed trait DashboardBehavior extends js.Any
  object DashboardBehavior extends js.Object {
    val ENABLED  = "ENABLED".asInstanceOf[DashboardBehavior]
    val DISABLED = "DISABLED".asInstanceOf[DashboardBehavior]

    val values = js.Object.freeze(js.Array(ENABLED, DISABLED))
  }

  /**
    * Dashboard error.
    */
  @js.native
  @Factory
  trait DashboardError extends js.Object {
    var Message: js.UndefOr[NonEmptyString]
    var Type: js.UndefOr[DashboardErrorType]
  }

  @js.native
  sealed trait DashboardErrorType extends js.Any
  object DashboardErrorType extends js.Object {
    val DATA_SET_NOT_FOUND              = "DATA_SET_NOT_FOUND".asInstanceOf[DashboardErrorType]
    val INTERNAL_FAILURE                = "INTERNAL_FAILURE".asInstanceOf[DashboardErrorType]
    val PARAMETER_VALUE_INCOMPATIBLE    = "PARAMETER_VALUE_INCOMPATIBLE".asInstanceOf[DashboardErrorType]
    val PARAMETER_TYPE_INVALID          = "PARAMETER_TYPE_INVALID".asInstanceOf[DashboardErrorType]
    val PARAMETER_NOT_FOUND             = "PARAMETER_NOT_FOUND".asInstanceOf[DashboardErrorType]
    val COLUMN_TYPE_MISMATCH            = "COLUMN_TYPE_MISMATCH".asInstanceOf[DashboardErrorType]
    val COLUMN_GEOGRAPHIC_ROLE_MISMATCH = "COLUMN_GEOGRAPHIC_ROLE_MISMATCH".asInstanceOf[DashboardErrorType]
    val COLUMN_REPLACEMENT_MISSING      = "COLUMN_REPLACEMENT_MISSING".asInstanceOf[DashboardErrorType]

    val values = js.Object.freeze(
      js.Array(
        DATA_SET_NOT_FOUND,
        INTERNAL_FAILURE,
        PARAMETER_VALUE_INCOMPATIBLE,
        PARAMETER_TYPE_INVALID,
        PARAMETER_NOT_FOUND,
        COLUMN_TYPE_MISMATCH,
        COLUMN_GEOGRAPHIC_ROLE_MISMATCH,
        COLUMN_REPLACEMENT_MISSING
      )
    )
  }

  /**
    * Dashboard publish options.
    */
  @js.native
  @Factory
  trait DashboardPublishOptions extends js.Object {
    var AdHocFilteringOption: js.UndefOr[AdHocFilteringOption]
    var ExportToCSVOption: js.UndefOr[ExportToCSVOption]
    var SheetControlsOption: js.UndefOr[SheetControlsOption]
  }

  /**
    * Dashboard source entity.
    */
  @js.native
  @Factory
  trait DashboardSourceEntity extends js.Object {
    var SourceTemplate: js.UndefOr[DashboardSourceTemplate]
  }

  /**
    * Dashboard source template.
    */
  @js.native
  @Factory
  trait DashboardSourceTemplate extends js.Object {
    var Arn: Arn
    var DataSetReferences: DataSetReferenceList
  }

  /**
    * Dashboard summary.
    */
  @js.native
  @Factory
  trait DashboardSummary extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreatedTime: js.UndefOr[Timestamp]
    var DashboardId: js.UndefOr[RestrictiveResourceId]
    var LastPublishedTime: js.UndefOr[Timestamp]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[DashboardName]
    var PublishedVersionNumber: js.UndefOr[VersionNumber]
  }

  @js.native
  sealed trait DashboardUIState extends js.Any
  object DashboardUIState extends js.Object {
    val EXPANDED  = "EXPANDED".asInstanceOf[DashboardUIState]
    val COLLAPSED = "COLLAPSED".asInstanceOf[DashboardUIState]

    val values = js.Object.freeze(js.Array(EXPANDED, COLLAPSED))
  }

  /**
    * Dashboard version.
    */
  @js.native
  @Factory
  trait DashboardVersion extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreatedTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[VersionDescription]
    var Errors: js.UndefOr[DashboardErrorList]
    var SourceEntityArn: js.UndefOr[Arn]
    var Status: js.UndefOr[ResourceStatus]
    var VersionNumber: js.UndefOr[VersionNumber]
  }

  /**
    * Dashboard version summary.
    */
  @js.native
  @Factory
  trait DashboardVersionSummary extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreatedTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[VersionDescription]
    var SourceEntityArn: js.UndefOr[Arn]
    var Status: js.UndefOr[ResourceStatus]
    var VersionNumber: js.UndefOr[VersionNumber]
  }

  /**
    * Dataset.
    */
  @js.native
  @Factory
  trait DataSet extends js.Object {
    var Arn: js.UndefOr[Arn]
    var ColumnGroups: js.UndefOr[ColumnGroupList]
    var ConsumedSpiceCapacityInBytes: js.UndefOr[Double]
    var CreatedTime: js.UndefOr[Timestamp]
    var DataSetId: js.UndefOr[ResourceId]
    var ImportMode: js.UndefOr[DataSetImportMode]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var LogicalTableMap: js.UndefOr[LogicalTableMap]
    var Name: js.UndefOr[ResourceName]
    var OutputColumns: js.UndefOr[OutputColumnList]
    var PhysicalTableMap: js.UndefOr[PhysicalTableMap]
    var RowLevelPermissionDataSet: js.UndefOr[RowLevelPermissionDataSet]
  }

  /**
    * Dataset configuration.
    */
  @js.native
  @Factory
  trait DataSetConfiguration extends js.Object {
    var ColumnGroupSchemaList: js.UndefOr[ColumnGroupSchemaList]
    var DataSetSchema: js.UndefOr[DataSetSchema]
    var Placeholder: js.UndefOr[String]
  }

  @js.native
  sealed trait DataSetImportMode extends js.Any
  object DataSetImportMode extends js.Object {
    val SPICE        = "SPICE".asInstanceOf[DataSetImportMode]
    val DIRECT_QUERY = "DIRECT_QUERY".asInstanceOf[DataSetImportMode]

    val values = js.Object.freeze(js.Array(SPICE, DIRECT_QUERY))
  }

  /**
    * Dataset reference.
    */
  @js.native
  @Factory
  trait DataSetReference extends js.Object {
    var DataSetArn: Arn
    var DataSetPlaceholder: NonEmptyString
  }

  /**
    * Dataset schema.
    */
  @js.native
  @Factory
  trait DataSetSchema extends js.Object {
    var ColumnSchemaList: js.UndefOr[ColumnSchemaList]
  }

  /**
    * Dataset summary.
    */
  @js.native
  @Factory
  trait DataSetSummary extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreatedTime: js.UndefOr[Timestamp]
    var DataSetId: js.UndefOr[ResourceId]
    var ImportMode: js.UndefOr[DataSetImportMode]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[ResourceName]
    var RowLevelPermissionDataSet: js.UndefOr[RowLevelPermissionDataSet]
  }

  /**
    * The structure of a data source.
    */
  @js.native
  @Factory
  trait DataSource extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreatedTime: js.UndefOr[Timestamp]
    var DataSourceId: js.UndefOr[ResourceId]
    var DataSourceParameters: js.UndefOr[DataSourceParameters]
    var ErrorInfo: js.UndefOr[DataSourceErrorInfo]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[ResourceName]
    var SslProperties: js.UndefOr[SslProperties]
    var Status: js.UndefOr[ResourceStatus]
    var Type: js.UndefOr[DataSourceType]
    var VpcConnectionProperties: js.UndefOr[VpcConnectionProperties]
  }

  /**
    * Data source credentials.
    */
  @js.native
  @Factory
  trait DataSourceCredentials extends js.Object {
    var CredentialPair: js.UndefOr[CredentialPair]
  }

  /**
    * Error information for the data source creation or update.
    */
  @js.native
  @Factory
  trait DataSourceErrorInfo extends js.Object {
    var Message: js.UndefOr[String]
    var Type: js.UndefOr[DataSourceErrorInfoType]
  }

  @js.native
  sealed trait DataSourceErrorInfoType extends js.Any
  object DataSourceErrorInfoType extends js.Object {
    val TIMEOUT                      = "TIMEOUT".asInstanceOf[DataSourceErrorInfoType]
    val ENGINE_VERSION_NOT_SUPPORTED = "ENGINE_VERSION_NOT_SUPPORTED".asInstanceOf[DataSourceErrorInfoType]
    val UNKNOWN_HOST                 = "UNKNOWN_HOST".asInstanceOf[DataSourceErrorInfoType]
    val GENERIC_SQL_FAILURE          = "GENERIC_SQL_FAILURE".asInstanceOf[DataSourceErrorInfoType]
    val CONFLICT                     = "CONFLICT".asInstanceOf[DataSourceErrorInfoType]
    val UNKNOWN                      = "UNKNOWN".asInstanceOf[DataSourceErrorInfoType]

    val values = js.Object.freeze(
      js.Array(TIMEOUT, ENGINE_VERSION_NOT_SUPPORTED, UNKNOWN_HOST, GENERIC_SQL_FAILURE, CONFLICT, UNKNOWN)
    )
  }

  /**
    * The parameters that Amazon QuickSight uses to connect to your underlying data source. This is a variant type structure. For this structure to be valid, only one of the attributes can be non-null.
    */
  @js.native
  @Factory
  trait DataSourceParameters extends js.Object {
    var AmazonElasticsearchParameters: js.UndefOr[AmazonElasticsearchParameters]
    var AthenaParameters: js.UndefOr[AthenaParameters]
    var AuroraParameters: js.UndefOr[AuroraParameters]
    var AuroraPostgreSqlParameters: js.UndefOr[AuroraPostgreSqlParameters]
    var AwsIotAnalyticsParameters: js.UndefOr[AwsIotAnalyticsParameters]
    var JiraParameters: js.UndefOr[JiraParameters]
    var MariaDbParameters: js.UndefOr[MariaDbParameters]
    var MySqlParameters: js.UndefOr[MySqlParameters]
    var PostgreSqlParameters: js.UndefOr[PostgreSqlParameters]
    var PrestoParameters: js.UndefOr[PrestoParameters]
    var RdsParameters: js.UndefOr[RdsParameters]
    var RedshiftParameters: js.UndefOr[RedshiftParameters]
    var S3Parameters: js.UndefOr[S3Parameters]
    var ServiceNowParameters: js.UndefOr[ServiceNowParameters]
    var SnowflakeParameters: js.UndefOr[SnowflakeParameters]
    var SparkParameters: js.UndefOr[SparkParameters]
    var SqlServerParameters: js.UndefOr[SqlServerParameters]
    var TeradataParameters: js.UndefOr[TeradataParameters]
    var TwitterParameters: js.UndefOr[TwitterParameters]
  }

  @js.native
  sealed trait DataSourceType extends js.Any
  object DataSourceType extends js.Object {
    val ADOBE_ANALYTICS      = "ADOBE_ANALYTICS".asInstanceOf[DataSourceType]
    val AMAZON_ELASTICSEARCH = "AMAZON_ELASTICSEARCH".asInstanceOf[DataSourceType]
    val ATHENA               = "ATHENA".asInstanceOf[DataSourceType]
    val AURORA               = "AURORA".asInstanceOf[DataSourceType]
    val AURORA_POSTGRESQL    = "AURORA_POSTGRESQL".asInstanceOf[DataSourceType]
    val AWS_IOT_ANALYTICS    = "AWS_IOT_ANALYTICS".asInstanceOf[DataSourceType]
    val GITHUB               = "GITHUB".asInstanceOf[DataSourceType]
    val JIRA                 = "JIRA".asInstanceOf[DataSourceType]
    val MARIADB              = "MARIADB".asInstanceOf[DataSourceType]
    val MYSQL                = "MYSQL".asInstanceOf[DataSourceType]
    val POSTGRESQL           = "POSTGRESQL".asInstanceOf[DataSourceType]
    val PRESTO               = "PRESTO".asInstanceOf[DataSourceType]
    val REDSHIFT             = "REDSHIFT".asInstanceOf[DataSourceType]
    val S3                   = "S3".asInstanceOf[DataSourceType]
    val SALESFORCE           = "SALESFORCE".asInstanceOf[DataSourceType]
    val SERVICENOW           = "SERVICENOW".asInstanceOf[DataSourceType]
    val SNOWFLAKE            = "SNOWFLAKE".asInstanceOf[DataSourceType]
    val SPARK                = "SPARK".asInstanceOf[DataSourceType]
    val SQLSERVER            = "SQLSERVER".asInstanceOf[DataSourceType]
    val TERADATA             = "TERADATA".asInstanceOf[DataSourceType]
    val TWITTER              = "TWITTER".asInstanceOf[DataSourceType]

    val values = js.Object.freeze(
      js.Array(
        ADOBE_ANALYTICS,
        AMAZON_ELASTICSEARCH,
        ATHENA,
        AURORA,
        AURORA_POSTGRESQL,
        AWS_IOT_ANALYTICS,
        GITHUB,
        JIRA,
        MARIADB,
        MYSQL,
        POSTGRESQL,
        PRESTO,
        REDSHIFT,
        S3,
        SALESFORCE,
        SERVICENOW,
        SNOWFLAKE,
        SPARK,
        SQLSERVER,
        TERADATA,
        TWITTER
      )
    )
  }

  /**
    * Date time parameter.
    */
  @js.native
  @Factory
  trait DateTimeParameter extends js.Object {
    var Name: NonEmptyString
    var Values: TimestampList
  }

  /**
    * Decimal parameter.
    */
  @js.native
  @Factory
  trait DecimalParameter extends js.Object {
    var Name: NonEmptyString
    var Values: DoubleList
  }

  @js.native
  @Factory
  trait DeleteDashboardRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DashboardId: RestrictiveResourceId
    var VersionNumber: js.UndefOr[VersionNumber]
  }

  @js.native
  @Factory
  trait DeleteDashboardResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var DashboardId: js.UndefOr[RestrictiveResourceId]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait DeleteDataSetRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DataSetId: ResourceId
  }

  @js.native
  @Factory
  trait DeleteDataSetResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var DataSetId: js.UndefOr[ResourceId]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait DeleteDataSourceRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DataSourceId: ResourceId
  }

  @js.native
  @Factory
  trait DeleteDataSourceResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var DataSourceId: js.UndefOr[ResourceId]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait DeleteGroupMembershipRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var GroupName: GroupName
    var MemberName: GroupMemberName
    var Namespace: Namespace
  }

  @js.native
  @Factory
  trait DeleteGroupMembershipResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait DeleteGroupRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var GroupName: GroupName
    var Namespace: Namespace
  }

  @js.native
  @Factory
  trait DeleteGroupResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait DeleteIAMPolicyAssignmentRequest extends js.Object {
    var AssignmentName: IAMPolicyAssignmentName
    var AwsAccountId: AwsAccountId
    var Namespace: Namespace
  }

  @js.native
  @Factory
  trait DeleteIAMPolicyAssignmentResponse extends js.Object {
    var AssignmentName: js.UndefOr[IAMPolicyAssignmentName]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait DeleteTemplateAliasRequest extends js.Object {
    var AliasName: AliasName
    var AwsAccountId: AwsAccountId
    var TemplateId: RestrictiveResourceId
  }

  @js.native
  @Factory
  trait DeleteTemplateAliasResponse extends js.Object {
    var AliasName: js.UndefOr[AliasName]
    var Arn: js.UndefOr[Arn]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var TemplateId: js.UndefOr[RestrictiveResourceId]
  }

  @js.native
  @Factory
  trait DeleteTemplateRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var TemplateId: RestrictiveResourceId
    var VersionNumber: js.UndefOr[VersionNumber]
  }

  @js.native
  @Factory
  trait DeleteTemplateResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var TemplateId: js.UndefOr[RestrictiveResourceId]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteUserByPrincipalIdRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Namespace: Namespace
    var PrincipalId: String
  }

  @js.native
  @Factory
  trait DeleteUserByPrincipalIdResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait DeleteUserRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Namespace: Namespace
    var UserName: UserName
  }

  @js.native
  @Factory
  trait DeleteUserResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait DescribeDashboardPermissionsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DashboardId: RestrictiveResourceId
  }

  @js.native
  @Factory
  trait DescribeDashboardPermissionsResponse extends js.Object {
    var DashboardArn: js.UndefOr[Arn]
    var DashboardId: js.UndefOr[RestrictiveResourceId]
    var Permissions: js.UndefOr[ResourcePermissionList]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait DescribeDashboardRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DashboardId: RestrictiveResourceId
    var AliasName: js.UndefOr[AliasName]
    var VersionNumber: js.UndefOr[VersionNumber]
  }

  @js.native
  @Factory
  trait DescribeDashboardResponse extends js.Object {
    var Dashboard: js.UndefOr[Dashboard]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait DescribeDataSetPermissionsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DataSetId: ResourceId
  }

  @js.native
  @Factory
  trait DescribeDataSetPermissionsResponse extends js.Object {
    var DataSetArn: js.UndefOr[Arn]
    var DataSetId: js.UndefOr[ResourceId]
    var Permissions: js.UndefOr[ResourcePermissionList]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait DescribeDataSetRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DataSetId: ResourceId
  }

  @js.native
  @Factory
  trait DescribeDataSetResponse extends js.Object {
    var DataSet: js.UndefOr[DataSet]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait DescribeDataSourcePermissionsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DataSourceId: ResourceId
  }

  @js.native
  @Factory
  trait DescribeDataSourcePermissionsResponse extends js.Object {
    var DataSourceArn: js.UndefOr[Arn]
    var DataSourceId: js.UndefOr[ResourceId]
    var Permissions: js.UndefOr[ResourcePermissionList]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait DescribeDataSourceRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DataSourceId: ResourceId
  }

  @js.native
  @Factory
  trait DescribeDataSourceResponse extends js.Object {
    var DataSource: js.UndefOr[DataSource]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait DescribeGroupRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var GroupName: GroupName
    var Namespace: Namespace
  }

  @js.native
  @Factory
  trait DescribeGroupResponse extends js.Object {
    var Group: js.UndefOr[Group]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait DescribeIAMPolicyAssignmentRequest extends js.Object {
    var AssignmentName: IAMPolicyAssignmentName
    var AwsAccountId: AwsAccountId
    var Namespace: Namespace
  }

  @js.native
  @Factory
  trait DescribeIAMPolicyAssignmentResponse extends js.Object {
    var IAMPolicyAssignment: js.UndefOr[IAMPolicyAssignment]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait DescribeIngestionRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DataSetId: String
    var IngestionId: IngestionId
  }

  @js.native
  @Factory
  trait DescribeIngestionResponse extends js.Object {
    var Ingestion: js.UndefOr[Ingestion]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait DescribeTemplateAliasRequest extends js.Object {
    var AliasName: AliasName
    var AwsAccountId: AwsAccountId
    var TemplateId: RestrictiveResourceId
  }

  @js.native
  @Factory
  trait DescribeTemplateAliasResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var TemplateAlias: js.UndefOr[TemplateAlias]
  }

  @js.native
  @Factory
  trait DescribeTemplatePermissionsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var TemplateId: RestrictiveResourceId
  }

  @js.native
  @Factory
  trait DescribeTemplatePermissionsResponse extends js.Object {
    var Permissions: js.UndefOr[ResourcePermissionList]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var TemplateArn: js.UndefOr[Arn]
    var TemplateId: js.UndefOr[RestrictiveResourceId]
  }

  @js.native
  @Factory
  trait DescribeTemplateRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var TemplateId: RestrictiveResourceId
    var AliasName: js.UndefOr[AliasName]
    var VersionNumber: js.UndefOr[VersionNumber]
  }

  @js.native
  @Factory
  trait DescribeTemplateResponse extends js.Object {
    var Status: js.UndefOr[StatusCode]
    var Template: js.UndefOr[Template]
  }

  @js.native
  @Factory
  trait DescribeUserRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Namespace: Namespace
    var UserName: UserName
  }

  @js.native
  @Factory
  trait DescribeUserResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var User: js.UndefOr[User]
  }

  /**
    * Error information for the SPICE ingestion of a dataset.
    */
  @js.native
  @Factory
  trait ErrorInfo extends js.Object {
    var Message: js.UndefOr[String]
    var Type: js.UndefOr[IngestionErrorType]
  }

  /**
    * Export to .csv option.
    */
  @js.native
  @Factory
  trait ExportToCSVOption extends js.Object {
    var AvailabilityStatus: js.UndefOr[DashboardBehavior]
  }

  @js.native
  sealed trait FileFormat extends js.Any
  object FileFormat extends js.Object {
    val CSV  = "CSV".asInstanceOf[FileFormat]
    val TSV  = "TSV".asInstanceOf[FileFormat]
    val CLF  = "CLF".asInstanceOf[FileFormat]
    val ELF  = "ELF".asInstanceOf[FileFormat]
    val XLSX = "XLSX".asInstanceOf[FileFormat]
    val JSON = "JSON".asInstanceOf[FileFormat]

    val values = js.Object.freeze(js.Array(CSV, TSV, CLF, ELF, XLSX, JSON))
  }

  /**
    * A transform operation that filters rows based on a condition.
    */
  @js.native
  @Factory
  trait FilterOperation extends js.Object {
    var ConditionExpression: Expression
  }

  /**
    * Geospatial column group that denotes a hierarchy.
    */
  @js.native
  @Factory
  trait GeoSpatialColumnGroup extends js.Object {
    var Columns: ColumnList
    var CountryCode: GeoSpatialCountryCode
    var Name: ColumnGroupName
  }

  @js.native
  sealed trait GeoSpatialCountryCode extends js.Any
  object GeoSpatialCountryCode extends js.Object {
    val US = "US".asInstanceOf[GeoSpatialCountryCode]

    val values = js.Object.freeze(js.Array(US))
  }

  @js.native
  sealed trait GeoSpatialDataRole extends js.Any
  object GeoSpatialDataRole extends js.Object {
    val COUNTRY   = "COUNTRY".asInstanceOf[GeoSpatialDataRole]
    val STATE     = "STATE".asInstanceOf[GeoSpatialDataRole]
    val COUNTY    = "COUNTY".asInstanceOf[GeoSpatialDataRole]
    val CITY      = "CITY".asInstanceOf[GeoSpatialDataRole]
    val POSTCODE  = "POSTCODE".asInstanceOf[GeoSpatialDataRole]
    val LONGITUDE = "LONGITUDE".asInstanceOf[GeoSpatialDataRole]
    val LATITUDE  = "LATITUDE".asInstanceOf[GeoSpatialDataRole]

    val values = js.Object.freeze(js.Array(COUNTRY, STATE, COUNTY, CITY, POSTCODE, LONGITUDE, LATITUDE))
  }

  @js.native
  @Factory
  trait GetDashboardEmbedUrlRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DashboardId: RestrictiveResourceId
    var IdentityType: IdentityType
    var ResetDisabled: js.UndefOr[Boolean]
    var SessionLifetimeInMinutes: js.UndefOr[SessionLifetimeInMinutes]
    var UndoRedoDisabled: js.UndefOr[Boolean]
    var UserArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait GetDashboardEmbedUrlResponse extends js.Object {
    var EmbedUrl: js.UndefOr[EmbeddingUrl]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  /**
    * A <i>group</i> in Amazon QuickSight consists of a set of users. You can use groups to make it easier to manage access and security. Currently, an Amazon QuickSight subscription can't contain more than 500 Amazon QuickSight groups.
    */
  @js.native
  @Factory
  trait Group extends js.Object {
    var Arn: js.UndefOr[Arn]
    var Description: js.UndefOr[GroupDescription]
    var GroupName: js.UndefOr[GroupName]
    var PrincipalId: js.UndefOr[String]
  }

  /**
    * A member of an Amazon QuickSight group. Currently, group members must be users. Groups can't be members of another group. .
    */
  @js.native
  @Factory
  trait GroupMember extends js.Object {
    var Arn: js.UndefOr[Arn]
    var MemberName: js.UndefOr[GroupMemberName]
  }

  /**
    * An IAM policy assignment.
    */
  @js.native
  @Factory
  trait IAMPolicyAssignment extends js.Object {
    var AssignmentId: js.UndefOr[String]
    var AssignmentName: js.UndefOr[IAMPolicyAssignmentName]
    var AssignmentStatus: js.UndefOr[AssignmentStatus]
    var AwsAccountId: js.UndefOr[AwsAccountId]
    var Identities: js.UndefOr[IdentityMap]
    var PolicyArn: js.UndefOr[Arn]
  }

  /**
    * IAM policy assignment summary.
    */
  @js.native
  @Factory
  trait IAMPolicyAssignmentSummary extends js.Object {
    var AssignmentName: js.UndefOr[IAMPolicyAssignmentName]
    var AssignmentStatus: js.UndefOr[AssignmentStatus]
  }

  @js.native
  sealed trait IdentityType extends js.Any
  object IdentityType extends js.Object {
    val IAM        = "IAM".asInstanceOf[IdentityType]
    val QUICKSIGHT = "QUICKSIGHT".asInstanceOf[IdentityType]

    val values = js.Object.freeze(js.Array(IAM, QUICKSIGHT))
  }

  /**
    * Information about the SPICE ingestion for a dataset.
    */
  @js.native
  @Factory
  trait Ingestion extends js.Object {
    var Arn: Arn
    var CreatedTime: timestamp
    var IngestionStatus: IngestionStatus
    var ErrorInfo: js.UndefOr[ErrorInfo]
    var IngestionId: js.UndefOr[IngestionId]
    var IngestionSizeInBytes: js.UndefOr[Double]
    var IngestionTimeInSeconds: js.UndefOr[Double]
    var QueueInfo: js.UndefOr[QueueInfo]
    var RequestSource: js.UndefOr[IngestionRequestSource]
    var RequestType: js.UndefOr[IngestionRequestType]
    var RowInfo: js.UndefOr[RowInfo]
  }

  @js.native
  sealed trait IngestionErrorType extends js.Any
  object IngestionErrorType extends js.Object {
    val FAILURE_TO_ASSUME_ROLE             = "FAILURE_TO_ASSUME_ROLE".asInstanceOf[IngestionErrorType]
    val INGESTION_SUPERSEDED               = "INGESTION_SUPERSEDED".asInstanceOf[IngestionErrorType]
    val INGESTION_CANCELED                 = "INGESTION_CANCELED".asInstanceOf[IngestionErrorType]
    val DATA_SET_DELETED                   = "DATA_SET_DELETED".asInstanceOf[IngestionErrorType]
    val DATA_SET_NOT_SPICE                 = "DATA_SET_NOT_SPICE".asInstanceOf[IngestionErrorType]
    val S3_UPLOADED_FILE_DELETED           = "S3_UPLOADED_FILE_DELETED".asInstanceOf[IngestionErrorType]
    val S3_MANIFEST_ERROR                  = "S3_MANIFEST_ERROR".asInstanceOf[IngestionErrorType]
    val DATA_TOLERANCE_EXCEPTION           = "DATA_TOLERANCE_EXCEPTION".asInstanceOf[IngestionErrorType]
    val SPICE_TABLE_NOT_FOUND              = "SPICE_TABLE_NOT_FOUND".asInstanceOf[IngestionErrorType]
    val DATA_SET_SIZE_LIMIT_EXCEEDED       = "DATA_SET_SIZE_LIMIT_EXCEEDED".asInstanceOf[IngestionErrorType]
    val ROW_SIZE_LIMIT_EXCEEDED            = "ROW_SIZE_LIMIT_EXCEEDED".asInstanceOf[IngestionErrorType]
    val ACCOUNT_CAPACITY_LIMIT_EXCEEDED    = "ACCOUNT_CAPACITY_LIMIT_EXCEEDED".asInstanceOf[IngestionErrorType]
    val CUSTOMER_ERROR                     = "CUSTOMER_ERROR".asInstanceOf[IngestionErrorType]
    val DATA_SOURCE_NOT_FOUND              = "DATA_SOURCE_NOT_FOUND".asInstanceOf[IngestionErrorType]
    val IAM_ROLE_NOT_AVAILABLE             = "IAM_ROLE_NOT_AVAILABLE".asInstanceOf[IngestionErrorType]
    val CONNECTION_FAILURE                 = "CONNECTION_FAILURE".asInstanceOf[IngestionErrorType]
    val SQL_TABLE_NOT_FOUND                = "SQL_TABLE_NOT_FOUND".asInstanceOf[IngestionErrorType]
    val PERMISSION_DENIED                  = "PERMISSION_DENIED".asInstanceOf[IngestionErrorType]
    val SSL_CERTIFICATE_VALIDATION_FAILURE = "SSL_CERTIFICATE_VALIDATION_FAILURE".asInstanceOf[IngestionErrorType]
    val OAUTH_TOKEN_FAILURE                = "OAUTH_TOKEN_FAILURE".asInstanceOf[IngestionErrorType]
    val SOURCE_API_LIMIT_EXCEEDED_FAILURE  = "SOURCE_API_LIMIT_EXCEEDED_FAILURE".asInstanceOf[IngestionErrorType]
    val PASSWORD_AUTHENTICATION_FAILURE    = "PASSWORD_AUTHENTICATION_FAILURE".asInstanceOf[IngestionErrorType]
    val SQL_SCHEMA_MISMATCH_ERROR          = "SQL_SCHEMA_MISMATCH_ERROR".asInstanceOf[IngestionErrorType]
    val INVALID_DATE_FORMAT                = "INVALID_DATE_FORMAT".asInstanceOf[IngestionErrorType]
    val INVALID_DATAPREP_SYNTAX            = "INVALID_DATAPREP_SYNTAX".asInstanceOf[IngestionErrorType]
    val SOURCE_RESOURCE_LIMIT_EXCEEDED     = "SOURCE_RESOURCE_LIMIT_EXCEEDED".asInstanceOf[IngestionErrorType]
    val SQL_INVALID_PARAMETER_VALUE        = "SQL_INVALID_PARAMETER_VALUE".asInstanceOf[IngestionErrorType]
    val QUERY_TIMEOUT                      = "QUERY_TIMEOUT".asInstanceOf[IngestionErrorType]
    val SQL_NUMERIC_OVERFLOW               = "SQL_NUMERIC_OVERFLOW".asInstanceOf[IngestionErrorType]
    val UNRESOLVABLE_HOST                  = "UNRESOLVABLE_HOST".asInstanceOf[IngestionErrorType]
    val UNROUTABLE_HOST                    = "UNROUTABLE_HOST".asInstanceOf[IngestionErrorType]
    val SQL_EXCEPTION                      = "SQL_EXCEPTION".asInstanceOf[IngestionErrorType]
    val S3_FILE_INACCESSIBLE               = "S3_FILE_INACCESSIBLE".asInstanceOf[IngestionErrorType]
    val IOT_FILE_NOT_FOUND                 = "IOT_FILE_NOT_FOUND".asInstanceOf[IngestionErrorType]
    val IOT_DATA_SET_FILE_EMPTY            = "IOT_DATA_SET_FILE_EMPTY".asInstanceOf[IngestionErrorType]
    val INVALID_DATA_SOURCE_CONFIG         = "INVALID_DATA_SOURCE_CONFIG".asInstanceOf[IngestionErrorType]
    val DATA_SOURCE_AUTH_FAILED            = "DATA_SOURCE_AUTH_FAILED".asInstanceOf[IngestionErrorType]
    val DATA_SOURCE_CONNECTION_FAILED      = "DATA_SOURCE_CONNECTION_FAILED".asInstanceOf[IngestionErrorType]
    val FAILURE_TO_PROCESS_JSON_FILE       = "FAILURE_TO_PROCESS_JSON_FILE".asInstanceOf[IngestionErrorType]
    val INTERNAL_SERVICE_ERROR             = "INTERNAL_SERVICE_ERROR".asInstanceOf[IngestionErrorType]

    val values = js.Object.freeze(
      js.Array(
        FAILURE_TO_ASSUME_ROLE,
        INGESTION_SUPERSEDED,
        INGESTION_CANCELED,
        DATA_SET_DELETED,
        DATA_SET_NOT_SPICE,
        S3_UPLOADED_FILE_DELETED,
        S3_MANIFEST_ERROR,
        DATA_TOLERANCE_EXCEPTION,
        SPICE_TABLE_NOT_FOUND,
        DATA_SET_SIZE_LIMIT_EXCEEDED,
        ROW_SIZE_LIMIT_EXCEEDED,
        ACCOUNT_CAPACITY_LIMIT_EXCEEDED,
        CUSTOMER_ERROR,
        DATA_SOURCE_NOT_FOUND,
        IAM_ROLE_NOT_AVAILABLE,
        CONNECTION_FAILURE,
        SQL_TABLE_NOT_FOUND,
        PERMISSION_DENIED,
        SSL_CERTIFICATE_VALIDATION_FAILURE,
        OAUTH_TOKEN_FAILURE,
        SOURCE_API_LIMIT_EXCEEDED_FAILURE,
        PASSWORD_AUTHENTICATION_FAILURE,
        SQL_SCHEMA_MISMATCH_ERROR,
        INVALID_DATE_FORMAT,
        INVALID_DATAPREP_SYNTAX,
        SOURCE_RESOURCE_LIMIT_EXCEEDED,
        SQL_INVALID_PARAMETER_VALUE,
        QUERY_TIMEOUT,
        SQL_NUMERIC_OVERFLOW,
        UNRESOLVABLE_HOST,
        UNROUTABLE_HOST,
        SQL_EXCEPTION,
        S3_FILE_INACCESSIBLE,
        IOT_FILE_NOT_FOUND,
        IOT_DATA_SET_FILE_EMPTY,
        INVALID_DATA_SOURCE_CONFIG,
        DATA_SOURCE_AUTH_FAILED,
        DATA_SOURCE_CONNECTION_FAILED,
        FAILURE_TO_PROCESS_JSON_FILE,
        INTERNAL_SERVICE_ERROR
      )
    )
  }

  @js.native
  sealed trait IngestionRequestSource extends js.Any
  object IngestionRequestSource extends js.Object {
    val MANUAL    = "MANUAL".asInstanceOf[IngestionRequestSource]
    val SCHEDULED = "SCHEDULED".asInstanceOf[IngestionRequestSource]

    val values = js.Object.freeze(js.Array(MANUAL, SCHEDULED))
  }

  @js.native
  sealed trait IngestionRequestType extends js.Any
  object IngestionRequestType extends js.Object {
    val INITIAL_INGESTION   = "INITIAL_INGESTION".asInstanceOf[IngestionRequestType]
    val EDIT                = "EDIT".asInstanceOf[IngestionRequestType]
    val INCREMENTAL_REFRESH = "INCREMENTAL_REFRESH".asInstanceOf[IngestionRequestType]
    val FULL_REFRESH        = "FULL_REFRESH".asInstanceOf[IngestionRequestType]

    val values = js.Object.freeze(js.Array(INITIAL_INGESTION, EDIT, INCREMENTAL_REFRESH, FULL_REFRESH))
  }

  @js.native
  sealed trait IngestionStatus extends js.Any
  object IngestionStatus extends js.Object {
    val INITIALIZED = "INITIALIZED".asInstanceOf[IngestionStatus]
    val QUEUED      = "QUEUED".asInstanceOf[IngestionStatus]
    val RUNNING     = "RUNNING".asInstanceOf[IngestionStatus]
    val FAILED      = "FAILED".asInstanceOf[IngestionStatus]
    val COMPLETED   = "COMPLETED".asInstanceOf[IngestionStatus]
    val CANCELLED   = "CANCELLED".asInstanceOf[IngestionStatus]

    val values = js.Object.freeze(js.Array(INITIALIZED, QUEUED, RUNNING, FAILED, COMPLETED, CANCELLED))
  }

  /**
    * Metadata for a column that is used as the input of a transform operation.
    */
  @js.native
  @Factory
  trait InputColumn extends js.Object {
    var Name: ColumnName
    var Type: InputColumnDataType
  }

  @js.native
  sealed trait InputColumnDataType extends js.Any
  object InputColumnDataType extends js.Object {
    val STRING   = "STRING".asInstanceOf[InputColumnDataType]
    val INTEGER  = "INTEGER".asInstanceOf[InputColumnDataType]
    val DECIMAL  = "DECIMAL".asInstanceOf[InputColumnDataType]
    val DATETIME = "DATETIME".asInstanceOf[InputColumnDataType]
    val BIT      = "BIT".asInstanceOf[InputColumnDataType]
    val BOOLEAN  = "BOOLEAN".asInstanceOf[InputColumnDataType]
    val JSON     = "JSON".asInstanceOf[InputColumnDataType]

    val values = js.Object.freeze(js.Array(STRING, INTEGER, DECIMAL, DATETIME, BIT, BOOLEAN, JSON))
  }

  /**
    * Integer parameter.
    */
  @js.native
  @Factory
  trait IntegerParameter extends js.Object {
    var Name: NonEmptyString
    var Values: LongList
  }

  /**
    * Jira parameters.
    */
  @js.native
  @Factory
  trait JiraParameters extends js.Object {
    var SiteBaseUrl: SiteBaseUrl
  }

  /**
    * Join instruction.
    */
  @js.native
  @Factory
  trait JoinInstruction extends js.Object {
    var LeftOperand: LogicalTableId
    var OnClause: OnClause
    var RightOperand: LogicalTableId
    var Type: JoinType
  }

  @js.native
  sealed trait JoinType extends js.Any
  object JoinType extends js.Object {
    val INNER = "INNER".asInstanceOf[JoinType]
    val OUTER = "OUTER".asInstanceOf[JoinType]
    val LEFT  = "LEFT".asInstanceOf[JoinType]
    val RIGHT = "RIGHT".asInstanceOf[JoinType]

    val values = js.Object.freeze(js.Array(INNER, OUTER, LEFT, RIGHT))
  }

  @js.native
  @Factory
  trait ListDashboardVersionsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DashboardId: RestrictiveResourceId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListDashboardVersionsResponse extends js.Object {
    var DashboardVersionSummaryList: js.UndefOr[DashboardVersionSummaryList]
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait ListDashboardsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListDashboardsResponse extends js.Object {
    var DashboardSummaryList: js.UndefOr[DashboardSummaryList]
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait ListDataSetsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListDataSetsResponse extends js.Object {
    var DataSetSummaries: js.UndefOr[DataSetSummaryList]
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait ListDataSourcesRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListDataSourcesResponse extends js.Object {
    var DataSources: js.UndefOr[DataSourceList]
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait ListGroupMembershipsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var GroupName: GroupName
    var Namespace: Namespace
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListGroupMembershipsResponse extends js.Object {
    var GroupMemberList: js.UndefOr[GroupMemberList]
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait ListGroupsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Namespace: Namespace
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListGroupsResponse extends js.Object {
    var GroupList: js.UndefOr[GroupList]
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait ListIAMPolicyAssignmentsForUserRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Namespace: Namespace
    var UserName: UserName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListIAMPolicyAssignmentsForUserResponse extends js.Object {
    var ActiveAssignments: js.UndefOr[ActiveIAMPolicyAssignmentList]
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait ListIAMPolicyAssignmentsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Namespace: Namespace
    var AssignmentStatus: js.UndefOr[AssignmentStatus]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListIAMPolicyAssignmentsResponse extends js.Object {
    var IAMPolicyAssignments: js.UndefOr[IAMPolicyAssignmentSummaryList]
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait ListIngestionsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DataSetId: String
    var MaxResults: js.UndefOr[IngestionMaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListIngestionsResponse extends js.Object {
    var Ingestions: js.UndefOr[Ingestions]
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: Arn
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait ListTemplateAliasesRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var TemplateId: RestrictiveResourceId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListTemplateAliasesResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var TemplateAliasList: js.UndefOr[TemplateAliasList]
  }

  @js.native
  @Factory
  trait ListTemplateVersionsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var TemplateId: RestrictiveResourceId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListTemplateVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var TemplateVersionSummaryList: js.UndefOr[TemplateVersionSummaryList]
  }

  @js.native
  @Factory
  trait ListTemplatesRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListTemplatesResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var TemplateSummaryList: js.UndefOr[TemplateSummaryList]
  }

  @js.native
  @Factory
  trait ListUserGroupsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Namespace: Namespace
    var UserName: UserName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListUserGroupsResponse extends js.Object {
    var GroupList: js.UndefOr[GroupList]
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait ListUsersRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Namespace: Namespace
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListUsersResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var UserList: js.UndefOr[UserList]
  }

  /**
    * A <i>logical table</i> is a unit that joins and that data transformations operate on. A logical table has a source, which can be either a physical table or result of a join. When a logical table points to a physical table, the logical table acts as a mutable copy of that physical table through transform operations.
    */
  @js.native
  @Factory
  trait LogicalTable extends js.Object {
    var Alias: LogicalTableAlias
    var Source: LogicalTableSource
    var DataTransforms: js.UndefOr[TransformOperationList]
  }

  /**
    * Information about the source of a logical table. This is a variant type structure. For this structure to be valid, only one of the attributes can be non-null.
    */
  @js.native
  @Factory
  trait LogicalTableSource extends js.Object {
    var JoinInstruction: js.UndefOr[JoinInstruction]
    var PhysicalTableId: js.UndefOr[PhysicalTableId]
  }

  /**
    * Amazon S3 manifest file location.
    */
  @js.native
  @Factory
  trait ManifestFileLocation extends js.Object {
    var Bucket: S3Bucket
    var Key: S3Key
  }

  /**
    * MariaDB parameters.
    */
  @js.native
  @Factory
  trait MariaDbParameters extends js.Object {
    var Database: Database
    var Host: Host
    var Port: Port
  }

  /**
    * MySQL parameters.
    */
  @js.native
  @Factory
  trait MySqlParameters extends js.Object {
    var Database: Database
    var Host: Host
    var Port: Port
  }

  /**
    * Output column.
    */
  @js.native
  @Factory
  trait OutputColumn extends js.Object {
    var Name: js.UndefOr[ColumnName]
    var Type: js.UndefOr[ColumnDataType]
  }

  /**
    * Parameters.
    */
  @js.native
  @Factory
  trait Parameters extends js.Object {
    var DateTimeParameters: js.UndefOr[DateTimeParameterList]
    var DecimalParameters: js.UndefOr[DecimalParameterList]
    var IntegerParameters: js.UndefOr[IntegerParameterList]
    var StringParameters: js.UndefOr[StringParameterList]
  }

  /**
    * A view of a data source that contains information about the shape of the data in the underlying source. This is a variant type structure. For this structure to be valid, only one of the attributes can be non-null.
    */
  @js.native
  @Factory
  trait PhysicalTable extends js.Object {
    var CustomSql: js.UndefOr[CustomSql]
    var RelationalTable: js.UndefOr[RelationalTable]
    var S3Source: js.UndefOr[S3Source]
  }

  /**
    * PostgreSQL parameters.
    */
  @js.native
  @Factory
  trait PostgreSqlParameters extends js.Object {
    var Database: Database
    var Host: Host
    var Port: Port
  }

  /**
    * Presto parameters.
    */
  @js.native
  @Factory
  trait PrestoParameters extends js.Object {
    var Catalog: Catalog
    var Host: Host
    var Port: Port
  }

  /**
    * A transform operation that projects columns. Operations that come after a projection can only refer to projected columns.
    */
  @js.native
  @Factory
  trait ProjectOperation extends js.Object {
    var ProjectedColumns: ProjectedColumnList
  }

  /**
    * Information about a queued dataset SPICE ingestion.
    */
  @js.native
  @Factory
  trait QueueInfo extends js.Object {
    var QueuedIngestion: String
    var WaitingOnIngestion: String
  }

  /**
    * Amazon RDS parameters.
    */
  @js.native
  @Factory
  trait RdsParameters extends js.Object {
    var Database: Database
    var InstanceId: InstanceId
  }

  /**
    * Amazon Redshift parameters. The <code>ClusterId</code> field can be blank if <code>Host</code> and <code>Port</code> are both set. The <code>Host</code> and <code>Port</code> fields can be blank if the <code>ClusterId</code> field is set.
    */
  @js.native
  @Factory
  trait RedshiftParameters extends js.Object {
    var Database: Database
    var ClusterId: js.UndefOr[ClusterId]
    var Host: js.UndefOr[Host]
    var Port: js.UndefOr[OptionalPort]
  }

  @js.native
  @Factory
  trait RegisterUserRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Email: String
    var IdentityType: IdentityType
    var Namespace: Namespace
    var UserRole: UserRole
    var IamArn: js.UndefOr[String]
    var SessionName: js.UndefOr[RoleSessionName]
    var UserName: js.UndefOr[UserName]
  }

  @js.native
  @Factory
  trait RegisterUserResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var User: js.UndefOr[User]
    var UserInvitationUrl: js.UndefOr[String]
  }

  /**
    * A physical table type for relational data sources.
    */
  @js.native
  @Factory
  trait RelationalTable extends js.Object {
    var DataSourceArn: Arn
    var InputColumns: InputColumnList
    var Name: RelationalTableName
    var Schema: js.UndefOr[RelationalTableSchema]
  }

  /**
    * A transform operation that renames a column.
    */
  @js.native
  @Factory
  trait RenameColumnOperation extends js.Object {
    var ColumnName: ColumnName
    var NewColumnName: ColumnName
  }

  /**
    * Permission for the resource.
    */
  @js.native
  @Factory
  trait ResourcePermission extends js.Object {
    var Actions: ActionList
    var Principal: Principal
  }

  @js.native
  sealed trait ResourceStatus extends js.Any
  object ResourceStatus extends js.Object {
    val CREATION_IN_PROGRESS = "CREATION_IN_PROGRESS".asInstanceOf[ResourceStatus]
    val CREATION_SUCCESSFUL  = "CREATION_SUCCESSFUL".asInstanceOf[ResourceStatus]
    val CREATION_FAILED      = "CREATION_FAILED".asInstanceOf[ResourceStatus]
    val UPDATE_IN_PROGRESS   = "UPDATE_IN_PROGRESS".asInstanceOf[ResourceStatus]
    val UPDATE_SUCCESSFUL    = "UPDATE_SUCCESSFUL".asInstanceOf[ResourceStatus]
    val UPDATE_FAILED        = "UPDATE_FAILED".asInstanceOf[ResourceStatus]

    val values = js.Object.freeze(
      js.Array(
        CREATION_IN_PROGRESS,
        CREATION_SUCCESSFUL,
        CREATION_FAILED,
        UPDATE_IN_PROGRESS,
        UPDATE_SUCCESSFUL,
        UPDATE_FAILED
      )
    )
  }

  /**
    * Information about rows for a data set SPICE ingestion.
    */
  @js.native
  @Factory
  trait RowInfo extends js.Object {
    var RowsDropped: js.UndefOr[Double]
    var RowsIngested: js.UndefOr[Double]
  }

  /**
    * The row-level security configuration for the dataset.
    */
  @js.native
  @Factory
  trait RowLevelPermissionDataSet extends js.Object {
    var Arn: Arn
    var PermissionPolicy: RowLevelPermissionPolicy
  }

  @js.native
  sealed trait RowLevelPermissionPolicy extends js.Any
  object RowLevelPermissionPolicy extends js.Object {
    val GRANT_ACCESS = "GRANT_ACCESS".asInstanceOf[RowLevelPermissionPolicy]
    val DENY_ACCESS  = "DENY_ACCESS".asInstanceOf[RowLevelPermissionPolicy]

    val values = js.Object.freeze(js.Array(GRANT_ACCESS, DENY_ACCESS))
  }

  /**
    * S3 parameters.
    */
  @js.native
  @Factory
  trait S3Parameters extends js.Object {
    var ManifestFileLocation: ManifestFileLocation
  }

  /**
    * A physical table type for as S3 data source.
    */
  @js.native
  @Factory
  trait S3Source extends js.Object {
    var DataSourceArn: Arn
    var InputColumns: InputColumnList
    var UploadSettings: js.UndefOr[UploadSettings]
  }

  /**
    * ServiceNow parameters.
    */
  @js.native
  @Factory
  trait ServiceNowParameters extends js.Object {
    var SiteBaseUrl: SiteBaseUrl
  }

  /**
    * Sheet controls option.
    */
  @js.native
  @Factory
  trait SheetControlsOption extends js.Object {
    var VisibilityState: js.UndefOr[DashboardUIState]
  }

  /**
    * Snowflake parameters.
    */
  @js.native
  @Factory
  trait SnowflakeParameters extends js.Object {
    var Database: Database
    var Host: Host
    var Warehouse: Warehouse
  }

  /**
    * Spark parameters.
    */
  @js.native
  @Factory
  trait SparkParameters extends js.Object {
    var Host: Host
    var Port: Port
  }

  /**
    * SQL Server parameters.
    */
  @js.native
  @Factory
  trait SqlServerParameters extends js.Object {
    var Database: Database
    var Host: Host
    var Port: Port
  }

  /**
    * Secure Socket Layer (SSL) properties that apply when QuickSight connects to your underlying data source.
    */
  @js.native
  @Factory
  trait SslProperties extends js.Object {
    var DisableSsl: js.UndefOr[Boolean]
  }

  /**
    * String parameter.
    */
  @js.native
  @Factory
  trait StringParameter extends js.Object {
    var Name: NonEmptyString
    var Values: StringList
  }

  /**
    * The key or keys of the key-value pairs for the resource tag or tags assigned to the resource.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  /**
    * A transform operation that tags a column with additional information.
    */
  @js.native
  @Factory
  trait TagColumnOperation extends js.Object {
    var ColumnName: ColumnName
    var Tags: ColumnTagList
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var Tags: TagList
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  /**
    * A template object. A <i>template</i> is an entity in QuickSight that encapsulates the metadata required to create an analysis and that you can use to create a dashboard. A template adds a layer of abstraction by using placeholders to replace the dataset associated with the analysis. You can use templates to create dashboards by replacing dataset placeholders with datasets that follow the same schema that was used to create the source analysis and template.
    *  You can share templates across AWS accounts by allowing users in other AWS accounts to create a template or a dashboard from an existing template.
    */
  @js.native
  @Factory
  trait Template extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreatedTime: js.UndefOr[Timestamp]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[TemplateName]
    var TemplateId: js.UndefOr[RestrictiveResourceId]
    var Version: js.UndefOr[TemplateVersion]
  }

  /**
    * The template alias.
    */
  @js.native
  @Factory
  trait TemplateAlias extends js.Object {
    var AliasName: js.UndefOr[AliasName]
    var Arn: js.UndefOr[Arn]
    var TemplateVersionNumber: js.UndefOr[VersionNumber]
  }

  /**
    * List of errors that occurred when the template version creation failed.
    */
  @js.native
  @Factory
  trait TemplateError extends js.Object {
    var Message: js.UndefOr[NonEmptyString]
    var Type: js.UndefOr[TemplateErrorType]
  }

  @js.native
  sealed trait TemplateErrorType extends js.Any
  object TemplateErrorType extends js.Object {
    val DATA_SET_NOT_FOUND = "DATA_SET_NOT_FOUND".asInstanceOf[TemplateErrorType]
    val INTERNAL_FAILURE   = "INTERNAL_FAILURE".asInstanceOf[TemplateErrorType]

    val values = js.Object.freeze(js.Array(DATA_SET_NOT_FOUND, INTERNAL_FAILURE))
  }

  /**
    * The source analysis of the template.
    */
  @js.native
  @Factory
  trait TemplateSourceAnalysis extends js.Object {
    var Arn: Arn
    var DataSetReferences: DataSetReferenceList
  }

  /**
    * The source entity of the template.
    */
  @js.native
  @Factory
  trait TemplateSourceEntity extends js.Object {
    var SourceAnalysis: js.UndefOr[TemplateSourceAnalysis]
    var SourceTemplate: js.UndefOr[TemplateSourceTemplate]
  }

  /**
    * The source template of the template.
    */
  @js.native
  @Factory
  trait TemplateSourceTemplate extends js.Object {
    var Arn: Arn
  }

  /**
    * The template summary.
    */
  @js.native
  @Factory
  trait TemplateSummary extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreatedTime: js.UndefOr[Timestamp]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var LatestVersionNumber: js.UndefOr[VersionNumber]
    var Name: js.UndefOr[TemplateName]
    var TemplateId: js.UndefOr[RestrictiveResourceId]
  }

  /**
    * A version of a template.
    */
  @js.native
  @Factory
  trait TemplateVersion extends js.Object {
    var CreatedTime: js.UndefOr[Timestamp]
    var DataSetConfigurations: js.UndefOr[DataSetConfigurationList]
    var Description: js.UndefOr[VersionDescription]
    var Errors: js.UndefOr[TemplateErrorList]
    var SourceEntityArn: js.UndefOr[Arn]
    var Status: js.UndefOr[ResourceStatus]
    var VersionNumber: js.UndefOr[VersionNumber]
  }

  /**
    * The template version.
    */
  @js.native
  @Factory
  trait TemplateVersionSummary extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreatedTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[VersionDescription]
    var Status: js.UndefOr[ResourceStatus]
    var VersionNumber: js.UndefOr[VersionNumber]
  }

  /**
    * Teradata parameters.
    */
  @js.native
  @Factory
  trait TeradataParameters extends js.Object {
    var Database: Database
    var Host: Host
    var Port: Port
  }

  @js.native
  sealed trait TextQualifier extends js.Any
  object TextQualifier extends js.Object {
    val DOUBLE_QUOTE = "DOUBLE_QUOTE".asInstanceOf[TextQualifier]
    val SINGLE_QUOTE = "SINGLE_QUOTE".asInstanceOf[TextQualifier]

    val values = js.Object.freeze(js.Array(DOUBLE_QUOTE, SINGLE_QUOTE))
  }

  /**
    * A data transformation on a logical table. This is a variant type structure. For this structure to be valid, only one of the attributes can be non-null.
    */
  @js.native
  @Factory
  trait TransformOperation extends js.Object {
    var CastColumnTypeOperation: js.UndefOr[CastColumnTypeOperation]
    var CreateColumnsOperation: js.UndefOr[CreateColumnsOperation]
    var FilterOperation: js.UndefOr[FilterOperation]
    var ProjectOperation: js.UndefOr[ProjectOperation]
    var RenameColumnOperation: js.UndefOr[RenameColumnOperation]
    var TagColumnOperation: js.UndefOr[TagColumnOperation]
  }

  /**
    * Twitter parameters.
    */
  @js.native
  @Factory
  trait TwitterParameters extends js.Object {
    var MaxRows: PositiveInteger
    var Query: Query
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var TagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait UpdateDashboardPermissionsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DashboardId: RestrictiveResourceId
    var GrantPermissions: js.UndefOr[UpdateResourcePermissionList]
    var RevokePermissions: js.UndefOr[UpdateResourcePermissionList]
  }

  @js.native
  @Factory
  trait UpdateDashboardPermissionsResponse extends js.Object {
    var DashboardArn: js.UndefOr[Arn]
    var DashboardId: js.UndefOr[RestrictiveResourceId]
    var Permissions: js.UndefOr[ResourcePermissionList]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait UpdateDashboardPublishedVersionRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DashboardId: RestrictiveResourceId
    var VersionNumber: VersionNumber
  }

  @js.native
  @Factory
  trait UpdateDashboardPublishedVersionResponse extends js.Object {
    var DashboardArn: js.UndefOr[Arn]
    var DashboardId: js.UndefOr[RestrictiveResourceId]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait UpdateDashboardRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DashboardId: RestrictiveResourceId
    var Name: DashboardName
    var SourceEntity: DashboardSourceEntity
    var DashboardPublishOptions: js.UndefOr[DashboardPublishOptions]
    var Parameters: js.UndefOr[Parameters]
    var VersionDescription: js.UndefOr[VersionDescription]
  }

  @js.native
  @Factory
  trait UpdateDashboardResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreationStatus: js.UndefOr[ResourceStatus]
    var DashboardId: js.UndefOr[RestrictiveResourceId]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var VersionArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait UpdateDataSetPermissionsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DataSetId: ResourceId
    var GrantPermissions: js.UndefOr[ResourcePermissionList]
    var RevokePermissions: js.UndefOr[ResourcePermissionList]
  }

  @js.native
  @Factory
  trait UpdateDataSetPermissionsResponse extends js.Object {
    var DataSetArn: js.UndefOr[Arn]
    var DataSetId: js.UndefOr[ResourceId]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait UpdateDataSetRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DataSetId: ResourceId
    var ImportMode: DataSetImportMode
    var Name: ResourceName
    var PhysicalTableMap: PhysicalTableMap
    var ColumnGroups: js.UndefOr[ColumnGroupList]
    var LogicalTableMap: js.UndefOr[LogicalTableMap]
    var RowLevelPermissionDataSet: js.UndefOr[RowLevelPermissionDataSet]
  }

  @js.native
  @Factory
  trait UpdateDataSetResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var DataSetId: js.UndefOr[ResourceId]
    var IngestionArn: js.UndefOr[Arn]
    var IngestionId: js.UndefOr[ResourceId]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait UpdateDataSourcePermissionsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DataSourceId: ResourceId
    var GrantPermissions: js.UndefOr[ResourcePermissionList]
    var RevokePermissions: js.UndefOr[ResourcePermissionList]
  }

  @js.native
  @Factory
  trait UpdateDataSourcePermissionsResponse extends js.Object {
    var DataSourceArn: js.UndefOr[Arn]
    var DataSourceId: js.UndefOr[ResourceId]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait UpdateDataSourceRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DataSourceId: ResourceId
    var Name: ResourceName
    var Credentials: js.UndefOr[DataSourceCredentials]
    var DataSourceParameters: js.UndefOr[DataSourceParameters]
    var SslProperties: js.UndefOr[SslProperties]
    var VpcConnectionProperties: js.UndefOr[VpcConnectionProperties]
  }

  @js.native
  @Factory
  trait UpdateDataSourceResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var DataSourceId: js.UndefOr[ResourceId]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var UpdateStatus: js.UndefOr[ResourceStatus]
  }

  @js.native
  @Factory
  trait UpdateGroupRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var GroupName: GroupName
    var Namespace: Namespace
    var Description: js.UndefOr[GroupDescription]
  }

  @js.native
  @Factory
  trait UpdateGroupResponse extends js.Object {
    var Group: js.UndefOr[Group]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait UpdateIAMPolicyAssignmentRequest extends js.Object {
    var AssignmentName: IAMPolicyAssignmentName
    var AwsAccountId: AwsAccountId
    var Namespace: Namespace
    var AssignmentStatus: js.UndefOr[AssignmentStatus]
    var Identities: js.UndefOr[IdentityMap]
    var PolicyArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait UpdateIAMPolicyAssignmentResponse extends js.Object {
    var AssignmentId: js.UndefOr[String]
    var AssignmentName: js.UndefOr[IAMPolicyAssignmentName]
    var AssignmentStatus: js.UndefOr[AssignmentStatus]
    var Identities: js.UndefOr[IdentityMap]
    var PolicyArn: js.UndefOr[Arn]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  @js.native
  @Factory
  trait UpdateTemplateAliasRequest extends js.Object {
    var AliasName: AliasName
    var AwsAccountId: AwsAccountId
    var TemplateId: RestrictiveResourceId
    var TemplateVersionNumber: VersionNumber
  }

  @js.native
  @Factory
  trait UpdateTemplateAliasResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var TemplateAlias: js.UndefOr[TemplateAlias]
  }

  @js.native
  @Factory
  trait UpdateTemplatePermissionsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var TemplateId: RestrictiveResourceId
    var GrantPermissions: js.UndefOr[UpdateResourcePermissionList]
    var RevokePermissions: js.UndefOr[UpdateResourcePermissionList]
  }

  @js.native
  @Factory
  trait UpdateTemplatePermissionsResponse extends js.Object {
    var Permissions: js.UndefOr[ResourcePermissionList]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var TemplateArn: js.UndefOr[Arn]
    var TemplateId: js.UndefOr[RestrictiveResourceId]
  }

  @js.native
  @Factory
  trait UpdateTemplateRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var SourceEntity: TemplateSourceEntity
    var TemplateId: RestrictiveResourceId
    var Name: js.UndefOr[TemplateName]
    var VersionDescription: js.UndefOr[VersionDescription]
  }

  @js.native
  @Factory
  trait UpdateTemplateResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreationStatus: js.UndefOr[ResourceStatus]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var TemplateId: js.UndefOr[RestrictiveResourceId]
    var VersionArn: js.UndefOr[Arn]
  }

  @js.native
  @Factory
  trait UpdateUserRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Email: String
    var Namespace: Namespace
    var Role: UserRole
    var UserName: UserName
  }

  @js.native
  @Factory
  trait UpdateUserResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var User: js.UndefOr[User]
  }

  /**
    * Information about the format for a source file or files.
    */
  @js.native
  @Factory
  trait UploadSettings extends js.Object {
    var ContainsHeader: js.UndefOr[Boolean]
    var Delimiter: js.UndefOr[Delimiter]
    var Format: js.UndefOr[FileFormat]
    var StartFromRow: js.UndefOr[PositiveInteger]
    var TextQualifier: js.UndefOr[TextQualifier]
  }

  /**
    * A registered user of Amazon QuickSight. Currently, an Amazon QuickSight subscription can't contain more than 20 million users.
    */
  @js.native
  @Factory
  trait User extends js.Object {
    var Active: js.UndefOr[Boolean]
    var Arn: js.UndefOr[Arn]
    var Email: js.UndefOr[String]
    var IdentityType: js.UndefOr[IdentityType]
    var PrincipalId: js.UndefOr[String]
    var Role: js.UndefOr[UserRole]
    var UserName: js.UndefOr[UserName]
  }

  @js.native
  sealed trait UserRole extends js.Any
  object UserRole extends js.Object {
    val ADMIN             = "ADMIN".asInstanceOf[UserRole]
    val AUTHOR            = "AUTHOR".asInstanceOf[UserRole]
    val READER            = "READER".asInstanceOf[UserRole]
    val RESTRICTED_AUTHOR = "RESTRICTED_AUTHOR".asInstanceOf[UserRole]
    val RESTRICTED_READER = "RESTRICTED_READER".asInstanceOf[UserRole]

    val values = js.Object.freeze(js.Array(ADMIN, AUTHOR, READER, RESTRICTED_AUTHOR, RESTRICTED_READER))
  }

  /**
    * VPC connection properties.
    */
  @js.native
  @Factory
  trait VpcConnectionProperties extends js.Object {
    var VpcConnectionArn: Arn
  }
}
