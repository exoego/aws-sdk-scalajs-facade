package facade.amazonaws.services.secretsmanager

import scalajs.js

@js.native
sealed trait FilterNameStringType extends js.Any
object FilterNameStringType {
  val description = "description".asInstanceOf[FilterNameStringType]
  val name = "name".asInstanceOf[FilterNameStringType]
  val `tag-key` = "tag-key".asInstanceOf[FilterNameStringType]
  val `tag-value` = "tag-value".asInstanceOf[FilterNameStringType]
  val `primary-region` = "primary-region".asInstanceOf[FilterNameStringType]
  val all = "all".asInstanceOf[FilterNameStringType]

  @inline def values: js.Array[FilterNameStringType] = js.Array(description, name, `tag-key`, `tag-value`, `primary-region`, all)
}

@js.native
sealed trait SortOrderType extends js.Any
object SortOrderType {
  val asc = "asc".asInstanceOf[SortOrderType]
  val desc = "desc".asInstanceOf[SortOrderType]

  @inline def values: js.Array[SortOrderType] = js.Array(asc, desc)
}

@js.native
sealed trait StatusType extends js.Any
object StatusType {
  val InSync = "InSync".asInstanceOf[StatusType]
  val Failed = "Failed".asInstanceOf[StatusType]
  val InProgress = "InProgress".asInstanceOf[StatusType]

  @inline def values: js.Array[StatusType] = js.Array(InSync, Failed, InProgress)
}
