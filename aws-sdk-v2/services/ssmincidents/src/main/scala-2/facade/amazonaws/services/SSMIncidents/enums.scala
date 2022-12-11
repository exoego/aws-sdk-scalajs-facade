package facade.amazonaws.services.ssmincidents

import scalajs.js

@js.native
sealed trait IncidentRecordStatus extends js.Any
object IncidentRecordStatus {
  val OPEN = "OPEN".asInstanceOf[IncidentRecordStatus]
  val RESOLVED = "RESOLVED".asInstanceOf[IncidentRecordStatus]

  @inline def values: js.Array[IncidentRecordStatus] = js.Array(OPEN, RESOLVED)
}

@js.native
sealed trait ItemType extends js.Any
object ItemType {
  val ANALYSIS = "ANALYSIS".asInstanceOf[ItemType]
  val INCIDENT = "INCIDENT".asInstanceOf[ItemType]
  val METRIC = "METRIC".asInstanceOf[ItemType]
  val PARENT = "PARENT".asInstanceOf[ItemType]
  val ATTACHMENT = "ATTACHMENT".asInstanceOf[ItemType]
  val OTHER = "OTHER".asInstanceOf[ItemType]
  val AUTOMATION = "AUTOMATION".asInstanceOf[ItemType]
  val INVOLVED_RESOURCE = "INVOLVED_RESOURCE".asInstanceOf[ItemType]
  val TASK = "TASK".asInstanceOf[ItemType]

  @inline def values: js.Array[ItemType] = js.Array(ANALYSIS, INCIDENT, METRIC, PARENT, ATTACHMENT, OTHER, AUTOMATION, INVOLVED_RESOURCE, TASK)
}

@js.native
sealed trait RegionStatus extends js.Any
object RegionStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[RegionStatus]
  val CREATING = "CREATING".asInstanceOf[RegionStatus]
  val DELETING = "DELETING".asInstanceOf[RegionStatus]
  val FAILED = "FAILED".asInstanceOf[RegionStatus]

  @inline def values: js.Array[RegionStatus] = js.Array(ACTIVE, CREATING, DELETING, FAILED)
}

@js.native
sealed trait ReplicationSetStatus extends js.Any
object ReplicationSetStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[ReplicationSetStatus]
  val CREATING = "CREATING".asInstanceOf[ReplicationSetStatus]
  val UPDATING = "UPDATING".asInstanceOf[ReplicationSetStatus]
  val DELETING = "DELETING".asInstanceOf[ReplicationSetStatus]
  val FAILED = "FAILED".asInstanceOf[ReplicationSetStatus]

  @inline def values: js.Array[ReplicationSetStatus] = js.Array(ACTIVE, CREATING, UPDATING, DELETING, FAILED)
}

@js.native
sealed trait SortOrder extends js.Any
object SortOrder {
  val ASCENDING = "ASCENDING".asInstanceOf[SortOrder]
  val DESCENDING = "DESCENDING".asInstanceOf[SortOrder]

  @inline def values: js.Array[SortOrder] = js.Array(ASCENDING, DESCENDING)
}

@js.native
sealed trait SsmTargetAccount extends js.Any
object SsmTargetAccount {
  val RESPONSE_PLAN_OWNER_ACCOUNT = "RESPONSE_PLAN_OWNER_ACCOUNT".asInstanceOf[SsmTargetAccount]
  val IMPACTED_ACCOUNT = "IMPACTED_ACCOUNT".asInstanceOf[SsmTargetAccount]

  @inline def values: js.Array[SsmTargetAccount] = js.Array(RESPONSE_PLAN_OWNER_ACCOUNT, IMPACTED_ACCOUNT)
}

@js.native
sealed trait TimelineEventSort extends js.Any
object TimelineEventSort {
  val EVENT_TIME = "EVENT_TIME".asInstanceOf[TimelineEventSort]

  @inline def values: js.Array[TimelineEventSort] = js.Array(EVENT_TIME)
}

@js.native
sealed trait VariableType extends js.Any
object VariableType {
  val INCIDENT_RECORD_ARN = "INCIDENT_RECORD_ARN".asInstanceOf[VariableType]
  val INVOLVED_RESOURCES = "INVOLVED_RESOURCES".asInstanceOf[VariableType]

  @inline def values: js.Array[VariableType] = js.Array(INCIDENT_RECORD_ARN, INVOLVED_RESOURCES)
}
