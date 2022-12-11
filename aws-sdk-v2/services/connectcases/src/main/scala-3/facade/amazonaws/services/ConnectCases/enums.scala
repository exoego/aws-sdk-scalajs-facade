package facade.amazonaws.services.connectcases

import scalajs.js

type CommentBodyTextType = "Text/Plain"
object CommentBodyTextType {
  inline val `Text/Plain`: "Text/Plain" = "Text/Plain"

  inline def values: js.Array[CommentBodyTextType] = js.Array(`Text/Plain`)
}

type DomainStatus = "Active" | "CreationInProgress" | "CreationFailed"
object DomainStatus {
  inline val Active: "Active" = "Active"
  inline val CreationInProgress: "CreationInProgress" = "CreationInProgress"
  inline val CreationFailed: "CreationFailed" = "CreationFailed"

  inline def values: js.Array[DomainStatus] = js.Array(Active, CreationInProgress, CreationFailed)
}

type FieldNamespace = "System" | "Custom"
object FieldNamespace {
  inline val System: "System" = "System"
  inline val Custom: "Custom" = "Custom"

  inline def values: js.Array[FieldNamespace] = js.Array(System, Custom)
}

type FieldType = "Text" | "Number" | "Boolean" | "DateTime" | "SingleSelect"
object FieldType {
  inline val Text: "Text" = "Text"
  inline val Number: "Number" = "Number"
  inline val Boolean: "Boolean" = "Boolean"
  inline val DateTime: "DateTime" = "DateTime"
  inline val SingleSelect: "SingleSelect" = "SingleSelect"

  inline def values: js.Array[FieldType] = js.Array(Text, Number, Boolean, DateTime, SingleSelect)
}

type Order = "Asc" | "Desc"
object Order {
  inline val Asc: "Asc" = "Asc"
  inline val Desc: "Desc" = "Desc"

  inline def values: js.Array[Order] = js.Array(Asc, Desc)
}

type RelatedItemType = "Contact" | "Comment"
object RelatedItemType {
  inline val Contact: "Contact" = "Contact"
  inline val Comment: "Comment" = "Comment"

  inline def values: js.Array[RelatedItemType] = js.Array(Contact, Comment)
}

/** Status of a template
  */
type TemplateStatus = "Active" | "Inactive"
object TemplateStatus {
  inline val Active: "Active" = "Active"
  inline val Inactive: "Inactive" = "Inactive"

  inline def values: js.Array[TemplateStatus] = js.Array(Active, Inactive)
}
