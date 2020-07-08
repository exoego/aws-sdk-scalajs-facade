import scala.util._

organization in ThisBuild := "net.exoego"
concurrentRestrictions in ThisBuild += Tags.limit(
  ScalaJSTags.Link,
  max = Try(System.getenv("SCALAJS_LINK_MAX").toInt).getOrElse(4)
)

lazy val core = (project in file("core"))
  .settings(SharedConfig.settings)
  .settings(SharedConfig.publishSetting)
  .settings(
    name := s"${SharedConfig.libraryName}-core",
    libraryDependencies ++= Seq(
    )
  )
  .enablePlugins(ScalaJSPlugin)

def defineAwsProject(service: String): Project = {
  val lowerServiceName = service.toLowerCase
  Project(id = s"aws$service", base = file("services") / lowerServiceName)
    .dependsOn(core)
    .settings(SharedConfig.settings)
    .settings(SharedConfig.publishSetting)
    .settings(
      name := s"${SharedConfig.libraryName}-$lowerServiceName",
      libraryDependencies ++= Seq(
        Dependencies.shared.scalatest.value,
        Dependencies.shared.scalatestHelper.value
      )
    )
    .enablePlugins(ScalaJSPlugin)
}
lazy val awsACM = defineAwsProject("ACM")
lazy val awsACMPCA = defineAwsProject("ACMPCA")
lazy val awsAPIGateway = defineAwsProject("APIGateway")
lazy val awsAccessAnalyzer = defineAwsProject("AccessAnalyzer")
lazy val awsAlexaForBusiness = defineAwsProject("AlexaForBusiness")
lazy val awsAmplify = defineAwsProject("Amplify")
lazy val awsApiGatewayManagementApi = defineAwsProject("ApiGatewayManagementApi")
lazy val awsApiGatewayV2 = defineAwsProject("ApiGatewayV2")
lazy val awsAppConfig = defineAwsProject("AppConfig")
lazy val awsAppMesh = defineAwsProject("AppMesh")
lazy val awsAppStream = defineAwsProject("AppStream")
lazy val awsAppSync = defineAwsProject("AppSync")
lazy val awsApplicationAutoScaling = defineAwsProject("ApplicationAutoScaling")
lazy val awsApplicationDiscovery = defineAwsProject("ApplicationDiscovery")
lazy val awsApplicationInsights = defineAwsProject("ApplicationInsights")
lazy val awsAthena = defineAwsProject("Athena")
lazy val awsAugmentedAIRuntime = defineAwsProject("AugmentedAIRuntime")
lazy val awsAutoScaling = defineAwsProject("AutoScaling")
lazy val awsAutoScalingPlans = defineAwsProject("AutoScalingPlans")
lazy val awsBackup = defineAwsProject("Backup")
lazy val awsBatch = defineAwsProject("Batch")
lazy val awsBudgetsService = defineAwsProject("BudgetsService")
lazy val awsCUR = defineAwsProject("CUR")
lazy val awsChime = defineAwsProject("Chime")
lazy val awsCloud9 = defineAwsProject("Cloud9")
lazy val awsCloudDirectory = defineAwsProject("CloudDirectory")
lazy val awsCloudFormation = defineAwsProject("CloudFormation")
lazy val awsCloudFront = defineAwsProject("CloudFront")
lazy val awsCloudFrontSigner = defineAwsProject("CloudFrontSigner")
lazy val awsCloudHSM = defineAwsProject("CloudHSM")
lazy val awsCloudHSMV2 = defineAwsProject("CloudHSMV2")
lazy val awsCloudSearch = defineAwsProject("CloudSearch")
lazy val awsCloudSearchDomain = defineAwsProject("CloudSearchDomain")
lazy val awsCloudTrail = defineAwsProject("CloudTrail")
lazy val awsCloudWatch = defineAwsProject("CloudWatch")
lazy val awsCloudWatchEvents = defineAwsProject("CloudWatchEvents")
lazy val awsCloudWatchLogs = defineAwsProject("CloudWatchLogs")
lazy val awsCodeBuild = defineAwsProject("CodeBuild")
lazy val awsCodeCommit = defineAwsProject("CodeCommit")
lazy val awsCodeDeploy = defineAwsProject("CodeDeploy")
lazy val awsCodeGuruProfiler = defineAwsProject("CodeGuruProfiler")
lazy val awsCodeGuruReviewer = defineAwsProject("CodeGuruReviewer")
lazy val awsCodePipeline = defineAwsProject("CodePipeline")
lazy val awsCodeStar = defineAwsProject("CodeStar")
lazy val awsCodeStarconnections = defineAwsProject("CodeStarconnections")
lazy val awsCodeStarNotifications = defineAwsProject("CodeStarNotifications")
lazy val awsCognitoIdentity = defineAwsProject("CognitoIdentity")
lazy val awsCognitoIdentityProvider = defineAwsProject("CognitoIdentityProvider")
lazy val awsCognitoSync = defineAwsProject("CognitoSync")
lazy val awsComprehend = defineAwsProject("Comprehend")
lazy val awsComprehendMedical = defineAwsProject("ComprehendMedical")
lazy val awsComputeOptimizer = defineAwsProject("ComputeOptimizer")
lazy val awsConfigService = defineAwsProject("ConfigService")
lazy val awsConnect = defineAwsProject("Connect")
lazy val awsConnectParticipant = defineAwsProject("ConnectParticipant")
lazy val awsCostExplorer = defineAwsProject("CostExplorer")
lazy val awsDAX = defineAwsProject("DAX")
lazy val awsDLM = defineAwsProject("DLM")
lazy val awsDMS = defineAwsProject("DMS")
lazy val awsDataExchange = defineAwsProject("DataExchange")
lazy val awsDataPipeline = defineAwsProject("DataPipeline")
lazy val awsDataSync = defineAwsProject("DataSync")
lazy val awsDetective = defineAwsProject("Detective")
lazy val awsDeviceFarm = defineAwsProject("DeviceFarm")
lazy val awsDirectConnect = defineAwsProject("DirectConnect")
lazy val awsDirectoryService = defineAwsProject("DirectoryService")
lazy val awsDocDb = defineAwsProject("DocDB")
lazy val awsDynamoDB = defineAwsProject("DynamoDB").settings(libraryDependencies += Dependencies.shared.compat.value)
lazy val awsDynamoDBStreams = defineAwsProject("DynamoDBStreams")
lazy val awsEBS = defineAwsProject("EBS")
lazy val awsEC2 = defineAwsProject("EC2")
lazy val awsEC2InstanceConnect = defineAwsProject("EC2InstanceConnect")
lazy val awsECR = defineAwsProject("ECR")
lazy val awsECS = defineAwsProject("ECS")
lazy val awsEFS = defineAwsProject("EFS")
lazy val awsEKS = defineAwsProject("EKS")
lazy val awsELB = defineAwsProject("ELB")
lazy val awsELBv2 = defineAwsProject("ELBv2")
lazy val awsEMR = defineAwsProject("EMR")
lazy val awsES = defineAwsProject("ES")
lazy val awsElastiCache = defineAwsProject("ElastiCache")
lazy val awsElasticBeanstalk = defineAwsProject("ElasticBeanstalk")
lazy val awsElasticInference = defineAwsProject("ElasticInference")
lazy val awsElasticTranscoder = defineAwsProject("ElasticTranscoder")
lazy val awsEventBridge = defineAwsProject("EventBridge")
lazy val awsFMS = defineAwsProject("FMS")
lazy val awsFSx = defineAwsProject("FSx")
lazy val awsFirehose = defineAwsProject("Firehose")
lazy val awsForecast = defineAwsProject("Forecast")
lazy val awsForecastQuery = defineAwsProject("ForecastQuery")
lazy val awsFraudDetector = defineAwsProject("FraudDetector")
lazy val awsGameLift = defineAwsProject("GameLift")
lazy val awsGlacier = defineAwsProject("Glacier")
lazy val awsGlobalAccelerator = defineAwsProject("GlobalAccelerator")
lazy val awsGlue = defineAwsProject("Glue")
lazy val awsGreengrass = defineAwsProject("Greengrass")
lazy val awsGroundStation = defineAwsProject("GroundStation")
lazy val awsGuardDuty = defineAwsProject("GuardDuty")
lazy val awsHealth = defineAwsProject("Health")
lazy val awsIAM = defineAwsProject("IAM")
lazy val awsImagebuilder = defineAwsProject("Imagebuilder")
lazy val awsImportExport = defineAwsProject("ImportExport")
lazy val awsInspector = defineAwsProject("Inspector")
lazy val awsIoT1ClickDevicesService = defineAwsProject("IoT1ClickDevicesService")
lazy val awsIoT1ClickProjects = defineAwsProject("IoT1ClickProjects")
lazy val awsIoTAnalytics = defineAwsProject("IoTAnalytics")
lazy val awsIoTJobsDataPlane = defineAwsProject("IoTJobsDataPlane")
lazy val awsIoTSecureTunneling = defineAwsProject("IoTSecureTunneling")
lazy val awsIot = defineAwsProject("Iot")
lazy val awsIotData = defineAwsProject("IotData")
lazy val awsIotEvents = defineAwsProject("IotEvents")
lazy val awsIotEventsData = defineAwsProject("IotEventsData")
lazy val awsIotThingsGraph = defineAwsProject("IotThingsGraph")
lazy val awsKMS = defineAwsProject("KMS")
lazy val awsKafka = defineAwsProject("Kafka")
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
lazy val awsLexRuntime = defineAwsProject("LexRuntime")
lazy val awsLicenseManager = defineAwsProject("LicenseManager")
lazy val awsLightsail = defineAwsProject("Lightsail")
lazy val awsMQ = defineAwsProject("MQ")
lazy val awsMTurk = defineAwsProject("MTurk")
lazy val awsMachineLearning = defineAwsProject("MachineLearning")
lazy val awsMacie = defineAwsProject("Macie")
lazy val awsManagedBlockChain = defineAwsProject("ManagedBlockChain")
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
lazy val awsMigrationHub = defineAwsProject("MigrationHub")
lazy val awsMigrationHubConfig = defineAwsProject("MigrationHubConfig")
lazy val awsMobile = defineAwsProject("Mobile")
lazy val awsMobileAnalytics = defineAwsProject("MobileAnalytics")
lazy val awsNeptune = defineAwsProject("Neptune")
lazy val awsNetworkManager = defineAwsProject("NetworkManager")
lazy val awsOpsWorks = defineAwsProject("OpsWorks")
lazy val awsOpsWorksCM = defineAwsProject("OpsWorksCM")
lazy val awsOrganizations = defineAwsProject("Organizations")
lazy val awsOutposts = defineAwsProject("Outposts")
lazy val awsPI = defineAwsProject("PI")
lazy val awsPersonalize = defineAwsProject("Personalize")
lazy val awsPersonalizeEvents = defineAwsProject("PersonalizeEvents")
lazy val awsPersonalizeRuntime = defineAwsProject("PersonalizeRuntime")
lazy val awsPinpoint = defineAwsProject("Pinpoint")
lazy val awsPinpointEmail = defineAwsProject("PinpointEmail")
lazy val awsPinpointSMSVoice = defineAwsProject("PinpointSMSVoice")
lazy val awsPolly = defineAwsProject("Polly")
lazy val awsPricing = defineAwsProject("Pricing")
lazy val awsQLDB = defineAwsProject("QLDB")
lazy val awsQLDBSession = defineAwsProject("QLDBSession")
lazy val awsQuickSight = defineAwsProject("QuickSight")
lazy val awsRAM = defineAwsProject("RAM")
lazy val awsRDS = defineAwsProject("RDS")
lazy val awsRDSDataService = defineAwsProject("RDSDataService")
lazy val awsRedshift = defineAwsProject("Redshift")
lazy val awsRekognition = defineAwsProject("Rekognition")
lazy val awsResourceGroups = defineAwsProject("ResourceGroups")
lazy val awsResourceGroupsTaggingAPI = defineAwsProject("ResourceGroupsTaggingAPI")
lazy val awsRoboMaker = defineAwsProject("RoboMaker")
lazy val awsRoute53 = defineAwsProject("Route53")
lazy val awsRoute53Domains = defineAwsProject("Route53Domains")
lazy val awsRoute53Resolver = defineAwsProject("Route53Resolver")
lazy val awsS3 = defineAwsProject("S3")
lazy val awsS3Control = defineAwsProject("S3Control")
lazy val awsSES = defineAwsProject("SES")
lazy val awsSESv2 = defineAwsProject("SESv2")
lazy val awsSMS = defineAwsProject("SMS")
lazy val awsSNS = defineAwsProject("SNS")
lazy val awsSQS = defineAwsProject("SQS")
lazy val awsSSM = defineAwsProject("SSM")
lazy val awsSSO = defineAwsProject("SSO")
lazy val awsSSOOIDC = defineAwsProject("SSOOIDC")
lazy val awsSTS = defineAwsProject("STS")
lazy val awsSWF = defineAwsProject("SWF")
lazy val awsSageMaker = defineAwsProject("SageMaker")
lazy val awsSageMakerRuntime = defineAwsProject("SageMakerRuntime")
lazy val awsSavingsPlans = defineAwsProject("SavingsPlans")
lazy val awsSchemas = defineAwsProject("Schemas")
lazy val awsSecretsManager = defineAwsProject("SecretsManager")
lazy val awsSecurityHub = defineAwsProject("SecurityHub")
lazy val awsServerlessApplicationRepository = defineAwsProject("ServerlessApplicationRepository")
lazy val awsServiceCatalog = defineAwsProject("ServiceCatalog")
lazy val awsServiceDiscovery = defineAwsProject("ServiceDiscovery")
lazy val awsServiceQuotas = defineAwsProject("ServiceQuotas")
lazy val awsShield = defineAwsProject("Shield")
lazy val awsSigner = defineAwsProject("Signer")
lazy val awsSimpleDB = defineAwsProject("SimpleDB")
lazy val awsSnowball = defineAwsProject("Snowball")
lazy val awsStepFunctions = defineAwsProject("StepFunctions")
lazy val awsStorageGateway = defineAwsProject("StorageGateway")
lazy val awsSupport = defineAwsProject("Support")
lazy val awsTextract = defineAwsProject("Textract")
lazy val awsTranscribeService = defineAwsProject("TranscribeService")
lazy val awsTransfer = defineAwsProject("Transfer")
lazy val awsTranslate = defineAwsProject("Translate")
lazy val awsWAF = defineAwsProject("WAF")
lazy val awsWAFRegional = defineAwsProject("WAFRegional")
lazy val awsWAFv2 = defineAwsProject("WAFv2")
lazy val awsWorkDocs = defineAwsProject("WorkDocs")
lazy val awsWorkLink = defineAwsProject("WorkLink")
lazy val awsWorkMail = defineAwsProject("WorkMail")
lazy val awsWorkMailMessageFlow = defineAwsProject("WorkMailMessageFlow")
lazy val awsWorkSpaces = defineAwsProject("WorkSpaces")
lazy val awsXRay = defineAwsProject("XRay")

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
    name := s"${SharedConfig.libraryName}",
    libraryDependencies ++= Seq(
      Dependencies.shared.scalatest.value,
      Dependencies.shared.scalatestHelper.value
    ),
    npmDependencies in Test ++= Seq(
      "aws-sdk" -> "2.596.0"
    )
  )
  .enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)
  .dependsOn(subProjects.map(p => ClasspathDependency(p, None)): _*)

lazy val subProjects: Seq[Project] = Seq(
  core,
  awsACM,
  awsACMPCA,
  awsAPIGateway,
  awsAccessAnalyzer,
  awsAlexaForBusiness,
  awsAmplify,
  awsApiGatewayManagementApi,
  awsApiGatewayV2,
  awsAppConfig,
  awsAppMesh,
  awsAppStream,
  awsAppSync,
  awsApplicationAutoScaling,
  awsApplicationDiscovery,
  awsApplicationInsights,
  awsAthena,
  awsAugmentedAIRuntime,
  awsAutoScaling,
  awsAutoScalingPlans,
  awsBackup,
  awsBatch,
  awsBudgetsService,
  awsCUR,
  awsChime,
  awsCloud9,
  awsCloudDirectory,
  awsCloudFormation,
  awsCloudFront,
  awsCloudFrontSigner,
  awsCloudHSM,
  awsCloudHSMV2,
  awsCloudSearch,
  awsCloudSearchDomain,
  awsCloudTrail,
  awsCloudWatch,
  awsCloudWatchEvents,
  awsCloudWatchLogs,
  awsCodeBuild,
  awsCodeCommit,
  awsCodeDeploy,
  awsCodeGuruProfiler,
  awsCodeGuruReviewer,
  awsCodePipeline,
  awsCodeStar,
  awsCodeStarconnections,
  awsCodeStarNotifications,
  awsCognitoIdentity,
  awsCognitoIdentityProvider,
  awsCognitoSync,
  awsComprehend,
  awsComprehendMedical,
  awsComputeOptimizer,
  awsConfigService,
  awsConnect,
  awsConnectParticipant,
  awsCostExplorer,
  awsDAX,
  awsDLM,
  awsDMS,
  awsDataExchange,
  awsDataPipeline,
  awsDataSync,
  awsDetective,
  awsDeviceFarm,
  awsDirectConnect,
  awsDirectoryService,
  awsDocDb,
  awsDynamoDB,
  awsDynamoDBStreams,
  awsEBS,
  awsEC2,
  awsEC2InstanceConnect,
  awsECR,
  awsECS,
  awsEFS,
  awsEKS,
  awsELB,
  awsELBv2,
  awsEMR,
  awsES,
  awsElastiCache,
  awsElasticBeanstalk,
  awsElasticInference,
  awsElasticTranscoder,
  awsEventBridge,
  awsFMS,
  awsFSx,
  awsFirehose,
  awsForecast,
  awsForecastQuery,
  awsFraudDetector,
  awsGameLift,
  awsGlacier,
  awsGlobalAccelerator,
  awsGlue,
  awsGreengrass,
  awsGroundStation,
  awsGuardDuty,
  awsHealth,
  awsIAM,
  awsImagebuilder,
  awsImportExport,
  awsInspector,
  awsIoT1ClickDevicesService,
  awsIoT1ClickProjects,
  awsIoTAnalytics,
  awsIoTJobsDataPlane,
  awsIoTSecureTunneling,
  awsIot,
  awsIotData,
  awsIotEvents,
  awsIotEventsData,
  awsIotThingsGraph,
  awsKMS,
  awsKafka,
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
  awsLexRuntime,
  awsLicenseManager,
  awsLightsail,
  awsMQ,
  awsMTurk,
  awsMachineLearning,
  awsMacie,
  awsManagedBlockChain,
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
  awsMigrationHub,
  awsMigrationHubConfig,
  awsMobile,
  awsMobileAnalytics,
  awsNeptune,
  awsNetworkManager,
  awsOpsWorks,
  awsOpsWorksCM,
  awsOrganizations,
  awsOutposts,
  awsPI,
  awsPersonalize,
  awsPersonalizeEvents,
  awsPersonalizeRuntime,
  awsPinpoint,
  awsPinpointEmail,
  awsPinpointSMSVoice,
  awsPolly,
  awsPricing,
  awsQLDB,
  awsQLDBSession,
  awsQuickSight,
  awsRAM,
  awsRDS,
  awsRDSDataService,
  awsRedshift,
  awsRekognition,
  awsResourceGroups,
  awsResourceGroupsTaggingAPI,
  awsRoboMaker,
  awsRoute53,
  awsRoute53Domains,
  awsRoute53Resolver,
  awsS3,
  awsS3Control,
  awsSES,
  awsSESv2,
  awsSMS,
  awsSNS,
  awsSQS,
  awsSSM,
  awsSSO,
  awsSSOOIDC,
  awsSTS,
  awsSWF,
  awsSageMaker,
  awsSageMakerRuntime,
  awsSavingsPlans,
  awsSchemas,
  awsSecretsManager,
  awsSecurityHub,
  awsServerlessApplicationRepository,
  awsServiceCatalog,
  awsServiceDiscovery,
  awsServiceQuotas,
  awsShield,
  awsSigner,
  awsSimpleDB,
  awsSnowball,
  awsStepFunctions,
  awsStorageGateway,
  awsSupport,
  awsTextract,
  awsTranscribeService,
  awsTransfer,
  awsTranslate,
  awsWAF,
  awsWAFRegional,
  awsWAFv2,
  awsWorkDocs,
  awsWorkLink,
  awsWorkMail,
  awsWorkMailMessageFlow,
  awsWorkSpaces,
  awsXRay
)
