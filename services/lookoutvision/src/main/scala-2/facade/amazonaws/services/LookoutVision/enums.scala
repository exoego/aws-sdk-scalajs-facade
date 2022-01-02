package facade.amazonaws.services.lookoutvision

import scalajs.js

@js.native
sealed trait DatasetStatus extends js.Any
object DatasetStatus {
  val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[DatasetStatus]
  val CREATE_COMPLETE = "CREATE_COMPLETE".asInstanceOf[DatasetStatus]
  val CREATE_FAILED = "CREATE_FAILED".asInstanceOf[DatasetStatus]
  val UPDATE_IN_PROGRESS = "UPDATE_IN_PROGRESS".asInstanceOf[DatasetStatus]
  val UPDATE_COMPLETE = "UPDATE_COMPLETE".asInstanceOf[DatasetStatus]
  val UPDATE_FAILED_ROLLBACK_IN_PROGRESS = "UPDATE_FAILED_ROLLBACK_IN_PROGRESS".asInstanceOf[DatasetStatus]
  val UPDATE_FAILED_ROLLBACK_COMPLETE = "UPDATE_FAILED_ROLLBACK_COMPLETE".asInstanceOf[DatasetStatus]
  val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[DatasetStatus]
  val DELETE_COMPLETE = "DELETE_COMPLETE".asInstanceOf[DatasetStatus]
  val DELETE_FAILED = "DELETE_FAILED".asInstanceOf[DatasetStatus]

  @inline def values: js.Array[DatasetStatus] = js.Array(
    CREATE_IN_PROGRESS,
    CREATE_COMPLETE,
    CREATE_FAILED,
    UPDATE_IN_PROGRESS,
    UPDATE_COMPLETE,
    UPDATE_FAILED_ROLLBACK_IN_PROGRESS,
    UPDATE_FAILED_ROLLBACK_COMPLETE,
    DELETE_IN_PROGRESS,
    DELETE_COMPLETE,
    DELETE_FAILED
  )
}

@js.native
sealed trait ModelHostingStatus extends js.Any
object ModelHostingStatus {
  val STARTING_HOSTING = "STARTING_HOSTING".asInstanceOf[ModelHostingStatus]
  val HOSTED = "HOSTED".asInstanceOf[ModelHostingStatus]
  val HOSTING_FAILED = "HOSTING_FAILED".asInstanceOf[ModelHostingStatus]
  val STOPPING_HOSTING = "STOPPING_HOSTING".asInstanceOf[ModelHostingStatus]
  val SYSTEM_UPDATING = "SYSTEM_UPDATING".asInstanceOf[ModelHostingStatus]

  @inline def values: js.Array[ModelHostingStatus] = js.Array(STARTING_HOSTING, HOSTED, HOSTING_FAILED, STOPPING_HOSTING, SYSTEM_UPDATING)
}

@js.native
sealed trait ModelPackagingJobStatus extends js.Any
object ModelPackagingJobStatus {
  val CREATED = "CREATED".asInstanceOf[ModelPackagingJobStatus]
  val RUNNING = "RUNNING".asInstanceOf[ModelPackagingJobStatus]
  val SUCCEEDED = "SUCCEEDED".asInstanceOf[ModelPackagingJobStatus]
  val FAILED = "FAILED".asInstanceOf[ModelPackagingJobStatus]

  @inline def values: js.Array[ModelPackagingJobStatus] = js.Array(CREATED, RUNNING, SUCCEEDED, FAILED)
}

@js.native
sealed trait ModelStatus extends js.Any
object ModelStatus {
  val TRAINING = "TRAINING".asInstanceOf[ModelStatus]
  val TRAINED = "TRAINED".asInstanceOf[ModelStatus]
  val TRAINING_FAILED = "TRAINING_FAILED".asInstanceOf[ModelStatus]
  val STARTING_HOSTING = "STARTING_HOSTING".asInstanceOf[ModelStatus]
  val HOSTED = "HOSTED".asInstanceOf[ModelStatus]
  val HOSTING_FAILED = "HOSTING_FAILED".asInstanceOf[ModelStatus]
  val STOPPING_HOSTING = "STOPPING_HOSTING".asInstanceOf[ModelStatus]
  val SYSTEM_UPDATING = "SYSTEM_UPDATING".asInstanceOf[ModelStatus]
  val DELETING = "DELETING".asInstanceOf[ModelStatus]

  @inline def values: js.Array[ModelStatus] = js.Array(TRAINING, TRAINED, TRAINING_FAILED, STARTING_HOSTING, HOSTED, HOSTING_FAILED, STOPPING_HOSTING, SYSTEM_UPDATING, DELETING)
}

@js.native
sealed trait TargetDevice extends js.Any
object TargetDevice {
  val jetson_xavier = "jetson_xavier".asInstanceOf[TargetDevice]

  @inline def values: js.Array[TargetDevice] = js.Array(jetson_xavier)
}

@js.native
sealed trait TargetPlatformAccelerator extends js.Any
object TargetPlatformAccelerator {
  val NVIDIA = "NVIDIA".asInstanceOf[TargetPlatformAccelerator]

  @inline def values: js.Array[TargetPlatformAccelerator] = js.Array(NVIDIA)
}

@js.native
sealed trait TargetPlatformArch extends js.Any
object TargetPlatformArch {
  val ARM64 = "ARM64".asInstanceOf[TargetPlatformArch]
  val X86_64 = "X86_64".asInstanceOf[TargetPlatformArch]

  @inline def values: js.Array[TargetPlatformArch] = js.Array(ARM64, X86_64)
}

@js.native
sealed trait TargetPlatformOs extends js.Any
object TargetPlatformOs {
  val LINUX = "LINUX".asInstanceOf[TargetPlatformOs]

  @inline def values: js.Array[TargetPlatformOs] = js.Array(LINUX)
}