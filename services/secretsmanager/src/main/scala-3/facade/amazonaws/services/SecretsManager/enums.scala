package facade.amazonaws.services.secretsmanager

import scalajs._

type FilterNameStringType = "description" | "name" | "tag-key" | "tag-value" | "primary-region" | "all"
object FilterNameStringType {
  inline val description: "description" = "description"
  inline val name: "name" = "name"
  inline val `tag-key`: "tag-key" = "tag-key"
  inline val `tag-value`: "tag-value" = "tag-value"
  inline val `primary-region`: "primary-region" = "primary-region"
  inline val all: "all" = "all"

  inline def values: js.Array[FilterNameStringType] = js.Array(description, name, `tag-key`, `tag-value`, `primary-region`, all)
}

type SortOrderType = "asc" | "desc"
object SortOrderType {
  inline val asc: "asc" = "asc"
  inline val desc: "desc" = "desc"

  inline def values: js.Array[SortOrderType] = js.Array(asc, desc)
}

type StatusType = "InSync" | "Failed" | "InProgress"
object StatusType {
  inline val InSync: "InSync" = "InSync"
  inline val Failed: "Failed" = "Failed"
  inline val InProgress: "InProgress" = "InProgress"

  inline def values: js.Array[StatusType] = js.Array(InSync, Failed, InProgress)
}
