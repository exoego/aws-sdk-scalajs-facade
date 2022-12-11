package facade.amazonaws.services.ssmincidents

import scalajs.js

type IncidentRecordStatus = "OPEN" | "RESOLVED"
object IncidentRecordStatus {
  inline val OPEN: "OPEN" = "OPEN"
  inline val RESOLVED: "RESOLVED" = "RESOLVED"

  inline def values: js.Array[IncidentRecordStatus] = js.Array(OPEN, RESOLVED)
}

type ItemType = "ANALYSIS" | "INCIDENT" | "METRIC" | "PARENT" | "ATTACHMENT" | "OTHER" | "AUTOMATION" | "INVOLVED_RESOURCE" | "TASK"
object ItemType {
  inline val ANALYSIS: "ANALYSIS" = "ANALYSIS"
  inline val INCIDENT: "INCIDENT" = "INCIDENT"
  inline val METRIC: "METRIC" = "METRIC"
  inline val PARENT: "PARENT" = "PARENT"
  inline val ATTACHMENT: "ATTACHMENT" = "ATTACHMENT"
  inline val OTHER: "OTHER" = "OTHER"
  inline val AUTOMATION: "AUTOMATION" = "AUTOMATION"
  inline val INVOLVED_RESOURCE: "INVOLVED_RESOURCE" = "INVOLVED_RESOURCE"
  inline val TASK: "TASK" = "TASK"

  inline def values: js.Array[ItemType] = js.Array(ANALYSIS, INCIDENT, METRIC, PARENT, ATTACHMENT, OTHER, AUTOMATION, INVOLVED_RESOURCE, TASK)
}

type RegionStatus = "ACTIVE" | "CREATING" | "DELETING" | "FAILED"
object RegionStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val CREATING: "CREATING" = "CREATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[RegionStatus] = js.Array(ACTIVE, CREATING, DELETING, FAILED)
}

type ReplicationSetStatus = "ACTIVE" | "CREATING" | "UPDATING" | "DELETING" | "FAILED"
object ReplicationSetStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val CREATING: "CREATING" = "CREATING"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[ReplicationSetStatus] = js.Array(ACTIVE, CREATING, UPDATING, DELETING, FAILED)
}

type SortOrder = "ASCENDING" | "DESCENDING"
object SortOrder {
  inline val ASCENDING: "ASCENDING" = "ASCENDING"
  inline val DESCENDING: "DESCENDING" = "DESCENDING"

  inline def values: js.Array[SortOrder] = js.Array(ASCENDING, DESCENDING)
}

type SsmTargetAccount = "RESPONSE_PLAN_OWNER_ACCOUNT" | "IMPACTED_ACCOUNT"
object SsmTargetAccount {
  inline val RESPONSE_PLAN_OWNER_ACCOUNT: "RESPONSE_PLAN_OWNER_ACCOUNT" = "RESPONSE_PLAN_OWNER_ACCOUNT"
  inline val IMPACTED_ACCOUNT: "IMPACTED_ACCOUNT" = "IMPACTED_ACCOUNT"

  inline def values: js.Array[SsmTargetAccount] = js.Array(RESPONSE_PLAN_OWNER_ACCOUNT, IMPACTED_ACCOUNT)
}

type TimelineEventSort = "EVENT_TIME"
object TimelineEventSort {
  inline val EVENT_TIME: "EVENT_TIME" = "EVENT_TIME"

  inline def values: js.Array[TimelineEventSort] = js.Array(EVENT_TIME)
}

type VariableType = "INCIDENT_RECORD_ARN" | "INVOLVED_RESOURCES"
object VariableType {
  inline val INCIDENT_RECORD_ARN: "INCIDENT_RECORD_ARN" = "INCIDENT_RECORD_ARN"
  inline val INVOLVED_RESOURCES: "INVOLVED_RESOURCES" = "INVOLVED_RESOURCES"

  inline def values: js.Array[VariableType] = js.Array(INCIDENT_RECORD_ARN, INVOLVED_RESOURCES)
}
