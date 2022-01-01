package facade.amazonaws.services.iottwinmaker

import scalajs.js

@js.native
sealed trait ComponentUpdateType extends js.Any
object ComponentUpdateType {
  val CREATE = "CREATE".asInstanceOf[ComponentUpdateType]
  val UPDATE = "UPDATE".asInstanceOf[ComponentUpdateType]
  val DELETE = "DELETE".asInstanceOf[ComponentUpdateType]

  @inline def values: js.Array[ComponentUpdateType] = js.Array(CREATE, UPDATE, DELETE)
}

@js.native
sealed trait ErrorCode extends js.Any
object ErrorCode {
  val VALIDATION_ERROR = "VALIDATION_ERROR".asInstanceOf[ErrorCode]
  val INTERNAL_FAILURE = "INTERNAL_FAILURE".asInstanceOf[ErrorCode]

  @inline def values: js.Array[ErrorCode] = js.Array(VALIDATION_ERROR, INTERNAL_FAILURE)
}

@js.native
sealed trait InterpolationType extends js.Any
object InterpolationType {
  val LINEAR = "LINEAR".asInstanceOf[InterpolationType]

  @inline def values: js.Array[InterpolationType] = js.Array(LINEAR)
}

@js.native
sealed trait OrderByTime extends js.Any
object OrderByTime {
  val ASCENDING = "ASCENDING".asInstanceOf[OrderByTime]
  val DESCENDING = "DESCENDING".asInstanceOf[OrderByTime]

  @inline def values: js.Array[OrderByTime] = js.Array(ASCENDING, DESCENDING)
}

@js.native
sealed trait ParentEntityUpdateType extends js.Any
object ParentEntityUpdateType {
  val UPDATE = "UPDATE".asInstanceOf[ParentEntityUpdateType]
  val DELETE = "DELETE".asInstanceOf[ParentEntityUpdateType]

  @inline def values: js.Array[ParentEntityUpdateType] = js.Array(UPDATE, DELETE)
}

@js.native
sealed trait PropertyUpdateType extends js.Any
object PropertyUpdateType {
  val UPDATE = "UPDATE".asInstanceOf[PropertyUpdateType]
  val DELETE = "DELETE".asInstanceOf[PropertyUpdateType]

  @inline def values: js.Array[PropertyUpdateType] = js.Array(UPDATE, DELETE)
}

@js.native
sealed trait Scope extends js.Any
object Scope {
  val ENTITY = "ENTITY".asInstanceOf[Scope]
  val WORKSPACE = "WORKSPACE".asInstanceOf[Scope]

  @inline def values: js.Array[Scope] = js.Array(ENTITY, WORKSPACE)
}

@js.native
sealed trait State extends js.Any
object State {
  val CREATING = "CREATING".asInstanceOf[State]
  val UPDATING = "UPDATING".asInstanceOf[State]
  val DELETING = "DELETING".asInstanceOf[State]
  val ACTIVE = "ACTIVE".asInstanceOf[State]
  val ERROR = "ERROR".asInstanceOf[State]

  @inline def values: js.Array[State] = js.Array(CREATING, UPDATING, DELETING, ACTIVE, ERROR)
}

@js.native
sealed trait Type extends js.Any
object Type {
  val RELATIONSHIP = "RELATIONSHIP".asInstanceOf[Type]
  val STRING = "STRING".asInstanceOf[Type]
  val LONG = "LONG".asInstanceOf[Type]
  val BOOLEAN = "BOOLEAN".asInstanceOf[Type]
  val INTEGER = "INTEGER".asInstanceOf[Type]
  val DOUBLE = "DOUBLE".asInstanceOf[Type]
  val LIST = "LIST".asInstanceOf[Type]
  val MAP = "MAP".asInstanceOf[Type]

  @inline def values: js.Array[Type] = js.Array(RELATIONSHIP, STRING, LONG, BOOLEAN, INTEGER, DOUBLE, LIST, MAP)
}
