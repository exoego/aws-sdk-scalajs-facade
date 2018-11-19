package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object devicefarm {
  type AWSAccountNumber = String
  type AccountsCleanup = Boolean
  type AmazonResourceName = String
  type AmazonResourceNames = js.Array[AmazonResourceName]
  type AndroidPaths = js.Array[String]
  type AppPackagesCleanup = Boolean
  type ArtifactCategory = String
  type ArtifactType = String
  type Artifacts = js.Array[Artifact]
  type BillingMethod = String
  type ClientId = String
  type ContentType = String
  type CurrencyCode = String
  type DateTime = js.Date
  type DeviceAttribute = String
  type DeviceFormFactor = String
  type DeviceHostPaths = js.Array[String]
  type DeviceInstances = js.Array[DeviceInstance]
  type DevicePlatform = String
  type DevicePoolCompatibilityResults = js.Array[DevicePoolCompatibilityResult]
  type DevicePoolType = String
  type DevicePools = js.Array[DevicePool]
  type Devices = js.Array[Device]
  type ExecutionResult = String
  type ExecutionResultCode = String
  type ExecutionStatus = String
  type Filter = String
  type HostAddress = String
  type IncompatibilityMessages = js.Array[IncompatibilityMessage]
  type InstanceLabels = js.Array[String]
  type InstanceProfiles = js.Array[InstanceProfile]
  type InstanceStatus = String
  type InteractionMode = String
  type IosPaths = js.Array[String]
  type JobTimeoutMinutes = Int
  type Jobs = js.Array[Job]
  type MaxSlotMap = js.Dictionary[Int]
  type Message = String
  type Metadata = String
  type Name = String
  type NetworkProfileType = String
  type NetworkProfiles = js.Array[NetworkProfile]
  type OfferingIdentifier = String
  type OfferingPromotionIdentifier = String
  type OfferingPromotions = js.Array[OfferingPromotion]
  type OfferingStatusMap = js.Dictionary[OfferingStatus]
  type OfferingTransactionType = String
  type OfferingTransactions = js.Array[OfferingTransaction]
  type OfferingType = String
  type Offerings = js.Array[Offering]
  type PackageIds = js.Array[String]
  type PaginationToken = String
  type PercentInteger = Int
  type Problems = js.Array[Problem]
  type Projects = js.Array[Project]
  type PurchasedDevicesMap = js.Dictionary[Int]
  type RecurringChargeFrequency = String
  type RecurringCharges = js.Array[RecurringCharge]
  type RemoteAccessSessions = js.Array[RemoteAccessSession]
  type RuleOperator = String
  type Rules = js.Array[Rule]
  type Runs = js.Array[Run]
  type SampleType = String
  type Samples = js.Array[Sample]
  type ServiceDnsName = String
  type SkipAppResign = Boolean
  type SshPublicKey = String
  type Suites = js.Array[Suite]
  type TestParameters = js.Dictionary[String]
  type TestType = String
  type Tests = js.Array[Test]
  type TransactionIdentifier = String
  type URL = String
  type UniqueProblems = js.Array[UniqueProblem]
  type UniqueProblemsByExecutionResultMap = js.Dictionary[UniqueProblems]
  type UploadCategory = String
  type UploadStatus = String
  type UploadType = String
  type Uploads = js.Array[Upload]
  type VPCEConfigurationDescription = String
  type VPCEConfigurationName = String
  type VPCEConfigurations = js.Array[VPCEConfiguration]
  type VPCEServiceName = String
  type VideoCapture = Boolean
}

package devicefarm {
  @js.native
  @JSImport("aws-sdk", "DeviceFarm")
  class DeviceFarm(config: AWSConfig) extends js.Object {
    def createDevicePool(params: CreateDevicePoolRequest): Request[CreateDevicePoolResult] = js.native
    def createInstanceProfile(params: CreateInstanceProfileRequest): Request[CreateInstanceProfileResult] = js.native
    def createNetworkProfile(params: CreateNetworkProfileRequest): Request[CreateNetworkProfileResult] = js.native
    def createProject(params: CreateProjectRequest): Request[CreateProjectResult] = js.native
    def createRemoteAccessSession(params: CreateRemoteAccessSessionRequest): Request[CreateRemoteAccessSessionResult] = js.native
    def createUpload(params: CreateUploadRequest): Request[CreateUploadResult] = js.native
    def createVPCEConfiguration(params: CreateVPCEConfigurationRequest): Request[CreateVPCEConfigurationResult] = js.native
    def deleteDevicePool(params: DeleteDevicePoolRequest): Request[DeleteDevicePoolResult] = js.native
    def deleteInstanceProfile(params: DeleteInstanceProfileRequest): Request[DeleteInstanceProfileResult] = js.native
    def deleteNetworkProfile(params: DeleteNetworkProfileRequest): Request[DeleteNetworkProfileResult] = js.native
    def deleteProject(params: DeleteProjectRequest): Request[DeleteProjectResult] = js.native
    def deleteRemoteAccessSession(params: DeleteRemoteAccessSessionRequest): Request[DeleteRemoteAccessSessionResult] = js.native
    def deleteRun(params: DeleteRunRequest): Request[DeleteRunResult] = js.native
    def deleteUpload(params: DeleteUploadRequest): Request[DeleteUploadResult] = js.native
    def deleteVPCEConfiguration(params: DeleteVPCEConfigurationRequest): Request[DeleteVPCEConfigurationResult] = js.native
    def getAccountSettings(params: GetAccountSettingsRequest): Request[GetAccountSettingsResult] = js.native
    def getDevice(params: GetDeviceRequest): Request[GetDeviceResult] = js.native
    def getDeviceInstance(params: GetDeviceInstanceRequest): Request[GetDeviceInstanceResult] = js.native
    def getDevicePool(params: GetDevicePoolRequest): Request[GetDevicePoolResult] = js.native
    def getDevicePoolCompatibility(params: GetDevicePoolCompatibilityRequest): Request[GetDevicePoolCompatibilityResult] = js.native
    def getInstanceProfile(params: GetInstanceProfileRequest): Request[GetInstanceProfileResult] = js.native
    def getJob(params: GetJobRequest): Request[GetJobResult] = js.native
    def getNetworkProfile(params: GetNetworkProfileRequest): Request[GetNetworkProfileResult] = js.native
    def getOfferingStatus(params: GetOfferingStatusRequest): Request[GetOfferingStatusResult] = js.native
    def getProject(params: GetProjectRequest): Request[GetProjectResult] = js.native
    def getRemoteAccessSession(params: GetRemoteAccessSessionRequest): Request[GetRemoteAccessSessionResult] = js.native
    def getRun(params: GetRunRequest): Request[GetRunResult] = js.native
    def getSuite(params: GetSuiteRequest): Request[GetSuiteResult] = js.native
    def getTest(params: GetTestRequest): Request[GetTestResult] = js.native
    def getUpload(params: GetUploadRequest): Request[GetUploadResult] = js.native
    def getVPCEConfiguration(params: GetVPCEConfigurationRequest): Request[GetVPCEConfigurationResult] = js.native
    def installToRemoteAccessSession(params: InstallToRemoteAccessSessionRequest): Request[InstallToRemoteAccessSessionResult] = js.native
    def listArtifacts(params: ListArtifactsRequest): Request[ListArtifactsResult] = js.native
    def listDeviceInstances(params: ListDeviceInstancesRequest): Request[ListDeviceInstancesResult] = js.native
    def listDevicePools(params: ListDevicePoolsRequest): Request[ListDevicePoolsResult] = js.native
    def listDevices(params: ListDevicesRequest): Request[ListDevicesResult] = js.native
    def listInstanceProfiles(params: ListInstanceProfilesRequest): Request[ListInstanceProfilesResult] = js.native
    def listJobs(params: ListJobsRequest): Request[ListJobsResult] = js.native
    def listNetworkProfiles(params: ListNetworkProfilesRequest): Request[ListNetworkProfilesResult] = js.native
    def listOfferingPromotions(params: ListOfferingPromotionsRequest): Request[ListOfferingPromotionsResult] = js.native
    def listOfferingTransactions(params: ListOfferingTransactionsRequest): Request[ListOfferingTransactionsResult] = js.native
    def listOfferings(params: ListOfferingsRequest): Request[ListOfferingsResult] = js.native
    def listProjects(params: ListProjectsRequest): Request[ListProjectsResult] = js.native
    def listRemoteAccessSessions(params: ListRemoteAccessSessionsRequest): Request[ListRemoteAccessSessionsResult] = js.native
    def listRuns(params: ListRunsRequest): Request[ListRunsResult] = js.native
    def listSamples(params: ListSamplesRequest): Request[ListSamplesResult] = js.native
    def listSuites(params: ListSuitesRequest): Request[ListSuitesResult] = js.native
    def listTests(params: ListTestsRequest): Request[ListTestsResult] = js.native
    def listUniqueProblems(params: ListUniqueProblemsRequest): Request[ListUniqueProblemsResult] = js.native
    def listUploads(params: ListUploadsRequest): Request[ListUploadsResult] = js.native
    def listVPCEConfigurations(params: ListVPCEConfigurationsRequest): Request[ListVPCEConfigurationsResult] = js.native
    def purchaseOffering(params: PurchaseOfferingRequest): Request[PurchaseOfferingResult] = js.native
    def renewOffering(params: RenewOfferingRequest): Request[RenewOfferingResult] = js.native
    def scheduleRun(params: ScheduleRunRequest): Request[ScheduleRunResult] = js.native
    def stopJob(params: StopJobRequest): Request[StopJobResult] = js.native
    def stopRemoteAccessSession(params: StopRemoteAccessSessionRequest): Request[StopRemoteAccessSessionResult] = js.native
    def stopRun(params: StopRunRequest): Request[StopRunResult] = js.native
    def updateDeviceInstance(params: UpdateDeviceInstanceRequest): Request[UpdateDeviceInstanceResult] = js.native
    def updateDevicePool(params: UpdateDevicePoolRequest): Request[UpdateDevicePoolResult] = js.native
    def updateInstanceProfile(params: UpdateInstanceProfileRequest): Request[UpdateInstanceProfileResult] = js.native
    def updateNetworkProfile(params: UpdateNetworkProfileRequest): Request[UpdateNetworkProfileResult] = js.native
    def updateProject(params: UpdateProjectRequest): Request[UpdateProjectResult] = js.native
    def updateUpload(params: UpdateUploadRequest): Request[UpdateUploadResult] = js.native
    def updateVPCEConfiguration(params: UpdateVPCEConfigurationRequest): Request[UpdateVPCEConfigurationResult] = js.native
  }

  /**
   * <p>A container for account-level settings within AWS Device Farm.</p>
   */
  @js.native
  trait AccountSettings extends js.Object {
    var maxJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes]
    var defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes]
    var trialMinutes: js.UndefOr[TrialMinutes]
    var unmeteredDevices: js.UndefOr[PurchasedDevicesMap]
    var skipAppResign: js.UndefOr[SkipAppResign]
    var unmeteredRemoteAccessDevices: js.UndefOr[PurchasedDevicesMap]
    var awsAccountNumber: js.UndefOr[AWSAccountNumber]
    var maxSlots: js.UndefOr[MaxSlotMap]
  }

  object AccountSettings {
    def apply(
      maxJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.undefined,
      defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.undefined,
      trialMinutes: js.UndefOr[TrialMinutes] = js.undefined,
      unmeteredDevices: js.UndefOr[PurchasedDevicesMap] = js.undefined,
      skipAppResign: js.UndefOr[SkipAppResign] = js.undefined,
      unmeteredRemoteAccessDevices: js.UndefOr[PurchasedDevicesMap] = js.undefined,
      awsAccountNumber: js.UndefOr[AWSAccountNumber] = js.undefined,
      maxSlots: js.UndefOr[MaxSlotMap] = js.undefined): AccountSettings = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxJobTimeoutMinutes" -> maxJobTimeoutMinutes.map { x => x.asInstanceOf[js.Any] },
        "defaultJobTimeoutMinutes" -> defaultJobTimeoutMinutes.map { x => x.asInstanceOf[js.Any] },
        "trialMinutes" -> trialMinutes.map { x => x.asInstanceOf[js.Any] },
        "unmeteredDevices" -> unmeteredDevices.map { x => x.asInstanceOf[js.Any] },
        "skipAppResign" -> skipAppResign.map { x => x.asInstanceOf[js.Any] },
        "unmeteredRemoteAccessDevices" -> unmeteredRemoteAccessDevices.map { x => x.asInstanceOf[js.Any] },
        "awsAccountNumber" -> awsAccountNumber.map { x => x.asInstanceOf[js.Any] },
        "maxSlots" -> maxSlots.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AccountSettings]
    }
  }

  /**
   * <p>An invalid argument was specified.</p>
   */
  @js.native
  trait ArgumentExceptionException extends js.Object {
    val message: Message
  }

  /**
   * <p>Represents the output of a test. Examples of artifacts include logs and screenshots.</p>
   */
  @js.native
  trait Artifact extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var name: js.UndefOr[Name]
    var url: js.UndefOr[URL]
    var `type`: js.UndefOr[ArtifactType]
    var extension: js.UndefOr[String]
  }

  object Artifact {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      url: js.UndefOr[URL] = js.undefined,
      `type`: js.UndefOr[ArtifactType] = js.undefined,
      extension: js.UndefOr[String] = js.undefined): Artifact = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "url" -> url.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "extension" -> extension.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Artifact]
    }
  }

  object ArtifactCategoryEnum {
    val SCREENSHOT = "SCREENSHOT"
    val FILE = "FILE"
    val LOG = "LOG"

    val values = IndexedSeq(SCREENSHOT, FILE, LOG)
  }

  object ArtifactTypeEnum {
    val UNKNOWN = "UNKNOWN"
    val SCREENSHOT = "SCREENSHOT"
    val DEVICE_LOG = "DEVICE_LOG"
    val MESSAGE_LOG = "MESSAGE_LOG"
    val VIDEO_LOG = "VIDEO_LOG"
    val RESULT_LOG = "RESULT_LOG"
    val SERVICE_LOG = "SERVICE_LOG"
    val WEBKIT_LOG = "WEBKIT_LOG"
    val INSTRUMENTATION_OUTPUT = "INSTRUMENTATION_OUTPUT"
    val EXERCISER_MONKEY_OUTPUT = "EXERCISER_MONKEY_OUTPUT"
    val CALABASH_JSON_OUTPUT = "CALABASH_JSON_OUTPUT"
    val CALABASH_PRETTY_OUTPUT = "CALABASH_PRETTY_OUTPUT"
    val CALABASH_STANDARD_OUTPUT = "CALABASH_STANDARD_OUTPUT"
    val CALABASH_JAVA_XML_OUTPUT = "CALABASH_JAVA_XML_OUTPUT"
    val AUTOMATION_OUTPUT = "AUTOMATION_OUTPUT"
    val APPIUM_SERVER_OUTPUT = "APPIUM_SERVER_OUTPUT"
    val APPIUM_JAVA_OUTPUT = "APPIUM_JAVA_OUTPUT"
    val APPIUM_JAVA_XML_OUTPUT = "APPIUM_JAVA_XML_OUTPUT"
    val APPIUM_PYTHON_OUTPUT = "APPIUM_PYTHON_OUTPUT"
    val APPIUM_PYTHON_XML_OUTPUT = "APPIUM_PYTHON_XML_OUTPUT"
    val EXPLORER_EVENT_LOG = "EXPLORER_EVENT_LOG"
    val EXPLORER_SUMMARY_LOG = "EXPLORER_SUMMARY_LOG"
    val APPLICATION_CRASH_REPORT = "APPLICATION_CRASH_REPORT"
    val XCTEST_LOG = "XCTEST_LOG"
    val VIDEO = "VIDEO"
    val CUSTOMER_ARTIFACT = "CUSTOMER_ARTIFACT"
    val CUSTOMER_ARTIFACT_LOG = "CUSTOMER_ARTIFACT_LOG"
    val TESTSPEC_OUTPUT = "TESTSPEC_OUTPUT"

    val values = IndexedSeq(UNKNOWN, SCREENSHOT, DEVICE_LOG, MESSAGE_LOG, VIDEO_LOG, RESULT_LOG, SERVICE_LOG, WEBKIT_LOG, INSTRUMENTATION_OUTPUT, EXERCISER_MONKEY_OUTPUT, CALABASH_JSON_OUTPUT, CALABASH_PRETTY_OUTPUT, CALABASH_STANDARD_OUTPUT, CALABASH_JAVA_XML_OUTPUT, AUTOMATION_OUTPUT, APPIUM_SERVER_OUTPUT, APPIUM_JAVA_OUTPUT, APPIUM_JAVA_XML_OUTPUT, APPIUM_PYTHON_OUTPUT, APPIUM_PYTHON_XML_OUTPUT, EXPLORER_EVENT_LOG, EXPLORER_SUMMARY_LOG, APPLICATION_CRASH_REPORT, XCTEST_LOG, VIDEO, CUSTOMER_ARTIFACT, CUSTOMER_ARTIFACT_LOG, TESTSPEC_OUTPUT)
  }

  object BillingMethodEnum {
    val METERED = "METERED"
    val UNMETERED = "UNMETERED"

    val values = IndexedSeq(METERED, UNMETERED)
  }

  /**
   * <p>Represents the amount of CPU that an app is using on a physical device.</p> <p>Note that this does not represent system-wide CPU usage.</p>
   */
  @js.native
  trait CPU extends js.Object {
    var frequency: js.UndefOr[String]
    var architecture: js.UndefOr[String]
    var clock: js.UndefOr[Double]
  }

  object CPU {
    def apply(
      frequency: js.UndefOr[String] = js.undefined,
      architecture: js.UndefOr[String] = js.undefined,
      clock: js.UndefOr[Double] = js.undefined): CPU = {
      val _fields = IndexedSeq[(String, js.Any)](
        "frequency" -> frequency.map { x => x.asInstanceOf[js.Any] },
        "architecture" -> architecture.map { x => x.asInstanceOf[js.Any] },
        "clock" -> clock.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CPU]
    }
  }

  /**
   * <p>Represents entity counters.</p>
   */
  @js.native
  trait Counters extends js.Object {
    var failed: js.UndefOr[Int]
    var passed: js.UndefOr[Int]
    var skipped: js.UndefOr[Int]
    var total: js.UndefOr[Int]
    var errored: js.UndefOr[Int]
    var stopped: js.UndefOr[Int]
    var warned: js.UndefOr[Int]
  }

  object Counters {
    def apply(
      failed: js.UndefOr[Int] = js.undefined,
      passed: js.UndefOr[Int] = js.undefined,
      skipped: js.UndefOr[Int] = js.undefined,
      total: js.UndefOr[Int] = js.undefined,
      errored: js.UndefOr[Int] = js.undefined,
      stopped: js.UndefOr[Int] = js.undefined,
      warned: js.UndefOr[Int] = js.undefined): Counters = {
      val _fields = IndexedSeq[(String, js.Any)](
        "failed" -> failed.map { x => x.asInstanceOf[js.Any] },
        "passed" -> passed.map { x => x.asInstanceOf[js.Any] },
        "skipped" -> skipped.map { x => x.asInstanceOf[js.Any] },
        "total" -> total.map { x => x.asInstanceOf[js.Any] },
        "errored" -> errored.map { x => x.asInstanceOf[js.Any] },
        "stopped" -> stopped.map { x => x.asInstanceOf[js.Any] },
        "warned" -> warned.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Counters]
    }
  }

  /**
   * <p>Represents a request to the create device pool operation.</p>
   */
  @js.native
  trait CreateDevicePoolRequest extends js.Object {
    var projectArn: js.UndefOr[AmazonResourceName]
    var name: js.UndefOr[Name]
    var description: js.UndefOr[Message]
    var rules: js.UndefOr[Rules]
  }

  object CreateDevicePoolRequest {
    def apply(
      projectArn: js.UndefOr[AmazonResourceName] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      description: js.UndefOr[Message] = js.undefined,
      rules: js.UndefOr[Rules] = js.undefined): CreateDevicePoolRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "projectArn" -> projectArn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "rules" -> rules.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDevicePoolRequest]
    }
  }

  /**
   * <p>Represents the result of a create device pool request.</p>
   */
  @js.native
  trait CreateDevicePoolResult extends js.Object {
    var devicePool: js.UndefOr[DevicePool]
  }

  object CreateDevicePoolResult {
    def apply(
      devicePool: js.UndefOr[DevicePool] = js.undefined): CreateDevicePoolResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "devicePool" -> devicePool.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDevicePoolResult]
    }
  }

  @js.native
  trait CreateInstanceProfileRequest extends js.Object {
    var name: js.UndefOr[Name]
    var description: js.UndefOr[Message]
    var packageCleanup: js.UndefOr[Boolean]
    var excludeAppPackagesFromCleanup: js.UndefOr[PackageIds]
    var rebootAfterUse: js.UndefOr[Boolean]
  }

  object CreateInstanceProfileRequest {
    def apply(
      name: js.UndefOr[Name] = js.undefined,
      description: js.UndefOr[Message] = js.undefined,
      packageCleanup: js.UndefOr[Boolean] = js.undefined,
      excludeAppPackagesFromCleanup: js.UndefOr[PackageIds] = js.undefined,
      rebootAfterUse: js.UndefOr[Boolean] = js.undefined): CreateInstanceProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "packageCleanup" -> packageCleanup.map { x => x.asInstanceOf[js.Any] },
        "excludeAppPackagesFromCleanup" -> excludeAppPackagesFromCleanup.map { x => x.asInstanceOf[js.Any] },
        "rebootAfterUse" -> rebootAfterUse.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInstanceProfileRequest]
    }
  }

  @js.native
  trait CreateInstanceProfileResult extends js.Object {
    var instanceProfile: js.UndefOr[InstanceProfile]
  }

  object CreateInstanceProfileResult {
    def apply(
      instanceProfile: js.UndefOr[InstanceProfile] = js.undefined): CreateInstanceProfileResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceProfile" -> instanceProfile.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateInstanceProfileResult]
    }
  }

  @js.native
  trait CreateNetworkProfileRequest extends js.Object {
    var name: js.UndefOr[Name]
    var downlinkDelayMs: js.UndefOr[Double]
    var uplinkLossPercent: js.UndefOr[PercentInteger]
    var projectArn: js.UndefOr[AmazonResourceName]
    var description: js.UndefOr[Message]
    var downlinkLossPercent: js.UndefOr[PercentInteger]
    var uplinkJitterMs: js.UndefOr[Double]
    var uplinkBandwidthBits: js.UndefOr[Double]
    var uplinkDelayMs: js.UndefOr[Double]
    var `type`: js.UndefOr[NetworkProfileType]
    var downlinkJitterMs: js.UndefOr[Double]
    var downlinkBandwidthBits: js.UndefOr[Double]
  }

  object CreateNetworkProfileRequest {
    def apply(
      name: js.UndefOr[Name] = js.undefined,
      downlinkDelayMs: js.UndefOr[Double] = js.undefined,
      uplinkLossPercent: js.UndefOr[PercentInteger] = js.undefined,
      projectArn: js.UndefOr[AmazonResourceName] = js.undefined,
      description: js.UndefOr[Message] = js.undefined,
      downlinkLossPercent: js.UndefOr[PercentInteger] = js.undefined,
      uplinkJitterMs: js.UndefOr[Double] = js.undefined,
      uplinkBandwidthBits: js.UndefOr[Double] = js.undefined,
      uplinkDelayMs: js.UndefOr[Double] = js.undefined,
      `type`: js.UndefOr[NetworkProfileType] = js.undefined,
      downlinkJitterMs: js.UndefOr[Double] = js.undefined,
      downlinkBandwidthBits: js.UndefOr[Double] = js.undefined): CreateNetworkProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "downlinkDelayMs" -> downlinkDelayMs.map { x => x.asInstanceOf[js.Any] },
        "uplinkLossPercent" -> uplinkLossPercent.map { x => x.asInstanceOf[js.Any] },
        "projectArn" -> projectArn.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "downlinkLossPercent" -> downlinkLossPercent.map { x => x.asInstanceOf[js.Any] },
        "uplinkJitterMs" -> uplinkJitterMs.map { x => x.asInstanceOf[js.Any] },
        "uplinkBandwidthBits" -> uplinkBandwidthBits.map { x => x.asInstanceOf[js.Any] },
        "uplinkDelayMs" -> uplinkDelayMs.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "downlinkJitterMs" -> downlinkJitterMs.map { x => x.asInstanceOf[js.Any] },
        "downlinkBandwidthBits" -> downlinkBandwidthBits.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNetworkProfileRequest]
    }
  }

  @js.native
  trait CreateNetworkProfileResult extends js.Object {
    var networkProfile: js.UndefOr[NetworkProfile]
  }

  object CreateNetworkProfileResult {
    def apply(
      networkProfile: js.UndefOr[NetworkProfile] = js.undefined): CreateNetworkProfileResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "networkProfile" -> networkProfile.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateNetworkProfileResult]
    }
  }

  /**
   * <p>Represents a request to the create project operation.</p>
   */
  @js.native
  trait CreateProjectRequest extends js.Object {
    var name: js.UndefOr[Name]
    var defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes]
  }

  object CreateProjectRequest {
    def apply(
      name: js.UndefOr[Name] = js.undefined,
      defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.undefined): CreateProjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "defaultJobTimeoutMinutes" -> defaultJobTimeoutMinutes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateProjectRequest]
    }
  }

  /**
   * <p>Represents the result of a create project request.</p>
   */
  @js.native
  trait CreateProjectResult extends js.Object {
    var project: js.UndefOr[Project]
  }

  object CreateProjectResult {
    def apply(
      project: js.UndefOr[Project] = js.undefined): CreateProjectResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "project" -> project.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateProjectResult]
    }
  }

  /**
   * <p>Configuration settings for a remote access session, including billing method.</p>
   */
  @js.native
  trait CreateRemoteAccessSessionConfiguration extends js.Object {
    var billingMethod: js.UndefOr[BillingMethod]
    var vpceConfigurationArns: js.UndefOr[AmazonResourceNames]
  }

  object CreateRemoteAccessSessionConfiguration {
    def apply(
      billingMethod: js.UndefOr[BillingMethod] = js.undefined,
      vpceConfigurationArns: js.UndefOr[AmazonResourceNames] = js.undefined): CreateRemoteAccessSessionConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "billingMethod" -> billingMethod.map { x => x.asInstanceOf[js.Any] },
        "vpceConfigurationArns" -> vpceConfigurationArns.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRemoteAccessSessionConfiguration]
    }
  }

  /**
   * <p>Creates and submits a request to start a remote access session.</p>
   */
  @js.native
  trait CreateRemoteAccessSessionRequest extends js.Object {
    var sshPublicKey: js.UndefOr[SshPublicKey]
    var name: js.UndefOr[Name]
    var clientId: js.UndefOr[ClientId]
    var projectArn: js.UndefOr[AmazonResourceName]
    var deviceArn: js.UndefOr[AmazonResourceName]
    var remoteRecordEnabled: js.UndefOr[Boolean]
    var skipAppResign: js.UndefOr[Boolean]
    var remoteDebugEnabled: js.UndefOr[Boolean]
    var configuration: js.UndefOr[CreateRemoteAccessSessionConfiguration]
    var interactionMode: js.UndefOr[InteractionMode]
    var remoteRecordAppArn: js.UndefOr[AmazonResourceName]
    var instanceArn: js.UndefOr[AmazonResourceName]
  }

  object CreateRemoteAccessSessionRequest {
    def apply(
      sshPublicKey: js.UndefOr[SshPublicKey] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      clientId: js.UndefOr[ClientId] = js.undefined,
      projectArn: js.UndefOr[AmazonResourceName] = js.undefined,
      deviceArn: js.UndefOr[AmazonResourceName] = js.undefined,
      remoteRecordEnabled: js.UndefOr[Boolean] = js.undefined,
      skipAppResign: js.UndefOr[Boolean] = js.undefined,
      remoteDebugEnabled: js.UndefOr[Boolean] = js.undefined,
      configuration: js.UndefOr[CreateRemoteAccessSessionConfiguration] = js.undefined,
      interactionMode: js.UndefOr[InteractionMode] = js.undefined,
      remoteRecordAppArn: js.UndefOr[AmazonResourceName] = js.undefined,
      instanceArn: js.UndefOr[AmazonResourceName] = js.undefined): CreateRemoteAccessSessionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "sshPublicKey" -> sshPublicKey.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "clientId" -> clientId.map { x => x.asInstanceOf[js.Any] },
        "projectArn" -> projectArn.map { x => x.asInstanceOf[js.Any] },
        "deviceArn" -> deviceArn.map { x => x.asInstanceOf[js.Any] },
        "remoteRecordEnabled" -> remoteRecordEnabled.map { x => x.asInstanceOf[js.Any] },
        "skipAppResign" -> skipAppResign.map { x => x.asInstanceOf[js.Any] },
        "remoteDebugEnabled" -> remoteDebugEnabled.map { x => x.asInstanceOf[js.Any] },
        "configuration" -> configuration.map { x => x.asInstanceOf[js.Any] },
        "interactionMode" -> interactionMode.map { x => x.asInstanceOf[js.Any] },
        "remoteRecordAppArn" -> remoteRecordAppArn.map { x => x.asInstanceOf[js.Any] },
        "instanceArn" -> instanceArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRemoteAccessSessionRequest]
    }
  }

  /**
   * <p>Represents the server response from a request to create a remote access session.</p>
   */
  @js.native
  trait CreateRemoteAccessSessionResult extends js.Object {
    var remoteAccessSession: js.UndefOr[RemoteAccessSession]
  }

  object CreateRemoteAccessSessionResult {
    def apply(
      remoteAccessSession: js.UndefOr[RemoteAccessSession] = js.undefined): CreateRemoteAccessSessionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "remoteAccessSession" -> remoteAccessSession.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRemoteAccessSessionResult]
    }
  }

  /**
   * <p>Represents a request to the create upload operation.</p>
   */
  @js.native
  trait CreateUploadRequest extends js.Object {
    var projectArn: js.UndefOr[AmazonResourceName]
    var name: js.UndefOr[Name]
    var `type`: js.UndefOr[UploadType]
    var contentType: js.UndefOr[ContentType]
  }

  object CreateUploadRequest {
    def apply(
      projectArn: js.UndefOr[AmazonResourceName] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      `type`: js.UndefOr[UploadType] = js.undefined,
      contentType: js.UndefOr[ContentType] = js.undefined): CreateUploadRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "projectArn" -> projectArn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "contentType" -> contentType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUploadRequest]
    }
  }

  /**
   * <p>Represents the result of a create upload request.</p>
   */
  @js.native
  trait CreateUploadResult extends js.Object {
    var upload: js.UndefOr[Upload]
  }

  object CreateUploadResult {
    def apply(
      upload: js.UndefOr[Upload] = js.undefined): CreateUploadResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "upload" -> upload.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUploadResult]
    }
  }

  @js.native
  trait CreateVPCEConfigurationRequest extends js.Object {
    var vpceConfigurationName: js.UndefOr[VPCEConfigurationName]
    var vpceServiceName: js.UndefOr[VPCEServiceName]
    var serviceDnsName: js.UndefOr[ServiceDnsName]
    var vpceConfigurationDescription: js.UndefOr[VPCEConfigurationDescription]
  }

  object CreateVPCEConfigurationRequest {
    def apply(
      vpceConfigurationName: js.UndefOr[VPCEConfigurationName] = js.undefined,
      vpceServiceName: js.UndefOr[VPCEServiceName] = js.undefined,
      serviceDnsName: js.UndefOr[ServiceDnsName] = js.undefined,
      vpceConfigurationDescription: js.UndefOr[VPCEConfigurationDescription] = js.undefined): CreateVPCEConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "vpceConfigurationName" -> vpceConfigurationName.map { x => x.asInstanceOf[js.Any] },
        "vpceServiceName" -> vpceServiceName.map { x => x.asInstanceOf[js.Any] },
        "serviceDnsName" -> serviceDnsName.map { x => x.asInstanceOf[js.Any] },
        "vpceConfigurationDescription" -> vpceConfigurationDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVPCEConfigurationRequest]
    }
  }

  @js.native
  trait CreateVPCEConfigurationResult extends js.Object {
    var vpceConfiguration: js.UndefOr[VPCEConfiguration]
  }

  object CreateVPCEConfigurationResult {
    def apply(
      vpceConfiguration: js.UndefOr[VPCEConfiguration] = js.undefined): CreateVPCEConfigurationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "vpceConfiguration" -> vpceConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVPCEConfigurationResult]
    }
  }

  object CurrencyCodeEnum {
    val USD = "USD"

    val values = IndexedSeq(USD)
  }

  /**
   * <p>A JSON object specifying the paths where the artifacts generated by the customer's tests, on the device or in the test environment, will be pulled from.</p> <p>Specify <code>deviceHostPaths</code> and optionally specify either <code>iosPaths</code> or <code>androidPaths</code>.</p> <p>For web app tests, you can specify both <code>iosPaths</code> and <code>androidPaths</code>.</p>
   */
  @js.native
  trait CustomerArtifactPaths extends js.Object {
    var iosPaths: js.UndefOr[IosPaths]
    var androidPaths: js.UndefOr[AndroidPaths]
    var deviceHostPaths: js.UndefOr[DeviceHostPaths]
  }

  object CustomerArtifactPaths {
    def apply(
      iosPaths: js.UndefOr[IosPaths] = js.undefined,
      androidPaths: js.UndefOr[AndroidPaths] = js.undefined,
      deviceHostPaths: js.UndefOr[DeviceHostPaths] = js.undefined): CustomerArtifactPaths = {
      val _fields = IndexedSeq[(String, js.Any)](
        "iosPaths" -> iosPaths.map { x => x.asInstanceOf[js.Any] },
        "androidPaths" -> androidPaths.map { x => x.asInstanceOf[js.Any] },
        "deviceHostPaths" -> deviceHostPaths.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CustomerArtifactPaths]
    }
  }

  /**
   * <p>Represents a request to the delete device pool operation.</p>
   */
  @js.native
  trait DeleteDevicePoolRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
  }

  object DeleteDevicePoolRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined): DeleteDevicePoolRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDevicePoolRequest]
    }
  }

  /**
   * <p>Represents the result of a delete device pool request.</p>
   */
  @js.native
  trait DeleteDevicePoolResult extends js.Object {

  }

  object DeleteDevicePoolResult {
    def apply(): DeleteDevicePoolResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDevicePoolResult]
    }
  }

  @js.native
  trait DeleteInstanceProfileRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
  }

  object DeleteInstanceProfileRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined): DeleteInstanceProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteInstanceProfileRequest]
    }
  }

  @js.native
  trait DeleteInstanceProfileResult extends js.Object {

  }

  object DeleteInstanceProfileResult {
    def apply(): DeleteInstanceProfileResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteInstanceProfileResult]
    }
  }

  @js.native
  trait DeleteNetworkProfileRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
  }

  object DeleteNetworkProfileRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined): DeleteNetworkProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteNetworkProfileRequest]
    }
  }

  @js.native
  trait DeleteNetworkProfileResult extends js.Object {

  }

  object DeleteNetworkProfileResult {
    def apply(): DeleteNetworkProfileResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteNetworkProfileResult]
    }
  }

  /**
   * <p>Represents a request to the delete project operation.</p>
   */
  @js.native
  trait DeleteProjectRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
  }

  object DeleteProjectRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined): DeleteProjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteProjectRequest]
    }
  }

  /**
   * <p>Represents the result of a delete project request.</p>
   */
  @js.native
  trait DeleteProjectResult extends js.Object {

  }

  object DeleteProjectResult {
    def apply(): DeleteProjectResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteProjectResult]
    }
  }

  /**
   * <p>Represents the request to delete the specified remote access session.</p>
   */
  @js.native
  trait DeleteRemoteAccessSessionRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
  }

  object DeleteRemoteAccessSessionRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined): DeleteRemoteAccessSessionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRemoteAccessSessionRequest]
    }
  }

  /**
   * <p>The response from the server when a request is made to delete the remote access session.</p>
   */
  @js.native
  trait DeleteRemoteAccessSessionResult extends js.Object {

  }

  object DeleteRemoteAccessSessionResult {
    def apply(): DeleteRemoteAccessSessionResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRemoteAccessSessionResult]
    }
  }

  /**
   * <p>Represents a request to the delete run operation.</p>
   */
  @js.native
  trait DeleteRunRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
  }

  object DeleteRunRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined): DeleteRunRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRunRequest]
    }
  }

  /**
   * <p>Represents the result of a delete run request.</p>
   */
  @js.native
  trait DeleteRunResult extends js.Object {

  }

  object DeleteRunResult {
    def apply(): DeleteRunResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRunResult]
    }
  }

  /**
   * <p>Represents a request to the delete upload operation.</p>
   */
  @js.native
  trait DeleteUploadRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
  }

  object DeleteUploadRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined): DeleteUploadRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUploadRequest]
    }
  }

  /**
   * <p>Represents the result of a delete upload request.</p>
   */
  @js.native
  trait DeleteUploadResult extends js.Object {

  }

  object DeleteUploadResult {
    def apply(): DeleteUploadResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUploadResult]
    }
  }

  @js.native
  trait DeleteVPCEConfigurationRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
  }

  object DeleteVPCEConfigurationRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined): DeleteVPCEConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVPCEConfigurationRequest]
    }
  }

  @js.native
  trait DeleteVPCEConfigurationResult extends js.Object {

  }

  object DeleteVPCEConfigurationResult {
    def apply(): DeleteVPCEConfigurationResult = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVPCEConfigurationResult]
    }
  }

  /**
   * <p>Represents a device type that an app is tested against.</p>
   */
  @js.native
  trait Device extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var name: js.UndefOr[Name]
    var heapSize: js.UndefOr[Double]
    var carrier: js.UndefOr[String]
    var model: js.UndefOr[String]
    var radio: js.UndefOr[String]
    var image: js.UndefOr[String]
    var modelId: js.UndefOr[String]
    var os: js.UndefOr[String]
    var instances: js.UndefOr[DeviceInstances]
    var remoteDebugEnabled: js.UndefOr[Boolean]
    var resolution: js.UndefOr[Resolution]
    var fleetName: js.UndefOr[String]
    var cpu: js.UndefOr[CPU]
    var remoteAccessEnabled: js.UndefOr[Boolean]
    var fleetType: js.UndefOr[String]
    var formFactor: js.UndefOr[DeviceFormFactor]
    var manufacturer: js.UndefOr[String]
    var platform: js.UndefOr[DevicePlatform]
    var memory: js.UndefOr[Double]
  }

  object Device {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      heapSize: js.UndefOr[Double] = js.undefined,
      carrier: js.UndefOr[String] = js.undefined,
      model: js.UndefOr[String] = js.undefined,
      radio: js.UndefOr[String] = js.undefined,
      image: js.UndefOr[String] = js.undefined,
      modelId: js.UndefOr[String] = js.undefined,
      os: js.UndefOr[String] = js.undefined,
      instances: js.UndefOr[DeviceInstances] = js.undefined,
      remoteDebugEnabled: js.UndefOr[Boolean] = js.undefined,
      resolution: js.UndefOr[Resolution] = js.undefined,
      fleetName: js.UndefOr[String] = js.undefined,
      cpu: js.UndefOr[CPU] = js.undefined,
      remoteAccessEnabled: js.UndefOr[Boolean] = js.undefined,
      fleetType: js.UndefOr[String] = js.undefined,
      formFactor: js.UndefOr[DeviceFormFactor] = js.undefined,
      manufacturer: js.UndefOr[String] = js.undefined,
      platform: js.UndefOr[DevicePlatform] = js.undefined,
      memory: js.UndefOr[Double] = js.undefined): Device = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "heapSize" -> heapSize.map { x => x.asInstanceOf[js.Any] },
        "carrier" -> carrier.map { x => x.asInstanceOf[js.Any] },
        "model" -> model.map { x => x.asInstanceOf[js.Any] },
        "radio" -> radio.map { x => x.asInstanceOf[js.Any] },
        "image" -> image.map { x => x.asInstanceOf[js.Any] },
        "modelId" -> modelId.map { x => x.asInstanceOf[js.Any] },
        "os" -> os.map { x => x.asInstanceOf[js.Any] },
        "instances" -> instances.map { x => x.asInstanceOf[js.Any] },
        "remoteDebugEnabled" -> remoteDebugEnabled.map { x => x.asInstanceOf[js.Any] },
        "resolution" -> resolution.map { x => x.asInstanceOf[js.Any] },
        "fleetName" -> fleetName.map { x => x.asInstanceOf[js.Any] },
        "cpu" -> cpu.map { x => x.asInstanceOf[js.Any] },
        "remoteAccessEnabled" -> remoteAccessEnabled.map { x => x.asInstanceOf[js.Any] },
        "fleetType" -> fleetType.map { x => x.asInstanceOf[js.Any] },
        "formFactor" -> formFactor.map { x => x.asInstanceOf[js.Any] },
        "manufacturer" -> manufacturer.map { x => x.asInstanceOf[js.Any] },
        "platform" -> platform.map { x => x.asInstanceOf[js.Any] },
        "memory" -> memory.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Device]
    }
  }

  object DeviceAttributeEnum {
    val ARN = "ARN"
    val PLATFORM = "PLATFORM"
    val FORM_FACTOR = "FORM_FACTOR"
    val MANUFACTURER = "MANUFACTURER"
    val REMOTE_ACCESS_ENABLED = "REMOTE_ACCESS_ENABLED"
    val REMOTE_DEBUG_ENABLED = "REMOTE_DEBUG_ENABLED"
    val APPIUM_VERSION = "APPIUM_VERSION"
    val INSTANCE_ARN = "INSTANCE_ARN"
    val INSTANCE_LABELS = "INSTANCE_LABELS"
    val FLEET_TYPE = "FLEET_TYPE"

    val values = IndexedSeq(ARN, PLATFORM, FORM_FACTOR, MANUFACTURER, REMOTE_ACCESS_ENABLED, REMOTE_DEBUG_ENABLED, APPIUM_VERSION, INSTANCE_ARN, INSTANCE_LABELS, FLEET_TYPE)
  }

  object DeviceFormFactorEnum {
    val PHONE = "PHONE"
    val TABLET = "TABLET"

    val values = IndexedSeq(PHONE, TABLET)
  }

  /**
   * <p>Represents the device instance.</p>
   */
  @js.native
  trait DeviceInstance extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var deviceArn: js.UndefOr[AmazonResourceName]
    var udid: js.UndefOr[String]
    var labels: js.UndefOr[InstanceLabels]
    var status: js.UndefOr[InstanceStatus]
    var instanceProfile: js.UndefOr[InstanceProfile]
  }

  object DeviceInstance {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      deviceArn: js.UndefOr[AmazonResourceName] = js.undefined,
      udid: js.UndefOr[String] = js.undefined,
      labels: js.UndefOr[InstanceLabels] = js.undefined,
      status: js.UndefOr[InstanceStatus] = js.undefined,
      instanceProfile: js.UndefOr[InstanceProfile] = js.undefined): DeviceInstance = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "deviceArn" -> deviceArn.map { x => x.asInstanceOf[js.Any] },
        "udid" -> udid.map { x => x.asInstanceOf[js.Any] },
        "labels" -> labels.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "instanceProfile" -> instanceProfile.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeviceInstance]
    }
  }

  /**
   * <p>Represents the total (metered or unmetered) minutes used by the resource to run tests. Contains the sum of minutes consumed by all children.</p>
   */
  @js.native
  trait DeviceMinutes extends js.Object {
    var total: js.UndefOr[Double]
    var metered: js.UndefOr[Double]
    var unmetered: js.UndefOr[Double]
  }

  object DeviceMinutes {
    def apply(
      total: js.UndefOr[Double] = js.undefined,
      metered: js.UndefOr[Double] = js.undefined,
      unmetered: js.UndefOr[Double] = js.undefined): DeviceMinutes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "total" -> total.map { x => x.asInstanceOf[js.Any] },
        "metered" -> metered.map { x => x.asInstanceOf[js.Any] },
        "unmetered" -> unmetered.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeviceMinutes]
    }
  }

  object DevicePlatformEnum {
    val ANDROID = "ANDROID"
    val IOS = "IOS"

    val values = IndexedSeq(ANDROID, IOS)
  }

  /**
   * <p>Represents a collection of device types.</p>
   */
  @js.native
  trait DevicePool extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var name: js.UndefOr[Name]
    var description: js.UndefOr[Message]
    var rules: js.UndefOr[Rules]
    var `type`: js.UndefOr[DevicePoolType]
  }

  object DevicePool {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      description: js.UndefOr[Message] = js.undefined,
      rules: js.UndefOr[Rules] = js.undefined,
      `type`: js.UndefOr[DevicePoolType] = js.undefined): DevicePool = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "rules" -> rules.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DevicePool]
    }
  }

  /**
   * <p>Represents a device pool compatibility result.</p>
   */
  @js.native
  trait DevicePoolCompatibilityResult extends js.Object {
    var device: js.UndefOr[Device]
    var compatible: js.UndefOr[Boolean]
    var incompatibilityMessages: js.UndefOr[IncompatibilityMessages]
  }

  object DevicePoolCompatibilityResult {
    def apply(
      device: js.UndefOr[Device] = js.undefined,
      compatible: js.UndefOr[Boolean] = js.undefined,
      incompatibilityMessages: js.UndefOr[IncompatibilityMessages] = js.undefined): DevicePoolCompatibilityResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "device" -> device.map { x => x.asInstanceOf[js.Any] },
        "compatible" -> compatible.map { x => x.asInstanceOf[js.Any] },
        "incompatibilityMessages" -> incompatibilityMessages.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DevicePoolCompatibilityResult]
    }
  }

  object DevicePoolTypeEnum {
    val CURATED = "CURATED"
    val PRIVATE = "PRIVATE"

    val values = IndexedSeq(CURATED, PRIVATE)
  }

  /**
   * <p>Represents configuration information about a test run, such as the execution timeout (in minutes).</p>
   */
  @js.native
  trait ExecutionConfiguration extends js.Object {
    var accountsCleanup: js.UndefOr[AccountsCleanup]
    var skipAppResign: js.UndefOr[SkipAppResign]
    var jobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes]
    var videoCapture: js.UndefOr[VideoCapture]
    var appPackagesCleanup: js.UndefOr[AppPackagesCleanup]
  }

  object ExecutionConfiguration {
    def apply(
      accountsCleanup: js.UndefOr[AccountsCleanup] = js.undefined,
      skipAppResign: js.UndefOr[SkipAppResign] = js.undefined,
      jobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.undefined,
      videoCapture: js.UndefOr[VideoCapture] = js.undefined,
      appPackagesCleanup: js.UndefOr[AppPackagesCleanup] = js.undefined): ExecutionConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountsCleanup" -> accountsCleanup.map { x => x.asInstanceOf[js.Any] },
        "skipAppResign" -> skipAppResign.map { x => x.asInstanceOf[js.Any] },
        "jobTimeoutMinutes" -> jobTimeoutMinutes.map { x => x.asInstanceOf[js.Any] },
        "videoCapture" -> videoCapture.map { x => x.asInstanceOf[js.Any] },
        "appPackagesCleanup" -> appPackagesCleanup.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ExecutionConfiguration]
    }
  }

  object ExecutionResultEnum {
    val PENDING = "PENDING"
    val PASSED = "PASSED"
    val WARNED = "WARNED"
    val FAILED = "FAILED"
    val SKIPPED = "SKIPPED"
    val ERRORED = "ERRORED"
    val STOPPED = "STOPPED"

    val values = IndexedSeq(PENDING, PASSED, WARNED, FAILED, SKIPPED, ERRORED, STOPPED)
  }

  object ExecutionResultCodeEnum {
    val PARSING_FAILED = "PARSING_FAILED"
    val VPC_ENDPOINT_SETUP_FAILED = "VPC_ENDPOINT_SETUP_FAILED"

    val values = IndexedSeq(PARSING_FAILED, VPC_ENDPOINT_SETUP_FAILED)
  }

  object ExecutionStatusEnum {
    val PENDING = "PENDING"
    val PENDING_CONCURRENCY = "PENDING_CONCURRENCY"
    val PENDING_DEVICE = "PENDING_DEVICE"
    val PROCESSING = "PROCESSING"
    val SCHEDULING = "SCHEDULING"
    val PREPARING = "PREPARING"
    val RUNNING = "RUNNING"
    val COMPLETED = "COMPLETED"
    val STOPPING = "STOPPING"

    val values = IndexedSeq(PENDING, PENDING_CONCURRENCY, PENDING_DEVICE, PROCESSING, SCHEDULING, PREPARING, RUNNING, COMPLETED, STOPPING)
  }

  /**
   * <p>Represents the request sent to retrieve the account settings.</p>
   */
  @js.native
  trait GetAccountSettingsRequest extends js.Object {

  }

  object GetAccountSettingsRequest {
    def apply(): GetAccountSettingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountSettingsRequest]
    }
  }

  /**
   * <p>Represents the account settings return values from the <code>GetAccountSettings</code> request.</p>
   */
  @js.native
  trait GetAccountSettingsResult extends js.Object {
    var accountSettings: js.UndefOr[AccountSettings]
  }

  object GetAccountSettingsResult {
    def apply(
      accountSettings: js.UndefOr[AccountSettings] = js.undefined): GetAccountSettingsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "accountSettings" -> accountSettings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAccountSettingsResult]
    }
  }

  @js.native
  trait GetDeviceInstanceRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
  }

  object GetDeviceInstanceRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined): GetDeviceInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeviceInstanceRequest]
    }
  }

  @js.native
  trait GetDeviceInstanceResult extends js.Object {
    var deviceInstance: js.UndefOr[DeviceInstance]
  }

  object GetDeviceInstanceResult {
    def apply(
      deviceInstance: js.UndefOr[DeviceInstance] = js.undefined): GetDeviceInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deviceInstance" -> deviceInstance.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeviceInstanceResult]
    }
  }

  /**
   * <p>Represents a request to the get device pool compatibility operation.</p>
   */
  @js.native
  trait GetDevicePoolCompatibilityRequest extends js.Object {
    var test: js.UndefOr[ScheduleRunTest]
    var testType: js.UndefOr[TestType]
    var configuration: js.UndefOr[ScheduleRunConfiguration]
    var appArn: js.UndefOr[AmazonResourceName]
    var devicePoolArn: js.UndefOr[AmazonResourceName]
  }

  object GetDevicePoolCompatibilityRequest {
    def apply(
      test: js.UndefOr[ScheduleRunTest] = js.undefined,
      testType: js.UndefOr[TestType] = js.undefined,
      configuration: js.UndefOr[ScheduleRunConfiguration] = js.undefined,
      appArn: js.UndefOr[AmazonResourceName] = js.undefined,
      devicePoolArn: js.UndefOr[AmazonResourceName] = js.undefined): GetDevicePoolCompatibilityRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "test" -> test.map { x => x.asInstanceOf[js.Any] },
        "testType" -> testType.map { x => x.asInstanceOf[js.Any] },
        "configuration" -> configuration.map { x => x.asInstanceOf[js.Any] },
        "appArn" -> appArn.map { x => x.asInstanceOf[js.Any] },
        "devicePoolArn" -> devicePoolArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDevicePoolCompatibilityRequest]
    }
  }

  /**
   * <p>Represents the result of describe device pool compatibility request.</p>
   */
  @js.native
  trait GetDevicePoolCompatibilityResult extends js.Object {
    var compatibleDevices: js.UndefOr[DevicePoolCompatibilityResults]
    var incompatibleDevices: js.UndefOr[DevicePoolCompatibilityResults]
  }

  object GetDevicePoolCompatibilityResult {
    def apply(
      compatibleDevices: js.UndefOr[DevicePoolCompatibilityResults] = js.undefined,
      incompatibleDevices: js.UndefOr[DevicePoolCompatibilityResults] = js.undefined): GetDevicePoolCompatibilityResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "compatibleDevices" -> compatibleDevices.map { x => x.asInstanceOf[js.Any] },
        "incompatibleDevices" -> incompatibleDevices.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDevicePoolCompatibilityResult]
    }
  }

  /**
   * <p>Represents a request to the get device pool operation.</p>
   */
  @js.native
  trait GetDevicePoolRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
  }

  object GetDevicePoolRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined): GetDevicePoolRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDevicePoolRequest]
    }
  }

  /**
   * <p>Represents the result of a get device pool request.</p>
   */
  @js.native
  trait GetDevicePoolResult extends js.Object {
    var devicePool: js.UndefOr[DevicePool]
  }

  object GetDevicePoolResult {
    def apply(
      devicePool: js.UndefOr[DevicePool] = js.undefined): GetDevicePoolResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "devicePool" -> devicePool.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDevicePoolResult]
    }
  }

  /**
   * <p>Represents a request to the get device request.</p>
   */
  @js.native
  trait GetDeviceRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
  }

  object GetDeviceRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined): GetDeviceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeviceRequest]
    }
  }

  /**
   * <p>Represents the result of a get device request.</p>
   */
  @js.native
  trait GetDeviceResult extends js.Object {
    var device: js.UndefOr[Device]
  }

  object GetDeviceResult {
    def apply(
      device: js.UndefOr[Device] = js.undefined): GetDeviceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "device" -> device.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeviceResult]
    }
  }

  @js.native
  trait GetInstanceProfileRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
  }

  object GetInstanceProfileRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined): GetInstanceProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceProfileRequest]
    }
  }

  @js.native
  trait GetInstanceProfileResult extends js.Object {
    var instanceProfile: js.UndefOr[InstanceProfile]
  }

  object GetInstanceProfileResult {
    def apply(
      instanceProfile: js.UndefOr[InstanceProfile] = js.undefined): GetInstanceProfileResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceProfile" -> instanceProfile.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceProfileResult]
    }
  }

  /**
   * <p>Represents a request to the get job operation.</p>
   */
  @js.native
  trait GetJobRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
  }

  object GetJobRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined): GetJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetJobRequest]
    }
  }

  /**
   * <p>Represents the result of a get job request.</p>
   */
  @js.native
  trait GetJobResult extends js.Object {
    var job: js.UndefOr[Job]
  }

  object GetJobResult {
    def apply(
      job: js.UndefOr[Job] = js.undefined): GetJobResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "job" -> job.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetJobResult]
    }
  }

  @js.native
  trait GetNetworkProfileRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
  }

  object GetNetworkProfileRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined): GetNetworkProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetNetworkProfileRequest]
    }
  }

  @js.native
  trait GetNetworkProfileResult extends js.Object {
    var networkProfile: js.UndefOr[NetworkProfile]
  }

  object GetNetworkProfileResult {
    def apply(
      networkProfile: js.UndefOr[NetworkProfile] = js.undefined): GetNetworkProfileResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "networkProfile" -> networkProfile.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetNetworkProfileResult]
    }
  }

  /**
   * <p>Represents the request to retrieve the offering status for the specified customer or account.</p>
   */
  @js.native
  trait GetOfferingStatusRequest extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
  }

  object GetOfferingStatusRequest {
    def apply(
      nextToken: js.UndefOr[PaginationToken] = js.undefined): GetOfferingStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOfferingStatusRequest]
    }
  }

  /**
   * <p>Returns the status result for a device offering.</p>
   */
  @js.native
  trait GetOfferingStatusResult extends js.Object {
    var current: js.UndefOr[OfferingStatusMap]
    var nextPeriod: js.UndefOr[OfferingStatusMap]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object GetOfferingStatusResult {
    def apply(
      current: js.UndefOr[OfferingStatusMap] = js.undefined,
      nextPeriod: js.UndefOr[OfferingStatusMap] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): GetOfferingStatusResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "current" -> current.map { x => x.asInstanceOf[js.Any] },
        "nextPeriod" -> nextPeriod.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOfferingStatusResult]
    }
  }

  /**
   * <p>Represents a request to the get project operation.</p>
   */
  @js.native
  trait GetProjectRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
  }

  object GetProjectRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined): GetProjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetProjectRequest]
    }
  }

  /**
   * <p>Represents the result of a get project request.</p>
   */
  @js.native
  trait GetProjectResult extends js.Object {
    var project: js.UndefOr[Project]
  }

  object GetProjectResult {
    def apply(
      project: js.UndefOr[Project] = js.undefined): GetProjectResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "project" -> project.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetProjectResult]
    }
  }

  /**
   * <p>Represents the request to get information about the specified remote access session.</p>
   */
  @js.native
  trait GetRemoteAccessSessionRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
  }

  object GetRemoteAccessSessionRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined): GetRemoteAccessSessionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRemoteAccessSessionRequest]
    }
  }

  /**
   * <p>Represents the response from the server that lists detailed information about the remote access session.</p>
   */
  @js.native
  trait GetRemoteAccessSessionResult extends js.Object {
    var remoteAccessSession: js.UndefOr[RemoteAccessSession]
  }

  object GetRemoteAccessSessionResult {
    def apply(
      remoteAccessSession: js.UndefOr[RemoteAccessSession] = js.undefined): GetRemoteAccessSessionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "remoteAccessSession" -> remoteAccessSession.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRemoteAccessSessionResult]
    }
  }

  /**
   * <p>Represents a request to the get run operation.</p>
   */
  @js.native
  trait GetRunRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
  }

  object GetRunRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined): GetRunRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRunRequest]
    }
  }

  /**
   * <p>Represents the result of a get run request.</p>
   */
  @js.native
  trait GetRunResult extends js.Object {
    var run: js.UndefOr[Run]
  }

  object GetRunResult {
    def apply(
      run: js.UndefOr[Run] = js.undefined): GetRunResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "run" -> run.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetRunResult]
    }
  }

  /**
   * <p>Represents a request to the get suite operation.</p>
   */
  @js.native
  trait GetSuiteRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
  }

  object GetSuiteRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined): GetSuiteRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSuiteRequest]
    }
  }

  /**
   * <p>Represents the result of a get suite request.</p>
   */
  @js.native
  trait GetSuiteResult extends js.Object {
    var suite: js.UndefOr[Suite]
  }

  object GetSuiteResult {
    def apply(
      suite: js.UndefOr[Suite] = js.undefined): GetSuiteResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "suite" -> suite.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSuiteResult]
    }
  }

  /**
   * <p>Represents a request to the get test operation.</p>
   */
  @js.native
  trait GetTestRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
  }

  object GetTestRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined): GetTestRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTestRequest]
    }
  }

  /**
   * <p>Represents the result of a get test request.</p>
   */
  @js.native
  trait GetTestResult extends js.Object {
    var test: js.UndefOr[Test]
  }

  object GetTestResult {
    def apply(
      test: js.UndefOr[Test] = js.undefined): GetTestResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "test" -> test.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTestResult]
    }
  }

  /**
   * <p>Represents a request to the get upload operation.</p>
   */
  @js.native
  trait GetUploadRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
  }

  object GetUploadRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined): GetUploadRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUploadRequest]
    }
  }

  /**
   * <p>Represents the result of a get upload request.</p>
   */
  @js.native
  trait GetUploadResult extends js.Object {
    var upload: js.UndefOr[Upload]
  }

  object GetUploadResult {
    def apply(
      upload: js.UndefOr[Upload] = js.undefined): GetUploadResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "upload" -> upload.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetUploadResult]
    }
  }

  @js.native
  trait GetVPCEConfigurationRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
  }

  object GetVPCEConfigurationRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined): GetVPCEConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetVPCEConfigurationRequest]
    }
  }

  @js.native
  trait GetVPCEConfigurationResult extends js.Object {
    var vpceConfiguration: js.UndefOr[VPCEConfiguration]
  }

  object GetVPCEConfigurationResult {
    def apply(
      vpceConfiguration: js.UndefOr[VPCEConfiguration] = js.undefined): GetVPCEConfigurationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "vpceConfiguration" -> vpceConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetVPCEConfigurationResult]
    }
  }

  /**
   * <p>An entity with the same name already exists.</p>
   */
  @js.native
  trait IdempotencyExceptionException extends js.Object {
    val message: Message
  }

  /**
   * <p>Represents information about incompatibility.</p>
   */
  @js.native
  trait IncompatibilityMessage extends js.Object {
    var message: js.UndefOr[Message]
    var `type`: js.UndefOr[DeviceAttribute]
  }

  object IncompatibilityMessage {
    def apply(
      message: js.UndefOr[Message] = js.undefined,
      `type`: js.UndefOr[DeviceAttribute] = js.undefined): IncompatibilityMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "message" -> message.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IncompatibilityMessage]
    }
  }

  /**
   * <p>Represents the request to install an Android application (in .apk format) or an iOS application (in .ipa format) as part of a remote access session.</p>
   */
  @js.native
  trait InstallToRemoteAccessSessionRequest extends js.Object {
    var remoteAccessSessionArn: js.UndefOr[AmazonResourceName]
    var appArn: js.UndefOr[AmazonResourceName]
  }

  object InstallToRemoteAccessSessionRequest {
    def apply(
      remoteAccessSessionArn: js.UndefOr[AmazonResourceName] = js.undefined,
      appArn: js.UndefOr[AmazonResourceName] = js.undefined): InstallToRemoteAccessSessionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "remoteAccessSessionArn" -> remoteAccessSessionArn.map { x => x.asInstanceOf[js.Any] },
        "appArn" -> appArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstallToRemoteAccessSessionRequest]
    }
  }

  /**
   * <p>Represents the response from the server after AWS Device Farm makes a request to install to a remote access session.</p>
   */
  @js.native
  trait InstallToRemoteAccessSessionResult extends js.Object {
    var appUpload: js.UndefOr[Upload]
  }

  object InstallToRemoteAccessSessionResult {
    def apply(
      appUpload: js.UndefOr[Upload] = js.undefined): InstallToRemoteAccessSessionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appUpload" -> appUpload.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstallToRemoteAccessSessionResult]
    }
  }

  /**
   * <p>Represents the instance profile.</p>
   */
  @js.native
  trait InstanceProfile extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var name: js.UndefOr[Name]
    var description: js.UndefOr[Message]
    var packageCleanup: js.UndefOr[Boolean]
    var excludeAppPackagesFromCleanup: js.UndefOr[PackageIds]
    var rebootAfterUse: js.UndefOr[Boolean]
  }

  object InstanceProfile {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      description: js.UndefOr[Message] = js.undefined,
      packageCleanup: js.UndefOr[Boolean] = js.undefined,
      excludeAppPackagesFromCleanup: js.UndefOr[PackageIds] = js.undefined,
      rebootAfterUse: js.UndefOr[Boolean] = js.undefined): InstanceProfile = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "packageCleanup" -> packageCleanup.map { x => x.asInstanceOf[js.Any] },
        "excludeAppPackagesFromCleanup" -> excludeAppPackagesFromCleanup.map { x => x.asInstanceOf[js.Any] },
        "rebootAfterUse" -> rebootAfterUse.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceProfile]
    }
  }

  object InstanceStatusEnum {
    val IN_USE = "IN_USE"
    val PREPARING = "PREPARING"
    val AVAILABLE = "AVAILABLE"
    val NOT_AVAILABLE = "NOT_AVAILABLE"

    val values = IndexedSeq(IN_USE, PREPARING, AVAILABLE, NOT_AVAILABLE)
  }

  object InteractionModeEnum {
    val INTERACTIVE = "INTERACTIVE"
    val NO_VIDEO = "NO_VIDEO"
    val VIDEO_ONLY = "VIDEO_ONLY"

    val values = IndexedSeq(INTERACTIVE, NO_VIDEO, VIDEO_ONLY)
  }

  /**
   * <p>There was an error with the update request, or you do not have sufficient permissions to update this VPC endpoint configuration.</p>
   */
  @js.native
  trait InvalidOperationExceptionException extends js.Object {
    val message: Message
  }

  /**
   * <p>Represents a device.</p>
   */
  @js.native
  trait Job extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var name: js.UndefOr[Name]
    var counters: js.UndefOr[Counters]
    var result: js.UndefOr[ExecutionResult]
    var status: js.UndefOr[ExecutionStatus]
    var deviceMinutes: js.UndefOr[DeviceMinutes]
    var videoCapture: js.UndefOr[VideoCapture]
    var stopped: js.UndefOr[DateTime]
    var message: js.UndefOr[Message]
    var videoEndpoint: js.UndefOr[String]
    var `type`: js.UndefOr[TestType]
    var started: js.UndefOr[DateTime]
    var instanceArn: js.UndefOr[AmazonResourceName]
    var device: js.UndefOr[Device]
    var created: js.UndefOr[DateTime]
  }

  object Job {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      counters: js.UndefOr[Counters] = js.undefined,
      result: js.UndefOr[ExecutionResult] = js.undefined,
      status: js.UndefOr[ExecutionStatus] = js.undefined,
      deviceMinutes: js.UndefOr[DeviceMinutes] = js.undefined,
      videoCapture: js.UndefOr[VideoCapture] = js.undefined,
      stopped: js.UndefOr[DateTime] = js.undefined,
      message: js.UndefOr[Message] = js.undefined,
      videoEndpoint: js.UndefOr[String] = js.undefined,
      `type`: js.UndefOr[TestType] = js.undefined,
      started: js.UndefOr[DateTime] = js.undefined,
      instanceArn: js.UndefOr[AmazonResourceName] = js.undefined,
      device: js.UndefOr[Device] = js.undefined,
      created: js.UndefOr[DateTime] = js.undefined): Job = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "counters" -> counters.map { x => x.asInstanceOf[js.Any] },
        "result" -> result.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "deviceMinutes" -> deviceMinutes.map { x => x.asInstanceOf[js.Any] },
        "videoCapture" -> videoCapture.map { x => x.asInstanceOf[js.Any] },
        "stopped" -> stopped.map { x => x.asInstanceOf[js.Any] },
        "message" -> message.map { x => x.asInstanceOf[js.Any] },
        "videoEndpoint" -> videoEndpoint.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "started" -> started.map { x => x.asInstanceOf[js.Any] },
        "instanceArn" -> instanceArn.map { x => x.asInstanceOf[js.Any] },
        "device" -> device.map { x => x.asInstanceOf[js.Any] },
        "created" -> created.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Job]
    }
  }

  /**
   * <p>A limit was exceeded.</p>
   */
  @js.native
  trait LimitExceededExceptionException extends js.Object {
    val message: Message
  }

  /**
   * <p>Represents a request to the list artifacts operation.</p>
   */
  @js.native
  trait ListArtifactsRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var `type`: js.UndefOr[ArtifactCategory]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListArtifactsRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      `type`: js.UndefOr[ArtifactCategory] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListArtifactsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListArtifactsRequest]
    }
  }

  /**
   * <p>Represents the result of a list artifacts operation.</p>
   */
  @js.native
  trait ListArtifactsResult extends js.Object {
    var artifacts: js.UndefOr[Artifacts]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListArtifactsResult {
    def apply(
      artifacts: js.UndefOr[Artifacts] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListArtifactsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "artifacts" -> artifacts.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListArtifactsResult]
    }
  }

  @js.native
  trait ListDeviceInstancesRequest extends js.Object {
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListDeviceInstancesRequest {
    def apply(
      maxResults: js.UndefOr[Int] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListDeviceInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeviceInstancesRequest]
    }
  }

  @js.native
  trait ListDeviceInstancesResult extends js.Object {
    var deviceInstances: js.UndefOr[DeviceInstances]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListDeviceInstancesResult {
    def apply(
      deviceInstances: js.UndefOr[DeviceInstances] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListDeviceInstancesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deviceInstances" -> deviceInstances.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeviceInstancesResult]
    }
  }

  /**
   * <p>Represents the result of a list device pools request.</p>
   */
  @js.native
  trait ListDevicePoolsRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var `type`: js.UndefOr[DevicePoolType]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListDevicePoolsRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      `type`: js.UndefOr[DevicePoolType] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListDevicePoolsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDevicePoolsRequest]
    }
  }

  /**
   * <p>Represents the result of a list device pools request.</p>
   */
  @js.native
  trait ListDevicePoolsResult extends js.Object {
    var devicePools: js.UndefOr[DevicePools]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListDevicePoolsResult {
    def apply(
      devicePools: js.UndefOr[DevicePools] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListDevicePoolsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "devicePools" -> devicePools.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDevicePoolsResult]
    }
  }

  /**
   * <p>Represents the result of a list devices request.</p>
   */
  @js.native
  trait ListDevicesRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListDevicesRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListDevicesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDevicesRequest]
    }
  }

  /**
   * <p>Represents the result of a list devices operation.</p>
   */
  @js.native
  trait ListDevicesResult extends js.Object {
    var devices: js.UndefOr[Devices]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListDevicesResult {
    def apply(
      devices: js.UndefOr[Devices] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListDevicesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "devices" -> devices.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDevicesResult]
    }
  }

  @js.native
  trait ListInstanceProfilesRequest extends js.Object {
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListInstanceProfilesRequest {
    def apply(
      maxResults: js.UndefOr[Int] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListInstanceProfilesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInstanceProfilesRequest]
    }
  }

  @js.native
  trait ListInstanceProfilesResult extends js.Object {
    var instanceProfiles: js.UndefOr[InstanceProfiles]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListInstanceProfilesResult {
    def apply(
      instanceProfiles: js.UndefOr[InstanceProfiles] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListInstanceProfilesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceProfiles" -> instanceProfiles.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInstanceProfilesResult]
    }
  }

  /**
   * <p>Represents a request to the list jobs operation.</p>
   */
  @js.native
  trait ListJobsRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListJobsRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsRequest]
    }
  }

  /**
   * <p>Represents the result of a list jobs request.</p>
   */
  @js.native
  trait ListJobsResult extends js.Object {
    var jobs: js.UndefOr[Jobs]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListJobsResult {
    def apply(
      jobs: js.UndefOr[Jobs] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListJobsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobs" -> jobs.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsResult]
    }
  }

  @js.native
  trait ListNetworkProfilesRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var `type`: js.UndefOr[NetworkProfileType]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListNetworkProfilesRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      `type`: js.UndefOr[NetworkProfileType] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListNetworkProfilesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListNetworkProfilesRequest]
    }
  }

  @js.native
  trait ListNetworkProfilesResult extends js.Object {
    var networkProfiles: js.UndefOr[NetworkProfiles]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListNetworkProfilesResult {
    def apply(
      networkProfiles: js.UndefOr[NetworkProfiles] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListNetworkProfilesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "networkProfiles" -> networkProfiles.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListNetworkProfilesResult]
    }
  }

  @js.native
  trait ListOfferingPromotionsRequest extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListOfferingPromotionsRequest {
    def apply(
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListOfferingPromotionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOfferingPromotionsRequest]
    }
  }

  @js.native
  trait ListOfferingPromotionsResult extends js.Object {
    var offeringPromotions: js.UndefOr[OfferingPromotions]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListOfferingPromotionsResult {
    def apply(
      offeringPromotions: js.UndefOr[OfferingPromotions] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListOfferingPromotionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "offeringPromotions" -> offeringPromotions.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOfferingPromotionsResult]
    }
  }

  /**
   * <p>Represents the request to list the offering transaction history.</p>
   */
  @js.native
  trait ListOfferingTransactionsRequest extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListOfferingTransactionsRequest {
    def apply(
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListOfferingTransactionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOfferingTransactionsRequest]
    }
  }

  /**
   * <p>Returns the transaction log of the specified offerings.</p>
   */
  @js.native
  trait ListOfferingTransactionsResult extends js.Object {
    var offeringTransactions: js.UndefOr[OfferingTransactions]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListOfferingTransactionsResult {
    def apply(
      offeringTransactions: js.UndefOr[OfferingTransactions] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListOfferingTransactionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "offeringTransactions" -> offeringTransactions.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOfferingTransactionsResult]
    }
  }

  /**
   * <p>Represents the request to list all offerings.</p>
   */
  @js.native
  trait ListOfferingsRequest extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListOfferingsRequest {
    def apply(
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListOfferingsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOfferingsRequest]
    }
  }

  /**
   * <p>Represents the return values of the list of offerings.</p>
   */
  @js.native
  trait ListOfferingsResult extends js.Object {
    var offerings: js.UndefOr[Offerings]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListOfferingsResult {
    def apply(
      offerings: js.UndefOr[Offerings] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListOfferingsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "offerings" -> offerings.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOfferingsResult]
    }
  }

  /**
   * <p>Represents a request to the list projects operation.</p>
   */
  @js.native
  trait ListProjectsRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListProjectsRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListProjectsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListProjectsRequest]
    }
  }

  /**
   * <p>Represents the result of a list projects request.</p>
   */
  @js.native
  trait ListProjectsResult extends js.Object {
    var projects: js.UndefOr[Projects]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListProjectsResult {
    def apply(
      projects: js.UndefOr[Projects] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListProjectsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "projects" -> projects.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListProjectsResult]
    }
  }

  /**
   * <p>Represents the request to return information about the remote access session.</p>
   */
  @js.native
  trait ListRemoteAccessSessionsRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListRemoteAccessSessionsRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListRemoteAccessSessionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRemoteAccessSessionsRequest]
    }
  }

  /**
   * <p>Represents the response from the server after AWS Device Farm makes a request to return information about the remote access session.</p>
   */
  @js.native
  trait ListRemoteAccessSessionsResult extends js.Object {
    var remoteAccessSessions: js.UndefOr[RemoteAccessSessions]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListRemoteAccessSessionsResult {
    def apply(
      remoteAccessSessions: js.UndefOr[RemoteAccessSessions] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListRemoteAccessSessionsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "remoteAccessSessions" -> remoteAccessSessions.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRemoteAccessSessionsResult]
    }
  }

  /**
   * <p>Represents a request to the list runs operation.</p>
   */
  @js.native
  trait ListRunsRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListRunsRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListRunsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRunsRequest]
    }
  }

  /**
   * <p>Represents the result of a list runs request.</p>
   */
  @js.native
  trait ListRunsResult extends js.Object {
    var runs: js.UndefOr[Runs]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListRunsResult {
    def apply(
      runs: js.UndefOr[Runs] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListRunsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "runs" -> runs.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRunsResult]
    }
  }

  /**
   * <p>Represents a request to the list samples operation.</p>
   */
  @js.native
  trait ListSamplesRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListSamplesRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListSamplesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSamplesRequest]
    }
  }

  /**
   * <p>Represents the result of a list samples request.</p>
   */
  @js.native
  trait ListSamplesResult extends js.Object {
    var samples: js.UndefOr[Samples]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListSamplesResult {
    def apply(
      samples: js.UndefOr[Samples] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListSamplesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "samples" -> samples.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSamplesResult]
    }
  }

  /**
   * <p>Represents a request to the list suites operation.</p>
   */
  @js.native
  trait ListSuitesRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListSuitesRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListSuitesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSuitesRequest]
    }
  }

  /**
   * <p>Represents the result of a list suites request.</p>
   */
  @js.native
  trait ListSuitesResult extends js.Object {
    var suites: js.UndefOr[Suites]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListSuitesResult {
    def apply(
      suites: js.UndefOr[Suites] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListSuitesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "suites" -> suites.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListSuitesResult]
    }
  }

  /**
   * <p>Represents a request to the list tests operation.</p>
   */
  @js.native
  trait ListTestsRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListTestsRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListTestsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTestsRequest]
    }
  }

  /**
   * <p>Represents the result of a list tests request.</p>
   */
  @js.native
  trait ListTestsResult extends js.Object {
    var tests: js.UndefOr[Tests]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListTestsResult {
    def apply(
      tests: js.UndefOr[Tests] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListTestsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tests" -> tests.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTestsResult]
    }
  }

  /**
   * <p>Represents a request to the list unique problems operation.</p>
   */
  @js.native
  trait ListUniqueProblemsRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListUniqueProblemsRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListUniqueProblemsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUniqueProblemsRequest]
    }
  }

  /**
   * <p>Represents the result of a list unique problems request.</p>
   */
  @js.native
  trait ListUniqueProblemsResult extends js.Object {
    var uniqueProblems: js.UndefOr[UniqueProblemsByExecutionResultMap]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListUniqueProblemsResult {
    def apply(
      uniqueProblems: js.UndefOr[UniqueProblemsByExecutionResultMap] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListUniqueProblemsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "uniqueProblems" -> uniqueProblems.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUniqueProblemsResult]
    }
  }

  /**
   * <p>Represents a request to the list uploads operation.</p>
   */
  @js.native
  trait ListUploadsRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var `type`: js.UndefOr[UploadType]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListUploadsRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      `type`: js.UndefOr[UploadType] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListUploadsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUploadsRequest]
    }
  }

  /**
   * <p>Represents the result of a list uploads request.</p>
   */
  @js.native
  trait ListUploadsResult extends js.Object {
    var uploads: js.UndefOr[Uploads]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListUploadsResult {
    def apply(
      uploads: js.UndefOr[Uploads] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListUploadsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "uploads" -> uploads.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUploadsResult]
    }
  }

  @js.native
  trait ListVPCEConfigurationsRequest extends js.Object {
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListVPCEConfigurationsRequest {
    def apply(
      maxResults: js.UndefOr[Int] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListVPCEConfigurationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVPCEConfigurationsRequest]
    }
  }

  @js.native
  trait ListVPCEConfigurationsResult extends js.Object {
    var vpceConfigurations: js.UndefOr[VPCEConfigurations]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListVPCEConfigurationsResult {
    def apply(
      vpceConfigurations: js.UndefOr[VPCEConfigurations] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListVPCEConfigurationsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "vpceConfigurations" -> vpceConfigurations.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVPCEConfigurationsResult]
    }
  }

  /**
   * <p>Represents a latitude and longitude pair, expressed in geographic coordinate system degrees (for example 47.6204, -122.3491).</p> <p>Elevation is currently not supported.</p>
   */
  @js.native
  trait Location extends js.Object {
    var latitude: js.UndefOr[Double]
    var longitude: js.UndefOr[Double]
  }

  object Location {
    def apply(
      latitude: js.UndefOr[Double] = js.undefined,
      longitude: js.UndefOr[Double] = js.undefined): Location = {
      val _fields = IndexedSeq[(String, js.Any)](
        "latitude" -> latitude.map { x => x.asInstanceOf[js.Any] },
        "longitude" -> longitude.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Location]
    }
  }

  /**
   * <p>A number representing the monetary amount for an offering or transaction.</p>
   */
  @js.native
  trait MonetaryAmount extends js.Object {
    var amount: js.UndefOr[Double]
    var currencyCode: js.UndefOr[CurrencyCode]
  }

  object MonetaryAmount {
    def apply(
      amount: js.UndefOr[Double] = js.undefined,
      currencyCode: js.UndefOr[CurrencyCode] = js.undefined): MonetaryAmount = {
      val _fields = IndexedSeq[(String, js.Any)](
        "amount" -> amount.map { x => x.asInstanceOf[js.Any] },
        "currencyCode" -> currencyCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MonetaryAmount]
    }
  }

  /**
   * <p>An array of settings that describes characteristics of a network profile.</p>
   */
  @js.native
  trait NetworkProfile extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var name: js.UndefOr[Name]
    var downlinkDelayMs: js.UndefOr[Double]
    var uplinkLossPercent: js.UndefOr[PercentInteger]
    var description: js.UndefOr[Message]
    var downlinkLossPercent: js.UndefOr[PercentInteger]
    var uplinkJitterMs: js.UndefOr[Double]
    var uplinkBandwidthBits: js.UndefOr[Double]
    var uplinkDelayMs: js.UndefOr[Double]
    var `type`: js.UndefOr[NetworkProfileType]
    var downlinkJitterMs: js.UndefOr[Double]
    var downlinkBandwidthBits: js.UndefOr[Double]
  }

  object NetworkProfile {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      downlinkDelayMs: js.UndefOr[Double] = js.undefined,
      uplinkLossPercent: js.UndefOr[PercentInteger] = js.undefined,
      description: js.UndefOr[Message] = js.undefined,
      downlinkLossPercent: js.UndefOr[PercentInteger] = js.undefined,
      uplinkJitterMs: js.UndefOr[Double] = js.undefined,
      uplinkBandwidthBits: js.UndefOr[Double] = js.undefined,
      uplinkDelayMs: js.UndefOr[Double] = js.undefined,
      `type`: js.UndefOr[NetworkProfileType] = js.undefined,
      downlinkJitterMs: js.UndefOr[Double] = js.undefined,
      downlinkBandwidthBits: js.UndefOr[Double] = js.undefined): NetworkProfile = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "downlinkDelayMs" -> downlinkDelayMs.map { x => x.asInstanceOf[js.Any] },
        "uplinkLossPercent" -> uplinkLossPercent.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "downlinkLossPercent" -> downlinkLossPercent.map { x => x.asInstanceOf[js.Any] },
        "uplinkJitterMs" -> uplinkJitterMs.map { x => x.asInstanceOf[js.Any] },
        "uplinkBandwidthBits" -> uplinkBandwidthBits.map { x => x.asInstanceOf[js.Any] },
        "uplinkDelayMs" -> uplinkDelayMs.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "downlinkJitterMs" -> downlinkJitterMs.map { x => x.asInstanceOf[js.Any] },
        "downlinkBandwidthBits" -> downlinkBandwidthBits.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NetworkProfile]
    }
  }

  object NetworkProfileTypeEnum {
    val CURATED = "CURATED"
    val PRIVATE = "PRIVATE"

    val values = IndexedSeq(CURATED, PRIVATE)
  }

  /**
   * <p>Exception gets thrown when a user is not eligible to perform the specified transaction.</p>
   */
  @js.native
  trait NotEligibleExceptionException extends js.Object {
    val message: Message
  }

  /**
   * <p>The specified entity was not found.</p>
   */
  @js.native
  trait NotFoundExceptionException extends js.Object {
    val message: Message
  }

  /**
   * <p>Represents the metadata of a device offering.</p>
   */
  @js.native
  trait Offering extends js.Object {
    var description: js.UndefOr[Message]
    var id: js.UndefOr[OfferingIdentifier]
    var `type`: js.UndefOr[OfferingType]
    var platform: js.UndefOr[DevicePlatform]
    var recurringCharges: js.UndefOr[RecurringCharges]
  }

  object Offering {
    def apply(
      description: js.UndefOr[Message] = js.undefined,
      id: js.UndefOr[OfferingIdentifier] = js.undefined,
      `type`: js.UndefOr[OfferingType] = js.undefined,
      platform: js.UndefOr[DevicePlatform] = js.undefined,
      recurringCharges: js.UndefOr[RecurringCharges] = js.undefined): Offering = {
      val _fields = IndexedSeq[(String, js.Any)](
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "platform" -> platform.map { x => x.asInstanceOf[js.Any] },
        "recurringCharges" -> recurringCharges.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Offering]
    }
  }

  /**
   * <p>Represents information about an offering promotion.</p>
   */
  @js.native
  trait OfferingPromotion extends js.Object {
    var id: js.UndefOr[OfferingPromotionIdentifier]
    var description: js.UndefOr[Message]
  }

  object OfferingPromotion {
    def apply(
      id: js.UndefOr[OfferingPromotionIdentifier] = js.undefined,
      description: js.UndefOr[Message] = js.undefined): OfferingPromotion = {
      val _fields = IndexedSeq[(String, js.Any)](
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OfferingPromotion]
    }
  }

  /**
   * <p>The status of the offering.</p>
   */
  @js.native
  trait OfferingStatus extends js.Object {
    var `type`: js.UndefOr[OfferingTransactionType]
    var offering: js.UndefOr[Offering]
    var quantity: js.UndefOr[Int]
    var effectiveOn: js.UndefOr[DateTime]
  }

  object OfferingStatus {
    def apply(
      `type`: js.UndefOr[OfferingTransactionType] = js.undefined,
      offering: js.UndefOr[Offering] = js.undefined,
      quantity: js.UndefOr[Int] = js.undefined,
      effectiveOn: js.UndefOr[DateTime] = js.undefined): OfferingStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "offering" -> offering.map { x => x.asInstanceOf[js.Any] },
        "quantity" -> quantity.map { x => x.asInstanceOf[js.Any] },
        "effectiveOn" -> effectiveOn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OfferingStatus]
    }
  }

  /**
   * <p>Represents the metadata of an offering transaction.</p>
   */
  @js.native
  trait OfferingTransaction extends js.Object {
    var createdOn: js.UndefOr[DateTime]
    var offeringPromotionId: js.UndefOr[OfferingPromotionIdentifier]
    var cost: js.UndefOr[MonetaryAmount]
    var offeringStatus: js.UndefOr[OfferingStatus]
    var transactionId: js.UndefOr[TransactionIdentifier]
  }

  object OfferingTransaction {
    def apply(
      createdOn: js.UndefOr[DateTime] = js.undefined,
      offeringPromotionId: js.UndefOr[OfferingPromotionIdentifier] = js.undefined,
      cost: js.UndefOr[MonetaryAmount] = js.undefined,
      offeringStatus: js.UndefOr[OfferingStatus] = js.undefined,
      transactionId: js.UndefOr[TransactionIdentifier] = js.undefined): OfferingTransaction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "createdOn" -> createdOn.map { x => x.asInstanceOf[js.Any] },
        "offeringPromotionId" -> offeringPromotionId.map { x => x.asInstanceOf[js.Any] },
        "cost" -> cost.map { x => x.asInstanceOf[js.Any] },
        "offeringStatus" -> offeringStatus.map { x => x.asInstanceOf[js.Any] },
        "transactionId" -> transactionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OfferingTransaction]
    }
  }

  object OfferingTransactionTypeEnum {
    val PURCHASE = "PURCHASE"
    val RENEW = "RENEW"
    val SYSTEM = "SYSTEM"

    val values = IndexedSeq(PURCHASE, RENEW, SYSTEM)
  }

  object OfferingTypeEnum {
    val RECURRING = "RECURRING"

    val values = IndexedSeq(RECURRING)
  }

  /**
   * <p>Represents a specific warning or failure.</p>
   */
  @js.native
  trait Problem extends js.Object {
    var test: js.UndefOr[ProblemDetail]
    var run: js.UndefOr[ProblemDetail]
    var result: js.UndefOr[ExecutionResult]
    var job: js.UndefOr[ProblemDetail]
    var message: js.UndefOr[Message]
    var device: js.UndefOr[Device]
    var suite: js.UndefOr[ProblemDetail]
  }

  object Problem {
    def apply(
      test: js.UndefOr[ProblemDetail] = js.undefined,
      run: js.UndefOr[ProblemDetail] = js.undefined,
      result: js.UndefOr[ExecutionResult] = js.undefined,
      job: js.UndefOr[ProblemDetail] = js.undefined,
      message: js.UndefOr[Message] = js.undefined,
      device: js.UndefOr[Device] = js.undefined,
      suite: js.UndefOr[ProblemDetail] = js.undefined): Problem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "test" -> test.map { x => x.asInstanceOf[js.Any] },
        "run" -> run.map { x => x.asInstanceOf[js.Any] },
        "result" -> result.map { x => x.asInstanceOf[js.Any] },
        "job" -> job.map { x => x.asInstanceOf[js.Any] },
        "message" -> message.map { x => x.asInstanceOf[js.Any] },
        "device" -> device.map { x => x.asInstanceOf[js.Any] },
        "suite" -> suite.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Problem]
    }
  }

  /**
   * <p>Information about a problem detail.</p>
   */
  @js.native
  trait ProblemDetail extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var name: js.UndefOr[Name]
  }

  object ProblemDetail {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      name: js.UndefOr[Name] = js.undefined): ProblemDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProblemDetail]
    }
  }

  /**
   * <p>Represents an operating-system neutral workspace for running and managing tests.</p>
   */
  @js.native
  trait Project extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var name: js.UndefOr[Name]
    var defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes]
    var created: js.UndefOr[DateTime]
  }

  object Project {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.undefined,
      created: js.UndefOr[DateTime] = js.undefined): Project = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "defaultJobTimeoutMinutes" -> defaultJobTimeoutMinutes.map { x => x.asInstanceOf[js.Any] },
        "created" -> created.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Project]
    }
  }

  /**
   * <p>Represents a request for a purchase offering.</p>
   */
  @js.native
  trait PurchaseOfferingRequest extends js.Object {
    var offeringId: js.UndefOr[OfferingIdentifier]
    var quantity: js.UndefOr[Int]
    var offeringPromotionId: js.UndefOr[OfferingPromotionIdentifier]
  }

  object PurchaseOfferingRequest {
    def apply(
      offeringId: js.UndefOr[OfferingIdentifier] = js.undefined,
      quantity: js.UndefOr[Int] = js.undefined,
      offeringPromotionId: js.UndefOr[OfferingPromotionIdentifier] = js.undefined): PurchaseOfferingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "offeringId" -> offeringId.map { x => x.asInstanceOf[js.Any] },
        "quantity" -> quantity.map { x => x.asInstanceOf[js.Any] },
        "offeringPromotionId" -> offeringPromotionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseOfferingRequest]
    }
  }

  /**
   * <p>The result of the purchase offering (e.g., success or failure).</p>
   */
  @js.native
  trait PurchaseOfferingResult extends js.Object {
    var offeringTransaction: js.UndefOr[OfferingTransaction]
  }

  object PurchaseOfferingResult {
    def apply(
      offeringTransaction: js.UndefOr[OfferingTransaction] = js.undefined): PurchaseOfferingResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "offeringTransaction" -> offeringTransaction.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PurchaseOfferingResult]
    }
  }

  /**
   * <p>Represents the set of radios and their states on a device. Examples of radios include Wi-Fi, GPS, Bluetooth, and NFC.</p>
   */
  @js.native
  trait Radios extends js.Object {
    var wifi: js.UndefOr[Boolean]
    var bluetooth: js.UndefOr[Boolean]
    var nfc: js.UndefOr[Boolean]
    var gps: js.UndefOr[Boolean]
  }

  object Radios {
    def apply(
      wifi: js.UndefOr[Boolean] = js.undefined,
      bluetooth: js.UndefOr[Boolean] = js.undefined,
      nfc: js.UndefOr[Boolean] = js.undefined,
      gps: js.UndefOr[Boolean] = js.undefined): Radios = {
      val _fields = IndexedSeq[(String, js.Any)](
        "wifi" -> wifi.map { x => x.asInstanceOf[js.Any] },
        "bluetooth" -> bluetooth.map { x => x.asInstanceOf[js.Any] },
        "nfc" -> nfc.map { x => x.asInstanceOf[js.Any] },
        "gps" -> gps.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Radios]
    }
  }

  /**
   * <p>Specifies whether charges for devices will be recurring.</p>
   */
  @js.native
  trait RecurringCharge extends js.Object {
    var cost: js.UndefOr[MonetaryAmount]
    var frequency: js.UndefOr[RecurringChargeFrequency]
  }

  object RecurringCharge {
    def apply(
      cost: js.UndefOr[MonetaryAmount] = js.undefined,
      frequency: js.UndefOr[RecurringChargeFrequency] = js.undefined): RecurringCharge = {
      val _fields = IndexedSeq[(String, js.Any)](
        "cost" -> cost.map { x => x.asInstanceOf[js.Any] },
        "frequency" -> frequency.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RecurringCharge]
    }
  }

  object RecurringChargeFrequencyEnum {
    val MONTHLY = "MONTHLY"

    val values = IndexedSeq(MONTHLY)
  }

  /**
   * <p>Represents information about the remote access session.</p>
   */
  @js.native
  trait RemoteAccessSession extends js.Object {
    var billingMethod: js.UndefOr[BillingMethod]
    var arn: js.UndefOr[AmazonResourceName]
    var name: js.UndefOr[Name]
    var clientId: js.UndefOr[ClientId]
    var result: js.UndefOr[ExecutionResult]
    var remoteRecordEnabled: js.UndefOr[Boolean]
    var skipAppResign: js.UndefOr[SkipAppResign]
    var remoteDebugEnabled: js.UndefOr[Boolean]
    var status: js.UndefOr[ExecutionStatus]
    var deviceMinutes: js.UndefOr[DeviceMinutes]
    var stopped: js.UndefOr[DateTime]
    var endpoint: js.UndefOr[String]
    var interactionMode: js.UndefOr[InteractionMode]
    var remoteRecordAppArn: js.UndefOr[AmazonResourceName]
    var message: js.UndefOr[Message]
    var deviceUdid: js.UndefOr[String]
    var hostAddress: js.UndefOr[HostAddress]
    var started: js.UndefOr[DateTime]
    var instanceArn: js.UndefOr[AmazonResourceName]
    var device: js.UndefOr[Device]
    var created: js.UndefOr[DateTime]
  }

  object RemoteAccessSession {
    def apply(
      billingMethod: js.UndefOr[BillingMethod] = js.undefined,
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      clientId: js.UndefOr[ClientId] = js.undefined,
      result: js.UndefOr[ExecutionResult] = js.undefined,
      remoteRecordEnabled: js.UndefOr[Boolean] = js.undefined,
      skipAppResign: js.UndefOr[SkipAppResign] = js.undefined,
      remoteDebugEnabled: js.UndefOr[Boolean] = js.undefined,
      status: js.UndefOr[ExecutionStatus] = js.undefined,
      deviceMinutes: js.UndefOr[DeviceMinutes] = js.undefined,
      stopped: js.UndefOr[DateTime] = js.undefined,
      endpoint: js.UndefOr[String] = js.undefined,
      interactionMode: js.UndefOr[InteractionMode] = js.undefined,
      remoteRecordAppArn: js.UndefOr[AmazonResourceName] = js.undefined,
      message: js.UndefOr[Message] = js.undefined,
      deviceUdid: js.UndefOr[String] = js.undefined,
      hostAddress: js.UndefOr[HostAddress] = js.undefined,
      started: js.UndefOr[DateTime] = js.undefined,
      instanceArn: js.UndefOr[AmazonResourceName] = js.undefined,
      device: js.UndefOr[Device] = js.undefined,
      created: js.UndefOr[DateTime] = js.undefined): RemoteAccessSession = {
      val _fields = IndexedSeq[(String, js.Any)](
        "billingMethod" -> billingMethod.map { x => x.asInstanceOf[js.Any] },
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "clientId" -> clientId.map { x => x.asInstanceOf[js.Any] },
        "result" -> result.map { x => x.asInstanceOf[js.Any] },
        "remoteRecordEnabled" -> remoteRecordEnabled.map { x => x.asInstanceOf[js.Any] },
        "skipAppResign" -> skipAppResign.map { x => x.asInstanceOf[js.Any] },
        "remoteDebugEnabled" -> remoteDebugEnabled.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "deviceMinutes" -> deviceMinutes.map { x => x.asInstanceOf[js.Any] },
        "stopped" -> stopped.map { x => x.asInstanceOf[js.Any] },
        "endpoint" -> endpoint.map { x => x.asInstanceOf[js.Any] },
        "interactionMode" -> interactionMode.map { x => x.asInstanceOf[js.Any] },
        "remoteRecordAppArn" -> remoteRecordAppArn.map { x => x.asInstanceOf[js.Any] },
        "message" -> message.map { x => x.asInstanceOf[js.Any] },
        "deviceUdid" -> deviceUdid.map { x => x.asInstanceOf[js.Any] },
        "hostAddress" -> hostAddress.map { x => x.asInstanceOf[js.Any] },
        "started" -> started.map { x => x.asInstanceOf[js.Any] },
        "instanceArn" -> instanceArn.map { x => x.asInstanceOf[js.Any] },
        "device" -> device.map { x => x.asInstanceOf[js.Any] },
        "created" -> created.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoteAccessSession]
    }
  }

  /**
   * <p>A request representing an offering renewal.</p>
   */
  @js.native
  trait RenewOfferingRequest extends js.Object {
    var offeringId: js.UndefOr[OfferingIdentifier]
    var quantity: js.UndefOr[Int]
  }

  object RenewOfferingRequest {
    def apply(
      offeringId: js.UndefOr[OfferingIdentifier] = js.undefined,
      quantity: js.UndefOr[Int] = js.undefined): RenewOfferingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "offeringId" -> offeringId.map { x => x.asInstanceOf[js.Any] },
        "quantity" -> quantity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RenewOfferingRequest]
    }
  }

  /**
   * <p>The result of a renewal offering.</p>
   */
  @js.native
  trait RenewOfferingResult extends js.Object {
    var offeringTransaction: js.UndefOr[OfferingTransaction]
  }

  object RenewOfferingResult {
    def apply(
      offeringTransaction: js.UndefOr[OfferingTransaction] = js.undefined): RenewOfferingResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "offeringTransaction" -> offeringTransaction.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RenewOfferingResult]
    }
  }

  /**
   * <p>Represents the screen resolution of a device in height and width, expressed in pixels.</p>
   */
  @js.native
  trait Resolution extends js.Object {
    var width: js.UndefOr[Int]
    var height: js.UndefOr[Int]
  }

  object Resolution {
    def apply(
      width: js.UndefOr[Int] = js.undefined,
      height: js.UndefOr[Int] = js.undefined): Resolution = {
      val _fields = IndexedSeq[(String, js.Any)](
        "width" -> width.map { x => x.asInstanceOf[js.Any] },
        "height" -> height.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Resolution]
    }
  }

  /**
   * <p>Represents a condition for a device pool.</p>
   */
  @js.native
  trait Rule extends js.Object {
    var attribute: js.UndefOr[DeviceAttribute]
    var operator: js.UndefOr[RuleOperator]
    var value: js.UndefOr[String]
  }

  object Rule {
    def apply(
      attribute: js.UndefOr[DeviceAttribute] = js.undefined,
      operator: js.UndefOr[RuleOperator] = js.undefined,
      value: js.UndefOr[String] = js.undefined): Rule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "attribute" -> attribute.map { x => x.asInstanceOf[js.Any] },
        "operator" -> operator.map { x => x.asInstanceOf[js.Any] },
        "value" -> value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Rule]
    }
  }

  object RuleOperatorEnum {
    val EQUALS = "EQUALS"
    val LESS_THAN = "LESS_THAN"
    val GREATER_THAN = "GREATER_THAN"
    val IN = "IN"
    val NOT_IN = "NOT_IN"
    val CONTAINS = "CONTAINS"

    val values = IndexedSeq(EQUALS, LESS_THAN, GREATER_THAN, IN, NOT_IN, CONTAINS)
  }

  /**
   * <p>Represents a test run on a set of devices with a given app package, test parameters, etc.</p>
   */
  @js.native
  trait Run extends js.Object {
    var customerArtifactPaths: js.UndefOr[CustomerArtifactPaths]
    var billingMethod: js.UndefOr[BillingMethod]
    var networkProfile: js.UndefOr[NetworkProfile]
    var arn: js.UndefOr[AmazonResourceName]
    var name: js.UndefOr[Name]
    var webUrl: js.UndefOr[String]
    var testSpecArn: js.UndefOr[AmazonResourceName]
    var location: js.UndefOr[Location]
    var seed: js.UndefOr[Int]
    var counters: js.UndefOr[Counters]
    var appUpload: js.UndefOr[AmazonResourceName]
    var result: js.UndefOr[ExecutionResult]
    var skipAppResign: js.UndefOr[SkipAppResign]
    var completedJobs: js.UndefOr[Int]
    var jobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes]
    var locale: js.UndefOr[String]
    var eventCount: js.UndefOr[Int]
    var totalJobs: js.UndefOr[Int]
    var status: js.UndefOr[ExecutionStatus]
    var deviceMinutes: js.UndefOr[DeviceMinutes]
    var parsingResultUrl: js.UndefOr[String]
    var stopped: js.UndefOr[DateTime]
    var message: js.UndefOr[Message]
    var resultCode: js.UndefOr[ExecutionResultCode]
    var `type`: js.UndefOr[TestType]
    var platform: js.UndefOr[DevicePlatform]
    var started: js.UndefOr[DateTime]
    var radios: js.UndefOr[Radios]
    var created: js.UndefOr[DateTime]
    var devicePoolArn: js.UndefOr[AmazonResourceName]
  }

  object Run {
    def apply(
      customerArtifactPaths: js.UndefOr[CustomerArtifactPaths] = js.undefined,
      billingMethod: js.UndefOr[BillingMethod] = js.undefined,
      networkProfile: js.UndefOr[NetworkProfile] = js.undefined,
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      webUrl: js.UndefOr[String] = js.undefined,
      testSpecArn: js.UndefOr[AmazonResourceName] = js.undefined,
      location: js.UndefOr[Location] = js.undefined,
      seed: js.UndefOr[Int] = js.undefined,
      counters: js.UndefOr[Counters] = js.undefined,
      appUpload: js.UndefOr[AmazonResourceName] = js.undefined,
      result: js.UndefOr[ExecutionResult] = js.undefined,
      skipAppResign: js.UndefOr[SkipAppResign] = js.undefined,
      completedJobs: js.UndefOr[Int] = js.undefined,
      jobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.undefined,
      locale: js.UndefOr[String] = js.undefined,
      eventCount: js.UndefOr[Int] = js.undefined,
      totalJobs: js.UndefOr[Int] = js.undefined,
      status: js.UndefOr[ExecutionStatus] = js.undefined,
      deviceMinutes: js.UndefOr[DeviceMinutes] = js.undefined,
      parsingResultUrl: js.UndefOr[String] = js.undefined,
      stopped: js.UndefOr[DateTime] = js.undefined,
      message: js.UndefOr[Message] = js.undefined,
      resultCode: js.UndefOr[ExecutionResultCode] = js.undefined,
      `type`: js.UndefOr[TestType] = js.undefined,
      platform: js.UndefOr[DevicePlatform] = js.undefined,
      started: js.UndefOr[DateTime] = js.undefined,
      radios: js.UndefOr[Radios] = js.undefined,
      created: js.UndefOr[DateTime] = js.undefined,
      devicePoolArn: js.UndefOr[AmazonResourceName] = js.undefined): Run = {
      val _fields = IndexedSeq[(String, js.Any)](
        "customerArtifactPaths" -> customerArtifactPaths.map { x => x.asInstanceOf[js.Any] },
        "billingMethod" -> billingMethod.map { x => x.asInstanceOf[js.Any] },
        "networkProfile" -> networkProfile.map { x => x.asInstanceOf[js.Any] },
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "webUrl" -> webUrl.map { x => x.asInstanceOf[js.Any] },
        "testSpecArn" -> testSpecArn.map { x => x.asInstanceOf[js.Any] },
        "location" -> location.map { x => x.asInstanceOf[js.Any] },
        "seed" -> seed.map { x => x.asInstanceOf[js.Any] },
        "counters" -> counters.map { x => x.asInstanceOf[js.Any] },
        "appUpload" -> appUpload.map { x => x.asInstanceOf[js.Any] },
        "result" -> result.map { x => x.asInstanceOf[js.Any] },
        "skipAppResign" -> skipAppResign.map { x => x.asInstanceOf[js.Any] },
        "completedJobs" -> completedJobs.map { x => x.asInstanceOf[js.Any] },
        "jobTimeoutMinutes" -> jobTimeoutMinutes.map { x => x.asInstanceOf[js.Any] },
        "locale" -> locale.map { x => x.asInstanceOf[js.Any] },
        "eventCount" -> eventCount.map { x => x.asInstanceOf[js.Any] },
        "totalJobs" -> totalJobs.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "deviceMinutes" -> deviceMinutes.map { x => x.asInstanceOf[js.Any] },
        "parsingResultUrl" -> parsingResultUrl.map { x => x.asInstanceOf[js.Any] },
        "stopped" -> stopped.map { x => x.asInstanceOf[js.Any] },
        "message" -> message.map { x => x.asInstanceOf[js.Any] },
        "resultCode" -> resultCode.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "platform" -> platform.map { x => x.asInstanceOf[js.Any] },
        "started" -> started.map { x => x.asInstanceOf[js.Any] },
        "radios" -> radios.map { x => x.asInstanceOf[js.Any] },
        "created" -> created.map { x => x.asInstanceOf[js.Any] },
        "devicePoolArn" -> devicePoolArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Run]
    }
  }

  /**
   * <p>Represents a sample of performance data.</p>
   */
  @js.native
  trait Sample extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var `type`: js.UndefOr[SampleType]
    var url: js.UndefOr[URL]
  }

  object Sample {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      `type`: js.UndefOr[SampleType] = js.undefined,
      url: js.UndefOr[URL] = js.undefined): Sample = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "url" -> url.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Sample]
    }
  }

  object SampleTypeEnum {
    val CPU = "CPU"
    val MEMORY = "MEMORY"
    val THREADS = "THREADS"
    val RX_RATE = "RX_RATE"
    val TX_RATE = "TX_RATE"
    val RX = "RX"
    val TX = "TX"
    val NATIVE_FRAMES = "NATIVE_FRAMES"
    val NATIVE_FPS = "NATIVE_FPS"
    val NATIVE_MIN_DRAWTIME = "NATIVE_MIN_DRAWTIME"
    val NATIVE_AVG_DRAWTIME = "NATIVE_AVG_DRAWTIME"
    val NATIVE_MAX_DRAWTIME = "NATIVE_MAX_DRAWTIME"
    val OPENGL_FRAMES = "OPENGL_FRAMES"
    val OPENGL_FPS = "OPENGL_FPS"
    val OPENGL_MIN_DRAWTIME = "OPENGL_MIN_DRAWTIME"
    val OPENGL_AVG_DRAWTIME = "OPENGL_AVG_DRAWTIME"
    val OPENGL_MAX_DRAWTIME = "OPENGL_MAX_DRAWTIME"

    val values = IndexedSeq(CPU, MEMORY, THREADS, RX_RATE, TX_RATE, RX, TX, NATIVE_FRAMES, NATIVE_FPS, NATIVE_MIN_DRAWTIME, NATIVE_AVG_DRAWTIME, NATIVE_MAX_DRAWTIME, OPENGL_FRAMES, OPENGL_FPS, OPENGL_MIN_DRAWTIME, OPENGL_AVG_DRAWTIME, OPENGL_MAX_DRAWTIME)
  }

  /**
   * <p>Represents the settings for a run. Includes things like location, radio states, auxiliary apps, and network profiles.</p>
   */
  @js.native
  trait ScheduleRunConfiguration extends js.Object {
    var customerArtifactPaths: js.UndefOr[CustomerArtifactPaths]
    var billingMethod: js.UndefOr[BillingMethod]
    var location: js.UndefOr[Location]
    var vpceConfigurationArns: js.UndefOr[AmazonResourceNames]
    var locale: js.UndefOr[String]
    var auxiliaryApps: js.UndefOr[AmazonResourceNames]
    var networkProfileArn: js.UndefOr[AmazonResourceName]
    var extraDataPackageArn: js.UndefOr[AmazonResourceName]
    var radios: js.UndefOr[Radios]
  }

  object ScheduleRunConfiguration {
    def apply(
      customerArtifactPaths: js.UndefOr[CustomerArtifactPaths] = js.undefined,
      billingMethod: js.UndefOr[BillingMethod] = js.undefined,
      location: js.UndefOr[Location] = js.undefined,
      vpceConfigurationArns: js.UndefOr[AmazonResourceNames] = js.undefined,
      locale: js.UndefOr[String] = js.undefined,
      auxiliaryApps: js.UndefOr[AmazonResourceNames] = js.undefined,
      networkProfileArn: js.UndefOr[AmazonResourceName] = js.undefined,
      extraDataPackageArn: js.UndefOr[AmazonResourceName] = js.undefined,
      radios: js.UndefOr[Radios] = js.undefined): ScheduleRunConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "customerArtifactPaths" -> customerArtifactPaths.map { x => x.asInstanceOf[js.Any] },
        "billingMethod" -> billingMethod.map { x => x.asInstanceOf[js.Any] },
        "location" -> location.map { x => x.asInstanceOf[js.Any] },
        "vpceConfigurationArns" -> vpceConfigurationArns.map { x => x.asInstanceOf[js.Any] },
        "locale" -> locale.map { x => x.asInstanceOf[js.Any] },
        "auxiliaryApps" -> auxiliaryApps.map { x => x.asInstanceOf[js.Any] },
        "networkProfileArn" -> networkProfileArn.map { x => x.asInstanceOf[js.Any] },
        "extraDataPackageArn" -> extraDataPackageArn.map { x => x.asInstanceOf[js.Any] },
        "radios" -> radios.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduleRunConfiguration]
    }
  }

  /**
   * <p>Represents a request to the schedule run operation.</p>
   */
  @js.native
  trait ScheduleRunRequest extends js.Object {
    var test: js.UndefOr[ScheduleRunTest]
    var name: js.UndefOr[Name]
    var projectArn: js.UndefOr[AmazonResourceName]
    var configuration: js.UndefOr[ScheduleRunConfiguration]
    var appArn: js.UndefOr[AmazonResourceName]
    var executionConfiguration: js.UndefOr[ExecutionConfiguration]
    var devicePoolArn: js.UndefOr[AmazonResourceName]
  }

  object ScheduleRunRequest {
    def apply(
      test: js.UndefOr[ScheduleRunTest] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      projectArn: js.UndefOr[AmazonResourceName] = js.undefined,
      configuration: js.UndefOr[ScheduleRunConfiguration] = js.undefined,
      appArn: js.UndefOr[AmazonResourceName] = js.undefined,
      executionConfiguration: js.UndefOr[ExecutionConfiguration] = js.undefined,
      devicePoolArn: js.UndefOr[AmazonResourceName] = js.undefined): ScheduleRunRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "test" -> test.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "projectArn" -> projectArn.map { x => x.asInstanceOf[js.Any] },
        "configuration" -> configuration.map { x => x.asInstanceOf[js.Any] },
        "appArn" -> appArn.map { x => x.asInstanceOf[js.Any] },
        "executionConfiguration" -> executionConfiguration.map { x => x.asInstanceOf[js.Any] },
        "devicePoolArn" -> devicePoolArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduleRunRequest]
    }
  }

  /**
   * <p>Represents the result of a schedule run request.</p>
   */
  @js.native
  trait ScheduleRunResult extends js.Object {
    var run: js.UndefOr[Run]
  }

  object ScheduleRunResult {
    def apply(
      run: js.UndefOr[Run] = js.undefined): ScheduleRunResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "run" -> run.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduleRunResult]
    }
  }

  /**
   * <p>Represents additional test settings.</p>
   */
  @js.native
  trait ScheduleRunTest extends js.Object {
    var testSpecArn: js.UndefOr[AmazonResourceName]
    var testPackageArn: js.UndefOr[AmazonResourceName]
    var filter: js.UndefOr[Filter]
    var `type`: js.UndefOr[TestType]
    var parameters: js.UndefOr[TestParameters]
  }

  object ScheduleRunTest {
    def apply(
      testSpecArn: js.UndefOr[AmazonResourceName] = js.undefined,
      testPackageArn: js.UndefOr[AmazonResourceName] = js.undefined,
      filter: js.UndefOr[Filter] = js.undefined,
      `type`: js.UndefOr[TestType] = js.undefined,
      parameters: js.UndefOr[TestParameters] = js.undefined): ScheduleRunTest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "testSpecArn" -> testSpecArn.map { x => x.asInstanceOf[js.Any] },
        "testPackageArn" -> testPackageArn.map { x => x.asInstanceOf[js.Any] },
        "filter" -> filter.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "parameters" -> parameters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScheduleRunTest]
    }
  }

  /**
   * <p>There was a problem with the service account.</p>
   */
  @js.native
  trait ServiceAccountExceptionException extends js.Object {
    val message: Message
  }

  @js.native
  trait StopJobRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
  }

  object StopJobRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined): StopJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopJobRequest]
    }
  }

  @js.native
  trait StopJobResult extends js.Object {
    var job: js.UndefOr[Job]
  }

  object StopJobResult {
    def apply(
      job: js.UndefOr[Job] = js.undefined): StopJobResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "job" -> job.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopJobResult]
    }
  }

  /**
   * <p>Represents the request to stop the remote access session.</p>
   */
  @js.native
  trait StopRemoteAccessSessionRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
  }

  object StopRemoteAccessSessionRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined): StopRemoteAccessSessionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopRemoteAccessSessionRequest]
    }
  }

  /**
   * <p>Represents the response from the server that describes the remote access session when AWS Device Farm stops the session.</p>
   */
  @js.native
  trait StopRemoteAccessSessionResult extends js.Object {
    var remoteAccessSession: js.UndefOr[RemoteAccessSession]
  }

  object StopRemoteAccessSessionResult {
    def apply(
      remoteAccessSession: js.UndefOr[RemoteAccessSession] = js.undefined): StopRemoteAccessSessionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "remoteAccessSession" -> remoteAccessSession.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopRemoteAccessSessionResult]
    }
  }

  /**
   * <p>Represents the request to stop a specific run.</p>
   */
  @js.native
  trait StopRunRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
  }

  object StopRunRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined): StopRunRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopRunRequest]
    }
  }

  /**
   * <p>Represents the results of your stop run attempt.</p>
   */
  @js.native
  trait StopRunResult extends js.Object {
    var run: js.UndefOr[Run]
  }

  object StopRunResult {
    def apply(
      run: js.UndefOr[Run] = js.undefined): StopRunResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "run" -> run.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopRunResult]
    }
  }

  /**
   * <p>Represents a collection of one or more tests.</p>
   */
  @js.native
  trait Suite extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var name: js.UndefOr[Name]
    var counters: js.UndefOr[Counters]
    var result: js.UndefOr[ExecutionResult]
    var status: js.UndefOr[ExecutionStatus]
    var deviceMinutes: js.UndefOr[DeviceMinutes]
    var stopped: js.UndefOr[DateTime]
    var message: js.UndefOr[Message]
    var `type`: js.UndefOr[TestType]
    var started: js.UndefOr[DateTime]
    var created: js.UndefOr[DateTime]
  }

  object Suite {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      counters: js.UndefOr[Counters] = js.undefined,
      result: js.UndefOr[ExecutionResult] = js.undefined,
      status: js.UndefOr[ExecutionStatus] = js.undefined,
      deviceMinutes: js.UndefOr[DeviceMinutes] = js.undefined,
      stopped: js.UndefOr[DateTime] = js.undefined,
      message: js.UndefOr[Message] = js.undefined,
      `type`: js.UndefOr[TestType] = js.undefined,
      started: js.UndefOr[DateTime] = js.undefined,
      created: js.UndefOr[DateTime] = js.undefined): Suite = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "counters" -> counters.map { x => x.asInstanceOf[js.Any] },
        "result" -> result.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "deviceMinutes" -> deviceMinutes.map { x => x.asInstanceOf[js.Any] },
        "stopped" -> stopped.map { x => x.asInstanceOf[js.Any] },
        "message" -> message.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "started" -> started.map { x => x.asInstanceOf[js.Any] },
        "created" -> created.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Suite]
    }
  }

  /**
   * <p>Represents a condition that is evaluated.</p>
   */
  @js.native
  trait Test extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var name: js.UndefOr[Name]
    var counters: js.UndefOr[Counters]
    var result: js.UndefOr[ExecutionResult]
    var status: js.UndefOr[ExecutionStatus]
    var deviceMinutes: js.UndefOr[DeviceMinutes]
    var stopped: js.UndefOr[DateTime]
    var message: js.UndefOr[Message]
    var `type`: js.UndefOr[TestType]
    var started: js.UndefOr[DateTime]
    var created: js.UndefOr[DateTime]
  }

  object Test {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      counters: js.UndefOr[Counters] = js.undefined,
      result: js.UndefOr[ExecutionResult] = js.undefined,
      status: js.UndefOr[ExecutionStatus] = js.undefined,
      deviceMinutes: js.UndefOr[DeviceMinutes] = js.undefined,
      stopped: js.UndefOr[DateTime] = js.undefined,
      message: js.UndefOr[Message] = js.undefined,
      `type`: js.UndefOr[TestType] = js.undefined,
      started: js.UndefOr[DateTime] = js.undefined,
      created: js.UndefOr[DateTime] = js.undefined): Test = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "counters" -> counters.map { x => x.asInstanceOf[js.Any] },
        "result" -> result.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "deviceMinutes" -> deviceMinutes.map { x => x.asInstanceOf[js.Any] },
        "stopped" -> stopped.map { x => x.asInstanceOf[js.Any] },
        "message" -> message.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "started" -> started.map { x => x.asInstanceOf[js.Any] },
        "created" -> created.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Test]
    }
  }

  object TestTypeEnum {
    val BUILTIN_FUZZ = "BUILTIN_FUZZ"
    val BUILTIN_EXPLORER = "BUILTIN_EXPLORER"
    val WEB_PERFORMANCE_PROFILE = "WEB_PERFORMANCE_PROFILE"
    val APPIUM_JAVA_JUNIT = "APPIUM_JAVA_JUNIT"
    val APPIUM_JAVA_TESTNG = "APPIUM_JAVA_TESTNG"
    val APPIUM_PYTHON = "APPIUM_PYTHON"
    val APPIUM_WEB_JAVA_JUNIT = "APPIUM_WEB_JAVA_JUNIT"
    val APPIUM_WEB_JAVA_TESTNG = "APPIUM_WEB_JAVA_TESTNG"
    val APPIUM_WEB_PYTHON = "APPIUM_WEB_PYTHON"
    val CALABASH = "CALABASH"
    val INSTRUMENTATION = "INSTRUMENTATION"
    val UIAUTOMATION = "UIAUTOMATION"
    val UIAUTOMATOR = "UIAUTOMATOR"
    val XCTEST = "XCTEST"
    val XCTEST_UI = "XCTEST_UI"
    val REMOTE_ACCESS_RECORD = "REMOTE_ACCESS_RECORD"
    val REMOTE_ACCESS_REPLAY = "REMOTE_ACCESS_REPLAY"

    val values = IndexedSeq(BUILTIN_FUZZ, BUILTIN_EXPLORER, WEB_PERFORMANCE_PROFILE, APPIUM_JAVA_JUNIT, APPIUM_JAVA_TESTNG, APPIUM_PYTHON, APPIUM_WEB_JAVA_JUNIT, APPIUM_WEB_JAVA_TESTNG, APPIUM_WEB_PYTHON, CALABASH, INSTRUMENTATION, UIAUTOMATION, UIAUTOMATOR, XCTEST, XCTEST_UI, REMOTE_ACCESS_RECORD, REMOTE_ACCESS_REPLAY)
  }

  /**
   * <p>Represents information about free trial device minutes for an AWS account.</p>
   */
  @js.native
  trait TrialMinutes extends js.Object {
    var total: js.UndefOr[Double]
    var remaining: js.UndefOr[Double]
  }

  object TrialMinutes {
    def apply(
      total: js.UndefOr[Double] = js.undefined,
      remaining: js.UndefOr[Double] = js.undefined): TrialMinutes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "total" -> total.map { x => x.asInstanceOf[js.Any] },
        "remaining" -> remaining.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TrialMinutes]
    }
  }

  /**
   * <p>A collection of one or more problems, grouped by their result.</p>
   */
  @js.native
  trait UniqueProblem extends js.Object {
    var message: js.UndefOr[Message]
    var problems: js.UndefOr[Problems]
  }

  object UniqueProblem {
    def apply(
      message: js.UndefOr[Message] = js.undefined,
      problems: js.UndefOr[Problems] = js.undefined): UniqueProblem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "message" -> message.map { x => x.asInstanceOf[js.Any] },
        "problems" -> problems.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UniqueProblem]
    }
  }

  @js.native
  trait UpdateDeviceInstanceRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var profileArn: js.UndefOr[AmazonResourceName]
    var labels: js.UndefOr[InstanceLabels]
  }

  object UpdateDeviceInstanceRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      profileArn: js.UndefOr[AmazonResourceName] = js.undefined,
      labels: js.UndefOr[InstanceLabels] = js.undefined): UpdateDeviceInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "profileArn" -> profileArn.map { x => x.asInstanceOf[js.Any] },
        "labels" -> labels.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDeviceInstanceRequest]
    }
  }

  @js.native
  trait UpdateDeviceInstanceResult extends js.Object {
    var deviceInstance: js.UndefOr[DeviceInstance]
  }

  object UpdateDeviceInstanceResult {
    def apply(
      deviceInstance: js.UndefOr[DeviceInstance] = js.undefined): UpdateDeviceInstanceResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "deviceInstance" -> deviceInstance.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDeviceInstanceResult]
    }
  }

  /**
   * <p>Represents a request to the update device pool operation.</p>
   */
  @js.native
  trait UpdateDevicePoolRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var name: js.UndefOr[Name]
    var description: js.UndefOr[Message]
    var rules: js.UndefOr[Rules]
  }

  object UpdateDevicePoolRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      description: js.UndefOr[Message] = js.undefined,
      rules: js.UndefOr[Rules] = js.undefined): UpdateDevicePoolRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "rules" -> rules.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDevicePoolRequest]
    }
  }

  /**
   * <p>Represents the result of an update device pool request.</p>
   */
  @js.native
  trait UpdateDevicePoolResult extends js.Object {
    var devicePool: js.UndefOr[DevicePool]
  }

  object UpdateDevicePoolResult {
    def apply(
      devicePool: js.UndefOr[DevicePool] = js.undefined): UpdateDevicePoolResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "devicePool" -> devicePool.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDevicePoolResult]
    }
  }

  @js.native
  trait UpdateInstanceProfileRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var name: js.UndefOr[Name]
    var description: js.UndefOr[Message]
    var packageCleanup: js.UndefOr[Boolean]
    var excludeAppPackagesFromCleanup: js.UndefOr[PackageIds]
    var rebootAfterUse: js.UndefOr[Boolean]
  }

  object UpdateInstanceProfileRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      description: js.UndefOr[Message] = js.undefined,
      packageCleanup: js.UndefOr[Boolean] = js.undefined,
      excludeAppPackagesFromCleanup: js.UndefOr[PackageIds] = js.undefined,
      rebootAfterUse: js.UndefOr[Boolean] = js.undefined): UpdateInstanceProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "packageCleanup" -> packageCleanup.map { x => x.asInstanceOf[js.Any] },
        "excludeAppPackagesFromCleanup" -> excludeAppPackagesFromCleanup.map { x => x.asInstanceOf[js.Any] },
        "rebootAfterUse" -> rebootAfterUse.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateInstanceProfileRequest]
    }
  }

  @js.native
  trait UpdateInstanceProfileResult extends js.Object {
    var instanceProfile: js.UndefOr[InstanceProfile]
  }

  object UpdateInstanceProfileResult {
    def apply(
      instanceProfile: js.UndefOr[InstanceProfile] = js.undefined): UpdateInstanceProfileResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "instanceProfile" -> instanceProfile.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateInstanceProfileResult]
    }
  }

  @js.native
  trait UpdateNetworkProfileRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var name: js.UndefOr[Name]
    var downlinkDelayMs: js.UndefOr[Double]
    var uplinkLossPercent: js.UndefOr[PercentInteger]
    var description: js.UndefOr[Message]
    var downlinkLossPercent: js.UndefOr[PercentInteger]
    var uplinkJitterMs: js.UndefOr[Double]
    var uplinkBandwidthBits: js.UndefOr[Double]
    var uplinkDelayMs: js.UndefOr[Double]
    var `type`: js.UndefOr[NetworkProfileType]
    var downlinkJitterMs: js.UndefOr[Double]
    var downlinkBandwidthBits: js.UndefOr[Double]
  }

  object UpdateNetworkProfileRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      downlinkDelayMs: js.UndefOr[Double] = js.undefined,
      uplinkLossPercent: js.UndefOr[PercentInteger] = js.undefined,
      description: js.UndefOr[Message] = js.undefined,
      downlinkLossPercent: js.UndefOr[PercentInteger] = js.undefined,
      uplinkJitterMs: js.UndefOr[Double] = js.undefined,
      uplinkBandwidthBits: js.UndefOr[Double] = js.undefined,
      uplinkDelayMs: js.UndefOr[Double] = js.undefined,
      `type`: js.UndefOr[NetworkProfileType] = js.undefined,
      downlinkJitterMs: js.UndefOr[Double] = js.undefined,
      downlinkBandwidthBits: js.UndefOr[Double] = js.undefined): UpdateNetworkProfileRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "downlinkDelayMs" -> downlinkDelayMs.map { x => x.asInstanceOf[js.Any] },
        "uplinkLossPercent" -> uplinkLossPercent.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "downlinkLossPercent" -> downlinkLossPercent.map { x => x.asInstanceOf[js.Any] },
        "uplinkJitterMs" -> uplinkJitterMs.map { x => x.asInstanceOf[js.Any] },
        "uplinkBandwidthBits" -> uplinkBandwidthBits.map { x => x.asInstanceOf[js.Any] },
        "uplinkDelayMs" -> uplinkDelayMs.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "downlinkJitterMs" -> downlinkJitterMs.map { x => x.asInstanceOf[js.Any] },
        "downlinkBandwidthBits" -> downlinkBandwidthBits.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateNetworkProfileRequest]
    }
  }

  @js.native
  trait UpdateNetworkProfileResult extends js.Object {
    var networkProfile: js.UndefOr[NetworkProfile]
  }

  object UpdateNetworkProfileResult {
    def apply(
      networkProfile: js.UndefOr[NetworkProfile] = js.undefined): UpdateNetworkProfileResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "networkProfile" -> networkProfile.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateNetworkProfileResult]
    }
  }

  /**
   * <p>Represents a request to the update project operation.</p>
   */
  @js.native
  trait UpdateProjectRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var name: js.UndefOr[Name]
    var defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes]
  }

  object UpdateProjectRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.undefined): UpdateProjectRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "defaultJobTimeoutMinutes" -> defaultJobTimeoutMinutes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateProjectRequest]
    }
  }

  /**
   * <p>Represents the result of an update project request.</p>
   */
  @js.native
  trait UpdateProjectResult extends js.Object {
    var project: js.UndefOr[Project]
  }

  object UpdateProjectResult {
    def apply(
      project: js.UndefOr[Project] = js.undefined): UpdateProjectResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "project" -> project.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateProjectResult]
    }
  }

  @js.native
  trait UpdateUploadRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var name: js.UndefOr[Name]
    var contentType: js.UndefOr[ContentType]
    var editContent: js.UndefOr[Boolean]
  }

  object UpdateUploadRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      contentType: js.UndefOr[ContentType] = js.undefined,
      editContent: js.UndefOr[Boolean] = js.undefined): UpdateUploadRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "contentType" -> contentType.map { x => x.asInstanceOf[js.Any] },
        "editContent" -> editContent.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUploadRequest]
    }
  }

  @js.native
  trait UpdateUploadResult extends js.Object {
    var upload: js.UndefOr[Upload]
  }

  object UpdateUploadResult {
    def apply(
      upload: js.UndefOr[Upload] = js.undefined): UpdateUploadResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "upload" -> upload.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUploadResult]
    }
  }

  @js.native
  trait UpdateVPCEConfigurationRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var serviceDnsName: js.UndefOr[ServiceDnsName]
    var vpceServiceName: js.UndefOr[VPCEServiceName]
    var vpceConfigurationName: js.UndefOr[VPCEConfigurationName]
    var vpceConfigurationDescription: js.UndefOr[VPCEConfigurationDescription]
  }

  object UpdateVPCEConfigurationRequest {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      serviceDnsName: js.UndefOr[ServiceDnsName] = js.undefined,
      vpceServiceName: js.UndefOr[VPCEServiceName] = js.undefined,
      vpceConfigurationName: js.UndefOr[VPCEConfigurationName] = js.undefined,
      vpceConfigurationDescription: js.UndefOr[VPCEConfigurationDescription] = js.undefined): UpdateVPCEConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "serviceDnsName" -> serviceDnsName.map { x => x.asInstanceOf[js.Any] },
        "vpceServiceName" -> vpceServiceName.map { x => x.asInstanceOf[js.Any] },
        "vpceConfigurationName" -> vpceConfigurationName.map { x => x.asInstanceOf[js.Any] },
        "vpceConfigurationDescription" -> vpceConfigurationDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateVPCEConfigurationRequest]
    }
  }

  @js.native
  trait UpdateVPCEConfigurationResult extends js.Object {
    var vpceConfiguration: js.UndefOr[VPCEConfiguration]
  }

  object UpdateVPCEConfigurationResult {
    def apply(
      vpceConfiguration: js.UndefOr[VPCEConfiguration] = js.undefined): UpdateVPCEConfigurationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "vpceConfiguration" -> vpceConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateVPCEConfigurationResult]
    }
  }

  /**
   * <p>An app or a set of one or more tests to upload or that have been uploaded.</p>
   */
  @js.native
  trait Upload extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var name: js.UndefOr[Name]
    var url: js.UndefOr[URL]
    var contentType: js.UndefOr[ContentType]
    var status: js.UndefOr[UploadStatus]
    var category: js.UndefOr[UploadCategory]
    var metadata: js.UndefOr[Metadata]
    var message: js.UndefOr[Message]
    var `type`: js.UndefOr[UploadType]
    var created: js.UndefOr[DateTime]
  }

  object Upload {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      name: js.UndefOr[Name] = js.undefined,
      url: js.UndefOr[URL] = js.undefined,
      contentType: js.UndefOr[ContentType] = js.undefined,
      status: js.UndefOr[UploadStatus] = js.undefined,
      category: js.UndefOr[UploadCategory] = js.undefined,
      metadata: js.UndefOr[Metadata] = js.undefined,
      message: js.UndefOr[Message] = js.undefined,
      `type`: js.UndefOr[UploadType] = js.undefined,
      created: js.UndefOr[DateTime] = js.undefined): Upload = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "url" -> url.map { x => x.asInstanceOf[js.Any] },
        "contentType" -> contentType.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "category" -> category.map { x => x.asInstanceOf[js.Any] },
        "metadata" -> metadata.map { x => x.asInstanceOf[js.Any] },
        "message" -> message.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "created" -> created.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Upload]
    }
  }

  object UploadCategoryEnum {
    val CURATED = "CURATED"
    val PRIVATE = "PRIVATE"

    val values = IndexedSeq(CURATED, PRIVATE)
  }

  object UploadStatusEnum {
    val INITIALIZED = "INITIALIZED"
    val PROCESSING = "PROCESSING"
    val SUCCEEDED = "SUCCEEDED"
    val FAILED = "FAILED"

    val values = IndexedSeq(INITIALIZED, PROCESSING, SUCCEEDED, FAILED)
  }

  object UploadTypeEnum {
    val ANDROID_APP = "ANDROID_APP"
    val IOS_APP = "IOS_APP"
    val WEB_APP = "WEB_APP"
    val EXTERNAL_DATA = "EXTERNAL_DATA"
    val APPIUM_JAVA_JUNIT_TEST_PACKAGE = "APPIUM_JAVA_JUNIT_TEST_PACKAGE"
    val APPIUM_JAVA_TESTNG_TEST_PACKAGE = "APPIUM_JAVA_TESTNG_TEST_PACKAGE"
    val APPIUM_PYTHON_TEST_PACKAGE = "APPIUM_PYTHON_TEST_PACKAGE"
    val APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE = "APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE"
    val APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE = "APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE"
    val APPIUM_WEB_PYTHON_TEST_PACKAGE = "APPIUM_WEB_PYTHON_TEST_PACKAGE"
    val CALABASH_TEST_PACKAGE = "CALABASH_TEST_PACKAGE"
    val INSTRUMENTATION_TEST_PACKAGE = "INSTRUMENTATION_TEST_PACKAGE"
    val UIAUTOMATION_TEST_PACKAGE = "UIAUTOMATION_TEST_PACKAGE"
    val UIAUTOMATOR_TEST_PACKAGE = "UIAUTOMATOR_TEST_PACKAGE"
    val XCTEST_TEST_PACKAGE = "XCTEST_TEST_PACKAGE"
    val XCTEST_UI_TEST_PACKAGE = "XCTEST_UI_TEST_PACKAGE"
    val APPIUM_JAVA_JUNIT_TEST_SPEC = "APPIUM_JAVA_JUNIT_TEST_SPEC"
    val APPIUM_JAVA_TESTNG_TEST_SPEC = "APPIUM_JAVA_TESTNG_TEST_SPEC"
    val APPIUM_PYTHON_TEST_SPEC = "APPIUM_PYTHON_TEST_SPEC"
    val APPIUM_WEB_JAVA_JUNIT_TEST_SPEC = "APPIUM_WEB_JAVA_JUNIT_TEST_SPEC"
    val APPIUM_WEB_JAVA_TESTNG_TEST_SPEC = "APPIUM_WEB_JAVA_TESTNG_TEST_SPEC"
    val APPIUM_WEB_PYTHON_TEST_SPEC = "APPIUM_WEB_PYTHON_TEST_SPEC"
    val INSTRUMENTATION_TEST_SPEC = "INSTRUMENTATION_TEST_SPEC"
    val XCTEST_UI_TEST_SPEC = "XCTEST_UI_TEST_SPEC"

    val values = IndexedSeq(ANDROID_APP, IOS_APP, WEB_APP, EXTERNAL_DATA, APPIUM_JAVA_JUNIT_TEST_PACKAGE, APPIUM_JAVA_TESTNG_TEST_PACKAGE, APPIUM_PYTHON_TEST_PACKAGE, APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE, APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE, APPIUM_WEB_PYTHON_TEST_PACKAGE, CALABASH_TEST_PACKAGE, INSTRUMENTATION_TEST_PACKAGE, UIAUTOMATION_TEST_PACKAGE, UIAUTOMATOR_TEST_PACKAGE, XCTEST_TEST_PACKAGE, XCTEST_UI_TEST_PACKAGE, APPIUM_JAVA_JUNIT_TEST_SPEC, APPIUM_JAVA_TESTNG_TEST_SPEC, APPIUM_PYTHON_TEST_SPEC, APPIUM_WEB_JAVA_JUNIT_TEST_SPEC, APPIUM_WEB_JAVA_TESTNG_TEST_SPEC, APPIUM_WEB_PYTHON_TEST_SPEC, INSTRUMENTATION_TEST_SPEC, XCTEST_UI_TEST_SPEC)
  }

  /**
   * <p>Represents an Amazon Virtual Private Cloud (VPC) endpoint configuration.</p>
   */
  @js.native
  trait VPCEConfiguration extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var serviceDnsName: js.UndefOr[ServiceDnsName]
    var vpceServiceName: js.UndefOr[VPCEServiceName]
    var vpceConfigurationName: js.UndefOr[VPCEConfigurationName]
    var vpceConfigurationDescription: js.UndefOr[VPCEConfigurationDescription]
  }

  object VPCEConfiguration {
    def apply(
      arn: js.UndefOr[AmazonResourceName] = js.undefined,
      serviceDnsName: js.UndefOr[ServiceDnsName] = js.undefined,
      vpceServiceName: js.UndefOr[VPCEServiceName] = js.undefined,
      vpceConfigurationName: js.UndefOr[VPCEConfigurationName] = js.undefined,
      vpceConfigurationDescription: js.UndefOr[VPCEConfigurationDescription] = js.undefined): VPCEConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "serviceDnsName" -> serviceDnsName.map { x => x.asInstanceOf[js.Any] },
        "vpceServiceName" -> vpceServiceName.map { x => x.asInstanceOf[js.Any] },
        "vpceConfigurationName" -> vpceConfigurationName.map { x => x.asInstanceOf[js.Any] },
        "vpceConfigurationDescription" -> vpceConfigurationDescription.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VPCEConfiguration]
    }
  }
}
