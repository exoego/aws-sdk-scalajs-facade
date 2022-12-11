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
  type AdditionalDashboardIdList = js.Array[ShortRestrictiveResourceId]
  type AggregationSortConfigurationList = js.Array[AggregationSortConfiguration]
  type AliasName = String
  type AnalysisErrorList = js.Array[AnalysisError]
  type AnalysisName = String
  type AnalysisSearchFilterList = js.Array[AnalysisSearchFilter]
  type AnalysisSummaryList = js.Array[AnalysisSummary]
  type Arn = String
  type ArnList = js.Array[Arn]
  type AwsAccountId = String
  type AwsAndAccountId = String
  type AxisLabelOptionsList = js.Array[AxisLabelOptions]
  type BinCountLimit = Double
  type BinCountValue = Int
  type BinWidthValue = Double
  type BodySectionConfigurationList = js.Array[BodySectionConfiguration]
  type BooleanObject = Boolean
  type BoxPlotDimensionFieldList = js.Array[DimensionField]
  type BoxPlotMeasureFieldList = js.Array[MeasureField]
  type CIDR = String
  type CalculatedColumnList = js.Array[CalculatedColumn]
  type CalculatedFields = js.Array[CalculatedField]
  type CascadingControlSourceList = js.Array[CascadingControlSource]
  type Catalog = String
  type CategoryValue = String
  type CategoryValueList = js.Array[CategoryValue]
  type ClusterId = String
  type ColorList = js.Array[HexColor]
  type ColorScaleColorList = js.Array[DataColor]
  type ColumnConfigurationList = js.Array[ColumnConfiguration]
  type ColumnDescriptiveText = String
  type ColumnGroupColumnSchemaList = js.Array[ColumnGroupColumnSchema]
  type ColumnGroupList = js.Array[ColumnGroup]
  type ColumnGroupName = String
  type ColumnGroupSchemaList = js.Array[ColumnGroupSchema]
  type ColumnHierarchyList = js.Array[ColumnHierarchy]
  type ColumnId = String
  type ColumnLevelPermissionRuleList = js.Array[ColumnLevelPermissionRule]
  type ColumnList = js.Array[ColumnName]
  type ColumnName = String
  type ColumnNameList = js.Array[String]
  type ColumnSchemaList = js.Array[ColumnSchema]
  type ColumnTagList = js.Array[ColumnTag]
  type ColumnTagNames = js.Array[ColumnTagName]
  type ComputationList = js.Array[Computation]
  type ContributionAnalysisDefaultList = js.Array[ContributionAnalysisDefault]
  type ContributorDimensionList = js.Array[ColumnIdentifier]
  type CopySourceArn = String
  type CurrencyCode = String
  type CustomLabel = String
  type CustomSqlName = String
  type DashboardErrorList = js.Array[DashboardError]
  type DashboardName = String
  type DashboardSearchFilterList = js.Array[DashboardSearchFilter]
  type DashboardSummaryList = js.Array[DashboardSummary]
  type DashboardVersionSummaryList = js.Array[DashboardVersionSummary]
  type DataLabelTypes = js.Array[DataLabelType]
  type DataPathColorList = js.Array[DataPathColor]
  type DataPathValueList = js.Array[DataPathValue]
  type DataSetArnsList = js.Array[Arn]
  type DataSetConfigurationList = js.Array[DataSetConfiguration]
  type DataSetIdentifier = String
  type DataSetIdentifierDeclarationList = js.Array[DataSetIdentifierDeclaration]
  type DataSetName = String
  type DataSetReferenceList = js.Array[DataSetReference]
  type DataSetSearchFilterList = js.Array[DataSetSearchFilter]
  type DataSetSummaryList = js.Array[DataSetSummary]
  type DataSourceList = js.Array[DataSource]
  type DataSourceParametersList = js.Array[DataSourceParameters]
  type DataSourceSearchFilterList = js.Array[DataSourceSearchFilter]
  type DataSourceSummaryList = js.Array[DataSourceSummary]
  type Database = String
  type DateTimeDefaultValueList = js.Array[SensitiveTimestamp]
  type DateTimeFormat = String
  type DateTimeParameterList = js.Array[DateTimeParameter]
  type DecimalDefaultValueList = js.Array[SensitiveDoubleObject]
  type DecimalParameterList = js.Array[DecimalParameter]
  type DecimalPlaces = Double
  type Delimiter = String
  type DimensionFieldList = js.Array[DimensionField]
  type Domain = String
  type DrillDownFilterList = js.Array[DrillDownFilter]
  type EmbeddingUrl = String
  type EntityList = js.Array[Entity]
  type EntryPath = String
  type EntryPoint = String
  type ExplicitHierarchyColumnList = js.Array[ColumnIdentifier]
  type Expression = String
  type FieldFolderDescription = String
  type FieldFolderMap = js.Dictionary[FieldFolder]
  type FieldFolderPath = String
  type FieldId = String
  type FieldOrderList = js.Array[FieldId]
  type FieldSortOptionsList = js.Array[FieldSortOptions]
  type FieldValue = String
  type FilledMapConditionalFormattingOptionList = js.Array[FilledMapConditionalFormattingOption]
  type FilledMapDimensionFieldList = js.Array[DimensionField]
  type FilledMapMeasureFieldList = js.Array[MeasureField]
  type FilterControlList = js.Array[FilterControl]
  type FilterGroupList = js.Array[FilterGroup]
  type FilterList = js.Array[Filter]
  type FilteredVisualsList = js.Array[ShortRestrictiveResourceId]
  type FolderColumnList = js.Array[String]
  type FolderMemberList = js.Array[MemberIdArnPair]
  type FolderName = String
  type FolderSearchFilterList = js.Array[FolderSearchFilter]
  type FolderSummaryList = js.Array[FolderSummary]
  type FontList = js.Array[Font]
  type ForecastComputationCustomSeasonalityValue = Int
  type ForecastConfigurationList = js.Array[ForecastConfiguration]
  type FreeFromLayoutElementList = js.Array[FreeFormLayoutElement]
  type FunnelChartDimensionFieldList = js.Array[DimensionField]
  type FunnelChartMeasureFieldList = js.Array[MeasureField]
  type GaugeChartConditionalFormattingOptionList = js.Array[GaugeChartConditionalFormattingOption]
  type GradientStopList = js.Array[GradientStop]
  type GridLayoutElementColumnIndex = Int
  type GridLayoutElementColumnSpan = Int
  type GridLayoutElementList = js.Array[GridLayoutElement]
  type GridLayoutElementRowIndex = Int
  type GridLayoutElementRowSpan = Int
  type GroupDescription = String
  type GroupList = js.Array[Group]
  type GroupMemberList = js.Array[GroupMember]
  type GroupMemberName = String
  type GroupName = String
  type GroupSearchFilterList = js.Array[GroupSearchFilter]
  type GroupsList = js.Array[String]
  type GrowthRatePeriodSize = Int
  type HeaderFooterSectionConfigurationList = js.Array[HeaderFooterSectionConfiguration]
  type HeatMapDimensionFieldList = js.Array[DimensionField]
  type HeatMapMeasureFieldList = js.Array[MeasureField]
  type HexColor = String
  type HexColorWithTransparency = String
  type HierarchyId = String
  type HistogramMeasureFieldList = js.Array[MeasureField]
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
  type IntegerDefaultValueList = js.Array[SensitiveLongObject]
  type IntegerParameterList = js.Array[IntegerParameter]
  type IpRestrictionRuleDescription = String
  type IpRestrictionRuleMap = js.Dictionary[IpRestrictionRuleDescription]
  type KPIConditionalFormattingOptionList = js.Array[KPIConditionalFormattingOption]
  type Latitude = Double
  type LayoutList = js.Array[Layout]
  type Length = String
  type LogicalTableAlias = String
  type LogicalTableId = String
  type LogicalTableMap = js.Dictionary[LogicalTable]
  type LongPlainText = String
  type LongRichText = String
  type Longitude = Double
  type MaxResults = Int
  type MeasureFieldList = js.Array[MeasureField]
  type MissingDataConfigurationList = js.Array[MissingDataConfiguration]
  type Namespace = String
  type Namespaces = js.Array[NamespaceInfoV2]
  type NarrativeString = String
  type NonEmptyString = String
  type NullString = String
  type NullableBoolean = Boolean
  type OnClause = String
  type OptionalPort = Int
  type OutputColumnList = js.Array[OutputColumn]
  type PageNumber = Double
  type ParameterControlList = js.Array[ParameterControl]
  type ParameterDeclarationList = js.Array[ParameterDeclaration]
  type ParameterName = String
  type ParameterSelectableValueList = js.Array[String]
  type Password = String
  type Path = js.Array[Arn]
  type PercentNumber = Double
  type PercentileValue = Double
  type PeriodsBackward = Int
  type PeriodsForward = Int
  type PhysicalTableId = String
  type PhysicalTableMap = js.Dictionary[PhysicalTable]
  type PivotFieldSortOptionsList = js.Array[PivotFieldSortOptions]
  type PivotMeasureFieldList = js.Array[MeasureField]
  type PivotTableConditionalFormattingOptionList = js.Array[PivotTableConditionalFormattingOption]
  type PivotTableDataPathOptionList = js.Array[PivotTableDataPathOption]
  type PivotTableDimensionList = js.Array[DimensionField]
  type PivotTableFieldOptionList = js.Array[PivotTableFieldOption]
  type PivotTableFieldSubtotalOptionsList = js.Array[PivotTableFieldSubtotalOptions]
  type PixelLength = String
  type Port = Int
  type PositiveInteger = Int
  type PredefinedHierarchyColumnList = js.Array[ColumnIdentifier]
  type PredictionInterval = Int
  type Prefix = String
  type Principal = String
  type PrincipalList = js.Array[String]
  type ProjectedColumnList = js.Array[String]
  type Query = String
  type RecoveryWindowInDays = Double
  type ReferenceLineList = js.Array[ReferenceLine]
  type RelationalTableCatalog = String
  type RelationalTableName = String
  type RelationalTableSchema = String
  type ResourceId = String
  type ResourceName = String
  type ResourcePermissionList = js.Array[ResourcePermission]
  type RestrictiveResourceId = String
  type RoleArn = String
  type RoleName = String
  type RoleSessionName = String
  type RowAlternateColorList = js.Array[HexColor]
  type RowLevelPermissionTagDelimiter = String
  type RowLevelPermissionTagRuleList = js.Array[RowLevelPermissionTagRule]
  type RowSortList = js.Array[FieldSortOptions]
  type S3Bucket = String
  type S3Key = String
  type Seasonality = Int
  type SecretArn = String
  type SelectedFieldList = js.Array[FieldId]
  type SensitiveDouble = Double
  type SensitiveDoubleList = js.Array[SensitiveDouble]
  type SensitiveDoubleObject = Double
  type SensitiveLong = Double
  type SensitiveLongList = js.Array[SensitiveLong]
  type SensitiveLongObject = Double
  type SensitiveString = String
  type SensitiveStringList = js.Array[SensitiveString]
  type SensitiveStringObject = String
  type SensitiveTimestamp = js.Date
  type SensitiveTimestampList = js.Array[SensitiveTimestamp]
  type SeriesItemList = js.Array[SeriesItem]
  type SessionLifetimeInMinutes = Double
  type SessionTagKey = String
  type SessionTagList = js.Array[SessionTag]
  type SessionTagValue = String
  type SetParameterValueConfigurationList = js.Array[SetParameterValueConfiguration]
  type SheetControlLayoutList = js.Array[SheetControlLayout]
  type SheetControlTitle = String
  type SheetDefinitionList = js.Array[SheetDefinition]
  type SheetDescription = String
  type SheetElementRenderingRuleList = js.Array[SheetElementRenderingRule]
  type SheetList = js.Array[Sheet]
  type SheetName = String
  type SheetTextBoxContent = String
  type SheetTextBoxList = js.Array[SheetTextBox]
  type SheetTitle = String
  type SheetVisualScopingConfigurations = js.Array[SheetVisualScopingConfiguration]
  type ShortPlainText = String
  type ShortRestrictiveResourceId = String
  type ShortRichText = String
  type SiteBaseUrl = String
  type SmallMultiplesDimensionFieldList = js.Array[DimensionField]
  type SqlEndpointPath = String
  type SqlQuery = String
  type StatusCode = Int
  type StringDefaultValueList = js.Array[SensitiveStringObject]
  type StringList = js.Array[String]
  type StringParameterList = js.Array[StringParameter]
  type Suffix = String
  type TableBorderThickness = Int
  type TableConditionalFormattingOptionList = js.Array[TableConditionalFormattingOption]
  type TableFieldHeight = Int
  type TableFieldOptionList = js.Array[TableFieldOption]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TargetVisualList = js.Array[ShortRestrictiveResourceId]
  type TemplateAliasList = js.Array[TemplateAlias]
  type TemplateErrorList = js.Array[TemplateError]
  type TemplateName = String
  type TemplateSummaryList = js.Array[TemplateSummary]
  type TemplateVersionSummaryList = js.Array[TemplateVersionSummary]
  type TextAreaControlDelimiter = String
  type ThemeAliasList = js.Array[ThemeAlias]
  type ThemeErrorList = js.Array[ThemeError]
  type ThemeName = String
  type ThemeSummaryList = js.Array[ThemeSummary]
  type ThemeVersionSummaryList = js.Array[ThemeVersionSummary]
  type Timestamp = js.Date
  type TooltipItemList = js.Array[TooltipItem]
  type TopBottomMoversComputationMoverSize = Int
  type TopBottomRankedComputationResultSize = Int
  type TransformOperationList = js.Array[TransformOperation]
  type TreeMapDimensionFieldList = js.Array[DimensionField]
  type TreeMapMeasureFieldList = js.Array[MeasureField]
  type TypeCastFormat = String
  type URLOperationTemplate = String
  type UnaggregatedFieldList = js.Array[UnaggregatedField]
  type UnicodeIcon = String
  type UnlimitedPixelLength = String
  type UpdateLinkPermissionList = js.Array[ResourcePermission]
  type UpdateResourcePermissionList = js.Array[ResourcePermission]
  type UserList = js.Array[User]
  type UserName = String
  type Username = String
  type VersionDescription = String
  type VersionNumber = Double
  type VisiblePanelColumns = Double
  type VisiblePanelRows = Double
  type VisualCustomActionList = js.Array[VisualCustomAction]
  type VisualCustomActionName = String
  type VisualCustomActionOperationList = js.Array[VisualCustomActionOperation]
  type VisualList = js.Array[Visual]
  type Warehouse = String
  type WordCloudDimensionFieldList = js.Array[DimensionField]
  type WordCloudMaximumStringLength = Int
  type WordCloudMeasureFieldList = js.Array[MeasureField]
  type WorkGroup = String

  final class QuickSightOps(private val service: QuickSight) extends AnyVal {

    @inline def cancelIngestionFuture(params: CancelIngestionRequest): Future[CancelIngestionResponse] = service.cancelIngestion(params).promise().toFuture
    @inline def createAccountCustomizationFuture(params: CreateAccountCustomizationRequest): Future[CreateAccountCustomizationResponse] = service.createAccountCustomization(params).promise().toFuture
    @inline def createAccountSubscriptionFuture(params: CreateAccountSubscriptionRequest): Future[CreateAccountSubscriptionResponse] = service.createAccountSubscription(params).promise().toFuture
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
    @inline def deleteAccountSubscriptionFuture(params: DeleteAccountSubscriptionRequest): Future[DeleteAccountSubscriptionResponse] = service.deleteAccountSubscription(params).promise().toFuture
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
    @inline def describeAccountSubscriptionFuture(params: DescribeAccountSubscriptionRequest): Future[DescribeAccountSubscriptionResponse] = service.describeAccountSubscription(params).promise().toFuture
    @inline def describeAnalysisDefinitionFuture(params: DescribeAnalysisDefinitionRequest): Future[DescribeAnalysisDefinitionResponse] = service.describeAnalysisDefinition(params).promise().toFuture
    @inline def describeAnalysisFuture(params: DescribeAnalysisRequest): Future[DescribeAnalysisResponse] = service.describeAnalysis(params).promise().toFuture
    @inline def describeAnalysisPermissionsFuture(params: DescribeAnalysisPermissionsRequest): Future[DescribeAnalysisPermissionsResponse] = service.describeAnalysisPermissions(params).promise().toFuture
    @inline def describeDashboardDefinitionFuture(params: DescribeDashboardDefinitionRequest): Future[DescribeDashboardDefinitionResponse] = service.describeDashboardDefinition(params).promise().toFuture
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
    @inline def describeGroupMembershipFuture(params: DescribeGroupMembershipRequest): Future[DescribeGroupMembershipResponse] = service.describeGroupMembership(params).promise().toFuture
    @inline def describeIAMPolicyAssignmentFuture(params: DescribeIAMPolicyAssignmentRequest): Future[DescribeIAMPolicyAssignmentResponse] = service.describeIAMPolicyAssignment(params).promise().toFuture
    @inline def describeIngestionFuture(params: DescribeIngestionRequest): Future[DescribeIngestionResponse] = service.describeIngestion(params).promise().toFuture
    @inline def describeIpRestrictionFuture(params: DescribeIpRestrictionRequest): Future[DescribeIpRestrictionResponse] = service.describeIpRestriction(params).promise().toFuture
    @inline def describeNamespaceFuture(params: DescribeNamespaceRequest): Future[DescribeNamespaceResponse] = service.describeNamespace(params).promise().toFuture
    @inline def describeTemplateAliasFuture(params: DescribeTemplateAliasRequest): Future[DescribeTemplateAliasResponse] = service.describeTemplateAlias(params).promise().toFuture
    @inline def describeTemplateDefinitionFuture(params: DescribeTemplateDefinitionRequest): Future[DescribeTemplateDefinitionResponse] = service.describeTemplateDefinition(params).promise().toFuture
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
    @inline def searchDataSetsFuture(params: SearchDataSetsRequest): Future[SearchDataSetsResponse] = service.searchDataSets(params).promise().toFuture
    @inline def searchDataSourcesFuture(params: SearchDataSourcesRequest): Future[SearchDataSourcesResponse] = service.searchDataSources(params).promise().toFuture
    @inline def searchFoldersFuture(params: SearchFoldersRequest): Future[SearchFoldersResponse] = service.searchFolders(params).promise().toFuture
    @inline def searchGroupsFuture(params: SearchGroupsRequest): Future[SearchGroupsResponse] = service.searchGroups(params).promise().toFuture
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
    @inline def updatePublicSharingSettingsFuture(params: UpdatePublicSharingSettingsRequest): Future[UpdatePublicSharingSettingsResponse] = service.updatePublicSharingSettings(params).promise().toFuture
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
    def createAccountSubscription(params: CreateAccountSubscriptionRequest): Request[CreateAccountSubscriptionResponse] = js.native
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
    def deleteAccountSubscription(params: DeleteAccountSubscriptionRequest): Request[DeleteAccountSubscriptionResponse] = js.native
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
    def describeAccountSubscription(params: DescribeAccountSubscriptionRequest): Request[DescribeAccountSubscriptionResponse] = js.native
    def describeAnalysis(params: DescribeAnalysisRequest): Request[DescribeAnalysisResponse] = js.native
    def describeAnalysisDefinition(params: DescribeAnalysisDefinitionRequest): Request[DescribeAnalysisDefinitionResponse] = js.native
    def describeAnalysisPermissions(params: DescribeAnalysisPermissionsRequest): Request[DescribeAnalysisPermissionsResponse] = js.native
    def describeDashboard(params: DescribeDashboardRequest): Request[DescribeDashboardResponse] = js.native
    def describeDashboardDefinition(params: DescribeDashboardDefinitionRequest): Request[DescribeDashboardDefinitionResponse] = js.native
    def describeDashboardPermissions(params: DescribeDashboardPermissionsRequest): Request[DescribeDashboardPermissionsResponse] = js.native
    def describeDataSet(params: DescribeDataSetRequest): Request[DescribeDataSetResponse] = js.native
    def describeDataSetPermissions(params: DescribeDataSetPermissionsRequest): Request[DescribeDataSetPermissionsResponse] = js.native
    def describeDataSource(params: DescribeDataSourceRequest): Request[DescribeDataSourceResponse] = js.native
    def describeDataSourcePermissions(params: DescribeDataSourcePermissionsRequest): Request[DescribeDataSourcePermissionsResponse] = js.native
    def describeFolder(params: DescribeFolderRequest): Request[DescribeFolderResponse] = js.native
    def describeFolderPermissions(params: DescribeFolderPermissionsRequest): Request[DescribeFolderPermissionsResponse] = js.native
    def describeFolderResolvedPermissions(params: DescribeFolderResolvedPermissionsRequest): Request[DescribeFolderResolvedPermissionsResponse] = js.native
    def describeGroup(params: DescribeGroupRequest): Request[DescribeGroupResponse] = js.native
    def describeGroupMembership(params: DescribeGroupMembershipRequest): Request[DescribeGroupMembershipResponse] = js.native
    def describeIAMPolicyAssignment(params: DescribeIAMPolicyAssignmentRequest): Request[DescribeIAMPolicyAssignmentResponse] = js.native
    def describeIngestion(params: DescribeIngestionRequest): Request[DescribeIngestionResponse] = js.native
    def describeIpRestriction(params: DescribeIpRestrictionRequest): Request[DescribeIpRestrictionResponse] = js.native
    def describeNamespace(params: DescribeNamespaceRequest): Request[DescribeNamespaceResponse] = js.native
    def describeTemplate(params: DescribeTemplateRequest): Request[DescribeTemplateResponse] = js.native
    def describeTemplateAlias(params: DescribeTemplateAliasRequest): Request[DescribeTemplateAliasResponse] = js.native
    def describeTemplateDefinition(params: DescribeTemplateDefinitionRequest): Request[DescribeTemplateDefinitionResponse] = js.native
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
    def searchDataSets(params: SearchDataSetsRequest): Request[SearchDataSetsResponse] = js.native
    def searchDataSources(params: SearchDataSourcesRequest): Request[SearchDataSourcesResponse] = js.native
    def searchFolders(params: SearchFoldersRequest): Request[SearchFoldersResponse] = js.native
    def searchGroups(params: SearchGroupsRequest): Request[SearchGroupsResponse] = js.native
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
    def updatePublicSharingSettings(params: UpdatePublicSharingSettingsRequest): Request[UpdatePublicSharingSettingsResponse] = js.native
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

  /** A structure that contains the following account information elements: * Your Amazon QuickSight account name. * The edition of Amazon QuickSight that your account is using. * The notification email address that is associated with the Amazon QuickSight account. * The authentication type of the Amazon QuickSight account. * The status of the Amazon QuickSight account's subscription.
    */
  @js.native
  trait AccountInfo extends js.Object {
    var AccountName: js.UndefOr[String]
    var AccountSubscriptionStatus: js.UndefOr[String]
    var AuthenticationType: js.UndefOr[String]
    var Edition: js.UndefOr[Edition]
    var NotificationEmail: js.UndefOr[String]
  }

  object AccountInfo {
    @inline
    def apply(
        AccountName: js.UndefOr[String] = js.undefined,
        AccountSubscriptionStatus: js.UndefOr[String] = js.undefined,
        AuthenticationType: js.UndefOr[String] = js.undefined,
        Edition: js.UndefOr[Edition] = js.undefined,
        NotificationEmail: js.UndefOr[String] = js.undefined
    ): AccountInfo = {
      val __obj = js.Dynamic.literal()
      AccountName.foreach(__v => __obj.updateDynamic("AccountName")(__v.asInstanceOf[js.Any]))
      AccountSubscriptionStatus.foreach(__v => __obj.updateDynamic("AccountSubscriptionStatus")(__v.asInstanceOf[js.Any]))
      AuthenticationType.foreach(__v => __obj.updateDynamic("AuthenticationType")(__v.asInstanceOf[js.Any]))
      Edition.foreach(__v => __obj.updateDynamic("Edition")(__v.asInstanceOf[js.Any]))
      NotificationEmail.foreach(__v => __obj.updateDynamic("NotificationEmail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccountInfo]
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
    var PublicSharingEnabled: js.UndefOr[Boolean]
    var TerminationProtectionEnabled: js.UndefOr[Boolean]
  }

  object AccountSettings {
    @inline
    def apply(
        AccountName: js.UndefOr[String] = js.undefined,
        DefaultNamespace: js.UndefOr[Namespace] = js.undefined,
        Edition: js.UndefOr[Edition] = js.undefined,
        NotificationEmail: js.UndefOr[String] = js.undefined,
        PublicSharingEnabled: js.UndefOr[Boolean] = js.undefined,
        TerminationProtectionEnabled: js.UndefOr[Boolean] = js.undefined
    ): AccountSettings = {
      val __obj = js.Dynamic.literal()
      AccountName.foreach(__v => __obj.updateDynamic("AccountName")(__v.asInstanceOf[js.Any]))
      DefaultNamespace.foreach(__v => __obj.updateDynamic("DefaultNamespace")(__v.asInstanceOf[js.Any]))
      Edition.foreach(__v => __obj.updateDynamic("Edition")(__v.asInstanceOf[js.Any]))
      NotificationEmail.foreach(__v => __obj.updateDynamic("NotificationEmail")(__v.asInstanceOf[js.Any]))
      PublicSharingEnabled.foreach(__v => __obj.updateDynamic("PublicSharingEnabled")(__v.asInstanceOf[js.Any]))
      TerminationProtectionEnabled.foreach(__v => __obj.updateDynamic("TerminationProtectionEnabled")(__v.asInstanceOf[js.Any]))
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

  /** An ad hoc (one-time) filtering option.
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

  /** An aggregation function aggregates values from a dimension or measure. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait AggregationFunction extends js.Object {
    var CategoricalAggregationFunction: js.UndefOr[CategoricalAggregationFunction]
    var DateAggregationFunction: js.UndefOr[DateAggregationFunction]
    var NumericalAggregationFunction: js.UndefOr[NumericalAggregationFunction]
  }

  object AggregationFunction {
    @inline
    def apply(
        CategoricalAggregationFunction: js.UndefOr[CategoricalAggregationFunction] = js.undefined,
        DateAggregationFunction: js.UndefOr[DateAggregationFunction] = js.undefined,
        NumericalAggregationFunction: js.UndefOr[NumericalAggregationFunction] = js.undefined
    ): AggregationFunction = {
      val __obj = js.Dynamic.literal()
      CategoricalAggregationFunction.foreach(__v => __obj.updateDynamic("CategoricalAggregationFunction")(__v.asInstanceOf[js.Any]))
      DateAggregationFunction.foreach(__v => __obj.updateDynamic("DateAggregationFunction")(__v.asInstanceOf[js.Any]))
      NumericalAggregationFunction.foreach(__v => __obj.updateDynamic("NumericalAggregationFunction")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AggregationFunction]
    }
  }

  /** The configuration options to sort aggregated values.
    */
  @js.native
  trait AggregationSortConfiguration extends js.Object {
    var AggregationFunction: AggregationFunction
    var Column: ColumnIdentifier
    var SortDirection: SortDirection
  }

  object AggregationSortConfiguration {
    @inline
    def apply(
        AggregationFunction: AggregationFunction,
        Column: ColumnIdentifier,
        SortDirection: SortDirection
    ): AggregationSortConfiguration = {
      val __obj = js.Dynamic.literal(
        "AggregationFunction" -> AggregationFunction.asInstanceOf[js.Any],
        "Column" -> Column.asInstanceOf[js.Any],
        "SortDirection" -> SortDirection.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AggregationSortConfiguration]
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
    var AnalysisId: js.UndefOr[ShortRestrictiveResourceId]
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
        AnalysisId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined,
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

  /** The configuration for default analysis settings.
    */
  @js.native
  trait AnalysisDefaults extends js.Object {
    var DefaultNewSheetConfiguration: DefaultNewSheetConfiguration
  }

  object AnalysisDefaults {
    @inline
    def apply(
        DefaultNewSheetConfiguration: DefaultNewSheetConfiguration
    ): AnalysisDefaults = {
      val __obj = js.Dynamic.literal(
        "DefaultNewSheetConfiguration" -> DefaultNewSheetConfiguration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AnalysisDefaults]
    }
  }

  /** The definition of an analysis.
    */
  @js.native
  trait AnalysisDefinition extends js.Object {
    var DataSetIdentifierDeclarations: DataSetIdentifierDeclarationList
    var AnalysisDefaults: js.UndefOr[AnalysisDefaults]
    var CalculatedFields: js.UndefOr[CalculatedFields]
    var ColumnConfigurations: js.UndefOr[ColumnConfigurationList]
    var FilterGroups: js.UndefOr[FilterGroupList]
    var ParameterDeclarations: js.UndefOr[ParameterDeclarationList]
    var Sheets: js.UndefOr[SheetDefinitionList]
  }

  object AnalysisDefinition {
    @inline
    def apply(
        DataSetIdentifierDeclarations: DataSetIdentifierDeclarationList,
        AnalysisDefaults: js.UndefOr[AnalysisDefaults] = js.undefined,
        CalculatedFields: js.UndefOr[CalculatedFields] = js.undefined,
        ColumnConfigurations: js.UndefOr[ColumnConfigurationList] = js.undefined,
        FilterGroups: js.UndefOr[FilterGroupList] = js.undefined,
        ParameterDeclarations: js.UndefOr[ParameterDeclarationList] = js.undefined,
        Sheets: js.UndefOr[SheetDefinitionList] = js.undefined
    ): AnalysisDefinition = {
      val __obj = js.Dynamic.literal(
        "DataSetIdentifierDeclarations" -> DataSetIdentifierDeclarations.asInstanceOf[js.Any]
      )

      AnalysisDefaults.foreach(__v => __obj.updateDynamic("AnalysisDefaults")(__v.asInstanceOf[js.Any]))
      CalculatedFields.foreach(__v => __obj.updateDynamic("CalculatedFields")(__v.asInstanceOf[js.Any]))
      ColumnConfigurations.foreach(__v => __obj.updateDynamic("ColumnConfigurations")(__v.asInstanceOf[js.Any]))
      FilterGroups.foreach(__v => __obj.updateDynamic("FilterGroups")(__v.asInstanceOf[js.Any]))
      ParameterDeclarations.foreach(__v => __obj.updateDynamic("ParameterDeclarations")(__v.asInstanceOf[js.Any]))
      Sheets.foreach(__v => __obj.updateDynamic("Sheets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnalysisDefinition]
    }
  }

  /** Analysis error.
    */
  @js.native
  trait AnalysisError extends js.Object {
    var Message: js.UndefOr[NonEmptyString]
    var Type: js.UndefOr[AnalysisErrorType]
    var ViolatedEntities: js.UndefOr[EntityList]
  }

  object AnalysisError {
    @inline
    def apply(
        Message: js.UndefOr[NonEmptyString] = js.undefined,
        Type: js.UndefOr[AnalysisErrorType] = js.undefined,
        ViolatedEntities: js.UndefOr[EntityList] = js.undefined
    ): AnalysisError = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      ViolatedEntities.foreach(__v => __obj.updateDynamic("ViolatedEntities")(__v.asInstanceOf[js.Any]))
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
    var AnalysisId: js.UndefOr[ShortRestrictiveResourceId]
    var Arn: js.UndefOr[Arn]
    var CreatedTime: js.UndefOr[Timestamp]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[AnalysisName]
    var Status: js.UndefOr[ResourceStatus]
  }

  object AnalysisSummary {
    @inline
    def apply(
        AnalysisId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined,
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

  /** The date configuration of the filter.
    */
  @js.native
  trait AnchorDateConfiguration extends js.Object {
    var AnchorOption: js.UndefOr[AnchorOption]
    var ParameterName: js.UndefOr[ParameterName]
  }

  object AnchorDateConfiguration {
    @inline
    def apply(
        AnchorOption: js.UndefOr[AnchorOption] = js.undefined,
        ParameterName: js.UndefOr[ParameterName] = js.undefined
    ): AnchorDateConfiguration = {
      val __obj = js.Dynamic.literal()
      AnchorOption.foreach(__v => __obj.updateDynamic("AnchorOption")(__v.asInstanceOf[js.Any]))
      ParameterName.foreach(__v => __obj.updateDynamic("ParameterName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnchorDateConfiguration]
    }
  }

  /** Information about the dashboard that you want to embed.
    */
  @js.native
  trait AnonymousUserDashboardEmbeddingConfiguration extends js.Object {
    var InitialDashboardId: ShortRestrictiveResourceId
  }

  object AnonymousUserDashboardEmbeddingConfiguration {
    @inline
    def apply(
        InitialDashboardId: ShortRestrictiveResourceId
    ): AnonymousUserDashboardEmbeddingConfiguration = {
      val __obj = js.Dynamic.literal(
        "InitialDashboardId" -> InitialDashboardId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AnonymousUserDashboardEmbeddingConfiguration]
    }
  }

  /** The experience that you are embedding. You can use this object to generate a url that embeds a visual into your application.
    */
  @js.native
  trait AnonymousUserDashboardVisualEmbeddingConfiguration extends js.Object {
    var InitialDashboardVisualId: DashboardVisualId
  }

  object AnonymousUserDashboardVisualEmbeddingConfiguration {
    @inline
    def apply(
        InitialDashboardVisualId: DashboardVisualId
    ): AnonymousUserDashboardVisualEmbeddingConfiguration = {
      val __obj = js.Dynamic.literal(
        "InitialDashboardVisualId" -> InitialDashboardVisualId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AnonymousUserDashboardVisualEmbeddingConfiguration]
    }
  }

  /** The type of experience you want to embed. For anonymous users, you can embed Amazon QuickSight dashboards.
    */
  @js.native
  trait AnonymousUserEmbeddingExperienceConfiguration extends js.Object {
    var Dashboard: js.UndefOr[AnonymousUserDashboardEmbeddingConfiguration]
    var DashboardVisual: js.UndefOr[AnonymousUserDashboardVisualEmbeddingConfiguration]
    var QSearchBar: js.UndefOr[AnonymousUserQSearchBarEmbeddingConfiguration]
  }

  object AnonymousUserEmbeddingExperienceConfiguration {
    @inline
    def apply(
        Dashboard: js.UndefOr[AnonymousUserDashboardEmbeddingConfiguration] = js.undefined,
        DashboardVisual: js.UndefOr[AnonymousUserDashboardVisualEmbeddingConfiguration] = js.undefined,
        QSearchBar: js.UndefOr[AnonymousUserQSearchBarEmbeddingConfiguration] = js.undefined
    ): AnonymousUserEmbeddingExperienceConfiguration = {
      val __obj = js.Dynamic.literal()
      Dashboard.foreach(__v => __obj.updateDynamic("Dashboard")(__v.asInstanceOf[js.Any]))
      DashboardVisual.foreach(__v => __obj.updateDynamic("DashboardVisual")(__v.asInstanceOf[js.Any]))
      QSearchBar.foreach(__v => __obj.updateDynamic("QSearchBar")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AnonymousUserEmbeddingExperienceConfiguration]
    }
  }

  /** The settings that you want to use with the Q search bar.
    */
  @js.native
  trait AnonymousUserQSearchBarEmbeddingConfiguration extends js.Object {
    var InitialTopicId: RestrictiveResourceId
  }

  object AnonymousUserQSearchBarEmbeddingConfiguration {
    @inline
    def apply(
        InitialTopicId: RestrictiveResourceId
    ): AnonymousUserQSearchBarEmbeddingConfiguration = {
      val __obj = js.Dynamic.literal(
        "InitialTopicId" -> InitialTopicId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AnonymousUserQSearchBarEmbeddingConfiguration]
    }
  }

  /** The arc axis configuration of a <code>GaugeChartVisual</code>.
    */
  @js.native
  trait ArcAxisConfiguration extends js.Object {
    var Range: js.UndefOr[ArcAxisDisplayRange]
    var ReserveRange: js.UndefOr[Int]
  }

  object ArcAxisConfiguration {
    @inline
    def apply(
        Range: js.UndefOr[ArcAxisDisplayRange] = js.undefined,
        ReserveRange: js.UndefOr[Int] = js.undefined
    ): ArcAxisConfiguration = {
      val __obj = js.Dynamic.literal()
      Range.foreach(__v => __obj.updateDynamic("Range")(__v.asInstanceOf[js.Any]))
      ReserveRange.foreach(__v => __obj.updateDynamic("ReserveRange")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ArcAxisConfiguration]
    }
  }

  /** The arc axis range of a <code>GaugeChartVisual</code>.
    */
  @js.native
  trait ArcAxisDisplayRange extends js.Object {
    var Max: js.UndefOr[Double]
    var Min: js.UndefOr[Double]
  }

  object ArcAxisDisplayRange {
    @inline
    def apply(
        Max: js.UndefOr[Double] = js.undefined,
        Min: js.UndefOr[Double] = js.undefined
    ): ArcAxisDisplayRange = {
      val __obj = js.Dynamic.literal()
      Max.foreach(__v => __obj.updateDynamic("Max")(__v.asInstanceOf[js.Any]))
      Min.foreach(__v => __obj.updateDynamic("Min")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ArcAxisDisplayRange]
    }
  }

  /** The arc configuration of a <code>GaugeChartVisual</code>.
    */
  @js.native
  trait ArcConfiguration extends js.Object {
    var ArcAngle: js.UndefOr[Double]
    var ArcThickness: js.UndefOr[ArcThicknessOptions]
  }

  object ArcConfiguration {
    @inline
    def apply(
        ArcAngle: js.UndefOr[Double] = js.undefined,
        ArcThickness: js.UndefOr[ArcThicknessOptions] = js.undefined
    ): ArcConfiguration = {
      val __obj = js.Dynamic.literal()
      ArcAngle.foreach(__v => __obj.updateDynamic("ArcAngle")(__v.asInstanceOf[js.Any]))
      ArcThickness.foreach(__v => __obj.updateDynamic("ArcThickness")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ArcConfiguration]
    }
  }

  /** The options that determine the arc thickness of a <code>GaugeChartVisual</code>.
    */
  @js.native
  trait ArcOptions extends js.Object {
    var ArcThickness: js.UndefOr[ArcThickness]
  }

  object ArcOptions {
    @inline
    def apply(
        ArcThickness: js.UndefOr[ArcThickness] = js.undefined
    ): ArcOptions = {
      val __obj = js.Dynamic.literal()
      ArcThickness.foreach(__v => __obj.updateDynamic("ArcThickness")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ArcOptions]
    }
  }

  /** Parameters for Amazon Athena.
    */
  @js.native
  trait AthenaParameters extends js.Object {
    var RoleArn: js.UndefOr[RoleArn]
    var WorkGroup: js.UndefOr[WorkGroup]
  }

  object AthenaParameters {
    @inline
    def apply(
        RoleArn: js.UndefOr[RoleArn] = js.undefined,
        WorkGroup: js.UndefOr[WorkGroup] = js.undefined
    ): AthenaParameters = {
      val __obj = js.Dynamic.literal()
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
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

  /** The data options for an axis. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait AxisDataOptions extends js.Object {
    var DateAxisOptions: js.UndefOr[DateAxisOptions]
    var NumericAxisOptions: js.UndefOr[NumericAxisOptions]
  }

  object AxisDataOptions {
    @inline
    def apply(
        DateAxisOptions: js.UndefOr[DateAxisOptions] = js.undefined,
        NumericAxisOptions: js.UndefOr[NumericAxisOptions] = js.undefined
    ): AxisDataOptions = {
      val __obj = js.Dynamic.literal()
      DateAxisOptions.foreach(__v => __obj.updateDynamic("DateAxisOptions")(__v.asInstanceOf[js.Any]))
      NumericAxisOptions.foreach(__v => __obj.updateDynamic("NumericAxisOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AxisDataOptions]
    }
  }

  /** The options that are saved for future extension.
    */
  @js.native
  trait AxisDisplayDataDrivenRange extends js.Object

  object AxisDisplayDataDrivenRange {
    @inline
    def apply(): AxisDisplayDataDrivenRange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AxisDisplayDataDrivenRange]
    }
  }

  /** The minimum and maximum setup for an axis display range.
    */
  @js.native
  trait AxisDisplayMinMaxRange extends js.Object {
    var Maximum: js.UndefOr[Double]
    var Minimum: js.UndefOr[Double]
  }

  object AxisDisplayMinMaxRange {
    @inline
    def apply(
        Maximum: js.UndefOr[Double] = js.undefined,
        Minimum: js.UndefOr[Double] = js.undefined
    ): AxisDisplayMinMaxRange = {
      val __obj = js.Dynamic.literal()
      Maximum.foreach(__v => __obj.updateDynamic("Maximum")(__v.asInstanceOf[js.Any]))
      Minimum.foreach(__v => __obj.updateDynamic("Minimum")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AxisDisplayMinMaxRange]
    }
  }

  /** The display options for the axis label.
    */
  @js.native
  trait AxisDisplayOptions extends js.Object {
    var AxisLineVisibility: js.UndefOr[Visibility]
    var AxisOffset: js.UndefOr[PixelLength]
    var DataOptions: js.UndefOr[AxisDataOptions]
    var GridLineVisibility: js.UndefOr[Visibility]
    var ScrollbarOptions: js.UndefOr[ScrollBarOptions]
    var TickLabelOptions: js.UndefOr[AxisTickLabelOptions]
  }

  object AxisDisplayOptions {
    @inline
    def apply(
        AxisLineVisibility: js.UndefOr[Visibility] = js.undefined,
        AxisOffset: js.UndefOr[PixelLength] = js.undefined,
        DataOptions: js.UndefOr[AxisDataOptions] = js.undefined,
        GridLineVisibility: js.UndefOr[Visibility] = js.undefined,
        ScrollbarOptions: js.UndefOr[ScrollBarOptions] = js.undefined,
        TickLabelOptions: js.UndefOr[AxisTickLabelOptions] = js.undefined
    ): AxisDisplayOptions = {
      val __obj = js.Dynamic.literal()
      AxisLineVisibility.foreach(__v => __obj.updateDynamic("AxisLineVisibility")(__v.asInstanceOf[js.Any]))
      AxisOffset.foreach(__v => __obj.updateDynamic("AxisOffset")(__v.asInstanceOf[js.Any]))
      DataOptions.foreach(__v => __obj.updateDynamic("DataOptions")(__v.asInstanceOf[js.Any]))
      GridLineVisibility.foreach(__v => __obj.updateDynamic("GridLineVisibility")(__v.asInstanceOf[js.Any]))
      ScrollbarOptions.foreach(__v => __obj.updateDynamic("ScrollbarOptions")(__v.asInstanceOf[js.Any]))
      TickLabelOptions.foreach(__v => __obj.updateDynamic("TickLabelOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AxisDisplayOptions]
    }
  }

  /** The range setup of a numeric axis display range. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait AxisDisplayRange extends js.Object {
    var DataDriven: js.UndefOr[AxisDisplayDataDrivenRange]
    var MinMax: js.UndefOr[AxisDisplayMinMaxRange]
  }

  object AxisDisplayRange {
    @inline
    def apply(
        DataDriven: js.UndefOr[AxisDisplayDataDrivenRange] = js.undefined,
        MinMax: js.UndefOr[AxisDisplayMinMaxRange] = js.undefined
    ): AxisDisplayRange = {
      val __obj = js.Dynamic.literal()
      DataDriven.foreach(__v => __obj.updateDynamic("DataDriven")(__v.asInstanceOf[js.Any]))
      MinMax.foreach(__v => __obj.updateDynamic("MinMax")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AxisDisplayRange]
    }
  }

  /** The label options for a chart axis. You must specify the field that the label is targeted to.
    */
  @js.native
  trait AxisLabelOptions extends js.Object {
    var ApplyTo: js.UndefOr[AxisLabelReferenceOptions]
    var CustomLabel: js.UndefOr[String]
    var FontConfiguration: js.UndefOr[FontConfiguration]
  }

  object AxisLabelOptions {
    @inline
    def apply(
        ApplyTo: js.UndefOr[AxisLabelReferenceOptions] = js.undefined,
        CustomLabel: js.UndefOr[String] = js.undefined,
        FontConfiguration: js.UndefOr[FontConfiguration] = js.undefined
    ): AxisLabelOptions = {
      val __obj = js.Dynamic.literal()
      ApplyTo.foreach(__v => __obj.updateDynamic("ApplyTo")(__v.asInstanceOf[js.Any]))
      CustomLabel.foreach(__v => __obj.updateDynamic("CustomLabel")(__v.asInstanceOf[js.Any]))
      FontConfiguration.foreach(__v => __obj.updateDynamic("FontConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AxisLabelOptions]
    }
  }

  /** The reference that specifies where the axis label is applied to.
    */
  @js.native
  trait AxisLabelReferenceOptions extends js.Object {
    var Column: ColumnIdentifier
    var FieldId: FieldId
  }

  object AxisLabelReferenceOptions {
    @inline
    def apply(
        Column: ColumnIdentifier,
        FieldId: FieldId
    ): AxisLabelReferenceOptions = {
      val __obj = js.Dynamic.literal(
        "Column" -> Column.asInstanceOf[js.Any],
        "FieldId" -> FieldId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AxisLabelReferenceOptions]
    }
  }

  /** The liner axis scale setup. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait AxisLinearScale extends js.Object {
    var StepCount: js.UndefOr[Int]
    var StepSize: js.UndefOr[Double]
  }

  object AxisLinearScale {
    @inline
    def apply(
        StepCount: js.UndefOr[Int] = js.undefined,
        StepSize: js.UndefOr[Double] = js.undefined
    ): AxisLinearScale = {
      val __obj = js.Dynamic.literal()
      StepCount.foreach(__v => __obj.updateDynamic("StepCount")(__v.asInstanceOf[js.Any]))
      StepSize.foreach(__v => __obj.updateDynamic("StepSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AxisLinearScale]
    }
  }

  /** The logarithmic axis scale setup.
    */
  @js.native
  trait AxisLogarithmicScale extends js.Object {
    var Base: js.UndefOr[Double]
  }

  object AxisLogarithmicScale {
    @inline
    def apply(
        Base: js.UndefOr[Double] = js.undefined
    ): AxisLogarithmicScale = {
      val __obj = js.Dynamic.literal()
      Base.foreach(__v => __obj.updateDynamic("Base")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AxisLogarithmicScale]
    }
  }

  /** The scale setup options for a numeric axis display. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait AxisScale extends js.Object {
    var Linear: js.UndefOr[AxisLinearScale]
    var Logarithmic: js.UndefOr[AxisLogarithmicScale]
  }

  object AxisScale {
    @inline
    def apply(
        Linear: js.UndefOr[AxisLinearScale] = js.undefined,
        Logarithmic: js.UndefOr[AxisLogarithmicScale] = js.undefined
    ): AxisScale = {
      val __obj = js.Dynamic.literal()
      Linear.foreach(__v => __obj.updateDynamic("Linear")(__v.asInstanceOf[js.Any]))
      Logarithmic.foreach(__v => __obj.updateDynamic("Logarithmic")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AxisScale]
    }
  }

  /** The tick label options of an axis.
    */
  @js.native
  trait AxisTickLabelOptions extends js.Object {
    var LabelOptions: js.UndefOr[LabelOptions]
    var RotationAngle: js.UndefOr[Double]
  }

  object AxisTickLabelOptions {
    @inline
    def apply(
        LabelOptions: js.UndefOr[LabelOptions] = js.undefined,
        RotationAngle: js.UndefOr[Double] = js.undefined
    ): AxisTickLabelOptions = {
      val __obj = js.Dynamic.literal()
      LabelOptions.foreach(__v => __obj.updateDynamic("LabelOptions")(__v.asInstanceOf[js.Any]))
      RotationAngle.foreach(__v => __obj.updateDynamic("RotationAngle")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AxisTickLabelOptions]
    }
  }

  /** The aggregated field wells of a bar chart.
    */
  @js.native
  trait BarChartAggregatedFieldWells extends js.Object {
    var Category: js.UndefOr[DimensionFieldList]
    var Colors: js.UndefOr[DimensionFieldList]
    var SmallMultiples: js.UndefOr[SmallMultiplesDimensionFieldList]
    var Values: js.UndefOr[MeasureFieldList]
  }

  object BarChartAggregatedFieldWells {
    @inline
    def apply(
        Category: js.UndefOr[DimensionFieldList] = js.undefined,
        Colors: js.UndefOr[DimensionFieldList] = js.undefined,
        SmallMultiples: js.UndefOr[SmallMultiplesDimensionFieldList] = js.undefined,
        Values: js.UndefOr[MeasureFieldList] = js.undefined
    ): BarChartAggregatedFieldWells = {
      val __obj = js.Dynamic.literal()
      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      Colors.foreach(__v => __obj.updateDynamic("Colors")(__v.asInstanceOf[js.Any]))
      SmallMultiples.foreach(__v => __obj.updateDynamic("SmallMultiples")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BarChartAggregatedFieldWells]
    }
  }

  /** The configuration of a <code>BarChartVisual</code>.
    */
  @js.native
  trait BarChartConfiguration extends js.Object {
    var BarsArrangement: js.UndefOr[BarsArrangement]
    var CategoryAxis: js.UndefOr[AxisDisplayOptions]
    var CategoryLabelOptions: js.UndefOr[ChartAxisLabelOptions]
    var ColorLabelOptions: js.UndefOr[ChartAxisLabelOptions]
    var ContributionAnalysisDefaults: js.UndefOr[ContributionAnalysisDefaultList]
    var DataLabels: js.UndefOr[DataLabelOptions]
    var FieldWells: js.UndefOr[BarChartFieldWells]
    var Legend: js.UndefOr[LegendOptions]
    var Orientation: js.UndefOr[BarChartOrientation]
    var ReferenceLines: js.UndefOr[ReferenceLineList]
    var SmallMultiplesOptions: js.UndefOr[SmallMultiplesOptions]
    var SortConfiguration: js.UndefOr[BarChartSortConfiguration]
    var Tooltip: js.UndefOr[TooltipOptions]
    var ValueAxis: js.UndefOr[AxisDisplayOptions]
    var ValueLabelOptions: js.UndefOr[ChartAxisLabelOptions]
    var VisualPalette: js.UndefOr[VisualPalette]
  }

  object BarChartConfiguration {
    @inline
    def apply(
        BarsArrangement: js.UndefOr[BarsArrangement] = js.undefined,
        CategoryAxis: js.UndefOr[AxisDisplayOptions] = js.undefined,
        CategoryLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined,
        ColorLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined,
        ContributionAnalysisDefaults: js.UndefOr[ContributionAnalysisDefaultList] = js.undefined,
        DataLabels: js.UndefOr[DataLabelOptions] = js.undefined,
        FieldWells: js.UndefOr[BarChartFieldWells] = js.undefined,
        Legend: js.UndefOr[LegendOptions] = js.undefined,
        Orientation: js.UndefOr[BarChartOrientation] = js.undefined,
        ReferenceLines: js.UndefOr[ReferenceLineList] = js.undefined,
        SmallMultiplesOptions: js.UndefOr[SmallMultiplesOptions] = js.undefined,
        SortConfiguration: js.UndefOr[BarChartSortConfiguration] = js.undefined,
        Tooltip: js.UndefOr[TooltipOptions] = js.undefined,
        ValueAxis: js.UndefOr[AxisDisplayOptions] = js.undefined,
        ValueLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined,
        VisualPalette: js.UndefOr[VisualPalette] = js.undefined
    ): BarChartConfiguration = {
      val __obj = js.Dynamic.literal()
      BarsArrangement.foreach(__v => __obj.updateDynamic("BarsArrangement")(__v.asInstanceOf[js.Any]))
      CategoryAxis.foreach(__v => __obj.updateDynamic("CategoryAxis")(__v.asInstanceOf[js.Any]))
      CategoryLabelOptions.foreach(__v => __obj.updateDynamic("CategoryLabelOptions")(__v.asInstanceOf[js.Any]))
      ColorLabelOptions.foreach(__v => __obj.updateDynamic("ColorLabelOptions")(__v.asInstanceOf[js.Any]))
      ContributionAnalysisDefaults.foreach(__v => __obj.updateDynamic("ContributionAnalysisDefaults")(__v.asInstanceOf[js.Any]))
      DataLabels.foreach(__v => __obj.updateDynamic("DataLabels")(__v.asInstanceOf[js.Any]))
      FieldWells.foreach(__v => __obj.updateDynamic("FieldWells")(__v.asInstanceOf[js.Any]))
      Legend.foreach(__v => __obj.updateDynamic("Legend")(__v.asInstanceOf[js.Any]))
      Orientation.foreach(__v => __obj.updateDynamic("Orientation")(__v.asInstanceOf[js.Any]))
      ReferenceLines.foreach(__v => __obj.updateDynamic("ReferenceLines")(__v.asInstanceOf[js.Any]))
      SmallMultiplesOptions.foreach(__v => __obj.updateDynamic("SmallMultiplesOptions")(__v.asInstanceOf[js.Any]))
      SortConfiguration.foreach(__v => __obj.updateDynamic("SortConfiguration")(__v.asInstanceOf[js.Any]))
      Tooltip.foreach(__v => __obj.updateDynamic("Tooltip")(__v.asInstanceOf[js.Any]))
      ValueAxis.foreach(__v => __obj.updateDynamic("ValueAxis")(__v.asInstanceOf[js.Any]))
      ValueLabelOptions.foreach(__v => __obj.updateDynamic("ValueLabelOptions")(__v.asInstanceOf[js.Any]))
      VisualPalette.foreach(__v => __obj.updateDynamic("VisualPalette")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BarChartConfiguration]
    }
  }

  /** The field wells of a <code>BarChartVisual</code>. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait BarChartFieldWells extends js.Object {
    var BarChartAggregatedFieldWells: js.UndefOr[BarChartAggregatedFieldWells]
  }

  object BarChartFieldWells {
    @inline
    def apply(
        BarChartAggregatedFieldWells: js.UndefOr[BarChartAggregatedFieldWells] = js.undefined
    ): BarChartFieldWells = {
      val __obj = js.Dynamic.literal()
      BarChartAggregatedFieldWells.foreach(__v => __obj.updateDynamic("BarChartAggregatedFieldWells")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BarChartFieldWells]
    }
  }

  /** sort-configuration-description
    */
  @js.native
  trait BarChartSortConfiguration extends js.Object {
    var CategoryItemsLimit: js.UndefOr[ItemsLimitConfiguration]
    var CategorySort: js.UndefOr[FieldSortOptionsList]
    var ColorItemsLimit: js.UndefOr[ItemsLimitConfiguration]
    var ColorSort: js.UndefOr[FieldSortOptionsList]
    var SmallMultiplesLimitConfiguration: js.UndefOr[ItemsLimitConfiguration]
    var SmallMultiplesSort: js.UndefOr[FieldSortOptionsList]
  }

  object BarChartSortConfiguration {
    @inline
    def apply(
        CategoryItemsLimit: js.UndefOr[ItemsLimitConfiguration] = js.undefined,
        CategorySort: js.UndefOr[FieldSortOptionsList] = js.undefined,
        ColorItemsLimit: js.UndefOr[ItemsLimitConfiguration] = js.undefined,
        ColorSort: js.UndefOr[FieldSortOptionsList] = js.undefined,
        SmallMultiplesLimitConfiguration: js.UndefOr[ItemsLimitConfiguration] = js.undefined,
        SmallMultiplesSort: js.UndefOr[FieldSortOptionsList] = js.undefined
    ): BarChartSortConfiguration = {
      val __obj = js.Dynamic.literal()
      CategoryItemsLimit.foreach(__v => __obj.updateDynamic("CategoryItemsLimit")(__v.asInstanceOf[js.Any]))
      CategorySort.foreach(__v => __obj.updateDynamic("CategorySort")(__v.asInstanceOf[js.Any]))
      ColorItemsLimit.foreach(__v => __obj.updateDynamic("ColorItemsLimit")(__v.asInstanceOf[js.Any]))
      ColorSort.foreach(__v => __obj.updateDynamic("ColorSort")(__v.asInstanceOf[js.Any]))
      SmallMultiplesLimitConfiguration.foreach(__v => __obj.updateDynamic("SmallMultiplesLimitConfiguration")(__v.asInstanceOf[js.Any]))
      SmallMultiplesSort.foreach(__v => __obj.updateDynamic("SmallMultiplesSort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BarChartSortConfiguration]
    }
  }

  /** A bar chart. The <code>BarChartVisual</code> structure describes a visual that is a member of the bar chart family. The following charts can be described using this structure: * Horizontal bar chart * Vertical bar chart * Horizontal stacked bar chart * Vertical stacked bar chart * Horizontal stacked 100% bar chart * Vertical stacked 100% bar chart For more information, see [[https://docs.aws.amazon.com/quicksight/latest/user/bar-charts.html|Using bar charts]] in the <i>Amazon QuickSight User Guide</i>.
    */
  @js.native
  trait BarChartVisual extends js.Object {
    var VisualId: ShortRestrictiveResourceId
    var Actions: js.UndefOr[VisualCustomActionList]
    var ChartConfiguration: js.UndefOr[BarChartConfiguration]
    var ColumnHierarchies: js.UndefOr[ColumnHierarchyList]
    var Subtitle: js.UndefOr[VisualSubtitleLabelOptions]
    var Title: js.UndefOr[VisualTitleLabelOptions]
  }

  object BarChartVisual {
    @inline
    def apply(
        VisualId: ShortRestrictiveResourceId,
        Actions: js.UndefOr[VisualCustomActionList] = js.undefined,
        ChartConfiguration: js.UndefOr[BarChartConfiguration] = js.undefined,
        ColumnHierarchies: js.UndefOr[ColumnHierarchyList] = js.undefined,
        Subtitle: js.UndefOr[VisualSubtitleLabelOptions] = js.undefined,
        Title: js.UndefOr[VisualTitleLabelOptions] = js.undefined
    ): BarChartVisual = {
      val __obj = js.Dynamic.literal(
        "VisualId" -> VisualId.asInstanceOf[js.Any]
      )

      Actions.foreach(__v => __obj.updateDynamic("Actions")(__v.asInstanceOf[js.Any]))
      ChartConfiguration.foreach(__v => __obj.updateDynamic("ChartConfiguration")(__v.asInstanceOf[js.Any]))
      ColumnHierarchies.foreach(__v => __obj.updateDynamic("ColumnHierarchies")(__v.asInstanceOf[js.Any]))
      Subtitle.foreach(__v => __obj.updateDynamic("Subtitle")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BarChartVisual]
    }
  }

  /** The options that determine the bin count of a histogram.
    */
  @js.native
  trait BinCountOptions extends js.Object {
    var Value: js.UndefOr[BinCountValue]
  }

  object BinCountOptions {
    @inline
    def apply(
        Value: js.UndefOr[BinCountValue] = js.undefined
    ): BinCountOptions = {
      val __obj = js.Dynamic.literal()
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BinCountOptions]
    }
  }

  /** The options that determine the bin width of a histogram.
    */
  @js.native
  trait BinWidthOptions extends js.Object {
    var BinCountLimit: js.UndefOr[BinCountLimit]
    var Value: js.UndefOr[BinWidthValue]
  }

  object BinWidthOptions {
    @inline
    def apply(
        BinCountLimit: js.UndefOr[BinCountLimit] = js.undefined,
        Value: js.UndefOr[BinWidthValue] = js.undefined
    ): BinWidthOptions = {
      val __obj = js.Dynamic.literal()
      BinCountLimit.foreach(__v => __obj.updateDynamic("BinCountLimit")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BinWidthOptions]
    }
  }

  /** The configuration of a body section.
    */
  @js.native
  trait BodySectionConfiguration extends js.Object {
    var Content: BodySectionContent
    var SectionId: ShortRestrictiveResourceId
    var PageBreakConfiguration: js.UndefOr[SectionPageBreakConfiguration]
    var Style: js.UndefOr[SectionStyle]
  }

  object BodySectionConfiguration {
    @inline
    def apply(
        Content: BodySectionContent,
        SectionId: ShortRestrictiveResourceId,
        PageBreakConfiguration: js.UndefOr[SectionPageBreakConfiguration] = js.undefined,
        Style: js.UndefOr[SectionStyle] = js.undefined
    ): BodySectionConfiguration = {
      val __obj = js.Dynamic.literal(
        "Content" -> Content.asInstanceOf[js.Any],
        "SectionId" -> SectionId.asInstanceOf[js.Any]
      )

      PageBreakConfiguration.foreach(__v => __obj.updateDynamic("PageBreakConfiguration")(__v.asInstanceOf[js.Any]))
      Style.foreach(__v => __obj.updateDynamic("Style")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BodySectionConfiguration]
    }
  }

  /** The configuration of content in a body section.
    */
  @js.native
  trait BodySectionContent extends js.Object {
    var Layout: js.UndefOr[SectionLayoutConfiguration]
  }

  object BodySectionContent {
    @inline
    def apply(
        Layout: js.UndefOr[SectionLayoutConfiguration] = js.undefined
    ): BodySectionContent = {
      val __obj = js.Dynamic.literal()
      Layout.foreach(__v => __obj.updateDynamic("Layout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BodySectionContent]
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

  /** The aggregated field well for a box plot.
    */
  @js.native
  trait BoxPlotAggregatedFieldWells extends js.Object {
    var GroupBy: js.UndefOr[BoxPlotDimensionFieldList]
    var Values: js.UndefOr[BoxPlotMeasureFieldList]
  }

  object BoxPlotAggregatedFieldWells {
    @inline
    def apply(
        GroupBy: js.UndefOr[BoxPlotDimensionFieldList] = js.undefined,
        Values: js.UndefOr[BoxPlotMeasureFieldList] = js.undefined
    ): BoxPlotAggregatedFieldWells = {
      val __obj = js.Dynamic.literal()
      GroupBy.foreach(__v => __obj.updateDynamic("GroupBy")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BoxPlotAggregatedFieldWells]
    }
  }

  /** The configuration of a <code>BoxPlotVisual</code>.
    */
  @js.native
  trait BoxPlotChartConfiguration extends js.Object {
    var BoxPlotOptions: js.UndefOr[BoxPlotOptions]
    var CategoryAxis: js.UndefOr[AxisDisplayOptions]
    var CategoryLabelOptions: js.UndefOr[ChartAxisLabelOptions]
    var FieldWells: js.UndefOr[BoxPlotFieldWells]
    var Legend: js.UndefOr[LegendOptions]
    var PrimaryYAxisDisplayOptions: js.UndefOr[AxisDisplayOptions]
    var PrimaryYAxisLabelOptions: js.UndefOr[ChartAxisLabelOptions]
    var ReferenceLines: js.UndefOr[ReferenceLineList]
    var SortConfiguration: js.UndefOr[BoxPlotSortConfiguration]
    var Tooltip: js.UndefOr[TooltipOptions]
    var VisualPalette: js.UndefOr[VisualPalette]
  }

  object BoxPlotChartConfiguration {
    @inline
    def apply(
        BoxPlotOptions: js.UndefOr[BoxPlotOptions] = js.undefined,
        CategoryAxis: js.UndefOr[AxisDisplayOptions] = js.undefined,
        CategoryLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined,
        FieldWells: js.UndefOr[BoxPlotFieldWells] = js.undefined,
        Legend: js.UndefOr[LegendOptions] = js.undefined,
        PrimaryYAxisDisplayOptions: js.UndefOr[AxisDisplayOptions] = js.undefined,
        PrimaryYAxisLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined,
        ReferenceLines: js.UndefOr[ReferenceLineList] = js.undefined,
        SortConfiguration: js.UndefOr[BoxPlotSortConfiguration] = js.undefined,
        Tooltip: js.UndefOr[TooltipOptions] = js.undefined,
        VisualPalette: js.UndefOr[VisualPalette] = js.undefined
    ): BoxPlotChartConfiguration = {
      val __obj = js.Dynamic.literal()
      BoxPlotOptions.foreach(__v => __obj.updateDynamic("BoxPlotOptions")(__v.asInstanceOf[js.Any]))
      CategoryAxis.foreach(__v => __obj.updateDynamic("CategoryAxis")(__v.asInstanceOf[js.Any]))
      CategoryLabelOptions.foreach(__v => __obj.updateDynamic("CategoryLabelOptions")(__v.asInstanceOf[js.Any]))
      FieldWells.foreach(__v => __obj.updateDynamic("FieldWells")(__v.asInstanceOf[js.Any]))
      Legend.foreach(__v => __obj.updateDynamic("Legend")(__v.asInstanceOf[js.Any]))
      PrimaryYAxisDisplayOptions.foreach(__v => __obj.updateDynamic("PrimaryYAxisDisplayOptions")(__v.asInstanceOf[js.Any]))
      PrimaryYAxisLabelOptions.foreach(__v => __obj.updateDynamic("PrimaryYAxisLabelOptions")(__v.asInstanceOf[js.Any]))
      ReferenceLines.foreach(__v => __obj.updateDynamic("ReferenceLines")(__v.asInstanceOf[js.Any]))
      SortConfiguration.foreach(__v => __obj.updateDynamic("SortConfiguration")(__v.asInstanceOf[js.Any]))
      Tooltip.foreach(__v => __obj.updateDynamic("Tooltip")(__v.asInstanceOf[js.Any]))
      VisualPalette.foreach(__v => __obj.updateDynamic("VisualPalette")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BoxPlotChartConfiguration]
    }
  }

  /** The field wells of a <code>BoxPlotVisual</code>. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait BoxPlotFieldWells extends js.Object {
    var BoxPlotAggregatedFieldWells: js.UndefOr[BoxPlotAggregatedFieldWells]
  }

  object BoxPlotFieldWells {
    @inline
    def apply(
        BoxPlotAggregatedFieldWells: js.UndefOr[BoxPlotAggregatedFieldWells] = js.undefined
    ): BoxPlotFieldWells = {
      val __obj = js.Dynamic.literal()
      BoxPlotAggregatedFieldWells.foreach(__v => __obj.updateDynamic("BoxPlotAggregatedFieldWells")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BoxPlotFieldWells]
    }
  }

  /** The options of a box plot visual.
    */
  @js.native
  trait BoxPlotOptions extends js.Object {
    var AllDataPointsVisibility: js.UndefOr[Visibility]
    var OutlierVisibility: js.UndefOr[Visibility]
    var StyleOptions: js.UndefOr[BoxPlotStyleOptions]
  }

  object BoxPlotOptions {
    @inline
    def apply(
        AllDataPointsVisibility: js.UndefOr[Visibility] = js.undefined,
        OutlierVisibility: js.UndefOr[Visibility] = js.undefined,
        StyleOptions: js.UndefOr[BoxPlotStyleOptions] = js.undefined
    ): BoxPlotOptions = {
      val __obj = js.Dynamic.literal()
      AllDataPointsVisibility.foreach(__v => __obj.updateDynamic("AllDataPointsVisibility")(__v.asInstanceOf[js.Any]))
      OutlierVisibility.foreach(__v => __obj.updateDynamic("OutlierVisibility")(__v.asInstanceOf[js.Any]))
      StyleOptions.foreach(__v => __obj.updateDynamic("StyleOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BoxPlotOptions]
    }
  }

  /** The sort configuration of a <code>BoxPlotVisual</code>.
    */
  @js.native
  trait BoxPlotSortConfiguration extends js.Object {
    var CategorySort: js.UndefOr[FieldSortOptionsList]
    var PaginationConfiguration: js.UndefOr[PaginationConfiguration]
  }

  object BoxPlotSortConfiguration {
    @inline
    def apply(
        CategorySort: js.UndefOr[FieldSortOptionsList] = js.undefined,
        PaginationConfiguration: js.UndefOr[PaginationConfiguration] = js.undefined
    ): BoxPlotSortConfiguration = {
      val __obj = js.Dynamic.literal()
      CategorySort.foreach(__v => __obj.updateDynamic("CategorySort")(__v.asInstanceOf[js.Any]))
      PaginationConfiguration.foreach(__v => __obj.updateDynamic("PaginationConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BoxPlotSortConfiguration]
    }
  }

  /** The style options of the box plot.
    */
  @js.native
  trait BoxPlotStyleOptions extends js.Object {
    var FillStyle: js.UndefOr[BoxPlotFillStyle]
  }

  object BoxPlotStyleOptions {
    @inline
    def apply(
        FillStyle: js.UndefOr[BoxPlotFillStyle] = js.undefined
    ): BoxPlotStyleOptions = {
      val __obj = js.Dynamic.literal()
      FillStyle.foreach(__v => __obj.updateDynamic("FillStyle")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BoxPlotStyleOptions]
    }
  }

  /** A box plot. For more information, see [[https://docs.aws.amazon.com/quicksight/latest/user/box-plots.html|Using box plots]] in the <i>Amazon QuickSight User Guide</i>.
    */
  @js.native
  trait BoxPlotVisual extends js.Object {
    var VisualId: ShortRestrictiveResourceId
    var Actions: js.UndefOr[VisualCustomActionList]
    var ChartConfiguration: js.UndefOr[BoxPlotChartConfiguration]
    var ColumnHierarchies: js.UndefOr[ColumnHierarchyList]
    var Subtitle: js.UndefOr[VisualSubtitleLabelOptions]
    var Title: js.UndefOr[VisualTitleLabelOptions]
  }

  object BoxPlotVisual {
    @inline
    def apply(
        VisualId: ShortRestrictiveResourceId,
        Actions: js.UndefOr[VisualCustomActionList] = js.undefined,
        ChartConfiguration: js.UndefOr[BoxPlotChartConfiguration] = js.undefined,
        ColumnHierarchies: js.UndefOr[ColumnHierarchyList] = js.undefined,
        Subtitle: js.UndefOr[VisualSubtitleLabelOptions] = js.undefined,
        Title: js.UndefOr[VisualTitleLabelOptions] = js.undefined
    ): BoxPlotVisual = {
      val __obj = js.Dynamic.literal(
        "VisualId" -> VisualId.asInstanceOf[js.Any]
      )

      Actions.foreach(__v => __obj.updateDynamic("Actions")(__v.asInstanceOf[js.Any]))
      ChartConfiguration.foreach(__v => __obj.updateDynamic("ChartConfiguration")(__v.asInstanceOf[js.Any]))
      ColumnHierarchies.foreach(__v => __obj.updateDynamic("ColumnHierarchies")(__v.asInstanceOf[js.Any]))
      Subtitle.foreach(__v => __obj.updateDynamic("Subtitle")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BoxPlotVisual]
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

  /** The calculated field of an analysis.
    */
  @js.native
  trait CalculatedField extends js.Object {
    var DataSetIdentifier: DataSetIdentifier
    var Expression: Expression
    var Name: ColumnName
  }

  object CalculatedField {
    @inline
    def apply(
        DataSetIdentifier: DataSetIdentifier,
        Expression: Expression,
        Name: ColumnName
    ): CalculatedField = {
      val __obj = js.Dynamic.literal(
        "DataSetIdentifier" -> DataSetIdentifier.asInstanceOf[js.Any],
        "Expression" -> Expression.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CalculatedField]
    }
  }

  /** The table calculation measure field for pivot tables.
    */
  @js.native
  trait CalculatedMeasureField extends js.Object {
    var Expression: Expression
    var FieldId: FieldId
  }

  object CalculatedMeasureField {
    @inline
    def apply(
        Expression: Expression,
        FieldId: FieldId
    ): CalculatedMeasureField = {
      val __obj = js.Dynamic.literal(
        "Expression" -> Expression.asInstanceOf[js.Any],
        "FieldId" -> FieldId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CalculatedMeasureField]
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

  /** The values that are displayed in a control can be configured to only show values that are valid based on what's selected in other controls.
    */
  @js.native
  trait CascadingControlConfiguration extends js.Object {
    var SourceControls: js.UndefOr[CascadingControlSourceList]
  }

  object CascadingControlConfiguration {
    @inline
    def apply(
        SourceControls: js.UndefOr[CascadingControlSourceList] = js.undefined
    ): CascadingControlConfiguration = {
      val __obj = js.Dynamic.literal()
      SourceControls.foreach(__v => __obj.updateDynamic("SourceControls")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CascadingControlConfiguration]
    }
  }

  /** The source controls that are used in a <code>CascadingControlConfiguration</code>.
    */
  @js.native
  trait CascadingControlSource extends js.Object {
    var ColumnToMatch: js.UndefOr[ColumnIdentifier]
    var SourceSheetControlId: js.UndefOr[String]
  }

  object CascadingControlSource {
    @inline
    def apply(
        ColumnToMatch: js.UndefOr[ColumnIdentifier] = js.undefined,
        SourceSheetControlId: js.UndefOr[String] = js.undefined
    ): CascadingControlSource = {
      val __obj = js.Dynamic.literal()
      ColumnToMatch.foreach(__v => __obj.updateDynamic("ColumnToMatch")(__v.asInstanceOf[js.Any]))
      SourceSheetControlId.foreach(__v => __obj.updateDynamic("SourceSheetControlId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CascadingControlSource]
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

  /** The dimension type field with categorical type columns..
    */
  @js.native
  trait CategoricalDimensionField extends js.Object {
    var Column: ColumnIdentifier
    var FieldId: FieldId
    var FormatConfiguration: js.UndefOr[StringFormatConfiguration]
    var HierarchyId: js.UndefOr[HierarchyId]
  }

  object CategoricalDimensionField {
    @inline
    def apply(
        Column: ColumnIdentifier,
        FieldId: FieldId,
        FormatConfiguration: js.UndefOr[StringFormatConfiguration] = js.undefined,
        HierarchyId: js.UndefOr[HierarchyId] = js.undefined
    ): CategoricalDimensionField = {
      val __obj = js.Dynamic.literal(
        "Column" -> Column.asInstanceOf[js.Any],
        "FieldId" -> FieldId.asInstanceOf[js.Any]
      )

      FormatConfiguration.foreach(__v => __obj.updateDynamic("FormatConfiguration")(__v.asInstanceOf[js.Any]))
      HierarchyId.foreach(__v => __obj.updateDynamic("HierarchyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CategoricalDimensionField]
    }
  }

  /** The measure type field with categorical type columns.
    */
  @js.native
  trait CategoricalMeasureField extends js.Object {
    var Column: ColumnIdentifier
    var FieldId: FieldId
    var AggregationFunction: js.UndefOr[CategoricalAggregationFunction]
    var FormatConfiguration: js.UndefOr[StringFormatConfiguration]
  }

  object CategoricalMeasureField {
    @inline
    def apply(
        Column: ColumnIdentifier,
        FieldId: FieldId,
        AggregationFunction: js.UndefOr[CategoricalAggregationFunction] = js.undefined,
        FormatConfiguration: js.UndefOr[StringFormatConfiguration] = js.undefined
    ): CategoricalMeasureField = {
      val __obj = js.Dynamic.literal(
        "Column" -> Column.asInstanceOf[js.Any],
        "FieldId" -> FieldId.asInstanceOf[js.Any]
      )

      AggregationFunction.foreach(__v => __obj.updateDynamic("AggregationFunction")(__v.asInstanceOf[js.Any]))
      FormatConfiguration.foreach(__v => __obj.updateDynamic("FormatConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CategoricalMeasureField]
    }
  }

  /** The numeric equality type drill down filter.
    */
  @js.native
  trait CategoryDrillDownFilter extends js.Object {
    var CategoryValues: CategoryValueList
    var Column: ColumnIdentifier
  }

  object CategoryDrillDownFilter {
    @inline
    def apply(
        CategoryValues: CategoryValueList,
        Column: ColumnIdentifier
    ): CategoryDrillDownFilter = {
      val __obj = js.Dynamic.literal(
        "CategoryValues" -> CategoryValues.asInstanceOf[js.Any],
        "Column" -> Column.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CategoryDrillDownFilter]
    }
  }

  /** A <code>CategoryFilter</code> filters text values. For more information, see [[https://docs.aws.amazon.com/quicksight/latest/user/add-a-text-filter-data-prep.html|Adding text filters]] in the <i>Amazon QuickSight User Guide</i>.
    */
  @js.native
  trait CategoryFilter extends js.Object {
    var Column: ColumnIdentifier
    var FilterId: ShortRestrictiveResourceId
    var Configuration: js.UndefOr[CategoryFilterConfiguration]
  }

  object CategoryFilter {
    @inline
    def apply(
        Column: ColumnIdentifier,
        FilterId: ShortRestrictiveResourceId,
        Configuration: js.UndefOr[CategoryFilterConfiguration] = js.undefined
    ): CategoryFilter = {
      val __obj = js.Dynamic.literal(
        "Column" -> Column.asInstanceOf[js.Any],
        "FilterId" -> FilterId.asInstanceOf[js.Any]
      )

      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CategoryFilter]
    }
  }

  /** The configuration for a <code>CategoryFilter</code>. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait CategoryFilterConfiguration extends js.Object {
    var CustomFilterConfiguration: js.UndefOr[CustomFilterConfiguration]
    var CustomFilterListConfiguration: js.UndefOr[CustomFilterListConfiguration]
    var FilterListConfiguration: js.UndefOr[FilterListConfiguration]
  }

  object CategoryFilterConfiguration {
    @inline
    def apply(
        CustomFilterConfiguration: js.UndefOr[CustomFilterConfiguration] = js.undefined,
        CustomFilterListConfiguration: js.UndefOr[CustomFilterListConfiguration] = js.undefined,
        FilterListConfiguration: js.UndefOr[FilterListConfiguration] = js.undefined
    ): CategoryFilterConfiguration = {
      val __obj = js.Dynamic.literal()
      CustomFilterConfiguration.foreach(__v => __obj.updateDynamic("CustomFilterConfiguration")(__v.asInstanceOf[js.Any]))
      CustomFilterListConfiguration.foreach(__v => __obj.updateDynamic("CustomFilterListConfiguration")(__v.asInstanceOf[js.Any]))
      FilterListConfiguration.foreach(__v => __obj.updateDynamic("FilterListConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CategoryFilterConfiguration]
    }
  }

  /** The label options for an axis on a chart.
    */
  @js.native
  trait ChartAxisLabelOptions extends js.Object {
    var AxisLabelOptions: js.UndefOr[AxisLabelOptionsList]
    var SortIconVisibility: js.UndefOr[Visibility]
    var Visibility: js.UndefOr[Visibility]
  }

  object ChartAxisLabelOptions {
    @inline
    def apply(
        AxisLabelOptions: js.UndefOr[AxisLabelOptionsList] = js.undefined,
        SortIconVisibility: js.UndefOr[Visibility] = js.undefined,
        Visibility: js.UndefOr[Visibility] = js.undefined
    ): ChartAxisLabelOptions = {
      val __obj = js.Dynamic.literal()
      AxisLabelOptions.foreach(__v => __obj.updateDynamic("AxisLabelOptions")(__v.asInstanceOf[js.Any]))
      SortIconVisibility.foreach(__v => __obj.updateDynamic("SortIconVisibility")(__v.asInstanceOf[js.Any]))
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChartAxisLabelOptions]
    }
  }

  /** The cluster marker that is a part of the cluster marker configuration.
    */
  @js.native
  trait ClusterMarker extends js.Object {
    var SimpleClusterMarker: js.UndefOr[SimpleClusterMarker]
  }

  object ClusterMarker {
    @inline
    def apply(
        SimpleClusterMarker: js.UndefOr[SimpleClusterMarker] = js.undefined
    ): ClusterMarker = {
      val __obj = js.Dynamic.literal()
      SimpleClusterMarker.foreach(__v => __obj.updateDynamic("SimpleClusterMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterMarker]
    }
  }

  /** The cluster marker configuration of the geospatial map selected point style.
    */
  @js.native
  trait ClusterMarkerConfiguration extends js.Object {
    var ClusterMarker: js.UndefOr[ClusterMarker]
  }

  object ClusterMarkerConfiguration {
    @inline
    def apply(
        ClusterMarker: js.UndefOr[ClusterMarker] = js.undefined
    ): ClusterMarkerConfiguration = {
      val __obj = js.Dynamic.literal()
      ClusterMarker.foreach(__v => __obj.updateDynamic("ClusterMarker")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClusterMarkerConfiguration]
    }
  }

  /** Determines the color scale that is applied to the visual.
    */
  @js.native
  trait ColorScale extends js.Object {
    var ColorFillType: ColorFillType
    var Colors: ColorScaleColorList
    var NullValueColor: js.UndefOr[DataColor]
  }

  object ColorScale {
    @inline
    def apply(
        ColorFillType: ColorFillType,
        Colors: ColorScaleColorList,
        NullValueColor: js.UndefOr[DataColor] = js.undefined
    ): ColorScale = {
      val __obj = js.Dynamic.literal(
        "ColorFillType" -> ColorFillType.asInstanceOf[js.Any],
        "Colors" -> Colors.asInstanceOf[js.Any]
      )

      NullValueColor.foreach(__v => __obj.updateDynamic("NullValueColor")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ColorScale]
    }
  }

  /** The general configuration of a column.
    */
  @js.native
  trait ColumnConfiguration extends js.Object {
    var Column: ColumnIdentifier
    var FormatConfiguration: js.UndefOr[FormatConfiguration]
    var Role: js.UndefOr[ColumnRole]
  }

  object ColumnConfiguration {
    @inline
    def apply(
        Column: ColumnIdentifier,
        FormatConfiguration: js.UndefOr[FormatConfiguration] = js.undefined,
        Role: js.UndefOr[ColumnRole] = js.undefined
    ): ColumnConfiguration = {
      val __obj = js.Dynamic.literal(
        "Column" -> Column.asInstanceOf[js.Any]
      )

      FormatConfiguration.foreach(__v => __obj.updateDynamic("FormatConfiguration")(__v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.updateDynamic("Role")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ColumnConfiguration]
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

  /** The option that determines the hierarchy of the fields for a visual element.
    */
  @js.native
  trait ColumnHierarchy extends js.Object {
    var DateTimeHierarchy: js.UndefOr[DateTimeHierarchy]
    var ExplicitHierarchy: js.UndefOr[ExplicitHierarchy]
    var PredefinedHierarchy: js.UndefOr[PredefinedHierarchy]
  }

  object ColumnHierarchy {
    @inline
    def apply(
        DateTimeHierarchy: js.UndefOr[DateTimeHierarchy] = js.undefined,
        ExplicitHierarchy: js.UndefOr[ExplicitHierarchy] = js.undefined,
        PredefinedHierarchy: js.UndefOr[PredefinedHierarchy] = js.undefined
    ): ColumnHierarchy = {
      val __obj = js.Dynamic.literal()
      DateTimeHierarchy.foreach(__v => __obj.updateDynamic("DateTimeHierarchy")(__v.asInstanceOf[js.Any]))
      ExplicitHierarchy.foreach(__v => __obj.updateDynamic("ExplicitHierarchy")(__v.asInstanceOf[js.Any]))
      PredefinedHierarchy.foreach(__v => __obj.updateDynamic("PredefinedHierarchy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ColumnHierarchy]
    }
  }

  /** A column of a data set.
    */
  @js.native
  trait ColumnIdentifier extends js.Object {
    var ColumnName: ColumnName
    var DataSetIdentifier: DataSetIdentifier
  }

  object ColumnIdentifier {
    @inline
    def apply(
        ColumnName: ColumnName,
        DataSetIdentifier: DataSetIdentifier
    ): ColumnIdentifier = {
      val __obj = js.Dynamic.literal(
        "ColumnName" -> ColumnName.asInstanceOf[js.Any],
        "DataSetIdentifier" -> DataSetIdentifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ColumnIdentifier]
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

  /** The sort configuration for a column that is not used in a field well.
    */
  @js.native
  trait ColumnSort extends js.Object {
    var Direction: SortDirection
    var SortBy: ColumnIdentifier
    var AggregationFunction: js.UndefOr[AggregationFunction]
  }

  object ColumnSort {
    @inline
    def apply(
        Direction: SortDirection,
        SortBy: ColumnIdentifier,
        AggregationFunction: js.UndefOr[AggregationFunction] = js.undefined
    ): ColumnSort = {
      val __obj = js.Dynamic.literal(
        "Direction" -> Direction.asInstanceOf[js.Any],
        "SortBy" -> SortBy.asInstanceOf[js.Any]
      )

      AggregationFunction.foreach(__v => __obj.updateDynamic("AggregationFunction")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ColumnSort]
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

  /** The tooltip item for the columns that are not part of a field well.
    */
  @js.native
  trait ColumnTooltipItem extends js.Object {
    var Column: ColumnIdentifier
    var Aggregation: js.UndefOr[AggregationFunction]
    var Label: js.UndefOr[String]
    var Visibility: js.UndefOr[Visibility]
  }

  object ColumnTooltipItem {
    @inline
    def apply(
        Column: ColumnIdentifier,
        Aggregation: js.UndefOr[AggregationFunction] = js.undefined,
        Label: js.UndefOr[String] = js.undefined,
        Visibility: js.UndefOr[Visibility] = js.undefined
    ): ColumnTooltipItem = {
      val __obj = js.Dynamic.literal(
        "Column" -> Column.asInstanceOf[js.Any]
      )

      Aggregation.foreach(__v => __obj.updateDynamic("Aggregation")(__v.asInstanceOf[js.Any]))
      Label.foreach(__v => __obj.updateDynamic("Label")(__v.asInstanceOf[js.Any]))
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ColumnTooltipItem]
    }
  }

  /** The aggregated field wells of a combo chart.
    */
  @js.native
  trait ComboChartAggregatedFieldWells extends js.Object {
    var BarValues: js.UndefOr[MeasureFieldList]
    var Category: js.UndefOr[DimensionFieldList]
    var Colors: js.UndefOr[DimensionFieldList]
    var LineValues: js.UndefOr[MeasureFieldList]
  }

  object ComboChartAggregatedFieldWells {
    @inline
    def apply(
        BarValues: js.UndefOr[MeasureFieldList] = js.undefined,
        Category: js.UndefOr[DimensionFieldList] = js.undefined,
        Colors: js.UndefOr[DimensionFieldList] = js.undefined,
        LineValues: js.UndefOr[MeasureFieldList] = js.undefined
    ): ComboChartAggregatedFieldWells = {
      val __obj = js.Dynamic.literal()
      BarValues.foreach(__v => __obj.updateDynamic("BarValues")(__v.asInstanceOf[js.Any]))
      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      Colors.foreach(__v => __obj.updateDynamic("Colors")(__v.asInstanceOf[js.Any]))
      LineValues.foreach(__v => __obj.updateDynamic("LineValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComboChartAggregatedFieldWells]
    }
  }

  /** The configuration of a <code>ComboChartVisual</code>.
    */
  @js.native
  trait ComboChartConfiguration extends js.Object {
    var BarDataLabels: js.UndefOr[DataLabelOptions]
    var BarsArrangement: js.UndefOr[BarsArrangement]
    var CategoryAxis: js.UndefOr[AxisDisplayOptions]
    var CategoryLabelOptions: js.UndefOr[ChartAxisLabelOptions]
    var ColorLabelOptions: js.UndefOr[ChartAxisLabelOptions]
    var FieldWells: js.UndefOr[ComboChartFieldWells]
    var Legend: js.UndefOr[LegendOptions]
    var LineDataLabels: js.UndefOr[DataLabelOptions]
    var PrimaryYAxisDisplayOptions: js.UndefOr[AxisDisplayOptions]
    var PrimaryYAxisLabelOptions: js.UndefOr[ChartAxisLabelOptions]
    var ReferenceLines: js.UndefOr[ReferenceLineList]
    var SecondaryYAxisDisplayOptions: js.UndefOr[AxisDisplayOptions]
    var SecondaryYAxisLabelOptions: js.UndefOr[ChartAxisLabelOptions]
    var SortConfiguration: js.UndefOr[ComboChartSortConfiguration]
    var Tooltip: js.UndefOr[TooltipOptions]
    var VisualPalette: js.UndefOr[VisualPalette]
  }

  object ComboChartConfiguration {
    @inline
    def apply(
        BarDataLabels: js.UndefOr[DataLabelOptions] = js.undefined,
        BarsArrangement: js.UndefOr[BarsArrangement] = js.undefined,
        CategoryAxis: js.UndefOr[AxisDisplayOptions] = js.undefined,
        CategoryLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined,
        ColorLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined,
        FieldWells: js.UndefOr[ComboChartFieldWells] = js.undefined,
        Legend: js.UndefOr[LegendOptions] = js.undefined,
        LineDataLabels: js.UndefOr[DataLabelOptions] = js.undefined,
        PrimaryYAxisDisplayOptions: js.UndefOr[AxisDisplayOptions] = js.undefined,
        PrimaryYAxisLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined,
        ReferenceLines: js.UndefOr[ReferenceLineList] = js.undefined,
        SecondaryYAxisDisplayOptions: js.UndefOr[AxisDisplayOptions] = js.undefined,
        SecondaryYAxisLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined,
        SortConfiguration: js.UndefOr[ComboChartSortConfiguration] = js.undefined,
        Tooltip: js.UndefOr[TooltipOptions] = js.undefined,
        VisualPalette: js.UndefOr[VisualPalette] = js.undefined
    ): ComboChartConfiguration = {
      val __obj = js.Dynamic.literal()
      BarDataLabels.foreach(__v => __obj.updateDynamic("BarDataLabels")(__v.asInstanceOf[js.Any]))
      BarsArrangement.foreach(__v => __obj.updateDynamic("BarsArrangement")(__v.asInstanceOf[js.Any]))
      CategoryAxis.foreach(__v => __obj.updateDynamic("CategoryAxis")(__v.asInstanceOf[js.Any]))
      CategoryLabelOptions.foreach(__v => __obj.updateDynamic("CategoryLabelOptions")(__v.asInstanceOf[js.Any]))
      ColorLabelOptions.foreach(__v => __obj.updateDynamic("ColorLabelOptions")(__v.asInstanceOf[js.Any]))
      FieldWells.foreach(__v => __obj.updateDynamic("FieldWells")(__v.asInstanceOf[js.Any]))
      Legend.foreach(__v => __obj.updateDynamic("Legend")(__v.asInstanceOf[js.Any]))
      LineDataLabels.foreach(__v => __obj.updateDynamic("LineDataLabels")(__v.asInstanceOf[js.Any]))
      PrimaryYAxisDisplayOptions.foreach(__v => __obj.updateDynamic("PrimaryYAxisDisplayOptions")(__v.asInstanceOf[js.Any]))
      PrimaryYAxisLabelOptions.foreach(__v => __obj.updateDynamic("PrimaryYAxisLabelOptions")(__v.asInstanceOf[js.Any]))
      ReferenceLines.foreach(__v => __obj.updateDynamic("ReferenceLines")(__v.asInstanceOf[js.Any]))
      SecondaryYAxisDisplayOptions.foreach(__v => __obj.updateDynamic("SecondaryYAxisDisplayOptions")(__v.asInstanceOf[js.Any]))
      SecondaryYAxisLabelOptions.foreach(__v => __obj.updateDynamic("SecondaryYAxisLabelOptions")(__v.asInstanceOf[js.Any]))
      SortConfiguration.foreach(__v => __obj.updateDynamic("SortConfiguration")(__v.asInstanceOf[js.Any]))
      Tooltip.foreach(__v => __obj.updateDynamic("Tooltip")(__v.asInstanceOf[js.Any]))
      VisualPalette.foreach(__v => __obj.updateDynamic("VisualPalette")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComboChartConfiguration]
    }
  }

  /** The field wells of the visual. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait ComboChartFieldWells extends js.Object {
    var ComboChartAggregatedFieldWells: js.UndefOr[ComboChartAggregatedFieldWells]
  }

  object ComboChartFieldWells {
    @inline
    def apply(
        ComboChartAggregatedFieldWells: js.UndefOr[ComboChartAggregatedFieldWells] = js.undefined
    ): ComboChartFieldWells = {
      val __obj = js.Dynamic.literal()
      ComboChartAggregatedFieldWells.foreach(__v => __obj.updateDynamic("ComboChartAggregatedFieldWells")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComboChartFieldWells]
    }
  }

  /** The sort configuration of a <code>ComboChartVisual</code>.
    */
  @js.native
  trait ComboChartSortConfiguration extends js.Object {
    var CategoryItemsLimit: js.UndefOr[ItemsLimitConfiguration]
    var CategorySort: js.UndefOr[FieldSortOptionsList]
    var ColorItemsLimit: js.UndefOr[ItemsLimitConfiguration]
    var ColorSort: js.UndefOr[FieldSortOptionsList]
  }

  object ComboChartSortConfiguration {
    @inline
    def apply(
        CategoryItemsLimit: js.UndefOr[ItemsLimitConfiguration] = js.undefined,
        CategorySort: js.UndefOr[FieldSortOptionsList] = js.undefined,
        ColorItemsLimit: js.UndefOr[ItemsLimitConfiguration] = js.undefined,
        ColorSort: js.UndefOr[FieldSortOptionsList] = js.undefined
    ): ComboChartSortConfiguration = {
      val __obj = js.Dynamic.literal()
      CategoryItemsLimit.foreach(__v => __obj.updateDynamic("CategoryItemsLimit")(__v.asInstanceOf[js.Any]))
      CategorySort.foreach(__v => __obj.updateDynamic("CategorySort")(__v.asInstanceOf[js.Any]))
      ColorItemsLimit.foreach(__v => __obj.updateDynamic("ColorItemsLimit")(__v.asInstanceOf[js.Any]))
      ColorSort.foreach(__v => __obj.updateDynamic("ColorSort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComboChartSortConfiguration]
    }
  }

  /** A combo chart. The <code>ComboChartVisual</code> includes stacked bar combo charts and clustered bar combo charts For more information, see [[https://docs.aws.amazon.com/quicksight/latest/user/combo-charts.html|Using combo charts]] in the <i>Amazon QuickSight User Guide</i>.
    */
  @js.native
  trait ComboChartVisual extends js.Object {
    var VisualId: ShortRestrictiveResourceId
    var Actions: js.UndefOr[VisualCustomActionList]
    var ChartConfiguration: js.UndefOr[ComboChartConfiguration]
    var ColumnHierarchies: js.UndefOr[ColumnHierarchyList]
    var Subtitle: js.UndefOr[VisualSubtitleLabelOptions]
    var Title: js.UndefOr[VisualTitleLabelOptions]
  }

  object ComboChartVisual {
    @inline
    def apply(
        VisualId: ShortRestrictiveResourceId,
        Actions: js.UndefOr[VisualCustomActionList] = js.undefined,
        ChartConfiguration: js.UndefOr[ComboChartConfiguration] = js.undefined,
        ColumnHierarchies: js.UndefOr[ColumnHierarchyList] = js.undefined,
        Subtitle: js.UndefOr[VisualSubtitleLabelOptions] = js.undefined,
        Title: js.UndefOr[VisualTitleLabelOptions] = js.undefined
    ): ComboChartVisual = {
      val __obj = js.Dynamic.literal(
        "VisualId" -> VisualId.asInstanceOf[js.Any]
      )

      Actions.foreach(__v => __obj.updateDynamic("Actions")(__v.asInstanceOf[js.Any]))
      ChartConfiguration.foreach(__v => __obj.updateDynamic("ChartConfiguration")(__v.asInstanceOf[js.Any]))
      ColumnHierarchies.foreach(__v => __obj.updateDynamic("ColumnHierarchies")(__v.asInstanceOf[js.Any]))
      Subtitle.foreach(__v => __obj.updateDynamic("Subtitle")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComboChartVisual]
    }
  }

  /** The comparison display configuration of a KPI or gauge chart.
    */
  @js.native
  trait ComparisonConfiguration extends js.Object {
    var ComparisonFormat: js.UndefOr[ComparisonFormatConfiguration]
    var ComparisonMethod: js.UndefOr[ComparisonMethod]
  }

  object ComparisonConfiguration {
    @inline
    def apply(
        ComparisonFormat: js.UndefOr[ComparisonFormatConfiguration] = js.undefined,
        ComparisonMethod: js.UndefOr[ComparisonMethod] = js.undefined
    ): ComparisonConfiguration = {
      val __obj = js.Dynamic.literal()
      ComparisonFormat.foreach(__v => __obj.updateDynamic("ComparisonFormat")(__v.asInstanceOf[js.Any]))
      ComparisonMethod.foreach(__v => __obj.updateDynamic("ComparisonMethod")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComparisonConfiguration]
    }
  }

  /** The format of the comparison. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait ComparisonFormatConfiguration extends js.Object {
    var NumberDisplayFormatConfiguration: js.UndefOr[NumberDisplayFormatConfiguration]
    var PercentageDisplayFormatConfiguration: js.UndefOr[PercentageDisplayFormatConfiguration]
  }

  object ComparisonFormatConfiguration {
    @inline
    def apply(
        NumberDisplayFormatConfiguration: js.UndefOr[NumberDisplayFormatConfiguration] = js.undefined,
        PercentageDisplayFormatConfiguration: js.UndefOr[PercentageDisplayFormatConfiguration] = js.undefined
    ): ComparisonFormatConfiguration = {
      val __obj = js.Dynamic.literal()
      NumberDisplayFormatConfiguration.foreach(__v => __obj.updateDynamic("NumberDisplayFormatConfiguration")(__v.asInstanceOf[js.Any]))
      PercentageDisplayFormatConfiguration.foreach(__v => __obj.updateDynamic("PercentageDisplayFormatConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComparisonFormatConfiguration]
    }
  }

  /** The computation union that is used in an insight visual. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait Computation extends js.Object {
    var Forecast: js.UndefOr[ForecastComputation]
    var GrowthRate: js.UndefOr[GrowthRateComputation]
    var MaximumMinimum: js.UndefOr[MaximumMinimumComputation]
    var MetricComparison: js.UndefOr[MetricComparisonComputation]
    var PeriodOverPeriod: js.UndefOr[PeriodOverPeriodComputation]
    var PeriodToDate: js.UndefOr[PeriodToDateComputation]
    var TopBottomMovers: js.UndefOr[TopBottomMoversComputation]
    var TopBottomRanked: js.UndefOr[TopBottomRankedComputation]
    var TotalAggregation: js.UndefOr[TotalAggregationComputation]
    var UniqueValues: js.UndefOr[UniqueValuesComputation]
  }

  object Computation {
    @inline
    def apply(
        Forecast: js.UndefOr[ForecastComputation] = js.undefined,
        GrowthRate: js.UndefOr[GrowthRateComputation] = js.undefined,
        MaximumMinimum: js.UndefOr[MaximumMinimumComputation] = js.undefined,
        MetricComparison: js.UndefOr[MetricComparisonComputation] = js.undefined,
        PeriodOverPeriod: js.UndefOr[PeriodOverPeriodComputation] = js.undefined,
        PeriodToDate: js.UndefOr[PeriodToDateComputation] = js.undefined,
        TopBottomMovers: js.UndefOr[TopBottomMoversComputation] = js.undefined,
        TopBottomRanked: js.UndefOr[TopBottomRankedComputation] = js.undefined,
        TotalAggregation: js.UndefOr[TotalAggregationComputation] = js.undefined,
        UniqueValues: js.UndefOr[UniqueValuesComputation] = js.undefined
    ): Computation = {
      val __obj = js.Dynamic.literal()
      Forecast.foreach(__v => __obj.updateDynamic("Forecast")(__v.asInstanceOf[js.Any]))
      GrowthRate.foreach(__v => __obj.updateDynamic("GrowthRate")(__v.asInstanceOf[js.Any]))
      MaximumMinimum.foreach(__v => __obj.updateDynamic("MaximumMinimum")(__v.asInstanceOf[js.Any]))
      MetricComparison.foreach(__v => __obj.updateDynamic("MetricComparison")(__v.asInstanceOf[js.Any]))
      PeriodOverPeriod.foreach(__v => __obj.updateDynamic("PeriodOverPeriod")(__v.asInstanceOf[js.Any]))
      PeriodToDate.foreach(__v => __obj.updateDynamic("PeriodToDate")(__v.asInstanceOf[js.Any]))
      TopBottomMovers.foreach(__v => __obj.updateDynamic("TopBottomMovers")(__v.asInstanceOf[js.Any]))
      TopBottomRanked.foreach(__v => __obj.updateDynamic("TopBottomRanked")(__v.asInstanceOf[js.Any]))
      TotalAggregation.foreach(__v => __obj.updateDynamic("TotalAggregation")(__v.asInstanceOf[js.Any]))
      UniqueValues.foreach(__v => __obj.updateDynamic("UniqueValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Computation]
    }
  }

  /** The formatting configuration for the color.
    */
  @js.native
  trait ConditionalFormattingColor extends js.Object {
    var Gradient: js.UndefOr[ConditionalFormattingGradientColor]
    var Solid: js.UndefOr[ConditionalFormattingSolidColor]
  }

  object ConditionalFormattingColor {
    @inline
    def apply(
        Gradient: js.UndefOr[ConditionalFormattingGradientColor] = js.undefined,
        Solid: js.UndefOr[ConditionalFormattingSolidColor] = js.undefined
    ): ConditionalFormattingColor = {
      val __obj = js.Dynamic.literal()
      Gradient.foreach(__v => __obj.updateDynamic("Gradient")(__v.asInstanceOf[js.Any]))
      Solid.foreach(__v => __obj.updateDynamic("Solid")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConditionalFormattingColor]
    }
  }

  /** Determines the custom condition for an icon set.
    */
  @js.native
  trait ConditionalFormattingCustomIconCondition extends js.Object {
    var Expression: Expression
    var IconOptions: ConditionalFormattingCustomIconOptions
    var Color: js.UndefOr[HexColor]
    var DisplayConfiguration: js.UndefOr[ConditionalFormattingIconDisplayConfiguration]
  }

  object ConditionalFormattingCustomIconCondition {
    @inline
    def apply(
        Expression: Expression,
        IconOptions: ConditionalFormattingCustomIconOptions,
        Color: js.UndefOr[HexColor] = js.undefined,
        DisplayConfiguration: js.UndefOr[ConditionalFormattingIconDisplayConfiguration] = js.undefined
    ): ConditionalFormattingCustomIconCondition = {
      val __obj = js.Dynamic.literal(
        "Expression" -> Expression.asInstanceOf[js.Any],
        "IconOptions" -> IconOptions.asInstanceOf[js.Any]
      )

      Color.foreach(__v => __obj.updateDynamic("Color")(__v.asInstanceOf[js.Any]))
      DisplayConfiguration.foreach(__v => __obj.updateDynamic("DisplayConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConditionalFormattingCustomIconCondition]
    }
  }

  /** Custom icon options for an icon set.
    */
  @js.native
  trait ConditionalFormattingCustomIconOptions extends js.Object {
    var Icon: js.UndefOr[Icon]
    var UnicodeIcon: js.UndefOr[UnicodeIcon]
  }

  object ConditionalFormattingCustomIconOptions {
    @inline
    def apply(
        Icon: js.UndefOr[Icon] = js.undefined,
        UnicodeIcon: js.UndefOr[UnicodeIcon] = js.undefined
    ): ConditionalFormattingCustomIconOptions = {
      val __obj = js.Dynamic.literal()
      Icon.foreach(__v => __obj.updateDynamic("Icon")(__v.asInstanceOf[js.Any]))
      UnicodeIcon.foreach(__v => __obj.updateDynamic("UnicodeIcon")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConditionalFormattingCustomIconOptions]
    }
  }

  /** Formatting configuration for gradient color.
    */
  @js.native
  trait ConditionalFormattingGradientColor extends js.Object {
    var Color: GradientColor
    var Expression: Expression
  }

  object ConditionalFormattingGradientColor {
    @inline
    def apply(
        Color: GradientColor,
        Expression: Expression
    ): ConditionalFormattingGradientColor = {
      val __obj = js.Dynamic.literal(
        "Color" -> Color.asInstanceOf[js.Any],
        "Expression" -> Expression.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ConditionalFormattingGradientColor]
    }
  }

  /** The formatting configuration for the icon.
    */
  @js.native
  trait ConditionalFormattingIcon extends js.Object {
    var CustomCondition: js.UndefOr[ConditionalFormattingCustomIconCondition]
    var IconSet: js.UndefOr[ConditionalFormattingIconSet]
  }

  object ConditionalFormattingIcon {
    @inline
    def apply(
        CustomCondition: js.UndefOr[ConditionalFormattingCustomIconCondition] = js.undefined,
        IconSet: js.UndefOr[ConditionalFormattingIconSet] = js.undefined
    ): ConditionalFormattingIcon = {
      val __obj = js.Dynamic.literal()
      CustomCondition.foreach(__v => __obj.updateDynamic("CustomCondition")(__v.asInstanceOf[js.Any]))
      IconSet.foreach(__v => __obj.updateDynamic("IconSet")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConditionalFormattingIcon]
    }
  }

  /** Determines the icon display configuration.
    */
  @js.native
  trait ConditionalFormattingIconDisplayConfiguration extends js.Object {
    var IconDisplayOption: js.UndefOr[ConditionalFormattingIconDisplayOption]
  }

  object ConditionalFormattingIconDisplayConfiguration {
    @inline
    def apply(
        IconDisplayOption: js.UndefOr[ConditionalFormattingIconDisplayOption] = js.undefined
    ): ConditionalFormattingIconDisplayConfiguration = {
      val __obj = js.Dynamic.literal()
      IconDisplayOption.foreach(__v => __obj.updateDynamic("IconDisplayOption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConditionalFormattingIconDisplayConfiguration]
    }
  }

  /** Formatting configuration for icon set.
    */
  @js.native
  trait ConditionalFormattingIconSet extends js.Object {
    var Expression: Expression
    var IconSetType: js.UndefOr[ConditionalFormattingIconSetType]
  }

  object ConditionalFormattingIconSet {
    @inline
    def apply(
        Expression: Expression,
        IconSetType: js.UndefOr[ConditionalFormattingIconSetType] = js.undefined
    ): ConditionalFormattingIconSet = {
      val __obj = js.Dynamic.literal(
        "Expression" -> Expression.asInstanceOf[js.Any]
      )

      IconSetType.foreach(__v => __obj.updateDynamic("IconSetType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConditionalFormattingIconSet]
    }
  }

  /** Formatting configuration for solid color.
    */
  @js.native
  trait ConditionalFormattingSolidColor extends js.Object {
    var Expression: Expression
    var Color: js.UndefOr[HexColor]
  }

  object ConditionalFormattingSolidColor {
    @inline
    def apply(
        Expression: Expression,
        Color: js.UndefOr[HexColor] = js.undefined
    ): ConditionalFormattingSolidColor = {
      val __obj = js.Dynamic.literal(
        "Expression" -> Expression.asInstanceOf[js.Any]
      )

      Color.foreach(__v => __obj.updateDynamic("Color")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConditionalFormattingSolidColor]
    }
  }

  /** The contribution analysis visual display for a line, pie, or bar chart.
    */
  @js.native
  trait ContributionAnalysisDefault extends js.Object {
    var ContributorDimensions: ContributorDimensionList
    var MeasureFieldId: FieldId
  }

  object ContributionAnalysisDefault {
    @inline
    def apply(
        ContributorDimensions: ContributorDimensionList,
        MeasureFieldId: FieldId
    ): ContributionAnalysisDefault = {
      val __obj = js.Dynamic.literal(
        "ContributorDimensions" -> ContributorDimensions.asInstanceOf[js.Any],
        "MeasureFieldId" -> MeasureFieldId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ContributionAnalysisDefault]
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
  trait CreateAccountSubscriptionRequest extends js.Object {
    var AccountName: String
    var AuthenticationMethod: AuthenticationMethodOption
    var AwsAccountId: AwsAccountId
    var Edition: Edition
    var NotificationEmail: String
    var ActiveDirectoryName: js.UndefOr[String]
    var AdminGroup: js.UndefOr[GroupsList]
    var AuthorGroup: js.UndefOr[GroupsList]
    var ContactNumber: js.UndefOr[String]
    var DirectoryId: js.UndefOr[String]
    var EmailAddress: js.UndefOr[String]
    var FirstName: js.UndefOr[String]
    var LastName: js.UndefOr[String]
    var ReaderGroup: js.UndefOr[GroupsList]
    var Realm: js.UndefOr[String]
  }

  object CreateAccountSubscriptionRequest {
    @inline
    def apply(
        AccountName: String,
        AuthenticationMethod: AuthenticationMethodOption,
        AwsAccountId: AwsAccountId,
        Edition: Edition,
        NotificationEmail: String,
        ActiveDirectoryName: js.UndefOr[String] = js.undefined,
        AdminGroup: js.UndefOr[GroupsList] = js.undefined,
        AuthorGroup: js.UndefOr[GroupsList] = js.undefined,
        ContactNumber: js.UndefOr[String] = js.undefined,
        DirectoryId: js.UndefOr[String] = js.undefined,
        EmailAddress: js.UndefOr[String] = js.undefined,
        FirstName: js.UndefOr[String] = js.undefined,
        LastName: js.UndefOr[String] = js.undefined,
        ReaderGroup: js.UndefOr[GroupsList] = js.undefined,
        Realm: js.UndefOr[String] = js.undefined
    ): CreateAccountSubscriptionRequest = {
      val __obj = js.Dynamic.literal(
        "AccountName" -> AccountName.asInstanceOf[js.Any],
        "AuthenticationMethod" -> AuthenticationMethod.asInstanceOf[js.Any],
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Edition" -> Edition.asInstanceOf[js.Any],
        "NotificationEmail" -> NotificationEmail.asInstanceOf[js.Any]
      )

      ActiveDirectoryName.foreach(__v => __obj.updateDynamic("ActiveDirectoryName")(__v.asInstanceOf[js.Any]))
      AdminGroup.foreach(__v => __obj.updateDynamic("AdminGroup")(__v.asInstanceOf[js.Any]))
      AuthorGroup.foreach(__v => __obj.updateDynamic("AuthorGroup")(__v.asInstanceOf[js.Any]))
      ContactNumber.foreach(__v => __obj.updateDynamic("ContactNumber")(__v.asInstanceOf[js.Any]))
      DirectoryId.foreach(__v => __obj.updateDynamic("DirectoryId")(__v.asInstanceOf[js.Any]))
      EmailAddress.foreach(__v => __obj.updateDynamic("EmailAddress")(__v.asInstanceOf[js.Any]))
      FirstName.foreach(__v => __obj.updateDynamic("FirstName")(__v.asInstanceOf[js.Any]))
      LastName.foreach(__v => __obj.updateDynamic("LastName")(__v.asInstanceOf[js.Any]))
      ReaderGroup.foreach(__v => __obj.updateDynamic("ReaderGroup")(__v.asInstanceOf[js.Any]))
      Realm.foreach(__v => __obj.updateDynamic("Realm")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAccountSubscriptionRequest]
    }
  }

  @js.native
  trait CreateAccountSubscriptionResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var SignupResponse: js.UndefOr[SignupResponse]
    var Status: js.UndefOr[StatusCode]
  }

  object CreateAccountSubscriptionResponse {
    @inline
    def apply(
        RequestId: js.UndefOr[String] = js.undefined,
        SignupResponse: js.UndefOr[SignupResponse] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): CreateAccountSubscriptionResponse = {
      val __obj = js.Dynamic.literal()
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      SignupResponse.foreach(__v => __obj.updateDynamic("SignupResponse")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAccountSubscriptionResponse]
    }
  }

  @js.native
  trait CreateAnalysisRequest extends js.Object {
    var AnalysisId: ShortRestrictiveResourceId
    var AwsAccountId: AwsAccountId
    var Name: AnalysisName
    var Definition: js.UndefOr[AnalysisDefinition]
    var Parameters: js.UndefOr[Parameters]
    var Permissions: js.UndefOr[ResourcePermissionList]
    var SourceEntity: js.UndefOr[AnalysisSourceEntity]
    var Tags: js.UndefOr[TagList]
    var ThemeArn: js.UndefOr[Arn]
  }

  object CreateAnalysisRequest {
    @inline
    def apply(
        AnalysisId: ShortRestrictiveResourceId,
        AwsAccountId: AwsAccountId,
        Name: AnalysisName,
        Definition: js.UndefOr[AnalysisDefinition] = js.undefined,
        Parameters: js.UndefOr[Parameters] = js.undefined,
        Permissions: js.UndefOr[ResourcePermissionList] = js.undefined,
        SourceEntity: js.UndefOr[AnalysisSourceEntity] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        ThemeArn: js.UndefOr[Arn] = js.undefined
    ): CreateAnalysisRequest = {
      val __obj = js.Dynamic.literal(
        "AnalysisId" -> AnalysisId.asInstanceOf[js.Any],
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Definition.foreach(__v => __obj.updateDynamic("Definition")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      SourceEntity.foreach(__v => __obj.updateDynamic("SourceEntity")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      ThemeArn.foreach(__v => __obj.updateDynamic("ThemeArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAnalysisRequest]
    }
  }

  @js.native
  trait CreateAnalysisResponse extends js.Object {
    var AnalysisId: js.UndefOr[ShortRestrictiveResourceId]
    var Arn: js.UndefOr[Arn]
    var CreationStatus: js.UndefOr[ResourceStatus]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object CreateAnalysisResponse {
    @inline
    def apply(
        AnalysisId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined,
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
    var DashboardId: ShortRestrictiveResourceId
    var Name: DashboardName
    var DashboardPublishOptions: js.UndefOr[DashboardPublishOptions]
    var Definition: js.UndefOr[DashboardVersionDefinition]
    var Parameters: js.UndefOr[Parameters]
    var Permissions: js.UndefOr[ResourcePermissionList]
    var SourceEntity: js.UndefOr[DashboardSourceEntity]
    var Tags: js.UndefOr[TagList]
    var ThemeArn: js.UndefOr[Arn]
    var VersionDescription: js.UndefOr[VersionDescription]
  }

  object CreateDashboardRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DashboardId: ShortRestrictiveResourceId,
        Name: DashboardName,
        DashboardPublishOptions: js.UndefOr[DashboardPublishOptions] = js.undefined,
        Definition: js.UndefOr[DashboardVersionDefinition] = js.undefined,
        Parameters: js.UndefOr[Parameters] = js.undefined,
        Permissions: js.UndefOr[ResourcePermissionList] = js.undefined,
        SourceEntity: js.UndefOr[DashboardSourceEntity] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        ThemeArn: js.UndefOr[Arn] = js.undefined,
        VersionDescription: js.UndefOr[VersionDescription] = js.undefined
    ): CreateDashboardRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "DashboardId" -> DashboardId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      DashboardPublishOptions.foreach(__v => __obj.updateDynamic("DashboardPublishOptions")(__v.asInstanceOf[js.Any]))
      Definition.foreach(__v => __obj.updateDynamic("Definition")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      SourceEntity.foreach(__v => __obj.updateDynamic("SourceEntity")(__v.asInstanceOf[js.Any]))
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
    var DashboardId: js.UndefOr[ShortRestrictiveResourceId]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var VersionArn: js.UndefOr[Arn]
  }

  object CreateDashboardResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreationStatus: js.UndefOr[ResourceStatus] = js.undefined,
        DashboardId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined,
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
    var TemplateId: ShortRestrictiveResourceId
    var TemplateVersionNumber: VersionNumber
  }

  object CreateTemplateAliasRequest {
    @inline
    def apply(
        AliasName: AliasName,
        AwsAccountId: AwsAccountId,
        TemplateId: ShortRestrictiveResourceId,
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
    var TemplateId: ShortRestrictiveResourceId
    var Definition: js.UndefOr[TemplateVersionDefinition]
    var Name: js.UndefOr[TemplateName]
    var Permissions: js.UndefOr[ResourcePermissionList]
    var SourceEntity: js.UndefOr[TemplateSourceEntity]
    var Tags: js.UndefOr[TagList]
    var VersionDescription: js.UndefOr[VersionDescription]
  }

  object CreateTemplateRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        TemplateId: ShortRestrictiveResourceId,
        Definition: js.UndefOr[TemplateVersionDefinition] = js.undefined,
        Name: js.UndefOr[TemplateName] = js.undefined,
        Permissions: js.UndefOr[ResourcePermissionList] = js.undefined,
        SourceEntity: js.UndefOr[TemplateSourceEntity] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        VersionDescription: js.UndefOr[VersionDescription] = js.undefined
    ): CreateTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "TemplateId" -> TemplateId.asInstanceOf[js.Any]
      )

      Definition.foreach(__v => __obj.updateDynamic("Definition")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Permissions.foreach(__v => __obj.updateDynamic("Permissions")(__v.asInstanceOf[js.Any]))
      SourceEntity.foreach(__v => __obj.updateDynamic("SourceEntity")(__v.asInstanceOf[js.Any]))
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
    var TemplateId: js.UndefOr[ShortRestrictiveResourceId]
    var VersionArn: js.UndefOr[Arn]
  }

  object CreateTemplateResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreationStatus: js.UndefOr[ResourceStatus] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        TemplateId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined,
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
    var ThemeId: ShortRestrictiveResourceId
    var ThemeVersionNumber: VersionNumber
  }

  object CreateThemeAliasRequest {
    @inline
    def apply(
        AliasName: AliasName,
        AwsAccountId: AwsAccountId,
        ThemeId: ShortRestrictiveResourceId,
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
    var BaseThemeId: ShortRestrictiveResourceId
    var Configuration: ThemeConfiguration
    var Name: ThemeName
    var ThemeId: ShortRestrictiveResourceId
    var Permissions: js.UndefOr[ResourcePermissionList]
    var Tags: js.UndefOr[TagList]
    var VersionDescription: js.UndefOr[VersionDescription]
  }

  object CreateThemeRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        BaseThemeId: ShortRestrictiveResourceId,
        Configuration: ThemeConfiguration,
        Name: ThemeName,
        ThemeId: ShortRestrictiveResourceId,
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
    var ThemeId: js.UndefOr[ShortRestrictiveResourceId]
    var VersionArn: js.UndefOr[Arn]
  }

  object CreateThemeResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreationStatus: js.UndefOr[ResourceStatus] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        ThemeId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined,
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

  /** The options that determine the currency display format configuration.
    */
  @js.native
  trait CurrencyDisplayFormatConfiguration extends js.Object {
    var DecimalPlacesConfiguration: js.UndefOr[DecimalPlacesConfiguration]
    var NegativeValueConfiguration: js.UndefOr[NegativeValueConfiguration]
    var NullValueFormatConfiguration: js.UndefOr[NullValueFormatConfiguration]
    var NumberScale: js.UndefOr[NumberScale]
    var Prefix: js.UndefOr[Prefix]
    var SeparatorConfiguration: js.UndefOr[NumericSeparatorConfiguration]
    var Suffix: js.UndefOr[Suffix]
    var Symbol: js.UndefOr[CurrencyCode]
  }

  object CurrencyDisplayFormatConfiguration {
    @inline
    def apply(
        DecimalPlacesConfiguration: js.UndefOr[DecimalPlacesConfiguration] = js.undefined,
        NegativeValueConfiguration: js.UndefOr[NegativeValueConfiguration] = js.undefined,
        NullValueFormatConfiguration: js.UndefOr[NullValueFormatConfiguration] = js.undefined,
        NumberScale: js.UndefOr[NumberScale] = js.undefined,
        Prefix: js.UndefOr[Prefix] = js.undefined,
        SeparatorConfiguration: js.UndefOr[NumericSeparatorConfiguration] = js.undefined,
        Suffix: js.UndefOr[Suffix] = js.undefined,
        Symbol: js.UndefOr[CurrencyCode] = js.undefined
    ): CurrencyDisplayFormatConfiguration = {
      val __obj = js.Dynamic.literal()
      DecimalPlacesConfiguration.foreach(__v => __obj.updateDynamic("DecimalPlacesConfiguration")(__v.asInstanceOf[js.Any]))
      NegativeValueConfiguration.foreach(__v => __obj.updateDynamic("NegativeValueConfiguration")(__v.asInstanceOf[js.Any]))
      NullValueFormatConfiguration.foreach(__v => __obj.updateDynamic("NullValueFormatConfiguration")(__v.asInstanceOf[js.Any]))
      NumberScale.foreach(__v => __obj.updateDynamic("NumberScale")(__v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.updateDynamic("Prefix")(__v.asInstanceOf[js.Any]))
      SeparatorConfiguration.foreach(__v => __obj.updateDynamic("SeparatorConfiguration")(__v.asInstanceOf[js.Any]))
      Suffix.foreach(__v => __obj.updateDynamic("Suffix")(__v.asInstanceOf[js.Any]))
      Symbol.foreach(__v => __obj.updateDynamic("Symbol")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CurrencyDisplayFormatConfiguration]
    }
  }

  /** The filter operation that filters data included in a visual or in an entire sheet.
    */
  @js.native
  trait CustomActionFilterOperation extends js.Object {
    var SelectedFieldsConfiguration: FilterOperationSelectedFieldsConfiguration
    var TargetVisualsConfiguration: FilterOperationTargetVisualsConfiguration
  }

  object CustomActionFilterOperation {
    @inline
    def apply(
        SelectedFieldsConfiguration: FilterOperationSelectedFieldsConfiguration,
        TargetVisualsConfiguration: FilterOperationTargetVisualsConfiguration
    ): CustomActionFilterOperation = {
      val __obj = js.Dynamic.literal(
        "SelectedFieldsConfiguration" -> SelectedFieldsConfiguration.asInstanceOf[js.Any],
        "TargetVisualsConfiguration" -> TargetVisualsConfiguration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CustomActionFilterOperation]
    }
  }

  /** The navigation operation that navigates between different sheets in the same analysis. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait CustomActionNavigationOperation extends js.Object {
    var LocalNavigationConfiguration: js.UndefOr[LocalNavigationConfiguration]
  }

  object CustomActionNavigationOperation {
    @inline
    def apply(
        LocalNavigationConfiguration: js.UndefOr[LocalNavigationConfiguration] = js.undefined
    ): CustomActionNavigationOperation = {
      val __obj = js.Dynamic.literal()
      LocalNavigationConfiguration.foreach(__v => __obj.updateDynamic("LocalNavigationConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomActionNavigationOperation]
    }
  }

  /** The set parameter operation that sets parameters in custom action.
    */
  @js.native
  trait CustomActionSetParametersOperation extends js.Object {
    var ParameterValueConfigurations: SetParameterValueConfigurationList
  }

  object CustomActionSetParametersOperation {
    @inline
    def apply(
        ParameterValueConfigurations: SetParameterValueConfigurationList
    ): CustomActionSetParametersOperation = {
      val __obj = js.Dynamic.literal(
        "ParameterValueConfigurations" -> ParameterValueConfigurations.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CustomActionSetParametersOperation]
    }
  }

  /** The URL operation that opens a link to another webpage.
    */
  @js.native
  trait CustomActionURLOperation extends js.Object {
    var URLTarget: URLTargetConfiguration
    var URLTemplate: URLOperationTemplate
  }

  object CustomActionURLOperation {
    @inline
    def apply(
        URLTarget: URLTargetConfiguration,
        URLTemplate: URLOperationTemplate
    ): CustomActionURLOperation = {
      val __obj = js.Dynamic.literal(
        "URLTarget" -> URLTarget.asInstanceOf[js.Any],
        "URLTemplate" -> URLTemplate.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CustomActionURLOperation]
    }
  }

  /** The configuration of a <code>CustomContentVisual</code>.
    */
  @js.native
  trait CustomContentConfiguration extends js.Object {
    var ContentType: js.UndefOr[CustomContentType]
    var ContentUrl: js.UndefOr[URLOperationTemplate]
    var ImageScaling: js.UndefOr[CustomContentImageScalingConfiguration]
  }

  object CustomContentConfiguration {
    @inline
    def apply(
        ContentType: js.UndefOr[CustomContentType] = js.undefined,
        ContentUrl: js.UndefOr[URLOperationTemplate] = js.undefined,
        ImageScaling: js.UndefOr[CustomContentImageScalingConfiguration] = js.undefined
    ): CustomContentConfiguration = {
      val __obj = js.Dynamic.literal()
      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      ContentUrl.foreach(__v => __obj.updateDynamic("ContentUrl")(__v.asInstanceOf[js.Any]))
      ImageScaling.foreach(__v => __obj.updateDynamic("ImageScaling")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomContentConfiguration]
    }
  }

  /** A visual that contains custom content. For more information, see [[https://docs.aws.amazon.com/quicksight/latest/user/custom-visual-content.html|Using custom visual content]] in the <i>Amazon QuickSight User Guide</i>.
    */
  @js.native
  trait CustomContentVisual extends js.Object {
    var DataSetIdentifier: DataSetIdentifier
    var VisualId: ShortRestrictiveResourceId
    var Actions: js.UndefOr[VisualCustomActionList]
    var ChartConfiguration: js.UndefOr[CustomContentConfiguration]
    var Subtitle: js.UndefOr[VisualSubtitleLabelOptions]
    var Title: js.UndefOr[VisualTitleLabelOptions]
  }

  object CustomContentVisual {
    @inline
    def apply(
        DataSetIdentifier: DataSetIdentifier,
        VisualId: ShortRestrictiveResourceId,
        Actions: js.UndefOr[VisualCustomActionList] = js.undefined,
        ChartConfiguration: js.UndefOr[CustomContentConfiguration] = js.undefined,
        Subtitle: js.UndefOr[VisualSubtitleLabelOptions] = js.undefined,
        Title: js.UndefOr[VisualTitleLabelOptions] = js.undefined
    ): CustomContentVisual = {
      val __obj = js.Dynamic.literal(
        "DataSetIdentifier" -> DataSetIdentifier.asInstanceOf[js.Any],
        "VisualId" -> VisualId.asInstanceOf[js.Any]
      )

      Actions.foreach(__v => __obj.updateDynamic("Actions")(__v.asInstanceOf[js.Any]))
      ChartConfiguration.foreach(__v => __obj.updateDynamic("ChartConfiguration")(__v.asInstanceOf[js.Any]))
      Subtitle.foreach(__v => __obj.updateDynamic("Subtitle")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomContentVisual]
    }
  }

  /** A custom filter that filters based on a single value. This filter can be partially matched.
    */
  @js.native
  trait CustomFilterConfiguration extends js.Object {
    var MatchOperator: CategoryFilterMatchOperator
    var NullOption: FilterNullOption
    var CategoryValue: js.UndefOr[CategoryValue]
    var ParameterName: js.UndefOr[ParameterName]
    var SelectAllOptions: js.UndefOr[CategoryFilterSelectAllOptions]
  }

  object CustomFilterConfiguration {
    @inline
    def apply(
        MatchOperator: CategoryFilterMatchOperator,
        NullOption: FilterNullOption,
        CategoryValue: js.UndefOr[CategoryValue] = js.undefined,
        ParameterName: js.UndefOr[ParameterName] = js.undefined,
        SelectAllOptions: js.UndefOr[CategoryFilterSelectAllOptions] = js.undefined
    ): CustomFilterConfiguration = {
      val __obj = js.Dynamic.literal(
        "MatchOperator" -> MatchOperator.asInstanceOf[js.Any],
        "NullOption" -> NullOption.asInstanceOf[js.Any]
      )

      CategoryValue.foreach(__v => __obj.updateDynamic("CategoryValue")(__v.asInstanceOf[js.Any]))
      ParameterName.foreach(__v => __obj.updateDynamic("ParameterName")(__v.asInstanceOf[js.Any]))
      SelectAllOptions.foreach(__v => __obj.updateDynamic("SelectAllOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomFilterConfiguration]
    }
  }

  /** A list of custom filter values.
    */
  @js.native
  trait CustomFilterListConfiguration extends js.Object {
    var MatchOperator: CategoryFilterMatchOperator
    var NullOption: FilterNullOption
    var CategoryValues: js.UndefOr[CategoryValueList]
    var SelectAllOptions: js.UndefOr[CategoryFilterSelectAllOptions]
  }

  object CustomFilterListConfiguration {
    @inline
    def apply(
        MatchOperator: CategoryFilterMatchOperator,
        NullOption: FilterNullOption,
        CategoryValues: js.UndefOr[CategoryValueList] = js.undefined,
        SelectAllOptions: js.UndefOr[CategoryFilterSelectAllOptions] = js.undefined
    ): CustomFilterListConfiguration = {
      val __obj = js.Dynamic.literal(
        "MatchOperator" -> MatchOperator.asInstanceOf[js.Any],
        "NullOption" -> NullOption.asInstanceOf[js.Any]
      )

      CategoryValues.foreach(__v => __obj.updateDynamic("CategoryValues")(__v.asInstanceOf[js.Any]))
      SelectAllOptions.foreach(__v => __obj.updateDynamic("SelectAllOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomFilterListConfiguration]
    }
  }

  /** The custom narrative options.
    */
  @js.native
  trait CustomNarrativeOptions extends js.Object {
    var Narrative: NarrativeString
  }

  object CustomNarrativeOptions {
    @inline
    def apply(
        Narrative: NarrativeString
    ): CustomNarrativeOptions = {
      val __obj = js.Dynamic.literal(
        "Narrative" -> Narrative.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CustomNarrativeOptions]
    }
  }

  /** The customized parameter values. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait CustomParameterValues extends js.Object {
    var DateTimeValues: js.UndefOr[DateTimeDefaultValueList]
    var DecimalValues: js.UndefOr[DecimalDefaultValueList]
    var IntegerValues: js.UndefOr[IntegerDefaultValueList]
    var StringValues: js.UndefOr[StringDefaultValueList]
  }

  object CustomParameterValues {
    @inline
    def apply(
        DateTimeValues: js.UndefOr[DateTimeDefaultValueList] = js.undefined,
        DecimalValues: js.UndefOr[DecimalDefaultValueList] = js.undefined,
        IntegerValues: js.UndefOr[IntegerDefaultValueList] = js.undefined,
        StringValues: js.UndefOr[StringDefaultValueList] = js.undefined
    ): CustomParameterValues = {
      val __obj = js.Dynamic.literal()
      DateTimeValues.foreach(__v => __obj.updateDynamic("DateTimeValues")(__v.asInstanceOf[js.Any]))
      DecimalValues.foreach(__v => __obj.updateDynamic("DecimalValues")(__v.asInstanceOf[js.Any]))
      IntegerValues.foreach(__v => __obj.updateDynamic("IntegerValues")(__v.asInstanceOf[js.Any]))
      StringValues.foreach(__v => __obj.updateDynamic("StringValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomParameterValues]
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

  /** The configuration of custom values for the destination parameter in <code>DestinationParameterValueConfiguration</code>.
    */
  @js.native
  trait CustomValuesConfiguration extends js.Object {
    var CustomValues: CustomParameterValues
    var IncludeNullValue: js.UndefOr[BooleanObject]
  }

  object CustomValuesConfiguration {
    @inline
    def apply(
        CustomValues: CustomParameterValues,
        IncludeNullValue: js.UndefOr[BooleanObject] = js.undefined
    ): CustomValuesConfiguration = {
      val __obj = js.Dynamic.literal(
        "CustomValues" -> CustomValues.asInstanceOf[js.Any]
      )

      IncludeNullValue.foreach(__v => __obj.updateDynamic("IncludeNullValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomValuesConfiguration]
    }
  }

  /** Dashboard.
    */
  @js.native
  trait Dashboard extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreatedTime: js.UndefOr[Timestamp]
    var DashboardId: js.UndefOr[ShortRestrictiveResourceId]
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
        DashboardId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined,
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
    var ViolatedEntities: js.UndefOr[EntityList]
  }

  object DashboardError {
    @inline
    def apply(
        Message: js.UndefOr[NonEmptyString] = js.undefined,
        Type: js.UndefOr[DashboardErrorType] = js.undefined,
        ViolatedEntities: js.UndefOr[EntityList] = js.undefined
    ): DashboardError = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      ViolatedEntities.foreach(__v => __obj.updateDynamic("ViolatedEntities")(__v.asInstanceOf[js.Any]))
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
    var VisualPublishOptions: js.UndefOr[DashboardVisualPublishOptions]
  }

  object DashboardPublishOptions {
    @inline
    def apply(
        AdHocFilteringOption: js.UndefOr[AdHocFilteringOption] = js.undefined,
        ExportToCSVOption: js.UndefOr[ExportToCSVOption] = js.undefined,
        SheetControlsOption: js.UndefOr[SheetControlsOption] = js.undefined,
        VisualPublishOptions: js.UndefOr[DashboardVisualPublishOptions] = js.undefined
    ): DashboardPublishOptions = {
      val __obj = js.Dynamic.literal()
      AdHocFilteringOption.foreach(__v => __obj.updateDynamic("AdHocFilteringOption")(__v.asInstanceOf[js.Any]))
      ExportToCSVOption.foreach(__v => __obj.updateDynamic("ExportToCSVOption")(__v.asInstanceOf[js.Any]))
      SheetControlsOption.foreach(__v => __obj.updateDynamic("SheetControlsOption")(__v.asInstanceOf[js.Any]))
      VisualPublishOptions.foreach(__v => __obj.updateDynamic("VisualPublishOptions")(__v.asInstanceOf[js.Any]))
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
    var DashboardId: js.UndefOr[ShortRestrictiveResourceId]
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
        DashboardId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined,
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

  /** The contents of a dashboard.
    */
  @js.native
  trait DashboardVersionDefinition extends js.Object {
    var DataSetIdentifierDeclarations: DataSetIdentifierDeclarationList
    var AnalysisDefaults: js.UndefOr[AnalysisDefaults]
    var CalculatedFields: js.UndefOr[CalculatedFields]
    var ColumnConfigurations: js.UndefOr[ColumnConfigurationList]
    var FilterGroups: js.UndefOr[FilterGroupList]
    var ParameterDeclarations: js.UndefOr[ParameterDeclarationList]
    var Sheets: js.UndefOr[SheetDefinitionList]
  }

  object DashboardVersionDefinition {
    @inline
    def apply(
        DataSetIdentifierDeclarations: DataSetIdentifierDeclarationList,
        AnalysisDefaults: js.UndefOr[AnalysisDefaults] = js.undefined,
        CalculatedFields: js.UndefOr[CalculatedFields] = js.undefined,
        ColumnConfigurations: js.UndefOr[ColumnConfigurationList] = js.undefined,
        FilterGroups: js.UndefOr[FilterGroupList] = js.undefined,
        ParameterDeclarations: js.UndefOr[ParameterDeclarationList] = js.undefined,
        Sheets: js.UndefOr[SheetDefinitionList] = js.undefined
    ): DashboardVersionDefinition = {
      val __obj = js.Dynamic.literal(
        "DataSetIdentifierDeclarations" -> DataSetIdentifierDeclarations.asInstanceOf[js.Any]
      )

      AnalysisDefaults.foreach(__v => __obj.updateDynamic("AnalysisDefaults")(__v.asInstanceOf[js.Any]))
      CalculatedFields.foreach(__v => __obj.updateDynamic("CalculatedFields")(__v.asInstanceOf[js.Any]))
      ColumnConfigurations.foreach(__v => __obj.updateDynamic("ColumnConfigurations")(__v.asInstanceOf[js.Any]))
      FilterGroups.foreach(__v => __obj.updateDynamic("FilterGroups")(__v.asInstanceOf[js.Any]))
      ParameterDeclarations.foreach(__v => __obj.updateDynamic("ParameterDeclarations")(__v.asInstanceOf[js.Any]))
      Sheets.foreach(__v => __obj.updateDynamic("Sheets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DashboardVersionDefinition]
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

  /** A structure that contains the following elements: * The <code>DashboardId</code> of the dashboard that has the visual that you want to embed. * The <code>SheetId</code> of the sheet that has the visual that you want to embed. * The <code>VisualId</code> of the visual that you want to embed. The <code>DashboardId</code>, <code>SheetId</code>, and <code>VisualId</code> can be found in the <code>IDs for developers</code> section of the <code>Embed visual</code> pane of the visual's on-visual menu of the Amazon QuickSight console. You can also get the <code>DashboardId</code> with a <code>ListDashboards</code> API operation.
    */
  @js.native
  trait DashboardVisualId extends js.Object {
    var DashboardId: ShortRestrictiveResourceId
    var SheetId: ShortRestrictiveResourceId
    var VisualId: ShortRestrictiveResourceId
  }

  object DashboardVisualId {
    @inline
    def apply(
        DashboardId: ShortRestrictiveResourceId,
        SheetId: ShortRestrictiveResourceId,
        VisualId: ShortRestrictiveResourceId
    ): DashboardVisualId = {
      val __obj = js.Dynamic.literal(
        "DashboardId" -> DashboardId.asInstanceOf[js.Any],
        "SheetId" -> SheetId.asInstanceOf[js.Any],
        "VisualId" -> VisualId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DashboardVisualId]
    }
  }

  /** <p/>
    */
  @js.native
  trait DashboardVisualPublishOptions extends js.Object {
    var ExportHiddenFieldsOption: js.UndefOr[ExportHiddenFieldsOption]
  }

  object DashboardVisualPublishOptions {
    @inline
    def apply(
        ExportHiddenFieldsOption: js.UndefOr[ExportHiddenFieldsOption] = js.undefined
    ): DashboardVisualPublishOptions = {
      val __obj = js.Dynamic.literal()
      ExportHiddenFieldsOption.foreach(__v => __obj.updateDynamic("ExportHiddenFieldsOption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DashboardVisualPublishOptions]
    }
  }

  /** Determines the color that is applied to a particular data value.
    */
  @js.native
  trait DataColor extends js.Object {
    var Color: js.UndefOr[HexColor]
    var DataValue: js.UndefOr[Double]
  }

  object DataColor {
    @inline
    def apply(
        Color: js.UndefOr[HexColor] = js.undefined,
        DataValue: js.UndefOr[Double] = js.undefined
    ): DataColor = {
      val __obj = js.Dynamic.literal()
      Color.foreach(__v => __obj.updateDynamic("Color")(__v.asInstanceOf[js.Any]))
      DataValue.foreach(__v => __obj.updateDynamic("DataValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataColor]
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

  /** The data field series item configuration of a line chart.
    */
  @js.native
  trait DataFieldSeriesItem extends js.Object {
    var AxisBinding: AxisBinding
    var FieldId: FieldId
    var FieldValue: js.UndefOr[SensitiveString]
    var Settings: js.UndefOr[LineChartSeriesSettings]
  }

  object DataFieldSeriesItem {
    @inline
    def apply(
        AxisBinding: AxisBinding,
        FieldId: FieldId,
        FieldValue: js.UndefOr[SensitiveString] = js.undefined,
        Settings: js.UndefOr[LineChartSeriesSettings] = js.undefined
    ): DataFieldSeriesItem = {
      val __obj = js.Dynamic.literal(
        "AxisBinding" -> AxisBinding.asInstanceOf[js.Any],
        "FieldId" -> FieldId.asInstanceOf[js.Any]
      )

      FieldValue.foreach(__v => __obj.updateDynamic("FieldValue")(__v.asInstanceOf[js.Any]))
      Settings.foreach(__v => __obj.updateDynamic("Settings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataFieldSeriesItem]
    }
  }

  /** The options that determine the presentation of the data labels.
    */
  @js.native
  trait DataLabelOptions extends js.Object {
    var CategoryLabelVisibility: js.UndefOr[Visibility]
    var DataLabelTypes: js.UndefOr[DataLabelTypes]
    var LabelColor: js.UndefOr[HexColor]
    var LabelContent: js.UndefOr[DataLabelContent]
    var LabelFontConfiguration: js.UndefOr[FontConfiguration]
    var MeasureLabelVisibility: js.UndefOr[Visibility]
    var Overlap: js.UndefOr[DataLabelOverlap]
    var Position: js.UndefOr[DataLabelPosition]
    var Visibility: js.UndefOr[Visibility]
  }

  object DataLabelOptions {
    @inline
    def apply(
        CategoryLabelVisibility: js.UndefOr[Visibility] = js.undefined,
        DataLabelTypes: js.UndefOr[DataLabelTypes] = js.undefined,
        LabelColor: js.UndefOr[HexColor] = js.undefined,
        LabelContent: js.UndefOr[DataLabelContent] = js.undefined,
        LabelFontConfiguration: js.UndefOr[FontConfiguration] = js.undefined,
        MeasureLabelVisibility: js.UndefOr[Visibility] = js.undefined,
        Overlap: js.UndefOr[DataLabelOverlap] = js.undefined,
        Position: js.UndefOr[DataLabelPosition] = js.undefined,
        Visibility: js.UndefOr[Visibility] = js.undefined
    ): DataLabelOptions = {
      val __obj = js.Dynamic.literal()
      CategoryLabelVisibility.foreach(__v => __obj.updateDynamic("CategoryLabelVisibility")(__v.asInstanceOf[js.Any]))
      DataLabelTypes.foreach(__v => __obj.updateDynamic("DataLabelTypes")(__v.asInstanceOf[js.Any]))
      LabelColor.foreach(__v => __obj.updateDynamic("LabelColor")(__v.asInstanceOf[js.Any]))
      LabelContent.foreach(__v => __obj.updateDynamic("LabelContent")(__v.asInstanceOf[js.Any]))
      LabelFontConfiguration.foreach(__v => __obj.updateDynamic("LabelFontConfiguration")(__v.asInstanceOf[js.Any]))
      MeasureLabelVisibility.foreach(__v => __obj.updateDynamic("MeasureLabelVisibility")(__v.asInstanceOf[js.Any]))
      Overlap.foreach(__v => __obj.updateDynamic("Overlap")(__v.asInstanceOf[js.Any]))
      Position.foreach(__v => __obj.updateDynamic("Position")(__v.asInstanceOf[js.Any]))
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataLabelOptions]
    }
  }

  /** The option that determines the data label type. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait DataLabelType extends js.Object {
    var DataPathLabelType: js.UndefOr[DataPathLabelType]
    var FieldLabelType: js.UndefOr[FieldLabelType]
    var MaximumLabelType: js.UndefOr[MaximumLabelType]
    var MinimumLabelType: js.UndefOr[MinimumLabelType]
    var RangeEndsLabelType: js.UndefOr[RangeEndsLabelType]
  }

  object DataLabelType {
    @inline
    def apply(
        DataPathLabelType: js.UndefOr[DataPathLabelType] = js.undefined,
        FieldLabelType: js.UndefOr[FieldLabelType] = js.undefined,
        MaximumLabelType: js.UndefOr[MaximumLabelType] = js.undefined,
        MinimumLabelType: js.UndefOr[MinimumLabelType] = js.undefined,
        RangeEndsLabelType: js.UndefOr[RangeEndsLabelType] = js.undefined
    ): DataLabelType = {
      val __obj = js.Dynamic.literal()
      DataPathLabelType.foreach(__v => __obj.updateDynamic("DataPathLabelType")(__v.asInstanceOf[js.Any]))
      FieldLabelType.foreach(__v => __obj.updateDynamic("FieldLabelType")(__v.asInstanceOf[js.Any]))
      MaximumLabelType.foreach(__v => __obj.updateDynamic("MaximumLabelType")(__v.asInstanceOf[js.Any]))
      MinimumLabelType.foreach(__v => __obj.updateDynamic("MinimumLabelType")(__v.asInstanceOf[js.Any]))
      RangeEndsLabelType.foreach(__v => __obj.updateDynamic("RangeEndsLabelType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataLabelType]
    }
  }

  /** The color map that determines the color options for a particular element.
    */
  @js.native
  trait DataPathColor extends js.Object {
    var Color: HexColor
    var Element: DataPathValue
    var TimeGranularity: js.UndefOr[TimeGranularity]
  }

  object DataPathColor {
    @inline
    def apply(
        Color: HexColor,
        Element: DataPathValue,
        TimeGranularity: js.UndefOr[TimeGranularity] = js.undefined
    ): DataPathColor = {
      val __obj = js.Dynamic.literal(
        "Color" -> Color.asInstanceOf[js.Any],
        "Element" -> Element.asInstanceOf[js.Any]
      )

      TimeGranularity.foreach(__v => __obj.updateDynamic("TimeGranularity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataPathColor]
    }
  }

  /** The option that specifies individual data values for labels.
    */
  @js.native
  trait DataPathLabelType extends js.Object {
    var FieldId: js.UndefOr[FieldId]
    var FieldValue: js.UndefOr[FieldValue]
    var Visibility: js.UndefOr[Visibility]
  }

  object DataPathLabelType {
    @inline
    def apply(
        FieldId: js.UndefOr[FieldId] = js.undefined,
        FieldValue: js.UndefOr[FieldValue] = js.undefined,
        Visibility: js.UndefOr[Visibility] = js.undefined
    ): DataPathLabelType = {
      val __obj = js.Dynamic.literal()
      FieldId.foreach(__v => __obj.updateDynamic("FieldId")(__v.asInstanceOf[js.Any]))
      FieldValue.foreach(__v => __obj.updateDynamic("FieldValue")(__v.asInstanceOf[js.Any]))
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataPathLabelType]
    }
  }

  /** Allows data paths to be sorted by a specific data value.
    */
  @js.native
  trait DataPathSort extends js.Object {
    var Direction: SortDirection
    var SortPaths: DataPathValueList
  }

  object DataPathSort {
    @inline
    def apply(
        Direction: SortDirection,
        SortPaths: DataPathValueList
    ): DataPathSort = {
      val __obj = js.Dynamic.literal(
        "Direction" -> Direction.asInstanceOf[js.Any],
        "SortPaths" -> SortPaths.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DataPathSort]
    }
  }

  /** The data path that needs to be sorted.
    */
  @js.native
  trait DataPathValue extends js.Object {
    var FieldId: FieldId
    var FieldValue: FieldValue
  }

  object DataPathValue {
    @inline
    def apply(
        FieldId: FieldId,
        FieldValue: FieldValue
    ): DataPathValue = {
      val __obj = js.Dynamic.literal(
        "FieldId" -> FieldId.asInstanceOf[js.Any],
        "FieldValue" -> FieldValue.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DataPathValue]
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

  /** A data set.
    */
  @js.native
  trait DataSetIdentifierDeclaration extends js.Object {
    var DataSetArn: Arn
    var Identifier: DataSetIdentifier
  }

  object DataSetIdentifierDeclaration {
    @inline
    def apply(
        DataSetArn: Arn,
        Identifier: DataSetIdentifier
    ): DataSetIdentifierDeclaration = {
      val __obj = js.Dynamic.literal(
        "DataSetArn" -> DataSetArn.asInstanceOf[js.Any],
        "Identifier" -> Identifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DataSetIdentifierDeclaration]
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

  /** A filter that you apply when searching for datasets.
    */
  @js.native
  trait DataSetSearchFilter extends js.Object {
    var Name: DataSetFilterAttribute
    var Operator: FilterOperator
    var Value: String
  }

  object DataSetSearchFilter {
    @inline
    def apply(
        Name: DataSetFilterAttribute,
        Operator: FilterOperator,
        Value: String
    ): DataSetSearchFilter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Operator" -> Operator.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DataSetSearchFilter]
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
    var SecretArn: js.UndefOr[SecretArn]
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
        SecretArn: js.UndefOr[SecretArn] = js.undefined,
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
      SecretArn.foreach(__v => __obj.updateDynamic("SecretArn")(__v.asInstanceOf[js.Any]))
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
    var SecretArn: js.UndefOr[SecretArn]
  }

  object DataSourceCredentials {
    @inline
    def apply(
        CopySourceArn: js.UndefOr[CopySourceArn] = js.undefined,
        CredentialPair: js.UndefOr[CredentialPair] = js.undefined,
        SecretArn: js.UndefOr[SecretArn] = js.undefined
    ): DataSourceCredentials = {
      val __obj = js.Dynamic.literal()
      CopySourceArn.foreach(__v => __obj.updateDynamic("CopySourceArn")(__v.asInstanceOf[js.Any]))
      CredentialPair.foreach(__v => __obj.updateDynamic("CredentialPair")(__v.asInstanceOf[js.Any]))
      SecretArn.foreach(__v => __obj.updateDynamic("SecretArn")(__v.asInstanceOf[js.Any]))
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
    var DatabricksParameters: js.UndefOr[DatabricksParameters]
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
        DatabricksParameters: js.UndefOr[DatabricksParameters] = js.undefined,
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
      DatabricksParameters.foreach(__v => __obj.updateDynamic("DatabricksParameters")(__v.asInstanceOf[js.Any]))
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

  /** A filter that you apply when searching for data sources.
    */
  @js.native
  trait DataSourceSearchFilter extends js.Object {
    var Name: DataSourceFilterAttribute
    var Operator: FilterOperator
    var Value: String
  }

  object DataSourceSearchFilter {
    @inline
    def apply(
        Name: DataSourceFilterAttribute,
        Operator: FilterOperator,
        Value: String
    ): DataSourceSearchFilter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Operator" -> Operator.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DataSourceSearchFilter]
    }
  }

  /** A <code>DataSourceSummary</code> object that returns a summary of a data source.
    */
  @js.native
  trait DataSourceSummary extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreatedTime: js.UndefOr[Timestamp]
    var DataSourceId: js.UndefOr[ResourceId]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[ResourceName]
    var Type: js.UndefOr[DataSourceType]
  }

  object DataSourceSummary {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        DataSourceId: js.UndefOr[ResourceId] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[ResourceName] = js.undefined,
        Type: js.UndefOr[DataSourceType] = js.undefined
    ): DataSourceSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      DataSourceId.foreach(__v => __obj.updateDynamic("DataSourceId")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataSourceSummary]
    }
  }

  /** The required parameters that are needed to connect to a Databricks data source.
    */
  @js.native
  trait DatabricksParameters extends js.Object {
    var Host: Host
    var Port: Port
    var SqlEndpointPath: SqlEndpointPath
  }

  object DatabricksParameters {
    @inline
    def apply(
        Host: Host,
        Port: Port,
        SqlEndpointPath: SqlEndpointPath
    ): DatabricksParameters = {
      val __obj = js.Dynamic.literal(
        "Host" -> Host.asInstanceOf[js.Any],
        "Port" -> Port.asInstanceOf[js.Any],
        "SqlEndpointPath" -> SqlEndpointPath.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DatabricksParameters]
    }
  }

  /** The options that determine how a date axis is displayed.
    */
  @js.native
  trait DateAxisOptions extends js.Object {
    var MissingDateVisibility: js.UndefOr[Visibility]
  }

  object DateAxisOptions {
    @inline
    def apply(
        MissingDateVisibility: js.UndefOr[Visibility] = js.undefined
    ): DateAxisOptions = {
      val __obj = js.Dynamic.literal()
      MissingDateVisibility.foreach(__v => __obj.updateDynamic("MissingDateVisibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DateAxisOptions]
    }
  }

  /** The dimension type field with date type columns.
    */
  @js.native
  trait DateDimensionField extends js.Object {
    var Column: ColumnIdentifier
    var FieldId: FieldId
    var DateGranularity: js.UndefOr[TimeGranularity]
    var FormatConfiguration: js.UndefOr[DateTimeFormatConfiguration]
    var HierarchyId: js.UndefOr[HierarchyId]
  }

  object DateDimensionField {
    @inline
    def apply(
        Column: ColumnIdentifier,
        FieldId: FieldId,
        DateGranularity: js.UndefOr[TimeGranularity] = js.undefined,
        FormatConfiguration: js.UndefOr[DateTimeFormatConfiguration] = js.undefined,
        HierarchyId: js.UndefOr[HierarchyId] = js.undefined
    ): DateDimensionField = {
      val __obj = js.Dynamic.literal(
        "Column" -> Column.asInstanceOf[js.Any],
        "FieldId" -> FieldId.asInstanceOf[js.Any]
      )

      DateGranularity.foreach(__v => __obj.updateDynamic("DateGranularity")(__v.asInstanceOf[js.Any]))
      FormatConfiguration.foreach(__v => __obj.updateDynamic("FormatConfiguration")(__v.asInstanceOf[js.Any]))
      HierarchyId.foreach(__v => __obj.updateDynamic("HierarchyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DateDimensionField]
    }
  }

  /** The measure type field with date type columns.
    */
  @js.native
  trait DateMeasureField extends js.Object {
    var Column: ColumnIdentifier
    var FieldId: FieldId
    var AggregationFunction: js.UndefOr[DateAggregationFunction]
    var FormatConfiguration: js.UndefOr[DateTimeFormatConfiguration]
  }

  object DateMeasureField {
    @inline
    def apply(
        Column: ColumnIdentifier,
        FieldId: FieldId,
        AggregationFunction: js.UndefOr[DateAggregationFunction] = js.undefined,
        FormatConfiguration: js.UndefOr[DateTimeFormatConfiguration] = js.undefined
    ): DateMeasureField = {
      val __obj = js.Dynamic.literal(
        "Column" -> Column.asInstanceOf[js.Any],
        "FieldId" -> FieldId.asInstanceOf[js.Any]
      )

      AggregationFunction.foreach(__v => __obj.updateDynamic("AggregationFunction")(__v.asInstanceOf[js.Any]))
      FormatConfiguration.foreach(__v => __obj.updateDynamic("FormatConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DateMeasureField]
    }
  }

  /** The default values of the <code>DateTimeParameterDeclaration</code>.
    */
  @js.native
  trait DateTimeDefaultValues extends js.Object {
    var DynamicValue: js.UndefOr[DynamicDefaultValue]
    var RollingDate: js.UndefOr[RollingDateConfiguration]
    var StaticValues: js.UndefOr[DateTimeDefaultValueList]
  }

  object DateTimeDefaultValues {
    @inline
    def apply(
        DynamicValue: js.UndefOr[DynamicDefaultValue] = js.undefined,
        RollingDate: js.UndefOr[RollingDateConfiguration] = js.undefined,
        StaticValues: js.UndefOr[DateTimeDefaultValueList] = js.undefined
    ): DateTimeDefaultValues = {
      val __obj = js.Dynamic.literal()
      DynamicValue.foreach(__v => __obj.updateDynamic("DynamicValue")(__v.asInstanceOf[js.Any]))
      RollingDate.foreach(__v => __obj.updateDynamic("RollingDate")(__v.asInstanceOf[js.Any]))
      StaticValues.foreach(__v => __obj.updateDynamic("StaticValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DateTimeDefaultValues]
    }
  }

  /** Formatting configuration for <code>DateTime</code> fields.
    */
  @js.native
  trait DateTimeFormatConfiguration extends js.Object {
    var DateTimeFormat: js.UndefOr[DateTimeFormat]
    var NullValueFormatConfiguration: js.UndefOr[NullValueFormatConfiguration]
    var NumericFormatConfiguration: js.UndefOr[NumericFormatConfiguration]
  }

  object DateTimeFormatConfiguration {
    @inline
    def apply(
        DateTimeFormat: js.UndefOr[DateTimeFormat] = js.undefined,
        NullValueFormatConfiguration: js.UndefOr[NullValueFormatConfiguration] = js.undefined,
        NumericFormatConfiguration: js.UndefOr[NumericFormatConfiguration] = js.undefined
    ): DateTimeFormatConfiguration = {
      val __obj = js.Dynamic.literal()
      DateTimeFormat.foreach(__v => __obj.updateDynamic("DateTimeFormat")(__v.asInstanceOf[js.Any]))
      NullValueFormatConfiguration.foreach(__v => __obj.updateDynamic("NullValueFormatConfiguration")(__v.asInstanceOf[js.Any]))
      NumericFormatConfiguration.foreach(__v => __obj.updateDynamic("NumericFormatConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DateTimeFormatConfiguration]
    }
  }

  /** The option that determines the hierarchy of any <code>DateTime</code> fields.
    */
  @js.native
  trait DateTimeHierarchy extends js.Object {
    var HierarchyId: HierarchyId
    var DrillDownFilters: js.UndefOr[DrillDownFilterList]
  }

  object DateTimeHierarchy {
    @inline
    def apply(
        HierarchyId: HierarchyId,
        DrillDownFilters: js.UndefOr[DrillDownFilterList] = js.undefined
    ): DateTimeHierarchy = {
      val __obj = js.Dynamic.literal(
        "HierarchyId" -> HierarchyId.asInstanceOf[js.Any]
      )

      DrillDownFilters.foreach(__v => __obj.updateDynamic("DrillDownFilters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DateTimeHierarchy]
    }
  }

  /** A date-time parameter.
    */
  @js.native
  trait DateTimeParameter extends js.Object {
    var Name: NonEmptyString
    var Values: SensitiveTimestampList
  }

  object DateTimeParameter {
    @inline
    def apply(
        Name: NonEmptyString,
        Values: SensitiveTimestampList
    ): DateTimeParameter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DateTimeParameter]
    }
  }

  /** A parameter declaration for the <code>DateTime</code> data type.
    */
  @js.native
  trait DateTimeParameterDeclaration extends js.Object {
    var Name: ParameterName
    var DefaultValues: js.UndefOr[DateTimeDefaultValues]
    var TimeGranularity: js.UndefOr[TimeGranularity]
    var ValueWhenUnset: js.UndefOr[DateTimeValueWhenUnsetConfiguration]
  }

  object DateTimeParameterDeclaration {
    @inline
    def apply(
        Name: ParameterName,
        DefaultValues: js.UndefOr[DateTimeDefaultValues] = js.undefined,
        TimeGranularity: js.UndefOr[TimeGranularity] = js.undefined,
        ValueWhenUnset: js.UndefOr[DateTimeValueWhenUnsetConfiguration] = js.undefined
    ): DateTimeParameterDeclaration = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      DefaultValues.foreach(__v => __obj.updateDynamic("DefaultValues")(__v.asInstanceOf[js.Any]))
      TimeGranularity.foreach(__v => __obj.updateDynamic("TimeGranularity")(__v.asInstanceOf[js.Any]))
      ValueWhenUnset.foreach(__v => __obj.updateDynamic("ValueWhenUnset")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DateTimeParameterDeclaration]
    }
  }

  /** The display options of a control.
    */
  @js.native
  trait DateTimePickerControlDisplayOptions extends js.Object {
    var DateTimeFormat: js.UndefOr[DateTimeFormat]
    var TitleOptions: js.UndefOr[LabelOptions]
  }

  object DateTimePickerControlDisplayOptions {
    @inline
    def apply(
        DateTimeFormat: js.UndefOr[DateTimeFormat] = js.undefined,
        TitleOptions: js.UndefOr[LabelOptions] = js.undefined
    ): DateTimePickerControlDisplayOptions = {
      val __obj = js.Dynamic.literal()
      DateTimeFormat.foreach(__v => __obj.updateDynamic("DateTimeFormat")(__v.asInstanceOf[js.Any]))
      TitleOptions.foreach(__v => __obj.updateDynamic("TitleOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DateTimePickerControlDisplayOptions]
    }
  }

  /** The configuration that defines the default value of a <code>DateTime</code> parameter when a value has not been set.
    */
  @js.native
  trait DateTimeValueWhenUnsetConfiguration extends js.Object {
    var CustomValue: js.UndefOr[SensitiveTimestamp]
    var ValueWhenUnsetOption: js.UndefOr[ValueWhenUnsetOption]
  }

  object DateTimeValueWhenUnsetConfiguration {
    @inline
    def apply(
        CustomValue: js.UndefOr[SensitiveTimestamp] = js.undefined,
        ValueWhenUnsetOption: js.UndefOr[ValueWhenUnsetOption] = js.undefined
    ): DateTimeValueWhenUnsetConfiguration = {
      val __obj = js.Dynamic.literal()
      CustomValue.foreach(__v => __obj.updateDynamic("CustomValue")(__v.asInstanceOf[js.Any]))
      ValueWhenUnsetOption.foreach(__v => __obj.updateDynamic("ValueWhenUnsetOption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DateTimeValueWhenUnsetConfiguration]
    }
  }

  /** The default values of the <code>DecimalParameterDeclaration</code>.
    */
  @js.native
  trait DecimalDefaultValues extends js.Object {
    var DynamicValue: js.UndefOr[DynamicDefaultValue]
    var StaticValues: js.UndefOr[DecimalDefaultValueList]
  }

  object DecimalDefaultValues {
    @inline
    def apply(
        DynamicValue: js.UndefOr[DynamicDefaultValue] = js.undefined,
        StaticValues: js.UndefOr[DecimalDefaultValueList] = js.undefined
    ): DecimalDefaultValues = {
      val __obj = js.Dynamic.literal()
      DynamicValue.foreach(__v => __obj.updateDynamic("DynamicValue")(__v.asInstanceOf[js.Any]))
      StaticValues.foreach(__v => __obj.updateDynamic("StaticValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DecimalDefaultValues]
    }
  }

  /** A decimal parameter.
    */
  @js.native
  trait DecimalParameter extends js.Object {
    var Name: NonEmptyString
    var Values: SensitiveDoubleList
  }

  object DecimalParameter {
    @inline
    def apply(
        Name: NonEmptyString,
        Values: SensitiveDoubleList
    ): DecimalParameter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DecimalParameter]
    }
  }

  /** A parameter declaration for the <code>Decimal</code> data type.
    */
  @js.native
  trait DecimalParameterDeclaration extends js.Object {
    var Name: ParameterName
    var ParameterValueType: ParameterValueType
    var DefaultValues: js.UndefOr[DecimalDefaultValues]
    var ValueWhenUnset: js.UndefOr[DecimalValueWhenUnsetConfiguration]
  }

  object DecimalParameterDeclaration {
    @inline
    def apply(
        Name: ParameterName,
        ParameterValueType: ParameterValueType,
        DefaultValues: js.UndefOr[DecimalDefaultValues] = js.undefined,
        ValueWhenUnset: js.UndefOr[DecimalValueWhenUnsetConfiguration] = js.undefined
    ): DecimalParameterDeclaration = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "ParameterValueType" -> ParameterValueType.asInstanceOf[js.Any]
      )

      DefaultValues.foreach(__v => __obj.updateDynamic("DefaultValues")(__v.asInstanceOf[js.Any]))
      ValueWhenUnset.foreach(__v => __obj.updateDynamic("ValueWhenUnset")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DecimalParameterDeclaration]
    }
  }

  /** The option that determines the decimal places configuration.
    */
  @js.native
  trait DecimalPlacesConfiguration extends js.Object {
    var DecimalPlaces: DecimalPlaces
  }

  object DecimalPlacesConfiguration {
    @inline
    def apply(
        DecimalPlaces: DecimalPlaces
    ): DecimalPlacesConfiguration = {
      val __obj = js.Dynamic.literal(
        "DecimalPlaces" -> DecimalPlaces.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DecimalPlacesConfiguration]
    }
  }

  /** The configuration that defines the default value of a <code>Decimal</code> parameter when a value has not been set.
    */
  @js.native
  trait DecimalValueWhenUnsetConfiguration extends js.Object {
    var CustomValue: js.UndefOr[SensitiveDouble]
    var ValueWhenUnsetOption: js.UndefOr[ValueWhenUnsetOption]
  }

  object DecimalValueWhenUnsetConfiguration {
    @inline
    def apply(
        CustomValue: js.UndefOr[SensitiveDouble] = js.undefined,
        ValueWhenUnsetOption: js.UndefOr[ValueWhenUnsetOption] = js.undefined
    ): DecimalValueWhenUnsetConfiguration = {
      val __obj = js.Dynamic.literal()
      CustomValue.foreach(__v => __obj.updateDynamic("CustomValue")(__v.asInstanceOf[js.Any]))
      ValueWhenUnsetOption.foreach(__v => __obj.updateDynamic("ValueWhenUnsetOption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DecimalValueWhenUnsetConfiguration]
    }
  }

  /** The options that determine the default settings of a free-form layout configuration.
    */
  @js.native
  trait DefaultFreeFormLayoutConfiguration extends js.Object {
    var CanvasSizeOptions: FreeFormLayoutCanvasSizeOptions
  }

  object DefaultFreeFormLayoutConfiguration {
    @inline
    def apply(
        CanvasSizeOptions: FreeFormLayoutCanvasSizeOptions
    ): DefaultFreeFormLayoutConfiguration = {
      val __obj = js.Dynamic.literal(
        "CanvasSizeOptions" -> CanvasSizeOptions.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DefaultFreeFormLayoutConfiguration]
    }
  }

  /** The options that determine the default settings for a grid layout configuration.
    */
  @js.native
  trait DefaultGridLayoutConfiguration extends js.Object {
    var CanvasSizeOptions: GridLayoutCanvasSizeOptions
  }

  object DefaultGridLayoutConfiguration {
    @inline
    def apply(
        CanvasSizeOptions: GridLayoutCanvasSizeOptions
    ): DefaultGridLayoutConfiguration = {
      val __obj = js.Dynamic.literal(
        "CanvasSizeOptions" -> CanvasSizeOptions.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DefaultGridLayoutConfiguration]
    }
  }

  /** The options that determine the default settings for interactive layout configuration.
    */
  @js.native
  trait DefaultInteractiveLayoutConfiguration extends js.Object {
    var FreeForm: js.UndefOr[DefaultFreeFormLayoutConfiguration]
    var Grid: js.UndefOr[DefaultGridLayoutConfiguration]
  }

  object DefaultInteractiveLayoutConfiguration {
    @inline
    def apply(
        FreeForm: js.UndefOr[DefaultFreeFormLayoutConfiguration] = js.undefined,
        Grid: js.UndefOr[DefaultGridLayoutConfiguration] = js.undefined
    ): DefaultInteractiveLayoutConfiguration = {
      val __obj = js.Dynamic.literal()
      FreeForm.foreach(__v => __obj.updateDynamic("FreeForm")(__v.asInstanceOf[js.Any]))
      Grid.foreach(__v => __obj.updateDynamic("Grid")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DefaultInteractiveLayoutConfiguration]
    }
  }

  /** The configuration for default new sheet settings.
    */
  @js.native
  trait DefaultNewSheetConfiguration extends js.Object {
    var InteractiveLayoutConfiguration: js.UndefOr[DefaultInteractiveLayoutConfiguration]
    var PaginatedLayoutConfiguration: js.UndefOr[DefaultPaginatedLayoutConfiguration]
    var SheetContentType: js.UndefOr[SheetContentType]
  }

  object DefaultNewSheetConfiguration {
    @inline
    def apply(
        InteractiveLayoutConfiguration: js.UndefOr[DefaultInteractiveLayoutConfiguration] = js.undefined,
        PaginatedLayoutConfiguration: js.UndefOr[DefaultPaginatedLayoutConfiguration] = js.undefined,
        SheetContentType: js.UndefOr[SheetContentType] = js.undefined
    ): DefaultNewSheetConfiguration = {
      val __obj = js.Dynamic.literal()
      InteractiveLayoutConfiguration.foreach(__v => __obj.updateDynamic("InteractiveLayoutConfiguration")(__v.asInstanceOf[js.Any]))
      PaginatedLayoutConfiguration.foreach(__v => __obj.updateDynamic("PaginatedLayoutConfiguration")(__v.asInstanceOf[js.Any]))
      SheetContentType.foreach(__v => __obj.updateDynamic("SheetContentType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DefaultNewSheetConfiguration]
    }
  }

  /** The options that determine the default settings for a paginated layout configuration.
    */
  @js.native
  trait DefaultPaginatedLayoutConfiguration extends js.Object {
    var SectionBased: js.UndefOr[DefaultSectionBasedLayoutConfiguration]
  }

  object DefaultPaginatedLayoutConfiguration {
    @inline
    def apply(
        SectionBased: js.UndefOr[DefaultSectionBasedLayoutConfiguration] = js.undefined
    ): DefaultPaginatedLayoutConfiguration = {
      val __obj = js.Dynamic.literal()
      SectionBased.foreach(__v => __obj.updateDynamic("SectionBased")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DefaultPaginatedLayoutConfiguration]
    }
  }

  /** The options that determine the default settings for a section-based layout configuration.
    */
  @js.native
  trait DefaultSectionBasedLayoutConfiguration extends js.Object {
    var CanvasSizeOptions: SectionBasedLayoutCanvasSizeOptions
  }

  object DefaultSectionBasedLayoutConfiguration {
    @inline
    def apply(
        CanvasSizeOptions: SectionBasedLayoutCanvasSizeOptions
    ): DefaultSectionBasedLayoutConfiguration = {
      val __obj = js.Dynamic.literal(
        "CanvasSizeOptions" -> CanvasSizeOptions.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DefaultSectionBasedLayoutConfiguration]
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
  trait DeleteAccountSubscriptionRequest extends js.Object {
    var AwsAccountId: AwsAccountId
  }

  object DeleteAccountSubscriptionRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId
    ): DeleteAccountSubscriptionRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAccountSubscriptionRequest]
    }
  }

  @js.native
  trait DeleteAccountSubscriptionResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DeleteAccountSubscriptionResponse {
    @inline
    def apply(
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DeleteAccountSubscriptionResponse = {
      val __obj = js.Dynamic.literal()
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteAccountSubscriptionResponse]
    }
  }

  @js.native
  trait DeleteAnalysisRequest extends js.Object {
    var AnalysisId: ShortRestrictiveResourceId
    var AwsAccountId: AwsAccountId
    var ForceDeleteWithoutRecovery: js.UndefOr[Boolean]
    var RecoveryWindowInDays: js.UndefOr[RecoveryWindowInDays]
  }

  object DeleteAnalysisRequest {
    @inline
    def apply(
        AnalysisId: ShortRestrictiveResourceId,
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
    var AnalysisId: js.UndefOr[ShortRestrictiveResourceId]
    var Arn: js.UndefOr[Arn]
    var DeletionTime: js.UndefOr[Timestamp]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DeleteAnalysisResponse {
    @inline
    def apply(
        AnalysisId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined,
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
    var DashboardId: ShortRestrictiveResourceId
    var VersionNumber: js.UndefOr[VersionNumber]
  }

  object DeleteDashboardRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DashboardId: ShortRestrictiveResourceId,
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
    var DashboardId: js.UndefOr[ShortRestrictiveResourceId]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DeleteDashboardResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        DashboardId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined,
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
    var TemplateId: ShortRestrictiveResourceId
  }

  object DeleteTemplateAliasRequest {
    @inline
    def apply(
        AliasName: AliasName,
        AwsAccountId: AwsAccountId,
        TemplateId: ShortRestrictiveResourceId
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
    var TemplateId: js.UndefOr[ShortRestrictiveResourceId]
  }

  object DeleteTemplateAliasResponse {
    @inline
    def apply(
        AliasName: js.UndefOr[AliasName] = js.undefined,
        Arn: js.UndefOr[Arn] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        TemplateId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined
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
    var TemplateId: ShortRestrictiveResourceId
    var VersionNumber: js.UndefOr[VersionNumber]
  }

  object DeleteTemplateRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        TemplateId: ShortRestrictiveResourceId,
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
    var TemplateId: js.UndefOr[ShortRestrictiveResourceId]
  }

  object DeleteTemplateResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        TemplateId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined
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
    var ThemeId: ShortRestrictiveResourceId
  }

  object DeleteThemeAliasRequest {
    @inline
    def apply(
        AliasName: AliasName,
        AwsAccountId: AwsAccountId,
        ThemeId: ShortRestrictiveResourceId
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
    var ThemeId: js.UndefOr[ShortRestrictiveResourceId]
  }

  object DeleteThemeAliasResponse {
    @inline
    def apply(
        AliasName: js.UndefOr[AliasName] = js.undefined,
        Arn: js.UndefOr[Arn] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        ThemeId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined
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
    var ThemeId: ShortRestrictiveResourceId
    var VersionNumber: js.UndefOr[VersionNumber]
  }

  object DeleteThemeRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        ThemeId: ShortRestrictiveResourceId,
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
    var ThemeId: js.UndefOr[ShortRestrictiveResourceId]
  }

  object DeleteThemeResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        ThemeId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined
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
  trait DescribeAccountSubscriptionRequest extends js.Object {
    var AwsAccountId: AwsAccountId
  }

  object DescribeAccountSubscriptionRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId
    ): DescribeAccountSubscriptionRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAccountSubscriptionRequest]
    }
  }

  @js.native
  trait DescribeAccountSubscriptionResponse extends js.Object {
    var AccountInfo: js.UndefOr[AccountInfo]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DescribeAccountSubscriptionResponse {
    @inline
    def apply(
        AccountInfo: js.UndefOr[AccountInfo] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DescribeAccountSubscriptionResponse = {
      val __obj = js.Dynamic.literal()
      AccountInfo.foreach(__v => __obj.updateDynamic("AccountInfo")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAccountSubscriptionResponse]
    }
  }

  @js.native
  trait DescribeAnalysisDefinitionRequest extends js.Object {
    var AnalysisId: ShortRestrictiveResourceId
    var AwsAccountId: AwsAccountId
  }

  object DescribeAnalysisDefinitionRequest {
    @inline
    def apply(
        AnalysisId: ShortRestrictiveResourceId,
        AwsAccountId: AwsAccountId
    ): DescribeAnalysisDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "AnalysisId" -> AnalysisId.asInstanceOf[js.Any],
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAnalysisDefinitionRequest]
    }
  }

  @js.native
  trait DescribeAnalysisDefinitionResponse extends js.Object {
    var AnalysisId: js.UndefOr[ShortRestrictiveResourceId]
    var Definition: js.UndefOr[AnalysisDefinition]
    var Errors: js.UndefOr[AnalysisErrorList]
    var Name: js.UndefOr[AnalysisName]
    var RequestId: js.UndefOr[String]
    var ResourceStatus: js.UndefOr[ResourceStatus]
    var Status: js.UndefOr[StatusCode]
    var ThemeArn: js.UndefOr[Arn]
  }

  object DescribeAnalysisDefinitionResponse {
    @inline
    def apply(
        AnalysisId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined,
        Definition: js.UndefOr[AnalysisDefinition] = js.undefined,
        Errors: js.UndefOr[AnalysisErrorList] = js.undefined,
        Name: js.UndefOr[AnalysisName] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        ResourceStatus: js.UndefOr[ResourceStatus] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        ThemeArn: js.UndefOr[Arn] = js.undefined
    ): DescribeAnalysisDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      AnalysisId.foreach(__v => __obj.updateDynamic("AnalysisId")(__v.asInstanceOf[js.Any]))
      Definition.foreach(__v => __obj.updateDynamic("Definition")(__v.asInstanceOf[js.Any]))
      Errors.foreach(__v => __obj.updateDynamic("Errors")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      ResourceStatus.foreach(__v => __obj.updateDynamic("ResourceStatus")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      ThemeArn.foreach(__v => __obj.updateDynamic("ThemeArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAnalysisDefinitionResponse]
    }
  }

  @js.native
  trait DescribeAnalysisPermissionsRequest extends js.Object {
    var AnalysisId: ShortRestrictiveResourceId
    var AwsAccountId: AwsAccountId
  }

  object DescribeAnalysisPermissionsRequest {
    @inline
    def apply(
        AnalysisId: ShortRestrictiveResourceId,
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
    var AnalysisId: js.UndefOr[ShortRestrictiveResourceId]
    var Permissions: js.UndefOr[ResourcePermissionList]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DescribeAnalysisPermissionsResponse {
    @inline
    def apply(
        AnalysisArn: js.UndefOr[Arn] = js.undefined,
        AnalysisId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined,
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
    var AnalysisId: ShortRestrictiveResourceId
    var AwsAccountId: AwsAccountId
  }

  object DescribeAnalysisRequest {
    @inline
    def apply(
        AnalysisId: ShortRestrictiveResourceId,
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
  trait DescribeDashboardDefinitionRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DashboardId: ShortRestrictiveResourceId
    var AliasName: js.UndefOr[AliasName]
    var VersionNumber: js.UndefOr[VersionNumber]
  }

  object DescribeDashboardDefinitionRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DashboardId: ShortRestrictiveResourceId,
        AliasName: js.UndefOr[AliasName] = js.undefined,
        VersionNumber: js.UndefOr[VersionNumber] = js.undefined
    ): DescribeDashboardDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "DashboardId" -> DashboardId.asInstanceOf[js.Any]
      )

      AliasName.foreach(__v => __obj.updateDynamic("AliasName")(__v.asInstanceOf[js.Any]))
      VersionNumber.foreach(__v => __obj.updateDynamic("VersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDashboardDefinitionRequest]
    }
  }

  @js.native
  trait DescribeDashboardDefinitionResponse extends js.Object {
    var DashboardId: js.UndefOr[ShortRestrictiveResourceId]
    var Definition: js.UndefOr[DashboardVersionDefinition]
    var Errors: js.UndefOr[DashboardErrorList]
    var Name: js.UndefOr[DashboardName]
    var RequestId: js.UndefOr[String]
    var ResourceStatus: js.UndefOr[ResourceStatus]
    var Status: js.UndefOr[StatusCode]
    var ThemeArn: js.UndefOr[Arn]
  }

  object DescribeDashboardDefinitionResponse {
    @inline
    def apply(
        DashboardId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined,
        Definition: js.UndefOr[DashboardVersionDefinition] = js.undefined,
        Errors: js.UndefOr[DashboardErrorList] = js.undefined,
        Name: js.UndefOr[DashboardName] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        ResourceStatus: js.UndefOr[ResourceStatus] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        ThemeArn: js.UndefOr[Arn] = js.undefined
    ): DescribeDashboardDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      DashboardId.foreach(__v => __obj.updateDynamic("DashboardId")(__v.asInstanceOf[js.Any]))
      Definition.foreach(__v => __obj.updateDynamic("Definition")(__v.asInstanceOf[js.Any]))
      Errors.foreach(__v => __obj.updateDynamic("Errors")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      ResourceStatus.foreach(__v => __obj.updateDynamic("ResourceStatus")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      ThemeArn.foreach(__v => __obj.updateDynamic("ThemeArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDashboardDefinitionResponse]
    }
  }

  @js.native
  trait DescribeDashboardPermissionsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DashboardId: ShortRestrictiveResourceId
  }

  object DescribeDashboardPermissionsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DashboardId: ShortRestrictiveResourceId
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
    var DashboardId: js.UndefOr[ShortRestrictiveResourceId]
    var LinkSharingConfiguration: js.UndefOr[LinkSharingConfiguration]
    var Permissions: js.UndefOr[ResourcePermissionList]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DescribeDashboardPermissionsResponse {
    @inline
    def apply(
        DashboardArn: js.UndefOr[Arn] = js.undefined,
        DashboardId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined,
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
    var DashboardId: ShortRestrictiveResourceId
    var AliasName: js.UndefOr[AliasName]
    var VersionNumber: js.UndefOr[VersionNumber]
  }

  object DescribeDashboardRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DashboardId: ShortRestrictiveResourceId,
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
  trait DescribeGroupMembershipRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var GroupName: GroupName
    var MemberName: GroupMemberName
    var Namespace: Namespace
  }

  object DescribeGroupMembershipRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        GroupName: GroupName,
        MemberName: GroupMemberName,
        Namespace: Namespace
    ): DescribeGroupMembershipRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "GroupName" -> GroupName.asInstanceOf[js.Any],
        "MemberName" -> MemberName.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeGroupMembershipRequest]
    }
  }

  @js.native
  trait DescribeGroupMembershipResponse extends js.Object {
    var GroupMember: js.UndefOr[GroupMember]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object DescribeGroupMembershipResponse {
    @inline
    def apply(
        GroupMember: js.UndefOr[GroupMember] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): DescribeGroupMembershipResponse = {
      val __obj = js.Dynamic.literal()
      GroupMember.foreach(__v => __obj.updateDynamic("GroupMember")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeGroupMembershipResponse]
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
    var TemplateId: ShortRestrictiveResourceId
  }

  object DescribeTemplateAliasRequest {
    @inline
    def apply(
        AliasName: AliasName,
        AwsAccountId: AwsAccountId,
        TemplateId: ShortRestrictiveResourceId
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
  trait DescribeTemplateDefinitionRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var TemplateId: ShortRestrictiveResourceId
    var AliasName: js.UndefOr[AliasName]
    var VersionNumber: js.UndefOr[VersionNumber]
  }

  object DescribeTemplateDefinitionRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        TemplateId: ShortRestrictiveResourceId,
        AliasName: js.UndefOr[AliasName] = js.undefined,
        VersionNumber: js.UndefOr[VersionNumber] = js.undefined
    ): DescribeTemplateDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "TemplateId" -> TemplateId.asInstanceOf[js.Any]
      )

      AliasName.foreach(__v => __obj.updateDynamic("AliasName")(__v.asInstanceOf[js.Any]))
      VersionNumber.foreach(__v => __obj.updateDynamic("VersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTemplateDefinitionRequest]
    }
  }

  @js.native
  trait DescribeTemplateDefinitionResponse extends js.Object {
    var Definition: js.UndefOr[TemplateVersionDefinition]
    var Errors: js.UndefOr[TemplateErrorList]
    var Name: js.UndefOr[TemplateName]
    var RequestId: js.UndefOr[String]
    var ResourceStatus: js.UndefOr[ResourceStatus]
    var Status: js.UndefOr[StatusCode]
    var TemplateId: js.UndefOr[ShortRestrictiveResourceId]
    var ThemeArn: js.UndefOr[Arn]
  }

  object DescribeTemplateDefinitionResponse {
    @inline
    def apply(
        Definition: js.UndefOr[TemplateVersionDefinition] = js.undefined,
        Errors: js.UndefOr[TemplateErrorList] = js.undefined,
        Name: js.UndefOr[TemplateName] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        ResourceStatus: js.UndefOr[ResourceStatus] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        TemplateId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined,
        ThemeArn: js.UndefOr[Arn] = js.undefined
    ): DescribeTemplateDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      Definition.foreach(__v => __obj.updateDynamic("Definition")(__v.asInstanceOf[js.Any]))
      Errors.foreach(__v => __obj.updateDynamic("Errors")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      ResourceStatus.foreach(__v => __obj.updateDynamic("ResourceStatus")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TemplateId.foreach(__v => __obj.updateDynamic("TemplateId")(__v.asInstanceOf[js.Any]))
      ThemeArn.foreach(__v => __obj.updateDynamic("ThemeArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTemplateDefinitionResponse]
    }
  }

  @js.native
  trait DescribeTemplatePermissionsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var TemplateId: ShortRestrictiveResourceId
  }

  object DescribeTemplatePermissionsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        TemplateId: ShortRestrictiveResourceId
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
    var TemplateId: js.UndefOr[ShortRestrictiveResourceId]
  }

  object DescribeTemplatePermissionsResponse {
    @inline
    def apply(
        Permissions: js.UndefOr[ResourcePermissionList] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        TemplateArn: js.UndefOr[Arn] = js.undefined,
        TemplateId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined
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
    var TemplateId: ShortRestrictiveResourceId
    var AliasName: js.UndefOr[AliasName]
    var VersionNumber: js.UndefOr[VersionNumber]
  }

  object DescribeTemplateRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        TemplateId: ShortRestrictiveResourceId,
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
    var ThemeId: ShortRestrictiveResourceId
  }

  object DescribeThemeAliasRequest {
    @inline
    def apply(
        AliasName: AliasName,
        AwsAccountId: AwsAccountId,
        ThemeId: ShortRestrictiveResourceId
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
    var ThemeId: ShortRestrictiveResourceId
  }

  object DescribeThemePermissionsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        ThemeId: ShortRestrictiveResourceId
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
    var ThemeId: js.UndefOr[ShortRestrictiveResourceId]
  }

  object DescribeThemePermissionsResponse {
    @inline
    def apply(
        Permissions: js.UndefOr[ResourcePermissionList] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        ThemeArn: js.UndefOr[Arn] = js.undefined,
        ThemeId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined
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
    var ThemeId: ShortRestrictiveResourceId
    var AliasName: js.UndefOr[AliasName]
    var VersionNumber: js.UndefOr[VersionNumber]
  }

  object DescribeThemeRequest {
    @inline
    def apply(
        AwsAccountId: AwsAndAccountId,
        ThemeId: ShortRestrictiveResourceId,
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

  /** The configuration of destination parameter values. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait DestinationParameterValueConfiguration extends js.Object {
    var CustomValuesConfiguration: js.UndefOr[CustomValuesConfiguration]
    var SelectAllValueOptions: js.UndefOr[SelectAllValueOptions]
    var SourceField: js.UndefOr[FieldId]
    var SourceParameterName: js.UndefOr[String]
  }

  object DestinationParameterValueConfiguration {
    @inline
    def apply(
        CustomValuesConfiguration: js.UndefOr[CustomValuesConfiguration] = js.undefined,
        SelectAllValueOptions: js.UndefOr[SelectAllValueOptions] = js.undefined,
        SourceField: js.UndefOr[FieldId] = js.undefined,
        SourceParameterName: js.UndefOr[String] = js.undefined
    ): DestinationParameterValueConfiguration = {
      val __obj = js.Dynamic.literal()
      CustomValuesConfiguration.foreach(__v => __obj.updateDynamic("CustomValuesConfiguration")(__v.asInstanceOf[js.Any]))
      SelectAllValueOptions.foreach(__v => __obj.updateDynamic("SelectAllValueOptions")(__v.asInstanceOf[js.Any]))
      SourceField.foreach(__v => __obj.updateDynamic("SourceField")(__v.asInstanceOf[js.Any]))
      SourceParameterName.foreach(__v => __obj.updateDynamic("SourceParameterName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DestinationParameterValueConfiguration]
    }
  }

  /** The dimension type field.
    */
  @js.native
  trait DimensionField extends js.Object {
    var CategoricalDimensionField: js.UndefOr[CategoricalDimensionField]
    var DateDimensionField: js.UndefOr[DateDimensionField]
    var NumericalDimensionField: js.UndefOr[NumericalDimensionField]
  }

  object DimensionField {
    @inline
    def apply(
        CategoricalDimensionField: js.UndefOr[CategoricalDimensionField] = js.undefined,
        DateDimensionField: js.UndefOr[DateDimensionField] = js.undefined,
        NumericalDimensionField: js.UndefOr[NumericalDimensionField] = js.undefined
    ): DimensionField = {
      val __obj = js.Dynamic.literal()
      CategoricalDimensionField.foreach(__v => __obj.updateDynamic("CategoricalDimensionField")(__v.asInstanceOf[js.Any]))
      DateDimensionField.foreach(__v => __obj.updateDynamic("DateDimensionField")(__v.asInstanceOf[js.Any]))
      NumericalDimensionField.foreach(__v => __obj.updateDynamic("NumericalDimensionField")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DimensionField]
    }
  }

  /** The label options of the label that is displayed in the center of a donut chart. This option isn't available for pie charts.
    */
  @js.native
  trait DonutCenterOptions extends js.Object {
    var LabelVisibility: js.UndefOr[Visibility]
  }

  object DonutCenterOptions {
    @inline
    def apply(
        LabelVisibility: js.UndefOr[Visibility] = js.undefined
    ): DonutCenterOptions = {
      val __obj = js.Dynamic.literal()
      LabelVisibility.foreach(__v => __obj.updateDynamic("LabelVisibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DonutCenterOptions]
    }
  }

  /** The options for configuring a donut chart or pie chart.
    */
  @js.native
  trait DonutOptions extends js.Object {
    var ArcOptions: js.UndefOr[ArcOptions]
    var DonutCenterOptions: js.UndefOr[DonutCenterOptions]
  }

  object DonutOptions {
    @inline
    def apply(
        ArcOptions: js.UndefOr[ArcOptions] = js.undefined,
        DonutCenterOptions: js.UndefOr[DonutCenterOptions] = js.undefined
    ): DonutOptions = {
      val __obj = js.Dynamic.literal()
      ArcOptions.foreach(__v => __obj.updateDynamic("ArcOptions")(__v.asInstanceOf[js.Any]))
      DonutCenterOptions.foreach(__v => __obj.updateDynamic("DonutCenterOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DonutOptions]
    }
  }

  /** The drill down filter for the column hierarchies. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait DrillDownFilter extends js.Object {
    var CategoryFilter: js.UndefOr[CategoryDrillDownFilter]
    var NumericEqualityFilter: js.UndefOr[NumericEqualityDrillDownFilter]
    var TimeRangeFilter: js.UndefOr[TimeRangeDrillDownFilter]
  }

  object DrillDownFilter {
    @inline
    def apply(
        CategoryFilter: js.UndefOr[CategoryDrillDownFilter] = js.undefined,
        NumericEqualityFilter: js.UndefOr[NumericEqualityDrillDownFilter] = js.undefined,
        TimeRangeFilter: js.UndefOr[TimeRangeDrillDownFilter] = js.undefined
    ): DrillDownFilter = {
      val __obj = js.Dynamic.literal()
      CategoryFilter.foreach(__v => __obj.updateDynamic("CategoryFilter")(__v.asInstanceOf[js.Any]))
      NumericEqualityFilter.foreach(__v => __obj.updateDynamic("NumericEqualityFilter")(__v.asInstanceOf[js.Any]))
      TimeRangeFilter.foreach(__v => __obj.updateDynamic("TimeRangeFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DrillDownFilter]
    }
  }

  /** The display options of a control.
    */
  @js.native
  trait DropDownControlDisplayOptions extends js.Object {
    var SelectAllOptions: js.UndefOr[ListControlSelectAllOptions]
    var TitleOptions: js.UndefOr[LabelOptions]
  }

  object DropDownControlDisplayOptions {
    @inline
    def apply(
        SelectAllOptions: js.UndefOr[ListControlSelectAllOptions] = js.undefined,
        TitleOptions: js.UndefOr[LabelOptions] = js.undefined
    ): DropDownControlDisplayOptions = {
      val __obj = js.Dynamic.literal()
      SelectAllOptions.foreach(__v => __obj.updateDynamic("SelectAllOptions")(__v.asInstanceOf[js.Any]))
      TitleOptions.foreach(__v => __obj.updateDynamic("TitleOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DropDownControlDisplayOptions]
    }
  }

  /** Defines different defaults to the users or groups based on mapping.
    */
  @js.native
  trait DynamicDefaultValue extends js.Object {
    var DefaultValueColumn: ColumnIdentifier
    var GroupNameColumn: js.UndefOr[ColumnIdentifier]
    var UserNameColumn: js.UndefOr[ColumnIdentifier]
  }

  object DynamicDefaultValue {
    @inline
    def apply(
        DefaultValueColumn: ColumnIdentifier,
        GroupNameColumn: js.UndefOr[ColumnIdentifier] = js.undefined,
        UserNameColumn: js.UndefOr[ColumnIdentifier] = js.undefined
    ): DynamicDefaultValue = {
      val __obj = js.Dynamic.literal(
        "DefaultValueColumn" -> DefaultValueColumn.asInstanceOf[js.Any]
      )

      GroupNameColumn.foreach(__v => __obj.updateDynamic("GroupNameColumn")(__v.asInstanceOf[js.Any]))
      UserNameColumn.foreach(__v => __obj.updateDynamic("UserNameColumn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DynamicDefaultValue]
    }
  }

  /** An empty visual. Empty visuals are used in layouts but have not been configured to show any data. A new visual created in the Amazon QuickSight console is considered an <code>EmptyVisual</code> until a visual type is selected.
    */
  @js.native
  trait EmptyVisual extends js.Object {
    var DataSetIdentifier: DataSetIdentifier
    var VisualId: ShortRestrictiveResourceId
    var Actions: js.UndefOr[VisualCustomActionList]
  }

  object EmptyVisual {
    @inline
    def apply(
        DataSetIdentifier: DataSetIdentifier,
        VisualId: ShortRestrictiveResourceId,
        Actions: js.UndefOr[VisualCustomActionList] = js.undefined
    ): EmptyVisual = {
      val __obj = js.Dynamic.literal(
        "DataSetIdentifier" -> DataSetIdentifier.asInstanceOf[js.Any],
        "VisualId" -> VisualId.asInstanceOf[js.Any]
      )

      Actions.foreach(__v => __obj.updateDynamic("Actions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EmptyVisual]
    }
  }

  /** An object, structure, or sub-structure of an analysis, template, or dashboard.
    */
  @js.native
  trait Entity extends js.Object {
    var Path: js.UndefOr[NonEmptyString]
  }

  object Entity {
    @inline
    def apply(
        Path: js.UndefOr[NonEmptyString] = js.undefined
    ): Entity = {
      val __obj = js.Dynamic.literal()
      Path.foreach(__v => __obj.updateDynamic("Path")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Entity]
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

  /** The exclude period of <code>TimeRangeFilter</code> or <code>RelativeDatesFilter</code>.
    */
  @js.native
  trait ExcludePeriodConfiguration extends js.Object {
    var Amount: Int
    var Granularity: TimeGranularity
    var Status: js.UndefOr[WidgetStatus]
  }

  object ExcludePeriodConfiguration {
    @inline
    def apply(
        Amount: Int,
        Granularity: TimeGranularity,
        Status: js.UndefOr[WidgetStatus] = js.undefined
    ): ExcludePeriodConfiguration = {
      val __obj = js.Dynamic.literal(
        "Amount" -> Amount.asInstanceOf[js.Any],
        "Granularity" -> Granularity.asInstanceOf[js.Any]
      )

      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExcludePeriodConfiguration]
    }
  }

  /** The option that determines the hierarchy of the fields that are built within a visual's field wells. These fields can't be duplicated to other visuals.
    */
  @js.native
  trait ExplicitHierarchy extends js.Object {
    var Columns: ExplicitHierarchyColumnList
    var HierarchyId: HierarchyId
    var DrillDownFilters: js.UndefOr[DrillDownFilterList]
  }

  object ExplicitHierarchy {
    @inline
    def apply(
        Columns: ExplicitHierarchyColumnList,
        HierarchyId: HierarchyId,
        DrillDownFilters: js.UndefOr[DrillDownFilterList] = js.undefined
    ): ExplicitHierarchy = {
      val __obj = js.Dynamic.literal(
        "Columns" -> Columns.asInstanceOf[js.Any],
        "HierarchyId" -> HierarchyId.asInstanceOf[js.Any]
      )

      DrillDownFilters.foreach(__v => __obj.updateDynamic("DrillDownFilters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExplicitHierarchy]
    }
  }

  /** <p/>
    */
  @js.native
  trait ExportHiddenFieldsOption extends js.Object {
    var AvailabilityStatus: js.UndefOr[DashboardBehavior]
  }

  object ExportHiddenFieldsOption {
    @inline
    def apply(
        AvailabilityStatus: js.UndefOr[DashboardBehavior] = js.undefined
    ): ExportHiddenFieldsOption = {
      val __obj = js.Dynamic.literal()
      AvailabilityStatus.foreach(__v => __obj.updateDynamic("AvailabilityStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportHiddenFieldsOption]
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

  /** The setup for the detailed tooltip.
    */
  @js.native
  trait FieldBasedTooltip extends js.Object {
    var AggregationVisibility: js.UndefOr[Visibility]
    var TooltipFields: js.UndefOr[TooltipItemList]
    var TooltipTitleType: js.UndefOr[TooltipTitleType]
  }

  object FieldBasedTooltip {
    @inline
    def apply(
        AggregationVisibility: js.UndefOr[Visibility] = js.undefined,
        TooltipFields: js.UndefOr[TooltipItemList] = js.undefined,
        TooltipTitleType: js.UndefOr[TooltipTitleType] = js.undefined
    ): FieldBasedTooltip = {
      val __obj = js.Dynamic.literal()
      AggregationVisibility.foreach(__v => __obj.updateDynamic("AggregationVisibility")(__v.asInstanceOf[js.Any]))
      TooltipFields.foreach(__v => __obj.updateDynamic("TooltipFields")(__v.asInstanceOf[js.Any]))
      TooltipTitleType.foreach(__v => __obj.updateDynamic("TooltipTitleType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FieldBasedTooltip]
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

  /** The field label type.
    */
  @js.native
  trait FieldLabelType extends js.Object {
    var FieldId: js.UndefOr[FieldId]
    var Visibility: js.UndefOr[Visibility]
  }

  object FieldLabelType {
    @inline
    def apply(
        FieldId: js.UndefOr[FieldId] = js.undefined,
        Visibility: js.UndefOr[Visibility] = js.undefined
    ): FieldLabelType = {
      val __obj = js.Dynamic.literal()
      FieldId.foreach(__v => __obj.updateDynamic("FieldId")(__v.asInstanceOf[js.Any]))
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FieldLabelType]
    }
  }

  /** The field series item configuration of a line chart.
    */
  @js.native
  trait FieldSeriesItem extends js.Object {
    var AxisBinding: AxisBinding
    var FieldId: FieldId
    var Settings: js.UndefOr[LineChartSeriesSettings]
  }

  object FieldSeriesItem {
    @inline
    def apply(
        AxisBinding: AxisBinding,
        FieldId: FieldId,
        Settings: js.UndefOr[LineChartSeriesSettings] = js.undefined
    ): FieldSeriesItem = {
      val __obj = js.Dynamic.literal(
        "AxisBinding" -> AxisBinding.asInstanceOf[js.Any],
        "FieldId" -> FieldId.asInstanceOf[js.Any]
      )

      Settings.foreach(__v => __obj.updateDynamic("Settings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FieldSeriesItem]
    }
  }

  /** The sort configuration for a field in a field well.
    */
  @js.native
  trait FieldSort extends js.Object {
    var Direction: SortDirection
    var FieldId: FieldId
  }

  object FieldSort {
    @inline
    def apply(
        Direction: SortDirection,
        FieldId: FieldId
    ): FieldSort = {
      val __obj = js.Dynamic.literal(
        "Direction" -> Direction.asInstanceOf[js.Any],
        "FieldId" -> FieldId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FieldSort]
    }
  }

  /** The field sort options in a chart configuration.
    */
  @js.native
  trait FieldSortOptions extends js.Object {
    var ColumnSort: js.UndefOr[ColumnSort]
    var FieldSort: js.UndefOr[FieldSort]
  }

  object FieldSortOptions {
    @inline
    def apply(
        ColumnSort: js.UndefOr[ColumnSort] = js.undefined,
        FieldSort: js.UndefOr[FieldSort] = js.undefined
    ): FieldSortOptions = {
      val __obj = js.Dynamic.literal()
      ColumnSort.foreach(__v => __obj.updateDynamic("ColumnSort")(__v.asInstanceOf[js.Any]))
      FieldSort.foreach(__v => __obj.updateDynamic("FieldSort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FieldSortOptions]
    }
  }

  /** The tooltip item for the fields.
    */
  @js.native
  trait FieldTooltipItem extends js.Object {
    var FieldId: FieldId
    var Label: js.UndefOr[String]
    var Visibility: js.UndefOr[Visibility]
  }

  object FieldTooltipItem {
    @inline
    def apply(
        FieldId: FieldId,
        Label: js.UndefOr[String] = js.undefined,
        Visibility: js.UndefOr[Visibility] = js.undefined
    ): FieldTooltipItem = {
      val __obj = js.Dynamic.literal(
        "FieldId" -> FieldId.asInstanceOf[js.Any]
      )

      Label.foreach(__v => __obj.updateDynamic("Label")(__v.asInstanceOf[js.Any]))
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FieldTooltipItem]
    }
  }

  /** The aggregated field well of the filled map.
    */
  @js.native
  trait FilledMapAggregatedFieldWells extends js.Object {
    var Geospatial: js.UndefOr[FilledMapDimensionFieldList]
    var Values: js.UndefOr[FilledMapMeasureFieldList]
  }

  object FilledMapAggregatedFieldWells {
    @inline
    def apply(
        Geospatial: js.UndefOr[FilledMapDimensionFieldList] = js.undefined,
        Values: js.UndefOr[FilledMapMeasureFieldList] = js.undefined
    ): FilledMapAggregatedFieldWells = {
      val __obj = js.Dynamic.literal()
      Geospatial.foreach(__v => __obj.updateDynamic("Geospatial")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilledMapAggregatedFieldWells]
    }
  }

  /** The conditional formatting of a <code>FilledMapVisual</code>.
    */
  @js.native
  trait FilledMapConditionalFormatting extends js.Object {
    var ConditionalFormattingOptions: FilledMapConditionalFormattingOptionList
  }

  object FilledMapConditionalFormatting {
    @inline
    def apply(
        ConditionalFormattingOptions: FilledMapConditionalFormattingOptionList
    ): FilledMapConditionalFormatting = {
      val __obj = js.Dynamic.literal(
        "ConditionalFormattingOptions" -> ConditionalFormattingOptions.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FilledMapConditionalFormatting]
    }
  }

  /** Conditional formatting options of a <code>FilledMapVisual</code>.
    */
  @js.native
  trait FilledMapConditionalFormattingOption extends js.Object {
    var Shape: FilledMapShapeConditionalFormatting
  }

  object FilledMapConditionalFormattingOption {
    @inline
    def apply(
        Shape: FilledMapShapeConditionalFormatting
    ): FilledMapConditionalFormattingOption = {
      val __obj = js.Dynamic.literal(
        "Shape" -> Shape.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FilledMapConditionalFormattingOption]
    }
  }

  /** The configuration for a <code>FilledMapVisual</code>.
    */
  @js.native
  trait FilledMapConfiguration extends js.Object {
    var FieldWells: js.UndefOr[FilledMapFieldWells]
    var Legend: js.UndefOr[LegendOptions]
    var MapStyleOptions: js.UndefOr[GeospatialMapStyleOptions]
    var SortConfiguration: js.UndefOr[FilledMapSortConfiguration]
    var Tooltip: js.UndefOr[TooltipOptions]
    var WindowOptions: js.UndefOr[GeospatialWindowOptions]
  }

  object FilledMapConfiguration {
    @inline
    def apply(
        FieldWells: js.UndefOr[FilledMapFieldWells] = js.undefined,
        Legend: js.UndefOr[LegendOptions] = js.undefined,
        MapStyleOptions: js.UndefOr[GeospatialMapStyleOptions] = js.undefined,
        SortConfiguration: js.UndefOr[FilledMapSortConfiguration] = js.undefined,
        Tooltip: js.UndefOr[TooltipOptions] = js.undefined,
        WindowOptions: js.UndefOr[GeospatialWindowOptions] = js.undefined
    ): FilledMapConfiguration = {
      val __obj = js.Dynamic.literal()
      FieldWells.foreach(__v => __obj.updateDynamic("FieldWells")(__v.asInstanceOf[js.Any]))
      Legend.foreach(__v => __obj.updateDynamic("Legend")(__v.asInstanceOf[js.Any]))
      MapStyleOptions.foreach(__v => __obj.updateDynamic("MapStyleOptions")(__v.asInstanceOf[js.Any]))
      SortConfiguration.foreach(__v => __obj.updateDynamic("SortConfiguration")(__v.asInstanceOf[js.Any]))
      Tooltip.foreach(__v => __obj.updateDynamic("Tooltip")(__v.asInstanceOf[js.Any]))
      WindowOptions.foreach(__v => __obj.updateDynamic("WindowOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilledMapConfiguration]
    }
  }

  /** The field wells of a <code>FilledMapVisual</code>. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait FilledMapFieldWells extends js.Object {
    var FilledMapAggregatedFieldWells: js.UndefOr[FilledMapAggregatedFieldWells]
  }

  object FilledMapFieldWells {
    @inline
    def apply(
        FilledMapAggregatedFieldWells: js.UndefOr[FilledMapAggregatedFieldWells] = js.undefined
    ): FilledMapFieldWells = {
      val __obj = js.Dynamic.literal()
      FilledMapAggregatedFieldWells.foreach(__v => __obj.updateDynamic("FilledMapAggregatedFieldWells")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilledMapFieldWells]
    }
  }

  /** The conditional formatting that determines the shape of the filled map.
    */
  @js.native
  trait FilledMapShapeConditionalFormatting extends js.Object {
    var FieldId: FieldId
    var Format: js.UndefOr[ShapeConditionalFormat]
  }

  object FilledMapShapeConditionalFormatting {
    @inline
    def apply(
        FieldId: FieldId,
        Format: js.UndefOr[ShapeConditionalFormat] = js.undefined
    ): FilledMapShapeConditionalFormatting = {
      val __obj = js.Dynamic.literal(
        "FieldId" -> FieldId.asInstanceOf[js.Any]
      )

      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilledMapShapeConditionalFormatting]
    }
  }

  /** The sort configuration of a <code>FilledMapVisual</code>.
    */
  @js.native
  trait FilledMapSortConfiguration extends js.Object {
    var CategorySort: js.UndefOr[FieldSortOptionsList]
  }

  object FilledMapSortConfiguration {
    @inline
    def apply(
        CategorySort: js.UndefOr[FieldSortOptionsList] = js.undefined
    ): FilledMapSortConfiguration = {
      val __obj = js.Dynamic.literal()
      CategorySort.foreach(__v => __obj.updateDynamic("CategorySort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilledMapSortConfiguration]
    }
  }

  /** A filled map. For more information, see [[https://docs.aws.amazon.com/quicksight/latest/user/filled-maps.html|Creating filled maps]] in the <i>Amazon QuickSight User Guide</i>.
    */
  @js.native
  trait FilledMapVisual extends js.Object {
    var VisualId: ShortRestrictiveResourceId
    var Actions: js.UndefOr[VisualCustomActionList]
    var ChartConfiguration: js.UndefOr[FilledMapConfiguration]
    var ColumnHierarchies: js.UndefOr[ColumnHierarchyList]
    var ConditionalFormatting: js.UndefOr[FilledMapConditionalFormatting]
    var Subtitle: js.UndefOr[VisualSubtitleLabelOptions]
    var Title: js.UndefOr[VisualTitleLabelOptions]
  }

  object FilledMapVisual {
    @inline
    def apply(
        VisualId: ShortRestrictiveResourceId,
        Actions: js.UndefOr[VisualCustomActionList] = js.undefined,
        ChartConfiguration: js.UndefOr[FilledMapConfiguration] = js.undefined,
        ColumnHierarchies: js.UndefOr[ColumnHierarchyList] = js.undefined,
        ConditionalFormatting: js.UndefOr[FilledMapConditionalFormatting] = js.undefined,
        Subtitle: js.UndefOr[VisualSubtitleLabelOptions] = js.undefined,
        Title: js.UndefOr[VisualTitleLabelOptions] = js.undefined
    ): FilledMapVisual = {
      val __obj = js.Dynamic.literal(
        "VisualId" -> VisualId.asInstanceOf[js.Any]
      )

      Actions.foreach(__v => __obj.updateDynamic("Actions")(__v.asInstanceOf[js.Any]))
      ChartConfiguration.foreach(__v => __obj.updateDynamic("ChartConfiguration")(__v.asInstanceOf[js.Any]))
      ColumnHierarchies.foreach(__v => __obj.updateDynamic("ColumnHierarchies")(__v.asInstanceOf[js.Any]))
      ConditionalFormatting.foreach(__v => __obj.updateDynamic("ConditionalFormatting")(__v.asInstanceOf[js.Any]))
      Subtitle.foreach(__v => __obj.updateDynamic("Subtitle")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilledMapVisual]
    }
  }

  /** With a <code>Filter</code>, you can remove portions of data from a particular visual or view. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait Filter extends js.Object {
    var CategoryFilter: js.UndefOr[CategoryFilter]
    var NumericEqualityFilter: js.UndefOr[NumericEqualityFilter]
    var NumericRangeFilter: js.UndefOr[NumericRangeFilter]
    var RelativeDatesFilter: js.UndefOr[RelativeDatesFilter]
    var TimeEqualityFilter: js.UndefOr[TimeEqualityFilter]
    var TimeRangeFilter: js.UndefOr[TimeRangeFilter]
    var TopBottomFilter: js.UndefOr[TopBottomFilter]
  }

  object Filter {
    @inline
    def apply(
        CategoryFilter: js.UndefOr[CategoryFilter] = js.undefined,
        NumericEqualityFilter: js.UndefOr[NumericEqualityFilter] = js.undefined,
        NumericRangeFilter: js.UndefOr[NumericRangeFilter] = js.undefined,
        RelativeDatesFilter: js.UndefOr[RelativeDatesFilter] = js.undefined,
        TimeEqualityFilter: js.UndefOr[TimeEqualityFilter] = js.undefined,
        TimeRangeFilter: js.UndefOr[TimeRangeFilter] = js.undefined,
        TopBottomFilter: js.UndefOr[TopBottomFilter] = js.undefined
    ): Filter = {
      val __obj = js.Dynamic.literal()
      CategoryFilter.foreach(__v => __obj.updateDynamic("CategoryFilter")(__v.asInstanceOf[js.Any]))
      NumericEqualityFilter.foreach(__v => __obj.updateDynamic("NumericEqualityFilter")(__v.asInstanceOf[js.Any]))
      NumericRangeFilter.foreach(__v => __obj.updateDynamic("NumericRangeFilter")(__v.asInstanceOf[js.Any]))
      RelativeDatesFilter.foreach(__v => __obj.updateDynamic("RelativeDatesFilter")(__v.asInstanceOf[js.Any]))
      TimeEqualityFilter.foreach(__v => __obj.updateDynamic("TimeEqualityFilter")(__v.asInstanceOf[js.Any]))
      TimeRangeFilter.foreach(__v => __obj.updateDynamic("TimeRangeFilter")(__v.asInstanceOf[js.Any]))
      TopBottomFilter.foreach(__v => __obj.updateDynamic("TopBottomFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Filter]
    }
  }

  /** The control of a filter that is used to interact with a dashboard or an analysis. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait FilterControl extends js.Object {
    var DateTimePicker: js.UndefOr[FilterDateTimePickerControl]
    var Dropdown: js.UndefOr[FilterDropDownControl]
    var List: js.UndefOr[FilterListControl]
    var RelativeDateTime: js.UndefOr[FilterRelativeDateTimeControl]
    var Slider: js.UndefOr[FilterSliderControl]
    var TextArea: js.UndefOr[FilterTextAreaControl]
    var TextField: js.UndefOr[FilterTextFieldControl]
  }

  object FilterControl {
    @inline
    def apply(
        DateTimePicker: js.UndefOr[FilterDateTimePickerControl] = js.undefined,
        Dropdown: js.UndefOr[FilterDropDownControl] = js.undefined,
        List: js.UndefOr[FilterListControl] = js.undefined,
        RelativeDateTime: js.UndefOr[FilterRelativeDateTimeControl] = js.undefined,
        Slider: js.UndefOr[FilterSliderControl] = js.undefined,
        TextArea: js.UndefOr[FilterTextAreaControl] = js.undefined,
        TextField: js.UndefOr[FilterTextFieldControl] = js.undefined
    ): FilterControl = {
      val __obj = js.Dynamic.literal()
      DateTimePicker.foreach(__v => __obj.updateDynamic("DateTimePicker")(__v.asInstanceOf[js.Any]))
      Dropdown.foreach(__v => __obj.updateDynamic("Dropdown")(__v.asInstanceOf[js.Any]))
      List.foreach(__v => __obj.updateDynamic("List")(__v.asInstanceOf[js.Any]))
      RelativeDateTime.foreach(__v => __obj.updateDynamic("RelativeDateTime")(__v.asInstanceOf[js.Any]))
      Slider.foreach(__v => __obj.updateDynamic("Slider")(__v.asInstanceOf[js.Any]))
      TextArea.foreach(__v => __obj.updateDynamic("TextArea")(__v.asInstanceOf[js.Any]))
      TextField.foreach(__v => __obj.updateDynamic("TextField")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilterControl]
    }
  }

  /** A control from a date filter that is used to specify date and time.
    */
  @js.native
  trait FilterDateTimePickerControl extends js.Object {
    var FilterControlId: ShortRestrictiveResourceId
    var SourceFilterId: ShortRestrictiveResourceId
    var Title: SheetControlTitle
    var DisplayOptions: js.UndefOr[DateTimePickerControlDisplayOptions]
    var Type: js.UndefOr[SheetControlDateTimePickerType]
  }

  object FilterDateTimePickerControl {
    @inline
    def apply(
        FilterControlId: ShortRestrictiveResourceId,
        SourceFilterId: ShortRestrictiveResourceId,
        Title: SheetControlTitle,
        DisplayOptions: js.UndefOr[DateTimePickerControlDisplayOptions] = js.undefined,
        Type: js.UndefOr[SheetControlDateTimePickerType] = js.undefined
    ): FilterDateTimePickerControl = {
      val __obj = js.Dynamic.literal(
        "FilterControlId" -> FilterControlId.asInstanceOf[js.Any],
        "SourceFilterId" -> SourceFilterId.asInstanceOf[js.Any],
        "Title" -> Title.asInstanceOf[js.Any]
      )

      DisplayOptions.foreach(__v => __obj.updateDynamic("DisplayOptions")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilterDateTimePickerControl]
    }
  }

  /** A control to display a dropdown list with buttons that are used to select a single value.
    */
  @js.native
  trait FilterDropDownControl extends js.Object {
    var FilterControlId: ShortRestrictiveResourceId
    var SourceFilterId: ShortRestrictiveResourceId
    var Title: SheetControlTitle
    var CascadingControlConfiguration: js.UndefOr[CascadingControlConfiguration]
    var DisplayOptions: js.UndefOr[DropDownControlDisplayOptions]
    var SelectableValues: js.UndefOr[FilterSelectableValues]
    var Type: js.UndefOr[SheetControlListType]
  }

  object FilterDropDownControl {
    @inline
    def apply(
        FilterControlId: ShortRestrictiveResourceId,
        SourceFilterId: ShortRestrictiveResourceId,
        Title: SheetControlTitle,
        CascadingControlConfiguration: js.UndefOr[CascadingControlConfiguration] = js.undefined,
        DisplayOptions: js.UndefOr[DropDownControlDisplayOptions] = js.undefined,
        SelectableValues: js.UndefOr[FilterSelectableValues] = js.undefined,
        Type: js.UndefOr[SheetControlListType] = js.undefined
    ): FilterDropDownControl = {
      val __obj = js.Dynamic.literal(
        "FilterControlId" -> FilterControlId.asInstanceOf[js.Any],
        "SourceFilterId" -> SourceFilterId.asInstanceOf[js.Any],
        "Title" -> Title.asInstanceOf[js.Any]
      )

      CascadingControlConfiguration.foreach(__v => __obj.updateDynamic("CascadingControlConfiguration")(__v.asInstanceOf[js.Any]))
      DisplayOptions.foreach(__v => __obj.updateDynamic("DisplayOptions")(__v.asInstanceOf[js.Any]))
      SelectableValues.foreach(__v => __obj.updateDynamic("SelectableValues")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilterDropDownControl]
    }
  }

  /** A grouping of individual filters. Filter groups are applied to the same group of visuals. For more information, see [[https://docs.aws.amazon.com/quicksight/latest/user/add-a-compound-filter.html|Adding filter conditions (group filters) with AND and OR operators]] in the <i>Amazon QuickSight User Guide</i>.
    */
  @js.native
  trait FilterGroup extends js.Object {
    var CrossDataset: CrossDatasetTypes
    var FilterGroupId: ShortRestrictiveResourceId
    var Filters: FilterList
    var ScopeConfiguration: FilterScopeConfiguration
    var Status: js.UndefOr[WidgetStatus]
  }

  object FilterGroup {
    @inline
    def apply(
        CrossDataset: CrossDatasetTypes,
        FilterGroupId: ShortRestrictiveResourceId,
        Filters: FilterList,
        ScopeConfiguration: FilterScopeConfiguration,
        Status: js.UndefOr[WidgetStatus] = js.undefined
    ): FilterGroup = {
      val __obj = js.Dynamic.literal(
        "CrossDataset" -> CrossDataset.asInstanceOf[js.Any],
        "FilterGroupId" -> FilterGroupId.asInstanceOf[js.Any],
        "Filters" -> Filters.asInstanceOf[js.Any],
        "ScopeConfiguration" -> ScopeConfiguration.asInstanceOf[js.Any]
      )

      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilterGroup]
    }
  }

  /** A list of filter configurations.
    */
  @js.native
  trait FilterListConfiguration extends js.Object {
    var MatchOperator: CategoryFilterMatchOperator
    var CategoryValues: js.UndefOr[CategoryValueList]
    var SelectAllOptions: js.UndefOr[CategoryFilterSelectAllOptions]
  }

  object FilterListConfiguration {
    @inline
    def apply(
        MatchOperator: CategoryFilterMatchOperator,
        CategoryValues: js.UndefOr[CategoryValueList] = js.undefined,
        SelectAllOptions: js.UndefOr[CategoryFilterSelectAllOptions] = js.undefined
    ): FilterListConfiguration = {
      val __obj = js.Dynamic.literal(
        "MatchOperator" -> MatchOperator.asInstanceOf[js.Any]
      )

      CategoryValues.foreach(__v => __obj.updateDynamic("CategoryValues")(__v.asInstanceOf[js.Any]))
      SelectAllOptions.foreach(__v => __obj.updateDynamic("SelectAllOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilterListConfiguration]
    }
  }

  /** A control to display a list of buttons or boxes. This is used to select either a single value or multiple values.
    */
  @js.native
  trait FilterListControl extends js.Object {
    var FilterControlId: ShortRestrictiveResourceId
    var SourceFilterId: ShortRestrictiveResourceId
    var Title: SheetControlTitle
    var CascadingControlConfiguration: js.UndefOr[CascadingControlConfiguration]
    var DisplayOptions: js.UndefOr[ListControlDisplayOptions]
    var SelectableValues: js.UndefOr[FilterSelectableValues]
    var Type: js.UndefOr[SheetControlListType]
  }

  object FilterListControl {
    @inline
    def apply(
        FilterControlId: ShortRestrictiveResourceId,
        SourceFilterId: ShortRestrictiveResourceId,
        Title: SheetControlTitle,
        CascadingControlConfiguration: js.UndefOr[CascadingControlConfiguration] = js.undefined,
        DisplayOptions: js.UndefOr[ListControlDisplayOptions] = js.undefined,
        SelectableValues: js.UndefOr[FilterSelectableValues] = js.undefined,
        Type: js.UndefOr[SheetControlListType] = js.undefined
    ): FilterListControl = {
      val __obj = js.Dynamic.literal(
        "FilterControlId" -> FilterControlId.asInstanceOf[js.Any],
        "SourceFilterId" -> SourceFilterId.asInstanceOf[js.Any],
        "Title" -> Title.asInstanceOf[js.Any]
      )

      CascadingControlConfiguration.foreach(__v => __obj.updateDynamic("CascadingControlConfiguration")(__v.asInstanceOf[js.Any]))
      DisplayOptions.foreach(__v => __obj.updateDynamic("DisplayOptions")(__v.asInstanceOf[js.Any]))
      SelectableValues.foreach(__v => __obj.updateDynamic("SelectableValues")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilterListControl]
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

  /** The configuration of selected fields in the<code>CustomActionFilterOperation</code>. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait FilterOperationSelectedFieldsConfiguration extends js.Object {
    var SelectedFieldOptions: js.UndefOr[SelectedFieldOptions]
    var SelectedFields: js.UndefOr[SelectedFieldList]
  }

  object FilterOperationSelectedFieldsConfiguration {
    @inline
    def apply(
        SelectedFieldOptions: js.UndefOr[SelectedFieldOptions] = js.undefined,
        SelectedFields: js.UndefOr[SelectedFieldList] = js.undefined
    ): FilterOperationSelectedFieldsConfiguration = {
      val __obj = js.Dynamic.literal()
      SelectedFieldOptions.foreach(__v => __obj.updateDynamic("SelectedFieldOptions")(__v.asInstanceOf[js.Any]))
      SelectedFields.foreach(__v => __obj.updateDynamic("SelectedFields")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilterOperationSelectedFieldsConfiguration]
    }
  }

  /** The configuration of target visuals that you want to be filtered. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait FilterOperationTargetVisualsConfiguration extends js.Object {
    var SameSheetTargetVisualConfiguration: js.UndefOr[SameSheetTargetVisualConfiguration]
  }

  object FilterOperationTargetVisualsConfiguration {
    @inline
    def apply(
        SameSheetTargetVisualConfiguration: js.UndefOr[SameSheetTargetVisualConfiguration] = js.undefined
    ): FilterOperationTargetVisualsConfiguration = {
      val __obj = js.Dynamic.literal()
      SameSheetTargetVisualConfiguration.foreach(__v => __obj.updateDynamic("SameSheetTargetVisualConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilterOperationTargetVisualsConfiguration]
    }
  }

  /** A control from a date filter that is used to specify the relative date.
    */
  @js.native
  trait FilterRelativeDateTimeControl extends js.Object {
    var FilterControlId: ShortRestrictiveResourceId
    var SourceFilterId: ShortRestrictiveResourceId
    var Title: SheetControlTitle
    var DisplayOptions: js.UndefOr[RelativeDateTimeControlDisplayOptions]
  }

  object FilterRelativeDateTimeControl {
    @inline
    def apply(
        FilterControlId: ShortRestrictiveResourceId,
        SourceFilterId: ShortRestrictiveResourceId,
        Title: SheetControlTitle,
        DisplayOptions: js.UndefOr[RelativeDateTimeControlDisplayOptions] = js.undefined
    ): FilterRelativeDateTimeControl = {
      val __obj = js.Dynamic.literal(
        "FilterControlId" -> FilterControlId.asInstanceOf[js.Any],
        "SourceFilterId" -> SourceFilterId.asInstanceOf[js.Any],
        "Title" -> Title.asInstanceOf[js.Any]
      )

      DisplayOptions.foreach(__v => __obj.updateDynamic("DisplayOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilterRelativeDateTimeControl]
    }
  }

  /** The scope configuration for a <code>FilterGroup</code>. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait FilterScopeConfiguration extends js.Object {
    var SelectedSheets: js.UndefOr[SelectedSheetsFilterScopeConfiguration]
  }

  object FilterScopeConfiguration {
    @inline
    def apply(
        SelectedSheets: js.UndefOr[SelectedSheetsFilterScopeConfiguration] = js.undefined
    ): FilterScopeConfiguration = {
      val __obj = js.Dynamic.literal()
      SelectedSheets.foreach(__v => __obj.updateDynamic("SelectedSheets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilterScopeConfiguration]
    }
  }

  /** A list of selectable values that are used in a control.
    */
  @js.native
  trait FilterSelectableValues extends js.Object {
    var Values: js.UndefOr[ParameterSelectableValueList]
  }

  object FilterSelectableValues {
    @inline
    def apply(
        Values: js.UndefOr[ParameterSelectableValueList] = js.undefined
    ): FilterSelectableValues = {
      val __obj = js.Dynamic.literal()
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilterSelectableValues]
    }
  }

  /** A control to display a horizontal toggle bar. This is used to change a value by sliding the toggle.
    */
  @js.native
  trait FilterSliderControl extends js.Object {
    var FilterControlId: ShortRestrictiveResourceId
    var MaximumValue: Double
    var MinimumValue: Double
    var SourceFilterId: ShortRestrictiveResourceId
    var StepSize: Double
    var Title: SheetControlTitle
    var DisplayOptions: js.UndefOr[SliderControlDisplayOptions]
    var Type: js.UndefOr[SheetControlSliderType]
  }

  object FilterSliderControl {
    @inline
    def apply(
        FilterControlId: ShortRestrictiveResourceId,
        MaximumValue: Double,
        MinimumValue: Double,
        SourceFilterId: ShortRestrictiveResourceId,
        StepSize: Double,
        Title: SheetControlTitle,
        DisplayOptions: js.UndefOr[SliderControlDisplayOptions] = js.undefined,
        Type: js.UndefOr[SheetControlSliderType] = js.undefined
    ): FilterSliderControl = {
      val __obj = js.Dynamic.literal(
        "FilterControlId" -> FilterControlId.asInstanceOf[js.Any],
        "MaximumValue" -> MaximumValue.asInstanceOf[js.Any],
        "MinimumValue" -> MinimumValue.asInstanceOf[js.Any],
        "SourceFilterId" -> SourceFilterId.asInstanceOf[js.Any],
        "StepSize" -> StepSize.asInstanceOf[js.Any],
        "Title" -> Title.asInstanceOf[js.Any]
      )

      DisplayOptions.foreach(__v => __obj.updateDynamic("DisplayOptions")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilterSliderControl]
    }
  }

  /** A control to display a text box that is used to enter multiple entries.
    */
  @js.native
  trait FilterTextAreaControl extends js.Object {
    var FilterControlId: ShortRestrictiveResourceId
    var SourceFilterId: ShortRestrictiveResourceId
    var Title: SheetControlTitle
    var Delimiter: js.UndefOr[TextAreaControlDelimiter]
    var DisplayOptions: js.UndefOr[TextAreaControlDisplayOptions]
  }

  object FilterTextAreaControl {
    @inline
    def apply(
        FilterControlId: ShortRestrictiveResourceId,
        SourceFilterId: ShortRestrictiveResourceId,
        Title: SheetControlTitle,
        Delimiter: js.UndefOr[TextAreaControlDelimiter] = js.undefined,
        DisplayOptions: js.UndefOr[TextAreaControlDisplayOptions] = js.undefined
    ): FilterTextAreaControl = {
      val __obj = js.Dynamic.literal(
        "FilterControlId" -> FilterControlId.asInstanceOf[js.Any],
        "SourceFilterId" -> SourceFilterId.asInstanceOf[js.Any],
        "Title" -> Title.asInstanceOf[js.Any]
      )

      Delimiter.foreach(__v => __obj.updateDynamic("Delimiter")(__v.asInstanceOf[js.Any]))
      DisplayOptions.foreach(__v => __obj.updateDynamic("DisplayOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilterTextAreaControl]
    }
  }

  /** A control to display a text box that is used to enter a single entry.
    */
  @js.native
  trait FilterTextFieldControl extends js.Object {
    var FilterControlId: ShortRestrictiveResourceId
    var SourceFilterId: ShortRestrictiveResourceId
    var Title: SheetControlTitle
    var DisplayOptions: js.UndefOr[TextFieldControlDisplayOptions]
  }

  object FilterTextFieldControl {
    @inline
    def apply(
        FilterControlId: ShortRestrictiveResourceId,
        SourceFilterId: ShortRestrictiveResourceId,
        Title: SheetControlTitle,
        DisplayOptions: js.UndefOr[TextFieldControlDisplayOptions] = js.undefined
    ): FilterTextFieldControl = {
      val __obj = js.Dynamic.literal(
        "FilterControlId" -> FilterControlId.asInstanceOf[js.Any],
        "SourceFilterId" -> SourceFilterId.asInstanceOf[js.Any],
        "Title" -> Title.asInstanceOf[js.Any]
      )

      DisplayOptions.foreach(__v => __obj.updateDynamic("DisplayOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FilterTextFieldControl]
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

  /** A filter to use to search an Amazon QuickSight folder.
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

  /** Determines the font settings.
    */
  @js.native
  trait Font extends js.Object {
    var FontFamily: js.UndefOr[String]
  }

  object Font {
    @inline
    def apply(
        FontFamily: js.UndefOr[String] = js.undefined
    ): Font = {
      val __obj = js.Dynamic.literal()
      FontFamily.foreach(__v => __obj.updateDynamic("FontFamily")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Font]
    }
  }

  /** Configures the display properties of the given text.
    */
  @js.native
  trait FontConfiguration extends js.Object {
    var FontColor: js.UndefOr[HexColor]
    var FontDecoration: js.UndefOr[FontDecoration]
    var FontSize: js.UndefOr[FontSize]
    var FontStyle: js.UndefOr[FontStyle]
    var FontWeight: js.UndefOr[FontWeight]
  }

  object FontConfiguration {
    @inline
    def apply(
        FontColor: js.UndefOr[HexColor] = js.undefined,
        FontDecoration: js.UndefOr[FontDecoration] = js.undefined,
        FontSize: js.UndefOr[FontSize] = js.undefined,
        FontStyle: js.UndefOr[FontStyle] = js.undefined,
        FontWeight: js.UndefOr[FontWeight] = js.undefined
    ): FontConfiguration = {
      val __obj = js.Dynamic.literal()
      FontColor.foreach(__v => __obj.updateDynamic("FontColor")(__v.asInstanceOf[js.Any]))
      FontDecoration.foreach(__v => __obj.updateDynamic("FontDecoration")(__v.asInstanceOf[js.Any]))
      FontSize.foreach(__v => __obj.updateDynamic("FontSize")(__v.asInstanceOf[js.Any]))
      FontStyle.foreach(__v => __obj.updateDynamic("FontStyle")(__v.asInstanceOf[js.Any]))
      FontWeight.foreach(__v => __obj.updateDynamic("FontWeight")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FontConfiguration]
    }
  }

  /** The option that determines the text display size.
    */
  @js.native
  trait FontSize extends js.Object {
    var Relative: js.UndefOr[RelativeFontSize]
  }

  object FontSize {
    @inline
    def apply(
        Relative: js.UndefOr[RelativeFontSize] = js.undefined
    ): FontSize = {
      val __obj = js.Dynamic.literal()
      Relative.foreach(__v => __obj.updateDynamic("Relative")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FontSize]
    }
  }

  /** The option that determines the text display weight, or boldness.
    */
  @js.native
  trait FontWeight extends js.Object {
    var Name: js.UndefOr[FontWeightName]
  }

  object FontWeight {
    @inline
    def apply(
        Name: js.UndefOr[FontWeightName] = js.undefined
    ): FontWeight = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FontWeight]
    }
  }

  /** The forecast computation configuration.
    */
  @js.native
  trait ForecastComputation extends js.Object {
    var ComputationId: ShortRestrictiveResourceId
    var Time: DimensionField
    var CustomSeasonalityValue: js.UndefOr[ForecastComputationCustomSeasonalityValue]
    var LowerBoundary: js.UndefOr[Double]
    var Name: js.UndefOr[String]
    var PeriodsBackward: js.UndefOr[PeriodsBackward]
    var PeriodsForward: js.UndefOr[PeriodsForward]
    var PredictionInterval: js.UndefOr[PredictionInterval]
    var Seasonality: js.UndefOr[ForecastComputationSeasonality]
    var UpperBoundary: js.UndefOr[Double]
    var Value: js.UndefOr[MeasureField]
  }

  object ForecastComputation {
    @inline
    def apply(
        ComputationId: ShortRestrictiveResourceId,
        Time: DimensionField,
        CustomSeasonalityValue: js.UndefOr[ForecastComputationCustomSeasonalityValue] = js.undefined,
        LowerBoundary: js.UndefOr[Double] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        PeriodsBackward: js.UndefOr[PeriodsBackward] = js.undefined,
        PeriodsForward: js.UndefOr[PeriodsForward] = js.undefined,
        PredictionInterval: js.UndefOr[PredictionInterval] = js.undefined,
        Seasonality: js.UndefOr[ForecastComputationSeasonality] = js.undefined,
        UpperBoundary: js.UndefOr[Double] = js.undefined,
        Value: js.UndefOr[MeasureField] = js.undefined
    ): ForecastComputation = {
      val __obj = js.Dynamic.literal(
        "ComputationId" -> ComputationId.asInstanceOf[js.Any],
        "Time" -> Time.asInstanceOf[js.Any]
      )

      CustomSeasonalityValue.foreach(__v => __obj.updateDynamic("CustomSeasonalityValue")(__v.asInstanceOf[js.Any]))
      LowerBoundary.foreach(__v => __obj.updateDynamic("LowerBoundary")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PeriodsBackward.foreach(__v => __obj.updateDynamic("PeriodsBackward")(__v.asInstanceOf[js.Any]))
      PeriodsForward.foreach(__v => __obj.updateDynamic("PeriodsForward")(__v.asInstanceOf[js.Any]))
      PredictionInterval.foreach(__v => __obj.updateDynamic("PredictionInterval")(__v.asInstanceOf[js.Any]))
      Seasonality.foreach(__v => __obj.updateDynamic("Seasonality")(__v.asInstanceOf[js.Any]))
      UpperBoundary.foreach(__v => __obj.updateDynamic("UpperBoundary")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ForecastComputation]
    }
  }

  /** The forecast configuration that is used in a line chart's display properties.
    */
  @js.native
  trait ForecastConfiguration extends js.Object {
    var ForecastProperties: js.UndefOr[TimeBasedForecastProperties]
    var Scenario: js.UndefOr[ForecastScenario]
  }

  object ForecastConfiguration {
    @inline
    def apply(
        ForecastProperties: js.UndefOr[TimeBasedForecastProperties] = js.undefined,
        Scenario: js.UndefOr[ForecastScenario] = js.undefined
    ): ForecastConfiguration = {
      val __obj = js.Dynamic.literal()
      ForecastProperties.foreach(__v => __obj.updateDynamic("ForecastProperties")(__v.asInstanceOf[js.Any]))
      Scenario.foreach(__v => __obj.updateDynamic("Scenario")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ForecastConfiguration]
    }
  }

  /** The forecast scenario of a forecast in the line chart.
    */
  @js.native
  trait ForecastScenario extends js.Object {
    var WhatIfPointScenario: js.UndefOr[WhatIfPointScenario]
    var WhatIfRangeScenario: js.UndefOr[WhatIfRangeScenario]
  }

  object ForecastScenario {
    @inline
    def apply(
        WhatIfPointScenario: js.UndefOr[WhatIfPointScenario] = js.undefined,
        WhatIfRangeScenario: js.UndefOr[WhatIfRangeScenario] = js.undefined
    ): ForecastScenario = {
      val __obj = js.Dynamic.literal()
      WhatIfPointScenario.foreach(__v => __obj.updateDynamic("WhatIfPointScenario")(__v.asInstanceOf[js.Any]))
      WhatIfRangeScenario.foreach(__v => __obj.updateDynamic("WhatIfRangeScenario")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ForecastScenario]
    }
  }

  /** The formatting configuration for all types of field.
    */
  @js.native
  trait FormatConfiguration extends js.Object {
    var DateTimeFormatConfiguration: js.UndefOr[DateTimeFormatConfiguration]
    var NumberFormatConfiguration: js.UndefOr[NumberFormatConfiguration]
    var StringFormatConfiguration: js.UndefOr[StringFormatConfiguration]
  }

  object FormatConfiguration {
    @inline
    def apply(
        DateTimeFormatConfiguration: js.UndefOr[DateTimeFormatConfiguration] = js.undefined,
        NumberFormatConfiguration: js.UndefOr[NumberFormatConfiguration] = js.undefined,
        StringFormatConfiguration: js.UndefOr[StringFormatConfiguration] = js.undefined
    ): FormatConfiguration = {
      val __obj = js.Dynamic.literal()
      DateTimeFormatConfiguration.foreach(__v => __obj.updateDynamic("DateTimeFormatConfiguration")(__v.asInstanceOf[js.Any]))
      NumberFormatConfiguration.foreach(__v => __obj.updateDynamic("NumberFormatConfiguration")(__v.asInstanceOf[js.Any]))
      StringFormatConfiguration.foreach(__v => __obj.updateDynamic("StringFormatConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FormatConfiguration]
    }
  }

  /** Configuration options for the canvas of a free-form layout.
    */
  @js.native
  trait FreeFormLayoutCanvasSizeOptions extends js.Object {
    var ScreenCanvasSizeOptions: js.UndefOr[FreeFormLayoutScreenCanvasSizeOptions]
  }

  object FreeFormLayoutCanvasSizeOptions {
    @inline
    def apply(
        ScreenCanvasSizeOptions: js.UndefOr[FreeFormLayoutScreenCanvasSizeOptions] = js.undefined
    ): FreeFormLayoutCanvasSizeOptions = {
      val __obj = js.Dynamic.literal()
      ScreenCanvasSizeOptions.foreach(__v => __obj.updateDynamic("ScreenCanvasSizeOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FreeFormLayoutCanvasSizeOptions]
    }
  }

  /** The configuration of a free-form layout.
    */
  @js.native
  trait FreeFormLayoutConfiguration extends js.Object {
    var Elements: FreeFromLayoutElementList
    var CanvasSizeOptions: js.UndefOr[FreeFormLayoutCanvasSizeOptions]
  }

  object FreeFormLayoutConfiguration {
    @inline
    def apply(
        Elements: FreeFromLayoutElementList,
        CanvasSizeOptions: js.UndefOr[FreeFormLayoutCanvasSizeOptions] = js.undefined
    ): FreeFormLayoutConfiguration = {
      val __obj = js.Dynamic.literal(
        "Elements" -> Elements.asInstanceOf[js.Any]
      )

      CanvasSizeOptions.foreach(__v => __obj.updateDynamic("CanvasSizeOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FreeFormLayoutConfiguration]
    }
  }

  /** An element within a free-form layout.
    */
  @js.native
  trait FreeFormLayoutElement extends js.Object {
    var ElementId: ShortRestrictiveResourceId
    var ElementType: LayoutElementType
    var Height: PixelLength
    var Width: PixelLength
    var XAxisLocation: PixelLength
    var YAxisLocation: UnlimitedPixelLength
    var BackgroundStyle: js.UndefOr[FreeFormLayoutElementBackgroundStyle]
    var BorderStyle: js.UndefOr[FreeFormLayoutElementBorderStyle]
    var LoadingAnimation: js.UndefOr[LoadingAnimation]
    var RenderingRules: js.UndefOr[SheetElementRenderingRuleList]
    var SelectedBorderStyle: js.UndefOr[FreeFormLayoutElementBorderStyle]
    var Visibility: js.UndefOr[Visibility]
  }

  object FreeFormLayoutElement {
    @inline
    def apply(
        ElementId: ShortRestrictiveResourceId,
        ElementType: LayoutElementType,
        Height: PixelLength,
        Width: PixelLength,
        XAxisLocation: PixelLength,
        YAxisLocation: UnlimitedPixelLength,
        BackgroundStyle: js.UndefOr[FreeFormLayoutElementBackgroundStyle] = js.undefined,
        BorderStyle: js.UndefOr[FreeFormLayoutElementBorderStyle] = js.undefined,
        LoadingAnimation: js.UndefOr[LoadingAnimation] = js.undefined,
        RenderingRules: js.UndefOr[SheetElementRenderingRuleList] = js.undefined,
        SelectedBorderStyle: js.UndefOr[FreeFormLayoutElementBorderStyle] = js.undefined,
        Visibility: js.UndefOr[Visibility] = js.undefined
    ): FreeFormLayoutElement = {
      val __obj = js.Dynamic.literal(
        "ElementId" -> ElementId.asInstanceOf[js.Any],
        "ElementType" -> ElementType.asInstanceOf[js.Any],
        "Height" -> Height.asInstanceOf[js.Any],
        "Width" -> Width.asInstanceOf[js.Any],
        "XAxisLocation" -> XAxisLocation.asInstanceOf[js.Any],
        "YAxisLocation" -> YAxisLocation.asInstanceOf[js.Any]
      )

      BackgroundStyle.foreach(__v => __obj.updateDynamic("BackgroundStyle")(__v.asInstanceOf[js.Any]))
      BorderStyle.foreach(__v => __obj.updateDynamic("BorderStyle")(__v.asInstanceOf[js.Any]))
      LoadingAnimation.foreach(__v => __obj.updateDynamic("LoadingAnimation")(__v.asInstanceOf[js.Any]))
      RenderingRules.foreach(__v => __obj.updateDynamic("RenderingRules")(__v.asInstanceOf[js.Any]))
      SelectedBorderStyle.foreach(__v => __obj.updateDynamic("SelectedBorderStyle")(__v.asInstanceOf[js.Any]))
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FreeFormLayoutElement]
    }
  }

  /** The background style configuration of a free-form layout element.
    */
  @js.native
  trait FreeFormLayoutElementBackgroundStyle extends js.Object {
    var Color: js.UndefOr[HexColorWithTransparency]
    var Visibility: js.UndefOr[Visibility]
  }

  object FreeFormLayoutElementBackgroundStyle {
    @inline
    def apply(
        Color: js.UndefOr[HexColorWithTransparency] = js.undefined,
        Visibility: js.UndefOr[Visibility] = js.undefined
    ): FreeFormLayoutElementBackgroundStyle = {
      val __obj = js.Dynamic.literal()
      Color.foreach(__v => __obj.updateDynamic("Color")(__v.asInstanceOf[js.Any]))
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FreeFormLayoutElementBackgroundStyle]
    }
  }

  /** The background style configuration of a free-form layout element.
    */
  @js.native
  trait FreeFormLayoutElementBorderStyle extends js.Object {
    var Color: js.UndefOr[HexColorWithTransparency]
    var Visibility: js.UndefOr[Visibility]
  }

  object FreeFormLayoutElementBorderStyle {
    @inline
    def apply(
        Color: js.UndefOr[HexColorWithTransparency] = js.undefined,
        Visibility: js.UndefOr[Visibility] = js.undefined
    ): FreeFormLayoutElementBorderStyle = {
      val __obj = js.Dynamic.literal()
      Color.foreach(__v => __obj.updateDynamic("Color")(__v.asInstanceOf[js.Any]))
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FreeFormLayoutElementBorderStyle]
    }
  }

  /** The options that determine the sizing of the canvas used in a free-form layout.
    */
  @js.native
  trait FreeFormLayoutScreenCanvasSizeOptions extends js.Object {
    var OptimizedViewPortWidth: PixelLength
  }

  object FreeFormLayoutScreenCanvasSizeOptions {
    @inline
    def apply(
        OptimizedViewPortWidth: PixelLength
    ): FreeFormLayoutScreenCanvasSizeOptions = {
      val __obj = js.Dynamic.literal(
        "OptimizedViewPortWidth" -> OptimizedViewPortWidth.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FreeFormLayoutScreenCanvasSizeOptions]
    }
  }

  /** The free-form layout configuration of a section.
    */
  @js.native
  trait FreeFormSectionLayoutConfiguration extends js.Object {
    var Elements: FreeFromLayoutElementList
  }

  object FreeFormSectionLayoutConfiguration {
    @inline
    def apply(
        Elements: FreeFromLayoutElementList
    ): FreeFormSectionLayoutConfiguration = {
      val __obj = js.Dynamic.literal(
        "Elements" -> Elements.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FreeFormSectionLayoutConfiguration]
    }
  }

  /** The field well configuration of a <code>FunnelChartVisual</code>.
    */
  @js.native
  trait FunnelChartAggregatedFieldWells extends js.Object {
    var Category: js.UndefOr[FunnelChartDimensionFieldList]
    var Values: js.UndefOr[FunnelChartMeasureFieldList]
  }

  object FunnelChartAggregatedFieldWells {
    @inline
    def apply(
        Category: js.UndefOr[FunnelChartDimensionFieldList] = js.undefined,
        Values: js.UndefOr[FunnelChartMeasureFieldList] = js.undefined
    ): FunnelChartAggregatedFieldWells = {
      val __obj = js.Dynamic.literal()
      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FunnelChartAggregatedFieldWells]
    }
  }

  /** The configuration of a <code>FunnelChartVisual</code>.
    */
  @js.native
  trait FunnelChartConfiguration extends js.Object {
    var CategoryLabelOptions: js.UndefOr[ChartAxisLabelOptions]
    var DataLabelOptions: js.UndefOr[FunnelChartDataLabelOptions]
    var FieldWells: js.UndefOr[FunnelChartFieldWells]
    var SortConfiguration: js.UndefOr[FunnelChartSortConfiguration]
    var Tooltip: js.UndefOr[TooltipOptions]
    var ValueLabelOptions: js.UndefOr[ChartAxisLabelOptions]
    var VisualPalette: js.UndefOr[VisualPalette]
  }

  object FunnelChartConfiguration {
    @inline
    def apply(
        CategoryLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined,
        DataLabelOptions: js.UndefOr[FunnelChartDataLabelOptions] = js.undefined,
        FieldWells: js.UndefOr[FunnelChartFieldWells] = js.undefined,
        SortConfiguration: js.UndefOr[FunnelChartSortConfiguration] = js.undefined,
        Tooltip: js.UndefOr[TooltipOptions] = js.undefined,
        ValueLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined,
        VisualPalette: js.UndefOr[VisualPalette] = js.undefined
    ): FunnelChartConfiguration = {
      val __obj = js.Dynamic.literal()
      CategoryLabelOptions.foreach(__v => __obj.updateDynamic("CategoryLabelOptions")(__v.asInstanceOf[js.Any]))
      DataLabelOptions.foreach(__v => __obj.updateDynamic("DataLabelOptions")(__v.asInstanceOf[js.Any]))
      FieldWells.foreach(__v => __obj.updateDynamic("FieldWells")(__v.asInstanceOf[js.Any]))
      SortConfiguration.foreach(__v => __obj.updateDynamic("SortConfiguration")(__v.asInstanceOf[js.Any]))
      Tooltip.foreach(__v => __obj.updateDynamic("Tooltip")(__v.asInstanceOf[js.Any]))
      ValueLabelOptions.foreach(__v => __obj.updateDynamic("ValueLabelOptions")(__v.asInstanceOf[js.Any]))
      VisualPalette.foreach(__v => __obj.updateDynamic("VisualPalette")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FunnelChartConfiguration]
    }
  }

  /** The options that determine the presentation of the data labels.
    */
  @js.native
  trait FunnelChartDataLabelOptions extends js.Object {
    var CategoryLabelVisibility: js.UndefOr[Visibility]
    var LabelColor: js.UndefOr[HexColor]
    var LabelFontConfiguration: js.UndefOr[FontConfiguration]
    var MeasureDataLabelStyle: js.UndefOr[FunnelChartMeasureDataLabelStyle]
    var MeasureLabelVisibility: js.UndefOr[Visibility]
    var Position: js.UndefOr[DataLabelPosition]
    var Visibility: js.UndefOr[Visibility]
  }

  object FunnelChartDataLabelOptions {
    @inline
    def apply(
        CategoryLabelVisibility: js.UndefOr[Visibility] = js.undefined,
        LabelColor: js.UndefOr[HexColor] = js.undefined,
        LabelFontConfiguration: js.UndefOr[FontConfiguration] = js.undefined,
        MeasureDataLabelStyle: js.UndefOr[FunnelChartMeasureDataLabelStyle] = js.undefined,
        MeasureLabelVisibility: js.UndefOr[Visibility] = js.undefined,
        Position: js.UndefOr[DataLabelPosition] = js.undefined,
        Visibility: js.UndefOr[Visibility] = js.undefined
    ): FunnelChartDataLabelOptions = {
      val __obj = js.Dynamic.literal()
      CategoryLabelVisibility.foreach(__v => __obj.updateDynamic("CategoryLabelVisibility")(__v.asInstanceOf[js.Any]))
      LabelColor.foreach(__v => __obj.updateDynamic("LabelColor")(__v.asInstanceOf[js.Any]))
      LabelFontConfiguration.foreach(__v => __obj.updateDynamic("LabelFontConfiguration")(__v.asInstanceOf[js.Any]))
      MeasureDataLabelStyle.foreach(__v => __obj.updateDynamic("MeasureDataLabelStyle")(__v.asInstanceOf[js.Any]))
      MeasureLabelVisibility.foreach(__v => __obj.updateDynamic("MeasureLabelVisibility")(__v.asInstanceOf[js.Any]))
      Position.foreach(__v => __obj.updateDynamic("Position")(__v.asInstanceOf[js.Any]))
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FunnelChartDataLabelOptions]
    }
  }

  /** The field well configuration of a <code>FunnelChartVisual</code>. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait FunnelChartFieldWells extends js.Object {
    var FunnelChartAggregatedFieldWells: js.UndefOr[FunnelChartAggregatedFieldWells]
  }

  object FunnelChartFieldWells {
    @inline
    def apply(
        FunnelChartAggregatedFieldWells: js.UndefOr[FunnelChartAggregatedFieldWells] = js.undefined
    ): FunnelChartFieldWells = {
      val __obj = js.Dynamic.literal()
      FunnelChartAggregatedFieldWells.foreach(__v => __obj.updateDynamic("FunnelChartAggregatedFieldWells")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FunnelChartFieldWells]
    }
  }

  /** The sort configuration of a <code>FunnelChartVisual</code>.
    */
  @js.native
  trait FunnelChartSortConfiguration extends js.Object {
    var CategoryItemsLimit: js.UndefOr[ItemsLimitConfiguration]
    var CategorySort: js.UndefOr[FieldSortOptionsList]
  }

  object FunnelChartSortConfiguration {
    @inline
    def apply(
        CategoryItemsLimit: js.UndefOr[ItemsLimitConfiguration] = js.undefined,
        CategorySort: js.UndefOr[FieldSortOptionsList] = js.undefined
    ): FunnelChartSortConfiguration = {
      val __obj = js.Dynamic.literal()
      CategoryItemsLimit.foreach(__v => __obj.updateDynamic("CategoryItemsLimit")(__v.asInstanceOf[js.Any]))
      CategorySort.foreach(__v => __obj.updateDynamic("CategorySort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FunnelChartSortConfiguration]
    }
  }

  /** A funnel chart. For more information, see [[https://docs.aws.amazon.com/quicksight/latest/user/funnel-visual-content.html|Using funnel charts]] in the <i>Amazon QuickSight User Guide</i>.
    */
  @js.native
  trait FunnelChartVisual extends js.Object {
    var VisualId: ShortRestrictiveResourceId
    var Actions: js.UndefOr[VisualCustomActionList]
    var ChartConfiguration: js.UndefOr[FunnelChartConfiguration]
    var ColumnHierarchies: js.UndefOr[ColumnHierarchyList]
    var Subtitle: js.UndefOr[VisualSubtitleLabelOptions]
    var Title: js.UndefOr[VisualTitleLabelOptions]
  }

  object FunnelChartVisual {
    @inline
    def apply(
        VisualId: ShortRestrictiveResourceId,
        Actions: js.UndefOr[VisualCustomActionList] = js.undefined,
        ChartConfiguration: js.UndefOr[FunnelChartConfiguration] = js.undefined,
        ColumnHierarchies: js.UndefOr[ColumnHierarchyList] = js.undefined,
        Subtitle: js.UndefOr[VisualSubtitleLabelOptions] = js.undefined,
        Title: js.UndefOr[VisualTitleLabelOptions] = js.undefined
    ): FunnelChartVisual = {
      val __obj = js.Dynamic.literal(
        "VisualId" -> VisualId.asInstanceOf[js.Any]
      )

      Actions.foreach(__v => __obj.updateDynamic("Actions")(__v.asInstanceOf[js.Any]))
      ChartConfiguration.foreach(__v => __obj.updateDynamic("ChartConfiguration")(__v.asInstanceOf[js.Any]))
      ColumnHierarchies.foreach(__v => __obj.updateDynamic("ColumnHierarchies")(__v.asInstanceOf[js.Any]))
      Subtitle.foreach(__v => __obj.updateDynamic("Subtitle")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FunnelChartVisual]
    }
  }

  /** The options that determine the presentation of the arc of a <code>GaugeChartVisual</code>.
    */
  @js.native
  trait GaugeChartArcConditionalFormatting extends js.Object {
    var ForegroundColor: js.UndefOr[ConditionalFormattingColor]
  }

  object GaugeChartArcConditionalFormatting {
    @inline
    def apply(
        ForegroundColor: js.UndefOr[ConditionalFormattingColor] = js.undefined
    ): GaugeChartArcConditionalFormatting = {
      val __obj = js.Dynamic.literal()
      ForegroundColor.foreach(__v => __obj.updateDynamic("ForegroundColor")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GaugeChartArcConditionalFormatting]
    }
  }

  /** The conditional formatting of a <code>GaugeChartVisual</code>.
    */
  @js.native
  trait GaugeChartConditionalFormatting extends js.Object {
    var ConditionalFormattingOptions: js.UndefOr[GaugeChartConditionalFormattingOptionList]
  }

  object GaugeChartConditionalFormatting {
    @inline
    def apply(
        ConditionalFormattingOptions: js.UndefOr[GaugeChartConditionalFormattingOptionList] = js.undefined
    ): GaugeChartConditionalFormatting = {
      val __obj = js.Dynamic.literal()
      ConditionalFormattingOptions.foreach(__v => __obj.updateDynamic("ConditionalFormattingOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GaugeChartConditionalFormatting]
    }
  }

  /** Conditional formatting options of a <code>GaugeChartVisual</code>.
    */
  @js.native
  trait GaugeChartConditionalFormattingOption extends js.Object {
    var Arc: js.UndefOr[GaugeChartArcConditionalFormatting]
    var PrimaryValue: js.UndefOr[GaugeChartPrimaryValueConditionalFormatting]
  }

  object GaugeChartConditionalFormattingOption {
    @inline
    def apply(
        Arc: js.UndefOr[GaugeChartArcConditionalFormatting] = js.undefined,
        PrimaryValue: js.UndefOr[GaugeChartPrimaryValueConditionalFormatting] = js.undefined
    ): GaugeChartConditionalFormattingOption = {
      val __obj = js.Dynamic.literal()
      Arc.foreach(__v => __obj.updateDynamic("Arc")(__v.asInstanceOf[js.Any]))
      PrimaryValue.foreach(__v => __obj.updateDynamic("PrimaryValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GaugeChartConditionalFormattingOption]
    }
  }

  /** The configuration of a <code>GaugeChartVisual</code>.
    */
  @js.native
  trait GaugeChartConfiguration extends js.Object {
    var DataLabels: js.UndefOr[DataLabelOptions]
    var FieldWells: js.UndefOr[GaugeChartFieldWells]
    var GaugeChartOptions: js.UndefOr[GaugeChartOptions]
    var TooltipOptions: js.UndefOr[TooltipOptions]
    var VisualPalette: js.UndefOr[VisualPalette]
  }

  object GaugeChartConfiguration {
    @inline
    def apply(
        DataLabels: js.UndefOr[DataLabelOptions] = js.undefined,
        FieldWells: js.UndefOr[GaugeChartFieldWells] = js.undefined,
        GaugeChartOptions: js.UndefOr[GaugeChartOptions] = js.undefined,
        TooltipOptions: js.UndefOr[TooltipOptions] = js.undefined,
        VisualPalette: js.UndefOr[VisualPalette] = js.undefined
    ): GaugeChartConfiguration = {
      val __obj = js.Dynamic.literal()
      DataLabels.foreach(__v => __obj.updateDynamic("DataLabels")(__v.asInstanceOf[js.Any]))
      FieldWells.foreach(__v => __obj.updateDynamic("FieldWells")(__v.asInstanceOf[js.Any]))
      GaugeChartOptions.foreach(__v => __obj.updateDynamic("GaugeChartOptions")(__v.asInstanceOf[js.Any]))
      TooltipOptions.foreach(__v => __obj.updateDynamic("TooltipOptions")(__v.asInstanceOf[js.Any]))
      VisualPalette.foreach(__v => __obj.updateDynamic("VisualPalette")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GaugeChartConfiguration]
    }
  }

  /** The field well configuration of a <code>GaugeChartVisual</code>.
    */
  @js.native
  trait GaugeChartFieldWells extends js.Object {
    var TargetValues: js.UndefOr[MeasureFieldList]
    var Values: js.UndefOr[MeasureFieldList]
  }

  object GaugeChartFieldWells {
    @inline
    def apply(
        TargetValues: js.UndefOr[MeasureFieldList] = js.undefined,
        Values: js.UndefOr[MeasureFieldList] = js.undefined
    ): GaugeChartFieldWells = {
      val __obj = js.Dynamic.literal()
      TargetValues.foreach(__v => __obj.updateDynamic("TargetValues")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GaugeChartFieldWells]
    }
  }

  /** The options that determine the presentation of the <code>GaugeChartVisual</code>.
    */
  @js.native
  trait GaugeChartOptions extends js.Object {
    var Arc: js.UndefOr[ArcConfiguration]
    var ArcAxis: js.UndefOr[ArcAxisConfiguration]
    var Comparison: js.UndefOr[ComparisonConfiguration]
    var PrimaryValueDisplayType: js.UndefOr[PrimaryValueDisplayType]
    var PrimaryValueFontConfiguration: js.UndefOr[FontConfiguration]
  }

  object GaugeChartOptions {
    @inline
    def apply(
        Arc: js.UndefOr[ArcConfiguration] = js.undefined,
        ArcAxis: js.UndefOr[ArcAxisConfiguration] = js.undefined,
        Comparison: js.UndefOr[ComparisonConfiguration] = js.undefined,
        PrimaryValueDisplayType: js.UndefOr[PrimaryValueDisplayType] = js.undefined,
        PrimaryValueFontConfiguration: js.UndefOr[FontConfiguration] = js.undefined
    ): GaugeChartOptions = {
      val __obj = js.Dynamic.literal()
      Arc.foreach(__v => __obj.updateDynamic("Arc")(__v.asInstanceOf[js.Any]))
      ArcAxis.foreach(__v => __obj.updateDynamic("ArcAxis")(__v.asInstanceOf[js.Any]))
      Comparison.foreach(__v => __obj.updateDynamic("Comparison")(__v.asInstanceOf[js.Any]))
      PrimaryValueDisplayType.foreach(__v => __obj.updateDynamic("PrimaryValueDisplayType")(__v.asInstanceOf[js.Any]))
      PrimaryValueFontConfiguration.foreach(__v => __obj.updateDynamic("PrimaryValueFontConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GaugeChartOptions]
    }
  }

  /** The conditional formatting for the primary value of a <code>GaugeChartVisual</code>.
    */
  @js.native
  trait GaugeChartPrimaryValueConditionalFormatting extends js.Object {
    var Icon: js.UndefOr[ConditionalFormattingIcon]
    var TextColor: js.UndefOr[ConditionalFormattingColor]
  }

  object GaugeChartPrimaryValueConditionalFormatting {
    @inline
    def apply(
        Icon: js.UndefOr[ConditionalFormattingIcon] = js.undefined,
        TextColor: js.UndefOr[ConditionalFormattingColor] = js.undefined
    ): GaugeChartPrimaryValueConditionalFormatting = {
      val __obj = js.Dynamic.literal()
      Icon.foreach(__v => __obj.updateDynamic("Icon")(__v.asInstanceOf[js.Any]))
      TextColor.foreach(__v => __obj.updateDynamic("TextColor")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GaugeChartPrimaryValueConditionalFormatting]
    }
  }

  /** A gauge chart. For more information, see [[https://docs.aws.amazon.com/quicksight/latest/user/gauge-chart.html|Using gauge charts]] in the <i>Amazon QuickSight User Guide</i>.
    */
  @js.native
  trait GaugeChartVisual extends js.Object {
    var VisualId: ShortRestrictiveResourceId
    var Actions: js.UndefOr[VisualCustomActionList]
    var ChartConfiguration: js.UndefOr[GaugeChartConfiguration]
    var ConditionalFormatting: js.UndefOr[GaugeChartConditionalFormatting]
    var Subtitle: js.UndefOr[VisualSubtitleLabelOptions]
    var Title: js.UndefOr[VisualTitleLabelOptions]
  }

  object GaugeChartVisual {
    @inline
    def apply(
        VisualId: ShortRestrictiveResourceId,
        Actions: js.UndefOr[VisualCustomActionList] = js.undefined,
        ChartConfiguration: js.UndefOr[GaugeChartConfiguration] = js.undefined,
        ConditionalFormatting: js.UndefOr[GaugeChartConditionalFormatting] = js.undefined,
        Subtitle: js.UndefOr[VisualSubtitleLabelOptions] = js.undefined,
        Title: js.UndefOr[VisualTitleLabelOptions] = js.undefined
    ): GaugeChartVisual = {
      val __obj = js.Dynamic.literal(
        "VisualId" -> VisualId.asInstanceOf[js.Any]
      )

      Actions.foreach(__v => __obj.updateDynamic("Actions")(__v.asInstanceOf[js.Any]))
      ChartConfiguration.foreach(__v => __obj.updateDynamic("ChartConfiguration")(__v.asInstanceOf[js.Any]))
      ConditionalFormatting.foreach(__v => __obj.updateDynamic("ConditionalFormatting")(__v.asInstanceOf[js.Any]))
      Subtitle.foreach(__v => __obj.updateDynamic("Subtitle")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GaugeChartVisual]
    }
  }

  @js.native
  trait GenerateEmbedUrlForAnonymousUserRequest extends js.Object {
    var AuthorizedResourceArns: ArnList
    var AwsAccountId: AwsAccountId
    var ExperienceConfiguration: AnonymousUserEmbeddingExperienceConfiguration
    var Namespace: Namespace
    var AllowedDomains: js.UndefOr[StringList]
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
        AllowedDomains: js.UndefOr[StringList] = js.undefined,
        SessionLifetimeInMinutes: js.UndefOr[SessionLifetimeInMinutes] = js.undefined,
        SessionTags: js.UndefOr[SessionTagList] = js.undefined
    ): GenerateEmbedUrlForAnonymousUserRequest = {
      val __obj = js.Dynamic.literal(
        "AuthorizedResourceArns" -> AuthorizedResourceArns.asInstanceOf[js.Any],
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "ExperienceConfiguration" -> ExperienceConfiguration.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any]
      )

      AllowedDomains.foreach(__v => __obj.updateDynamic("AllowedDomains")(__v.asInstanceOf[js.Any]))
      SessionLifetimeInMinutes.foreach(__v => __obj.updateDynamic("SessionLifetimeInMinutes")(__v.asInstanceOf[js.Any]))
      SessionTags.foreach(__v => __obj.updateDynamic("SessionTags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GenerateEmbedUrlForAnonymousUserRequest]
    }
  }

  @js.native
  trait GenerateEmbedUrlForAnonymousUserResponse extends js.Object {
    var AnonymousUserArn: Arn
    var EmbedUrl: EmbeddingUrl
    var RequestId: String
    var Status: StatusCode
  }

  object GenerateEmbedUrlForAnonymousUserResponse {
    @inline
    def apply(
        AnonymousUserArn: Arn,
        EmbedUrl: EmbeddingUrl,
        RequestId: String,
        Status: StatusCode
    ): GenerateEmbedUrlForAnonymousUserResponse = {
      val __obj = js.Dynamic.literal(
        "AnonymousUserArn" -> AnonymousUserArn.asInstanceOf[js.Any],
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
    var AllowedDomains: js.UndefOr[StringList]
    var SessionLifetimeInMinutes: js.UndefOr[SessionLifetimeInMinutes]
  }

  object GenerateEmbedUrlForRegisteredUserRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        ExperienceConfiguration: RegisteredUserEmbeddingExperienceConfiguration,
        UserArn: Arn,
        AllowedDomains: js.UndefOr[StringList] = js.undefined,
        SessionLifetimeInMinutes: js.UndefOr[SessionLifetimeInMinutes] = js.undefined
    ): GenerateEmbedUrlForRegisteredUserRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "ExperienceConfiguration" -> ExperienceConfiguration.asInstanceOf[js.Any],
        "UserArn" -> UserArn.asInstanceOf[js.Any]
      )

      AllowedDomains.foreach(__v => __obj.updateDynamic("AllowedDomains")(__v.asInstanceOf[js.Any]))
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
    var Name: ColumnGroupName
    var CountryCode: js.UndefOr[GeoSpatialCountryCode]
  }

  object GeoSpatialColumnGroup {
    @inline
    def apply(
        Columns: ColumnList,
        Name: ColumnGroupName,
        CountryCode: js.UndefOr[GeoSpatialCountryCode] = js.undefined
    ): GeoSpatialColumnGroup = {
      val __obj = js.Dynamic.literal(
        "Columns" -> Columns.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CountryCode.foreach(__v => __obj.updateDynamic("CountryCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GeoSpatialColumnGroup]
    }
  }

  /** The bound options (north, south, west, east) of the geospatial window options.
    */
  @js.native
  trait GeospatialCoordinateBounds extends js.Object {
    var East: Longitude
    var North: Latitude
    var South: Latitude
    var West: Longitude
  }

  object GeospatialCoordinateBounds {
    @inline
    def apply(
        East: Longitude,
        North: Latitude,
        South: Latitude,
        West: Longitude
    ): GeospatialCoordinateBounds = {
      val __obj = js.Dynamic.literal(
        "East" -> East.asInstanceOf[js.Any],
        "North" -> North.asInstanceOf[js.Any],
        "South" -> South.asInstanceOf[js.Any],
        "West" -> West.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GeospatialCoordinateBounds]
    }
  }

  /** The aggregated field wells for a geospatial map.
    */
  @js.native
  trait GeospatialMapAggregatedFieldWells extends js.Object {
    var Colors: js.UndefOr[DimensionFieldList]
    var Geospatial: js.UndefOr[DimensionFieldList]
    var Values: js.UndefOr[MeasureFieldList]
  }

  object GeospatialMapAggregatedFieldWells {
    @inline
    def apply(
        Colors: js.UndefOr[DimensionFieldList] = js.undefined,
        Geospatial: js.UndefOr[DimensionFieldList] = js.undefined,
        Values: js.UndefOr[MeasureFieldList] = js.undefined
    ): GeospatialMapAggregatedFieldWells = {
      val __obj = js.Dynamic.literal()
      Colors.foreach(__v => __obj.updateDynamic("Colors")(__v.asInstanceOf[js.Any]))
      Geospatial.foreach(__v => __obj.updateDynamic("Geospatial")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GeospatialMapAggregatedFieldWells]
    }
  }

  /** The configuration of a <code>GeospatialMapVisual</code>.
    */
  @js.native
  trait GeospatialMapConfiguration extends js.Object {
    var FieldWells: js.UndefOr[GeospatialMapFieldWells]
    var Legend: js.UndefOr[LegendOptions]
    var MapStyleOptions: js.UndefOr[GeospatialMapStyleOptions]
    var PointStyleOptions: js.UndefOr[GeospatialPointStyleOptions]
    var Tooltip: js.UndefOr[TooltipOptions]
    var VisualPalette: js.UndefOr[VisualPalette]
    var WindowOptions: js.UndefOr[GeospatialWindowOptions]
  }

  object GeospatialMapConfiguration {
    @inline
    def apply(
        FieldWells: js.UndefOr[GeospatialMapFieldWells] = js.undefined,
        Legend: js.UndefOr[LegendOptions] = js.undefined,
        MapStyleOptions: js.UndefOr[GeospatialMapStyleOptions] = js.undefined,
        PointStyleOptions: js.UndefOr[GeospatialPointStyleOptions] = js.undefined,
        Tooltip: js.UndefOr[TooltipOptions] = js.undefined,
        VisualPalette: js.UndefOr[VisualPalette] = js.undefined,
        WindowOptions: js.UndefOr[GeospatialWindowOptions] = js.undefined
    ): GeospatialMapConfiguration = {
      val __obj = js.Dynamic.literal()
      FieldWells.foreach(__v => __obj.updateDynamic("FieldWells")(__v.asInstanceOf[js.Any]))
      Legend.foreach(__v => __obj.updateDynamic("Legend")(__v.asInstanceOf[js.Any]))
      MapStyleOptions.foreach(__v => __obj.updateDynamic("MapStyleOptions")(__v.asInstanceOf[js.Any]))
      PointStyleOptions.foreach(__v => __obj.updateDynamic("PointStyleOptions")(__v.asInstanceOf[js.Any]))
      Tooltip.foreach(__v => __obj.updateDynamic("Tooltip")(__v.asInstanceOf[js.Any]))
      VisualPalette.foreach(__v => __obj.updateDynamic("VisualPalette")(__v.asInstanceOf[js.Any]))
      WindowOptions.foreach(__v => __obj.updateDynamic("WindowOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GeospatialMapConfiguration]
    }
  }

  /** The field wells of a <code>GeospatialMapVisual</code>. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait GeospatialMapFieldWells extends js.Object {
    var GeospatialMapAggregatedFieldWells: js.UndefOr[GeospatialMapAggregatedFieldWells]
  }

  object GeospatialMapFieldWells {
    @inline
    def apply(
        GeospatialMapAggregatedFieldWells: js.UndefOr[GeospatialMapAggregatedFieldWells] = js.undefined
    ): GeospatialMapFieldWells = {
      val __obj = js.Dynamic.literal()
      GeospatialMapAggregatedFieldWells.foreach(__v => __obj.updateDynamic("GeospatialMapAggregatedFieldWells")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GeospatialMapFieldWells]
    }
  }

  /** The map style options of the geospatial map.
    */
  @js.native
  trait GeospatialMapStyleOptions extends js.Object {
    var BaseMapStyle: js.UndefOr[BaseMapStyleType]
  }

  object GeospatialMapStyleOptions {
    @inline
    def apply(
        BaseMapStyle: js.UndefOr[BaseMapStyleType] = js.undefined
    ): GeospatialMapStyleOptions = {
      val __obj = js.Dynamic.literal()
      BaseMapStyle.foreach(__v => __obj.updateDynamic("BaseMapStyle")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GeospatialMapStyleOptions]
    }
  }

  /** A geospatial map or a points on map visual. For more information, see [[https://docs.aws.amazon.com/quicksight/latest/user/point-maps.html|Creating point maps]] in the <i>Amazon QuickSight User Guide</i>.
    */
  @js.native
  trait GeospatialMapVisual extends js.Object {
    var VisualId: ShortRestrictiveResourceId
    var Actions: js.UndefOr[VisualCustomActionList]
    var ChartConfiguration: js.UndefOr[GeospatialMapConfiguration]
    var ColumnHierarchies: js.UndefOr[ColumnHierarchyList]
    var Subtitle: js.UndefOr[VisualSubtitleLabelOptions]
    var Title: js.UndefOr[VisualTitleLabelOptions]
  }

  object GeospatialMapVisual {
    @inline
    def apply(
        VisualId: ShortRestrictiveResourceId,
        Actions: js.UndefOr[VisualCustomActionList] = js.undefined,
        ChartConfiguration: js.UndefOr[GeospatialMapConfiguration] = js.undefined,
        ColumnHierarchies: js.UndefOr[ColumnHierarchyList] = js.undefined,
        Subtitle: js.UndefOr[VisualSubtitleLabelOptions] = js.undefined,
        Title: js.UndefOr[VisualTitleLabelOptions] = js.undefined
    ): GeospatialMapVisual = {
      val __obj = js.Dynamic.literal(
        "VisualId" -> VisualId.asInstanceOf[js.Any]
      )

      Actions.foreach(__v => __obj.updateDynamic("Actions")(__v.asInstanceOf[js.Any]))
      ChartConfiguration.foreach(__v => __obj.updateDynamic("ChartConfiguration")(__v.asInstanceOf[js.Any]))
      ColumnHierarchies.foreach(__v => __obj.updateDynamic("ColumnHierarchies")(__v.asInstanceOf[js.Any]))
      Subtitle.foreach(__v => __obj.updateDynamic("Subtitle")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GeospatialMapVisual]
    }
  }

  /** The point style of the geospatial map.
    */
  @js.native
  trait GeospatialPointStyleOptions extends js.Object {
    var ClusterMarkerConfiguration: js.UndefOr[ClusterMarkerConfiguration]
    var SelectedPointStyle: js.UndefOr[GeospatialSelectedPointStyle]
  }

  object GeospatialPointStyleOptions {
    @inline
    def apply(
        ClusterMarkerConfiguration: js.UndefOr[ClusterMarkerConfiguration] = js.undefined,
        SelectedPointStyle: js.UndefOr[GeospatialSelectedPointStyle] = js.undefined
    ): GeospatialPointStyleOptions = {
      val __obj = js.Dynamic.literal()
      ClusterMarkerConfiguration.foreach(__v => __obj.updateDynamic("ClusterMarkerConfiguration")(__v.asInstanceOf[js.Any]))
      SelectedPointStyle.foreach(__v => __obj.updateDynamic("SelectedPointStyle")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GeospatialPointStyleOptions]
    }
  }

  /** The window options of the geospatial map visual.
    */
  @js.native
  trait GeospatialWindowOptions extends js.Object {
    var Bounds: js.UndefOr[GeospatialCoordinateBounds]
    var MapZoomMode: js.UndefOr[MapZoomMode]
  }

  object GeospatialWindowOptions {
    @inline
    def apply(
        Bounds: js.UndefOr[GeospatialCoordinateBounds] = js.undefined,
        MapZoomMode: js.UndefOr[MapZoomMode] = js.undefined
    ): GeospatialWindowOptions = {
      val __obj = js.Dynamic.literal()
      Bounds.foreach(__v => __obj.updateDynamic("Bounds")(__v.asInstanceOf[js.Any]))
      MapZoomMode.foreach(__v => __obj.updateDynamic("MapZoomMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GeospatialWindowOptions]
    }
  }

  @js.native
  trait GetDashboardEmbedUrlRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DashboardId: ShortRestrictiveResourceId
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
        DashboardId: ShortRestrictiveResourceId,
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

  /** Determines the border options for a table visual.
    */
  @js.native
  trait GlobalTableBorderOptions extends js.Object {
    var SideSpecificBorder: js.UndefOr[TableSideBorderOptions]
    var UniformBorder: js.UndefOr[TableBorderOptions]
  }

  object GlobalTableBorderOptions {
    @inline
    def apply(
        SideSpecificBorder: js.UndefOr[TableSideBorderOptions] = js.undefined,
        UniformBorder: js.UndefOr[TableBorderOptions] = js.undefined
    ): GlobalTableBorderOptions = {
      val __obj = js.Dynamic.literal()
      SideSpecificBorder.foreach(__v => __obj.updateDynamic("SideSpecificBorder")(__v.asInstanceOf[js.Any]))
      UniformBorder.foreach(__v => __obj.updateDynamic("UniformBorder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GlobalTableBorderOptions]
    }
  }

  /** Determines the gradient color settings.
    */
  @js.native
  trait GradientColor extends js.Object {
    var Stops: js.UndefOr[GradientStopList]
  }

  object GradientColor {
    @inline
    def apply(
        Stops: js.UndefOr[GradientStopList] = js.undefined
    ): GradientColor = {
      val __obj = js.Dynamic.literal()
      Stops.foreach(__v => __obj.updateDynamic("Stops")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GradientColor]
    }
  }

  /** Determines the gradient stop configuration.
    */
  @js.native
  trait GradientStop extends js.Object {
    var GradientOffset: Double
    var Color: js.UndefOr[HexColor]
    var DataValue: js.UndefOr[Double]
  }

  object GradientStop {
    @inline
    def apply(
        GradientOffset: Double,
        Color: js.UndefOr[HexColor] = js.undefined,
        DataValue: js.UndefOr[Double] = js.undefined
    ): GradientStop = {
      val __obj = js.Dynamic.literal(
        "GradientOffset" -> GradientOffset.asInstanceOf[js.Any]
      )

      Color.foreach(__v => __obj.updateDynamic("Color")(__v.asInstanceOf[js.Any]))
      DataValue.foreach(__v => __obj.updateDynamic("DataValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GradientStop]
    }
  }

  /** Configuration options for the canvas of a grid layout.
    */
  @js.native
  trait GridLayoutCanvasSizeOptions extends js.Object {
    var ScreenCanvasSizeOptions: js.UndefOr[GridLayoutScreenCanvasSizeOptions]
  }

  object GridLayoutCanvasSizeOptions {
    @inline
    def apply(
        ScreenCanvasSizeOptions: js.UndefOr[GridLayoutScreenCanvasSizeOptions] = js.undefined
    ): GridLayoutCanvasSizeOptions = {
      val __obj = js.Dynamic.literal()
      ScreenCanvasSizeOptions.foreach(__v => __obj.updateDynamic("ScreenCanvasSizeOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GridLayoutCanvasSizeOptions]
    }
  }

  /** The configuration for a grid layout. Also called a tiled layout. Visuals snap to a grid with standard spacing and alignment. Dashboards are displayed as designed, with options to fit to screen or view at actual size.
    */
  @js.native
  trait GridLayoutConfiguration extends js.Object {
    var Elements: GridLayoutElementList
    var CanvasSizeOptions: js.UndefOr[GridLayoutCanvasSizeOptions]
  }

  object GridLayoutConfiguration {
    @inline
    def apply(
        Elements: GridLayoutElementList,
        CanvasSizeOptions: js.UndefOr[GridLayoutCanvasSizeOptions] = js.undefined
    ): GridLayoutConfiguration = {
      val __obj = js.Dynamic.literal(
        "Elements" -> Elements.asInstanceOf[js.Any]
      )

      CanvasSizeOptions.foreach(__v => __obj.updateDynamic("CanvasSizeOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GridLayoutConfiguration]
    }
  }

  /** An element within a grid layout.
    */
  @js.native
  trait GridLayoutElement extends js.Object {
    var ColumnSpan: GridLayoutElementColumnSpan
    var ElementId: ShortRestrictiveResourceId
    var ElementType: LayoutElementType
    var RowSpan: GridLayoutElementRowSpan
    var ColumnIndex: js.UndefOr[GridLayoutElementColumnIndex]
    var RowIndex: js.UndefOr[GridLayoutElementRowIndex]
  }

  object GridLayoutElement {
    @inline
    def apply(
        ColumnSpan: GridLayoutElementColumnSpan,
        ElementId: ShortRestrictiveResourceId,
        ElementType: LayoutElementType,
        RowSpan: GridLayoutElementRowSpan,
        ColumnIndex: js.UndefOr[GridLayoutElementColumnIndex] = js.undefined,
        RowIndex: js.UndefOr[GridLayoutElementRowIndex] = js.undefined
    ): GridLayoutElement = {
      val __obj = js.Dynamic.literal(
        "ColumnSpan" -> ColumnSpan.asInstanceOf[js.Any],
        "ElementId" -> ElementId.asInstanceOf[js.Any],
        "ElementType" -> ElementType.asInstanceOf[js.Any],
        "RowSpan" -> RowSpan.asInstanceOf[js.Any]
      )

      ColumnIndex.foreach(__v => __obj.updateDynamic("ColumnIndex")(__v.asInstanceOf[js.Any]))
      RowIndex.foreach(__v => __obj.updateDynamic("RowIndex")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GridLayoutElement]
    }
  }

  /** The options that determine the sizing of the canvas used in a grid layout.
    */
  @js.native
  trait GridLayoutScreenCanvasSizeOptions extends js.Object {
    var ResizeOption: ResizeOption
    var OptimizedViewPortWidth: js.UndefOr[PixelLength]
  }

  object GridLayoutScreenCanvasSizeOptions {
    @inline
    def apply(
        ResizeOption: ResizeOption,
        OptimizedViewPortWidth: js.UndefOr[PixelLength] = js.undefined
    ): GridLayoutScreenCanvasSizeOptions = {
      val __obj = js.Dynamic.literal(
        "ResizeOption" -> ResizeOption.asInstanceOf[js.Any]
      )

      OptimizedViewPortWidth.foreach(__v => __obj.updateDynamic("OptimizedViewPortWidth")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GridLayoutScreenCanvasSizeOptions]
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

  /** A <code>GroupSearchFilter</code> object that you want to apply to your search.
    */
  @js.native
  trait GroupSearchFilter extends js.Object {
    var Name: GroupFilterAttribute
    var Operator: GroupFilterOperator
    var Value: String
  }

  object GroupSearchFilter {
    @inline
    def apply(
        Name: GroupFilterAttribute,
        Operator: GroupFilterOperator,
        Value: String
    ): GroupSearchFilter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Operator" -> Operator.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GroupSearchFilter]
    }
  }

  /** The growth rate computation configuration.
    */
  @js.native
  trait GrowthRateComputation extends js.Object {
    var ComputationId: ShortRestrictiveResourceId
    var Time: DimensionField
    var Name: js.UndefOr[String]
    var PeriodSize: js.UndefOr[GrowthRatePeriodSize]
    var Value: js.UndefOr[MeasureField]
  }

  object GrowthRateComputation {
    @inline
    def apply(
        ComputationId: ShortRestrictiveResourceId,
        Time: DimensionField,
        Name: js.UndefOr[String] = js.undefined,
        PeriodSize: js.UndefOr[GrowthRatePeriodSize] = js.undefined,
        Value: js.UndefOr[MeasureField] = js.undefined
    ): GrowthRateComputation = {
      val __obj = js.Dynamic.literal(
        "ComputationId" -> ComputationId.asInstanceOf[js.Any],
        "Time" -> Time.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PeriodSize.foreach(__v => __obj.updateDynamic("PeriodSize")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GrowthRateComputation]
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

  /** The configuration of a header or footer section.
    */
  @js.native
  trait HeaderFooterSectionConfiguration extends js.Object {
    var Layout: SectionLayoutConfiguration
    var SectionId: ShortRestrictiveResourceId
    var Style: js.UndefOr[SectionStyle]
  }

  object HeaderFooterSectionConfiguration {
    @inline
    def apply(
        Layout: SectionLayoutConfiguration,
        SectionId: ShortRestrictiveResourceId,
        Style: js.UndefOr[SectionStyle] = js.undefined
    ): HeaderFooterSectionConfiguration = {
      val __obj = js.Dynamic.literal(
        "Layout" -> Layout.asInstanceOf[js.Any],
        "SectionId" -> SectionId.asInstanceOf[js.Any]
      )

      Style.foreach(__v => __obj.updateDynamic("Style")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HeaderFooterSectionConfiguration]
    }
  }

  /** The aggregated field wells of a heat map.
    */
  @js.native
  trait HeatMapAggregatedFieldWells extends js.Object {
    var Columns: js.UndefOr[HeatMapDimensionFieldList]
    var Rows: js.UndefOr[HeatMapDimensionFieldList]
    var Values: js.UndefOr[HeatMapMeasureFieldList]
  }

  object HeatMapAggregatedFieldWells {
    @inline
    def apply(
        Columns: js.UndefOr[HeatMapDimensionFieldList] = js.undefined,
        Rows: js.UndefOr[HeatMapDimensionFieldList] = js.undefined,
        Values: js.UndefOr[HeatMapMeasureFieldList] = js.undefined
    ): HeatMapAggregatedFieldWells = {
      val __obj = js.Dynamic.literal()
      Columns.foreach(__v => __obj.updateDynamic("Columns")(__v.asInstanceOf[js.Any]))
      Rows.foreach(__v => __obj.updateDynamic("Rows")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HeatMapAggregatedFieldWells]
    }
  }

  /** The configuration of a heat map.
    */
  @js.native
  trait HeatMapConfiguration extends js.Object {
    var ColorScale: js.UndefOr[ColorScale]
    var ColumnLabelOptions: js.UndefOr[ChartAxisLabelOptions]
    var DataLabels: js.UndefOr[DataLabelOptions]
    var FieldWells: js.UndefOr[HeatMapFieldWells]
    var Legend: js.UndefOr[LegendOptions]
    var RowLabelOptions: js.UndefOr[ChartAxisLabelOptions]
    var SortConfiguration: js.UndefOr[HeatMapSortConfiguration]
    var Tooltip: js.UndefOr[TooltipOptions]
  }

  object HeatMapConfiguration {
    @inline
    def apply(
        ColorScale: js.UndefOr[ColorScale] = js.undefined,
        ColumnLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined,
        DataLabels: js.UndefOr[DataLabelOptions] = js.undefined,
        FieldWells: js.UndefOr[HeatMapFieldWells] = js.undefined,
        Legend: js.UndefOr[LegendOptions] = js.undefined,
        RowLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined,
        SortConfiguration: js.UndefOr[HeatMapSortConfiguration] = js.undefined,
        Tooltip: js.UndefOr[TooltipOptions] = js.undefined
    ): HeatMapConfiguration = {
      val __obj = js.Dynamic.literal()
      ColorScale.foreach(__v => __obj.updateDynamic("ColorScale")(__v.asInstanceOf[js.Any]))
      ColumnLabelOptions.foreach(__v => __obj.updateDynamic("ColumnLabelOptions")(__v.asInstanceOf[js.Any]))
      DataLabels.foreach(__v => __obj.updateDynamic("DataLabels")(__v.asInstanceOf[js.Any]))
      FieldWells.foreach(__v => __obj.updateDynamic("FieldWells")(__v.asInstanceOf[js.Any]))
      Legend.foreach(__v => __obj.updateDynamic("Legend")(__v.asInstanceOf[js.Any]))
      RowLabelOptions.foreach(__v => __obj.updateDynamic("RowLabelOptions")(__v.asInstanceOf[js.Any]))
      SortConfiguration.foreach(__v => __obj.updateDynamic("SortConfiguration")(__v.asInstanceOf[js.Any]))
      Tooltip.foreach(__v => __obj.updateDynamic("Tooltip")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HeatMapConfiguration]
    }
  }

  /** The field well configuration of a heat map. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait HeatMapFieldWells extends js.Object {
    var HeatMapAggregatedFieldWells: js.UndefOr[HeatMapAggregatedFieldWells]
  }

  object HeatMapFieldWells {
    @inline
    def apply(
        HeatMapAggregatedFieldWells: js.UndefOr[HeatMapAggregatedFieldWells] = js.undefined
    ): HeatMapFieldWells = {
      val __obj = js.Dynamic.literal()
      HeatMapAggregatedFieldWells.foreach(__v => __obj.updateDynamic("HeatMapAggregatedFieldWells")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HeatMapFieldWells]
    }
  }

  /** The sort configuration of a heat map.
    */
  @js.native
  trait HeatMapSortConfiguration extends js.Object {
    var HeatMapColumnItemsLimitConfiguration: js.UndefOr[ItemsLimitConfiguration]
    var HeatMapColumnSort: js.UndefOr[FieldSortOptionsList]
    var HeatMapRowItemsLimitConfiguration: js.UndefOr[ItemsLimitConfiguration]
    var HeatMapRowSort: js.UndefOr[FieldSortOptionsList]
  }

  object HeatMapSortConfiguration {
    @inline
    def apply(
        HeatMapColumnItemsLimitConfiguration: js.UndefOr[ItemsLimitConfiguration] = js.undefined,
        HeatMapColumnSort: js.UndefOr[FieldSortOptionsList] = js.undefined,
        HeatMapRowItemsLimitConfiguration: js.UndefOr[ItemsLimitConfiguration] = js.undefined,
        HeatMapRowSort: js.UndefOr[FieldSortOptionsList] = js.undefined
    ): HeatMapSortConfiguration = {
      val __obj = js.Dynamic.literal()
      HeatMapColumnItemsLimitConfiguration.foreach(__v => __obj.updateDynamic("HeatMapColumnItemsLimitConfiguration")(__v.asInstanceOf[js.Any]))
      HeatMapColumnSort.foreach(__v => __obj.updateDynamic("HeatMapColumnSort")(__v.asInstanceOf[js.Any]))
      HeatMapRowItemsLimitConfiguration.foreach(__v => __obj.updateDynamic("HeatMapRowItemsLimitConfiguration")(__v.asInstanceOf[js.Any]))
      HeatMapRowSort.foreach(__v => __obj.updateDynamic("HeatMapRowSort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HeatMapSortConfiguration]
    }
  }

  /** A heat map. For more information, see [[https://docs.aws.amazon.com/quicksight/latest/user/heat-map.html|Using heat maps]] in the <i>Amazon QuickSight User Guide</i>.
    */
  @js.native
  trait HeatMapVisual extends js.Object {
    var VisualId: ShortRestrictiveResourceId
    var Actions: js.UndefOr[VisualCustomActionList]
    var ChartConfiguration: js.UndefOr[HeatMapConfiguration]
    var ColumnHierarchies: js.UndefOr[ColumnHierarchyList]
    var Subtitle: js.UndefOr[VisualSubtitleLabelOptions]
    var Title: js.UndefOr[VisualTitleLabelOptions]
  }

  object HeatMapVisual {
    @inline
    def apply(
        VisualId: ShortRestrictiveResourceId,
        Actions: js.UndefOr[VisualCustomActionList] = js.undefined,
        ChartConfiguration: js.UndefOr[HeatMapConfiguration] = js.undefined,
        ColumnHierarchies: js.UndefOr[ColumnHierarchyList] = js.undefined,
        Subtitle: js.UndefOr[VisualSubtitleLabelOptions] = js.undefined,
        Title: js.UndefOr[VisualTitleLabelOptions] = js.undefined
    ): HeatMapVisual = {
      val __obj = js.Dynamic.literal(
        "VisualId" -> VisualId.asInstanceOf[js.Any]
      )

      Actions.foreach(__v => __obj.updateDynamic("Actions")(__v.asInstanceOf[js.Any]))
      ChartConfiguration.foreach(__v => __obj.updateDynamic("ChartConfiguration")(__v.asInstanceOf[js.Any]))
      ColumnHierarchies.foreach(__v => __obj.updateDynamic("ColumnHierarchies")(__v.asInstanceOf[js.Any]))
      Subtitle.foreach(__v => __obj.updateDynamic("Subtitle")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HeatMapVisual]
    }
  }

  /** The field well configuration of a histogram.
    */
  @js.native
  trait HistogramAggregatedFieldWells extends js.Object {
    var Values: js.UndefOr[HistogramMeasureFieldList]
  }

  object HistogramAggregatedFieldWells {
    @inline
    def apply(
        Values: js.UndefOr[HistogramMeasureFieldList] = js.undefined
    ): HistogramAggregatedFieldWells = {
      val __obj = js.Dynamic.literal()
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HistogramAggregatedFieldWells]
    }
  }

  /** The options that determine the presentation of histogram bins.
    */
  @js.native
  trait HistogramBinOptions extends js.Object {
    var BinCount: js.UndefOr[BinCountOptions]
    var BinWidth: js.UndefOr[BinWidthOptions]
    var SelectedBinType: js.UndefOr[HistogramBinType]
    var StartValue: js.UndefOr[Double]
  }

  object HistogramBinOptions {
    @inline
    def apply(
        BinCount: js.UndefOr[BinCountOptions] = js.undefined,
        BinWidth: js.UndefOr[BinWidthOptions] = js.undefined,
        SelectedBinType: js.UndefOr[HistogramBinType] = js.undefined,
        StartValue: js.UndefOr[Double] = js.undefined
    ): HistogramBinOptions = {
      val __obj = js.Dynamic.literal()
      BinCount.foreach(__v => __obj.updateDynamic("BinCount")(__v.asInstanceOf[js.Any]))
      BinWidth.foreach(__v => __obj.updateDynamic("BinWidth")(__v.asInstanceOf[js.Any]))
      SelectedBinType.foreach(__v => __obj.updateDynamic("SelectedBinType")(__v.asInstanceOf[js.Any]))
      StartValue.foreach(__v => __obj.updateDynamic("StartValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HistogramBinOptions]
    }
  }

  /** The configuration for a <code>HistogramVisual</code>.
    */
  @js.native
  trait HistogramConfiguration extends js.Object {
    var BinOptions: js.UndefOr[HistogramBinOptions]
    var DataLabels: js.UndefOr[DataLabelOptions]
    var FieldWells: js.UndefOr[HistogramFieldWells]
    var Tooltip: js.UndefOr[TooltipOptions]
    var VisualPalette: js.UndefOr[VisualPalette]
    var XAxisDisplayOptions: js.UndefOr[AxisDisplayOptions]
    var XAxisLabelOptions: js.UndefOr[ChartAxisLabelOptions]
    var YAxisDisplayOptions: js.UndefOr[AxisDisplayOptions]
  }

  object HistogramConfiguration {
    @inline
    def apply(
        BinOptions: js.UndefOr[HistogramBinOptions] = js.undefined,
        DataLabels: js.UndefOr[DataLabelOptions] = js.undefined,
        FieldWells: js.UndefOr[HistogramFieldWells] = js.undefined,
        Tooltip: js.UndefOr[TooltipOptions] = js.undefined,
        VisualPalette: js.UndefOr[VisualPalette] = js.undefined,
        XAxisDisplayOptions: js.UndefOr[AxisDisplayOptions] = js.undefined,
        XAxisLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined,
        YAxisDisplayOptions: js.UndefOr[AxisDisplayOptions] = js.undefined
    ): HistogramConfiguration = {
      val __obj = js.Dynamic.literal()
      BinOptions.foreach(__v => __obj.updateDynamic("BinOptions")(__v.asInstanceOf[js.Any]))
      DataLabels.foreach(__v => __obj.updateDynamic("DataLabels")(__v.asInstanceOf[js.Any]))
      FieldWells.foreach(__v => __obj.updateDynamic("FieldWells")(__v.asInstanceOf[js.Any]))
      Tooltip.foreach(__v => __obj.updateDynamic("Tooltip")(__v.asInstanceOf[js.Any]))
      VisualPalette.foreach(__v => __obj.updateDynamic("VisualPalette")(__v.asInstanceOf[js.Any]))
      XAxisDisplayOptions.foreach(__v => __obj.updateDynamic("XAxisDisplayOptions")(__v.asInstanceOf[js.Any]))
      XAxisLabelOptions.foreach(__v => __obj.updateDynamic("XAxisLabelOptions")(__v.asInstanceOf[js.Any]))
      YAxisDisplayOptions.foreach(__v => __obj.updateDynamic("YAxisDisplayOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HistogramConfiguration]
    }
  }

  /** The field well configuration of a histogram.
    */
  @js.native
  trait HistogramFieldWells extends js.Object {
    var HistogramAggregatedFieldWells: js.UndefOr[HistogramAggregatedFieldWells]
  }

  object HistogramFieldWells {
    @inline
    def apply(
        HistogramAggregatedFieldWells: js.UndefOr[HistogramAggregatedFieldWells] = js.undefined
    ): HistogramFieldWells = {
      val __obj = js.Dynamic.literal()
      HistogramAggregatedFieldWells.foreach(__v => __obj.updateDynamic("HistogramAggregatedFieldWells")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HistogramFieldWells]
    }
  }

  /** A histogram. For more information, see [[https://docs.aws.amazon.com/quicksight/latest/user/histogram-charts.html|Using histograms]] in the <i>Amazon QuickSight User Guide</i>.
    */
  @js.native
  trait HistogramVisual extends js.Object {
    var VisualId: ShortRestrictiveResourceId
    var Actions: js.UndefOr[VisualCustomActionList]
    var ChartConfiguration: js.UndefOr[HistogramConfiguration]
    var Subtitle: js.UndefOr[VisualSubtitleLabelOptions]
    var Title: js.UndefOr[VisualTitleLabelOptions]
  }

  object HistogramVisual {
    @inline
    def apply(
        VisualId: ShortRestrictiveResourceId,
        Actions: js.UndefOr[VisualCustomActionList] = js.undefined,
        ChartConfiguration: js.UndefOr[HistogramConfiguration] = js.undefined,
        Subtitle: js.UndefOr[VisualSubtitleLabelOptions] = js.undefined,
        Title: js.UndefOr[VisualTitleLabelOptions] = js.undefined
    ): HistogramVisual = {
      val __obj = js.Dynamic.literal(
        "VisualId" -> VisualId.asInstanceOf[js.Any]
      )

      Actions.foreach(__v => __obj.updateDynamic("Actions")(__v.asInstanceOf[js.Any]))
      ChartConfiguration.foreach(__v => __obj.updateDynamic("ChartConfiguration")(__v.asInstanceOf[js.Any]))
      Subtitle.foreach(__v => __obj.updateDynamic("Subtitle")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HistogramVisual]
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

  /** The configuration of an insight visual.
    */
  @js.native
  trait InsightConfiguration extends js.Object {
    var Computations: js.UndefOr[ComputationList]
    var CustomNarrative: js.UndefOr[CustomNarrativeOptions]
  }

  object InsightConfiguration {
    @inline
    def apply(
        Computations: js.UndefOr[ComputationList] = js.undefined,
        CustomNarrative: js.UndefOr[CustomNarrativeOptions] = js.undefined
    ): InsightConfiguration = {
      val __obj = js.Dynamic.literal()
      Computations.foreach(__v => __obj.updateDynamic("Computations")(__v.asInstanceOf[js.Any]))
      CustomNarrative.foreach(__v => __obj.updateDynamic("CustomNarrative")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InsightConfiguration]
    }
  }

  /** An insight visual. For more information, see [[https://docs.aws.amazon.com/quicksight/latest/user/computational-insights.html|Working with insights]] in the <i>Amazon QuickSight User Guide</i>.
    */
  @js.native
  trait InsightVisual extends js.Object {
    var DataSetIdentifier: DataSetIdentifier
    var VisualId: ShortRestrictiveResourceId
    var Actions: js.UndefOr[VisualCustomActionList]
    var InsightConfiguration: js.UndefOr[InsightConfiguration]
    var Subtitle: js.UndefOr[VisualSubtitleLabelOptions]
    var Title: js.UndefOr[VisualTitleLabelOptions]
  }

  object InsightVisual {
    @inline
    def apply(
        DataSetIdentifier: DataSetIdentifier,
        VisualId: ShortRestrictiveResourceId,
        Actions: js.UndefOr[VisualCustomActionList] = js.undefined,
        InsightConfiguration: js.UndefOr[InsightConfiguration] = js.undefined,
        Subtitle: js.UndefOr[VisualSubtitleLabelOptions] = js.undefined,
        Title: js.UndefOr[VisualTitleLabelOptions] = js.undefined
    ): InsightVisual = {
      val __obj = js.Dynamic.literal(
        "DataSetIdentifier" -> DataSetIdentifier.asInstanceOf[js.Any],
        "VisualId" -> VisualId.asInstanceOf[js.Any]
      )

      Actions.foreach(__v => __obj.updateDynamic("Actions")(__v.asInstanceOf[js.Any]))
      InsightConfiguration.foreach(__v => __obj.updateDynamic("InsightConfiguration")(__v.asInstanceOf[js.Any]))
      Subtitle.foreach(__v => __obj.updateDynamic("Subtitle")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InsightVisual]
    }
  }

  /** The default values of the <code>IntegerParameterDeclaration</code>.
    */
  @js.native
  trait IntegerDefaultValues extends js.Object {
    var DynamicValue: js.UndefOr[DynamicDefaultValue]
    var StaticValues: js.UndefOr[IntegerDefaultValueList]
  }

  object IntegerDefaultValues {
    @inline
    def apply(
        DynamicValue: js.UndefOr[DynamicDefaultValue] = js.undefined,
        StaticValues: js.UndefOr[IntegerDefaultValueList] = js.undefined
    ): IntegerDefaultValues = {
      val __obj = js.Dynamic.literal()
      DynamicValue.foreach(__v => __obj.updateDynamic("DynamicValue")(__v.asInstanceOf[js.Any]))
      StaticValues.foreach(__v => __obj.updateDynamic("StaticValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IntegerDefaultValues]
    }
  }

  /** An integer parameter.
    */
  @js.native
  trait IntegerParameter extends js.Object {
    var Name: NonEmptyString
    var Values: SensitiveLongList
  }

  object IntegerParameter {
    @inline
    def apply(
        Name: NonEmptyString,
        Values: SensitiveLongList
    ): IntegerParameter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[IntegerParameter]
    }
  }

  /** A parameter declaration for the <code>Integer</code> data type.
    */
  @js.native
  trait IntegerParameterDeclaration extends js.Object {
    var Name: ParameterName
    var ParameterValueType: ParameterValueType
    var DefaultValues: js.UndefOr[IntegerDefaultValues]
    var ValueWhenUnset: js.UndefOr[IntegerValueWhenUnsetConfiguration]
  }

  object IntegerParameterDeclaration {
    @inline
    def apply(
        Name: ParameterName,
        ParameterValueType: ParameterValueType,
        DefaultValues: js.UndefOr[IntegerDefaultValues] = js.undefined,
        ValueWhenUnset: js.UndefOr[IntegerValueWhenUnsetConfiguration] = js.undefined
    ): IntegerParameterDeclaration = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "ParameterValueType" -> ParameterValueType.asInstanceOf[js.Any]
      )

      DefaultValues.foreach(__v => __obj.updateDynamic("DefaultValues")(__v.asInstanceOf[js.Any]))
      ValueWhenUnset.foreach(__v => __obj.updateDynamic("ValueWhenUnset")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IntegerParameterDeclaration]
    }
  }

  /** A parameter declaration for the <code>Integer</code> data type. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait IntegerValueWhenUnsetConfiguration extends js.Object {
    var CustomValue: js.UndefOr[SensitiveLong]
    var ValueWhenUnsetOption: js.UndefOr[ValueWhenUnsetOption]
  }

  object IntegerValueWhenUnsetConfiguration {
    @inline
    def apply(
        CustomValue: js.UndefOr[SensitiveLong] = js.undefined,
        ValueWhenUnsetOption: js.UndefOr[ValueWhenUnsetOption] = js.undefined
    ): IntegerValueWhenUnsetConfiguration = {
      val __obj = js.Dynamic.literal()
      CustomValue.foreach(__v => __obj.updateDynamic("CustomValue")(__v.asInstanceOf[js.Any]))
      ValueWhenUnsetOption.foreach(__v => __obj.updateDynamic("ValueWhenUnsetOption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IntegerValueWhenUnsetConfiguration]
    }
  }

  /** The limit configuration of the visual display for an axis.
    */
  @js.native
  trait ItemsLimitConfiguration extends js.Object {
    var ItemsLimit: js.UndefOr[Double]
    var OtherCategories: js.UndefOr[OtherCategories]
  }

  object ItemsLimitConfiguration {
    @inline
    def apply(
        ItemsLimit: js.UndefOr[Double] = js.undefined,
        OtherCategories: js.UndefOr[OtherCategories] = js.undefined
    ): ItemsLimitConfiguration = {
      val __obj = js.Dynamic.literal()
      ItemsLimit.foreach(__v => __obj.updateDynamic("ItemsLimit")(__v.asInstanceOf[js.Any]))
      OtherCategories.foreach(__v => __obj.updateDynamic("OtherCategories")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ItemsLimitConfiguration]
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

  /** The conditional formatting of a KPI visual.
    */
  @js.native
  trait KPIConditionalFormatting extends js.Object {
    var ConditionalFormattingOptions: js.UndefOr[KPIConditionalFormattingOptionList]
  }

  object KPIConditionalFormatting {
    @inline
    def apply(
        ConditionalFormattingOptions: js.UndefOr[KPIConditionalFormattingOptionList] = js.undefined
    ): KPIConditionalFormatting = {
      val __obj = js.Dynamic.literal()
      ConditionalFormattingOptions.foreach(__v => __obj.updateDynamic("ConditionalFormattingOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KPIConditionalFormatting]
    }
  }

  /** The conditional formatting options of a KPI visual.
    */
  @js.native
  trait KPIConditionalFormattingOption extends js.Object {
    var PrimaryValue: js.UndefOr[KPIPrimaryValueConditionalFormatting]
    var ProgressBar: js.UndefOr[KPIProgressBarConditionalFormatting]
  }

  object KPIConditionalFormattingOption {
    @inline
    def apply(
        PrimaryValue: js.UndefOr[KPIPrimaryValueConditionalFormatting] = js.undefined,
        ProgressBar: js.UndefOr[KPIProgressBarConditionalFormatting] = js.undefined
    ): KPIConditionalFormattingOption = {
      val __obj = js.Dynamic.literal()
      PrimaryValue.foreach(__v => __obj.updateDynamic("PrimaryValue")(__v.asInstanceOf[js.Any]))
      ProgressBar.foreach(__v => __obj.updateDynamic("ProgressBar")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KPIConditionalFormattingOption]
    }
  }

  /** The configuration of a KPI visual.
    */
  @js.native
  trait KPIConfiguration extends js.Object {
    var FieldWells: js.UndefOr[KPIFieldWells]
    var KPIOptions: js.UndefOr[KPIOptions]
    var SortConfiguration: js.UndefOr[KPISortConfiguration]
  }

  object KPIConfiguration {
    @inline
    def apply(
        FieldWells: js.UndefOr[KPIFieldWells] = js.undefined,
        KPIOptions: js.UndefOr[KPIOptions] = js.undefined,
        SortConfiguration: js.UndefOr[KPISortConfiguration] = js.undefined
    ): KPIConfiguration = {
      val __obj = js.Dynamic.literal()
      FieldWells.foreach(__v => __obj.updateDynamic("FieldWells")(__v.asInstanceOf[js.Any]))
      KPIOptions.foreach(__v => __obj.updateDynamic("KPIOptions")(__v.asInstanceOf[js.Any]))
      SortConfiguration.foreach(__v => __obj.updateDynamic("SortConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KPIConfiguration]
    }
  }

  /** The field well configuration of a KPI visual.
    */
  @js.native
  trait KPIFieldWells extends js.Object {
    var TargetValues: js.UndefOr[MeasureFieldList]
    var TrendGroups: js.UndefOr[DimensionFieldList]
    var Values: js.UndefOr[MeasureFieldList]
  }

  object KPIFieldWells {
    @inline
    def apply(
        TargetValues: js.UndefOr[MeasureFieldList] = js.undefined,
        TrendGroups: js.UndefOr[DimensionFieldList] = js.undefined,
        Values: js.UndefOr[MeasureFieldList] = js.undefined
    ): KPIFieldWells = {
      val __obj = js.Dynamic.literal()
      TargetValues.foreach(__v => __obj.updateDynamic("TargetValues")(__v.asInstanceOf[js.Any]))
      TrendGroups.foreach(__v => __obj.updateDynamic("TrendGroups")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KPIFieldWells]
    }
  }

  /** The options that determine the presentation of a KPI visual.
    */
  @js.native
  trait KPIOptions extends js.Object {
    var Comparison: js.UndefOr[ComparisonConfiguration]
    var PrimaryValueDisplayType: js.UndefOr[PrimaryValueDisplayType]
    var PrimaryValueFontConfiguration: js.UndefOr[FontConfiguration]
    var ProgressBar: js.UndefOr[ProgressBarOptions]
    var SecondaryValue: js.UndefOr[SecondaryValueOptions]
    var SecondaryValueFontConfiguration: js.UndefOr[FontConfiguration]
    var TrendArrows: js.UndefOr[TrendArrowOptions]
  }

  object KPIOptions {
    @inline
    def apply(
        Comparison: js.UndefOr[ComparisonConfiguration] = js.undefined,
        PrimaryValueDisplayType: js.UndefOr[PrimaryValueDisplayType] = js.undefined,
        PrimaryValueFontConfiguration: js.UndefOr[FontConfiguration] = js.undefined,
        ProgressBar: js.UndefOr[ProgressBarOptions] = js.undefined,
        SecondaryValue: js.UndefOr[SecondaryValueOptions] = js.undefined,
        SecondaryValueFontConfiguration: js.UndefOr[FontConfiguration] = js.undefined,
        TrendArrows: js.UndefOr[TrendArrowOptions] = js.undefined
    ): KPIOptions = {
      val __obj = js.Dynamic.literal()
      Comparison.foreach(__v => __obj.updateDynamic("Comparison")(__v.asInstanceOf[js.Any]))
      PrimaryValueDisplayType.foreach(__v => __obj.updateDynamic("PrimaryValueDisplayType")(__v.asInstanceOf[js.Any]))
      PrimaryValueFontConfiguration.foreach(__v => __obj.updateDynamic("PrimaryValueFontConfiguration")(__v.asInstanceOf[js.Any]))
      ProgressBar.foreach(__v => __obj.updateDynamic("ProgressBar")(__v.asInstanceOf[js.Any]))
      SecondaryValue.foreach(__v => __obj.updateDynamic("SecondaryValue")(__v.asInstanceOf[js.Any]))
      SecondaryValueFontConfiguration.foreach(__v => __obj.updateDynamic("SecondaryValueFontConfiguration")(__v.asInstanceOf[js.Any]))
      TrendArrows.foreach(__v => __obj.updateDynamic("TrendArrows")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KPIOptions]
    }
  }

  /** The conditional formatting for the primary value of a KPI visual.
    */
  @js.native
  trait KPIPrimaryValueConditionalFormatting extends js.Object {
    var Icon: js.UndefOr[ConditionalFormattingIcon]
    var TextColor: js.UndefOr[ConditionalFormattingColor]
  }

  object KPIPrimaryValueConditionalFormatting {
    @inline
    def apply(
        Icon: js.UndefOr[ConditionalFormattingIcon] = js.undefined,
        TextColor: js.UndefOr[ConditionalFormattingColor] = js.undefined
    ): KPIPrimaryValueConditionalFormatting = {
      val __obj = js.Dynamic.literal()
      Icon.foreach(__v => __obj.updateDynamic("Icon")(__v.asInstanceOf[js.Any]))
      TextColor.foreach(__v => __obj.updateDynamic("TextColor")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KPIPrimaryValueConditionalFormatting]
    }
  }

  /** The conditional formatting for the progress bar of a KPI visual.
    */
  @js.native
  trait KPIProgressBarConditionalFormatting extends js.Object {
    var ForegroundColor: js.UndefOr[ConditionalFormattingColor]
  }

  object KPIProgressBarConditionalFormatting {
    @inline
    def apply(
        ForegroundColor: js.UndefOr[ConditionalFormattingColor] = js.undefined
    ): KPIProgressBarConditionalFormatting = {
      val __obj = js.Dynamic.literal()
      ForegroundColor.foreach(__v => __obj.updateDynamic("ForegroundColor")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KPIProgressBarConditionalFormatting]
    }
  }

  /** The sort configuration of a KPI visual.
    */
  @js.native
  trait KPISortConfiguration extends js.Object {
    var TrendGroupSort: js.UndefOr[FieldSortOptionsList]
  }

  object KPISortConfiguration {
    @inline
    def apply(
        TrendGroupSort: js.UndefOr[FieldSortOptionsList] = js.undefined
    ): KPISortConfiguration = {
      val __obj = js.Dynamic.literal()
      TrendGroupSort.foreach(__v => __obj.updateDynamic("TrendGroupSort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KPISortConfiguration]
    }
  }

  /** A key performance indicator (KPI). For more information, see [[https://docs.aws.amazon.com/quicksight/latest/user/kpi.html|Using KPIs]] in the <i>Amazon QuickSight User Guide</i>.
    */
  @js.native
  trait KPIVisual extends js.Object {
    var VisualId: ShortRestrictiveResourceId
    var Actions: js.UndefOr[VisualCustomActionList]
    var ChartConfiguration: js.UndefOr[KPIConfiguration]
    var ColumnHierarchies: js.UndefOr[ColumnHierarchyList]
    var ConditionalFormatting: js.UndefOr[KPIConditionalFormatting]
    var Subtitle: js.UndefOr[VisualSubtitleLabelOptions]
    var Title: js.UndefOr[VisualTitleLabelOptions]
  }

  object KPIVisual {
    @inline
    def apply(
        VisualId: ShortRestrictiveResourceId,
        Actions: js.UndefOr[VisualCustomActionList] = js.undefined,
        ChartConfiguration: js.UndefOr[KPIConfiguration] = js.undefined,
        ColumnHierarchies: js.UndefOr[ColumnHierarchyList] = js.undefined,
        ConditionalFormatting: js.UndefOr[KPIConditionalFormatting] = js.undefined,
        Subtitle: js.UndefOr[VisualSubtitleLabelOptions] = js.undefined,
        Title: js.UndefOr[VisualTitleLabelOptions] = js.undefined
    ): KPIVisual = {
      val __obj = js.Dynamic.literal(
        "VisualId" -> VisualId.asInstanceOf[js.Any]
      )

      Actions.foreach(__v => __obj.updateDynamic("Actions")(__v.asInstanceOf[js.Any]))
      ChartConfiguration.foreach(__v => __obj.updateDynamic("ChartConfiguration")(__v.asInstanceOf[js.Any]))
      ColumnHierarchies.foreach(__v => __obj.updateDynamic("ColumnHierarchies")(__v.asInstanceOf[js.Any]))
      ConditionalFormatting.foreach(__v => __obj.updateDynamic("ConditionalFormatting")(__v.asInstanceOf[js.Any]))
      Subtitle.foreach(__v => __obj.updateDynamic("Subtitle")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KPIVisual]
    }
  }

  /** The share label options for the labels.
    */
  @js.native
  trait LabelOptions extends js.Object {
    var CustomLabel: js.UndefOr[String]
    var FontConfiguration: js.UndefOr[FontConfiguration]
    var Visibility: js.UndefOr[Visibility]
  }

  object LabelOptions {
    @inline
    def apply(
        CustomLabel: js.UndefOr[String] = js.undefined,
        FontConfiguration: js.UndefOr[FontConfiguration] = js.undefined,
        Visibility: js.UndefOr[Visibility] = js.undefined
    ): LabelOptions = {
      val __obj = js.Dynamic.literal()
      CustomLabel.foreach(__v => __obj.updateDynamic("CustomLabel")(__v.asInstanceOf[js.Any]))
      FontConfiguration.foreach(__v => __obj.updateDynamic("FontConfiguration")(__v.asInstanceOf[js.Any]))
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LabelOptions]
    }
  }

  /** A <code>Layout</code> defines the placement of elements within a sheet. For more information, see [[https://docs.aws.amazon.com/quicksight/latest/user/types-of-layout.html|Types of layout]] in the <i>Amazon QuickSight User Guide</i>. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait Layout extends js.Object {
    var Configuration: LayoutConfiguration
  }

  object Layout {
    @inline
    def apply(
        Configuration: LayoutConfiguration
    ): Layout = {
      val __obj = js.Dynamic.literal(
        "Configuration" -> Configuration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Layout]
    }
  }

  /** The configuration that determines what the type of layout will be used on a sheet. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait LayoutConfiguration extends js.Object {
    var FreeFormLayout: js.UndefOr[FreeFormLayoutConfiguration]
    var GridLayout: js.UndefOr[GridLayoutConfiguration]
    var SectionBasedLayout: js.UndefOr[SectionBasedLayoutConfiguration]
  }

  object LayoutConfiguration {
    @inline
    def apply(
        FreeFormLayout: js.UndefOr[FreeFormLayoutConfiguration] = js.undefined,
        GridLayout: js.UndefOr[GridLayoutConfiguration] = js.undefined,
        SectionBasedLayout: js.UndefOr[SectionBasedLayoutConfiguration] = js.undefined
    ): LayoutConfiguration = {
      val __obj = js.Dynamic.literal()
      FreeFormLayout.foreach(__v => __obj.updateDynamic("FreeFormLayout")(__v.asInstanceOf[js.Any]))
      GridLayout.foreach(__v => __obj.updateDynamic("GridLayout")(__v.asInstanceOf[js.Any]))
      SectionBasedLayout.foreach(__v => __obj.updateDynamic("SectionBasedLayout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LayoutConfiguration]
    }
  }

  /** The options for the legend setup of a visual.
    */
  @js.native
  trait LegendOptions extends js.Object {
    var Height: js.UndefOr[PixelLength]
    var Position: js.UndefOr[LegendPosition]
    var Title: js.UndefOr[LabelOptions]
    var Visibility: js.UndefOr[Visibility]
    var Width: js.UndefOr[PixelLength]
  }

  object LegendOptions {
    @inline
    def apply(
        Height: js.UndefOr[PixelLength] = js.undefined,
        Position: js.UndefOr[LegendPosition] = js.undefined,
        Title: js.UndefOr[LabelOptions] = js.undefined,
        Visibility: js.UndefOr[Visibility] = js.undefined,
        Width: js.UndefOr[PixelLength] = js.undefined
    ): LegendOptions = {
      val __obj = js.Dynamic.literal()
      Height.foreach(__v => __obj.updateDynamic("Height")(__v.asInstanceOf[js.Any]))
      Position.foreach(__v => __obj.updateDynamic("Position")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      Width.foreach(__v => __obj.updateDynamic("Width")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LegendOptions]
    }
  }

  /** The field well configuration of a line chart.
    */
  @js.native
  trait LineChartAggregatedFieldWells extends js.Object {
    var Category: js.UndefOr[DimensionFieldList]
    var Colors: js.UndefOr[DimensionFieldList]
    var SmallMultiples: js.UndefOr[SmallMultiplesDimensionFieldList]
    var Values: js.UndefOr[MeasureFieldList]
  }

  object LineChartAggregatedFieldWells {
    @inline
    def apply(
        Category: js.UndefOr[DimensionFieldList] = js.undefined,
        Colors: js.UndefOr[DimensionFieldList] = js.undefined,
        SmallMultiples: js.UndefOr[SmallMultiplesDimensionFieldList] = js.undefined,
        Values: js.UndefOr[MeasureFieldList] = js.undefined
    ): LineChartAggregatedFieldWells = {
      val __obj = js.Dynamic.literal()
      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      Colors.foreach(__v => __obj.updateDynamic("Colors")(__v.asInstanceOf[js.Any]))
      SmallMultiples.foreach(__v => __obj.updateDynamic("SmallMultiples")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LineChartAggregatedFieldWells]
    }
  }

  /** The configuration of a line chart.
    */
  @js.native
  trait LineChartConfiguration extends js.Object {
    var ContributionAnalysisDefaults: js.UndefOr[ContributionAnalysisDefaultList]
    var DataLabels: js.UndefOr[DataLabelOptions]
    var DefaultSeriesSettings: js.UndefOr[LineChartDefaultSeriesSettings]
    var FieldWells: js.UndefOr[LineChartFieldWells]
    var ForecastConfigurations: js.UndefOr[ForecastConfigurationList]
    var Legend: js.UndefOr[LegendOptions]
    var PrimaryYAxisDisplayOptions: js.UndefOr[LineSeriesAxisDisplayOptions]
    var PrimaryYAxisLabelOptions: js.UndefOr[ChartAxisLabelOptions]
    var ReferenceLines: js.UndefOr[ReferenceLineList]
    var SecondaryYAxisDisplayOptions: js.UndefOr[LineSeriesAxisDisplayOptions]
    var SecondaryYAxisLabelOptions: js.UndefOr[ChartAxisLabelOptions]
    var Series: js.UndefOr[SeriesItemList]
    var SmallMultiplesOptions: js.UndefOr[SmallMultiplesOptions]
    var SortConfiguration: js.UndefOr[LineChartSortConfiguration]
    var Tooltip: js.UndefOr[TooltipOptions]
    var Type: js.UndefOr[LineChartType]
    var VisualPalette: js.UndefOr[VisualPalette]
    var XAxisDisplayOptions: js.UndefOr[AxisDisplayOptions]
    var XAxisLabelOptions: js.UndefOr[ChartAxisLabelOptions]
  }

  object LineChartConfiguration {
    @inline
    def apply(
        ContributionAnalysisDefaults: js.UndefOr[ContributionAnalysisDefaultList] = js.undefined,
        DataLabels: js.UndefOr[DataLabelOptions] = js.undefined,
        DefaultSeriesSettings: js.UndefOr[LineChartDefaultSeriesSettings] = js.undefined,
        FieldWells: js.UndefOr[LineChartFieldWells] = js.undefined,
        ForecastConfigurations: js.UndefOr[ForecastConfigurationList] = js.undefined,
        Legend: js.UndefOr[LegendOptions] = js.undefined,
        PrimaryYAxisDisplayOptions: js.UndefOr[LineSeriesAxisDisplayOptions] = js.undefined,
        PrimaryYAxisLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined,
        ReferenceLines: js.UndefOr[ReferenceLineList] = js.undefined,
        SecondaryYAxisDisplayOptions: js.UndefOr[LineSeriesAxisDisplayOptions] = js.undefined,
        SecondaryYAxisLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined,
        Series: js.UndefOr[SeriesItemList] = js.undefined,
        SmallMultiplesOptions: js.UndefOr[SmallMultiplesOptions] = js.undefined,
        SortConfiguration: js.UndefOr[LineChartSortConfiguration] = js.undefined,
        Tooltip: js.UndefOr[TooltipOptions] = js.undefined,
        Type: js.UndefOr[LineChartType] = js.undefined,
        VisualPalette: js.UndefOr[VisualPalette] = js.undefined,
        XAxisDisplayOptions: js.UndefOr[AxisDisplayOptions] = js.undefined,
        XAxisLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined
    ): LineChartConfiguration = {
      val __obj = js.Dynamic.literal()
      ContributionAnalysisDefaults.foreach(__v => __obj.updateDynamic("ContributionAnalysisDefaults")(__v.asInstanceOf[js.Any]))
      DataLabels.foreach(__v => __obj.updateDynamic("DataLabels")(__v.asInstanceOf[js.Any]))
      DefaultSeriesSettings.foreach(__v => __obj.updateDynamic("DefaultSeriesSettings")(__v.asInstanceOf[js.Any]))
      FieldWells.foreach(__v => __obj.updateDynamic("FieldWells")(__v.asInstanceOf[js.Any]))
      ForecastConfigurations.foreach(__v => __obj.updateDynamic("ForecastConfigurations")(__v.asInstanceOf[js.Any]))
      Legend.foreach(__v => __obj.updateDynamic("Legend")(__v.asInstanceOf[js.Any]))
      PrimaryYAxisDisplayOptions.foreach(__v => __obj.updateDynamic("PrimaryYAxisDisplayOptions")(__v.asInstanceOf[js.Any]))
      PrimaryYAxisLabelOptions.foreach(__v => __obj.updateDynamic("PrimaryYAxisLabelOptions")(__v.asInstanceOf[js.Any]))
      ReferenceLines.foreach(__v => __obj.updateDynamic("ReferenceLines")(__v.asInstanceOf[js.Any]))
      SecondaryYAxisDisplayOptions.foreach(__v => __obj.updateDynamic("SecondaryYAxisDisplayOptions")(__v.asInstanceOf[js.Any]))
      SecondaryYAxisLabelOptions.foreach(__v => __obj.updateDynamic("SecondaryYAxisLabelOptions")(__v.asInstanceOf[js.Any]))
      Series.foreach(__v => __obj.updateDynamic("Series")(__v.asInstanceOf[js.Any]))
      SmallMultiplesOptions.foreach(__v => __obj.updateDynamic("SmallMultiplesOptions")(__v.asInstanceOf[js.Any]))
      SortConfiguration.foreach(__v => __obj.updateDynamic("SortConfiguration")(__v.asInstanceOf[js.Any]))
      Tooltip.foreach(__v => __obj.updateDynamic("Tooltip")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      VisualPalette.foreach(__v => __obj.updateDynamic("VisualPalette")(__v.asInstanceOf[js.Any]))
      XAxisDisplayOptions.foreach(__v => __obj.updateDynamic("XAxisDisplayOptions")(__v.asInstanceOf[js.Any]))
      XAxisLabelOptions.foreach(__v => __obj.updateDynamic("XAxisLabelOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LineChartConfiguration]
    }
  }

  /** The options that determine the default presentation of all line series in <code>LineChartVisual</code>.
    */
  @js.native
  trait LineChartDefaultSeriesSettings extends js.Object {
    var AxisBinding: js.UndefOr[AxisBinding]
    var LineStyleSettings: js.UndefOr[LineChartLineStyleSettings]
    var MarkerStyleSettings: js.UndefOr[LineChartMarkerStyleSettings]
  }

  object LineChartDefaultSeriesSettings {
    @inline
    def apply(
        AxisBinding: js.UndefOr[AxisBinding] = js.undefined,
        LineStyleSettings: js.UndefOr[LineChartLineStyleSettings] = js.undefined,
        MarkerStyleSettings: js.UndefOr[LineChartMarkerStyleSettings] = js.undefined
    ): LineChartDefaultSeriesSettings = {
      val __obj = js.Dynamic.literal()
      AxisBinding.foreach(__v => __obj.updateDynamic("AxisBinding")(__v.asInstanceOf[js.Any]))
      LineStyleSettings.foreach(__v => __obj.updateDynamic("LineStyleSettings")(__v.asInstanceOf[js.Any]))
      MarkerStyleSettings.foreach(__v => __obj.updateDynamic("MarkerStyleSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LineChartDefaultSeriesSettings]
    }
  }

  /** The field well configuration of a line chart.
    */
  @js.native
  trait LineChartFieldWells extends js.Object {
    var LineChartAggregatedFieldWells: js.UndefOr[LineChartAggregatedFieldWells]
  }

  object LineChartFieldWells {
    @inline
    def apply(
        LineChartAggregatedFieldWells: js.UndefOr[LineChartAggregatedFieldWells] = js.undefined
    ): LineChartFieldWells = {
      val __obj = js.Dynamic.literal()
      LineChartAggregatedFieldWells.foreach(__v => __obj.updateDynamic("LineChartAggregatedFieldWells")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LineChartFieldWells]
    }
  }

  /** Line styles options for a line series in <code>LineChartVisual</code>.
    */
  @js.native
  trait LineChartLineStyleSettings extends js.Object {
    var LineInterpolation: js.UndefOr[LineInterpolation]
    var LineStyle: js.UndefOr[LineChartLineStyle]
    var LineVisibility: js.UndefOr[Visibility]
    var LineWidth: js.UndefOr[PixelLength]
  }

  object LineChartLineStyleSettings {
    @inline
    def apply(
        LineInterpolation: js.UndefOr[LineInterpolation] = js.undefined,
        LineStyle: js.UndefOr[LineChartLineStyle] = js.undefined,
        LineVisibility: js.UndefOr[Visibility] = js.undefined,
        LineWidth: js.UndefOr[PixelLength] = js.undefined
    ): LineChartLineStyleSettings = {
      val __obj = js.Dynamic.literal()
      LineInterpolation.foreach(__v => __obj.updateDynamic("LineInterpolation")(__v.asInstanceOf[js.Any]))
      LineStyle.foreach(__v => __obj.updateDynamic("LineStyle")(__v.asInstanceOf[js.Any]))
      LineVisibility.foreach(__v => __obj.updateDynamic("LineVisibility")(__v.asInstanceOf[js.Any]))
      LineWidth.foreach(__v => __obj.updateDynamic("LineWidth")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LineChartLineStyleSettings]
    }
  }

  /** Marker styles options for a line series in <code>LineChartVisual</code>.
    */
  @js.native
  trait LineChartMarkerStyleSettings extends js.Object {
    var MarkerColor: js.UndefOr[HexColor]
    var MarkerShape: js.UndefOr[LineChartMarkerShape]
    var MarkerSize: js.UndefOr[PixelLength]
    var MarkerVisibility: js.UndefOr[Visibility]
  }

  object LineChartMarkerStyleSettings {
    @inline
    def apply(
        MarkerColor: js.UndefOr[HexColor] = js.undefined,
        MarkerShape: js.UndefOr[LineChartMarkerShape] = js.undefined,
        MarkerSize: js.UndefOr[PixelLength] = js.undefined,
        MarkerVisibility: js.UndefOr[Visibility] = js.undefined
    ): LineChartMarkerStyleSettings = {
      val __obj = js.Dynamic.literal()
      MarkerColor.foreach(__v => __obj.updateDynamic("MarkerColor")(__v.asInstanceOf[js.Any]))
      MarkerShape.foreach(__v => __obj.updateDynamic("MarkerShape")(__v.asInstanceOf[js.Any]))
      MarkerSize.foreach(__v => __obj.updateDynamic("MarkerSize")(__v.asInstanceOf[js.Any]))
      MarkerVisibility.foreach(__v => __obj.updateDynamic("MarkerVisibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LineChartMarkerStyleSettings]
    }
  }

  /** The options that determine the presentation of a line series in the visual
    */
  @js.native
  trait LineChartSeriesSettings extends js.Object {
    var LineStyleSettings: js.UndefOr[LineChartLineStyleSettings]
    var MarkerStyleSettings: js.UndefOr[LineChartMarkerStyleSettings]
  }

  object LineChartSeriesSettings {
    @inline
    def apply(
        LineStyleSettings: js.UndefOr[LineChartLineStyleSettings] = js.undefined,
        MarkerStyleSettings: js.UndefOr[LineChartMarkerStyleSettings] = js.undefined
    ): LineChartSeriesSettings = {
      val __obj = js.Dynamic.literal()
      LineStyleSettings.foreach(__v => __obj.updateDynamic("LineStyleSettings")(__v.asInstanceOf[js.Any]))
      MarkerStyleSettings.foreach(__v => __obj.updateDynamic("MarkerStyleSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LineChartSeriesSettings]
    }
  }

  /** The sort configuration of a line chart.
    */
  @js.native
  trait LineChartSortConfiguration extends js.Object {
    var CategoryItemsLimitConfiguration: js.UndefOr[ItemsLimitConfiguration]
    var CategorySort: js.UndefOr[FieldSortOptionsList]
    var ColorItemsLimitConfiguration: js.UndefOr[ItemsLimitConfiguration]
    var SmallMultiplesLimitConfiguration: js.UndefOr[ItemsLimitConfiguration]
    var SmallMultiplesSort: js.UndefOr[FieldSortOptionsList]
  }

  object LineChartSortConfiguration {
    @inline
    def apply(
        CategoryItemsLimitConfiguration: js.UndefOr[ItemsLimitConfiguration] = js.undefined,
        CategorySort: js.UndefOr[FieldSortOptionsList] = js.undefined,
        ColorItemsLimitConfiguration: js.UndefOr[ItemsLimitConfiguration] = js.undefined,
        SmallMultiplesLimitConfiguration: js.UndefOr[ItemsLimitConfiguration] = js.undefined,
        SmallMultiplesSort: js.UndefOr[FieldSortOptionsList] = js.undefined
    ): LineChartSortConfiguration = {
      val __obj = js.Dynamic.literal()
      CategoryItemsLimitConfiguration.foreach(__v => __obj.updateDynamic("CategoryItemsLimitConfiguration")(__v.asInstanceOf[js.Any]))
      CategorySort.foreach(__v => __obj.updateDynamic("CategorySort")(__v.asInstanceOf[js.Any]))
      ColorItemsLimitConfiguration.foreach(__v => __obj.updateDynamic("ColorItemsLimitConfiguration")(__v.asInstanceOf[js.Any]))
      SmallMultiplesLimitConfiguration.foreach(__v => __obj.updateDynamic("SmallMultiplesLimitConfiguration")(__v.asInstanceOf[js.Any]))
      SmallMultiplesSort.foreach(__v => __obj.updateDynamic("SmallMultiplesSort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LineChartSortConfiguration]
    }
  }

  /** A line chart. For more information, see [[https://docs.aws.amazon.com/quicksight/latest/user/line-charts.html|Using line charts]] in the <i>Amazon QuickSight User Guide</i>.
    */
  @js.native
  trait LineChartVisual extends js.Object {
    var VisualId: ShortRestrictiveResourceId
    var Actions: js.UndefOr[VisualCustomActionList]
    var ChartConfiguration: js.UndefOr[LineChartConfiguration]
    var ColumnHierarchies: js.UndefOr[ColumnHierarchyList]
    var Subtitle: js.UndefOr[VisualSubtitleLabelOptions]
    var Title: js.UndefOr[VisualTitleLabelOptions]
  }

  object LineChartVisual {
    @inline
    def apply(
        VisualId: ShortRestrictiveResourceId,
        Actions: js.UndefOr[VisualCustomActionList] = js.undefined,
        ChartConfiguration: js.UndefOr[LineChartConfiguration] = js.undefined,
        ColumnHierarchies: js.UndefOr[ColumnHierarchyList] = js.undefined,
        Subtitle: js.UndefOr[VisualSubtitleLabelOptions] = js.undefined,
        Title: js.UndefOr[VisualTitleLabelOptions] = js.undefined
    ): LineChartVisual = {
      val __obj = js.Dynamic.literal(
        "VisualId" -> VisualId.asInstanceOf[js.Any]
      )

      Actions.foreach(__v => __obj.updateDynamic("Actions")(__v.asInstanceOf[js.Any]))
      ChartConfiguration.foreach(__v => __obj.updateDynamic("ChartConfiguration")(__v.asInstanceOf[js.Any]))
      ColumnHierarchies.foreach(__v => __obj.updateDynamic("ColumnHierarchies")(__v.asInstanceOf[js.Any]))
      Subtitle.foreach(__v => __obj.updateDynamic("Subtitle")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LineChartVisual]
    }
  }

  /** The series axis configuration of a line chart.
    */
  @js.native
  trait LineSeriesAxisDisplayOptions extends js.Object {
    var AxisOptions: js.UndefOr[AxisDisplayOptions]
    var MissingDataConfigurations: js.UndefOr[MissingDataConfigurationList]
  }

  object LineSeriesAxisDisplayOptions {
    @inline
    def apply(
        AxisOptions: js.UndefOr[AxisDisplayOptions] = js.undefined,
        MissingDataConfigurations: js.UndefOr[MissingDataConfigurationList] = js.undefined
    ): LineSeriesAxisDisplayOptions = {
      val __obj = js.Dynamic.literal()
      AxisOptions.foreach(__v => __obj.updateDynamic("AxisOptions")(__v.asInstanceOf[js.Any]))
      MissingDataConfigurations.foreach(__v => __obj.updateDynamic("MissingDataConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LineSeriesAxisDisplayOptions]
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

  /** The display options of a control.
    */
  @js.native
  trait ListControlDisplayOptions extends js.Object {
    var SearchOptions: js.UndefOr[ListControlSearchOptions]
    var SelectAllOptions: js.UndefOr[ListControlSelectAllOptions]
    var TitleOptions: js.UndefOr[LabelOptions]
  }

  object ListControlDisplayOptions {
    @inline
    def apply(
        SearchOptions: js.UndefOr[ListControlSearchOptions] = js.undefined,
        SelectAllOptions: js.UndefOr[ListControlSelectAllOptions] = js.undefined,
        TitleOptions: js.UndefOr[LabelOptions] = js.undefined
    ): ListControlDisplayOptions = {
      val __obj = js.Dynamic.literal()
      SearchOptions.foreach(__v => __obj.updateDynamic("SearchOptions")(__v.asInstanceOf[js.Any]))
      SelectAllOptions.foreach(__v => __obj.updateDynamic("SelectAllOptions")(__v.asInstanceOf[js.Any]))
      TitleOptions.foreach(__v => __obj.updateDynamic("TitleOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListControlDisplayOptions]
    }
  }

  /** The configuration of the search options in a list control.
    */
  @js.native
  trait ListControlSearchOptions extends js.Object {
    var Visibility: js.UndefOr[Visibility]
  }

  object ListControlSearchOptions {
    @inline
    def apply(
        Visibility: js.UndefOr[Visibility] = js.undefined
    ): ListControlSearchOptions = {
      val __obj = js.Dynamic.literal()
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListControlSearchOptions]
    }
  }

  /** The configuration of the <code>Select all</code> options in a list control.
    */
  @js.native
  trait ListControlSelectAllOptions extends js.Object {
    var Visibility: js.UndefOr[Visibility]
  }

  object ListControlSelectAllOptions {
    @inline
    def apply(
        Visibility: js.UndefOr[Visibility] = js.undefined
    ): ListControlSelectAllOptions = {
      val __obj = js.Dynamic.literal()
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListControlSelectAllOptions]
    }
  }

  @js.native
  trait ListDashboardVersionsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var DashboardId: ShortRestrictiveResourceId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListDashboardVersionsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DashboardId: ShortRestrictiveResourceId,
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
    var TemplateId: ShortRestrictiveResourceId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListTemplateAliasesRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        TemplateId: ShortRestrictiveResourceId,
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
    var TemplateId: ShortRestrictiveResourceId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListTemplateVersionsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        TemplateId: ShortRestrictiveResourceId,
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
    var ThemeId: ShortRestrictiveResourceId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListThemeAliasesRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        ThemeId: ShortRestrictiveResourceId,
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
    var ThemeId: ShortRestrictiveResourceId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object ListThemeVersionsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        ThemeId: ShortRestrictiveResourceId,
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

  /** The configuration of loading animation in free-form layout.
    */
  @js.native
  trait LoadingAnimation extends js.Object {
    var Visibility: js.UndefOr[Visibility]
  }

  object LoadingAnimation {
    @inline
    def apply(
        Visibility: js.UndefOr[Visibility] = js.undefined
    ): LoadingAnimation = {
      val __obj = js.Dynamic.literal()
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoadingAnimation]
    }
  }

  /** The navigation configuration for <code>CustomActionNavigationOperation</code>.
    */
  @js.native
  trait LocalNavigationConfiguration extends js.Object {
    var TargetSheetId: ShortRestrictiveResourceId
  }

  object LocalNavigationConfiguration {
    @inline
    def apply(
        TargetSheetId: ShortRestrictiveResourceId
    ): LocalNavigationConfiguration = {
      val __obj = js.Dynamic.literal(
        "TargetSheetId" -> TargetSheetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LocalNavigationConfiguration]
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

  /** The text format for a subtitle. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait LongFormatText extends js.Object {
    var PlainText: js.UndefOr[LongPlainText]
    var RichText: js.UndefOr[LongRichText]
  }

  object LongFormatText {
    @inline
    def apply(
        PlainText: js.UndefOr[LongPlainText] = js.undefined,
        RichText: js.UndefOr[LongRichText] = js.undefined
    ): LongFormatText = {
      val __obj = js.Dynamic.literal()
      PlainText.foreach(__v => __obj.updateDynamic("PlainText")(__v.asInstanceOf[js.Any]))
      RichText.foreach(__v => __obj.updateDynamic("RichText")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LongFormatText]
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

  /** The maximum label of a data path label.
    */
  @js.native
  trait MaximumLabelType extends js.Object {
    var Visibility: js.UndefOr[Visibility]
  }

  object MaximumLabelType {
    @inline
    def apply(
        Visibility: js.UndefOr[Visibility] = js.undefined
    ): MaximumLabelType = {
      val __obj = js.Dynamic.literal()
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaximumLabelType]
    }
  }

  /** The maximum and minimum computation configuration.
    */
  @js.native
  trait MaximumMinimumComputation extends js.Object {
    var ComputationId: ShortRestrictiveResourceId
    var Time: DimensionField
    var Type: MaximumMinimumComputationType
    var Name: js.UndefOr[String]
    var Value: js.UndefOr[MeasureField]
  }

  object MaximumMinimumComputation {
    @inline
    def apply(
        ComputationId: ShortRestrictiveResourceId,
        Time: DimensionField,
        Type: MaximumMinimumComputationType,
        Name: js.UndefOr[String] = js.undefined,
        Value: js.UndefOr[MeasureField] = js.undefined
    ): MaximumMinimumComputation = {
      val __obj = js.Dynamic.literal(
        "ComputationId" -> ComputationId.asInstanceOf[js.Any],
        "Time" -> Time.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaximumMinimumComputation]
    }
  }

  /** The measure (metric) type field.
    */
  @js.native
  trait MeasureField extends js.Object {
    var CalculatedMeasureField: js.UndefOr[CalculatedMeasureField]
    var CategoricalMeasureField: js.UndefOr[CategoricalMeasureField]
    var DateMeasureField: js.UndefOr[DateMeasureField]
    var NumericalMeasureField: js.UndefOr[NumericalMeasureField]
  }

  object MeasureField {
    @inline
    def apply(
        CalculatedMeasureField: js.UndefOr[CalculatedMeasureField] = js.undefined,
        CategoricalMeasureField: js.UndefOr[CategoricalMeasureField] = js.undefined,
        DateMeasureField: js.UndefOr[DateMeasureField] = js.undefined,
        NumericalMeasureField: js.UndefOr[NumericalMeasureField] = js.undefined
    ): MeasureField = {
      val __obj = js.Dynamic.literal()
      CalculatedMeasureField.foreach(__v => __obj.updateDynamic("CalculatedMeasureField")(__v.asInstanceOf[js.Any]))
      CategoricalMeasureField.foreach(__v => __obj.updateDynamic("CategoricalMeasureField")(__v.asInstanceOf[js.Any]))
      DateMeasureField.foreach(__v => __obj.updateDynamic("DateMeasureField")(__v.asInstanceOf[js.Any]))
      NumericalMeasureField.foreach(__v => __obj.updateDynamic("NumericalMeasureField")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MeasureField]
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

  /** The metric comparison computation configuration.
    */
  @js.native
  trait MetricComparisonComputation extends js.Object {
    var ComputationId: ShortRestrictiveResourceId
    var FromValue: MeasureField
    var TargetValue: MeasureField
    var Time: DimensionField
    var Name: js.UndefOr[String]
  }

  object MetricComparisonComputation {
    @inline
    def apply(
        ComputationId: ShortRestrictiveResourceId,
        FromValue: MeasureField,
        TargetValue: MeasureField,
        Time: DimensionField,
        Name: js.UndefOr[String] = js.undefined
    ): MetricComparisonComputation = {
      val __obj = js.Dynamic.literal(
        "ComputationId" -> ComputationId.asInstanceOf[js.Any],
        "FromValue" -> FromValue.asInstanceOf[js.Any],
        "TargetValue" -> TargetValue.asInstanceOf[js.Any],
        "Time" -> Time.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MetricComparisonComputation]
    }
  }

  /** The minimum label of a data path label.
    */
  @js.native
  trait MinimumLabelType extends js.Object {
    var Visibility: js.UndefOr[Visibility]
  }

  object MinimumLabelType {
    @inline
    def apply(
        Visibility: js.UndefOr[Visibility] = js.undefined
    ): MinimumLabelType = {
      val __obj = js.Dynamic.literal()
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MinimumLabelType]
    }
  }

  /** The configuration options that determine how missing data is treated during the rendering of a line chart.
    */
  @js.native
  trait MissingDataConfiguration extends js.Object {
    var TreatmentOption: js.UndefOr[MissingDataTreatmentOption]
  }

  object MissingDataConfiguration {
    @inline
    def apply(
        TreatmentOption: js.UndefOr[MissingDataTreatmentOption] = js.undefined
    ): MissingDataConfiguration = {
      val __obj = js.Dynamic.literal()
      TreatmentOption.foreach(__v => __obj.updateDynamic("TreatmentOption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MissingDataConfiguration]
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

  /** The options that determine the negative value configuration.
    */
  @js.native
  trait NegativeValueConfiguration extends js.Object {
    var DisplayMode: NegativeValueDisplayMode
  }

  object NegativeValueConfiguration {
    @inline
    def apply(
        DisplayMode: NegativeValueDisplayMode
    ): NegativeValueConfiguration = {
      val __obj = js.Dynamic.literal(
        "DisplayMode" -> DisplayMode.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[NegativeValueConfiguration]
    }
  }

  /** The options that determine the null value format configuration.
    */
  @js.native
  trait NullValueFormatConfiguration extends js.Object {
    var NullString: NullString
  }

  object NullValueFormatConfiguration {
    @inline
    def apply(
        NullString: NullString
    ): NullValueFormatConfiguration = {
      val __obj = js.Dynamic.literal(
        "NullString" -> NullString.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[NullValueFormatConfiguration]
    }
  }

  /** The options that determine the number display format configuration.
    */
  @js.native
  trait NumberDisplayFormatConfiguration extends js.Object {
    var DecimalPlacesConfiguration: js.UndefOr[DecimalPlacesConfiguration]
    var NegativeValueConfiguration: js.UndefOr[NegativeValueConfiguration]
    var NullValueFormatConfiguration: js.UndefOr[NullValueFormatConfiguration]
    var NumberScale: js.UndefOr[NumberScale]
    var Prefix: js.UndefOr[Prefix]
    var SeparatorConfiguration: js.UndefOr[NumericSeparatorConfiguration]
    var Suffix: js.UndefOr[Suffix]
  }

  object NumberDisplayFormatConfiguration {
    @inline
    def apply(
        DecimalPlacesConfiguration: js.UndefOr[DecimalPlacesConfiguration] = js.undefined,
        NegativeValueConfiguration: js.UndefOr[NegativeValueConfiguration] = js.undefined,
        NullValueFormatConfiguration: js.UndefOr[NullValueFormatConfiguration] = js.undefined,
        NumberScale: js.UndefOr[NumberScale] = js.undefined,
        Prefix: js.UndefOr[Prefix] = js.undefined,
        SeparatorConfiguration: js.UndefOr[NumericSeparatorConfiguration] = js.undefined,
        Suffix: js.UndefOr[Suffix] = js.undefined
    ): NumberDisplayFormatConfiguration = {
      val __obj = js.Dynamic.literal()
      DecimalPlacesConfiguration.foreach(__v => __obj.updateDynamic("DecimalPlacesConfiguration")(__v.asInstanceOf[js.Any]))
      NegativeValueConfiguration.foreach(__v => __obj.updateDynamic("NegativeValueConfiguration")(__v.asInstanceOf[js.Any]))
      NullValueFormatConfiguration.foreach(__v => __obj.updateDynamic("NullValueFormatConfiguration")(__v.asInstanceOf[js.Any]))
      NumberScale.foreach(__v => __obj.updateDynamic("NumberScale")(__v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.updateDynamic("Prefix")(__v.asInstanceOf[js.Any]))
      SeparatorConfiguration.foreach(__v => __obj.updateDynamic("SeparatorConfiguration")(__v.asInstanceOf[js.Any]))
      Suffix.foreach(__v => __obj.updateDynamic("Suffix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NumberDisplayFormatConfiguration]
    }
  }

  /** Formatting configuration for number fields.
    */
  @js.native
  trait NumberFormatConfiguration extends js.Object {
    var FormatConfiguration: js.UndefOr[NumericFormatConfiguration]
  }

  object NumberFormatConfiguration {
    @inline
    def apply(
        FormatConfiguration: js.UndefOr[NumericFormatConfiguration] = js.undefined
    ): NumberFormatConfiguration = {
      val __obj = js.Dynamic.literal()
      FormatConfiguration.foreach(__v => __obj.updateDynamic("FormatConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NumberFormatConfiguration]
    }
  }

  /** The options for an axis with a numeric field.
    */
  @js.native
  trait NumericAxisOptions extends js.Object {
    var Range: js.UndefOr[AxisDisplayRange]
    var Scale: js.UndefOr[AxisScale]
  }

  object NumericAxisOptions {
    @inline
    def apply(
        Range: js.UndefOr[AxisDisplayRange] = js.undefined,
        Scale: js.UndefOr[AxisScale] = js.undefined
    ): NumericAxisOptions = {
      val __obj = js.Dynamic.literal()
      Range.foreach(__v => __obj.updateDynamic("Range")(__v.asInstanceOf[js.Any]))
      Scale.foreach(__v => __obj.updateDynamic("Scale")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NumericAxisOptions]
    }
  }

  /** The category drill down filter.
    */
  @js.native
  trait NumericEqualityDrillDownFilter extends js.Object {
    var Column: ColumnIdentifier
    var Value: Double
  }

  object NumericEqualityDrillDownFilter {
    @inline
    def apply(
        Column: ColumnIdentifier,
        Value: Double
    ): NumericEqualityDrillDownFilter = {
      val __obj = js.Dynamic.literal(
        "Column" -> Column.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[NumericEqualityDrillDownFilter]
    }
  }

  /** A <code>NumericEqualityFilter</code> filters values that are equal to the specified value.
    */
  @js.native
  trait NumericEqualityFilter extends js.Object {
    var Column: ColumnIdentifier
    var FilterId: ShortRestrictiveResourceId
    var MatchOperator: NumericEqualityMatchOperator
    var NullOption: FilterNullOption
    var AggregationFunction: js.UndefOr[AggregationFunction]
    var ParameterName: js.UndefOr[ParameterName]
    var SelectAllOptions: js.UndefOr[NumericFilterSelectAllOptions]
    var Value: js.UndefOr[Double]
  }

  object NumericEqualityFilter {
    @inline
    def apply(
        Column: ColumnIdentifier,
        FilterId: ShortRestrictiveResourceId,
        MatchOperator: NumericEqualityMatchOperator,
        NullOption: FilterNullOption,
        AggregationFunction: js.UndefOr[AggregationFunction] = js.undefined,
        ParameterName: js.UndefOr[ParameterName] = js.undefined,
        SelectAllOptions: js.UndefOr[NumericFilterSelectAllOptions] = js.undefined,
        Value: js.UndefOr[Double] = js.undefined
    ): NumericEqualityFilter = {
      val __obj = js.Dynamic.literal(
        "Column" -> Column.asInstanceOf[js.Any],
        "FilterId" -> FilterId.asInstanceOf[js.Any],
        "MatchOperator" -> MatchOperator.asInstanceOf[js.Any],
        "NullOption" -> NullOption.asInstanceOf[js.Any]
      )

      AggregationFunction.foreach(__v => __obj.updateDynamic("AggregationFunction")(__v.asInstanceOf[js.Any]))
      ParameterName.foreach(__v => __obj.updateDynamic("ParameterName")(__v.asInstanceOf[js.Any]))
      SelectAllOptions.foreach(__v => __obj.updateDynamic("SelectAllOptions")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NumericEqualityFilter]
    }
  }

  /** The options that determine the numeric format configuration. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait NumericFormatConfiguration extends js.Object {
    var CurrencyDisplayFormatConfiguration: js.UndefOr[CurrencyDisplayFormatConfiguration]
    var NumberDisplayFormatConfiguration: js.UndefOr[NumberDisplayFormatConfiguration]
    var PercentageDisplayFormatConfiguration: js.UndefOr[PercentageDisplayFormatConfiguration]
  }

  object NumericFormatConfiguration {
    @inline
    def apply(
        CurrencyDisplayFormatConfiguration: js.UndefOr[CurrencyDisplayFormatConfiguration] = js.undefined,
        NumberDisplayFormatConfiguration: js.UndefOr[NumberDisplayFormatConfiguration] = js.undefined,
        PercentageDisplayFormatConfiguration: js.UndefOr[PercentageDisplayFormatConfiguration] = js.undefined
    ): NumericFormatConfiguration = {
      val __obj = js.Dynamic.literal()
      CurrencyDisplayFormatConfiguration.foreach(__v => __obj.updateDynamic("CurrencyDisplayFormatConfiguration")(__v.asInstanceOf[js.Any]))
      NumberDisplayFormatConfiguration.foreach(__v => __obj.updateDynamic("NumberDisplayFormatConfiguration")(__v.asInstanceOf[js.Any]))
      PercentageDisplayFormatConfiguration.foreach(__v => __obj.updateDynamic("PercentageDisplayFormatConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NumericFormatConfiguration]
    }
  }

  /** A <code>NumericRangeFilter</code> filters values that are within the value range.
    */
  @js.native
  trait NumericRangeFilter extends js.Object {
    var Column: ColumnIdentifier
    var FilterId: ShortRestrictiveResourceId
    var NullOption: FilterNullOption
    var AggregationFunction: js.UndefOr[AggregationFunction]
    var IncludeMaximum: js.UndefOr[Boolean]
    var IncludeMinimum: js.UndefOr[Boolean]
    var RangeMaximum: js.UndefOr[NumericRangeFilterValue]
    var RangeMinimum: js.UndefOr[NumericRangeFilterValue]
    var SelectAllOptions: js.UndefOr[NumericFilterSelectAllOptions]
  }

  object NumericRangeFilter {
    @inline
    def apply(
        Column: ColumnIdentifier,
        FilterId: ShortRestrictiveResourceId,
        NullOption: FilterNullOption,
        AggregationFunction: js.UndefOr[AggregationFunction] = js.undefined,
        IncludeMaximum: js.UndefOr[Boolean] = js.undefined,
        IncludeMinimum: js.UndefOr[Boolean] = js.undefined,
        RangeMaximum: js.UndefOr[NumericRangeFilterValue] = js.undefined,
        RangeMinimum: js.UndefOr[NumericRangeFilterValue] = js.undefined,
        SelectAllOptions: js.UndefOr[NumericFilterSelectAllOptions] = js.undefined
    ): NumericRangeFilter = {
      val __obj = js.Dynamic.literal(
        "Column" -> Column.asInstanceOf[js.Any],
        "FilterId" -> FilterId.asInstanceOf[js.Any],
        "NullOption" -> NullOption.asInstanceOf[js.Any]
      )

      AggregationFunction.foreach(__v => __obj.updateDynamic("AggregationFunction")(__v.asInstanceOf[js.Any]))
      IncludeMaximum.foreach(__v => __obj.updateDynamic("IncludeMaximum")(__v.asInstanceOf[js.Any]))
      IncludeMinimum.foreach(__v => __obj.updateDynamic("IncludeMinimum")(__v.asInstanceOf[js.Any]))
      RangeMaximum.foreach(__v => __obj.updateDynamic("RangeMaximum")(__v.asInstanceOf[js.Any]))
      RangeMinimum.foreach(__v => __obj.updateDynamic("RangeMinimum")(__v.asInstanceOf[js.Any]))
      SelectAllOptions.foreach(__v => __obj.updateDynamic("SelectAllOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NumericRangeFilter]
    }
  }

  /** The value input pf the numeric range filter.
    */
  @js.native
  trait NumericRangeFilterValue extends js.Object {
    var Parameter: js.UndefOr[ParameterName]
    var StaticValue: js.UndefOr[Double]
  }

  object NumericRangeFilterValue {
    @inline
    def apply(
        Parameter: js.UndefOr[ParameterName] = js.undefined,
        StaticValue: js.UndefOr[Double] = js.undefined
    ): NumericRangeFilterValue = {
      val __obj = js.Dynamic.literal()
      Parameter.foreach(__v => __obj.updateDynamic("Parameter")(__v.asInstanceOf[js.Any]))
      StaticValue.foreach(__v => __obj.updateDynamic("StaticValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NumericRangeFilterValue]
    }
  }

  /** The options that determine the numeric separator configuration.
    */
  @js.native
  trait NumericSeparatorConfiguration extends js.Object {
    var DecimalSeparator: js.UndefOr[NumericSeparatorSymbol]
    var ThousandsSeparator: js.UndefOr[ThousandSeparatorOptions]
  }

  object NumericSeparatorConfiguration {
    @inline
    def apply(
        DecimalSeparator: js.UndefOr[NumericSeparatorSymbol] = js.undefined,
        ThousandsSeparator: js.UndefOr[ThousandSeparatorOptions] = js.undefined
    ): NumericSeparatorConfiguration = {
      val __obj = js.Dynamic.literal()
      DecimalSeparator.foreach(__v => __obj.updateDynamic("DecimalSeparator")(__v.asInstanceOf[js.Any]))
      ThousandsSeparator.foreach(__v => __obj.updateDynamic("ThousandsSeparator")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NumericSeparatorConfiguration]
    }
  }

  /** Aggregation for numerical values.
    */
  @js.native
  trait NumericalAggregationFunction extends js.Object {
    var PercentileAggregation: js.UndefOr[PercentileAggregation]
    var SimpleNumericalAggregation: js.UndefOr[SimpleNumericalAggregationFunction]
  }

  object NumericalAggregationFunction {
    @inline
    def apply(
        PercentileAggregation: js.UndefOr[PercentileAggregation] = js.undefined,
        SimpleNumericalAggregation: js.UndefOr[SimpleNumericalAggregationFunction] = js.undefined
    ): NumericalAggregationFunction = {
      val __obj = js.Dynamic.literal()
      PercentileAggregation.foreach(__v => __obj.updateDynamic("PercentileAggregation")(__v.asInstanceOf[js.Any]))
      SimpleNumericalAggregation.foreach(__v => __obj.updateDynamic("SimpleNumericalAggregation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NumericalAggregationFunction]
    }
  }

  /** The dimension type field with numerical type columns.
    */
  @js.native
  trait NumericalDimensionField extends js.Object {
    var Column: ColumnIdentifier
    var FieldId: FieldId
    var FormatConfiguration: js.UndefOr[NumberFormatConfiguration]
    var HierarchyId: js.UndefOr[HierarchyId]
  }

  object NumericalDimensionField {
    @inline
    def apply(
        Column: ColumnIdentifier,
        FieldId: FieldId,
        FormatConfiguration: js.UndefOr[NumberFormatConfiguration] = js.undefined,
        HierarchyId: js.UndefOr[HierarchyId] = js.undefined
    ): NumericalDimensionField = {
      val __obj = js.Dynamic.literal(
        "Column" -> Column.asInstanceOf[js.Any],
        "FieldId" -> FieldId.asInstanceOf[js.Any]
      )

      FormatConfiguration.foreach(__v => __obj.updateDynamic("FormatConfiguration")(__v.asInstanceOf[js.Any]))
      HierarchyId.foreach(__v => __obj.updateDynamic("HierarchyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NumericalDimensionField]
    }
  }

  /** The measure type field with numerical type columns.
    */
  @js.native
  trait NumericalMeasureField extends js.Object {
    var Column: ColumnIdentifier
    var FieldId: FieldId
    var AggregationFunction: js.UndefOr[NumericalAggregationFunction]
    var FormatConfiguration: js.UndefOr[NumberFormatConfiguration]
  }

  object NumericalMeasureField {
    @inline
    def apply(
        Column: ColumnIdentifier,
        FieldId: FieldId,
        AggregationFunction: js.UndefOr[NumericalAggregationFunction] = js.undefined,
        FormatConfiguration: js.UndefOr[NumberFormatConfiguration] = js.undefined
    ): NumericalMeasureField = {
      val __obj = js.Dynamic.literal(
        "Column" -> Column.asInstanceOf[js.Any],
        "FieldId" -> FieldId.asInstanceOf[js.Any]
      )

      AggregationFunction.foreach(__v => __obj.updateDynamic("AggregationFunction")(__v.asInstanceOf[js.Any]))
      FormatConfiguration.foreach(__v => __obj.updateDynamic("FormatConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NumericalMeasureField]
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

  /** The pagination configuration for a table visual or boxplot.
    */
  @js.native
  trait PaginationConfiguration extends js.Object {
    var PageNumber: PageNumber
    var PageSize: Double
  }

  object PaginationConfiguration {
    @inline
    def apply(
        PageNumber: PageNumber,
        PageSize: Double
    ): PaginationConfiguration = {
      val __obj = js.Dynamic.literal(
        "PageNumber" -> PageNumber.asInstanceOf[js.Any],
        "PageSize" -> PageSize.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PaginationConfiguration]
    }
  }

  /** A collection of options that configure how each panel displays in a small multiples chart.
    */
  @js.native
  trait PanelConfiguration extends js.Object {
    var BackgroundColor: js.UndefOr[HexColorWithTransparency]
    var BackgroundVisibility: js.UndefOr[Visibility]
    var BorderColor: js.UndefOr[HexColorWithTransparency]
    var BorderStyle: js.UndefOr[PanelBorderStyle]
    var BorderThickness: js.UndefOr[PixelLength]
    var BorderVisibility: js.UndefOr[Visibility]
    var GutterSpacing: js.UndefOr[PixelLength]
    var GutterVisibility: js.UndefOr[Visibility]
    var Title: js.UndefOr[PanelTitleOptions]
  }

  object PanelConfiguration {
    @inline
    def apply(
        BackgroundColor: js.UndefOr[HexColorWithTransparency] = js.undefined,
        BackgroundVisibility: js.UndefOr[Visibility] = js.undefined,
        BorderColor: js.UndefOr[HexColorWithTransparency] = js.undefined,
        BorderStyle: js.UndefOr[PanelBorderStyle] = js.undefined,
        BorderThickness: js.UndefOr[PixelLength] = js.undefined,
        BorderVisibility: js.UndefOr[Visibility] = js.undefined,
        GutterSpacing: js.UndefOr[PixelLength] = js.undefined,
        GutterVisibility: js.UndefOr[Visibility] = js.undefined,
        Title: js.UndefOr[PanelTitleOptions] = js.undefined
    ): PanelConfiguration = {
      val __obj = js.Dynamic.literal()
      BackgroundColor.foreach(__v => __obj.updateDynamic("BackgroundColor")(__v.asInstanceOf[js.Any]))
      BackgroundVisibility.foreach(__v => __obj.updateDynamic("BackgroundVisibility")(__v.asInstanceOf[js.Any]))
      BorderColor.foreach(__v => __obj.updateDynamic("BorderColor")(__v.asInstanceOf[js.Any]))
      BorderStyle.foreach(__v => __obj.updateDynamic("BorderStyle")(__v.asInstanceOf[js.Any]))
      BorderThickness.foreach(__v => __obj.updateDynamic("BorderThickness")(__v.asInstanceOf[js.Any]))
      BorderVisibility.foreach(__v => __obj.updateDynamic("BorderVisibility")(__v.asInstanceOf[js.Any]))
      GutterSpacing.foreach(__v => __obj.updateDynamic("GutterSpacing")(__v.asInstanceOf[js.Any]))
      GutterVisibility.foreach(__v => __obj.updateDynamic("GutterVisibility")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PanelConfiguration]
    }
  }

  /** The options that determine the title styles for each small multiples panel.
    */
  @js.native
  trait PanelTitleOptions extends js.Object {
    var FontConfiguration: js.UndefOr[FontConfiguration]
    var HorizontalTextAlignment: js.UndefOr[HorizontalTextAlignment]
    var Visibility: js.UndefOr[Visibility]
  }

  object PanelTitleOptions {
    @inline
    def apply(
        FontConfiguration: js.UndefOr[FontConfiguration] = js.undefined,
        HorizontalTextAlignment: js.UndefOr[HorizontalTextAlignment] = js.undefined,
        Visibility: js.UndefOr[Visibility] = js.undefined
    ): PanelTitleOptions = {
      val __obj = js.Dynamic.literal()
      FontConfiguration.foreach(__v => __obj.updateDynamic("FontConfiguration")(__v.asInstanceOf[js.Any]))
      HorizontalTextAlignment.foreach(__v => __obj.updateDynamic("HorizontalTextAlignment")(__v.asInstanceOf[js.Any]))
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PanelTitleOptions]
    }
  }

  /** The control of a parameter that users can interact with in a dashboard or an analysis. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait ParameterControl extends js.Object {
    var DateTimePicker: js.UndefOr[ParameterDateTimePickerControl]
    var Dropdown: js.UndefOr[ParameterDropDownControl]
    var List: js.UndefOr[ParameterListControl]
    var Slider: js.UndefOr[ParameterSliderControl]
    var TextArea: js.UndefOr[ParameterTextAreaControl]
    var TextField: js.UndefOr[ParameterTextFieldControl]
  }

  object ParameterControl {
    @inline
    def apply(
        DateTimePicker: js.UndefOr[ParameterDateTimePickerControl] = js.undefined,
        Dropdown: js.UndefOr[ParameterDropDownControl] = js.undefined,
        List: js.UndefOr[ParameterListControl] = js.undefined,
        Slider: js.UndefOr[ParameterSliderControl] = js.undefined,
        TextArea: js.UndefOr[ParameterTextAreaControl] = js.undefined,
        TextField: js.UndefOr[ParameterTextFieldControl] = js.undefined
    ): ParameterControl = {
      val __obj = js.Dynamic.literal()
      DateTimePicker.foreach(__v => __obj.updateDynamic("DateTimePicker")(__v.asInstanceOf[js.Any]))
      Dropdown.foreach(__v => __obj.updateDynamic("Dropdown")(__v.asInstanceOf[js.Any]))
      List.foreach(__v => __obj.updateDynamic("List")(__v.asInstanceOf[js.Any]))
      Slider.foreach(__v => __obj.updateDynamic("Slider")(__v.asInstanceOf[js.Any]))
      TextArea.foreach(__v => __obj.updateDynamic("TextArea")(__v.asInstanceOf[js.Any]))
      TextField.foreach(__v => __obj.updateDynamic("TextField")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterControl]
    }
  }

  /** A control from a date parameter that specifies date and time.
    */
  @js.native
  trait ParameterDateTimePickerControl extends js.Object {
    var ParameterControlId: ShortRestrictiveResourceId
    var SourceParameterName: ParameterName
    var Title: SheetControlTitle
    var DisplayOptions: js.UndefOr[DateTimePickerControlDisplayOptions]
  }

  object ParameterDateTimePickerControl {
    @inline
    def apply(
        ParameterControlId: ShortRestrictiveResourceId,
        SourceParameterName: ParameterName,
        Title: SheetControlTitle,
        DisplayOptions: js.UndefOr[DateTimePickerControlDisplayOptions] = js.undefined
    ): ParameterDateTimePickerControl = {
      val __obj = js.Dynamic.literal(
        "ParameterControlId" -> ParameterControlId.asInstanceOf[js.Any],
        "SourceParameterName" -> SourceParameterName.asInstanceOf[js.Any],
        "Title" -> Title.asInstanceOf[js.Any]
      )

      DisplayOptions.foreach(__v => __obj.updateDynamic("DisplayOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterDateTimePickerControl]
    }
  }

  /** The declaration definition of a parameter. For more information, see [[https://docs.aws.amazon.com/quicksight/latest/user/parameters-in-quicksight.html|Parameters in Amazon QuickSight]] in the <i>Amazon QuickSight User Guide</i>. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait ParameterDeclaration extends js.Object {
    var DateTimeParameterDeclaration: js.UndefOr[DateTimeParameterDeclaration]
    var DecimalParameterDeclaration: js.UndefOr[DecimalParameterDeclaration]
    var IntegerParameterDeclaration: js.UndefOr[IntegerParameterDeclaration]
    var StringParameterDeclaration: js.UndefOr[StringParameterDeclaration]
  }

  object ParameterDeclaration {
    @inline
    def apply(
        DateTimeParameterDeclaration: js.UndefOr[DateTimeParameterDeclaration] = js.undefined,
        DecimalParameterDeclaration: js.UndefOr[DecimalParameterDeclaration] = js.undefined,
        IntegerParameterDeclaration: js.UndefOr[IntegerParameterDeclaration] = js.undefined,
        StringParameterDeclaration: js.UndefOr[StringParameterDeclaration] = js.undefined
    ): ParameterDeclaration = {
      val __obj = js.Dynamic.literal()
      DateTimeParameterDeclaration.foreach(__v => __obj.updateDynamic("DateTimeParameterDeclaration")(__v.asInstanceOf[js.Any]))
      DecimalParameterDeclaration.foreach(__v => __obj.updateDynamic("DecimalParameterDeclaration")(__v.asInstanceOf[js.Any]))
      IntegerParameterDeclaration.foreach(__v => __obj.updateDynamic("IntegerParameterDeclaration")(__v.asInstanceOf[js.Any]))
      StringParameterDeclaration.foreach(__v => __obj.updateDynamic("StringParameterDeclaration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterDeclaration]
    }
  }

  /** A control to display a dropdown list with buttons that are used to select a single value.
    */
  @js.native
  trait ParameterDropDownControl extends js.Object {
    var ParameterControlId: ShortRestrictiveResourceId
    var SourceParameterName: ParameterName
    var Title: SheetControlTitle
    var CascadingControlConfiguration: js.UndefOr[CascadingControlConfiguration]
    var DisplayOptions: js.UndefOr[DropDownControlDisplayOptions]
    var SelectableValues: js.UndefOr[ParameterSelectableValues]
    var Type: js.UndefOr[SheetControlListType]
  }

  object ParameterDropDownControl {
    @inline
    def apply(
        ParameterControlId: ShortRestrictiveResourceId,
        SourceParameterName: ParameterName,
        Title: SheetControlTitle,
        CascadingControlConfiguration: js.UndefOr[CascadingControlConfiguration] = js.undefined,
        DisplayOptions: js.UndefOr[DropDownControlDisplayOptions] = js.undefined,
        SelectableValues: js.UndefOr[ParameterSelectableValues] = js.undefined,
        Type: js.UndefOr[SheetControlListType] = js.undefined
    ): ParameterDropDownControl = {
      val __obj = js.Dynamic.literal(
        "ParameterControlId" -> ParameterControlId.asInstanceOf[js.Any],
        "SourceParameterName" -> SourceParameterName.asInstanceOf[js.Any],
        "Title" -> Title.asInstanceOf[js.Any]
      )

      CascadingControlConfiguration.foreach(__v => __obj.updateDynamic("CascadingControlConfiguration")(__v.asInstanceOf[js.Any]))
      DisplayOptions.foreach(__v => __obj.updateDynamic("DisplayOptions")(__v.asInstanceOf[js.Any]))
      SelectableValues.foreach(__v => __obj.updateDynamic("SelectableValues")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterDropDownControl]
    }
  }

  /** A control to display a list with buttons or boxes that are used to select either a single value or multiple values.
    */
  @js.native
  trait ParameterListControl extends js.Object {
    var ParameterControlId: ShortRestrictiveResourceId
    var SourceParameterName: ParameterName
    var Title: SheetControlTitle
    var CascadingControlConfiguration: js.UndefOr[CascadingControlConfiguration]
    var DisplayOptions: js.UndefOr[ListControlDisplayOptions]
    var SelectableValues: js.UndefOr[ParameterSelectableValues]
    var Type: js.UndefOr[SheetControlListType]
  }

  object ParameterListControl {
    @inline
    def apply(
        ParameterControlId: ShortRestrictiveResourceId,
        SourceParameterName: ParameterName,
        Title: SheetControlTitle,
        CascadingControlConfiguration: js.UndefOr[CascadingControlConfiguration] = js.undefined,
        DisplayOptions: js.UndefOr[ListControlDisplayOptions] = js.undefined,
        SelectableValues: js.UndefOr[ParameterSelectableValues] = js.undefined,
        Type: js.UndefOr[SheetControlListType] = js.undefined
    ): ParameterListControl = {
      val __obj = js.Dynamic.literal(
        "ParameterControlId" -> ParameterControlId.asInstanceOf[js.Any],
        "SourceParameterName" -> SourceParameterName.asInstanceOf[js.Any],
        "Title" -> Title.asInstanceOf[js.Any]
      )

      CascadingControlConfiguration.foreach(__v => __obj.updateDynamic("CascadingControlConfiguration")(__v.asInstanceOf[js.Any]))
      DisplayOptions.foreach(__v => __obj.updateDynamic("DisplayOptions")(__v.asInstanceOf[js.Any]))
      SelectableValues.foreach(__v => __obj.updateDynamic("SelectableValues")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterListControl]
    }
  }

  /** A list of selectable values that are used in a control.
    */
  @js.native
  trait ParameterSelectableValues extends js.Object {
    var LinkToDataSetColumn: js.UndefOr[ColumnIdentifier]
    var Values: js.UndefOr[ParameterSelectableValueList]
  }

  object ParameterSelectableValues {
    @inline
    def apply(
        LinkToDataSetColumn: js.UndefOr[ColumnIdentifier] = js.undefined,
        Values: js.UndefOr[ParameterSelectableValueList] = js.undefined
    ): ParameterSelectableValues = {
      val __obj = js.Dynamic.literal()
      LinkToDataSetColumn.foreach(__v => __obj.updateDynamic("LinkToDataSetColumn")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterSelectableValues]
    }
  }

  /** A control to display a horizontal toggle bar. This is used to change a value by sliding the toggle.
    */
  @js.native
  trait ParameterSliderControl extends js.Object {
    var MaximumValue: Double
    var MinimumValue: Double
    var ParameterControlId: ShortRestrictiveResourceId
    var SourceParameterName: ParameterName
    var StepSize: Double
    var Title: SheetControlTitle
    var DisplayOptions: js.UndefOr[SliderControlDisplayOptions]
  }

  object ParameterSliderControl {
    @inline
    def apply(
        MaximumValue: Double,
        MinimumValue: Double,
        ParameterControlId: ShortRestrictiveResourceId,
        SourceParameterName: ParameterName,
        StepSize: Double,
        Title: SheetControlTitle,
        DisplayOptions: js.UndefOr[SliderControlDisplayOptions] = js.undefined
    ): ParameterSliderControl = {
      val __obj = js.Dynamic.literal(
        "MaximumValue" -> MaximumValue.asInstanceOf[js.Any],
        "MinimumValue" -> MinimumValue.asInstanceOf[js.Any],
        "ParameterControlId" -> ParameterControlId.asInstanceOf[js.Any],
        "SourceParameterName" -> SourceParameterName.asInstanceOf[js.Any],
        "StepSize" -> StepSize.asInstanceOf[js.Any],
        "Title" -> Title.asInstanceOf[js.Any]
      )

      DisplayOptions.foreach(__v => __obj.updateDynamic("DisplayOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterSliderControl]
    }
  }

  /** A control to display a text box that is used to enter multiple entries.
    */
  @js.native
  trait ParameterTextAreaControl extends js.Object {
    var ParameterControlId: ShortRestrictiveResourceId
    var SourceParameterName: ParameterName
    var Title: SheetControlTitle
    var Delimiter: js.UndefOr[TextAreaControlDelimiter]
    var DisplayOptions: js.UndefOr[TextAreaControlDisplayOptions]
  }

  object ParameterTextAreaControl {
    @inline
    def apply(
        ParameterControlId: ShortRestrictiveResourceId,
        SourceParameterName: ParameterName,
        Title: SheetControlTitle,
        Delimiter: js.UndefOr[TextAreaControlDelimiter] = js.undefined,
        DisplayOptions: js.UndefOr[TextAreaControlDisplayOptions] = js.undefined
    ): ParameterTextAreaControl = {
      val __obj = js.Dynamic.literal(
        "ParameterControlId" -> ParameterControlId.asInstanceOf[js.Any],
        "SourceParameterName" -> SourceParameterName.asInstanceOf[js.Any],
        "Title" -> Title.asInstanceOf[js.Any]
      )

      Delimiter.foreach(__v => __obj.updateDynamic("Delimiter")(__v.asInstanceOf[js.Any]))
      DisplayOptions.foreach(__v => __obj.updateDynamic("DisplayOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterTextAreaControl]
    }
  }

  /** A control to display a text box that is used to enter a single entry.
    */
  @js.native
  trait ParameterTextFieldControl extends js.Object {
    var ParameterControlId: ShortRestrictiveResourceId
    var SourceParameterName: ParameterName
    var Title: SheetControlTitle
    var DisplayOptions: js.UndefOr[TextFieldControlDisplayOptions]
  }

  object ParameterTextFieldControl {
    @inline
    def apply(
        ParameterControlId: ShortRestrictiveResourceId,
        SourceParameterName: ParameterName,
        Title: SheetControlTitle,
        DisplayOptions: js.UndefOr[TextFieldControlDisplayOptions] = js.undefined
    ): ParameterTextFieldControl = {
      val __obj = js.Dynamic.literal(
        "ParameterControlId" -> ParameterControlId.asInstanceOf[js.Any],
        "SourceParameterName" -> SourceParameterName.asInstanceOf[js.Any],
        "Title" -> Title.asInstanceOf[js.Any]
      )

      DisplayOptions.foreach(__v => __obj.updateDynamic("DisplayOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterTextFieldControl]
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

  /** The percent range in the visible range.
    */
  @js.native
  trait PercentVisibleRange extends js.Object {
    var From: js.UndefOr[PercentNumber]
    var To: js.UndefOr[PercentNumber]
  }

  object PercentVisibleRange {
    @inline
    def apply(
        From: js.UndefOr[PercentNumber] = js.undefined,
        To: js.UndefOr[PercentNumber] = js.undefined
    ): PercentVisibleRange = {
      val __obj = js.Dynamic.literal()
      From.foreach(__v => __obj.updateDynamic("From")(__v.asInstanceOf[js.Any]))
      To.foreach(__v => __obj.updateDynamic("To")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PercentVisibleRange]
    }
  }

  /** The options that determine the percentage display format configuration.
    */
  @js.native
  trait PercentageDisplayFormatConfiguration extends js.Object {
    var DecimalPlacesConfiguration: js.UndefOr[DecimalPlacesConfiguration]
    var NegativeValueConfiguration: js.UndefOr[NegativeValueConfiguration]
    var NullValueFormatConfiguration: js.UndefOr[NullValueFormatConfiguration]
    var Prefix: js.UndefOr[Prefix]
    var SeparatorConfiguration: js.UndefOr[NumericSeparatorConfiguration]
    var Suffix: js.UndefOr[Suffix]
  }

  object PercentageDisplayFormatConfiguration {
    @inline
    def apply(
        DecimalPlacesConfiguration: js.UndefOr[DecimalPlacesConfiguration] = js.undefined,
        NegativeValueConfiguration: js.UndefOr[NegativeValueConfiguration] = js.undefined,
        NullValueFormatConfiguration: js.UndefOr[NullValueFormatConfiguration] = js.undefined,
        Prefix: js.UndefOr[Prefix] = js.undefined,
        SeparatorConfiguration: js.UndefOr[NumericSeparatorConfiguration] = js.undefined,
        Suffix: js.UndefOr[Suffix] = js.undefined
    ): PercentageDisplayFormatConfiguration = {
      val __obj = js.Dynamic.literal()
      DecimalPlacesConfiguration.foreach(__v => __obj.updateDynamic("DecimalPlacesConfiguration")(__v.asInstanceOf[js.Any]))
      NegativeValueConfiguration.foreach(__v => __obj.updateDynamic("NegativeValueConfiguration")(__v.asInstanceOf[js.Any]))
      NullValueFormatConfiguration.foreach(__v => __obj.updateDynamic("NullValueFormatConfiguration")(__v.asInstanceOf[js.Any]))
      Prefix.foreach(__v => __obj.updateDynamic("Prefix")(__v.asInstanceOf[js.Any]))
      SeparatorConfiguration.foreach(__v => __obj.updateDynamic("SeparatorConfiguration")(__v.asInstanceOf[js.Any]))
      Suffix.foreach(__v => __obj.updateDynamic("Suffix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PercentageDisplayFormatConfiguration]
    }
  }

  /** An aggregation based on the percentile of values in a dimension or measure.
    */
  @js.native
  trait PercentileAggregation extends js.Object {
    var PercentileValue: js.UndefOr[PercentileValue]
  }

  object PercentileAggregation {
    @inline
    def apply(
        PercentileValue: js.UndefOr[PercentileValue] = js.undefined
    ): PercentileAggregation = {
      val __obj = js.Dynamic.literal()
      PercentileValue.foreach(__v => __obj.updateDynamic("PercentileValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PercentileAggregation]
    }
  }

  /** The period over period computation configuration.
    */
  @js.native
  trait PeriodOverPeriodComputation extends js.Object {
    var ComputationId: ShortRestrictiveResourceId
    var Time: DimensionField
    var Name: js.UndefOr[String]
    var Value: js.UndefOr[MeasureField]
  }

  object PeriodOverPeriodComputation {
    @inline
    def apply(
        ComputationId: ShortRestrictiveResourceId,
        Time: DimensionField,
        Name: js.UndefOr[String] = js.undefined,
        Value: js.UndefOr[MeasureField] = js.undefined
    ): PeriodOverPeriodComputation = {
      val __obj = js.Dynamic.literal(
        "ComputationId" -> ComputationId.asInstanceOf[js.Any],
        "Time" -> Time.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PeriodOverPeriodComputation]
    }
  }

  /** The period to date computation configuration.
    */
  @js.native
  trait PeriodToDateComputation extends js.Object {
    var ComputationId: ShortRestrictiveResourceId
    var Time: DimensionField
    var Name: js.UndefOr[String]
    var PeriodTimeGranularity: js.UndefOr[TimeGranularity]
    var Value: js.UndefOr[MeasureField]
  }

  object PeriodToDateComputation {
    @inline
    def apply(
        ComputationId: ShortRestrictiveResourceId,
        Time: DimensionField,
        Name: js.UndefOr[String] = js.undefined,
        PeriodTimeGranularity: js.UndefOr[TimeGranularity] = js.undefined,
        Value: js.UndefOr[MeasureField] = js.undefined
    ): PeriodToDateComputation = {
      val __obj = js.Dynamic.literal(
        "ComputationId" -> ComputationId.asInstanceOf[js.Any],
        "Time" -> Time.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PeriodTimeGranularity.foreach(__v => __obj.updateDynamic("PeriodTimeGranularity")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PeriodToDateComputation]
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

  /** The field well configuration of a pie chart.
    */
  @js.native
  trait PieChartAggregatedFieldWells extends js.Object {
    var Category: js.UndefOr[DimensionFieldList]
    var SmallMultiples: js.UndefOr[SmallMultiplesDimensionFieldList]
    var Values: js.UndefOr[MeasureFieldList]
  }

  object PieChartAggregatedFieldWells {
    @inline
    def apply(
        Category: js.UndefOr[DimensionFieldList] = js.undefined,
        SmallMultiples: js.UndefOr[SmallMultiplesDimensionFieldList] = js.undefined,
        Values: js.UndefOr[MeasureFieldList] = js.undefined
    ): PieChartAggregatedFieldWells = {
      val __obj = js.Dynamic.literal()
      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      SmallMultiples.foreach(__v => __obj.updateDynamic("SmallMultiples")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PieChartAggregatedFieldWells]
    }
  }

  /** The configuration of a pie chart.
    */
  @js.native
  trait PieChartConfiguration extends js.Object {
    var CategoryLabelOptions: js.UndefOr[ChartAxisLabelOptions]
    var ContributionAnalysisDefaults: js.UndefOr[ContributionAnalysisDefaultList]
    var DataLabels: js.UndefOr[DataLabelOptions]
    var DonutOptions: js.UndefOr[DonutOptions]
    var FieldWells: js.UndefOr[PieChartFieldWells]
    var Legend: js.UndefOr[LegendOptions]
    var SmallMultiplesOptions: js.UndefOr[SmallMultiplesOptions]
    var SortConfiguration: js.UndefOr[PieChartSortConfiguration]
    var Tooltip: js.UndefOr[TooltipOptions]
    var ValueLabelOptions: js.UndefOr[ChartAxisLabelOptions]
    var VisualPalette: js.UndefOr[VisualPalette]
  }

  object PieChartConfiguration {
    @inline
    def apply(
        CategoryLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined,
        ContributionAnalysisDefaults: js.UndefOr[ContributionAnalysisDefaultList] = js.undefined,
        DataLabels: js.UndefOr[DataLabelOptions] = js.undefined,
        DonutOptions: js.UndefOr[DonutOptions] = js.undefined,
        FieldWells: js.UndefOr[PieChartFieldWells] = js.undefined,
        Legend: js.UndefOr[LegendOptions] = js.undefined,
        SmallMultiplesOptions: js.UndefOr[SmallMultiplesOptions] = js.undefined,
        SortConfiguration: js.UndefOr[PieChartSortConfiguration] = js.undefined,
        Tooltip: js.UndefOr[TooltipOptions] = js.undefined,
        ValueLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined,
        VisualPalette: js.UndefOr[VisualPalette] = js.undefined
    ): PieChartConfiguration = {
      val __obj = js.Dynamic.literal()
      CategoryLabelOptions.foreach(__v => __obj.updateDynamic("CategoryLabelOptions")(__v.asInstanceOf[js.Any]))
      ContributionAnalysisDefaults.foreach(__v => __obj.updateDynamic("ContributionAnalysisDefaults")(__v.asInstanceOf[js.Any]))
      DataLabels.foreach(__v => __obj.updateDynamic("DataLabels")(__v.asInstanceOf[js.Any]))
      DonutOptions.foreach(__v => __obj.updateDynamic("DonutOptions")(__v.asInstanceOf[js.Any]))
      FieldWells.foreach(__v => __obj.updateDynamic("FieldWells")(__v.asInstanceOf[js.Any]))
      Legend.foreach(__v => __obj.updateDynamic("Legend")(__v.asInstanceOf[js.Any]))
      SmallMultiplesOptions.foreach(__v => __obj.updateDynamic("SmallMultiplesOptions")(__v.asInstanceOf[js.Any]))
      SortConfiguration.foreach(__v => __obj.updateDynamic("SortConfiguration")(__v.asInstanceOf[js.Any]))
      Tooltip.foreach(__v => __obj.updateDynamic("Tooltip")(__v.asInstanceOf[js.Any]))
      ValueLabelOptions.foreach(__v => __obj.updateDynamic("ValueLabelOptions")(__v.asInstanceOf[js.Any]))
      VisualPalette.foreach(__v => __obj.updateDynamic("VisualPalette")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PieChartConfiguration]
    }
  }

  /** The field well configuration of a pie chart. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait PieChartFieldWells extends js.Object {
    var PieChartAggregatedFieldWells: js.UndefOr[PieChartAggregatedFieldWells]
  }

  object PieChartFieldWells {
    @inline
    def apply(
        PieChartAggregatedFieldWells: js.UndefOr[PieChartAggregatedFieldWells] = js.undefined
    ): PieChartFieldWells = {
      val __obj = js.Dynamic.literal()
      PieChartAggregatedFieldWells.foreach(__v => __obj.updateDynamic("PieChartAggregatedFieldWells")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PieChartFieldWells]
    }
  }

  /** The sort configuration of a pie chart.
    */
  @js.native
  trait PieChartSortConfiguration extends js.Object {
    var CategoryItemsLimit: js.UndefOr[ItemsLimitConfiguration]
    var CategorySort: js.UndefOr[FieldSortOptionsList]
    var SmallMultiplesLimitConfiguration: js.UndefOr[ItemsLimitConfiguration]
    var SmallMultiplesSort: js.UndefOr[FieldSortOptionsList]
  }

  object PieChartSortConfiguration {
    @inline
    def apply(
        CategoryItemsLimit: js.UndefOr[ItemsLimitConfiguration] = js.undefined,
        CategorySort: js.UndefOr[FieldSortOptionsList] = js.undefined,
        SmallMultiplesLimitConfiguration: js.UndefOr[ItemsLimitConfiguration] = js.undefined,
        SmallMultiplesSort: js.UndefOr[FieldSortOptionsList] = js.undefined
    ): PieChartSortConfiguration = {
      val __obj = js.Dynamic.literal()
      CategoryItemsLimit.foreach(__v => __obj.updateDynamic("CategoryItemsLimit")(__v.asInstanceOf[js.Any]))
      CategorySort.foreach(__v => __obj.updateDynamic("CategorySort")(__v.asInstanceOf[js.Any]))
      SmallMultiplesLimitConfiguration.foreach(__v => __obj.updateDynamic("SmallMultiplesLimitConfiguration")(__v.asInstanceOf[js.Any]))
      SmallMultiplesSort.foreach(__v => __obj.updateDynamic("SmallMultiplesSort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PieChartSortConfiguration]
    }
  }

  /** A pie or donut chart. The <code>PieChartVisual</code> structure describes a visual that is a member of the pie chart family. The following charts can be described by using this structure: * Pie charts * Donut charts For more information, see [[https://docs.aws.amazon.com/quicksight/latest/user/pie-chart.html|Using pie charts]] in the <i>Amazon QuickSight User Guide</i>. For more information, see [[https://docs.aws.amazon.com/quicksight/latest/user/donut-chart.html|Using donut charts]] in the <i>Amazon QuickSight User Guide</i>.
    */
  @js.native
  trait PieChartVisual extends js.Object {
    var VisualId: ShortRestrictiveResourceId
    var Actions: js.UndefOr[VisualCustomActionList]
    var ChartConfiguration: js.UndefOr[PieChartConfiguration]
    var ColumnHierarchies: js.UndefOr[ColumnHierarchyList]
    var Subtitle: js.UndefOr[VisualSubtitleLabelOptions]
    var Title: js.UndefOr[VisualTitleLabelOptions]
  }

  object PieChartVisual {
    @inline
    def apply(
        VisualId: ShortRestrictiveResourceId,
        Actions: js.UndefOr[VisualCustomActionList] = js.undefined,
        ChartConfiguration: js.UndefOr[PieChartConfiguration] = js.undefined,
        ColumnHierarchies: js.UndefOr[ColumnHierarchyList] = js.undefined,
        Subtitle: js.UndefOr[VisualSubtitleLabelOptions] = js.undefined,
        Title: js.UndefOr[VisualTitleLabelOptions] = js.undefined
    ): PieChartVisual = {
      val __obj = js.Dynamic.literal(
        "VisualId" -> VisualId.asInstanceOf[js.Any]
      )

      Actions.foreach(__v => __obj.updateDynamic("Actions")(__v.asInstanceOf[js.Any]))
      ChartConfiguration.foreach(__v => __obj.updateDynamic("ChartConfiguration")(__v.asInstanceOf[js.Any]))
      ColumnHierarchies.foreach(__v => __obj.updateDynamic("ColumnHierarchies")(__v.asInstanceOf[js.Any]))
      Subtitle.foreach(__v => __obj.updateDynamic("Subtitle")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PieChartVisual]
    }
  }

  /** The field sort options for a pivot table sort configuration.
    */
  @js.native
  trait PivotFieldSortOptions extends js.Object {
    var FieldId: FieldId
    var SortBy: PivotTableSortBy
  }

  object PivotFieldSortOptions {
    @inline
    def apply(
        FieldId: FieldId,
        SortBy: PivotTableSortBy
    ): PivotFieldSortOptions = {
      val __obj = js.Dynamic.literal(
        "FieldId" -> FieldId.asInstanceOf[js.Any],
        "SortBy" -> SortBy.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PivotFieldSortOptions]
    }
  }

  /** The aggregated field well for the pivot table.
    */
  @js.native
  trait PivotTableAggregatedFieldWells extends js.Object {
    var Columns: js.UndefOr[PivotTableDimensionList]
    var Rows: js.UndefOr[PivotTableDimensionList]
    var Values: js.UndefOr[PivotMeasureFieldList]
  }

  object PivotTableAggregatedFieldWells {
    @inline
    def apply(
        Columns: js.UndefOr[PivotTableDimensionList] = js.undefined,
        Rows: js.UndefOr[PivotTableDimensionList] = js.undefined,
        Values: js.UndefOr[PivotMeasureFieldList] = js.undefined
    ): PivotTableAggregatedFieldWells = {
      val __obj = js.Dynamic.literal()
      Columns.foreach(__v => __obj.updateDynamic("Columns")(__v.asInstanceOf[js.Any]))
      Rows.foreach(__v => __obj.updateDynamic("Rows")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PivotTableAggregatedFieldWells]
    }
  }

  /** The cell conditional formatting option for a pivot table.
    */
  @js.native
  trait PivotTableCellConditionalFormatting extends js.Object {
    var FieldId: FieldId
    var Scope: js.UndefOr[PivotTableConditionalFormattingScope]
    var TextFormat: js.UndefOr[TextConditionalFormat]
  }

  object PivotTableCellConditionalFormatting {
    @inline
    def apply(
        FieldId: FieldId,
        Scope: js.UndefOr[PivotTableConditionalFormattingScope] = js.undefined,
        TextFormat: js.UndefOr[TextConditionalFormat] = js.undefined
    ): PivotTableCellConditionalFormatting = {
      val __obj = js.Dynamic.literal(
        "FieldId" -> FieldId.asInstanceOf[js.Any]
      )

      Scope.foreach(__v => __obj.updateDynamic("Scope")(__v.asInstanceOf[js.Any]))
      TextFormat.foreach(__v => __obj.updateDynamic("TextFormat")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PivotTableCellConditionalFormatting]
    }
  }

  /** The conditional formatting for a <code>PivotTableVisual</code>.
    */
  @js.native
  trait PivotTableConditionalFormatting extends js.Object {
    var ConditionalFormattingOptions: js.UndefOr[PivotTableConditionalFormattingOptionList]
  }

  object PivotTableConditionalFormatting {
    @inline
    def apply(
        ConditionalFormattingOptions: js.UndefOr[PivotTableConditionalFormattingOptionList] = js.undefined
    ): PivotTableConditionalFormatting = {
      val __obj = js.Dynamic.literal()
      ConditionalFormattingOptions.foreach(__v => __obj.updateDynamic("ConditionalFormattingOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PivotTableConditionalFormatting]
    }
  }

  /** Conditional formatting options for a <code>PivotTableVisual</code>.
    */
  @js.native
  trait PivotTableConditionalFormattingOption extends js.Object {
    var Cell: js.UndefOr[PivotTableCellConditionalFormatting]
  }

  object PivotTableConditionalFormattingOption {
    @inline
    def apply(
        Cell: js.UndefOr[PivotTableCellConditionalFormatting] = js.undefined
    ): PivotTableConditionalFormattingOption = {
      val __obj = js.Dynamic.literal()
      Cell.foreach(__v => __obj.updateDynamic("Cell")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PivotTableConditionalFormattingOption]
    }
  }

  /** The scope of the cell for conditional formatting.
    */
  @js.native
  trait PivotTableConditionalFormattingScope extends js.Object {
    var Role: js.UndefOr[PivotTableConditionalFormattingScopeRole]
  }

  object PivotTableConditionalFormattingScope {
    @inline
    def apply(
        Role: js.UndefOr[PivotTableConditionalFormattingScopeRole] = js.undefined
    ): PivotTableConditionalFormattingScope = {
      val __obj = js.Dynamic.literal()
      Role.foreach(__v => __obj.updateDynamic("Role")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PivotTableConditionalFormattingScope]
    }
  }

  /** The configuration for a <code>PivotTableVisual</code>.
    */
  @js.native
  trait PivotTableConfiguration extends js.Object {
    var FieldOptions: js.UndefOr[PivotTableFieldOptions]
    var FieldWells: js.UndefOr[PivotTableFieldWells]
    var PaginatedReportOptions: js.UndefOr[PivotTablePaginatedReportOptions]
    var SortConfiguration: js.UndefOr[PivotTableSortConfiguration]
    var TableOptions: js.UndefOr[PivotTableOptions]
    var TotalOptions: js.UndefOr[PivotTableTotalOptions]
  }

  object PivotTableConfiguration {
    @inline
    def apply(
        FieldOptions: js.UndefOr[PivotTableFieldOptions] = js.undefined,
        FieldWells: js.UndefOr[PivotTableFieldWells] = js.undefined,
        PaginatedReportOptions: js.UndefOr[PivotTablePaginatedReportOptions] = js.undefined,
        SortConfiguration: js.UndefOr[PivotTableSortConfiguration] = js.undefined,
        TableOptions: js.UndefOr[PivotTableOptions] = js.undefined,
        TotalOptions: js.UndefOr[PivotTableTotalOptions] = js.undefined
    ): PivotTableConfiguration = {
      val __obj = js.Dynamic.literal()
      FieldOptions.foreach(__v => __obj.updateDynamic("FieldOptions")(__v.asInstanceOf[js.Any]))
      FieldWells.foreach(__v => __obj.updateDynamic("FieldWells")(__v.asInstanceOf[js.Any]))
      PaginatedReportOptions.foreach(__v => __obj.updateDynamic("PaginatedReportOptions")(__v.asInstanceOf[js.Any]))
      SortConfiguration.foreach(__v => __obj.updateDynamic("SortConfiguration")(__v.asInstanceOf[js.Any]))
      TableOptions.foreach(__v => __obj.updateDynamic("TableOptions")(__v.asInstanceOf[js.Any]))
      TotalOptions.foreach(__v => __obj.updateDynamic("TotalOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PivotTableConfiguration]
    }
  }

  /** The data path options for the pivot table field options.
    */
  @js.native
  trait PivotTableDataPathOption extends js.Object {
    var DataPathList: DataPathValueList
    var Width: js.UndefOr[PixelLength]
  }

  object PivotTableDataPathOption {
    @inline
    def apply(
        DataPathList: DataPathValueList,
        Width: js.UndefOr[PixelLength] = js.undefined
    ): PivotTableDataPathOption = {
      val __obj = js.Dynamic.literal(
        "DataPathList" -> DataPathList.asInstanceOf[js.Any]
      )

      Width.foreach(__v => __obj.updateDynamic("Width")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PivotTableDataPathOption]
    }
  }

  /** The selected field options for the pivot table field options.
    */
  @js.native
  trait PivotTableFieldOption extends js.Object {
    var FieldId: FieldId
    var CustomLabel: js.UndefOr[CustomLabel]
    var Visibility: js.UndefOr[Visibility]
  }

  object PivotTableFieldOption {
    @inline
    def apply(
        FieldId: FieldId,
        CustomLabel: js.UndefOr[CustomLabel] = js.undefined,
        Visibility: js.UndefOr[Visibility] = js.undefined
    ): PivotTableFieldOption = {
      val __obj = js.Dynamic.literal(
        "FieldId" -> FieldId.asInstanceOf[js.Any]
      )

      CustomLabel.foreach(__v => __obj.updateDynamic("CustomLabel")(__v.asInstanceOf[js.Any]))
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PivotTableFieldOption]
    }
  }

  /** The field options for a pivot table visual.
    */
  @js.native
  trait PivotTableFieldOptions extends js.Object {
    var DataPathOptions: js.UndefOr[PivotTableDataPathOptionList]
    var SelectedFieldOptions: js.UndefOr[PivotTableFieldOptionList]
  }

  object PivotTableFieldOptions {
    @inline
    def apply(
        DataPathOptions: js.UndefOr[PivotTableDataPathOptionList] = js.undefined,
        SelectedFieldOptions: js.UndefOr[PivotTableFieldOptionList] = js.undefined
    ): PivotTableFieldOptions = {
      val __obj = js.Dynamic.literal()
      DataPathOptions.foreach(__v => __obj.updateDynamic("DataPathOptions")(__v.asInstanceOf[js.Any]))
      SelectedFieldOptions.foreach(__v => __obj.updateDynamic("SelectedFieldOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PivotTableFieldOptions]
    }
  }

  /** The optional configuration of subtotals cells.
    */
  @js.native
  trait PivotTableFieldSubtotalOptions extends js.Object {
    var FieldId: js.UndefOr[FieldId]
  }

  object PivotTableFieldSubtotalOptions {
    @inline
    def apply(
        FieldId: js.UndefOr[FieldId] = js.undefined
    ): PivotTableFieldSubtotalOptions = {
      val __obj = js.Dynamic.literal()
      FieldId.foreach(__v => __obj.updateDynamic("FieldId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PivotTableFieldSubtotalOptions]
    }
  }

  /** The field wells for a pivot table visual. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait PivotTableFieldWells extends js.Object {
    var PivotTableAggregatedFieldWells: js.UndefOr[PivotTableAggregatedFieldWells]
  }

  object PivotTableFieldWells {
    @inline
    def apply(
        PivotTableAggregatedFieldWells: js.UndefOr[PivotTableAggregatedFieldWells] = js.undefined
    ): PivotTableFieldWells = {
      val __obj = js.Dynamic.literal()
      PivotTableAggregatedFieldWells.foreach(__v => __obj.updateDynamic("PivotTableAggregatedFieldWells")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PivotTableFieldWells]
    }
  }

  /** The table options for a pivot table visual.
    */
  @js.native
  trait PivotTableOptions extends js.Object {
    var CellStyle: js.UndefOr[TableCellStyle]
    var ColumnHeaderStyle: js.UndefOr[TableCellStyle]
    var ColumnNamesVisibility: js.UndefOr[Visibility]
    var MetricPlacement: js.UndefOr[PivotTableMetricPlacement]
    var RowAlternateColorOptions: js.UndefOr[RowAlternateColorOptions]
    var RowFieldNamesStyle: js.UndefOr[TableCellStyle]
    var RowHeaderStyle: js.UndefOr[TableCellStyle]
    var SingleMetricVisibility: js.UndefOr[Visibility]
    var ToggleButtonsVisibility: js.UndefOr[Visibility]
  }

  object PivotTableOptions {
    @inline
    def apply(
        CellStyle: js.UndefOr[TableCellStyle] = js.undefined,
        ColumnHeaderStyle: js.UndefOr[TableCellStyle] = js.undefined,
        ColumnNamesVisibility: js.UndefOr[Visibility] = js.undefined,
        MetricPlacement: js.UndefOr[PivotTableMetricPlacement] = js.undefined,
        RowAlternateColorOptions: js.UndefOr[RowAlternateColorOptions] = js.undefined,
        RowFieldNamesStyle: js.UndefOr[TableCellStyle] = js.undefined,
        RowHeaderStyle: js.UndefOr[TableCellStyle] = js.undefined,
        SingleMetricVisibility: js.UndefOr[Visibility] = js.undefined,
        ToggleButtonsVisibility: js.UndefOr[Visibility] = js.undefined
    ): PivotTableOptions = {
      val __obj = js.Dynamic.literal()
      CellStyle.foreach(__v => __obj.updateDynamic("CellStyle")(__v.asInstanceOf[js.Any]))
      ColumnHeaderStyle.foreach(__v => __obj.updateDynamic("ColumnHeaderStyle")(__v.asInstanceOf[js.Any]))
      ColumnNamesVisibility.foreach(__v => __obj.updateDynamic("ColumnNamesVisibility")(__v.asInstanceOf[js.Any]))
      MetricPlacement.foreach(__v => __obj.updateDynamic("MetricPlacement")(__v.asInstanceOf[js.Any]))
      RowAlternateColorOptions.foreach(__v => __obj.updateDynamic("RowAlternateColorOptions")(__v.asInstanceOf[js.Any]))
      RowFieldNamesStyle.foreach(__v => __obj.updateDynamic("RowFieldNamesStyle")(__v.asInstanceOf[js.Any]))
      RowHeaderStyle.foreach(__v => __obj.updateDynamic("RowHeaderStyle")(__v.asInstanceOf[js.Any]))
      SingleMetricVisibility.foreach(__v => __obj.updateDynamic("SingleMetricVisibility")(__v.asInstanceOf[js.Any]))
      ToggleButtonsVisibility.foreach(__v => __obj.updateDynamic("ToggleButtonsVisibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PivotTableOptions]
    }
  }

  /** The paginated report options for a pivot table visual.
    */
  @js.native
  trait PivotTablePaginatedReportOptions extends js.Object {
    var OverflowColumnHeaderVisibility: js.UndefOr[Visibility]
    var VerticalOverflowVisibility: js.UndefOr[Visibility]
  }

  object PivotTablePaginatedReportOptions {
    @inline
    def apply(
        OverflowColumnHeaderVisibility: js.UndefOr[Visibility] = js.undefined,
        VerticalOverflowVisibility: js.UndefOr[Visibility] = js.undefined
    ): PivotTablePaginatedReportOptions = {
      val __obj = js.Dynamic.literal()
      OverflowColumnHeaderVisibility.foreach(__v => __obj.updateDynamic("OverflowColumnHeaderVisibility")(__v.asInstanceOf[js.Any]))
      VerticalOverflowVisibility.foreach(__v => __obj.updateDynamic("VerticalOverflowVisibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PivotTablePaginatedReportOptions]
    }
  }

  /** The sort by field for the field sort options.
    */
  @js.native
  trait PivotTableSortBy extends js.Object {
    var Column: js.UndefOr[ColumnSort]
    var DataPath: js.UndefOr[DataPathSort]
    var Field: js.UndefOr[FieldSort]
  }

  object PivotTableSortBy {
    @inline
    def apply(
        Column: js.UndefOr[ColumnSort] = js.undefined,
        DataPath: js.UndefOr[DataPathSort] = js.undefined,
        Field: js.UndefOr[FieldSort] = js.undefined
    ): PivotTableSortBy = {
      val __obj = js.Dynamic.literal()
      Column.foreach(__v => __obj.updateDynamic("Column")(__v.asInstanceOf[js.Any]))
      DataPath.foreach(__v => __obj.updateDynamic("DataPath")(__v.asInstanceOf[js.Any]))
      Field.foreach(__v => __obj.updateDynamic("Field")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PivotTableSortBy]
    }
  }

  /** The sort configuration for a <code>PivotTableVisual</code>.
    */
  @js.native
  trait PivotTableSortConfiguration extends js.Object {
    var FieldSortOptions: js.UndefOr[PivotFieldSortOptionsList]
  }

  object PivotTableSortConfiguration {
    @inline
    def apply(
        FieldSortOptions: js.UndefOr[PivotFieldSortOptionsList] = js.undefined
    ): PivotTableSortConfiguration = {
      val __obj = js.Dynamic.literal()
      FieldSortOptions.foreach(__v => __obj.updateDynamic("FieldSortOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PivotTableSortConfiguration]
    }
  }

  /** The total options for a pivot table visual.
    */
  @js.native
  trait PivotTableTotalOptions extends js.Object {
    var ColumnSubtotalOptions: js.UndefOr[SubtotalOptions]
    var ColumnTotalOptions: js.UndefOr[PivotTotalOptions]
    var RowSubtotalOptions: js.UndefOr[SubtotalOptions]
    var RowTotalOptions: js.UndefOr[PivotTotalOptions]
  }

  object PivotTableTotalOptions {
    @inline
    def apply(
        ColumnSubtotalOptions: js.UndefOr[SubtotalOptions] = js.undefined,
        ColumnTotalOptions: js.UndefOr[PivotTotalOptions] = js.undefined,
        RowSubtotalOptions: js.UndefOr[SubtotalOptions] = js.undefined,
        RowTotalOptions: js.UndefOr[PivotTotalOptions] = js.undefined
    ): PivotTableTotalOptions = {
      val __obj = js.Dynamic.literal()
      ColumnSubtotalOptions.foreach(__v => __obj.updateDynamic("ColumnSubtotalOptions")(__v.asInstanceOf[js.Any]))
      ColumnTotalOptions.foreach(__v => __obj.updateDynamic("ColumnTotalOptions")(__v.asInstanceOf[js.Any]))
      RowSubtotalOptions.foreach(__v => __obj.updateDynamic("RowSubtotalOptions")(__v.asInstanceOf[js.Any]))
      RowTotalOptions.foreach(__v => __obj.updateDynamic("RowTotalOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PivotTableTotalOptions]
    }
  }

  /** A pivot table. For more information, see [[https://docs.aws.amazon.com/quicksight/latest/user/pivot-table.html|Using pivot tables]] in the <i>Amazon QuickSight User Guide</i>.
    */
  @js.native
  trait PivotTableVisual extends js.Object {
    var VisualId: ShortRestrictiveResourceId
    var Actions: js.UndefOr[VisualCustomActionList]
    var ChartConfiguration: js.UndefOr[PivotTableConfiguration]
    var ConditionalFormatting: js.UndefOr[PivotTableConditionalFormatting]
    var Subtitle: js.UndefOr[VisualSubtitleLabelOptions]
    var Title: js.UndefOr[VisualTitleLabelOptions]
  }

  object PivotTableVisual {
    @inline
    def apply(
        VisualId: ShortRestrictiveResourceId,
        Actions: js.UndefOr[VisualCustomActionList] = js.undefined,
        ChartConfiguration: js.UndefOr[PivotTableConfiguration] = js.undefined,
        ConditionalFormatting: js.UndefOr[PivotTableConditionalFormatting] = js.undefined,
        Subtitle: js.UndefOr[VisualSubtitleLabelOptions] = js.undefined,
        Title: js.UndefOr[VisualTitleLabelOptions] = js.undefined
    ): PivotTableVisual = {
      val __obj = js.Dynamic.literal(
        "VisualId" -> VisualId.asInstanceOf[js.Any]
      )

      Actions.foreach(__v => __obj.updateDynamic("Actions")(__v.asInstanceOf[js.Any]))
      ChartConfiguration.foreach(__v => __obj.updateDynamic("ChartConfiguration")(__v.asInstanceOf[js.Any]))
      ConditionalFormatting.foreach(__v => __obj.updateDynamic("ConditionalFormatting")(__v.asInstanceOf[js.Any]))
      Subtitle.foreach(__v => __obj.updateDynamic("Subtitle")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PivotTableVisual]
    }
  }

  /** The optional configuration of totals cells in a <code>PivotTableVisual</code>.
    */
  @js.native
  trait PivotTotalOptions extends js.Object {
    var CustomLabel: js.UndefOr[String]
    var MetricHeaderCellStyle: js.UndefOr[TableCellStyle]
    var Placement: js.UndefOr[TableTotalsPlacement]
    var ScrollStatus: js.UndefOr[TableTotalsScrollStatus]
    var TotalCellStyle: js.UndefOr[TableCellStyle]
    var TotalsVisibility: js.UndefOr[Visibility]
    var ValueCellStyle: js.UndefOr[TableCellStyle]
  }

  object PivotTotalOptions {
    @inline
    def apply(
        CustomLabel: js.UndefOr[String] = js.undefined,
        MetricHeaderCellStyle: js.UndefOr[TableCellStyle] = js.undefined,
        Placement: js.UndefOr[TableTotalsPlacement] = js.undefined,
        ScrollStatus: js.UndefOr[TableTotalsScrollStatus] = js.undefined,
        TotalCellStyle: js.UndefOr[TableCellStyle] = js.undefined,
        TotalsVisibility: js.UndefOr[Visibility] = js.undefined,
        ValueCellStyle: js.UndefOr[TableCellStyle] = js.undefined
    ): PivotTotalOptions = {
      val __obj = js.Dynamic.literal()
      CustomLabel.foreach(__v => __obj.updateDynamic("CustomLabel")(__v.asInstanceOf[js.Any]))
      MetricHeaderCellStyle.foreach(__v => __obj.updateDynamic("MetricHeaderCellStyle")(__v.asInstanceOf[js.Any]))
      Placement.foreach(__v => __obj.updateDynamic("Placement")(__v.asInstanceOf[js.Any]))
      ScrollStatus.foreach(__v => __obj.updateDynamic("ScrollStatus")(__v.asInstanceOf[js.Any]))
      TotalCellStyle.foreach(__v => __obj.updateDynamic("TotalCellStyle")(__v.asInstanceOf[js.Any]))
      TotalsVisibility.foreach(__v => __obj.updateDynamic("TotalsVisibility")(__v.asInstanceOf[js.Any]))
      ValueCellStyle.foreach(__v => __obj.updateDynamic("ValueCellStyle")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PivotTotalOptions]
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

  /** The option that determines the hierarchy of the fields that are defined during data preparation. These fields are available to use in any analysis that uses the data source.
    */
  @js.native
  trait PredefinedHierarchy extends js.Object {
    var Columns: PredefinedHierarchyColumnList
    var HierarchyId: HierarchyId
    var DrillDownFilters: js.UndefOr[DrillDownFilterList]
  }

  object PredefinedHierarchy {
    @inline
    def apply(
        Columns: PredefinedHierarchyColumnList,
        HierarchyId: HierarchyId,
        DrillDownFilters: js.UndefOr[DrillDownFilterList] = js.undefined
    ): PredefinedHierarchy = {
      val __obj = js.Dynamic.literal(
        "Columns" -> Columns.asInstanceOf[js.Any],
        "HierarchyId" -> HierarchyId.asInstanceOf[js.Any]
      )

      DrillDownFilters.foreach(__v => __obj.updateDynamic("DrillDownFilters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PredefinedHierarchy]
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

  /** The options that determine the presentation of the progress bar of a KPI visual.
    */
  @js.native
  trait ProgressBarOptions extends js.Object {
    var Visibility: js.UndefOr[Visibility]
  }

  object ProgressBarOptions {
    @inline
    def apply(
        Visibility: js.UndefOr[Visibility] = js.undefined
    ): ProgressBarOptions = {
      val __obj = js.Dynamic.literal()
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProgressBarOptions]
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

  /** The range ends label type of a data path label.
    */
  @js.native
  trait RangeEndsLabelType extends js.Object {
    var Visibility: js.UndefOr[Visibility]
  }

  object RangeEndsLabelType {
    @inline
    def apply(
        Visibility: js.UndefOr[Visibility] = js.undefined
    ): RangeEndsLabelType = {
      val __obj = js.Dynamic.literal()
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RangeEndsLabelType]
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

  /** The reference line visual display options.
    */
  @js.native
  trait ReferenceLine extends js.Object {
    var DataConfiguration: ReferenceLineDataConfiguration
    var LabelConfiguration: js.UndefOr[ReferenceLineLabelConfiguration]
    var Status: js.UndefOr[WidgetStatus]
    var StyleConfiguration: js.UndefOr[ReferenceLineStyleConfiguration]
  }

  object ReferenceLine {
    @inline
    def apply(
        DataConfiguration: ReferenceLineDataConfiguration,
        LabelConfiguration: js.UndefOr[ReferenceLineLabelConfiguration] = js.undefined,
        Status: js.UndefOr[WidgetStatus] = js.undefined,
        StyleConfiguration: js.UndefOr[ReferenceLineStyleConfiguration] = js.undefined
    ): ReferenceLine = {
      val __obj = js.Dynamic.literal(
        "DataConfiguration" -> DataConfiguration.asInstanceOf[js.Any]
      )

      LabelConfiguration.foreach(__v => __obj.updateDynamic("LabelConfiguration")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StyleConfiguration.foreach(__v => __obj.updateDynamic("StyleConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReferenceLine]
    }
  }

  /** The configuration for a custom label on a <code>ReferenceLine</code>.
    */
  @js.native
  trait ReferenceLineCustomLabelConfiguration extends js.Object {
    var CustomLabel: NonEmptyString
  }

  object ReferenceLineCustomLabelConfiguration {
    @inline
    def apply(
        CustomLabel: NonEmptyString
    ): ReferenceLineCustomLabelConfiguration = {
      val __obj = js.Dynamic.literal(
        "CustomLabel" -> CustomLabel.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ReferenceLineCustomLabelConfiguration]
    }
  }

  /** The data configuration of the reference line.
    */
  @js.native
  trait ReferenceLineDataConfiguration extends js.Object {
    var AxisBinding: js.UndefOr[AxisBinding]
    var DynamicConfiguration: js.UndefOr[ReferenceLineDynamicDataConfiguration]
    var StaticConfiguration: js.UndefOr[ReferenceLineStaticDataConfiguration]
  }

  object ReferenceLineDataConfiguration {
    @inline
    def apply(
        AxisBinding: js.UndefOr[AxisBinding] = js.undefined,
        DynamicConfiguration: js.UndefOr[ReferenceLineDynamicDataConfiguration] = js.undefined,
        StaticConfiguration: js.UndefOr[ReferenceLineStaticDataConfiguration] = js.undefined
    ): ReferenceLineDataConfiguration = {
      val __obj = js.Dynamic.literal()
      AxisBinding.foreach(__v => __obj.updateDynamic("AxisBinding")(__v.asInstanceOf[js.Any]))
      DynamicConfiguration.foreach(__v => __obj.updateDynamic("DynamicConfiguration")(__v.asInstanceOf[js.Any]))
      StaticConfiguration.foreach(__v => __obj.updateDynamic("StaticConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReferenceLineDataConfiguration]
    }
  }

  /** The dynamic configuration of the reference line data configuration.
    */
  @js.native
  trait ReferenceLineDynamicDataConfiguration extends js.Object {
    var Calculation: NumericalAggregationFunction
    var Column: ColumnIdentifier
    var MeasureAggregationFunction: AggregationFunction
  }

  object ReferenceLineDynamicDataConfiguration {
    @inline
    def apply(
        Calculation: NumericalAggregationFunction,
        Column: ColumnIdentifier,
        MeasureAggregationFunction: AggregationFunction
    ): ReferenceLineDynamicDataConfiguration = {
      val __obj = js.Dynamic.literal(
        "Calculation" -> Calculation.asInstanceOf[js.Any],
        "Column" -> Column.asInstanceOf[js.Any],
        "MeasureAggregationFunction" -> MeasureAggregationFunction.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ReferenceLineDynamicDataConfiguration]
    }
  }

  /** The label configuration of a reference line.
    */
  @js.native
  trait ReferenceLineLabelConfiguration extends js.Object {
    var CustomLabelConfiguration: js.UndefOr[ReferenceLineCustomLabelConfiguration]
    var FontColor: js.UndefOr[HexColor]
    var FontConfiguration: js.UndefOr[FontConfiguration]
    var HorizontalPosition: js.UndefOr[ReferenceLineLabelHorizontalPosition]
    var ValueLabelConfiguration: js.UndefOr[ReferenceLineValueLabelConfiguration]
    var VerticalPosition: js.UndefOr[ReferenceLineLabelVerticalPosition]
  }

  object ReferenceLineLabelConfiguration {
    @inline
    def apply(
        CustomLabelConfiguration: js.UndefOr[ReferenceLineCustomLabelConfiguration] = js.undefined,
        FontColor: js.UndefOr[HexColor] = js.undefined,
        FontConfiguration: js.UndefOr[FontConfiguration] = js.undefined,
        HorizontalPosition: js.UndefOr[ReferenceLineLabelHorizontalPosition] = js.undefined,
        ValueLabelConfiguration: js.UndefOr[ReferenceLineValueLabelConfiguration] = js.undefined,
        VerticalPosition: js.UndefOr[ReferenceLineLabelVerticalPosition] = js.undefined
    ): ReferenceLineLabelConfiguration = {
      val __obj = js.Dynamic.literal()
      CustomLabelConfiguration.foreach(__v => __obj.updateDynamic("CustomLabelConfiguration")(__v.asInstanceOf[js.Any]))
      FontColor.foreach(__v => __obj.updateDynamic("FontColor")(__v.asInstanceOf[js.Any]))
      FontConfiguration.foreach(__v => __obj.updateDynamic("FontConfiguration")(__v.asInstanceOf[js.Any]))
      HorizontalPosition.foreach(__v => __obj.updateDynamic("HorizontalPosition")(__v.asInstanceOf[js.Any]))
      ValueLabelConfiguration.foreach(__v => __obj.updateDynamic("ValueLabelConfiguration")(__v.asInstanceOf[js.Any]))
      VerticalPosition.foreach(__v => __obj.updateDynamic("VerticalPosition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReferenceLineLabelConfiguration]
    }
  }

  /** The static data configuration of the reference line data configuration.
    */
  @js.native
  trait ReferenceLineStaticDataConfiguration extends js.Object {
    var Value: SensitiveDouble
  }

  object ReferenceLineStaticDataConfiguration {
    @inline
    def apply(
        Value: SensitiveDouble
    ): ReferenceLineStaticDataConfiguration = {
      val __obj = js.Dynamic.literal(
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ReferenceLineStaticDataConfiguration]
    }
  }

  /** The style configuration of the reference line.
    */
  @js.native
  trait ReferenceLineStyleConfiguration extends js.Object {
    var Color: js.UndefOr[HexColor]
    var Pattern: js.UndefOr[ReferenceLinePatternType]
  }

  object ReferenceLineStyleConfiguration {
    @inline
    def apply(
        Color: js.UndefOr[HexColor] = js.undefined,
        Pattern: js.UndefOr[ReferenceLinePatternType] = js.undefined
    ): ReferenceLineStyleConfiguration = {
      val __obj = js.Dynamic.literal()
      Color.foreach(__v => __obj.updateDynamic("Color")(__v.asInstanceOf[js.Any]))
      Pattern.foreach(__v => __obj.updateDynamic("Pattern")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReferenceLineStyleConfiguration]
    }
  }

  /** The value label configuration of the label in a reference line.
    */
  @js.native
  trait ReferenceLineValueLabelConfiguration extends js.Object {
    var FormatConfiguration: js.UndefOr[NumericFormatConfiguration]
    var RelativePosition: js.UndefOr[ReferenceLineValueLabelRelativePosition]
  }

  object ReferenceLineValueLabelConfiguration {
    @inline
    def apply(
        FormatConfiguration: js.UndefOr[NumericFormatConfiguration] = js.undefined,
        RelativePosition: js.UndefOr[ReferenceLineValueLabelRelativePosition] = js.undefined
    ): ReferenceLineValueLabelConfiguration = {
      val __obj = js.Dynamic.literal()
      FormatConfiguration.foreach(__v => __obj.updateDynamic("FormatConfiguration")(__v.asInstanceOf[js.Any]))
      RelativePosition.foreach(__v => __obj.updateDynamic("RelativePosition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReferenceLineValueLabelConfiguration]
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
    var InitialDashboardId: ShortRestrictiveResourceId
  }

  object RegisteredUserDashboardEmbeddingConfiguration {
    @inline
    def apply(
        InitialDashboardId: ShortRestrictiveResourceId
    ): RegisteredUserDashboardEmbeddingConfiguration = {
      val __obj = js.Dynamic.literal(
        "InitialDashboardId" -> InitialDashboardId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RegisteredUserDashboardEmbeddingConfiguration]
    }
  }

  /** The experience that you are embedding. You can use this object to generate a url that embeds a visual into your application.
    */
  @js.native
  trait RegisteredUserDashboardVisualEmbeddingConfiguration extends js.Object {
    var InitialDashboardVisualId: DashboardVisualId
  }

  object RegisteredUserDashboardVisualEmbeddingConfiguration {
    @inline
    def apply(
        InitialDashboardVisualId: DashboardVisualId
    ): RegisteredUserDashboardVisualEmbeddingConfiguration = {
      val __obj = js.Dynamic.literal(
        "InitialDashboardVisualId" -> InitialDashboardVisualId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RegisteredUserDashboardVisualEmbeddingConfiguration]
    }
  }

  /** The type of experience you want to embed. For registered users, you can embed Amazon QuickSight dashboards or the Amazon QuickSight console.
    *
    * '''Note:'''Exactly one of the experience configurations is required. You can choose <code>Dashboard</code> or <code>QuickSightConsole</code>. You cannot choose more than one experience configuration.
    */
  @js.native
  trait RegisteredUserEmbeddingExperienceConfiguration extends js.Object {
    var Dashboard: js.UndefOr[RegisteredUserDashboardEmbeddingConfiguration]
    var DashboardVisual: js.UndefOr[RegisteredUserDashboardVisualEmbeddingConfiguration]
    var QSearchBar: js.UndefOr[RegisteredUserQSearchBarEmbeddingConfiguration]
    var QuickSightConsole: js.UndefOr[RegisteredUserQuickSightConsoleEmbeddingConfiguration]
  }

  object RegisteredUserEmbeddingExperienceConfiguration {
    @inline
    def apply(
        Dashboard: js.UndefOr[RegisteredUserDashboardEmbeddingConfiguration] = js.undefined,
        DashboardVisual: js.UndefOr[RegisteredUserDashboardVisualEmbeddingConfiguration] = js.undefined,
        QSearchBar: js.UndefOr[RegisteredUserQSearchBarEmbeddingConfiguration] = js.undefined,
        QuickSightConsole: js.UndefOr[RegisteredUserQuickSightConsoleEmbeddingConfiguration] = js.undefined
    ): RegisteredUserEmbeddingExperienceConfiguration = {
      val __obj = js.Dynamic.literal()
      Dashboard.foreach(__v => __obj.updateDynamic("Dashboard")(__v.asInstanceOf[js.Any]))
      DashboardVisual.foreach(__v => __obj.updateDynamic("DashboardVisual")(__v.asInstanceOf[js.Any]))
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

  /** The display options of a control.
    */
  @js.native
  trait RelativeDateTimeControlDisplayOptions extends js.Object {
    var DateTimeFormat: js.UndefOr[DateTimeFormat]
    var TitleOptions: js.UndefOr[LabelOptions]
  }

  object RelativeDateTimeControlDisplayOptions {
    @inline
    def apply(
        DateTimeFormat: js.UndefOr[DateTimeFormat] = js.undefined,
        TitleOptions: js.UndefOr[LabelOptions] = js.undefined
    ): RelativeDateTimeControlDisplayOptions = {
      val __obj = js.Dynamic.literal()
      DateTimeFormat.foreach(__v => __obj.updateDynamic("DateTimeFormat")(__v.asInstanceOf[js.Any]))
      TitleOptions.foreach(__v => __obj.updateDynamic("TitleOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RelativeDateTimeControlDisplayOptions]
    }
  }

  /** A <code>RelativeDatesFilter</code> filters relative dates values.
    */
  @js.native
  trait RelativeDatesFilter extends js.Object {
    var AnchorDateConfiguration: AnchorDateConfiguration
    var Column: ColumnIdentifier
    var FilterId: ShortRestrictiveResourceId
    var NullOption: FilterNullOption
    var RelativeDateType: RelativeDateType
    var TimeGranularity: TimeGranularity
    var ExcludePeriodConfiguration: js.UndefOr[ExcludePeriodConfiguration]
    var MinimumGranularity: js.UndefOr[TimeGranularity]
    var ParameterName: js.UndefOr[ParameterName]
    var RelativeDateValue: js.UndefOr[Int]
  }

  object RelativeDatesFilter {
    @inline
    def apply(
        AnchorDateConfiguration: AnchorDateConfiguration,
        Column: ColumnIdentifier,
        FilterId: ShortRestrictiveResourceId,
        NullOption: FilterNullOption,
        RelativeDateType: RelativeDateType,
        TimeGranularity: TimeGranularity,
        ExcludePeriodConfiguration: js.UndefOr[ExcludePeriodConfiguration] = js.undefined,
        MinimumGranularity: js.UndefOr[TimeGranularity] = js.undefined,
        ParameterName: js.UndefOr[ParameterName] = js.undefined,
        RelativeDateValue: js.UndefOr[Int] = js.undefined
    ): RelativeDatesFilter = {
      val __obj = js.Dynamic.literal(
        "AnchorDateConfiguration" -> AnchorDateConfiguration.asInstanceOf[js.Any],
        "Column" -> Column.asInstanceOf[js.Any],
        "FilterId" -> FilterId.asInstanceOf[js.Any],
        "NullOption" -> NullOption.asInstanceOf[js.Any],
        "RelativeDateType" -> RelativeDateType.asInstanceOf[js.Any],
        "TimeGranularity" -> TimeGranularity.asInstanceOf[js.Any]
      )

      ExcludePeriodConfiguration.foreach(__v => __obj.updateDynamic("ExcludePeriodConfiguration")(__v.asInstanceOf[js.Any]))
      MinimumGranularity.foreach(__v => __obj.updateDynamic("MinimumGranularity")(__v.asInstanceOf[js.Any]))
      ParameterName.foreach(__v => __obj.updateDynamic("ParameterName")(__v.asInstanceOf[js.Any]))
      RelativeDateValue.foreach(__v => __obj.updateDynamic("RelativeDateValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RelativeDatesFilter]
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
    var AnalysisId: ShortRestrictiveResourceId
    var AwsAccountId: AwsAccountId
  }

  object RestoreAnalysisRequest {
    @inline
    def apply(
        AnalysisId: ShortRestrictiveResourceId,
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
    var AnalysisId: js.UndefOr[ShortRestrictiveResourceId]
    var Arn: js.UndefOr[Arn]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object RestoreAnalysisResponse {
    @inline
    def apply(
        AnalysisId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined,
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

  /** The rolling date configuration of a date time filter.
    */
  @js.native
  trait RollingDateConfiguration extends js.Object {
    var Expression: Expression
    var DataSetIdentifier: js.UndefOr[DataSetIdentifier]
  }

  object RollingDateConfiguration {
    @inline
    def apply(
        Expression: Expression,
        DataSetIdentifier: js.UndefOr[DataSetIdentifier] = js.undefined
    ): RollingDateConfiguration = {
      val __obj = js.Dynamic.literal(
        "Expression" -> Expression.asInstanceOf[js.Any]
      )

      DataSetIdentifier.foreach(__v => __obj.updateDynamic("DataSetIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RollingDateConfiguration]
    }
  }

  /** Determines the row alternate color options.
    */
  @js.native
  trait RowAlternateColorOptions extends js.Object {
    var RowAlternateColors: js.UndefOr[RowAlternateColorList]
    var Status: js.UndefOr[WidgetStatus]
  }

  object RowAlternateColorOptions {
    @inline
    def apply(
        RowAlternateColors: js.UndefOr[RowAlternateColorList] = js.undefined,
        Status: js.UndefOr[WidgetStatus] = js.undefined
    ): RowAlternateColorOptions = {
      val __obj = js.Dynamic.literal()
      RowAlternateColors.foreach(__v => __obj.updateDynamic("RowAlternateColors")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RowAlternateColorOptions]
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

  /** The configuration of the same-sheet target visuals that you want to be filtered. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait SameSheetTargetVisualConfiguration extends js.Object {
    var TargetVisualOptions: js.UndefOr[TargetVisualOptions]
    var TargetVisuals: js.UndefOr[TargetVisualList]
  }

  object SameSheetTargetVisualConfiguration {
    @inline
    def apply(
        TargetVisualOptions: js.UndefOr[TargetVisualOptions] = js.undefined,
        TargetVisuals: js.UndefOr[TargetVisualList] = js.undefined
    ): SameSheetTargetVisualConfiguration = {
      val __obj = js.Dynamic.literal()
      TargetVisualOptions.foreach(__v => __obj.updateDynamic("TargetVisualOptions")(__v.asInstanceOf[js.Any]))
      TargetVisuals.foreach(__v => __obj.updateDynamic("TargetVisuals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SameSheetTargetVisualConfiguration]
    }
  }

  /** The field well configuration of a sankey diagram.
    */
  @js.native
  trait SankeyDiagramAggregatedFieldWells extends js.Object {
    var Destination: js.UndefOr[DimensionFieldList]
    var Source: js.UndefOr[DimensionFieldList]
    var Weight: js.UndefOr[MeasureFieldList]
  }

  object SankeyDiagramAggregatedFieldWells {
    @inline
    def apply(
        Destination: js.UndefOr[DimensionFieldList] = js.undefined,
        Source: js.UndefOr[DimensionFieldList] = js.undefined,
        Weight: js.UndefOr[MeasureFieldList] = js.undefined
    ): SankeyDiagramAggregatedFieldWells = {
      val __obj = js.Dynamic.literal()
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      Weight.foreach(__v => __obj.updateDynamic("Weight")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SankeyDiagramAggregatedFieldWells]
    }
  }

  /** The configuration of a sankey diagram.
    */
  @js.native
  trait SankeyDiagramChartConfiguration extends js.Object {
    var DataLabels: js.UndefOr[DataLabelOptions]
    var FieldWells: js.UndefOr[SankeyDiagramFieldWells]
    var SortConfiguration: js.UndefOr[SankeyDiagramSortConfiguration]
  }

  object SankeyDiagramChartConfiguration {
    @inline
    def apply(
        DataLabels: js.UndefOr[DataLabelOptions] = js.undefined,
        FieldWells: js.UndefOr[SankeyDiagramFieldWells] = js.undefined,
        SortConfiguration: js.UndefOr[SankeyDiagramSortConfiguration] = js.undefined
    ): SankeyDiagramChartConfiguration = {
      val __obj = js.Dynamic.literal()
      DataLabels.foreach(__v => __obj.updateDynamic("DataLabels")(__v.asInstanceOf[js.Any]))
      FieldWells.foreach(__v => __obj.updateDynamic("FieldWells")(__v.asInstanceOf[js.Any]))
      SortConfiguration.foreach(__v => __obj.updateDynamic("SortConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SankeyDiagramChartConfiguration]
    }
  }

  /** The field well configuration of a sankey diagram.
    */
  @js.native
  trait SankeyDiagramFieldWells extends js.Object {
    var SankeyDiagramAggregatedFieldWells: js.UndefOr[SankeyDiagramAggregatedFieldWells]
  }

  object SankeyDiagramFieldWells {
    @inline
    def apply(
        SankeyDiagramAggregatedFieldWells: js.UndefOr[SankeyDiagramAggregatedFieldWells] = js.undefined
    ): SankeyDiagramFieldWells = {
      val __obj = js.Dynamic.literal()
      SankeyDiagramAggregatedFieldWells.foreach(__v => __obj.updateDynamic("SankeyDiagramAggregatedFieldWells")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SankeyDiagramFieldWells]
    }
  }

  /** The sort configuration of a sankey diagram.
    */
  @js.native
  trait SankeyDiagramSortConfiguration extends js.Object {
    var DestinationItemsLimit: js.UndefOr[ItemsLimitConfiguration]
    var SourceItemsLimit: js.UndefOr[ItemsLimitConfiguration]
    var WeightSort: js.UndefOr[FieldSortOptionsList]
  }

  object SankeyDiagramSortConfiguration {
    @inline
    def apply(
        DestinationItemsLimit: js.UndefOr[ItemsLimitConfiguration] = js.undefined,
        SourceItemsLimit: js.UndefOr[ItemsLimitConfiguration] = js.undefined,
        WeightSort: js.UndefOr[FieldSortOptionsList] = js.undefined
    ): SankeyDiagramSortConfiguration = {
      val __obj = js.Dynamic.literal()
      DestinationItemsLimit.foreach(__v => __obj.updateDynamic("DestinationItemsLimit")(__v.asInstanceOf[js.Any]))
      SourceItemsLimit.foreach(__v => __obj.updateDynamic("SourceItemsLimit")(__v.asInstanceOf[js.Any]))
      WeightSort.foreach(__v => __obj.updateDynamic("WeightSort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SankeyDiagramSortConfiguration]
    }
  }

  /** A sankey diagram. For more information, see [[https://docs.aws.amazon.com/quicksight/latest/user/sankey-diagram.html|Using Sankey diagrams]] in the <i>Amazon QuickSight User Guide</i>.
    */
  @js.native
  trait SankeyDiagramVisual extends js.Object {
    var VisualId: ShortRestrictiveResourceId
    var Actions: js.UndefOr[VisualCustomActionList]
    var ChartConfiguration: js.UndefOr[SankeyDiagramChartConfiguration]
    var Subtitle: js.UndefOr[VisualSubtitleLabelOptions]
    var Title: js.UndefOr[VisualTitleLabelOptions]
  }

  object SankeyDiagramVisual {
    @inline
    def apply(
        VisualId: ShortRestrictiveResourceId,
        Actions: js.UndefOr[VisualCustomActionList] = js.undefined,
        ChartConfiguration: js.UndefOr[SankeyDiagramChartConfiguration] = js.undefined,
        Subtitle: js.UndefOr[VisualSubtitleLabelOptions] = js.undefined,
        Title: js.UndefOr[VisualTitleLabelOptions] = js.undefined
    ): SankeyDiagramVisual = {
      val __obj = js.Dynamic.literal(
        "VisualId" -> VisualId.asInstanceOf[js.Any]
      )

      Actions.foreach(__v => __obj.updateDynamic("Actions")(__v.asInstanceOf[js.Any]))
      ChartConfiguration.foreach(__v => __obj.updateDynamic("ChartConfiguration")(__v.asInstanceOf[js.Any]))
      Subtitle.foreach(__v => __obj.updateDynamic("Subtitle")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SankeyDiagramVisual]
    }
  }

  /** The aggregated field well of a scatter plot.
    */
  @js.native
  trait ScatterPlotCategoricallyAggregatedFieldWells extends js.Object {
    var Category: js.UndefOr[DimensionFieldList]
    var Size: js.UndefOr[MeasureFieldList]
    var XAxis: js.UndefOr[MeasureFieldList]
    var YAxis: js.UndefOr[MeasureFieldList]
  }

  object ScatterPlotCategoricallyAggregatedFieldWells {
    @inline
    def apply(
        Category: js.UndefOr[DimensionFieldList] = js.undefined,
        Size: js.UndefOr[MeasureFieldList] = js.undefined,
        XAxis: js.UndefOr[MeasureFieldList] = js.undefined,
        YAxis: js.UndefOr[MeasureFieldList] = js.undefined
    ): ScatterPlotCategoricallyAggregatedFieldWells = {
      val __obj = js.Dynamic.literal()
      Category.foreach(__v => __obj.updateDynamic("Category")(__v.asInstanceOf[js.Any]))
      Size.foreach(__v => __obj.updateDynamic("Size")(__v.asInstanceOf[js.Any]))
      XAxis.foreach(__v => __obj.updateDynamic("XAxis")(__v.asInstanceOf[js.Any]))
      YAxis.foreach(__v => __obj.updateDynamic("YAxis")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScatterPlotCategoricallyAggregatedFieldWells]
    }
  }

  /** The configuration of a scatter plot.
    */
  @js.native
  trait ScatterPlotConfiguration extends js.Object {
    var DataLabels: js.UndefOr[DataLabelOptions]
    var FieldWells: js.UndefOr[ScatterPlotFieldWells]
    var Legend: js.UndefOr[LegendOptions]
    var Tooltip: js.UndefOr[TooltipOptions]
    var VisualPalette: js.UndefOr[VisualPalette]
    var XAxisDisplayOptions: js.UndefOr[AxisDisplayOptions]
    var XAxisLabelOptions: js.UndefOr[ChartAxisLabelOptions]
    var YAxisDisplayOptions: js.UndefOr[AxisDisplayOptions]
    var YAxisLabelOptions: js.UndefOr[ChartAxisLabelOptions]
  }

  object ScatterPlotConfiguration {
    @inline
    def apply(
        DataLabels: js.UndefOr[DataLabelOptions] = js.undefined,
        FieldWells: js.UndefOr[ScatterPlotFieldWells] = js.undefined,
        Legend: js.UndefOr[LegendOptions] = js.undefined,
        Tooltip: js.UndefOr[TooltipOptions] = js.undefined,
        VisualPalette: js.UndefOr[VisualPalette] = js.undefined,
        XAxisDisplayOptions: js.UndefOr[AxisDisplayOptions] = js.undefined,
        XAxisLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined,
        YAxisDisplayOptions: js.UndefOr[AxisDisplayOptions] = js.undefined,
        YAxisLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined
    ): ScatterPlotConfiguration = {
      val __obj = js.Dynamic.literal()
      DataLabels.foreach(__v => __obj.updateDynamic("DataLabels")(__v.asInstanceOf[js.Any]))
      FieldWells.foreach(__v => __obj.updateDynamic("FieldWells")(__v.asInstanceOf[js.Any]))
      Legend.foreach(__v => __obj.updateDynamic("Legend")(__v.asInstanceOf[js.Any]))
      Tooltip.foreach(__v => __obj.updateDynamic("Tooltip")(__v.asInstanceOf[js.Any]))
      VisualPalette.foreach(__v => __obj.updateDynamic("VisualPalette")(__v.asInstanceOf[js.Any]))
      XAxisDisplayOptions.foreach(__v => __obj.updateDynamic("XAxisDisplayOptions")(__v.asInstanceOf[js.Any]))
      XAxisLabelOptions.foreach(__v => __obj.updateDynamic("XAxisLabelOptions")(__v.asInstanceOf[js.Any]))
      YAxisDisplayOptions.foreach(__v => __obj.updateDynamic("YAxisDisplayOptions")(__v.asInstanceOf[js.Any]))
      YAxisLabelOptions.foreach(__v => __obj.updateDynamic("YAxisLabelOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScatterPlotConfiguration]
    }
  }

  /** The field well configuration of a scatter plot. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait ScatterPlotFieldWells extends js.Object {
    var ScatterPlotCategoricallyAggregatedFieldWells: js.UndefOr[ScatterPlotCategoricallyAggregatedFieldWells]
    var ScatterPlotUnaggregatedFieldWells: js.UndefOr[ScatterPlotUnaggregatedFieldWells]
  }

  object ScatterPlotFieldWells {
    @inline
    def apply(
        ScatterPlotCategoricallyAggregatedFieldWells: js.UndefOr[ScatterPlotCategoricallyAggregatedFieldWells] = js.undefined,
        ScatterPlotUnaggregatedFieldWells: js.UndefOr[ScatterPlotUnaggregatedFieldWells] = js.undefined
    ): ScatterPlotFieldWells = {
      val __obj = js.Dynamic.literal()
      ScatterPlotCategoricallyAggregatedFieldWells.foreach(__v => __obj.updateDynamic("ScatterPlotCategoricallyAggregatedFieldWells")(__v.asInstanceOf[js.Any]))
      ScatterPlotUnaggregatedFieldWells.foreach(__v => __obj.updateDynamic("ScatterPlotUnaggregatedFieldWells")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScatterPlotFieldWells]
    }
  }

  /** The unaggregated field wells of a scatter plot.
    */
  @js.native
  trait ScatterPlotUnaggregatedFieldWells extends js.Object {
    var Size: js.UndefOr[MeasureFieldList]
    var XAxis: js.UndefOr[DimensionFieldList]
    var YAxis: js.UndefOr[DimensionFieldList]
  }

  object ScatterPlotUnaggregatedFieldWells {
    @inline
    def apply(
        Size: js.UndefOr[MeasureFieldList] = js.undefined,
        XAxis: js.UndefOr[DimensionFieldList] = js.undefined,
        YAxis: js.UndefOr[DimensionFieldList] = js.undefined
    ): ScatterPlotUnaggregatedFieldWells = {
      val __obj = js.Dynamic.literal()
      Size.foreach(__v => __obj.updateDynamic("Size")(__v.asInstanceOf[js.Any]))
      XAxis.foreach(__v => __obj.updateDynamic("XAxis")(__v.asInstanceOf[js.Any]))
      YAxis.foreach(__v => __obj.updateDynamic("YAxis")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScatterPlotUnaggregatedFieldWells]
    }
  }

  /** A scatter plot. For more information, see [[https://docs.aws.amazon.com/quicksight/latest/user/scatter-plot.html|Using scatter plots]] in the <i>Amazon QuickSight User Guide</i>.
    */
  @js.native
  trait ScatterPlotVisual extends js.Object {
    var VisualId: ShortRestrictiveResourceId
    var Actions: js.UndefOr[VisualCustomActionList]
    var ChartConfiguration: js.UndefOr[ScatterPlotConfiguration]
    var ColumnHierarchies: js.UndefOr[ColumnHierarchyList]
    var Subtitle: js.UndefOr[VisualSubtitleLabelOptions]
    var Title: js.UndefOr[VisualTitleLabelOptions]
  }

  object ScatterPlotVisual {
    @inline
    def apply(
        VisualId: ShortRestrictiveResourceId,
        Actions: js.UndefOr[VisualCustomActionList] = js.undefined,
        ChartConfiguration: js.UndefOr[ScatterPlotConfiguration] = js.undefined,
        ColumnHierarchies: js.UndefOr[ColumnHierarchyList] = js.undefined,
        Subtitle: js.UndefOr[VisualSubtitleLabelOptions] = js.undefined,
        Title: js.UndefOr[VisualTitleLabelOptions] = js.undefined
    ): ScatterPlotVisual = {
      val __obj = js.Dynamic.literal(
        "VisualId" -> VisualId.asInstanceOf[js.Any]
      )

      Actions.foreach(__v => __obj.updateDynamic("Actions")(__v.asInstanceOf[js.Any]))
      ChartConfiguration.foreach(__v => __obj.updateDynamic("ChartConfiguration")(__v.asInstanceOf[js.Any]))
      ColumnHierarchies.foreach(__v => __obj.updateDynamic("ColumnHierarchies")(__v.asInstanceOf[js.Any]))
      Subtitle.foreach(__v => __obj.updateDynamic("Subtitle")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScatterPlotVisual]
    }
  }

  /** The visual display options for a data zoom scroll bar.
    */
  @js.native
  trait ScrollBarOptions extends js.Object {
    var Visibility: js.UndefOr[Visibility]
    var VisibleRange: js.UndefOr[VisibleRangeOptions]
  }

  object ScrollBarOptions {
    @inline
    def apply(
        Visibility: js.UndefOr[Visibility] = js.undefined,
        VisibleRange: js.UndefOr[VisibleRangeOptions] = js.undefined
    ): ScrollBarOptions = {
      val __obj = js.Dynamic.literal()
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      VisibleRange.foreach(__v => __obj.updateDynamic("VisibleRange")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScrollBarOptions]
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
  trait SearchDataSetsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Filters: DataSetSearchFilterList
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object SearchDataSetsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        Filters: DataSetSearchFilterList,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): SearchDataSetsRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Filters" -> Filters.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchDataSetsRequest]
    }
  }

  @js.native
  trait SearchDataSetsResponse extends js.Object {
    var DataSetSummaries: js.UndefOr[DataSetSummaryList]
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object SearchDataSetsResponse {
    @inline
    def apply(
        DataSetSummaries: js.UndefOr[DataSetSummaryList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): SearchDataSetsResponse = {
      val __obj = js.Dynamic.literal()
      DataSetSummaries.foreach(__v => __obj.updateDynamic("DataSetSummaries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchDataSetsResponse]
    }
  }

  @js.native
  trait SearchDataSourcesRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Filters: DataSourceSearchFilterList
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object SearchDataSourcesRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        Filters: DataSourceSearchFilterList,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): SearchDataSourcesRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Filters" -> Filters.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchDataSourcesRequest]
    }
  }

  @js.native
  trait SearchDataSourcesResponse extends js.Object {
    var DataSourceSummaries: js.UndefOr[DataSourceSummaryList]
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object SearchDataSourcesResponse {
    @inline
    def apply(
        DataSourceSummaries: js.UndefOr[DataSourceSummaryList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): SearchDataSourcesResponse = {
      val __obj = js.Dynamic.literal()
      DataSourceSummaries.foreach(__v => __obj.updateDynamic("DataSourceSummaries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchDataSourcesResponse]
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

  @js.native
  trait SearchGroupsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var Filters: GroupSearchFilterList
    var Namespace: Namespace
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[String]
  }

  object SearchGroupsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        Filters: GroupSearchFilterList,
        Namespace: Namespace,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): SearchGroupsRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Filters" -> Filters.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchGroupsRequest]
    }
  }

  @js.native
  trait SearchGroupsResponse extends js.Object {
    var GroupList: js.UndefOr[GroupList]
    var NextToken: js.UndefOr[String]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object SearchGroupsResponse {
    @inline
    def apply(
        GroupList: js.UndefOr[GroupList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): SearchGroupsResponse = {
      val __obj = js.Dynamic.literal()
      GroupList.foreach(__v => __obj.updateDynamic("GroupList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchGroupsResponse]
    }
  }

  /** The options that determine the presentation of the secondary value of a KPI visual.
    */
  @js.native
  trait SecondaryValueOptions extends js.Object {
    var Visibility: js.UndefOr[Visibility]
  }

  object SecondaryValueOptions {
    @inline
    def apply(
        Visibility: js.UndefOr[Visibility] = js.undefined
    ): SecondaryValueOptions = {
      val __obj = js.Dynamic.literal()
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecondaryValueOptions]
    }
  }

  /** The configuration of a page break after a section.
    */
  @js.native
  trait SectionAfterPageBreak extends js.Object {
    var Status: js.UndefOr[SectionPageBreakStatus]
  }

  object SectionAfterPageBreak {
    @inline
    def apply(
        Status: js.UndefOr[SectionPageBreakStatus] = js.undefined
    ): SectionAfterPageBreak = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SectionAfterPageBreak]
    }
  }

  /** The options for the canvas of a section-based layout.
    */
  @js.native
  trait SectionBasedLayoutCanvasSizeOptions extends js.Object {
    var PaperCanvasSizeOptions: js.UndefOr[SectionBasedLayoutPaperCanvasSizeOptions]
  }

  object SectionBasedLayoutCanvasSizeOptions {
    @inline
    def apply(
        PaperCanvasSizeOptions: js.UndefOr[SectionBasedLayoutPaperCanvasSizeOptions] = js.undefined
    ): SectionBasedLayoutCanvasSizeOptions = {
      val __obj = js.Dynamic.literal()
      PaperCanvasSizeOptions.foreach(__v => __obj.updateDynamic("PaperCanvasSizeOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SectionBasedLayoutCanvasSizeOptions]
    }
  }

  /** The configuration for a section-based layout.
    */
  @js.native
  trait SectionBasedLayoutConfiguration extends js.Object {
    var BodySections: BodySectionConfigurationList
    var CanvasSizeOptions: SectionBasedLayoutCanvasSizeOptions
    var FooterSections: HeaderFooterSectionConfigurationList
    var HeaderSections: HeaderFooterSectionConfigurationList
  }

  object SectionBasedLayoutConfiguration {
    @inline
    def apply(
        BodySections: BodySectionConfigurationList,
        CanvasSizeOptions: SectionBasedLayoutCanvasSizeOptions,
        FooterSections: HeaderFooterSectionConfigurationList,
        HeaderSections: HeaderFooterSectionConfigurationList
    ): SectionBasedLayoutConfiguration = {
      val __obj = js.Dynamic.literal(
        "BodySections" -> BodySections.asInstanceOf[js.Any],
        "CanvasSizeOptions" -> CanvasSizeOptions.asInstanceOf[js.Any],
        "FooterSections" -> FooterSections.asInstanceOf[js.Any],
        "HeaderSections" -> HeaderSections.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SectionBasedLayoutConfiguration]
    }
  }

  /** The options for a paper canvas of a section-based layout.
    */
  @js.native
  trait SectionBasedLayoutPaperCanvasSizeOptions extends js.Object {
    var PaperMargin: js.UndefOr[Spacing]
    var PaperOrientation: js.UndefOr[PaperOrientation]
    var PaperSize: js.UndefOr[PaperSize]
  }

  object SectionBasedLayoutPaperCanvasSizeOptions {
    @inline
    def apply(
        PaperMargin: js.UndefOr[Spacing] = js.undefined,
        PaperOrientation: js.UndefOr[PaperOrientation] = js.undefined,
        PaperSize: js.UndefOr[PaperSize] = js.undefined
    ): SectionBasedLayoutPaperCanvasSizeOptions = {
      val __obj = js.Dynamic.literal()
      PaperMargin.foreach(__v => __obj.updateDynamic("PaperMargin")(__v.asInstanceOf[js.Any]))
      PaperOrientation.foreach(__v => __obj.updateDynamic("PaperOrientation")(__v.asInstanceOf[js.Any]))
      PaperSize.foreach(__v => __obj.updateDynamic("PaperSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SectionBasedLayoutPaperCanvasSizeOptions]
    }
  }

  /** The layout configuration of a section.
    */
  @js.native
  trait SectionLayoutConfiguration extends js.Object {
    var FreeFormLayout: FreeFormSectionLayoutConfiguration
  }

  object SectionLayoutConfiguration {
    @inline
    def apply(
        FreeFormLayout: FreeFormSectionLayoutConfiguration
    ): SectionLayoutConfiguration = {
      val __obj = js.Dynamic.literal(
        "FreeFormLayout" -> FreeFormLayout.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SectionLayoutConfiguration]
    }
  }

  /** The configuration of a page break for a section.
    */
  @js.native
  trait SectionPageBreakConfiguration extends js.Object {
    var After: js.UndefOr[SectionAfterPageBreak]
  }

  object SectionPageBreakConfiguration {
    @inline
    def apply(
        After: js.UndefOr[SectionAfterPageBreak] = js.undefined
    ): SectionPageBreakConfiguration = {
      val __obj = js.Dynamic.literal()
      After.foreach(__v => __obj.updateDynamic("After")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SectionPageBreakConfiguration]
    }
  }

  /** The options that style a section.
    */
  @js.native
  trait SectionStyle extends js.Object {
    var Height: js.UndefOr[PixelLength]
    var Padding: js.UndefOr[Spacing]
  }

  object SectionStyle {
    @inline
    def apply(
        Height: js.UndefOr[PixelLength] = js.undefined,
        Padding: js.UndefOr[Spacing] = js.undefined
    ): SectionStyle = {
      val __obj = js.Dynamic.literal()
      Height.foreach(__v => __obj.updateDynamic("Height")(__v.asInstanceOf[js.Any]))
      Padding.foreach(__v => __obj.updateDynamic("Padding")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SectionStyle]
    }
  }

  /** The configuration for applying a filter to specific sheets or visuals. You can apply this filter to multiple visuals that are on one sheet or to all visuals on a sheet. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait SelectedSheetsFilterScopeConfiguration extends js.Object {
    var SheetVisualScopingConfigurations: js.UndefOr[SheetVisualScopingConfigurations]
  }

  object SelectedSheetsFilterScopeConfiguration {
    @inline
    def apply(
        SheetVisualScopingConfigurations: js.UndefOr[SheetVisualScopingConfigurations] = js.undefined
    ): SelectedSheetsFilterScopeConfiguration = {
      val __obj = js.Dynamic.literal()
      SheetVisualScopingConfigurations.foreach(__v => __obj.updateDynamic("SheetVisualScopingConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SelectedSheetsFilterScopeConfiguration]
    }
  }

  /** The series item configuration of a line chart. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait SeriesItem extends js.Object {
    var DataFieldSeriesItem: js.UndefOr[DataFieldSeriesItem]
    var FieldSeriesItem: js.UndefOr[FieldSeriesItem]
  }

  object SeriesItem {
    @inline
    def apply(
        DataFieldSeriesItem: js.UndefOr[DataFieldSeriesItem] = js.undefined,
        FieldSeriesItem: js.UndefOr[FieldSeriesItem] = js.undefined
    ): SeriesItem = {
      val __obj = js.Dynamic.literal()
      DataFieldSeriesItem.foreach(__v => __obj.updateDynamic("DataFieldSeriesItem")(__v.asInstanceOf[js.Any]))
      FieldSeriesItem.foreach(__v => __obj.updateDynamic("FieldSeriesItem")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SeriesItem]
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

  /** The configuration of adding parameters in action.
    */
  @js.native
  trait SetParameterValueConfiguration extends js.Object {
    var DestinationParameterName: ParameterName
    var Value: DestinationParameterValueConfiguration
  }

  object SetParameterValueConfiguration {
    @inline
    def apply(
        DestinationParameterName: ParameterName,
        Value: DestinationParameterValueConfiguration
    ): SetParameterValueConfiguration = {
      val __obj = js.Dynamic.literal(
        "DestinationParameterName" -> DestinationParameterName.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SetParameterValueConfiguration]
    }
  }

  /** The shape conditional formatting of a filled map visual.
    */
  @js.native
  trait ShapeConditionalFormat extends js.Object {
    var BackgroundColor: ConditionalFormattingColor
  }

  object ShapeConditionalFormat {
    @inline
    def apply(
        BackgroundColor: ConditionalFormattingColor
    ): ShapeConditionalFormat = {
      val __obj = js.Dynamic.literal(
        "BackgroundColor" -> BackgroundColor.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ShapeConditionalFormat]
    }
  }

  /** A <i>sheet</i>, which is an object that contains a set of visuals that are viewed together on one page in Amazon QuickSight. Every analysis and dashboard contains at least one sheet. Each sheet contains at least one visualization widget, for example a chart, pivot table, or narrative insight. Sheets can be associated with other components, such as controls, filters, and so on.
    */
  @js.native
  trait Sheet extends js.Object {
    var Name: js.UndefOr[SheetName]
    var SheetId: js.UndefOr[ShortRestrictiveResourceId]
  }

  object Sheet {
    @inline
    def apply(
        Name: js.UndefOr[SheetName] = js.undefined,
        SheetId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined
    ): Sheet = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SheetId.foreach(__v => __obj.updateDynamic("SheetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Sheet]
    }
  }

  /** A grid layout to define the placement of sheet control.
    */
  @js.native
  trait SheetControlLayout extends js.Object {
    var Configuration: SheetControlLayoutConfiguration
  }

  object SheetControlLayout {
    @inline
    def apply(
        Configuration: SheetControlLayoutConfiguration
    ): SheetControlLayout = {
      val __obj = js.Dynamic.literal(
        "Configuration" -> Configuration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SheetControlLayout]
    }
  }

  /** The configuration that determines the elements and canvas size options of sheet control.
    */
  @js.native
  trait SheetControlLayoutConfiguration extends js.Object {
    var GridLayout: js.UndefOr[GridLayoutConfiguration]
  }

  object SheetControlLayoutConfiguration {
    @inline
    def apply(
        GridLayout: js.UndefOr[GridLayoutConfiguration] = js.undefined
    ): SheetControlLayoutConfiguration = {
      val __obj = js.Dynamic.literal()
      GridLayout.foreach(__v => __obj.updateDynamic("GridLayout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SheetControlLayoutConfiguration]
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

  /** A sheet is an object that contains a set of visuals that are viewed together on one page in a paginated report. Every analysis and dashboard must contain at least one sheet.
    */
  @js.native
  trait SheetDefinition extends js.Object {
    var SheetId: ShortRestrictiveResourceId
    var ContentType: js.UndefOr[SheetContentType]
    var Description: js.UndefOr[SheetDescription]
    var FilterControls: js.UndefOr[FilterControlList]
    var Layouts: js.UndefOr[LayoutList]
    var Name: js.UndefOr[SheetName]
    var ParameterControls: js.UndefOr[ParameterControlList]
    var SheetControlLayouts: js.UndefOr[SheetControlLayoutList]
    var TextBoxes: js.UndefOr[SheetTextBoxList]
    var Title: js.UndefOr[SheetTitle]
    var Visuals: js.UndefOr[VisualList]
  }

  object SheetDefinition {
    @inline
    def apply(
        SheetId: ShortRestrictiveResourceId,
        ContentType: js.UndefOr[SheetContentType] = js.undefined,
        Description: js.UndefOr[SheetDescription] = js.undefined,
        FilterControls: js.UndefOr[FilterControlList] = js.undefined,
        Layouts: js.UndefOr[LayoutList] = js.undefined,
        Name: js.UndefOr[SheetName] = js.undefined,
        ParameterControls: js.UndefOr[ParameterControlList] = js.undefined,
        SheetControlLayouts: js.UndefOr[SheetControlLayoutList] = js.undefined,
        TextBoxes: js.UndefOr[SheetTextBoxList] = js.undefined,
        Title: js.UndefOr[SheetTitle] = js.undefined,
        Visuals: js.UndefOr[VisualList] = js.undefined
    ): SheetDefinition = {
      val __obj = js.Dynamic.literal(
        "SheetId" -> SheetId.asInstanceOf[js.Any]
      )

      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      FilterControls.foreach(__v => __obj.updateDynamic("FilterControls")(__v.asInstanceOf[js.Any]))
      Layouts.foreach(__v => __obj.updateDynamic("Layouts")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ParameterControls.foreach(__v => __obj.updateDynamic("ParameterControls")(__v.asInstanceOf[js.Any]))
      SheetControlLayouts.foreach(__v => __obj.updateDynamic("SheetControlLayouts")(__v.asInstanceOf[js.Any]))
      TextBoxes.foreach(__v => __obj.updateDynamic("TextBoxes")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      Visuals.foreach(__v => __obj.updateDynamic("Visuals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SheetDefinition]
    }
  }

  /** The override configuration of the rendering rules of a sheet.
    */
  @js.native
  trait SheetElementConfigurationOverrides extends js.Object {
    var Visibility: js.UndefOr[Visibility]
  }

  object SheetElementConfigurationOverrides {
    @inline
    def apply(
        Visibility: js.UndefOr[Visibility] = js.undefined
    ): SheetElementConfigurationOverrides = {
      val __obj = js.Dynamic.literal()
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SheetElementConfigurationOverrides]
    }
  }

  /** The rendering rules of a sheet that uses a free-form layout.
    */
  @js.native
  trait SheetElementRenderingRule extends js.Object {
    var ConfigurationOverrides: SheetElementConfigurationOverrides
    var Expression: Expression
  }

  object SheetElementRenderingRule {
    @inline
    def apply(
        ConfigurationOverrides: SheetElementConfigurationOverrides,
        Expression: Expression
    ): SheetElementRenderingRule = {
      val __obj = js.Dynamic.literal(
        "ConfigurationOverrides" -> ConfigurationOverrides.asInstanceOf[js.Any],
        "Expression" -> Expression.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SheetElementRenderingRule]
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

  /** A text box.
    */
  @js.native
  trait SheetTextBox extends js.Object {
    var SheetTextBoxId: ShortRestrictiveResourceId
    var Content: js.UndefOr[SheetTextBoxContent]
  }

  object SheetTextBox {
    @inline
    def apply(
        SheetTextBoxId: ShortRestrictiveResourceId,
        Content: js.UndefOr[SheetTextBoxContent] = js.undefined
    ): SheetTextBox = {
      val __obj = js.Dynamic.literal(
        "SheetTextBoxId" -> SheetTextBoxId.asInstanceOf[js.Any]
      )

      Content.foreach(__v => __obj.updateDynamic("Content")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SheetTextBox]
    }
  }

  /** The filter that is applied to the options.
    */
  @js.native
  trait SheetVisualScopingConfiguration extends js.Object {
    var Scope: FilterVisualScope
    var SheetId: ShortRestrictiveResourceId
    var VisualIds: js.UndefOr[FilteredVisualsList]
  }

  object SheetVisualScopingConfiguration {
    @inline
    def apply(
        Scope: FilterVisualScope,
        SheetId: ShortRestrictiveResourceId,
        VisualIds: js.UndefOr[FilteredVisualsList] = js.undefined
    ): SheetVisualScopingConfiguration = {
      val __obj = js.Dynamic.literal(
        "Scope" -> Scope.asInstanceOf[js.Any],
        "SheetId" -> SheetId.asInstanceOf[js.Any]
      )

      VisualIds.foreach(__v => __obj.updateDynamic("VisualIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SheetVisualScopingConfiguration]
    }
  }

  /** The text format for the title. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait ShortFormatText extends js.Object {
    var PlainText: js.UndefOr[ShortPlainText]
    var RichText: js.UndefOr[ShortRichText]
  }

  object ShortFormatText {
    @inline
    def apply(
        PlainText: js.UndefOr[ShortPlainText] = js.undefined,
        RichText: js.UndefOr[ShortRichText] = js.undefined
    ): ShortFormatText = {
      val __obj = js.Dynamic.literal()
      PlainText.foreach(__v => __obj.updateDynamic("PlainText")(__v.asInstanceOf[js.Any]))
      RichText.foreach(__v => __obj.updateDynamic("RichText")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ShortFormatText]
    }
  }

  /** A <code>SignupResponse</code> object that contains a summary of a newly created account.
    */
  @js.native
  trait SignupResponse extends js.Object {
    var IAMUser: js.UndefOr[Boolean]
    var accountName: js.UndefOr[String]
    var directoryType: js.UndefOr[String]
    var userLoginName: js.UndefOr[String]
  }

  object SignupResponse {
    @inline
    def apply(
        IAMUser: js.UndefOr[Boolean] = js.undefined,
        accountName: js.UndefOr[String] = js.undefined,
        directoryType: js.UndefOr[String] = js.undefined,
        userLoginName: js.UndefOr[String] = js.undefined
    ): SignupResponse = {
      val __obj = js.Dynamic.literal()
      IAMUser.foreach(__v => __obj.updateDynamic("IAMUser")(__v.asInstanceOf[js.Any]))
      accountName.foreach(__v => __obj.updateDynamic("accountName")(__v.asInstanceOf[js.Any]))
      directoryType.foreach(__v => __obj.updateDynamic("directoryType")(__v.asInstanceOf[js.Any]))
      userLoginName.foreach(__v => __obj.updateDynamic("userLoginName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SignupResponse]
    }
  }

  /** The simple cluster marker of the cluster marker.
    */
  @js.native
  trait SimpleClusterMarker extends js.Object {
    var Color: js.UndefOr[HexColor]
  }

  object SimpleClusterMarker {
    @inline
    def apply(
        Color: js.UndefOr[HexColor] = js.undefined
    ): SimpleClusterMarker = {
      val __obj = js.Dynamic.literal()
      Color.foreach(__v => __obj.updateDynamic("Color")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SimpleClusterMarker]
    }
  }

  /** The display options of a control.
    */
  @js.native
  trait SliderControlDisplayOptions extends js.Object {
    var TitleOptions: js.UndefOr[LabelOptions]
  }

  object SliderControlDisplayOptions {
    @inline
    def apply(
        TitleOptions: js.UndefOr[LabelOptions] = js.undefined
    ): SliderControlDisplayOptions = {
      val __obj = js.Dynamic.literal()
      TitleOptions.foreach(__v => __obj.updateDynamic("TitleOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SliderControlDisplayOptions]
    }
  }

  /** Options that determine the layout and display options of a chart's small multiples.
    */
  @js.native
  trait SmallMultiplesOptions extends js.Object {
    var MaxVisibleColumns: js.UndefOr[VisiblePanelColumns]
    var MaxVisibleRows: js.UndefOr[VisiblePanelRows]
    var PanelConfiguration: js.UndefOr[PanelConfiguration]
  }

  object SmallMultiplesOptions {
    @inline
    def apply(
        MaxVisibleColumns: js.UndefOr[VisiblePanelColumns] = js.undefined,
        MaxVisibleRows: js.UndefOr[VisiblePanelRows] = js.undefined,
        PanelConfiguration: js.UndefOr[PanelConfiguration] = js.undefined
    ): SmallMultiplesOptions = {
      val __obj = js.Dynamic.literal()
      MaxVisibleColumns.foreach(__v => __obj.updateDynamic("MaxVisibleColumns")(__v.asInstanceOf[js.Any]))
      MaxVisibleRows.foreach(__v => __obj.updateDynamic("MaxVisibleRows")(__v.asInstanceOf[js.Any]))
      PanelConfiguration.foreach(__v => __obj.updateDynamic("PanelConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SmallMultiplesOptions]
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

  /** The configuration of spacing (often a margin or padding).
    */
  @js.native
  trait Spacing extends js.Object {
    var Bottom: js.UndefOr[Length]
    var Left: js.UndefOr[Length]
    var Right: js.UndefOr[Length]
    var Top: js.UndefOr[Length]
  }

  object Spacing {
    @inline
    def apply(
        Bottom: js.UndefOr[Length] = js.undefined,
        Left: js.UndefOr[Length] = js.undefined,
        Right: js.UndefOr[Length] = js.undefined,
        Top: js.UndefOr[Length] = js.undefined
    ): Spacing = {
      val __obj = js.Dynamic.literal()
      Bottom.foreach(__v => __obj.updateDynamic("Bottom")(__v.asInstanceOf[js.Any]))
      Left.foreach(__v => __obj.updateDynamic("Left")(__v.asInstanceOf[js.Any]))
      Right.foreach(__v => __obj.updateDynamic("Right")(__v.asInstanceOf[js.Any]))
      Top.foreach(__v => __obj.updateDynamic("Top")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Spacing]
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

  /** The default values of the <code>StringParameterDeclaration</code>.
    */
  @js.native
  trait StringDefaultValues extends js.Object {
    var DynamicValue: js.UndefOr[DynamicDefaultValue]
    var StaticValues: js.UndefOr[StringDefaultValueList]
  }

  object StringDefaultValues {
    @inline
    def apply(
        DynamicValue: js.UndefOr[DynamicDefaultValue] = js.undefined,
        StaticValues: js.UndefOr[StringDefaultValueList] = js.undefined
    ): StringDefaultValues = {
      val __obj = js.Dynamic.literal()
      DynamicValue.foreach(__v => __obj.updateDynamic("DynamicValue")(__v.asInstanceOf[js.Any]))
      StaticValues.foreach(__v => __obj.updateDynamic("StaticValues")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StringDefaultValues]
    }
  }

  /** Formatting configuration for string fields.
    */
  @js.native
  trait StringFormatConfiguration extends js.Object {
    var NullValueFormatConfiguration: js.UndefOr[NullValueFormatConfiguration]
    var NumericFormatConfiguration: js.UndefOr[NumericFormatConfiguration]
  }

  object StringFormatConfiguration {
    @inline
    def apply(
        NullValueFormatConfiguration: js.UndefOr[NullValueFormatConfiguration] = js.undefined,
        NumericFormatConfiguration: js.UndefOr[NumericFormatConfiguration] = js.undefined
    ): StringFormatConfiguration = {
      val __obj = js.Dynamic.literal()
      NullValueFormatConfiguration.foreach(__v => __obj.updateDynamic("NullValueFormatConfiguration")(__v.asInstanceOf[js.Any]))
      NumericFormatConfiguration.foreach(__v => __obj.updateDynamic("NumericFormatConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StringFormatConfiguration]
    }
  }

  /** A string parameter.
    */
  @js.native
  trait StringParameter extends js.Object {
    var Name: NonEmptyString
    var Values: SensitiveStringList
  }

  object StringParameter {
    @inline
    def apply(
        Name: NonEmptyString,
        Values: SensitiveStringList
    ): StringParameter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StringParameter]
    }
  }

  /** A parameter declaration for the <code>String</code> data type.
    */
  @js.native
  trait StringParameterDeclaration extends js.Object {
    var Name: ParameterName
    var ParameterValueType: ParameterValueType
    var DefaultValues: js.UndefOr[StringDefaultValues]
    var ValueWhenUnset: js.UndefOr[StringValueWhenUnsetConfiguration]
  }

  object StringParameterDeclaration {
    @inline
    def apply(
        Name: ParameterName,
        ParameterValueType: ParameterValueType,
        DefaultValues: js.UndefOr[StringDefaultValues] = js.undefined,
        ValueWhenUnset: js.UndefOr[StringValueWhenUnsetConfiguration] = js.undefined
    ): StringParameterDeclaration = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "ParameterValueType" -> ParameterValueType.asInstanceOf[js.Any]
      )

      DefaultValues.foreach(__v => __obj.updateDynamic("DefaultValues")(__v.asInstanceOf[js.Any]))
      ValueWhenUnset.foreach(__v => __obj.updateDynamic("ValueWhenUnset")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StringParameterDeclaration]
    }
  }

  /** The configuration that defines the default value of a <code>String</code> parameter when a value has not been set.
    */
  @js.native
  trait StringValueWhenUnsetConfiguration extends js.Object {
    var CustomValue: js.UndefOr[SensitiveString]
    var ValueWhenUnsetOption: js.UndefOr[ValueWhenUnsetOption]
  }

  object StringValueWhenUnsetConfiguration {
    @inline
    def apply(
        CustomValue: js.UndefOr[SensitiveString] = js.undefined,
        ValueWhenUnsetOption: js.UndefOr[ValueWhenUnsetOption] = js.undefined
    ): StringValueWhenUnsetConfiguration = {
      val __obj = js.Dynamic.literal()
      CustomValue.foreach(__v => __obj.updateDynamic("CustomValue")(__v.asInstanceOf[js.Any]))
      ValueWhenUnsetOption.foreach(__v => __obj.updateDynamic("ValueWhenUnsetOption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StringValueWhenUnsetConfiguration]
    }
  }

  /** The subtotal options.
    */
  @js.native
  trait SubtotalOptions extends js.Object {
    var CustomLabel: js.UndefOr[String]
    var FieldLevel: js.UndefOr[PivotTableSubtotalLevel]
    var FieldLevelOptions: js.UndefOr[PivotTableFieldSubtotalOptionsList]
    var MetricHeaderCellStyle: js.UndefOr[TableCellStyle]
    var TotalCellStyle: js.UndefOr[TableCellStyle]
    var TotalsVisibility: js.UndefOr[Visibility]
    var ValueCellStyle: js.UndefOr[TableCellStyle]
  }

  object SubtotalOptions {
    @inline
    def apply(
        CustomLabel: js.UndefOr[String] = js.undefined,
        FieldLevel: js.UndefOr[PivotTableSubtotalLevel] = js.undefined,
        FieldLevelOptions: js.UndefOr[PivotTableFieldSubtotalOptionsList] = js.undefined,
        MetricHeaderCellStyle: js.UndefOr[TableCellStyle] = js.undefined,
        TotalCellStyle: js.UndefOr[TableCellStyle] = js.undefined,
        TotalsVisibility: js.UndefOr[Visibility] = js.undefined,
        ValueCellStyle: js.UndefOr[TableCellStyle] = js.undefined
    ): SubtotalOptions = {
      val __obj = js.Dynamic.literal()
      CustomLabel.foreach(__v => __obj.updateDynamic("CustomLabel")(__v.asInstanceOf[js.Any]))
      FieldLevel.foreach(__v => __obj.updateDynamic("FieldLevel")(__v.asInstanceOf[js.Any]))
      FieldLevelOptions.foreach(__v => __obj.updateDynamic("FieldLevelOptions")(__v.asInstanceOf[js.Any]))
      MetricHeaderCellStyle.foreach(__v => __obj.updateDynamic("MetricHeaderCellStyle")(__v.asInstanceOf[js.Any]))
      TotalCellStyle.foreach(__v => __obj.updateDynamic("TotalCellStyle")(__v.asInstanceOf[js.Any]))
      TotalsVisibility.foreach(__v => __obj.updateDynamic("TotalsVisibility")(__v.asInstanceOf[js.Any]))
      ValueCellStyle.foreach(__v => __obj.updateDynamic("ValueCellStyle")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SubtotalOptions]
    }
  }

  /** The aggregated field well for the table.
    */
  @js.native
  trait TableAggregatedFieldWells extends js.Object {
    var GroupBy: js.UndefOr[DimensionFieldList]
    var Values: js.UndefOr[MeasureFieldList]
  }

  object TableAggregatedFieldWells {
    @inline
    def apply(
        GroupBy: js.UndefOr[DimensionFieldList] = js.undefined,
        Values: js.UndefOr[MeasureFieldList] = js.undefined
    ): TableAggregatedFieldWells = {
      val __obj = js.Dynamic.literal()
      GroupBy.foreach(__v => __obj.updateDynamic("GroupBy")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableAggregatedFieldWells]
    }
  }

  /** The border options for a table border.
    */
  @js.native
  trait TableBorderOptions extends js.Object {
    var Color: js.UndefOr[HexColor]
    var Style: js.UndefOr[TableBorderStyle]
    var Thickness: js.UndefOr[TableBorderThickness]
  }

  object TableBorderOptions {
    @inline
    def apply(
        Color: js.UndefOr[HexColor] = js.undefined,
        Style: js.UndefOr[TableBorderStyle] = js.undefined,
        Thickness: js.UndefOr[TableBorderThickness] = js.undefined
    ): TableBorderOptions = {
      val __obj = js.Dynamic.literal()
      Color.foreach(__v => __obj.updateDynamic("Color")(__v.asInstanceOf[js.Any]))
      Style.foreach(__v => __obj.updateDynamic("Style")(__v.asInstanceOf[js.Any]))
      Thickness.foreach(__v => __obj.updateDynamic("Thickness")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableBorderOptions]
    }
  }

  /** The cell conditional formatting option for a table.
    */
  @js.native
  trait TableCellConditionalFormatting extends js.Object {
    var FieldId: FieldId
    var TextFormat: js.UndefOr[TextConditionalFormat]
  }

  object TableCellConditionalFormatting {
    @inline
    def apply(
        FieldId: FieldId,
        TextFormat: js.UndefOr[TextConditionalFormat] = js.undefined
    ): TableCellConditionalFormatting = {
      val __obj = js.Dynamic.literal(
        "FieldId" -> FieldId.asInstanceOf[js.Any]
      )

      TextFormat.foreach(__v => __obj.updateDynamic("TextFormat")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableCellConditionalFormatting]
    }
  }

  /** The sizing options for the table image configuration.
    */
  @js.native
  trait TableCellImageSizingConfiguration extends js.Object {
    var TableCellImageScalingConfiguration: js.UndefOr[TableCellImageScalingConfiguration]
  }

  object TableCellImageSizingConfiguration {
    @inline
    def apply(
        TableCellImageScalingConfiguration: js.UndefOr[TableCellImageScalingConfiguration] = js.undefined
    ): TableCellImageSizingConfiguration = {
      val __obj = js.Dynamic.literal()
      TableCellImageScalingConfiguration.foreach(__v => __obj.updateDynamic("TableCellImageScalingConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableCellImageSizingConfiguration]
    }
  }

  /** The table cell style for a cell in pivot table or table visual.
    */
  @js.native
  trait TableCellStyle extends js.Object {
    var BackgroundColor: js.UndefOr[HexColor]
    var Border: js.UndefOr[GlobalTableBorderOptions]
    var FontConfiguration: js.UndefOr[FontConfiguration]
    var Height: js.UndefOr[TableFieldHeight]
    var HorizontalTextAlignment: js.UndefOr[HorizontalTextAlignment]
    var TextWrap: js.UndefOr[TextWrap]
    var VerticalTextAlignment: js.UndefOr[VerticalTextAlignment]
    var Visibility: js.UndefOr[Visibility]
  }

  object TableCellStyle {
    @inline
    def apply(
        BackgroundColor: js.UndefOr[HexColor] = js.undefined,
        Border: js.UndefOr[GlobalTableBorderOptions] = js.undefined,
        FontConfiguration: js.UndefOr[FontConfiguration] = js.undefined,
        Height: js.UndefOr[TableFieldHeight] = js.undefined,
        HorizontalTextAlignment: js.UndefOr[HorizontalTextAlignment] = js.undefined,
        TextWrap: js.UndefOr[TextWrap] = js.undefined,
        VerticalTextAlignment: js.UndefOr[VerticalTextAlignment] = js.undefined,
        Visibility: js.UndefOr[Visibility] = js.undefined
    ): TableCellStyle = {
      val __obj = js.Dynamic.literal()
      BackgroundColor.foreach(__v => __obj.updateDynamic("BackgroundColor")(__v.asInstanceOf[js.Any]))
      Border.foreach(__v => __obj.updateDynamic("Border")(__v.asInstanceOf[js.Any]))
      FontConfiguration.foreach(__v => __obj.updateDynamic("FontConfiguration")(__v.asInstanceOf[js.Any]))
      Height.foreach(__v => __obj.updateDynamic("Height")(__v.asInstanceOf[js.Any]))
      HorizontalTextAlignment.foreach(__v => __obj.updateDynamic("HorizontalTextAlignment")(__v.asInstanceOf[js.Any]))
      TextWrap.foreach(__v => __obj.updateDynamic("TextWrap")(__v.asInstanceOf[js.Any]))
      VerticalTextAlignment.foreach(__v => __obj.updateDynamic("VerticalTextAlignment")(__v.asInstanceOf[js.Any]))
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableCellStyle]
    }
  }

  /** The conditional formatting for a <code>PivotTableVisual</code>.
    */
  @js.native
  trait TableConditionalFormatting extends js.Object {
    var ConditionalFormattingOptions: js.UndefOr[TableConditionalFormattingOptionList]
  }

  object TableConditionalFormatting {
    @inline
    def apply(
        ConditionalFormattingOptions: js.UndefOr[TableConditionalFormattingOptionList] = js.undefined
    ): TableConditionalFormatting = {
      val __obj = js.Dynamic.literal()
      ConditionalFormattingOptions.foreach(__v => __obj.updateDynamic("ConditionalFormattingOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableConditionalFormatting]
    }
  }

  /** Conditional formatting options for a <code>PivotTableVisual</code>.
    */
  @js.native
  trait TableConditionalFormattingOption extends js.Object {
    var Cell: js.UndefOr[TableCellConditionalFormatting]
    var Row: js.UndefOr[TableRowConditionalFormatting]
  }

  object TableConditionalFormattingOption {
    @inline
    def apply(
        Cell: js.UndefOr[TableCellConditionalFormatting] = js.undefined,
        Row: js.UndefOr[TableRowConditionalFormatting] = js.undefined
    ): TableConditionalFormattingOption = {
      val __obj = js.Dynamic.literal()
      Cell.foreach(__v => __obj.updateDynamic("Cell")(__v.asInstanceOf[js.Any]))
      Row.foreach(__v => __obj.updateDynamic("Row")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableConditionalFormattingOption]
    }
  }

  /** The configuration for a <code>TableVisual</code>.
    */
  @js.native
  trait TableConfiguration extends js.Object {
    var FieldOptions: js.UndefOr[TableFieldOptions]
    var FieldWells: js.UndefOr[TableFieldWells]
    var PaginatedReportOptions: js.UndefOr[TablePaginatedReportOptions]
    var SortConfiguration: js.UndefOr[TableSortConfiguration]
    var TableOptions: js.UndefOr[TableOptions]
    var TotalOptions: js.UndefOr[TotalOptions]
  }

  object TableConfiguration {
    @inline
    def apply(
        FieldOptions: js.UndefOr[TableFieldOptions] = js.undefined,
        FieldWells: js.UndefOr[TableFieldWells] = js.undefined,
        PaginatedReportOptions: js.UndefOr[TablePaginatedReportOptions] = js.undefined,
        SortConfiguration: js.UndefOr[TableSortConfiguration] = js.undefined,
        TableOptions: js.UndefOr[TableOptions] = js.undefined,
        TotalOptions: js.UndefOr[TotalOptions] = js.undefined
    ): TableConfiguration = {
      val __obj = js.Dynamic.literal()
      FieldOptions.foreach(__v => __obj.updateDynamic("FieldOptions")(__v.asInstanceOf[js.Any]))
      FieldWells.foreach(__v => __obj.updateDynamic("FieldWells")(__v.asInstanceOf[js.Any]))
      PaginatedReportOptions.foreach(__v => __obj.updateDynamic("PaginatedReportOptions")(__v.asInstanceOf[js.Any]))
      SortConfiguration.foreach(__v => __obj.updateDynamic("SortConfiguration")(__v.asInstanceOf[js.Any]))
      TableOptions.foreach(__v => __obj.updateDynamic("TableOptions")(__v.asInstanceOf[js.Any]))
      TotalOptions.foreach(__v => __obj.updateDynamic("TotalOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableConfiguration]
    }
  }

  /** The custom icon content for the table link content configuration.
    */
  @js.native
  trait TableFieldCustomIconContent extends js.Object {
    var Icon: js.UndefOr[TableFieldIconSetType]
  }

  object TableFieldCustomIconContent {
    @inline
    def apply(
        Icon: js.UndefOr[TableFieldIconSetType] = js.undefined
    ): TableFieldCustomIconContent = {
      val __obj = js.Dynamic.literal()
      Icon.foreach(__v => __obj.updateDynamic("Icon")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableFieldCustomIconContent]
    }
  }

  /** The custom text content (value, font configuration) for the table link content configuration.
    */
  @js.native
  trait TableFieldCustomTextContent extends js.Object {
    var FontConfiguration: FontConfiguration
    var Value: js.UndefOr[String]
  }

  object TableFieldCustomTextContent {
    @inline
    def apply(
        FontConfiguration: FontConfiguration,
        Value: js.UndefOr[String] = js.undefined
    ): TableFieldCustomTextContent = {
      val __obj = js.Dynamic.literal(
        "FontConfiguration" -> FontConfiguration.asInstanceOf[js.Any]
      )

      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableFieldCustomTextContent]
    }
  }

  /** The image configuration of a table field URL.
    */
  @js.native
  trait TableFieldImageConfiguration extends js.Object {
    var SizingOptions: js.UndefOr[TableCellImageSizingConfiguration]
  }

  object TableFieldImageConfiguration {
    @inline
    def apply(
        SizingOptions: js.UndefOr[TableCellImageSizingConfiguration] = js.undefined
    ): TableFieldImageConfiguration = {
      val __obj = js.Dynamic.literal()
      SizingOptions.foreach(__v => __obj.updateDynamic("SizingOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableFieldImageConfiguration]
    }
  }

  /** The link configuration of a table field URL.
    */
  @js.native
  trait TableFieldLinkConfiguration extends js.Object {
    var Content: TableFieldLinkContentConfiguration
    var Target: URLTargetConfiguration
  }

  object TableFieldLinkConfiguration {
    @inline
    def apply(
        Content: TableFieldLinkContentConfiguration,
        Target: URLTargetConfiguration
    ): TableFieldLinkConfiguration = {
      val __obj = js.Dynamic.literal(
        "Content" -> Content.asInstanceOf[js.Any],
        "Target" -> Target.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TableFieldLinkConfiguration]
    }
  }

  /** The URL content (text, icon) for the table link configuration.
    */
  @js.native
  trait TableFieldLinkContentConfiguration extends js.Object {
    var CustomIconContent: js.UndefOr[TableFieldCustomIconContent]
    var CustomTextContent: js.UndefOr[TableFieldCustomTextContent]
  }

  object TableFieldLinkContentConfiguration {
    @inline
    def apply(
        CustomIconContent: js.UndefOr[TableFieldCustomIconContent] = js.undefined,
        CustomTextContent: js.UndefOr[TableFieldCustomTextContent] = js.undefined
    ): TableFieldLinkContentConfiguration = {
      val __obj = js.Dynamic.literal()
      CustomIconContent.foreach(__v => __obj.updateDynamic("CustomIconContent")(__v.asInstanceOf[js.Any]))
      CustomTextContent.foreach(__v => __obj.updateDynamic("CustomTextContent")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableFieldLinkContentConfiguration]
    }
  }

  /** The options for a table field.
    */
  @js.native
  trait TableFieldOption extends js.Object {
    var FieldId: FieldId
    var CustomLabel: js.UndefOr[CustomLabel]
    var URLStyling: js.UndefOr[TableFieldURLConfiguration]
    var Visibility: js.UndefOr[Visibility]
    var Width: js.UndefOr[PixelLength]
  }

  object TableFieldOption {
    @inline
    def apply(
        FieldId: FieldId,
        CustomLabel: js.UndefOr[CustomLabel] = js.undefined,
        URLStyling: js.UndefOr[TableFieldURLConfiguration] = js.undefined,
        Visibility: js.UndefOr[Visibility] = js.undefined,
        Width: js.UndefOr[PixelLength] = js.undefined
    ): TableFieldOption = {
      val __obj = js.Dynamic.literal(
        "FieldId" -> FieldId.asInstanceOf[js.Any]
      )

      CustomLabel.foreach(__v => __obj.updateDynamic("CustomLabel")(__v.asInstanceOf[js.Any]))
      URLStyling.foreach(__v => __obj.updateDynamic("URLStyling")(__v.asInstanceOf[js.Any]))
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      Width.foreach(__v => __obj.updateDynamic("Width")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableFieldOption]
    }
  }

  /** The field options for a table visual.
    */
  @js.native
  trait TableFieldOptions extends js.Object {
    var Order: js.UndefOr[FieldOrderList]
    var SelectedFieldOptions: js.UndefOr[TableFieldOptionList]
  }

  object TableFieldOptions {
    @inline
    def apply(
        Order: js.UndefOr[FieldOrderList] = js.undefined,
        SelectedFieldOptions: js.UndefOr[TableFieldOptionList] = js.undefined
    ): TableFieldOptions = {
      val __obj = js.Dynamic.literal()
      Order.foreach(__v => __obj.updateDynamic("Order")(__v.asInstanceOf[js.Any]))
      SelectedFieldOptions.foreach(__v => __obj.updateDynamic("SelectedFieldOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableFieldOptions]
    }
  }

  /** The URL configuration for a table field.
    */
  @js.native
  trait TableFieldURLConfiguration extends js.Object {
    var ImageConfiguration: js.UndefOr[TableFieldImageConfiguration]
    var LinkConfiguration: js.UndefOr[TableFieldLinkConfiguration]
  }

  object TableFieldURLConfiguration {
    @inline
    def apply(
        ImageConfiguration: js.UndefOr[TableFieldImageConfiguration] = js.undefined,
        LinkConfiguration: js.UndefOr[TableFieldLinkConfiguration] = js.undefined
    ): TableFieldURLConfiguration = {
      val __obj = js.Dynamic.literal()
      ImageConfiguration.foreach(__v => __obj.updateDynamic("ImageConfiguration")(__v.asInstanceOf[js.Any]))
      LinkConfiguration.foreach(__v => __obj.updateDynamic("LinkConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableFieldURLConfiguration]
    }
  }

  /** The field wells for a table visual. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait TableFieldWells extends js.Object {
    var TableAggregatedFieldWells: js.UndefOr[TableAggregatedFieldWells]
    var TableUnaggregatedFieldWells: js.UndefOr[TableUnaggregatedFieldWells]
  }

  object TableFieldWells {
    @inline
    def apply(
        TableAggregatedFieldWells: js.UndefOr[TableAggregatedFieldWells] = js.undefined,
        TableUnaggregatedFieldWells: js.UndefOr[TableUnaggregatedFieldWells] = js.undefined
    ): TableFieldWells = {
      val __obj = js.Dynamic.literal()
      TableAggregatedFieldWells.foreach(__v => __obj.updateDynamic("TableAggregatedFieldWells")(__v.asInstanceOf[js.Any]))
      TableUnaggregatedFieldWells.foreach(__v => __obj.updateDynamic("TableUnaggregatedFieldWells")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableFieldWells]
    }
  }

  /** The table options for a table visual.
    */
  @js.native
  trait TableOptions extends js.Object {
    var CellStyle: js.UndefOr[TableCellStyle]
    var HeaderStyle: js.UndefOr[TableCellStyle]
    var Orientation: js.UndefOr[TableOrientation]
    var RowAlternateColorOptions: js.UndefOr[RowAlternateColorOptions]
  }

  object TableOptions {
    @inline
    def apply(
        CellStyle: js.UndefOr[TableCellStyle] = js.undefined,
        HeaderStyle: js.UndefOr[TableCellStyle] = js.undefined,
        Orientation: js.UndefOr[TableOrientation] = js.undefined,
        RowAlternateColorOptions: js.UndefOr[RowAlternateColorOptions] = js.undefined
    ): TableOptions = {
      val __obj = js.Dynamic.literal()
      CellStyle.foreach(__v => __obj.updateDynamic("CellStyle")(__v.asInstanceOf[js.Any]))
      HeaderStyle.foreach(__v => __obj.updateDynamic("HeaderStyle")(__v.asInstanceOf[js.Any]))
      Orientation.foreach(__v => __obj.updateDynamic("Orientation")(__v.asInstanceOf[js.Any]))
      RowAlternateColorOptions.foreach(__v => __obj.updateDynamic("RowAlternateColorOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableOptions]
    }
  }

  /** The paginated report options for a table visual.
    */
  @js.native
  trait TablePaginatedReportOptions extends js.Object {
    var OverflowColumnHeaderVisibility: js.UndefOr[Visibility]
    var VerticalOverflowVisibility: js.UndefOr[Visibility]
  }

  object TablePaginatedReportOptions {
    @inline
    def apply(
        OverflowColumnHeaderVisibility: js.UndefOr[Visibility] = js.undefined,
        VerticalOverflowVisibility: js.UndefOr[Visibility] = js.undefined
    ): TablePaginatedReportOptions = {
      val __obj = js.Dynamic.literal()
      OverflowColumnHeaderVisibility.foreach(__v => __obj.updateDynamic("OverflowColumnHeaderVisibility")(__v.asInstanceOf[js.Any]))
      VerticalOverflowVisibility.foreach(__v => __obj.updateDynamic("VerticalOverflowVisibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TablePaginatedReportOptions]
    }
  }

  /** The conditional formatting of a table row.
    */
  @js.native
  trait TableRowConditionalFormatting extends js.Object {
    var BackgroundColor: js.UndefOr[ConditionalFormattingColor]
    var TextColor: js.UndefOr[ConditionalFormattingColor]
  }

  object TableRowConditionalFormatting {
    @inline
    def apply(
        BackgroundColor: js.UndefOr[ConditionalFormattingColor] = js.undefined,
        TextColor: js.UndefOr[ConditionalFormattingColor] = js.undefined
    ): TableRowConditionalFormatting = {
      val __obj = js.Dynamic.literal()
      BackgroundColor.foreach(__v => __obj.updateDynamic("BackgroundColor")(__v.asInstanceOf[js.Any]))
      TextColor.foreach(__v => __obj.updateDynamic("TextColor")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableRowConditionalFormatting]
    }
  }

  /** The side border options for a table.
    */
  @js.native
  trait TableSideBorderOptions extends js.Object {
    var Bottom: js.UndefOr[TableBorderOptions]
    var InnerHorizontal: js.UndefOr[TableBorderOptions]
    var InnerVertical: js.UndefOr[TableBorderOptions]
    var Left: js.UndefOr[TableBorderOptions]
    var Right: js.UndefOr[TableBorderOptions]
    var Top: js.UndefOr[TableBorderOptions]
  }

  object TableSideBorderOptions {
    @inline
    def apply(
        Bottom: js.UndefOr[TableBorderOptions] = js.undefined,
        InnerHorizontal: js.UndefOr[TableBorderOptions] = js.undefined,
        InnerVertical: js.UndefOr[TableBorderOptions] = js.undefined,
        Left: js.UndefOr[TableBorderOptions] = js.undefined,
        Right: js.UndefOr[TableBorderOptions] = js.undefined,
        Top: js.UndefOr[TableBorderOptions] = js.undefined
    ): TableSideBorderOptions = {
      val __obj = js.Dynamic.literal()
      Bottom.foreach(__v => __obj.updateDynamic("Bottom")(__v.asInstanceOf[js.Any]))
      InnerHorizontal.foreach(__v => __obj.updateDynamic("InnerHorizontal")(__v.asInstanceOf[js.Any]))
      InnerVertical.foreach(__v => __obj.updateDynamic("InnerVertical")(__v.asInstanceOf[js.Any]))
      Left.foreach(__v => __obj.updateDynamic("Left")(__v.asInstanceOf[js.Any]))
      Right.foreach(__v => __obj.updateDynamic("Right")(__v.asInstanceOf[js.Any]))
      Top.foreach(__v => __obj.updateDynamic("Top")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableSideBorderOptions]
    }
  }

  /** The sort configuration for a <code>TableVisual</code>.
    */
  @js.native
  trait TableSortConfiguration extends js.Object {
    var PaginationConfiguration: js.UndefOr[PaginationConfiguration]
    var RowSort: js.UndefOr[RowSortList]
  }

  object TableSortConfiguration {
    @inline
    def apply(
        PaginationConfiguration: js.UndefOr[PaginationConfiguration] = js.undefined,
        RowSort: js.UndefOr[RowSortList] = js.undefined
    ): TableSortConfiguration = {
      val __obj = js.Dynamic.literal()
      PaginationConfiguration.foreach(__v => __obj.updateDynamic("PaginationConfiguration")(__v.asInstanceOf[js.Any]))
      RowSort.foreach(__v => __obj.updateDynamic("RowSort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableSortConfiguration]
    }
  }

  /** The unaggregated field well for the table.
    */
  @js.native
  trait TableUnaggregatedFieldWells extends js.Object {
    var Values: js.UndefOr[UnaggregatedFieldList]
  }

  object TableUnaggregatedFieldWells {
    @inline
    def apply(
        Values: js.UndefOr[UnaggregatedFieldList] = js.undefined
    ): TableUnaggregatedFieldWells = {
      val __obj = js.Dynamic.literal()
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableUnaggregatedFieldWells]
    }
  }

  /** A table visual. For more information, see [[https://docs.aws.amazon.com/quicksight/latest/user/tabular.html|Using tables as visuals]] in the <i>Amazon QuickSight User Guide</i>.
    */
  @js.native
  trait TableVisual extends js.Object {
    var VisualId: ShortRestrictiveResourceId
    var Actions: js.UndefOr[VisualCustomActionList]
    var ChartConfiguration: js.UndefOr[TableConfiguration]
    var ConditionalFormatting: js.UndefOr[TableConditionalFormatting]
    var Subtitle: js.UndefOr[VisualSubtitleLabelOptions]
    var Title: js.UndefOr[VisualTitleLabelOptions]
  }

  object TableVisual {
    @inline
    def apply(
        VisualId: ShortRestrictiveResourceId,
        Actions: js.UndefOr[VisualCustomActionList] = js.undefined,
        ChartConfiguration: js.UndefOr[TableConfiguration] = js.undefined,
        ConditionalFormatting: js.UndefOr[TableConditionalFormatting] = js.undefined,
        Subtitle: js.UndefOr[VisualSubtitleLabelOptions] = js.undefined,
        Title: js.UndefOr[VisualTitleLabelOptions] = js.undefined
    ): TableVisual = {
      val __obj = js.Dynamic.literal(
        "VisualId" -> VisualId.asInstanceOf[js.Any]
      )

      Actions.foreach(__v => __obj.updateDynamic("Actions")(__v.asInstanceOf[js.Any]))
      ChartConfiguration.foreach(__v => __obj.updateDynamic("ChartConfiguration")(__v.asInstanceOf[js.Any]))
      ConditionalFormatting.foreach(__v => __obj.updateDynamic("ConditionalFormatting")(__v.asInstanceOf[js.Any]))
      Subtitle.foreach(__v => __obj.updateDynamic("Subtitle")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TableVisual]
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
    var TemplateId: js.UndefOr[ShortRestrictiveResourceId]
    var Version: js.UndefOr[TemplateVersion]
  }

  object Template {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[TemplateName] = js.undefined,
        TemplateId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined,
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
    var ViolatedEntities: js.UndefOr[EntityList]
  }

  object TemplateError {
    @inline
    def apply(
        Message: js.UndefOr[NonEmptyString] = js.undefined,
        Type: js.UndefOr[TemplateErrorType] = js.undefined,
        ViolatedEntities: js.UndefOr[EntityList] = js.undefined
    ): TemplateError = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      ViolatedEntities.foreach(__v => __obj.updateDynamic("ViolatedEntities")(__v.asInstanceOf[js.Any]))
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
    var TemplateId: js.UndefOr[ShortRestrictiveResourceId]
  }

  object TemplateSummary {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        LatestVersionNumber: js.UndefOr[VersionNumber] = js.undefined,
        Name: js.UndefOr[TemplateName] = js.undefined,
        TemplateId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined
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

  /** The detailed definition of a template.
    */
  @js.native
  trait TemplateVersionDefinition extends js.Object {
    var DataSetConfigurations: DataSetConfigurationList
    var AnalysisDefaults: js.UndefOr[AnalysisDefaults]
    var CalculatedFields: js.UndefOr[CalculatedFields]
    var ColumnConfigurations: js.UndefOr[ColumnConfigurationList]
    var FilterGroups: js.UndefOr[FilterGroupList]
    var ParameterDeclarations: js.UndefOr[ParameterDeclarationList]
    var Sheets: js.UndefOr[SheetDefinitionList]
  }

  object TemplateVersionDefinition {
    @inline
    def apply(
        DataSetConfigurations: DataSetConfigurationList,
        AnalysisDefaults: js.UndefOr[AnalysisDefaults] = js.undefined,
        CalculatedFields: js.UndefOr[CalculatedFields] = js.undefined,
        ColumnConfigurations: js.UndefOr[ColumnConfigurationList] = js.undefined,
        FilterGroups: js.UndefOr[FilterGroupList] = js.undefined,
        ParameterDeclarations: js.UndefOr[ParameterDeclarationList] = js.undefined,
        Sheets: js.UndefOr[SheetDefinitionList] = js.undefined
    ): TemplateVersionDefinition = {
      val __obj = js.Dynamic.literal(
        "DataSetConfigurations" -> DataSetConfigurations.asInstanceOf[js.Any]
      )

      AnalysisDefaults.foreach(__v => __obj.updateDynamic("AnalysisDefaults")(__v.asInstanceOf[js.Any]))
      CalculatedFields.foreach(__v => __obj.updateDynamic("CalculatedFields")(__v.asInstanceOf[js.Any]))
      ColumnConfigurations.foreach(__v => __obj.updateDynamic("ColumnConfigurations")(__v.asInstanceOf[js.Any]))
      FilterGroups.foreach(__v => __obj.updateDynamic("FilterGroups")(__v.asInstanceOf[js.Any]))
      ParameterDeclarations.foreach(__v => __obj.updateDynamic("ParameterDeclarations")(__v.asInstanceOf[js.Any]))
      Sheets.foreach(__v => __obj.updateDynamic("Sheets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TemplateVersionDefinition]
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

  /** The display options of a control.
    */
  @js.native
  trait TextAreaControlDisplayOptions extends js.Object {
    var PlaceholderOptions: js.UndefOr[TextControlPlaceholderOptions]
    var TitleOptions: js.UndefOr[LabelOptions]
  }

  object TextAreaControlDisplayOptions {
    @inline
    def apply(
        PlaceholderOptions: js.UndefOr[TextControlPlaceholderOptions] = js.undefined,
        TitleOptions: js.UndefOr[LabelOptions] = js.undefined
    ): TextAreaControlDisplayOptions = {
      val __obj = js.Dynamic.literal()
      PlaceholderOptions.foreach(__v => __obj.updateDynamic("PlaceholderOptions")(__v.asInstanceOf[js.Any]))
      TitleOptions.foreach(__v => __obj.updateDynamic("TitleOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TextAreaControlDisplayOptions]
    }
  }

  /** The conditional formatting for the text.
    */
  @js.native
  trait TextConditionalFormat extends js.Object {
    var BackgroundColor: js.UndefOr[ConditionalFormattingColor]
    var Icon: js.UndefOr[ConditionalFormattingIcon]
    var TextColor: js.UndefOr[ConditionalFormattingColor]
  }

  object TextConditionalFormat {
    @inline
    def apply(
        BackgroundColor: js.UndefOr[ConditionalFormattingColor] = js.undefined,
        Icon: js.UndefOr[ConditionalFormattingIcon] = js.undefined,
        TextColor: js.UndefOr[ConditionalFormattingColor] = js.undefined
    ): TextConditionalFormat = {
      val __obj = js.Dynamic.literal()
      BackgroundColor.foreach(__v => __obj.updateDynamic("BackgroundColor")(__v.asInstanceOf[js.Any]))
      Icon.foreach(__v => __obj.updateDynamic("Icon")(__v.asInstanceOf[js.Any]))
      TextColor.foreach(__v => __obj.updateDynamic("TextColor")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TextConditionalFormat]
    }
  }

  /** The configuration of the placeholder options in a text control.
    */
  @js.native
  trait TextControlPlaceholderOptions extends js.Object {
    var Visibility: js.UndefOr[Visibility]
  }

  object TextControlPlaceholderOptions {
    @inline
    def apply(
        Visibility: js.UndefOr[Visibility] = js.undefined
    ): TextControlPlaceholderOptions = {
      val __obj = js.Dynamic.literal()
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TextControlPlaceholderOptions]
    }
  }

  /** The display options of a control.
    */
  @js.native
  trait TextFieldControlDisplayOptions extends js.Object {
    var PlaceholderOptions: js.UndefOr[TextControlPlaceholderOptions]
    var TitleOptions: js.UndefOr[LabelOptions]
  }

  object TextFieldControlDisplayOptions {
    @inline
    def apply(
        PlaceholderOptions: js.UndefOr[TextControlPlaceholderOptions] = js.undefined,
        TitleOptions: js.UndefOr[LabelOptions] = js.undefined
    ): TextFieldControlDisplayOptions = {
      val __obj = js.Dynamic.literal()
      PlaceholderOptions.foreach(__v => __obj.updateDynamic("PlaceholderOptions")(__v.asInstanceOf[js.Any]))
      TitleOptions.foreach(__v => __obj.updateDynamic("TitleOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TextFieldControlDisplayOptions]
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
    var ThemeId: js.UndefOr[ShortRestrictiveResourceId]
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
        ThemeId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined,
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
    var Typography: js.UndefOr[Typography]
    var UIColorPalette: js.UndefOr[UIColorPalette]
  }

  object ThemeConfiguration {
    @inline
    def apply(
        DataColorPalette: js.UndefOr[DataColorPalette] = js.undefined,
        Sheet: js.UndefOr[SheetStyle] = js.undefined,
        Typography: js.UndefOr[Typography] = js.undefined,
        UIColorPalette: js.UndefOr[UIColorPalette] = js.undefined
    ): ThemeConfiguration = {
      val __obj = js.Dynamic.literal()
      DataColorPalette.foreach(__v => __obj.updateDynamic("DataColorPalette")(__v.asInstanceOf[js.Any]))
      Sheet.foreach(__v => __obj.updateDynamic("Sheet")(__v.asInstanceOf[js.Any]))
      Typography.foreach(__v => __obj.updateDynamic("Typography")(__v.asInstanceOf[js.Any]))
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
    var ThemeId: js.UndefOr[ShortRestrictiveResourceId]
  }

  object ThemeSummary {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        LatestVersionNumber: js.UndefOr[VersionNumber] = js.undefined,
        Name: js.UndefOr[ThemeName] = js.undefined,
        ThemeId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined
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
    var BaseThemeId: js.UndefOr[ShortRestrictiveResourceId]
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
        BaseThemeId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined,
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

  /** The options that determine the thousands separator configuration.
    */
  @js.native
  trait ThousandSeparatorOptions extends js.Object {
    var Symbol: js.UndefOr[NumericSeparatorSymbol]
    var Visibility: js.UndefOr[Visibility]
  }

  object ThousandSeparatorOptions {
    @inline
    def apply(
        Symbol: js.UndefOr[NumericSeparatorSymbol] = js.undefined,
        Visibility: js.UndefOr[Visibility] = js.undefined
    ): ThousandSeparatorOptions = {
      val __obj = js.Dynamic.literal()
      Symbol.foreach(__v => __obj.updateDynamic("Symbol")(__v.asInstanceOf[js.Any]))
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ThousandSeparatorOptions]
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

  /** The forecast properties setup of a forecast in the line chart.
    */
  @js.native
  trait TimeBasedForecastProperties extends js.Object {
    var LowerBoundary: js.UndefOr[Double]
    var PeriodsBackward: js.UndefOr[PeriodsBackward]
    var PeriodsForward: js.UndefOr[PeriodsForward]
    var PredictionInterval: js.UndefOr[PredictionInterval]
    var Seasonality: js.UndefOr[Seasonality]
    var UpperBoundary: js.UndefOr[Double]
  }

  object TimeBasedForecastProperties {
    @inline
    def apply(
        LowerBoundary: js.UndefOr[Double] = js.undefined,
        PeriodsBackward: js.UndefOr[PeriodsBackward] = js.undefined,
        PeriodsForward: js.UndefOr[PeriodsForward] = js.undefined,
        PredictionInterval: js.UndefOr[PredictionInterval] = js.undefined,
        Seasonality: js.UndefOr[Seasonality] = js.undefined,
        UpperBoundary: js.UndefOr[Double] = js.undefined
    ): TimeBasedForecastProperties = {
      val __obj = js.Dynamic.literal()
      LowerBoundary.foreach(__v => __obj.updateDynamic("LowerBoundary")(__v.asInstanceOf[js.Any]))
      PeriodsBackward.foreach(__v => __obj.updateDynamic("PeriodsBackward")(__v.asInstanceOf[js.Any]))
      PeriodsForward.foreach(__v => __obj.updateDynamic("PeriodsForward")(__v.asInstanceOf[js.Any]))
      PredictionInterval.foreach(__v => __obj.updateDynamic("PredictionInterval")(__v.asInstanceOf[js.Any]))
      Seasonality.foreach(__v => __obj.updateDynamic("Seasonality")(__v.asInstanceOf[js.Any]))
      UpperBoundary.foreach(__v => __obj.updateDynamic("UpperBoundary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimeBasedForecastProperties]
    }
  }

  /** A <code>TimeEqualityFilter</code> filters values that are equal to a given value.
    */
  @js.native
  trait TimeEqualityFilter extends js.Object {
    var Column: ColumnIdentifier
    var FilterId: ShortRestrictiveResourceId
    var ParameterName: js.UndefOr[ParameterName]
    var TimeGranularity: js.UndefOr[TimeGranularity]
    var Value: js.UndefOr[Timestamp]
  }

  object TimeEqualityFilter {
    @inline
    def apply(
        Column: ColumnIdentifier,
        FilterId: ShortRestrictiveResourceId,
        ParameterName: js.UndefOr[ParameterName] = js.undefined,
        TimeGranularity: js.UndefOr[TimeGranularity] = js.undefined,
        Value: js.UndefOr[Timestamp] = js.undefined
    ): TimeEqualityFilter = {
      val __obj = js.Dynamic.literal(
        "Column" -> Column.asInstanceOf[js.Any],
        "FilterId" -> FilterId.asInstanceOf[js.Any]
      )

      ParameterName.foreach(__v => __obj.updateDynamic("ParameterName")(__v.asInstanceOf[js.Any]))
      TimeGranularity.foreach(__v => __obj.updateDynamic("TimeGranularity")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimeEqualityFilter]
    }
  }

  /** The time range drill down filter.
    */
  @js.native
  trait TimeRangeDrillDownFilter extends js.Object {
    var Column: ColumnIdentifier
    var RangeMaximum: Timestamp
    var RangeMinimum: Timestamp
    var TimeGranularity: TimeGranularity
  }

  object TimeRangeDrillDownFilter {
    @inline
    def apply(
        Column: ColumnIdentifier,
        RangeMaximum: Timestamp,
        RangeMinimum: Timestamp,
        TimeGranularity: TimeGranularity
    ): TimeRangeDrillDownFilter = {
      val __obj = js.Dynamic.literal(
        "Column" -> Column.asInstanceOf[js.Any],
        "RangeMaximum" -> RangeMaximum.asInstanceOf[js.Any],
        "RangeMinimum" -> RangeMinimum.asInstanceOf[js.Any],
        "TimeGranularity" -> TimeGranularity.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TimeRangeDrillDownFilter]
    }
  }

  /** A <code>TimeRangeFilter</code> filters values that are between two specified values.
    */
  @js.native
  trait TimeRangeFilter extends js.Object {
    var Column: ColumnIdentifier
    var FilterId: ShortRestrictiveResourceId
    var NullOption: FilterNullOption
    var ExcludePeriodConfiguration: js.UndefOr[ExcludePeriodConfiguration]
    var IncludeMaximum: js.UndefOr[Boolean]
    var IncludeMinimum: js.UndefOr[Boolean]
    var RangeMaximumValue: js.UndefOr[TimeRangeFilterValue]
    var RangeMinimumValue: js.UndefOr[TimeRangeFilterValue]
    var TimeGranularity: js.UndefOr[TimeGranularity]
  }

  object TimeRangeFilter {
    @inline
    def apply(
        Column: ColumnIdentifier,
        FilterId: ShortRestrictiveResourceId,
        NullOption: FilterNullOption,
        ExcludePeriodConfiguration: js.UndefOr[ExcludePeriodConfiguration] = js.undefined,
        IncludeMaximum: js.UndefOr[Boolean] = js.undefined,
        IncludeMinimum: js.UndefOr[Boolean] = js.undefined,
        RangeMaximumValue: js.UndefOr[TimeRangeFilterValue] = js.undefined,
        RangeMinimumValue: js.UndefOr[TimeRangeFilterValue] = js.undefined,
        TimeGranularity: js.UndefOr[TimeGranularity] = js.undefined
    ): TimeRangeFilter = {
      val __obj = js.Dynamic.literal(
        "Column" -> Column.asInstanceOf[js.Any],
        "FilterId" -> FilterId.asInstanceOf[js.Any],
        "NullOption" -> NullOption.asInstanceOf[js.Any]
      )

      ExcludePeriodConfiguration.foreach(__v => __obj.updateDynamic("ExcludePeriodConfiguration")(__v.asInstanceOf[js.Any]))
      IncludeMaximum.foreach(__v => __obj.updateDynamic("IncludeMaximum")(__v.asInstanceOf[js.Any]))
      IncludeMinimum.foreach(__v => __obj.updateDynamic("IncludeMinimum")(__v.asInstanceOf[js.Any]))
      RangeMaximumValue.foreach(__v => __obj.updateDynamic("RangeMaximumValue")(__v.asInstanceOf[js.Any]))
      RangeMinimumValue.foreach(__v => __obj.updateDynamic("RangeMinimumValue")(__v.asInstanceOf[js.Any]))
      TimeGranularity.foreach(__v => __obj.updateDynamic("TimeGranularity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimeRangeFilter]
    }
  }

  /** The value of a time range filter. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait TimeRangeFilterValue extends js.Object {
    var Parameter: js.UndefOr[ParameterName]
    var RollingDate: js.UndefOr[RollingDateConfiguration]
    var StaticValue: js.UndefOr[Timestamp]
  }

  object TimeRangeFilterValue {
    @inline
    def apply(
        Parameter: js.UndefOr[ParameterName] = js.undefined,
        RollingDate: js.UndefOr[RollingDateConfiguration] = js.undefined,
        StaticValue: js.UndefOr[Timestamp] = js.undefined
    ): TimeRangeFilterValue = {
      val __obj = js.Dynamic.literal()
      Parameter.foreach(__v => __obj.updateDynamic("Parameter")(__v.asInstanceOf[js.Any]))
      RollingDate.foreach(__v => __obj.updateDynamic("RollingDate")(__v.asInstanceOf[js.Any]))
      StaticValue.foreach(__v => __obj.updateDynamic("StaticValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimeRangeFilterValue]
    }
  }

  /** The tooltip. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait TooltipItem extends js.Object {
    var ColumnTooltipItem: js.UndefOr[ColumnTooltipItem]
    var FieldTooltipItem: js.UndefOr[FieldTooltipItem]
  }

  object TooltipItem {
    @inline
    def apply(
        ColumnTooltipItem: js.UndefOr[ColumnTooltipItem] = js.undefined,
        FieldTooltipItem: js.UndefOr[FieldTooltipItem] = js.undefined
    ): TooltipItem = {
      val __obj = js.Dynamic.literal()
      ColumnTooltipItem.foreach(__v => __obj.updateDynamic("ColumnTooltipItem")(__v.asInstanceOf[js.Any]))
      FieldTooltipItem.foreach(__v => __obj.updateDynamic("FieldTooltipItem")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TooltipItem]
    }
  }

  /** The display options for the visual tooltip.
    */
  @js.native
  trait TooltipOptions extends js.Object {
    var FieldBasedTooltip: js.UndefOr[FieldBasedTooltip]
    var SelectedTooltipType: js.UndefOr[SelectedTooltipType]
    var TooltipVisibility: js.UndefOr[Visibility]
  }

  object TooltipOptions {
    @inline
    def apply(
        FieldBasedTooltip: js.UndefOr[FieldBasedTooltip] = js.undefined,
        SelectedTooltipType: js.UndefOr[SelectedTooltipType] = js.undefined,
        TooltipVisibility: js.UndefOr[Visibility] = js.undefined
    ): TooltipOptions = {
      val __obj = js.Dynamic.literal()
      FieldBasedTooltip.foreach(__v => __obj.updateDynamic("FieldBasedTooltip")(__v.asInstanceOf[js.Any]))
      SelectedTooltipType.foreach(__v => __obj.updateDynamic("SelectedTooltipType")(__v.asInstanceOf[js.Any]))
      TooltipVisibility.foreach(__v => __obj.updateDynamic("TooltipVisibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TooltipOptions]
    }
  }

  /** A <code>TopBottomFilter</code> filters values that are at the top or the bottom.
    */
  @js.native
  trait TopBottomFilter extends js.Object {
    var AggregationSortConfigurations: AggregationSortConfigurationList
    var Column: ColumnIdentifier
    var FilterId: ShortRestrictiveResourceId
    var Limit: js.UndefOr[Int]
    var ParameterName: js.UndefOr[ParameterName]
    var TimeGranularity: js.UndefOr[TimeGranularity]
  }

  object TopBottomFilter {
    @inline
    def apply(
        AggregationSortConfigurations: AggregationSortConfigurationList,
        Column: ColumnIdentifier,
        FilterId: ShortRestrictiveResourceId,
        Limit: js.UndefOr[Int] = js.undefined,
        ParameterName: js.UndefOr[ParameterName] = js.undefined,
        TimeGranularity: js.UndefOr[TimeGranularity] = js.undefined
    ): TopBottomFilter = {
      val __obj = js.Dynamic.literal(
        "AggregationSortConfigurations" -> AggregationSortConfigurations.asInstanceOf[js.Any],
        "Column" -> Column.asInstanceOf[js.Any],
        "FilterId" -> FilterId.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      ParameterName.foreach(__v => __obj.updateDynamic("ParameterName")(__v.asInstanceOf[js.Any]))
      TimeGranularity.foreach(__v => __obj.updateDynamic("TimeGranularity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TopBottomFilter]
    }
  }

  /** The top movers and bottom movers computation setup.
    */
  @js.native
  trait TopBottomMoversComputation extends js.Object {
    var Category: DimensionField
    var ComputationId: ShortRestrictiveResourceId
    var Time: DimensionField
    var Type: TopBottomComputationType
    var MoverSize: js.UndefOr[TopBottomMoversComputationMoverSize]
    var Name: js.UndefOr[String]
    var SortOrder: js.UndefOr[TopBottomSortOrder]
    var Value: js.UndefOr[MeasureField]
  }

  object TopBottomMoversComputation {
    @inline
    def apply(
        Category: DimensionField,
        ComputationId: ShortRestrictiveResourceId,
        Time: DimensionField,
        Type: TopBottomComputationType,
        MoverSize: js.UndefOr[TopBottomMoversComputationMoverSize] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        SortOrder: js.UndefOr[TopBottomSortOrder] = js.undefined,
        Value: js.UndefOr[MeasureField] = js.undefined
    ): TopBottomMoversComputation = {
      val __obj = js.Dynamic.literal(
        "Category" -> Category.asInstanceOf[js.Any],
        "ComputationId" -> ComputationId.asInstanceOf[js.Any],
        "Time" -> Time.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      MoverSize.foreach(__v => __obj.updateDynamic("MoverSize")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TopBottomMoversComputation]
    }
  }

  /** The top ranked and bottom ranked computation configuration.
    */
  @js.native
  trait TopBottomRankedComputation extends js.Object {
    var Category: DimensionField
    var ComputationId: ShortRestrictiveResourceId
    var Type: TopBottomComputationType
    var Name: js.UndefOr[String]
    var ResultSize: js.UndefOr[TopBottomRankedComputationResultSize]
    var Value: js.UndefOr[MeasureField]
  }

  object TopBottomRankedComputation {
    @inline
    def apply(
        Category: DimensionField,
        ComputationId: ShortRestrictiveResourceId,
        Type: TopBottomComputationType,
        Name: js.UndefOr[String] = js.undefined,
        ResultSize: js.UndefOr[TopBottomRankedComputationResultSize] = js.undefined,
        Value: js.UndefOr[MeasureField] = js.undefined
    ): TopBottomRankedComputation = {
      val __obj = js.Dynamic.literal(
        "Category" -> Category.asInstanceOf[js.Any],
        "ComputationId" -> ComputationId.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ResultSize.foreach(__v => __obj.updateDynamic("ResultSize")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TopBottomRankedComputation]
    }
  }

  /** The total aggregation computation configuration.
    */
  @js.native
  trait TotalAggregationComputation extends js.Object {
    var ComputationId: ShortRestrictiveResourceId
    var Value: MeasureField
    var Name: js.UndefOr[String]
  }

  object TotalAggregationComputation {
    @inline
    def apply(
        ComputationId: ShortRestrictiveResourceId,
        Value: MeasureField,
        Name: js.UndefOr[String] = js.undefined
    ): TotalAggregationComputation = {
      val __obj = js.Dynamic.literal(
        "ComputationId" -> ComputationId.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TotalAggregationComputation]
    }
  }

  /** The total options for a table visual.
    */
  @js.native
  trait TotalOptions extends js.Object {
    var CustomLabel: js.UndefOr[String]
    var Placement: js.UndefOr[TableTotalsPlacement]
    var ScrollStatus: js.UndefOr[TableTotalsScrollStatus]
    var TotalCellStyle: js.UndefOr[TableCellStyle]
    var TotalsVisibility: js.UndefOr[Visibility]
  }

  object TotalOptions {
    @inline
    def apply(
        CustomLabel: js.UndefOr[String] = js.undefined,
        Placement: js.UndefOr[TableTotalsPlacement] = js.undefined,
        ScrollStatus: js.UndefOr[TableTotalsScrollStatus] = js.undefined,
        TotalCellStyle: js.UndefOr[TableCellStyle] = js.undefined,
        TotalsVisibility: js.UndefOr[Visibility] = js.undefined
    ): TotalOptions = {
      val __obj = js.Dynamic.literal()
      CustomLabel.foreach(__v => __obj.updateDynamic("CustomLabel")(__v.asInstanceOf[js.Any]))
      Placement.foreach(__v => __obj.updateDynamic("Placement")(__v.asInstanceOf[js.Any]))
      ScrollStatus.foreach(__v => __obj.updateDynamic("ScrollStatus")(__v.asInstanceOf[js.Any]))
      TotalCellStyle.foreach(__v => __obj.updateDynamic("TotalCellStyle")(__v.asInstanceOf[js.Any]))
      TotalsVisibility.foreach(__v => __obj.updateDynamic("TotalsVisibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TotalOptions]
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

  /** Aggregated field wells of a tree map.
    */
  @js.native
  trait TreeMapAggregatedFieldWells extends js.Object {
    var Colors: js.UndefOr[TreeMapMeasureFieldList]
    var Groups: js.UndefOr[TreeMapDimensionFieldList]
    var Sizes: js.UndefOr[TreeMapMeasureFieldList]
  }

  object TreeMapAggregatedFieldWells {
    @inline
    def apply(
        Colors: js.UndefOr[TreeMapMeasureFieldList] = js.undefined,
        Groups: js.UndefOr[TreeMapDimensionFieldList] = js.undefined,
        Sizes: js.UndefOr[TreeMapMeasureFieldList] = js.undefined
    ): TreeMapAggregatedFieldWells = {
      val __obj = js.Dynamic.literal()
      Colors.foreach(__v => __obj.updateDynamic("Colors")(__v.asInstanceOf[js.Any]))
      Groups.foreach(__v => __obj.updateDynamic("Groups")(__v.asInstanceOf[js.Any]))
      Sizes.foreach(__v => __obj.updateDynamic("Sizes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TreeMapAggregatedFieldWells]
    }
  }

  /** The configuration of a tree map.
    */
  @js.native
  trait TreeMapConfiguration extends js.Object {
    var ColorLabelOptions: js.UndefOr[ChartAxisLabelOptions]
    var ColorScale: js.UndefOr[ColorScale]
    var DataLabels: js.UndefOr[DataLabelOptions]
    var FieldWells: js.UndefOr[TreeMapFieldWells]
    var GroupLabelOptions: js.UndefOr[ChartAxisLabelOptions]
    var Legend: js.UndefOr[LegendOptions]
    var SizeLabelOptions: js.UndefOr[ChartAxisLabelOptions]
    var SortConfiguration: js.UndefOr[TreeMapSortConfiguration]
    var Tooltip: js.UndefOr[TooltipOptions]
  }

  object TreeMapConfiguration {
    @inline
    def apply(
        ColorLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined,
        ColorScale: js.UndefOr[ColorScale] = js.undefined,
        DataLabels: js.UndefOr[DataLabelOptions] = js.undefined,
        FieldWells: js.UndefOr[TreeMapFieldWells] = js.undefined,
        GroupLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined,
        Legend: js.UndefOr[LegendOptions] = js.undefined,
        SizeLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined,
        SortConfiguration: js.UndefOr[TreeMapSortConfiguration] = js.undefined,
        Tooltip: js.UndefOr[TooltipOptions] = js.undefined
    ): TreeMapConfiguration = {
      val __obj = js.Dynamic.literal()
      ColorLabelOptions.foreach(__v => __obj.updateDynamic("ColorLabelOptions")(__v.asInstanceOf[js.Any]))
      ColorScale.foreach(__v => __obj.updateDynamic("ColorScale")(__v.asInstanceOf[js.Any]))
      DataLabels.foreach(__v => __obj.updateDynamic("DataLabels")(__v.asInstanceOf[js.Any]))
      FieldWells.foreach(__v => __obj.updateDynamic("FieldWells")(__v.asInstanceOf[js.Any]))
      GroupLabelOptions.foreach(__v => __obj.updateDynamic("GroupLabelOptions")(__v.asInstanceOf[js.Any]))
      Legend.foreach(__v => __obj.updateDynamic("Legend")(__v.asInstanceOf[js.Any]))
      SizeLabelOptions.foreach(__v => __obj.updateDynamic("SizeLabelOptions")(__v.asInstanceOf[js.Any]))
      SortConfiguration.foreach(__v => __obj.updateDynamic("SortConfiguration")(__v.asInstanceOf[js.Any]))
      Tooltip.foreach(__v => __obj.updateDynamic("Tooltip")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TreeMapConfiguration]
    }
  }

  /** The field wells of a tree map. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait TreeMapFieldWells extends js.Object {
    var TreeMapAggregatedFieldWells: js.UndefOr[TreeMapAggregatedFieldWells]
  }

  object TreeMapFieldWells {
    @inline
    def apply(
        TreeMapAggregatedFieldWells: js.UndefOr[TreeMapAggregatedFieldWells] = js.undefined
    ): TreeMapFieldWells = {
      val __obj = js.Dynamic.literal()
      TreeMapAggregatedFieldWells.foreach(__v => __obj.updateDynamic("TreeMapAggregatedFieldWells")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TreeMapFieldWells]
    }
  }

  /** The sort configuration of a tree map.
    */
  @js.native
  trait TreeMapSortConfiguration extends js.Object {
    var TreeMapGroupItemsLimitConfiguration: js.UndefOr[ItemsLimitConfiguration]
    var TreeMapSort: js.UndefOr[FieldSortOptionsList]
  }

  object TreeMapSortConfiguration {
    @inline
    def apply(
        TreeMapGroupItemsLimitConfiguration: js.UndefOr[ItemsLimitConfiguration] = js.undefined,
        TreeMapSort: js.UndefOr[FieldSortOptionsList] = js.undefined
    ): TreeMapSortConfiguration = {
      val __obj = js.Dynamic.literal()
      TreeMapGroupItemsLimitConfiguration.foreach(__v => __obj.updateDynamic("TreeMapGroupItemsLimitConfiguration")(__v.asInstanceOf[js.Any]))
      TreeMapSort.foreach(__v => __obj.updateDynamic("TreeMapSort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TreeMapSortConfiguration]
    }
  }

  /** A tree map. For more information, see [[https://docs.aws.amazon.com/quicksight/latest/user/tree-map.html|Using tree maps]] in the <i>Amazon QuickSight User Guide</i>.
    */
  @js.native
  trait TreeMapVisual extends js.Object {
    var VisualId: ShortRestrictiveResourceId
    var Actions: js.UndefOr[VisualCustomActionList]
    var ChartConfiguration: js.UndefOr[TreeMapConfiguration]
    var ColumnHierarchies: js.UndefOr[ColumnHierarchyList]
    var Subtitle: js.UndefOr[VisualSubtitleLabelOptions]
    var Title: js.UndefOr[VisualTitleLabelOptions]
  }

  object TreeMapVisual {
    @inline
    def apply(
        VisualId: ShortRestrictiveResourceId,
        Actions: js.UndefOr[VisualCustomActionList] = js.undefined,
        ChartConfiguration: js.UndefOr[TreeMapConfiguration] = js.undefined,
        ColumnHierarchies: js.UndefOr[ColumnHierarchyList] = js.undefined,
        Subtitle: js.UndefOr[VisualSubtitleLabelOptions] = js.undefined,
        Title: js.UndefOr[VisualTitleLabelOptions] = js.undefined
    ): TreeMapVisual = {
      val __obj = js.Dynamic.literal(
        "VisualId" -> VisualId.asInstanceOf[js.Any]
      )

      Actions.foreach(__v => __obj.updateDynamic("Actions")(__v.asInstanceOf[js.Any]))
      ChartConfiguration.foreach(__v => __obj.updateDynamic("ChartConfiguration")(__v.asInstanceOf[js.Any]))
      ColumnHierarchies.foreach(__v => __obj.updateDynamic("ColumnHierarchies")(__v.asInstanceOf[js.Any]))
      Subtitle.foreach(__v => __obj.updateDynamic("Subtitle")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TreeMapVisual]
    }
  }

  /** The options that determine the presentation of trend arrows in a KPI visual.
    */
  @js.native
  trait TrendArrowOptions extends js.Object {
    var Visibility: js.UndefOr[Visibility]
  }

  object TrendArrowOptions {
    @inline
    def apply(
        Visibility: js.UndefOr[Visibility] = js.undefined
    ): TrendArrowOptions = {
      val __obj = js.Dynamic.literal()
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrendArrowOptions]
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

  /** Determines the typography options.
    */
  @js.native
  trait Typography extends js.Object {
    var FontFamilies: js.UndefOr[FontList]
  }

  object Typography {
    @inline
    def apply(
        FontFamilies: js.UndefOr[FontList] = js.undefined
    ): Typography = {
      val __obj = js.Dynamic.literal()
      FontFamilies.foreach(__v => __obj.updateDynamic("FontFamilies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Typography]
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

  /** The unaggregated field for a table.
    */
  @js.native
  trait UnaggregatedField extends js.Object {
    var Column: ColumnIdentifier
    var FieldId: FieldId
    var FormatConfiguration: js.UndefOr[FormatConfiguration]
  }

  object UnaggregatedField {
    @inline
    def apply(
        Column: ColumnIdentifier,
        FieldId: FieldId,
        FormatConfiguration: js.UndefOr[FormatConfiguration] = js.undefined
    ): UnaggregatedField = {
      val __obj = js.Dynamic.literal(
        "Column" -> Column.asInstanceOf[js.Any],
        "FieldId" -> FieldId.asInstanceOf[js.Any]
      )

      FormatConfiguration.foreach(__v => __obj.updateDynamic("FormatConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UnaggregatedField]
    }
  }

  /** The unique values computation configuration.
    */
  @js.native
  trait UniqueValuesComputation extends js.Object {
    var Category: DimensionField
    var ComputationId: ShortRestrictiveResourceId
    var Name: js.UndefOr[String]
  }

  object UniqueValuesComputation {
    @inline
    def apply(
        Category: DimensionField,
        ComputationId: ShortRestrictiveResourceId,
        Name: js.UndefOr[String] = js.undefined
    ): UniqueValuesComputation = {
      val __obj = js.Dynamic.literal(
        "Category" -> Category.asInstanceOf[js.Any],
        "ComputationId" -> ComputationId.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UniqueValuesComputation]
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
    var TerminationProtectionEnabled: js.UndefOr[Boolean]
  }

  object UpdateAccountSettingsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DefaultNamespace: Namespace,
        NotificationEmail: js.UndefOr[String] = js.undefined,
        TerminationProtectionEnabled: js.UndefOr[Boolean] = js.undefined
    ): UpdateAccountSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "DefaultNamespace" -> DefaultNamespace.asInstanceOf[js.Any]
      )

      NotificationEmail.foreach(__v => __obj.updateDynamic("NotificationEmail")(__v.asInstanceOf[js.Any]))
      TerminationProtectionEnabled.foreach(__v => __obj.updateDynamic("TerminationProtectionEnabled")(__v.asInstanceOf[js.Any]))
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
    var AnalysisId: ShortRestrictiveResourceId
    var AwsAccountId: AwsAccountId
    var GrantPermissions: js.UndefOr[UpdateResourcePermissionList]
    var RevokePermissions: js.UndefOr[UpdateResourcePermissionList]
  }

  object UpdateAnalysisPermissionsRequest {
    @inline
    def apply(
        AnalysisId: ShortRestrictiveResourceId,
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
    var AnalysisId: js.UndefOr[ShortRestrictiveResourceId]
    var Permissions: js.UndefOr[ResourcePermissionList]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object UpdateAnalysisPermissionsResponse {
    @inline
    def apply(
        AnalysisArn: js.UndefOr[Arn] = js.undefined,
        AnalysisId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined,
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
    var AnalysisId: ShortRestrictiveResourceId
    var AwsAccountId: AwsAccountId
    var Name: AnalysisName
    var Definition: js.UndefOr[AnalysisDefinition]
    var Parameters: js.UndefOr[Parameters]
    var SourceEntity: js.UndefOr[AnalysisSourceEntity]
    var ThemeArn: js.UndefOr[Arn]
  }

  object UpdateAnalysisRequest {
    @inline
    def apply(
        AnalysisId: ShortRestrictiveResourceId,
        AwsAccountId: AwsAccountId,
        Name: AnalysisName,
        Definition: js.UndefOr[AnalysisDefinition] = js.undefined,
        Parameters: js.UndefOr[Parameters] = js.undefined,
        SourceEntity: js.UndefOr[AnalysisSourceEntity] = js.undefined,
        ThemeArn: js.UndefOr[Arn] = js.undefined
    ): UpdateAnalysisRequest = {
      val __obj = js.Dynamic.literal(
        "AnalysisId" -> AnalysisId.asInstanceOf[js.Any],
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Definition.foreach(__v => __obj.updateDynamic("Definition")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      SourceEntity.foreach(__v => __obj.updateDynamic("SourceEntity")(__v.asInstanceOf[js.Any]))
      ThemeArn.foreach(__v => __obj.updateDynamic("ThemeArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAnalysisRequest]
    }
  }

  @js.native
  trait UpdateAnalysisResponse extends js.Object {
    var AnalysisId: js.UndefOr[ShortRestrictiveResourceId]
    var Arn: js.UndefOr[Arn]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var UpdateStatus: js.UndefOr[ResourceStatus]
  }

  object UpdateAnalysisResponse {
    @inline
    def apply(
        AnalysisId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined,
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
    var DashboardId: ShortRestrictiveResourceId
    var GrantLinkPermissions: js.UndefOr[UpdateLinkPermissionList]
    var GrantPermissions: js.UndefOr[UpdateResourcePermissionList]
    var RevokeLinkPermissions: js.UndefOr[UpdateLinkPermissionList]
    var RevokePermissions: js.UndefOr[UpdateResourcePermissionList]
  }

  object UpdateDashboardPermissionsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DashboardId: ShortRestrictiveResourceId,
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
    var DashboardId: js.UndefOr[ShortRestrictiveResourceId]
    var LinkSharingConfiguration: js.UndefOr[LinkSharingConfiguration]
    var Permissions: js.UndefOr[ResourcePermissionList]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object UpdateDashboardPermissionsResponse {
    @inline
    def apply(
        DashboardArn: js.UndefOr[Arn] = js.undefined,
        DashboardId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined,
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
    var DashboardId: ShortRestrictiveResourceId
    var VersionNumber: VersionNumber
  }

  object UpdateDashboardPublishedVersionRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DashboardId: ShortRestrictiveResourceId,
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
    var DashboardId: js.UndefOr[ShortRestrictiveResourceId]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object UpdateDashboardPublishedVersionResponse {
    @inline
    def apply(
        DashboardArn: js.UndefOr[Arn] = js.undefined,
        DashboardId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined,
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
    var DashboardId: ShortRestrictiveResourceId
    var Name: DashboardName
    var DashboardPublishOptions: js.UndefOr[DashboardPublishOptions]
    var Definition: js.UndefOr[DashboardVersionDefinition]
    var Parameters: js.UndefOr[Parameters]
    var SourceEntity: js.UndefOr[DashboardSourceEntity]
    var ThemeArn: js.UndefOr[Arn]
    var VersionDescription: js.UndefOr[VersionDescription]
  }

  object UpdateDashboardRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        DashboardId: ShortRestrictiveResourceId,
        Name: DashboardName,
        DashboardPublishOptions: js.UndefOr[DashboardPublishOptions] = js.undefined,
        Definition: js.UndefOr[DashboardVersionDefinition] = js.undefined,
        Parameters: js.UndefOr[Parameters] = js.undefined,
        SourceEntity: js.UndefOr[DashboardSourceEntity] = js.undefined,
        ThemeArn: js.UndefOr[Arn] = js.undefined,
        VersionDescription: js.UndefOr[VersionDescription] = js.undefined
    ): UpdateDashboardRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "DashboardId" -> DashboardId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      DashboardPublishOptions.foreach(__v => __obj.updateDynamic("DashboardPublishOptions")(__v.asInstanceOf[js.Any]))
      Definition.foreach(__v => __obj.updateDynamic("Definition")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      SourceEntity.foreach(__v => __obj.updateDynamic("SourceEntity")(__v.asInstanceOf[js.Any]))
      ThemeArn.foreach(__v => __obj.updateDynamic("ThemeArn")(__v.asInstanceOf[js.Any]))
      VersionDescription.foreach(__v => __obj.updateDynamic("VersionDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDashboardRequest]
    }
  }

  @js.native
  trait UpdateDashboardResponse extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreationStatus: js.UndefOr[ResourceStatus]
    var DashboardId: js.UndefOr[ShortRestrictiveResourceId]
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
    var VersionArn: js.UndefOr[Arn]
  }

  object UpdateDashboardResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreationStatus: js.UndefOr[ResourceStatus] = js.undefined,
        DashboardId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined,
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
  trait UpdatePublicSharingSettingsRequest extends js.Object {
    var AwsAccountId: AwsAccountId
    var PublicSharingEnabled: js.UndefOr[Boolean]
  }

  object UpdatePublicSharingSettingsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        PublicSharingEnabled: js.UndefOr[Boolean] = js.undefined
    ): UpdatePublicSharingSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any]
      )

      PublicSharingEnabled.foreach(__v => __obj.updateDynamic("PublicSharingEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePublicSharingSettingsRequest]
    }
  }

  @js.native
  trait UpdatePublicSharingSettingsResponse extends js.Object {
    var RequestId: js.UndefOr[String]
    var Status: js.UndefOr[StatusCode]
  }

  object UpdatePublicSharingSettingsResponse {
    @inline
    def apply(
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined
    ): UpdatePublicSharingSettingsResponse = {
      val __obj = js.Dynamic.literal()
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePublicSharingSettingsResponse]
    }
  }

  @js.native
  trait UpdateTemplateAliasRequest extends js.Object {
    var AliasName: AliasName
    var AwsAccountId: AwsAccountId
    var TemplateId: ShortRestrictiveResourceId
    var TemplateVersionNumber: VersionNumber
  }

  object UpdateTemplateAliasRequest {
    @inline
    def apply(
        AliasName: AliasName,
        AwsAccountId: AwsAccountId,
        TemplateId: ShortRestrictiveResourceId,
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
    var TemplateId: ShortRestrictiveResourceId
    var GrantPermissions: js.UndefOr[UpdateResourcePermissionList]
    var RevokePermissions: js.UndefOr[UpdateResourcePermissionList]
  }

  object UpdateTemplatePermissionsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        TemplateId: ShortRestrictiveResourceId,
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
    var TemplateId: js.UndefOr[ShortRestrictiveResourceId]
  }

  object UpdateTemplatePermissionsResponse {
    @inline
    def apply(
        Permissions: js.UndefOr[ResourcePermissionList] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        TemplateArn: js.UndefOr[Arn] = js.undefined,
        TemplateId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined
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
    var TemplateId: ShortRestrictiveResourceId
    var Definition: js.UndefOr[TemplateVersionDefinition]
    var Name: js.UndefOr[TemplateName]
    var SourceEntity: js.UndefOr[TemplateSourceEntity]
    var VersionDescription: js.UndefOr[VersionDescription]
  }

  object UpdateTemplateRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        TemplateId: ShortRestrictiveResourceId,
        Definition: js.UndefOr[TemplateVersionDefinition] = js.undefined,
        Name: js.UndefOr[TemplateName] = js.undefined,
        SourceEntity: js.UndefOr[TemplateSourceEntity] = js.undefined,
        VersionDescription: js.UndefOr[VersionDescription] = js.undefined
    ): UpdateTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "TemplateId" -> TemplateId.asInstanceOf[js.Any]
      )

      Definition.foreach(__v => __obj.updateDynamic("Definition")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SourceEntity.foreach(__v => __obj.updateDynamic("SourceEntity")(__v.asInstanceOf[js.Any]))
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
    var TemplateId: js.UndefOr[ShortRestrictiveResourceId]
    var VersionArn: js.UndefOr[Arn]
  }

  object UpdateTemplateResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreationStatus: js.UndefOr[ResourceStatus] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        TemplateId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined,
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
    var ThemeId: ShortRestrictiveResourceId
    var ThemeVersionNumber: VersionNumber
  }

  object UpdateThemeAliasRequest {
    @inline
    def apply(
        AliasName: AliasName,
        AwsAccountId: AwsAccountId,
        ThemeId: ShortRestrictiveResourceId,
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
    var ThemeId: ShortRestrictiveResourceId
    var GrantPermissions: js.UndefOr[UpdateResourcePermissionList]
    var RevokePermissions: js.UndefOr[UpdateResourcePermissionList]
  }

  object UpdateThemePermissionsRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        ThemeId: ShortRestrictiveResourceId,
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
    var ThemeId: js.UndefOr[ShortRestrictiveResourceId]
  }

  object UpdateThemePermissionsResponse {
    @inline
    def apply(
        Permissions: js.UndefOr[ResourcePermissionList] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        ThemeArn: js.UndefOr[Arn] = js.undefined,
        ThemeId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined
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
    var BaseThemeId: ShortRestrictiveResourceId
    var ThemeId: ShortRestrictiveResourceId
    var Configuration: js.UndefOr[ThemeConfiguration]
    var Name: js.UndefOr[ThemeName]
    var VersionDescription: js.UndefOr[VersionDescription]
  }

  object UpdateThemeRequest {
    @inline
    def apply(
        AwsAccountId: AwsAccountId,
        BaseThemeId: ShortRestrictiveResourceId,
        ThemeId: ShortRestrictiveResourceId,
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
    var ThemeId: js.UndefOr[ShortRestrictiveResourceId]
    var VersionArn: js.UndefOr[Arn]
  }

  object UpdateThemeResponse {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreationStatus: js.UndefOr[ResourceStatus] = js.undefined,
        RequestId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[StatusCode] = js.undefined,
        ThemeId: js.UndefOr[ShortRestrictiveResourceId] = js.undefined,
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

  /** The range options for the data zoom scroll bar.
    */
  @js.native
  trait VisibleRangeOptions extends js.Object {
    var PercentRange: js.UndefOr[PercentVisibleRange]
  }

  object VisibleRangeOptions {
    @inline
    def apply(
        PercentRange: js.UndefOr[PercentVisibleRange] = js.undefined
    ): VisibleRangeOptions = {
      val __obj = js.Dynamic.literal()
      PercentRange.foreach(__v => __obj.updateDynamic("PercentRange")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VisibleRangeOptions]
    }
  }

  /** A visual displayed on a sheet in an analysis, dashboard, or template. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait Visual extends js.Object {
    var BarChartVisual: js.UndefOr[BarChartVisual]
    var BoxPlotVisual: js.UndefOr[BoxPlotVisual]
    var ComboChartVisual: js.UndefOr[ComboChartVisual]
    var CustomContentVisual: js.UndefOr[CustomContentVisual]
    var EmptyVisual: js.UndefOr[EmptyVisual]
    var FilledMapVisual: js.UndefOr[FilledMapVisual]
    var FunnelChartVisual: js.UndefOr[FunnelChartVisual]
    var GaugeChartVisual: js.UndefOr[GaugeChartVisual]
    var GeospatialMapVisual: js.UndefOr[GeospatialMapVisual]
    var HeatMapVisual: js.UndefOr[HeatMapVisual]
    var HistogramVisual: js.UndefOr[HistogramVisual]
    var InsightVisual: js.UndefOr[InsightVisual]
    var KPIVisual: js.UndefOr[KPIVisual]
    var LineChartVisual: js.UndefOr[LineChartVisual]
    var PieChartVisual: js.UndefOr[PieChartVisual]
    var PivotTableVisual: js.UndefOr[PivotTableVisual]
    var SankeyDiagramVisual: js.UndefOr[SankeyDiagramVisual]
    var ScatterPlotVisual: js.UndefOr[ScatterPlotVisual]
    var TableVisual: js.UndefOr[TableVisual]
    var TreeMapVisual: js.UndefOr[TreeMapVisual]
    var WaterfallVisual: js.UndefOr[WaterfallVisual]
    var WordCloudVisual: js.UndefOr[WordCloudVisual]
  }

  object Visual {
    @inline
    def apply(
        BarChartVisual: js.UndefOr[BarChartVisual] = js.undefined,
        BoxPlotVisual: js.UndefOr[BoxPlotVisual] = js.undefined,
        ComboChartVisual: js.UndefOr[ComboChartVisual] = js.undefined,
        CustomContentVisual: js.UndefOr[CustomContentVisual] = js.undefined,
        EmptyVisual: js.UndefOr[EmptyVisual] = js.undefined,
        FilledMapVisual: js.UndefOr[FilledMapVisual] = js.undefined,
        FunnelChartVisual: js.UndefOr[FunnelChartVisual] = js.undefined,
        GaugeChartVisual: js.UndefOr[GaugeChartVisual] = js.undefined,
        GeospatialMapVisual: js.UndefOr[GeospatialMapVisual] = js.undefined,
        HeatMapVisual: js.UndefOr[HeatMapVisual] = js.undefined,
        HistogramVisual: js.UndefOr[HistogramVisual] = js.undefined,
        InsightVisual: js.UndefOr[InsightVisual] = js.undefined,
        KPIVisual: js.UndefOr[KPIVisual] = js.undefined,
        LineChartVisual: js.UndefOr[LineChartVisual] = js.undefined,
        PieChartVisual: js.UndefOr[PieChartVisual] = js.undefined,
        PivotTableVisual: js.UndefOr[PivotTableVisual] = js.undefined,
        SankeyDiagramVisual: js.UndefOr[SankeyDiagramVisual] = js.undefined,
        ScatterPlotVisual: js.UndefOr[ScatterPlotVisual] = js.undefined,
        TableVisual: js.UndefOr[TableVisual] = js.undefined,
        TreeMapVisual: js.UndefOr[TreeMapVisual] = js.undefined,
        WaterfallVisual: js.UndefOr[WaterfallVisual] = js.undefined,
        WordCloudVisual: js.UndefOr[WordCloudVisual] = js.undefined
    ): Visual = {
      val __obj = js.Dynamic.literal()
      BarChartVisual.foreach(__v => __obj.updateDynamic("BarChartVisual")(__v.asInstanceOf[js.Any]))
      BoxPlotVisual.foreach(__v => __obj.updateDynamic("BoxPlotVisual")(__v.asInstanceOf[js.Any]))
      ComboChartVisual.foreach(__v => __obj.updateDynamic("ComboChartVisual")(__v.asInstanceOf[js.Any]))
      CustomContentVisual.foreach(__v => __obj.updateDynamic("CustomContentVisual")(__v.asInstanceOf[js.Any]))
      EmptyVisual.foreach(__v => __obj.updateDynamic("EmptyVisual")(__v.asInstanceOf[js.Any]))
      FilledMapVisual.foreach(__v => __obj.updateDynamic("FilledMapVisual")(__v.asInstanceOf[js.Any]))
      FunnelChartVisual.foreach(__v => __obj.updateDynamic("FunnelChartVisual")(__v.asInstanceOf[js.Any]))
      GaugeChartVisual.foreach(__v => __obj.updateDynamic("GaugeChartVisual")(__v.asInstanceOf[js.Any]))
      GeospatialMapVisual.foreach(__v => __obj.updateDynamic("GeospatialMapVisual")(__v.asInstanceOf[js.Any]))
      HeatMapVisual.foreach(__v => __obj.updateDynamic("HeatMapVisual")(__v.asInstanceOf[js.Any]))
      HistogramVisual.foreach(__v => __obj.updateDynamic("HistogramVisual")(__v.asInstanceOf[js.Any]))
      InsightVisual.foreach(__v => __obj.updateDynamic("InsightVisual")(__v.asInstanceOf[js.Any]))
      KPIVisual.foreach(__v => __obj.updateDynamic("KPIVisual")(__v.asInstanceOf[js.Any]))
      LineChartVisual.foreach(__v => __obj.updateDynamic("LineChartVisual")(__v.asInstanceOf[js.Any]))
      PieChartVisual.foreach(__v => __obj.updateDynamic("PieChartVisual")(__v.asInstanceOf[js.Any]))
      PivotTableVisual.foreach(__v => __obj.updateDynamic("PivotTableVisual")(__v.asInstanceOf[js.Any]))
      SankeyDiagramVisual.foreach(__v => __obj.updateDynamic("SankeyDiagramVisual")(__v.asInstanceOf[js.Any]))
      ScatterPlotVisual.foreach(__v => __obj.updateDynamic("ScatterPlotVisual")(__v.asInstanceOf[js.Any]))
      TableVisual.foreach(__v => __obj.updateDynamic("TableVisual")(__v.asInstanceOf[js.Any]))
      TreeMapVisual.foreach(__v => __obj.updateDynamic("TreeMapVisual")(__v.asInstanceOf[js.Any]))
      WaterfallVisual.foreach(__v => __obj.updateDynamic("WaterfallVisual")(__v.asInstanceOf[js.Any]))
      WordCloudVisual.foreach(__v => __obj.updateDynamic("WordCloudVisual")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Visual]
    }
  }

  /** A custom action defined on a visual.
    */
  @js.native
  trait VisualCustomAction extends js.Object {
    var ActionOperations: VisualCustomActionOperationList
    var CustomActionId: ShortRestrictiveResourceId
    var Name: VisualCustomActionName
    var Trigger: VisualCustomActionTrigger
    var Status: js.UndefOr[WidgetStatus]
  }

  object VisualCustomAction {
    @inline
    def apply(
        ActionOperations: VisualCustomActionOperationList,
        CustomActionId: ShortRestrictiveResourceId,
        Name: VisualCustomActionName,
        Trigger: VisualCustomActionTrigger,
        Status: js.UndefOr[WidgetStatus] = js.undefined
    ): VisualCustomAction = {
      val __obj = js.Dynamic.literal(
        "ActionOperations" -> ActionOperations.asInstanceOf[js.Any],
        "CustomActionId" -> CustomActionId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Trigger" -> Trigger.asInstanceOf[js.Any]
      )

      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VisualCustomAction]
    }
  }

  /** The operation that is defined by the custom action. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait VisualCustomActionOperation extends js.Object {
    var FilterOperation: js.UndefOr[CustomActionFilterOperation]
    var NavigationOperation: js.UndefOr[CustomActionNavigationOperation]
    var SetParametersOperation: js.UndefOr[CustomActionSetParametersOperation]
    var URLOperation: js.UndefOr[CustomActionURLOperation]
  }

  object VisualCustomActionOperation {
    @inline
    def apply(
        FilterOperation: js.UndefOr[CustomActionFilterOperation] = js.undefined,
        NavigationOperation: js.UndefOr[CustomActionNavigationOperation] = js.undefined,
        SetParametersOperation: js.UndefOr[CustomActionSetParametersOperation] = js.undefined,
        URLOperation: js.UndefOr[CustomActionURLOperation] = js.undefined
    ): VisualCustomActionOperation = {
      val __obj = js.Dynamic.literal()
      FilterOperation.foreach(__v => __obj.updateDynamic("FilterOperation")(__v.asInstanceOf[js.Any]))
      NavigationOperation.foreach(__v => __obj.updateDynamic("NavigationOperation")(__v.asInstanceOf[js.Any]))
      SetParametersOperation.foreach(__v => __obj.updateDynamic("SetParametersOperation")(__v.asInstanceOf[js.Any]))
      URLOperation.foreach(__v => __obj.updateDynamic("URLOperation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VisualCustomActionOperation]
    }
  }

  /** The visual display options for the visual palette.
    */
  @js.native
  trait VisualPalette extends js.Object {
    var ChartColor: js.UndefOr[HexColor]
    var ColorMap: js.UndefOr[DataPathColorList]
  }

  object VisualPalette {
    @inline
    def apply(
        ChartColor: js.UndefOr[HexColor] = js.undefined,
        ColorMap: js.UndefOr[DataPathColorList] = js.undefined
    ): VisualPalette = {
      val __obj = js.Dynamic.literal()
      ChartColor.foreach(__v => __obj.updateDynamic("ChartColor")(__v.asInstanceOf[js.Any]))
      ColorMap.foreach(__v => __obj.updateDynamic("ColorMap")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VisualPalette]
    }
  }

  /** The subtitle label options for a visual.
    */
  @js.native
  trait VisualSubtitleLabelOptions extends js.Object {
    var FormatText: js.UndefOr[LongFormatText]
    var Visibility: js.UndefOr[Visibility]
  }

  object VisualSubtitleLabelOptions {
    @inline
    def apply(
        FormatText: js.UndefOr[LongFormatText] = js.undefined,
        Visibility: js.UndefOr[Visibility] = js.undefined
    ): VisualSubtitleLabelOptions = {
      val __obj = js.Dynamic.literal()
      FormatText.foreach(__v => __obj.updateDynamic("FormatText")(__v.asInstanceOf[js.Any]))
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VisualSubtitleLabelOptions]
    }
  }

  /** The title label options for a visual.
    */
  @js.native
  trait VisualTitleLabelOptions extends js.Object {
    var FormatText: js.UndefOr[ShortFormatText]
    var Visibility: js.UndefOr[Visibility]
  }

  object VisualTitleLabelOptions {
    @inline
    def apply(
        FormatText: js.UndefOr[ShortFormatText] = js.undefined,
        Visibility: js.UndefOr[Visibility] = js.undefined
    ): VisualTitleLabelOptions = {
      val __obj = js.Dynamic.literal()
      FormatText.foreach(__v => __obj.updateDynamic("FormatText")(__v.asInstanceOf[js.Any]))
      Visibility.foreach(__v => __obj.updateDynamic("Visibility")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VisualTitleLabelOptions]
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

  /** The field well configuration of a waterfall visual.
    */
  @js.native
  trait WaterfallChartAggregatedFieldWells extends js.Object {
    var Breakdowns: js.UndefOr[DimensionFieldList]
    var Categories: js.UndefOr[DimensionFieldList]
    var Values: js.UndefOr[MeasureFieldList]
  }

  object WaterfallChartAggregatedFieldWells {
    @inline
    def apply(
        Breakdowns: js.UndefOr[DimensionFieldList] = js.undefined,
        Categories: js.UndefOr[DimensionFieldList] = js.undefined,
        Values: js.UndefOr[MeasureFieldList] = js.undefined
    ): WaterfallChartAggregatedFieldWells = {
      val __obj = js.Dynamic.literal()
      Breakdowns.foreach(__v => __obj.updateDynamic("Breakdowns")(__v.asInstanceOf[js.Any]))
      Categories.foreach(__v => __obj.updateDynamic("Categories")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WaterfallChartAggregatedFieldWells]
    }
  }

  /** The configuration for a waterfall visual.
    */
  @js.native
  trait WaterfallChartConfiguration extends js.Object {
    var CategoryAxisDisplayOptions: js.UndefOr[AxisDisplayOptions]
    var CategoryAxisLabelOptions: js.UndefOr[ChartAxisLabelOptions]
    var DataLabels: js.UndefOr[DataLabelOptions]
    var FieldWells: js.UndefOr[WaterfallChartFieldWells]
    var Legend: js.UndefOr[LegendOptions]
    var PrimaryYAxisDisplayOptions: js.UndefOr[AxisDisplayOptions]
    var PrimaryYAxisLabelOptions: js.UndefOr[ChartAxisLabelOptions]
    var SortConfiguration: js.UndefOr[WaterfallChartSortConfiguration]
    var VisualPalette: js.UndefOr[VisualPalette]
    var WaterfallChartOptions: js.UndefOr[WaterfallChartOptions]
  }

  object WaterfallChartConfiguration {
    @inline
    def apply(
        CategoryAxisDisplayOptions: js.UndefOr[AxisDisplayOptions] = js.undefined,
        CategoryAxisLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined,
        DataLabels: js.UndefOr[DataLabelOptions] = js.undefined,
        FieldWells: js.UndefOr[WaterfallChartFieldWells] = js.undefined,
        Legend: js.UndefOr[LegendOptions] = js.undefined,
        PrimaryYAxisDisplayOptions: js.UndefOr[AxisDisplayOptions] = js.undefined,
        PrimaryYAxisLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined,
        SortConfiguration: js.UndefOr[WaterfallChartSortConfiguration] = js.undefined,
        VisualPalette: js.UndefOr[VisualPalette] = js.undefined,
        WaterfallChartOptions: js.UndefOr[WaterfallChartOptions] = js.undefined
    ): WaterfallChartConfiguration = {
      val __obj = js.Dynamic.literal()
      CategoryAxisDisplayOptions.foreach(__v => __obj.updateDynamic("CategoryAxisDisplayOptions")(__v.asInstanceOf[js.Any]))
      CategoryAxisLabelOptions.foreach(__v => __obj.updateDynamic("CategoryAxisLabelOptions")(__v.asInstanceOf[js.Any]))
      DataLabels.foreach(__v => __obj.updateDynamic("DataLabels")(__v.asInstanceOf[js.Any]))
      FieldWells.foreach(__v => __obj.updateDynamic("FieldWells")(__v.asInstanceOf[js.Any]))
      Legend.foreach(__v => __obj.updateDynamic("Legend")(__v.asInstanceOf[js.Any]))
      PrimaryYAxisDisplayOptions.foreach(__v => __obj.updateDynamic("PrimaryYAxisDisplayOptions")(__v.asInstanceOf[js.Any]))
      PrimaryYAxisLabelOptions.foreach(__v => __obj.updateDynamic("PrimaryYAxisLabelOptions")(__v.asInstanceOf[js.Any]))
      SortConfiguration.foreach(__v => __obj.updateDynamic("SortConfiguration")(__v.asInstanceOf[js.Any]))
      VisualPalette.foreach(__v => __obj.updateDynamic("VisualPalette")(__v.asInstanceOf[js.Any]))
      WaterfallChartOptions.foreach(__v => __obj.updateDynamic("WaterfallChartOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WaterfallChartConfiguration]
    }
  }

  /** The field well configuration of a waterfall visual.
    */
  @js.native
  trait WaterfallChartFieldWells extends js.Object {
    var WaterfallChartAggregatedFieldWells: js.UndefOr[WaterfallChartAggregatedFieldWells]
  }

  object WaterfallChartFieldWells {
    @inline
    def apply(
        WaterfallChartAggregatedFieldWells: js.UndefOr[WaterfallChartAggregatedFieldWells] = js.undefined
    ): WaterfallChartFieldWells = {
      val __obj = js.Dynamic.literal()
      WaterfallChartAggregatedFieldWells.foreach(__v => __obj.updateDynamic("WaterfallChartAggregatedFieldWells")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WaterfallChartFieldWells]
    }
  }

  /** The options that determine the presentation of a waterfall visual.
    */
  @js.native
  trait WaterfallChartOptions extends js.Object {
    var TotalBarLabel: js.UndefOr[String]
  }

  object WaterfallChartOptions {
    @inline
    def apply(
        TotalBarLabel: js.UndefOr[String] = js.undefined
    ): WaterfallChartOptions = {
      val __obj = js.Dynamic.literal()
      TotalBarLabel.foreach(__v => __obj.updateDynamic("TotalBarLabel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WaterfallChartOptions]
    }
  }

  /** The sort configuration of a waterfall visual.
    */
  @js.native
  trait WaterfallChartSortConfiguration extends js.Object {
    var BreakdownItemsLimit: js.UndefOr[ItemsLimitConfiguration]
    var CategorySort: js.UndefOr[FieldSortOptionsList]
  }

  object WaterfallChartSortConfiguration {
    @inline
    def apply(
        BreakdownItemsLimit: js.UndefOr[ItemsLimitConfiguration] = js.undefined,
        CategorySort: js.UndefOr[FieldSortOptionsList] = js.undefined
    ): WaterfallChartSortConfiguration = {
      val __obj = js.Dynamic.literal()
      BreakdownItemsLimit.foreach(__v => __obj.updateDynamic("BreakdownItemsLimit")(__v.asInstanceOf[js.Any]))
      CategorySort.foreach(__v => __obj.updateDynamic("CategorySort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WaterfallChartSortConfiguration]
    }
  }

  /** A waterfall chart. For more information, see [[https://docs.aws.amazon.com/quicksight/latest/user/waterfall-chart.html|Using waterfall charts]] in the <i>Amazon QuickSight User Guide</i>.
    */
  @js.native
  trait WaterfallVisual extends js.Object {
    var VisualId: ShortRestrictiveResourceId
    var Actions: js.UndefOr[VisualCustomActionList]
    var ChartConfiguration: js.UndefOr[WaterfallChartConfiguration]
    var ColumnHierarchies: js.UndefOr[ColumnHierarchyList]
    var Subtitle: js.UndefOr[VisualSubtitleLabelOptions]
    var Title: js.UndefOr[VisualTitleLabelOptions]
  }

  object WaterfallVisual {
    @inline
    def apply(
        VisualId: ShortRestrictiveResourceId,
        Actions: js.UndefOr[VisualCustomActionList] = js.undefined,
        ChartConfiguration: js.UndefOr[WaterfallChartConfiguration] = js.undefined,
        ColumnHierarchies: js.UndefOr[ColumnHierarchyList] = js.undefined,
        Subtitle: js.UndefOr[VisualSubtitleLabelOptions] = js.undefined,
        Title: js.UndefOr[VisualTitleLabelOptions] = js.undefined
    ): WaterfallVisual = {
      val __obj = js.Dynamic.literal(
        "VisualId" -> VisualId.asInstanceOf[js.Any]
      )

      Actions.foreach(__v => __obj.updateDynamic("Actions")(__v.asInstanceOf[js.Any]))
      ChartConfiguration.foreach(__v => __obj.updateDynamic("ChartConfiguration")(__v.asInstanceOf[js.Any]))
      ColumnHierarchies.foreach(__v => __obj.updateDynamic("ColumnHierarchies")(__v.asInstanceOf[js.Any]))
      Subtitle.foreach(__v => __obj.updateDynamic("Subtitle")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WaterfallVisual]
    }
  }

  /** Provides the forecast to meet the target for a particular date.
    */
  @js.native
  trait WhatIfPointScenario extends js.Object {
    var Date: Timestamp
    var Value: Double
  }

  object WhatIfPointScenario {
    @inline
    def apply(
        Date: Timestamp,
        Value: Double
    ): WhatIfPointScenario = {
      val __obj = js.Dynamic.literal(
        "Date" -> Date.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[WhatIfPointScenario]
    }
  }

  /** Provides the forecast to meet the target for a particular date range.
    */
  @js.native
  trait WhatIfRangeScenario extends js.Object {
    var EndDate: Timestamp
    var StartDate: Timestamp
    var Value: Double
  }

  object WhatIfRangeScenario {
    @inline
    def apply(
        EndDate: Timestamp,
        StartDate: Timestamp,
        Value: Double
    ): WhatIfRangeScenario = {
      val __obj = js.Dynamic.literal(
        "EndDate" -> EndDate.asInstanceOf[js.Any],
        "StartDate" -> StartDate.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[WhatIfRangeScenario]
    }
  }

  /** The aggregated field wells of a word cloud.
    */
  @js.native
  trait WordCloudAggregatedFieldWells extends js.Object {
    var GroupBy: js.UndefOr[WordCloudDimensionFieldList]
    var Size: js.UndefOr[WordCloudMeasureFieldList]
  }

  object WordCloudAggregatedFieldWells {
    @inline
    def apply(
        GroupBy: js.UndefOr[WordCloudDimensionFieldList] = js.undefined,
        Size: js.UndefOr[WordCloudMeasureFieldList] = js.undefined
    ): WordCloudAggregatedFieldWells = {
      val __obj = js.Dynamic.literal()
      GroupBy.foreach(__v => __obj.updateDynamic("GroupBy")(__v.asInstanceOf[js.Any]))
      Size.foreach(__v => __obj.updateDynamic("Size")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WordCloudAggregatedFieldWells]
    }
  }

  /** The configuration of a word cloud visual.
    */
  @js.native
  trait WordCloudChartConfiguration extends js.Object {
    var CategoryLabelOptions: js.UndefOr[ChartAxisLabelOptions]
    var FieldWells: js.UndefOr[WordCloudFieldWells]
    var SortConfiguration: js.UndefOr[WordCloudSortConfiguration]
    var WordCloudOptions: js.UndefOr[WordCloudOptions]
  }

  object WordCloudChartConfiguration {
    @inline
    def apply(
        CategoryLabelOptions: js.UndefOr[ChartAxisLabelOptions] = js.undefined,
        FieldWells: js.UndefOr[WordCloudFieldWells] = js.undefined,
        SortConfiguration: js.UndefOr[WordCloudSortConfiguration] = js.undefined,
        WordCloudOptions: js.UndefOr[WordCloudOptions] = js.undefined
    ): WordCloudChartConfiguration = {
      val __obj = js.Dynamic.literal()
      CategoryLabelOptions.foreach(__v => __obj.updateDynamic("CategoryLabelOptions")(__v.asInstanceOf[js.Any]))
      FieldWells.foreach(__v => __obj.updateDynamic("FieldWells")(__v.asInstanceOf[js.Any]))
      SortConfiguration.foreach(__v => __obj.updateDynamic("SortConfiguration")(__v.asInstanceOf[js.Any]))
      WordCloudOptions.foreach(__v => __obj.updateDynamic("WordCloudOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WordCloudChartConfiguration]
    }
  }

  /** The field wells of a word cloud visual. This is a union type structure. For this structure to be valid, only one of the attributes can be defined.
    */
  @js.native
  trait WordCloudFieldWells extends js.Object {
    var WordCloudAggregatedFieldWells: js.UndefOr[WordCloudAggregatedFieldWells]
  }

  object WordCloudFieldWells {
    @inline
    def apply(
        WordCloudAggregatedFieldWells: js.UndefOr[WordCloudAggregatedFieldWells] = js.undefined
    ): WordCloudFieldWells = {
      val __obj = js.Dynamic.literal()
      WordCloudAggregatedFieldWells.foreach(__v => __obj.updateDynamic("WordCloudAggregatedFieldWells")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WordCloudFieldWells]
    }
  }

  /** The word cloud options for a word cloud visual.
    */
  @js.native
  trait WordCloudOptions extends js.Object {
    var CloudLayout: js.UndefOr[WordCloudCloudLayout]
    var MaximumStringLength: js.UndefOr[WordCloudMaximumStringLength]
    var WordCasing: js.UndefOr[WordCloudWordCasing]
    var WordOrientation: js.UndefOr[WordCloudWordOrientation]
    var WordPadding: js.UndefOr[WordCloudWordPadding]
    var WordScaling: js.UndefOr[WordCloudWordScaling]
  }

  object WordCloudOptions {
    @inline
    def apply(
        CloudLayout: js.UndefOr[WordCloudCloudLayout] = js.undefined,
        MaximumStringLength: js.UndefOr[WordCloudMaximumStringLength] = js.undefined,
        WordCasing: js.UndefOr[WordCloudWordCasing] = js.undefined,
        WordOrientation: js.UndefOr[WordCloudWordOrientation] = js.undefined,
        WordPadding: js.UndefOr[WordCloudWordPadding] = js.undefined,
        WordScaling: js.UndefOr[WordCloudWordScaling] = js.undefined
    ): WordCloudOptions = {
      val __obj = js.Dynamic.literal()
      CloudLayout.foreach(__v => __obj.updateDynamic("CloudLayout")(__v.asInstanceOf[js.Any]))
      MaximumStringLength.foreach(__v => __obj.updateDynamic("MaximumStringLength")(__v.asInstanceOf[js.Any]))
      WordCasing.foreach(__v => __obj.updateDynamic("WordCasing")(__v.asInstanceOf[js.Any]))
      WordOrientation.foreach(__v => __obj.updateDynamic("WordOrientation")(__v.asInstanceOf[js.Any]))
      WordPadding.foreach(__v => __obj.updateDynamic("WordPadding")(__v.asInstanceOf[js.Any]))
      WordScaling.foreach(__v => __obj.updateDynamic("WordScaling")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WordCloudOptions]
    }
  }

  /** The sort configuration of a word cloud visual.
    */
  @js.native
  trait WordCloudSortConfiguration extends js.Object {
    var CategoryItemsLimit: js.UndefOr[ItemsLimitConfiguration]
    var CategorySort: js.UndefOr[FieldSortOptionsList]
  }

  object WordCloudSortConfiguration {
    @inline
    def apply(
        CategoryItemsLimit: js.UndefOr[ItemsLimitConfiguration] = js.undefined,
        CategorySort: js.UndefOr[FieldSortOptionsList] = js.undefined
    ): WordCloudSortConfiguration = {
      val __obj = js.Dynamic.literal()
      CategoryItemsLimit.foreach(__v => __obj.updateDynamic("CategoryItemsLimit")(__v.asInstanceOf[js.Any]))
      CategorySort.foreach(__v => __obj.updateDynamic("CategorySort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WordCloudSortConfiguration]
    }
  }

  /** A word cloud. For more information, see [[https://docs.aws.amazon.com/quicksight/latest/user/word-cloud.html|Using word clouds]] in the <i>Amazon QuickSight User Guide</i>.
    */
  @js.native
  trait WordCloudVisual extends js.Object {
    var VisualId: ShortRestrictiveResourceId
    var Actions: js.UndefOr[VisualCustomActionList]
    var ChartConfiguration: js.UndefOr[WordCloudChartConfiguration]
    var ColumnHierarchies: js.UndefOr[ColumnHierarchyList]
    var Subtitle: js.UndefOr[VisualSubtitleLabelOptions]
    var Title: js.UndefOr[VisualTitleLabelOptions]
  }

  object WordCloudVisual {
    @inline
    def apply(
        VisualId: ShortRestrictiveResourceId,
        Actions: js.UndefOr[VisualCustomActionList] = js.undefined,
        ChartConfiguration: js.UndefOr[WordCloudChartConfiguration] = js.undefined,
        ColumnHierarchies: js.UndefOr[ColumnHierarchyList] = js.undefined,
        Subtitle: js.UndefOr[VisualSubtitleLabelOptions] = js.undefined,
        Title: js.UndefOr[VisualTitleLabelOptions] = js.undefined
    ): WordCloudVisual = {
      val __obj = js.Dynamic.literal(
        "VisualId" -> VisualId.asInstanceOf[js.Any]
      )

      Actions.foreach(__v => __obj.updateDynamic("Actions")(__v.asInstanceOf[js.Any]))
      ChartConfiguration.foreach(__v => __obj.updateDynamic("ChartConfiguration")(__v.asInstanceOf[js.Any]))
      ColumnHierarchies.foreach(__v => __obj.updateDynamic("ColumnHierarchies")(__v.asInstanceOf[js.Any]))
      Subtitle.foreach(__v => __obj.updateDynamic("Subtitle")(__v.asInstanceOf[js.Any]))
      Title.foreach(__v => __obj.updateDynamic("Title")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WordCloudVisual]
    }
  }
}
