package facade.amazonaws

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("aws-sdk", JSImport.Namespace)
object AWS extends js.Object {
  var config: AWSConfig = js.native

  type ACM = services.acm.ACM
  type ACMPCA = services.acmpca.ACMPCA
  type AlexaForBusiness = services.alexaforbusiness.AlexaForBusiness
  type Amplify = services.amplify.Amplify
  type APIGateway = services.apigateway.APIGateway
  type ApplicationAutoScaling = services.applicationautoscaling.ApplicationAutoScaling
  type AppMesh = services.appmesh.AppMesh
  type AppStream = services.appstream.AppStream
  type AppSync = services.appsync.AppSync
  type Athena = services.athena.Athena
  type AutoScaling = services.autoscaling.AutoScaling
  type MigrationHub = services.migrationhub.MigrationHub
  type Batch = services.batch.Batch
  type BudgetsService = services.budgetsservice.BudgetsService
  type CostExplorer = services.costexplorer.CostExplorer
  type Chime = services.chime.Chime
  type Cloud9 = services.cloud9.Cloud9
  type CloudDirectory = services.clouddirectory.CloudDirectory
  type CloudFormation = services.cloudformation.CloudFormation
  type CloudFront = services.cloudfront.CloudFront
  type CloudHSM = services.cloudhsm.CloudHSM
  type CloudHSMV2 = services.cloudhsmv2.CloudHSMV2
  type CloudSearch = services.cloudsearch.CloudSearch
  type CloudSearchDomain = services.cloudsearchdomain.CloudSearchDomain
  type CloudTrail = services.cloudtrail.CloudTrail
  type CodeDeploy = services.codedeploy.CodeDeploy
  type CodeCommit = services.codecommit.CodeCommit
  type CodeStar = services.codestar.CodeStar
  type CognitoIdentityProvider = services.cognitoidentityprovider.CognitoIdentityProvider
  type CognitoIdentity = services.cognitoidentity.CognitoIdentity
  type CognitoSync = services.cognitosync.CognitoSync
  type Comprehend = services.comprehend.Comprehend
  type ComprehendMedical = services.comprehendmedical.ComprehendMedical
  type ConfigService = services.configservice.ConfigService
  type Connect = services.connect.Connect
  type CUR = services.cur.CUR
  type DataPipeline = services.datapipeline.DataPipeline
  type DataSync = services.datasync.DataSync
  type DAX = services.dax.DAX
  type DeviceFarm = services.devicefarm.DeviceFarm
  type DirectConnect = services.directconnect.DirectConnect
  type ApplicationDiscovery = services.applicationdiscovery.ApplicationDiscovery
  type DLM = services.dlm.DLM
  type DMS = services.dms.DMS
  type DirectoryService = services.directoryservice.DirectoryService
  type DynamoDB = services.dynamodb.DynamoDB
  type EC2 = services.ec2.EC2
  type ECR = services.ecr.ECR
  type ECS = services.ecs.ECS
  type EKS = services.eks.EKS
  type ElastiCache = services.elasticache.ElastiCache
  type ElasticBeanstalk = services.elasticbeanstalk.ElasticBeanstalk
  type EFS = services.efs.EFS
  type ELB = services.elb.ELB
  type ELBv2 = services.elbv2.ELBv2
  type EMR = services.emr.EMR
  type ElasticTranscoder = services.elastictranscoder.ElasticTranscoder
  type SES = services.ses.SES
  type MarketplaceEntitlementService = services.marketplaceentitlementservice.MarketplaceEntitlementService
  type ES = services.es.ES
  type CloudWatchEvents = services.cloudwatchevents.CloudWatchEvents
  type Firehose = services.firehose.Firehose
  type FMS = services.fms.FMS
  type FSx = services.fsx.FSx
  type GameLift = services.gamelift.GameLift
  type Glacier = services.glacier.Glacier
  type GlobalAccelerator = services.globalaccelerator.GlobalAccelerator
  type Glue = services.glue.Glue
  type Greengrass = services.greengrass.Greengrass
  type GuardDuty = services.guardduty.GuardDuty
  type Health = services.health.Health
  type IAM = services.iam.IAM
  type ImportExport = services.importexport.ImportExport
  type Inspector = services.inspector.Inspector
  type IoT1ClickDevicesService = services.iot1clickdevicesservice.IoT1ClickDevicesService
  type IoT1ClickProjects = services.iot1clickprojects.IoT1ClickProjects
  type Iot = services.iot.Iot
  type IoTJobsDataPlane = services.iotjobsdataplane.IoTJobsDataPlane
  type IoTAnalytics = services.iotanalytics.IoTAnalytics
  type Kafka = services.kafka.Kafka
  type Kinesis = services.kinesis.Kinesis
  type KinesisVideoArchivedMedia = services.kinesisvideoarchivedmedia.KinesisVideoArchivedMedia
  type KinesisVideoMedia = services.kinesisvideomedia.KinesisVideoMedia
  type KinesisAnalytics = services.kinesisanalytics.KinesisAnalytics
  type KinesisAnalyticsV2 = services.kinesisanalyticsv2.KinesisAnalyticsV2
  type KinesisVideo = services.kinesisvideo.KinesisVideo
  type KMS = services.kms.KMS
  type Lambda = services.lambda.Lambda
  type LexModelBuildingService = services.lexmodelbuildingservice.LexModelBuildingService
  type Lightsail = services.lightsail.Lightsail
  type LicenseManager = services.licensemanager.LicenseManager
  type CloudWatchLogs = services.cloudwatchlogs.CloudWatchLogs
  type MachineLearning = services.machinelearning.MachineLearning
  type Macie = services.macie.Macie
  type MarketplaceCommerceAnalytics = services.marketplacecommerceanalytics.MarketplaceCommerceAnalytics
  type MediaConnect = services.mediaconnect.MediaConnect
  type MediaConvert = services.mediaconvert.MediaConvert
  type MediaLive = services.medialive.MediaLive
  type MediaPackage = services.mediapackage.MediaPackage
  type MediaStore = services.mediastore.MediaStore
  type MediaStoreData = services.mediastoredata.MediaStoreData
  type MediaTailor = services.mediatailor.MediaTailor
  type MarketplaceMetering = services.marketplacemetering.MarketplaceMetering
  type Mobile = services.mobile.Mobile
  type MobileAnalytics = services.mobileanalytics.MobileAnalytics
  type CloudWatch = services.cloudwatch.CloudWatch
  type MQ = services.mq.MQ
  type MTurk = services.mturk.MTurk
  type Neptune = services.neptune.Neptune
  type OpsWorks = services.opsworks.OpsWorks
  type OpsWorksCM = services.opsworkscm.OpsWorksCM
  type Organizations = services.organizations.Organizations
  type PI = services.pi.PI
  type Pinpoint = services.pinpoint.Pinpoint
  type PinpointEmail = services.pinpointemail.PinpointEmail
  type Polly = services.polly.Polly
  type Pricing = services.pricing.Pricing
  type RAM = services.ram.RAM
  type RDS = services.rds.RDS
  type RDSDataService = services.rdsdataservice.RDSDataService
  type Redshift = services.redshift.Redshift
  type Rekognition = services.rekognition.Rekognition
  type ResourceGroups = services.resourcegroups.ResourceGroups
  type ResourceGroupsTaggingAPI = services.resourcegroupstaggingapi.ResourceGroupsTaggingAPI
  type RoboMaker = services.robomaker.RoboMaker
  type Route53 = services.route53.Route53
  type Route53Domains = services.route53domains.Route53Domains
  type Route53Resolver = services.route53resolver.Route53Resolver
  type LexRuntime = services.lexruntime.LexRuntime
  type SageMakerRuntime = services.sagemakerruntime.SageMakerRuntime
  type S3 = services.s3.S3
  type S3Control = services.s3control.S3Control
  type SageMaker = services.sagemaker.SageMaker
  type SimpleDB = services.simpledb.SimpleDB
  type SecretsManager = services.secretsmanager.SecretsManager
  type SecurityHub = services.securityhub.SecurityHub
  type ServerlessApplicationRepository = services.serverlessapplicationrepository.ServerlessApplicationRepository
  type ServiceCatalog = services.servicecatalog.ServiceCatalog
  type ServiceDiscovery = services.servicediscovery.ServiceDiscovery
  type Shield = services.shield.Shield
  type Signer = services.signer.Signer
  type SMS = services.sms.SMS
  type PinpointSMSVoice = services.pinpointsmsvoice.PinpointSMSVoice
  type Snowball = services.snowball.Snowball
  type SNS = services.sns.SNS
  type SQS = services.sqs.SQS
  type SSM = services.ssm.SSM
  type StepFunctions = services.stepfunctions.StepFunctions
  type StorageGateway = services.storagegateway.StorageGateway
  type DynamoDBStreams = services.dynamodbstreams.DynamoDBStreams
  type STS = services.sts.STS
  type Support = services.support.Support
  type SWF = services.swf.SWF
  type TranscribeService = services.transcribeservice.TranscribeService
  type Transfer = services.transfer.Transfer
  type Translate = services.translate.Translate
  type WAF = services.waf.WAF
  type WAFRegional = services.wafregional.WAFRegional
  type WorkDocs = services.workdocs.WorkDocs
  type WorkMail = services.workmail.WorkMail
  type WorkSpaces = services.workspaces.WorkSpaces
  type XRay = services.xray.XRay
}