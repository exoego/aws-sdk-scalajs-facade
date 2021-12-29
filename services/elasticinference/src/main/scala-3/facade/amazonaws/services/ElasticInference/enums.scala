package facade.amazonaws.services.elasticinference

import scalajs._

type LocationType = "region" | "availability-zone" | "availability-zone-id"
object LocationType {
  val region: "region" = "region"
  val `availability-zone`: "availability-zone" = "availability-zone"
  val `availability-zone-id`: "availability-zone-id" = "availability-zone-id"

  @inline def values = js.Array[LocationType](region, `availability-zone`, `availability-zone-id`)
}
