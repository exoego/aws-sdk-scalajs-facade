package facade.amazonaws.services.ioteventsdata

import scalajs._

type ErrorCode = "ResourceNotFoundException" | "InvalidRequestException" | "InternalFailureException" | "ServiceUnavailableException" | "ThrottlingException"
object ErrorCode {
  val ResourceNotFoundException: "ResourceNotFoundException" = "ResourceNotFoundException"
  val InvalidRequestException: "InvalidRequestException" = "InvalidRequestException"
  val InternalFailureException: "InternalFailureException" = "InternalFailureException"
  val ServiceUnavailableException: "ServiceUnavailableException" = "ServiceUnavailableException"
  val ThrottlingException: "ThrottlingException" = "ThrottlingException"

  @inline def values = js.Array[ErrorCode](ResourceNotFoundException, InvalidRequestException, InternalFailureException, ServiceUnavailableException, ThrottlingException)
}
