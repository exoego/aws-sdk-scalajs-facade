package facade.amazonaws.services.customerprofiles

import scalajs.js

type ConflictResolvingModel = "RECENCY" | "SOURCE"
object ConflictResolvingModel {
  inline val RECENCY: "RECENCY" = "RECENCY"
  inline val SOURCE: "SOURCE" = "SOURCE"

  inline def values: js.Array[ConflictResolvingModel] = js.Array(RECENCY, SOURCE)
}

type DataPullMode = "Incremental" | "Complete"
object DataPullMode {
  inline val Incremental: "Incremental" = "Incremental"
  inline val Complete: "Complete" = "Complete"

  inline def values: js.Array[DataPullMode] = js.Array(Incremental, Complete)
}

type FieldContentType = "STRING" | "NUMBER" | "PHONE_NUMBER" | "EMAIL_ADDRESS" | "NAME"
object FieldContentType {
  inline val STRING: "STRING" = "STRING"
  inline val NUMBER: "NUMBER" = "NUMBER"
  inline val PHONE_NUMBER: "PHONE_NUMBER" = "PHONE_NUMBER"
  inline val EMAIL_ADDRESS: "EMAIL_ADDRESS" = "EMAIL_ADDRESS"
  inline val NAME: "NAME" = "NAME"

  inline def values: js.Array[FieldContentType] = js.Array(STRING, NUMBER, PHONE_NUMBER, EMAIL_ADDRESS, NAME)
}

type Gender = "MALE" | "FEMALE" | "UNSPECIFIED"
object Gender {
  inline val MALE: "MALE" = "MALE"
  inline val FEMALE: "FEMALE" = "FEMALE"
  inline val UNSPECIFIED: "UNSPECIFIED" = "UNSPECIFIED"

  inline def values: js.Array[Gender] = js.Array(MALE, FEMALE, UNSPECIFIED)
}

type IdentityResolutionJobStatus = "PENDING" | "PREPROCESSING" | "FIND_MATCHING" | "MERGING" | "COMPLETED" | "PARTIAL_SUCCESS" | "FAILED"
object IdentityResolutionJobStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val PREPROCESSING: "PREPROCESSING" = "PREPROCESSING"
  inline val FIND_MATCHING: "FIND_MATCHING" = "FIND_MATCHING"
  inline val MERGING: "MERGING" = "MERGING"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val PARTIAL_SUCCESS: "PARTIAL_SUCCESS" = "PARTIAL_SUCCESS"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[IdentityResolutionJobStatus] = js.Array(PENDING, PREPROCESSING, FIND_MATCHING, MERGING, COMPLETED, PARTIAL_SUCCESS, FAILED)
}

type JobScheduleDayOfTheWeek = "SUNDAY" | "MONDAY" | "TUESDAY" | "WEDNESDAY" | "THURSDAY" | "FRIDAY" | "SATURDAY"
object JobScheduleDayOfTheWeek {
  inline val SUNDAY: "SUNDAY" = "SUNDAY"
  inline val MONDAY: "MONDAY" = "MONDAY"
  inline val TUESDAY: "TUESDAY" = "TUESDAY"
  inline val WEDNESDAY: "WEDNESDAY" = "WEDNESDAY"
  inline val THURSDAY: "THURSDAY" = "THURSDAY"
  inline val FRIDAY: "FRIDAY" = "FRIDAY"
  inline val SATURDAY: "SATURDAY" = "SATURDAY"

  inline def values: js.Array[JobScheduleDayOfTheWeek] = js.Array(SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY)
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

type OperatorPropertiesKeys = "VALUE" | "VALUES" | "DATA_TYPE" | "UPPER_BOUND" | "LOWER_BOUND" | "SOURCE_DATA_TYPE" | "DESTINATION_DATA_TYPE" | "VALIDATION_ACTION" | "MASK_VALUE" | "MASK_LENGTH" | "TRUNCATE_LENGTH" | "MATH_OPERATION_FIELDS_ORDER" | "CONCAT_FORMAT" | "SUBFIELD_CATEGORY_MAP"
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
    SUBFIELD_CATEGORY_MAP
  )
}

type PartyType = "INDIVIDUAL" | "BUSINESS" | "OTHER"
object PartyType {
  inline val INDIVIDUAL: "INDIVIDUAL" = "INDIVIDUAL"
  inline val BUSINESS: "BUSINESS" = "BUSINESS"
  inline val OTHER: "OTHER" = "OTHER"

  inline def values: js.Array[PartyType] = js.Array(INDIVIDUAL, BUSINESS, OTHER)
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

type SourceConnectorType = "Salesforce" | "Marketo" | "Zendesk" | "Servicenow" | "S3"
object SourceConnectorType {
  inline val Salesforce: "Salesforce" = "Salesforce"
  inline val Marketo: "Marketo" = "Marketo"
  inline val Zendesk: "Zendesk" = "Zendesk"
  inline val Servicenow: "Servicenow" = "Servicenow"
  inline val S3: "S3" = "S3"

  inline def values: js.Array[SourceConnectorType] = js.Array(Salesforce, Marketo, Zendesk, Servicenow, S3)
}

type StandardIdentifier = "PROFILE" | "ASSET" | "CASE" | "UNIQUE" | "SECONDARY" | "LOOKUP_ONLY" | "NEW_ONLY" | "ORDER"
object StandardIdentifier {
  inline val PROFILE: "PROFILE" = "PROFILE"
  inline val ASSET: "ASSET" = "ASSET"
  inline val CASE: "CASE" = "CASE"
  inline val UNIQUE: "UNIQUE" = "UNIQUE"
  inline val SECONDARY: "SECONDARY" = "SECONDARY"
  inline val LOOKUP_ONLY: "LOOKUP_ONLY" = "LOOKUP_ONLY"
  inline val NEW_ONLY: "NEW_ONLY" = "NEW_ONLY"
  inline val ORDER: "ORDER" = "ORDER"

  inline def values: js.Array[StandardIdentifier] = js.Array(PROFILE, ASSET, CASE, UNIQUE, SECONDARY, LOOKUP_ONLY, NEW_ONLY, ORDER)
}

type Status = "NOT_STARTED" | "IN_PROGRESS" | "COMPLETE" | "FAILED" | "SPLIT" | "RETRY" | "CANCELLED"
object Status {
  inline val NOT_STARTED: "NOT_STARTED" = "NOT_STARTED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETE: "COMPLETE" = "COMPLETE"
  inline val FAILED: "FAILED" = "FAILED"
  inline val SPLIT: "SPLIT" = "SPLIT"
  inline val RETRY: "RETRY" = "RETRY"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"

  inline def values: js.Array[Status] = js.Array(NOT_STARTED, IN_PROGRESS, COMPLETE, FAILED, SPLIT, RETRY, CANCELLED)
}

type TaskType = "Arithmetic" | "Filter" | "Map" | "Mask" | "Merge" | "Truncate" | "Validate"
object TaskType {
  inline val Arithmetic: "Arithmetic" = "Arithmetic"
  inline val Filter: "Filter" = "Filter"
  inline val Map: "Map" = "Map"
  inline val Mask: "Mask" = "Mask"
  inline val Merge: "Merge" = "Merge"
  inline val Truncate: "Truncate" = "Truncate"
  inline val Validate: "Validate" = "Validate"

  inline def values: js.Array[TaskType] = js.Array(Arithmetic, Filter, Map, Mask, Merge, Truncate, Validate)
}

type TriggerType = "Scheduled" | "Event" | "OnDemand"
object TriggerType {
  inline val Scheduled: "Scheduled" = "Scheduled"
  inline val Event: "Event" = "Event"
  inline val OnDemand: "OnDemand" = "OnDemand"

  inline def values: js.Array[TriggerType] = js.Array(Scheduled, Event, OnDemand)
}

type WorkflowType = "APPFLOW_INTEGRATION"
object WorkflowType {
  inline val APPFLOW_INTEGRATION: "APPFLOW_INTEGRATION" = "APPFLOW_INTEGRATION"

  inline def values: js.Array[WorkflowType] = js.Array(APPFLOW_INTEGRATION)
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

type logicalOperator = "AND" | "OR"
object logicalOperator {
  inline val AND: "AND" = "AND"
  inline val OR: "OR" = "OR"

  inline def values: js.Array[logicalOperator] = js.Array(AND, OR)
}
