package facade.amazonaws.services.cloudcontrol

import scalajs.js

type HandlerErrorCode = "NotUpdatable" | "InvalidRequest" | "AccessDenied" | "InvalidCredentials" | "AlreadyExists" | "NotFound" | "ResourceConflict" | "Throttling" | "ServiceLimitExceeded" | "NotStabilized" | "GeneralServiceException" | "ServiceInternalError" | "ServiceTimeout" | "NetworkFailure" | "InternalFailure"
object HandlerErrorCode {
  inline val NotUpdatable: "NotUpdatable" = "NotUpdatable"
  inline val InvalidRequest: "InvalidRequest" = "InvalidRequest"
  inline val AccessDenied: "AccessDenied" = "AccessDenied"
  inline val InvalidCredentials: "InvalidCredentials" = "InvalidCredentials"
  inline val AlreadyExists: "AlreadyExists" = "AlreadyExists"
  inline val NotFound: "NotFound" = "NotFound"
  inline val ResourceConflict: "ResourceConflict" = "ResourceConflict"
  inline val Throttling: "Throttling" = "Throttling"
  inline val ServiceLimitExceeded: "ServiceLimitExceeded" = "ServiceLimitExceeded"
  inline val NotStabilized: "NotStabilized" = "NotStabilized"
  inline val GeneralServiceException: "GeneralServiceException" = "GeneralServiceException"
  inline val ServiceInternalError: "ServiceInternalError" = "ServiceInternalError"
  inline val ServiceTimeout: "ServiceTimeout" = "ServiceTimeout"
  inline val NetworkFailure: "NetworkFailure" = "NetworkFailure"
  inline val InternalFailure: "InternalFailure" = "InternalFailure"

  inline def values: js.Array[HandlerErrorCode] = js.Array(
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

type Operation = "CREATE" | "DELETE" | "UPDATE"
object Operation {
  inline val CREATE: "CREATE" = "CREATE"
  inline val DELETE: "DELETE" = "DELETE"
  inline val UPDATE: "UPDATE" = "UPDATE"

  inline def values: js.Array[Operation] = js.Array(CREATE, DELETE, UPDATE)
}

type OperationStatus = "PENDING" | "IN_PROGRESS" | "SUCCESS" | "FAILED" | "CANCEL_IN_PROGRESS" | "CANCEL_COMPLETE"
object OperationStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val FAILED: "FAILED" = "FAILED"
  inline val CANCEL_IN_PROGRESS: "CANCEL_IN_PROGRESS" = "CANCEL_IN_PROGRESS"
  inline val CANCEL_COMPLETE: "CANCEL_COMPLETE" = "CANCEL_COMPLETE"

  inline def values: js.Array[OperationStatus] = js.Array(PENDING, IN_PROGRESS, SUCCESS, FAILED, CANCEL_IN_PROGRESS, CANCEL_COMPLETE)
}
