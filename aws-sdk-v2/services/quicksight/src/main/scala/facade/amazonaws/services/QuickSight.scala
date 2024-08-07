package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object quicksight {
  type ActionList = js.Array[String]
  type ActiveIAMPolicyAssignmentList = js.Array[ActiveIAMPolicyAssignment]
  type AdditionalDashboardIdList = js.Array[RestrictiveResourceId]
  type AliasName = String
  type AnalysisErrorList = js.Array[AnalysisError]
  type AnalysisName = String
  type AnalysisSearchFilterList = js.Array[AnalysisSearchFilter]
  type AnalysisSummaryList = js.Array[AnalysisSummary]
  type Arn = String
  type ArnList = js.Array[Arn]
  type AwsAccountId = String
  type AwsAndAccountId = String
  type CIDR = String
  type CalculatedColumnList = js.Array[CalculatedColumn]
  type Catalog = String
  type ClusterId = String
  type ColorList = js.Array[HexColor]
  type ColumnDescriptiveText = String
  type ColumnGroupColumnSchemaList = js.Array[ColumnGroupColumnSchema]
  type ColumnGroupList = js.Array[ColumnGroup]
  type ColumnGroupName = String
  type ColumnGroupSchemaList = js.Array[ColumnGroupSchema]
  type ColumnId = String
  type ColumnLevelPermissionRuleList = js.Array[ColumnLevelPermissionRule]
  type ColumnList = js.Array[ColumnName]
  type ColumnName = String
  type ColumnNameList = js.Array[String]
  type ColumnSchemaList = js.Array[ColumnSchema]
  type ColumnTagList = js.Array[ColumnTag]
  type ColumnTagNames = js.Array[ColumnTagName]
  type CopySourceArn = String
  type CustomSqlName = String
  type DashboardErrorList = js.Array[DashboardError]
  type DashboardName = String
  type DashboardSearchFilterList = js.Array[DashboardSearchFilter]
  type DashboardSummaryList = js.Array[DashboardSummary]
  type DashboardVersionSummaryList = js.Array[DashboardVersionSummary]
  type DataSetArnsList = js.Array[Arn]
  type DataSetConfigurationList = js.Array[DataSetConfiguration]
  type DataSetName = String
  type DataSetReferenceList = js.Array[DataSetReference]
  type DataSetSummaryList = js.Array[DataSetSummary]
  type DataSourceList = js.Array[DataSource]
  type DataSourceParametersList = js.Array[DataSourceParameters]
  type Database = String
  type DateTimeParameterList = js.Array[DateTimeParameter]
  type DecimalParameterList = js.Array[DecimalParameter]
  type Delimiter = String
  type Domain = String
  type DoubleList = js.Array[Double]
  type EmbeddingUrl = String
  type EntryPath = String
  type EntryPoint = String
  type Expression = String
  type FieldFolderDescription = String
  type FieldFolderMap = js.Dictionary[FieldFolder]
  type FieldFolderPath = String
  type FolderColumnList = js.Array[String]
  type FolderMemberList = js.Array[MemberIdArnPair]
  type FolderName = String
  type FolderSearchFilterList = js.Array[FolderSearchFilter]
  type FolderSummaryList = js.Array[FolderSummary]
  type GroupDescription = String
  type GroupList = js.Array[Group]
  type GroupMemberList = js.Array[GroupMember]
  type GroupMemberName = String
  type GroupName = String
  type HexColor = String
  type Host = String
  type IAMPolicyAssignmentName = String
  type IAMPolicyAssignmentSummaryList = js.Array[IAMPolicyAssignmentSummary]
  type IdentityMap = js.Dictionary[IdentityNameList]
  type IdentityName = String
  type IdentityNameList = js.Array[IdentityName]
  type IngestionId = String
  type IngestionMaxResults = Int
  type Ingestions = js.Array[Ingestion]
  type InputColumnList = js.Array[InputColumn]
  type InstanceId = String
  type IntegerParameterList = js.Array[IntegerParameter]
  type IpRestrictionRuleDescription = String
  type IpRestrictionRuleMap = js.Dictionary[IpRestrictionRuleDescription]
  type LogicalTableAlias = String
  type LogicalTableId = String
  type LogicalTableMap = js.Dictionary[LogicalTable]
  type LongList = js.Array[Double]
  type MaxResults = Int
  type Namespace = String
  type Namespaces = js.Array[NamespaceInfoV2]
  type NonEmptyString = String
  type NullableBoolean = Boolean
  type OnClause = String
  type OptionalPort = Int
  type OutputColumnList = js.Array[OutputColumn]
  type Password = String
  type Path = js.Array[Arn]
  type PhysicalTableId = String
  type PhysicalTableMap = js.Dictionary[PhysicalTable]
  type Port = Int
  type PositiveInteger = Int
  type Principal = String
  type PrincipalList = js.Array[String]
  type ProjectedColumnList = js.Array[String]
  type Query = String
  type RecoveryWindowInDays = Double
  type RelationalTableCatalog = String
  type RelationalTableName = String
  type RelationalTableSchema = String
  type ResourceId = String
  type ResourceName = String
  type ResourcePermissionList = js.Array[ResourcePermission]
  type RestrictiveResourceId = String
  type RoleName = String
  type RoleSessionName = String
  type RowLevelPermissionTagDelimiter = String
  type RowLevelPermissionTagRuleList = js.Array[RowLevelPermissionTagRule]
  type S3Bucket = String
  type S3Key = String
  type SessionLifetimeInMinutes = Double
  type SessionTagKey = String
  type SessionTagList = js.Array[SessionTag]
  type SessionTagValue = String
  type SheetList = js.Array[Sheet]
  type SiteBaseUrl = String
  type SqlQuery = String
  type StatusCode = Int
  type StringList = js.Array[String]
  type StringParameterList = js.Array[StringParameter]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TemplateAliasList = js.Array[TemplateAlias]
  type TemplateErrorList = js.Array[TemplateError]
  type TemplateName = String
  type TemplateSummaryList = js.Array[TemplateSummary]
  type TemplateVersionSummaryList = js.Array[TemplateVersionSummary]
  type ThemeAliasList = js.Array[ThemeAlias]
  type ThemeErrorList = js.Array[ThemeError]
  type ThemeName = String
  type ThemeSummaryList = js.Array[ThemeSummary]
  type ThemeVersionSummaryList = js.Array[ThemeVersionSummary]
  type Timestamp = js.Date
  type TimestampList = js.Array[Timestamp]
  type TransformOperationList = js.Array[TransformOperation]
  type TypeCastFormat = String
  type UpdateLinkPermissionList = js.Array[ResourcePermission]
  type UpdateResourcePermissionList = js.Array[ResourcePermission]
  type UserList = js.Array[User]
  type UserName = String
  type Username = String
  type VersionDescription = String
  type VersionNumber = Double
  type Warehouse = String
  type WorkGroup = String

  final class QuickSightOps(private val service: QuickSight) extends AnyVal {

    @inline def cancelIngestionFuture(params: CancelIngestionRequest): Future[CancelIngestionResponse] = service.cancelIngestion(params).promise().toFuture
    @inline def createAccountCustomizationFuture(params: CreateAccountCustomizationRequest): Future[CreateAccountCustomizationResponse] = service.createAccountCustomization(params).promise().toFuture
    @inline def createAnalysisFuture(params: CreateAnalysisRequest): Future[CreateAnalysisResponse] = service.createAnalysis(params).promise().toFuture
    @inline def createDashboardFuture(params: CreateDashboardRequest): Future[CreateDashboardResponse] = service.createDashboard(params).promise().toFuture
    @inline def createDataSetFuture(params: CreateDataSetRequest): Future[CreateDataSetResponse] = service.createDataSet(params).promise().toFuture
    @inline def createDataSourceFuture(params: CreateDataSourceRequest): Future[CreateDataSourceResponse] = service.createDataSource(params).promise().toFuture
    @inline def createFolderFuture(params: CreateFolderRequest): Future[CreateFolderResponse] = service.createFolder(params).promise().toFuture
    @inline def createFolderMembershipFuture(params: CreateFolderMembershipRequest): Future[CreateFolderMembershipResponse] = service.createFolderMembership(params).promise().toFuture
    @inline def createGroupFuture(params: CreateGroupRequest): Future[CreateGroupResponse] = service.createGroup(params).promise().toFuture
    @inline def createGroupMembershipFuture(params: CreateGroupMembershipRequest): Future[CreateGroupMembershipResponse] = service.createGroupMembership(params).promise().toFuture
    @inline def createIAMPolicyAssignmentFuture(params: CreateIAMPolicyAssignmentRequest): Future[CreateIAMPolicyAssignmentResponse] = service.createIAMPolicyAssignment(params).promise().toFuture
    @inline def createIngestionFuture(params: CreateIngestionRequest): Future[CreateIngestionResponse] = service.createIngestion(params).promise().toFuture
    @inline def createNamespaceFuture(params: CreateNamespaceRequest): Future[CreateNamespaceResponse] = service.createNamespace(params).promise().toFuture
    @inline def createTemplateAliasFuture(params: CreateTemplateAliasRequest): Future[CreateTemplateAliasResponse] = service.createTemplateAlias(params).promise().toFuture
    @inline def createTemplateFuture(params: CreateTemplateRequest): Future[CreateTemplateResponse] = service.createTemplate(params).promise().toFuture
    @inline def createThemeAliasFuture(params: CreateThemeAliasRequest): Future[CreateThemeAliasResponse] = service.createThemeAlias(params).promise().toFuture
    @inline def createThemeFuture(params: CreateThemeRequest): Future[CreateThemeResponse] = service.createTheme(params).promise().toFuture
    @inline def deleteAccountCustomizationFuture(params: DeleteAccountCustomizationRequest): Future[DeleteAccountCustomizationResponse] = service.deleteAccountCustomization(params).promise().toFuture
    @inline def deleteAnalysisFuture(params: DeleteAnalysisRequest): Future[DeleteAnalysisResponse] = service.deleteAnalysis(params).promise().toFuture
    @inline def deleteDashboardFuture(params: DeleteDashboardRequest): Future[DeleteDashboardResponse] = service.deleteDashboard(params).promise().toFuture
    @inline def deleteDataSetFuture(params: DeleteDataSetRequest): Future[DeleteDataSetResponse] = service.deleteDataSet(params).promise().toFuture
    @inline def deleteDataSourceFuture(params: DeleteDataSourceRequest): Future[DeleteDataSourceResponse] = service.deleteDataSource(params).promise().toFuture
    @inline def deleteFolderFuture(params: DeleteFolderRequest): Future[DeleteFolderResponse] = service.deleteFolder(params).promise().toFuture
    @inline def deleteFolderMembershipFuture(params: DeleteFolderMembershipRequest): Future[DeleteFolderMembershipResponse] = service.deleteFolderMembership(params).promise().toFuture
    @inline def deleteGroupFuture(params: DeleteGroupRequest): Future[DeleteGroupResponse] = service.deleteGroup(params).promise().toFuture
    @inline def deleteGroupMembershipFuture(params: DeleteGroupMembershipRequest): Future[DeleteGroupMembershipResponse] = service.deleteGroupMembership(params).promise().toFuture
    @inline def deleteIAMPolicyAssignmentFuture(params: DeleteIAMPolicyAssignmentRequest): Future[DeleteIAMPolicyAssignmentResponse] = service.deleteIAMPolicyAssignment(params).promise().toFuture
    @inline def deleteNamespaceFuture(params: DeleteNamespaceRequest): Future[DeleteNamespaceResponse] = service.deleteNamespace(params).promise().toFuture
    @inline def deleteTemplateAliasFuture(params: DeleteTemplateAliasRequest): Future[DeleteTemplateAliasResponse] = service.deleteTemplateAlias(params).promise().toFuture
    @inline def deleteTemplateFuture(params: DeleteTemplateRequest): Future[DeleteTemplateResponse] = service.deleteTemplate(params).promise().toFuture
    @inline def deleteThemeAliasFuture(params: DeleteThemeAliasRequest): Future[DeleteThemeAliasResponse] = service.deleteThemeAlias(params).promise().toFuture
    @inline def deleteThemeFuture(params: DeleteThemeRequest): Future[DeleteThemeResponse] = service.deleteTheme(params).promise().toFuture
    @inline def deleteUserByPrincipalIdFuture(params: DeleteUserByPrincipalIdRequest): Future[DeleteUserByPrincipalIdResponse] = service.deleteUserByPrincipalId(params).promise().toFuture
    @inline def deleteUserFuture(params: DeleteUserRequest): Future[DeleteUserResponse] = service.deleteUser(params).promise().toFuture
    @inline def describeAccountCustomizationFuture(params: DescribeAccountCustomizationRequest): Future[DescribeAccountCustomizationResponse] = service.describeAccountCustomization(params).promise().toFuture
    @inline def describeAccountSettingsFuture(params: DescribeAccountSettingsRequest): Future[DescribeAccountSettingsResponse] = service.describeAccountSettings(params).promise().toFuture
    @inline def describeAnalysisFuture(params: DescribeAnalysisRequest): Future[DescribeAnalysisResponse] = service.describeAnalysis(params).promise().toFuture
    @inline def describeAnalysisPermissionsFuture(params: DescribeAnalysisPermissionsRequest): Future[DescribeAnalysisPermissionsResponse] = service.describeAnalysisPermissions(params).promise().toFuture
    @inline def describeDashboardFuture(params: DescribeDashboardRequest): Future[DescribeDashboardResponse] = service.describeDashboard(params).promise().toFuture
    @inline def describeDashboardPermissionsFuture(params: DescribeDashboardPermissionsRequest): Future[DescribeDashboardPermissionsResponse] = service.describeDashboardPermissions(params).promise().toFuture
    @inline def describeDataSetFuture(params: DescribeDataSetRequest): Future[DescribeDataSetResponse] = service.describeDataSet(params).promise().toFuture
    @inline def describeDataSetPermissionsFuture(params: DescribeDataSetPermissionsRequest): Future[DescribeDataSetPermissionsResponse] = service.describeDataSetPermissions(params).promise().toFuture
    @inline def describeDataSourceFuture(params: DescribeDataSourceRequest): Future[DescribeDataSourceResponse] = service.describeDataSource(params).promise().toFuture
    @inline def describeDataSourcePermissionsFuture(params: DescribeDataSourcePermissionsRequest): Future[DescribeDataSourcePermissionsResponse] = service.describeDataSourcePermissions(params).promise().toFuture
    @inline def describeFolderFuture(params: DescribeFolderRequest): Future[DescribeFolderResponse] = service.describeFolder(params).promise().toFuture
    @inline def describeFolderPermissionsFuture(params: DescribeFolderPermissionsRequest): Future[DescribeFolderPermissionsResponse] = service.describeFolderPermissions(params).promise().toFuture
    @inline def describeFolderResolvedPermissionsFuture(params: DescribeFolderResolvedPermissionsRequest): Future[DescribeFolderResolvedPermissionsResponse] = service.describeFolderResolvedPermissions(params).promise().toFuture
    @inline def describeGroupFuture(params: DescribeGroupRequest): Future[DescribeGroupResponse] = service.describeGroup(params).promise().toFuture
    @inline def describeIAMPolicyAssignmentFuture(params: DescribeIAMPolicyAssignmentRequest): Future[DescribeIAMPolicyAssignmentResponse] = service.describeIAMPolicyAssignment(params).promise().toFuture
    @inline def describeIngestionFuture(params: DescribeIngestionRequest): Future[DescribeIngestionResponse] = service.describeIngestion(params).promise().toFuture
    @inline def describeIpRestrictionFuture(params: DescribeIpRestrictionRequest): Future[DescribeIpRestrictionResponse] = service.describeIpRestriction(params).promise().toFuture
    @inline def describeNamespaceFuture(params: DescribeNamespaceRequest): Future[DescribeNamespaceResponse] = service.describeNamespace(params).promise().toFuture
    @inline def describeTemplateAliasFuture(params: DescribeTemplateAliasRequest): Future[DescribeTemplateAliasResponse] = service.describeTemplateAlias(params).promise().toFuture
    @inline def describeTemplateFuture(params: DescribeTemplateRequest): Future[DescribeTemplateResponse] = service.describeTemplate(params).promise().toFuture
    @inline def describeTemplatePermissionsFuture(params: DescribeTemplatePermissionsRequest): Future[DescribeTemplatePermissionsResponse] = service.describeTemplatePermissions(params).promise().toFuture
    @inline def describeThemeAliasFuture(params: DescribeThemeAliasRequest): Future[DescribeThemeAliasResponse] = service.describeThemeAlias(params).promise().toFuture
    @inline def describeThemeFuture(params: DescribeThemeRequest): Future[DescribeThemeResponse] = service.describeTheme(params).promise().toFuture
    @inline def describeThemePermissionsFuture(params: DescribeThemePermissionsRequest): Future[DescribeThemePermissionsResponse] = service.describeThemePermissions(params).promise().toFuture
    @inline def describeUserFuture(params: DescribeUserRequest): Future[DescribeUserResponse] = service.describeUser(params).promise().toFuture
    @inline def generateEmbedUrlForAnonymousUserFuture(params: GenerateEmbedUrlForAnonymousUserRequest): Future[GenerateEmbedUrlForAnonymousUserResponse] = service.generateEmbedUrlForAnonymousUser(params).promise().toFuture
    @inline def generateEmbedUrlForRegisteredUserFuture(params: GenerateEmbedUrlForRegisteredUserRequest): Future[GenerateEmbedUrlForRegisteredUserResponse] = service.generateEmbedUrlForRegisteredUser(params).promise().toFuture
    @inline def getDashboardEmbedUrlFuture(params: GetDashboardEmbedUrlRequest): Future[GetDashboardEmbedUrlResponse] = service.getDashboardEmbedUrl(params).promise().toFuture
    @inline def getSessionEmbedUrlFuture(params: GetSessionEmbedUrlRequest): Future[GetSessionEmbedUrlResponse] = service.getSessionEmbedUrl(params).promise().toFuture
    @inline def listAnalysesFuture(params: ListAnalysesRequest): Future[ListAnalysesResponse] = service.listAnalyses(params).promise().toFuture
    @inline def listDashboardVersionsFuture(params: ListDashboardVersionsRequest): Future[ListDashboardVersionsResponse] = service.listDashboardVersions(params).promise().toFuture
    @inline def listDashboardsFuture(params: ListDashboardsRequest): Future[ListDashboardsResponse] = service.listDashboards(params).promise().toFuture
    @inline def listDataSetsFuture(params: ListDataSetsRequest): Future[ListDataSetsResponse] = service.listDataSets(params).promise().toFuture
    @inline def listDataSourcesFuture(params: ListDataSourcesRequest): Future[ListDataSourcesResponse] = service.listDataSources(params).promise().toFuture
    @inline def listFolderMembersFuture(params: ListFolderMembersRequest): Future[ListFolderMembersResponse] = service.listFolderMembers(params).promise().toFuture
    @inline def listFoldersFuture(params: ListFoldersRequest): Future[ListFoldersResponse] = service.listFolders(params).promise().toFuture
    @inline def listGroupMembershipsFuture(params: ListGroupMembershipsRequest): Future[ListGroupMembershipsResponse] = service.listGroupMemberships(params).promise().toFuture
    @inline def listGroupsFuture(params: ListGroupsRequest): Future[ListGroupsResponse] = service.listGroups(params).promise().toFuture
    @inline def listIAMPolicyAssignmentsForUserFuture(params: ListIAMPolicyAssignmentsForUserRequest): Future[ListIAMPolicyAssignmentsForUserResponse] = service.listIAMPolicyAssignmentsForUser(params).promise().toFuture
    @inline def listIAMPolicyAssignmentsFuture(params: ListIAMPolicyAssignmentsRequest): Future[ListIAMPolicyAssignmentsResponse] = service.listIAMPolicyAssignments(params).promise().toFuture
    @inline def listIngestionsFuture(params: ListIngestionsRequest): Future[ListIngestionsResponse] = service.listIngestions(params).promise().toFuture
    @inline def listNamespacesFuture(params: ListNamespacesRequest): Future[ListNamespacesResponse] = service.listNamespaces(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listTemplateAliasesFuture(params: ListTemplateAliasesRequest): Future[ListTemplateAliasesResponse] = service.listTemplateAliases(params).promise().toFuture
    @inline def listTemplateVersionsFuture(params: ListTemplateVersionsRequest): Future[ListTemplateVersionsResponse] = service.listTemplateVersions(params).promise().toFuture
    @inline def listTemplatesFuture(params: ListTemplatesRequest): Future[ListTemplatesResponse] = service.listTemplates(params).promise().toFuture
    @inline def listThemeAliasesFuture(params: ListThemeAliasesRequest): Future[ListThemeAliasesResponse] = service.listThemeAliases(params).promise().toFuture
    @inline def listThemeVersionsFuture(params: ListThemeVersionsRequest): Future[ListThemeVersionsResponse] = service.listThemeVersions(params).promise().toFuture
    @inline def listThemesFuture(params: ListThemesRequest): Future[ListThemesResponse] = service.listThemes(params).promise().toFuture
    @inline def listUserGroupsFuture(params: ListUserGroupsRequest): Future[ListUserGroupsResponse] = service.listUserGroups(params).promise().toFuture
    @inline def listUsersFuture(params: ListUsersRequest): Future[ListUsersResponse] = service.listUsers(params).promise().toFuture
    @inline def registerUserFuture(params: RegisterUserRequest): Future[RegisterUserResponse] = service.registerUser(params).promise().toFuture
    @inline def restoreAnalysisFuture(params: RestoreAnalysisRequest): Future[RestoreAnalysisResponse] = service.restoreAnalysis(params).promise().toFuture
    @inline def searchAnalysesFuture(params: SearchAnalysesRequest): Future[SearchAnalysesResponse] = service.searchAnalyses(params).promise().toFuture
    @inline def searchDashboardsFuture(params: SearchDashboardsRequest): Future[SearchDashboardsResponse] = service.searchDashboards(params).promise().toFuture
    @inline def searchFoldersFuture(params: SearchFoldersRequest): Future[SearchFoldersResponse] = service.searchFolders(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateAccountCustomizationFuture(params: UpdateAccountCustomizationRequest): Future[UpdateAccountCustomizationResponse] = service.updateAccountCustomization(params).promise().toFuture
    @inline def updateAccountSettingsFuture(params: UpdateAccountSettingsRequest): Future[UpdateAccountSettingsResponse] = service.updateAccountSettings(params).promise().toFuture
    @inline def updateAnalysisFuture(params: UpdateAnalysisRequest): Future[UpdateAnalysisResponse] = service.updateAnalysis(params).promise().toFuture
    @inline def updateAnalysisPermissionsFuture(params: UpdateAnalysisPermissionsRequest): Future[UpdateAnalysisPermissionsResponse] = service.updateAnalysisPermissions(params).promise().toFuture
    @inline def updateDashboardFuture(params: UpdateDashboardRequest): Future[UpdateDashboardResponse] = service.updateDashboard(params).promise().toFuture
    @inline def updateDashboardPermissionsFuture(params: UpdateDashboardPermissionsRequest): Future[UpdateDashboardPermissionsResponse] = service.updateDashboardPermissions(params).promise().toFuture
    @inline def updateDashboardPublishedVersionFuture(params: UpdateDashboardPublishedVersionRequest): Future[UpdateDashboardPublishedVersionResponse] = service.updateDashboardPublishedVersion(params).promise().toFuture
    @inline def updateDataSetFuture(params: UpdateDataSetRequest): Future[UpdateDataSetResponse] = service.updateDataSet(params).promise().toFuture
    @inline def updateDataSetPermissionsFuture(params: UpdateDataSetPermissionsRequest): Future[UpdateDataSetPermissionsResponse] = service.updateDataSetPermissions(params).promise().toFuture
    @inline def updateDataSourceFuture(params: UpdateDataSourceRequest): Future[UpdateDataSourceResponse] = service.updateDataSource(params).promise().toFuture
    @inline def updateDataSourcePermissionsFuture(params: UpdateDataSourcePermissionsRequest): Future[UpdateDataSourcePermissionsResponse] = service.updateDataSourcePermissions(params).promise().toFuture
    @inline def updateFolderFuture(params: UpdateFolderRequest): Future[UpdateFolderResponse] = service.updateFolder(params).promise().toFuture
    @inline def updateFolderPermissionsFuture(params: UpdateFolderPermissionsRequest): Future[UpdateFolderPermissionsResponse] = service.updateFolderPermissions(params).promise().toFuture
    @inline def updateGroupFuture(params: UpdateGroupRequest): Future[UpdateGroupResponse] = service.updateGroup(params).promise().toFuture
    @inline def updateIAMPolicyAssignmentFuture(params: UpdateIAMPolicyAssignmentRequest): Future[UpdateIAMPolicyAssignmentResponse] = service.updateIAMPolicyAssignment(params).promise().toFuture
    @inline def updateIpRestrictionFuture(params: UpdateIpRestrictionRequest): Future[UpdateIpRestrictionResponse] = service.updateIpRestriction(params).promise().toFuture
    @inline def updateTemplateAliasFuture(params: UpdateTemplateAliasRequest): Future[UpdateTemplateAliasResponse] = service.updateTemplateAlias(params).promise().toFuture
    @inline def updateTemplateFuture(params: UpdateTemplateRequest): Future[UpdateTemplateResponse] = service.updateTemplate(params).promise().toFuture
    @inline def updateTemplatePermissionsFuture(params: UpdateTemplatePermissionsRequest): Future[UpdateTemplatePermissionsResponse] = service.updateTemplatePermissions(params).promise().toFuture
    @inline def updateThemeAliasFuture(params: UpdateThemeAliasRequest): Future[UpdateThemeAliasResponse] = service.updateThemeAlias(params).promise().toFuture
    @inline def updateThemeFuture(params: UpdateThemeRequest): Future[UpdateThemeResponse] = service.updateTheme(params).promise().toFuture
    @inline def updateThemePermissionsFuture(params: UpdateThemePermissionsRequest): Future[UpdateThemePermissionsResponse] = service.updateThemePermissions(params).promise().toFuture
    @inline def updateUserFuture(params: UpdateUserRequest): Future[UpdateUserResponse] = service.updateUser(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/quicksight", JSImport.Namespace, "AWS.QuickSight")
  class QuickSight() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelIngestion(params: CancelIngestionRequest): Request[CancelIngestionResponse] = js.native
    def createAccountCustomization(params: CreateAccountCustomizationRequest): Request[CreateAccountCustomizationResponse] = js.native
    def createAnalysis(params: CreateAnalysisRequest): Request[CreateAnalysisResponse] = js.native
    def createDashboard(params: CreateDashboardRequest): Request[CreateDashboardResponse] = js.native
    def createDataSet(params: CreateDataSetRequest): Request[CreateDataSetResponse] = js.native
    def createDataSource(params: CreateDataSourceRequest): Request[CreateDataSourceResponse] = js.native
    def createFolder(params: CreateFolderRequest): Request[CreateFolderResponse] = js.native
    def createFolderMembership(params: CreateFolderMembershipRequest): Request[CreateFolderMembershipResponse] = js.native
    def createGroup(params: CreateGroupRequest): Request[CreateGroupResponse] = js.native
    def createGroupMembership(params: CreateGroupMembershipRequest): Request[CreateGroupMembershipResponse] = js.native
    def createIAMPolicyAssignment(params: CreateIAMPolicyAssignmentRequest): Request[CreateIAMPolicyAssignmentResponse] = js.native
    def createIngestion(params: CreateIngestionRequest): Request[CreateIngestionResponse] = js.native
    def createNamespace(params: CreateNamespaceRequest): Request[CreateNamespaceResponse] = js.native
    def createTemplate(params: CreateTemplateRequest): Request[CreateTemplateResponse] = js.native
    def createTemplateAlias(params: CreateTemplateAliasRequest): Request[CreateTemplateAliasResponse] = js.native
    def createTheme(params: CreateThemeRequest): Request[CreateThemeResponse] = js.native
    def createThemeAlias(params: CreateThemeAliasRequest): Request[CreateThemeAliasResponse] = js.native
    def deleteAccountCustomization(params: DeleteAccountCustomizationRequest): Request[DeleteAccountCustomizationResponse] = js.native
    def deleteAnalysis(params: DeleteAnalysisRequest): Request[DeleteAnalysisResponse] = js.native
    def deleteDashboard(params: DeleteDashboardRequest): Request[DeleteDashboardResponse] = js.native
    def deleteDataSet(params: DeleteDataSetRequest): Request[DeleteDataSetResponse] = js.native
    def deleteDataSource(params: DeleteDataSourceRequest): Request[DeleteDataSourceResponse] = js.native
    def deleteFolder(params: DeleteFolderRequest): Request[DeleteFolderResponse] = js.native
    def deleteFolderMembership(params: DeleteFolderMembershipRequest): Request[DeleteFolderMembershipResponse] = js.native
    def deleteGroup(params: DeleteGroupRequest): Request[DeleteGroupResponse] = js.native
    def deleteGroupMembership(params: DeleteGroupMembershipRequest): Request[DeleteGroupMembershipResponse] = js.native
    def deleteIAMPolicyAssignment(params: DeleteIAMPolicyAssignmentRequest): Request[DeleteIAMPolicyAssignmentResponse] = js.native
    def deleteNamespace(params: DeleteNamespaceRequest): Request[DeleteNamespaceResponse] = js.native
    def deleteTemplate(params: DeleteTemplateRequest): Request[DeleteTemplateResponse] = js.native
    def deleteTemplateAlias(params: DeleteTemplateAliasRequest): Request[DeleteTemplateAliasResponse] = js.native
    def deleteTheme(params: DeleteThemeRequest): Request[DeleteThemeResponse] = js.native
    def deleteThemeAlias(params: DeleteThemeAliasRequest): Request[DeleteThemeAliasResponse] = js.native
    def deleteUser(params: DeleteUserRequest): Request[DeleteUserResponse] = js.native
    def deleteUserByPrincipalId(params: DeleteUserByPrincipalIdRequest): Request[DeleteUserByPrincipalIdResponse] = js.native
    def describeAccountCustomization(params: DescribeAccountCustomizationRequest): Request[DescribeAccountCustomizationResponse] = js.native
    def describeAccountSettings(params: DescribeAccountSettingsRequest): Request[DescribeAccountSettingsResponse] = js.native
    def describeAnalysis(params: DescribeAnalysisRequest): Request[DescribeAnalysisResponse] = js.native
    def describeAnalysisPermissions(params: DescribeAnalysisPermissionsRequest): Request[DescribeAnalysisPermissionsResponse] = js.native
    def describeDashboard(params: DescribeDashboardRequest): Request[DescribeDashboardResponse] = js.native
    def describeDashboardPermissions(params: DescribeDashboardPermissionsRequest): Request[DescribeDashboardPermissionsResponse] = js.native
    def describeDataSet(params: DescribeDataSetRequest): Request[DescribeDataSetResponse] = js.native
    def describeDataSetPermissions(params: DescribeDataSetPermissionsRequest): Request[DescribeDataSetPermissionsResponse] = js.native
    def describeDataSource(params: DescribeDataSourceRequest): Request[DescribeDataSourceResponse] = js.native
    def describeDataSourcePermissions(params: DescribeDataSourcePermissionsRequest): Request[DescribeDataSourcePermissionsResponse] = js.native
    def describeFolder(params: DescribeFolderRequest): Request[DescribeFolderResponse] = js.native
    def describeFolderPermissions(params: DescribeFolderPermissionsRequest): Request[DescribeFolderPermissionsResponse] = js.native
    def describeFolderResolvedPermissions(params: DescribeFolderResolvedPermissionsRequest): Request[DescribeFolderResolvedPermissionsResponse] = js.native
    def describeGroup(params: DescribeGroupRequest): Request[DescribeGroupResponse] = js.native
    def describeIAMPolicyAssignment(params: DescribeIAMPolicyAssignmentRequest): Request[DescribeIAMPolicyAssignmentResponse] = js.native
    def describeIngestion(params: DescribeIngestionRequest): Request[DescribeIngestionResponse] = js.native
    def describeIpRestriction(params: DescribeIpRestrictionRequest): Request[DescribeIpRestrictionResponse] = js.native
    def describeNamespace(params: DescribeNamespaceRequest): Request[DescribeNamespaceResponse] = js.native
    def describeTemplate(params: DescribeTemplateRequest): Request[DescribeTemplateResponse] = js.native
    def describeTemplateAlias(params: DescribeTemplateAliasRequest): Request[DescribeTemplateAliasResponse] = js.native
    def describeTemplatePermissions(params: DescribeTemplatePermissionsRequest): Request[DescribeTemplatePermissionsResponse] = js.native
    def describeTheme(params: DescribeThemeRequest): Request[DescribeThemeResponse] = js.native
    def describeThemeAlias(params: DescribeThemeAliasRequest): Request[DescribeThemeAliasResponse] = js.native
    def describeThemePermissions(params: DescribeThemePermissionsRequest): Request[DescribeThemePermissionsResponse] = js.native
    def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse] = js.native
    def generateEmbedUrlForAnonymousUser(params: GenerateEmbedUrlForAnonymousUserRequest): Request[GenerateEmbedUrlForAnonymousUserResponse] = js.native
    def generateEmbedUrlForRegisteredUser(params: GenerateEmbedUrlForRegisteredUserRequest): Request[GenerateEmbedUrlForRegisteredUserResponse] = js.native
    def getDashboardEmbedUrl(params: GetDashboardEmbedUrlRequest): Request[GetDashboardEmbedUrlResponse] = js.native
    def getSessionEmbedUrl(params: GetSessionEmbedUrlRequest): Request[GetSessionEmbedUrlResponse] = js.native
    def listAnalyses(params: ListAnalysesRequest): Request[ListAnalysesResponse] = js.native
    def listDashboardVersions(params: ListDashboardVersionsRequest): Request[ListDashboardVersionsResponse] = js.native
    def listDashboards(params: ListDashboardsRequest): Request[ListDashboardsResponse] = js.native
    def listDataSets(params: ListDataSetsRequest): Request[ListDataSetsResponse] = js.native
    def listDataSources(params: ListDataSourcesRequest): Request[ListDataSourcesResponse] = js.native
    def listFolderMembers(params: ListFolderMembersRequest): Request[ListFolderMembersResponse] = js.native
    def listFolders(params: ListFoldersRequest): Request[ListFoldersResponse] = js.native
    def listGroupMemberships(params: ListGroupMembershipsRequest): Request[ListGroupMembershipsResponse] = js.native
    def listGroups(params: ListGroupsRequest): Request[ListGroupsResponse] = js.native
    def listIAMPolicyAssignments(params: ListIAMPolicyAssignmentsRequest): Request[ListIAMPolicyAssignmentsResponse] = js.native
    def listIAMPolicyAssignmentsForUser(params: ListIAMPolicyAssignmentsForUserRequest): Request[ListIAMPolicyAssignmentsForUserResponse] = js.native
    def listIngestions(params: ListIngestionsRequest): Request[ListIngestionsResponse] = js.native
    def listNamespaces(params: ListNamespacesRequest): Request[ListNamespacesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listTemplateAliases(params: ListTemplateAliasesRequest): Request[ListTemplateAliasesResponse] = js.native
    def listTemplateVersions(params: ListTemplateVersionsRequest): Request[ListTemplateVersionsResponse] = js.native
    def listTemplates(params: ListTemplatesRequest): Request[ListTemplatesResponse] = js.native
    def listThemeAliases(params: ListThemeAliasesRequest): Request[ListThemeAliasesResponse] = js.native
    def listThemeVersions(params: ListThemeVersionsRequest): Request[ListThemeVersionsResponse] = js.native
    def listThemes(params: ListThemesRequest): Request[ListThemesResponse] = js.native
    def listUserGroups(params: ListUserGroupsRequest): Request[ListUserGroupsResponse] = js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse] = js.native
    def registerUser(params: RegisterUserRequest): Request[RegisterUserResponse] = js.native
    def restoreAnalysis(params: RestoreAnalysisRequest): Request[RestoreAnalysisResponse] = js.native
    def searchAnalyses(params: SearchAnalysesRequest): Request[SearchAnalysesResponse] = js.native
    def searchDashboards(params: SearchDashboardsRequest): Request[SearchDashboardsResponse] = js.native
    def searchFolders(params: SearchFoldersRequest): Request[SearchFoldersResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateAccountCustomization(params: UpdateAccountCustomizationRequest): Request[UpdateAccountCustomizationResponse] = js.native
    def updateAccountSettings(params: UpdateAccountSettingsRequest): Request[UpdateAccountSettingsResponse] = js.native
    def updateAnalysis(params: UpdateAnalysisRequest): Request[UpdateAnalysisResponse] = js.native
    def updateAnalysisPermissions(params: UpdateAnalysisPermissionsRequest): Request[UpdateAnalysisPermissionsResponse] = js.native
    def updateDashboard(params: UpdateDashboardRequest): Request[UpdateDashboardResponse] = js.native
    def updateDashboardPermissions(params: UpdateDashboardPermissionsRequest): Request[UpdateDashboardPermissionsResponse] = js.native
    def updateDashboardPublishedVersion(params: UpdateDashboardPublishedVersionRequest): Request[UpdateDashboardPublishedVersionResponse] = js.native
    def updateDataSet(params: UpdateDataSetRequest): Request[UpdateDataSetResponse] = js.native
    def updateDataSetPermissions(params: UpdateDataSetPermissionsRequest): Request[UpdateDataSetPermissionsResponse] = js.native
    def updateDataSource(params: UpdateDataSourceRequest): Request[UpdateDataSourceResponse] = js.native
    def updateDataSourcePermissions(params: UpdateDataSourcePermissionsRequest): Request[UpdateDataSourcePermissionsResponse] = js.native
    def updateFolder(params: UpdateFolderRequest): Request[UpdateFolderResponse] = js.native
    def updateFolderPermissions(params: UpdateFolderPermissionsRequest): Request[UpdateFolderPermissionsResponse] = js.native
    def updateGroup(params: UpdateGroupRequest): Request[UpdateGroupResponse] = js.native
    def updateIAMPolicyAssignment(params: UpdateIAMPolicyAssignmentRequest): Request[UpdateIAMPolicyAssignmentResponse] = js.native
    def updateIpRestriction(params: UpdateIpRestrictionRequest): Request[UpdateIpRestrictionResponse] = js.native
    def updateTemplate(params: UpdateTemplateRequest): Request[UpdateTemplateResponse] = js.native
    def updateTemplateAlias(params: UpdateTemplateAliasRequest): Request[UpdateTemplateAliasResponse] = js.native
    def updateTemplatePermissions(params: UpdateTemplatePermissionsRequest): Request[UpdateTemplatePermissionsResponse] = js.native
    def updateTheme(params: UpdateThemeRequest): Request[UpdateThemeResponse] = js.native
    def updateThemeAlias(params: UpdateThemeAliasRequest): Request[UpdateThemeAliasResponse] = js.native
    def updateThemePermissions(params: UpdateThemePermissionsRequest): Request[UpdateThemePermissionsResponse] = js.native
    def updateUser(params: UpdateUserRequest): Request[UpdateUserResponse] = js.native
  }
  object QuickSight {
    @inline implicit def toOps(service: QuickSight): QuickSightOps = {
      new QuickSightOps(service)
    }
  }

  /** The Amazon QuickSight customizations associated with your Amazon Web Services account or a QuickSight namespace in a specific Amazon Web Services Region.
    */
  @js.native
  trait AccountCustomization extends js.Object {
    var DefaultEmailCustomizationTemplate: js.UndefOr[Arn]
    var DefaultTheme: js.UndefOr[Arn]
  }

  object AccountCustomization {
    @inline
    def apply(
        DefaultEmailCustomizationTemplate: js.UndefOr[Arn] = js.undefined,
        DefaultTheme: js.UndefOr[Arn] = js.undefined
    ): AccountCustomization = {
      val __obj = js.Dynamic.literal()
      DefaultEmailCustomizationTemplate.foreach(__v => __obj.updateDynamic("DefaultEmailCustomizationTemplate")(__v.asInstanceOf[js.Any]))
      DefaultTheme.foreach(__v => __obj.updateDynamic("DefaultTheme")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountCustomization]
    }
  }

  /** The Amazon QuickSight settings associated with your Amazon Web Services account.
    */
  @js.native
  trait AccountSettings extends js.Object {
    var AccountName: js.UndefOr[String]
    var DefaultNamespace: js.UndefOr[Namespace]
    var Edition: js.UndefOr[Edition]
    var NotificationEmail: js.UndefOr[String]
  }

  object AccountSettings {
    @inline
    def apply(
        AccountName: js.UndefOr[String] = js.undefined,
        DefaultNamespace: js.UndefOr[Namespace] = js.undefined,
        Edition: js.UndefOr[Edition] = js.undefined,
        NotificationEmail: js.UndefOr[String] = js.undefined
    ): AccountSettings = {
      val __obj = js.Dynamic.literal()
      AccountName.foreach(__v => __obj.updateDynamic("AccountName")(__v.asInstanceOf[js.Any]))
      DefaultNamespace.foreach(__v => __obj.updateDynamic("DefaultNamespace")(__v.asInstanceOf[js.Any]))
      Edition.foreach(__v => __obj.updateDynamic("Edition")(__v.asInstanceOf[js.Any]))
      NotificationEmail.foreach(__v => __obj.updateDynamic("NotificationEmail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountSettings]
    }
  }

  /** The active Identity and Access Management (IAM) policy assignment.
    */
  @js.native
  trait ActiveIAMPolicyAssignment extends js.Object {
    var AssignmentName: js.UndefOr[IAMPolicyAssignmentName]
    var PolicyArn: js.UndefOr[Arn]
  }

  object ActiveIAMPolicyAssignment {
    @inline
    def apply(
        AssignmentName: js.UndefOr[IAMPolicyAssignmentName] = js.undefined,
        PolicyArn: js.UndefOr[Arn] = js.undefined
    ): ActiveIAMPolicyAssignment = {
      val __obj = js.Dynamic.literal()
      AssignmentName.foreach(__v => __obj.updateDynamic("AssignmentName")(__v.asInstanceOf[js.Any]))
      PolicyArn.foreach(__v => __obj.updateDynamic("PolicyArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActiveIAMPolicyAssignment]
    }
  }

  /** Ad hoc (one-time) filtering option.
    */
  @js.native
  trait AdHocFilteringOption extends js.Object {
    var AvailabilityStatus: js.UndefOr[DashboardBehavior]
  }

  object AdHocFilteringOption {
    @inline
    def apply(
        AvailabilityStatus: js.UndefOr[DashboardBehavior] = js.undefined
    ): AdHocFilteringOption = {
      val __obj = js.Dynamic.literal()
      AvailabilityStatus.foreach(__v => __obj.updateDynamic("AvailabilityStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdHocFilteringOption]
    }
  }

  /** The parameters for OpenSearch.
    */
  @js.native
  trait AmazonElasticsearchParameters extends js.Object {
    var Domain: Domain
  }

  object AmazonElasticsearchParameters {
    @inline
    def apply(
        Domain: Domain
    ): AmazonElasticsearchParameters = {
      val __obj = js.Dynamic.literal(
        "Domain" -> Domain.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AmazonElasticsearchParameters]
    }
  }

  /** The parameters for OpenSearch.
    */
  @js.native
  trait AmazonOpenSearchParameters extends js.Object {
    var Domain: Domain
  }

  object AmazonOpenSearchParameters {
    @inline
    def apply(
        Domain: Domain
    ): AmazonOpenSearchParameters = {
      val __obj = js.Dynamic.literal(
        "Domain" -> Domain.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AmazonOpenSearchParameters]
    }
  }

  /** Metadata structure for an analysis in Amazon QuickSight
    */
  @js.native
  trait Analysis extends js.Object {
    var AnalysisId: js.UndefOr[RestrictiveResourceId]
    var Arn: js.UndefOr[Arn]
    var CreatedTime: js.UndefOr[Timestamp]
    var DataSetArns: js.UndefOr[DataSetArnsList]
    var Errors: js.UndefOr[AnalysisErrorList]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[AnalysisName]
    var Sheets: js.UndefOr[SheetList]
    var Status: js.UndefOr[ResourceStatus]
    var ThemeArn: js.UndefOr[Arn]
  }

  object Analysis {
    @inline
    def apply(
        AnalysisId: js.UndefOr[RestrictiveResourceId] = js.undefined,
        Arn: js.UndefOr[Arn] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        DataSetArns: js.UndefOr[DataSetArnsList] = js.undefined,
        Errors: js.UndefOr[AnalysisErrorList] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[AnalysisName] = js.undefined,
        Sheets: js.UndefOr[SheetList] = js.undefined,
        Status: js.UndefOr[ResourceStatus] = js.undefined,
        ThemeArn: js.UndefOr[Arn] = js.undefined
    ): Analysis = {
      val __obj = js.Dynamic.literal()
      AnalysisId.foreach(__v => __obj.updateDynamic("AnalysisId")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      DataSetArns.foreach(__v => __obj.updateDynamic("DataSetArns")(__v.asInstanceOf[js.Any]))
      Errors.foreach(__v => __obj.updateDynamic("Errors")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Sheets.foreach(__v => __obj.updateDynamic("Sheets")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      ThemeArn.foreach(__v => __obj.updateDynamic("ThemeArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Analysis]
    }
  }

  /** Analysis error.
    */
  @js.native
  trait AnalysisError extends js.Object {
    var Message: js.UndefOr[NonEmptyString]
    var Type: js.UndefOr[AnalysisErrorType]
  }

  object AnalysisError {
    @inline
    def apply(
        Message: js.UndefOr[NonEmptyString] = js.undefined,
        Type: js.UndefOr[AnalysisErrorType] = js.undefined
    ): AnalysisError = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnalysisError]
    }
  }

  /** A filter that you apply when searching for one or more analyses.
    */
  @js.native
  trait AnalysisSearchFilter extends js.Object {
    var Name: js.UndefOr[AnalysisFilterAttribute]
    var Operator: js.UndefOr[FilterOperator]
    var Value: js.UndefOr[String]
  }

  object AnalysisSearchFilter {
    @inline
    def apply(
        Name: js.UndefOr[AnalysisFilterAttribute] = js.undefined,
        Operator: js.UndefOr[FilterOperator] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): AnalysisSearchFilter = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Operator.foreach(__v => __obj.updateDynamic("Operator")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnalysisSearchFilter]
    }
  }

  /** The source entity of an analysis.
    */
  @js.native
  trait AnalysisSourceEntity extends js.Object {
    var SourceTemplate: js.UndefOr[AnalysisSourceTemplate]
  }

  object AnalysisSourceEntity {
    @inline
    def apply(
        SourceTemplate: js.UndefOr[AnalysisSourceTemplate] = js.undefined
    ): AnalysisSourceEntity = {
      val __obj = js.Dynamic.literal()
      SourceTemplate.foreach(__v => __obj.updateDynamic("SourceTemplate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnalysisSourceEntity]
    }
  }

  /** The source template of an analysis.
    */
  @js.native
  trait AnalysisSourceTemplate extends js.Object {
    var Arn: Arn
    var DataSetReferences: DataSetReferenceList
  }

  object AnalysisSourceTemplate {
    @inline
    def apply(
        Arn: Arn,
        DataSetReferences: DataSetReferenceList
    ): AnalysisSourceTemplate = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "DataSetReferences" -> DataSetReferences.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AnalysisSourceTemplate]
    }
  }

  /** The summary metadata that describes an analysis.
    */
  @js.native
  trait AnalysisSummary extends js.Object {
    var AnalysisId: js.UndefOr[RestrictiveResourceId]
    var Arn: js.UndefOr[Arn]
    var CreatedTime: js.UndefOr[Timestamp]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[AnalysisName]
    var Status: js.UndefOr[ResourceStatus]
  }

  object AnalysisSummary {
    @inline
    def apply(
        AnalysisId: js.UndefOr[RestrictiveResourceId] = js.undefined,
        Arn: js.UndefOr[Arn] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[AnalysisName] = js.undefined,
        Status: js.UndefOr[ResourceStatus] = js.undefined
    ): AnalysisSummary = {
      val __obj = js.Dynamic.literal()
      AnalysisId.foreach(__v => __obj.updateDynamic("AnalysisId")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnalysisSummary]
    }
  }

  /** Information about the dashboard that you want to embed.
    */
  @js.native
  trait AnonymousUserDashboardEmbeddingConfiguration extends js.Object {
    var InitialDashboardId: RestrictiveResourceId
  }

  object AnonymousUserDashboardEmbeddingConfiguration {
    @inline
    def apply(
        InitialDashboardId: RestrictiveResourceId
    ): AnonymousUserDashboardEmbeddingConfiguration = {
      val __obj = js.Dynamic.literal(
        "InitialDashboardId" -> InitialDashboardId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AnonymousUserDashboardEmbeddingConfiguration]
    }
  }

  /** The type of experience you want to embed. For anonymous users, you can embed Amazon QuickSight dashboards.
    */
  @js.native
  trait AnonymousUserEmbeddingExperienceConfiguration extends js.Object {
    var Dashboard: js.UndefOr[AnonymousUserDashboardEmbeddingConfiguration]
  }

  object AnonymousUserEmbeddingExperienceConfiguration {
    @inline
    def apply(
        Dashboard: js.UndefOr[AnonymousUserDashboardEmbeddingConfiguration] = js.undefined
    ): AnonymousUserEmbeddingExperienceConfiguration = {
      val __obj = js.Dynamic.literal()
      Dashboard.foreach(__v => __obj.updateDynamic("Dashboard")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnonymousUserEmbeddingExperienceConfiguration]
    }
  }

  /** Parameters for Amazon Athena.
    */
  @js.native
  trait AthenaParameters extends js.Object {
    var WorkGroup: js.UndefOr[WorkGroup]
  }

  object AthenaParameters {
    @inline
    def apply(
        WorkGroup: js.UndefOr[WorkGroup] = js.undefined
    ): AthenaParameters = {
      val __obj = js.Dynamic.literal()
      WorkGroup.foreach(__v => __obj.updateDynamic("WorkGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AthenaParameters]
    }
  }

  /** Parameters for Amazon Aurora.
    */
  @js.native
  trait AuroraParameters extends js.Object {
    var Database: Database
    var Host: Host
    var Port: Port
  }

  object AuroraParameters {
    @inline
    def apply(
        Database: Database,
        Host: Host,
        Port: Port
    ): AuroraParameters = {
      val __obj = js.Dynamic.literal(
        "Database" -> Database.asInstanceOf[js.Any],
        "Host" -> Host.asInstanceOf[js.Any],
        "Port" -> Port.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AuroraParameters]
    }
  }

  /** Parameters for Amazon Aurora PostgreSQL-Compatible Edition.
    */
  @js.native
  trait AuroraPostgreSqlParameters extends js.Object {
    var Database: Database
    var Host: Host
    var Port: Port
  }

  object AuroraPostgreSqlParameters {
    @inline
    def apply(
        Database: Database,
        Host: Host,
        Port: Port
    ): AuroraPostgreSqlParameters = {
      val __obj = js.Dynamic.literal(
        "Database" -> Database.asInstanceOf[js.Any],
        "Host" -> Host.asInstanceOf[js.Any],
        "Port" -> Port.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AuroraPostgreSqlParameters]
    }
  }

  /** The parameters for IoT Analytics.
    */
  @js.native
  trait AwsIotAnalyticsParameters extends js.Object {
    var DataSetName: DataSetName
  }

  object AwsIotAnalyticsParameters {
    @inline
    def apply(
        DataSetName: DataSetName
    ): AwsIotAnalyticsParameters = {
      val __obj = js.Dynamic.literal(
        "DataSetName" -> DataSetName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AwsIotAnalyticsParameters]
    }
  }

  /** The display options for tile borders for visuals.
    */
  @js.native
  trait BorderStyle extends js.Object {
    var Show: js.UndefOr[Boolean]
  }

  object BorderStyle {
    @inline
    def apply(
        Show: js.UndefOr[Boolean] = js.undefined
    ): BorderStyle = {
      val __obj = js.Dynamic.literal()
      Show.foreach(__v => __obj.updateDynamic("Show")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BorderStyle]
    }
  }

  /** A calculated column for a dataset.
    */
  @js.native
  trait CalculatedColumn extends js.Object {
    var ColumnId: ColumnId
    var ColumnName: ColumnName
    var Expression: Expression
  }

  object CalculatedColumn {
    @inline
    def apply(
        ColumnId: ColumnId,
        ColumnName: ColumnName,
        Expression: Expression
    ): CalculatedColumn = {
      val __obj = js.Dynamic.literal(
        "ColumnId" -> ColumnId.asInstanceOf[js.Any],
        "ColumnName" -> ColumnName.asInstanceOf[js.Any],
        "Expression" -> Expression.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CalculatedColumn]
    }
  }

  @js.native
  trait CancelIngestionRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DataSetId: String
    var IngestionId: IngestionId
  }

  object CancelIngestionRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DataSetId: String,
        IngestionId: IngestionId
    ): CancelIngestionRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "DataSetId" -> DataSetId.asInstanceOf[js.Any],
        "IngestionId" -> IngestionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelIngestionRequest]
    }
  }

  @js.native
  trait CancelIngestionResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var IngestionId: js.UndefOr[IngestionId]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object CancelIngestionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        IngestionId: js.UndefOr[IngestionId] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): CancelIngestionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      IngestionId.foreach(__v => __obj.updateDynamic("IngestionId")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CancelIngestionResponse]
    }
  }

  /** A transform operation that casts a column to a different type.
    */
  @js.native
  trait CastColumnTypeOperation extends js.Object {
    var ColumnName: ColumnName
    var NewColumnType: ColumnDataType
    var Format: js.UndefOr[TypeCastFormat]
  }

  object CastColumnTypeOperation {
    @inline
    def apply(
        ColumnName: ColumnName,
        NewColumnType: ColumnDataType,
        Format: js.UndefOr[TypeCastFormat] = js.undefined
    ): CastColumnTypeOperation = {
      val __obj = js.Dynamic.literal(
        "ColumnName" -> ColumnName.asInstanceOf[js.Any],
        "NewColumnType" -> NewColumnType.asInstanceOf[js.Any]
      )

      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CastColumnTypeOperation]
    }
  }

  /** Metadata that contains a description for a column.
    */
  @js.native
  trait ColumnDescription extends js.Object {
    var Text: js.UndefOr[ColumnDescriptiveText]
  }

  object ColumnDescription {
    @inline
    def apply(
        Text: js.UndefOr[ColumnDescriptiveText] = js.undefined
    ): ColumnDescription = {
      val __obj = js.Dynamic.literal()
      Text.foreach(__v => __obj.updateDynamic("Text")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ColumnDescription]
    }
  }

  /** Groupings of columns that work together in certain Amazon QuickSight features. This is a variant type structure. For this structure to be valid, only one of the attributes can be non-null.
    */
  @js.native
  trait ColumnGroup extends js.Object {
    var GeoSpatialColumnGroup: js.UndefOr[GeoSpatialColumnGroup]
  }

  object ColumnGroup {
    @inline
    def apply(
        GeoSpatialColumnGroup: js.UndefOr[GeoSpatialColumnGroup] = js.undefined
    ): ColumnGroup = {
      val __obj = js.Dynamic.literal()
      GeoSpatialColumnGroup.foreach(__v => __obj.updateDynamic("GeoSpatialColumnGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ColumnGroup]
    }
  }

  /** A structure describing the name, data type, and geographic role of the columns.
    */
  @js.native
  trait ColumnGroupColumnSchema extends js.Object {
    var Name: js.UndefOr[String]
  }

  object ColumnGroupColumnSchema {
    @inline
    def apply(
        Name: js.UndefOr[String] = js.undefined
    ): ColumnGroupColumnSchema = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ColumnGroupColumnSchema]
    }
  }

  /** The column group schema.
    */
  @js.native
  trait ColumnGroupSchema extends js.Object {
    var ColumnGroupColumnSchemaList: js.UndefOr[ColumnGroupColumnSchemaList]
    var Name: js.UndefOr[String]
  }

  object ColumnGroupSchema {
    @inline
    def apply(
        ColumnGroupColumnSchemaList: js.UndefOr[ColumnGroupColumnSchemaList] = js.undefined,
        Name: js.UndefOr[String] = js.undefined
    ): ColumnGroupSchema = {
      val __obj = js.Dynamic.literal()
      ColumnGroupColumnSchemaList.foreach(__v => __obj.updateDynamic("ColumnGroupColumnSchemaList")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ColumnGroupSchema]
    }
  }

  /** A rule defined to grant access on one or more restricted columns. Each dataset can have multiple rules. To create a restricted column, you add it to one or more rules. Each rule must contain at least one column and at least one user or group. To be able to see a restricted column, a user or group needs to be added to a rule for that column.
    */
  @js.native
  trait ColumnLevelPermissionRule extends js.Object {
    var ColumnNames: js.UndefOr[ColumnNameList]
    var Principals: js.UndefOr[PrincipalList]
  }

  object ColumnLevelPermissionRule {
    @inline
    def apply(
        ColumnNames: js.UndefOr[ColumnNameList] = js.undefined,
        Principals: js.UndefOr[PrincipalList] = js.undefined
    ): ColumnLevelPermissionRule = {
      val __obj = js.Dynamic.literal()
      ColumnNames.foreach(__v => __obj.updateDynamic("ColumnNames")(__v.asInstanceOf[js.Any]))
      Principals.foreach(__v => __obj.updateDynamic("Principals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ColumnLevelPermissionRule]
    }
  }

  /** The column schema.
    */
  @js.native
  trait ColumnSchema extends js.Object {
    var DataType: js.UndefOr[String]
    var GeographicRole: js.UndefOr[String]
    var Name: js.UndefOr[String]
  }

  object ColumnSchema {
    @inline
    def apply(
        DataType: js.UndefOr[String] = js.undefined,
        GeographicRole: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined
    ): ColumnSchema = {
      val __obj = js.Dynamic.literal()
      DataType.foreach(__v => __obj.updateDynamic("DataType")(__v.asInstanceOf[js.Any]))
      GeographicRole.foreach(__v => __obj.updateDynamic("GeographicRole")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ColumnSchema]
    }
  }

  /** A tag for a column in a <code> [[https://docs.aws.amazon.com/quicksight/latest/APIReference/API_TagColumnOperation.html|TagColumnOperation]] </code> structure. This is a variant type structure. For this structure to be valid, only one of the attributes can be non-null.
    */
  @js.native
  trait ColumnTag extends js.Object {
    var ColumnDescription: js.UndefOr[ColumnDescription]
    var ColumnGeographicRole: js.UndefOr[GeoSpatialDataRole]
  }

  object ColumnTag {
    @inline
    def apply(
        ColumnDescription: js.UndefOr[ColumnDescription] = js.undefined,
        ColumnGeographicRole: js.UndefOr[GeoSpatialDataRole] = js.undefined
    ): ColumnTag = {
      val __obj = js.Dynamic.literal()
      ColumnDescription.foreach(__v => __obj.updateDynamic("ColumnDescription")(__v.asInstanceOf[js.Any]))
      ColumnGeographicRole.foreach(__v => __obj.updateDynamic("ColumnGeographicRole")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ColumnTag]
    }
  }

  @js.native
  trait CreateAccountCustomizationRequest extends js.Object {
    var AccountCustomization: AccountCustomization
    var AwsAccountId: AwsAccountId
    var Namespace: js.UndefOr[Namespace]
    var Tags: js.UndefOr[TagList]
  }

  object CreateAccountCustomizationRequest {
    @inline
    def apply(
        AccountCustomization: AccountCustomization,
        AwsAccountId: AwsAccountId,
        Namespace: js.UndefOr[Namespace] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateAccountCustomizationRequest = {
      val __obj = js.Dynamic.literal(
        "AccountCustomization" -> AccountCustomization.asInstanceOf[js.Any],
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any]
      )

      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAccountCustomizationRequest]
    }
  }

  @js.native
  trait CreateAccountCustomizationResponse extends js.Object {
    var AccountCustomization: js.UndefOr[AccountCustomization]
    var Arn: js.UndefOr[Arn]
    var AwsAccountId: js.UndefOr[AwsAccountId]
    var Namespace: js.UndefOr[Namespace]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object CreateAccountCustomizationResponse {
    @inline
    def apply(
        AccountCustomization: js.UndefOr[AccountCustomization] = js.undefined,
        Arn: js.UndefOr[Arn] = js.undefined,
        AwsAccountId: js.UndefOr[AwsAccountId] = js.undefined,
        Namespace: js.UndefOr[Namespace] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): CreateAccountCustomizationResponse = {
      val __obj = js.Dynamic.literal()
      AccountCustomization.foreach(__v => __obj.updateDynamic("AccountCustomization")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      AwsAccountId.foreach(__v => __obj.updateDynamic("AwsAccountId")(__v.asInstanceOf[js.Any]))
      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAccountCustomizationResponse]
    }
  }

  @js.native
  trait CreateAnalysisRequest extends js.Object {
    var AnalysisId: RestrictiveResourceId
    var AwsAccountId: AwsAccountId
    var Name: AnalysisName
    var SourceEntity: AnalysisSourceEntity
    var Parameters: js.UndefOr[Parameters]
    var Permissions: js.UndefOr[ResourcePermissionList]
    var Tags: js.UndefOr[TagList]
    var ThemeArn: js.UndefOr[Arn]
  }

  object CreateAnalysisRequest {
    @inline
    def apply(
        AnalysisId: RestrictiveResourceId,
        AwsAccountId: AwsAccountId,
        Name: AnalysisName,
        SourceEntity: AnalysisSourceEntity,
        Parameters: js.UndefOr[Parameters] = js.undefined,
        Permissions: js.UndefOr[ResourcePermissionList] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        ThemeArn: js.UndefOr[Arn] = js.undefined
    ): CreateAnalysisRequest = {
      val __obj = js.Dynamic.literal(
        "AnalysisId" -> AnalysisId.asInstanceOf[js.Any],
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "SourceEntity" -> SourceEntity.asInstanceOf[js.Any]
      )

      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      ThemeArn.foreach(__v => __obj.updateDynamic("ThemeArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAnalysisRequest]
    }
  }

  @js.native
  trait CreateAnalysisResponse extends js.Object {
    var AnalysisId: js.UndefOr[RestrictiveResourceId]
    var Arn: js.UndefOr[Arn]
    var CreationStatus: js.UndefOr[ResourceStatus]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object CreateAnalysisResponse {
    @inline
    def apply(
        AnalysisId: js.UndefOr[RestrictiveResourceId] = js.undefined,
        Arn: js.UndefOr[Arn] = js.undefined,
        CreationStatus: js.UndefOr[ResourceStatus] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): CreateAnalysisResponse = {
      val __obj = js.Dynamic.literal()
      AnalysisId.foreach(__v => __obj.updateDynamic("AnalysisId")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationStatus.foreach(__v => __obj.updateDynamic("CreationStatus")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAnalysisResponse]
    }
  }

  /** A transform operation that creates calculated columns. Columns created in one such operation form a lexical closure.
    */
  @js.native
  trait CreateColumnsOperation extends js.Object {
    var Columns: CalculatedColumnList
  }

  object CreateColumnsOperation {
    @inline
    def apply(
        Columns: CalculatedColumnList
    ): CreateColumnsOperation = {
      val __obj = js.Dynamic.literal(
        "Columns" -> Columns.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateColumnsOperation]
    }
  }

  @js.native
  trait CreateDashboardRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DashboardId: RestrictiveResourceId
    var Name: DashboardName
    var SourceEntity: DashboardSourceEntity
    var DashboardPublishOptions: js.UndefOr[DashboardPublishOptions]
    var Parameters: js.UndefOr[Parameters]
    var Permissions: js.UndefOr[ResourcePermissionList]
    var Tags: js.UndefOr[TagList]
    var ThemeArn: js.UndefOr[Arn]
    var VersionDescription: js.UndefOr[VersionDescription]
  }

  object CreateDashboardRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DashboardId: RestrictiveResourceId,
        Name: DashboardName,
        SourceEntity: DashboardSourceEntity,
        DashboardPublishOptions: js.UndefOr[DashboardPublishOptions] = js.undefined,
        Parameters: js.UndefOr[Parameters] = js.undefined,
        Permissions: js.UndefOr[ResourcePermissionList] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        ThemeArn: js.UndefOr[Arn] = js.undefined,
        VersionDescription: js.UndefOr[VersionDescription] = js.undefined
    ): CreateDashboardRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "DashboardId" -> DashboardId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "SourceEntity" -> SourceEntity.asInstanceOf[js.Any]
      )

      DashboardPublishOptions.foreach(__v => __obj.updateDynamic("DashboardPublishOptions")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      ThemeArn.foreach(__v => __obj.updateDynamic("ThemeArn")(__v.asInstanceOf[js.Any]))
      VersionDescription.foreach(__v => __obj.updateDynamic("VersionDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDashboardRequest]
    }
  }

  @js.native
  trait CreateDashboardResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreationStatus: js.UndefOr[ResourceStatus]
    var DashboardId: js.UndefOr[RestrictiveResourceId]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var VersionArn: js.UndefOr[Arn]
  }

  object CreateDashboardResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreationStatus: js.UndefOr[ResourceStatus] = js.undefined,
        DashboardId: js.UndefOr[RestrictiveResourceId] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        VersionArn: js.UndefOr[Arn] = js.undefined
    ): CreateDashboardResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationStatus.foreach(__v => __obj.updateDynamic("CreationStatus")(__v.asInstanceOf[js.Any]))
      DashboardId.foreach(__v => __obj.updateDynamic("DashboardId")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      VersionArn.foreach(__v => __obj.updateDynamic("VersionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDashboardResponse]
    }
  }

  @js.native
  trait CreateDataSetRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DataSetId: ResourceId
    var ImportMode: DataSetImportMode
    var Name: ResourceName
    var PhysicalTableMap: PhysicalTableMap
    var ColumnGroups: js.UndefOr[ColumnGroupList]
    var ColumnLevelPermissionRules: js.UndefOr[ColumnLevelPermissionRuleList]
    var DataSetUsageConfiguration: js.UndefOr[DataSetUsageConfiguration]
    var FieldFolders: js.UndefOr[FieldFolderMap]
    var LogicalTableMap: js.UndefOr[LogicalTableMap]
    var Permissions: js.UndefOr[ResourcePermissionList]
    var RowLevelPermissionDataSet: js.UndefOr[RowLevelPermissionDataSet]
    var RowLevelPermissionTagConfiguration: js.UndefOr[RowLevelPermissionTagConfiguration]
    var Tags: js.UndefOr[TagList]
  }

  object CreateDataSetRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DataSetId: ResourceId,
        ImportMode: DataSetImportMode,
        Name: ResourceName,
        PhysicalTableMap: PhysicalTableMap,
        ColumnGroups: js.UndefOr[ColumnGroupList] = js.undefined,
        ColumnLevelPermissionRules: js.UndefOr[ColumnLevelPermissionRuleList] = js.undefined,
        DataSetUsageConfiguration: js.UndefOr[DataSetUsageConfiguration] = js.undefined,
        FieldFolders: js.UndefOr[FieldFolderMap] = js.undefined,
        LogicalTableMap: js.UndefOr[LogicalTableMap] = js.undefined,
        Permissions: js.UndefOr[ResourcePermissionList] = js.undefined,
        RowLevelPermissionDataSet: js.UndefOr[RowLevelPermissionDataSet] = js.undefined,
        RowLevelPermissionTagConfiguration: js.UndefOr[RowLevelPermissionTagConfiguration] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateDataSetRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "DataSetId" -> DataSetId.asInstanceOf[js.Any],
        "ImportMode" -> ImportMode.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "PhysicalTableMap" -> PhysicalTableMap.asInstanceOf[js.Any]
      )

      ColumnGroups.foreach(__v => __obj.updateDynamic("ColumnGroups")(__v.asInstanceOf[js.Any]))
      ColumnLevelPermissionRules.foreach(__v => __obj.updateDynamic("ColumnLevelPermissionRules")(__v.asInstanceOf[js.Any]))
      DataSetUsageConfiguration.foreach(__v => __obj.updateDynamic("DataSetUsageConfiguration")(__v.asInstanceOf[js.Any]))
      FieldFolders.foreach(__v => __obj.updateDynamic("FieldFolders")(__v.asInstanceOf[js.Any]))
      LogicalTableMap.foreach(__v => __obj.updateDynamic("LogicalTableMap")(__v.asInstanceOf[js.Any]))
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      RowLevelPermissionDataSet.foreach(__v => __obj.updateDynamic("RowLevelPermissionDataSet")(__v.asInstanceOf[js.Any]))
      RowLevelPermissionTagConfiguration.foreach(__v => __obj.updateDynamic("RowLevelPermissionTagConfiguration")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDataSetRequest]
    }
  }

  @js.native
  trait CreateDataSetResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var DataSetId: js.UndefOr[ResourceId]
    var IngestionArn: js.UndefOr[Arn]
    var IngestionId: js.UndefOr[ResourceId]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object CreateDataSetResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        DataSetId: js.UndefOr[ResourceId] = js.undefined,
        IngestionArn: js.UndefOr[Arn] = js.undefined,
        IngestionId: js.UndefOr[ResourceId] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): CreateDataSetResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      DataSetId.foreach(__v => __obj.updateDynamic("DataSetId")(__v.asInstanceOf[js.Any]))
      IngestionArn.foreach(__v => __obj.updateDynamic("IngestionArn")(__v.asInstanceOf[js.Any]))
      IngestionId.foreach(__v => __obj.updateDynamic("IngestionId")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDataSetResponse]
    }
  }

  @js.native
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

  object CreateDataSourceRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DataSourceId: ResourceId,
        Name: ResourceName,
        Type: DataSourceType,
        Credentials: js.UndefOr[DataSourceCredentials] = js.undefined,
        DataSourceParameters: js.UndefOr[DataSourceParameters] = js.undefined,
        Permissions: js.UndefOr[ResourcePermissionList] = js.undefined,
        SslProperties: js.UndefOr[SslProperties] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        VpcConnectionProperties: js.UndefOr[VpcConnectionProperties] = js.undefined
    ): CreateDataSourceRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "DataSourceId" -> DataSourceId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      Credentials.foreach(__v => __obj.updateDynamic("Credentials")(__v.asInstanceOf[js.Any]))
      DataSourceParameters.foreach(__v => __obj.updateDynamic("DataSourceParameters")(__v.asInstanceOf[js.Any]))
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      SslProperties.foreach(__v => __obj.updateDynamic("SslProperties")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VpcConnectionProperties.foreach(__v => __obj.updateDynamic("VpcConnectionProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDataSourceRequest]
    }
  }

  @js.native
  trait CreateDataSourceResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreationStatus: js.UndefOr[ResourceStatus]
    var DataSourceId: js.UndefOr[ResourceId]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object CreateDataSourceResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreationStatus: js.UndefOr[ResourceStatus] = js.undefined,
        DataSourceId: js.UndefOr[ResourceId] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): CreateDataSourceResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationStatus.foreach(__v => __obj.updateDynamic("CreationStatus")(__v.asInstanceOf[js.Any]))
      DataSourceId.foreach(__v => __obj.updateDynamic("DataSourceId")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDataSourceResponse]
    }
  }

  @js.native
  trait CreateFolderMembershipRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var FolderId: RestrictiveResourceId
    var MemberId: RestrictiveResourceId
    var MemberType: MemberType
  }

  object CreateFolderMembershipRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        FolderId: RestrictiveResourceId,
        MemberId: RestrictiveResourceId,
        MemberType: MemberType
    ): CreateFolderMembershipRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "FolderId" -> FolderId.asInstanceOf[js.Any],
        "MemberId" -> MemberId.asInstanceOf[js.Any],
        "MemberType" -> MemberType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateFolderMembershipRequest]
    }
  }

  @js.native
  trait CreateFolderMembershipResponse extends js.Object {
    var FolderMember: js.UndefOr[FolderMember]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object CreateFolderMembershipResponse {
    @inline
    def apply(
        FolderMember: js.UndefOr[FolderMember] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): CreateFolderMembershipResponse = {
      val __obj = js.Dynamic.literal()
      FolderMember.foreach(__v => __obj.updateDynamic("FolderMember")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFolderMembershipResponse]
    }
  }

  @js.native
  trait CreateFolderRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var FolderId: RestrictiveResourceId
    var FolderType: js.UndefOr[FolderType]
    var Name: js.UndefOr[FolderName]
    var ParentFolderArn: js.UndefOr[Arn]
    var Permissions: js.UndefOr[ResourcePermissionList]
    var Tags: js.UndefOr[TagList]
  }

  object CreateFolderRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        FolderId: RestrictiveResourceId,
        FolderType: js.UndefOr[FolderType] = js.undefined,
        Name: js.UndefOr[FolderName] = js.undefined,
        ParentFolderArn: js.UndefOr[Arn] = js.undefined,
        Permissions: js.UndefOr[ResourcePermissionList] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateFolderRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "FolderId" -> FolderId.asInstanceOf[js.Any]
      )

      FolderType.foreach(__v => __obj.updateDynamic("FolderType")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ParentFolderArn.foreach(__v => __obj.updateDynamic("ParentFolderArn")(__v.asInstanceOf[js.Any]))
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFolderRequest]
    }
  }

  @js.native
  trait CreateFolderResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var FolderId: js.UndefOr[RestrictiveResourceId]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object CreateFolderResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        FolderId: js.UndefOr[RestrictiveResourceId] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): CreateFolderResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      FolderId.foreach(__v => __obj.updateDynamic("FolderId")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFolderResponse]
    }
  }

  @js.native
  trait CreateGroupMembershipRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var GroupName: GroupName
    var MemberName: GroupMemberName
    var Namespace: Namespace
  }

  object CreateGroupMembershipRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        GroupName: GroupName,
        MemberName: GroupMemberName,
        Namespace: Namespace
    ): CreateGroupMembershipRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "GroupName" -> GroupName.asInstanceOf[js.Any],
        "MemberName" -> MemberName.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateGroupMembershipRequest]
    }
  }

  @js.native
  trait CreateGroupMembershipResponse extends js.Object {
    var GroupMember: js.UndefOr[GroupMember]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object CreateGroupMembershipResponse {
    @inline
    def apply(
        GroupMember: js.UndefOr[GroupMember] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): CreateGroupMembershipResponse = {
      val __obj = js.Dynamic.literal()
      GroupMember.foreach(__v => __obj.updateDynamic("GroupMember")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGroupMembershipResponse]
    }
  }

  /** The request object for this operation.
    */
  @js.native
  trait CreateGroupRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var GroupName: GroupName
    var Namespace: Namespace
    var Description: js.UndefOr[GroupDescription]
  }

  object CreateGroupRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        GroupName: GroupName,
        Namespace: Namespace,
        Description: js.UndefOr[GroupDescription] = js.undefined
    ): CreateGroupRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "GroupName" -> GroupName.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGroupRequest]
    }
  }

  /** The response object for this operation.
    */
  @js.native
  trait CreateGroupResponse extends js.Object {
    var Group: js.UndefOr[Group]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object CreateGroupResponse {
    @inline
    def apply(
        Group: js.UndefOr[Group] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): CreateGroupResponse = {
      val __obj = js.Dynamic.literal()
      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGroupResponse]
    }
  }

  @js.native
  trait CreateIAMPolicyAssignmentRequest extends js.Object {
    var AssignmentName: IAMPolicyAssignmentName
    var AssignmentStatus: AssignmentStatus
    var AwsAccountId: AwsAccountId
    var Namespace: Namespace
    var Identities: js.UndefOr[IdentityMap]
    var PolicyArn: js.UndefOr[Arn]
  }

  object CreateIAMPolicyAssignmentRequest {
    @inline
    def apply(
        AssignmentName: IAMPolicyAssignmentName,
        AssignmentStatus: AssignmentStatus,
        AwsAccountId: AwsAccountId,
        Namespace: Namespace,
        Identities: js.UndefOr[IdentityMap] = js.undefined,
        PolicyArn: js.UndefOr[Arn] = js.undefined
    ): CreateIAMPolicyAssignmentRequest = {
      val __obj = js.Dynamic.literal(
        "AssignmentName" -> AssignmentName.asInstanceOf[js.Any],
        "AssignmentStatus" -> AssignmentStatus.asInstanceOf[js.Any],
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any]
      )

      Identities.foreach(__v => __obj.updateDynamic("Identities")(__v.asInstanceOf[js.Any]))
      PolicyArn.foreach(__v => __obj.updateDynamic("PolicyArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateIAMPolicyAssignmentRequest]
    }
  }

  @js.native
  trait CreateIAMPolicyAssignmentResponse extends js.Object {
    var AssignmentId: js.UndefOr[String]
    var AssignmentName: js.UndefOr[IAMPolicyAssignmentName]
    var AssignmentStatus: js.UndefOr[AssignmentStatus]
    var Identities: js.UndefOr[IdentityMap]
    var PolicyArn: js.UndefOr[Arn]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object CreateIAMPolicyAssignmentResponse {
    @inline
    def apply(
        AssignmentId: js.UndefOr[String] = js.undefined,
        AssignmentName: js.UndefOr[IAMPolicyAssignmentName] = js.undefined,
        AssignmentStatus: js.UndefOr[AssignmentStatus] = js.undefined,
        Identities: js.UndefOr[IdentityMap] = js.undefined,
        PolicyArn: js.UndefOr[Arn] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): CreateIAMPolicyAssignmentResponse = {
      val __obj = js.Dynamic.literal()
      AssignmentId.foreach(__v => __obj.updateDynamic("AssignmentId")(__v.asInstanceOf[js.Any]))
      AssignmentName.foreach(__v => __obj.updateDynamic("AssignmentName")(__v.asInstanceOf[js.Any]))
      AssignmentStatus.foreach(__v => __obj.updateDynamic("AssignmentStatus")(__v.asInstanceOf[js.Any]))
      Identities.foreach(__v => __obj.updateDynamic("Identities")(__v.asInstanceOf[js.Any]))
      PolicyArn.foreach(__v => __obj.updateDynamic("PolicyArn")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateIAMPolicyAssignmentResponse]
    }
  }

  @js.native
  trait CreateIngestionRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DataSetId: String
    var IngestionId: IngestionId
    var IngestionType: js.UndefOr[IngestionType]
  }

  object CreateIngestionRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DataSetId: String,
        IngestionId: IngestionId,
        IngestionType: js.UndefOr[IngestionType] = js.undefined
    ): CreateIngestionRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "DataSetId" -> DataSetId.asInstanceOf[js.Any],
        "IngestionId" -> IngestionId.asInstanceOf[js.Any]
      )

      IngestionType.foreach(__v => __obj.updateDynamic("IngestionType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateIngestionRequest]
    }
  }

  @js.native
  trait CreateIngestionResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var IngestionId: js.UndefOr[IngestionId]
    var IngestionStatus: js.UndefOr[IngestionStatus]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object CreateIngestionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        IngestionId: js.UndefOr[IngestionId] = js.undefined,
        IngestionStatus: js.UndefOr[IngestionStatus] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): CreateIngestionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      IngestionId.foreach(__v => __obj.updateDynamic("IngestionId")(__v.asInstanceOf[js.Any]))
      IngestionStatus.foreach(__v => __obj.updateDynamic("IngestionStatus")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateIngestionResponse]
    }
  }

  @js.native
  trait CreateNamespaceRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var IdentityStore: IdentityStore
    var Namespace: Namespace
    var Tags: js.UndefOr[TagList]
  }

  object CreateNamespaceRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        IdentityStore: IdentityStore,
        Namespace: Namespace,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateNamespaceRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "IdentityStore" -> IdentityStore.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNamespaceRequest]
    }
  }

  @js.native
  trait CreateNamespaceResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CapacityRegion: js.UndefOr[String]
    var CreationStatus: js.UndefOr[NamespaceStatus]
    var IdentityStore: js.UndefOr[IdentityStore]
    var Name: js.UndefOr[Namespace]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object CreateNamespaceResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CapacityRegion: js.UndefOr[String] = js.undefined,
        CreationStatus: js.UndefOr[NamespaceStatus] = js.undefined,
        IdentityStore: js.UndefOr[IdentityStore] = js.undefined,
        Name: js.UndefOr[Namespace] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): CreateNamespaceResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CapacityRegion.foreach(__v => __obj.updateDynamic("CapacityRegion")(__v.asInstanceOf[js.Any]))
      CreationStatus.foreach(__v => __obj.updateDynamic("CreationStatus")(__v.asInstanceOf[js.Any]))
      IdentityStore.foreach(__v => __obj.updateDynamic("IdentityStore")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNamespaceResponse]
    }
  }

  @js.native
  trait CreateTemplateAliasRequest extends js.Object {
    var AliasName: AliasName
    var AwsAccountId: AwsAccountId
    var TemplateId: RestrictiveResourceId
    var TemplateVersionNumber: VersionNumber
  }

  object CreateTemplateAliasRequest {
    @inline
    def apply(
        AliasName: AliasName,
        AwsAccountId: AwsAccountId,
        TemplateId: RestrictiveResourceId,
        TemplateVersionNumber: VersionNumber
    ): CreateTemplateAliasRequest = {
      val __obj = js.Dynamic.literal(
        "AliasName" -> AliasName.asInstanceOf[js.Any],
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "TemplateId" -> TemplateId.asInstanceOf[js.Any],
        "TemplateVersionNumber" -> TemplateVersionNumber.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateTemplateAliasRequest]
    }
  }

  @js.native
  trait CreateTemplateAliasResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var TemplateAlias: js.UndefOr[TemplateAlias]
  }

  object CreateTemplateAliasResponse {
    @inline
    def apply(
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        TemplateAlias: js.UndefOr[TemplateAlias] = js.undefined
    ): CreateTemplateAliasResponse = {
      val __obj = js.Dynamic.literal()
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TemplateAlias.foreach(__v => __obj.updateDynamic("TemplateAlias")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTemplateAliasResponse]
    }
  }

  @js.native
  trait CreateTemplateRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var SourceEntity: TemplateSourceEntity
    var TemplateId: RestrictiveResourceId
    var Name: js.UndefOr[TemplateName]
    var Permissions: js.UndefOr[ResourcePermissionList]
    var Tags: js.UndefOr[TagList]
    var VersionDescription: js.UndefOr[VersionDescription]
  }

  object CreateTemplateRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        SourceEntity: TemplateSourceEntity,
        TemplateId: RestrictiveResourceId,
        Name: js.UndefOr[TemplateName] = js.undefined,
        Permissions: js.UndefOr[ResourcePermissionList] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        VersionDescription: js.UndefOr[VersionDescription] = js.undefined
    ): CreateTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "SourceEntity" -> SourceEntity.asInstanceOf[js.Any],
        "TemplateId" -> TemplateId.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VersionDescription.foreach(__v => __obj.updateDynamic("VersionDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTemplateRequest]
    }
  }

  @js.native
  trait CreateTemplateResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreationStatus: js.UndefOr[ResourceStatus]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var TemplateId: js.UndefOr[RestrictiveResourceId]
    var VersionArn: js.UndefOr[Arn]
  }

  object CreateTemplateResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreationStatus: js.UndefOr[ResourceStatus] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        TemplateId: js.UndefOr[RestrictiveResourceId] = js.undefined,
        VersionArn: js.UndefOr[Arn] = js.undefined
    ): CreateTemplateResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationStatus.foreach(__v => __obj.updateDynamic("CreationStatus")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TemplateId.foreach(__v => __obj.updateDynamic("TemplateId")(__v.asInstanceOf[js.Any]))
      VersionArn.foreach(__v => __obj.updateDynamic("VersionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTemplateResponse]
    }
  }

  @js.native
  trait CreateThemeAliasRequest extends js.Object {
    var AliasName: AliasName
    var AwsAccountId: AwsAccountId
    var ThemeId: RestrictiveResourceId
    var ThemeVersionNumber: VersionNumber
  }

  object CreateThemeAliasRequest {
    @inline
    def apply(
        AliasName: AliasName,
        AwsAccountId: AwsAccountId,
        ThemeId: RestrictiveResourceId,
        ThemeVersionNumber: VersionNumber
    ): CreateThemeAliasRequest = {
      val __obj = js.Dynamic.literal(
        "AliasName" -> AliasName.asInstanceOf[js.Any],
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "ThemeId" -> ThemeId.asInstanceOf[js.Any],
        "ThemeVersionNumber" -> ThemeVersionNumber.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateThemeAliasRequest]
    }
  }

  @js.native
  trait CreateThemeAliasResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var ThemeAlias: js.UndefOr[ThemeAlias]
  }

  object CreateThemeAliasResponse {
    @inline
    def apply(
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        ThemeAlias: js.UndefOr[ThemeAlias] = js.undefined
    ): CreateThemeAliasResponse = {
      val __obj = js.Dynamic.literal()
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      ThemeAlias.foreach(__v => __obj.updateDynamic("ThemeAlias")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateThemeAliasResponse]
    }
  }

  @js.native
  trait CreateThemeRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var BaseThemeId: RestrictiveResourceId
    var Configuration: ThemeConfiguration
    var Name: ThemeName
    var ThemeId: RestrictiveResourceId
    var Permissions: js.UndefOr[ResourcePermissionList]
    var Tags: js.UndefOr[TagList]
    var VersionDescription: js.UndefOr[VersionDescription]
  }

  object CreateThemeRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        BaseThemeId: RestrictiveResourceId,
        Configuration: ThemeConfiguration,
        Name: ThemeName,
        ThemeId: RestrictiveResourceId,
        Permissions: js.UndefOr[ResourcePermissionList] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        VersionDescription: js.UndefOr[VersionDescription] = js.undefined
    ): CreateThemeRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "BaseThemeId" -> BaseThemeId.asInstanceOf[js.Any],
        "Configuration" -> Configuration.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "ThemeId" -> ThemeId.asInstanceOf[js.Any]
      )

      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VersionDescription.foreach(__v => __obj.updateDynamic("VersionDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateThemeRequest]
    }
  }

  @js.native
  trait CreateThemeResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreationStatus: js.UndefOr[ResourceStatus]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var ThemeId: js.UndefOr[RestrictiveResourceId]
    var VersionArn: js.UndefOr[Arn]
  }

  object CreateThemeResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreationStatus: js.UndefOr[ResourceStatus] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        ThemeId: js.UndefOr[RestrictiveResourceId] = js.undefined,
        VersionArn: js.UndefOr[Arn] = js.undefined
    ): CreateThemeResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationStatus.foreach(__v => __obj.updateDynamic("CreationStatus")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      ThemeId.foreach(__v => __obj.updateDynamic("ThemeId")(__v.asInstanceOf[js.Any]))
      VersionArn.foreach(__v => __obj.updateDynamic("VersionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateThemeResponse]
    }
  }

  /** The combination of user name and password that are used as credentials.
    */
  @js.native
  trait CredentialPair extends js.Object {
    var Password: Password
    var Username: Username
    var AlternateDataSourceParameters: js.UndefOr[DataSourceParametersList]
  }

  object CredentialPair {
    @inline
    def apply(
        Password: Password,
        Username: Username,
        AlternateDataSourceParameters: js.UndefOr[DataSourceParametersList] = js.undefined
    ): CredentialPair = {
      val __obj = js.Dynamic.literal(
        "Password" -> Password.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )

      AlternateDataSourceParameters.foreach(__v => __obj.updateDynamic("AlternateDataSourceParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CredentialPair]
    }
  }

  /** A physical table type built from the results of the custom SQL query.
    */
  @js.native
  trait CustomSql extends js.Object {
    var DataSourceArn: Arn
    var Name: CustomSqlName
    var SqlQuery: SqlQuery
    var Columns: js.UndefOr[InputColumnList]
  }

  object CustomSql {
    @inline
    def apply(
        DataSourceArn: Arn,
        Name: CustomSqlName,
        SqlQuery: SqlQuery,
        Columns: js.UndefOr[InputColumnList] = js.undefined
    ): CustomSql = {
      val __obj = js.Dynamic.literal(
        "DataSourceArn" -> DataSourceArn.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "SqlQuery" -> SqlQuery.asInstanceOf[js.Any]
      )

      Columns.foreach(__v => __obj.updateDynamic("Columns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomSql]
    }
  }

  /** Dashboard.
    */
  @js.native
  trait Dashboard extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreatedTime: js.UndefOr[Timestamp]
    var DashboardId: js.UndefOr[RestrictiveResourceId]
    var LastPublishedTime: js.UndefOr[Timestamp]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[DashboardName]
    var Version: js.UndefOr[DashboardVersion]
  }

  object Dashboard {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        DashboardId: js.UndefOr[RestrictiveResourceId] = js.undefined,
        LastPublishedTime: js.UndefOr[Timestamp] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[DashboardName] = js.undefined,
        Version: js.UndefOr[DashboardVersion] = js.undefined
    ): Dashboard = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      DashboardId.foreach(__v => __obj.updateDynamic("DashboardId")(__v.asInstanceOf[js.Any]))
      LastPublishedTime.foreach(__v => __obj.updateDynamic("LastPublishedTime")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Dashboard]
    }
  }

  /** Dashboard error.
    */
  @js.native
  trait DashboardError extends js.Object {
    var Message: js.UndefOr[NonEmptyString]
    var Type: js.UndefOr[DashboardErrorType]
  }

  object DashboardError {
    @inline
    def apply(
        Message: js.UndefOr[NonEmptyString] = js.undefined,
        Type: js.UndefOr[DashboardErrorType] = js.undefined
    ): DashboardError = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DashboardError]
    }
  }

  /** Dashboard publish options.
    */
  @js.native
  trait DashboardPublishOptions extends js.Object {
    var AdHocFilteringOption: js.UndefOr[AdHocFilteringOption]
    var ExportToCSVOption: js.UndefOr[ExportToCSVOption]
    var SheetControlsOption: js.UndefOr[SheetControlsOption]
  }

  object DashboardPublishOptions {
    @inline
    def apply(
        AdHocFilteringOption: js.UndefOr[AdHocFilteringOption] = js.undefined,
        ExportToCSVOption: js.UndefOr[ExportToCSVOption] = js.undefined,
        SheetControlsOption: js.UndefOr[SheetControlsOption] = js.undefined
    ): DashboardPublishOptions = {
      val __obj = js.Dynamic.literal()
      AdHocFilteringOption.foreach(__v => __obj.updateDynamic("AdHocFilteringOption")(__v.asInstanceOf[js.Any]))
      ExportToCSVOption.foreach(__v => __obj.updateDynamic("ExportToCSVOption")(__v.asInstanceOf[js.Any]))
      SheetControlsOption.foreach(__v => __obj.updateDynamic("SheetControlsOption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DashboardPublishOptions]
    }
  }

  /** A filter that you apply when searching for dashboards.
    */
  @js.native
  trait DashboardSearchFilter extends js.Object {
    var Operator: FilterOperator
    var Name: js.UndefOr[DashboardFilterAttribute]
    var Value: js.UndefOr[String]
  }

  object DashboardSearchFilter {
    @inline
    def apply(
        Operator: FilterOperator,
        Name: js.UndefOr[DashboardFilterAttribute] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): DashboardSearchFilter = {
      val __obj = js.Dynamic.literal(
        "Operator" -> Operator.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DashboardSearchFilter]
    }
  }

  /** Dashboard source entity.
    */
  @js.native
  trait DashboardSourceEntity extends js.Object {
    var SourceTemplate: js.UndefOr[DashboardSourceTemplate]
  }

  object DashboardSourceEntity {
    @inline
    def apply(
        SourceTemplate: js.UndefOr[DashboardSourceTemplate] = js.undefined
    ): DashboardSourceEntity = {
      val __obj = js.Dynamic.literal()
      SourceTemplate.foreach(__v => __obj.updateDynamic("SourceTemplate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DashboardSourceEntity]
    }
  }

  /** Dashboard source template.
    */
  @js.native
  trait DashboardSourceTemplate extends js.Object {
    var Arn: Arn
    var DataSetReferences: DataSetReferenceList
  }

  object DashboardSourceTemplate {
    @inline
    def apply(
        Arn: Arn,
        DataSetReferences: DataSetReferenceList
    ): DashboardSourceTemplate = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "DataSetReferences" -> DataSetReferences.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DashboardSourceTemplate]
    }
  }

  /** Dashboard summary.
    */
  @js.native
  trait DashboardSummary extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreatedTime: js.UndefOr[Timestamp]
    var DashboardId: js.UndefOr[RestrictiveResourceId]
    var LastPublishedTime: js.UndefOr[Timestamp]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[DashboardName]
    var PublishedVersionNumber: js.UndefOr[VersionNumber]
  }

  object DashboardSummary {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        DashboardId: js.UndefOr[RestrictiveResourceId] = js.undefined,
        LastPublishedTime: js.UndefOr[Timestamp] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[DashboardName] = js.undefined,
        PublishedVersionNumber: js.UndefOr[VersionNumber] = js.undefined
    ): DashboardSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      DashboardId.foreach(__v => __obj.updateDynamic("DashboardId")(__v.asInstanceOf[js.Any]))
      LastPublishedTime.foreach(__v => __obj.updateDynamic("LastPublishedTime")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PublishedVersionNumber.foreach(__v => __obj.updateDynamic("PublishedVersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DashboardSummary]
    }
  }

  /** Dashboard version.
    */
  @js.native
  trait DashboardVersion extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreatedTime: js.UndefOr[Timestamp]
    var DataSetArns: js.UndefOr[DataSetArnsList]
    var Description: js.UndefOr[VersionDescription]
    var Errors: js.UndefOr[DashboardErrorList]
    var Sheets: js.UndefOr[SheetList]
    var SourceEntityArn: js.UndefOr[Arn]
    var Status: js.UndefOr[ResourceStatus]
    var ThemeArn: js.UndefOr[Arn]
    var VersionNumber: js.UndefOr[VersionNumber]
  }

  object DashboardVersion {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        DataSetArns: js.UndefOr[DataSetArnsList] = js.undefined,
        Description: js.UndefOr[VersionDescription] = js.undefined,
        Errors: js.UndefOr[DashboardErrorList] = js.undefined,
        Sheets: js.UndefOr[SheetList] = js.undefined,
        SourceEntityArn: js.UndefOr[Arn] = js.undefined,
        Status: js.UndefOr[ResourceStatus] = js.undefined,
        ThemeArn: js.UndefOr[Arn] = js.undefined,
        VersionNumber: js.UndefOr[VersionNumber] = js.undefined
    ): DashboardVersion = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      DataSetArns.foreach(__v => __obj.updateDynamic("DataSetArns")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Errors.foreach(__v => __obj.updateDynamic("Errors")(__v.asInstanceOf[js.Any]))
      Sheets.foreach(__v => __obj.updateDynamic("Sheets")(__v.asInstanceOf[js.Any]))
      SourceEntityArn.foreach(__v => __obj.updateDynamic("SourceEntityArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      ThemeArn.foreach(__v => __obj.updateDynamic("ThemeArn")(__v.asInstanceOf[js.Any]))
      VersionNumber.foreach(__v => __obj.updateDynamic("VersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DashboardVersion]
    }
  }

  /** Dashboard version summary.
    */
  @js.native
  trait DashboardVersionSummary extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreatedTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[VersionDescription]
    var SourceEntityArn: js.UndefOr[Arn]
    var Status: js.UndefOr[ResourceStatus]
    var VersionNumber: js.UndefOr[VersionNumber]
  }

  object DashboardVersionSummary {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[VersionDescription] = js.undefined,
        SourceEntityArn: js.UndefOr[Arn] = js.undefined,
        Status: js.UndefOr[ResourceStatus] = js.undefined,
        VersionNumber: js.UndefOr[VersionNumber] = js.undefined
    ): DashboardVersionSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      SourceEntityArn.foreach(__v => __obj.updateDynamic("SourceEntityArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      VersionNumber.foreach(__v => __obj.updateDynamic("VersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DashboardVersionSummary]
    }
  }

  /** The theme colors that are used for data colors in charts. The colors description is a hexadecimal color code that consists of six alphanumerical characters, prefixed with <code>#</code>, for example #37BFF5.
    */
  @js.native
  trait DataColorPalette extends js.Object {
    var Colors: js.UndefOr[ColorList]
    var EmptyFillColor: js.UndefOr[HexColor]
    var MinMaxGradient: js.UndefOr[ColorList]
  }

  object DataColorPalette {
    @inline
    def apply(
        Colors: js.UndefOr[ColorList] = js.undefined,
        EmptyFillColor: js.UndefOr[HexColor] = js.undefined,
        MinMaxGradient: js.UndefOr[ColorList] = js.undefined
    ): DataColorPalette = {
      val __obj = js.Dynamic.literal()
      Colors.foreach(__v => __obj.updateDynamic("Colors")(__v.asInstanceOf[js.Any]))
      EmptyFillColor.foreach(__v => __obj.updateDynamic("EmptyFillColor")(__v.asInstanceOf[js.Any]))
      MinMaxGradient.foreach(__v => __obj.updateDynamic("MinMaxGradient")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataColorPalette]
    }
  }

  /** Dataset.
    */
  @js.native
  trait DataSet extends js.Object {
    var Arn: js.UndefOr[Arn]
    var ColumnGroups: js.UndefOr[ColumnGroupList]
    var ColumnLevelPermissionRules: js.UndefOr[ColumnLevelPermissionRuleList]
    var ConsumedSpiceCapacityInBytes: js.UndefOr[Double]
    var CreatedTime: js.UndefOr[Timestamp]
    var DataSetId: js.UndefOr[ResourceId]
    var DataSetUsageConfiguration: js.UndefOr[DataSetUsageConfiguration]
    var FieldFolders: js.UndefOr[FieldFolderMap]
    var ImportMode: js.UndefOr[DataSetImportMode]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var LogicalTableMap: js.UndefOr[LogicalTableMap]
    var Name: js.UndefOr[ResourceName]
    var OutputColumns: js.UndefOr[OutputColumnList]
    var PhysicalTableMap: js.UndefOr[PhysicalTableMap]
    var RowLevelPermissionDataSet: js.UndefOr[RowLevelPermissionDataSet]
    var RowLevelPermissionTagConfiguration: js.UndefOr[RowLevelPermissionTagConfiguration]
  }

  object DataSet {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        ColumnGroups: js.UndefOr[ColumnGroupList] = js.undefined,
        ColumnLevelPermissionRules: js.UndefOr[ColumnLevelPermissionRuleList] = js.undefined,
        ConsumedSpiceCapacityInBytes: js.UndefOr[Double] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        DataSetId: js.UndefOr[ResourceId] = js.undefined,
        DataSetUsageConfiguration: js.UndefOr[DataSetUsageConfiguration] = js.undefined,
        FieldFolders: js.UndefOr[FieldFolderMap] = js.undefined,
        ImportMode: js.UndefOr[DataSetImportMode] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        LogicalTableMap: js.UndefOr[LogicalTableMap] = js.undefined,
        Name: js.UndefOr[ResourceName] = js.undefined,
        OutputColumns: js.UndefOr[OutputColumnList] = js.undefined,
        PhysicalTableMap: js.UndefOr[PhysicalTableMap] = js.undefined,
        RowLevelPermissionDataSet: js.UndefOr[RowLevelPermissionDataSet] = js.undefined,
        RowLevelPermissionTagConfiguration: js.UndefOr[RowLevelPermissionTagConfiguration] = js.undefined
    ): DataSet = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      ColumnGroups.foreach(__v => __obj.updateDynamic("ColumnGroups")(__v.asInstanceOf[js.Any]))
      ColumnLevelPermissionRules.foreach(__v => __obj.updateDynamic("ColumnLevelPermissionRules")(__v.asInstanceOf[js.Any]))
      ConsumedSpiceCapacityInBytes.foreach(__v => __obj.updateDynamic("ConsumedSpiceCapacityInBytes")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      DataSetId.foreach(__v => __obj.updateDynamic("DataSetId")(__v.asInstanceOf[js.Any]))
      DataSetUsageConfiguration.foreach(__v => __obj.updateDynamic("DataSetUsageConfiguration")(__v.asInstanceOf[js.Any]))
      FieldFolders.foreach(__v => __obj.updateDynamic("FieldFolders")(__v.asInstanceOf[js.Any]))
      ImportMode.foreach(__v => __obj.updateDynamic("ImportMode")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      LogicalTableMap.foreach(__v => __obj.updateDynamic("LogicalTableMap")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OutputColumns.foreach(__v => __obj.updateDynamic("OutputColumns")(__v.asInstanceOf[js.Any]))
      PhysicalTableMap.foreach(__v => __obj.updateDynamic("PhysicalTableMap")(__v.asInstanceOf[js.Any]))
      RowLevelPermissionDataSet.foreach(__v => __obj.updateDynamic("RowLevelPermissionDataSet")(__v.asInstanceOf[js.Any]))
      RowLevelPermissionTagConfiguration.foreach(__v => __obj.updateDynamic("RowLevelPermissionTagConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataSet]
    }
  }

  /** Dataset configuration.
    */
  @js.native
  trait DataSetConfiguration extends js.Object {
    var ColumnGroupSchemaList: js.UndefOr[ColumnGroupSchemaList]
    var DataSetSchema: js.UndefOr[DataSetSchema]
    var Placeholder: js.UndefOr[String]
  }

  object DataSetConfiguration {
    @inline
    def apply(
        ColumnGroupSchemaList: js.UndefOr[ColumnGroupSchemaList] = js.undefined,
        DataSetSchema: js.UndefOr[DataSetSchema] = js.undefined,
        Placeholder: js.UndefOr[String] = js.undefined
    ): DataSetConfiguration = {
      val __obj = js.Dynamic.literal()
      ColumnGroupSchemaList.foreach(__v => __obj.updateDynamic("ColumnGroupSchemaList")(__v.asInstanceOf[js.Any]))
      DataSetSchema.foreach(__v => __obj.updateDynamic("DataSetSchema")(__v.asInstanceOf[js.Any]))
      Placeholder.foreach(__v => __obj.updateDynamic("Placeholder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataSetConfiguration]
    }
  }

  /** Dataset reference.
    */
  @js.native
  trait DataSetReference extends js.Object {
    var DataSetArn: Arn
    var DataSetPlaceholder: NonEmptyString
  }

  object DataSetReference {
    @inline
    def apply(
        DataSetArn: Arn,
        DataSetPlaceholder: NonEmptyString
    ): DataSetReference = {
      val __obj = js.Dynamic.literal(
        "DataSetArn" -> DataSetArn.asInstanceOf[js.Any],
        "DataSetPlaceholder" -> DataSetPlaceholder.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DataSetReference]
    }
  }

  /** Dataset schema.
    */
  @js.native
  trait DataSetSchema extends js.Object {
    var ColumnSchemaList: js.UndefOr[ColumnSchemaList]
  }

  object DataSetSchema {
    @inline
    def apply(
        ColumnSchemaList: js.UndefOr[ColumnSchemaList] = js.undefined
    ): DataSetSchema = {
      val __obj = js.Dynamic.literal()
      ColumnSchemaList.foreach(__v => __obj.updateDynamic("ColumnSchemaList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataSetSchema]
    }
  }

  /** Dataset summary.
    */
  @js.native
  trait DataSetSummary extends js.Object {
    var Arn: js.UndefOr[Arn]
    var ColumnLevelPermissionRulesApplied: js.UndefOr[Boolean]
    var CreatedTime: js.UndefOr[Timestamp]
    var DataSetId: js.UndefOr[ResourceId]
    var ImportMode: js.UndefOr[DataSetImportMode]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[ResourceName]
    var RowLevelPermissionDataSet: js.UndefOr[RowLevelPermissionDataSet]
    var RowLevelPermissionTagConfigurationApplied: js.UndefOr[Boolean]
  }

  object DataSetSummary {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        ColumnLevelPermissionRulesApplied: js.UndefOr[Boolean] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        DataSetId: js.UndefOr[ResourceId] = js.undefined,
        ImportMode: js.UndefOr[DataSetImportMode] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[ResourceName] = js.undefined,
        RowLevelPermissionDataSet: js.UndefOr[RowLevelPermissionDataSet] = js.undefined,
        RowLevelPermissionTagConfigurationApplied: js.UndefOr[Boolean] = js.undefined
    ): DataSetSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      ColumnLevelPermissionRulesApplied.foreach(__v => __obj.updateDynamic("ColumnLevelPermissionRulesApplied")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      DataSetId.foreach(__v => __obj.updateDynamic("DataSetId")(__v.asInstanceOf[js.Any]))
      ImportMode.foreach(__v => __obj.updateDynamic("ImportMode")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RowLevelPermissionDataSet.foreach(__v => __obj.updateDynamic("RowLevelPermissionDataSet")(__v.asInstanceOf[js.Any]))
      RowLevelPermissionTagConfigurationApplied.foreach(__v => __obj.updateDynamic("RowLevelPermissionTagConfigurationApplied")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataSetSummary]
    }
  }

  /** The usage configuration to apply to child datasets that reference this dataset as a source.
    */
  @js.native
  trait DataSetUsageConfiguration extends js.Object {
    var DisableUseAsDirectQuerySource: js.UndefOr[Boolean]
    var DisableUseAsImportedSource: js.UndefOr[Boolean]
  }

  object DataSetUsageConfiguration {
    @inline
    def apply(
        DisableUseAsDirectQuerySource: js.UndefOr[Boolean] = js.undefined,
        DisableUseAsImportedSource: js.UndefOr[Boolean] = js.undefined
    ): DataSetUsageConfiguration = {
      val __obj = js.Dynamic.literal()
      DisableUseAsDirectQuerySource.foreach(__v => __obj.updateDynamic("DisableUseAsDirectQuerySource")(__v.asInstanceOf[js.Any]))
      DisableUseAsImportedSource.foreach(__v => __obj.updateDynamic("DisableUseAsImportedSource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataSetUsageConfiguration]
    }
  }

  /** The structure of a data source.
    */
  @js.native
  trait DataSource extends js.Object {
    var AlternateDataSourceParameters: js.UndefOr[DataSourceParametersList]
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

  object DataSource {
    @inline
    def apply(
        AlternateDataSourceParameters: js.UndefOr[DataSourceParametersList] = js.undefined,
        Arn: js.UndefOr[Arn] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        DataSourceId: js.UndefOr[ResourceId] = js.undefined,
        DataSourceParameters: js.UndefOr[DataSourceParameters] = js.undefined,
        ErrorInfo: js.UndefOr[DataSourceErrorInfo] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[ResourceName] = js.undefined,
        SslProperties: js.UndefOr[SslProperties] = js.undefined,
        Status: js.UndefOr[ResourceStatus] = js.undefined,
        Type: js.UndefOr[DataSourceType] = js.undefined,
        VpcConnectionProperties: js.UndefOr[VpcConnectionProperties] = js.undefined
    ): DataSource = {
      val __obj = js.Dynamic.literal()
      AlternateDataSourceParameters.foreach(__v => __obj.updateDynamic("AlternateDataSourceParameters")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      DataSourceId.foreach(__v => __obj.updateDynamic("DataSourceId")(__v.asInstanceOf[js.Any]))
      DataSourceParameters.foreach(__v => __obj.updateDynamic("DataSourceParameters")(__v.asInstanceOf[js.Any]))
      ErrorInfo.foreach(__v => __obj.updateDynamic("ErrorInfo")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SslProperties.foreach(__v => __obj.updateDynamic("SslProperties")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      VpcConnectionProperties.foreach(__v => __obj.updateDynamic("VpcConnectionProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataSource]
    }
  }

  /** Data source credentials. This is a variant type structure. For this structure to be valid, only one of the attributes can be non-null.
    */
  @js.native
  trait DataSourceCredentials extends js.Object {
    var CopySourceArn: js.UndefOr[CopySourceArn]
    var CredentialPair: js.UndefOr[CredentialPair]
  }

  object DataSourceCredentials {
    @inline
    def apply(
        CopySourceArn: js.UndefOr[CopySourceArn] = js.undefined,
        CredentialPair: js.UndefOr[CredentialPair] = js.undefined
    ): DataSourceCredentials = {
      val __obj = js.Dynamic.literal()
      CopySourceArn.foreach(__v => __obj.updateDynamic("CopySourceArn")(__v.asInstanceOf[js.Any]))
      CredentialPair.foreach(__v => __obj.updateDynamic("CredentialPair")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataSourceCredentials]
    }
  }

  /** Error information for the data source creation or update.
    */
  @js.native
  trait DataSourceErrorInfo extends js.Object {
    var Message: js.UndefOr[String]
    var Type: js.UndefOr[DataSourceErrorInfoType]
  }

  object DataSourceErrorInfo {
    @inline
    def apply(
        Message: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[DataSourceErrorInfoType] = js.undefined
    ): DataSourceErrorInfo = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataSourceErrorInfo]
    }
  }

  /** The parameters that Amazon QuickSight uses to connect to your underlying data source. This is a variant type structure. For this structure to be valid, only one of the attributes can be non-null.
    */
  @js.native
  trait DataSourceParameters extends js.Object {
    var AmazonElasticsearchParameters: js.UndefOr[AmazonElasticsearchParameters]
    var AmazonOpenSearchParameters: js.UndefOr[AmazonOpenSearchParameters]
    var AthenaParameters: js.UndefOr[AthenaParameters]
    var AuroraParameters: js.UndefOr[AuroraParameters]
    var AuroraPostgreSqlParameters: js.UndefOr[AuroraPostgreSqlParameters]
    var AwsIotAnalyticsParameters: js.UndefOr[AwsIotAnalyticsParameters]
    var ExasolParameters: js.UndefOr[ExasolParameters]
    var JiraParameters: js.UndefOr[JiraParameters]
    var MariaDbParameters: js.UndefOr[MariaDbParameters]
    var MySqlParameters: js.UndefOr[MySqlParameters]
    var OracleParameters: js.UndefOr[OracleParameters]
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

  object DataSourceParameters {
    @inline
    def apply(
        AmazonElasticsearchParameters: js.UndefOr[AmazonElasticsearchParameters] = js.undefined,
        AmazonOpenSearchParameters: js.UndefOr[AmazonOpenSearchParameters] = js.undefined,
        AthenaParameters: js.UndefOr[AthenaParameters] = js.undefined,
        AuroraParameters: js.UndefOr[AuroraParameters] = js.undefined,
        AuroraPostgreSqlParameters: js.UndefOr[AuroraPostgreSqlParameters] = js.undefined,
        AwsIotAnalyticsParameters: js.UndefOr[AwsIotAnalyticsParameters] = js.undefined,
        ExasolParameters: js.UndefOr[ExasolParameters] = js.undefined,
        JiraParameters: js.UndefOr[JiraParameters] = js.undefined,
        MariaDbParameters: js.UndefOr[MariaDbParameters] = js.undefined,
        MySqlParameters: js.UndefOr[MySqlParameters] = js.undefined,
        OracleParameters: js.UndefOr[OracleParameters] = js.undefined,
        PostgreSqlParameters: js.UndefOr[PostgreSqlParameters] = js.undefined,
        PrestoParameters: js.UndefOr[PrestoParameters] = js.undefined,
        RdsParameters: js.UndefOr[RdsParameters] = js.undefined,
        RedshiftParameters: js.UndefOr[RedshiftParameters] = js.undefined,
        S3Parameters: js.UndefOr[S3Parameters] = js.undefined,
        ServiceNowParameters: js.UndefOr[ServiceNowParameters] = js.undefined,
        SnowflakeParameters: js.UndefOr[SnowflakeParameters] = js.undefined,
        SparkParameters: js.UndefOr[SparkParameters] = js.undefined,
        SqlServerParameters: js.UndefOr[SqlServerParameters] = js.undefined,
        TeradataParameters: js.UndefOr[TeradataParameters] = js.undefined,
        TwitterParameters: js.UndefOr[TwitterParameters] = js.undefined
    ): DataSourceParameters = {
      val __obj = js.Dynamic.literal()
      AmazonElasticsearchParameters.foreach(__v => __obj.updateDynamic("AmazonElasticsearchParameters")(__v.asInstanceOf[js.Any]))
      AmazonOpenSearchParameters.foreach(__v => __obj.updateDynamic("AmazonOpenSearchParameters")(__v.asInstanceOf[js.Any]))
      AthenaParameters.foreach(__v => __obj.updateDynamic("AthenaParameters")(__v.asInstanceOf[js.Any]))
      AuroraParameters.foreach(__v => __obj.updateDynamic("AuroraParameters")(__v.asInstanceOf[js.Any]))
      AuroraPostgreSqlParameters.foreach(__v => __obj.updateDynamic("AuroraPostgreSqlParameters")(__v.asInstanceOf[js.Any]))
      AwsIotAnalyticsParameters.foreach(__v => __obj.updateDynamic("AwsIotAnalyticsParameters")(__v.asInstanceOf[js.Any]))
      ExasolParameters.foreach(__v => __obj.updateDynamic("ExasolParameters")(__v.asInstanceOf[js.Any]))
      JiraParameters.foreach(__v => __obj.updateDynamic("JiraParameters")(__v.asInstanceOf[js.Any]))
      MariaDbParameters.foreach(__v => __obj.updateDynamic("MariaDbParameters")(__v.asInstanceOf[js.Any]))
      MySqlParameters.foreach(__v => __obj.updateDynamic("MySqlParameters")(__v.asInstanceOf[js.Any]))
      OracleParameters.foreach(__v => __obj.updateDynamic("OracleParameters")(__v.asInstanceOf[js.Any]))
      PostgreSqlParameters.foreach(__v => __obj.updateDynamic("PostgreSqlParameters")(__v.asInstanceOf[js.Any]))
      PrestoParameters.foreach(__v => __obj.updateDynamic("PrestoParameters")(__v.asInstanceOf[js.Any]))
      RdsParameters.foreach(__v => __obj.updateDynamic("RdsParameters")(__v.asInstanceOf[js.Any]))
      RedshiftParameters.foreach(__v => __obj.updateDynamic("RedshiftParameters")(__v.asInstanceOf[js.Any]))
      S3Parameters.foreach(__v => __obj.updateDynamic("S3Parameters")(__v.asInstanceOf[js.Any]))
      ServiceNowParameters.foreach(__v => __obj.updateDynamic("ServiceNowParameters")(__v.asInstanceOf[js.Any]))
      SnowflakeParameters.foreach(__v => __obj.updateDynamic("SnowflakeParameters")(__v.asInstanceOf[js.Any]))
      SparkParameters.foreach(__v => __obj.updateDynamic("SparkParameters")(__v.asInstanceOf[js.Any]))
      SqlServerParameters.foreach(__v => __obj.updateDynamic("SqlServerParameters")(__v.asInstanceOf[js.Any]))
      TeradataParameters.foreach(__v => __obj.updateDynamic("TeradataParameters")(__v.asInstanceOf[js.Any]))
      TwitterParameters.foreach(__v => __obj.updateDynamic("TwitterParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataSourceParameters]
    }
  }

  /** A date-time parameter.
    */
  @js.native
  trait DateTimeParameter extends js.Object {
    var Name: NonEmptyString
    var Values: TimestampList
  }

  object DateTimeParameter {
    @inline
    def apply(
        Name: NonEmptyString,
        Values: TimestampList
    ): DateTimeParameter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DateTimeParameter]
    }
  }

  /** A decimal parameter.
    */
  @js.native
  trait DecimalParameter extends js.Object {
    var Name: NonEmptyString
    var Values: DoubleList
  }

  object DecimalParameter {
    @inline
    def apply(
        Name: NonEmptyString,
        Values: DoubleList
    ): DecimalParameter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DecimalParameter]
    }
  }

  @js.native
  trait DeleteAccountCustomizationRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Namespace: js.UndefOr[Namespace]
  }

  object DeleteAccountCustomizationRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        Namespace: js.UndefOr[Namespace] = js.undefined
    ): DeleteAccountCustomizationRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any]
      )

      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAccountCustomizationRequest]
    }
  }

  @js.native
  trait DeleteAccountCustomizationResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DeleteAccountCustomizationResponse {
    @inline
    def apply(
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DeleteAccountCustomizationResponse = {
      val __obj = js.Dynamic.literal()
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAccountCustomizationResponse]
    }
  }

  @js.native
  trait DeleteAnalysisRequest extends js.Object {
    var AnalysisId: RestrictiveResourceId
    var AwsAccountId: AwsAccountId
    var ForceDeleteWithoutRecovery: js.UndefOr[Boolean]
    var RecoveryWindowInDays: js.UndefOr[RecoveryWindowInDays]
  }

  object DeleteAnalysisRequest {
    @inline
    def apply(
        AnalysisId: RestrictiveResourceId,
        AwsAccountId: AwsAccountId,
        ForceDeleteWithoutRecovery: js.UndefOr[Boolean] = js.undefined,
        RecoveryWindowInDays: js.UndefOr[RecoveryWindowInDays] = js.undefined
    ): DeleteAnalysisRequest = {
      val __obj = js.Dynamic.literal(
        "AnalysisId" -> AnalysisId.asInstanceOf[js.Any],
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any]
      )

      ForceDeleteWithoutRecovery.foreach(__v => __obj.updateDynamic("ForceDeleteWithoutRecovery")(__v.asInstanceOf[js.Any]))
      RecoveryWindowInDays.foreach(__v => __obj.updateDynamic("RecoveryWindowInDays")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAnalysisRequest]
    }
  }

  @js.native
  trait DeleteAnalysisResponse extends js.Object {
    var AnalysisId: js.UndefOr[RestrictiveResourceId]
    var Arn: js.UndefOr[Arn]
    var DeletionTime: js.UndefOr[Timestamp]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DeleteAnalysisResponse {
    @inline
    def apply(
        AnalysisId: js.UndefOr[RestrictiveResourceId] = js.undefined,
        Arn: js.UndefOr[Arn] = js.undefined,
        DeletionTime: js.UndefOr[Timestamp] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DeleteAnalysisResponse = {
      val __obj = js.Dynamic.literal()
      AnalysisId.foreach(__v => __obj.updateDynamic("AnalysisId")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      DeletionTime.foreach(__v => __obj.updateDynamic("DeletionTime")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAnalysisResponse]
    }
  }

  @js.native
  trait DeleteDashboardRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DashboardId: RestrictiveResourceId
    var VersionNumber: js.UndefOr[VersionNumber]
  }

  object DeleteDashboardRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DashboardId: RestrictiveResourceId,
        VersionNumber: js.UndefOr[VersionNumber] = js.undefined
    ): DeleteDashboardRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "DashboardId" -> DashboardId.asInstanceOf[js.Any]
      )

      VersionNumber.foreach(__v => __obj.updateDynamic("VersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDashboardRequest]
    }
  }

  @js.native
  trait DeleteDashboardResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var DashboardId: js.UndefOr[RestrictiveResourceId]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DeleteDashboardResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        DashboardId: js.UndefOr[RestrictiveResourceId] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DeleteDashboardResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      DashboardId.foreach(__v => __obj.updateDynamic("DashboardId")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDashboardResponse]
    }
  }

  @js.native
  trait DeleteDataSetRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DataSetId: ResourceId
  }

  object DeleteDataSetRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DataSetId: ResourceId
    ): DeleteDataSetRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "DataSetId" -> DataSetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDataSetRequest]
    }
  }

  @js.native
  trait DeleteDataSetResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var DataSetId: js.UndefOr[ResourceId]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DeleteDataSetResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        DataSetId: js.UndefOr[ResourceId] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DeleteDataSetResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      DataSetId.foreach(__v => __obj.updateDynamic("DataSetId")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDataSetResponse]
    }
  }

  @js.native
  trait DeleteDataSourceRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DataSourceId: ResourceId
  }

  object DeleteDataSourceRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DataSourceId: ResourceId
    ): DeleteDataSourceRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "DataSourceId" -> DataSourceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDataSourceRequest]
    }
  }

  @js.native
  trait DeleteDataSourceResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var DataSourceId: js.UndefOr[ResourceId]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DeleteDataSourceResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        DataSourceId: js.UndefOr[ResourceId] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DeleteDataSourceResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      DataSourceId.foreach(__v => __obj.updateDynamic("DataSourceId")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteDataSourceResponse]
    }
  }

  @js.native
  trait DeleteFolderMembershipRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var FolderId: RestrictiveResourceId
    var MemberId: RestrictiveResourceId
    var MemberType: MemberType
  }

  object DeleteFolderMembershipRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        FolderId: RestrictiveResourceId,
        MemberId: RestrictiveResourceId,
        MemberType: MemberType
    ): DeleteFolderMembershipRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "FolderId" -> FolderId.asInstanceOf[js.Any],
        "MemberId" -> MemberId.asInstanceOf[js.Any],
        "MemberType" -> MemberType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteFolderMembershipRequest]
    }
  }

  @js.native
  trait DeleteFolderMembershipResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DeleteFolderMembershipResponse {
    @inline
    def apply(
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DeleteFolderMembershipResponse = {
      val __obj = js.Dynamic.literal()
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFolderMembershipResponse]
    }
  }

  @js.native
  trait DeleteFolderRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var FolderId: RestrictiveResourceId
  }

  object DeleteFolderRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        FolderId: RestrictiveResourceId
    ): DeleteFolderRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "FolderId" -> FolderId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteFolderRequest]
    }
  }

  @js.native
  trait DeleteFolderResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var FolderId: js.UndefOr[RestrictiveResourceId]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DeleteFolderResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        FolderId: js.UndefOr[RestrictiveResourceId] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DeleteFolderResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      FolderId.foreach(__v => __obj.updateDynamic("FolderId")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteFolderResponse]
    }
  }

  @js.native
  trait DeleteGroupMembershipRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var GroupName: GroupName
    var MemberName: GroupMemberName
    var Namespace: Namespace
  }

  object DeleteGroupMembershipRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        GroupName: GroupName,
        MemberName: GroupMemberName,
        Namespace: Namespace
    ): DeleteGroupMembershipRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "GroupName" -> GroupName.asInstanceOf[js.Any],
        "MemberName" -> MemberName.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteGroupMembershipRequest]
    }
  }

  @js.native
  trait DeleteGroupMembershipResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DeleteGroupMembershipResponse {
    @inline
    def apply(
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DeleteGroupMembershipResponse = {
      val __obj = js.Dynamic.literal()
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteGroupMembershipResponse]
    }
  }

  @js.native
  trait DeleteGroupRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var GroupName: GroupName
    var Namespace: Namespace
  }

  object DeleteGroupRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        GroupName: GroupName,
        Namespace: Namespace
    ): DeleteGroupRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "GroupName" -> GroupName.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteGroupRequest]
    }
  }

  @js.native
  trait DeleteGroupResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DeleteGroupResponse {
    @inline
    def apply(
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DeleteGroupResponse = {
      val __obj = js.Dynamic.literal()
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteGroupResponse]
    }
  }

  @js.native
  trait DeleteIAMPolicyAssignmentRequest extends js.Object {
    var AssignmentName: IAMPolicyAssignmentName
    var AwsAccountId: AwsAccountId
    var Namespace: Namespace
  }

  object DeleteIAMPolicyAssignmentRequest {
    @inline
    def apply(
        AssignmentName: IAMPolicyAssignmentName,
        AwsAccountId: AwsAccountId,
        Namespace: Namespace
    ): DeleteIAMPolicyAssignmentRequest = {
      val __obj = js.Dynamic.literal(
        "AssignmentName" -> AssignmentName.asInstanceOf[js.Any],
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteIAMPolicyAssignmentRequest]
    }
  }

  @js.native
  trait DeleteIAMPolicyAssignmentResponse extends js.Object {
    var AssignmentName: js.UndefOr[IAMPolicyAssignmentName]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DeleteIAMPolicyAssignmentResponse {
    @inline
    def apply(
        AssignmentName: js.UndefOr[IAMPolicyAssignmentName] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DeleteIAMPolicyAssignmentResponse = {
      val __obj = js.Dynamic.literal()
      AssignmentName.foreach(__v => __obj.updateDynamic("AssignmentName")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteIAMPolicyAssignmentResponse]
    }
  }

  @js.native
  trait DeleteNamespaceRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Namespace: Namespace
  }

  object DeleteNamespaceRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        Namespace: Namespace
    ): DeleteNamespaceRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteNamespaceRequest]
    }
  }

  @js.native
  trait DeleteNamespaceResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DeleteNamespaceResponse {
    @inline
    def apply(
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DeleteNamespaceResponse = {
      val __obj = js.Dynamic.literal()
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteNamespaceResponse]
    }
  }

  @js.native
  trait DeleteTemplateAliasRequest extends js.Object {
    var AliasName: AliasName
    var AwsAccountId: AwsAccountId
    var TemplateId: RestrictiveResourceId
  }

  object DeleteTemplateAliasRequest {
    @inline
    def apply(
        AliasName: AliasName,
        AwsAccountId: AwsAccountId,
        TemplateId: RestrictiveResourceId
    ): DeleteTemplateAliasRequest = {
      val __obj = js.Dynamic.literal(
        "AliasName" -> AliasName.asInstanceOf[js.Any],
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "TemplateId" -> TemplateId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteTemplateAliasRequest]
    }
  }

  @js.native
  trait DeleteTemplateAliasResponse extends js.Object {
    var AliasName: js.UndefOr[AliasName]
    var Arn: js.UndefOr[Arn]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var TemplateId: js.UndefOr[RestrictiveResourceId]
  }

  object DeleteTemplateAliasResponse {
    @inline
    def apply(
        AliasName: js.UndefOr[AliasName] = js.undefined,
        Arn: js.UndefOr[Arn] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        TemplateId: js.UndefOr[RestrictiveResourceId] = js.undefined
    ): DeleteTemplateAliasResponse = {
      val __obj = js.Dynamic.literal()
      AliasName.foreach(__v => __obj.updateDynamic("AliasName")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TemplateId.foreach(__v => __obj.updateDynamic("TemplateId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteTemplateAliasResponse]
    }
  }

  @js.native
  trait DeleteTemplateRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var TemplateId: RestrictiveResourceId
    var VersionNumber: js.UndefOr[VersionNumber]
  }

  object DeleteTemplateRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        TemplateId: RestrictiveResourceId,
        VersionNumber: js.UndefOr[VersionNumber] = js.undefined
    ): DeleteTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "TemplateId" -> TemplateId.asInstanceOf[js.Any]
      )

      VersionNumber.foreach(__v => __obj.updateDynamic("VersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteTemplateRequest]
    }
  }

  @js.native
  trait DeleteTemplateResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var TemplateId: js.UndefOr[RestrictiveResourceId]
  }

  object DeleteTemplateResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        TemplateId: js.UndefOr[RestrictiveResourceId] = js.undefined
    ): DeleteTemplateResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TemplateId.foreach(__v => __obj.updateDynamic("TemplateId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteTemplateResponse]
    }
  }

  @js.native
  trait DeleteThemeAliasRequest extends js.Object {
    var AliasName: AliasName
    var AwsAccountId: AwsAccountId
    var ThemeId: RestrictiveResourceId
  }

  object DeleteThemeAliasRequest {
    @inline
    def apply(
        AliasName: AliasName,
        AwsAccountId: AwsAccountId,
        ThemeId: RestrictiveResourceId
    ): DeleteThemeAliasRequest = {
      val __obj = js.Dynamic.literal(
        "AliasName" -> AliasName.asInstanceOf[js.Any],
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "ThemeId" -> ThemeId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteThemeAliasRequest]
    }
  }

  @js.native
  trait DeleteThemeAliasResponse extends js.Object {
    var AliasName: js.UndefOr[AliasName]
    var Arn: js.UndefOr[Arn]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var ThemeId: js.UndefOr[RestrictiveResourceId]
  }

  object DeleteThemeAliasResponse {
    @inline
    def apply(
        AliasName: js.UndefOr[AliasName] = js.undefined,
        Arn: js.UndefOr[Arn] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        ThemeId: js.UndefOr[RestrictiveResourceId] = js.undefined
    ): DeleteThemeAliasResponse = {
      val __obj = js.Dynamic.literal()
      AliasName.foreach(__v => __obj.updateDynamic("AliasName")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      ThemeId.foreach(__v => __obj.updateDynamic("ThemeId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteThemeAliasResponse]
    }
  }

  @js.native
  trait DeleteThemeRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var ThemeId: RestrictiveResourceId
    var VersionNumber: js.UndefOr[VersionNumber]
  }

  object DeleteThemeRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        ThemeId: RestrictiveResourceId,
        VersionNumber: js.UndefOr[VersionNumber] = js.undefined
    ): DeleteThemeRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "ThemeId" -> ThemeId.asInstanceOf[js.Any]
      )

      VersionNumber.foreach(__v => __obj.updateDynamic("VersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteThemeRequest]
    }
  }

  @js.native
  trait DeleteThemeResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var ThemeId: js.UndefOr[RestrictiveResourceId]
  }

  object DeleteThemeResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        ThemeId: js.UndefOr[RestrictiveResourceId] = js.undefined
    ): DeleteThemeResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      ThemeId.foreach(__v => __obj.updateDynamic("ThemeId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteThemeResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait DeleteUserByPrincipalIdRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Namespace: Namespace
    var PrincipalId: String
  }

  object DeleteUserByPrincipalIdRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        Namespace: Namespace,
        PrincipalId: String
    ): DeleteUserByPrincipalIdRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any],
        "PrincipalId" -> PrincipalId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteUserByPrincipalIdRequest]
    }
  }

  @js.native
  trait DeleteUserByPrincipalIdResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DeleteUserByPrincipalIdResponse {
    @inline
    def apply(
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DeleteUserByPrincipalIdResponse = {
      val __obj = js.Dynamic.literal()
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteUserByPrincipalIdResponse]
    }
  }

  @js.native
  trait DeleteUserRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Namespace: Namespace
    var UserName: UserName
  }

  object DeleteUserRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        Namespace: Namespace,
        UserName: UserName
    ): DeleteUserRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteUserRequest]
    }
  }

  @js.native
  trait DeleteUserResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DeleteUserResponse {
    @inline
    def apply(
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DeleteUserResponse = {
      val __obj = js.Dynamic.literal()
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteUserResponse]
    }
  }

  @js.native
  trait DescribeAccountCustomizationRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Namespace: js.UndefOr[Namespace]
    var Resolved: js.UndefOr[Boolean]
  }

  object DescribeAccountCustomizationRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        Namespace: js.UndefOr[Namespace] = js.undefined,
        Resolved: js.UndefOr[Boolean] = js.undefined
    ): DescribeAccountCustomizationRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any]
      )

      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      Resolved.foreach(__v => __obj.updateDynamic("Resolved")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAccountCustomizationRequest]
    }
  }

  @js.native
  trait DescribeAccountCustomizationResponse extends js.Object {
    var AccountCustomization: js.UndefOr[AccountCustomization]
    var Arn: js.UndefOr[Arn]
    var AwsAccountId: js.UndefOr[AwsAccountId]
    var Namespace: js.UndefOr[Namespace]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DescribeAccountCustomizationResponse {
    @inline
    def apply(
        AccountCustomization: js.UndefOr[AccountCustomization] = js.undefined,
        Arn: js.UndefOr[Arn] = js.undefined,
        AwsAccountId: js.UndefOr[AwsAccountId] = js.undefined,
        Namespace: js.UndefOr[Namespace] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DescribeAccountCustomizationResponse = {
      val __obj = js.Dynamic.literal()
      AccountCustomization.foreach(__v => __obj.updateDynamic("AccountCustomization")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      AwsAccountId.foreach(__v => __obj.updateDynamic("AwsAccountId")(__v.asInstanceOf[js.Any]))
      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAccountCustomizationResponse]
    }
  }

  @js.native
  trait DescribeAccountSettingsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
  }

  object DescribeAccountSettingsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId
    ): DescribeAccountSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAccountSettingsRequest]
    }
  }

  @js.native
  trait DescribeAccountSettingsResponse extends js.Object {
    var AccountSettings: js.UndefOr[AccountSettings]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DescribeAccountSettingsResponse {
    @inline
    def apply(
        AccountSettings: js.UndefOr[AccountSettings] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DescribeAccountSettingsResponse = {
      val __obj = js.Dynamic.literal()
      AccountSettings.foreach(__v => __obj.updateDynamic("AccountSettings")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAccountSettingsResponse]
    }
  }

  @js.native
  trait DescribeAnalysisPermissionsRequest extends js.Object {
    var AnalysisId: RestrictiveResourceId
    var AwsAccountId: AwsAccountId
  }

  object DescribeAnalysisPermissionsRequest {
    @inline
    def apply(
        AnalysisId: RestrictiveResourceId,
        AwsAccountId: AwsAccountId
    ): DescribeAnalysisPermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "AnalysisId" -> AnalysisId.asInstanceOf[js.Any],
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAnalysisPermissionsRequest]
    }
  }

  @js.native
  trait DescribeAnalysisPermissionsResponse extends js.Object {
    var AnalysisArn: js.UndefOr[Arn]
    var AnalysisId: js.UndefOr[RestrictiveResourceId]
    var Permissions: js.UndefOr[ResourcePermissionList]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DescribeAnalysisPermissionsResponse {
    @inline
    def apply(
        AnalysisArn: js.UndefOr[Arn] = js.undefined,
        AnalysisId: js.UndefOr[RestrictiveResourceId] = js.undefined,
        Permissions: js.UndefOr[ResourcePermissionList] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DescribeAnalysisPermissionsResponse = {
      val __obj = js.Dynamic.literal()
      AnalysisArn.foreach(__v => __obj.updateDynamic("AnalysisArn")(__v.asInstanceOf[js.Any]))
      AnalysisId.foreach(__v => __obj.updateDynamic("AnalysisId")(__v.asInstanceOf[js.Any]))
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAnalysisPermissionsResponse]
    }
  }

  @js.native
  trait DescribeAnalysisRequest extends js.Object {
    var AnalysisId: RestrictiveResourceId
    var AwsAccountId: AwsAccountId
  }

  object DescribeAnalysisRequest {
    @inline
    def apply(
        AnalysisId: RestrictiveResourceId,
        AwsAccountId: AwsAccountId
    ): DescribeAnalysisRequest = {
      val __obj = js.Dynamic.literal(
        "AnalysisId" -> AnalysisId.asInstanceOf[js.Any],
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAnalysisRequest]
    }
  }

  @js.native
  trait DescribeAnalysisResponse extends js.Object {
    var Analysis: js.UndefOr[Analysis]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DescribeAnalysisResponse {
    @inline
    def apply(
        Analysis: js.UndefOr[Analysis] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DescribeAnalysisResponse = {
      val __obj = js.Dynamic.literal()
      Analysis.foreach(__v => __obj.updateDynamic("Analysis")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAnalysisResponse]
    }
  }

  @js.native
  trait DescribeDashboardPermissionsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DashboardId: RestrictiveResourceId
  }

  object DescribeDashboardPermissionsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DashboardId: RestrictiveResourceId
    ): DescribeDashboardPermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "DashboardId" -> DashboardId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDashboardPermissionsRequest]
    }
  }

  @js.native
  trait DescribeDashboardPermissionsResponse extends js.Object {
    var DashboardArn: js.UndefOr[Arn]
    var DashboardId: js.UndefOr[RestrictiveResourceId]
    var LinkSharingConfiguration: js.UndefOr[LinkSharingConfiguration]
    var Permissions: js.UndefOr[ResourcePermissionList]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DescribeDashboardPermissionsResponse {
    @inline
    def apply(
        DashboardArn: js.UndefOr[Arn] = js.undefined,
        DashboardId: js.UndefOr[RestrictiveResourceId] = js.undefined,
        LinkSharingConfiguration: js.UndefOr[LinkSharingConfiguration] = js.undefined,
        Permissions: js.UndefOr[ResourcePermissionList] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DescribeDashboardPermissionsResponse = {
      val __obj = js.Dynamic.literal()
      DashboardArn.foreach(__v => __obj.updateDynamic("DashboardArn")(__v.asInstanceOf[js.Any]))
      DashboardId.foreach(__v => __obj.updateDynamic("DashboardId")(__v.asInstanceOf[js.Any]))
      LinkSharingConfiguration.foreach(__v => __obj.updateDynamic("LinkSharingConfiguration")(__v.asInstanceOf[js.Any]))
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDashboardPermissionsResponse]
    }
  }

  @js.native
  trait DescribeDashboardRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DashboardId: RestrictiveResourceId
    var AliasName: js.UndefOr[AliasName]
    var VersionNumber: js.UndefOr[VersionNumber]
  }

  object DescribeDashboardRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DashboardId: RestrictiveResourceId,
        AliasName: js.UndefOr[AliasName] = js.undefined,
        VersionNumber: js.UndefOr[VersionNumber] = js.undefined
    ): DescribeDashboardRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "DashboardId" -> DashboardId.asInstanceOf[js.Any]
      )

      AliasName.foreach(__v => __obj.updateDynamic("AliasName")(__v.asInstanceOf[js.Any]))
      VersionNumber.foreach(__v => __obj.updateDynamic("VersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDashboardRequest]
    }
  }

  @js.native
  trait DescribeDashboardResponse extends js.Object {
    var Dashboard: js.UndefOr[Dashboard]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DescribeDashboardResponse {
    @inline
    def apply(
        Dashboard: js.UndefOr[Dashboard] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DescribeDashboardResponse = {
      val __obj = js.Dynamic.literal()
      Dashboard.foreach(__v => __obj.updateDynamic("Dashboard")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDashboardResponse]
    }
  }

  @js.native
  trait DescribeDataSetPermissionsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DataSetId: ResourceId
  }

  object DescribeDataSetPermissionsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DataSetId: ResourceId
    ): DescribeDataSetPermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "DataSetId" -> DataSetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDataSetPermissionsRequest]
    }
  }

  @js.native
  trait DescribeDataSetPermissionsResponse extends js.Object {
    var DataSetArn: js.UndefOr[Arn]
    var DataSetId: js.UndefOr[ResourceId]
    var Permissions: js.UndefOr[ResourcePermissionList]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DescribeDataSetPermissionsResponse {
    @inline
    def apply(
        DataSetArn: js.UndefOr[Arn] = js.undefined,
        DataSetId: js.UndefOr[ResourceId] = js.undefined,
        Permissions: js.UndefOr[ResourcePermissionList] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DescribeDataSetPermissionsResponse = {
      val __obj = js.Dynamic.literal()
      DataSetArn.foreach(__v => __obj.updateDynamic("DataSetArn")(__v.asInstanceOf[js.Any]))
      DataSetId.foreach(__v => __obj.updateDynamic("DataSetId")(__v.asInstanceOf[js.Any]))
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDataSetPermissionsResponse]
    }
  }

  @js.native
  trait DescribeDataSetRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DataSetId: ResourceId
  }

  object DescribeDataSetRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DataSetId: ResourceId
    ): DescribeDataSetRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "DataSetId" -> DataSetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDataSetRequest]
    }
  }

  @js.native
  trait DescribeDataSetResponse extends js.Object {
    var DataSet: js.UndefOr[DataSet]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DescribeDataSetResponse {
    @inline
    def apply(
        DataSet: js.UndefOr[DataSet] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DescribeDataSetResponse = {
      val __obj = js.Dynamic.literal()
      DataSet.foreach(__v => __obj.updateDynamic("DataSet")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDataSetResponse]
    }
  }

  @js.native
  trait DescribeDataSourcePermissionsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DataSourceId: ResourceId
  }

  object DescribeDataSourcePermissionsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DataSourceId: ResourceId
    ): DescribeDataSourcePermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "DataSourceId" -> DataSourceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDataSourcePermissionsRequest]
    }
  }

  @js.native
  trait DescribeDataSourcePermissionsResponse extends js.Object {
    var DataSourceArn: js.UndefOr[Arn]
    var DataSourceId: js.UndefOr[ResourceId]
    var Permissions: js.UndefOr[ResourcePermissionList]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DescribeDataSourcePermissionsResponse {
    @inline
    def apply(
        DataSourceArn: js.UndefOr[Arn] = js.undefined,
        DataSourceId: js.UndefOr[ResourceId] = js.undefined,
        Permissions: js.UndefOr[ResourcePermissionList] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DescribeDataSourcePermissionsResponse = {
      val __obj = js.Dynamic.literal()
      DataSourceArn.foreach(__v => __obj.updateDynamic("DataSourceArn")(__v.asInstanceOf[js.Any]))
      DataSourceId.foreach(__v => __obj.updateDynamic("DataSourceId")(__v.asInstanceOf[js.Any]))
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDataSourcePermissionsResponse]
    }
  }

  @js.native
  trait DescribeDataSourceRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DataSourceId: ResourceId
  }

  object DescribeDataSourceRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DataSourceId: ResourceId
    ): DescribeDataSourceRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "DataSourceId" -> DataSourceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDataSourceRequest]
    }
  }

  @js.native
  trait DescribeDataSourceResponse extends js.Object {
    var DataSource: js.UndefOr[DataSource]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DescribeDataSourceResponse {
    @inline
    def apply(
        DataSource: js.UndefOr[DataSource] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DescribeDataSourceResponse = {
      val __obj = js.Dynamic.literal()
      DataSource.foreach(__v => __obj.updateDynamic("DataSource")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDataSourceResponse]
    }
  }

  @js.native
  trait DescribeFolderPermissionsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var FolderId: RestrictiveResourceId
  }

  object DescribeFolderPermissionsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        FolderId: RestrictiveResourceId
    ): DescribeFolderPermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "FolderId" -> FolderId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeFolderPermissionsRequest]
    }
  }

  @js.native
  trait DescribeFolderPermissionsResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var FolderId: js.UndefOr[RestrictiveResourceId]
    var Permissions: js.UndefOr[ResourcePermissionList]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DescribeFolderPermissionsResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        FolderId: js.UndefOr[RestrictiveResourceId] = js.undefined,
        Permissions: js.UndefOr[ResourcePermissionList] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DescribeFolderPermissionsResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      FolderId.foreach(__v => __obj.updateDynamic("FolderId")(__v.asInstanceOf[js.Any]))
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFolderPermissionsResponse]
    }
  }

  @js.native
  trait DescribeFolderRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var FolderId: RestrictiveResourceId
  }

  object DescribeFolderRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        FolderId: RestrictiveResourceId
    ): DescribeFolderRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "FolderId" -> FolderId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeFolderRequest]
    }
  }

  @js.native
  trait DescribeFolderResolvedPermissionsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var FolderId: RestrictiveResourceId
  }

  object DescribeFolderResolvedPermissionsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        FolderId: RestrictiveResourceId
    ): DescribeFolderResolvedPermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "FolderId" -> FolderId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeFolderResolvedPermissionsRequest]
    }
  }

  @js.native
  trait DescribeFolderResolvedPermissionsResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var FolderId: js.UndefOr[RestrictiveResourceId]
    var Permissions: js.UndefOr[ResourcePermissionList]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DescribeFolderResolvedPermissionsResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        FolderId: js.UndefOr[RestrictiveResourceId] = js.undefined,
        Permissions: js.UndefOr[ResourcePermissionList] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DescribeFolderResolvedPermissionsResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      FolderId.foreach(__v => __obj.updateDynamic("FolderId")(__v.asInstanceOf[js.Any]))
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFolderResolvedPermissionsResponse]
    }
  }

  @js.native
  trait DescribeFolderResponse extends js.Object {
    var Folder: js.UndefOr[Folder]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DescribeFolderResponse {
    @inline
    def apply(
        Folder: js.UndefOr[Folder] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DescribeFolderResponse = {
      val __obj = js.Dynamic.literal()
      Folder.foreach(__v => __obj.updateDynamic("Folder")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFolderResponse]
    }
  }

  @js.native
  trait DescribeGroupRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var GroupName: GroupName
    var Namespace: Namespace
  }

  object DescribeGroupRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        GroupName: GroupName,
        Namespace: Namespace
    ): DescribeGroupRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "GroupName" -> GroupName.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeGroupRequest]
    }
  }

  @js.native
  trait DescribeGroupResponse extends js.Object {
    var Group: js.UndefOr[Group]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DescribeGroupResponse {
    @inline
    def apply(
        Group: js.UndefOr[Group] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DescribeGroupResponse = {
      val __obj = js.Dynamic.literal()
      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeGroupResponse]
    }
  }

  @js.native
  trait DescribeIAMPolicyAssignmentRequest extends js.Object {
    var AssignmentName: IAMPolicyAssignmentName
    var AwsAccountId: AwsAccountId
    var Namespace: Namespace
  }

  object DescribeIAMPolicyAssignmentRequest {
    @inline
    def apply(
        AssignmentName: IAMPolicyAssignmentName,
        AwsAccountId: AwsAccountId,
        Namespace: Namespace
    ): DescribeIAMPolicyAssignmentRequest = {
      val __obj = js.Dynamic.literal(
        "AssignmentName" -> AssignmentName.asInstanceOf[js.Any],
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeIAMPolicyAssignmentRequest]
    }
  }

  @js.native
  trait DescribeIAMPolicyAssignmentResponse extends js.Object {
    var IAMPolicyAssignment: js.UndefOr[IAMPolicyAssignment]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DescribeIAMPolicyAssignmentResponse {
    @inline
    def apply(
        IAMPolicyAssignment: js.UndefOr[IAMPolicyAssignment] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DescribeIAMPolicyAssignmentResponse = {
      val __obj = js.Dynamic.literal()
      IAMPolicyAssignment.foreach(__v => __obj.updateDynamic("IAMPolicyAssignment")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeIAMPolicyAssignmentResponse]
    }
  }

  @js.native
  trait DescribeIngestionRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DataSetId: String
    var IngestionId: IngestionId
  }

  object DescribeIngestionRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DataSetId: String,
        IngestionId: IngestionId
    ): DescribeIngestionRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "DataSetId" -> DataSetId.asInstanceOf[js.Any],
        "IngestionId" -> IngestionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeIngestionRequest]
    }
  }

  @js.native
  trait DescribeIngestionResponse extends js.Object {
    var Ingestion: js.UndefOr[Ingestion]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DescribeIngestionResponse {
    @inline
    def apply(
        Ingestion: js.UndefOr[Ingestion] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DescribeIngestionResponse = {
      val __obj = js.Dynamic.literal()
      Ingestion.foreach(__v => __obj.updateDynamic("Ingestion")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeIngestionResponse]
    }
  }

  @js.native
  trait DescribeIpRestrictionRequest extends js.Object {
    var AwsAccountId: AwsAccountId
  }

  object DescribeIpRestrictionRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId
    ): DescribeIpRestrictionRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeIpRestrictionRequest]
    }
  }

  @js.native
  trait DescribeIpRestrictionResponse extends js.Object {
    var AwsAccountId: js.UndefOr[AwsAccountId]
    var Enabled: js.UndefOr[NullableBoolean]
    var IpRestrictionRuleMap: js.UndefOr[IpRestrictionRuleMap]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DescribeIpRestrictionResponse {
    @inline
    def apply(
        AwsAccountId: js.UndefOr[AwsAccountId] = js.undefined,
        Enabled: js.UndefOr[NullableBoolean] = js.undefined,
        IpRestrictionRuleMap: js.UndefOr[IpRestrictionRuleMap] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DescribeIpRestrictionResponse = {
      val __obj = js.Dynamic.literal()
      AwsAccountId.foreach(__v => __obj.updateDynamic("AwsAccountId")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      IpRestrictionRuleMap.foreach(__v => __obj.updateDynamic("IpRestrictionRuleMap")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeIpRestrictionResponse]
    }
  }

  @js.native
  trait DescribeNamespaceRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Namespace: Namespace
  }

  object DescribeNamespaceRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        Namespace: Namespace
    ): DescribeNamespaceRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeNamespaceRequest]
    }
  }

  @js.native
  trait DescribeNamespaceResponse extends js.Object {
    var Namespace: js.UndefOr[NamespaceInfoV2]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DescribeNamespaceResponse {
    @inline
    def apply(
        Namespace: js.UndefOr[NamespaceInfoV2] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DescribeNamespaceResponse = {
      val __obj = js.Dynamic.literal()
      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeNamespaceResponse]
    }
  }

  @js.native
  trait DescribeTemplateAliasRequest extends js.Object {
    var AliasName: AliasName
    var AwsAccountId: AwsAccountId
    var TemplateId: RestrictiveResourceId
  }

  object DescribeTemplateAliasRequest {
    @inline
    def apply(
        AliasName: AliasName,
        AwsAccountId: AwsAccountId,
        TemplateId: RestrictiveResourceId
    ): DescribeTemplateAliasRequest = {
      val __obj = js.Dynamic.literal(
        "AliasName" -> AliasName.asInstanceOf[js.Any],
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "TemplateId" -> TemplateId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeTemplateAliasRequest]
    }
  }

  @js.native
  trait DescribeTemplateAliasResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var TemplateAlias: js.UndefOr[TemplateAlias]
  }

  object DescribeTemplateAliasResponse {
    @inline
    def apply(
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        TemplateAlias: js.UndefOr[TemplateAlias] = js.undefined
    ): DescribeTemplateAliasResponse = {
      val __obj = js.Dynamic.literal()
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TemplateAlias.foreach(__v => __obj.updateDynamic("TemplateAlias")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTemplateAliasResponse]
    }
  }

  @js.native
  trait DescribeTemplatePermissionsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var TemplateId: RestrictiveResourceId
  }

  object DescribeTemplatePermissionsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        TemplateId: RestrictiveResourceId
    ): DescribeTemplatePermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "TemplateId" -> TemplateId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeTemplatePermissionsRequest]
    }
  }

  @js.native
  trait DescribeTemplatePermissionsResponse extends js.Object {
    var Permissions: js.UndefOr[ResourcePermissionList]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var TemplateArn: js.UndefOr[Arn]
    var TemplateId: js.UndefOr[RestrictiveResourceId]
  }

  object DescribeTemplatePermissionsResponse {
    @inline
    def apply(
        Permissions: js.UndefOr[ResourcePermissionList] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        TemplateArn: js.UndefOr[Arn] = js.undefined,
        TemplateId: js.UndefOr[RestrictiveResourceId] = js.undefined
    ): DescribeTemplatePermissionsResponse = {
      val __obj = js.Dynamic.literal()
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TemplateArn.foreach(__v => __obj.updateDynamic("TemplateArn")(__v.asInstanceOf[js.Any]))
      TemplateId.foreach(__v => __obj.updateDynamic("TemplateId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTemplatePermissionsResponse]
    }
  }

  @js.native
  trait DescribeTemplateRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var TemplateId: RestrictiveResourceId
    var AliasName: js.UndefOr[AliasName]
    var VersionNumber: js.UndefOr[VersionNumber]
  }

  object DescribeTemplateRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        TemplateId: RestrictiveResourceId,
        AliasName: js.UndefOr[AliasName] = js.undefined,
        VersionNumber: js.UndefOr[VersionNumber] = js.undefined
    ): DescribeTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "TemplateId" -> TemplateId.asInstanceOf[js.Any]
      )

      AliasName.foreach(__v => __obj.updateDynamic("AliasName")(__v.asInstanceOf[js.Any]))
      VersionNumber.foreach(__v => __obj.updateDynamic("VersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTemplateRequest]
    }
  }

  @js.native
  trait DescribeTemplateResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var Template: js.UndefOr[Template]
  }

  object DescribeTemplateResponse {
    @inline
    def apply(
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        Template: js.UndefOr[Template] = js.undefined
    ): DescribeTemplateResponse = {
      val __obj = js.Dynamic.literal()
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Template.foreach(__v => __obj.updateDynamic("Template")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTemplateResponse]
    }
  }

  @js.native
  trait DescribeThemeAliasRequest extends js.Object {
    var AliasName: AliasName
    var AwsAccountId: AwsAccountId
    var ThemeId: RestrictiveResourceId
  }

  object DescribeThemeAliasRequest {
    @inline
    def apply(
        AliasName: AliasName,
        AwsAccountId: AwsAccountId,
        ThemeId: RestrictiveResourceId
    ): DescribeThemeAliasRequest = {
      val __obj = js.Dynamic.literal(
        "AliasName" -> AliasName.asInstanceOf[js.Any],
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "ThemeId" -> ThemeId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeThemeAliasRequest]
    }
  }

  @js.native
  trait DescribeThemeAliasResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var ThemeAlias: js.UndefOr[ThemeAlias]
  }

  object DescribeThemeAliasResponse {
    @inline
    def apply(
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        ThemeAlias: js.UndefOr[ThemeAlias] = js.undefined
    ): DescribeThemeAliasResponse = {
      val __obj = js.Dynamic.literal()
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      ThemeAlias.foreach(__v => __obj.updateDynamic("ThemeAlias")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeThemeAliasResponse]
    }
  }

  @js.native
  trait DescribeThemePermissionsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var ThemeId: RestrictiveResourceId
  }

  object DescribeThemePermissionsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        ThemeId: RestrictiveResourceId
    ): DescribeThemePermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "ThemeId" -> ThemeId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeThemePermissionsRequest]
    }
  }

  @js.native
  trait DescribeThemePermissionsResponse extends js.Object {
    var Permissions: js.UndefOr[ResourcePermissionList]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var ThemeArn: js.UndefOr[Arn]
    var ThemeId: js.UndefOr[RestrictiveResourceId]
  }

  object DescribeThemePermissionsResponse {
    @inline
    def apply(
        Permissions: js.UndefOr[ResourcePermissionList] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        ThemeArn: js.UndefOr[Arn] = js.undefined,
        ThemeId: js.UndefOr[RestrictiveResourceId] = js.undefined
    ): DescribeThemePermissionsResponse = {
      val __obj = js.Dynamic.literal()
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      ThemeArn.foreach(__v => __obj.updateDynamic("ThemeArn")(__v.asInstanceOf[js.Any]))
      ThemeId.foreach(__v => __obj.updateDynamic("ThemeId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeThemePermissionsResponse]
    }
  }

  @js.native
  trait DescribeThemeRequest extends js.Object {
    var AwsAccountId: AwsAndAccountId
    var ThemeId: RestrictiveResourceId
    var AliasName: js.UndefOr[AliasName]
    var VersionNumber: js.UndefOr[VersionNumber]
  }

  object DescribeThemeRequest {
    @inline
    def apply(
        AwsAccountId: AwsAndAccountId,
        ThemeId: RestrictiveResourceId,
        AliasName: js.UndefOr[AliasName] = js.undefined,
        VersionNumber: js.UndefOr[VersionNumber] = js.undefined
    ): DescribeThemeRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "ThemeId" -> ThemeId.asInstanceOf[js.Any]
      )

      AliasName.foreach(__v => __obj.updateDynamic("AliasName")(__v.asInstanceOf[js.Any]))
      VersionNumber.foreach(__v => __obj.updateDynamic("VersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeThemeRequest]
    }
  }

  @js.native
  trait DescribeThemeResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var Theme: js.UndefOr[Theme]
  }

  object DescribeThemeResponse {
    @inline
    def apply(
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        Theme: js.UndefOr[Theme] = js.undefined
    ): DescribeThemeResponse = {
      val __obj = js.Dynamic.literal()
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Theme.foreach(__v => __obj.updateDynamic("Theme")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeThemeResponse]
    }
  }

  @js.native
  trait DescribeUserRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Namespace: Namespace
    var UserName: UserName
  }

  object DescribeUserRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        Namespace: Namespace,
        UserName: UserName
    ): DescribeUserRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeUserRequest]
    }
  }

  @js.native
  trait DescribeUserResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var User: js.UndefOr[User]
  }

  object DescribeUserResponse {
    @inline
    def apply(
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        User: js.UndefOr[User] = js.undefined
    ): DescribeUserResponse = {
      val __obj = js.Dynamic.literal()
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      User.foreach(__v => __obj.updateDynamic("User")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeUserResponse]
    }
  }

  /** Error information for the SPICE ingestion of a dataset.
    */
  @js.native
  trait ErrorInfo extends js.Object {
    var Message: js.UndefOr[String]
    var Type: js.UndefOr[IngestionErrorType]
  }

  object ErrorInfo {
    @inline
    def apply(
        Message: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[IngestionErrorType] = js.undefined
    ): ErrorInfo = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ErrorInfo]
    }
  }

  /** The required parameters for connecting to an Exasol data source.
    */
  @js.native
  trait ExasolParameters extends js.Object {
    var Host: Host
    var Port: Port
  }

  object ExasolParameters {
    @inline
    def apply(
        Host: Host,
        Port: Port
    ): ExasolParameters = {
      val __obj = js.Dynamic.literal(
        "Host" -> Host.asInstanceOf[js.Any],
        "Port" -> Port.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ExasolParameters]
    }
  }

  /** Export to .csv option.
    */
  @js.native
  trait ExportToCSVOption extends js.Object {
    var AvailabilityStatus: js.UndefOr[DashboardBehavior]
  }

  object ExportToCSVOption {
    @inline
    def apply(
        AvailabilityStatus: js.UndefOr[DashboardBehavior] = js.undefined
    ): ExportToCSVOption = {
      val __obj = js.Dynamic.literal()
      AvailabilityStatus.foreach(__v => __obj.updateDynamic("AvailabilityStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportToCSVOption]
    }
  }

  /** A FieldFolder element is a folder that contains fields and nested subfolders.
    */
  @js.native
  trait FieldFolder extends js.Object {
    var columns: js.UndefOr[FolderColumnList]
    var description: js.UndefOr[FieldFolderDescription]
  }

  object FieldFolder {
    @inline
    def apply(
        columns: js.UndefOr[FolderColumnList] = js.undefined,
        description: js.UndefOr[FieldFolderDescription] = js.undefined
    ): FieldFolder = {
      val __obj = js.Dynamic.literal()
      columns.foreach(__v => __obj.updateDynamic("columns")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FieldFolder]
    }
  }

  /** A transform operation that filters rows based on a condition.
    */
  @js.native
  trait FilterOperation extends js.Object {
    var ConditionExpression: Expression
  }

  object FilterOperation {
    @inline
    def apply(
        ConditionExpression: Expression
    ): FilterOperation = {
      val __obj = js.Dynamic.literal(
        "ConditionExpression" -> ConditionExpression.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FilterOperation]
    }
  }

  /** A folder in Amazon QuickSight.
    */
  @js.native
  trait Folder extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreatedTime: js.UndefOr[Timestamp]
    var FolderId: js.UndefOr[RestrictiveResourceId]
    var FolderPath: js.UndefOr[Path]
    var FolderType: js.UndefOr[FolderType]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[FolderName]
  }

  object Folder {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        FolderId: js.UndefOr[RestrictiveResourceId] = js.undefined,
        FolderPath: js.UndefOr[Path] = js.undefined,
        FolderType: js.UndefOr[FolderType] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[FolderName] = js.undefined
    ): Folder = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      FolderId.foreach(__v => __obj.updateDynamic("FolderId")(__v.asInstanceOf[js.Any]))
      FolderPath.foreach(__v => __obj.updateDynamic("FolderPath")(__v.asInstanceOf[js.Any]))
      FolderType.foreach(__v => __obj.updateDynamic("FolderType")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Folder]
    }
  }

  /** An asset in a Amazon QuickSight folder, such as a dashboard, analysis, or dataset.
    */
  @js.native
  trait FolderMember extends js.Object {
    var MemberId: js.UndefOr[RestrictiveResourceId]
    var MemberType: js.UndefOr[MemberType]
  }

  object FolderMember {
    @inline
    def apply(
        MemberId: js.UndefOr[RestrictiveResourceId] = js.undefined,
        MemberType: js.UndefOr[MemberType] = js.undefined
    ): FolderMember = {
      val __obj = js.Dynamic.literal()
      MemberId.foreach(__v => __obj.updateDynamic("MemberId")(__v.asInstanceOf[js.Any]))
      MemberType.foreach(__v => __obj.updateDynamic("MemberType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FolderMember]
    }
  }

  /** A filter to use to search a Amazon QuickSight folder.
    */
  @js.native
  trait FolderSearchFilter extends js.Object {
    var Name: js.UndefOr[FolderFilterAttribute]
    var Operator: js.UndefOr[FilterOperator]
    var Value: js.UndefOr[String]
  }

  object FolderSearchFilter {
    @inline
    def apply(
        Name: js.UndefOr[FolderFilterAttribute] = js.undefined,
        Operator: js.UndefOr[FilterOperator] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): FolderSearchFilter = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Operator.foreach(__v => __obj.updateDynamic("Operator")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FolderSearchFilter]
    }
  }

  /** A summary of information about an existing Amazon QuickSight folder.
    */
  @js.native
  trait FolderSummary extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreatedTime: js.UndefOr[Timestamp]
    var FolderId: js.UndefOr[RestrictiveResourceId]
    var FolderType: js.UndefOr[FolderType]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[FolderName]
  }

  object FolderSummary {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        FolderId: js.UndefOr[RestrictiveResourceId] = js.undefined,
        FolderType: js.UndefOr[FolderType] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[FolderName] = js.undefined
    ): FolderSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      FolderId.foreach(__v => __obj.updateDynamic("FolderId")(__v.asInstanceOf[js.Any]))
      FolderType.foreach(__v => __obj.updateDynamic("FolderType")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FolderSummary]
    }
  }

  @js.native
  trait GenerateEmbedUrlForAnonymousUserRequest extends js.Object {
    var AuthorizedResourceArns: ArnList
    var AwsAccountId: AwsAccountId
    var ExperienceConfiguration: AnonymousUserEmbeddingExperienceConfiguration
    var Namespace: Namespace
    var SessionLifetimeInMinutes: js.UndefOr[SessionLifetimeInMinutes]
    var SessionTags: js.UndefOr[SessionTagList]
  }

  object GenerateEmbedUrlForAnonymousUserRequest {
    @inline
    def apply(
        AuthorizedResourceArns: ArnList,
        AwsAccountId: AwsAccountId,
        ExperienceConfiguration: AnonymousUserEmbeddingExperienceConfiguration,
        Namespace: Namespace,
        SessionLifetimeInMinutes: js.UndefOr[SessionLifetimeInMinutes] = js.undefined,
        SessionTags: js.UndefOr[SessionTagList] = js.undefined
    ): GenerateEmbedUrlForAnonymousUserRequest = {
      val __obj = js.Dynamic.literal(
        "AuthorizedResourceArns" -> AuthorizedResourceArns.asInstanceOf[js.Any],
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "ExperienceConfiguration" -> ExperienceConfiguration.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any]
      )

      SessionLifetimeInMinutes.foreach(__v => __obj.updateDynamic("SessionLifetimeInMinutes")(__v.asInstanceOf[js.Any]))
      SessionTags.foreach(__v => __obj.updateDynamic("SessionTags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GenerateEmbedUrlForAnonymousUserRequest]
    }
  }

  @js.native
  trait GenerateEmbedUrlForAnonymousUserResponse extends js.Object {
    var EmbedUrl: EmbeddingUrl
    var RequestId: String
    var Status: StatusCode
  }

  object GenerateEmbedUrlForAnonymousUserResponse {
    @inline
    def apply(
        EmbedUrl: EmbeddingUrl,
        RequestId: String,
        Status: StatusCode
    ): GenerateEmbedUrlForAnonymousUserResponse = {
      val __obj = js.Dynamic.literal(
        "EmbedUrl" -> EmbedUrl.asInstanceOf[js.Any],
        "RequestId" -> RequestId.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GenerateEmbedUrlForAnonymousUserResponse]
    }
  }

  @js.native
  trait GenerateEmbedUrlForRegisteredUserRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var ExperienceConfiguration: RegisteredUserEmbeddingExperienceConfiguration
    var UserArn: Arn
    var SessionLifetimeInMinutes: js.UndefOr[SessionLifetimeInMinutes]
  }

  object GenerateEmbedUrlForRegisteredUserRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        ExperienceConfiguration: RegisteredUserEmbeddingExperienceConfiguration,
        UserArn: Arn,
        SessionLifetimeInMinutes: js.UndefOr[SessionLifetimeInMinutes] = js.undefined
    ): GenerateEmbedUrlForRegisteredUserRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "ExperienceConfiguration" -> ExperienceConfiguration.asInstanceOf[js.Any],
        "UserArn" -> UserArn.asInstanceOf[js.Any]
      )

      SessionLifetimeInMinutes.foreach(__v => __obj.updateDynamic("SessionLifetimeInMinutes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GenerateEmbedUrlForRegisteredUserRequest]
    }
  }

  @js.native
  trait GenerateEmbedUrlForRegisteredUserResponse extends js.Object {
    var EmbedUrl: EmbeddingUrl
    var RequestId: String
    var Status: StatusCode
  }

  object GenerateEmbedUrlForRegisteredUserResponse {
    @inline
    def apply(
        EmbedUrl: EmbeddingUrl,
        RequestId: String,
        Status: StatusCode
    ): GenerateEmbedUrlForRegisteredUserResponse = {
      val __obj = js.Dynamic.literal(
        "EmbedUrl" -> EmbedUrl.asInstanceOf[js.Any],
        "RequestId" -> RequestId.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GenerateEmbedUrlForRegisteredUserResponse]
    }
  }

  /** Geospatial column group that denotes a hierarchy.
    */
  @js.native
  trait GeoSpatialColumnGroup extends js.Object {
    var Columns: ColumnList
    var CountryCode: GeoSpatialCountryCode
    var Name: ColumnGroupName
  }

  object GeoSpatialColumnGroup {
    @inline
    def apply(
        Columns: ColumnList,
        CountryCode: GeoSpatialCountryCode,
        Name: ColumnGroupName
    ): GeoSpatialColumnGroup = {
      val __obj = js.Dynamic.literal(
        "Columns" -> Columns.asInstanceOf[js.Any],
        "CountryCode" -> CountryCode.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GeoSpatialColumnGroup]
    }
  }

  @js.native
  trait GetDashboardEmbedUrlRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DashboardId: RestrictiveResourceId
    var IdentityType: EmbeddingIdentityType
    var AdditionalDashboardIds: js.UndefOr[AdditionalDashboardIdList]
    var Namespace: js.UndefOr[Namespace]
    var ResetDisabled: js.UndefOr[Boolean]
    var SessionLifetimeInMinutes: js.UndefOr[SessionLifetimeInMinutes]
    var StatePersistenceEnabled: js.UndefOr[Boolean]
    var UndoRedoDisabled: js.UndefOr[Boolean]
    var UserArn: js.UndefOr[Arn]
  }

  object GetDashboardEmbedUrlRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DashboardId: RestrictiveResourceId,
        IdentityType: EmbeddingIdentityType,
        AdditionalDashboardIds: js.UndefOr[AdditionalDashboardIdList] = js.undefined,
        Namespace: js.UndefOr[Namespace] = js.undefined,
        ResetDisabled: js.UndefOr[Boolean] = js.undefined,
        SessionLifetimeInMinutes: js.UndefOr[SessionLifetimeInMinutes] = js.undefined,
        StatePersistenceEnabled: js.UndefOr[Boolean] = js.undefined,
        UndoRedoDisabled: js.UndefOr[Boolean] = js.undefined,
        UserArn: js.UndefOr[Arn] = js.undefined
    ): GetDashboardEmbedUrlRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "DashboardId" -> DashboardId.asInstanceOf[js.Any],
        "IdentityType" -> IdentityType.asInstanceOf[js.Any]
      )

      AdditionalDashboardIds.foreach(__v => __obj.updateDynamic("AdditionalDashboardIds")(__v.asInstanceOf[js.Any]))
      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      ResetDisabled.foreach(__v => __obj.updateDynamic("ResetDisabled")(__v.asInstanceOf[js.Any]))
      SessionLifetimeInMinutes.foreach(__v => __obj.updateDynamic("SessionLifetimeInMinutes")(__v.asInstanceOf[js.Any]))
      StatePersistenceEnabled.foreach(__v => __obj.updateDynamic("StatePersistenceEnabled")(__v.asInstanceOf[js.Any]))
      UndoRedoDisabled.foreach(__v => __obj.updateDynamic("UndoRedoDisabled")(__v.asInstanceOf[js.Any]))
      UserArn.foreach(__v => __obj.updateDynamic("UserArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDashboardEmbedUrlRequest]
    }
  }

  /** Output returned from the <code>GetDashboardEmbedUrl</code> operation.
    */
  @js.native
  trait GetDashboardEmbedUrlResponse extends js.Object {
    var EmbedUrl: js.UndefOr[EmbeddingUrl]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object GetDashboardEmbedUrlResponse {
    @inline
    def apply(
        EmbedUrl: js.UndefOr[EmbeddingUrl] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): GetDashboardEmbedUrlResponse = {
      val __obj = js.Dynamic.literal()
      EmbedUrl.foreach(__v => __obj.updateDynamic("EmbedUrl")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDashboardEmbedUrlResponse]
    }
  }

  @js.native
  trait GetSessionEmbedUrlRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var EntryPoint: js.UndefOr[EntryPoint]
    var SessionLifetimeInMinutes: js.UndefOr[SessionLifetimeInMinutes]
    var UserArn: js.UndefOr[Arn]
  }

  object GetSessionEmbedUrlRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        EntryPoint: js.UndefOr[EntryPoint] = js.undefined,
        SessionLifetimeInMinutes: js.UndefOr[SessionLifetimeInMinutes] = js.undefined,
        UserArn: js.UndefOr[Arn] = js.undefined
    ): GetSessionEmbedUrlRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any]
      )

      EntryPoint.foreach(__v => __obj.updateDynamic("EntryPoint")(__v.asInstanceOf[js.Any]))
      SessionLifetimeInMinutes.foreach(__v => __obj.updateDynamic("SessionLifetimeInMinutes")(__v.asInstanceOf[js.Any]))
      UserArn.foreach(__v => __obj.updateDynamic("UserArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSessionEmbedUrlRequest]
    }
  }

  @js.native
  trait GetSessionEmbedUrlResponse extends js.Object {
    var EmbedUrl: js.UndefOr[EmbeddingUrl]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object GetSessionEmbedUrlResponse {
    @inline
    def apply(
        EmbedUrl: js.UndefOr[EmbeddingUrl] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): GetSessionEmbedUrlResponse = {
      val __obj = js.Dynamic.literal()
      EmbedUrl.foreach(__v => __obj.updateDynamic("EmbedUrl")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSessionEmbedUrlResponse]
    }
  }

  /** A <i>group</i> in Amazon QuickSight consists of a set of users. You can use groups to make it easier to manage access and security.
    */
  @js.native
  trait Group extends js.Object {
    var Arn: js.UndefOr[Arn]
    var Description: js.UndefOr[GroupDescription]
    var GroupName: js.UndefOr[GroupName]
    var PrincipalId: js.UndefOr[String]
  }

  object Group {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        Description: js.UndefOr[GroupDescription] = js.undefined,
        GroupName: js.UndefOr[GroupName] = js.undefined,
        PrincipalId: js.UndefOr[String] = js.undefined
    ): Group = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      PrincipalId.foreach(__v => __obj.updateDynamic("PrincipalId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Group]
    }
  }

  /** A member of an Amazon QuickSight group. Currently, group members must be users. Groups can't be members of another group. .
    */
  @js.native
  trait GroupMember extends js.Object {
    var Arn: js.UndefOr[Arn]
    var MemberName: js.UndefOr[GroupMemberName]
  }

  object GroupMember {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        MemberName: js.UndefOr[GroupMemberName] = js.undefined
    ): GroupMember = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      MemberName.foreach(__v => __obj.updateDynamic("MemberName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GroupMember]
    }
  }

  /** The display options for gutter spacing between tiles on a sheet.
    */
  @js.native
  trait GutterStyle extends js.Object {
    var Show: js.UndefOr[Boolean]
  }

  object GutterStyle {
    @inline
    def apply(
        Show: js.UndefOr[Boolean] = js.undefined
    ): GutterStyle = {
      val __obj = js.Dynamic.literal()
      Show.foreach(__v => __obj.updateDynamic("Show")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GutterStyle]
    }
  }

  /** An Identity and Access Management (IAM) policy assignment.
    */
  @js.native
  trait IAMPolicyAssignment extends js.Object {
    var AssignmentId: js.UndefOr[String]
    var AssignmentName: js.UndefOr[IAMPolicyAssignmentName]
    var AssignmentStatus: js.UndefOr[AssignmentStatus]
    var AwsAccountId: js.UndefOr[AwsAccountId]
    var Identities: js.UndefOr[IdentityMap]
    var PolicyArn: js.UndefOr[Arn]
  }

  object IAMPolicyAssignment {
    @inline
    def apply(
        AssignmentId: js.UndefOr[String] = js.undefined,
        AssignmentName: js.UndefOr[IAMPolicyAssignmentName] = js.undefined,
        AssignmentStatus: js.UndefOr[AssignmentStatus] = js.undefined,
        AwsAccountId: js.UndefOr[AwsAccountId] = js.undefined,
        Identities: js.UndefOr[IdentityMap] = js.undefined,
        PolicyArn: js.UndefOr[Arn] = js.undefined
    ): IAMPolicyAssignment = {
      val __obj = js.Dynamic.literal()
      AssignmentId.foreach(__v => __obj.updateDynamic("AssignmentId")(__v.asInstanceOf[js.Any]))
      AssignmentName.foreach(__v => __obj.updateDynamic("AssignmentName")(__v.asInstanceOf[js.Any]))
      AssignmentStatus.foreach(__v => __obj.updateDynamic("AssignmentStatus")(__v.asInstanceOf[js.Any]))
      AwsAccountId.foreach(__v => __obj.updateDynamic("AwsAccountId")(__v.asInstanceOf[js.Any]))
      Identities.foreach(__v => __obj.updateDynamic("Identities")(__v.asInstanceOf[js.Any]))
      PolicyArn.foreach(__v => __obj.updateDynamic("PolicyArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IAMPolicyAssignment]
    }
  }

  /** IAM policy assignment summary.
    */
  @js.native
  trait IAMPolicyAssignmentSummary extends js.Object {
    var AssignmentName: js.UndefOr[IAMPolicyAssignmentName]
    var AssignmentStatus: js.UndefOr[AssignmentStatus]
  }

  object IAMPolicyAssignmentSummary {
    @inline
    def apply(
        AssignmentName: js.UndefOr[IAMPolicyAssignmentName] = js.undefined,
        AssignmentStatus: js.UndefOr[AssignmentStatus] = js.undefined
    ): IAMPolicyAssignmentSummary = {
      val __obj = js.Dynamic.literal()
      AssignmentName.foreach(__v => __obj.updateDynamic("AssignmentName")(__v.asInstanceOf[js.Any]))
      AssignmentStatus.foreach(__v => __obj.updateDynamic("AssignmentStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IAMPolicyAssignmentSummary]
    }
  }

  /** Information about the SPICE ingestion for a dataset.
    */
  @js.native
  trait Ingestion extends js.Object {
    var Arn: Arn
    var CreatedTime: Timestamp
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

  object Ingestion {
    @inline
    def apply(
        Arn: Arn,
        CreatedTime: Timestamp,
        IngestionStatus: IngestionStatus,
        ErrorInfo: js.UndefOr[ErrorInfo] = js.undefined,
        IngestionId: js.UndefOr[IngestionId] = js.undefined,
        IngestionSizeInBytes: js.UndefOr[Double] = js.undefined,
        IngestionTimeInSeconds: js.UndefOr[Double] = js.undefined,
        QueueInfo: js.UndefOr[QueueInfo] = js.undefined,
        RequestSource: js.UndefOr[IngestionRequestSource] = js.undefined,
        RequestType: js.UndefOr[IngestionRequestType] = js.undefined,
        RowInfo: js.UndefOr[RowInfo] = js.undefined
    ): Ingestion = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "CreatedTime" -> CreatedTime.asInstanceOf[js.Any],
        "IngestionStatus" -> IngestionStatus.asInstanceOf[js.Any]
      )

      ErrorInfo.foreach(__v => __obj.updateDynamic("ErrorInfo")(__v.asInstanceOf[js.Any]))
      IngestionId.foreach(__v => __obj.updateDynamic("IngestionId")(__v.asInstanceOf[js.Any]))
      IngestionSizeInBytes.foreach(__v => __obj.updateDynamic("IngestionSizeInBytes")(__v.asInstanceOf[js.Any]))
      IngestionTimeInSeconds.foreach(__v => __obj.updateDynamic("IngestionTimeInSeconds")(__v.asInstanceOf[js.Any]))
      QueueInfo.foreach(__v => __obj.updateDynamic("QueueInfo")(__v.asInstanceOf[js.Any]))
      RequestSource.foreach(__v => __obj.updateDynamic("RequestSource")(__v.asInstanceOf[js.Any]))
      RequestType.foreach(__v => __obj.updateDynamic("RequestType")(__v.asInstanceOf[js.Any]))
      RowInfo.foreach(__v => __obj.updateDynamic("RowInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Ingestion]
    }
  }

  /** Metadata for a column that is used as the input of a transform operation.
    */
  @js.native
  trait InputColumn extends js.Object {
    var Name: ColumnName
    var Type: InputColumnDataType
  }

  object InputColumn {
    @inline
    def apply(
        Name: ColumnName,
        Type: InputColumnDataType
    ): InputColumn = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InputColumn]
    }
  }

  /** An integer parameter.
    */
  @js.native
  trait IntegerParameter extends js.Object {
    var Name: NonEmptyString
    var Values: LongList
  }

  object IntegerParameter {
    @inline
    def apply(
        Name: NonEmptyString,
        Values: LongList
    ): IntegerParameter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[IntegerParameter]
    }
  }

  /** The parameters for Jira.
    */
  @js.native
  trait JiraParameters extends js.Object {
    var SiteBaseUrl: SiteBaseUrl
  }

  object JiraParameters {
    @inline
    def apply(
        SiteBaseUrl: SiteBaseUrl
    ): JiraParameters = {
      val __obj = js.Dynamic.literal(
        "SiteBaseUrl" -> SiteBaseUrl.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[JiraParameters]
    }
  }

  /** The instructions associated with a join.
    */
  @js.native
  trait JoinInstruction extends js.Object {
    var LeftOperand: LogicalTableId
    var OnClause: OnClause
    var RightOperand: LogicalTableId
    var Type: JoinType
    var LeftJoinKeyProperties: js.UndefOr[JoinKeyProperties]
    var RightJoinKeyProperties: js.UndefOr[JoinKeyProperties]
  }

  object JoinInstruction {
    @inline
    def apply(
        LeftOperand: LogicalTableId,
        OnClause: OnClause,
        RightOperand: LogicalTableId,
        Type: JoinType,
        LeftJoinKeyProperties: js.UndefOr[JoinKeyProperties] = js.undefined,
        RightJoinKeyProperties: js.UndefOr[JoinKeyProperties] = js.undefined
    ): JoinInstruction = {
      val __obj = js.Dynamic.literal(
        "LeftOperand" -> LeftOperand.asInstanceOf[js.Any],
        "OnClause" -> OnClause.asInstanceOf[js.Any],
        "RightOperand" -> RightOperand.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      LeftJoinKeyProperties.foreach(__v => __obj.updateDynamic("LeftJoinKeyProperties")(__v.asInstanceOf[js.Any]))
      RightJoinKeyProperties.foreach(__v => __obj.updateDynamic("RightJoinKeyProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JoinInstruction]
    }
  }

  /** Properties associated with the columns participating in a join.
    */
  @js.native
  trait JoinKeyProperties extends js.Object {
    var UniqueKey: js.UndefOr[Boolean]
  }

  object JoinKeyProperties {
    @inline
    def apply(
        UniqueKey: js.UndefOr[Boolean] = js.undefined
    ): JoinKeyProperties = {
      val __obj = js.Dynamic.literal()
      UniqueKey.foreach(__v => __obj.updateDynamic("UniqueKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JoinKeyProperties]
    }
  }

  /** A structure that contains the configuration of a shareable link to the dashboard.
    */
  @js.native
  trait LinkSharingConfiguration extends js.Object {
    var Permissions: js.UndefOr[ResourcePermissionList]
  }

  object LinkSharingConfiguration {
    @inline
    def apply(
        Permissions: js.UndefOr[ResourcePermissionList] = js.undefined
    ): LinkSharingConfiguration = {
      val __obj = js.Dynamic.literal()
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LinkSharingConfiguration]
    }
  }

  @js.native
  trait ListAnalysesRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListAnalysesRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListAnalysesRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAnalysesRequest]
    }
  }

  @js.native
  trait ListAnalysesResponse extends js.Object {
    var AnalysisSummaryList: js.UndefOr[AnalysisSummaryList]
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object ListAnalysesResponse {
    @inline
    def apply(
        AnalysisSummaryList: js.UndefOr[AnalysisSummaryList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): ListAnalysesResponse = {
      val __obj = js.Dynamic.literal()
      AnalysisSummaryList.foreach(__v => __obj.updateDynamic("AnalysisSummaryList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAnalysesResponse]
    }
  }

  @js.native
  trait ListDashboardVersionsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DashboardId: RestrictiveResourceId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListDashboardVersionsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DashboardId: RestrictiveResourceId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListDashboardVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "DashboardId" -> DashboardId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDashboardVersionsRequest]
    }
  }

  @js.native
  trait ListDashboardVersionsResponse extends js.Object {
    var DashboardVersionSummaryList: js.UndefOr[DashboardVersionSummaryList]
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object ListDashboardVersionsResponse {
    @inline
    def apply(
        DashboardVersionSummaryList: js.UndefOr[DashboardVersionSummaryList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): ListDashboardVersionsResponse = {
      val __obj = js.Dynamic.literal()
      DashboardVersionSummaryList.foreach(__v => __obj.updateDynamic("DashboardVersionSummaryList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDashboardVersionsResponse]
    }
  }

  @js.native
  trait ListDashboardsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListDashboardsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListDashboardsRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDashboardsRequest]
    }
  }

  @js.native
  trait ListDashboardsResponse extends js.Object {
    var DashboardSummaryList: js.UndefOr[DashboardSummaryList]
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object ListDashboardsResponse {
    @inline
    def apply(
        DashboardSummaryList: js.UndefOr[DashboardSummaryList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): ListDashboardsResponse = {
      val __obj = js.Dynamic.literal()
      DashboardSummaryList.foreach(__v => __obj.updateDynamic("DashboardSummaryList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDashboardsResponse]
    }
  }

  @js.native
  trait ListDataSetsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListDataSetsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListDataSetsRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataSetsRequest]
    }
  }

  @js.native
  trait ListDataSetsResponse extends js.Object {
    var DataSetSummaries: js.UndefOr[DataSetSummaryList]
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object ListDataSetsResponse {
    @inline
    def apply(
        DataSetSummaries: js.UndefOr[DataSetSummaryList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): ListDataSetsResponse = {
      val __obj = js.Dynamic.literal()
      DataSetSummaries.foreach(__v => __obj.updateDynamic("DataSetSummaries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataSetsResponse]
    }
  }

  @js.native
  trait ListDataSourcesRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListDataSourcesRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListDataSourcesRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataSourcesRequest]
    }
  }

  @js.native
  trait ListDataSourcesResponse extends js.Object {
    var DataSources: js.UndefOr[DataSourceList]
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object ListDataSourcesResponse {
    @inline
    def apply(
        DataSources: js.UndefOr[DataSourceList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): ListDataSourcesResponse = {
      val __obj = js.Dynamic.literal()
      DataSources.foreach(__v => __obj.updateDynamic("DataSources")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataSourcesResponse]
    }
  }

  @js.native
  trait ListFolderMembersRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var FolderId: RestrictiveResourceId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListFolderMembersRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        FolderId: RestrictiveResourceId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListFolderMembersRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "FolderId" -> FolderId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFolderMembersRequest]
    }
  }

  @js.native
  trait ListFolderMembersResponse extends js.Object {
    var FolderMemberList: js.UndefOr[FolderMemberList]
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object ListFolderMembersResponse {
    @inline
    def apply(
        FolderMemberList: js.UndefOr[FolderMemberList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): ListFolderMembersResponse = {
      val __obj = js.Dynamic.literal()
      FolderMemberList.foreach(__v => __obj.updateDynamic("FolderMemberList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFolderMembersResponse]
    }
  }

  @js.native
  trait ListFoldersRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListFoldersRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListFoldersRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFoldersRequest]
    }
  }

  @js.native
  trait ListFoldersResponse extends js.Object {
    var FolderSummaryList: js.UndefOr[FolderSummaryList]
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object ListFoldersResponse {
    @inline
    def apply(
        FolderSummaryList: js.UndefOr[FolderSummaryList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): ListFoldersResponse = {
      val __obj = js.Dynamic.literal()
      FolderSummaryList.foreach(__v => __obj.updateDynamic("FolderSummaryList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFoldersResponse]
    }
  }

  @js.native
  trait ListGroupMembershipsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var GroupName: GroupName
    var Namespace: Namespace
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListGroupMembershipsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        GroupName: GroupName,
        Namespace: Namespace,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListGroupMembershipsRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "GroupName" -> GroupName.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupMembershipsRequest]
    }
  }

  @js.native
  trait ListGroupMembershipsResponse extends js.Object {
    var GroupMemberList: js.UndefOr[GroupMemberList]
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object ListGroupMembershipsResponse {
    @inline
    def apply(
        GroupMemberList: js.UndefOr[GroupMemberList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): ListGroupMembershipsResponse = {
      val __obj = js.Dynamic.literal()
      GroupMemberList.foreach(__v => __obj.updateDynamic("GroupMemberList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupMembershipsResponse]
    }
  }

  @js.native
  trait ListGroupsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Namespace: Namespace
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListGroupsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        Namespace: Namespace,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListGroupsRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupsRequest]
    }
  }

  @js.native
  trait ListGroupsResponse extends js.Object {
    var GroupList: js.UndefOr[GroupList]
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object ListGroupsResponse {
    @inline
    def apply(
        GroupList: js.UndefOr[GroupList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): ListGroupsResponse = {
      val __obj = js.Dynamic.literal()
      GroupList.foreach(__v => __obj.updateDynamic("GroupList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupsResponse]
    }
  }

  @js.native
  trait ListIAMPolicyAssignmentsForUserRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Namespace: Namespace
    var UserName: UserName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListIAMPolicyAssignmentsForUserRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        Namespace: Namespace,
        UserName: UserName,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListIAMPolicyAssignmentsForUserRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIAMPolicyAssignmentsForUserRequest]
    }
  }

  @js.native
  trait ListIAMPolicyAssignmentsForUserResponse extends js.Object {
    var ActiveAssignments: js.UndefOr[ActiveIAMPolicyAssignmentList]
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object ListIAMPolicyAssignmentsForUserResponse {
    @inline
    def apply(
        ActiveAssignments: js.UndefOr[ActiveIAMPolicyAssignmentList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): ListIAMPolicyAssignmentsForUserResponse = {
      val __obj = js.Dynamic.literal()
      ActiveAssignments.foreach(__v => __obj.updateDynamic("ActiveAssignments")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIAMPolicyAssignmentsForUserResponse]
    }
  }

  @js.native
  trait ListIAMPolicyAssignmentsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Namespace: Namespace
    var AssignmentStatus: js.UndefOr[AssignmentStatus]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListIAMPolicyAssignmentsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        Namespace: Namespace,
        AssignmentStatus: js.UndefOr[AssignmentStatus] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListIAMPolicyAssignmentsRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any]
      )

      AssignmentStatus.foreach(__v => __obj.updateDynamic("AssignmentStatus")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIAMPolicyAssignmentsRequest]
    }
  }

  @js.native
  trait ListIAMPolicyAssignmentsResponse extends js.Object {
    var IAMPolicyAssignments: js.UndefOr[IAMPolicyAssignmentSummaryList]
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object ListIAMPolicyAssignmentsResponse {
    @inline
    def apply(
        IAMPolicyAssignments: js.UndefOr[IAMPolicyAssignmentSummaryList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): ListIAMPolicyAssignmentsResponse = {
      val __obj = js.Dynamic.literal()
      IAMPolicyAssignments.foreach(__v => __obj.updateDynamic("IAMPolicyAssignments")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIAMPolicyAssignmentsResponse]
    }
  }

  @js.native
  trait ListIngestionsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DataSetId: String
    var MaxResults: js.UndefOr[IngestionMaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListIngestionsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DataSetId: String,
        MaxResults: js.UndefOr[IngestionMaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListIngestionsRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "DataSetId" -> DataSetId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIngestionsRequest]
    }
  }

  @js.native
  trait ListIngestionsResponse extends js.Object {
    var Ingestions: js.UndefOr[Ingestions]
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object ListIngestionsResponse {
    @inline
    def apply(
        Ingestions: js.UndefOr[Ingestions] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): ListIngestionsResponse = {
      val __obj = js.Dynamic.literal()
      Ingestions.foreach(__v => __obj.updateDynamic("Ingestions")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListIngestionsResponse]
    }
  }

  @js.native
  trait ListNamespacesRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListNamespacesRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListNamespacesRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNamespacesRequest]
    }
  }

  @js.native
  trait ListNamespacesResponse extends js.Object {
    var Namespaces: js.UndefOr[Namespaces]
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object ListNamespacesResponse {
    @inline
    def apply(
        Namespaces: js.UndefOr[Namespaces] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): ListNamespacesResponse = {
      val __obj = js.Dynamic.literal()
      Namespaces.foreach(__v => __obj.updateDynamic("Namespaces")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNamespacesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: Arn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListTemplateAliasesRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var TemplateId: RestrictiveResourceId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListTemplateAliasesRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        TemplateId: RestrictiveResourceId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListTemplateAliasesRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "TemplateId" -> TemplateId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTemplateAliasesRequest]
    }
  }

  @js.native
  trait ListTemplateAliasesResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var TemplateAliasList: js.UndefOr[TemplateAliasList]
  }

  object ListTemplateAliasesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        TemplateAliasList: js.UndefOr[TemplateAliasList] = js.undefined
    ): ListTemplateAliasesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TemplateAliasList.foreach(__v => __obj.updateDynamic("TemplateAliasList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTemplateAliasesResponse]
    }
  }

  @js.native
  trait ListTemplateVersionsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var TemplateId: RestrictiveResourceId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListTemplateVersionsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        TemplateId: RestrictiveResourceId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListTemplateVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "TemplateId" -> TemplateId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTemplateVersionsRequest]
    }
  }

  @js.native
  trait ListTemplateVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var TemplateVersionSummaryList: js.UndefOr[TemplateVersionSummaryList]
  }

  object ListTemplateVersionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        TemplateVersionSummaryList: js.UndefOr[TemplateVersionSummaryList] = js.undefined
    ): ListTemplateVersionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TemplateVersionSummaryList.foreach(__v => __obj.updateDynamic("TemplateVersionSummaryList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTemplateVersionsResponse]
    }
  }

  @js.native
  trait ListTemplatesRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListTemplatesRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListTemplatesRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTemplatesRequest]
    }
  }

  @js.native
  trait ListTemplatesResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var TemplateSummaryList: js.UndefOr[TemplateSummaryList]
  }

  object ListTemplatesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        TemplateSummaryList: js.UndefOr[TemplateSummaryList] = js.undefined
    ): ListTemplatesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TemplateSummaryList.foreach(__v => __obj.updateDynamic("TemplateSummaryList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTemplatesResponse]
    }
  }

  @js.native
  trait ListThemeAliasesRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var ThemeId: RestrictiveResourceId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListThemeAliasesRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        ThemeId: RestrictiveResourceId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListThemeAliasesRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "ThemeId" -> ThemeId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListThemeAliasesRequest]
    }
  }

  @js.native
  trait ListThemeAliasesResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var ThemeAliasList: js.UndefOr[ThemeAliasList]
  }

  object ListThemeAliasesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        ThemeAliasList: js.UndefOr[ThemeAliasList] = js.undefined
    ): ListThemeAliasesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      ThemeAliasList.foreach(__v => __obj.updateDynamic("ThemeAliasList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListThemeAliasesResponse]
    }
  }

  @js.native
  trait ListThemeVersionsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var ThemeId: RestrictiveResourceId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListThemeVersionsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        ThemeId: RestrictiveResourceId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListThemeVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "ThemeId" -> ThemeId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListThemeVersionsRequest]
    }
  }

  @js.native
  trait ListThemeVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var ThemeVersionSummaryList: js.UndefOr[ThemeVersionSummaryList]
  }

  object ListThemeVersionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        ThemeVersionSummaryList: js.UndefOr[ThemeVersionSummaryList] = js.undefined
    ): ListThemeVersionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      ThemeVersionSummaryList.foreach(__v => __obj.updateDynamic("ThemeVersionSummaryList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListThemeVersionsResponse]
    }
  }

  @js.native
  trait ListThemesRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
    var Type: js.UndefOr[ThemeType]
  }

  object ListThemesRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[ThemeType] = js.undefined
    ): ListThemesRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListThemesRequest]
    }
  }

  @js.native
  trait ListThemesResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var ThemeSummaryList: js.UndefOr[ThemeSummaryList]
  }

  object ListThemesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        ThemeSummaryList: js.UndefOr[ThemeSummaryList] = js.undefined
    ): ListThemesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      ThemeSummaryList.foreach(__v => __obj.updateDynamic("ThemeSummaryList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListThemesResponse]
    }
  }

  @js.native
  trait ListUserGroupsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Namespace: Namespace
    var UserName: UserName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListUserGroupsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        Namespace: Namespace,
        UserName: UserName,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListUserGroupsRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUserGroupsRequest]
    }
  }

  @js.native
  trait ListUserGroupsResponse extends js.Object {
    var GroupList: js.UndefOr[GroupList]
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object ListUserGroupsResponse {
    @inline
    def apply(
        GroupList: js.UndefOr[GroupList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): ListUserGroupsResponse = {
      val __obj = js.Dynamic.literal()
      GroupList.foreach(__v => __obj.updateDynamic("GroupList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUserGroupsResponse]
    }
  }

  @js.native
  trait ListUsersRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Namespace: Namespace
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListUsersRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        Namespace: Namespace,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListUsersRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersRequest]
    }
  }

  @js.native
  trait ListUsersResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var UserList: js.UndefOr[UserList]
  }

  object ListUsersResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        UserList: js.UndefOr[UserList] = js.undefined
    ): ListUsersResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UserList.foreach(__v => __obj.updateDynamic("UserList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersResponse]
    }
  }

  /** A <i>logical table</i> is a unit that joins and that data transformations operate on. A logical table has a source, which can be either a physical table or result of a join. When a logical table points to a physical table, the logical table acts as a mutable copy of that physical table through transform operations.
    */
  @js.native
  trait LogicalTable extends js.Object {
    var Alias: LogicalTableAlias
    var Source: LogicalTableSource
    var DataTransforms: js.UndefOr[TransformOperationList]
  }

  object LogicalTable {
    @inline
    def apply(
        Alias: LogicalTableAlias,
        Source: LogicalTableSource,
        DataTransforms: js.UndefOr[TransformOperationList] = js.undefined
    ): LogicalTable = {
      val __obj = js.Dynamic.literal(
        "Alias" -> Alias.asInstanceOf[js.Any],
        "Source" -> Source.asInstanceOf[js.Any]
      )

      DataTransforms.foreach(__v => __obj.updateDynamic("DataTransforms")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LogicalTable]
    }
  }

  /** Information about the source of a logical table. This is a variant type structure. For this structure to be valid, only one of the attributes can be non-null.
    */
  @js.native
  trait LogicalTableSource extends js.Object {
    var DataSetArn: js.UndefOr[Arn]
    var JoinInstruction: js.UndefOr[JoinInstruction]
    var PhysicalTableId: js.UndefOr[PhysicalTableId]
  }

  object LogicalTableSource {
    @inline
    def apply(
        DataSetArn: js.UndefOr[Arn] = js.undefined,
        JoinInstruction: js.UndefOr[JoinInstruction] = js.undefined,
        PhysicalTableId: js.UndefOr[PhysicalTableId] = js.undefined
    ): LogicalTableSource = {
      val __obj = js.Dynamic.literal()
      DataSetArn.foreach(__v => __obj.updateDynamic("DataSetArn")(__v.asInstanceOf[js.Any]))
      JoinInstruction.foreach(__v => __obj.updateDynamic("JoinInstruction")(__v.asInstanceOf[js.Any]))
      PhysicalTableId.foreach(__v => __obj.updateDynamic("PhysicalTableId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LogicalTableSource]
    }
  }

  /** Amazon S3 manifest file location.
    */
  @js.native
  trait ManifestFileLocation extends js.Object {
    var Bucket: S3Bucket
    var Key: S3Key
  }

  object ManifestFileLocation {
    @inline
    def apply(
        Bucket: S3Bucket,
        Key: S3Key
    ): ManifestFileLocation = {
      val __obj = js.Dynamic.literal(
        "Bucket" -> Bucket.asInstanceOf[js.Any],
        "Key" -> Key.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ManifestFileLocation]
    }
  }

  /** The display options for margins around the outside edge of sheets.
    */
  @js.native
  trait MarginStyle extends js.Object {
    var Show: js.UndefOr[Boolean]
  }

  object MarginStyle {
    @inline
    def apply(
        Show: js.UndefOr[Boolean] = js.undefined
    ): MarginStyle = {
      val __obj = js.Dynamic.literal()
      Show.foreach(__v => __obj.updateDynamic("Show")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MarginStyle]
    }
  }

  /** The parameters for MariaDB.
    */
  @js.native
  trait MariaDbParameters extends js.Object {
    var Database: Database
    var Host: Host
    var Port: Port
  }

  object MariaDbParameters {
    @inline
    def apply(
        Database: Database,
        Host: Host,
        Port: Port
    ): MariaDbParameters = {
      val __obj = js.Dynamic.literal(
        "Database" -> Database.asInstanceOf[js.Any],
        "Host" -> Host.asInstanceOf[js.Any],
        "Port" -> Port.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[MariaDbParameters]
    }
  }

  /** An object that consists of a member Amazon Resource Name (ARN) and a member ID.
    */
  @js.native
  trait MemberIdArnPair extends js.Object {
    var MemberArn: js.UndefOr[Arn]
    var MemberId: js.UndefOr[RestrictiveResourceId]
  }

  object MemberIdArnPair {
    @inline
    def apply(
        MemberArn: js.UndefOr[Arn] = js.undefined,
        MemberId: js.UndefOr[RestrictiveResourceId] = js.undefined
    ): MemberIdArnPair = {
      val __obj = js.Dynamic.literal()
      MemberArn.foreach(__v => __obj.updateDynamic("MemberArn")(__v.asInstanceOf[js.Any]))
      MemberId.foreach(__v => __obj.updateDynamic("MemberId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MemberIdArnPair]
    }
  }

  /** The parameters for MySQL.
    */
  @js.native
  trait MySqlParameters extends js.Object {
    var Database: Database
    var Host: Host
    var Port: Port
  }

  object MySqlParameters {
    @inline
    def apply(
        Database: Database,
        Host: Host,
        Port: Port
    ): MySqlParameters = {
      val __obj = js.Dynamic.literal(
        "Database" -> Database.asInstanceOf[js.Any],
        "Host" -> Host.asInstanceOf[js.Any],
        "Port" -> Port.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[MySqlParameters]
    }
  }

  /** Errors that occur during namespace creation.
    */
  @js.native
  trait NamespaceError extends js.Object {
    var Message: js.UndefOr[String]
    var Type: js.UndefOr[NamespaceErrorType]
  }

  object NamespaceError {
    @inline
    def apply(
        Message: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[NamespaceErrorType] = js.undefined
    ): NamespaceError = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NamespaceError]
    }
  }

  /** The error type.
    */
  @js.native
  trait NamespaceInfoV2 extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CapacityRegion: js.UndefOr[String]
    var CreationStatus: js.UndefOr[NamespaceStatus]
    var IdentityStore: js.UndefOr[IdentityStore]
    var Name: js.UndefOr[Namespace]
    var NamespaceError: js.UndefOr[NamespaceError]
  }

  object NamespaceInfoV2 {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CapacityRegion: js.UndefOr[String] = js.undefined,
        CreationStatus: js.UndefOr[NamespaceStatus] = js.undefined,
        IdentityStore: js.UndefOr[IdentityStore] = js.undefined,
        Name: js.UndefOr[Namespace] = js.undefined,
        NamespaceError: js.UndefOr[NamespaceError] = js.undefined
    ): NamespaceInfoV2 = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CapacityRegion.foreach(__v => __obj.updateDynamic("CapacityRegion")(__v.asInstanceOf[js.Any]))
      CreationStatus.foreach(__v => __obj.updateDynamic("CreationStatus")(__v.asInstanceOf[js.Any]))
      IdentityStore.foreach(__v => __obj.updateDynamic("IdentityStore")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NamespaceError.foreach(__v => __obj.updateDynamic("NamespaceError")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NamespaceInfoV2]
    }
  }

  /** The parameters for Oracle.
    */
  @js.native
  trait OracleParameters extends js.Object {
    var Database: Database
    var Host: Host
    var Port: Port
  }

  object OracleParameters {
    @inline
    def apply(
        Database: Database,
        Host: Host,
        Port: Port
    ): OracleParameters = {
      val __obj = js.Dynamic.literal(
        "Database" -> Database.asInstanceOf[js.Any],
        "Host" -> Host.asInstanceOf[js.Any],
        "Port" -> Port.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OracleParameters]
    }
  }

  /** Output column.
    */
  @js.native
  trait OutputColumn extends js.Object {
    var Description: js.UndefOr[ColumnDescriptiveText]
    var Name: js.UndefOr[ColumnName]
    var Type: js.UndefOr[ColumnDataType]
  }

  object OutputColumn {
    @inline
    def apply(
        Description: js.UndefOr[ColumnDescriptiveText] = js.undefined,
        Name: js.UndefOr[ColumnName] = js.undefined,
        Type: js.UndefOr[ColumnDataType] = js.undefined
    ): OutputColumn = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OutputColumn]
    }
  }

  /** A list of Amazon QuickSight parameters and the list's override values.
    */
  @js.native
  trait Parameters extends js.Object {
    var DateTimeParameters: js.UndefOr[DateTimeParameterList]
    var DecimalParameters: js.UndefOr[DecimalParameterList]
    var IntegerParameters: js.UndefOr[IntegerParameterList]
    var StringParameters: js.UndefOr[StringParameterList]
  }

  object Parameters {
    @inline
    def apply(
        DateTimeParameters: js.UndefOr[DateTimeParameterList] = js.undefined,
        DecimalParameters: js.UndefOr[DecimalParameterList] = js.undefined,
        IntegerParameters: js.UndefOr[IntegerParameterList] = js.undefined,
        StringParameters: js.UndefOr[StringParameterList] = js.undefined
    ): Parameters = {
      val __obj = js.Dynamic.literal()
      DateTimeParameters.foreach(__v => __obj.updateDynamic("DateTimeParameters")(__v.asInstanceOf[js.Any]))
      DecimalParameters.foreach(__v => __obj.updateDynamic("DecimalParameters")(__v.asInstanceOf[js.Any]))
      IntegerParameters.foreach(__v => __obj.updateDynamic("IntegerParameters")(__v.asInstanceOf[js.Any]))
      StringParameters.foreach(__v => __obj.updateDynamic("StringParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Parameters]
    }
  }

  /** A view of a data source that contains information about the shape of the data in the underlying source. This is a variant type structure. For this structure to be valid, only one of the attributes can be non-null.
    */
  @js.native
  trait PhysicalTable extends js.Object {
    var CustomSql: js.UndefOr[CustomSql]
    var RelationalTable: js.UndefOr[RelationalTable]
    var S3Source: js.UndefOr[S3Source]
  }

  object PhysicalTable {
    @inline
    def apply(
        CustomSql: js.UndefOr[CustomSql] = js.undefined,
        RelationalTable: js.UndefOr[RelationalTable] = js.undefined,
        S3Source: js.UndefOr[S3Source] = js.undefined
    ): PhysicalTable = {
      val __obj = js.Dynamic.literal()
      CustomSql.foreach(__v => __obj.updateDynamic("CustomSql")(__v.asInstanceOf[js.Any]))
      RelationalTable.foreach(__v => __obj.updateDynamic("RelationalTable")(__v.asInstanceOf[js.Any]))
      S3Source.foreach(__v => __obj.updateDynamic("S3Source")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PhysicalTable]
    }
  }

  /** The parameters for PostgreSQL.
    */
  @js.native
  trait PostgreSqlParameters extends js.Object {
    var Database: Database
    var Host: Host
    var Port: Port
  }

  object PostgreSqlParameters {
    @inline
    def apply(
        Database: Database,
        Host: Host,
        Port: Port
    ): PostgreSqlParameters = {
      val __obj = js.Dynamic.literal(
        "Database" -> Database.asInstanceOf[js.Any],
        "Host" -> Host.asInstanceOf[js.Any],
        "Port" -> Port.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PostgreSqlParameters]
    }
  }

  /** The parameters for Presto.
    */
  @js.native
  trait PrestoParameters extends js.Object {
    var Catalog: Catalog
    var Host: Host
    var Port: Port
  }

  object PrestoParameters {
    @inline
    def apply(
        Catalog: Catalog,
        Host: Host,
        Port: Port
    ): PrestoParameters = {
      val __obj = js.Dynamic.literal(
        "Catalog" -> Catalog.asInstanceOf[js.Any],
        "Host" -> Host.asInstanceOf[js.Any],
        "Port" -> Port.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PrestoParameters]
    }
  }

  /** A transform operation that projects columns. Operations that come after a projection can only refer to projected columns.
    */
  @js.native
  trait ProjectOperation extends js.Object {
    var ProjectedColumns: ProjectedColumnList
  }

  object ProjectOperation {
    @inline
    def apply(
        ProjectedColumns: ProjectedColumnList
    ): ProjectOperation = {
      val __obj = js.Dynamic.literal(
        "ProjectedColumns" -> ProjectedColumns.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ProjectOperation]
    }
  }

  /** Information about a queued dataset SPICE ingestion.
    */
  @js.native
  trait QueueInfo extends js.Object {
    var QueuedIngestion: String
    var WaitingOnIngestion: String
  }

  object QueueInfo {
    @inline
    def apply(
        QueuedIngestion: String,
        WaitingOnIngestion: String
    ): QueueInfo = {
      val __obj = js.Dynamic.literal(
        "QueuedIngestion" -> QueuedIngestion.asInstanceOf[js.Any],
        "WaitingOnIngestion" -> WaitingOnIngestion.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[QueueInfo]
    }
  }

  /** The parameters for Amazon RDS.
    */
  @js.native
  trait RdsParameters extends js.Object {
    var Database: Database
    var InstanceId: InstanceId
  }

  object RdsParameters {
    @inline
    def apply(
        Database: Database,
        InstanceId: InstanceId
    ): RdsParameters = {
      val __obj = js.Dynamic.literal(
        "Database" -> Database.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RdsParameters]
    }
  }

  /** The parameters for Amazon Redshift. The <code>ClusterId</code> field can be blank if <code>Host</code> and <code>Port</code> are both set. The <code>Host</code> and <code>Port</code> fields can be blank if the <code>ClusterId</code> field is set.
    */
  @js.native
  trait RedshiftParameters extends js.Object {
    var Database: Database
    var ClusterId: js.UndefOr[ClusterId]
    var Host: js.UndefOr[Host]
    var Port: js.UndefOr[OptionalPort]
  }

  object RedshiftParameters {
    @inline
    def apply(
        Database: Database,
        ClusterId: js.UndefOr[ClusterId] = js.undefined,
        Host: js.UndefOr[Host] = js.undefined,
        Port: js.UndefOr[OptionalPort] = js.undefined
    ): RedshiftParameters = {
      val __obj = js.Dynamic.literal(
        "Database" -> Database.asInstanceOf[js.Any]
      )

      ClusterId.foreach(__v => __obj.updateDynamic("ClusterId")(__v.asInstanceOf[js.Any]))
      Host.foreach(__v => __obj.updateDynamic("Host")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RedshiftParameters]
    }
  }

  @js.native
  trait RegisterUserRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Email: String
    var IdentityType: IdentityType
    var Namespace: Namespace
    var UserRole: UserRole
    var CustomFederationProviderUrl: js.UndefOr[String]
    var CustomPermissionsName: js.UndefOr[RoleName]
    var ExternalLoginFederationProviderType: js.UndefOr[String]
    var ExternalLoginId: js.UndefOr[String]
    var IamArn: js.UndefOr[String]
    var SessionName: js.UndefOr[RoleSessionName]
    var UserName: js.UndefOr[UserName]
  }

  object RegisterUserRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        Email: String,
        IdentityType: IdentityType,
        Namespace: Namespace,
        UserRole: UserRole,
        CustomFederationProviderUrl: js.UndefOr[String] = js.undefined,
        CustomPermissionsName: js.UndefOr[RoleName] = js.undefined,
        ExternalLoginFederationProviderType: js.UndefOr[String] = js.undefined,
        ExternalLoginId: js.UndefOr[String] = js.undefined,
        IamArn: js.UndefOr[String] = js.undefined,
        SessionName: js.UndefOr[RoleSessionName] = js.undefined,
        UserName: js.UndefOr[UserName] = js.undefined
    ): RegisterUserRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Email" -> Email.asInstanceOf[js.Any],
        "IdentityType" -> IdentityType.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any],
        "UserRole" -> UserRole.asInstanceOf[js.Any]
      )

      CustomFederationProviderUrl.foreach(__v => __obj.updateDynamic("CustomFederationProviderUrl")(__v.asInstanceOf[js.Any]))
      CustomPermissionsName.foreach(__v => __obj.updateDynamic("CustomPermissionsName")(__v.asInstanceOf[js.Any]))
      ExternalLoginFederationProviderType.foreach(__v => __obj.updateDynamic("ExternalLoginFederationProviderType")(__v.asInstanceOf[js.Any]))
      ExternalLoginId.foreach(__v => __obj.updateDynamic("ExternalLoginId")(__v.asInstanceOf[js.Any]))
      IamArn.foreach(__v => __obj.updateDynamic("IamArn")(__v.asInstanceOf[js.Any]))
      SessionName.foreach(__v => __obj.updateDynamic("SessionName")(__v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.updateDynamic("UserName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterUserRequest]
    }
  }

  @js.native
  trait RegisterUserResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var User: js.UndefOr[User]
    var UserInvitationUrl: js.UndefOr[String]
  }

  object RegisterUserResponse {
    @inline
    def apply(
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        User: js.UndefOr[User] = js.undefined,
        UserInvitationUrl: js.UndefOr[String] = js.undefined
    ): RegisterUserResponse = {
      val __obj = js.Dynamic.literal()
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      User.foreach(__v => __obj.updateDynamic("User")(__v.asInstanceOf[js.Any]))
      UserInvitationUrl.foreach(__v => __obj.updateDynamic("UserInvitationUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterUserResponse]
    }
  }

  /** Information about the dashboard you want to embed.
    */
  @js.native
  trait RegisteredUserDashboardEmbeddingConfiguration extends js.Object {
    var InitialDashboardId: RestrictiveResourceId
  }

  object RegisteredUserDashboardEmbeddingConfiguration {
    @inline
    def apply(
        InitialDashboardId: RestrictiveResourceId
    ): RegisteredUserDashboardEmbeddingConfiguration = {
      val __obj = js.Dynamic.literal(
        "InitialDashboardId" -> InitialDashboardId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RegisteredUserDashboardEmbeddingConfiguration]
    }
  }

  /** The type of experience you want to embed. For registered users, you can embed Amazon QuickSight dashboards or the Amazon QuickSight console.
    *
    * '''Note:'''Exactly one of the experience configurations is required. You can choose <code>Dashboard</code> or <code>QuickSightConsole</code>. You cannot choose more than one experience configuration.
    */
  @js.native
  trait RegisteredUserEmbeddingExperienceConfiguration extends js.Object {
    var Dashboard: js.UndefOr[RegisteredUserDashboardEmbeddingConfiguration]
    var QSearchBar: js.UndefOr[RegisteredUserQSearchBarEmbeddingConfiguration]
    var QuickSightConsole: js.UndefOr[RegisteredUserQuickSightConsoleEmbeddingConfiguration]
  }

  object RegisteredUserEmbeddingExperienceConfiguration {
    @inline
    def apply(
        Dashboard: js.UndefOr[RegisteredUserDashboardEmbeddingConfiguration] = js.undefined,
        QSearchBar: js.UndefOr[RegisteredUserQSearchBarEmbeddingConfiguration] = js.undefined,
        QuickSightConsole: js.UndefOr[RegisteredUserQuickSightConsoleEmbeddingConfiguration] = js.undefined
    ): RegisteredUserEmbeddingExperienceConfiguration = {
      val __obj = js.Dynamic.literal()
      Dashboard.foreach(__v => __obj.updateDynamic("Dashboard")(__v.asInstanceOf[js.Any]))
      QSearchBar.foreach(__v => __obj.updateDynamic("QSearchBar")(__v.asInstanceOf[js.Any]))
      QuickSightConsole.foreach(__v => __obj.updateDynamic("QuickSightConsole")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisteredUserEmbeddingExperienceConfiguration]
    }
  }

  /** Information about the Q search bar embedding experience.
    */
  @js.native
  trait RegisteredUserQSearchBarEmbeddingConfiguration extends js.Object {
    var InitialTopicId: js.UndefOr[RestrictiveResourceId]
  }

  object RegisteredUserQSearchBarEmbeddingConfiguration {
    @inline
    def apply(
        InitialTopicId: js.UndefOr[RestrictiveResourceId] = js.undefined
    ): RegisteredUserQSearchBarEmbeddingConfiguration = {
      val __obj = js.Dynamic.literal()
      InitialTopicId.foreach(__v => __obj.updateDynamic("InitialTopicId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisteredUserQSearchBarEmbeddingConfiguration]
    }
  }

  /** Information about the Amazon QuickSight console that you want to embed.
    */
  @js.native
  trait RegisteredUserQuickSightConsoleEmbeddingConfiguration extends js.Object {
    var InitialPath: js.UndefOr[EntryPath]
  }

  object RegisteredUserQuickSightConsoleEmbeddingConfiguration {
    @inline
    def apply(
        InitialPath: js.UndefOr[EntryPath] = js.undefined
    ): RegisteredUserQuickSightConsoleEmbeddingConfiguration = {
      val __obj = js.Dynamic.literal()
      InitialPath.foreach(__v => __obj.updateDynamic("InitialPath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisteredUserQuickSightConsoleEmbeddingConfiguration]
    }
  }

  /** A physical table type for relational data sources.
    */
  @js.native
  trait RelationalTable extends js.Object {
    var DataSourceArn: Arn
    var InputColumns: InputColumnList
    var Name: RelationalTableName
    var Catalog: js.UndefOr[RelationalTableCatalog]
    var Schema: js.UndefOr[RelationalTableSchema]
  }

  object RelationalTable {
    @inline
    def apply(
        DataSourceArn: Arn,
        InputColumns: InputColumnList,
        Name: RelationalTableName,
        Catalog: js.UndefOr[RelationalTableCatalog] = js.undefined,
        Schema: js.UndefOr[RelationalTableSchema] = js.undefined
    ): RelationalTable = {
      val __obj = js.Dynamic.literal(
        "DataSourceArn" -> DataSourceArn.asInstanceOf[js.Any],
        "InputColumns" -> InputColumns.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Catalog.foreach(__v => __obj.updateDynamic("Catalog")(__v.asInstanceOf[js.Any]))
      Schema.foreach(__v => __obj.updateDynamic("Schema")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RelationalTable]
    }
  }

  /** A transform operation that renames a column.
    */
  @js.native
  trait RenameColumnOperation extends js.Object {
    var ColumnName: ColumnName
    var NewColumnName: ColumnName
  }

  object RenameColumnOperation {
    @inline
    def apply(
        ColumnName: ColumnName,
        NewColumnName: ColumnName
    ): RenameColumnOperation = {
      val __obj = js.Dynamic.literal(
        "ColumnName" -> ColumnName.asInstanceOf[js.Any],
        "NewColumnName" -> NewColumnName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RenameColumnOperation]
    }
  }

  /** Permission for the resource.
    */
  @js.native
  trait ResourcePermission extends js.Object {
    var Actions: ActionList
    var Principal: Principal
  }

  object ResourcePermission {
    @inline
    def apply(
        Actions: ActionList,
        Principal: Principal
    ): ResourcePermission = {
      val __obj = js.Dynamic.literal(
        "Actions" -> Actions.asInstanceOf[js.Any],
        "Principal" -> Principal.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ResourcePermission]
    }
  }

  @js.native
  trait RestoreAnalysisRequest extends js.Object {
    var AnalysisId: RestrictiveResourceId
    var AwsAccountId: AwsAccountId
  }

  object RestoreAnalysisRequest {
    @inline
    def apply(
        AnalysisId: RestrictiveResourceId,
        AwsAccountId: AwsAccountId
    ): RestoreAnalysisRequest = {
      val __obj = js.Dynamic.literal(
        "AnalysisId" -> AnalysisId.asInstanceOf[js.Any],
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RestoreAnalysisRequest]
    }
  }

  @js.native
  trait RestoreAnalysisResponse extends js.Object {
    var AnalysisId: js.UndefOr[RestrictiveResourceId]
    var Arn: js.UndefOr[Arn]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object RestoreAnalysisResponse {
    @inline
    def apply(
        AnalysisId: js.UndefOr[RestrictiveResourceId] = js.undefined,
        Arn: js.UndefOr[Arn] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): RestoreAnalysisResponse = {
      val __obj = js.Dynamic.literal()
      AnalysisId.foreach(__v => __obj.updateDynamic("AnalysisId")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestoreAnalysisResponse]
    }
  }

  /** Information about rows for a data set SPICE ingestion.
    */
  @js.native
  trait RowInfo extends js.Object {
    var RowsDropped: js.UndefOr[Double]
    var RowsIngested: js.UndefOr[Double]
    var TotalRowsInDataset: js.UndefOr[Double]
  }

  object RowInfo {
    @inline
    def apply(
        RowsDropped: js.UndefOr[Double] = js.undefined,
        RowsIngested: js.UndefOr[Double] = js.undefined,
        TotalRowsInDataset: js.UndefOr[Double] = js.undefined
    ): RowInfo = {
      val __obj = js.Dynamic.literal()
      RowsDropped.foreach(__v => __obj.updateDynamic("RowsDropped")(__v.asInstanceOf[js.Any]))
      RowsIngested.foreach(__v => __obj.updateDynamic("RowsIngested")(__v.asInstanceOf[js.Any]))
      TotalRowsInDataset.foreach(__v => __obj.updateDynamic("TotalRowsInDataset")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RowInfo]
    }
  }

  /** Information about a dataset that contains permissions for row-level security (RLS). The permissions dataset maps fields to users or groups. For more information, see [[https://docs.aws.amazon.com/quicksight/latest/user/restrict-access-to-a-data-set-using-row-level-security.html|Using Row-Level Security (RLS) to Restrict Access to a Dataset]] in the <i>Amazon QuickSight User Guide</i>. The option to deny permissions by setting <code>PermissionPolicy</code> to <code>DENY_ACCESS</code> is not supported for new RLS datasets.
    */
  @js.native
  trait RowLevelPermissionDataSet extends js.Object {
    var Arn: Arn
    var PermissionPolicy: RowLevelPermissionPolicy
    var FormatVersion: js.UndefOr[RowLevelPermissionFormatVersion]
    var Namespace: js.UndefOr[Namespace]
    var Status: js.UndefOr[Status]
  }

  object RowLevelPermissionDataSet {
    @inline
    def apply(
        Arn: Arn,
        PermissionPolicy: RowLevelPermissionPolicy,
        FormatVersion: js.UndefOr[RowLevelPermissionFormatVersion] = js.undefined,
        Namespace: js.UndefOr[Namespace] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined
    ): RowLevelPermissionDataSet = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "PermissionPolicy" -> PermissionPolicy.asInstanceOf[js.Any]
      )

      FormatVersion.foreach(__v => __obj.updateDynamic("FormatVersion")(__v.asInstanceOf[js.Any]))
      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RowLevelPermissionDataSet]
    }
  }

  /** The configuration of tags on a dataset to set row-level security.
    */
  @js.native
  trait RowLevelPermissionTagConfiguration extends js.Object {
    var TagRules: RowLevelPermissionTagRuleList
    var Status: js.UndefOr[Status]
  }

  object RowLevelPermissionTagConfiguration {
    @inline
    def apply(
        TagRules: RowLevelPermissionTagRuleList,
        Status: js.UndefOr[Status] = js.undefined
    ): RowLevelPermissionTagConfiguration = {
      val __obj = js.Dynamic.literal(
        "TagRules" -> TagRules.asInstanceOf[js.Any]
      )

      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RowLevelPermissionTagConfiguration]
    }
  }

  /** A set of rules associated with a tag.
    */
  @js.native
  trait RowLevelPermissionTagRule extends js.Object {
    var ColumnName: String
    var TagKey: SessionTagKey
    var MatchAllValue: js.UndefOr[SessionTagValue]
    var TagMultiValueDelimiter: js.UndefOr[RowLevelPermissionTagDelimiter]
  }

  object RowLevelPermissionTagRule {
    @inline
    def apply(
        ColumnName: String,
        TagKey: SessionTagKey,
        MatchAllValue: js.UndefOr[SessionTagValue] = js.undefined,
        TagMultiValueDelimiter: js.UndefOr[RowLevelPermissionTagDelimiter] = js.undefined
    ): RowLevelPermissionTagRule = {
      val __obj = js.Dynamic.literal(
        "ColumnName" -> ColumnName.asInstanceOf[js.Any],
        "TagKey" -> TagKey.asInstanceOf[js.Any]
      )

      MatchAllValue.foreach(__v => __obj.updateDynamic("MatchAllValue")(__v.asInstanceOf[js.Any]))
      TagMultiValueDelimiter.foreach(__v => __obj.updateDynamic("TagMultiValueDelimiter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RowLevelPermissionTagRule]
    }
  }

  /** The parameters for S3.
    */
  @js.native
  trait S3Parameters extends js.Object {
    var ManifestFileLocation: ManifestFileLocation
  }

  object S3Parameters {
    @inline
    def apply(
        ManifestFileLocation: ManifestFileLocation
    ): S3Parameters = {
      val __obj = js.Dynamic.literal(
        "ManifestFileLocation" -> ManifestFileLocation.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[S3Parameters]
    }
  }

  /** A physical table type for an S3 data source.
    */
  @js.native
  trait S3Source extends js.Object {
    var DataSourceArn: Arn
    var InputColumns: InputColumnList
    var UploadSettings: js.UndefOr[UploadSettings]
  }

  object S3Source {
    @inline
    def apply(
        DataSourceArn: Arn,
        InputColumns: InputColumnList,
        UploadSettings: js.UndefOr[UploadSettings] = js.undefined
    ): S3Source = {
      val __obj = js.Dynamic.literal(
        "DataSourceArn" -> DataSourceArn.asInstanceOf[js.Any],
        "InputColumns" -> InputColumns.asInstanceOf[js.Any]
      )

      UploadSettings.foreach(__v => __obj.updateDynamic("UploadSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Source]
    }
  }

  @js.native
  trait SearchAnalysesRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Filters: AnalysisSearchFilterList
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object SearchAnalysesRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        Filters: AnalysisSearchFilterList,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): SearchAnalysesRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Filters" -> Filters.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchAnalysesRequest]
    }
  }

  @js.native
  trait SearchAnalysesResponse extends js.Object {
    var AnalysisSummaryList: js.UndefOr[AnalysisSummaryList]
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object SearchAnalysesResponse {
    @inline
    def apply(
        AnalysisSummaryList: js.UndefOr[AnalysisSummaryList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): SearchAnalysesResponse = {
      val __obj = js.Dynamic.literal()
      AnalysisSummaryList.foreach(__v => __obj.updateDynamic("AnalysisSummaryList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchAnalysesResponse]
    }
  }

  @js.native
  trait SearchDashboardsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Filters: DashboardSearchFilterList
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object SearchDashboardsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        Filters: DashboardSearchFilterList,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): SearchDashboardsRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Filters" -> Filters.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchDashboardsRequest]
    }
  }

  @js.native
  trait SearchDashboardsResponse extends js.Object {
    var DashboardSummaryList: js.UndefOr[DashboardSummaryList]
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object SearchDashboardsResponse {
    @inline
    def apply(
        DashboardSummaryList: js.UndefOr[DashboardSummaryList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): SearchDashboardsResponse = {
      val __obj = js.Dynamic.literal()
      DashboardSummaryList.foreach(__v => __obj.updateDynamic("DashboardSummaryList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchDashboardsResponse]
    }
  }

  @js.native
  trait SearchFoldersRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Filters: FolderSearchFilterList
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object SearchFoldersRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        Filters: FolderSearchFilterList,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): SearchFoldersRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Filters" -> Filters.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchFoldersRequest]
    }
  }

  @js.native
  trait SearchFoldersResponse extends js.Object {
    var FolderSummaryList: js.UndefOr[FolderSummaryList]
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object SearchFoldersResponse {
    @inline
    def apply(
        FolderSummaryList: js.UndefOr[FolderSummaryList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): SearchFoldersResponse = {
      val __obj = js.Dynamic.literal()
      FolderSummaryList.foreach(__v => __obj.updateDynamic("FolderSummaryList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchFoldersResponse]
    }
  }

  /** The parameters for ServiceNow.
    */
  @js.native
  trait ServiceNowParameters extends js.Object {
    var SiteBaseUrl: SiteBaseUrl
  }

  object ServiceNowParameters {
    @inline
    def apply(
        SiteBaseUrl: SiteBaseUrl
    ): ServiceNowParameters = {
      val __obj = js.Dynamic.literal(
        "SiteBaseUrl" -> SiteBaseUrl.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ServiceNowParameters]
    }
  }

  /** The key-value pair used for the row-level security tags feature.
    */
  @js.native
  trait SessionTag extends js.Object {
    var Key: SessionTagKey
    var Value: SessionTagValue
  }

  object SessionTag {
    @inline
    def apply(
        Key: SessionTagKey,
        Value: SessionTagValue
    ): SessionTag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SessionTag]
    }
  }

  /** A <i>sheet</i>, which is an object that contains a set of visuals that are viewed together on one page in Amazon QuickSight. Every analysis and dashboard contains at least one sheet. Each sheet contains at least one visualization widget, for example a chart, pivot table, or narrative insight. Sheets can be associated with other components, such as controls, filters, and so on.
    */
  @js.native
  trait Sheet extends js.Object {
    var Name: js.UndefOr[NonEmptyString]
    var SheetId: js.UndefOr[RestrictiveResourceId]
  }

  object Sheet {
    @inline
    def apply(
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        SheetId: js.UndefOr[RestrictiveResourceId] = js.undefined
    ): Sheet = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SheetId.foreach(__v => __obj.updateDynamic("SheetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Sheet]
    }
  }

  /** Sheet controls option.
    */
  @js.native
  trait SheetControlsOption extends js.Object {
    var VisibilityState: js.UndefOr[DashboardUIState]
  }

  object SheetControlsOption {
    @inline
    def apply(
        VisibilityState: js.UndefOr[DashboardUIState] = js.undefined
    ): SheetControlsOption = {
      val __obj = js.Dynamic.literal()
      VisibilityState.foreach(__v => __obj.updateDynamic("VisibilityState")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SheetControlsOption]
    }
  }

  /** The theme display options for sheets.
    */
  @js.native
  trait SheetStyle extends js.Object {
    var Tile: js.UndefOr[TileStyle]
    var TileLayout: js.UndefOr[TileLayoutStyle]
  }

  object SheetStyle {
    @inline
    def apply(
        Tile: js.UndefOr[TileStyle] = js.undefined,
        TileLayout: js.UndefOr[TileLayoutStyle] = js.undefined
    ): SheetStyle = {
      val __obj = js.Dynamic.literal()
      Tile.foreach(__v => __obj.updateDynamic("Tile")(__v.asInstanceOf[js.Any]))
      TileLayout.foreach(__v => __obj.updateDynamic("TileLayout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SheetStyle]
    }
  }

  /** The parameters for Snowflake.
    */
  @js.native
  trait SnowflakeParameters extends js.Object {
    var Database: Database
    var Host: Host
    var Warehouse: Warehouse
  }

  object SnowflakeParameters {
    @inline
    def apply(
        Database: Database,
        Host: Host,
        Warehouse: Warehouse
    ): SnowflakeParameters = {
      val __obj = js.Dynamic.literal(
        "Database" -> Database.asInstanceOf[js.Any],
        "Host" -> Host.asInstanceOf[js.Any],
        "Warehouse" -> Warehouse.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SnowflakeParameters]
    }
  }

  /** The parameters for Spark.
    */
  @js.native
  trait SparkParameters extends js.Object {
    var Host: Host
    var Port: Port
  }

  object SparkParameters {
    @inline
    def apply(
        Host: Host,
        Port: Port
    ): SparkParameters = {
      val __obj = js.Dynamic.literal(
        "Host" -> Host.asInstanceOf[js.Any],
        "Port" -> Port.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SparkParameters]
    }
  }

  /** The parameters for SQL Server.
    */
  @js.native
  trait SqlServerParameters extends js.Object {
    var Database: Database
    var Host: Host
    var Port: Port
  }

  object SqlServerParameters {
    @inline
    def apply(
        Database: Database,
        Host: Host,
        Port: Port
    ): SqlServerParameters = {
      val __obj = js.Dynamic.literal(
        "Database" -> Database.asInstanceOf[js.Any],
        "Host" -> Host.asInstanceOf[js.Any],
        "Port" -> Port.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SqlServerParameters]
    }
  }

  /** Secure Socket Layer (SSL) properties that apply when Amazon QuickSight connects to your underlying data source.
    */
  @js.native
  trait SslProperties extends js.Object {
    var DisableSsl: js.UndefOr[Boolean]
  }

  object SslProperties {
    @inline
    def apply(
        DisableSsl: js.UndefOr[Boolean] = js.undefined
    ): SslProperties = {
      val __obj = js.Dynamic.literal()
      DisableSsl.foreach(__v => __obj.updateDynamic("DisableSsl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SslProperties]
    }
  }

  /** A string parameter.
    */
  @js.native
  trait StringParameter extends js.Object {
    var Name: NonEmptyString
    var Values: StringList
  }

  object StringParameter {
    @inline
    def apply(
        Name: NonEmptyString,
        Values: StringList
    ): StringParameter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StringParameter]
    }
  }

  /** The key or keys of the key-value pairs for the resource tag or tags assigned to the resource.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tag]
    }
  }

  /** A transform operation that tags a column with additional information.
    */
  @js.native
  trait TagColumnOperation extends js.Object {
    var ColumnName: ColumnName
    var Tags: ColumnTagList
  }

  object TagColumnOperation {
    @inline
    def apply(
        ColumnName: ColumnName,
        Tags: ColumnTagList
    ): TagColumnOperation = {
      val __obj = js.Dynamic.literal(
        "ColumnName" -> ColumnName.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagColumnOperation]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object TagResourceResponse {
    @inline
    def apply(
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /** A template object. A <i>template</i> is an entity in Amazon QuickSight that encapsulates the metadata required to create an analysis and that you can use to create a dashboard. A template adds a layer of abstraction by using placeholders to replace the dataset associated with an analysis. You can use templates to create dashboards by replacing dataset placeholders with datasets that follow the same schema that was used to create the source analysis and template. You can share templates across Amazon Web Services accounts by allowing users in other Amazon Web Services accounts to create a template or a dashboard from an existing template.
    */
  @js.native
  trait Template extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreatedTime: js.UndefOr[Timestamp]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[TemplateName]
    var TemplateId: js.UndefOr[RestrictiveResourceId]
    var Version: js.UndefOr[TemplateVersion]
  }

  object Template {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[TemplateName] = js.undefined,
        TemplateId: js.UndefOr[RestrictiveResourceId] = js.undefined,
        Version: js.UndefOr[TemplateVersion] = js.undefined
    ): Template = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      TemplateId.foreach(__v => __obj.updateDynamic("TemplateId")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Template]
    }
  }

  /** The template alias.
    */
  @js.native
  trait TemplateAlias extends js.Object {
    var AliasName: js.UndefOr[AliasName]
    var Arn: js.UndefOr[Arn]
    var TemplateVersionNumber: js.UndefOr[VersionNumber]
  }

  object TemplateAlias {
    @inline
    def apply(
        AliasName: js.UndefOr[AliasName] = js.undefined,
        Arn: js.UndefOr[Arn] = js.undefined,
        TemplateVersionNumber: js.UndefOr[VersionNumber] = js.undefined
    ): TemplateAlias = {
      val __obj = js.Dynamic.literal()
      AliasName.foreach(__v => __obj.updateDynamic("AliasName")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      TemplateVersionNumber.foreach(__v => __obj.updateDynamic("TemplateVersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TemplateAlias]
    }
  }

  /** List of errors that occurred when the template version creation failed.
    */
  @js.native
  trait TemplateError extends js.Object {
    var Message: js.UndefOr[NonEmptyString]
    var Type: js.UndefOr[TemplateErrorType]
  }

  object TemplateError {
    @inline
    def apply(
        Message: js.UndefOr[NonEmptyString] = js.undefined,
        Type: js.UndefOr[TemplateErrorType] = js.undefined
    ): TemplateError = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TemplateError]
    }
  }

  /** The source analysis of the template.
    */
  @js.native
  trait TemplateSourceAnalysis extends js.Object {
    var Arn: Arn
    var DataSetReferences: DataSetReferenceList
  }

  object TemplateSourceAnalysis {
    @inline
    def apply(
        Arn: Arn,
        DataSetReferences: DataSetReferenceList
    ): TemplateSourceAnalysis = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "DataSetReferences" -> DataSetReferences.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TemplateSourceAnalysis]
    }
  }

  /** The source entity of the template.
    */
  @js.native
  trait TemplateSourceEntity extends js.Object {
    var SourceAnalysis: js.UndefOr[TemplateSourceAnalysis]
    var SourceTemplate: js.UndefOr[TemplateSourceTemplate]
  }

  object TemplateSourceEntity {
    @inline
    def apply(
        SourceAnalysis: js.UndefOr[TemplateSourceAnalysis] = js.undefined,
        SourceTemplate: js.UndefOr[TemplateSourceTemplate] = js.undefined
    ): TemplateSourceEntity = {
      val __obj = js.Dynamic.literal()
      SourceAnalysis.foreach(__v => __obj.updateDynamic("SourceAnalysis")(__v.asInstanceOf[js.Any]))
      SourceTemplate.foreach(__v => __obj.updateDynamic("SourceTemplate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TemplateSourceEntity]
    }
  }

  /** The source template of the template.
    */
  @js.native
  trait TemplateSourceTemplate extends js.Object {
    var Arn: Arn
  }

  object TemplateSourceTemplate {
    @inline
    def apply(
        Arn: Arn
    ): TemplateSourceTemplate = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TemplateSourceTemplate]
    }
  }

  /** The template summary.
    */
  @js.native
  trait TemplateSummary extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreatedTime: js.UndefOr[Timestamp]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var LatestVersionNumber: js.UndefOr[VersionNumber]
    var Name: js.UndefOr[TemplateName]
    var TemplateId: js.UndefOr[RestrictiveResourceId]
  }

  object TemplateSummary {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        LatestVersionNumber: js.UndefOr[VersionNumber] = js.undefined,
        Name: js.UndefOr[TemplateName] = js.undefined,
        TemplateId: js.UndefOr[RestrictiveResourceId] = js.undefined
    ): TemplateSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      LatestVersionNumber.foreach(__v => __obj.updateDynamic("LatestVersionNumber")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      TemplateId.foreach(__v => __obj.updateDynamic("TemplateId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TemplateSummary]
    }
  }

  /** A version of a template.
    */
  @js.native
  trait TemplateVersion extends js.Object {
    var CreatedTime: js.UndefOr[Timestamp]
    var DataSetConfigurations: js.UndefOr[DataSetConfigurationList]
    var Description: js.UndefOr[VersionDescription]
    var Errors: js.UndefOr[TemplateErrorList]
    var Sheets: js.UndefOr[SheetList]
    var SourceEntityArn: js.UndefOr[Arn]
    var Status: js.UndefOr[ResourceStatus]
    var ThemeArn: js.UndefOr[Arn]
    var VersionNumber: js.UndefOr[VersionNumber]
  }

  object TemplateVersion {
    @inline
    def apply(
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        DataSetConfigurations: js.UndefOr[DataSetConfigurationList] = js.undefined,
        Description: js.UndefOr[VersionDescription] = js.undefined,
        Errors: js.UndefOr[TemplateErrorList] = js.undefined,
        Sheets: js.UndefOr[SheetList] = js.undefined,
        SourceEntityArn: js.UndefOr[Arn] = js.undefined,
        Status: js.UndefOr[ResourceStatus] = js.undefined,
        ThemeArn: js.UndefOr[Arn] = js.undefined,
        VersionNumber: js.UndefOr[VersionNumber] = js.undefined
    ): TemplateVersion = {
      val __obj = js.Dynamic.literal()
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      DataSetConfigurations.foreach(__v => __obj.updateDynamic("DataSetConfigurations")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Errors.foreach(__v => __obj.updateDynamic("Errors")(__v.asInstanceOf[js.Any]))
      Sheets.foreach(__v => __obj.updateDynamic("Sheets")(__v.asInstanceOf[js.Any]))
      SourceEntityArn.foreach(__v => __obj.updateDynamic("SourceEntityArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      ThemeArn.foreach(__v => __obj.updateDynamic("ThemeArn")(__v.asInstanceOf[js.Any]))
      VersionNumber.foreach(__v => __obj.updateDynamic("VersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TemplateVersion]
    }
  }

  /** The template version.
    */
  @js.native
  trait TemplateVersionSummary extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreatedTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[VersionDescription]
    var Status: js.UndefOr[ResourceStatus]
    var VersionNumber: js.UndefOr[VersionNumber]
  }

  object TemplateVersionSummary {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[VersionDescription] = js.undefined,
        Status: js.UndefOr[ResourceStatus] = js.undefined,
        VersionNumber: js.UndefOr[VersionNumber] = js.undefined
    ): TemplateVersionSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      VersionNumber.foreach(__v => __obj.updateDynamic("VersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TemplateVersionSummary]
    }
  }

  /** The parameters for Teradata.
    */
  @js.native
  trait TeradataParameters extends js.Object {
    var Database: Database
    var Host: Host
    var Port: Port
  }

  object TeradataParameters {
    @inline
    def apply(
        Database: Database,
        Host: Host,
        Port: Port
    ): TeradataParameters = {
      val __obj = js.Dynamic.literal(
        "Database" -> Database.asInstanceOf[js.Any],
        "Host" -> Host.asInstanceOf[js.Any],
        "Port" -> Port.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TeradataParameters]
    }
  }

  /** Summary information about a theme.
    */
  @js.native
  trait Theme extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreatedTime: js.UndefOr[Timestamp]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[ThemeName]
    var ThemeId: js.UndefOr[RestrictiveResourceId]
    var Type: js.UndefOr[ThemeType]
    var Version: js.UndefOr[ThemeVersion]
  }

  object Theme {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[ThemeName] = js.undefined,
        ThemeId: js.UndefOr[RestrictiveResourceId] = js.undefined,
        Type: js.UndefOr[ThemeType] = js.undefined,
        Version: js.UndefOr[ThemeVersion] = js.undefined
    ): Theme = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ThemeId.foreach(__v => __obj.updateDynamic("ThemeId")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Theme]
    }
  }

  /** An alias for a theme.
    */
  @js.native
  trait ThemeAlias extends js.Object {
    var AliasName: js.UndefOr[AliasName]
    var Arn: js.UndefOr[Arn]
    var ThemeVersionNumber: js.UndefOr[VersionNumber]
  }

  object ThemeAlias {
    @inline
    def apply(
        AliasName: js.UndefOr[AliasName] = js.undefined,
        Arn: js.UndefOr[Arn] = js.undefined,
        ThemeVersionNumber: js.UndefOr[VersionNumber] = js.undefined
    ): ThemeAlias = {
      val __obj = js.Dynamic.literal()
      AliasName.foreach(__v => __obj.updateDynamic("AliasName")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      ThemeVersionNumber.foreach(__v => __obj.updateDynamic("ThemeVersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ThemeAlias]
    }
  }

  /** The theme configuration. This configuration contains all of the display properties for a theme.
    */
  @js.native
  trait ThemeConfiguration extends js.Object {
    var DataColorPalette: js.UndefOr[DataColorPalette]
    var Sheet: js.UndefOr[SheetStyle]
    var UIColorPalette: js.UndefOr[UIColorPalette]
  }

  object ThemeConfiguration {
    @inline
    def apply(
        DataColorPalette: js.UndefOr[DataColorPalette] = js.undefined,
        Sheet: js.UndefOr[SheetStyle] = js.undefined,
        UIColorPalette: js.UndefOr[UIColorPalette] = js.undefined
    ): ThemeConfiguration = {
      val __obj = js.Dynamic.literal()
      DataColorPalette.foreach(__v => __obj.updateDynamic("DataColorPalette")(__v.asInstanceOf[js.Any]))
      Sheet.foreach(__v => __obj.updateDynamic("Sheet")(__v.asInstanceOf[js.Any]))
      UIColorPalette.foreach(__v => __obj.updateDynamic("UIColorPalette")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ThemeConfiguration]
    }
  }

  /** Theme error.
    */
  @js.native
  trait ThemeError extends js.Object {
    var Message: js.UndefOr[NonEmptyString]
    var Type: js.UndefOr[ThemeErrorType]
  }

  object ThemeError {
    @inline
    def apply(
        Message: js.UndefOr[NonEmptyString] = js.undefined,
        Type: js.UndefOr[ThemeErrorType] = js.undefined
    ): ThemeError = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ThemeError]
    }
  }

  /** The theme summary.
    */
  @js.native
  trait ThemeSummary extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreatedTime: js.UndefOr[Timestamp]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var LatestVersionNumber: js.UndefOr[VersionNumber]
    var Name: js.UndefOr[ThemeName]
    var ThemeId: js.UndefOr[RestrictiveResourceId]
  }

  object ThemeSummary {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        LatestVersionNumber: js.UndefOr[VersionNumber] = js.undefined,
        Name: js.UndefOr[ThemeName] = js.undefined,
        ThemeId: js.UndefOr[RestrictiveResourceId] = js.undefined
    ): ThemeSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      LatestVersionNumber.foreach(__v => __obj.updateDynamic("LatestVersionNumber")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ThemeId.foreach(__v => __obj.updateDynamic("ThemeId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ThemeSummary]
    }
  }

  /** A version of a theme.
    */
  @js.native
  trait ThemeVersion extends js.Object {
    var Arn: js.UndefOr[Arn]
    var BaseThemeId: js.UndefOr[RestrictiveResourceId]
    var Configuration: js.UndefOr[ThemeConfiguration]
    var CreatedTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[VersionDescription]
    var Errors: js.UndefOr[ThemeErrorList]
    var Status: js.UndefOr[ResourceStatus]
    var VersionNumber: js.UndefOr[VersionNumber]
  }

  object ThemeVersion {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        BaseThemeId: js.UndefOr[RestrictiveResourceId] = js.undefined,
        Configuration: js.UndefOr[ThemeConfiguration] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[VersionDescription] = js.undefined,
        Errors: js.UndefOr[ThemeErrorList] = js.undefined,
        Status: js.UndefOr[ResourceStatus] = js.undefined,
        VersionNumber: js.UndefOr[VersionNumber] = js.undefined
    ): ThemeVersion = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      BaseThemeId.foreach(__v => __obj.updateDynamic("BaseThemeId")(__v.asInstanceOf[js.Any]))
      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Errors.foreach(__v => __obj.updateDynamic("Errors")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      VersionNumber.foreach(__v => __obj.updateDynamic("VersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ThemeVersion]
    }
  }

  /** The theme version.
    */
  @js.native
  trait ThemeVersionSummary extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreatedTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[VersionDescription]
    var Status: js.UndefOr[ResourceStatus]
    var VersionNumber: js.UndefOr[VersionNumber]
  }

  object ThemeVersionSummary {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[VersionDescription] = js.undefined,
        Status: js.UndefOr[ResourceStatus] = js.undefined,
        VersionNumber: js.UndefOr[VersionNumber] = js.undefined
    ): ThemeVersionSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      VersionNumber.foreach(__v => __obj.updateDynamic("VersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ThemeVersionSummary]
    }
  }

  /** The display options for the layout of tiles on a sheet.
    */
  @js.native
  trait TileLayoutStyle extends js.Object {
    var Gutter: js.UndefOr[GutterStyle]
    var Margin: js.UndefOr[MarginStyle]
  }

  object TileLayoutStyle {
    @inline
    def apply(
        Gutter: js.UndefOr[GutterStyle] = js.undefined,
        Margin: js.UndefOr[MarginStyle] = js.undefined
    ): TileLayoutStyle = {
      val __obj = js.Dynamic.literal()
      Gutter.foreach(__v => __obj.updateDynamic("Gutter")(__v.asInstanceOf[js.Any]))
      Margin.foreach(__v => __obj.updateDynamic("Margin")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TileLayoutStyle]
    }
  }

  /** Display options related to tiles on a sheet.
    */
  @js.native
  trait TileStyle extends js.Object {
    var Border: js.UndefOr[BorderStyle]
  }

  object TileStyle {
    @inline
    def apply(
        Border: js.UndefOr[BorderStyle] = js.undefined
    ): TileStyle = {
      val __obj = js.Dynamic.literal()
      Border.foreach(__v => __obj.updateDynamic("Border")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TileStyle]
    }
  }

  /** A data transformation on a logical table. This is a variant type structure. For this structure to be valid, only one of the attributes can be non-null.
    */
  @js.native
  trait TransformOperation extends js.Object {
    var CastColumnTypeOperation: js.UndefOr[CastColumnTypeOperation]
    var CreateColumnsOperation: js.UndefOr[CreateColumnsOperation]
    var FilterOperation: js.UndefOr[FilterOperation]
    var ProjectOperation: js.UndefOr[ProjectOperation]
    var RenameColumnOperation: js.UndefOr[RenameColumnOperation]
    var TagColumnOperation: js.UndefOr[TagColumnOperation]
    var UntagColumnOperation: js.UndefOr[UntagColumnOperation]
  }

  object TransformOperation {
    @inline
    def apply(
        CastColumnTypeOperation: js.UndefOr[CastColumnTypeOperation] = js.undefined,
        CreateColumnsOperation: js.UndefOr[CreateColumnsOperation] = js.undefined,
        FilterOperation: js.UndefOr[FilterOperation] = js.undefined,
        ProjectOperation: js.UndefOr[ProjectOperation] = js.undefined,
        RenameColumnOperation: js.UndefOr[RenameColumnOperation] = js.undefined,
        TagColumnOperation: js.UndefOr[TagColumnOperation] = js.undefined,
        UntagColumnOperation: js.UndefOr[UntagColumnOperation] = js.undefined
    ): TransformOperation = {
      val __obj = js.Dynamic.literal()
      CastColumnTypeOperation.foreach(__v => __obj.updateDynamic("CastColumnTypeOperation")(__v.asInstanceOf[js.Any]))
      CreateColumnsOperation.foreach(__v => __obj.updateDynamic("CreateColumnsOperation")(__v.asInstanceOf[js.Any]))
      FilterOperation.foreach(__v => __obj.updateDynamic("FilterOperation")(__v.asInstanceOf[js.Any]))
      ProjectOperation.foreach(__v => __obj.updateDynamic("ProjectOperation")(__v.asInstanceOf[js.Any]))
      RenameColumnOperation.foreach(__v => __obj.updateDynamic("RenameColumnOperation")(__v.asInstanceOf[js.Any]))
      TagColumnOperation.foreach(__v => __obj.updateDynamic("TagColumnOperation")(__v.asInstanceOf[js.Any]))
      UntagColumnOperation.foreach(__v => __obj.updateDynamic("UntagColumnOperation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TransformOperation]
    }
  }

  /** The parameters for Twitter.
    */
  @js.native
  trait TwitterParameters extends js.Object {
    var MaxRows: PositiveInteger
    var Query: Query
  }

  object TwitterParameters {
    @inline
    def apply(
        MaxRows: PositiveInteger,
        Query: Query
    ): TwitterParameters = {
      val __obj = js.Dynamic.literal(
        "MaxRows" -> MaxRows.asInstanceOf[js.Any],
        "Query" -> Query.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TwitterParameters]
    }
  }

  /** The theme colors that apply to UI and to charts, excluding data colors. The colors description is a hexadecimal color code that consists of six alphanumerical characters, prefixed with <code>#</code>, for example #37BFF5. For more information, see [[https://docs.aws.amazon.com/quicksight/latest/user/themes-in-quicksight.html|Using Themes in Amazon QuickSight]] in the <i>Amazon QuickSight User Guide.</i>
    */
  @js.native
  trait UIColorPalette extends js.Object {
    var Accent: js.UndefOr[HexColor]
    var AccentForeground: js.UndefOr[HexColor]
    var Danger: js.UndefOr[HexColor]
    var DangerForeground: js.UndefOr[HexColor]
    var Dimension: js.UndefOr[HexColor]
    var DimensionForeground: js.UndefOr[HexColor]
    var Measure: js.UndefOr[HexColor]
    var MeasureForeground: js.UndefOr[HexColor]
    var PrimaryBackground: js.UndefOr[HexColor]
    var PrimaryForeground: js.UndefOr[HexColor]
    var SecondaryBackground: js.UndefOr[HexColor]
    var SecondaryForeground: js.UndefOr[HexColor]
    var Success: js.UndefOr[HexColor]
    var SuccessForeground: js.UndefOr[HexColor]
    var Warning: js.UndefOr[HexColor]
    var WarningForeground: js.UndefOr[HexColor]
  }

  object UIColorPalette {
    @inline
    def apply(
        Accent: js.UndefOr[HexColor] = js.undefined,
        AccentForeground: js.UndefOr[HexColor] = js.undefined,
        Danger: js.UndefOr[HexColor] = js.undefined,
        DangerForeground: js.UndefOr[HexColor] = js.undefined,
        Dimension: js.UndefOr[HexColor] = js.undefined,
        DimensionForeground: js.UndefOr[HexColor] = js.undefined,
        Measure: js.UndefOr[HexColor] = js.undefined,
        MeasureForeground: js.UndefOr[HexColor] = js.undefined,
        PrimaryBackground: js.UndefOr[HexColor] = js.undefined,
        PrimaryForeground: js.UndefOr[HexColor] = js.undefined,
        SecondaryBackground: js.UndefOr[HexColor] = js.undefined,
        SecondaryForeground: js.UndefOr[HexColor] = js.undefined,
        Success: js.UndefOr[HexColor] = js.undefined,
        SuccessForeground: js.UndefOr[HexColor] = js.undefined,
        Warning: js.UndefOr[HexColor] = js.undefined,
        WarningForeground: js.UndefOr[HexColor] = js.undefined
    ): UIColorPalette = {
      val __obj = js.Dynamic.literal()
      Accent.foreach(__v => __obj.updateDynamic("Accent")(__v.asInstanceOf[js.Any]))
      AccentForeground.foreach(__v => __obj.updateDynamic("AccentForeground")(__v.asInstanceOf[js.Any]))
      Danger.foreach(__v => __obj.updateDynamic("Danger")(__v.asInstanceOf[js.Any]))
      DangerForeground.foreach(__v => __obj.updateDynamic("DangerForeground")(__v.asInstanceOf[js.Any]))
      Dimension.foreach(__v => __obj.updateDynamic("Dimension")(__v.asInstanceOf[js.Any]))
      DimensionForeground.foreach(__v => __obj.updateDynamic("DimensionForeground")(__v.asInstanceOf[js.Any]))
      Measure.foreach(__v => __obj.updateDynamic("Measure")(__v.asInstanceOf[js.Any]))
      MeasureForeground.foreach(__v => __obj.updateDynamic("MeasureForeground")(__v.asInstanceOf[js.Any]))
      PrimaryBackground.foreach(__v => __obj.updateDynamic("PrimaryBackground")(__v.asInstanceOf[js.Any]))
      PrimaryForeground.foreach(__v => __obj.updateDynamic("PrimaryForeground")(__v.asInstanceOf[js.Any]))
      SecondaryBackground.foreach(__v => __obj.updateDynamic("SecondaryBackground")(__v.asInstanceOf[js.Any]))
      SecondaryForeground.foreach(__v => __obj.updateDynamic("SecondaryForeground")(__v.asInstanceOf[js.Any]))
      Success.foreach(__v => __obj.updateDynamic("Success")(__v.asInstanceOf[js.Any]))
      SuccessForeground.foreach(__v => __obj.updateDynamic("SuccessForeground")(__v.asInstanceOf[js.Any]))
      Warning.foreach(__v => __obj.updateDynamic("Warning")(__v.asInstanceOf[js.Any]))
      WarningForeground.foreach(__v => __obj.updateDynamic("WarningForeground")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UIColorPalette]
    }
  }

  /** A transform operation that removes tags associated with a column.
    */
  @js.native
  trait UntagColumnOperation extends js.Object {
    var ColumnName: ColumnName
    var TagNames: ColumnTagNames
  }

  object UntagColumnOperation {
    @inline
    def apply(
        ColumnName: ColumnName,
        TagNames: ColumnTagNames
    ): UntagColumnOperation = {
      val __obj = js.Dynamic.literal(
        "ColumnName" -> ColumnName.asInstanceOf[js.Any],
        "TagNames" -> TagNames.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagColumnOperation]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object UntagResourceResponse {
    @inline
    def apply(
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateAccountCustomizationRequest extends js.Object {
    var AccountCustomization: AccountCustomization
    var AwsAccountId: AwsAccountId
    var Namespace: js.UndefOr[Namespace]
  }

  object UpdateAccountCustomizationRequest {
    @inline
    def apply(
        AccountCustomization: AccountCustomization,
        AwsAccountId: AwsAccountId,
        Namespace: js.UndefOr[Namespace] = js.undefined
    ): UpdateAccountCustomizationRequest = {
      val __obj = js.Dynamic.literal(
        "AccountCustomization" -> AccountCustomization.asInstanceOf[js.Any],
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any]
      )

      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAccountCustomizationRequest]
    }
  }

  @js.native
  trait UpdateAccountCustomizationResponse extends js.Object {
    var AccountCustomization: js.UndefOr[AccountCustomization]
    var Arn: js.UndefOr[Arn]
    var AwsAccountId: js.UndefOr[AwsAccountId]
    var Namespace: js.UndefOr[Namespace]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object UpdateAccountCustomizationResponse {
    @inline
    def apply(
        AccountCustomization: js.UndefOr[AccountCustomization] = js.undefined,
        Arn: js.UndefOr[Arn] = js.undefined,
        AwsAccountId: js.UndefOr[AwsAccountId] = js.undefined,
        Namespace: js.UndefOr[Namespace] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): UpdateAccountCustomizationResponse = {
      val __obj = js.Dynamic.literal()
      AccountCustomization.foreach(__v => __obj.updateDynamic("AccountCustomization")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      AwsAccountId.foreach(__v => __obj.updateDynamic("AwsAccountId")(__v.asInstanceOf[js.Any]))
      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAccountCustomizationResponse]
    }
  }

  @js.native
  trait UpdateAccountSettingsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DefaultNamespace: Namespace
    var NotificationEmail: js.UndefOr[String]
  }

  object UpdateAccountSettingsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DefaultNamespace: Namespace,
        NotificationEmail: js.UndefOr[String] = js.undefined
    ): UpdateAccountSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "DefaultNamespace" -> DefaultNamespace.asInstanceOf[js.Any]
      )

      NotificationEmail.foreach(__v => __obj.updateDynamic("NotificationEmail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAccountSettingsRequest]
    }
  }

  @js.native
  trait UpdateAccountSettingsResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object UpdateAccountSettingsResponse {
    @inline
    def apply(
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): UpdateAccountSettingsResponse = {
      val __obj = js.Dynamic.literal()
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAccountSettingsResponse]
    }
  }

  @js.native
  trait UpdateAnalysisPermissionsRequest extends js.Object {
    var AnalysisId: RestrictiveResourceId
    var AwsAccountId: AwsAccountId
    var GrantPermissions: js.UndefOr[UpdateResourcePermissionList]
    var RevokePermissions: js.UndefOr[UpdateResourcePermissionList]
  }

  object UpdateAnalysisPermissionsRequest {
    @inline
    def apply(
        AnalysisId: RestrictiveResourceId,
        AwsAccountId: AwsAccountId,
        GrantPermissions: js.UndefOr[UpdateResourcePermissionList] = js.undefined,
        RevokePermissions: js.UndefOr[UpdateResourcePermissionList] = js.undefined
    ): UpdateAnalysisPermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "AnalysisId" -> AnalysisId.asInstanceOf[js.Any],
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any]
      )

      GrantPermissions.foreach(__v => __obj.updateDynamic("GrantPermissions")(__v.asInstanceOf[js.Any]))
      RevokePermissions.foreach(__v => __obj.updateDynamic("RevokePermissions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAnalysisPermissionsRequest]
    }
  }

  @js.native
  trait UpdateAnalysisPermissionsResponse extends js.Object {
    var AnalysisArn: js.UndefOr[Arn]
    var AnalysisId: js.UndefOr[RestrictiveResourceId]
    var Permissions: js.UndefOr[ResourcePermissionList]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object UpdateAnalysisPermissionsResponse {
    @inline
    def apply(
        AnalysisArn: js.UndefOr[Arn] = js.undefined,
        AnalysisId: js.UndefOr[RestrictiveResourceId] = js.undefined,
        Permissions: js.UndefOr[ResourcePermissionList] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): UpdateAnalysisPermissionsResponse = {
      val __obj = js.Dynamic.literal()
      AnalysisArn.foreach(__v => __obj.updateDynamic("AnalysisArn")(__v.asInstanceOf[js.Any]))
      AnalysisId.foreach(__v => __obj.updateDynamic("AnalysisId")(__v.asInstanceOf[js.Any]))
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAnalysisPermissionsResponse]
    }
  }

  @js.native
  trait UpdateAnalysisRequest extends js.Object {
    var AnalysisId: RestrictiveResourceId
    var AwsAccountId: AwsAccountId
    var Name: AnalysisName
    var SourceEntity: AnalysisSourceEntity
    var Parameters: js.UndefOr[Parameters]
    var ThemeArn: js.UndefOr[Arn]
  }

  object UpdateAnalysisRequest {
    @inline
    def apply(
        AnalysisId: RestrictiveResourceId,
        AwsAccountId: AwsAccountId,
        Name: AnalysisName,
        SourceEntity: AnalysisSourceEntity,
        Parameters: js.UndefOr[Parameters] = js.undefined,
        ThemeArn: js.UndefOr[Arn] = js.undefined
    ): UpdateAnalysisRequest = {
      val __obj = js.Dynamic.literal(
        "AnalysisId" -> AnalysisId.asInstanceOf[js.Any],
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "SourceEntity" -> SourceEntity.asInstanceOf[js.Any]
      )

      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      ThemeArn.foreach(__v => __obj.updateDynamic("ThemeArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAnalysisRequest]
    }
  }

  @js.native
  trait UpdateAnalysisResponse extends js.Object {
    var AnalysisId: js.UndefOr[RestrictiveResourceId]
    var Arn: js.UndefOr[Arn]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var UpdateStatus: js.UndefOr[ResourceStatus]
  }

  object UpdateAnalysisResponse {
    @inline
    def apply(
        AnalysisId: js.UndefOr[RestrictiveResourceId] = js.undefined,
        Arn: js.UndefOr[Arn] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        UpdateStatus: js.UndefOr[ResourceStatus] = js.undefined
    ): UpdateAnalysisResponse = {
      val __obj = js.Dynamic.literal()
      AnalysisId.foreach(__v => __obj.updateDynamic("AnalysisId")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdateStatus.foreach(__v => __obj.updateDynamic("UpdateStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAnalysisResponse]
    }
  }

  @js.native
  trait UpdateDashboardPermissionsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DashboardId: RestrictiveResourceId
    var GrantLinkPermissions: js.UndefOr[UpdateLinkPermissionList]
    var GrantPermissions: js.UndefOr[UpdateResourcePermissionList]
    var RevokeLinkPermissions: js.UndefOr[UpdateLinkPermissionList]
    var RevokePermissions: js.UndefOr[UpdateResourcePermissionList]
  }

  object UpdateDashboardPermissionsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DashboardId: RestrictiveResourceId,
        GrantLinkPermissions: js.UndefOr[UpdateLinkPermissionList] = js.undefined,
        GrantPermissions: js.UndefOr[UpdateResourcePermissionList] = js.undefined,
        RevokeLinkPermissions: js.UndefOr[UpdateLinkPermissionList] = js.undefined,
        RevokePermissions: js.UndefOr[UpdateResourcePermissionList] = js.undefined
    ): UpdateDashboardPermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "DashboardId" -> DashboardId.asInstanceOf[js.Any]
      )

      GrantLinkPermissions.foreach(__v => __obj.updateDynamic("GrantLinkPermissions")(__v.asInstanceOf[js.Any]))
      GrantPermissions.foreach(__v => __obj.updateDynamic("GrantPermissions")(__v.asInstanceOf[js.Any]))
      RevokeLinkPermissions.foreach(__v => __obj.updateDynamic("RevokeLinkPermissions")(__v.asInstanceOf[js.Any]))
      RevokePermissions.foreach(__v => __obj.updateDynamic("RevokePermissions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDashboardPermissionsRequest]
    }
  }

  @js.native
  trait UpdateDashboardPermissionsResponse extends js.Object {
    var DashboardArn: js.UndefOr[Arn]
    var DashboardId: js.UndefOr[RestrictiveResourceId]
    var LinkSharingConfiguration: js.UndefOr[LinkSharingConfiguration]
    var Permissions: js.UndefOr[ResourcePermissionList]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object UpdateDashboardPermissionsResponse {
    @inline
    def apply(
        DashboardArn: js.UndefOr[Arn] = js.undefined,
        DashboardId: js.UndefOr[RestrictiveResourceId] = js.undefined,
        LinkSharingConfiguration: js.UndefOr[LinkSharingConfiguration] = js.undefined,
        Permissions: js.UndefOr[ResourcePermissionList] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): UpdateDashboardPermissionsResponse = {
      val __obj = js.Dynamic.literal()
      DashboardArn.foreach(__v => __obj.updateDynamic("DashboardArn")(__v.asInstanceOf[js.Any]))
      DashboardId.foreach(__v => __obj.updateDynamic("DashboardId")(__v.asInstanceOf[js.Any]))
      LinkSharingConfiguration.foreach(__v => __obj.updateDynamic("LinkSharingConfiguration")(__v.asInstanceOf[js.Any]))
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDashboardPermissionsResponse]
    }
  }

  @js.native
  trait UpdateDashboardPublishedVersionRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DashboardId: RestrictiveResourceId
    var VersionNumber: VersionNumber
  }

  object UpdateDashboardPublishedVersionRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DashboardId: RestrictiveResourceId,
        VersionNumber: VersionNumber
    ): UpdateDashboardPublishedVersionRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "DashboardId" -> DashboardId.asInstanceOf[js.Any],
        "VersionNumber" -> VersionNumber.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateDashboardPublishedVersionRequest]
    }
  }

  @js.native
  trait UpdateDashboardPublishedVersionResponse extends js.Object {
    var DashboardArn: js.UndefOr[Arn]
    var DashboardId: js.UndefOr[RestrictiveResourceId]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object UpdateDashboardPublishedVersionResponse {
    @inline
    def apply(
        DashboardArn: js.UndefOr[Arn] = js.undefined,
        DashboardId: js.UndefOr[RestrictiveResourceId] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): UpdateDashboardPublishedVersionResponse = {
      val __obj = js.Dynamic.literal()
      DashboardArn.foreach(__v => __obj.updateDynamic("DashboardArn")(__v.asInstanceOf[js.Any]))
      DashboardId.foreach(__v => __obj.updateDynamic("DashboardId")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDashboardPublishedVersionResponse]
    }
  }

  @js.native
  trait UpdateDashboardRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DashboardId: RestrictiveResourceId
    var Name: DashboardName
    var SourceEntity: DashboardSourceEntity
    var DashboardPublishOptions: js.UndefOr[DashboardPublishOptions]
    var Parameters: js.UndefOr[Parameters]
    var ThemeArn: js.UndefOr[Arn]
    var VersionDescription: js.UndefOr[VersionDescription]
  }

  object UpdateDashboardRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DashboardId: RestrictiveResourceId,
        Name: DashboardName,
        SourceEntity: DashboardSourceEntity,
        DashboardPublishOptions: js.UndefOr[DashboardPublishOptions] = js.undefined,
        Parameters: js.UndefOr[Parameters] = js.undefined,
        ThemeArn: js.UndefOr[Arn] = js.undefined,
        VersionDescription: js.UndefOr[VersionDescription] = js.undefined
    ): UpdateDashboardRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "DashboardId" -> DashboardId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "SourceEntity" -> SourceEntity.asInstanceOf[js.Any]
      )

      DashboardPublishOptions.foreach(__v => __obj.updateDynamic("DashboardPublishOptions")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      ThemeArn.foreach(__v => __obj.updateDynamic("ThemeArn")(__v.asInstanceOf[js.Any]))
      VersionDescription.foreach(__v => __obj.updateDynamic("VersionDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDashboardRequest]
    }
  }

  @js.native
  trait UpdateDashboardResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreationStatus: js.UndefOr[ResourceStatus]
    var DashboardId: js.UndefOr[RestrictiveResourceId]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var VersionArn: js.UndefOr[Arn]
  }

  object UpdateDashboardResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreationStatus: js.UndefOr[ResourceStatus] = js.undefined,
        DashboardId: js.UndefOr[RestrictiveResourceId] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        VersionArn: js.UndefOr[Arn] = js.undefined
    ): UpdateDashboardResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationStatus.foreach(__v => __obj.updateDynamic("CreationStatus")(__v.asInstanceOf[js.Any]))
      DashboardId.foreach(__v => __obj.updateDynamic("DashboardId")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      VersionArn.foreach(__v => __obj.updateDynamic("VersionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDashboardResponse]
    }
  }

  @js.native
  trait UpdateDataSetPermissionsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DataSetId: ResourceId
    var GrantPermissions: js.UndefOr[ResourcePermissionList]
    var RevokePermissions: js.UndefOr[ResourcePermissionList]
  }

  object UpdateDataSetPermissionsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DataSetId: ResourceId,
        GrantPermissions: js.UndefOr[ResourcePermissionList] = js.undefined,
        RevokePermissions: js.UndefOr[ResourcePermissionList] = js.undefined
    ): UpdateDataSetPermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "DataSetId" -> DataSetId.asInstanceOf[js.Any]
      )

      GrantPermissions.foreach(__v => __obj.updateDynamic("GrantPermissions")(__v.asInstanceOf[js.Any]))
      RevokePermissions.foreach(__v => __obj.updateDynamic("RevokePermissions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDataSetPermissionsRequest]
    }
  }

  @js.native
  trait UpdateDataSetPermissionsResponse extends js.Object {
    var DataSetArn: js.UndefOr[Arn]
    var DataSetId: js.UndefOr[ResourceId]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object UpdateDataSetPermissionsResponse {
    @inline
    def apply(
        DataSetArn: js.UndefOr[Arn] = js.undefined,
        DataSetId: js.UndefOr[ResourceId] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): UpdateDataSetPermissionsResponse = {
      val __obj = js.Dynamic.literal()
      DataSetArn.foreach(__v => __obj.updateDynamic("DataSetArn")(__v.asInstanceOf[js.Any]))
      DataSetId.foreach(__v => __obj.updateDynamic("DataSetId")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDataSetPermissionsResponse]
    }
  }

  @js.native
  trait UpdateDataSetRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DataSetId: ResourceId
    var ImportMode: DataSetImportMode
    var Name: ResourceName
    var PhysicalTableMap: PhysicalTableMap
    var ColumnGroups: js.UndefOr[ColumnGroupList]
    var ColumnLevelPermissionRules: js.UndefOr[ColumnLevelPermissionRuleList]
    var DataSetUsageConfiguration: js.UndefOr[DataSetUsageConfiguration]
    var FieldFolders: js.UndefOr[FieldFolderMap]
    var LogicalTableMap: js.UndefOr[LogicalTableMap]
    var RowLevelPermissionDataSet: js.UndefOr[RowLevelPermissionDataSet]
    var RowLevelPermissionTagConfiguration: js.UndefOr[RowLevelPermissionTagConfiguration]
  }

  object UpdateDataSetRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DataSetId: ResourceId,
        ImportMode: DataSetImportMode,
        Name: ResourceName,
        PhysicalTableMap: PhysicalTableMap,
        ColumnGroups: js.UndefOr[ColumnGroupList] = js.undefined,
        ColumnLevelPermissionRules: js.UndefOr[ColumnLevelPermissionRuleList] = js.undefined,
        DataSetUsageConfiguration: js.UndefOr[DataSetUsageConfiguration] = js.undefined,
        FieldFolders: js.UndefOr[FieldFolderMap] = js.undefined,
        LogicalTableMap: js.UndefOr[LogicalTableMap] = js.undefined,
        RowLevelPermissionDataSet: js.UndefOr[RowLevelPermissionDataSet] = js.undefined,
        RowLevelPermissionTagConfiguration: js.UndefOr[RowLevelPermissionTagConfiguration] = js.undefined
    ): UpdateDataSetRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "DataSetId" -> DataSetId.asInstanceOf[js.Any],
        "ImportMode" -> ImportMode.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "PhysicalTableMap" -> PhysicalTableMap.asInstanceOf[js.Any]
      )

      ColumnGroups.foreach(__v => __obj.updateDynamic("ColumnGroups")(__v.asInstanceOf[js.Any]))
      ColumnLevelPermissionRules.foreach(__v => __obj.updateDynamic("ColumnLevelPermissionRules")(__v.asInstanceOf[js.Any]))
      DataSetUsageConfiguration.foreach(__v => __obj.updateDynamic("DataSetUsageConfiguration")(__v.asInstanceOf[js.Any]))
      FieldFolders.foreach(__v => __obj.updateDynamic("FieldFolders")(__v.asInstanceOf[js.Any]))
      LogicalTableMap.foreach(__v => __obj.updateDynamic("LogicalTableMap")(__v.asInstanceOf[js.Any]))
      RowLevelPermissionDataSet.foreach(__v => __obj.updateDynamic("RowLevelPermissionDataSet")(__v.asInstanceOf[js.Any]))
      RowLevelPermissionTagConfiguration.foreach(__v => __obj.updateDynamic("RowLevelPermissionTagConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDataSetRequest]
    }
  }

  @js.native
  trait UpdateDataSetResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var DataSetId: js.UndefOr[ResourceId]
    var IngestionArn: js.UndefOr[Arn]
    var IngestionId: js.UndefOr[ResourceId]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object UpdateDataSetResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        DataSetId: js.UndefOr[ResourceId] = js.undefined,
        IngestionArn: js.UndefOr[Arn] = js.undefined,
        IngestionId: js.UndefOr[ResourceId] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): UpdateDataSetResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      DataSetId.foreach(__v => __obj.updateDynamic("DataSetId")(__v.asInstanceOf[js.Any]))
      IngestionArn.foreach(__v => __obj.updateDynamic("IngestionArn")(__v.asInstanceOf[js.Any]))
      IngestionId.foreach(__v => __obj.updateDynamic("IngestionId")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDataSetResponse]
    }
  }

  @js.native
  trait UpdateDataSourcePermissionsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DataSourceId: ResourceId
    var GrantPermissions: js.UndefOr[ResourcePermissionList]
    var RevokePermissions: js.UndefOr[ResourcePermissionList]
  }

  object UpdateDataSourcePermissionsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DataSourceId: ResourceId,
        GrantPermissions: js.UndefOr[ResourcePermissionList] = js.undefined,
        RevokePermissions: js.UndefOr[ResourcePermissionList] = js.undefined
    ): UpdateDataSourcePermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "DataSourceId" -> DataSourceId.asInstanceOf[js.Any]
      )

      GrantPermissions.foreach(__v => __obj.updateDynamic("GrantPermissions")(__v.asInstanceOf[js.Any]))
      RevokePermissions.foreach(__v => __obj.updateDynamic("RevokePermissions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDataSourcePermissionsRequest]
    }
  }

  @js.native
  trait UpdateDataSourcePermissionsResponse extends js.Object {
    var DataSourceArn: js.UndefOr[Arn]
    var DataSourceId: js.UndefOr[ResourceId]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object UpdateDataSourcePermissionsResponse {
    @inline
    def apply(
        DataSourceArn: js.UndefOr[Arn] = js.undefined,
        DataSourceId: js.UndefOr[ResourceId] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): UpdateDataSourcePermissionsResponse = {
      val __obj = js.Dynamic.literal()
      DataSourceArn.foreach(__v => __obj.updateDynamic("DataSourceArn")(__v.asInstanceOf[js.Any]))
      DataSourceId.foreach(__v => __obj.updateDynamic("DataSourceId")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDataSourcePermissionsResponse]
    }
  }

  @js.native
  trait UpdateDataSourceRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DataSourceId: ResourceId
    var Name: ResourceName
    var Credentials: js.UndefOr[DataSourceCredentials]
    var DataSourceParameters: js.UndefOr[DataSourceParameters]
    var SslProperties: js.UndefOr[SslProperties]
    var VpcConnectionProperties: js.UndefOr[VpcConnectionProperties]
  }

  object UpdateDataSourceRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DataSourceId: ResourceId,
        Name: ResourceName,
        Credentials: js.UndefOr[DataSourceCredentials] = js.undefined,
        DataSourceParameters: js.UndefOr[DataSourceParameters] = js.undefined,
        SslProperties: js.UndefOr[SslProperties] = js.undefined,
        VpcConnectionProperties: js.UndefOr[VpcConnectionProperties] = js.undefined
    ): UpdateDataSourceRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "DataSourceId" -> DataSourceId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Credentials.foreach(__v => __obj.updateDynamic("Credentials")(__v.asInstanceOf[js.Any]))
      DataSourceParameters.foreach(__v => __obj.updateDynamic("DataSourceParameters")(__v.asInstanceOf[js.Any]))
      SslProperties.foreach(__v => __obj.updateDynamic("SslProperties")(__v.asInstanceOf[js.Any]))
      VpcConnectionProperties.foreach(__v => __obj.updateDynamic("VpcConnectionProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDataSourceRequest]
    }
  }

  @js.native
  trait UpdateDataSourceResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var DataSourceId: js.UndefOr[ResourceId]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var UpdateStatus: js.UndefOr[ResourceStatus]
  }

  object UpdateDataSourceResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        DataSourceId: js.UndefOr[ResourceId] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        UpdateStatus: js.UndefOr[ResourceStatus] = js.undefined
    ): UpdateDataSourceResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      DataSourceId.foreach(__v => __obj.updateDynamic("DataSourceId")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdateStatus.foreach(__v => __obj.updateDynamic("UpdateStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDataSourceResponse]
    }
  }

  @js.native
  trait UpdateFolderPermissionsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var FolderId: RestrictiveResourceId
    var GrantPermissions: js.UndefOr[ResourcePermissionList]
    var RevokePermissions: js.UndefOr[ResourcePermissionList]
  }

  object UpdateFolderPermissionsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        FolderId: RestrictiveResourceId,
        GrantPermissions: js.UndefOr[ResourcePermissionList] = js.undefined,
        RevokePermissions: js.UndefOr[ResourcePermissionList] = js.undefined
    ): UpdateFolderPermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "FolderId" -> FolderId.asInstanceOf[js.Any]
      )

      GrantPermissions.foreach(__v => __obj.updateDynamic("GrantPermissions")(__v.asInstanceOf[js.Any]))
      RevokePermissions.foreach(__v => __obj.updateDynamic("RevokePermissions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFolderPermissionsRequest]
    }
  }

  @js.native
  trait UpdateFolderPermissionsResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var FolderId: js.UndefOr[RestrictiveResourceId]
    var Permissions: js.UndefOr[ResourcePermissionList]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object UpdateFolderPermissionsResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        FolderId: js.UndefOr[RestrictiveResourceId] = js.undefined,
        Permissions: js.UndefOr[ResourcePermissionList] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): UpdateFolderPermissionsResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      FolderId.foreach(__v => __obj.updateDynamic("FolderId")(__v.asInstanceOf[js.Any]))
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFolderPermissionsResponse]
    }
  }

  @js.native
  trait UpdateFolderRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var FolderId: RestrictiveResourceId
    var Name: FolderName
  }

  object UpdateFolderRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        FolderId: RestrictiveResourceId,
        Name: FolderName
    ): UpdateFolderRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "FolderId" -> FolderId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateFolderRequest]
    }
  }

  @js.native
  trait UpdateFolderResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var FolderId: js.UndefOr[RestrictiveResourceId]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object UpdateFolderResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        FolderId: js.UndefOr[RestrictiveResourceId] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): UpdateFolderResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      FolderId.foreach(__v => __obj.updateDynamic("FolderId")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFolderResponse]
    }
  }

  @js.native
  trait UpdateGroupRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var GroupName: GroupName
    var Namespace: Namespace
    var Description: js.UndefOr[GroupDescription]
  }

  object UpdateGroupRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        GroupName: GroupName,
        Namespace: Namespace,
        Description: js.UndefOr[GroupDescription] = js.undefined
    ): UpdateGroupRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "GroupName" -> GroupName.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGroupRequest]
    }
  }

  @js.native
  trait UpdateGroupResponse extends js.Object {
    var Group: js.UndefOr[Group]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object UpdateGroupResponse {
    @inline
    def apply(
        Group: js.UndefOr[Group] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): UpdateGroupResponse = {
      val __obj = js.Dynamic.literal()
      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGroupResponse]
    }
  }

  @js.native
  trait UpdateIAMPolicyAssignmentRequest extends js.Object {
    var AssignmentName: IAMPolicyAssignmentName
    var AwsAccountId: AwsAccountId
    var Namespace: Namespace
    var AssignmentStatus: js.UndefOr[AssignmentStatus]
    var Identities: js.UndefOr[IdentityMap]
    var PolicyArn: js.UndefOr[Arn]
  }

  object UpdateIAMPolicyAssignmentRequest {
    @inline
    def apply(
        AssignmentName: IAMPolicyAssignmentName,
        AwsAccountId: AwsAccountId,
        Namespace: Namespace,
        AssignmentStatus: js.UndefOr[AssignmentStatus] = js.undefined,
        Identities: js.UndefOr[IdentityMap] = js.undefined,
        PolicyArn: js.UndefOr[Arn] = js.undefined
    ): UpdateIAMPolicyAssignmentRequest = {
      val __obj = js.Dynamic.literal(
        "AssignmentName" -> AssignmentName.asInstanceOf[js.Any],
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any]
      )

      AssignmentStatus.foreach(__v => __obj.updateDynamic("AssignmentStatus")(__v.asInstanceOf[js.Any]))
      Identities.foreach(__v => __obj.updateDynamic("Identities")(__v.asInstanceOf[js.Any]))
      PolicyArn.foreach(__v => __obj.updateDynamic("PolicyArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateIAMPolicyAssignmentRequest]
    }
  }

  @js.native
  trait UpdateIAMPolicyAssignmentResponse extends js.Object {
    var AssignmentId: js.UndefOr[String]
    var AssignmentName: js.UndefOr[IAMPolicyAssignmentName]
    var AssignmentStatus: js.UndefOr[AssignmentStatus]
    var Identities: js.UndefOr[IdentityMap]
    var PolicyArn: js.UndefOr[Arn]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object UpdateIAMPolicyAssignmentResponse {
    @inline
    def apply(
        AssignmentId: js.UndefOr[String] = js.undefined,
        AssignmentName: js.UndefOr[IAMPolicyAssignmentName] = js.undefined,
        AssignmentStatus: js.UndefOr[AssignmentStatus] = js.undefined,
        Identities: js.UndefOr[IdentityMap] = js.undefined,
        PolicyArn: js.UndefOr[Arn] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): UpdateIAMPolicyAssignmentResponse = {
      val __obj = js.Dynamic.literal()
      AssignmentId.foreach(__v => __obj.updateDynamic("AssignmentId")(__v.asInstanceOf[js.Any]))
      AssignmentName.foreach(__v => __obj.updateDynamic("AssignmentName")(__v.asInstanceOf[js.Any]))
      AssignmentStatus.foreach(__v => __obj.updateDynamic("AssignmentStatus")(__v.asInstanceOf[js.Any]))
      Identities.foreach(__v => __obj.updateDynamic("Identities")(__v.asInstanceOf[js.Any]))
      PolicyArn.foreach(__v => __obj.updateDynamic("PolicyArn")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateIAMPolicyAssignmentResponse]
    }
  }

  @js.native
  trait UpdateIpRestrictionRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Enabled: js.UndefOr[NullableBoolean]
    var IpRestrictionRuleMap: js.UndefOr[IpRestrictionRuleMap]
  }

  object UpdateIpRestrictionRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        Enabled: js.UndefOr[NullableBoolean] = js.undefined,
        IpRestrictionRuleMap: js.UndefOr[IpRestrictionRuleMap] = js.undefined
    ): UpdateIpRestrictionRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any]
      )

      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      IpRestrictionRuleMap.foreach(__v => __obj.updateDynamic("IpRestrictionRuleMap")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateIpRestrictionRequest]
    }
  }

  @js.native
  trait UpdateIpRestrictionResponse extends js.Object {
    var AwsAccountId: js.UndefOr[AwsAccountId]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object UpdateIpRestrictionResponse {
    @inline
    def apply(
        AwsAccountId: js.UndefOr[AwsAccountId] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): UpdateIpRestrictionResponse = {
      val __obj = js.Dynamic.literal()
      AwsAccountId.foreach(__v => __obj.updateDynamic("AwsAccountId")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateIpRestrictionResponse]
    }
  }

  @js.native
  trait UpdateTemplateAliasRequest extends js.Object {
    var AliasName: AliasName
    var AwsAccountId: AwsAccountId
    var TemplateId: RestrictiveResourceId
    var TemplateVersionNumber: VersionNumber
  }

  object UpdateTemplateAliasRequest {
    @inline
    def apply(
        AliasName: AliasName,
        AwsAccountId: AwsAccountId,
        TemplateId: RestrictiveResourceId,
        TemplateVersionNumber: VersionNumber
    ): UpdateTemplateAliasRequest = {
      val __obj = js.Dynamic.literal(
        "AliasName" -> AliasName.asInstanceOf[js.Any],
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "TemplateId" -> TemplateId.asInstanceOf[js.Any],
        "TemplateVersionNumber" -> TemplateVersionNumber.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateTemplateAliasRequest]
    }
  }

  @js.native
  trait UpdateTemplateAliasResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var TemplateAlias: js.UndefOr[TemplateAlias]
  }

  object UpdateTemplateAliasResponse {
    @inline
    def apply(
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        TemplateAlias: js.UndefOr[TemplateAlias] = js.undefined
    ): UpdateTemplateAliasResponse = {
      val __obj = js.Dynamic.literal()
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TemplateAlias.foreach(__v => __obj.updateDynamic("TemplateAlias")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTemplateAliasResponse]
    }
  }

  @js.native
  trait UpdateTemplatePermissionsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var TemplateId: RestrictiveResourceId
    var GrantPermissions: js.UndefOr[UpdateResourcePermissionList]
    var RevokePermissions: js.UndefOr[UpdateResourcePermissionList]
  }

  object UpdateTemplatePermissionsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        TemplateId: RestrictiveResourceId,
        GrantPermissions: js.UndefOr[UpdateResourcePermissionList] = js.undefined,
        RevokePermissions: js.UndefOr[UpdateResourcePermissionList] = js.undefined
    ): UpdateTemplatePermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "TemplateId" -> TemplateId.asInstanceOf[js.Any]
      )

      GrantPermissions.foreach(__v => __obj.updateDynamic("GrantPermissions")(__v.asInstanceOf[js.Any]))
      RevokePermissions.foreach(__v => __obj.updateDynamic("RevokePermissions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTemplatePermissionsRequest]
    }
  }

  @js.native
  trait UpdateTemplatePermissionsResponse extends js.Object {
    var Permissions: js.UndefOr[ResourcePermissionList]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var TemplateArn: js.UndefOr[Arn]
    var TemplateId: js.UndefOr[RestrictiveResourceId]
  }

  object UpdateTemplatePermissionsResponse {
    @inline
    def apply(
        Permissions: js.UndefOr[ResourcePermissionList] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        TemplateArn: js.UndefOr[Arn] = js.undefined,
        TemplateId: js.UndefOr[RestrictiveResourceId] = js.undefined
    ): UpdateTemplatePermissionsResponse = {
      val __obj = js.Dynamic.literal()
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TemplateArn.foreach(__v => __obj.updateDynamic("TemplateArn")(__v.asInstanceOf[js.Any]))
      TemplateId.foreach(__v => __obj.updateDynamic("TemplateId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTemplatePermissionsResponse]
    }
  }

  @js.native
  trait UpdateTemplateRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var SourceEntity: TemplateSourceEntity
    var TemplateId: RestrictiveResourceId
    var Name: js.UndefOr[TemplateName]
    var VersionDescription: js.UndefOr[VersionDescription]
  }

  object UpdateTemplateRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        SourceEntity: TemplateSourceEntity,
        TemplateId: RestrictiveResourceId,
        Name: js.UndefOr[TemplateName] = js.undefined,
        VersionDescription: js.UndefOr[VersionDescription] = js.undefined
    ): UpdateTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "SourceEntity" -> SourceEntity.asInstanceOf[js.Any],
        "TemplateId" -> TemplateId.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      VersionDescription.foreach(__v => __obj.updateDynamic("VersionDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTemplateRequest]
    }
  }

  @js.native
  trait UpdateTemplateResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreationStatus: js.UndefOr[ResourceStatus]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var TemplateId: js.UndefOr[RestrictiveResourceId]
    var VersionArn: js.UndefOr[Arn]
  }

  object UpdateTemplateResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreationStatus: js.UndefOr[ResourceStatus] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        TemplateId: js.UndefOr[RestrictiveResourceId] = js.undefined,
        VersionArn: js.UndefOr[Arn] = js.undefined
    ): UpdateTemplateResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationStatus.foreach(__v => __obj.updateDynamic("CreationStatus")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TemplateId.foreach(__v => __obj.updateDynamic("TemplateId")(__v.asInstanceOf[js.Any]))
      VersionArn.foreach(__v => __obj.updateDynamic("VersionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTemplateResponse]
    }
  }

  @js.native
  trait UpdateThemeAliasRequest extends js.Object {
    var AliasName: AliasName
    var AwsAccountId: AwsAccountId
    var ThemeId: RestrictiveResourceId
    var ThemeVersionNumber: VersionNumber
  }

  object UpdateThemeAliasRequest {
    @inline
    def apply(
        AliasName: AliasName,
        AwsAccountId: AwsAccountId,
        ThemeId: RestrictiveResourceId,
        ThemeVersionNumber: VersionNumber
    ): UpdateThemeAliasRequest = {
      val __obj = js.Dynamic.literal(
        "AliasName" -> AliasName.asInstanceOf[js.Any],
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "ThemeId" -> ThemeId.asInstanceOf[js.Any],
        "ThemeVersionNumber" -> ThemeVersionNumber.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateThemeAliasRequest]
    }
  }

  @js.native
  trait UpdateThemeAliasResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var ThemeAlias: js.UndefOr[ThemeAlias]
  }

  object UpdateThemeAliasResponse {
    @inline
    def apply(
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        ThemeAlias: js.UndefOr[ThemeAlias] = js.undefined
    ): UpdateThemeAliasResponse = {
      val __obj = js.Dynamic.literal()
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      ThemeAlias.foreach(__v => __obj.updateDynamic("ThemeAlias")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateThemeAliasResponse]
    }
  }

  @js.native
  trait UpdateThemePermissionsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var ThemeId: RestrictiveResourceId
    var GrantPermissions: js.UndefOr[UpdateResourcePermissionList]
    var RevokePermissions: js.UndefOr[UpdateResourcePermissionList]
  }

  object UpdateThemePermissionsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        ThemeId: RestrictiveResourceId,
        GrantPermissions: js.UndefOr[UpdateResourcePermissionList] = js.undefined,
        RevokePermissions: js.UndefOr[UpdateResourcePermissionList] = js.undefined
    ): UpdateThemePermissionsRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "ThemeId" -> ThemeId.asInstanceOf[js.Any]
      )

      GrantPermissions.foreach(__v => __obj.updateDynamic("GrantPermissions")(__v.asInstanceOf[js.Any]))
      RevokePermissions.foreach(__v => __obj.updateDynamic("RevokePermissions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateThemePermissionsRequest]
    }
  }

  @js.native
  trait UpdateThemePermissionsResponse extends js.Object {
    var Permissions: js.UndefOr[ResourcePermissionList]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var ThemeArn: js.UndefOr[Arn]
    var ThemeId: js.UndefOr[RestrictiveResourceId]
  }

  object UpdateThemePermissionsResponse {
    @inline
    def apply(
        Permissions: js.UndefOr[ResourcePermissionList] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        ThemeArn: js.UndefOr[Arn] = js.undefined,
        ThemeId: js.UndefOr[RestrictiveResourceId] = js.undefined
    ): UpdateThemePermissionsResponse = {
      val __obj = js.Dynamic.literal()
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      ThemeArn.foreach(__v => __obj.updateDynamic("ThemeArn")(__v.asInstanceOf[js.Any]))
      ThemeId.foreach(__v => __obj.updateDynamic("ThemeId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateThemePermissionsResponse]
    }
  }

  @js.native
  trait UpdateThemeRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var BaseThemeId: RestrictiveResourceId
    var ThemeId: RestrictiveResourceId
    var Configuration: js.UndefOr[ThemeConfiguration]
    var Name: js.UndefOr[ThemeName]
    var VersionDescription: js.UndefOr[VersionDescription]
  }

  object UpdateThemeRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        BaseThemeId: RestrictiveResourceId,
        ThemeId: RestrictiveResourceId,
        Configuration: js.UndefOr[ThemeConfiguration] = js.undefined,
        Name: js.UndefOr[ThemeName] = js.undefined,
        VersionDescription: js.UndefOr[VersionDescription] = js.undefined
    ): UpdateThemeRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "BaseThemeId" -> BaseThemeId.asInstanceOf[js.Any],
        "ThemeId" -> ThemeId.asInstanceOf[js.Any]
      )

      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      VersionDescription.foreach(__v => __obj.updateDynamic("VersionDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateThemeRequest]
    }
  }

  @js.native
  trait UpdateThemeResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreationStatus: js.UndefOr[ResourceStatus]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var ThemeId: js.UndefOr[RestrictiveResourceId]
    var VersionArn: js.UndefOr[Arn]
  }

  object UpdateThemeResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreationStatus: js.UndefOr[ResourceStatus] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        ThemeId: js.UndefOr[RestrictiveResourceId] = js.undefined,
        VersionArn: js.UndefOr[Arn] = js.undefined
    ): UpdateThemeResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationStatus.foreach(__v => __obj.updateDynamic("CreationStatus")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      ThemeId.foreach(__v => __obj.updateDynamic("ThemeId")(__v.asInstanceOf[js.Any]))
      VersionArn.foreach(__v => __obj.updateDynamic("VersionArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateThemeResponse]
    }
  }

  @js.native
  trait UpdateUserRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Email: String
    var Namespace: Namespace
    var Role: UserRole
    var UserName: UserName
    var CustomFederationProviderUrl: js.UndefOr[String]
    var CustomPermissionsName: js.UndefOr[RoleName]
    var ExternalLoginFederationProviderType: js.UndefOr[String]
    var ExternalLoginId: js.UndefOr[String]
    var UnapplyCustomPermissions: js.UndefOr[Boolean]
  }

  object UpdateUserRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        Email: String,
        Namespace: Namespace,
        Role: UserRole,
        UserName: UserName,
        CustomFederationProviderUrl: js.UndefOr[String] = js.undefined,
        CustomPermissionsName: js.UndefOr[RoleName] = js.undefined,
        ExternalLoginFederationProviderType: js.UndefOr[String] = js.undefined,
        ExternalLoginId: js.UndefOr[String] = js.undefined,
        UnapplyCustomPermissions: js.UndefOr[Boolean] = js.undefined
    ): UpdateUserRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Email" -> Email.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any],
        "Role" -> Role.asInstanceOf[js.Any],
        "UserName" -> UserName.asInstanceOf[js.Any]
      )

      CustomFederationProviderUrl.foreach(__v => __obj.updateDynamic("CustomFederationProviderUrl")(__v.asInstanceOf[js.Any]))
      CustomPermissionsName.foreach(__v => __obj.updateDynamic("CustomPermissionsName")(__v.asInstanceOf[js.Any]))
      ExternalLoginFederationProviderType.foreach(__v => __obj.updateDynamic("ExternalLoginFederationProviderType")(__v.asInstanceOf[js.Any]))
      ExternalLoginId.foreach(__v => __obj.updateDynamic("ExternalLoginId")(__v.asInstanceOf[js.Any]))
      UnapplyCustomPermissions.foreach(__v => __obj.updateDynamic("UnapplyCustomPermissions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserRequest]
    }
  }

  @js.native
  trait UpdateUserResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var User: js.UndefOr[User]
  }

  object UpdateUserResponse {
    @inline
    def apply(
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        User: js.UndefOr[User] = js.undefined
    ): UpdateUserResponse = {
      val __obj = js.Dynamic.literal()
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      User.foreach(__v => __obj.updateDynamic("User")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserResponse]
    }
  }

  /** Information about the format for a source file or files.
    */
  @js.native
  trait UploadSettings extends js.Object {
    var ContainsHeader: js.UndefOr[Boolean]
    var Delimiter: js.UndefOr[Delimiter]
    var Format: js.UndefOr[FileFormat]
    var StartFromRow: js.UndefOr[PositiveInteger]
    var TextQualifier: js.UndefOr[TextQualifier]
  }

  object UploadSettings {
    @inline
    def apply(
        ContainsHeader: js.UndefOr[Boolean] = js.undefined,
        Delimiter: js.UndefOr[Delimiter] = js.undefined,
        Format: js.UndefOr[FileFormat] = js.undefined,
        StartFromRow: js.UndefOr[PositiveInteger] = js.undefined,
        TextQualifier: js.UndefOr[TextQualifier] = js.undefined
    ): UploadSettings = {
      val __obj = js.Dynamic.literal()
      ContainsHeader.foreach(__v => __obj.updateDynamic("ContainsHeader")(__v.asInstanceOf[js.Any]))
      Delimiter.foreach(__v => __obj.updateDynamic("Delimiter")(__v.asInstanceOf[js.Any]))
      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      StartFromRow.foreach(__v => __obj.updateDynamic("StartFromRow")(__v.asInstanceOf[js.Any]))
      TextQualifier.foreach(__v => __obj.updateDynamic("TextQualifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UploadSettings]
    }
  }

  /** A registered user of Amazon QuickSight.
    */
  @js.native
  trait User extends js.Object {
    var Active: js.UndefOr[Boolean]
    var Arn: js.UndefOr[Arn]
    var CustomPermissionsName: js.UndefOr[RoleName]
    var Email: js.UndefOr[String]
    var ExternalLoginFederationProviderType: js.UndefOr[String]
    var ExternalLoginFederationProviderUrl: js.UndefOr[String]
    var ExternalLoginId: js.UndefOr[String]
    var IdentityType: js.UndefOr[IdentityType]
    var PrincipalId: js.UndefOr[String]
    var Role: js.UndefOr[UserRole]
    var UserName: js.UndefOr[UserName]
  }

  object User {
    @inline
    def apply(
        Active: js.UndefOr[Boolean] = js.undefined,
        Arn: js.UndefOr[Arn] = js.undefined,
        CustomPermissionsName: js.UndefOr[RoleName] = js.undefined,
        Email: js.UndefOr[String] = js.undefined,
        ExternalLoginFederationProviderType: js.UndefOr[String] = js.undefined,
        ExternalLoginFederationProviderUrl: js.UndefOr[String] = js.undefined,
        ExternalLoginId: js.UndefOr[String] = js.undefined,
        IdentityType: js.UndefOr[IdentityType] = js.undefined,
        PrincipalId: js.UndefOr[String] = js.undefined,
        Role: js.UndefOr[UserRole] = js.undefined,
        UserName: js.UndefOr[UserName] = js.undefined
    ): User = {
      val __obj = js.Dynamic.literal()
      Active.foreach(__v => __obj.updateDynamic("Active")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CustomPermissionsName.foreach(__v => __obj.updateDynamic("CustomPermissionsName")(__v.asInstanceOf[js.Any]))
      Email.foreach(__v => __obj.updateDynamic("Email")(__v.asInstanceOf[js.Any]))
      ExternalLoginFederationProviderType.foreach(__v => __obj.updateDynamic("ExternalLoginFederationProviderType")(__v.asInstanceOf[js.Any]))
      ExternalLoginFederationProviderUrl.foreach(__v => __obj.updateDynamic("ExternalLoginFederationProviderUrl")(__v.asInstanceOf[js.Any]))
      ExternalLoginId.foreach(__v => __obj.updateDynamic("ExternalLoginId")(__v.asInstanceOf[js.Any]))
      IdentityType.foreach(__v => __obj.updateDynamic("IdentityType")(__v.asInstanceOf[js.Any]))
      PrincipalId.foreach(__v => __obj.updateDynamic("PrincipalId")(__v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.updateDynamic("Role")(__v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.updateDynamic("UserName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[User]
    }
  }

  /** VPC connection properties.
    */
  @js.native
  trait VpcConnectionProperties extends js.Object {
    var VpcConnectionArn: Arn
  }

  object VpcConnectionProperties {
    @inline
    def apply(
        VpcConnectionArn: Arn
    ): VpcConnectionProperties = {
      val __obj = js.Dynamic.literal(
        "VpcConnectionArn" -> VpcConnectionArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VpcConnectionProperties]
    }
  }
}
