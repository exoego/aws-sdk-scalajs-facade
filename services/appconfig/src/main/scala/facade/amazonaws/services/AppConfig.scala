package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object appconfig {
  type ApplicationList = js.Array[Application]
  type Arn = String
  type Blob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ConfigurationProfileSummaryList = js.Array[ConfigurationProfileSummary]
  type DeploymentEvents = js.Array[DeploymentEvent]
  type DeploymentList = js.Array[DeploymentSummary]
  type DeploymentStrategyId = String
  type DeploymentStrategyList = js.Array[DeploymentStrategy]
  type Description = String
  type EnvironmentList = js.Array[Environment]
  type GrowthFactor = Float
  type HostedConfigurationVersionSummaryList = js.Array[HostedConfigurationVersionSummary]
  type Id = String
  type Iso8601DateTime = js.Date
  type MaxResults = Int
  type MinutesBetween0And24Hours = Int
  type MonitorList = js.Array[Monitor]
  type Name = String
  type NextToken = String
  type Percentage = Float
  type RoleArn = String
  type StringWithLengthBetween0And32768 = String
  type StringWithLengthBetween1And255 = String
  type StringWithLengthBetween1And64 = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type Uri = String
  type ValidatorList = js.Array[Validator]
  type ValidatorTypeList = js.Array[ValidatorType]
  type Version = String

  implicit final class AppConfigOps(private val service: AppConfig) extends AnyVal {

    @inline def createApplicationFuture(params: CreateApplicationRequest): Future[Application] =
      service.createApplication(params).promise().toFuture
    @inline def createConfigurationProfileFuture(
        params: CreateConfigurationProfileRequest
    ): Future[ConfigurationProfile] = service.createConfigurationProfile(params).promise().toFuture
    @inline def createDeploymentStrategyFuture(params: CreateDeploymentStrategyRequest): Future[DeploymentStrategy] =
      service.createDeploymentStrategy(params).promise().toFuture
    @inline def createEnvironmentFuture(params: CreateEnvironmentRequest): Future[Environment] =
      service.createEnvironment(params).promise().toFuture
    @inline def createHostedConfigurationVersionFuture(
        params: CreateHostedConfigurationVersionRequest
    ): Future[HostedConfigurationVersion] = service.createHostedConfigurationVersion(params).promise().toFuture
    @inline def deleteApplicationFuture(params: DeleteApplicationRequest): Future[js.Object] =
      service.deleteApplication(params).promise().toFuture
    @inline def deleteConfigurationProfileFuture(params: DeleteConfigurationProfileRequest): Future[js.Object] =
      service.deleteConfigurationProfile(params).promise().toFuture
    @inline def deleteDeploymentStrategyFuture(params: DeleteDeploymentStrategyRequest): Future[js.Object] =
      service.deleteDeploymentStrategy(params).promise().toFuture
    @inline def deleteEnvironmentFuture(params: DeleteEnvironmentRequest): Future[js.Object] =
      service.deleteEnvironment(params).promise().toFuture
    @inline def deleteHostedConfigurationVersionFuture(
        params: DeleteHostedConfigurationVersionRequest
    ): Future[js.Object] = service.deleteHostedConfigurationVersion(params).promise().toFuture
    @inline def getApplicationFuture(params: GetApplicationRequest): Future[Application] =
      service.getApplication(params).promise().toFuture
    @inline def getConfigurationFuture(params: GetConfigurationRequest): Future[Configuration] =
      service.getConfiguration(params).promise().toFuture
    @inline def getConfigurationProfileFuture(params: GetConfigurationProfileRequest): Future[ConfigurationProfile] =
      service.getConfigurationProfile(params).promise().toFuture
    @inline def getDeploymentFuture(params: GetDeploymentRequest): Future[Deployment] =
      service.getDeployment(params).promise().toFuture
    @inline def getDeploymentStrategyFuture(params: GetDeploymentStrategyRequest): Future[DeploymentStrategy] =
      service.getDeploymentStrategy(params).promise().toFuture
    @inline def getEnvironmentFuture(params: GetEnvironmentRequest): Future[Environment] =
      service.getEnvironment(params).promise().toFuture
    @inline def getHostedConfigurationVersionFuture(
        params: GetHostedConfigurationVersionRequest
    ): Future[HostedConfigurationVersion] = service.getHostedConfigurationVersion(params).promise().toFuture
    @inline def listApplicationsFuture(params: ListApplicationsRequest): Future[Applications] =
      service.listApplications(params).promise().toFuture
    @inline def listConfigurationProfilesFuture(
        params: ListConfigurationProfilesRequest
    ): Future[ConfigurationProfiles] = service.listConfigurationProfiles(params).promise().toFuture
    @inline def listDeploymentStrategiesFuture(params: ListDeploymentStrategiesRequest): Future[DeploymentStrategies] =
      service.listDeploymentStrategies(params).promise().toFuture
    @inline def listDeploymentsFuture(params: ListDeploymentsRequest): Future[Deployments] =
      service.listDeployments(params).promise().toFuture
    @inline def listEnvironmentsFuture(params: ListEnvironmentsRequest): Future[Environments] =
      service.listEnvironments(params).promise().toFuture
    @inline def listHostedConfigurationVersionsFuture(
        params: ListHostedConfigurationVersionsRequest
    ): Future[HostedConfigurationVersions] = service.listHostedConfigurationVersions(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ResourceTags] =
      service.listTagsForResource(params).promise().toFuture
    @inline def startDeploymentFuture(params: StartDeploymentRequest): Future[Deployment] =
      service.startDeployment(params).promise().toFuture
    @inline def stopDeploymentFuture(params: StopDeploymentRequest): Future[Deployment] =
      service.stopDeployment(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise().toFuture
    @inline def updateApplicationFuture(params: UpdateApplicationRequest): Future[Application] =
      service.updateApplication(params).promise().toFuture
    @inline def updateConfigurationProfileFuture(
        params: UpdateConfigurationProfileRequest
    ): Future[ConfigurationProfile] = service.updateConfigurationProfile(params).promise().toFuture
    @inline def updateDeploymentStrategyFuture(params: UpdateDeploymentStrategyRequest): Future[DeploymentStrategy] =
      service.updateDeploymentStrategy(params).promise().toFuture
    @inline def updateEnvironmentFuture(params: UpdateEnvironmentRequest): Future[Environment] =
      service.updateEnvironment(params).promise().toFuture
    @inline def validateConfigurationFuture(params: ValidateConfigurationRequest): Future[js.Object] =
      service.validateConfiguration(params).promise().toFuture
  }
}

package appconfig {
  @js.native
  @JSImport("aws-sdk", "AppConfig", "AWS.AppConfig")
  class AppConfig() extends js.Object {
    def this(config: AWSConfig) = this()

    def createApplication(params: CreateApplicationRequest): Request[Application] = js.native
    def createConfigurationProfile(params: CreateConfigurationProfileRequest): Request[ConfigurationProfile] = js.native
    def createDeploymentStrategy(params: CreateDeploymentStrategyRequest): Request[DeploymentStrategy] = js.native
    def createEnvironment(params: CreateEnvironmentRequest): Request[Environment] = js.native
    def createHostedConfigurationVersion(
        params: CreateHostedConfigurationVersionRequest
    ): Request[HostedConfigurationVersion] = js.native
    def deleteApplication(params: DeleteApplicationRequest): Request[js.Object] = js.native
    def deleteConfigurationProfile(params: DeleteConfigurationProfileRequest): Request[js.Object] = js.native
    def deleteDeploymentStrategy(params: DeleteDeploymentStrategyRequest): Request[js.Object] = js.native
    def deleteEnvironment(params: DeleteEnvironmentRequest): Request[js.Object] = js.native
    def deleteHostedConfigurationVersion(params: DeleteHostedConfigurationVersionRequest): Request[js.Object] =
      js.native
    def getApplication(params: GetApplicationRequest): Request[Application] = js.native
    def getConfiguration(params: GetConfigurationRequest): Request[Configuration] = js.native
    def getConfigurationProfile(params: GetConfigurationProfileRequest): Request[ConfigurationProfile] = js.native
    def getDeployment(params: GetDeploymentRequest): Request[Deployment] = js.native
    def getDeploymentStrategy(params: GetDeploymentStrategyRequest): Request[DeploymentStrategy] = js.native
    def getEnvironment(params: GetEnvironmentRequest): Request[Environment] = js.native
    def getHostedConfigurationVersion(
        params: GetHostedConfigurationVersionRequest
    ): Request[HostedConfigurationVersion] = js.native
    def listApplications(params: ListApplicationsRequest): Request[Applications] = js.native
    def listConfigurationProfiles(params: ListConfigurationProfilesRequest): Request[ConfigurationProfiles] = js.native
    def listDeploymentStrategies(params: ListDeploymentStrategiesRequest): Request[DeploymentStrategies] = js.native
    def listDeployments(params: ListDeploymentsRequest): Request[Deployments] = js.native
    def listEnvironments(params: ListEnvironmentsRequest): Request[Environments] = js.native
    def listHostedConfigurationVersions(
        params: ListHostedConfigurationVersionsRequest
    ): Request[HostedConfigurationVersions] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ResourceTags] = js.native
    def startDeployment(params: StartDeploymentRequest): Request[Deployment] = js.native
    def stopDeployment(params: StopDeploymentRequest): Request[Deployment] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateApplication(params: UpdateApplicationRequest): Request[Application] = js.native
    def updateConfigurationProfile(params: UpdateConfigurationProfileRequest): Request[ConfigurationProfile] = js.native
    def updateDeploymentStrategy(params: UpdateDeploymentStrategyRequest): Request[DeploymentStrategy] = js.native
    def updateEnvironment(params: UpdateEnvironmentRequest): Request[Environment] = js.native
    def validateConfiguration(params: ValidateConfigurationRequest): Request[js.Object] = js.native
  }

  @js.native
  trait Application extends js.Object {
    var Description: js.UndefOr[Description]
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[Name]
  }

  object Application {
    @inline
    def apply(
        Description: js.UndefOr[Description] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined
    ): Application = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Application]
    }
  }

  @js.native
  trait Applications extends js.Object {
    var Items: js.UndefOr[ApplicationList]
    var NextToken: js.UndefOr[NextToken]
  }

  object Applications {
    @inline
    def apply(
        Items: js.UndefOr[ApplicationList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): Applications = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Applications]
    }
  }

  @js.native
  trait Configuration extends js.Object {
    var ConfigurationVersion: js.UndefOr[Version]
    var Content: js.UndefOr[Blob]
    var ContentType: js.UndefOr[String]
  }

  object Configuration {
    @inline
    def apply(
        ConfigurationVersion: js.UndefOr[Version] = js.undefined,
        Content: js.UndefOr[Blob] = js.undefined,
        ContentType: js.UndefOr[String] = js.undefined
    ): Configuration = {
      val __obj = js.Dynamic.literal()
      ConfigurationVersion.foreach(__v => __obj.updateDynamic("ConfigurationVersion")(__v.asInstanceOf[js.Any]))
      Content.foreach(__v => __obj.updateDynamic("Content")(__v.asInstanceOf[js.Any]))
      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Configuration]
    }
  }

  @js.native
  trait ConfigurationProfile extends js.Object {
    var ApplicationId: js.UndefOr[Id]
    var Description: js.UndefOr[Description]
    var Id: js.UndefOr[Id]
    var LocationUri: js.UndefOr[Uri]
    var Name: js.UndefOr[Name]
    var RetrievalRoleArn: js.UndefOr[RoleArn]
    var Validators: js.UndefOr[ValidatorList]
  }

  object ConfigurationProfile {
    @inline
    def apply(
        ApplicationId: js.UndefOr[Id] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        LocationUri: js.UndefOr[Uri] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        RetrievalRoleArn: js.UndefOr[RoleArn] = js.undefined,
        Validators: js.UndefOr[ValidatorList] = js.undefined
    ): ConfigurationProfile = {
      val __obj = js.Dynamic.literal()
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LocationUri.foreach(__v => __obj.updateDynamic("LocationUri")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RetrievalRoleArn.foreach(__v => __obj.updateDynamic("RetrievalRoleArn")(__v.asInstanceOf[js.Any]))
      Validators.foreach(__v => __obj.updateDynamic("Validators")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigurationProfile]
    }
  }

  /**
    * A summary of a configuration profile.
    */
  @js.native
  trait ConfigurationProfileSummary extends js.Object {
    var ApplicationId: js.UndefOr[Id]
    var Id: js.UndefOr[Id]
    var LocationUri: js.UndefOr[Uri]
    var Name: js.UndefOr[Name]
    var ValidatorTypes: js.UndefOr[ValidatorTypeList]
  }

  object ConfigurationProfileSummary {
    @inline
    def apply(
        ApplicationId: js.UndefOr[Id] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        LocationUri: js.UndefOr[Uri] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        ValidatorTypes: js.UndefOr[ValidatorTypeList] = js.undefined
    ): ConfigurationProfileSummary = {
      val __obj = js.Dynamic.literal()
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LocationUri.foreach(__v => __obj.updateDynamic("LocationUri")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ValidatorTypes.foreach(__v => __obj.updateDynamic("ValidatorTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigurationProfileSummary]
    }
  }

  @js.native
  trait ConfigurationProfiles extends js.Object {
    var Items: js.UndefOr[ConfigurationProfileSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ConfigurationProfiles {
    @inline
    def apply(
        Items: js.UndefOr[ConfigurationProfileSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ConfigurationProfiles = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigurationProfiles]
    }
  }

  @js.native
  trait CreateApplicationRequest extends js.Object {
    var Name: Name
    var Description: js.UndefOr[Description]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateApplicationRequest {
    @inline
    def apply(
        Name: Name,
        Description: js.UndefOr[Description] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApplicationRequest]
    }
  }

  @js.native
  trait CreateConfigurationProfileRequest extends js.Object {
    var ApplicationId: Id
    var LocationUri: Uri
    var Name: Name
    var Description: js.UndefOr[Description]
    var RetrievalRoleArn: js.UndefOr[RoleArn]
    var Tags: js.UndefOr[TagMap]
    var Validators: js.UndefOr[ValidatorList]
  }

  object CreateConfigurationProfileRequest {
    @inline
    def apply(
        ApplicationId: Id,
        LocationUri: Uri,
        Name: Name,
        Description: js.UndefOr[Description] = js.undefined,
        RetrievalRoleArn: js.UndefOr[RoleArn] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        Validators: js.UndefOr[ValidatorList] = js.undefined
    ): CreateConfigurationProfileRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "LocationUri" -> LocationUri.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      RetrievalRoleArn.foreach(__v => __obj.updateDynamic("RetrievalRoleArn")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Validators.foreach(__v => __obj.updateDynamic("Validators")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConfigurationProfileRequest]
    }
  }

  @js.native
  trait CreateDeploymentStrategyRequest extends js.Object {
    var DeploymentDurationInMinutes: MinutesBetween0And24Hours
    var GrowthFactor: GrowthFactor
    var Name: Name
    var ReplicateTo: ReplicateTo
    var Description: js.UndefOr[Description]
    var FinalBakeTimeInMinutes: js.UndefOr[MinutesBetween0And24Hours]
    var GrowthType: js.UndefOr[GrowthType]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateDeploymentStrategyRequest {
    @inline
    def apply(
        DeploymentDurationInMinutes: MinutesBetween0And24Hours,
        GrowthFactor: GrowthFactor,
        Name: Name,
        ReplicateTo: ReplicateTo,
        Description: js.UndefOr[Description] = js.undefined,
        FinalBakeTimeInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.undefined,
        GrowthType: js.UndefOr[GrowthType] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateDeploymentStrategyRequest = {
      val __obj = js.Dynamic.literal(
        "DeploymentDurationInMinutes" -> DeploymentDurationInMinutes.asInstanceOf[js.Any],
        "GrowthFactor" -> GrowthFactor.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "ReplicateTo" -> ReplicateTo.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      FinalBakeTimeInMinutes.foreach(__v => __obj.updateDynamic("FinalBakeTimeInMinutes")(__v.asInstanceOf[js.Any]))
      GrowthType.foreach(__v => __obj.updateDynamic("GrowthType")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeploymentStrategyRequest]
    }
  }

  @js.native
  trait CreateEnvironmentRequest extends js.Object {
    var ApplicationId: Id
    var Name: Name
    var Description: js.UndefOr[Description]
    var Monitors: js.UndefOr[MonitorList]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateEnvironmentRequest {
    @inline
    def apply(
        ApplicationId: Id,
        Name: Name,
        Description: js.UndefOr[Description] = js.undefined,
        Monitors: js.UndefOr[MonitorList] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateEnvironmentRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Monitors.foreach(__v => __obj.updateDynamic("Monitors")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEnvironmentRequest]
    }
  }

  @js.native
  trait CreateHostedConfigurationVersionRequest extends js.Object {
    var ApplicationId: Id
    var ConfigurationProfileId: Id
    var Content: Blob
    var ContentType: StringWithLengthBetween1And255
    var Description: js.UndefOr[Description]
    var LatestVersionNumber: js.UndefOr[Int]
  }

  object CreateHostedConfigurationVersionRequest {
    @inline
    def apply(
        ApplicationId: Id,
        ConfigurationProfileId: Id,
        Content: Blob,
        ContentType: StringWithLengthBetween1And255,
        Description: js.UndefOr[Description] = js.undefined,
        LatestVersionNumber: js.UndefOr[Int] = js.undefined
    ): CreateHostedConfigurationVersionRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "ConfigurationProfileId" -> ConfigurationProfileId.asInstanceOf[js.Any],
        "Content" -> Content.asInstanceOf[js.Any],
        "ContentType" -> ContentType.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LatestVersionNumber.foreach(__v => __obj.updateDynamic("LatestVersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateHostedConfigurationVersionRequest]
    }
  }

  @js.native
  trait DeleteApplicationRequest extends js.Object {
    var ApplicationId: Id
  }

  object DeleteApplicationRequest {
    @inline
    def apply(
        ApplicationId: Id
    ): DeleteApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteApplicationRequest]
    }
  }

  @js.native
  trait DeleteConfigurationProfileRequest extends js.Object {
    var ApplicationId: Id
    var ConfigurationProfileId: Id
  }

  object DeleteConfigurationProfileRequest {
    @inline
    def apply(
        ApplicationId: Id,
        ConfigurationProfileId: Id
    ): DeleteConfigurationProfileRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "ConfigurationProfileId" -> ConfigurationProfileId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteConfigurationProfileRequest]
    }
  }

  @js.native
  trait DeleteDeploymentStrategyRequest extends js.Object {
    var DeploymentStrategyId: DeploymentStrategyId
  }

  object DeleteDeploymentStrategyRequest {
    @inline
    def apply(
        DeploymentStrategyId: DeploymentStrategyId
    ): DeleteDeploymentStrategyRequest = {
      val __obj = js.Dynamic.literal(
        "DeploymentStrategyId" -> DeploymentStrategyId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDeploymentStrategyRequest]
    }
  }

  @js.native
  trait DeleteEnvironmentRequest extends js.Object {
    var ApplicationId: Id
    var EnvironmentId: Id
  }

  object DeleteEnvironmentRequest {
    @inline
    def apply(
        ApplicationId: Id,
        EnvironmentId: Id
    ): DeleteEnvironmentRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "EnvironmentId" -> EnvironmentId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteEnvironmentRequest]
    }
  }

  @js.native
  trait DeleteHostedConfigurationVersionRequest extends js.Object {
    var ApplicationId: Id
    var ConfigurationProfileId: Id
    var VersionNumber: Int
  }

  object DeleteHostedConfigurationVersionRequest {
    @inline
    def apply(
        ApplicationId: Id,
        ConfigurationProfileId: Id,
        VersionNumber: Int
    ): DeleteHostedConfigurationVersionRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "ConfigurationProfileId" -> ConfigurationProfileId.asInstanceOf[js.Any],
        "VersionNumber" -> VersionNumber.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteHostedConfigurationVersionRequest]
    }
  }

  @js.native
  trait Deployment extends js.Object {
    var ApplicationId: js.UndefOr[Id]
    var CompletedAt: js.UndefOr[Iso8601DateTime]
    var ConfigurationLocationUri: js.UndefOr[Uri]
    var ConfigurationName: js.UndefOr[Name]
    var ConfigurationProfileId: js.UndefOr[Id]
    var ConfigurationVersion: js.UndefOr[Version]
    var DeploymentDurationInMinutes: js.UndefOr[MinutesBetween0And24Hours]
    var DeploymentNumber: js.UndefOr[Int]
    var DeploymentStrategyId: js.UndefOr[Id]
    var Description: js.UndefOr[Description]
    var EnvironmentId: js.UndefOr[Id]
    var EventLog: js.UndefOr[DeploymentEvents]
    var FinalBakeTimeInMinutes: js.UndefOr[MinutesBetween0And24Hours]
    var GrowthFactor: js.UndefOr[Percentage]
    var GrowthType: js.UndefOr[GrowthType]
    var PercentageComplete: js.UndefOr[Percentage]
    var StartedAt: js.UndefOr[Iso8601DateTime]
    var State: js.UndefOr[DeploymentState]
  }

  object Deployment {
    @inline
    def apply(
        ApplicationId: js.UndefOr[Id] = js.undefined,
        CompletedAt: js.UndefOr[Iso8601DateTime] = js.undefined,
        ConfigurationLocationUri: js.UndefOr[Uri] = js.undefined,
        ConfigurationName: js.UndefOr[Name] = js.undefined,
        ConfigurationProfileId: js.UndefOr[Id] = js.undefined,
        ConfigurationVersion: js.UndefOr[Version] = js.undefined,
        DeploymentDurationInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.undefined,
        DeploymentNumber: js.UndefOr[Int] = js.undefined,
        DeploymentStrategyId: js.UndefOr[Id] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        EnvironmentId: js.UndefOr[Id] = js.undefined,
        EventLog: js.UndefOr[DeploymentEvents] = js.undefined,
        FinalBakeTimeInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.undefined,
        GrowthFactor: js.UndefOr[Percentage] = js.undefined,
        GrowthType: js.UndefOr[GrowthType] = js.undefined,
        PercentageComplete: js.UndefOr[Percentage] = js.undefined,
        StartedAt: js.UndefOr[Iso8601DateTime] = js.undefined,
        State: js.UndefOr[DeploymentState] = js.undefined
    ): Deployment = {
      val __obj = js.Dynamic.literal()
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      CompletedAt.foreach(__v => __obj.updateDynamic("CompletedAt")(__v.asInstanceOf[js.Any]))
      ConfigurationLocationUri.foreach(__v => __obj.updateDynamic("ConfigurationLocationUri")(__v.asInstanceOf[js.Any]))
      ConfigurationName.foreach(__v => __obj.updateDynamic("ConfigurationName")(__v.asInstanceOf[js.Any]))
      ConfigurationProfileId.foreach(__v => __obj.updateDynamic("ConfigurationProfileId")(__v.asInstanceOf[js.Any]))
      ConfigurationVersion.foreach(__v => __obj.updateDynamic("ConfigurationVersion")(__v.asInstanceOf[js.Any]))
      DeploymentDurationInMinutes.foreach(__v =>
        __obj.updateDynamic("DeploymentDurationInMinutes")(__v.asInstanceOf[js.Any])
      )
      DeploymentNumber.foreach(__v => __obj.updateDynamic("DeploymentNumber")(__v.asInstanceOf[js.Any]))
      DeploymentStrategyId.foreach(__v => __obj.updateDynamic("DeploymentStrategyId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EnvironmentId.foreach(__v => __obj.updateDynamic("EnvironmentId")(__v.asInstanceOf[js.Any]))
      EventLog.foreach(__v => __obj.updateDynamic("EventLog")(__v.asInstanceOf[js.Any]))
      FinalBakeTimeInMinutes.foreach(__v => __obj.updateDynamic("FinalBakeTimeInMinutes")(__v.asInstanceOf[js.Any]))
      GrowthFactor.foreach(__v => __obj.updateDynamic("GrowthFactor")(__v.asInstanceOf[js.Any]))
      GrowthType.foreach(__v => __obj.updateDynamic("GrowthType")(__v.asInstanceOf[js.Any]))
      PercentageComplete.foreach(__v => __obj.updateDynamic("PercentageComplete")(__v.asInstanceOf[js.Any]))
      StartedAt.foreach(__v => __obj.updateDynamic("StartedAt")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Deployment]
    }
  }

  /**
    * An object that describes a deployment event.
    */
  @js.native
  trait DeploymentEvent extends js.Object {
    var Description: js.UndefOr[Description]
    var EventType: js.UndefOr[DeploymentEventType]
    var OccurredAt: js.UndefOr[Iso8601DateTime]
    var TriggeredBy: js.UndefOr[TriggeredBy]
  }

  object DeploymentEvent {
    @inline
    def apply(
        Description: js.UndefOr[Description] = js.undefined,
        EventType: js.UndefOr[DeploymentEventType] = js.undefined,
        OccurredAt: js.UndefOr[Iso8601DateTime] = js.undefined,
        TriggeredBy: js.UndefOr[TriggeredBy] = js.undefined
    ): DeploymentEvent = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EventType.foreach(__v => __obj.updateDynamic("EventType")(__v.asInstanceOf[js.Any]))
      OccurredAt.foreach(__v => __obj.updateDynamic("OccurredAt")(__v.asInstanceOf[js.Any]))
      TriggeredBy.foreach(__v => __obj.updateDynamic("TriggeredBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeploymentEvent]
    }
  }

  @js.native
  sealed trait DeploymentEventType extends js.Any
  object DeploymentEventType extends js.Object {
    val PERCENTAGE_UPDATED = "PERCENTAGE_UPDATED".asInstanceOf[DeploymentEventType]
    val ROLLBACK_STARTED = "ROLLBACK_STARTED".asInstanceOf[DeploymentEventType]
    val ROLLBACK_COMPLETED = "ROLLBACK_COMPLETED".asInstanceOf[DeploymentEventType]
    val BAKE_TIME_STARTED = "BAKE_TIME_STARTED".asInstanceOf[DeploymentEventType]
    val DEPLOYMENT_STARTED = "DEPLOYMENT_STARTED".asInstanceOf[DeploymentEventType]
    val DEPLOYMENT_COMPLETED = "DEPLOYMENT_COMPLETED".asInstanceOf[DeploymentEventType]

    val values = js.Object.freeze(
      js.Array(
        PERCENTAGE_UPDATED,
        ROLLBACK_STARTED,
        ROLLBACK_COMPLETED,
        BAKE_TIME_STARTED,
        DEPLOYMENT_STARTED,
        DEPLOYMENT_COMPLETED
      )
    )
  }

  @js.native
  sealed trait DeploymentState extends js.Any
  object DeploymentState extends js.Object {
    val BAKING = "BAKING".asInstanceOf[DeploymentState]
    val VALIDATING = "VALIDATING".asInstanceOf[DeploymentState]
    val DEPLOYING = "DEPLOYING".asInstanceOf[DeploymentState]
    val COMPLETE = "COMPLETE".asInstanceOf[DeploymentState]
    val ROLLING_BACK = "ROLLING_BACK".asInstanceOf[DeploymentState]
    val ROLLED_BACK = "ROLLED_BACK".asInstanceOf[DeploymentState]

    val values = js.Object.freeze(js.Array(BAKING, VALIDATING, DEPLOYING, COMPLETE, ROLLING_BACK, ROLLED_BACK))
  }

  @js.native
  trait DeploymentStrategies extends js.Object {
    var Items: js.UndefOr[DeploymentStrategyList]
    var NextToken: js.UndefOr[NextToken]
  }

  object DeploymentStrategies {
    @inline
    def apply(
        Items: js.UndefOr[DeploymentStrategyList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DeploymentStrategies = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeploymentStrategies]
    }
  }

  @js.native
  trait DeploymentStrategy extends js.Object {
    var DeploymentDurationInMinutes: js.UndefOr[MinutesBetween0And24Hours]
    var Description: js.UndefOr[Description]
    var FinalBakeTimeInMinutes: js.UndefOr[MinutesBetween0And24Hours]
    var GrowthFactor: js.UndefOr[Percentage]
    var GrowthType: js.UndefOr[GrowthType]
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[Name]
    var ReplicateTo: js.UndefOr[ReplicateTo]
  }

  object DeploymentStrategy {
    @inline
    def apply(
        DeploymentDurationInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        FinalBakeTimeInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.undefined,
        GrowthFactor: js.UndefOr[Percentage] = js.undefined,
        GrowthType: js.UndefOr[GrowthType] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        ReplicateTo: js.UndefOr[ReplicateTo] = js.undefined
    ): DeploymentStrategy = {
      val __obj = js.Dynamic.literal()
      DeploymentDurationInMinutes.foreach(__v =>
        __obj.updateDynamic("DeploymentDurationInMinutes")(__v.asInstanceOf[js.Any])
      )
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      FinalBakeTimeInMinutes.foreach(__v => __obj.updateDynamic("FinalBakeTimeInMinutes")(__v.asInstanceOf[js.Any]))
      GrowthFactor.foreach(__v => __obj.updateDynamic("GrowthFactor")(__v.asInstanceOf[js.Any]))
      GrowthType.foreach(__v => __obj.updateDynamic("GrowthType")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ReplicateTo.foreach(__v => __obj.updateDynamic("ReplicateTo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeploymentStrategy]
    }
  }

  /**
    * Information about the deployment.
    */
  @js.native
  trait DeploymentSummary extends js.Object {
    var CompletedAt: js.UndefOr[Iso8601DateTime]
    var ConfigurationName: js.UndefOr[Name]
    var ConfigurationVersion: js.UndefOr[Version]
    var DeploymentDurationInMinutes: js.UndefOr[MinutesBetween0And24Hours]
    var DeploymentNumber: js.UndefOr[Int]
    var FinalBakeTimeInMinutes: js.UndefOr[MinutesBetween0And24Hours]
    var GrowthFactor: js.UndefOr[Percentage]
    var GrowthType: js.UndefOr[GrowthType]
    var PercentageComplete: js.UndefOr[Percentage]
    var StartedAt: js.UndefOr[Iso8601DateTime]
    var State: js.UndefOr[DeploymentState]
  }

  object DeploymentSummary {
    @inline
    def apply(
        CompletedAt: js.UndefOr[Iso8601DateTime] = js.undefined,
        ConfigurationName: js.UndefOr[Name] = js.undefined,
        ConfigurationVersion: js.UndefOr[Version] = js.undefined,
        DeploymentDurationInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.undefined,
        DeploymentNumber: js.UndefOr[Int] = js.undefined,
        FinalBakeTimeInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.undefined,
        GrowthFactor: js.UndefOr[Percentage] = js.undefined,
        GrowthType: js.UndefOr[GrowthType] = js.undefined,
        PercentageComplete: js.UndefOr[Percentage] = js.undefined,
        StartedAt: js.UndefOr[Iso8601DateTime] = js.undefined,
        State: js.UndefOr[DeploymentState] = js.undefined
    ): DeploymentSummary = {
      val __obj = js.Dynamic.literal()
      CompletedAt.foreach(__v => __obj.updateDynamic("CompletedAt")(__v.asInstanceOf[js.Any]))
      ConfigurationName.foreach(__v => __obj.updateDynamic("ConfigurationName")(__v.asInstanceOf[js.Any]))
      ConfigurationVersion.foreach(__v => __obj.updateDynamic("ConfigurationVersion")(__v.asInstanceOf[js.Any]))
      DeploymentDurationInMinutes.foreach(__v =>
        __obj.updateDynamic("DeploymentDurationInMinutes")(__v.asInstanceOf[js.Any])
      )
      DeploymentNumber.foreach(__v => __obj.updateDynamic("DeploymentNumber")(__v.asInstanceOf[js.Any]))
      FinalBakeTimeInMinutes.foreach(__v => __obj.updateDynamic("FinalBakeTimeInMinutes")(__v.asInstanceOf[js.Any]))
      GrowthFactor.foreach(__v => __obj.updateDynamic("GrowthFactor")(__v.asInstanceOf[js.Any]))
      GrowthType.foreach(__v => __obj.updateDynamic("GrowthType")(__v.asInstanceOf[js.Any]))
      PercentageComplete.foreach(__v => __obj.updateDynamic("PercentageComplete")(__v.asInstanceOf[js.Any]))
      StartedAt.foreach(__v => __obj.updateDynamic("StartedAt")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeploymentSummary]
    }
  }

  @js.native
  trait Deployments extends js.Object {
    var Items: js.UndefOr[DeploymentList]
    var NextToken: js.UndefOr[NextToken]
  }

  object Deployments {
    @inline
    def apply(
        Items: js.UndefOr[DeploymentList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): Deployments = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Deployments]
    }
  }

  @js.native
  trait Environment extends js.Object {
    var ApplicationId: js.UndefOr[Id]
    var Description: js.UndefOr[Description]
    var Id: js.UndefOr[Id]
    var Monitors: js.UndefOr[MonitorList]
    var Name: js.UndefOr[Name]
    var State: js.UndefOr[EnvironmentState]
  }

  object Environment {
    @inline
    def apply(
        ApplicationId: js.UndefOr[Id] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        Monitors: js.UndefOr[MonitorList] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        State: js.UndefOr[EnvironmentState] = js.undefined
    ): Environment = {
      val __obj = js.Dynamic.literal()
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Monitors.foreach(__v => __obj.updateDynamic("Monitors")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Environment]
    }
  }

  @js.native
  sealed trait EnvironmentState extends js.Any
  object EnvironmentState extends js.Object {
    val READY_FOR_DEPLOYMENT = "READY_FOR_DEPLOYMENT".asInstanceOf[EnvironmentState]
    val DEPLOYING = "DEPLOYING".asInstanceOf[EnvironmentState]
    val ROLLING_BACK = "ROLLING_BACK".asInstanceOf[EnvironmentState]
    val ROLLED_BACK = "ROLLED_BACK".asInstanceOf[EnvironmentState]

    val values = js.Object.freeze(js.Array(READY_FOR_DEPLOYMENT, DEPLOYING, ROLLING_BACK, ROLLED_BACK))
  }

  @js.native
  trait Environments extends js.Object {
    var Items: js.UndefOr[EnvironmentList]
    var NextToken: js.UndefOr[NextToken]
  }

  object Environments {
    @inline
    def apply(
        Items: js.UndefOr[EnvironmentList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): Environments = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Environments]
    }
  }

  @js.native
  trait GetApplicationRequest extends js.Object {
    var ApplicationId: Id
  }

  object GetApplicationRequest {
    @inline
    def apply(
        ApplicationId: Id
    ): GetApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetApplicationRequest]
    }
  }

  @js.native
  trait GetConfigurationProfileRequest extends js.Object {
    var ApplicationId: Id
    var ConfigurationProfileId: Id
  }

  object GetConfigurationProfileRequest {
    @inline
    def apply(
        ApplicationId: Id,
        ConfigurationProfileId: Id
    ): GetConfigurationProfileRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "ConfigurationProfileId" -> ConfigurationProfileId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetConfigurationProfileRequest]
    }
  }

  @js.native
  trait GetConfigurationRequest extends js.Object {
    var Application: StringWithLengthBetween1And64
    var ClientId: StringWithLengthBetween1And64
    var Configuration: StringWithLengthBetween1And64
    var Environment: StringWithLengthBetween1And64
    var ClientConfigurationVersion: js.UndefOr[Version]
  }

  object GetConfigurationRequest {
    @inline
    def apply(
        Application: StringWithLengthBetween1And64,
        ClientId: StringWithLengthBetween1And64,
        Configuration: StringWithLengthBetween1And64,
        Environment: StringWithLengthBetween1And64,
        ClientConfigurationVersion: js.UndefOr[Version] = js.undefined
    ): GetConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "Application" -> Application.asInstanceOf[js.Any],
        "ClientId" -> ClientId.asInstanceOf[js.Any],
        "Configuration" -> Configuration.asInstanceOf[js.Any],
        "Environment" -> Environment.asInstanceOf[js.Any]
      )

      ClientConfigurationVersion.foreach(__v =>
        __obj.updateDynamic("ClientConfigurationVersion")(__v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[GetConfigurationRequest]
    }
  }

  @js.native
  trait GetDeploymentRequest extends js.Object {
    var ApplicationId: Id
    var DeploymentNumber: Int
    var EnvironmentId: Id
  }

  object GetDeploymentRequest {
    @inline
    def apply(
        ApplicationId: Id,
        DeploymentNumber: Int,
        EnvironmentId: Id
    ): GetDeploymentRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "DeploymentNumber" -> DeploymentNumber.asInstanceOf[js.Any],
        "EnvironmentId" -> EnvironmentId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDeploymentRequest]
    }
  }

  @js.native
  trait GetDeploymentStrategyRequest extends js.Object {
    var DeploymentStrategyId: DeploymentStrategyId
  }

  object GetDeploymentStrategyRequest {
    @inline
    def apply(
        DeploymentStrategyId: DeploymentStrategyId
    ): GetDeploymentStrategyRequest = {
      val __obj = js.Dynamic.literal(
        "DeploymentStrategyId" -> DeploymentStrategyId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDeploymentStrategyRequest]
    }
  }

  @js.native
  trait GetEnvironmentRequest extends js.Object {
    var ApplicationId: Id
    var EnvironmentId: Id
  }

  object GetEnvironmentRequest {
    @inline
    def apply(
        ApplicationId: Id,
        EnvironmentId: Id
    ): GetEnvironmentRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "EnvironmentId" -> EnvironmentId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetEnvironmentRequest]
    }
  }

  @js.native
  trait GetHostedConfigurationVersionRequest extends js.Object {
    var ApplicationId: Id
    var ConfigurationProfileId: Id
    var VersionNumber: Int
  }

  object GetHostedConfigurationVersionRequest {
    @inline
    def apply(
        ApplicationId: Id,
        ConfigurationProfileId: Id,
        VersionNumber: Int
    ): GetHostedConfigurationVersionRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "ConfigurationProfileId" -> ConfigurationProfileId.asInstanceOf[js.Any],
        "VersionNumber" -> VersionNumber.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetHostedConfigurationVersionRequest]
    }
  }

  @js.native
  sealed trait GrowthType extends js.Any
  object GrowthType extends js.Object {
    val LINEAR = "LINEAR".asInstanceOf[GrowthType]
    val EXPONENTIAL = "EXPONENTIAL".asInstanceOf[GrowthType]

    val values = js.Object.freeze(js.Array(LINEAR, EXPONENTIAL))
  }

  @js.native
  trait HostedConfigurationVersion extends js.Object {
    var ApplicationId: js.UndefOr[Id]
    var ConfigurationProfileId: js.UndefOr[Id]
    var Content: js.UndefOr[Blob]
    var ContentType: js.UndefOr[StringWithLengthBetween1And255]
    var Description: js.UndefOr[Description]
    var VersionNumber: js.UndefOr[Int]
  }

  object HostedConfigurationVersion {
    @inline
    def apply(
        ApplicationId: js.UndefOr[Id] = js.undefined,
        ConfigurationProfileId: js.UndefOr[Id] = js.undefined,
        Content: js.UndefOr[Blob] = js.undefined,
        ContentType: js.UndefOr[StringWithLengthBetween1And255] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        VersionNumber: js.UndefOr[Int] = js.undefined
    ): HostedConfigurationVersion = {
      val __obj = js.Dynamic.literal()
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      ConfigurationProfileId.foreach(__v => __obj.updateDynamic("ConfigurationProfileId")(__v.asInstanceOf[js.Any]))
      Content.foreach(__v => __obj.updateDynamic("Content")(__v.asInstanceOf[js.Any]))
      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      VersionNumber.foreach(__v => __obj.updateDynamic("VersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HostedConfigurationVersion]
    }
  }

  /**
    * Information about the configuration.
    */
  @js.native
  trait HostedConfigurationVersionSummary extends js.Object {
    var ApplicationId: js.UndefOr[Id]
    var ConfigurationProfileId: js.UndefOr[Id]
    var ContentType: js.UndefOr[StringWithLengthBetween1And255]
    var Description: js.UndefOr[Description]
    var VersionNumber: js.UndefOr[Int]
  }

  object HostedConfigurationVersionSummary {
    @inline
    def apply(
        ApplicationId: js.UndefOr[Id] = js.undefined,
        ConfigurationProfileId: js.UndefOr[Id] = js.undefined,
        ContentType: js.UndefOr[StringWithLengthBetween1And255] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        VersionNumber: js.UndefOr[Int] = js.undefined
    ): HostedConfigurationVersionSummary = {
      val __obj = js.Dynamic.literal()
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      ConfigurationProfileId.foreach(__v => __obj.updateDynamic("ConfigurationProfileId")(__v.asInstanceOf[js.Any]))
      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      VersionNumber.foreach(__v => __obj.updateDynamic("VersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HostedConfigurationVersionSummary]
    }
  }

  @js.native
  trait HostedConfigurationVersions extends js.Object {
    var Items: js.UndefOr[HostedConfigurationVersionSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object HostedConfigurationVersions {
    @inline
    def apply(
        Items: js.UndefOr[HostedConfigurationVersionSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): HostedConfigurationVersions = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HostedConfigurationVersions]
    }
  }

  @js.native
  trait ListApplicationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListApplicationsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListApplicationsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApplicationsRequest]
    }
  }

  @js.native
  trait ListConfigurationProfilesRequest extends js.Object {
    var ApplicationId: Id
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListConfigurationProfilesRequest {
    @inline
    def apply(
        ApplicationId: Id,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListConfigurationProfilesRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConfigurationProfilesRequest]
    }
  }

  @js.native
  trait ListDeploymentStrategiesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDeploymentStrategiesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDeploymentStrategiesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeploymentStrategiesRequest]
    }
  }

  @js.native
  trait ListDeploymentsRequest extends js.Object {
    var ApplicationId: Id
    var EnvironmentId: Id
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDeploymentsRequest {
    @inline
    def apply(
        ApplicationId: Id,
        EnvironmentId: Id,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDeploymentsRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "EnvironmentId" -> EnvironmentId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeploymentsRequest]
    }
  }

  @js.native
  trait ListEnvironmentsRequest extends js.Object {
    var ApplicationId: Id
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListEnvironmentsRequest {
    @inline
    def apply(
        ApplicationId: Id,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEnvironmentsRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEnvironmentsRequest]
    }
  }

  @js.native
  trait ListHostedConfigurationVersionsRequest extends js.Object {
    var ApplicationId: Id
    var ConfigurationProfileId: Id
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListHostedConfigurationVersionsRequest {
    @inline
    def apply(
        ApplicationId: Id,
        ConfigurationProfileId: Id,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListHostedConfigurationVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "ConfigurationProfileId" -> ConfigurationProfileId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListHostedConfigurationVersionsRequest]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: Arn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  /**
    * Amazon CloudWatch alarms to monitor during the deployment process.
    */
  @js.native
  trait Monitor extends js.Object {
    var AlarmArn: js.UndefOr[Arn]
    var AlarmRoleArn: js.UndefOr[RoleArn]
  }

  object Monitor {
    @inline
    def apply(
        AlarmArn: js.UndefOr[Arn] = js.undefined,
        AlarmRoleArn: js.UndefOr[RoleArn] = js.undefined
    ): Monitor = {
      val __obj = js.Dynamic.literal()
      AlarmArn.foreach(__v => __obj.updateDynamic("AlarmArn")(__v.asInstanceOf[js.Any]))
      AlarmRoleArn.foreach(__v => __obj.updateDynamic("AlarmRoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Monitor]
    }
  }

  @js.native
  sealed trait ReplicateTo extends js.Any
  object ReplicateTo extends js.Object {
    val NONE = "NONE".asInstanceOf[ReplicateTo]
    val SSM_DOCUMENT = "SSM_DOCUMENT".asInstanceOf[ReplicateTo]

    val values = js.Object.freeze(js.Array(NONE, SSM_DOCUMENT))
  }

  @js.native
  trait ResourceTags extends js.Object {
    var Tags: js.UndefOr[TagMap]
  }

  object ResourceTags {
    @inline
    def apply(
        Tags: js.UndefOr[TagMap] = js.undefined
    ): ResourceTags = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceTags]
    }
  }

  @js.native
  trait StartDeploymentRequest extends js.Object {
    var ApplicationId: Id
    var ConfigurationProfileId: Id
    var ConfigurationVersion: Version
    var DeploymentStrategyId: DeploymentStrategyId
    var EnvironmentId: Id
    var Description: js.UndefOr[Description]
    var Tags: js.UndefOr[TagMap]
  }

  object StartDeploymentRequest {
    @inline
    def apply(
        ApplicationId: Id,
        ConfigurationProfileId: Id,
        ConfigurationVersion: Version,
        DeploymentStrategyId: DeploymentStrategyId,
        EnvironmentId: Id,
        Description: js.UndefOr[Description] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): StartDeploymentRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "ConfigurationProfileId" -> ConfigurationProfileId.asInstanceOf[js.Any],
        "ConfigurationVersion" -> ConfigurationVersion.asInstanceOf[js.Any],
        "DeploymentStrategyId" -> DeploymentStrategyId.asInstanceOf[js.Any],
        "EnvironmentId" -> EnvironmentId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartDeploymentRequest]
    }
  }

  @js.native
  trait StopDeploymentRequest extends js.Object {
    var ApplicationId: Id
    var DeploymentNumber: Int
    var EnvironmentId: Id
  }

  object StopDeploymentRequest {
    @inline
    def apply(
        ApplicationId: Id,
        DeploymentNumber: Int,
        EnvironmentId: Id
    ): StopDeploymentRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "DeploymentNumber" -> DeploymentNumber.asInstanceOf[js.Any],
        "EnvironmentId" -> EnvironmentId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopDeploymentRequest]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var Tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn,
        Tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  sealed trait TriggeredBy extends js.Any
  object TriggeredBy extends js.Object {
    val USER = "USER".asInstanceOf[TriggeredBy]
    val APPCONFIG = "APPCONFIG".asInstanceOf[TriggeredBy]
    val CLOUDWATCH_ALARM = "CLOUDWATCH_ALARM".asInstanceOf[TriggeredBy]
    val INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[TriggeredBy]

    val values = js.Object.freeze(js.Array(USER, APPCONFIG, CLOUDWATCH_ALARM, INTERNAL_ERROR))
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: Arn,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UpdateApplicationRequest extends js.Object {
    var ApplicationId: Id
    var Description: js.UndefOr[Description]
    var Name: js.UndefOr[Name]
  }

  object UpdateApplicationRequest {
    @inline
    def apply(
        ApplicationId: Id,
        Description: js.UndefOr[Description] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined
    ): UpdateApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApplicationRequest]
    }
  }

  @js.native
  trait UpdateConfigurationProfileRequest extends js.Object {
    var ApplicationId: Id
    var ConfigurationProfileId: Id
    var Description: js.UndefOr[Description]
    var Name: js.UndefOr[Name]
    var RetrievalRoleArn: js.UndefOr[RoleArn]
    var Validators: js.UndefOr[ValidatorList]
  }

  object UpdateConfigurationProfileRequest {
    @inline
    def apply(
        ApplicationId: Id,
        ConfigurationProfileId: Id,
        Description: js.UndefOr[Description] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        RetrievalRoleArn: js.UndefOr[RoleArn] = js.undefined,
        Validators: js.UndefOr[ValidatorList] = js.undefined
    ): UpdateConfigurationProfileRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "ConfigurationProfileId" -> ConfigurationProfileId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RetrievalRoleArn.foreach(__v => __obj.updateDynamic("RetrievalRoleArn")(__v.asInstanceOf[js.Any]))
      Validators.foreach(__v => __obj.updateDynamic("Validators")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateConfigurationProfileRequest]
    }
  }

  @js.native
  trait UpdateDeploymentStrategyRequest extends js.Object {
    var DeploymentStrategyId: DeploymentStrategyId
    var DeploymentDurationInMinutes: js.UndefOr[MinutesBetween0And24Hours]
    var Description: js.UndefOr[Description]
    var FinalBakeTimeInMinutes: js.UndefOr[MinutesBetween0And24Hours]
    var GrowthFactor: js.UndefOr[GrowthFactor]
    var GrowthType: js.UndefOr[GrowthType]
  }

  object UpdateDeploymentStrategyRequest {
    @inline
    def apply(
        DeploymentStrategyId: DeploymentStrategyId,
        DeploymentDurationInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        FinalBakeTimeInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.undefined,
        GrowthFactor: js.UndefOr[GrowthFactor] = js.undefined,
        GrowthType: js.UndefOr[GrowthType] = js.undefined
    ): UpdateDeploymentStrategyRequest = {
      val __obj = js.Dynamic.literal(
        "DeploymentStrategyId" -> DeploymentStrategyId.asInstanceOf[js.Any]
      )

      DeploymentDurationInMinutes.foreach(__v =>
        __obj.updateDynamic("DeploymentDurationInMinutes")(__v.asInstanceOf[js.Any])
      )
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      FinalBakeTimeInMinutes.foreach(__v => __obj.updateDynamic("FinalBakeTimeInMinutes")(__v.asInstanceOf[js.Any]))
      GrowthFactor.foreach(__v => __obj.updateDynamic("GrowthFactor")(__v.asInstanceOf[js.Any]))
      GrowthType.foreach(__v => __obj.updateDynamic("GrowthType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDeploymentStrategyRequest]
    }
  }

  @js.native
  trait UpdateEnvironmentRequest extends js.Object {
    var ApplicationId: Id
    var EnvironmentId: Id
    var Description: js.UndefOr[Description]
    var Monitors: js.UndefOr[MonitorList]
    var Name: js.UndefOr[Name]
  }

  object UpdateEnvironmentRequest {
    @inline
    def apply(
        ApplicationId: Id,
        EnvironmentId: Id,
        Description: js.UndefOr[Description] = js.undefined,
        Monitors: js.UndefOr[MonitorList] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined
    ): UpdateEnvironmentRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "EnvironmentId" -> EnvironmentId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Monitors.foreach(__v => __obj.updateDynamic("Monitors")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEnvironmentRequest]
    }
  }

  @js.native
  trait ValidateConfigurationRequest extends js.Object {
    var ApplicationId: Id
    var ConfigurationProfileId: Id
    var ConfigurationVersion: Version
  }

  object ValidateConfigurationRequest {
    @inline
    def apply(
        ApplicationId: Id,
        ConfigurationProfileId: Id,
        ConfigurationVersion: Version
    ): ValidateConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any],
        "ConfigurationProfileId" -> ConfigurationProfileId.asInstanceOf[js.Any],
        "ConfigurationVersion" -> ConfigurationVersion.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ValidateConfigurationRequest]
    }
  }

  /**
    * A validator provides a syntactic or semantic check to ensure the configuration you want to deploy functions as intended. To validate your application configuration data, you provide a schema or a Lambda function that runs against the configuration. The configuration deployment or update can only proceed when the configuration data is valid.
    */
  @js.native
  trait Validator extends js.Object {
    var Content: StringWithLengthBetween0And32768
    var Type: ValidatorType
  }

  object Validator {
    @inline
    def apply(
        Content: StringWithLengthBetween0And32768,
        Type: ValidatorType
    ): Validator = {
      val __obj = js.Dynamic.literal(
        "Content" -> Content.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Validator]
    }
  }

  @js.native
  sealed trait ValidatorType extends js.Any
  object ValidatorType extends js.Object {
    val JSON_SCHEMA = "JSON_SCHEMA".asInstanceOf[ValidatorType]
    val LAMBDA = "LAMBDA".asInstanceOf[ValidatorType]

    val values = js.Object.freeze(js.Array(JSON_SCHEMA, LAMBDA))
  }
}
