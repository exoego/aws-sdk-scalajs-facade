package facade.amazonaws.services.pi

import scalajs.js

@js.native
sealed trait ServiceType extends js.Any
object ServiceType {
  val RDS = "RDS".asInstanceOf[ServiceType]

  @inline def values: js.Array[ServiceType] = js.Array(RDS)
}
