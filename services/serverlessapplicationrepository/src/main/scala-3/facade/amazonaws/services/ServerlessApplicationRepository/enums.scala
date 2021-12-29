package facade.amazonaws.services.serverlessapplicationrepository

import scalajs._

/** Values that must be specified in order to deploy some applications.
  */
type Capability = "CAPABILITY_IAM" | "CAPABILITY_NAMED_IAM" | "CAPABILITY_AUTO_EXPAND" | "CAPABILITY_RESOURCE_POLICY"
object Capability {
  inline val CAPABILITY_IAM: "CAPABILITY_IAM" = "CAPABILITY_IAM"
  inline val CAPABILITY_NAMED_IAM: "CAPABILITY_NAMED_IAM" = "CAPABILITY_NAMED_IAM"
  inline val CAPABILITY_AUTO_EXPAND: "CAPABILITY_AUTO_EXPAND" = "CAPABILITY_AUTO_EXPAND"
  inline val CAPABILITY_RESOURCE_POLICY: "CAPABILITY_RESOURCE_POLICY" = "CAPABILITY_RESOURCE_POLICY"

  inline def values: js.Array[Capability] = js.Array(CAPABILITY_IAM, CAPABILITY_NAMED_IAM, CAPABILITY_AUTO_EXPAND, CAPABILITY_RESOURCE_POLICY)
}

type Status = "PREPARING" | "ACTIVE" | "EXPIRED"
object Status {
  inline val PREPARING: "PREPARING" = "PREPARING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val EXPIRED: "EXPIRED" = "EXPIRED"

  inline def values: js.Array[Status] = js.Array(PREPARING, ACTIVE, EXPIRED)
}
