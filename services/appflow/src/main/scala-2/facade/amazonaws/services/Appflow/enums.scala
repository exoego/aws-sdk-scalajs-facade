package facade.amazonaws.services.appflow

import scalajs.js

@js.native
sealed trait AggregationType extends js.Any
object AggregationType {
  val None = "None".asInstanceOf[AggregationType]
  val SingleFile = "SingleFile".asInstanceOf[AggregationType]

  @inline def values: js.Array[AggregationType] = js.Array(None, SingleFile)
}

@js.native
sealed trait AmplitudeConnectorOperator extends js.Any
object AmplitudeConnectorOperator {
  val BETWEEN = "BETWEEN".asInstanceOf[AmplitudeConnectorOperator]

  @inline def values: js.Array[AmplitudeConnectorOperator] = js.Array(BETWEEN)
}

@js.native
sealed trait ConnectionMode extends js.Any
object ConnectionMode {
  val Public = "Public".asInstanceOf[ConnectionMode]
  val Private = "Private".asInstanceOf[ConnectionMode]

  @inline def values: js.Array[ConnectionMode] = js.Array(Public, Private)
}

@js.native
sealed trait ConnectorType extends js.Any
object ConnectorType {
  val Salesforce = "Salesforce".asInstanceOf[ConnectorType]
  val Singular = "Singular".asInstanceOf[ConnectorType]
  val Slack = "Slack".asInstanceOf[ConnectorType]
  val Redshift = "Redshift".asInstanceOf[ConnectorType]
  val S3 = "S3".asInstanceOf[ConnectorType]
  val Marketo = "Marketo".asInstanceOf[ConnectorType]
  val Googleanalytics = "Googleanalytics".asInstanceOf[ConnectorType]
  val Zendesk = "Zendesk".asInstanceOf[ConnectorType]
  val Servicenow = "Servicenow".asInstanceOf[ConnectorType]
  val Datadog = "Datadog".asInstanceOf[ConnectorType]
  val Trendmicro = "Trendmicro".asInstanceOf[ConnectorType]
  val Snowflake = "Snowflake".asInstanceOf[ConnectorType]
  val Dynatrace = "Dynatrace".asInstanceOf[ConnectorType]
  val Infornexus = "Infornexus".asInstanceOf[ConnectorType]
  val Amplitude = "Amplitude".asInstanceOf[ConnectorType]
  val Veeva = "Veeva".asInstanceOf[ConnectorType]
  val EventBridge = "EventBridge".asInstanceOf[ConnectorType]
  val LookoutMetrics = "LookoutMetrics".asInstanceOf[ConnectorType]
  val Upsolver = "Upsolver".asInstanceOf[ConnectorType]
  val Honeycode = "Honeycode".asInstanceOf[ConnectorType]
  val CustomerProfiles = "CustomerProfiles".asInstanceOf[ConnectorType]

  @inline def values: js.Array[ConnectorType] = js.Array(
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
    CustomerProfiles
  )
}

@js.native
sealed trait DataPullMode extends js.Any
object DataPullMode {
  val Incremental = "Incremental".asInstanceOf[DataPullMode]
  val Complete = "Complete".asInstanceOf[DataPullMode]

  @inline def values: js.Array[DataPullMode] = js.Array(Incremental, Complete)
}

@js.native
sealed trait DatadogConnectorOperator extends js.Any
object DatadogConnectorOperator {
  val PROJECTION = "PROJECTION".asInstanceOf[DatadogConnectorOperator]
  val BETWEEN = "BETWEEN".asInstanceOf[DatadogConnectorOperator]
  val EQUAL_TO = "EQUAL_TO".asInstanceOf[DatadogConnectorOperator]
  val ADDITION = "ADDITION".asInstanceOf[DatadogConnectorOperator]
  val MULTIPLICATION = "MULTIPLICATION".asInstanceOf[DatadogConnectorOperator]
  val DIVISION = "DIVISION".asInstanceOf[DatadogConnectorOperator]
  val SUBTRACTION = "SUBTRACTION".asInstanceOf[DatadogConnectorOperator]
  val MASK_ALL = "MASK_ALL".asInstanceOf[DatadogConnectorOperator]
  val MASK_FIRST_N = "MASK_FIRST_N".asInstanceOf[DatadogConnectorOperator]
  val MASK_LAST_N = "MASK_LAST_N".asInstanceOf[DatadogConnectorOperator]
  val VALIDATE_NON_NULL = "VALIDATE_NON_NULL".asInstanceOf[DatadogConnectorOperator]
  val VALIDATE_NON_ZERO = "VALIDATE_NON_ZERO".asInstanceOf[DatadogConnectorOperator]
  val VALIDATE_NON_NEGATIVE = "VALIDATE_NON_NEGATIVE".asInstanceOf[DatadogConnectorOperator]
  val VALIDATE_NUMERIC = "VALIDATE_NUMERIC".asInstanceOf[DatadogConnectorOperator]
  val NO_OP = "NO_OP".asInstanceOf[DatadogConnectorOperator]

  @inline def values: js.Array[DatadogConnectorOperator] = js.Array(
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

@js.native
sealed trait DynatraceConnectorOperator extends js.Any
object DynatraceConnectorOperator {
  val PROJECTION = "PROJECTION".asInstanceOf[DynatraceConnectorOperator]
  val BETWEEN = "BETWEEN".asInstanceOf[DynatraceConnectorOperator]
  val EQUAL_TO = "EQUAL_TO".asInstanceOf[DynatraceConnectorOperator]
  val ADDITION = "ADDITION".asInstanceOf[DynatraceConnectorOperator]
  val MULTIPLICATION = "MULTIPLICATION".asInstanceOf[DynatraceConnectorOperator]
  val DIVISION = "DIVISION".asInstanceOf[DynatraceConnectorOperator]
  val SUBTRACTION = "SUBTRACTION".asInstanceOf[DynatraceConnectorOperator]
  val MASK_ALL = "MASK_ALL".asInstanceOf[DynatraceConnectorOperator]
  val MASK_FIRST_N = "MASK_FIRST_N".asInstanceOf[DynatraceConnectorOperator]
  val MASK_LAST_N = "MASK_LAST_N".asInstanceOf[DynatraceConnectorOperator]
  val VALIDATE_NON_NULL = "VALIDATE_NON_NULL".asInstanceOf[DynatraceConnectorOperator]
  val VALIDATE_NON_ZERO = "VALIDATE_NON_ZERO".asInstanceOf[DynatraceConnectorOperator]
  val VALIDATE_NON_NEGATIVE = "VALIDATE_NON_NEGATIVE".asInstanceOf[DynatraceConnectorOperator]
  val VALIDATE_NUMERIC = "VALIDATE_NUMERIC".asInstanceOf[DynatraceConnectorOperator]
  val NO_OP = "NO_OP".asInstanceOf[DynatraceConnectorOperator]

  @inline def values: js.Array[DynatraceConnectorOperator] = js.Array(
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

@js.native
sealed trait ExecutionStatus extends js.Any
object ExecutionStatus {
  val InProgress = "InProgress".asInstanceOf[ExecutionStatus]
  val Successful = "Successful".asInstanceOf[ExecutionStatus]
  val Error = "Error".asInstanceOf[ExecutionStatus]

  @inline def values: js.Array[ExecutionStatus] = js.Array(InProgress, Successful, Error)
}

@js.native
sealed trait FileType extends js.Any
object FileType {
  val CSV = "CSV".asInstanceOf[FileType]
  val JSON = "JSON".asInstanceOf[FileType]
  val PARQUET = "PARQUET".asInstanceOf[FileType]

  @inline def values: js.Array[FileType] = js.Array(CSV, JSON, PARQUET)
}

@js.native
sealed trait FlowStatus extends js.Any
object FlowStatus {
  val Active = "Active".asInstanceOf[FlowStatus]
  val Deprecated = "Deprecated".asInstanceOf[FlowStatus]
  val Deleted = "Deleted".asInstanceOf[FlowStatus]
  val Draft = "Draft".asInstanceOf[FlowStatus]
  val Errored = "Errored".asInstanceOf[FlowStatus]
  val Suspended = "Suspended".asInstanceOf[FlowStatus]

  @inline def values: js.Array[FlowStatus] = js.Array(Active, Deprecated, Deleted, Draft, Errored, Suspended)
}

@js.native
sealed trait GoogleAnalyticsConnectorOperator extends js.Any
object GoogleAnalyticsConnectorOperator {
  val PROJECTION = "PROJECTION".asInstanceOf[GoogleAnalyticsConnectorOperator]
  val BETWEEN = "BETWEEN".asInstanceOf[GoogleAnalyticsConnectorOperator]

  @inline def values: js.Array[GoogleAnalyticsConnectorOperator] = js.Array(PROJECTION, BETWEEN)
}

@js.native
sealed trait InforNexusConnectorOperator extends js.Any
object InforNexusConnectorOperator {
  val PROJECTION = "PROJECTION".asInstanceOf[InforNexusConnectorOperator]
  val BETWEEN = "BETWEEN".asInstanceOf[InforNexusConnectorOperator]
  val EQUAL_TO = "EQUAL_TO".asInstanceOf[InforNexusConnectorOperator]
  val ADDITION = "ADDITION".asInstanceOf[InforNexusConnectorOperator]
  val MULTIPLICATION = "MULTIPLICATION".asInstanceOf[InforNexusConnectorOperator]
  val DIVISION = "DIVISION".asInstanceOf[InforNexusConnectorOperator]
  val SUBTRACTION = "SUBTRACTION".asInstanceOf[InforNexusConnectorOperator]
  val MASK_ALL = "MASK_ALL".asInstanceOf[InforNexusConnectorOperator]
  val MASK_FIRST_N = "MASK_FIRST_N".asInstanceOf[InforNexusConnectorOperator]
  val MASK_LAST_N = "MASK_LAST_N".asInstanceOf[InforNexusConnectorOperator]
  val VALIDATE_NON_NULL = "VALIDATE_NON_NULL".asInstanceOf[InforNexusConnectorOperator]
  val VALIDATE_NON_ZERO = "VALIDATE_NON_ZERO".asInstanceOf[InforNexusConnectorOperator]
  val VALIDATE_NON_NEGATIVE = "VALIDATE_NON_NEGATIVE".asInstanceOf[InforNexusConnectorOperator]
  val VALIDATE_NUMERIC = "VALIDATE_NUMERIC".asInstanceOf[InforNexusConnectorOperator]
  val NO_OP = "NO_OP".asInstanceOf[InforNexusConnectorOperator]

  @inline def values: js.Array[InforNexusConnectorOperator] = js.Array(
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

@js.native
sealed trait MarketoConnectorOperator extends js.Any
object MarketoConnectorOperator {
  val PROJECTION = "PROJECTION".asInstanceOf[MarketoConnectorOperator]
  val LESS_THAN = "LESS_THAN".asInstanceOf[MarketoConnectorOperator]
  val GREATER_THAN = "GREATER_THAN".asInstanceOf[MarketoConnectorOperator]
  val BETWEEN = "BETWEEN".asInstanceOf[MarketoConnectorOperator]
  val ADDITION = "ADDITION".asInstanceOf[MarketoConnectorOperator]
  val MULTIPLICATION = "MULTIPLICATION".asInstanceOf[MarketoConnectorOperator]
  val DIVISION = "DIVISION".asInstanceOf[MarketoConnectorOperator]
  val SUBTRACTION = "SUBTRACTION".asInstanceOf[MarketoConnectorOperator]
  val MASK_ALL = "MASK_ALL".asInstanceOf[MarketoConnectorOperator]
  val MASK_FIRST_N = "MASK_FIRST_N".asInstanceOf[MarketoConnectorOperator]
  val MASK_LAST_N = "MASK_LAST_N".asInstanceOf[MarketoConnectorOperator]
  val VALIDATE_NON_NULL = "VALIDATE_NON_NULL".asInstanceOf[MarketoConnectorOperator]
  val VALIDATE_NON_ZERO = "VALIDATE_NON_ZERO".asInstanceOf[MarketoConnectorOperator]
  val VALIDATE_NON_NEGATIVE = "VALIDATE_NON_NEGATIVE".asInstanceOf[MarketoConnectorOperator]
  val VALIDATE_NUMERIC = "VALIDATE_NUMERIC".asInstanceOf[MarketoConnectorOperator]
  val NO_OP = "NO_OP".asInstanceOf[MarketoConnectorOperator]

  @inline def values: js.Array[MarketoConnectorOperator] = js.Array(
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

@js.native
sealed trait Operator extends js.Any
object Operator {
  val PROJECTION = "PROJECTION".asInstanceOf[Operator]
  val LESS_THAN = "LESS_THAN".asInstanceOf[Operator]
  val GREATER_THAN = "GREATER_THAN".asInstanceOf[Operator]
  val CONTAINS = "CONTAINS".asInstanceOf[Operator]
  val BETWEEN = "BETWEEN".asInstanceOf[Operator]
  val LESS_THAN_OR_EQUAL_TO = "LESS_THAN_OR_EQUAL_TO".asInstanceOf[Operator]
  val GREATER_THAN_OR_EQUAL_TO = "GREATER_THAN_OR_EQUAL_TO".asInstanceOf[Operator]
  val EQUAL_TO = "EQUAL_TO".asInstanceOf[Operator]
  val NOT_EQUAL_TO = "NOT_EQUAL_TO".asInstanceOf[Operator]
  val ADDITION = "ADDITION".asInstanceOf[Operator]
  val MULTIPLICATION = "MULTIPLICATION".asInstanceOf[Operator]
  val DIVISION = "DIVISION".asInstanceOf[Operator]
  val SUBTRACTION = "SUBTRACTION".asInstanceOf[Operator]
  val MASK_ALL = "MASK_ALL".asInstanceOf[Operator]
  val MASK_FIRST_N = "MASK_FIRST_N".asInstanceOf[Operator]
  val MASK_LAST_N = "MASK_LAST_N".asInstanceOf[Operator]
  val VALIDATE_NON_NULL = "VALIDATE_NON_NULL".asInstanceOf[Operator]
  val VALIDATE_NON_ZERO = "VALIDATE_NON_ZERO".asInstanceOf[Operator]
  val VALIDATE_NON_NEGATIVE = "VALIDATE_NON_NEGATIVE".asInstanceOf[Operator]
  val VALIDATE_NUMERIC = "VALIDATE_NUMERIC".asInstanceOf[Operator]
  val NO_OP = "NO_OP".asInstanceOf[Operator]

  @inline def values: js.Array[Operator] = js.Array(
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

@js.native
sealed trait OperatorPropertiesKeys extends js.Any
object OperatorPropertiesKeys {
  val VALUE = "VALUE".asInstanceOf[OperatorPropertiesKeys]
  val VALUES = "VALUES".asInstanceOf[OperatorPropertiesKeys]
  val DATA_TYPE = "DATA_TYPE".asInstanceOf[OperatorPropertiesKeys]
  val UPPER_BOUND = "UPPER_BOUND".asInstanceOf[OperatorPropertiesKeys]
  val LOWER_BOUND = "LOWER_BOUND".asInstanceOf[OperatorPropertiesKeys]
  val SOURCE_DATA_TYPE = "SOURCE_DATA_TYPE".asInstanceOf[OperatorPropertiesKeys]
  val DESTINATION_DATA_TYPE = "DESTINATION_DATA_TYPE".asInstanceOf[OperatorPropertiesKeys]
  val VALIDATION_ACTION = "VALIDATION_ACTION".asInstanceOf[OperatorPropertiesKeys]
  val MASK_VALUE = "MASK_VALUE".asInstanceOf[OperatorPropertiesKeys]
  val MASK_LENGTH = "MASK_LENGTH".asInstanceOf[OperatorPropertiesKeys]
  val TRUNCATE_LENGTH = "TRUNCATE_LENGTH".asInstanceOf[OperatorPropertiesKeys]
  val MATH_OPERATION_FIELDS_ORDER = "MATH_OPERATION_FIELDS_ORDER".asInstanceOf[OperatorPropertiesKeys]
  val CONCAT_FORMAT = "CONCAT_FORMAT".asInstanceOf[OperatorPropertiesKeys]
  val SUBFIELD_CATEGORY_MAP = "SUBFIELD_CATEGORY_MAP".asInstanceOf[OperatorPropertiesKeys]

  @inline def values: js.Array[OperatorPropertiesKeys] = js.Array(
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
    SUBFIELD_CATEGORY_MAP
  )
}

@js.native
sealed trait PrefixFormat extends js.Any
object PrefixFormat {
  val YEAR = "YEAR".asInstanceOf[PrefixFormat]
  val MONTH = "MONTH".asInstanceOf[PrefixFormat]
  val DAY = "DAY".asInstanceOf[PrefixFormat]
  val HOUR = "HOUR".asInstanceOf[PrefixFormat]
  val MINUTE = "MINUTE".asInstanceOf[PrefixFormat]

  @inline def values: js.Array[PrefixFormat] = js.Array(YEAR, MONTH, DAY, HOUR, MINUTE)
}

@js.native
sealed trait PrefixType extends js.Any
object PrefixType {
  val FILENAME = "FILENAME".asInstanceOf[PrefixType]
  val PATH = "PATH".asInstanceOf[PrefixType]
  val PATH_AND_FILENAME = "PATH_AND_FILENAME".asInstanceOf[PrefixType]

  @inline def values: js.Array[PrefixType] = js.Array(FILENAME, PATH, PATH_AND_FILENAME)
}

@js.native
sealed trait S3ConnectorOperator extends js.Any
object S3ConnectorOperator {
  val PROJECTION = "PROJECTION".asInstanceOf[S3ConnectorOperator]
  val LESS_THAN = "LESS_THAN".asInstanceOf[S3ConnectorOperator]
  val GREATER_THAN = "GREATER_THAN".asInstanceOf[S3ConnectorOperator]
  val BETWEEN = "BETWEEN".asInstanceOf[S3ConnectorOperator]
  val LESS_THAN_OR_EQUAL_TO = "LESS_THAN_OR_EQUAL_TO".asInstanceOf[S3ConnectorOperator]
  val GREATER_THAN_OR_EQUAL_TO = "GREATER_THAN_OR_EQUAL_TO".asInstanceOf[S3ConnectorOperator]
  val EQUAL_TO = "EQUAL_TO".asInstanceOf[S3ConnectorOperator]
  val NOT_EQUAL_TO = "NOT_EQUAL_TO".asInstanceOf[S3ConnectorOperator]
  val ADDITION = "ADDITION".asInstanceOf[S3ConnectorOperator]
  val MULTIPLICATION = "MULTIPLICATION".asInstanceOf[S3ConnectorOperator]
  val DIVISION = "DIVISION".asInstanceOf[S3ConnectorOperator]
  val SUBTRACTION = "SUBTRACTION".asInstanceOf[S3ConnectorOperator]
  val MASK_ALL = "MASK_ALL".asInstanceOf[S3ConnectorOperator]
  val MASK_FIRST_N = "MASK_FIRST_N".asInstanceOf[S3ConnectorOperator]
  val MASK_LAST_N = "MASK_LAST_N".asInstanceOf[S3ConnectorOperator]
  val VALIDATE_NON_NULL = "VALIDATE_NON_NULL".asInstanceOf[S3ConnectorOperator]
  val VALIDATE_NON_ZERO = "VALIDATE_NON_ZERO".asInstanceOf[S3ConnectorOperator]
  val VALIDATE_NON_NEGATIVE = "VALIDATE_NON_NEGATIVE".asInstanceOf[S3ConnectorOperator]
  val VALIDATE_NUMERIC = "VALIDATE_NUMERIC".asInstanceOf[S3ConnectorOperator]
  val NO_OP = "NO_OP".asInstanceOf[S3ConnectorOperator]

  @inline def values: js.Array[S3ConnectorOperator] = js.Array(
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

@js.native
sealed trait SalesforceConnectorOperator extends js.Any
object SalesforceConnectorOperator {
  val PROJECTION = "PROJECTION".asInstanceOf[SalesforceConnectorOperator]
  val LESS_THAN = "LESS_THAN".asInstanceOf[SalesforceConnectorOperator]
  val CONTAINS = "CONTAINS".asInstanceOf[SalesforceConnectorOperator]
  val GREATER_THAN = "GREATER_THAN".asInstanceOf[SalesforceConnectorOperator]
  val BETWEEN = "BETWEEN".asInstanceOf[SalesforceConnectorOperator]
  val LESS_THAN_OR_EQUAL_TO = "LESS_THAN_OR_EQUAL_TO".asInstanceOf[SalesforceConnectorOperator]
  val GREATER_THAN_OR_EQUAL_TO = "GREATER_THAN_OR_EQUAL_TO".asInstanceOf[SalesforceConnectorOperator]
  val EQUAL_TO = "EQUAL_TO".asInstanceOf[SalesforceConnectorOperator]
  val NOT_EQUAL_TO = "NOT_EQUAL_TO".asInstanceOf[SalesforceConnectorOperator]
  val ADDITION = "ADDITION".asInstanceOf[SalesforceConnectorOperator]
  val MULTIPLICATION = "MULTIPLICATION".asInstanceOf[SalesforceConnectorOperator]
  val DIVISION = "DIVISION".asInstanceOf[SalesforceConnectorOperator]
  val SUBTRACTION = "SUBTRACTION".asInstanceOf[SalesforceConnectorOperator]
  val MASK_ALL = "MASK_ALL".asInstanceOf[SalesforceConnectorOperator]
  val MASK_FIRST_N = "MASK_FIRST_N".asInstanceOf[SalesforceConnectorOperator]
  val MASK_LAST_N = "MASK_LAST_N".asInstanceOf[SalesforceConnectorOperator]
  val VALIDATE_NON_NULL = "VALIDATE_NON_NULL".asInstanceOf[SalesforceConnectorOperator]
  val VALIDATE_NON_ZERO = "VALIDATE_NON_ZERO".asInstanceOf[SalesforceConnectorOperator]
  val VALIDATE_NON_NEGATIVE = "VALIDATE_NON_NEGATIVE".asInstanceOf[SalesforceConnectorOperator]
  val VALIDATE_NUMERIC = "VALIDATE_NUMERIC".asInstanceOf[SalesforceConnectorOperator]
  val NO_OP = "NO_OP".asInstanceOf[SalesforceConnectorOperator]

  @inline def values: js.Array[SalesforceConnectorOperator] = js.Array(
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

@js.native
sealed trait ScheduleFrequencyType extends js.Any
object ScheduleFrequencyType {
  val BYMINUTE = "BYMINUTE".asInstanceOf[ScheduleFrequencyType]
  val HOURLY = "HOURLY".asInstanceOf[ScheduleFrequencyType]
  val DAILY = "DAILY".asInstanceOf[ScheduleFrequencyType]
  val WEEKLY = "WEEKLY".asInstanceOf[ScheduleFrequencyType]
  val MONTHLY = "MONTHLY".asInstanceOf[ScheduleFrequencyType]
  val ONCE = "ONCE".asInstanceOf[ScheduleFrequencyType]

  @inline def values: js.Array[ScheduleFrequencyType] = js.Array(BYMINUTE, HOURLY, DAILY, WEEKLY, MONTHLY, ONCE)
}

@js.native
sealed trait ServiceNowConnectorOperator extends js.Any
object ServiceNowConnectorOperator {
  val PROJECTION = "PROJECTION".asInstanceOf[ServiceNowConnectorOperator]
  val CONTAINS = "CONTAINS".asInstanceOf[ServiceNowConnectorOperator]
  val LESS_THAN = "LESS_THAN".asInstanceOf[ServiceNowConnectorOperator]
  val GREATER_THAN = "GREATER_THAN".asInstanceOf[ServiceNowConnectorOperator]
  val BETWEEN = "BETWEEN".asInstanceOf[ServiceNowConnectorOperator]
  val LESS_THAN_OR_EQUAL_TO = "LESS_THAN_OR_EQUAL_TO".asInstanceOf[ServiceNowConnectorOperator]
  val GREATER_THAN_OR_EQUAL_TO = "GREATER_THAN_OR_EQUAL_TO".asInstanceOf[ServiceNowConnectorOperator]
  val EQUAL_TO = "EQUAL_TO".asInstanceOf[ServiceNowConnectorOperator]
  val NOT_EQUAL_TO = "NOT_EQUAL_TO".asInstanceOf[ServiceNowConnectorOperator]
  val ADDITION = "ADDITION".asInstanceOf[ServiceNowConnectorOperator]
  val MULTIPLICATION = "MULTIPLICATION".asInstanceOf[ServiceNowConnectorOperator]
  val DIVISION = "DIVISION".asInstanceOf[ServiceNowConnectorOperator]
  val SUBTRACTION = "SUBTRACTION".asInstanceOf[ServiceNowConnectorOperator]
  val MASK_ALL = "MASK_ALL".asInstanceOf[ServiceNowConnectorOperator]
  val MASK_FIRST_N = "MASK_FIRST_N".asInstanceOf[ServiceNowConnectorOperator]
  val MASK_LAST_N = "MASK_LAST_N".asInstanceOf[ServiceNowConnectorOperator]
  val VALIDATE_NON_NULL = "VALIDATE_NON_NULL".asInstanceOf[ServiceNowConnectorOperator]
  val VALIDATE_NON_ZERO = "VALIDATE_NON_ZERO".asInstanceOf[ServiceNowConnectorOperator]
  val VALIDATE_NON_NEGATIVE = "VALIDATE_NON_NEGATIVE".asInstanceOf[ServiceNowConnectorOperator]
  val VALIDATE_NUMERIC = "VALIDATE_NUMERIC".asInstanceOf[ServiceNowConnectorOperator]
  val NO_OP = "NO_OP".asInstanceOf[ServiceNowConnectorOperator]

  @inline def values: js.Array[ServiceNowConnectorOperator] = js.Array(
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

@js.native
sealed trait SingularConnectorOperator extends js.Any
object SingularConnectorOperator {
  val PROJECTION = "PROJECTION".asInstanceOf[SingularConnectorOperator]
  val EQUAL_TO = "EQUAL_TO".asInstanceOf[SingularConnectorOperator]
  val ADDITION = "ADDITION".asInstanceOf[SingularConnectorOperator]
  val MULTIPLICATION = "MULTIPLICATION".asInstanceOf[SingularConnectorOperator]
  val DIVISION = "DIVISION".asInstanceOf[SingularConnectorOperator]
  val SUBTRACTION = "SUBTRACTION".asInstanceOf[SingularConnectorOperator]
  val MASK_ALL = "MASK_ALL".asInstanceOf[SingularConnectorOperator]
  val MASK_FIRST_N = "MASK_FIRST_N".asInstanceOf[SingularConnectorOperator]
  val MASK_LAST_N = "MASK_LAST_N".asInstanceOf[SingularConnectorOperator]
  val VALIDATE_NON_NULL = "VALIDATE_NON_NULL".asInstanceOf[SingularConnectorOperator]
  val VALIDATE_NON_ZERO = "VALIDATE_NON_ZERO".asInstanceOf[SingularConnectorOperator]
  val VALIDATE_NON_NEGATIVE = "VALIDATE_NON_NEGATIVE".asInstanceOf[SingularConnectorOperator]
  val VALIDATE_NUMERIC = "VALIDATE_NUMERIC".asInstanceOf[SingularConnectorOperator]
  val NO_OP = "NO_OP".asInstanceOf[SingularConnectorOperator]

  @inline def values: js.Array[SingularConnectorOperator] = js.Array(
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

@js.native
sealed trait SlackConnectorOperator extends js.Any
object SlackConnectorOperator {
  val PROJECTION = "PROJECTION".asInstanceOf[SlackConnectorOperator]
  val LESS_THAN = "LESS_THAN".asInstanceOf[SlackConnectorOperator]
  val GREATER_THAN = "GREATER_THAN".asInstanceOf[SlackConnectorOperator]
  val BETWEEN = "BETWEEN".asInstanceOf[SlackConnectorOperator]
  val LESS_THAN_OR_EQUAL_TO = "LESS_THAN_OR_EQUAL_TO".asInstanceOf[SlackConnectorOperator]
  val GREATER_THAN_OR_EQUAL_TO = "GREATER_THAN_OR_EQUAL_TO".asInstanceOf[SlackConnectorOperator]
  val EQUAL_TO = "EQUAL_TO".asInstanceOf[SlackConnectorOperator]
  val ADDITION = "ADDITION".asInstanceOf[SlackConnectorOperator]
  val MULTIPLICATION = "MULTIPLICATION".asInstanceOf[SlackConnectorOperator]
  val DIVISION = "DIVISION".asInstanceOf[SlackConnectorOperator]
  val SUBTRACTION = "SUBTRACTION".asInstanceOf[SlackConnectorOperator]
  val MASK_ALL = "MASK_ALL".asInstanceOf[SlackConnectorOperator]
  val MASK_FIRST_N = "MASK_FIRST_N".asInstanceOf[SlackConnectorOperator]
  val MASK_LAST_N = "MASK_LAST_N".asInstanceOf[SlackConnectorOperator]
  val VALIDATE_NON_NULL = "VALIDATE_NON_NULL".asInstanceOf[SlackConnectorOperator]
  val VALIDATE_NON_ZERO = "VALIDATE_NON_ZERO".asInstanceOf[SlackConnectorOperator]
  val VALIDATE_NON_NEGATIVE = "VALIDATE_NON_NEGATIVE".asInstanceOf[SlackConnectorOperator]
  val VALIDATE_NUMERIC = "VALIDATE_NUMERIC".asInstanceOf[SlackConnectorOperator]
  val NO_OP = "NO_OP".asInstanceOf[SlackConnectorOperator]

  @inline def values: js.Array[SlackConnectorOperator] = js.Array(
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

@js.native
sealed trait TaskType extends js.Any
object TaskType {
  val Arithmetic = "Arithmetic".asInstanceOf[TaskType]
  val Filter = "Filter".asInstanceOf[TaskType]
  val Map = "Map".asInstanceOf[TaskType]
  val Mask = "Mask".asInstanceOf[TaskType]
  val Merge = "Merge".asInstanceOf[TaskType]
  val Truncate = "Truncate".asInstanceOf[TaskType]
  val Validate = "Validate".asInstanceOf[TaskType]

  @inline def values: js.Array[TaskType] = js.Array(Arithmetic, Filter, Map, Mask, Merge, Truncate, Validate)
}

@js.native
sealed trait TrendmicroConnectorOperator extends js.Any
object TrendmicroConnectorOperator {
  val PROJECTION = "PROJECTION".asInstanceOf[TrendmicroConnectorOperator]
  val EQUAL_TO = "EQUAL_TO".asInstanceOf[TrendmicroConnectorOperator]
  val ADDITION = "ADDITION".asInstanceOf[TrendmicroConnectorOperator]
  val MULTIPLICATION = "MULTIPLICATION".asInstanceOf[TrendmicroConnectorOperator]
  val DIVISION = "DIVISION".asInstanceOf[TrendmicroConnectorOperator]
  val SUBTRACTION = "SUBTRACTION".asInstanceOf[TrendmicroConnectorOperator]
  val MASK_ALL = "MASK_ALL".asInstanceOf[TrendmicroConnectorOperator]
  val MASK_FIRST_N = "MASK_FIRST_N".asInstanceOf[TrendmicroConnectorOperator]
  val MASK_LAST_N = "MASK_LAST_N".asInstanceOf[TrendmicroConnectorOperator]
  val VALIDATE_NON_NULL = "VALIDATE_NON_NULL".asInstanceOf[TrendmicroConnectorOperator]
  val VALIDATE_NON_ZERO = "VALIDATE_NON_ZERO".asInstanceOf[TrendmicroConnectorOperator]
  val VALIDATE_NON_NEGATIVE = "VALIDATE_NON_NEGATIVE".asInstanceOf[TrendmicroConnectorOperator]
  val VALIDATE_NUMERIC = "VALIDATE_NUMERIC".asInstanceOf[TrendmicroConnectorOperator]
  val NO_OP = "NO_OP".asInstanceOf[TrendmicroConnectorOperator]

  @inline def values: js.Array[TrendmicroConnectorOperator] = js.Array(
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

@js.native
sealed trait TriggerType extends js.Any
object TriggerType {
  val Scheduled = "Scheduled".asInstanceOf[TriggerType]
  val Event = "Event".asInstanceOf[TriggerType]
  val OnDemand = "OnDemand".asInstanceOf[TriggerType]

  @inline def values: js.Array[TriggerType] = js.Array(Scheduled, Event, OnDemand)
}

@js.native
sealed trait VeevaConnectorOperator extends js.Any
object VeevaConnectorOperator {
  val PROJECTION = "PROJECTION".asInstanceOf[VeevaConnectorOperator]
  val LESS_THAN = "LESS_THAN".asInstanceOf[VeevaConnectorOperator]
  val GREATER_THAN = "GREATER_THAN".asInstanceOf[VeevaConnectorOperator]
  val CONTAINS = "CONTAINS".asInstanceOf[VeevaConnectorOperator]
  val BETWEEN = "BETWEEN".asInstanceOf[VeevaConnectorOperator]
  val LESS_THAN_OR_EQUAL_TO = "LESS_THAN_OR_EQUAL_TO".asInstanceOf[VeevaConnectorOperator]
  val GREATER_THAN_OR_EQUAL_TO = "GREATER_THAN_OR_EQUAL_TO".asInstanceOf[VeevaConnectorOperator]
  val EQUAL_TO = "EQUAL_TO".asInstanceOf[VeevaConnectorOperator]
  val NOT_EQUAL_TO = "NOT_EQUAL_TO".asInstanceOf[VeevaConnectorOperator]
  val ADDITION = "ADDITION".asInstanceOf[VeevaConnectorOperator]
  val MULTIPLICATION = "MULTIPLICATION".asInstanceOf[VeevaConnectorOperator]
  val DIVISION = "DIVISION".asInstanceOf[VeevaConnectorOperator]
  val SUBTRACTION = "SUBTRACTION".asInstanceOf[VeevaConnectorOperator]
  val MASK_ALL = "MASK_ALL".asInstanceOf[VeevaConnectorOperator]
  val MASK_FIRST_N = "MASK_FIRST_N".asInstanceOf[VeevaConnectorOperator]
  val MASK_LAST_N = "MASK_LAST_N".asInstanceOf[VeevaConnectorOperator]
  val VALIDATE_NON_NULL = "VALIDATE_NON_NULL".asInstanceOf[VeevaConnectorOperator]
  val VALIDATE_NON_ZERO = "VALIDATE_NON_ZERO".asInstanceOf[VeevaConnectorOperator]
  val VALIDATE_NON_NEGATIVE = "VALIDATE_NON_NEGATIVE".asInstanceOf[VeevaConnectorOperator]
  val VALIDATE_NUMERIC = "VALIDATE_NUMERIC".asInstanceOf[VeevaConnectorOperator]
  val NO_OP = "NO_OP".asInstanceOf[VeevaConnectorOperator]

  @inline def values: js.Array[VeevaConnectorOperator] = js.Array(
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
@js.native
sealed trait WriteOperationType extends js.Any
object WriteOperationType {
  val INSERT = "INSERT".asInstanceOf[WriteOperationType]
  val UPSERT = "UPSERT".asInstanceOf[WriteOperationType]
  val UPDATE = "UPDATE".asInstanceOf[WriteOperationType]

  @inline def values: js.Array[WriteOperationType] = js.Array(INSERT, UPSERT, UPDATE)
}

@js.native
sealed trait ZendeskConnectorOperator extends js.Any
object ZendeskConnectorOperator {
  val PROJECTION = "PROJECTION".asInstanceOf[ZendeskConnectorOperator]
  val GREATER_THAN = "GREATER_THAN".asInstanceOf[ZendeskConnectorOperator]
  val ADDITION = "ADDITION".asInstanceOf[ZendeskConnectorOperator]
  val MULTIPLICATION = "MULTIPLICATION".asInstanceOf[ZendeskConnectorOperator]
  val DIVISION = "DIVISION".asInstanceOf[ZendeskConnectorOperator]
  val SUBTRACTION = "SUBTRACTION".asInstanceOf[ZendeskConnectorOperator]
  val MASK_ALL = "MASK_ALL".asInstanceOf[ZendeskConnectorOperator]
  val MASK_FIRST_N = "MASK_FIRST_N".asInstanceOf[ZendeskConnectorOperator]
  val MASK_LAST_N = "MASK_LAST_N".asInstanceOf[ZendeskConnectorOperator]
  val VALIDATE_NON_NULL = "VALIDATE_NON_NULL".asInstanceOf[ZendeskConnectorOperator]
  val VALIDATE_NON_ZERO = "VALIDATE_NON_ZERO".asInstanceOf[ZendeskConnectorOperator]
  val VALIDATE_NON_NEGATIVE = "VALIDATE_NON_NEGATIVE".asInstanceOf[ZendeskConnectorOperator]
  val VALIDATE_NUMERIC = "VALIDATE_NUMERIC".asInstanceOf[ZendeskConnectorOperator]
  val NO_OP = "NO_OP".asInstanceOf[ZendeskConnectorOperator]

  @inline def values: js.Array[ZendeskConnectorOperator] = js.Array(
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
