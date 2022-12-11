package facade.amazonaws.services.amplifyuibuilder

import scalajs.js

type FixedPosition = "first"
object FixedPosition {
  inline val first: "first" = "first"

  inline def values: js.Array[FixedPosition] = js.Array(first)
}

type FormActionType = "create" | "update"
object FormActionType {
  inline val create: "create" = "create"
  inline val update: "update" = "update"

  inline def values: js.Array[FormActionType] = js.Array(create, update)
}

type FormButtonsPosition = "top" | "bottom" | "top_and_bottom"
object FormButtonsPosition {
  inline val top: "top" = "top"
  inline val bottom: "bottom" = "bottom"
  inline val top_and_bottom: "top_and_bottom" = "top_and_bottom"

  inline def values: js.Array[FormButtonsPosition] = js.Array(top, bottom, top_and_bottom)
}

type FormDataSourceType = "DataStore" | "Custom"
object FormDataSourceType {
  inline val DataStore: "DataStore" = "DataStore"
  inline val Custom: "Custom" = "Custom"

  inline def values: js.Array[FormDataSourceType] = js.Array(DataStore, Custom)
}

type SortDirection = "ASC" | "DESC"
object SortDirection {
  inline val ASC: "ASC" = "ASC"
  inline val DESC: "DESC" = "DESC"

  inline def values: js.Array[SortDirection] = js.Array(ASC, DESC)
}

type TokenProviders = "figma"
object TokenProviders {
  inline val figma: "figma" = "figma"

  inline def values: js.Array[TokenProviders] = js.Array(figma)
}
