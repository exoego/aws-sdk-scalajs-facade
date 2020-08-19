package net.exoego

import facade.amazonaws.{AWSConfig, services}
import org.scalatest.funsuite.AnyFunSuite

class AllServicesTest extends AnyFunSuite {
  val config = AWSConfig(
    endpoint = "http://localhost"
  )

  test("ACM") {
    val instance = new services.acm.ACM(config)
  }

  test("ACMPCA") {
    val instance = new services.acmpca.ACMPCA(config)
  }

  test("APIGateway") {
    val instance = new services.apigateway.APIGateway(config)
  }

  test("AccessAnalyzer") {
    val instance = new services.accessanalyzer.AccessAnalyzer(config)
  }

  test("AlexaForBusiness") {
    val instance = new services.alexaforbusiness.AlexaForBusiness(config)
  }

  test("Amplify") {
    val instance = new services.amplify.Amplify(config)
  }

  test("ApiGatewayManagementApi") {
    val instance = new services.apigatewaymanagementapi.ApiGatewayManagementApi(config)
  }

  test("ApiGatewayV2") {
    val instance = new services.apigatewayv2.ApiGatewayV2(config)
  }

  test("AppConfig") {
    val instance = new services.appconfig.AppConfig(config)
  }

  test("AppMesh") {
    val instance = new services.appmesh.AppMesh(config)
  }

  test("AppStream") {
    val instance = new services.appstream.AppStream(config)
  }

  test("AppSync") {
    val instance = new services.appsync.AppSync(config)
  }

  test("ApplicationAutoScaling") {
    val instance = new services.applicationautoscaling.ApplicationAutoScaling(config)
  }

  test("ApplicationDiscovery") {
    val instance = new services.applicationdiscovery.ApplicationDiscovery(config)
  }

  test("ApplicationInsights") {
    val instance = new services.applicationinsights.ApplicationInsights(config)
  }

  test("Athena") {
    val instance = new services.athena.Athena(config)
  }

  test("AugmentedAIRuntime") {
    val instance = new services.augmentedairuntime.AugmentedAIRuntime(config)
  }

  test("AutoScaling") {
    val instance = new services.autoscaling.AutoScaling(config)
  }

  test("AutoScalingPlans") {
    val instance = new services.autoscalingplans.AutoScalingPlans(config)
  }

  test("Backup") {
    val instance = new services.backup.Backup(config)
  }

  test("Batch") {
    val instance = new services.batch.Batch(config)
  }

  test("Braket") {
    val instance = new services.braket.Braket(config)
  }

  test("BudgetsService") {
    val instance = new services.budgetsservice.BudgetsService(config)
  }

  test("CUR") {
    val instance = new services.cur.CUR(config)
  }

  test("Chime") {
    val instance = new services.chime.Chime(config)
  }

  test("Cloud9") {
    val instance = new services.cloud9.Cloud9(config)
  }

  test("CloudDirectory") {
    val instance = new services.clouddirectory.CloudDirectory(config)
  }

  test("CloudFormation") {
    val instance = new services.cloudformation.CloudFormation(config)
  }

  test("CloudFront") {
    val instance = new services.cloudfront.CloudFront(config)
  }

  test("CloudHSM") {
    val instance = new services.cloudhsm.CloudHSM(config)
  }

  test("CloudHSMV2") {
    val instance = new services.cloudhsmv2.CloudHSMV2(config)
  }

  test("CloudSearch") {
    val instance = new services.cloudsearch.CloudSearch(config)
  }

  test("CloudSearchDomain") {
    val instance = new services.cloudsearchdomain.CloudSearchDomain(config)
  }

  test("CloudTrail") {
    val instance = new services.cloudtrail.CloudTrail(config)
  }

  test("CloudWatch") {
    val instance = new services.cloudwatch.CloudWatch(config)
  }

  test("CloudWatchEvents") {
    val instance = new services.cloudwatchevents.CloudWatchEvents(config)
  }

  test("CloudWatchLogs") {
    val instance = new services.cloudwatchlogs.CloudWatchLogs(config)
  }

  test("CodeArtifact") {
    val instance = new services.codeartifact.CodeArtifact(config)
  }

  test("CodeBuild") {
    val instance = new services.codebuild.CodeBuild(config)
  }

  test("CodeCommit") {
    val instance = new services.codecommit.CodeCommit(config)
  }

  test("CodeDeploy") {
    val instance = new services.codedeploy.CodeDeploy(config)
  }

  test("CodeGuruProfiler") {
    val instance = new services.codeguruprofiler.CodeGuruProfiler(config)
  }

  test("CodeGuruReviewer") {
    val instance = new services.codegurureviewer.CodeGuruReviewer(config)
  }

  test("CodePipeline") {
    val instance = new services.codepipeline.CodePipeline(config)
  }

  test("CodeStar") {
    val instance = new services.codestar.CodeStar(config)
  }

  test("CodeStarNotifications") {
    val instance = new services.codestarnotifications.CodeStarNotifications(config)
  }

  test("CodeStarconnections") {
    val instance = new services.codestarconnections.CodeStarconnections(config)
  }

  test("CognitoIdentity") {
    val instance = new services.cognitoidentity.CognitoIdentity(config)
  }

  test("CognitoIdentityProvider") {
    val instance = new services.cognitoidentityprovider.CognitoIdentityProvider(config)
  }

  test("CognitoSync") {
    val instance = new services.cognitosync.CognitoSync(config)
  }

  test("Comprehend") {
    val instance = new services.comprehend.Comprehend(config)
  }

  test("ComprehendMedical") {
    val instance = new services.comprehendmedical.ComprehendMedical(config)
  }

  test("ComputeOptimizer") {
    val instance = new services.computeoptimizer.ComputeOptimizer(config)
  }

  test("ConfigService") {
    val instance = new services.configservice.ConfigService(config)
  }

  test("Connect") {
    val instance = new services.connect.Connect(config)
  }

  test("ConnectParticipant") {
    val instance = new services.connectparticipant.ConnectParticipant(config)
  }

  test("CostExplorer") {
    val instance = new services.costexplorer.CostExplorer(config)
  }

  test("DAX") {
    val instance = new services.dax.DAX(config)
  }

  test("DLM") {
    val instance = new services.dlm.DLM(config)
  }

  test("DMS") {
    val instance = new services.dms.DMS(config)
  }

  test("DataExchange") {
    val instance = new services.dataexchange.DataExchange(config)
  }

  test("DataPipeline") {
    val instance = new services.datapipeline.DataPipeline(config)
  }

  test("DataSync") {
    val instance = new services.datasync.DataSync(config)
  }

  test("Detective") {
    val instance = new services.detective.Detective(config)
  }

  test("DeviceFarm") {
    val instance = new services.devicefarm.DeviceFarm(config)
  }

  test("DirectConnect") {
    val instance = new services.directconnect.DirectConnect(config)
  }

  test("DirectoryService") {
    val instance = new services.directoryservice.DirectoryService(config)
  }

  test("DocDB") {
    val instance = new services.docdb.DocDB(config)
  }

  test("DynamoDB") {
    val instance = new services.dynamodb.DynamoDB(config)
  }

  test("DynamoDBStreams") {
    val instance = new services.dynamodbstreams.DynamoDBStreams(config)
  }

  test("EBS") {
    val instance = new services.ebs.EBS(config)
  }

  test("EC2") {
    val instance = new services.ec2.EC2(config)
  }

  test("EC2InstanceConnect") {
    val instance = new services.ec2instanceconnect.EC2InstanceConnect(config)
  }

  test("ECR") {
    val instance = new services.ecr.ECR(config)
  }

  test("ECS") {
    val instance = new services.ecs.ECS(config)
  }

  test("EFS") {
    val instance = new services.efs.EFS(config)
  }

  test("EKS") {
    val instance = new services.eks.EKS(config)
  }

  test("ELB") {
    val instance = new services.elb.ELB(config)
  }

  test("ELBv2") {
    val instance = new services.elbv2.ELBv2(config)
  }

  test("EMR") {
    val instance = new services.emr.EMR(config)
  }

  test("ES") {
    val instance = new services.es.ES(config)
  }

  test("ElastiCache") {
    val instance = new services.elasticache.ElastiCache(config)
  }

  test("ElasticBeanstalk") {
    val instance = new services.elasticbeanstalk.ElasticBeanstalk(config)
  }

  test("ElasticInference") {
    val instance = new services.elasticinference.ElasticInference(config)
  }

  test("ElasticTranscoder") {
    val instance = new services.elastictranscoder.ElasticTranscoder(config)
  }

  test("EventBridge") {
    val instance = new services.eventbridge.EventBridge(config)
  }

  test("FMS") {
    val instance = new services.fms.FMS(config)
  }

  test("FSx") {
    val instance = new services.fsx.FSx(config)
  }

  test("Firehose") {
    val instance = new services.firehose.Firehose(config)
  }

  test("Forecast") {
    val instance = new services.forecast.Forecast(config)
  }

  test("ForecastQuery") {
    val instance = new services.forecastquery.ForecastQuery(config)
  }

  test("FraudDetector") {
    val instance = new services.frauddetector.FraudDetector(config)
  }

  test("GameLift") {
    val instance = new services.gamelift.GameLift(config)
  }

  test("Glacier") {
    val instance = new services.glacier.Glacier(config)
  }

  test("GlobalAccelerator") {
    val instance = new services.globalaccelerator.GlobalAccelerator(config)
  }

  test("Glue") {
    val instance = new services.glue.Glue(config)
  }

  test("Greengrass") {
    val instance = new services.greengrass.Greengrass(config)
  }

  test("GroundStation") {
    val instance = new services.groundstation.GroundStation(config)
  }

  test("GuardDuty") {
    val instance = new services.guardduty.GuardDuty(config)
  }

  test("Health") {
    val instance = new services.health.Health(config)
  }

  test("Honeycode") {
    val instance = new services.honeycode.Honeycode(config)
  }

  test("IAM") {
    val instance = new services.iam.IAM(config)
  }

  test("IVS") {
    val instance = new services.ivs.IVS(config)
  }

  test("IdentityStore") {
    val instance = new services.identitystore.IdentityStore(config)
  }

  test("Imagebuilder") {
    val instance = new services.imagebuilder.Imagebuilder(config)
  }

  test("ImportExport") {
    val instance = new services.importexport.ImportExport(config)
  }

  test("Inspector") {
    val instance = new services.inspector.Inspector(config)
  }

  test("IoT1ClickDevicesService") {
    val instance = new services.iot1clickdevicesservice.IoT1ClickDevicesService(config)
  }

  test("IoT1ClickProjects") {
    val instance = new services.iot1clickprojects.IoT1ClickProjects(config)
  }

  test("IoTAnalytics") {
    val instance = new services.iotanalytics.IoTAnalytics(config)
  }

  test("IoTEvents") {
    val instance = new services.iotevents.IoTEvents(config)
  }

  test("IoTEventsData") {
    val instance = new services.ioteventsdata.IoTEventsData(config)
  }

  test("IoTJobsDataPlane") {
    val instance = new services.iotjobsdataplane.IoTJobsDataPlane(config)
  }

  test("IoTSecureTunneling") {
    val instance = new services.iotsecuretunneling.IoTSecureTunneling(config)
  }

  test("IoTSiteWise") {
    val instance = new services.iotsitewise.IoTSiteWise(config)
  }

  test("IoTThingsGraph") {
    val instance = new services.iotthingsgraph.IoTThingsGraph(config)
  }

  test("Iot") {
    val instance = new services.iot.Iot(config)
  }

  test("IotData") {
    val instance = new services.iotdata.IotData(config)
  }

  test("KMS") {
    val instance = new services.kms.KMS(config)
  }

  test("Kafka") {
    val instance = new services.kafka.Kafka(config)
  }

  test("Kendra") {
    val instance = new services.kendra.Kendra(config)
  }

  test("Kinesis") {
    val instance = new services.kinesis.Kinesis(config)
  }

  test("KinesisAnalytics") {
    val instance = new services.kinesisanalytics.KinesisAnalytics(config)
  }

  test("KinesisAnalyticsV2") {
    val instance = new services.kinesisanalyticsv2.KinesisAnalyticsV2(config)
  }

  test("KinesisVideo") {
    val instance = new services.kinesisvideo.KinesisVideo(config)
  }

  test("KinesisVideoArchivedMedia") {
    val instance = new services.kinesisvideoarchivedmedia.KinesisVideoArchivedMedia(config)
  }

  test("KinesisVideoMedia") {
    val instance = new services.kinesisvideomedia.KinesisVideoMedia(config)
  }

  test("KinesisVideoSignaling") {
    val instance = new services.kinesisvideosignaling.KinesisVideoSignaling(config)
  }

  test("LakeFormation") {
    val instance = new services.lakeformation.LakeFormation(config)
  }

  test("Lambda") {
    val instance = new services.lambda.Lambda(config)
  }

  test("LexModelBuildingService") {
    val instance = new services.lexmodelbuildingservice.LexModelBuildingService(config)
  }

  test("LexRuntime") {
    val instance = new services.lexruntime.LexRuntime(config)
  }

  test("LicenseManager") {
    val instance = new services.licensemanager.LicenseManager(config)
  }

  test("Lightsail") {
    val instance = new services.lightsail.Lightsail(config)
  }

  test("MQ") {
    val instance = new services.mq.MQ(config)
  }

  test("MTurk") {
    val instance = new services.mturk.MTurk(config)
  }

  test("MachineLearning") {
    val instance = new services.machinelearning.MachineLearning(config)
  }

  test("Macie") {
    val instance = new services.macie.Macie(config)
  }

  test("Macie2") {
    val instance = new services.macie2.Macie2(config)
  }

  test("ManagedBlockchain") {
    val instance = new services.managedblockchain.ManagedBlockchain(config)
  }

  test("MarketplaceCatalog") {
    val instance = new services.marketplacecatalog.MarketplaceCatalog(config)
  }

  test("MarketplaceCommerceAnalytics") {
    val instance = new services.marketplacecommerceanalytics.MarketplaceCommerceAnalytics(config)
  }

  test("MarketplaceEntitlementService") {
    val instance = new services.marketplaceentitlementservice.MarketplaceEntitlementService(config)
  }

  test("MarketplaceMetering") {
    val instance = new services.marketplacemetering.MarketplaceMetering(config)
  }

  test("MediaConnect") {
    val instance = new services.mediaconnect.MediaConnect(config)
  }

  test("MediaConvert") {
    val instance = new services.mediaconvert.MediaConvert(config)
  }

  test("MediaLive") {
    val instance = new services.medialive.MediaLive(config)
  }

  test("MediaPackage") {
    val instance = new services.mediapackage.MediaPackage(config)
  }

  test("MediaPackageVod") {
    val instance = new services.mediapackagevod.MediaPackageVod(config)
  }

  test("MediaStore") {
    val instance = new services.mediastore.MediaStore(config)
  }

  test("MediaStoreData") {
    val instance = new services.mediastoredata.MediaStoreData(config)
  }

  test("MediaTailor") {
    val instance = new services.mediatailor.MediaTailor(config)
  }

  test("MigrationHub") {
    val instance = new services.migrationhub.MigrationHub(config)
  }

  test("MigrationHubConfig") {
    val instance = new services.migrationhubconfig.MigrationHubConfig(config)
  }

  test("Mobile") {
    val instance = new services.mobile.Mobile(config)
  }

  test("MobileAnalytics") {
    val instance = new services.mobileanalytics.MobileAnalytics(config)
  }

  test("Neptune") {
    val instance = new services.neptune.Neptune(config)
  }

  test("NetworkManager") {
    val instance = new services.networkmanager.NetworkManager(config)
  }

  test("OpsWorks") {
    val instance = new services.opsworks.OpsWorks(config)
  }

  test("OpsWorksCM") {
    val instance = new services.opsworkscm.OpsWorksCM(config)
  }

  test("Organizations") {
    val instance = new services.organizations.Organizations(config)
  }

  test("Outposts") {
    val instance = new services.outposts.Outposts(config)
  }

  test("PI") {
    val instance = new services.pi.PI(config)
  }

  test("Personalize") {
    val instance = new services.personalize.Personalize(config)
  }

  test("PersonalizeEvents") {
    val instance = new services.personalizeevents.PersonalizeEvents(config)
  }

  test("PersonalizeRuntime") {
    val instance = new services.personalizeruntime.PersonalizeRuntime(config)
  }

  test("Pinpoint") {
    val instance = new services.pinpoint.Pinpoint(config)
  }

  test("PinpointEmail") {
    val instance = new services.pinpointemail.PinpointEmail(config)
  }

  test("PinpointSMSVoice") {
    val instance = new services.pinpointsmsvoice.PinpointSMSVoice(config)
  }

  test("Polly") {
    val instance = new services.polly.Polly(config)
  }

  test("Pricing") {
    val instance = new services.pricing.Pricing(config)
  }

  test("QLDB") {
    val instance = new services.qldb.QLDB(config)
  }

  test("QLDBSession") {
    val instance = new services.qldbsession.QLDBSession(config)
  }

  test("QuickSight") {
    val instance = new services.quicksight.QuickSight(config)
  }

  test("RAM") {
    val instance = new services.ram.RAM(config)
  }

  test("RDS") {
    val instance = new services.rds.RDS(config)
  }

  test("RDSDataService") {
    val instance = new services.rdsdataservice.RDSDataService(config)
  }

  test("Redshift") {
    val instance = new services.redshift.Redshift(config)
  }

  test("Rekognition") {
    val instance = new services.rekognition.Rekognition(config)
  }

  test("ResourceGroups") {
    val instance = new services.resourcegroups.ResourceGroups(config)
  }

  test("ResourceGroupsTaggingAPI") {
    val instance = new services.resourcegroupstaggingapi.ResourceGroupsTaggingAPI(config)
  }

  test("RoboMaker") {
    val instance = new services.robomaker.RoboMaker(config)
  }

  test("Route53") {
    val instance = new services.route53.Route53(config)
  }

  test("Route53Domains") {
    val instance = new services.route53domains.Route53Domains(config)
  }

  test("Route53Resolver") {
    val instance = new services.route53resolver.Route53Resolver(config)
  }

  test("S3") {
    val instance = new services.s3.S3(config)
  }

  test("S3Control") {
    val instance = new services.s3control.S3Control(config)
  }

  test("SES") {
    val instance = new services.ses.SES(config)
  }

  test("SESv2") {
    val instance = new services.sesv2.SESv2(config)
  }

  test("SMS") {
    val instance = new services.sms.SMS(config)
  }

  test("SNS") {
    val instance = new services.sns.SNS(config)
  }

  test("SQS") {
    val instance = new services.sqs.SQS(config)
  }

  test("SSM") {
    val instance = new services.ssm.SSM(config)
  }

  test("SSO") {
    val instance = new services.sso.SSO(config)
  }

  test("SSOOIDC") {
    val instance = new services.ssooidc.SSOOIDC(config)
  }

  test("STS") {
    val instance = new services.sts.STS(config)
  }

  test("SWF") {
    val instance = new services.swf.SWF(config)
  }

  test("SageMaker") {
    val instance = new services.sagemaker.SageMaker(config)
  }

  test("SageMakerRuntime") {
    val instance = new services.sagemakerruntime.SageMakerRuntime(config)
  }

  test("SavingsPlans") {
    val instance = new services.savingsplans.SavingsPlans(config)
  }

  test("Schemas") {
    val instance = new services.schemas.Schemas(config)
  }

  test("SecretsManager") {
    val instance = new services.secretsmanager.SecretsManager(config)
  }

  test("SecurityHub") {
    val instance = new services.securityhub.SecurityHub(config)
  }

  test("ServerlessApplicationRepository") {
    val instance = new services.serverlessapplicationrepository.ServerlessApplicationRepository(config)
  }

  test("ServiceCatalog") {
    val instance = new services.servicecatalog.ServiceCatalog(config)
  }

  test("ServiceDiscovery") {
    val instance = new services.servicediscovery.ServiceDiscovery(config)
  }

  test("ServiceQuotas") {
    val instance = new services.servicequotas.ServiceQuotas(config)
  }

  test("Shield") {
    val instance = new services.shield.Shield(config)
  }

  test("Signer") {
    val instance = new services.signer.Signer(config)
  }

  test("SimpleDB") {
    val instance = new services.simpledb.SimpleDB(config)
  }

  test("Snowball") {
    val instance = new services.snowball.Snowball(config)
  }

  test("StepFunctions") {
    val instance = new services.stepfunctions.StepFunctions(config)
  }

  test("StorageGateway") {
    val instance = new services.storagegateway.StorageGateway(config)
  }

  test("Support") {
    val instance = new services.support.Support(config)
  }

  test("Synthetics") {
    val instance = new services.synthetics.Synthetics(config)
  }

  test("Textract") {
    val instance = new services.textract.Textract(config)
  }

  test("TranscribeService") {
    val instance = new services.transcribeservice.TranscribeService(config)
  }

  test("Transfer") {
    val instance = new services.transfer.Transfer(config)
  }

  test("Translate") {
    val instance = new services.translate.Translate(config)
  }

  test("WAF") {
    val instance = new services.waf.WAF(config)
  }

  test("WAFRegional") {
    val instance = new services.wafregional.WAFRegional(config)
  }

  test("WAFv2") {
    val instance = new services.wafv2.WAFv2(config)
  }

  test("WorkDocs") {
    val instance = new services.workdocs.WorkDocs(config)
  }

  test("WorkLink") {
    val instance = new services.worklink.WorkLink(config)
  }

  test("WorkMail") {
    val instance = new services.workmail.WorkMail(config)
  }

  test("WorkMailMessageFlow") {
    val instance = new services.workmailmessageflow.WorkMailMessageFlow(config)
  }

  test("WorkSpaces") {
    val instance = new services.workspaces.WorkSpaces(config)
  }

  test("XRay") {
    val instance = new services.xray.XRay(config)
  }

}
