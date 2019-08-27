package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object devicefarm {
  type AWSAccountNumber                   = String
  type AccountsCleanup                    = Boolean
  type AmazonResourceName                 = String
  type AmazonResourceNames                = js.Array[AmazonResourceName]
  type AndroidPaths                       = js.Array[String]
  type AppPackagesCleanup                 = Boolean
  type ArtifactCategory                   = String
  type ArtifactType                       = String
  type Artifacts                          = js.Array[Artifact]
  type BillingMethod                      = String
  type ClientId                           = String
  type ContentType                        = String
  type CurrencyCode                       = String
  type DateTime                           = js.Date
  type DeviceAttribute                    = String
  type DeviceAvailability                 = String
  type DeviceFilterAttribute              = String
  type DeviceFilterValues                 = js.Array[String]
  type DeviceFilters                      = js.Array[DeviceFilter]
  type DeviceFormFactor                   = String
  type DeviceHostPaths                    = js.Array[String]
  type DeviceInstances                    = js.Array[DeviceInstance]
  type DevicePlatform                     = String
  type DevicePoolCompatibilityResults     = js.Array[DevicePoolCompatibilityResult]
  type DevicePoolType                     = String
  type DevicePools                        = js.Array[DevicePool]
  type Devices                            = js.Array[Device]
  type ExecutionResult                    = String
  type ExecutionResultCode                = String
  type ExecutionStatus                    = String
  type Filter                             = String
  type HostAddress                        = String
  type IncompatibilityMessages            = js.Array[IncompatibilityMessage]
  type InstanceLabels                     = js.Array[String]
  type InstanceProfiles                   = js.Array[InstanceProfile]
  type InstanceStatus                     = String
  type InteractionMode                    = String
  type IosPaths                           = js.Array[String]
  type JobTimeoutMinutes                  = Int
  type Jobs                               = js.Array[Job]
  type MaxSlotMap                         = js.Dictionary[Int]
  type Message                            = String
  type Metadata                           = String
  type Name                               = String
  type NetworkProfileType                 = String
  type NetworkProfiles                    = js.Array[NetworkProfile]
  type OfferingIdentifier                 = String
  type OfferingPromotionIdentifier        = String
  type OfferingPromotions                 = js.Array[OfferingPromotion]
  type OfferingStatusMap                  = js.Dictionary[OfferingStatus]
  type OfferingTransactionType            = String
  type OfferingTransactions               = js.Array[OfferingTransaction]
  type OfferingType                       = String
  type Offerings                          = js.Array[Offering]
  type PackageIds                         = js.Array[String]
  type PaginationToken                    = String
  type PercentInteger                     = Int
  type Problems                           = js.Array[Problem]
  type Projects                           = js.Array[Project]
  type PurchasedDevicesMap                = js.Dictionary[Int]
  type RecurringChargeFrequency           = String
  type RecurringCharges                   = js.Array[RecurringCharge]
  type RemoteAccessSessions               = js.Array[RemoteAccessSession]
  type RuleOperator                       = String
  type Rules                              = js.Array[Rule]
  type Runs                               = js.Array[Run]
  type SampleType                         = String
  type Samples                            = js.Array[Sample]
  type ServiceDnsName                     = String
  type SkipAppResign                      = Boolean
  type SshPublicKey                       = String
  type Suites                             = js.Array[Suite]
  type TagKey                             = String
  type TagKeyList                         = js.Array[TagKey]
  type TagList                            = js.Array[Tag]
  type TagValue                           = String
  type TestParameters                     = js.Dictionary[String]
  type TestType                           = String
  type Tests                              = js.Array[Test]
  type TransactionIdentifier              = String
  type URL                                = String
  type UniqueProblems                     = js.Array[UniqueProblem]
  type UniqueProblemsByExecutionResultMap = js.Dictionary[UniqueProblems]
  type UploadCategory                     = String
  type UploadStatus                       = String
  type UploadType                         = String
  type Uploads                            = js.Array[Upload]
  type VPCEConfigurationDescription       = String
  type VPCEConfigurationName              = String
  type VPCEConfigurations                 = js.Array[VPCEConfiguration]
  type VPCEServiceName                    = String
  type VideoCapture                       = Boolean

  implicit final class DeviceFarmOps(val service: DeviceFarm) extends AnyVal {

    def createDevicePoolFuture(params: CreateDevicePoolRequest): Future[CreateDevicePoolResult] =
      service.createDevicePool(params).promise.toFuture
    def createInstanceProfileFuture(params: CreateInstanceProfileRequest): Future[CreateInstanceProfileResult] =
      service.createInstanceProfile(params).promise.toFuture
    def createNetworkProfileFuture(params: CreateNetworkProfileRequest): Future[CreateNetworkProfileResult] =
      service.createNetworkProfile(params).promise.toFuture
    def createProjectFuture(params: CreateProjectRequest): Future[CreateProjectResult] =
      service.createProject(params).promise.toFuture
    def createRemoteAccessSessionFuture(
        params: CreateRemoteAccessSessionRequest
    ): Future[CreateRemoteAccessSessionResult] = service.createRemoteAccessSession(params).promise.toFuture
    def createUploadFuture(params: CreateUploadRequest): Future[CreateUploadResult] =
      service.createUpload(params).promise.toFuture
    def createVPCEConfigurationFuture(params: CreateVPCEConfigurationRequest): Future[CreateVPCEConfigurationResult] =
      service.createVPCEConfiguration(params).promise.toFuture
    def deleteDevicePoolFuture(params: DeleteDevicePoolRequest): Future[DeleteDevicePoolResult] =
      service.deleteDevicePool(params).promise.toFuture
    def deleteInstanceProfileFuture(params: DeleteInstanceProfileRequest): Future[DeleteInstanceProfileResult] =
      service.deleteInstanceProfile(params).promise.toFuture
    def deleteNetworkProfileFuture(params: DeleteNetworkProfileRequest): Future[DeleteNetworkProfileResult] =
      service.deleteNetworkProfile(params).promise.toFuture
    def deleteProjectFuture(params: DeleteProjectRequest): Future[DeleteProjectResult] =
      service.deleteProject(params).promise.toFuture
    def deleteRemoteAccessSessionFuture(
        params: DeleteRemoteAccessSessionRequest
    ): Future[DeleteRemoteAccessSessionResult]                             = service.deleteRemoteAccessSession(params).promise.toFuture
    def deleteRunFuture(params: DeleteRunRequest): Future[DeleteRunResult] = service.deleteRun(params).promise.toFuture
    def deleteUploadFuture(params: DeleteUploadRequest): Future[DeleteUploadResult] =
      service.deleteUpload(params).promise.toFuture
    def deleteVPCEConfigurationFuture(params: DeleteVPCEConfigurationRequest): Future[DeleteVPCEConfigurationResult] =
      service.deleteVPCEConfiguration(params).promise.toFuture
    def getAccountSettingsFuture(params: GetAccountSettingsRequest): Future[GetAccountSettingsResult] =
      service.getAccountSettings(params).promise.toFuture
    def getDeviceFuture(params: GetDeviceRequest): Future[GetDeviceResult] = service.getDevice(params).promise.toFuture
    def getDeviceInstanceFuture(params: GetDeviceInstanceRequest): Future[GetDeviceInstanceResult] =
      service.getDeviceInstance(params).promise.toFuture
    def getDevicePoolCompatibilityFuture(
        params: GetDevicePoolCompatibilityRequest
    ): Future[GetDevicePoolCompatibilityResult] = service.getDevicePoolCompatibility(params).promise.toFuture
    def getDevicePoolFuture(params: GetDevicePoolRequest): Future[GetDevicePoolResult] =
      service.getDevicePool(params).promise.toFuture
    def getInstanceProfileFuture(params: GetInstanceProfileRequest): Future[GetInstanceProfileResult] =
      service.getInstanceProfile(params).promise.toFuture
    def getJobFuture(params: GetJobRequest): Future[GetJobResult] = service.getJob(params).promise.toFuture
    def getNetworkProfileFuture(params: GetNetworkProfileRequest): Future[GetNetworkProfileResult] =
      service.getNetworkProfile(params).promise.toFuture
    def getOfferingStatusFuture(params: GetOfferingStatusRequest): Future[GetOfferingStatusResult] =
      service.getOfferingStatus(params).promise.toFuture
    def getProjectFuture(params: GetProjectRequest): Future[GetProjectResult] =
      service.getProject(params).promise.toFuture
    def getRemoteAccessSessionFuture(params: GetRemoteAccessSessionRequest): Future[GetRemoteAccessSessionResult] =
      service.getRemoteAccessSession(params).promise.toFuture
    def getRunFuture(params: GetRunRequest): Future[GetRunResult]          = service.getRun(params).promise.toFuture
    def getSuiteFuture(params: GetSuiteRequest): Future[GetSuiteResult]    = service.getSuite(params).promise.toFuture
    def getTestFuture(params: GetTestRequest): Future[GetTestResult]       = service.getTest(params).promise.toFuture
    def getUploadFuture(params: GetUploadRequest): Future[GetUploadResult] = service.getUpload(params).promise.toFuture
    def getVPCEConfigurationFuture(params: GetVPCEConfigurationRequest): Future[GetVPCEConfigurationResult] =
      service.getVPCEConfiguration(params).promise.toFuture
    def installToRemoteAccessSessionFuture(
        params: InstallToRemoteAccessSessionRequest
    ): Future[InstallToRemoteAccessSessionResult] = service.installToRemoteAccessSession(params).promise.toFuture
    def listArtifactsFuture(params: ListArtifactsRequest): Future[ListArtifactsResult] =
      service.listArtifacts(params).promise.toFuture
    def listDeviceInstancesFuture(params: ListDeviceInstancesRequest): Future[ListDeviceInstancesResult] =
      service.listDeviceInstances(params).promise.toFuture
    def listDevicePoolsFuture(params: ListDevicePoolsRequest): Future[ListDevicePoolsResult] =
      service.listDevicePools(params).promise.toFuture
    def listDevicesFuture(params: ListDevicesRequest): Future[ListDevicesResult] =
      service.listDevices(params).promise.toFuture
    def listInstanceProfilesFuture(params: ListInstanceProfilesRequest): Future[ListInstanceProfilesResult] =
      service.listInstanceProfiles(params).promise.toFuture
    def listJobsFuture(params: ListJobsRequest): Future[ListJobsResult] = service.listJobs(params).promise.toFuture
    def listNetworkProfilesFuture(params: ListNetworkProfilesRequest): Future[ListNetworkProfilesResult] =
      service.listNetworkProfiles(params).promise.toFuture
    def listOfferingPromotionsFuture(params: ListOfferingPromotionsRequest): Future[ListOfferingPromotionsResult] =
      service.listOfferingPromotions(params).promise.toFuture
    def listOfferingTransactionsFuture(
        params: ListOfferingTransactionsRequest
    ): Future[ListOfferingTransactionsResult] = service.listOfferingTransactions(params).promise.toFuture
    def listOfferingsFuture(params: ListOfferingsRequest): Future[ListOfferingsResult] =
      service.listOfferings(params).promise.toFuture
    def listProjectsFuture(params: ListProjectsRequest): Future[ListProjectsResult] =
      service.listProjects(params).promise.toFuture
    def listRemoteAccessSessionsFuture(
        params: ListRemoteAccessSessionsRequest
    ): Future[ListRemoteAccessSessionsResult]                           = service.listRemoteAccessSessions(params).promise.toFuture
    def listRunsFuture(params: ListRunsRequest): Future[ListRunsResult] = service.listRuns(params).promise.toFuture
    def listSamplesFuture(params: ListSamplesRequest): Future[ListSamplesResult] =
      service.listSamples(params).promise.toFuture
    def listSuitesFuture(params: ListSuitesRequest): Future[ListSuitesResult] =
      service.listSuites(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    def listTestsFuture(params: ListTestsRequest): Future[ListTestsResult] = service.listTests(params).promise.toFuture
    def listUniqueProblemsFuture(params: ListUniqueProblemsRequest): Future[ListUniqueProblemsResult] =
      service.listUniqueProblems(params).promise.toFuture
    def listUploadsFuture(params: ListUploadsRequest): Future[ListUploadsResult] =
      service.listUploads(params).promise.toFuture
    def listVPCEConfigurationsFuture(params: ListVPCEConfigurationsRequest): Future[ListVPCEConfigurationsResult] =
      service.listVPCEConfigurations(params).promise.toFuture
    def purchaseOfferingFuture(params: PurchaseOfferingRequest): Future[PurchaseOfferingResult] =
      service.purchaseOffering(params).promise.toFuture
    def renewOfferingFuture(params: RenewOfferingRequest): Future[RenewOfferingResult] =
      service.renewOffering(params).promise.toFuture
    def scheduleRunFuture(params: ScheduleRunRequest): Future[ScheduleRunResult] =
      service.scheduleRun(params).promise.toFuture
    def stopJobFuture(params: StopJobRequest): Future[StopJobResult] = service.stopJob(params).promise.toFuture
    def stopRemoteAccessSessionFuture(params: StopRemoteAccessSessionRequest): Future[StopRemoteAccessSessionResult] =
      service.stopRemoteAccessSession(params).promise.toFuture
    def stopRunFuture(params: StopRunRequest): Future[StopRunResult] = service.stopRun(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise.toFuture
    def updateDeviceInstanceFuture(params: UpdateDeviceInstanceRequest): Future[UpdateDeviceInstanceResult] =
      service.updateDeviceInstance(params).promise.toFuture
    def updateDevicePoolFuture(params: UpdateDevicePoolRequest): Future[UpdateDevicePoolResult] =
      service.updateDevicePool(params).promise.toFuture
    def updateInstanceProfileFuture(params: UpdateInstanceProfileRequest): Future[UpdateInstanceProfileResult] =
      service.updateInstanceProfile(params).promise.toFuture
    def updateNetworkProfileFuture(params: UpdateNetworkProfileRequest): Future[UpdateNetworkProfileResult] =
      service.updateNetworkProfile(params).promise.toFuture
    def updateProjectFuture(params: UpdateProjectRequest): Future[UpdateProjectResult] =
      service.updateProject(params).promise.toFuture
    def updateUploadFuture(params: UpdateUploadRequest): Future[UpdateUploadResult] =
      service.updateUpload(params).promise.toFuture
    def updateVPCEConfigurationFuture(params: UpdateVPCEConfigurationRequest): Future[UpdateVPCEConfigurationResult] =
      service.updateVPCEConfiguration(params).promise.toFuture
  }
}

package devicefarm {
  @js.native
  @JSImport("aws-sdk", "DeviceFarm")
  class DeviceFarm() extends js.Object {
    def this(config: AWSConfig) = this()

    def createDevicePool(params: CreateDevicePoolRequest): Request[CreateDevicePoolResult]                = js.native
    def createInstanceProfile(params: CreateInstanceProfileRequest): Request[CreateInstanceProfileResult] = js.native
    def createNetworkProfile(params: CreateNetworkProfileRequest): Request[CreateNetworkProfileResult]    = js.native
    def createProject(params: CreateProjectRequest): Request[CreateProjectResult]                         = js.native
    def createRemoteAccessSession(params: CreateRemoteAccessSessionRequest): Request[CreateRemoteAccessSessionResult] =
      js.native
    def createUpload(params: CreateUploadRequest): Request[CreateUploadResult] = js.native
    def createVPCEConfiguration(params: CreateVPCEConfigurationRequest): Request[CreateVPCEConfigurationResult] =
      js.native
    def deleteDevicePool(params: DeleteDevicePoolRequest): Request[DeleteDevicePoolResult]                = js.native
    def deleteInstanceProfile(params: DeleteInstanceProfileRequest): Request[DeleteInstanceProfileResult] = js.native
    def deleteNetworkProfile(params: DeleteNetworkProfileRequest): Request[DeleteNetworkProfileResult]    = js.native
    def deleteProject(params: DeleteProjectRequest): Request[DeleteProjectResult]                         = js.native
    def deleteRemoteAccessSession(params: DeleteRemoteAccessSessionRequest): Request[DeleteRemoteAccessSessionResult] =
      js.native
    def deleteRun(params: DeleteRunRequest): Request[DeleteRunResult]          = js.native
    def deleteUpload(params: DeleteUploadRequest): Request[DeleteUploadResult] = js.native
    def deleteVPCEConfiguration(params: DeleteVPCEConfigurationRequest): Request[DeleteVPCEConfigurationResult] =
      js.native
    def getAccountSettings(params: GetAccountSettingsRequest): Request[GetAccountSettingsResult] = js.native
    def getDevice(params: GetDeviceRequest): Request[GetDeviceResult]                            = js.native
    def getDeviceInstance(params: GetDeviceInstanceRequest): Request[GetDeviceInstanceResult]    = js.native
    def getDevicePool(params: GetDevicePoolRequest): Request[GetDevicePoolResult]                = js.native
    def getDevicePoolCompatibility(
        params: GetDevicePoolCompatibilityRequest
    ): Request[GetDevicePoolCompatibilityResult]                                                             = js.native
    def getInstanceProfile(params: GetInstanceProfileRequest): Request[GetInstanceProfileResult]             = js.native
    def getJob(params: GetJobRequest): Request[GetJobResult]                                                 = js.native
    def getNetworkProfile(params: GetNetworkProfileRequest): Request[GetNetworkProfileResult]                = js.native
    def getOfferingStatus(params: GetOfferingStatusRequest): Request[GetOfferingStatusResult]                = js.native
    def getProject(params: GetProjectRequest): Request[GetProjectResult]                                     = js.native
    def getRemoteAccessSession(params: GetRemoteAccessSessionRequest): Request[GetRemoteAccessSessionResult] = js.native
    def getRun(params: GetRunRequest): Request[GetRunResult]                                                 = js.native
    def getSuite(params: GetSuiteRequest): Request[GetSuiteResult]                                           = js.native
    def getTest(params: GetTestRequest): Request[GetTestResult]                                              = js.native
    def getUpload(params: GetUploadRequest): Request[GetUploadResult]                                        = js.native
    def getVPCEConfiguration(params: GetVPCEConfigurationRequest): Request[GetVPCEConfigurationResult]       = js.native
    def installToRemoteAccessSession(
        params: InstallToRemoteAccessSessionRequest
    ): Request[InstallToRemoteAccessSessionResult]                                                           = js.native
    def listArtifacts(params: ListArtifactsRequest): Request[ListArtifactsResult]                            = js.native
    def listDeviceInstances(params: ListDeviceInstancesRequest): Request[ListDeviceInstancesResult]          = js.native
    def listDevicePools(params: ListDevicePoolsRequest): Request[ListDevicePoolsResult]                      = js.native
    def listDevices(params: ListDevicesRequest): Request[ListDevicesResult]                                  = js.native
    def listInstanceProfiles(params: ListInstanceProfilesRequest): Request[ListInstanceProfilesResult]       = js.native
    def listJobs(params: ListJobsRequest): Request[ListJobsResult]                                           = js.native
    def listNetworkProfiles(params: ListNetworkProfilesRequest): Request[ListNetworkProfilesResult]          = js.native
    def listOfferingPromotions(params: ListOfferingPromotionsRequest): Request[ListOfferingPromotionsResult] = js.native
    def listOfferingTransactions(params: ListOfferingTransactionsRequest): Request[ListOfferingTransactionsResult] =
      js.native
    def listOfferings(params: ListOfferingsRequest): Request[ListOfferingsResult] = js.native
    def listProjects(params: ListProjectsRequest): Request[ListProjectsResult]    = js.native
    def listRemoteAccessSessions(params: ListRemoteAccessSessionsRequest): Request[ListRemoteAccessSessionsResult] =
      js.native
    def listRuns(params: ListRunsRequest): Request[ListRunsResult]                                           = js.native
    def listSamples(params: ListSamplesRequest): Request[ListSamplesResult]                                  = js.native
    def listSuites(params: ListSuitesRequest): Request[ListSuitesResult]                                     = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]        = js.native
    def listTests(params: ListTestsRequest): Request[ListTestsResult]                                        = js.native
    def listUniqueProblems(params: ListUniqueProblemsRequest): Request[ListUniqueProblemsResult]             = js.native
    def listUploads(params: ListUploadsRequest): Request[ListUploadsResult]                                  = js.native
    def listVPCEConfigurations(params: ListVPCEConfigurationsRequest): Request[ListVPCEConfigurationsResult] = js.native
    def purchaseOffering(params: PurchaseOfferingRequest): Request[PurchaseOfferingResult]                   = js.native
    def renewOffering(params: RenewOfferingRequest): Request[RenewOfferingResult]                            = js.native
    def scheduleRun(params: ScheduleRunRequest): Request[ScheduleRunResult]                                  = js.native
    def stopJob(params: StopJobRequest): Request[StopJobResult]                                              = js.native
    def stopRemoteAccessSession(params: StopRemoteAccessSessionRequest): Request[StopRemoteAccessSessionResult] =
      js.native
    def stopRun(params: StopRunRequest): Request[StopRunResult]                                           = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                             = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                       = js.native
    def updateDeviceInstance(params: UpdateDeviceInstanceRequest): Request[UpdateDeviceInstanceResult]    = js.native
    def updateDevicePool(params: UpdateDevicePoolRequest): Request[UpdateDevicePoolResult]                = js.native
    def updateInstanceProfile(params: UpdateInstanceProfileRequest): Request[UpdateInstanceProfileResult] = js.native
    def updateNetworkProfile(params: UpdateNetworkProfileRequest): Request[UpdateNetworkProfileResult]    = js.native
    def updateProject(params: UpdateProjectRequest): Request[UpdateProjectResult]                         = js.native
    def updateUpload(params: UpdateUploadRequest): Request[UpdateUploadResult]                            = js.native
    def updateVPCEConfiguration(params: UpdateVPCEConfigurationRequest): Request[UpdateVPCEConfigurationResult] =
      js.native
  }

  /**
    * A container for account-level settings within AWS Device Farm.
    */
  @js.native
  trait AccountSettings extends js.Object {
    var awsAccountNumber: js.UndefOr[AWSAccountNumber]
    var defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes]
    var maxJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes]
    var maxSlots: js.UndefOr[MaxSlotMap]
    var skipAppResign: js.UndefOr[SkipAppResign]
    var trialMinutes: js.UndefOr[TrialMinutes]
    var unmeteredDevices: js.UndefOr[PurchasedDevicesMap]
    var unmeteredRemoteAccessDevices: js.UndefOr[PurchasedDevicesMap]
  }

  object AccountSettings {
    def apply(
        awsAccountNumber: js.UndefOr[AWSAccountNumber] = js.undefined,
        defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.undefined,
        maxJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.undefined,
        maxSlots: js.UndefOr[MaxSlotMap] = js.undefined,
        skipAppResign: js.UndefOr[SkipAppResign] = js.undefined,
        trialMinutes: js.UndefOr[TrialMinutes] = js.undefined,
        unmeteredDevices: js.UndefOr[PurchasedDevicesMap] = js.undefined,
        unmeteredRemoteAccessDevices: js.UndefOr[PurchasedDevicesMap] = js.undefined
    ): AccountSettings = {
      val __obj = js.Dictionary.empty[js.Any]
      awsAccountNumber.foreach(__v => __obj.update("awsAccountNumber", __v.asInstanceOf[js.Any]))
      defaultJobTimeoutMinutes.foreach(__v => __obj.update("defaultJobTimeoutMinutes", __v.asInstanceOf[js.Any]))
      maxJobTimeoutMinutes.foreach(__v => __obj.update("maxJobTimeoutMinutes", __v.asInstanceOf[js.Any]))
      maxSlots.foreach(__v => __obj.update("maxSlots", __v.asInstanceOf[js.Any]))
      skipAppResign.foreach(__v => __obj.update("skipAppResign", __v.asInstanceOf[js.Any]))
      trialMinutes.foreach(__v => __obj.update("trialMinutes", __v.asInstanceOf[js.Any]))
      unmeteredDevices.foreach(__v => __obj.update("unmeteredDevices", __v.asInstanceOf[js.Any]))
      unmeteredRemoteAccessDevices.foreach(
        __v => __obj.update("unmeteredRemoteAccessDevices", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[AccountSettings]
    }
  }

  /**
    * Represents the output of a test. Examples of artifacts include logs and screenshots.
    */
  @js.native
  trait Artifact extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var extension: js.UndefOr[String]
    var name: js.UndefOr[Name]
    var `type`: js.UndefOr[ArtifactType]
    var url: js.UndefOr[URL]
  }

  object Artifact {
    def apply(
        arn: js.UndefOr[AmazonResourceName] = js.undefined,
        extension: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        `type`: js.UndefOr[ArtifactType] = js.undefined,
        url: js.UndefOr[URL] = js.undefined
    ): Artifact = {
      val __obj = js.Dictionary.empty[js.Any]
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      extension.foreach(__v => __obj.update("extension", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      url.foreach(__v => __obj.update("url", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Artifact]
    }
  }

  object ArtifactCategoryEnum {
    val SCREENSHOT = "SCREENSHOT"
    val FILE       = "FILE"
    val LOG        = "LOG"

    val values = IndexedSeq(SCREENSHOT, FILE, LOG)
  }

  object ArtifactTypeEnum {
    val UNKNOWN                  = "UNKNOWN"
    val SCREENSHOT               = "SCREENSHOT"
    val DEVICE_LOG               = "DEVICE_LOG"
    val MESSAGE_LOG              = "MESSAGE_LOG"
    val VIDEO_LOG                = "VIDEO_LOG"
    val RESULT_LOG               = "RESULT_LOG"
    val SERVICE_LOG              = "SERVICE_LOG"
    val WEBKIT_LOG               = "WEBKIT_LOG"
    val INSTRUMENTATION_OUTPUT   = "INSTRUMENTATION_OUTPUT"
    val EXERCISER_MONKEY_OUTPUT  = "EXERCISER_MONKEY_OUTPUT"
    val CALABASH_JSON_OUTPUT     = "CALABASH_JSON_OUTPUT"
    val CALABASH_PRETTY_OUTPUT   = "CALABASH_PRETTY_OUTPUT"
    val CALABASH_STANDARD_OUTPUT = "CALABASH_STANDARD_OUTPUT"
    val CALABASH_JAVA_XML_OUTPUT = "CALABASH_JAVA_XML_OUTPUT"
    val AUTOMATION_OUTPUT        = "AUTOMATION_OUTPUT"
    val APPIUM_SERVER_OUTPUT     = "APPIUM_SERVER_OUTPUT"
    val APPIUM_JAVA_OUTPUT       = "APPIUM_JAVA_OUTPUT"
    val APPIUM_JAVA_XML_OUTPUT   = "APPIUM_JAVA_XML_OUTPUT"
    val APPIUM_PYTHON_OUTPUT     = "APPIUM_PYTHON_OUTPUT"
    val APPIUM_PYTHON_XML_OUTPUT = "APPIUM_PYTHON_XML_OUTPUT"
    val EXPLORER_EVENT_LOG       = "EXPLORER_EVENT_LOG"
    val EXPLORER_SUMMARY_LOG     = "EXPLORER_SUMMARY_LOG"
    val APPLICATION_CRASH_REPORT = "APPLICATION_CRASH_REPORT"
    val XCTEST_LOG               = "XCTEST_LOG"
    val VIDEO                    = "VIDEO"
    val CUSTOMER_ARTIFACT        = "CUSTOMER_ARTIFACT"
    val CUSTOMER_ARTIFACT_LOG    = "CUSTOMER_ARTIFACT_LOG"
    val TESTSPEC_OUTPUT          = "TESTSPEC_OUTPUT"

    val values = IndexedSeq(
      UNKNOWN,
      SCREENSHOT,
      DEVICE_LOG,
      MESSAGE_LOG,
      VIDEO_LOG,
      RESULT_LOG,
      SERVICE_LOG,
      WEBKIT_LOG,
      INSTRUMENTATION_OUTPUT,
      EXERCISER_MONKEY_OUTPUT,
      CALABASH_JSON_OUTPUT,
      CALABASH_PRETTY_OUTPUT,
      CALABASH_STANDARD_OUTPUT,
      CALABASH_JAVA_XML_OUTPUT,
      AUTOMATION_OUTPUT,
      APPIUM_SERVER_OUTPUT,
      APPIUM_JAVA_OUTPUT,
      APPIUM_JAVA_XML_OUTPUT,
      APPIUM_PYTHON_OUTPUT,
      APPIUM_PYTHON_XML_OUTPUT,
      EXPLORER_EVENT_LOG,
      EXPLORER_SUMMARY_LOG,
      APPLICATION_CRASH_REPORT,
      XCTEST_LOG,
      VIDEO,
      CUSTOMER_ARTIFACT,
      CUSTOMER_ARTIFACT_LOG,
      TESTSPEC_OUTPUT
    )
  }

  object BillingMethodEnum {
    val METERED   = "METERED"
    val UNMETERED = "UNMETERED"

    val values = IndexedSeq(METERED, UNMETERED)
  }

  /**
    * Represents the amount of CPU that an app is using on a physical device.
    *  Note that this does not represent system-wide CPU usage.
    */
  @js.native
  trait CPU extends js.Object {
    var architecture: js.UndefOr[String]
    var clock: js.UndefOr[Double]
    var frequency: js.UndefOr[String]
  }

  object CPU {
    def apply(
        architecture: js.UndefOr[String] = js.undefined,
        clock: js.UndefOr[Double] = js.undefined,
        frequency: js.UndefOr[String] = js.undefined
    ): CPU = {
      val __obj = js.Dictionary.empty[js.Any]
      architecture.foreach(__v => __obj.update("architecture", __v.asInstanceOf[js.Any]))
      clock.foreach(__v => __obj.update("clock", __v.asInstanceOf[js.Any]))
      frequency.foreach(__v => __obj.update("frequency", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CPU]
    }
  }

  /**
    * Represents entity counters.
    */
  @js.native
  trait Counters extends js.Object {
    var errored: js.UndefOr[Int]
    var failed: js.UndefOr[Int]
    var passed: js.UndefOr[Int]
    var skipped: js.UndefOr[Int]
    var stopped: js.UndefOr[Int]
    var total: js.UndefOr[Int]
    var warned: js.UndefOr[Int]
  }

  object Counters {
    def apply(
        errored: js.UndefOr[Int] = js.undefined,
        failed: js.UndefOr[Int] = js.undefined,
        passed: js.UndefOr[Int] = js.undefined,
        skipped: js.UndefOr[Int] = js.undefined,
        stopped: js.UndefOr[Int] = js.undefined,
        total: js.UndefOr[Int] = js.undefined,
        warned: js.UndefOr[Int] = js.undefined
    ): Counters = {
      val __obj = js.Dictionary.empty[js.Any]
      errored.foreach(__v => __obj.update("errored", __v.asInstanceOf[js.Any]))
      failed.foreach(__v => __obj.update("failed", __v.asInstanceOf[js.Any]))
      passed.foreach(__v => __obj.update("passed", __v.asInstanceOf[js.Any]))
      skipped.foreach(__v => __obj.update("skipped", __v.asInstanceOf[js.Any]))
      stopped.foreach(__v => __obj.update("stopped", __v.asInstanceOf[js.Any]))
      total.foreach(__v => __obj.update("total", __v.asInstanceOf[js.Any]))
      warned.foreach(__v => __obj.update("warned", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Counters]
    }
  }

  /**
    * Represents a request to the create device pool operation.
    */
  @js.native
  trait CreateDevicePoolRequest extends js.Object {
    var name: Name
    var projectArn: AmazonResourceName
    var rules: Rules
    var description: js.UndefOr[Message]
    var maxDevices: js.UndefOr[Int]
  }

  object CreateDevicePoolRequest {
    def apply(
        name: Name,
        projectArn: AmazonResourceName,
        rules: Rules,
        description: js.UndefOr[Message] = js.undefined,
        maxDevices: js.UndefOr[Int] = js.undefined
    ): CreateDevicePoolRequest = {
      val __obj = js.Dictionary[js.Any](
        "name"       -> name.asInstanceOf[js.Any],
        "projectArn" -> projectArn.asInstanceOf[js.Any],
        "rules"      -> rules.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      maxDevices.foreach(__v => __obj.update("maxDevices", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDevicePoolRequest]
    }
  }

  /**
    * Represents the result of a create device pool request.
    */
  @js.native
  trait CreateDevicePoolResult extends js.Object {
    var devicePool: js.UndefOr[DevicePool]
  }

  object CreateDevicePoolResult {
    def apply(
        devicePool: js.UndefOr[DevicePool] = js.undefined
    ): CreateDevicePoolResult = {
      val __obj = js.Dictionary.empty[js.Any]
      devicePool.foreach(__v => __obj.update("devicePool", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDevicePoolResult]
    }
  }

  @js.native
  trait CreateInstanceProfileRequest extends js.Object {
    var name: Name
    var description: js.UndefOr[Message]
    var excludeAppPackagesFromCleanup: js.UndefOr[PackageIds]
    var packageCleanup: js.UndefOr[Boolean]
    var rebootAfterUse: js.UndefOr[Boolean]
  }

  object CreateInstanceProfileRequest {
    def apply(
        name: Name,
        description: js.UndefOr[Message] = js.undefined,
        excludeAppPackagesFromCleanup: js.UndefOr[PackageIds] = js.undefined,
        packageCleanup: js.UndefOr[Boolean] = js.undefined,
        rebootAfterUse: js.UndefOr[Boolean] = js.undefined
    ): CreateInstanceProfileRequest = {
      val __obj = js.Dictionary[js.Any](
        "name" -> name.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      excludeAppPackagesFromCleanup.foreach(
        __v => __obj.update("excludeAppPackagesFromCleanup", __v.asInstanceOf[js.Any])
      )
      packageCleanup.foreach(__v => __obj.update("packageCleanup", __v.asInstanceOf[js.Any]))
      rebootAfterUse.foreach(__v => __obj.update("rebootAfterUse", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateInstanceProfileRequest]
    }
  }

  @js.native
  trait CreateInstanceProfileResult extends js.Object {
    var instanceProfile: js.UndefOr[InstanceProfile]
  }

  object CreateInstanceProfileResult {
    def apply(
        instanceProfile: js.UndefOr[InstanceProfile] = js.undefined
    ): CreateInstanceProfileResult = {
      val __obj = js.Dictionary.empty[js.Any]
      instanceProfile.foreach(__v => __obj.update("instanceProfile", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateInstanceProfileResult]
    }
  }

  @js.native
  trait CreateNetworkProfileRequest extends js.Object {
    var name: Name
    var projectArn: AmazonResourceName
    var description: js.UndefOr[Message]
    var downlinkBandwidthBits: js.UndefOr[Double]
    var downlinkDelayMs: js.UndefOr[Double]
    var downlinkJitterMs: js.UndefOr[Double]
    var downlinkLossPercent: js.UndefOr[PercentInteger]
    var `type`: js.UndefOr[NetworkProfileType]
    var uplinkBandwidthBits: js.UndefOr[Double]
    var uplinkDelayMs: js.UndefOr[Double]
    var uplinkJitterMs: js.UndefOr[Double]
    var uplinkLossPercent: js.UndefOr[PercentInteger]
  }

  object CreateNetworkProfileRequest {
    def apply(
        name: Name,
        projectArn: AmazonResourceName,
        description: js.UndefOr[Message] = js.undefined,
        downlinkBandwidthBits: js.UndefOr[Double] = js.undefined,
        downlinkDelayMs: js.UndefOr[Double] = js.undefined,
        downlinkJitterMs: js.UndefOr[Double] = js.undefined,
        downlinkLossPercent: js.UndefOr[PercentInteger] = js.undefined,
        `type`: js.UndefOr[NetworkProfileType] = js.undefined,
        uplinkBandwidthBits: js.UndefOr[Double] = js.undefined,
        uplinkDelayMs: js.UndefOr[Double] = js.undefined,
        uplinkJitterMs: js.UndefOr[Double] = js.undefined,
        uplinkLossPercent: js.UndefOr[PercentInteger] = js.undefined
    ): CreateNetworkProfileRequest = {
      val __obj = js.Dictionary[js.Any](
        "name"       -> name.asInstanceOf[js.Any],
        "projectArn" -> projectArn.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      downlinkBandwidthBits.foreach(__v => __obj.update("downlinkBandwidthBits", __v.asInstanceOf[js.Any]))
      downlinkDelayMs.foreach(__v => __obj.update("downlinkDelayMs", __v.asInstanceOf[js.Any]))
      downlinkJitterMs.foreach(__v => __obj.update("downlinkJitterMs", __v.asInstanceOf[js.Any]))
      downlinkLossPercent.foreach(__v => __obj.update("downlinkLossPercent", __v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      uplinkBandwidthBits.foreach(__v => __obj.update("uplinkBandwidthBits", __v.asInstanceOf[js.Any]))
      uplinkDelayMs.foreach(__v => __obj.update("uplinkDelayMs", __v.asInstanceOf[js.Any]))
      uplinkJitterMs.foreach(__v => __obj.update("uplinkJitterMs", __v.asInstanceOf[js.Any]))
      uplinkLossPercent.foreach(__v => __obj.update("uplinkLossPercent", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNetworkProfileRequest]
    }
  }

  @js.native
  trait CreateNetworkProfileResult extends js.Object {
    var networkProfile: js.UndefOr[NetworkProfile]
  }

  object CreateNetworkProfileResult {
    def apply(
        networkProfile: js.UndefOr[NetworkProfile] = js.undefined
    ): CreateNetworkProfileResult = {
      val __obj = js.Dictionary.empty[js.Any]
      networkProfile.foreach(__v => __obj.update("networkProfile", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNetworkProfileResult]
    }
  }

  /**
    * Represents a request to the create project operation.
    */
  @js.native
  trait CreateProjectRequest extends js.Object {
    var name: Name
    var defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes]
  }

  object CreateProjectRequest {
    def apply(
        name: Name,
        defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.undefined
    ): CreateProjectRequest = {
      val __obj = js.Dictionary[js.Any](
        "name" -> name.asInstanceOf[js.Any]
      )

      defaultJobTimeoutMinutes.foreach(__v => __obj.update("defaultJobTimeoutMinutes", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProjectRequest]
    }
  }

  /**
    * Represents the result of a create project request.
    */
  @js.native
  trait CreateProjectResult extends js.Object {
    var project: js.UndefOr[Project]
  }

  object CreateProjectResult {
    def apply(
        project: js.UndefOr[Project] = js.undefined
    ): CreateProjectResult = {
      val __obj = js.Dictionary.empty[js.Any]
      project.foreach(__v => __obj.update("project", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProjectResult]
    }
  }

  /**
    * Configuration settings for a remote access session, including billing method.
    */
  @js.native
  trait CreateRemoteAccessSessionConfiguration extends js.Object {
    var billingMethod: js.UndefOr[BillingMethod]
    var vpceConfigurationArns: js.UndefOr[AmazonResourceNames]
  }

  object CreateRemoteAccessSessionConfiguration {
    def apply(
        billingMethod: js.UndefOr[BillingMethod] = js.undefined,
        vpceConfigurationArns: js.UndefOr[AmazonResourceNames] = js.undefined
    ): CreateRemoteAccessSessionConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      billingMethod.foreach(__v => __obj.update("billingMethod", __v.asInstanceOf[js.Any]))
      vpceConfigurationArns.foreach(__v => __obj.update("vpceConfigurationArns", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRemoteAccessSessionConfiguration]
    }
  }

  /**
    * Creates and submits a request to start a remote access session.
    */
  @js.native
  trait CreateRemoteAccessSessionRequest extends js.Object {
    var deviceArn: AmazonResourceName
    var projectArn: AmazonResourceName
    var clientId: js.UndefOr[ClientId]
    var configuration: js.UndefOr[CreateRemoteAccessSessionConfiguration]
    var instanceArn: js.UndefOr[AmazonResourceName]
    var interactionMode: js.UndefOr[InteractionMode]
    var name: js.UndefOr[Name]
    var remoteDebugEnabled: js.UndefOr[Boolean]
    var remoteRecordAppArn: js.UndefOr[AmazonResourceName]
    var remoteRecordEnabled: js.UndefOr[Boolean]
    var skipAppResign: js.UndefOr[Boolean]
    var sshPublicKey: js.UndefOr[SshPublicKey]
  }

  object CreateRemoteAccessSessionRequest {
    def apply(
        deviceArn: AmazonResourceName,
        projectArn: AmazonResourceName,
        clientId: js.UndefOr[ClientId] = js.undefined,
        configuration: js.UndefOr[CreateRemoteAccessSessionConfiguration] = js.undefined,
        instanceArn: js.UndefOr[AmazonResourceName] = js.undefined,
        interactionMode: js.UndefOr[InteractionMode] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        remoteDebugEnabled: js.UndefOr[Boolean] = js.undefined,
        remoteRecordAppArn: js.UndefOr[AmazonResourceName] = js.undefined,
        remoteRecordEnabled: js.UndefOr[Boolean] = js.undefined,
        skipAppResign: js.UndefOr[Boolean] = js.undefined,
        sshPublicKey: js.UndefOr[SshPublicKey] = js.undefined
    ): CreateRemoteAccessSessionRequest = {
      val __obj = js.Dictionary[js.Any](
        "deviceArn"  -> deviceArn.asInstanceOf[js.Any],
        "projectArn" -> projectArn.asInstanceOf[js.Any]
      )

      clientId.foreach(__v => __obj.update("clientId", __v.asInstanceOf[js.Any]))
      configuration.foreach(__v => __obj.update("configuration", __v.asInstanceOf[js.Any]))
      instanceArn.foreach(__v => __obj.update("instanceArn", __v.asInstanceOf[js.Any]))
      interactionMode.foreach(__v => __obj.update("interactionMode", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      remoteDebugEnabled.foreach(__v => __obj.update("remoteDebugEnabled", __v.asInstanceOf[js.Any]))
      remoteRecordAppArn.foreach(__v => __obj.update("remoteRecordAppArn", __v.asInstanceOf[js.Any]))
      remoteRecordEnabled.foreach(__v => __obj.update("remoteRecordEnabled", __v.asInstanceOf[js.Any]))
      skipAppResign.foreach(__v => __obj.update("skipAppResign", __v.asInstanceOf[js.Any]))
      sshPublicKey.foreach(__v => __obj.update("sshPublicKey", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRemoteAccessSessionRequest]
    }
  }

  /**
    * Represents the server response from a request to create a remote access session.
    */
  @js.native
  trait CreateRemoteAccessSessionResult extends js.Object {
    var remoteAccessSession: js.UndefOr[RemoteAccessSession]
  }

  object CreateRemoteAccessSessionResult {
    def apply(
        remoteAccessSession: js.UndefOr[RemoteAccessSession] = js.undefined
    ): CreateRemoteAccessSessionResult = {
      val __obj = js.Dictionary.empty[js.Any]
      remoteAccessSession.foreach(__v => __obj.update("remoteAccessSession", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRemoteAccessSessionResult]
    }
  }

  /**
    * Represents a request to the create upload operation.
    */
  @js.native
  trait CreateUploadRequest extends js.Object {
    var name: Name
    var projectArn: AmazonResourceName
    var `type`: UploadType
    var contentType: js.UndefOr[ContentType]
  }

  object CreateUploadRequest {
    def apply(
        name: Name,
        projectArn: AmazonResourceName,
        `type`: UploadType,
        contentType: js.UndefOr[ContentType] = js.undefined
    ): CreateUploadRequest = {
      val __obj = js.Dictionary[js.Any](
        "name"       -> name.asInstanceOf[js.Any],
        "projectArn" -> projectArn.asInstanceOf[js.Any],
        "type"       -> `type`.asInstanceOf[js.Any]
      )

      contentType.foreach(__v => __obj.update("contentType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUploadRequest]
    }
  }

  /**
    * Represents the result of a create upload request.
    */
  @js.native
  trait CreateUploadResult extends js.Object {
    var upload: js.UndefOr[Upload]
  }

  object CreateUploadResult {
    def apply(
        upload: js.UndefOr[Upload] = js.undefined
    ): CreateUploadResult = {
      val __obj = js.Dictionary.empty[js.Any]
      upload.foreach(__v => __obj.update("upload", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUploadResult]
    }
  }

  @js.native
  trait CreateVPCEConfigurationRequest extends js.Object {
    var serviceDnsName: ServiceDnsName
    var vpceConfigurationName: VPCEConfigurationName
    var vpceServiceName: VPCEServiceName
    var vpceConfigurationDescription: js.UndefOr[VPCEConfigurationDescription]
  }

  object CreateVPCEConfigurationRequest {
    def apply(
        serviceDnsName: ServiceDnsName,
        vpceConfigurationName: VPCEConfigurationName,
        vpceServiceName: VPCEServiceName,
        vpceConfigurationDescription: js.UndefOr[VPCEConfigurationDescription] = js.undefined
    ): CreateVPCEConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "serviceDnsName"        -> serviceDnsName.asInstanceOf[js.Any],
        "vpceConfigurationName" -> vpceConfigurationName.asInstanceOf[js.Any],
        "vpceServiceName"       -> vpceServiceName.asInstanceOf[js.Any]
      )

      vpceConfigurationDescription.foreach(
        __v => __obj.update("vpceConfigurationDescription", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[CreateVPCEConfigurationRequest]
    }
  }

  @js.native
  trait CreateVPCEConfigurationResult extends js.Object {
    var vpceConfiguration: js.UndefOr[VPCEConfiguration]
  }

  object CreateVPCEConfigurationResult {
    def apply(
        vpceConfiguration: js.UndefOr[VPCEConfiguration] = js.undefined
    ): CreateVPCEConfigurationResult = {
      val __obj = js.Dictionary.empty[js.Any]
      vpceConfiguration.foreach(__v => __obj.update("vpceConfiguration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVPCEConfigurationResult]
    }
  }

  object CurrencyCodeEnum {
    val USD = "USD"

    val values = IndexedSeq(USD)
  }

  /**
    * A JSON object specifying the paths where the artifacts generated by the customer's tests, on the device or in the test environment, will be pulled from.
    *  Specify <code>deviceHostPaths</code> and optionally specify either <code>iosPaths</code> or <code>androidPaths</code>.
    *  For web app tests, you can specify both <code>iosPaths</code> and <code>androidPaths</code>.
    */
  @js.native
  trait CustomerArtifactPaths extends js.Object {
    var androidPaths: js.UndefOr[AndroidPaths]
    var deviceHostPaths: js.UndefOr[DeviceHostPaths]
    var iosPaths: js.UndefOr[IosPaths]
  }

  object CustomerArtifactPaths {
    def apply(
        androidPaths: js.UndefOr[AndroidPaths] = js.undefined,
        deviceHostPaths: js.UndefOr[DeviceHostPaths] = js.undefined,
        iosPaths: js.UndefOr[IosPaths] = js.undefined
    ): CustomerArtifactPaths = {
      val __obj = js.Dictionary.empty[js.Any]
      androidPaths.foreach(__v => __obj.update("androidPaths", __v.asInstanceOf[js.Any]))
      deviceHostPaths.foreach(__v => __obj.update("deviceHostPaths", __v.asInstanceOf[js.Any]))
      iosPaths.foreach(__v => __obj.update("iosPaths", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomerArtifactPaths]
    }
  }

  /**
    * Represents a request to the delete device pool operation.
    */
  @js.native
  trait DeleteDevicePoolRequest extends js.Object {
    var arn: AmazonResourceName
  }

  object DeleteDevicePoolRequest {
    def apply(
        arn: AmazonResourceName
    ): DeleteDevicePoolRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDevicePoolRequest]
    }
  }

  /**
    * Represents the result of a delete device pool request.
    */
  @js.native
  trait DeleteDevicePoolResult extends js.Object {}

  object DeleteDevicePoolResult {
    def apply(
        ): DeleteDevicePoolResult = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteDevicePoolResult]
    }
  }

  @js.native
  trait DeleteInstanceProfileRequest extends js.Object {
    var arn: AmazonResourceName
  }

  object DeleteInstanceProfileRequest {
    def apply(
        arn: AmazonResourceName
    ): DeleteInstanceProfileRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteInstanceProfileRequest]
    }
  }

  @js.native
  trait DeleteInstanceProfileResult extends js.Object {}

  object DeleteInstanceProfileResult {
    def apply(
        ): DeleteInstanceProfileResult = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteInstanceProfileResult]
    }
  }

  @js.native
  trait DeleteNetworkProfileRequest extends js.Object {
    var arn: AmazonResourceName
  }

  object DeleteNetworkProfileRequest {
    def apply(
        arn: AmazonResourceName
    ): DeleteNetworkProfileRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteNetworkProfileRequest]
    }
  }

  @js.native
  trait DeleteNetworkProfileResult extends js.Object {}

  object DeleteNetworkProfileResult {
    def apply(
        ): DeleteNetworkProfileResult = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteNetworkProfileResult]
    }
  }

  /**
    * Represents a request to the delete project operation.
    */
  @js.native
  trait DeleteProjectRequest extends js.Object {
    var arn: AmazonResourceName
  }

  object DeleteProjectRequest {
    def apply(
        arn: AmazonResourceName
    ): DeleteProjectRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteProjectRequest]
    }
  }

  /**
    * Represents the result of a delete project request.
    */
  @js.native
  trait DeleteProjectResult extends js.Object {}

  object DeleteProjectResult {
    def apply(
        ): DeleteProjectResult = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteProjectResult]
    }
  }

  /**
    * Represents the request to delete the specified remote access session.
    */
  @js.native
  trait DeleteRemoteAccessSessionRequest extends js.Object {
    var arn: AmazonResourceName
  }

  object DeleteRemoteAccessSessionRequest {
    def apply(
        arn: AmazonResourceName
    ): DeleteRemoteAccessSessionRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteRemoteAccessSessionRequest]
    }
  }

  /**
    * The response from the server when a request is made to delete the remote access session.
    */
  @js.native
  trait DeleteRemoteAccessSessionResult extends js.Object {}

  object DeleteRemoteAccessSessionResult {
    def apply(
        ): DeleteRemoteAccessSessionResult = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteRemoteAccessSessionResult]
    }
  }

  /**
    * Represents a request to the delete run operation.
    */
  @js.native
  trait DeleteRunRequest extends js.Object {
    var arn: AmazonResourceName
  }

  object DeleteRunRequest {
    def apply(
        arn: AmazonResourceName
    ): DeleteRunRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteRunRequest]
    }
  }

  /**
    * Represents the result of a delete run request.
    */
  @js.native
  trait DeleteRunResult extends js.Object {}

  object DeleteRunResult {
    def apply(
        ): DeleteRunResult = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteRunResult]
    }
  }

  /**
    * Represents a request to the delete upload operation.
    */
  @js.native
  trait DeleteUploadRequest extends js.Object {
    var arn: AmazonResourceName
  }

  object DeleteUploadRequest {
    def apply(
        arn: AmazonResourceName
    ): DeleteUploadRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteUploadRequest]
    }
  }

  /**
    * Represents the result of a delete upload request.
    */
  @js.native
  trait DeleteUploadResult extends js.Object {}

  object DeleteUploadResult {
    def apply(
        ): DeleteUploadResult = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteUploadResult]
    }
  }

  @js.native
  trait DeleteVPCEConfigurationRequest extends js.Object {
    var arn: AmazonResourceName
  }

  object DeleteVPCEConfigurationRequest {
    def apply(
        arn: AmazonResourceName
    ): DeleteVPCEConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteVPCEConfigurationRequest]
    }
  }

  @js.native
  trait DeleteVPCEConfigurationResult extends js.Object {}

  object DeleteVPCEConfigurationResult {
    def apply(
        ): DeleteVPCEConfigurationResult = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteVPCEConfigurationResult]
    }
  }

  /**
    * Represents a device type that an app is tested against.
    */
  @js.native
  trait Device extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var availability: js.UndefOr[DeviceAvailability]
    var carrier: js.UndefOr[String]
    var cpu: js.UndefOr[CPU]
    var fleetName: js.UndefOr[String]
    var fleetType: js.UndefOr[String]
    var formFactor: js.UndefOr[DeviceFormFactor]
    var heapSize: js.UndefOr[Double]
    var image: js.UndefOr[String]
    var instances: js.UndefOr[DeviceInstances]
    var manufacturer: js.UndefOr[String]
    var memory: js.UndefOr[Double]
    var model: js.UndefOr[String]
    var modelId: js.UndefOr[String]
    var name: js.UndefOr[Name]
    var os: js.UndefOr[String]
    var platform: js.UndefOr[DevicePlatform]
    var radio: js.UndefOr[String]
    var remoteAccessEnabled: js.UndefOr[Boolean]
    var remoteDebugEnabled: js.UndefOr[Boolean]
    var resolution: js.UndefOr[Resolution]
  }

  object Device {
    def apply(
        arn: js.UndefOr[AmazonResourceName] = js.undefined,
        availability: js.UndefOr[DeviceAvailability] = js.undefined,
        carrier: js.UndefOr[String] = js.undefined,
        cpu: js.UndefOr[CPU] = js.undefined,
        fleetName: js.UndefOr[String] = js.undefined,
        fleetType: js.UndefOr[String] = js.undefined,
        formFactor: js.UndefOr[DeviceFormFactor] = js.undefined,
        heapSize: js.UndefOr[Double] = js.undefined,
        image: js.UndefOr[String] = js.undefined,
        instances: js.UndefOr[DeviceInstances] = js.undefined,
        manufacturer: js.UndefOr[String] = js.undefined,
        memory: js.UndefOr[Double] = js.undefined,
        model: js.UndefOr[String] = js.undefined,
        modelId: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        os: js.UndefOr[String] = js.undefined,
        platform: js.UndefOr[DevicePlatform] = js.undefined,
        radio: js.UndefOr[String] = js.undefined,
        remoteAccessEnabled: js.UndefOr[Boolean] = js.undefined,
        remoteDebugEnabled: js.UndefOr[Boolean] = js.undefined,
        resolution: js.UndefOr[Resolution] = js.undefined
    ): Device = {
      val __obj = js.Dictionary.empty[js.Any]
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      availability.foreach(__v => __obj.update("availability", __v.asInstanceOf[js.Any]))
      carrier.foreach(__v => __obj.update("carrier", __v.asInstanceOf[js.Any]))
      cpu.foreach(__v => __obj.update("cpu", __v.asInstanceOf[js.Any]))
      fleetName.foreach(__v => __obj.update("fleetName", __v.asInstanceOf[js.Any]))
      fleetType.foreach(__v => __obj.update("fleetType", __v.asInstanceOf[js.Any]))
      formFactor.foreach(__v => __obj.update("formFactor", __v.asInstanceOf[js.Any]))
      heapSize.foreach(__v => __obj.update("heapSize", __v.asInstanceOf[js.Any]))
      image.foreach(__v => __obj.update("image", __v.asInstanceOf[js.Any]))
      instances.foreach(__v => __obj.update("instances", __v.asInstanceOf[js.Any]))
      manufacturer.foreach(__v => __obj.update("manufacturer", __v.asInstanceOf[js.Any]))
      memory.foreach(__v => __obj.update("memory", __v.asInstanceOf[js.Any]))
      model.foreach(__v => __obj.update("model", __v.asInstanceOf[js.Any]))
      modelId.foreach(__v => __obj.update("modelId", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      os.foreach(__v => __obj.update("os", __v.asInstanceOf[js.Any]))
      platform.foreach(__v => __obj.update("platform", __v.asInstanceOf[js.Any]))
      radio.foreach(__v => __obj.update("radio", __v.asInstanceOf[js.Any]))
      remoteAccessEnabled.foreach(__v => __obj.update("remoteAccessEnabled", __v.asInstanceOf[js.Any]))
      remoteDebugEnabled.foreach(__v => __obj.update("remoteDebugEnabled", __v.asInstanceOf[js.Any]))
      resolution.foreach(__v => __obj.update("resolution", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Device]
    }
  }

  object DeviceAttributeEnum {
    val ARN                   = "ARN"
    val PLATFORM              = "PLATFORM"
    val FORM_FACTOR           = "FORM_FACTOR"
    val MANUFACTURER          = "MANUFACTURER"
    val REMOTE_ACCESS_ENABLED = "REMOTE_ACCESS_ENABLED"
    val REMOTE_DEBUG_ENABLED  = "REMOTE_DEBUG_ENABLED"
    val APPIUM_VERSION        = "APPIUM_VERSION"
    val INSTANCE_ARN          = "INSTANCE_ARN"
    val INSTANCE_LABELS       = "INSTANCE_LABELS"
    val FLEET_TYPE            = "FLEET_TYPE"
    val OS_VERSION            = "OS_VERSION"
    val MODEL                 = "MODEL"
    val AVAILABILITY          = "AVAILABILITY"

    val values = IndexedSeq(
      ARN,
      PLATFORM,
      FORM_FACTOR,
      MANUFACTURER,
      REMOTE_ACCESS_ENABLED,
      REMOTE_DEBUG_ENABLED,
      APPIUM_VERSION,
      INSTANCE_ARN,
      INSTANCE_LABELS,
      FLEET_TYPE,
      OS_VERSION,
      MODEL,
      AVAILABILITY
    )
  }

  object DeviceAvailabilityEnum {
    val TEMPORARY_NOT_AVAILABLE = "TEMPORARY_NOT_AVAILABLE"
    val BUSY                    = "BUSY"
    val AVAILABLE               = "AVAILABLE"
    val HIGHLY_AVAILABLE        = "HIGHLY_AVAILABLE"

    val values = IndexedSeq(TEMPORARY_NOT_AVAILABLE, BUSY, AVAILABLE, HIGHLY_AVAILABLE)
  }

  /**
    * Represents a device filter used to select a set of devices to be included in a test run. This data structure is passed in as the <code>deviceSelectionConfiguration</code> parameter to ScheduleRun. For an example of the JSON request syntax, see <a>ScheduleRun</a>.
    *  It is also passed in as the <code>filters</code> parameter to ListDevices. For an example of the JSON request syntax, see <a>ListDevices</a>.
    */
  @js.native
  trait DeviceFilter extends js.Object {
    var attribute: js.UndefOr[DeviceFilterAttribute]
    var operator: js.UndefOr[RuleOperator]
    var values: js.UndefOr[DeviceFilterValues]
  }

  object DeviceFilter {
    def apply(
        attribute: js.UndefOr[DeviceFilterAttribute] = js.undefined,
        operator: js.UndefOr[RuleOperator] = js.undefined,
        values: js.UndefOr[DeviceFilterValues] = js.undefined
    ): DeviceFilter = {
      val __obj = js.Dictionary.empty[js.Any]
      attribute.foreach(__v => __obj.update("attribute", __v.asInstanceOf[js.Any]))
      operator.foreach(__v => __obj.update("operator", __v.asInstanceOf[js.Any]))
      values.foreach(__v => __obj.update("values", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceFilter]
    }
  }

  object DeviceFilterAttributeEnum {
    val ARN                   = "ARN"
    val PLATFORM              = "PLATFORM"
    val OS_VERSION            = "OS_VERSION"
    val MODEL                 = "MODEL"
    val AVAILABILITY          = "AVAILABILITY"
    val FORM_FACTOR           = "FORM_FACTOR"
    val MANUFACTURER          = "MANUFACTURER"
    val REMOTE_ACCESS_ENABLED = "REMOTE_ACCESS_ENABLED"
    val REMOTE_DEBUG_ENABLED  = "REMOTE_DEBUG_ENABLED"
    val INSTANCE_ARN          = "INSTANCE_ARN"
    val INSTANCE_LABELS       = "INSTANCE_LABELS"
    val FLEET_TYPE            = "FLEET_TYPE"

    val values = IndexedSeq(
      ARN,
      PLATFORM,
      OS_VERSION,
      MODEL,
      AVAILABILITY,
      FORM_FACTOR,
      MANUFACTURER,
      REMOTE_ACCESS_ENABLED,
      REMOTE_DEBUG_ENABLED,
      INSTANCE_ARN,
      INSTANCE_LABELS,
      FLEET_TYPE
    )
  }

  object DeviceFormFactorEnum {
    val PHONE  = "PHONE"
    val TABLET = "TABLET"

    val values = IndexedSeq(PHONE, TABLET)
  }

  /**
    * Represents the device instance.
    */
  @js.native
  trait DeviceInstance extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var deviceArn: js.UndefOr[AmazonResourceName]
    var instanceProfile: js.UndefOr[InstanceProfile]
    var labels: js.UndefOr[InstanceLabels]
    var status: js.UndefOr[InstanceStatus]
    var udid: js.UndefOr[String]
  }

  object DeviceInstance {
    def apply(
        arn: js.UndefOr[AmazonResourceName] = js.undefined,
        deviceArn: js.UndefOr[AmazonResourceName] = js.undefined,
        instanceProfile: js.UndefOr[InstanceProfile] = js.undefined,
        labels: js.UndefOr[InstanceLabels] = js.undefined,
        status: js.UndefOr[InstanceStatus] = js.undefined,
        udid: js.UndefOr[String] = js.undefined
    ): DeviceInstance = {
      val __obj = js.Dictionary.empty[js.Any]
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      deviceArn.foreach(__v => __obj.update("deviceArn", __v.asInstanceOf[js.Any]))
      instanceProfile.foreach(__v => __obj.update("instanceProfile", __v.asInstanceOf[js.Any]))
      labels.foreach(__v => __obj.update("labels", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      udid.foreach(__v => __obj.update("udid", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceInstance]
    }
  }

  /**
    * Represents the total (metered or unmetered) minutes used by the resource to run tests. Contains the sum of minutes consumed by all children.
    */
  @js.native
  trait DeviceMinutes extends js.Object {
    var metered: js.UndefOr[Double]
    var total: js.UndefOr[Double]
    var unmetered: js.UndefOr[Double]
  }

  object DeviceMinutes {
    def apply(
        metered: js.UndefOr[Double] = js.undefined,
        total: js.UndefOr[Double] = js.undefined,
        unmetered: js.UndefOr[Double] = js.undefined
    ): DeviceMinutes = {
      val __obj = js.Dictionary.empty[js.Any]
      metered.foreach(__v => __obj.update("metered", __v.asInstanceOf[js.Any]))
      total.foreach(__v => __obj.update("total", __v.asInstanceOf[js.Any]))
      unmetered.foreach(__v => __obj.update("unmetered", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceMinutes]
    }
  }

  object DevicePlatformEnum {
    val ANDROID = "ANDROID"
    val IOS     = "IOS"

    val values = IndexedSeq(ANDROID, IOS)
  }

  /**
    * Represents a collection of device types.
    */
  @js.native
  trait DevicePool extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var description: js.UndefOr[Message]
    var maxDevices: js.UndefOr[Int]
    var name: js.UndefOr[Name]
    var rules: js.UndefOr[Rules]
    var `type`: js.UndefOr[DevicePoolType]
  }

  object DevicePool {
    def apply(
        arn: js.UndefOr[AmazonResourceName] = js.undefined,
        description: js.UndefOr[Message] = js.undefined,
        maxDevices: js.UndefOr[Int] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        rules: js.UndefOr[Rules] = js.undefined,
        `type`: js.UndefOr[DevicePoolType] = js.undefined
    ): DevicePool = {
      val __obj = js.Dictionary.empty[js.Any]
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      maxDevices.foreach(__v => __obj.update("maxDevices", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      rules.foreach(__v => __obj.update("rules", __v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DevicePool]
    }
  }

  /**
    * Represents a device pool compatibility result.
    */
  @js.native
  trait DevicePoolCompatibilityResult extends js.Object {
    var compatible: js.UndefOr[Boolean]
    var device: js.UndefOr[Device]
    var incompatibilityMessages: js.UndefOr[IncompatibilityMessages]
  }

  object DevicePoolCompatibilityResult {
    def apply(
        compatible: js.UndefOr[Boolean] = js.undefined,
        device: js.UndefOr[Device] = js.undefined,
        incompatibilityMessages: js.UndefOr[IncompatibilityMessages] = js.undefined
    ): DevicePoolCompatibilityResult = {
      val __obj = js.Dictionary.empty[js.Any]
      compatible.foreach(__v => __obj.update("compatible", __v.asInstanceOf[js.Any]))
      device.foreach(__v => __obj.update("device", __v.asInstanceOf[js.Any]))
      incompatibilityMessages.foreach(__v => __obj.update("incompatibilityMessages", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DevicePoolCompatibilityResult]
    }
  }

  object DevicePoolTypeEnum {
    val CURATED = "CURATED"
    val PRIVATE = "PRIVATE"

    val values = IndexedSeq(CURATED, PRIVATE)
  }

  /**
    * Represents the device filters used in a test run as well as the maximum number of devices to be included in the run. It is passed in as the <code>deviceSelectionConfiguration</code> request parameter in <a>ScheduleRun</a>.
    */
  @js.native
  trait DeviceSelectionConfiguration extends js.Object {
    var filters: DeviceFilters
    var maxDevices: Int
  }

  object DeviceSelectionConfiguration {
    def apply(
        filters: DeviceFilters,
        maxDevices: Int
    ): DeviceSelectionConfiguration = {
      val __obj = js.Dictionary[js.Any](
        "filters"    -> filters.asInstanceOf[js.Any],
        "maxDevices" -> maxDevices.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeviceSelectionConfiguration]
    }
  }

  /**
    * Contains the run results requested by the device selection configuration as well as how many devices were returned. For an example of the JSON response syntax, see <a>ScheduleRun</a>.
    */
  @js.native
  trait DeviceSelectionResult extends js.Object {
    var filters: js.UndefOr[DeviceFilters]
    var matchedDevicesCount: js.UndefOr[Int]
    var maxDevices: js.UndefOr[Int]
  }

  object DeviceSelectionResult {
    def apply(
        filters: js.UndefOr[DeviceFilters] = js.undefined,
        matchedDevicesCount: js.UndefOr[Int] = js.undefined,
        maxDevices: js.UndefOr[Int] = js.undefined
    ): DeviceSelectionResult = {
      val __obj = js.Dictionary.empty[js.Any]
      filters.foreach(__v => __obj.update("filters", __v.asInstanceOf[js.Any]))
      matchedDevicesCount.foreach(__v => __obj.update("matchedDevicesCount", __v.asInstanceOf[js.Any]))
      maxDevices.foreach(__v => __obj.update("maxDevices", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceSelectionResult]
    }
  }

  /**
    * Represents configuration information about a test run, such as the execution timeout (in minutes).
    */
  @js.native
  trait ExecutionConfiguration extends js.Object {
    var accountsCleanup: js.UndefOr[AccountsCleanup]
    var appPackagesCleanup: js.UndefOr[AppPackagesCleanup]
    var jobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes]
    var skipAppResign: js.UndefOr[SkipAppResign]
    var videoCapture: js.UndefOr[VideoCapture]
  }

  object ExecutionConfiguration {
    def apply(
        accountsCleanup: js.UndefOr[AccountsCleanup] = js.undefined,
        appPackagesCleanup: js.UndefOr[AppPackagesCleanup] = js.undefined,
        jobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.undefined,
        skipAppResign: js.UndefOr[SkipAppResign] = js.undefined,
        videoCapture: js.UndefOr[VideoCapture] = js.undefined
    ): ExecutionConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      accountsCleanup.foreach(__v => __obj.update("accountsCleanup", __v.asInstanceOf[js.Any]))
      appPackagesCleanup.foreach(__v => __obj.update("appPackagesCleanup", __v.asInstanceOf[js.Any]))
      jobTimeoutMinutes.foreach(__v => __obj.update("jobTimeoutMinutes", __v.asInstanceOf[js.Any]))
      skipAppResign.foreach(__v => __obj.update("skipAppResign", __v.asInstanceOf[js.Any]))
      videoCapture.foreach(__v => __obj.update("videoCapture", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExecutionConfiguration]
    }
  }

  object ExecutionResultEnum {
    val PENDING = "PENDING"
    val PASSED  = "PASSED"
    val WARNED  = "WARNED"
    val FAILED  = "FAILED"
    val SKIPPED = "SKIPPED"
    val ERRORED = "ERRORED"
    val STOPPED = "STOPPED"

    val values = IndexedSeq(PENDING, PASSED, WARNED, FAILED, SKIPPED, ERRORED, STOPPED)
  }

  object ExecutionResultCodeEnum {
    val PARSING_FAILED            = "PARSING_FAILED"
    val VPC_ENDPOINT_SETUP_FAILED = "VPC_ENDPOINT_SETUP_FAILED"

    val values = IndexedSeq(PARSING_FAILED, VPC_ENDPOINT_SETUP_FAILED)
  }

  object ExecutionStatusEnum {
    val PENDING             = "PENDING"
    val PENDING_CONCURRENCY = "PENDING_CONCURRENCY"
    val PENDING_DEVICE      = "PENDING_DEVICE"
    val PROCESSING          = "PROCESSING"
    val SCHEDULING          = "SCHEDULING"
    val PREPARING           = "PREPARING"
    val RUNNING             = "RUNNING"
    val COMPLETED           = "COMPLETED"
    val STOPPING            = "STOPPING"

    val values = IndexedSeq(
      PENDING,
      PENDING_CONCURRENCY,
      PENDING_DEVICE,
      PROCESSING,
      SCHEDULING,
      PREPARING,
      RUNNING,
      COMPLETED,
      STOPPING
    )
  }

  /**
    * Represents the request sent to retrieve the account settings.
    */
  @js.native
  trait GetAccountSettingsRequest extends js.Object {}

  object GetAccountSettingsRequest {
    def apply(
        ): GetAccountSettingsRequest = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[GetAccountSettingsRequest]
    }
  }

  /**
    * Represents the account settings return values from the <code>GetAccountSettings</code> request.
    */
  @js.native
  trait GetAccountSettingsResult extends js.Object {
    var accountSettings: js.UndefOr[AccountSettings]
  }

  object GetAccountSettingsResult {
    def apply(
        accountSettings: js.UndefOr[AccountSettings] = js.undefined
    ): GetAccountSettingsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      accountSettings.foreach(__v => __obj.update("accountSettings", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAccountSettingsResult]
    }
  }

  @js.native
  trait GetDeviceInstanceRequest extends js.Object {
    var arn: AmazonResourceName
  }

  object GetDeviceInstanceRequest {
    def apply(
        arn: AmazonResourceName
    ): GetDeviceInstanceRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDeviceInstanceRequest]
    }
  }

  @js.native
  trait GetDeviceInstanceResult extends js.Object {
    var deviceInstance: js.UndefOr[DeviceInstance]
  }

  object GetDeviceInstanceResult {
    def apply(
        deviceInstance: js.UndefOr[DeviceInstance] = js.undefined
    ): GetDeviceInstanceResult = {
      val __obj = js.Dictionary.empty[js.Any]
      deviceInstance.foreach(__v => __obj.update("deviceInstance", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeviceInstanceResult]
    }
  }

  /**
    * Represents a request to the get device pool compatibility operation.
    */
  @js.native
  trait GetDevicePoolCompatibilityRequest extends js.Object {
    var devicePoolArn: AmazonResourceName
    var appArn: js.UndefOr[AmazonResourceName]
    var configuration: js.UndefOr[ScheduleRunConfiguration]
    var test: js.UndefOr[ScheduleRunTest]
    var testType: js.UndefOr[TestType]
  }

  object GetDevicePoolCompatibilityRequest {
    def apply(
        devicePoolArn: AmazonResourceName,
        appArn: js.UndefOr[AmazonResourceName] = js.undefined,
        configuration: js.UndefOr[ScheduleRunConfiguration] = js.undefined,
        test: js.UndefOr[ScheduleRunTest] = js.undefined,
        testType: js.UndefOr[TestType] = js.undefined
    ): GetDevicePoolCompatibilityRequest = {
      val __obj = js.Dictionary[js.Any](
        "devicePoolArn" -> devicePoolArn.asInstanceOf[js.Any]
      )

      appArn.foreach(__v => __obj.update("appArn", __v.asInstanceOf[js.Any]))
      configuration.foreach(__v => __obj.update("configuration", __v.asInstanceOf[js.Any]))
      test.foreach(__v => __obj.update("test", __v.asInstanceOf[js.Any]))
      testType.foreach(__v => __obj.update("testType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDevicePoolCompatibilityRequest]
    }
  }

  /**
    * Represents the result of describe device pool compatibility request.
    */
  @js.native
  trait GetDevicePoolCompatibilityResult extends js.Object {
    var compatibleDevices: js.UndefOr[DevicePoolCompatibilityResults]
    var incompatibleDevices: js.UndefOr[DevicePoolCompatibilityResults]
  }

  object GetDevicePoolCompatibilityResult {
    def apply(
        compatibleDevices: js.UndefOr[DevicePoolCompatibilityResults] = js.undefined,
        incompatibleDevices: js.UndefOr[DevicePoolCompatibilityResults] = js.undefined
    ): GetDevicePoolCompatibilityResult = {
      val __obj = js.Dictionary.empty[js.Any]
      compatibleDevices.foreach(__v => __obj.update("compatibleDevices", __v.asInstanceOf[js.Any]))
      incompatibleDevices.foreach(__v => __obj.update("incompatibleDevices", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDevicePoolCompatibilityResult]
    }
  }

  /**
    * Represents a request to the get device pool operation.
    */
  @js.native
  trait GetDevicePoolRequest extends js.Object {
    var arn: AmazonResourceName
  }

  object GetDevicePoolRequest {
    def apply(
        arn: AmazonResourceName
    ): GetDevicePoolRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDevicePoolRequest]
    }
  }

  /**
    * Represents the result of a get device pool request.
    */
  @js.native
  trait GetDevicePoolResult extends js.Object {
    var devicePool: js.UndefOr[DevicePool]
  }

  object GetDevicePoolResult {
    def apply(
        devicePool: js.UndefOr[DevicePool] = js.undefined
    ): GetDevicePoolResult = {
      val __obj = js.Dictionary.empty[js.Any]
      devicePool.foreach(__v => __obj.update("devicePool", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDevicePoolResult]
    }
  }

  /**
    * Represents a request to the get device request.
    */
  @js.native
  trait GetDeviceRequest extends js.Object {
    var arn: AmazonResourceName
  }

  object GetDeviceRequest {
    def apply(
        arn: AmazonResourceName
    ): GetDeviceRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDeviceRequest]
    }
  }

  /**
    * Represents the result of a get device request.
    */
  @js.native
  trait GetDeviceResult extends js.Object {
    var device: js.UndefOr[Device]
  }

  object GetDeviceResult {
    def apply(
        device: js.UndefOr[Device] = js.undefined
    ): GetDeviceResult = {
      val __obj = js.Dictionary.empty[js.Any]
      device.foreach(__v => __obj.update("device", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeviceResult]
    }
  }

  @js.native
  trait GetInstanceProfileRequest extends js.Object {
    var arn: AmazonResourceName
  }

  object GetInstanceProfileRequest {
    def apply(
        arn: AmazonResourceName
    ): GetInstanceProfileRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetInstanceProfileRequest]
    }
  }

  @js.native
  trait GetInstanceProfileResult extends js.Object {
    var instanceProfile: js.UndefOr[InstanceProfile]
  }

  object GetInstanceProfileResult {
    def apply(
        instanceProfile: js.UndefOr[InstanceProfile] = js.undefined
    ): GetInstanceProfileResult = {
      val __obj = js.Dictionary.empty[js.Any]
      instanceProfile.foreach(__v => __obj.update("instanceProfile", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInstanceProfileResult]
    }
  }

  /**
    * Represents a request to the get job operation.
    */
  @js.native
  trait GetJobRequest extends js.Object {
    var arn: AmazonResourceName
  }

  object GetJobRequest {
    def apply(
        arn: AmazonResourceName
    ): GetJobRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetJobRequest]
    }
  }

  /**
    * Represents the result of a get job request.
    */
  @js.native
  trait GetJobResult extends js.Object {
    var job: js.UndefOr[Job]
  }

  object GetJobResult {
    def apply(
        job: js.UndefOr[Job] = js.undefined
    ): GetJobResult = {
      val __obj = js.Dictionary.empty[js.Any]
      job.foreach(__v => __obj.update("job", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetJobResult]
    }
  }

  @js.native
  trait GetNetworkProfileRequest extends js.Object {
    var arn: AmazonResourceName
  }

  object GetNetworkProfileRequest {
    def apply(
        arn: AmazonResourceName
    ): GetNetworkProfileRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetNetworkProfileRequest]
    }
  }

  @js.native
  trait GetNetworkProfileResult extends js.Object {
    var networkProfile: js.UndefOr[NetworkProfile]
  }

  object GetNetworkProfileResult {
    def apply(
        networkProfile: js.UndefOr[NetworkProfile] = js.undefined
    ): GetNetworkProfileResult = {
      val __obj = js.Dictionary.empty[js.Any]
      networkProfile.foreach(__v => __obj.update("networkProfile", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetNetworkProfileResult]
    }
  }

  /**
    * Represents the request to retrieve the offering status for the specified customer or account.
    */
  @js.native
  trait GetOfferingStatusRequest extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
  }

  object GetOfferingStatusRequest {
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): GetOfferingStatusRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOfferingStatusRequest]
    }
  }

  /**
    * Returns the status result for a device offering.
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
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): GetOfferingStatusResult = {
      val __obj = js.Dictionary.empty[js.Any]
      current.foreach(__v => __obj.update("current", __v.asInstanceOf[js.Any]))
      nextPeriod.foreach(__v => __obj.update("nextPeriod", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOfferingStatusResult]
    }
  }

  /**
    * Represents a request to the get project operation.
    */
  @js.native
  trait GetProjectRequest extends js.Object {
    var arn: AmazonResourceName
  }

  object GetProjectRequest {
    def apply(
        arn: AmazonResourceName
    ): GetProjectRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetProjectRequest]
    }
  }

  /**
    * Represents the result of a get project request.
    */
  @js.native
  trait GetProjectResult extends js.Object {
    var project: js.UndefOr[Project]
  }

  object GetProjectResult {
    def apply(
        project: js.UndefOr[Project] = js.undefined
    ): GetProjectResult = {
      val __obj = js.Dictionary.empty[js.Any]
      project.foreach(__v => __obj.update("project", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetProjectResult]
    }
  }

  /**
    * Represents the request to get information about the specified remote access session.
    */
  @js.native
  trait GetRemoteAccessSessionRequest extends js.Object {
    var arn: AmazonResourceName
  }

  object GetRemoteAccessSessionRequest {
    def apply(
        arn: AmazonResourceName
    ): GetRemoteAccessSessionRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetRemoteAccessSessionRequest]
    }
  }

  /**
    * Represents the response from the server that lists detailed information about the remote access session.
    */
  @js.native
  trait GetRemoteAccessSessionResult extends js.Object {
    var remoteAccessSession: js.UndefOr[RemoteAccessSession]
  }

  object GetRemoteAccessSessionResult {
    def apply(
        remoteAccessSession: js.UndefOr[RemoteAccessSession] = js.undefined
    ): GetRemoteAccessSessionResult = {
      val __obj = js.Dictionary.empty[js.Any]
      remoteAccessSession.foreach(__v => __obj.update("remoteAccessSession", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRemoteAccessSessionResult]
    }
  }

  /**
    * Represents a request to the get run operation.
    */
  @js.native
  trait GetRunRequest extends js.Object {
    var arn: AmazonResourceName
  }

  object GetRunRequest {
    def apply(
        arn: AmazonResourceName
    ): GetRunRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetRunRequest]
    }
  }

  /**
    * Represents the result of a get run request.
    */
  @js.native
  trait GetRunResult extends js.Object {
    var run: js.UndefOr[Run]
  }

  object GetRunResult {
    def apply(
        run: js.UndefOr[Run] = js.undefined
    ): GetRunResult = {
      val __obj = js.Dictionary.empty[js.Any]
      run.foreach(__v => __obj.update("run", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRunResult]
    }
  }

  /**
    * Represents a request to the get suite operation.
    */
  @js.native
  trait GetSuiteRequest extends js.Object {
    var arn: AmazonResourceName
  }

  object GetSuiteRequest {
    def apply(
        arn: AmazonResourceName
    ): GetSuiteRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetSuiteRequest]
    }
  }

  /**
    * Represents the result of a get suite request.
    */
  @js.native
  trait GetSuiteResult extends js.Object {
    var suite: js.UndefOr[Suite]
  }

  object GetSuiteResult {
    def apply(
        suite: js.UndefOr[Suite] = js.undefined
    ): GetSuiteResult = {
      val __obj = js.Dictionary.empty[js.Any]
      suite.foreach(__v => __obj.update("suite", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSuiteResult]
    }
  }

  /**
    * Represents a request to the get test operation.
    */
  @js.native
  trait GetTestRequest extends js.Object {
    var arn: AmazonResourceName
  }

  object GetTestRequest {
    def apply(
        arn: AmazonResourceName
    ): GetTestRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetTestRequest]
    }
  }

  /**
    * Represents the result of a get test request.
    */
  @js.native
  trait GetTestResult extends js.Object {
    var test: js.UndefOr[Test]
  }

  object GetTestResult {
    def apply(
        test: js.UndefOr[Test] = js.undefined
    ): GetTestResult = {
      val __obj = js.Dictionary.empty[js.Any]
      test.foreach(__v => __obj.update("test", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTestResult]
    }
  }

  /**
    * Represents a request to the get upload operation.
    */
  @js.native
  trait GetUploadRequest extends js.Object {
    var arn: AmazonResourceName
  }

  object GetUploadRequest {
    def apply(
        arn: AmazonResourceName
    ): GetUploadRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetUploadRequest]
    }
  }

  /**
    * Represents the result of a get upload request.
    */
  @js.native
  trait GetUploadResult extends js.Object {
    var upload: js.UndefOr[Upload]
  }

  object GetUploadResult {
    def apply(
        upload: js.UndefOr[Upload] = js.undefined
    ): GetUploadResult = {
      val __obj = js.Dictionary.empty[js.Any]
      upload.foreach(__v => __obj.update("upload", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUploadResult]
    }
  }

  @js.native
  trait GetVPCEConfigurationRequest extends js.Object {
    var arn: AmazonResourceName
  }

  object GetVPCEConfigurationRequest {
    def apply(
        arn: AmazonResourceName
    ): GetVPCEConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetVPCEConfigurationRequest]
    }
  }

  @js.native
  trait GetVPCEConfigurationResult extends js.Object {
    var vpceConfiguration: js.UndefOr[VPCEConfiguration]
  }

  object GetVPCEConfigurationResult {
    def apply(
        vpceConfiguration: js.UndefOr[VPCEConfiguration] = js.undefined
    ): GetVPCEConfigurationResult = {
      val __obj = js.Dictionary.empty[js.Any]
      vpceConfiguration.foreach(__v => __obj.update("vpceConfiguration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVPCEConfigurationResult]
    }
  }

  /**
    * Represents information about incompatibility.
    */
  @js.native
  trait IncompatibilityMessage extends js.Object {
    var message: js.UndefOr[Message]
    var `type`: js.UndefOr[DeviceAttribute]
  }

  object IncompatibilityMessage {
    def apply(
        message: js.UndefOr[Message] = js.undefined,
        `type`: js.UndefOr[DeviceAttribute] = js.undefined
    ): IncompatibilityMessage = {
      val __obj = js.Dictionary.empty[js.Any]
      message.foreach(__v => __obj.update("message", __v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IncompatibilityMessage]
    }
  }

  /**
    * Represents the request to install an Android application (in .apk format) or an iOS application (in .ipa format) as part of a remote access session.
    */
  @js.native
  trait InstallToRemoteAccessSessionRequest extends js.Object {
    var appArn: AmazonResourceName
    var remoteAccessSessionArn: AmazonResourceName
  }

  object InstallToRemoteAccessSessionRequest {
    def apply(
        appArn: AmazonResourceName,
        remoteAccessSessionArn: AmazonResourceName
    ): InstallToRemoteAccessSessionRequest = {
      val __obj = js.Dictionary[js.Any](
        "appArn"                 -> appArn.asInstanceOf[js.Any],
        "remoteAccessSessionArn" -> remoteAccessSessionArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[InstallToRemoteAccessSessionRequest]
    }
  }

  /**
    * Represents the response from the server after AWS Device Farm makes a request to install to a remote access session.
    */
  @js.native
  trait InstallToRemoteAccessSessionResult extends js.Object {
    var appUpload: js.UndefOr[Upload]
  }

  object InstallToRemoteAccessSessionResult {
    def apply(
        appUpload: js.UndefOr[Upload] = js.undefined
    ): InstallToRemoteAccessSessionResult = {
      val __obj = js.Dictionary.empty[js.Any]
      appUpload.foreach(__v => __obj.update("appUpload", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstallToRemoteAccessSessionResult]
    }
  }

  /**
    * Represents the instance profile.
    */
  @js.native
  trait InstanceProfile extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var description: js.UndefOr[Message]
    var excludeAppPackagesFromCleanup: js.UndefOr[PackageIds]
    var name: js.UndefOr[Name]
    var packageCleanup: js.UndefOr[Boolean]
    var rebootAfterUse: js.UndefOr[Boolean]
  }

  object InstanceProfile {
    def apply(
        arn: js.UndefOr[AmazonResourceName] = js.undefined,
        description: js.UndefOr[Message] = js.undefined,
        excludeAppPackagesFromCleanup: js.UndefOr[PackageIds] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        packageCleanup: js.UndefOr[Boolean] = js.undefined,
        rebootAfterUse: js.UndefOr[Boolean] = js.undefined
    ): InstanceProfile = {
      val __obj = js.Dictionary.empty[js.Any]
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      excludeAppPackagesFromCleanup.foreach(
        __v => __obj.update("excludeAppPackagesFromCleanup", __v.asInstanceOf[js.Any])
      )
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      packageCleanup.foreach(__v => __obj.update("packageCleanup", __v.asInstanceOf[js.Any]))
      rebootAfterUse.foreach(__v => __obj.update("rebootAfterUse", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceProfile]
    }
  }

  object InstanceStatusEnum {
    val IN_USE        = "IN_USE"
    val PREPARING     = "PREPARING"
    val AVAILABLE     = "AVAILABLE"
    val NOT_AVAILABLE = "NOT_AVAILABLE"

    val values = IndexedSeq(IN_USE, PREPARING, AVAILABLE, NOT_AVAILABLE)
  }

  object InteractionModeEnum {
    val INTERACTIVE = "INTERACTIVE"
    val NO_VIDEO    = "NO_VIDEO"
    val VIDEO_ONLY  = "VIDEO_ONLY"

    val values = IndexedSeq(INTERACTIVE, NO_VIDEO, VIDEO_ONLY)
  }

  /**
    * Represents a device.
    */
  @js.native
  trait Job extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var counters: js.UndefOr[Counters]
    var created: js.UndefOr[DateTime]
    var device: js.UndefOr[Device]
    var deviceMinutes: js.UndefOr[DeviceMinutes]
    var instanceArn: js.UndefOr[AmazonResourceName]
    var message: js.UndefOr[Message]
    var name: js.UndefOr[Name]
    var result: js.UndefOr[ExecutionResult]
    var started: js.UndefOr[DateTime]
    var status: js.UndefOr[ExecutionStatus]
    var stopped: js.UndefOr[DateTime]
    var `type`: js.UndefOr[TestType]
    var videoCapture: js.UndefOr[VideoCapture]
    var videoEndpoint: js.UndefOr[String]
  }

  object Job {
    def apply(
        arn: js.UndefOr[AmazonResourceName] = js.undefined,
        counters: js.UndefOr[Counters] = js.undefined,
        created: js.UndefOr[DateTime] = js.undefined,
        device: js.UndefOr[Device] = js.undefined,
        deviceMinutes: js.UndefOr[DeviceMinutes] = js.undefined,
        instanceArn: js.UndefOr[AmazonResourceName] = js.undefined,
        message: js.UndefOr[Message] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        result: js.UndefOr[ExecutionResult] = js.undefined,
        started: js.UndefOr[DateTime] = js.undefined,
        status: js.UndefOr[ExecutionStatus] = js.undefined,
        stopped: js.UndefOr[DateTime] = js.undefined,
        `type`: js.UndefOr[TestType] = js.undefined,
        videoCapture: js.UndefOr[VideoCapture] = js.undefined,
        videoEndpoint: js.UndefOr[String] = js.undefined
    ): Job = {
      val __obj = js.Dictionary.empty[js.Any]
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      counters.foreach(__v => __obj.update("counters", __v.asInstanceOf[js.Any]))
      created.foreach(__v => __obj.update("created", __v.asInstanceOf[js.Any]))
      device.foreach(__v => __obj.update("device", __v.asInstanceOf[js.Any]))
      deviceMinutes.foreach(__v => __obj.update("deviceMinutes", __v.asInstanceOf[js.Any]))
      instanceArn.foreach(__v => __obj.update("instanceArn", __v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.update("message", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      result.foreach(__v => __obj.update("result", __v.asInstanceOf[js.Any]))
      started.foreach(__v => __obj.update("started", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      stopped.foreach(__v => __obj.update("stopped", __v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      videoCapture.foreach(__v => __obj.update("videoCapture", __v.asInstanceOf[js.Any]))
      videoEndpoint.foreach(__v => __obj.update("videoEndpoint", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Job]
    }
  }

  /**
    * Represents a request to the list artifacts operation.
    */
  @js.native
  trait ListArtifactsRequest extends js.Object {
    var arn: AmazonResourceName
    var `type`: ArtifactCategory
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListArtifactsRequest {
    def apply(
        arn: AmazonResourceName,
        `type`: ArtifactCategory,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListArtifactsRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn"  -> arn.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListArtifactsRequest]
    }
  }

  /**
    * Represents the result of a list artifacts operation.
    */
  @js.native
  trait ListArtifactsResult extends js.Object {
    var artifacts: js.UndefOr[Artifacts]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListArtifactsResult {
    def apply(
        artifacts: js.UndefOr[Artifacts] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListArtifactsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      artifacts.foreach(__v => __obj.update("artifacts", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListArtifactsResult]
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
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListDeviceInstancesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeviceInstancesRequest]
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
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListDeviceInstancesResult = {
      val __obj = js.Dictionary.empty[js.Any]
      deviceInstances.foreach(__v => __obj.update("deviceInstances", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeviceInstancesResult]
    }
  }

  /**
    * Represents the result of a list device pools request.
    */
  @js.native
  trait ListDevicePoolsRequest extends js.Object {
    var arn: AmazonResourceName
    var nextToken: js.UndefOr[PaginationToken]
    var `type`: js.UndefOr[DevicePoolType]
  }

  object ListDevicePoolsRequest {
    def apply(
        arn: AmazonResourceName,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        `type`: js.UndefOr[DevicePoolType] = js.undefined
    ): ListDevicePoolsRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDevicePoolsRequest]
    }
  }

  /**
    * Represents the result of a list device pools request.
    */
  @js.native
  trait ListDevicePoolsResult extends js.Object {
    var devicePools: js.UndefOr[DevicePools]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListDevicePoolsResult {
    def apply(
        devicePools: js.UndefOr[DevicePools] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListDevicePoolsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      devicePools.foreach(__v => __obj.update("devicePools", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDevicePoolsResult]
    }
  }

  /**
    * Represents the result of a list devices request.
    */
  @js.native
  trait ListDevicesRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var filters: js.UndefOr[DeviceFilters]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListDevicesRequest {
    def apply(
        arn: js.UndefOr[AmazonResourceName] = js.undefined,
        filters: js.UndefOr[DeviceFilters] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListDevicesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      filters.foreach(__v => __obj.update("filters", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDevicesRequest]
    }
  }

  /**
    * Represents the result of a list devices operation.
    */
  @js.native
  trait ListDevicesResult extends js.Object {
    var devices: js.UndefOr[Devices]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListDevicesResult {
    def apply(
        devices: js.UndefOr[Devices] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListDevicesResult = {
      val __obj = js.Dictionary.empty[js.Any]
      devices.foreach(__v => __obj.update("devices", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDevicesResult]
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
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListInstanceProfilesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInstanceProfilesRequest]
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
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListInstanceProfilesResult = {
      val __obj = js.Dictionary.empty[js.Any]
      instanceProfiles.foreach(__v => __obj.update("instanceProfiles", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInstanceProfilesResult]
    }
  }

  /**
    * Represents a request to the list jobs operation.
    */
  @js.native
  trait ListJobsRequest extends js.Object {
    var arn: AmazonResourceName
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListJobsRequest {
    def apply(
        arn: AmazonResourceName,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListJobsRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsRequest]
    }
  }

  /**
    * Represents the result of a list jobs request.
    */
  @js.native
  trait ListJobsResult extends js.Object {
    var jobs: js.UndefOr[Jobs]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListJobsResult {
    def apply(
        jobs: js.UndefOr[Jobs] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListJobsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      jobs.foreach(__v => __obj.update("jobs", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsResult]
    }
  }

  @js.native
  trait ListNetworkProfilesRequest extends js.Object {
    var arn: AmazonResourceName
    var nextToken: js.UndefOr[PaginationToken]
    var `type`: js.UndefOr[NetworkProfileType]
  }

  object ListNetworkProfilesRequest {
    def apply(
        arn: AmazonResourceName,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        `type`: js.UndefOr[NetworkProfileType] = js.undefined
    ): ListNetworkProfilesRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNetworkProfilesRequest]
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
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListNetworkProfilesResult = {
      val __obj = js.Dictionary.empty[js.Any]
      networkProfiles.foreach(__v => __obj.update("networkProfiles", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNetworkProfilesResult]
    }
  }

  @js.native
  trait ListOfferingPromotionsRequest extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListOfferingPromotionsRequest {
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListOfferingPromotionsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOfferingPromotionsRequest]
    }
  }

  @js.native
  trait ListOfferingPromotionsResult extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var offeringPromotions: js.UndefOr[OfferingPromotions]
  }

  object ListOfferingPromotionsResult {
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        offeringPromotions: js.UndefOr[OfferingPromotions] = js.undefined
    ): ListOfferingPromotionsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      offeringPromotions.foreach(__v => __obj.update("offeringPromotions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOfferingPromotionsResult]
    }
  }

  /**
    * Represents the request to list the offering transaction history.
    */
  @js.native
  trait ListOfferingTransactionsRequest extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListOfferingTransactionsRequest {
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListOfferingTransactionsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOfferingTransactionsRequest]
    }
  }

  /**
    * Returns the transaction log of the specified offerings.
    */
  @js.native
  trait ListOfferingTransactionsResult extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var offeringTransactions: js.UndefOr[OfferingTransactions]
  }

  object ListOfferingTransactionsResult {
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        offeringTransactions: js.UndefOr[OfferingTransactions] = js.undefined
    ): ListOfferingTransactionsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      offeringTransactions.foreach(__v => __obj.update("offeringTransactions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOfferingTransactionsResult]
    }
  }

  /**
    * Represents the request to list all offerings.
    */
  @js.native
  trait ListOfferingsRequest extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListOfferingsRequest {
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListOfferingsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOfferingsRequest]
    }
  }

  /**
    * Represents the return values of the list of offerings.
    */
  @js.native
  trait ListOfferingsResult extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var offerings: js.UndefOr[Offerings]
  }

  object ListOfferingsResult {
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        offerings: js.UndefOr[Offerings] = js.undefined
    ): ListOfferingsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      offerings.foreach(__v => __obj.update("offerings", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOfferingsResult]
    }
  }

  /**
    * Represents a request to the list projects operation.
    */
  @js.native
  trait ListProjectsRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListProjectsRequest {
    def apply(
        arn: js.UndefOr[AmazonResourceName] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListProjectsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProjectsRequest]
    }
  }

  /**
    * Represents the result of a list projects request.
    */
  @js.native
  trait ListProjectsResult extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var projects: js.UndefOr[Projects]
  }

  object ListProjectsResult {
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        projects: js.UndefOr[Projects] = js.undefined
    ): ListProjectsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      projects.foreach(__v => __obj.update("projects", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProjectsResult]
    }
  }

  /**
    * Represents the request to return information about the remote access session.
    */
  @js.native
  trait ListRemoteAccessSessionsRequest extends js.Object {
    var arn: AmazonResourceName
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListRemoteAccessSessionsRequest {
    def apply(
        arn: AmazonResourceName,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListRemoteAccessSessionsRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRemoteAccessSessionsRequest]
    }
  }

  /**
    * Represents the response from the server after AWS Device Farm makes a request to return information about the remote access session.
    */
  @js.native
  trait ListRemoteAccessSessionsResult extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var remoteAccessSessions: js.UndefOr[RemoteAccessSessions]
  }

  object ListRemoteAccessSessionsResult {
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        remoteAccessSessions: js.UndefOr[RemoteAccessSessions] = js.undefined
    ): ListRemoteAccessSessionsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      remoteAccessSessions.foreach(__v => __obj.update("remoteAccessSessions", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRemoteAccessSessionsResult]
    }
  }

  /**
    * Represents a request to the list runs operation.
    */
  @js.native
  trait ListRunsRequest extends js.Object {
    var arn: AmazonResourceName
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListRunsRequest {
    def apply(
        arn: AmazonResourceName,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListRunsRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRunsRequest]
    }
  }

  /**
    * Represents the result of a list runs request.
    */
  @js.native
  trait ListRunsResult extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var runs: js.UndefOr[Runs]
  }

  object ListRunsResult {
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        runs: js.UndefOr[Runs] = js.undefined
    ): ListRunsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      runs.foreach(__v => __obj.update("runs", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRunsResult]
    }
  }

  /**
    * Represents a request to the list samples operation.
    */
  @js.native
  trait ListSamplesRequest extends js.Object {
    var arn: AmazonResourceName
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListSamplesRequest {
    def apply(
        arn: AmazonResourceName,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListSamplesRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSamplesRequest]
    }
  }

  /**
    * Represents the result of a list samples request.
    */
  @js.native
  trait ListSamplesResult extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var samples: js.UndefOr[Samples]
  }

  object ListSamplesResult {
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        samples: js.UndefOr[Samples] = js.undefined
    ): ListSamplesResult = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      samples.foreach(__v => __obj.update("samples", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSamplesResult]
    }
  }

  /**
    * Represents a request to the list suites operation.
    */
  @js.native
  trait ListSuitesRequest extends js.Object {
    var arn: AmazonResourceName
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListSuitesRequest {
    def apply(
        arn: AmazonResourceName,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListSuitesRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSuitesRequest]
    }
  }

  /**
    * Represents the result of a list suites request.
    */
  @js.native
  trait ListSuitesResult extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var suites: js.UndefOr[Suites]
  }

  object ListSuitesResult {
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        suites: js.UndefOr[Suites] = js.undefined
    ): ListSuitesResult = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      suites.foreach(__v => __obj.update("suites", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSuitesResult]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
  }

  object ListTagsForResourceRequest {
    def apply(
        ResourceARN: AmazonResourceName
    ): ListTagsForResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    def apply(
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /**
    * Represents a request to the list tests operation.
    */
  @js.native
  trait ListTestsRequest extends js.Object {
    var arn: AmazonResourceName
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListTestsRequest {
    def apply(
        arn: AmazonResourceName,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListTestsRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTestsRequest]
    }
  }

  /**
    * Represents the result of a list tests request.
    */
  @js.native
  trait ListTestsResult extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var tests: js.UndefOr[Tests]
  }

  object ListTestsResult {
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        tests: js.UndefOr[Tests] = js.undefined
    ): ListTestsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      tests.foreach(__v => __obj.update("tests", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTestsResult]
    }
  }

  /**
    * Represents a request to the list unique problems operation.
    */
  @js.native
  trait ListUniqueProblemsRequest extends js.Object {
    var arn: AmazonResourceName
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListUniqueProblemsRequest {
    def apply(
        arn: AmazonResourceName,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListUniqueProblemsRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUniqueProblemsRequest]
    }
  }

  /**
    * Represents the result of a list unique problems request.
    */
  @js.native
  trait ListUniqueProblemsResult extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var uniqueProblems: js.UndefOr[UniqueProblemsByExecutionResultMap]
  }

  object ListUniqueProblemsResult {
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        uniqueProblems: js.UndefOr[UniqueProblemsByExecutionResultMap] = js.undefined
    ): ListUniqueProblemsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      uniqueProblems.foreach(__v => __obj.update("uniqueProblems", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUniqueProblemsResult]
    }
  }

  /**
    * Represents a request to the list uploads operation.
    */
  @js.native
  trait ListUploadsRequest extends js.Object {
    var arn: AmazonResourceName
    var nextToken: js.UndefOr[PaginationToken]
    var `type`: js.UndefOr[UploadType]
  }

  object ListUploadsRequest {
    def apply(
        arn: AmazonResourceName,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        `type`: js.UndefOr[UploadType] = js.undefined
    ): ListUploadsRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUploadsRequest]
    }
  }

  /**
    * Represents the result of a list uploads request.
    */
  @js.native
  trait ListUploadsResult extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var uploads: js.UndefOr[Uploads]
  }

  object ListUploadsResult {
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        uploads: js.UndefOr[Uploads] = js.undefined
    ): ListUploadsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      uploads.foreach(__v => __obj.update("uploads", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUploadsResult]
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
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListVPCEConfigurationsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVPCEConfigurationsRequest]
    }
  }

  @js.native
  trait ListVPCEConfigurationsResult extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var vpceConfigurations: js.UndefOr[VPCEConfigurations]
  }

  object ListVPCEConfigurationsResult {
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        vpceConfigurations: js.UndefOr[VPCEConfigurations] = js.undefined
    ): ListVPCEConfigurationsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      vpceConfigurations.foreach(__v => __obj.update("vpceConfigurations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVPCEConfigurationsResult]
    }
  }

  /**
    * Represents a latitude and longitude pair, expressed in geographic coordinate system degrees (for example 47.6204, -122.3491).
    *  Elevation is currently not supported.
    */
  @js.native
  trait Location extends js.Object {
    var latitude: Double
    var longitude: Double
  }

  object Location {
    def apply(
        latitude: Double,
        longitude: Double
    ): Location = {
      val __obj = js.Dictionary[js.Any](
        "latitude"  -> latitude.asInstanceOf[js.Any],
        "longitude" -> longitude.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Location]
    }
  }

  /**
    * A number representing the monetary amount for an offering or transaction.
    */
  @js.native
  trait MonetaryAmount extends js.Object {
    var amount: js.UndefOr[Double]
    var currencyCode: js.UndefOr[CurrencyCode]
  }

  object MonetaryAmount {
    def apply(
        amount: js.UndefOr[Double] = js.undefined,
        currencyCode: js.UndefOr[CurrencyCode] = js.undefined
    ): MonetaryAmount = {
      val __obj = js.Dictionary.empty[js.Any]
      amount.foreach(__v => __obj.update("amount", __v.asInstanceOf[js.Any]))
      currencyCode.foreach(__v => __obj.update("currencyCode", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MonetaryAmount]
    }
  }

  /**
    * An array of settings that describes characteristics of a network profile.
    */
  @js.native
  trait NetworkProfile extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var description: js.UndefOr[Message]
    var downlinkBandwidthBits: js.UndefOr[Double]
    var downlinkDelayMs: js.UndefOr[Double]
    var downlinkJitterMs: js.UndefOr[Double]
    var downlinkLossPercent: js.UndefOr[PercentInteger]
    var name: js.UndefOr[Name]
    var `type`: js.UndefOr[NetworkProfileType]
    var uplinkBandwidthBits: js.UndefOr[Double]
    var uplinkDelayMs: js.UndefOr[Double]
    var uplinkJitterMs: js.UndefOr[Double]
    var uplinkLossPercent: js.UndefOr[PercentInteger]
  }

  object NetworkProfile {
    def apply(
        arn: js.UndefOr[AmazonResourceName] = js.undefined,
        description: js.UndefOr[Message] = js.undefined,
        downlinkBandwidthBits: js.UndefOr[Double] = js.undefined,
        downlinkDelayMs: js.UndefOr[Double] = js.undefined,
        downlinkJitterMs: js.UndefOr[Double] = js.undefined,
        downlinkLossPercent: js.UndefOr[PercentInteger] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        `type`: js.UndefOr[NetworkProfileType] = js.undefined,
        uplinkBandwidthBits: js.UndefOr[Double] = js.undefined,
        uplinkDelayMs: js.UndefOr[Double] = js.undefined,
        uplinkJitterMs: js.UndefOr[Double] = js.undefined,
        uplinkLossPercent: js.UndefOr[PercentInteger] = js.undefined
    ): NetworkProfile = {
      val __obj = js.Dictionary.empty[js.Any]
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      downlinkBandwidthBits.foreach(__v => __obj.update("downlinkBandwidthBits", __v.asInstanceOf[js.Any]))
      downlinkDelayMs.foreach(__v => __obj.update("downlinkDelayMs", __v.asInstanceOf[js.Any]))
      downlinkJitterMs.foreach(__v => __obj.update("downlinkJitterMs", __v.asInstanceOf[js.Any]))
      downlinkLossPercent.foreach(__v => __obj.update("downlinkLossPercent", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      uplinkBandwidthBits.foreach(__v => __obj.update("uplinkBandwidthBits", __v.asInstanceOf[js.Any]))
      uplinkDelayMs.foreach(__v => __obj.update("uplinkDelayMs", __v.asInstanceOf[js.Any]))
      uplinkJitterMs.foreach(__v => __obj.update("uplinkJitterMs", __v.asInstanceOf[js.Any]))
      uplinkLossPercent.foreach(__v => __obj.update("uplinkLossPercent", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkProfile]
    }
  }

  object NetworkProfileTypeEnum {
    val CURATED = "CURATED"
    val PRIVATE = "PRIVATE"

    val values = IndexedSeq(CURATED, PRIVATE)
  }

  /**
    * Represents the metadata of a device offering.
    */
  @js.native
  trait Offering extends js.Object {
    var description: js.UndefOr[Message]
    var id: js.UndefOr[OfferingIdentifier]
    var platform: js.UndefOr[DevicePlatform]
    var recurringCharges: js.UndefOr[RecurringCharges]
    var `type`: js.UndefOr[OfferingType]
  }

  object Offering {
    def apply(
        description: js.UndefOr[Message] = js.undefined,
        id: js.UndefOr[OfferingIdentifier] = js.undefined,
        platform: js.UndefOr[DevicePlatform] = js.undefined,
        recurringCharges: js.UndefOr[RecurringCharges] = js.undefined,
        `type`: js.UndefOr[OfferingType] = js.undefined
    ): Offering = {
      val __obj = js.Dictionary.empty[js.Any]
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.update("id", __v.asInstanceOf[js.Any]))
      platform.foreach(__v => __obj.update("platform", __v.asInstanceOf[js.Any]))
      recurringCharges.foreach(__v => __obj.update("recurringCharges", __v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Offering]
    }
  }

  /**
    * Represents information about an offering promotion.
    */
  @js.native
  trait OfferingPromotion extends js.Object {
    var description: js.UndefOr[Message]
    var id: js.UndefOr[OfferingPromotionIdentifier]
  }

  object OfferingPromotion {
    def apply(
        description: js.UndefOr[Message] = js.undefined,
        id: js.UndefOr[OfferingPromotionIdentifier] = js.undefined
    ): OfferingPromotion = {
      val __obj = js.Dictionary.empty[js.Any]
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.update("id", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OfferingPromotion]
    }
  }

  /**
    * The status of the offering.
    */
  @js.native
  trait OfferingStatus extends js.Object {
    var effectiveOn: js.UndefOr[DateTime]
    var offering: js.UndefOr[Offering]
    var quantity: js.UndefOr[Int]
    var `type`: js.UndefOr[OfferingTransactionType]
  }

  object OfferingStatus {
    def apply(
        effectiveOn: js.UndefOr[DateTime] = js.undefined,
        offering: js.UndefOr[Offering] = js.undefined,
        quantity: js.UndefOr[Int] = js.undefined,
        `type`: js.UndefOr[OfferingTransactionType] = js.undefined
    ): OfferingStatus = {
      val __obj = js.Dictionary.empty[js.Any]
      effectiveOn.foreach(__v => __obj.update("effectiveOn", __v.asInstanceOf[js.Any]))
      offering.foreach(__v => __obj.update("offering", __v.asInstanceOf[js.Any]))
      quantity.foreach(__v => __obj.update("quantity", __v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OfferingStatus]
    }
  }

  /**
    * Represents the metadata of an offering transaction.
    */
  @js.native
  trait OfferingTransaction extends js.Object {
    var cost: js.UndefOr[MonetaryAmount]
    var createdOn: js.UndefOr[DateTime]
    var offeringPromotionId: js.UndefOr[OfferingPromotionIdentifier]
    var offeringStatus: js.UndefOr[OfferingStatus]
    var transactionId: js.UndefOr[TransactionIdentifier]
  }

  object OfferingTransaction {
    def apply(
        cost: js.UndefOr[MonetaryAmount] = js.undefined,
        createdOn: js.UndefOr[DateTime] = js.undefined,
        offeringPromotionId: js.UndefOr[OfferingPromotionIdentifier] = js.undefined,
        offeringStatus: js.UndefOr[OfferingStatus] = js.undefined,
        transactionId: js.UndefOr[TransactionIdentifier] = js.undefined
    ): OfferingTransaction = {
      val __obj = js.Dictionary.empty[js.Any]
      cost.foreach(__v => __obj.update("cost", __v.asInstanceOf[js.Any]))
      createdOn.foreach(__v => __obj.update("createdOn", __v.asInstanceOf[js.Any]))
      offeringPromotionId.foreach(__v => __obj.update("offeringPromotionId", __v.asInstanceOf[js.Any]))
      offeringStatus.foreach(__v => __obj.update("offeringStatus", __v.asInstanceOf[js.Any]))
      transactionId.foreach(__v => __obj.update("transactionId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OfferingTransaction]
    }
  }

  object OfferingTransactionTypeEnum {
    val PURCHASE = "PURCHASE"
    val RENEW    = "RENEW"
    val SYSTEM   = "SYSTEM"

    val values = IndexedSeq(PURCHASE, RENEW, SYSTEM)
  }

  object OfferingTypeEnum {
    val RECURRING = "RECURRING"

    val values = IndexedSeq(RECURRING)
  }

  /**
    * Represents a specific warning or failure.
    */
  @js.native
  trait Problem extends js.Object {
    var device: js.UndefOr[Device]
    var job: js.UndefOr[ProblemDetail]
    var message: js.UndefOr[Message]
    var result: js.UndefOr[ExecutionResult]
    var run: js.UndefOr[ProblemDetail]
    var suite: js.UndefOr[ProblemDetail]
    var test: js.UndefOr[ProblemDetail]
  }

  object Problem {
    def apply(
        device: js.UndefOr[Device] = js.undefined,
        job: js.UndefOr[ProblemDetail] = js.undefined,
        message: js.UndefOr[Message] = js.undefined,
        result: js.UndefOr[ExecutionResult] = js.undefined,
        run: js.UndefOr[ProblemDetail] = js.undefined,
        suite: js.UndefOr[ProblemDetail] = js.undefined,
        test: js.UndefOr[ProblemDetail] = js.undefined
    ): Problem = {
      val __obj = js.Dictionary.empty[js.Any]
      device.foreach(__v => __obj.update("device", __v.asInstanceOf[js.Any]))
      job.foreach(__v => __obj.update("job", __v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.update("message", __v.asInstanceOf[js.Any]))
      result.foreach(__v => __obj.update("result", __v.asInstanceOf[js.Any]))
      run.foreach(__v => __obj.update("run", __v.asInstanceOf[js.Any]))
      suite.foreach(__v => __obj.update("suite", __v.asInstanceOf[js.Any]))
      test.foreach(__v => __obj.update("test", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Problem]
    }
  }

  /**
    * Information about a problem detail.
    */
  @js.native
  trait ProblemDetail extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var name: js.UndefOr[Name]
  }

  object ProblemDetail {
    def apply(
        arn: js.UndefOr[AmazonResourceName] = js.undefined,
        name: js.UndefOr[Name] = js.undefined
    ): ProblemDetail = {
      val __obj = js.Dictionary.empty[js.Any]
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProblemDetail]
    }
  }

  /**
    * Represents an operating-system neutral workspace for running and managing tests.
    */
  @js.native
  trait Project extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var created: js.UndefOr[DateTime]
    var defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes]
    var name: js.UndefOr[Name]
  }

  object Project {
    def apply(
        arn: js.UndefOr[AmazonResourceName] = js.undefined,
        created: js.UndefOr[DateTime] = js.undefined,
        defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.undefined,
        name: js.UndefOr[Name] = js.undefined
    ): Project = {
      val __obj = js.Dictionary.empty[js.Any]
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      created.foreach(__v => __obj.update("created", __v.asInstanceOf[js.Any]))
      defaultJobTimeoutMinutes.foreach(__v => __obj.update("defaultJobTimeoutMinutes", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Project]
    }
  }

  /**
    * Represents a request for a purchase offering.
    */
  @js.native
  trait PurchaseOfferingRequest extends js.Object {
    var offeringId: js.UndefOr[OfferingIdentifier]
    var offeringPromotionId: js.UndefOr[OfferingPromotionIdentifier]
    var quantity: js.UndefOr[Int]
  }

  object PurchaseOfferingRequest {
    def apply(
        offeringId: js.UndefOr[OfferingIdentifier] = js.undefined,
        offeringPromotionId: js.UndefOr[OfferingPromotionIdentifier] = js.undefined,
        quantity: js.UndefOr[Int] = js.undefined
    ): PurchaseOfferingRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      offeringId.foreach(__v => __obj.update("offeringId", __v.asInstanceOf[js.Any]))
      offeringPromotionId.foreach(__v => __obj.update("offeringPromotionId", __v.asInstanceOf[js.Any]))
      quantity.foreach(__v => __obj.update("quantity", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PurchaseOfferingRequest]
    }
  }

  /**
    * The result of the purchase offering (e.g., success or failure).
    */
  @js.native
  trait PurchaseOfferingResult extends js.Object {
    var offeringTransaction: js.UndefOr[OfferingTransaction]
  }

  object PurchaseOfferingResult {
    def apply(
        offeringTransaction: js.UndefOr[OfferingTransaction] = js.undefined
    ): PurchaseOfferingResult = {
      val __obj = js.Dictionary.empty[js.Any]
      offeringTransaction.foreach(__v => __obj.update("offeringTransaction", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PurchaseOfferingResult]
    }
  }

  /**
    * Represents the set of radios and their states on a device. Examples of radios include Wi-Fi, GPS, Bluetooth, and NFC.
    */
  @js.native
  trait Radios extends js.Object {
    var bluetooth: js.UndefOr[Boolean]
    var gps: js.UndefOr[Boolean]
    var nfc: js.UndefOr[Boolean]
    var wifi: js.UndefOr[Boolean]
  }

  object Radios {
    def apply(
        bluetooth: js.UndefOr[Boolean] = js.undefined,
        gps: js.UndefOr[Boolean] = js.undefined,
        nfc: js.UndefOr[Boolean] = js.undefined,
        wifi: js.UndefOr[Boolean] = js.undefined
    ): Radios = {
      val __obj = js.Dictionary.empty[js.Any]
      bluetooth.foreach(__v => __obj.update("bluetooth", __v.asInstanceOf[js.Any]))
      gps.foreach(__v => __obj.update("gps", __v.asInstanceOf[js.Any]))
      nfc.foreach(__v => __obj.update("nfc", __v.asInstanceOf[js.Any]))
      wifi.foreach(__v => __obj.update("wifi", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Radios]
    }
  }

  /**
    * Specifies whether charges for devices will be recurring.
    */
  @js.native
  trait RecurringCharge extends js.Object {
    var cost: js.UndefOr[MonetaryAmount]
    var frequency: js.UndefOr[RecurringChargeFrequency]
  }

  object RecurringCharge {
    def apply(
        cost: js.UndefOr[MonetaryAmount] = js.undefined,
        frequency: js.UndefOr[RecurringChargeFrequency] = js.undefined
    ): RecurringCharge = {
      val __obj = js.Dictionary.empty[js.Any]
      cost.foreach(__v => __obj.update("cost", __v.asInstanceOf[js.Any]))
      frequency.foreach(__v => __obj.update("frequency", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecurringCharge]
    }
  }

  object RecurringChargeFrequencyEnum {
    val MONTHLY = "MONTHLY"

    val values = IndexedSeq(MONTHLY)
  }

  /**
    * Represents information about the remote access session.
    */
  @js.native
  trait RemoteAccessSession extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var billingMethod: js.UndefOr[BillingMethod]
    var clientId: js.UndefOr[ClientId]
    var created: js.UndefOr[DateTime]
    var device: js.UndefOr[Device]
    var deviceMinutes: js.UndefOr[DeviceMinutes]
    var deviceUdid: js.UndefOr[String]
    var endpoint: js.UndefOr[String]
    var hostAddress: js.UndefOr[HostAddress]
    var instanceArn: js.UndefOr[AmazonResourceName]
    var interactionMode: js.UndefOr[InteractionMode]
    var message: js.UndefOr[Message]
    var name: js.UndefOr[Name]
    var remoteDebugEnabled: js.UndefOr[Boolean]
    var remoteRecordAppArn: js.UndefOr[AmazonResourceName]
    var remoteRecordEnabled: js.UndefOr[Boolean]
    var result: js.UndefOr[ExecutionResult]
    var skipAppResign: js.UndefOr[SkipAppResign]
    var started: js.UndefOr[DateTime]
    var status: js.UndefOr[ExecutionStatus]
    var stopped: js.UndefOr[DateTime]
  }

  object RemoteAccessSession {
    def apply(
        arn: js.UndefOr[AmazonResourceName] = js.undefined,
        billingMethod: js.UndefOr[BillingMethod] = js.undefined,
        clientId: js.UndefOr[ClientId] = js.undefined,
        created: js.UndefOr[DateTime] = js.undefined,
        device: js.UndefOr[Device] = js.undefined,
        deviceMinutes: js.UndefOr[DeviceMinutes] = js.undefined,
        deviceUdid: js.UndefOr[String] = js.undefined,
        endpoint: js.UndefOr[String] = js.undefined,
        hostAddress: js.UndefOr[HostAddress] = js.undefined,
        instanceArn: js.UndefOr[AmazonResourceName] = js.undefined,
        interactionMode: js.UndefOr[InteractionMode] = js.undefined,
        message: js.UndefOr[Message] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        remoteDebugEnabled: js.UndefOr[Boolean] = js.undefined,
        remoteRecordAppArn: js.UndefOr[AmazonResourceName] = js.undefined,
        remoteRecordEnabled: js.UndefOr[Boolean] = js.undefined,
        result: js.UndefOr[ExecutionResult] = js.undefined,
        skipAppResign: js.UndefOr[SkipAppResign] = js.undefined,
        started: js.UndefOr[DateTime] = js.undefined,
        status: js.UndefOr[ExecutionStatus] = js.undefined,
        stopped: js.UndefOr[DateTime] = js.undefined
    ): RemoteAccessSession = {
      val __obj = js.Dictionary.empty[js.Any]
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      billingMethod.foreach(__v => __obj.update("billingMethod", __v.asInstanceOf[js.Any]))
      clientId.foreach(__v => __obj.update("clientId", __v.asInstanceOf[js.Any]))
      created.foreach(__v => __obj.update("created", __v.asInstanceOf[js.Any]))
      device.foreach(__v => __obj.update("device", __v.asInstanceOf[js.Any]))
      deviceMinutes.foreach(__v => __obj.update("deviceMinutes", __v.asInstanceOf[js.Any]))
      deviceUdid.foreach(__v => __obj.update("deviceUdid", __v.asInstanceOf[js.Any]))
      endpoint.foreach(__v => __obj.update("endpoint", __v.asInstanceOf[js.Any]))
      hostAddress.foreach(__v => __obj.update("hostAddress", __v.asInstanceOf[js.Any]))
      instanceArn.foreach(__v => __obj.update("instanceArn", __v.asInstanceOf[js.Any]))
      interactionMode.foreach(__v => __obj.update("interactionMode", __v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.update("message", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      remoteDebugEnabled.foreach(__v => __obj.update("remoteDebugEnabled", __v.asInstanceOf[js.Any]))
      remoteRecordAppArn.foreach(__v => __obj.update("remoteRecordAppArn", __v.asInstanceOf[js.Any]))
      remoteRecordEnabled.foreach(__v => __obj.update("remoteRecordEnabled", __v.asInstanceOf[js.Any]))
      result.foreach(__v => __obj.update("result", __v.asInstanceOf[js.Any]))
      skipAppResign.foreach(__v => __obj.update("skipAppResign", __v.asInstanceOf[js.Any]))
      started.foreach(__v => __obj.update("started", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      stopped.foreach(__v => __obj.update("stopped", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoteAccessSession]
    }
  }

  /**
    * A request representing an offering renewal.
    */
  @js.native
  trait RenewOfferingRequest extends js.Object {
    var offeringId: js.UndefOr[OfferingIdentifier]
    var quantity: js.UndefOr[Int]
  }

  object RenewOfferingRequest {
    def apply(
        offeringId: js.UndefOr[OfferingIdentifier] = js.undefined,
        quantity: js.UndefOr[Int] = js.undefined
    ): RenewOfferingRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      offeringId.foreach(__v => __obj.update("offeringId", __v.asInstanceOf[js.Any]))
      quantity.foreach(__v => __obj.update("quantity", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RenewOfferingRequest]
    }
  }

  /**
    * The result of a renewal offering.
    */
  @js.native
  trait RenewOfferingResult extends js.Object {
    var offeringTransaction: js.UndefOr[OfferingTransaction]
  }

  object RenewOfferingResult {
    def apply(
        offeringTransaction: js.UndefOr[OfferingTransaction] = js.undefined
    ): RenewOfferingResult = {
      val __obj = js.Dictionary.empty[js.Any]
      offeringTransaction.foreach(__v => __obj.update("offeringTransaction", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RenewOfferingResult]
    }
  }

  /**
    * Represents the screen resolution of a device in height and width, expressed in pixels.
    */
  @js.native
  trait Resolution extends js.Object {
    var height: js.UndefOr[Int]
    var width: js.UndefOr[Int]
  }

  object Resolution {
    def apply(
        height: js.UndefOr[Int] = js.undefined,
        width: js.UndefOr[Int] = js.undefined
    ): Resolution = {
      val __obj = js.Dictionary.empty[js.Any]
      height.foreach(__v => __obj.update("height", __v.asInstanceOf[js.Any]))
      width.foreach(__v => __obj.update("width", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Resolution]
    }
  }

  /**
    * Represents a condition for a device pool.
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
        value: js.UndefOr[String] = js.undefined
    ): Rule = {
      val __obj = js.Dictionary.empty[js.Any]
      attribute.foreach(__v => __obj.update("attribute", __v.asInstanceOf[js.Any]))
      operator.foreach(__v => __obj.update("operator", __v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.update("value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Rule]
    }
  }

  object RuleOperatorEnum {
    val EQUALS                 = "EQUALS"
    val LESS_THAN              = "LESS_THAN"
    val LESS_THAN_OR_EQUALS    = "LESS_THAN_OR_EQUALS"
    val GREATER_THAN           = "GREATER_THAN"
    val GREATER_THAN_OR_EQUALS = "GREATER_THAN_OR_EQUALS"
    val IN                     = "IN"
    val NOT_IN                 = "NOT_IN"
    val CONTAINS               = "CONTAINS"

    val values =
      IndexedSeq(EQUALS, LESS_THAN, LESS_THAN_OR_EQUALS, GREATER_THAN, GREATER_THAN_OR_EQUALS, IN, NOT_IN, CONTAINS)
  }

  /**
    * Represents a test run on a set of devices with a given app package, test parameters, etc.
    */
  @js.native
  trait Run extends js.Object {
    var appUpload: js.UndefOr[AmazonResourceName]
    var arn: js.UndefOr[AmazonResourceName]
    var billingMethod: js.UndefOr[BillingMethod]
    var completedJobs: js.UndefOr[Int]
    var counters: js.UndefOr[Counters]
    var created: js.UndefOr[DateTime]
    var customerArtifactPaths: js.UndefOr[CustomerArtifactPaths]
    var deviceMinutes: js.UndefOr[DeviceMinutes]
    var devicePoolArn: js.UndefOr[AmazonResourceName]
    var deviceSelectionResult: js.UndefOr[DeviceSelectionResult]
    var eventCount: js.UndefOr[Int]
    var jobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes]
    var locale: js.UndefOr[String]
    var location: js.UndefOr[Location]
    var message: js.UndefOr[Message]
    var name: js.UndefOr[Name]
    var networkProfile: js.UndefOr[NetworkProfile]
    var parsingResultUrl: js.UndefOr[String]
    var platform: js.UndefOr[DevicePlatform]
    var radios: js.UndefOr[Radios]
    var result: js.UndefOr[ExecutionResult]
    var resultCode: js.UndefOr[ExecutionResultCode]
    var seed: js.UndefOr[Int]
    var skipAppResign: js.UndefOr[SkipAppResign]
    var started: js.UndefOr[DateTime]
    var status: js.UndefOr[ExecutionStatus]
    var stopped: js.UndefOr[DateTime]
    var testSpecArn: js.UndefOr[AmazonResourceName]
    var totalJobs: js.UndefOr[Int]
    var `type`: js.UndefOr[TestType]
    var webUrl: js.UndefOr[String]
  }

  object Run {
    def apply(
        appUpload: js.UndefOr[AmazonResourceName] = js.undefined,
        arn: js.UndefOr[AmazonResourceName] = js.undefined,
        billingMethod: js.UndefOr[BillingMethod] = js.undefined,
        completedJobs: js.UndefOr[Int] = js.undefined,
        counters: js.UndefOr[Counters] = js.undefined,
        created: js.UndefOr[DateTime] = js.undefined,
        customerArtifactPaths: js.UndefOr[CustomerArtifactPaths] = js.undefined,
        deviceMinutes: js.UndefOr[DeviceMinutes] = js.undefined,
        devicePoolArn: js.UndefOr[AmazonResourceName] = js.undefined,
        deviceSelectionResult: js.UndefOr[DeviceSelectionResult] = js.undefined,
        eventCount: js.UndefOr[Int] = js.undefined,
        jobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.undefined,
        locale: js.UndefOr[String] = js.undefined,
        location: js.UndefOr[Location] = js.undefined,
        message: js.UndefOr[Message] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        networkProfile: js.UndefOr[NetworkProfile] = js.undefined,
        parsingResultUrl: js.UndefOr[String] = js.undefined,
        platform: js.UndefOr[DevicePlatform] = js.undefined,
        radios: js.UndefOr[Radios] = js.undefined,
        result: js.UndefOr[ExecutionResult] = js.undefined,
        resultCode: js.UndefOr[ExecutionResultCode] = js.undefined,
        seed: js.UndefOr[Int] = js.undefined,
        skipAppResign: js.UndefOr[SkipAppResign] = js.undefined,
        started: js.UndefOr[DateTime] = js.undefined,
        status: js.UndefOr[ExecutionStatus] = js.undefined,
        stopped: js.UndefOr[DateTime] = js.undefined,
        testSpecArn: js.UndefOr[AmazonResourceName] = js.undefined,
        totalJobs: js.UndefOr[Int] = js.undefined,
        `type`: js.UndefOr[TestType] = js.undefined,
        webUrl: js.UndefOr[String] = js.undefined
    ): Run = {
      val __obj = js.Dictionary.empty[js.Any]
      appUpload.foreach(__v => __obj.update("appUpload", __v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      billingMethod.foreach(__v => __obj.update("billingMethod", __v.asInstanceOf[js.Any]))
      completedJobs.foreach(__v => __obj.update("completedJobs", __v.asInstanceOf[js.Any]))
      counters.foreach(__v => __obj.update("counters", __v.asInstanceOf[js.Any]))
      created.foreach(__v => __obj.update("created", __v.asInstanceOf[js.Any]))
      customerArtifactPaths.foreach(__v => __obj.update("customerArtifactPaths", __v.asInstanceOf[js.Any]))
      deviceMinutes.foreach(__v => __obj.update("deviceMinutes", __v.asInstanceOf[js.Any]))
      devicePoolArn.foreach(__v => __obj.update("devicePoolArn", __v.asInstanceOf[js.Any]))
      deviceSelectionResult.foreach(__v => __obj.update("deviceSelectionResult", __v.asInstanceOf[js.Any]))
      eventCount.foreach(__v => __obj.update("eventCount", __v.asInstanceOf[js.Any]))
      jobTimeoutMinutes.foreach(__v => __obj.update("jobTimeoutMinutes", __v.asInstanceOf[js.Any]))
      locale.foreach(__v => __obj.update("locale", __v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.update("location", __v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.update("message", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      networkProfile.foreach(__v => __obj.update("networkProfile", __v.asInstanceOf[js.Any]))
      parsingResultUrl.foreach(__v => __obj.update("parsingResultUrl", __v.asInstanceOf[js.Any]))
      platform.foreach(__v => __obj.update("platform", __v.asInstanceOf[js.Any]))
      radios.foreach(__v => __obj.update("radios", __v.asInstanceOf[js.Any]))
      result.foreach(__v => __obj.update("result", __v.asInstanceOf[js.Any]))
      resultCode.foreach(__v => __obj.update("resultCode", __v.asInstanceOf[js.Any]))
      seed.foreach(__v => __obj.update("seed", __v.asInstanceOf[js.Any]))
      skipAppResign.foreach(__v => __obj.update("skipAppResign", __v.asInstanceOf[js.Any]))
      started.foreach(__v => __obj.update("started", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      stopped.foreach(__v => __obj.update("stopped", __v.asInstanceOf[js.Any]))
      testSpecArn.foreach(__v => __obj.update("testSpecArn", __v.asInstanceOf[js.Any]))
      totalJobs.foreach(__v => __obj.update("totalJobs", __v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      webUrl.foreach(__v => __obj.update("webUrl", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Run]
    }
  }

  /**
    * Represents a sample of performance data.
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
        url: js.UndefOr[URL] = js.undefined
    ): Sample = {
      val __obj = js.Dictionary.empty[js.Any]
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      url.foreach(__v => __obj.update("url", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Sample]
    }
  }

  object SampleTypeEnum {
    val CPU                 = "CPU"
    val MEMORY              = "MEMORY"
    val THREADS             = "THREADS"
    val RX_RATE             = "RX_RATE"
    val TX_RATE             = "TX_RATE"
    val RX                  = "RX"
    val TX                  = "TX"
    val NATIVE_FRAMES       = "NATIVE_FRAMES"
    val NATIVE_FPS          = "NATIVE_FPS"
    val NATIVE_MIN_DRAWTIME = "NATIVE_MIN_DRAWTIME"
    val NATIVE_AVG_DRAWTIME = "NATIVE_AVG_DRAWTIME"
    val NATIVE_MAX_DRAWTIME = "NATIVE_MAX_DRAWTIME"
    val OPENGL_FRAMES       = "OPENGL_FRAMES"
    val OPENGL_FPS          = "OPENGL_FPS"
    val OPENGL_MIN_DRAWTIME = "OPENGL_MIN_DRAWTIME"
    val OPENGL_AVG_DRAWTIME = "OPENGL_AVG_DRAWTIME"
    val OPENGL_MAX_DRAWTIME = "OPENGL_MAX_DRAWTIME"

    val values = IndexedSeq(
      CPU,
      MEMORY,
      THREADS,
      RX_RATE,
      TX_RATE,
      RX,
      TX,
      NATIVE_FRAMES,
      NATIVE_FPS,
      NATIVE_MIN_DRAWTIME,
      NATIVE_AVG_DRAWTIME,
      NATIVE_MAX_DRAWTIME,
      OPENGL_FRAMES,
      OPENGL_FPS,
      OPENGL_MIN_DRAWTIME,
      OPENGL_AVG_DRAWTIME,
      OPENGL_MAX_DRAWTIME
    )
  }

  /**
    * Represents the settings for a run. Includes things like location, radio states, auxiliary apps, and network profiles.
    */
  @js.native
  trait ScheduleRunConfiguration extends js.Object {
    var auxiliaryApps: js.UndefOr[AmazonResourceNames]
    var billingMethod: js.UndefOr[BillingMethod]
    var customerArtifactPaths: js.UndefOr[CustomerArtifactPaths]
    var extraDataPackageArn: js.UndefOr[AmazonResourceName]
    var locale: js.UndefOr[String]
    var location: js.UndefOr[Location]
    var networkProfileArn: js.UndefOr[AmazonResourceName]
    var radios: js.UndefOr[Radios]
    var vpceConfigurationArns: js.UndefOr[AmazonResourceNames]
  }

  object ScheduleRunConfiguration {
    def apply(
        auxiliaryApps: js.UndefOr[AmazonResourceNames] = js.undefined,
        billingMethod: js.UndefOr[BillingMethod] = js.undefined,
        customerArtifactPaths: js.UndefOr[CustomerArtifactPaths] = js.undefined,
        extraDataPackageArn: js.UndefOr[AmazonResourceName] = js.undefined,
        locale: js.UndefOr[String] = js.undefined,
        location: js.UndefOr[Location] = js.undefined,
        networkProfileArn: js.UndefOr[AmazonResourceName] = js.undefined,
        radios: js.UndefOr[Radios] = js.undefined,
        vpceConfigurationArns: js.UndefOr[AmazonResourceNames] = js.undefined
    ): ScheduleRunConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      auxiliaryApps.foreach(__v => __obj.update("auxiliaryApps", __v.asInstanceOf[js.Any]))
      billingMethod.foreach(__v => __obj.update("billingMethod", __v.asInstanceOf[js.Any]))
      customerArtifactPaths.foreach(__v => __obj.update("customerArtifactPaths", __v.asInstanceOf[js.Any]))
      extraDataPackageArn.foreach(__v => __obj.update("extraDataPackageArn", __v.asInstanceOf[js.Any]))
      locale.foreach(__v => __obj.update("locale", __v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.update("location", __v.asInstanceOf[js.Any]))
      networkProfileArn.foreach(__v => __obj.update("networkProfileArn", __v.asInstanceOf[js.Any]))
      radios.foreach(__v => __obj.update("radios", __v.asInstanceOf[js.Any]))
      vpceConfigurationArns.foreach(__v => __obj.update("vpceConfigurationArns", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScheduleRunConfiguration]
    }
  }

  /**
    * Represents a request to the schedule run operation.
    */
  @js.native
  trait ScheduleRunRequest extends js.Object {
    var projectArn: AmazonResourceName
    var test: ScheduleRunTest
    var appArn: js.UndefOr[AmazonResourceName]
    var configuration: js.UndefOr[ScheduleRunConfiguration]
    var devicePoolArn: js.UndefOr[AmazonResourceName]
    var deviceSelectionConfiguration: js.UndefOr[DeviceSelectionConfiguration]
    var executionConfiguration: js.UndefOr[ExecutionConfiguration]
    var name: js.UndefOr[Name]
  }

  object ScheduleRunRequest {
    def apply(
        projectArn: AmazonResourceName,
        test: ScheduleRunTest,
        appArn: js.UndefOr[AmazonResourceName] = js.undefined,
        configuration: js.UndefOr[ScheduleRunConfiguration] = js.undefined,
        devicePoolArn: js.UndefOr[AmazonResourceName] = js.undefined,
        deviceSelectionConfiguration: js.UndefOr[DeviceSelectionConfiguration] = js.undefined,
        executionConfiguration: js.UndefOr[ExecutionConfiguration] = js.undefined,
        name: js.UndefOr[Name] = js.undefined
    ): ScheduleRunRequest = {
      val __obj = js.Dictionary[js.Any](
        "projectArn" -> projectArn.asInstanceOf[js.Any],
        "test"       -> test.asInstanceOf[js.Any]
      )

      appArn.foreach(__v => __obj.update("appArn", __v.asInstanceOf[js.Any]))
      configuration.foreach(__v => __obj.update("configuration", __v.asInstanceOf[js.Any]))
      devicePoolArn.foreach(__v => __obj.update("devicePoolArn", __v.asInstanceOf[js.Any]))
      deviceSelectionConfiguration.foreach(
        __v => __obj.update("deviceSelectionConfiguration", __v.asInstanceOf[js.Any])
      )
      executionConfiguration.foreach(__v => __obj.update("executionConfiguration", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScheduleRunRequest]
    }
  }

  /**
    * Represents the result of a schedule run request.
    */
  @js.native
  trait ScheduleRunResult extends js.Object {
    var run: js.UndefOr[Run]
  }

  object ScheduleRunResult {
    def apply(
        run: js.UndefOr[Run] = js.undefined
    ): ScheduleRunResult = {
      val __obj = js.Dictionary.empty[js.Any]
      run.foreach(__v => __obj.update("run", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScheduleRunResult]
    }
  }

  /**
    * Represents test settings. This data structure is passed in as the "test" parameter to ScheduleRun. For an example of the JSON request syntax, see <a>ScheduleRun</a>.
    */
  @js.native
  trait ScheduleRunTest extends js.Object {
    var `type`: TestType
    var filter: js.UndefOr[Filter]
    var parameters: js.UndefOr[TestParameters]
    var testPackageArn: js.UndefOr[AmazonResourceName]
    var testSpecArn: js.UndefOr[AmazonResourceName]
  }

  object ScheduleRunTest {
    def apply(
        `type`: TestType,
        filter: js.UndefOr[Filter] = js.undefined,
        parameters: js.UndefOr[TestParameters] = js.undefined,
        testPackageArn: js.UndefOr[AmazonResourceName] = js.undefined,
        testSpecArn: js.UndefOr[AmazonResourceName] = js.undefined
    ): ScheduleRunTest = {
      val __obj = js.Dictionary[js.Any](
        "type" -> `type`.asInstanceOf[js.Any]
      )

      filter.foreach(__v => __obj.update("filter", __v.asInstanceOf[js.Any]))
      parameters.foreach(__v => __obj.update("parameters", __v.asInstanceOf[js.Any]))
      testPackageArn.foreach(__v => __obj.update("testPackageArn", __v.asInstanceOf[js.Any]))
      testSpecArn.foreach(__v => __obj.update("testSpecArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScheduleRunTest]
    }
  }

  @js.native
  trait StopJobRequest extends js.Object {
    var arn: AmazonResourceName
  }

  object StopJobRequest {
    def apply(
        arn: AmazonResourceName
    ): StopJobRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopJobRequest]
    }
  }

  @js.native
  trait StopJobResult extends js.Object {
    var job: js.UndefOr[Job]
  }

  object StopJobResult {
    def apply(
        job: js.UndefOr[Job] = js.undefined
    ): StopJobResult = {
      val __obj = js.Dictionary.empty[js.Any]
      job.foreach(__v => __obj.update("job", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopJobResult]
    }
  }

  /**
    * Represents the request to stop the remote access session.
    */
  @js.native
  trait StopRemoteAccessSessionRequest extends js.Object {
    var arn: AmazonResourceName
  }

  object StopRemoteAccessSessionRequest {
    def apply(
        arn: AmazonResourceName
    ): StopRemoteAccessSessionRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopRemoteAccessSessionRequest]
    }
  }

  /**
    * Represents the response from the server that describes the remote access session when AWS Device Farm stops the session.
    */
  @js.native
  trait StopRemoteAccessSessionResult extends js.Object {
    var remoteAccessSession: js.UndefOr[RemoteAccessSession]
  }

  object StopRemoteAccessSessionResult {
    def apply(
        remoteAccessSession: js.UndefOr[RemoteAccessSession] = js.undefined
    ): StopRemoteAccessSessionResult = {
      val __obj = js.Dictionary.empty[js.Any]
      remoteAccessSession.foreach(__v => __obj.update("remoteAccessSession", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopRemoteAccessSessionResult]
    }
  }

  /**
    * Represents the request to stop a specific run.
    */
  @js.native
  trait StopRunRequest extends js.Object {
    var arn: AmazonResourceName
  }

  object StopRunRequest {
    def apply(
        arn: AmazonResourceName
    ): StopRunRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopRunRequest]
    }
  }

  /**
    * Represents the results of your stop run attempt.
    */
  @js.native
  trait StopRunResult extends js.Object {
    var run: js.UndefOr[Run]
  }

  object StopRunResult {
    def apply(
        run: js.UndefOr[Run] = js.undefined
    ): StopRunResult = {
      val __obj = js.Dictionary.empty[js.Any]
      run.foreach(__v => __obj.update("run", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopRunResult]
    }
  }

  /**
    * Represents a collection of one or more tests.
    */
  @js.native
  trait Suite extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var counters: js.UndefOr[Counters]
    var created: js.UndefOr[DateTime]
    var deviceMinutes: js.UndefOr[DeviceMinutes]
    var message: js.UndefOr[Message]
    var name: js.UndefOr[Name]
    var result: js.UndefOr[ExecutionResult]
    var started: js.UndefOr[DateTime]
    var status: js.UndefOr[ExecutionStatus]
    var stopped: js.UndefOr[DateTime]
    var `type`: js.UndefOr[TestType]
  }

  object Suite {
    def apply(
        arn: js.UndefOr[AmazonResourceName] = js.undefined,
        counters: js.UndefOr[Counters] = js.undefined,
        created: js.UndefOr[DateTime] = js.undefined,
        deviceMinutes: js.UndefOr[DeviceMinutes] = js.undefined,
        message: js.UndefOr[Message] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        result: js.UndefOr[ExecutionResult] = js.undefined,
        started: js.UndefOr[DateTime] = js.undefined,
        status: js.UndefOr[ExecutionStatus] = js.undefined,
        stopped: js.UndefOr[DateTime] = js.undefined,
        `type`: js.UndefOr[TestType] = js.undefined
    ): Suite = {
      val __obj = js.Dictionary.empty[js.Any]
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      counters.foreach(__v => __obj.update("counters", __v.asInstanceOf[js.Any]))
      created.foreach(__v => __obj.update("created", __v.asInstanceOf[js.Any]))
      deviceMinutes.foreach(__v => __obj.update("deviceMinutes", __v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.update("message", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      result.foreach(__v => __obj.update("result", __v.asInstanceOf[js.Any]))
      started.foreach(__v => __obj.update("started", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      stopped.foreach(__v => __obj.update("stopped", __v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Suite]
    }
  }

  /**
    * The metadata that you apply to a resource to help you categorize and organize it. Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dictionary[js.Any](
        "Key"   -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
    var Tags: TagList
  }

  object TagResourceRequest {
    def apply(
        ResourceARN: AmazonResourceName,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "Tags"        -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    def apply(
        ): TagResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /**
    * Represents a condition that is evaluated.
    */
  @js.native
  trait Test extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var counters: js.UndefOr[Counters]
    var created: js.UndefOr[DateTime]
    var deviceMinutes: js.UndefOr[DeviceMinutes]
    var message: js.UndefOr[Message]
    var name: js.UndefOr[Name]
    var result: js.UndefOr[ExecutionResult]
    var started: js.UndefOr[DateTime]
    var status: js.UndefOr[ExecutionStatus]
    var stopped: js.UndefOr[DateTime]
    var `type`: js.UndefOr[TestType]
  }

  object Test {
    def apply(
        arn: js.UndefOr[AmazonResourceName] = js.undefined,
        counters: js.UndefOr[Counters] = js.undefined,
        created: js.UndefOr[DateTime] = js.undefined,
        deviceMinutes: js.UndefOr[DeviceMinutes] = js.undefined,
        message: js.UndefOr[Message] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        result: js.UndefOr[ExecutionResult] = js.undefined,
        started: js.UndefOr[DateTime] = js.undefined,
        status: js.UndefOr[ExecutionStatus] = js.undefined,
        stopped: js.UndefOr[DateTime] = js.undefined,
        `type`: js.UndefOr[TestType] = js.undefined
    ): Test = {
      val __obj = js.Dictionary.empty[js.Any]
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      counters.foreach(__v => __obj.update("counters", __v.asInstanceOf[js.Any]))
      created.foreach(__v => __obj.update("created", __v.asInstanceOf[js.Any]))
      deviceMinutes.foreach(__v => __obj.update("deviceMinutes", __v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.update("message", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      result.foreach(__v => __obj.update("result", __v.asInstanceOf[js.Any]))
      started.foreach(__v => __obj.update("started", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      stopped.foreach(__v => __obj.update("stopped", __v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Test]
    }
  }

  object TestTypeEnum {
    val BUILTIN_FUZZ            = "BUILTIN_FUZZ"
    val BUILTIN_EXPLORER        = "BUILTIN_EXPLORER"
    val WEB_PERFORMANCE_PROFILE = "WEB_PERFORMANCE_PROFILE"
    val APPIUM_JAVA_JUNIT       = "APPIUM_JAVA_JUNIT"
    val APPIUM_JAVA_TESTNG      = "APPIUM_JAVA_TESTNG"
    val APPIUM_PYTHON           = "APPIUM_PYTHON"
    val APPIUM_NODE             = "APPIUM_NODE"
    val APPIUM_RUBY             = "APPIUM_RUBY"
    val APPIUM_WEB_JAVA_JUNIT   = "APPIUM_WEB_JAVA_JUNIT"
    val APPIUM_WEB_JAVA_TESTNG  = "APPIUM_WEB_JAVA_TESTNG"
    val APPIUM_WEB_PYTHON       = "APPIUM_WEB_PYTHON"
    val APPIUM_WEB_NODE         = "APPIUM_WEB_NODE"
    val APPIUM_WEB_RUBY         = "APPIUM_WEB_RUBY"
    val CALABASH                = "CALABASH"
    val INSTRUMENTATION         = "INSTRUMENTATION"
    val UIAUTOMATION            = "UIAUTOMATION"
    val UIAUTOMATOR             = "UIAUTOMATOR"
    val XCTEST                  = "XCTEST"
    val XCTEST_UI               = "XCTEST_UI"
    val REMOTE_ACCESS_RECORD    = "REMOTE_ACCESS_RECORD"
    val REMOTE_ACCESS_REPLAY    = "REMOTE_ACCESS_REPLAY"

    val values = IndexedSeq(
      BUILTIN_FUZZ,
      BUILTIN_EXPLORER,
      WEB_PERFORMANCE_PROFILE,
      APPIUM_JAVA_JUNIT,
      APPIUM_JAVA_TESTNG,
      APPIUM_PYTHON,
      APPIUM_NODE,
      APPIUM_RUBY,
      APPIUM_WEB_JAVA_JUNIT,
      APPIUM_WEB_JAVA_TESTNG,
      APPIUM_WEB_PYTHON,
      APPIUM_WEB_NODE,
      APPIUM_WEB_RUBY,
      CALABASH,
      INSTRUMENTATION,
      UIAUTOMATION,
      UIAUTOMATOR,
      XCTEST,
      XCTEST_UI,
      REMOTE_ACCESS_RECORD,
      REMOTE_ACCESS_REPLAY
    )
  }

  /**
    * Represents information about free trial device minutes for an AWS account.
    */
  @js.native
  trait TrialMinutes extends js.Object {
    var remaining: js.UndefOr[Double]
    var total: js.UndefOr[Double]
  }

  object TrialMinutes {
    def apply(
        remaining: js.UndefOr[Double] = js.undefined,
        total: js.UndefOr[Double] = js.undefined
    ): TrialMinutes = {
      val __obj = js.Dictionary.empty[js.Any]
      remaining.foreach(__v => __obj.update("remaining", __v.asInstanceOf[js.Any]))
      total.foreach(__v => __obj.update("total", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrialMinutes]
    }
  }

  /**
    * A collection of one or more problems, grouped by their result.
    */
  @js.native
  trait UniqueProblem extends js.Object {
    var message: js.UndefOr[Message]
    var problems: js.UndefOr[Problems]
  }

  object UniqueProblem {
    def apply(
        message: js.UndefOr[Message] = js.undefined,
        problems: js.UndefOr[Problems] = js.undefined
    ): UniqueProblem = {
      val __obj = js.Dictionary.empty[js.Any]
      message.foreach(__v => __obj.update("message", __v.asInstanceOf[js.Any]))
      problems.foreach(__v => __obj.update("problems", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UniqueProblem]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    def apply(
        ResourceARN: AmazonResourceName,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    def apply(
        ): UntagResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateDeviceInstanceRequest extends js.Object {
    var arn: AmazonResourceName
    var labels: js.UndefOr[InstanceLabels]
    var profileArn: js.UndefOr[AmazonResourceName]
  }

  object UpdateDeviceInstanceRequest {
    def apply(
        arn: AmazonResourceName,
        labels: js.UndefOr[InstanceLabels] = js.undefined,
        profileArn: js.UndefOr[AmazonResourceName] = js.undefined
    ): UpdateDeviceInstanceRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      labels.foreach(__v => __obj.update("labels", __v.asInstanceOf[js.Any]))
      profileArn.foreach(__v => __obj.update("profileArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDeviceInstanceRequest]
    }
  }

  @js.native
  trait UpdateDeviceInstanceResult extends js.Object {
    var deviceInstance: js.UndefOr[DeviceInstance]
  }

  object UpdateDeviceInstanceResult {
    def apply(
        deviceInstance: js.UndefOr[DeviceInstance] = js.undefined
    ): UpdateDeviceInstanceResult = {
      val __obj = js.Dictionary.empty[js.Any]
      deviceInstance.foreach(__v => __obj.update("deviceInstance", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDeviceInstanceResult]
    }
  }

  /**
    * Represents a request to the update device pool operation.
    */
  @js.native
  trait UpdateDevicePoolRequest extends js.Object {
    var arn: AmazonResourceName
    var clearMaxDevices: js.UndefOr[Boolean]
    var description: js.UndefOr[Message]
    var maxDevices: js.UndefOr[Int]
    var name: js.UndefOr[Name]
    var rules: js.UndefOr[Rules]
  }

  object UpdateDevicePoolRequest {
    def apply(
        arn: AmazonResourceName,
        clearMaxDevices: js.UndefOr[Boolean] = js.undefined,
        description: js.UndefOr[Message] = js.undefined,
        maxDevices: js.UndefOr[Int] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        rules: js.UndefOr[Rules] = js.undefined
    ): UpdateDevicePoolRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      clearMaxDevices.foreach(__v => __obj.update("clearMaxDevices", __v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      maxDevices.foreach(__v => __obj.update("maxDevices", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      rules.foreach(__v => __obj.update("rules", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDevicePoolRequest]
    }
  }

  /**
    * Represents the result of an update device pool request.
    */
  @js.native
  trait UpdateDevicePoolResult extends js.Object {
    var devicePool: js.UndefOr[DevicePool]
  }

  object UpdateDevicePoolResult {
    def apply(
        devicePool: js.UndefOr[DevicePool] = js.undefined
    ): UpdateDevicePoolResult = {
      val __obj = js.Dictionary.empty[js.Any]
      devicePool.foreach(__v => __obj.update("devicePool", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDevicePoolResult]
    }
  }

  @js.native
  trait UpdateInstanceProfileRequest extends js.Object {
    var arn: AmazonResourceName
    var description: js.UndefOr[Message]
    var excludeAppPackagesFromCleanup: js.UndefOr[PackageIds]
    var name: js.UndefOr[Name]
    var packageCleanup: js.UndefOr[Boolean]
    var rebootAfterUse: js.UndefOr[Boolean]
  }

  object UpdateInstanceProfileRequest {
    def apply(
        arn: AmazonResourceName,
        description: js.UndefOr[Message] = js.undefined,
        excludeAppPackagesFromCleanup: js.UndefOr[PackageIds] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        packageCleanup: js.UndefOr[Boolean] = js.undefined,
        rebootAfterUse: js.UndefOr[Boolean] = js.undefined
    ): UpdateInstanceProfileRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      excludeAppPackagesFromCleanup.foreach(
        __v => __obj.update("excludeAppPackagesFromCleanup", __v.asInstanceOf[js.Any])
      )
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      packageCleanup.foreach(__v => __obj.update("packageCleanup", __v.asInstanceOf[js.Any]))
      rebootAfterUse.foreach(__v => __obj.update("rebootAfterUse", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateInstanceProfileRequest]
    }
  }

  @js.native
  trait UpdateInstanceProfileResult extends js.Object {
    var instanceProfile: js.UndefOr[InstanceProfile]
  }

  object UpdateInstanceProfileResult {
    def apply(
        instanceProfile: js.UndefOr[InstanceProfile] = js.undefined
    ): UpdateInstanceProfileResult = {
      val __obj = js.Dictionary.empty[js.Any]
      instanceProfile.foreach(__v => __obj.update("instanceProfile", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateInstanceProfileResult]
    }
  }

  @js.native
  trait UpdateNetworkProfileRequest extends js.Object {
    var arn: AmazonResourceName
    var description: js.UndefOr[Message]
    var downlinkBandwidthBits: js.UndefOr[Double]
    var downlinkDelayMs: js.UndefOr[Double]
    var downlinkJitterMs: js.UndefOr[Double]
    var downlinkLossPercent: js.UndefOr[PercentInteger]
    var name: js.UndefOr[Name]
    var `type`: js.UndefOr[NetworkProfileType]
    var uplinkBandwidthBits: js.UndefOr[Double]
    var uplinkDelayMs: js.UndefOr[Double]
    var uplinkJitterMs: js.UndefOr[Double]
    var uplinkLossPercent: js.UndefOr[PercentInteger]
  }

  object UpdateNetworkProfileRequest {
    def apply(
        arn: AmazonResourceName,
        description: js.UndefOr[Message] = js.undefined,
        downlinkBandwidthBits: js.UndefOr[Double] = js.undefined,
        downlinkDelayMs: js.UndefOr[Double] = js.undefined,
        downlinkJitterMs: js.UndefOr[Double] = js.undefined,
        downlinkLossPercent: js.UndefOr[PercentInteger] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        `type`: js.UndefOr[NetworkProfileType] = js.undefined,
        uplinkBandwidthBits: js.UndefOr[Double] = js.undefined,
        uplinkDelayMs: js.UndefOr[Double] = js.undefined,
        uplinkJitterMs: js.UndefOr[Double] = js.undefined,
        uplinkLossPercent: js.UndefOr[PercentInteger] = js.undefined
    ): UpdateNetworkProfileRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      downlinkBandwidthBits.foreach(__v => __obj.update("downlinkBandwidthBits", __v.asInstanceOf[js.Any]))
      downlinkDelayMs.foreach(__v => __obj.update("downlinkDelayMs", __v.asInstanceOf[js.Any]))
      downlinkJitterMs.foreach(__v => __obj.update("downlinkJitterMs", __v.asInstanceOf[js.Any]))
      downlinkLossPercent.foreach(__v => __obj.update("downlinkLossPercent", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      uplinkBandwidthBits.foreach(__v => __obj.update("uplinkBandwidthBits", __v.asInstanceOf[js.Any]))
      uplinkDelayMs.foreach(__v => __obj.update("uplinkDelayMs", __v.asInstanceOf[js.Any]))
      uplinkJitterMs.foreach(__v => __obj.update("uplinkJitterMs", __v.asInstanceOf[js.Any]))
      uplinkLossPercent.foreach(__v => __obj.update("uplinkLossPercent", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateNetworkProfileRequest]
    }
  }

  @js.native
  trait UpdateNetworkProfileResult extends js.Object {
    var networkProfile: js.UndefOr[NetworkProfile]
  }

  object UpdateNetworkProfileResult {
    def apply(
        networkProfile: js.UndefOr[NetworkProfile] = js.undefined
    ): UpdateNetworkProfileResult = {
      val __obj = js.Dictionary.empty[js.Any]
      networkProfile.foreach(__v => __obj.update("networkProfile", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateNetworkProfileResult]
    }
  }

  /**
    * Represents a request to the update project operation.
    */
  @js.native
  trait UpdateProjectRequest extends js.Object {
    var arn: AmazonResourceName
    var defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes]
    var name: js.UndefOr[Name]
  }

  object UpdateProjectRequest {
    def apply(
        arn: AmazonResourceName,
        defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.undefined,
        name: js.UndefOr[Name] = js.undefined
    ): UpdateProjectRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      defaultJobTimeoutMinutes.foreach(__v => __obj.update("defaultJobTimeoutMinutes", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProjectRequest]
    }
  }

  /**
    * Represents the result of an update project request.
    */
  @js.native
  trait UpdateProjectResult extends js.Object {
    var project: js.UndefOr[Project]
  }

  object UpdateProjectResult {
    def apply(
        project: js.UndefOr[Project] = js.undefined
    ): UpdateProjectResult = {
      val __obj = js.Dictionary.empty[js.Any]
      project.foreach(__v => __obj.update("project", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProjectResult]
    }
  }

  @js.native
  trait UpdateUploadRequest extends js.Object {
    var arn: AmazonResourceName
    var contentType: js.UndefOr[ContentType]
    var editContent: js.UndefOr[Boolean]
    var name: js.UndefOr[Name]
  }

  object UpdateUploadRequest {
    def apply(
        arn: AmazonResourceName,
        contentType: js.UndefOr[ContentType] = js.undefined,
        editContent: js.UndefOr[Boolean] = js.undefined,
        name: js.UndefOr[Name] = js.undefined
    ): UpdateUploadRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      contentType.foreach(__v => __obj.update("contentType", __v.asInstanceOf[js.Any]))
      editContent.foreach(__v => __obj.update("editContent", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUploadRequest]
    }
  }

  @js.native
  trait UpdateUploadResult extends js.Object {
    var upload: js.UndefOr[Upload]
  }

  object UpdateUploadResult {
    def apply(
        upload: js.UndefOr[Upload] = js.undefined
    ): UpdateUploadResult = {
      val __obj = js.Dictionary.empty[js.Any]
      upload.foreach(__v => __obj.update("upload", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUploadResult]
    }
  }

  @js.native
  trait UpdateVPCEConfigurationRequest extends js.Object {
    var arn: AmazonResourceName
    var serviceDnsName: js.UndefOr[ServiceDnsName]
    var vpceConfigurationDescription: js.UndefOr[VPCEConfigurationDescription]
    var vpceConfigurationName: js.UndefOr[VPCEConfigurationName]
    var vpceServiceName: js.UndefOr[VPCEServiceName]
  }

  object UpdateVPCEConfigurationRequest {
    def apply(
        arn: AmazonResourceName,
        serviceDnsName: js.UndefOr[ServiceDnsName] = js.undefined,
        vpceConfigurationDescription: js.UndefOr[VPCEConfigurationDescription] = js.undefined,
        vpceConfigurationName: js.UndefOr[VPCEConfigurationName] = js.undefined,
        vpceServiceName: js.UndefOr[VPCEServiceName] = js.undefined
    ): UpdateVPCEConfigurationRequest = {
      val __obj = js.Dictionary[js.Any](
        "arn" -> arn.asInstanceOf[js.Any]
      )

      serviceDnsName.foreach(__v => __obj.update("serviceDnsName", __v.asInstanceOf[js.Any]))
      vpceConfigurationDescription.foreach(
        __v => __obj.update("vpceConfigurationDescription", __v.asInstanceOf[js.Any])
      )
      vpceConfigurationName.foreach(__v => __obj.update("vpceConfigurationName", __v.asInstanceOf[js.Any]))
      vpceServiceName.foreach(__v => __obj.update("vpceServiceName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVPCEConfigurationRequest]
    }
  }

  @js.native
  trait UpdateVPCEConfigurationResult extends js.Object {
    var vpceConfiguration: js.UndefOr[VPCEConfiguration]
  }

  object UpdateVPCEConfigurationResult {
    def apply(
        vpceConfiguration: js.UndefOr[VPCEConfiguration] = js.undefined
    ): UpdateVPCEConfigurationResult = {
      val __obj = js.Dictionary.empty[js.Any]
      vpceConfiguration.foreach(__v => __obj.update("vpceConfiguration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVPCEConfigurationResult]
    }
  }

  /**
    * An app or a set of one or more tests to upload or that have been uploaded.
    */
  @js.native
  trait Upload extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var category: js.UndefOr[UploadCategory]
    var contentType: js.UndefOr[ContentType]
    var created: js.UndefOr[DateTime]
    var message: js.UndefOr[Message]
    var metadata: js.UndefOr[Metadata]
    var name: js.UndefOr[Name]
    var status: js.UndefOr[UploadStatus]
    var `type`: js.UndefOr[UploadType]
    var url: js.UndefOr[URL]
  }

  object Upload {
    def apply(
        arn: js.UndefOr[AmazonResourceName] = js.undefined,
        category: js.UndefOr[UploadCategory] = js.undefined,
        contentType: js.UndefOr[ContentType] = js.undefined,
        created: js.UndefOr[DateTime] = js.undefined,
        message: js.UndefOr[Message] = js.undefined,
        metadata: js.UndefOr[Metadata] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        status: js.UndefOr[UploadStatus] = js.undefined,
        `type`: js.UndefOr[UploadType] = js.undefined,
        url: js.UndefOr[URL] = js.undefined
    ): Upload = {
      val __obj = js.Dictionary.empty[js.Any]
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      category.foreach(__v => __obj.update("category", __v.asInstanceOf[js.Any]))
      contentType.foreach(__v => __obj.update("contentType", __v.asInstanceOf[js.Any]))
      created.foreach(__v => __obj.update("created", __v.asInstanceOf[js.Any]))
      message.foreach(__v => __obj.update("message", __v.asInstanceOf[js.Any]))
      metadata.foreach(__v => __obj.update("metadata", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      url.foreach(__v => __obj.update("url", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Upload]
    }
  }

  object UploadCategoryEnum {
    val CURATED = "CURATED"
    val PRIVATE = "PRIVATE"

    val values = IndexedSeq(CURATED, PRIVATE)
  }

  object UploadStatusEnum {
    val INITIALIZED = "INITIALIZED"
    val PROCESSING  = "PROCESSING"
    val SUCCEEDED   = "SUCCEEDED"
    val FAILED      = "FAILED"

    val values = IndexedSeq(INITIALIZED, PROCESSING, SUCCEEDED, FAILED)
  }

  object UploadTypeEnum {
    val ANDROID_APP                         = "ANDROID_APP"
    val IOS_APP                             = "IOS_APP"
    val WEB_APP                             = "WEB_APP"
    val EXTERNAL_DATA                       = "EXTERNAL_DATA"
    val APPIUM_JAVA_JUNIT_TEST_PACKAGE      = "APPIUM_JAVA_JUNIT_TEST_PACKAGE"
    val APPIUM_JAVA_TESTNG_TEST_PACKAGE     = "APPIUM_JAVA_TESTNG_TEST_PACKAGE"
    val APPIUM_PYTHON_TEST_PACKAGE          = "APPIUM_PYTHON_TEST_PACKAGE"
    val APPIUM_NODE_TEST_PACKAGE            = "APPIUM_NODE_TEST_PACKAGE"
    val APPIUM_RUBY_TEST_PACKAGE            = "APPIUM_RUBY_TEST_PACKAGE"
    val APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE  = "APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE"
    val APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE = "APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE"
    val APPIUM_WEB_PYTHON_TEST_PACKAGE      = "APPIUM_WEB_PYTHON_TEST_PACKAGE"
    val APPIUM_WEB_NODE_TEST_PACKAGE        = "APPIUM_WEB_NODE_TEST_PACKAGE"
    val APPIUM_WEB_RUBY_TEST_PACKAGE        = "APPIUM_WEB_RUBY_TEST_PACKAGE"
    val CALABASH_TEST_PACKAGE               = "CALABASH_TEST_PACKAGE"
    val INSTRUMENTATION_TEST_PACKAGE        = "INSTRUMENTATION_TEST_PACKAGE"
    val UIAUTOMATION_TEST_PACKAGE           = "UIAUTOMATION_TEST_PACKAGE"
    val UIAUTOMATOR_TEST_PACKAGE            = "UIAUTOMATOR_TEST_PACKAGE"
    val XCTEST_TEST_PACKAGE                 = "XCTEST_TEST_PACKAGE"
    val XCTEST_UI_TEST_PACKAGE              = "XCTEST_UI_TEST_PACKAGE"
    val APPIUM_JAVA_JUNIT_TEST_SPEC         = "APPIUM_JAVA_JUNIT_TEST_SPEC"
    val APPIUM_JAVA_TESTNG_TEST_SPEC        = "APPIUM_JAVA_TESTNG_TEST_SPEC"
    val APPIUM_PYTHON_TEST_SPEC             = "APPIUM_PYTHON_TEST_SPEC"
    val APPIUM_NODE_TEST_SPEC               = "APPIUM_NODE_TEST_SPEC"
    val APPIUM_RUBY_TEST_SPEC               = "APPIUM_RUBY_TEST_SPEC"
    val APPIUM_WEB_JAVA_JUNIT_TEST_SPEC     = "APPIUM_WEB_JAVA_JUNIT_TEST_SPEC"
    val APPIUM_WEB_JAVA_TESTNG_TEST_SPEC    = "APPIUM_WEB_JAVA_TESTNG_TEST_SPEC"
    val APPIUM_WEB_PYTHON_TEST_SPEC         = "APPIUM_WEB_PYTHON_TEST_SPEC"
    val APPIUM_WEB_NODE_TEST_SPEC           = "APPIUM_WEB_NODE_TEST_SPEC"
    val APPIUM_WEB_RUBY_TEST_SPEC           = "APPIUM_WEB_RUBY_TEST_SPEC"
    val INSTRUMENTATION_TEST_SPEC           = "INSTRUMENTATION_TEST_SPEC"
    val XCTEST_UI_TEST_SPEC                 = "XCTEST_UI_TEST_SPEC"

    val values = IndexedSeq(
      ANDROID_APP,
      IOS_APP,
      WEB_APP,
      EXTERNAL_DATA,
      APPIUM_JAVA_JUNIT_TEST_PACKAGE,
      APPIUM_JAVA_TESTNG_TEST_PACKAGE,
      APPIUM_PYTHON_TEST_PACKAGE,
      APPIUM_NODE_TEST_PACKAGE,
      APPIUM_RUBY_TEST_PACKAGE,
      APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE,
      APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE,
      APPIUM_WEB_PYTHON_TEST_PACKAGE,
      APPIUM_WEB_NODE_TEST_PACKAGE,
      APPIUM_WEB_RUBY_TEST_PACKAGE,
      CALABASH_TEST_PACKAGE,
      INSTRUMENTATION_TEST_PACKAGE,
      UIAUTOMATION_TEST_PACKAGE,
      UIAUTOMATOR_TEST_PACKAGE,
      XCTEST_TEST_PACKAGE,
      XCTEST_UI_TEST_PACKAGE,
      APPIUM_JAVA_JUNIT_TEST_SPEC,
      APPIUM_JAVA_TESTNG_TEST_SPEC,
      APPIUM_PYTHON_TEST_SPEC,
      APPIUM_NODE_TEST_SPEC,
      APPIUM_RUBY_TEST_SPEC,
      APPIUM_WEB_JAVA_JUNIT_TEST_SPEC,
      APPIUM_WEB_JAVA_TESTNG_TEST_SPEC,
      APPIUM_WEB_PYTHON_TEST_SPEC,
      APPIUM_WEB_NODE_TEST_SPEC,
      APPIUM_WEB_RUBY_TEST_SPEC,
      INSTRUMENTATION_TEST_SPEC,
      XCTEST_UI_TEST_SPEC
    )
  }

  /**
    * Represents an Amazon Virtual Private Cloud (VPC) endpoint configuration.
    */
  @js.native
  trait VPCEConfiguration extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var serviceDnsName: js.UndefOr[ServiceDnsName]
    var vpceConfigurationDescription: js.UndefOr[VPCEConfigurationDescription]
    var vpceConfigurationName: js.UndefOr[VPCEConfigurationName]
    var vpceServiceName: js.UndefOr[VPCEServiceName]
  }

  object VPCEConfiguration {
    def apply(
        arn: js.UndefOr[AmazonResourceName] = js.undefined,
        serviceDnsName: js.UndefOr[ServiceDnsName] = js.undefined,
        vpceConfigurationDescription: js.UndefOr[VPCEConfigurationDescription] = js.undefined,
        vpceConfigurationName: js.UndefOr[VPCEConfigurationName] = js.undefined,
        vpceServiceName: js.UndefOr[VPCEServiceName] = js.undefined
    ): VPCEConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      serviceDnsName.foreach(__v => __obj.update("serviceDnsName", __v.asInstanceOf[js.Any]))
      vpceConfigurationDescription.foreach(
        __v => __obj.update("vpceConfigurationDescription", __v.asInstanceOf[js.Any])
      )
      vpceConfigurationName.foreach(__v => __obj.update("vpceConfigurationName", __v.asInstanceOf[js.Any]))
      vpceServiceName.foreach(__v => __obj.update("vpceServiceName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VPCEConfiguration]
    }
  }
}
