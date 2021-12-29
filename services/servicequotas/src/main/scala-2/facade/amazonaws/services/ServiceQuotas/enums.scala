package facade.amazonaws.services.servicequotas

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait ErrorCode extends js.Any
object ErrorCode {
  val DEPENDENCY_ACCESS_DENIED_ERROR = "DEPENDENCY_ACCESS_DENIED_ERROR".asInstanceOf[ErrorCode]
  val DEPENDENCY_THROTTLING_ERROR = "DEPENDENCY_THROTTLING_ERROR".asInstanceOf[ErrorCode]
  val DEPENDENCY_SERVICE_ERROR = "DEPENDENCY_SERVICE_ERROR".asInstanceOf[ErrorCode]
  val SERVICE_QUOTA_NOT_AVAILABLE_ERROR = "SERVICE_QUOTA_NOT_AVAILABLE_ERROR".asInstanceOf[ErrorCode]

  @inline def values = js.Array(DEPENDENCY_ACCESS_DENIED_ERROR, DEPENDENCY_THROTTLING_ERROR, DEPENDENCY_SERVICE_ERROR, SERVICE_QUOTA_NOT_AVAILABLE_ERROR)
}

@js.native
sealed trait PeriodUnit extends js.Any
object PeriodUnit {
  val MICROSECOND = "MICROSECOND".asInstanceOf[PeriodUnit]
  val MILLISECOND = "MILLISECOND".asInstanceOf[PeriodUnit]
  val SECOND = "SECOND".asInstanceOf[PeriodUnit]
  val MINUTE = "MINUTE".asInstanceOf[PeriodUnit]
  val HOUR = "HOUR".asInstanceOf[PeriodUnit]
  val DAY = "DAY".asInstanceOf[PeriodUnit]
  val WEEK = "WEEK".asInstanceOf[PeriodUnit]

  @inline def values = js.Array(MICROSECOND, MILLISECOND, SECOND, MINUTE, HOUR, DAY, WEEK)
}

@js.native
sealed trait RequestStatus extends js.Any
object RequestStatus {
  val PENDING = "PENDING".asInstanceOf[RequestStatus]
  val CASE_OPENED = "CASE_OPENED".asInstanceOf[RequestStatus]
  val APPROVED = "APPROVED".asInstanceOf[RequestStatus]
  val DENIED = "DENIED".asInstanceOf[RequestStatus]
  val CASE_CLOSED = "CASE_CLOSED".asInstanceOf[RequestStatus]

  @inline def values = js.Array(PENDING, CASE_OPENED, APPROVED, DENIED, CASE_CLOSED)
}

@js.native
sealed trait ServiceQuotaTemplateAssociationStatus extends js.Any
object ServiceQuotaTemplateAssociationStatus {
  val ASSOCIATED = "ASSOCIATED".asInstanceOf[ServiceQuotaTemplateAssociationStatus]
  val DISASSOCIATED = "DISASSOCIATED".asInstanceOf[ServiceQuotaTemplateAssociationStatus]

  @inline def values = js.Array(ASSOCIATED, DISASSOCIATED)
}

