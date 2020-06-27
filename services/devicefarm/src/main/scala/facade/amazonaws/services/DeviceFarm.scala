package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object devicefarm {
  type AWSAccountNumber                   = String
  type AccountsCleanup                    = Boolean
  type AmazonResourceName                 = String
  type AmazonResourceNames                = js.Array[AmazonResourceName]
  type AndroidPaths                       = js.Array[String]
  type AppPackagesCleanup                 = Boolean
  type Artifacts                          = js.Array[Artifact]
  type ClientId                           = String
  type ContentType                        = String
  type DateTime                           = js.Date
  type DeviceFarmArn                      = String
  type DeviceFilterValues                 = js.Array[String]
  type DeviceFilters                      = js.Array[DeviceFilter]
  type DeviceHostPaths                    = js.Array[String]
  type DeviceInstances                    = js.Array[DeviceInstance]
  type DevicePoolCompatibilityResults     = js.Array[DevicePoolCompatibilityResult]
  type DevicePools                        = js.Array[DevicePool]
  type Devices                            = js.Array[Device]
  type Filter                             = String
  type HostAddress                        = String
  type IncompatibilityMessages            = js.Array[IncompatibilityMessage]
  type InstanceLabels                     = js.Array[String]
  type InstanceProfiles                   = js.Array[InstanceProfile]
  type IosPaths                           = js.Array[String]
  type JobTimeoutMinutes                  = Int
  type Jobs                               = js.Array[Job]
  type MaxPageSize                        = Int
  type MaxSlotMap                         = js.Dictionary[Int]
  type Message                            = String
  type Metadata                           = String
  type Name                               = String
  type NetworkProfiles                    = js.Array[NetworkProfile]
  type OfferingIdentifier                 = String
  type OfferingPromotionIdentifier        = String
  type OfferingPromotions                 = js.Array[OfferingPromotion]
  type OfferingStatusMap                  = js.Dictionary[OfferingStatus]
  type OfferingTransactions               = js.Array[OfferingTransaction]
  type Offerings                          = js.Array[Offering]
  type PackageIds                         = js.Array[String]
  type PaginationToken                    = String
  type PercentInteger                     = Int
  type Problems                           = js.Array[Problem]
  type Projects                           = js.Array[Project]
  type PurchasedDevicesMap                = js.Dictionary[Int]
  type RecurringCharges                   = js.Array[RecurringCharge]
  type RemoteAccessSessions               = js.Array[RemoteAccessSession]
  type ResourceDescription                = String
  type ResourceId                         = String
  type ResourceName                       = String
  type Rules                              = js.Array[Rule]
  type Runs                               = js.Array[Run]
  type Samples                            = js.Array[Sample]
  type ServiceDnsName                     = String
  type SkipAppResign                      = Boolean
  type SshPublicKey                       = String
  type Suites                             = js.Array[Suite]
  type TagKey                             = String
  type TagKeyList                         = js.Array[TagKey]
  type TagList                            = js.Array[Tag]
  type TagValue                           = String
  type TestGridProjects                   = js.Array[TestGridProject]
  type TestGridSessionActions             = js.Array[TestGridSessionAction]
  type TestGridSessionArtifacts           = js.Array[TestGridSessionArtifact]
  type TestGridSessions                   = js.Array[TestGridSession]
  type TestGridUrlExpiresInSecondsInput   = Int
  type TestParameters                     = js.Dictionary[String]
  type Tests                              = js.Array[Test]
  type TransactionIdentifier              = String
  type URL                                = String
  type UniqueProblems                     = js.Array[UniqueProblem]
  type UniqueProblemsByExecutionResultMap = js.Dictionary[UniqueProblems]
  type Uploads                            = js.Array[Upload]
  type VPCEConfigurationDescription       = String
  type VPCEConfigurationName              = String
  type VPCEConfigurations                 = js.Array[VPCEConfiguration]
  type VPCEServiceName                    = String
  type VideoCapture                       = Boolean

  implicit final class DeviceFarmOps(private val service: DeviceFarm) extends AnyVal {

    @inline def createDevicePoolFuture(params: CreateDevicePoolRequest): Future[CreateDevicePoolResult] =
      service.createDevicePool(params).promise().toFuture
    @inline def createInstanceProfileFuture(params: CreateInstanceProfileRequest): Future[CreateInstanceProfileResult] =
      service.createInstanceProfile(params).promise().toFuture
    @inline def createNetworkProfileFuture(params: CreateNetworkProfileRequest): Future[CreateNetworkProfileResult] =
      service.createNetworkProfile(params).promise().toFuture
    @inline def createProjectFuture(params: CreateProjectRequest): Future[CreateProjectResult] =
      service.createProject(params).promise().toFuture
    @inline def createRemoteAccessSessionFuture(
        params: CreateRemoteAccessSessionRequest
    ): Future[CreateRemoteAccessSessionResult] = service.createRemoteAccessSession(params).promise().toFuture
    @inline def createTestGridProjectFuture(params: CreateTestGridProjectRequest): Future[CreateTestGridProjectResult] =
      service.createTestGridProject(params).promise().toFuture
    @inline def createTestGridUrlFuture(params: CreateTestGridUrlRequest): Future[CreateTestGridUrlResult] =
      service.createTestGridUrl(params).promise().toFuture
    @inline def createUploadFuture(params: CreateUploadRequest): Future[CreateUploadResult] =
      service.createUpload(params).promise().toFuture
    @inline def createVPCEConfigurationFuture(
        params: CreateVPCEConfigurationRequest
    ): Future[CreateVPCEConfigurationResult] = service.createVPCEConfiguration(params).promise().toFuture
    @inline def deleteDevicePoolFuture(params: DeleteDevicePoolRequest): Future[DeleteDevicePoolResult] =
      service.deleteDevicePool(params).promise().toFuture
    @inline def deleteInstanceProfileFuture(params: DeleteInstanceProfileRequest): Future[DeleteInstanceProfileResult] =
      service.deleteInstanceProfile(params).promise().toFuture
    @inline def deleteNetworkProfileFuture(params: DeleteNetworkProfileRequest): Future[DeleteNetworkProfileResult] =
      service.deleteNetworkProfile(params).promise().toFuture
    @inline def deleteProjectFuture(params: DeleteProjectRequest): Future[DeleteProjectResult] =
      service.deleteProject(params).promise().toFuture
    @inline def deleteRemoteAccessSessionFuture(
        params: DeleteRemoteAccessSessionRequest
    ): Future[DeleteRemoteAccessSessionResult] = service.deleteRemoteAccessSession(params).promise().toFuture
    @inline def deleteRunFuture(params: DeleteRunRequest): Future[DeleteRunResult] =
      service.deleteRun(params).promise().toFuture
    @inline def deleteTestGridProjectFuture(params: DeleteTestGridProjectRequest): Future[DeleteTestGridProjectResult] =
      service.deleteTestGridProject(params).promise().toFuture
    @inline def deleteUploadFuture(params: DeleteUploadRequest): Future[DeleteUploadResult] =
      service.deleteUpload(params).promise().toFuture
    @inline def deleteVPCEConfigurationFuture(
        params: DeleteVPCEConfigurationRequest
    ): Future[DeleteVPCEConfigurationResult] = service.deleteVPCEConfiguration(params).promise().toFuture
    @inline def getAccountSettingsFuture(params: GetAccountSettingsRequest): Future[GetAccountSettingsResult] =
      service.getAccountSettings(params).promise().toFuture
    @inline def getDeviceFuture(params: GetDeviceRequest): Future[GetDeviceResult] =
      service.getDevice(params).promise().toFuture
    @inline def getDeviceInstanceFuture(params: GetDeviceInstanceRequest): Future[GetDeviceInstanceResult] =
      service.getDeviceInstance(params).promise().toFuture
    @inline def getDevicePoolCompatibilityFuture(
        params: GetDevicePoolCompatibilityRequest
    ): Future[GetDevicePoolCompatibilityResult] = service.getDevicePoolCompatibility(params).promise().toFuture
    @inline def getDevicePoolFuture(params: GetDevicePoolRequest): Future[GetDevicePoolResult] =
      service.getDevicePool(params).promise().toFuture
    @inline def getInstanceProfileFuture(params: GetInstanceProfileRequest): Future[GetInstanceProfileResult] =
      service.getInstanceProfile(params).promise().toFuture
    @inline def getJobFuture(params: GetJobRequest): Future[GetJobResult] = service.getJob(params).promise().toFuture
    @inline def getNetworkProfileFuture(params: GetNetworkProfileRequest): Future[GetNetworkProfileResult] =
      service.getNetworkProfile(params).promise().toFuture
    @inline def getOfferingStatusFuture(params: GetOfferingStatusRequest): Future[GetOfferingStatusResult] =
      service.getOfferingStatus(params).promise().toFuture
    @inline def getProjectFuture(params: GetProjectRequest): Future[GetProjectResult] =
      service.getProject(params).promise().toFuture
    @inline def getRemoteAccessSessionFuture(
        params: GetRemoteAccessSessionRequest
    ): Future[GetRemoteAccessSessionResult]                               = service.getRemoteAccessSession(params).promise().toFuture
    @inline def getRunFuture(params: GetRunRequest): Future[GetRunResult] = service.getRun(params).promise().toFuture
    @inline def getSuiteFuture(params: GetSuiteRequest): Future[GetSuiteResult] =
      service.getSuite(params).promise().toFuture
    @inline def getTestFuture(params: GetTestRequest): Future[GetTestResult] =
      service.getTest(params).promise().toFuture
    @inline def getTestGridProjectFuture(params: GetTestGridProjectRequest): Future[GetTestGridProjectResult] =
      service.getTestGridProject(params).promise().toFuture
    @inline def getTestGridSessionFuture(params: GetTestGridSessionRequest): Future[GetTestGridSessionResult] =
      service.getTestGridSession(params).promise().toFuture
    @inline def getUploadFuture(params: GetUploadRequest): Future[GetUploadResult] =
      service.getUpload(params).promise().toFuture
    @inline def getVPCEConfigurationFuture(params: GetVPCEConfigurationRequest): Future[GetVPCEConfigurationResult] =
      service.getVPCEConfiguration(params).promise().toFuture
    @inline def installToRemoteAccessSessionFuture(
        params: InstallToRemoteAccessSessionRequest
    ): Future[InstallToRemoteAccessSessionResult] = service.installToRemoteAccessSession(params).promise().toFuture
    @inline def listArtifactsFuture(params: ListArtifactsRequest): Future[ListArtifactsResult] =
      service.listArtifacts(params).promise().toFuture
    @inline def listDeviceInstancesFuture(params: ListDeviceInstancesRequest): Future[ListDeviceInstancesResult] =
      service.listDeviceInstances(params).promise().toFuture
    @inline def listDevicePoolsFuture(params: ListDevicePoolsRequest): Future[ListDevicePoolsResult] =
      service.listDevicePools(params).promise().toFuture
    @inline def listDevicesFuture(params: ListDevicesRequest): Future[ListDevicesResult] =
      service.listDevices(params).promise().toFuture
    @inline def listInstanceProfilesFuture(params: ListInstanceProfilesRequest): Future[ListInstanceProfilesResult] =
      service.listInstanceProfiles(params).promise().toFuture
    @inline def listJobsFuture(params: ListJobsRequest): Future[ListJobsResult] =
      service.listJobs(params).promise().toFuture
    @inline def listNetworkProfilesFuture(params: ListNetworkProfilesRequest): Future[ListNetworkProfilesResult] =
      service.listNetworkProfiles(params).promise().toFuture
    @inline def listOfferingPromotionsFuture(
        params: ListOfferingPromotionsRequest
    ): Future[ListOfferingPromotionsResult] = service.listOfferingPromotions(params).promise().toFuture
    @inline def listOfferingTransactionsFuture(
        params: ListOfferingTransactionsRequest
    ): Future[ListOfferingTransactionsResult] = service.listOfferingTransactions(params).promise().toFuture
    @inline def listOfferingsFuture(params: ListOfferingsRequest): Future[ListOfferingsResult] =
      service.listOfferings(params).promise().toFuture
    @inline def listProjectsFuture(params: ListProjectsRequest): Future[ListProjectsResult] =
      service.listProjects(params).promise().toFuture
    @inline def listRemoteAccessSessionsFuture(
        params: ListRemoteAccessSessionsRequest
    ): Future[ListRemoteAccessSessionsResult] = service.listRemoteAccessSessions(params).promise().toFuture
    @inline def listRunsFuture(params: ListRunsRequest): Future[ListRunsResult] =
      service.listRuns(params).promise().toFuture
    @inline def listSamplesFuture(params: ListSamplesRequest): Future[ListSamplesResult] =
      service.listSamples(params).promise().toFuture
    @inline def listSuitesFuture(params: ListSuitesRequest): Future[ListSuitesResult] =
      service.listSuites(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def listTestGridProjectsFuture(params: ListTestGridProjectsRequest): Future[ListTestGridProjectsResult] =
      service.listTestGridProjects(params).promise().toFuture
    @inline def listTestGridSessionActionsFuture(
        params: ListTestGridSessionActionsRequest
    ): Future[ListTestGridSessionActionsResult] = service.listTestGridSessionActions(params).promise().toFuture
    @inline def listTestGridSessionArtifactsFuture(
        params: ListTestGridSessionArtifactsRequest
    ): Future[ListTestGridSessionArtifactsResult] = service.listTestGridSessionArtifacts(params).promise().toFuture
    @inline def listTestGridSessionsFuture(params: ListTestGridSessionsRequest): Future[ListTestGridSessionsResult] =
      service.listTestGridSessions(params).promise().toFuture
    @inline def listTestsFuture(params: ListTestsRequest): Future[ListTestsResult] =
      service.listTests(params).promise().toFuture
    @inline def listUniqueProblemsFuture(params: ListUniqueProblemsRequest): Future[ListUniqueProblemsResult] =
      service.listUniqueProblems(params).promise().toFuture
    @inline def listUploadsFuture(params: ListUploadsRequest): Future[ListUploadsResult] =
      service.listUploads(params).promise().toFuture
    @inline def listVPCEConfigurationsFuture(
        params: ListVPCEConfigurationsRequest
    ): Future[ListVPCEConfigurationsResult] = service.listVPCEConfigurations(params).promise().toFuture
    @inline def purchaseOfferingFuture(params: PurchaseOfferingRequest): Future[PurchaseOfferingResult] =
      service.purchaseOffering(params).promise().toFuture
    @inline def renewOfferingFuture(params: RenewOfferingRequest): Future[RenewOfferingResult] =
      service.renewOffering(params).promise().toFuture
    @inline def scheduleRunFuture(params: ScheduleRunRequest): Future[ScheduleRunResult] =
      service.scheduleRun(params).promise().toFuture
    @inline def stopJobFuture(params: StopJobRequest): Future[StopJobResult] =
      service.stopJob(params).promise().toFuture
    @inline def stopRemoteAccessSessionFuture(
        params: StopRemoteAccessSessionRequest
    ): Future[StopRemoteAccessSessionResult] = service.stopRemoteAccessSession(params).promise().toFuture
    @inline def stopRunFuture(params: StopRunRequest): Future[StopRunResult] =
      service.stopRun(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateDeviceInstanceFuture(params: UpdateDeviceInstanceRequest): Future[UpdateDeviceInstanceResult] =
      service.updateDeviceInstance(params).promise().toFuture
    @inline def updateDevicePoolFuture(params: UpdateDevicePoolRequest): Future[UpdateDevicePoolResult] =
      service.updateDevicePool(params).promise().toFuture
    @inline def updateInstanceProfileFuture(params: UpdateInstanceProfileRequest): Future[UpdateInstanceProfileResult] =
      service.updateInstanceProfile(params).promise().toFuture
    @inline def updateNetworkProfileFuture(params: UpdateNetworkProfileRequest): Future[UpdateNetworkProfileResult] =
      service.updateNetworkProfile(params).promise().toFuture
    @inline def updateProjectFuture(params: UpdateProjectRequest): Future[UpdateProjectResult] =
      service.updateProject(params).promise().toFuture
    @inline def updateTestGridProjectFuture(params: UpdateTestGridProjectRequest): Future[UpdateTestGridProjectResult] =
      service.updateTestGridProject(params).promise().toFuture
    @inline def updateUploadFuture(params: UpdateUploadRequest): Future[UpdateUploadResult] =
      service.updateUpload(params).promise().toFuture
    @inline def updateVPCEConfigurationFuture(
        params: UpdateVPCEConfigurationRequest
    ): Future[UpdateVPCEConfigurationResult] = service.updateVPCEConfiguration(params).promise().toFuture
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
    def createTestGridProject(params: CreateTestGridProjectRequest): Request[CreateTestGridProjectResult] = js.native
    def createTestGridUrl(params: CreateTestGridUrlRequest): Request[CreateTestGridUrlResult]             = js.native
    def createUpload(params: CreateUploadRequest): Request[CreateUploadResult]                            = js.native
    def createVPCEConfiguration(params: CreateVPCEConfigurationRequest): Request[CreateVPCEConfigurationResult] =
      js.native
    def deleteDevicePool(params: DeleteDevicePoolRequest): Request[DeleteDevicePoolResult]                = js.native
    def deleteInstanceProfile(params: DeleteInstanceProfileRequest): Request[DeleteInstanceProfileResult] = js.native
    def deleteNetworkProfile(params: DeleteNetworkProfileRequest): Request[DeleteNetworkProfileResult]    = js.native
    def deleteProject(params: DeleteProjectRequest): Request[DeleteProjectResult]                         = js.native
    def deleteRemoteAccessSession(params: DeleteRemoteAccessSessionRequest): Request[DeleteRemoteAccessSessionResult] =
      js.native
    def deleteRun(params: DeleteRunRequest): Request[DeleteRunResult]                                     = js.native
    def deleteTestGridProject(params: DeleteTestGridProjectRequest): Request[DeleteTestGridProjectResult] = js.native
    def deleteUpload(params: DeleteUploadRequest): Request[DeleteUploadResult]                            = js.native
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
    def getTestGridProject(params: GetTestGridProjectRequest): Request[GetTestGridProjectResult]             = js.native
    def getTestGridSession(params: GetTestGridSessionRequest): Request[GetTestGridSessionResult]             = js.native
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
    def listRuns(params: ListRunsRequest): Request[ListRunsResult]                                     = js.native
    def listSamples(params: ListSamplesRequest): Request[ListSamplesResult]                            = js.native
    def listSuites(params: ListSuitesRequest): Request[ListSuitesResult]                               = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]  = js.native
    def listTestGridProjects(params: ListTestGridProjectsRequest): Request[ListTestGridProjectsResult] = js.native
    def listTestGridSessionActions(
        params: ListTestGridSessionActionsRequest
    ): Request[ListTestGridSessionActionsResult] = js.native
    def listTestGridSessionArtifacts(
        params: ListTestGridSessionArtifactsRequest
    ): Request[ListTestGridSessionArtifactsResult]                                                           = js.native
    def listTestGridSessions(params: ListTestGridSessionsRequest): Request[ListTestGridSessionsResult]       = js.native
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
    def updateTestGridProject(params: UpdateTestGridProjectRequest): Request[UpdateTestGridProjectResult] = js.native
    def updateUpload(params: UpdateUploadRequest): Request[UpdateUploadResult]                            = js.native
    def updateVPCEConfiguration(params: UpdateVPCEConfigurationRequest): Request[UpdateVPCEConfigurationResult] =
      js.native
  }

  /**
    * A container for account-level settings in AWS Device Farm.
    */
  @js.native
  @Factory
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

  /**
    * Represents the output of a test. Examples of artifacts include logs and screenshots.
    */
  @js.native
  @Factory
  trait Artifact extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var extension: js.UndefOr[String]
    var name: js.UndefOr[Name]
    var `type`: js.UndefOr[ArtifactType]
    var url: js.UndefOr[URL]
  }

  @js.native
  sealed trait ArtifactCategory extends js.Any
  object ArtifactCategory extends js.Object {
    val SCREENSHOT = "SCREENSHOT".asInstanceOf[ArtifactCategory]
    val FILE       = "FILE".asInstanceOf[ArtifactCategory]
    val LOG        = "LOG".asInstanceOf[ArtifactCategory]

    val values = js.Object.freeze(js.Array(SCREENSHOT, FILE, LOG))
  }

  @js.native
  sealed trait ArtifactType extends js.Any
  object ArtifactType extends js.Object {
    val UNKNOWN                  = "UNKNOWN".asInstanceOf[ArtifactType]
    val SCREENSHOT               = "SCREENSHOT".asInstanceOf[ArtifactType]
    val DEVICE_LOG               = "DEVICE_LOG".asInstanceOf[ArtifactType]
    val MESSAGE_LOG              = "MESSAGE_LOG".asInstanceOf[ArtifactType]
    val VIDEO_LOG                = "VIDEO_LOG".asInstanceOf[ArtifactType]
    val RESULT_LOG               = "RESULT_LOG".asInstanceOf[ArtifactType]
    val SERVICE_LOG              = "SERVICE_LOG".asInstanceOf[ArtifactType]
    val WEBKIT_LOG               = "WEBKIT_LOG".asInstanceOf[ArtifactType]
    val INSTRUMENTATION_OUTPUT   = "INSTRUMENTATION_OUTPUT".asInstanceOf[ArtifactType]
    val EXERCISER_MONKEY_OUTPUT  = "EXERCISER_MONKEY_OUTPUT".asInstanceOf[ArtifactType]
    val CALABASH_JSON_OUTPUT     = "CALABASH_JSON_OUTPUT".asInstanceOf[ArtifactType]
    val CALABASH_PRETTY_OUTPUT   = "CALABASH_PRETTY_OUTPUT".asInstanceOf[ArtifactType]
    val CALABASH_STANDARD_OUTPUT = "CALABASH_STANDARD_OUTPUT".asInstanceOf[ArtifactType]
    val CALABASH_JAVA_XML_OUTPUT = "CALABASH_JAVA_XML_OUTPUT".asInstanceOf[ArtifactType]
    val AUTOMATION_OUTPUT        = "AUTOMATION_OUTPUT".asInstanceOf[ArtifactType]
    val APPIUM_SERVER_OUTPUT     = "APPIUM_SERVER_OUTPUT".asInstanceOf[ArtifactType]
    val APPIUM_JAVA_OUTPUT       = "APPIUM_JAVA_OUTPUT".asInstanceOf[ArtifactType]
    val APPIUM_JAVA_XML_OUTPUT   = "APPIUM_JAVA_XML_OUTPUT".asInstanceOf[ArtifactType]
    val APPIUM_PYTHON_OUTPUT     = "APPIUM_PYTHON_OUTPUT".asInstanceOf[ArtifactType]
    val APPIUM_PYTHON_XML_OUTPUT = "APPIUM_PYTHON_XML_OUTPUT".asInstanceOf[ArtifactType]
    val EXPLORER_EVENT_LOG       = "EXPLORER_EVENT_LOG".asInstanceOf[ArtifactType]
    val EXPLORER_SUMMARY_LOG     = "EXPLORER_SUMMARY_LOG".asInstanceOf[ArtifactType]
    val APPLICATION_CRASH_REPORT = "APPLICATION_CRASH_REPORT".asInstanceOf[ArtifactType]
    val XCTEST_LOG               = "XCTEST_LOG".asInstanceOf[ArtifactType]
    val VIDEO                    = "VIDEO".asInstanceOf[ArtifactType]
    val CUSTOMER_ARTIFACT        = "CUSTOMER_ARTIFACT".asInstanceOf[ArtifactType]
    val CUSTOMER_ARTIFACT_LOG    = "CUSTOMER_ARTIFACT_LOG".asInstanceOf[ArtifactType]
    val TESTSPEC_OUTPUT          = "TESTSPEC_OUTPUT".asInstanceOf[ArtifactType]

    val values = js.Object.freeze(
      js.Array(
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
    )
  }

  @js.native
  sealed trait BillingMethod extends js.Any
  object BillingMethod extends js.Object {
    val METERED   = "METERED".asInstanceOf[BillingMethod]
    val UNMETERED = "UNMETERED".asInstanceOf[BillingMethod]

    val values = js.Object.freeze(js.Array(METERED, UNMETERED))
  }

  /**
    * Represents the amount of CPU that an app is using on a physical device. Does not represent system-wide CPU usage.
    */
  @js.native
  @Factory
  trait CPU extends js.Object {
    var architecture: js.UndefOr[String]
    var clock: js.UndefOr[Double]
    var frequency: js.UndefOr[String]
  }

  /**
    * Represents entity counters.
    */
  @js.native
  @Factory
  trait Counters extends js.Object {
    var errored: js.UndefOr[Int]
    var failed: js.UndefOr[Int]
    var passed: js.UndefOr[Int]
    var skipped: js.UndefOr[Int]
    var stopped: js.UndefOr[Int]
    var total: js.UndefOr[Int]
    var warned: js.UndefOr[Int]
  }

  /**
    * Represents a request to the create device pool operation.
    */
  @js.native
  @Factory
  trait CreateDevicePoolRequest extends js.Object {
    var name: Name
    var projectArn: AmazonResourceName
    var rules: Rules
    var description: js.UndefOr[Message]
    var maxDevices: js.UndefOr[Int]
  }

  /**
    * Represents the result of a create device pool request.
    */
  @js.native
  @Factory
  trait CreateDevicePoolResult extends js.Object {
    var devicePool: js.UndefOr[DevicePool]
  }

  @js.native
  @Factory
  trait CreateInstanceProfileRequest extends js.Object {
    var name: Name
    var description: js.UndefOr[Message]
    var excludeAppPackagesFromCleanup: js.UndefOr[PackageIds]
    var packageCleanup: js.UndefOr[Boolean]
    var rebootAfterUse: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait CreateInstanceProfileResult extends js.Object {
    var instanceProfile: js.UndefOr[InstanceProfile]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreateNetworkProfileResult extends js.Object {
    var networkProfile: js.UndefOr[NetworkProfile]
  }

  /**
    * Represents a request to the create project operation.
    */
  @js.native
  @Factory
  trait CreateProjectRequest extends js.Object {
    var name: Name
    var defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes]
  }

  /**
    * Represents the result of a create project request.
    */
  @js.native
  @Factory
  trait CreateProjectResult extends js.Object {
    var project: js.UndefOr[Project]
  }

  /**
    * Configuration settings for a remote access session, including billing method.
    */
  @js.native
  @Factory
  trait CreateRemoteAccessSessionConfiguration extends js.Object {
    var billingMethod: js.UndefOr[BillingMethod]
    var vpceConfigurationArns: js.UndefOr[AmazonResourceNames]
  }

  /**
    * Creates and submits a request to start a remote access session.
    */
  @js.native
  @Factory
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

  /**
    * Represents the server response from a request to create a remote access session.
    */
  @js.native
  @Factory
  trait CreateRemoteAccessSessionResult extends js.Object {
    var remoteAccessSession: js.UndefOr[RemoteAccessSession]
  }

  @js.native
  @Factory
  trait CreateTestGridProjectRequest extends js.Object {
    var name: ResourceName
    var description: js.UndefOr[ResourceDescription]
  }

  @js.native
  @Factory
  trait CreateTestGridProjectResult extends js.Object {
    var testGridProject: js.UndefOr[TestGridProject]
  }

  @js.native
  @Factory
  trait CreateTestGridUrlRequest extends js.Object {
    var expiresInSeconds: TestGridUrlExpiresInSecondsInput
    var projectArn: DeviceFarmArn
  }

  @js.native
  @Factory
  trait CreateTestGridUrlResult extends js.Object {
    var expires: js.UndefOr[DateTime]
    var url: js.UndefOr[String]
  }

  /**
    * Represents a request to the create upload operation.
    */
  @js.native
  @Factory
  trait CreateUploadRequest extends js.Object {
    var name: Name
    var projectArn: AmazonResourceName
    var `type`: UploadType
    var contentType: js.UndefOr[ContentType]
  }

  /**
    * Represents the result of a create upload request.
    */
  @js.native
  @Factory
  trait CreateUploadResult extends js.Object {
    var upload: js.UndefOr[Upload]
  }

  @js.native
  @Factory
  trait CreateVPCEConfigurationRequest extends js.Object {
    var serviceDnsName: ServiceDnsName
    var vpceConfigurationName: VPCEConfigurationName
    var vpceServiceName: VPCEServiceName
    var vpceConfigurationDescription: js.UndefOr[VPCEConfigurationDescription]
  }

  @js.native
  @Factory
  trait CreateVPCEConfigurationResult extends js.Object {
    var vpceConfiguration: js.UndefOr[VPCEConfiguration]
  }

  @js.native
  sealed trait CurrencyCode extends js.Any
  object CurrencyCode extends js.Object {
    val USD = "USD".asInstanceOf[CurrencyCode]

    val values = js.Object.freeze(js.Array(USD))
  }

  /**
    * A JSON object that specifies the paths where the artifacts generated by the customer's tests, on the device or in the test environment, are pulled from.
    *  Specify <code>deviceHostPaths</code> and optionally specify either <code>iosPaths</code> or <code>androidPaths</code>.
    *  For web app tests, you can specify both <code>iosPaths</code> and <code>androidPaths</code>.
    */
  @js.native
  @Factory
  trait CustomerArtifactPaths extends js.Object {
    var androidPaths: js.UndefOr[AndroidPaths]
    var deviceHostPaths: js.UndefOr[DeviceHostPaths]
    var iosPaths: js.UndefOr[IosPaths]
  }

  /**
    * Represents a request to the delete device pool operation.
    */
  @js.native
  @Factory
  trait DeleteDevicePoolRequest extends js.Object {
    var arn: AmazonResourceName
  }

  /**
    * Represents the result of a delete device pool request.
    */
  @js.native
  @Factory
  trait DeleteDevicePoolResult extends js.Object {}

  @js.native
  @Factory
  trait DeleteInstanceProfileRequest extends js.Object {
    var arn: AmazonResourceName
  }

  @js.native
  @Factory
  trait DeleteInstanceProfileResult extends js.Object {}

  @js.native
  @Factory
  trait DeleteNetworkProfileRequest extends js.Object {
    var arn: AmazonResourceName
  }

  @js.native
  @Factory
  trait DeleteNetworkProfileResult extends js.Object {}

  /**
    * Represents a request to the delete project operation.
    */
  @js.native
  @Factory
  trait DeleteProjectRequest extends js.Object {
    var arn: AmazonResourceName
  }

  /**
    * Represents the result of a delete project request.
    */
  @js.native
  @Factory
  trait DeleteProjectResult extends js.Object {}

  /**
    * Represents the request to delete the specified remote access session.
    */
  @js.native
  @Factory
  trait DeleteRemoteAccessSessionRequest extends js.Object {
    var arn: AmazonResourceName
  }

  /**
    * The response from the server when a request is made to delete the remote access session.
    */
  @js.native
  @Factory
  trait DeleteRemoteAccessSessionResult extends js.Object {}

  /**
    * Represents a request to the delete run operation.
    */
  @js.native
  @Factory
  trait DeleteRunRequest extends js.Object {
    var arn: AmazonResourceName
  }

  /**
    * Represents the result of a delete run request.
    */
  @js.native
  @Factory
  trait DeleteRunResult extends js.Object {}

  @js.native
  @Factory
  trait DeleteTestGridProjectRequest extends js.Object {
    var projectArn: DeviceFarmArn
  }

  @js.native
  @Factory
  trait DeleteTestGridProjectResult extends js.Object {}

  /**
    * Represents a request to the delete upload operation.
    */
  @js.native
  @Factory
  trait DeleteUploadRequest extends js.Object {
    var arn: AmazonResourceName
  }

  /**
    * Represents the result of a delete upload request.
    */
  @js.native
  @Factory
  trait DeleteUploadResult extends js.Object {}

  @js.native
  @Factory
  trait DeleteVPCEConfigurationRequest extends js.Object {
    var arn: AmazonResourceName
  }

  @js.native
  @Factory
  trait DeleteVPCEConfigurationResult extends js.Object {}

  /**
    * Represents a device type that an app is tested against.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait DeviceAttribute extends js.Any
  object DeviceAttribute extends js.Object {
    val ARN                   = "ARN".asInstanceOf[DeviceAttribute]
    val PLATFORM              = "PLATFORM".asInstanceOf[DeviceAttribute]
    val FORM_FACTOR           = "FORM_FACTOR".asInstanceOf[DeviceAttribute]
    val MANUFACTURER          = "MANUFACTURER".asInstanceOf[DeviceAttribute]
    val REMOTE_ACCESS_ENABLED = "REMOTE_ACCESS_ENABLED".asInstanceOf[DeviceAttribute]
    val REMOTE_DEBUG_ENABLED  = "REMOTE_DEBUG_ENABLED".asInstanceOf[DeviceAttribute]
    val APPIUM_VERSION        = "APPIUM_VERSION".asInstanceOf[DeviceAttribute]
    val INSTANCE_ARN          = "INSTANCE_ARN".asInstanceOf[DeviceAttribute]
    val INSTANCE_LABELS       = "INSTANCE_LABELS".asInstanceOf[DeviceAttribute]
    val FLEET_TYPE            = "FLEET_TYPE".asInstanceOf[DeviceAttribute]
    val OS_VERSION            = "OS_VERSION".asInstanceOf[DeviceAttribute]
    val MODEL                 = "MODEL".asInstanceOf[DeviceAttribute]
    val AVAILABILITY          = "AVAILABILITY".asInstanceOf[DeviceAttribute]

    val values = js.Object.freeze(
      js.Array(
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
    )
  }

  @js.native
  sealed trait DeviceAvailability extends js.Any
  object DeviceAvailability extends js.Object {
    val TEMPORARY_NOT_AVAILABLE = "TEMPORARY_NOT_AVAILABLE".asInstanceOf[DeviceAvailability]
    val BUSY                    = "BUSY".asInstanceOf[DeviceAvailability]
    val AVAILABLE               = "AVAILABLE".asInstanceOf[DeviceAvailability]
    val HIGHLY_AVAILABLE        = "HIGHLY_AVAILABLE".asInstanceOf[DeviceAvailability]

    val values = js.Object.freeze(js.Array(TEMPORARY_NOT_AVAILABLE, BUSY, AVAILABLE, HIGHLY_AVAILABLE))
  }

  /**
    * Represents a device filter used to select a set of devices to be included in a test run. This data structure is passed in as the <code>deviceSelectionConfiguration</code> parameter to <code>ScheduleRun</code>. For an example of the JSON request syntax, see <a>ScheduleRun</a>.
    *  It is also passed in as the <code>filters</code> parameter to <code>ListDevices</code>. For an example of the JSON request syntax, see <a>ListDevices</a>.
    */
  @js.native
  @Factory
  trait DeviceFilter extends js.Object {
    var attribute: js.UndefOr[DeviceFilterAttribute]
    var operator: js.UndefOr[RuleOperator]
    var values: js.UndefOr[DeviceFilterValues]
  }

  @js.native
  sealed trait DeviceFilterAttribute extends js.Any
  object DeviceFilterAttribute extends js.Object {
    val ARN                   = "ARN".asInstanceOf[DeviceFilterAttribute]
    val PLATFORM              = "PLATFORM".asInstanceOf[DeviceFilterAttribute]
    val OS_VERSION            = "OS_VERSION".asInstanceOf[DeviceFilterAttribute]
    val MODEL                 = "MODEL".asInstanceOf[DeviceFilterAttribute]
    val AVAILABILITY          = "AVAILABILITY".asInstanceOf[DeviceFilterAttribute]
    val FORM_FACTOR           = "FORM_FACTOR".asInstanceOf[DeviceFilterAttribute]
    val MANUFACTURER          = "MANUFACTURER".asInstanceOf[DeviceFilterAttribute]
    val REMOTE_ACCESS_ENABLED = "REMOTE_ACCESS_ENABLED".asInstanceOf[DeviceFilterAttribute]
    val REMOTE_DEBUG_ENABLED  = "REMOTE_DEBUG_ENABLED".asInstanceOf[DeviceFilterAttribute]
    val INSTANCE_ARN          = "INSTANCE_ARN".asInstanceOf[DeviceFilterAttribute]
    val INSTANCE_LABELS       = "INSTANCE_LABELS".asInstanceOf[DeviceFilterAttribute]
    val FLEET_TYPE            = "FLEET_TYPE".asInstanceOf[DeviceFilterAttribute]

    val values = js.Object.freeze(
      js.Array(
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
    )
  }

  @js.native
  sealed trait DeviceFormFactor extends js.Any
  object DeviceFormFactor extends js.Object {
    val PHONE  = "PHONE".asInstanceOf[DeviceFormFactor]
    val TABLET = "TABLET".asInstanceOf[DeviceFormFactor]

    val values = js.Object.freeze(js.Array(PHONE, TABLET))
  }

  /**
    * Represents the device instance.
    */
  @js.native
  @Factory
  trait DeviceInstance extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var deviceArn: js.UndefOr[AmazonResourceName]
    var instanceProfile: js.UndefOr[InstanceProfile]
    var labels: js.UndefOr[InstanceLabels]
    var status: js.UndefOr[InstanceStatus]
    var udid: js.UndefOr[String]
  }

  /**
    * Represents the total (metered or unmetered) minutes used by the resource to run tests. Contains the sum of minutes consumed by all children.
    */
  @js.native
  @Factory
  trait DeviceMinutes extends js.Object {
    var metered: js.UndefOr[Double]
    var total: js.UndefOr[Double]
    var unmetered: js.UndefOr[Double]
  }

  @js.native
  sealed trait DevicePlatform extends js.Any
  object DevicePlatform extends js.Object {
    val ANDROID = "ANDROID".asInstanceOf[DevicePlatform]
    val IOS     = "IOS".asInstanceOf[DevicePlatform]

    val values = js.Object.freeze(js.Array(ANDROID, IOS))
  }

  /**
    * Represents a collection of device types.
    */
  @js.native
  @Factory
  trait DevicePool extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var description: js.UndefOr[Message]
    var maxDevices: js.UndefOr[Int]
    var name: js.UndefOr[Name]
    var rules: js.UndefOr[Rules]
    var `type`: js.UndefOr[DevicePoolType]
  }

  /**
    * Represents a device pool compatibility result.
    */
  @js.native
  @Factory
  trait DevicePoolCompatibilityResult extends js.Object {
    var compatible: js.UndefOr[Boolean]
    var device: js.UndefOr[Device]
    var incompatibilityMessages: js.UndefOr[IncompatibilityMessages]
  }

  @js.native
  sealed trait DevicePoolType extends js.Any
  object DevicePoolType extends js.Object {
    val CURATED = "CURATED".asInstanceOf[DevicePoolType]
    val PRIVATE = "PRIVATE".asInstanceOf[DevicePoolType]

    val values = js.Object.freeze(js.Array(CURATED, PRIVATE))
  }

  /**
    * Represents the device filters used in a test run and the maximum number of devices to be included in the run. It is passed in as the <code>deviceSelectionConfiguration</code> request parameter in <a>ScheduleRun</a>.
    */
  @js.native
  @Factory
  trait DeviceSelectionConfiguration extends js.Object {
    var filters: DeviceFilters
    var maxDevices: Int
  }

  /**
    * Contains the run results requested by the device selection configuration and how many devices were returned. For an example of the JSON response syntax, see <a>ScheduleRun</a>.
    */
  @js.native
  @Factory
  trait DeviceSelectionResult extends js.Object {
    var filters: js.UndefOr[DeviceFilters]
    var matchedDevicesCount: js.UndefOr[Int]
    var maxDevices: js.UndefOr[Int]
  }

  /**
    * Represents configuration information about a test run, such as the execution timeout (in minutes).
    */
  @js.native
  @Factory
  trait ExecutionConfiguration extends js.Object {
    var accountsCleanup: js.UndefOr[AccountsCleanup]
    var appPackagesCleanup: js.UndefOr[AppPackagesCleanup]
    var jobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes]
    var skipAppResign: js.UndefOr[SkipAppResign]
    var videoCapture: js.UndefOr[VideoCapture]
  }

  @js.native
  sealed trait ExecutionResult extends js.Any
  object ExecutionResult extends js.Object {
    val PENDING = "PENDING".asInstanceOf[ExecutionResult]
    val PASSED  = "PASSED".asInstanceOf[ExecutionResult]
    val WARNED  = "WARNED".asInstanceOf[ExecutionResult]
    val FAILED  = "FAILED".asInstanceOf[ExecutionResult]
    val SKIPPED = "SKIPPED".asInstanceOf[ExecutionResult]
    val ERRORED = "ERRORED".asInstanceOf[ExecutionResult]
    val STOPPED = "STOPPED".asInstanceOf[ExecutionResult]

    val values = js.Object.freeze(js.Array(PENDING, PASSED, WARNED, FAILED, SKIPPED, ERRORED, STOPPED))
  }

  @js.native
  sealed trait ExecutionResultCode extends js.Any
  object ExecutionResultCode extends js.Object {
    val PARSING_FAILED            = "PARSING_FAILED".asInstanceOf[ExecutionResultCode]
    val VPC_ENDPOINT_SETUP_FAILED = "VPC_ENDPOINT_SETUP_FAILED".asInstanceOf[ExecutionResultCode]

    val values = js.Object.freeze(js.Array(PARSING_FAILED, VPC_ENDPOINT_SETUP_FAILED))
  }

  @js.native
  sealed trait ExecutionStatus extends js.Any
  object ExecutionStatus extends js.Object {
    val PENDING             = "PENDING".asInstanceOf[ExecutionStatus]
    val PENDING_CONCURRENCY = "PENDING_CONCURRENCY".asInstanceOf[ExecutionStatus]
    val PENDING_DEVICE      = "PENDING_DEVICE".asInstanceOf[ExecutionStatus]
    val PROCESSING          = "PROCESSING".asInstanceOf[ExecutionStatus]
    val SCHEDULING          = "SCHEDULING".asInstanceOf[ExecutionStatus]
    val PREPARING           = "PREPARING".asInstanceOf[ExecutionStatus]
    val RUNNING             = "RUNNING".asInstanceOf[ExecutionStatus]
    val COMPLETED           = "COMPLETED".asInstanceOf[ExecutionStatus]
    val STOPPING            = "STOPPING".asInstanceOf[ExecutionStatus]

    val values = js.Object.freeze(
      js.Array(
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
    )
  }

  /**
    * Represents the request sent to retrieve the account settings.
    */
  @js.native
  @Factory
  trait GetAccountSettingsRequest extends js.Object {}

  /**
    * Represents the account settings return values from the <code>GetAccountSettings</code> request.
    */
  @js.native
  @Factory
  trait GetAccountSettingsResult extends js.Object {
    var accountSettings: js.UndefOr[AccountSettings]
  }

  @js.native
  @Factory
  trait GetDeviceInstanceRequest extends js.Object {
    var arn: AmazonResourceName
  }

  @js.native
  @Factory
  trait GetDeviceInstanceResult extends js.Object {
    var deviceInstance: js.UndefOr[DeviceInstance]
  }

  /**
    * Represents a request to the get device pool compatibility operation.
    */
  @js.native
  @Factory
  trait GetDevicePoolCompatibilityRequest extends js.Object {
    var devicePoolArn: AmazonResourceName
    var appArn: js.UndefOr[AmazonResourceName]
    var configuration: js.UndefOr[ScheduleRunConfiguration]
    var test: js.UndefOr[ScheduleRunTest]
    var testType: js.UndefOr[TestType]
  }

  /**
    * Represents the result of describe device pool compatibility request.
    */
  @js.native
  @Factory
  trait GetDevicePoolCompatibilityResult extends js.Object {
    var compatibleDevices: js.UndefOr[DevicePoolCompatibilityResults]
    var incompatibleDevices: js.UndefOr[DevicePoolCompatibilityResults]
  }

  /**
    * Represents a request to the get device pool operation.
    */
  @js.native
  @Factory
  trait GetDevicePoolRequest extends js.Object {
    var arn: AmazonResourceName
  }

  /**
    * Represents the result of a get device pool request.
    */
  @js.native
  @Factory
  trait GetDevicePoolResult extends js.Object {
    var devicePool: js.UndefOr[DevicePool]
  }

  /**
    * Represents a request to the get device request.
    */
  @js.native
  @Factory
  trait GetDeviceRequest extends js.Object {
    var arn: AmazonResourceName
  }

  /**
    * Represents the result of a get device request.
    */
  @js.native
  @Factory
  trait GetDeviceResult extends js.Object {
    var device: js.UndefOr[Device]
  }

  @js.native
  @Factory
  trait GetInstanceProfileRequest extends js.Object {
    var arn: AmazonResourceName
  }

  @js.native
  @Factory
  trait GetInstanceProfileResult extends js.Object {
    var instanceProfile: js.UndefOr[InstanceProfile]
  }

  /**
    * Represents a request to the get job operation.
    */
  @js.native
  @Factory
  trait GetJobRequest extends js.Object {
    var arn: AmazonResourceName
  }

  /**
    * Represents the result of a get job request.
    */
  @js.native
  @Factory
  trait GetJobResult extends js.Object {
    var job: js.UndefOr[Job]
  }

  @js.native
  @Factory
  trait GetNetworkProfileRequest extends js.Object {
    var arn: AmazonResourceName
  }

  @js.native
  @Factory
  trait GetNetworkProfileResult extends js.Object {
    var networkProfile: js.UndefOr[NetworkProfile]
  }

  /**
    * Represents the request to retrieve the offering status for the specified customer or account.
    */
  @js.native
  @Factory
  trait GetOfferingStatusRequest extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
  }

  /**
    * Returns the status result for a device offering.
    */
  @js.native
  @Factory
  trait GetOfferingStatusResult extends js.Object {
    var current: js.UndefOr[OfferingStatusMap]
    var nextPeriod: js.UndefOr[OfferingStatusMap]
    var nextToken: js.UndefOr[PaginationToken]
  }

  /**
    * Represents a request to the get project operation.
    */
  @js.native
  @Factory
  trait GetProjectRequest extends js.Object {
    var arn: AmazonResourceName
  }

  /**
    * Represents the result of a get project request.
    */
  @js.native
  @Factory
  trait GetProjectResult extends js.Object {
    var project: js.UndefOr[Project]
  }

  /**
    * Represents the request to get information about the specified remote access session.
    */
  @js.native
  @Factory
  trait GetRemoteAccessSessionRequest extends js.Object {
    var arn: AmazonResourceName
  }

  /**
    * Represents the response from the server that lists detailed information about the remote access session.
    */
  @js.native
  @Factory
  trait GetRemoteAccessSessionResult extends js.Object {
    var remoteAccessSession: js.UndefOr[RemoteAccessSession]
  }

  /**
    * Represents a request to the get run operation.
    */
  @js.native
  @Factory
  trait GetRunRequest extends js.Object {
    var arn: AmazonResourceName
  }

  /**
    * Represents the result of a get run request.
    */
  @js.native
  @Factory
  trait GetRunResult extends js.Object {
    var run: js.UndefOr[Run]
  }

  /**
    * Represents a request to the get suite operation.
    */
  @js.native
  @Factory
  trait GetSuiteRequest extends js.Object {
    var arn: AmazonResourceName
  }

  /**
    * Represents the result of a get suite request.
    */
  @js.native
  @Factory
  trait GetSuiteResult extends js.Object {
    var suite: js.UndefOr[Suite]
  }

  @js.native
  @Factory
  trait GetTestGridProjectRequest extends js.Object {
    var projectArn: DeviceFarmArn
  }

  @js.native
  @Factory
  trait GetTestGridProjectResult extends js.Object {
    var testGridProject: js.UndefOr[TestGridProject]
  }

  @js.native
  @Factory
  trait GetTestGridSessionRequest extends js.Object {
    var projectArn: js.UndefOr[DeviceFarmArn]
    var sessionArn: js.UndefOr[DeviceFarmArn]
    var sessionId: js.UndefOr[ResourceId]
  }

  @js.native
  @Factory
  trait GetTestGridSessionResult extends js.Object {
    var testGridSession: js.UndefOr[TestGridSession]
  }

  /**
    * Represents a request to the get test operation.
    */
  @js.native
  @Factory
  trait GetTestRequest extends js.Object {
    var arn: AmazonResourceName
  }

  /**
    * Represents the result of a get test request.
    */
  @js.native
  @Factory
  trait GetTestResult extends js.Object {
    var test: js.UndefOr[Test]
  }

  /**
    * Represents a request to the get upload operation.
    */
  @js.native
  @Factory
  trait GetUploadRequest extends js.Object {
    var arn: AmazonResourceName
  }

  /**
    * Represents the result of a get upload request.
    */
  @js.native
  @Factory
  trait GetUploadResult extends js.Object {
    var upload: js.UndefOr[Upload]
  }

  @js.native
  @Factory
  trait GetVPCEConfigurationRequest extends js.Object {
    var arn: AmazonResourceName
  }

  @js.native
  @Factory
  trait GetVPCEConfigurationResult extends js.Object {
    var vpceConfiguration: js.UndefOr[VPCEConfiguration]
  }

  /**
    * Represents information about incompatibility.
    */
  @js.native
  @Factory
  trait IncompatibilityMessage extends js.Object {
    var message: js.UndefOr[Message]
    var `type`: js.UndefOr[DeviceAttribute]
  }

  /**
    * Represents the request to install an Android application (in .apk format) or an iOS application (in .ipa format) as part of a remote access session.
    */
  @js.native
  @Factory
  trait InstallToRemoteAccessSessionRequest extends js.Object {
    var appArn: AmazonResourceName
    var remoteAccessSessionArn: AmazonResourceName
  }

  /**
    * Represents the response from the server after AWS Device Farm makes a request to install to a remote access session.
    */
  @js.native
  @Factory
  trait InstallToRemoteAccessSessionResult extends js.Object {
    var appUpload: js.UndefOr[Upload]
  }

  /**
    * Represents the instance profile.
    */
  @js.native
  @Factory
  trait InstanceProfile extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var description: js.UndefOr[Message]
    var excludeAppPackagesFromCleanup: js.UndefOr[PackageIds]
    var name: js.UndefOr[Name]
    var packageCleanup: js.UndefOr[Boolean]
    var rebootAfterUse: js.UndefOr[Boolean]
  }

  @js.native
  sealed trait InstanceStatus extends js.Any
  object InstanceStatus extends js.Object {
    val IN_USE        = "IN_USE".asInstanceOf[InstanceStatus]
    val PREPARING     = "PREPARING".asInstanceOf[InstanceStatus]
    val AVAILABLE     = "AVAILABLE".asInstanceOf[InstanceStatus]
    val NOT_AVAILABLE = "NOT_AVAILABLE".asInstanceOf[InstanceStatus]

    val values = js.Object.freeze(js.Array(IN_USE, PREPARING, AVAILABLE, NOT_AVAILABLE))
  }

  @js.native
  sealed trait InteractionMode extends js.Any
  object InteractionMode extends js.Object {
    val INTERACTIVE = "INTERACTIVE".asInstanceOf[InteractionMode]
    val NO_VIDEO    = "NO_VIDEO".asInstanceOf[InteractionMode]
    val VIDEO_ONLY  = "VIDEO_ONLY".asInstanceOf[InteractionMode]

    val values = js.Object.freeze(js.Array(INTERACTIVE, NO_VIDEO, VIDEO_ONLY))
  }

  /**
    * Represents a device.
    */
  @js.native
  @Factory
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

  /**
    * Represents a request to the list artifacts operation.
    */
  @js.native
  @Factory
  trait ListArtifactsRequest extends js.Object {
    var arn: AmazonResourceName
    var `type`: ArtifactCategory
    var nextToken: js.UndefOr[PaginationToken]
  }

  /**
    * Represents the result of a list artifacts operation.
    */
  @js.native
  @Factory
  trait ListArtifactsResult extends js.Object {
    var artifacts: js.UndefOr[Artifacts]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListDeviceInstancesRequest extends js.Object {
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListDeviceInstancesResult extends js.Object {
    var deviceInstances: js.UndefOr[DeviceInstances]
    var nextToken: js.UndefOr[PaginationToken]
  }

  /**
    * Represents the result of a list device pools request.
    */
  @js.native
  @Factory
  trait ListDevicePoolsRequest extends js.Object {
    var arn: AmazonResourceName
    var nextToken: js.UndefOr[PaginationToken]
    var `type`: js.UndefOr[DevicePoolType]
  }

  /**
    * Represents the result of a list device pools request.
    */
  @js.native
  @Factory
  trait ListDevicePoolsResult extends js.Object {
    var devicePools: js.UndefOr[DevicePools]
    var nextToken: js.UndefOr[PaginationToken]
  }

  /**
    * Represents the result of a list devices request.
    */
  @js.native
  @Factory
  trait ListDevicesRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var filters: js.UndefOr[DeviceFilters]
    var nextToken: js.UndefOr[PaginationToken]
  }

  /**
    * Represents the result of a list devices operation.
    */
  @js.native
  @Factory
  trait ListDevicesResult extends js.Object {
    var devices: js.UndefOr[Devices]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListInstanceProfilesRequest extends js.Object {
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListInstanceProfilesResult extends js.Object {
    var instanceProfiles: js.UndefOr[InstanceProfiles]
    var nextToken: js.UndefOr[PaginationToken]
  }

  /**
    * Represents a request to the list jobs operation.
    */
  @js.native
  @Factory
  trait ListJobsRequest extends js.Object {
    var arn: AmazonResourceName
    var nextToken: js.UndefOr[PaginationToken]
  }

  /**
    * Represents the result of a list jobs request.
    */
  @js.native
  @Factory
  trait ListJobsResult extends js.Object {
    var jobs: js.UndefOr[Jobs]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListNetworkProfilesRequest extends js.Object {
    var arn: AmazonResourceName
    var nextToken: js.UndefOr[PaginationToken]
    var `type`: js.UndefOr[NetworkProfileType]
  }

  @js.native
  @Factory
  trait ListNetworkProfilesResult extends js.Object {
    var networkProfiles: js.UndefOr[NetworkProfiles]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListOfferingPromotionsRequest extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListOfferingPromotionsResult extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var offeringPromotions: js.UndefOr[OfferingPromotions]
  }

  /**
    * Represents the request to list the offering transaction history.
    */
  @js.native
  @Factory
  trait ListOfferingTransactionsRequest extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
  }

  /**
    * Returns the transaction log of the specified offerings.
    */
  @js.native
  @Factory
  trait ListOfferingTransactionsResult extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var offeringTransactions: js.UndefOr[OfferingTransactions]
  }

  /**
    * Represents the request to list all offerings.
    */
  @js.native
  @Factory
  trait ListOfferingsRequest extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
  }

  /**
    * Represents the return values of the list of offerings.
    */
  @js.native
  @Factory
  trait ListOfferingsResult extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var offerings: js.UndefOr[Offerings]
  }

  /**
    * Represents a request to the list projects operation.
    */
  @js.native
  @Factory
  trait ListProjectsRequest extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var nextToken: js.UndefOr[PaginationToken]
  }

  /**
    * Represents the result of a list projects request.
    */
  @js.native
  @Factory
  trait ListProjectsResult extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var projects: js.UndefOr[Projects]
  }

  /**
    * Represents the request to return information about the remote access session.
    */
  @js.native
  @Factory
  trait ListRemoteAccessSessionsRequest extends js.Object {
    var arn: AmazonResourceName
    var nextToken: js.UndefOr[PaginationToken]
  }

  /**
    * Represents the response from the server after AWS Device Farm makes a request to return information about the remote access session.
    */
  @js.native
  @Factory
  trait ListRemoteAccessSessionsResult extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var remoteAccessSessions: js.UndefOr[RemoteAccessSessions]
  }

  /**
    * Represents a request to the list runs operation.
    */
  @js.native
  @Factory
  trait ListRunsRequest extends js.Object {
    var arn: AmazonResourceName
    var nextToken: js.UndefOr[PaginationToken]
  }

  /**
    * Represents the result of a list runs request.
    */
  @js.native
  @Factory
  trait ListRunsResult extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var runs: js.UndefOr[Runs]
  }

  /**
    * Represents a request to the list samples operation.
    */
  @js.native
  @Factory
  trait ListSamplesRequest extends js.Object {
    var arn: AmazonResourceName
    var nextToken: js.UndefOr[PaginationToken]
  }

  /**
    * Represents the result of a list samples request.
    */
  @js.native
  @Factory
  trait ListSamplesResult extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var samples: js.UndefOr[Samples]
  }

  /**
    * Represents a request to the list suites operation.
    */
  @js.native
  @Factory
  trait ListSuitesRequest extends js.Object {
    var arn: AmazonResourceName
    var nextToken: js.UndefOr[PaginationToken]
  }

  /**
    * Represents the result of a list suites request.
    */
  @js.native
  @Factory
  trait ListSuitesResult extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var suites: js.UndefOr[Suites]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceARN: DeviceFarmArn
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  @js.native
  @Factory
  trait ListTestGridProjectsRequest extends js.Object {
    var maxResult: js.UndefOr[MaxPageSize]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListTestGridProjectsResult extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var testGridProjects: js.UndefOr[TestGridProjects]
  }

  @js.native
  @Factory
  trait ListTestGridSessionActionsRequest extends js.Object {
    var sessionArn: DeviceFarmArn
    var maxResult: js.UndefOr[MaxPageSize]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListTestGridSessionActionsResult extends js.Object {
    var actions: js.UndefOr[TestGridSessionActions]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListTestGridSessionArtifactsRequest extends js.Object {
    var sessionArn: DeviceFarmArn
    var maxResult: js.UndefOr[MaxPageSize]
    var nextToken: js.UndefOr[PaginationToken]
    var `type`: js.UndefOr[TestGridSessionArtifactCategory]
  }

  @js.native
  @Factory
  trait ListTestGridSessionArtifactsResult extends js.Object {
    var artifacts: js.UndefOr[TestGridSessionArtifacts]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListTestGridSessionsRequest extends js.Object {
    var projectArn: DeviceFarmArn
    var creationTimeAfter: js.UndefOr[DateTime]
    var creationTimeBefore: js.UndefOr[DateTime]
    var endTimeAfter: js.UndefOr[DateTime]
    var endTimeBefore: js.UndefOr[DateTime]
    var maxResult: js.UndefOr[MaxPageSize]
    var nextToken: js.UndefOr[PaginationToken]
    var status: js.UndefOr[TestGridSessionStatus]
  }

  @js.native
  @Factory
  trait ListTestGridSessionsResult extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var testGridSessions: js.UndefOr[TestGridSessions]
  }

  /**
    * Represents a request to the list tests operation.
    */
  @js.native
  @Factory
  trait ListTestsRequest extends js.Object {
    var arn: AmazonResourceName
    var nextToken: js.UndefOr[PaginationToken]
  }

  /**
    * Represents the result of a list tests request.
    */
  @js.native
  @Factory
  trait ListTestsResult extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var tests: js.UndefOr[Tests]
  }

  /**
    * Represents a request to the list unique problems operation.
    */
  @js.native
  @Factory
  trait ListUniqueProblemsRequest extends js.Object {
    var arn: AmazonResourceName
    var nextToken: js.UndefOr[PaginationToken]
  }

  /**
    * Represents the result of a list unique problems request.
    */
  @js.native
  @Factory
  trait ListUniqueProblemsResult extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var uniqueProblems: js.UndefOr[UniqueProblemsByExecutionResultMap]
  }

  /**
    * Represents a request to the list uploads operation.
    */
  @js.native
  @Factory
  trait ListUploadsRequest extends js.Object {
    var arn: AmazonResourceName
    var nextToken: js.UndefOr[PaginationToken]
    var `type`: js.UndefOr[UploadType]
  }

  /**
    * Represents the result of a list uploads request.
    */
  @js.native
  @Factory
  trait ListUploadsResult extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var uploads: js.UndefOr[Uploads]
  }

  @js.native
  @Factory
  trait ListVPCEConfigurationsRequest extends js.Object {
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListVPCEConfigurationsResult extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var vpceConfigurations: js.UndefOr[VPCEConfigurations]
  }

  /**
    * Represents a latitude and longitude pair, expressed in geographic coordinate system degrees (for example, 47.6204, -122.3491).
    *  Elevation is currently not supported.
    */
  @js.native
  @Factory
  trait Location extends js.Object {
    var latitude: Double
    var longitude: Double
  }

  /**
    * A number that represents the monetary amount for an offering or transaction.
    */
  @js.native
  @Factory
  trait MonetaryAmount extends js.Object {
    var amount: js.UndefOr[Double]
    var currencyCode: js.UndefOr[CurrencyCode]
  }

  /**
    * An array of settings that describes characteristics of a network profile.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait NetworkProfileType extends js.Any
  object NetworkProfileType extends js.Object {
    val CURATED = "CURATED".asInstanceOf[NetworkProfileType]
    val PRIVATE = "PRIVATE".asInstanceOf[NetworkProfileType]

    val values = js.Object.freeze(js.Array(CURATED, PRIVATE))
  }

  /**
    * Represents the metadata of a device offering.
    */
  @js.native
  @Factory
  trait Offering extends js.Object {
    var description: js.UndefOr[Message]
    var id: js.UndefOr[OfferingIdentifier]
    var platform: js.UndefOr[DevicePlatform]
    var recurringCharges: js.UndefOr[RecurringCharges]
    var `type`: js.UndefOr[OfferingType]
  }

  /**
    * Represents information about an offering promotion.
    */
  @js.native
  @Factory
  trait OfferingPromotion extends js.Object {
    var description: js.UndefOr[Message]
    var id: js.UndefOr[OfferingPromotionIdentifier]
  }

  /**
    * The status of the offering.
    */
  @js.native
  @Factory
  trait OfferingStatus extends js.Object {
    var effectiveOn: js.UndefOr[DateTime]
    var offering: js.UndefOr[Offering]
    var quantity: js.UndefOr[Int]
    var `type`: js.UndefOr[OfferingTransactionType]
  }

  /**
    * Represents the metadata of an offering transaction.
    */
  @js.native
  @Factory
  trait OfferingTransaction extends js.Object {
    var cost: js.UndefOr[MonetaryAmount]
    var createdOn: js.UndefOr[DateTime]
    var offeringPromotionId: js.UndefOr[OfferingPromotionIdentifier]
    var offeringStatus: js.UndefOr[OfferingStatus]
    var transactionId: js.UndefOr[TransactionIdentifier]
  }

  @js.native
  sealed trait OfferingTransactionType extends js.Any
  object OfferingTransactionType extends js.Object {
    val PURCHASE = "PURCHASE".asInstanceOf[OfferingTransactionType]
    val RENEW    = "RENEW".asInstanceOf[OfferingTransactionType]
    val SYSTEM   = "SYSTEM".asInstanceOf[OfferingTransactionType]

    val values = js.Object.freeze(js.Array(PURCHASE, RENEW, SYSTEM))
  }

  @js.native
  sealed trait OfferingType extends js.Any
  object OfferingType extends js.Object {
    val RECURRING = "RECURRING".asInstanceOf[OfferingType]

    val values = js.Object.freeze(js.Array(RECURRING))
  }

  /**
    * Represents a specific warning or failure.
    */
  @js.native
  @Factory
  trait Problem extends js.Object {
    var device: js.UndefOr[Device]
    var job: js.UndefOr[ProblemDetail]
    var message: js.UndefOr[Message]
    var result: js.UndefOr[ExecutionResult]
    var run: js.UndefOr[ProblemDetail]
    var suite: js.UndefOr[ProblemDetail]
    var test: js.UndefOr[ProblemDetail]
  }

  /**
    * Information about a problem detail.
    */
  @js.native
  @Factory
  trait ProblemDetail extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var name: js.UndefOr[Name]
  }

  /**
    * Represents an operating-system neutral workspace for running and managing tests.
    */
  @js.native
  @Factory
  trait Project extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var created: js.UndefOr[DateTime]
    var defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes]
    var name: js.UndefOr[Name]
  }

  /**
    * Represents a request for a purchase offering.
    */
  @js.native
  @Factory
  trait PurchaseOfferingRequest extends js.Object {
    var offeringId: js.UndefOr[OfferingIdentifier]
    var offeringPromotionId: js.UndefOr[OfferingPromotionIdentifier]
    var quantity: js.UndefOr[Int]
  }

  /**
    * The result of the purchase offering (for example, success or failure).
    */
  @js.native
  @Factory
  trait PurchaseOfferingResult extends js.Object {
    var offeringTransaction: js.UndefOr[OfferingTransaction]
  }

  /**
    * Represents the set of radios and their states on a device. Examples of radios include Wi-Fi, GPS, Bluetooth, and NFC.
    */
  @js.native
  @Factory
  trait Radios extends js.Object {
    var bluetooth: js.UndefOr[Boolean]
    var gps: js.UndefOr[Boolean]
    var nfc: js.UndefOr[Boolean]
    var wifi: js.UndefOr[Boolean]
  }

  /**
    * Specifies whether charges for devices are recurring.
    */
  @js.native
  @Factory
  trait RecurringCharge extends js.Object {
    var cost: js.UndefOr[MonetaryAmount]
    var frequency: js.UndefOr[RecurringChargeFrequency]
  }

  @js.native
  sealed trait RecurringChargeFrequency extends js.Any
  object RecurringChargeFrequency extends js.Object {
    val MONTHLY = "MONTHLY".asInstanceOf[RecurringChargeFrequency]

    val values = js.Object.freeze(js.Array(MONTHLY))
  }

  /**
    * Represents information about the remote access session.
    */
  @js.native
  @Factory
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

  /**
    * A request that represents an offering renewal.
    */
  @js.native
  @Factory
  trait RenewOfferingRequest extends js.Object {
    var offeringId: js.UndefOr[OfferingIdentifier]
    var quantity: js.UndefOr[Int]
  }

  /**
    * The result of a renewal offering.
    */
  @js.native
  @Factory
  trait RenewOfferingResult extends js.Object {
    var offeringTransaction: js.UndefOr[OfferingTransaction]
  }

  /**
    * Represents the screen resolution of a device in height and width, expressed in pixels.
    */
  @js.native
  @Factory
  trait Resolution extends js.Object {
    var height: js.UndefOr[Int]
    var width: js.UndefOr[Int]
  }

  /**
    * Represents a condition for a device pool.
    */
  @js.native
  @Factory
  trait Rule extends js.Object {
    var attribute: js.UndefOr[DeviceAttribute]
    var operator: js.UndefOr[RuleOperator]
    var value: js.UndefOr[String]
  }

  @js.native
  sealed trait RuleOperator extends js.Any
  object RuleOperator extends js.Object {
    val EQUALS                 = "EQUALS".asInstanceOf[RuleOperator]
    val LESS_THAN              = "LESS_THAN".asInstanceOf[RuleOperator]
    val LESS_THAN_OR_EQUALS    = "LESS_THAN_OR_EQUALS".asInstanceOf[RuleOperator]
    val GREATER_THAN           = "GREATER_THAN".asInstanceOf[RuleOperator]
    val GREATER_THAN_OR_EQUALS = "GREATER_THAN_OR_EQUALS".asInstanceOf[RuleOperator]
    val IN                     = "IN".asInstanceOf[RuleOperator]
    val NOT_IN                 = "NOT_IN".asInstanceOf[RuleOperator]
    val CONTAINS               = "CONTAINS".asInstanceOf[RuleOperator]

    val values = js.Object.freeze(
      js.Array(EQUALS, LESS_THAN, LESS_THAN_OR_EQUALS, GREATER_THAN, GREATER_THAN_OR_EQUALS, IN, NOT_IN, CONTAINS)
    )
  }

  /**
    * Represents a test run on a set of devices with a given app package, test parameters, and so on.
    */
  @js.native
  @Factory
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

  /**
    * Represents a sample of performance data.
    */
  @js.native
  @Factory
  trait Sample extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var `type`: js.UndefOr[SampleType]
    var url: js.UndefOr[URL]
  }

  @js.native
  sealed trait SampleType extends js.Any
  object SampleType extends js.Object {
    val CPU                 = "CPU".asInstanceOf[SampleType]
    val MEMORY              = "MEMORY".asInstanceOf[SampleType]
    val THREADS             = "THREADS".asInstanceOf[SampleType]
    val RX_RATE             = "RX_RATE".asInstanceOf[SampleType]
    val TX_RATE             = "TX_RATE".asInstanceOf[SampleType]
    val RX                  = "RX".asInstanceOf[SampleType]
    val TX                  = "TX".asInstanceOf[SampleType]
    val NATIVE_FRAMES       = "NATIVE_FRAMES".asInstanceOf[SampleType]
    val NATIVE_FPS          = "NATIVE_FPS".asInstanceOf[SampleType]
    val NATIVE_MIN_DRAWTIME = "NATIVE_MIN_DRAWTIME".asInstanceOf[SampleType]
    val NATIVE_AVG_DRAWTIME = "NATIVE_AVG_DRAWTIME".asInstanceOf[SampleType]
    val NATIVE_MAX_DRAWTIME = "NATIVE_MAX_DRAWTIME".asInstanceOf[SampleType]
    val OPENGL_FRAMES       = "OPENGL_FRAMES".asInstanceOf[SampleType]
    val OPENGL_FPS          = "OPENGL_FPS".asInstanceOf[SampleType]
    val OPENGL_MIN_DRAWTIME = "OPENGL_MIN_DRAWTIME".asInstanceOf[SampleType]
    val OPENGL_AVG_DRAWTIME = "OPENGL_AVG_DRAWTIME".asInstanceOf[SampleType]
    val OPENGL_MAX_DRAWTIME = "OPENGL_MAX_DRAWTIME".asInstanceOf[SampleType]

    val values = js.Object.freeze(
      js.Array(
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
    )
  }

  /**
    * Represents the settings for a run. Includes things like location, radio states, auxiliary apps, and network profiles.
    */
  @js.native
  @Factory
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

  /**
    * Represents a request to the schedule run operation.
    */
  @js.native
  @Factory
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

  /**
    * Represents the result of a schedule run request.
    */
  @js.native
  @Factory
  trait ScheduleRunResult extends js.Object {
    var run: js.UndefOr[Run]
  }

  /**
    * Represents test settings. This data structure is passed in as the test parameter to ScheduleRun. For an example of the JSON request syntax, see <a>ScheduleRun</a>.
    */
  @js.native
  @Factory
  trait ScheduleRunTest extends js.Object {
    var `type`: TestType
    var filter: js.UndefOr[Filter]
    var parameters: js.UndefOr[TestParameters]
    var testPackageArn: js.UndefOr[AmazonResourceName]
    var testSpecArn: js.UndefOr[AmazonResourceName]
  }

  @js.native
  @Factory
  trait StopJobRequest extends js.Object {
    var arn: AmazonResourceName
  }

  @js.native
  @Factory
  trait StopJobResult extends js.Object {
    var job: js.UndefOr[Job]
  }

  /**
    * Represents the request to stop the remote access session.
    */
  @js.native
  @Factory
  trait StopRemoteAccessSessionRequest extends js.Object {
    var arn: AmazonResourceName
  }

  /**
    * Represents the response from the server that describes the remote access session when AWS Device Farm stops the session.
    */
  @js.native
  @Factory
  trait StopRemoteAccessSessionResult extends js.Object {
    var remoteAccessSession: js.UndefOr[RemoteAccessSession]
  }

  /**
    * Represents the request to stop a specific run.
    */
  @js.native
  @Factory
  trait StopRunRequest extends js.Object {
    var arn: AmazonResourceName
  }

  /**
    * Represents the results of your stop run attempt.
    */
  @js.native
  @Factory
  trait StopRunResult extends js.Object {
    var run: js.UndefOr[Run]
  }

  /**
    * Represents a collection of one or more tests.
    */
  @js.native
  @Factory
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

  /**
    * The metadata that you apply to a resource to help you categorize and organize it. Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters. Tag values can have a maximum length of 256 characters.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceARN: DeviceFarmArn
    var Tags: TagList
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  /**
    * Represents a condition that is evaluated.
    */
  @js.native
  @Factory
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

  /**
    * A Selenium testing project. Projects are used to collect and collate sessions.
    */
  @js.native
  @Factory
  trait TestGridProject extends js.Object {
    var arn: js.UndefOr[DeviceFarmArn]
    var created: js.UndefOr[DateTime]
    var description: js.UndefOr[String]
    var name: js.UndefOr[String]
  }

  /**
    * A <a>TestGridSession</a> is a single instance of a browser launched from the URL provided by a call to <a>CreateTestGridUrl</a>.
    */
  @js.native
  @Factory
  trait TestGridSession extends js.Object {
    var arn: js.UndefOr[DeviceFarmArn]
    var billingMinutes: js.UndefOr[Double]
    var created: js.UndefOr[DateTime]
    var ended: js.UndefOr[DateTime]
    var seleniumProperties: js.UndefOr[String]
    var status: js.UndefOr[TestGridSessionStatus]
  }

  /**
    * An action taken by a <a>TestGridSession</a> browser instance.
    */
  @js.native
  @Factory
  trait TestGridSessionAction extends js.Object {
    var action: js.UndefOr[String]
    var duration: js.UndefOr[Double]
    var requestMethod: js.UndefOr[String]
    var started: js.UndefOr[DateTime]
    var statusCode: js.UndefOr[String]
  }

  /**
    * Artifacts are video and other files that are produced in the process of running a browser in an automated context.
    *
    * '''Note:'''Video elements might be broken up into multiple artifacts as they grow in size during creation.
    */
  @js.native
  @Factory
  trait TestGridSessionArtifact extends js.Object {
    var filename: js.UndefOr[String]
    var `type`: js.UndefOr[TestGridSessionArtifactType]
    var url: js.UndefOr[String]
  }

  @js.native
  sealed trait TestGridSessionArtifactCategory extends js.Any
  object TestGridSessionArtifactCategory extends js.Object {
    val VIDEO = "VIDEO".asInstanceOf[TestGridSessionArtifactCategory]
    val LOG   = "LOG".asInstanceOf[TestGridSessionArtifactCategory]

    val values = js.Object.freeze(js.Array(VIDEO, LOG))
  }

  @js.native
  sealed trait TestGridSessionArtifactType extends js.Any
  object TestGridSessionArtifactType extends js.Object {
    val UNKNOWN      = "UNKNOWN".asInstanceOf[TestGridSessionArtifactType]
    val VIDEO        = "VIDEO".asInstanceOf[TestGridSessionArtifactType]
    val SELENIUM_LOG = "SELENIUM_LOG".asInstanceOf[TestGridSessionArtifactType]

    val values = js.Object.freeze(js.Array(UNKNOWN, VIDEO, SELENIUM_LOG))
  }

  @js.native
  sealed trait TestGridSessionStatus extends js.Any
  object TestGridSessionStatus extends js.Object {
    val ACTIVE  = "ACTIVE".asInstanceOf[TestGridSessionStatus]
    val CLOSED  = "CLOSED".asInstanceOf[TestGridSessionStatus]
    val ERRORED = "ERRORED".asInstanceOf[TestGridSessionStatus]

    val values = js.Object.freeze(js.Array(ACTIVE, CLOSED, ERRORED))
  }

  @js.native
  sealed trait TestType extends js.Any
  object TestType extends js.Object {
    val BUILTIN_FUZZ            = "BUILTIN_FUZZ".asInstanceOf[TestType]
    val BUILTIN_EXPLORER        = "BUILTIN_EXPLORER".asInstanceOf[TestType]
    val WEB_PERFORMANCE_PROFILE = "WEB_PERFORMANCE_PROFILE".asInstanceOf[TestType]
    val APPIUM_JAVA_JUNIT       = "APPIUM_JAVA_JUNIT".asInstanceOf[TestType]
    val APPIUM_JAVA_TESTNG      = "APPIUM_JAVA_TESTNG".asInstanceOf[TestType]
    val APPIUM_PYTHON           = "APPIUM_PYTHON".asInstanceOf[TestType]
    val APPIUM_NODE             = "APPIUM_NODE".asInstanceOf[TestType]
    val APPIUM_RUBY             = "APPIUM_RUBY".asInstanceOf[TestType]
    val APPIUM_WEB_JAVA_JUNIT   = "APPIUM_WEB_JAVA_JUNIT".asInstanceOf[TestType]
    val APPIUM_WEB_JAVA_TESTNG  = "APPIUM_WEB_JAVA_TESTNG".asInstanceOf[TestType]
    val APPIUM_WEB_PYTHON       = "APPIUM_WEB_PYTHON".asInstanceOf[TestType]
    val APPIUM_WEB_NODE         = "APPIUM_WEB_NODE".asInstanceOf[TestType]
    val APPIUM_WEB_RUBY         = "APPIUM_WEB_RUBY".asInstanceOf[TestType]
    val CALABASH                = "CALABASH".asInstanceOf[TestType]
    val INSTRUMENTATION         = "INSTRUMENTATION".asInstanceOf[TestType]
    val UIAUTOMATION            = "UIAUTOMATION".asInstanceOf[TestType]
    val UIAUTOMATOR             = "UIAUTOMATOR".asInstanceOf[TestType]
    val XCTEST                  = "XCTEST".asInstanceOf[TestType]
    val XCTEST_UI               = "XCTEST_UI".asInstanceOf[TestType]
    val REMOTE_ACCESS_RECORD    = "REMOTE_ACCESS_RECORD".asInstanceOf[TestType]
    val REMOTE_ACCESS_REPLAY    = "REMOTE_ACCESS_REPLAY".asInstanceOf[TestType]

    val values = js.Object.freeze(
      js.Array(
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
    )
  }

  /**
    * Represents information about free trial device minutes for an AWS account.
    */
  @js.native
  @Factory
  trait TrialMinutes extends js.Object {
    var remaining: js.UndefOr[Double]
    var total: js.UndefOr[Double]
  }

  /**
    * A collection of one or more problems, grouped by their result.
    */
  @js.native
  @Factory
  trait UniqueProblem extends js.Object {
    var message: js.UndefOr[Message]
    var problems: js.UndefOr[Problems]
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceARN: DeviceFarmArn
    var TagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UpdateDeviceInstanceRequest extends js.Object {
    var arn: AmazonResourceName
    var labels: js.UndefOr[InstanceLabels]
    var profileArn: js.UndefOr[AmazonResourceName]
  }

  @js.native
  @Factory
  trait UpdateDeviceInstanceResult extends js.Object {
    var deviceInstance: js.UndefOr[DeviceInstance]
  }

  /**
    * Represents a request to the update device pool operation.
    */
  @js.native
  @Factory
  trait UpdateDevicePoolRequest extends js.Object {
    var arn: AmazonResourceName
    var clearMaxDevices: js.UndefOr[Boolean]
    var description: js.UndefOr[Message]
    var maxDevices: js.UndefOr[Int]
    var name: js.UndefOr[Name]
    var rules: js.UndefOr[Rules]
  }

  /**
    * Represents the result of an update device pool request.
    */
  @js.native
  @Factory
  trait UpdateDevicePoolResult extends js.Object {
    var devicePool: js.UndefOr[DevicePool]
  }

  @js.native
  @Factory
  trait UpdateInstanceProfileRequest extends js.Object {
    var arn: AmazonResourceName
    var description: js.UndefOr[Message]
    var excludeAppPackagesFromCleanup: js.UndefOr[PackageIds]
    var name: js.UndefOr[Name]
    var packageCleanup: js.UndefOr[Boolean]
    var rebootAfterUse: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait UpdateInstanceProfileResult extends js.Object {
    var instanceProfile: js.UndefOr[InstanceProfile]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait UpdateNetworkProfileResult extends js.Object {
    var networkProfile: js.UndefOr[NetworkProfile]
  }

  /**
    * Represents a request to the update project operation.
    */
  @js.native
  @Factory
  trait UpdateProjectRequest extends js.Object {
    var arn: AmazonResourceName
    var defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes]
    var name: js.UndefOr[Name]
  }

  /**
    * Represents the result of an update project request.
    */
  @js.native
  @Factory
  trait UpdateProjectResult extends js.Object {
    var project: js.UndefOr[Project]
  }

  @js.native
  @Factory
  trait UpdateTestGridProjectRequest extends js.Object {
    var projectArn: DeviceFarmArn
    var description: js.UndefOr[ResourceDescription]
    var name: js.UndefOr[ResourceName]
  }

  @js.native
  @Factory
  trait UpdateTestGridProjectResult extends js.Object {
    var testGridProject: js.UndefOr[TestGridProject]
  }

  @js.native
  @Factory
  trait UpdateUploadRequest extends js.Object {
    var arn: AmazonResourceName
    var contentType: js.UndefOr[ContentType]
    var editContent: js.UndefOr[Boolean]
    var name: js.UndefOr[Name]
  }

  @js.native
  @Factory
  trait UpdateUploadResult extends js.Object {
    var upload: js.UndefOr[Upload]
  }

  @js.native
  @Factory
  trait UpdateVPCEConfigurationRequest extends js.Object {
    var arn: AmazonResourceName
    var serviceDnsName: js.UndefOr[ServiceDnsName]
    var vpceConfigurationDescription: js.UndefOr[VPCEConfigurationDescription]
    var vpceConfigurationName: js.UndefOr[VPCEConfigurationName]
    var vpceServiceName: js.UndefOr[VPCEServiceName]
  }

  @js.native
  @Factory
  trait UpdateVPCEConfigurationResult extends js.Object {
    var vpceConfiguration: js.UndefOr[VPCEConfiguration]
  }

  /**
    * An app or a set of one or more tests to upload or that have been uploaded.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait UploadCategory extends js.Any
  object UploadCategory extends js.Object {
    val CURATED = "CURATED".asInstanceOf[UploadCategory]
    val PRIVATE = "PRIVATE".asInstanceOf[UploadCategory]

    val values = js.Object.freeze(js.Array(CURATED, PRIVATE))
  }

  @js.native
  sealed trait UploadStatus extends js.Any
  object UploadStatus extends js.Object {
    val INITIALIZED = "INITIALIZED".asInstanceOf[UploadStatus]
    val PROCESSING  = "PROCESSING".asInstanceOf[UploadStatus]
    val SUCCEEDED   = "SUCCEEDED".asInstanceOf[UploadStatus]
    val FAILED      = "FAILED".asInstanceOf[UploadStatus]

    val values = js.Object.freeze(js.Array(INITIALIZED, PROCESSING, SUCCEEDED, FAILED))
  }

  @js.native
  sealed trait UploadType extends js.Any
  object UploadType extends js.Object {
    val ANDROID_APP                         = "ANDROID_APP".asInstanceOf[UploadType]
    val IOS_APP                             = "IOS_APP".asInstanceOf[UploadType]
    val WEB_APP                             = "WEB_APP".asInstanceOf[UploadType]
    val EXTERNAL_DATA                       = "EXTERNAL_DATA".asInstanceOf[UploadType]
    val APPIUM_JAVA_JUNIT_TEST_PACKAGE      = "APPIUM_JAVA_JUNIT_TEST_PACKAGE".asInstanceOf[UploadType]
    val APPIUM_JAVA_TESTNG_TEST_PACKAGE     = "APPIUM_JAVA_TESTNG_TEST_PACKAGE".asInstanceOf[UploadType]
    val APPIUM_PYTHON_TEST_PACKAGE          = "APPIUM_PYTHON_TEST_PACKAGE".asInstanceOf[UploadType]
    val APPIUM_NODE_TEST_PACKAGE            = "APPIUM_NODE_TEST_PACKAGE".asInstanceOf[UploadType]
    val APPIUM_RUBY_TEST_PACKAGE            = "APPIUM_RUBY_TEST_PACKAGE".asInstanceOf[UploadType]
    val APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE  = "APPIUM_WEB_JAVA_JUNIT_TEST_PACKAGE".asInstanceOf[UploadType]
    val APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE = "APPIUM_WEB_JAVA_TESTNG_TEST_PACKAGE".asInstanceOf[UploadType]
    val APPIUM_WEB_PYTHON_TEST_PACKAGE      = "APPIUM_WEB_PYTHON_TEST_PACKAGE".asInstanceOf[UploadType]
    val APPIUM_WEB_NODE_TEST_PACKAGE        = "APPIUM_WEB_NODE_TEST_PACKAGE".asInstanceOf[UploadType]
    val APPIUM_WEB_RUBY_TEST_PACKAGE        = "APPIUM_WEB_RUBY_TEST_PACKAGE".asInstanceOf[UploadType]
    val CALABASH_TEST_PACKAGE               = "CALABASH_TEST_PACKAGE".asInstanceOf[UploadType]
    val INSTRUMENTATION_TEST_PACKAGE        = "INSTRUMENTATION_TEST_PACKAGE".asInstanceOf[UploadType]
    val UIAUTOMATION_TEST_PACKAGE           = "UIAUTOMATION_TEST_PACKAGE".asInstanceOf[UploadType]
    val UIAUTOMATOR_TEST_PACKAGE            = "UIAUTOMATOR_TEST_PACKAGE".asInstanceOf[UploadType]
    val XCTEST_TEST_PACKAGE                 = "XCTEST_TEST_PACKAGE".asInstanceOf[UploadType]
    val XCTEST_UI_TEST_PACKAGE              = "XCTEST_UI_TEST_PACKAGE".asInstanceOf[UploadType]
    val APPIUM_JAVA_JUNIT_TEST_SPEC         = "APPIUM_JAVA_JUNIT_TEST_SPEC".asInstanceOf[UploadType]
    val APPIUM_JAVA_TESTNG_TEST_SPEC        = "APPIUM_JAVA_TESTNG_TEST_SPEC".asInstanceOf[UploadType]
    val APPIUM_PYTHON_TEST_SPEC             = "APPIUM_PYTHON_TEST_SPEC".asInstanceOf[UploadType]
    val APPIUM_NODE_TEST_SPEC               = "APPIUM_NODE_TEST_SPEC".asInstanceOf[UploadType]
    val APPIUM_RUBY_TEST_SPEC               = "APPIUM_RUBY_TEST_SPEC".asInstanceOf[UploadType]
    val APPIUM_WEB_JAVA_JUNIT_TEST_SPEC     = "APPIUM_WEB_JAVA_JUNIT_TEST_SPEC".asInstanceOf[UploadType]
    val APPIUM_WEB_JAVA_TESTNG_TEST_SPEC    = "APPIUM_WEB_JAVA_TESTNG_TEST_SPEC".asInstanceOf[UploadType]
    val APPIUM_WEB_PYTHON_TEST_SPEC         = "APPIUM_WEB_PYTHON_TEST_SPEC".asInstanceOf[UploadType]
    val APPIUM_WEB_NODE_TEST_SPEC           = "APPIUM_WEB_NODE_TEST_SPEC".asInstanceOf[UploadType]
    val APPIUM_WEB_RUBY_TEST_SPEC           = "APPIUM_WEB_RUBY_TEST_SPEC".asInstanceOf[UploadType]
    val INSTRUMENTATION_TEST_SPEC           = "INSTRUMENTATION_TEST_SPEC".asInstanceOf[UploadType]
    val XCTEST_UI_TEST_SPEC                 = "XCTEST_UI_TEST_SPEC".asInstanceOf[UploadType]

    val values = js.Object.freeze(
      js.Array(
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
    )
  }

  /**
    * Represents an Amazon Virtual Private Cloud (VPC) endpoint configuration.
    */
  @js.native
  @Factory
  trait VPCEConfiguration extends js.Object {
    var arn: js.UndefOr[AmazonResourceName]
    var serviceDnsName: js.UndefOr[ServiceDnsName]
    var vpceConfigurationDescription: js.UndefOr[VPCEConfigurationDescription]
    var vpceConfigurationName: js.UndefOr[VPCEConfigurationName]
    var vpceServiceName: js.UndefOr[VPCEServiceName]
  }
}
