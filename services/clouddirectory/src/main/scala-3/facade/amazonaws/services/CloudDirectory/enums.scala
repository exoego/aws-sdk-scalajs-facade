package facade.amazonaws.services.clouddirectory

import scalajs._

type BatchReadExceptionType = "ValidationException" | "InvalidArnException" | "ResourceNotFoundException" | "InvalidNextTokenException" | "AccessDeniedException" | "NotNodeException" | "FacetValidationException" | "CannotListParentOfRootException" | "NotIndexException" | "NotPolicyException" | "DirectoryNotEnabledException" | "LimitExceededException" | "InternalServiceException"
object BatchReadExceptionType {
  val ValidationException: "ValidationException" = "ValidationException"
  val InvalidArnException: "InvalidArnException" = "InvalidArnException"
  val ResourceNotFoundException: "ResourceNotFoundException" = "ResourceNotFoundException"
  val InvalidNextTokenException: "InvalidNextTokenException" = "InvalidNextTokenException"
  val AccessDeniedException: "AccessDeniedException" = "AccessDeniedException"
  val NotNodeException: "NotNodeException" = "NotNodeException"
  val FacetValidationException: "FacetValidationException" = "FacetValidationException"
  val CannotListParentOfRootException: "CannotListParentOfRootException" = "CannotListParentOfRootException"
  val NotIndexException: "NotIndexException" = "NotIndexException"
  val NotPolicyException: "NotPolicyException" = "NotPolicyException"
  val DirectoryNotEnabledException: "DirectoryNotEnabledException" = "DirectoryNotEnabledException"
  val LimitExceededException: "LimitExceededException" = "LimitExceededException"
  val InternalServiceException: "InternalServiceException" = "InternalServiceException"

  @inline def values = js.Array[BatchReadExceptionType](
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
  val SERIALIZABLE: "SERIALIZABLE" = "SERIALIZABLE"
  val EVENTUAL: "EVENTUAL" = "EVENTUAL"

  @inline def values = js.Array[ConsistencyLevel](SERIALIZABLE, EVENTUAL)
}

type DirectoryState = "ENABLED" | "DISABLED" | "DELETED"
object DirectoryState {
  val ENABLED: "ENABLED" = "ENABLED"
  val DISABLED: "DISABLED" = "DISABLED"
  val DELETED: "DELETED" = "DELETED"

  @inline def values = js.Array[DirectoryState](ENABLED, DISABLED, DELETED)
}

type FacetAttributeType = "STRING" | "BINARY" | "BOOLEAN" | "NUMBER" | "DATETIME" | "VARIANT"
object FacetAttributeType {
  val STRING: "STRING" = "STRING"
  val BINARY: "BINARY" = "BINARY"
  val BOOLEAN: "BOOLEAN" = "BOOLEAN"
  val NUMBER: "NUMBER" = "NUMBER"
  val DATETIME: "DATETIME" = "DATETIME"
  val VARIANT: "VARIANT" = "VARIANT"

  @inline def values = js.Array[FacetAttributeType](STRING, BINARY, BOOLEAN, NUMBER, DATETIME, VARIANT)
}

type FacetStyle = "STATIC" | "DYNAMIC"
object FacetStyle {
  val STATIC: "STATIC" = "STATIC"
  val DYNAMIC: "DYNAMIC" = "DYNAMIC"

  @inline def values = js.Array[FacetStyle](STATIC, DYNAMIC)
}

type ObjectType = "NODE" | "LEAF_NODE" | "POLICY" | "INDEX"
object ObjectType {
  val NODE: "NODE" = "NODE"
  val LEAF_NODE: "LEAF_NODE" = "LEAF_NODE"
  val POLICY: "POLICY" = "POLICY"
  val INDEX: "INDEX" = "INDEX"

  @inline def values = js.Array[ObjectType](NODE, LEAF_NODE, POLICY, INDEX)
}

type RangeMode = "FIRST" | "LAST" | "LAST_BEFORE_MISSING_VALUES" | "INCLUSIVE" | "EXCLUSIVE"
object RangeMode {
  val FIRST: "FIRST" = "FIRST"
  val LAST: "LAST" = "LAST"
  val LAST_BEFORE_MISSING_VALUES: "LAST_BEFORE_MISSING_VALUES" = "LAST_BEFORE_MISSING_VALUES"
  val INCLUSIVE: "INCLUSIVE" = "INCLUSIVE"
  val EXCLUSIVE: "EXCLUSIVE" = "EXCLUSIVE"

  @inline def values = js.Array[RangeMode](FIRST, LAST, LAST_BEFORE_MISSING_VALUES, INCLUSIVE, EXCLUSIVE)
}

type RequiredAttributeBehavior = "REQUIRED_ALWAYS" | "NOT_REQUIRED"
object RequiredAttributeBehavior {
  val REQUIRED_ALWAYS: "REQUIRED_ALWAYS" = "REQUIRED_ALWAYS"
  val NOT_REQUIRED: "NOT_REQUIRED" = "NOT_REQUIRED"

  @inline def values = js.Array[RequiredAttributeBehavior](REQUIRED_ALWAYS, NOT_REQUIRED)
}

type RuleType = "BINARY_LENGTH" | "NUMBER_COMPARISON" | "STRING_FROM_SET" | "STRING_LENGTH"
object RuleType {
  val BINARY_LENGTH: "BINARY_LENGTH" = "BINARY_LENGTH"
  val NUMBER_COMPARISON: "NUMBER_COMPARISON" = "NUMBER_COMPARISON"
  val STRING_FROM_SET: "STRING_FROM_SET" = "STRING_FROM_SET"
  val STRING_LENGTH: "STRING_LENGTH" = "STRING_LENGTH"

  @inline def values = js.Array[RuleType](BINARY_LENGTH, NUMBER_COMPARISON, STRING_FROM_SET, STRING_LENGTH)
}

type UpdateActionType = "CREATE_OR_UPDATE" | "DELETE"
object UpdateActionType {
  val CREATE_OR_UPDATE: "CREATE_OR_UPDATE" = "CREATE_OR_UPDATE"
  val DELETE: "DELETE" = "DELETE"

  @inline def values = js.Array[UpdateActionType](CREATE_OR_UPDATE, DELETE)
}
