package facade.amazonaws.services.iottwinmaker

import scalajs.js

type ColumnType = "NODE" | "EDGE" | "VALUE"
object ColumnType {
  inline val NODE: "NODE" = "NODE"
  inline val EDGE: "EDGE" = "EDGE"
  inline val VALUE: "VALUE" = "VALUE"

  inline def values: js.Array[ColumnType] = js.Array(NODE, EDGE, VALUE)
}

type ComponentUpdateType = "CREATE" | "UPDATE" | "DELETE"
object ComponentUpdateType {
  inline val CREATE: "CREATE" = "CREATE"
  inline val UPDATE: "UPDATE" = "UPDATE"
  inline val DELETE: "DELETE" = "DELETE"

  inline def values: js.Array[ComponentUpdateType] = js.Array(CREATE, UPDATE, DELETE)
}

type ErrorCode = "VALIDATION_ERROR" | "INTERNAL_FAILURE" | "SYNC_INITIALIZING_ERROR" | "SYNC_CREATING_ERROR" | "SYNC_PROCESSING_ERROR"
object ErrorCode {
  inline val VALIDATION_ERROR: "VALIDATION_ERROR" = "VALIDATION_ERROR"
  inline val INTERNAL_FAILURE: "INTERNAL_FAILURE" = "INTERNAL_FAILURE"
  inline val SYNC_INITIALIZING_ERROR: "SYNC_INITIALIZING_ERROR" = "SYNC_INITIALIZING_ERROR"
  inline val SYNC_CREATING_ERROR: "SYNC_CREATING_ERROR" = "SYNC_CREATING_ERROR"
  inline val SYNC_PROCESSING_ERROR: "SYNC_PROCESSING_ERROR" = "SYNC_PROCESSING_ERROR"

  inline def values: js.Array[ErrorCode] = js.Array(VALIDATION_ERROR, INTERNAL_FAILURE, SYNC_INITIALIZING_ERROR, SYNC_CREATING_ERROR, SYNC_PROCESSING_ERROR)
}

type GroupType = "TABULAR"
object GroupType {
  inline val TABULAR: "TABULAR" = "TABULAR"

  inline def values: js.Array[GroupType] = js.Array(TABULAR)
}

type InterpolationType = "LINEAR"
object InterpolationType {
  inline val LINEAR: "LINEAR" = "LINEAR"

  inline def values: js.Array[InterpolationType] = js.Array(LINEAR)
}

type Order = "ASCENDING" | "DESCENDING"
object Order {
  inline val ASCENDING: "ASCENDING" = "ASCENDING"
  inline val DESCENDING: "DESCENDING" = "DESCENDING"

  inline def values: js.Array[Order] = js.Array(ASCENDING, DESCENDING)
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

type PricingMode = "BASIC" | "STANDARD" | "TIERED_BUNDLE"
object PricingMode {
  inline val BASIC: "BASIC" = "BASIC"
  inline val STANDARD: "STANDARD" = "STANDARD"
  inline val TIERED_BUNDLE: "TIERED_BUNDLE" = "TIERED_BUNDLE"

  inline def values: js.Array[PricingMode] = js.Array(BASIC, STANDARD, TIERED_BUNDLE)
}

type PricingTier = "TIER_1" | "TIER_2" | "TIER_3" | "TIER_4"
object PricingTier {
  inline val TIER_1: "TIER_1" = "TIER_1"
  inline val TIER_2: "TIER_2" = "TIER_2"
  inline val TIER_3: "TIER_3" = "TIER_3"
  inline val TIER_4: "TIER_4" = "TIER_4"

  inline def values: js.Array[PricingTier] = js.Array(TIER_1, TIER_2, TIER_3, TIER_4)
}

type PropertyGroupUpdateType = "UPDATE" | "DELETE" | "CREATE"
object PropertyGroupUpdateType {
  inline val UPDATE: "UPDATE" = "UPDATE"
  inline val DELETE: "DELETE" = "DELETE"
  inline val CREATE: "CREATE" = "CREATE"

  inline def values: js.Array[PropertyGroupUpdateType] = js.Array(UPDATE, DELETE, CREATE)
}

type PropertyUpdateType = "UPDATE" | "DELETE" | "CREATE"
object PropertyUpdateType {
  inline val UPDATE: "UPDATE" = "UPDATE"
  inline val DELETE: "DELETE" = "DELETE"
  inline val CREATE: "CREATE" = "CREATE"

  inline def values: js.Array[PropertyUpdateType] = js.Array(UPDATE, DELETE, CREATE)
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

type SyncJobState = "CREATING" | "INITIALIZING" | "ACTIVE" | "DELETING" | "ERROR"
object SyncJobState {
  inline val CREATING: "CREATING" = "CREATING"
  inline val INITIALIZING: "INITIALIZING" = "INITIALIZING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[SyncJobState] = js.Array(CREATING, INITIALIZING, ACTIVE, DELETING, ERROR)
}

type SyncResourceState = "INITIALIZING" | "PROCESSING" | "DELETED" | "IN_SYNC" | "ERROR"
object SyncResourceState {
  inline val INITIALIZING: "INITIALIZING" = "INITIALIZING"
  inline val PROCESSING: "PROCESSING" = "PROCESSING"
  inline val DELETED: "DELETED" = "DELETED"
  inline val IN_SYNC: "IN_SYNC" = "IN_SYNC"
  inline val ERROR: "ERROR" = "ERROR"

  inline def values: js.Array[SyncResourceState] = js.Array(INITIALIZING, PROCESSING, DELETED, IN_SYNC, ERROR)
}

type SyncResourceType = "ENTITY" | "COMPONENT_TYPE"
object SyncResourceType {
  inline val ENTITY: "ENTITY" = "ENTITY"
  inline val COMPONENT_TYPE: "COMPONENT_TYPE" = "COMPONENT_TYPE"

  inline def values: js.Array[SyncResourceType] = js.Array(ENTITY, COMPONENT_TYPE)
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

type UpdateReason = "DEFAULT" | "PRICING_TIER_UPDATE" | "ENTITY_COUNT_UPDATE" | "PRICING_MODE_UPDATE" | "OVERWRITTEN"
object UpdateReason {
  inline val DEFAULT: "DEFAULT" = "DEFAULT"
  inline val PRICING_TIER_UPDATE: "PRICING_TIER_UPDATE" = "PRICING_TIER_UPDATE"
  inline val ENTITY_COUNT_UPDATE: "ENTITY_COUNT_UPDATE" = "ENTITY_COUNT_UPDATE"
  inline val PRICING_MODE_UPDATE: "PRICING_MODE_UPDATE" = "PRICING_MODE_UPDATE"
  inline val OVERWRITTEN: "OVERWRITTEN" = "OVERWRITTEN"

  inline def values: js.Array[UpdateReason] = js.Array(DEFAULT, PRICING_TIER_UPDATE, ENTITY_COUNT_UPDATE, PRICING_MODE_UPDATE, OVERWRITTEN)
}
