import ReleaseTransformations._

val SupportedScalaVersions = List("2.12.8", "2.13.0")
val Organization           = "net.exoego"
val libraryName            = "aws-sdk-scalajs-facade"

lazy val core = project
  .settings(
    organization := Organization,
    name := s"$libraryName-core",
    crossScalaVersions := SupportedScalaVersions,
    scalacOptions ++= Seq("-P:scalajs:sjsDefinedByDefault", "-deprecation"),
    scalaJSModuleKind := ModuleKind.CommonJSModule,
    libraryDependencies ++= Seq(
      "net.exoego" %%% "scala-js-nodejs-v8" % "0.8.0"
    )
  )
  .enablePlugins(ScalaJSPlugin)

lazy val root = (project in file("."))
  .dependsOn(core)
  .dependsOn(
    awsACM,
    awsACMPCA,
    awsAlexaForBusiness,
    awsAmplify,
    awsAPIGateway,
    awsApiGatewayV2,
    awsApiGatewayManagementApi,
    awsApplicationAutoScaling,
    awsAppMesh,
    awsAppStream,
    awsAppSync,
    awsAthena,
    awsAutoScaling,
    awsMigrationHub,
    awsBatch,
    awsBudgetsService,
    awsCostExplorer,
    awsChime,
    awsCloud9,
    awsCloudDirectory,
    awsCloudFormation,
    awsCloudFront,
    awsCloudHSM,
    awsCloudHSMV2,
    awsCloudSearch,
    awsCloudSearchDomain,
    awsCloudTrail,
    awsCodeDeploy,
    awsCodeCommit,
    awsCodeStar,
    awsCognitoIdentityProvider,
    awsCognitoIdentity,
    awsCognitoSync,
    awsComprehend,
    awsComprehendMedical,
    awsConfigService,
    awsConnect,
    awsCUR,
    awsDataPipeline,
    awsDataSync,
    awsDAX,
    awsDeviceFarm,
    awsDirectConnect,
    awsApplicationDiscovery,
    awsDLM,
    awsDMS,
    awsDirectoryService,
    awsDynamoDB,
    awsEC2,
    awsECR,
    awsECS,
    awsEKS,
    awsElastiCache,
    awsElasticBeanstalk,
    awsEFS,
    awsELB,
    awsELBv2,
    awsEMR,
    awsElasticTranscoder,
    awsSES,
    awsMarketplaceEntitlementService,
    awsES,
    awsCloudWatchEvents,
    awsFirehose,
    awsFMS,
    awsFSx,
    awsGameLift,
    awsGlacier,
    awsGlobalAccelerator,
    awsGlue,
    awsGreengrass,
    awsGuardDuty,
    awsHealth,
    awsIAM,
    awsImportExport,
    awsInspector,
    awsIoT1ClickDevicesService,
    awsIoT1ClickProjects,
    awsIot,
    awsIoTJobsDataPlane,
    awsIoTAnalytics,
    awsKafka,
    awsKinesis,
    awsKinesisVideoArchivedMedia,
    awsKinesisVideoMedia,
    awsKinesisAnalytics,
    awsKinesisAnalyticsV2,
    awsKinesisVideo,
    awsKMS,
    awsLambda,
    awsLexModelBuildingService,
    awsLightsail,
    awsLicenseManager,
    awsCloudWatchLogs,
    awsMachineLearning,
    awsMacie,
    awsMarketplaceCommerceAnalytics,
    awsMediaConnect,
    awsMediaConvert,
    awsMediaLive,
    awsMediaPackage,
    awsMediaStore,
    awsMediaStoreData,
    awsMediaTailor,
    awsMarketplaceMetering,
    awsMobile,
    awsMobileAnalytics,
    awsCloudWatch,
    awsMQ,
    awsMTurk,
    awsNeptune,
    awsOpsWorks,
    awsOpsWorksCM,
    awsOrganizations,
    awsPI,
    awsPinpoint,
    awsPinpointEmail,
    awsPolly,
    awsPricing,
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
    awsLexRuntime,
    awsSageMakerRuntime,
    awsS3,
    awsS3Control,
    awsSageMaker,
    awsSimpleDB,
    awsSecretsManager,
    awsSecurityHub,
    awsServerlessApplicationRepository,
    awsServiceCatalog,
    awsServiceDiscovery,
    awsShield,
    awsSigner,
    awsSMS,
    awsPinpointSMSVoice,
    awsSnowball,
    awsSNS,
    awsSQS,
    awsSSM,
    awsStepFunctions,
    awsStorageGateway,
    awsDynamoDBStreams,
    awsSTS,
    awsSupport,
    awsSWF,
    awsTranscribeService,
    awsTransfer,
    awsTranslate,
    awsWAF,
    awsWAFRegional,
    awsWorkDocs,
    awsWorkMail,
    awsWorkSpaces,
    awsXRay
  )
  .settings(
    organization := Organization,
    name := "aws-sdk-scalajs-facade",
    crossScalaVersions := SupportedScalaVersions,
    scalacOptions ++= Seq("-P:scalajs:sjsDefinedByDefault", "-deprecation"),
    licenses := Seq("APL2" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt")),
    scmInfo := Some(
      ScmInfo(
        url("https://github.com/exoego/aws-sdk-scalajs-facade"),
        "scm:git:git@github.com:exoego/aws-sdk-scalajs-facade.git"
      )
    ),
    homepage := scmInfo.value.map(_.browseUrl),
    developers := List(
      Developer(
        id = "exoego",
        name = "TATSUNO Yasuhiro",
        email = "ytatsuno.jp@gmail.com",
        url = url("https://exoego.net")
      )
    ),
    publishMavenStyle := true,
    publishArtifact in Test := false,
    publishArtifact in (Compile, packageDoc) := true,
    publishArtifact in (Compile, packageSrc) := true,
    pomIncludeRepository := { _ =>
      false
    },
    publishTo := Some(
      if (isSnapshot.value)
        Opts.resolver.sonatypeSnapshots
      else
        Opts.resolver.sonatypeStaging
    ),
    publishConfiguration := publishConfiguration.value.withOverwrite(true),
    publishLocalConfiguration := publishLocalConfiguration.value.withOverwrite(true),
    publishArtifact in packageDoc := false,
    sources in (Compile, doc) := Seq.empty,
    releaseProcess := Seq[ReleaseStep](
      checkSnapshotDependencies,
      inquireVersions,
      runClean,
      runTest,
      setReleaseVersion,
      commitReleaseVersion,
      tagRelease,
      releaseStepCommandAndRemaining("+publishSigned"),
      setNextVersion,
      commitNextVersion,
      releaseStepCommand("sonatypeReleaseAll")
    ),
    skip in packageJSDependencies := false,
    scalaJSModuleKind := ModuleKind.CommonJSModule,
    libraryDependencies ++= Seq(
      "net.exoego" %%% "scala-js-nodejs-v8" % "0.8.0"
    )
  )
  .enablePlugins(ScalaJSPlugin)

def defineAwsProject(service: String): Project = {
  Project(id = s"aws$service", base = file("services") / service.toLowerCase)
    .dependsOn(core)
    .settings(
      organization := Organization,
      name := s"$libraryName-$service",
      crossScalaVersions := SupportedScalaVersions,
      scalacOptions ++= Seq("-P:scalajs:sjsDefinedByDefault", "-deprecation"),
      scalaJSModuleKind := ModuleKind.CommonJSModule,
      libraryDependencies ++= Seq(
        "net.exoego" %%% "scala-js-nodejs-v8" % "0.8.0"
      )
    )
    .enablePlugins(ScalaJSPlugin)
}
lazy val awsACM = defineAwsProject("ACM")
lazy val awsACMPCA = defineAwsProject("ACMPCA")
lazy val awsAlexaForBusiness = defineAwsProject("AlexaForBusiness")
lazy val awsAmplify = defineAwsProject("Amplify")
lazy val awsAPIGateway = defineAwsProject("APIGateway")
lazy val awsApiGatewayV2 = defineAwsProject("ApiGatewayV2")
lazy val awsApiGatewayManagementApi = defineAwsProject("ApiGatewayManagementApi")
lazy val awsApplicationAutoScaling = defineAwsProject("ApplicationAutoScaling")
lazy val awsAppMesh = defineAwsProject("AppMesh")
lazy val awsAppStream = defineAwsProject("AppStream")
lazy val awsAppSync = defineAwsProject("AppSync")
lazy val awsAthena = defineAwsProject("Athena")
lazy val awsAutoScaling = defineAwsProject("AutoScaling")
lazy val awsMigrationHub = defineAwsProject("MigrationHub")
lazy val awsBatch = defineAwsProject("Batch")
lazy val awsBudgetsService = defineAwsProject("BudgetsService")
lazy val awsCostExplorer = defineAwsProject("CostExplorer")
lazy val awsChime = defineAwsProject("Chime")
lazy val awsCloud9 = defineAwsProject("Cloud9")
lazy val awsCloudDirectory = defineAwsProject("CloudDirectory")
lazy val awsCloudFormation = defineAwsProject("CloudFormation")
lazy val awsCloudFront = defineAwsProject("CloudFront")
lazy val awsCloudHSM = defineAwsProject("CloudHSM")
lazy val awsCloudHSMV2 = defineAwsProject("CloudHSMV2")
lazy val awsCloudSearch = defineAwsProject("CloudSearch")
lazy val awsCloudSearchDomain = defineAwsProject("CloudSearchDomain")
lazy val awsCloudTrail = defineAwsProject("CloudTrail")
lazy val awsCodeDeploy = defineAwsProject("CodeDeploy")
lazy val awsCodeCommit = defineAwsProject("CodeCommit")
lazy val awsCodeStar = defineAwsProject("CodeStar")
lazy val awsCognitoIdentityProvider = defineAwsProject("CognitoIdentityProvider")
lazy val awsCognitoIdentity = defineAwsProject("CognitoIdentity")
lazy val awsCognitoSync = defineAwsProject("CognitoSync")
lazy val awsComprehend = defineAwsProject("Comprehend")
lazy val awsComprehendMedical = defineAwsProject("ComprehendMedical")
lazy val awsConfigService = defineAwsProject("ConfigService")
lazy val awsConnect = defineAwsProject("Connect")
lazy val awsCUR = defineAwsProject("CUR")
lazy val awsDataPipeline = defineAwsProject("DataPipeline")
lazy val awsDataSync = defineAwsProject("DataSync")
lazy val awsDAX = defineAwsProject("DAX")
lazy val awsDeviceFarm = defineAwsProject("DeviceFarm")
lazy val awsDirectConnect = defineAwsProject("DirectConnect")
lazy val awsApplicationDiscovery = defineAwsProject("ApplicationDiscovery")
lazy val awsDLM = defineAwsProject("DLM")
lazy val awsDMS = defineAwsProject("DMS")
lazy val awsDirectoryService = defineAwsProject("DirectoryService")
lazy val awsDynamoDB = defineAwsProject("DynamoDB")
lazy val awsEC2 = defineAwsProject("EC2")
lazy val awsECR = defineAwsProject("ECR")
lazy val awsECS = defineAwsProject("ECS")
lazy val awsEKS = defineAwsProject("EKS")
lazy val awsElastiCache = defineAwsProject("ElastiCache")
lazy val awsElasticBeanstalk = defineAwsProject("ElasticBeanstalk")
lazy val awsEFS = defineAwsProject("EFS")
lazy val awsELB = defineAwsProject("ELB")
lazy val awsELBv2 = defineAwsProject("ELBv2")
lazy val awsEMR = defineAwsProject("EMR")
lazy val awsElasticTranscoder = defineAwsProject("ElasticTranscoder")
lazy val awsSES = defineAwsProject("SES")
lazy val awsMarketplaceEntitlementService = defineAwsProject("MarketplaceEntitlementService")
lazy val awsES = defineAwsProject("ES")
lazy val awsCloudWatchEvents = defineAwsProject("CloudWatchEvents")
lazy val awsFirehose = defineAwsProject("Firehose")
lazy val awsFMS = defineAwsProject("FMS")
lazy val awsFSx = defineAwsProject("FSx")
lazy val awsGameLift = defineAwsProject("GameLift")
lazy val awsGlacier = defineAwsProject("Glacier")
lazy val awsGlobalAccelerator = defineAwsProject("GlobalAccelerator")
lazy val awsGlue = defineAwsProject("Glue")
lazy val awsGreengrass = defineAwsProject("Greengrass")
lazy val awsGuardDuty = defineAwsProject("GuardDuty")
lazy val awsHealth = defineAwsProject("Health")
lazy val awsIAM = defineAwsProject("IAM")
lazy val awsImportExport = defineAwsProject("ImportExport")
lazy val awsInspector = defineAwsProject("Inspector")
lazy val awsIoT1ClickDevicesService = defineAwsProject("IoT1ClickDevicesService")
lazy val awsIoT1ClickProjects = defineAwsProject("IoT1ClickProjects")
lazy val awsIot = defineAwsProject("Iot")
lazy val awsIoTJobsDataPlane = defineAwsProject("IoTJobsDataPlane")
lazy val awsIoTAnalytics = defineAwsProject("IoTAnalytics")
lazy val awsKafka = defineAwsProject("Kafka")
lazy val awsKinesis = defineAwsProject("Kinesis")
lazy val awsKinesisVideoArchivedMedia = defineAwsProject("KinesisVideoArchivedMedia")
lazy val awsKinesisVideoMedia = defineAwsProject("KinesisVideoMedia")
lazy val awsKinesisAnalytics = defineAwsProject("KinesisAnalytics")
lazy val awsKinesisAnalyticsV2 = defineAwsProject("KinesisAnalyticsV2")
lazy val awsKinesisVideo = defineAwsProject("KinesisVideo")
lazy val awsKMS = defineAwsProject("KMS")
lazy val awsLambda = defineAwsProject("Lambda")
lazy val awsLexModelBuildingService = defineAwsProject("LexModelBuildingService")
lazy val awsLightsail = defineAwsProject("Lightsail")
lazy val awsLicenseManager = defineAwsProject("LicenseManager")
lazy val awsCloudWatchLogs = defineAwsProject("CloudWatchLogs")
lazy val awsMachineLearning = defineAwsProject("MachineLearning")
lazy val awsMacie = defineAwsProject("Macie")
lazy val awsMarketplaceCommerceAnalytics = defineAwsProject("MarketplaceCommerceAnalytics")
lazy val awsMediaConnect = defineAwsProject("MediaConnect")
lazy val awsMediaConvert = defineAwsProject("MediaConvert")
lazy val awsMediaLive = defineAwsProject("MediaLive")
lazy val awsMediaPackage = defineAwsProject("MediaPackage")
lazy val awsMediaStore = defineAwsProject("MediaStore")
lazy val awsMediaStoreData = defineAwsProject("MediaStoreData")
lazy val awsMediaTailor = defineAwsProject("MediaTailor")
lazy val awsMarketplaceMetering = defineAwsProject("MarketplaceMetering")
lazy val awsMobile = defineAwsProject("Mobile")
lazy val awsMobileAnalytics = defineAwsProject("MobileAnalytics")
lazy val awsCloudWatch = defineAwsProject("CloudWatch")
lazy val awsMQ = defineAwsProject("MQ")
lazy val awsMTurk = defineAwsProject("MTurk")
lazy val awsNeptune = defineAwsProject("Neptune")
lazy val awsOpsWorks = defineAwsProject("OpsWorks")
lazy val awsOpsWorksCM = defineAwsProject("OpsWorksCM")
lazy val awsOrganizations = defineAwsProject("Organizations")
lazy val awsPI = defineAwsProject("PI")
lazy val awsPinpoint = defineAwsProject("Pinpoint")
lazy val awsPinpointEmail = defineAwsProject("PinpointEmail")
lazy val awsPolly = defineAwsProject("Polly")
lazy val awsPricing = defineAwsProject("Pricing")
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
lazy val awsLexRuntime = defineAwsProject("LexRuntime")
lazy val awsSageMakerRuntime = defineAwsProject("SageMakerRuntime")
lazy val awsS3 = defineAwsProject("S3")
lazy val awsS3Control = defineAwsProject("S3Control")
lazy val awsSageMaker = defineAwsProject("SageMaker")
lazy val awsSimpleDB = defineAwsProject("SimpleDB")
lazy val awsSecretsManager = defineAwsProject("SecretsManager")
lazy val awsSecurityHub = defineAwsProject("SecurityHub")
lazy val awsServerlessApplicationRepository = defineAwsProject("ServerlessApplicationRepository")
lazy val awsServiceCatalog = defineAwsProject("ServiceCatalog")
lazy val awsServiceDiscovery = defineAwsProject("ServiceDiscovery")
lazy val awsShield = defineAwsProject("Shield")
lazy val awsSigner = defineAwsProject("Signer")
lazy val awsSMS = defineAwsProject("SMS")
lazy val awsPinpointSMSVoice = defineAwsProject("PinpointSMSVoice")
lazy val awsSnowball = defineAwsProject("Snowball")
lazy val awsSNS = defineAwsProject("SNS")
lazy val awsSQS = defineAwsProject("SQS")
lazy val awsSSM = defineAwsProject("SSM")
lazy val awsStepFunctions = defineAwsProject("StepFunctions")
lazy val awsStorageGateway = defineAwsProject("StorageGateway")
lazy val awsDynamoDBStreams = defineAwsProject("DynamoDBStreams")
lazy val awsSTS = defineAwsProject("STS")
lazy val awsSupport = defineAwsProject("Support")
lazy val awsSWF = defineAwsProject("SWF")
lazy val awsTranscribeService = defineAwsProject("TranscribeService")
lazy val awsTransfer = defineAwsProject("Transfer")
lazy val awsTranslate = defineAwsProject("Translate")
lazy val awsWAF = defineAwsProject("WAF")
lazy val awsWAFRegional = defineAwsProject("WAFRegional")
lazy val awsWorkDocs = defineAwsProject("WorkDocs")
lazy val awsWorkMail = defineAwsProject("WorkMail")
lazy val awsWorkSpaces = defineAwsProject("WorkSpaces")
lazy val awsXRay = defineAwsProject("XRay")
