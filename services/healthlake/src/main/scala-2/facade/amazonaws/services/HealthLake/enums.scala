package facade.amazonaws.services.healthlake

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait DatastoreStatus extends js.Any
object DatastoreStatus {
  val CREATING = "CREATING".asInstanceOf[DatastoreStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[DatastoreStatus]
  val DELETING = "DELETING".asInstanceOf[DatastoreStatus]
  val DELETED = "DELETED".asInstanceOf[DatastoreStatus]

  @inline def values = js.Array(CREATING, ACTIVE, DELETING, DELETED)
}

@js.native
sealed trait FHIRVersion extends js.Any
object FHIRVersion {
  val R4 = "R4".asInstanceOf[FHIRVersion]

  @inline def values = js.Array(R4)
}

@js.native
sealed trait JobStatus extends js.Any
object JobStatus {
  val SUBMITTED = "SUBMITTED".asInstanceOf[JobStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[JobStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[JobStatus]
  val FAILED = "FAILED".asInstanceOf[JobStatus]

  @inline def values = js.Array(SUBMITTED, IN_PROGRESS, COMPLETED, FAILED)
}

@js.native
sealed trait PreloadDataType extends js.Any
object PreloadDataType {
  val SYNTHEA = "SYNTHEA".asInstanceOf[PreloadDataType]

  @inline def values = js.Array(SYNTHEA)
}
