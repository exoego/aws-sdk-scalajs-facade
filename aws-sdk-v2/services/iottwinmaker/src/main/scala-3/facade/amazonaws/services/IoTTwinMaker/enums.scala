package facade.amazonaws.services.iottwinmaker

import scalajs.js

type ComponentUpdateType = "CREATE" | "UPDATE" | "DELETE"
object ComponentUpdateType {
  inline val CREATE: "CREATE" = "CREATE"
  inline val UPDATE: "UPDATE" = "UPDATE"
  inline val DELETE: "DELETE" = "DELETE"

  inline def values: js.Array[ComponentUpdateType] = js.Array(CREATE, UPDATE, DELETE)
}

type ErrorCode = "VALIDATION_ERROR" | "INTERNAL_FAILURE"
object ErrorCode {
  inline val VALIDATION_ERROR: "VALIDATION_ERROR" = "VALIDATION_ERROR"
  inline val INTERNAL_FAILURE: "INTERNAL_FAILURE" = "INTERNAL_FAILURE"

  inline def values: js.Array[ErrorCode] = js.Array(VALIDATION_ERROR, INTERNAL_FAILURE)
}

type InterpolationType = "LINEAR"
object InterpolationType {
  inline val LINEAR: "LINEAR" = "LINEAR"

  inline def values: js.Array[InterpolationType] = js.Array(LINEAR)
}

type OrderByTime = "ASCENDING" | "DESCENDING"
object OrderByTime {
  inline val ASCENDING: "ASCENDING" = "ASCENDING"
  inline val DESCENDING: "DESCENDING" = "DESCENDING"

  inline def values: js.Array[OrderByTime] = js.Array(ASCENDING, DESCENDING)
}

type ParentEntityUpdateType = "UPDATE" | "DELETE"
object ParentEntityUpdateType {
  inline val UPDATE: "UPDATE" = "UPDATE"
  inline val DELETE: "DELETE" = "DELETE"

  inline def values: js.Array[ParentEntityUpdateType] = js.Array(UPDATE, DELETE)
}

type PropertyUpdateType = "UPDATE" | "DELETE"
object PropertyUpdateType {
  inline val UPDATE: "UPDATE" = "UPDATE"
  inline val DELETE: "DELETE" = "DELETE"

  inline def values: js.Array[PropertyUpdateType] = js.Array(UPDATE, DELETE)
}

type Scope = "ENTITY" | "WORKSPACE"
object Scope {
  inline val ENTITY: "ENTITY" = "ENTITY"
  inline val WORKSPACE: "WORKSPACE" = "WORKSPACE"

  inline def values: js.Array[Scope] = js.Array(ENTITY, WORKSPACE)
}

type State = "CREATING" | "UPDATING" | "DELETING" | "ACTIVE" | "ERROR"
object State {
  inline val CREATING: "CREATING" = "CREATING"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[State] = js.Array(CREATING, UPDATING, DELETING, ACTIVE, ERROR)
}

type Type = "RELATIONSHIP" | "STRING" | "LONG" | "BOOLEAN" | "INTEGER" | "DOUBLE" | "LIST" | "MAP"
object Type {
  inline val RELATIONSHIP: "RELATIONSHIP" = "RELATIONSHIP"
  inline val STRING: "STRING" = "STRING"
  inline val LONG: "LONG" = "LONG"
  inline val BOOLEAN: "BOOLEAN" = "BOOLEAN"
  inline val INTEGER: "INTEGER" = "INTEGER"
  inline val DOUBLE: "DOUBLE" = "DOUBLE"
  inline val LIST: "LIST" = "LIST"
  inline val MAP: "MAP" = "MAP"

  inline def values: js.Array[Type] = js.Array(RELATIONSHIP, STRING, LONG, BOOLEAN, INTEGER, DOUBLE, LIST, MAP)
}
