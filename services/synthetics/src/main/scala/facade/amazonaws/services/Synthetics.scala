package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object synthetics {
  type Arn = String
  type Blob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type Canaries = js.Array[Canary]
  type CanariesLastRun = js.Array[CanaryLastRun]
  type CanaryName = String
  type CanaryRuns = js.Array[CanaryRun]
  type MaxCanaryResults = Int
  type MaxFifteenMinutesInSeconds = Int
  type MaxOneYearInSeconds = Double
  type MaxSize100 = Int
  type MaxSize1024 = Int
  type MaxSize3008 = Int
  type RuntimeVersionList = js.Array[RuntimeVersion]
  type SecurityGroupId = String
  type SecurityGroupIds = js.Array[SecurityGroupId]
  type SubnetId = String
  type SubnetIds = js.Array[SubnetId]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type Timestamp = js.Date
  type Token = String
  type UUID = String
  type VpcId = String

  implicit final class SyntheticsOps(private val service: Synthetics) extends AnyVal {

    @inline def createCanaryFuture(params: CreateCanaryRequest): Future[CreateCanaryResponse] = service.createCanary(params).promise().toFuture
    @inline def deleteCanaryFuture(params: DeleteCanaryRequest): Future[DeleteCanaryResponse] = service.deleteCanary(params).promise().toFuture
    @inline def describeCanariesFuture(params: DescribeCanariesRequest): Future[DescribeCanariesResponse] = service.describeCanaries(params).promise().toFuture
    @inline def describeCanariesLastRunFuture(params: DescribeCanariesLastRunRequest): Future[DescribeCanariesLastRunResponse] = service.describeCanariesLastRun(params).promise().toFuture
    @inline def describeRuntimeVersionsFuture(params: DescribeRuntimeVersionsRequest): Future[DescribeRuntimeVersionsResponse] = service.describeRuntimeVersions(params).promise().toFuture
    @inline def getCanaryFuture(params: GetCanaryRequest): Future[GetCanaryResponse] = service.getCanary(params).promise().toFuture
    @inline def getCanaryRunsFuture(params: GetCanaryRunsRequest): Future[GetCanaryRunsResponse] = service.getCanaryRuns(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def startCanaryFuture(params: StartCanaryRequest): Future[StartCanaryResponse] = service.startCanary(params).promise().toFuture
    @inline def stopCanaryFuture(params: StopCanaryRequest): Future[StopCanaryResponse] = service.stopCanary(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateCanaryFuture(params: UpdateCanaryRequest): Future[UpdateCanaryResponse] = service.updateCanary(params).promise().toFuture
  }
}

package synthetics {
  @js.native
  @JSImport("aws-sdk", "Synthetics", "AWS.Synthetics")
  class Synthetics() extends js.Object {
    def this(config: AWSConfig) = this()

    def createCanary(params: CreateCanaryRequest): Request[CreateCanaryResponse] = js.native
    def deleteCanary(params: DeleteCanaryRequest): Request[DeleteCanaryResponse] = js.native
    def describeCanaries(params: DescribeCanariesRequest): Request[DescribeCanariesResponse] = js.native
    def describeCanariesLastRun(params: DescribeCanariesLastRunRequest): Request[DescribeCanariesLastRunResponse] = js.native
    def describeRuntimeVersions(params: DescribeRuntimeVersionsRequest): Request[DescribeRuntimeVersionsResponse] = js.native
    def getCanary(params: GetCanaryRequest): Request[GetCanaryResponse] = js.native
    def getCanaryRuns(params: GetCanaryRunsRequest): Request[GetCanaryRunsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def startCanary(params: StartCanaryRequest): Request[StartCanaryResponse] = js.native
    def stopCanary(params: StopCanaryRequest): Request[StopCanaryResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateCanary(params: UpdateCanaryRequest): Request[UpdateCanaryResponse] = js.native
  }

  /**
    * This structure contains all information about one canary in your account.
    */
  @js.native
  trait Canary extends js.Object {
    var ArtifactS3Location: js.UndefOr[String]
    var Code: js.UndefOr[CanaryCodeOutput]
    var EngineArn: js.UndefOr[Arn]
    var ExecutionRoleArn: js.UndefOr[Arn]
    var FailureRetentionPeriodInDays: js.UndefOr[MaxSize1024]
    var Id: js.UndefOr[UUID]
    var Name: js.UndefOr[CanaryName]
    var RunConfig: js.UndefOr[CanaryRunConfigOutput]
    var RuntimeVersion: js.UndefOr[String]
    var Schedule: js.UndefOr[CanaryScheduleOutput]
    var Status: js.UndefOr[CanaryStatus]
    var SuccessRetentionPeriodInDays: js.UndefOr[MaxSize1024]
    var Tags: js.UndefOr[TagMap]
    var Timeline: js.UndefOr[CanaryTimeline]
    var VpcConfig: js.UndefOr[VpcConfigOutput]
  }

  object Canary {
    @inline
    def apply(
        ArtifactS3Location: js.UndefOr[String] = js.undefined,
        Code: js.UndefOr[CanaryCodeOutput] = js.undefined,
        EngineArn: js.UndefOr[Arn] = js.undefined,
        ExecutionRoleArn: js.UndefOr[Arn] = js.undefined,
        FailureRetentionPeriodInDays: js.UndefOr[MaxSize1024] = js.undefined,
        Id: js.UndefOr[UUID] = js.undefined,
        Name: js.UndefOr[CanaryName] = js.undefined,
        RunConfig: js.UndefOr[CanaryRunConfigOutput] = js.undefined,
        RuntimeVersion: js.UndefOr[String] = js.undefined,
        Schedule: js.UndefOr[CanaryScheduleOutput] = js.undefined,
        Status: js.UndefOr[CanaryStatus] = js.undefined,
        SuccessRetentionPeriodInDays: js.UndefOr[MaxSize1024] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        Timeline: js.UndefOr[CanaryTimeline] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfigOutput] = js.undefined
    ): Canary = {
      val __obj = js.Dynamic.literal()
      ArtifactS3Location.foreach(__v => __obj.updateDynamic("ArtifactS3Location")(__v.asInstanceOf[js.Any]))
      Code.foreach(__v => __obj.updateDynamic("Code")(__v.asInstanceOf[js.Any]))
      EngineArn.foreach(__v => __obj.updateDynamic("EngineArn")(__v.asInstanceOf[js.Any]))
      ExecutionRoleArn.foreach(__v => __obj.updateDynamic("ExecutionRoleArn")(__v.asInstanceOf[js.Any]))
      FailureRetentionPeriodInDays.foreach(__v => __obj.updateDynamic("FailureRetentionPeriodInDays")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RunConfig.foreach(__v => __obj.updateDynamic("RunConfig")(__v.asInstanceOf[js.Any]))
      RuntimeVersion.foreach(__v => __obj.updateDynamic("RuntimeVersion")(__v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.updateDynamic("Schedule")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      SuccessRetentionPeriodInDays.foreach(__v => __obj.updateDynamic("SuccessRetentionPeriodInDays")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Timeline.foreach(__v => __obj.updateDynamic("Timeline")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Canary]
    }
  }

  /**
    * Use this structure to input your script code for the canary. This structure contains the Lambda handler with the location where the canary should start running the script. If the script is stored in an S3 bucket, the bucket name, key, and version are also included. If the script was passed into the canary directly, the script code is contained in the value of <code>Zipfile</code>.
    */
  @js.native
  trait CanaryCodeInput extends js.Object {
    var Handler: String
    var S3Bucket: js.UndefOr[String]
    var S3Key: js.UndefOr[String]
    var S3Version: js.UndefOr[String]
    var ZipFile: js.UndefOr[Blob]
  }

  object CanaryCodeInput {
    @inline
    def apply(
        Handler: String,
        S3Bucket: js.UndefOr[String] = js.undefined,
        S3Key: js.UndefOr[String] = js.undefined,
        S3Version: js.UndefOr[String] = js.undefined,
        ZipFile: js.UndefOr[Blob] = js.undefined
    ): CanaryCodeInput = {
      val __obj = js.Dynamic.literal(
        "Handler" -> Handler.asInstanceOf[js.Any]
      )

      S3Bucket.foreach(__v => __obj.updateDynamic("S3Bucket")(__v.asInstanceOf[js.Any]))
      S3Key.foreach(__v => __obj.updateDynamic("S3Key")(__v.asInstanceOf[js.Any]))
      S3Version.foreach(__v => __obj.updateDynamic("S3Version")(__v.asInstanceOf[js.Any]))
      ZipFile.foreach(__v => __obj.updateDynamic("ZipFile")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CanaryCodeInput]
    }
  }

  /**
    * This structure contains information about the canary's Lambda handler and where its code is stored by CloudWatch Synthetics.
    */
  @js.native
  trait CanaryCodeOutput extends js.Object {
    var Handler: js.UndefOr[String]
    var SourceLocationArn: js.UndefOr[String]
  }

  object CanaryCodeOutput {
    @inline
    def apply(
        Handler: js.UndefOr[String] = js.undefined,
        SourceLocationArn: js.UndefOr[String] = js.undefined
    ): CanaryCodeOutput = {
      val __obj = js.Dynamic.literal()
      Handler.foreach(__v => __obj.updateDynamic("Handler")(__v.asInstanceOf[js.Any]))
      SourceLocationArn.foreach(__v => __obj.updateDynamic("SourceLocationArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CanaryCodeOutput]
    }
  }

  /**
    * This structure contains information about the most recent run of a single canary.
    */
  @js.native
  trait CanaryLastRun extends js.Object {
    var CanaryName: js.UndefOr[CanaryName]
    var LastRun: js.UndefOr[CanaryRun]
  }

  object CanaryLastRun {
    @inline
    def apply(
        CanaryName: js.UndefOr[CanaryName] = js.undefined,
        LastRun: js.UndefOr[CanaryRun] = js.undefined
    ): CanaryLastRun = {
      val __obj = js.Dynamic.literal()
      CanaryName.foreach(__v => __obj.updateDynamic("CanaryName")(__v.asInstanceOf[js.Any]))
      LastRun.foreach(__v => __obj.updateDynamic("LastRun")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CanaryLastRun]
    }
  }

  /**
    * This structure contains the details about one run of one canary.
    */
  @js.native
  trait CanaryRun extends js.Object {
    var ArtifactS3Location: js.UndefOr[String]
    var Name: js.UndefOr[CanaryName]
    var Status: js.UndefOr[CanaryRunStatus]
    var Timeline: js.UndefOr[CanaryRunTimeline]
  }

  object CanaryRun {
    @inline
    def apply(
        ArtifactS3Location: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[CanaryName] = js.undefined,
        Status: js.UndefOr[CanaryRunStatus] = js.undefined,
        Timeline: js.UndefOr[CanaryRunTimeline] = js.undefined
    ): CanaryRun = {
      val __obj = js.Dynamic.literal()
      ArtifactS3Location.foreach(__v => __obj.updateDynamic("ArtifactS3Location")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Timeline.foreach(__v => __obj.updateDynamic("Timeline")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CanaryRun]
    }
  }

  /**
    * A structure that contains input information for a canary run.
    */
  @js.native
  trait CanaryRunConfigInput extends js.Object {
    var TimeoutInSeconds: MaxFifteenMinutesInSeconds
    var MemoryInMB: js.UndefOr[MaxSize3008]
  }

  object CanaryRunConfigInput {
    @inline
    def apply(
        TimeoutInSeconds: MaxFifteenMinutesInSeconds,
        MemoryInMB: js.UndefOr[MaxSize3008] = js.undefined
    ): CanaryRunConfigInput = {
      val __obj = js.Dynamic.literal(
        "TimeoutInSeconds" -> TimeoutInSeconds.asInstanceOf[js.Any]
      )

      MemoryInMB.foreach(__v => __obj.updateDynamic("MemoryInMB")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CanaryRunConfigInput]
    }
  }

  /**
    * A structure that contains information for a canary run.
    */
  @js.native
  trait CanaryRunConfigOutput extends js.Object {
    var MemoryInMB: js.UndefOr[MaxSize3008]
    var TimeoutInSeconds: js.UndefOr[MaxFifteenMinutesInSeconds]
  }

  object CanaryRunConfigOutput {
    @inline
    def apply(
        MemoryInMB: js.UndefOr[MaxSize3008] = js.undefined,
        TimeoutInSeconds: js.UndefOr[MaxFifteenMinutesInSeconds] = js.undefined
    ): CanaryRunConfigOutput = {
      val __obj = js.Dynamic.literal()
      MemoryInMB.foreach(__v => __obj.updateDynamic("MemoryInMB")(__v.asInstanceOf[js.Any]))
      TimeoutInSeconds.foreach(__v => __obj.updateDynamic("TimeoutInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CanaryRunConfigOutput]
    }
  }

  @js.native
  sealed trait CanaryRunState extends js.Any
  object CanaryRunState {
    val RUNNING = "RUNNING".asInstanceOf[CanaryRunState]
    val PASSED = "PASSED".asInstanceOf[CanaryRunState]
    val FAILED = "FAILED".asInstanceOf[CanaryRunState]

    @inline def values = js.Object.freeze(js.Array(RUNNING, PASSED, FAILED))
  }

  @js.native
  sealed trait CanaryRunStateReasonCode extends js.Any
  object CanaryRunStateReasonCode {
    val CANARY_FAILURE = "CANARY_FAILURE".asInstanceOf[CanaryRunStateReasonCode]
    val EXECUTION_FAILURE = "EXECUTION_FAILURE".asInstanceOf[CanaryRunStateReasonCode]

    @inline def values = js.Object.freeze(js.Array(CANARY_FAILURE, EXECUTION_FAILURE))
  }

  /**
    * This structure contains the status information about a canary run.
    */
  @js.native
  trait CanaryRunStatus extends js.Object {
    var State: js.UndefOr[CanaryRunState]
    var StateReason: js.UndefOr[String]
    var StateReasonCode: js.UndefOr[CanaryRunStateReasonCode]
  }

  object CanaryRunStatus {
    @inline
    def apply(
        State: js.UndefOr[CanaryRunState] = js.undefined,
        StateReason: js.UndefOr[String] = js.undefined,
        StateReasonCode: js.UndefOr[CanaryRunStateReasonCode] = js.undefined
    ): CanaryRunStatus = {
      val __obj = js.Dynamic.literal()
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      StateReason.foreach(__v => __obj.updateDynamic("StateReason")(__v.asInstanceOf[js.Any]))
      StateReasonCode.foreach(__v => __obj.updateDynamic("StateReasonCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CanaryRunStatus]
    }
  }

  /**
    * This structure contains the start and end times of a single canary run.
    */
  @js.native
  trait CanaryRunTimeline extends js.Object {
    var Completed: js.UndefOr[Timestamp]
    var Started: js.UndefOr[Timestamp]
  }

  object CanaryRunTimeline {
    @inline
    def apply(
        Completed: js.UndefOr[Timestamp] = js.undefined,
        Started: js.UndefOr[Timestamp] = js.undefined
    ): CanaryRunTimeline = {
      val __obj = js.Dynamic.literal()
      Completed.foreach(__v => __obj.updateDynamic("Completed")(__v.asInstanceOf[js.Any]))
      Started.foreach(__v => __obj.updateDynamic("Started")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CanaryRunTimeline]
    }
  }

  /**
    * This structure specifies how often a canary is to make runs and the date and time when it should stop making runs.
    */
  @js.native
  trait CanaryScheduleInput extends js.Object {
    var Expression: String
    var DurationInSeconds: js.UndefOr[MaxOneYearInSeconds]
  }

  object CanaryScheduleInput {
    @inline
    def apply(
        Expression: String,
        DurationInSeconds: js.UndefOr[MaxOneYearInSeconds] = js.undefined
    ): CanaryScheduleInput = {
      val __obj = js.Dynamic.literal(
        "Expression" -> Expression.asInstanceOf[js.Any]
      )

      DurationInSeconds.foreach(__v => __obj.updateDynamic("DurationInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CanaryScheduleInput]
    }
  }

  /**
    * How long, in seconds, for the canary to continue making regular runs according to the schedule in the <code>Expression</code> value.
    */
  @js.native
  trait CanaryScheduleOutput extends js.Object {
    var DurationInSeconds: js.UndefOr[MaxOneYearInSeconds]
    var Expression: js.UndefOr[String]
  }

  object CanaryScheduleOutput {
    @inline
    def apply(
        DurationInSeconds: js.UndefOr[MaxOneYearInSeconds] = js.undefined,
        Expression: js.UndefOr[String] = js.undefined
    ): CanaryScheduleOutput = {
      val __obj = js.Dynamic.literal()
      DurationInSeconds.foreach(__v => __obj.updateDynamic("DurationInSeconds")(__v.asInstanceOf[js.Any]))
      Expression.foreach(__v => __obj.updateDynamic("Expression")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CanaryScheduleOutput]
    }
  }

  @js.native
  sealed trait CanaryState extends js.Any
  object CanaryState {
    val CREATING = "CREATING".asInstanceOf[CanaryState]
    val READY = "READY".asInstanceOf[CanaryState]
    val STARTING = "STARTING".asInstanceOf[CanaryState]
    val RUNNING = "RUNNING".asInstanceOf[CanaryState]
    val UPDATING = "UPDATING".asInstanceOf[CanaryState]
    val STOPPING = "STOPPING".asInstanceOf[CanaryState]
    val STOPPED = "STOPPED".asInstanceOf[CanaryState]
    val ERROR = "ERROR".asInstanceOf[CanaryState]
    val DELETING = "DELETING".asInstanceOf[CanaryState]

    @inline def values = js.Object.freeze(js.Array(CREATING, READY, STARTING, RUNNING, UPDATING, STOPPING, STOPPED, ERROR, DELETING))
  }

  @js.native
  sealed trait CanaryStateReasonCode extends js.Any
  object CanaryStateReasonCode {
    val INVALID_PERMISSIONS = "INVALID_PERMISSIONS".asInstanceOf[CanaryStateReasonCode]

    @inline def values = js.Object.freeze(js.Array(INVALID_PERMISSIONS))
  }

  /**
    * A structure that contains the current state of the canary.
    */
  @js.native
  trait CanaryStatus extends js.Object {
    var State: js.UndefOr[CanaryState]
    var StateReason: js.UndefOr[String]
    var StateReasonCode: js.UndefOr[CanaryStateReasonCode]
  }

  object CanaryStatus {
    @inline
    def apply(
        State: js.UndefOr[CanaryState] = js.undefined,
        StateReason: js.UndefOr[String] = js.undefined,
        StateReasonCode: js.UndefOr[CanaryStateReasonCode] = js.undefined
    ): CanaryStatus = {
      val __obj = js.Dynamic.literal()
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      StateReason.foreach(__v => __obj.updateDynamic("StateReason")(__v.asInstanceOf[js.Any]))
      StateReasonCode.foreach(__v => __obj.updateDynamic("StateReasonCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CanaryStatus]
    }
  }

  /**
    * This structure contains information about when the canary was created and modified.
    */
  @js.native
  trait CanaryTimeline extends js.Object {
    var Created: js.UndefOr[Timestamp]
    var LastModified: js.UndefOr[Timestamp]
    var LastStarted: js.UndefOr[Timestamp]
    var LastStopped: js.UndefOr[Timestamp]
  }

  object CanaryTimeline {
    @inline
    def apply(
        Created: js.UndefOr[Timestamp] = js.undefined,
        LastModified: js.UndefOr[Timestamp] = js.undefined,
        LastStarted: js.UndefOr[Timestamp] = js.undefined,
        LastStopped: js.UndefOr[Timestamp] = js.undefined
    ): CanaryTimeline = {
      val __obj = js.Dynamic.literal()
      Created.foreach(__v => __obj.updateDynamic("Created")(__v.asInstanceOf[js.Any]))
      LastModified.foreach(__v => __obj.updateDynamic("LastModified")(__v.asInstanceOf[js.Any]))
      LastStarted.foreach(__v => __obj.updateDynamic("LastStarted")(__v.asInstanceOf[js.Any]))
      LastStopped.foreach(__v => __obj.updateDynamic("LastStopped")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CanaryTimeline]
    }
  }

  @js.native
  trait CreateCanaryRequest extends js.Object {
    var ArtifactS3Location: String
    var Code: CanaryCodeInput
    var ExecutionRoleArn: Arn
    var Name: CanaryName
    var RuntimeVersion: String
    var Schedule: CanaryScheduleInput
    var FailureRetentionPeriodInDays: js.UndefOr[MaxSize1024]
    var RunConfig: js.UndefOr[CanaryRunConfigInput]
    var SuccessRetentionPeriodInDays: js.UndefOr[MaxSize1024]
    var Tags: js.UndefOr[TagMap]
    var VpcConfig: js.UndefOr[VpcConfigInput]
  }

  object CreateCanaryRequest {
    @inline
    def apply(
        ArtifactS3Location: String,
        Code: CanaryCodeInput,
        ExecutionRoleArn: Arn,
        Name: CanaryName,
        RuntimeVersion: String,
        Schedule: CanaryScheduleInput,
        FailureRetentionPeriodInDays: js.UndefOr[MaxSize1024] = js.undefined,
        RunConfig: js.UndefOr[CanaryRunConfigInput] = js.undefined,
        SuccessRetentionPeriodInDays: js.UndefOr[MaxSize1024] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfigInput] = js.undefined
    ): CreateCanaryRequest = {
      val __obj = js.Dynamic.literal(
        "ArtifactS3Location" -> ArtifactS3Location.asInstanceOf[js.Any],
        "Code" -> Code.asInstanceOf[js.Any],
        "ExecutionRoleArn" -> ExecutionRoleArn.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "RuntimeVersion" -> RuntimeVersion.asInstanceOf[js.Any],
        "Schedule" -> Schedule.asInstanceOf[js.Any]
      )

      FailureRetentionPeriodInDays.foreach(__v => __obj.updateDynamic("FailureRetentionPeriodInDays")(__v.asInstanceOf[js.Any]))
      RunConfig.foreach(__v => __obj.updateDynamic("RunConfig")(__v.asInstanceOf[js.Any]))
      SuccessRetentionPeriodInDays.foreach(__v => __obj.updateDynamic("SuccessRetentionPeriodInDays")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCanaryRequest]
    }
  }

  @js.native
  trait CreateCanaryResponse extends js.Object {
    var Canary: js.UndefOr[Canary]
  }

  object CreateCanaryResponse {
    @inline
    def apply(
        Canary: js.UndefOr[Canary] = js.undefined
    ): CreateCanaryResponse = {
      val __obj = js.Dynamic.literal()
      Canary.foreach(__v => __obj.updateDynamic("Canary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateCanaryResponse]
    }
  }

  @js.native
  trait DeleteCanaryRequest extends js.Object {
    var Name: CanaryName
  }

  object DeleteCanaryRequest {
    @inline
    def apply(
        Name: CanaryName
    ): DeleteCanaryRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteCanaryRequest]
    }
  }

  @js.native
  trait DeleteCanaryResponse extends js.Object {}

  object DeleteCanaryResponse {
    @inline
    def apply(
    ): DeleteCanaryResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteCanaryResponse]
    }
  }

  @js.native
  trait DescribeCanariesLastRunRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxSize100]
    var NextToken: js.UndefOr[Token]
  }

  object DescribeCanariesLastRunRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxSize100] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): DescribeCanariesLastRunRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCanariesLastRunRequest]
    }
  }

  @js.native
  trait DescribeCanariesLastRunResponse extends js.Object {
    var CanariesLastRun: js.UndefOr[CanariesLastRun]
    var NextToken: js.UndefOr[Token]
  }

  object DescribeCanariesLastRunResponse {
    @inline
    def apply(
        CanariesLastRun: js.UndefOr[CanariesLastRun] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): DescribeCanariesLastRunResponse = {
      val __obj = js.Dynamic.literal()
      CanariesLastRun.foreach(__v => __obj.updateDynamic("CanariesLastRun")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCanariesLastRunResponse]
    }
  }

  @js.native
  trait DescribeCanariesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxCanaryResults]
    var NextToken: js.UndefOr[Token]
  }

  object DescribeCanariesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxCanaryResults] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): DescribeCanariesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCanariesRequest]
    }
  }

  @js.native
  trait DescribeCanariesResponse extends js.Object {
    var Canaries: js.UndefOr[Canaries]
    var NextToken: js.UndefOr[Token]
  }

  object DescribeCanariesResponse {
    @inline
    def apply(
        Canaries: js.UndefOr[Canaries] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): DescribeCanariesResponse = {
      val __obj = js.Dynamic.literal()
      Canaries.foreach(__v => __obj.updateDynamic("Canaries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeCanariesResponse]
    }
  }

  @js.native
  trait DescribeRuntimeVersionsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxSize100]
    var NextToken: js.UndefOr[Token]
  }

  object DescribeRuntimeVersionsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxSize100] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): DescribeRuntimeVersionsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRuntimeVersionsRequest]
    }
  }

  @js.native
  trait DescribeRuntimeVersionsResponse extends js.Object {
    var NextToken: js.UndefOr[Token]
    var RuntimeVersions: js.UndefOr[RuntimeVersionList]
  }

  object DescribeRuntimeVersionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        RuntimeVersions: js.UndefOr[RuntimeVersionList] = js.undefined
    ): DescribeRuntimeVersionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RuntimeVersions.foreach(__v => __obj.updateDynamic("RuntimeVersions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRuntimeVersionsResponse]
    }
  }

  @js.native
  trait GetCanaryRequest extends js.Object {
    var Name: CanaryName
  }

  object GetCanaryRequest {
    @inline
    def apply(
        Name: CanaryName
    ): GetCanaryRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetCanaryRequest]
    }
  }

  @js.native
  trait GetCanaryResponse extends js.Object {
    var Canary: js.UndefOr[Canary]
  }

  object GetCanaryResponse {
    @inline
    def apply(
        Canary: js.UndefOr[Canary] = js.undefined
    ): GetCanaryResponse = {
      val __obj = js.Dynamic.literal()
      Canary.foreach(__v => __obj.updateDynamic("Canary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCanaryResponse]
    }
  }

  @js.native
  trait GetCanaryRunsRequest extends js.Object {
    var Name: CanaryName
    var MaxResults: js.UndefOr[MaxSize100]
    var NextToken: js.UndefOr[Token]
  }

  object GetCanaryRunsRequest {
    @inline
    def apply(
        Name: CanaryName,
        MaxResults: js.UndefOr[MaxSize100] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetCanaryRunsRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCanaryRunsRequest]
    }
  }

  @js.native
  trait GetCanaryRunsResponse extends js.Object {
    var CanaryRuns: js.UndefOr[CanaryRuns]
    var NextToken: js.UndefOr[Token]
  }

  object GetCanaryRunsResponse {
    @inline
    def apply(
        CanaryRuns: js.UndefOr[CanaryRuns] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): GetCanaryRunsResponse = {
      val __obj = js.Dynamic.literal()
      CanaryRuns.foreach(__v => __obj.updateDynamic("CanaryRuns")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetCanaryRunsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: Arn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /**
    * This structure contains information about one canary runtime version. For more information about runtime versions, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html| Canary Runtime Versions]].
    */
  @js.native
  trait RuntimeVersion extends js.Object {
    var DeprecationDate: js.UndefOr[Timestamp]
    var Description: js.UndefOr[String]
    var ReleaseDate: js.UndefOr[Timestamp]
    var VersionName: js.UndefOr[String]
  }

  object RuntimeVersion {
    @inline
    def apply(
        DeprecationDate: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[String] = js.undefined,
        ReleaseDate: js.UndefOr[Timestamp] = js.undefined,
        VersionName: js.UndefOr[String] = js.undefined
    ): RuntimeVersion = {
      val __obj = js.Dynamic.literal()
      DeprecationDate.foreach(__v => __obj.updateDynamic("DeprecationDate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ReleaseDate.foreach(__v => __obj.updateDynamic("ReleaseDate")(__v.asInstanceOf[js.Any]))
      VersionName.foreach(__v => __obj.updateDynamic("VersionName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuntimeVersion]
    }
  }

  @js.native
  trait StartCanaryRequest extends js.Object {
    var Name: CanaryName
  }

  object StartCanaryRequest {
    @inline
    def apply(
        Name: CanaryName
    ): StartCanaryRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartCanaryRequest]
    }
  }

  @js.native
  trait StartCanaryResponse extends js.Object {}

  object StartCanaryResponse {
    @inline
    def apply(
    ): StartCanaryResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[StartCanaryResponse]
    }
  }

  @js.native
  trait StopCanaryRequest extends js.Object {
    var Name: CanaryName
  }

  object StopCanaryRequest {
    @inline
    def apply(
        Name: CanaryName
    ): StopCanaryRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopCanaryRequest]
    }
  }

  @js.native
  trait StopCanaryResponse extends js.Object {}

  object StopCanaryResponse {
    @inline
    def apply(
    ): StopCanaryResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[StopCanaryResponse]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var Tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn,
        Tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    @inline
    def apply(
    ): TagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    @inline
    def apply(
    ): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateCanaryRequest extends js.Object {
    var Name: CanaryName
    var Code: js.UndefOr[CanaryCodeInput]
    var ExecutionRoleArn: js.UndefOr[Arn]
    var FailureRetentionPeriodInDays: js.UndefOr[MaxSize1024]
    var RunConfig: js.UndefOr[CanaryRunConfigInput]
    var RuntimeVersion: js.UndefOr[String]
    var Schedule: js.UndefOr[CanaryScheduleInput]
    var SuccessRetentionPeriodInDays: js.UndefOr[MaxSize1024]
    var VpcConfig: js.UndefOr[VpcConfigInput]
  }

  object UpdateCanaryRequest {
    @inline
    def apply(
        Name: CanaryName,
        Code: js.UndefOr[CanaryCodeInput] = js.undefined,
        ExecutionRoleArn: js.UndefOr[Arn] = js.undefined,
        FailureRetentionPeriodInDays: js.UndefOr[MaxSize1024] = js.undefined,
        RunConfig: js.UndefOr[CanaryRunConfigInput] = js.undefined,
        RuntimeVersion: js.UndefOr[String] = js.undefined,
        Schedule: js.UndefOr[CanaryScheduleInput] = js.undefined,
        SuccessRetentionPeriodInDays: js.UndefOr[MaxSize1024] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfigInput] = js.undefined
    ): UpdateCanaryRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Code.foreach(__v => __obj.updateDynamic("Code")(__v.asInstanceOf[js.Any]))
      ExecutionRoleArn.foreach(__v => __obj.updateDynamic("ExecutionRoleArn")(__v.asInstanceOf[js.Any]))
      FailureRetentionPeriodInDays.foreach(__v => __obj.updateDynamic("FailureRetentionPeriodInDays")(__v.asInstanceOf[js.Any]))
      RunConfig.foreach(__v => __obj.updateDynamic("RunConfig")(__v.asInstanceOf[js.Any]))
      RuntimeVersion.foreach(__v => __obj.updateDynamic("RuntimeVersion")(__v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.updateDynamic("Schedule")(__v.asInstanceOf[js.Any]))
      SuccessRetentionPeriodInDays.foreach(__v => __obj.updateDynamic("SuccessRetentionPeriodInDays")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCanaryRequest]
    }
  }

  @js.native
  trait UpdateCanaryResponse extends js.Object {}

  object UpdateCanaryResponse {
    @inline
    def apply(
    ): UpdateCanaryResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateCanaryResponse]
    }
  }

  /**
    * If this canary is to test an endpoint in a VPC, this structure contains information about the subnets and security groups of the VPC endpoint. For more information, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html| Running a Canary in a VPC]].
    */
  @js.native
  trait VpcConfigInput extends js.Object {
    var SecurityGroupIds: js.UndefOr[SecurityGroupIds]
    var SubnetIds: js.UndefOr[SubnetIds]
  }

  object VpcConfigInput {
    @inline
    def apply(
        SecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined,
        SubnetIds: js.UndefOr[SubnetIds] = js.undefined
    ): VpcConfigInput = {
      val __obj = js.Dynamic.literal()
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.updateDynamic("SubnetIds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcConfigInput]
    }
  }

  /**
    * If this canary is to test an endpoint in a VPC, this structure contains information about the subnets and security groups of the VPC endpoint. For more information, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html| Running a Canary in a VPC]].
    */
  @js.native
  trait VpcConfigOutput extends js.Object {
    var SecurityGroupIds: js.UndefOr[SecurityGroupIds]
    var SubnetIds: js.UndefOr[SubnetIds]
    var VpcId: js.UndefOr[VpcId]
  }

  object VpcConfigOutput {
    @inline
    def apply(
        SecurityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined,
        SubnetIds: js.UndefOr[SubnetIds] = js.undefined,
        VpcId: js.UndefOr[VpcId] = js.undefined
    ): VpcConfigOutput = {
      val __obj = js.Dynamic.literal()
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.updateDynamic("SubnetIds")(__v.asInstanceOf[js.Any]))
      VpcId.foreach(__v => __obj.updateDynamic("VpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcConfigOutput]
    }
  }
}
