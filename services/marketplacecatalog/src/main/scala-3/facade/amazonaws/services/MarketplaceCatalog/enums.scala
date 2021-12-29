package facade.amazonaws.services.marketplacecatalog

import scalajs._

type ChangeStatus = "PREPARING" | "APPLYING" | "SUCCEEDED" | "CANCELLED" | "FAILED"
object ChangeStatus {
  val PREPARING: "PREPARING" = "PREPARING"
  val APPLYING: "APPLYING" = "APPLYING"
  val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  val CANCELLED: "CANCELLED" = "CANCELLED"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[ChangeStatus](PREPARING, APPLYING, SUCCEEDED, CANCELLED, FAILED)
}

type FailureCode = "CLIENT_ERROR" | "SERVER_FAULT"
object FailureCode {
  val CLIENT_ERROR: "CLIENT_ERROR" = "CLIENT_ERROR"
  val SERVER_FAULT: "SERVER_FAULT" = "SERVER_FAULT"

  @inline def values = js.Array[FailureCode](CLIENT_ERROR, SERVER_FAULT)
}

type SortOrder = "ASCENDING" | "DESCENDING"
object SortOrder {
  val ASCENDING: "ASCENDING" = "ASCENDING"
  val DESCENDING: "DESCENDING" = "DESCENDING"

  @inline def values = js.Array[SortOrder](ASCENDING, DESCENDING)
}
