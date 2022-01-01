package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object braket {
  type CreateJobRequestInputDataConfigList = js.Array[InputFileConfig]
  type CreateJobRequestJobNameString = String
  type CreateQuantumTaskRequestDeviceParametersString = String
  type CreateQuantumTaskRequestOutputS3BucketString = String
  type CreateQuantumTaskRequestOutputS3KeyPrefixString = String
  type CreateQuantumTaskRequestShotsLong = Double
  type DeviceArn = String
  type DeviceSummaryList = js.Array[DeviceSummary]
  type GetJobResponseJobNameString = String
  type HyperParameters = js.Dictionary[HyperParametersValueString]
  type HyperParametersValueString = String
  type InputConfigList = js.Array[InputFileConfig]
  type InputFileConfigChannelNameString = String
  type InstanceConfigVolumeSizeInGbInteger = Int
  type JobArn = String
  type JobEventDetailsMessageString = String
  type JobEvents = js.Array[JobEventDetails]
  type JobStoppingConditionMaxRuntimeInSecondsInteger = Int
  type JobSummaryList = js.Array[JobSummary]
  type JobToken = String
  type JsonValue = String
  type QuantumTaskArn = String
  type QuantumTaskSummaryList = js.Array[QuantumTaskSummary]
  type RoleArn = String
  type S3Path = String
  type SearchDevicesFilterNameString = String
  type SearchDevicesFilterValuesList = js.Array[String256]
  type SearchDevicesRequestFiltersList = js.Array[SearchDevicesFilter]
  type SearchDevicesRequestMaxResultsInteger = Int
  type SearchJobsFilterValuesList = js.Array[String256]
  type SearchJobsRequestFiltersList = js.Array[SearchJobsFilter]
  type SearchJobsRequestMaxResultsInteger = Int
  type SearchQuantumTasksFilterValuesList = js.Array[String256]
  type SearchQuantumTasksRequestFiltersList = js.Array[SearchQuantumTasksFilter]
  type SearchQuantumTasksRequestMaxResultsInteger = Int
  type String1024 = String
  type String2048 = String
  type String256 = String
  type String4096 = String
  type String64 = String
  type SyntheticTimestamp_date_time = js.Date
  type TagKeys = js.Array[String]
  type TagsMap = js.Dictionary[String]
  type Uri = String

  final class BraketOps(private val service: Braket) extends AnyVal {

    @inline def cancelJobFuture(params: CancelJobRequest): Future[CancelJobResponse] = service.cancelJob(params).promise().toFuture
    @inline def cancelQuantumTaskFuture(params: CancelQuantumTaskRequest): Future[CancelQuantumTaskResponse] = service.cancelQuantumTask(params).promise().toFuture
    @inline def createJobFuture(params: CreateJobRequest): Future[CreateJobResponse] = service.createJob(params).promise().toFuture
    @inline def createQuantumTaskFuture(params: CreateQuantumTaskRequest): Future[CreateQuantumTaskResponse] = service.createQuantumTask(params).promise().toFuture
    @inline def getDeviceFuture(params: GetDeviceRequest): Future[GetDeviceResponse] = service.getDevice(params).promise().toFuture
    @inline def getJobFuture(params: GetJobRequest): Future[GetJobResponse] = service.getJob(params).promise().toFuture
    @inline def getQuantumTaskFuture(params: GetQuantumTaskRequest): Future[GetQuantumTaskResponse] = service.getQuantumTask(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def searchDevicesFuture(params: SearchDevicesRequest): Future[SearchDevicesResponse] = service.searchDevices(params).promise().toFuture
    @inline def searchJobsFuture(params: SearchJobsRequest): Future[SearchJobsResponse] = service.searchJobs(params).promise().toFuture
    @inline def searchQuantumTasksFuture(params: SearchQuantumTasksRequest): Future[SearchQuantumTasksResponse] = service.searchQuantumTasks(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/braket", JSImport.Namespace, "AWS.Braket")
  class Braket() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelJob(params: CancelJobRequest): Request[CancelJobResponse] = js.native
    def cancelQuantumTask(params: CancelQuantumTaskRequest): Request[CancelQuantumTaskResponse] = js.native
    def createJob(params: CreateJobRequest): Request[CreateJobResponse] = js.native
    def createQuantumTask(params: CreateQuantumTaskRequest): Request[CreateQuantumTaskResponse] = js.native
    def getDevice(params: GetDeviceRequest): Request[GetDeviceResponse] = js.native
    def getJob(params: GetJobRequest): Request[GetJobResponse] = js.native
    def getQuantumTask(params: GetQuantumTaskRequest): Request[GetQuantumTaskResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def searchDevices(params: SearchDevicesRequest): Request[SearchDevicesResponse] = js.native
    def searchJobs(params: SearchJobsRequest): Request[SearchJobsResponse] = js.native
    def searchQuantumTasks(params: SearchQuantumTasksRequest): Request[SearchQuantumTasksResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
  }
  object Braket {
    @inline implicit def toOps(service: Braket): BraketOps = {
      new BraketOps(service)
    }
  }

  /** Defines the Amazon Braket job to be created. Specifies the container image the job uses and the paths to the Python scripts used for entry and training.
    */
  @js.native
  trait AlgorithmSpecification extends js.Object {
    var containerImage: js.UndefOr[ContainerImage]
    var scriptModeConfig: js.UndefOr[ScriptModeConfig]
  }

  object AlgorithmSpecification {
    @inline
    def apply(
        containerImage: js.UndefOr[ContainerImage] = js.undefined,
        scriptModeConfig: js.UndefOr[ScriptModeConfig] = js.undefined
    ): AlgorithmSpecification = {
      val __obj = js.Dynamic.literal()
      containerImage.foreach(__v => __obj.updateDynamic("containerImage")(__v.asInstanceOf[js.Any]))
      scriptModeConfig.foreach(__v => __obj.updateDynamic("scriptModeConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AlgorithmSpecification]
    }
  }

  @js.native
  trait CancelJobRequest extends js.Object {
    var jobArn: JobArn
  }

  object CancelJobRequest {
    @inline
    def apply(
        jobArn: JobArn
    ): CancelJobRequest = {
      val __obj = js.Dynamic.literal(
        "jobArn" -> jobArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelJobRequest]
    }
  }

  @js.native
  trait CancelJobResponse extends js.Object {
    var cancellationStatus: CancellationStatus
    var jobArn: JobArn
  }

  object CancelJobResponse {
    @inline
    def apply(
        cancellationStatus: CancellationStatus,
        jobArn: JobArn
    ): CancelJobResponse = {
      val __obj = js.Dynamic.literal(
        "cancellationStatus" -> cancellationStatus.asInstanceOf[js.Any],
        "jobArn" -> jobArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelJobResponse]
    }
  }

  @js.native
  trait CancelQuantumTaskRequest extends js.Object {
    var clientToken: String64
    var quantumTaskArn: QuantumTaskArn
  }

  object CancelQuantumTaskRequest {
    @inline
    def apply(
        clientToken: String64,
        quantumTaskArn: QuantumTaskArn
    ): CancelQuantumTaskRequest = {
      val __obj = js.Dynamic.literal(
        "clientToken" -> clientToken.asInstanceOf[js.Any],
        "quantumTaskArn" -> quantumTaskArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelQuantumTaskRequest]
    }
  }

  @js.native
  trait CancelQuantumTaskResponse extends js.Object {
    var cancellationStatus: CancellationStatus
    var quantumTaskArn: QuantumTaskArn
  }

  object CancelQuantumTaskResponse {
    @inline
    def apply(
        cancellationStatus: CancellationStatus,
        quantumTaskArn: QuantumTaskArn
    ): CancelQuantumTaskResponse = {
      val __obj = js.Dynamic.literal(
        "cancellationStatus" -> cancellationStatus.asInstanceOf[js.Any],
        "quantumTaskArn" -> quantumTaskArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelQuantumTaskResponse]
    }
  }

  /** The container image used to create an Amazon Braket job.
    */
  @js.native
  trait ContainerImage extends js.Object {
    var uri: Uri
  }

  object ContainerImage {
    @inline
    def apply(
        uri: Uri
    ): ContainerImage = {
      val __obj = js.Dynamic.literal(
        "uri" -> uri.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ContainerImage]
    }
  }

  @js.native
  trait CreateJobRequest extends js.Object {
    var algorithmSpecification: AlgorithmSpecification
    var clientToken: String64
    var deviceConfig: DeviceConfig
    var instanceConfig: InstanceConfig
    var jobName: CreateJobRequestJobNameString
    var outputDataConfig: JobOutputDataConfig
    var roleArn: RoleArn
    var checkpointConfig: js.UndefOr[JobCheckpointConfig]
    var hyperParameters: js.UndefOr[HyperParameters]
    var inputDataConfig: js.UndefOr[CreateJobRequestInputDataConfigList]
    var stoppingCondition: js.UndefOr[JobStoppingCondition]
    var tags: js.UndefOr[TagsMap]
  }

  object CreateJobRequest {
    @inline
    def apply(
        algorithmSpecification: AlgorithmSpecification,
        clientToken: String64,
        deviceConfig: DeviceConfig,
        instanceConfig: InstanceConfig,
        jobName: CreateJobRequestJobNameString,
        outputDataConfig: JobOutputDataConfig,
        roleArn: RoleArn,
        checkpointConfig: js.UndefOr[JobCheckpointConfig] = js.undefined,
        hyperParameters: js.UndefOr[HyperParameters] = js.undefined,
        inputDataConfig: js.UndefOr[CreateJobRequestInputDataConfigList] = js.undefined,
        stoppingCondition: js.UndefOr[JobStoppingCondition] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): CreateJobRequest = {
      val __obj = js.Dynamic.literal(
        "algorithmSpecification" -> algorithmSpecification.asInstanceOf[js.Any],
        "clientToken" -> clientToken.asInstanceOf[js.Any],
        "deviceConfig" -> deviceConfig.asInstanceOf[js.Any],
        "instanceConfig" -> instanceConfig.asInstanceOf[js.Any],
        "jobName" -> jobName.asInstanceOf[js.Any],
        "outputDataConfig" -> outputDataConfig.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      checkpointConfig.foreach(__v => __obj.updateDynamic("checkpointConfig")(__v.asInstanceOf[js.Any]))
      hyperParameters.foreach(__v => __obj.updateDynamic("hyperParameters")(__v.asInstanceOf[js.Any]))
      inputDataConfig.foreach(__v => __obj.updateDynamic("inputDataConfig")(__v.asInstanceOf[js.Any]))
      stoppingCondition.foreach(__v => __obj.updateDynamic("stoppingCondition")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateJobRequest]
    }
  }

  @js.native
  trait CreateJobResponse extends js.Object {
    var jobArn: JobArn
  }

  object CreateJobResponse {
    @inline
    def apply(
        jobArn: JobArn
    ): CreateJobResponse = {
      val __obj = js.Dynamic.literal(
        "jobArn" -> jobArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateJobResponse]
    }
  }

  @js.native
  trait CreateQuantumTaskRequest extends js.Object {
    var action: JsonValue
    var clientToken: String64
    var deviceArn: DeviceArn
    var outputS3Bucket: CreateQuantumTaskRequestOutputS3BucketString
    var outputS3KeyPrefix: CreateQuantumTaskRequestOutputS3KeyPrefixString
    var shots: CreateQuantumTaskRequestShotsLong
    var deviceParameters: js.UndefOr[CreateQuantumTaskRequestDeviceParametersString]
    var jobToken: js.UndefOr[JobToken]
    var tags: js.UndefOr[TagsMap]
  }

  object CreateQuantumTaskRequest {
    @inline
    def apply(
        action: JsonValue,
        clientToken: String64,
        deviceArn: DeviceArn,
        outputS3Bucket: CreateQuantumTaskRequestOutputS3BucketString,
        outputS3KeyPrefix: CreateQuantumTaskRequestOutputS3KeyPrefixString,
        shots: CreateQuantumTaskRequestShotsLong,
        deviceParameters: js.UndefOr[CreateQuantumTaskRequestDeviceParametersString] = js.undefined,
        jobToken: js.UndefOr[JobToken] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): CreateQuantumTaskRequest = {
      val __obj = js.Dynamic.literal(
        "action" -> action.asInstanceOf[js.Any],
        "clientToken" -> clientToken.asInstanceOf[js.Any],
        "deviceArn" -> deviceArn.asInstanceOf[js.Any],
        "outputS3Bucket" -> outputS3Bucket.asInstanceOf[js.Any],
        "outputS3KeyPrefix" -> outputS3KeyPrefix.asInstanceOf[js.Any],
        "shots" -> shots.asInstanceOf[js.Any]
      )

      deviceParameters.foreach(__v => __obj.updateDynamic("deviceParameters")(__v.asInstanceOf[js.Any]))
      jobToken.foreach(__v => __obj.updateDynamic("jobToken")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateQuantumTaskRequest]
    }
  }

  @js.native
  trait CreateQuantumTaskResponse extends js.Object {
    var quantumTaskArn: QuantumTaskArn
  }

  object CreateQuantumTaskResponse {
    @inline
    def apply(
        quantumTaskArn: QuantumTaskArn
    ): CreateQuantumTaskResponse = {
      val __obj = js.Dynamic.literal(
        "quantumTaskArn" -> quantumTaskArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateQuantumTaskResponse]
    }
  }

  /** Information about the source of the data used by the Amazon Braket job.
    */
  @js.native
  trait DataSource extends js.Object {
    var s3DataSource: S3DataSource
  }

  object DataSource {
    @inline
    def apply(
        s3DataSource: S3DataSource
    ): DataSource = {
      val __obj = js.Dynamic.literal(
        "s3DataSource" -> s3DataSource.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DataSource]
    }
  }

  /** Configures the quantum processing units (QPUs) or simulator used to create and run an Amazon Braket job.
    */
  @js.native
  trait DeviceConfig extends js.Object {
    var device: String256
  }

  object DeviceConfig {
    @inline
    def apply(
        device: String256
    ): DeviceConfig = {
      val __obj = js.Dynamic.literal(
        "device" -> device.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeviceConfig]
    }
  }

  /** Includes information about the device.
    */
  @js.native
  trait DeviceSummary extends js.Object {
    var deviceArn: DeviceArn
    var deviceName: String
    var deviceStatus: DeviceStatus
    var deviceType: DeviceType
    var providerName: String
  }

  object DeviceSummary {
    @inline
    def apply(
        deviceArn: DeviceArn,
        deviceName: String,
        deviceStatus: DeviceStatus,
        deviceType: DeviceType,
        providerName: String
    ): DeviceSummary = {
      val __obj = js.Dynamic.literal(
        "deviceArn" -> deviceArn.asInstanceOf[js.Any],
        "deviceName" -> deviceName.asInstanceOf[js.Any],
        "deviceStatus" -> deviceStatus.asInstanceOf[js.Any],
        "deviceType" -> deviceType.asInstanceOf[js.Any],
        "providerName" -> providerName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeviceSummary]
    }
  }

  @js.native
  trait GetDeviceRequest extends js.Object {
    var deviceArn: DeviceArn
  }

  object GetDeviceRequest {
    @inline
    def apply(
        deviceArn: DeviceArn
    ): GetDeviceRequest = {
      val __obj = js.Dynamic.literal(
        "deviceArn" -> deviceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDeviceRequest]
    }
  }

  @js.native
  trait GetDeviceResponse extends js.Object {
    var deviceArn: DeviceArn
    var deviceCapabilities: JsonValue
    var deviceName: String
    var deviceStatus: DeviceStatus
    var deviceType: DeviceType
    var providerName: String
  }

  object GetDeviceResponse {
    @inline
    def apply(
        deviceArn: DeviceArn,
        deviceCapabilities: JsonValue,
        deviceName: String,
        deviceStatus: DeviceStatus,
        deviceType: DeviceType,
        providerName: String
    ): GetDeviceResponse = {
      val __obj = js.Dynamic.literal(
        "deviceArn" -> deviceArn.asInstanceOf[js.Any],
        "deviceCapabilities" -> deviceCapabilities.asInstanceOf[js.Any],
        "deviceName" -> deviceName.asInstanceOf[js.Any],
        "deviceStatus" -> deviceStatus.asInstanceOf[js.Any],
        "deviceType" -> deviceType.asInstanceOf[js.Any],
        "providerName" -> providerName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDeviceResponse]
    }
  }

  @js.native
  trait GetJobRequest extends js.Object {
    var jobArn: JobArn
  }

  object GetJobRequest {
    @inline
    def apply(
        jobArn: JobArn
    ): GetJobRequest = {
      val __obj = js.Dynamic.literal(
        "jobArn" -> jobArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetJobRequest]
    }
  }

  @js.native
  trait GetJobResponse extends js.Object {
    var algorithmSpecification: AlgorithmSpecification
    var createdAt: SyntheticTimestamp_date_time
    var instanceConfig: InstanceConfig
    var jobArn: JobArn
    var jobName: GetJobResponseJobNameString
    var outputDataConfig: JobOutputDataConfig
    var roleArn: RoleArn
    var status: JobPrimaryStatus
    var billableDuration: js.UndefOr[Int]
    var checkpointConfig: js.UndefOr[JobCheckpointConfig]
    var deviceConfig: js.UndefOr[DeviceConfig]
    var endedAt: js.UndefOr[SyntheticTimestamp_date_time]
    var events: js.UndefOr[JobEvents]
    var failureReason: js.UndefOr[String1024]
    var hyperParameters: js.UndefOr[HyperParameters]
    var inputDataConfig: js.UndefOr[InputConfigList]
    var startedAt: js.UndefOr[SyntheticTimestamp_date_time]
    var stoppingCondition: js.UndefOr[JobStoppingCondition]
    var tags: js.UndefOr[TagsMap]
  }

  object GetJobResponse {
    @inline
    def apply(
        algorithmSpecification: AlgorithmSpecification,
        createdAt: SyntheticTimestamp_date_time,
        instanceConfig: InstanceConfig,
        jobArn: JobArn,
        jobName: GetJobResponseJobNameString,
        outputDataConfig: JobOutputDataConfig,
        roleArn: RoleArn,
        status: JobPrimaryStatus,
        billableDuration: js.UndefOr[Int] = js.undefined,
        checkpointConfig: js.UndefOr[JobCheckpointConfig] = js.undefined,
        deviceConfig: js.UndefOr[DeviceConfig] = js.undefined,
        endedAt: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        events: js.UndefOr[JobEvents] = js.undefined,
        failureReason: js.UndefOr[String1024] = js.undefined,
        hyperParameters: js.UndefOr[HyperParameters] = js.undefined,
        inputDataConfig: js.UndefOr[InputConfigList] = js.undefined,
        startedAt: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        stoppingCondition: js.UndefOr[JobStoppingCondition] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): GetJobResponse = {
      val __obj = js.Dynamic.literal(
        "algorithmSpecification" -> algorithmSpecification.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "instanceConfig" -> instanceConfig.asInstanceOf[js.Any],
        "jobArn" -> jobArn.asInstanceOf[js.Any],
        "jobName" -> jobName.asInstanceOf[js.Any],
        "outputDataConfig" -> outputDataConfig.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      billableDuration.foreach(__v => __obj.updateDynamic("billableDuration")(__v.asInstanceOf[js.Any]))
      checkpointConfig.foreach(__v => __obj.updateDynamic("checkpointConfig")(__v.asInstanceOf[js.Any]))
      deviceConfig.foreach(__v => __obj.updateDynamic("deviceConfig")(__v.asInstanceOf[js.Any]))
      endedAt.foreach(__v => __obj.updateDynamic("endedAt")(__v.asInstanceOf[js.Any]))
      events.foreach(__v => __obj.updateDynamic("events")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      hyperParameters.foreach(__v => __obj.updateDynamic("hyperParameters")(__v.asInstanceOf[js.Any]))
      inputDataConfig.foreach(__v => __obj.updateDynamic("inputDataConfig")(__v.asInstanceOf[js.Any]))
      startedAt.foreach(__v => __obj.updateDynamic("startedAt")(__v.asInstanceOf[js.Any]))
      stoppingCondition.foreach(__v => __obj.updateDynamic("stoppingCondition")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetJobResponse]
    }
  }

  @js.native
  trait GetQuantumTaskRequest extends js.Object {
    var quantumTaskArn: QuantumTaskArn
  }

  object GetQuantumTaskRequest {
    @inline
    def apply(
        quantumTaskArn: QuantumTaskArn
    ): GetQuantumTaskRequest = {
      val __obj = js.Dynamic.literal(
        "quantumTaskArn" -> quantumTaskArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetQuantumTaskRequest]
    }
  }

  @js.native
  trait GetQuantumTaskResponse extends js.Object {
    var createdAt: SyntheticTimestamp_date_time
    var deviceArn: DeviceArn
    var deviceParameters: JsonValue
    var outputS3Bucket: String
    var outputS3Directory: String
    var quantumTaskArn: QuantumTaskArn
    var shots: Double
    var status: QuantumTaskStatus
    var endedAt: js.UndefOr[SyntheticTimestamp_date_time]
    var failureReason: js.UndefOr[String]
    var jobArn: js.UndefOr[JobArn]
    var tags: js.UndefOr[TagsMap]
  }

  object GetQuantumTaskResponse {
    @inline
    def apply(
        createdAt: SyntheticTimestamp_date_time,
        deviceArn: DeviceArn,
        deviceParameters: JsonValue,
        outputS3Bucket: String,
        outputS3Directory: String,
        quantumTaskArn: QuantumTaskArn,
        shots: Double,
        status: QuantumTaskStatus,
        endedAt: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        failureReason: js.UndefOr[String] = js.undefined,
        jobArn: js.UndefOr[JobArn] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): GetQuantumTaskResponse = {
      val __obj = js.Dynamic.literal(
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "deviceArn" -> deviceArn.asInstanceOf[js.Any],
        "deviceParameters" -> deviceParameters.asInstanceOf[js.Any],
        "outputS3Bucket" -> outputS3Bucket.asInstanceOf[js.Any],
        "outputS3Directory" -> outputS3Directory.asInstanceOf[js.Any],
        "quantumTaskArn" -> quantumTaskArn.asInstanceOf[js.Any],
        "shots" -> shots.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      endedAt.foreach(__v => __obj.updateDynamic("endedAt")(__v.asInstanceOf[js.Any]))
      failureReason.foreach(__v => __obj.updateDynamic("failureReason")(__v.asInstanceOf[js.Any]))
      jobArn.foreach(__v => __obj.updateDynamic("jobArn")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetQuantumTaskResponse]
    }
  }

  /** A list of parameters that specify the input channels, type of input data, and where it is located.
    */
  @js.native
  trait InputFileConfig extends js.Object {
    var channelName: InputFileConfigChannelNameString
    var dataSource: DataSource
    var contentType: js.UndefOr[String256]
  }

  object InputFileConfig {
    @inline
    def apply(
        channelName: InputFileConfigChannelNameString,
        dataSource: DataSource,
        contentType: js.UndefOr[String256] = js.undefined
    ): InputFileConfig = {
      val __obj = js.Dynamic.literal(
        "channelName" -> channelName.asInstanceOf[js.Any],
        "dataSource" -> dataSource.asInstanceOf[js.Any]
      )

      contentType.foreach(__v => __obj.updateDynamic("contentType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InputFileConfig]
    }
  }

  /** Configures the resource instances to use while running the Amazon Braket hybrid job on Amazon Braket.
    */
  @js.native
  trait InstanceConfig extends js.Object {
    var instanceType: InstanceType
    var volumeSizeInGb: InstanceConfigVolumeSizeInGbInteger
  }

  object InstanceConfig {
    @inline
    def apply(
        instanceType: InstanceType,
        volumeSizeInGb: InstanceConfigVolumeSizeInGbInteger
    ): InstanceConfig = {
      val __obj = js.Dynamic.literal(
        "instanceType" -> instanceType.asInstanceOf[js.Any],
        "volumeSizeInGb" -> volumeSizeInGb.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InstanceConfig]
    }
  }

  /** Contains information about the output locations for job checkpoint data.
    */
  @js.native
  trait JobCheckpointConfig extends js.Object {
    var s3Uri: S3Path
    var localPath: js.UndefOr[String4096]
  }

  object JobCheckpointConfig {
    @inline
    def apply(
        s3Uri: S3Path,
        localPath: js.UndefOr[String4096] = js.undefined
    ): JobCheckpointConfig = {
      val __obj = js.Dynamic.literal(
        "s3Uri" -> s3Uri.asInstanceOf[js.Any]
      )

      localPath.foreach(__v => __obj.updateDynamic("localPath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobCheckpointConfig]
    }
  }

  /** Details about the type and time events occurred related to the Amazon Braket job.
    */
  @js.native
  trait JobEventDetails extends js.Object {
    var eventType: js.UndefOr[JobEventType]
    var message: js.UndefOr[JobEventDetailsMessageString]
    var timeOfEvent: js.UndefOr[SyntheticTimestamp_date_time]
  }

  object JobEventDetails {
    @inline
    def apply(
        eventType: js.UndefOr[JobEventType] = js.undefined,
        message: js.UndefOr[JobEventDetailsMessageString] = js.undefined,
        timeOfEvent: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined
    ): JobEventDetails = {
      val __obj = js.Dynamic.literal()
      eventType.foreach(__v => __obj.updateDynamic("eventType")(__v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.updateDynamic("message")(__v.asInstanceOf[js.Any]))
      timeOfEvent.foreach(__v => __obj.updateDynamic("timeOfEvent")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobEventDetails]
    }
  }

  /** Specifies the path to the S3 location where you want to store job artifacts and the encryption key used to store them.
    */
  @js.native
  trait JobOutputDataConfig extends js.Object {
    var s3Path: S3Path
    var kmsKeyId: js.UndefOr[String2048]
  }

  object JobOutputDataConfig {
    @inline
    def apply(
        s3Path: S3Path,
        kmsKeyId: js.UndefOr[String2048] = js.undefined
    ): JobOutputDataConfig = {
      val __obj = js.Dynamic.literal(
        "s3Path" -> s3Path.asInstanceOf[js.Any]
      )

      kmsKeyId.foreach(__v => __obj.updateDynamic("kmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobOutputDataConfig]
    }
  }

  /** Specifies limits for how long an Amazon Braket job can run.
    */
  @js.native
  trait JobStoppingCondition extends js.Object {
    var maxRuntimeInSeconds: js.UndefOr[JobStoppingConditionMaxRuntimeInSecondsInteger]
  }

  object JobStoppingCondition {
    @inline
    def apply(
        maxRuntimeInSeconds: js.UndefOr[JobStoppingConditionMaxRuntimeInSecondsInteger] = js.undefined
    ): JobStoppingCondition = {
      val __obj = js.Dynamic.literal()
      maxRuntimeInSeconds.foreach(__v => __obj.updateDynamic("maxRuntimeInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobStoppingCondition]
    }
  }

  /** Provides summary information about an Amazon Braket job.
    */
  @js.native
  trait JobSummary extends js.Object {
    var createdAt: SyntheticTimestamp_date_time
    var device: String256
    var jobArn: JobArn
    var jobName: String
    var status: JobPrimaryStatus
    var endedAt: js.UndefOr[SyntheticTimestamp_date_time]
    var startedAt: js.UndefOr[SyntheticTimestamp_date_time]
    var tags: js.UndefOr[TagsMap]
  }

  object JobSummary {
    @inline
    def apply(
        createdAt: SyntheticTimestamp_date_time,
        device: String256,
        jobArn: JobArn,
        jobName: String,
        status: JobPrimaryStatus,
        endedAt: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        startedAt: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): JobSummary = {
      val __obj = js.Dynamic.literal(
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "device" -> device.asInstanceOf[js.Any],
        "jobArn" -> jobArn.asInstanceOf[js.Any],
        "jobName" -> jobName.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      endedAt.foreach(__v => __obj.updateDynamic("endedAt")(__v.asInstanceOf[js.Any]))
      startedAt.foreach(__v => __obj.updateDynamic("startedAt")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobSummary]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: String
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: String
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagsMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagsMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** Includes information about a quantum task.
    */
  @js.native
  trait QuantumTaskSummary extends js.Object {
    var createdAt: SyntheticTimestamp_date_time
    var deviceArn: DeviceArn
    var outputS3Bucket: String
    var outputS3Directory: String
    var quantumTaskArn: QuantumTaskArn
    var shots: Double
    var status: QuantumTaskStatus
    var endedAt: js.UndefOr[SyntheticTimestamp_date_time]
    var tags: js.UndefOr[TagsMap]
  }

  object QuantumTaskSummary {
    @inline
    def apply(
        createdAt: SyntheticTimestamp_date_time,
        deviceArn: DeviceArn,
        outputS3Bucket: String,
        outputS3Directory: String,
        quantumTaskArn: QuantumTaskArn,
        shots: Double,
        status: QuantumTaskStatus,
        endedAt: js.UndefOr[SyntheticTimestamp_date_time] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): QuantumTaskSummary = {
      val __obj = js.Dynamic.literal(
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "deviceArn" -> deviceArn.asInstanceOf[js.Any],
        "outputS3Bucket" -> outputS3Bucket.asInstanceOf[js.Any],
        "outputS3Directory" -> outputS3Directory.asInstanceOf[js.Any],
        "quantumTaskArn" -> quantumTaskArn.asInstanceOf[js.Any],
        "shots" -> shots.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      endedAt.foreach(__v => __obj.updateDynamic("endedAt")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QuantumTaskSummary]
    }
  }

  /** Information about the data stored in Amazon S3 used by the Amazon Braket job.
    */
  @js.native
  trait S3DataSource extends js.Object {
    var s3Uri: S3Path
  }

  object S3DataSource {
    @inline
    def apply(
        s3Uri: S3Path
    ): S3DataSource = {
      val __obj = js.Dynamic.literal(
        "s3Uri" -> s3Uri.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[S3DataSource]
    }
  }

  /** Contains information about the Python scripts used for entry and by an Amazon Braket job.
    */
  @js.native
  trait ScriptModeConfig extends js.Object {
    var entryPoint: String
    var s3Uri: S3Path
    var compressionType: js.UndefOr[CompressionType]
  }

  object ScriptModeConfig {
    @inline
    def apply(
        entryPoint: String,
        s3Uri: S3Path,
        compressionType: js.UndefOr[CompressionType] = js.undefined
    ): ScriptModeConfig = {
      val __obj = js.Dynamic.literal(
        "entryPoint" -> entryPoint.asInstanceOf[js.Any],
        "s3Uri" -> s3Uri.asInstanceOf[js.Any]
      )

      compressionType.foreach(__v => __obj.updateDynamic("compressionType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScriptModeConfig]
    }
  }

  /** The filter to use for searching devices.
    */
  @js.native
  trait SearchDevicesFilter extends js.Object {
    var name: SearchDevicesFilterNameString
    var values: SearchDevicesFilterValuesList
  }

  object SearchDevicesFilter {
    @inline
    def apply(
        name: SearchDevicesFilterNameString,
        values: SearchDevicesFilterValuesList
    ): SearchDevicesFilter = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "values" -> values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SearchDevicesFilter]
    }
  }

  @js.native
  trait SearchDevicesRequest extends js.Object {
    var filters: SearchDevicesRequestFiltersList
    var maxResults: js.UndefOr[SearchDevicesRequestMaxResultsInteger]
    var nextToken: js.UndefOr[String]
  }

  object SearchDevicesRequest {
    @inline
    def apply(
        filters: SearchDevicesRequestFiltersList,
        maxResults: js.UndefOr[SearchDevicesRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): SearchDevicesRequest = {
      val __obj = js.Dynamic.literal(
        "filters" -> filters.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchDevicesRequest]
    }
  }

  @js.native
  trait SearchDevicesResponse extends js.Object {
    var devices: DeviceSummaryList
    var nextToken: js.UndefOr[String]
  }

  object SearchDevicesResponse {
    @inline
    def apply(
        devices: DeviceSummaryList,
        nextToken: js.UndefOr[String] = js.undefined
    ): SearchDevicesResponse = {
      val __obj = js.Dynamic.literal(
        "devices" -> devices.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchDevicesResponse]
    }
  }

  /** A filter used to search for Amazon Braket jobs.
    */
  @js.native
  trait SearchJobsFilter extends js.Object {
    var name: String64
    var operator: SearchJobsFilterOperator
    var values: SearchJobsFilterValuesList
  }

  object SearchJobsFilter {
    @inline
    def apply(
        name: String64,
        operator: SearchJobsFilterOperator,
        values: SearchJobsFilterValuesList
    ): SearchJobsFilter = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "operator" -> operator.asInstanceOf[js.Any],
        "values" -> values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SearchJobsFilter]
    }
  }

  @js.native
  trait SearchJobsRequest extends js.Object {
    var filters: SearchJobsRequestFiltersList
    var maxResults: js.UndefOr[SearchJobsRequestMaxResultsInteger]
    var nextToken: js.UndefOr[String]
  }

  object SearchJobsRequest {
    @inline
    def apply(
        filters: SearchJobsRequestFiltersList,
        maxResults: js.UndefOr[SearchJobsRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): SearchJobsRequest = {
      val __obj = js.Dynamic.literal(
        "filters" -> filters.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchJobsRequest]
    }
  }

  @js.native
  trait SearchJobsResponse extends js.Object {
    var jobs: JobSummaryList
    var nextToken: js.UndefOr[String]
  }

  object SearchJobsResponse {
    @inline
    def apply(
        jobs: JobSummaryList,
        nextToken: js.UndefOr[String] = js.undefined
    ): SearchJobsResponse = {
      val __obj = js.Dynamic.literal(
        "jobs" -> jobs.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchJobsResponse]
    }
  }

  /** A filter to use to search for tasks.
    */
  @js.native
  trait SearchQuantumTasksFilter extends js.Object {
    var name: String64
    var operator: SearchQuantumTasksFilterOperator
    var values: SearchQuantumTasksFilterValuesList
  }

  object SearchQuantumTasksFilter {
    @inline
    def apply(
        name: String64,
        operator: SearchQuantumTasksFilterOperator,
        values: SearchQuantumTasksFilterValuesList
    ): SearchQuantumTasksFilter = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "operator" -> operator.asInstanceOf[js.Any],
        "values" -> values.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SearchQuantumTasksFilter]
    }
  }

  @js.native
  trait SearchQuantumTasksRequest extends js.Object {
    var filters: SearchQuantumTasksRequestFiltersList
    var maxResults: js.UndefOr[SearchQuantumTasksRequestMaxResultsInteger]
    var nextToken: js.UndefOr[String]
  }

  object SearchQuantumTasksRequest {
    @inline
    def apply(
        filters: SearchQuantumTasksRequestFiltersList,
        maxResults: js.UndefOr[SearchQuantumTasksRequestMaxResultsInteger] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): SearchQuantumTasksRequest = {
      val __obj = js.Dynamic.literal(
        "filters" -> filters.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchQuantumTasksRequest]
    }
  }

  @js.native
  trait SearchQuantumTasksResponse extends js.Object {
    var quantumTasks: QuantumTaskSummaryList
    var nextToken: js.UndefOr[String]
  }

  object SearchQuantumTasksResponse {
    @inline
    def apply(
        quantumTasks: QuantumTaskSummaryList,
        nextToken: js.UndefOr[String] = js.undefined
    ): SearchQuantumTasksResponse = {
      val __obj = js.Dynamic.literal(
        "quantumTasks" -> quantumTasks.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchQuantumTasksResponse]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: String
    var tags: TagsMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: String,
        tags: TagsMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
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
    var resourceArn: String
    var tagKeys: TagKeys
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: String,
        tagKeys: TagKeys
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
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
}
