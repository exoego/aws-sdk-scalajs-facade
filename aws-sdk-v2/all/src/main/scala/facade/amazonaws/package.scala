package facade

package object amazonaws {
  implicit final class AWSExtensionMethods(private val aws: AWS.type) extends AnyVal {
    def config_=(config: AWSConfig): Unit = {
      aws.config = config match {
        case global: AWSConfigWithServicesDefault => global
        case _                                    => config.asInstanceOf[AWSConfigWithServicesDefault]
      }
    }

    type AccessAnalyzer = services.accessanalyzer.AccessAnalyzer
    def AccessAnalyzer(): services.accessanalyzer.AccessAnalyzer = new services.accessanalyzer.AccessAnalyzer()
    def AccessAnalyzer(config: AWSConfig): services.accessanalyzer.AccessAnalyzer = new services.accessanalyzer.AccessAnalyzer(config)

    type Account = services.account.Account
    def Account(): services.account.Account = new services.account.Account()
    def Account(config: AWSConfig): services.account.Account = new services.account.Account(config)

    type ACM = services.acm.ACM
    def ACM(): services.acm.ACM = new services.acm.ACM()
    def ACM(config: AWSConfig): services.acm.ACM = new services.acm.ACM(config)

    type ACMPCA = services.acmpca.ACMPCA
    def ACMPCA(): services.acmpca.ACMPCA = new services.acmpca.ACMPCA()
    def ACMPCA(config: AWSConfig): services.acmpca.ACMPCA = new services.acmpca.ACMPCA(config)

    type AlexaForBusiness = services.alexaforbusiness.AlexaForBusiness
    def AlexaForBusiness(): services.alexaforbusiness.AlexaForBusiness = new services.alexaforbusiness.AlexaForBusiness()
    def AlexaForBusiness(config: AWSConfig): services.alexaforbusiness.AlexaForBusiness = new services.alexaforbusiness.AlexaForBusiness(config)

    type Amp = services.amp.Amp
    def Amp(): services.amp.Amp = new services.amp.Amp()
    def Amp(config: AWSConfig): services.amp.Amp = new services.amp.Amp(config)

    type Amplify = services.amplify.Amplify
    def Amplify(): services.amplify.Amplify = new services.amplify.Amplify()
    def Amplify(config: AWSConfig): services.amplify.Amplify = new services.amplify.Amplify(config)

    type AmplifyBackend = services.amplifybackend.AmplifyBackend
    def AmplifyBackend(): services.amplifybackend.AmplifyBackend = new services.amplifybackend.AmplifyBackend()
    def AmplifyBackend(config: AWSConfig): services.amplifybackend.AmplifyBackend = new services.amplifybackend.AmplifyBackend(config)

    type AmplifyUIBuilder = services.amplifyuibuilder.AmplifyUIBuilder
    def AmplifyUIBuilder(): services.amplifyuibuilder.AmplifyUIBuilder = new services.amplifyuibuilder.AmplifyUIBuilder()
    def AmplifyUIBuilder(config: AWSConfig): services.amplifyuibuilder.AmplifyUIBuilder = new services.amplifyuibuilder.AmplifyUIBuilder(config)

    type APIGateway = services.apigateway.APIGateway
    def APIGateway(): services.apigateway.APIGateway = new services.apigateway.APIGateway()
    def APIGateway(config: AWSConfig): services.apigateway.APIGateway = new services.apigateway.APIGateway(config)

    type ApiGatewayManagementApi = services.apigatewaymanagementapi.ApiGatewayManagementApi
    def ApiGatewayManagementApi(): services.apigatewaymanagementapi.ApiGatewayManagementApi = new services.apigatewaymanagementapi.ApiGatewayManagementApi()
    def ApiGatewayManagementApi(config: AWSConfig): services.apigatewaymanagementapi.ApiGatewayManagementApi = new services.apigatewaymanagementapi.ApiGatewayManagementApi(config)

    type ApiGatewayV2 = services.apigatewayv2.ApiGatewayV2
    def ApiGatewayV2(): services.apigatewayv2.ApiGatewayV2 = new services.apigatewayv2.ApiGatewayV2()
    def ApiGatewayV2(config: AWSConfig): services.apigatewayv2.ApiGatewayV2 = new services.apigatewayv2.ApiGatewayV2(config)

    type AppConfig = services.appconfig.AppConfig
    def AppConfig(): services.appconfig.AppConfig = new services.appconfig.AppConfig()
    def AppConfig(config: AWSConfig): services.appconfig.AppConfig = new services.appconfig.AppConfig(config)

    type AppConfigData = services.appconfigdata.AppConfigData
    def AppConfigData(): services.appconfigdata.AppConfigData = new services.appconfigdata.AppConfigData()
    def AppConfigData(config: AWSConfig): services.appconfigdata.AppConfigData = new services.appconfigdata.AppConfigData(config)

    type Appflow = services.appflow.Appflow
    def Appflow(): services.appflow.Appflow = new services.appflow.Appflow()
    def Appflow(config: AWSConfig): services.appflow.Appflow = new services.appflow.Appflow(config)

    type AppIntegrations = services.appintegrations.AppIntegrations
    def AppIntegrations(): services.appintegrations.AppIntegrations = new services.appintegrations.AppIntegrations()
    def AppIntegrations(config: AWSConfig): services.appintegrations.AppIntegrations = new services.appintegrations.AppIntegrations(config)

    type ApplicationAutoScaling = services.applicationautoscaling.ApplicationAutoScaling
    def ApplicationAutoScaling(): services.applicationautoscaling.ApplicationAutoScaling = new services.applicationautoscaling.ApplicationAutoScaling()
    def ApplicationAutoScaling(config: AWSConfig): services.applicationautoscaling.ApplicationAutoScaling = new services.applicationautoscaling.ApplicationAutoScaling(config)

    type ApplicationInsights = services.applicationinsights.ApplicationInsights
    def ApplicationInsights(): services.applicationinsights.ApplicationInsights = new services.applicationinsights.ApplicationInsights()
    def ApplicationInsights(config: AWSConfig): services.applicationinsights.ApplicationInsights = new services.applicationinsights.ApplicationInsights(config)

    type ApplicationCostProfiler = services.applicationcostprofiler.ApplicationCostProfiler
    def ApplicationCostProfiler(): services.applicationcostprofiler.ApplicationCostProfiler = new services.applicationcostprofiler.ApplicationCostProfiler()
    def ApplicationCostProfiler(config: AWSConfig): services.applicationcostprofiler.ApplicationCostProfiler = new services.applicationcostprofiler.ApplicationCostProfiler(config)

    type AppMesh = services.appmesh.AppMesh
    def AppMesh(): services.appmesh.AppMesh = new services.appmesh.AppMesh()
    def AppMesh(config: AWSConfig): services.appmesh.AppMesh = new services.appmesh.AppMesh(config)

    type AppRunner = services.apprunner.AppRunner
    def AppRunner(): services.apprunner.AppRunner = new services.apprunner.AppRunner()
    def AppRunner(config: AWSConfig): services.apprunner.AppRunner = new services.apprunner.AppRunner(config)

    type AppStream = services.appstream.AppStream
    def AppStream(): services.appstream.AppStream = new services.appstream.AppStream()
    def AppStream(config: AWSConfig): services.appstream.AppStream = new services.appstream.AppStream(config)

    type AppSync = services.appsync.AppSync
    def AppSync(): services.appsync.AppSync = new services.appsync.AppSync()
    def AppSync(config: AWSConfig): services.appsync.AppSync = new services.appsync.AppSync(config)

    type ARCZonalShift = services.arczonalshift.ARCZonalShift
    def ARCZonalShift(): services.arczonalshift.ARCZonalShift = new services.arczonalshift.ARCZonalShift()
    def ARCZonalShift(config: AWSConfig): services.arczonalshift.ARCZonalShift = new services.arczonalshift.ARCZonalShift(config)

    type Athena = services.athena.Athena
    def Athena(): services.athena.Athena = new services.athena.Athena()
    def Athena(config: AWSConfig): services.athena.Athena = new services.athena.Athena(config)

    type AuditManager = services.auditmanager.AuditManager
    def AuditManager(): services.auditmanager.AuditManager = new services.auditmanager.AuditManager()
    def AuditManager(config: AWSConfig): services.auditmanager.AuditManager = new services.auditmanager.AuditManager(config)

    type AutoScaling = services.autoscaling.AutoScaling
    def AutoScaling(): services.autoscaling.AutoScaling = new services.autoscaling.AutoScaling()
    def AutoScaling(config: AWSConfig): services.autoscaling.AutoScaling = new services.autoscaling.AutoScaling(config)

    type AutoScalingPlans = services.autoscalingplans.AutoScalingPlans
    def AutoScalingPlans(): services.autoscalingplans.AutoScalingPlans = new services.autoscalingplans.AutoScalingPlans()
    def AutoScalingPlans(config: AWSConfig): services.autoscalingplans.AutoScalingPlans = new services.autoscalingplans.AutoScalingPlans(config)

    type MigrationHub = services.migrationhub.MigrationHub
    def MigrationHub(): services.migrationhub.MigrationHub = new services.migrationhub.MigrationHub()
    def MigrationHub(config: AWSConfig): services.migrationhub.MigrationHub = new services.migrationhub.MigrationHub(config)

    type Backup = services.backup.Backup
    def Backup(): services.backup.Backup = new services.backup.Backup()
    def Backup(config: AWSConfig): services.backup.Backup = new services.backup.Backup(config)

    type BackupGateway = services.backupgateway.BackupGateway
    def BackupGateway(): services.backupgateway.BackupGateway = new services.backupgateway.BackupGateway()
    def BackupGateway(config: AWSConfig): services.backupgateway.BackupGateway = new services.backupgateway.BackupGateway(config)

    type BackupStorage = services.backupstorage.BackupStorage
    def BackupStorage(): services.backupstorage.BackupStorage = new services.backupstorage.BackupStorage()
    def BackupStorage(config: AWSConfig): services.backupstorage.BackupStorage = new services.backupstorage.BackupStorage(config)

    type Batch = services.batch.Batch
    def Batch(): services.batch.Batch = new services.batch.Batch()
    def Batch(config: AWSConfig): services.batch.Batch = new services.batch.Batch(config)

    type BillingConductor = services.billingconductor.BillingConductor
    def BillingConductor(): services.billingconductor.BillingConductor = new services.billingconductor.BillingConductor()
    def BillingConductor(config: AWSConfig): services.billingconductor.BillingConductor = new services.billingconductor.BillingConductor(config)

    type Braket = services.braket.Braket
    def Braket(): services.braket.Braket = new services.braket.Braket()
    def Braket(config: AWSConfig): services.braket.Braket = new services.braket.Braket(config)

    type BudgetsService = services.budgetsservice.BudgetsService
    def BudgetsService(): services.budgetsservice.BudgetsService = new services.budgetsservice.BudgetsService()
    def BudgetsService(config: AWSConfig): services.budgetsservice.BudgetsService = new services.budgetsservice.BudgetsService(config)

    type CostExplorer = services.costexplorer.CostExplorer
    def CostExplorer(): services.costexplorer.CostExplorer = new services.costexplorer.CostExplorer()
    def CostExplorer(config: AWSConfig): services.costexplorer.CostExplorer = new services.costexplorer.CostExplorer(config)

    type Chime = services.chime.Chime
    def Chime(): services.chime.Chime = new services.chime.Chime()
    def Chime(config: AWSConfig): services.chime.Chime = new services.chime.Chime(config)

    type ChimeSDKIdentity = services.chimesdkidentity.ChimeSDKIdentity
    def ChimeSDKIdentity(): services.chimesdkidentity.ChimeSDKIdentity = new services.chimesdkidentity.ChimeSDKIdentity()
    def ChimeSDKIdentity(config: AWSConfig): services.chimesdkidentity.ChimeSDKIdentity = new services.chimesdkidentity.ChimeSDKIdentity(config)

    type ChimeSDKMediaPipelines = services.chimesdkmediapipelines.ChimeSDKMediaPipelines
    def ChimeSDKMediaPipelines(): services.chimesdkmediapipelines.ChimeSDKMediaPipelines = new services.chimesdkmediapipelines.ChimeSDKMediaPipelines()
    def ChimeSDKMediaPipelines(config: AWSConfig): services.chimesdkmediapipelines.ChimeSDKMediaPipelines = new services.chimesdkmediapipelines.ChimeSDKMediaPipelines(config)

    type ChimeSDKMeetings = services.chimesdkmeetings.ChimeSDKMeetings
    def ChimeSDKMeetings(): services.chimesdkmeetings.ChimeSDKMeetings = new services.chimesdkmeetings.ChimeSDKMeetings()
    def ChimeSDKMeetings(config: AWSConfig): services.chimesdkmeetings.ChimeSDKMeetings = new services.chimesdkmeetings.ChimeSDKMeetings(config)

    type ChimeSDKMessaging = services.chimesdkmessaging.ChimeSDKMessaging
    def ChimeSDKMessaging(): services.chimesdkmessaging.ChimeSDKMessaging = new services.chimesdkmessaging.ChimeSDKMessaging()
    def ChimeSDKMessaging(config: AWSConfig): services.chimesdkmessaging.ChimeSDKMessaging = new services.chimesdkmessaging.ChimeSDKMessaging(config)

    type ChimeSDKVoice = services.chimesdkvoice.ChimeSDKVoice
    def ChimeSDKVoice(): services.chimesdkvoice.ChimeSDKVoice = new services.chimesdkvoice.ChimeSDKVoice()
    def ChimeSDKVoice(config: AWSConfig): services.chimesdkvoice.ChimeSDKVoice = new services.chimesdkvoice.ChimeSDKVoice(config)

    type Cloud9 = services.cloud9.Cloud9
    def Cloud9(): services.cloud9.Cloud9 = new services.cloud9.Cloud9()
    def Cloud9(config: AWSConfig): services.cloud9.Cloud9 = new services.cloud9.Cloud9(config)

    type CloudControl = services.cloudcontrol.CloudControl
    def CloudControl(): services.cloudcontrol.CloudControl = new services.cloudcontrol.CloudControl()
    def CloudControl(config: AWSConfig): services.cloudcontrol.CloudControl = new services.cloudcontrol.CloudControl(config)

    type CloudDirectory = services.clouddirectory.CloudDirectory
    def CloudDirectory(): services.clouddirectory.CloudDirectory = new services.clouddirectory.CloudDirectory()
    def CloudDirectory(config: AWSConfig): services.clouddirectory.CloudDirectory = new services.clouddirectory.CloudDirectory(config)

    type CloudFormation = services.cloudformation.CloudFormation
    def CloudFormation(): services.cloudformation.CloudFormation = new services.cloudformation.CloudFormation()
    def CloudFormation(config: AWSConfig): services.cloudformation.CloudFormation = new services.cloudformation.CloudFormation(config)

    type CloudFront = services.cloudfront.CloudFront
    def CloudFront(): services.cloudfront.CloudFront = new services.cloudfront.CloudFront()
    def CloudFront(config: AWSConfig): services.cloudfront.CloudFront = new services.cloudfront.CloudFront(config)

    type CloudHSM = services.cloudhsm.CloudHSM
    def CloudHSM(): services.cloudhsm.CloudHSM = new services.cloudhsm.CloudHSM()
    def CloudHSM(config: AWSConfig): services.cloudhsm.CloudHSM = new services.cloudhsm.CloudHSM(config)

    type CloudHSMV2 = services.cloudhsmv2.CloudHSMV2
    def CloudHSMV2(): services.cloudhsmv2.CloudHSMV2 = new services.cloudhsmv2.CloudHSMV2()
    def CloudHSMV2(config: AWSConfig): services.cloudhsmv2.CloudHSMV2 = new services.cloudhsmv2.CloudHSMV2(config)

    type CloudSearch = services.cloudsearch.CloudSearch
    def CloudSearch(): services.cloudsearch.CloudSearch = new services.cloudsearch.CloudSearch()
    def CloudSearch(config: AWSConfig): services.cloudsearch.CloudSearch = new services.cloudsearch.CloudSearch(config)

    type CloudSearchDomain = services.cloudsearchdomain.CloudSearchDomain
    def CloudSearchDomain(): services.cloudsearchdomain.CloudSearchDomain = new services.cloudsearchdomain.CloudSearchDomain()
    def CloudSearchDomain(config: AWSConfig): services.cloudsearchdomain.CloudSearchDomain = new services.cloudsearchdomain.CloudSearchDomain(config)

    type CloudTrail = services.cloudtrail.CloudTrail
    def CloudTrail(): services.cloudtrail.CloudTrail = new services.cloudtrail.CloudTrail()
    def CloudTrail(config: AWSConfig): services.cloudtrail.CloudTrail = new services.cloudtrail.CloudTrail(config)

    type CodeArtifact = services.codeartifact.CodeArtifact
    def CodeArtifact(): services.codeartifact.CodeArtifact = new services.codeartifact.CodeArtifact()
    def CodeArtifact(config: AWSConfig): services.codeartifact.CodeArtifact = new services.codeartifact.CodeArtifact(config)

    type CodeBuild = services.codebuild.CodeBuild
    def CodeBuild(): services.codebuild.CodeBuild = new services.codebuild.CodeBuild()
    def CodeBuild(config: AWSConfig): services.codebuild.CodeBuild = new services.codebuild.CodeBuild(config)

    type CodeCatalyst = services.codecatalyst.CodeCatalyst
    def CodeCatalyst(): services.codecatalyst.CodeCatalyst = new services.codecatalyst.CodeCatalyst()
    def CodeCatalyst(config: AWSConfig): services.codecatalyst.CodeCatalyst = new services.codecatalyst.CodeCatalyst(config)

    type CodeCommit = services.codecommit.CodeCommit
    def CodeCommit(): services.codecommit.CodeCommit = new services.codecommit.CodeCommit()
    def CodeCommit(config: AWSConfig): services.codecommit.CodeCommit = new services.codecommit.CodeCommit(config)

    type CodeDeploy = services.codedeploy.CodeDeploy
    def CodeDeploy(): services.codedeploy.CodeDeploy = new services.codedeploy.CodeDeploy()
    def CodeDeploy(config: AWSConfig): services.codedeploy.CodeDeploy = new services.codedeploy.CodeDeploy(config)

    type CodeGuruReviewer = services.codegurureviewer.CodeGuruReviewer
    def CodeGuruReviewer(): services.codegurureviewer.CodeGuruReviewer = new services.codegurureviewer.CodeGuruReviewer()
    def CodeGuruReviewer(config: AWSConfig): services.codegurureviewer.CodeGuruReviewer = new services.codegurureviewer.CodeGuruReviewer(config)

    type CodeGuruProfiler = services.codeguruprofiler.CodeGuruProfiler
    def CodeGuruProfiler(): services.codeguruprofiler.CodeGuruProfiler = new services.codeguruprofiler.CodeGuruProfiler()
    def CodeGuruProfiler(config: AWSConfig): services.codeguruprofiler.CodeGuruProfiler = new services.codeguruprofiler.CodeGuruProfiler(config)

    type CodePipeline = services.codepipeline.CodePipeline
    def CodePipeline(): services.codepipeline.CodePipeline = new services.codepipeline.CodePipeline()
    def CodePipeline(config: AWSConfig): services.codepipeline.CodePipeline = new services.codepipeline.CodePipeline(config)

    type CodeStar = services.codestar.CodeStar
    def CodeStar(): services.codestar.CodeStar = new services.codestar.CodeStar()
    def CodeStar(config: AWSConfig): services.codestar.CodeStar = new services.codestar.CodeStar(config)

    type CodeStarconnections = services.codestarconnections.CodeStarconnections
    def CodeStarconnections(): services.codestarconnections.CodeStarconnections = new services.codestarconnections.CodeStarconnections()
    def CodeStarconnections(config: AWSConfig): services.codestarconnections.CodeStarconnections = new services.codestarconnections.CodeStarconnections(config)

    type CodeStarNotifications = services.codestarnotifications.CodeStarNotifications
    def CodeStarNotifications(): services.codestarnotifications.CodeStarNotifications = new services.codestarnotifications.CodeStarNotifications()
    def CodeStarNotifications(config: AWSConfig): services.codestarnotifications.CodeStarNotifications = new services.codestarnotifications.CodeStarNotifications(config)

    type CognitoIdentity = services.cognitoidentity.CognitoIdentity
    def CognitoIdentity(): services.cognitoidentity.CognitoIdentity = new services.cognitoidentity.CognitoIdentity()
    def CognitoIdentity(config: AWSConfig): services.cognitoidentity.CognitoIdentity = new services.cognitoidentity.CognitoIdentity(config)

    type CognitoIdentityProvider = services.cognitoidentityprovider.CognitoIdentityProvider
    def CognitoIdentityProvider(): services.cognitoidentityprovider.CognitoIdentityProvider = new services.cognitoidentityprovider.CognitoIdentityProvider()
    def CognitoIdentityProvider(config: AWSConfig): services.cognitoidentityprovider.CognitoIdentityProvider = new services.cognitoidentityprovider.CognitoIdentityProvider(config)

    type CognitoSync = services.cognitosync.CognitoSync
    def CognitoSync(): services.cognitosync.CognitoSync = new services.cognitosync.CognitoSync()
    def CognitoSync(config: AWSConfig): services.cognitosync.CognitoSync = new services.cognitosync.CognitoSync(config)

    type Comprehend = services.comprehend.Comprehend
    def Comprehend(): services.comprehend.Comprehend = new services.comprehend.Comprehend()
    def Comprehend(config: AWSConfig): services.comprehend.Comprehend = new services.comprehend.Comprehend(config)

    type ComprehendMedical = services.comprehendmedical.ComprehendMedical
    def ComprehendMedical(): services.comprehendmedical.ComprehendMedical = new services.comprehendmedical.ComprehendMedical()
    def ComprehendMedical(config: AWSConfig): services.comprehendmedical.ComprehendMedical = new services.comprehendmedical.ComprehendMedical(config)

    type ComputeOptimizer = services.computeoptimizer.ComputeOptimizer
    def ComputeOptimizer(): services.computeoptimizer.ComputeOptimizer = new services.computeoptimizer.ComputeOptimizer()
    def ComputeOptimizer(config: AWSConfig): services.computeoptimizer.ComputeOptimizer = new services.computeoptimizer.ComputeOptimizer(config)

    type ConfigService = services.configservice.ConfigService
    def ConfigService(): services.configservice.ConfigService = new services.configservice.ConfigService()
    def ConfigService(config: AWSConfig): services.configservice.ConfigService = new services.configservice.ConfigService(config)

    type Connect = services.connect.Connect
    def Connect(): services.connect.Connect = new services.connect.Connect()
    def Connect(config: AWSConfig): services.connect.Connect = new services.connect.Connect(config)

    type ConnectContactLens = services.connectcontactlens.ConnectContactLens
    def ConnectContactLens(): services.connectcontactlens.ConnectContactLens = new services.connectcontactlens.ConnectContactLens()
    def ConnectContactLens(config: AWSConfig): services.connectcontactlens.ConnectContactLens = new services.connectcontactlens.ConnectContactLens(config)

    type ConnectCampaigns = services.connectcampaigns.ConnectCampaigns
    def ConnectCampaigns(): services.connectcampaigns.ConnectCampaigns = new services.connectcampaigns.ConnectCampaigns()
    def ConnectCampaigns(config: AWSConfig): services.connectcampaigns.ConnectCampaigns = new services.connectcampaigns.ConnectCampaigns(config)

    type ConnectCases = services.connectcases.ConnectCases
    def ConnectCases(): services.connectcases.ConnectCases = new services.connectcases.ConnectCases()
    def ConnectCases(config: AWSConfig): services.connectcases.ConnectCases = new services.connectcases.ConnectCases(config)

    type ConnectParticipant = services.connectparticipant.ConnectParticipant
    def ConnectParticipant(): services.connectparticipant.ConnectParticipant = new services.connectparticipant.ConnectParticipant()
    def ConnectParticipant(config: AWSConfig): services.connectparticipant.ConnectParticipant = new services.connectparticipant.ConnectParticipant(config)

    type ControlTower = services.controltower.ControlTower
    def ControlTower(): services.controltower.ControlTower = new services.controltower.ControlTower()
    def ControlTower(config: AWSConfig): services.controltower.ControlTower = new services.controltower.ControlTower(config)

    type CUR = services.cur.CUR
    def CUR(): services.cur.CUR = new services.cur.CUR()
    def CUR(config: AWSConfig): services.cur.CUR = new services.cur.CUR(config)

    type CustomerProfiles = services.customerprofiles.CustomerProfiles
    def CustomerProfiles(): services.customerprofiles.CustomerProfiles = new services.customerprofiles.CustomerProfiles()
    def CustomerProfiles(config: AWSConfig): services.customerprofiles.CustomerProfiles = new services.customerprofiles.CustomerProfiles(config)

    type DataBrew = services.databrew.DataBrew
    def DataBrew(): services.databrew.DataBrew = new services.databrew.DataBrew()
    def DataBrew(config: AWSConfig): services.databrew.DataBrew = new services.databrew.DataBrew(config)

    type DataExchange = services.dataexchange.DataExchange
    def DataExchange(): services.dataexchange.DataExchange = new services.dataexchange.DataExchange()
    def DataExchange(config: AWSConfig): services.dataexchange.DataExchange = new services.dataexchange.DataExchange(config)

    type DataPipeline = services.datapipeline.DataPipeline
    def DataPipeline(): services.datapipeline.DataPipeline = new services.datapipeline.DataPipeline()
    def DataPipeline(config: AWSConfig): services.datapipeline.DataPipeline = new services.datapipeline.DataPipeline(config)

    type DataSync = services.datasync.DataSync
    def DataSync(): services.datasync.DataSync = new services.datasync.DataSync()
    def DataSync(config: AWSConfig): services.datasync.DataSync = new services.datasync.DataSync(config)

    type DAX = services.dax.DAX
    def DAX(): services.dax.DAX = new services.dax.DAX()
    def DAX(config: AWSConfig): services.dax.DAX = new services.dax.DAX(config)

    type Detective = services.detective.Detective
    def Detective(): services.detective.Detective = new services.detective.Detective()
    def Detective(config: AWSConfig): services.detective.Detective = new services.detective.Detective(config)

    type DeviceFarm = services.devicefarm.DeviceFarm
    def DeviceFarm(): services.devicefarm.DeviceFarm = new services.devicefarm.DeviceFarm()
    def DeviceFarm(config: AWSConfig): services.devicefarm.DeviceFarm = new services.devicefarm.DeviceFarm(config)

    type DevOpsGuru = services.devopsguru.DevOpsGuru
    def DevOpsGuru(): services.devopsguru.DevOpsGuru = new services.devopsguru.DevOpsGuru()
    def DevOpsGuru(config: AWSConfig): services.devopsguru.DevOpsGuru = new services.devopsguru.DevOpsGuru(config)

    type DirectConnect = services.directconnect.DirectConnect
    def DirectConnect(): services.directconnect.DirectConnect = new services.directconnect.DirectConnect()
    def DirectConnect(config: AWSConfig): services.directconnect.DirectConnect = new services.directconnect.DirectConnect(config)

    type ApplicationDiscovery = services.applicationdiscovery.ApplicationDiscovery
    def ApplicationDiscovery(): services.applicationdiscovery.ApplicationDiscovery = new services.applicationdiscovery.ApplicationDiscovery()
    def ApplicationDiscovery(config: AWSConfig): services.applicationdiscovery.ApplicationDiscovery = new services.applicationdiscovery.ApplicationDiscovery(config)

    type DLM = services.dlm.DLM
    def DLM(): services.dlm.DLM = new services.dlm.DLM()
    def DLM(config: AWSConfig): services.dlm.DLM = new services.dlm.DLM(config)

    type DMS = services.dms.DMS
    def DMS(): services.dms.DMS = new services.dms.DMS()
    def DMS(config: AWSConfig): services.dms.DMS = new services.dms.DMS(config)

    type DocDB = services.docdb.DocDB
    def DocDB(): services.docdb.DocDB = new services.docdb.DocDB()
    def DocDB(config: AWSConfig): services.docdb.DocDB = new services.docdb.DocDB(config)

    type DocDBElastic = services.docdbelastic.DocDBElastic
    def DocDBElastic(): services.docdbelastic.DocDBElastic = new services.docdbelastic.DocDBElastic()
    def DocDBElastic(config: AWSConfig): services.docdbelastic.DocDBElastic = new services.docdbelastic.DocDBElastic(config)

    type DRS = services.drs.DRS
    def DRS(): services.drs.DRS = new services.drs.DRS()
    def DRS(config: AWSConfig): services.drs.DRS = new services.drs.DRS(config)

    type DirectoryService = services.directoryservice.DirectoryService
    def DirectoryService(): services.directoryservice.DirectoryService = new services.directoryservice.DirectoryService()
    def DirectoryService(config: AWSConfig): services.directoryservice.DirectoryService = new services.directoryservice.DirectoryService(config)

    type DynamoDB = services.dynamodb.DynamoDB
    def DynamoDB(): services.dynamodb.DynamoDB = new services.dynamodb.DynamoDB()
    def DynamoDB(config: AWSConfig): services.dynamodb.DynamoDB = new services.dynamodb.DynamoDB(config)

    type EBS = services.ebs.EBS
    def EBS(): services.ebs.EBS = new services.ebs.EBS()
    def EBS(config: AWSConfig): services.ebs.EBS = new services.ebs.EBS(config)

    type EC2 = services.ec2.EC2
    def EC2(): services.ec2.EC2 = new services.ec2.EC2()
    def EC2(config: AWSConfig): services.ec2.EC2 = new services.ec2.EC2(config)

    type EC2InstanceConnect = services.ec2instanceconnect.EC2InstanceConnect
    def EC2InstanceConnect(): services.ec2instanceconnect.EC2InstanceConnect = new services.ec2instanceconnect.EC2InstanceConnect()
    def EC2InstanceConnect(config: AWSConfig): services.ec2instanceconnect.EC2InstanceConnect = new services.ec2instanceconnect.EC2InstanceConnect(config)

    type ECR = services.ecr.ECR
    def ECR(): services.ecr.ECR = new services.ecr.ECR()
    def ECR(config: AWSConfig): services.ecr.ECR = new services.ecr.ECR(config)

    type ECRPUBLIC = services.ecrpublic.ECRPUBLIC
    def ECRPUBLIC(): services.ecrpublic.ECRPUBLIC = new services.ecrpublic.ECRPUBLIC()
    def ECRPUBLIC(config: AWSConfig): services.ecrpublic.ECRPUBLIC = new services.ecrpublic.ECRPUBLIC(config)

    type ECS = services.ecs.ECS
    def ECS(): services.ecs.ECS = new services.ecs.ECS()
    def ECS(config: AWSConfig): services.ecs.ECS = new services.ecs.ECS(config)

    type EKS = services.eks.EKS
    def EKS(): services.eks.EKS = new services.eks.EKS()
    def EKS(config: AWSConfig): services.eks.EKS = new services.eks.EKS(config)

    type ElasticInference = services.elasticinference.ElasticInference
    def ElasticInference(): services.elasticinference.ElasticInference = new services.elasticinference.ElasticInference()
    def ElasticInference(config: AWSConfig): services.elasticinference.ElasticInference = new services.elasticinference.ElasticInference(config)

    type ElastiCache = services.elasticache.ElastiCache
    def ElastiCache(): services.elasticache.ElastiCache = new services.elasticache.ElastiCache()
    def ElastiCache(config: AWSConfig): services.elasticache.ElastiCache = new services.elasticache.ElastiCache(config)

    type ElasticBeanstalk = services.elasticbeanstalk.ElasticBeanstalk
    def ElasticBeanstalk(): services.elasticbeanstalk.ElasticBeanstalk = new services.elasticbeanstalk.ElasticBeanstalk()
    def ElasticBeanstalk(config: AWSConfig): services.elasticbeanstalk.ElasticBeanstalk = new services.elasticbeanstalk.ElasticBeanstalk(config)

    type EFS = services.efs.EFS
    def EFS(): services.efs.EFS = new services.efs.EFS()
    def EFS(config: AWSConfig): services.efs.EFS = new services.efs.EFS(config)

    type ELB = services.elb.ELB
    def ELB(): services.elb.ELB = new services.elb.ELB()
    def ELB(config: AWSConfig): services.elb.ELB = new services.elb.ELB(config)

    type ELBv2 = services.elbv2.ELBv2
    def ELBv2(): services.elbv2.ELBv2 = new services.elbv2.ELBv2()
    def ELBv2(config: AWSConfig): services.elbv2.ELBv2 = new services.elbv2.ELBv2(config)

    type EMR = services.emr.EMR
    def EMR(): services.emr.EMR = new services.emr.EMR()
    def EMR(config: AWSConfig): services.emr.EMR = new services.emr.EMR(config)

    type ElasticTranscoder = services.elastictranscoder.ElasticTranscoder
    def ElasticTranscoder(): services.elastictranscoder.ElasticTranscoder = new services.elastictranscoder.ElasticTranscoder()
    def ElasticTranscoder(config: AWSConfig): services.elastictranscoder.ElasticTranscoder = new services.elastictranscoder.ElasticTranscoder(config)

    type SES = services.ses.SES
    def SES(): services.ses.SES = new services.ses.SES()
    def SES(config: AWSConfig): services.ses.SES = new services.ses.SES(config)

    type EMRcontainers = services.emrcontainers.EMRcontainers
    def EMRcontainers(): services.emrcontainers.EMRcontainers = new services.emrcontainers.EMRcontainers()
    def EMRcontainers(config: AWSConfig): services.emrcontainers.EMRcontainers = new services.emrcontainers.EMRcontainers(config)

    type EMRServerless = services.emrserverless.EMRServerless
    def EMRServerless(): services.emrserverless.EMRServerless = new services.emrserverless.EMRServerless()
    def EMRServerless(config: AWSConfig): services.emrserverless.EMRServerless = new services.emrserverless.EMRServerless(config)

    type MarketplaceEntitlementService = services.marketplaceentitlementservice.MarketplaceEntitlementService
    def MarketplaceEntitlementService(): services.marketplaceentitlementservice.MarketplaceEntitlementService = new services.marketplaceentitlementservice.MarketplaceEntitlementService()
    def MarketplaceEntitlementService(config: AWSConfig): services.marketplaceentitlementservice.MarketplaceEntitlementService = new services.marketplaceentitlementservice.MarketplaceEntitlementService(config)

    type ES = services.es.ES
    def ES(): services.es.ES = new services.es.ES()
    def ES(config: AWSConfig): services.es.ES = new services.es.ES(config)

    type EventBridge = services.eventbridge.EventBridge
    def EventBridge(): services.eventbridge.EventBridge = new services.eventbridge.EventBridge()
    def EventBridge(config: AWSConfig): services.eventbridge.EventBridge = new services.eventbridge.EventBridge(config)

    type CloudWatchEvents = services.cloudwatchevents.CloudWatchEvents
    def CloudWatchEvents(): services.cloudwatchevents.CloudWatchEvents = new services.cloudwatchevents.CloudWatchEvents()
    def CloudWatchEvents(config: AWSConfig): services.cloudwatchevents.CloudWatchEvents = new services.cloudwatchevents.CloudWatchEvents(config)

    type Evidently = services.evidently.Evidently
    def Evidently(): services.evidently.Evidently = new services.evidently.Evidently()
    def Evidently(config: AWSConfig): services.evidently.Evidently = new services.evidently.Evidently(config)

    type FinSpace = services.finspace.FinSpace
    def FinSpace(): services.finspace.FinSpace = new services.finspace.FinSpace()
    def FinSpace(config: AWSConfig): services.finspace.FinSpace = new services.finspace.FinSpace(config)

    type FinSpaceData = services.finspacedata.FinSpaceData
    def FinSpaceData(): services.finspacedata.FinSpaceData = new services.finspacedata.FinSpaceData()
    def FinSpaceData(config: AWSConfig): services.finspacedata.FinSpaceData = new services.finspacedata.FinSpaceData(config)

    type Firehose = services.firehose.Firehose
    def Firehose(): services.firehose.Firehose = new services.firehose.Firehose()
    def Firehose(config: AWSConfig): services.firehose.Firehose = new services.firehose.Firehose(config)

    type Fis = services.fis.Fis
    def Fis(): services.fis.Fis = new services.fis.Fis()
    def Fis(config: AWSConfig): services.fis.Fis = new services.fis.Fis(config)

    type FMS = services.fms.FMS
    def FMS(): services.fms.FMS = new services.fms.FMS()
    def FMS(config: AWSConfig): services.fms.FMS = new services.fms.FMS(config)

    type Forecast = services.forecast.Forecast
    def Forecast(): services.forecast.Forecast = new services.forecast.Forecast()
    def Forecast(config: AWSConfig): services.forecast.Forecast = new services.forecast.Forecast(config)

    type ForecastQuery = services.forecastquery.ForecastQuery
    def ForecastQuery(): services.forecastquery.ForecastQuery = new services.forecastquery.ForecastQuery()
    def ForecastQuery(config: AWSConfig): services.forecastquery.ForecastQuery = new services.forecastquery.ForecastQuery(config)

    type FraudDetector = services.frauddetector.FraudDetector
    def FraudDetector(): services.frauddetector.FraudDetector = new services.frauddetector.FraudDetector()
    def FraudDetector(config: AWSConfig): services.frauddetector.FraudDetector = new services.frauddetector.FraudDetector(config)

    type FSx = services.fsx.FSx
    def FSx(): services.fsx.FSx = new services.fsx.FSx()
    def FSx(config: AWSConfig): services.fsx.FSx = new services.fsx.FSx(config)

    type GameLift = services.gamelift.GameLift
    def GameLift(): services.gamelift.GameLift = new services.gamelift.GameLift()
    def GameLift(config: AWSConfig): services.gamelift.GameLift = new services.gamelift.GameLift(config)

    type GameSparks = services.gamesparks.GameSparks
    def GameSparks(): services.gamesparks.GameSparks = new services.gamesparks.GameSparks()
    def GameSparks(config: AWSConfig): services.gamesparks.GameSparks = new services.gamesparks.GameSparks(config)

    type Glacier = services.glacier.Glacier
    def Glacier(): services.glacier.Glacier = new services.glacier.Glacier()
    def Glacier(config: AWSConfig): services.glacier.Glacier = new services.glacier.Glacier(config)

    type GlobalAccelerator = services.globalaccelerator.GlobalAccelerator
    def GlobalAccelerator(): services.globalaccelerator.GlobalAccelerator = new services.globalaccelerator.GlobalAccelerator()
    def GlobalAccelerator(config: AWSConfig): services.globalaccelerator.GlobalAccelerator = new services.globalaccelerator.GlobalAccelerator(config)

    type Glue = services.glue.Glue
    def Glue(): services.glue.Glue = new services.glue.Glue()
    def Glue(config: AWSConfig): services.glue.Glue = new services.glue.Glue(config)

    type Grafana = services.grafana.Grafana
    def Grafana(): services.grafana.Grafana = new services.grafana.Grafana()
    def Grafana(config: AWSConfig): services.grafana.Grafana = new services.grafana.Grafana(config)

    type Greengrass = services.greengrass.Greengrass
    def Greengrass(): services.greengrass.Greengrass = new services.greengrass.Greengrass()
    def Greengrass(config: AWSConfig): services.greengrass.Greengrass = new services.greengrass.Greengrass(config)

    type GreengrassV2 = services.greengrassv2.GreengrassV2
    def GreengrassV2(): services.greengrassv2.GreengrassV2 = new services.greengrassv2.GreengrassV2()
    def GreengrassV2(config: AWSConfig): services.greengrassv2.GreengrassV2 = new services.greengrassv2.GreengrassV2(config)

    type GroundStation = services.groundstation.GroundStation
    def GroundStation(): services.groundstation.GroundStation = new services.groundstation.GroundStation()
    def GroundStation(config: AWSConfig): services.groundstation.GroundStation = new services.groundstation.GroundStation(config)

    type GuardDuty = services.guardduty.GuardDuty
    def GuardDuty(): services.guardduty.GuardDuty = new services.guardduty.GuardDuty()
    def GuardDuty(config: AWSConfig): services.guardduty.GuardDuty = new services.guardduty.GuardDuty(config)

    type Health = services.health.Health
    def Health(): services.health.Health = new services.health.Health()
    def Health(config: AWSConfig): services.health.Health = new services.health.Health(config)

    type HealthLake = services.healthlake.HealthLake
    def HealthLake(): services.healthlake.HealthLake = new services.healthlake.HealthLake()
    def HealthLake(config: AWSConfig): services.healthlake.HealthLake = new services.healthlake.HealthLake(config)

    type Honeycode = services.honeycode.Honeycode
    def Honeycode(): services.honeycode.Honeycode = new services.honeycode.Honeycode()
    def Honeycode(config: AWSConfig): services.honeycode.Honeycode = new services.honeycode.Honeycode(config)

    type IAM = services.iam.IAM
    def IAM(): services.iam.IAM = new services.iam.IAM()
    def IAM(config: AWSConfig): services.iam.IAM = new services.iam.IAM(config)

    type IdentityStore = services.identitystore.IdentityStore
    def IdentityStore(): services.identitystore.IdentityStore = new services.identitystore.IdentityStore()
    def IdentityStore(config: AWSConfig): services.identitystore.IdentityStore = new services.identitystore.IdentityStore(config)

    type Imagebuilder = services.imagebuilder.Imagebuilder
    def Imagebuilder(): services.imagebuilder.Imagebuilder = new services.imagebuilder.Imagebuilder()
    def Imagebuilder(config: AWSConfig): services.imagebuilder.Imagebuilder = new services.imagebuilder.Imagebuilder(config)

    type ImportExport = services.importexport.ImportExport
    def ImportExport(): services.importexport.ImportExport = new services.importexport.ImportExport()
    def ImportExport(config: AWSConfig): services.importexport.ImportExport = new services.importexport.ImportExport(config)

    type Inspector = services.inspector.Inspector
    def Inspector(): services.inspector.Inspector = new services.inspector.Inspector()
    def Inspector(config: AWSConfig): services.inspector.Inspector = new services.inspector.Inspector(config)

    type Inspector2 = services.inspector2.Inspector2
    def Inspector2(): services.inspector2.Inspector2 = new services.inspector2.Inspector2()
    def Inspector2(config: AWSConfig): services.inspector2.Inspector2 = new services.inspector2.Inspector2(config)

    type Iot = services.iot.Iot
    def Iot(): services.iot.Iot = new services.iot.Iot()
    def Iot(config: AWSConfig): services.iot.Iot = new services.iot.Iot(config)

    type IotData = services.iotdata.IotData
    def IotData(): services.iotdata.IotData = new services.iotdata.IotData()
    def IotData(config: AWSConfig): services.iotdata.IotData = new services.iotdata.IotData(config)

    type IoTJobsDataPlane = services.iotjobsdataplane.IoTJobsDataPlane
    def IoTJobsDataPlane(): services.iotjobsdataplane.IoTJobsDataPlane = new services.iotjobsdataplane.IoTJobsDataPlane()
    def IoTJobsDataPlane(config: AWSConfig): services.iotjobsdataplane.IoTJobsDataPlane = new services.iotjobsdataplane.IoTJobsDataPlane(config)

    type IoTRoboRunner = services.iotroborunner.IoTRoboRunner
    def IoTRoboRunner(): services.iotroborunner.IoTRoboRunner = new services.iotroborunner.IoTRoboRunner()
    def IoTRoboRunner(config: AWSConfig): services.iotroborunner.IoTRoboRunner = new services.iotroborunner.IoTRoboRunner(config)

    type IoT1ClickDevicesService = services.iot1clickdevicesservice.IoT1ClickDevicesService
    def IoT1ClickDevicesService(): services.iot1clickdevicesservice.IoT1ClickDevicesService = new services.iot1clickdevicesservice.IoT1ClickDevicesService()
    def IoT1ClickDevicesService(config: AWSConfig): services.iot1clickdevicesservice.IoT1ClickDevicesService = new services.iot1clickdevicesservice.IoT1ClickDevicesService(config)

    type IoT1ClickProjects = services.iot1clickprojects.IoT1ClickProjects
    def IoT1ClickProjects(): services.iot1clickprojects.IoT1ClickProjects = new services.iot1clickprojects.IoT1ClickProjects()
    def IoT1ClickProjects(config: AWSConfig): services.iot1clickprojects.IoT1ClickProjects = new services.iot1clickprojects.IoT1ClickProjects(config)

    type IoTAnalytics = services.iotanalytics.IoTAnalytics
    def IoTAnalytics(): services.iotanalytics.IoTAnalytics = new services.iotanalytics.IoTAnalytics()
    def IoTAnalytics(config: AWSConfig): services.iotanalytics.IoTAnalytics = new services.iotanalytics.IoTAnalytics(config)

    type IotDeviceAdvisor = services.iotdeviceadvisor.IotDeviceAdvisor
    def IotDeviceAdvisor(): services.iotdeviceadvisor.IotDeviceAdvisor = new services.iotdeviceadvisor.IotDeviceAdvisor()
    def IotDeviceAdvisor(config: AWSConfig): services.iotdeviceadvisor.IotDeviceAdvisor = new services.iotdeviceadvisor.IotDeviceAdvisor(config)

    type IoTEvents = services.iotevents.IoTEvents
    def IoTEvents(): services.iotevents.IoTEvents = new services.iotevents.IoTEvents()
    def IoTEvents(config: AWSConfig): services.iotevents.IoTEvents = new services.iotevents.IoTEvents(config)

    type IoTEventsData = services.ioteventsdata.IoTEventsData
    def IoTEventsData(): services.ioteventsdata.IoTEventsData = new services.ioteventsdata.IoTEventsData()
    def IoTEventsData(config: AWSConfig): services.ioteventsdata.IoTEventsData = new services.ioteventsdata.IoTEventsData(config)

    type IoTFleetHub = services.iotfleethub.IoTFleetHub
    def IoTFleetHub(): services.iotfleethub.IoTFleetHub = new services.iotfleethub.IoTFleetHub()
    def IoTFleetHub(config: AWSConfig): services.iotfleethub.IoTFleetHub = new services.iotfleethub.IoTFleetHub(config)

    type IoTFleetWise = services.iotfleetwise.IoTFleetWise
    def IoTFleetWise(): services.iotfleetwise.IoTFleetWise = new services.iotfleetwise.IoTFleetWise()
    def IoTFleetWise(config: AWSConfig): services.iotfleetwise.IoTFleetWise = new services.iotfleetwise.IoTFleetWise(config)

    type IoTSecureTunneling = services.iotsecuretunneling.IoTSecureTunneling
    def IoTSecureTunneling(): services.iotsecuretunneling.IoTSecureTunneling = new services.iotsecuretunneling.IoTSecureTunneling()
    def IoTSecureTunneling(config: AWSConfig): services.iotsecuretunneling.IoTSecureTunneling = new services.iotsecuretunneling.IoTSecureTunneling(config)

    type IoTSiteWise = services.iotsitewise.IoTSiteWise
    def IoTSiteWise(): services.iotsitewise.IoTSiteWise = new services.iotsitewise.IoTSiteWise()
    def IoTSiteWise(config: AWSConfig): services.iotsitewise.IoTSiteWise = new services.iotsitewise.IoTSiteWise(config)

    type IoTThingsGraph = services.iotthingsgraph.IoTThingsGraph
    def IoTThingsGraph(): services.iotthingsgraph.IoTThingsGraph = new services.iotthingsgraph.IoTThingsGraph()
    def IoTThingsGraph(config: AWSConfig): services.iotthingsgraph.IoTThingsGraph = new services.iotthingsgraph.IoTThingsGraph(config)

    type IoTTwinMaker = services.iottwinmaker.IoTTwinMaker
    def IoTTwinMaker(): services.iottwinmaker.IoTTwinMaker = new services.iottwinmaker.IoTTwinMaker()
    def IoTTwinMaker(config: AWSConfig): services.iottwinmaker.IoTTwinMaker = new services.iottwinmaker.IoTTwinMaker(config)

    type IoTWireless = services.iotwireless.IoTWireless
    def IoTWireless(): services.iotwireless.IoTWireless = new services.iotwireless.IoTWireless()
    def IoTWireless(config: AWSConfig): services.iotwireless.IoTWireless = new services.iotwireless.IoTWireless(config)

    type IVS = services.ivs.IVS
    def IVS(): services.ivs.IVS = new services.ivs.IVS()
    def IVS(config: AWSConfig): services.ivs.IVS = new services.ivs.IVS(config)

    type IVSChat = services.ivschat.IVSChat
    def IVSChat(): services.ivschat.IVSChat = new services.ivschat.IVSChat()
    def IVSChat(config: AWSConfig): services.ivschat.IVSChat = new services.ivschat.IVSChat(config)

    type Kafka = services.kafka.Kafka
    def Kafka(): services.kafka.Kafka = new services.kafka.Kafka()
    def Kafka(config: AWSConfig): services.kafka.Kafka = new services.kafka.Kafka(config)

    type KafkaConnect = services.kafkaconnect.KafkaConnect
    def KafkaConnect(): services.kafkaconnect.KafkaConnect = new services.kafkaconnect.KafkaConnect()
    def KafkaConnect(config: AWSConfig): services.kafkaconnect.KafkaConnect = new services.kafkaconnect.KafkaConnect(config)

    type Kendra = services.kendra.Kendra
    def Kendra(): services.kendra.Kendra = new services.kendra.Kendra()
    def Kendra(config: AWSConfig): services.kendra.Kendra = new services.kendra.Kendra(config)

    type Keyspaces = services.keyspaces.Keyspaces
    def Keyspaces(): services.keyspaces.Keyspaces = new services.keyspaces.Keyspaces()
    def Keyspaces(config: AWSConfig): services.keyspaces.Keyspaces = new services.keyspaces.Keyspaces(config)

    type Kinesis = services.kinesis.Kinesis
    def Kinesis(): services.kinesis.Kinesis = new services.kinesis.Kinesis()
    def Kinesis(config: AWSConfig): services.kinesis.Kinesis = new services.kinesis.Kinesis(config)

    type KinesisVideoArchivedMedia = services.kinesisvideoarchivedmedia.KinesisVideoArchivedMedia
    def KinesisVideoArchivedMedia(): services.kinesisvideoarchivedmedia.KinesisVideoArchivedMedia = new services.kinesisvideoarchivedmedia.KinesisVideoArchivedMedia()
    def KinesisVideoArchivedMedia(config: AWSConfig): services.kinesisvideoarchivedmedia.KinesisVideoArchivedMedia = new services.kinesisvideoarchivedmedia.KinesisVideoArchivedMedia(config)

    type KinesisVideoMedia = services.kinesisvideomedia.KinesisVideoMedia
    def KinesisVideoMedia(): services.kinesisvideomedia.KinesisVideoMedia = new services.kinesisvideomedia.KinesisVideoMedia()
    def KinesisVideoMedia(config: AWSConfig): services.kinesisvideomedia.KinesisVideoMedia = new services.kinesisvideomedia.KinesisVideoMedia(config)

    type KinesisVideoSignaling = services.kinesisvideosignaling.KinesisVideoSignaling
    def KinesisVideoSignaling(): services.kinesisvideosignaling.KinesisVideoSignaling = new services.kinesisvideosignaling.KinesisVideoSignaling()
    def KinesisVideoSignaling(config: AWSConfig): services.kinesisvideosignaling.KinesisVideoSignaling = new services.kinesisvideosignaling.KinesisVideoSignaling(config)

    type KinesisAnalytics = services.kinesisanalytics.KinesisAnalytics
    def KinesisAnalytics(): services.kinesisanalytics.KinesisAnalytics = new services.kinesisanalytics.KinesisAnalytics()
    def KinesisAnalytics(config: AWSConfig): services.kinesisanalytics.KinesisAnalytics = new services.kinesisanalytics.KinesisAnalytics(config)

    type KinesisAnalyticsV2 = services.kinesisanalyticsv2.KinesisAnalyticsV2
    def KinesisAnalyticsV2(): services.kinesisanalyticsv2.KinesisAnalyticsV2 = new services.kinesisanalyticsv2.KinesisAnalyticsV2()
    def KinesisAnalyticsV2(config: AWSConfig): services.kinesisanalyticsv2.KinesisAnalyticsV2 = new services.kinesisanalyticsv2.KinesisAnalyticsV2(config)

    type KinesisVideo = services.kinesisvideo.KinesisVideo
    def KinesisVideo(): services.kinesisvideo.KinesisVideo = new services.kinesisvideo.KinesisVideo()
    def KinesisVideo(config: AWSConfig): services.kinesisvideo.KinesisVideo = new services.kinesisvideo.KinesisVideo(config)

    type KMS = services.kms.KMS
    def KMS(): services.kms.KMS = new services.kms.KMS()
    def KMS(config: AWSConfig): services.kms.KMS = new services.kms.KMS(config)

    type LakeFormation = services.lakeformation.LakeFormation
    def LakeFormation(): services.lakeformation.LakeFormation = new services.lakeformation.LakeFormation()
    def LakeFormation(config: AWSConfig): services.lakeformation.LakeFormation = new services.lakeformation.LakeFormation(config)

    type Lambda = services.lambda.Lambda
    def Lambda(): services.lambda.Lambda = new services.lambda.Lambda()
    def Lambda(config: AWSConfig): services.lambda.Lambda = new services.lambda.Lambda(config)

    type LexModelBuildingService = services.lexmodelbuildingservice.LexModelBuildingService
    def LexModelBuildingService(): services.lexmodelbuildingservice.LexModelBuildingService = new services.lexmodelbuildingservice.LexModelBuildingService()
    def LexModelBuildingService(config: AWSConfig): services.lexmodelbuildingservice.LexModelBuildingService = new services.lexmodelbuildingservice.LexModelBuildingService(config)

    type LicenseManager = services.licensemanager.LicenseManager
    def LicenseManager(): services.licensemanager.LicenseManager = new services.licensemanager.LicenseManager()
    def LicenseManager(config: AWSConfig): services.licensemanager.LicenseManager = new services.licensemanager.LicenseManager(config)

    type LicenseManagerUserSubscriptions = services.licensemanagerusersubscriptions.LicenseManagerUserSubscriptions
    def LicenseManagerUserSubscriptions(): services.licensemanagerusersubscriptions.LicenseManagerUserSubscriptions = new services.licensemanagerusersubscriptions.LicenseManagerUserSubscriptions()
    def LicenseManagerUserSubscriptions(config: AWSConfig): services.licensemanagerusersubscriptions.LicenseManagerUserSubscriptions = new services.licensemanagerusersubscriptions.LicenseManagerUserSubscriptions(config)

    type Lightsail = services.lightsail.Lightsail
    def Lightsail(): services.lightsail.Lightsail = new services.lightsail.Lightsail()
    def Lightsail(config: AWSConfig): services.lightsail.Lightsail = new services.lightsail.Lightsail(config)

    type Location = services.location.Location
    def Location(): services.location.Location = new services.location.Location()
    def Location(config: AWSConfig): services.location.Location = new services.location.Location(config)

    type CloudWatchLogs = services.cloudwatchlogs.CloudWatchLogs
    def CloudWatchLogs(): services.cloudwatchlogs.CloudWatchLogs = new services.cloudwatchlogs.CloudWatchLogs()
    def CloudWatchLogs(config: AWSConfig): services.cloudwatchlogs.CloudWatchLogs = new services.cloudwatchlogs.CloudWatchLogs(config)

    type LookoutEquipment = services.lookoutequipment.LookoutEquipment
    def LookoutEquipment(): services.lookoutequipment.LookoutEquipment = new services.lookoutequipment.LookoutEquipment()
    def LookoutEquipment(config: AWSConfig): services.lookoutequipment.LookoutEquipment = new services.lookoutequipment.LookoutEquipment(config)

    type LookoutMetrics = services.lookoutmetrics.LookoutMetrics
    def LookoutMetrics(): services.lookoutmetrics.LookoutMetrics = new services.lookoutmetrics.LookoutMetrics()
    def LookoutMetrics(config: AWSConfig): services.lookoutmetrics.LookoutMetrics = new services.lookoutmetrics.LookoutMetrics(config)

    type LookoutVision = services.lookoutvision.LookoutVision
    def LookoutVision(): services.lookoutvision.LookoutVision = new services.lookoutvision.LookoutVision()
    def LookoutVision(config: AWSConfig): services.lookoutvision.LookoutVision = new services.lookoutvision.LookoutVision(config)

    type M2 = services.m2.M2
    def M2(): services.m2.M2 = new services.m2.M2()
    def M2(config: AWSConfig): services.m2.M2 = new services.m2.M2(config)

    type MachineLearning = services.machinelearning.MachineLearning
    def MachineLearning(): services.machinelearning.MachineLearning = new services.machinelearning.MachineLearning()
    def MachineLearning(config: AWSConfig): services.machinelearning.MachineLearning = new services.machinelearning.MachineLearning(config)

    type Macie = services.macie.Macie
    def Macie(): services.macie.Macie = new services.macie.Macie()
    def Macie(config: AWSConfig): services.macie.Macie = new services.macie.Macie(config)

    type Macie2 = services.macie2.Macie2
    def Macie2(): services.macie2.Macie2 = new services.macie2.Macie2()
    def Macie2(config: AWSConfig): services.macie2.Macie2 = new services.macie2.Macie2(config)

    type ManagedBlockchain = services.managedblockchain.ManagedBlockchain
    def ManagedBlockchain(): services.managedblockchain.ManagedBlockchain = new services.managedblockchain.ManagedBlockchain()
    def ManagedBlockchain(config: AWSConfig): services.managedblockchain.ManagedBlockchain = new services.managedblockchain.ManagedBlockchain(config)

    type MarketplaceCatalog = services.marketplacecatalog.MarketplaceCatalog
    def MarketplaceCatalog(): services.marketplacecatalog.MarketplaceCatalog = new services.marketplacecatalog.MarketplaceCatalog()
    def MarketplaceCatalog(config: AWSConfig): services.marketplacecatalog.MarketplaceCatalog = new services.marketplacecatalog.MarketplaceCatalog(config)

    type MarketplaceCommerceAnalytics = services.marketplacecommerceanalytics.MarketplaceCommerceAnalytics
    def MarketplaceCommerceAnalytics(): services.marketplacecommerceanalytics.MarketplaceCommerceAnalytics = new services.marketplacecommerceanalytics.MarketplaceCommerceAnalytics()
    def MarketplaceCommerceAnalytics(config: AWSConfig): services.marketplacecommerceanalytics.MarketplaceCommerceAnalytics = new services.marketplacecommerceanalytics.MarketplaceCommerceAnalytics(config)

    type MediaConnect = services.mediaconnect.MediaConnect
    def MediaConnect(): services.mediaconnect.MediaConnect = new services.mediaconnect.MediaConnect()
    def MediaConnect(config: AWSConfig): services.mediaconnect.MediaConnect = new services.mediaconnect.MediaConnect(config)

    type MediaConvert = services.mediaconvert.MediaConvert
    def MediaConvert(): services.mediaconvert.MediaConvert = new services.mediaconvert.MediaConvert()
    def MediaConvert(config: AWSConfig): services.mediaconvert.MediaConvert = new services.mediaconvert.MediaConvert(config)

    type MediaLive = services.medialive.MediaLive
    def MediaLive(): services.medialive.MediaLive = new services.medialive.MediaLive()
    def MediaLive(config: AWSConfig): services.medialive.MediaLive = new services.medialive.MediaLive(config)

    type MediaPackage = services.mediapackage.MediaPackage
    def MediaPackage(): services.mediapackage.MediaPackage = new services.mediapackage.MediaPackage()
    def MediaPackage(config: AWSConfig): services.mediapackage.MediaPackage = new services.mediapackage.MediaPackage(config)

    type MediaPackageVod = services.mediapackagevod.MediaPackageVod
    def MediaPackageVod(): services.mediapackagevod.MediaPackageVod = new services.mediapackagevod.MediaPackageVod()
    def MediaPackageVod(config: AWSConfig): services.mediapackagevod.MediaPackageVod = new services.mediapackagevod.MediaPackageVod(config)

    type MediaStore = services.mediastore.MediaStore
    def MediaStore(): services.mediastore.MediaStore = new services.mediastore.MediaStore()
    def MediaStore(config: AWSConfig): services.mediastore.MediaStore = new services.mediastore.MediaStore(config)

    type MediaStoreData = services.mediastoredata.MediaStoreData
    def MediaStoreData(): services.mediastoredata.MediaStoreData = new services.mediastoredata.MediaStoreData()
    def MediaStoreData(config: AWSConfig): services.mediastoredata.MediaStoreData = new services.mediastoredata.MediaStoreData(config)

    type MediaTailor = services.mediatailor.MediaTailor
    def MediaTailor(): services.mediatailor.MediaTailor = new services.mediatailor.MediaTailor()
    def MediaTailor(config: AWSConfig): services.mediatailor.MediaTailor = new services.mediatailor.MediaTailor(config)

    type MemoryDB = services.memorydb.MemoryDB
    def MemoryDB(): services.memorydb.MemoryDB = new services.memorydb.MemoryDB()
    def MemoryDB(config: AWSConfig): services.memorydb.MemoryDB = new services.memorydb.MemoryDB(config)

    type MarketplaceMetering = services.marketplacemetering.MarketplaceMetering
    def MarketplaceMetering(): services.marketplacemetering.MarketplaceMetering = new services.marketplacemetering.MarketplaceMetering()
    def MarketplaceMetering(config: AWSConfig): services.marketplacemetering.MarketplaceMetering = new services.marketplacemetering.MarketplaceMetering(config)

    type Mgn = services.mgn.Mgn
    def Mgn(): services.mgn.Mgn = new services.mgn.Mgn()
    def Mgn(config: AWSConfig): services.mgn.Mgn = new services.mgn.Mgn(config)

    type MigrationHubRefactorSpaces = services.migrationhubrefactorspaces.MigrationHubRefactorSpaces
    def MigrationHubRefactorSpaces(): services.migrationhubrefactorspaces.MigrationHubRefactorSpaces = new services.migrationhubrefactorspaces.MigrationHubRefactorSpaces()
    def MigrationHubRefactorSpaces(config: AWSConfig): services.migrationhubrefactorspaces.MigrationHubRefactorSpaces = new services.migrationhubrefactorspaces.MigrationHubRefactorSpaces(config)

    type MigrationHubConfig = services.migrationhubconfig.MigrationHubConfig
    def MigrationHubConfig(): services.migrationhubconfig.MigrationHubConfig = new services.migrationhubconfig.MigrationHubConfig()
    def MigrationHubConfig(config: AWSConfig): services.migrationhubconfig.MigrationHubConfig = new services.migrationhubconfig.MigrationHubConfig(config)

    type MigrationHubOrchestrator = services.migrationhuborchestrator.MigrationHubOrchestrator
    def MigrationHubOrchestrator(): services.migrationhuborchestrator.MigrationHubOrchestrator = new services.migrationhuborchestrator.MigrationHubOrchestrator()
    def MigrationHubOrchestrator(config: AWSConfig): services.migrationhuborchestrator.MigrationHubOrchestrator = new services.migrationhuborchestrator.MigrationHubOrchestrator(config)

    type MigrationHubStrategy = services.migrationhubstrategy.MigrationHubStrategy
    def MigrationHubStrategy(): services.migrationhubstrategy.MigrationHubStrategy = new services.migrationhubstrategy.MigrationHubStrategy()
    def MigrationHubStrategy(config: AWSConfig): services.migrationhubstrategy.MigrationHubStrategy = new services.migrationhubstrategy.MigrationHubStrategy(config)

    type Mobile = services.mobile.Mobile
    def Mobile(): services.mobile.Mobile = new services.mobile.Mobile()
    def Mobile(config: AWSConfig): services.mobile.Mobile = new services.mobile.Mobile(config)

    type MobileAnalytics = services.mobileanalytics.MobileAnalytics
    def MobileAnalytics(): services.mobileanalytics.MobileAnalytics = new services.mobileanalytics.MobileAnalytics()
    def MobileAnalytics(config: AWSConfig): services.mobileanalytics.MobileAnalytics = new services.mobileanalytics.MobileAnalytics(config)

    type LexModelsV2 = services.lexmodelsv2.LexModelsV2
    def LexModelsV2(): services.lexmodelsv2.LexModelsV2 = new services.lexmodelsv2.LexModelsV2()
    def LexModelsV2(config: AWSConfig): services.lexmodelsv2.LexModelsV2 = new services.lexmodelsv2.LexModelsV2(config)

    type CloudWatch = services.cloudwatch.CloudWatch
    def CloudWatch(): services.cloudwatch.CloudWatch = new services.cloudwatch.CloudWatch()
    def CloudWatch(config: AWSConfig): services.cloudwatch.CloudWatch = new services.cloudwatch.CloudWatch(config)

    type MQ = services.mq.MQ
    def MQ(): services.mq.MQ = new services.mq.MQ()
    def MQ(config: AWSConfig): services.mq.MQ = new services.mq.MQ(config)

    type MTurk = services.mturk.MTurk
    def MTurk(): services.mturk.MTurk = new services.mturk.MTurk()
    def MTurk(config: AWSConfig): services.mturk.MTurk = new services.mturk.MTurk(config)

    type MWAA = services.mwaa.MWAA
    def MWAA(): services.mwaa.MWAA = new services.mwaa.MWAA()
    def MWAA(config: AWSConfig): services.mwaa.MWAA = new services.mwaa.MWAA(config)

    type Neptune = services.neptune.Neptune
    def Neptune(): services.neptune.Neptune = new services.neptune.Neptune()
    def Neptune(config: AWSConfig): services.neptune.Neptune = new services.neptune.Neptune(config)

    type NetworkFirewall = services.networkfirewall.NetworkFirewall
    def NetworkFirewall(): services.networkfirewall.NetworkFirewall = new services.networkfirewall.NetworkFirewall()
    def NetworkFirewall(config: AWSConfig): services.networkfirewall.NetworkFirewall = new services.networkfirewall.NetworkFirewall(config)

    type NetworkManager = services.networkmanager.NetworkManager
    def NetworkManager(): services.networkmanager.NetworkManager = new services.networkmanager.NetworkManager()
    def NetworkManager(config: AWSConfig): services.networkmanager.NetworkManager = new services.networkmanager.NetworkManager(config)

    type Nimble = services.nimble.Nimble
    def Nimble(): services.nimble.Nimble = new services.nimble.Nimble()
    def Nimble(config: AWSConfig): services.nimble.Nimble = new services.nimble.Nimble(config)

    type OAM = services.oam.OAM
    def OAM(): services.oam.OAM = new services.oam.OAM()
    def OAM(config: AWSConfig): services.oam.OAM = new services.oam.OAM(config)

    type Omics = services.omics.Omics
    def Omics(): services.omics.Omics = new services.omics.Omics()
    def Omics(config: AWSConfig): services.omics.Omics = new services.omics.Omics(config)

    type OpenSearch = services.opensearch.OpenSearch
    def OpenSearch(): services.opensearch.OpenSearch = new services.opensearch.OpenSearch()
    def OpenSearch(config: AWSConfig): services.opensearch.OpenSearch = new services.opensearch.OpenSearch(config)

    type OpenSearchServerless = services.opensearchserverless.OpenSearchServerless
    def OpenSearchServerless(): services.opensearchserverless.OpenSearchServerless = new services.opensearchserverless.OpenSearchServerless()
    def OpenSearchServerless(config: AWSConfig): services.opensearchserverless.OpenSearchServerless = new services.opensearchserverless.OpenSearchServerless(config)

    type OpsWorks = services.opsworks.OpsWorks
    def OpsWorks(): services.opsworks.OpsWorks = new services.opsworks.OpsWorks()
    def OpsWorks(config: AWSConfig): services.opsworks.OpsWorks = new services.opsworks.OpsWorks(config)

    type OpsWorksCM = services.opsworkscm.OpsWorksCM
    def OpsWorksCM(): services.opsworkscm.OpsWorksCM = new services.opsworkscm.OpsWorksCM()
    def OpsWorksCM(config: AWSConfig): services.opsworkscm.OpsWorksCM = new services.opsworkscm.OpsWorksCM(config)

    type Organizations = services.organizations.Organizations
    def Organizations(): services.organizations.Organizations = new services.organizations.Organizations()
    def Organizations(config: AWSConfig): services.organizations.Organizations = new services.organizations.Organizations(config)

    type Outposts = services.outposts.Outposts
    def Outposts(): services.outposts.Outposts = new services.outposts.Outposts()
    def Outposts(config: AWSConfig): services.outposts.Outposts = new services.outposts.Outposts(config)

    type Panorama = services.panorama.Panorama
    def Panorama(): services.panorama.Panorama = new services.panorama.Panorama()
    def Panorama(config: AWSConfig): services.panorama.Panorama = new services.panorama.Panorama(config)

    type Personalize = services.personalize.Personalize
    def Personalize(): services.personalize.Personalize = new services.personalize.Personalize()
    def Personalize(config: AWSConfig): services.personalize.Personalize = new services.personalize.Personalize(config)

    type PersonalizeEvents = services.personalizeevents.PersonalizeEvents
    def PersonalizeEvents(): services.personalizeevents.PersonalizeEvents = new services.personalizeevents.PersonalizeEvents()
    def PersonalizeEvents(config: AWSConfig): services.personalizeevents.PersonalizeEvents = new services.personalizeevents.PersonalizeEvents(config)

    type PersonalizeRuntime = services.personalizeruntime.PersonalizeRuntime
    def PersonalizeRuntime(): services.personalizeruntime.PersonalizeRuntime = new services.personalizeruntime.PersonalizeRuntime()
    def PersonalizeRuntime(config: AWSConfig): services.personalizeruntime.PersonalizeRuntime = new services.personalizeruntime.PersonalizeRuntime(config)

    type PI = services.pi.PI
    def PI(): services.pi.PI = new services.pi.PI()
    def PI(config: AWSConfig): services.pi.PI = new services.pi.PI(config)

    type Pinpoint = services.pinpoint.Pinpoint
    def Pinpoint(): services.pinpoint.Pinpoint = new services.pinpoint.Pinpoint()
    def Pinpoint(config: AWSConfig): services.pinpoint.Pinpoint = new services.pinpoint.Pinpoint(config)

    type PinpointEmail = services.pinpointemail.PinpointEmail
    def PinpointEmail(): services.pinpointemail.PinpointEmail = new services.pinpointemail.PinpointEmail()
    def PinpointEmail(config: AWSConfig): services.pinpointemail.PinpointEmail = new services.pinpointemail.PinpointEmail(config)

    type PinpointSMSVoiceV2 = services.pinpointsmsvoicev2.PinpointSMSVoiceV2
    def PinpointSMSVoiceV2(): services.pinpointsmsvoicev2.PinpointSMSVoiceV2 = new services.pinpointsmsvoicev2.PinpointSMSVoiceV2()
    def PinpointSMSVoiceV2(config: AWSConfig): services.pinpointsmsvoicev2.PinpointSMSVoiceV2 = new services.pinpointsmsvoicev2.PinpointSMSVoiceV2(config)

    type Pipes = services.pipes.Pipes
    def Pipes(): services.pipes.Pipes = new services.pipes.Pipes()
    def Pipes(config: AWSConfig): services.pipes.Pipes = new services.pipes.Pipes(config)

    type Polly = services.polly.Polly
    def Polly(): services.polly.Polly = new services.polly.Polly()
    def Polly(config: AWSConfig): services.polly.Polly = new services.polly.Polly(config)

    type Pricing = services.pricing.Pricing
    def Pricing(): services.pricing.Pricing = new services.pricing.Pricing()
    def Pricing(config: AWSConfig): services.pricing.Pricing = new services.pricing.Pricing(config)

    type PrivateNetworks = services.privatenetworks.PrivateNetworks
    def PrivateNetworks(): services.privatenetworks.PrivateNetworks = new services.privatenetworks.PrivateNetworks()
    def PrivateNetworks(config: AWSConfig): services.privatenetworks.PrivateNetworks = new services.privatenetworks.PrivateNetworks(config)

    type Proton = services.proton.Proton
    def Proton(): services.proton.Proton = new services.proton.Proton()
    def Proton(config: AWSConfig): services.proton.Proton = new services.proton.Proton(config)

    type QLDB = services.qldb.QLDB
    def QLDB(): services.qldb.QLDB = new services.qldb.QLDB()
    def QLDB(config: AWSConfig): services.qldb.QLDB = new services.qldb.QLDB(config)

    type QLDBSession = services.qldbsession.QLDBSession
    def QLDBSession(): services.qldbsession.QLDBSession = new services.qldbsession.QLDBSession()
    def QLDBSession(config: AWSConfig): services.qldbsession.QLDBSession = new services.qldbsession.QLDBSession(config)

    type QuickSight = services.quicksight.QuickSight
    def QuickSight(): services.quicksight.QuickSight = new services.quicksight.QuickSight()
    def QuickSight(config: AWSConfig): services.quicksight.QuickSight = new services.quicksight.QuickSight(config)

    type RAM = services.ram.RAM
    def RAM(): services.ram.RAM = new services.ram.RAM()
    def RAM(config: AWSConfig): services.ram.RAM = new services.ram.RAM(config)

    type RBin = services.rbin.RBin
    def RBin(): services.rbin.RBin = new services.rbin.RBin()
    def RBin(config: AWSConfig): services.rbin.RBin = new services.rbin.RBin(config)

    type RDS = services.rds.RDS
    def RDS(): services.rds.RDS = new services.rds.RDS()
    def RDS(config: AWSConfig): services.rds.RDS = new services.rds.RDS(config)

    type RDSDataService = services.rdsdataservice.RDSDataService
    def RDSDataService(): services.rdsdataservice.RDSDataService = new services.rdsdataservice.RDSDataService()
    def RDSDataService(config: AWSConfig): services.rdsdataservice.RDSDataService = new services.rdsdataservice.RDSDataService(config)

    type Redshift = services.redshift.Redshift
    def Redshift(): services.redshift.Redshift = new services.redshift.Redshift()
    def Redshift(config: AWSConfig): services.redshift.Redshift = new services.redshift.Redshift(config)

    type RedshiftData = services.redshiftdata.RedshiftData
    def RedshiftData(): services.redshiftdata.RedshiftData = new services.redshiftdata.RedshiftData()
    def RedshiftData(config: AWSConfig): services.redshiftdata.RedshiftData = new services.redshiftdata.RedshiftData(config)

    type RedshiftServerless = services.redshiftserverless.RedshiftServerless
    def RedshiftServerless(): services.redshiftserverless.RedshiftServerless = new services.redshiftserverless.RedshiftServerless()
    def RedshiftServerless(config: AWSConfig): services.redshiftserverless.RedshiftServerless = new services.redshiftserverless.RedshiftServerless(config)

    type Rekognition = services.rekognition.Rekognition
    def Rekognition(): services.rekognition.Rekognition = new services.rekognition.Rekognition()
    def Rekognition(config: AWSConfig): services.rekognition.Rekognition = new services.rekognition.Rekognition(config)

    type ResilienceHub = services.resiliencehub.ResilienceHub
    def ResilienceHub(): services.resiliencehub.ResilienceHub = new services.resiliencehub.ResilienceHub()
    def ResilienceHub(config: AWSConfig): services.resiliencehub.ResilienceHub = new services.resiliencehub.ResilienceHub(config)

    type ResourceExplorer2 = services.resourceexplorer2.ResourceExplorer2
    def ResourceExplorer2(): services.resourceexplorer2.ResourceExplorer2 = new services.resourceexplorer2.ResourceExplorer2()
    def ResourceExplorer2(config: AWSConfig): services.resourceexplorer2.ResourceExplorer2 = new services.resourceexplorer2.ResourceExplorer2(config)

    type ResourceGroups = services.resourcegroups.ResourceGroups
    def ResourceGroups(): services.resourcegroups.ResourceGroups = new services.resourcegroups.ResourceGroups()
    def ResourceGroups(config: AWSConfig): services.resourcegroups.ResourceGroups = new services.resourcegroups.ResourceGroups(config)

    type ResourceGroupsTaggingAPI = services.resourcegroupstaggingapi.ResourceGroupsTaggingAPI
    def ResourceGroupsTaggingAPI(): services.resourcegroupstaggingapi.ResourceGroupsTaggingAPI = new services.resourcegroupstaggingapi.ResourceGroupsTaggingAPI()
    def ResourceGroupsTaggingAPI(config: AWSConfig): services.resourcegroupstaggingapi.ResourceGroupsTaggingAPI = new services.resourcegroupstaggingapi.ResourceGroupsTaggingAPI(config)

    type RoboMaker = services.robomaker.RoboMaker
    def RoboMaker(): services.robomaker.RoboMaker = new services.robomaker.RoboMaker()
    def RoboMaker(config: AWSConfig): services.robomaker.RoboMaker = new services.robomaker.RoboMaker(config)

    type RolesAnywhere = services.rolesanywhere.RolesAnywhere
    def RolesAnywhere(): services.rolesanywhere.RolesAnywhere = new services.rolesanywhere.RolesAnywhere()
    def RolesAnywhere(config: AWSConfig): services.rolesanywhere.RolesAnywhere = new services.rolesanywhere.RolesAnywhere(config)

    type Route53 = services.route53.Route53
    def Route53(): services.route53.Route53 = new services.route53.Route53()
    def Route53(config: AWSConfig): services.route53.Route53 = new services.route53.Route53(config)

    type Route53RecoveryCluster = services.route53recoverycluster.Route53RecoveryCluster
    def Route53RecoveryCluster(): services.route53recoverycluster.Route53RecoveryCluster = new services.route53recoverycluster.Route53RecoveryCluster()
    def Route53RecoveryCluster(config: AWSConfig): services.route53recoverycluster.Route53RecoveryCluster = new services.route53recoverycluster.Route53RecoveryCluster(config)

    type Route53RecoveryControlConfig = services.route53recoverycontrolconfig.Route53RecoveryControlConfig
    def Route53RecoveryControlConfig(): services.route53recoverycontrolconfig.Route53RecoveryControlConfig = new services.route53recoverycontrolconfig.Route53RecoveryControlConfig()
    def Route53RecoveryControlConfig(config: AWSConfig): services.route53recoverycontrolconfig.Route53RecoveryControlConfig = new services.route53recoverycontrolconfig.Route53RecoveryControlConfig(config)

    type Route53RecoveryReadiness = services.route53recoveryreadiness.Route53RecoveryReadiness
    def Route53RecoveryReadiness(): services.route53recoveryreadiness.Route53RecoveryReadiness = new services.route53recoveryreadiness.Route53RecoveryReadiness()
    def Route53RecoveryReadiness(config: AWSConfig): services.route53recoveryreadiness.Route53RecoveryReadiness = new services.route53recoveryreadiness.Route53RecoveryReadiness(config)

    type Route53Domains = services.route53domains.Route53Domains
    def Route53Domains(): services.route53domains.Route53Domains = new services.route53domains.Route53Domains()
    def Route53Domains(config: AWSConfig): services.route53domains.Route53Domains = new services.route53domains.Route53Domains(config)

    type Route53Resolver = services.route53resolver.Route53Resolver
    def Route53Resolver(): services.route53resolver.Route53Resolver = new services.route53resolver.Route53Resolver()
    def Route53Resolver(config: AWSConfig): services.route53resolver.Route53Resolver = new services.route53resolver.Route53Resolver(config)

    type RUM = services.rum.RUM
    def RUM(): services.rum.RUM = new services.rum.RUM()
    def RUM(config: AWSConfig): services.rum.RUM = new services.rum.RUM(config)

    type LexRuntime = services.lexruntime.LexRuntime
    def LexRuntime(): services.lexruntime.LexRuntime = new services.lexruntime.LexRuntime()
    def LexRuntime(config: AWSConfig): services.lexruntime.LexRuntime = new services.lexruntime.LexRuntime(config)

    type LexRuntimeV2 = services.lexruntimev2.LexRuntimeV2
    def LexRuntimeV2(): services.lexruntimev2.LexRuntimeV2 = new services.lexruntimev2.LexRuntimeV2()
    def LexRuntimeV2(config: AWSConfig): services.lexruntimev2.LexRuntimeV2 = new services.lexruntimev2.LexRuntimeV2(config)

    type SageMakerRuntime = services.sagemakerruntime.SageMakerRuntime
    def SageMakerRuntime(): services.sagemakerruntime.SageMakerRuntime = new services.sagemakerruntime.SageMakerRuntime()
    def SageMakerRuntime(config: AWSConfig): services.sagemakerruntime.SageMakerRuntime = new services.sagemakerruntime.SageMakerRuntime(config)

    type S3 = services.s3.S3
    def S3(): services.s3.S3 = new services.s3.S3()
    def S3(config: AWSConfig): services.s3.S3 = new services.s3.S3(config)

    type S3Control = services.s3control.S3Control
    def S3Control(): services.s3control.S3Control = new services.s3control.S3Control()
    def S3Control(config: AWSConfig): services.s3control.S3Control = new services.s3control.S3Control(config)

    type S3Outposts = services.s3outposts.S3Outposts
    def S3Outposts(): services.s3outposts.S3Outposts = new services.s3outposts.S3Outposts()
    def S3Outposts(config: AWSConfig): services.s3outposts.S3Outposts = new services.s3outposts.S3Outposts(config)

    type SageMaker = services.sagemaker.SageMaker
    def SageMaker(): services.sagemaker.SageMaker = new services.sagemaker.SageMaker()
    def SageMaker(config: AWSConfig): services.sagemaker.SageMaker = new services.sagemaker.SageMaker(config)

    type AugmentedAIRuntime = services.augmentedairuntime.AugmentedAIRuntime
    def AugmentedAIRuntime(): services.augmentedairuntime.AugmentedAIRuntime = new services.augmentedairuntime.AugmentedAIRuntime()
    def AugmentedAIRuntime(config: AWSConfig): services.augmentedairuntime.AugmentedAIRuntime = new services.augmentedairuntime.AugmentedAIRuntime(config)

    type SagemakerEdge = services.sagemakeredge.SagemakerEdge
    def SagemakerEdge(): services.sagemakeredge.SagemakerEdge = new services.sagemakeredge.SagemakerEdge()
    def SagemakerEdge(config: AWSConfig): services.sagemakeredge.SagemakerEdge = new services.sagemakeredge.SagemakerEdge(config)

    type SageMakerFeatureStoreRuntime = services.sagemakerfeaturestoreruntime.SageMakerFeatureStoreRuntime
    def SageMakerFeatureStoreRuntime(): services.sagemakerfeaturestoreruntime.SageMakerFeatureStoreRuntime = new services.sagemakerfeaturestoreruntime.SageMakerFeatureStoreRuntime()
    def SageMakerFeatureStoreRuntime(config: AWSConfig): services.sagemakerfeaturestoreruntime.SageMakerFeatureStoreRuntime = new services.sagemakerfeaturestoreruntime.SageMakerFeatureStoreRuntime(config)

    type SageMakerGeospatial = services.sagemakergeospatial.SageMakerGeospatial
    def SageMakerGeospatial(): services.sagemakergeospatial.SageMakerGeospatial = new services.sagemakergeospatial.SageMakerGeospatial()
    def SageMakerGeospatial(config: AWSConfig): services.sagemakergeospatial.SageMakerGeospatial = new services.sagemakergeospatial.SageMakerGeospatial(config)

    type SavingsPlans = services.savingsplans.SavingsPlans
    def SavingsPlans(): services.savingsplans.SavingsPlans = new services.savingsplans.SavingsPlans()
    def SavingsPlans(config: AWSConfig): services.savingsplans.SavingsPlans = new services.savingsplans.SavingsPlans(config)

    type Scheduler = services.scheduler.Scheduler
    def Scheduler(): services.scheduler.Scheduler = new services.scheduler.Scheduler()
    def Scheduler(config: AWSConfig): services.scheduler.Scheduler = new services.scheduler.Scheduler(config)

    type Schemas = services.schemas.Schemas
    def Schemas(): services.schemas.Schemas = new services.schemas.Schemas()
    def Schemas(config: AWSConfig): services.schemas.Schemas = new services.schemas.Schemas(config)

    type SimpleDB = services.simpledb.SimpleDB
    def SimpleDB(): services.simpledb.SimpleDB = new services.simpledb.SimpleDB()
    def SimpleDB(config: AWSConfig): services.simpledb.SimpleDB = new services.simpledb.SimpleDB(config)

    type SecretsManager = services.secretsmanager.SecretsManager
    def SecretsManager(): services.secretsmanager.SecretsManager = new services.secretsmanager.SecretsManager()
    def SecretsManager(config: AWSConfig): services.secretsmanager.SecretsManager = new services.secretsmanager.SecretsManager(config)

    type SecurityHub = services.securityhub.SecurityHub
    def SecurityHub(): services.securityhub.SecurityHub = new services.securityhub.SecurityHub()
    def SecurityHub(config: AWSConfig): services.securityhub.SecurityHub = new services.securityhub.SecurityHub(config)

    type SecurityLake = services.securitylake.SecurityLake
    def SecurityLake(): services.securitylake.SecurityLake = new services.securitylake.SecurityLake()
    def SecurityLake(config: AWSConfig): services.securitylake.SecurityLake = new services.securitylake.SecurityLake(config)

    type ServerlessApplicationRepository = services.serverlessapplicationrepository.ServerlessApplicationRepository
    def ServerlessApplicationRepository(): services.serverlessapplicationrepository.ServerlessApplicationRepository = new services.serverlessapplicationrepository.ServerlessApplicationRepository()
    def ServerlessApplicationRepository(config: AWSConfig): services.serverlessapplicationrepository.ServerlessApplicationRepository = new services.serverlessapplicationrepository.ServerlessApplicationRepository(config)

    type ServiceQuotas = services.servicequotas.ServiceQuotas
    def ServiceQuotas(): services.servicequotas.ServiceQuotas = new services.servicequotas.ServiceQuotas()
    def ServiceQuotas(config: AWSConfig): services.servicequotas.ServiceQuotas = new services.servicequotas.ServiceQuotas(config)

    type ServiceCatalog = services.servicecatalog.ServiceCatalog
    def ServiceCatalog(): services.servicecatalog.ServiceCatalog = new services.servicecatalog.ServiceCatalog()
    def ServiceCatalog(config: AWSConfig): services.servicecatalog.ServiceCatalog = new services.servicecatalog.ServiceCatalog(config)

    type ServiceCatalogAppRegistry = services.servicecatalogappregistry.ServiceCatalogAppRegistry
    def ServiceCatalogAppRegistry(): services.servicecatalogappregistry.ServiceCatalogAppRegistry = new services.servicecatalogappregistry.ServiceCatalogAppRegistry()
    def ServiceCatalogAppRegistry(config: AWSConfig): services.servicecatalogappregistry.ServiceCatalogAppRegistry = new services.servicecatalogappregistry.ServiceCatalogAppRegistry(config)

    type ServiceDiscovery = services.servicediscovery.ServiceDiscovery
    def ServiceDiscovery(): services.servicediscovery.ServiceDiscovery = new services.servicediscovery.ServiceDiscovery()
    def ServiceDiscovery(config: AWSConfig): services.servicediscovery.ServiceDiscovery = new services.servicediscovery.ServiceDiscovery(config)

    type SESv2 = services.sesv2.SESv2
    def SESv2(): services.sesv2.SESv2 = new services.sesv2.SESv2()
    def SESv2(config: AWSConfig): services.sesv2.SESv2 = new services.sesv2.SESv2(config)

    type Shield = services.shield.Shield
    def Shield(): services.shield.Shield = new services.shield.Shield()
    def Shield(config: AWSConfig): services.shield.Shield = new services.shield.Shield(config)

    type Signer = services.signer.Signer
    def Signer(): services.signer.Signer = new services.signer.Signer()
    def Signer(config: AWSConfig): services.signer.Signer = new services.signer.Signer(config)

    type SimSpaceWeaver = services.simspaceweaver.SimSpaceWeaver
    def SimSpaceWeaver(): services.simspaceweaver.SimSpaceWeaver = new services.simspaceweaver.SimSpaceWeaver()
    def SimSpaceWeaver(config: AWSConfig): services.simspaceweaver.SimSpaceWeaver = new services.simspaceweaver.SimSpaceWeaver(config)

    type SMS = services.sms.SMS
    def SMS(): services.sms.SMS = new services.sms.SMS()
    def SMS(config: AWSConfig): services.sms.SMS = new services.sms.SMS(config)

    type PinpointSMSVoice = services.pinpointsmsvoice.PinpointSMSVoice
    def PinpointSMSVoice(): services.pinpointsmsvoice.PinpointSMSVoice = new services.pinpointsmsvoice.PinpointSMSVoice()
    def PinpointSMSVoice(config: AWSConfig): services.pinpointsmsvoice.PinpointSMSVoice = new services.pinpointsmsvoice.PinpointSMSVoice(config)

    type SnowDeviceManagement = services.snowdevicemanagement.SnowDeviceManagement
    def SnowDeviceManagement(): services.snowdevicemanagement.SnowDeviceManagement = new services.snowdevicemanagement.SnowDeviceManagement()
    def SnowDeviceManagement(config: AWSConfig): services.snowdevicemanagement.SnowDeviceManagement = new services.snowdevicemanagement.SnowDeviceManagement(config)

    type Snowball = services.snowball.Snowball
    def Snowball(): services.snowball.Snowball = new services.snowball.Snowball()
    def Snowball(config: AWSConfig): services.snowball.Snowball = new services.snowball.Snowball(config)

    type SNS = services.sns.SNS
    def SNS(): services.sns.SNS = new services.sns.SNS()
    def SNS(config: AWSConfig): services.sns.SNS = new services.sns.SNS(config)

    type SQS = services.sqs.SQS
    def SQS(): services.sqs.SQS = new services.sqs.SQS()
    def SQS(config: AWSConfig): services.sqs.SQS = new services.sqs.SQS(config)

    type SSM = services.ssm.SSM
    def SSM(): services.ssm.SSM = new services.ssm.SSM()
    def SSM(config: AWSConfig): services.ssm.SSM = new services.ssm.SSM(config)

    type SSMContacts = services.ssmcontacts.SSMContacts
    def SSMContacts(): services.ssmcontacts.SSMContacts = new services.ssmcontacts.SSMContacts()
    def SSMContacts(config: AWSConfig): services.ssmcontacts.SSMContacts = new services.ssmcontacts.SSMContacts(config)

    type SSMIncidents = services.ssmincidents.SSMIncidents
    def SSMIncidents(): services.ssmincidents.SSMIncidents = new services.ssmincidents.SSMIncidents()
    def SSMIncidents(config: AWSConfig): services.ssmincidents.SSMIncidents = new services.ssmincidents.SSMIncidents(config)

    type SsmSap = services.ssmsap.SsmSap
    def SsmSap(): services.ssmsap.SsmSap = new services.ssmsap.SsmSap()
    def SsmSap(config: AWSConfig): services.ssmsap.SsmSap = new services.ssmsap.SsmSap(config)

    type SSO = services.sso.SSO
    def SSO(): services.sso.SSO = new services.sso.SSO()
    def SSO(config: AWSConfig): services.sso.SSO = new services.sso.SSO(config)

    type SSOAdmin = services.ssoadmin.SSOAdmin
    def SSOAdmin(): services.ssoadmin.SSOAdmin = new services.ssoadmin.SSOAdmin()
    def SSOAdmin(config: AWSConfig): services.ssoadmin.SSOAdmin = new services.ssoadmin.SSOAdmin(config)

    type SSOOIDC = services.ssooidc.SSOOIDC
    def SSOOIDC(): services.ssooidc.SSOOIDC = new services.ssooidc.SSOOIDC()
    def SSOOIDC(config: AWSConfig): services.ssooidc.SSOOIDC = new services.ssooidc.SSOOIDC(config)

    type StepFunctions = services.stepfunctions.StepFunctions
    def StepFunctions(): services.stepfunctions.StepFunctions = new services.stepfunctions.StepFunctions()
    def StepFunctions(config: AWSConfig): services.stepfunctions.StepFunctions = new services.stepfunctions.StepFunctions(config)

    type StorageGateway = services.storagegateway.StorageGateway
    def StorageGateway(): services.storagegateway.StorageGateway = new services.storagegateway.StorageGateway()
    def StorageGateway(config: AWSConfig): services.storagegateway.StorageGateway = new services.storagegateway.StorageGateway(config)

    type DynamoDBStreams = services.dynamodbstreams.DynamoDBStreams
    def DynamoDBStreams(): services.dynamodbstreams.DynamoDBStreams = new services.dynamodbstreams.DynamoDBStreams()
    def DynamoDBStreams(config: AWSConfig): services.dynamodbstreams.DynamoDBStreams = new services.dynamodbstreams.DynamoDBStreams(config)

    type STS = services.sts.STS
    def STS(): services.sts.STS = new services.sts.STS()
    def STS(config: AWSConfig): services.sts.STS = new services.sts.STS(config)

    type Support = services.support.Support
    def Support(): services.support.Support = new services.support.Support()
    def Support(config: AWSConfig): services.support.Support = new services.support.Support(config)

    type SupportApp = services.supportapp.SupportApp
    def SupportApp(): services.supportapp.SupportApp = new services.supportapp.SupportApp()
    def SupportApp(config: AWSConfig): services.supportapp.SupportApp = new services.supportapp.SupportApp(config)

    type SWF = services.swf.SWF
    def SWF(): services.swf.SWF = new services.swf.SWF()
    def SWF(config: AWSConfig): services.swf.SWF = new services.swf.SWF(config)

    type Synthetics = services.synthetics.Synthetics
    def Synthetics(): services.synthetics.Synthetics = new services.synthetics.Synthetics()
    def Synthetics(config: AWSConfig): services.synthetics.Synthetics = new services.synthetics.Synthetics(config)

    type Textract = services.textract.Textract
    def Textract(): services.textract.Textract = new services.textract.Textract()
    def Textract(config: AWSConfig): services.textract.Textract = new services.textract.Textract(config)

    type TimestreamQuery = services.timestreamquery.TimestreamQuery
    def TimestreamQuery(): services.timestreamquery.TimestreamQuery = new services.timestreamquery.TimestreamQuery()
    def TimestreamQuery(config: AWSConfig): services.timestreamquery.TimestreamQuery = new services.timestreamquery.TimestreamQuery(config)

    type TimestreamWrite = services.timestreamwrite.TimestreamWrite
    def TimestreamWrite(): services.timestreamwrite.TimestreamWrite = new services.timestreamwrite.TimestreamWrite()
    def TimestreamWrite(config: AWSConfig): services.timestreamwrite.TimestreamWrite = new services.timestreamwrite.TimestreamWrite(config)

    type TranscribeService = services.transcribeservice.TranscribeService
    def TranscribeService(): services.transcribeservice.TranscribeService = new services.transcribeservice.TranscribeService()
    def TranscribeService(config: AWSConfig): services.transcribeservice.TranscribeService = new services.transcribeservice.TranscribeService(config)

    type Transfer = services.transfer.Transfer
    def Transfer(): services.transfer.Transfer = new services.transfer.Transfer()
    def Transfer(config: AWSConfig): services.transfer.Transfer = new services.transfer.Transfer(config)

    type Translate = services.translate.Translate
    def Translate(): services.translate.Translate = new services.translate.Translate()
    def Translate(config: AWSConfig): services.translate.Translate = new services.translate.Translate(config)

    type VoiceID = services.voiceid.VoiceID
    def VoiceID(): services.voiceid.VoiceID = new services.voiceid.VoiceID()
    def VoiceID(config: AWSConfig): services.voiceid.VoiceID = new services.voiceid.VoiceID(config)

    type WAF = services.waf.WAF
    def WAF(): services.waf.WAF = new services.waf.WAF()
    def WAF(config: AWSConfig): services.waf.WAF = new services.waf.WAF(config)

    type WAFRegional = services.wafregional.WAFRegional
    def WAFRegional(): services.wafregional.WAFRegional = new services.wafregional.WAFRegional()
    def WAFRegional(config: AWSConfig): services.wafregional.WAFRegional = new services.wafregional.WAFRegional(config)

    type WAFv2 = services.wafv2.WAFv2
    def WAFv2(): services.wafv2.WAFv2 = new services.wafv2.WAFv2()
    def WAFv2(config: AWSConfig): services.wafv2.WAFv2 = new services.wafv2.WAFv2(config)

    type WellArchitected = services.wellarchitected.WellArchitected
    def WellArchitected(): services.wellarchitected.WellArchitected = new services.wellarchitected.WellArchitected()
    def WellArchitected(config: AWSConfig): services.wellarchitected.WellArchitected = new services.wellarchitected.WellArchitected(config)

    type Wisdom = services.wisdom.Wisdom
    def Wisdom(): services.wisdom.Wisdom = new services.wisdom.Wisdom()
    def Wisdom(config: AWSConfig): services.wisdom.Wisdom = new services.wisdom.Wisdom(config)

    type WorkDocs = services.workdocs.WorkDocs
    def WorkDocs(): services.workdocs.WorkDocs = new services.workdocs.WorkDocs()
    def WorkDocs(config: AWSConfig): services.workdocs.WorkDocs = new services.workdocs.WorkDocs(config)

    type WorkLink = services.worklink.WorkLink
    def WorkLink(): services.worklink.WorkLink = new services.worklink.WorkLink()
    def WorkLink(config: AWSConfig): services.worklink.WorkLink = new services.worklink.WorkLink(config)

    type WorkMail = services.workmail.WorkMail
    def WorkMail(): services.workmail.WorkMail = new services.workmail.WorkMail()
    def WorkMail(config: AWSConfig): services.workmail.WorkMail = new services.workmail.WorkMail(config)

    type WorkMailMessageFlow = services.workmailmessageflow.WorkMailMessageFlow
    def WorkMailMessageFlow(): services.workmailmessageflow.WorkMailMessageFlow = new services.workmailmessageflow.WorkMailMessageFlow()
    def WorkMailMessageFlow(config: AWSConfig): services.workmailmessageflow.WorkMailMessageFlow = new services.workmailmessageflow.WorkMailMessageFlow(config)

    type WorkSpaces = services.workspaces.WorkSpaces
    def WorkSpaces(): services.workspaces.WorkSpaces = new services.workspaces.WorkSpaces()
    def WorkSpaces(config: AWSConfig): services.workspaces.WorkSpaces = new services.workspaces.WorkSpaces(config)

    type WorkSpacesWeb = services.workspacesweb.WorkSpacesWeb
    def WorkSpacesWeb(): services.workspacesweb.WorkSpacesWeb = new services.workspacesweb.WorkSpacesWeb()
    def WorkSpacesWeb(config: AWSConfig): services.workspacesweb.WorkSpacesWeb = new services.workspacesweb.WorkSpacesWeb(config)

    type XRay = services.xray.XRay
    def XRay(): services.xray.XRay = new services.xray.XRay()
    def XRay(config: AWSConfig): services.xray.XRay = new services.xray.XRay(config)

  }
}
