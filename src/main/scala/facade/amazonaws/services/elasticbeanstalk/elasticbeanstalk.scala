package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object elasticbeanstalk {
  type AbortableOperationInProgress = Boolean
  type ApplicationDescriptionList = js.Array[ApplicationDescription]
  type ApplicationName = String
  type ApplicationNamesList = js.Array[ApplicationName]
  type ApplicationVersionDescriptionList = js.Array[ApplicationVersionDescription]
  type AutoCreateApplication = Boolean
  type AutoScalingGroupList = js.Array[AutoScalingGroup]
  type AvailableSolutionStackDetailsList = js.Array[SolutionStackDescription]
  type AvailableSolutionStackNamesList = js.Array[SolutionStackName]
  type CnameAvailability = Boolean
  type ConfigurationDeploymentStatus = String
  type ConfigurationOptionDefaultValue = String
  type ConfigurationOptionDescriptionsList = js.Array[ConfigurationOptionDescription]
  type ConfigurationOptionName = String
  type ConfigurationOptionPossibleValue = String
  type ConfigurationOptionPossibleValues = js.Array[ConfigurationOptionPossibleValue]
  type ConfigurationOptionSettingsList = js.Array[ConfigurationOptionSetting]
  type ConfigurationOptionSeverity = String
  type ConfigurationOptionValue = String
  type ConfigurationOptionValueType = String
  type ConfigurationSettingsDescriptionList = js.Array[ConfigurationSettingsDescription]
  type ConfigurationTemplateName = String
  type ConfigurationTemplateNamesList = js.Array[ConfigurationTemplateName]
  type CreationDate = js.Date
  type DNSCname = String
  type DNSCnamePrefix = String
  type DeleteSourceBundle = Boolean
  type Description = String
  type Ec2InstanceId = String
  type EndpointURL = String
  type EnvironmentDescriptionsList = js.Array[EnvironmentDescription]
  type EnvironmentHealth = String
  type EnvironmentId = String
  type EnvironmentIdList = js.Array[EnvironmentId]
  type EnvironmentInfoDescriptionList = js.Array[EnvironmentInfoDescription]
  type EnvironmentInfoType = String
  type EnvironmentName = String
  type EnvironmentNamesList = js.Array[EnvironmentName]
  type EnvironmentStatus = String
  type EventDate = js.Date
  type EventDescriptionList = js.Array[EventDescription]
  type EventMessage = String
  type EventSeverity = String
  type FileTypeExtension = String
  type IncludeDeleted = Boolean
  type IncludeDeletedBackTo = js.Date
  type InstanceList = js.Array[Instance]
  type LaunchConfigurationList = js.Array[LaunchConfiguration]
  type LoadBalancerList = js.Array[LoadBalancer]
  type LoadBalancerListenersDescription = js.Array[Listener]
  type MaxRecords = Integer
  type Message = String
  type OptionNamespace = String
  type OptionRestrictionMaxLength = Integer
  type OptionRestrictionMaxValue = Integer
  type OptionRestrictionMinValue = Integer
  type OptionsSpecifierList = js.Array[OptionSpecification]
  type QueueList = js.Array[Queue]
  type RegexLabel = String
  type RegexPattern = String
  type RequestId = String
  type ResourceId = String
  type S3Bucket = String
  type S3Key = String
  type SampleTimestamp = js.Date
  type SolutionStackFileTypeList = js.Array[FileTypeExtension]
  type SolutionStackName = String
  type TagKey = String
  type TagValue = String
  type Tags = js.Array[Tag]
  type TerminateEnvForce = Boolean
  type TerminateEnvironmentResources = Boolean
  type TimeFilterEnd = js.Date
  type TimeFilterStart = js.Date
  type Token = String
  type TriggerList = js.Array[Trigger]
  type UpdateDate = js.Date
  type UserDefinedOption = Boolean
  type ValidationMessageString = String
  type ValidationMessagesList = js.Array[ValidationMessage]
  type ValidationSeverity = String
  type VersionLabel = String
  type VersionLabelsList = js.Array[VersionLabel]
}

package elasticbeanstalk {
  @js.native
  trait Elasticbeanstalk extends js.Object {
    def abortEnvironmentUpdate(params: AbortEnvironmentUpdateMessage, callback: Callback[js.Object]): Unit = js.native
    def abortEnvironmentUpdate(params: AbortEnvironmentUpdateMessage): Request[js.Object] = js.native
    def checkDNSAvailability(params: CheckDNSAvailabilityMessage, callback: Callback[CheckDNSAvailabilityResultMessage]): Unit = js.native
    def checkDNSAvailability(params: CheckDNSAvailabilityMessage): Request[CheckDNSAvailabilityResultMessage] = js.native
    def createApplication(params: CreateApplicationMessage, callback: Callback[ApplicationDescriptionMessage]): Unit = js.native
    def createApplication(params: CreateApplicationMessage): Request[ApplicationDescriptionMessage] = js.native
    def createApplicationVersion(params: CreateApplicationVersionMessage, callback: Callback[ApplicationVersionDescriptionMessage]): Unit = js.native
    def createApplicationVersion(params: CreateApplicationVersionMessage): Request[ApplicationVersionDescriptionMessage] = js.native
    def createConfigurationTemplate(params: CreateConfigurationTemplateMessage, callback: Callback[ConfigurationSettingsDescription]): Unit = js.native
    def createConfigurationTemplate(params: CreateConfigurationTemplateMessage): Request[ConfigurationSettingsDescription] = js.native
    def createEnvironment(params: CreateEnvironmentMessage, callback: Callback[EnvironmentDescription]): Unit = js.native
    def createEnvironment(params: CreateEnvironmentMessage): Request[EnvironmentDescription] = js.native
    def createStorageLocation(callback: Callback[CreateStorageLocationResultMessage]): Unit = js.native
    def createStorageLocation(): Request[CreateStorageLocationResultMessage] = js.native
    def deleteApplication(params: DeleteApplicationMessage, callback: Callback[js.Object]): Unit = js.native
    def deleteApplication(params: DeleteApplicationMessage): Request[js.Object] = js.native
    def deleteApplicationVersion(params: DeleteApplicationVersionMessage, callback: Callback[js.Object]): Unit = js.native
    def deleteApplicationVersion(params: DeleteApplicationVersionMessage): Request[js.Object] = js.native
    def deleteConfigurationTemplate(params: DeleteConfigurationTemplateMessage, callback: Callback[js.Object]): Unit = js.native
    def deleteConfigurationTemplate(params: DeleteConfigurationTemplateMessage): Request[js.Object] = js.native
    def deleteEnvironmentConfiguration(params: DeleteEnvironmentConfigurationMessage, callback: Callback[js.Object]): Unit = js.native
    def deleteEnvironmentConfiguration(params: DeleteEnvironmentConfigurationMessage): Request[js.Object] = js.native
    def describeApplicationVersions(params: DescribeApplicationVersionsMessage, callback: Callback[ApplicationVersionDescriptionsMessage]): Unit = js.native
    def describeApplicationVersions(params: DescribeApplicationVersionsMessage): Request[ApplicationVersionDescriptionsMessage] = js.native
    def describeApplications(params: DescribeApplicationsMessage, callback: Callback[ApplicationDescriptionsMessage]): Unit = js.native
    def describeApplications(params: DescribeApplicationsMessage): Request[ApplicationDescriptionsMessage] = js.native
    def describeConfigurationOptions(params: DescribeConfigurationOptionsMessage, callback: Callback[ConfigurationOptionsDescription]): Unit = js.native
    def describeConfigurationOptions(params: DescribeConfigurationOptionsMessage): Request[ConfigurationOptionsDescription] = js.native
    def describeConfigurationSettings(params: DescribeConfigurationSettingsMessage, callback: Callback[ConfigurationSettingsDescriptions]): Unit = js.native
    def describeConfigurationSettings(params: DescribeConfigurationSettingsMessage): Request[ConfigurationSettingsDescriptions] = js.native
    def describeEnvironmentResources(params: DescribeEnvironmentResourcesMessage, callback: Callback[EnvironmentResourceDescriptionsMessage]): Unit = js.native
    def describeEnvironmentResources(params: DescribeEnvironmentResourcesMessage): Request[EnvironmentResourceDescriptionsMessage] = js.native
    def describeEnvironments(params: DescribeEnvironmentsMessage, callback: Callback[EnvironmentDescriptionsMessage]): Unit = js.native
    def describeEnvironments(params: DescribeEnvironmentsMessage): Request[EnvironmentDescriptionsMessage] = js.native
    def describeEvents(params: DescribeEventsMessage, callback: Callback[EventDescriptionsMessage]): Unit = js.native
    def describeEvents(params: DescribeEventsMessage): Request[EventDescriptionsMessage] = js.native
    def listAvailableSolutionStacks(callback: Callback[ListAvailableSolutionStacksResultMessage]): Unit = js.native
    def listAvailableSolutionStacks(): Request[ListAvailableSolutionStacksResultMessage] = js.native
    def rebuildEnvironment(params: RebuildEnvironmentMessage, callback: Callback[js.Object]): Unit = js.native
    def rebuildEnvironment(params: RebuildEnvironmentMessage): Request[js.Object] = js.native
    def requestEnvironmentInfo(params: RequestEnvironmentInfoMessage, callback: Callback[js.Object]): Unit = js.native
    def requestEnvironmentInfo(params: RequestEnvironmentInfoMessage): Request[js.Object] = js.native
    def restartAppServer(params: RestartAppServerMessage, callback: Callback[js.Object]): Unit = js.native
    def restartAppServer(params: RestartAppServerMessage): Request[js.Object] = js.native
    def retrieveEnvironmentInfo(params: RetrieveEnvironmentInfoMessage, callback: Callback[RetrieveEnvironmentInfoResultMessage]): Unit = js.native
    def retrieveEnvironmentInfo(params: RetrieveEnvironmentInfoMessage): Request[RetrieveEnvironmentInfoResultMessage] = js.native
    def swapEnvironmentCNAMEs(params: SwapEnvironmentCNAMEsMessage, callback: Callback[js.Object]): Unit = js.native
    def swapEnvironmentCNAMEs(params: SwapEnvironmentCNAMEsMessage): Request[js.Object] = js.native
    def terminateEnvironment(params: TerminateEnvironmentMessage, callback: Callback[EnvironmentDescription]): Unit = js.native
    def terminateEnvironment(params: TerminateEnvironmentMessage): Request[EnvironmentDescription] = js.native
    def updateApplication(params: UpdateApplicationMessage, callback: Callback[ApplicationDescriptionMessage]): Unit = js.native
    def updateApplication(params: UpdateApplicationMessage): Request[ApplicationDescriptionMessage] = js.native
    def updateApplicationVersion(params: UpdateApplicationVersionMessage, callback: Callback[ApplicationVersionDescriptionMessage]): Unit = js.native
    def updateApplicationVersion(params: UpdateApplicationVersionMessage): Request[ApplicationVersionDescriptionMessage] = js.native
    def updateConfigurationTemplate(params: UpdateConfigurationTemplateMessage, callback: Callback[ConfigurationSettingsDescription]): Unit = js.native
    def updateConfigurationTemplate(params: UpdateConfigurationTemplateMessage): Request[ConfigurationSettingsDescription] = js.native
    def updateEnvironment(params: UpdateEnvironmentMessage, callback: Callback[EnvironmentDescription]): Unit = js.native
    def updateEnvironment(params: UpdateEnvironmentMessage): Request[EnvironmentDescription] = js.native
    def validateConfigurationSettings(params: ValidateConfigurationSettingsMessage, callback: Callback[ConfigurationSettingsValidationMessages]): Unit = js.native
    def validateConfigurationSettings(params: ValidateConfigurationSettingsMessage): Request[ConfigurationSettingsValidationMessages] = js.native
  }

  /**
   * <p></p>
   */
  @js.native
  trait AbortEnvironmentUpdateMessage extends js.Object {
    var EnvironmentId: EnvironmentId
    var EnvironmentName: EnvironmentName
  }

  object AbortEnvironmentUpdateMessage {
    def apply(
      EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
      EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
    ): AbortEnvironmentUpdateMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EnvironmentId" -> EnvironmentId.map { x => x: js.Any }),
        ("EnvironmentName" -> EnvironmentName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AbortEnvironmentUpdateMessage]
    }
  }

  /**
   * <p>Describes the properties of an application.</p>
   */
  @js.native
  trait ApplicationDescription extends js.Object {
    var Versions: VersionLabelsList
    var Description: Description
    var ApplicationName: ApplicationName
    var DateCreated: CreationDate
    var DateUpdated: UpdateDate
    var ConfigurationTemplates: ConfigurationTemplateNamesList
  }

  object ApplicationDescription {
    def apply(
      Versions: js.UndefOr[VersionLabelsList] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      DateCreated: js.UndefOr[CreationDate] = js.undefined,
      DateUpdated: js.UndefOr[UpdateDate] = js.undefined,
      ConfigurationTemplates: js.UndefOr[ConfigurationTemplateNamesList] = js.undefined
    ): ApplicationDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Versions" -> Versions.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("ApplicationName" -> ApplicationName.map { x => x: js.Any }),
        ("DateCreated" -> DateCreated.map { x => x: js.Any }),
        ("DateUpdated" -> DateUpdated.map { x => x: js.Any }),
        ("ConfigurationTemplates" -> ConfigurationTemplates.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationDescription]
    }
  }

  /**
   * <p>Result message containing a single description of an application.</p>
   */
  @js.native
  trait ApplicationDescriptionMessage extends js.Object {
    var Application: ApplicationDescription
  }

  object ApplicationDescriptionMessage {
    def apply(
      Application: js.UndefOr[ApplicationDescription] = js.undefined
    ): ApplicationDescriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Application" -> Application.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationDescriptionMessage]
    }
  }

  /**
   * <p>Result message containing a list of application descriptions.</p>
   */
  @js.native
  trait ApplicationDescriptionsMessage extends js.Object {
    var Applications: ApplicationDescriptionList
  }

  object ApplicationDescriptionsMessage {
    def apply(
      Applications: js.UndefOr[ApplicationDescriptionList] = js.undefined
    ): ApplicationDescriptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Applications" -> Applications.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationDescriptionsMessage]
    }
  }

  /**
   * <p> Describes the properties of an application version. </p>
   */
  @js.native
  trait ApplicationVersionDescription extends js.Object {
    var Description: Description
    var VersionLabel: VersionLabel
    var ApplicationName: ApplicationName
    var DateCreated: CreationDate
    var SourceBundle: S3Location
    var DateUpdated: UpdateDate
  }

  object ApplicationVersionDescription {
    def apply(
      Description: js.UndefOr[Description] = js.undefined,
      VersionLabel: js.UndefOr[VersionLabel] = js.undefined,
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      DateCreated: js.UndefOr[CreationDate] = js.undefined,
      SourceBundle: js.UndefOr[S3Location] = js.undefined,
      DateUpdated: js.UndefOr[UpdateDate] = js.undefined
    ): ApplicationVersionDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Description" -> Description.map { x => x: js.Any }),
        ("VersionLabel" -> VersionLabel.map { x => x: js.Any }),
        ("ApplicationName" -> ApplicationName.map { x => x: js.Any }),
        ("DateCreated" -> DateCreated.map { x => x: js.Any }),
        ("SourceBundle" -> SourceBundle.map { x => x: js.Any }),
        ("DateUpdated" -> DateUpdated.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationVersionDescription]
    }
  }

  /**
   * <p> Result message wrapping a single description of an application version. </p>
   */
  @js.native
  trait ApplicationVersionDescriptionMessage extends js.Object {
    var ApplicationVersion: ApplicationVersionDescription
  }

  object ApplicationVersionDescriptionMessage {
    def apply(
      ApplicationVersion: js.UndefOr[ApplicationVersionDescription] = js.undefined
    ): ApplicationVersionDescriptionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ApplicationVersion" -> ApplicationVersion.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationVersionDescriptionMessage]
    }
  }

  /**
   * <p>Result message wrapping a list of application version descriptions.</p>
   */
  @js.native
  trait ApplicationVersionDescriptionsMessage extends js.Object {
    var ApplicationVersions: ApplicationVersionDescriptionList
  }

  object ApplicationVersionDescriptionsMessage {
    def apply(
      ApplicationVersions: js.UndefOr[ApplicationVersionDescriptionList] = js.undefined
    ): ApplicationVersionDescriptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ApplicationVersions" -> ApplicationVersions.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApplicationVersionDescriptionsMessage]
    }
  }

  /**
   * <p> Describes an Auto Scaling launch configuration. </p>
   */
  @js.native
  trait AutoScalingGroup extends js.Object {
    var Name: ResourceId
  }

  object AutoScalingGroup {
    def apply(
      Name: js.UndefOr[ResourceId] = js.undefined
    ): AutoScalingGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AutoScalingGroup]
    }
  }

  /**
   * <p>Results message indicating whether a CNAME is available.</p>
   */
  @js.native
  trait CheckDNSAvailabilityMessage extends js.Object {
    var CNAMEPrefix: DNSCnamePrefix
  }

  object CheckDNSAvailabilityMessage {
    def apply(
      CNAMEPrefix: js.UndefOr[DNSCnamePrefix] = js.undefined
    ): CheckDNSAvailabilityMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CNAMEPrefix" -> CNAMEPrefix.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CheckDNSAvailabilityMessage]
    }
  }

  /**
   * <p>Indicates if the specified CNAME is available.</p>
   */
  @js.native
  trait CheckDNSAvailabilityResultMessage extends js.Object {
    var Available: CnameAvailability
    var FullyQualifiedCNAME: DNSCname
  }

  object CheckDNSAvailabilityResultMessage {
    def apply(
      Available: js.UndefOr[CnameAvailability] = js.undefined,
      FullyQualifiedCNAME: js.UndefOr[DNSCname] = js.undefined
    ): CheckDNSAvailabilityResultMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Available" -> Available.map { x => x: js.Any }),
        ("FullyQualifiedCNAME" -> FullyQualifiedCNAME.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CheckDNSAvailabilityResultMessage]
    }
  }


  object ConfigurationDeploymentStatusEnum {
    val deployed = "deployed"
    val pending = "pending"
    val failed = "failed"

    val values = IndexedSeq(deployed, pending, failed)
  }

  /**
   * <p> Describes the possible values for a configuration option. </p>
   */
  @js.native
  trait ConfigurationOptionDescription extends js.Object {
    var UserDefined: UserDefinedOption
    var ValueOptions: ConfigurationOptionPossibleValues
    var Name: ConfigurationOptionName
    var ValueType: ConfigurationOptionValueType
    var ChangeSeverity: ConfigurationOptionSeverity
    var DefaultValue: ConfigurationOptionDefaultValue
    var MaxLength: OptionRestrictionMaxLength
    var MinValue: OptionRestrictionMinValue
    var Namespace: OptionNamespace
    var Regex: OptionRestrictionRegex
    var MaxValue: OptionRestrictionMaxValue
  }

  object ConfigurationOptionDescription {
    def apply(
      UserDefined: js.UndefOr[UserDefinedOption] = js.undefined,
      ValueOptions: js.UndefOr[ConfigurationOptionPossibleValues] = js.undefined,
      Name: js.UndefOr[ConfigurationOptionName] = js.undefined,
      ValueType: js.UndefOr[ConfigurationOptionValueType] = js.undefined,
      ChangeSeverity: js.UndefOr[ConfigurationOptionSeverity] = js.undefined,
      DefaultValue: js.UndefOr[ConfigurationOptionDefaultValue] = js.undefined,
      MaxLength: js.UndefOr[OptionRestrictionMaxLength] = js.undefined,
      MinValue: js.UndefOr[OptionRestrictionMinValue] = js.undefined,
      Namespace: js.UndefOr[OptionNamespace] = js.undefined,
      Regex: js.UndefOr[OptionRestrictionRegex] = js.undefined,
      MaxValue: js.UndefOr[OptionRestrictionMaxValue] = js.undefined
    ): ConfigurationOptionDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("UserDefined" -> UserDefined.map { x => x: js.Any }),
        ("ValueOptions" -> ValueOptions.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("ValueType" -> ValueType.map { x => x: js.Any }),
        ("ChangeSeverity" -> ChangeSeverity.map { x => x: js.Any }),
        ("DefaultValue" -> DefaultValue.map { x => x: js.Any }),
        ("MaxLength" -> MaxLength.map { x => x: js.Any }),
        ("MinValue" -> MinValue.map { x => x: js.Any }),
        ("Namespace" -> Namespace.map { x => x: js.Any }),
        ("Regex" -> Regex.map { x => x: js.Any }),
        ("MaxValue" -> MaxValue.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigurationOptionDescription]
    }
  }

  /**
   * <p> A specification identifying an individual configuration option along with its current value. For a list of possible option values, go to <a href="http://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options.html">Option Values</a> in the <i>AWS Elastic Beanstalk Developer Guide</i>. </p>
   */
  @js.native
  trait ConfigurationOptionSetting extends js.Object {
    var Namespace: OptionNamespace
    var OptionName: ConfigurationOptionName
    var Value: ConfigurationOptionValue
  }

  object ConfigurationOptionSetting {
    def apply(
      Namespace: js.UndefOr[OptionNamespace] = js.undefined,
      OptionName: js.UndefOr[ConfigurationOptionName] = js.undefined,
      Value: js.UndefOr[ConfigurationOptionValue] = js.undefined
    ): ConfigurationOptionSetting = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Namespace" -> Namespace.map { x => x: js.Any }),
        ("OptionName" -> OptionName.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigurationOptionSetting]
    }
  }


  object ConfigurationOptionValueTypeEnum {
    val Scalar = "Scalar"
    val List = "List"

    val values = IndexedSeq(Scalar, List)
  }

  /**
   * <p>Describes the settings for a specified configuration set.</p>
   */
  @js.native
  trait ConfigurationOptionsDescription extends js.Object {
    var SolutionStackName: SolutionStackName
    var Options: ConfigurationOptionDescriptionsList
  }

  object ConfigurationOptionsDescription {
    def apply(
      SolutionStackName: js.UndefOr[SolutionStackName] = js.undefined,
      Options: js.UndefOr[ConfigurationOptionDescriptionsList] = js.undefined
    ): ConfigurationOptionsDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SolutionStackName" -> SolutionStackName.map { x => x: js.Any }),
        ("Options" -> Options.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigurationOptionsDescription]
    }
  }

  /**
   * <p> Describes the settings for a configuration set. </p>
   */
  @js.native
  trait ConfigurationSettingsDescription extends js.Object {
    var Description: Description
    var SolutionStackName: SolutionStackName
    var DeploymentStatus: ConfigurationDeploymentStatus
    var OptionSettings: ConfigurationOptionSettingsList
    var TemplateName: ConfigurationTemplateName
    var EnvironmentName: EnvironmentName
    var ApplicationName: ApplicationName
    var DateCreated: CreationDate
    var DateUpdated: UpdateDate
  }

  object ConfigurationSettingsDescription {
    def apply(
      Description: js.UndefOr[Description] = js.undefined,
      SolutionStackName: js.UndefOr[SolutionStackName] = js.undefined,
      DeploymentStatus: js.UndefOr[ConfigurationDeploymentStatus] = js.undefined,
      OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.undefined,
      TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined,
      EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      DateCreated: js.UndefOr[CreationDate] = js.undefined,
      DateUpdated: js.UndefOr[UpdateDate] = js.undefined
    ): ConfigurationSettingsDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Description" -> Description.map { x => x: js.Any }),
        ("SolutionStackName" -> SolutionStackName.map { x => x: js.Any }),
        ("DeploymentStatus" -> DeploymentStatus.map { x => x: js.Any }),
        ("OptionSettings" -> OptionSettings.map { x => x: js.Any }),
        ("TemplateName" -> TemplateName.map { x => x: js.Any }),
        ("EnvironmentName" -> EnvironmentName.map { x => x: js.Any }),
        ("ApplicationName" -> ApplicationName.map { x => x: js.Any }),
        ("DateCreated" -> DateCreated.map { x => x: js.Any }),
        ("DateUpdated" -> DateUpdated.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigurationSettingsDescription]
    }
  }

  /**
   * <p>The results from a request to change the configuration settings of an environment.</p>
   */
  @js.native
  trait ConfigurationSettingsDescriptions extends js.Object {
    var ConfigurationSettings: ConfigurationSettingsDescriptionList
  }

  object ConfigurationSettingsDescriptions {
    def apply(
      ConfigurationSettings: js.UndefOr[ConfigurationSettingsDescriptionList] = js.undefined
    ): ConfigurationSettingsDescriptions = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigurationSettings" -> ConfigurationSettings.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigurationSettingsDescriptions]
    }
  }

  /**
   * <p>Provides a list of validation messages.</p>
   */
  @js.native
  trait ConfigurationSettingsValidationMessages extends js.Object {
    var Messages: ValidationMessagesList
  }

  object ConfigurationSettingsValidationMessages {
    def apply(
      Messages: js.UndefOr[ValidationMessagesList] = js.undefined
    ): ConfigurationSettingsValidationMessages = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Messages" -> Messages.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigurationSettingsValidationMessages]
    }
  }

  /**
   * <p>This documentation target is not reported in the API reference.</p>
   */
  @js.native
  trait CreateApplicationMessage extends js.Object {
    var ApplicationName: ApplicationName
    var Description: Description
  }

  object CreateApplicationMessage {
    def apply(
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined
    ): CreateApplicationMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ApplicationName" -> ApplicationName.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateApplicationMessage]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait CreateApplicationVersionMessage extends js.Object {
    var Description: Description
    var VersionLabel: VersionLabel
    var AutoCreateApplication: AutoCreateApplication
    var ApplicationName: ApplicationName
    var SourceBundle: S3Location
  }

  object CreateApplicationVersionMessage {
    def apply(
      Description: js.UndefOr[Description] = js.undefined,
      VersionLabel: js.UndefOr[VersionLabel] = js.undefined,
      AutoCreateApplication: js.UndefOr[AutoCreateApplication] = js.undefined,
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      SourceBundle: js.UndefOr[S3Location] = js.undefined
    ): CreateApplicationVersionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Description" -> Description.map { x => x: js.Any }),
        ("VersionLabel" -> VersionLabel.map { x => x: js.Any }),
        ("AutoCreateApplication" -> AutoCreateApplication.map { x => x: js.Any }),
        ("ApplicationName" -> ApplicationName.map { x => x: js.Any }),
        ("SourceBundle" -> SourceBundle.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateApplicationVersionMessage]
    }
  }

  /**
   * <p>This documentation target is not reported in the API reference.</p>
   */
  @js.native
  trait CreateConfigurationTemplateMessage extends js.Object {
    var Description: Description
    var EnvironmentId: EnvironmentId
    var SourceConfiguration: SourceConfiguration
    var SolutionStackName: SolutionStackName
    var OptionSettings: ConfigurationOptionSettingsList
    var TemplateName: ConfigurationTemplateName
    var ApplicationName: ApplicationName
  }

  object CreateConfigurationTemplateMessage {
    def apply(
      Description: js.UndefOr[Description] = js.undefined,
      EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
      SourceConfiguration: js.UndefOr[SourceConfiguration] = js.undefined,
      SolutionStackName: js.UndefOr[SolutionStackName] = js.undefined,
      OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.undefined,
      TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined,
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined
    ): CreateConfigurationTemplateMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Description" -> Description.map { x => x: js.Any }),
        ("EnvironmentId" -> EnvironmentId.map { x => x: js.Any }),
        ("SourceConfiguration" -> SourceConfiguration.map { x => x: js.Any }),
        ("SolutionStackName" -> SolutionStackName.map { x => x: js.Any }),
        ("OptionSettings" -> OptionSettings.map { x => x: js.Any }),
        ("TemplateName" -> TemplateName.map { x => x: js.Any }),
        ("ApplicationName" -> ApplicationName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateConfigurationTemplateMessage]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait CreateEnvironmentMessage extends js.Object {
    var OptionsToRemove: OptionsSpecifierList
    var Description: Description
    var VersionLabel: VersionLabel
    var Tier: EnvironmentTier
    var SolutionStackName: SolutionStackName
    var OptionSettings: ConfigurationOptionSettingsList
    var TemplateName: ConfigurationTemplateName
    var EnvironmentName: EnvironmentName
    var CNAMEPrefix: DNSCnamePrefix
    var Tags: Tags
    var ApplicationName: ApplicationName
  }

  object CreateEnvironmentMessage {
    def apply(
      OptionsToRemove: js.UndefOr[OptionsSpecifierList] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      VersionLabel: js.UndefOr[VersionLabel] = js.undefined,
      Tier: js.UndefOr[EnvironmentTier] = js.undefined,
      SolutionStackName: js.UndefOr[SolutionStackName] = js.undefined,
      OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.undefined,
      TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined,
      EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
      CNAMEPrefix: js.UndefOr[DNSCnamePrefix] = js.undefined,
      Tags: js.UndefOr[Tags] = js.undefined,
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined
    ): CreateEnvironmentMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OptionsToRemove" -> OptionsToRemove.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("VersionLabel" -> VersionLabel.map { x => x: js.Any }),
        ("Tier" -> Tier.map { x => x: js.Any }),
        ("SolutionStackName" -> SolutionStackName.map { x => x: js.Any }),
        ("OptionSettings" -> OptionSettings.map { x => x: js.Any }),
        ("TemplateName" -> TemplateName.map { x => x: js.Any }),
        ("EnvironmentName" -> EnvironmentName.map { x => x: js.Any }),
        ("CNAMEPrefix" -> CNAMEPrefix.map { x => x: js.Any }),
        ("Tags" -> Tags.map { x => x: js.Any }),
        ("ApplicationName" -> ApplicationName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEnvironmentMessage]
    }
  }

  /**
   * <p>Results of a <a>CreateStorageLocationResult</a> call.</p>
   */
  @js.native
  trait CreateStorageLocationResultMessage extends js.Object {
    var S3Bucket: S3Bucket
  }

  object CreateStorageLocationResultMessage {
    def apply(
      S3Bucket: js.UndefOr[S3Bucket] = js.undefined
    ): CreateStorageLocationResultMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("S3Bucket" -> S3Bucket.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateStorageLocationResultMessage]
    }
  }

  /**
   * <p>This documentation target is not reported in the API reference.</p>
   */
  @js.native
  trait DeleteApplicationMessage extends js.Object {
    var ApplicationName: ApplicationName
    var TerminateEnvByForce: TerminateEnvForce
  }

  object DeleteApplicationMessage {
    def apply(
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      TerminateEnvByForce: js.UndefOr[TerminateEnvForce] = js.undefined
    ): DeleteApplicationMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ApplicationName" -> ApplicationName.map { x => x: js.Any }),
        ("TerminateEnvByForce" -> TerminateEnvByForce.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApplicationMessage]
    }
  }

  /**
   * <p>This documentation target is not reported in the API reference.</p>
   */
  @js.native
  trait DeleteApplicationVersionMessage extends js.Object {
    var ApplicationName: ApplicationName
    var VersionLabel: VersionLabel
    var DeleteSourceBundle: DeleteSourceBundle
  }

  object DeleteApplicationVersionMessage {
    def apply(
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      VersionLabel: js.UndefOr[VersionLabel] = js.undefined,
      DeleteSourceBundle: js.UndefOr[DeleteSourceBundle] = js.undefined
    ): DeleteApplicationVersionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ApplicationName" -> ApplicationName.map { x => x: js.Any }),
        ("VersionLabel" -> VersionLabel.map { x => x: js.Any }),
        ("DeleteSourceBundle" -> DeleteSourceBundle.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApplicationVersionMessage]
    }
  }

  /**
   * <p>This documentation target is not reported in the API reference.</p>
   */
  @js.native
  trait DeleteConfigurationTemplateMessage extends js.Object {
    var ApplicationName: ApplicationName
    var TemplateName: ConfigurationTemplateName
  }

  object DeleteConfigurationTemplateMessage {
    def apply(
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined
    ): DeleteConfigurationTemplateMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ApplicationName" -> ApplicationName.map { x => x: js.Any }),
        ("TemplateName" -> TemplateName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConfigurationTemplateMessage]
    }
  }

  /**
   * <p>This documentation target is not reported in the API reference.</p>
   */
  @js.native
  trait DeleteEnvironmentConfigurationMessage extends js.Object {
    var ApplicationName: ApplicationName
    var EnvironmentName: EnvironmentName
  }

  object DeleteEnvironmentConfigurationMessage {
    def apply(
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
    ): DeleteEnvironmentConfigurationMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ApplicationName" -> ApplicationName.map { x => x: js.Any }),
        ("EnvironmentName" -> EnvironmentName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEnvironmentConfigurationMessage]
    }
  }

  /**
   * <p>Result message containing a list of configuration descriptions.</p>
   */
  @js.native
  trait DescribeApplicationVersionsMessage extends js.Object {
    var ApplicationName: ApplicationName
    var VersionLabels: VersionLabelsList
  }

  object DescribeApplicationVersionsMessage {
    def apply(
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      VersionLabels: js.UndefOr[VersionLabelsList] = js.undefined
    ): DescribeApplicationVersionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ApplicationName" -> ApplicationName.map { x => x: js.Any }),
        ("VersionLabels" -> VersionLabels.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeApplicationVersionsMessage]
    }
  }

  /**
   * <p>This documentation target is not reported in the API reference.</p>
   */
  @js.native
  trait DescribeApplicationsMessage extends js.Object {
    var ApplicationNames: ApplicationNamesList
  }

  object DescribeApplicationsMessage {
    def apply(
      ApplicationNames: js.UndefOr[ApplicationNamesList] = js.undefined
    ): DescribeApplicationsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ApplicationNames" -> ApplicationNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeApplicationsMessage]
    }
  }

  /**
   * <p>Result message containig a list of application version descriptions. </p>
   */
  @js.native
  trait DescribeConfigurationOptionsMessage extends js.Object {
    var SolutionStackName: SolutionStackName
    var TemplateName: ConfigurationTemplateName
    var EnvironmentName: EnvironmentName
    var Options: OptionsSpecifierList
    var ApplicationName: ApplicationName
  }

  object DescribeConfigurationOptionsMessage {
    def apply(
      SolutionStackName: js.UndefOr[SolutionStackName] = js.undefined,
      TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined,
      EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
      Options: js.UndefOr[OptionsSpecifierList] = js.undefined,
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined
    ): DescribeConfigurationOptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SolutionStackName" -> SolutionStackName.map { x => x: js.Any }),
        ("TemplateName" -> TemplateName.map { x => x: js.Any }),
        ("EnvironmentName" -> EnvironmentName.map { x => x: js.Any }),
        ("Options" -> Options.map { x => x: js.Any }),
        ("ApplicationName" -> ApplicationName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigurationOptionsMessage]
    }
  }

  /**
   * <p>Result message containing all of the configuration settings for a specified solution stack or configuration template.</p>
   */
  @js.native
  trait DescribeConfigurationSettingsMessage extends js.Object {
    var ApplicationName: ApplicationName
    var TemplateName: ConfigurationTemplateName
    var EnvironmentName: EnvironmentName
  }

  object DescribeConfigurationSettingsMessage {
    def apply(
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined,
      EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
    ): DescribeConfigurationSettingsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ApplicationName" -> ApplicationName.map { x => x: js.Any }),
        ("TemplateName" -> TemplateName.map { x => x: js.Any }),
        ("EnvironmentName" -> EnvironmentName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigurationSettingsMessage]
    }
  }

  /**
   * <p>This documentation target is not reported in the API reference.</p>
   */
  @js.native
  trait DescribeEnvironmentResourcesMessage extends js.Object {
    var EnvironmentId: EnvironmentId
    var EnvironmentName: EnvironmentName
  }

  object DescribeEnvironmentResourcesMessage {
    def apply(
      EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
      EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
    ): DescribeEnvironmentResourcesMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EnvironmentId" -> EnvironmentId.map { x => x: js.Any }),
        ("EnvironmentName" -> EnvironmentName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEnvironmentResourcesMessage]
    }
  }

  /**
   * <p>This documentation target is not reported in the API reference.</p>
   */
  @js.native
  trait DescribeEnvironmentsMessage extends js.Object {
    var IncludeDeleted: IncludeDeleted
    var VersionLabel: VersionLabel
    var EnvironmentNames: EnvironmentNamesList
    var ApplicationName: ApplicationName
    var EnvironmentIds: EnvironmentIdList
    var IncludedDeletedBackTo: IncludeDeletedBackTo
  }

  object DescribeEnvironmentsMessage {
    def apply(
      IncludeDeleted: js.UndefOr[IncludeDeleted] = js.undefined,
      VersionLabel: js.UndefOr[VersionLabel] = js.undefined,
      EnvironmentNames: js.UndefOr[EnvironmentNamesList] = js.undefined,
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      EnvironmentIds: js.UndefOr[EnvironmentIdList] = js.undefined,
      IncludedDeletedBackTo: js.UndefOr[IncludeDeletedBackTo] = js.undefined
    ): DescribeEnvironmentsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("IncludeDeleted" -> IncludeDeleted.map { x => x: js.Any }),
        ("VersionLabel" -> VersionLabel.map { x => x: js.Any }),
        ("EnvironmentNames" -> EnvironmentNames.map { x => x: js.Any }),
        ("ApplicationName" -> ApplicationName.map { x => x: js.Any }),
        ("EnvironmentIds" -> EnvironmentIds.map { x => x: js.Any }),
        ("IncludedDeletedBackTo" -> IncludedDeletedBackTo.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEnvironmentsMessage]
    }
  }

  /**
   * <p>This documentation target is not reported in the API reference.</p>
   */
  @js.native
  trait DescribeEventsMessage extends js.Object {
    var EnvironmentId: EnvironmentId
    var RequestId: RequestId
    var VersionLabel: VersionLabel
    var StartTime: TimeFilterStart
    var EndTime: TimeFilterEnd
    var MaxRecords: MaxRecords
    var TemplateName: ConfigurationTemplateName
    var EnvironmentName: EnvironmentName
    var ApplicationName: ApplicationName
    var NextToken: Token
    var Severity: EventSeverity
  }

  object DescribeEventsMessage {
    def apply(
      EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
      RequestId: js.UndefOr[RequestId] = js.undefined,
      VersionLabel: js.UndefOr[VersionLabel] = js.undefined,
      StartTime: js.UndefOr[TimeFilterStart] = js.undefined,
      EndTime: js.UndefOr[TimeFilterEnd] = js.undefined,
      MaxRecords: js.UndefOr[MaxRecords] = js.undefined,
      TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined,
      EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      NextToken: js.UndefOr[Token] = js.undefined,
      Severity: js.UndefOr[EventSeverity] = js.undefined
    ): DescribeEventsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EnvironmentId" -> EnvironmentId.map { x => x: js.Any }),
        ("RequestId" -> RequestId.map { x => x: js.Any }),
        ("VersionLabel" -> VersionLabel.map { x => x: js.Any }),
        ("StartTime" -> StartTime.map { x => x: js.Any }),
        ("EndTime" -> EndTime.map { x => x: js.Any }),
        ("MaxRecords" -> MaxRecords.map { x => x: js.Any }),
        ("TemplateName" -> TemplateName.map { x => x: js.Any }),
        ("EnvironmentName" -> EnvironmentName.map { x => x: js.Any }),
        ("ApplicationName" -> ApplicationName.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any }),
        ("Severity" -> Severity.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEventsMessage]
    }
  }

  /**
   * <p>Describes the properties of an environment.</p>
   */
  @js.native
  trait EnvironmentDescription extends js.Object {
    var Resources: EnvironmentResourcesDescription
    var EndpointURL: EndpointURL
    var Description: Description
    var EnvironmentId: EnvironmentId
    var Health: EnvironmentHealth
    var VersionLabel: VersionLabel
    var Tier: EnvironmentTier
    var SolutionStackName: SolutionStackName
    var CNAME: DNSCname
    var AbortableOperationInProgress: AbortableOperationInProgress
    var TemplateName: ConfigurationTemplateName
    var EnvironmentName: EnvironmentName
    var ApplicationName: ApplicationName
    var DateCreated: CreationDate
    var DateUpdated: UpdateDate
    var Status: EnvironmentStatus
  }

  object EnvironmentDescription {
    def apply(
      Resources: js.UndefOr[EnvironmentResourcesDescription] = js.undefined,
      EndpointURL: js.UndefOr[EndpointURL] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
      Health: js.UndefOr[EnvironmentHealth] = js.undefined,
      VersionLabel: js.UndefOr[VersionLabel] = js.undefined,
      Tier: js.UndefOr[EnvironmentTier] = js.undefined,
      SolutionStackName: js.UndefOr[SolutionStackName] = js.undefined,
      CNAME: js.UndefOr[DNSCname] = js.undefined,
      AbortableOperationInProgress: js.UndefOr[AbortableOperationInProgress] = js.undefined,
      TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined,
      EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      DateCreated: js.UndefOr[CreationDate] = js.undefined,
      DateUpdated: js.UndefOr[UpdateDate] = js.undefined,
      Status: js.UndefOr[EnvironmentStatus] = js.undefined
    ): EnvironmentDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Resources" -> Resources.map { x => x: js.Any }),
        ("EndpointURL" -> EndpointURL.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("EnvironmentId" -> EnvironmentId.map { x => x: js.Any }),
        ("Health" -> Health.map { x => x: js.Any }),
        ("VersionLabel" -> VersionLabel.map { x => x: js.Any }),
        ("Tier" -> Tier.map { x => x: js.Any }),
        ("SolutionStackName" -> SolutionStackName.map { x => x: js.Any }),
        ("CNAME" -> CNAME.map { x => x: js.Any }),
        ("AbortableOperationInProgress" -> AbortableOperationInProgress.map { x => x: js.Any }),
        ("TemplateName" -> TemplateName.map { x => x: js.Any }),
        ("EnvironmentName" -> EnvironmentName.map { x => x: js.Any }),
        ("ApplicationName" -> ApplicationName.map { x => x: js.Any }),
        ("DateCreated" -> DateCreated.map { x => x: js.Any }),
        ("DateUpdated" -> DateUpdated.map { x => x: js.Any }),
        ("Status" -> Status.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnvironmentDescription]
    }
  }

  /**
   * <p>Result message containing a list of environment descriptions.</p>
   */
  @js.native
  trait EnvironmentDescriptionsMessage extends js.Object {
    var Environments: EnvironmentDescriptionsList
  }

  object EnvironmentDescriptionsMessage {
    def apply(
      Environments: js.UndefOr[EnvironmentDescriptionsList] = js.undefined
    ): EnvironmentDescriptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Environments" -> Environments.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnvironmentDescriptionsMessage]
    }
  }


  object EnvironmentHealthEnum {
    val Green = "Green"
    val Yellow = "Yellow"
    val Red = "Red"
    val Grey = "Grey"

    val values = IndexedSeq(Green, Yellow, Red, Grey)
  }

  /**
   * <p>The information retrieved from the Amazon EC2 instances.</p>
   */
  @js.native
  trait EnvironmentInfoDescription extends js.Object {
    var InfoType: EnvironmentInfoType
    var Ec2InstanceId: Ec2InstanceId
    var SampleTimestamp: SampleTimestamp
    var Message: Message
  }

  object EnvironmentInfoDescription {
    def apply(
      InfoType: js.UndefOr[EnvironmentInfoType] = js.undefined,
      Ec2InstanceId: js.UndefOr[Ec2InstanceId] = js.undefined,
      SampleTimestamp: js.UndefOr[SampleTimestamp] = js.undefined,
      Message: js.UndefOr[Message] = js.undefined
    ): EnvironmentInfoDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("InfoType" -> InfoType.map { x => x: js.Any }),
        ("Ec2InstanceId" -> Ec2InstanceId.map { x => x: js.Any }),
        ("SampleTimestamp" -> SampleTimestamp.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnvironmentInfoDescription]
    }
  }


  object EnvironmentInfoTypeEnum {
    val tail = "tail"
    val bundle = "bundle"

    val values = IndexedSeq(tail, bundle)
  }

  /**
   * <p>Describes the AWS resources in use by this environment. This data is live.</p>
   */
  @js.native
  trait EnvironmentResourceDescription extends js.Object {
    var AutoScalingGroups: AutoScalingGroupList
    var LaunchConfigurations: LaunchConfigurationList
    var Instances: InstanceList
    var EnvironmentName: EnvironmentName
    var LoadBalancers: LoadBalancerList
    var Triggers: TriggerList
    var Queues: QueueList
  }

  object EnvironmentResourceDescription {
    def apply(
      AutoScalingGroups: js.UndefOr[AutoScalingGroupList] = js.undefined,
      LaunchConfigurations: js.UndefOr[LaunchConfigurationList] = js.undefined,
      Instances: js.UndefOr[InstanceList] = js.undefined,
      EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
      LoadBalancers: js.UndefOr[LoadBalancerList] = js.undefined,
      Triggers: js.UndefOr[TriggerList] = js.undefined,
      Queues: js.UndefOr[QueueList] = js.undefined
    ): EnvironmentResourceDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AutoScalingGroups" -> AutoScalingGroups.map { x => x: js.Any }),
        ("LaunchConfigurations" -> LaunchConfigurations.map { x => x: js.Any }),
        ("Instances" -> Instances.map { x => x: js.Any }),
        ("EnvironmentName" -> EnvironmentName.map { x => x: js.Any }),
        ("LoadBalancers" -> LoadBalancers.map { x => x: js.Any }),
        ("Triggers" -> Triggers.map { x => x: js.Any }),
        ("Queues" -> Queues.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnvironmentResourceDescription]
    }
  }

  /**
   * <p>Result message containing a list of environment resource descriptions. </p>
   */
  @js.native
  trait EnvironmentResourceDescriptionsMessage extends js.Object {
    var EnvironmentResources: EnvironmentResourceDescription
  }

  object EnvironmentResourceDescriptionsMessage {
    def apply(
      EnvironmentResources: js.UndefOr[EnvironmentResourceDescription] = js.undefined
    ): EnvironmentResourceDescriptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EnvironmentResources" -> EnvironmentResources.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnvironmentResourceDescriptionsMessage]
    }
  }

  /**
   * <p>Describes the AWS resources in use by this environment. This data is not live data.</p>
   */
  @js.native
  trait EnvironmentResourcesDescription extends js.Object {
    var LoadBalancer: LoadBalancerDescription
  }

  object EnvironmentResourcesDescription {
    def apply(
      LoadBalancer: js.UndefOr[LoadBalancerDescription] = js.undefined
    ): EnvironmentResourcesDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoadBalancer" -> LoadBalancer.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnvironmentResourcesDescription]
    }
  }


  object EnvironmentStatusEnum {
    val Launching = "Launching"
    val Updating = "Updating"
    val Ready = "Ready"
    val Terminating = "Terminating"
    val Terminated = "Terminated"

    val values = IndexedSeq(Launching, Updating, Ready, Terminating, Terminated)
  }

  /**
   * <p> Describes the properties of an environment tier </p>
   */
  @js.native
  trait EnvironmentTier extends js.Object {
    var Name: String
    var Type: String
    var Version: String
  }

  object EnvironmentTier {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      Type: js.UndefOr[String] = js.undefined,
      Version: js.UndefOr[String] = js.undefined
    ): EnvironmentTier = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("Type" -> Type.map { x => x: js.Any }),
        ("Version" -> Version.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EnvironmentTier]
    }
  }

  /**
   * <p>Describes an event.</p>
   */
  @js.native
  trait EventDescription extends js.Object {
    var RequestId: RequestId
    var VersionLabel: VersionLabel
    var EventDate: EventDate
    var TemplateName: ConfigurationTemplateName
    var EnvironmentName: EnvironmentName
    var Message: EventMessage
    var ApplicationName: ApplicationName
    var Severity: EventSeverity
  }

  object EventDescription {
    def apply(
      RequestId: js.UndefOr[RequestId] = js.undefined,
      VersionLabel: js.UndefOr[VersionLabel] = js.undefined,
      EventDate: js.UndefOr[EventDate] = js.undefined,
      TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined,
      EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
      Message: js.UndefOr[EventMessage] = js.undefined,
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      Severity: js.UndefOr[EventSeverity] = js.undefined
    ): EventDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("RequestId" -> RequestId.map { x => x: js.Any }),
        ("VersionLabel" -> VersionLabel.map { x => x: js.Any }),
        ("EventDate" -> EventDate.map { x => x: js.Any }),
        ("TemplateName" -> TemplateName.map { x => x: js.Any }),
        ("EnvironmentName" -> EnvironmentName.map { x => x: js.Any }),
        ("Message" -> Message.map { x => x: js.Any }),
        ("ApplicationName" -> ApplicationName.map { x => x: js.Any }),
        ("Severity" -> Severity.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventDescription]
    }
  }

  /**
   * <p>Result message wrapping a list of event descriptions.</p>
   */
  @js.native
  trait EventDescriptionsMessage extends js.Object {
    var Events: EventDescriptionList
    var NextToken: Token
  }

  object EventDescriptionsMessage {
    def apply(
      Events: js.UndefOr[EventDescriptionList] = js.undefined,
      NextToken: js.UndefOr[Token] = js.undefined
    ): EventDescriptionsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Events" -> Events.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventDescriptionsMessage]
    }
  }


  object EventSeverityEnum {
    val TRACE = "TRACE"
    val DEBUG = "DEBUG"
    val INFO = "INFO"
    val WARN = "WARN"
    val ERROR = "ERROR"
    val FATAL = "FATAL"

    val values = IndexedSeq(TRACE, DEBUG, INFO, WARN, ERROR, FATAL)
  }

  /**
   * <p>The description of an Amazon EC2 instance.</p>
   */
  @js.native
  trait Instance extends js.Object {
    var Id: ResourceId
  }

  object Instance {
    def apply(
      Id: js.UndefOr[ResourceId] = js.undefined
    ): Instance = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Id" -> Id.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Instance]
    }
  }

  /**
   * <p>Unable to perform the specified operation because the user does not have enough privileges for one of more downstream aws services</p>
   */
  @js.native
  trait InsufficientPrivilegesExceptionException extends js.Object {

  }

  /**
   * <p>Describes an Auto Scaling launch configuration.</p>
   */
  @js.native
  trait LaunchConfiguration extends js.Object {
    var Name: ResourceId
  }

  object LaunchConfiguration {
    def apply(
      Name: js.UndefOr[ResourceId] = js.undefined
    ): LaunchConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LaunchConfiguration]
    }
  }

  /**
   * <p>A list of available AWS Elastic Beanstalk solution stacks. </p>
   */
  @js.native
  trait ListAvailableSolutionStacksResultMessage extends js.Object {
    var SolutionStacks: AvailableSolutionStackNamesList
    var SolutionStackDetails: AvailableSolutionStackDetailsList
  }

  object ListAvailableSolutionStacksResultMessage {
    def apply(
      SolutionStacks: js.UndefOr[AvailableSolutionStackNamesList] = js.undefined,
      SolutionStackDetails: js.UndefOr[AvailableSolutionStackDetailsList] = js.undefined
    ): ListAvailableSolutionStacksResultMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SolutionStacks" -> SolutionStacks.map { x => x: js.Any }),
        ("SolutionStackDetails" -> SolutionStackDetails.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAvailableSolutionStacksResultMessage]
    }
  }

  /**
   * <p>Describes the properties of a Listener for the LoadBalancer.</p>
   */
  @js.native
  trait Listener extends js.Object {
    var Protocol: String
    var Port: Integer
  }

  object Listener {
    def apply(
      Protocol: js.UndefOr[String] = js.undefined,
      Port: js.UndefOr[Integer] = js.undefined
    ): Listener = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Protocol" -> Protocol.map { x => x: js.Any }),
        ("Port" -> Port.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Listener]
    }
  }

  /**
   * <p>Describes a LoadBalancer.</p>
   */
  @js.native
  trait LoadBalancer extends js.Object {
    var Name: ResourceId
  }

  object LoadBalancer {
    def apply(
      Name: js.UndefOr[ResourceId] = js.undefined
    ): LoadBalancer = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBalancer]
    }
  }

  /**
   * <p>Describes the details of a LoadBalancer.</p>
   */
  @js.native
  trait LoadBalancerDescription extends js.Object {
    var LoadBalancerName: String
    var Domain: String
    var Listeners: LoadBalancerListenersDescription
  }

  object LoadBalancerDescription {
    def apply(
      LoadBalancerName: js.UndefOr[String] = js.undefined,
      Domain: js.UndefOr[String] = js.undefined,
      Listeners: js.UndefOr[LoadBalancerListenersDescription] = js.undefined
    ): LoadBalancerDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LoadBalancerName" -> LoadBalancerName.map { x => x: js.Any }),
        ("Domain" -> Domain.map { x => x: js.Any }),
        ("Listeners" -> Listeners.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LoadBalancerDescription]
    }
  }

  /**
   * <p>Unable to perform the specified operation because another operation is already in progress affecting an an element in this activity.</p>
   */
  @js.native
  trait OperationInProgressExceptionException extends js.Object {

  }

  /**
   * <p> A regular expression representing a restriction on a string configuration option value. </p>
   */
  @js.native
  trait OptionRestrictionRegex extends js.Object {
    var Pattern: RegexPattern
    var Label: RegexLabel
  }

  object OptionRestrictionRegex {
    def apply(
      Pattern: js.UndefOr[RegexPattern] = js.undefined,
      Label: js.UndefOr[RegexLabel] = js.undefined
    ): OptionRestrictionRegex = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Pattern" -> Pattern.map { x => x: js.Any }),
        ("Label" -> Label.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptionRestrictionRegex]
    }
  }

  /**
   * <p> A specification identifying an individual configuration option. </p>
   */
  @js.native
  trait OptionSpecification extends js.Object {
    var Namespace: OptionNamespace
    var OptionName: ConfigurationOptionName
  }

  object OptionSpecification {
    def apply(
      Namespace: js.UndefOr[OptionNamespace] = js.undefined,
      OptionName: js.UndefOr[ConfigurationOptionName] = js.undefined
    ): OptionSpecification = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Namespace" -> Namespace.map { x => x: js.Any }),
        ("OptionName" -> OptionName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OptionSpecification]
    }
  }

  /**
   * <p>Describes a queue.</p>
   */
  @js.native
  trait Queue extends js.Object {
    var Name: String
    var URL: String
  }

  object Queue {
    def apply(
      Name: js.UndefOr[String] = js.undefined,
      URL: js.UndefOr[String] = js.undefined
    ): Queue = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any }),
        ("URL" -> URL.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Queue]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait RebuildEnvironmentMessage extends js.Object {
    var EnvironmentId: EnvironmentId
    var EnvironmentName: EnvironmentName
  }

  object RebuildEnvironmentMessage {
    def apply(
      EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
      EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
    ): RebuildEnvironmentMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EnvironmentId" -> EnvironmentId.map { x => x: js.Any }),
        ("EnvironmentName" -> EnvironmentName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebuildEnvironmentMessage]
    }
  }

  /**
   * <p>This documentation target is not reported in the API reference.</p>
   */
  @js.native
  trait RequestEnvironmentInfoMessage extends js.Object {
    var EnvironmentId: EnvironmentId
    var EnvironmentName: EnvironmentName
    var InfoType: EnvironmentInfoType
  }

  object RequestEnvironmentInfoMessage {
    def apply(
      EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
      EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
      InfoType: js.UndefOr[EnvironmentInfoType] = js.undefined
    ): RequestEnvironmentInfoMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EnvironmentId" -> EnvironmentId.map { x => x: js.Any }),
        ("EnvironmentName" -> EnvironmentName.map { x => x: js.Any }),
        ("InfoType" -> InfoType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestEnvironmentInfoMessage]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait RestartAppServerMessage extends js.Object {
    var EnvironmentId: EnvironmentId
    var EnvironmentName: EnvironmentName
  }

  object RestartAppServerMessage {
    def apply(
      EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
      EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
    ): RestartAppServerMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EnvironmentId" -> EnvironmentId.map { x => x: js.Any }),
        ("EnvironmentName" -> EnvironmentName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RestartAppServerMessage]
    }
  }

  /**
   * <p>This documentation target is not reported in the API reference.</p>
   */
  @js.native
  trait RetrieveEnvironmentInfoMessage extends js.Object {
    var EnvironmentId: EnvironmentId
    var EnvironmentName: EnvironmentName
    var InfoType: EnvironmentInfoType
  }

  object RetrieveEnvironmentInfoMessage {
    def apply(
      EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
      EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
      InfoType: js.UndefOr[EnvironmentInfoType] = js.undefined
    ): RetrieveEnvironmentInfoMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EnvironmentId" -> EnvironmentId.map { x => x: js.Any }),
        ("EnvironmentName" -> EnvironmentName.map { x => x: js.Any }),
        ("InfoType" -> InfoType.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RetrieveEnvironmentInfoMessage]
    }
  }

  /**
   * <p>Result message containing a description of the requested environment info.</p>
   */
  @js.native
  trait RetrieveEnvironmentInfoResultMessage extends js.Object {
    var EnvironmentInfo: EnvironmentInfoDescriptionList
  }

  object RetrieveEnvironmentInfoResultMessage {
    def apply(
      EnvironmentInfo: js.UndefOr[EnvironmentInfoDescriptionList] = js.undefined
    ): RetrieveEnvironmentInfoResultMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EnvironmentInfo" -> EnvironmentInfo.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RetrieveEnvironmentInfoResultMessage]
    }
  }

  /**
   * <p>A specification of a location in Amazon S3.</p>
   */
  @js.native
  trait S3Location extends js.Object {
    var S3Bucket: S3Bucket
    var S3Key: S3Key
  }

  object S3Location {
    def apply(
      S3Bucket: js.UndefOr[S3Bucket] = js.undefined,
      S3Key: js.UndefOr[S3Key] = js.undefined
    ): S3Location = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("S3Bucket" -> S3Bucket.map { x => x: js.Any }),
        ("S3Key" -> S3Key.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Location]
    }
  }

  /**
   * <p>The specified S3 bucket does not belong to the S3 region in which the service is running.</p>
   */
  @js.native
  trait S3LocationNotInServiceRegionExceptionException extends js.Object {

  }

  /**
   * <p>The caller does not have a subscription to Amazon S3.</p>
   */
  @js.native
  trait S3SubscriptionRequiredExceptionException extends js.Object {

  }

  /**
   * <p> Describes the solution stack. </p>
   */
  @js.native
  trait SolutionStackDescription extends js.Object {
    var SolutionStackName: SolutionStackName
    var PermittedFileTypes: SolutionStackFileTypeList
  }

  object SolutionStackDescription {
    def apply(
      SolutionStackName: js.UndefOr[SolutionStackName] = js.undefined,
      PermittedFileTypes: js.UndefOr[SolutionStackFileTypeList] = js.undefined
    ): SolutionStackDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SolutionStackName" -> SolutionStackName.map { x => x: js.Any }),
        ("PermittedFileTypes" -> PermittedFileTypes.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SolutionStackDescription]
    }
  }

  /**
   * <p>Unable to delete the Amazon S3 source bundle associated with the application version, although the application version deleted successfully.</p>
   */
  @js.native
  trait SourceBundleDeletionExceptionException extends js.Object {

  }

  /**
   * <p>A specification for an environment configuration</p>
   */
  @js.native
  trait SourceConfiguration extends js.Object {
    var ApplicationName: ApplicationName
    var TemplateName: ConfigurationTemplateName
  }

  object SourceConfiguration {
    def apply(
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined
    ): SourceConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ApplicationName" -> ApplicationName.map { x => x: js.Any }),
        ("TemplateName" -> TemplateName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SourceConfiguration]
    }
  }

  /**
   * <p>Swaps the CNAMEs of two environments.</p>
   */
  @js.native
  trait SwapEnvironmentCNAMEsMessage extends js.Object {
    var SourceEnvironmentId: EnvironmentId
    var SourceEnvironmentName: EnvironmentName
    var DestinationEnvironmentId: EnvironmentId
    var DestinationEnvironmentName: EnvironmentName
  }

  object SwapEnvironmentCNAMEsMessage {
    def apply(
      SourceEnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
      SourceEnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
      DestinationEnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
      DestinationEnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
    ): SwapEnvironmentCNAMEsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("SourceEnvironmentId" -> SourceEnvironmentId.map { x => x: js.Any }),
        ("SourceEnvironmentName" -> SourceEnvironmentName.map { x => x: js.Any }),
        ("DestinationEnvironmentId" -> DestinationEnvironmentId.map { x => x: js.Any }),
        ("DestinationEnvironmentName" -> DestinationEnvironmentName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SwapEnvironmentCNAMEsMessage]
    }
  }

  /**
   * <p>Describes a tag applied to a resource in an environment.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    def apply(
      Key: js.UndefOr[TagKey] = js.undefined,
      Value: js.UndefOr[TagValue] = js.undefined
    ): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
   * <p>This documentation target is not reported in the API reference.</p>
   */
  @js.native
  trait TerminateEnvironmentMessage extends js.Object {
    var EnvironmentId: EnvironmentId
    var EnvironmentName: EnvironmentName
    var TerminateResources: TerminateEnvironmentResources
  }

  object TerminateEnvironmentMessage {
    def apply(
      EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
      EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
      TerminateResources: js.UndefOr[TerminateEnvironmentResources] = js.undefined
    ): TerminateEnvironmentMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("EnvironmentId" -> EnvironmentId.map { x => x: js.Any }),
        ("EnvironmentName" -> EnvironmentName.map { x => x: js.Any }),
        ("TerminateResources" -> TerminateResources.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TerminateEnvironmentMessage]
    }
  }

  /**
   * <p>The caller has exceeded the limit on the number of application versions associated with their account.</p>
   */
  @js.native
  trait TooManyApplicationVersionsExceptionException extends js.Object {

  }

  /**
   * <p>The caller has exceeded the limit on the number of applications associated with their account.</p>
   */
  @js.native
  trait TooManyApplicationsExceptionException extends js.Object {

  }

  /**
   * <p>The web service attempted to create a bucket in an Amazon S3 account that already has 100 buckets.</p>
   */
  @js.native
  trait TooManyBucketsExceptionException extends js.Object {

  }

  /**
   * <p>The caller has exceeded the limit on the number of configuration templates associated with their account.</p>
   */
  @js.native
  trait TooManyConfigurationTemplatesExceptionException extends js.Object {

  }

  /**
   * <p>The caller has exceeded the limit of allowed environments associated with the account.</p>
   */
  @js.native
  trait TooManyEnvironmentsExceptionException extends js.Object {

  }

  /**
   * <p>Describes a trigger.</p>
   */
  @js.native
  trait Trigger extends js.Object {
    var Name: ResourceId
  }

  object Trigger {
    def apply(
      Name: js.UndefOr[ResourceId] = js.undefined
    ): Trigger = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Trigger]
    }
  }

  /**
   * <p>This documentation target is not reported in the API reference.</p>
   */
  @js.native
  trait UpdateApplicationMessage extends js.Object {
    var ApplicationName: ApplicationName
    var Description: Description
  }

  object UpdateApplicationMessage {
    def apply(
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined
    ): UpdateApplicationMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ApplicationName" -> ApplicationName.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateApplicationMessage]
    }
  }

  /**
   * <p></p>
   */
  @js.native
  trait UpdateApplicationVersionMessage extends js.Object {
    var ApplicationName: ApplicationName
    var VersionLabel: VersionLabel
    var Description: Description
  }

  object UpdateApplicationVersionMessage {
    def apply(
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      VersionLabel: js.UndefOr[VersionLabel] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined
    ): UpdateApplicationVersionMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ApplicationName" -> ApplicationName.map { x => x: js.Any }),
        ("VersionLabel" -> VersionLabel.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateApplicationVersionMessage]
    }
  }

  /**
   * <p>The result message containing the options for the specified solution stack.</p>
   */
  @js.native
  trait UpdateConfigurationTemplateMessage extends js.Object {
    var OptionsToRemove: OptionsSpecifierList
    var Description: Description
    var OptionSettings: ConfigurationOptionSettingsList
    var TemplateName: ConfigurationTemplateName
    var ApplicationName: ApplicationName
  }

  object UpdateConfigurationTemplateMessage {
    def apply(
      OptionsToRemove: js.UndefOr[OptionsSpecifierList] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.undefined,
      TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined,
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined
    ): UpdateConfigurationTemplateMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OptionsToRemove" -> OptionsToRemove.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("OptionSettings" -> OptionSettings.map { x => x: js.Any }),
        ("TemplateName" -> TemplateName.map { x => x: js.Any }),
        ("ApplicationName" -> ApplicationName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateConfigurationTemplateMessage]
    }
  }

  /**
   * <p>This documentation target is not reported in the API reference.</p>
   */
  @js.native
  trait UpdateEnvironmentMessage extends js.Object {
    var OptionsToRemove: OptionsSpecifierList
    var Description: Description
    var EnvironmentId: EnvironmentId
    var VersionLabel: VersionLabel
    var Tier: EnvironmentTier
    var SolutionStackName: SolutionStackName
    var OptionSettings: ConfigurationOptionSettingsList
    var TemplateName: ConfigurationTemplateName
    var EnvironmentName: EnvironmentName
  }

  object UpdateEnvironmentMessage {
    def apply(
      OptionsToRemove: js.UndefOr[OptionsSpecifierList] = js.undefined,
      Description: js.UndefOr[Description] = js.undefined,
      EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined,
      VersionLabel: js.UndefOr[VersionLabel] = js.undefined,
      Tier: js.UndefOr[EnvironmentTier] = js.undefined,
      SolutionStackName: js.UndefOr[SolutionStackName] = js.undefined,
      OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.undefined,
      TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined,
      EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
    ): UpdateEnvironmentMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("OptionsToRemove" -> OptionsToRemove.map { x => x: js.Any }),
        ("Description" -> Description.map { x => x: js.Any }),
        ("EnvironmentId" -> EnvironmentId.map { x => x: js.Any }),
        ("VersionLabel" -> VersionLabel.map { x => x: js.Any }),
        ("Tier" -> Tier.map { x => x: js.Any }),
        ("SolutionStackName" -> SolutionStackName.map { x => x: js.Any }),
        ("OptionSettings" -> OptionSettings.map { x => x: js.Any }),
        ("TemplateName" -> TemplateName.map { x => x: js.Any }),
        ("EnvironmentName" -> EnvironmentName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEnvironmentMessage]
    }
  }

  /**
   * <p>A list of validation messages for a specified configuration template. </p>
   */
  @js.native
  trait ValidateConfigurationSettingsMessage extends js.Object {
    var ApplicationName: ApplicationName
    var TemplateName: ConfigurationTemplateName
    var EnvironmentName: EnvironmentName
    var OptionSettings: ConfigurationOptionSettingsList
  }

  object ValidateConfigurationSettingsMessage {
    def apply(
      ApplicationName: js.UndefOr[ApplicationName] = js.undefined,
      TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined,
      EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined,
      OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.undefined
    ): ValidateConfigurationSettingsMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ApplicationName" -> ApplicationName.map { x => x: js.Any }),
        ("TemplateName" -> TemplateName.map { x => x: js.Any }),
        ("EnvironmentName" -> EnvironmentName.map { x => x: js.Any }),
        ("OptionSettings" -> OptionSettings.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ValidateConfigurationSettingsMessage]
    }
  }

  /**
   * <p> An error or warning for a desired configuration option value. </p>
   */
  @js.native
  trait ValidationMessage extends js.Object {
    var Message: ValidationMessageString
    var Severity: ValidationSeverity
    var Namespace: OptionNamespace
    var OptionName: ConfigurationOptionName
  }

  object ValidationMessage {
    def apply(
      Message: js.UndefOr[ValidationMessageString] = js.undefined,
      Severity: js.UndefOr[ValidationSeverity] = js.undefined,
      Namespace: js.UndefOr[OptionNamespace] = js.undefined,
      OptionName: js.UndefOr[ConfigurationOptionName] = js.undefined
    ): ValidationMessage = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Message" -> Message.map { x => x: js.Any }),
        ("Severity" -> Severity.map { x => x: js.Any }),
        ("Namespace" -> Namespace.map { x => x: js.Any }),
        ("OptionName" -> OptionName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ValidationMessage]
    }
  }


  object ValidationSeverityEnum {
    val error = "error"
    val warning = "warning"

    val values = IndexedSeq(error, warning)
  }
}
