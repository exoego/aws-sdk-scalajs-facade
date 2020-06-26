package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

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
  trait AbortEnvironmentUpdateMessage extends js.Object {
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var EnvironmentName: js.UndefOr[EnvironmentName]
  }

  object AbortEnvironmentUpdateMessage {
    @inline
    def apply(
        EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
        EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
    ): AbortEnvironmentUpdateMessage = {
      val __obj = js.Dynamic.literal()
      EnvironmentId.foreach(__v => __obj.updateDynamic("EnvironmentId")(__v.asInstanceOf[js.Any]))
      EnvironmentName.foreach(__v => __obj.updateDynamic("EnvironmentName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AbortEnvironmentUpdateMessage]
    }
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

  object ApplicationDescription {
    @inline
    def apply(
        ApplicationArn: js.UndefOr[ApplicationArn] = js.undefined,
        ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
        ConfigurationTemplates: js.UndefOr[ConfigurationTemplateNamesList] = js.undefined,
        DateCreated: js.UndefOr[CreationDate] = js.undefined,
        DateUpdated: js.UndefOr[UpdateDate] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        ResourceLifecycleConfig: js.UndefOr[ApplicationResourceLifecycleConfig] = js.undefined,
        Versions: js.UndefOr[VersionLabelsList] = js.undefined
    ): ApplicationDescription = {
      val __obj = js.Dynamic.literal()
      ApplicationArn.foreach(__v => __obj.updateDynamic("ApplicationArn")(__v.asInstanceOf[js.Any]))
      ApplicationName.foreach(__v => __obj.updateDynamic("ApplicationName")(__v.asInstanceOf[js.Any]))
      ConfigurationTemplates.foreach(__v => __obj.updateDynamic("ConfigurationTemplates")(__v.asInstanceOf[js.Any]))
      DateCreated.foreach(__v => __obj.updateDynamic("DateCreated")(__v.asInstanceOf[js.Any]))
      DateUpdated.foreach(__v => __obj.updateDynamic("DateUpdated")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ResourceLifecycleConfig.foreach(__v => __obj.updateDynamic("ResourceLifecycleConfig")(__v.asInstanceOf[js.Any]))
      Versions.foreach(__v => __obj.updateDynamic("Versions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationDescription]
    }
  }

  /**
    * Result message containing a single description of an application.
    */
  @js.native
  trait ApplicationDescriptionMessage extends js.Object {
    var Application: js.UndefOr[ApplicationDescription]
  }

  object ApplicationDescriptionMessage {
    @inline
    def apply(
        Application: js.UndefOr[ApplicationDescription] = js.undefined
    ): ApplicationDescriptionMessage = {
      val __obj = js.Dynamic.literal()
      Application.foreach(__v => __obj.updateDynamic("Application")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationDescriptionMessage]
    }
  }

  /**
    * Result message containing a list of application descriptions.
    */
  @js.native
  trait ApplicationDescriptionsMessage extends js.Object {
    var Applications: js.UndefOr[ApplicationDescriptionList]
  }

  object ApplicationDescriptionsMessage {
    @inline
    def apply(
        Applications: js.UndefOr[ApplicationDescriptionList] = js.undefined
    ): ApplicationDescriptionsMessage = {
      val __obj = js.Dynamic.literal()
      Applications.foreach(__v => __obj.updateDynamic("Applications")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationDescriptionsMessage]
    }
  }

  /**
    * Application request metrics for an AWS Elastic Beanstalk environment.
    */
  @js.native
  trait ApplicationMetrics extends js.Object {
    var Duration: js.UndefOr[NullableInteger]
    var Latency: js.UndefOr[Latency]
    var RequestCount: js.UndefOr[RequestCount]
    var StatusCodes: js.UndefOr[StatusCodes]
  }

  object ApplicationMetrics {
    @inline
    def apply(
        Duration: js.UndefOr[NullableInteger] = js.undefined,
        Latency: js.UndefOr[Latency] = js.undefined,
        RequestCount: js.UndefOr[RequestCount] = js.undefined,
        StatusCodes: js.UndefOr[StatusCodes] = js.undefined
    ): ApplicationMetrics = {
      val __obj = js.Dynamic.literal()
      Duration.foreach(__v => __obj.updateDynamic("Duration")(__v.asInstanceOf[js.Any]))
      Latency.foreach(__v => __obj.updateDynamic("Latency")(__v.asInstanceOf[js.Any]))
      RequestCount.foreach(__v => __obj.updateDynamic("RequestCount")(__v.asInstanceOf[js.Any]))
      StatusCodes.foreach(__v => __obj.updateDynamic("StatusCodes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationMetrics]
    }
  }

  /**
    * The resource lifecycle configuration for an application. Defines lifecycle settings for resources that belong to the application, and the service role that Elastic Beanstalk assumes in order to apply lifecycle settings. The version lifecycle configuration defines lifecycle settings for application versions.
    */
  @js.native
  trait ApplicationResourceLifecycleConfig extends js.Object {
    var ServiceRole: js.UndefOr[String]
    var VersionLifecycleConfig: js.UndefOr[ApplicationVersionLifecycleConfig]
  }

  object ApplicationResourceLifecycleConfig {
    @inline
    def apply(
        ServiceRole: js.UndefOr[String] = js.undefined,
        VersionLifecycleConfig: js.UndefOr[ApplicationVersionLifecycleConfig] = js.undefined
    ): ApplicationResourceLifecycleConfig = {
      val __obj = js.Dynamic.literal()
      ServiceRole.foreach(__v => __obj.updateDynamic("ServiceRole")(__v.asInstanceOf[js.Any]))
      VersionLifecycleConfig.foreach(__v => __obj.updateDynamic("VersionLifecycleConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationResourceLifecycleConfig]
    }
  }

  @js.native
  trait ApplicationResourceLifecycleDescriptionMessage extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var ResourceLifecycleConfig: js.UndefOr[ApplicationResourceLifecycleConfig]
  }

  object ApplicationResourceLifecycleDescriptionMessage {
    @inline
    def apply(
        ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
        ResourceLifecycleConfig: js.UndefOr[ApplicationResourceLifecycleConfig] = js.undefined
    ): ApplicationResourceLifecycleDescriptionMessage = {
      val __obj = js.Dynamic.literal()
      ApplicationName.foreach(__v => __obj.updateDynamic("ApplicationName")(__v.asInstanceOf[js.Any]))
      ResourceLifecycleConfig.foreach(__v => __obj.updateDynamic("ResourceLifecycleConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationResourceLifecycleDescriptionMessage]
    }
  }

  /**
    * Describes the properties of an application version.
    */
  @js.native
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

  object ApplicationVersionDescription {
    @inline
    def apply(
        ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
        ApplicationVersionArn: js.UndefOr[ApplicationVersionArn] = js.undefined,
        BuildArn: js.UndefOr[String] = js.undefined,
        DateCreated: js.UndefOr[CreationDate] = js.undefined,
        DateUpdated: js.UndefOr[UpdateDate] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        SourceBuildInformation: js.UndefOr[SourceBuildInformation] = js.undefined,
        SourceBundle: js.UndefOr[S3Location] = js.undefined,
        Status: js.UndefOr[ApplicationVersionStatus] = js.undefined,
        VersionLabel: js.UndefOr[VersionLabel] = js.undefined
    ): ApplicationVersionDescription = {
      val __obj = js.Dynamic.literal()
      ApplicationName.foreach(__v => __obj.updateDynamic("ApplicationName")(__v.asInstanceOf[js.Any]))
      ApplicationVersionArn.foreach(__v => __obj.updateDynamic("ApplicationVersionArn")(__v.asInstanceOf[js.Any]))
      BuildArn.foreach(__v => __obj.updateDynamic("BuildArn")(__v.asInstanceOf[js.Any]))
      DateCreated.foreach(__v => __obj.updateDynamic("DateCreated")(__v.asInstanceOf[js.Any]))
      DateUpdated.foreach(__v => __obj.updateDynamic("DateUpdated")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      SourceBuildInformation.foreach(__v => __obj.updateDynamic("SourceBuildInformation")(__v.asInstanceOf[js.Any]))
      SourceBundle.foreach(__v => __obj.updateDynamic("SourceBundle")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      VersionLabel.foreach(__v => __obj.updateDynamic("VersionLabel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationVersionDescription]
    }
  }

  /**
    * Result message wrapping a single description of an application version.
    */
  @js.native
  trait ApplicationVersionDescriptionMessage extends js.Object {
    var ApplicationVersion: js.UndefOr[ApplicationVersionDescription]
  }

  object ApplicationVersionDescriptionMessage {
    @inline
    def apply(
        ApplicationVersion: js.UndefOr[ApplicationVersionDescription] = js.undefined
    ): ApplicationVersionDescriptionMessage = {
      val __obj = js.Dynamic.literal()
      ApplicationVersion.foreach(__v => __obj.updateDynamic("ApplicationVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationVersionDescriptionMessage]
    }
  }

  /**
    * Result message wrapping a list of application version descriptions.
    */
  @js.native
  trait ApplicationVersionDescriptionsMessage extends js.Object {
    var ApplicationVersions: js.UndefOr[ApplicationVersionDescriptionList]
    var NextToken: js.UndefOr[Token]
  }

  object ApplicationVersionDescriptionsMessage {
    @inline
    def apply(
        ApplicationVersions: js.UndefOr[ApplicationVersionDescriptionList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ApplicationVersionDescriptionsMessage = {
      val __obj = js.Dynamic.literal()
      ApplicationVersions.foreach(__v => __obj.updateDynamic("ApplicationVersions")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationVersionDescriptionsMessage]
    }
  }

  /**
    * The application version lifecycle settings for an application. Defines the rules that Elastic Beanstalk applies to an application's versions in order to avoid hitting the per-region limit for application versions.
    *  When Elastic Beanstalk deletes an application version from its database, you can no longer deploy that version to an environment. The source bundle remains in S3 unless you configure the rule to delete it.
    */
  @js.native
  trait ApplicationVersionLifecycleConfig extends js.Object {
    var MaxAgeRule: js.UndefOr[MaxAgeRule]
    var MaxCountRule: js.UndefOr[MaxCountRule]
  }

  object ApplicationVersionLifecycleConfig {
    @inline
    def apply(
        MaxAgeRule: js.UndefOr[MaxAgeRule] = js.undefined,
        MaxCountRule: js.UndefOr[MaxCountRule] = js.undefined
    ): ApplicationVersionLifecycleConfig = {
      val __obj = js.Dynamic.literal()
      MaxAgeRule.foreach(__v => __obj.updateDynamic("MaxAgeRule")(__v.asInstanceOf[js.Any]))
      MaxCountRule.foreach(__v => __obj.updateDynamic("MaxCountRule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationVersionLifecycleConfig]
    }
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
  trait ApplyEnvironmentManagedActionRequest extends js.Object {
    var ActionId: String
    var EnvironmentId: js.UndefOr[String]
    var EnvironmentName: js.UndefOr[String]
  }

  object ApplyEnvironmentManagedActionRequest {
    @inline
    def apply(
        ActionId: String,
        EnvironmentId: js.UndefOr[String] = js.undefined,
        EnvironmentName: js.UndefOr[String] = js.undefined
    ): ApplyEnvironmentManagedActionRequest = {
      val __obj = js.Dynamic.literal(
        "ActionId" -> ActionId.asInstanceOf[js.Any]
      )

      EnvironmentId.foreach(__v => __obj.updateDynamic("EnvironmentId")(__v.asInstanceOf[js.Any]))
      EnvironmentName.foreach(__v => __obj.updateDynamic("EnvironmentName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplyEnvironmentManagedActionRequest]
    }
  }

  /**
    * The result message containing information about the managed action.
    */
  @js.native
  trait ApplyEnvironmentManagedActionResult extends js.Object {
    var ActionDescription: js.UndefOr[String]
    var ActionId: js.UndefOr[String]
    var ActionType: js.UndefOr[ActionType]
    var Status: js.UndefOr[String]
  }

  object ApplyEnvironmentManagedActionResult {
    @inline
    def apply(
        ActionDescription: js.UndefOr[String] = js.undefined,
        ActionId: js.UndefOr[String] = js.undefined,
        ActionType: js.UndefOr[ActionType] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): ApplyEnvironmentManagedActionResult = {
      val __obj = js.Dynamic.literal()
      ActionDescription.foreach(__v => __obj.updateDynamic("ActionDescription")(__v.asInstanceOf[js.Any]))
      ActionId.foreach(__v => __obj.updateDynamic("ActionId")(__v.asInstanceOf[js.Any]))
      ActionType.foreach(__v => __obj.updateDynamic("ActionType")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplyEnvironmentManagedActionResult]
    }
  }

  /**
    * Describes an Auto Scaling launch configuration.
    */
  @js.native
  trait AutoScalingGroup extends js.Object {
    var Name: js.UndefOr[ResourceId]
  }

  object AutoScalingGroup {
    @inline
    def apply(
        Name: js.UndefOr[ResourceId] = js.undefined
    ): AutoScalingGroup = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AutoScalingGroup]
    }
  }

  /**
    * Settings for an AWS CodeBuild build.
    */
  @js.native
  trait BuildConfiguration extends js.Object {
    var CodeBuildServiceRole: NonEmptyString
    var Image: NonEmptyString
    var ArtifactName: js.UndefOr[String]
    var ComputeType: js.UndefOr[ComputeType]
    var TimeoutInMinutes: js.UndefOr[BoxedInt]
  }

  object BuildConfiguration {
    @inline
    def apply(
        CodeBuildServiceRole: NonEmptyString,
        Image: NonEmptyString,
        ArtifactName: js.UndefOr[String] = js.undefined,
        ComputeType: js.UndefOr[ComputeType] = js.undefined,
        TimeoutInMinutes: js.UndefOr[BoxedInt] = js.undefined
    ): BuildConfiguration = {
      val __obj = js.Dynamic.literal(
        "CodeBuildServiceRole" -> CodeBuildServiceRole.asInstanceOf[js.Any],
        "Image"                -> Image.asInstanceOf[js.Any]
      )

      ArtifactName.foreach(__v => __obj.updateDynamic("ArtifactName")(__v.asInstanceOf[js.Any]))
      ComputeType.foreach(__v => __obj.updateDynamic("ComputeType")(__v.asInstanceOf[js.Any]))
      TimeoutInMinutes.foreach(__v => __obj.updateDynamic("TimeoutInMinutes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BuildConfiguration]
    }
  }

  /**
    * The builder used to build the custom platform.
    */
  @js.native
  trait Builder extends js.Object {
    var ARN: js.UndefOr[ARN]
  }

  object Builder {
    @inline
    def apply(
        ARN: js.UndefOr[ARN] = js.undefined
    ): Builder = {
      val __obj = js.Dynamic.literal()
      ARN.foreach(__v => __obj.updateDynamic("ARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Builder]
    }
  }

  /**
    * CPU utilization metrics for an instance.
    */
  @js.native
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

  object CPUUtilization {
    @inline
    def apply(
        IOWait: js.UndefOr[NullableDouble] = js.undefined,
        IRQ: js.UndefOr[NullableDouble] = js.undefined,
        Idle: js.UndefOr[NullableDouble] = js.undefined,
        Nice: js.UndefOr[NullableDouble] = js.undefined,
        Privileged: js.UndefOr[NullableDouble] = js.undefined,
        SoftIRQ: js.UndefOr[NullableDouble] = js.undefined,
        System: js.UndefOr[NullableDouble] = js.undefined,
        User: js.UndefOr[NullableDouble] = js.undefined
    ): CPUUtilization = {
      val __obj = js.Dynamic.literal()
      IOWait.foreach(__v => __obj.updateDynamic("IOWait")(__v.asInstanceOf[js.Any]))
      IRQ.foreach(__v => __obj.updateDynamic("IRQ")(__v.asInstanceOf[js.Any]))
      Idle.foreach(__v => __obj.updateDynamic("Idle")(__v.asInstanceOf[js.Any]))
      Nice.foreach(__v => __obj.updateDynamic("Nice")(__v.asInstanceOf[js.Any]))
      Privileged.foreach(__v => __obj.updateDynamic("Privileged")(__v.asInstanceOf[js.Any]))
      SoftIRQ.foreach(__v => __obj.updateDynamic("SoftIRQ")(__v.asInstanceOf[js.Any]))
      System.foreach(__v => __obj.updateDynamic("System")(__v.asInstanceOf[js.Any]))
      User.foreach(__v => __obj.updateDynamic("User")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CPUUtilization]
    }
  }

  /**
    * Results message indicating whether a CNAME is available.
    */
  @js.native
  trait CheckDNSAvailabilityMessage extends js.Object {
    var CNAMEPrefix: DNSCnamePrefix
  }

  object CheckDNSAvailabilityMessage {
    @inline
    def apply(
        CNAMEPrefix: DNSCnamePrefix
    ): CheckDNSAvailabilityMessage = {
      val __obj = js.Dynamic.literal(
        "CNAMEPrefix" -> CNAMEPrefix.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CheckDNSAvailabilityMessage]
    }
  }

  /**
    * Indicates if the specified CNAME is available.
    */
  @js.native
  trait CheckDNSAvailabilityResultMessage extends js.Object {
    var Available: js.UndefOr[CnameAvailability]
    var FullyQualifiedCNAME: js.UndefOr[DNSCname]
  }

  object CheckDNSAvailabilityResultMessage {
    @inline
    def apply(
        Available: js.UndefOr[CnameAvailability] = js.undefined,
        FullyQualifiedCNAME: js.UndefOr[DNSCname] = js.undefined
    ): CheckDNSAvailabilityResultMessage = {
      val __obj = js.Dynamic.literal()
      Available.foreach(__v => __obj.updateDynamic("Available")(__v.asInstanceOf[js.Any]))
      FullyQualifiedCNAME.foreach(__v => __obj.updateDynamic("FullyQualifiedCNAME")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CheckDNSAvailabilityResultMessage]
    }
  }

  /**
    * Request to create or update a group of environments.
    */
  @js.native
  trait ComposeEnvironmentsMessage extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var GroupName: js.UndefOr[GroupName]
    var VersionLabels: js.UndefOr[VersionLabels]
  }

  object ComposeEnvironmentsMessage {
    @inline
    def apply(
        ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
        GroupName: js.UndefOr[GroupName] = js.undefined,
        VersionLabels: js.UndefOr[VersionLabels] = js.undefined
    ): ComposeEnvironmentsMessage = {
      val __obj = js.Dynamic.literal()
      ApplicationName.foreach(__v => __obj.updateDynamic("ApplicationName")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      VersionLabels.foreach(__v => __obj.updateDynamic("VersionLabels")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ComposeEnvironmentsMessage]
    }
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

  object ConfigurationOptionDescription {
    @inline
    def apply(
        ChangeSeverity: js.UndefOr[ConfigurationOptionSeverity] = js.undefined,
        DefaultValue: js.UndefOr[ConfigurationOptionDefaultValue] = js.undefined,
        MaxLength: js.UndefOr[OptionRestrictionMaxLength] = js.undefined,
        MaxValue: js.UndefOr[OptionRestrictionMaxValue] = js.undefined,
        MinValue: js.UndefOr[OptionRestrictionMinValue] = js.undefined,
        Name: js.UndefOr[ConfigurationOptionName] = js.undefined,
        Namespace: js.UndefOr[OptionNamespace] = js.undefined,
        Regex: js.UndefOr[OptionRestrictionRegex] = js.undefined,
        UserDefined: js.UndefOr[UserDefinedOption] = js.undefined,
        ValueOptions: js.UndefOr[ConfigurationOptionPossibleValues] = js.undefined,
        ValueType: js.UndefOr[ConfigurationOptionValueType] = js.undefined
    ): ConfigurationOptionDescription = {
      val __obj = js.Dynamic.literal()
      ChangeSeverity.foreach(__v => __obj.updateDynamic("ChangeSeverity")(__v.asInstanceOf[js.Any]))
      DefaultValue.foreach(__v => __obj.updateDynamic("DefaultValue")(__v.asInstanceOf[js.Any]))
      MaxLength.foreach(__v => __obj.updateDynamic("MaxLength")(__v.asInstanceOf[js.Any]))
      MaxValue.foreach(__v => __obj.updateDynamic("MaxValue")(__v.asInstanceOf[js.Any]))
      MinValue.foreach(__v => __obj.updateDynamic("MinValue")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      Regex.foreach(__v => __obj.updateDynamic("Regex")(__v.asInstanceOf[js.Any]))
      UserDefined.foreach(__v => __obj.updateDynamic("UserDefined")(__v.asInstanceOf[js.Any]))
      ValueOptions.foreach(__v => __obj.updateDynamic("ValueOptions")(__v.asInstanceOf[js.Any]))
      ValueType.foreach(__v => __obj.updateDynamic("ValueType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigurationOptionDescription]
    }
  }

  /**
    * A specification identifying an individual configuration option along with its current value. For a list of possible option values, go to [[https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options.html|Option Values]] in the <i>AWS Elastic Beanstalk Developer Guide</i>.
    */
  @js.native
  trait ConfigurationOptionSetting extends js.Object {
    var Namespace: js.UndefOr[OptionNamespace]
    var OptionName: js.UndefOr[ConfigurationOptionName]
    var ResourceName: js.UndefOr[ResourceName]
    var Value: js.UndefOr[ConfigurationOptionValue]
  }

  object ConfigurationOptionSetting {
    @inline
    def apply(
        Namespace: js.UndefOr[OptionNamespace] = js.undefined,
        OptionName: js.UndefOr[ConfigurationOptionName] = js.undefined,
        ResourceName: js.UndefOr[ResourceName] = js.undefined,
        Value: js.UndefOr[ConfigurationOptionValue] = js.undefined
    ): ConfigurationOptionSetting = {
      val __obj = js.Dynamic.literal()
      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      OptionName.foreach(__v => __obj.updateDynamic("OptionName")(__v.asInstanceOf[js.Any]))
      ResourceName.foreach(__v => __obj.updateDynamic("ResourceName")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigurationOptionSetting]
    }
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
  trait ConfigurationOptionsDescription extends js.Object {
    var Options: js.UndefOr[ConfigurationOptionDescriptionsList]
    var PlatformArn: js.UndefOr[PlatformArn]
    var SolutionStackName: js.UndefOr[SolutionStackName]
  }

  object ConfigurationOptionsDescription {
    @inline
    def apply(
        Options: js.UndefOr[ConfigurationOptionDescriptionsList] = js.undefined,
        PlatformArn: js.UndefOr[PlatformArn] = js.undefined,
        SolutionStackName: js.UndefOr[SolutionStackName] = js.undefined
    ): ConfigurationOptionsDescription = {
      val __obj = js.Dynamic.literal()
      Options.foreach(__v => __obj.updateDynamic("Options")(__v.asInstanceOf[js.Any]))
      PlatformArn.foreach(__v => __obj.updateDynamic("PlatformArn")(__v.asInstanceOf[js.Any]))
      SolutionStackName.foreach(__v => __obj.updateDynamic("SolutionStackName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigurationOptionsDescription]
    }
  }

  /**
    * Describes the settings for a configuration set.
    */
  @js.native
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

  object ConfigurationSettingsDescription {
    @inline
    def apply(
        ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
        DateCreated: js.UndefOr[CreationDate] = js.undefined,
        DateUpdated: js.UndefOr[UpdateDate] = js.undefined,
        DeploymentStatus: js.UndefOr[ConfigurationDeploymentStatus] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
        OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.undefined,
        PlatformArn: js.UndefOr[PlatformArn] = js.undefined,
        SolutionStackName: js.UndefOr[SolutionStackName] = js.undefined,
        TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined
    ): ConfigurationSettingsDescription = {
      val __obj = js.Dynamic.literal()
      ApplicationName.foreach(__v => __obj.updateDynamic("ApplicationName")(__v.asInstanceOf[js.Any]))
      DateCreated.foreach(__v => __obj.updateDynamic("DateCreated")(__v.asInstanceOf[js.Any]))
      DateUpdated.foreach(__v => __obj.updateDynamic("DateUpdated")(__v.asInstanceOf[js.Any]))
      DeploymentStatus.foreach(__v => __obj.updateDynamic("DeploymentStatus")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EnvironmentName.foreach(__v => __obj.updateDynamic("EnvironmentName")(__v.asInstanceOf[js.Any]))
      OptionSettings.foreach(__v => __obj.updateDynamic("OptionSettings")(__v.asInstanceOf[js.Any]))
      PlatformArn.foreach(__v => __obj.updateDynamic("PlatformArn")(__v.asInstanceOf[js.Any]))
      SolutionStackName.foreach(__v => __obj.updateDynamic("SolutionStackName")(__v.asInstanceOf[js.Any]))
      TemplateName.foreach(__v => __obj.updateDynamic("TemplateName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigurationSettingsDescription]
    }
  }

  /**
    * The results from a request to change the configuration settings of an environment.
    */
  @js.native
  trait ConfigurationSettingsDescriptions extends js.Object {
    var ConfigurationSettings: js.UndefOr[ConfigurationSettingsDescriptionList]
  }

  object ConfigurationSettingsDescriptions {
    @inline
    def apply(
        ConfigurationSettings: js.UndefOr[ConfigurationSettingsDescriptionList] = js.undefined
    ): ConfigurationSettingsDescriptions = {
      val __obj = js.Dynamic.literal()
      ConfigurationSettings.foreach(__v => __obj.updateDynamic("ConfigurationSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigurationSettingsDescriptions]
    }
  }

  /**
    * Provides a list of validation messages.
    */
  @js.native
  trait ConfigurationSettingsValidationMessages extends js.Object {
    var Messages: js.UndefOr[ValidationMessagesList]
  }

  object ConfigurationSettingsValidationMessages {
    @inline
    def apply(
        Messages: js.UndefOr[ValidationMessagesList] = js.undefined
    ): ConfigurationSettingsValidationMessages = {
      val __obj = js.Dynamic.literal()
      Messages.foreach(__v => __obj.updateDynamic("Messages")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigurationSettingsValidationMessages]
    }
  }

  /**
    * Request to create an application.
    */
  @js.native
  trait CreateApplicationMessage extends js.Object {
    var ApplicationName: ApplicationName
    var Description: js.UndefOr[Description]
    var ResourceLifecycleConfig: js.UndefOr[ApplicationResourceLifecycleConfig]
    var Tags: js.UndefOr[Tags]
  }

  object CreateApplicationMessage {
    @inline
    def apply(
        ApplicationName: ApplicationName,
        Description: js.UndefOr[Description] = js.undefined,
        ResourceLifecycleConfig: js.UndefOr[ApplicationResourceLifecycleConfig] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateApplicationMessage = {
      val __obj = js.Dynamic.literal(
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ResourceLifecycleConfig.foreach(__v => __obj.updateDynamic("ResourceLifecycleConfig")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApplicationMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
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

  object CreateApplicationVersionMessage {
    @inline
    def apply(
        ApplicationName: ApplicationName,
        VersionLabel: VersionLabel,
        AutoCreateApplication: js.UndefOr[AutoCreateApplication] = js.undefined,
        BuildConfiguration: js.UndefOr[BuildConfiguration] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Process: js.UndefOr[ApplicationVersionProccess] = js.undefined,
        SourceBuildInformation: js.UndefOr[SourceBuildInformation] = js.undefined,
        SourceBundle: js.UndefOr[S3Location] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateApplicationVersionMessage = {
      val __obj = js.Dynamic.literal(
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "VersionLabel"    -> VersionLabel.asInstanceOf[js.Any]
      )

      AutoCreateApplication.foreach(__v => __obj.updateDynamic("AutoCreateApplication")(__v.asInstanceOf[js.Any]))
      BuildConfiguration.foreach(__v => __obj.updateDynamic("BuildConfiguration")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Process.foreach(__v => __obj.updateDynamic("Process")(__v.asInstanceOf[js.Any]))
      SourceBuildInformation.foreach(__v => __obj.updateDynamic("SourceBuildInformation")(__v.asInstanceOf[js.Any]))
      SourceBundle.foreach(__v => __obj.updateDynamic("SourceBundle")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApplicationVersionMessage]
    }
  }

  /**
    * Request to create a configuration template.
    */
  @js.native
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

  object CreateConfigurationTemplateMessage {
    @inline
    def apply(
        ApplicationName: ApplicationName,
        TemplateName: ConfigurationTemplateName,
        Description: js.UndefOr[Description] = js.undefined,
        EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
        OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.undefined,
        PlatformArn: js.UndefOr[PlatformArn] = js.undefined,
        SolutionStackName: js.UndefOr[SolutionStackName] = js.undefined,
        SourceConfiguration: js.UndefOr[SourceConfiguration] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateConfigurationTemplateMessage = {
      val __obj = js.Dynamic.literal(
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "TemplateName"    -> TemplateName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EnvironmentId.foreach(__v => __obj.updateDynamic("EnvironmentId")(__v.asInstanceOf[js.Any]))
      OptionSettings.foreach(__v => __obj.updateDynamic("OptionSettings")(__v.asInstanceOf[js.Any]))
      PlatformArn.foreach(__v => __obj.updateDynamic("PlatformArn")(__v.asInstanceOf[js.Any]))
      SolutionStackName.foreach(__v => __obj.updateDynamic("SolutionStackName")(__v.asInstanceOf[js.Any]))
      SourceConfiguration.foreach(__v => __obj.updateDynamic("SourceConfiguration")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConfigurationTemplateMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
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

  object CreateEnvironmentMessage {
    @inline
    def apply(
        ApplicationName: ApplicationName,
        CNAMEPrefix: js.UndefOr[DNSCnamePrefix] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
        GroupName: js.UndefOr[GroupName] = js.undefined,
        OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.undefined,
        OptionsToRemove: js.UndefOr[OptionsSpecifierList] = js.undefined,
        PlatformArn: js.UndefOr[PlatformArn] = js.undefined,
        SolutionStackName: js.UndefOr[SolutionStackName] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined,
        Tier: js.UndefOr[EnvironmentTier] = js.undefined,
        VersionLabel: js.UndefOr[VersionLabel] = js.undefined
    ): CreateEnvironmentMessage = {
      val __obj = js.Dynamic.literal(
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any]
      )

      CNAMEPrefix.foreach(__v => __obj.updateDynamic("CNAMEPrefix")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EnvironmentName.foreach(__v => __obj.updateDynamic("EnvironmentName")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      OptionSettings.foreach(__v => __obj.updateDynamic("OptionSettings")(__v.asInstanceOf[js.Any]))
      OptionsToRemove.foreach(__v => __obj.updateDynamic("OptionsToRemove")(__v.asInstanceOf[js.Any]))
      PlatformArn.foreach(__v => __obj.updateDynamic("PlatformArn")(__v.asInstanceOf[js.Any]))
      SolutionStackName.foreach(__v => __obj.updateDynamic("SolutionStackName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TemplateName.foreach(__v => __obj.updateDynamic("TemplateName")(__v.asInstanceOf[js.Any]))
      Tier.foreach(__v => __obj.updateDynamic("Tier")(__v.asInstanceOf[js.Any]))
      VersionLabel.foreach(__v => __obj.updateDynamic("VersionLabel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEnvironmentMessage]
    }
  }

  /**
    * Request to create a new platform version.
    */
  @js.native
  trait CreatePlatformVersionRequest extends js.Object {
    var PlatformDefinitionBundle: S3Location
    var PlatformName: PlatformName
    var PlatformVersion: PlatformVersion
    var EnvironmentName: js.UndefOr[EnvironmentName]
    var OptionSettings: js.UndefOr[ConfigurationOptionSettingsList]
    var Tags: js.UndefOr[Tags]
  }

  object CreatePlatformVersionRequest {
    @inline
    def apply(
        PlatformDefinitionBundle: S3Location,
        PlatformName: PlatformName,
        PlatformVersion: PlatformVersion,
        EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
        OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreatePlatformVersionRequest = {
      val __obj = js.Dynamic.literal(
        "PlatformDefinitionBundle" -> PlatformDefinitionBundle.asInstanceOf[js.Any],
        "PlatformName"             -> PlatformName.asInstanceOf[js.Any],
        "PlatformVersion"          -> PlatformVersion.asInstanceOf[js.Any]
      )

      EnvironmentName.foreach(__v => __obj.updateDynamic("EnvironmentName")(__v.asInstanceOf[js.Any]))
      OptionSettings.foreach(__v => __obj.updateDynamic("OptionSettings")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePlatformVersionRequest]
    }
  }

  @js.native
  trait CreatePlatformVersionResult extends js.Object {
    var Builder: js.UndefOr[Builder]
    var PlatformSummary: js.UndefOr[PlatformSummary]
  }

  object CreatePlatformVersionResult {
    @inline
    def apply(
        Builder: js.UndefOr[Builder] = js.undefined,
        PlatformSummary: js.UndefOr[PlatformSummary] = js.undefined
    ): CreatePlatformVersionResult = {
      val __obj = js.Dynamic.literal()
      Builder.foreach(__v => __obj.updateDynamic("Builder")(__v.asInstanceOf[js.Any]))
      PlatformSummary.foreach(__v => __obj.updateDynamic("PlatformSummary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePlatformVersionResult]
    }
  }

  /**
    * Results of a <a>CreateStorageLocationResult</a> call.
    */
  @js.native
  trait CreateStorageLocationResultMessage extends js.Object {
    var S3Bucket: js.UndefOr[S3Bucket]
  }

  object CreateStorageLocationResultMessage {
    @inline
    def apply(
        S3Bucket: js.UndefOr[S3Bucket] = js.undefined
    ): CreateStorageLocationResultMessage = {
      val __obj = js.Dynamic.literal()
      S3Bucket.foreach(__v => __obj.updateDynamic("S3Bucket")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStorageLocationResultMessage]
    }
  }

  /**
    * A custom AMI available to platforms.
    */
  @js.native
  trait CustomAmi extends js.Object {
    var ImageId: js.UndefOr[ImageId]
    var VirtualizationType: js.UndefOr[VirtualizationType]
  }

  object CustomAmi {
    @inline
    def apply(
        ImageId: js.UndefOr[ImageId] = js.undefined,
        VirtualizationType: js.UndefOr[VirtualizationType] = js.undefined
    ): CustomAmi = {
      val __obj = js.Dynamic.literal()
      ImageId.foreach(__v => __obj.updateDynamic("ImageId")(__v.asInstanceOf[js.Any]))
      VirtualizationType.foreach(__v => __obj.updateDynamic("VirtualizationType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CustomAmi]
    }
  }

  /**
    * Request to delete an application.
    */
  @js.native
  trait DeleteApplicationMessage extends js.Object {
    var ApplicationName: ApplicationName
    var TerminateEnvByForce: js.UndefOr[TerminateEnvForce]
  }

  object DeleteApplicationMessage {
    @inline
    def apply(
        ApplicationName: ApplicationName,
        TerminateEnvByForce: js.UndefOr[TerminateEnvForce] = js.undefined
    ): DeleteApplicationMessage = {
      val __obj = js.Dynamic.literal(
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any]
      )

      TerminateEnvByForce.foreach(__v => __obj.updateDynamic("TerminateEnvByForce")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteApplicationMessage]
    }
  }

  /**
    * Request to delete an application version.
    */
  @js.native
  trait DeleteApplicationVersionMessage extends js.Object {
    var ApplicationName: ApplicationName
    var VersionLabel: VersionLabel
    var DeleteSourceBundle: js.UndefOr[DeleteSourceBundle]
  }

  object DeleteApplicationVersionMessage {
    @inline
    def apply(
        ApplicationName: ApplicationName,
        VersionLabel: VersionLabel,
        DeleteSourceBundle: js.UndefOr[DeleteSourceBundle] = js.undefined
    ): DeleteApplicationVersionMessage = {
      val __obj = js.Dynamic.literal(
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "VersionLabel"    -> VersionLabel.asInstanceOf[js.Any]
      )

      DeleteSourceBundle.foreach(__v => __obj.updateDynamic("DeleteSourceBundle")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteApplicationVersionMessage]
    }
  }

  /**
    * Request to delete a configuration template.
    */
  @js.native
  trait DeleteConfigurationTemplateMessage extends js.Object {
    var ApplicationName: ApplicationName
    var TemplateName: ConfigurationTemplateName
  }

  object DeleteConfigurationTemplateMessage {
    @inline
    def apply(
        ApplicationName: ApplicationName,
        TemplateName: ConfigurationTemplateName
    ): DeleteConfigurationTemplateMessage = {
      val __obj = js.Dynamic.literal(
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "TemplateName"    -> TemplateName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteConfigurationTemplateMessage]
    }
  }

  /**
    * Request to delete a draft environment configuration.
    */
  @js.native
  trait DeleteEnvironmentConfigurationMessage extends js.Object {
    var ApplicationName: ApplicationName
    var EnvironmentName: EnvironmentName
  }

  object DeleteEnvironmentConfigurationMessage {
    @inline
    def apply(
        ApplicationName: ApplicationName,
        EnvironmentName: EnvironmentName
    ): DeleteEnvironmentConfigurationMessage = {
      val __obj = js.Dynamic.literal(
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "EnvironmentName" -> EnvironmentName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteEnvironmentConfigurationMessage]
    }
  }

  @js.native
  trait DeletePlatformVersionRequest extends js.Object {
    var PlatformArn: js.UndefOr[PlatformArn]
  }

  object DeletePlatformVersionRequest {
    @inline
    def apply(
        PlatformArn: js.UndefOr[PlatformArn] = js.undefined
    ): DeletePlatformVersionRequest = {
      val __obj = js.Dynamic.literal()
      PlatformArn.foreach(__v => __obj.updateDynamic("PlatformArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePlatformVersionRequest]
    }
  }

  @js.native
  trait DeletePlatformVersionResult extends js.Object {
    var PlatformSummary: js.UndefOr[PlatformSummary]
  }

  object DeletePlatformVersionResult {
    @inline
    def apply(
        PlatformSummary: js.UndefOr[PlatformSummary] = js.undefined
    ): DeletePlatformVersionResult = {
      val __obj = js.Dynamic.literal()
      PlatformSummary.foreach(__v => __obj.updateDynamic("PlatformSummary")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeletePlatformVersionResult]
    }
  }

  /**
    * Information about an application version deployment.
    */
  @js.native
  trait Deployment extends js.Object {
    var DeploymentId: js.UndefOr[NullableLong]
    var DeploymentTime: js.UndefOr[DeploymentTimestamp]
    var Status: js.UndefOr[String]
    var VersionLabel: js.UndefOr[String]
  }

  object Deployment {
    @inline
    def apply(
        DeploymentId: js.UndefOr[NullableLong] = js.undefined,
        DeploymentTime: js.UndefOr[DeploymentTimestamp] = js.undefined,
        Status: js.UndefOr[String] = js.undefined,
        VersionLabel: js.UndefOr[String] = js.undefined
    ): Deployment = {
      val __obj = js.Dynamic.literal()
      DeploymentId.foreach(__v => __obj.updateDynamic("DeploymentId")(__v.asInstanceOf[js.Any]))
      DeploymentTime.foreach(__v => __obj.updateDynamic("DeploymentTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      VersionLabel.foreach(__v => __obj.updateDynamic("VersionLabel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Deployment]
    }
  }

  @js.native
  trait DescribeAccountAttributesResult extends js.Object {
    var ResourceQuotas: js.UndefOr[ResourceQuotas]
  }

  object DescribeAccountAttributesResult {
    @inline
    def apply(
        ResourceQuotas: js.UndefOr[ResourceQuotas] = js.undefined
    ): DescribeAccountAttributesResult = {
      val __obj = js.Dynamic.literal()
      ResourceQuotas.foreach(__v => __obj.updateDynamic("ResourceQuotas")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAccountAttributesResult]
    }
  }

  /**
    * Request to describe application versions.
    */
  @js.native
  trait DescribeApplicationVersionsMessage extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var MaxRecords: js.UndefOr[MaxRecords]
    var NextToken: js.UndefOr[Token]
    var VersionLabels: js.UndefOr[VersionLabelsList]
  }

  object DescribeApplicationVersionsMessage {
    @inline
    def apply(
        ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
        MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        VersionLabels: js.UndefOr[VersionLabelsList] = js.undefined
    ): DescribeApplicationVersionsMessage = {
      val __obj = js.Dynamic.literal()
      ApplicationName.foreach(__v => __obj.updateDynamic("ApplicationName")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      VersionLabels.foreach(__v => __obj.updateDynamic("VersionLabels")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeApplicationVersionsMessage]
    }
  }

  /**
    * Request to describe one or more applications.
    */
  @js.native
  trait DescribeApplicationsMessage extends js.Object {
    var ApplicationNames: js.UndefOr[ApplicationNamesList]
  }

  object DescribeApplicationsMessage {
    @inline
    def apply(
        ApplicationNames: js.UndefOr[ApplicationNamesList] = js.undefined
    ): DescribeApplicationsMessage = {
      val __obj = js.Dynamic.literal()
      ApplicationNames.foreach(__v => __obj.updateDynamic("ApplicationNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeApplicationsMessage]
    }
  }

  /**
    * Result message containing a list of application version descriptions.
    */
  @js.native
  trait DescribeConfigurationOptionsMessage extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var EnvironmentName: js.UndefOr[EnvironmentName]
    var Options: js.UndefOr[OptionsSpecifierList]
    var PlatformArn: js.UndefOr[PlatformArn]
    var SolutionStackName: js.UndefOr[SolutionStackName]
    var TemplateName: js.UndefOr[ConfigurationTemplateName]
  }

  object DescribeConfigurationOptionsMessage {
    @inline
    def apply(
        ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
        EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
        Options: js.UndefOr[OptionsSpecifierList] = js.undefined,
        PlatformArn: js.UndefOr[PlatformArn] = js.undefined,
        SolutionStackName: js.UndefOr[SolutionStackName] = js.undefined,
        TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined
    ): DescribeConfigurationOptionsMessage = {
      val __obj = js.Dynamic.literal()
      ApplicationName.foreach(__v => __obj.updateDynamic("ApplicationName")(__v.asInstanceOf[js.Any]))
      EnvironmentName.foreach(__v => __obj.updateDynamic("EnvironmentName")(__v.asInstanceOf[js.Any]))
      Options.foreach(__v => __obj.updateDynamic("Options")(__v.asInstanceOf[js.Any]))
      PlatformArn.foreach(__v => __obj.updateDynamic("PlatformArn")(__v.asInstanceOf[js.Any]))
      SolutionStackName.foreach(__v => __obj.updateDynamic("SolutionStackName")(__v.asInstanceOf[js.Any]))
      TemplateName.foreach(__v => __obj.updateDynamic("TemplateName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConfigurationOptionsMessage]
    }
  }

  /**
    * Result message containing all of the configuration settings for a specified solution stack or configuration template.
    */
  @js.native
  trait DescribeConfigurationSettingsMessage extends js.Object {
    var ApplicationName: ApplicationName
    var EnvironmentName: js.UndefOr[EnvironmentName]
    var TemplateName: js.UndefOr[ConfigurationTemplateName]
  }

  object DescribeConfigurationSettingsMessage {
    @inline
    def apply(
        ApplicationName: ApplicationName,
        EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
        TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined
    ): DescribeConfigurationSettingsMessage = {
      val __obj = js.Dynamic.literal(
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any]
      )

      EnvironmentName.foreach(__v => __obj.updateDynamic("EnvironmentName")(__v.asInstanceOf[js.Any]))
      TemplateName.foreach(__v => __obj.updateDynamic("TemplateName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConfigurationSettingsMessage]
    }
  }

  /**
    * See the example below to learn how to create a request body.
    */
  @js.native
  trait DescribeEnvironmentHealthRequest extends js.Object {
    var AttributeNames: js.UndefOr[EnvironmentHealthAttributes]
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var EnvironmentName: js.UndefOr[EnvironmentName]
  }

  object DescribeEnvironmentHealthRequest {
    @inline
    def apply(
        AttributeNames: js.UndefOr[EnvironmentHealthAttributes] = js.undefined,
        EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
        EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
    ): DescribeEnvironmentHealthRequest = {
      val __obj = js.Dynamic.literal()
      AttributeNames.foreach(__v => __obj.updateDynamic("AttributeNames")(__v.asInstanceOf[js.Any]))
      EnvironmentId.foreach(__v => __obj.updateDynamic("EnvironmentId")(__v.asInstanceOf[js.Any]))
      EnvironmentName.foreach(__v => __obj.updateDynamic("EnvironmentName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEnvironmentHealthRequest]
    }
  }

  /**
    * Health details for an AWS Elastic Beanstalk environment.
    */
  @js.native
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

  object DescribeEnvironmentHealthResult {
    @inline
    def apply(
        ApplicationMetrics: js.UndefOr[ApplicationMetrics] = js.undefined,
        Causes: js.UndefOr[Causes] = js.undefined,
        Color: js.UndefOr[String] = js.undefined,
        EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
        HealthStatus: js.UndefOr[String] = js.undefined,
        InstancesHealth: js.UndefOr[InstanceHealthSummary] = js.undefined,
        RefreshedAt: js.UndefOr[RefreshedAt] = js.undefined,
        Status: js.UndefOr[EnvironmentHealth] = js.undefined
    ): DescribeEnvironmentHealthResult = {
      val __obj = js.Dynamic.literal()
      ApplicationMetrics.foreach(__v => __obj.updateDynamic("ApplicationMetrics")(__v.asInstanceOf[js.Any]))
      Causes.foreach(__v => __obj.updateDynamic("Causes")(__v.asInstanceOf[js.Any]))
      Color.foreach(__v => __obj.updateDynamic("Color")(__v.asInstanceOf[js.Any]))
      EnvironmentName.foreach(__v => __obj.updateDynamic("EnvironmentName")(__v.asInstanceOf[js.Any]))
      HealthStatus.foreach(__v => __obj.updateDynamic("HealthStatus")(__v.asInstanceOf[js.Any]))
      InstancesHealth.foreach(__v => __obj.updateDynamic("InstancesHealth")(__v.asInstanceOf[js.Any]))
      RefreshedAt.foreach(__v => __obj.updateDynamic("RefreshedAt")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEnvironmentHealthResult]
    }
  }

  /**
    * Request to list completed and failed managed actions.
    */
  @js.native
  trait DescribeEnvironmentManagedActionHistoryRequest extends js.Object {
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var EnvironmentName: js.UndefOr[EnvironmentName]
    var MaxItems: js.UndefOr[Int]
    var NextToken: js.UndefOr[String]
  }

  object DescribeEnvironmentManagedActionHistoryRequest {
    @inline
    def apply(
        EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
        EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
        MaxItems: js.UndefOr[Int] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeEnvironmentManagedActionHistoryRequest = {
      val __obj = js.Dynamic.literal()
      EnvironmentId.foreach(__v => __obj.updateDynamic("EnvironmentId")(__v.asInstanceOf[js.Any]))
      EnvironmentName.foreach(__v => __obj.updateDynamic("EnvironmentName")(__v.asInstanceOf[js.Any]))
      MaxItems.foreach(__v => __obj.updateDynamic("MaxItems")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEnvironmentManagedActionHistoryRequest]
    }
  }

  /**
    * A result message containing a list of completed and failed managed actions.
    */
  @js.native
  trait DescribeEnvironmentManagedActionHistoryResult extends js.Object {
    var ManagedActionHistoryItems: js.UndefOr[ManagedActionHistoryItems]
    var NextToken: js.UndefOr[String]
  }

  object DescribeEnvironmentManagedActionHistoryResult {
    @inline
    def apply(
        ManagedActionHistoryItems: js.UndefOr[ManagedActionHistoryItems] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): DescribeEnvironmentManagedActionHistoryResult = {
      val __obj = js.Dynamic.literal()
      ManagedActionHistoryItems.foreach(__v =>
        __obj.updateDynamic("ManagedActionHistoryItems")(__v.asInstanceOf[js.Any])
      )
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEnvironmentManagedActionHistoryResult]
    }
  }

  /**
    * Request to list an environment's upcoming and in-progress managed actions.
    */
  @js.native
  trait DescribeEnvironmentManagedActionsRequest extends js.Object {
    var EnvironmentId: js.UndefOr[String]
    var EnvironmentName: js.UndefOr[String]
    var Status: js.UndefOr[ActionStatus]
  }

  object DescribeEnvironmentManagedActionsRequest {
    @inline
    def apply(
        EnvironmentId: js.UndefOr[String] = js.undefined,
        EnvironmentName: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[ActionStatus] = js.undefined
    ): DescribeEnvironmentManagedActionsRequest = {
      val __obj = js.Dynamic.literal()
      EnvironmentId.foreach(__v => __obj.updateDynamic("EnvironmentId")(__v.asInstanceOf[js.Any]))
      EnvironmentName.foreach(__v => __obj.updateDynamic("EnvironmentName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEnvironmentManagedActionsRequest]
    }
  }

  /**
    * The result message containing a list of managed actions.
    */
  @js.native
  trait DescribeEnvironmentManagedActionsResult extends js.Object {
    var ManagedActions: js.UndefOr[ManagedActions]
  }

  object DescribeEnvironmentManagedActionsResult {
    @inline
    def apply(
        ManagedActions: js.UndefOr[ManagedActions] = js.undefined
    ): DescribeEnvironmentManagedActionsResult = {
      val __obj = js.Dynamic.literal()
      ManagedActions.foreach(__v => __obj.updateDynamic("ManagedActions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEnvironmentManagedActionsResult]
    }
  }

  /**
    * Request to describe the resources in an environment.
    */
  @js.native
  trait DescribeEnvironmentResourcesMessage extends js.Object {
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var EnvironmentName: js.UndefOr[EnvironmentName]
  }

  object DescribeEnvironmentResourcesMessage {
    @inline
    def apply(
        EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
        EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
    ): DescribeEnvironmentResourcesMessage = {
      val __obj = js.Dynamic.literal()
      EnvironmentId.foreach(__v => __obj.updateDynamic("EnvironmentId")(__v.asInstanceOf[js.Any]))
      EnvironmentName.foreach(__v => __obj.updateDynamic("EnvironmentName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEnvironmentResourcesMessage]
    }
  }

  /**
    * Request to describe one or more environments.
    */
  @js.native
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

  object DescribeEnvironmentsMessage {
    @inline
    def apply(
        ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
        EnvironmentIds: js.UndefOr[EnvironmentIdList] = js.undefined,
        EnvironmentNames: js.UndefOr[EnvironmentNamesList] = js.undefined,
        IncludeDeleted: js.UndefOr[IncludeDeleted] = js.undefined,
        IncludedDeletedBackTo: js.UndefOr[IncludeDeletedBackTo] = js.undefined,
        MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        VersionLabel: js.UndefOr[VersionLabel] = js.undefined
    ): DescribeEnvironmentsMessage = {
      val __obj = js.Dynamic.literal()
      ApplicationName.foreach(__v => __obj.updateDynamic("ApplicationName")(__v.asInstanceOf[js.Any]))
      EnvironmentIds.foreach(__v => __obj.updateDynamic("EnvironmentIds")(__v.asInstanceOf[js.Any]))
      EnvironmentNames.foreach(__v => __obj.updateDynamic("EnvironmentNames")(__v.asInstanceOf[js.Any]))
      IncludeDeleted.foreach(__v => __obj.updateDynamic("IncludeDeleted")(__v.asInstanceOf[js.Any]))
      IncludedDeletedBackTo.foreach(__v => __obj.updateDynamic("IncludedDeletedBackTo")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      VersionLabel.foreach(__v => __obj.updateDynamic("VersionLabel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEnvironmentsMessage]
    }
  }

  /**
    * Request to retrieve a list of events for an environment.
    */
  @js.native
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

  object DescribeEventsMessage {
    @inline
    def apply(
        ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
        EndTime: js.UndefOr[TimeFilterEnd] = js.undefined,
        EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
        EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
        MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined,
        PlatformArn: js.UndefOr[PlatformArn] = js.undefined,
        RequestId: js.UndefOr[RequestId] = js.undefined,
        Severity: js.UndefOr[EventSeverity] = js.undefined,
        StartTime: js.UndefOr[TimeFilterStart] = js.undefined,
        TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined,
        VersionLabel: js.UndefOr[VersionLabel] = js.undefined
    ): DescribeEventsMessage = {
      val __obj = js.Dynamic.literal()
      ApplicationName.foreach(__v => __obj.updateDynamic("ApplicationName")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      EnvironmentId.foreach(__v => __obj.updateDynamic("EnvironmentId")(__v.asInstanceOf[js.Any]))
      EnvironmentName.foreach(__v => __obj.updateDynamic("EnvironmentName")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PlatformArn.foreach(__v => __obj.updateDynamic("PlatformArn")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      TemplateName.foreach(__v => __obj.updateDynamic("TemplateName")(__v.asInstanceOf[js.Any]))
      VersionLabel.foreach(__v => __obj.updateDynamic("VersionLabel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEventsMessage]
    }
  }

  /**
    * Parameters for a call to <code>DescribeInstancesHealth</code>.
    */
  @js.native
  trait DescribeInstancesHealthRequest extends js.Object {
    var AttributeNames: js.UndefOr[InstancesHealthAttributes]
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var EnvironmentName: js.UndefOr[EnvironmentName]
    var NextToken: js.UndefOr[NextToken]
  }

  object DescribeInstancesHealthRequest {
    @inline
    def apply(
        AttributeNames: js.UndefOr[InstancesHealthAttributes] = js.undefined,
        EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
        EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): DescribeInstancesHealthRequest = {
      val __obj = js.Dynamic.literal()
      AttributeNames.foreach(__v => __obj.updateDynamic("AttributeNames")(__v.asInstanceOf[js.Any]))
      EnvironmentId.foreach(__v => __obj.updateDynamic("EnvironmentId")(__v.asInstanceOf[js.Any]))
      EnvironmentName.foreach(__v => __obj.updateDynamic("EnvironmentName")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInstancesHealthRequest]
    }
  }

  /**
    * Detailed health information about the Amazon EC2 instances in an AWS Elastic Beanstalk environment.
    */
  @js.native
  trait DescribeInstancesHealthResult extends js.Object {
    var InstanceHealthList: js.UndefOr[InstanceHealthList]
    var NextToken: js.UndefOr[NextToken]
    var RefreshedAt: js.UndefOr[RefreshedAt]
  }

  object DescribeInstancesHealthResult {
    @inline
    def apply(
        InstanceHealthList: js.UndefOr[InstanceHealthList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        RefreshedAt: js.UndefOr[RefreshedAt] = js.undefined
    ): DescribeInstancesHealthResult = {
      val __obj = js.Dynamic.literal()
      InstanceHealthList.foreach(__v => __obj.updateDynamic("InstanceHealthList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RefreshedAt.foreach(__v => __obj.updateDynamic("RefreshedAt")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInstancesHealthResult]
    }
  }

  @js.native
  trait DescribePlatformVersionRequest extends js.Object {
    var PlatformArn: js.UndefOr[PlatformArn]
  }

  object DescribePlatformVersionRequest {
    @inline
    def apply(
        PlatformArn: js.UndefOr[PlatformArn] = js.undefined
    ): DescribePlatformVersionRequest = {
      val __obj = js.Dynamic.literal()
      PlatformArn.foreach(__v => __obj.updateDynamic("PlatformArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePlatformVersionRequest]
    }
  }

  @js.native
  trait DescribePlatformVersionResult extends js.Object {
    var PlatformDescription: js.UndefOr[PlatformDescription]
  }

  object DescribePlatformVersionResult {
    @inline
    def apply(
        PlatformDescription: js.UndefOr[PlatformDescription] = js.undefined
    ): DescribePlatformVersionResult = {
      val __obj = js.Dynamic.literal()
      PlatformDescription.foreach(__v => __obj.updateDynamic("PlatformDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePlatformVersionResult]
    }
  }

  /**
    * Describes the properties of an environment.
    */
  @js.native
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

  object EnvironmentDescription {
    @inline
    def apply(
        AbortableOperationInProgress: js.UndefOr[AbortableOperationInProgress] = js.undefined,
        ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
        CNAME: js.UndefOr[DNSCname] = js.undefined,
        DateCreated: js.UndefOr[CreationDate] = js.undefined,
        DateUpdated: js.UndefOr[UpdateDate] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        EndpointURL: js.UndefOr[EndpointURL] = js.undefined,
        EnvironmentArn: js.UndefOr[EnvironmentArn] = js.undefined,
        EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
        EnvironmentLinks: js.UndefOr[EnvironmentLinks] = js.undefined,
        EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
        Health: js.UndefOr[EnvironmentHealth] = js.undefined,
        HealthStatus: js.UndefOr[EnvironmentHealthStatus] = js.undefined,
        PlatformArn: js.UndefOr[PlatformArn] = js.undefined,
        Resources: js.UndefOr[EnvironmentResourcesDescription] = js.undefined,
        SolutionStackName: js.UndefOr[SolutionStackName] = js.undefined,
        Status: js.UndefOr[EnvironmentStatus] = js.undefined,
        TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined,
        Tier: js.UndefOr[EnvironmentTier] = js.undefined,
        VersionLabel: js.UndefOr[VersionLabel] = js.undefined
    ): EnvironmentDescription = {
      val __obj = js.Dynamic.literal()
      AbortableOperationInProgress.foreach(__v =>
        __obj.updateDynamic("AbortableOperationInProgress")(__v.asInstanceOf[js.Any])
      )
      ApplicationName.foreach(__v => __obj.updateDynamic("ApplicationName")(__v.asInstanceOf[js.Any]))
      CNAME.foreach(__v => __obj.updateDynamic("CNAME")(__v.asInstanceOf[js.Any]))
      DateCreated.foreach(__v => __obj.updateDynamic("DateCreated")(__v.asInstanceOf[js.Any]))
      DateUpdated.foreach(__v => __obj.updateDynamic("DateUpdated")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EndpointURL.foreach(__v => __obj.updateDynamic("EndpointURL")(__v.asInstanceOf[js.Any]))
      EnvironmentArn.foreach(__v => __obj.updateDynamic("EnvironmentArn")(__v.asInstanceOf[js.Any]))
      EnvironmentId.foreach(__v => __obj.updateDynamic("EnvironmentId")(__v.asInstanceOf[js.Any]))
      EnvironmentLinks.foreach(__v => __obj.updateDynamic("EnvironmentLinks")(__v.asInstanceOf[js.Any]))
      EnvironmentName.foreach(__v => __obj.updateDynamic("EnvironmentName")(__v.asInstanceOf[js.Any]))
      Health.foreach(__v => __obj.updateDynamic("Health")(__v.asInstanceOf[js.Any]))
      HealthStatus.foreach(__v => __obj.updateDynamic("HealthStatus")(__v.asInstanceOf[js.Any]))
      PlatformArn.foreach(__v => __obj.updateDynamic("PlatformArn")(__v.asInstanceOf[js.Any]))
      Resources.foreach(__v => __obj.updateDynamic("Resources")(__v.asInstanceOf[js.Any]))
      SolutionStackName.foreach(__v => __obj.updateDynamic("SolutionStackName")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TemplateName.foreach(__v => __obj.updateDynamic("TemplateName")(__v.asInstanceOf[js.Any]))
      Tier.foreach(__v => __obj.updateDynamic("Tier")(__v.asInstanceOf[js.Any]))
      VersionLabel.foreach(__v => __obj.updateDynamic("VersionLabel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnvironmentDescription]
    }
  }

  /**
    * Result message containing a list of environment descriptions.
    */
  @js.native
  trait EnvironmentDescriptionsMessage extends js.Object {
    var Environments: js.UndefOr[EnvironmentDescriptionsList]
    var NextToken: js.UndefOr[Token]
  }

  object EnvironmentDescriptionsMessage {
    @inline
    def apply(
        Environments: js.UndefOr[EnvironmentDescriptionsList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): EnvironmentDescriptionsMessage = {
      val __obj = js.Dynamic.literal()
      Environments.foreach(__v => __obj.updateDynamic("Environments")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnvironmentDescriptionsMessage]
    }
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
  trait EnvironmentInfoDescription extends js.Object {
    var Ec2InstanceId: js.UndefOr[Ec2InstanceId]
    var InfoType: js.UndefOr[EnvironmentInfoType]
    var Message: js.UndefOr[Message]
    var SampleTimestamp: js.UndefOr[SampleTimestamp]
  }

  object EnvironmentInfoDescription {
    @inline
    def apply(
        Ec2InstanceId: js.UndefOr[Ec2InstanceId] = js.undefined,
        InfoType: js.UndefOr[EnvironmentInfoType] = js.undefined,
        Message: js.UndefOr[Message] = js.undefined,
        SampleTimestamp: js.UndefOr[SampleTimestamp] = js.undefined
    ): EnvironmentInfoDescription = {
      val __obj = js.Dynamic.literal()
      Ec2InstanceId.foreach(__v => __obj.updateDynamic("Ec2InstanceId")(__v.asInstanceOf[js.Any]))
      InfoType.foreach(__v => __obj.updateDynamic("InfoType")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      SampleTimestamp.foreach(__v => __obj.updateDynamic("SampleTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnvironmentInfoDescription]
    }
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
  trait EnvironmentLink extends js.Object {
    var EnvironmentName: js.UndefOr[String]
    var LinkName: js.UndefOr[String]
  }

  object EnvironmentLink {
    @inline
    def apply(
        EnvironmentName: js.UndefOr[String] = js.undefined,
        LinkName: js.UndefOr[String] = js.undefined
    ): EnvironmentLink = {
      val __obj = js.Dynamic.literal()
      EnvironmentName.foreach(__v => __obj.updateDynamic("EnvironmentName")(__v.asInstanceOf[js.Any]))
      LinkName.foreach(__v => __obj.updateDynamic("LinkName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnvironmentLink]
    }
  }

  /**
    * Describes the AWS resources in use by this environment. This data is live.
    */
  @js.native
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

  object EnvironmentResourceDescription {
    @inline
    def apply(
        AutoScalingGroups: js.UndefOr[AutoScalingGroupList] = js.undefined,
        EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
        Instances: js.UndefOr[InstanceList] = js.undefined,
        LaunchConfigurations: js.UndefOr[LaunchConfigurationList] = js.undefined,
        LaunchTemplates: js.UndefOr[LaunchTemplateList] = js.undefined,
        LoadBalancers: js.UndefOr[LoadBalancerList] = js.undefined,
        Queues: js.UndefOr[QueueList] = js.undefined,
        Triggers: js.UndefOr[TriggerList] = js.undefined
    ): EnvironmentResourceDescription = {
      val __obj = js.Dynamic.literal()
      AutoScalingGroups.foreach(__v => __obj.updateDynamic("AutoScalingGroups")(__v.asInstanceOf[js.Any]))
      EnvironmentName.foreach(__v => __obj.updateDynamic("EnvironmentName")(__v.asInstanceOf[js.Any]))
      Instances.foreach(__v => __obj.updateDynamic("Instances")(__v.asInstanceOf[js.Any]))
      LaunchConfigurations.foreach(__v => __obj.updateDynamic("LaunchConfigurations")(__v.asInstanceOf[js.Any]))
      LaunchTemplates.foreach(__v => __obj.updateDynamic("LaunchTemplates")(__v.asInstanceOf[js.Any]))
      LoadBalancers.foreach(__v => __obj.updateDynamic("LoadBalancers")(__v.asInstanceOf[js.Any]))
      Queues.foreach(__v => __obj.updateDynamic("Queues")(__v.asInstanceOf[js.Any]))
      Triggers.foreach(__v => __obj.updateDynamic("Triggers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnvironmentResourceDescription]
    }
  }

  /**
    * Result message containing a list of environment resource descriptions.
    */
  @js.native
  trait EnvironmentResourceDescriptionsMessage extends js.Object {
    var EnvironmentResources: js.UndefOr[EnvironmentResourceDescription]
  }

  object EnvironmentResourceDescriptionsMessage {
    @inline
    def apply(
        EnvironmentResources: js.UndefOr[EnvironmentResourceDescription] = js.undefined
    ): EnvironmentResourceDescriptionsMessage = {
      val __obj = js.Dynamic.literal()
      EnvironmentResources.foreach(__v => __obj.updateDynamic("EnvironmentResources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnvironmentResourceDescriptionsMessage]
    }
  }

  /**
    * Describes the AWS resources in use by this environment. This data is not live data.
    */
  @js.native
  trait EnvironmentResourcesDescription extends js.Object {
    var LoadBalancer: js.UndefOr[LoadBalancerDescription]
  }

  object EnvironmentResourcesDescription {
    @inline
    def apply(
        LoadBalancer: js.UndefOr[LoadBalancerDescription] = js.undefined
    ): EnvironmentResourcesDescription = {
      val __obj = js.Dynamic.literal()
      LoadBalancer.foreach(__v => __obj.updateDynamic("LoadBalancer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnvironmentResourcesDescription]
    }
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
  trait EnvironmentTier extends js.Object {
    var Name: js.UndefOr[String]
    var Type: js.UndefOr[String]
    var Version: js.UndefOr[String]
  }

  object EnvironmentTier {
    @inline
    def apply(
        Name: js.UndefOr[String] = js.undefined,
        Type: js.UndefOr[String] = js.undefined,
        Version: js.UndefOr[String] = js.undefined
    ): EnvironmentTier = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EnvironmentTier]
    }
  }

  /**
    * Describes an event.
    */
  @js.native
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

  object EventDescription {
    @inline
    def apply(
        ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
        EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
        EventDate: js.UndefOr[EventDate] = js.undefined,
        Message: js.UndefOr[EventMessage] = js.undefined,
        PlatformArn: js.UndefOr[PlatformArn] = js.undefined,
        RequestId: js.UndefOr[RequestId] = js.undefined,
        Severity: js.UndefOr[EventSeverity] = js.undefined,
        TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined,
        VersionLabel: js.UndefOr[VersionLabel] = js.undefined
    ): EventDescription = {
      val __obj = js.Dynamic.literal()
      ApplicationName.foreach(__v => __obj.updateDynamic("ApplicationName")(__v.asInstanceOf[js.Any]))
      EnvironmentName.foreach(__v => __obj.updateDynamic("EnvironmentName")(__v.asInstanceOf[js.Any]))
      EventDate.foreach(__v => __obj.updateDynamic("EventDate")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      PlatformArn.foreach(__v => __obj.updateDynamic("PlatformArn")(__v.asInstanceOf[js.Any]))
      RequestId.foreach(__v => __obj.updateDynamic("RequestId")(__v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
      TemplateName.foreach(__v => __obj.updateDynamic("TemplateName")(__v.asInstanceOf[js.Any]))
      VersionLabel.foreach(__v => __obj.updateDynamic("VersionLabel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventDescription]
    }
  }

  /**
    * Result message wrapping a list of event descriptions.
    */
  @js.native
  trait EventDescriptionsMessage extends js.Object {
    var Events: js.UndefOr[EventDescriptionList]
    var NextToken: js.UndefOr[Token]
  }

  object EventDescriptionsMessage {
    @inline
    def apply(
        Events: js.UndefOr[EventDescriptionList] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): EventDescriptionsMessage = {
      val __obj = js.Dynamic.literal()
      Events.foreach(__v => __obj.updateDynamic("Events")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventDescriptionsMessage]
    }
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
  trait Instance extends js.Object {
    var Id: js.UndefOr[ResourceId]
  }

  object Instance {
    @inline
    def apply(
        Id: js.UndefOr[ResourceId] = js.undefined
    ): Instance = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Instance]
    }
  }

  /**
    * Represents summary information about the health of an instance. For more information, see [[https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html|Health Colors and Statuses]].
    */
  @js.native
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

  object InstanceHealthSummary {
    @inline
    def apply(
        Degraded: js.UndefOr[NullableInteger] = js.undefined,
        Info: js.UndefOr[NullableInteger] = js.undefined,
        NoData: js.UndefOr[NullableInteger] = js.undefined,
        Ok: js.UndefOr[NullableInteger] = js.undefined,
        Pending: js.UndefOr[NullableInteger] = js.undefined,
        Severe: js.UndefOr[NullableInteger] = js.undefined,
        Unknown: js.UndefOr[NullableInteger] = js.undefined,
        Warning: js.UndefOr[NullableInteger] = js.undefined
    ): InstanceHealthSummary = {
      val __obj = js.Dynamic.literal()
      Degraded.foreach(__v => __obj.updateDynamic("Degraded")(__v.asInstanceOf[js.Any]))
      Info.foreach(__v => __obj.updateDynamic("Info")(__v.asInstanceOf[js.Any]))
      NoData.foreach(__v => __obj.updateDynamic("NoData")(__v.asInstanceOf[js.Any]))
      Ok.foreach(__v => __obj.updateDynamic("Ok")(__v.asInstanceOf[js.Any]))
      Pending.foreach(__v => __obj.updateDynamic("Pending")(__v.asInstanceOf[js.Any]))
      Severe.foreach(__v => __obj.updateDynamic("Severe")(__v.asInstanceOf[js.Any]))
      Unknown.foreach(__v => __obj.updateDynamic("Unknown")(__v.asInstanceOf[js.Any]))
      Warning.foreach(__v => __obj.updateDynamic("Warning")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceHealthSummary]
    }
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

  object Latency {
    @inline
    def apply(
        P10: js.UndefOr[NullableDouble] = js.undefined,
        P50: js.UndefOr[NullableDouble] = js.undefined,
        P75: js.UndefOr[NullableDouble] = js.undefined,
        P85: js.UndefOr[NullableDouble] = js.undefined,
        P90: js.UndefOr[NullableDouble] = js.undefined,
        P95: js.UndefOr[NullableDouble] = js.undefined,
        P99: js.UndefOr[NullableDouble] = js.undefined,
        P999: js.UndefOr[NullableDouble] = js.undefined
    ): Latency = {
      val __obj = js.Dynamic.literal()
      P10.foreach(__v => __obj.updateDynamic("P10")(__v.asInstanceOf[js.Any]))
      P50.foreach(__v => __obj.updateDynamic("P50")(__v.asInstanceOf[js.Any]))
      P75.foreach(__v => __obj.updateDynamic("P75")(__v.asInstanceOf[js.Any]))
      P85.foreach(__v => __obj.updateDynamic("P85")(__v.asInstanceOf[js.Any]))
      P90.foreach(__v => __obj.updateDynamic("P90")(__v.asInstanceOf[js.Any]))
      P95.foreach(__v => __obj.updateDynamic("P95")(__v.asInstanceOf[js.Any]))
      P99.foreach(__v => __obj.updateDynamic("P99")(__v.asInstanceOf[js.Any]))
      P999.foreach(__v => __obj.updateDynamic("P999")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Latency]
    }
  }

  /**
    * Describes an Auto Scaling launch configuration.
    */
  @js.native
  trait LaunchConfiguration extends js.Object {
    var Name: js.UndefOr[ResourceId]
  }

  object LaunchConfiguration {
    @inline
    def apply(
        Name: js.UndefOr[ResourceId] = js.undefined
    ): LaunchConfiguration = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchConfiguration]
    }
  }

  /**
    * Describes an Amazon EC2 launch template.
    */
  @js.native
  trait LaunchTemplate extends js.Object {
    var Id: js.UndefOr[ResourceId]
  }

  object LaunchTemplate {
    @inline
    def apply(
        Id: js.UndefOr[ResourceId] = js.undefined
    ): LaunchTemplate = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchTemplate]
    }
  }

  /**
    * A list of available AWS Elastic Beanstalk solution stacks.
    */
  @js.native
  trait ListAvailableSolutionStacksResultMessage extends js.Object {
    var SolutionStackDetails: js.UndefOr[AvailableSolutionStackDetailsList]
    var SolutionStacks: js.UndefOr[AvailableSolutionStackNamesList]
  }

  object ListAvailableSolutionStacksResultMessage {
    @inline
    def apply(
        SolutionStackDetails: js.UndefOr[AvailableSolutionStackDetailsList] = js.undefined,
        SolutionStacks: js.UndefOr[AvailableSolutionStackNamesList] = js.undefined
    ): ListAvailableSolutionStacksResultMessage = {
      val __obj = js.Dynamic.literal()
      SolutionStackDetails.foreach(__v => __obj.updateDynamic("SolutionStackDetails")(__v.asInstanceOf[js.Any]))
      SolutionStacks.foreach(__v => __obj.updateDynamic("SolutionStacks")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAvailableSolutionStacksResultMessage]
    }
  }

  @js.native
  trait ListPlatformVersionsRequest extends js.Object {
    var Filters: js.UndefOr[PlatformFilters]
    var MaxRecords: js.UndefOr[PlatformMaxRecords]
    var NextToken: js.UndefOr[Token]
  }

  object ListPlatformVersionsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[PlatformFilters] = js.undefined,
        MaxRecords: js.UndefOr[PlatformMaxRecords] = js.undefined,
        NextToken: js.UndefOr[Token] = js.undefined
    ): ListPlatformVersionsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxRecords.foreach(__v => __obj.updateDynamic("MaxRecords")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPlatformVersionsRequest]
    }
  }

  @js.native
  trait ListPlatformVersionsResult extends js.Object {
    var NextToken: js.UndefOr[Token]
    var PlatformSummaryList: js.UndefOr[PlatformSummaryList]
  }

  object ListPlatformVersionsResult {
    @inline
    def apply(
        NextToken: js.UndefOr[Token] = js.undefined,
        PlatformSummaryList: js.UndefOr[PlatformSummaryList] = js.undefined
    ): ListPlatformVersionsResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PlatformSummaryList.foreach(__v => __obj.updateDynamic("PlatformSummaryList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPlatformVersionsResult]
    }
  }

  @js.native
  trait ListTagsForResourceMessage extends js.Object {
    var ResourceArn: ResourceArn
  }

  object ListTagsForResourceMessage {
    @inline
    def apply(
        ResourceArn: ResourceArn
    ): ListTagsForResourceMessage = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceMessage]
    }
  }

  /**
    * Describes the properties of a Listener for the LoadBalancer.
    */
  @js.native
  trait Listener extends js.Object {
    var Port: js.UndefOr[Int]
    var Protocol: js.UndefOr[String]
  }

  object Listener {
    @inline
    def apply(
        Port: js.UndefOr[Int] = js.undefined,
        Protocol: js.UndefOr[String] = js.undefined
    ): Listener = {
      val __obj = js.Dynamic.literal()
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Listener]
    }
  }

  /**
    * Describes a LoadBalancer.
    */
  @js.native
  trait LoadBalancer extends js.Object {
    var Name: js.UndefOr[ResourceId]
  }

  object LoadBalancer {
    @inline
    def apply(
        Name: js.UndefOr[ResourceId] = js.undefined
    ): LoadBalancer = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoadBalancer]
    }
  }

  /**
    * Describes the details of a LoadBalancer.
    */
  @js.native
  trait LoadBalancerDescription extends js.Object {
    var Domain: js.UndefOr[String]
    var Listeners: js.UndefOr[LoadBalancerListenersDescription]
    var LoadBalancerName: js.UndefOr[String]
  }

  object LoadBalancerDescription {
    @inline
    def apply(
        Domain: js.UndefOr[String] = js.undefined,
        Listeners: js.UndefOr[LoadBalancerListenersDescription] = js.undefined,
        LoadBalancerName: js.UndefOr[String] = js.undefined
    ): LoadBalancerDescription = {
      val __obj = js.Dynamic.literal()
      Domain.foreach(__v => __obj.updateDynamic("Domain")(__v.asInstanceOf[js.Any]))
      Listeners.foreach(__v => __obj.updateDynamic("Listeners")(__v.asInstanceOf[js.Any]))
      LoadBalancerName.foreach(__v => __obj.updateDynamic("LoadBalancerName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoadBalancerDescription]
    }
  }

  /**
    * The record of an upcoming or in-progress managed action.
    */
  @js.native
  trait ManagedAction extends js.Object {
    var ActionDescription: js.UndefOr[String]
    var ActionId: js.UndefOr[String]
    var ActionType: js.UndefOr[ActionType]
    var Status: js.UndefOr[ActionStatus]
    var WindowStartTime: js.UndefOr[Timestamp]
  }

  object ManagedAction {
    @inline
    def apply(
        ActionDescription: js.UndefOr[String] = js.undefined,
        ActionId: js.UndefOr[String] = js.undefined,
        ActionType: js.UndefOr[ActionType] = js.undefined,
        Status: js.UndefOr[ActionStatus] = js.undefined,
        WindowStartTime: js.UndefOr[Timestamp] = js.undefined
    ): ManagedAction = {
      val __obj = js.Dynamic.literal()
      ActionDescription.foreach(__v => __obj.updateDynamic("ActionDescription")(__v.asInstanceOf[js.Any]))
      ActionId.foreach(__v => __obj.updateDynamic("ActionId")(__v.asInstanceOf[js.Any]))
      ActionType.foreach(__v => __obj.updateDynamic("ActionType")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      WindowStartTime.foreach(__v => __obj.updateDynamic("WindowStartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ManagedAction]
    }
  }

  /**
    * The record of a completed or failed managed action.
    */
  @js.native
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

  object ManagedActionHistoryItem {
    @inline
    def apply(
        ActionDescription: js.UndefOr[String] = js.undefined,
        ActionId: js.UndefOr[String] = js.undefined,
        ActionType: js.UndefOr[ActionType] = js.undefined,
        ExecutedTime: js.UndefOr[Timestamp] = js.undefined,
        FailureDescription: js.UndefOr[String] = js.undefined,
        FailureType: js.UndefOr[FailureType] = js.undefined,
        FinishedTime: js.UndefOr[Timestamp] = js.undefined,
        Status: js.UndefOr[ActionHistoryStatus] = js.undefined
    ): ManagedActionHistoryItem = {
      val __obj = js.Dynamic.literal()
      ActionDescription.foreach(__v => __obj.updateDynamic("ActionDescription")(__v.asInstanceOf[js.Any]))
      ActionId.foreach(__v => __obj.updateDynamic("ActionId")(__v.asInstanceOf[js.Any]))
      ActionType.foreach(__v => __obj.updateDynamic("ActionType")(__v.asInstanceOf[js.Any]))
      ExecutedTime.foreach(__v => __obj.updateDynamic("ExecutedTime")(__v.asInstanceOf[js.Any]))
      FailureDescription.foreach(__v => __obj.updateDynamic("FailureDescription")(__v.asInstanceOf[js.Any]))
      FailureType.foreach(__v => __obj.updateDynamic("FailureType")(__v.asInstanceOf[js.Any]))
      FinishedTime.foreach(__v => __obj.updateDynamic("FinishedTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ManagedActionHistoryItem]
    }
  }

  /**
    * A lifecycle rule that deletes application versions after the specified number of days.
    */
  @js.native
  trait MaxAgeRule extends js.Object {
    var Enabled: BoxedBoolean
    var DeleteSourceFromS3: js.UndefOr[BoxedBoolean]
    var MaxAgeInDays: js.UndefOr[BoxedInt]
  }

  object MaxAgeRule {
    @inline
    def apply(
        Enabled: BoxedBoolean,
        DeleteSourceFromS3: js.UndefOr[BoxedBoolean] = js.undefined,
        MaxAgeInDays: js.UndefOr[BoxedInt] = js.undefined
    ): MaxAgeRule = {
      val __obj = js.Dynamic.literal(
        "Enabled" -> Enabled.asInstanceOf[js.Any]
      )

      DeleteSourceFromS3.foreach(__v => __obj.updateDynamic("DeleteSourceFromS3")(__v.asInstanceOf[js.Any]))
      MaxAgeInDays.foreach(__v => __obj.updateDynamic("MaxAgeInDays")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaxAgeRule]
    }
  }

  /**
    * A lifecycle rule that deletes the oldest application version when the maximum count is exceeded.
    */
  @js.native
  trait MaxCountRule extends js.Object {
    var Enabled: BoxedBoolean
    var DeleteSourceFromS3: js.UndefOr[BoxedBoolean]
    var MaxCount: js.UndefOr[BoxedInt]
  }

  object MaxCountRule {
    @inline
    def apply(
        Enabled: BoxedBoolean,
        DeleteSourceFromS3: js.UndefOr[BoxedBoolean] = js.undefined,
        MaxCount: js.UndefOr[BoxedInt] = js.undefined
    ): MaxCountRule = {
      val __obj = js.Dynamic.literal(
        "Enabled" -> Enabled.asInstanceOf[js.Any]
      )

      DeleteSourceFromS3.foreach(__v => __obj.updateDynamic("DeleteSourceFromS3")(__v.asInstanceOf[js.Any]))
      MaxCount.foreach(__v => __obj.updateDynamic("MaxCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MaxCountRule]
    }
  }

  /**
    * A regular expression representing a restriction on a string configuration option value.
    */
  @js.native
  trait OptionRestrictionRegex extends js.Object {
    var Label: js.UndefOr[RegexLabel]
    var Pattern: js.UndefOr[RegexPattern]
  }

  object OptionRestrictionRegex {
    @inline
    def apply(
        Label: js.UndefOr[RegexLabel] = js.undefined,
        Pattern: js.UndefOr[RegexPattern] = js.undefined
    ): OptionRestrictionRegex = {
      val __obj = js.Dynamic.literal()
      Label.foreach(__v => __obj.updateDynamic("Label")(__v.asInstanceOf[js.Any]))
      Pattern.foreach(__v => __obj.updateDynamic("Pattern")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OptionRestrictionRegex]
    }
  }

  /**
    * A specification identifying an individual configuration option.
    */
  @js.native
  trait OptionSpecification extends js.Object {
    var Namespace: js.UndefOr[OptionNamespace]
    var OptionName: js.UndefOr[ConfigurationOptionName]
    var ResourceName: js.UndefOr[ResourceName]
  }

  object OptionSpecification {
    @inline
    def apply(
        Namespace: js.UndefOr[OptionNamespace] = js.undefined,
        OptionName: js.UndefOr[ConfigurationOptionName] = js.undefined,
        ResourceName: js.UndefOr[ResourceName] = js.undefined
    ): OptionSpecification = {
      val __obj = js.Dynamic.literal()
      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      OptionName.foreach(__v => __obj.updateDynamic("OptionName")(__v.asInstanceOf[js.Any]))
      ResourceName.foreach(__v => __obj.updateDynamic("ResourceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OptionSpecification]
    }
  }

  /**
    * Detailed information about a platform.
    */
  @js.native
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

  object PlatformDescription {
    @inline
    def apply(
        CustomAmiList: js.UndefOr[CustomAmiList] = js.undefined,
        DateCreated: js.UndefOr[CreationDate] = js.undefined,
        DateUpdated: js.UndefOr[UpdateDate] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Frameworks: js.UndefOr[PlatformFrameworks] = js.undefined,
        Maintainer: js.UndefOr[Maintainer] = js.undefined,
        OperatingSystemName: js.UndefOr[OperatingSystemName] = js.undefined,
        OperatingSystemVersion: js.UndefOr[OperatingSystemVersion] = js.undefined,
        PlatformArn: js.UndefOr[PlatformArn] = js.undefined,
        PlatformCategory: js.UndefOr[PlatformCategory] = js.undefined,
        PlatformName: js.UndefOr[PlatformName] = js.undefined,
        PlatformOwner: js.UndefOr[PlatformOwner] = js.undefined,
        PlatformStatus: js.UndefOr[PlatformStatus] = js.undefined,
        PlatformVersion: js.UndefOr[PlatformVersion] = js.undefined,
        ProgrammingLanguages: js.UndefOr[PlatformProgrammingLanguages] = js.undefined,
        SolutionStackName: js.UndefOr[SolutionStackName] = js.undefined,
        SupportedAddonList: js.UndefOr[SupportedAddonList] = js.undefined,
        SupportedTierList: js.UndefOr[SupportedTierList] = js.undefined
    ): PlatformDescription = {
      val __obj = js.Dynamic.literal()
      CustomAmiList.foreach(__v => __obj.updateDynamic("CustomAmiList")(__v.asInstanceOf[js.Any]))
      DateCreated.foreach(__v => __obj.updateDynamic("DateCreated")(__v.asInstanceOf[js.Any]))
      DateUpdated.foreach(__v => __obj.updateDynamic("DateUpdated")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Frameworks.foreach(__v => __obj.updateDynamic("Frameworks")(__v.asInstanceOf[js.Any]))
      Maintainer.foreach(__v => __obj.updateDynamic("Maintainer")(__v.asInstanceOf[js.Any]))
      OperatingSystemName.foreach(__v => __obj.updateDynamic("OperatingSystemName")(__v.asInstanceOf[js.Any]))
      OperatingSystemVersion.foreach(__v => __obj.updateDynamic("OperatingSystemVersion")(__v.asInstanceOf[js.Any]))
      PlatformArn.foreach(__v => __obj.updateDynamic("PlatformArn")(__v.asInstanceOf[js.Any]))
      PlatformCategory.foreach(__v => __obj.updateDynamic("PlatformCategory")(__v.asInstanceOf[js.Any]))
      PlatformName.foreach(__v => __obj.updateDynamic("PlatformName")(__v.asInstanceOf[js.Any]))
      PlatformOwner.foreach(__v => __obj.updateDynamic("PlatformOwner")(__v.asInstanceOf[js.Any]))
      PlatformStatus.foreach(__v => __obj.updateDynamic("PlatformStatus")(__v.asInstanceOf[js.Any]))
      PlatformVersion.foreach(__v => __obj.updateDynamic("PlatformVersion")(__v.asInstanceOf[js.Any]))
      ProgrammingLanguages.foreach(__v => __obj.updateDynamic("ProgrammingLanguages")(__v.asInstanceOf[js.Any]))
      SolutionStackName.foreach(__v => __obj.updateDynamic("SolutionStackName")(__v.asInstanceOf[js.Any]))
      SupportedAddonList.foreach(__v => __obj.updateDynamic("SupportedAddonList")(__v.asInstanceOf[js.Any]))
      SupportedTierList.foreach(__v => __obj.updateDynamic("SupportedTierList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PlatformDescription]
    }
  }

  /**
    * Specify criteria to restrict the results when listing custom platforms.
    *  The filter is evaluated as the expression:
    *  <code>Type</code> <code>Operator</code> <code>Values[i]</code>
    */
  @js.native
  trait PlatformFilter extends js.Object {
    var Operator: js.UndefOr[PlatformFilterOperator]
    var Type: js.UndefOr[PlatformFilterType]
    var Values: js.UndefOr[PlatformFilterValueList]
  }

  object PlatformFilter {
    @inline
    def apply(
        Operator: js.UndefOr[PlatformFilterOperator] = js.undefined,
        Type: js.UndefOr[PlatformFilterType] = js.undefined,
        Values: js.UndefOr[PlatformFilterValueList] = js.undefined
    ): PlatformFilter = {
      val __obj = js.Dynamic.literal()
      Operator.foreach(__v => __obj.updateDynamic("Operator")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PlatformFilter]
    }
  }

  /**
    * A framework supported by the custom platform.
    */
  @js.native
  trait PlatformFramework extends js.Object {
    var Name: js.UndefOr[String]
    var Version: js.UndefOr[String]
  }

  object PlatformFramework {
    @inline
    def apply(
        Name: js.UndefOr[String] = js.undefined,
        Version: js.UndefOr[String] = js.undefined
    ): PlatformFramework = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PlatformFramework]
    }
  }

  /**
    * A programming language supported by the platform.
    */
  @js.native
  trait PlatformProgrammingLanguage extends js.Object {
    var Name: js.UndefOr[String]
    var Version: js.UndefOr[String]
  }

  object PlatformProgrammingLanguage {
    @inline
    def apply(
        Name: js.UndefOr[String] = js.undefined,
        Version: js.UndefOr[String] = js.undefined
    ): PlatformProgrammingLanguage = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PlatformProgrammingLanguage]
    }
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

  object PlatformSummary {
    @inline
    def apply(
        OperatingSystemName: js.UndefOr[OperatingSystemName] = js.undefined,
        OperatingSystemVersion: js.UndefOr[OperatingSystemVersion] = js.undefined,
        PlatformArn: js.UndefOr[PlatformArn] = js.undefined,
        PlatformCategory: js.UndefOr[PlatformCategory] = js.undefined,
        PlatformOwner: js.UndefOr[PlatformOwner] = js.undefined,
        PlatformStatus: js.UndefOr[PlatformStatus] = js.undefined,
        SupportedAddonList: js.UndefOr[SupportedAddonList] = js.undefined,
        SupportedTierList: js.UndefOr[SupportedTierList] = js.undefined
    ): PlatformSummary = {
      val __obj = js.Dynamic.literal()
      OperatingSystemName.foreach(__v => __obj.updateDynamic("OperatingSystemName")(__v.asInstanceOf[js.Any]))
      OperatingSystemVersion.foreach(__v => __obj.updateDynamic("OperatingSystemVersion")(__v.asInstanceOf[js.Any]))
      PlatformArn.foreach(__v => __obj.updateDynamic("PlatformArn")(__v.asInstanceOf[js.Any]))
      PlatformCategory.foreach(__v => __obj.updateDynamic("PlatformCategory")(__v.asInstanceOf[js.Any]))
      PlatformOwner.foreach(__v => __obj.updateDynamic("PlatformOwner")(__v.asInstanceOf[js.Any]))
      PlatformStatus.foreach(__v => __obj.updateDynamic("PlatformStatus")(__v.asInstanceOf[js.Any]))
      SupportedAddonList.foreach(__v => __obj.updateDynamic("SupportedAddonList")(__v.asInstanceOf[js.Any]))
      SupportedTierList.foreach(__v => __obj.updateDynamic("SupportedTierList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PlatformSummary]
    }
  }

  /**
    * Describes a queue.
    */
  @js.native
  trait Queue extends js.Object {
    var Name: js.UndefOr[String]
    var URL: js.UndefOr[String]
  }

  object Queue {
    @inline
    def apply(
        Name: js.UndefOr[String] = js.undefined,
        URL: js.UndefOr[String] = js.undefined
    ): Queue = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      URL.foreach(__v => __obj.updateDynamic("URL")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Queue]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait RebuildEnvironmentMessage extends js.Object {
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var EnvironmentName: js.UndefOr[EnvironmentName]
  }

  object RebuildEnvironmentMessage {
    @inline
    def apply(
        EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
        EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
    ): RebuildEnvironmentMessage = {
      val __obj = js.Dynamic.literal()
      EnvironmentId.foreach(__v => __obj.updateDynamic("EnvironmentId")(__v.asInstanceOf[js.Any]))
      EnvironmentName.foreach(__v => __obj.updateDynamic("EnvironmentName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RebuildEnvironmentMessage]
    }
  }

  /**
    * Request to retrieve logs from an environment and store them in your Elastic Beanstalk storage bucket.
    */
  @js.native
  trait RequestEnvironmentInfoMessage extends js.Object {
    var InfoType: EnvironmentInfoType
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var EnvironmentName: js.UndefOr[EnvironmentName]
  }

  object RequestEnvironmentInfoMessage {
    @inline
    def apply(
        InfoType: EnvironmentInfoType,
        EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
        EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
    ): RequestEnvironmentInfoMessage = {
      val __obj = js.Dynamic.literal(
        "InfoType" -> InfoType.asInstanceOf[js.Any]
      )

      EnvironmentId.foreach(__v => __obj.updateDynamic("EnvironmentId")(__v.asInstanceOf[js.Any]))
      EnvironmentName.foreach(__v => __obj.updateDynamic("EnvironmentName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RequestEnvironmentInfoMessage]
    }
  }

  /**
    * The AWS Elastic Beanstalk quota information for a single resource type in an AWS account. It reflects the resource's limits for this account.
    */
  @js.native
  trait ResourceQuota extends js.Object {
    var Maximum: js.UndefOr[BoxedInt]
  }

  object ResourceQuota {
    @inline
    def apply(
        Maximum: js.UndefOr[BoxedInt] = js.undefined
    ): ResourceQuota = {
      val __obj = js.Dynamic.literal()
      Maximum.foreach(__v => __obj.updateDynamic("Maximum")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceQuota]
    }
  }

  /**
    * A set of per-resource AWS Elastic Beanstalk quotas associated with an AWS account. They reflect Elastic Beanstalk resource limits for this account.
    */
  @js.native
  trait ResourceQuotas extends js.Object {
    var ApplicationQuota: js.UndefOr[ResourceQuota]
    var ApplicationVersionQuota: js.UndefOr[ResourceQuota]
    var ConfigurationTemplateQuota: js.UndefOr[ResourceQuota]
    var CustomPlatformQuota: js.UndefOr[ResourceQuota]
    var EnvironmentQuota: js.UndefOr[ResourceQuota]
  }

  object ResourceQuotas {
    @inline
    def apply(
        ApplicationQuota: js.UndefOr[ResourceQuota] = js.undefined,
        ApplicationVersionQuota: js.UndefOr[ResourceQuota] = js.undefined,
        ConfigurationTemplateQuota: js.UndefOr[ResourceQuota] = js.undefined,
        CustomPlatformQuota: js.UndefOr[ResourceQuota] = js.undefined,
        EnvironmentQuota: js.UndefOr[ResourceQuota] = js.undefined
    ): ResourceQuotas = {
      val __obj = js.Dynamic.literal()
      ApplicationQuota.foreach(__v => __obj.updateDynamic("ApplicationQuota")(__v.asInstanceOf[js.Any]))
      ApplicationVersionQuota.foreach(__v => __obj.updateDynamic("ApplicationVersionQuota")(__v.asInstanceOf[js.Any]))
      ConfigurationTemplateQuota.foreach(__v =>
        __obj.updateDynamic("ConfigurationTemplateQuota")(__v.asInstanceOf[js.Any])
      )
      CustomPlatformQuota.foreach(__v => __obj.updateDynamic("CustomPlatformQuota")(__v.asInstanceOf[js.Any]))
      EnvironmentQuota.foreach(__v => __obj.updateDynamic("EnvironmentQuota")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceQuotas]
    }
  }

  @js.native
  trait ResourceTagsDescriptionMessage extends js.Object {
    var ResourceArn: js.UndefOr[ResourceArn]
    var ResourceTags: js.UndefOr[TagList]
  }

  object ResourceTagsDescriptionMessage {
    @inline
    def apply(
        ResourceArn: js.UndefOr[ResourceArn] = js.undefined,
        ResourceTags: js.UndefOr[TagList] = js.undefined
    ): ResourceTagsDescriptionMessage = {
      val __obj = js.Dynamic.literal()
      ResourceArn.foreach(__v => __obj.updateDynamic("ResourceArn")(__v.asInstanceOf[js.Any]))
      ResourceTags.foreach(__v => __obj.updateDynamic("ResourceTags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceTagsDescriptionMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait RestartAppServerMessage extends js.Object {
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var EnvironmentName: js.UndefOr[EnvironmentName]
  }

  object RestartAppServerMessage {
    @inline
    def apply(
        EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
        EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
    ): RestartAppServerMessage = {
      val __obj = js.Dynamic.literal()
      EnvironmentId.foreach(__v => __obj.updateDynamic("EnvironmentId")(__v.asInstanceOf[js.Any]))
      EnvironmentName.foreach(__v => __obj.updateDynamic("EnvironmentName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestartAppServerMessage]
    }
  }

  /**
    * Request to download logs retrieved with <a>RequestEnvironmentInfo</a>.
    */
  @js.native
  trait RetrieveEnvironmentInfoMessage extends js.Object {
    var InfoType: EnvironmentInfoType
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var EnvironmentName: js.UndefOr[EnvironmentName]
  }

  object RetrieveEnvironmentInfoMessage {
    @inline
    def apply(
        InfoType: EnvironmentInfoType,
        EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
        EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
    ): RetrieveEnvironmentInfoMessage = {
      val __obj = js.Dynamic.literal(
        "InfoType" -> InfoType.asInstanceOf[js.Any]
      )

      EnvironmentId.foreach(__v => __obj.updateDynamic("EnvironmentId")(__v.asInstanceOf[js.Any]))
      EnvironmentName.foreach(__v => __obj.updateDynamic("EnvironmentName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RetrieveEnvironmentInfoMessage]
    }
  }

  /**
    * Result message containing a description of the requested environment info.
    */
  @js.native
  trait RetrieveEnvironmentInfoResultMessage extends js.Object {
    var EnvironmentInfo: js.UndefOr[EnvironmentInfoDescriptionList]
  }

  object RetrieveEnvironmentInfoResultMessage {
    @inline
    def apply(
        EnvironmentInfo: js.UndefOr[EnvironmentInfoDescriptionList] = js.undefined
    ): RetrieveEnvironmentInfoResultMessage = {
      val __obj = js.Dynamic.literal()
      EnvironmentInfo.foreach(__v => __obj.updateDynamic("EnvironmentInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RetrieveEnvironmentInfoResultMessage]
    }
  }

  /**
    * The bucket and key of an item stored in Amazon S3.
    */
  @js.native
  trait S3Location extends js.Object {
    var S3Bucket: js.UndefOr[S3Bucket]
    var S3Key: js.UndefOr[S3Key]
  }

  object S3Location {
    @inline
    def apply(
        S3Bucket: js.UndefOr[S3Bucket] = js.undefined,
        S3Key: js.UndefOr[S3Key] = js.undefined
    ): S3Location = {
      val __obj = js.Dynamic.literal()
      S3Bucket.foreach(__v => __obj.updateDynamic("S3Bucket")(__v.asInstanceOf[js.Any]))
      S3Key.foreach(__v => __obj.updateDynamic("S3Key")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Location]
    }
  }

  /**
    * Detailed health information about an Amazon EC2 instance in your Elastic Beanstalk environment.
    */
  @js.native
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

  object SingleInstanceHealth {
    @inline
    def apply(
        ApplicationMetrics: js.UndefOr[ApplicationMetrics] = js.undefined,
        AvailabilityZone: js.UndefOr[String] = js.undefined,
        Causes: js.UndefOr[Causes] = js.undefined,
        Color: js.UndefOr[String] = js.undefined,
        Deployment: js.UndefOr[Deployment] = js.undefined,
        HealthStatus: js.UndefOr[String] = js.undefined,
        InstanceId: js.UndefOr[InstanceId] = js.undefined,
        InstanceType: js.UndefOr[String] = js.undefined,
        LaunchedAt: js.UndefOr[LaunchedAt] = js.undefined,
        System: js.UndefOr[SystemStatus] = js.undefined
    ): SingleInstanceHealth = {
      val __obj = js.Dynamic.literal()
      ApplicationMetrics.foreach(__v => __obj.updateDynamic("ApplicationMetrics")(__v.asInstanceOf[js.Any]))
      AvailabilityZone.foreach(__v => __obj.updateDynamic("AvailabilityZone")(__v.asInstanceOf[js.Any]))
      Causes.foreach(__v => __obj.updateDynamic("Causes")(__v.asInstanceOf[js.Any]))
      Color.foreach(__v => __obj.updateDynamic("Color")(__v.asInstanceOf[js.Any]))
      Deployment.foreach(__v => __obj.updateDynamic("Deployment")(__v.asInstanceOf[js.Any]))
      HealthStatus.foreach(__v => __obj.updateDynamic("HealthStatus")(__v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      LaunchedAt.foreach(__v => __obj.updateDynamic("LaunchedAt")(__v.asInstanceOf[js.Any]))
      System.foreach(__v => __obj.updateDynamic("System")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SingleInstanceHealth]
    }
  }

  /**
    * Describes the solution stack.
    */
  @js.native
  trait SolutionStackDescription extends js.Object {
    var PermittedFileTypes: js.UndefOr[SolutionStackFileTypeList]
    var SolutionStackName: js.UndefOr[SolutionStackName]
  }

  object SolutionStackDescription {
    @inline
    def apply(
        PermittedFileTypes: js.UndefOr[SolutionStackFileTypeList] = js.undefined,
        SolutionStackName: js.UndefOr[SolutionStackName] = js.undefined
    ): SolutionStackDescription = {
      val __obj = js.Dynamic.literal()
      PermittedFileTypes.foreach(__v => __obj.updateDynamic("PermittedFileTypes")(__v.asInstanceOf[js.Any]))
      SolutionStackName.foreach(__v => __obj.updateDynamic("SolutionStackName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SolutionStackDescription]
    }
  }

  /**
    * Location of the source code for an application version.
    */
  @js.native
  trait SourceBuildInformation extends js.Object {
    var SourceLocation: SourceLocation
    var SourceRepository: SourceRepository
    var SourceType: SourceType
  }

  object SourceBuildInformation {
    @inline
    def apply(
        SourceLocation: SourceLocation,
        SourceRepository: SourceRepository,
        SourceType: SourceType
    ): SourceBuildInformation = {
      val __obj = js.Dynamic.literal(
        "SourceLocation"   -> SourceLocation.asInstanceOf[js.Any],
        "SourceRepository" -> SourceRepository.asInstanceOf[js.Any],
        "SourceType"       -> SourceType.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[SourceBuildInformation]
    }
  }

  /**
    * A specification for an environment configuration
    */
  @js.native
  trait SourceConfiguration extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var TemplateName: js.UndefOr[ConfigurationTemplateName]
  }

  object SourceConfiguration {
    @inline
    def apply(
        ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
        TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined
    ): SourceConfiguration = {
      val __obj = js.Dynamic.literal()
      ApplicationName.foreach(__v => __obj.updateDynamic("ApplicationName")(__v.asInstanceOf[js.Any]))
      TemplateName.foreach(__v => __obj.updateDynamic("TemplateName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceConfiguration]
    }
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
  trait StatusCodes extends js.Object {
    var Status2xx: js.UndefOr[NullableInteger]
    var Status3xx: js.UndefOr[NullableInteger]
    var Status4xx: js.UndefOr[NullableInteger]
    var Status5xx: js.UndefOr[NullableInteger]
  }

  object StatusCodes {
    @inline
    def apply(
        Status2xx: js.UndefOr[NullableInteger] = js.undefined,
        Status3xx: js.UndefOr[NullableInteger] = js.undefined,
        Status4xx: js.UndefOr[NullableInteger] = js.undefined,
        Status5xx: js.UndefOr[NullableInteger] = js.undefined
    ): StatusCodes = {
      val __obj = js.Dynamic.literal()
      Status2xx.foreach(__v => __obj.updateDynamic("Status2xx")(__v.asInstanceOf[js.Any]))
      Status3xx.foreach(__v => __obj.updateDynamic("Status3xx")(__v.asInstanceOf[js.Any]))
      Status4xx.foreach(__v => __obj.updateDynamic("Status4xx")(__v.asInstanceOf[js.Any]))
      Status5xx.foreach(__v => __obj.updateDynamic("Status5xx")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StatusCodes]
    }
  }

  /**
    * Swaps the CNAMEs of two environments.
    */
  @js.native
  trait SwapEnvironmentCNAMEsMessage extends js.Object {
    var DestinationEnvironmentId: js.UndefOr[EnvironmentId]
    var DestinationEnvironmentName: js.UndefOr[EnvironmentName]
    var SourceEnvironmentId: js.UndefOr[EnvironmentId]
    var SourceEnvironmentName: js.UndefOr[EnvironmentName]
  }

  object SwapEnvironmentCNAMEsMessage {
    @inline
    def apply(
        DestinationEnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
        DestinationEnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
        SourceEnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
        SourceEnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
    ): SwapEnvironmentCNAMEsMessage = {
      val __obj = js.Dynamic.literal()
      DestinationEnvironmentId.foreach(__v => __obj.updateDynamic("DestinationEnvironmentId")(__v.asInstanceOf[js.Any]))
      DestinationEnvironmentName.foreach(__v =>
        __obj.updateDynamic("DestinationEnvironmentName")(__v.asInstanceOf[js.Any])
      )
      SourceEnvironmentId.foreach(__v => __obj.updateDynamic("SourceEnvironmentId")(__v.asInstanceOf[js.Any]))
      SourceEnvironmentName.foreach(__v => __obj.updateDynamic("SourceEnvironmentName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SwapEnvironmentCNAMEsMessage]
    }
  }

  /**
    * CPU utilization and load average metrics for an Amazon EC2 instance.
    */
  @js.native
  trait SystemStatus extends js.Object {
    var CPUUtilization: js.UndefOr[CPUUtilization]
    var LoadAverage: js.UndefOr[LoadAverage]
  }

  object SystemStatus {
    @inline
    def apply(
        CPUUtilization: js.UndefOr[CPUUtilization] = js.undefined,
        LoadAverage: js.UndefOr[LoadAverage] = js.undefined
    ): SystemStatus = {
      val __obj = js.Dynamic.literal()
      CPUUtilization.foreach(__v => __obj.updateDynamic("CPUUtilization")(__v.asInstanceOf[js.Any]))
      LoadAverage.foreach(__v => __obj.updateDynamic("LoadAverage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SystemStatus]
    }
  }

  /**
    * Describes a tag applied to a resource in an environment.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[TagKey]
    var Value: js.UndefOr[TagValue]
  }

  object Tag {
    @inline
    def apply(
        Key: js.UndefOr[TagKey] = js.undefined,
        Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal()
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  /**
    * Request to terminate an environment.
    */
  @js.native
  trait TerminateEnvironmentMessage extends js.Object {
    var EnvironmentId: js.UndefOr[EnvironmentId]
    var EnvironmentName: js.UndefOr[EnvironmentName]
    var ForceTerminate: js.UndefOr[ForceTerminate]
    var TerminateResources: js.UndefOr[TerminateEnvironmentResources]
  }

  object TerminateEnvironmentMessage {
    @inline
    def apply(
        EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
        EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
        ForceTerminate: js.UndefOr[ForceTerminate] = js.undefined,
        TerminateResources: js.UndefOr[TerminateEnvironmentResources] = js.undefined
    ): TerminateEnvironmentMessage = {
      val __obj = js.Dynamic.literal()
      EnvironmentId.foreach(__v => __obj.updateDynamic("EnvironmentId")(__v.asInstanceOf[js.Any]))
      EnvironmentName.foreach(__v => __obj.updateDynamic("EnvironmentName")(__v.asInstanceOf[js.Any]))
      ForceTerminate.foreach(__v => __obj.updateDynamic("ForceTerminate")(__v.asInstanceOf[js.Any]))
      TerminateResources.foreach(__v => __obj.updateDynamic("TerminateResources")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TerminateEnvironmentMessage]
    }
  }

  /**
    * Describes a trigger.
    */
  @js.native
  trait Trigger extends js.Object {
    var Name: js.UndefOr[ResourceId]
  }

  object Trigger {
    @inline
    def apply(
        Name: js.UndefOr[ResourceId] = js.undefined
    ): Trigger = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Trigger]
    }
  }

  /**
    * Request to update an application.
    */
  @js.native
  trait UpdateApplicationMessage extends js.Object {
    var ApplicationName: ApplicationName
    var Description: js.UndefOr[Description]
  }

  object UpdateApplicationMessage {
    @inline
    def apply(
        ApplicationName: ApplicationName,
        Description: js.UndefOr[Description] = js.undefined
    ): UpdateApplicationMessage = {
      val __obj = js.Dynamic.literal(
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApplicationMessage]
    }
  }

  @js.native
  trait UpdateApplicationResourceLifecycleMessage extends js.Object {
    var ApplicationName: ApplicationName
    var ResourceLifecycleConfig: ApplicationResourceLifecycleConfig
  }

  object UpdateApplicationResourceLifecycleMessage {
    @inline
    def apply(
        ApplicationName: ApplicationName,
        ResourceLifecycleConfig: ApplicationResourceLifecycleConfig
    ): UpdateApplicationResourceLifecycleMessage = {
      val __obj = js.Dynamic.literal(
        "ApplicationName"         -> ApplicationName.asInstanceOf[js.Any],
        "ResourceLifecycleConfig" -> ResourceLifecycleConfig.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateApplicationResourceLifecycleMessage]
    }
  }

  /**
    * <p/>
    */
  @js.native
  trait UpdateApplicationVersionMessage extends js.Object {
    var ApplicationName: ApplicationName
    var VersionLabel: VersionLabel
    var Description: js.UndefOr[Description]
  }

  object UpdateApplicationVersionMessage {
    @inline
    def apply(
        ApplicationName: ApplicationName,
        VersionLabel: VersionLabel,
        Description: js.UndefOr[Description] = js.undefined
    ): UpdateApplicationVersionMessage = {
      val __obj = js.Dynamic.literal(
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "VersionLabel"    -> VersionLabel.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApplicationVersionMessage]
    }
  }

  /**
    * The result message containing the options for the specified solution stack.
    */
  @js.native
  trait UpdateConfigurationTemplateMessage extends js.Object {
    var ApplicationName: ApplicationName
    var TemplateName: ConfigurationTemplateName
    var Description: js.UndefOr[Description]
    var OptionSettings: js.UndefOr[ConfigurationOptionSettingsList]
    var OptionsToRemove: js.UndefOr[OptionsSpecifierList]
  }

  object UpdateConfigurationTemplateMessage {
    @inline
    def apply(
        ApplicationName: ApplicationName,
        TemplateName: ConfigurationTemplateName,
        Description: js.UndefOr[Description] = js.undefined,
        OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.undefined,
        OptionsToRemove: js.UndefOr[OptionsSpecifierList] = js.undefined
    ): UpdateConfigurationTemplateMessage = {
      val __obj = js.Dynamic.literal(
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "TemplateName"    -> TemplateName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      OptionSettings.foreach(__v => __obj.updateDynamic("OptionSettings")(__v.asInstanceOf[js.Any]))
      OptionsToRemove.foreach(__v => __obj.updateDynamic("OptionsToRemove")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateConfigurationTemplateMessage]
    }
  }

  /**
    * Request to update an environment.
    */
  @js.native
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

  object UpdateEnvironmentMessage {
    @inline
    def apply(
        ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
        EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
        GroupName: js.UndefOr[GroupName] = js.undefined,
        OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.undefined,
        OptionsToRemove: js.UndefOr[OptionsSpecifierList] = js.undefined,
        PlatformArn: js.UndefOr[PlatformArn] = js.undefined,
        SolutionStackName: js.UndefOr[SolutionStackName] = js.undefined,
        TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined,
        Tier: js.UndefOr[EnvironmentTier] = js.undefined,
        VersionLabel: js.UndefOr[VersionLabel] = js.undefined
    ): UpdateEnvironmentMessage = {
      val __obj = js.Dynamic.literal()
      ApplicationName.foreach(__v => __obj.updateDynamic("ApplicationName")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EnvironmentId.foreach(__v => __obj.updateDynamic("EnvironmentId")(__v.asInstanceOf[js.Any]))
      EnvironmentName.foreach(__v => __obj.updateDynamic("EnvironmentName")(__v.asInstanceOf[js.Any]))
      GroupName.foreach(__v => __obj.updateDynamic("GroupName")(__v.asInstanceOf[js.Any]))
      OptionSettings.foreach(__v => __obj.updateDynamic("OptionSettings")(__v.asInstanceOf[js.Any]))
      OptionsToRemove.foreach(__v => __obj.updateDynamic("OptionsToRemove")(__v.asInstanceOf[js.Any]))
      PlatformArn.foreach(__v => __obj.updateDynamic("PlatformArn")(__v.asInstanceOf[js.Any]))
      SolutionStackName.foreach(__v => __obj.updateDynamic("SolutionStackName")(__v.asInstanceOf[js.Any]))
      TemplateName.foreach(__v => __obj.updateDynamic("TemplateName")(__v.asInstanceOf[js.Any]))
      Tier.foreach(__v => __obj.updateDynamic("Tier")(__v.asInstanceOf[js.Any]))
      VersionLabel.foreach(__v => __obj.updateDynamic("VersionLabel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEnvironmentMessage]
    }
  }

  @js.native
  trait UpdateTagsForResourceMessage extends js.Object {
    var ResourceArn: ResourceArn
    var TagsToAdd: js.UndefOr[TagList]
    var TagsToRemove: js.UndefOr[TagKeyList]
  }

  object UpdateTagsForResourceMessage {
    @inline
    def apply(
        ResourceArn: ResourceArn,
        TagsToAdd: js.UndefOr[TagList] = js.undefined,
        TagsToRemove: js.UndefOr[TagKeyList] = js.undefined
    ): UpdateTagsForResourceMessage = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      TagsToAdd.foreach(__v => __obj.updateDynamic("TagsToAdd")(__v.asInstanceOf[js.Any]))
      TagsToRemove.foreach(__v => __obj.updateDynamic("TagsToRemove")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTagsForResourceMessage]
    }
  }

  /**
    * A list of validation messages for a specified configuration template.
    */
  @js.native
  trait ValidateConfigurationSettingsMessage extends js.Object {
    var ApplicationName: ApplicationName
    var OptionSettings: ConfigurationOptionSettingsList
    var EnvironmentName: js.UndefOr[EnvironmentName]
    var TemplateName: js.UndefOr[ConfigurationTemplateName]
  }

  object ValidateConfigurationSettingsMessage {
    @inline
    def apply(
        ApplicationName: ApplicationName,
        OptionSettings: ConfigurationOptionSettingsList,
        EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
        TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined
    ): ValidateConfigurationSettingsMessage = {
      val __obj = js.Dynamic.literal(
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "OptionSettings"  -> OptionSettings.asInstanceOf[js.Any]
      )

      EnvironmentName.foreach(__v => __obj.updateDynamic("EnvironmentName")(__v.asInstanceOf[js.Any]))
      TemplateName.foreach(__v => __obj.updateDynamic("TemplateName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ValidateConfigurationSettingsMessage]
    }
  }

  /**
    * An error or warning for a desired configuration option value.
    */
  @js.native
  trait ValidationMessage extends js.Object {
    var Message: js.UndefOr[ValidationMessageString]
    var Namespace: js.UndefOr[OptionNamespace]
    var OptionName: js.UndefOr[ConfigurationOptionName]
    var Severity: js.UndefOr[ValidationSeverity]
  }

  object ValidationMessage {
    @inline
    def apply(
        Message: js.UndefOr[ValidationMessageString] = js.undefined,
        Namespace: js.UndefOr[OptionNamespace] = js.undefined,
        OptionName: js.UndefOr[ConfigurationOptionName] = js.undefined,
        Severity: js.UndefOr[ValidationSeverity] = js.undefined
    ): ValidationMessage = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      OptionName.foreach(__v => __obj.updateDynamic("OptionName")(__v.asInstanceOf[js.Any]))
      Severity.foreach(__v => __obj.updateDynamic("Severity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ValidationMessage]
    }
  }

  @js.native
  sealed trait ValidationSeverity extends js.Any
  object ValidationSeverity extends js.Object {
    val error   = "error".asInstanceOf[ValidationSeverity]
    val warning = "warning".asInstanceOf[ValidationSeverity]

    val values = js.Object.freeze(js.Array(error, warning))
  }
}
