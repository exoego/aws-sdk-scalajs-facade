package facade.amazonaws.services.pi

import scalajs._

type ServiceType = "RDS"
object ServiceType {
  val RDS: "RDS" = "RDS"

  @inline def values = js.Array[ServiceType](RDS)
}
