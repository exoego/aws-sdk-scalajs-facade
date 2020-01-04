package net.exoego

import facade.amazonaws.{AWSConfig, services}
import org.scalatest.funsuite.AnyFunSuite

class AllServicesTest extends AnyFunSuite {
  test("ACM") {
    val instance = new services.acm.ACM
  }

  test("ACMPCA") {
    val instance = new services.acmpca.ACMPCA
  }

  test("APIGateway") {
    val instance = new services.apigateway.APIGateway
  }

  test("AccessAnalyzer") {
    val instance = new services.accessanalyzer.AccessAnalyzer
  }

  test("AlexaForBusiness") {
    val instance = new services.alexaforbusiness.AlexaForBusiness
  }

  test("Amplify") {
    val instance = new services.amplify.Amplify
  }

  test("ApiGatewayManagementApi") {
    val instance = new services.apigatewaymanagementapi.ApiGatewayManagementApi
  }

  test("ApiGatewayV2") {
    val instance = new services.apigatewayv2.ApiGatewayV2
  }

  test("AppConfig") {
    val instance = new services.appconfig.AppConfig
  }

  test("AppMesh") {
    val instance = new services.appmesh.AppMesh
  }

  test("AppStream") {
    val instance = new services.appstream.AppStream
  }

  test("AppSync") {
    val instance = new services.appsync.AppSync
  }

  test("ApplicationAutoScaling") {
    val instance = new services.applicationautoscaling.ApplicationAutoScaling
  }

  test("ApplicationDiscovery") {
    val instance = new services.applicationdiscovery.ApplicationDiscovery
  }

  test("ApplicationInsights") {
    val instance = new services.applicationinsights.ApplicationInsights
  }

  test("Athena") {
    val instance = new services.athena.Athena
  }

  test("AugmentedAIRuntime") {
    val instance = new services.augmentedairuntime.AugmentedAIRuntime
  }

  test("AutoScaling") {
    val instance = new services.autoscaling.AutoScaling
  }

  test("AutoScalingPlans") {
    val instance = new services.autoscalingplans.AutoScalingPlans
  }

  test("Backup") {
    val instance = new services.backup.Backup
  }

  test("Batch") {
    val instance = new services.batch.Batch
  }

  test("BudgetsService") {
    val instance = new services.budgetsservice.BudgetsService
  }

  test("CUR") {
    val instance = new services.cur.CUR
  }

  test("Chime") {
    val instance = new services.chime.Chime
  }

  test("Cloud9") {
    val instance = new services.cloud9.Cloud9
  }

  test("CloudDirectory") {
    val instance = new services.clouddirectory.CloudDirectory
  }

  test("CloudFormation") {
    val instance = new services.cloudformation.CloudFormation
  }

  test("CloudFront") {
    val instance = new services.cloudfront.CloudFront
  }

  test("CloudHSM") {
    val instance = new services.cloudhsm.CloudHSM
  }

  test("CloudHSMV2") {
    val instance = new services.cloudhsmv2.CloudHSMV2
  }

  test("CloudSearch") {
    val instance = new services.cloudsearch.CloudSearch
  }

  test("CloudSearchDomain") {
    val instance = new services.cloudsearchdomain.CloudSearchDomain(
      AWSConfig(
        endpoint = "http://localhost"
      )
    )
  }

  test("CloudTrail") {
    val instance = new services.cloudtrail.CloudTrail
  }

  test("CloudWatch") {
    val instance = new services.cloudwatch.CloudWatch
  }

  test("CloudWatchEvents") {
    val instance = new services.cloudwatchevents.CloudWatchEvents
  }

  test("CloudWatchLogs") {
    val instance = new services.cloudwatchlogs.CloudWatchLogs
  }

  test("CodeBuild") {
    val instance = new services.codebuild.CodeBuild
  }

  test("CodeCommit") {
    val instance = new services.codecommit.CodeCommit
  }

  test("CodeDeploy") {
    val instance = new services.codedeploy.CodeDeploy
  }

  test("CodeGuruProfiler") {
    val instance = new services.codeguruprofiler.CodeGuruProfiler
  }

  test("CodeGuruReviewer") {
    val instance = new services.codegurureviewer.CodeGuruReviewer
  }

  test("CodePipeline") {
    val instance = new services.codepipeline.CodePipeline
  }

  test("CodeStar") {
    val instance = new services.codestar.CodeStar
  }

  test("CodeStarNotifications") {
    val instance = new services.codestarnotifications.CodeStarNotifications
  }

  test("CodeStarconnections") {
    val instance = new services.codestarconnections.CodeStarconnections
  }

  test("CognitoIdentity") {
    val instance = new services.cognitoidentity.CognitoIdentity
  }

  test("CognitoIdentityProvider") {
    val instance = new services.cognitoidentityprovider.CognitoIdentityProvider
  }

  test("CognitoSync") {
    val instance = new services.cognitosync.CognitoSync
  }

  test("Comprehend") {
    val instance = new services.comprehend.Comprehend
  }

  test("ComprehendMedical") {
    val instance = new services.comprehendmedical.ComprehendMedical
  }

  test("ComputeOptimizer") {
    val instance = new services.computeoptimizer.ComputeOptimizer
  }

  test("ConfigService") {
    val instance = new services.configservice.ConfigService
  }

  test("Connect") {
    val instance = new services.connect.Connect
  }

  test("ConnectParticipant") {
    val instance = new services.connectparticipant.ConnectParticipant
  }

  test("CostExplorer") {
    val instance = new services.costexplorer.CostExplorer
  }

  test("DAX") {
    val instance = new services.dax.DAX
  }

  test("DLM") {
    val instance = new services.dlm.DLM
  }

  test("DMS") {
    val instance = new services.dms.DMS
  }

  test("DataExchange") {
    val instance = new services.dataexchange.DataExchange
  }

  test("DataPipeline") {
    val instance = new services.datapipeline.DataPipeline
  }

  test("DataSync") {
    val instance = new services.datasync.DataSync
  }

  test("Detective") {
    val instance = new services.detective.Detective
  }

  test("DeviceFarm") {
    val instance = new services.devicefarm.DeviceFarm
  }

  test("DirectConnect") {
    val instance = new services.directconnect.DirectConnect
  }

  test("DirectoryService") {
    val instance = new services.directoryservice.DirectoryService
  }

  test("DocDB") {
    val instance = new services.docdb.DocDB
  }

  test("DynamoDB") {
    val instance = new services.dynamodb.DynamoDB
  }

  test("DynamoDBStreams") {
    val instance = new services.dynamodbstreams.DynamoDBStreams
  }

  test("EBS") {
    val instance = new services.ebs.EBS
  }

  test("EC2") {
    val instance = new services.ec2.EC2
  }

  test("EC2InstanceConnect") {
    val instance = new services.ec2instanceconnect.EC2InstanceConnect
  }

  test("ECR") {
    val instance = new services.ecr.ECR
  }

  test("ECS") {
    val instance = new services.ecs.ECS
  }

  test("EFS") {
    val instance = new services.efs.EFS
  }

  test("EKS") {
    val instance = new services.eks.EKS
  }

  test("ELB") {
    val instance = new services.elb.ELB
  }

  test("ELBv2") {
    val instance = new services.elbv2.ELBv2
  }

  test("EMR") {
    val instance = new services.emr.EMR
  }

  test("ES") {
    val instance = new services.es.ES
  }

  test("ElastiCache") {
    val instance = new services.elasticache.ElastiCache
  }

  test("ElasticBeanstalk") {
    val instance = new services.elasticbeanstalk.ElasticBeanstalk
  }

  test("ElasticInference") {
    val instance = new services.elasticinference.ElasticInference
  }

  test("ElasticTranscoder") {
    val instance = new services.elastictranscoder.ElasticTranscoder
  }

  test("EventBridge") {
    val instance = new services.eventbridge.EventBridge
  }

  test("FMS") {
    val instance = new services.fms.FMS
  }

  test("FSx") {
    val instance = new services.fsx.FSx
  }

  test("Firehose") {
    val instance = new services.firehose.Firehose
  }

  test("Forecast") {
    val instance = new services.forecast.Forecast
  }

  test("ForecastQuery") {
    val instance = new services.forecastquery.ForecastQuery
  }

  test("FraudDetector") {
    val instance = new services.frauddetector.FraudDetector
  }

  test("GameLift") {
    val instance = new services.gamelift.GameLift
  }

  test("Glacier") {
    val instance = new services.glacier.Glacier
  }

  test("GlobalAccelerator") {
    val instance = new services.globalaccelerator.GlobalAccelerator
  }

  test("Glue") {
    val instance = new services.glue.Glue
  }

  test("Greengrass") {
    val instance = new services.greengrass.Greengrass
  }

  test("GroundStation") {
    val instance = new services.groundstation.GroundStation
  }

  test("GuardDuty") {
    val instance = new services.guardduty.GuardDuty
  }

  test("Health") {
    val instance = new services.health.Health
  }

  test("IAM") {
    val instance = new services.iam.IAM
  }

  test("Imagebuilder") {
    val instance = new services.imagebuilder.Imagebuilder
  }

  test("ImportExport") {
    val instance = new services.importexport.ImportExport
  }

  test("Inspector") {
    val instance = new services.inspector.Inspector
  }

  test("IoT1ClickDevicesService") {
    val instance = new services.iot1clickdevicesservice.IoT1ClickDevicesService
  }

  test("IoT1ClickProjects") {
    val instance = new services.iot1clickprojects.IoT1ClickProjects
  }

  test("IoTAnalytics") {
    val instance = new services.iotanalytics.IoTAnalytics
  }

  test("IoTEvents") {
    val instance = new services.iotevents.IoTEvents
  }

  test("IoTEventsData") {
    val instance = new services.ioteventsdata.IoTEventsData
  }

  test("IoTJobsDataPlane") {
    val instance = new services.iotjobsdataplane.IoTJobsDataPlane
  }

  test("IoTSecureTunneling") {
    val instance = new services.iotsecuretunneling.IoTSecureTunneling
  }

  test("IoTThingsGraph") {
    val instance = new services.iotthingsgraph.IoTThingsGraph
  }

  test("Iot") {
    val instance = new services.iot.Iot
  }

  test("IotData") {
    val instance = new services.iotdata.IotData(
      AWSConfig(
        endpoint = "http://localhost"
      )
    )
  }

  test("KMS") {
    val instance = new services.kms.KMS
  }

  test("Kafka") {
    val instance = new services.kafka.Kafka
  }

  test("Kendra") {
    val instance = new services.kendra.Kendra
  }

  test("Kinesis") {
    val instance = new services.kinesis.Kinesis
  }

  test("KinesisAnalytics") {
    val instance = new services.kinesisanalytics.KinesisAnalytics
  }

  test("KinesisAnalyticsV2") {
    val instance = new services.kinesisanalyticsv2.KinesisAnalyticsV2
  }

  test("KinesisVideo") {
    val instance = new services.kinesisvideo.KinesisVideo
  }

  test("KinesisVideoArchivedMedia") {
    val instance = new services.kinesisvideoarchivedmedia.KinesisVideoArchivedMedia
  }

  test("KinesisVideoMedia") {
    val instance = new services.kinesisvideomedia.KinesisVideoMedia
  }

  test("KinesisVideoSignaling") {
    val instance = new services.kinesisvideosignaling.KinesisVideoSignaling
  }

  test("LakeFormation") {
    val instance = new services.lakeformation.LakeFormation
  }

  test("Lambda") {
    val instance = new services.lambda.Lambda
  }

  test("LexModelBuildingService") {
    val instance = new services.lexmodelbuildingservice.LexModelBuildingService
  }

  test("LexRuntime") {
    val instance = new services.lexruntime.LexRuntime
  }

  test("LicenseManager") {
    val instance = new services.licensemanager.LicenseManager
  }

  test("Lightsail") {
    val instance = new services.lightsail.Lightsail
  }

  test("MQ") {
    val instance = new services.mq.MQ
  }

  test("MTurk") {
    val instance = new services.mturk.MTurk
  }

  test("MachineLearning") {
    val instance = new services.machinelearning.MachineLearning
  }

  test("Macie") {
    val instance = new services.macie.Macie
  }

  test("ManagedBlockchain") {
    val instance = new services.managedblockchain.ManagedBlockchain
  }

  test("MarketplaceCatalog") {
    val instance = new services.marketplacecatalog.MarketplaceCatalog
  }

  test("MarketplaceCommerceAnalytics") {
    val instance = new services.marketplacecommerceanalytics.MarketplaceCommerceAnalytics
  }

  test("MarketplaceEntitlementService") {
    val instance = new services.marketplaceentitlementservice.MarketplaceEntitlementService
  }

  test("MarketplaceMetering") {
    val instance = new services.marketplacemetering.MarketplaceMetering
  }

  test("MediaConnect") {
    val instance = new services.mediaconnect.MediaConnect
  }

  test("MediaConvert") {
    val instance = new services.mediaconvert.MediaConvert
  }

  test("MediaLive") {
    val instance = new services.medialive.MediaLive
  }

  test("MediaPackage") {
    val instance = new services.mediapackage.MediaPackage
  }

  test("MediaPackageVod") {
    val instance = new services.mediapackagevod.MediaPackageVod
  }

  test("MediaStore") {
    val instance = new services.mediastore.MediaStore
  }

  test("MediaStoreData") {
    val instance = new services.mediastoredata.MediaStoreData
  }

  test("MediaTailor") {
    val instance = new services.mediatailor.MediaTailor
  }

  test("MigrationHub") {
    val instance = new services.migrationhub.MigrationHub
  }

  test("MigrationHubConfig") {
    val instance = new services.migrationhubconfig.MigrationHubConfig
  }

  test("Mobile") {
    val instance = new services.mobile.Mobile
  }

  test("MobileAnalytics") {
    val instance = new services.mobileanalytics.MobileAnalytics
  }

  test("Neptune") {
    val instance = new services.neptune.Neptune
  }

  test("NetworkManager") {
    val instance = new services.networkmanager.NetworkManager
  }

  test("OpsWorks") {
    val instance = new services.opsworks.OpsWorks
  }

  test("OpsWorksCM") {
    val instance = new services.opsworkscm.OpsWorksCM
  }

  test("Organizations") {
    val instance = new services.organizations.Organizations
  }

  test("Outposts") {
    val instance = new services.outposts.Outposts
  }

  test("PI") {
    val instance = new services.pi.PI
  }

  test("Personalize") {
    val instance = new services.personalize.Personalize
  }

  test("PersonalizeEvents") {
    val instance = new services.personalizeevents.PersonalizeEvents
  }

  test("PersonalizeRuntime") {
    val instance = new services.personalizeruntime.PersonalizeRuntime
  }

  test("Pinpoint") {
    val instance = new services.pinpoint.Pinpoint
  }

  test("PinpointEmail") {
    val instance = new services.pinpointemail.PinpointEmail
  }

  test("PinpointSMSVoice") {
    val instance = new services.pinpointsmsvoice.PinpointSMSVoice
  }

  test("Polly") {
    val instance = new services.polly.Polly
  }

  test("Pricing") {
    val instance = new services.pricing.Pricing
  }

  test("QLDB") {
    val instance = new services.qldb.QLDB
  }

  test("QLDBSession") {
    val instance = new services.qldbsession.QLDBSession
  }

  test("QuickSight") {
    val instance = new services.quicksight.QuickSight
  }

  test("RAM") {
    val instance = new services.ram.RAM
  }

  test("RDS") {
    val instance = new services.rds.RDS
  }

  test("RDSDataService") {
    val instance = new services.rdsdataservice.RDSDataService
  }

  test("Redshift") {
    val instance = new services.redshift.Redshift
  }

  test("Rekognition") {
    val instance = new services.rekognition.Rekognition
  }

  test("ResourceGroups") {
    val instance = new services.resourcegroups.ResourceGroups
  }

  test("ResourceGroupsTaggingAPI") {
    val instance = new services.resourcegroupstaggingapi.ResourceGroupsTaggingAPI
  }

  test("RoboMaker") {
    val instance = new services.robomaker.RoboMaker
  }

  test("Route53") {
    val instance = new services.route53.Route53
  }

  test("Route53Domains") {
    val instance = new services.route53domains.Route53Domains
  }

  test("Route53Resolver") {
    val instance = new services.route53resolver.Route53Resolver
  }

  test("S3") {
    val instance = new services.s3.S3
  }

  test("S3Control") {
    val instance = new services.s3control.S3Control
  }

  test("SES") {
    val instance = new services.ses.SES
  }

  test("SESv2") {
    val instance = new services.sesv2.SESv2
  }

  test("SMS") {
    val instance = new services.sms.SMS
  }

  test("SNS") {
    val instance = new services.sns.SNS
  }

  test("SQS") {
    val instance = new services.sqs.SQS
  }

  test("SSM") {
    val instance = new services.ssm.SSM
  }

  test("SSO") {
    val instance = new services.sso.SSO
  }

  test("SSOOIDC") {
    val instance = new services.ssooidc.SSOOIDC
  }

  test("STS") {
    val instance = new services.sts.STS
  }

  test("SWF") {
    val instance = new services.swf.SWF
  }

  test("SageMaker") {
    val instance = new services.sagemaker.SageMaker
  }

  test("SageMakerRuntime") {
    val instance = new services.sagemakerruntime.SageMakerRuntime
  }

  test("SavingsPlans") {
    val instance = new services.savingsplans.SavingsPlans
  }

  test("Schemas") {
    val instance = new services.schemas.Schemas
  }

  test("SecretsManager") {
    val instance = new services.secretsmanager.SecretsManager
  }

  test("SecurityHub") {
    val instance = new services.securityhub.SecurityHub
  }

  test("ServerlessApplicationRepository") {
    val instance = new services.serverlessapplicationrepository.ServerlessApplicationRepository
  }

  test("ServiceCatalog") {
    val instance = new services.servicecatalog.ServiceCatalog
  }

  test("ServiceDiscovery") {
    val instance = new services.servicediscovery.ServiceDiscovery
  }

  test("ServiceQuotas") {
    val instance = new services.servicequotas.ServiceQuotas
  }

  test("Shield") {
    val instance = new services.shield.Shield
  }

  test("Signer") {
    val instance = new services.signer.Signer
  }

  test("SimpleDB") {
    val instance = new services.simpledb.SimpleDB
  }

  test("Snowball") {
    val instance = new services.snowball.Snowball
  }

  test("StepFunctions") {
    val instance = new services.stepfunctions.StepFunctions
  }

  test("StorageGateway") {
    val instance = new services.storagegateway.StorageGateway
  }

  test("Support") {
    val instance = new services.support.Support
  }

  test("Textract") {
    val instance = new services.textract.Textract
  }

  test("TranscribeService") {
    val instance = new services.transcribeservice.TranscribeService
  }

  test("Transfer") {
    val instance = new services.transfer.Transfer
  }

  test("Translate") {
    val instance = new services.translate.Translate
  }

  test("WAF") {
    val instance = new services.waf.WAF
  }

  test("WAFRegional") {
    val instance = new services.wafregional.WAFRegional
  }

  test("WAFv2") {
    val instance = new services.wafv2.WAFv2
  }

  test("WorkDocs") {
    val instance = new services.workdocs.WorkDocs
  }

  test("WorkLink") {
    val instance = new services.worklink.WorkLink
  }

  test("WorkMail") {
    val instance = new services.workmail.WorkMail
  }

  test("WorkMailMessageFlow") {
    val instance = new services.workmailmessageflow.WorkMailMessageFlow
  }

  test("WorkSpaces") {
    val instance = new services.workspaces.WorkSpaces
  }

  test("XRay") {
    val instance = new services.xray.XRay
  }
}
