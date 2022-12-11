package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object appconfig {
  type ActionInvocations = js.Array[ActionInvocation]
  type ActionList = js.Array[Action]
  type ActionsMap = js.Dictionary[ActionList]
  type ApplicationList = js.Array[Application]
  type AppliedExtensions = js.Array[AppliedExtension]
  type Arn = String
  type Blob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ConfigurationProfileSummaryList = js.Array[ConfigurationProfileSummary]
  type ConfigurationProfileType = String
  type DeploymentEvents = js.Array[DeploymentEvent]
  type DeploymentList = js.Array[DeploymentSummary]
  type DeploymentStrategyId = String
  type DeploymentStrategyList = js.Array[DeploymentStrategy]
  type Description = String
  type EnvironmentList = js.Array[Environment]
  type ExtensionAssociationSummaries = js.Array[ExtensionAssociationSummary]
  type ExtensionSummaries = js.Array[ExtensionSummary]
  type GrowthFactor = Float
  type HostedConfigurationVersionSummaryList = js.Array[HostedConfigurationVersionSummary]
  type Id = String
  type Identifier = String
  type Iso8601DateTime = js.Date
  type LongName = String
  type MaxResults = Int
  type MinutesBetween0And24Hours = Int
  type MonitorList = js.Array[Monitor]
  type Name = String
  type NextToken = String
  type ParameterMap = js.Dictionary[Parameter]
  type ParameterValueMap = js.Dictionary[StringWithLengthBetween1And2048]
  type Percentage = Float
  type QueryName = String
  type RoleArn = String
  type StringWithLengthBetween0And32768 = String
  type StringWithLengthBetween1And2048 = String
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

  final class AppConfigOps(private val service: AppConfig) extends AnyVal {

    @inline def createApplicationFuture(params: CreateApplicationRequest): Future[Application] = service.createApplication(params).promise().toFuture
    @inline def createConfigurationProfileFuture(params: CreateConfigurationProfileRequest): Future[ConfigurationProfile] = service.createConfigurationProfile(params).promise().toFuture
    @inline def createDeploymentStrategyFuture(params: CreateDeploymentStrategyRequest): Future[DeploymentStrategy] = service.createDeploymentStrategy(params).promise().toFuture
    @inline def createEnvironmentFuture(params: CreateEnvironmentRequest): Future[Environment] = service.createEnvironment(params).promise().toFuture
    @inline def createExtensionAssociationFuture(params: CreateExtensionAssociationRequest): Future[ExtensionAssociation] = service.createExtensionAssociation(params).promise().toFuture
    @inline def createExtensionFuture(params: CreateExtensionRequest): Future[Extension] = service.createExtension(params).promise().toFuture
    @inline def createHostedConfigurationVersionFuture(params: CreateHostedConfigurationVersionRequest): Future[HostedConfigurationVersion] = service.createHostedConfigurationVersion(params).promise().toFuture
    @inline def deleteApplicationFuture(params: DeleteApplicationRequest): Future[js.Object] = service.deleteApplication(params).promise().toFuture
    @inline def deleteConfigurationProfileFuture(params: DeleteConfigurationProfileRequest): Future[js.Object] = service.deleteConfigurationProfile(params).promise().toFuture
    @inline def deleteDeploymentStrategyFuture(params: DeleteDeploymentStrategyRequest): Future[js.Object] = service.deleteDeploymentStrategy(params).promise().toFuture
    @inline def deleteEnvironmentFuture(params: DeleteEnvironmentRequest): Future[js.Object] = service.deleteEnvironment(params).promise().toFuture
    @inline def deleteExtensionAssociationFuture(params: DeleteExtensionAssociationRequest): Future[js.Object] = service.deleteExtensionAssociation(params).promise().toFuture
    @inline def deleteExtensionFuture(params: DeleteExtensionRequest): Future[js.Object] = service.deleteExtension(params).promise().toFuture
    @inline def deleteHostedConfigurationVersionFuture(params: DeleteHostedConfigurationVersionRequest): Future[js.Object] = service.deleteHostedConfigurationVersion(params).promise().toFuture
    @inline def getApplicationFuture(params: GetApplicationRequest): Future[Application] = service.getApplication(params).promise().toFuture
    @inline def getConfigurationProfileFuture(params: GetConfigurationProfileRequest): Future[ConfigurationProfile] = service.getConfigurationProfile(params).promise().toFuture
    @inline def getDeploymentFuture(params: GetDeploymentRequest): Future[Deployment] = service.getDeployment(params).promise().toFuture
    @inline def getDeploymentStrategyFuture(params: GetDeploymentStrategyRequest): Future[DeploymentStrategy] = service.getDeploymentStrategy(params).promise().toFuture
    @inline def getEnvironmentFuture(params: GetEnvironmentRequest): Future[Environment] = service.getEnvironment(params).promise().toFuture
    @inline def getExtensionAssociationFuture(params: GetExtensionAssociationRequest): Future[ExtensionAssociation] = service.getExtensionAssociation(params).promise().toFuture
    @inline def getExtensionFuture(params: GetExtensionRequest): Future[Extension] = service.getExtension(params).promise().toFuture
    @inline def getHostedConfigurationVersionFuture(params: GetHostedConfigurationVersionRequest): Future[HostedConfigurationVersion] = service.getHostedConfigurationVersion(params).promise().toFuture
    @inline def listApplicationsFuture(params: ListApplicationsRequest): Future[Applications] = service.listApplications(params).promise().toFuture
    @inline def listConfigurationProfilesFuture(params: ListConfigurationProfilesRequest): Future[ConfigurationProfiles] = service.listConfigurationProfiles(params).promise().toFuture
    @inline def listDeploymentStrategiesFuture(params: ListDeploymentStrategiesRequest): Future[DeploymentStrategies] = service.listDeploymentStrategies(params).promise().toFuture
    @inline def listDeploymentsFuture(params: ListDeploymentsRequest): Future[Deployments] = service.listDeployments(params).promise().toFuture
    @inline def listEnvironmentsFuture(params: ListEnvironmentsRequest): Future[Environments] = service.listEnvironments(params).promise().toFuture
    @inline def listExtensionAssociationsFuture(params: ListExtensionAssociationsRequest): Future[ExtensionAssociations] = service.listExtensionAssociations(params).promise().toFuture
    @inline def listExtensionsFuture(params: ListExtensionsRequest): Future[Extensions] = service.listExtensions(params).promise().toFuture
    @inline def listHostedConfigurationVersionsFuture(params: ListHostedConfigurationVersionsRequest): Future[HostedConfigurationVersions] = service.listHostedConfigurationVersions(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ResourceTags] = service.listTagsForResource(params).promise().toFuture
    @inline def startDeploymentFuture(params: StartDeploymentRequest): Future[Deployment] = service.startDeployment(params).promise().toFuture
    @inline def stopDeploymentFuture(params: StopDeploymentRequest): Future[Deployment] = service.stopDeployment(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] = service.untagResource(params).promise().toFuture
    @inline def updateApplicationFuture(params: UpdateApplicationRequest): Future[Application] = service.updateApplication(params).promise().toFuture
    @inline def updateConfigurationProfileFuture(params: UpdateConfigurationProfileRequest): Future[ConfigurationProfile] = service.updateConfigurationProfile(params).promise().toFuture
    @inline def updateDeploymentStrategyFuture(params: UpdateDeploymentStrategyRequest): Future[DeploymentStrategy] = service.updateDeploymentStrategy(params).promise().toFuture
    @inline def updateEnvironmentFuture(params: UpdateEnvironmentRequest): Future[Environment] = service.updateEnvironment(params).promise().toFuture
    @inline def updateExtensionAssociationFuture(params: UpdateExtensionAssociationRequest): Future[ExtensionAssociation] = service.updateExtensionAssociation(params).promise().toFuture
    @inline def updateExtensionFuture(params: UpdateExtensionRequest): Future[Extension] = service.updateExtension(params).promise().toFuture
    @inline def validateConfigurationFuture(params: ValidateConfigurationRequest): Future[js.Object] = service.validateConfiguration(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/appconfig", JSImport.Namespace, "AWS.AppConfig")
  class AppConfig() extends js.Object {
    def this(config: AWSConfig) = this()

    @deprecated("This API has been deprecated in favor of the GetLatestConfiguration API used in conjunction with StartConfigurationSession.", "forever") def getConfiguration(params: GetConfigurationRequest): Request[Configuration] = js.native
    def createApplication(params: CreateApplicationRequest): Request[Application] = js.native
    def createConfigurationProfile(params: CreateConfigurationProfileRequest): Request[ConfigurationProfile] = js.native
    def createDeploymentStrategy(params: CreateDeploymentStrategyRequest): Request[DeploymentStrategy] = js.native
    def createEnvironment(params: CreateEnvironmentRequest): Request[Environment] = js.native
    def createExtension(params: CreateExtensionRequest): Request[Extension] = js.native
    def createExtensionAssociation(params: CreateExtensionAssociationRequest): Request[ExtensionAssociation] = js.native
    def createHostedConfigurationVersion(params: CreateHostedConfigurationVersionRequest): Request[HostedConfigurationVersion] = js.native
    def deleteApplication(params: DeleteApplicationRequest): Request[js.Object] = js.native
    def deleteConfigurationProfile(params: DeleteConfigurationProfileRequest): Request[js.Object] = js.native
    def deleteDeploymentStrategy(params: DeleteDeploymentStrategyRequest): Request[js.Object] = js.native
    def deleteEnvironment(params: DeleteEnvironmentRequest): Request[js.Object] = js.native
    def deleteExtension(params: DeleteExtensionRequest): Request[js.Object] = js.native
    def deleteExtensionAssociation(params: DeleteExtensionAssociationRequest): Request[js.Object] = js.native
    def deleteHostedConfigurationVersion(params: DeleteHostedConfigurationVersionRequest): Request[js.Object] = js.native
    def getApplication(params: GetApplicationRequest): Request[Application] = js.native
    def getConfigurationProfile(params: GetConfigurationProfileRequest): Request[ConfigurationProfile] = js.native
    def getDeployment(params: GetDeploymentRequest): Request[Deployment] = js.native
    def getDeploymentStrategy(params: GetDeploymentStrategyRequest): Request[DeploymentStrategy] = js.native
    def getEnvironment(params: GetEnvironmentRequest): Request[Environment] = js.native
    def getExtension(params: GetExtensionRequest): Request[Extension] = js.native
    def getExtensionAssociation(params: GetExtensionAssociationRequest): Request[ExtensionAssociation] = js.native
    def getHostedConfigurationVersion(params: GetHostedConfigurationVersionRequest): Request[HostedConfigurationVersion] = js.native
    def listApplications(params: ListApplicationsRequest): Request[Applications] = js.native
    def listConfigurationProfiles(params: ListConfigurationProfilesRequest): Request[ConfigurationProfiles] = js.native
    def listDeploymentStrategies(params: ListDeploymentStrategiesRequest): Request[DeploymentStrategies] = js.native
    def listDeployments(params: ListDeploymentsRequest): Request[Deployments] = js.native
    def listEnvironments(params: ListEnvironmentsRequest): Request[Environments] = js.native
    def listExtensionAssociations(params: ListExtensionAssociationsRequest): Request[ExtensionAssociations] = js.native
    def listExtensions(params: ListExtensionsRequest): Request[Extensions] = js.native
    def listHostedConfigurationVersions(params: ListHostedConfigurationVersionsRequest): Request[HostedConfigurationVersions] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ResourceTags] = js.native
    def startDeployment(params: StartDeploymentRequest): Request[Deployment] = js.native
    def stopDeployment(params: StopDeploymentRequest): Request[Deployment] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateApplication(params: UpdateApplicationRequest): Request[Application] = js.native
    def updateConfigurationProfile(params: UpdateConfigurationProfileRequest): Request[ConfigurationProfile] = js.native
    def updateDeploymentStrategy(params: UpdateDeploymentStrategyRequest): Request[DeploymentStrategy] = js.native
    def updateEnvironment(params: UpdateEnvironmentRequest): Request[Environment] = js.native
    def updateExtension(params: UpdateExtensionRequest): Request[Extension] = js.native
    def updateExtensionAssociation(params: UpdateExtensionAssociationRequest): Request[ExtensionAssociation] = js.native
    def validateConfiguration(params: ValidateConfigurationRequest): Request[js.Object] = js.native
  }
  object AppConfig {
    @inline implicit def toOps(service: AppConfig): AppConfigOps = {
      new AppConfigOps(service)
    }
  }

  /** An action defines the tasks the extension performs during the AppConfig workflow. Each action includes an action point such as <code>ON_CREATE_HOSTED_CONFIGURATION</code>, <code>PRE_DEPLOYMENT</code>, or <code>ON_DEPLOYMENT</code>. Each action also includes a name, a URI to an Lambda function, and an Amazon Resource Name (ARN) for an Identity and Access Management assume role. You specify the name, URI, and ARN for each <i>action point</i> defined in the extension. You can specify the following actions for an extension: * <code>PRE_CREATE_HOSTED_CONFIGURATION_VERSION</code> * <code>PRE_START_DEPLOYMENT</code> * <code>ON_DEPLOYMENT_START</code> * <code>ON_DEPLOYMENT_STEP</code> * <code>ON_DEPLOYMENT_BAKING</code> * <code>ON_DEPLOYMENT_COMPLETE</code> * <code>ON_DEPLOYMENT_ROLLED_BACK</code>
    */
  @js.native
  trait Action extends js.Object {
    var Description: js.UndefOr[Description]
    var Name: js.UndefOr[Name]
    var RoleArn: js.UndefOr[Arn]
    var Uri: js.UndefOr[Uri]
  }

  object Action {
    @inline
    def apply(
        Description: js.UndefOr[Description] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        RoleArn: js.UndefOr[Arn] = js.undefined,
        Uri: js.UndefOr[Uri] = js.undefined
    ): Action = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      Uri.foreach(__v => __obj.updateDynamic("Uri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Action]
    }
  }

  /** An extension that was invoked as part of a deployment event.
    */
  @js.native
  trait ActionInvocation extends js.Object {
    var ActionName: js.UndefOr[Name]
    var ErrorCode: js.UndefOr[String]
    var ErrorMessage: js.UndefOr[String]
    var ExtensionIdentifier: js.UndefOr[Identifier]
    var InvocationId: js.UndefOr[Id]
    var RoleArn: js.UndefOr[Arn]
    var Uri: js.UndefOr[Uri]
  }

  object ActionInvocation {
    @inline
    def apply(
        ActionName: js.UndefOr[Name] = js.undefined,
        ErrorCode: js.UndefOr[String] = js.undefined,
        ErrorMessage: js.UndefOr[String] = js.undefined,
        ExtensionIdentifier: js.UndefOr[Identifier] = js.undefined,
        InvocationId: js.UndefOr[Id] = js.undefined,
        RoleArn: js.UndefOr[Arn] = js.undefined,
        Uri: js.UndefOr[Uri] = js.undefined
    ): ActionInvocation = {
      val __obj = js.Dynamic.literal()
      ActionName.foreach(__v => __obj.updateDynamic("ActionName")(__v.asInstanceOf[js.Any]))
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      ExtensionIdentifier.foreach(__v => __obj.updateDynamic("ExtensionIdentifier")(__v.asInstanceOf[js.Any]))
      InvocationId.foreach(__v => __obj.updateDynamic("InvocationId")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      Uri.foreach(__v => __obj.updateDynamic("Uri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionInvocation]
    }
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

  /** An extension that was invoked during a deployment.
    */
  @js.native
  trait AppliedExtension extends js.Object {
    var ExtensionAssociationId: js.UndefOr[Id]
    var ExtensionId: js.UndefOr[Id]
    var Parameters: js.UndefOr[ParameterValueMap]
    var VersionNumber: js.UndefOr[Int]
  }

  object AppliedExtension {
    @inline
    def apply(
        ExtensionAssociationId: js.UndefOr[Id] = js.undefined,
        ExtensionId: js.UndefOr[Id] = js.undefined,
        Parameters: js.UndefOr[ParameterValueMap] = js.undefined,
        VersionNumber: js.UndefOr[Int] = js.undefined
    ): AppliedExtension = {
      val __obj = js.Dynamic.literal()
      ExtensionAssociationId.foreach(__v => __obj.updateDynamic("ExtensionAssociationId")(__v.asInstanceOf[js.Any]))
      ExtensionId.foreach(__v => __obj.updateDynamic("ExtensionId")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      VersionNumber.foreach(__v => __obj.updateDynamic("VersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AppliedExtension]
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
    var Name: js.UndefOr[LongName]
    var RetrievalRoleArn: js.UndefOr[RoleArn]
    var Type: js.UndefOr[ConfigurationProfileType]
    var Validators: js.UndefOr[ValidatorList]
  }

  object ConfigurationProfile {
    @inline
    def apply(
        ApplicationId: js.UndefOr[Id] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        LocationUri: js.UndefOr[Uri] = js.undefined,
        Name: js.UndefOr[LongName] = js.undefined,
        RetrievalRoleArn: js.UndefOr[RoleArn] = js.undefined,
        Type: js.UndefOr[ConfigurationProfileType] = js.undefined,
        Validators: js.UndefOr[ValidatorList] = js.undefined
    ): ConfigurationProfile = {
      val __obj = js.Dynamic.literal()
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LocationUri.foreach(__v => __obj.updateDynamic("LocationUri")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RetrievalRoleArn.foreach(__v => __obj.updateDynamic("RetrievalRoleArn")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Validators.foreach(__v => __obj.updateDynamic("Validators")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigurationProfile]
    }
  }

  /** A summary of a configuration profile.
    */
  @js.native
  trait ConfigurationProfileSummary extends js.Object {
    var ApplicationId: js.UndefOr[Id]
    var Id: js.UndefOr[Id]
    var LocationUri: js.UndefOr[Uri]
    var Name: js.UndefOr[LongName]
    var Type: js.UndefOr[ConfigurationProfileType]
    var ValidatorTypes: js.UndefOr[ValidatorTypeList]
  }

  object ConfigurationProfileSummary {
    @inline
    def apply(
        ApplicationId: js.UndefOr[Id] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        LocationUri: js.UndefOr[Uri] = js.undefined,
        Name: js.UndefOr[LongName] = js.undefined,
        Type: js.UndefOr[ConfigurationProfileType] = js.undefined,
        ValidatorTypes: js.UndefOr[ValidatorTypeList] = js.undefined
    ): ConfigurationProfileSummary = {
      val __obj = js.Dynamic.literal()
      ApplicationId.foreach(__v => __obj.updateDynamic("ApplicationId")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LocationUri.foreach(__v => __obj.updateDynamic("LocationUri")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
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
    var Name: LongName
    var Description: js.UndefOr[Description]
    var RetrievalRoleArn: js.UndefOr[RoleArn]
    var Tags: js.UndefOr[TagMap]
    var Type: js.UndefOr[ConfigurationProfileType]
    var Validators: js.UndefOr[ValidatorList]
  }

  object CreateConfigurationProfileRequest {
    @inline
    def apply(
        ApplicationId: Id,
        LocationUri: Uri,
        Name: LongName,
        Description: js.UndefOr[Description] = js.undefined,
        RetrievalRoleArn: js.UndefOr[RoleArn] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined,
        Type: js.UndefOr[ConfigurationProfileType] = js.undefined,
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
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Validators.foreach(__v => __obj.updateDynamic("Validators")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConfigurationProfileRequest]
    }
  }

  @js.native
  trait CreateDeploymentStrategyRequest extends js.Object {
    var DeploymentDurationInMinutes: MinutesBetween0And24Hours
    var GrowthFactor: GrowthFactor
    var Name: Name
    var Description: js.UndefOr[Description]
    var FinalBakeTimeInMinutes: js.UndefOr[MinutesBetween0And24Hours]
    var GrowthType: js.UndefOr[GrowthType]
    var ReplicateTo: js.UndefOr[ReplicateTo]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateDeploymentStrategyRequest {
    @inline
    def apply(
        DeploymentDurationInMinutes: MinutesBetween0And24Hours,
        GrowthFactor: GrowthFactor,
        Name: Name,
        Description: js.UndefOr[Description] = js.undefined,
        FinalBakeTimeInMinutes: js.UndefOr[MinutesBetween0And24Hours] = js.undefined,
        GrowthType: js.UndefOr[GrowthType] = js.undefined,
        ReplicateTo: js.UndefOr[ReplicateTo] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateDeploymentStrategyRequest = {
      val __obj = js.Dynamic.literal(
        "DeploymentDurationInMinutes" -> DeploymentDurationInMinutes.asInstanceOf[js.Any],
        "GrowthFactor" -> GrowthFactor.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      FinalBakeTimeInMinutes.foreach(__v => __obj.updateDynamic("FinalBakeTimeInMinutes")(__v.asInstanceOf[js.Any]))
      GrowthType.foreach(__v => __obj.updateDynamic("GrowthType")(__v.asInstanceOf[js.Any]))
      ReplicateTo.foreach(__v => __obj.updateDynamic("ReplicateTo")(__v.asInstanceOf[js.Any]))
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
  trait CreateExtensionAssociationRequest extends js.Object {
    var ExtensionIdentifier: Identifier
    var ResourceIdentifier: Identifier
    var ExtensionVersionNumber: js.UndefOr[Int]
    var Parameters: js.UndefOr[ParameterValueMap]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateExtensionAssociationRequest {
    @inline
    def apply(
        ExtensionIdentifier: Identifier,
        ResourceIdentifier: Identifier,
        ExtensionVersionNumber: js.UndefOr[Int] = js.undefined,
        Parameters: js.UndefOr[ParameterValueMap] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateExtensionAssociationRequest = {
      val __obj = js.Dynamic.literal(
        "ExtensionIdentifier" -> ExtensionIdentifier.asInstanceOf[js.Any],
        "ResourceIdentifier" -> ResourceIdentifier.asInstanceOf[js.Any]
      )

      ExtensionVersionNumber.foreach(__v => __obj.updateDynamic("ExtensionVersionNumber")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateExtensionAssociationRequest]
    }
  }

  @js.native
  trait CreateExtensionRequest extends js.Object {
    var Actions: ActionsMap
    var Name: Name
    var Description: js.UndefOr[Description]
    var LatestVersionNumber: js.UndefOr[Int]
    var Parameters: js.UndefOr[ParameterMap]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateExtensionRequest {
    @inline
    def apply(
        Actions: ActionsMap,
        Name: Name,
        Description: js.UndefOr[Description] = js.undefined,
        LatestVersionNumber: js.UndefOr[Int] = js.undefined,
        Parameters: js.UndefOr[ParameterMap] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateExtensionRequest = {
      val __obj = js.Dynamic.literal(
        "Actions" -> Actions.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LatestVersionNumber.foreach(__v => __obj.updateDynamic("LatestVersionNumber")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateExtensionRequest]
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
  trait DeleteExtensionAssociationRequest extends js.Object {
    var ExtensionAssociationId: Id
  }

  object DeleteExtensionAssociationRequest {
    @inline
    def apply(
        ExtensionAssociationId: Id
    ): DeleteExtensionAssociationRequest = {
      val __obj = js.Dynamic.literal(
        "ExtensionAssociationId" -> ExtensionAssociationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteExtensionAssociationRequest]
    }
  }

  @js.native
  trait DeleteExtensionRequest extends js.Object {
    var ExtensionIdentifier: Identifier
    var VersionNumber: js.UndefOr[Int]
  }

  object DeleteExtensionRequest {
    @inline
    def apply(
        ExtensionIdentifier: Identifier,
        VersionNumber: js.UndefOr[Int] = js.undefined
    ): DeleteExtensionRequest = {
      val __obj = js.Dynamic.literal(
        "ExtensionIdentifier" -> ExtensionIdentifier.asInstanceOf[js.Any]
      )

      VersionNumber.foreach(__v => __obj.updateDynamic("VersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteExtensionRequest]
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
    var AppliedExtensions: js.UndefOr[AppliedExtensions]
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
        AppliedExtensions: js.UndefOr[AppliedExtensions] = js.undefined,
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
      AppliedExtensions.foreach(__v => __obj.updateDynamic("AppliedExtensions")(__v.asInstanceOf[js.Any]))
      CompletedAt.foreach(__v => __obj.updateDynamic("CompletedAt")(__v.asInstanceOf[js.Any]))
      ConfigurationLocationUri.foreach(__v => __obj.updateDynamic("ConfigurationLocationUri")(__v.asInstanceOf[js.Any]))
      ConfigurationName.foreach(__v => __obj.updateDynamic("ConfigurationName")(__v.asInstanceOf[js.Any]))
      ConfigurationProfileId.foreach(__v => __obj.updateDynamic("ConfigurationProfileId")(__v.asInstanceOf[js.Any]))
      ConfigurationVersion.foreach(__v => __obj.updateDynamic("ConfigurationVersion")(__v.asInstanceOf[js.Any]))
      DeploymentDurationInMinutes.foreach(__v => __obj.updateDynamic("DeploymentDurationInMinutes")(__v.asInstanceOf[js.Any]))
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

  /** An object that describes a deployment event.
    */
  @js.native
  trait DeploymentEvent extends js.Object {
    var ActionInvocations: js.UndefOr[ActionInvocations]
    var Description: js.UndefOr[Description]
    var EventType: js.UndefOr[DeploymentEventType]
    var OccurredAt: js.UndefOr[Iso8601DateTime]
    var TriggeredBy: js.UndefOr[TriggeredBy]
  }

  object DeploymentEvent {
    @inline
    def apply(
        ActionInvocations: js.UndefOr[ActionInvocations] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        EventType: js.UndefOr[DeploymentEventType] = js.undefined,
        OccurredAt: js.UndefOr[Iso8601DateTime] = js.undefined,
        TriggeredBy: js.UndefOr[TriggeredBy] = js.undefined
    ): DeploymentEvent = {
      val __obj = js.Dynamic.literal()
      ActionInvocations.foreach(__v => __obj.updateDynamic("ActionInvocations")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EventType.foreach(__v => __obj.updateDynamic("EventType")(__v.asInstanceOf[js.Any]))
      OccurredAt.foreach(__v => __obj.updateDynamic("OccurredAt")(__v.asInstanceOf[js.Any]))
      TriggeredBy.foreach(__v => __obj.updateDynamic("TriggeredBy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeploymentEvent]
    }
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
      DeploymentDurationInMinutes.foreach(__v => __obj.updateDynamic("DeploymentDurationInMinutes")(__v.asInstanceOf[js.Any]))
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

  /** Information about the deployment.
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
      DeploymentDurationInMinutes.foreach(__v => __obj.updateDynamic("DeploymentDurationInMinutes")(__v.asInstanceOf[js.Any]))
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
  trait Extension extends js.Object {
    var Actions: js.UndefOr[ActionsMap]
    var Arn: js.UndefOr[Arn]
    var Description: js.UndefOr[Description]
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[Name]
    var Parameters: js.UndefOr[ParameterMap]
    var VersionNumber: js.UndefOr[Int]
  }

  object Extension {
    @inline
    def apply(
        Actions: js.UndefOr[ActionsMap] = js.undefined,
        Arn: js.UndefOr[Arn] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        Parameters: js.UndefOr[ParameterMap] = js.undefined,
        VersionNumber: js.UndefOr[Int] = js.undefined
    ): Extension = {
      val __obj = js.Dynamic.literal()
      Actions.foreach(__v => __obj.updateDynamic("Actions")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      VersionNumber.foreach(__v => __obj.updateDynamic("VersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Extension]
    }
  }

  @js.native
  trait ExtensionAssociation extends js.Object {
    var Arn: js.UndefOr[Arn]
    var ExtensionArn: js.UndefOr[Arn]
    var ExtensionVersionNumber: js.UndefOr[Int]
    var Id: js.UndefOr[Identifier]
    var Parameters: js.UndefOr[ParameterValueMap]
    var ResourceArn: js.UndefOr[Arn]
  }

  object ExtensionAssociation {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        ExtensionArn: js.UndefOr[Arn] = js.undefined,
        ExtensionVersionNumber: js.UndefOr[Int] = js.undefined,
        Id: js.UndefOr[Identifier] = js.undefined,
        Parameters: js.UndefOr[ParameterValueMap] = js.undefined,
        ResourceArn: js.UndefOr[Arn] = js.undefined
    ): ExtensionAssociation = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      ExtensionArn.foreach(__v => __obj.updateDynamic("ExtensionArn")(__v.asInstanceOf[js.Any]))
      ExtensionVersionNumber.foreach(__v => __obj.updateDynamic("ExtensionVersionNumber")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExtensionAssociation]
    }
  }

  /** Information about an association between an extension and an AppConfig resource such as an application, environment, or configuration profile. Call <code>GetExtensionAssociation</code> to get more information about an association.
    */
  @js.native
  trait ExtensionAssociationSummary extends js.Object {
    var ExtensionArn: js.UndefOr[Arn]
    var Id: js.UndefOr[Identifier]
    var ResourceArn: js.UndefOr[Arn]
  }

  object ExtensionAssociationSummary {
    @inline
    def apply(
        ExtensionArn: js.UndefOr[Arn] = js.undefined,
        Id: js.UndefOr[Identifier] = js.undefined,
        ResourceArn: js.UndefOr[Arn] = js.undefined
    ): ExtensionAssociationSummary = {
      val __obj = js.Dynamic.literal()
      ExtensionArn.foreach(__v => __obj.updateDynamic("ExtensionArn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExtensionAssociationSummary]
    }
  }

  @js.native
  trait ExtensionAssociations extends js.Object {
    var Items: js.UndefOr[ExtensionAssociationSummaries]
    var NextToken: js.UndefOr[NextToken]
  }

  object ExtensionAssociations {
    @inline
    def apply(
        Items: js.UndefOr[ExtensionAssociationSummaries] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ExtensionAssociations = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExtensionAssociations]
    }
  }

  /** Information about an extension. Call <code>GetExtension</code> to get more information about an extension.
    */
  @js.native
  trait ExtensionSummary extends js.Object {
    var Arn: js.UndefOr[Arn]
    var Description: js.UndefOr[Description]
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[Name]
    var VersionNumber: js.UndefOr[Int]
  }

  object ExtensionSummary {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Id: js.UndefOr[Id] = js.undefined,
        Name: js.UndefOr[Name] = js.undefined,
        VersionNumber: js.UndefOr[Int] = js.undefined
    ): ExtensionSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      VersionNumber.foreach(__v => __obj.updateDynamic("VersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExtensionSummary]
    }
  }

  @js.native
  trait Extensions extends js.Object {
    var Items: js.UndefOr[ExtensionSummaries]
    var NextToken: js.UndefOr[NextToken]
  }

  object Extensions {
    @inline
    def apply(
        Items: js.UndefOr[ExtensionSummaries] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): Extensions = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Extensions]
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

      ClientConfigurationVersion.foreach(__v => __obj.updateDynamic("ClientConfigurationVersion")(__v.asInstanceOf[js.Any]))
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
  trait GetExtensionAssociationRequest extends js.Object {
    var ExtensionAssociationId: Id
  }

  object GetExtensionAssociationRequest {
    @inline
    def apply(
        ExtensionAssociationId: Id
    ): GetExtensionAssociationRequest = {
      val __obj = js.Dynamic.literal(
        "ExtensionAssociationId" -> ExtensionAssociationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetExtensionAssociationRequest]
    }
  }

  @js.native
  trait GetExtensionRequest extends js.Object {
    var ExtensionIdentifier: Identifier
    var VersionNumber: js.UndefOr[Int]
  }

  object GetExtensionRequest {
    @inline
    def apply(
        ExtensionIdentifier: Identifier,
        VersionNumber: js.UndefOr[Int] = js.undefined
    ): GetExtensionRequest = {
      val __obj = js.Dynamic.literal(
        "ExtensionIdentifier" -> ExtensionIdentifier.asInstanceOf[js.Any]
      )

      VersionNumber.foreach(__v => __obj.updateDynamic("VersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetExtensionRequest]
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

  /** Information about the configuration.
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
    var Type: js.UndefOr[ConfigurationProfileType]
  }

  object ListConfigurationProfilesRequest {
    @inline
    def apply(
        ApplicationId: Id,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Type: js.UndefOr[ConfigurationProfileType] = js.undefined
    ): ListConfigurationProfilesRequest = {
      val __obj = js.Dynamic.literal(
        "ApplicationId" -> ApplicationId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
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
  trait ListExtensionAssociationsRequest extends js.Object {
    var ExtensionIdentifier: js.UndefOr[Identifier]
    var ExtensionVersionNumber: js.UndefOr[Int]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ResourceIdentifier: js.UndefOr[Arn]
  }

  object ListExtensionAssociationsRequest {
    @inline
    def apply(
        ExtensionIdentifier: js.UndefOr[Identifier] = js.undefined,
        ExtensionVersionNumber: js.UndefOr[Int] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ResourceIdentifier: js.UndefOr[Arn] = js.undefined
    ): ListExtensionAssociationsRequest = {
      val __obj = js.Dynamic.literal()
      ExtensionIdentifier.foreach(__v => __obj.updateDynamic("ExtensionIdentifier")(__v.asInstanceOf[js.Any]))
      ExtensionVersionNumber.foreach(__v => __obj.updateDynamic("ExtensionVersionNumber")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceIdentifier.foreach(__v => __obj.updateDynamic("ResourceIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExtensionAssociationsRequest]
    }
  }

  @js.native
  trait ListExtensionsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var Name: js.UndefOr[QueryName]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListExtensionsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        Name: js.UndefOr[QueryName] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListExtensionsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExtensionsRequest]
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

  /** Amazon CloudWatch alarms to monitor during the deployment process.
    */
  @js.native
  trait Monitor extends js.Object {
    var AlarmArn: StringWithLengthBetween1And2048
    var AlarmRoleArn: js.UndefOr[RoleArn]
  }

  object Monitor {
    @inline
    def apply(
        AlarmArn: StringWithLengthBetween1And2048,
        AlarmRoleArn: js.UndefOr[RoleArn] = js.undefined
    ): Monitor = {
      val __obj = js.Dynamic.literal(
        "AlarmArn" -> AlarmArn.asInstanceOf[js.Any]
      )

      AlarmRoleArn.foreach(__v => __obj.updateDynamic("AlarmRoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Monitor]
    }
  }

  /** A value such as an Amazon Resource Name (ARN) or an Amazon Simple Notification Service topic entered in an extension when invoked. Parameter values are specified in an extension association. For more information about extensions, see [[https://docs.aws.amazon.com/appconfig/latest/userguide/working-with-appconfig-extensions.html|Working with AppConfig extensions]] in the <i>AppConfig User Guide</i>.
    */
  @js.native
  trait Parameter extends js.Object {
    var Description: js.UndefOr[Description]
    var Required: js.UndefOr[Boolean]
  }

  object Parameter {
    @inline
    def apply(
        Description: js.UndefOr[Description] = js.undefined,
        Required: js.UndefOr[Boolean] = js.undefined
    ): Parameter = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Required.foreach(__v => __obj.updateDynamic("Required")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Parameter]
    }
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

      DeploymentDurationInMinutes.foreach(__v => __obj.updateDynamic("DeploymentDurationInMinutes")(__v.asInstanceOf[js.Any]))
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
  trait UpdateExtensionAssociationRequest extends js.Object {
    var ExtensionAssociationId: Id
    var Parameters: js.UndefOr[ParameterValueMap]
  }

  object UpdateExtensionAssociationRequest {
    @inline
    def apply(
        ExtensionAssociationId: Id,
        Parameters: js.UndefOr[ParameterValueMap] = js.undefined
    ): UpdateExtensionAssociationRequest = {
      val __obj = js.Dynamic.literal(
        "ExtensionAssociationId" -> ExtensionAssociationId.asInstanceOf[js.Any]
      )

      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateExtensionAssociationRequest]
    }
  }

  @js.native
  trait UpdateExtensionRequest extends js.Object {
    var ExtensionIdentifier: Identifier
    var Actions: js.UndefOr[ActionsMap]
    var Description: js.UndefOr[Description]
    var Parameters: js.UndefOr[ParameterMap]
    var VersionNumber: js.UndefOr[Int]
  }

  object UpdateExtensionRequest {
    @inline
    def apply(
        ExtensionIdentifier: Identifier,
        Actions: js.UndefOr[ActionsMap] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Parameters: js.UndefOr[ParameterMap] = js.undefined,
        VersionNumber: js.UndefOr[Int] = js.undefined
    ): UpdateExtensionRequest = {
      val __obj = js.Dynamic.literal(
        "ExtensionIdentifier" -> ExtensionIdentifier.asInstanceOf[js.Any]
      )

      Actions.foreach(__v => __obj.updateDynamic("Actions")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      VersionNumber.foreach(__v => __obj.updateDynamic("VersionNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateExtensionRequest]
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

  /** A validator provides a syntactic or semantic check to ensure the configuration that you want to deploy functions as intended. To validate your application configuration data, you provide a schema or an Amazon Web Services Lambda function that runs against the configuration. The configuration deployment or update can only proceed when the configuration data is valid.
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
}
