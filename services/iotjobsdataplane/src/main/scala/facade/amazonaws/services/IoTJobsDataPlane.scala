package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object iotjobsdataplane {
  type ApproximateSecondsBeforeTimedOut = Double
  type DescribeJobExecutionJobId        = String
  type DetailsKey                       = String
  type DetailsMap                       = js.Dictionary[DetailsValue]
  type DetailsValue                     = String
  type ExecutionNumber                  = Double
  type ExpectedVersion                  = Double
  type IncludeExecutionState            = Boolean
  type IncludeJobDocument               = Boolean
  type JobDocument                      = String
  type JobExecutionStatus               = String
  type JobExecutionSummaryList          = js.Array[JobExecutionSummary]
  type JobId                            = String
  type LastUpdatedAt                    = Double
  type QueuedAt                         = Double
  type StartedAt                        = Double
  type StepTimeoutInMinutes             = Double
  type ThingName                        = String
  type VersionNumber                    = Double

  implicit final class IoTJobsDataPlaneOps(private val service: IoTJobsDataPlane) extends AnyVal {

    @inline def describeJobExecutionFuture(params: DescribeJobExecutionRequest): Future[DescribeJobExecutionResponse] =
      service.describeJobExecution(params).promise.toFuture
    @inline def getPendingJobExecutionsFuture(
        params: GetPendingJobExecutionsRequest
    ): Future[GetPendingJobExecutionsResponse] = service.getPendingJobExecutions(params).promise.toFuture
    @inline def startNextPendingJobExecutionFuture(
        params: StartNextPendingJobExecutionRequest
    ): Future[StartNextPendingJobExecutionResponse] = service.startNextPendingJobExecution(params).promise.toFuture
    @inline def updateJobExecutionFuture(params: UpdateJobExecutionRequest): Future[UpdateJobExecutionResponse] =
      service.updateJobExecution(params).promise.toFuture
  }
}

package iotjobsdataplane {
  @js.native
  @JSImport("aws-sdk", "IoTJobsDataPlane")
  class IoTJobsDataPlane() extends js.Object {
    def this(config: AWSConfig) = this()

    def describeJobExecution(params: DescribeJobExecutionRequest): Request[DescribeJobExecutionResponse] = js.native
    def getPendingJobExecutions(params: GetPendingJobExecutionsRequest): Request[GetPendingJobExecutionsResponse] =
      js.native
    def startNextPendingJobExecution(
        params: StartNextPendingJobExecutionRequest
    ): Request[StartNextPendingJobExecutionResponse]                                               = js.native
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
    @inline
    def apply(
        jobId: DescribeJobExecutionJobId,
        thingName: ThingName,
        executionNumber: js.UndefOr[ExecutionNumber] = js.undefined,
        includeJobDocument: js.UndefOr[IncludeJobDocument] = js.undefined
    ): DescribeJobExecutionRequest = {
      val __obj = js.Dynamic.literal(
        "jobId"     -> jobId.asInstanceOf[js.Any],
        "thingName" -> thingName.asInstanceOf[js.Any]
      )

      executionNumber.foreach(__v => __obj.updateDynamic("executionNumber")(__v.asInstanceOf[js.Any]))
      includeJobDocument.foreach(__v => __obj.updateDynamic("includeJobDocument")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeJobExecutionRequest]
    }
  }

  @js.native
  trait DescribeJobExecutionResponse extends js.Object {
    var execution: js.UndefOr[JobExecution]
  }

  object DescribeJobExecutionResponse {
    @inline
    def apply(
        execution: js.UndefOr[JobExecution] = js.undefined
    ): DescribeJobExecutionResponse = {
      val __obj = js.Dynamic.literal()
      execution.foreach(__v => __obj.updateDynamic("execution")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeJobExecutionResponse]
    }
  }

  @js.native
  trait GetPendingJobExecutionsRequest extends js.Object {
    var thingName: ThingName
  }

  object GetPendingJobExecutionsRequest {
    @inline
    def apply(
        thingName: ThingName
    ): GetPendingJobExecutionsRequest = {
      val __obj = js.Dynamic.literal(
        "thingName" -> thingName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetPendingJobExecutionsRequest]
    }
  }

  @js.native
  trait GetPendingJobExecutionsResponse extends js.Object {
    var inProgressJobs: js.UndefOr[JobExecutionSummaryList]
    var queuedJobs: js.UndefOr[JobExecutionSummaryList]
  }

  object GetPendingJobExecutionsResponse {
    @inline
    def apply(
        inProgressJobs: js.UndefOr[JobExecutionSummaryList] = js.undefined,
        queuedJobs: js.UndefOr[JobExecutionSummaryList] = js.undefined
    ): GetPendingJobExecutionsResponse = {
      val __obj = js.Dynamic.literal()
      inProgressJobs.foreach(__v => __obj.updateDynamic("inProgressJobs")(__v.asInstanceOf[js.Any]))
      queuedJobs.foreach(__v => __obj.updateDynamic("queuedJobs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPendingJobExecutionsResponse]
    }
  }

  /**
    * Contains data about a job execution.
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
    @inline
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
        versionNumber: js.UndefOr[VersionNumber] = js.undefined
    ): JobExecution = {
      val __obj = js.Dynamic.literal()
      approximateSecondsBeforeTimedOut.foreach(__v =>
        __obj.updateDynamic("approximateSecondsBeforeTimedOut")(__v.asInstanceOf[js.Any])
      )
      executionNumber.foreach(__v => __obj.updateDynamic("executionNumber")(__v.asInstanceOf[js.Any]))
      jobDocument.foreach(__v => __obj.updateDynamic("jobDocument")(__v.asInstanceOf[js.Any]))
      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      queuedAt.foreach(__v => __obj.updateDynamic("queuedAt")(__v.asInstanceOf[js.Any]))
      startedAt.foreach(__v => __obj.updateDynamic("startedAt")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusDetails.foreach(__v => __obj.updateDynamic("statusDetails")(__v.asInstanceOf[js.Any]))
      thingName.foreach(__v => __obj.updateDynamic("thingName")(__v.asInstanceOf[js.Any]))
      versionNumber.foreach(__v => __obj.updateDynamic("versionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobExecution]
    }
  }

  /**
    * Contains data about the state of a job execution.
    */
  @js.native
  trait JobExecutionState extends js.Object {
    var status: js.UndefOr[JobExecutionStatus]
    var statusDetails: js.UndefOr[DetailsMap]
    var versionNumber: js.UndefOr[VersionNumber]
  }

  object JobExecutionState {
    @inline
    def apply(
        status: js.UndefOr[JobExecutionStatus] = js.undefined,
        statusDetails: js.UndefOr[DetailsMap] = js.undefined,
        versionNumber: js.UndefOr[VersionNumber] = js.undefined
    ): JobExecutionState = {
      val __obj = js.Dynamic.literal()
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusDetails.foreach(__v => __obj.updateDynamic("statusDetails")(__v.asInstanceOf[js.Any]))
      versionNumber.foreach(__v => __obj.updateDynamic("versionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobExecutionState]
    }
  }

  object JobExecutionStatusEnum {
    val QUEUED      = "QUEUED"
    val IN_PROGRESS = "IN_PROGRESS"
    val SUCCEEDED   = "SUCCEEDED"
    val FAILED      = "FAILED"
    val TIMED_OUT   = "TIMED_OUT"
    val REJECTED    = "REJECTED"
    val REMOVED     = "REMOVED"
    val CANCELED    = "CANCELED"

    val values =
      js.Object.freeze(js.Array(QUEUED, IN_PROGRESS, SUCCEEDED, FAILED, TIMED_OUT, REJECTED, REMOVED, CANCELED))
  }

  /**
    * Contains a subset of information about a job execution.
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
    @inline
    def apply(
        executionNumber: js.UndefOr[ExecutionNumber] = js.undefined,
        jobId: js.UndefOr[JobId] = js.undefined,
        lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined,
        queuedAt: js.UndefOr[QueuedAt] = js.undefined,
        startedAt: js.UndefOr[StartedAt] = js.undefined,
        versionNumber: js.UndefOr[VersionNumber] = js.undefined
    ): JobExecutionSummary = {
      val __obj = js.Dynamic.literal()
      executionNumber.foreach(__v => __obj.updateDynamic("executionNumber")(__v.asInstanceOf[js.Any]))
      jobId.foreach(__v => __obj.updateDynamic("jobId")(__v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.updateDynamic("lastUpdatedAt")(__v.asInstanceOf[js.Any]))
      queuedAt.foreach(__v => __obj.updateDynamic("queuedAt")(__v.asInstanceOf[js.Any]))
      startedAt.foreach(__v => __obj.updateDynamic("startedAt")(__v.asInstanceOf[js.Any]))
      versionNumber.foreach(__v => __obj.updateDynamic("versionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobExecutionSummary]
    }
  }

  @js.native
  trait StartNextPendingJobExecutionRequest extends js.Object {
    var thingName: ThingName
    var statusDetails: js.UndefOr[DetailsMap]
    var stepTimeoutInMinutes: js.UndefOr[StepTimeoutInMinutes]
  }

  object StartNextPendingJobExecutionRequest {
    @inline
    def apply(
        thingName: ThingName,
        statusDetails: js.UndefOr[DetailsMap] = js.undefined,
        stepTimeoutInMinutes: js.UndefOr[StepTimeoutInMinutes] = js.undefined
    ): StartNextPendingJobExecutionRequest = {
      val __obj = js.Dynamic.literal(
        "thingName" -> thingName.asInstanceOf[js.Any]
      )

      statusDetails.foreach(__v => __obj.updateDynamic("statusDetails")(__v.asInstanceOf[js.Any]))
      stepTimeoutInMinutes.foreach(__v => __obj.updateDynamic("stepTimeoutInMinutes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartNextPendingJobExecutionRequest]
    }
  }

  @js.native
  trait StartNextPendingJobExecutionResponse extends js.Object {
    var execution: js.UndefOr[JobExecution]
  }

  object StartNextPendingJobExecutionResponse {
    @inline
    def apply(
        execution: js.UndefOr[JobExecution] = js.undefined
    ): StartNextPendingJobExecutionResponse = {
      val __obj = js.Dynamic.literal()
      execution.foreach(__v => __obj.updateDynamic("execution")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartNextPendingJobExecutionResponse]
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
    @inline
    def apply(
        jobId: JobId,
        status: JobExecutionStatus,
        thingName: ThingName,
        executionNumber: js.UndefOr[ExecutionNumber] = js.undefined,
        expectedVersion: js.UndefOr[ExpectedVersion] = js.undefined,
        includeJobDocument: js.UndefOr[IncludeJobDocument] = js.undefined,
        includeJobExecutionState: js.UndefOr[IncludeExecutionState] = js.undefined,
        statusDetails: js.UndefOr[DetailsMap] = js.undefined,
        stepTimeoutInMinutes: js.UndefOr[StepTimeoutInMinutes] = js.undefined
    ): UpdateJobExecutionRequest = {
      val __obj = js.Dynamic.literal(
        "jobId"     -> jobId.asInstanceOf[js.Any],
        "status"    -> status.asInstanceOf[js.Any],
        "thingName" -> thingName.asInstanceOf[js.Any]
      )

      executionNumber.foreach(__v => __obj.updateDynamic("executionNumber")(__v.asInstanceOf[js.Any]))
      expectedVersion.foreach(__v => __obj.updateDynamic("expectedVersion")(__v.asInstanceOf[js.Any]))
      includeJobDocument.foreach(__v => __obj.updateDynamic("includeJobDocument")(__v.asInstanceOf[js.Any]))
      includeJobExecutionState.foreach(__v => __obj.updateDynamic("includeJobExecutionState")(__v.asInstanceOf[js.Any]))
      statusDetails.foreach(__v => __obj.updateDynamic("statusDetails")(__v.asInstanceOf[js.Any]))
      stepTimeoutInMinutes.foreach(__v => __obj.updateDynamic("stepTimeoutInMinutes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateJobExecutionRequest]
    }
  }

  @js.native
  trait UpdateJobExecutionResponse extends js.Object {
    var executionState: js.UndefOr[JobExecutionState]
    var jobDocument: js.UndefOr[JobDocument]
  }

  object UpdateJobExecutionResponse {
    @inline
    def apply(
        executionState: js.UndefOr[JobExecutionState] = js.undefined,
        jobDocument: js.UndefOr[JobDocument] = js.undefined
    ): UpdateJobExecutionResponse = {
      val __obj = js.Dynamic.literal()
      executionState.foreach(__v => __obj.updateDynamic("executionState")(__v.asInstanceOf[js.Any]))
      jobDocument.foreach(__v => __obj.updateDynamic("jobDocument")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateJobExecutionResponse]
    }
  }
}
