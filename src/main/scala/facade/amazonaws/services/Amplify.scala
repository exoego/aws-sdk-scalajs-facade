package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object amplify {
  type ActiveJobId = String
  type AppArn = String
  type AppId = String
  type Apps = js.Array[App]
  type ArtifactsUrl = String
  type BasicAuthCredentials = String
  type BranchArn = String
  type BranchName = String
  type Branches = js.Array[Branch]
  type BuildSpec = String
  type CertificateVerificationDNSRecord = String
  type CommitId = String
  type CommitMessage = String
  type CommitTime = js.Date
  type Condition = String
  type CreateTime = js.Date
  type CustomDomain = String
  type CustomDomains = js.Array[CustomDomain]
  type CustomRules = js.Array[CustomRule]
  type DNSRecord = String
  type DefaultDomain = String
  type Description = String
  type DisplayName = String
  type DomainAssociationArn = String
  type DomainAssociations = js.Array[DomainAssociation]
  type DomainName = String
  type DomainPrefix = String
  type DomainStatus = String
  type EnableAutoBuild = Boolean
  type EnableAutoSubDomain = Boolean
  type EnableBasicAuth = Boolean
  type EnableBranchAutoBuild = Boolean
  type EnableNotification = Boolean
  type EndTime = js.Date
  type EnvKey = String
  type EnvValue = String
  type EnvironmentVariables = js.Dictionary[EnvValue]
  type Framework = String
  type JobArn = String
  type JobId = String
  type JobReason = String
  type JobStatus = String
  type JobSummaries = js.Array[JobSummary]
  type JobType = String
  type LastDeployTime = js.Date
  type LogUrl = String
  type MaxResults = Int
  type Name = String
  type NextToken = String
  type OauthToken = String
  type Platform = String
  type Repository = String
  type Screenshots = js.Dictionary[ThumbnailUrl]
  type ServiceRoleArn = String
  type Source = String
  type Stage = String
  type StartTime = js.Date
  type Status = String
  type StatusReason = String
  type StepName = String
  type Steps = js.Array[Step]
  type SubDomainSettings = js.Array[SubDomainSetting]
  type SubDomains = js.Array[SubDomain]
  type TTL = String
  type TagKey = String
  type TagValue = String
  type Tags = js.Dictionary[TagValue]
  type Target = String
  type ThumbnailName = String
  type ThumbnailUrl = String
  type TotalNumberOfJobs = String
  type UpdateTime = js.Date
  type Verified = Boolean
}

package amplify {
  @js.native
  @JSImport("aws-sdk", "Amplify")
  class Amplify(config: AWSConfig) extends js.Object {
    def createApp(params: CreateAppRequest): Request[CreateAppResult] = js.native
    def createBranch(params: CreateBranchRequest): Request[CreateBranchResult] = js.native
    def createDomainAssociation(params: CreateDomainAssociationRequest): Request[CreateDomainAssociationResult] = js.native
    def deleteApp(params: DeleteAppRequest): Request[DeleteAppResult] = js.native
    def deleteBranch(params: DeleteBranchRequest): Request[DeleteBranchResult] = js.native
    def deleteDomainAssociation(params: DeleteDomainAssociationRequest): Request[DeleteDomainAssociationResult] = js.native
    def deleteJob(params: DeleteJobRequest): Request[DeleteJobResult] = js.native
    def getApp(params: GetAppRequest): Request[GetAppResult] = js.native
    def getBranch(params: GetBranchRequest): Request[GetBranchResult] = js.native
    def getDomainAssociation(params: GetDomainAssociationRequest): Request[GetDomainAssociationResult] = js.native
    def getJob(params: GetJobRequest): Request[GetJobResult] = js.native
    def listApps(params: ListAppsRequest): Request[ListAppsResult] = js.native
    def listBranches(params: ListBranchesRequest): Request[ListBranchesResult] = js.native
    def listDomainAssociations(params: ListDomainAssociationsRequest): Request[ListDomainAssociationsResult] = js.native
    def listJobs(params: ListJobsRequest): Request[ListJobsResult] = js.native
    def startJob(params: StartJobRequest): Request[StartJobResult] = js.native
    def stopJob(params: StopJobRequest): Request[StopJobResult] = js.native
    def updateApp(params: UpdateAppRequest): Request[UpdateAppResult] = js.native
    def updateBranch(params: UpdateBranchRequest): Request[UpdateBranchResult] = js.native
    def updateDomainAssociation(params: UpdateDomainAssociationRequest): Request[UpdateDomainAssociationResult] = js.native
  }

  /**
   * <p> Amplify App represents different branches of a repository for building, deploying, and hosting. </p>
   */
  @js.native
  trait App extends js.Object {
    var name: js.UndefOr[Name]
    var repository: js.UndefOr[Repository]
    var createTime: js.UndefOr[CreateTime]
    var description: js.UndefOr[Description]
    var tags: js.UndefOr[Tags]
    var productionBranch: js.UndefOr[ProductionBranch]
    var environmentVariables: js.UndefOr[EnvironmentVariables]
    var buildSpec: js.UndefOr[BuildSpec]
    var enableBasicAuth: js.UndefOr[EnableBasicAuth]
    var basicAuthCredentials: js.UndefOr[BasicAuthCredentials]
    var iamServiceRoleArn: js.UndefOr[ServiceRoleArn]
    var customRules: js.UndefOr[CustomRules]
    var appArn: js.UndefOr[AppArn]
    var appId: js.UndefOr[AppId]
    var enableBranchAutoBuild: js.UndefOr[EnableBranchAutoBuild]
    var platform: js.UndefOr[Platform]
    var updateTime: js.UndefOr[UpdateTime]
    var defaultDomain: js.UndefOr[DefaultDomain]
  }

  object App {
    def apply(
      name: js.UndefOr[Name] = js.undefined,
      repository: js.UndefOr[Repository] = js.undefined,
      createTime: js.UndefOr[CreateTime] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      tags: js.UndefOr[Tags] = js.undefined,
      productionBranch: js.UndefOr[ProductionBranch] = js.undefined,
      environmentVariables: js.UndefOr[EnvironmentVariables] = js.undefined,
      buildSpec: js.UndefOr[BuildSpec] = js.undefined,
      enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined,
      basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined,
      iamServiceRoleArn: js.UndefOr[ServiceRoleArn] = js.undefined,
      customRules: js.UndefOr[CustomRules] = js.undefined,
      appArn: js.UndefOr[AppArn] = js.undefined,
      appId: js.UndefOr[AppId] = js.undefined,
      enableBranchAutoBuild: js.UndefOr[EnableBranchAutoBuild] = js.undefined,
      platform: js.UndefOr[Platform] = js.undefined,
      updateTime: js.UndefOr[UpdateTime] = js.undefined,
      defaultDomain: js.UndefOr[DefaultDomain] = js.undefined): App = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "repository" -> repository.map { x => x.asInstanceOf[js.Any] },
        "createTime" -> createTime.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "productionBranch" -> productionBranch.map { x => x.asInstanceOf[js.Any] },
        "environmentVariables" -> environmentVariables.map { x => x.asInstanceOf[js.Any] },
        "buildSpec" -> buildSpec.map { x => x.asInstanceOf[js.Any] },
        "enableBasicAuth" -> enableBasicAuth.map { x => x.asInstanceOf[js.Any] },
        "basicAuthCredentials" -> basicAuthCredentials.map { x => x.asInstanceOf[js.Any] },
        "iamServiceRoleArn" -> iamServiceRoleArn.map { x => x.asInstanceOf[js.Any] },
        "customRules" -> customRules.map { x => x.asInstanceOf[js.Any] },
        "appArn" -> appArn.map { x => x.asInstanceOf[js.Any] },
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] },
        "enableBranchAutoBuild" -> enableBranchAutoBuild.map { x => x.asInstanceOf[js.Any] },
        "platform" -> platform.map { x => x.asInstanceOf[js.Any] },
        "updateTime" -> updateTime.map { x => x.asInstanceOf[js.Any] },
        "defaultDomain" -> defaultDomain.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[App]
    }
  }

  /**
   * <p> Branch for an Amplify App, which maps to a 3rd party repository branch. </p>
   */
  @js.native
  trait Branch extends js.Object {
    var displayName: js.UndefOr[DisplayName]
    var stage: js.UndefOr[Stage]
    var createTime: js.UndefOr[CreateTime]
    var description: js.UndefOr[Description]
    var tags: js.UndefOr[Tags]
    var environmentVariables: js.UndefOr[EnvironmentVariables]
    var buildSpec: js.UndefOr[BuildSpec]
    var enableBasicAuth: js.UndefOr[EnableBasicAuth]
    var activeJobId: js.UndefOr[ActiveJobId]
    var framework: js.UndefOr[Framework]
    var basicAuthCredentials: js.UndefOr[BasicAuthCredentials]
    var enableAutoBuild: js.UndefOr[EnableAutoBuild]
    var customDomains: js.UndefOr[CustomDomains]
    var branchArn: js.UndefOr[BranchArn]
    var ttl: js.UndefOr[TTL]
    var branchName: js.UndefOr[BranchName]
    var updateTime: js.UndefOr[UpdateTime]
    var totalNumberOfJobs: js.UndefOr[TotalNumberOfJobs]
    var thumbnailUrl: js.UndefOr[ThumbnailUrl]
    var enableNotification: js.UndefOr[EnableNotification]
  }

  object Branch {
    def apply(
      displayName: js.UndefOr[DisplayName] = js.undefined,
      stage: js.UndefOr[Stage] = js.undefined,
      createTime: js.UndefOr[CreateTime] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      tags: js.UndefOr[Tags] = js.undefined,
      environmentVariables: js.UndefOr[EnvironmentVariables] = js.undefined,
      buildSpec: js.UndefOr[BuildSpec] = js.undefined,
      enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined,
      activeJobId: js.UndefOr[ActiveJobId] = js.undefined,
      framework: js.UndefOr[Framework] = js.undefined,
      basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined,
      enableAutoBuild: js.UndefOr[EnableAutoBuild] = js.undefined,
      customDomains: js.UndefOr[CustomDomains] = js.undefined,
      branchArn: js.UndefOr[BranchArn] = js.undefined,
      ttl: js.UndefOr[TTL] = js.undefined,
      branchName: js.UndefOr[BranchName] = js.undefined,
      updateTime: js.UndefOr[UpdateTime] = js.undefined,
      totalNumberOfJobs: js.UndefOr[TotalNumberOfJobs] = js.undefined,
      thumbnailUrl: js.UndefOr[ThumbnailUrl] = js.undefined,
      enableNotification: js.UndefOr[EnableNotification] = js.undefined): Branch = {
      val _fields = IndexedSeq[(String, js.Any)](
        "displayName" -> displayName.map { x => x.asInstanceOf[js.Any] },
        "stage" -> stage.map { x => x.asInstanceOf[js.Any] },
        "createTime" -> createTime.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "environmentVariables" -> environmentVariables.map { x => x.asInstanceOf[js.Any] },
        "buildSpec" -> buildSpec.map { x => x.asInstanceOf[js.Any] },
        "enableBasicAuth" -> enableBasicAuth.map { x => x.asInstanceOf[js.Any] },
        "activeJobId" -> activeJobId.map { x => x.asInstanceOf[js.Any] },
        "framework" -> framework.map { x => x.asInstanceOf[js.Any] },
        "basicAuthCredentials" -> basicAuthCredentials.map { x => x.asInstanceOf[js.Any] },
        "enableAutoBuild" -> enableAutoBuild.map { x => x.asInstanceOf[js.Any] },
        "customDomains" -> customDomains.map { x => x.asInstanceOf[js.Any] },
        "branchArn" -> branchArn.map { x => x.asInstanceOf[js.Any] },
        "ttl" -> ttl.map { x => x.asInstanceOf[js.Any] },
        "branchName" -> branchName.map { x => x.asInstanceOf[js.Any] },
        "updateTime" -> updateTime.map { x => x.asInstanceOf[js.Any] },
        "totalNumberOfJobs" -> totalNumberOfJobs.map { x => x.asInstanceOf[js.Any] },
        "thumbnailUrl" -> thumbnailUrl.map { x => x.asInstanceOf[js.Any] },
        "enableNotification" -> enableNotification.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Branch]
    }
  }

  /**
   * <p> Request structure used to create Apps in Amplify. </p>
   */
  @js.native
  trait CreateAppRequest extends js.Object {
    var name: js.UndefOr[Name]
    var repository: js.UndefOr[Repository]
    var description: js.UndefOr[Description]
    var tags: js.UndefOr[Tags]
    var environmentVariables: js.UndefOr[EnvironmentVariables]
    var buildSpec: js.UndefOr[BuildSpec]
    var enableBasicAuth: js.UndefOr[EnableBasicAuth]
    var oauthToken: js.UndefOr[OauthToken]
    var basicAuthCredentials: js.UndefOr[BasicAuthCredentials]
    var iamServiceRoleArn: js.UndefOr[ServiceRoleArn]
    var customRules: js.UndefOr[CustomRules]
    var enableBranchAutoBuild: js.UndefOr[EnableBranchAutoBuild]
    var platform: js.UndefOr[Platform]
  }

  object CreateAppRequest {
    def apply(
      name: js.UndefOr[Name] = js.undefined,
      repository: js.UndefOr[Repository] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      tags: js.UndefOr[Tags] = js.undefined,
      environmentVariables: js.UndefOr[EnvironmentVariables] = js.undefined,
      buildSpec: js.UndefOr[BuildSpec] = js.undefined,
      enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined,
      oauthToken: js.UndefOr[OauthToken] = js.undefined,
      basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined,
      iamServiceRoleArn: js.UndefOr[ServiceRoleArn] = js.undefined,
      customRules: js.UndefOr[CustomRules] = js.undefined,
      enableBranchAutoBuild: js.UndefOr[EnableBranchAutoBuild] = js.undefined,
      platform: js.UndefOr[Platform] = js.undefined): CreateAppRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "repository" -> repository.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "environmentVariables" -> environmentVariables.map { x => x.asInstanceOf[js.Any] },
        "buildSpec" -> buildSpec.map { x => x.asInstanceOf[js.Any] },
        "enableBasicAuth" -> enableBasicAuth.map { x => x.asInstanceOf[js.Any] },
        "oauthToken" -> oauthToken.map { x => x.asInstanceOf[js.Any] },
        "basicAuthCredentials" -> basicAuthCredentials.map { x => x.asInstanceOf[js.Any] },
        "iamServiceRoleArn" -> iamServiceRoleArn.map { x => x.asInstanceOf[js.Any] },
        "customRules" -> customRules.map { x => x.asInstanceOf[js.Any] },
        "enableBranchAutoBuild" -> enableBranchAutoBuild.map { x => x.asInstanceOf[js.Any] },
        "platform" -> platform.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAppRequest]
    }
  }

  @js.native
  trait CreateAppResult extends js.Object {
    var app: js.UndefOr[App]
  }

  object CreateAppResult {
    def apply(
      app: js.UndefOr[App] = js.undefined): CreateAppResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "app" -> app.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAppResult]
    }
  }

  /**
   * <p> Request structure for a branch create request. </p>
   */
  @js.native
  trait CreateBranchRequest extends js.Object {
    var stage: js.UndefOr[Stage]
    var description: js.UndefOr[Description]
    var tags: js.UndefOr[Tags]
    var environmentVariables: js.UndefOr[EnvironmentVariables]
    var buildSpec: js.UndefOr[BuildSpec]
    var enableBasicAuth: js.UndefOr[EnableBasicAuth]
    var framework: js.UndefOr[Framework]
    var basicAuthCredentials: js.UndefOr[BasicAuthCredentials]
    var enableAutoBuild: js.UndefOr[EnableAutoBuild]
    var ttl: js.UndefOr[TTL]
    var appId: js.UndefOr[AppId]
    var branchName: js.UndefOr[BranchName]
    var enableNotification: js.UndefOr[EnableNotification]
  }

  object CreateBranchRequest {
    def apply(
      stage: js.UndefOr[Stage] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      tags: js.UndefOr[Tags] = js.undefined,
      environmentVariables: js.UndefOr[EnvironmentVariables] = js.undefined,
      buildSpec: js.UndefOr[BuildSpec] = js.undefined,
      enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined,
      framework: js.UndefOr[Framework] = js.undefined,
      basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined,
      enableAutoBuild: js.UndefOr[EnableAutoBuild] = js.undefined,
      ttl: js.UndefOr[TTL] = js.undefined,
      appId: js.UndefOr[AppId] = js.undefined,
      branchName: js.UndefOr[BranchName] = js.undefined,
      enableNotification: js.UndefOr[EnableNotification] = js.undefined): CreateBranchRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "stage" -> stage.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "tags" -> tags.map { x => x.asInstanceOf[js.Any] },
        "environmentVariables" -> environmentVariables.map { x => x.asInstanceOf[js.Any] },
        "buildSpec" -> buildSpec.map { x => x.asInstanceOf[js.Any] },
        "enableBasicAuth" -> enableBasicAuth.map { x => x.asInstanceOf[js.Any] },
        "framework" -> framework.map { x => x.asInstanceOf[js.Any] },
        "basicAuthCredentials" -> basicAuthCredentials.map { x => x.asInstanceOf[js.Any] },
        "enableAutoBuild" -> enableAutoBuild.map { x => x.asInstanceOf[js.Any] },
        "ttl" -> ttl.map { x => x.asInstanceOf[js.Any] },
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] },
        "branchName" -> branchName.map { x => x.asInstanceOf[js.Any] },
        "enableNotification" -> enableNotification.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBranchRequest]
    }
  }

  /**
   * <p> Result structure for create branch request. </p>
   */
  @js.native
  trait CreateBranchResult extends js.Object {
    var branch: js.UndefOr[Branch]
  }

  object CreateBranchResult {
    def apply(
      branch: js.UndefOr[Branch] = js.undefined): CreateBranchResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "branch" -> branch.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBranchResult]
    }
  }

  /**
   * <p> Request structure for create Domain Association request. </p>
   */
  @js.native
  trait CreateDomainAssociationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
    var domainName: js.UndefOr[DomainName]
    var enableAutoSubDomain: js.UndefOr[EnableAutoSubDomain]
    var subDomainSettings: js.UndefOr[SubDomainSettings]
  }

  object CreateDomainAssociationRequest {
    def apply(
      appId: js.UndefOr[AppId] = js.undefined,
      domainName: js.UndefOr[DomainName] = js.undefined,
      enableAutoSubDomain: js.UndefOr[EnableAutoSubDomain] = js.undefined,
      subDomainSettings: js.UndefOr[SubDomainSettings] = js.undefined): CreateDomainAssociationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] },
        "domainName" -> domainName.map { x => x.asInstanceOf[js.Any] },
        "enableAutoSubDomain" -> enableAutoSubDomain.map { x => x.asInstanceOf[js.Any] },
        "subDomainSettings" -> subDomainSettings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDomainAssociationRequest]
    }
  }

  /**
   * <p> Result structure for the create Domain Association request. </p>
   */
  @js.native
  trait CreateDomainAssociationResult extends js.Object {
    var domainAssociation: js.UndefOr[DomainAssociation]
  }

  object CreateDomainAssociationResult {
    def apply(
      domainAssociation: js.UndefOr[DomainAssociation] = js.undefined): CreateDomainAssociationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domainAssociation" -> domainAssociation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDomainAssociationResult]
    }
  }

  /**
   * <p> Custom rewrite / redirect rule. </p>
   */
  @js.native
  trait CustomRule extends js.Object {
    var source: js.UndefOr[Source]
    var target: js.UndefOr[Target]
    var status: js.UndefOr[Status]
    var condition: js.UndefOr[Condition]
  }

  object CustomRule {
    def apply(
      source: js.UndefOr[Source] = js.undefined,
      target: js.UndefOr[Target] = js.undefined,
      status: js.UndefOr[Status] = js.undefined,
      condition: js.UndefOr[Condition] = js.undefined): CustomRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "source" -> source.map { x => x.asInstanceOf[js.Any] },
        "target" -> target.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "condition" -> condition.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CustomRule]
    }
  }

  /**
   * <p> Request structure for an Amplify App delete request. </p>
   */
  @js.native
  trait DeleteAppRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  object DeleteAppRequest {
    def apply(
      appId: js.UndefOr[AppId] = js.undefined): DeleteAppRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAppRequest]
    }
  }

  /**
   * <p> Result structure for an Amplify App delete request. </p>
   */
  @js.native
  trait DeleteAppResult extends js.Object {
    var app: js.UndefOr[App]
  }

  object DeleteAppResult {
    def apply(
      app: js.UndefOr[App] = js.undefined): DeleteAppResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "app" -> app.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAppResult]
    }
  }

  /**
   * <p> Request structure for delete branch request. </p>
   */
  @js.native
  trait DeleteBranchRequest extends js.Object {
    var appId: js.UndefOr[AppId]
    var branchName: js.UndefOr[BranchName]
  }

  object DeleteBranchRequest {
    def apply(
      appId: js.UndefOr[AppId] = js.undefined,
      branchName: js.UndefOr[BranchName] = js.undefined): DeleteBranchRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] },
        "branchName" -> branchName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBranchRequest]
    }
  }

  /**
   * <p> Result structure for delete branch request. </p>
   */
  @js.native
  trait DeleteBranchResult extends js.Object {
    var branch: js.UndefOr[Branch]
  }

  object DeleteBranchResult {
    def apply(
      branch: js.UndefOr[Branch] = js.undefined): DeleteBranchResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "branch" -> branch.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBranchResult]
    }
  }

  /**
   * <p> Request structure for the delete Domain Association request. </p>
   */
  @js.native
  trait DeleteDomainAssociationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
    var domainName: js.UndefOr[DomainName]
  }

  object DeleteDomainAssociationRequest {
    def apply(
      appId: js.UndefOr[AppId] = js.undefined,
      domainName: js.UndefOr[DomainName] = js.undefined): DeleteDomainAssociationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] },
        "domainName" -> domainName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDomainAssociationRequest]
    }
  }

  @js.native
  trait DeleteDomainAssociationResult extends js.Object {
    var domainAssociation: js.UndefOr[DomainAssociation]
  }

  object DeleteDomainAssociationResult {
    def apply(
      domainAssociation: js.UndefOr[DomainAssociation] = js.undefined): DeleteDomainAssociationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domainAssociation" -> domainAssociation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDomainAssociationResult]
    }
  }

  /**
   * <p> Request structure for delete job request. </p>
   */
  @js.native
  trait DeleteJobRequest extends js.Object {
    var appId: js.UndefOr[AppId]
    var branchName: js.UndefOr[BranchName]
    var jobId: js.UndefOr[JobId]
  }

  object DeleteJobRequest {
    def apply(
      appId: js.UndefOr[AppId] = js.undefined,
      branchName: js.UndefOr[BranchName] = js.undefined,
      jobId: js.UndefOr[JobId] = js.undefined): DeleteJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] },
        "branchName" -> branchName.map { x => x.asInstanceOf[js.Any] },
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteJobRequest]
    }
  }

  /**
   * <p> Result structure for the delete job request. </p>
   */
  @js.native
  trait DeleteJobResult extends js.Object {
    var jobSummary: js.UndefOr[JobSummary]
  }

  object DeleteJobResult {
    def apply(
      jobSummary: js.UndefOr[JobSummary] = js.undefined): DeleteJobResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobSummary" -> jobSummary.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteJobResult]
    }
  }

  /**
   * <p> Structure for Domain Association, which associates a custom domain with an Amplify App. </p>
   */
  @js.native
  trait DomainAssociation extends js.Object {
    var statusReason: js.UndefOr[StatusReason]
    var domainAssociationArn: js.UndefOr[DomainAssociationArn]
    var enableAutoSubDomain: js.UndefOr[EnableAutoSubDomain]
    var domainName: js.UndefOr[DomainName]
    var certificateVerificationDNSRecord: js.UndefOr[CertificateVerificationDNSRecord]
    var domainStatus: js.UndefOr[DomainStatus]
    var subDomains: js.UndefOr[SubDomains]
  }

  object DomainAssociation {
    def apply(
      statusReason: js.UndefOr[StatusReason] = js.undefined,
      domainAssociationArn: js.UndefOr[DomainAssociationArn] = js.undefined,
      enableAutoSubDomain: js.UndefOr[EnableAutoSubDomain] = js.undefined,
      domainName: js.UndefOr[DomainName] = js.undefined,
      certificateVerificationDNSRecord: js.UndefOr[CertificateVerificationDNSRecord] = js.undefined,
      domainStatus: js.UndefOr[DomainStatus] = js.undefined,
      subDomains: js.UndefOr[SubDomains] = js.undefined): DomainAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "statusReason" -> statusReason.map { x => x.asInstanceOf[js.Any] },
        "domainAssociationArn" -> domainAssociationArn.map { x => x.asInstanceOf[js.Any] },
        "enableAutoSubDomain" -> enableAutoSubDomain.map { x => x.asInstanceOf[js.Any] },
        "domainName" -> domainName.map { x => x.asInstanceOf[js.Any] },
        "certificateVerificationDNSRecord" -> certificateVerificationDNSRecord.map { x => x.asInstanceOf[js.Any] },
        "domainStatus" -> domainStatus.map { x => x.asInstanceOf[js.Any] },
        "subDomains" -> subDomains.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainAssociation]
    }
  }

  object DomainStatusEnum {
    val PENDING_VERIFICATION = "PENDING_VERIFICATION"
    val IN_PROGRESS = "IN_PROGRESS"
    val AVAILABLE = "AVAILABLE"
    val PENDING_DEPLOYMENT = "PENDING_DEPLOYMENT"
    val FAILED = "FAILED"

    val values = IndexedSeq(PENDING_VERIFICATION, IN_PROGRESS, AVAILABLE, PENDING_DEPLOYMENT, FAILED)
  }

  /**
   * <p> Request structure for get App request. </p>
   */
  @js.native
  trait GetAppRequest extends js.Object {
    var appId: js.UndefOr[AppId]
  }

  object GetAppRequest {
    def apply(
      appId: js.UndefOr[AppId] = js.undefined): GetAppRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAppRequest]
    }
  }

  @js.native
  trait GetAppResult extends js.Object {
    var app: js.UndefOr[App]
  }

  object GetAppResult {
    def apply(
      app: js.UndefOr[App] = js.undefined): GetAppResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "app" -> app.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAppResult]
    }
  }

  /**
   * <p> Result structure for get branch request. </p>
   */
  @js.native
  trait GetBranchRequest extends js.Object {
    var appId: js.UndefOr[AppId]
    var branchName: js.UndefOr[BranchName]
  }

  object GetBranchRequest {
    def apply(
      appId: js.UndefOr[AppId] = js.undefined,
      branchName: js.UndefOr[BranchName] = js.undefined): GetBranchRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] },
        "branchName" -> branchName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBranchRequest]
    }
  }

  @js.native
  trait GetBranchResult extends js.Object {
    var branch: js.UndefOr[Branch]
  }

  object GetBranchResult {
    def apply(
      branch: js.UndefOr[Branch] = js.undefined): GetBranchResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "branch" -> branch.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBranchResult]
    }
  }

  /**
   * <p> Request structure for the get Domain Association request. </p>
   */
  @js.native
  trait GetDomainAssociationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
    var domainName: js.UndefOr[DomainName]
  }

  object GetDomainAssociationRequest {
    def apply(
      appId: js.UndefOr[AppId] = js.undefined,
      domainName: js.UndefOr[DomainName] = js.undefined): GetDomainAssociationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] },
        "domainName" -> domainName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDomainAssociationRequest]
    }
  }

  /**
   * <p> Result structure for the get Domain Association request. </p>
   */
  @js.native
  trait GetDomainAssociationResult extends js.Object {
    var domainAssociation: js.UndefOr[DomainAssociation]
  }

  object GetDomainAssociationResult {
    def apply(
      domainAssociation: js.UndefOr[DomainAssociation] = js.undefined): GetDomainAssociationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domainAssociation" -> domainAssociation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDomainAssociationResult]
    }
  }

  /**
   * <p> Request structure for get job request. </p>
   */
  @js.native
  trait GetJobRequest extends js.Object {
    var appId: js.UndefOr[AppId]
    var branchName: js.UndefOr[BranchName]
    var jobId: js.UndefOr[JobId]
  }

  object GetJobRequest {
    def apply(
      appId: js.UndefOr[AppId] = js.undefined,
      branchName: js.UndefOr[BranchName] = js.undefined,
      jobId: js.UndefOr[JobId] = js.undefined): GetJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] },
        "branchName" -> branchName.map { x => x.asInstanceOf[js.Any] },
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetJobRequest]
    }
  }

  @js.native
  trait GetJobResult extends js.Object {
    var job: js.UndefOr[Job]
  }

  object GetJobResult {
    def apply(
      job: js.UndefOr[Job] = js.undefined): GetJobResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "job" -> job.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetJobResult]
    }
  }

  /**
   * <p> Structure for an execution job for an Amplify App. </p>
   */
  @js.native
  trait Job extends js.Object {
    var summary: js.UndefOr[JobSummary]
    var steps: js.UndefOr[Steps]
  }

  object Job {
    def apply(
      summary: js.UndefOr[JobSummary] = js.undefined,
      steps: js.UndefOr[Steps] = js.undefined): Job = {
      val _fields = IndexedSeq[(String, js.Any)](
        "summary" -> summary.map { x => x.asInstanceOf[js.Any] },
        "steps" -> steps.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Job]
    }
  }

  object JobStatusEnum {
    val PENDING = "PENDING"
    val PROVISIONING = "PROVISIONING"
    val RUNNING = "RUNNING"
    val FAILED = "FAILED"
    val SUCCEED = "SUCCEED"
    val CANCELLING = "CANCELLING"
    val CANCELLED = "CANCELLED"

    val values = IndexedSeq(PENDING, PROVISIONING, RUNNING, FAILED, SUCCEED, CANCELLING, CANCELLED)
  }

  /**
   * <p> Structure for the summary of a Job. </p>
   */
  @js.native
  trait JobSummary extends js.Object {
    var startTime: js.UndefOr[StartTime]
    var jobArn: js.UndefOr[JobArn]
    var commitId: js.UndefOr[CommitId]
    var jobType: js.UndefOr[JobType]
    var commitTime: js.UndefOr[CommitTime]
    var endTime: js.UndefOr[EndTime]
    var status: js.UndefOr[JobStatus]
    var jobId: js.UndefOr[JobId]
    var commitMessage: js.UndefOr[CommitMessage]
  }

  object JobSummary {
    def apply(
      startTime: js.UndefOr[StartTime] = js.undefined,
      jobArn: js.UndefOr[JobArn] = js.undefined,
      commitId: js.UndefOr[CommitId] = js.undefined,
      jobType: js.UndefOr[JobType] = js.undefined,
      commitTime: js.UndefOr[CommitTime] = js.undefined,
      endTime: js.UndefOr[EndTime] = js.undefined,
      status: js.UndefOr[JobStatus] = js.undefined,
      jobId: js.UndefOr[JobId] = js.undefined,
      commitMessage: js.UndefOr[CommitMessage] = js.undefined): JobSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "startTime" -> startTime.map { x => x.asInstanceOf[js.Any] },
        "jobArn" -> jobArn.map { x => x.asInstanceOf[js.Any] },
        "commitId" -> commitId.map { x => x.asInstanceOf[js.Any] },
        "jobType" -> jobType.map { x => x.asInstanceOf[js.Any] },
        "commitTime" -> commitTime.map { x => x.asInstanceOf[js.Any] },
        "endTime" -> endTime.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] },
        "commitMessage" -> commitMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobSummary]
    }
  }

  object JobTypeEnum {
    val RELEASE = "RELEASE"
    val RETRY = "RETRY"
    val WEB_HOOK = "WEB_HOOK"

    val values = IndexedSeq(RELEASE, RETRY, WEB_HOOK)
  }

  /**
   * <p> Request structure for an Amplify App list request. </p>
   */
  @js.native
  trait ListAppsRequest extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object ListAppsRequest {
    def apply(
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): ListAppsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAppsRequest]
    }
  }

  /**
   * <p> Result structure for an Amplify App list request. </p>
   */
  @js.native
  trait ListAppsResult extends js.Object {
    var apps: js.UndefOr[Apps]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListAppsResult {
    def apply(
      apps: js.UndefOr[Apps] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListAppsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "apps" -> apps.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAppsResult]
    }
  }

  /**
   * <p> Request structure for list branches request. </p>
   */
  @js.native
  trait ListBranchesRequest extends js.Object {
    var appId: js.UndefOr[AppId]
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object ListBranchesRequest {
    def apply(
      appId: js.UndefOr[AppId] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): ListBranchesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBranchesRequest]
    }
  }

  /**
   * <p> Result structure for list branches request. </p>
   */
  @js.native
  trait ListBranchesResult extends js.Object {
    var branches: js.UndefOr[Branches]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListBranchesResult {
    def apply(
      branches: js.UndefOr[Branches] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListBranchesResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "branches" -> branches.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBranchesResult]
    }
  }

  /**
   * <p> Request structure for the list Domain Associations request. </p>
   */
  @js.native
  trait ListDomainAssociationsRequest extends js.Object {
    var appId: js.UndefOr[AppId]
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object ListDomainAssociationsRequest {
    def apply(
      appId: js.UndefOr[AppId] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): ListDomainAssociationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDomainAssociationsRequest]
    }
  }

  /**
   * <p> Result structure for the list Domain Association request. </p>
   */
  @js.native
  trait ListDomainAssociationsResult extends js.Object {
    var domainAssociations: js.UndefOr[DomainAssociations]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListDomainAssociationsResult {
    def apply(
      domainAssociations: js.UndefOr[DomainAssociations] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListDomainAssociationsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domainAssociations" -> domainAssociations.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDomainAssociationsResult]
    }
  }

  /**
   * <p> Request structure for list job request. </p>
   */
  @js.native
  trait ListJobsRequest extends js.Object {
    var appId: js.UndefOr[AppId]
    var branchName: js.UndefOr[BranchName]
    var nextToken: js.UndefOr[NextToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object ListJobsRequest {
    def apply(
      appId: js.UndefOr[AppId] = js.undefined,
      branchName: js.UndefOr[BranchName] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): ListJobsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] },
        "branchName" -> branchName.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsRequest]
    }
  }

  /**
   * <p> Maximum number of records to list in a single response. </p>
   */
  @js.native
  trait ListJobsResult extends js.Object {
    var jobSummaries: js.UndefOr[JobSummaries]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListJobsResult {
    def apply(
      jobSummaries: js.UndefOr[JobSummaries] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined): ListJobsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobSummaries" -> jobSummaries.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsResult]
    }
  }

  object PlatformEnum {
    val IOS = "IOS"
    val ANDROID = "ANDROID"
    val WEB = "WEB"
    val REACT_NATIVE = "REACT_NATIVE"

    val values = IndexedSeq(IOS, ANDROID, WEB, REACT_NATIVE)
  }

  /**
   * <p> Structure with Production Branch information. </p>
   */
  @js.native
  trait ProductionBranch extends js.Object {
    var lastDeployTime: js.UndefOr[LastDeployTime]
    var status: js.UndefOr[Status]
    var thumbnailUrl: js.UndefOr[ThumbnailUrl]
    var branchName: js.UndefOr[BranchName]
  }

  object ProductionBranch {
    def apply(
      lastDeployTime: js.UndefOr[LastDeployTime] = js.undefined,
      status: js.UndefOr[Status] = js.undefined,
      thumbnailUrl: js.UndefOr[ThumbnailUrl] = js.undefined,
      branchName: js.UndefOr[BranchName] = js.undefined): ProductionBranch = {
      val _fields = IndexedSeq[(String, js.Any)](
        "lastDeployTime" -> lastDeployTime.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "thumbnailUrl" -> thumbnailUrl.map { x => x.asInstanceOf[js.Any] },
        "branchName" -> branchName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProductionBranch]
    }
  }

  object StageEnum {
    val PRODUCTION = "PRODUCTION"
    val BETA = "BETA"
    val DEVELOPMENT = "DEVELOPMENT"
    val EXPERIMENTAL = "EXPERIMENTAL"

    val values = IndexedSeq(PRODUCTION, BETA, DEVELOPMENT, EXPERIMENTAL)
  }

  /**
   * <p> Request structure for Start job request. </p>
   */
  @js.native
  trait StartJobRequest extends js.Object {
    var jobReason: js.UndefOr[JobReason]
    var commitId: js.UndefOr[CommitId]
    var jobType: js.UndefOr[JobType]
    var commitTime: js.UndefOr[CommitTime]
    var jobId: js.UndefOr[JobId]
    var appId: js.UndefOr[AppId]
    var branchName: js.UndefOr[BranchName]
    var commitMessage: js.UndefOr[CommitMessage]
  }

  object StartJobRequest {
    def apply(
      jobReason: js.UndefOr[JobReason] = js.undefined,
      commitId: js.UndefOr[CommitId] = js.undefined,
      jobType: js.UndefOr[JobType] = js.undefined,
      commitTime: js.UndefOr[CommitTime] = js.undefined,
      jobId: js.UndefOr[JobId] = js.undefined,
      appId: js.UndefOr[AppId] = js.undefined,
      branchName: js.UndefOr[BranchName] = js.undefined,
      commitMessage: js.UndefOr[CommitMessage] = js.undefined): StartJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobReason" -> jobReason.map { x => x.asInstanceOf[js.Any] },
        "commitId" -> commitId.map { x => x.asInstanceOf[js.Any] },
        "jobType" -> jobType.map { x => x.asInstanceOf[js.Any] },
        "commitTime" -> commitTime.map { x => x.asInstanceOf[js.Any] },
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] },
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] },
        "branchName" -> branchName.map { x => x.asInstanceOf[js.Any] },
        "commitMessage" -> commitMessage.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartJobRequest]
    }
  }

  /**
   * <p> Result structure for run job request. </p>
   */
  @js.native
  trait StartJobResult extends js.Object {
    var jobSummary: js.UndefOr[JobSummary]
  }

  object StartJobResult {
    def apply(
      jobSummary: js.UndefOr[JobSummary] = js.undefined): StartJobResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobSummary" -> jobSummary.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartJobResult]
    }
  }

  /**
   * <p> Structure for an execution step for an execution job, for an Amplify App. </p>
   */
  @js.native
  trait Step extends js.Object {
    var startTime: js.UndefOr[StartTime]
    var logUrl: js.UndefOr[LogUrl]
    var artifactsUrl: js.UndefOr[ArtifactsUrl]
    var screenshots: js.UndefOr[Screenshots]
    var endTime: js.UndefOr[EndTime]
    var stepName: js.UndefOr[StepName]
    var status: js.UndefOr[JobStatus]
  }

  object Step {
    def apply(
      startTime: js.UndefOr[StartTime] = js.undefined,
      logUrl: js.UndefOr[LogUrl] = js.undefined,
      artifactsUrl: js.UndefOr[ArtifactsUrl] = js.undefined,
      screenshots: js.UndefOr[Screenshots] = js.undefined,
      endTime: js.UndefOr[EndTime] = js.undefined,
      stepName: js.UndefOr[StepName] = js.undefined,
      status: js.UndefOr[JobStatus] = js.undefined): Step = {
      val _fields = IndexedSeq[(String, js.Any)](
        "startTime" -> startTime.map { x => x.asInstanceOf[js.Any] },
        "logUrl" -> logUrl.map { x => x.asInstanceOf[js.Any] },
        "artifactsUrl" -> artifactsUrl.map { x => x.asInstanceOf[js.Any] },
        "screenshots" -> screenshots.map { x => x.asInstanceOf[js.Any] },
        "endTime" -> endTime.map { x => x.asInstanceOf[js.Any] },
        "stepName" -> stepName.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Step]
    }
  }

  /**
   * <p> Request structure for stop job request. </p>
   */
  @js.native
  trait StopJobRequest extends js.Object {
    var appId: js.UndefOr[AppId]
    var branchName: js.UndefOr[BranchName]
    var jobId: js.UndefOr[JobId]
  }

  object StopJobRequest {
    def apply(
      appId: js.UndefOr[AppId] = js.undefined,
      branchName: js.UndefOr[BranchName] = js.undefined,
      jobId: js.UndefOr[JobId] = js.undefined): StopJobRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] },
        "branchName" -> branchName.map { x => x.asInstanceOf[js.Any] },
        "jobId" -> jobId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopJobRequest]
    }
  }

  /**
   * <p> Result structure for the stop job request. </p>
   */
  @js.native
  trait StopJobResult extends js.Object {
    var jobSummary: js.UndefOr[JobSummary]
  }

  object StopJobResult {
    def apply(
      jobSummary: js.UndefOr[JobSummary] = js.undefined): StopJobResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "jobSummary" -> jobSummary.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopJobResult]
    }
  }

  /**
   * <p> Subdomain for the Domain Association. </p>
   */
  @js.native
  trait SubDomain extends js.Object {
    var subDomainSetting: js.UndefOr[SubDomainSetting]
    var verified: js.UndefOr[Verified]
    var dnsRecord: js.UndefOr[DNSRecord]
  }

  object SubDomain {
    def apply(
      subDomainSetting: js.UndefOr[SubDomainSetting] = js.undefined,
      verified: js.UndefOr[Verified] = js.undefined,
      dnsRecord: js.UndefOr[DNSRecord] = js.undefined): SubDomain = {
      val _fields = IndexedSeq[(String, js.Any)](
        "subDomainSetting" -> subDomainSetting.map { x => x.asInstanceOf[js.Any] },
        "verified" -> verified.map { x => x.asInstanceOf[js.Any] },
        "dnsRecord" -> dnsRecord.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubDomain]
    }
  }

  /**
   * <p> Setting for the Subdomain. </p>
   */
  @js.native
  trait SubDomainSetting extends js.Object {
    var prefix: js.UndefOr[DomainPrefix]
    var branchName: js.UndefOr[BranchName]
  }

  object SubDomainSetting {
    def apply(
      prefix: js.UndefOr[DomainPrefix] = js.undefined,
      branchName: js.UndefOr[BranchName] = js.undefined): SubDomainSetting = {
      val _fields = IndexedSeq[(String, js.Any)](
        "prefix" -> prefix.map { x => x.asInstanceOf[js.Any] },
        "branchName" -> branchName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubDomainSetting]
    }
  }

  /**
   * <p> Request structure for update App request. </p>
   */
  @js.native
  trait UpdateAppRequest extends js.Object {
    var name: js.UndefOr[Name]
    var description: js.UndefOr[Description]
    var environmentVariables: js.UndefOr[EnvironmentVariables]
    var buildSpec: js.UndefOr[BuildSpec]
    var enableBasicAuth: js.UndefOr[EnableBasicAuth]
    var basicAuthCredentials: js.UndefOr[BasicAuthCredentials]
    var iamServiceRoleArn: js.UndefOr[ServiceRoleArn]
    var customRules: js.UndefOr[CustomRules]
    var appId: js.UndefOr[AppId]
    var enableBranchAutoBuild: js.UndefOr[EnableAutoBuild]
    var platform: js.UndefOr[Platform]
  }

  object UpdateAppRequest {
    def apply(
      name: js.UndefOr[Name] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      environmentVariables: js.UndefOr[EnvironmentVariables] = js.undefined,
      buildSpec: js.UndefOr[BuildSpec] = js.undefined,
      enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined,
      basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined,
      iamServiceRoleArn: js.UndefOr[ServiceRoleArn] = js.undefined,
      customRules: js.UndefOr[CustomRules] = js.undefined,
      appId: js.UndefOr[AppId] = js.undefined,
      enableBranchAutoBuild: js.UndefOr[EnableAutoBuild] = js.undefined,
      platform: js.UndefOr[Platform] = js.undefined): UpdateAppRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "environmentVariables" -> environmentVariables.map { x => x.asInstanceOf[js.Any] },
        "buildSpec" -> buildSpec.map { x => x.asInstanceOf[js.Any] },
        "enableBasicAuth" -> enableBasicAuth.map { x => x.asInstanceOf[js.Any] },
        "basicAuthCredentials" -> basicAuthCredentials.map { x => x.asInstanceOf[js.Any] },
        "iamServiceRoleArn" -> iamServiceRoleArn.map { x => x.asInstanceOf[js.Any] },
        "customRules" -> customRules.map { x => x.asInstanceOf[js.Any] },
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] },
        "enableBranchAutoBuild" -> enableBranchAutoBuild.map { x => x.asInstanceOf[js.Any] },
        "platform" -> platform.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAppRequest]
    }
  }

  /**
   * <p> Result structure for an Amplify App update request. </p>
   */
  @js.native
  trait UpdateAppResult extends js.Object {
    var app: js.UndefOr[App]
  }

  object UpdateAppResult {
    def apply(
      app: js.UndefOr[App] = js.undefined): UpdateAppResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "app" -> app.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAppResult]
    }
  }

  /**
   * <p> Request structure for update branch request. </p>
   */
  @js.native
  trait UpdateBranchRequest extends js.Object {
    var stage: js.UndefOr[Stage]
    var description: js.UndefOr[Description]
    var environmentVariables: js.UndefOr[EnvironmentVariables]
    var buildSpec: js.UndefOr[BuildSpec]
    var enableBasicAuth: js.UndefOr[EnableBasicAuth]
    var framework: js.UndefOr[Framework]
    var basicAuthCredentials: js.UndefOr[BasicAuthCredentials]
    var enableAutoBuild: js.UndefOr[EnableAutoBuild]
    var ttl: js.UndefOr[TTL]
    var appId: js.UndefOr[AppId]
    var branchName: js.UndefOr[BranchName]
    var enableNotification: js.UndefOr[EnableNotification]
  }

  object UpdateBranchRequest {
    def apply(
      stage: js.UndefOr[Stage] = js.undefined,
      description: js.UndefOr[Description] = js.undefined,
      environmentVariables: js.UndefOr[EnvironmentVariables] = js.undefined,
      buildSpec: js.UndefOr[BuildSpec] = js.undefined,
      enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined,
      framework: js.UndefOr[Framework] = js.undefined,
      basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined,
      enableAutoBuild: js.UndefOr[EnableAutoBuild] = js.undefined,
      ttl: js.UndefOr[TTL] = js.undefined,
      appId: js.UndefOr[AppId] = js.undefined,
      branchName: js.UndefOr[BranchName] = js.undefined,
      enableNotification: js.UndefOr[EnableNotification] = js.undefined): UpdateBranchRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "stage" -> stage.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "environmentVariables" -> environmentVariables.map { x => x.asInstanceOf[js.Any] },
        "buildSpec" -> buildSpec.map { x => x.asInstanceOf[js.Any] },
        "enableBasicAuth" -> enableBasicAuth.map { x => x.asInstanceOf[js.Any] },
        "framework" -> framework.map { x => x.asInstanceOf[js.Any] },
        "basicAuthCredentials" -> basicAuthCredentials.map { x => x.asInstanceOf[js.Any] },
        "enableAutoBuild" -> enableAutoBuild.map { x => x.asInstanceOf[js.Any] },
        "ttl" -> ttl.map { x => x.asInstanceOf[js.Any] },
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] },
        "branchName" -> branchName.map { x => x.asInstanceOf[js.Any] },
        "enableNotification" -> enableNotification.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateBranchRequest]
    }
  }

  /**
   * <p> Result structure for update branch request. </p>
   */
  @js.native
  trait UpdateBranchResult extends js.Object {
    var branch: js.UndefOr[Branch]
  }

  object UpdateBranchResult {
    def apply(
      branch: js.UndefOr[Branch] = js.undefined): UpdateBranchResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "branch" -> branch.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateBranchResult]
    }
  }

  /**
   * <p> Request structure for update Domain Association request. </p>
   */
  @js.native
  trait UpdateDomainAssociationRequest extends js.Object {
    var appId: js.UndefOr[AppId]
    var domainName: js.UndefOr[DomainName]
    var enableAutoSubDomain: js.UndefOr[EnableAutoSubDomain]
    var subDomainSettings: js.UndefOr[SubDomainSettings]
  }

  object UpdateDomainAssociationRequest {
    def apply(
      appId: js.UndefOr[AppId] = js.undefined,
      domainName: js.UndefOr[DomainName] = js.undefined,
      enableAutoSubDomain: js.UndefOr[EnableAutoSubDomain] = js.undefined,
      subDomainSettings: js.UndefOr[SubDomainSettings] = js.undefined): UpdateDomainAssociationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.map { x => x.asInstanceOf[js.Any] },
        "domainName" -> domainName.map { x => x.asInstanceOf[js.Any] },
        "enableAutoSubDomain" -> enableAutoSubDomain.map { x => x.asInstanceOf[js.Any] },
        "subDomainSettings" -> subDomainSettings.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDomainAssociationRequest]
    }
  }

  /**
   * <p> Result structure for the update Domain Association request. </p>
   */
  @js.native
  trait UpdateDomainAssociationResult extends js.Object {
    var domainAssociation: js.UndefOr[DomainAssociation]
  }

  object UpdateDomainAssociationResult {
    def apply(
      domainAssociation: js.UndefOr[DomainAssociation] = js.undefined): UpdateDomainAssociationResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "domainAssociation" -> domainAssociation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDomainAssociationResult]
    }
  }
}
