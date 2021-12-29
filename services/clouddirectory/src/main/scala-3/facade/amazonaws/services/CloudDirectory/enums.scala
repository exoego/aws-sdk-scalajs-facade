package facade.amazonaws.services.clouddirectory

import scalajs._

type BatchReadExceptionType = "ValidationException" | "InvalidArnException" | "ResourceNotFoundException" | "InvalidNextTokenException" | "AccessDeniedException" | "NotNodeException" | "FacetValidationException" | "CannotListParentOfRootException" | "NotIndexException" | "NotPolicyException" | "DirectoryNotEnabledException" | "LimitExceededException" | "InternalServiceException"
object BatchReadExceptionType {
  inline val ValidationException: "ValidationException" = "ValidationException"
  inline val InvalidArnException: "InvalidArnException" = "InvalidArnException"
  inline val ResourceNotFoundException: "ResourceNotFoundException" = "ResourceNotFoundException"
  inline val InvalidNextTokenException: "InvalidNextTokenException" = "InvalidNextTokenException"
  inline val AccessDeniedException: "AccessDeniedException" = "AccessDeniedException"
  inline val NotNodeException: "NotNodeException" = "NotNodeException"
  inline val FacetValidationException: "FacetValidationException" = "FacetValidationException"
  inline val CannotListParentOfRootException: "CannotListParentOfRootException" = "CannotListParentOfRootException"
  inline val NotIndexException: "NotIndexException" = "NotIndexException"
  inline val NotPolicyException: "NotPolicyException" = "NotPolicyException"
  inline val DirectoryNotEnabledException: "DirectoryNotEnabledException" = "DirectoryNotEnabledException"
  inline val LimitExceededException: "LimitExceededException" = "LimitExceededException"
  inline val InternalServiceException: "InternalServiceException" = "InternalServiceException"

  inline def values: js.Array[BatchReadExceptionType] = js.Array(
    ValidationException,
    InvalidArnException,
    ResourceNotFoundException,
    InvalidNextTokenException,
    AccessDeniedException,
    NotNodeException,
    FacetValidationException,
    CannotListParentOfRootException,
    NotIndexException,
    NotPolicyException,
    DirectoryNotEnabledException,
    LimitExceededException,
    InternalServiceException
  )
}

type ConsistencyLevel = "SERIALIZABLE" | "EVENTUAL"
object ConsistencyLevel {
  inline val SERIALIZABLE: "SERIALIZABLE" = "SERIALIZABLE"
  inline val EVENTUAL: "EVENTUAL" = "EVENTUAL"

  inline def values: js.Array[ConsistencyLevel] = js.Array(SERIALIZABLE, EVENTUAL)
}

type DirectoryState = "ENABLED" | "DISABLED" | "DELETED"
object DirectoryState {
  inline val ENABLED: "ENABLED" = "ENABLED"
  inline val DISABLED: "DISABLED" = "DISABLED"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[DirectoryState] = js.Array(ENABLED, DISABLED, DELETED)
}

type FacetAttributeType = "STRING" | "BINARY" | "BOOLEAN" | "NUMBER" | "DATETIME" | "VARIANT"
object FacetAttributeType {
  inline val STRING: "STRING" = "STRING"
  inline val BINARY: "BINARY" = "BINARY"
  inline val BOOLEAN: "BOOLEAN" = "BOOLEAN"
  inline val NUMBER: "NUMBER" = "NUMBER"
  inline val DATETIME: "DATETIME" = "DATETIME"
  inline val VARIANT: "VARIANT" = "VARIANT"

  inline def values: js.Array[FacetAttributeType] = js.Array(STRING, BINARY, BOOLEAN, NUMBER, DATETIME, VARIANT)
}

type FacetStyle = "STATIC" | "DYNAMIC"
object FacetStyle {
  inline val STATIC: "STATIC" = "STATIC"
  inline val DYNAMIC: "DYNAMIC" = "DYNAMIC"

  inline def values: js.Array[FacetStyle] = js.Array(STATIC, DYNAMIC)
}

type ObjectType = "NODE" | "LEAF_NODE" | "POLICY" | "INDEX"
object ObjectType {
  inline val NODE: "NODE" = "NODE"
  inline val LEAF_NODE: "LEAF_NODE" = "LEAF_NODE"
  inline val POLICY: "POLICY" = "POLICY"
  inline val INDEX: "INDEX" = "INDEX"

  inline def values: js.Array[ObjectType] = js.Array(NODE, LEAF_NODE, POLICY, INDEX)
}

type RangeMode = "FIRST" | "LAST" | "LAST_BEFORE_MISSING_VALUES" | "INCLUSIVE" | "EXCLUSIVE"
object RangeMode {
  inline val FIRST: "FIRST" = "FIRST"
  inline val LAST: "LAST" = "LAST"
  inline val LAST_BEFORE_MISSING_VALUES: "LAST_BEFORE_MISSING_VALUES" = "LAST_BEFORE_MISSING_VALUES"
  inline val INCLUSIVE: "INCLUSIVE" = "INCLUSIVE"
  inline val EXCLUSIVE: "EXCLUSIVE" = "EXCLUSIVE"

  inline def values: js.Array[RangeMode] = js.Array(FIRST, LAST, LAST_BEFORE_MISSING_VALUES, INCLUSIVE, EXCLUSIVE)
}

type RequiredAttributeBehavior = "REQUIRED_ALWAYS" | "NOT_REQUIRED"
object RequiredAttributeBehavior {
  inline val REQUIRED_ALWAYS: "REQUIRED_ALWAYS" = "REQUIRED_ALWAYS"
  inline val NOT_REQUIRED: "NOT_REQUIRED" = "NOT_REQUIRED"

  inline def values: js.Array[RequiredAttributeBehavior] = js.Array(REQUIRED_ALWAYS, NOT_REQUIRED)
}

type RuleType = "BINARY_LENGTH" | "NUMBER_COMPARISON" | "STRING_FROM_SET" | "STRING_LENGTH"
object RuleType {
  inline val BINARY_LENGTH: "BINARY_LENGTH" = "BINARY_LENGTH"
  inline val NUMBER_COMPARISON: "NUMBER_COMPARISON" = "NUMBER_COMPARISON"
  inline val STRING_FROM_SET: "STRING_FROM_SET" = "STRING_FROM_SET"
  inline val STRING_LENGTH: "STRING_LENGTH" = "STRING_LENGTH"

  inline def values: js.Array[RuleType] = js.Array(BINARY_LENGTH, NUMBER_COMPARISON, STRING_FROM_SET, STRING_LENGTH)
}

type UpdateActionType = "CREATE_OR_UPDATE" | "DELETE"
object UpdateActionType {
  inline val CREATE_OR_UPDATE: "CREATE_OR_UPDATE" = "CREATE_OR_UPDATE"
  inline val DELETE: "DELETE" = "DELETE"

  inline def values: js.Array[UpdateActionType] = js.Array(CREATE_OR_UPDATE, DELETE)
}
