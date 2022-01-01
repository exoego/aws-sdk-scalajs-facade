package facade.amazonaws.services.cloudcontrol

import scalajs.js

@js.native
sealed trait HandlerErrorCode extends js.Any
object HandlerErrorCode {
  val NotUpdatable = "NotUpdatable".asInstanceOf[HandlerErrorCode]
  val InvalidRequest = "InvalidRequest".asInstanceOf[HandlerErrorCode]
  val AccessDenied = "AccessDenied".asInstanceOf[HandlerErrorCode]
  val InvalidCredentials = "InvalidCredentials".asInstanceOf[HandlerErrorCode]
  val AlreadyExists = "AlreadyExists".asInstanceOf[HandlerErrorCode]
  val NotFound = "NotFound".asInstanceOf[HandlerErrorCode]
  val ResourceConflict = "ResourceConflict".asInstanceOf[HandlerErrorCode]
  val Throttling = "Throttling".asInstanceOf[HandlerErrorCode]
  val ServiceLimitExceeded = "ServiceLimitExceeded".asInstanceOf[HandlerErrorCode]
  val NotStabilized = "NotStabilized".asInstanceOf[HandlerErrorCode]
  val GeneralServiceException = "GeneralServiceException".asInstanceOf[HandlerErrorCode]
  val ServiceInternalError = "ServiceInternalError".asInstanceOf[HandlerErrorCode]
  val ServiceTimeout = "ServiceTimeout".asInstanceOf[HandlerErrorCode]
  val NetworkFailure = "NetworkFailure".asInstanceOf[HandlerErrorCode]
  val InternalFailure = "InternalFailure".asInstanceOf[HandlerErrorCode]

  @inline def values: js.Array[HandlerErrorCode] = js.Array(
    NotUpdatable,
    InvalidRequest,
    AccessDenied,
    InvalidCredentials,
    AlreadyExists,
    NotFound,
    ResourceConflict,
    Throttling,
    ServiceLimitExceeded,
    NotStabilized,
    GeneralServiceException,
    ServiceInternalError,
    ServiceTimeout,
    NetworkFailure,
    InternalFailure
  )
}

@js.native
sealed trait Operation extends js.Any
object Operation {
  val CREATE = "CREATE".asInstanceOf[Operation]
  val DELETE = "DELETE".asInstanceOf[Operation]
  val UPDATE = "UPDATE".asInstanceOf[Operation]

  @inline def values: js.Array[Operation] = js.Array(CREATE, DELETE, UPDATE)
}

@js.native
sealed trait OperationStatus extends js.Any
object OperationStatus {
  val PENDING = "PENDING".asInstanceOf[OperationStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[OperationStatus]
  val SUCCESS = "SUCCESS".asInstanceOf[OperationStatus]
  val FAILED = "FAILED".asInstanceOf[OperationStatus]
  val CANCEL_IN_PROGRESS = "CANCEL_IN_PROGRESS".asInstanceOf[OperationStatus]
  val CANCEL_COMPLETE = "CANCEL_COMPLETE".asInstanceOf[OperationStatus]

  @inline def values: js.Array[OperationStatus] = js.Array(PENDING, IN_PROGRESS, SUCCESS, FAILED, CANCEL_IN_PROGRESS, CANCEL_COMPLETE)
}
