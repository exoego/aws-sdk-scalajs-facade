package facade.amazonaws.services.elasticinference

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait LocationType extends js.Any
object LocationType {
  val region = "region".asInstanceOf[LocationType]
  val `availability-zone` = "availability-zone".asInstanceOf[LocationType]
  val `availability-zone-id` = "availability-zone-id".asInstanceOf[LocationType]

  @inline def values = js.Array(region, `availability-zone`, `availability-zone-id`)
}

