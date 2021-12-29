package facade.amazonaws.services.neptune

import scalajs._

type ApplyMethod = "immediate" | "pending-reboot"
object ApplyMethod {
  inline val immediate: "immediate" = "immediate"
  inline val `pending-reboot`: "pending-reboot" = "pending-reboot"

  inline def values: js.Array[ApplyMethod] = js.Array(immediate, `pending-reboot`)
}

type SourceType = "db-instance" | "db-parameter-group" | "db-security-group" | "db-snapshot" | "db-cluster" | "db-cluster-snapshot"
object SourceType {
  inline val `db-instance`: "db-instance" = "db-instance"
  inline val `db-parameter-group`: "db-parameter-group" = "db-parameter-group"
  inline val `db-security-group`: "db-security-group" = "db-security-group"
  inline val `db-snapshot`: "db-snapshot" = "db-snapshot"
  inline val `db-cluster`: "db-cluster" = "db-cluster"
  inline val `db-cluster-snapshot`: "db-cluster-snapshot" = "db-cluster-snapshot"

  inline def values: js.Array[SourceType] = js.Array(`db-instance`, `db-parameter-group`, `db-security-group`, `db-snapshot`, `db-cluster`, `db-cluster-snapshot`)
}
