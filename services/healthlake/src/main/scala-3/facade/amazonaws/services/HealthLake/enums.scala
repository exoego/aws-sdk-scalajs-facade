package facade.amazonaws.services.healthlake

import scalajs._

type DatastoreStatus = "CREATING" | "ACTIVE" | "DELETING" | "DELETED"
object DatastoreStatus {
  val CREATING: "CREATING" = "CREATING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val DELETING: "DELETING" = "DELETING"
  val DELETED: "DELETED" = "DELETED"

  @inline def values = js.Array[DatastoreStatus](CREATING, ACTIVE, DELETING, DELETED)
}

type FHIRVersion = "R4"
object FHIRVersion {
  val R4: "R4" = "R4"

  @inline def values = js.Array[FHIRVersion](R4)
}

type JobStatus = "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "FAILED"
object JobStatus {
  val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[JobStatus](SUBMITTED, IN_PROGRESS, COMPLETED, FAILED)
}

type PreloadDataType = "SYNTHEA"
object PreloadDataType {
  val SYNTHEA: "SYNTHEA" = "SYNTHEA"

  @inline def values = js.Array[PreloadDataType](SYNTHEA)
}
