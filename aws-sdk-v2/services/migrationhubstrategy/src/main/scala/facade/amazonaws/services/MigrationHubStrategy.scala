package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object migrationhubstrategy {
  type ApplicationComponentDetails = js.Array[ApplicationComponentDetail]
  type ApplicationComponentId = String
  type ApplicationComponentStrategies = js.Array[ApplicationComponentStrategy]
  type AssociatedApplications = js.Array[AssociatedApplication]
  type AssociatedServerIDs = js.Array[String]
  type AsyncTaskId = String
  type AwsManagedTargetDestinations = js.Array[AwsManagedTargetDestination]
  type BusinessGoalsInteger = Int
  type Collectors = js.Array[Collector]
  type GroupIds = js.Array[Group]
  type HeterogeneousTargetDatabaseEngines = js.Array[HeterogeneousTargetDatabaseEngine]
  type HomogeneousTargetDatabaseEngines = js.Array[HomogeneousTargetDatabaseEngine]
  type IPAddress = String
  type InterfaceName = String
  type ListAntipatternSeveritySummary = js.Array[AntipatternSeveritySummary]
  type ListApplicationComponentSummary = js.Array[ApplicationComponentSummary]
  type ListApplicationComponentsRequestFilterValueString = String
  type ListImportFileTaskInformation = js.Array[ImportFileTaskInformation]
  type ListServerSummary = js.Array[ServerSummary]
  type ListStrategySummary = js.Array[StrategySummary]
  type Location = String
  type MacAddress = String
  type MaxResult = Int
  type NetMask = String
  type NetworkInfoList = js.Array[NetworkInfo]
  type NextToken = String
  type NoPreferenceTargetDestinations = js.Array[NoPreferenceTargetDestination]
  type OSVersion = String
  type RecommendationReportStatusMessage = String
  type RecommendationReportTimeStamp = js.Date
  type RecommendationTaskId = String
  type ResourceId = String
  type ResourceName = String
  type S3Bucket = String
  type S3Key = String
  type S3Keys = js.Array[String]
  type SecretsManagerKey = String
  type SelfManageTargetDestinations = js.Array[SelfManageTargetDestination]
  type ServerDetails = js.Array[ServerDetail]
  type ServerId = String
  type ServerStrategies = js.Array[ServerStrategy]
  type SourceCodeList = js.Array[SourceCode]
  type SourceCodeRepositories = js.Array[SourceCodeRepository]
  type SourceVersion = String
  type StartAssessmentRequestS3bucketForAnalysisDataString = String
  type StartAssessmentRequestS3bucketForReportDataString = String
  type StartImportFileTaskRequestNameString = String
  type StartImportFileTaskRequestS3bucketForReportDataString = String
  type StatusMessage = String
  type TargetDatabaseEngines = js.Array[TargetDatabaseEngine]
  type TimeStamp = js.Date
  type TranformationToolDescription = String
  type TranformationToolInstallationLink = String
  type importS3Bucket = String
  type importS3Key = String

  final class MigrationHubStrategyOps(private val service: MigrationHubStrategy) extends AnyVal {

    @inline def getApplicationComponentDetailsFuture(params: GetApplicationComponentDetailsRequest): Future[GetApplicationComponentDetailsResponse] = service.getApplicationComponentDetails(params).promise().toFuture
    @inline def getApplicationComponentStrategiesFuture(params: GetApplicationComponentStrategiesRequest): Future[GetApplicationComponentStrategiesResponse] = service.getApplicationComponentStrategies(params).promise().toFuture
    @inline def getAssessmentFuture(params: GetAssessmentRequest): Future[GetAssessmentResponse] = service.getAssessment(params).promise().toFuture
    @inline def getImportFileTaskFuture(params: GetImportFileTaskRequest): Future[GetImportFileTaskResponse] = service.getImportFileTask(params).promise().toFuture
    @inline def getPortfolioPreferencesFuture(params: GetPortfolioPreferencesRequest): Future[GetPortfolioPreferencesResponse] = service.getPortfolioPreferences(params).promise().toFuture
    @inline def getPortfolioSummaryFuture(params: GetPortfolioSummaryRequest): Future[GetPortfolioSummaryResponse] = service.getPortfolioSummary(params).promise().toFuture
    @inline def getRecommendationReportDetailsFuture(params: GetRecommendationReportDetailsRequest): Future[GetRecommendationReportDetailsResponse] = service.getRecommendationReportDetails(params).promise().toFuture
    @inline def getServerDetailsFuture(params: GetServerDetailsRequest): Future[GetServerDetailsResponse] = service.getServerDetails(params).promise().toFuture
    @inline def getServerStrategiesFuture(params: GetServerStrategiesRequest): Future[GetServerStrategiesResponse] = service.getServerStrategies(params).promise().toFuture
    @inline def listApplicationComponentsFuture(params: ListApplicationComponentsRequest): Future[ListApplicationComponentsResponse] = service.listApplicationComponents(params).promise().toFuture
    @inline def listCollectorsFuture(params: ListCollectorsRequest): Future[ListCollectorsResponse] = service.listCollectors(params).promise().toFuture
    @inline def listImportFileTaskFuture(params: ListImportFileTaskRequest): Future[ListImportFileTaskResponse] = service.listImportFileTask(params).promise().toFuture
    @inline def listServersFuture(params: ListServersRequest): Future[ListServersResponse] = service.listServers(params).promise().toFuture
    @inline def putPortfolioPreferencesFuture(params: PutPortfolioPreferencesRequest): Future[PutPortfolioPreferencesResponse] = service.putPortfolioPreferences(params).promise().toFuture
    @inline def startAssessmentFuture(params: StartAssessmentRequest): Future[StartAssessmentResponse] = service.startAssessment(params).promise().toFuture
    @inline def startImportFileTaskFuture(params: StartImportFileTaskRequest): Future[StartImportFileTaskResponse] = service.startImportFileTask(params).promise().toFuture
    @inline def startRecommendationReportGenerationFuture(params: StartRecommendationReportGenerationRequest): Future[StartRecommendationReportGenerationResponse] = service.startRecommendationReportGeneration(params).promise().toFuture
    @inline def stopAssessmentFuture(params: StopAssessmentRequest): Future[StopAssessmentResponse] = service.stopAssessment(params).promise().toFuture
    @inline def updateApplicationComponentConfigFuture(params: UpdateApplicationComponentConfigRequest): Future[UpdateApplicationComponentConfigResponse] = service.updateApplicationComponentConfig(params).promise().toFuture
    @inline def updateServerConfigFuture(params: UpdateServerConfigRequest): Future[UpdateServerConfigResponse] = service.updateServerConfig(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/migrationhubstrategy", JSImport.Namespace, "AWS.MigrationHubStrategy")
  class MigrationHubStrategy() extends js.Object {
    def this(config: AWSConfig) = this()

    def getApplicationComponentDetails(params: GetApplicationComponentDetailsRequest): Request[GetApplicationComponentDetailsResponse] = js.native
    def getApplicationComponentStrategies(params: GetApplicationComponentStrategiesRequest): Request[GetApplicationComponentStrategiesResponse] = js.native
    def getAssessment(params: GetAssessmentRequest): Request[GetAssessmentResponse] = js.native
    def getImportFileTask(params: GetImportFileTaskRequest): Request[GetImportFileTaskResponse] = js.native
    def getPortfolioPreferences(params: GetPortfolioPreferencesRequest): Request[GetPortfolioPreferencesResponse] = js.native
    def getPortfolioSummary(params: GetPortfolioSummaryRequest): Request[GetPortfolioSummaryResponse] = js.native
    def getRecommendationReportDetails(params: GetRecommendationReportDetailsRequest): Request[GetRecommendationReportDetailsResponse] = js.native
    def getServerDetails(params: GetServerDetailsRequest): Request[GetServerDetailsResponse] = js.native
    def getServerStrategies(params: GetServerStrategiesRequest): Request[GetServerStrategiesResponse] = js.native
    def listApplicationComponents(params: ListApplicationComponentsRequest): Request[ListApplicationComponentsResponse] = js.native
    def listCollectors(params: ListCollectorsRequest): Request[ListCollectorsResponse] = js.native
    def listImportFileTask(params: ListImportFileTaskRequest): Request[ListImportFileTaskResponse] = js.native
    def listServers(params: ListServersRequest): Request[ListServersResponse] = js.native
    def putPortfolioPreferences(params: PutPortfolioPreferencesRequest): Request[PutPortfolioPreferencesResponse] = js.native
    def startAssessment(params: StartAssessmentRequest): Request[StartAssessmentResponse] = js.native
    def startImportFileTask(params: StartImportFileTaskRequest): Request[StartImportFileTaskResponse] = js.native
    def startRecommendationReportGeneration(params: StartRecommendationReportGenerationRequest): Request[StartRecommendationReportGenerationResponse] = js.native
    def stopAssessment(params: StopAssessmentRequest): Request[StopAssessmentResponse] = js.native
    def updateApplicationComponentConfig(params: UpdateApplicationComponentConfigRequest): Request[UpdateApplicationComponentConfigResponse] = js.native
    def updateServerConfig(params: UpdateServerConfigRequest): Request[UpdateServerConfigResponse] = js.native
  }
  object MigrationHubStrategy {
    @inline implicit def toOps(service: MigrationHubStrategy): MigrationHubStrategyOps = {
      new MigrationHubStrategyOps(service)
    }
  }

  /** Contains the summary of anti-patterns and their severity.
    */
  @js.native
  trait AntipatternSeveritySummary extends js.Object {
    var count: js.UndefOr[Int]
    var severity: js.UndefOr[Severity]
  }

  object AntipatternSeveritySummary {
    @inline
    def apply(
        count: js.UndefOr[Int] = js.undefined,
        severity: js.UndefOr[Severity] = js.undefined
    ): AntipatternSeveritySummary = {
      val __obj = js.Dynamic.literal()
      count.foreach(__v => __obj.updateDynamic("count")(__v.asInstanceOf[js.Any]))
      severity.foreach(__v => __obj.updateDynamic("severity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AntipatternSeveritySummary]
    }
  }

  /** Contains detailed information about an application component.
    */
  @js.native
  trait ApplicationComponentDetail extends js.Object {
    var analysisStatus: js.UndefOr[SrcCodeOrDbAnalysisStatus]
    var antipatternReportS3Object: js.UndefOr[S3Object]
    var antipatternReportStatus: js.UndefOr[AntipatternReportStatus]
    var antipatternReportStatusMessage: js.UndefOr[StatusMessage]
    var appType: js.UndefOr[AppType]
    var associatedServerId: js.UndefOr[ServerId]
    var databaseConfigDetail: js.UndefOr[DatabaseConfigDetail]
    var id: js.UndefOr[ResourceId]
    var inclusionStatus: js.UndefOr[InclusionStatus]
    var lastAnalyzedTimestamp: js.UndefOr[TimeStamp]
    var listAntipatternSeveritySummary: js.UndefOr[ListAntipatternSeveritySummary]
    var moreServerAssociationExists: js.UndefOr[Boolean]
    var name: js.UndefOr[ResourceName]
    var osDriver: js.UndefOr[String]
    var osVersion: js.UndefOr[String]
    var recommendationSet: js.UndefOr[RecommendationSet]
    var resourceSubType: js.UndefOr[ResourceSubType]
    var sourceCodeRepositories: js.UndefOr[SourceCodeRepositories]
    var statusMessage: js.UndefOr[StatusMessage]
  }

  object ApplicationComponentDetail {
    @inline
    def apply(
        analysisStatus: js.UndefOr[SrcCodeOrDbAnalysisStatus] = js.undefined,
        antipatternReportS3Object: js.UndefOr[S3Object] = js.undefined,
        antipatternReportStatus: js.UndefOr[AntipatternReportStatus] = js.undefined,
        antipatternReportStatusMessage: js.UndefOr[StatusMessage] = js.undefined,
        appType: js.UndefOr[AppType] = js.undefined,
        associatedServerId: js.UndefOr[ServerId] = js.undefined,
        databaseConfigDetail: js.UndefOr[DatabaseConfigDetail] = js.undefined,
        id: js.UndefOr[ResourceId] = js.undefined,
        inclusionStatus: js.UndefOr[InclusionStatus] = js.undefined,
        lastAnalyzedTimestamp: js.UndefOr[TimeStamp] = js.undefined,
        listAntipatternSeveritySummary: js.UndefOr[ListAntipatternSeveritySummary] = js.undefined,
        moreServerAssociationExists: js.UndefOr[Boolean] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        osDriver: js.UndefOr[String] = js.undefined,
        osVersion: js.UndefOr[String] = js.undefined,
        recommendationSet: js.UndefOr[RecommendationSet] = js.undefined,
        resourceSubType: js.UndefOr[ResourceSubType] = js.undefined,
        sourceCodeRepositories: js.UndefOr[SourceCodeRepositories] = js.undefined,
        statusMessage: js.UndefOr[StatusMessage] = js.undefined
    ): ApplicationComponentDetail = {
      val __obj = js.Dynamic.literal()
      analysisStatus.foreach(__v => __obj.updateDynamic("analysisStatus")(__v.asInstanceOf[js.Any]))
      antipatternReportS3Object.foreach(__v => __obj.updateDynamic("antipatternReportS3Object")(__v.asInstanceOf[js.Any]))
      antipatternReportStatus.foreach(__v => __obj.updateDynamic("antipatternReportStatus")(__v.asInstanceOf[js.Any]))
      antipatternReportStatusMessage.foreach(__v => __obj.updateDynamic("antipatternReportStatusMessage")(__v.asInstanceOf[js.Any]))
      appType.foreach(__v => __obj.updateDynamic("appType")(__v.asInstanceOf[js.Any]))
      associatedServerId.foreach(__v => __obj.updateDynamic("associatedServerId")(__v.asInstanceOf[js.Any]))
      databaseConfigDetail.foreach(__v => __obj.updateDynamic("databaseConfigDetail")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      inclusionStatus.foreach(__v => __obj.updateDynamic("inclusionStatus")(__v.asInstanceOf[js.Any]))
      lastAnalyzedTimestamp.foreach(__v => __obj.updateDynamic("lastAnalyzedTimestamp")(__v.asInstanceOf[js.Any]))
      listAntipatternSeveritySummary.foreach(__v => __obj.updateDynamic("listAntipatternSeveritySummary")(__v.asInstanceOf[js.Any]))
      moreServerAssociationExists.foreach(__v => __obj.updateDynamic("moreServerAssociationExists")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      osDriver.foreach(__v => __obj.updateDynamic("osDriver")(__v.asInstanceOf[js.Any]))
      osVersion.foreach(__v => __obj.updateDynamic("osVersion")(__v.asInstanceOf[js.Any]))
      recommendationSet.foreach(__v => __obj.updateDynamic("recommendationSet")(__v.asInstanceOf[js.Any]))
      resourceSubType.foreach(__v => __obj.updateDynamic("resourceSubType")(__v.asInstanceOf[js.Any]))
      sourceCodeRepositories.foreach(__v => __obj.updateDynamic("sourceCodeRepositories")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationComponentDetail]
    }
  }

  /** Contains information about a strategy recommendation for an application component.
    */
  @js.native
  trait ApplicationComponentStrategy extends js.Object {
    var isPreferred: js.UndefOr[Boolean]
    var recommendation: js.UndefOr[RecommendationSet]
    var status: js.UndefOr[StrategyRecommendation]
  }

  object ApplicationComponentStrategy {
    @inline
    def apply(
        isPreferred: js.UndefOr[Boolean] = js.undefined,
        recommendation: js.UndefOr[RecommendationSet] = js.undefined,
        status: js.UndefOr[StrategyRecommendation] = js.undefined
    ): ApplicationComponentStrategy = {
      val __obj = js.Dynamic.literal()
      isPreferred.foreach(__v => __obj.updateDynamic("isPreferred")(__v.asInstanceOf[js.Any]))
      recommendation.foreach(__v => __obj.updateDynamic("recommendation")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationComponentStrategy]
    }
  }

  /** Contains the summary of application components.
    */
  @js.native
  trait ApplicationComponentSummary extends js.Object {
    var appType: js.UndefOr[AppType]
    var count: js.UndefOr[Int]
  }

  object ApplicationComponentSummary {
    @inline
    def apply(
        appType: js.UndefOr[AppType] = js.undefined,
        count: js.UndefOr[Int] = js.undefined
    ): ApplicationComponentSummary = {
      val __obj = js.Dynamic.literal()
      appType.foreach(__v => __obj.updateDynamic("appType")(__v.asInstanceOf[js.Any]))
      count.foreach(__v => __obj.updateDynamic("count")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationComponentSummary]
    }
  }

  /** Application preferences that you specify.
    */
  @js.native
  trait ApplicationPreferences extends js.Object {
    var managementPreference: js.UndefOr[ManagementPreference]
  }

  object ApplicationPreferences {
    @inline
    def apply(
        managementPreference: js.UndefOr[ManagementPreference] = js.undefined
    ): ApplicationPreferences = {
      val __obj = js.Dynamic.literal()
      managementPreference.foreach(__v => __obj.updateDynamic("managementPreference")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationPreferences]
    }
  }

  /** Contains the summary of the assessment results.
    */
  @js.native
  trait AssessmentSummary extends js.Object {
    var antipatternReportS3Object: js.UndefOr[S3Object]
    var antipatternReportStatus: js.UndefOr[AntipatternReportStatus]
    var antipatternReportStatusMessage: js.UndefOr[StatusMessage]
    var lastAnalyzedTimestamp: js.UndefOr[TimeStamp]
    var listAntipatternSeveritySummary: js.UndefOr[ListAntipatternSeveritySummary]
    var listApplicationComponentStrategySummary: js.UndefOr[ListStrategySummary]
    var listApplicationComponentSummary: js.UndefOr[ListApplicationComponentSummary]
    var listServerStrategySummary: js.UndefOr[ListStrategySummary]
    var listServerSummary: js.UndefOr[ListServerSummary]
  }

  object AssessmentSummary {
    @inline
    def apply(
        antipatternReportS3Object: js.UndefOr[S3Object] = js.undefined,
        antipatternReportStatus: js.UndefOr[AntipatternReportStatus] = js.undefined,
        antipatternReportStatusMessage: js.UndefOr[StatusMessage] = js.undefined,
        lastAnalyzedTimestamp: js.UndefOr[TimeStamp] = js.undefined,
        listAntipatternSeveritySummary: js.UndefOr[ListAntipatternSeveritySummary] = js.undefined,
        listApplicationComponentStrategySummary: js.UndefOr[ListStrategySummary] = js.undefined,
        listApplicationComponentSummary: js.UndefOr[ListApplicationComponentSummary] = js.undefined,
        listServerStrategySummary: js.UndefOr[ListStrategySummary] = js.undefined,
        listServerSummary: js.UndefOr[ListServerSummary] = js.undefined
    ): AssessmentSummary = {
      val __obj = js.Dynamic.literal()
      antipatternReportS3Object.foreach(__v => __obj.updateDynamic("antipatternReportS3Object")(__v.asInstanceOf[js.Any]))
      antipatternReportStatus.foreach(__v => __obj.updateDynamic("antipatternReportStatus")(__v.asInstanceOf[js.Any]))
      antipatternReportStatusMessage.foreach(__v => __obj.updateDynamic("antipatternReportStatusMessage")(__v.asInstanceOf[js.Any]))
      lastAnalyzedTimestamp.foreach(__v => __obj.updateDynamic("lastAnalyzedTimestamp")(__v.asInstanceOf[js.Any]))
      listAntipatternSeveritySummary.foreach(__v => __obj.updateDynamic("listAntipatternSeveritySummary")(__v.asInstanceOf[js.Any]))
      listApplicationComponentStrategySummary.foreach(__v => __obj.updateDynamic("listApplicationComponentStrategySummary")(__v.asInstanceOf[js.Any]))
      listApplicationComponentSummary.foreach(__v => __obj.updateDynamic("listApplicationComponentSummary")(__v.asInstanceOf[js.Any]))
      listServerStrategySummary.foreach(__v => __obj.updateDynamic("listServerStrategySummary")(__v.asInstanceOf[js.Any]))
      listServerSummary.foreach(__v => __obj.updateDynamic("listServerSummary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssessmentSummary]
    }
  }

  /** Object containing details about applications as defined in Application Discovery Service.
    */
  @js.native
  trait AssociatedApplication extends js.Object {
    var id: js.UndefOr[String]
    var name: js.UndefOr[String]
  }

  object AssociatedApplication {
    @inline
    def apply(
        id: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined
    ): AssociatedApplication = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociatedApplication]
    }
  }

  /** Object containing the choice of application destination that you specify.
    */
  @js.native
  trait AwsManagedResources extends js.Object {
    var targetDestination: AwsManagedTargetDestinations
  }

  object AwsManagedResources {
    @inline
    def apply(
        targetDestination: AwsManagedTargetDestinations
    ): AwsManagedResources = {
      val __obj = js.Dynamic.literal(
        "targetDestination" -> targetDestination.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AwsManagedResources]
    }
  }

  /** Business goals that you specify.
    */
  @js.native
  trait BusinessGoals extends js.Object {
    var licenseCostReduction: js.UndefOr[BusinessGoalsInteger]
    var modernizeInfrastructureWithCloudNativeTechnologies: js.UndefOr[BusinessGoalsInteger]
    var reduceOperationalOverheadWithManagedServices: js.UndefOr[BusinessGoalsInteger]
    var speedOfMigration: js.UndefOr[BusinessGoalsInteger]
  }

  object BusinessGoals {
    @inline
    def apply(
        licenseCostReduction: js.UndefOr[BusinessGoalsInteger] = js.undefined,
        modernizeInfrastructureWithCloudNativeTechnologies: js.UndefOr[BusinessGoalsInteger] = js.undefined,
        reduceOperationalOverheadWithManagedServices: js.UndefOr[BusinessGoalsInteger] = js.undefined,
        speedOfMigration: js.UndefOr[BusinessGoalsInteger] = js.undefined
    ): BusinessGoals = {
      val __obj = js.Dynamic.literal()
      licenseCostReduction.foreach(__v => __obj.updateDynamic("licenseCostReduction")(__v.asInstanceOf[js.Any]))
      modernizeInfrastructureWithCloudNativeTechnologies.foreach(__v => __obj.updateDynamic("modernizeInfrastructureWithCloudNativeTechnologies")(__v.asInstanceOf[js.Any]))
      reduceOperationalOverheadWithManagedServices.foreach(__v => __obj.updateDynamic("reduceOperationalOverheadWithManagedServices")(__v.asInstanceOf[js.Any]))
      speedOfMigration.foreach(__v => __obj.updateDynamic("speedOfMigration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BusinessGoals]
    }
  }

  /** Process data collector that runs in the environment that you specify.
    */
  @js.native
  trait Collector extends js.Object {
    var collectorHealth: js.UndefOr[CollectorHealth]
    var collectorId: js.UndefOr[String]
    var collectorVersion: js.UndefOr[String]
    var hostName: js.UndefOr[String]
    var ipAddress: js.UndefOr[String]
    var lastActivityTimeStamp: js.UndefOr[String]
    var registeredTimeStamp: js.UndefOr[String]
  }

  object Collector {
    @inline
    def apply(
        collectorHealth: js.UndefOr[CollectorHealth] = js.undefined,
        collectorId: js.UndefOr[String] = js.undefined,
        collectorVersion: js.UndefOr[String] = js.undefined,
        hostName: js.UndefOr[String] = js.undefined,
        ipAddress: js.UndefOr[String] = js.undefined,
        lastActivityTimeStamp: js.UndefOr[String] = js.undefined,
        registeredTimeStamp: js.UndefOr[String] = js.undefined
    ): Collector = {
      val __obj = js.Dynamic.literal()
      collectorHealth.foreach(__v => __obj.updateDynamic("collectorHealth")(__v.asInstanceOf[js.Any]))
      collectorId.foreach(__v => __obj.updateDynamic("collectorId")(__v.asInstanceOf[js.Any]))
      collectorVersion.foreach(__v => __obj.updateDynamic("collectorVersion")(__v.asInstanceOf[js.Any]))
      hostName.foreach(__v => __obj.updateDynamic("hostName")(__v.asInstanceOf[js.Any]))
      ipAddress.foreach(__v => __obj.updateDynamic("ipAddress")(__v.asInstanceOf[js.Any]))
      lastActivityTimeStamp.foreach(__v => __obj.updateDynamic("lastActivityTimeStamp")(__v.asInstanceOf[js.Any]))
      registeredTimeStamp.foreach(__v => __obj.updateDynamic("registeredTimeStamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Collector]
    }
  }

  /** Detailed information about an assessment.
    */
  @js.native
  trait DataCollectionDetails extends js.Object {
    var completionTime: js.UndefOr[TimeStamp]
    var failed: js.UndefOr[Int]
    var inProgress: js.UndefOr[Int]
    var servers: js.UndefOr[Int]
    var startTime: js.UndefOr[TimeStamp]
    var status: js.UndefOr[AssessmentStatus]
    var success: js.UndefOr[Int]
  }

  object DataCollectionDetails {
    @inline
    def apply(
        completionTime: js.UndefOr[TimeStamp] = js.undefined,
        failed: js.UndefOr[Int] = js.undefined,
        inProgress: js.UndefOr[Int] = js.undefined,
        servers: js.UndefOr[Int] = js.undefined,
        startTime: js.UndefOr[TimeStamp] = js.undefined,
        status: js.UndefOr[AssessmentStatus] = js.undefined,
        success: js.UndefOr[Int] = js.undefined
    ): DataCollectionDetails = {
      val __obj = js.Dynamic.literal()
      completionTime.foreach(__v => __obj.updateDynamic("completionTime")(__v.asInstanceOf[js.Any]))
      failed.foreach(__v => __obj.updateDynamic("failed")(__v.asInstanceOf[js.Any]))
      inProgress.foreach(__v => __obj.updateDynamic("inProgress")(__v.asInstanceOf[js.Any]))
      servers.foreach(__v => __obj.updateDynamic("servers")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      success.foreach(__v => __obj.updateDynamic("success")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataCollectionDetails]
    }
  }

  /** Configuration information used for assessing databases.
    */
  @js.native
  trait DatabaseConfigDetail extends js.Object {
    var secretName: js.UndefOr[String]
  }

  object DatabaseConfigDetail {
    @inline
    def apply(
        secretName: js.UndefOr[String] = js.undefined
    ): DatabaseConfigDetail = {
      val __obj = js.Dynamic.literal()
      secretName.foreach(__v => __obj.updateDynamic("secretName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatabaseConfigDetail]
    }
  }

  /** Preferences for migrating a database to AWS.
    */
  @js.native
  trait DatabaseMigrationPreference extends js.Object {
    var heterogeneous: js.UndefOr[Heterogeneous]
    var homogeneous: js.UndefOr[Homogeneous]
    var noPreference: js.UndefOr[NoDatabaseMigrationPreference]
  }

  object DatabaseMigrationPreference {
    @inline
    def apply(
        heterogeneous: js.UndefOr[Heterogeneous] = js.undefined,
        homogeneous: js.UndefOr[Homogeneous] = js.undefined,
        noPreference: js.UndefOr[NoDatabaseMigrationPreference] = js.undefined
    ): DatabaseMigrationPreference = {
      val __obj = js.Dynamic.literal()
      heterogeneous.foreach(__v => __obj.updateDynamic("heterogeneous")(__v.asInstanceOf[js.Any]))
      homogeneous.foreach(__v => __obj.updateDynamic("homogeneous")(__v.asInstanceOf[js.Any]))
      noPreference.foreach(__v => __obj.updateDynamic("noPreference")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatabaseMigrationPreference]
    }
  }

  /** Preferences on managing your databases on AWS.
    */
  @js.native
  trait DatabasePreferences extends js.Object {
    var databaseManagementPreference: js.UndefOr[DatabaseManagementPreference]
    var databaseMigrationPreference: js.UndefOr[DatabaseMigrationPreference]
  }

  object DatabasePreferences {
    @inline
    def apply(
        databaseManagementPreference: js.UndefOr[DatabaseManagementPreference] = js.undefined,
        databaseMigrationPreference: js.UndefOr[DatabaseMigrationPreference] = js.undefined
    ): DatabasePreferences = {
      val __obj = js.Dynamic.literal()
      databaseManagementPreference.foreach(__v => __obj.updateDynamic("databaseManagementPreference")(__v.asInstanceOf[js.Any]))
      databaseMigrationPreference.foreach(__v => __obj.updateDynamic("databaseMigrationPreference")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DatabasePreferences]
    }
  }

  @js.native
  trait GetApplicationComponentDetailsRequest extends js.Object {
    var applicationComponentId: ApplicationComponentId
  }

  object GetApplicationComponentDetailsRequest {
    @inline
    def apply(
        applicationComponentId: ApplicationComponentId
    ): GetApplicationComponentDetailsRequest = {
      val __obj = js.Dynamic.literal(
        "applicationComponentId" -> applicationComponentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetApplicationComponentDetailsRequest]
    }
  }

  @js.native
  trait GetApplicationComponentDetailsResponse extends js.Object {
    var applicationComponentDetail: js.UndefOr[ApplicationComponentDetail]
    var associatedApplications: js.UndefOr[AssociatedApplications]
    var associatedServerIds: js.UndefOr[AssociatedServerIDs]
    var moreApplicationResource: js.UndefOr[Boolean]
  }

  object GetApplicationComponentDetailsResponse {
    @inline
    def apply(
        applicationComponentDetail: js.UndefOr[ApplicationComponentDetail] = js.undefined,
        associatedApplications: js.UndefOr[AssociatedApplications] = js.undefined,
        associatedServerIds: js.UndefOr[AssociatedServerIDs] = js.undefined,
        moreApplicationResource: js.UndefOr[Boolean] = js.undefined
    ): GetApplicationComponentDetailsResponse = {
      val __obj = js.Dynamic.literal()
      applicationComponentDetail.foreach(__v => __obj.updateDynamic("applicationComponentDetail")(__v.asInstanceOf[js.Any]))
      associatedApplications.foreach(__v => __obj.updateDynamic("associatedApplications")(__v.asInstanceOf[js.Any]))
      associatedServerIds.foreach(__v => __obj.updateDynamic("associatedServerIds")(__v.asInstanceOf[js.Any]))
      moreApplicationResource.foreach(__v => __obj.updateDynamic("moreApplicationResource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetApplicationComponentDetailsResponse]
    }
  }

  @js.native
  trait GetApplicationComponentStrategiesRequest extends js.Object {
    var applicationComponentId: ApplicationComponentId
  }

  object GetApplicationComponentStrategiesRequest {
    @inline
    def apply(
        applicationComponentId: ApplicationComponentId
    ): GetApplicationComponentStrategiesRequest = {
      val __obj = js.Dynamic.literal(
        "applicationComponentId" -> applicationComponentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetApplicationComponentStrategiesRequest]
    }
  }

  @js.native
  trait GetApplicationComponentStrategiesResponse extends js.Object {
    var applicationComponentStrategies: js.UndefOr[ApplicationComponentStrategies]
  }

  object GetApplicationComponentStrategiesResponse {
    @inline
    def apply(
        applicationComponentStrategies: js.UndefOr[ApplicationComponentStrategies] = js.undefined
    ): GetApplicationComponentStrategiesResponse = {
      val __obj = js.Dynamic.literal()
      applicationComponentStrategies.foreach(__v => __obj.updateDynamic("applicationComponentStrategies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetApplicationComponentStrategiesResponse]
    }
  }

  @js.native
  trait GetAssessmentRequest extends js.Object {
    var id: AsyncTaskId
  }

  object GetAssessmentRequest {
    @inline
    def apply(
        id: AsyncTaskId
    ): GetAssessmentRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetAssessmentRequest]
    }
  }

  @js.native
  trait GetAssessmentResponse extends js.Object {
    var dataCollectionDetails: js.UndefOr[DataCollectionDetails]
    var id: js.UndefOr[AsyncTaskId]
  }

  object GetAssessmentResponse {
    @inline
    def apply(
        dataCollectionDetails: js.UndefOr[DataCollectionDetails] = js.undefined,
        id: js.UndefOr[AsyncTaskId] = js.undefined
    ): GetAssessmentResponse = {
      val __obj = js.Dynamic.literal()
      dataCollectionDetails.foreach(__v => __obj.updateDynamic("dataCollectionDetails")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAssessmentResponse]
    }
  }

  @js.native
  trait GetImportFileTaskRequest extends js.Object {
    var id: String
  }

  object GetImportFileTaskRequest {
    @inline
    def apply(
        id: String
    ): GetImportFileTaskRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetImportFileTaskRequest]
    }
  }

  @js.native
  trait GetImportFileTaskResponse extends js.Object {
    var completionTime: js.UndefOr[TimeStamp]
    var id: js.UndefOr[String]
    var importName: js.UndefOr[String]
    var inputS3Bucket: js.UndefOr[importS3Bucket]
    var inputS3Key: js.UndefOr[importS3Key]
    var numberOfRecordsFailed: js.UndefOr[Int]
    var numberOfRecordsSuccess: js.UndefOr[Int]
    var startTime: js.UndefOr[TimeStamp]
    var status: js.UndefOr[ImportFileTaskStatus]
    var statusReportS3Bucket: js.UndefOr[importS3Bucket]
    var statusReportS3Key: js.UndefOr[importS3Key]
  }

  object GetImportFileTaskResponse {
    @inline
    def apply(
        completionTime: js.UndefOr[TimeStamp] = js.undefined,
        id: js.UndefOr[String] = js.undefined,
        importName: js.UndefOr[String] = js.undefined,
        inputS3Bucket: js.UndefOr[importS3Bucket] = js.undefined,
        inputS3Key: js.UndefOr[importS3Key] = js.undefined,
        numberOfRecordsFailed: js.UndefOr[Int] = js.undefined,
        numberOfRecordsSuccess: js.UndefOr[Int] = js.undefined,
        startTime: js.UndefOr[TimeStamp] = js.undefined,
        status: js.UndefOr[ImportFileTaskStatus] = js.undefined,
        statusReportS3Bucket: js.UndefOr[importS3Bucket] = js.undefined,
        statusReportS3Key: js.UndefOr[importS3Key] = js.undefined
    ): GetImportFileTaskResponse = {
      val __obj = js.Dynamic.literal()
      completionTime.foreach(__v => __obj.updateDynamic("completionTime")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      importName.foreach(__v => __obj.updateDynamic("importName")(__v.asInstanceOf[js.Any]))
      inputS3Bucket.foreach(__v => __obj.updateDynamic("inputS3Bucket")(__v.asInstanceOf[js.Any]))
      inputS3Key.foreach(__v => __obj.updateDynamic("inputS3Key")(__v.asInstanceOf[js.Any]))
      numberOfRecordsFailed.foreach(__v => __obj.updateDynamic("numberOfRecordsFailed")(__v.asInstanceOf[js.Any]))
      numberOfRecordsSuccess.foreach(__v => __obj.updateDynamic("numberOfRecordsSuccess")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusReportS3Bucket.foreach(__v => __obj.updateDynamic("statusReportS3Bucket")(__v.asInstanceOf[js.Any]))
      statusReportS3Key.foreach(__v => __obj.updateDynamic("statusReportS3Key")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetImportFileTaskResponse]
    }
  }

  @js.native
  trait GetPortfolioPreferencesRequest extends js.Object

  object GetPortfolioPreferencesRequest {
    @inline
    def apply(): GetPortfolioPreferencesRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetPortfolioPreferencesRequest]
    }
  }

  @js.native
  trait GetPortfolioPreferencesResponse extends js.Object {
    var applicationPreferences: js.UndefOr[ApplicationPreferences]
    var databasePreferences: js.UndefOr[DatabasePreferences]
    var prioritizeBusinessGoals: js.UndefOr[PrioritizeBusinessGoals]
  }

  object GetPortfolioPreferencesResponse {
    @inline
    def apply(
        applicationPreferences: js.UndefOr[ApplicationPreferences] = js.undefined,
        databasePreferences: js.UndefOr[DatabasePreferences] = js.undefined,
        prioritizeBusinessGoals: js.UndefOr[PrioritizeBusinessGoals] = js.undefined
    ): GetPortfolioPreferencesResponse = {
      val __obj = js.Dynamic.literal()
      applicationPreferences.foreach(__v => __obj.updateDynamic("applicationPreferences")(__v.asInstanceOf[js.Any]))
      databasePreferences.foreach(__v => __obj.updateDynamic("databasePreferences")(__v.asInstanceOf[js.Any]))
      prioritizeBusinessGoals.foreach(__v => __obj.updateDynamic("prioritizeBusinessGoals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPortfolioPreferencesResponse]
    }
  }

  @js.native
  trait GetPortfolioSummaryRequest extends js.Object

  object GetPortfolioSummaryRequest {
    @inline
    def apply(): GetPortfolioSummaryRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetPortfolioSummaryRequest]
    }
  }

  @js.native
  trait GetPortfolioSummaryResponse extends js.Object {
    var assessmentSummary: js.UndefOr[AssessmentSummary]
  }

  object GetPortfolioSummaryResponse {
    @inline
    def apply(
        assessmentSummary: js.UndefOr[AssessmentSummary] = js.undefined
    ): GetPortfolioSummaryResponse = {
      val __obj = js.Dynamic.literal()
      assessmentSummary.foreach(__v => __obj.updateDynamic("assessmentSummary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPortfolioSummaryResponse]
    }
  }

  @js.native
  trait GetRecommendationReportDetailsRequest extends js.Object {
    var id: RecommendationTaskId
  }

  object GetRecommendationReportDetailsRequest {
    @inline
    def apply(
        id: RecommendationTaskId
    ): GetRecommendationReportDetailsRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRecommendationReportDetailsRequest]
    }
  }

  @js.native
  trait GetRecommendationReportDetailsResponse extends js.Object {
    var id: js.UndefOr[RecommendationTaskId]
    var recommendationReportDetails: js.UndefOr[RecommendationReportDetails]
  }

  object GetRecommendationReportDetailsResponse {
    @inline
    def apply(
        id: js.UndefOr[RecommendationTaskId] = js.undefined,
        recommendationReportDetails: js.UndefOr[RecommendationReportDetails] = js.undefined
    ): GetRecommendationReportDetailsResponse = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      recommendationReportDetails.foreach(__v => __obj.updateDynamic("recommendationReportDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRecommendationReportDetailsResponse]
    }
  }

  @js.native
  trait GetServerDetailsRequest extends js.Object {
    var serverId: ServerId
    var maxResults: js.UndefOr[MaxResult]
    var nextToken: js.UndefOr[NextToken]
  }

  object GetServerDetailsRequest {
    @inline
    def apply(
        serverId: ServerId,
        maxResults: js.UndefOr[MaxResult] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetServerDetailsRequest = {
      val __obj = js.Dynamic.literal(
        "serverId" -> serverId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetServerDetailsRequest]
    }
  }

  @js.native
  trait GetServerDetailsResponse extends js.Object {
    var associatedApplications: js.UndefOr[AssociatedApplications]
    var nextToken: js.UndefOr[String]
    var serverDetail: js.UndefOr[ServerDetail]
  }

  object GetServerDetailsResponse {
    @inline
    def apply(
        associatedApplications: js.UndefOr[AssociatedApplications] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined,
        serverDetail: js.UndefOr[ServerDetail] = js.undefined
    ): GetServerDetailsResponse = {
      val __obj = js.Dynamic.literal()
      associatedApplications.foreach(__v => __obj.updateDynamic("associatedApplications")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      serverDetail.foreach(__v => __obj.updateDynamic("serverDetail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetServerDetailsResponse]
    }
  }

  @js.native
  trait GetServerStrategiesRequest extends js.Object {
    var serverId: ServerId
  }

  object GetServerStrategiesRequest {
    @inline
    def apply(
        serverId: ServerId
    ): GetServerStrategiesRequest = {
      val __obj = js.Dynamic.literal(
        "serverId" -> serverId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetServerStrategiesRequest]
    }
  }

  @js.native
  trait GetServerStrategiesResponse extends js.Object {
    var serverStrategies: js.UndefOr[ServerStrategies]
  }

  object GetServerStrategiesResponse {
    @inline
    def apply(
        serverStrategies: js.UndefOr[ServerStrategies] = js.undefined
    ): GetServerStrategiesResponse = {
      val __obj = js.Dynamic.literal()
      serverStrategies.foreach(__v => __obj.updateDynamic("serverStrategies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetServerStrategiesResponse]
    }
  }

  /** The object containing information about distinct imports or groups for Strategy Recommendations.
    */
  @js.native
  trait Group extends js.Object {
    var name: js.UndefOr[GroupName]
    var value: js.UndefOr[String]
  }

  object Group {
    @inline
    def apply(
        name: js.UndefOr[GroupName] = js.undefined,
        value: js.UndefOr[String] = js.undefined
    ): Group = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Group]
    }
  }

  /** The object containing details about heterogeneous database preferences.
    */
  @js.native
  trait Heterogeneous extends js.Object {
    var targetDatabaseEngine: HeterogeneousTargetDatabaseEngines
  }

  object Heterogeneous {
    @inline
    def apply(
        targetDatabaseEngine: HeterogeneousTargetDatabaseEngines
    ): Heterogeneous = {
      val __obj = js.Dynamic.literal(
        "targetDatabaseEngine" -> targetDatabaseEngine.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Heterogeneous]
    }
  }

  /** The object containing details about homogeneous database preferences.
    */
  @js.native
  trait Homogeneous extends js.Object {
    var targetDatabaseEngine: js.UndefOr[HomogeneousTargetDatabaseEngines]
  }

  object Homogeneous {
    @inline
    def apply(
        targetDatabaseEngine: js.UndefOr[HomogeneousTargetDatabaseEngines] = js.undefined
    ): Homogeneous = {
      val __obj = js.Dynamic.literal()
      targetDatabaseEngine.foreach(__v => __obj.updateDynamic("targetDatabaseEngine")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Homogeneous]
    }
  }

  /** Information about the import file tasks you request.
    */
  @js.native
  trait ImportFileTaskInformation extends js.Object {
    var completionTime: js.UndefOr[TimeStamp]
    var id: js.UndefOr[String]
    var importName: js.UndefOr[String]
    var inputS3Bucket: js.UndefOr[importS3Bucket]
    var inputS3Key: js.UndefOr[importS3Key]
    var numberOfRecordsFailed: js.UndefOr[Int]
    var numberOfRecordsSuccess: js.UndefOr[Int]
    var startTime: js.UndefOr[TimeStamp]
    var status: js.UndefOr[ImportFileTaskStatus]
    var statusReportS3Bucket: js.UndefOr[importS3Bucket]
    var statusReportS3Key: js.UndefOr[importS3Key]
  }

  object ImportFileTaskInformation {
    @inline
    def apply(
        completionTime: js.UndefOr[TimeStamp] = js.undefined,
        id: js.UndefOr[String] = js.undefined,
        importName: js.UndefOr[String] = js.undefined,
        inputS3Bucket: js.UndefOr[importS3Bucket] = js.undefined,
        inputS3Key: js.UndefOr[importS3Key] = js.undefined,
        numberOfRecordsFailed: js.UndefOr[Int] = js.undefined,
        numberOfRecordsSuccess: js.UndefOr[Int] = js.undefined,
        startTime: js.UndefOr[TimeStamp] = js.undefined,
        status: js.UndefOr[ImportFileTaskStatus] = js.undefined,
        statusReportS3Bucket: js.UndefOr[importS3Bucket] = js.undefined,
        statusReportS3Key: js.UndefOr[importS3Key] = js.undefined
    ): ImportFileTaskInformation = {
      val __obj = js.Dynamic.literal()
      completionTime.foreach(__v => __obj.updateDynamic("completionTime")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      importName.foreach(__v => __obj.updateDynamic("importName")(__v.asInstanceOf[js.Any]))
      inputS3Bucket.foreach(__v => __obj.updateDynamic("inputS3Bucket")(__v.asInstanceOf[js.Any]))
      inputS3Key.foreach(__v => __obj.updateDynamic("inputS3Key")(__v.asInstanceOf[js.Any]))
      numberOfRecordsFailed.foreach(__v => __obj.updateDynamic("numberOfRecordsFailed")(__v.asInstanceOf[js.Any]))
      numberOfRecordsSuccess.foreach(__v => __obj.updateDynamic("numberOfRecordsSuccess")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusReportS3Bucket.foreach(__v => __obj.updateDynamic("statusReportS3Bucket")(__v.asInstanceOf[js.Any]))
      statusReportS3Key.foreach(__v => __obj.updateDynamic("statusReportS3Key")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportFileTaskInformation]
    }
  }

  @js.native
  trait ListApplicationComponentsRequest extends js.Object {
    var applicationComponentCriteria: js.UndefOr[ApplicationComponentCriteria]
    var filterValue: js.UndefOr[ListApplicationComponentsRequestFilterValueString]
    var groupIdFilter: js.UndefOr[GroupIds]
    var maxResults: js.UndefOr[MaxResult]
    var nextToken: js.UndefOr[NextToken]
    var sort: js.UndefOr[SortOrder]
  }

  object ListApplicationComponentsRequest {
    @inline
    def apply(
        applicationComponentCriteria: js.UndefOr[ApplicationComponentCriteria] = js.undefined,
        filterValue: js.UndefOr[ListApplicationComponentsRequestFilterValueString] = js.undefined,
        groupIdFilter: js.UndefOr[GroupIds] = js.undefined,
        maxResults: js.UndefOr[MaxResult] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        sort: js.UndefOr[SortOrder] = js.undefined
    ): ListApplicationComponentsRequest = {
      val __obj = js.Dynamic.literal()
      applicationComponentCriteria.foreach(__v => __obj.updateDynamic("applicationComponentCriteria")(__v.asInstanceOf[js.Any]))
      filterValue.foreach(__v => __obj.updateDynamic("filterValue")(__v.asInstanceOf[js.Any]))
      groupIdFilter.foreach(__v => __obj.updateDynamic("groupIdFilter")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      sort.foreach(__v => __obj.updateDynamic("sort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationComponentsRequest]
    }
  }

  @js.native
  trait ListApplicationComponentsResponse extends js.Object {
    var applicationComponentInfos: js.UndefOr[ApplicationComponentDetails]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListApplicationComponentsResponse {
    @inline
    def apply(
        applicationComponentInfos: js.UndefOr[ApplicationComponentDetails] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListApplicationComponentsResponse = {
      val __obj = js.Dynamic.literal()
      applicationComponentInfos.foreach(__v => __obj.updateDynamic("applicationComponentInfos")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationComponentsResponse]
    }
  }

  @js.native
  trait ListCollectorsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResult]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListCollectorsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResult] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCollectorsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCollectorsRequest]
    }
  }

  @js.native
  trait ListCollectorsResponse extends js.Object {
    var Collectors: js.UndefOr[Collectors]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListCollectorsResponse {
    @inline
    def apply(
        Collectors: js.UndefOr[Collectors] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListCollectorsResponse = {
      val __obj = js.Dynamic.literal()
      Collectors.foreach(__v => __obj.updateDynamic("Collectors")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListCollectorsResponse]
    }
  }

  @js.native
  trait ListImportFileTaskRequest extends js.Object {
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[String]
  }

  object ListImportFileTaskRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[Int] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListImportFileTaskRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListImportFileTaskRequest]
    }
  }

  @js.native
  trait ListImportFileTaskResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var taskInfos: js.UndefOr[ListImportFileTaskInformation]
  }

  object ListImportFileTaskResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[String] = js.undefined,
        taskInfos: js.UndefOr[ListImportFileTaskInformation] = js.undefined
    ): ListImportFileTaskResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      taskInfos.foreach(__v => __obj.updateDynamic("taskInfos")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListImportFileTaskResponse]
    }
  }

  @js.native
  trait ListServersRequest extends js.Object {
    var filterValue: js.UndefOr[String]
    var groupIdFilter: js.UndefOr[GroupIds]
    var maxResults: js.UndefOr[MaxResult]
    var nextToken: js.UndefOr[NextToken]
    var serverCriteria: js.UndefOr[ServerCriteria]
    var sort: js.UndefOr[SortOrder]
  }

  object ListServersRequest {
    @inline
    def apply(
        filterValue: js.UndefOr[String] = js.undefined,
        groupIdFilter: js.UndefOr[GroupIds] = js.undefined,
        maxResults: js.UndefOr[MaxResult] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        serverCriteria: js.UndefOr[ServerCriteria] = js.undefined,
        sort: js.UndefOr[SortOrder] = js.undefined
    ): ListServersRequest = {
      val __obj = js.Dynamic.literal()
      filterValue.foreach(__v => __obj.updateDynamic("filterValue")(__v.asInstanceOf[js.Any]))
      groupIdFilter.foreach(__v => __obj.updateDynamic("groupIdFilter")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      serverCriteria.foreach(__v => __obj.updateDynamic("serverCriteria")(__v.asInstanceOf[js.Any]))
      sort.foreach(__v => __obj.updateDynamic("sort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServersRequest]
    }
  }

  @js.native
  trait ListServersResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var serverInfos: js.UndefOr[ServerDetails]
  }

  object ListServersResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        serverInfos: js.UndefOr[ServerDetails] = js.undefined
    ): ListServersResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      serverInfos.foreach(__v => __obj.updateDynamic("serverInfos")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServersResponse]
    }
  }

  /** Preferences for migrating an application to AWS.
    */
  @js.native
  trait ManagementPreference extends js.Object {
    var awsManagedResources: js.UndefOr[AwsManagedResources]
    var noPreference: js.UndefOr[NoManagementPreference]
    var selfManageResources: js.UndefOr[SelfManageResources]
  }

  object ManagementPreference {
    @inline
    def apply(
        awsManagedResources: js.UndefOr[AwsManagedResources] = js.undefined,
        noPreference: js.UndefOr[NoManagementPreference] = js.undefined,
        selfManageResources: js.UndefOr[SelfManageResources] = js.undefined
    ): ManagementPreference = {
      val __obj = js.Dynamic.literal()
      awsManagedResources.foreach(__v => __obj.updateDynamic("awsManagedResources")(__v.asInstanceOf[js.Any]))
      noPreference.foreach(__v => __obj.updateDynamic("noPreference")(__v.asInstanceOf[js.Any]))
      selfManageResources.foreach(__v => __obj.updateDynamic("selfManageResources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ManagementPreference]
    }
  }

  /** Information about the server's network for which the assessment was run.
    */
  @js.native
  trait NetworkInfo extends js.Object {
    var interfaceName: InterfaceName
    var ipAddress: IPAddress
    var macAddress: MacAddress
    var netMask: NetMask
  }

  object NetworkInfo {
    @inline
    def apply(
        interfaceName: InterfaceName,
        ipAddress: IPAddress,
        macAddress: MacAddress,
        netMask: NetMask
    ): NetworkInfo = {
      val __obj = js.Dynamic.literal(
        "interfaceName" -> interfaceName.asInstanceOf[js.Any],
        "ipAddress" -> ipAddress.asInstanceOf[js.Any],
        "macAddress" -> macAddress.asInstanceOf[js.Any],
        "netMask" -> netMask.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[NetworkInfo]
    }
  }

  /** The object containing details about database migration preferences, when you have no particular preference.
    */
  @js.native
  trait NoDatabaseMigrationPreference extends js.Object {
    var targetDatabaseEngine: TargetDatabaseEngines
  }

  object NoDatabaseMigrationPreference {
    @inline
    def apply(
        targetDatabaseEngine: TargetDatabaseEngines
    ): NoDatabaseMigrationPreference = {
      val __obj = js.Dynamic.literal(
        "targetDatabaseEngine" -> targetDatabaseEngine.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[NoDatabaseMigrationPreference]
    }
  }

  /** Object containing the choice of application destination that you specify.
    */
  @js.native
  trait NoManagementPreference extends js.Object {
    var targetDestination: NoPreferenceTargetDestinations
  }

  object NoManagementPreference {
    @inline
    def apply(
        targetDestination: NoPreferenceTargetDestinations
    ): NoManagementPreference = {
      val __obj = js.Dynamic.literal(
        "targetDestination" -> targetDestination.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[NoManagementPreference]
    }
  }

  /** Information about the operating system.
    */
  @js.native
  trait OSInfo extends js.Object {
    var `type`: js.UndefOr[OSType]
    var version: js.UndefOr[OSVersion]
  }

  object OSInfo {
    @inline
    def apply(
        `type`: js.UndefOr[OSType] = js.undefined,
        version: js.UndefOr[OSVersion] = js.undefined
    ): OSInfo = {
      val __obj = js.Dynamic.literal()
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OSInfo]
    }
  }

  /** Rank of business goals based on priority.
    */
  @js.native
  trait PrioritizeBusinessGoals extends js.Object {
    var businessGoals: js.UndefOr[BusinessGoals]
  }

  object PrioritizeBusinessGoals {
    @inline
    def apply(
        businessGoals: js.UndefOr[BusinessGoals] = js.undefined
    ): PrioritizeBusinessGoals = {
      val __obj = js.Dynamic.literal()
      businessGoals.foreach(__v => __obj.updateDynamic("businessGoals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PrioritizeBusinessGoals]
    }
  }

  @js.native
  trait PutPortfolioPreferencesRequest extends js.Object {
    var applicationPreferences: js.UndefOr[ApplicationPreferences]
    var databasePreferences: js.UndefOr[DatabasePreferences]
    var prioritizeBusinessGoals: js.UndefOr[PrioritizeBusinessGoals]
  }

  object PutPortfolioPreferencesRequest {
    @inline
    def apply(
        applicationPreferences: js.UndefOr[ApplicationPreferences] = js.undefined,
        databasePreferences: js.UndefOr[DatabasePreferences] = js.undefined,
        prioritizeBusinessGoals: js.UndefOr[PrioritizeBusinessGoals] = js.undefined
    ): PutPortfolioPreferencesRequest = {
      val __obj = js.Dynamic.literal()
      applicationPreferences.foreach(__v => __obj.updateDynamic("applicationPreferences")(__v.asInstanceOf[js.Any]))
      databasePreferences.foreach(__v => __obj.updateDynamic("databasePreferences")(__v.asInstanceOf[js.Any]))
      prioritizeBusinessGoals.foreach(__v => __obj.updateDynamic("prioritizeBusinessGoals")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutPortfolioPreferencesRequest]
    }
  }

  @js.native
  trait PutPortfolioPreferencesResponse extends js.Object

  object PutPortfolioPreferencesResponse {
    @inline
    def apply(): PutPortfolioPreferencesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutPortfolioPreferencesResponse]
    }
  }

  /** Contains detailed information about a recommendation report.
    */
  @js.native
  trait RecommendationReportDetails extends js.Object {
    var completionTime: js.UndefOr[RecommendationReportTimeStamp]
    var s3Bucket: js.UndefOr[String]
    var s3Keys: js.UndefOr[S3Keys]
    var startTime: js.UndefOr[RecommendationReportTimeStamp]
    var status: js.UndefOr[RecommendationReportStatus]
    var statusMessage: js.UndefOr[RecommendationReportStatusMessage]
  }

  object RecommendationReportDetails {
    @inline
    def apply(
        completionTime: js.UndefOr[RecommendationReportTimeStamp] = js.undefined,
        s3Bucket: js.UndefOr[String] = js.undefined,
        s3Keys: js.UndefOr[S3Keys] = js.undefined,
        startTime: js.UndefOr[RecommendationReportTimeStamp] = js.undefined,
        status: js.UndefOr[RecommendationReportStatus] = js.undefined,
        statusMessage: js.UndefOr[RecommendationReportStatusMessage] = js.undefined
    ): RecommendationReportDetails = {
      val __obj = js.Dynamic.literal()
      completionTime.foreach(__v => __obj.updateDynamic("completionTime")(__v.asInstanceOf[js.Any]))
      s3Bucket.foreach(__v => __obj.updateDynamic("s3Bucket")(__v.asInstanceOf[js.Any]))
      s3Keys.foreach(__v => __obj.updateDynamic("s3Keys")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecommendationReportDetails]
    }
  }

  /** Contains a recommendation set.
    */
  @js.native
  trait RecommendationSet extends js.Object {
    var strategy: js.UndefOr[Strategy]
    var targetDestination: js.UndefOr[TargetDestination]
    var transformationTool: js.UndefOr[TransformationTool]
  }

  object RecommendationSet {
    @inline
    def apply(
        strategy: js.UndefOr[Strategy] = js.undefined,
        targetDestination: js.UndefOr[TargetDestination] = js.undefined,
        transformationTool: js.UndefOr[TransformationTool] = js.undefined
    ): RecommendationSet = {
      val __obj = js.Dynamic.literal()
      strategy.foreach(__v => __obj.updateDynamic("strategy")(__v.asInstanceOf[js.Any]))
      targetDestination.foreach(__v => __obj.updateDynamic("targetDestination")(__v.asInstanceOf[js.Any]))
      transformationTool.foreach(__v => __obj.updateDynamic("transformationTool")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RecommendationSet]
    }
  }

  /** Contains the S3 bucket name and the Amazon S3 key name.
    */
  @js.native
  trait S3Object extends js.Object {
    var s3Bucket: js.UndefOr[S3Bucket]
    var s3key: js.UndefOr[S3Key]
  }

  object S3Object {
    @inline
    def apply(
        s3Bucket: js.UndefOr[S3Bucket] = js.undefined,
        s3key: js.UndefOr[S3Key] = js.undefined
    ): S3Object = {
      val __obj = js.Dynamic.literal()
      s3Bucket.foreach(__v => __obj.updateDynamic("s3Bucket")(__v.asInstanceOf[js.Any]))
      s3key.foreach(__v => __obj.updateDynamic("s3key")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Object]
    }
  }

  /** Self-managed resources.
    */
  @js.native
  trait SelfManageResources extends js.Object {
    var targetDestination: SelfManageTargetDestinations
  }

  object SelfManageResources {
    @inline
    def apply(
        targetDestination: SelfManageTargetDestinations
    ): SelfManageResources = {
      val __obj = js.Dynamic.literal(
        "targetDestination" -> targetDestination.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SelfManageResources]
    }
  }

  /** Detailed information about a server.
    */
  @js.native
  trait ServerDetail extends js.Object {
    var antipatternReportS3Object: js.UndefOr[S3Object]
    var antipatternReportStatus: js.UndefOr[AntipatternReportStatus]
    var antipatternReportStatusMessage: js.UndefOr[StatusMessage]
    var applicationComponentStrategySummary: js.UndefOr[ListStrategySummary]
    var dataCollectionStatus: js.UndefOr[RunTimeAssessmentStatus]
    var id: js.UndefOr[ResourceId]
    var lastAnalyzedTimestamp: js.UndefOr[TimeStamp]
    var listAntipatternSeveritySummary: js.UndefOr[ListAntipatternSeveritySummary]
    var name: js.UndefOr[ResourceName]
    var recommendationSet: js.UndefOr[RecommendationSet]
    var serverType: js.UndefOr[String]
    var statusMessage: js.UndefOr[StatusMessage]
    var systemInfo: js.UndefOr[SystemInfo]
  }

  object ServerDetail {
    @inline
    def apply(
        antipatternReportS3Object: js.UndefOr[S3Object] = js.undefined,
        antipatternReportStatus: js.UndefOr[AntipatternReportStatus] = js.undefined,
        antipatternReportStatusMessage: js.UndefOr[StatusMessage] = js.undefined,
        applicationComponentStrategySummary: js.UndefOr[ListStrategySummary] = js.undefined,
        dataCollectionStatus: js.UndefOr[RunTimeAssessmentStatus] = js.undefined,
        id: js.UndefOr[ResourceId] = js.undefined,
        lastAnalyzedTimestamp: js.UndefOr[TimeStamp] = js.undefined,
        listAntipatternSeveritySummary: js.UndefOr[ListAntipatternSeveritySummary] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        recommendationSet: js.UndefOr[RecommendationSet] = js.undefined,
        serverType: js.UndefOr[String] = js.undefined,
        statusMessage: js.UndefOr[StatusMessage] = js.undefined,
        systemInfo: js.UndefOr[SystemInfo] = js.undefined
    ): ServerDetail = {
      val __obj = js.Dynamic.literal()
      antipatternReportS3Object.foreach(__v => __obj.updateDynamic("antipatternReportS3Object")(__v.asInstanceOf[js.Any]))
      antipatternReportStatus.foreach(__v => __obj.updateDynamic("antipatternReportStatus")(__v.asInstanceOf[js.Any]))
      antipatternReportStatusMessage.foreach(__v => __obj.updateDynamic("antipatternReportStatusMessage")(__v.asInstanceOf[js.Any]))
      applicationComponentStrategySummary.foreach(__v => __obj.updateDynamic("applicationComponentStrategySummary")(__v.asInstanceOf[js.Any]))
      dataCollectionStatus.foreach(__v => __obj.updateDynamic("dataCollectionStatus")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      lastAnalyzedTimestamp.foreach(__v => __obj.updateDynamic("lastAnalyzedTimestamp")(__v.asInstanceOf[js.Any]))
      listAntipatternSeveritySummary.foreach(__v => __obj.updateDynamic("listAntipatternSeveritySummary")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      recommendationSet.foreach(__v => __obj.updateDynamic("recommendationSet")(__v.asInstanceOf[js.Any]))
      serverType.foreach(__v => __obj.updateDynamic("serverType")(__v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.updateDynamic("statusMessage")(__v.asInstanceOf[js.Any]))
      systemInfo.foreach(__v => __obj.updateDynamic("systemInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServerDetail]
    }
  }

  /** Contains information about a strategy recommendation for a server.
    */
  @js.native
  trait ServerStrategy extends js.Object {
    var isPreferred: js.UndefOr[Boolean]
    var numberOfApplicationComponents: js.UndefOr[Int]
    var recommendation: js.UndefOr[RecommendationSet]
    var status: js.UndefOr[StrategyRecommendation]
  }

  object ServerStrategy {
    @inline
    def apply(
        isPreferred: js.UndefOr[Boolean] = js.undefined,
        numberOfApplicationComponents: js.UndefOr[Int] = js.undefined,
        recommendation: js.UndefOr[RecommendationSet] = js.undefined,
        status: js.UndefOr[StrategyRecommendation] = js.undefined
    ): ServerStrategy = {
      val __obj = js.Dynamic.literal()
      isPreferred.foreach(__v => __obj.updateDynamic("isPreferred")(__v.asInstanceOf[js.Any]))
      numberOfApplicationComponents.foreach(__v => __obj.updateDynamic("numberOfApplicationComponents")(__v.asInstanceOf[js.Any]))
      recommendation.foreach(__v => __obj.updateDynamic("recommendation")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServerStrategy]
    }
  }

  /** Object containing details about the servers imported by Application Discovery Service
    */
  @js.native
  trait ServerSummary extends js.Object {
    var ServerOsType: js.UndefOr[ServerOsType]
    var count: js.UndefOr[Int]
  }

  object ServerSummary {
    @inline
    def apply(
        ServerOsType: js.UndefOr[ServerOsType] = js.undefined,
        count: js.UndefOr[Int] = js.undefined
    ): ServerSummary = {
      val __obj = js.Dynamic.literal()
      ServerOsType.foreach(__v => __obj.updateDynamic("ServerOsType")(__v.asInstanceOf[js.Any]))
      count.foreach(__v => __obj.updateDynamic("count")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServerSummary]
    }
  }

  /** Object containing source code information that is linked to an application component.
    */
  @js.native
  trait SourceCode extends js.Object {
    var location: js.UndefOr[Location]
    var sourceVersion: js.UndefOr[SourceVersion]
    var versionControl: js.UndefOr[VersionControl]
  }

  object SourceCode {
    @inline
    def apply(
        location: js.UndefOr[Location] = js.undefined,
        sourceVersion: js.UndefOr[SourceVersion] = js.undefined,
        versionControl: js.UndefOr[VersionControl] = js.undefined
    ): SourceCode = {
      val __obj = js.Dynamic.literal()
      location.foreach(__v => __obj.updateDynamic("location")(__v.asInstanceOf[js.Any]))
      sourceVersion.foreach(__v => __obj.updateDynamic("sourceVersion")(__v.asInstanceOf[js.Any]))
      versionControl.foreach(__v => __obj.updateDynamic("versionControl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceCode]
    }
  }

  /** Object containing source code information that is linked to an application component.
    */
  @js.native
  trait SourceCodeRepository extends js.Object {
    var branch: js.UndefOr[String]
    var repository: js.UndefOr[String]
    var versionControlType: js.UndefOr[String]
  }

  object SourceCodeRepository {
    @inline
    def apply(
        branch: js.UndefOr[String] = js.undefined,
        repository: js.UndefOr[String] = js.undefined,
        versionControlType: js.UndefOr[String] = js.undefined
    ): SourceCodeRepository = {
      val __obj = js.Dynamic.literal()
      branch.foreach(__v => __obj.updateDynamic("branch")(__v.asInstanceOf[js.Any]))
      repository.foreach(__v => __obj.updateDynamic("repository")(__v.asInstanceOf[js.Any]))
      versionControlType.foreach(__v => __obj.updateDynamic("versionControlType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceCodeRepository]
    }
  }

  @js.native
  trait StartAssessmentRequest extends js.Object {
    var s3bucketForAnalysisData: js.UndefOr[StartAssessmentRequestS3bucketForAnalysisDataString]
    var s3bucketForReportData: js.UndefOr[StartAssessmentRequestS3bucketForReportDataString]
  }

  object StartAssessmentRequest {
    @inline
    def apply(
        s3bucketForAnalysisData: js.UndefOr[StartAssessmentRequestS3bucketForAnalysisDataString] = js.undefined,
        s3bucketForReportData: js.UndefOr[StartAssessmentRequestS3bucketForReportDataString] = js.undefined
    ): StartAssessmentRequest = {
      val __obj = js.Dynamic.literal()
      s3bucketForAnalysisData.foreach(__v => __obj.updateDynamic("s3bucketForAnalysisData")(__v.asInstanceOf[js.Any]))
      s3bucketForReportData.foreach(__v => __obj.updateDynamic("s3bucketForReportData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartAssessmentRequest]
    }
  }

  @js.native
  trait StartAssessmentResponse extends js.Object {
    var assessmentId: js.UndefOr[AsyncTaskId]
  }

  object StartAssessmentResponse {
    @inline
    def apply(
        assessmentId: js.UndefOr[AsyncTaskId] = js.undefined
    ): StartAssessmentResponse = {
      val __obj = js.Dynamic.literal()
      assessmentId.foreach(__v => __obj.updateDynamic("assessmentId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartAssessmentResponse]
    }
  }

  @js.native
  trait StartImportFileTaskRequest extends js.Object {
    var S3Bucket: importS3Bucket
    var name: StartImportFileTaskRequestNameString
    var s3key: String
    var dataSourceType: js.UndefOr[DataSourceType]
    var groupId: js.UndefOr[GroupIds]
    var s3bucketForReportData: js.UndefOr[StartImportFileTaskRequestS3bucketForReportDataString]
  }

  object StartImportFileTaskRequest {
    @inline
    def apply(
        S3Bucket: importS3Bucket,
        name: StartImportFileTaskRequestNameString,
        s3key: String,
        dataSourceType: js.UndefOr[DataSourceType] = js.undefined,
        groupId: js.UndefOr[GroupIds] = js.undefined,
        s3bucketForReportData: js.UndefOr[StartImportFileTaskRequestS3bucketForReportDataString] = js.undefined
    ): StartImportFileTaskRequest = {
      val __obj = js.Dynamic.literal(
        "S3Bucket" -> S3Bucket.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "s3key" -> s3key.asInstanceOf[js.Any]
      )

      dataSourceType.foreach(__v => __obj.updateDynamic("dataSourceType")(__v.asInstanceOf[js.Any]))
      groupId.foreach(__v => __obj.updateDynamic("groupId")(__v.asInstanceOf[js.Any]))
      s3bucketForReportData.foreach(__v => __obj.updateDynamic("s3bucketForReportData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartImportFileTaskRequest]
    }
  }

  @js.native
  trait StartImportFileTaskResponse extends js.Object {
    var id: js.UndefOr[String]
  }

  object StartImportFileTaskResponse {
    @inline
    def apply(
        id: js.UndefOr[String] = js.undefined
    ): StartImportFileTaskResponse = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartImportFileTaskResponse]
    }
  }

  @js.native
  trait StartRecommendationReportGenerationRequest extends js.Object {
    var groupIdFilter: js.UndefOr[GroupIds]
    var outputFormat: js.UndefOr[OutputFormat]
  }

  object StartRecommendationReportGenerationRequest {
    @inline
    def apply(
        groupIdFilter: js.UndefOr[GroupIds] = js.undefined,
        outputFormat: js.UndefOr[OutputFormat] = js.undefined
    ): StartRecommendationReportGenerationRequest = {
      val __obj = js.Dynamic.literal()
      groupIdFilter.foreach(__v => __obj.updateDynamic("groupIdFilter")(__v.asInstanceOf[js.Any]))
      outputFormat.foreach(__v => __obj.updateDynamic("outputFormat")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartRecommendationReportGenerationRequest]
    }
  }

  @js.native
  trait StartRecommendationReportGenerationResponse extends js.Object {
    var id: js.UndefOr[RecommendationTaskId]
  }

  object StartRecommendationReportGenerationResponse {
    @inline
    def apply(
        id: js.UndefOr[RecommendationTaskId] = js.undefined
    ): StartRecommendationReportGenerationResponse = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartRecommendationReportGenerationResponse]
    }
  }

  @js.native
  trait StopAssessmentRequest extends js.Object {
    var assessmentId: AsyncTaskId
  }

  object StopAssessmentRequest {
    @inline
    def apply(
        assessmentId: AsyncTaskId
    ): StopAssessmentRequest = {
      val __obj = js.Dynamic.literal(
        "assessmentId" -> assessmentId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopAssessmentRequest]
    }
  }

  @js.native
  trait StopAssessmentResponse extends js.Object

  object StopAssessmentResponse {
    @inline
    def apply(): StopAssessmentResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopAssessmentResponse]
    }
  }

  /** Information about all the available strategy options for migrating and modernizing an application component.
    */
  @js.native
  trait StrategyOption extends js.Object {
    var isPreferred: js.UndefOr[Boolean]
    var strategy: js.UndefOr[Strategy]
    var targetDestination: js.UndefOr[TargetDestination]
    var toolName: js.UndefOr[TransformationToolName]
  }

  object StrategyOption {
    @inline
    def apply(
        isPreferred: js.UndefOr[Boolean] = js.undefined,
        strategy: js.UndefOr[Strategy] = js.undefined,
        targetDestination: js.UndefOr[TargetDestination] = js.undefined,
        toolName: js.UndefOr[TransformationToolName] = js.undefined
    ): StrategyOption = {
      val __obj = js.Dynamic.literal()
      isPreferred.foreach(__v => __obj.updateDynamic("isPreferred")(__v.asInstanceOf[js.Any]))
      strategy.foreach(__v => __obj.updateDynamic("strategy")(__v.asInstanceOf[js.Any]))
      targetDestination.foreach(__v => __obj.updateDynamic("targetDestination")(__v.asInstanceOf[js.Any]))
      toolName.foreach(__v => __obj.updateDynamic("toolName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StrategyOption]
    }
  }

  /** Object containing the summary of the strategy recommendations.
    */
  @js.native
  trait StrategySummary extends js.Object {
    var count: js.UndefOr[Int]
    var strategy: js.UndefOr[Strategy]
  }

  object StrategySummary {
    @inline
    def apply(
        count: js.UndefOr[Int] = js.undefined,
        strategy: js.UndefOr[Strategy] = js.undefined
    ): StrategySummary = {
      val __obj = js.Dynamic.literal()
      count.foreach(__v => __obj.updateDynamic("count")(__v.asInstanceOf[js.Any]))
      strategy.foreach(__v => __obj.updateDynamic("strategy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StrategySummary]
    }
  }

  /** Information about the server that hosts application components.
    */
  @js.native
  trait SystemInfo extends js.Object {
    var cpuArchitecture: js.UndefOr[String]
    var fileSystemType: js.UndefOr[String]
    var networkInfoList: js.UndefOr[NetworkInfoList]
    var osInfo: js.UndefOr[OSInfo]
  }

  object SystemInfo {
    @inline
    def apply(
        cpuArchitecture: js.UndefOr[String] = js.undefined,
        fileSystemType: js.UndefOr[String] = js.undefined,
        networkInfoList: js.UndefOr[NetworkInfoList] = js.undefined,
        osInfo: js.UndefOr[OSInfo] = js.undefined
    ): SystemInfo = {
      val __obj = js.Dynamic.literal()
      cpuArchitecture.foreach(__v => __obj.updateDynamic("cpuArchitecture")(__v.asInstanceOf[js.Any]))
      fileSystemType.foreach(__v => __obj.updateDynamic("fileSystemType")(__v.asInstanceOf[js.Any]))
      networkInfoList.foreach(__v => __obj.updateDynamic("networkInfoList")(__v.asInstanceOf[js.Any]))
      osInfo.foreach(__v => __obj.updateDynamic("osInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SystemInfo]
    }
  }

  /** Information of the transformation tool that can be used to migrate and modernize the application.
    */
  @js.native
  trait TransformationTool extends js.Object {
    var description: js.UndefOr[TranformationToolDescription]
    var name: js.UndefOr[TransformationToolName]
    var tranformationToolInstallationLink: js.UndefOr[TranformationToolInstallationLink]
  }

  object TransformationTool {
    @inline
    def apply(
        description: js.UndefOr[TranformationToolDescription] = js.undefined,
        name: js.UndefOr[TransformationToolName] = js.undefined,
        tranformationToolInstallationLink: js.UndefOr[TranformationToolInstallationLink] = js.undefined
    ): TransformationTool = {
      val __obj = js.Dynamic.literal()
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      tranformationToolInstallationLink.foreach(__v => __obj.updateDynamic("tranformationToolInstallationLink")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TransformationTool]
    }
  }

  @js.native
  trait UpdateApplicationComponentConfigRequest extends js.Object {
    var applicationComponentId: ApplicationComponentId
    var inclusionStatus: js.UndefOr[InclusionStatus]
    var secretsManagerKey: js.UndefOr[SecretsManagerKey]
    var sourceCodeList: js.UndefOr[SourceCodeList]
    var strategyOption: js.UndefOr[StrategyOption]
  }

  object UpdateApplicationComponentConfigRequest {
    @inline
    def apply(
        applicationComponentId: ApplicationComponentId,
        inclusionStatus: js.UndefOr[InclusionStatus] = js.undefined,
        secretsManagerKey: js.UndefOr[SecretsManagerKey] = js.undefined,
        sourceCodeList: js.UndefOr[SourceCodeList] = js.undefined,
        strategyOption: js.UndefOr[StrategyOption] = js.undefined
    ): UpdateApplicationComponentConfigRequest = {
      val __obj = js.Dynamic.literal(
        "applicationComponentId" -> applicationComponentId.asInstanceOf[js.Any]
      )

      inclusionStatus.foreach(__v => __obj.updateDynamic("inclusionStatus")(__v.asInstanceOf[js.Any]))
      secretsManagerKey.foreach(__v => __obj.updateDynamic("secretsManagerKey")(__v.asInstanceOf[js.Any]))
      sourceCodeList.foreach(__v => __obj.updateDynamic("sourceCodeList")(__v.asInstanceOf[js.Any]))
      strategyOption.foreach(__v => __obj.updateDynamic("strategyOption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApplicationComponentConfigRequest]
    }
  }

  @js.native
  trait UpdateApplicationComponentConfigResponse extends js.Object

  object UpdateApplicationComponentConfigResponse {
    @inline
    def apply(): UpdateApplicationComponentConfigResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateApplicationComponentConfigResponse]
    }
  }

  @js.native
  trait UpdateServerConfigRequest extends js.Object {
    var serverId: ServerId
    var strategyOption: js.UndefOr[StrategyOption]
  }

  object UpdateServerConfigRequest {
    @inline
    def apply(
        serverId: ServerId,
        strategyOption: js.UndefOr[StrategyOption] = js.undefined
    ): UpdateServerConfigRequest = {
      val __obj = js.Dynamic.literal(
        "serverId" -> serverId.asInstanceOf[js.Any]
      )

      strategyOption.foreach(__v => __obj.updateDynamic("strategyOption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateServerConfigRequest]
    }
  }

  @js.native
  trait UpdateServerConfigResponse extends js.Object

  object UpdateServerConfigResponse {
    @inline
    def apply(): UpdateServerConfigResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateServerConfigResponse]
    }
  }
}
