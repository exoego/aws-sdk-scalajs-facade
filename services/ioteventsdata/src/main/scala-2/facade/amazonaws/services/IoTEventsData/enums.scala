package facade.amazonaws.services.ioteventsdata

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait ErrorCode extends js.Any
object ErrorCode {
  val ResourceNotFoundException = "ResourceNotFoundException".asInstanceOf[ErrorCode]
  val InvalidRequestException = "InvalidRequestException".asInstanceOf[ErrorCode]
  val InternalFailureException = "InternalFailureException".asInstanceOf[ErrorCode]
  val ServiceUnavailableException = "ServiceUnavailableException".asInstanceOf[ErrorCode]
  val ThrottlingException = "ThrottlingException".asInstanceOf[ErrorCode]

  @inline def values = js.Array(ResourceNotFoundException, InvalidRequestException, InternalFailureException, ServiceUnavailableException, ThrottlingException)
}
