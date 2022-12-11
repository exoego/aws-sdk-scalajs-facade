package facade.amazonaws.services.connectcases

import scalajs.js

@js.native
sealed trait CommentBodyTextType extends js.Any
object CommentBodyTextType {
  val `Text/Plain` = "Text/Plain".asInstanceOf[CommentBodyTextType]

  @inline def values: js.Array[CommentBodyTextType] = js.Array(`Text/Plain`)
}

@js.native
sealed trait DomainStatus extends js.Any
object DomainStatus {
  val Active = "Active".asInstanceOf[DomainStatus]
  val CreationInProgress = "CreationInProgress".asInstanceOf[DomainStatus]
  val CreationFailed = "CreationFailed".asInstanceOf[DomainStatus]

  @inline def values: js.Array[DomainStatus] = js.Array(Active, CreationInProgress, CreationFailed)
}

@js.native
sealed trait FieldNamespace extends js.Any
object FieldNamespace {
  val System = "System".asInstanceOf[FieldNamespace]
  val Custom = "Custom".asInstanceOf[FieldNamespace]

  @inline def values: js.Array[FieldNamespace] = js.Array(System, Custom)
}

@js.native
sealed trait FieldType extends js.Any
object FieldType {
  val Text = "Text".asInstanceOf[FieldType]
  val Number = "Number".asInstanceOf[FieldType]
  val Boolean = "Boolean".asInstanceOf[FieldType]
  val DateTime = "DateTime".asInstanceOf[FieldType]
  val SingleSelect = "SingleSelect".asInstanceOf[FieldType]

  @inline def values: js.Array[FieldType] = js.Array(Text, Number, Boolean, DateTime, SingleSelect)
}

@js.native
sealed trait Order extends js.Any
object Order {
  val Asc = "Asc".asInstanceOf[Order]
  val Desc = "Desc".asInstanceOf[Order]

  @inline def values: js.Array[Order] = js.Array(Asc, Desc)
}

@js.native
sealed trait RelatedItemType extends js.Any
object RelatedItemType {
  val Contact = "Contact".asInstanceOf[RelatedItemType]
  val Comment = "Comment".asInstanceOf[RelatedItemType]

  @inline def values: js.Array[RelatedItemType] = js.Array(Contact, Comment)
}

/** Status of a template
  */
@js.native
sealed trait TemplateStatus extends js.Any
object TemplateStatus {
  val Active = "Active".asInstanceOf[TemplateStatus]
  val Inactive = "Inactive".asInstanceOf[TemplateStatus]

  @inline def values: js.Array[TemplateStatus] = js.Array(Active, Inactive)
}
