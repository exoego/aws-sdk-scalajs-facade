package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object appconfig {
  type ApplicationList                  = js.Array[Application]
  type Arn                              = String
  type Blob                             = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ConfigurationProfileSummaryList  = js.Array[ConfigurationProfileSummary]
  type DeploymentList                   = js.Array[DeploymentSummary]
  type DeploymentStrategyId             = String
  type DeploymentStrategyList           = js.Array[DeploymentStrategy]
  type Description                      = String
  type EnvironmentList                  = js.Array[Environment]
  type GrowthFactor                     = Float
  type Id                               = String
  type Iso8601DateTime                  = js.Date
  type MaxResults                       = Int
  type MinutesBetween0And24Hours        = Int
  type MonitorList                      = js.Array[Monitor]
  type Name                             = String
  type NextToken                        = String
  type Percentage                       = Float
  type StringWithLengthBetween0And32768 = String
  type StringWithLengthBetween1And64    = String
  type TagKey                           = String
  type TagKeyList                       = js.Array[TagKey]
  type TagMap                           = js.Dictionary[TagValue]
  type TagValue                         = String
  type Uri                              = String
  type ValidatorList                    = js.Array[Validator]
  type ValidatorTypeList                = js.Array[ValidatorType]
  type Version                          = String

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
    @inline def deleteApplicationFuture(params: DeleteApplicationRequest): Future[js.Object] =
      service.deleteApplication(params).promise().toFuture
    @inline def deleteConfigurationProfileFuture(params: DeleteConfigurationProfileRequest): Future[js.Object] =
      service.deleteConfigurationProfile(params).promise().toFuture
    @inline def deleteDeploymentStrategyFuture(params: DeleteDeploymentStrategyRequest): Future[js.Object] =
      service.deleteDeploymentStrategy(params).promise().toFuture
    @inline def deleteEnvironmentFuture(params: DeleteEnvironmentRequest): Future[js.Object] =
      service.deleteEnvironment(params).promise().toFuture
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
  @JSImport("aws-sdk", "AppConfig")
  class AppConfig() extends js.Object {
    def this(config: AWSConfig) = this()

    def createApplication(params: CreateApplicationRequest): Request[Application]                            = js.native
    def createConfigurationProfile(params: CreateConfigurationProfileRequest): Request[ConfigurationProfile] = js.native
    def createDeploymentStrategy(params: CreateDeploymentStrategyRequest): Request[DeploymentStrategy]       = js.native
    def createEnvironment(params: CreateEnvironmentRequest): Request[Environment]                            = js.native
    def deleteApplication(params: DeleteApplicationRequest): Request[js.Object]                              = js.native
    def deleteConfigurationProfile(params: DeleteConfigurationProfileRequest): Request[js.Object]            = js.native
    def deleteDeploymentStrategy(params: DeleteDeploymentStrategyRequest): Request[js.Object]                = js.native
    def deleteEnvironment(params: DeleteEnvironmentRequest): Request[js.Object]                              = js.native
    def getApplication(params: GetApplicationRequest): Request[Application]                                  = js.native
    def getConfiguration(params: GetConfigurationRequest): Request[Configuration]                            = js.native
    def getConfigurationProfile(params: GetConfigurationProfileRequest): Request[ConfigurationProfile]       = js.native
    def getDeployment(params: GetDeploymentRequest): Request[Deployment]                                     = js.native
    def getDeploymentStrategy(params: GetDeploymentStrategyRequest): Request[DeploymentStrategy]             = js.native
    def getEnvironment(params: GetEnvironmentRequest): Request[Environment]                                  = js.native
    def listApplications(params: ListApplicationsRequest): Request[Applications]                             = js.native
    def listConfigurationProfiles(params: ListConfigurationProfilesRequest): Request[ConfigurationProfiles]  = js.native
    def listDeploymentStrategies(params: ListDeploymentStrategiesRequest): Request[DeploymentStrategies]     = js.native
    def listDeployments(params: ListDeploymentsRequest): Request[Deployments]                                = js.native
    def listEnvironments(params: ListEnvironmentsRequest): Request[Environments]                             = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ResourceTags]                       = js.native
    def startDeployment(params: StartDeploymentRequest): Request[Deployment]                                 = js.native
    def stopDeployment(params: StopDeploymentRequest): Request[Deployment]                                   = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object]                                          = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object]                                      = js.native
    def updateApplication(params: UpdateApplicationRequest): Request[Application]                            = js.native
    def updateConfigurationProfile(params: UpdateConfigurationProfileRequest): Request[ConfigurationProfile] = js.native
    def updateDeploymentStrategy(params: UpdateDeploymentStrategyRequest): Request[DeploymentStrategy]       = js.native
    def updateEnvironment(params: UpdateEnvironmentRequest): Request[Environment]                            = js.native
    def validateConfiguration(params: ValidateConfigurationRequest): Request[js.Object]                      = js.native
  }

  @js.native
  @Factory
  trait Application extends js.Object {
    var Description: js.UndefOr[Description]
    var Id: js.UndefOr[Id]
    var Name: js.UndefOr[Name]
  }

  @js.native
  @Factory
  trait Applications extends js.Object {
    var Items: js.UndefOr[ApplicationList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait Configuration extends js.Object {
    var ConfigurationVersion: js.UndefOr[Version]
    var Content: js.UndefOr[Blob]
    var ContentType: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ConfigurationProfile extends js.Object {
    var ApplicationId: js.UndefOr[Id]
    var Description: js.UndefOr[Description]
    var Id: js.UndefOr[Id]
    var LocationUri: js.UndefOr[Uri]
    var Name: js.UndefOr[Name]
    var RetrievalRoleArn: js.UndefOr[Arn]
    var Validators: js.UndefOr[ValidatorList]
  }

  /**
    * A summary of a configuration profile.
    */
  @js.native
  @Factory
  trait ConfigurationProfileSummary extends js.Object {
    var ApplicationId: js.UndefOr[Id]
    var Id: js.UndefOr[Id]
    var LocationUri: js.UndefOr[Uri]
    var Name: js.UndefOr[Name]
    var ValidatorTypes: js.UndefOr[ValidatorTypeList]
  }

  @js.native
  @Factory
  trait ConfigurationProfiles extends js.Object {
    var Items: js.UndefOr[ConfigurationProfileSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait CreateApplicationRequest extends js.Object {
    var Name: Name
    var Description: js.UndefOr[Description]
    var Tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait CreateConfigurationProfileRequest extends js.Object {
    var ApplicationId: Id
    var LocationUri: Uri
    var Name: Name
    var RetrievalRoleArn: Arn
    var Description: js.UndefOr[Description]
    var Tags: js.UndefOr[TagMap]
    var Validators: js.UndefOr[ValidatorList]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait CreateEnvironmentRequest extends js.Object {
    var ApplicationId: Id
    var Name: Name
    var Description: js.UndefOr[Description]
    var Monitors: js.UndefOr[MonitorList]
    var Tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait DeleteApplicationRequest extends js.Object {
    var ApplicationId: Id
  }

  @js.native
  @Factory
  trait DeleteConfigurationProfileRequest extends js.Object {
    var ApplicationId: Id
    var ConfigurationProfileId: Id
  }

  @js.native
  @Factory
  trait DeleteDeploymentStrategyRequest extends js.Object {
    var DeploymentStrategyId: DeploymentStrategyId
  }

  @js.native
  @Factory
  trait DeleteEnvironmentRequest extends js.Object {
    var ApplicationId: Id
    var EnvironmentId: Id
  }

  @js.native
  @Factory
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
    var FinalBakeTimeInMinutes: js.UndefOr[MinutesBetween0And24Hours]
    var GrowthFactor: js.UndefOr[Percentage]
    var GrowthType: js.UndefOr[GrowthType]
    var PercentageComplete: js.UndefOr[Percentage]
    var StartedAt: js.UndefOr[Iso8601DateTime]
    var State: js.UndefOr[DeploymentState]
  }

  @js.native
  sealed trait DeploymentState extends js.Any
  object DeploymentState extends js.Object {
    val BAKING       = "BAKING".asInstanceOf[DeploymentState]
    val VALIDATING   = "VALIDATING".asInstanceOf[DeploymentState]
    val DEPLOYING    = "DEPLOYING".asInstanceOf[DeploymentState]
    val COMPLETE     = "COMPLETE".asInstanceOf[DeploymentState]
    val ROLLING_BACK = "ROLLING_BACK".asInstanceOf[DeploymentState]
    val ROLLED_BACK  = "ROLLED_BACK".asInstanceOf[DeploymentState]

    val values = js.Object.freeze(js.Array(BAKING, VALIDATING, DEPLOYING, COMPLETE, ROLLING_BACK, ROLLED_BACK))
  }

  @js.native
  @Factory
  trait DeploymentStrategies extends js.Object {
    var Items: js.UndefOr[DeploymentStrategyList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
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

  /**
    * Information about the deployment.
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait Deployments extends js.Object {
    var Items: js.UndefOr[DeploymentList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait Environment extends js.Object {
    var ApplicationId: js.UndefOr[Id]
    var Description: js.UndefOr[Description]
    var Id: js.UndefOr[Id]
    var Monitors: js.UndefOr[MonitorList]
    var Name: js.UndefOr[Name]
    var State: js.UndefOr[EnvironmentState]
  }

  @js.native
  sealed trait EnvironmentState extends js.Any
  object EnvironmentState extends js.Object {
    val READY_FOR_DEPLOYMENT = "READY_FOR_DEPLOYMENT".asInstanceOf[EnvironmentState]
    val DEPLOYING            = "DEPLOYING".asInstanceOf[EnvironmentState]
    val ROLLING_BACK         = "ROLLING_BACK".asInstanceOf[EnvironmentState]
    val ROLLED_BACK          = "ROLLED_BACK".asInstanceOf[EnvironmentState]

    val values = js.Object.freeze(js.Array(READY_FOR_DEPLOYMENT, DEPLOYING, ROLLING_BACK, ROLLED_BACK))
  }

  @js.native
  @Factory
  trait Environments extends js.Object {
    var Items: js.UndefOr[EnvironmentList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetApplicationRequest extends js.Object {
    var ApplicationId: Id
  }

  @js.native
  @Factory
  trait GetConfigurationProfileRequest extends js.Object {
    var ApplicationId: Id
    var ConfigurationProfileId: Id
  }

  @js.native
  @Factory
  trait GetConfigurationRequest extends js.Object {
    var Application: StringWithLengthBetween1And64
    var ClientId: StringWithLengthBetween1And64
    var Configuration: StringWithLengthBetween1And64
    var Environment: StringWithLengthBetween1And64
    var ClientConfigurationVersion: js.UndefOr[Version]
  }

  @js.native
  @Factory
  trait GetDeploymentRequest extends js.Object {
    var ApplicationId: Id
    var DeploymentNumber: Int
    var EnvironmentId: Id
  }

  @js.native
  @Factory
  trait GetDeploymentStrategyRequest extends js.Object {
    var DeploymentStrategyId: DeploymentStrategyId
  }

  @js.native
  @Factory
  trait GetEnvironmentRequest extends js.Object {
    var ApplicationId: Id
    var EnvironmentId: Id
  }

  @js.native
  sealed trait GrowthType extends js.Any
  object GrowthType extends js.Object {
    val LINEAR      = "LINEAR".asInstanceOf[GrowthType]
    val EXPONENTIAL = "EXPONENTIAL".asInstanceOf[GrowthType]

    val values = js.Object.freeze(js.Array(LINEAR, EXPONENTIAL))
  }

  @js.native
  @Factory
  trait ListApplicationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListConfigurationProfilesRequest extends js.Object {
    var ApplicationId: Id
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDeploymentStrategiesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListDeploymentsRequest extends js.Object {
    var ApplicationId: Id
    var EnvironmentId: Id
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListEnvironmentsRequest extends js.Object {
    var ApplicationId: Id
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: Arn
  }

  /**
    * Amazon CloudWatch alarms to monitor during the deployment process.
    */
  @js.native
  @Factory
  trait Monitor extends js.Object {
    var AlarmArn: js.UndefOr[Arn]
    var AlarmRoleArn: js.UndefOr[Arn]
  }

  @js.native
  sealed trait ReplicateTo extends js.Any
  object ReplicateTo extends js.Object {
    val NONE         = "NONE".asInstanceOf[ReplicateTo]
    val SSM_DOCUMENT = "SSM_DOCUMENT".asInstanceOf[ReplicateTo]

    val values = js.Object.freeze(js.Array(NONE, SSM_DOCUMENT))
  }

  @js.native
  @Factory
  trait ResourceTags extends js.Object {
    var Tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait StartDeploymentRequest extends js.Object {
    var ApplicationId: Id
    var ConfigurationProfileId: Id
    var ConfigurationVersion: Version
    var DeploymentStrategyId: DeploymentStrategyId
    var EnvironmentId: Id
    var Description: js.UndefOr[Description]
    var Tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait StopDeploymentRequest extends js.Object {
    var ApplicationId: Id
    var DeploymentNumber: Int
    var EnvironmentId: Id
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var Tags: TagMap
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: Arn
    var TagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UpdateApplicationRequest extends js.Object {
    var ApplicationId: Id
    var Description: js.UndefOr[Description]
    var Name: js.UndefOr[Name]
  }

  @js.native
  @Factory
  trait UpdateConfigurationProfileRequest extends js.Object {
    var ApplicationId: Id
    var ConfigurationProfileId: Id
    var Description: js.UndefOr[Description]
    var Name: js.UndefOr[Name]
    var RetrievalRoleArn: js.UndefOr[Arn]
    var Validators: js.UndefOr[ValidatorList]
  }

  @js.native
  @Factory
  trait UpdateDeploymentStrategyRequest extends js.Object {
    var DeploymentStrategyId: DeploymentStrategyId
    var DeploymentDurationInMinutes: js.UndefOr[MinutesBetween0And24Hours]
    var Description: js.UndefOr[Description]
    var FinalBakeTimeInMinutes: js.UndefOr[MinutesBetween0And24Hours]
    var GrowthFactor: js.UndefOr[GrowthFactor]
    var GrowthType: js.UndefOr[GrowthType]
  }

  @js.native
  @Factory
  trait UpdateEnvironmentRequest extends js.Object {
    var ApplicationId: Id
    var EnvironmentId: Id
    var Description: js.UndefOr[Description]
    var Monitors: js.UndefOr[MonitorList]
    var Name: js.UndefOr[Name]
  }

  @js.native
  @Factory
  trait ValidateConfigurationRequest extends js.Object {
    var ApplicationId: Id
    var ConfigurationProfileId: Id
    var ConfigurationVersion: Version
  }

  /**
    * A validator provides a syntactic or semantic check to ensure the configuration you want to deploy functions as intended. To validate your application configuration data, you provide a schema or a Lambda function that runs against the configuration. The configuration deployment or update can only proceed when the configuration data is valid.
    */
  @js.native
  @Factory
  trait Validator extends js.Object {
    var Content: StringWithLengthBetween0And32768
    var Type: ValidatorType
  }

  @js.native
  sealed trait ValidatorType extends js.Any
  object ValidatorType extends js.Object {
    val JSON_SCHEMA = "JSON_SCHEMA".asInstanceOf[ValidatorType]
    val LAMBDA      = "LAMBDA".asInstanceOf[ValidatorType]

    val values = js.Object.freeze(js.Array(JSON_SCHEMA, LAMBDA))
  }
}
