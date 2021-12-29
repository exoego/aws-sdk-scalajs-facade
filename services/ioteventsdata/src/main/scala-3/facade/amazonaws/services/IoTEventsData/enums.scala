package facade.amazonaws.services.ioteventsdata

import scalajs._

type ErrorCode = "ResourceNotFoundException" | "InvalidRequestException" | "InternalFailureException" | "ServiceUnavailableException" | "ThrottlingException"
object ErrorCode {
  inline val ResourceNotFoundException: "ResourceNotFoundException" = "ResourceNotFoundException"
  inline val InvalidRequestException: "InvalidRequestException" = "InvalidRequestException"
  inline val InternalFailureException: "InternalFailureException" = "InternalFailureException"
  inline val ServiceUnavailableException: "ServiceUnavailableException" = "ServiceUnavailableException"
  inline val ThrottlingException: "ThrottlingException" = "ThrottlingException"

  inline def values: js.Array[ErrorCode] = js.Array(ResourceNotFoundException, InvalidRequestException, InternalFailureException, ServiceUnavailableException, ThrottlingException)
}
