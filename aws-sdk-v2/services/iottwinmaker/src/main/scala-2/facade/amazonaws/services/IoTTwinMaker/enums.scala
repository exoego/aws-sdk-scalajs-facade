package facade.amazonaws.services.iottwinmaker

import scalajs.js

@js.native
sealed trait ColumnType extends js.Any
object ColumnType {
  val NODE = "NODE".asInstanceOf[ColumnType]
  val EDGE = "EDGE".asInstanceOf[ColumnType]
  val VALUE = "VALUE".asInstanceOf[ColumnType]

  @inline def values: js.Array[ColumnType] = js.Array(NODE, EDGE, VALUE)
}

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
  val SYNC_INITIALIZING_ERROR = "SYNC_INITIALIZING_ERROR".asInstanceOf[ErrorCode]
  val SYNC_CREATING_ERROR = "SYNC_CREATING_ERROR".asInstanceOf[ErrorCode]
  val SYNC_PROCESSING_ERROR = "SYNC_PROCESSING_ERROR".asInstanceOf[ErrorCode]

  @inline def values: js.Array[ErrorCode] = js.Array(VALIDATION_ERROR, INTERNAL_FAILURE, SYNC_INITIALIZING_ERROR, SYNC_CREATING_ERROR, SYNC_PROCESSING_ERROR)
}

@js.native
sealed trait GroupType extends js.Any
object GroupType {
  val TABULAR = "TABULAR".asInstanceOf[GroupType]

  @inline def values: js.Array[GroupType] = js.Array(TABULAR)
}

@js.native
sealed trait InterpolationType extends js.Any
object InterpolationType {
  val LINEAR = "LINEAR".asInstanceOf[InterpolationType]

  @inline def values: js.Array[InterpolationType] = js.Array(LINEAR)
}

@js.native
sealed trait Order extends js.Any
object Order {
  val ASCENDING = "ASCENDING".asInstanceOf[Order]
  val DESCENDING = "DESCENDING".asInstanceOf[Order]

  @inline def values: js.Array[Order] = js.Array(ASCENDING, DESCENDING)
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
sealed trait PricingMode extends js.Any
object PricingMode {
  val BASIC = "BASIC".asInstanceOf[PricingMode]
  val STANDARD = "STANDARD".asInstanceOf[PricingMode]
  val TIERED_BUNDLE = "TIERED_BUNDLE".asInstanceOf[PricingMode]

  @inline def values: js.Array[PricingMode] = js.Array(BASIC, STANDARD, TIERED_BUNDLE)
}

@js.native
sealed trait PricingTier extends js.Any
object PricingTier {
  val TIER_1 = "TIER_1".asInstanceOf[PricingTier]
  val TIER_2 = "TIER_2".asInstanceOf[PricingTier]
  val TIER_3 = "TIER_3".asInstanceOf[PricingTier]
  val TIER_4 = "TIER_4".asInstanceOf[PricingTier]

  @inline def values: js.Array[PricingTier] = js.Array(TIER_1, TIER_2, TIER_3, TIER_4)
}

@js.native
sealed trait PropertyGroupUpdateType extends js.Any
object PropertyGroupUpdateType {
  val UPDATE = "UPDATE".asInstanceOf[PropertyGroupUpdateType]
  val DELETE = "DELETE".asInstanceOf[PropertyGroupUpdateType]
  val CREATE = "CREATE".asInstanceOf[PropertyGroupUpdateType]

  @inline def values: js.Array[PropertyGroupUpdateType] = js.Array(UPDATE, DELETE, CREATE)
}

@js.native
sealed trait PropertyUpdateType extends js.Any
object PropertyUpdateType {
  val UPDATE = "UPDATE".asInstanceOf[PropertyUpdateType]
  val DELETE = "DELETE".asInstanceOf[PropertyUpdateType]
  val CREATE = "CREATE".asInstanceOf[PropertyUpdateType]

  @inline def values: js.Array[PropertyUpdateType] = js.Array(UPDATE, DELETE, CREATE)
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
sealed trait SyncJobState extends js.Any
object SyncJobState {
  val CREATING = "CREATING".asInstanceOf[SyncJobState]
  val INITIALIZING = "INITIALIZING".asInstanceOf[SyncJobState]
  val ACTIVE = "ACTIVE".asInstanceOf[SyncJobState]
  val DELETING = "DELETING".asInstanceOf[SyncJobState]
  val ERROR = "ERROR".asInstanceOf[SyncJobState]

  @inline def values: js.Array[SyncJobState] = js.Array(CREATING, INITIALIZING, ACTIVE, DELETING, ERROR)
}

@js.native
sealed trait SyncResourceState extends js.Any
object SyncResourceState {
  val INITIALIZING = "INITIALIZING".asInstanceOf[SyncResourceState]
  val PROCESSING = "PROCESSING".asInstanceOf[SyncResourceState]
  val DELETED = "DELETED".asInstanceOf[SyncResourceState]
  val IN_SYNC = "IN_SYNC".asInstanceOf[SyncResourceState]
  val ERROR = "ERROR".asInstanceOf[SyncResourceState]

  @inline def values: js.Array[SyncResourceState] = js.Array(INITIALIZING, PROCESSING, DELETED, IN_SYNC, ERROR)
}

@js.native
sealed trait SyncResourceType extends js.Any
object SyncResourceType {
  val ENTITY = "ENTITY".asInstanceOf[SyncResourceType]
  val COMPONENT_TYPE = "COMPONENT_TYPE".asInstanceOf[SyncResourceType]

  @inline def values: js.Array[SyncResourceType] = js.Array(ENTITY, COMPONENT_TYPE)
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

@js.native
sealed trait UpdateReason extends js.Any
object UpdateReason {
  val DEFAULT = "DEFAULT".asInstanceOf[UpdateReason]
  val PRICING_TIER_UPDATE = "PRICING_TIER_UPDATE".asInstanceOf[UpdateReason]
  val ENTITY_COUNT_UPDATE = "ENTITY_COUNT_UPDATE".asInstanceOf[UpdateReason]
  val PRICING_MODE_UPDATE = "PRICING_MODE_UPDATE".asInstanceOf[UpdateReason]
  val OVERWRITTEN = "OVERWRITTEN".asInstanceOf[UpdateReason]

  @inline def values: js.Array[UpdateReason] = js.Array(DEFAULT, PRICING_TIER_UPDATE, ENTITY_COUNT_UPDATE, PRICING_MODE_UPDATE, OVERWRITTEN)
}
