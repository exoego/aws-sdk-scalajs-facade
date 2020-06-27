package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object amplify {
  type AccessToken                      = String
  type ActiveJobId                      = String
  type AppArn                           = String
  type AppId                            = String
  type Apps                             = js.Array[App]
  type ArtifactFileName                 = String
  type ArtifactId                       = String
  type ArtifactUrl                      = String
  type Artifacts                        = js.Array[Artifact]
  type ArtifactsUrl                     = String
  type AssociatedResource               = String
  type AssociatedResources              = js.Array[AssociatedResource]
  type AutoBranchCreationPattern        = String
  type AutoBranchCreationPatterns       = js.Array[AutoBranchCreationPattern]
  type BackendEnvironmentArn            = String
  type BackendEnvironments              = js.Array[BackendEnvironment]
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
  type DeploymentArtifacts              = String
  type Description                      = String
  type DisplayName                      = String
  type DomainAssociationArn             = String
  type DomainAssociations               = js.Array[DomainAssociation]
  type DomainName                       = String
  type DomainPrefix                     = String
  type EnableAutoBranchCreation         = Boolean
  type EnableAutoBuild                  = Boolean
  type EnableAutoSubDomain              = Boolean
  type EnableBasicAuth                  = Boolean
  type EnableBranchAutoBuild            = Boolean
  type EnableNotification               = Boolean
  type EnablePullRequestPreview         = Boolean
  type EndTime                          = js.Date
  type EnvKey                           = String
  type EnvValue                         = String
  type EnvironmentName                  = String
  type EnvironmentVariables             = js.Dictionary[EnvValue]
  type FileMap                          = js.Dictionary[MD5Hash]
  type FileName                         = String
  type FileUploadUrls                   = js.Dictionary[UploadUrl]
  type Framework                        = String
  type JobArn                           = String
  type JobId                            = String
  type JobReason                        = String
  type JobSummaries                     = js.Array[JobSummary]
  type LastDeployTime                   = js.Date
  type LogUrl                           = String
  type MD5Hash                          = String
  type MaxResults                       = Int
  type Name                             = String
  type NextToken                        = String
  type OauthToken                       = String
  type PullRequestEnvironmentName       = String
  type Repository                       = String
  type ResourceArn                      = String
  type Screenshots                      = js.Dictionary[ThumbnailUrl]
  type ServiceRoleArn                   = String
  type Source                           = String
  type SourceUrl                        = String
  type StackName                        = String
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
  type TestArtifactsUrl                 = String
  type TestConfigUrl                    = String
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

    @inline def createAppFuture(params: CreateAppRequest): Future[CreateAppResult] =
      service.createApp(params).promise().toFuture
    @inline def createBackendEnvironmentFuture(
        params: CreateBackendEnvironmentRequest
    ): Future[CreateBackendEnvironmentResult] = service.createBackendEnvironment(params).promise().toFuture
    @inline def createBranchFuture(params: CreateBranchRequest): Future[CreateBranchResult] =
      service.createBranch(params).promise().toFuture
    @inline def createDeploymentFuture(params: CreateDeploymentRequest): Future[CreateDeploymentResult] =
      service.createDeployment(params).promise().toFuture
    @inline def createDomainAssociationFuture(
        params: CreateDomainAssociationRequest
    ): Future[CreateDomainAssociationResult] = service.createDomainAssociation(params).promise().toFuture
    @inline def createWebhookFuture(params: CreateWebhookRequest): Future[CreateWebhookResult] =
      service.createWebhook(params).promise().toFuture
    @inline def deleteAppFuture(params: DeleteAppRequest): Future[DeleteAppResult] =
      service.deleteApp(params).promise().toFuture
    @inline def deleteBackendEnvironmentFuture(
        params: DeleteBackendEnvironmentRequest
    ): Future[DeleteBackendEnvironmentResult] = service.deleteBackendEnvironment(params).promise().toFuture
    @inline def deleteBranchFuture(params: DeleteBranchRequest): Future[DeleteBranchResult] =
      service.deleteBranch(params).promise().toFuture
    @inline def deleteDomainAssociationFuture(
        params: DeleteDomainAssociationRequest
    ): Future[DeleteDomainAssociationResult] = service.deleteDomainAssociation(params).promise().toFuture
    @inline def deleteJobFuture(params: DeleteJobRequest): Future[DeleteJobResult] =
      service.deleteJob(params).promise().toFuture
    @inline def deleteWebhookFuture(params: DeleteWebhookRequest): Future[DeleteWebhookResult] =
      service.deleteWebhook(params).promise().toFuture
    @inline def generateAccessLogsFuture(params: GenerateAccessLogsRequest): Future[GenerateAccessLogsResult] =
      service.generateAccessLogs(params).promise().toFuture
    @inline def getAppFuture(params: GetAppRequest): Future[GetAppResult] = service.getApp(params).promise().toFuture
    @inline def getArtifactUrlFuture(params: GetArtifactUrlRequest): Future[GetArtifactUrlResult] =
      service.getArtifactUrl(params).promise().toFuture
    @inline def getBackendEnvironmentFuture(params: GetBackendEnvironmentRequest): Future[GetBackendEnvironmentResult] =
      service.getBackendEnvironment(params).promise().toFuture
    @inline def getBranchFuture(params: GetBranchRequest): Future[GetBranchResult] =
      service.getBranch(params).promise().toFuture
    @inline def getDomainAssociationFuture(params: GetDomainAssociationRequest): Future[GetDomainAssociationResult] =
      service.getDomainAssociation(params).promise().toFuture
    @inline def getJobFuture(params: GetJobRequest): Future[GetJobResult] = service.getJob(params).promise().toFuture
    @inline def getWebhookFuture(params: GetWebhookRequest): Future[GetWebhookResult] =
      service.getWebhook(params).promise().toFuture
    @inline def listAppsFuture(params: ListAppsRequest): Future[ListAppsResult] =
      service.listApps(params).promise().toFuture
    @inline def listArtifactsFuture(params: ListArtifactsRequest): Future[ListArtifactsResult] =
      service.listArtifacts(params).promise().toFuture
    @inline def listBackendEnvironmentsFuture(
        params: ListBackendEnvironmentsRequest
    ): Future[ListBackendEnvironmentsResult] = service.listBackendEnvironments(params).promise().toFuture
    @inline def listBranchesFuture(params: ListBranchesRequest): Future[ListBranchesResult] =
      service.listBranches(params).promise().toFuture
    @inline def listDomainAssociationsFuture(
        params: ListDomainAssociationsRequest
    ): Future[ListDomainAssociationsResult] = service.listDomainAssociations(params).promise().toFuture
    @inline def listJobsFuture(params: ListJobsRequest): Future[ListJobsResult] =
      service.listJobs(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def listWebhooksFuture(params: ListWebhooksRequest): Future[ListWebhooksResult] =
      service.listWebhooks(params).promise().toFuture
    @inline def startDeploymentFuture(params: StartDeploymentRequest): Future[StartDeploymentResult] =
      service.startDeployment(params).promise().toFuture
    @inline def startJobFuture(params: StartJobRequest): Future[StartJobResult] =
      service.startJob(params).promise().toFuture
    @inline def stopJobFuture(params: StopJobRequest): Future[StopJobResult] =
      service.stopJob(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateAppFuture(params: UpdateAppRequest): Future[UpdateAppResult] =
      service.updateApp(params).promise().toFuture
    @inline def updateBranchFuture(params: UpdateBranchRequest): Future[UpdateBranchResult] =
      service.updateBranch(params).promise().toFuture
    @inline def updateDomainAssociationFuture(
        params: UpdateDomainAssociationRequest
    ): Future[UpdateDomainAssociationResult] = service.updateDomainAssociation(params).promise().toFuture
    @inline def updateWebhookFuture(params: UpdateWebhookRequest): Future[UpdateWebhookResult] =
      service.updateWebhook(params).promise().toFuture
  }
}

package amplify {
  @js.native
  @JSImport("aws-sdk", "Amplify")
  class Amplify() extends js.Object {
    def this(config: AWSConfig) = this()

    def createApp(params: CreateAppRequest): Request[CreateAppResult] = js.native
    def createBackendEnvironment(params: CreateBackendEnvironmentRequest): Request[CreateBackendEnvironmentResult] =
      js.native
    def createBranch(params: CreateBranchRequest): Request[CreateBranchResult]             = js.native
    def createDeployment(params: CreateDeploymentRequest): Request[CreateDeploymentResult] = js.native
    def createDomainAssociation(params: CreateDomainAssociationRequest): Request[CreateDomainAssociationResult] =
      js.native
    def createWebhook(params: CreateWebhookRequest): Request[CreateWebhookResult] = js.native
    def deleteApp(params: DeleteAppRequest): Request[DeleteAppResult]             = js.native
    def deleteBackendEnvironment(params: DeleteBackendEnvironmentRequest): Request[DeleteBackendEnvironmentResult] =
      js.native
    def deleteBranch(params: DeleteBranchRequest): Request[DeleteBranchResult] = js.native
    def deleteDomainAssociation(params: DeleteDomainAssociationRequest): Request[DeleteDomainAssociationResult] =
      js.native
    def deleteJob(params: DeleteJobRequest): Request[DeleteJobResult]                                     = js.native
    def deleteWebhook(params: DeleteWebhookRequest): Request[DeleteWebhookResult]                         = js.native
    def generateAccessLogs(params: GenerateAccessLogsRequest): Request[GenerateAccessLogsResult]          = js.native
    def getApp(params: GetAppRequest): Request[GetAppResult]                                              = js.native
    def getArtifactUrl(params: GetArtifactUrlRequest): Request[GetArtifactUrlResult]                      = js.native
    def getBackendEnvironment(params: GetBackendEnvironmentRequest): Request[GetBackendEnvironmentResult] = js.native
    def getBranch(params: GetBranchRequest): Request[GetBranchResult]                                     = js.native
    def getDomainAssociation(params: GetDomainAssociationRequest): Request[GetDomainAssociationResult]    = js.native
    def getJob(params: GetJobRequest): Request[GetJobResult]                                              = js.native
    def getWebhook(params: GetWebhookRequest): Request[GetWebhookResult]                                  = js.native
    def listApps(params: ListAppsRequest): Request[ListAppsResult]                                        = js.native
    def listArtifacts(params: ListArtifactsRequest): Request[ListArtifactsResult]                         = js.native
    def listBackendEnvironments(params: ListBackendEnvironmentsRequest): Request[ListBackendEnvironmentsResult] =
      js.native
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
  @Factory
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

  /**
    * Structure for artifact.
    */
  @js.native
  @Factory
  trait Artifact extends js.Object {
    var artifactFileName: ArtifactFileName
    var artifactId: ArtifactId
  }

  /**
    * Structure with auto branch creation config.
    */
  @js.native
  @Factory
  trait AutoBranchCreationConfig extends js.Object {
    var basicAuthCredentials: js.UndefOr[BasicAuthCredentials]
    var buildSpec: js.UndefOr[BuildSpec]
    var enableAutoBuild: js.UndefOr[EnableAutoBuild]
    var enableBasicAuth: js.UndefOr[EnableBasicAuth]
    var enablePullRequestPreview: js.UndefOr[EnablePullRequestPreview]
    var environmentVariables: js.UndefOr[EnvironmentVariables]
    var framework: js.UndefOr[Framework]
    var pullRequestEnvironmentName: js.UndefOr[PullRequestEnvironmentName]
    var stage: js.UndefOr[Stage]
  }

  /**
    * Backend environment for an Amplify App.
    */
  @js.native
  @Factory
  trait BackendEnvironment extends js.Object {
    var backendEnvironmentArn: BackendEnvironmentArn
    var createTime: CreateTime
    var environmentName: EnvironmentName
    var updateTime: UpdateTime
    var deploymentArtifacts: js.UndefOr[DeploymentArtifacts]
    var stackName: js.UndefOr[StackName]
  }

  /**
    * Branch for an Amplify App, which maps to a 3rd party repository branch.
    */
  @js.native
  @Factory
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
    var enablePullRequestPreview: EnablePullRequestPreview
    var environmentVariables: EnvironmentVariables
    var framework: Framework
    var stage: Stage
    var totalNumberOfJobs: TotalNumberOfJobs
    var ttl: TTL
    var updateTime: UpdateTime
    var associatedResources: js.UndefOr[AssociatedResources]
    var backendEnvironmentArn: js.UndefOr[BackendEnvironmentArn]
    var basicAuthCredentials: js.UndefOr[BasicAuthCredentials]
    var buildSpec: js.UndefOr[BuildSpec]
    var destinationBranch: js.UndefOr[BranchName]
    var pullRequestEnvironmentName: js.UndefOr[PullRequestEnvironmentName]
    var sourceBranch: js.UndefOr[BranchName]
    var tags: js.UndefOr[TagMap]
    var thumbnailUrl: js.UndefOr[ThumbnailUrl]
  }

  /**
    * Request structure used to create Apps in Amplify.
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreateAppResult extends js.Object {
    var app: App
  }

  /**
    * Request structure for a backend environment create request.
    */
  @js.native
  @Factory
  trait CreateBackendEnvironmentRequest extends js.Object {
    var appId: AppId
    var environmentName: EnvironmentName
    var deploymentArtifacts: js.UndefOr[DeploymentArtifacts]
    var stackName: js.UndefOr[StackName]
  }

  /**
    * Result structure for create backend environment.
    */
  @js.native
  @Factory
  trait CreateBackendEnvironmentResult extends js.Object {
    var backendEnvironment: BackendEnvironment
  }

  /**
    * Request structure for a branch create request.
    */
  @js.native
  @Factory
  trait CreateBranchRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
    var backendEnvironmentArn: js.UndefOr[BackendEnvironmentArn]
    var basicAuthCredentials: js.UndefOr[BasicAuthCredentials]
    var buildSpec: js.UndefOr[BuildSpec]
    var description: js.UndefOr[Description]
    var displayName: js.UndefOr[DisplayName]
    var enableAutoBuild: js.UndefOr[EnableAutoBuild]
    var enableBasicAuth: js.UndefOr[EnableBasicAuth]
    var enableNotification: js.UndefOr[EnableNotification]
    var enablePullRequestPreview: js.UndefOr[EnablePullRequestPreview]
    var environmentVariables: js.UndefOr[EnvironmentVariables]
    var framework: js.UndefOr[Framework]
    var pullRequestEnvironmentName: js.UndefOr[PullRequestEnvironmentName]
    var stage: js.UndefOr[Stage]
    var tags: js.UndefOr[TagMap]
    var ttl: js.UndefOr[TTL]
  }

  /**
    * Result structure for create branch request.
    */
  @js.native
  @Factory
  trait CreateBranchResult extends js.Object {
    var branch: Branch
  }

  /**
    * Request structure for create a new deployment.
    */
  @js.native
  @Factory
  trait CreateDeploymentRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
    var fileMap: js.UndefOr[FileMap]
  }

  /**
    * Result structure for create a new deployment.
    */
  @js.native
  @Factory
  trait CreateDeploymentResult extends js.Object {
    var fileUploadUrls: FileUploadUrls
    var zipUploadUrl: UploadUrl
    var jobId: js.UndefOr[JobId]
  }

  /**
    * Request structure for create Domain Association request.
    */
  @js.native
  @Factory
  trait CreateDomainAssociationRequest extends js.Object {
    var appId: AppId
    var domainName: DomainName
    var subDomainSettings: SubDomainSettings
    var enableAutoSubDomain: js.UndefOr[EnableAutoSubDomain]
  }

  /**
    * Result structure for the create Domain Association request.
    */
  @js.native
  @Factory
  trait CreateDomainAssociationResult extends js.Object {
    var domainAssociation: DomainAssociation
  }

  /**
    * Request structure for create webhook request.
    */
  @js.native
  @Factory
  trait CreateWebhookRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
    var description: js.UndefOr[Description]
  }

  /**
    * Result structure for the create webhook request.
    */
  @js.native
  @Factory
  trait CreateWebhookResult extends js.Object {
    var webhook: Webhook
  }

  /**
    * Custom rewrite / redirect rule.
    */
  @js.native
  @Factory
  trait CustomRule extends js.Object {
    var source: Source
    var target: Target
    var condition: js.UndefOr[Condition]
    var status: js.UndefOr[Status]
  }

  /**
    * Request structure for an Amplify App delete request.
    */
  @js.native
  @Factory
  trait DeleteAppRequest extends js.Object {
    var appId: AppId
  }

  /**
    * Result structure for an Amplify App delete request.
    */
  @js.native
  @Factory
  trait DeleteAppResult extends js.Object {
    var app: App
  }

  /**
    * Request structure for delete backend environment request.
    */
  @js.native
  @Factory
  trait DeleteBackendEnvironmentRequest extends js.Object {
    var appId: AppId
    var environmentName: EnvironmentName
  }

  /**
    * Result structure of a delete backend environment result.
    */
  @js.native
  @Factory
  trait DeleteBackendEnvironmentResult extends js.Object {
    var backendEnvironment: BackendEnvironment
  }

  /**
    * Request structure for delete branch request.
    */
  @js.native
  @Factory
  trait DeleteBranchRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
  }

  /**
    * Result structure for delete branch request.
    */
  @js.native
  @Factory
  trait DeleteBranchResult extends js.Object {
    var branch: Branch
  }

  /**
    * Request structure for the delete Domain Association request.
    */
  @js.native
  @Factory
  trait DeleteDomainAssociationRequest extends js.Object {
    var appId: AppId
    var domainName: DomainName
  }

  @js.native
  @Factory
  trait DeleteDomainAssociationResult extends js.Object {
    var domainAssociation: DomainAssociation
  }

  /**
    * Request structure for delete job request.
    */
  @js.native
  @Factory
  trait DeleteJobRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
    var jobId: JobId
  }

  /**
    * Result structure for the delete job request.
    */
  @js.native
  @Factory
  trait DeleteJobResult extends js.Object {
    var jobSummary: JobSummary
  }

  /**
    * Request structure for the delete webhook request.
    */
  @js.native
  @Factory
  trait DeleteWebhookRequest extends js.Object {
    var webhookId: WebhookId
  }

  /**
    * Result structure for the delete webhook request.
    */
  @js.native
  @Factory
  trait DeleteWebhookResult extends js.Object {
    var webhook: Webhook
  }

  /**
    * Structure for Domain Association, which associates a custom domain with an Amplify App.
    */
  @js.native
  @Factory
  trait DomainAssociation extends js.Object {
    var domainAssociationArn: DomainAssociationArn
    var domainName: DomainName
    var domainStatus: DomainStatus
    var enableAutoSubDomain: EnableAutoSubDomain
    var statusReason: StatusReason
    var subDomains: SubDomains
    var certificateVerificationDNSRecord: js.UndefOr[CertificateVerificationDNSRecord]
  }

  @js.native
  sealed trait DomainStatus extends js.Any
  object DomainStatus extends js.Object {
    val PENDING_VERIFICATION   = "PENDING_VERIFICATION".asInstanceOf[DomainStatus]
    val IN_PROGRESS            = "IN_PROGRESS".asInstanceOf[DomainStatus]
    val AVAILABLE              = "AVAILABLE".asInstanceOf[DomainStatus]
    val PENDING_DEPLOYMENT     = "PENDING_DEPLOYMENT".asInstanceOf[DomainStatus]
    val FAILED                 = "FAILED".asInstanceOf[DomainStatus]
    val CREATING               = "CREATING".asInstanceOf[DomainStatus]
    val REQUESTING_CERTIFICATE = "REQUESTING_CERTIFICATE".asInstanceOf[DomainStatus]
    val UPDATING               = "UPDATING".asInstanceOf[DomainStatus]

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
    * Request structure for the generate access logs request.
    */
  @js.native
  @Factory
  trait GenerateAccessLogsRequest extends js.Object {
    var appId: AppId
    var domainName: DomainName
    var endTime: js.UndefOr[EndTime]
    var startTime: js.UndefOr[StartTime]
  }

  /**
    * Result structure for the generate access logs request.
    */
  @js.native
  @Factory
  trait GenerateAccessLogsResult extends js.Object {
    var logUrl: js.UndefOr[LogUrl]
  }

  /**
    * Request structure for get App request.
    */
  @js.native
  @Factory
  trait GetAppRequest extends js.Object {
    var appId: AppId
  }

  @js.native
  @Factory
  trait GetAppResult extends js.Object {
    var app: App
  }

  /**
    * Request structure for the get artifact request.
    */
  @js.native
  @Factory
  trait GetArtifactUrlRequest extends js.Object {
    var artifactId: ArtifactId
  }

  /**
    * Result structure for the get artifact request.
    */
  @js.native
  @Factory
  trait GetArtifactUrlResult extends js.Object {
    var artifactId: ArtifactId
    var artifactUrl: ArtifactUrl
  }

  /**
    * Request structure for get backend environment request.
    */
  @js.native
  @Factory
  trait GetBackendEnvironmentRequest extends js.Object {
    var appId: AppId
    var environmentName: EnvironmentName
  }

  /**
    * Result structure for get backend environment result.
    */
  @js.native
  @Factory
  trait GetBackendEnvironmentResult extends js.Object {
    var backendEnvironment: BackendEnvironment
  }

  /**
    * Request structure for get branch request.
    */
  @js.native
  @Factory
  trait GetBranchRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
  }

  @js.native
  @Factory
  trait GetBranchResult extends js.Object {
    var branch: Branch
  }

  /**
    * Request structure for the get Domain Association request.
    */
  @js.native
  @Factory
  trait GetDomainAssociationRequest extends js.Object {
    var appId: AppId
    var domainName: DomainName
  }

  /**
    * Result structure for the get Domain Association request.
    */
  @js.native
  @Factory
  trait GetDomainAssociationResult extends js.Object {
    var domainAssociation: DomainAssociation
  }

  /**
    * Request structure for get job request.
    */
  @js.native
  @Factory
  trait GetJobRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
    var jobId: JobId
  }

  @js.native
  @Factory
  trait GetJobResult extends js.Object {
    var job: Job
  }

  /**
    * Request structure for the get webhook request.
    */
  @js.native
  @Factory
  trait GetWebhookRequest extends js.Object {
    var webhookId: WebhookId
  }

  /**
    * Result structure for the get webhook request.
    */
  @js.native
  @Factory
  trait GetWebhookResult extends js.Object {
    var webhook: Webhook
  }

  /**
    * Structure for an execution job for an Amplify App.
    */
  @js.native
  @Factory
  trait Job extends js.Object {
    var steps: Steps
    var summary: JobSummary
  }

  @js.native
  sealed trait JobStatus extends js.Any
  object JobStatus extends js.Object {
    val PENDING      = "PENDING".asInstanceOf[JobStatus]
    val PROVISIONING = "PROVISIONING".asInstanceOf[JobStatus]
    val RUNNING      = "RUNNING".asInstanceOf[JobStatus]
    val FAILED       = "FAILED".asInstanceOf[JobStatus]
    val SUCCEED      = "SUCCEED".asInstanceOf[JobStatus]
    val CANCELLING   = "CANCELLING".asInstanceOf[JobStatus]
    val CANCELLED    = "CANCELLED".asInstanceOf[JobStatus]

    val values = js.Object.freeze(js.Array(PENDING, PROVISIONING, RUNNING, FAILED, SUCCEED, CANCELLING, CANCELLED))
  }

  /**
    * Structure for the summary of a Job.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait JobType extends js.Any
  object JobType extends js.Object {
    val RELEASE  = "RELEASE".asInstanceOf[JobType]
    val RETRY    = "RETRY".asInstanceOf[JobType]
    val MANUAL   = "MANUAL".asInstanceOf[JobType]
    val WEB_HOOK = "WEB_HOOK".asInstanceOf[JobType]

    val values = js.Object.freeze(js.Array(RELEASE, RETRY, MANUAL, WEB_HOOK))
  }

  /**
    * Request structure for an Amplify App list request.
    */
  @js.native
  @Factory
  trait ListAppsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Result structure for an Amplify App list request.
    */
  @js.native
  @Factory
  trait ListAppsResult extends js.Object {
    var apps: Apps
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Request structure for the list artifacts request.
    */
  @js.native
  @Factory
  trait ListArtifactsRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
    var jobId: JobId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Result structure for the list artifacts request.
    */
  @js.native
  @Factory
  trait ListArtifactsResult extends js.Object {
    var artifacts: Artifacts
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Request structure for list backend environments request.
    */
  @js.native
  @Factory
  trait ListBackendEnvironmentsRequest extends js.Object {
    var appId: AppId
    var environmentName: js.UndefOr[EnvironmentName]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Result structure for list backend environments result.
    */
  @js.native
  @Factory
  trait ListBackendEnvironmentsResult extends js.Object {
    var backendEnvironments: BackendEnvironments
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Request structure for list branches request.
    */
  @js.native
  @Factory
  trait ListBranchesRequest extends js.Object {
    var appId: AppId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Result structure for list branches request.
    */
  @js.native
  @Factory
  trait ListBranchesResult extends js.Object {
    var branches: Branches
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Request structure for the list Domain Associations request.
    */
  @js.native
  @Factory
  trait ListDomainAssociationsRequest extends js.Object {
    var appId: AppId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Result structure for the list Domain Association request.
    */
  @js.native
  @Factory
  trait ListDomainAssociationsResult extends js.Object {
    var domainAssociations: DomainAssociations
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Request structure for list job request.
    */
  @js.native
  @Factory
  trait ListJobsRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Maximum number of records to list in a single response.
    */
  @js.native
  @Factory
  trait ListJobsResult extends js.Object {
    var jobSummaries: JobSummaries
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Request structure used to list tags for resource.
    */
  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: ResourceArn
  }

  /**
    * Response for list tags.
    */
  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  /**
    * Request structure for the list webhooks request.
    */
  @js.native
  @Factory
  trait ListWebhooksRequest extends js.Object {
    var appId: AppId
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  /**
    * Result structure for the list webhooks request.
    */
  @js.native
  @Factory
  trait ListWebhooksResult extends js.Object {
    var webhooks: Webhooks
    var nextToken: js.UndefOr[NextToken]
  }

  @js.native
  sealed trait Platform extends js.Any
  object Platform extends js.Object {
    val WEB = "WEB".asInstanceOf[Platform]

    val values = js.Object.freeze(js.Array(WEB))
  }

  /**
    * Structure with Production Branch information.
    */
  @js.native
  @Factory
  trait ProductionBranch extends js.Object {
    var branchName: js.UndefOr[BranchName]
    var lastDeployTime: js.UndefOr[LastDeployTime]
    var status: js.UndefOr[Status]
    var thumbnailUrl: js.UndefOr[ThumbnailUrl]
  }

  @js.native
  sealed trait Stage extends js.Any
  object Stage extends js.Object {
    val PRODUCTION   = "PRODUCTION".asInstanceOf[Stage]
    val BETA         = "BETA".asInstanceOf[Stage]
    val DEVELOPMENT  = "DEVELOPMENT".asInstanceOf[Stage]
    val EXPERIMENTAL = "EXPERIMENTAL".asInstanceOf[Stage]
    val PULL_REQUEST = "PULL_REQUEST".asInstanceOf[Stage]

    val values = js.Object.freeze(js.Array(PRODUCTION, BETA, DEVELOPMENT, EXPERIMENTAL, PULL_REQUEST))
  }

  /**
    * Request structure for start a deployment.
    */
  @js.native
  @Factory
  trait StartDeploymentRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
    var jobId: js.UndefOr[JobId]
    var sourceUrl: js.UndefOr[SourceUrl]
  }

  /**
    * Result structure for start a deployment.
    */
  @js.native
  @Factory
  trait StartDeploymentResult extends js.Object {
    var jobSummary: JobSummary
  }

  /**
    * Request structure for Start job request.
    */
  @js.native
  @Factory
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

  /**
    * Result structure for run job request.
    */
  @js.native
  @Factory
  trait StartJobResult extends js.Object {
    var jobSummary: JobSummary
  }

  /**
    * Structure for an execution step for an execution job, for an Amplify App.
    */
  @js.native
  @Factory
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
    var testArtifactsUrl: js.UndefOr[TestArtifactsUrl]
    var testConfigUrl: js.UndefOr[TestConfigUrl]
  }

  /**
    * Request structure for stop job request.
    */
  @js.native
  @Factory
  trait StopJobRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
    var jobId: JobId
  }

  /**
    * Result structure for the stop job request.
    */
  @js.native
  @Factory
  trait StopJobResult extends js.Object {
    var jobSummary: JobSummary
  }

  /**
    * Subdomain for the Domain Association.
    */
  @js.native
  @Factory
  trait SubDomain extends js.Object {
    var dnsRecord: DNSRecord
    var subDomainSetting: SubDomainSetting
    var verified: Verified
  }

  /**
    * Setting for the Subdomain.
    */
  @js.native
  @Factory
  trait SubDomainSetting extends js.Object {
    var branchName: BranchName
    var prefix: DomainPrefix
  }

  /**
    * Request structure used to tag resource.
    */
  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tags: TagMap
  }

  /**
    * Response for tag resource.
    */
  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  /**
    * Request structure used to untag resource.
    */
  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tagKeys: TagKeyList
  }

  /**
    * Response for untag resource.
    */
  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  /**
    * Request structure for update App request.
    */
  @js.native
  @Factory
  trait UpdateAppRequest extends js.Object {
    var appId: AppId
    var accessToken: js.UndefOr[AccessToken]
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
    var oauthToken: js.UndefOr[OauthToken]
    var platform: js.UndefOr[Platform]
    var repository: js.UndefOr[Repository]
  }

  /**
    * Result structure for an Amplify App update request.
    */
  @js.native
  @Factory
  trait UpdateAppResult extends js.Object {
    var app: App
  }

  /**
    * Request structure for update branch request.
    */
  @js.native
  @Factory
  trait UpdateBranchRequest extends js.Object {
    var appId: AppId
    var branchName: BranchName
    var backendEnvironmentArn: js.UndefOr[BackendEnvironmentArn]
    var basicAuthCredentials: js.UndefOr[BasicAuthCredentials]
    var buildSpec: js.UndefOr[BuildSpec]
    var description: js.UndefOr[Description]
    var displayName: js.UndefOr[DisplayName]
    var enableAutoBuild: js.UndefOr[EnableAutoBuild]
    var enableBasicAuth: js.UndefOr[EnableBasicAuth]
    var enableNotification: js.UndefOr[EnableNotification]
    var enablePullRequestPreview: js.UndefOr[EnablePullRequestPreview]
    var environmentVariables: js.UndefOr[EnvironmentVariables]
    var framework: js.UndefOr[Framework]
    var pullRequestEnvironmentName: js.UndefOr[PullRequestEnvironmentName]
    var stage: js.UndefOr[Stage]
    var ttl: js.UndefOr[TTL]
  }

  /**
    * Result structure for update branch request.
    */
  @js.native
  @Factory
  trait UpdateBranchResult extends js.Object {
    var branch: Branch
  }

  /**
    * Request structure for update Domain Association request.
    */
  @js.native
  @Factory
  trait UpdateDomainAssociationRequest extends js.Object {
    var appId: AppId
    var domainName: DomainName
    var subDomainSettings: SubDomainSettings
    var enableAutoSubDomain: js.UndefOr[EnableAutoSubDomain]
  }

  /**
    * Result structure for the update Domain Association request.
    */
  @js.native
  @Factory
  trait UpdateDomainAssociationResult extends js.Object {
    var domainAssociation: DomainAssociation
  }

  /**
    * Request structure for update webhook request.
    */
  @js.native
  @Factory
  trait UpdateWebhookRequest extends js.Object {
    var webhookId: WebhookId
    var branchName: js.UndefOr[BranchName]
    var description: js.UndefOr[Description]
  }

  /**
    * Result structure for the update webhook request.
    */
  @js.native
  @Factory
  trait UpdateWebhookResult extends js.Object {
    var webhook: Webhook
  }

  /**
    * Structure for webhook, which associates a webhook with an Amplify App.
    */
  @js.native
  @Factory
  trait Webhook extends js.Object {
    var branchName: BranchName
    var createTime: CreateTime
    var description: Description
    var updateTime: UpdateTime
    var webhookArn: WebhookArn
    var webhookId: WebhookId
    var webhookUrl: WebhookUrl
  }
}
