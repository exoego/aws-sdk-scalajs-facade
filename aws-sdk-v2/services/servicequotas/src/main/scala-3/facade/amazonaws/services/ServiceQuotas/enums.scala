package facade.amazonaws.services.servicequotas

import scalajs.js

type ErrorCode = "DEPENDENCY_ACCESS_DENIED_ERROR" | "DEPENDENCY_THROTTLING_ERROR" | "DEPENDENCY_SERVICE_ERROR" | "SERVICE_QUOTA_NOT_AVAILABLE_ERROR"
object ErrorCode {
  inline val DEPENDENCY_ACCESS_DENIED_ERROR: "DEPENDENCY_ACCESS_DENIED_ERROR" = "DEPENDENCY_ACCESS_DENIED_ERROR"
  inline val DEPENDENCY_THROTTLING_ERROR: "DEPENDENCY_THROTTLING_ERROR" = "DEPENDENCY_THROTTLING_ERROR"
  inline val DEPENDENCY_SERVICE_ERROR: "DEPENDENCY_SERVICE_ERROR" = "DEPENDENCY_SERVICE_ERROR"
  inline val SERVICE_QUOTA_NOT_AVAILABLE_ERROR: "SERVICE_QUOTA_NOT_AVAILABLE_ERROR" = "SERVICE_QUOTA_NOT_AVAILABLE_ERROR"

  inline def values: js.Array[ErrorCode] = js.Array(DEPENDENCY_ACCESS_DENIED_ERROR, DEPENDENCY_THROTTLING_ERROR, DEPENDENCY_SERVICE_ERROR, SERVICE_QUOTA_NOT_AVAILABLE_ERROR)
}

type PeriodUnit = "MICROSECOND" | "MILLISECOND" | "SECOND" | "MINUTE" | "HOUR" | "DAY" | "WEEK"
object PeriodUnit {
  inline val MICROSECOND: "MICROSECOND" = "MICROSECOND"
  inline val MILLISECOND: "MILLISECOND" = "MILLISECOND"
  inline val SECOND: "SECOND" = "SECOND"
  inline val MINUTE: "MINUTE" = "MINUTE"
  inline val HOUR: "HOUR" = "HOUR"
  inline val DAY: "DAY" = "DAY"
  inline val WEEK: "WEEK" = "WEEK"

  inline def values: js.Array[PeriodUnit] = js.Array(MICROSECOND, MILLISECOND, SECOND, MINUTE, HOUR, DAY, WEEK)
}

type RequestStatus = "PENDING" | "CASE_OPENED" | "APPROVED" | "DENIED" | "CASE_CLOSED"
object RequestStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val CASE_OPENED: "CASE_OPENED" = "CASE_OPENED"
  inline val APPROVED: "APPROVED" = "APPROVED"
  inline val DENIED: "DENIED" = "DENIED"
  inline val CASE_CLOSED: "CASE_CLOSED" = "CASE_CLOSED"

  inline def values: js.Array[RequestStatus] = js.Array(PENDING, CASE_OPENED, APPROVED, DENIED, CASE_CLOSED)
}

type ServiceQuotaTemplateAssociationStatus = "ASSOCIATED" | "DISASSOCIATED"
object ServiceQuotaTemplateAssociationStatus {
  inline val ASSOCIATED: "ASSOCIATED" = "ASSOCIATED"
  inline val DISASSOCIATED: "DISASSOCIATED" = "DISASSOCIATED"

  inline def values: js.Array[ServiceQuotaTemplateAssociationStatus] = js.Array(ASSOCIATED, DISASSOCIATED)
}