package facade.amazonaws.services.m2

import scalajs.js

type ApplicationDeploymentLifecycle = "Deploying" | "Deployed"
object ApplicationDeploymentLifecycle {
  inline val Deploying: "Deploying" = "Deploying"
  inline val Deployed: "Deployed" = "Deployed"

  inline def values: js.Array[ApplicationDeploymentLifecycle] = js.Array(Deploying, Deployed)
}

type ApplicationLifecycle = "Creating" | "Created" | "Available" | "Ready" | "Starting" | "Running" | "Stopping" | "Stopped" | "Failed" | "Deleting"
object ApplicationLifecycle {
  inline val Creating: "Creating" = "Creating"
  inline val Created: "Created" = "Created"
  inline val Available: "Available" = "Available"
  inline val Ready: "Ready" = "Ready"
  inline val Starting: "Starting" = "Starting"
  inline val Running: "Running" = "Running"
  inline val Stopping: "Stopping" = "Stopping"
  inline val Stopped: "Stopped" = "Stopped"
  inline val Failed: "Failed" = "Failed"
  inline val Deleting: "Deleting" = "Deleting"

  inline def values: js.Array[ApplicationLifecycle] = js.Array(Creating, Created, Available, Ready, Starting, Running, Stopping, Stopped, Failed, Deleting)
}

type ApplicationVersionLifecycle = "Creating" | "Available" | "Failed"
object ApplicationVersionLifecycle {
  inline val Creating: "Creating" = "Creating"
  inline val Available: "Available" = "Available"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[ApplicationVersionLifecycle] = js.Array(Creating, Available, Failed)
}

type BatchJobExecutionStatus = "Submitting" | "Holding" | "Dispatching" | "Running" | "Cancelling" | "Cancelled" | "Succeeded" | "Failed" | "Succeeded With Warning"
object BatchJobExecutionStatus {
  inline val Submitting: "Submitting" = "Submitting"
  inline val Holding: "Holding" = "Holding"
  inline val Dispatching: "Dispatching" = "Dispatching"
  inline val Running: "Running" = "Running"
  inline val Cancelling: "Cancelling" = "Cancelling"
  inline val Cancelled: "Cancelled" = "Cancelled"
  inline val Succeeded: "Succeeded" = "Succeeded"
  inline val Failed: "Failed" = "Failed"
  inline val `Succeeded With Warning`: "Succeeded With Warning" = "Succeeded With Warning"

  inline def values: js.Array[BatchJobExecutionStatus] = js.Array(Submitting, Holding, Dispatching, Running, Cancelling, Cancelled, Succeeded, Failed, `Succeeded With Warning`)
}

type BatchJobType = "VSE" | "JES2" | "JES3"
object BatchJobType {
  inline val VSE: "VSE" = "VSE"
  inline val JES2: "JES2" = "JES2"
  inline val JES3: "JES3" = "JES3"

  inline def values: js.Array[BatchJobType] = js.Array(VSE, JES2, JES3)
}

type DataSetTaskLifecycle = "Creating" | "Running" | "Completed"
object DataSetTaskLifecycle {
  inline val Creating: "Creating" = "Creating"
  inline val Running: "Running" = "Running"
  inline val Completed: "Completed" = "Completed"

  inline def values: js.Array[DataSetTaskLifecycle] = js.Array(Creating, Running, Completed)
}

type DeploymentLifecycle = "Deploying" | "Succeeded" | "Failed"
object DeploymentLifecycle {
  inline val Deploying: "Deploying" = "Deploying"
  inline val Succeeded: "Succeeded" = "Succeeded"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[DeploymentLifecycle] = js.Array(Deploying, Succeeded, Failed)
}

type EngineType = "microfocus" | "bluage"
object EngineType {
  inline val microfocus: "microfocus" = "microfocus"
  inline val bluage: "bluage" = "bluage"

  inline def values: js.Array[EngineType] = js.Array(microfocus, bluage)
}

type EnvironmentLifecycle = "Creating" | "Available" | "Deleting" | "Failed"
object EnvironmentLifecycle {
  inline val Creating: "Creating" = "Creating"
  inline val Available: "Available" = "Available"
  inline val Deleting: "Deleting" = "Deleting"
  inline val Failed: "Failed" = "Failed"

  inline def values: js.Array[EnvironmentLifecycle] = js.Array(Creating, Available, Deleting, Failed)
}
