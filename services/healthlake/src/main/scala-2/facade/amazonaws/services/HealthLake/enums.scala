package facade.amazonaws.services.healthlake

import scalajs.js

@js.native
sealed trait CmkType extends js.Any
object CmkType {
  val CUSTOMER_MANAGED_KMS_KEY = "CUSTOMER_MANAGED_KMS_KEY".asInstanceOf[CmkType]
  val AWS_OWNED_KMS_KEY = "AWS_OWNED_KMS_KEY".asInstanceOf[CmkType]

  @inline def values: js.Array[CmkType] = js.Array(CUSTOMER_MANAGED_KMS_KEY, AWS_OWNED_KMS_KEY)
}

@js.native
sealed trait DatastoreStatus extends js.Any
object DatastoreStatus {
  val CREATING = "CREATING".asInstanceOf[DatastoreStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[DatastoreStatus]
  val DELETING = "DELETING".asInstanceOf[DatastoreStatus]
  val DELETED = "DELETED".asInstanceOf[DatastoreStatus]

  @inline def values: js.Array[DatastoreStatus] = js.Array(CREATING, ACTIVE, DELETING, DELETED)
}

@js.native
sealed trait FHIRVersion extends js.Any
object FHIRVersion {
  val R4 = "R4".asInstanceOf[FHIRVersion]

  @inline def values: js.Array[FHIRVersion] = js.Array(R4)
}

@js.native
sealed trait JobStatus extends js.Any
object JobStatus {
  val SUBMITTED = "SUBMITTED".asInstanceOf[JobStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[JobStatus]
  val COMPLETED_WITH_ERRORS = "COMPLETED_WITH_ERRORS".asInstanceOf[JobStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[JobStatus]
  val FAILED = "FAILED".asInstanceOf[JobStatus]

  @inline def values: js.Array[JobStatus] = js.Array(SUBMITTED, IN_PROGRESS, COMPLETED_WITH_ERRORS, COMPLETED, FAILED)
}

@js.native
sealed trait PreloadDataType extends js.Any
object PreloadDataType {
  val SYNTHEA = "SYNTHEA".asInstanceOf[PreloadDataType]

  @inline def values: js.Array[PreloadDataType] = js.Array(SYNTHEA)
}
