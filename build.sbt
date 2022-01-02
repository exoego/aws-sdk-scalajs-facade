import scala.util._

ThisBuild / crossScalaVersions := Seq(SharedConfig.scala3Version, SharedConfig.scala213Version, SharedConfig.scala212Version)
ThisBuild / scalaVersion := SharedConfig.scala3Version
ThisBuild / organization := "net.exoego"
ThisBuild / concurrentRestrictions += Tags.limit(
  ScalaJSTags.Link,
  max = Try(System.getenv("SCALAJS_LINK_MAX").toInt).getOrElse(4)
)
Global / excludeLintKeys += publishArtifact

addCommandAlias("fmt", s";scalafmtSbt;++${SharedConfig.scala213Version};scalafmtAll;++${SharedConfig.scala3Version};scalafmtAll")

lazy val core = (project in file("core"))
  .settings(SharedConfig.settings)
  .settings(SharedConfig.publishSetting)
  .settings(
    name := s"${SharedConfig.libraryName}-core"
  )
  .enablePlugins(ScalaJSPlugin)

lazy val dynamodbShared = (project in file("dynamodb-shared"))
  .settings(SharedConfig.settings)
  .settings(SharedConfig.publishSetting)
  .settings(
    libraryDependencies += Dependencies.shared.compat.value,
    name := s"${SharedConfig.libraryName}-dynamodb-shared"
  )
  .enablePlugins(ScalaJSPlugin)

lazy val credentials = (project in file("credentials"))
  .settings(SharedConfig.settings)
  .settings(SharedConfig.publishSetting)
  .settings(
    name := s"${SharedConfig.libraryName}-credentials"
  )
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(awsSTS, awsCognitoIdentity)

def defineAwsProject(service: String): Project = {
  val lowerServiceName = service.toLowerCase
  Project(id = s"aws$service", base = file("services") / lowerServiceName)
    .dependsOn(core)
    .settings(SharedConfig.settings)
    .settings(SharedConfig.publishSetting)
    .settings(
      name := s"${SharedConfig.libraryName}-$lowerServiceName"
    )
    .enablePlugins(ScalaJSPlugin)
}

lazy val root = (project in file("."))
  .settings(name := "aws-sdk-scalajs-facade")
  .settings(SharedConfig.settings)
  .settings(SharedConfig.publishSetting)
  .settings(SharedConfig.noPublishingSettings)
  .enablePlugins(ScalaJSPlugin)
  .aggregate(subProjects.map(_.project): _*)
  .aggregate(all)

lazy val all = (project in file("all"))
  .settings(SharedConfig.settings)
  .settings(SharedConfig.publishSetting)
  .settings(
    name := s"${SharedConfig.libraryName}"
  )
  .enablePlugins(ScalaJSPlugin)
  .dependsOn(subProjects.map(p => ClasspathDependency(p, None)): _*)

lazy val awsDynamoDB = defineAwsProject("DynamoDB").dependsOn(dynamodbShared)
lazy val awsDynamoDBStreams = defineAwsProject("DynamoDBStreams").dependsOn(dynamodbShared)
lazy val awsCloudFrontSigner = defineAwsProject("CloudFrontSigner")

//AUTO-GENERATED
lazy val awsACM = defineAwsProject("ACM")
lazy val awsACMPCA = defineAwsProject("ACMPCA")
lazy val awsAPIGateway = defineAwsProject("APIGateway")
lazy val awsAccessAnalyzer = defineAwsProject("AccessAnalyzer")
lazy val awsAccount = defineAwsProject("Account")
lazy val awsAlexaForBusiness = defineAwsProject("AlexaForBusiness")
lazy val awsAmp = defineAwsProject("Amp")
lazy val awsAmplify = defineAwsProject("Amplify")
lazy val awsAmplifyBackend = defineAwsProject("AmplifyBackend")
lazy val awsAmplifyUIBuilder = defineAwsProject("AmplifyUIBuilder")
lazy val awsApiGatewayManagementApi = defineAwsProject("ApiGatewayManagementApi")
lazy val awsApiGatewayV2 = defineAwsProject("ApiGatewayV2")
lazy val awsAppConfig = defineAwsProject("AppConfig")
lazy val awsAppConfigData = defineAwsProject("AppConfigData")
lazy val awsAppIntegrations = defineAwsProject("AppIntegrations")
lazy val awsAppMesh = defineAwsProject("AppMesh")
lazy val awsAppRunner = defineAwsProject("AppRunner")
lazy val awsAppStream = defineAwsProject("AppStream")
lazy val awsAppSync = defineAwsProject("AppSync")
lazy val awsAppflow = defineAwsProject("Appflow")
lazy val awsApplicationAutoScaling = defineAwsProject("ApplicationAutoScaling")
lazy val awsApplicationCostProfiler = defineAwsProject("ApplicationCostProfiler")
lazy val awsApplicationDiscovery = defineAwsProject("ApplicationDiscovery")
lazy val awsApplicationInsights = defineAwsProject("ApplicationInsights")
lazy val awsAthena = defineAwsProject("Athena")
lazy val awsAuditManager = defineAwsProject("AuditManager")
lazy val awsAugmentedAIRuntime = defineAwsProject("AugmentedAIRuntime")
lazy val awsAutoScaling = defineAwsProject("AutoScaling")
lazy val awsAutoScalingPlans = defineAwsProject("AutoScalingPlans")
lazy val awsBackup = defineAwsProject("Backup")
lazy val awsBackupGateway = defineAwsProject("BackupGateway")
lazy val awsBatch = defineAwsProject("Batch")
lazy val awsBraket = defineAwsProject("Braket")
lazy val awsBudgetsService = defineAwsProject("BudgetsService")
lazy val awsCUR = defineAwsProject("CUR")
lazy val awsChime = defineAwsProject("Chime")
lazy val awsChimeSDKIdentity = defineAwsProject("ChimeSDKIdentity")
lazy val awsChimeSDKMeetings = defineAwsProject("ChimeSDKMeetings")
lazy val awsChimeSDKMessaging = defineAwsProject("ChimeSDKMessaging")
lazy val awsCloud9 = defineAwsProject("Cloud9")
lazy val awsCloudControl = defineAwsProject("CloudControl")
lazy val awsCloudDirectory = defineAwsProject("CloudDirectory")
lazy val awsCloudFormation = defineAwsProject("CloudFormation")
lazy val awsCloudFront = defineAwsProject("CloudFront")
lazy val awsCloudHSM = defineAwsProject("CloudHSM")
lazy val awsCloudHSMV2 = defineAwsProject("CloudHSMV2")
lazy val awsCloudSearch = defineAwsProject("CloudSearch")
lazy val awsCloudSearchDomain = defineAwsProject("CloudSearchDomain")
lazy val awsCloudTrail = defineAwsProject("CloudTrail")
lazy val awsCloudWatch = defineAwsProject("CloudWatch")
lazy val awsCloudWatchEvents = defineAwsProject("CloudWatchEvents")
lazy val awsCloudWatchLogs = defineAwsProject("CloudWatchLogs")
lazy val awsCodeArtifact = defineAwsProject("CodeArtifact")
lazy val awsCodeBuild = defineAwsProject("CodeBuild")
lazy val awsCodeCommit = defineAwsProject("CodeCommit")
lazy val awsCodeDeploy = defineAwsProject("CodeDeploy")
lazy val awsCodeGuruProfiler = defineAwsProject("CodeGuruProfiler")
lazy val awsCodeGuruReviewer = defineAwsProject("CodeGuruReviewer")
lazy val awsCodePipeline = defineAwsProject("CodePipeline")
lazy val awsCodeStar = defineAwsProject("CodeStar")
lazy val awsCodeStarNotifications = defineAwsProject("CodeStarNotifications")
lazy val awsCodeStarconnections = defineAwsProject("CodeStarconnections")
lazy val awsCognitoIdentity = defineAwsProject("CognitoIdentity")
lazy val awsCognitoIdentityProvider = defineAwsProject("CognitoIdentityProvider")
lazy val awsCognitoSync = defineAwsProject("CognitoSync")
lazy val awsComprehend = defineAwsProject("Comprehend")
lazy val awsComprehendMedical = defineAwsProject("ComprehendMedical")
lazy val awsComputeOptimizer = defineAwsProject("ComputeOptimizer")
lazy val awsConfigService = defineAwsProject("ConfigService")
lazy val awsConnect = defineAwsProject("Connect")
lazy val awsConnectContactLens = defineAwsProject("ConnectContactLens")
lazy val awsConnectParticipant = defineAwsProject("ConnectParticipant")
lazy val awsCostExplorer = defineAwsProject("CostExplorer")
lazy val awsCustomerProfiles = defineAwsProject("CustomerProfiles")
lazy val awsDAX = defineAwsProject("DAX")
lazy val awsDLM = defineAwsProject("DLM")
lazy val awsDMS = defineAwsProject("DMS")
lazy val awsDRS = defineAwsProject("DRS")
lazy val awsDataBrew = defineAwsProject("DataBrew")
lazy val awsDataExchange = defineAwsProject("DataExchange")
lazy val awsDataPipeline = defineAwsProject("DataPipeline")
lazy val awsDataSync = defineAwsProject("DataSync")
lazy val awsDetective = defineAwsProject("Detective")
lazy val awsDevOpsGuru = defineAwsProject("DevOpsGuru")
lazy val awsDeviceFarm = defineAwsProject("DeviceFarm")
lazy val awsDirectConnect = defineAwsProject("DirectConnect")
lazy val awsDirectoryService = defineAwsProject("DirectoryService")
lazy val awsDocDB = defineAwsProject("DocDB")
lazy val awsEBS = defineAwsProject("EBS")
lazy val awsEC2 = defineAwsProject("EC2")
lazy val awsEC2InstanceConnect = defineAwsProject("EC2InstanceConnect")
lazy val awsECR = defineAwsProject("ECR")
lazy val awsECRPUBLIC = defineAwsProject("ECRPUBLIC")
lazy val awsECS = defineAwsProject("ECS")
lazy val awsEFS = defineAwsProject("EFS")
lazy val awsEKS = defineAwsProject("EKS")
lazy val awsELB = defineAwsProject("ELB")
lazy val awsELBv2 = defineAwsProject("ELBv2")
lazy val awsEMR = defineAwsProject("EMR")
lazy val awsEMRcontainers = defineAwsProject("EMRcontainers")
lazy val awsES = defineAwsProject("ES")
lazy val awsElastiCache = defineAwsProject("ElastiCache")
lazy val awsElasticBeanstalk = defineAwsProject("ElasticBeanstalk")
lazy val awsElasticInference = defineAwsProject("ElasticInference")
lazy val awsElasticTranscoder = defineAwsProject("ElasticTranscoder")
lazy val awsEventBridge = defineAwsProject("EventBridge")
lazy val awsEvidently = defineAwsProject("Evidently")
lazy val awsFMS = defineAwsProject("FMS")
lazy val awsFSx = defineAwsProject("FSx")
lazy val awsFinSpace = defineAwsProject("FinSpace")
lazy val awsFinSpaceData = defineAwsProject("FinSpaceData")
lazy val awsFirehose = defineAwsProject("Firehose")
lazy val awsFis = defineAwsProject("Fis")
lazy val awsForecast = defineAwsProject("Forecast")
lazy val awsForecastQuery = defineAwsProject("ForecastQuery")
lazy val awsFraudDetector = defineAwsProject("FraudDetector")
lazy val awsGameLift = defineAwsProject("GameLift")
lazy val awsGlacier = defineAwsProject("Glacier")
lazy val awsGlobalAccelerator = defineAwsProject("GlobalAccelerator")
lazy val awsGlue = defineAwsProject("Glue")
lazy val awsGrafana = defineAwsProject("Grafana")
lazy val awsGreengrass = defineAwsProject("Greengrass")
lazy val awsGreengrassV2 = defineAwsProject("GreengrassV2")
lazy val awsGroundStation = defineAwsProject("GroundStation")
lazy val awsGuardDuty = defineAwsProject("GuardDuty")
lazy val awsHealth = defineAwsProject("Health")
lazy val awsHealthLake = defineAwsProject("HealthLake")
lazy val awsHoneycode = defineAwsProject("Honeycode")
lazy val awsIAM = defineAwsProject("IAM")
lazy val awsIVS = defineAwsProject("IVS")
lazy val awsIdentityStore = defineAwsProject("IdentityStore")
lazy val awsImagebuilder = defineAwsProject("Imagebuilder")
lazy val awsImportExport = defineAwsProject("ImportExport")
lazy val awsInspector = defineAwsProject("Inspector")
lazy val awsInspector2 = defineAwsProject("Inspector2")
lazy val awsIoT1ClickDevicesService = defineAwsProject("IoT1ClickDevicesService")
lazy val awsIoT1ClickProjects = defineAwsProject("IoT1ClickProjects")
lazy val awsIoTAnalytics = defineAwsProject("IoTAnalytics")
lazy val awsIoTEvents = defineAwsProject("IoTEvents")
lazy val awsIoTEventsData = defineAwsProject("IoTEventsData")
lazy val awsIoTFleetHub = defineAwsProject("IoTFleetHub")
lazy val awsIoTJobsDataPlane = defineAwsProject("IoTJobsDataPlane")
lazy val awsIoTSecureTunneling = defineAwsProject("IoTSecureTunneling")
lazy val awsIoTSiteWise = defineAwsProject("IoTSiteWise")
lazy val awsIoTThingsGraph = defineAwsProject("IoTThingsGraph")
lazy val awsIoTTwinMaker = defineAwsProject("IoTTwinMaker")
lazy val awsIoTWireless = defineAwsProject("IoTWireless")
lazy val awsIot = defineAwsProject("Iot")
lazy val awsIotData = defineAwsProject("IotData")
lazy val awsIotDeviceAdvisor = defineAwsProject("IotDeviceAdvisor")
lazy val awsKMS = defineAwsProject("KMS")
lazy val awsKafka = defineAwsProject("Kafka")
lazy val awsKafkaConnect = defineAwsProject("KafkaConnect")
lazy val awsKendra = defineAwsProject("Kendra")
lazy val awsKinesis = defineAwsProject("Kinesis")
lazy val awsKinesisAnalytics = defineAwsProject("KinesisAnalytics")
lazy val awsKinesisAnalyticsV2 = defineAwsProject("KinesisAnalyticsV2")
lazy val awsKinesisVideo = defineAwsProject("KinesisVideo")
lazy val awsKinesisVideoArchivedMedia = defineAwsProject("KinesisVideoArchivedMedia")
lazy val awsKinesisVideoMedia = defineAwsProject("KinesisVideoMedia")
lazy val awsKinesisVideoSignaling = defineAwsProject("KinesisVideoSignaling")
lazy val awsLakeFormation = defineAwsProject("LakeFormation")
lazy val awsLambda = defineAwsProject("Lambda")
lazy val awsLexModelBuildingService = defineAwsProject("LexModelBuildingService")
lazy val awsLexModelsV2 = defineAwsProject("LexModelsV2")
lazy val awsLexRuntime = defineAwsProject("LexRuntime")
lazy val awsLexRuntimeV2 = defineAwsProject("LexRuntimeV2")
lazy val awsLicenseManager = defineAwsProject("LicenseManager")
lazy val awsLightsail = defineAwsProject("Lightsail")
lazy val awsLocation = defineAwsProject("Location")
lazy val awsLookoutEquipment = defineAwsProject("LookoutEquipment")
lazy val awsLookoutMetrics = defineAwsProject("LookoutMetrics")
lazy val awsLookoutVision = defineAwsProject("LookoutVision")
lazy val awsMQ = defineAwsProject("MQ")
lazy val awsMTurk = defineAwsProject("MTurk")
lazy val awsMWAA = defineAwsProject("MWAA")
lazy val awsMachineLearning = defineAwsProject("MachineLearning")
lazy val awsMacie = defineAwsProject("Macie")
lazy val awsMacie2 = defineAwsProject("Macie2")
lazy val awsManagedBlockchain = defineAwsProject("ManagedBlockchain")
lazy val awsMarketplaceCatalog = defineAwsProject("MarketplaceCatalog")
lazy val awsMarketplaceCommerceAnalytics = defineAwsProject("MarketplaceCommerceAnalytics")
lazy val awsMarketplaceEntitlementService = defineAwsProject("MarketplaceEntitlementService")
lazy val awsMarketplaceMetering = defineAwsProject("MarketplaceMetering")
lazy val awsMediaConnect = defineAwsProject("MediaConnect")
lazy val awsMediaConvert = defineAwsProject("MediaConvert")
lazy val awsMediaLive = defineAwsProject("MediaLive")
lazy val awsMediaPackage = defineAwsProject("MediaPackage")
lazy val awsMediaPackageVod = defineAwsProject("MediaPackageVod")
lazy val awsMediaStore = defineAwsProject("MediaStore")
lazy val awsMediaStoreData = defineAwsProject("MediaStoreData")
lazy val awsMediaTailor = defineAwsProject("MediaTailor")
lazy val awsMemoryDB = defineAwsProject("MemoryDB")
lazy val awsMgn = defineAwsProject("Mgn")
lazy val awsMigrationHub = defineAwsProject("MigrationHub")
lazy val awsMigrationHubConfig = defineAwsProject("MigrationHubConfig")
lazy val awsMigrationHubRefactorSpaces = defineAwsProject("MigrationHubRefactorSpaces")
lazy val awsMigrationHubStrategy = defineAwsProject("MigrationHubStrategy")
lazy val awsMobile = defineAwsProject("Mobile")
lazy val awsMobileAnalytics = defineAwsProject("MobileAnalytics")
lazy val awsNeptune = defineAwsProject("Neptune")
lazy val awsNetworkFirewall = defineAwsProject("NetworkFirewall")
lazy val awsNetworkManager = defineAwsProject("NetworkManager")
lazy val awsNimble = defineAwsProject("Nimble")
lazy val awsOpenSearch = defineAwsProject("OpenSearch")
lazy val awsOpsWorks = defineAwsProject("OpsWorks")
lazy val awsOpsWorksCM = defineAwsProject("OpsWorksCM")
lazy val awsOrganizations = defineAwsProject("Organizations")
lazy val awsOutposts = defineAwsProject("Outposts")
lazy val awsPI = defineAwsProject("PI")
lazy val awsPanorama = defineAwsProject("Panorama")
lazy val awsPersonalize = defineAwsProject("Personalize")
lazy val awsPersonalizeEvents = defineAwsProject("PersonalizeEvents")
lazy val awsPersonalizeRuntime = defineAwsProject("PersonalizeRuntime")
lazy val awsPinpoint = defineAwsProject("Pinpoint")
lazy val awsPinpointEmail = defineAwsProject("PinpointEmail")
lazy val awsPinpointSMSVoice = defineAwsProject("PinpointSMSVoice")
lazy val awsPolly = defineAwsProject("Polly")
lazy val awsPricing = defineAwsProject("Pricing")
lazy val awsProton = defineAwsProject("Proton")
lazy val awsQLDB = defineAwsProject("QLDB")
lazy val awsQLDBSession = defineAwsProject("QLDBSession")
lazy val awsQuickSight = defineAwsProject("QuickSight")
lazy val awsRAM = defineAwsProject("RAM")
lazy val awsRBin = defineAwsProject("RBin")
lazy val awsRDS = defineAwsProject("RDS")
lazy val awsRDSDataService = defineAwsProject("RDSDataService")
lazy val awsRUM = defineAwsProject("RUM")
lazy val awsRedshift = defineAwsProject("Redshift")
lazy val awsRedshiftData = defineAwsProject("RedshiftData")
lazy val awsRekognition = defineAwsProject("Rekognition")
lazy val awsResilienceHub = defineAwsProject("ResilienceHub")
lazy val awsResourceGroups = defineAwsProject("ResourceGroups")
lazy val awsResourceGroupsTaggingAPI = defineAwsProject("ResourceGroupsTaggingAPI")
lazy val awsRoboMaker = defineAwsProject("RoboMaker")
lazy val awsRoute53 = defineAwsProject("Route53")
lazy val awsRoute53Domains = defineAwsProject("Route53Domains")
lazy val awsRoute53RecoveryCluster = defineAwsProject("Route53RecoveryCluster")
lazy val awsRoute53RecoveryControlConfig = defineAwsProject("Route53RecoveryControlConfig")
lazy val awsRoute53RecoveryReadiness = defineAwsProject("Route53RecoveryReadiness")
lazy val awsRoute53Resolver = defineAwsProject("Route53Resolver")
lazy val awsS3 = defineAwsProject("S3")
lazy val awsS3Control = defineAwsProject("S3Control")
lazy val awsS3Outposts = defineAwsProject("S3Outposts")
lazy val awsSES = defineAwsProject("SES")
lazy val awsSESv2 = defineAwsProject("SESv2")
lazy val awsSMS = defineAwsProject("SMS")
lazy val awsSNS = defineAwsProject("SNS")
lazy val awsSQS = defineAwsProject("SQS")
lazy val awsSSM = defineAwsProject("SSM")
lazy val awsSSMContacts = defineAwsProject("SSMContacts")
lazy val awsSSMIncidents = defineAwsProject("SSMIncidents")
lazy val awsSSO = defineAwsProject("SSO")
lazy val awsSSOAdmin = defineAwsProject("SSOAdmin")
lazy val awsSSOOIDC = defineAwsProject("SSOOIDC")
lazy val awsSTS = defineAwsProject("STS")
lazy val awsSWF = defineAwsProject("SWF")
lazy val awsSageMaker = defineAwsProject("SageMaker")
lazy val awsSageMakerFeatureStoreRuntime = defineAwsProject("SageMakerFeatureStoreRuntime")
lazy val awsSageMakerRuntime = defineAwsProject("SageMakerRuntime")
lazy val awsSagemakerEdge = defineAwsProject("SagemakerEdge")
lazy val awsSavingsPlans = defineAwsProject("SavingsPlans")
lazy val awsSchemas = defineAwsProject("Schemas")
lazy val awsSecretsManager = defineAwsProject("SecretsManager")
lazy val awsSecurityHub = defineAwsProject("SecurityHub")
lazy val awsServerlessApplicationRepository = defineAwsProject("ServerlessApplicationRepository")
lazy val awsServiceCatalog = defineAwsProject("ServiceCatalog")
lazy val awsServiceCatalogAppRegistry = defineAwsProject("ServiceCatalogAppRegistry")
lazy val awsServiceDiscovery = defineAwsProject("ServiceDiscovery")
lazy val awsServiceQuotas = defineAwsProject("ServiceQuotas")
lazy val awsShield = defineAwsProject("Shield")
lazy val awsSigner = defineAwsProject("Signer")
lazy val awsSimpleDB = defineAwsProject("SimpleDB")
lazy val awsSnowDeviceManagement = defineAwsProject("SnowDeviceManagement")
lazy val awsSnowball = defineAwsProject("Snowball")
lazy val awsStepFunctions = defineAwsProject("StepFunctions")
lazy val awsStorageGateway = defineAwsProject("StorageGateway")
lazy val awsSupport = defineAwsProject("Support")
lazy val awsSynthetics = defineAwsProject("Synthetics")
lazy val awsTextract = defineAwsProject("Textract")
lazy val awsTimestreamQuery = defineAwsProject("TimestreamQuery")
lazy val awsTimestreamWrite = defineAwsProject("TimestreamWrite")
lazy val awsTranscribeService = defineAwsProject("TranscribeService")
lazy val awsTransfer = defineAwsProject("Transfer")
lazy val awsTranslate = defineAwsProject("Translate")
lazy val awsVoiceID = defineAwsProject("VoiceID")
lazy val awsWAF = defineAwsProject("WAF")
lazy val awsWAFRegional = defineAwsProject("WAFRegional")
lazy val awsWAFv2 = defineAwsProject("WAFv2")
lazy val awsWellArchitected = defineAwsProject("WellArchitected")
lazy val awsWisdom = defineAwsProject("Wisdom")
lazy val awsWorkDocs = defineAwsProject("WorkDocs")
lazy val awsWorkLink = defineAwsProject("WorkLink")
lazy val awsWorkMail = defineAwsProject("WorkMail")
lazy val awsWorkMailMessageFlow = defineAwsProject("WorkMailMessageFlow")
lazy val awsWorkSpaces = defineAwsProject("WorkSpaces")
lazy val awsWorkSpacesWeb = defineAwsProject("WorkSpacesWeb")
lazy val awsXRay = defineAwsProject("XRay")
lazy val subProjects: Seq[Project] = Seq(
  core,
  credentials,
  dynamodbShared,
  awsACM,
  awsACMPCA,
  awsAPIGateway,
  awsAccessAnalyzer,
  awsAccount,
  awsAlexaForBusiness,
  awsAmp,
  awsAmplify,
  awsAmplifyBackend,
  awsAmplifyUIBuilder,
  awsApiGatewayManagementApi,
  awsApiGatewayV2,
  awsAppConfig,
  awsAppConfigData,
  awsAppIntegrations,
  awsAppMesh,
  awsAppRunner,
  awsAppStream,
  awsAppSync,
  awsAppflow,
  awsApplicationAutoScaling,
  awsApplicationCostProfiler,
  awsApplicationDiscovery,
  awsApplicationInsights,
  awsAthena,
  awsAuditManager,
  awsAugmentedAIRuntime,
  awsAutoScaling,
  awsAutoScalingPlans,
  awsBackup,
  awsBackupGateway,
  awsBatch,
  awsBraket,
  awsBudgetsService,
  awsCUR,
  awsChime,
  awsChimeSDKIdentity,
  awsChimeSDKMeetings,
  awsChimeSDKMessaging,
  awsCloud9,
  awsCloudControl,
  awsCloudDirectory,
  awsCloudFormation,
  awsCloudFront,
  awsCloudHSM,
  awsCloudHSMV2,
  awsCloudSearch,
  awsCloudSearchDomain,
  awsCloudTrail,
  awsCloudWatch,
  awsCloudWatchEvents,
  awsCloudWatchLogs,
  awsCodeArtifact,
  awsCodeBuild,
  awsCodeCommit,
  awsCodeDeploy,
  awsCodeGuruProfiler,
  awsCodeGuruReviewer,
  awsCodePipeline,
  awsCodeStar,
  awsCodeStarNotifications,
  awsCodeStarconnections,
  awsCognitoIdentity,
  awsCognitoIdentityProvider,
  awsCognitoSync,
  awsComprehend,
  awsComprehendMedical,
  awsComputeOptimizer,
  awsConfigService,
  awsConnect,
  awsConnectContactLens,
  awsConnectParticipant,
  awsCostExplorer,
  awsCustomerProfiles,
  awsDAX,
  awsDLM,
  awsDMS,
  awsDRS,
  awsDataBrew,
  awsDataExchange,
  awsDataPipeline,
  awsDataSync,
  awsDetective,
  awsDevOpsGuru,
  awsDeviceFarm,
  awsDirectConnect,
  awsDirectoryService,
  awsDocDB,
  awsDynamoDB,
  awsDynamoDBStreams,
  awsEBS,
  awsEC2,
  awsEC2InstanceConnect,
  awsECR,
  awsECRPUBLIC,
  awsECS,
  awsEFS,
  awsEKS,
  awsELB,
  awsELBv2,
  awsEMR,
  awsEMRcontainers,
  awsES,
  awsElastiCache,
  awsElasticBeanstalk,
  awsElasticInference,
  awsElasticTranscoder,
  awsEventBridge,
  awsEvidently,
  awsFMS,
  awsFSx,
  awsFinSpace,
  awsFinSpaceData,
  awsFirehose,
  awsFis,
  awsForecast,
  awsForecastQuery,
  awsFraudDetector,
  awsGameLift,
  awsGlacier,
  awsGlobalAccelerator,
  awsGlue,
  awsGrafana,
  awsGreengrass,
  awsGreengrassV2,
  awsGroundStation,
  awsGuardDuty,
  awsHealth,
  awsHealthLake,
  awsHoneycode,
  awsIAM,
  awsIVS,
  awsIdentityStore,
  awsImagebuilder,
  awsImportExport,
  awsInspector,
  awsInspector2,
  awsIoT1ClickDevicesService,
  awsIoT1ClickProjects,
  awsIoTAnalytics,
  awsIoTEvents,
  awsIoTEventsData,
  awsIoTFleetHub,
  awsIoTJobsDataPlane,
  awsIoTSecureTunneling,
  awsIoTSiteWise,
  awsIoTThingsGraph,
  awsIoTTwinMaker,
  awsIoTWireless,
  awsIot,
  awsIotData,
  awsIotDeviceAdvisor,
  awsKMS,
  awsKafka,
  awsKafkaConnect,
  awsKendra,
  awsKinesis,
  awsKinesisAnalytics,
  awsKinesisAnalyticsV2,
  awsKinesisVideo,
  awsKinesisVideoArchivedMedia,
  awsKinesisVideoMedia,
  awsKinesisVideoSignaling,
  awsLakeFormation,
  awsLambda,
  awsLexModelBuildingService,
  awsLexModelsV2,
  awsLexRuntime,
  awsLexRuntimeV2,
  awsLicenseManager,
  awsLightsail,
  awsLocation,
  awsLookoutEquipment,
  awsLookoutMetrics,
  awsLookoutVision,
  awsMQ,
  awsMTurk,
  awsMWAA,
  awsMachineLearning,
  awsMacie,
  awsMacie2,
  awsManagedBlockchain,
  awsMarketplaceCatalog,
  awsMarketplaceCommerceAnalytics,
  awsMarketplaceEntitlementService,
  awsMarketplaceMetering,
  awsMediaConnect,
  awsMediaConvert,
  awsMediaLive,
  awsMediaPackage,
  awsMediaPackageVod,
  awsMediaStore,
  awsMediaStoreData,
  awsMediaTailor,
  awsMemoryDB,
  awsMgn,
  awsMigrationHub,
  awsMigrationHubConfig,
  awsMigrationHubRefactorSpaces,
  awsMigrationHubStrategy,
  awsMobile,
  awsMobileAnalytics,
  awsNeptune,
  awsNetworkFirewall,
  awsNetworkManager,
  awsNimble,
  awsOpenSearch,
  awsOpsWorks,
  awsOpsWorksCM,
  awsOrganizations,
  awsOutposts,
  awsPI,
  awsPanorama,
  awsPersonalize,
  awsPersonalizeEvents,
  awsPersonalizeRuntime,
  awsPinpoint,
  awsPinpointEmail,
  awsPinpointSMSVoice,
  awsPolly,
  awsPricing,
  awsProton,
  awsQLDB,
  awsQLDBSession,
  awsQuickSight,
  awsRAM,
  awsRBin,
  awsRDS,
  awsRDSDataService,
  awsRUM,
  awsRedshift,
  awsRedshiftData,
  awsRekognition,
  awsResilienceHub,
  awsResourceGroups,
  awsResourceGroupsTaggingAPI,
  awsRoboMaker,
  awsRoute53,
  awsRoute53Domains,
  awsRoute53RecoveryCluster,
  awsRoute53RecoveryControlConfig,
  awsRoute53RecoveryReadiness,
  awsRoute53Resolver,
  awsS3,
  awsS3Control,
  awsS3Outposts,
  awsSES,
  awsSESv2,
  awsSMS,
  awsSNS,
  awsSQS,
  awsSSM,
  awsSSMContacts,
  awsSSMIncidents,
  awsSSO,
  awsSSOAdmin,
  awsSSOOIDC,
  awsSTS,
  awsSWF,
  awsSageMaker,
  awsSageMakerFeatureStoreRuntime,
  awsSageMakerRuntime,
  awsSagemakerEdge,
  awsSavingsPlans,
  awsSchemas,
  awsSecretsManager,
  awsSecurityHub,
  awsServerlessApplicationRepository,
  awsServiceCatalog,
  awsServiceCatalogAppRegistry,
  awsServiceDiscovery,
  awsServiceQuotas,
  awsShield,
  awsSigner,
  awsSimpleDB,
  awsSnowDeviceManagement,
  awsSnowball,
  awsStepFunctions,
  awsStorageGateway,
  awsSupport,
  awsSynthetics,
  awsTextract,
  awsTimestreamQuery,
  awsTimestreamWrite,
  awsTranscribeService,
  awsTransfer,
  awsTranslate,
  awsVoiceID,
  awsWAF,
  awsWAFRegional,
  awsWAFv2,
  awsWellArchitected,
  awsWisdom,
  awsWorkDocs,
  awsWorkLink,
  awsWorkMail,
  awsWorkMailMessageFlow,
  awsWorkSpaces,
  awsWorkSpacesWeb,
  awsXRay
)
