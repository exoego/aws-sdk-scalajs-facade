package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object amplify {
  type ActiveJobId                      = String
  type AppArn                           = String
  type AppId                            = String
  type Apps                             = js.Array[App]
  type ArtifactsUrl                     = String
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
  type EnableAutoBuild                  = Boolean
  type EnableAutoSubDomain              = Boolean
  type EnableBasicAuth                  = Boolean
  type EnableBranchAutoBuild            = Boolean
  type EnableNotification               = Boolean
  type EndTime                          = js.Date
  type EnvKey                           = String
  type EnvValue                         = String
  type EnvironmentVariables             = js.Dictionary[EnvValue]
  type Framework                        = String
  type JobArn                           = String
  type JobId                            = String
  type JobReason                        = String
  type JobStatus                        = String
  type JobSummaries                     = js.Array[JobSummary]
  type JobType                          = String
  type LastDeployTime                   = js.Date
  type LogUrl                           = String
  type MaxResults                       = Int
  type Name                             = String
  type NextToken                        = String
  type OauthToken                       = String
  type Platform                         = String
  type Repository                       = String
  type Screenshots                      = js.Dictionary[ThumbnailUrl]
  type ServiceRoleArn                   = String
  type Source                           = String
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
  type TagValue                         = String
  type Tags                             = js.Dictionary[TagValue]
  type Target                           = String
  type ThumbnailName                    = String
  type ThumbnailUrl                     = String
  type TotalNumberOfJobs                = String
  type UpdateTime                       = js.Date
  type Verified                         = Boolean
}

package amplify {
  @js.native
  @JSImport("aws-sdk", "Amplify")
  class Amplify() extends js.Object {
    def this(config: AWSConfig) = this()

    def createApp(params: CreateAppRequest): Request[CreateAppResult]          = js.native
    def createBranch(params: CreateBranchRequest): Request[CreateBranchResult] = js.native
    def createDomainAssociation(params: CreateDomainAssociationRequest): Request[CreateDomainAssociationResult] =
      js.native
    def deleteApp(params: DeleteAppRequest): Request[DeleteAppResult]          = js.native
    def deleteBranch(params: DeleteBranchRequest): Request[DeleteBranchResult] = js.native
    def deleteDomainAssociation(params: DeleteDomainAssociationRequest): Request[DeleteDomainAssociationResult] =
      js.native
    def deleteJob(params: DeleteJobRequest): Request[DeleteJobResult]                                        = js.native
    def getApp(params: GetAppRequest): Request[GetAppResult]                                                 = js.native
    def getBranch(params: GetBranchRequest): Request[GetBranchResult]                                        = js.native
    def getDomainAssociation(params: GetDomainAssociationRequest): Request[GetDomainAssociationResult]       = js.native
    def getJob(params: GetJobRequest): Request[GetJobResult]                                                 = js.native
    def listApps(params: ListAppsRequest): Request[ListAppsResult]                                           = js.native
    def listBranches(params: ListBranchesRequest): Request[ListBranchesResult]                               = js.native
    def listDomainAssociations(params: ListDomainAssociationsRequest): Request[ListDomainAssociationsResult] = js.native
    def listJobs(params: ListJobsRequest): Request[ListJobsResult]                                           = js.native
    def startJob(params: StartJobRequest): Request[StartJobResult]                                           = js.native
    def stopJob(params: StopJobRequest): Request[StopJobResult]                                              = js.native
    def updateApp(params: UpdateAppRequest): Request[UpdateAppResult]                                        = js.native
    def updateBranch(params: UpdateBranchRequest): Request[UpdateBranchResult]                               = js.native
    def updateDomainAssociation(params: UpdateDomainAssociationRequest): Request[UpdateDomainAssociationResult] =
      js.native
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
    var basicAuthCredentials: js.UndefOr[BasicAuthCredentials]
    var buildSpec: js.UndefOr[BuildSpec]
    var customRules: js.UndefOr[CustomRules]
    var iamServiceRoleArn: js.UndefOr[ServiceRoleArn]
    var productionBranch: js.UndefOr[ProductionBranch]
    var tags: js.UndefOr[Tags]
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
        basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined,
        buildSpec: js.UndefOr[BuildSpec] = js.undefined,
        customRules: js.UndefOr[CustomRules] = js.undefined,
        iamServiceRoleArn: js.UndefOr[ServiceRoleArn] = js.undefined,
        productionBranch: js.UndefOr[ProductionBranch] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): App = {
      val _fields = IndexedSeq[(String, js.Any)](
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
        "updateTime"            -> updateTime.asInstanceOf[js.Any],
        "basicAuthCredentials" -> basicAuthCredentials.map { x =>
          x.asInstanceOf[js.Any]
        },
        "buildSpec" -> buildSpec.map { x =>
          x.asInstanceOf[js.Any]
        },
        "customRules" -> customRules.map { x =>
          x.asInstanceOf[js.Any]
        },
        "iamServiceRoleArn" -> iamServiceRoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "productionBranch" -> productionBranch.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[App]
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
    var enableAutoBuild: EnableAutoBuild
    var enableBasicAuth: EnableBasicAuth
    var enableNotification: EnableNotification
    var environmentVariables: EnvironmentVariables
    var framework: Framework
    var stage: Stage
    var totalNumberOfJobs: TotalNumberOfJobs
    var ttl: TTL
    var updateTime: UpdateTime
    var basicAuthCredentials: js.UndefOr[BasicAuthCredentials]
    var buildSpec: js.UndefOr[BuildSpec]
    var displayName: js.UndefOr[DisplayName]
    var tags: js.UndefOr[Tags]
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
        enableAutoBuild: EnableAutoBuild,
        enableBasicAuth: EnableBasicAuth,
        enableNotification: EnableNotification,
        environmentVariables: EnvironmentVariables,
        framework: Framework,
        stage: Stage,
        totalNumberOfJobs: TotalNumberOfJobs,
        ttl: TTL,
        updateTime: UpdateTime,
        basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined,
        buildSpec: js.UndefOr[BuildSpec] = js.undefined,
        displayName: js.UndefOr[DisplayName] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined,
        thumbnailUrl: js.UndefOr[ThumbnailUrl] = js.undefined
    ): Branch = {
      val _fields = IndexedSeq[(String, js.Any)](
        "activeJobId"          -> activeJobId.asInstanceOf[js.Any],
        "branchArn"            -> branchArn.asInstanceOf[js.Any],
        "branchName"           -> branchName.asInstanceOf[js.Any],
        "createTime"           -> createTime.asInstanceOf[js.Any],
        "customDomains"        -> customDomains.asInstanceOf[js.Any],
        "description"          -> description.asInstanceOf[js.Any],
        "enableAutoBuild"      -> enableAutoBuild.asInstanceOf[js.Any],
        "enableBasicAuth"      -> enableBasicAuth.asInstanceOf[js.Any],
        "enableNotification"   -> enableNotification.asInstanceOf[js.Any],
        "environmentVariables" -> environmentVariables.asInstanceOf[js.Any],
        "framework"            -> framework.asInstanceOf[js.Any],
        "stage"                -> stage.asInstanceOf[js.Any],
        "totalNumberOfJobs"    -> totalNumberOfJobs.asInstanceOf[js.Any],
        "ttl"                  -> ttl.asInstanceOf[js.Any],
        "updateTime"           -> updateTime.asInstanceOf[js.Any],
        "basicAuthCredentials" -> basicAuthCredentials.map { x =>
          x.asInstanceOf[js.Any]
        },
        "buildSpec" -> buildSpec.map { x =>
          x.asInstanceOf[js.Any]
        },
        "displayName" -> displayName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thumbnailUrl" -> thumbnailUrl.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Branch]
    }
  }

  /**
    * Request structure used to create Apps in Amplify.
    */
  @js.native
  trait CreateAppRequest extends js.Object {
    var name: Name
    var oauthToken: OauthToken
    var platform: Platform
    var repository: Repository
    var basicAuthCredentials: js.UndefOr[BasicAuthCredentials]
    var buildSpec: js.UndefOr[BuildSpec]
    var customRules: js.UndefOr[CustomRules]
    var description: js.UndefOr[Description]
    var enableBasicAuth: js.UndefOr[EnableBasicAuth]
    var enableBranchAutoBuild: js.UndefOr[EnableBranchAutoBuild]
    var environmentVariables: js.UndefOr[EnvironmentVariables]
    var iamServiceRoleArn: js.UndefOr[ServiceRoleArn]
    var tags: js.UndefOr[Tags]
  }

  object CreateAppRequest {
    def apply(
        name: Name,
        oauthToken: OauthToken,
        platform: Platform,
        repository: Repository,
        basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined,
        buildSpec: js.UndefOr[BuildSpec] = js.undefined,
        customRules: js.UndefOr[CustomRules] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined,
        enableBranchAutoBuild: js.UndefOr[EnableBranchAutoBuild] = js.undefined,
        environmentVariables: js.UndefOr[EnvironmentVariables] = js.undefined,
        iamServiceRoleArn: js.UndefOr[ServiceRoleArn] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateAppRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name"       -> name.asInstanceOf[js.Any],
        "oauthToken" -> oauthToken.asInstanceOf[js.Any],
        "platform"   -> platform.asInstanceOf[js.Any],
        "repository" -> repository.asInstanceOf[js.Any],
        "basicAuthCredentials" -> basicAuthCredentials.map { x =>
          x.asInstanceOf[js.Any]
        },
        "buildSpec" -> buildSpec.map { x =>
          x.asInstanceOf[js.Any]
        },
        "customRules" -> customRules.map { x =>
          x.asInstanceOf[js.Any]
        },
        "description" -> description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "enableBasicAuth" -> enableBasicAuth.map { x =>
          x.asInstanceOf[js.Any]
        },
        "enableBranchAutoBuild" -> enableBranchAutoBuild.map { x =>
          x.asInstanceOf[js.Any]
        },
        "environmentVariables" -> environmentVariables.map { x =>
          x.asInstanceOf[js.Any]
        },
        "iamServiceRoleArn" -> iamServiceRoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAppRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "app" -> app.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAppResult]
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
    var enableAutoBuild: js.UndefOr[EnableAutoBuild]
    var enableBasicAuth: js.UndefOr[EnableBasicAuth]
    var enableNotification: js.UndefOr[EnableNotification]
    var environmentVariables: js.UndefOr[EnvironmentVariables]
    var framework: js.UndefOr[Framework]
    var stage: js.UndefOr[Stage]
    var tags: js.UndefOr[Tags]
    var ttl: js.UndefOr[TTL]
  }

  object CreateBranchRequest {
    def apply(
        appId: AppId,
        branchName: BranchName,
        basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined,
        buildSpec: js.UndefOr[BuildSpec] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        enableAutoBuild: js.UndefOr[EnableAutoBuild] = js.undefined,
        enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined,
        enableNotification: js.UndefOr[EnableNotification] = js.undefined,
        environmentVariables: js.UndefOr[EnvironmentVariables] = js.undefined,
        framework: js.UndefOr[Framework] = js.undefined,
        stage: js.UndefOr[Stage] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined,
        ttl: js.UndefOr[TTL] = js.undefined
    ): CreateBranchRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appId"      -> appId.asInstanceOf[js.Any],
        "branchName" -> branchName.asInstanceOf[js.Any],
        "basicAuthCredentials" -> basicAuthCredentials.map { x =>
          x.asInstanceOf[js.Any]
        },
        "buildSpec" -> buildSpec.map { x =>
          x.asInstanceOf[js.Any]
        },
        "description" -> description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "enableAutoBuild" -> enableAutoBuild.map { x =>
          x.asInstanceOf[js.Any]
        },
        "enableBasicAuth" -> enableBasicAuth.map { x =>
          x.asInstanceOf[js.Any]
        },
        "enableNotification" -> enableNotification.map { x =>
          x.asInstanceOf[js.Any]
        },
        "environmentVariables" -> environmentVariables.map { x =>
          x.asInstanceOf[js.Any]
        },
        "framework" -> framework.map { x =>
          x.asInstanceOf[js.Any]
        },
        "stage" -> stage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "tags" -> tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ttl" -> ttl.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBranchRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "branch" -> branch.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBranchResult]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "appId"             -> appId.asInstanceOf[js.Any],
        "domainName"        -> domainName.asInstanceOf[js.Any],
        "subDomainSettings" -> subDomainSettings.asInstanceOf[js.Any],
        "enableAutoSubDomain" -> enableAutoSubDomain.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDomainAssociationRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "domainAssociation" -> domainAssociation.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDomainAssociationResult]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "source" -> source.asInstanceOf[js.Any],
        "target" -> target.asInstanceOf[js.Any],
        "condition" -> condition.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CustomRule]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAppRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "app" -> app.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAppResult]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "appId"      -> appId.asInstanceOf[js.Any],
        "branchName" -> branchName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBranchRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "branch" -> branch.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBranchResult]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "appId"      -> appId.asInstanceOf[js.Any],
        "domainName" -> domainName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDomainAssociationRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "domainAssociation" -> domainAssociation.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDomainAssociationResult]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "appId"      -> appId.asInstanceOf[js.Any],
        "branchName" -> branchName.asInstanceOf[js.Any],
        "jobId"      -> jobId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteJobRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "jobSummary" -> jobSummary.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteJobResult]
    }
  }

  /**
    * Structure for Domain Association, which associates a custom domain with an Amplify App.
    */
  @js.native
  trait DomainAssociation extends js.Object {
    var certificateVerificationDNSRecord: CertificateVerificationDNSRecord
    var domainAssociationArn: DomainAssociationArn
    var domainName: DomainName
    var domainStatus: DomainStatus
    var enableAutoSubDomain: EnableAutoSubDomain
    var statusReason: StatusReason
    var subDomains: SubDomains
  }

  object DomainAssociation {
    def apply(
        certificateVerificationDNSRecord: CertificateVerificationDNSRecord,
        domainAssociationArn: DomainAssociationArn,
        domainName: DomainName,
        domainStatus: DomainStatus,
        enableAutoSubDomain: EnableAutoSubDomain,
        statusReason: StatusReason,
        subDomains: SubDomains
    ): DomainAssociation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "certificateVerificationDNSRecord" -> certificateVerificationDNSRecord.asInstanceOf[js.Any],
        "domainAssociationArn"             -> domainAssociationArn.asInstanceOf[js.Any],
        "domainName"                       -> domainName.asInstanceOf[js.Any],
        "domainStatus"                     -> domainStatus.asInstanceOf[js.Any],
        "enableAutoSubDomain"              -> enableAutoSubDomain.asInstanceOf[js.Any],
        "statusReason"                     -> statusReason.asInstanceOf[js.Any],
        "subDomains"                       -> subDomains.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DomainAssociation]
    }
  }

  object DomainStatusEnum {
    val PENDING_VERIFICATION = "PENDING_VERIFICATION"
    val IN_PROGRESS          = "IN_PROGRESS"
    val AVAILABLE            = "AVAILABLE"
    val PENDING_DEPLOYMENT   = "PENDING_DEPLOYMENT"
    val FAILED               = "FAILED"

    val values = IndexedSeq(PENDING_VERIFICATION, IN_PROGRESS, AVAILABLE, PENDING_DEPLOYMENT, FAILED)
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
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAppRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "app" -> app.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAppResult]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "appId"      -> appId.asInstanceOf[js.Any],
        "branchName" -> branchName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBranchRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "branch" -> branch.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetBranchResult]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "appId"      -> appId.asInstanceOf[js.Any],
        "domainName" -> domainName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDomainAssociationRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "domainAssociation" -> domainAssociation.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDomainAssociationResult]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "appId"      -> appId.asInstanceOf[js.Any],
        "branchName" -> branchName.asInstanceOf[js.Any],
        "jobId"      -> jobId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetJobRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "job" -> job.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetJobResult]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "steps"   -> steps.asInstanceOf[js.Any],
        "summary" -> summary.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Job]
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

    val values = IndexedSeq(PENDING, PROVISIONING, RUNNING, FAILED, SUCCEED, CANCELLING, CANCELLED)
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
      val _fields = IndexedSeq[(String, js.Any)](
        "commitId"      -> commitId.asInstanceOf[js.Any],
        "commitMessage" -> commitMessage.asInstanceOf[js.Any],
        "commitTime"    -> commitTime.asInstanceOf[js.Any],
        "jobArn"        -> jobArn.asInstanceOf[js.Any],
        "jobId"         -> jobId.asInstanceOf[js.Any],
        "jobType"       -> jobType.asInstanceOf[js.Any],
        "startTime"     -> startTime.asInstanceOf[js.Any],
        "status"        -> status.asInstanceOf[js.Any],
        "endTime" -> endTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[JobSummary]
    }
  }

  object JobTypeEnum {
    val RELEASE  = "RELEASE"
    val RETRY    = "RETRY"
    val WEB_HOOK = "WEB_HOOK"

    val values = IndexedSeq(RELEASE, RETRY, WEB_HOOK)
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
      val _fields = IndexedSeq[(String, js.Any)](
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAppsRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "apps" -> apps.asInstanceOf[js.Any],
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAppsResult]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.asInstanceOf[js.Any],
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBranchesRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "branches" -> branches.asInstanceOf[js.Any],
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBranchesResult]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.asInstanceOf[js.Any],
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDomainAssociationsRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "domainAssociations" -> domainAssociations.asInstanceOf[js.Any],
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDomainAssociationsResult]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "appId"      -> appId.asInstanceOf[js.Any],
        "branchName" -> branchName.asInstanceOf[js.Any],
        "maxResults" -> maxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "jobSummaries" -> jobSummaries.asInstanceOf[js.Any],
        "nextToken" -> nextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListJobsResult]
    }
  }

  object PlatformEnum {
    val IOS          = "IOS"
    val ANDROID      = "ANDROID"
    val WEB          = "WEB"
    val REACT_NATIVE = "REACT_NATIVE"

    val values = IndexedSeq(IOS, ANDROID, WEB, REACT_NATIVE)
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
      val _fields = IndexedSeq[(String, js.Any)](
        "branchName" -> branchName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "lastDeployTime" -> lastDeployTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "status" -> status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "thumbnailUrl" -> thumbnailUrl.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ProductionBranch]
    }
  }

  object StageEnum {
    val PRODUCTION   = "PRODUCTION"
    val BETA         = "BETA"
    val DEVELOPMENT  = "DEVELOPMENT"
    val EXPERIMENTAL = "EXPERIMENTAL"

    val values = IndexedSeq(PRODUCTION, BETA, DEVELOPMENT, EXPERIMENTAL)
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
      val _fields = IndexedSeq[(String, js.Any)](
        "appId"      -> appId.asInstanceOf[js.Any],
        "branchName" -> branchName.asInstanceOf[js.Any],
        "jobType"    -> jobType.asInstanceOf[js.Any],
        "commitId" -> commitId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "commitMessage" -> commitMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "commitTime" -> commitTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "jobId" -> jobId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "jobReason" -> jobReason.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartJobRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "jobSummary" -> jobSummary.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartJobResult]
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
    var logUrl: js.UndefOr[LogUrl]
    var screenshots: js.UndefOr[Screenshots]
  }

  object Step {
    def apply(
        endTime: EndTime,
        startTime: StartTime,
        status: JobStatus,
        stepName: StepName,
        artifactsUrl: js.UndefOr[ArtifactsUrl] = js.undefined,
        logUrl: js.UndefOr[LogUrl] = js.undefined,
        screenshots: js.UndefOr[Screenshots] = js.undefined
    ): Step = {
      val _fields = IndexedSeq[(String, js.Any)](
        "endTime"   -> endTime.asInstanceOf[js.Any],
        "startTime" -> startTime.asInstanceOf[js.Any],
        "status"    -> status.asInstanceOf[js.Any],
        "stepName"  -> stepName.asInstanceOf[js.Any],
        "artifactsUrl" -> artifactsUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "logUrl" -> logUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "screenshots" -> screenshots.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Step]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "appId"      -> appId.asInstanceOf[js.Any],
        "branchName" -> branchName.asInstanceOf[js.Any],
        "jobId"      -> jobId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopJobRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "jobSummary" -> jobSummary.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopJobResult]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "dnsRecord"        -> dnsRecord.asInstanceOf[js.Any],
        "subDomainSetting" -> subDomainSetting.asInstanceOf[js.Any],
        "verified"         -> verified.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubDomain]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "branchName" -> branchName.asInstanceOf[js.Any],
        "prefix"     -> prefix.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SubDomainSetting]
    }
  }

  /**
    * Request structure for update App request.
    */
  @js.native
  trait UpdateAppRequest extends js.Object {
    var appId: AppId
    var basicAuthCredentials: js.UndefOr[BasicAuthCredentials]
    var buildSpec: js.UndefOr[BuildSpec]
    var customRules: js.UndefOr[CustomRules]
    var description: js.UndefOr[Description]
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
        basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined,
        buildSpec: js.UndefOr[BuildSpec] = js.undefined,
        customRules: js.UndefOr[CustomRules] = js.undefined,
        description: js.UndefOr[Description] = js.undefined,
        enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined,
        enableBranchAutoBuild: js.UndefOr[EnableAutoBuild] = js.undefined,
        environmentVariables: js.UndefOr[EnvironmentVariables] = js.undefined,
        iamServiceRoleArn: js.UndefOr[ServiceRoleArn] = js.undefined,
        name: js.UndefOr[Name] = js.undefined,
        platform: js.UndefOr[Platform] = js.undefined
    ): UpdateAppRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appId" -> appId.asInstanceOf[js.Any],
        "basicAuthCredentials" -> basicAuthCredentials.map { x =>
          x.asInstanceOf[js.Any]
        },
        "buildSpec" -> buildSpec.map { x =>
          x.asInstanceOf[js.Any]
        },
        "customRules" -> customRules.map { x =>
          x.asInstanceOf[js.Any]
        },
        "description" -> description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "enableBasicAuth" -> enableBasicAuth.map { x =>
          x.asInstanceOf[js.Any]
        },
        "enableBranchAutoBuild" -> enableBranchAutoBuild.map { x =>
          x.asInstanceOf[js.Any]
        },
        "environmentVariables" -> environmentVariables.map { x =>
          x.asInstanceOf[js.Any]
        },
        "iamServiceRoleArn" -> iamServiceRoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "name" -> name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "platform" -> platform.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAppRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "app" -> app.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAppResult]
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
        enableAutoBuild: js.UndefOr[EnableAutoBuild] = js.undefined,
        enableBasicAuth: js.UndefOr[EnableBasicAuth] = js.undefined,
        enableNotification: js.UndefOr[EnableNotification] = js.undefined,
        environmentVariables: js.UndefOr[EnvironmentVariables] = js.undefined,
        framework: js.UndefOr[Framework] = js.undefined,
        stage: js.UndefOr[Stage] = js.undefined,
        ttl: js.UndefOr[TTL] = js.undefined
    ): UpdateBranchRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "appId"      -> appId.asInstanceOf[js.Any],
        "branchName" -> branchName.asInstanceOf[js.Any],
        "basicAuthCredentials" -> basicAuthCredentials.map { x =>
          x.asInstanceOf[js.Any]
        },
        "buildSpec" -> buildSpec.map { x =>
          x.asInstanceOf[js.Any]
        },
        "description" -> description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "enableAutoBuild" -> enableAutoBuild.map { x =>
          x.asInstanceOf[js.Any]
        },
        "enableBasicAuth" -> enableBasicAuth.map { x =>
          x.asInstanceOf[js.Any]
        },
        "enableNotification" -> enableNotification.map { x =>
          x.asInstanceOf[js.Any]
        },
        "environmentVariables" -> environmentVariables.map { x =>
          x.asInstanceOf[js.Any]
        },
        "framework" -> framework.map { x =>
          x.asInstanceOf[js.Any]
        },
        "stage" -> stage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ttl" -> ttl.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateBranchRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "branch" -> branch.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateBranchResult]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "appId"             -> appId.asInstanceOf[js.Any],
        "domainName"        -> domainName.asInstanceOf[js.Any],
        "subDomainSettings" -> subDomainSettings.asInstanceOf[js.Any],
        "enableAutoSubDomain" -> enableAutoSubDomain.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDomainAssociationRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "domainAssociation" -> domainAssociation.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDomainAssociationResult]
    }
  }
}
