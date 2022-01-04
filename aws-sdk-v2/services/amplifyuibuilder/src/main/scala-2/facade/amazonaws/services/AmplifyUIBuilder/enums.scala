package facade.amazonaws.services.amplifyuibuilder

import scalajs.js

@js.native
sealed trait SortDirection extends js.Any
object SortDirection {
  val ASC = "ASC".asInstanceOf[SortDirection]
  val DESC = "DESC".asInstanceOf[SortDirection]

  @inline def values: js.Array[SortDirection] = js.Array(ASC, DESC)
}

@js.native
sealed trait TokenProviders extends js.Any
object TokenProviders {
  val figma = "figma".asInstanceOf[TokenProviders]

  @inline def values: js.Array[TokenProviders] = js.Array(figma)
}
