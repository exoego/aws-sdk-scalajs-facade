package facade.amazonaws.services.quicksight

import scalajs.js

@js.native
sealed trait AnalysisErrorType extends js.Any
object AnalysisErrorType {
  val ACCESS_DENIED = "ACCESS_DENIED".asInstanceOf[AnalysisErrorType]
  val SOURCE_NOT_FOUND = "SOURCE_NOT_FOUND".asInstanceOf[AnalysisErrorType]
  val DATA_SET_NOT_FOUND = "DATA_SET_NOT_FOUND".asInstanceOf[AnalysisErrorType]
  val INTERNAL_FAILURE = "INTERNAL_FAILURE".asInstanceOf[AnalysisErrorType]
  val PARAMETER_VALUE_INCOMPATIBLE = "PARAMETER_VALUE_INCOMPATIBLE".asInstanceOf[AnalysisErrorType]
  val PARAMETER_TYPE_INVALID = "PARAMETER_TYPE_INVALID".asInstanceOf[AnalysisErrorType]
  val PARAMETER_NOT_FOUND = "PARAMETER_NOT_FOUND".asInstanceOf[AnalysisErrorType]
  val COLUMN_TYPE_MISMATCH = "COLUMN_TYPE_MISMATCH".asInstanceOf[AnalysisErrorType]
  val COLUMN_GEOGRAPHIC_ROLE_MISMATCH = "COLUMN_GEOGRAPHIC_ROLE_MISMATCH".asInstanceOf[AnalysisErrorType]
  val COLUMN_REPLACEMENT_MISSING = "COLUMN_REPLACEMENT_MISSING".asInstanceOf[AnalysisErrorType]

  @inline def values: js.Array[AnalysisErrorType] = js.Array(
    ACCESS_DENIED,
    SOURCE_NOT_FOUND,
    DATA_SET_NOT_FOUND,
    INTERNAL_FAILURE,
    PARAMETER_VALUE_INCOMPATIBLE,
    PARAMETER_TYPE_INVALID,
    PARAMETER_NOT_FOUND,
    COLUMN_TYPE_MISMATCH,
    COLUMN_GEOGRAPHIC_ROLE_MISMATCH,
    COLUMN_REPLACEMENT_MISSING
  )
}

@js.native
sealed trait AnalysisFilterAttribute extends js.Any
object AnalysisFilterAttribute {
  val QUICKSIGHT_USER = "QUICKSIGHT_USER".asInstanceOf[AnalysisFilterAttribute]
  val QUICKSIGHT_VIEWER_OR_OWNER = "QUICKSIGHT_VIEWER_OR_OWNER".asInstanceOf[AnalysisFilterAttribute]
  val DIRECT_QUICKSIGHT_VIEWER_OR_OWNER = "DIRECT_QUICKSIGHT_VIEWER_OR_OWNER".asInstanceOf[AnalysisFilterAttribute]
  val QUICKSIGHT_OWNER = "QUICKSIGHT_OWNER".asInstanceOf[AnalysisFilterAttribute]
  val DIRECT_QUICKSIGHT_OWNER = "DIRECT_QUICKSIGHT_OWNER".asInstanceOf[AnalysisFilterAttribute]
  val DIRECT_QUICKSIGHT_SOLE_OWNER = "DIRECT_QUICKSIGHT_SOLE_OWNER".asInstanceOf[AnalysisFilterAttribute]
  val ANALYSIS_NAME = "ANALYSIS_NAME".asInstanceOf[AnalysisFilterAttribute]

  @inline def values: js.Array[AnalysisFilterAttribute] = js.Array(
    QUICKSIGHT_USER,
    QUICKSIGHT_VIEWER_OR_OWNER,
    DIRECT_QUICKSIGHT_VIEWER_OR_OWNER,
    QUICKSIGHT_OWNER,
    DIRECT_QUICKSIGHT_OWNER,
    DIRECT_QUICKSIGHT_SOLE_OWNER,
    ANALYSIS_NAME
  )
}

@js.native
sealed trait AnchorOption extends js.Any
object AnchorOption {
  val NOW = "NOW".asInstanceOf[AnchorOption]

  @inline def values: js.Array[AnchorOption] = js.Array(NOW)
}

@js.native
sealed trait ArcThickness extends js.Any
object ArcThickness {
  val SMALL = "SMALL".asInstanceOf[ArcThickness]
  val MEDIUM = "MEDIUM".asInstanceOf[ArcThickness]
  val LARGE = "LARGE".asInstanceOf[ArcThickness]
  val WHOLE = "WHOLE".asInstanceOf[ArcThickness]

  @inline def values: js.Array[ArcThickness] = js.Array(SMALL, MEDIUM, LARGE, WHOLE)
}

@js.native
sealed trait ArcThicknessOptions extends js.Any
object ArcThicknessOptions {
  val SMALL = "SMALL".asInstanceOf[ArcThicknessOptions]
  val MEDIUM = "MEDIUM".asInstanceOf[ArcThicknessOptions]
  val LARGE = "LARGE".asInstanceOf[ArcThicknessOptions]

  @inline def values: js.Array[ArcThicknessOptions] = js.Array(SMALL, MEDIUM, LARGE)
}

@js.native
sealed trait AssignmentStatus extends js.Any
object AssignmentStatus {
  val ENABLED = "ENABLED".asInstanceOf[AssignmentStatus]
  val DRAFT = "DRAFT".asInstanceOf[AssignmentStatus]
  val DISABLED = "DISABLED".asInstanceOf[AssignmentStatus]

  @inline def values: js.Array[AssignmentStatus] = js.Array(ENABLED, DRAFT, DISABLED)
}

@js.native
sealed trait AuthenticationMethodOption extends js.Any
object AuthenticationMethodOption {
  val IAM_AND_QUICKSIGHT = "IAM_AND_QUICKSIGHT".asInstanceOf[AuthenticationMethodOption]
  val IAM_ONLY = "IAM_ONLY".asInstanceOf[AuthenticationMethodOption]
  val ACTIVE_DIRECTORY = "ACTIVE_DIRECTORY".asInstanceOf[AuthenticationMethodOption]

  @inline def values: js.Array[AuthenticationMethodOption] = js.Array(IAM_AND_QUICKSIGHT, IAM_ONLY, ACTIVE_DIRECTORY)
}

@js.native
sealed trait AxisBinding extends js.Any
object AxisBinding {
  val PRIMARY_YAXIS = "PRIMARY_YAXIS".asInstanceOf[AxisBinding]
  val SECONDARY_YAXIS = "SECONDARY_YAXIS".asInstanceOf[AxisBinding]

  @inline def values: js.Array[AxisBinding] = js.Array(PRIMARY_YAXIS, SECONDARY_YAXIS)
}

@js.native
sealed trait BarChartOrientation extends js.Any
object BarChartOrientation {
  val HORIZONTAL = "HORIZONTAL".asInstanceOf[BarChartOrientation]
  val VERTICAL = "VERTICAL".asInstanceOf[BarChartOrientation]

  @inline def values: js.Array[BarChartOrientation] = js.Array(HORIZONTAL, VERTICAL)
}

@js.native
sealed trait BarsArrangement extends js.Any
object BarsArrangement {
  val CLUSTERED = "CLUSTERED".asInstanceOf[BarsArrangement]
  val STACKED = "STACKED".asInstanceOf[BarsArrangement]
  val STACKED_PERCENT = "STACKED_PERCENT".asInstanceOf[BarsArrangement]

  @inline def values: js.Array[BarsArrangement] = js.Array(CLUSTERED, STACKED, STACKED_PERCENT)
}

@js.native
sealed trait BaseMapStyleType extends js.Any
object BaseMapStyleType {
  val LIGHT_GRAY = "LIGHT_GRAY".asInstanceOf[BaseMapStyleType]
  val DARK_GRAY = "DARK_GRAY".asInstanceOf[BaseMapStyleType]
  val STREET = "STREET".asInstanceOf[BaseMapStyleType]
  val IMAGERY = "IMAGERY".asInstanceOf[BaseMapStyleType]

  @inline def values: js.Array[BaseMapStyleType] = js.Array(LIGHT_GRAY, DARK_GRAY, STREET, IMAGERY)
}

@js.native
sealed trait BoxPlotFillStyle extends js.Any
object BoxPlotFillStyle {
  val SOLID = "SOLID".asInstanceOf[BoxPlotFillStyle]
  val TRANSPARENT = "TRANSPARENT".asInstanceOf[BoxPlotFillStyle]

  @inline def values: js.Array[BoxPlotFillStyle] = js.Array(SOLID, TRANSPARENT)
}

@js.native
sealed trait CategoricalAggregationFunction extends js.Any
object CategoricalAggregationFunction {
  val COUNT = "COUNT".asInstanceOf[CategoricalAggregationFunction]
  val DISTINCT_COUNT = "DISTINCT_COUNT".asInstanceOf[CategoricalAggregationFunction]

  @inline def values: js.Array[CategoricalAggregationFunction] = js.Array(COUNT, DISTINCT_COUNT)
}

@js.native
sealed trait CategoryFilterMatchOperator extends js.Any
object CategoryFilterMatchOperator {
  val EQUALS = "EQUALS".asInstanceOf[CategoryFilterMatchOperator]
  val DOES_NOT_EQUAL = "DOES_NOT_EQUAL".asInstanceOf[CategoryFilterMatchOperator]
  val CONTAINS = "CONTAINS".asInstanceOf[CategoryFilterMatchOperator]
  val DOES_NOT_CONTAIN = "DOES_NOT_CONTAIN".asInstanceOf[CategoryFilterMatchOperator]
  val STARTS_WITH = "STARTS_WITH".asInstanceOf[CategoryFilterMatchOperator]
  val ENDS_WITH = "ENDS_WITH".asInstanceOf[CategoryFilterMatchOperator]

  @inline def values: js.Array[CategoryFilterMatchOperator] = js.Array(EQUALS, DOES_NOT_EQUAL, CONTAINS, DOES_NOT_CONTAIN, STARTS_WITH, ENDS_WITH)
}

@js.native
sealed trait CategoryFilterSelectAllOptions extends js.Any
object CategoryFilterSelectAllOptions {
  val FILTER_ALL_VALUES = "FILTER_ALL_VALUES".asInstanceOf[CategoryFilterSelectAllOptions]

  @inline def values: js.Array[CategoryFilterSelectAllOptions] = js.Array(FILTER_ALL_VALUES)
}

@js.native
sealed trait ColorFillType extends js.Any
object ColorFillType {
  val DISCRETE = "DISCRETE".asInstanceOf[ColorFillType]
  val GRADIENT = "GRADIENT".asInstanceOf[ColorFillType]

  @inline def values: js.Array[ColorFillType] = js.Array(DISCRETE, GRADIENT)
}

@js.native
sealed trait ColumnDataType extends js.Any
object ColumnDataType {
  val STRING = "STRING".asInstanceOf[ColumnDataType]
  val INTEGER = "INTEGER".asInstanceOf[ColumnDataType]
  val DECIMAL = "DECIMAL".asInstanceOf[ColumnDataType]
  val DATETIME = "DATETIME".asInstanceOf[ColumnDataType]

  @inline def values: js.Array[ColumnDataType] = js.Array(STRING, INTEGER, DECIMAL, DATETIME)
}

@js.native
sealed trait ColumnRole extends js.Any
object ColumnRole {
  val DIMENSION = "DIMENSION".asInstanceOf[ColumnRole]
  val MEASURE = "MEASURE".asInstanceOf[ColumnRole]

  @inline def values: js.Array[ColumnRole] = js.Array(DIMENSION, MEASURE)
}

@js.native
sealed trait ColumnTagName extends js.Any
object ColumnTagName {
  val COLUMN_GEOGRAPHIC_ROLE = "COLUMN_GEOGRAPHIC_ROLE".asInstanceOf[ColumnTagName]
  val COLUMN_DESCRIPTION = "COLUMN_DESCRIPTION".asInstanceOf[ColumnTagName]

  @inline def values: js.Array[ColumnTagName] = js.Array(COLUMN_GEOGRAPHIC_ROLE, COLUMN_DESCRIPTION)
}

@js.native
sealed trait ComparisonMethod extends js.Any
object ComparisonMethod {
  val DIFFERENCE = "DIFFERENCE".asInstanceOf[ComparisonMethod]
  val PERCENT_DIFFERENCE = "PERCENT_DIFFERENCE".asInstanceOf[ComparisonMethod]
  val PERCENT = "PERCENT".asInstanceOf[ComparisonMethod]

  @inline def values: js.Array[ComparisonMethod] = js.Array(DIFFERENCE, PERCENT_DIFFERENCE, PERCENT)
}

@js.native
sealed trait ConditionalFormattingIconDisplayOption extends js.Any
object ConditionalFormattingIconDisplayOption {
  val ICON_ONLY = "ICON_ONLY".asInstanceOf[ConditionalFormattingIconDisplayOption]

  @inline def values: js.Array[ConditionalFormattingIconDisplayOption] = js.Array(ICON_ONLY)
}

@js.native
sealed trait ConditionalFormattingIconSetType extends js.Any
object ConditionalFormattingIconSetType {
  val PLUS_MINUS = "PLUS_MINUS".asInstanceOf[ConditionalFormattingIconSetType]
  val CHECK_X = "CHECK_X".asInstanceOf[ConditionalFormattingIconSetType]
  val THREE_COLOR_ARROW = "THREE_COLOR_ARROW".asInstanceOf[ConditionalFormattingIconSetType]
  val THREE_GRAY_ARROW = "THREE_GRAY_ARROW".asInstanceOf[ConditionalFormattingIconSetType]
  val CARET_UP_MINUS_DOWN = "CARET_UP_MINUS_DOWN".asInstanceOf[ConditionalFormattingIconSetType]
  val THREE_SHAPE = "THREE_SHAPE".asInstanceOf[ConditionalFormattingIconSetType]
  val THREE_CIRCLE = "THREE_CIRCLE".asInstanceOf[ConditionalFormattingIconSetType]
  val FLAGS = "FLAGS".asInstanceOf[ConditionalFormattingIconSetType]
  val BARS = "BARS".asInstanceOf[ConditionalFormattingIconSetType]
  val FOUR_COLOR_ARROW = "FOUR_COLOR_ARROW".asInstanceOf[ConditionalFormattingIconSetType]
  val FOUR_GRAY_ARROW = "FOUR_GRAY_ARROW".asInstanceOf[ConditionalFormattingIconSetType]

  @inline def values: js.Array[ConditionalFormattingIconSetType] = js.Array(PLUS_MINUS, CHECK_X, THREE_COLOR_ARROW, THREE_GRAY_ARROW, CARET_UP_MINUS_DOWN, THREE_SHAPE, THREE_CIRCLE, FLAGS, BARS, FOUR_COLOR_ARROW, FOUR_GRAY_ARROW)
}

@js.native
sealed trait CrossDatasetTypes extends js.Any
object CrossDatasetTypes {
  val ALL_DATASETS = "ALL_DATASETS".asInstanceOf[CrossDatasetTypes]
  val SINGLE_DATASET = "SINGLE_DATASET".asInstanceOf[CrossDatasetTypes]

  @inline def values: js.Array[CrossDatasetTypes] = js.Array(ALL_DATASETS, SINGLE_DATASET)
}

@js.native
sealed trait CustomContentImageScalingConfiguration extends js.Any
object CustomContentImageScalingConfiguration {
  val FIT_TO_HEIGHT = "FIT_TO_HEIGHT".asInstanceOf[CustomContentImageScalingConfiguration]
  val FIT_TO_WIDTH = "FIT_TO_WIDTH".asInstanceOf[CustomContentImageScalingConfiguration]
  val DO_NOT_SCALE = "DO_NOT_SCALE".asInstanceOf[CustomContentImageScalingConfiguration]
  val SCALE_TO_VISUAL = "SCALE_TO_VISUAL".asInstanceOf[CustomContentImageScalingConfiguration]

  @inline def values: js.Array[CustomContentImageScalingConfiguration] = js.Array(FIT_TO_HEIGHT, FIT_TO_WIDTH, DO_NOT_SCALE, SCALE_TO_VISUAL)
}

@js.native
sealed trait CustomContentType extends js.Any
object CustomContentType {
  val IMAGE = "IMAGE".asInstanceOf[CustomContentType]
  val OTHER_EMBEDDED_CONTENT = "OTHER_EMBEDDED_CONTENT".asInstanceOf[CustomContentType]

  @inline def values: js.Array[CustomContentType] = js.Array(IMAGE, OTHER_EMBEDDED_CONTENT)
}

@js.native
sealed trait DashboardBehavior extends js.Any
object DashboardBehavior {
  val ENABLED = "ENABLED".asInstanceOf[DashboardBehavior]
  val DISABLED = "DISABLED".asInstanceOf[DashboardBehavior]

  @inline def values: js.Array[DashboardBehavior] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait DashboardErrorType extends js.Any
object DashboardErrorType {
  val ACCESS_DENIED = "ACCESS_DENIED".asInstanceOf[DashboardErrorType]
  val SOURCE_NOT_FOUND = "SOURCE_NOT_FOUND".asInstanceOf[DashboardErrorType]
  val DATA_SET_NOT_FOUND = "DATA_SET_NOT_FOUND".asInstanceOf[DashboardErrorType]
  val INTERNAL_FAILURE = "INTERNAL_FAILURE".asInstanceOf[DashboardErrorType]
  val PARAMETER_VALUE_INCOMPATIBLE = "PARAMETER_VALUE_INCOMPATIBLE".asInstanceOf[DashboardErrorType]
  val PARAMETER_TYPE_INVALID = "PARAMETER_TYPE_INVALID".asInstanceOf[DashboardErrorType]
  val PARAMETER_NOT_FOUND = "PARAMETER_NOT_FOUND".asInstanceOf[DashboardErrorType]
  val COLUMN_TYPE_MISMATCH = "COLUMN_TYPE_MISMATCH".asInstanceOf[DashboardErrorType]
  val COLUMN_GEOGRAPHIC_ROLE_MISMATCH = "COLUMN_GEOGRAPHIC_ROLE_MISMATCH".asInstanceOf[DashboardErrorType]
  val COLUMN_REPLACEMENT_MISSING = "COLUMN_REPLACEMENT_MISSING".asInstanceOf[DashboardErrorType]

  @inline def values: js.Array[DashboardErrorType] = js.Array(
    ACCESS_DENIED,
    SOURCE_NOT_FOUND,
    DATA_SET_NOT_FOUND,
    INTERNAL_FAILURE,
    PARAMETER_VALUE_INCOMPATIBLE,
    PARAMETER_TYPE_INVALID,
    PARAMETER_NOT_FOUND,
    COLUMN_TYPE_MISMATCH,
    COLUMN_GEOGRAPHIC_ROLE_MISMATCH,
    COLUMN_REPLACEMENT_MISSING
  )
}

@js.native
sealed trait DashboardFilterAttribute extends js.Any
object DashboardFilterAttribute {
  val QUICKSIGHT_USER = "QUICKSIGHT_USER".asInstanceOf[DashboardFilterAttribute]
  val QUICKSIGHT_VIEWER_OR_OWNER = "QUICKSIGHT_VIEWER_OR_OWNER".asInstanceOf[DashboardFilterAttribute]
  val DIRECT_QUICKSIGHT_VIEWER_OR_OWNER = "DIRECT_QUICKSIGHT_VIEWER_OR_OWNER".asInstanceOf[DashboardFilterAttribute]
  val QUICKSIGHT_OWNER = "QUICKSIGHT_OWNER".asInstanceOf[DashboardFilterAttribute]
  val DIRECT_QUICKSIGHT_OWNER = "DIRECT_QUICKSIGHT_OWNER".asInstanceOf[DashboardFilterAttribute]
  val DIRECT_QUICKSIGHT_SOLE_OWNER = "DIRECT_QUICKSIGHT_SOLE_OWNER".asInstanceOf[DashboardFilterAttribute]
  val DASHBOARD_NAME = "DASHBOARD_NAME".asInstanceOf[DashboardFilterAttribute]

  @inline def values: js.Array[DashboardFilterAttribute] = js.Array(
    QUICKSIGHT_USER,
    QUICKSIGHT_VIEWER_OR_OWNER,
    DIRECT_QUICKSIGHT_VIEWER_OR_OWNER,
    QUICKSIGHT_OWNER,
    DIRECT_QUICKSIGHT_OWNER,
    DIRECT_QUICKSIGHT_SOLE_OWNER,
    DASHBOARD_NAME
  )
}

@js.native
sealed trait DashboardUIState extends js.Any
object DashboardUIState {
  val EXPANDED = "EXPANDED".asInstanceOf[DashboardUIState]
  val COLLAPSED = "COLLAPSED".asInstanceOf[DashboardUIState]

  @inline def values: js.Array[DashboardUIState] = js.Array(EXPANDED, COLLAPSED)
}

@js.native
sealed trait DataLabelContent extends js.Any
object DataLabelContent {
  val VALUE = "VALUE".asInstanceOf[DataLabelContent]
  val PERCENT = "PERCENT".asInstanceOf[DataLabelContent]
  val VALUE_AND_PERCENT = "VALUE_AND_PERCENT".asInstanceOf[DataLabelContent]

  @inline def values: js.Array[DataLabelContent] = js.Array(VALUE, PERCENT, VALUE_AND_PERCENT)
}

@js.native
sealed trait DataLabelOverlap extends js.Any
object DataLabelOverlap {
  val DISABLE_OVERLAP = "DISABLE_OVERLAP".asInstanceOf[DataLabelOverlap]
  val ENABLE_OVERLAP = "ENABLE_OVERLAP".asInstanceOf[DataLabelOverlap]

  @inline def values: js.Array[DataLabelOverlap] = js.Array(DISABLE_OVERLAP, ENABLE_OVERLAP)
}

@js.native
sealed trait DataLabelPosition extends js.Any
object DataLabelPosition {
  val INSIDE = "INSIDE".asInstanceOf[DataLabelPosition]
  val OUTSIDE = "OUTSIDE".asInstanceOf[DataLabelPosition]
  val LEFT = "LEFT".asInstanceOf[DataLabelPosition]
  val TOP = "TOP".asInstanceOf[DataLabelPosition]
  val BOTTOM = "BOTTOM".asInstanceOf[DataLabelPosition]
  val RIGHT = "RIGHT".asInstanceOf[DataLabelPosition]

  @inline def values: js.Array[DataLabelPosition] = js.Array(INSIDE, OUTSIDE, LEFT, TOP, BOTTOM, RIGHT)
}

@js.native
sealed trait DataSetFilterAttribute extends js.Any
object DataSetFilterAttribute {
  val QUICKSIGHT_VIEWER_OR_OWNER = "QUICKSIGHT_VIEWER_OR_OWNER".asInstanceOf[DataSetFilterAttribute]
  val QUICKSIGHT_OWNER = "QUICKSIGHT_OWNER".asInstanceOf[DataSetFilterAttribute]
  val DIRECT_QUICKSIGHT_VIEWER_OR_OWNER = "DIRECT_QUICKSIGHT_VIEWER_OR_OWNER".asInstanceOf[DataSetFilterAttribute]
  val DIRECT_QUICKSIGHT_OWNER = "DIRECT_QUICKSIGHT_OWNER".asInstanceOf[DataSetFilterAttribute]
  val DIRECT_QUICKSIGHT_SOLE_OWNER = "DIRECT_QUICKSIGHT_SOLE_OWNER".asInstanceOf[DataSetFilterAttribute]
  val DATASET_NAME = "DATASET_NAME".asInstanceOf[DataSetFilterAttribute]

  @inline def values: js.Array[DataSetFilterAttribute] = js.Array(QUICKSIGHT_VIEWER_OR_OWNER, QUICKSIGHT_OWNER, DIRECT_QUICKSIGHT_VIEWER_OR_OWNER, DIRECT_QUICKSIGHT_OWNER, DIRECT_QUICKSIGHT_SOLE_OWNER, DATASET_NAME)
}

@js.native
sealed trait DataSetImportMode extends js.Any
object DataSetImportMode {
  val SPICE = "SPICE".asInstanceOf[DataSetImportMode]
  val DIRECT_QUERY = "DIRECT_QUERY".asInstanceOf[DataSetImportMode]

  @inline def values: js.Array[DataSetImportMode] = js.Array(SPICE, DIRECT_QUERY)
}

@js.native
sealed trait DataSourceErrorInfoType extends js.Any
object DataSourceErrorInfoType {
  val ACCESS_DENIED = "ACCESS_DENIED".asInstanceOf[DataSourceErrorInfoType]
  val COPY_SOURCE_NOT_FOUND = "COPY_SOURCE_NOT_FOUND".asInstanceOf[DataSourceErrorInfoType]
  val TIMEOUT = "TIMEOUT".asInstanceOf[DataSourceErrorInfoType]
  val ENGINE_VERSION_NOT_SUPPORTED = "ENGINE_VERSION_NOT_SUPPORTED".asInstanceOf[DataSourceErrorInfoType]
  val UNKNOWN_HOST = "UNKNOWN_HOST".asInstanceOf[DataSourceErrorInfoType]
  val GENERIC_SQL_FAILURE = "GENERIC_SQL_FAILURE".asInstanceOf[DataSourceErrorInfoType]
  val CONFLICT = "CONFLICT".asInstanceOf[DataSourceErrorInfoType]
  val UNKNOWN = "UNKNOWN".asInstanceOf[DataSourceErrorInfoType]

  @inline def values: js.Array[DataSourceErrorInfoType] = js.Array(ACCESS_DENIED, COPY_SOURCE_NOT_FOUND, TIMEOUT, ENGINE_VERSION_NOT_SUPPORTED, UNKNOWN_HOST, GENERIC_SQL_FAILURE, CONFLICT, UNKNOWN)
}

@js.native
sealed trait DataSourceFilterAttribute extends js.Any
object DataSourceFilterAttribute {
  val DIRECT_QUICKSIGHT_VIEWER_OR_OWNER = "DIRECT_QUICKSIGHT_VIEWER_OR_OWNER".asInstanceOf[DataSourceFilterAttribute]
  val DIRECT_QUICKSIGHT_OWNER = "DIRECT_QUICKSIGHT_OWNER".asInstanceOf[DataSourceFilterAttribute]
  val DIRECT_QUICKSIGHT_SOLE_OWNER = "DIRECT_QUICKSIGHT_SOLE_OWNER".asInstanceOf[DataSourceFilterAttribute]
  val DATASOURCE_NAME = "DATASOURCE_NAME".asInstanceOf[DataSourceFilterAttribute]

  @inline def values: js.Array[DataSourceFilterAttribute] = js.Array(DIRECT_QUICKSIGHT_VIEWER_OR_OWNER, DIRECT_QUICKSIGHT_OWNER, DIRECT_QUICKSIGHT_SOLE_OWNER, DATASOURCE_NAME)
}

@js.native
sealed trait DataSourceType extends js.Any
object DataSourceType {
  val ADOBE_ANALYTICS = "ADOBE_ANALYTICS".asInstanceOf[DataSourceType]
  val AMAZON_ELASTICSEARCH = "AMAZON_ELASTICSEARCH".asInstanceOf[DataSourceType]
  val ATHENA = "ATHENA".asInstanceOf[DataSourceType]
  val AURORA = "AURORA".asInstanceOf[DataSourceType]
  val AURORA_POSTGRESQL = "AURORA_POSTGRESQL".asInstanceOf[DataSourceType]
  val AWS_IOT_ANALYTICS = "AWS_IOT_ANALYTICS".asInstanceOf[DataSourceType]
  val GITHUB = "GITHUB".asInstanceOf[DataSourceType]
  val JIRA = "JIRA".asInstanceOf[DataSourceType]
  val MARIADB = "MARIADB".asInstanceOf[DataSourceType]
  val MYSQL = "MYSQL".asInstanceOf[DataSourceType]
  val ORACLE = "ORACLE".asInstanceOf[DataSourceType]
  val POSTGRESQL = "POSTGRESQL".asInstanceOf[DataSourceType]
  val PRESTO = "PRESTO".asInstanceOf[DataSourceType]
  val REDSHIFT = "REDSHIFT".asInstanceOf[DataSourceType]
  val S3 = "S3".asInstanceOf[DataSourceType]
  val SALESFORCE = "SALESFORCE".asInstanceOf[DataSourceType]
  val SERVICENOW = "SERVICENOW".asInstanceOf[DataSourceType]
  val SNOWFLAKE = "SNOWFLAKE".asInstanceOf[DataSourceType]
  val SPARK = "SPARK".asInstanceOf[DataSourceType]
  val SQLSERVER = "SQLSERVER".asInstanceOf[DataSourceType]
  val TERADATA = "TERADATA".asInstanceOf[DataSourceType]
  val TWITTER = "TWITTER".asInstanceOf[DataSourceType]
  val TIMESTREAM = "TIMESTREAM".asInstanceOf[DataSourceType]
  val AMAZON_OPENSEARCH = "AMAZON_OPENSEARCH".asInstanceOf[DataSourceType]
  val EXASOL = "EXASOL".asInstanceOf[DataSourceType]
  val DATABRICKS = "DATABRICKS".asInstanceOf[DataSourceType]

  @inline def values: js.Array[DataSourceType] = js.Array(
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
    ORACLE,
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
    TWITTER,
    TIMESTREAM,
    AMAZON_OPENSEARCH,
    EXASOL,
    DATABRICKS
  )
}

@js.native
sealed trait DateAggregationFunction extends js.Any
object DateAggregationFunction {
  val COUNT = "COUNT".asInstanceOf[DateAggregationFunction]
  val DISTINCT_COUNT = "DISTINCT_COUNT".asInstanceOf[DateAggregationFunction]
  val MIN = "MIN".asInstanceOf[DateAggregationFunction]
  val MAX = "MAX".asInstanceOf[DateAggregationFunction]

  @inline def values: js.Array[DateAggregationFunction] = js.Array(COUNT, DISTINCT_COUNT, MIN, MAX)
}

@js.native
sealed trait Edition extends js.Any
object Edition {
  val STANDARD = "STANDARD".asInstanceOf[Edition]
  val ENTERPRISE = "ENTERPRISE".asInstanceOf[Edition]
  val ENTERPRISE_AND_Q = "ENTERPRISE_AND_Q".asInstanceOf[Edition]

  @inline def values: js.Array[Edition] = js.Array(STANDARD, ENTERPRISE, ENTERPRISE_AND_Q)
}

@js.native
sealed trait EmbeddingIdentityType extends js.Any
object EmbeddingIdentityType {
  val IAM = "IAM".asInstanceOf[EmbeddingIdentityType]
  val QUICKSIGHT = "QUICKSIGHT".asInstanceOf[EmbeddingIdentityType]
  val ANONYMOUS = "ANONYMOUS".asInstanceOf[EmbeddingIdentityType]

  @inline def values: js.Array[EmbeddingIdentityType] = js.Array(IAM, QUICKSIGHT, ANONYMOUS)
}

@js.native
sealed trait FileFormat extends js.Any
object FileFormat {
  val CSV = "CSV".asInstanceOf[FileFormat]
  val TSV = "TSV".asInstanceOf[FileFormat]
  val CLF = "CLF".asInstanceOf[FileFormat]
  val ELF = "ELF".asInstanceOf[FileFormat]
  val XLSX = "XLSX".asInstanceOf[FileFormat]
  val JSON = "JSON".asInstanceOf[FileFormat]

  @inline def values: js.Array[FileFormat] = js.Array(CSV, TSV, CLF, ELF, XLSX, JSON)
}

@js.native
sealed trait FilterNullOption extends js.Any
object FilterNullOption {
  val ALL_VALUES = "ALL_VALUES".asInstanceOf[FilterNullOption]
  val NULLS_ONLY = "NULLS_ONLY".asInstanceOf[FilterNullOption]
  val NON_NULLS_ONLY = "NON_NULLS_ONLY".asInstanceOf[FilterNullOption]

  @inline def values: js.Array[FilterNullOption] = js.Array(ALL_VALUES, NULLS_ONLY, NON_NULLS_ONLY)
}

@js.native
sealed trait FilterOperator extends js.Any
object FilterOperator {
  val StringEquals = "StringEquals".asInstanceOf[FilterOperator]
  val StringLike = "StringLike".asInstanceOf[FilterOperator]

  @inline def values: js.Array[FilterOperator] = js.Array(StringEquals, StringLike)
}

@js.native
sealed trait FilterVisualScope extends js.Any
object FilterVisualScope {
  val ALL_VISUALS = "ALL_VISUALS".asInstanceOf[FilterVisualScope]
  val SELECTED_VISUALS = "SELECTED_VISUALS".asInstanceOf[FilterVisualScope]

  @inline def values: js.Array[FilterVisualScope] = js.Array(ALL_VISUALS, SELECTED_VISUALS)
}

@js.native
sealed trait FolderFilterAttribute extends js.Any
object FolderFilterAttribute {
  val PARENT_FOLDER_ARN = "PARENT_FOLDER_ARN".asInstanceOf[FolderFilterAttribute]
  val DIRECT_QUICKSIGHT_OWNER = "DIRECT_QUICKSIGHT_OWNER".asInstanceOf[FolderFilterAttribute]
  val DIRECT_QUICKSIGHT_SOLE_OWNER = "DIRECT_QUICKSIGHT_SOLE_OWNER".asInstanceOf[FolderFilterAttribute]
  val DIRECT_QUICKSIGHT_VIEWER_OR_OWNER = "DIRECT_QUICKSIGHT_VIEWER_OR_OWNER".asInstanceOf[FolderFilterAttribute]
  val QUICKSIGHT_OWNER = "QUICKSIGHT_OWNER".asInstanceOf[FolderFilterAttribute]
  val QUICKSIGHT_VIEWER_OR_OWNER = "QUICKSIGHT_VIEWER_OR_OWNER".asInstanceOf[FolderFilterAttribute]
  val FOLDER_NAME = "FOLDER_NAME".asInstanceOf[FolderFilterAttribute]

  @inline def values: js.Array[FolderFilterAttribute] = js.Array(
    PARENT_FOLDER_ARN,
    DIRECT_QUICKSIGHT_OWNER,
    DIRECT_QUICKSIGHT_SOLE_OWNER,
    DIRECT_QUICKSIGHT_VIEWER_OR_OWNER,
    QUICKSIGHT_OWNER,
    QUICKSIGHT_VIEWER_OR_OWNER,
    FOLDER_NAME
  )
}

@js.native
sealed trait FolderType extends js.Any
object FolderType {
  val SHARED = "SHARED".asInstanceOf[FolderType]

  @inline def values: js.Array[FolderType] = js.Array(SHARED)
}

@js.native
sealed trait FontDecoration extends js.Any
object FontDecoration {
  val UNDERLINE = "UNDERLINE".asInstanceOf[FontDecoration]
  val NONE = "NONE".asInstanceOf[FontDecoration]

  @inline def values: js.Array[FontDecoration] = js.Array(UNDERLINE, NONE)
}

@js.native
sealed trait FontStyle extends js.Any
object FontStyle {
  val NORMAL = "NORMAL".asInstanceOf[FontStyle]
  val ITALIC = "ITALIC".asInstanceOf[FontStyle]

  @inline def values: js.Array[FontStyle] = js.Array(NORMAL, ITALIC)
}

@js.native
sealed trait FontWeightName extends js.Any
object FontWeightName {
  val NORMAL = "NORMAL".asInstanceOf[FontWeightName]
  val BOLD = "BOLD".asInstanceOf[FontWeightName]

  @inline def values: js.Array[FontWeightName] = js.Array(NORMAL, BOLD)
}

@js.native
sealed trait ForecastComputationSeasonality extends js.Any
object ForecastComputationSeasonality {
  val AUTOMATIC = "AUTOMATIC".asInstanceOf[ForecastComputationSeasonality]
  val CUSTOM = "CUSTOM".asInstanceOf[ForecastComputationSeasonality]

  @inline def values: js.Array[ForecastComputationSeasonality] = js.Array(AUTOMATIC, CUSTOM)
}

@js.native
sealed trait FunnelChartMeasureDataLabelStyle extends js.Any
object FunnelChartMeasureDataLabelStyle {
  val VALUE_ONLY = "VALUE_ONLY".asInstanceOf[FunnelChartMeasureDataLabelStyle]
  val PERCENTAGE_BY_FIRST_STAGE = "PERCENTAGE_BY_FIRST_STAGE".asInstanceOf[FunnelChartMeasureDataLabelStyle]
  val PERCENTAGE_BY_PREVIOUS_STAGE = "PERCENTAGE_BY_PREVIOUS_STAGE".asInstanceOf[FunnelChartMeasureDataLabelStyle]
  val VALUE_AND_PERCENTAGE_BY_FIRST_STAGE = "VALUE_AND_PERCENTAGE_BY_FIRST_STAGE".asInstanceOf[FunnelChartMeasureDataLabelStyle]
  val VALUE_AND_PERCENTAGE_BY_PREVIOUS_STAGE = "VALUE_AND_PERCENTAGE_BY_PREVIOUS_STAGE".asInstanceOf[FunnelChartMeasureDataLabelStyle]

  @inline def values: js.Array[FunnelChartMeasureDataLabelStyle] = js.Array(VALUE_ONLY, PERCENTAGE_BY_FIRST_STAGE, PERCENTAGE_BY_PREVIOUS_STAGE, VALUE_AND_PERCENTAGE_BY_FIRST_STAGE, VALUE_AND_PERCENTAGE_BY_PREVIOUS_STAGE)
}

@js.native
sealed trait GeoSpatialCountryCode extends js.Any
object GeoSpatialCountryCode {
  val US = "US".asInstanceOf[GeoSpatialCountryCode]

  @inline def values: js.Array[GeoSpatialCountryCode] = js.Array(US)
}

@js.native
sealed trait GeoSpatialDataRole extends js.Any
object GeoSpatialDataRole {
  val COUNTRY = "COUNTRY".asInstanceOf[GeoSpatialDataRole]
  val STATE = "STATE".asInstanceOf[GeoSpatialDataRole]
  val COUNTY = "COUNTY".asInstanceOf[GeoSpatialDataRole]
  val CITY = "CITY".asInstanceOf[GeoSpatialDataRole]
  val POSTCODE = "POSTCODE".asInstanceOf[GeoSpatialDataRole]
  val LONGITUDE = "LONGITUDE".asInstanceOf[GeoSpatialDataRole]
  val LATITUDE = "LATITUDE".asInstanceOf[GeoSpatialDataRole]

  @inline def values: js.Array[GeoSpatialDataRole] = js.Array(COUNTRY, STATE, COUNTY, CITY, POSTCODE, LONGITUDE, LATITUDE)
}

@js.native
sealed trait GeospatialSelectedPointStyle extends js.Any
object GeospatialSelectedPointStyle {
  val POINT = "POINT".asInstanceOf[GeospatialSelectedPointStyle]
  val CLUSTER = "CLUSTER".asInstanceOf[GeospatialSelectedPointStyle]

  @inline def values: js.Array[GeospatialSelectedPointStyle] = js.Array(POINT, CLUSTER)
}

@js.native
sealed trait GroupFilterAttribute extends js.Any
object GroupFilterAttribute {
  val GROUP_NAME = "GROUP_NAME".asInstanceOf[GroupFilterAttribute]

  @inline def values: js.Array[GroupFilterAttribute] = js.Array(GROUP_NAME)
}

@js.native
sealed trait GroupFilterOperator extends js.Any
object GroupFilterOperator {
  val StartsWith = "StartsWith".asInstanceOf[GroupFilterOperator]

  @inline def values: js.Array[GroupFilterOperator] = js.Array(StartsWith)
}

@js.native
sealed trait HistogramBinType extends js.Any
object HistogramBinType {
  val BIN_COUNT = "BIN_COUNT".asInstanceOf[HistogramBinType]
  val BIN_WIDTH = "BIN_WIDTH".asInstanceOf[HistogramBinType]

  @inline def values: js.Array[HistogramBinType] = js.Array(BIN_COUNT, BIN_WIDTH)
}

@js.native
sealed trait HorizontalTextAlignment extends js.Any
object HorizontalTextAlignment {
  val LEFT = "LEFT".asInstanceOf[HorizontalTextAlignment]
  val CENTER = "CENTER".asInstanceOf[HorizontalTextAlignment]
  val RIGHT = "RIGHT".asInstanceOf[HorizontalTextAlignment]
  val AUTO = "AUTO".asInstanceOf[HorizontalTextAlignment]

  @inline def values: js.Array[HorizontalTextAlignment] = js.Array(LEFT, CENTER, RIGHT, AUTO)
}

@js.native
sealed trait Icon extends js.Any
object Icon {
  val CARET_UP = "CARET_UP".asInstanceOf[Icon]
  val CARET_DOWN = "CARET_DOWN".asInstanceOf[Icon]
  val PLUS = "PLUS".asInstanceOf[Icon]
  val MINUS = "MINUS".asInstanceOf[Icon]
  val ARROW_UP = "ARROW_UP".asInstanceOf[Icon]
  val ARROW_DOWN = "ARROW_DOWN".asInstanceOf[Icon]
  val ARROW_LEFT = "ARROW_LEFT".asInstanceOf[Icon]
  val ARROW_UP_LEFT = "ARROW_UP_LEFT".asInstanceOf[Icon]
  val ARROW_DOWN_LEFT = "ARROW_DOWN_LEFT".asInstanceOf[Icon]
  val ARROW_RIGHT = "ARROW_RIGHT".asInstanceOf[Icon]
  val ARROW_UP_RIGHT = "ARROW_UP_RIGHT".asInstanceOf[Icon]
  val ARROW_DOWN_RIGHT = "ARROW_DOWN_RIGHT".asInstanceOf[Icon]
  val FACE_UP = "FACE_UP".asInstanceOf[Icon]
  val FACE_DOWN = "FACE_DOWN".asInstanceOf[Icon]
  val FACE_FLAT = "FACE_FLAT".asInstanceOf[Icon]
  val ONE_BAR = "ONE_BAR".asInstanceOf[Icon]
  val TWO_BAR = "TWO_BAR".asInstanceOf[Icon]
  val THREE_BAR = "THREE_BAR".asInstanceOf[Icon]
  val CIRCLE = "CIRCLE".asInstanceOf[Icon]
  val TRIANGLE = "TRIANGLE".asInstanceOf[Icon]
  val SQUARE = "SQUARE".asInstanceOf[Icon]
  val FLAG = "FLAG".asInstanceOf[Icon]
  val THUMBS_UP = "THUMBS_UP".asInstanceOf[Icon]
  val THUMBS_DOWN = "THUMBS_DOWN".asInstanceOf[Icon]
  val CHECKMARK = "CHECKMARK".asInstanceOf[Icon]
  val X = "X".asInstanceOf[Icon]

  @inline def values: js.Array[Icon] = js.Array(
    CARET_UP,
    CARET_DOWN,
    PLUS,
    MINUS,
    ARROW_UP,
    ARROW_DOWN,
    ARROW_LEFT,
    ARROW_UP_LEFT,
    ARROW_DOWN_LEFT,
    ARROW_RIGHT,
    ARROW_UP_RIGHT,
    ARROW_DOWN_RIGHT,
    FACE_UP,
    FACE_DOWN,
    FACE_FLAT,
    ONE_BAR,
    TWO_BAR,
    THREE_BAR,
    CIRCLE,
    TRIANGLE,
    SQUARE,
    FLAG,
    THUMBS_UP,
    THUMBS_DOWN,
    CHECKMARK,
    X
  )
}

@js.native
sealed trait IdentityStore extends js.Any
object IdentityStore {
  val QUICKSIGHT = "QUICKSIGHT".asInstanceOf[IdentityStore]

  @inline def values: js.Array[IdentityStore] = js.Array(QUICKSIGHT)
}

@js.native
sealed trait IdentityType extends js.Any
object IdentityType {
  val IAM = "IAM".asInstanceOf[IdentityType]
  val QUICKSIGHT = "QUICKSIGHT".asInstanceOf[IdentityType]

  @inline def values: js.Array[IdentityType] = js.Array(IAM, QUICKSIGHT)
}

@js.native
sealed trait IngestionErrorType extends js.Any
object IngestionErrorType {
  val FAILURE_TO_ASSUME_ROLE = "FAILURE_TO_ASSUME_ROLE".asInstanceOf[IngestionErrorType]
  val INGESTION_SUPERSEDED = "INGESTION_SUPERSEDED".asInstanceOf[IngestionErrorType]
  val INGESTION_CANCELED = "INGESTION_CANCELED".asInstanceOf[IngestionErrorType]
  val DATA_SET_DELETED = "DATA_SET_DELETED".asInstanceOf[IngestionErrorType]
  val DATA_SET_NOT_SPICE = "DATA_SET_NOT_SPICE".asInstanceOf[IngestionErrorType]
  val S3_UPLOADED_FILE_DELETED = "S3_UPLOADED_FILE_DELETED".asInstanceOf[IngestionErrorType]
  val S3_MANIFEST_ERROR = "S3_MANIFEST_ERROR".asInstanceOf[IngestionErrorType]
  val DATA_TOLERANCE_EXCEPTION = "DATA_TOLERANCE_EXCEPTION".asInstanceOf[IngestionErrorType]
  val SPICE_TABLE_NOT_FOUND = "SPICE_TABLE_NOT_FOUND".asInstanceOf[IngestionErrorType]
  val DATA_SET_SIZE_LIMIT_EXCEEDED = "DATA_SET_SIZE_LIMIT_EXCEEDED".asInstanceOf[IngestionErrorType]
  val ROW_SIZE_LIMIT_EXCEEDED = "ROW_SIZE_LIMIT_EXCEEDED".asInstanceOf[IngestionErrorType]
  val ACCOUNT_CAPACITY_LIMIT_EXCEEDED = "ACCOUNT_CAPACITY_LIMIT_EXCEEDED".asInstanceOf[IngestionErrorType]
  val CUSTOMER_ERROR = "CUSTOMER_ERROR".asInstanceOf[IngestionErrorType]
  val DATA_SOURCE_NOT_FOUND = "DATA_SOURCE_NOT_FOUND".asInstanceOf[IngestionErrorType]
  val IAM_ROLE_NOT_AVAILABLE = "IAM_ROLE_NOT_AVAILABLE".asInstanceOf[IngestionErrorType]
  val CONNECTION_FAILURE = "CONNECTION_FAILURE".asInstanceOf[IngestionErrorType]
  val SQL_TABLE_NOT_FOUND = "SQL_TABLE_NOT_FOUND".asInstanceOf[IngestionErrorType]
  val PERMISSION_DENIED = "PERMISSION_DENIED".asInstanceOf[IngestionErrorType]
  val SSL_CERTIFICATE_VALIDATION_FAILURE = "SSL_CERTIFICATE_VALIDATION_FAILURE".asInstanceOf[IngestionErrorType]
  val OAUTH_TOKEN_FAILURE = "OAUTH_TOKEN_FAILURE".asInstanceOf[IngestionErrorType]
  val SOURCE_API_LIMIT_EXCEEDED_FAILURE = "SOURCE_API_LIMIT_EXCEEDED_FAILURE".asInstanceOf[IngestionErrorType]
  val PASSWORD_AUTHENTICATION_FAILURE = "PASSWORD_AUTHENTICATION_FAILURE".asInstanceOf[IngestionErrorType]
  val SQL_SCHEMA_MISMATCH_ERROR = "SQL_SCHEMA_MISMATCH_ERROR".asInstanceOf[IngestionErrorType]
  val INVALID_DATE_FORMAT = "INVALID_DATE_FORMAT".asInstanceOf[IngestionErrorType]
  val INVALID_DATAPREP_SYNTAX = "INVALID_DATAPREP_SYNTAX".asInstanceOf[IngestionErrorType]
  val SOURCE_RESOURCE_LIMIT_EXCEEDED = "SOURCE_RESOURCE_LIMIT_EXCEEDED".asInstanceOf[IngestionErrorType]
  val SQL_INVALID_PARAMETER_VALUE = "SQL_INVALID_PARAMETER_VALUE".asInstanceOf[IngestionErrorType]
  val QUERY_TIMEOUT = "QUERY_TIMEOUT".asInstanceOf[IngestionErrorType]
  val SQL_NUMERIC_OVERFLOW = "SQL_NUMERIC_OVERFLOW".asInstanceOf[IngestionErrorType]
  val UNRESOLVABLE_HOST = "UNRESOLVABLE_HOST".asInstanceOf[IngestionErrorType]
  val UNROUTABLE_HOST = "UNROUTABLE_HOST".asInstanceOf[IngestionErrorType]
  val SQL_EXCEPTION = "SQL_EXCEPTION".asInstanceOf[IngestionErrorType]
  val S3_FILE_INACCESSIBLE = "S3_FILE_INACCESSIBLE".asInstanceOf[IngestionErrorType]
  val IOT_FILE_NOT_FOUND = "IOT_FILE_NOT_FOUND".asInstanceOf[IngestionErrorType]
  val IOT_DATA_SET_FILE_EMPTY = "IOT_DATA_SET_FILE_EMPTY".asInstanceOf[IngestionErrorType]
  val INVALID_DATA_SOURCE_CONFIG = "INVALID_DATA_SOURCE_CONFIG".asInstanceOf[IngestionErrorType]
  val DATA_SOURCE_AUTH_FAILED = "DATA_SOURCE_AUTH_FAILED".asInstanceOf[IngestionErrorType]
  val DATA_SOURCE_CONNECTION_FAILED = "DATA_SOURCE_CONNECTION_FAILED".asInstanceOf[IngestionErrorType]
  val FAILURE_TO_PROCESS_JSON_FILE = "FAILURE_TO_PROCESS_JSON_FILE".asInstanceOf[IngestionErrorType]
  val INTERNAL_SERVICE_ERROR = "INTERNAL_SERVICE_ERROR".asInstanceOf[IngestionErrorType]
  val REFRESH_SUPPRESSED_BY_EDIT = "REFRESH_SUPPRESSED_BY_EDIT".asInstanceOf[IngestionErrorType]
  val PERMISSION_NOT_FOUND = "PERMISSION_NOT_FOUND".asInstanceOf[IngestionErrorType]
  val ELASTICSEARCH_CURSOR_NOT_ENABLED = "ELASTICSEARCH_CURSOR_NOT_ENABLED".asInstanceOf[IngestionErrorType]
  val CURSOR_NOT_ENABLED = "CURSOR_NOT_ENABLED".asInstanceOf[IngestionErrorType]

  @inline def values: js.Array[IngestionErrorType] = js.Array(
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
    INTERNAL_SERVICE_ERROR,
    REFRESH_SUPPRESSED_BY_EDIT,
    PERMISSION_NOT_FOUND,
    ELASTICSEARCH_CURSOR_NOT_ENABLED,
    CURSOR_NOT_ENABLED
  )
}

@js.native
sealed trait IngestionRequestSource extends js.Any
object IngestionRequestSource {
  val MANUAL = "MANUAL".asInstanceOf[IngestionRequestSource]
  val SCHEDULED = "SCHEDULED".asInstanceOf[IngestionRequestSource]

  @inline def values: js.Array[IngestionRequestSource] = js.Array(MANUAL, SCHEDULED)
}

/** This defines the type of ingestion request. This is returned as part of create ingestion response.
  */
@js.native
sealed trait IngestionRequestType extends js.Any
object IngestionRequestType {
  val INITIAL_INGESTION = "INITIAL_INGESTION".asInstanceOf[IngestionRequestType]
  val EDIT = "EDIT".asInstanceOf[IngestionRequestType]
  val INCREMENTAL_REFRESH = "INCREMENTAL_REFRESH".asInstanceOf[IngestionRequestType]
  val FULL_REFRESH = "FULL_REFRESH".asInstanceOf[IngestionRequestType]

  @inline def values: js.Array[IngestionRequestType] = js.Array(INITIAL_INGESTION, EDIT, INCREMENTAL_REFRESH, FULL_REFRESH)
}

@js.native
sealed trait IngestionStatus extends js.Any
object IngestionStatus {
  val INITIALIZED = "INITIALIZED".asInstanceOf[IngestionStatus]
  val QUEUED = "QUEUED".asInstanceOf[IngestionStatus]
  val RUNNING = "RUNNING".asInstanceOf[IngestionStatus]
  val FAILED = "FAILED".asInstanceOf[IngestionStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[IngestionStatus]
  val CANCELLED = "CANCELLED".asInstanceOf[IngestionStatus]

  @inline def values: js.Array[IngestionStatus] = js.Array(INITIALIZED, QUEUED, RUNNING, FAILED, COMPLETED, CANCELLED)
}

/** This defines the type of ingestion user wants to trigger. This is part of create ingestion request.
  */
@js.native
sealed trait IngestionType extends js.Any
object IngestionType {
  val INCREMENTAL_REFRESH = "INCREMENTAL_REFRESH".asInstanceOf[IngestionType]
  val FULL_REFRESH = "FULL_REFRESH".asInstanceOf[IngestionType]

  @inline def values: js.Array[IngestionType] = js.Array(INCREMENTAL_REFRESH, FULL_REFRESH)
}

@js.native
sealed trait InputColumnDataType extends js.Any
object InputColumnDataType {
  val STRING = "STRING".asInstanceOf[InputColumnDataType]
  val INTEGER = "INTEGER".asInstanceOf[InputColumnDataType]
  val DECIMAL = "DECIMAL".asInstanceOf[InputColumnDataType]
  val DATETIME = "DATETIME".asInstanceOf[InputColumnDataType]
  val BIT = "BIT".asInstanceOf[InputColumnDataType]
  val BOOLEAN = "BOOLEAN".asInstanceOf[InputColumnDataType]
  val JSON = "JSON".asInstanceOf[InputColumnDataType]

  @inline def values: js.Array[InputColumnDataType] = js.Array(STRING, INTEGER, DECIMAL, DATETIME, BIT, BOOLEAN, JSON)
}

@js.native
sealed trait JoinType extends js.Any
object JoinType {
  val INNER = "INNER".asInstanceOf[JoinType]
  val OUTER = "OUTER".asInstanceOf[JoinType]
  val LEFT = "LEFT".asInstanceOf[JoinType]
  val RIGHT = "RIGHT".asInstanceOf[JoinType]

  @inline def values: js.Array[JoinType] = js.Array(INNER, OUTER, LEFT, RIGHT)
}

@js.native
sealed trait LayoutElementType extends js.Any
object LayoutElementType {
  val VISUAL = "VISUAL".asInstanceOf[LayoutElementType]
  val FILTER_CONTROL = "FILTER_CONTROL".asInstanceOf[LayoutElementType]
  val PARAMETER_CONTROL = "PARAMETER_CONTROL".asInstanceOf[LayoutElementType]
  val TEXT_BOX = "TEXT_BOX".asInstanceOf[LayoutElementType]

  @inline def values: js.Array[LayoutElementType] = js.Array(VISUAL, FILTER_CONTROL, PARAMETER_CONTROL, TEXT_BOX)
}

@js.native
sealed trait LegendPosition extends js.Any
object LegendPosition {
  val AUTO = "AUTO".asInstanceOf[LegendPosition]
  val RIGHT = "RIGHT".asInstanceOf[LegendPosition]
  val BOTTOM = "BOTTOM".asInstanceOf[LegendPosition]
  val TOP = "TOP".asInstanceOf[LegendPosition]

  @inline def values: js.Array[LegendPosition] = js.Array(AUTO, RIGHT, BOTTOM, TOP)
}

@js.native
sealed trait LineChartLineStyle extends js.Any
object LineChartLineStyle {
  val SOLID = "SOLID".asInstanceOf[LineChartLineStyle]
  val DOTTED = "DOTTED".asInstanceOf[LineChartLineStyle]
  val DASHED = "DASHED".asInstanceOf[LineChartLineStyle]

  @inline def values: js.Array[LineChartLineStyle] = js.Array(SOLID, DOTTED, DASHED)
}

@js.native
sealed trait LineChartMarkerShape extends js.Any
object LineChartMarkerShape {
  val CIRCLE = "CIRCLE".asInstanceOf[LineChartMarkerShape]
  val TRIANGLE = "TRIANGLE".asInstanceOf[LineChartMarkerShape]
  val SQUARE = "SQUARE".asInstanceOf[LineChartMarkerShape]
  val DIAMOND = "DIAMOND".asInstanceOf[LineChartMarkerShape]
  val ROUNDED_SQUARE = "ROUNDED_SQUARE".asInstanceOf[LineChartMarkerShape]

  @inline def values: js.Array[LineChartMarkerShape] = js.Array(CIRCLE, TRIANGLE, SQUARE, DIAMOND, ROUNDED_SQUARE)
}

@js.native
sealed trait LineChartType extends js.Any
object LineChartType {
  val LINE = "LINE".asInstanceOf[LineChartType]
  val AREA = "AREA".asInstanceOf[LineChartType]
  val STACKED_AREA = "STACKED_AREA".asInstanceOf[LineChartType]

  @inline def values: js.Array[LineChartType] = js.Array(LINE, AREA, STACKED_AREA)
}

@js.native
sealed trait LineInterpolation extends js.Any
object LineInterpolation {
  val LINEAR = "LINEAR".asInstanceOf[LineInterpolation]
  val SMOOTH = "SMOOTH".asInstanceOf[LineInterpolation]
  val STEPPED = "STEPPED".asInstanceOf[LineInterpolation]

  @inline def values: js.Array[LineInterpolation] = js.Array(LINEAR, SMOOTH, STEPPED)
}

@js.native
sealed trait MapZoomMode extends js.Any
object MapZoomMode {
  val AUTO = "AUTO".asInstanceOf[MapZoomMode]
  val MANUAL = "MANUAL".asInstanceOf[MapZoomMode]

  @inline def values: js.Array[MapZoomMode] = js.Array(AUTO, MANUAL)
}

@js.native
sealed trait MaximumMinimumComputationType extends js.Any
object MaximumMinimumComputationType {
  val MAXIMUM = "MAXIMUM".asInstanceOf[MaximumMinimumComputationType]
  val MINIMUM = "MINIMUM".asInstanceOf[MaximumMinimumComputationType]

  @inline def values: js.Array[MaximumMinimumComputationType] = js.Array(MAXIMUM, MINIMUM)
}

@js.native
sealed trait MemberType extends js.Any
object MemberType {
  val DASHBOARD = "DASHBOARD".asInstanceOf[MemberType]
  val ANALYSIS = "ANALYSIS".asInstanceOf[MemberType]
  val DATASET = "DATASET".asInstanceOf[MemberType]

  @inline def values: js.Array[MemberType] = js.Array(DASHBOARD, ANALYSIS, DATASET)
}

@js.native
sealed trait MissingDataTreatmentOption extends js.Any
object MissingDataTreatmentOption {
  val INTERPOLATE = "INTERPOLATE".asInstanceOf[MissingDataTreatmentOption]
  val SHOW_AS_ZERO = "SHOW_AS_ZERO".asInstanceOf[MissingDataTreatmentOption]
  val SHOW_AS_BLANK = "SHOW_AS_BLANK".asInstanceOf[MissingDataTreatmentOption]

  @inline def values: js.Array[MissingDataTreatmentOption] = js.Array(INTERPOLATE, SHOW_AS_ZERO, SHOW_AS_BLANK)
}

@js.native
sealed trait NamespaceErrorType extends js.Any
object NamespaceErrorType {
  val PERMISSION_DENIED = "PERMISSION_DENIED".asInstanceOf[NamespaceErrorType]
  val INTERNAL_SERVICE_ERROR = "INTERNAL_SERVICE_ERROR".asInstanceOf[NamespaceErrorType]

  @inline def values: js.Array[NamespaceErrorType] = js.Array(PERMISSION_DENIED, INTERNAL_SERVICE_ERROR)
}

@js.native
sealed trait NamespaceStatus extends js.Any
object NamespaceStatus {
  val CREATED = "CREATED".asInstanceOf[NamespaceStatus]
  val CREATING = "CREATING".asInstanceOf[NamespaceStatus]
  val DELETING = "DELETING".asInstanceOf[NamespaceStatus]
  val RETRYABLE_FAILURE = "RETRYABLE_FAILURE".asInstanceOf[NamespaceStatus]
  val NON_RETRYABLE_FAILURE = "NON_RETRYABLE_FAILURE".asInstanceOf[NamespaceStatus]

  @inline def values: js.Array[NamespaceStatus] = js.Array(CREATED, CREATING, DELETING, RETRYABLE_FAILURE, NON_RETRYABLE_FAILURE)
}

@js.native
sealed trait NegativeValueDisplayMode extends js.Any
object NegativeValueDisplayMode {
  val POSITIVE = "POSITIVE".asInstanceOf[NegativeValueDisplayMode]
  val NEGATIVE = "NEGATIVE".asInstanceOf[NegativeValueDisplayMode]

  @inline def values: js.Array[NegativeValueDisplayMode] = js.Array(POSITIVE, NEGATIVE)
}

@js.native
sealed trait NumberScale extends js.Any
object NumberScale {
  val NONE = "NONE".asInstanceOf[NumberScale]
  val AUTO = "AUTO".asInstanceOf[NumberScale]
  val THOUSANDS = "THOUSANDS".asInstanceOf[NumberScale]
  val MILLIONS = "MILLIONS".asInstanceOf[NumberScale]
  val BILLIONS = "BILLIONS".asInstanceOf[NumberScale]
  val TRILLIONS = "TRILLIONS".asInstanceOf[NumberScale]

  @inline def values: js.Array[NumberScale] = js.Array(NONE, AUTO, THOUSANDS, MILLIONS, BILLIONS, TRILLIONS)
}

@js.native
sealed trait NumericEqualityMatchOperator extends js.Any
object NumericEqualityMatchOperator {
  val EQUALS = "EQUALS".asInstanceOf[NumericEqualityMatchOperator]
  val DOES_NOT_EQUAL = "DOES_NOT_EQUAL".asInstanceOf[NumericEqualityMatchOperator]

  @inline def values: js.Array[NumericEqualityMatchOperator] = js.Array(EQUALS, DOES_NOT_EQUAL)
}

@js.native
sealed trait NumericFilterSelectAllOptions extends js.Any
object NumericFilterSelectAllOptions {
  val FILTER_ALL_VALUES = "FILTER_ALL_VALUES".asInstanceOf[NumericFilterSelectAllOptions]

  @inline def values: js.Array[NumericFilterSelectAllOptions] = js.Array(FILTER_ALL_VALUES)
}

@js.native
sealed trait NumericSeparatorSymbol extends js.Any
object NumericSeparatorSymbol {
  val COMMA = "COMMA".asInstanceOf[NumericSeparatorSymbol]
  val DOT = "DOT".asInstanceOf[NumericSeparatorSymbol]
  val SPACE = "SPACE".asInstanceOf[NumericSeparatorSymbol]

  @inline def values: js.Array[NumericSeparatorSymbol] = js.Array(COMMA, DOT, SPACE)
}

@js.native
sealed trait OtherCategories extends js.Any
object OtherCategories {
  val INCLUDE = "INCLUDE".asInstanceOf[OtherCategories]
  val EXCLUDE = "EXCLUDE".asInstanceOf[OtherCategories]

  @inline def values: js.Array[OtherCategories] = js.Array(INCLUDE, EXCLUDE)
}

@js.native
sealed trait PanelBorderStyle extends js.Any
object PanelBorderStyle {
  val SOLID = "SOLID".asInstanceOf[PanelBorderStyle]
  val DASHED = "DASHED".asInstanceOf[PanelBorderStyle]
  val DOTTED = "DOTTED".asInstanceOf[PanelBorderStyle]

  @inline def values: js.Array[PanelBorderStyle] = js.Array(SOLID, DASHED, DOTTED)
}

@js.native
sealed trait PaperOrientation extends js.Any
object PaperOrientation {
  val PORTRAIT = "PORTRAIT".asInstanceOf[PaperOrientation]
  val LANDSCAPE = "LANDSCAPE".asInstanceOf[PaperOrientation]

  @inline def values: js.Array[PaperOrientation] = js.Array(PORTRAIT, LANDSCAPE)
}

@js.native
sealed trait PaperSize extends js.Any
object PaperSize {
  val US_LETTER = "US_LETTER".asInstanceOf[PaperSize]
  val US_LEGAL = "US_LEGAL".asInstanceOf[PaperSize]
  val US_TABLOID_LEDGER = "US_TABLOID_LEDGER".asInstanceOf[PaperSize]
  val A0 = "A0".asInstanceOf[PaperSize]
  val A1 = "A1".asInstanceOf[PaperSize]
  val A2 = "A2".asInstanceOf[PaperSize]
  val A3 = "A3".asInstanceOf[PaperSize]
  val A4 = "A4".asInstanceOf[PaperSize]
  val A5 = "A5".asInstanceOf[PaperSize]
  val JIS_B4 = "JIS_B4".asInstanceOf[PaperSize]
  val JIS_B5 = "JIS_B5".asInstanceOf[PaperSize]

  @inline def values: js.Array[PaperSize] = js.Array(US_LETTER, US_LEGAL, US_TABLOID_LEDGER, A0, A1, A2, A3, A4, A5, JIS_B4, JIS_B5)
}

@js.native
sealed trait ParameterValueType extends js.Any
object ParameterValueType {
  val MULTI_VALUED = "MULTI_VALUED".asInstanceOf[ParameterValueType]
  val SINGLE_VALUED = "SINGLE_VALUED".asInstanceOf[ParameterValueType]

  @inline def values: js.Array[ParameterValueType] = js.Array(MULTI_VALUED, SINGLE_VALUED)
}

@js.native
sealed trait PivotTableConditionalFormattingScopeRole extends js.Any
object PivotTableConditionalFormattingScopeRole {
  val FIELD = "FIELD".asInstanceOf[PivotTableConditionalFormattingScopeRole]
  val FIELD_TOTAL = "FIELD_TOTAL".asInstanceOf[PivotTableConditionalFormattingScopeRole]
  val GRAND_TOTAL = "GRAND_TOTAL".asInstanceOf[PivotTableConditionalFormattingScopeRole]

  @inline def values: js.Array[PivotTableConditionalFormattingScopeRole] = js.Array(FIELD, FIELD_TOTAL, GRAND_TOTAL)
}

@js.native
sealed trait PivotTableMetricPlacement extends js.Any
object PivotTableMetricPlacement {
  val ROW = "ROW".asInstanceOf[PivotTableMetricPlacement]
  val COLUMN = "COLUMN".asInstanceOf[PivotTableMetricPlacement]

  @inline def values: js.Array[PivotTableMetricPlacement] = js.Array(ROW, COLUMN)
}

@js.native
sealed trait PivotTableSubtotalLevel extends js.Any
object PivotTableSubtotalLevel {
  val ALL = "ALL".asInstanceOf[PivotTableSubtotalLevel]
  val CUSTOM = "CUSTOM".asInstanceOf[PivotTableSubtotalLevel]
  val LAST = "LAST".asInstanceOf[PivotTableSubtotalLevel]

  @inline def values: js.Array[PivotTableSubtotalLevel] = js.Array(ALL, CUSTOM, LAST)
}

@js.native
sealed trait PrimaryValueDisplayType extends js.Any
object PrimaryValueDisplayType {
  val HIDDEN = "HIDDEN".asInstanceOf[PrimaryValueDisplayType]
  val COMPARISON = "COMPARISON".asInstanceOf[PrimaryValueDisplayType]
  val ACTUAL = "ACTUAL".asInstanceOf[PrimaryValueDisplayType]

  @inline def values: js.Array[PrimaryValueDisplayType] = js.Array(HIDDEN, COMPARISON, ACTUAL)
}

@js.native
sealed trait ReferenceLineLabelHorizontalPosition extends js.Any
object ReferenceLineLabelHorizontalPosition {
  val LEFT = "LEFT".asInstanceOf[ReferenceLineLabelHorizontalPosition]
  val CENTER = "CENTER".asInstanceOf[ReferenceLineLabelHorizontalPosition]
  val RIGHT = "RIGHT".asInstanceOf[ReferenceLineLabelHorizontalPosition]

  @inline def values: js.Array[ReferenceLineLabelHorizontalPosition] = js.Array(LEFT, CENTER, RIGHT)
}

@js.native
sealed trait ReferenceLineLabelVerticalPosition extends js.Any
object ReferenceLineLabelVerticalPosition {
  val ABOVE = "ABOVE".asInstanceOf[ReferenceLineLabelVerticalPosition]
  val BELOW = "BELOW".asInstanceOf[ReferenceLineLabelVerticalPosition]

  @inline def values: js.Array[ReferenceLineLabelVerticalPosition] = js.Array(ABOVE, BELOW)
}

@js.native
sealed trait ReferenceLinePatternType extends js.Any
object ReferenceLinePatternType {
  val SOLID = "SOLID".asInstanceOf[ReferenceLinePatternType]
  val DASHED = "DASHED".asInstanceOf[ReferenceLinePatternType]
  val DOTTED = "DOTTED".asInstanceOf[ReferenceLinePatternType]

  @inline def values: js.Array[ReferenceLinePatternType] = js.Array(SOLID, DASHED, DOTTED)
}

@js.native
sealed trait ReferenceLineValueLabelRelativePosition extends js.Any
object ReferenceLineValueLabelRelativePosition {
  val BEFORE_CUSTOM_LABEL = "BEFORE_CUSTOM_LABEL".asInstanceOf[ReferenceLineValueLabelRelativePosition]
  val AFTER_CUSTOM_LABEL = "AFTER_CUSTOM_LABEL".asInstanceOf[ReferenceLineValueLabelRelativePosition]

  @inline def values: js.Array[ReferenceLineValueLabelRelativePosition] = js.Array(BEFORE_CUSTOM_LABEL, AFTER_CUSTOM_LABEL)
}

@js.native
sealed trait RelativeDateType extends js.Any
object RelativeDateType {
  val PREVIOUS = "PREVIOUS".asInstanceOf[RelativeDateType]
  val THIS = "THIS".asInstanceOf[RelativeDateType]
  val LAST = "LAST".asInstanceOf[RelativeDateType]
  val NOW = "NOW".asInstanceOf[RelativeDateType]
  val NEXT = "NEXT".asInstanceOf[RelativeDateType]

  @inline def values: js.Array[RelativeDateType] = js.Array(PREVIOUS, THIS, LAST, NOW, NEXT)
}

@js.native
sealed trait RelativeFontSize extends js.Any
object RelativeFontSize {
  val EXTRA_SMALL = "EXTRA_SMALL".asInstanceOf[RelativeFontSize]
  val SMALL = "SMALL".asInstanceOf[RelativeFontSize]
  val MEDIUM = "MEDIUM".asInstanceOf[RelativeFontSize]
  val LARGE = "LARGE".asInstanceOf[RelativeFontSize]
  val EXTRA_LARGE = "EXTRA_LARGE".asInstanceOf[RelativeFontSize]

  @inline def values: js.Array[RelativeFontSize] = js.Array(EXTRA_SMALL, SMALL, MEDIUM, LARGE, EXTRA_LARGE)
}

@js.native
sealed trait ResizeOption extends js.Any
object ResizeOption {
  val FIXED = "FIXED".asInstanceOf[ResizeOption]
  val RESPONSIVE = "RESPONSIVE".asInstanceOf[ResizeOption]

  @inline def values: js.Array[ResizeOption] = js.Array(FIXED, RESPONSIVE)
}

@js.native
sealed trait ResourceStatus extends js.Any
object ResourceStatus {
  val CREATION_IN_PROGRESS = "CREATION_IN_PROGRESS".asInstanceOf[ResourceStatus]
  val CREATION_SUCCESSFUL = "CREATION_SUCCESSFUL".asInstanceOf[ResourceStatus]
  val CREATION_FAILED = "CREATION_FAILED".asInstanceOf[ResourceStatus]
  val UPDATE_IN_PROGRESS = "UPDATE_IN_PROGRESS".asInstanceOf[ResourceStatus]
  val UPDATE_SUCCESSFUL = "UPDATE_SUCCESSFUL".asInstanceOf[ResourceStatus]
  val UPDATE_FAILED = "UPDATE_FAILED".asInstanceOf[ResourceStatus]
  val DELETED = "DELETED".asInstanceOf[ResourceStatus]

  @inline def values: js.Array[ResourceStatus] = js.Array(CREATION_IN_PROGRESS, CREATION_SUCCESSFUL, CREATION_FAILED, UPDATE_IN_PROGRESS, UPDATE_SUCCESSFUL, UPDATE_FAILED, DELETED)
}

@js.native
sealed trait RowLevelPermissionFormatVersion extends js.Any
object RowLevelPermissionFormatVersion {
  val VERSION_1 = "VERSION_1".asInstanceOf[RowLevelPermissionFormatVersion]
  val VERSION_2 = "VERSION_2".asInstanceOf[RowLevelPermissionFormatVersion]

  @inline def values: js.Array[RowLevelPermissionFormatVersion] = js.Array(VERSION_1, VERSION_2)
}

@js.native
sealed trait RowLevelPermissionPolicy extends js.Any
object RowLevelPermissionPolicy {
  val GRANT_ACCESS = "GRANT_ACCESS".asInstanceOf[RowLevelPermissionPolicy]
  val DENY_ACCESS = "DENY_ACCESS".asInstanceOf[RowLevelPermissionPolicy]

  @inline def values: js.Array[RowLevelPermissionPolicy] = js.Array(GRANT_ACCESS, DENY_ACCESS)
}

@js.native
sealed trait SectionPageBreakStatus extends js.Any
object SectionPageBreakStatus {
  val ENABLED = "ENABLED".asInstanceOf[SectionPageBreakStatus]
  val DISABLED = "DISABLED".asInstanceOf[SectionPageBreakStatus]

  @inline def values: js.Array[SectionPageBreakStatus] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait SelectAllValueOptions extends js.Any
object SelectAllValueOptions {
  val ALL_VALUES = "ALL_VALUES".asInstanceOf[SelectAllValueOptions]

  @inline def values: js.Array[SelectAllValueOptions] = js.Array(ALL_VALUES)
}

@js.native
sealed trait SelectedFieldOptions extends js.Any
object SelectedFieldOptions {
  val ALL_FIELDS = "ALL_FIELDS".asInstanceOf[SelectedFieldOptions]

  @inline def values: js.Array[SelectedFieldOptions] = js.Array(ALL_FIELDS)
}

@js.native
sealed trait SelectedTooltipType extends js.Any
object SelectedTooltipType {
  val BASIC = "BASIC".asInstanceOf[SelectedTooltipType]
  val DETAILED = "DETAILED".asInstanceOf[SelectedTooltipType]

  @inline def values: js.Array[SelectedTooltipType] = js.Array(BASIC, DETAILED)
}

@js.native
sealed trait SheetContentType extends js.Any
object SheetContentType {
  val PAGINATED = "PAGINATED".asInstanceOf[SheetContentType]
  val INTERACTIVE = "INTERACTIVE".asInstanceOf[SheetContentType]

  @inline def values: js.Array[SheetContentType] = js.Array(PAGINATED, INTERACTIVE)
}

@js.native
sealed trait SheetControlDateTimePickerType extends js.Any
object SheetControlDateTimePickerType {
  val SINGLE_VALUED = "SINGLE_VALUED".asInstanceOf[SheetControlDateTimePickerType]
  val DATE_RANGE = "DATE_RANGE".asInstanceOf[SheetControlDateTimePickerType]

  @inline def values: js.Array[SheetControlDateTimePickerType] = js.Array(SINGLE_VALUED, DATE_RANGE)
}

@js.native
sealed trait SheetControlListType extends js.Any
object SheetControlListType {
  val MULTI_SELECT = "MULTI_SELECT".asInstanceOf[SheetControlListType]
  val SINGLE_SELECT = "SINGLE_SELECT".asInstanceOf[SheetControlListType]

  @inline def values: js.Array[SheetControlListType] = js.Array(MULTI_SELECT, SINGLE_SELECT)
}

@js.native
sealed trait SheetControlSliderType extends js.Any
object SheetControlSliderType {
  val SINGLE_POINT = "SINGLE_POINT".asInstanceOf[SheetControlSliderType]
  val RANGE = "RANGE".asInstanceOf[SheetControlSliderType]

  @inline def values: js.Array[SheetControlSliderType] = js.Array(SINGLE_POINT, RANGE)
}

@js.native
sealed trait SimpleNumericalAggregationFunction extends js.Any
object SimpleNumericalAggregationFunction {
  val SUM = "SUM".asInstanceOf[SimpleNumericalAggregationFunction]
  val AVERAGE = "AVERAGE".asInstanceOf[SimpleNumericalAggregationFunction]
  val MIN = "MIN".asInstanceOf[SimpleNumericalAggregationFunction]
  val MAX = "MAX".asInstanceOf[SimpleNumericalAggregationFunction]
  val COUNT = "COUNT".asInstanceOf[SimpleNumericalAggregationFunction]
  val DISTINCT_COUNT = "DISTINCT_COUNT".asInstanceOf[SimpleNumericalAggregationFunction]
  val VAR = "VAR".asInstanceOf[SimpleNumericalAggregationFunction]
  val VARP = "VARP".asInstanceOf[SimpleNumericalAggregationFunction]
  val STDEV = "STDEV".asInstanceOf[SimpleNumericalAggregationFunction]
  val STDEVP = "STDEVP".asInstanceOf[SimpleNumericalAggregationFunction]
  val MEDIAN = "MEDIAN".asInstanceOf[SimpleNumericalAggregationFunction]

  @inline def values: js.Array[SimpleNumericalAggregationFunction] = js.Array(SUM, AVERAGE, MIN, MAX, COUNT, DISTINCT_COUNT, VAR, VARP, STDEV, STDEVP, MEDIAN)
}

@js.native
sealed trait SortDirection extends js.Any
object SortDirection {
  val ASC = "ASC".asInstanceOf[SortDirection]
  val DESC = "DESC".asInstanceOf[SortDirection]

  @inline def values: js.Array[SortDirection] = js.Array(ASC, DESC)
}

@js.native
sealed trait Status extends js.Any
object Status {
  val ENABLED = "ENABLED".asInstanceOf[Status]
  val DISABLED = "DISABLED".asInstanceOf[Status]

  @inline def values: js.Array[Status] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait TableBorderStyle extends js.Any
object TableBorderStyle {
  val NONE = "NONE".asInstanceOf[TableBorderStyle]
  val SOLID = "SOLID".asInstanceOf[TableBorderStyle]

  @inline def values: js.Array[TableBorderStyle] = js.Array(NONE, SOLID)
}

@js.native
sealed trait TableCellImageScalingConfiguration extends js.Any
object TableCellImageScalingConfiguration {
  val FIT_TO_CELL_HEIGHT = "FIT_TO_CELL_HEIGHT".asInstanceOf[TableCellImageScalingConfiguration]
  val FIT_TO_CELL_WIDTH = "FIT_TO_CELL_WIDTH".asInstanceOf[TableCellImageScalingConfiguration]
  val DO_NOT_SCALE = "DO_NOT_SCALE".asInstanceOf[TableCellImageScalingConfiguration]

  @inline def values: js.Array[TableCellImageScalingConfiguration] = js.Array(FIT_TO_CELL_HEIGHT, FIT_TO_CELL_WIDTH, DO_NOT_SCALE)
}

@js.native
sealed trait TableFieldIconSetType extends js.Any
object TableFieldIconSetType {
  val LINK = "LINK".asInstanceOf[TableFieldIconSetType]

  @inline def values: js.Array[TableFieldIconSetType] = js.Array(LINK)
}

@js.native
sealed trait TableOrientation extends js.Any
object TableOrientation {
  val VERTICAL = "VERTICAL".asInstanceOf[TableOrientation]
  val HORIZONTAL = "HORIZONTAL".asInstanceOf[TableOrientation]

  @inline def values: js.Array[TableOrientation] = js.Array(VERTICAL, HORIZONTAL)
}

@js.native
sealed trait TableTotalsPlacement extends js.Any
object TableTotalsPlacement {
  val START = "START".asInstanceOf[TableTotalsPlacement]
  val END = "END".asInstanceOf[TableTotalsPlacement]

  @inline def values: js.Array[TableTotalsPlacement] = js.Array(START, END)
}

@js.native
sealed trait TableTotalsScrollStatus extends js.Any
object TableTotalsScrollStatus {
  val PINNED = "PINNED".asInstanceOf[TableTotalsScrollStatus]
  val SCROLLED = "SCROLLED".asInstanceOf[TableTotalsScrollStatus]

  @inline def values: js.Array[TableTotalsScrollStatus] = js.Array(PINNED, SCROLLED)
}

@js.native
sealed trait TargetVisualOptions extends js.Any
object TargetVisualOptions {
  val ALL_VISUALS = "ALL_VISUALS".asInstanceOf[TargetVisualOptions]

  @inline def values: js.Array[TargetVisualOptions] = js.Array(ALL_VISUALS)
}

@js.native
sealed trait TemplateErrorType extends js.Any
object TemplateErrorType {
  val SOURCE_NOT_FOUND = "SOURCE_NOT_FOUND".asInstanceOf[TemplateErrorType]
  val DATA_SET_NOT_FOUND = "DATA_SET_NOT_FOUND".asInstanceOf[TemplateErrorType]
  val INTERNAL_FAILURE = "INTERNAL_FAILURE".asInstanceOf[TemplateErrorType]
  val ACCESS_DENIED = "ACCESS_DENIED".asInstanceOf[TemplateErrorType]

  @inline def values: js.Array[TemplateErrorType] = js.Array(SOURCE_NOT_FOUND, DATA_SET_NOT_FOUND, INTERNAL_FAILURE, ACCESS_DENIED)
}

@js.native
sealed trait TextQualifier extends js.Any
object TextQualifier {
  val DOUBLE_QUOTE = "DOUBLE_QUOTE".asInstanceOf[TextQualifier]
  val SINGLE_QUOTE = "SINGLE_QUOTE".asInstanceOf[TextQualifier]

  @inline def values: js.Array[TextQualifier] = js.Array(DOUBLE_QUOTE, SINGLE_QUOTE)
}

@js.native
sealed trait TextWrap extends js.Any
object TextWrap {
  val NONE = "NONE".asInstanceOf[TextWrap]
  val WRAP = "WRAP".asInstanceOf[TextWrap]

  @inline def values: js.Array[TextWrap] = js.Array(NONE, WRAP)
}

@js.native
sealed trait ThemeErrorType extends js.Any
object ThemeErrorType {
  val INTERNAL_FAILURE = "INTERNAL_FAILURE".asInstanceOf[ThemeErrorType]

  @inline def values: js.Array[ThemeErrorType] = js.Array(INTERNAL_FAILURE)
}

@js.native
sealed trait ThemeType extends js.Any
object ThemeType {
  val QUICKSIGHT = "QUICKSIGHT".asInstanceOf[ThemeType]
  val CUSTOM = "CUSTOM".asInstanceOf[ThemeType]
  val ALL = "ALL".asInstanceOf[ThemeType]

  @inline def values: js.Array[ThemeType] = js.Array(QUICKSIGHT, CUSTOM, ALL)
}

@js.native
sealed trait TimeGranularity extends js.Any
object TimeGranularity {
  val YEAR = "YEAR".asInstanceOf[TimeGranularity]
  val QUARTER = "QUARTER".asInstanceOf[TimeGranularity]
  val MONTH = "MONTH".asInstanceOf[TimeGranularity]
  val WEEK = "WEEK".asInstanceOf[TimeGranularity]
  val DAY = "DAY".asInstanceOf[TimeGranularity]
  val HOUR = "HOUR".asInstanceOf[TimeGranularity]
  val MINUTE = "MINUTE".asInstanceOf[TimeGranularity]
  val SECOND = "SECOND".asInstanceOf[TimeGranularity]
  val MILLISECOND = "MILLISECOND".asInstanceOf[TimeGranularity]

  @inline def values: js.Array[TimeGranularity] = js.Array(YEAR, QUARTER, MONTH, WEEK, DAY, HOUR, MINUTE, SECOND, MILLISECOND)
}

@js.native
sealed trait TooltipTitleType extends js.Any
object TooltipTitleType {
  val NONE = "NONE".asInstanceOf[TooltipTitleType]
  val PRIMARY_VALUE = "PRIMARY_VALUE".asInstanceOf[TooltipTitleType]

  @inline def values: js.Array[TooltipTitleType] = js.Array(NONE, PRIMARY_VALUE)
}

@js.native
sealed trait TopBottomComputationType extends js.Any
object TopBottomComputationType {
  val TOP = "TOP".asInstanceOf[TopBottomComputationType]
  val BOTTOM = "BOTTOM".asInstanceOf[TopBottomComputationType]

  @inline def values: js.Array[TopBottomComputationType] = js.Array(TOP, BOTTOM)
}

@js.native
sealed trait TopBottomSortOrder extends js.Any
object TopBottomSortOrder {
  val PERCENT_DIFFERENCE = "PERCENT_DIFFERENCE".asInstanceOf[TopBottomSortOrder]
  val ABSOLUTE_DIFFERENCE = "ABSOLUTE_DIFFERENCE".asInstanceOf[TopBottomSortOrder]

  @inline def values: js.Array[TopBottomSortOrder] = js.Array(PERCENT_DIFFERENCE, ABSOLUTE_DIFFERENCE)
}

@js.native
sealed trait URLTargetConfiguration extends js.Any
object URLTargetConfiguration {
  val NEW_TAB = "NEW_TAB".asInstanceOf[URLTargetConfiguration]
  val NEW_WINDOW = "NEW_WINDOW".asInstanceOf[URLTargetConfiguration]
  val SAME_TAB = "SAME_TAB".asInstanceOf[URLTargetConfiguration]

  @inline def values: js.Array[URLTargetConfiguration] = js.Array(NEW_TAB, NEW_WINDOW, SAME_TAB)
}

@js.native
sealed trait UserRole extends js.Any
object UserRole {
  val ADMIN = "ADMIN".asInstanceOf[UserRole]
  val AUTHOR = "AUTHOR".asInstanceOf[UserRole]
  val READER = "READER".asInstanceOf[UserRole]
  val RESTRICTED_AUTHOR = "RESTRICTED_AUTHOR".asInstanceOf[UserRole]
  val RESTRICTED_READER = "RESTRICTED_READER".asInstanceOf[UserRole]

  @inline def values: js.Array[UserRole] = js.Array(ADMIN, AUTHOR, READER, RESTRICTED_AUTHOR, RESTRICTED_READER)
}

@js.native
sealed trait ValueWhenUnsetOption extends js.Any
object ValueWhenUnsetOption {
  val RECOMMENDED_VALUE = "RECOMMENDED_VALUE".asInstanceOf[ValueWhenUnsetOption]
  val NULL = "NULL".asInstanceOf[ValueWhenUnsetOption]

  @inline def values: js.Array[ValueWhenUnsetOption] = js.Array(RECOMMENDED_VALUE, NULL)
}

@js.native
sealed trait VerticalTextAlignment extends js.Any
object VerticalTextAlignment {
  val TOP = "TOP".asInstanceOf[VerticalTextAlignment]
  val MIDDLE = "MIDDLE".asInstanceOf[VerticalTextAlignment]
  val BOTTOM = "BOTTOM".asInstanceOf[VerticalTextAlignment]

  @inline def values: js.Array[VerticalTextAlignment] = js.Array(TOP, MIDDLE, BOTTOM)
}

@js.native
sealed trait Visibility extends js.Any
object Visibility {
  val HIDDEN = "HIDDEN".asInstanceOf[Visibility]
  val VISIBLE = "VISIBLE".asInstanceOf[Visibility]

  @inline def values: js.Array[Visibility] = js.Array(HIDDEN, VISIBLE)
}

@js.native
sealed trait VisualCustomActionTrigger extends js.Any
object VisualCustomActionTrigger {
  val DATA_POINT_CLICK = "DATA_POINT_CLICK".asInstanceOf[VisualCustomActionTrigger]
  val DATA_POINT_MENU = "DATA_POINT_MENU".asInstanceOf[VisualCustomActionTrigger]

  @inline def values: js.Array[VisualCustomActionTrigger] = js.Array(DATA_POINT_CLICK, DATA_POINT_MENU)
}

@js.native
sealed trait WidgetStatus extends js.Any
object WidgetStatus {
  val ENABLED = "ENABLED".asInstanceOf[WidgetStatus]
  val DISABLED = "DISABLED".asInstanceOf[WidgetStatus]

  @inline def values: js.Array[WidgetStatus] = js.Array(ENABLED, DISABLED)
}

@js.native
sealed trait WordCloudCloudLayout extends js.Any
object WordCloudCloudLayout {
  val FLUID = "FLUID".asInstanceOf[WordCloudCloudLayout]
  val NORMAL = "NORMAL".asInstanceOf[WordCloudCloudLayout]

  @inline def values: js.Array[WordCloudCloudLayout] = js.Array(FLUID, NORMAL)
}

@js.native
sealed trait WordCloudWordCasing extends js.Any
object WordCloudWordCasing {
  val LOWER_CASE = "LOWER_CASE".asInstanceOf[WordCloudWordCasing]
  val EXISTING_CASE = "EXISTING_CASE".asInstanceOf[WordCloudWordCasing]

  @inline def values: js.Array[WordCloudWordCasing] = js.Array(LOWER_CASE, EXISTING_CASE)
}

@js.native
sealed trait WordCloudWordOrientation extends js.Any
object WordCloudWordOrientation {
  val HORIZONTAL = "HORIZONTAL".asInstanceOf[WordCloudWordOrientation]
  val HORIZONTAL_AND_VERTICAL = "HORIZONTAL_AND_VERTICAL".asInstanceOf[WordCloudWordOrientation]

  @inline def values: js.Array[WordCloudWordOrientation] = js.Array(HORIZONTAL, HORIZONTAL_AND_VERTICAL)
}

@js.native
sealed trait WordCloudWordPadding extends js.Any
object WordCloudWordPadding {
  val NONE = "NONE".asInstanceOf[WordCloudWordPadding]
  val SMALL = "SMALL".asInstanceOf[WordCloudWordPadding]
  val MEDIUM = "MEDIUM".asInstanceOf[WordCloudWordPadding]
  val LARGE = "LARGE".asInstanceOf[WordCloudWordPadding]

  @inline def values: js.Array[WordCloudWordPadding] = js.Array(NONE, SMALL, MEDIUM, LARGE)
}

@js.native
sealed trait WordCloudWordScaling extends js.Any
object WordCloudWordScaling {
  val EMPHASIZE = "EMPHASIZE".asInstanceOf[WordCloudWordScaling]
  val NORMAL = "NORMAL".asInstanceOf[WordCloudWordScaling]

  @inline def values: js.Array[WordCloudWordScaling] = js.Array(EMPHASIZE, NORMAL)
}
