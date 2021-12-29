package facade.amazonaws.services.elasticinference

import scalajs._

type LocationType = "region" | "availability-zone" | "availability-zone-id"
object LocationType {
  inline val region: "region" = "region"
  inline val `availability-zone`: "availability-zone" = "availability-zone"
  inline val `availability-zone-id`: "availability-zone-id" = "availability-zone-id"

  inline def values: js.Array[LocationType] = js.Array(region, `availability-zone`, `availability-zone-id`)
}
