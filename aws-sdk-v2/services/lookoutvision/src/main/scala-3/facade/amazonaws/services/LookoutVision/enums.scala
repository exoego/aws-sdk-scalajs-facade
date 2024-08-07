package facade.amazonaws.services.lookoutvision

import scalajs.js

type DatasetStatus = "CREATE_IN_PROGRESS" | "CREATE_COMPLETE" | "CREATE_FAILED" | "UPDATE_IN_PROGRESS" | "UPDATE_COMPLETE" | "UPDATE_FAILED_ROLLBACK_IN_PROGRESS" | "UPDATE_FAILED_ROLLBACK_COMPLETE" | "DELETE_IN_PROGRESS" | "DELETE_COMPLETE" | "DELETE_FAILED"
object DatasetStatus {
  inline val CREATE_IN_PROGRESS: "CREATE_IN_PROGRESS" = "CREATE_IN_PROGRESS"
  inline val CREATE_COMPLETE: "CREATE_COMPLETE" = "CREATE_COMPLETE"
  inline val CREATE_FAILED: "CREATE_FAILED" = "CREATE_FAILED"
  inline val UPDATE_IN_PROGRESS: "UPDATE_IN_PROGRESS" = "UPDATE_IN_PROGRESS"
  inline val UPDATE_COMPLETE: "UPDATE_COMPLETE" = "UPDATE_COMPLETE"
  inline val UPDATE_FAILED_ROLLBACK_IN_PROGRESS: "UPDATE_FAILED_ROLLBACK_IN_PROGRESS" = "UPDATE_FAILED_ROLLBACK_IN_PROGRESS"
  inline val UPDATE_FAILED_ROLLBACK_COMPLETE: "UPDATE_FAILED_ROLLBACK_COMPLETE" = "UPDATE_FAILED_ROLLBACK_COMPLETE"
  inline val DELETE_IN_PROGRESS: "DELETE_IN_PROGRESS" = "DELETE_IN_PROGRESS"
  inline val DELETE_COMPLETE: "DELETE_COMPLETE" = "DELETE_COMPLETE"
  inline val DELETE_FAILED: "DELETE_FAILED" = "DELETE_FAILED"

  inline def values: js.Array[DatasetStatus] = js.Array(
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

type ModelHostingStatus = "STARTING_HOSTING" | "HOSTED" | "HOSTING_FAILED" | "STOPPING_HOSTING" | "SYSTEM_UPDATING"
object ModelHostingStatus {
  inline val STARTING_HOSTING: "STARTING_HOSTING" = "STARTING_HOSTING"
  inline val HOSTED: "HOSTED" = "HOSTED"
  inline val HOSTING_FAILED: "HOSTING_FAILED" = "HOSTING_FAILED"
  inline val STOPPING_HOSTING: "STOPPING_HOSTING" = "STOPPING_HOSTING"
  inline val SYSTEM_UPDATING: "SYSTEM_UPDATING" = "SYSTEM_UPDATING"

  inline def values: js.Array[ModelHostingStatus] = js.Array(STARTING_HOSTING, HOSTED, HOSTING_FAILED, STOPPING_HOSTING, SYSTEM_UPDATING)
}

type ModelPackagingJobStatus = "CREATED" | "RUNNING" | "SUCCEEDED" | "FAILED"
object ModelPackagingJobStatus {
  inline val CREATED: "CREATED" = "CREATED"
  inline val RUNNING: "RUNNING" = "RUNNING"
  inline val SUCCEEDED: "SUCCEEDED" = "SUCCEEDED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[ModelPackagingJobStatus] = js.Array(CREATED, RUNNING, SUCCEEDED, FAILED)
}

type ModelStatus = "TRAINING" | "TRAINED" | "TRAINING_FAILED" | "STARTING_HOSTING" | "HOSTED" | "HOSTING_FAILED" | "STOPPING_HOSTING" | "SYSTEM_UPDATING" | "DELETING"
object ModelStatus {
  inline val TRAINING: "TRAINING" = "TRAINING"
  inline val TRAINED: "TRAINED" = "TRAINED"
  inline val TRAINING_FAILED: "TRAINING_FAILED" = "TRAINING_FAILED"
  inline val STARTING_HOSTING: "STARTING_HOSTING" = "STARTING_HOSTING"
  inline val HOSTED: "HOSTED" = "HOSTED"
  inline val HOSTING_FAILED: "HOSTING_FAILED" = "HOSTING_FAILED"
  inline val STOPPING_HOSTING: "STOPPING_HOSTING" = "STOPPING_HOSTING"
  inline val SYSTEM_UPDATING: "SYSTEM_UPDATING" = "SYSTEM_UPDATING"
  inline val DELETING: "DELETING" = "DELETING"

  inline def values: js.Array[ModelStatus] = js.Array(TRAINING, TRAINED, TRAINING_FAILED, STARTING_HOSTING, HOSTED, HOSTING_FAILED, STOPPING_HOSTING, SYSTEM_UPDATING, DELETING)
}

type TargetDevice = "jetson_xavier"
object TargetDevice {
  inline val jetson_xavier: "jetson_xavier" = "jetson_xavier"

  inline def values: js.Array[TargetDevice] = js.Array(jetson_xavier)
}

type TargetPlatformAccelerator = "NVIDIA"
object TargetPlatformAccelerator {
  inline val NVIDIA: "NVIDIA" = "NVIDIA"

  inline def values: js.Array[TargetPlatformAccelerator] = js.Array(NVIDIA)
}

type TargetPlatformArch = "ARM64" | "X86_64"
object TargetPlatformArch {
  inline val ARM64: "ARM64" = "ARM64"
  inline val X86_64: "X86_64" = "X86_64"

  inline def values: js.Array[TargetPlatformArch] = js.Array(ARM64, X86_64)
}

type TargetPlatformOs = "LINUX"
object TargetPlatformOs {
  inline val LINUX: "LINUX" = "LINUX"

  inline def values: js.Array[TargetPlatformOs] = js.Array(LINUX)
}
