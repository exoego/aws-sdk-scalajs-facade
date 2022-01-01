package facade.amazonaws.services.customerprofiles

import scalajs.js

@js.native
sealed trait ConflictResolvingModel extends js.Any
object ConflictResolvingModel {
  val RECENCY = "RECENCY".asInstanceOf[ConflictResolvingModel]
  val SOURCE = "SOURCE".asInstanceOf[ConflictResolvingModel]

  @inline def values: js.Array[ConflictResolvingModel] = js.Array(RECENCY, SOURCE)
}

@js.native
sealed trait DataPullMode extends js.Any
object DataPullMode {
  val Incremental = "Incremental".asInstanceOf[DataPullMode]
  val Complete = "Complete".asInstanceOf[DataPullMode]

  @inline def values: js.Array[DataPullMode] = js.Array(Incremental, Complete)
}

@js.native
sealed trait FieldContentType extends js.Any
object FieldContentType {
  val STRING = "STRING".asInstanceOf[FieldContentType]
  val NUMBER = "NUMBER".asInstanceOf[FieldContentType]
  val PHONE_NUMBER = "PHONE_NUMBER".asInstanceOf[FieldContentType]
  val EMAIL_ADDRESS = "EMAIL_ADDRESS".asInstanceOf[FieldContentType]
  val NAME = "NAME".asInstanceOf[FieldContentType]

  @inline def values: js.Array[FieldContentType] = js.Array(STRING, NUMBER, PHONE_NUMBER, EMAIL_ADDRESS, NAME)
}

@js.native
sealed trait Gender extends js.Any
object Gender {
  val MALE = "MALE".asInstanceOf[Gender]
  val FEMALE = "FEMALE".asInstanceOf[Gender]
  val UNSPECIFIED = "UNSPECIFIED".asInstanceOf[Gender]

  @inline def values: js.Array[Gender] = js.Array(MALE, FEMALE, UNSPECIFIED)
}

@js.native
sealed trait IdentityResolutionJobStatus extends js.Any
object IdentityResolutionJobStatus {
  val PENDING = "PENDING".asInstanceOf[IdentityResolutionJobStatus]
  val PREPROCESSING = "PREPROCESSING".asInstanceOf[IdentityResolutionJobStatus]
  val FIND_MATCHING = "FIND_MATCHING".asInstanceOf[IdentityResolutionJobStatus]
  val MERGING = "MERGING".asInstanceOf[IdentityResolutionJobStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[IdentityResolutionJobStatus]
  val PARTIAL_SUCCESS = "PARTIAL_SUCCESS".asInstanceOf[IdentityResolutionJobStatus]
  val FAILED = "FAILED".asInstanceOf[IdentityResolutionJobStatus]

  @inline def values: js.Array[IdentityResolutionJobStatus] = js.Array(PENDING, PREPROCESSING, FIND_MATCHING, MERGING, COMPLETED, PARTIAL_SUCCESS, FAILED)
}

@js.native
sealed trait JobScheduleDayOfTheWeek extends js.Any
object JobScheduleDayOfTheWeek {
  val SUNDAY = "SUNDAY".asInstanceOf[JobScheduleDayOfTheWeek]
  val MONDAY = "MONDAY".asInstanceOf[JobScheduleDayOfTheWeek]
  val TUESDAY = "TUESDAY".asInstanceOf[JobScheduleDayOfTheWeek]
  val WEDNESDAY = "WEDNESDAY".asInstanceOf[JobScheduleDayOfTheWeek]
  val THURSDAY = "THURSDAY".asInstanceOf[JobScheduleDayOfTheWeek]
  val FRIDAY = "FRIDAY".asInstanceOf[JobScheduleDayOfTheWeek]
  val SATURDAY = "SATURDAY".asInstanceOf[JobScheduleDayOfTheWeek]

  @inline def values: js.Array[JobScheduleDayOfTheWeek] = js.Array(SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY)
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
sealed trait PartyType extends js.Any
object PartyType {
  val INDIVIDUAL = "INDIVIDUAL".asInstanceOf[PartyType]
  val BUSINESS = "BUSINESS".asInstanceOf[PartyType]
  val OTHER = "OTHER".asInstanceOf[PartyType]

  @inline def values: js.Array[PartyType] = js.Array(INDIVIDUAL, BUSINESS, OTHER)
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
sealed trait SourceConnectorType extends js.Any
object SourceConnectorType {
  val Salesforce = "Salesforce".asInstanceOf[SourceConnectorType]
  val Marketo = "Marketo".asInstanceOf[SourceConnectorType]
  val Zendesk = "Zendesk".asInstanceOf[SourceConnectorType]
  val Servicenow = "Servicenow".asInstanceOf[SourceConnectorType]
  val S3 = "S3".asInstanceOf[SourceConnectorType]

  @inline def values: js.Array[SourceConnectorType] = js.Array(Salesforce, Marketo, Zendesk, Servicenow, S3)
}

@js.native
sealed trait StandardIdentifier extends js.Any
object StandardIdentifier {
  val PROFILE = "PROFILE".asInstanceOf[StandardIdentifier]
  val ASSET = "ASSET".asInstanceOf[StandardIdentifier]
  val CASE = "CASE".asInstanceOf[StandardIdentifier]
  val UNIQUE = "UNIQUE".asInstanceOf[StandardIdentifier]
  val SECONDARY = "SECONDARY".asInstanceOf[StandardIdentifier]
  val LOOKUP_ONLY = "LOOKUP_ONLY".asInstanceOf[StandardIdentifier]
  val NEW_ONLY = "NEW_ONLY".asInstanceOf[StandardIdentifier]
  val ORDER = "ORDER".asInstanceOf[StandardIdentifier]

  @inline def values: js.Array[StandardIdentifier] = js.Array(PROFILE, ASSET, CASE, UNIQUE, SECONDARY, LOOKUP_ONLY, NEW_ONLY, ORDER)
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
sealed trait TriggerType extends js.Any
object TriggerType {
  val Scheduled = "Scheduled".asInstanceOf[TriggerType]
  val Event = "Event".asInstanceOf[TriggerType]
  val OnDemand = "OnDemand".asInstanceOf[TriggerType]

  @inline def values: js.Array[TriggerType] = js.Array(Scheduled, Event, OnDemand)
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
