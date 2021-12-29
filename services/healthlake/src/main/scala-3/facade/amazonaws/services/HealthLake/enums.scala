package facade.amazonaws.services.healthlake

import scalajs._

type DatastoreStatus = "CREATING" | "ACTIVE" | "DELETING" | "DELETED"
object DatastoreStatus {
  inline val CREATING: "CREATING" = "CREATING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val DELETED: "DELETED" = "DELETED"

  inline def values: js.Array[DatastoreStatus] = js.Array(CREATING, ACTIVE, DELETING, DELETED)
}

type FHIRVersion = "R4"
object FHIRVersion {
  inline val R4: "R4" = "R4"

  inline def values: js.Array[FHIRVersion] = js.Array(R4)
}

type JobStatus = "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "FAILED"
object JobStatus {
  inline val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[JobStatus] = js.Array(SUBMITTED, IN_PROGRESS, COMPLETED, FAILED)
}

type PreloadDataType = "SYNTHEA"
object PreloadDataType {
  inline val SYNTHEA: "SYNTHEA" = "SYNTHEA"

  inline def values: js.Array[PreloadDataType] = js.Array(SYNTHEA)
}
