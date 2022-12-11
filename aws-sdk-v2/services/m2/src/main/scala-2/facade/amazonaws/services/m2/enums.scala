package facade.amazonaws.services.m2

import scalajs.js

@js.native
sealed trait ApplicationDeploymentLifecycle extends js.Any
object ApplicationDeploymentLifecycle {
  val Deploying = "Deploying".asInstanceOf[ApplicationDeploymentLifecycle]
  val Deployed = "Deployed".asInstanceOf[ApplicationDeploymentLifecycle]

  @inline def values: js.Array[ApplicationDeploymentLifecycle] = js.Array(Deploying, Deployed)
}

@js.native
sealed trait ApplicationLifecycle extends js.Any
object ApplicationLifecycle {
  val Creating = "Creating".asInstanceOf[ApplicationLifecycle]
  val Created = "Created".asInstanceOf[ApplicationLifecycle]
  val Available = "Available".asInstanceOf[ApplicationLifecycle]
  val Ready = "Ready".asInstanceOf[ApplicationLifecycle]
  val Starting = "Starting".asInstanceOf[ApplicationLifecycle]
  val Running = "Running".asInstanceOf[ApplicationLifecycle]
  val Stopping = "Stopping".asInstanceOf[ApplicationLifecycle]
  val Stopped = "Stopped".asInstanceOf[ApplicationLifecycle]
  val Failed = "Failed".asInstanceOf[ApplicationLifecycle]
  val Deleting = "Deleting".asInstanceOf[ApplicationLifecycle]

  @inline def values: js.Array[ApplicationLifecycle] = js.Array(Creating, Created, Available, Ready, Starting, Running, Stopping, Stopped, Failed, Deleting)
}

@js.native
sealed trait ApplicationVersionLifecycle extends js.Any
object ApplicationVersionLifecycle {
  val Creating = "Creating".asInstanceOf[ApplicationVersionLifecycle]
  val Available = "Available".asInstanceOf[ApplicationVersionLifecycle]
  val Failed = "Failed".asInstanceOf[ApplicationVersionLifecycle]

  @inline def values: js.Array[ApplicationVersionLifecycle] = js.Array(Creating, Available, Failed)
}

@js.native
sealed trait BatchJobExecutionStatus extends js.Any
object BatchJobExecutionStatus {
  val Submitting = "Submitting".asInstanceOf[BatchJobExecutionStatus]
  val Holding = "Holding".asInstanceOf[BatchJobExecutionStatus]
  val Dispatching = "Dispatching".asInstanceOf[BatchJobExecutionStatus]
  val Running = "Running".asInstanceOf[BatchJobExecutionStatus]
  val Cancelling = "Cancelling".asInstanceOf[BatchJobExecutionStatus]
  val Cancelled = "Cancelled".asInstanceOf[BatchJobExecutionStatus]
  val Succeeded = "Succeeded".asInstanceOf[BatchJobExecutionStatus]
  val Failed = "Failed".asInstanceOf[BatchJobExecutionStatus]
  val `Succeeded With Warning` = "Succeeded With Warning".asInstanceOf[BatchJobExecutionStatus]

  @inline def values: js.Array[BatchJobExecutionStatus] = js.Array(Submitting, Holding, Dispatching, Running, Cancelling, Cancelled, Succeeded, Failed, `Succeeded With Warning`)
}

@js.native
sealed trait BatchJobType extends js.Any
object BatchJobType {
  val VSE = "VSE".asInstanceOf[BatchJobType]
  val JES2 = "JES2".asInstanceOf[BatchJobType]
  val JES3 = "JES3".asInstanceOf[BatchJobType]

  @inline def values: js.Array[BatchJobType] = js.Array(VSE, JES2, JES3)
}

@js.native
sealed trait DataSetTaskLifecycle extends js.Any
object DataSetTaskLifecycle {
  val Creating = "Creating".asInstanceOf[DataSetTaskLifecycle]
  val Running = "Running".asInstanceOf[DataSetTaskLifecycle]
  val Completed = "Completed".asInstanceOf[DataSetTaskLifecycle]

  @inline def values: js.Array[DataSetTaskLifecycle] = js.Array(Creating, Running, Completed)
}

@js.native
sealed trait DeploymentLifecycle extends js.Any
object DeploymentLifecycle {
  val Deploying = "Deploying".asInstanceOf[DeploymentLifecycle]
  val Succeeded = "Succeeded".asInstanceOf[DeploymentLifecycle]
  val Failed = "Failed".asInstanceOf[DeploymentLifecycle]

  @inline def values: js.Array[DeploymentLifecycle] = js.Array(Deploying, Succeeded, Failed)
}

@js.native
sealed trait EngineType extends js.Any
object EngineType {
  val microfocus = "microfocus".asInstanceOf[EngineType]
  val bluage = "bluage".asInstanceOf[EngineType]

  @inline def values: js.Array[EngineType] = js.Array(microfocus, bluage)
}

@js.native
sealed trait EnvironmentLifecycle extends js.Any
object EnvironmentLifecycle {
  val Creating = "Creating".asInstanceOf[EnvironmentLifecycle]
  val Available = "Available".asInstanceOf[EnvironmentLifecycle]
  val Deleting = "Deleting".asInstanceOf[EnvironmentLifecycle]
  val Failed = "Failed".asInstanceOf[EnvironmentLifecycle]

  @inline def values: js.Array[EnvironmentLifecycle] = js.Array(Creating, Available, Deleting, Failed)
}
