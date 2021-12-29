package facade.amazonaws.services.docdb

import scalajs._

type ApplyMethod = "immediate" | "pending-reboot"
object ApplyMethod {
  val immediate: "immediate" = "immediate"
  val `pending-reboot`: "pending-reboot" = "pending-reboot"

  @inline def values = js.Array[ApplyMethod](immediate, `pending-reboot`)
}

type SourceType = "db-instance" | "db-parameter-group" | "db-security-group" | "db-snapshot" | "db-cluster" | "db-cluster-snapshot"
object SourceType {
  val `db-instance`: "db-instance" = "db-instance"
  val `db-parameter-group`: "db-parameter-group" = "db-parameter-group"
  val `db-security-group`: "db-security-group" = "db-security-group"
  val `db-snapshot`: "db-snapshot" = "db-snapshot"
  val `db-cluster`: "db-cluster" = "db-cluster"
  val `db-cluster-snapshot`: "db-cluster-snapshot" = "db-cluster-snapshot"

  @inline def values = js.Array[SourceType](`db-instance`, `db-parameter-group`, `db-security-group`, `db-snapshot`, `db-cluster`, `db-cluster-snapshot`)
}
