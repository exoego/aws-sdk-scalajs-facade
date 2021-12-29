package facade.amazonaws.services.secretsmanager

import scalajs._

type FilterNameStringType = "description" | "name" | "tag-key" | "tag-value" | "primary-region" | "all"
object FilterNameStringType {
  val description: "description" = "description"
  val name: "name" = "name"
  val `tag-key`: "tag-key" = "tag-key"
  val `tag-value`: "tag-value" = "tag-value"
  val `primary-region`: "primary-region" = "primary-region"
  val all: "all" = "all"

  @inline def values = js.Array[FilterNameStringType](description, name, `tag-key`, `tag-value`, `primary-region`, all)
}

type SortOrderType = "asc" | "desc"
object SortOrderType {
  val asc: "asc" = "asc"
  val desc: "desc" = "desc"

  @inline def values = js.Array[SortOrderType](asc, desc)
}

type StatusType = "InSync" | "Failed" | "InProgress"
object StatusType {
  val InSync: "InSync" = "InSync"
  val Failed: "Failed" = "Failed"
  val InProgress: "InProgress" = "InProgress"

  @inline def values = js.Array[StatusType](InSync, Failed, InProgress)
}
