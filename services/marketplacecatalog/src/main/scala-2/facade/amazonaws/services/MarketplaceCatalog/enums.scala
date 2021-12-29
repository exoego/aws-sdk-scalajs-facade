package facade.amazonaws.services.marketplacecatalog

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait ChangeStatus extends js.Any
object ChangeStatus {
  val PREPARING = "PREPARING".asInstanceOf[ChangeStatus]
  val APPLYING = "APPLYING".asInstanceOf[ChangeStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[ChangeStatus]
  val CANCELLED = "CANCELLED".asInstanceOf[ChangeStatus]
  val FAILED = "FAILED".asInstanceOf[ChangeStatus]

  @inline def values = js.Array(PREPARING, APPLYING, SUCCEEDED, CANCELLED, FAILED)
}

@js.native
sealed trait FailureCode extends js.Any
object FailureCode {
  val CLIENT_ERROR = "CLIENT_ERROR".asInstanceOf[FailureCode]
  val SERVER_FAULT = "SERVER_FAULT".asInstanceOf[FailureCode]

  @inline def values = js.Array(CLIENT_ERROR, SERVER_FAULT)
}

@js.native
sealed trait SortOrder extends js.Any
object SortOrder {
  val ASCENDING = "ASCENDING".asInstanceOf[SortOrder]
  val DESCENDING = "DESCENDING".asInstanceOf[SortOrder]

  @inline def values = js.Array(ASCENDING, DESCENDING)
}

