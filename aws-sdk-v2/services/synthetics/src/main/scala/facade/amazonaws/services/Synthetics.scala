package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object synthetics {
  type BaseScreenshotConfigIgnoreCoordinate = String
  type BaseScreenshotIgnoreCoordinates = js.Array[BaseScreenshotConfigIgnoreCoordinate]
  type BaseScreenshots = js.Array[BaseScreenshot]
  type Blob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type Canaries = js.Array[Canary]
  type CanariesLastRun = js.Array[CanaryLastRun]
  type CanaryArn = String
  type CanaryName = String
  type CanaryRuns = js.Array[CanaryRun]
  type CodeHandler = String
  type DescribeCanariesLastRunNameFilter = js.Array[CanaryName]
  type DescribeCanariesNameFilter = js.Array[CanaryName]
  type EnvironmentVariableName = String
  type EnvironmentVariableValue = String
  type EnvironmentVariablesMap = js.Dictionary[EnvironmentVariableValue]
  type FunctionArn = String
  type GroupArn = String
  type GroupIdentifier = String
  type GroupName = String
  type GroupSummaryList = js.Array[GroupSummary]
  type KmsKeyArn = String
  type MaxCanaryResults = Int
  type MaxFifteenMinutesInSeconds = Int
  type MaxGroupResults = Int
  type MaxOneYearInSeconds = Double
  type MaxSize100 = Int
  type MaxSize1024 = Int
  type MaxSize3008 = Int
  type NullableBoolean = Boolean
  type PaginationToken = String
  type ResourceArn = String
  type RoleArn = String
  type RuntimeVersionList = js.Array[RuntimeVersion]
  type SecurityGroupId = String
  type SecurityGroupIds = js.Array[SecurityGroupId]
  type StringList = js.Array[String]
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

  final class SyntheticsOps(private val service: Synthetics) extends AnyVal {

    @inline def associateResourceFuture(params: AssociateResourceRequest): Future[AssociateResourceResponse] = service.associateResource(params).promise().toFuture
    @inline def createCanaryFuture(params: CreateCanaryRequest): Future[CreateCanaryResponse] = service.createCanary(params).promise().toFuture
    @inline def createGroupFuture(params: CreateGroupRequest): Future[CreateGroupResponse] = service.createGroup(params).promise().toFuture
    @inline def deleteCanaryFuture(params: DeleteCanaryRequest): Future[DeleteCanaryResponse] = service.deleteCanary(params).promise().toFuture
    @inline def deleteGroupFuture(params: DeleteGroupRequest): Future[DeleteGroupResponse] = service.deleteGroup(params).promise().toFuture
    @inline def describeCanariesFuture(params: DescribeCanariesRequest): Future[DescribeCanariesResponse] = service.describeCanaries(params).promise().toFuture
    @inline def describeCanariesLastRunFuture(params: DescribeCanariesLastRunRequest): Future[DescribeCanariesLastRunResponse] = service.describeCanariesLastRun(params).promise().toFuture
    @inline def describeRuntimeVersionsFuture(params: DescribeRuntimeVersionsRequest): Future[DescribeRuntimeVersionsResponse] = service.describeRuntimeVersions(params).promise().toFuture
    @inline def disassociateResourceFuture(params: DisassociateResourceRequest): Future[DisassociateResourceResponse] = service.disassociateResource(params).promise().toFuture
    @inline def getCanaryFuture(params: GetCanaryRequest): Future[GetCanaryResponse] = service.getCanary(params).promise().toFuture
    @inline def getCanaryRunsFuture(params: GetCanaryRunsRequest): Future[GetCanaryRunsResponse] = service.getCanaryRuns(params).promise().toFuture
    @inline def getGroupFuture(params: GetGroupRequest): Future[GetGroupResponse] = service.getGroup(params).promise().toFuture
    @inline def listAssociatedGroupsFuture(params: ListAssociatedGroupsRequest): Future[ListAssociatedGroupsResponse] = service.listAssociatedGroups(params).promise().toFuture
    @inline def listGroupResourcesFuture(params: ListGroupResourcesRequest): Future[ListGroupResourcesResponse] = service.listGroupResources(params).promise().toFuture
    @inline def listGroupsFuture(params: ListGroupsRequest): Future[ListGroupsResponse] = service.listGroups(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def startCanaryFuture(params: StartCanaryRequest): Future[StartCanaryResponse] = service.startCanary(params).promise().toFuture
    @inline def stopCanaryFuture(params: StopCanaryRequest): Future[StopCanaryResponse] = service.stopCanary(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateCanaryFuture(params: UpdateCanaryRequest): Future[UpdateCanaryResponse] = service.updateCanary(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/synthetics", JSImport.Namespace, "AWS.Synthetics")
  class Synthetics() extends js.Object {
    def this(config: AWSConfig) = this()

    def associateResource(params: AssociateResourceRequest): Request[AssociateResourceResponse] = js.native
    def createCanary(params: CreateCanaryRequest): Request[CreateCanaryResponse] = js.native
    def createGroup(params: CreateGroupRequest): Request[CreateGroupResponse] = js.native
    def deleteCanary(params: DeleteCanaryRequest): Request[DeleteCanaryResponse] = js.native
    def deleteGroup(params: DeleteGroupRequest): Request[DeleteGroupResponse] = js.native
    def describeCanaries(params: DescribeCanariesRequest): Request[DescribeCanariesResponse] = js.native
    def describeCanariesLastRun(params: DescribeCanariesLastRunRequest): Request[DescribeCanariesLastRunResponse] = js.native
    def describeRuntimeVersions(params: DescribeRuntimeVersionsRequest): Request[DescribeRuntimeVersionsResponse] = js.native
    def disassociateResource(params: DisassociateResourceRequest): Request[DisassociateResourceResponse] = js.native
    def getCanary(params: GetCanaryRequest): Request[GetCanaryResponse] = js.native
    def getCanaryRuns(params: GetCanaryRunsRequest): Request[GetCanaryRunsResponse] = js.native
    def getGroup(params: GetGroupRequest): Request[GetGroupResponse] = js.native
    def listAssociatedGroups(params: ListAssociatedGroupsRequest): Request[ListAssociatedGroupsResponse] = js.native
    def listGroupResources(params: ListGroupResourcesRequest): Request[ListGroupResourcesResponse] = js.native
    def listGroups(params: ListGroupsRequest): Request[ListGroupsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def startCanary(params: StartCanaryRequest): Request[StartCanaryResponse] = js.native
    def stopCanary(params: StopCanaryRequest): Request[StopCanaryResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateCanary(params: UpdateCanaryRequest): Request[UpdateCanaryResponse] = js.native
  }
  object Synthetics {
    @inline implicit def toOps(service: Synthetics): SyntheticsOps = {
      new SyntheticsOps(service)
    }
  }

  /** A structure that contains the configuration for canary artifacts, including the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3.
    */
  @js.native
  trait ArtifactConfigInput extends js.Object {
    var S3Encryption: js.UndefOr[S3EncryptionConfig]
  }

  object ArtifactConfigInput {
    @inline
    def apply(
        S3Encryption: js.UndefOr[S3EncryptionConfig] = js.undefined
    ): ArtifactConfigInput = {
      val __obj = js.Dynamic.literal()
      S3Encryption.foreach(__v => __obj.updateDynamic("S3Encryption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ArtifactConfigInput]
    }
  }

  /** A structure that contains the configuration for canary artifacts, including the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3.
    */
  @js.native
  trait ArtifactConfigOutput extends js.Object {
    var S3Encryption: js.UndefOr[S3EncryptionConfig]
  }

  object ArtifactConfigOutput {
    @inline
    def apply(
        S3Encryption: js.UndefOr[S3EncryptionConfig] = js.undefined
    ): ArtifactConfigOutput = {
      val __obj = js.Dynamic.literal()
      S3Encryption.foreach(__v => __obj.updateDynamic("S3Encryption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ArtifactConfigOutput]
    }
  }

  @js.native
  trait AssociateResourceRequest extends js.Object {
    var GroupIdentifier: GroupIdentifier
    var ResourceArn: CanaryArn
  }

  object AssociateResourceRequest {
    @inline
    def apply(
        GroupIdentifier: GroupIdentifier,
        ResourceArn: CanaryArn
    ): AssociateResourceRequest = {
      val __obj = js.Dynamic.literal(
        "GroupIdentifier" -> GroupIdentifier.asInstanceOf[js.Any],
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateResourceRequest]
    }
  }

  @js.native
  trait AssociateResourceResponse extends js.Object

  object AssociateResourceResponse {
    @inline
    def apply(): AssociateResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssociateResourceResponse]
    }
  }

  /** A structure representing a screenshot that is used as a baseline during visual monitoring comparisons made by the canary.
    */
  @js.native
  trait BaseScreenshot extends js.Object {
    var ScreenshotName: String
    var IgnoreCoordinates: js.UndefOr[BaseScreenshotIgnoreCoordinates]
  }

  object BaseScreenshot {
    @inline
    def apply(
        ScreenshotName: String,
        IgnoreCoordinates: js.UndefOr[BaseScreenshotIgnoreCoordinates] = js.undefined
    ): BaseScreenshot = {
      val __obj = js.Dynamic.literal(
        "ScreenshotName" -> ScreenshotName.asInstanceOf[js.Any]
      )

      IgnoreCoordinates.foreach(__v => __obj.updateDynamic("IgnoreCoordinates")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BaseScreenshot]
    }
  }

  /** This structure contains all information about one canary in your account.
    */
  @js.native
  trait Canary extends js.Object {
    var ArtifactConfig: js.UndefOr[ArtifactConfigOutput]
    var ArtifactS3Location: js.UndefOr[String]
    var Code: js.UndefOr[CanaryCodeOutput]
    var EngineArn: js.UndefOr[FunctionArn]
    var ExecutionRoleArn: js.UndefOr[RoleArn]
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
    var VisualReference: js.UndefOr[VisualReferenceOutput]
    var VpcConfig: js.UndefOr[VpcConfigOutput]
  }

  object Canary {
    @inline
    def apply(
        ArtifactConfig: js.UndefOr[ArtifactConfigOutput] = js.undefined,
        ArtifactS3Location: js.UndefOr[String] = js.undefined,
        Code: js.UndefOr[CanaryCodeOutput] = js.undefined,
        EngineArn: js.UndefOr[FunctionArn] = js.undefined,
        ExecutionRoleArn: js.UndefOr[RoleArn] = js.undefined,
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
        VisualReference: js.UndefOr[VisualReferenceOutput] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfigOutput] = js.undefined
    ): Canary = {
      val __obj = js.Dynamic.literal()
      ArtifactConfig.foreach(__v => __obj.updateDynamic("ArtifactConfig")(__v.asInstanceOf[js.Any]))
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
      VisualReference.foreach(__v => __obj.updateDynamic("VisualReference")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Canary]
    }
  }

  /** Use this structure to input your script code for the canary. This structure contains the Lambda handler with the location where the canary should start running the script. If the script is stored in an S3 bucket, the bucket name, key, and version are also included. If the script was passed into the canary directly, the script code is contained in the value of <code>Zipfile</code>.
    */
  @js.native
  trait CanaryCodeInput extends js.Object {
    var Handler: CodeHandler
    var S3Bucket: js.UndefOr[String]
    var S3Key: js.UndefOr[String]
    var S3Version: js.UndefOr[String]
    var ZipFile: js.UndefOr[Blob]
  }

  object CanaryCodeInput {
    @inline
    def apply(
        Handler: CodeHandler,
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

  /** This structure contains information about the canary's Lambda handler and where its code is stored by CloudWatch Synthetics.
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

  /** This structure contains information about the most recent run of a single canary.
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

  /** This structure contains the details about one run of one canary.
    */
  @js.native
  trait CanaryRun extends js.Object {
    var ArtifactS3Location: js.UndefOr[String]
    var Id: js.UndefOr[UUID]
    var Name: js.UndefOr[CanaryName]
    var Status: js.UndefOr[CanaryRunStatus]
    var Timeline: js.UndefOr[CanaryRunTimeline]
  }

  object CanaryRun {
    @inline
    def apply(
        ArtifactS3Location: js.UndefOr[String] = js.undefined,
        Id: js.UndefOr[UUID] = js.undefined,
        Name: js.UndefOr[CanaryName] = js.undefined,
        Status: js.UndefOr[CanaryRunStatus] = js.undefined,
        Timeline: js.UndefOr[CanaryRunTimeline] = js.undefined
    ): CanaryRun = {
      val __obj = js.Dynamic.literal()
      ArtifactS3Location.foreach(__v => __obj.updateDynamic("ArtifactS3Location")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Timeline.foreach(__v => __obj.updateDynamic("Timeline")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CanaryRun]
    }
  }

  /** A structure that contains input information for a canary run.
    */
  @js.native
  trait CanaryRunConfigInput extends js.Object {
    var ActiveTracing: js.UndefOr[NullableBoolean]
    var EnvironmentVariables: js.UndefOr[EnvironmentVariablesMap]
    var MemoryInMB: js.UndefOr[MaxSize3008]
    var TimeoutInSeconds: js.UndefOr[MaxFifteenMinutesInSeconds]
  }

  object CanaryRunConfigInput {
    @inline
    def apply(
        ActiveTracing: js.UndefOr[NullableBoolean] = js.undefined,
        EnvironmentVariables: js.UndefOr[EnvironmentVariablesMap] = js.undefined,
        MemoryInMB: js.UndefOr[MaxSize3008] = js.undefined,
        TimeoutInSeconds: js.UndefOr[MaxFifteenMinutesInSeconds] = js.undefined
    ): CanaryRunConfigInput = {
      val __obj = js.Dynamic.literal()
      ActiveTracing.foreach(__v => __obj.updateDynamic("ActiveTracing")(__v.asInstanceOf[js.Any]))
      EnvironmentVariables.foreach(__v => __obj.updateDynamic("EnvironmentVariables")(__v.asInstanceOf[js.Any]))
      MemoryInMB.foreach(__v => __obj.updateDynamic("MemoryInMB")(__v.asInstanceOf[js.Any]))
      TimeoutInSeconds.foreach(__v => __obj.updateDynamic("TimeoutInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CanaryRunConfigInput]
    }
  }

  /** A structure that contains information about a canary run.
    */
  @js.native
  trait CanaryRunConfigOutput extends js.Object {
    var ActiveTracing: js.UndefOr[NullableBoolean]
    var MemoryInMB: js.UndefOr[MaxSize3008]
    var TimeoutInSeconds: js.UndefOr[MaxFifteenMinutesInSeconds]
  }

  object CanaryRunConfigOutput {
    @inline
    def apply(
        ActiveTracing: js.UndefOr[NullableBoolean] = js.undefined,
        MemoryInMB: js.UndefOr[MaxSize3008] = js.undefined,
        TimeoutInSeconds: js.UndefOr[MaxFifteenMinutesInSeconds] = js.undefined
    ): CanaryRunConfigOutput = {
      val __obj = js.Dynamic.literal()
      ActiveTracing.foreach(__v => __obj.updateDynamic("ActiveTracing")(__v.asInstanceOf[js.Any]))
      MemoryInMB.foreach(__v => __obj.updateDynamic("MemoryInMB")(__v.asInstanceOf[js.Any]))
      TimeoutInSeconds.foreach(__v => __obj.updateDynamic("TimeoutInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CanaryRunConfigOutput]
    }
  }

  /** This structure contains the status information about a canary run.
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

  /** This structure contains the start and end times of a single canary run.
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

  /** This structure specifies how often a canary is to make runs and the date and time when it should stop making runs.
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

  /** How long, in seconds, for the canary to continue making regular runs according to the schedule in the <code>Expression</code> value.
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

  /** A structure that contains the current state of the canary.
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

  /** This structure contains information about when the canary was created and modified.
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
    var ExecutionRoleArn: RoleArn
    var Name: CanaryName
    var RuntimeVersion: String
    var Schedule: CanaryScheduleInput
    var ArtifactConfig: js.UndefOr[ArtifactConfigInput]
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
        ExecutionRoleArn: RoleArn,
        Name: CanaryName,
        RuntimeVersion: String,
        Schedule: CanaryScheduleInput,
        ArtifactConfig: js.UndefOr[ArtifactConfigInput] = js.undefined,
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

      ArtifactConfig.foreach(__v => __obj.updateDynamic("ArtifactConfig")(__v.asInstanceOf[js.Any]))
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
  trait CreateGroupRequest extends js.Object {
    var Name: GroupName
    var Tags: js.UndefOr[TagMap]
  }

  object CreateGroupRequest {
    @inline
    def apply(
        Name: GroupName,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateGroupRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGroupRequest]
    }
  }

  @js.native
  trait CreateGroupResponse extends js.Object {
    var Group: js.UndefOr[Group]
  }

  object CreateGroupResponse {
    @inline
    def apply(
        Group: js.UndefOr[Group] = js.undefined
    ): CreateGroupResponse = {
      val __obj = js.Dynamic.literal()
      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGroupResponse]
    }
  }

  @js.native
  trait DeleteCanaryRequest extends js.Object {
    var Name: CanaryName
    var DeleteLambda: js.UndefOr[Boolean]
  }

  object DeleteCanaryRequest {
    @inline
    def apply(
        Name: CanaryName,
        DeleteLambda: js.UndefOr[Boolean] = js.undefined
    ): DeleteCanaryRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      DeleteLambda.foreach(__v => __obj.updateDynamic("DeleteLambda")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteCanaryRequest]
    }
  }

  @js.native
  trait DeleteCanaryResponse extends js.Object

  object DeleteCanaryResponse {
    @inline
    def apply(): DeleteCanaryResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteCanaryResponse]
    }
  }

  @js.native
  trait DeleteGroupRequest extends js.Object {
    var GroupIdentifier: GroupIdentifier
  }

  object DeleteGroupRequest {
    @inline
    def apply(
        GroupIdentifier: GroupIdentifier
    ): DeleteGroupRequest = {
      val __obj = js.Dynamic.literal(
        "GroupIdentifier" -> GroupIdentifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteGroupRequest]
    }
  }

  @js.native
  trait DeleteGroupResponse extends js.Object

  object DeleteGroupResponse {
    @inline
    def apply(): DeleteGroupResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteGroupResponse]
    }
  }

  @js.native
  trait DescribeCanariesLastRunRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxSize100]
    var Names: js.UndefOr[DescribeCanariesLastRunNameFilter]
    var NextToken: js.UndefOr[Token]
  }

  object DescribeCanariesLastRunRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxSize100] = js.undefined,
        Names: js.UndefOr[DescribeCanariesLastRunNameFilter] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): DescribeCanariesLastRunRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      Names.foreach(__v => __obj.updateDynamic("Names")(__v.asInstanceOf[js.Any]))
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
    var Names: js.UndefOr[DescribeCanariesNameFilter]
    var NextToken: js.UndefOr[Token]
  }

  object DescribeCanariesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxCanaryResults] = js.undefined,
        Names: js.UndefOr[DescribeCanariesNameFilter] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): DescribeCanariesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      Names.foreach(__v => __obj.updateDynamic("Names")(__v.asInstanceOf[js.Any]))
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
  trait DisassociateResourceRequest extends js.Object {
    var GroupIdentifier: GroupIdentifier
    var ResourceArn: CanaryArn
  }

  object DisassociateResourceRequest {
    @inline
    def apply(
        GroupIdentifier: GroupIdentifier,
        ResourceArn: CanaryArn
    ): DisassociateResourceRequest = {
      val __obj = js.Dynamic.literal(
        "GroupIdentifier" -> GroupIdentifier.asInstanceOf[js.Any],
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateResourceRequest]
    }
  }

  @js.native
  trait DisassociateResourceResponse extends js.Object

  object DisassociateResourceResponse {
    @inline
    def apply(): DisassociateResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateResourceResponse]
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
  trait GetGroupRequest extends js.Object {
    var GroupIdentifier: GroupIdentifier
  }

  object GetGroupRequest {
    @inline
    def apply(
        GroupIdentifier: GroupIdentifier
    ): GetGroupRequest = {
      val __obj = js.Dynamic.literal(
        "GroupIdentifier" -> GroupIdentifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetGroupRequest]
    }
  }

  @js.native
  trait GetGroupResponse extends js.Object {
    var Group: js.UndefOr[Group]
  }

  object GetGroupResponse {
    @inline
    def apply(
        Group: js.UndefOr[Group] = js.undefined
    ): GetGroupResponse = {
      val __obj = js.Dynamic.literal()
      Group.foreach(__v => __obj.updateDynamic("Group")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGroupResponse]
    }
  }

  /** This structure contains information about one group.
    */
  @js.native
  trait Group extends js.Object {
    var Arn: js.UndefOr[GroupArn]
    var CreatedTime: js.UndefOr[Timestamp]
    var Id: js.UndefOr[String]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[GroupName]
    var Tags: js.UndefOr[TagMap]
  }

  object Group {
    @inline
    def apply(
        Arn: js.UndefOr[GroupArn] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        Id: js.UndefOr[String] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[GroupName] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): Group = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedTime.foreach(__v => __obj.updateDynamic("CreatedTime")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Group]
    }
  }

  /** A structure containing some information about a group.
    */
  @js.native
  trait GroupSummary extends js.Object {
    var Arn: js.UndefOr[GroupArn]
    var Id: js.UndefOr[String]
    var Name: js.UndefOr[GroupName]
  }

  object GroupSummary {
    @inline
    def apply(
        Arn: js.UndefOr[GroupArn] = js.undefined,
        Id: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[GroupName] = js.undefined
    ): GroupSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GroupSummary]
    }
  }

  @js.native
  trait ListAssociatedGroupsRequest extends js.Object {
    var ResourceArn: CanaryArn
    var MaxResults: js.UndefOr[MaxGroupResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListAssociatedGroupsRequest {
    @inline
    def apply(
        ResourceArn: CanaryArn,
        MaxResults: js.UndefOr[MaxGroupResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListAssociatedGroupsRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssociatedGroupsRequest]
    }
  }

  @js.native
  trait ListAssociatedGroupsResponse extends js.Object {
    var Groups: js.UndefOr[GroupSummaryList]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListAssociatedGroupsResponse {
    @inline
    def apply(
        Groups: js.UndefOr[GroupSummaryList] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListAssociatedGroupsResponse = {
      val __obj = js.Dynamic.literal()
      Groups.foreach(__v => __obj.updateDynamic("Groups")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAssociatedGroupsResponse]
    }
  }

  @js.native
  trait ListGroupResourcesRequest extends js.Object {
    var GroupIdentifier: GroupIdentifier
    var MaxResults: js.UndefOr[MaxGroupResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListGroupResourcesRequest {
    @inline
    def apply(
        GroupIdentifier: GroupIdentifier,
        MaxResults: js.UndefOr[MaxGroupResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListGroupResourcesRequest = {
      val __obj = js.Dynamic.literal(
        "GroupIdentifier" -> GroupIdentifier.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupResourcesRequest]
    }
  }

  @js.native
  trait ListGroupResourcesResponse extends js.Object {
    var NextToken: js.UndefOr[PaginationToken]
    var Resources: js.UndefOr[StringList]
  }

  object ListGroupResourcesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[PaginationToken] = js.undefined,
        Resources: js.UndefOr[StringList] = js.undefined
    ): ListGroupResourcesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Resources.foreach(__v => __obj.updateDynamic("Resources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupResourcesResponse]
    }
  }

  @js.native
  trait ListGroupsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxGroupResults]
    var NextToken: js.UndefOr[PaginationToken]
  }

  object ListGroupsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxGroupResults] = js.undefined,
        NextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListGroupsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupsRequest]
    }
  }

  @js.native
  trait ListGroupsResponse extends js.Object {
    var Groups: js.UndefOr[GroupSummaryList]
    var NextToken: js.UndefOr[Token]
  }

  object ListGroupsResponse {
    @inline
    def apply(
        Groups: js.UndefOr[GroupSummaryList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListGroupsResponse = {
      val __obj = js.Dynamic.literal()
      Groups.foreach(__v => __obj.updateDynamic("Groups")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroupsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn
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

  /** This structure contains information about one canary runtime version. For more information about runtime versions, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Library.html| Canary Runtime Versions]].
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

  /** A structure that contains the configuration of encryption-at-rest settings for canary artifacts that the canary uploads to Amazon S3. For more information, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_artifact_encryption.html|Encrypting canary artifacts]]
    */
  @js.native
  trait S3EncryptionConfig extends js.Object {
    var EncryptionMode: js.UndefOr[EncryptionMode]
    var KmsKeyArn: js.UndefOr[KmsKeyArn]
  }

  object S3EncryptionConfig {
    @inline
    def apply(
        EncryptionMode: js.UndefOr[EncryptionMode] = js.undefined,
        KmsKeyArn: js.UndefOr[KmsKeyArn] = js.undefined
    ): S3EncryptionConfig = {
      val __obj = js.Dynamic.literal()
      EncryptionMode.foreach(__v => __obj.updateDynamic("EncryptionMode")(__v.asInstanceOf[js.Any]))
      KmsKeyArn.foreach(__v => __obj.updateDynamic("KmsKeyArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3EncryptionConfig]
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
  trait StartCanaryResponse extends js.Object

  object StartCanaryResponse {
    @inline
    def apply(): StartCanaryResponse = {
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
  trait StopCanaryResponse extends js.Object

  object StopCanaryResponse {
    @inline
    def apply(): StopCanaryResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopCanaryResponse]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
    var Tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn,
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
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn,
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
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateCanaryRequest extends js.Object {
    var Name: CanaryName
    var ArtifactConfig: js.UndefOr[ArtifactConfigInput]
    var ArtifactS3Location: js.UndefOr[String]
    var Code: js.UndefOr[CanaryCodeInput]
    var ExecutionRoleArn: js.UndefOr[RoleArn]
    var FailureRetentionPeriodInDays: js.UndefOr[MaxSize1024]
    var RunConfig: js.UndefOr[CanaryRunConfigInput]
    var RuntimeVersion: js.UndefOr[String]
    var Schedule: js.UndefOr[CanaryScheduleInput]
    var SuccessRetentionPeriodInDays: js.UndefOr[MaxSize1024]
    var VisualReference: js.UndefOr[VisualReferenceInput]
    var VpcConfig: js.UndefOr[VpcConfigInput]
  }

  object UpdateCanaryRequest {
    @inline
    def apply(
        Name: CanaryName,
        ArtifactConfig: js.UndefOr[ArtifactConfigInput] = js.undefined,
        ArtifactS3Location: js.UndefOr[String] = js.undefined,
        Code: js.UndefOr[CanaryCodeInput] = js.undefined,
        ExecutionRoleArn: js.UndefOr[RoleArn] = js.undefined,
        FailureRetentionPeriodInDays: js.UndefOr[MaxSize1024] = js.undefined,
        RunConfig: js.UndefOr[CanaryRunConfigInput] = js.undefined,
        RuntimeVersion: js.UndefOr[String] = js.undefined,
        Schedule: js.UndefOr[CanaryScheduleInput] = js.undefined,
        SuccessRetentionPeriodInDays: js.UndefOr[MaxSize1024] = js.undefined,
        VisualReference: js.UndefOr[VisualReferenceInput] = js.undefined,
        VpcConfig: js.UndefOr[VpcConfigInput] = js.undefined
    ): UpdateCanaryRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ArtifactConfig.foreach(__v => __obj.updateDynamic("ArtifactConfig")(__v.asInstanceOf[js.Any]))
      ArtifactS3Location.foreach(__v => __obj.updateDynamic("ArtifactS3Location")(__v.asInstanceOf[js.Any]))
      Code.foreach(__v => __obj.updateDynamic("Code")(__v.asInstanceOf[js.Any]))
      ExecutionRoleArn.foreach(__v => __obj.updateDynamic("ExecutionRoleArn")(__v.asInstanceOf[js.Any]))
      FailureRetentionPeriodInDays.foreach(__v => __obj.updateDynamic("FailureRetentionPeriodInDays")(__v.asInstanceOf[js.Any]))
      RunConfig.foreach(__v => __obj.updateDynamic("RunConfig")(__v.asInstanceOf[js.Any]))
      RuntimeVersion.foreach(__v => __obj.updateDynamic("RuntimeVersion")(__v.asInstanceOf[js.Any]))
      Schedule.foreach(__v => __obj.updateDynamic("Schedule")(__v.asInstanceOf[js.Any]))
      SuccessRetentionPeriodInDays.foreach(__v => __obj.updateDynamic("SuccessRetentionPeriodInDays")(__v.asInstanceOf[js.Any]))
      VisualReference.foreach(__v => __obj.updateDynamic("VisualReference")(__v.asInstanceOf[js.Any]))
      VpcConfig.foreach(__v => __obj.updateDynamic("VpcConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateCanaryRequest]
    }
  }

  @js.native
  trait UpdateCanaryResponse extends js.Object

  object UpdateCanaryResponse {
    @inline
    def apply(): UpdateCanaryResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateCanaryResponse]
    }
  }

  /** An object that specifies what screenshots to use as a baseline for visual monitoring by this canary. It can optionally also specify parts of the screenshots to ignore during the visual monitoring comparison. Visual monitoring is supported only on canaries running the ```syn-puppeteer-node-3.2``` runtime or later. For more information, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Library_SyntheticsLogger_VisualTesting.html| Visual monitoring]] and [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_Blueprints_VisualTesting.html| Visual monitoring blueprint]]
    */
  @js.native
  trait VisualReferenceInput extends js.Object {
    var BaseCanaryRunId: String
    var BaseScreenshots: js.UndefOr[BaseScreenshots]
  }

  object VisualReferenceInput {
    @inline
    def apply(
        BaseCanaryRunId: String,
        BaseScreenshots: js.UndefOr[BaseScreenshots] = js.undefined
    ): VisualReferenceInput = {
      val __obj = js.Dynamic.literal(
        "BaseCanaryRunId" -> BaseCanaryRunId.asInstanceOf[js.Any]
      )

      BaseScreenshots.foreach(__v => __obj.updateDynamic("BaseScreenshots")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VisualReferenceInput]
    }
  }

  /** If this canary performs visual monitoring by comparing screenshots, this structure contains the ID of the canary run that is used as the baseline for screenshots, and the coordinates of any parts of those screenshots that are ignored during visual monitoring comparison. Visual monitoring is supported only on canaries running the ```syn-puppeteer-node-3.2``` runtime or later.
    */
  @js.native
  trait VisualReferenceOutput extends js.Object {
    var BaseCanaryRunId: js.UndefOr[String]
    var BaseScreenshots: js.UndefOr[BaseScreenshots]
  }

  object VisualReferenceOutput {
    @inline
    def apply(
        BaseCanaryRunId: js.UndefOr[String] = js.undefined,
        BaseScreenshots: js.UndefOr[BaseScreenshots] = js.undefined
    ): VisualReferenceOutput = {
      val __obj = js.Dynamic.literal()
      BaseCanaryRunId.foreach(__v => __obj.updateDynamic("BaseCanaryRunId")(__v.asInstanceOf[js.Any]))
      BaseScreenshots.foreach(__v => __obj.updateDynamic("BaseScreenshots")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VisualReferenceOutput]
    }
  }

  /** If this canary is to test an endpoint in a VPC, this structure contains information about the subnets and security groups of the VPC endpoint. For more information, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html| Running a Canary in a VPC]].
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

  /** If this canary is to test an endpoint in a VPC, this structure contains information about the subnets and security groups of the VPC endpoint. For more information, see [[https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_VPC.html| Running a Canary in a VPC]].
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
