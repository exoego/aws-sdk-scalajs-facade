package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object elasticbeanstalk {
  type ARN                                  = String
  type AbortableOperationInProgress         = Boolean
  type ActionHistoryStatus                  = String
  type ActionStatus                         = String
  type ActionType                           = String
  type ApplicationArn                       = String
  type ApplicationDescriptionList           = js.Array[ApplicationDescription]
  type ApplicationName                      = String
  type ApplicationNamesList                 = js.Array[ApplicationName]
  type ApplicationVersionArn                = String
  type ApplicationVersionDescriptionList    = js.Array[ApplicationVersionDescription]
  type ApplicationVersionProccess           = Boolean
  type ApplicationVersionStatus             = String
  type AutoCreateApplication                = Boolean
  type AutoScalingGroupList                 = js.Array[AutoScalingGroup]
  type AvailableSolutionStackDetailsList    = js.Array[SolutionStackDescription]
  type AvailableSolutionStackNamesList      = js.Array[SolutionStackName]
  type BoxedBoolean                         = Boolean
  type BoxedInt                             = Int
  type Cause                                = String
  type Causes                               = js.Array[Cause]
  type CnameAvailability                    = Boolean
  type ComputeType                          = String
  type ConfigurationDeploymentStatus        = String
  type ConfigurationOptionDefaultValue      = String
  type ConfigurationOptionDescriptionsList  = js.Array[ConfigurationOptionDescription]
  type ConfigurationOptionName              = String
  type ConfigurationOptionPossibleValue     = String
  type ConfigurationOptionPossibleValues    = js.Array[ConfigurationOptionPossibleValue]
  type ConfigurationOptionSettingsList      = js.Array[ConfigurationOptionSetting]
  type ConfigurationOptionSeverity          = String
  type ConfigurationOptionValue             = String
  type ConfigurationOptionValueType         = String
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
  type EnvironmentHealth                    = String
  type EnvironmentHealthAttribute           = String
  type EnvironmentHealthAttributes          = js.Array[EnvironmentHealthAttribute]
  type EnvironmentHealthStatus              = String
  type EnvironmentId                        = String
  type EnvironmentIdList                    = js.Array[EnvironmentId]
  type EnvironmentInfoDescriptionList       = js.Array[EnvironmentInfoDescription]
  type EnvironmentInfoType                  = String
  type EnvironmentLinks                     = js.Array[EnvironmentLink]
  type EnvironmentName                      = String
  type EnvironmentNamesList                 = js.Array[EnvironmentName]
  type EnvironmentStatus                    = String
  type EventDate                            = js.Date
  type EventDescriptionList                 = js.Array[EventDescription]
  type EventMessage                         = String
  type EventSeverity                        = String
  type FailureType                          = String
  type FileTypeExtension                    = String
  type ForceTerminate                       = Boolean
  type GroupName                            = String
  type ImageId                              = String
  type IncludeDeleted                       = Boolean
  type IncludeDeletedBackTo                 = js.Date
  type InstanceHealthList                   = js.Array[SingleInstanceHealth]
  type InstanceId                           = String
  type InstanceList                         = js.Array[Instance]
  type InstancesHealthAttribute             = String
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
  type PlatformStatus                       = String
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
  type SourceRepository                     = String
  type SourceType                           = String
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
  type ValidationSeverity                   = String
  type VersionLabel                         = String
  type VersionLabels                        = js.Array[VersionLabel]
  type VersionLabelsList                    = js.Array[VersionLabel]
  type VirtualizationType                   = String
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
    def apply(EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
              EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined): AbortEnvironmentUpdateMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("EnvironmentId" -> EnvironmentId.map { x =>
        x.asInstanceOf[js.Any]
      }, "EnvironmentName" -> EnvironmentName.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AbortEnvironmentUpdateMessage]
    }
  }

  object ActionHistoryStatusEnum {
    val Completed = "Completed"
    val Failed    = "Failed"
    val Unknown   = "Unknown"

    val values = IndexedSeq(Completed, Failed, Unknown)
  }

  object ActionStatusEnum {
    val Scheduled = "Scheduled"
    val Pending   = "Pending"
    val Running   = "Running"
    val Unknown   = "Unknown"

    val values = IndexedSeq(Scheduled, Pending, Running, Unknown)
  }

  object ActionTypeEnum {
    val InstanceRefresh = "InstanceRefresh"
    val PlatformUpdate  = "PlatformUpdate"
    val Unknown         = "Unknown"

    val values = IndexedSeq(InstanceRefresh, PlatformUpdate, Unknown)
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
    def apply(ApplicationArn: js.UndefOr[ApplicationArn] = js.undefined,
              ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
              ConfigurationTemplates: js.UndefOr[ConfigurationTemplateNamesList] = js.undefined,
              DateCreated: js.UndefOr[CreationDate] = js.undefined,
              DateUpdated: js.UndefOr[UpdateDate] = js.undefined,
              Description: js.UndefOr[Description] = js.undefined,
              ResourceLifecycleConfig: js.UndefOr[ApplicationResourceLifecycleConfig] = js.undefined,
              Versions: js.UndefOr[VersionLabelsList] = js.undefined): ApplicationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationArn" -> ApplicationArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ApplicationName" -> ApplicationName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConfigurationTemplates" -> ConfigurationTemplates.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DateCreated" -> DateCreated.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DateUpdated" -> DateUpdated.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceLifecycleConfig" -> ResourceLifecycleConfig.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Versions" -> Versions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationDescription]
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
    def apply(Application: js.UndefOr[ApplicationDescription] = js.undefined): ApplicationDescriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("Application" -> Application.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationDescriptionMessage]
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
    def apply(Applications: js.UndefOr[ApplicationDescriptionList] = js.undefined): ApplicationDescriptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("Applications" -> Applications.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationDescriptionsMessage]
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
    def apply(Duration: js.UndefOr[NullableInteger] = js.undefined,
              Latency: js.UndefOr[Latency] = js.undefined,
              RequestCount: js.UndefOr[RequestCount] = js.undefined,
              StatusCodes: js.UndefOr[StatusCodes] = js.undefined): ApplicationMetrics = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Duration" -> Duration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Latency" -> Latency.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RequestCount" -> RequestCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StatusCodes" -> StatusCodes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationMetrics]
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
    def apply(
        ServiceRole: js.UndefOr[String] = js.undefined,
        VersionLifecycleConfig: js.UndefOr[ApplicationVersionLifecycleConfig] = js.undefined
    ): ApplicationResourceLifecycleConfig = {
      val _fields = IndexedSeq[(String, js.Any)]("ServiceRole" -> ServiceRole.map { x =>
        x.asInstanceOf[js.Any]
      }, "VersionLifecycleConfig" -> VersionLifecycleConfig.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationResourceLifecycleConfig]
    }
  }

  @js.native
  trait ApplicationResourceLifecycleDescriptionMessage extends js.Object {
    var ApplicationName: js.UndefOr[ApplicationName]
    var ResourceLifecycleConfig: js.UndefOr[ApplicationResourceLifecycleConfig]
  }

  object ApplicationResourceLifecycleDescriptionMessage {
    def apply(
        ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
        ResourceLifecycleConfig: js.UndefOr[ApplicationResourceLifecycleConfig] = js.undefined
    ): ApplicationResourceLifecycleDescriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("ApplicationName" -> ApplicationName.map { x =>
        x.asInstanceOf[js.Any]
      }, "ResourceLifecycleConfig" -> ResourceLifecycleConfig.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[ApplicationResourceLifecycleDescriptionMessage]
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
    def apply(ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
              ApplicationVersionArn: js.UndefOr[ApplicationVersionArn] = js.undefined,
              BuildArn: js.UndefOr[String] = js.undefined,
              DateCreated: js.UndefOr[CreationDate] = js.undefined,
              DateUpdated: js.UndefOr[UpdateDate] = js.undefined,
              Description: js.UndefOr[Description] = js.undefined,
              SourceBuildInformation: js.UndefOr[SourceBuildInformation] = js.undefined,
              SourceBundle: js.UndefOr[S3Location] = js.undefined,
              Status: js.UndefOr[ApplicationVersionStatus] = js.undefined,
              VersionLabel: js.UndefOr[VersionLabel] = js.undefined): ApplicationVersionDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ApplicationVersionArn" -> ApplicationVersionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BuildArn" -> BuildArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DateCreated" -> DateCreated.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DateUpdated" -> DateUpdated.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceBuildInformation" -> SourceBuildInformation.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceBundle" -> SourceBundle.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VersionLabel" -> VersionLabel.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationVersionDescription]
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
    def apply(
        ApplicationVersion: js.UndefOr[ApplicationVersionDescription] = js.undefined
    ): ApplicationVersionDescriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("ApplicationVersion" -> ApplicationVersion.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationVersionDescriptionMessage]
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
    def apply(ApplicationVersions: js.UndefOr[ApplicationVersionDescriptionList] = js.undefined,
              NextToken: js.UndefOr[Token] = js.undefined): ApplicationVersionDescriptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("ApplicationVersions" -> ApplicationVersions.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationVersionDescriptionsMessage]
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
    def apply(MaxAgeRule: js.UndefOr[MaxAgeRule] = js.undefined,
              MaxCountRule: js.UndefOr[MaxCountRule] = js.undefined): ApplicationVersionLifecycleConfig = {
      val _fields = IndexedSeq[(String, js.Any)]("MaxAgeRule" -> MaxAgeRule.map { x =>
        x.asInstanceOf[js.Any]
      }, "MaxCountRule" -> MaxCountRule.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationVersionLifecycleConfig]
    }
  }

  object ApplicationVersionStatusEnum {
    val Processed   = "Processed"
    val Unprocessed = "Unprocessed"
    val Failed      = "Failed"
    val Processing  = "Processing"
    val Building    = "Building"

    val values = IndexedSeq(Processed, Unprocessed, Failed, Processing, Building)
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
    def apply(ActionId: String,
              EnvironmentId: js.UndefOr[String] = js.undefined,
              EnvironmentName: js.UndefOr[String] = js.undefined): ApplyEnvironmentManagedActionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActionId" -> ActionId.asInstanceOf[js.Any],
        "EnvironmentId" -> EnvironmentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnvironmentName" -> EnvironmentName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplyEnvironmentManagedActionRequest]
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
    def apply(ActionDescription: js.UndefOr[String] = js.undefined,
              ActionId: js.UndefOr[String] = js.undefined,
              ActionType: js.UndefOr[ActionType] = js.undefined,
              Status: js.UndefOr[String] = js.undefined): ApplyEnvironmentManagedActionResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActionDescription" -> ActionDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ActionId" -> ActionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ActionType" -> ActionType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplyEnvironmentManagedActionResult]
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
    def apply(Name: js.UndefOr[ResourceId] = js.undefined): AutoScalingGroup = {
      val _fields = IndexedSeq[(String, js.Any)]("Name" -> Name.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoScalingGroup]
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
    def apply(CodeBuildServiceRole: NonEmptyString,
              Image: NonEmptyString,
              ArtifactName: js.UndefOr[String] = js.undefined,
              ComputeType: js.UndefOr[ComputeType] = js.undefined,
              TimeoutInMinutes: js.UndefOr[BoxedInt] = js.undefined): BuildConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CodeBuildServiceRole" -> CodeBuildServiceRole.asInstanceOf[js.Any],
        "Image"                -> Image.asInstanceOf[js.Any],
        "ArtifactName" -> ArtifactName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ComputeType" -> ComputeType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimeoutInMinutes" -> TimeoutInMinutes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BuildConfiguration]
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
    def apply(ARN: js.UndefOr[ARN] = js.undefined): Builder = {
      val _fields = IndexedSeq[(String, js.Any)]("ARN" -> ARN.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Builder]
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
    def apply(IOWait: js.UndefOr[NullableDouble] = js.undefined,
              IRQ: js.UndefOr[NullableDouble] = js.undefined,
              Idle: js.UndefOr[NullableDouble] = js.undefined,
              Nice: js.UndefOr[NullableDouble] = js.undefined,
              Privileged: js.UndefOr[NullableDouble] = js.undefined,
              SoftIRQ: js.UndefOr[NullableDouble] = js.undefined,
              System: js.UndefOr[NullableDouble] = js.undefined,
              User: js.UndefOr[NullableDouble] = js.undefined): CPUUtilization = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IOWait" -> IOWait.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IRQ" -> IRQ.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Idle" -> Idle.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Nice" -> Nice.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Privileged" -> Privileged.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SoftIRQ" -> SoftIRQ.map { x =>
          x.asInstanceOf[js.Any]
        },
        "System" -> System.map { x =>
          x.asInstanceOf[js.Any]
        },
        "User" -> User.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CPUUtilization]
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
    def apply(CNAMEPrefix: DNSCnamePrefix): CheckDNSAvailabilityMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("CNAMEPrefix" -> CNAMEPrefix.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CheckDNSAvailabilityMessage]
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
    def apply(Available: js.UndefOr[CnameAvailability] = js.undefined,
              FullyQualifiedCNAME: js.UndefOr[DNSCname] = js.undefined): CheckDNSAvailabilityResultMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("Available" -> Available.map { x =>
        x.asInstanceOf[js.Any]
      }, "FullyQualifiedCNAME" -> FullyQualifiedCNAME.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CheckDNSAvailabilityResultMessage]
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
    def apply(ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
              GroupName: js.UndefOr[GroupName] = js.undefined,
              VersionLabels: js.UndefOr[VersionLabels] = js.undefined): ComposeEnvironmentsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GroupName" -> GroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VersionLabels" -> VersionLabels.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ComposeEnvironmentsMessage]
    }
  }

  object ComputeTypeEnum {
    val BUILD_GENERAL1_SMALL  = "BUILD_GENERAL1_SMALL"
    val BUILD_GENERAL1_MEDIUM = "BUILD_GENERAL1_MEDIUM"
    val BUILD_GENERAL1_LARGE  = "BUILD_GENERAL1_LARGE"

    val values = IndexedSeq(BUILD_GENERAL1_SMALL, BUILD_GENERAL1_MEDIUM, BUILD_GENERAL1_LARGE)
  }

  object ConfigurationDeploymentStatusEnum {
    val deployed = "deployed"
    val pending  = "pending"
    val failed   = "failed"

    val values = IndexedSeq(deployed, pending, failed)
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
    def apply(ChangeSeverity: js.UndefOr[ConfigurationOptionSeverity] = js.undefined,
              DefaultValue: js.UndefOr[ConfigurationOptionDefaultValue] = js.undefined,
              MaxLength: js.UndefOr[OptionRestrictionMaxLength] = js.undefined,
              MaxValue: js.UndefOr[OptionRestrictionMaxValue] = js.undefined,
              MinValue: js.UndefOr[OptionRestrictionMinValue] = js.undefined,
              Name: js.UndefOr[ConfigurationOptionName] = js.undefined,
              Namespace: js.UndefOr[OptionNamespace] = js.undefined,
              Regex: js.UndefOr[OptionRestrictionRegex] = js.undefined,
              UserDefined: js.UndefOr[UserDefinedOption] = js.undefined,
              ValueOptions: js.UndefOr[ConfigurationOptionPossibleValues] = js.undefined,
              ValueType: js.UndefOr[ConfigurationOptionValueType] = js.undefined): ConfigurationOptionDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ChangeSeverity" -> ChangeSeverity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DefaultValue" -> DefaultValue.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxLength" -> MaxLength.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxValue" -> MaxValue.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MinValue" -> MinValue.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Namespace" -> Namespace.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Regex" -> Regex.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserDefined" -> UserDefined.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ValueOptions" -> ValueOptions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ValueType" -> ValueType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigurationOptionDescription]
    }
  }

  /**
    * A specification identifying an individual configuration option along with its current value. For a list of possible option values, go to [[http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options.html|Option Values]] in the <i>AWS Elastic Beanstalk Developer Guide</i>.
    */
  @js.native
  trait ConfigurationOptionSetting extends js.Object {
    var Namespace: js.UndefOr[OptionNamespace]
    var OptionName: js.UndefOr[ConfigurationOptionName]
    var ResourceName: js.UndefOr[ResourceName]
    var Value: js.UndefOr[ConfigurationOptionValue]
  }

  object ConfigurationOptionSetting {
    def apply(Namespace: js.UndefOr[OptionNamespace] = js.undefined,
              OptionName: js.UndefOr[ConfigurationOptionName] = js.undefined,
              ResourceName: js.UndefOr[ResourceName] = js.undefined,
              Value: js.UndefOr[ConfigurationOptionValue] = js.undefined): ConfigurationOptionSetting = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Namespace" -> Namespace.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionName" -> OptionName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceName" -> ResourceName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Value" -> Value.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigurationOptionSetting]
    }
  }

  object ConfigurationOptionValueTypeEnum {
    val Scalar = "Scalar"
    val List   = "List"

    val values = IndexedSeq(Scalar, List)
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
    def apply(Options: js.UndefOr[ConfigurationOptionDescriptionsList] = js.undefined,
              PlatformArn: js.UndefOr[PlatformArn] = js.undefined,
              SolutionStackName: js.UndefOr[SolutionStackName] = js.undefined): ConfigurationOptionsDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Options" -> Options.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlatformArn" -> PlatformArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SolutionStackName" -> SolutionStackName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigurationOptionsDescription]
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
    def apply(ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
              DateCreated: js.UndefOr[CreationDate] = js.undefined,
              DateUpdated: js.UndefOr[UpdateDate] = js.undefined,
              DeploymentStatus: js.UndefOr[ConfigurationDeploymentStatus] = js.undefined,
              Description: js.UndefOr[Description] = js.undefined,
              EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
              OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.undefined,
              PlatformArn: js.UndefOr[PlatformArn] = js.undefined,
              SolutionStackName: js.UndefOr[SolutionStackName] = js.undefined,
              TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined): ConfigurationSettingsDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DateCreated" -> DateCreated.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DateUpdated" -> DateUpdated.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeploymentStatus" -> DeploymentStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnvironmentName" -> EnvironmentName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionSettings" -> OptionSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlatformArn" -> PlatformArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SolutionStackName" -> SolutionStackName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TemplateName" -> TemplateName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigurationSettingsDescription]
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
    def apply(
        ConfigurationSettings: js.UndefOr[ConfigurationSettingsDescriptionList] = js.undefined
    ): ConfigurationSettingsDescriptions = {
      val _fields = IndexedSeq[(String, js.Any)]("ConfigurationSettings" -> ConfigurationSettings.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigurationSettingsDescriptions]
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
    def apply(Messages: js.UndefOr[ValidationMessagesList] = js.undefined): ConfigurationSettingsValidationMessages = {
      val _fields = IndexedSeq[(String, js.Any)]("Messages" -> Messages.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigurationSettingsValidationMessages]
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
  }

  object CreateApplicationMessage {
    def apply(
        ApplicationName: ApplicationName,
        Description: js.UndefOr[Description] = js.undefined,
        ResourceLifecycleConfig: js.UndefOr[ApplicationResourceLifecycleConfig] = js.undefined
    ): CreateApplicationMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceLifecycleConfig" -> ResourceLifecycleConfig.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateApplicationMessage]
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
  }

  object CreateApplicationVersionMessage {
    def apply(ApplicationName: ApplicationName,
              VersionLabel: VersionLabel,
              AutoCreateApplication: js.UndefOr[AutoCreateApplication] = js.undefined,
              BuildConfiguration: js.UndefOr[BuildConfiguration] = js.undefined,
              Description: js.UndefOr[Description] = js.undefined,
              Process: js.UndefOr[ApplicationVersionProccess] = js.undefined,
              SourceBuildInformation: js.UndefOr[SourceBuildInformation] = js.undefined,
              SourceBundle: js.UndefOr[S3Location] = js.undefined): CreateApplicationVersionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "VersionLabel"    -> VersionLabel.asInstanceOf[js.Any],
        "AutoCreateApplication" -> AutoCreateApplication.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BuildConfiguration" -> BuildConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Process" -> Process.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceBuildInformation" -> SourceBuildInformation.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceBundle" -> SourceBundle.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateApplicationVersionMessage]
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
  }

  object CreateConfigurationTemplateMessage {
    def apply(
        ApplicationName: ApplicationName,
        TemplateName: ConfigurationTemplateName,
        Description: js.UndefOr[Description] = js.undefined,
        EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
        OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.undefined,
        PlatformArn: js.UndefOr[PlatformArn] = js.undefined,
        SolutionStackName: js.UndefOr[SolutionStackName] = js.undefined,
        SourceConfiguration: js.UndefOr[SourceConfiguration] = js.undefined
    ): CreateConfigurationTemplateMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "TemplateName"    -> TemplateName.asInstanceOf[js.Any],
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnvironmentId" -> EnvironmentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionSettings" -> OptionSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlatformArn" -> PlatformArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SolutionStackName" -> SolutionStackName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceConfiguration" -> SourceConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateConfigurationTemplateMessage]
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
    def apply(ApplicationName: ApplicationName,
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
              VersionLabel: js.UndefOr[VersionLabel] = js.undefined): CreateEnvironmentMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "CNAMEPrefix" -> CNAMEPrefix.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnvironmentName" -> EnvironmentName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GroupName" -> GroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionSettings" -> OptionSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionsToRemove" -> OptionsToRemove.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlatformArn" -> PlatformArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SolutionStackName" -> SolutionStackName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TemplateName" -> TemplateName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tier" -> Tier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VersionLabel" -> VersionLabel.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEnvironmentMessage]
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
  }

  object CreatePlatformVersionRequest {
    def apply(
        PlatformDefinitionBundle: S3Location,
        PlatformName: PlatformName,
        PlatformVersion: PlatformVersion,
        EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
        OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.undefined
    ): CreatePlatformVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PlatformDefinitionBundle" -> PlatformDefinitionBundle.asInstanceOf[js.Any],
        "PlatformName"             -> PlatformName.asInstanceOf[js.Any],
        "PlatformVersion"          -> PlatformVersion.asInstanceOf[js.Any],
        "EnvironmentName" -> EnvironmentName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionSettings" -> OptionSettings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePlatformVersionRequest]
    }
  }

  @js.native
  trait CreatePlatformVersionResult extends js.Object {
    var Builder: js.UndefOr[Builder]
    var PlatformSummary: js.UndefOr[PlatformSummary]
  }

  object CreatePlatformVersionResult {
    def apply(Builder: js.UndefOr[Builder] = js.undefined,
              PlatformSummary: js.UndefOr[PlatformSummary] = js.undefined): CreatePlatformVersionResult = {
      val _fields = IndexedSeq[(String, js.Any)]("Builder" -> Builder.map { x =>
        x.asInstanceOf[js.Any]
      }, "PlatformSummary" -> PlatformSummary.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePlatformVersionResult]
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
    def apply(S3Bucket: js.UndefOr[S3Bucket] = js.undefined): CreateStorageLocationResultMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("S3Bucket" -> S3Bucket.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStorageLocationResultMessage]
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
    def apply(ImageId: js.UndefOr[ImageId] = js.undefined,
              VirtualizationType: js.UndefOr[VirtualizationType] = js.undefined): CustomAmi = {
      val _fields = IndexedSeq[(String, js.Any)]("ImageId" -> ImageId.map { x =>
        x.asInstanceOf[js.Any]
      }, "VirtualizationType" -> VirtualizationType.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CustomAmi]
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
    def apply(ApplicationName: ApplicationName,
              TerminateEnvByForce: js.UndefOr[TerminateEnvForce] = js.undefined): DeleteApplicationMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "TerminateEnvByForce" -> TerminateEnvByForce.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApplicationMessage]
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
    def apply(ApplicationName: ApplicationName,
              VersionLabel: VersionLabel,
              DeleteSourceBundle: js.UndefOr[DeleteSourceBundle] = js.undefined): DeleteApplicationVersionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "VersionLabel"    -> VersionLabel.asInstanceOf[js.Any],
        "DeleteSourceBundle" -> DeleteSourceBundle.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApplicationVersionMessage]
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
    def apply(ApplicationName: ApplicationName,
              TemplateName: ConfigurationTemplateName): DeleteConfigurationTemplateMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "TemplateName"    -> TemplateName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConfigurationTemplateMessage]
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
    def apply(ApplicationName: ApplicationName,
              EnvironmentName: EnvironmentName): DeleteEnvironmentConfigurationMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "EnvironmentName" -> EnvironmentName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEnvironmentConfigurationMessage]
    }
  }

  @js.native
  trait DeletePlatformVersionRequest extends js.Object {
    var PlatformArn: js.UndefOr[PlatformArn]
  }

  object DeletePlatformVersionRequest {
    def apply(PlatformArn: js.UndefOr[PlatformArn] = js.undefined): DeletePlatformVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("PlatformArn" -> PlatformArn.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePlatformVersionRequest]
    }
  }

  @js.native
  trait DeletePlatformVersionResult extends js.Object {
    var PlatformSummary: js.UndefOr[PlatformSummary]
  }

  object DeletePlatformVersionResult {
    def apply(PlatformSummary: js.UndefOr[PlatformSummary] = js.undefined): DeletePlatformVersionResult = {
      val _fields = IndexedSeq[(String, js.Any)]("PlatformSummary" -> PlatformSummary.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeletePlatformVersionResult]
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
    def apply(DeploymentId: js.UndefOr[NullableLong] = js.undefined,
              DeploymentTime: js.UndefOr[DeploymentTimestamp] = js.undefined,
              Status: js.UndefOr[String] = js.undefined,
              VersionLabel: js.UndefOr[String] = js.undefined): Deployment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeploymentId" -> DeploymentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeploymentTime" -> DeploymentTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VersionLabel" -> VersionLabel.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Deployment]
    }
  }

  @js.native
  trait DescribeAccountAttributesResult extends js.Object {
    var ResourceQuotas: js.UndefOr[ResourceQuotas]
  }

  object DescribeAccountAttributesResult {
    def apply(ResourceQuotas: js.UndefOr[ResourceQuotas] = js.undefined): DescribeAccountAttributesResult = {
      val _fields = IndexedSeq[(String, js.Any)]("ResourceQuotas" -> ResourceQuotas.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAccountAttributesResult]
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
    def apply(ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
              MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
              NextToken: js.UndefOr[Token] = js.undefined,
              VersionLabels: js.UndefOr[VersionLabelsList] = js.undefined): DescribeApplicationVersionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VersionLabels" -> VersionLabels.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeApplicationVersionsMessage]
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
    def apply(ApplicationNames: js.UndefOr[ApplicationNamesList] = js.undefined): DescribeApplicationsMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("ApplicationNames" -> ApplicationNames.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeApplicationsMessage]
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
    def apply(
        ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
        EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
        Options: js.UndefOr[OptionsSpecifierList] = js.undefined,
        PlatformArn: js.UndefOr[PlatformArn] = js.undefined,
        SolutionStackName: js.UndefOr[SolutionStackName] = js.undefined,
        TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined
    ): DescribeConfigurationOptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnvironmentName" -> EnvironmentName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Options" -> Options.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlatformArn" -> PlatformArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SolutionStackName" -> SolutionStackName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TemplateName" -> TemplateName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigurationOptionsMessage]
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
    def apply(
        ApplicationName: ApplicationName,
        EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
        TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined
    ): DescribeConfigurationSettingsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "EnvironmentName" -> EnvironmentName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TemplateName" -> TemplateName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigurationSettingsMessage]
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
    def apply(AttributeNames: js.UndefOr[EnvironmentHealthAttributes] = js.undefined,
              EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
              EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined): DescribeEnvironmentHealthRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeNames" -> AttributeNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnvironmentId" -> EnvironmentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnvironmentName" -> EnvironmentName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEnvironmentHealthRequest]
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
    def apply(ApplicationMetrics: js.UndefOr[ApplicationMetrics] = js.undefined,
              Causes: js.UndefOr[Causes] = js.undefined,
              Color: js.UndefOr[String] = js.undefined,
              EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
              HealthStatus: js.UndefOr[String] = js.undefined,
              InstancesHealth: js.UndefOr[InstanceHealthSummary] = js.undefined,
              RefreshedAt: js.UndefOr[RefreshedAt] = js.undefined,
              Status: js.UndefOr[EnvironmentHealth] = js.undefined): DescribeEnvironmentHealthResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationMetrics" -> ApplicationMetrics.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Causes" -> Causes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Color" -> Color.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnvironmentName" -> EnvironmentName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HealthStatus" -> HealthStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstancesHealth" -> InstancesHealth.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RefreshedAt" -> RefreshedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEnvironmentHealthResult]
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
    def apply(EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
              EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
              MaxItems: js.UndefOr[Int] = js.undefined,
              NextToken: js.UndefOr[String] = js.undefined): DescribeEnvironmentManagedActionHistoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EnvironmentId" -> EnvironmentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnvironmentName" -> EnvironmentName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxItems" -> MaxItems.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[DescribeEnvironmentManagedActionHistoryRequest]
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
    def apply(ManagedActionHistoryItems: js.UndefOr[ManagedActionHistoryItems] = js.undefined,
              NextToken: js.UndefOr[String] = js.undefined): DescribeEnvironmentManagedActionHistoryResult = {
      val _fields = IndexedSeq[(String, js.Any)]("ManagedActionHistoryItems" -> ManagedActionHistoryItems.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[DescribeEnvironmentManagedActionHistoryResult]
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
    def apply(EnvironmentId: js.UndefOr[String] = js.undefined,
              EnvironmentName: js.UndefOr[String] = js.undefined,
              Status: js.UndefOr[ActionStatus] = js.undefined): DescribeEnvironmentManagedActionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EnvironmentId" -> EnvironmentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnvironmentName" -> EnvironmentName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEnvironmentManagedActionsRequest]
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
    def apply(ManagedActions: js.UndefOr[ManagedActions] = js.undefined): DescribeEnvironmentManagedActionsResult = {
      val _fields = IndexedSeq[(String, js.Any)]("ManagedActions" -> ManagedActions.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEnvironmentManagedActionsResult]
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
    def apply(EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
              EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined): DescribeEnvironmentResourcesMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("EnvironmentId" -> EnvironmentId.map { x =>
        x.asInstanceOf[js.Any]
      }, "EnvironmentName" -> EnvironmentName.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEnvironmentResourcesMessage]
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
    def apply(ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
              EnvironmentIds: js.UndefOr[EnvironmentIdList] = js.undefined,
              EnvironmentNames: js.UndefOr[EnvironmentNamesList] = js.undefined,
              IncludeDeleted: js.UndefOr[IncludeDeleted] = js.undefined,
              IncludedDeletedBackTo: js.UndefOr[IncludeDeletedBackTo] = js.undefined,
              MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
              NextToken: js.UndefOr[Token] = js.undefined,
              VersionLabel: js.UndefOr[VersionLabel] = js.undefined): DescribeEnvironmentsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnvironmentIds" -> EnvironmentIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnvironmentNames" -> EnvironmentNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IncludeDeleted" -> IncludeDeleted.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IncludedDeletedBackTo" -> IncludedDeletedBackTo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VersionLabel" -> VersionLabel.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEnvironmentsMessage]
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
    def apply(ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
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
              VersionLabel: js.UndefOr[VersionLabel] = js.undefined): DescribeEventsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EndTime" -> EndTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnvironmentId" -> EnvironmentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnvironmentName" -> EnvironmentName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlatformArn" -> PlatformArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RequestId" -> RequestId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Severity" -> Severity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartTime" -> StartTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TemplateName" -> TemplateName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VersionLabel" -> VersionLabel.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventsMessage]
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
    def apply(AttributeNames: js.UndefOr[InstancesHealthAttributes] = js.undefined,
              EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
              EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
              NextToken: js.UndefOr[NextToken] = js.undefined): DescribeInstancesHealthRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeNames" -> AttributeNames.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnvironmentId" -> EnvironmentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnvironmentName" -> EnvironmentName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstancesHealthRequest]
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
    def apply(InstanceHealthList: js.UndefOr[InstanceHealthList] = js.undefined,
              NextToken: js.UndefOr[NextToken] = js.undefined,
              RefreshedAt: js.UndefOr[RefreshedAt] = js.undefined): DescribeInstancesHealthResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceHealthList" -> InstanceHealthList.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RefreshedAt" -> RefreshedAt.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstancesHealthResult]
    }
  }

  @js.native
  trait DescribePlatformVersionRequest extends js.Object {
    var PlatformArn: js.UndefOr[PlatformArn]
  }

  object DescribePlatformVersionRequest {
    def apply(PlatformArn: js.UndefOr[PlatformArn] = js.undefined): DescribePlatformVersionRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("PlatformArn" -> PlatformArn.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePlatformVersionRequest]
    }
  }

  @js.native
  trait DescribePlatformVersionResult extends js.Object {
    var PlatformDescription: js.UndefOr[PlatformDescription]
  }

  object DescribePlatformVersionResult {
    def apply(PlatformDescription: js.UndefOr[PlatformDescription] = js.undefined): DescribePlatformVersionResult = {
      val _fields = IndexedSeq[(String, js.Any)]("PlatformDescription" -> PlatformDescription.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePlatformVersionResult]
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
    def apply(AbortableOperationInProgress: js.UndefOr[AbortableOperationInProgress] = js.undefined,
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
              VersionLabel: js.UndefOr[VersionLabel] = js.undefined): EnvironmentDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AbortableOperationInProgress" -> AbortableOperationInProgress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ApplicationName" -> ApplicationName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CNAME" -> CNAME.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DateCreated" -> DateCreated.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DateUpdated" -> DateUpdated.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EndpointURL" -> EndpointURL.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnvironmentArn" -> EnvironmentArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnvironmentId" -> EnvironmentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnvironmentLinks" -> EnvironmentLinks.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnvironmentName" -> EnvironmentName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Health" -> Health.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HealthStatus" -> HealthStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlatformArn" -> PlatformArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Resources" -> Resources.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SolutionStackName" -> SolutionStackName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TemplateName" -> TemplateName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tier" -> Tier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VersionLabel" -> VersionLabel.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnvironmentDescription]
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
    def apply(Environments: js.UndefOr[EnvironmentDescriptionsList] = js.undefined,
              NextToken: js.UndefOr[Token] = js.undefined): EnvironmentDescriptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("Environments" -> Environments.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnvironmentDescriptionsMessage]
    }
  }

  object EnvironmentHealthEnum {
    val Green  = "Green"
    val Yellow = "Yellow"
    val Red    = "Red"
    val Grey   = "Grey"

    val values = IndexedSeq(Green, Yellow, Red, Grey)
  }

  object EnvironmentHealthAttributeEnum {
    val Status             = "Status"
    val Color              = "Color"
    val Causes             = "Causes"
    val ApplicationMetrics = "ApplicationMetrics"
    val InstancesHealth    = "InstancesHealth"
    val All                = "All"
    val HealthStatus       = "HealthStatus"
    val RefreshedAt        = "RefreshedAt"

    val values = IndexedSeq(Status, Color, Causes, ApplicationMetrics, InstancesHealth, All, HealthStatus, RefreshedAt)
  }

  object EnvironmentHealthStatusEnum {
    val NoData    = "NoData"
    val Unknown   = "Unknown"
    val Pending   = "Pending"
    val Ok        = "Ok"
    val Info      = "Info"
    val Warning   = "Warning"
    val Degraded  = "Degraded"
    val Severe    = "Severe"
    val Suspended = "Suspended"

    val values = IndexedSeq(NoData, Unknown, Pending, Ok, Info, Warning, Degraded, Severe, Suspended)
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
    def apply(Ec2InstanceId: js.UndefOr[Ec2InstanceId] = js.undefined,
              InfoType: js.UndefOr[EnvironmentInfoType] = js.undefined,
              Message: js.UndefOr[Message] = js.undefined,
              SampleTimestamp: js.UndefOr[SampleTimestamp] = js.undefined): EnvironmentInfoDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Ec2InstanceId" -> Ec2InstanceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InfoType" -> InfoType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Message" -> Message.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SampleTimestamp" -> SampleTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnvironmentInfoDescription]
    }
  }

  object EnvironmentInfoTypeEnum {
    val tail   = "tail"
    val bundle = "bundle"

    val values = IndexedSeq(tail, bundle)
  }

  /**
    * A link to another environment, defined in the environment's manifest. Links provide connection information in system properties that can be used to connect to another environment in the same group. See [[http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/environment-cfg-manifest.html|Environment Manifest (env.yaml)]] for details.
    */
  @js.native
  trait EnvironmentLink extends js.Object {
    var EnvironmentName: js.UndefOr[String]
    var LinkName: js.UndefOr[String]
  }

  object EnvironmentLink {
    def apply(EnvironmentName: js.UndefOr[String] = js.undefined,
              LinkName: js.UndefOr[String] = js.undefined): EnvironmentLink = {
      val _fields = IndexedSeq[(String, js.Any)]("EnvironmentName" -> EnvironmentName.map { x =>
        x.asInstanceOf[js.Any]
      }, "LinkName" -> LinkName.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnvironmentLink]
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
    def apply(AutoScalingGroups: js.UndefOr[AutoScalingGroupList] = js.undefined,
              EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
              Instances: js.UndefOr[InstanceList] = js.undefined,
              LaunchConfigurations: js.UndefOr[LaunchConfigurationList] = js.undefined,
              LaunchTemplates: js.UndefOr[LaunchTemplateList] = js.undefined,
              LoadBalancers: js.UndefOr[LoadBalancerList] = js.undefined,
              Queues: js.UndefOr[QueueList] = js.undefined,
              Triggers: js.UndefOr[TriggerList] = js.undefined): EnvironmentResourceDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoScalingGroups" -> AutoScalingGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnvironmentName" -> EnvironmentName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Instances" -> Instances.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LaunchConfigurations" -> LaunchConfigurations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LaunchTemplates" -> LaunchTemplates.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LoadBalancers" -> LoadBalancers.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Queues" -> Queues.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Triggers" -> Triggers.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnvironmentResourceDescription]
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
    def apply(
        EnvironmentResources: js.UndefOr[EnvironmentResourceDescription] = js.undefined
    ): EnvironmentResourceDescriptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("EnvironmentResources" -> EnvironmentResources.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnvironmentResourceDescriptionsMessage]
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
    def apply(LoadBalancer: js.UndefOr[LoadBalancerDescription] = js.undefined): EnvironmentResourcesDescription = {
      val _fields = IndexedSeq[(String, js.Any)]("LoadBalancer" -> LoadBalancer.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnvironmentResourcesDescription]
    }
  }

  object EnvironmentStatusEnum {
    val Launching   = "Launching"
    val Updating    = "Updating"
    val Ready       = "Ready"
    val Terminating = "Terminating"
    val Terminated  = "Terminated"

    val values = IndexedSeq(Launching, Updating, Ready, Terminating, Terminated)
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
    def apply(Name: js.UndefOr[String] = js.undefined,
              Type: js.UndefOr[String] = js.undefined,
              Version: js.UndefOr[String] = js.undefined): EnvironmentTier = {
      val _fields = IndexedSeq[(String, js.Any)]("Name" -> Name.map { x =>
        x.asInstanceOf[js.Any]
      }, "Type" -> Type.map { x =>
        x.asInstanceOf[js.Any]
      }, "Version" -> Version.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnvironmentTier]
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
    def apply(ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
              EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
              EventDate: js.UndefOr[EventDate] = js.undefined,
              Message: js.UndefOr[EventMessage] = js.undefined,
              PlatformArn: js.UndefOr[PlatformArn] = js.undefined,
              RequestId: js.UndefOr[RequestId] = js.undefined,
              Severity: js.UndefOr[EventSeverity] = js.undefined,
              TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined,
              VersionLabel: js.UndefOr[VersionLabel] = js.undefined): EventDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnvironmentName" -> EnvironmentName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EventDate" -> EventDate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Message" -> Message.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlatformArn" -> PlatformArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RequestId" -> RequestId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Severity" -> Severity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TemplateName" -> TemplateName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VersionLabel" -> VersionLabel.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventDescription]
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
    def apply(Events: js.UndefOr[EventDescriptionList] = js.undefined,
              NextToken: js.UndefOr[Token] = js.undefined): EventDescriptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("Events" -> Events.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventDescriptionsMessage]
    }
  }

  object EventSeverityEnum {
    val TRACE = "TRACE"
    val DEBUG = "DEBUG"
    val INFO  = "INFO"
    val WARN  = "WARN"
    val ERROR = "ERROR"
    val FATAL = "FATAL"

    val values = IndexedSeq(TRACE, DEBUG, INFO, WARN, ERROR, FATAL)
  }

  object FailureTypeEnum {
    val UpdateCancelled         = "UpdateCancelled"
    val CancellationFailed      = "CancellationFailed"
    val RollbackFailed          = "RollbackFailed"
    val RollbackSuccessful      = "RollbackSuccessful"
    val InternalFailure         = "InternalFailure"
    val InvalidEnvironmentState = "InvalidEnvironmentState"
    val PermissionsError        = "PermissionsError"

    val values = IndexedSeq(
      UpdateCancelled,
      CancellationFailed,
      RollbackFailed,
      RollbackSuccessful,
      InternalFailure,
      InvalidEnvironmentState,
      PermissionsError
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
    def apply(Id: js.UndefOr[ResourceId] = js.undefined): Instance = {
      val _fields = IndexedSeq[(String, js.Any)]("Id" -> Id.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Instance]
    }
  }

  /**
    * Represents summary information about the health of an instance. For more information, see [[http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/health-enhanced-status.html|Health Colors and Statuses]].
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
    def apply(Degraded: js.UndefOr[NullableInteger] = js.undefined,
              Info: js.UndefOr[NullableInteger] = js.undefined,
              NoData: js.UndefOr[NullableInteger] = js.undefined,
              Ok: js.UndefOr[NullableInteger] = js.undefined,
              Pending: js.UndefOr[NullableInteger] = js.undefined,
              Severe: js.UndefOr[NullableInteger] = js.undefined,
              Unknown: js.UndefOr[NullableInteger] = js.undefined,
              Warning: js.UndefOr[NullableInteger] = js.undefined): InstanceHealthSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Degraded" -> Degraded.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Info" -> Info.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NoData" -> NoData.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Ok" -> Ok.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Pending" -> Pending.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Severe" -> Severe.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Unknown" -> Unknown.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Warning" -> Warning.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceHealthSummary]
    }
  }

  object InstancesHealthAttributeEnum {
    val HealthStatus       = "HealthStatus"
    val Color              = "Color"
    val Causes             = "Causes"
    val ApplicationMetrics = "ApplicationMetrics"
    val RefreshedAt        = "RefreshedAt"
    val LaunchedAt         = "LaunchedAt"
    val System             = "System"
    val Deployment         = "Deployment"
    val AvailabilityZone   = "AvailabilityZone"
    val InstanceType       = "InstanceType"
    val All                = "All"

    val values = IndexedSeq(
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
    def apply(P10: js.UndefOr[NullableDouble] = js.undefined,
              P50: js.UndefOr[NullableDouble] = js.undefined,
              P75: js.UndefOr[NullableDouble] = js.undefined,
              P85: js.UndefOr[NullableDouble] = js.undefined,
              P90: js.UndefOr[NullableDouble] = js.undefined,
              P95: js.UndefOr[NullableDouble] = js.undefined,
              P99: js.UndefOr[NullableDouble] = js.undefined,
              P999: js.UndefOr[NullableDouble] = js.undefined): Latency = {
      val _fields = IndexedSeq[(String, js.Any)](
        "P10" -> P10.map { x =>
          x.asInstanceOf[js.Any]
        },
        "P50" -> P50.map { x =>
          x.asInstanceOf[js.Any]
        },
        "P75" -> P75.map { x =>
          x.asInstanceOf[js.Any]
        },
        "P85" -> P85.map { x =>
          x.asInstanceOf[js.Any]
        },
        "P90" -> P90.map { x =>
          x.asInstanceOf[js.Any]
        },
        "P95" -> P95.map { x =>
          x.asInstanceOf[js.Any]
        },
        "P99" -> P99.map { x =>
          x.asInstanceOf[js.Any]
        },
        "P999" -> P999.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Latency]
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
    def apply(Name: js.UndefOr[ResourceId] = js.undefined): LaunchConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)]("Name" -> Name.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchConfiguration]
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
    def apply(Id: js.UndefOr[ResourceId] = js.undefined): LaunchTemplate = {
      val _fields = IndexedSeq[(String, js.Any)]("Id" -> Id.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchTemplate]
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
    def apply(
        SolutionStackDetails: js.UndefOr[AvailableSolutionStackDetailsList] = js.undefined,
        SolutionStacks: js.UndefOr[AvailableSolutionStackNamesList] = js.undefined
    ): ListAvailableSolutionStacksResultMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("SolutionStackDetails" -> SolutionStackDetails.map { x =>
        x.asInstanceOf[js.Any]
      }, "SolutionStacks" -> SolutionStacks.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAvailableSolutionStacksResultMessage]
    }
  }

  @js.native
  trait ListPlatformVersionsRequest extends js.Object {
    var Filters: js.UndefOr[PlatformFilters]
    var MaxRecords: js.UndefOr[PlatformMaxRecords]
    var NextToken: js.UndefOr[Token]
  }

  object ListPlatformVersionsRequest {
    def apply(Filters: js.UndefOr[PlatformFilters] = js.undefined,
              MaxRecords: js.UndefOr[PlatformMaxRecords] = js.undefined,
              NextToken: js.UndefOr[Token] = js.undefined): ListPlatformVersionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxRecords" -> MaxRecords.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPlatformVersionsRequest]
    }
  }

  @js.native
  trait ListPlatformVersionsResult extends js.Object {
    var NextToken: js.UndefOr[Token]
    var PlatformSummaryList: js.UndefOr[PlatformSummaryList]
  }

  object ListPlatformVersionsResult {
    def apply(NextToken: js.UndefOr[Token] = js.undefined,
              PlatformSummaryList: js.UndefOr[PlatformSummaryList] = js.undefined): ListPlatformVersionsResult = {
      val _fields = IndexedSeq[(String, js.Any)]("NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }, "PlatformSummaryList" -> PlatformSummaryList.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPlatformVersionsResult]
    }
  }

  @js.native
  trait ListTagsForResourceMessage extends js.Object {
    var ResourceArn: ResourceArn
  }

  object ListTagsForResourceMessage {
    def apply(ResourceArn: ResourceArn): ListTagsForResourceMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("ResourceArn" -> ResourceArn.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsForResourceMessage]
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
    def apply(Port: js.UndefOr[Int] = js.undefined, Protocol: js.UndefOr[String] = js.undefined): Listener = {
      val _fields = IndexedSeq[(String, js.Any)]("Port" -> Port.map { x =>
        x.asInstanceOf[js.Any]
      }, "Protocol" -> Protocol.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Listener]
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
    def apply(Name: js.UndefOr[ResourceId] = js.undefined): LoadBalancer = {
      val _fields = IndexedSeq[(String, js.Any)]("Name" -> Name.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBalancer]
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
    def apply(Domain: js.UndefOr[String] = js.undefined,
              Listeners: js.UndefOr[LoadBalancerListenersDescription] = js.undefined,
              LoadBalancerName: js.UndefOr[String] = js.undefined): LoadBalancerDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Domain" -> Domain.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Listeners" -> Listeners.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LoadBalancerName" -> LoadBalancerName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBalancerDescription]
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
    def apply(ActionDescription: js.UndefOr[String] = js.undefined,
              ActionId: js.UndefOr[String] = js.undefined,
              ActionType: js.UndefOr[ActionType] = js.undefined,
              Status: js.UndefOr[ActionStatus] = js.undefined,
              WindowStartTime: js.UndefOr[Timestamp] = js.undefined): ManagedAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActionDescription" -> ActionDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ActionId" -> ActionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ActionType" -> ActionType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "WindowStartTime" -> WindowStartTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ManagedAction]
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
    def apply(ActionDescription: js.UndefOr[String] = js.undefined,
              ActionId: js.UndefOr[String] = js.undefined,
              ActionType: js.UndefOr[ActionType] = js.undefined,
              ExecutedTime: js.UndefOr[Timestamp] = js.undefined,
              FailureDescription: js.UndefOr[String] = js.undefined,
              FailureType: js.UndefOr[FailureType] = js.undefined,
              FinishedTime: js.UndefOr[Timestamp] = js.undefined,
              Status: js.UndefOr[ActionHistoryStatus] = js.undefined): ManagedActionHistoryItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActionDescription" -> ActionDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ActionId" -> ActionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ActionType" -> ActionType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExecutedTime" -> ExecutedTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FailureDescription" -> FailureDescription.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FailureType" -> FailureType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FinishedTime" -> FinishedTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ManagedActionHistoryItem]
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
    def apply(Enabled: BoxedBoolean,
              DeleteSourceFromS3: js.UndefOr[BoxedBoolean] = js.undefined,
              MaxAgeInDays: js.UndefOr[BoxedInt] = js.undefined): MaxAgeRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.asInstanceOf[js.Any],
        "DeleteSourceFromS3" -> DeleteSourceFromS3.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxAgeInDays" -> MaxAgeInDays.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MaxAgeRule]
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
    def apply(Enabled: BoxedBoolean,
              DeleteSourceFromS3: js.UndefOr[BoxedBoolean] = js.undefined,
              MaxCount: js.UndefOr[BoxedInt] = js.undefined): MaxCountRule = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Enabled" -> Enabled.asInstanceOf[js.Any],
        "DeleteSourceFromS3" -> DeleteSourceFromS3.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxCount" -> MaxCount.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MaxCountRule]
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
    def apply(Label: js.UndefOr[RegexLabel] = js.undefined,
              Pattern: js.UndefOr[RegexPattern] = js.undefined): OptionRestrictionRegex = {
      val _fields = IndexedSeq[(String, js.Any)]("Label" -> Label.map { x =>
        x.asInstanceOf[js.Any]
      }, "Pattern" -> Pattern.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptionRestrictionRegex]
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
    def apply(Namespace: js.UndefOr[OptionNamespace] = js.undefined,
              OptionName: js.UndefOr[ConfigurationOptionName] = js.undefined,
              ResourceName: js.UndefOr[ResourceName] = js.undefined): OptionSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Namespace" -> Namespace.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionName" -> OptionName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceName" -> ResourceName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptionSpecification]
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
    def apply(CustomAmiList: js.UndefOr[CustomAmiList] = js.undefined,
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
              SupportedTierList: js.UndefOr[SupportedTierList] = js.undefined): PlatformDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CustomAmiList" -> CustomAmiList.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DateCreated" -> DateCreated.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DateUpdated" -> DateUpdated.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Frameworks" -> Frameworks.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Maintainer" -> Maintainer.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OperatingSystemName" -> OperatingSystemName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OperatingSystemVersion" -> OperatingSystemVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlatformArn" -> PlatformArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlatformCategory" -> PlatformCategory.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlatformName" -> PlatformName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlatformOwner" -> PlatformOwner.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlatformStatus" -> PlatformStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlatformVersion" -> PlatformVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProgrammingLanguages" -> ProgrammingLanguages.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SolutionStackName" -> SolutionStackName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SupportedAddonList" -> SupportedAddonList.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SupportedTierList" -> SupportedTierList.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PlatformDescription]
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
    def apply(Operator: js.UndefOr[PlatformFilterOperator] = js.undefined,
              Type: js.UndefOr[PlatformFilterType] = js.undefined,
              Values: js.UndefOr[PlatformFilterValueList] = js.undefined): PlatformFilter = {
      val _fields = IndexedSeq[(String, js.Any)]("Operator" -> Operator.map { x =>
        x.asInstanceOf[js.Any]
      }, "Type" -> Type.map { x =>
        x.asInstanceOf[js.Any]
      }, "Values" -> Values.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PlatformFilter]
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
    def apply(Name: js.UndefOr[String] = js.undefined,
              Version: js.UndefOr[String] = js.undefined): PlatformFramework = {
      val _fields = IndexedSeq[(String, js.Any)]("Name" -> Name.map { x =>
        x.asInstanceOf[js.Any]
      }, "Version" -> Version.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PlatformFramework]
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
    def apply(Name: js.UndefOr[String] = js.undefined,
              Version: js.UndefOr[String] = js.undefined): PlatformProgrammingLanguage = {
      val _fields = IndexedSeq[(String, js.Any)]("Name" -> Name.map { x =>
        x.asInstanceOf[js.Any]
      }, "Version" -> Version.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PlatformProgrammingLanguage]
    }
  }

  object PlatformStatusEnum {
    val Creating = "Creating"
    val Failed   = "Failed"
    val Ready    = "Ready"
    val Deleting = "Deleting"
    val Deleted  = "Deleted"

    val values = IndexedSeq(Creating, Failed, Ready, Deleting, Deleted)
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
    def apply(OperatingSystemName: js.UndefOr[OperatingSystemName] = js.undefined,
              OperatingSystemVersion: js.UndefOr[OperatingSystemVersion] = js.undefined,
              PlatformArn: js.UndefOr[PlatformArn] = js.undefined,
              PlatformCategory: js.UndefOr[PlatformCategory] = js.undefined,
              PlatformOwner: js.UndefOr[PlatformOwner] = js.undefined,
              PlatformStatus: js.UndefOr[PlatformStatus] = js.undefined,
              SupportedAddonList: js.UndefOr[SupportedAddonList] = js.undefined,
              SupportedTierList: js.UndefOr[SupportedTierList] = js.undefined): PlatformSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OperatingSystemName" -> OperatingSystemName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OperatingSystemVersion" -> OperatingSystemVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlatformArn" -> PlatformArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlatformCategory" -> PlatformCategory.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlatformOwner" -> PlatformOwner.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlatformStatus" -> PlatformStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SupportedAddonList" -> SupportedAddonList.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SupportedTierList" -> SupportedTierList.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PlatformSummary]
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
    def apply(Name: js.UndefOr[String] = js.undefined, URL: js.UndefOr[String] = js.undefined): Queue = {
      val _fields = IndexedSeq[(String, js.Any)]("Name" -> Name.map { x =>
        x.asInstanceOf[js.Any]
      }, "URL" -> URL.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Queue]
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
    def apply(EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
              EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined): RebuildEnvironmentMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("EnvironmentId" -> EnvironmentId.map { x =>
        x.asInstanceOf[js.Any]
      }, "EnvironmentName" -> EnvironmentName.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebuildEnvironmentMessage]
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
    def apply(InfoType: EnvironmentInfoType,
              EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
              EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined): RequestEnvironmentInfoMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InfoType" -> InfoType.asInstanceOf[js.Any],
        "EnvironmentId" -> EnvironmentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnvironmentName" -> EnvironmentName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestEnvironmentInfoMessage]
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
    def apply(Maximum: js.UndefOr[BoxedInt] = js.undefined): ResourceQuota = {
      val _fields = IndexedSeq[(String, js.Any)]("Maximum" -> Maximum.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceQuota]
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
    def apply(ApplicationQuota: js.UndefOr[ResourceQuota] = js.undefined,
              ApplicationVersionQuota: js.UndefOr[ResourceQuota] = js.undefined,
              ConfigurationTemplateQuota: js.UndefOr[ResourceQuota] = js.undefined,
              CustomPlatformQuota: js.UndefOr[ResourceQuota] = js.undefined,
              EnvironmentQuota: js.UndefOr[ResourceQuota] = js.undefined): ResourceQuotas = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationQuota" -> ApplicationQuota.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ApplicationVersionQuota" -> ApplicationVersionQuota.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConfigurationTemplateQuota" -> ConfigurationTemplateQuota.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomPlatformQuota" -> CustomPlatformQuota.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnvironmentQuota" -> EnvironmentQuota.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceQuotas]
    }
  }

  @js.native
  trait ResourceTagsDescriptionMessage extends js.Object {
    var ResourceArn: js.UndefOr[ResourceArn]
    var ResourceTags: js.UndefOr[TagList]
  }

  object ResourceTagsDescriptionMessage {
    def apply(ResourceArn: js.UndefOr[ResourceArn] = js.undefined,
              ResourceTags: js.UndefOr[TagList] = js.undefined): ResourceTagsDescriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("ResourceArn" -> ResourceArn.map { x =>
        x.asInstanceOf[js.Any]
      }, "ResourceTags" -> ResourceTags.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceTagsDescriptionMessage]
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
    def apply(EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
              EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined): RestartAppServerMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("EnvironmentId" -> EnvironmentId.map { x =>
        x.asInstanceOf[js.Any]
      }, "EnvironmentName" -> EnvironmentName.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestartAppServerMessage]
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
    def apply(InfoType: EnvironmentInfoType,
              EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
              EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined): RetrieveEnvironmentInfoMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InfoType" -> InfoType.asInstanceOf[js.Any],
        "EnvironmentId" -> EnvironmentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnvironmentName" -> EnvironmentName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RetrieveEnvironmentInfoMessage]
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
    def apply(
        EnvironmentInfo: js.UndefOr[EnvironmentInfoDescriptionList] = js.undefined
    ): RetrieveEnvironmentInfoResultMessage = {
      val _fields = IndexedSeq[(String, js.Any)]("EnvironmentInfo" -> EnvironmentInfo.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RetrieveEnvironmentInfoResultMessage]
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
    def apply(S3Bucket: js.UndefOr[S3Bucket] = js.undefined, S3Key: js.UndefOr[S3Key] = js.undefined): S3Location = {
      val _fields = IndexedSeq[(String, js.Any)]("S3Bucket" -> S3Bucket.map { x =>
        x.asInstanceOf[js.Any]
      }, "S3Key" -> S3Key.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Location]
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
    def apply(ApplicationMetrics: js.UndefOr[ApplicationMetrics] = js.undefined,
              AvailabilityZone: js.UndefOr[String] = js.undefined,
              Causes: js.UndefOr[Causes] = js.undefined,
              Color: js.UndefOr[String] = js.undefined,
              Deployment: js.UndefOr[Deployment] = js.undefined,
              HealthStatus: js.UndefOr[String] = js.undefined,
              InstanceId: js.UndefOr[InstanceId] = js.undefined,
              InstanceType: js.UndefOr[String] = js.undefined,
              LaunchedAt: js.UndefOr[LaunchedAt] = js.undefined,
              System: js.UndefOr[SystemStatus] = js.undefined): SingleInstanceHealth = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationMetrics" -> ApplicationMetrics.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AvailabilityZone" -> AvailabilityZone.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Causes" -> Causes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Color" -> Color.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Deployment" -> Deployment.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HealthStatus" -> HealthStatus.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceId" -> InstanceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceType" -> InstanceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LaunchedAt" -> LaunchedAt.map { x =>
          x.asInstanceOf[js.Any]
        },
        "System" -> System.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SingleInstanceHealth]
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
    def apply(PermittedFileTypes: js.UndefOr[SolutionStackFileTypeList] = js.undefined,
              SolutionStackName: js.UndefOr[SolutionStackName] = js.undefined): SolutionStackDescription = {
      val _fields = IndexedSeq[(String, js.Any)]("PermittedFileTypes" -> PermittedFileTypes.map { x =>
        x.asInstanceOf[js.Any]
      }, "SolutionStackName" -> SolutionStackName.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SolutionStackDescription]
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
    def apply(SourceLocation: SourceLocation,
              SourceRepository: SourceRepository,
              SourceType: SourceType): SourceBuildInformation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "SourceLocation"   -> SourceLocation.asInstanceOf[js.Any],
        "SourceRepository" -> SourceRepository.asInstanceOf[js.Any],
        "SourceType"       -> SourceType.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SourceBuildInformation]
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
    def apply(ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
              TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined): SourceConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)]("ApplicationName" -> ApplicationName.map { x =>
        x.asInstanceOf[js.Any]
      }, "TemplateName" -> TemplateName.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SourceConfiguration]
    }
  }

  object SourceRepositoryEnum {
    val CodeCommit = "CodeCommit"
    val S3         = "S3"

    val values = IndexedSeq(CodeCommit, S3)
  }

  object SourceTypeEnum {
    val Git = "Git"
    val Zip = "Zip"

    val values = IndexedSeq(Git, Zip)
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
    def apply(Status2xx: js.UndefOr[NullableInteger] = js.undefined,
              Status3xx: js.UndefOr[NullableInteger] = js.undefined,
              Status4xx: js.UndefOr[NullableInteger] = js.undefined,
              Status5xx: js.UndefOr[NullableInteger] = js.undefined): StatusCodes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status2xx" -> Status2xx.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status3xx" -> Status3xx.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status4xx" -> Status4xx.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status5xx" -> Status5xx.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StatusCodes]
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
    def apply(DestinationEnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
              DestinationEnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
              SourceEnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
              SourceEnvironmentName: js.UndefOr[EnvironmentName] = js.undefined): SwapEnvironmentCNAMEsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DestinationEnvironmentId" -> DestinationEnvironmentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DestinationEnvironmentName" -> DestinationEnvironmentName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceEnvironmentId" -> SourceEnvironmentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SourceEnvironmentName" -> SourceEnvironmentName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SwapEnvironmentCNAMEsMessage]
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
    def apply(CPUUtilization: js.UndefOr[CPUUtilization] = js.undefined,
              LoadAverage: js.UndefOr[LoadAverage] = js.undefined): SystemStatus = {
      val _fields = IndexedSeq[(String, js.Any)]("CPUUtilization" -> CPUUtilization.map { x =>
        x.asInstanceOf[js.Any]
      }, "LoadAverage" -> LoadAverage.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SystemStatus]
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
    def apply(Key: js.UndefOr[TagKey] = js.undefined, Value: js.UndefOr[TagValue] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)]("Key" -> Key.map { x =>
        x.asInstanceOf[js.Any]
      }, "Value" -> Value.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
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
    def apply(
        EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
        EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
        ForceTerminate: js.UndefOr[ForceTerminate] = js.undefined,
        TerminateResources: js.UndefOr[TerminateEnvironmentResources] = js.undefined
    ): TerminateEnvironmentMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EnvironmentId" -> EnvironmentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnvironmentName" -> EnvironmentName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ForceTerminate" -> ForceTerminate.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TerminateResources" -> TerminateResources.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminateEnvironmentMessage]
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
    def apply(Name: js.UndefOr[ResourceId] = js.undefined): Trigger = {
      val _fields = IndexedSeq[(String, js.Any)]("Name" -> Name.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Trigger]
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
    def apply(ApplicationName: ApplicationName,
              Description: js.UndefOr[Description] = js.undefined): UpdateApplicationMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateApplicationMessage]
    }
  }

  @js.native
  trait UpdateApplicationResourceLifecycleMessage extends js.Object {
    var ApplicationName: ApplicationName
    var ResourceLifecycleConfig: ApplicationResourceLifecycleConfig
  }

  object UpdateApplicationResourceLifecycleMessage {
    def apply(
        ApplicationName: ApplicationName,
        ResourceLifecycleConfig: ApplicationResourceLifecycleConfig
    ): UpdateApplicationResourceLifecycleMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName"         -> ApplicationName.asInstanceOf[js.Any],
        "ResourceLifecycleConfig" -> ResourceLifecycleConfig.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateApplicationResourceLifecycleMessage]
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
    def apply(ApplicationName: ApplicationName,
              VersionLabel: VersionLabel,
              Description: js.UndefOr[Description] = js.undefined): UpdateApplicationVersionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "VersionLabel"    -> VersionLabel.asInstanceOf[js.Any],
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateApplicationVersionMessage]
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
    def apply(ApplicationName: ApplicationName,
              TemplateName: ConfigurationTemplateName,
              Description: js.UndefOr[Description] = js.undefined,
              OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.undefined,
              OptionsToRemove: js.UndefOr[OptionsSpecifierList] = js.undefined): UpdateConfigurationTemplateMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "TemplateName"    -> TemplateName.asInstanceOf[js.Any],
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionSettings" -> OptionSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionsToRemove" -> OptionsToRemove.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateConfigurationTemplateMessage]
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
    def apply(ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
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
              VersionLabel: js.UndefOr[VersionLabel] = js.undefined): UpdateEnvironmentMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnvironmentId" -> EnvironmentId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnvironmentName" -> EnvironmentName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GroupName" -> GroupName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionSettings" -> OptionSettings.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionsToRemove" -> OptionsToRemove.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlatformArn" -> PlatformArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SolutionStackName" -> SolutionStackName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TemplateName" -> TemplateName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tier" -> Tier.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VersionLabel" -> VersionLabel.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEnvironmentMessage]
    }
  }

  @js.native
  trait UpdateTagsForResourceMessage extends js.Object {
    var ResourceArn: ResourceArn
    var TagsToAdd: js.UndefOr[TagList]
    var TagsToRemove: js.UndefOr[TagKeyList]
  }

  object UpdateTagsForResourceMessage {
    def apply(ResourceArn: ResourceArn,
              TagsToAdd: js.UndefOr[TagList] = js.undefined,
              TagsToRemove: js.UndefOr[TagKeyList] = js.undefined): UpdateTagsForResourceMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagsToAdd" -> TagsToAdd.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TagsToRemove" -> TagsToRemove.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTagsForResourceMessage]
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
    def apply(
        ApplicationName: ApplicationName,
        OptionSettings: ConfigurationOptionSettingsList,
        EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
        TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined
    ): ValidateConfigurationSettingsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ApplicationName" -> ApplicationName.asInstanceOf[js.Any],
        "OptionSettings"  -> OptionSettings.asInstanceOf[js.Any],
        "EnvironmentName" -> EnvironmentName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TemplateName" -> TemplateName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ValidateConfigurationSettingsMessage]
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
    def apply(Message: js.UndefOr[ValidationMessageString] = js.undefined,
              Namespace: js.UndefOr[OptionNamespace] = js.undefined,
              OptionName: js.UndefOr[ConfigurationOptionName] = js.undefined,
              Severity: js.UndefOr[ValidationSeverity] = js.undefined): ValidationMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Message" -> Message.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Namespace" -> Namespace.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OptionName" -> OptionName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Severity" -> Severity.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ValidationMessage]
    }
  }

  object ValidationSeverityEnum {
    val error   = "error"
    val warning = "warning"

    val values = IndexedSeq(error, warning)
  }
}
