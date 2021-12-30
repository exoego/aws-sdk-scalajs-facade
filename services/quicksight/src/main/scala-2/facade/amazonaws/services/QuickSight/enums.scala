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

  @inline def values: js.Array[AnalysisFilterAttribute] = js.Array(QUICKSIGHT_USER)
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
sealed trait ColumnDataType extends js.Any
object ColumnDataType {
  val STRING = "STRING".asInstanceOf[ColumnDataType]
  val INTEGER = "INTEGER".asInstanceOf[ColumnDataType]
  val DECIMAL = "DECIMAL".asInstanceOf[ColumnDataType]
  val DATETIME = "DATETIME".asInstanceOf[ColumnDataType]

  @inline def values: js.Array[ColumnDataType] = js.Array(STRING, INTEGER, DECIMAL, DATETIME)
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

  @inline def values: js.Array[DashboardFilterAttribute] = js.Array(QUICKSIGHT_USER)
}

@js.native
sealed trait DashboardUIState extends js.Any
object DashboardUIState {
  val EXPANDED = "EXPANDED".asInstanceOf[DashboardUIState]
  val COLLAPSED = "COLLAPSED".asInstanceOf[DashboardUIState]

  @inline def values: js.Array[DashboardUIState] = js.Array(EXPANDED, COLLAPSED)
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
    TIMESTREAM
  )
}

@js.native
sealed trait Edition extends js.Any
object Edition {
  val STANDARD = "STANDARD".asInstanceOf[Edition]
  val ENTERPRISE = "ENTERPRISE".asInstanceOf[Edition]

  @inline def values: js.Array[Edition] = js.Array(STANDARD, ENTERPRISE)
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
sealed trait FilterOperator extends js.Any
object FilterOperator {
  val StringEquals = "StringEquals".asInstanceOf[FilterOperator]

  @inline def values: js.Array[FilterOperator] = js.Array(StringEquals)
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
    INTERNAL_SERVICE_ERROR
  )
}

@js.native
sealed trait IngestionRequestSource extends js.Any
object IngestionRequestSource {
  val MANUAL = "MANUAL".asInstanceOf[IngestionRequestSource]
  val SCHEDULED = "SCHEDULED".asInstanceOf[IngestionRequestSource]

  @inline def values: js.Array[IngestionRequestSource] = js.Array(MANUAL, SCHEDULED)
}

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
sealed trait RowLevelPermissionPolicy extends js.Any
object RowLevelPermissionPolicy {
  val GRANT_ACCESS = "GRANT_ACCESS".asInstanceOf[RowLevelPermissionPolicy]
  val DENY_ACCESS = "DENY_ACCESS".asInstanceOf[RowLevelPermissionPolicy]

  @inline def values: js.Array[RowLevelPermissionPolicy] = js.Array(GRANT_ACCESS, DENY_ACCESS)
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
sealed trait UserRole extends js.Any
object UserRole {
  val ADMIN = "ADMIN".asInstanceOf[UserRole]
  val AUTHOR = "AUTHOR".asInstanceOf[UserRole]
  val READER = "READER".asInstanceOf[UserRole]
  val RESTRICTED_AUTHOR = "RESTRICTED_AUTHOR".asInstanceOf[UserRole]
  val RESTRICTED_READER = "RESTRICTED_READER".asInstanceOf[UserRole]

  @inline def values: js.Array[UserRole] = js.Array(ADMIN, AUTHOR, READER, RESTRICTED_AUTHOR, RESTRICTED_READER)
}
