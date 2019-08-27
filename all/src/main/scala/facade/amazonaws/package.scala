package facade

package object amazonaws {
  implicit final class AWSExtensionMethods(val aws: AWS.type) extends AnyVal {
    def config_=(config: AWSConfig): Unit = {
      aws.config = config match {
        case global: AWSConfigWithServicesDefault => global
        case _                                    => config.asInstanceOf[AWSConfigWithServicesDefault]
      }
    }

    type ACM = services.acm.ACM
    def ACM(): services.acm.ACM                  = new services.acm.ACM()
    def ACM(config: AWSConfig): services.acm.ACM = new services.acm.ACM(config)

    type ACMPCA = services.acmpca.ACMPCA
    def ACMPCA(): services.acmpca.ACMPCA                  = new services.acmpca.ACMPCA()
    def ACMPCA(config: AWSConfig): services.acmpca.ACMPCA = new services.acmpca.ACMPCA(config)

    type AlexaForBusiness = services.alexaforbusiness.AlexaForBusiness
    def AlexaForBusiness(): services.alexaforbusiness.AlexaForBusiness =
      new services.alexaforbusiness.AlexaForBusiness()
    def AlexaForBusiness(config: AWSConfig): services.alexaforbusiness.AlexaForBusiness =
      new services.alexaforbusiness.AlexaForBusiness(config)

    type Amplify = services.amplify.Amplify
    def Amplify(): services.amplify.Amplify                  = new services.amplify.Amplify()
    def Amplify(config: AWSConfig): services.amplify.Amplify = new services.amplify.Amplify(config)

    type APIGateway = services.apigateway.APIGateway
    def APIGateway(): services.apigateway.APIGateway                  = new services.apigateway.APIGateway()
    def APIGateway(config: AWSConfig): services.apigateway.APIGateway = new services.apigateway.APIGateway(config)

    type ApiGatewayManagementApi = services.apigatewaymanagementapi.ApiGatewayManagementApi
    def ApiGatewayManagementApi(): services.apigatewaymanagementapi.ApiGatewayManagementApi =
      new services.apigatewaymanagementapi.ApiGatewayManagementApi()
    def ApiGatewayManagementApi(config: AWSConfig): services.apigatewaymanagementapi.ApiGatewayManagementApi =
      new services.apigatewaymanagementapi.ApiGatewayManagementApi(config)

    type ApiGatewayV2 = services.apigatewayv2.ApiGatewayV2
    def ApiGatewayV2(): services.apigatewayv2.ApiGatewayV2 = new services.apigatewayv2.ApiGatewayV2()
    def ApiGatewayV2(config: AWSConfig): services.apigatewayv2.ApiGatewayV2 =
      new services.apigatewayv2.ApiGatewayV2(config)

    type ApplicationAutoScaling = services.applicationautoscaling.ApplicationAutoScaling
    def ApplicationAutoScaling(): services.applicationautoscaling.ApplicationAutoScaling =
      new services.applicationautoscaling.ApplicationAutoScaling()
    def ApplicationAutoScaling(config: AWSConfig): services.applicationautoscaling.ApplicationAutoScaling =
      new services.applicationautoscaling.ApplicationAutoScaling(config)

    type AppMesh = services.appmesh.AppMesh
    def AppMesh(): services.appmesh.AppMesh                  = new services.appmesh.AppMesh()
    def AppMesh(config: AWSConfig): services.appmesh.AppMesh = new services.appmesh.AppMesh(config)

    type AppStream = services.appstream.AppStream
    def AppStream(): services.appstream.AppStream                  = new services.appstream.AppStream()
    def AppStream(config: AWSConfig): services.appstream.AppStream = new services.appstream.AppStream(config)

    type AppSync = services.appsync.AppSync
    def AppSync(): services.appsync.AppSync                  = new services.appsync.AppSync()
    def AppSync(config: AWSConfig): services.appsync.AppSync = new services.appsync.AppSync(config)

    type Athena = services.athena.Athena
    def Athena(): services.athena.Athena                  = new services.athena.Athena()
    def Athena(config: AWSConfig): services.athena.Athena = new services.athena.Athena(config)

    type AutoScaling = services.autoscaling.AutoScaling
    def AutoScaling(): services.autoscaling.AutoScaling                  = new services.autoscaling.AutoScaling()
    def AutoScaling(config: AWSConfig): services.autoscaling.AutoScaling = new services.autoscaling.AutoScaling(config)

    type AutoScalingPlans = services.autoscalingplans.AutoScalingPlans
    def AutoScalingPlans(): services.autoscalingplans.AutoScalingPlans =
      new services.autoscalingplans.AutoScalingPlans()
    def AutoScalingPlans(config: AWSConfig): services.autoscalingplans.AutoScalingPlans =
      new services.autoscalingplans.AutoScalingPlans(config)

    type MigrationHub = services.migrationhub.MigrationHub
    def MigrationHub(): services.migrationhub.MigrationHub = new services.migrationhub.MigrationHub()
    def MigrationHub(config: AWSConfig): services.migrationhub.MigrationHub =
      new services.migrationhub.MigrationHub(config)

    type Backup = services.backup.Backup
    def Backup(): services.backup.Backup                  = new services.backup.Backup()
    def Backup(config: AWSConfig): services.backup.Backup = new services.backup.Backup(config)

    type Batch = services.batch.Batch
    def Batch(): services.batch.Batch                  = new services.batch.Batch()
    def Batch(config: AWSConfig): services.batch.Batch = new services.batch.Batch(config)

    type BudgetsService = services.budgetsservice.BudgetsService
    def BudgetsService(): services.budgetsservice.BudgetsService = new services.budgetsservice.BudgetsService()
    def BudgetsService(config: AWSConfig): services.budgetsservice.BudgetsService =
      new services.budgetsservice.BudgetsService(config)

    type CostExplorer = services.costexplorer.CostExplorer
    def CostExplorer(): services.costexplorer.CostExplorer = new services.costexplorer.CostExplorer()
    def CostExplorer(config: AWSConfig): services.costexplorer.CostExplorer =
      new services.costexplorer.CostExplorer(config)

    type Chime = services.chime.Chime
    def Chime(): services.chime.Chime                  = new services.chime.Chime()
    def Chime(config: AWSConfig): services.chime.Chime = new services.chime.Chime(config)

    type Cloud9 = services.cloud9.Cloud9
    def Cloud9(): services.cloud9.Cloud9                  = new services.cloud9.Cloud9()
    def Cloud9(config: AWSConfig): services.cloud9.Cloud9 = new services.cloud9.Cloud9(config)

    type CloudDirectory = services.clouddirectory.CloudDirectory
    def CloudDirectory(): services.clouddirectory.CloudDirectory = new services.clouddirectory.CloudDirectory()
    def CloudDirectory(config: AWSConfig): services.clouddirectory.CloudDirectory =
      new services.clouddirectory.CloudDirectory(config)

    type CloudFormation = services.cloudformation.CloudFormation
    def CloudFormation(): services.cloudformation.CloudFormation = new services.cloudformation.CloudFormation()
    def CloudFormation(config: AWSConfig): services.cloudformation.CloudFormation =
      new services.cloudformation.CloudFormation(config)

    type CloudFront = services.cloudfront.CloudFront
    def CloudFront(): services.cloudfront.CloudFront                  = new services.cloudfront.CloudFront()
    def CloudFront(config: AWSConfig): services.cloudfront.CloudFront = new services.cloudfront.CloudFront(config)

    type CloudHSM = services.cloudhsm.CloudHSM
    def CloudHSM(): services.cloudhsm.CloudHSM                  = new services.cloudhsm.CloudHSM()
    def CloudHSM(config: AWSConfig): services.cloudhsm.CloudHSM = new services.cloudhsm.CloudHSM(config)

    type CloudHSMV2 = services.cloudhsmv2.CloudHSMV2
    def CloudHSMV2(): services.cloudhsmv2.CloudHSMV2                  = new services.cloudhsmv2.CloudHSMV2()
    def CloudHSMV2(config: AWSConfig): services.cloudhsmv2.CloudHSMV2 = new services.cloudhsmv2.CloudHSMV2(config)

    type CloudSearch = services.cloudsearch.CloudSearch
    def CloudSearch(): services.cloudsearch.CloudSearch                  = new services.cloudsearch.CloudSearch()
    def CloudSearch(config: AWSConfig): services.cloudsearch.CloudSearch = new services.cloudsearch.CloudSearch(config)

    type CloudSearchDomain = services.cloudsearchdomain.CloudSearchDomain
    def CloudSearchDomain(): services.cloudsearchdomain.CloudSearchDomain =
      new services.cloudsearchdomain.CloudSearchDomain()
    def CloudSearchDomain(config: AWSConfig): services.cloudsearchdomain.CloudSearchDomain =
      new services.cloudsearchdomain.CloudSearchDomain(config)

    type CloudTrail = services.cloudtrail.CloudTrail
    def CloudTrail(): services.cloudtrail.CloudTrail                  = new services.cloudtrail.CloudTrail()
    def CloudTrail(config: AWSConfig): services.cloudtrail.CloudTrail = new services.cloudtrail.CloudTrail(config)

    type CodeBuild = services.codebuild.CodeBuild
    def CodeBuild(): services.codebuild.CodeBuild                  = new services.codebuild.CodeBuild()
    def CodeBuild(config: AWSConfig): services.codebuild.CodeBuild = new services.codebuild.CodeBuild(config)

    type CodeCommit = services.codecommit.CodeCommit
    def CodeCommit(): services.codecommit.CodeCommit                  = new services.codecommit.CodeCommit()
    def CodeCommit(config: AWSConfig): services.codecommit.CodeCommit = new services.codecommit.CodeCommit(config)

    type CodeDeploy = services.codedeploy.CodeDeploy
    def CodeDeploy(): services.codedeploy.CodeDeploy                  = new services.codedeploy.CodeDeploy()
    def CodeDeploy(config: AWSConfig): services.codedeploy.CodeDeploy = new services.codedeploy.CodeDeploy(config)

    type CodePipeline = services.codepipeline.CodePipeline
    def CodePipeline(): services.codepipeline.CodePipeline = new services.codepipeline.CodePipeline()
    def CodePipeline(config: AWSConfig): services.codepipeline.CodePipeline =
      new services.codepipeline.CodePipeline(config)

    type CodeStar = services.codestar.CodeStar
    def CodeStar(): services.codestar.CodeStar                  = new services.codestar.CodeStar()
    def CodeStar(config: AWSConfig): services.codestar.CodeStar = new services.codestar.CodeStar(config)

    type CognitoIdentity = services.cognitoidentity.CognitoIdentity
    def CognitoIdentity(): services.cognitoidentity.CognitoIdentity = new services.cognitoidentity.CognitoIdentity()
    def CognitoIdentity(config: AWSConfig): services.cognitoidentity.CognitoIdentity =
      new services.cognitoidentity.CognitoIdentity(config)

    type CognitoIdentityProvider = services.cognitoidentityprovider.CognitoIdentityProvider
    def CognitoIdentityProvider(): services.cognitoidentityprovider.CognitoIdentityProvider =
      new services.cognitoidentityprovider.CognitoIdentityProvider()
    def CognitoIdentityProvider(config: AWSConfig): services.cognitoidentityprovider.CognitoIdentityProvider =
      new services.cognitoidentityprovider.CognitoIdentityProvider(config)

    type CognitoSync = services.cognitosync.CognitoSync
    def CognitoSync(): services.cognitosync.CognitoSync                  = new services.cognitosync.CognitoSync()
    def CognitoSync(config: AWSConfig): services.cognitosync.CognitoSync = new services.cognitosync.CognitoSync(config)

    type Comprehend = services.comprehend.Comprehend
    def Comprehend(): services.comprehend.Comprehend                  = new services.comprehend.Comprehend()
    def Comprehend(config: AWSConfig): services.comprehend.Comprehend = new services.comprehend.Comprehend(config)

    type ComprehendMedical = services.comprehendmedical.ComprehendMedical
    def ComprehendMedical(): services.comprehendmedical.ComprehendMedical =
      new services.comprehendmedical.ComprehendMedical()
    def ComprehendMedical(config: AWSConfig): services.comprehendmedical.ComprehendMedical =
      new services.comprehendmedical.ComprehendMedical(config)

    type ConfigService = services.configservice.ConfigService
    def ConfigService(): services.configservice.ConfigService = new services.configservice.ConfigService()
    def ConfigService(config: AWSConfig): services.configservice.ConfigService =
      new services.configservice.ConfigService(config)

    type Connect = services.connect.Connect
    def Connect(): services.connect.Connect                  = new services.connect.Connect()
    def Connect(config: AWSConfig): services.connect.Connect = new services.connect.Connect(config)

    type CUR = services.cur.CUR
    def CUR(): services.cur.CUR                  = new services.cur.CUR()
    def CUR(config: AWSConfig): services.cur.CUR = new services.cur.CUR(config)

    type DataPipeline = services.datapipeline.DataPipeline
    def DataPipeline(): services.datapipeline.DataPipeline = new services.datapipeline.DataPipeline()
    def DataPipeline(config: AWSConfig): services.datapipeline.DataPipeline =
      new services.datapipeline.DataPipeline(config)

    type DataSync = services.datasync.DataSync
    def DataSync(): services.datasync.DataSync                  = new services.datasync.DataSync()
    def DataSync(config: AWSConfig): services.datasync.DataSync = new services.datasync.DataSync(config)

    type DAX = services.dax.DAX
    def DAX(): services.dax.DAX                  = new services.dax.DAX()
    def DAX(config: AWSConfig): services.dax.DAX = new services.dax.DAX(config)

    type DeviceFarm = services.devicefarm.DeviceFarm
    def DeviceFarm(): services.devicefarm.DeviceFarm                  = new services.devicefarm.DeviceFarm()
    def DeviceFarm(config: AWSConfig): services.devicefarm.DeviceFarm = new services.devicefarm.DeviceFarm(config)

    type DirectConnect = services.directconnect.DirectConnect
    def DirectConnect(): services.directconnect.DirectConnect = new services.directconnect.DirectConnect()
    def DirectConnect(config: AWSConfig): services.directconnect.DirectConnect =
      new services.directconnect.DirectConnect(config)

    type ApplicationDiscovery = services.applicationdiscovery.ApplicationDiscovery
    def ApplicationDiscovery(): services.applicationdiscovery.ApplicationDiscovery =
      new services.applicationdiscovery.ApplicationDiscovery()
    def ApplicationDiscovery(config: AWSConfig): services.applicationdiscovery.ApplicationDiscovery =
      new services.applicationdiscovery.ApplicationDiscovery(config)

    type DLM = services.dlm.DLM
    def DLM(): services.dlm.DLM                  = new services.dlm.DLM()
    def DLM(config: AWSConfig): services.dlm.DLM = new services.dlm.DLM(config)

    type DMS = services.dms.DMS
    def DMS(): services.dms.DMS                  = new services.dms.DMS()
    def DMS(config: AWSConfig): services.dms.DMS = new services.dms.DMS(config)

    type DocDB = services.docdb.DocDB
    def DocDB(): services.docdb.DocDB                  = new services.docdb.DocDB()
    def DocDB(config: AWSConfig): services.docdb.DocDB = new services.docdb.DocDB(config)

    type DirectoryService = services.directoryservice.DirectoryService
    def DirectoryService(): services.directoryservice.DirectoryService =
      new services.directoryservice.DirectoryService()
    def DirectoryService(config: AWSConfig): services.directoryservice.DirectoryService =
      new services.directoryservice.DirectoryService(config)

    type DynamoDB = services.dynamodb.DynamoDB
    def DynamoDB(): services.dynamodb.DynamoDB                  = new services.dynamodb.DynamoDB()
    def DynamoDB(config: AWSConfig): services.dynamodb.DynamoDB = new services.dynamodb.DynamoDB(config)

    type EC2 = services.ec2.EC2
    def EC2(): services.ec2.EC2                  = new services.ec2.EC2()
    def EC2(config: AWSConfig): services.ec2.EC2 = new services.ec2.EC2(config)

    type EC2InstanceConnect = services.ec2instanceconnect.EC2InstanceConnect
    def EC2InstanceConnect(): services.ec2instanceconnect.EC2InstanceConnect =
      new services.ec2instanceconnect.EC2InstanceConnect()
    def EC2InstanceConnect(config: AWSConfig): services.ec2instanceconnect.EC2InstanceConnect =
      new services.ec2instanceconnect.EC2InstanceConnect(config)

    type ECR = services.ecr.ECR
    def ECR(): services.ecr.ECR                  = new services.ecr.ECR()
    def ECR(config: AWSConfig): services.ecr.ECR = new services.ecr.ECR(config)

    type ECS = services.ecs.ECS
    def ECS(): services.ecs.ECS                  = new services.ecs.ECS()
    def ECS(config: AWSConfig): services.ecs.ECS = new services.ecs.ECS(config)

    type EKS = services.eks.EKS
    def EKS(): services.eks.EKS                  = new services.eks.EKS()
    def EKS(config: AWSConfig): services.eks.EKS = new services.eks.EKS(config)

    type ElastiCache = services.elasticache.ElastiCache
    def ElastiCache(): services.elasticache.ElastiCache                  = new services.elasticache.ElastiCache()
    def ElastiCache(config: AWSConfig): services.elasticache.ElastiCache = new services.elasticache.ElastiCache(config)

    type ElasticBeanstalk = services.elasticbeanstalk.ElasticBeanstalk
    def ElasticBeanstalk(): services.elasticbeanstalk.ElasticBeanstalk =
      new services.elasticbeanstalk.ElasticBeanstalk()
    def ElasticBeanstalk(config: AWSConfig): services.elasticbeanstalk.ElasticBeanstalk =
      new services.elasticbeanstalk.ElasticBeanstalk(config)

    type EFS = services.efs.EFS
    def EFS(): services.efs.EFS                  = new services.efs.EFS()
    def EFS(config: AWSConfig): services.efs.EFS = new services.efs.EFS(config)

    type ELB = services.elb.ELB
    def ELB(): services.elb.ELB                  = new services.elb.ELB()
    def ELB(config: AWSConfig): services.elb.ELB = new services.elb.ELB(config)

    type ELBv2 = services.elbv2.ELBv2
    def ELBv2(): services.elbv2.ELBv2                  = new services.elbv2.ELBv2()
    def ELBv2(config: AWSConfig): services.elbv2.ELBv2 = new services.elbv2.ELBv2(config)

    type EMR = services.emr.EMR
    def EMR(): services.emr.EMR                  = new services.emr.EMR()
    def EMR(config: AWSConfig): services.emr.EMR = new services.emr.EMR(config)

    type ElasticTranscoder = services.elastictranscoder.ElasticTranscoder
    def ElasticTranscoder(): services.elastictranscoder.ElasticTranscoder =
      new services.elastictranscoder.ElasticTranscoder()
    def ElasticTranscoder(config: AWSConfig): services.elastictranscoder.ElasticTranscoder =
      new services.elastictranscoder.ElasticTranscoder(config)

    type SES = services.ses.SES
    def SES(): services.ses.SES                  = new services.ses.SES()
    def SES(config: AWSConfig): services.ses.SES = new services.ses.SES(config)

    type MarketplaceEntitlementService = services.marketplaceentitlementservice.MarketplaceEntitlementService
    def MarketplaceEntitlementService(): services.marketplaceentitlementservice.MarketplaceEntitlementService =
      new services.marketplaceentitlementservice.MarketplaceEntitlementService()
    def MarketplaceEntitlementService(
        config: AWSConfig
    ): services.marketplaceentitlementservice.MarketplaceEntitlementService =
      new services.marketplaceentitlementservice.MarketplaceEntitlementService(config)

    type ES = services.es.ES
    def ES(): services.es.ES                  = new services.es.ES()
    def ES(config: AWSConfig): services.es.ES = new services.es.ES(config)

    type EventBridge = services.eventbridge.EventBridge
    def EventBridge(): services.eventbridge.EventBridge                  = new services.eventbridge.EventBridge()
    def EventBridge(config: AWSConfig): services.eventbridge.EventBridge = new services.eventbridge.EventBridge(config)

    type CloudWatchEvents = services.cloudwatchevents.CloudWatchEvents
    def CloudWatchEvents(): services.cloudwatchevents.CloudWatchEvents =
      new services.cloudwatchevents.CloudWatchEvents()
    def CloudWatchEvents(config: AWSConfig): services.cloudwatchevents.CloudWatchEvents =
      new services.cloudwatchevents.CloudWatchEvents(config)

    type Firehose = services.firehose.Firehose
    def Firehose(): services.firehose.Firehose                  = new services.firehose.Firehose()
    def Firehose(config: AWSConfig): services.firehose.Firehose = new services.firehose.Firehose(config)

    type FMS = services.fms.FMS
    def FMS(): services.fms.FMS                  = new services.fms.FMS()
    def FMS(config: AWSConfig): services.fms.FMS = new services.fms.FMS(config)

    type forecast = services.forecast.forecast
    def forecast(): services.forecast.forecast                  = new services.forecast.forecast()
    def forecast(config: AWSConfig): services.forecast.forecast = new services.forecast.forecast(config)

    type forecastquery = services.forecastquery.forecastquery
    def forecastquery(): services.forecastquery.forecastquery = new services.forecastquery.forecastquery()
    def forecastquery(config: AWSConfig): services.forecastquery.forecastquery =
      new services.forecastquery.forecastquery(config)

    type FSx = services.fsx.FSx
    def FSx(): services.fsx.FSx                  = new services.fsx.FSx()
    def FSx(config: AWSConfig): services.fsx.FSx = new services.fsx.FSx(config)

    type GameLift = services.gamelift.GameLift
    def GameLift(): services.gamelift.GameLift                  = new services.gamelift.GameLift()
    def GameLift(config: AWSConfig): services.gamelift.GameLift = new services.gamelift.GameLift(config)

    type Glacier = services.glacier.Glacier
    def Glacier(): services.glacier.Glacier                  = new services.glacier.Glacier()
    def Glacier(config: AWSConfig): services.glacier.Glacier = new services.glacier.Glacier(config)

    type GlobalAccelerator = services.globalaccelerator.GlobalAccelerator
    def GlobalAccelerator(): services.globalaccelerator.GlobalAccelerator =
      new services.globalaccelerator.GlobalAccelerator()
    def GlobalAccelerator(config: AWSConfig): services.globalaccelerator.GlobalAccelerator =
      new services.globalaccelerator.GlobalAccelerator(config)

    type Glue = services.glue.Glue
    def Glue(): services.glue.Glue                  = new services.glue.Glue()
    def Glue(config: AWSConfig): services.glue.Glue = new services.glue.Glue(config)

    type Greengrass = services.greengrass.Greengrass
    def Greengrass(): services.greengrass.Greengrass                  = new services.greengrass.Greengrass()
    def Greengrass(config: AWSConfig): services.greengrass.Greengrass = new services.greengrass.Greengrass(config)

    type GroundStation = services.groundstation.GroundStation
    def GroundStation(): services.groundstation.GroundStation = new services.groundstation.GroundStation()
    def GroundStation(config: AWSConfig): services.groundstation.GroundStation =
      new services.groundstation.GroundStation(config)

    type GuardDuty = services.guardduty.GuardDuty
    def GuardDuty(): services.guardduty.GuardDuty                  = new services.guardduty.GuardDuty()
    def GuardDuty(config: AWSConfig): services.guardduty.GuardDuty = new services.guardduty.GuardDuty(config)

    type Health = services.health.Health
    def Health(): services.health.Health                  = new services.health.Health()
    def Health(config: AWSConfig): services.health.Health = new services.health.Health(config)

    type IAM = services.iam.IAM
    def IAM(): services.iam.IAM                  = new services.iam.IAM()
    def IAM(config: AWSConfig): services.iam.IAM = new services.iam.IAM(config)

    type ImportExport = services.importexport.ImportExport
    def ImportExport(): services.importexport.ImportExport = new services.importexport.ImportExport()
    def ImportExport(config: AWSConfig): services.importexport.ImportExport =
      new services.importexport.ImportExport(config)

    type Inspector = services.inspector.Inspector
    def Inspector(): services.inspector.Inspector                  = new services.inspector.Inspector()
    def Inspector(config: AWSConfig): services.inspector.Inspector = new services.inspector.Inspector(config)

    type Iot = services.iot.Iot
    def Iot(): services.iot.Iot                  = new services.iot.Iot()
    def Iot(config: AWSConfig): services.iot.Iot = new services.iot.Iot(config)

    type IoTDataPlane = services.iotdataplane.IoTDataPlane
    def IoTDataPlane(): services.iotdataplane.IoTDataPlane = new services.iotdataplane.IoTDataPlane()
    def IoTDataPlane(config: AWSConfig): services.iotdataplane.IoTDataPlane =
      new services.iotdataplane.IoTDataPlane(config)

    type IoTJobsDataPlane = services.iotjobsdataplane.IoTJobsDataPlane
    def IoTJobsDataPlane(): services.iotjobsdataplane.IoTJobsDataPlane =
      new services.iotjobsdataplane.IoTJobsDataPlane()
    def IoTJobsDataPlane(config: AWSConfig): services.iotjobsdataplane.IoTJobsDataPlane =
      new services.iotjobsdataplane.IoTJobsDataPlane(config)

    type IoT1ClickDevicesService = services.iot1clickdevicesservice.IoT1ClickDevicesService
    def IoT1ClickDevicesService(): services.iot1clickdevicesservice.IoT1ClickDevicesService =
      new services.iot1clickdevicesservice.IoT1ClickDevicesService()
    def IoT1ClickDevicesService(config: AWSConfig): services.iot1clickdevicesservice.IoT1ClickDevicesService =
      new services.iot1clickdevicesservice.IoT1ClickDevicesService(config)

    type IoT1ClickProjects = services.iot1clickprojects.IoT1ClickProjects
    def IoT1ClickProjects(): services.iot1clickprojects.IoT1ClickProjects =
      new services.iot1clickprojects.IoT1ClickProjects()
    def IoT1ClickProjects(config: AWSConfig): services.iot1clickprojects.IoT1ClickProjects =
      new services.iot1clickprojects.IoT1ClickProjects(config)

    type IoTAnalytics = services.iotanalytics.IoTAnalytics
    def IoTAnalytics(): services.iotanalytics.IoTAnalytics = new services.iotanalytics.IoTAnalytics()
    def IoTAnalytics(config: AWSConfig): services.iotanalytics.IoTAnalytics =
      new services.iotanalytics.IoTAnalytics(config)

    type IoTEvents = services.iotevents.IoTEvents
    def IoTEvents(): services.iotevents.IoTEvents                  = new services.iotevents.IoTEvents()
    def IoTEvents(config: AWSConfig): services.iotevents.IoTEvents = new services.iotevents.IoTEvents(config)

    type IoTThingsGraph = services.iotthingsgraph.IoTThingsGraph
    def IoTThingsGraph(): services.iotthingsgraph.IoTThingsGraph = new services.iotthingsgraph.IoTThingsGraph()
    def IoTThingsGraph(config: AWSConfig): services.iotthingsgraph.IoTThingsGraph =
      new services.iotthingsgraph.IoTThingsGraph(config)

    type Kafka = services.kafka.Kafka
    def Kafka(): services.kafka.Kafka                  = new services.kafka.Kafka()
    def Kafka(config: AWSConfig): services.kafka.Kafka = new services.kafka.Kafka(config)

    type Kinesis = services.kinesis.Kinesis
    def Kinesis(): services.kinesis.Kinesis                  = new services.kinesis.Kinesis()
    def Kinesis(config: AWSConfig): services.kinesis.Kinesis = new services.kinesis.Kinesis(config)

    type KinesisVideoArchivedMedia = services.kinesisvideoarchivedmedia.KinesisVideoArchivedMedia
    def KinesisVideoArchivedMedia(): services.kinesisvideoarchivedmedia.KinesisVideoArchivedMedia =
      new services.kinesisvideoarchivedmedia.KinesisVideoArchivedMedia()
    def KinesisVideoArchivedMedia(config: AWSConfig): services.kinesisvideoarchivedmedia.KinesisVideoArchivedMedia =
      new services.kinesisvideoarchivedmedia.KinesisVideoArchivedMedia(config)

    type KinesisVideoMedia = services.kinesisvideomedia.KinesisVideoMedia
    def KinesisVideoMedia(): services.kinesisvideomedia.KinesisVideoMedia =
      new services.kinesisvideomedia.KinesisVideoMedia()
    def KinesisVideoMedia(config: AWSConfig): services.kinesisvideomedia.KinesisVideoMedia =
      new services.kinesisvideomedia.KinesisVideoMedia(config)

    type KinesisAnalytics = services.kinesisanalytics.KinesisAnalytics
    def KinesisAnalytics(): services.kinesisanalytics.KinesisAnalytics =
      new services.kinesisanalytics.KinesisAnalytics()
    def KinesisAnalytics(config: AWSConfig): services.kinesisanalytics.KinesisAnalytics =
      new services.kinesisanalytics.KinesisAnalytics(config)

    type KinesisAnalyticsV2 = services.kinesisanalyticsv2.KinesisAnalyticsV2
    def KinesisAnalyticsV2(): services.kinesisanalyticsv2.KinesisAnalyticsV2 =
      new services.kinesisanalyticsv2.KinesisAnalyticsV2()
    def KinesisAnalyticsV2(config: AWSConfig): services.kinesisanalyticsv2.KinesisAnalyticsV2 =
      new services.kinesisanalyticsv2.KinesisAnalyticsV2(config)

    type KinesisVideo = services.kinesisvideo.KinesisVideo
    def KinesisVideo(): services.kinesisvideo.KinesisVideo = new services.kinesisvideo.KinesisVideo()
    def KinesisVideo(config: AWSConfig): services.kinesisvideo.KinesisVideo =
      new services.kinesisvideo.KinesisVideo(config)

    type KMS = services.kms.KMS
    def KMS(): services.kms.KMS                  = new services.kms.KMS()
    def KMS(config: AWSConfig): services.kms.KMS = new services.kms.KMS(config)

    type LakeFormation = services.lakeformation.LakeFormation
    def LakeFormation(): services.lakeformation.LakeFormation = new services.lakeformation.LakeFormation()
    def LakeFormation(config: AWSConfig): services.lakeformation.LakeFormation =
      new services.lakeformation.LakeFormation(config)

    type Lambda = services.lambda.Lambda
    def Lambda(): services.lambda.Lambda                  = new services.lambda.Lambda()
    def Lambda(config: AWSConfig): services.lambda.Lambda = new services.lambda.Lambda(config)

    type LexModelBuildingService = services.lexmodelbuildingservice.LexModelBuildingService
    def LexModelBuildingService(): services.lexmodelbuildingservice.LexModelBuildingService =
      new services.lexmodelbuildingservice.LexModelBuildingService()
    def LexModelBuildingService(config: AWSConfig): services.lexmodelbuildingservice.LexModelBuildingService =
      new services.lexmodelbuildingservice.LexModelBuildingService(config)

    type LicenseManager = services.licensemanager.LicenseManager
    def LicenseManager(): services.licensemanager.LicenseManager = new services.licensemanager.LicenseManager()
    def LicenseManager(config: AWSConfig): services.licensemanager.LicenseManager =
      new services.licensemanager.LicenseManager(config)

    type Lightsail = services.lightsail.Lightsail
    def Lightsail(): services.lightsail.Lightsail                  = new services.lightsail.Lightsail()
    def Lightsail(config: AWSConfig): services.lightsail.Lightsail = new services.lightsail.Lightsail(config)

    type CloudWatchLogs = services.cloudwatchlogs.CloudWatchLogs
    def CloudWatchLogs(): services.cloudwatchlogs.CloudWatchLogs = new services.cloudwatchlogs.CloudWatchLogs()
    def CloudWatchLogs(config: AWSConfig): services.cloudwatchlogs.CloudWatchLogs =
      new services.cloudwatchlogs.CloudWatchLogs(config)

    type MachineLearning = services.machinelearning.MachineLearning
    def MachineLearning(): services.machinelearning.MachineLearning = new services.machinelearning.MachineLearning()
    def MachineLearning(config: AWSConfig): services.machinelearning.MachineLearning =
      new services.machinelearning.MachineLearning(config)

    type Macie = services.macie.Macie
    def Macie(): services.macie.Macie                  = new services.macie.Macie()
    def Macie(config: AWSConfig): services.macie.Macie = new services.macie.Macie(config)

    type ManagedBlockchain = services.managedblockchain.ManagedBlockchain
    def ManagedBlockchain(): services.managedblockchain.ManagedBlockchain =
      new services.managedblockchain.ManagedBlockchain()
    def ManagedBlockchain(config: AWSConfig): services.managedblockchain.ManagedBlockchain =
      new services.managedblockchain.ManagedBlockchain(config)

    type MarketplaceCommerceAnalytics = services.marketplacecommerceanalytics.MarketplaceCommerceAnalytics
    def MarketplaceCommerceAnalytics(): services.marketplacecommerceanalytics.MarketplaceCommerceAnalytics =
      new services.marketplacecommerceanalytics.MarketplaceCommerceAnalytics()
    def MarketplaceCommerceAnalytics(
        config: AWSConfig
    ): services.marketplacecommerceanalytics.MarketplaceCommerceAnalytics =
      new services.marketplacecommerceanalytics.MarketplaceCommerceAnalytics(config)

    type MediaConnect = services.mediaconnect.MediaConnect
    def MediaConnect(): services.mediaconnect.MediaConnect = new services.mediaconnect.MediaConnect()
    def MediaConnect(config: AWSConfig): services.mediaconnect.MediaConnect =
      new services.mediaconnect.MediaConnect(config)

    type MediaConvert = services.mediaconvert.MediaConvert
    def MediaConvert(): services.mediaconvert.MediaConvert = new services.mediaconvert.MediaConvert()
    def MediaConvert(config: AWSConfig): services.mediaconvert.MediaConvert =
      new services.mediaconvert.MediaConvert(config)

    type MediaLive = services.medialive.MediaLive
    def MediaLive(): services.medialive.MediaLive                  = new services.medialive.MediaLive()
    def MediaLive(config: AWSConfig): services.medialive.MediaLive = new services.medialive.MediaLive(config)

    type MediaPackage = services.mediapackage.MediaPackage
    def MediaPackage(): services.mediapackage.MediaPackage = new services.mediapackage.MediaPackage()
    def MediaPackage(config: AWSConfig): services.mediapackage.MediaPackage =
      new services.mediapackage.MediaPackage(config)

    type MediaPackageVod = services.mediapackagevod.MediaPackageVod
    def MediaPackageVod(): services.mediapackagevod.MediaPackageVod = new services.mediapackagevod.MediaPackageVod()
    def MediaPackageVod(config: AWSConfig): services.mediapackagevod.MediaPackageVod =
      new services.mediapackagevod.MediaPackageVod(config)

    type MediaStore = services.mediastore.MediaStore
    def MediaStore(): services.mediastore.MediaStore                  = new services.mediastore.MediaStore()
    def MediaStore(config: AWSConfig): services.mediastore.MediaStore = new services.mediastore.MediaStore(config)

    type MediaStoreData = services.mediastoredata.MediaStoreData
    def MediaStoreData(): services.mediastoredata.MediaStoreData = new services.mediastoredata.MediaStoreData()
    def MediaStoreData(config: AWSConfig): services.mediastoredata.MediaStoreData =
      new services.mediastoredata.MediaStoreData(config)

    type MediaTailor = services.mediatailor.MediaTailor
    def MediaTailor(): services.mediatailor.MediaTailor                  = new services.mediatailor.MediaTailor()
    def MediaTailor(config: AWSConfig): services.mediatailor.MediaTailor = new services.mediatailor.MediaTailor(config)

    type MarketplaceMetering = services.marketplacemetering.MarketplaceMetering
    def MarketplaceMetering(): services.marketplacemetering.MarketplaceMetering =
      new services.marketplacemetering.MarketplaceMetering()
    def MarketplaceMetering(config: AWSConfig): services.marketplacemetering.MarketplaceMetering =
      new services.marketplacemetering.MarketplaceMetering(config)

    type Mobile = services.mobile.Mobile
    def Mobile(): services.mobile.Mobile                  = new services.mobile.Mobile()
    def Mobile(config: AWSConfig): services.mobile.Mobile = new services.mobile.Mobile(config)

    type MobileAnalytics = services.mobileanalytics.MobileAnalytics
    def MobileAnalytics(): services.mobileanalytics.MobileAnalytics = new services.mobileanalytics.MobileAnalytics()
    def MobileAnalytics(config: AWSConfig): services.mobileanalytics.MobileAnalytics =
      new services.mobileanalytics.MobileAnalytics(config)

    type CloudWatch = services.cloudwatch.CloudWatch
    def CloudWatch(): services.cloudwatch.CloudWatch                  = new services.cloudwatch.CloudWatch()
    def CloudWatch(config: AWSConfig): services.cloudwatch.CloudWatch = new services.cloudwatch.CloudWatch(config)

    type MQ = services.mq.MQ
    def MQ(): services.mq.MQ                  = new services.mq.MQ()
    def MQ(config: AWSConfig): services.mq.MQ = new services.mq.MQ(config)

    type MTurk = services.mturk.MTurk
    def MTurk(): services.mturk.MTurk                  = new services.mturk.MTurk()
    def MTurk(config: AWSConfig): services.mturk.MTurk = new services.mturk.MTurk(config)

    type Neptune = services.neptune.Neptune
    def Neptune(): services.neptune.Neptune                  = new services.neptune.Neptune()
    def Neptune(config: AWSConfig): services.neptune.Neptune = new services.neptune.Neptune(config)

    type OpsWorks = services.opsworks.OpsWorks
    def OpsWorks(): services.opsworks.OpsWorks                  = new services.opsworks.OpsWorks()
    def OpsWorks(config: AWSConfig): services.opsworks.OpsWorks = new services.opsworks.OpsWorks(config)

    type OpsWorksCM = services.opsworkscm.OpsWorksCM
    def OpsWorksCM(): services.opsworkscm.OpsWorksCM                  = new services.opsworkscm.OpsWorksCM()
    def OpsWorksCM(config: AWSConfig): services.opsworkscm.OpsWorksCM = new services.opsworkscm.OpsWorksCM(config)

    type Organizations = services.organizations.Organizations
    def Organizations(): services.organizations.Organizations = new services.organizations.Organizations()
    def Organizations(config: AWSConfig): services.organizations.Organizations =
      new services.organizations.Organizations(config)

    type Personalize = services.personalize.Personalize
    def Personalize(): services.personalize.Personalize                  = new services.personalize.Personalize()
    def Personalize(config: AWSConfig): services.personalize.Personalize = new services.personalize.Personalize(config)

    type PersonalizeEvents = services.personalizeevents.PersonalizeEvents
    def PersonalizeEvents(): services.personalizeevents.PersonalizeEvents =
      new services.personalizeevents.PersonalizeEvents()
    def PersonalizeEvents(config: AWSConfig): services.personalizeevents.PersonalizeEvents =
      new services.personalizeevents.PersonalizeEvents(config)

    type PersonalizeRuntime = services.personalizeruntime.PersonalizeRuntime
    def PersonalizeRuntime(): services.personalizeruntime.PersonalizeRuntime =
      new services.personalizeruntime.PersonalizeRuntime()
    def PersonalizeRuntime(config: AWSConfig): services.personalizeruntime.PersonalizeRuntime =
      new services.personalizeruntime.PersonalizeRuntime(config)

    type PI = services.pi.PI
    def PI(): services.pi.PI                  = new services.pi.PI()
    def PI(config: AWSConfig): services.pi.PI = new services.pi.PI(config)

    type Pinpoint = services.pinpoint.Pinpoint
    def Pinpoint(): services.pinpoint.Pinpoint                  = new services.pinpoint.Pinpoint()
    def Pinpoint(config: AWSConfig): services.pinpoint.Pinpoint = new services.pinpoint.Pinpoint(config)

    type PinpointEmail = services.pinpointemail.PinpointEmail
    def PinpointEmail(): services.pinpointemail.PinpointEmail = new services.pinpointemail.PinpointEmail()
    def PinpointEmail(config: AWSConfig): services.pinpointemail.PinpointEmail =
      new services.pinpointemail.PinpointEmail(config)

    type Polly = services.polly.Polly
    def Polly(): services.polly.Polly                  = new services.polly.Polly()
    def Polly(config: AWSConfig): services.polly.Polly = new services.polly.Polly(config)

    type Pricing = services.pricing.Pricing
    def Pricing(): services.pricing.Pricing                  = new services.pricing.Pricing()
    def Pricing(config: AWSConfig): services.pricing.Pricing = new services.pricing.Pricing(config)

    type QuickSight = services.quicksight.QuickSight
    def QuickSight(): services.quicksight.QuickSight                  = new services.quicksight.QuickSight()
    def QuickSight(config: AWSConfig): services.quicksight.QuickSight = new services.quicksight.QuickSight(config)

    type RAM = services.ram.RAM
    def RAM(): services.ram.RAM                  = new services.ram.RAM()
    def RAM(config: AWSConfig): services.ram.RAM = new services.ram.RAM(config)

    type RDS = services.rds.RDS
    def RDS(): services.rds.RDS                  = new services.rds.RDS()
    def RDS(config: AWSConfig): services.rds.RDS = new services.rds.RDS(config)

    type RDSDataService = services.rdsdataservice.RDSDataService
    def RDSDataService(): services.rdsdataservice.RDSDataService = new services.rdsdataservice.RDSDataService()
    def RDSDataService(config: AWSConfig): services.rdsdataservice.RDSDataService =
      new services.rdsdataservice.RDSDataService(config)

    type Redshift = services.redshift.Redshift
    def Redshift(): services.redshift.Redshift                  = new services.redshift.Redshift()
    def Redshift(config: AWSConfig): services.redshift.Redshift = new services.redshift.Redshift(config)

    type Rekognition = services.rekognition.Rekognition
    def Rekognition(): services.rekognition.Rekognition                  = new services.rekognition.Rekognition()
    def Rekognition(config: AWSConfig): services.rekognition.Rekognition = new services.rekognition.Rekognition(config)

    type ResourceGroups = services.resourcegroups.ResourceGroups
    def ResourceGroups(): services.resourcegroups.ResourceGroups = new services.resourcegroups.ResourceGroups()
    def ResourceGroups(config: AWSConfig): services.resourcegroups.ResourceGroups =
      new services.resourcegroups.ResourceGroups(config)

    type ResourceGroupsTaggingAPI = services.resourcegroupstaggingapi.ResourceGroupsTaggingAPI
    def ResourceGroupsTaggingAPI(): services.resourcegroupstaggingapi.ResourceGroupsTaggingAPI =
      new services.resourcegroupstaggingapi.ResourceGroupsTaggingAPI()
    def ResourceGroupsTaggingAPI(config: AWSConfig): services.resourcegroupstaggingapi.ResourceGroupsTaggingAPI =
      new services.resourcegroupstaggingapi.ResourceGroupsTaggingAPI(config)

    type RoboMaker = services.robomaker.RoboMaker
    def RoboMaker(): services.robomaker.RoboMaker                  = new services.robomaker.RoboMaker()
    def RoboMaker(config: AWSConfig): services.robomaker.RoboMaker = new services.robomaker.RoboMaker(config)

    type Route53 = services.route53.Route53
    def Route53(): services.route53.Route53                  = new services.route53.Route53()
    def Route53(config: AWSConfig): services.route53.Route53 = new services.route53.Route53(config)

    type Route53Domains = services.route53domains.Route53Domains
    def Route53Domains(): services.route53domains.Route53Domains = new services.route53domains.Route53Domains()
    def Route53Domains(config: AWSConfig): services.route53domains.Route53Domains =
      new services.route53domains.Route53Domains(config)

    type Route53Resolver = services.route53resolver.Route53Resolver
    def Route53Resolver(): services.route53resolver.Route53Resolver = new services.route53resolver.Route53Resolver()
    def Route53Resolver(config: AWSConfig): services.route53resolver.Route53Resolver =
      new services.route53resolver.Route53Resolver(config)

    type LexRuntime = services.lexruntime.LexRuntime
    def LexRuntime(): services.lexruntime.LexRuntime                  = new services.lexruntime.LexRuntime()
    def LexRuntime(config: AWSConfig): services.lexruntime.LexRuntime = new services.lexruntime.LexRuntime(config)

    type SageMakerRuntime = services.sagemakerruntime.SageMakerRuntime
    def SageMakerRuntime(): services.sagemakerruntime.SageMakerRuntime =
      new services.sagemakerruntime.SageMakerRuntime()
    def SageMakerRuntime(config: AWSConfig): services.sagemakerruntime.SageMakerRuntime =
      new services.sagemakerruntime.SageMakerRuntime(config)

    type S3 = services.s3.S3
    def S3(): services.s3.S3                  = new services.s3.S3()
    def S3(config: AWSConfig): services.s3.S3 = new services.s3.S3(config)

    type S3Control = services.s3control.S3Control
    def S3Control(): services.s3control.S3Control                  = new services.s3control.S3Control()
    def S3Control(config: AWSConfig): services.s3control.S3Control = new services.s3control.S3Control(config)

    type SageMaker = services.sagemaker.SageMaker
    def SageMaker(): services.sagemaker.SageMaker                  = new services.sagemaker.SageMaker()
    def SageMaker(config: AWSConfig): services.sagemaker.SageMaker = new services.sagemaker.SageMaker(config)

    type SimpleDB = services.simpledb.SimpleDB
    def SimpleDB(): services.simpledb.SimpleDB                  = new services.simpledb.SimpleDB()
    def SimpleDB(config: AWSConfig): services.simpledb.SimpleDB = new services.simpledb.SimpleDB(config)

    type SecretsManager = services.secretsmanager.SecretsManager
    def SecretsManager(): services.secretsmanager.SecretsManager = new services.secretsmanager.SecretsManager()
    def SecretsManager(config: AWSConfig): services.secretsmanager.SecretsManager =
      new services.secretsmanager.SecretsManager(config)

    type SecurityHub = services.securityhub.SecurityHub
    def SecurityHub(): services.securityhub.SecurityHub                  = new services.securityhub.SecurityHub()
    def SecurityHub(config: AWSConfig): services.securityhub.SecurityHub = new services.securityhub.SecurityHub(config)

    type ServerlessApplicationRepository = services.serverlessapplicationrepository.ServerlessApplicationRepository
    def ServerlessApplicationRepository(): services.serverlessapplicationrepository.ServerlessApplicationRepository =
      new services.serverlessapplicationrepository.ServerlessApplicationRepository()
    def ServerlessApplicationRepository(
        config: AWSConfig
    ): services.serverlessapplicationrepository.ServerlessApplicationRepository =
      new services.serverlessapplicationrepository.ServerlessApplicationRepository(config)

    type ServiceQuotas = services.servicequotas.ServiceQuotas
    def ServiceQuotas(): services.servicequotas.ServiceQuotas = new services.servicequotas.ServiceQuotas()
    def ServiceQuotas(config: AWSConfig): services.servicequotas.ServiceQuotas =
      new services.servicequotas.ServiceQuotas(config)

    type ServiceCatalog = services.servicecatalog.ServiceCatalog
    def ServiceCatalog(): services.servicecatalog.ServiceCatalog = new services.servicecatalog.ServiceCatalog()
    def ServiceCatalog(config: AWSConfig): services.servicecatalog.ServiceCatalog =
      new services.servicecatalog.ServiceCatalog(config)

    type ServiceDiscovery = services.servicediscovery.ServiceDiscovery
    def ServiceDiscovery(): services.servicediscovery.ServiceDiscovery =
      new services.servicediscovery.ServiceDiscovery()
    def ServiceDiscovery(config: AWSConfig): services.servicediscovery.ServiceDiscovery =
      new services.servicediscovery.ServiceDiscovery(config)

    type Shield = services.shield.Shield
    def Shield(): services.shield.Shield                  = new services.shield.Shield()
    def Shield(config: AWSConfig): services.shield.Shield = new services.shield.Shield(config)

    type Signer = services.signer.Signer
    def Signer(): services.signer.Signer                  = new services.signer.Signer()
    def Signer(config: AWSConfig): services.signer.Signer = new services.signer.Signer(config)

    type SMS = services.sms.SMS
    def SMS(): services.sms.SMS                  = new services.sms.SMS()
    def SMS(config: AWSConfig): services.sms.SMS = new services.sms.SMS(config)

    type PinpointSMSVoice = services.pinpointsmsvoice.PinpointSMSVoice
    def PinpointSMSVoice(): services.pinpointsmsvoice.PinpointSMSVoice =
      new services.pinpointsmsvoice.PinpointSMSVoice()
    def PinpointSMSVoice(config: AWSConfig): services.pinpointsmsvoice.PinpointSMSVoice =
      new services.pinpointsmsvoice.PinpointSMSVoice(config)

    type Snowball = services.snowball.Snowball
    def Snowball(): services.snowball.Snowball                  = new services.snowball.Snowball()
    def Snowball(config: AWSConfig): services.snowball.Snowball = new services.snowball.Snowball(config)

    type SNS = services.sns.SNS
    def SNS(): services.sns.SNS                  = new services.sns.SNS()
    def SNS(config: AWSConfig): services.sns.SNS = new services.sns.SNS(config)

    type SQS = services.sqs.SQS
    def SQS(): services.sqs.SQS                  = new services.sqs.SQS()
    def SQS(config: AWSConfig): services.sqs.SQS = new services.sqs.SQS(config)

    type SSM = services.ssm.SSM
    def SSM(): services.ssm.SSM                  = new services.ssm.SSM()
    def SSM(config: AWSConfig): services.ssm.SSM = new services.ssm.SSM(config)

    type StepFunctions = services.stepfunctions.StepFunctions
    def StepFunctions(): services.stepfunctions.StepFunctions = new services.stepfunctions.StepFunctions()
    def StepFunctions(config: AWSConfig): services.stepfunctions.StepFunctions =
      new services.stepfunctions.StepFunctions(config)

    type StorageGateway = services.storagegateway.StorageGateway
    def StorageGateway(): services.storagegateway.StorageGateway = new services.storagegateway.StorageGateway()
    def StorageGateway(config: AWSConfig): services.storagegateway.StorageGateway =
      new services.storagegateway.StorageGateway(config)

    type DynamoDBStreams = services.dynamodbstreams.DynamoDBStreams
    def DynamoDBStreams(): services.dynamodbstreams.DynamoDBStreams = new services.dynamodbstreams.DynamoDBStreams()
    def DynamoDBStreams(config: AWSConfig): services.dynamodbstreams.DynamoDBStreams =
      new services.dynamodbstreams.DynamoDBStreams(config)

    type STS = services.sts.STS
    def STS(): services.sts.STS                  = new services.sts.STS()
    def STS(config: AWSConfig): services.sts.STS = new services.sts.STS(config)

    type Support = services.support.Support
    def Support(): services.support.Support                  = new services.support.Support()
    def Support(config: AWSConfig): services.support.Support = new services.support.Support(config)

    type SWF = services.swf.SWF
    def SWF(): services.swf.SWF                  = new services.swf.SWF()
    def SWF(config: AWSConfig): services.swf.SWF = new services.swf.SWF(config)

    type Textract = services.textract.Textract
    def Textract(): services.textract.Textract                  = new services.textract.Textract()
    def Textract(config: AWSConfig): services.textract.Textract = new services.textract.Textract(config)

    type TranscribeService = services.transcribeservice.TranscribeService
    def TranscribeService(): services.transcribeservice.TranscribeService =
      new services.transcribeservice.TranscribeService()
    def TranscribeService(config: AWSConfig): services.transcribeservice.TranscribeService =
      new services.transcribeservice.TranscribeService(config)

    type Transfer = services.transfer.Transfer
    def Transfer(): services.transfer.Transfer                  = new services.transfer.Transfer()
    def Transfer(config: AWSConfig): services.transfer.Transfer = new services.transfer.Transfer(config)

    type Translate = services.translate.Translate
    def Translate(): services.translate.Translate                  = new services.translate.Translate()
    def Translate(config: AWSConfig): services.translate.Translate = new services.translate.Translate(config)

    type WAF = services.waf.WAF
    def WAF(): services.waf.WAF                  = new services.waf.WAF()
    def WAF(config: AWSConfig): services.waf.WAF = new services.waf.WAF(config)

    type WAFRegional = services.wafregional.WAFRegional
    def WAFRegional(): services.wafregional.WAFRegional                  = new services.wafregional.WAFRegional()
    def WAFRegional(config: AWSConfig): services.wafregional.WAFRegional = new services.wafregional.WAFRegional(config)

    type WorkDocs = services.workdocs.WorkDocs
    def WorkDocs(): services.workdocs.WorkDocs                  = new services.workdocs.WorkDocs()
    def WorkDocs(config: AWSConfig): services.workdocs.WorkDocs = new services.workdocs.WorkDocs(config)

    type WorkLink = services.worklink.WorkLink
    def WorkLink(): services.worklink.WorkLink                  = new services.worklink.WorkLink()
    def WorkLink(config: AWSConfig): services.worklink.WorkLink = new services.worklink.WorkLink(config)

    type WorkMail = services.workmail.WorkMail
    def WorkMail(): services.workmail.WorkMail                  = new services.workmail.WorkMail()
    def WorkMail(config: AWSConfig): services.workmail.WorkMail = new services.workmail.WorkMail(config)

    type WorkSpaces = services.workspaces.WorkSpaces
    def WorkSpaces(): services.workspaces.WorkSpaces                  = new services.workspaces.WorkSpaces()
    def WorkSpaces(config: AWSConfig): services.workspaces.WorkSpaces = new services.workspaces.WorkSpaces(config)

    type XRay = services.xray.XRay
    def XRay(): services.xray.XRay                  = new services.xray.XRay()
    def XRay(config: AWSConfig): services.xray.XRay = new services.xray.XRay(config)

  }
}
