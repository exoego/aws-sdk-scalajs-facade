package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object amplify {
  type AccessToken                      = String
  type ActiveJobId                      = String
  type AppArn                           = String
  type AppId                            = String
  type Apps                             = js.Array[App]
  type ArtifactsUrl                     = String
  type AssociatedResource               = String
  type AssociatedResources              = js.Array[AssociatedResource]
  type AutoBranchCreationPattern        = String
  type AutoBranchCreationPatterns       = js.Array[AutoBranchCreationPattern]
  type BasicAuthCredentials             = String
  type BranchArn                        = String
  type BranchName                       = String
  type Branches                         = js.Array[Branch]
  type BuildSpec                        = String
  type CertificateVerificationDNSRecord = String
  type CommitId                         = String
  type CommitMessage                    = String
  type CommitTime                       = js.Date
  type Condition                        = String
  type Context                          = String
  type CreateTime                       = js.Date
  type CustomDomain                     = String
  type CustomDomains                    = js.Array[CustomDomain]
  type CustomRules                      = js.Array[CustomRule]
  type DNSRecord                        = String
  type DefaultDomain                    = String
  type Description                      = String
  type DisplayName                      = String
  type DomainAssociationArn             = String
  type DomainAssociations               = js.Array[DomainAssociation]
  type DomainName                       = String
  type DomainPrefix                     = String
  type DomainStatus                     = String
  type EnableAutoBranchCreation         = Boolean
  type EnableAutoBuild                  = Boolean
  type EnableAutoSubDomain              = Boolean
  type EnableBasicAuth                  = Boolean
  type EnableBranchAutoBuild            = Boolean
  type EnableNotification               = Boolean
  type EndTime                          = js.Date
  type EnvKey                           = String
  type EnvValue                         = String
  type EnvironmentVariables             = js.Dictionary[EnvValue]
  type FileMap                          = js.Dictionary[MD5Hash]
  type FileName                         = String
  type FileUploadUrls                   = js.Dictionary[UploadUrl]
  type Framework                        = String
  type JobArn                           = String
  type JobId                            = String
  type JobReason                        = String
  type JobStatus                        = String
  type JobSummaries                     = js.Array[JobSummary]
  type JobType                          = String
  type LastDeployTime                   = js.Date
  type LogUrl                           = String
  type MD5Hash                          = String
  type MaxResults                       = Int
  type Name                             = String
  type NextToken                        = String
  type OauthToken                       = String
  type Platform                         = String
  type Repository                       = String
  type ResourceArn                      = String
  type Screenshots                      = js.Dictionary[ThumbnailUrl]
  type ServiceRoleArn                   = String
  type Source                           = String
  type SourceUrl                        = String
  type Stage                            = String
  type StartTime                        = js.Date
  type Status                           = String
  type StatusReason                     = String
  type StepName                         = String
  type Steps                            = js.Array[Step]
  type SubDomainSettings                = js.Array[SubDomainSetting]
  type SubDomains                       = js.Array[SubDomain]
  type TTL                              = String
  type TagKey                           = String
  type TagKeyList                       = js.Array[TagKey]
  type TagMap                           = js.Dictionary[TagValue]
  type TagValue                         = String
  type Target                           = String
  type ThumbnailName                    = String
  type ThumbnailUrl                     = String
  type TotalNumberOfJobs                = String
  type UpdateTime                       = js.Date
  type UploadUrl                        = String
  type Verified                         = Boolean
  type WebhookArn                       = String
  type WebhookId                        = String
  type WebhookUrl                       = String
  type Webhooks                         = js.Array[Webhook]

  implicit final class AmplifyOps(private val service: Amplify) extends AnyVal {

    def createAppFuture(params: CreateAppRequest): Future[CreateAppResult] = service.createApp(params).promise.toFuture
    def createBranchFuture(params: CreateBranchRequest): Future[CreateBranchResult] =
      service.createBranch(params).promise.toFuture
    def createDeploymentFuture(params: CreateDeploymentRequest): Future[CreateDeploymentResult] =
      service.createDeployment(params).promise.toFuture
    def createDomainAssociationFuture(params: CreateDomainAssociationRequest): Future[CreateDomainAssociationResult] =
      service.createDomainAssociation(params).promise.toFuture
    def createWebhookFuture(params: CreateWebhookRequest): Future[CreateWebhookResult] =
      service.createWebhook(params).promise.toFuture
    def deleteAppFuture(params: DeleteAppRequest): Future[DeleteAppResult] = service.deleteApp(params).promise.toFuture
    def deleteBranchFuture(params: DeleteBranchRequest): Future[DeleteBranchResult] =
      service.deleteBranch(params).promise.toFuture
    def deleteDomainAssociationFuture(params: DeleteDomainAssociationRequest): Future[DeleteDomainAssociationResult] =
      service.deleteDomainAssociation(params).promise.toFuture
    def deleteJobFuture(params: DeleteJobRequest): Future[DeleteJobResult] = service.deleteJob(params).promise.toFuture
    def deleteWebhookFuture(params: DeleteWebhookRequest): Future[DeleteWebhookResult] =
      service.deleteWebhook(params).promise.toFuture
    def getAppFuture(params: GetAppRequest): Future[GetAppResult]          = service.getApp(params).promise.toFuture
    def getBranchFuture(params: GetBranchRequest): Future[GetBranchResult] = service.getBranch(params).promise.toFuture
    def getDomainAssociationFuture(params: GetDomainAssociationRequest): Future[GetDomainAssociationResult] =
      service.getDomainAssociation(params).promise.toFuture
    def getJobFuture(params: GetJobRequest): Future[GetJobResult] = service.getJob(params).promise.toFuture
    def getWebhookFuture(params: GetWebhookRequest): Future[GetWebhookResult] =
      service.getWebhook(params).promise.toFuture
    def listAppsFuture(params: ListAppsRequest): Future[ListAppsResult] = service.listApps(params).promise.toFuture
    def listBranchesFuture(params: ListBranchesRequest): Future[ListBranchesResult] =
      service.listBranches(params).promise.toFuture
    def listDomainAssociationsFuture(params: ListDomainAssociationsRequest): Future[ListDomainAssociationsResult] =
      service.listDomainAssociations(params).promise.toFuture
    def listJobsFuture(params: ListJobsRequest): Future[ListJobsResult] = service.listJobs(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    def listWebhooksFuture(params: ListWebhooksRequest): Future[ListWebhooksResult] =
      service.listWebhooks(params).promise.toFuture
    def startDeploymentFuture(params: StartDeploymentRequest): Future[StartDeploymentResult] =
      service.startDeployment(params).promise.toFuture
    def startJobFuture(params: StartJobRequest): Future[StartJobResult] = service.startJob(params).promise.toFuture
    def stopJobFuture(params: StopJobRequest): Future[StopJobResult]    = service.stopJob(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise.toFuture
    def updateAppFuture(params: UpdateAppRequest): Future[UpdateAppResult] = service.updateApp(params).promise.toFuture
    def updateBranchFuture(params: UpdateBranchRequest): Future[UpdateBranchResult] =
      service.updateBranch(params).promise.toFuture
    def updateDomainAssociationFuture(params: UpdateDomainAssociationRequest): Future[UpdateDomainAssociationResult] =
      service.updateDomainAssociation(params).promise.toFuture
    def updateWebhookFuture(params: UpdateWebhookRequest): Future[UpdateWebhookResult] =
      service.updateWebhook(params).promise.toFuture
  }
}

package amplify {
  @js.native
  @JSImport("aws-sdk", "Amplify")
  class Amplify() extends js.Object {
    def this(config: AWSConfig) = this()

    def createApp(params: CreateAppRequest): Request[CreateAppResult]                      = js.native
    def createBranch(params: CreateBranchRequest): Request[CreateBranchResult]             = js.native
    def createDeployment(params: CreateDeploymentRequest): Request[CreateDeploymentResult] = js.native
    def createDomainAssociation(params: CreateDomainAssociationRequest): Request[CreateDomainAssociationResult] =
      js.native
    def createWebhook(params: CreateWebhookRequest): Request[CreateWebhookResult] = js.native
    def deleteApp(params: DeleteAppRequest): Request[DeleteAppResult]             = js.native
    def deleteBranch(params: DeleteBranchRequest): Request[DeleteBranchResult]    = js.native
    def deleteDomainAssociation(params: DeleteDomainAssociationRequest): Request[DeleteDomainAssociationResult] =
      js.native
    def deleteJob(params: DeleteJobRequest): Request[DeleteJobResult]                                        = js.native
    def deleteWebhook(params: DeleteWebhookRequest): Request[DeleteWebhookResult]                            = js.native
    def getApp(params: GetAppRequest): Request[GetAppResult]                                                 = js.native
    def getBranch(params: GetBranchRequest): Request[GetBranchResult]                                        = js.native
    def getDomainAssociation(params: GetDomainAssociationRequest): Request[GetDomainAssociationResult]       = js.native
    def getJob(params: GetJobRequest): Request[GetJobResult]                                                 = js.native
    def getWebhook(params: GetWebhookRequest): Request[GetWebhookResult]                                     = js.native
    def listApps(params: ListAppsRequest): Request[ListAppsResult]                                           = js.native
    def listBranches(params: ListBranchesRequest): Request[ListBranchesResult]                               = js.native
    def listDomainAssociations(params: ListDomainAssociationsRequest): Request[ListDomainAssociationsResult] = js.native
    def listJobs(params: ListJobsRequest): Request[ListJobsResult]                                           = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse]        = js.native
    def listWebhooks(params: ListWebhooksRequest): Request[ListWebhooksResult]                               = js.native
    def startDeployment(params: StartDeploymentRequest): Request[StartDeploymentResult]                      = js.native
    def startJob(params: StartJobRequest): Request[StartJobResult]                                           = js.native
    def stopJob(params: StopJobRequest): Request[StopJobResult]                                              = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                                = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                          = js.native
    def updateApp(params: UpdateAppRequest): Request[UpdateAppResult]                                        = js.native
    def updateBranch(params: UpdateBranchRequest): Request[UpdateBranchResult]                               = js.native
    def updateDomainAssociation(params: UpdateDomainAssociationRequest): Request[UpdateDomainAssociationResult] =
      js.native
    def updateWebhook(params: UpdateWebhookRequest): Request[UpdateWebhookResult] = js.native
  }

  /**
    * Amplify App represents different branches of a repository for building, deploying, and hosting.
    */
  @js.native
  trait App extends js.Object {
    var appArn: AppArn
    var appId: AppId
    var createTime: CreateTime
    var defaultDomain: DefaultDomain
    var description: Description
    var enableBasicAuth: EnableBasicAuth
    var enableBranchAutoBuild: EnableBranchAutoBuild
    var environmentVariables: EnvironmentVariables
    var name: Name
    var platform: Platform
    var repository: Repository
    var updateTime: UpdateTime
    var autoBranchCreationConfig: js.UndefOr[AutoBranchCreationConfig]
    var autoBranchCreationPatterns: js.UndefOr[AutoBranchCreationPatterns]
    var basicAuthCredentials: js.UndefOr[BasicAuthCredentials]
    var buildSpec: js.UndefOr[BuildSpec]
    var customRules: js.UndefOr[CustomRules]
    var enableAutoBranchCreation: js.UndefOr[EnableAutoBranchCreation]
    var iamServiceRoleArn: js.UndefOr[ServiceRoleArn]
    var productionBranch: js.UndefOr[ProductionBranch]
    var tags: js.UndefOr[TagMap]
  }

  object App {
    def apply(
        appArn: AppArn,
        appId: AppId,
        createTime: CreateTime,
        defaultDomain: DefaultDomain,
        description: Description,
        enableBasicAuth: EnableBasicAuth,
        enableBranchAutoBuild: EnableBranchAutoBuild,
        environmentVariables: EnvironmentVariables,
        name: Name,
        platform: Platform,
        repository: Repository,
        updateTime: UpdateTime,
        autoBranchCreationConfig: js.UndefOr[AutoBranchCreationConfig] = js.undefined,
        autoBranchCreationPatterns: js.UndefOr[AutoBranchCreationPatterns] = js.undefined,
        basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined,
        buildSpec: js.UndefOr[BuildSpec] = js.undefined,
        customRules: js.UndefOr[CustomRules] = js.undefined,
        enableAutoBranchCreation: js.UndefOr[EnableAutoBranchCreation] = js.undefined,
        iamServiceRoleArn: js.UndefOr[ServiceRoleArn] = js.undefined,
        productionBranch: js.UndefOr[ProductionBranch] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): App = {
      val __obj = js.Dictionary[js.Any](
        "appArn"                -> appArn.asInstanceOf[js.Any],
        "appId"                 -> appId.asInstanceOf[js.Any],
        "createTime"            -> createTime.asInstanceOf[js.Any],
        "defaultDomain"         -> defaultDomain.asInstanceOf[js.Any],
        "description"           -> description.asInstanceOf[js.Any],
        "enableBasicAuth"       -> enableBasicAuth.asInstanceOf[js.Any],
        "enableBranchAutoBuild" -> enableBranchAutoBuild.asInstanceOf[js.Any],
        "environmentVariables"  -> environmentVariables.asInstanceOf[js.Any],
        "name"                  -> name.asInstanceOf[js.Any],
        "platform"              -> platform.asInstanceOf[js.Any],
        "repository"            -> repository.asInstanceOf[js.Any],
        "updateTime"            -> updateTime.asInstanceOf[js.Any]
      )

      autoBranchCreationConfig.foreach(__v => __obj.update("autoBranchCreationConfig", __v.asInstanceOf[js.Any]))
      autoBranchCreationPatterns.foreach(__v => __obj.update("autoBranchCreationPatterns", __v.asInstanceOf[js.Any]))
      basicAuthCredentials.foreach(__v => __obj.update("basicAuthCredentials", __v.asInstanceOf[js.Any]))
      buildSpec.foreach(__v => __obj.update("buildSpec", __v.asInstanceOf[js.Any]))
      customRules.foreach(__v => __obj.update("customRules", __v.asInstanceOf[js.Any]))
      enableAutoBranchCreation.foreach(__v => __obj.update("enableAutoBranchCreation", __v.asInstanceOf[js.Any]))
      iamServiceRoleArn.foreach(__v => __obj.update("iamServiceRoleArn", __v.asInstanceOf[js.Any]))
      productionBranch.foreach(__v => __obj.update("productionBranch", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[App]
    }
  }

  /**
    * Structure with auto branch creation config.
    */
  @js.native
  trait AutoBranchCreationConfig extends js.Object {
    var basicAuthCredentials: js.UndefOr[BasicAuthCredentials]
    var buildSpec: js.UndefOr[BuildSpec]
    var enableAutoBuild: js.UndefOr[EnableAutoBuild]
    var enableBasicAuth: js.UndefOr[EnableBasicAuth]
    var environmentVariables: js.UndefOr[EnvironmentVariables]
    var framework: js.UndefOr[Framework]
    var stage: js.UndefOr[Stage]
  }

  object AutoBranchCreationConfig {
    def apply(
        basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined,
        buildSpec: js.UndefOr[BuildSpec] = js.undefined,
        enableAutoBuild: js.UndefOr[EnableAutoBuild] = js.undefined,
        enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined,
        environmentVariables: js.UndefOr[EnvironmentVariables] = js.undefined,
        framework: js.UndefOr[Framework] = js.undefined,
        stage: js.UndefOr[Stage] = js.undefined
    ): AutoBranchCreationConfig = {
      val __obj = js.Dictionary.empty[js.Any]
      basicAuthCredentials.foreach(__v => __obj.update("basicAuthCredentials", __v.asInstanceOf[js.Any]))
      buildSpec.foreach(__v => __obj.update("buildSpec", __v.asInstanceOf[js.Any]))
      enableAutoBuild.foreach(__v => __obj.update("enableAutoBuild", __v.asInstanceOf[js.Any]))
      enableBasicAuth.foreach(__v => __obj.update("enableBasicAuth", __v.asInstanceOf[js.Any]))
      environmentVariables.foreach(__v => __obj.update("environmentVariables", __v.asInstanceOf[js.Any]))
      framework.foreach(__v => __obj.update("framework", __v.asInstanceOf[js.Any]))
      stage.foreach(__v => __obj.update("stage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoBranchCreationConfig]
    }
  }

  /**
    * Branch for an Amplify App, which maps to a 3rd party repository branch.
    */
  @js.native
  trait Branch extends js.Object {
    var activeJobId: ActiveJobId
    var branchArn: BranchArn
    var branchName: BranchName
    var createTime: CreateTime
    var customDomains: CustomDomains
    var description: Description
    var displayName: DisplayName
    var enableAutoBuild: EnableAutoBuild
    var enableBasicAuth: EnableBasicAuth
    var enableNotification: EnableNotification
    var environmentVariables: EnvironmentVariables
    var framework: Framework
    var stage: Stage
    var totalNumberOfJobs: TotalNumberOfJobs
    var ttl: TTL
    var updateTime: UpdateTime
    var associatedResources: js.UndefOr[AssociatedResources]
    var basicAuthCredentials: js.UndefOr[BasicAuthCredentials]
    var buildSpec: js.UndefOr[BuildSpec]
    var tags: js.UndefOr[TagMap]
    var thumbnailUrl: js.UndefOr[ThumbnailUrl]
  }

  object Branch {
    def apply(
        activeJobId: ActiveJobId,
        branchArn: BranchArn,
        branchName: BranchName,
        createTime: CreateTime,
        customDomains: CustomDomains,
        description: Description,
        displayName: DisplayName,
        enableAutoBuild: EnableAutoBuild,
        enableBasicAuth: EnableBasicAuth,
        enableNotification: EnableNotification,
        environmentVariables: EnvironmentVariables,
        framework: Framework,
        stage: Stage,
        totalNumberOfJobs: TotalNumberOfJobs,
        ttl: TTL,
        updateTime: UpdateTime,
        associatedResources: js.UndefOr[AssociatedResources] = js.undefined,
        basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined,
        buildSpec: js.UndefOr[BuildSpec] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        thumbnailUrl: js.UndefOr[ThumbnailUrl] = js.undefined
    ): Branch = {
      val __obj = js.Dictionary[js.Any](
        "activeJobId"          -> activeJobId.asInstanceOf[js.Any],
        "branchArn"            -> branchArn.asInstanceOf[js.Any],
        "branchName"           -> branchName.asInstanceOf[js.Any],
        "createTime"           -> createTime.asInstanceOf[js.Any],
        "customDomains"        -> customDomains.asInstanceOf[js.Any],
        "description"          -> description.asInstanceOf[js.Any],
        "displayName"          -> displayName.asInstanceOf[js.Any],
        "enableAutoBuild"      -> enableAutoBuild.asInstanceOf[js.Any],
        "enableBasicAuth"      -> enableBasicAuth.asInstanceOf[js.Any],
        "enableNotification"   -> enableNotification.asInstanceOf[js.Any],
        "environmentVariables" -> environmentVariables.asInstanceOf[js.Any],
        "framework"            -> framework.asInstanceOf[js.Any],
        "stage"                -> stage.asInstanceOf[js.Any],
        "totalNumberOfJobs"    -> totalNumberOfJobs.asInstanceOf[js.Any],
        "ttl"                  -> ttl.asInstanceOf[js.Any],
        "updateTime"           -> updateTime.asInstanceOf[js.Any]
      )

      associatedResources.foreach(__v => __obj.update("associatedResources", __v.asInstanceOf[js.Any]))
      basicAuthCredentials.foreach(__v => __obj.update("basicAuthCredentials", __v.asInstanceOf[js.Any]))
      buildSpec.foreach(__v => __obj.update("buildSpec", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      thumbnailUrl.foreach(__v => __obj.update("thumbnailUrl", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Branch]
    }
  }

  /**
    * Request structure used to create Apps in Amplify.
    */
  @js.native
  trait CreateAppRequest extends js.Object {
    var name: Name
    var accessToken: js.UndefOr[AccessToken]
    var autoBranchCreationConfig: js.UndefOr[AutoBranchCreationConfig]
    var autoBranchCreationPatterns: js.UndefOr[AutoBranchCreationPatterns]
    var basicAuthCredentials: js.UndefOr[BasicAuthCredentials]
    var buildSpec: js.UndefOr[BuildSpec]
    var customRules: js.UndefOr[CustomRules]
    var description: js.UndefOr[Description]
    var enableAutoBranchCreation: js.UndefOr[EnableAutoBranchCreation]
    var enableBasicAuth: js.UndefOr[EnableBasicAuth]
    var enableBranchAutoBuild: js.UndefOr[EnableBranchAutoBuild]
    var environmentVariables: js.UndefOr[EnvironmentVariables]
    var iamServiceRoleArn: js.UndefOr[ServiceRoleArn]
    var oauthToken: js.UndefOr[OauthToken]
    var platform: js.UndefOr[Platform]
    var repository: js.UndefOr[Repository]
    var tags: js.UndefOr[TagMap]
  }

  object CreateAppRequest {
    def apply(
        name: Name,
        accessToken: js.UndefOr[AccessToken] = js.undefined,
        autoBranchCreationConfig: js.UndefOr[AutoBranchCreationConfig] = js.undefined,
        autoBranchCreationPatterns: js.UndefOr[AutoBranchCreationPatterns] = js.undefined,
        basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined,
        buildSpec: js.UndefOr[BuildSpec] = js.undefined,
        customRules: js.UndefOr[CustomRules] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        enableAutoBranchCreation: js.UndefOr[EnableAutoBranchCreation] = js.undefined,
        enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined,
        enableBranchAutoBuild: js.UndefOr[EnableBranchAutoBuild] = js.undefined,
        environmentVariables: js.UndefOr[EnvironmentVariables] = js.undefined,
        iamServiceRoleArn: js.UndefOr[ServiceRoleArn] = js.undefined,
        oauthToken: js.UndefOr[OauthToken] = js.undefined,
        platform: js.UndefOr[Platform] = js.undefined,
        repository: js.UndefOr[Repository] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined
    ): CreateAppRequest = {
      val __obj = js.Dictionary[js.Any](
        "name" -> name.asInstanceOf[js.Any]
      )

      accessToken.foreach(__v => __obj.update("accessToken", __v.asInstanceOf[js.Any]))
      autoBranchCreationConfig.foreach(__v => __obj.update("autoBranchCreationConfig", __v.asInstanceOf[js.Any]))
      autoBranchCreationPatterns.foreach(__v => __obj.update("autoBranchCreationPatterns", __v.asInstanceOf[js.Any]))
      basicAuthCredentials.foreach(__v => __obj.update("basicAuthCredentials", __v.asInstanceOf[js.Any]))
      buildSpec.foreach(__v => __obj.update("buildSpec", __v.asInstanceOf[js.Any]))
      customRules.foreach(__v => __obj.update("customRules", __v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      enableAutoBranchCreation.foreach(__v => __obj.update("enableAutoBranchCreation", __v.asInstanceOf[js.Any]))
      enableBasicAuth.foreach(__v => __obj.update("enableBasicAuth", __v.asInstanceOf[js.Any]))
      enableBranchAutoBuild.foreach(__v => __obj.update("enableBranchAutoBuild", __v.asInstanceOf[js.Any]))
      environmentVariables.foreach(__v => __obj.update("environmentVariables", __v.asInstanceOf[js.Any]))
      iamServiceRoleArn.foreach(__v => __obj.update("iamServiceRoleArn", __v.asInstanceOf[js.Any]))
      oauthToken.foreach(__v => __obj.update("oauthToken", __v.asInstanceOf[js.Any]))
      platform.foreach(__v => __obj.update("platform", __v.asInstanceOf[js.Any]))
      repository.foreach(__v => __obj.update("repository", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAppRequest]
    }
  }

  @js.native
  trait CreateAppResult extends js.Object {
    var app: App
  }

  object CreateAppResult {
    def apply(
        app: App
    ): CreateAppResult = {
      val __obj = js.Dictionary[js.Any](
        "app" -> app.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateAppResult]
    }
  }

  /**
    * Request structure for a branch create request.
    */
  @js.native
  trait CreateBranchRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
    var basicAuthCredentials: js.UndefOr[BasicAuthCredentials]
    var buildSpec: js.UndefOr[BuildSpec]
    var description: js.UndefOr[Description]
    var displayName: js.UndefOr[DisplayName]
    var enableAutoBuild: js.UndefOr[EnableAutoBuild]
    var enableBasicAuth: js.UndefOr[EnableBasicAuth]
    var enableNotification: js.UndefOr[EnableNotification]
    var environmentVariables: js.UndefOr[EnvironmentVariables]
    var framework: js.UndefOr[Framework]
    var stage: js.UndefOr[Stage]
    var tags: js.UndefOr[TagMap]
    var ttl: js.UndefOr[TTL]
  }

  object CreateBranchRequest {
    def apply(
        appId: AppId,
        branchName: BranchName,
        basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined,
        buildSpec: js.UndefOr[BuildSpec] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        displayName: js.UndefOr[DisplayName] = js.undefined,
        enableAutoBuild: js.UndefOr[EnableAutoBuild] = js.undefined,
        enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined,
        enableNotification: js.UndefOr[EnableNotification] = js.undefined,
        environmentVariables: js.UndefOr[EnvironmentVariables] = js.undefined,
        framework: js.UndefOr[Framework] = js.undefined,
        stage: js.UndefOr[Stage] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        ttl: js.UndefOr[TTL] = js.undefined
    ): CreateBranchRequest = {
      val __obj = js.Dictionary[js.Any](
        "appId"      -> appId.asInstanceOf[js.Any],
        "branchName" -> branchName.asInstanceOf[js.Any]
      )

      basicAuthCredentials.foreach(__v => __obj.update("basicAuthCredentials", __v.asInstanceOf[js.Any]))
      buildSpec.foreach(__v => __obj.update("buildSpec", __v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      displayName.foreach(__v => __obj.update("displayName", __v.asInstanceOf[js.Any]))
      enableAutoBuild.foreach(__v => __obj.update("enableAutoBuild", __v.asInstanceOf[js.Any]))
      enableBasicAuth.foreach(__v => __obj.update("enableBasicAuth", __v.asInstanceOf[js.Any]))
      enableNotification.foreach(__v => __obj.update("enableNotification", __v.asInstanceOf[js.Any]))
      environmentVariables.foreach(__v => __obj.update("environmentVariables", __v.asInstanceOf[js.Any]))
      framework.foreach(__v => __obj.update("framework", __v.asInstanceOf[js.Any]))
      stage.foreach(__v => __obj.update("stage", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      ttl.foreach(__v => __obj.update("ttl", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBranchRequest]
    }
  }

  /**
    * Result structure for create branch request.
    */
  @js.native
  trait CreateBranchResult extends js.Object {
    var branch: Branch
  }

  object CreateBranchResult {
    def apply(
        branch: Branch
    ): CreateBranchResult = {
      val __obj = js.Dictionary[js.Any](
        "branch" -> branch.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateBranchResult]
    }
  }

  /**
    * Request structure for create a new deployment.
    */
  @js.native
  trait CreateDeploymentRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
    var fileMap: js.UndefOr[FileMap]
  }

  object CreateDeploymentRequest {
    def apply(
        appId: AppId,
        branchName: BranchName,
        fileMap: js.UndefOr[FileMap] = js.undefined
    ): CreateDeploymentRequest = {
      val __obj = js.Dictionary[js.Any](
        "appId"      -> appId.asInstanceOf[js.Any],
        "branchName" -> branchName.asInstanceOf[js.Any]
      )

      fileMap.foreach(__v => __obj.update("fileMap", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeploymentRequest]
    }
  }

  /**
    * Result structure for create a new deployment.
    */
  @js.native
  trait CreateDeploymentResult extends js.Object {
    var fileUploadUrls: FileUploadUrls
    var zipUploadUrl: UploadUrl
    var jobId: js.UndefOr[JobId]
  }

  object CreateDeploymentResult {
    def apply(
        fileUploadUrls: FileUploadUrls,
        zipUploadUrl: UploadUrl,
        jobId: js.UndefOr[JobId] = js.undefined
    ): CreateDeploymentResult = {
      val __obj = js.Dictionary[js.Any](
        "fileUploadUrls" -> fileUploadUrls.asInstanceOf[js.Any],
        "zipUploadUrl"   -> zipUploadUrl.asInstanceOf[js.Any]
      )

      jobId.foreach(__v => __obj.update("jobId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeploymentResult]
    }
  }

  /**
    * Request structure for create Domain Association request.
    */
  @js.native
  trait CreateDomainAssociationRequest extends js.Object {
    var appId: AppId
    var domainName: DomainName
    var subDomainSettings: SubDomainSettings
    var enableAutoSubDomain: js.UndefOr[EnableAutoSubDomain]
  }

  object CreateDomainAssociationRequest {
    def apply(
        appId: AppId,
        domainName: DomainName,
        subDomainSettings: SubDomainSettings,
        enableAutoSubDomain: js.UndefOr[EnableAutoSubDomain] = js.undefined
    ): CreateDomainAssociationRequest = {
      val __obj = js.Dictionary[js.Any](
        "appId"             -> appId.asInstanceOf[js.Any],
        "domainName"        -> domainName.asInstanceOf[js.Any],
        "subDomainSettings" -> subDomainSettings.asInstanceOf[js.Any]
      )

      enableAutoSubDomain.foreach(__v => __obj.update("enableAutoSubDomain", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDomainAssociationRequest]
    }
  }

  /**
    * Result structure for the create Domain Association request.
    */
  @js.native
  trait CreateDomainAssociationResult extends js.Object {
    var domainAssociation: DomainAssociation
  }

  object CreateDomainAssociationResult {
    def apply(
        domainAssociation: DomainAssociation
    ): CreateDomainAssociationResult = {
      val __obj = js.Dictionary[js.Any](
        "domainAssociation" -> domainAssociation.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateDomainAssociationResult]
    }
  }

  /**
    * Request structure for create webhook request.
    */
  @js.native
  trait CreateWebhookRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
    var description: js.UndefOr[Description]
  }

  object CreateWebhookRequest {
    def apply(
        appId: AppId,
        branchName: BranchName,
        description: js.UndefOr[Description] = js.undefined
    ): CreateWebhookRequest = {
      val __obj = js.Dictionary[js.Any](
        "appId"      -> appId.asInstanceOf[js.Any],
        "branchName" -> branchName.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWebhookRequest]
    }
  }

  /**
    * Result structure for the create webhook request.
    */
  @js.native
  trait CreateWebhookResult extends js.Object {
    var webhook: Webhook
  }

  object CreateWebhookResult {
    def apply(
        webhook: Webhook
    ): CreateWebhookResult = {
      val __obj = js.Dictionary[js.Any](
        "webhook" -> webhook.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateWebhookResult]
    }
  }

  /**
    * Custom rewrite / redirect rule.
    */
  @js.native
  trait CustomRule extends js.Object {
    var source: Source
    var target: Target
    var condition: js.UndefOr[Condition]
    var status: js.UndefOr[Status]
  }

  object CustomRule {
    def apply(
        source: Source,
        target: Target,
        condition: js.UndefOr[Condition] = js.undefined,
        status: js.UndefOr[Status] = js.undefined
    ): CustomRule = {
      val __obj = js.Dictionary[js.Any](
        "source" -> source.asInstanceOf[js.Any],
        "target" -> target.asInstanceOf[js.Any]
      )

      condition.foreach(__v => __obj.update("condition", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomRule]
    }
  }

  /**
    * Request structure for an Amplify App delete request.
    */
  @js.native
  trait DeleteAppRequest extends js.Object {
    var appId: AppId
  }

  object DeleteAppRequest {
    def apply(
        appId: AppId
    ): DeleteAppRequest = {
      val __obj = js.Dictionary[js.Any](
        "appId" -> appId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteAppRequest]
    }
  }

  /**
    * Result structure for an Amplify App delete request.
    */
  @js.native
  trait DeleteAppResult extends js.Object {
    var app: App
  }

  object DeleteAppResult {
    def apply(
        app: App
    ): DeleteAppResult = {
      val __obj = js.Dictionary[js.Any](
        "app" -> app.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteAppResult]
    }
  }

  /**
    * Request structure for delete branch request.
    */
  @js.native
  trait DeleteBranchRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
  }

  object DeleteBranchRequest {
    def apply(
        appId: AppId,
        branchName: BranchName
    ): DeleteBranchRequest = {
      val __obj = js.Dictionary[js.Any](
        "appId"      -> appId.asInstanceOf[js.Any],
        "branchName" -> branchName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteBranchRequest]
    }
  }

  /**
    * Result structure for delete branch request.
    */
  @js.native
  trait DeleteBranchResult extends js.Object {
    var branch: Branch
  }

  object DeleteBranchResult {
    def apply(
        branch: Branch
    ): DeleteBranchResult = {
      val __obj = js.Dictionary[js.Any](
        "branch" -> branch.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteBranchResult]
    }
  }

  /**
    * Request structure for the delete Domain Association request.
    */
  @js.native
  trait DeleteDomainAssociationRequest extends js.Object {
    var appId: AppId
    var domainName: DomainName
  }

  object DeleteDomainAssociationRequest {
    def apply(
        appId: AppId,
        domainName: DomainName
    ): DeleteDomainAssociationRequest = {
      val __obj = js.Dictionary[js.Any](
        "appId"      -> appId.asInstanceOf[js.Any],
        "domainName" -> domainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDomainAssociationRequest]
    }
  }

  @js.native
  trait DeleteDomainAssociationResult extends js.Object {
    var domainAssociation: DomainAssociation
  }

  object DeleteDomainAssociationResult {
    def apply(
        domainAssociation: DomainAssociation
    ): DeleteDomainAssociationResult = {
      val __obj = js.Dictionary[js.Any](
        "domainAssociation" -> domainAssociation.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDomainAssociationResult]
    }
  }

  /**
    * Request structure for delete job request.
    */
  @js.native
  trait DeleteJobRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
    var jobId: JobId
  }

  object DeleteJobRequest {
    def apply(
        appId: AppId,
        branchName: BranchName,
        jobId: JobId
    ): DeleteJobRequest = {
      val __obj = js.Dictionary[js.Any](
        "appId"      -> appId.asInstanceOf[js.Any],
        "branchName" -> branchName.asInstanceOf[js.Any],
        "jobId"      -> jobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteJobRequest]
    }
  }

  /**
    * Result structure for the delete job request.
    */
  @js.native
  trait DeleteJobResult extends js.Object {
    var jobSummary: JobSummary
  }

  object DeleteJobResult {
    def apply(
        jobSummary: JobSummary
    ): DeleteJobResult = {
      val __obj = js.Dictionary[js.Any](
        "jobSummary" -> jobSummary.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteJobResult]
    }
  }

  /**
    * Request structure for the delete webhook request.
    */
  @js.native
  trait DeleteWebhookRequest extends js.Object {
    var webhookId: WebhookId
  }

  object DeleteWebhookRequest {
    def apply(
        webhookId: WebhookId
    ): DeleteWebhookRequest = {
      val __obj = js.Dictionary[js.Any](
        "webhookId" -> webhookId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteWebhookRequest]
    }
  }

  /**
    * Result structure for the delete webhook request.
    */
  @js.native
  trait DeleteWebhookResult extends js.Object {
    var webhook: Webhook
  }

  object DeleteWebhookResult {
    def apply(
        webhook: Webhook
    ): DeleteWebhookResult = {
      val __obj = js.Dictionary[js.Any](
        "webhook" -> webhook.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteWebhookResult]
    }
  }

  /**
    * Structure for Domain Association, which associates a custom domain with an Amplify App.
    */
  @js.native
  trait DomainAssociation extends js.Object {
    var domainAssociationArn: DomainAssociationArn
    var domainName: DomainName
    var domainStatus: DomainStatus
    var enableAutoSubDomain: EnableAutoSubDomain
    var statusReason: StatusReason
    var subDomains: SubDomains
    var certificateVerificationDNSRecord: js.UndefOr[CertificateVerificationDNSRecord]
  }

  object DomainAssociation {
    def apply(
        domainAssociationArn: DomainAssociationArn,
        domainName: DomainName,
        domainStatus: DomainStatus,
        enableAutoSubDomain: EnableAutoSubDomain,
        statusReason: StatusReason,
        subDomains: SubDomains,
        certificateVerificationDNSRecord: js.UndefOr[CertificateVerificationDNSRecord] = js.undefined
    ): DomainAssociation = {
      val __obj = js.Dictionary[js.Any](
        "domainAssociationArn" -> domainAssociationArn.asInstanceOf[js.Any],
        "domainName"           -> domainName.asInstanceOf[js.Any],
        "domainStatus"         -> domainStatus.asInstanceOf[js.Any],
        "enableAutoSubDomain"  -> enableAutoSubDomain.asInstanceOf[js.Any],
        "statusReason"         -> statusReason.asInstanceOf[js.Any],
        "subDomains"           -> subDomains.asInstanceOf[js.Any]
      )

      certificateVerificationDNSRecord.foreach(
        __v => __obj.update("certificateVerificationDNSRecord", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[DomainAssociation]
    }
  }

  object DomainStatusEnum {
    val PENDING_VERIFICATION   = "PENDING_VERIFICATION"
    val IN_PROGRESS            = "IN_PROGRESS"
    val AVAILABLE              = "AVAILABLE"
    val PENDING_DEPLOYMENT     = "PENDING_DEPLOYMENT"
    val FAILED                 = "FAILED"
    val CREATING               = "CREATING"
    val REQUESTING_CERTIFICATE = "REQUESTING_CERTIFICATE"
    val UPDATING               = "UPDATING"

    val values = js.Object.freeze(
      js.Array(
        PENDING_VERIFICATION,
        IN_PROGRESS,
        AVAILABLE,
        PENDING_DEPLOYMENT,
        FAILED,
        CREATING,
        REQUESTING_CERTIFICATE,
        UPDATING
      )
    )
  }

  /**
    * Request structure for get App request.
    */
  @js.native
  trait GetAppRequest extends js.Object {
    var appId: AppId
  }

  object GetAppRequest {
    def apply(
        appId: AppId
    ): GetAppRequest = {
      val __obj = js.Dictionary[js.Any](
        "appId" -> appId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetAppRequest]
    }
  }

  @js.native
  trait GetAppResult extends js.Object {
    var app: App
  }

  object GetAppResult {
    def apply(
        app: App
    ): GetAppResult = {
      val __obj = js.Dictionary[js.Any](
        "app" -> app.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetAppResult]
    }
  }

  /**
    * Result structure for get branch request.
    */
  @js.native
  trait GetBranchRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
  }

  object GetBranchRequest {
    def apply(
        appId: AppId,
        branchName: BranchName
    ): GetBranchRequest = {
      val __obj = js.Dictionary[js.Any](
        "appId"      -> appId.asInstanceOf[js.Any],
        "branchName" -> branchName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBranchRequest]
    }
  }

  @js.native
  trait GetBranchResult extends js.Object {
    var branch: Branch
  }

  object GetBranchResult {
    def apply(
        branch: Branch
    ): GetBranchResult = {
      val __obj = js.Dictionary[js.Any](
        "branch" -> branch.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBranchResult]
    }
  }

  /**
    * Request structure for the get Domain Association request.
    */
  @js.native
  trait GetDomainAssociationRequest extends js.Object {
    var appId: AppId
    var domainName: DomainName
  }

  object GetDomainAssociationRequest {
    def apply(
        appId: AppId,
        domainName: DomainName
    ): GetDomainAssociationRequest = {
      val __obj = js.Dictionary[js.Any](
        "appId"      -> appId.asInstanceOf[js.Any],
        "domainName" -> domainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDomainAssociationRequest]
    }
  }

  /**
    * Result structure for the get Domain Association request.
    */
  @js.native
  trait GetDomainAssociationResult extends js.Object {
    var domainAssociation: DomainAssociation
  }

  object GetDomainAssociationResult {
    def apply(
        domainAssociation: DomainAssociation
    ): GetDomainAssociationResult = {
      val __obj = js.Dictionary[js.Any](
        "domainAssociation" -> domainAssociation.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDomainAssociationResult]
    }
  }

  /**
    * Request structure for get job request.
    */
  @js.native
  trait GetJobRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
    var jobId: JobId
  }

  object GetJobRequest {
    def apply(
        appId: AppId,
        branchName: BranchName,
        jobId: JobId
    ): GetJobRequest = {
      val __obj = js.Dictionary[js.Any](
        "appId"      -> appId.asInstanceOf[js.Any],
        "branchName" -> branchName.asInstanceOf[js.Any],
        "jobId"      -> jobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetJobRequest]
    }
  }

  @js.native
  trait GetJobResult extends js.Object {
    var job: Job
  }

  object GetJobResult {
    def apply(
        job: Job
    ): GetJobResult = {
      val __obj = js.Dictionary[js.Any](
        "job" -> job.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetJobResult]
    }
  }

  /**
    * Request structure for the get webhook request.
    */
  @js.native
  trait GetWebhookRequest extends js.Object {
    var webhookId: WebhookId
  }

  object GetWebhookRequest {
    def apply(
        webhookId: WebhookId
    ): GetWebhookRequest = {
      val __obj = js.Dictionary[js.Any](
        "webhookId" -> webhookId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetWebhookRequest]
    }
  }

  /**
    * Result structure for the get webhook request.
    */
  @js.native
  trait GetWebhookResult extends js.Object {
    var webhook: Webhook
  }

  object GetWebhookResult {
    def apply(
        webhook: Webhook
    ): GetWebhookResult = {
      val __obj = js.Dictionary[js.Any](
        "webhook" -> webhook.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetWebhookResult]
    }
  }

  /**
    * Structure for an execution job for an Amplify App.
    */
  @js.native
  trait Job extends js.Object {
    var steps: Steps
    var summary: JobSummary
  }

  object Job {
    def apply(
        steps: Steps,
        summary: JobSummary
    ): Job = {
      val __obj = js.Dictionary[js.Any](
        "steps"   -> steps.asInstanceOf[js.Any],
        "summary" -> summary.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Job]
    }
  }

  object JobStatusEnum {
    val PENDING      = "PENDING"
    val PROVISIONING = "PROVISIONING"
    val RUNNING      = "RUNNING"
    val FAILED       = "FAILED"
    val SUCCEED      = "SUCCEED"
    val CANCELLING   = "CANCELLING"
    val CANCELLED    = "CANCELLED"

    val values = js.Object.freeze(js.Array(PENDING, PROVISIONING, RUNNING, FAILED, SUCCEED, CANCELLING, CANCELLED))
  }

  /**
    * Structure for the summary of a Job.
    */
  @js.native
  trait JobSummary extends js.Object {
    var commitId: CommitId
    var commitMessage: CommitMessage
    var commitTime: CommitTime
    var jobArn: JobArn
    var jobId: JobId
    var jobType: JobType
    var startTime: StartTime
    var status: JobStatus
    var endTime: js.UndefOr[EndTime]
  }

  object JobSummary {
    def apply(
        commitId: CommitId,
        commitMessage: CommitMessage,
        commitTime: CommitTime,
        jobArn: JobArn,
        jobId: JobId,
        jobType: JobType,
        startTime: StartTime,
        status: JobStatus,
        endTime: js.UndefOr[EndTime] = js.undefined
    ): JobSummary = {
      val __obj = js.Dictionary[js.Any](
        "commitId"      -> commitId.asInstanceOf[js.Any],
        "commitMessage" -> commitMessage.asInstanceOf[js.Any],
        "commitTime"    -> commitTime.asInstanceOf[js.Any],
        "jobArn"        -> jobArn.asInstanceOf[js.Any],
        "jobId"         -> jobId.asInstanceOf[js.Any],
        "jobType"       -> jobType.asInstanceOf[js.Any],
        "startTime"     -> startTime.asInstanceOf[js.Any],
        "status"        -> status.asInstanceOf[js.Any]
      )

      endTime.foreach(__v => __obj.update("endTime", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JobSummary]
    }
  }

  object JobTypeEnum {
    val RELEASE  = "RELEASE"
    val RETRY    = "RETRY"
    val MANUAL   = "MANUAL"
    val WEB_HOOK = "WEB_HOOK"

    val values = js.Object.freeze(js.Array(RELEASE, RETRY, MANUAL, WEB_HOOK))
  }

  /**
    * Request structure for an Amplify App list request.
    */
  @js.native
  trait ListAppsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAppsRequest {
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppsRequest]
    }
  }

  /**
    * Result structure for an Amplify App list request.
    */
  @js.native
  trait ListAppsResult extends js.Object {
    var apps: Apps
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAppsResult {
    def apply(
        apps: Apps,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListAppsResult = {
      val __obj = js.Dictionary[js.Any](
        "apps" -> apps.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAppsResult]
    }
  }

  /**
    * Request structure for list branches request.
    */
  @js.native
  trait ListBranchesRequest extends js.Object {
    var appId: AppId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListBranchesRequest {
    def apply(
        appId: AppId,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListBranchesRequest = {
      val __obj = js.Dictionary[js.Any](
        "appId" -> appId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBranchesRequest]
    }
  }

  /**
    * Result structure for list branches request.
    */
  @js.native
  trait ListBranchesResult extends js.Object {
    var branches: Branches
    var nextToken: js.UndefOr[NextToken]
  }

  object ListBranchesResult {
    def apply(
        branches: Branches,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListBranchesResult = {
      val __obj = js.Dictionary[js.Any](
        "branches" -> branches.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBranchesResult]
    }
  }

  /**
    * Request structure for the list Domain Associations request.
    */
  @js.native
  trait ListDomainAssociationsRequest extends js.Object {
    var appId: AppId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDomainAssociationsRequest {
    def apply(
        appId: AppId,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDomainAssociationsRequest = {
      val __obj = js.Dictionary[js.Any](
        "appId" -> appId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDomainAssociationsRequest]
    }
  }

  /**
    * Result structure for the list Domain Association request.
    */
  @js.native
  trait ListDomainAssociationsResult extends js.Object {
    var domainAssociations: DomainAssociations
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDomainAssociationsResult {
    def apply(
        domainAssociations: DomainAssociations,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDomainAssociationsResult = {
      val __obj = js.Dictionary[js.Any](
        "domainAssociations" -> domainAssociations.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDomainAssociationsResult]
    }
  }

  /**
    * Request structure for list job request.
    */
  @js.native
  trait ListJobsRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListJobsRequest {
    def apply(
        appId: AppId,
        branchName: BranchName,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListJobsRequest = {
      val __obj = js.Dictionary[js.Any](
        "appId"      -> appId.asInstanceOf[js.Any],
        "branchName" -> branchName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsRequest]
    }
  }

  /**
    * Maximum number of records to list in a single response.
    */
  @js.native
  trait ListJobsResult extends js.Object {
    var jobSummaries: JobSummaries
    var nextToken: js.UndefOr[NextToken]
  }

  object ListJobsResult {
    def apply(
        jobSummaries: JobSummaries,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListJobsResult = {
      val __obj = js.Dictionary[js.Any](
        "jobSummaries" -> jobSummaries.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListJobsResult]
    }
  }

  /**
    * Request structure used to list tags for resource.
    */
  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: ResourceArn
  }

  object ListTagsForResourceRequest {
    def apply(
        resourceArn: ResourceArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  /**
    * Response for list tags.
    */
  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    def apply(
        tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /**
    * Request structure for the list webhooks request.
    */
  @js.native
  trait ListWebhooksRequest extends js.Object {
    var appId: AppId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListWebhooksRequest {
    def apply(
        appId: AppId,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListWebhooksRequest = {
      val __obj = js.Dictionary[js.Any](
        "appId" -> appId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWebhooksRequest]
    }
  }

  /**
    * Result structure for the list webhooks request.
    */
  @js.native
  trait ListWebhooksResult extends js.Object {
    var webhooks: Webhooks
    var nextToken: js.UndefOr[NextToken]
  }

  object ListWebhooksResult {
    def apply(
        webhooks: Webhooks,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListWebhooksResult = {
      val __obj = js.Dictionary[js.Any](
        "webhooks" -> webhooks.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWebhooksResult]
    }
  }

  object PlatformEnum {
    val WEB = "WEB"

    val values = js.Object.freeze(js.Array(WEB))
  }

  /**
    * Structure with Production Branch information.
    */
  @js.native
  trait ProductionBranch extends js.Object {
    var branchName: js.UndefOr[BranchName]
    var lastDeployTime: js.UndefOr[LastDeployTime]
    var status: js.UndefOr[Status]
    var thumbnailUrl: js.UndefOr[ThumbnailUrl]
  }

  object ProductionBranch {
    def apply(
        branchName: js.UndefOr[BranchName] = js.undefined,
        lastDeployTime: js.UndefOr[LastDeployTime] = js.undefined,
        status: js.UndefOr[Status] = js.undefined,
        thumbnailUrl: js.UndefOr[ThumbnailUrl] = js.undefined
    ): ProductionBranch = {
      val __obj = js.Dictionary.empty[js.Any]
      branchName.foreach(__v => __obj.update("branchName", __v.asInstanceOf[js.Any]))
      lastDeployTime.foreach(__v => __obj.update("lastDeployTime", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      thumbnailUrl.foreach(__v => __obj.update("thumbnailUrl", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProductionBranch]
    }
  }

  object StageEnum {
    val PRODUCTION   = "PRODUCTION"
    val BETA         = "BETA"
    val DEVELOPMENT  = "DEVELOPMENT"
    val EXPERIMENTAL = "EXPERIMENTAL"

    val values = js.Object.freeze(js.Array(PRODUCTION, BETA, DEVELOPMENT, EXPERIMENTAL))
  }

  /**
    * Request structure for start a deployment.
    */
  @js.native
  trait StartDeploymentRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
    var jobId: js.UndefOr[JobId]
    var sourceUrl: js.UndefOr[SourceUrl]
  }

  object StartDeploymentRequest {
    def apply(
        appId: AppId,
        branchName: BranchName,
        jobId: js.UndefOr[JobId] = js.undefined,
        sourceUrl: js.UndefOr[SourceUrl] = js.undefined
    ): StartDeploymentRequest = {
      val __obj = js.Dictionary[js.Any](
        "appId"      -> appId.asInstanceOf[js.Any],
        "branchName" -> branchName.asInstanceOf[js.Any]
      )

      jobId.foreach(__v => __obj.update("jobId", __v.asInstanceOf[js.Any]))
      sourceUrl.foreach(__v => __obj.update("sourceUrl", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartDeploymentRequest]
    }
  }

  /**
    * Result structure for start a deployment.
    */
  @js.native
  trait StartDeploymentResult extends js.Object {
    var jobSummary: JobSummary
  }

  object StartDeploymentResult {
    def apply(
        jobSummary: JobSummary
    ): StartDeploymentResult = {
      val __obj = js.Dictionary[js.Any](
        "jobSummary" -> jobSummary.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartDeploymentResult]
    }
  }

  /**
    * Request structure for Start job request.
    */
  @js.native
  trait StartJobRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
    var jobType: JobType
    var commitId: js.UndefOr[CommitId]
    var commitMessage: js.UndefOr[CommitMessage]
    var commitTime: js.UndefOr[CommitTime]
    var jobId: js.UndefOr[JobId]
    var jobReason: js.UndefOr[JobReason]
  }

  object StartJobRequest {
    def apply(
        appId: AppId,
        branchName: BranchName,
        jobType: JobType,
        commitId: js.UndefOr[CommitId] = js.undefined,
        commitMessage: js.UndefOr[CommitMessage] = js.undefined,
        commitTime: js.UndefOr[CommitTime] = js.undefined,
        jobId: js.UndefOr[JobId] = js.undefined,
        jobReason: js.UndefOr[JobReason] = js.undefined
    ): StartJobRequest = {
      val __obj = js.Dictionary[js.Any](
        "appId"      -> appId.asInstanceOf[js.Any],
        "branchName" -> branchName.asInstanceOf[js.Any],
        "jobType"    -> jobType.asInstanceOf[js.Any]
      )

      commitId.foreach(__v => __obj.update("commitId", __v.asInstanceOf[js.Any]))
      commitMessage.foreach(__v => __obj.update("commitMessage", __v.asInstanceOf[js.Any]))
      commitTime.foreach(__v => __obj.update("commitTime", __v.asInstanceOf[js.Any]))
      jobId.foreach(__v => __obj.update("jobId", __v.asInstanceOf[js.Any]))
      jobReason.foreach(__v => __obj.update("jobReason", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartJobRequest]
    }
  }

  /**
    * Result structure for run job request.
    */
  @js.native
  trait StartJobResult extends js.Object {
    var jobSummary: JobSummary
  }

  object StartJobResult {
    def apply(
        jobSummary: JobSummary
    ): StartJobResult = {
      val __obj = js.Dictionary[js.Any](
        "jobSummary" -> jobSummary.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartJobResult]
    }
  }

  /**
    * Structure for an execution step for an execution job, for an Amplify App.
    */
  @js.native
  trait Step extends js.Object {
    var endTime: EndTime
    var startTime: StartTime
    var status: JobStatus
    var stepName: StepName
    var artifactsUrl: js.UndefOr[ArtifactsUrl]
    var context: js.UndefOr[Context]
    var logUrl: js.UndefOr[LogUrl]
    var screenshots: js.UndefOr[Screenshots]
    var statusReason: js.UndefOr[StatusReason]
  }

  object Step {
    def apply(
        endTime: EndTime,
        startTime: StartTime,
        status: JobStatus,
        stepName: StepName,
        artifactsUrl: js.UndefOr[ArtifactsUrl] = js.undefined,
        context: js.UndefOr[Context] = js.undefined,
        logUrl: js.UndefOr[LogUrl] = js.undefined,
        screenshots: js.UndefOr[Screenshots] = js.undefined,
        statusReason: js.UndefOr[StatusReason] = js.undefined
    ): Step = {
      val __obj = js.Dictionary[js.Any](
        "endTime"   -> endTime.asInstanceOf[js.Any],
        "startTime" -> startTime.asInstanceOf[js.Any],
        "status"    -> status.asInstanceOf[js.Any],
        "stepName"  -> stepName.asInstanceOf[js.Any]
      )

      artifactsUrl.foreach(__v => __obj.update("artifactsUrl", __v.asInstanceOf[js.Any]))
      context.foreach(__v => __obj.update("context", __v.asInstanceOf[js.Any]))
      logUrl.foreach(__v => __obj.update("logUrl", __v.asInstanceOf[js.Any]))
      screenshots.foreach(__v => __obj.update("screenshots", __v.asInstanceOf[js.Any]))
      statusReason.foreach(__v => __obj.update("statusReason", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Step]
    }
  }

  /**
    * Request structure for stop job request.
    */
  @js.native
  trait StopJobRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
    var jobId: JobId
  }

  object StopJobRequest {
    def apply(
        appId: AppId,
        branchName: BranchName,
        jobId: JobId
    ): StopJobRequest = {
      val __obj = js.Dictionary[js.Any](
        "appId"      -> appId.asInstanceOf[js.Any],
        "branchName" -> branchName.asInstanceOf[js.Any],
        "jobId"      -> jobId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopJobRequest]
    }
  }

  /**
    * Result structure for the stop job request.
    */
  @js.native
  trait StopJobResult extends js.Object {
    var jobSummary: JobSummary
  }

  object StopJobResult {
    def apply(
        jobSummary: JobSummary
    ): StopJobResult = {
      val __obj = js.Dictionary[js.Any](
        "jobSummary" -> jobSummary.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopJobResult]
    }
  }

  /**
    * Subdomain for the Domain Association.
    */
  @js.native
  trait SubDomain extends js.Object {
    var dnsRecord: DNSRecord
    var subDomainSetting: SubDomainSetting
    var verified: Verified
  }

  object SubDomain {
    def apply(
        dnsRecord: DNSRecord,
        subDomainSetting: SubDomainSetting,
        verified: Verified
    ): SubDomain = {
      val __obj = js.Dictionary[js.Any](
        "dnsRecord"        -> dnsRecord.asInstanceOf[js.Any],
        "subDomainSetting" -> subDomainSetting.asInstanceOf[js.Any],
        "verified"         -> verified.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SubDomain]
    }
  }

  /**
    * Setting for the Subdomain.
    */
  @js.native
  trait SubDomainSetting extends js.Object {
    var branchName: BranchName
    var prefix: DomainPrefix
  }

  object SubDomainSetting {
    def apply(
        branchName: BranchName,
        prefix: DomainPrefix
    ): SubDomainSetting = {
      val __obj = js.Dictionary[js.Any](
        "branchName" -> branchName.asInstanceOf[js.Any],
        "prefix"     -> prefix.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SubDomainSetting]
    }
  }

  /**
    * Request structure used to tag resource.
    */
  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tags: TagMap
  }

  object TagResourceRequest {
    def apply(
        resourceArn: ResourceArn,
        tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags"        -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  /**
    * Response for tag resource.
    */
  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    def apply(
        ): TagResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /**
    * Request structure used to untag resource.
    */
  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    def apply(
        resourceArn: ResourceArn,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys"     -> tagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  /**
    * Response for untag resource.
    */
  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    def apply(
        ): UntagResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  /**
    * Request structure for update App request.
    */
  @js.native
  trait UpdateAppRequest extends js.Object {
    var appId: AppId
    var autoBranchCreationConfig: js.UndefOr[AutoBranchCreationConfig]
    var autoBranchCreationPatterns: js.UndefOr[AutoBranchCreationPatterns]
    var basicAuthCredentials: js.UndefOr[BasicAuthCredentials]
    var buildSpec: js.UndefOr[BuildSpec]
    var customRules: js.UndefOr[CustomRules]
    var description: js.UndefOr[Description]
    var enableAutoBranchCreation: js.UndefOr[EnableAutoBranchCreation]
    var enableBasicAuth: js.UndefOr[EnableBasicAuth]
    var enableBranchAutoBuild: js.UndefOr[EnableAutoBuild]
    var environmentVariables: js.UndefOr[EnvironmentVariables]
    var iamServiceRoleArn: js.UndefOr[ServiceRoleArn]
    var name: js.UndefOr[Name]
    var platform: js.UndefOr[Platform]
  }

  object UpdateAppRequest {
    def apply(
        appId: AppId,
        autoBranchCreationConfig: js.UndefOr[AutoBranchCreationConfig] = js.undefined,
        autoBranchCreationPatterns: js.UndefOr[AutoBranchCreationPatterns] = js.undefined,
        basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined,
        buildSpec: js.UndefOr[BuildSpec] = js.undefined,
        customRules: js.UndefOr[CustomRules] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        enableAutoBranchCreation: js.UndefOr[EnableAutoBranchCreation] = js.undefined,
        enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined,
        enableBranchAutoBuild: js.UndefOr[EnableAutoBuild] = js.undefined,
        environmentVariables: js.UndefOr[EnvironmentVariables] = js.undefined,
        iamServiceRoleArn: js.UndefOr[ServiceRoleArn] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        platform: js.UndefOr[Platform] = js.undefined
    ): UpdateAppRequest = {
      val __obj = js.Dictionary[js.Any](
        "appId" -> appId.asInstanceOf[js.Any]
      )

      autoBranchCreationConfig.foreach(__v => __obj.update("autoBranchCreationConfig", __v.asInstanceOf[js.Any]))
      autoBranchCreationPatterns.foreach(__v => __obj.update("autoBranchCreationPatterns", __v.asInstanceOf[js.Any]))
      basicAuthCredentials.foreach(__v => __obj.update("basicAuthCredentials", __v.asInstanceOf[js.Any]))
      buildSpec.foreach(__v => __obj.update("buildSpec", __v.asInstanceOf[js.Any]))
      customRules.foreach(__v => __obj.update("customRules", __v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      enableAutoBranchCreation.foreach(__v => __obj.update("enableAutoBranchCreation", __v.asInstanceOf[js.Any]))
      enableBasicAuth.foreach(__v => __obj.update("enableBasicAuth", __v.asInstanceOf[js.Any]))
      enableBranchAutoBuild.foreach(__v => __obj.update("enableBranchAutoBuild", __v.asInstanceOf[js.Any]))
      environmentVariables.foreach(__v => __obj.update("environmentVariables", __v.asInstanceOf[js.Any]))
      iamServiceRoleArn.foreach(__v => __obj.update("iamServiceRoleArn", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      platform.foreach(__v => __obj.update("platform", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAppRequest]
    }
  }

  /**
    * Result structure for an Amplify App update request.
    */
  @js.native
  trait UpdateAppResult extends js.Object {
    var app: App
  }

  object UpdateAppResult {
    def apply(
        app: App
    ): UpdateAppResult = {
      val __obj = js.Dictionary[js.Any](
        "app" -> app.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateAppResult]
    }
  }

  /**
    * Request structure for update branch request.
    */
  @js.native
  trait UpdateBranchRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
    var basicAuthCredentials: js.UndefOr[BasicAuthCredentials]
    var buildSpec: js.UndefOr[BuildSpec]
    var description: js.UndefOr[Description]
    var displayName: js.UndefOr[DisplayName]
    var enableAutoBuild: js.UndefOr[EnableAutoBuild]
    var enableBasicAuth: js.UndefOr[EnableBasicAuth]
    var enableNotification: js.UndefOr[EnableNotification]
    var environmentVariables: js.UndefOr[EnvironmentVariables]
    var framework: js.UndefOr[Framework]
    var stage: js.UndefOr[Stage]
    var ttl: js.UndefOr[TTL]
  }

  object UpdateBranchRequest {
    def apply(
        appId: AppId,
        branchName: BranchName,
        basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined,
        buildSpec: js.UndefOr[BuildSpec] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        displayName: js.UndefOr[DisplayName] = js.undefined,
        enableAutoBuild: js.UndefOr[EnableAutoBuild] = js.undefined,
        enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined,
        enableNotification: js.UndefOr[EnableNotification] = js.undefined,
        environmentVariables: js.UndefOr[EnvironmentVariables] = js.undefined,
        framework: js.UndefOr[Framework] = js.undefined,
        stage: js.UndefOr[Stage] = js.undefined,
        ttl: js.UndefOr[TTL] = js.undefined
    ): UpdateBranchRequest = {
      val __obj = js.Dictionary[js.Any](
        "appId"      -> appId.asInstanceOf[js.Any],
        "branchName" -> branchName.asInstanceOf[js.Any]
      )

      basicAuthCredentials.foreach(__v => __obj.update("basicAuthCredentials", __v.asInstanceOf[js.Any]))
      buildSpec.foreach(__v => __obj.update("buildSpec", __v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      displayName.foreach(__v => __obj.update("displayName", __v.asInstanceOf[js.Any]))
      enableAutoBuild.foreach(__v => __obj.update("enableAutoBuild", __v.asInstanceOf[js.Any]))
      enableBasicAuth.foreach(__v => __obj.update("enableBasicAuth", __v.asInstanceOf[js.Any]))
      enableNotification.foreach(__v => __obj.update("enableNotification", __v.asInstanceOf[js.Any]))
      environmentVariables.foreach(__v => __obj.update("environmentVariables", __v.asInstanceOf[js.Any]))
      framework.foreach(__v => __obj.update("framework", __v.asInstanceOf[js.Any]))
      stage.foreach(__v => __obj.update("stage", __v.asInstanceOf[js.Any]))
      ttl.foreach(__v => __obj.update("ttl", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBranchRequest]
    }
  }

  /**
    * Result structure for update branch request.
    */
  @js.native
  trait UpdateBranchResult extends js.Object {
    var branch: Branch
  }

  object UpdateBranchResult {
    def apply(
        branch: Branch
    ): UpdateBranchResult = {
      val __obj = js.Dictionary[js.Any](
        "branch" -> branch.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateBranchResult]
    }
  }

  /**
    * Request structure for update Domain Association request.
    */
  @js.native
  trait UpdateDomainAssociationRequest extends js.Object {
    var appId: AppId
    var domainName: DomainName
    var subDomainSettings: SubDomainSettings
    var enableAutoSubDomain: js.UndefOr[EnableAutoSubDomain]
  }

  object UpdateDomainAssociationRequest {
    def apply(
        appId: AppId,
        domainName: DomainName,
        subDomainSettings: SubDomainSettings,
        enableAutoSubDomain: js.UndefOr[EnableAutoSubDomain] = js.undefined
    ): UpdateDomainAssociationRequest = {
      val __obj = js.Dictionary[js.Any](
        "appId"             -> appId.asInstanceOf[js.Any],
        "domainName"        -> domainName.asInstanceOf[js.Any],
        "subDomainSettings" -> subDomainSettings.asInstanceOf[js.Any]
      )

      enableAutoSubDomain.foreach(__v => __obj.update("enableAutoSubDomain", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDomainAssociationRequest]
    }
  }

  /**
    * Result structure for the update Domain Association request.
    */
  @js.native
  trait UpdateDomainAssociationResult extends js.Object {
    var domainAssociation: DomainAssociation
  }

  object UpdateDomainAssociationResult {
    def apply(
        domainAssociation: DomainAssociation
    ): UpdateDomainAssociationResult = {
      val __obj = js.Dictionary[js.Any](
        "domainAssociation" -> domainAssociation.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateDomainAssociationResult]
    }
  }

  /**
    * Request structure for update webhook request.
    */
  @js.native
  trait UpdateWebhookRequest extends js.Object {
    var webhookId: WebhookId
    var branchName: js.UndefOr[BranchName]
    var description: js.UndefOr[Description]
  }

  object UpdateWebhookRequest {
    def apply(
        webhookId: WebhookId,
        branchName: js.UndefOr[BranchName] = js.undefined,
        description: js.UndefOr[Description] = js.undefined
    ): UpdateWebhookRequest = {
      val __obj = js.Dictionary[js.Any](
        "webhookId" -> webhookId.asInstanceOf[js.Any]
      )

      branchName.foreach(__v => __obj.update("branchName", __v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWebhookRequest]
    }
  }

  /**
    * Result structure for the update webhook request.
    */
  @js.native
  trait UpdateWebhookResult extends js.Object {
    var webhook: Webhook
  }

  object UpdateWebhookResult {
    def apply(
        webhook: Webhook
    ): UpdateWebhookResult = {
      val __obj = js.Dictionary[js.Any](
        "webhook" -> webhook.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateWebhookResult]
    }
  }

  /**
    * Structure for webhook, which associates a webhook with an Amplify App.
    */
  @js.native
  trait Webhook extends js.Object {
    var branchName: BranchName
    var createTime: CreateTime
    var description: Description
    var updateTime: UpdateTime
    var webhookArn: WebhookArn
    var webhookId: WebhookId
    var webhookUrl: WebhookUrl
  }

  object Webhook {
    def apply(
        branchName: BranchName,
        createTime: CreateTime,
        description: Description,
        updateTime: UpdateTime,
        webhookArn: WebhookArn,
        webhookId: WebhookId,
        webhookUrl: WebhookUrl
    ): Webhook = {
      val __obj = js.Dictionary[js.Any](
        "branchName"  -> branchName.asInstanceOf[js.Any],
        "createTime"  -> createTime.asInstanceOf[js.Any],
        "description" -> description.asInstanceOf[js.Any],
        "updateTime"  -> updateTime.asInstanceOf[js.Any],
        "webhookArn"  -> webhookArn.asInstanceOf[js.Any],
        "webhookId"   -> webhookId.asInstanceOf[js.Any],
        "webhookUrl"  -> webhookUrl.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Webhook]
    }
  }
}
