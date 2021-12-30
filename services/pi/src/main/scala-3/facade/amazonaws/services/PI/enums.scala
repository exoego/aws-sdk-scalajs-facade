package facade.amazonaws.services.pi

import scalajs.js

type ServiceType = "RDS"
object ServiceType {
  inline val RDS: "RDS" = "RDS"

  inline def values: js.Array[ServiceType] = js.Array(RDS)
}
