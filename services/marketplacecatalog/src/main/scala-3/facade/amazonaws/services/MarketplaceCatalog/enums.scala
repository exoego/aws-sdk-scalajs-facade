package facade.amazonaws.services.marketplacecatalog

import scalajs._

type ChangeStatus = "PREPARING" | "APPLYING" | "SUCCEEDED" | "CANCELLED" | "FAILED"
object ChangeStatus {
  inline val PREPARING: "PREPARING" = "PREPARING"
  inline val APPLYING: "APPLYING" = "APPLYING"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val CANCELLED: "CANCELLED" = "CANCELLED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[ChangeStatus] = js.Array(PREPARING, APPLYING, SUCCEEDED, CANCELLED, FAILED)
}

type FailureCode = "CLIENT_ERROR" | "SERVER_FAULT"
object FailureCode {
  inline val CLIENT_ERROR: "CLIENT_ERROR" = "CLIENT_ERROR"
  inline val SERVER_FAULT: "SERVER_FAULT" = "SERVER_FAULT"

  inline def values: js.Array[FailureCode] = js.Array(CLIENT_ERROR, SERVER_FAULT)
}

type SortOrder = "ASCENDING" | "DESCENDING"
object SortOrder {
  inline val ASCENDING: "ASCENDING" = "ASCENDING"
  inline val DESCENDING: "DESCENDING" = "DESCENDING"

  inline def values: js.Array[SortOrder] = js.Array(ASCENDING, DESCENDING)
}
