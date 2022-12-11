package facade.amazonaws.services.amplifyuibuilder

import scalajs.js

@js.native
sealed trait FixedPosition extends js.Any
object FixedPosition {
  val first = "first".asInstanceOf[FixedPosition]

  @inline def values: js.Array[FixedPosition] = js.Array(first)
}

@js.native
sealed trait FormActionType extends js.Any
object FormActionType {
  val create = "create".asInstanceOf[FormActionType]
  val update = "update".asInstanceOf[FormActionType]

  @inline def values: js.Array[FormActionType] = js.Array(create, update)
}

@js.native
sealed trait FormButtonsPosition extends js.Any
object FormButtonsPosition {
  val top = "top".asInstanceOf[FormButtonsPosition]
  val bottom = "bottom".asInstanceOf[FormButtonsPosition]
  val top_and_bottom = "top_and_bottom".asInstanceOf[FormButtonsPosition]

  @inline def values: js.Array[FormButtonsPosition] = js.Array(top, bottom, top_and_bottom)
}

@js.native
sealed trait FormDataSourceType extends js.Any
object FormDataSourceType {
  val DataStore = "DataStore".asInstanceOf[FormDataSourceType]
  val Custom = "Custom".asInstanceOf[FormDataSourceType]

  @inline def values: js.Array[FormDataSourceType] = js.Array(DataStore, Custom)
}

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
