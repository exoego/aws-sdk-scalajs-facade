package facade.amazonaws.services.serverlessapplicationrepository

import scalajs._

/** Values that must be specified in order to deploy some applications.
  */
type Capability = "CAPABILITY_IAM" | "CAPABILITY_NAMED_IAM" | "CAPABILITY_AUTO_EXPAND" | "CAPABILITY_RESOURCE_POLICY"
object Capability {
  val CAPABILITY_IAM: "CAPABILITY_IAM" = "CAPABILITY_IAM"
  val CAPABILITY_NAMED_IAM: "CAPABILITY_NAMED_IAM" = "CAPABILITY_NAMED_IAM"
  val CAPABILITY_AUTO_EXPAND: "CAPABILITY_AUTO_EXPAND" = "CAPABILITY_AUTO_EXPAND"
  val CAPABILITY_RESOURCE_POLICY: "CAPABILITY_RESOURCE_POLICY" = "CAPABILITY_RESOURCE_POLICY"

  @inline def values = js.Array[Capability](CAPABILITY_IAM, CAPABILITY_NAMED_IAM, CAPABILITY_AUTO_EXPAND, CAPABILITY_RESOURCE_POLICY)
}

type Status = "PREPARING" | "ACTIVE" | "EXPIRED"
object Status {
  val PREPARING: "PREPARING" = "PREPARING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val EXPIRED: "EXPIRED" = "EXPIRED"

  @inline def values = js.Array[Status](PREPARING, ACTIVE, EXPIRED)
}
