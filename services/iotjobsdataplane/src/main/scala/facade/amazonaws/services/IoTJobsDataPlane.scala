package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

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
      service.describeJobExecution(params).promise().toFuture
    @inline def getPendingJobExecutionsFuture(
        params: GetPendingJobExecutionsRequest
    ): Future[GetPendingJobExecutionsResponse] = service.getPendingJobExecutions(params).promise().toFuture
    @inline def startNextPendingJobExecutionFuture(
        params: StartNextPendingJobExecutionRequest
    ): Future[StartNextPendingJobExecutionResponse] = service.startNextPendingJobExecution(params).promise().toFuture
    @inline def updateJobExecutionFuture(params: UpdateJobExecutionRequest): Future[UpdateJobExecutionResponse] =
      service.updateJobExecution(params).promise().toFuture
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
  @Factory
  trait DescribeJobExecutionRequest extends js.Object {
    var jobId: DescribeJobExecutionJobId
    var thingName: ThingName
    var executionNumber: js.UndefOr[ExecutionNumber]
    var includeJobDocument: js.UndefOr[IncludeJobDocument]
  }

  @js.native
  @Factory
  trait DescribeJobExecutionResponse extends js.Object {
    var execution: js.UndefOr[JobExecution]
  }

  @js.native
  @Factory
  trait GetPendingJobExecutionsRequest extends js.Object {
    var thingName: ThingName
  }

  @js.native
  @Factory
  trait GetPendingJobExecutionsResponse extends js.Object {
    var inProgressJobs: js.UndefOr[JobExecutionSummaryList]
    var queuedJobs: js.UndefOr[JobExecutionSummaryList]
  }

  /**
    * Contains data about a job execution.
    */
  @js.native
  @Factory
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

  /**
    * Contains data about the state of a job execution.
    */
  @js.native
  @Factory
  trait JobExecutionState extends js.Object {
    var status: js.UndefOr[JobExecutionStatus]
    var statusDetails: js.UndefOr[DetailsMap]
    var versionNumber: js.UndefOr[VersionNumber]
  }

  @js.native
  sealed trait JobExecutionStatus extends js.Any
  object JobExecutionStatus extends js.Object {
    val QUEUED      = "QUEUED".asInstanceOf[JobExecutionStatus]
    val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[JobExecutionStatus]
    val SUCCEEDED   = "SUCCEEDED".asInstanceOf[JobExecutionStatus]
    val FAILED      = "FAILED".asInstanceOf[JobExecutionStatus]
    val TIMED_OUT   = "TIMED_OUT".asInstanceOf[JobExecutionStatus]
    val REJECTED    = "REJECTED".asInstanceOf[JobExecutionStatus]
    val REMOVED     = "REMOVED".asInstanceOf[JobExecutionStatus]
    val CANCELED    = "CANCELED".asInstanceOf[JobExecutionStatus]

    val values =
      js.Object.freeze(js.Array(QUEUED, IN_PROGRESS, SUCCEEDED, FAILED, TIMED_OUT, REJECTED, REMOVED, CANCELED))
  }

  /**
    * Contains a subset of information about a job execution.
    */
  @js.native
  @Factory
  trait JobExecutionSummary extends js.Object {
    var executionNumber: js.UndefOr[ExecutionNumber]
    var jobId: js.UndefOr[JobId]
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt]
    var queuedAt: js.UndefOr[QueuedAt]
    var startedAt: js.UndefOr[StartedAt]
    var versionNumber: js.UndefOr[VersionNumber]
  }

  @js.native
  @Factory
  trait StartNextPendingJobExecutionRequest extends js.Object {
    var thingName: ThingName
    var statusDetails: js.UndefOr[DetailsMap]
    var stepTimeoutInMinutes: js.UndefOr[StepTimeoutInMinutes]
  }

  @js.native
  @Factory
  trait StartNextPendingJobExecutionResponse extends js.Object {
    var execution: js.UndefOr[JobExecution]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait UpdateJobExecutionResponse extends js.Object {
    var executionState: js.UndefOr[JobExecutionState]
    var jobDocument: js.UndefOr[JobDocument]
  }
}
