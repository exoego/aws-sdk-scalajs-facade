package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object iotjobsdataplane {
  type ApproximateSecondsBeforeTimedOut = Double
  type DescribeJobExecutionJobId = String
  type DetailsKey = String
  type DetailsMap = js.Dictionary[DetailsValue]
  type DetailsValue = String
  type ExecutionNumber = Double
  type ExpectedVersion = Double
  type IncludeExecutionState = Boolean
  type IncludeJobDocument = Boolean
  type JobDocument = String
  type JobExecutionStatus = String
  type JobExecutionSummaryList = js.Array[JobExecutionSummary]
  type JobId = String
  type LastUpdatedAt = Double
  type QueuedAt = Double
  type StartedAt = Double
  type StepTimeoutInMinutes = Double
  type ThingName = String
  type VersionNumber = Double
}

package iotjobsdataplane {
  @js.native
  @JSImport("aws-sdk", "IoTJobsDataPlane")
  class IoTJobsDataPlane(config: AWSConfig) extends js.Object {
    def describeJobExecution(params: DescribeJobExecutionRequest): Request[DescribeJobExecutionResponse] = js.native
    def getPendingJobExecutions(params: GetPendingJobExecutionsRequest): Request[GetPendingJobExecutionsResponse] = js.native
    def startNextPendingJobExecution(params: StartNextPendingJobExecutionRequest): Request[StartNextPendingJobExecutionResponse] = js.native
    def updateJobExecution(params: UpdateJobExecutionRequest): Request[UpdateJobExecutionResponse] = js.native
  }

  @js.native
  trait DescribeJobExecutionRequest extends js.Object {
    var jobId: DescribeJobExecutionJobId
    var thingName: ThingName
    var executionNumber: js.UndefOr[ExecutionNumber]
    var includeJobDocument: js.UndefOr[IncludeJobDocument]
  }

  object DescribeJobExecutionRequest {
    def apply(
      jobId: DescribeJobExecutionJobId,
      thingName: ThingName,
      executionNumber: js.UndefOr[ExecutionNumber] = js.undefined,
      includeJobDocument: js.UndefOr[IncludeJobDocument] = js.undefined): DescribeJobExecutionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobId" -> jobId.asInstanceOf[js.Any],
        "thingName" -> thingName.asInstanceOf[js.Any],
        "executionNumber" -> executionNumber.map { x => x.asInstanceOf[js.Any] },
        "includeJobDocument" -> includeJobDocument.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeJobExecutionRequest]
    }
  }

  @js.native
  trait DescribeJobExecutionResponse extends js.Object {
    var execution: js.UndefOr[JobExecution]
  }

  object DescribeJobExecutionResponse {
    def apply(
      execution: js.UndefOr[JobExecution] = js.undefined): DescribeJobExecutionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "execution" -> execution.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeJobExecutionResponse]
    }
  }

  @js.native
  trait GetPendingJobExecutionsRequest extends js.Object {
    var thingName: ThingName
  }

  object GetPendingJobExecutionsRequest {
    def apply(
      thingName: ThingName): GetPendingJobExecutionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingName" -> thingName.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPendingJobExecutionsRequest]
    }
  }

  @js.native
  trait GetPendingJobExecutionsResponse extends js.Object {
    var inProgressJobs: js.UndefOr[JobExecutionSummaryList]
    var queuedJobs: js.UndefOr[JobExecutionSummaryList]
  }

  object GetPendingJobExecutionsResponse {
    def apply(
      inProgressJobs: js.UndefOr[JobExecutionSummaryList] = js.undefined,
      queuedJobs: js.UndefOr[JobExecutionSummaryList] = js.undefined): GetPendingJobExecutionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "inProgressJobs" -> inProgressJobs.map { x => x.asInstanceOf[js.Any] },
        "queuedJobs" -> queuedJobs.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetPendingJobExecutionsResponse]
    }
  }

  /**
   * <p>Contains data about a job execution.</p>
   */
  @js.native
  trait JobExecution extends js.Object {
    var approximateSecondsBeforeTimedOut: js.UndefOr[ApproximateSecondsBeforeTimedOut]
    var executionNumber: js.UndefOr[ExecutionNumber]
    var jobDocument: js.UndefOr[JobDocument]
    var jobId: js.UndefOr[JobId]
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt]
    var queuedAt: js.UndefOr[QueuedAt]
    var startedAt: js.UndefOr[StartedAt]
    var status: js.UndefOr[JobExecutionStatus]
    var statusDetails: js.UndefOr[DetailsMap]
    var thingName: js.UndefOr[ThingName]
    var versionNumber: js.UndefOr[VersionNumber]
  }

  object JobExecution {
    def apply(
      approximateSecondsBeforeTimedOut: js.UndefOr[ApproximateSecondsBeforeTimedOut] = js.undefined,
      executionNumber: js.UndefOr[ExecutionNumber] = js.undefined,
      jobDocument: js.UndefOr[JobDocument] = js.undefined,
      jobId: js.UndefOr[JobId] = js.undefined,
      lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined,
      queuedAt: js.UndefOr[QueuedAt] = js.undefined,
      startedAt: js.UndefOr[StartedAt] = js.undefined,
      status: js.UndefOr[JobExecutionStatus] = js.undefined,
      statusDetails: js.UndefOr[DetailsMap] = js.undefined,
      thingName: js.UndefOr[ThingName] = js.undefined,
      versionNumber: js.UndefOr[VersionNumber] = js.undefined): JobExecution = {
      val _fields = IndexedSeq[(String, js.Any)](
        "approximateSecondsBeforeTimedOut" -> approximateSecondsBeforeTimedOut.map { x => x.asInstanceOf[js.Any] },
        "executionNumber" -> executionNumber.map { x => x.asInstanceOf[js.Any] },
        "jobDocument" -> jobDocument.map { x => x.asInstanceOf[js.Any] },
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedAt" -> lastUpdatedAt.map { x => x.asInstanceOf[js.Any] },
        "queuedAt" -> queuedAt.map { x => x.asInstanceOf[js.Any] },
        "startedAt" -> startedAt.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "statusDetails" -> statusDetails.map { x => x.asInstanceOf[js.Any] },
        "thingName" -> thingName.map { x => x.asInstanceOf[js.Any] },
        "versionNumber" -> versionNumber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobExecution]
    }
  }

  /**
   * <p>Contains data about the state of a job execution.</p>
   */
  @js.native
  trait JobExecutionState extends js.Object {
    var status: js.UndefOr[JobExecutionStatus]
    var statusDetails: js.UndefOr[DetailsMap]
    var versionNumber: js.UndefOr[VersionNumber]
  }

  object JobExecutionState {
    def apply(
      status: js.UndefOr[JobExecutionStatus] = js.undefined,
      statusDetails: js.UndefOr[DetailsMap] = js.undefined,
      versionNumber: js.UndefOr[VersionNumber] = js.undefined): JobExecutionState = {
      val _fields = IndexedSeq[(String, js.Any)](
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "statusDetails" -> statusDetails.map { x => x.asInstanceOf[js.Any] },
        "versionNumber" -> versionNumber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobExecutionState]
    }
  }

  object JobExecutionStatusEnum {
    val QUEUED = "QUEUED"
    val IN_PROGRESS = "IN_PROGRESS"
    val SUCCEEDED = "SUCCEEDED"
    val FAILED = "FAILED"
    val TIMED_OUT = "TIMED_OUT"
    val REJECTED = "REJECTED"
    val REMOVED = "REMOVED"
    val CANCELED = "CANCELED"

    val values = IndexedSeq(QUEUED, IN_PROGRESS, SUCCEEDED, FAILED, TIMED_OUT, REJECTED, REMOVED, CANCELED)
  }

  /**
   * <p>Contains a subset of information about a job execution.</p>
   */
  @js.native
  trait JobExecutionSummary extends js.Object {
    var executionNumber: js.UndefOr[ExecutionNumber]
    var jobId: js.UndefOr[JobId]
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt]
    var queuedAt: js.UndefOr[QueuedAt]
    var startedAt: js.UndefOr[StartedAt]
    var versionNumber: js.UndefOr[VersionNumber]
  }

  object JobExecutionSummary {
    def apply(
      executionNumber: js.UndefOr[ExecutionNumber] = js.undefined,
      jobId: js.UndefOr[JobId] = js.undefined,
      lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined,
      queuedAt: js.UndefOr[QueuedAt] = js.undefined,
      startedAt: js.UndefOr[StartedAt] = js.undefined,
      versionNumber: js.UndefOr[VersionNumber] = js.undefined): JobExecutionSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "executionNumber" -> executionNumber.map { x => x.asInstanceOf[js.Any] },
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedAt" -> lastUpdatedAt.map { x => x.asInstanceOf[js.Any] },
        "queuedAt" -> queuedAt.map { x => x.asInstanceOf[js.Any] },
        "startedAt" -> startedAt.map { x => x.asInstanceOf[js.Any] },
        "versionNumber" -> versionNumber.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobExecutionSummary]
    }
  }

  @js.native
  trait StartNextPendingJobExecutionRequest extends js.Object {
    var thingName: ThingName
    var statusDetails: js.UndefOr[DetailsMap]
    var stepTimeoutInMinutes: js.UndefOr[StepTimeoutInMinutes]
  }

  object StartNextPendingJobExecutionRequest {
    def apply(
      thingName: ThingName,
      statusDetails: js.UndefOr[DetailsMap] = js.undefined,
      stepTimeoutInMinutes: js.UndefOr[StepTimeoutInMinutes] = js.undefined): StartNextPendingJobExecutionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "thingName" -> thingName.asInstanceOf[js.Any],
        "statusDetails" -> statusDetails.map { x => x.asInstanceOf[js.Any] },
        "stepTimeoutInMinutes" -> stepTimeoutInMinutes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartNextPendingJobExecutionRequest]
    }
  }

  @js.native
  trait StartNextPendingJobExecutionResponse extends js.Object {
    var execution: js.UndefOr[JobExecution]
  }

  object StartNextPendingJobExecutionResponse {
    def apply(
      execution: js.UndefOr[JobExecution] = js.undefined): StartNextPendingJobExecutionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "execution" -> execution.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartNextPendingJobExecutionResponse]
    }
  }

  @js.native
  trait UpdateJobExecutionRequest extends js.Object {
    var jobId: JobId
    var status: JobExecutionStatus
    var thingName: ThingName
    var executionNumber: js.UndefOr[ExecutionNumber]
    var expectedVersion: js.UndefOr[ExpectedVersion]
    var includeJobDocument: js.UndefOr[IncludeJobDocument]
    var includeJobExecutionState: js.UndefOr[IncludeExecutionState]
    var statusDetails: js.UndefOr[DetailsMap]
    var stepTimeoutInMinutes: js.UndefOr[StepTimeoutInMinutes]
  }

  object UpdateJobExecutionRequest {
    def apply(
      jobId: JobId,
      status: JobExecutionStatus,
      thingName: ThingName,
      executionNumber: js.UndefOr[ExecutionNumber] = js.undefined,
      expectedVersion: js.UndefOr[ExpectedVersion] = js.undefined,
      includeJobDocument: js.UndefOr[IncludeJobDocument] = js.undefined,
      includeJobExecutionState: js.UndefOr[IncludeExecutionState] = js.undefined,
      statusDetails: js.UndefOr[DetailsMap] = js.undefined,
      stepTimeoutInMinutes: js.UndefOr[StepTimeoutInMinutes] = js.undefined): UpdateJobExecutionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobId" -> jobId.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "thingName" -> thingName.asInstanceOf[js.Any],
        "executionNumber" -> executionNumber.map { x => x.asInstanceOf[js.Any] },
        "expectedVersion" -> expectedVersion.map { x => x.asInstanceOf[js.Any] },
        "includeJobDocument" -> includeJobDocument.map { x => x.asInstanceOf[js.Any] },
        "includeJobExecutionState" -> includeJobExecutionState.map { x => x.asInstanceOf[js.Any] },
        "statusDetails" -> statusDetails.map { x => x.asInstanceOf[js.Any] },
        "stepTimeoutInMinutes" -> stepTimeoutInMinutes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateJobExecutionRequest]
    }
  }

  @js.native
  trait UpdateJobExecutionResponse extends js.Object {
    var executionState: js.UndefOr[JobExecutionState]
    var jobDocument: js.UndefOr[JobDocument]
  }

  object UpdateJobExecutionResponse {
    def apply(
      executionState: js.UndefOr[JobExecutionState] = js.undefined,
      jobDocument: js.UndefOr[JobDocument] = js.undefined): UpdateJobExecutionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "executionState" -> executionState.map { x => x.asInstanceOf[js.Any] },
        "jobDocument" -> jobDocument.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateJobExecutionResponse]
    }
  }
}
