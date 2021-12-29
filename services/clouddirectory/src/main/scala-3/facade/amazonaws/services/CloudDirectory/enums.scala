package facade.amazonaws.services.clouddirectory

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait BatchReadExceptionType extends js.Any
object BatchReadExceptionType {
  val ValidationException = "ValidationException".asInstanceOf[BatchReadExceptionType]
  val InvalidArnException = "InvalidArnException".asInstanceOf[BatchReadExceptionType]
  val ResourceNotFoundException = "ResourceNotFoundException".asInstanceOf[BatchReadExceptionType]
  val InvalidNextTokenException = "InvalidNextTokenException".asInstanceOf[BatchReadExceptionType]
  val AccessDeniedException = "AccessDeniedException".asInstanceOf[BatchReadExceptionType]
  val NotNodeException = "NotNodeException".asInstanceOf[BatchReadExceptionType]
  val FacetValidationException = "FacetValidationException".asInstanceOf[BatchReadExceptionType]
  val CannotListParentOfRootException = "CannotListParentOfRootException".asInstanceOf[BatchReadExceptionType]
  val NotIndexException = "NotIndexException".asInstanceOf[BatchReadExceptionType]
  val NotPolicyException = "NotPolicyException".asInstanceOf[BatchReadExceptionType]
  val DirectoryNotEnabledException = "DirectoryNotEnabledException".asInstanceOf[BatchReadExceptionType]
  val LimitExceededException = "LimitExceededException".asInstanceOf[BatchReadExceptionType]
  val InternalServiceException = "InternalServiceException".asInstanceOf[BatchReadExceptionType]

  @inline def values = js.Array(
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

@js.native
sealed trait ConsistencyLevel extends js.Any
object ConsistencyLevel {
  val SERIALIZABLE = "SERIALIZABLE".asInstanceOf[ConsistencyLevel]
  val EVENTUAL = "EVENTUAL".asInstanceOf[ConsistencyLevel]

  @inline def values = js.Array(SERIALIZABLE, EVENTUAL)
}

@js.native
sealed trait DirectoryState extends js.Any
object DirectoryState {
  val ENABLED = "ENABLED".asInstanceOf[DirectoryState]
  val DISABLED = "DISABLED".asInstanceOf[DirectoryState]
  val DELETED = "DELETED".asInstanceOf[DirectoryState]

  @inline def values = js.Array(ENABLED, DISABLED, DELETED)
}

@js.native
sealed trait FacetAttributeType extends js.Any
object FacetAttributeType {
  val STRING = "STRING".asInstanceOf[FacetAttributeType]
  val BINARY = "BINARY".asInstanceOf[FacetAttributeType]
  val BOOLEAN = "BOOLEAN".asInstanceOf[FacetAttributeType]
  val NUMBER = "NUMBER".asInstanceOf[FacetAttributeType]
  val DATETIME = "DATETIME".asInstanceOf[FacetAttributeType]
  val VARIANT = "VARIANT".asInstanceOf[FacetAttributeType]

  @inline def values = js.Array(STRING, BINARY, BOOLEAN, NUMBER, DATETIME, VARIANT)
}

@js.native
sealed trait FacetStyle extends js.Any
object FacetStyle {
  val STATIC = "STATIC".asInstanceOf[FacetStyle]
  val DYNAMIC = "DYNAMIC".asInstanceOf[FacetStyle]

  @inline def values = js.Array(STATIC, DYNAMIC)
}

@js.native
sealed trait ObjectType extends js.Any
object ObjectType {
  val NODE = "NODE".asInstanceOf[ObjectType]
  val LEAF_NODE = "LEAF_NODE".asInstanceOf[ObjectType]
  val POLICY = "POLICY".asInstanceOf[ObjectType]
  val INDEX = "INDEX".asInstanceOf[ObjectType]

  @inline def values = js.Array(NODE, LEAF_NODE, POLICY, INDEX)
}

@js.native
sealed trait RangeMode extends js.Any
object RangeMode {
  val FIRST = "FIRST".asInstanceOf[RangeMode]
  val LAST = "LAST".asInstanceOf[RangeMode]
  val LAST_BEFORE_MISSING_VALUES = "LAST_BEFORE_MISSING_VALUES".asInstanceOf[RangeMode]
  val INCLUSIVE = "INCLUSIVE".asInstanceOf[RangeMode]
  val EXCLUSIVE = "EXCLUSIVE".asInstanceOf[RangeMode]

  @inline def values = js.Array(FIRST, LAST, LAST_BEFORE_MISSING_VALUES, INCLUSIVE, EXCLUSIVE)
}

@js.native
sealed trait RequiredAttributeBehavior extends js.Any
object RequiredAttributeBehavior {
  val REQUIRED_ALWAYS = "REQUIRED_ALWAYS".asInstanceOf[RequiredAttributeBehavior]
  val NOT_REQUIRED = "NOT_REQUIRED".asInstanceOf[RequiredAttributeBehavior]

  @inline def values = js.Array(REQUIRED_ALWAYS, NOT_REQUIRED)
}

@js.native
sealed trait RuleType extends js.Any
object RuleType {
  val BINARY_LENGTH = "BINARY_LENGTH".asInstanceOf[RuleType]
  val NUMBER_COMPARISON = "NUMBER_COMPARISON".asInstanceOf[RuleType]
  val STRING_FROM_SET = "STRING_FROM_SET".asInstanceOf[RuleType]
  val STRING_LENGTH = "STRING_LENGTH".asInstanceOf[RuleType]

  @inline def values = js.Array(BINARY_LENGTH, NUMBER_COMPARISON, STRING_FROM_SET, STRING_LENGTH)
}

@js.native
sealed trait UpdateActionType extends js.Any
object UpdateActionType {
  val CREATE_OR_UPDATE = "CREATE_OR_UPDATE".asInstanceOf[UpdateActionType]
  val DELETE = "DELETE".asInstanceOf[UpdateActionType]

  @inline def values = js.Array(CREATE_OR_UPDATE, DELETE)
}
