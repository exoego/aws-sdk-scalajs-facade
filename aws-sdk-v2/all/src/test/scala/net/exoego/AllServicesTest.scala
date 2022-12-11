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

  test("ARCZonalShift") {
    val instance = new services.arczonalshift.ARCZonalShift(config)
  }

  test("AccessAnalyzer") {
    val instance = new services.accessanalyzer.AccessAnalyzer(config)
  }

  test("Account") {
    val instance = new services.account.Account(config)
  }

  test("AlexaForBusiness") {
    val instance = new services.alexaforbusiness.AlexaForBusiness(config)
  }

  test("Amp") {
    val instance = new services.amp.Amp(config)
  }

  test("Amplify") {
    val instance = new services.amplify.Amplify(config)
  }

  test("AmplifyBackend") {
    val instance = new services.amplifybackend.AmplifyBackend(config)
  }

  test("AmplifyUIBuilder") {
    val instance = new services.amplifyuibuilder.AmplifyUIBuilder(config)
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

  test("AppConfigData") {
    val instance = new services.appconfigdata.AppConfigData(config)
  }

  test("AppIntegrations") {
    val instance = new services.appintegrations.AppIntegrations(config)
  }

  test("AppMesh") {
    val instance = new services.appmesh.AppMesh(config)
  }

  test("AppRunner") {
    val instance = new services.apprunner.AppRunner(config)
  }

  test("AppStream") {
    val instance = new services.appstream.AppStream(config)
  }

  test("AppSync") {
    val instance = new services.appsync.AppSync(config)
  }

  test("Appflow") {
    val instance = new services.appflow.Appflow(config)
  }

  test("ApplicationAutoScaling") {
    val instance = new services.applicationautoscaling.ApplicationAutoScaling(config)
  }

  test("ApplicationCostProfiler") {
    val instance = new services.applicationcostprofiler.ApplicationCostProfiler(config)
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

  test("AuditManager") {
    val instance = new services.auditmanager.AuditManager(config)
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

  test("BackupGateway") {
    val instance = new services.backupgateway.BackupGateway(config)
  }

  test("BackupStorage") {
    val instance = new services.backupstorage.BackupStorage(config)
  }

  test("Batch") {
    val instance = new services.batch.Batch(config)
  }

  test("BillingConductor") {
    val instance = new services.billingconductor.BillingConductor(config)
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

  test("ChimeSDKIdentity") {
    val instance = new services.chimesdkidentity.ChimeSDKIdentity(config)
  }

  test("ChimeSDKMediaPipelines") {
    val instance = new services.chimesdkmediapipelines.ChimeSDKMediaPipelines(config)
  }

  test("ChimeSDKMeetings") {
    val instance = new services.chimesdkmeetings.ChimeSDKMeetings(config)
  }

  test("ChimeSDKMessaging") {
    val instance = new services.chimesdkmessaging.ChimeSDKMessaging(config)
  }

  test("ChimeSDKVoice") {
    val instance = new services.chimesdkvoice.ChimeSDKVoice(config)
  }

  test("Cloud9") {
    val instance = new services.cloud9.Cloud9(config)
  }

  test("CloudControl") {
    val instance = new services.cloudcontrol.CloudControl(config)
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

  test("CodeCatalyst") {
    val instance = new services.codecatalyst.CodeCatalyst(config)
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

  test("ConnectCampaigns") {
    val instance = new services.connectcampaigns.ConnectCampaigns(config)
  }

  test("ConnectCases") {
    val instance = new services.connectcases.ConnectCases(config)
  }

  test("ConnectContactLens") {
    val instance = new services.connectcontactlens.ConnectContactLens(config)
  }

  test("ConnectParticipant") {
    val instance = new services.connectparticipant.ConnectParticipant(config)
  }

  test("ControlTower") {
    val instance = new services.controltower.ControlTower(config)
  }

  test("CostExplorer") {
    val instance = new services.costexplorer.CostExplorer(config)
  }

  test("CustomerProfiles") {
    val instance = new services.customerprofiles.CustomerProfiles(config)
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

  test("DRS") {
    val instance = new services.drs.DRS(config)
  }

  test("DataBrew") {
    val instance = new services.databrew.DataBrew(config)
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

  test("DevOpsGuru") {
    val instance = new services.devopsguru.DevOpsGuru(config)
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

  test("DocDBElastic") {
    val instance = new services.docdbelastic.DocDBElastic(config)
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

  test("ECRPUBLIC") {
    val instance = new services.ecrpublic.ECRPUBLIC(config)
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

  test("EMRServerless") {
    val instance = new services.emrserverless.EMRServerless(config)
  }

  test("EMRcontainers") {
    val instance = new services.emrcontainers.EMRcontainers(config)
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

  test("Evidently") {
    val instance = new services.evidently.Evidently(config)
  }

  test("FMS") {
    val instance = new services.fms.FMS(config)
  }

  test("FSx") {
    val instance = new services.fsx.FSx(config)
  }

  test("FinSpace") {
    val instance = new services.finspace.FinSpace(config)
  }

  test("FinSpaceData") {
    val instance = new services.finspacedata.FinSpaceData(config)
  }

  test("Firehose") {
    val instance = new services.firehose.Firehose(config)
  }

  test("Fis") {
    val instance = new services.fis.Fis(config)
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

  test("GameSparks") {
    val instance = new services.gamesparks.GameSparks(config)
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

  test("Grafana") {
    val instance = new services.grafana.Grafana(config)
  }

  test("Greengrass") {
    val instance = new services.greengrass.Greengrass(config)
  }

  test("GreengrassV2") {
    val instance = new services.greengrassv2.GreengrassV2(config)
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

  test("HealthLake") {
    val instance = new services.healthlake.HealthLake(config)
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

  test("IVSChat") {
    val instance = new services.ivschat.IVSChat(config)
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

  test("Inspector2") {
    val instance = new services.inspector2.Inspector2(config)
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

  test("IoTFleetHub") {
    val instance = new services.iotfleethub.IoTFleetHub(config)
  }

  test("IoTFleetWise") {
    val instance = new services.iotfleetwise.IoTFleetWise(config)
  }

  test("IoTJobsDataPlane") {
    val instance = new services.iotjobsdataplane.IoTJobsDataPlane(config)
  }

  test("IoTRoboRunner") {
    val instance = new services.iotroborunner.IoTRoboRunner(config)
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

  test("IoTTwinMaker") {
    val instance = new services.iottwinmaker.IoTTwinMaker(config)
  }

  test("IoTWireless") {
    val instance = new services.iotwireless.IoTWireless(config)
  }

  test("Iot") {
    val instance = new services.iot.Iot(config)
  }

  test("IotData") {
    val instance = new services.iotdata.IotData(config)
  }

  test("IotDeviceAdvisor") {
    val instance = new services.iotdeviceadvisor.IotDeviceAdvisor(config)
  }

  test("KMS") {
    val instance = new services.kms.KMS(config)
  }

  test("Kafka") {
    val instance = new services.kafka.Kafka(config)
  }

  test("KafkaConnect") {
    val instance = new services.kafkaconnect.KafkaConnect(config)
  }

  test("Kendra") {
    val instance = new services.kendra.Kendra(config)
  }

  test("Keyspaces") {
    val instance = new services.keyspaces.Keyspaces(config)
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

  test("LexModelsV2") {
    val instance = new services.lexmodelsv2.LexModelsV2(config)
  }

  test("LexRuntime") {
    val instance = new services.lexruntime.LexRuntime(config)
  }

  test("LexRuntimeV2") {
    val instance = new services.lexruntimev2.LexRuntimeV2(config)
  }

  test("LicenseManager") {
    val instance = new services.licensemanager.LicenseManager(config)
  }

  test("LicenseManagerUserSubscriptions") {
    val instance = new services.licensemanagerusersubscriptions.LicenseManagerUserSubscriptions(config)
  }

  test("Lightsail") {
    val instance = new services.lightsail.Lightsail(config)
  }

  test("Location") {
    val instance = new services.location.Location(config)
  }

  test("LookoutEquipment") {
    val instance = new services.lookoutequipment.LookoutEquipment(config)
  }

  test("LookoutMetrics") {
    val instance = new services.lookoutmetrics.LookoutMetrics(config)
  }

  test("LookoutVision") {
    val instance = new services.lookoutvision.LookoutVision(config)
  }

  test("M2") {
    val instance = new services.m2.M2(config)
  }

  test("MQ") {
    val instance = new services.mq.MQ(config)
  }

  test("MTurk") {
    val instance = new services.mturk.MTurk(config)
  }

  test("MWAA") {
    val instance = new services.mwaa.MWAA(config)
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

  test("MemoryDB") {
    val instance = new services.memorydb.MemoryDB(config)
  }

  test("Mgn") {
    val instance = new services.mgn.Mgn(config)
  }

  test("MigrationHub") {
    val instance = new services.migrationhub.MigrationHub(config)
  }

  test("MigrationHubConfig") {
    val instance = new services.migrationhubconfig.MigrationHubConfig(config)
  }

  test("MigrationHubOrchestrator") {
    val instance = new services.migrationhuborchestrator.MigrationHubOrchestrator(config)
  }

  test("MigrationHubRefactorSpaces") {
    val instance = new services.migrationhubrefactorspaces.MigrationHubRefactorSpaces(config)
  }

  test("MigrationHubStrategy") {
    val instance = new services.migrationhubstrategy.MigrationHubStrategy(config)
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

  test("NetworkFirewall") {
    val instance = new services.networkfirewall.NetworkFirewall(config)
  }

  test("NetworkManager") {
    val instance = new services.networkmanager.NetworkManager(config)
  }

  test("Nimble") {
    val instance = new services.nimble.Nimble(config)
  }

  test("OAM") {
    val instance = new services.oam.OAM(config)
  }

  test("Omics") {
    val instance = new services.omics.Omics(config)
  }

  test("OpenSearch") {
    val instance = new services.opensearch.OpenSearch(config)
  }

  test("OpenSearchServerless") {
    val instance = new services.opensearchserverless.OpenSearchServerless(config)
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

  test("Panorama") {
    val instance = new services.panorama.Panorama(config)
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

  test("PinpointSMSVoiceV2") {
    val instance = new services.pinpointsmsvoicev2.PinpointSMSVoiceV2(config)
  }

  test("Pipes") {
    val instance = new services.pipes.Pipes(config)
  }

  test("Polly") {
    val instance = new services.polly.Polly(config)
  }

  test("Pricing") {
    val instance = new services.pricing.Pricing(config)
  }

  test("PrivateNetworks") {
    val instance = new services.privatenetworks.PrivateNetworks(config)
  }

  test("Proton") {
    val instance = new services.proton.Proton(config)
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

  test("RBin") {
    val instance = new services.rbin.RBin(config)
  }

  test("RDS") {
    val instance = new services.rds.RDS(config)
  }

  test("RDSDataService") {
    val instance = new services.rdsdataservice.RDSDataService(config)
  }

  test("RUM") {
    val instance = new services.rum.RUM(config)
  }

  test("Redshift") {
    val instance = new services.redshift.Redshift(config)
  }

  test("RedshiftData") {
    val instance = new services.redshiftdata.RedshiftData(config)
  }

  test("RedshiftServerless") {
    val instance = new services.redshiftserverless.RedshiftServerless(config)
  }

  test("Rekognition") {
    val instance = new services.rekognition.Rekognition(config)
  }

  test("ResilienceHub") {
    val instance = new services.resiliencehub.ResilienceHub(config)
  }

  test("ResourceExplorer2") {
    val instance = new services.resourceexplorer2.ResourceExplorer2(config)
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

  test("RolesAnywhere") {
    val instance = new services.rolesanywhere.RolesAnywhere(config)
  }

  test("Route53") {
    val instance = new services.route53.Route53(config)
  }

  test("Route53Domains") {
    val instance = new services.route53domains.Route53Domains(config)
  }

  test("Route53RecoveryCluster") {
    val instance = new services.route53recoverycluster.Route53RecoveryCluster(config)
  }

  test("Route53RecoveryControlConfig") {
    val instance = new services.route53recoverycontrolconfig.Route53RecoveryControlConfig(config)
  }

  test("Route53RecoveryReadiness") {
    val instance = new services.route53recoveryreadiness.Route53RecoveryReadiness(config)
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

  test("S3Outposts") {
    val instance = new services.s3outposts.S3Outposts(config)
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

  test("SSMContacts") {
    val instance = new services.ssmcontacts.SSMContacts(config)
  }

  test("SSMIncidents") {
    val instance = new services.ssmincidents.SSMIncidents(config)
  }

  test("SSO") {
    val instance = new services.sso.SSO(config)
  }

  test("SSOAdmin") {
    val instance = new services.ssoadmin.SSOAdmin(config)
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

  test("SageMakerFeatureStoreRuntime") {
    val instance = new services.sagemakerfeaturestoreruntime.SageMakerFeatureStoreRuntime(config)
  }

  test("SageMakerGeospatial") {
    val instance = new services.sagemakergeospatial.SageMakerGeospatial(config)
  }

  test("SageMakerRuntime") {
    val instance = new services.sagemakerruntime.SageMakerRuntime(config)
  }

  test("SagemakerEdge") {
    val instance = new services.sagemakeredge.SagemakerEdge(config)
  }

  test("SavingsPlans") {
    val instance = new services.savingsplans.SavingsPlans(config)
  }

  test("Scheduler") {
    val instance = new services.scheduler.Scheduler(config)
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

  test("SecurityLake") {
    val instance = new services.securitylake.SecurityLake(config)
  }

  test("ServerlessApplicationRepository") {
    val instance = new services.serverlessapplicationrepository.ServerlessApplicationRepository(config)
  }

  test("ServiceCatalog") {
    val instance = new services.servicecatalog.ServiceCatalog(config)
  }

  test("ServiceCatalogAppRegistry") {
    val instance = new services.servicecatalogappregistry.ServiceCatalogAppRegistry(config)
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

  test("SimSpaceWeaver") {
    val instance = new services.simspaceweaver.SimSpaceWeaver(config)
  }

  test("SimpleDB") {
    val instance = new services.simpledb.SimpleDB(config)
  }

  test("SnowDeviceManagement") {
    val instance = new services.snowdevicemanagement.SnowDeviceManagement(config)
  }

  test("Snowball") {
    val instance = new services.snowball.Snowball(config)
  }

  test("SsmSap") {
    val instance = new services.ssmsap.SsmSap(config)
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

  test("SupportApp") {
    val instance = new services.supportapp.SupportApp(config)
  }

  test("Synthetics") {
    val instance = new services.synthetics.Synthetics(config)
  }

  test("Textract") {
    val instance = new services.textract.Textract(config)
  }

  test("TimestreamQuery") {
    val instance = new services.timestreamquery.TimestreamQuery(config)
  }

  test("TimestreamWrite") {
    val instance = new services.timestreamwrite.TimestreamWrite(config)
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

  test("VoiceID") {
    val instance = new services.voiceid.VoiceID(config)
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

  test("WellArchitected") {
    val instance = new services.wellarchitected.WellArchitected(config)
  }

  test("Wisdom") {
    val instance = new services.wisdom.Wisdom(config)
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

  test("WorkSpacesWeb") {
    val instance = new services.workspacesweb.WorkSpacesWeb(config)
  }

  test("XRay") {
    val instance = new services.xray.XRay(config)
  }

}
