package facade.amazonaws.services.appflow

import scalajs.js

type AggregationType = "None" | "SingleFile"
object AggregationType {
  inline val None: "None" = "None"
  inline val SingleFile: "SingleFile" = "SingleFile"

  inline def values: js.Array[AggregationType] = js.Array(None, SingleFile)
}

type AmplitudeConnectorOperator = "BETWEEN"
object AmplitudeConnectorOperator {
  inline val BETWEEN: "BETWEEN" = "BETWEEN"

  inline def values: js.Array[AmplitudeConnectorOperator] = js.Array(BETWEEN)
}

type AuthenticationType = "OAUTH2" | "APIKEY" | "BASIC" | "CUSTOM"
object AuthenticationType {
  inline val OAUTH2: "OAUTH2" = "OAUTH2"
  inline val APIKEY: "APIKEY" = "APIKEY"
  inline val BASIC: "BASIC" = "BASIC"
  inline val CUSTOM: "CUSTOM" = "CUSTOM"

  inline def values: js.Array[AuthenticationType] = js.Array(OAUTH2, APIKEY, BASIC, CUSTOM)
}

type CatalogType = "GLUE"
object CatalogType {
  inline val GLUE: "GLUE" = "GLUE"

  inline def values: js.Array[CatalogType] = js.Array(GLUE)
}

type ConnectionMode = "Public" | "Private"
object ConnectionMode {
  inline val Public: "Public" = "Public"
  inline val Private: "Private" = "Private"

  inline def values: js.Array[ConnectionMode] = js.Array(Public, Private)
}

/** The type of provisioning that the connector supports, such as Lambda.
  */
type ConnectorProvisioningType = "LAMBDA"
object ConnectorProvisioningType {
  inline val LAMBDA: "LAMBDA" = "LAMBDA"

  inline def values: js.Array[ConnectorProvisioningType] = js.Array(LAMBDA)
}

type ConnectorType = "Salesforce" | "Singular" | "Slack" | "Redshift" | "S3" | "Marketo" | "Googleanalytics" | "Zendesk" | "Servicenow" | "Datadog" | "Trendmicro" | "Snowflake" | "Dynatrace" | "Infornexus" | "Amplitude" | "Veeva" | "EventBridge" | "LookoutMetrics" | "Upsolver" | "Honeycode" | "CustomerProfiles" | "SAPOData" | "CustomConnector"
object ConnectorType {
  inline val Salesforce: "Salesforce" = "Salesforce"
  inline val Singular: "Singular" = "Singular"
  inline val Slack: "Slack" = "Slack"
  inline val Redshift: "Redshift" = "Redshift"
  inline val S3: "S3" = "S3"
  inline val Marketo: "Marketo" = "Marketo"
  inline val Googleanalytics: "Googleanalytics" = "Googleanalytics"
  inline val Zendesk: "Zendesk" = "Zendesk"
  inline val Servicenow: "Servicenow" = "Servicenow"
  inline val Datadog: "Datadog" = "Datadog"
  inline val Trendmicro: "Trendmicro" = "Trendmicro"
  inline val Snowflake: "Snowflake" = "Snowflake"
  inline val Dynatrace: "Dynatrace" = "Dynatrace"
  inline val Infornexus: "Infornexus" = "Infornexus"
  inline val Amplitude: "Amplitude" = "Amplitude"
  inline val Veeva: "Veeva" = "Veeva"
  inline val EventBridge: "EventBridge" = "EventBridge"
  inline val LookoutMetrics: "LookoutMetrics" = "LookoutMetrics"
  inline val Upsolver: "Upsolver" = "Upsolver"
  inline val Honeycode: "Honeycode" = "Honeycode"
  inline val CustomerProfiles: "CustomerProfiles" = "CustomerProfiles"
  inline val SAPOData: "SAPOData" = "SAPOData"
  inline val CustomConnector: "CustomConnector" = "CustomConnector"

  inline def values: js.Array[ConnectorType] = js.Array(
    Salesforce,
    Singular,
    Slack,
    Redshift,
    S3,
    Marketo,
    Googleanalytics,
    Zendesk,
    Servicenow,
    Datadog,
    Trendmicro,
    Snowflake,
    Dynatrace,
    Infornexus,
    Amplitude,
    Veeva,
    EventBridge,
    LookoutMetrics,
    Upsolver,
    Honeycode,
    CustomerProfiles,
    SAPOData,
    CustomConnector
  )
}

type DataPullMode = "Incremental" | "Complete"
object DataPullMode {
  inline val Incremental: "Incremental" = "Incremental"
  inline val Complete: "Complete" = "Complete"

  inline def values: js.Array[DataPullMode] = js.Array(Incremental, Complete)
}

type DatadogConnectorOperator = "PROJECTION" | "BETWEEN" | "EQUAL_TO" | "ADDITION" | "MULTIPLICATION" | "DIVISION" | "SUBTRACTION" | "MASK_ALL" | "MASK_FIRST_N" | "MASK_LAST_N" | "VALIDATE_NON_NULL" | "VALIDATE_NON_ZERO" | "VALIDATE_NON_NEGATIVE" | "VALIDATE_NUMERIC" | "NO_OP"
object DatadogConnectorOperator {
  inline val PROJECTION: "PROJECTION" = "PROJECTION"
  inline val BETWEEN: "BETWEEN" = "BETWEEN"
  inline val EQUAL_TO: "EQUAL_TO" = "EQUAL_TO"
  inline val ADDITION: "ADDITION" = "ADDITION"
  inline val MULTIPLICATION: "MULTIPLICATION" = "MULTIPLICATION"
  inline val DIVISION: "DIVISION" = "DIVISION"
  inline val SUBTRACTION: "SUBTRACTION" = "SUBTRACTION"
  inline val MASK_ALL: "MASK_ALL" = "MASK_ALL"
  inline val MASK_FIRST_N: "MASK_FIRST_N" = "MASK_FIRST_N"
  inline val MASK_LAST_N: "MASK_LAST_N" = "MASK_LAST_N"
  inline val VALIDATE_NON_NULL: "VALIDATE_NON_NULL" = "VALIDATE_NON_NULL"
  inline val VALIDATE_NON_ZERO: "VALIDATE_NON_ZERO" = "VALIDATE_NON_ZERO"
  inline val VALIDATE_NON_NEGATIVE: "VALIDATE_NON_NEGATIVE" = "VALIDATE_NON_NEGATIVE"
  inline val VALIDATE_NUMERIC: "VALIDATE_NUMERIC" = "VALIDATE_NUMERIC"
  inline val NO_OP: "NO_OP" = "NO_OP"

  inline def values: js.Array[DatadogConnectorOperator] = js.Array(
    PROJECTION,
    BETWEEN,
    EQUAL_TO,
    ADDITION,
    MULTIPLICATION,
    DIVISION,
    SUBTRACTION,
    MASK_ALL,
    MASK_FIRST_N,
    MASK_LAST_N,
    VALIDATE_NON_NULL,
    VALIDATE_NON_ZERO,
    VALIDATE_NON_NEGATIVE,
    VALIDATE_NUMERIC,
    NO_OP
  )
}

type DynatraceConnectorOperator = "PROJECTION" | "BETWEEN" | "EQUAL_TO" | "ADDITION" | "MULTIPLICATION" | "DIVISION" | "SUBTRACTION" | "MASK_ALL" | "MASK_FIRST_N" | "MASK_LAST_N" | "VALIDATE_NON_NULL" | "VALIDATE_NON_ZERO" | "VALIDATE_NON_NEGATIVE" | "VALIDATE_NUMERIC" | "NO_OP"
object DynatraceConnectorOperator {
  inline val PROJECTION: "PROJECTION" = "PROJECTION"
  inline val BETWEEN: "BETWEEN" = "BETWEEN"
  inline val EQUAL_TO: "EQUAL_TO" = "EQUAL_TO"
  inline val ADDITION: "ADDITION" = "ADDITION"
  inline val MULTIPLICATION: "MULTIPLICATION" = "MULTIPLICATION"
  inline val DIVISION: "DIVISION" = "DIVISION"
  inline val SUBTRACTION: "SUBTRACTION" = "SUBTRACTION"
  inline val MASK_ALL: "MASK_ALL" = "MASK_ALL"
  inline val MASK_FIRST_N: "MASK_FIRST_N" = "MASK_FIRST_N"
  inline val MASK_LAST_N: "MASK_LAST_N" = "MASK_LAST_N"
  inline val VALIDATE_NON_NULL: "VALIDATE_NON_NULL" = "VALIDATE_NON_NULL"
  inline val VALIDATE_NON_ZERO: "VALIDATE_NON_ZERO" = "VALIDATE_NON_ZERO"
  inline val VALIDATE_NON_NEGATIVE: "VALIDATE_NON_NEGATIVE" = "VALIDATE_NON_NEGATIVE"
  inline val VALIDATE_NUMERIC: "VALIDATE_NUMERIC" = "VALIDATE_NUMERIC"
  inline val NO_OP: "NO_OP" = "NO_OP"

  inline def values: js.Array[DynatraceConnectorOperator] = js.Array(
    PROJECTION,
    BETWEEN,
    EQUAL_TO,
    ADDITION,
    MULTIPLICATION,
    DIVISION,
    SUBTRACTION,
    MASK_ALL,
    MASK_FIRST_N,
    MASK_LAST_N,
    VALIDATE_NON_NULL,
    VALIDATE_NON_ZERO,
    VALIDATE_NON_NEGATIVE,
    VALIDATE_NUMERIC,
    NO_OP
  )
}

type ExecutionStatus = "InProgress" | "Successful" | "Error"
object ExecutionStatus {
  inline val InProgress: "InProgress" = "InProgress"
  inline val Successful: "Successful" = "Successful"
  inline val Error: "Error" = "Error"

  inline def values: js.Array[ExecutionStatus] = js.Array(InProgress, Successful, Error)
}

type FileType = "CSV" | "JSON" | "PARQUET"
object FileType {
  inline val CSV: "CSV" = "CSV"
  inline val JSON: "JSON" = "JSON"
  inline val PARQUET: "PARQUET" = "PARQUET"

  inline def values: js.Array[FileType] = js.Array(CSV, JSON, PARQUET)
}

type FlowStatus = "Active" | "Deprecated" | "Deleted" | "Draft" | "Errored" | "Suspended"
object FlowStatus {
  inline val Active: "Active" = "Active"
  inline val Deprecated: "Deprecated" = "Deprecated"
  inline val Deleted: "Deleted" = "Deleted"
  inline val Draft: "Draft" = "Draft"
  inline val Errored: "Errored" = "Errored"
  inline val Suspended: "Suspended" = "Suspended"

  inline def values: js.Array[FlowStatus] = js.Array(Active, Deprecated, Deleted, Draft, Errored, Suspended)
}

type GoogleAnalyticsConnectorOperator = "PROJECTION" | "BETWEEN"
object GoogleAnalyticsConnectorOperator {
  inline val PROJECTION: "PROJECTION" = "PROJECTION"
  inline val BETWEEN: "BETWEEN" = "BETWEEN"

  inline def values: js.Array[GoogleAnalyticsConnectorOperator] = js.Array(PROJECTION, BETWEEN)
}

type InforNexusConnectorOperator = "PROJECTION" | "BETWEEN" | "EQUAL_TO" | "ADDITION" | "MULTIPLICATION" | "DIVISION" | "SUBTRACTION" | "MASK_ALL" | "MASK_FIRST_N" | "MASK_LAST_N" | "VALIDATE_NON_NULL" | "VALIDATE_NON_ZERO" | "VALIDATE_NON_NEGATIVE" | "VALIDATE_NUMERIC" | "NO_OP"
object InforNexusConnectorOperator {
  inline val PROJECTION: "PROJECTION" = "PROJECTION"
  inline val BETWEEN: "BETWEEN" = "BETWEEN"
  inline val EQUAL_TO: "EQUAL_TO" = "EQUAL_TO"
  inline val ADDITION: "ADDITION" = "ADDITION"
  inline val MULTIPLICATION: "MULTIPLICATION" = "MULTIPLICATION"
  inline val DIVISION: "DIVISION" = "DIVISION"
  inline val SUBTRACTION: "SUBTRACTION" = "SUBTRACTION"
  inline val MASK_ALL: "MASK_ALL" = "MASK_ALL"
  inline val MASK_FIRST_N: "MASK_FIRST_N" = "MASK_FIRST_N"
  inline val MASK_LAST_N: "MASK_LAST_N" = "MASK_LAST_N"
  inline val VALIDATE_NON_NULL: "VALIDATE_NON_NULL" = "VALIDATE_NON_NULL"
  inline val VALIDATE_NON_ZERO: "VALIDATE_NON_ZERO" = "VALIDATE_NON_ZERO"
  inline val VALIDATE_NON_NEGATIVE: "VALIDATE_NON_NEGATIVE" = "VALIDATE_NON_NEGATIVE"
  inline val VALIDATE_NUMERIC: "VALIDATE_NUMERIC" = "VALIDATE_NUMERIC"
  inline val NO_OP: "NO_OP" = "NO_OP"

  inline def values: js.Array[InforNexusConnectorOperator] = js.Array(
    PROJECTION,
    BETWEEN,
    EQUAL_TO,
    ADDITION,
    MULTIPLICATION,
    DIVISION,
    SUBTRACTION,
    MASK_ALL,
    MASK_FIRST_N,
    MASK_LAST_N,
    VALIDATE_NON_NULL,
    VALIDATE_NON_ZERO,
    VALIDATE_NON_NEGATIVE,
    VALIDATE_NUMERIC,
    NO_OP
  )
}

type MarketoConnectorOperator = "PROJECTION" | "LESS_THAN" | "GREATER_THAN" | "BETWEEN" | "ADDITION" | "MULTIPLICATION" | "DIVISION" | "SUBTRACTION" | "MASK_ALL" | "MASK_FIRST_N" | "MASK_LAST_N" | "VALIDATE_NON_NULL" | "VALIDATE_NON_ZERO" | "VALIDATE_NON_NEGATIVE" | "VALIDATE_NUMERIC" | "NO_OP"
object MarketoConnectorOperator {
  inline val PROJECTION: "PROJECTION" = "PROJECTION"
  inline val LESS_THAN: "LESS_THAN" = "LESS_THAN"
  inline val GREATER_THAN: "GREATER_THAN" = "GREATER_THAN"
  inline val BETWEEN: "BETWEEN" = "BETWEEN"
  inline val ADDITION: "ADDITION" = "ADDITION"
  inline val MULTIPLICATION: "MULTIPLICATION" = "MULTIPLICATION"
  inline val DIVISION: "DIVISION" = "DIVISION"
  inline val SUBTRACTION: "SUBTRACTION" = "SUBTRACTION"
  inline val MASK_ALL: "MASK_ALL" = "MASK_ALL"
  inline val MASK_FIRST_N: "MASK_FIRST_N" = "MASK_FIRST_N"
  inline val MASK_LAST_N: "MASK_LAST_N" = "MASK_LAST_N"
  inline val VALIDATE_NON_NULL: "VALIDATE_NON_NULL" = "VALIDATE_NON_NULL"
  inline val VALIDATE_NON_ZERO: "VALIDATE_NON_ZERO" = "VALIDATE_NON_ZERO"
  inline val VALIDATE_NON_NEGATIVE: "VALIDATE_NON_NEGATIVE" = "VALIDATE_NON_NEGATIVE"
  inline val VALIDATE_NUMERIC: "VALIDATE_NUMERIC" = "VALIDATE_NUMERIC"
  inline val NO_OP: "NO_OP" = "NO_OP"

  inline def values: js.Array[MarketoConnectorOperator] = js.Array(
    PROJECTION,
    LESS_THAN,
    GREATER_THAN,
    BETWEEN,
    ADDITION,
    MULTIPLICATION,
    DIVISION,
    SUBTRACTION,
    MASK_ALL,
    MASK_FIRST_N,
    MASK_LAST_N,
    VALIDATE_NON_NULL,
    VALIDATE_NON_ZERO,
    VALIDATE_NON_NEGATIVE,
    VALIDATE_NUMERIC,
    NO_OP
  )
}

type OAuth2CustomPropType = "TOKEN_URL" | "AUTH_URL"
object OAuth2CustomPropType {
  inline val TOKEN_URL: "TOKEN_URL" = "TOKEN_URL"
  inline val AUTH_URL: "AUTH_URL" = "AUTH_URL"

  inline def values: js.Array[OAuth2CustomPropType] = js.Array(TOKEN_URL, AUTH_URL)
}

type OAuth2GrantType = "CLIENT_CREDENTIALS" | "AUTHORIZATION_CODE"
object OAuth2GrantType {
  inline val CLIENT_CREDENTIALS: "CLIENT_CREDENTIALS" = "CLIENT_CREDENTIALS"
  inline val AUTHORIZATION_CODE: "AUTHORIZATION_CODE" = "AUTHORIZATION_CODE"

  inline def values: js.Array[OAuth2GrantType] = js.Array(CLIENT_CREDENTIALS, AUTHORIZATION_CODE)
}

type Operator = "PROJECTION" | "LESS_THAN" | "GREATER_THAN" | "CONTAINS" | "BETWEEN" | "LESS_THAN_OR_EQUAL_TO" | "GREATER_THAN_OR_EQUAL_TO" | "EQUAL_TO" | "NOT_EQUAL_TO" | "ADDITION" | "MULTIPLICATION" | "DIVISION" | "SUBTRACTION" | "MASK_ALL" | "MASK_FIRST_N" | "MASK_LAST_N" | "VALIDATE_NON_NULL" | "VALIDATE_NON_ZERO" | "VALIDATE_NON_NEGATIVE" | "VALIDATE_NUMERIC" | "NO_OP"
object Operator {
  inline val PROJECTION: "PROJECTION" = "PROJECTION"
  inline val LESS_THAN: "LESS_THAN" = "LESS_THAN"
  inline val GREATER_THAN: "GREATER_THAN" = "GREATER_THAN"
  inline val CONTAINS: "CONTAINS" = "CONTAINS"
  inline val BETWEEN: "BETWEEN" = "BETWEEN"
  inline val LESS_THAN_OR_EQUAL_TO: "LESS_THAN_OR_EQUAL_TO" = "LESS_THAN_OR_EQUAL_TO"
  inline val GREATER_THAN_OR_EQUAL_TO: "GREATER_THAN_OR_EQUAL_TO" = "GREATER_THAN_OR_EQUAL_TO"
  inline val EQUAL_TO: "EQUAL_TO" = "EQUAL_TO"
  inline val NOT_EQUAL_TO: "NOT_EQUAL_TO" = "NOT_EQUAL_TO"
  inline val ADDITION: "ADDITION" = "ADDITION"
  inline val MULTIPLICATION: "MULTIPLICATION" = "MULTIPLICATION"
  inline val DIVISION: "DIVISION" = "DIVISION"
  inline val SUBTRACTION: "SUBTRACTION" = "SUBTRACTION"
  inline val MASK_ALL: "MASK_ALL" = "MASK_ALL"
  inline val MASK_FIRST_N: "MASK_FIRST_N" = "MASK_FIRST_N"
  inline val MASK_LAST_N: "MASK_LAST_N" = "MASK_LAST_N"
  inline val VALIDATE_NON_NULL: "VALIDATE_NON_NULL" = "VALIDATE_NON_NULL"
  inline val VALIDATE_NON_ZERO: "VALIDATE_NON_ZERO" = "VALIDATE_NON_ZERO"
  inline val VALIDATE_NON_NEGATIVE: "VALIDATE_NON_NEGATIVE" = "VALIDATE_NON_NEGATIVE"
  inline val VALIDATE_NUMERIC: "VALIDATE_NUMERIC" = "VALIDATE_NUMERIC"
  inline val NO_OP: "NO_OP" = "NO_OP"

  inline def values: js.Array[Operator] = js.Array(
    PROJECTION,
    LESS_THAN,
    GREATER_THAN,
    CONTAINS,
    BETWEEN,
    LESS_THAN_OR_EQUAL_TO,
    GREATER_THAN_OR_EQUAL_TO,
    EQUAL_TO,
    NOT_EQUAL_TO,
    ADDITION,
    MULTIPLICATION,
    DIVISION,
    SUBTRACTION,
    MASK_ALL,
    MASK_FIRST_N,
    MASK_LAST_N,
    VALIDATE_NON_NULL,
    VALIDATE_NON_ZERO,
    VALIDATE_NON_NEGATIVE,
    VALIDATE_NUMERIC,
    NO_OP
  )
}

type OperatorPropertiesKeys = "VALUE" | "VALUES" | "DATA_TYPE" | "UPPER_BOUND" | "LOWER_BOUND" | "SOURCE_DATA_TYPE" | "DESTINATION_DATA_TYPE" | "VALIDATION_ACTION" | "MASK_VALUE" | "MASK_LENGTH" | "TRUNCATE_LENGTH" | "MATH_OPERATION_FIELDS_ORDER" | "CONCAT_FORMAT" | "SUBFIELD_CATEGORY_MAP" | "EXCLUDE_SOURCE_FIELDS_LIST" | "INCLUDE_NEW_FIELDS" | "ORDERED_PARTITION_KEYS_LIST"
object OperatorPropertiesKeys {
  inline val VALUE: "VALUE" = "VALUE"
  inline val VALUES: "VALUES" = "VALUES"
  inline val DATA_TYPE: "DATA_TYPE" = "DATA_TYPE"
  inline val UPPER_BOUND: "UPPER_BOUND" = "UPPER_BOUND"
  inline val LOWER_BOUND: "LOWER_BOUND" = "LOWER_BOUND"
  inline val SOURCE_DATA_TYPE: "SOURCE_DATA_TYPE" = "SOURCE_DATA_TYPE"
  inline val DESTINATION_DATA_TYPE: "DESTINATION_DATA_TYPE" = "DESTINATION_DATA_TYPE"
  inline val VALIDATION_ACTION: "VALIDATION_ACTION" = "VALIDATION_ACTION"
  inline val MASK_VALUE: "MASK_VALUE" = "MASK_VALUE"
  inline val MASK_LENGTH: "MASK_LENGTH" = "MASK_LENGTH"
  inline val TRUNCATE_LENGTH: "TRUNCATE_LENGTH" = "TRUNCATE_LENGTH"
  inline val MATH_OPERATION_FIELDS_ORDER: "MATH_OPERATION_FIELDS_ORDER" = "MATH_OPERATION_FIELDS_ORDER"
  inline val CONCAT_FORMAT: "CONCAT_FORMAT" = "CONCAT_FORMAT"
  inline val SUBFIELD_CATEGORY_MAP: "SUBFIELD_CATEGORY_MAP" = "SUBFIELD_CATEGORY_MAP"
  inline val EXCLUDE_SOURCE_FIELDS_LIST: "EXCLUDE_SOURCE_FIELDS_LIST" = "EXCLUDE_SOURCE_FIELDS_LIST"
  inline val INCLUDE_NEW_FIELDS: "INCLUDE_NEW_FIELDS" = "INCLUDE_NEW_FIELDS"
  inline val ORDERED_PARTITION_KEYS_LIST: "ORDERED_PARTITION_KEYS_LIST" = "ORDERED_PARTITION_KEYS_LIST"

  inline def values: js.Array[OperatorPropertiesKeys] = js.Array(
    VALUE,
    VALUES,
    DATA_TYPE,
    UPPER_BOUND,
    LOWER_BOUND,
    SOURCE_DATA_TYPE,
    DESTINATION_DATA_TYPE,
    VALIDATION_ACTION,
    MASK_VALUE,
    MASK_LENGTH,
    TRUNCATE_LENGTH,
    MATH_OPERATION_FIELDS_ORDER,
    CONCAT_FORMAT,
    SUBFIELD_CATEGORY_MAP,
    EXCLUDE_SOURCE_FIELDS_LIST,
    INCLUDE_NEW_FIELDS,
    ORDERED_PARTITION_KEYS_LIST
  )
}

type Operators = "PROJECTION" | "LESS_THAN" | "GREATER_THAN" | "CONTAINS" | "BETWEEN" | "LESS_THAN_OR_EQUAL_TO" | "GREATER_THAN_OR_EQUAL_TO" | "EQUAL_TO" | "NOT_EQUAL_TO" | "ADDITION" | "MULTIPLICATION" | "DIVISION" | "SUBTRACTION" | "MASK_ALL" | "MASK_FIRST_N" | "MASK_LAST_N" | "VALIDATE_NON_NULL" | "VALIDATE_NON_ZERO" | "VALIDATE_NON_NEGATIVE" | "VALIDATE_NUMERIC" | "NO_OP"
object Operators {
  inline val PROJECTION: "PROJECTION" = "PROJECTION"
  inline val LESS_THAN: "LESS_THAN" = "LESS_THAN"
  inline val GREATER_THAN: "GREATER_THAN" = "GREATER_THAN"
  inline val CONTAINS: "CONTAINS" = "CONTAINS"
  inline val BETWEEN: "BETWEEN" = "BETWEEN"
  inline val LESS_THAN_OR_EQUAL_TO: "LESS_THAN_OR_EQUAL_TO" = "LESS_THAN_OR_EQUAL_TO"
  inline val GREATER_THAN_OR_EQUAL_TO: "GREATER_THAN_OR_EQUAL_TO" = "GREATER_THAN_OR_EQUAL_TO"
  inline val EQUAL_TO: "EQUAL_TO" = "EQUAL_TO"
  inline val NOT_EQUAL_TO: "NOT_EQUAL_TO" = "NOT_EQUAL_TO"
  inline val ADDITION: "ADDITION" = "ADDITION"
  inline val MULTIPLICATION: "MULTIPLICATION" = "MULTIPLICATION"
  inline val DIVISION: "DIVISION" = "DIVISION"
  inline val SUBTRACTION: "SUBTRACTION" = "SUBTRACTION"
  inline val MASK_ALL: "MASK_ALL" = "MASK_ALL"
  inline val MASK_FIRST_N: "MASK_FIRST_N" = "MASK_FIRST_N"
  inline val MASK_LAST_N: "MASK_LAST_N" = "MASK_LAST_N"
  inline val VALIDATE_NON_NULL: "VALIDATE_NON_NULL" = "VALIDATE_NON_NULL"
  inline val VALIDATE_NON_ZERO: "VALIDATE_NON_ZERO" = "VALIDATE_NON_ZERO"
  inline val VALIDATE_NON_NEGATIVE: "VALIDATE_NON_NEGATIVE" = "VALIDATE_NON_NEGATIVE"
  inline val VALIDATE_NUMERIC: "VALIDATE_NUMERIC" = "VALIDATE_NUMERIC"
  inline val NO_OP: "NO_OP" = "NO_OP"

  inline def values: js.Array[Operators] = js.Array(
    PROJECTION,
    LESS_THAN,
    GREATER_THAN,
    CONTAINS,
    BETWEEN,
    LESS_THAN_OR_EQUAL_TO,
    GREATER_THAN_OR_EQUAL_TO,
    EQUAL_TO,
    NOT_EQUAL_TO,
    ADDITION,
    MULTIPLICATION,
    DIVISION,
    SUBTRACTION,
    MASK_ALL,
    MASK_FIRST_N,
    MASK_LAST_N,
    VALIDATE_NON_NULL,
    VALIDATE_NON_ZERO,
    VALIDATE_NON_NEGATIVE,
    VALIDATE_NUMERIC,
    NO_OP
  )
}

type PathPrefix = "EXECUTION_ID" | "SCHEMA_VERSION"
object PathPrefix {
  inline val EXECUTION_ID: "EXECUTION_ID" = "EXECUTION_ID"
  inline val SCHEMA_VERSION: "SCHEMA_VERSION" = "SCHEMA_VERSION"

  inline def values: js.Array[PathPrefix] = js.Array(EXECUTION_ID, SCHEMA_VERSION)
}

type PrefixFormat = "YEAR" | "MONTH" | "DAY" | "HOUR" | "MINUTE"
object PrefixFormat {
  inline val YEAR: "YEAR" = "YEAR"
  inline val MONTH: "MONTH" = "MONTH"
  inline val DAY: "DAY" = "DAY"
  inline val HOUR: "HOUR" = "HOUR"
  inline val MINUTE: "MINUTE" = "MINUTE"

  inline def values: js.Array[PrefixFormat] = js.Array(YEAR, MONTH, DAY, HOUR, MINUTE)
}

type PrefixType = "FILENAME" | "PATH" | "PATH_AND_FILENAME"
object PrefixType {
  inline val FILENAME: "FILENAME" = "FILENAME"
  inline val PATH: "PATH" = "PATH"
  inline val PATH_AND_FILENAME: "PATH_AND_FILENAME" = "PATH_AND_FILENAME"

  inline def values: js.Array[PrefixType] = js.Array(FILENAME, PATH, PATH_AND_FILENAME)
}

type PrivateConnectionProvisioningFailureCause = "CONNECTOR_AUTHENTICATION" | "CONNECTOR_SERVER" | "INTERNAL_SERVER" | "ACCESS_DENIED" | "VALIDATION"
object PrivateConnectionProvisioningFailureCause {
  inline val CONNECTOR_AUTHENTICATION: "CONNECTOR_AUTHENTICATION" = "CONNECTOR_AUTHENTICATION"
  inline val CONNECTOR_SERVER: "CONNECTOR_SERVER" = "CONNECTOR_SERVER"
  inline val INTERNAL_SERVER: "INTERNAL_SERVER" = "INTERNAL_SERVER"
  inline val ACCESS_DENIED: "ACCESS_DENIED" = "ACCESS_DENIED"
  inline val VALIDATION: "VALIDATION" = "VALIDATION"

  inline def values: js.Array[PrivateConnectionProvisioningFailureCause] = js.Array(CONNECTOR_AUTHENTICATION, CONNECTOR_SERVER, INTERNAL_SERVER, ACCESS_DENIED, VALIDATION)
}

type PrivateConnectionProvisioningStatus = "FAILED" | "PENDING" | "CREATED"
object PrivateConnectionProvisioningStatus {
  inline val FAILED: "FAILED" = "FAILED"
  inline val PENDING: "PENDING" = "PENDING"
  inline val CREATED: "CREATED" = "CREATED"

  inline def values: js.Array[PrivateConnectionProvisioningStatus] = js.Array(FAILED, PENDING, CREATED)
}

type S3ConnectorOperator = "PROJECTION" | "LESS_THAN" | "GREATER_THAN" | "BETWEEN" | "LESS_THAN_OR_EQUAL_TO" | "GREATER_THAN_OR_EQUAL_TO" | "EQUAL_TO" | "NOT_EQUAL_TO" | "ADDITION" | "MULTIPLICATION" | "DIVISION" | "SUBTRACTION" | "MASK_ALL" | "MASK_FIRST_N" | "MASK_LAST_N" | "VALIDATE_NON_NULL" | "VALIDATE_NON_ZERO" | "VALIDATE_NON_NEGATIVE" | "VALIDATE_NUMERIC" | "NO_OP"
object S3ConnectorOperator {
  inline val PROJECTION: "PROJECTION" = "PROJECTION"
  inline val LESS_THAN: "LESS_THAN" = "LESS_THAN"
  inline val GREATER_THAN: "GREATER_THAN" = "GREATER_THAN"
  inline val BETWEEN: "BETWEEN" = "BETWEEN"
  inline val LESS_THAN_OR_EQUAL_TO: "LESS_THAN_OR_EQUAL_TO" = "LESS_THAN_OR_EQUAL_TO"
  inline val GREATER_THAN_OR_EQUAL_TO: "GREATER_THAN_OR_EQUAL_TO" = "GREATER_THAN_OR_EQUAL_TO"
  inline val EQUAL_TO: "EQUAL_TO" = "EQUAL_TO"
  inline val NOT_EQUAL_TO: "NOT_EQUAL_TO" = "NOT_EQUAL_TO"
  inline val ADDITION: "ADDITION" = "ADDITION"
  inline val MULTIPLICATION: "MULTIPLICATION" = "MULTIPLICATION"
  inline val DIVISION: "DIVISION" = "DIVISION"
  inline val SUBTRACTION: "SUBTRACTION" = "SUBTRACTION"
  inline val MASK_ALL: "MASK_ALL" = "MASK_ALL"
  inline val MASK_FIRST_N: "MASK_FIRST_N" = "MASK_FIRST_N"
  inline val MASK_LAST_N: "MASK_LAST_N" = "MASK_LAST_N"
  inline val VALIDATE_NON_NULL: "VALIDATE_NON_NULL" = "VALIDATE_NON_NULL"
  inline val VALIDATE_NON_ZERO: "VALIDATE_NON_ZERO" = "VALIDATE_NON_ZERO"
  inline val VALIDATE_NON_NEGATIVE: "VALIDATE_NON_NEGATIVE" = "VALIDATE_NON_NEGATIVE"
  inline val VALIDATE_NUMERIC: "VALIDATE_NUMERIC" = "VALIDATE_NUMERIC"
  inline val NO_OP: "NO_OP" = "NO_OP"

  inline def values: js.Array[S3ConnectorOperator] = js.Array(
    PROJECTION,
    LESS_THAN,
    GREATER_THAN,
    BETWEEN,
    LESS_THAN_OR_EQUAL_TO,
    GREATER_THAN_OR_EQUAL_TO,
    EQUAL_TO,
    NOT_EQUAL_TO,
    ADDITION,
    MULTIPLICATION,
    DIVISION,
    SUBTRACTION,
    MASK_ALL,
    MASK_FIRST_N,
    MASK_LAST_N,
    VALIDATE_NON_NULL,
    VALIDATE_NON_ZERO,
    VALIDATE_NON_NEGATIVE,
    VALIDATE_NUMERIC,
    NO_OP
  )
}

type S3InputFileType = "CSV" | "JSON"
object S3InputFileType {
  inline val CSV: "CSV" = "CSV"
  inline val JSON: "JSON" = "JSON"

  inline def values: js.Array[S3InputFileType] = js.Array(CSV, JSON)
}

type SAPODataConnectorOperator = "PROJECTION" | "LESS_THAN" | "CONTAINS" | "GREATER_THAN" | "BETWEEN" | "LESS_THAN_OR_EQUAL_TO" | "GREATER_THAN_OR_EQUAL_TO" | "EQUAL_TO" | "NOT_EQUAL_TO" | "ADDITION" | "MULTIPLICATION" | "DIVISION" | "SUBTRACTION" | "MASK_ALL" | "MASK_FIRST_N" | "MASK_LAST_N" | "VALIDATE_NON_NULL" | "VALIDATE_NON_ZERO" | "VALIDATE_NON_NEGATIVE" | "VALIDATE_NUMERIC" | "NO_OP"
object SAPODataConnectorOperator {
  inline val PROJECTION: "PROJECTION" = "PROJECTION"
  inline val LESS_THAN: "LESS_THAN" = "LESS_THAN"
  inline val CONTAINS: "CONTAINS" = "CONTAINS"
  inline val GREATER_THAN: "GREATER_THAN" = "GREATER_THAN"
  inline val BETWEEN: "BETWEEN" = "BETWEEN"
  inline val LESS_THAN_OR_EQUAL_TO: "LESS_THAN_OR_EQUAL_TO" = "LESS_THAN_OR_EQUAL_TO"
  inline val GREATER_THAN_OR_EQUAL_TO: "GREATER_THAN_OR_EQUAL_TO" = "GREATER_THAN_OR_EQUAL_TO"
  inline val EQUAL_TO: "EQUAL_TO" = "EQUAL_TO"
  inline val NOT_EQUAL_TO: "NOT_EQUAL_TO" = "NOT_EQUAL_TO"
  inline val ADDITION: "ADDITION" = "ADDITION"
  inline val MULTIPLICATION: "MULTIPLICATION" = "MULTIPLICATION"
  inline val DIVISION: "DIVISION" = "DIVISION"
  inline val SUBTRACTION: "SUBTRACTION" = "SUBTRACTION"
  inline val MASK_ALL: "MASK_ALL" = "MASK_ALL"
  inline val MASK_FIRST_N: "MASK_FIRST_N" = "MASK_FIRST_N"
  inline val MASK_LAST_N: "MASK_LAST_N" = "MASK_LAST_N"
  inline val VALIDATE_NON_NULL: "VALIDATE_NON_NULL" = "VALIDATE_NON_NULL"
  inline val VALIDATE_NON_ZERO: "VALIDATE_NON_ZERO" = "VALIDATE_NON_ZERO"
  inline val VALIDATE_NON_NEGATIVE: "VALIDATE_NON_NEGATIVE" = "VALIDATE_NON_NEGATIVE"
  inline val VALIDATE_NUMERIC: "VALIDATE_NUMERIC" = "VALIDATE_NUMERIC"
  inline val NO_OP: "NO_OP" = "NO_OP"

  inline def values: js.Array[SAPODataConnectorOperator] = js.Array(
    PROJECTION,
    LESS_THAN,
    CONTAINS,
    GREATER_THAN,
    BETWEEN,
    LESS_THAN_OR_EQUAL_TO,
    GREATER_THAN_OR_EQUAL_TO,
    EQUAL_TO,
    NOT_EQUAL_TO,
    ADDITION,
    MULTIPLICATION,
    DIVISION,
    SUBTRACTION,
    MASK_ALL,
    MASK_FIRST_N,
    MASK_LAST_N,
    VALIDATE_NON_NULL,
    VALIDATE_NON_ZERO,
    VALIDATE_NON_NEGATIVE,
    VALIDATE_NUMERIC,
    NO_OP
  )
}

type SalesforceConnectorOperator = "PROJECTION" | "LESS_THAN" | "CONTAINS" | "GREATER_THAN" | "BETWEEN" | "LESS_THAN_OR_EQUAL_TO" | "GREATER_THAN_OR_EQUAL_TO" | "EQUAL_TO" | "NOT_EQUAL_TO" | "ADDITION" | "MULTIPLICATION" | "DIVISION" | "SUBTRACTION" | "MASK_ALL" | "MASK_FIRST_N" | "MASK_LAST_N" | "VALIDATE_NON_NULL" | "VALIDATE_NON_ZERO" | "VALIDATE_NON_NEGATIVE" | "VALIDATE_NUMERIC" | "NO_OP"
object SalesforceConnectorOperator {
  inline val PROJECTION: "PROJECTION" = "PROJECTION"
  inline val LESS_THAN: "LESS_THAN" = "LESS_THAN"
  inline val CONTAINS: "CONTAINS" = "CONTAINS"
  inline val GREATER_THAN: "GREATER_THAN" = "GREATER_THAN"
  inline val BETWEEN: "BETWEEN" = "BETWEEN"
  inline val LESS_THAN_OR_EQUAL_TO: "LESS_THAN_OR_EQUAL_TO" = "LESS_THAN_OR_EQUAL_TO"
  inline val GREATER_THAN_OR_EQUAL_TO: "GREATER_THAN_OR_EQUAL_TO" = "GREATER_THAN_OR_EQUAL_TO"
  inline val EQUAL_TO: "EQUAL_TO" = "EQUAL_TO"
  inline val NOT_EQUAL_TO: "NOT_EQUAL_TO" = "NOT_EQUAL_TO"
  inline val ADDITION: "ADDITION" = "ADDITION"
  inline val MULTIPLICATION: "MULTIPLICATION" = "MULTIPLICATION"
  inline val DIVISION: "DIVISION" = "DIVISION"
  inline val SUBTRACTION: "SUBTRACTION" = "SUBTRACTION"
  inline val MASK_ALL: "MASK_ALL" = "MASK_ALL"
  inline val MASK_FIRST_N: "MASK_FIRST_N" = "MASK_FIRST_N"
  inline val MASK_LAST_N: "MASK_LAST_N" = "MASK_LAST_N"
  inline val VALIDATE_NON_NULL: "VALIDATE_NON_NULL" = "VALIDATE_NON_NULL"
  inline val VALIDATE_NON_ZERO: "VALIDATE_NON_ZERO" = "VALIDATE_NON_ZERO"
  inline val VALIDATE_NON_NEGATIVE: "VALIDATE_NON_NEGATIVE" = "VALIDATE_NON_NEGATIVE"
  inline val VALIDATE_NUMERIC: "VALIDATE_NUMERIC" = "VALIDATE_NUMERIC"
  inline val NO_OP: "NO_OP" = "NO_OP"

  inline def values: js.Array[SalesforceConnectorOperator] = js.Array(
    PROJECTION,
    LESS_THAN,
    CONTAINS,
    GREATER_THAN,
    BETWEEN,
    LESS_THAN_OR_EQUAL_TO,
    GREATER_THAN_OR_EQUAL_TO,
    EQUAL_TO,
    NOT_EQUAL_TO,
    ADDITION,
    MULTIPLICATION,
    DIVISION,
    SUBTRACTION,
    MASK_ALL,
    MASK_FIRST_N,
    MASK_LAST_N,
    VALIDATE_NON_NULL,
    VALIDATE_NON_ZERO,
    VALIDATE_NON_NEGATIVE,
    VALIDATE_NUMERIC,
    NO_OP
  )
}

type SalesforceDataTransferApi = "AUTOMATIC" | "BULKV2" | "REST_SYNC"
object SalesforceDataTransferApi {
  inline val AUTOMATIC: "AUTOMATIC" = "AUTOMATIC"
  inline val BULKV2: "BULKV2" = "BULKV2"
  inline val REST_SYNC: "REST_SYNC" = "REST_SYNC"

  inline def values: js.Array[SalesforceDataTransferApi] = js.Array(AUTOMATIC, BULKV2, REST_SYNC)
}

type ScheduleFrequencyType = "BYMINUTE" | "HOURLY" | "DAILY" | "WEEKLY" | "MONTHLY" | "ONCE"
object ScheduleFrequencyType {
  inline val BYMINUTE: "BYMINUTE" = "BYMINUTE"
  inline val HOURLY: "HOURLY" = "HOURLY"
  inline val DAILY: "DAILY" = "DAILY"
  inline val WEEKLY: "WEEKLY" = "WEEKLY"
  inline val MONTHLY: "MONTHLY" = "MONTHLY"
  inline val ONCE: "ONCE" = "ONCE"

  inline def values: js.Array[ScheduleFrequencyType] = js.Array(BYMINUTE, HOURLY, DAILY, WEEKLY, MONTHLY, ONCE)
}

type ServiceNowConnectorOperator = "PROJECTION" | "CONTAINS" | "LESS_THAN" | "GREATER_THAN" | "BETWEEN" | "LESS_THAN_OR_EQUAL_TO" | "GREATER_THAN_OR_EQUAL_TO" | "EQUAL_TO" | "NOT_EQUAL_TO" | "ADDITION" | "MULTIPLICATION" | "DIVISION" | "SUBTRACTION" | "MASK_ALL" | "MASK_FIRST_N" | "MASK_LAST_N" | "VALIDATE_NON_NULL" | "VALIDATE_NON_ZERO" | "VALIDATE_NON_NEGATIVE" | "VALIDATE_NUMERIC" | "NO_OP"
object ServiceNowConnectorOperator {
  inline val PROJECTION: "PROJECTION" = "PROJECTION"
  inline val CONTAINS: "CONTAINS" = "CONTAINS"
  inline val LESS_THAN: "LESS_THAN" = "LESS_THAN"
  inline val GREATER_THAN: "GREATER_THAN" = "GREATER_THAN"
  inline val BETWEEN: "BETWEEN" = "BETWEEN"
  inline val LESS_THAN_OR_EQUAL_TO: "LESS_THAN_OR_EQUAL_TO" = "LESS_THAN_OR_EQUAL_TO"
  inline val GREATER_THAN_OR_EQUAL_TO: "GREATER_THAN_OR_EQUAL_TO" = "GREATER_THAN_OR_EQUAL_TO"
  inline val EQUAL_TO: "EQUAL_TO" = "EQUAL_TO"
  inline val NOT_EQUAL_TO: "NOT_EQUAL_TO" = "NOT_EQUAL_TO"
  inline val ADDITION: "ADDITION" = "ADDITION"
  inline val MULTIPLICATION: "MULTIPLICATION" = "MULTIPLICATION"
  inline val DIVISION: "DIVISION" = "DIVISION"
  inline val SUBTRACTION: "SUBTRACTION" = "SUBTRACTION"
  inline val MASK_ALL: "MASK_ALL" = "MASK_ALL"
  inline val MASK_FIRST_N: "MASK_FIRST_N" = "MASK_FIRST_N"
  inline val MASK_LAST_N: "MASK_LAST_N" = "MASK_LAST_N"
  inline val VALIDATE_NON_NULL: "VALIDATE_NON_NULL" = "VALIDATE_NON_NULL"
  inline val VALIDATE_NON_ZERO: "VALIDATE_NON_ZERO" = "VALIDATE_NON_ZERO"
  inline val VALIDATE_NON_NEGATIVE: "VALIDATE_NON_NEGATIVE" = "VALIDATE_NON_NEGATIVE"
  inline val VALIDATE_NUMERIC: "VALIDATE_NUMERIC" = "VALIDATE_NUMERIC"
  inline val NO_OP: "NO_OP" = "NO_OP"

  inline def values: js.Array[ServiceNowConnectorOperator] = js.Array(
    PROJECTION,
    CONTAINS,
    LESS_THAN,
    GREATER_THAN,
    BETWEEN,
    LESS_THAN_OR_EQUAL_TO,
    GREATER_THAN_OR_EQUAL_TO,
    EQUAL_TO,
    NOT_EQUAL_TO,
    ADDITION,
    MULTIPLICATION,
    DIVISION,
    SUBTRACTION,
    MASK_ALL,
    MASK_FIRST_N,
    MASK_LAST_N,
    VALIDATE_NON_NULL,
    VALIDATE_NON_ZERO,
    VALIDATE_NON_NEGATIVE,
    VALIDATE_NUMERIC,
    NO_OP
  )
}

type SingularConnectorOperator = "PROJECTION" | "EQUAL_TO" | "ADDITION" | "MULTIPLICATION" | "DIVISION" | "SUBTRACTION" | "MASK_ALL" | "MASK_FIRST_N" | "MASK_LAST_N" | "VALIDATE_NON_NULL" | "VALIDATE_NON_ZERO" | "VALIDATE_NON_NEGATIVE" | "VALIDATE_NUMERIC" | "NO_OP"
object SingularConnectorOperator {
  inline val PROJECTION: "PROJECTION" = "PROJECTION"
  inline val EQUAL_TO: "EQUAL_TO" = "EQUAL_TO"
  inline val ADDITION: "ADDITION" = "ADDITION"
  inline val MULTIPLICATION: "MULTIPLICATION" = "MULTIPLICATION"
  inline val DIVISION: "DIVISION" = "DIVISION"
  inline val SUBTRACTION: "SUBTRACTION" = "SUBTRACTION"
  inline val MASK_ALL: "MASK_ALL" = "MASK_ALL"
  inline val MASK_FIRST_N: "MASK_FIRST_N" = "MASK_FIRST_N"
  inline val MASK_LAST_N: "MASK_LAST_N" = "MASK_LAST_N"
  inline val VALIDATE_NON_NULL: "VALIDATE_NON_NULL" = "VALIDATE_NON_NULL"
  inline val VALIDATE_NON_ZERO: "VALIDATE_NON_ZERO" = "VALIDATE_NON_ZERO"
  inline val VALIDATE_NON_NEGATIVE: "VALIDATE_NON_NEGATIVE" = "VALIDATE_NON_NEGATIVE"
  inline val VALIDATE_NUMERIC: "VALIDATE_NUMERIC" = "VALIDATE_NUMERIC"
  inline val NO_OP: "NO_OP" = "NO_OP"

  inline def values: js.Array[SingularConnectorOperator] = js.Array(
    PROJECTION,
    EQUAL_TO,
    ADDITION,
    MULTIPLICATION,
    DIVISION,
    SUBTRACTION,
    MASK_ALL,
    MASK_FIRST_N,
    MASK_LAST_N,
    VALIDATE_NON_NULL,
    VALIDATE_NON_ZERO,
    VALIDATE_NON_NEGATIVE,
    VALIDATE_NUMERIC,
    NO_OP
  )
}

type SlackConnectorOperator = "PROJECTION" | "LESS_THAN" | "GREATER_THAN" | "BETWEEN" | "LESS_THAN_OR_EQUAL_TO" | "GREATER_THAN_OR_EQUAL_TO" | "EQUAL_TO" | "ADDITION" | "MULTIPLICATION" | "DIVISION" | "SUBTRACTION" | "MASK_ALL" | "MASK_FIRST_N" | "MASK_LAST_N" | "VALIDATE_NON_NULL" | "VALIDATE_NON_ZERO" | "VALIDATE_NON_NEGATIVE" | "VALIDATE_NUMERIC" | "NO_OP"
object SlackConnectorOperator {
  inline val PROJECTION: "PROJECTION" = "PROJECTION"
  inline val LESS_THAN: "LESS_THAN" = "LESS_THAN"
  inline val GREATER_THAN: "GREATER_THAN" = "GREATER_THAN"
  inline val BETWEEN: "BETWEEN" = "BETWEEN"
  inline val LESS_THAN_OR_EQUAL_TO: "LESS_THAN_OR_EQUAL_TO" = "LESS_THAN_OR_EQUAL_TO"
  inline val GREATER_THAN_OR_EQUAL_TO: "GREATER_THAN_OR_EQUAL_TO" = "GREATER_THAN_OR_EQUAL_TO"
  inline val EQUAL_TO: "EQUAL_TO" = "EQUAL_TO"
  inline val ADDITION: "ADDITION" = "ADDITION"
  inline val MULTIPLICATION: "MULTIPLICATION" = "MULTIPLICATION"
  inline val DIVISION: "DIVISION" = "DIVISION"
  inline val SUBTRACTION: "SUBTRACTION" = "SUBTRACTION"
  inline val MASK_ALL: "MASK_ALL" = "MASK_ALL"
  inline val MASK_FIRST_N: "MASK_FIRST_N" = "MASK_FIRST_N"
  inline val MASK_LAST_N: "MASK_LAST_N" = "MASK_LAST_N"
  inline val VALIDATE_NON_NULL: "VALIDATE_NON_NULL" = "VALIDATE_NON_NULL"
  inline val VALIDATE_NON_ZERO: "VALIDATE_NON_ZERO" = "VALIDATE_NON_ZERO"
  inline val VALIDATE_NON_NEGATIVE: "VALIDATE_NON_NEGATIVE" = "VALIDATE_NON_NEGATIVE"
  inline val VALIDATE_NUMERIC: "VALIDATE_NUMERIC" = "VALIDATE_NUMERIC"
  inline val NO_OP: "NO_OP" = "NO_OP"

  inline def values: js.Array[SlackConnectorOperator] = js.Array(
    PROJECTION,
    LESS_THAN,
    GREATER_THAN,
    BETWEEN,
    LESS_THAN_OR_EQUAL_TO,
    GREATER_THAN_OR_EQUAL_TO,
    EQUAL_TO,
    ADDITION,
    MULTIPLICATION,
    DIVISION,
    SUBTRACTION,
    MASK_ALL,
    MASK_FIRST_N,
    MASK_LAST_N,
    VALIDATE_NON_NULL,
    VALIDATE_NON_ZERO,
    VALIDATE_NON_NEGATIVE,
    VALIDATE_NUMERIC,
    NO_OP
  )
}

type TaskType = "Arithmetic" | "Filter" | "Map" | "Map_all" | "Mask" | "Merge" | "Passthrough" | "Truncate" | "Validate" | "Partition"
object TaskType {
  inline val Arithmetic: "Arithmetic" = "Arithmetic"
  inline val Filter: "Filter" = "Filter"
  inline val Map: "Map" = "Map"
  inline val Map_all: "Map_all" = "Map_all"
  inline val Mask: "Mask" = "Mask"
  inline val Merge: "Merge" = "Merge"
  inline val Passthrough: "Passthrough" = "Passthrough"
  inline val Truncate: "Truncate" = "Truncate"
  inline val Validate: "Validate" = "Validate"
  inline val Partition: "Partition" = "Partition"

  inline def values: js.Array[TaskType] = js.Array(Arithmetic, Filter, Map, Map_all, Mask, Merge, Passthrough, Truncate, Validate, Partition)
}

type TrendmicroConnectorOperator = "PROJECTION" | "EQUAL_TO" | "ADDITION" | "MULTIPLICATION" | "DIVISION" | "SUBTRACTION" | "MASK_ALL" | "MASK_FIRST_N" | "MASK_LAST_N" | "VALIDATE_NON_NULL" | "VALIDATE_NON_ZERO" | "VALIDATE_NON_NEGATIVE" | "VALIDATE_NUMERIC" | "NO_OP"
object TrendmicroConnectorOperator {
  inline val PROJECTION: "PROJECTION" = "PROJECTION"
  inline val EQUAL_TO: "EQUAL_TO" = "EQUAL_TO"
  inline val ADDITION: "ADDITION" = "ADDITION"
  inline val MULTIPLICATION: "MULTIPLICATION" = "MULTIPLICATION"
  inline val DIVISION: "DIVISION" = "DIVISION"
  inline val SUBTRACTION: "SUBTRACTION" = "SUBTRACTION"
  inline val MASK_ALL: "MASK_ALL" = "MASK_ALL"
  inline val MASK_FIRST_N: "MASK_FIRST_N" = "MASK_FIRST_N"
  inline val MASK_LAST_N: "MASK_LAST_N" = "MASK_LAST_N"
  inline val VALIDATE_NON_NULL: "VALIDATE_NON_NULL" = "VALIDATE_NON_NULL"
  inline val VALIDATE_NON_ZERO: "VALIDATE_NON_ZERO" = "VALIDATE_NON_ZERO"
  inline val VALIDATE_NON_NEGATIVE: "VALIDATE_NON_NEGATIVE" = "VALIDATE_NON_NEGATIVE"
  inline val VALIDATE_NUMERIC: "VALIDATE_NUMERIC" = "VALIDATE_NUMERIC"
  inline val NO_OP: "NO_OP" = "NO_OP"

  inline def values: js.Array[TrendmicroConnectorOperator] = js.Array(
    PROJECTION,
    EQUAL_TO,
    ADDITION,
    MULTIPLICATION,
    DIVISION,
    SUBTRACTION,
    MASK_ALL,
    MASK_FIRST_N,
    MASK_LAST_N,
    VALIDATE_NON_NULL,
    VALIDATE_NON_ZERO,
    VALIDATE_NON_NEGATIVE,
    VALIDATE_NUMERIC,
    NO_OP
  )
}

type TriggerType = "Scheduled" | "Event" | "OnDemand"
object TriggerType {
  inline val Scheduled: "Scheduled" = "Scheduled"
  inline val Event: "Event" = "Event"
  inline val OnDemand: "OnDemand" = "OnDemand"

  inline def values: js.Array[TriggerType] = js.Array(Scheduled, Event, OnDemand)
}

type VeevaConnectorOperator = "PROJECTION" | "LESS_THAN" | "GREATER_THAN" | "CONTAINS" | "BETWEEN" | "LESS_THAN_OR_EQUAL_TO" | "GREATER_THAN_OR_EQUAL_TO" | "EQUAL_TO" | "NOT_EQUAL_TO" | "ADDITION" | "MULTIPLICATION" | "DIVISION" | "SUBTRACTION" | "MASK_ALL" | "MASK_FIRST_N" | "MASK_LAST_N" | "VALIDATE_NON_NULL" | "VALIDATE_NON_ZERO" | "VALIDATE_NON_NEGATIVE" | "VALIDATE_NUMERIC" | "NO_OP"
object VeevaConnectorOperator {
  inline val PROJECTION: "PROJECTION" = "PROJECTION"
  inline val LESS_THAN: "LESS_THAN" = "LESS_THAN"
  inline val GREATER_THAN: "GREATER_THAN" = "GREATER_THAN"
  inline val CONTAINS: "CONTAINS" = "CONTAINS"
  inline val BETWEEN: "BETWEEN" = "BETWEEN"
  inline val LESS_THAN_OR_EQUAL_TO: "LESS_THAN_OR_EQUAL_TO" = "LESS_THAN_OR_EQUAL_TO"
  inline val GREATER_THAN_OR_EQUAL_TO: "GREATER_THAN_OR_EQUAL_TO" = "GREATER_THAN_OR_EQUAL_TO"
  inline val EQUAL_TO: "EQUAL_TO" = "EQUAL_TO"
  inline val NOT_EQUAL_TO: "NOT_EQUAL_TO" = "NOT_EQUAL_TO"
  inline val ADDITION: "ADDITION" = "ADDITION"
  inline val MULTIPLICATION: "MULTIPLICATION" = "MULTIPLICATION"
  inline val DIVISION: "DIVISION" = "DIVISION"
  inline val SUBTRACTION: "SUBTRACTION" = "SUBTRACTION"
  inline val MASK_ALL: "MASK_ALL" = "MASK_ALL"
  inline val MASK_FIRST_N: "MASK_FIRST_N" = "MASK_FIRST_N"
  inline val MASK_LAST_N: "MASK_LAST_N" = "MASK_LAST_N"
  inline val VALIDATE_NON_NULL: "VALIDATE_NON_NULL" = "VALIDATE_NON_NULL"
  inline val VALIDATE_NON_ZERO: "VALIDATE_NON_ZERO" = "VALIDATE_NON_ZERO"
  inline val VALIDATE_NON_NEGATIVE: "VALIDATE_NON_NEGATIVE" = "VALIDATE_NON_NEGATIVE"
  inline val VALIDATE_NUMERIC: "VALIDATE_NUMERIC" = "VALIDATE_NUMERIC"
  inline val NO_OP: "NO_OP" = "NO_OP"

  inline def values: js.Array[VeevaConnectorOperator] = js.Array(
    PROJECTION,
    LESS_THAN,
    GREATER_THAN,
    CONTAINS,
    BETWEEN,
    LESS_THAN_OR_EQUAL_TO,
    GREATER_THAN_OR_EQUAL_TO,
    EQUAL_TO,
    NOT_EQUAL_TO,
    ADDITION,
    MULTIPLICATION,
    DIVISION,
    SUBTRACTION,
    MASK_ALL,
    MASK_FIRST_N,
    MASK_LAST_N,
    VALIDATE_NON_NULL,
    VALIDATE_NON_ZERO,
    VALIDATE_NON_NEGATIVE,
    VALIDATE_NUMERIC,
    NO_OP
  )
}

/** The possible write operations in the destination connector. When this value is not provided, this defaults to the <code>INSERT</code> operation.
  */
type WriteOperationType = "INSERT" | "UPSERT" | "UPDATE" | "DELETE"
object WriteOperationType {
  inline val INSERT: "INSERT" = "INSERT"
  inline val UPSERT: "UPSERT" = "UPSERT"
  inline val UPDATE: "UPDATE" = "UPDATE"
  inline val DELETE: "DELETE" = "DELETE"

  inline def values: js.Array[WriteOperationType] = js.Array(INSERT, UPSERT, UPDATE, DELETE)
}

type ZendeskConnectorOperator = "PROJECTION" | "GREATER_THAN" | "ADDITION" | "MULTIPLICATION" | "DIVISION" | "SUBTRACTION" | "MASK_ALL" | "MASK_FIRST_N" | "MASK_LAST_N" | "VALIDATE_NON_NULL" | "VALIDATE_NON_ZERO" | "VALIDATE_NON_NEGATIVE" | "VALIDATE_NUMERIC" | "NO_OP"
object ZendeskConnectorOperator {
  inline val PROJECTION: "PROJECTION" = "PROJECTION"
  inline val GREATER_THAN: "GREATER_THAN" = "GREATER_THAN"
  inline val ADDITION: "ADDITION" = "ADDITION"
  inline val MULTIPLICATION: "MULTIPLICATION" = "MULTIPLICATION"
  inline val DIVISION: "DIVISION" = "DIVISION"
  inline val SUBTRACTION: "SUBTRACTION" = "SUBTRACTION"
  inline val MASK_ALL: "MASK_ALL" = "MASK_ALL"
  inline val MASK_FIRST_N: "MASK_FIRST_N" = "MASK_FIRST_N"
  inline val MASK_LAST_N: "MASK_LAST_N" = "MASK_LAST_N"
  inline val VALIDATE_NON_NULL: "VALIDATE_NON_NULL" = "VALIDATE_NON_NULL"
  inline val VALIDATE_NON_ZERO: "VALIDATE_NON_ZERO" = "VALIDATE_NON_ZERO"
  inline val VALIDATE_NON_NEGATIVE: "VALIDATE_NON_NEGATIVE" = "VALIDATE_NON_NEGATIVE"
  inline val VALIDATE_NUMERIC: "VALIDATE_NUMERIC" = "VALIDATE_NUMERIC"
  inline val NO_OP: "NO_OP" = "NO_OP"

  inline def values: js.Array[ZendeskConnectorOperator] = js.Array(
    PROJECTION,
    GREATER_THAN,
    ADDITION,
    MULTIPLICATION,
    DIVISION,
    SUBTRACTION,
    MASK_ALL,
    MASK_FIRST_N,
    MASK_LAST_N,
    VALIDATE_NON_NULL,
    VALIDATE_NON_ZERO,
    VALIDATE_NON_NEGATIVE,
    VALIDATE_NUMERIC,
    NO_OP
  )
}
