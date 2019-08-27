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
      Dependencies.scalajs.nodejs.value
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
        Dependencies.scalajs.nodejs.value
      )
    )
    .enablePlugins(ScalaJSPlugin)
}
lazy val awsACM                             = defineAwsProject("ACM")
lazy val awsACMPCA                          = defineAwsProject("ACMPCA")
lazy val awsAlexaForBusiness                = defineAwsProject("AlexaForBusiness")
lazy val awsAmplify                         = defineAwsProject("Amplify")
lazy val awsAPIGateway                      = defineAwsProject("APIGateway")
lazy val awsApiGatewayManagementApi         = defineAwsProject("ApiGatewayManagementApi")
lazy val awsApiGatewayV2                    = defineAwsProject("ApiGatewayV2")
lazy val awsApplicationAutoScaling          = defineAwsProject("ApplicationAutoScaling")
lazy val awsApplicationDiscovery            = defineAwsProject("ApplicationDiscovery")
lazy val awsAppMesh                         = defineAwsProject("AppMesh")
lazy val awsAppStream                       = defineAwsProject("AppStream")
lazy val awsAppSync                         = defineAwsProject("AppSync")
lazy val awsAthena                          = defineAwsProject("Athena")
lazy val awsAutoScaling                     = defineAwsProject("AutoScaling")
lazy val awsAutoScalingPlans                = defineAwsProject("AutoScalingPlans")
lazy val awsBackup                          = defineAwsProject("Backup")
lazy val awsBatch                           = defineAwsProject("Batch")
lazy val awsBudgetsService                  = defineAwsProject("BudgetsService")
lazy val awsChime                           = defineAwsProject("Chime")
lazy val awsCloud9                          = defineAwsProject("Cloud9")
lazy val awsCloudDirectory                  = defineAwsProject("CloudDirectory")
lazy val awsCloudFormation                  = defineAwsProject("CloudFormation")
lazy val awsCloudFront                      = defineAwsProject("CloudFront")
lazy val awsCloudFrontSigner                = defineAwsProject("CloudFrontSigner")
lazy val awsCloudHSM                        = defineAwsProject("CloudHSM")
lazy val awsCloudHSMV2                      = defineAwsProject("CloudHSMV2")
lazy val awsCloudSearch                     = defineAwsProject("CloudSearch")
lazy val awsCloudSearchDomain               = defineAwsProject("CloudSearchDomain")
lazy val awsCloudTrail                      = defineAwsProject("CloudTrail")
lazy val awsCloudWatch                      = defineAwsProject("CloudWatch")
lazy val awsCloudWatchEvents                = defineAwsProject("CloudWatchEvents")
lazy val awsCloudWatchLogs                  = defineAwsProject("CloudWatchLogs")
lazy val awsCodeBuild                       = defineAwsProject("CodeBuild")
lazy val awsCodeCommit                      = defineAwsProject("CodeCommit")
lazy val awsCodeDeploy                      = defineAwsProject("CodeDeploy")
lazy val awsCodePipeline                    = defineAwsProject("CodePipeline")
lazy val awsCodeStar                        = defineAwsProject("CodeStar")
lazy val awsCognitoIdentity                 = defineAwsProject("CognitoIdentity")
lazy val awsCognitoIdentityProvider         = defineAwsProject("CognitoIdentityProvider")
lazy val awsCognitoSync                     = defineAwsProject("CognitoSync")
lazy val awsComprehend                      = defineAwsProject("Comprehend")
lazy val awsComprehendMedical               = defineAwsProject("ComprehendMedical")
lazy val awsConfigService                   = defineAwsProject("ConfigService")
lazy val awsConnect                         = defineAwsProject("Connect")
lazy val awsCostExplorer                    = defineAwsProject("CostExplorer")
lazy val awsCUR                             = defineAwsProject("CUR")
lazy val awsDataPipeline                    = defineAwsProject("DataPipeline")
lazy val awsDataSync                        = defineAwsProject("DataSync")
lazy val awsDAX                             = defineAwsProject("DAX")
lazy val awsDeviceFarm                      = defineAwsProject("DeviceFarm")
lazy val awsDirectConnect                   = defineAwsProject("DirectConnect")
lazy val awsDirectoryService                = defineAwsProject("DirectoryService")
lazy val awsDLM                             = defineAwsProject("DLM")
lazy val awsDMS                             = defineAwsProject("DMS")
lazy val awsDocDb                           = defineAwsProject("DocDB")
lazy val awsDynamoDB                        = defineAwsProject("DynamoDB").settings(libraryDependencies += Dependencies.shared.compat.value)
lazy val awsDynamoDBStreams                 = defineAwsProject("DynamoDBStreams")
lazy val awsEC2                             = defineAwsProject("EC2")
lazy val awsEC2InstanceConnect              = defineAwsProject("EC2InstanceConnect")
lazy val awsECR                             = defineAwsProject("ECR")
lazy val awsECS                             = defineAwsProject("ECS")
lazy val awsEFS                             = defineAwsProject("EFS")
lazy val awsEKS                             = defineAwsProject("EKS")
lazy val awsElastiCache                     = defineAwsProject("ElastiCache")
lazy val awsElasticBeanstalk                = defineAwsProject("ElasticBeanstalk")
lazy val awsElasticTranscoder               = defineAwsProject("ElasticTranscoder")
lazy val awsELB                             = defineAwsProject("ELB")
lazy val awsELBv2                           = defineAwsProject("ELBv2")
lazy val awsEMR                             = defineAwsProject("EMR")
lazy val awsES                              = defineAwsProject("ES")
lazy val awsEventBridge                     = defineAwsProject("EventBridge")
lazy val awsFirehose                        = defineAwsProject("Firehose")
lazy val awsFMS                             = defineAwsProject("FMS")
lazy val awsForecast                        = defineAwsProject("Forecast")
lazy val awsForecastQuery                   = defineAwsProject("ForecastQuery")
lazy val awsFSx                             = defineAwsProject("FSx")
lazy val awsGameLift                        = defineAwsProject("GameLift")
lazy val awsGlacier                         = defineAwsProject("Glacier")
lazy val awsGlobalAccelerator               = defineAwsProject("GlobalAccelerator")
lazy val awsGlue                            = defineAwsProject("Glue")
lazy val awsGreengrass                      = defineAwsProject("Greengrass")
lazy val awsGroundStation                   = defineAwsProject("GroundStation")
lazy val awsGuardDuty                       = defineAwsProject("GuardDuty")
lazy val awsHealth                          = defineAwsProject("Health")
lazy val awsIAM                             = defineAwsProject("IAM")
lazy val awsImportExport                    = defineAwsProject("ImportExport")
lazy val awsInspector                       = defineAwsProject("Inspector")
lazy val awsIot                             = defineAwsProject("Iot")
lazy val awsIoT1ClickDevicesService         = defineAwsProject("IoT1ClickDevicesService")
lazy val awsIoT1ClickProjects               = defineAwsProject("IoT1ClickProjects")
lazy val awsIoTAnalytics                    = defineAwsProject("IoTAnalytics")
lazy val awsIotData                         = defineAwsProject("IotData")
lazy val awsIotEvents                       = defineAwsProject("IotEvents")
lazy val awsIotEventsData                   = defineAwsProject("IotEventsData")
lazy val awsIoTJobsDataPlane                = defineAwsProject("IoTJobsDataPlane")
lazy val awsIotThingsGraph                  = defineAwsProject("IotThingsGraph")
lazy val awsKafka                           = defineAwsProject("Kafka")
lazy val awsKinesis                         = defineAwsProject("Kinesis")
lazy val awsKinesisAnalytics                = defineAwsProject("KinesisAnalytics")
lazy val awsKinesisAnalyticsV2              = defineAwsProject("KinesisAnalyticsV2")
lazy val awsKinesisVideo                    = defineAwsProject("KinesisVideo")
lazy val awsKinesisVideoArchivedMedia       = defineAwsProject("KinesisVideoArchivedMedia")
lazy val awsKinesisVideoMedia               = defineAwsProject("KinesisVideoMedia")
lazy val awsKMS                             = defineAwsProject("KMS")
lazy val awsLakeFormation                   = defineAwsProject("LakeFormation")
lazy val awsLambda                          = defineAwsProject("Lambda")
lazy val awsLexModelBuildingService         = defineAwsProject("LexModelBuildingService")
lazy val awsLexRuntime                      = defineAwsProject("LexRuntime")
lazy val awsLicenseManager                  = defineAwsProject("LicenseManager")
lazy val awsLightsail                       = defineAwsProject("Lightsail")
lazy val awsMachineLearning                 = defineAwsProject("MachineLearning")
lazy val awsMacie                           = defineAwsProject("Macie")
lazy val awsManagedBlockChain               = defineAwsProject("ManagedBlockChain")
lazy val awsMarketplaceCommerceAnalytics    = defineAwsProject("MarketplaceCommerceAnalytics")
lazy val awsMarketplaceEntitlementService   = defineAwsProject("MarketplaceEntitlementService")
lazy val awsMarketplaceMetering             = defineAwsProject("MarketplaceMetering")
lazy val awsMediaConnect                    = defineAwsProject("MediaConnect")
lazy val awsMediaConvert                    = defineAwsProject("MediaConvert")
lazy val awsMediaLive                       = defineAwsProject("MediaLive")
lazy val awsMediaPackage                    = defineAwsProject("MediaPackage")
lazy val awsMediaPackageVod                 = defineAwsProject("MediaPackageVod")
lazy val awsMediaStore                      = defineAwsProject("MediaStore")
lazy val awsMediaStoreData                  = defineAwsProject("MediaStoreData")
lazy val awsMediaTailor                     = defineAwsProject("MediaTailor")
lazy val awsMigrationHub                    = defineAwsProject("MigrationHub")
lazy val awsMobile                          = defineAwsProject("Mobile")
lazy val awsMobileAnalytics                 = defineAwsProject("MobileAnalytics")
lazy val awsMQ                              = defineAwsProject("MQ")
lazy val awsMTurk                           = defineAwsProject("MTurk")
lazy val awsNeptune                         = defineAwsProject("Neptune")
lazy val awsOpsWorks                        = defineAwsProject("OpsWorks")
lazy val awsOpsWorksCM                      = defineAwsProject("OpsWorksCM")
lazy val awsOrganizations                   = defineAwsProject("Organizations")
lazy val awsPersonalize                     = defineAwsProject("Personalize")
lazy val awsPersonalizeEvents               = defineAwsProject("PersonalizeEvents")
lazy val awsPersonalizeRuntime              = defineAwsProject("PersonalizeRuntime")
lazy val awsPI                              = defineAwsProject("PI")
lazy val awsPinpoint                        = defineAwsProject("Pinpoint")
lazy val awsPinpointEmail                   = defineAwsProject("PinpointEmail")
lazy val awsPinpointSMSVoice                = defineAwsProject("PinpointSMSVoice")
lazy val awsPolly                           = defineAwsProject("Polly")
lazy val awsPricing                         = defineAwsProject("Pricing")
lazy val awsQuickSight                      = defineAwsProject("QuickSight")
lazy val awsRAM                             = defineAwsProject("RAM")
lazy val awsRDS                             = defineAwsProject("RDS")
lazy val awsRDSDataService                  = defineAwsProject("RDSDataService")
lazy val awsRedshift                        = defineAwsProject("Redshift")
lazy val awsRekognition                     = defineAwsProject("Rekognition")
lazy val awsResourceGroups                  = defineAwsProject("ResourceGroups")
lazy val awsResourceGroupsTaggingAPI        = defineAwsProject("ResourceGroupsTaggingAPI")
lazy val awsRoboMaker                       = defineAwsProject("RoboMaker")
lazy val awsRoute53                         = defineAwsProject("Route53")
lazy val awsRoute53Domains                  = defineAwsProject("Route53Domains")
lazy val awsRoute53Resolver                 = defineAwsProject("Route53Resolver")
lazy val awsS3                              = defineAwsProject("S3")
lazy val awsS3Control                       = defineAwsProject("S3Control")
lazy val awsSageMaker                       = defineAwsProject("SageMaker")
lazy val awsSageMakerRuntime                = defineAwsProject("SageMakerRuntime")
lazy val awsSecretsManager                  = defineAwsProject("SecretsManager")
lazy val awsSecurityHub                     = defineAwsProject("SecurityHub")
lazy val awsServerlessApplicationRepository = defineAwsProject("ServerlessApplicationRepository")
lazy val awsServiceCatalog                  = defineAwsProject("ServiceCatalog")
lazy val awsServiceDiscovery                = defineAwsProject("ServiceDiscovery")
lazy val awsServiceQuotas                   = defineAwsProject("ServiceQuotas")
lazy val awsSES                             = defineAwsProject("SES")
lazy val awsShield                          = defineAwsProject("Shield")
lazy val awsSigner                          = defineAwsProject("Signer")
lazy val awsSimpleDB                        = defineAwsProject("SimpleDB")
lazy val awsSMS                             = defineAwsProject("SMS")
lazy val awsSnowball                        = defineAwsProject("Snowball")
lazy val awsSNS                             = defineAwsProject("SNS")
lazy val awsSQS                             = defineAwsProject("SQS")
lazy val awsSSM                             = defineAwsProject("SSM")
lazy val awsStepFunctions                   = defineAwsProject("StepFunctions")
lazy val awsStorageGateway                  = defineAwsProject("StorageGateway")
lazy val awsSTS                             = defineAwsProject("STS")
lazy val awsSupport                         = defineAwsProject("Support")
lazy val awsSWF                             = defineAwsProject("SWF")
lazy val awsTextract                        = defineAwsProject("Textract")
lazy val awsTranscribeService               = defineAwsProject("TranscribeService")
lazy val awsTransfer                        = defineAwsProject("Transfer")
lazy val awsTranslate                       = defineAwsProject("Translate")
lazy val awsWAF                             = defineAwsProject("WAF")
lazy val awsWAFRegional                     = defineAwsProject("WAFRegional")
lazy val awsWorkDocs                        = defineAwsProject("WorkDocs")
lazy val awsWorkLink                        = defineAwsProject("WorkLink")
lazy val awsWorkMail                        = defineAwsProject("WorkMail")
lazy val awsWorkSpaces                      = defineAwsProject("WorkSpaces")
lazy val awsXRay                            = defineAwsProject("XRay")

lazy val root = (project in file("."))
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
      Dependencies.scalajs.nodejs.value,
      Dependencies.shared.scalatest.value
    ),
    npmDependencies in Test ++= Seq(
      "aws-sdk" -> "2.473.0"
    )
  )
  .enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)
  .dependsOn(subProjects.map(p => ClasspathDependency(p, None)): _*)

lazy val subProjects: Seq[Project] = Seq(
  core,
  awsACM,
  awsACMPCA,
  awsAlexaForBusiness,
  awsAmplify,
  awsAPIGateway,
  awsApiGatewayManagementApi,
  awsApiGatewayV2,
  awsApplicationAutoScaling,
  awsApplicationAutoScaling,
  awsApplicationDiscovery,
  awsAppMesh,
  awsAppStream,
  awsAppSync,
  awsAthena,
  awsAutoScaling,
  awsAutoScalingPlans,
  awsBackup,
  awsBatch,
  awsBudgetsService,
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
  awsCodePipeline,
  awsCodeStar,
  awsCognitoIdentity,
  awsCognitoIdentityProvider,
  awsCognitoSync,
  awsComprehend,
  awsComprehendMedical,
  awsConfigService,
  awsConnect,
  awsCostExplorer,
  awsCUR,
  awsDataPipeline,
  awsDataSync,
  awsDAX,
  awsDeviceFarm,
  awsDirectConnect,
  awsDirectoryService,
  awsDLM,
  awsDMS,
  awsDocDb,
  awsDynamoDB,
  awsDynamoDBStreams,
  awsEC2,
  awsEC2InstanceConnect,
  awsECR,
  awsECS,
  awsEFS,
  awsEKS,
  awsElastiCache,
  awsElasticBeanstalk,
  awsElasticTranscoder,
  awsELB,
  awsELBv2,
  awsEMR,
  awsES,
  awsEventBridge,
  awsFirehose,
  awsFMS,
  awsForecast,
  awsForecastQuery,
  awsFSx,
  awsGameLift,
  awsGlacier,
  awsGlobalAccelerator,
  awsGlue,
  awsGreengrass,
  awsGroundStation,
  awsGuardDuty,
  awsHealth,
  awsIAM,
  awsImportExport,
  awsInspector,
  awsIot,
  awsIoT1ClickDevicesService,
  awsIoT1ClickProjects,
  awsIoTAnalytics,
  awsIotData,
  awsIotEvents,
  awsIotEventsData,
  awsIoTJobsDataPlane,
  awsIotThingsGraph,
  awsKafka,
  awsKinesis,
  awsKinesisAnalytics,
  awsKinesisAnalyticsV2,
  awsKinesisVideo,
  awsKinesisVideoArchivedMedia,
  awsKinesisVideoMedia,
  awsKMS,
  awsLakeFormation,
  awsLambda,
  awsLexModelBuildingService,
  awsLexRuntime,
  awsLicenseManager,
  awsLightsail,
  awsMachineLearning,
  awsMacie,
  awsManagedBlockChain,
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
  awsMobile,
  awsMobileAnalytics,
  awsMQ,
  awsMTurk,
  awsNeptune,
  awsOpsWorks,
  awsOpsWorksCM,
  awsOrganizations,
  awsPersonalize,
  awsPersonalizeEvents,
  awsPersonalizeRuntime,
  awsPI,
  awsPinpoint,
  awsPinpointEmail,
  awsPinpointSMSVoice,
  awsPolly,
  awsPricing,
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
  awsSageMaker,
  awsSageMakerRuntime,
  awsSecretsManager,
  awsSecurityHub,
  awsServerlessApplicationRepository,
  awsServiceCatalog,
  awsServiceDiscovery,
  awsServiceQuotas,
  awsSES,
  awsShield,
  awsSigner,
  awsSimpleDB,
  awsSMS,
  awsSnowball,
  awsSNS,
  awsSQS,
  awsSSM,
  awsStepFunctions,
  awsStorageGateway,
  awsSTS,
  awsSupport,
  awsSWF,
  awsTextract,
  awsTranscribeService,
  awsTransfer,
  awsTranslate,
  awsWAF,
  awsWAFRegional,
  awsWorkDocs,
  awsWorkLink,
  awsWorkMail,
  awsWorkSpaces,
  awsXRay
)
