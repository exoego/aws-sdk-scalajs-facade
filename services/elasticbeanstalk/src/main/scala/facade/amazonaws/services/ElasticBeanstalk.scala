package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object elasticbeanstalk {
  type ARN                                  = String
  type AbortableOperationInProgress         = Boolean
  type ApplicationArn                       = String
  type ApplicationDescriptionList           = js.Array[ApplicationDescription]
  type ApplicationName                      = String
  type ApplicationNamesList                 = js.Array[ApplicationName]
  type ApplicationVersionArn                = String
  type ApplicationVersionDescriptionList    = js.Array[ApplicationVersionDescription]
  type ApplicationVersionProccess           = Boolean
  type AutoCreateApplication                = Boolean
  type AutoScalingGroupList                 = js.Array[AutoScalingGroup]
  type AvailableSolutionStackDetailsList    = js.Array[SolutionStackDescription]
  type AvailableSolutionStackNamesList      = js.Array[SolutionStackName]
  type BoxedBoolean                         = Boolean
  type BoxedInt                             = Int
  type Cause                                = String
  type Causes                               = js.Array[Cause]
  type CnameAvailability                    = Boolean
  type ConfigurationOptionDefaultValue      = String
  type ConfigurationOptionDescriptionsList  = js.Array[ConfigurationOptionDescription]
  type ConfigurationOptionName              = String
  type ConfigurationOptionPossibleValue     = String
  type ConfigurationOptionPossibleValues    = js.Array[ConfigurationOptionPossibleValue]
  type ConfigurationOptionSettingsList      = js.Array[ConfigurationOptionSetting]
  type ConfigurationOptionSeverity          = String
  type ConfigurationOptionValue             = String
  type ConfigurationSettingsDescriptionList = js.Array[ConfigurationSettingsDescription]
  type ConfigurationTemplateName            = String
  type ConfigurationTemplateNamesList       = js.Array[ConfigurationTemplateName]
  type CreationDate                         = js.Date
  type CustomAmiList                        = js.Array[CustomAmi]
  type DNSCname                             = String
  type DNSCnamePrefix                       = String
  type DeleteSourceBundle                   = Boolean
  type DeploymentTimestamp                  = js.Date
  type Description                          = String
  type Ec2InstanceId                        = String
  type EndpointURL                          = String
  type EnvironmentArn                       = String
  type EnvironmentDescriptionsList          = js.Array[EnvironmentDescription]
  type EnvironmentHealthAttributes          = js.Array[EnvironmentHealthAttribute]
  type EnvironmentId                        = String
  type EnvironmentIdList                    = js.Array[EnvironmentId]
  type EnvironmentInfoDescriptionList       = js.Array[EnvironmentInfoDescription]
  type EnvironmentLinks                     = js.Array[EnvironmentLink]
  type EnvironmentName                      = String
  type EnvironmentNamesList                 = js.Array[EnvironmentName]
  type EventDate                            = js.Date
  type EventDescriptionList                 = js.Array[EventDescription]
  type EventMessage                         = String
  type FileTypeExtension                    = String
  type ForceTerminate                       = Boolean
  type GroupName                            = String
  type ImageId                              = String
  type IncludeDeleted                       = Boolean
  type IncludeDeletedBackTo                 = js.Date
  type InstanceHealthList                   = js.Array[SingleInstanceHealth]
  type InstanceId                           = String
  type InstanceList                         = js.Array[Instance]
  type InstancesHealthAttributes            = js.Array[InstancesHealthAttribute]
  type LaunchConfigurationList              = js.Array[LaunchConfiguration]
  type LaunchTemplateList                   = js.Array[LaunchTemplate]
  type LaunchedAt                           = js.Date
  type LoadAverage                          = js.Array[LoadAverageValue]
  type LoadAverageValue                     = Double
  type LoadBalancerList                     = js.Array[LoadBalancer]
  type LoadBalancerListenersDescription     = js.Array[Listener]
  type Maintainer                           = String
  type ManagedActionHistoryItems            = js.Array[ManagedActionHistoryItem]
  type ManagedActions                       = js.Array[ManagedAction]
  type MaxRecords                           = Int
  type Message                              = String
  type NextToken                            = String
  type NonEmptyString                       = String
  type NullableDouble                       = Double
  type NullableInteger                      = Int
  type NullableLong                         = Double
  type OperatingSystemName                  = String
  type OperatingSystemVersion               = String
  type OptionNamespace                      = String
  type OptionRestrictionMaxLength           = Int
  type OptionRestrictionMaxValue            = Int
  type OptionRestrictionMinValue            = Int
  type OptionsSpecifierList                 = js.Array[OptionSpecification]
  type PlatformArn                          = String
  type PlatformCategory                     = String
  type PlatformFilterOperator               = String
  type PlatformFilterType                   = String
  type PlatformFilterValue                  = String
  type PlatformFilterValueList              = js.Array[PlatformFilterValue]
  type PlatformFilters                      = js.Array[PlatformFilter]
  type PlatformFrameworks                   = js.Array[PlatformFramework]
  type PlatformMaxRecords                   = Int
  type PlatformName                         = String
  type PlatformOwner                        = String
  type PlatformProgrammingLanguages         = js.Array[PlatformProgrammingLanguage]
  type PlatformSummaryList                  = js.Array[PlatformSummary]
  type PlatformVersion                      = String
  type QueueList                            = js.Array[Queue]
  type RefreshedAt                          = js.Date
  type RegexLabel                           = String
  type RegexPattern                         = String
  type RequestCount                         = Int
  type RequestId                            = String
  type ResourceArn                          = String
  type ResourceId                           = String
  type ResourceName                         = String
  type S3Bucket                             = String
  type S3Key                                = String
  type SampleTimestamp                      = js.Date
  type SolutionStackFileTypeList            = js.Array[FileTypeExtension]
  type SolutionStackName                    = String
  type SourceLocation                       = String
  type SupportedAddon                       = String
  type SupportedAddonList                   = js.Array[SupportedAddon]
  type SupportedTier                        = String
  type SupportedTierList                    = js.Array[SupportedTier]
  type TagKey                               = String
  type TagKeyList                           = js.Array[TagKey]
  type TagList                              = js.Array[Tag]
  type TagValue                             = String
  type Tags                                 = js.Array[Tag]
  type TerminateEnvForce                    = Boolean
  type TerminateEnvironmentResources        = Boolean
  type TimeFilterEnd                        = js.Date
  type TimeFilterStart                      = js.Date
  type Timestamp                            = js.Date
  type Token                                = String
  type TriggerList                          = js.Array[Trigger]
  type UpdateDate                           = js.Date
  type UserDefinedOption                    = Boolean
  type ValidationMessageString              = String
  type ValidationMessagesList               = js.Array[ValidationMessage]
  type VersionLabel                         = String
  type VersionLabels                        = js.Array[VersionLabel]
  type VersionLabelsList                    = js.Array[VersionLabel]
  type VirtualizationType                   = String

  implicit final class ElasticBeanstalkOps(private val service: ElasticBeanstalk) extends AnyVal {

    @inline def abortEnvironmentUpdateFuture(params: AbortEnvironmentUpdateMessage): Future[js.Object] =
      service.abortEnvironmentUpdate(params).promise().toFuture
    @inline def applyEnvironmentManagedActionFuture(
        params: ApplyEnvironmentManagedActionRequest
    ): Future[ApplyEnvironmentManagedActionResult] = service.applyEnvironmentManagedAction(params).promise().toFuture
    @inline def checkDNSAvailabilityFuture(
        params: CheckDNSAvailabilityMessage
    ): Future[CheckDNSAvailabilityResultMessage] = service.checkDNSAvailability(params).promise().toFuture
    @inline def composeEnvironmentsFuture(params: ComposeEnvironmentsMessage): Future[EnvironmentDescriptionsMessage] =
      service.composeEnvironments(params).promise().toFuture
    @inline def createApplicationFuture(params: CreateApplicationMessage): Future[ApplicationDescriptionMessage] =
      service.createApplication(params).promise().toFuture
    @inline def createApplicationVersionFuture(
        params: CreateApplicationVersionMessage
    ): Future[ApplicationVersionDescriptionMessage] = service.createApplicationVersion(params).promise().toFuture
    @inline def createConfigurationTemplateFuture(
        params: CreateConfigurationTemplateMessage
    ): Future[ConfigurationSettingsDescription] = service.createConfigurationTemplate(params).promise().toFuture
    @inline def createEnvironmentFuture(params: CreateEnvironmentMessage): Future[EnvironmentDescription] =
      service.createEnvironment(params).promise().toFuture
    @inline def createPlatformVersionFuture(params: CreatePlatformVersionRequest): Future[CreatePlatformVersionResult] =
      service.createPlatformVersion(params).promise().toFuture
    @inline def createStorageLocationFuture(): Future[CreateStorageLocationResultMessage] =
      service.createStorageLocation().promise().toFuture
    @inline def deleteApplicationFuture(params: DeleteApplicationMessage): Future[js.Object] =
      service.deleteApplication(params).promise().toFuture
    @inline def deleteApplicationVersionFuture(params: DeleteApplicationVersionMessage): Future[js.Object] =
      service.deleteApplicationVersion(params).promise().toFuture
    @inline def deleteConfigurationTemplateFuture(params: DeleteConfigurationTemplateMessage): Future[js.Object] =
      service.deleteConfigurationTemplate(params).promise().toFuture
    @inline def deleteEnvironmentConfigurationFuture(params: DeleteEnvironmentConfigurationMessage): Future[js.Object] =
      service.deleteEnvironmentConfiguration(params).promise().toFuture
    @inline def deletePlatformVersionFuture(params: DeletePlatformVersionRequest): Future[DeletePlatformVersionResult] =
      service.deletePlatformVersion(params).promise().toFuture
    @inline def describeAccountAttributesFuture(): Future[DescribeAccountAttributesResult] =
      service.describeAccountAttributes().promise().toFuture
    @inline def describeApplicationVersionsFuture(
        params: DescribeApplicationVersionsMessage
    ): Future[ApplicationVersionDescriptionsMessage] = service.describeApplicationVersions(params).promise().toFuture
    @inline def describeApplicationsFuture(
        params: DescribeApplicationsMessage
    ): Future[ApplicationDescriptionsMessage] = service.describeApplications(params).promise().toFuture
    @inline def describeConfigurationOptionsFuture(
        params: DescribeConfigurationOptionsMessage
    ): Future[ConfigurationOptionsDescription] = service.describeConfigurationOptions(params).promise().toFuture
    @inline def describeConfigurationSettingsFuture(
        params: DescribeConfigurationSettingsMessage
    ): Future[ConfigurationSettingsDescriptions] = service.describeConfigurationSettings(params).promise().toFuture
    @inline def describeEnvironmentHealthFuture(
        params: DescribeEnvironmentHealthRequest
    ): Future[DescribeEnvironmentHealthResult] = service.describeEnvironmentHealth(params).promise().toFuture
    @inline def describeEnvironmentManagedActionHistoryFuture(
        params: DescribeEnvironmentManagedActionHistoryRequest
    ): Future[DescribeEnvironmentManagedActionHistoryResult] =
      service.describeEnvironmentManagedActionHistory(params).promise().toFuture
    @inline def describeEnvironmentManagedActionsFuture(
        params: DescribeEnvironmentManagedActionsRequest
    ): Future[DescribeEnvironmentManagedActionsResult] =
      service.describeEnvironmentManagedActions(params).promise().toFuture
    @inline def describeEnvironmentResourcesFuture(
        params: DescribeEnvironmentResourcesMessage
    ): Future[EnvironmentResourceDescriptionsMessage] = service.describeEnvironmentResources(params).promise().toFuture
    @inline def describeEnvironmentsFuture(
        params: DescribeEnvironmentsMessage
    ): Future[EnvironmentDescriptionsMessage] = service.describeEnvironments(params).promise().toFuture
    @inline def describeEventsFuture(params: DescribeEventsMessage): Future[EventDescriptionsMessage] =
      service.describeEvents(params).promise().toFuture
    @inline def describeInstancesHealthFuture(
        params: DescribeInstancesHealthRequest
    ): Future[DescribeInstancesHealthResult] = service.describeInstancesHealth(params).promise().toFuture
    @inline def describePlatformVersionFuture(
        params: DescribePlatformVersionRequest
    ): Future[DescribePlatformVersionResult] = service.describePlatformVersion(params).promise().toFuture
    @inline def listAvailableSolutionStacksFuture(): Future[ListAvailableSolutionStacksResultMessage] =
      service.listAvailableSolutionStacks().promise().toFuture
    @inline def listPlatformVersionsFuture(params: ListPlatformVersionsRequest): Future[ListPlatformVersionsResult] =
      service.listPlatformVersions(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceMessage): Future[ResourceTagsDescriptionMessage] =
      service.listTagsForResource(params).promise().toFuture
    @inline def rebuildEnvironmentFuture(params: RebuildEnvironmentMessage): Future[js.Object] =
      service.rebuildEnvironment(params).promise().toFuture
    @inline def requestEnvironmentInfoFuture(params: RequestEnvironmentInfoMessage): Future[js.Object] =
      service.requestEnvironmentInfo(params).promise().toFuture
    @inline def restartAppServerFuture(params: RestartAppServerMessage): Future[js.Object] =
      service.restartAppServer(params).promise().toFuture
    @inline def retrieveEnvironmentInfoFuture(
        params: RetrieveEnvironmentInfoMessage
    ): Future[RetrieveEnvironmentInfoResultMessage] = service.retrieveEnvironmentInfo(params).promise().toFuture
    @inline def swapEnvironmentCNAMEsFuture(params: SwapEnvironmentCNAMEsMessage): Future[js.Object] =
      service.swapEnvironmentCNAMEs(params).promise().toFuture
    @inline def terminateEnvironmentFuture(params: TerminateEnvironmentMessage): Future[EnvironmentDescription] =
      service.terminateEnvironment(params).promise().toFuture
    @inline def updateApplicationFuture(params: UpdateApplicationMessage): Future[ApplicationDescriptionMessage] =
      service.updateApplication(params).promise().toFuture
    @inline def updateApplicationResourceLifecycleFuture(
        params: UpdateApplicationResourceLifecycleMessage
    ): Future[ApplicationResourceLifecycleDescriptionMessage] =
      service.updateApplicationResourceLifecycle(params).promise().toFuture
    @inline def updateApplicationVersionFuture(
        params: UpdateApplicationVersionMessage
    ): Future[ApplicationVersionDescriptionMessage] = service.updateApplicationVersion(params).promise().toFuture
    @inline def updateConfigurationTemplateFuture(
        params: UpdateConfigurationTemplateMessage
    ): Future[ConfigurationSettingsDescription] = service.updateConfigurationTemplate(params).promise().toFuture
    @inline def updateEnvironmentFuture(params: UpdateEnvironmentMessage): Future[EnvironmentDescription] =
      service.updateEnvironment(params).promise().toFuture
    @inline def updateTagsForResourceFuture(params: UpdateTagsForResourceMessage): Future[js.Object] =
      service.updateTagsForResource(params).promise().toFuture
    @inline def validateConfigurationSettingsFuture(
        params: ValidateConfigurationSettingsMessage
    ): Future[ConfigurationSettingsValidationMessages] =
      service.validateConfigurationSettings(params).promise().toFuture
  }
}

package elasticbeanstalk {
  @js.native
  @JSImport("aws-sdk", "ElasticBeanstalk")
  class ElasticBeanstalk() extends js.Object {
    def this(config: AWSConfig) = this()

    def abortEnvironmentUpdate(params: AbortEnvironmentUpdateMessage): Request[js.Object] = js.native
    def applyEnvironmentManagedAction(
        params: ApplyEnvironmentManagedActionRequest
    ): Request[ApplyEnvironmentManagedActionResult] = js.native
    def checkDNSAvailability(params: CheckDNSAvailabilityMessage): Request[CheckDNSAvailabilityResultMessage] =
      js.native
    def composeEnvironments(params: ComposeEnvironmentsMessage): Request[EnvironmentDescriptionsMessage] = js.native
    def createApplication(params: CreateApplicationMessage): Request[ApplicationDescriptionMessage]      = js.native
    def createApplicationVersion(
        params: CreateApplicationVersionMessage
    ): Request[ApplicationVersionDescriptionMessage] = js.native
    def createConfigurationTemplate(
        params: CreateConfigurationTemplateMessage
    ): Request[ConfigurationSettingsDescription]                                                          = js.native
    def createEnvironment(params: CreateEnvironmentMessage): Request[EnvironmentDescription]              = js.native
    def createPlatformVersion(params: CreatePlatformVersionRequest): Request[CreatePlatformVersionResult] = js.native
    def createStorageLocation(): Request[CreateStorageLocationResultMessage]                              = js.native
    def deleteApplication(params: DeleteApplicationMessage): Request[js.Object]                           = js.native
    def deleteApplicationVersion(params: DeleteApplicationVersionMessage): Request[js.Object]             = js.native
    def deleteConfigurationTemplate(params: DeleteConfigurationTemplateMessage): Request[js.Object]       = js.native
    def deleteEnvironmentConfiguration(params: DeleteEnvironmentConfigurationMessage): Request[js.Object] = js.native
    def deletePlatformVersion(params: DeletePlatformVersionRequest): Request[DeletePlatformVersionResult] = js.native
    def describeAccountAttributes(): Request[DescribeAccountAttributesResult]                             = js.native
    def describeApplicationVersions(
        params: DescribeApplicationVersionsMessage
    ): Request[ApplicationVersionDescriptionsMessage]                                                      = js.native
    def describeApplications(params: DescribeApplicationsMessage): Request[ApplicationDescriptionsMessage] = js.native
    def describeConfigurationOptions(
        params: DescribeConfigurationOptionsMessage
    ): Request[ConfigurationOptionsDescription] = js.native
    def describeConfigurationSettings(
        params: DescribeConfigurationSettingsMessage
    ): Request[ConfigurationSettingsDescriptions] = js.native
    def describeEnvironmentHealth(params: DescribeEnvironmentHealthRequest): Request[DescribeEnvironmentHealthResult] =
      js.native
    def describeEnvironmentManagedActionHistory(
        params: DescribeEnvironmentManagedActionHistoryRequest
    ): Request[DescribeEnvironmentManagedActionHistoryResult] = js.native
    def describeEnvironmentManagedActions(
        params: DescribeEnvironmentManagedActionsRequest
    ): Request[DescribeEnvironmentManagedActionsResult] = js.native
    def describeEnvironmentResources(
        params: DescribeEnvironmentResourcesMessage
    ): Request[EnvironmentResourceDescriptionsMessage]                                                     = js.native
    def describeEnvironments(params: DescribeEnvironmentsMessage): Request[EnvironmentDescriptionsMessage] = js.native
    def describeEvents(params: DescribeEventsMessage): Request[EventDescriptionsMessage]                   = js.native
    def describeInstancesHealth(params: DescribeInstancesHealthRequest): Request[DescribeInstancesHealthResult] =
      js.native
    def describePlatformVersion(params: DescribePlatformVersionRequest): Request[DescribePlatformVersionResult] =
      js.native
    def listAvailableSolutionStacks(): Request[ListAvailableSolutionStacksResultMessage]                 = js.native
    def listPlatformVersions(params: ListPlatformVersionsRequest): Request[ListPlatformVersionsResult]   = js.native
    def listTagsForResource(params: ListTagsForResourceMessage): Request[ResourceTagsDescriptionMessage] = js.native
    def rebuildEnvironment(params: RebuildEnvironmentMessage): Request[js.Object]                        = js.native
    def requestEnvironmentInfo(params: RequestEnvironmentInfoMessage): Request[js.Object]                = js.native
    def restartAppServer(params: RestartAppServerMessage): Request[js.Object]                            = js.native
    def retrieveEnvironmentInfo(params: RetrieveEnvironmentInfoMessage): Request[RetrieveEnvironmentInfoResultMessage] =
      js.native
    def swapEnvironmentCNAMEs(params: SwapEnvironmentCNAMEsMessage): Request[js.Object]             = js.native
    def terminateEnvironment(params: TerminateEnvironmentMessage): Request[EnvironmentDescription]  = js.native
    def updateApplication(params: UpdateApplicationMessage): Request[ApplicationDescriptionMessage] = js.native
    def updateApplicationResourceLifecycle(
        params: UpdateApplicationResourceLifecycleMessage
    ): Request[ApplicationResourceLifecycleDescriptionMessage] = js.native
    def updateApplicationVersion(
        params: UpdateApplicationVersionMessage
    ): Request[ApplicationVersionDescriptionMessage] = js.native
    def updateConfigurationTemplate(
        params: UpdateConfigurationTemplateMessage
    ): Request[ConfigurationSettingsDescription]                                             = js.native
    def updateEnvironment(params: UpdateEnvironmentMessage): Request[EnvironmentDescription] = js.native
    def updateTagsForResource(params: UpdateTagsForResourceMessage): Request[js.Object]      = js.native
    def validateConfigurationSettings(
        params: ValidateConfigurationSettingsMessage
    ): Request[ConfigurationSettingsValidationMessages] = js.native
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait AbortEnvironmentUpdateMessage extends js.Object {
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var EnvironmentName: js.UndefOr[EnvironmentName]
  }

  @js.native
  sealed trait ActionHistoryStatus extends js.Any
  object ActionHistoryStatus extends js.Object {
    val Completed = "Completed".asInstanceOf[ActionHistoryStatus]
    val Failed    = "Failed".asInstanceOf[ActionHistoryStatus]
    val Unknown   = "Unknown".asInstanceOf[ActionHistoryStatus]

    val values = js.Object.freeze(js.Array(Completed, Failed, Unknown))
  }

  @js.native
  sealed trait ActionStatus extends js.Any
  object ActionStatus extends js.Object {
    val Scheduled = "Scheduled".asInstanceOf[ActionStatus]
    val Pending   = "Pending".asInstanceOf[ActionStatus]
    val Running   = "Running".asInstanceOf[ActionStatus]
    val Unknown   = "Unknown".asInstanceOf[ActionStatus]

    val values = js.Object.freeze(js.Array(Scheduled, Pending, Running, Unknown))
  }

  @js.native
  sealed trait ActionType extends js.Any
  object ActionType extends js.Object {
    val InstanceRefresh = "InstanceRefresh".asInstanceOf[ActionType]
    val PlatformUpdate  = "PlatformUpdate".asInstanceOf[ActionType]
    val Unknown         = "Unknown".asInstanceOf[ActionType]

    val values = js.Object.freeze(js.Array(InstanceRefresh, PlatformUpdate, Unknown))
  }

  /**
    * Describes the properties of an application.
    */
  @js.native
  @Factory
  trait ApplicationDescription extends js.Object {
    var ApplicationArn: js.UndefOr[ApplicationArn]
    var ApplicationName: js.UndefOr[ApplicationName]
    var ConfigurationTemplates: js.UndefOr[ConfigurationTemplateNamesList]
    var DateCreated: js.UndefOr[CreationDate]
    var DateUpdated: js.UndefOr[UpdateDate]
    var Description: js.UndefOr[Description]
    var ResourceLifecycleConfig: js.UndefOr[ApplicationResourceLifecycleConfig]
    var Versions: js.UndefOr[VersionLabelsList]
  }

  /**
    * Result message containing a single description of an application.
    */
  @js.native
  @Factory
  trait ApplicationDescriptionMessage extends js.Object {
    var Application: js.UndefOr[ApplicationDescription]
  }

  /**
    * Result message containing a list of application descriptions.
    */
  @js.native
  @Factory
  trait ApplicationDescriptionsMessage extends js.Object {
    var Applications: js.UndefOr[ApplicationDescriptionList]
  }

  /**
    * Application request metrics for an AWS Elastic Beanstalk environment.
    */
  @js.native
  @Factory
  trait ApplicationMetrics extends js.Object {
    var Duration: js.UndefOr[NullableInteger]
    var Latency: js.UndefOr[Latency]
    var RequestCount: js.UndefOr[RequestCount]
    var StatusCodes: js.UndefOr[StatusCodes]
  }

  /**
    * The resource lifecycle configuration for an application. Defines lifecycle settings for resources that belong to the application, and the service role that Elastic Beanstalk assumes in order to apply lifecycle settings. The version lifecycle configuration defines lifecycle settings for application versions.
    */
  @js.native
  @Factory
  trait ApplicationResourceLifecycleConfig extends js.Object {
    var ServiceRole: js.UndefOr[String]
    var VersionLifecycleConfig: js.UndefOr[ApplicationVersionLifecycleConfig]
  }

  @js.native
  @Factory
  trait ApplicationResourceLifecycleDescriptionMessage extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var ResourceLifecycleConfig: js.UndefOr[ApplicationResourceLifecycleConfig]
  }

  /**
    * Describes the properties of an application version.
    */
  @js.native
  @Factory
  trait ApplicationVersionDescription extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var ApplicationVersionArn: js.UndefOr[ApplicationVersionArn]
    var BuildArn: js.UndefOr[String]
    var DateCreated: js.UndefOr[CreationDate]
    var DateUpdated: js.UndefOr[UpdateDate]
    var Description: js.UndefOr[Description]
    var SourceBuildInformation: js.UndefOr[SourceBuildInformation]
    var SourceBundle: js.UndefOr[S3Location]
    var Status: js.UndefOr[ApplicationVersionStatus]
    var VersionLabel: js.UndefOr[VersionLabel]
  }

  /**
    * Result message wrapping a single description of an application version.
    */
  @js.native
  @Factory
  trait ApplicationVersionDescriptionMessage extends js.Object {
    var ApplicationVersion: js.UndefOr[ApplicationVersionDescription]
  }

  /**
    * Result message wrapping a list of application version descriptions.
    */
  @js.native
  @Factory
  trait ApplicationVersionDescriptionsMessage extends js.Object {
    var ApplicationVersions: js.UndefOr[ApplicationVersionDescriptionList]
    var NextToken: js.UndefOr[Token]
  }

  /**
    * The application version lifecycle settings for an application. Defines the rules that Elastic Beanstalk applies to an application's versions in order to avoid hitting the per-region limit for application versions.
    *  When Elastic Beanstalk deletes an application version from its database, you can no longer deploy that version to an environment. The source bundle remains in S3 unless you configure the rule to delete it.
    */
  @js.native
  @Factory
  trait ApplicationVersionLifecycleConfig extends js.Object {
    var MaxAgeRule: js.UndefOr[MaxAgeRule]
    var MaxCountRule: js.UndefOr[MaxCountRule]
  }

  @js.native
  sealed trait ApplicationVersionStatus extends js.Any
  object ApplicationVersionStatus extends js.Object {
    val Processed   = "Processed".asInstanceOf[ApplicationVersionStatus]
    val Unprocessed = "Unprocessed".asInstanceOf[ApplicationVersionStatus]
    val Failed      = "Failed".asInstanceOf[ApplicationVersionStatus]
    val Processing  = "Processing".asInstanceOf[ApplicationVersionStatus]
    val Building    = "Building".asInstanceOf[ApplicationVersionStatus]

    val values = js.Object.freeze(js.Array(Processed, Unprocessed, Failed, Processing, Building))
  }

  /**
    * Request to execute a scheduled managed action immediately.
    */
  @js.native
  @Factory
  trait ApplyEnvironmentManagedActionRequest extends js.Object {
    var ActionId: String
    var EnvironmentId: js.UndefOr[String]
    var EnvironmentName: js.UndefOr[String]
  }

  /**
    * The result message containing information about the managed action.
    */
  @js.native
  @Factory
  trait ApplyEnvironmentManagedActionResult extends js.Object {
    var ActionDescription: js.UndefOr[String]
    var ActionId: js.UndefOr[String]
    var ActionType: js.UndefOr[ActionType]
    var Status: js.UndefOr[String]
  }

  /**
    * Describes an Auto Scaling launch configuration.
    */
  @js.native
  @Factory
  trait AutoScalingGroup extends js.Object {
    var Name: js.UndefOr[ResourceId]
  }

  /**
    * Settings for an AWS CodeBuild build.
    */
  @js.native
  @Factory
  trait BuildConfiguration extends js.Object {
    var CodeBuildServiceRole: NonEmptyString
    var Image: NonEmptyString
    var ArtifactName: js.UndefOr[String]
    var ComputeType: js.UndefOr[ComputeType]
    var TimeoutInMinutes: js.UndefOr[BoxedInt]
  }

  /**
    * The builder used to build the custom platform.
    */
  @js.native
  @Factory
  trait Builder extends js.Object {
    var ARN: js.UndefOr[ARN]
  }

  /**
    * CPU utilization metrics for an instance.
    */
  @js.native
  @Factory
  trait CPUUtilization extends js.Object {
    var IOWait: js.UndefOr[NullableDouble]
    var IRQ: js.UndefOr[NullableDouble]
    var Idle: js.UndefOr[NullableDouble]
    var Nice: js.UndefOr[NullableDouble]
    var Privileged: js.UndefOr[NullableDouble]
    var SoftIRQ: js.UndefOr[NullableDouble]
    var System: js.UndefOr[NullableDouble]
    var User: js.UndefOr[NullableDouble]
  }

  /**
    * Results message indicating whether a CNAME is available.
    */
  @js.native
  @Factory
  trait CheckDNSAvailabilityMessage extends js.Object {
    var CNAMEPrefix: DNSCnamePrefix
  }

  /**
    * Indicates if the specified CNAME is available.
    */
  @js.native
  @Factory
  trait CheckDNSAvailabilityResultMessage extends js.Object {
    var Available: js.UndefOr[CnameAvailability]
    var FullyQualifiedCNAME: js.UndefOr[DNSCname]
  }

  /**
    * Request to create or update a group of environments.
    */
  @js.native
  @Factory
  trait ComposeEnvironmentsMessage extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var GroupName: js.UndefOr[GroupName]
    var VersionLabels: js.UndefOr[VersionLabels]
  }

  @js.native
  sealed trait ComputeType extends js.Any
  object ComputeType extends js.Object {
    val BUILD_GENERAL1_SMALL  = "BUILD_GENERAL1_SMALL".asInstanceOf[ComputeType]
    val BUILD_GENERAL1_MEDIUM = "BUILD_GENERAL1_MEDIUM".asInstanceOf[ComputeType]
    val BUILD_GENERAL1_LARGE  = "BUILD_GENERAL1_LARGE".asInstanceOf[ComputeType]

    val values = js.Object.freeze(js.Array(BUILD_GENERAL1_SMALL, BUILD_GENERAL1_MEDIUM, BUILD_GENERAL1_LARGE))
  }

  @js.native
  sealed trait ConfigurationDeploymentStatus extends js.Any
  object ConfigurationDeploymentStatus extends js.Object {
    val deployed = "deployed".asInstanceOf[ConfigurationDeploymentStatus]
    val pending  = "pending".asInstanceOf[ConfigurationDeploymentStatus]
    val failed   = "failed".asInstanceOf[ConfigurationDeploymentStatus]

    val values = js.Object.freeze(js.Array(deployed, pending, failed))
  }

  /**
    * Describes the possible values for a configuration option.
    */
  @js.native
  @Factory
  trait ConfigurationOptionDescription extends js.Object {
    var ChangeSeverity: js.UndefOr[ConfigurationOptionSeverity]
    var DefaultValue: js.UndefOr[ConfigurationOptionDefaultValue]
    var MaxLength: js.UndefOr[OptionRestrictionMaxLength]
    var MaxValue: js.UndefOr[OptionRestrictionMaxValue]
    var MinValue: js.UndefOr[OptionRestrictionMinValue]
    var Name: js.UndefOr[ConfigurationOptionName]
    var Namespace: js.UndefOr[OptionNamespace]
    var Regex: js.UndefOr[OptionRestrictionRegex]
    var UserDefined: js.UndefOr[UserDefinedOption]
    var ValueOptions: js.UndefOr[ConfigurationOptionPossibleValues]
    var ValueType: js.UndefOr[ConfigurationOptionValueType]
  }

  /**
    * A specification identifying an individual configuration option along with its current value. For a list of possible option values, go to [[https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options.html|Option Values]] in the <i>AWS Elastic Beanstalk Developer Guide</i>.
    */
  @js.native
  @Factory
  trait ConfigurationOptionSetting extends js.Object {
    var Namespace: js.UndefOr[OptionNamespace]
    var OptionName: js.UndefOr[ConfigurationOptionName]
    var ResourceName: js.UndefOr[ResourceName]
    var Value: js.UndefOr[ConfigurationOptionValue]
  }

  @js.native
  sealed trait ConfigurationOptionValueType extends js.Any
  object ConfigurationOptionValueType extends js.Object {
    val Scalar = "Scalar".asInstanceOf[ConfigurationOptionValueType]
    val List   = "List".asInstanceOf[ConfigurationOptionValueType]

    val values = js.Object.freeze(js.Array(Scalar, List))
  }

  /**
    * Describes the settings for a specified configuration set.
    */
  @js.native
  @Factory
  trait ConfigurationOptionsDescription extends js.Object {
    var Options: js.UndefOr[ConfigurationOptionDescriptionsList]
    var PlatformArn: js.UndefOr[PlatformArn]
    var SolutionStackName: js.UndefOr[SolutionStackName]
  }

  /**
    * Describes the settings for a configuration set.
    */
  @js.native
  @Factory
  trait ConfigurationSettingsDescription extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var DateCreated: js.UndefOr[CreationDate]
    var DateUpdated: js.UndefOr[UpdateDate]
    var DeploymentStatus: js.UndefOr[ConfigurationDeploymentStatus]
    var Description: js.UndefOr[Description]
    var EnvironmentName: js.UndefOr[EnvironmentName]
    var OptionSettings: js.UndefOr[ConfigurationOptionSettingsList]
    var PlatformArn: js.UndefOr[PlatformArn]
    var SolutionStackName: js.UndefOr[SolutionStackName]
    var TemplateName: js.UndefOr[ConfigurationTemplateName]
  }

  /**
    * The results from a request to change the configuration settings of an environment.
    */
  @js.native
  @Factory
  trait ConfigurationSettingsDescriptions extends js.Object {
    var ConfigurationSettings: js.UndefOr[ConfigurationSettingsDescriptionList]
  }

  /**
    * Provides a list of validation messages.
    */
  @js.native
  @Factory
  trait ConfigurationSettingsValidationMessages extends js.Object {
    var Messages: js.UndefOr[ValidationMessagesList]
  }

  /**
    * Request to create an application.
    */
  @js.native
  @Factory
  trait CreateApplicationMessage extends js.Object {
    var ApplicationName: ApplicationName
    var Description: js.UndefOr[Description]
    var ResourceLifecycleConfig: js.UndefOr[ApplicationResourceLifecycleConfig]
    var Tags: js.UndefOr[Tags]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CreateApplicationVersionMessage extends js.Object {
    var ApplicationName: ApplicationName
    var VersionLabel: VersionLabel
    var AutoCreateApplication: js.UndefOr[AutoCreateApplication]
    var BuildConfiguration: js.UndefOr[BuildConfiguration]
    var Description: js.UndefOr[Description]
    var Process: js.UndefOr[ApplicationVersionProccess]
    var SourceBuildInformation: js.UndefOr[SourceBuildInformation]
    var SourceBundle: js.UndefOr[S3Location]
    var Tags: js.UndefOr[Tags]
  }

  /**
    * Request to create a configuration template.
    */
  @js.native
  @Factory
  trait CreateConfigurationTemplateMessage extends js.Object {
    var ApplicationName: ApplicationName
    var TemplateName: ConfigurationTemplateName
    var Description: js.UndefOr[Description]
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var OptionSettings: js.UndefOr[ConfigurationOptionSettingsList]
    var PlatformArn: js.UndefOr[PlatformArn]
    var SolutionStackName: js.UndefOr[SolutionStackName]
    var SourceConfiguration: js.UndefOr[SourceConfiguration]
    var Tags: js.UndefOr[Tags]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CreateEnvironmentMessage extends js.Object {
    var ApplicationName: ApplicationName
    var CNAMEPrefix: js.UndefOr[DNSCnamePrefix]
    var Description: js.UndefOr[Description]
    var EnvironmentName: js.UndefOr[EnvironmentName]
    var GroupName: js.UndefOr[GroupName]
    var OptionSettings: js.UndefOr[ConfigurationOptionSettingsList]
    var OptionsToRemove: js.UndefOr[OptionsSpecifierList]
    var PlatformArn: js.UndefOr[PlatformArn]
    var SolutionStackName: js.UndefOr[SolutionStackName]
    var Tags: js.UndefOr[Tags]
    var TemplateName: js.UndefOr[ConfigurationTemplateName]
    var Tier: js.UndefOr[EnvironmentTier]
    var VersionLabel: js.UndefOr[VersionLabel]
  }

  /**
    * Request to create a new platform version.
    */
  @js.native
  @Factory
  trait CreatePlatformVersionRequest extends js.Object {
    var PlatformDefinitionBundle: S3Location
    var PlatformName: PlatformName
    var PlatformVersion: PlatformVersion
    var EnvironmentName: js.UndefOr[EnvironmentName]
    var OptionSettings: js.UndefOr[ConfigurationOptionSettingsList]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait CreatePlatformVersionResult extends js.Object {
    var Builder: js.UndefOr[Builder]
    var PlatformSummary: js.UndefOr[PlatformSummary]
  }

  /**
    * Results of a <a>CreateStorageLocationResult</a> call.
    */
  @js.native
  @Factory
  trait CreateStorageLocationResultMessage extends js.Object {
    var S3Bucket: js.UndefOr[S3Bucket]
  }

  /**
    * A custom AMI available to platforms.
    */
  @js.native
  @Factory
  trait CustomAmi extends js.Object {
    var ImageId: js.UndefOr[ImageId]
    var VirtualizationType: js.UndefOr[VirtualizationType]
  }

  /**
    * Request to delete an application.
    */
  @js.native
  @Factory
  trait DeleteApplicationMessage extends js.Object {
    var ApplicationName: ApplicationName
    var TerminateEnvByForce: js.UndefOr[TerminateEnvForce]
  }

  /**
    * Request to delete an application version.
    */
  @js.native
  @Factory
  trait DeleteApplicationVersionMessage extends js.Object {
    var ApplicationName: ApplicationName
    var VersionLabel: VersionLabel
    var DeleteSourceBundle: js.UndefOr[DeleteSourceBundle]
  }

  /**
    * Request to delete a configuration template.
    */
  @js.native
  @Factory
  trait DeleteConfigurationTemplateMessage extends js.Object {
    var ApplicationName: ApplicationName
    var TemplateName: ConfigurationTemplateName
  }

  /**
    * Request to delete a draft environment configuration.
    */
  @js.native
  @Factory
  trait DeleteEnvironmentConfigurationMessage extends js.Object {
    var ApplicationName: ApplicationName
    var EnvironmentName: EnvironmentName
  }

  @js.native
  @Factory
  trait DeletePlatformVersionRequest extends js.Object {
    var PlatformArn: js.UndefOr[PlatformArn]
  }

  @js.native
  @Factory
  trait DeletePlatformVersionResult extends js.Object {
    var PlatformSummary: js.UndefOr[PlatformSummary]
  }

  /**
    * Information about an application version deployment.
    */
  @js.native
  @Factory
  trait Deployment extends js.Object {
    var DeploymentId: js.UndefOr[NullableLong]
    var DeploymentTime: js.UndefOr[DeploymentTimestamp]
    var Status: js.UndefOr[String]
    var VersionLabel: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeAccountAttributesResult extends js.Object {
    var ResourceQuotas: js.UndefOr[ResourceQuotas]
  }

  /**
    * Request to describe application versions.
    */
  @js.native
  @Factory
  trait DescribeApplicationVersionsMessage extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[Token]
    var VersionLabels: js.UndefOr[VersionLabelsList]
  }

  /**
    * Request to describe one or more applications.
    */
  @js.native
  @Factory
  trait DescribeApplicationsMessage extends js.Object {
    var ApplicationNames: js.UndefOr[ApplicationNamesList]
  }

  /**
    * Result message containing a list of application version descriptions.
    */
  @js.native
  @Factory
  trait DescribeConfigurationOptionsMessage extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var EnvironmentName: js.UndefOr[EnvironmentName]
    var Options: js.UndefOr[OptionsSpecifierList]
    var PlatformArn: js.UndefOr[PlatformArn]
    var SolutionStackName: js.UndefOr[SolutionStackName]
    var TemplateName: js.UndefOr[ConfigurationTemplateName]
  }

  /**
    * Result message containing all of the configuration settings for a specified solution stack or configuration template.
    */
  @js.native
  @Factory
  trait DescribeConfigurationSettingsMessage extends js.Object {
    var ApplicationName: ApplicationName
    var EnvironmentName: js.UndefOr[EnvironmentName]
    var TemplateName: js.UndefOr[ConfigurationTemplateName]
  }

  /**
    * See the example below to learn how to create a request body.
    */
  @js.native
  @Factory
  trait DescribeEnvironmentHealthRequest extends js.Object {
    var AttributeNames: js.UndefOr[EnvironmentHealthAttributes]
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var EnvironmentName: js.UndefOr[EnvironmentName]
  }

  /**
    * Health details for an AWS Elastic Beanstalk environment.
    */
  @js.native
  @Factory
  trait DescribeEnvironmentHealthResult extends js.Object {
    var ApplicationMetrics: js.UndefOr[ApplicationMetrics]
    var Causes: js.UndefOr[Causes]
    var Color: js.UndefOr[String]
    var EnvironmentName: js.UndefOr[EnvironmentName]
    var HealthStatus: js.UndefOr[String]
    var InstancesHealth: js.UndefOr[InstanceHealthSummary]
    var RefreshedAt: js.UndefOr[RefreshedAt]
    var Status: js.UndefOr[EnvironmentHealth]
  }

  /**
    * Request to list completed and failed managed actions.
    */
  @js.native
  @Factory
  trait DescribeEnvironmentManagedActionHistoryRequest extends js.Object {
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var EnvironmentName: js.UndefOr[EnvironmentName]
    var MaxItems: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  /**
    * A result message containing a list of completed and failed managed actions.
    */
  @js.native
  @Factory
  trait DescribeEnvironmentManagedActionHistoryResult extends js.Object {
    var ManagedActionHistoryItems: js.UndefOr[ManagedActionHistoryItems]
    var NextToken: js.UndefOr[String]
  }

  /**
    * Request to list an environment's upcoming and in-progress managed actions.
    */
  @js.native
  @Factory
  trait DescribeEnvironmentManagedActionsRequest extends js.Object {
    var EnvironmentId: js.UndefOr[String]
    var EnvironmentName: js.UndefOr[String]
    var Status: js.UndefOr[ActionStatus]
  }

  /**
    * The result message containing a list of managed actions.
    */
  @js.native
  @Factory
  trait DescribeEnvironmentManagedActionsResult extends js.Object {
    var ManagedActions: js.UndefOr[ManagedActions]
  }

  /**
    * Request to describe the resources in an environment.
    */
  @js.native
  @Factory
  trait DescribeEnvironmentResourcesMessage extends js.Object {
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var EnvironmentName: js.UndefOr[EnvironmentName]
  }

  /**
    * Request to describe one or more environments.
    */
  @js.native
  @Factory
  trait DescribeEnvironmentsMessage extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var EnvironmentIds: js.UndefOr[EnvironmentIdList]
    var EnvironmentNames: js.UndefOr[EnvironmentNamesList]
    var IncludeDeleted: js.UndefOr[IncludeDeleted]
    var IncludedDeletedBackTo: js.UndefOr[IncludeDeletedBackTo]
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[Token]
    var VersionLabel: js.UndefOr[VersionLabel]
  }

  /**
    * Request to retrieve a list of events for an environment.
    */
  @js.native
  @Factory
  trait DescribeEventsMessage extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var EndTime: js.UndefOr[TimeFilterEnd]
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var EnvironmentName: js.UndefOr[EnvironmentName]
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[Token]
    var PlatformArn: js.UndefOr[PlatformArn]
    var RequestId: js.UndefOr[RequestId]
    var Severity: js.UndefOr[EventSeverity]
    var StartTime: js.UndefOr[TimeFilterStart]
    var TemplateName: js.UndefOr[ConfigurationTemplateName]
    var VersionLabel: js.UndefOr[VersionLabel]
  }

  /**
    * Parameters for a call to <code>DescribeInstancesHealth</code>.
    */
  @js.native
  @Factory
  trait DescribeInstancesHealthRequest extends js.Object {
    var AttributeNames: js.UndefOr[InstancesHealthAttributes]
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var EnvironmentName: js.UndefOr[EnvironmentName]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Detailed health information about the Amazon EC2 instances in an AWS Elastic Beanstalk environment.
    */
  @js.native
  @Factory
  trait DescribeInstancesHealthResult extends js.Object {
    var InstanceHealthList: js.UndefOr[InstanceHealthList]
    var NextToken: js.UndefOr[NextToken]
    var RefreshedAt: js.UndefOr[RefreshedAt]
  }

  @js.native
  @Factory
  trait DescribePlatformVersionRequest extends js.Object {
    var PlatformArn: js.UndefOr[PlatformArn]
  }

  @js.native
  @Factory
  trait DescribePlatformVersionResult extends js.Object {
    var PlatformDescription: js.UndefOr[PlatformDescription]
  }

  /**
    * Describes the properties of an environment.
    */
  @js.native
  @Factory
  trait EnvironmentDescription extends js.Object {
    var AbortableOperationInProgress: js.UndefOr[AbortableOperationInProgress]
    var ApplicationName: js.UndefOr[ApplicationName]
    var CNAME: js.UndefOr[DNSCname]
    var DateCreated: js.UndefOr[CreationDate]
    var DateUpdated: js.UndefOr[UpdateDate]
    var Description: js.UndefOr[Description]
    var EndpointURL: js.UndefOr[EndpointURL]
    var EnvironmentArn: js.UndefOr[EnvironmentArn]
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var EnvironmentLinks: js.UndefOr[EnvironmentLinks]
    var EnvironmentName: js.UndefOr[EnvironmentName]
    var Health: js.UndefOr[EnvironmentHealth]
    var HealthStatus: js.UndefOr[EnvironmentHealthStatus]
    var PlatformArn: js.UndefOr[PlatformArn]
    var Resources: js.UndefOr[EnvironmentResourcesDescription]
    var SolutionStackName: js.UndefOr[SolutionStackName]
    var Status: js.UndefOr[EnvironmentStatus]
    var TemplateName: js.UndefOr[ConfigurationTemplateName]
    var Tier: js.UndefOr[EnvironmentTier]
    var VersionLabel: js.UndefOr[VersionLabel]
  }

  /**
    * Result message containing a list of environment descriptions.
    */
  @js.native
  @Factory
  trait EnvironmentDescriptionsMessage extends js.Object {
    var Environments: js.UndefOr[EnvironmentDescriptionsList]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  sealed trait EnvironmentHealth extends js.Any
  object EnvironmentHealth extends js.Object {
    val Green  = "Green".asInstanceOf[EnvironmentHealth]
    val Yellow = "Yellow".asInstanceOf[EnvironmentHealth]
    val Red    = "Red".asInstanceOf[EnvironmentHealth]
    val Grey   = "Grey".asInstanceOf[EnvironmentHealth]

    val values = js.Object.freeze(js.Array(Green, Yellow, Red, Grey))
  }

  @js.native
  sealed trait EnvironmentHealthAttribute extends js.Any
  object EnvironmentHealthAttribute extends js.Object {
    val Status             = "Status".asInstanceOf[EnvironmentHealthAttribute]
    val Color              = "Color".asInstanceOf[EnvironmentHealthAttribute]
    val Causes             = "Causes".asInstanceOf[EnvironmentHealthAttribute]
    val ApplicationMetrics = "ApplicationMetrics".asInstanceOf[EnvironmentHealthAttribute]
    val InstancesHealth    = "InstancesHealth".asInstanceOf[EnvironmentHealthAttribute]
    val All                = "All".asInstanceOf[EnvironmentHealthAttribute]
    val HealthStatus       = "HealthStatus".asInstanceOf[EnvironmentHealthAttribute]
    val RefreshedAt        = "RefreshedAt".asInstanceOf[EnvironmentHealthAttribute]

    val values = js.Object.freeze(
      js.Array(Status, Color, Causes, ApplicationMetrics, InstancesHealth, All, HealthStatus, RefreshedAt)
    )
  }

  @js.native
  sealed trait EnvironmentHealthStatus extends js.Any
  object EnvironmentHealthStatus extends js.Object {
    val NoData    = "NoData".asInstanceOf[EnvironmentHealthStatus]
    val Unknown   = "Unknown".asInstanceOf[EnvironmentHealthStatus]
    val Pending   = "Pending".asInstanceOf[EnvironmentHealthStatus]
    val Ok        = "Ok".asInstanceOf[EnvironmentHealthStatus]
    val Info      = "Info".asInstanceOf[EnvironmentHealthStatus]
    val Warning   = "Warning".asInstanceOf[EnvironmentHealthStatus]
    val Degraded  = "Degraded".asInstanceOf[EnvironmentHealthStatus]
    val Severe    = "Severe".asInstanceOf[EnvironmentHealthStatus]
    val Suspended = "Suspended".asInstanceOf[EnvironmentHealthStatus]

    val values = js.Object.freeze(js.Array(NoData, Unknown, Pending, Ok, Info, Warning, Degraded, Severe, Suspended))
  }

  /**
    * The information retrieved from the Amazon EC2 instances.
    */
  @js.native
  @Factory
  trait EnvironmentInfoDescription extends js.Object {
    var Ec2InstanceId: js.UndefOr[Ec2InstanceId]
    var InfoType: js.UndefOr[EnvironmentInfoType]
    var Message: js.UndefOr[Message]
    var SampleTimestamp: js.UndefOr[SampleTimestamp]
  }

  @js.native
  sealed trait EnvironmentInfoType extends js.Any
  object EnvironmentInfoType extends js.Object {
    val tail   = "tail".asInstanceOf[EnvironmentInfoType]
    val bundle = "bundle".asInstanceOf[EnvironmentInfoType]

    val values = js.Object.freeze(js.Array(tail, bundle))
  }

  /**
    * A link to another environment, defined in the environment's manifest. Links provide connection information in system properties that can be used to connect to another environment in the same group. See [[https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html|Environment Manifest (env.yaml)]] for details.
    */
  @js.native
  @Factory
  trait EnvironmentLink extends js.Object {
    var EnvironmentName: js.UndefOr[String]
    var LinkName: js.UndefOr[String]
  }

  /**
    * Describes the AWS resources in use by this environment. This data is live.
    */
  @js.native
  @Factory
  trait EnvironmentResourceDescription extends js.Object {
    var AutoScalingGroups: js.UndefOr[AutoScalingGroupList]
    var EnvironmentName: js.UndefOr[EnvironmentName]
    var Instances: js.UndefOr[InstanceList]
    var LaunchConfigurations: js.UndefOr[LaunchConfigurationList]
    var LaunchTemplates: js.UndefOr[LaunchTemplateList]
    var LoadBalancers: js.UndefOr[LoadBalancerList]
    var Queues: js.UndefOr[QueueList]
    var Triggers: js.UndefOr[TriggerList]
  }

  /**
    * Result message containing a list of environment resource descriptions.
    */
  @js.native
  @Factory
  trait EnvironmentResourceDescriptionsMessage extends js.Object {
    var EnvironmentResources: js.UndefOr[EnvironmentResourceDescription]
  }

  /**
    * Describes the AWS resources in use by this environment. This data is not live data.
    */
  @js.native
  @Factory
  trait EnvironmentResourcesDescription extends js.Object {
    var LoadBalancer: js.UndefOr[LoadBalancerDescription]
  }

  @js.native
  sealed trait EnvironmentStatus extends js.Any
  object EnvironmentStatus extends js.Object {
    val Launching   = "Launching".asInstanceOf[EnvironmentStatus]
    val Updating    = "Updating".asInstanceOf[EnvironmentStatus]
    val Ready       = "Ready".asInstanceOf[EnvironmentStatus]
    val Terminating = "Terminating".asInstanceOf[EnvironmentStatus]
    val Terminated  = "Terminated".asInstanceOf[EnvironmentStatus]

    val values = js.Object.freeze(js.Array(Launching, Updating, Ready, Terminating, Terminated))
  }

  /**
    * Describes the properties of an environment tier
    */
  @js.native
  @Factory
  trait EnvironmentTier extends js.Object {
    var Name: js.UndefOr[String]
    var Type: js.UndefOr[String]
    var Version: js.UndefOr[String]
  }

  /**
    * Describes an event.
    */
  @js.native
  @Factory
  trait EventDescription extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var EnvironmentName: js.UndefOr[EnvironmentName]
    var EventDate: js.UndefOr[EventDate]
    var Message: js.UndefOr[EventMessage]
    var PlatformArn: js.UndefOr[PlatformArn]
    var RequestId: js.UndefOr[RequestId]
    var Severity: js.UndefOr[EventSeverity]
    var TemplateName: js.UndefOr[ConfigurationTemplateName]
    var VersionLabel: js.UndefOr[VersionLabel]
  }

  /**
    * Result message wrapping a list of event descriptions.
    */
  @js.native
  @Factory
  trait EventDescriptionsMessage extends js.Object {
    var Events: js.UndefOr[EventDescriptionList]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  sealed trait EventSeverity extends js.Any
  object EventSeverity extends js.Object {
    val TRACE = "TRACE".asInstanceOf[EventSeverity]
    val DEBUG = "DEBUG".asInstanceOf[EventSeverity]
    val INFO  = "INFO".asInstanceOf[EventSeverity]
    val WARN  = "WARN".asInstanceOf[EventSeverity]
    val ERROR = "ERROR".asInstanceOf[EventSeverity]
    val FATAL = "FATAL".asInstanceOf[EventSeverity]

    val values = js.Object.freeze(js.Array(TRACE, DEBUG, INFO, WARN, ERROR, FATAL))
  }

  @js.native
  sealed trait FailureType extends js.Any
  object FailureType extends js.Object {
    val UpdateCancelled         = "UpdateCancelled".asInstanceOf[FailureType]
    val CancellationFailed      = "CancellationFailed".asInstanceOf[FailureType]
    val RollbackFailed          = "RollbackFailed".asInstanceOf[FailureType]
    val RollbackSuccessful      = "RollbackSuccessful".asInstanceOf[FailureType]
    val InternalFailure         = "InternalFailure".asInstanceOf[FailureType]
    val InvalidEnvironmentState = "InvalidEnvironmentState".asInstanceOf[FailureType]
    val PermissionsError        = "PermissionsError".asInstanceOf[FailureType]

    val values = js.Object.freeze(
      js.Array(
        UpdateCancelled,
        CancellationFailed,
        RollbackFailed,
        RollbackSuccessful,
        InternalFailure,
        InvalidEnvironmentState,
        PermissionsError
      )
    )
  }

  /**
    * The description of an Amazon EC2 instance.
    */
  @js.native
  @Factory
  trait Instance extends js.Object {
    var Id: js.UndefOr[ResourceId]
  }

  /**
    * Represents summary information about the health of an instance. For more information, see [[https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html|Health Colors and Statuses]].
    */
  @js.native
  @Factory
  trait InstanceHealthSummary extends js.Object {
    var Degraded: js.UndefOr[NullableInteger]
    var Info: js.UndefOr[NullableInteger]
    var NoData: js.UndefOr[NullableInteger]
    var Ok: js.UndefOr[NullableInteger]
    var Pending: js.UndefOr[NullableInteger]
    var Severe: js.UndefOr[NullableInteger]
    var Unknown: js.UndefOr[NullableInteger]
    var Warning: js.UndefOr[NullableInteger]
  }

  @js.native
  sealed trait InstancesHealthAttribute extends js.Any
  object InstancesHealthAttribute extends js.Object {
    val HealthStatus       = "HealthStatus".asInstanceOf[InstancesHealthAttribute]
    val Color              = "Color".asInstanceOf[InstancesHealthAttribute]
    val Causes             = "Causes".asInstanceOf[InstancesHealthAttribute]
    val ApplicationMetrics = "ApplicationMetrics".asInstanceOf[InstancesHealthAttribute]
    val RefreshedAt        = "RefreshedAt".asInstanceOf[InstancesHealthAttribute]
    val LaunchedAt         = "LaunchedAt".asInstanceOf[InstancesHealthAttribute]
    val System             = "System".asInstanceOf[InstancesHealthAttribute]
    val Deployment         = "Deployment".asInstanceOf[InstancesHealthAttribute]
    val AvailabilityZone   = "AvailabilityZone".asInstanceOf[InstancesHealthAttribute]
    val InstanceType       = "InstanceType".asInstanceOf[InstancesHealthAttribute]
    val All                = "All".asInstanceOf[InstancesHealthAttribute]

    val values = js.Object.freeze(
      js.Array(
        HealthStatus,
        Color,
        Causes,
        ApplicationMetrics,
        RefreshedAt,
        LaunchedAt,
        System,
        Deployment,
        AvailabilityZone,
        InstanceType,
        All
      )
    )
  }

  /**
    * Represents the average latency for the slowest X percent of requests over the last 10 seconds.
    */
  @js.native
  @Factory
  trait Latency extends js.Object {
    var P10: js.UndefOr[NullableDouble]
    var P50: js.UndefOr[NullableDouble]
    var P75: js.UndefOr[NullableDouble]
    var P85: js.UndefOr[NullableDouble]
    var P90: js.UndefOr[NullableDouble]
    var P95: js.UndefOr[NullableDouble]
    var P99: js.UndefOr[NullableDouble]
    var P999: js.UndefOr[NullableDouble]
  }

  /**
    * Describes an Auto Scaling launch configuration.
    */
  @js.native
  @Factory
  trait LaunchConfiguration extends js.Object {
    var Name: js.UndefOr[ResourceId]
  }

  /**
    * Describes an Amazon EC2 launch template.
    */
  @js.native
  @Factory
  trait LaunchTemplate extends js.Object {
    var Id: js.UndefOr[ResourceId]
  }

  /**
    * A list of available AWS Elastic Beanstalk solution stacks.
    */
  @js.native
  @Factory
  trait ListAvailableSolutionStacksResultMessage extends js.Object {
    var SolutionStackDetails: js.UndefOr[AvailableSolutionStackDetailsList]
    var SolutionStacks: js.UndefOr[AvailableSolutionStackNamesList]
  }

  @js.native
  @Factory
  trait ListPlatformVersionsRequest extends js.Object {
    var Filters: js.UndefOr[PlatformFilters]
    var MaxRecords: js.UndefOr[PlatformMaxRecords]
    var NextToken: js.UndefOr[Token]
  }

  @js.native
  @Factory
  trait ListPlatformVersionsResult extends js.Object {
    var NextToken: js.UndefOr[Token]
    var PlatformSummaryList: js.UndefOr[PlatformSummaryList]
  }

  @js.native
  @Factory
  trait ListTagsForResourceMessage extends js.Object {
    var ResourceArn: ResourceArn
  }

  /**
    * Describes the properties of a Listener for the LoadBalancer.
    */
  @js.native
  @Factory
  trait Listener extends js.Object {
    var Port: js.UndefOr[Int]
    var Protocol: js.UndefOr[String]
  }

  /**
    * Describes a LoadBalancer.
    */
  @js.native
  @Factory
  trait LoadBalancer extends js.Object {
    var Name: js.UndefOr[ResourceId]
  }

  /**
    * Describes the details of a LoadBalancer.
    */
  @js.native
  @Factory
  trait LoadBalancerDescription extends js.Object {
    var Domain: js.UndefOr[String]
    var Listeners: js.UndefOr[LoadBalancerListenersDescription]
    var LoadBalancerName: js.UndefOr[String]
  }

  /**
    * The record of an upcoming or in-progress managed action.
    */
  @js.native
  @Factory
  trait ManagedAction extends js.Object {
    var ActionDescription: js.UndefOr[String]
    var ActionId: js.UndefOr[String]
    var ActionType: js.UndefOr[ActionType]
    var Status: js.UndefOr[ActionStatus]
    var WindowStartTime: js.UndefOr[Timestamp]
  }

  /**
    * The record of a completed or failed managed action.
    */
  @js.native
  @Factory
  trait ManagedActionHistoryItem extends js.Object {
    var ActionDescription: js.UndefOr[String]
    var ActionId: js.UndefOr[String]
    var ActionType: js.UndefOr[ActionType]
    var ExecutedTime: js.UndefOr[Timestamp]
    var FailureDescription: js.UndefOr[String]
    var FailureType: js.UndefOr[FailureType]
    var FinishedTime: js.UndefOr[Timestamp]
    var Status: js.UndefOr[ActionHistoryStatus]
  }

  /**
    * A lifecycle rule that deletes application versions after the specified number of days.
    */
  @js.native
  @Factory
  trait MaxAgeRule extends js.Object {
    var Enabled: BoxedBoolean
    var DeleteSourceFromS3: js.UndefOr[BoxedBoolean]
    var MaxAgeInDays: js.UndefOr[BoxedInt]
  }

  /**
    * A lifecycle rule that deletes the oldest application version when the maximum count is exceeded.
    */
  @js.native
  @Factory
  trait MaxCountRule extends js.Object {
    var Enabled: BoxedBoolean
    var DeleteSourceFromS3: js.UndefOr[BoxedBoolean]
    var MaxCount: js.UndefOr[BoxedInt]
  }

  /**
    * A regular expression representing a restriction on a string configuration option value.
    */
  @js.native
  @Factory
  trait OptionRestrictionRegex extends js.Object {
    var Label: js.UndefOr[RegexLabel]
    var Pattern: js.UndefOr[RegexPattern]
  }

  /**
    * A specification identifying an individual configuration option.
    */
  @js.native
  @Factory
  trait OptionSpecification extends js.Object {
    var Namespace: js.UndefOr[OptionNamespace]
    var OptionName: js.UndefOr[ConfigurationOptionName]
    var ResourceName: js.UndefOr[ResourceName]
  }

  /**
    * Detailed information about a platform.
    */
  @js.native
  @Factory
  trait PlatformDescription extends js.Object {
    var CustomAmiList: js.UndefOr[CustomAmiList]
    var DateCreated: js.UndefOr[CreationDate]
    var DateUpdated: js.UndefOr[UpdateDate]
    var Description: js.UndefOr[Description]
    var Frameworks: js.UndefOr[PlatformFrameworks]
    var Maintainer: js.UndefOr[Maintainer]
    var OperatingSystemName: js.UndefOr[OperatingSystemName]
    var OperatingSystemVersion: js.UndefOr[OperatingSystemVersion]
    var PlatformArn: js.UndefOr[PlatformArn]
    var PlatformCategory: js.UndefOr[PlatformCategory]
    var PlatformName: js.UndefOr[PlatformName]
    var PlatformOwner: js.UndefOr[PlatformOwner]
    var PlatformStatus: js.UndefOr[PlatformStatus]
    var PlatformVersion: js.UndefOr[PlatformVersion]
    var ProgrammingLanguages: js.UndefOr[PlatformProgrammingLanguages]
    var SolutionStackName: js.UndefOr[SolutionStackName]
    var SupportedAddonList: js.UndefOr[SupportedAddonList]
    var SupportedTierList: js.UndefOr[SupportedTierList]
  }

  /**
    * Specify criteria to restrict the results when listing custom platforms.
    *  The filter is evaluated as the expression:
    *  <code>Type</code> <code>Operator</code> <code>Values[i]</code>
    */
  @js.native
  @Factory
  trait PlatformFilter extends js.Object {
    var Operator: js.UndefOr[PlatformFilterOperator]
    var Type: js.UndefOr[PlatformFilterType]
    var Values: js.UndefOr[PlatformFilterValueList]
  }

  /**
    * A framework supported by the custom platform.
    */
  @js.native
  @Factory
  trait PlatformFramework extends js.Object {
    var Name: js.UndefOr[String]
    var Version: js.UndefOr[String]
  }

  /**
    * A programming language supported by the platform.
    */
  @js.native
  @Factory
  trait PlatformProgrammingLanguage extends js.Object {
    var Name: js.UndefOr[String]
    var Version: js.UndefOr[String]
  }

  @js.native
  sealed trait PlatformStatus extends js.Any
  object PlatformStatus extends js.Object {
    val Creating = "Creating".asInstanceOf[PlatformStatus]
    val Failed   = "Failed".asInstanceOf[PlatformStatus]
    val Ready    = "Ready".asInstanceOf[PlatformStatus]
    val Deleting = "Deleting".asInstanceOf[PlatformStatus]
    val Deleted  = "Deleted".asInstanceOf[PlatformStatus]

    val values = js.Object.freeze(js.Array(Creating, Failed, Ready, Deleting, Deleted))
  }

  /**
    * Detailed information about a platform.
    */
  @js.native
  @Factory
  trait PlatformSummary extends js.Object {
    var OperatingSystemName: js.UndefOr[OperatingSystemName]
    var OperatingSystemVersion: js.UndefOr[OperatingSystemVersion]
    var PlatformArn: js.UndefOr[PlatformArn]
    var PlatformCategory: js.UndefOr[PlatformCategory]
    var PlatformOwner: js.UndefOr[PlatformOwner]
    var PlatformStatus: js.UndefOr[PlatformStatus]
    var SupportedAddonList: js.UndefOr[SupportedAddonList]
    var SupportedTierList: js.UndefOr[SupportedTierList]
  }

  /**
    * Describes a queue.
    */
  @js.native
  @Factory
  trait Queue extends js.Object {
    var Name: js.UndefOr[String]
    var URL: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait RebuildEnvironmentMessage extends js.Object {
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var EnvironmentName: js.UndefOr[EnvironmentName]
  }

  /**
    * Request to retrieve logs from an environment and store them in your Elastic Beanstalk storage bucket.
    */
  @js.native
  @Factory
  trait RequestEnvironmentInfoMessage extends js.Object {
    var InfoType: EnvironmentInfoType
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var EnvironmentName: js.UndefOr[EnvironmentName]
  }

  /**
    * The AWS Elastic Beanstalk quota information for a single resource type in an AWS account. It reflects the resource's limits for this account.
    */
  @js.native
  @Factory
  trait ResourceQuota extends js.Object {
    var Maximum: js.UndefOr[BoxedInt]
  }

  /**
    * A set of per-resource AWS Elastic Beanstalk quotas associated with an AWS account. They reflect Elastic Beanstalk resource limits for this account.
    */
  @js.native
  @Factory
  trait ResourceQuotas extends js.Object {
    var ApplicationQuota: js.UndefOr[ResourceQuota]
    var ApplicationVersionQuota: js.UndefOr[ResourceQuota]
    var ConfigurationTemplateQuota: js.UndefOr[ResourceQuota]
    var CustomPlatformQuota: js.UndefOr[ResourceQuota]
    var EnvironmentQuota: js.UndefOr[ResourceQuota]
  }

  @js.native
  @Factory
  trait ResourceTagsDescriptionMessage extends js.Object {
    var ResourceArn: js.UndefOr[ResourceArn]
    var ResourceTags: js.UndefOr[TagList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait RestartAppServerMessage extends js.Object {
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var EnvironmentName: js.UndefOr[EnvironmentName]
  }

  /**
    * Request to download logs retrieved with <a>RequestEnvironmentInfo</a>.
    */
  @js.native
  @Factory
  trait RetrieveEnvironmentInfoMessage extends js.Object {
    var InfoType: EnvironmentInfoType
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var EnvironmentName: js.UndefOr[EnvironmentName]
  }

  /**
    * Result message containing a description of the requested environment info.
    */
  @js.native
  @Factory
  trait RetrieveEnvironmentInfoResultMessage extends js.Object {
    var EnvironmentInfo: js.UndefOr[EnvironmentInfoDescriptionList]
  }

  /**
    * The bucket and key of an item stored in Amazon S3.
    */
  @js.native
  @Factory
  trait S3Location extends js.Object {
    var S3Bucket: js.UndefOr[S3Bucket]
    var S3Key: js.UndefOr[S3Key]
  }

  /**
    * Detailed health information about an Amazon EC2 instance in your Elastic Beanstalk environment.
    */
  @js.native
  @Factory
  trait SingleInstanceHealth extends js.Object {
    var ApplicationMetrics: js.UndefOr[ApplicationMetrics]
    var AvailabilityZone: js.UndefOr[String]
    var Causes: js.UndefOr[Causes]
    var Color: js.UndefOr[String]
    var Deployment: js.UndefOr[Deployment]
    var HealthStatus: js.UndefOr[String]
    var InstanceId: js.UndefOr[InstanceId]
    var InstanceType: js.UndefOr[String]
    var LaunchedAt: js.UndefOr[LaunchedAt]
    var System: js.UndefOr[SystemStatus]
  }

  /**
    * Describes the solution stack.
    */
  @js.native
  @Factory
  trait SolutionStackDescription extends js.Object {
    var PermittedFileTypes: js.UndefOr[SolutionStackFileTypeList]
    var SolutionStackName: js.UndefOr[SolutionStackName]
  }

  /**
    * Location of the source code for an application version.
    */
  @js.native
  @Factory
  trait SourceBuildInformation extends js.Object {
    var SourceLocation: SourceLocation
    var SourceRepository: SourceRepository
    var SourceType: SourceType
  }

  /**
    * A specification for an environment configuration
    */
  @js.native
  @Factory
  trait SourceConfiguration extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var TemplateName: js.UndefOr[ConfigurationTemplateName]
  }

  @js.native
  sealed trait SourceRepository extends js.Any
  object SourceRepository extends js.Object {
    val CodeCommit = "CodeCommit".asInstanceOf[SourceRepository]
    val S3         = "S3".asInstanceOf[SourceRepository]

    val values = js.Object.freeze(js.Array(CodeCommit, S3))
  }

  @js.native
  sealed trait SourceType extends js.Any
  object SourceType extends js.Object {
    val Git = "Git".asInstanceOf[SourceType]
    val Zip = "Zip".asInstanceOf[SourceType]

    val values = js.Object.freeze(js.Array(Git, Zip))
  }

  /**
    * Represents the percentage of requests over the last 10 seconds that resulted in each type of status code response. For more information, see [[http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html|Status Code Definitions]].
    */
  @js.native
  @Factory
  trait StatusCodes extends js.Object {
    var Status2xx: js.UndefOr[NullableInteger]
    var Status3xx: js.UndefOr[NullableInteger]
    var Status4xx: js.UndefOr[NullableInteger]
    var Status5xx: js.UndefOr[NullableInteger]
  }

  /**
    * Swaps the CNAMEs of two environments.
    */
  @js.native
  @Factory
  trait SwapEnvironmentCNAMEsMessage extends js.Object {
    var DestinationEnvironmentId: js.UndefOr[EnvironmentId]
    var DestinationEnvironmentName: js.UndefOr[EnvironmentName]
    var SourceEnvironmentId: js.UndefOr[EnvironmentId]
    var SourceEnvironmentName: js.UndefOr[EnvironmentName]
  }

  /**
    * CPU utilization and load average metrics for an Amazon EC2 instance.
    */
  @js.native
  @Factory
  trait SystemStatus extends js.Object {
    var CPUUtilization: js.UndefOr[CPUUtilization]
    var LoadAverage: js.UndefOr[LoadAverage]
  }

  /**
    * Describes a tag applied to a resource in an environment.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  /**
    * Request to terminate an environment.
    */
  @js.native
  @Factory
  trait TerminateEnvironmentMessage extends js.Object {
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var EnvironmentName: js.UndefOr[EnvironmentName]
    var ForceTerminate: js.UndefOr[ForceTerminate]
    var TerminateResources: js.UndefOr[TerminateEnvironmentResources]
  }

  /**
    * Describes a trigger.
    */
  @js.native
  @Factory
  trait Trigger extends js.Object {
    var Name: js.UndefOr[ResourceId]
  }

  /**
    * Request to update an application.
    */
  @js.native
  @Factory
  trait UpdateApplicationMessage extends js.Object {
    var ApplicationName: ApplicationName
    var Description: js.UndefOr[Description]
  }

  @js.native
  @Factory
  trait UpdateApplicationResourceLifecycleMessage extends js.Object {
    var ApplicationName: ApplicationName
    var ResourceLifecycleConfig: ApplicationResourceLifecycleConfig
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait UpdateApplicationVersionMessage extends js.Object {
    var ApplicationName: ApplicationName
    var VersionLabel: VersionLabel
    var Description: js.UndefOr[Description]
  }

  /**
    * The result message containing the options for the specified solution stack.
    */
  @js.native
  @Factory
  trait UpdateConfigurationTemplateMessage extends js.Object {
    var ApplicationName: ApplicationName
    var TemplateName: ConfigurationTemplateName
    var Description: js.UndefOr[Description]
    var OptionSettings: js.UndefOr[ConfigurationOptionSettingsList]
    var OptionsToRemove: js.UndefOr[OptionsSpecifierList]
  }

  /**
    * Request to update an environment.
    */
  @js.native
  @Factory
  trait UpdateEnvironmentMessage extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var Description: js.UndefOr[Description]
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var EnvironmentName: js.UndefOr[EnvironmentName]
    var GroupName: js.UndefOr[GroupName]
    var OptionSettings: js.UndefOr[ConfigurationOptionSettingsList]
    var OptionsToRemove: js.UndefOr[OptionsSpecifierList]
    var PlatformArn: js.UndefOr[PlatformArn]
    var SolutionStackName: js.UndefOr[SolutionStackName]
    var TemplateName: js.UndefOr[ConfigurationTemplateName]
    var Tier: js.UndefOr[EnvironmentTier]
    var VersionLabel: js.UndefOr[VersionLabel]
  }

  @js.native
  @Factory
  trait UpdateTagsForResourceMessage extends js.Object {
    var ResourceArn: ResourceArn
    var TagsToAdd: js.UndefOr[TagList]
    var TagsToRemove: js.UndefOr[TagKeyList]
  }

  /**
    * A list of validation messages for a specified configuration template.
    */
  @js.native
  @Factory
  trait ValidateConfigurationSettingsMessage extends js.Object {
    var ApplicationName: ApplicationName
    var OptionSettings: ConfigurationOptionSettingsList
    var EnvironmentName: js.UndefOr[EnvironmentName]
    var TemplateName: js.UndefOr[ConfigurationTemplateName]
  }

  /**
    * An error or warning for a desired configuration option value.
    */
  @js.native
  @Factory
  trait ValidationMessage extends js.Object {
    var Message: js.UndefOr[ValidationMessageString]
    var Namespace: js.UndefOr[OptionNamespace]
    var OptionName: js.UndefOr[ConfigurationOptionName]
    var Severity: js.UndefOr[ValidationSeverity]
  }

  @js.native
  sealed trait ValidationSeverity extends js.Any
  object ValidationSeverity extends js.Object {
    val error   = "error".asInstanceOf[ValidationSeverity]
    val warning = "warning".asInstanceOf[ValidationSeverity]

    val values = js.Object.freeze(js.Array(error, warning))
  }
}
