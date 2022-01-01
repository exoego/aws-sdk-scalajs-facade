package facade.amazonaws.services.amplifyuibuilder

import scalajs.js

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
