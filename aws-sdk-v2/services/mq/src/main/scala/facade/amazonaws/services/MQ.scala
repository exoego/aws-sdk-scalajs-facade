package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object mq {
  type MaxResults = Int
  type __boolean = Boolean
  type __integer = Int
  type __integerMin5Max100 = Int
  type __listOfActionRequired = js.Array[ActionRequired]
  type __listOfAvailabilityZone = js.Array[AvailabilityZone]
  type __listOfBrokerEngineType = js.Array[BrokerEngineType]
  type __listOfBrokerInstance = js.Array[BrokerInstance]
  type __listOfBrokerInstanceOption = js.Array[BrokerInstanceOption]
  type __listOfBrokerSummary = js.Array[BrokerSummary]
  type __listOfConfiguration = js.Array[Configuration]
  type __listOfConfigurationId = js.Array[ConfigurationId]
  type __listOfConfigurationRevision = js.Array[ConfigurationRevision]
  type __listOfDeploymentMode = js.Array[DeploymentMode]
  type __listOfEngineVersion = js.Array[EngineVersion]
  type __listOfSanitizationWarning = js.Array[SanitizationWarning]
  type __listOfUser = js.Array[User]
  type __listOfUserSummary = js.Array[UserSummary]
  type __listOf__string = js.Array[__string]
  type __mapOf__string = js.Dictionary[__string]
  type __string = String
  type __timestampIso8601 = js.Date

  final class MQOps(private val service: MQ) extends AnyVal {

    @inline def createBrokerFuture(params: CreateBrokerRequest): Future[CreateBrokerResponse] = service.createBroker(params).promise().toFuture
    @inline def createConfigurationFuture(params: CreateConfigurationRequest): Future[CreateConfigurationResponse] = service.createConfiguration(params).promise().toFuture
    @inline def createTagsFuture(params: CreateTagsRequest): Future[js.Object] = service.createTags(params).promise().toFuture
    @inline def createUserFuture(params: CreateUserRequest): Future[CreateUserResponse] = service.createUser(params).promise().toFuture
    @inline def deleteBrokerFuture(params: DeleteBrokerRequest): Future[DeleteBrokerResponse] = service.deleteBroker(params).promise().toFuture
    @inline def deleteTagsFuture(params: DeleteTagsRequest): Future[js.Object] = service.deleteTags(params).promise().toFuture
    @inline def deleteUserFuture(params: DeleteUserRequest): Future[DeleteUserResponse] = service.deleteUser(params).promise().toFuture
    @inline def describeBrokerEngineTypesFuture(params: DescribeBrokerEngineTypesRequest): Future[DescribeBrokerEngineTypesResponse] = service.describeBrokerEngineTypes(params).promise().toFuture
    @inline def describeBrokerFuture(params: DescribeBrokerRequest): Future[DescribeBrokerResponse] = service.describeBroker(params).promise().toFuture
    @inline def describeBrokerInstanceOptionsFuture(params: DescribeBrokerInstanceOptionsRequest): Future[DescribeBrokerInstanceOptionsResponse] = service.describeBrokerInstanceOptions(params).promise().toFuture
    @inline def describeConfigurationFuture(params: DescribeConfigurationRequest): Future[DescribeConfigurationResponse] = service.describeConfiguration(params).promise().toFuture
    @inline def describeConfigurationRevisionFuture(params: DescribeConfigurationRevisionRequest): Future[DescribeConfigurationRevisionResponse] = service.describeConfigurationRevision(params).promise().toFuture
    @inline def describeUserFuture(params: DescribeUserRequest): Future[DescribeUserResponse] = service.describeUser(params).promise().toFuture
    @inline def listBrokersFuture(params: ListBrokersRequest): Future[ListBrokersResponse] = service.listBrokers(params).promise().toFuture
    @inline def listConfigurationRevisionsFuture(params: ListConfigurationRevisionsRequest): Future[ListConfigurationRevisionsResponse] = service.listConfigurationRevisions(params).promise().toFuture
    @inline def listConfigurationsFuture(params: ListConfigurationsRequest): Future[ListConfigurationsResponse] = service.listConfigurations(params).promise().toFuture
    @inline def listTagsFuture(params: ListTagsRequest): Future[ListTagsResponse] = service.listTags(params).promise().toFuture
    @inline def listUsersFuture(params: ListUsersRequest): Future[ListUsersResponse] = service.listUsers(params).promise().toFuture
    @inline def rebootBrokerFuture(params: RebootBrokerRequest): Future[RebootBrokerResponse] = service.rebootBroker(params).promise().toFuture
    @inline def updateBrokerFuture(params: UpdateBrokerRequest): Future[UpdateBrokerResponse] = service.updateBroker(params).promise().toFuture
    @inline def updateConfigurationFuture(params: UpdateConfigurationRequest): Future[UpdateConfigurationResponse] = service.updateConfiguration(params).promise().toFuture
    @inline def updateUserFuture(params: UpdateUserRequest): Future[UpdateUserResponse] = service.updateUser(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/mq", JSImport.Namespace, "AWS.MQ")
  class MQ() extends js.Object {
    def this(config: AWSConfig) = this()

    def createBroker(params: CreateBrokerRequest): Request[CreateBrokerResponse] = js.native
    def createConfiguration(params: CreateConfigurationRequest): Request[CreateConfigurationResponse] = js.native
    def createTags(params: CreateTagsRequest): Request[js.Object] = js.native
    def createUser(params: CreateUserRequest): Request[CreateUserResponse] = js.native
    def deleteBroker(params: DeleteBrokerRequest): Request[DeleteBrokerResponse] = js.native
    def deleteTags(params: DeleteTagsRequest): Request[js.Object] = js.native
    def deleteUser(params: DeleteUserRequest): Request[DeleteUserResponse] = js.native
    def describeBroker(params: DescribeBrokerRequest): Request[DescribeBrokerResponse] = js.native
    def describeBrokerEngineTypes(params: DescribeBrokerEngineTypesRequest): Request[DescribeBrokerEngineTypesResponse] = js.native
    def describeBrokerInstanceOptions(params: DescribeBrokerInstanceOptionsRequest): Request[DescribeBrokerInstanceOptionsResponse] = js.native
    def describeConfiguration(params: DescribeConfigurationRequest): Request[DescribeConfigurationResponse] = js.native
    def describeConfigurationRevision(params: DescribeConfigurationRevisionRequest): Request[DescribeConfigurationRevisionResponse] = js.native
    def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse] = js.native
    def listBrokers(params: ListBrokersRequest): Request[ListBrokersResponse] = js.native
    def listConfigurationRevisions(params: ListConfigurationRevisionsRequest): Request[ListConfigurationRevisionsResponse] = js.native
    def listConfigurations(params: ListConfigurationsRequest): Request[ListConfigurationsResponse] = js.native
    def listTags(params: ListTagsRequest): Request[ListTagsResponse] = js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse] = js.native
    def rebootBroker(params: RebootBrokerRequest): Request[RebootBrokerResponse] = js.native
    def updateBroker(params: UpdateBrokerRequest): Request[UpdateBrokerResponse] = js.native
    def updateConfiguration(params: UpdateConfigurationRequest): Request[UpdateConfigurationResponse] = js.native
    def updateUser(params: UpdateUserRequest): Request[UpdateUserResponse] = js.native
  }
  object MQ {
    @inline implicit def toOps(service: MQ): MQOps = {
      new MQOps(service)
    }
  }

  /** The action required to resolve a broker issue when the broker is in a CRITICAL_ACTION_REQUIRED state.
    */
  @js.native
  trait ActionRequired extends js.Object {
    var ActionRequiredCode: js.UndefOr[__string]
    var ActionRequiredInfo: js.UndefOr[__string]
  }

  object ActionRequired {
    @inline
    def apply(
        ActionRequiredCode: js.UndefOr[__string] = js.undefined,
        ActionRequiredInfo: js.UndefOr[__string] = js.undefined
    ): ActionRequired = {
      val __obj = js.Dynamic.literal()
      ActionRequiredCode.foreach(__v => __obj.updateDynamic("ActionRequiredCode")(__v.asInstanceOf[js.Any]))
      ActionRequiredInfo.foreach(__v => __obj.updateDynamic("ActionRequiredInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ActionRequired]
    }
  }

  /** Name of the availability zone.
    */
  @js.native
  trait AvailabilityZone extends js.Object {
    var Name: js.UndefOr[__string]
  }

  object AvailabilityZone {
    @inline
    def apply(
        Name: js.UndefOr[__string] = js.undefined
    ): AvailabilityZone = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AvailabilityZone]
    }
  }

  /** Types of broker engines.
    */
  @js.native
  trait BrokerEngineType extends js.Object {
    var EngineType: js.UndefOr[EngineType]
    var EngineVersions: js.UndefOr[__listOfEngineVersion]
  }

  object BrokerEngineType {
    @inline
    def apply(
        EngineType: js.UndefOr[EngineType] = js.undefined,
        EngineVersions: js.UndefOr[__listOfEngineVersion] = js.undefined
    ): BrokerEngineType = {
      val __obj = js.Dynamic.literal()
      EngineType.foreach(__v => __obj.updateDynamic("EngineType")(__v.asInstanceOf[js.Any]))
      EngineVersions.foreach(__v => __obj.updateDynamic("EngineVersions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BrokerEngineType]
    }
  }

  /** Returns information about all brokers.
    */
  @js.native
  trait BrokerInstance extends js.Object {
    var ConsoleURL: js.UndefOr[__string]
    var Endpoints: js.UndefOr[__listOf__string]
    var IpAddress: js.UndefOr[__string]
  }

  object BrokerInstance {
    @inline
    def apply(
        ConsoleURL: js.UndefOr[__string] = js.undefined,
        Endpoints: js.UndefOr[__listOf__string] = js.undefined,
        IpAddress: js.UndefOr[__string] = js.undefined
    ): BrokerInstance = {
      val __obj = js.Dynamic.literal()
      ConsoleURL.foreach(__v => __obj.updateDynamic("ConsoleURL")(__v.asInstanceOf[js.Any]))
      Endpoints.foreach(__v => __obj.updateDynamic("Endpoints")(__v.asInstanceOf[js.Any]))
      IpAddress.foreach(__v => __obj.updateDynamic("IpAddress")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BrokerInstance]
    }
  }

  /** Option for host instance type.
    */
  @js.native
  trait BrokerInstanceOption extends js.Object {
    var AvailabilityZones: js.UndefOr[__listOfAvailabilityZone]
    var EngineType: js.UndefOr[EngineType]
    var HostInstanceType: js.UndefOr[__string]
    var StorageType: js.UndefOr[BrokerStorageType]
    var SupportedDeploymentModes: js.UndefOr[__listOfDeploymentMode]
    var SupportedEngineVersions: js.UndefOr[__listOf__string]
  }

  object BrokerInstanceOption {
    @inline
    def apply(
        AvailabilityZones: js.UndefOr[__listOfAvailabilityZone] = js.undefined,
        EngineType: js.UndefOr[EngineType] = js.undefined,
        HostInstanceType: js.UndefOr[__string] = js.undefined,
        StorageType: js.UndefOr[BrokerStorageType] = js.undefined,
        SupportedDeploymentModes: js.UndefOr[__listOfDeploymentMode] = js.undefined,
        SupportedEngineVersions: js.UndefOr[__listOf__string] = js.undefined
    ): BrokerInstanceOption = {
      val __obj = js.Dynamic.literal()
      AvailabilityZones.foreach(__v => __obj.updateDynamic("AvailabilityZones")(__v.asInstanceOf[js.Any]))
      EngineType.foreach(__v => __obj.updateDynamic("EngineType")(__v.asInstanceOf[js.Any]))
      HostInstanceType.foreach(__v => __obj.updateDynamic("HostInstanceType")(__v.asInstanceOf[js.Any]))
      StorageType.foreach(__v => __obj.updateDynamic("StorageType")(__v.asInstanceOf[js.Any]))
      SupportedDeploymentModes.foreach(__v => __obj.updateDynamic("SupportedDeploymentModes")(__v.asInstanceOf[js.Any]))
      SupportedEngineVersions.foreach(__v => __obj.updateDynamic("SupportedEngineVersions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BrokerInstanceOption]
    }
  }

  /** Returns information about all brokers.
    */
  @js.native
  trait BrokerSummary extends js.Object {
    var DeploymentMode: DeploymentMode
    var EngineType: EngineType
    var BrokerArn: js.UndefOr[__string]
    var BrokerId: js.UndefOr[__string]
    var BrokerName: js.UndefOr[__string]
    var BrokerState: js.UndefOr[BrokerState]
    var Created: js.UndefOr[__timestampIso8601]
    var HostInstanceType: js.UndefOr[__string]
  }

  object BrokerSummary {
    @inline
    def apply(
        DeploymentMode: DeploymentMode,
        EngineType: EngineType,
        BrokerArn: js.UndefOr[__string] = js.undefined,
        BrokerId: js.UndefOr[__string] = js.undefined,
        BrokerName: js.UndefOr[__string] = js.undefined,
        BrokerState: js.UndefOr[BrokerState] = js.undefined,
        Created: js.UndefOr[__timestampIso8601] = js.undefined,
        HostInstanceType: js.UndefOr[__string] = js.undefined
    ): BrokerSummary = {
      val __obj = js.Dynamic.literal(
        "DeploymentMode" -> DeploymentMode.asInstanceOf[js.Any],
        "EngineType" -> EngineType.asInstanceOf[js.Any]
      )

      BrokerArn.foreach(__v => __obj.updateDynamic("BrokerArn")(__v.asInstanceOf[js.Any]))
      BrokerId.foreach(__v => __obj.updateDynamic("BrokerId")(__v.asInstanceOf[js.Any]))
      BrokerName.foreach(__v => __obj.updateDynamic("BrokerName")(__v.asInstanceOf[js.Any]))
      BrokerState.foreach(__v => __obj.updateDynamic("BrokerState")(__v.asInstanceOf[js.Any]))
      Created.foreach(__v => __obj.updateDynamic("Created")(__v.asInstanceOf[js.Any]))
      HostInstanceType.foreach(__v => __obj.updateDynamic("HostInstanceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BrokerSummary]
    }
  }

  /** Returns information about all configurations.
    */
  @js.native
  trait Configuration extends js.Object {
    var Arn: __string
    var AuthenticationStrategy: AuthenticationStrategy
    var Created: __timestampIso8601
    var Description: __string
    var EngineType: EngineType
    var EngineVersion: __string
    var Id: __string
    var LatestRevision: ConfigurationRevision
    var Name: __string
    var Tags: js.UndefOr[__mapOf__string]
  }

  object Configuration {
    @inline
    def apply(
        Arn: __string,
        AuthenticationStrategy: AuthenticationStrategy,
        Created: __timestampIso8601,
        Description: __string,
        EngineType: EngineType,
        EngineVersion: __string,
        Id: __string,
        LatestRevision: ConfigurationRevision,
        Name: __string,
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): Configuration = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "AuthenticationStrategy" -> AuthenticationStrategy.asInstanceOf[js.Any],
        "Created" -> Created.asInstanceOf[js.Any],
        "Description" -> Description.asInstanceOf[js.Any],
        "EngineType" -> EngineType.asInstanceOf[js.Any],
        "EngineVersion" -> EngineVersion.asInstanceOf[js.Any],
        "Id" -> Id.asInstanceOf[js.Any],
        "LatestRevision" -> LatestRevision.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Configuration]
    }
  }

  /** A list of information about the configuration. <important>Does not apply to RabbitMQ brokers. </important>
    */
  @js.native
  trait ConfigurationId extends js.Object {
    var Id: __string
    var Revision: js.UndefOr[__integer]
  }

  object ConfigurationId {
    @inline
    def apply(
        Id: __string,
        Revision: js.UndefOr[__integer] = js.undefined
    ): ConfigurationId = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      Revision.foreach(__v => __obj.updateDynamic("Revision")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigurationId]
    }
  }

  /** Returns information about the specified configuration revision.
    */
  @js.native
  trait ConfigurationRevision extends js.Object {
    var Created: __timestampIso8601
    var Revision: __integer
    var Description: js.UndefOr[__string]
  }

  object ConfigurationRevision {
    @inline
    def apply(
        Created: __timestampIso8601,
        Revision: __integer,
        Description: js.UndefOr[__string] = js.undefined
    ): ConfigurationRevision = {
      val __obj = js.Dynamic.literal(
        "Created" -> Created.asInstanceOf[js.Any],
        "Revision" -> Revision.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigurationRevision]
    }
  }

  /** Broker configuration information
    */
  @js.native
  trait Configurations extends js.Object {
    var Current: js.UndefOr[ConfigurationId]
    var History: js.UndefOr[__listOfConfigurationId]
    var Pending: js.UndefOr[ConfigurationId]
  }

  object Configurations {
    @inline
    def apply(
        Current: js.UndefOr[ConfigurationId] = js.undefined,
        History: js.UndefOr[__listOfConfigurationId] = js.undefined,
        Pending: js.UndefOr[ConfigurationId] = js.undefined
    ): Configurations = {
      val __obj = js.Dynamic.literal()
      Current.foreach(__v => __obj.updateDynamic("Current")(__v.asInstanceOf[js.Any]))
      History.foreach(__v => __obj.updateDynamic("History")(__v.asInstanceOf[js.Any]))
      Pending.foreach(__v => __obj.updateDynamic("Pending")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Configurations]
    }
  }

  /** Creates a broker using the specified properties.
    */
  @js.native
  trait CreateBrokerRequest extends js.Object {
    var AutoMinorVersionUpgrade: __boolean
    var BrokerName: __string
    var DeploymentMode: DeploymentMode
    var EngineType: EngineType
    var EngineVersion: __string
    var HostInstanceType: __string
    var PubliclyAccessible: __boolean
    var Users: __listOfUser
    var AuthenticationStrategy: js.UndefOr[AuthenticationStrategy]
    var Configuration: js.UndefOr[ConfigurationId]
    var CreatorRequestId: js.UndefOr[__string]
    var EncryptionOptions: js.UndefOr[EncryptionOptions]
    var LdapServerMetadata: js.UndefOr[LdapServerMetadataInput]
    var Logs: js.UndefOr[Logs]
    var MaintenanceWindowStartTime: js.UndefOr[WeeklyStartTime]
    var SecurityGroups: js.UndefOr[__listOf__string]
    var StorageType: js.UndefOr[BrokerStorageType]
    var SubnetIds: js.UndefOr[__listOf__string]
    var Tags: js.UndefOr[__mapOf__string]
  }

  object CreateBrokerRequest {
    @inline
    def apply(
        AutoMinorVersionUpgrade: __boolean,
        BrokerName: __string,
        DeploymentMode: DeploymentMode,
        EngineType: EngineType,
        EngineVersion: __string,
        HostInstanceType: __string,
        PubliclyAccessible: __boolean,
        Users: __listOfUser,
        AuthenticationStrategy: js.UndefOr[AuthenticationStrategy] = js.undefined,
        Configuration: js.UndefOr[ConfigurationId] = js.undefined,
        CreatorRequestId: js.UndefOr[__string] = js.undefined,
        EncryptionOptions: js.UndefOr[EncryptionOptions] = js.undefined,
        LdapServerMetadata: js.UndefOr[LdapServerMetadataInput] = js.undefined,
        Logs: js.UndefOr[Logs] = js.undefined,
        MaintenanceWindowStartTime: js.UndefOr[WeeklyStartTime] = js.undefined,
        SecurityGroups: js.UndefOr[__listOf__string] = js.undefined,
        StorageType: js.UndefOr[BrokerStorageType] = js.undefined,
        SubnetIds: js.UndefOr[__listOf__string] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): CreateBrokerRequest = {
      val __obj = js.Dynamic.literal(
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.asInstanceOf[js.Any],
        "BrokerName" -> BrokerName.asInstanceOf[js.Any],
        "DeploymentMode" -> DeploymentMode.asInstanceOf[js.Any],
        "EngineType" -> EngineType.asInstanceOf[js.Any],
        "EngineVersion" -> EngineVersion.asInstanceOf[js.Any],
        "HostInstanceType" -> HostInstanceType.asInstanceOf[js.Any],
        "PubliclyAccessible" -> PubliclyAccessible.asInstanceOf[js.Any],
        "Users" -> Users.asInstanceOf[js.Any]
      )

      AuthenticationStrategy.foreach(__v => __obj.updateDynamic("AuthenticationStrategy")(__v.asInstanceOf[js.Any]))
      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      CreatorRequestId.foreach(__v => __obj.updateDynamic("CreatorRequestId")(__v.asInstanceOf[js.Any]))
      EncryptionOptions.foreach(__v => __obj.updateDynamic("EncryptionOptions")(__v.asInstanceOf[js.Any]))
      LdapServerMetadata.foreach(__v => __obj.updateDynamic("LdapServerMetadata")(__v.asInstanceOf[js.Any]))
      Logs.foreach(__v => __obj.updateDynamic("Logs")(__v.asInstanceOf[js.Any]))
      MaintenanceWindowStartTime.foreach(__v => __obj.updateDynamic("MaintenanceWindowStartTime")(__v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.updateDynamic("SecurityGroups")(__v.asInstanceOf[js.Any]))
      StorageType.foreach(__v => __obj.updateDynamic("StorageType")(__v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.updateDynamic("SubnetIds")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBrokerRequest]
    }
  }

  @js.native
  trait CreateBrokerResponse extends js.Object {
    var BrokerArn: js.UndefOr[__string]
    var BrokerId: js.UndefOr[__string]
  }

  object CreateBrokerResponse {
    @inline
    def apply(
        BrokerArn: js.UndefOr[__string] = js.undefined,
        BrokerId: js.UndefOr[__string] = js.undefined
    ): CreateBrokerResponse = {
      val __obj = js.Dynamic.literal()
      BrokerArn.foreach(__v => __obj.updateDynamic("BrokerArn")(__v.asInstanceOf[js.Any]))
      BrokerId.foreach(__v => __obj.updateDynamic("BrokerId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBrokerResponse]
    }
  }

  /** Creates a new configuration for the specified configuration name. Amazon MQ uses the default configuration (the engine type and version).
    */
  @js.native
  trait CreateConfigurationRequest extends js.Object {
    var EngineType: EngineType
    var EngineVersion: __string
    var Name: __string
    var AuthenticationStrategy: js.UndefOr[AuthenticationStrategy]
    var Tags: js.UndefOr[__mapOf__string]
  }

  object CreateConfigurationRequest {
    @inline
    def apply(
        EngineType: EngineType,
        EngineVersion: __string,
        Name: __string,
        AuthenticationStrategy: js.UndefOr[AuthenticationStrategy] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): CreateConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "EngineType" -> EngineType.asInstanceOf[js.Any],
        "EngineVersion" -> EngineVersion.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AuthenticationStrategy.foreach(__v => __obj.updateDynamic("AuthenticationStrategy")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConfigurationRequest]
    }
  }

  @js.native
  trait CreateConfigurationResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var AuthenticationStrategy: js.UndefOr[AuthenticationStrategy]
    var Created: js.UndefOr[__timestampIso8601]
    var Id: js.UndefOr[__string]
    var LatestRevision: js.UndefOr[ConfigurationRevision]
    var Name: js.UndefOr[__string]
  }

  object CreateConfigurationResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        AuthenticationStrategy: js.UndefOr[AuthenticationStrategy] = js.undefined,
        Created: js.UndefOr[__timestampIso8601] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        LatestRevision: js.UndefOr[ConfigurationRevision] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined
    ): CreateConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      AuthenticationStrategy.foreach(__v => __obj.updateDynamic("AuthenticationStrategy")(__v.asInstanceOf[js.Any]))
      Created.foreach(__v => __obj.updateDynamic("Created")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LatestRevision.foreach(__v => __obj.updateDynamic("LatestRevision")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConfigurationResponse]
    }
  }

  /** A map of the key-value pairs for the resource tag.
    */
  @js.native
  trait CreateTagsRequest extends js.Object {
    var ResourceArn: __string
    var Tags: js.UndefOr[__mapOf__string]
  }

  object CreateTagsRequest {
    @inline
    def apply(
        ResourceArn: __string,
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): CreateTagsRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTagsRequest]
    }
  }

  /** Creates a new ActiveMQ user.
    */
  @js.native
  trait CreateUserRequest extends js.Object {
    var BrokerId: __string
    var Password: __string
    var Username: __string
    var ConsoleAccess: js.UndefOr[__boolean]
    var Groups: js.UndefOr[__listOf__string]
  }

  object CreateUserRequest {
    @inline
    def apply(
        BrokerId: __string,
        Password: __string,
        Username: __string,
        ConsoleAccess: js.UndefOr[__boolean] = js.undefined,
        Groups: js.UndefOr[__listOf__string] = js.undefined
    ): CreateUserRequest = {
      val __obj = js.Dynamic.literal(
        "BrokerId" -> BrokerId.asInstanceOf[js.Any],
        "Password" -> Password.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )

      ConsoleAccess.foreach(__v => __obj.updateDynamic("ConsoleAccess")(__v.asInstanceOf[js.Any]))
      Groups.foreach(__v => __obj.updateDynamic("Groups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUserRequest]
    }
  }

  @js.native
  trait CreateUserResponse extends js.Object

  object CreateUserResponse {
    @inline
    def apply(): CreateUserResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateUserResponse]
    }
  }

  @js.native
  trait DeleteBrokerRequest extends js.Object {
    var BrokerId: __string
  }

  object DeleteBrokerRequest {
    @inline
    def apply(
        BrokerId: __string
    ): DeleteBrokerRequest = {
      val __obj = js.Dynamic.literal(
        "BrokerId" -> BrokerId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteBrokerRequest]
    }
  }

  @js.native
  trait DeleteBrokerResponse extends js.Object {
    var BrokerId: js.UndefOr[__string]
  }

  object DeleteBrokerResponse {
    @inline
    def apply(
        BrokerId: js.UndefOr[__string] = js.undefined
    ): DeleteBrokerResponse = {
      val __obj = js.Dynamic.literal()
      BrokerId.foreach(__v => __obj.updateDynamic("BrokerId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteBrokerResponse]
    }
  }

  @js.native
  trait DeleteTagsRequest extends js.Object {
    var ResourceArn: __string
    var TagKeys: __listOf__string
  }

  object DeleteTagsRequest {
    @inline
    def apply(
        ResourceArn: __string,
        TagKeys: __listOf__string
    ): DeleteTagsRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteTagsRequest]
    }
  }

  @js.native
  trait DeleteUserRequest extends js.Object {
    var BrokerId: __string
    var Username: __string
  }

  object DeleteUserRequest {
    @inline
    def apply(
        BrokerId: __string,
        Username: __string
    ): DeleteUserRequest = {
      val __obj = js.Dynamic.literal(
        "BrokerId" -> BrokerId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteUserRequest]
    }
  }

  @js.native
  trait DeleteUserResponse extends js.Object

  object DeleteUserResponse {
    @inline
    def apply(): DeleteUserResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteUserResponse]
    }
  }

  @js.native
  trait DescribeBrokerEngineTypesRequest extends js.Object {
    var EngineType: js.UndefOr[__string]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object DescribeBrokerEngineTypesRequest {
    @inline
    def apply(
        EngineType: js.UndefOr[__string] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): DescribeBrokerEngineTypesRequest = {
      val __obj = js.Dynamic.literal()
      EngineType.foreach(__v => __obj.updateDynamic("EngineType")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBrokerEngineTypesRequest]
    }
  }

  @js.native
  trait DescribeBrokerEngineTypesResponse extends js.Object {
    var BrokerEngineTypes: js.UndefOr[__listOfBrokerEngineType]
    var MaxResults: js.UndefOr[__integerMin5Max100]
    var NextToken: js.UndefOr[__string]
  }

  object DescribeBrokerEngineTypesResponse {
    @inline
    def apply(
        BrokerEngineTypes: js.UndefOr[__listOfBrokerEngineType] = js.undefined,
        MaxResults: js.UndefOr[__integerMin5Max100] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): DescribeBrokerEngineTypesResponse = {
      val __obj = js.Dynamic.literal()
      BrokerEngineTypes.foreach(__v => __obj.updateDynamic("BrokerEngineTypes")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBrokerEngineTypesResponse]
    }
  }

  @js.native
  trait DescribeBrokerInstanceOptionsRequest extends js.Object {
    var EngineType: js.UndefOr[__string]
    var HostInstanceType: js.UndefOr[__string]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
    var StorageType: js.UndefOr[__string]
  }

  object DescribeBrokerInstanceOptionsRequest {
    @inline
    def apply(
        EngineType: js.UndefOr[__string] = js.undefined,
        HostInstanceType: js.UndefOr[__string] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        StorageType: js.UndefOr[__string] = js.undefined
    ): DescribeBrokerInstanceOptionsRequest = {
      val __obj = js.Dynamic.literal()
      EngineType.foreach(__v => __obj.updateDynamic("EngineType")(__v.asInstanceOf[js.Any]))
      HostInstanceType.foreach(__v => __obj.updateDynamic("HostInstanceType")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StorageType.foreach(__v => __obj.updateDynamic("StorageType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBrokerInstanceOptionsRequest]
    }
  }

  @js.native
  trait DescribeBrokerInstanceOptionsResponse extends js.Object {
    var BrokerInstanceOptions: js.UndefOr[__listOfBrokerInstanceOption]
    var MaxResults: js.UndefOr[__integerMin5Max100]
    var NextToken: js.UndefOr[__string]
  }

  object DescribeBrokerInstanceOptionsResponse {
    @inline
    def apply(
        BrokerInstanceOptions: js.UndefOr[__listOfBrokerInstanceOption] = js.undefined,
        MaxResults: js.UndefOr[__integerMin5Max100] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): DescribeBrokerInstanceOptionsResponse = {
      val __obj = js.Dynamic.literal()
      BrokerInstanceOptions.foreach(__v => __obj.updateDynamic("BrokerInstanceOptions")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBrokerInstanceOptionsResponse]
    }
  }

  @js.native
  trait DescribeBrokerRequest extends js.Object {
    var BrokerId: __string
  }

  object DescribeBrokerRequest {
    @inline
    def apply(
        BrokerId: __string
    ): DescribeBrokerRequest = {
      val __obj = js.Dynamic.literal(
        "BrokerId" -> BrokerId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeBrokerRequest]
    }
  }

  @js.native
  trait DescribeBrokerResponse extends js.Object {
    var ActionsRequired: js.UndefOr[__listOfActionRequired]
    var AuthenticationStrategy: js.UndefOr[AuthenticationStrategy]
    var AutoMinorVersionUpgrade: js.UndefOr[__boolean]
    var BrokerArn: js.UndefOr[__string]
    var BrokerId: js.UndefOr[__string]
    var BrokerInstances: js.UndefOr[__listOfBrokerInstance]
    var BrokerName: js.UndefOr[__string]
    var BrokerState: js.UndefOr[BrokerState]
    var Configurations: js.UndefOr[Configurations]
    var Created: js.UndefOr[__timestampIso8601]
    var DeploymentMode: js.UndefOr[DeploymentMode]
    var EncryptionOptions: js.UndefOr[EncryptionOptions]
    var EngineType: js.UndefOr[EngineType]
    var EngineVersion: js.UndefOr[__string]
    var HostInstanceType: js.UndefOr[__string]
    var LdapServerMetadata: js.UndefOr[LdapServerMetadataOutput]
    var Logs: js.UndefOr[LogsSummary]
    var MaintenanceWindowStartTime: js.UndefOr[WeeklyStartTime]
    var PendingAuthenticationStrategy: js.UndefOr[AuthenticationStrategy]
    var PendingEngineVersion: js.UndefOr[__string]
    var PendingHostInstanceType: js.UndefOr[__string]
    var PendingLdapServerMetadata: js.UndefOr[LdapServerMetadataOutput]
    var PendingSecurityGroups: js.UndefOr[__listOf__string]
    var PubliclyAccessible: js.UndefOr[__boolean]
    var SecurityGroups: js.UndefOr[__listOf__string]
    var StorageType: js.UndefOr[BrokerStorageType]
    var SubnetIds: js.UndefOr[__listOf__string]
    var Tags: js.UndefOr[__mapOf__string]
    var Users: js.UndefOr[__listOfUserSummary]
  }

  object DescribeBrokerResponse {
    @inline
    def apply(
        ActionsRequired: js.UndefOr[__listOfActionRequired] = js.undefined,
        AuthenticationStrategy: js.UndefOr[AuthenticationStrategy] = js.undefined,
        AutoMinorVersionUpgrade: js.UndefOr[__boolean] = js.undefined,
        BrokerArn: js.UndefOr[__string] = js.undefined,
        BrokerId: js.UndefOr[__string] = js.undefined,
        BrokerInstances: js.UndefOr[__listOfBrokerInstance] = js.undefined,
        BrokerName: js.UndefOr[__string] = js.undefined,
        BrokerState: js.UndefOr[BrokerState] = js.undefined,
        Configurations: js.UndefOr[Configurations] = js.undefined,
        Created: js.UndefOr[__timestampIso8601] = js.undefined,
        DeploymentMode: js.UndefOr[DeploymentMode] = js.undefined,
        EncryptionOptions: js.UndefOr[EncryptionOptions] = js.undefined,
        EngineType: js.UndefOr[EngineType] = js.undefined,
        EngineVersion: js.UndefOr[__string] = js.undefined,
        HostInstanceType: js.UndefOr[__string] = js.undefined,
        LdapServerMetadata: js.UndefOr[LdapServerMetadataOutput] = js.undefined,
        Logs: js.UndefOr[LogsSummary] = js.undefined,
        MaintenanceWindowStartTime: js.UndefOr[WeeklyStartTime] = js.undefined,
        PendingAuthenticationStrategy: js.UndefOr[AuthenticationStrategy] = js.undefined,
        PendingEngineVersion: js.UndefOr[__string] = js.undefined,
        PendingHostInstanceType: js.UndefOr[__string] = js.undefined,
        PendingLdapServerMetadata: js.UndefOr[LdapServerMetadataOutput] = js.undefined,
        PendingSecurityGroups: js.UndefOr[__listOf__string] = js.undefined,
        PubliclyAccessible: js.UndefOr[__boolean] = js.undefined,
        SecurityGroups: js.UndefOr[__listOf__string] = js.undefined,
        StorageType: js.UndefOr[BrokerStorageType] = js.undefined,
        SubnetIds: js.UndefOr[__listOf__string] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined,
        Users: js.UndefOr[__listOfUserSummary] = js.undefined
    ): DescribeBrokerResponse = {
      val __obj = js.Dynamic.literal()
      ActionsRequired.foreach(__v => __obj.updateDynamic("ActionsRequired")(__v.asInstanceOf[js.Any]))
      AuthenticationStrategy.foreach(__v => __obj.updateDynamic("AuthenticationStrategy")(__v.asInstanceOf[js.Any]))
      AutoMinorVersionUpgrade.foreach(__v => __obj.updateDynamic("AutoMinorVersionUpgrade")(__v.asInstanceOf[js.Any]))
      BrokerArn.foreach(__v => __obj.updateDynamic("BrokerArn")(__v.asInstanceOf[js.Any]))
      BrokerId.foreach(__v => __obj.updateDynamic("BrokerId")(__v.asInstanceOf[js.Any]))
      BrokerInstances.foreach(__v => __obj.updateDynamic("BrokerInstances")(__v.asInstanceOf[js.Any]))
      BrokerName.foreach(__v => __obj.updateDynamic("BrokerName")(__v.asInstanceOf[js.Any]))
      BrokerState.foreach(__v => __obj.updateDynamic("BrokerState")(__v.asInstanceOf[js.Any]))
      Configurations.foreach(__v => __obj.updateDynamic("Configurations")(__v.asInstanceOf[js.Any]))
      Created.foreach(__v => __obj.updateDynamic("Created")(__v.asInstanceOf[js.Any]))
      DeploymentMode.foreach(__v => __obj.updateDynamic("DeploymentMode")(__v.asInstanceOf[js.Any]))
      EncryptionOptions.foreach(__v => __obj.updateDynamic("EncryptionOptions")(__v.asInstanceOf[js.Any]))
      EngineType.foreach(__v => __obj.updateDynamic("EngineType")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      HostInstanceType.foreach(__v => __obj.updateDynamic("HostInstanceType")(__v.asInstanceOf[js.Any]))
      LdapServerMetadata.foreach(__v => __obj.updateDynamic("LdapServerMetadata")(__v.asInstanceOf[js.Any]))
      Logs.foreach(__v => __obj.updateDynamic("Logs")(__v.asInstanceOf[js.Any]))
      MaintenanceWindowStartTime.foreach(__v => __obj.updateDynamic("MaintenanceWindowStartTime")(__v.asInstanceOf[js.Any]))
      PendingAuthenticationStrategy.foreach(__v => __obj.updateDynamic("PendingAuthenticationStrategy")(__v.asInstanceOf[js.Any]))
      PendingEngineVersion.foreach(__v => __obj.updateDynamic("PendingEngineVersion")(__v.asInstanceOf[js.Any]))
      PendingHostInstanceType.foreach(__v => __obj.updateDynamic("PendingHostInstanceType")(__v.asInstanceOf[js.Any]))
      PendingLdapServerMetadata.foreach(__v => __obj.updateDynamic("PendingLdapServerMetadata")(__v.asInstanceOf[js.Any]))
      PendingSecurityGroups.foreach(__v => __obj.updateDynamic("PendingSecurityGroups")(__v.asInstanceOf[js.Any]))
      PubliclyAccessible.foreach(__v => __obj.updateDynamic("PubliclyAccessible")(__v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.updateDynamic("SecurityGroups")(__v.asInstanceOf[js.Any]))
      StorageType.foreach(__v => __obj.updateDynamic("StorageType")(__v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.updateDynamic("SubnetIds")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Users.foreach(__v => __obj.updateDynamic("Users")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBrokerResponse]
    }
  }

  @js.native
  trait DescribeConfigurationRequest extends js.Object {
    var ConfigurationId: __string
  }

  object DescribeConfigurationRequest {
    @inline
    def apply(
        ConfigurationId: __string
    ): DescribeConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationId" -> ConfigurationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeConfigurationRequest]
    }
  }

  @js.native
  trait DescribeConfigurationResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var AuthenticationStrategy: js.UndefOr[AuthenticationStrategy]
    var Created: js.UndefOr[__timestampIso8601]
    var Description: js.UndefOr[__string]
    var EngineType: js.UndefOr[EngineType]
    var EngineVersion: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var LatestRevision: js.UndefOr[ConfigurationRevision]
    var Name: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
  }

  object DescribeConfigurationResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        AuthenticationStrategy: js.UndefOr[AuthenticationStrategy] = js.undefined,
        Created: js.UndefOr[__timestampIso8601] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        EngineType: js.UndefOr[EngineType] = js.undefined,
        EngineVersion: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        LatestRevision: js.UndefOr[ConfigurationRevision] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): DescribeConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      AuthenticationStrategy.foreach(__v => __obj.updateDynamic("AuthenticationStrategy")(__v.asInstanceOf[js.Any]))
      Created.foreach(__v => __obj.updateDynamic("Created")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EngineType.foreach(__v => __obj.updateDynamic("EngineType")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LatestRevision.foreach(__v => __obj.updateDynamic("LatestRevision")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConfigurationResponse]
    }
  }

  @js.native
  trait DescribeConfigurationRevisionRequest extends js.Object {
    var ConfigurationId: __string
    var ConfigurationRevision: __string
  }

  object DescribeConfigurationRevisionRequest {
    @inline
    def apply(
        ConfigurationId: __string,
        ConfigurationRevision: __string
    ): DescribeConfigurationRevisionRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationId" -> ConfigurationId.asInstanceOf[js.Any],
        "ConfigurationRevision" -> ConfigurationRevision.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeConfigurationRevisionRequest]
    }
  }

  @js.native
  trait DescribeConfigurationRevisionResponse extends js.Object {
    var ConfigurationId: js.UndefOr[__string]
    var Created: js.UndefOr[__timestampIso8601]
    var Data: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
  }

  object DescribeConfigurationRevisionResponse {
    @inline
    def apply(
        ConfigurationId: js.UndefOr[__string] = js.undefined,
        Created: js.UndefOr[__timestampIso8601] = js.undefined,
        Data: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined
    ): DescribeConfigurationRevisionResponse = {
      val __obj = js.Dynamic.literal()
      ConfigurationId.foreach(__v => __obj.updateDynamic("ConfigurationId")(__v.asInstanceOf[js.Any]))
      Created.foreach(__v => __obj.updateDynamic("Created")(__v.asInstanceOf[js.Any]))
      Data.foreach(__v => __obj.updateDynamic("Data")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeConfigurationRevisionResponse]
    }
  }

  @js.native
  trait DescribeUserRequest extends js.Object {
    var BrokerId: __string
    var Username: __string
  }

  object DescribeUserRequest {
    @inline
    def apply(
        BrokerId: __string,
        Username: __string
    ): DescribeUserRequest = {
      val __obj = js.Dynamic.literal(
        "BrokerId" -> BrokerId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeUserRequest]
    }
  }

  @js.native
  trait DescribeUserResponse extends js.Object {
    var BrokerId: js.UndefOr[__string]
    var ConsoleAccess: js.UndefOr[__boolean]
    var Groups: js.UndefOr[__listOf__string]
    var Pending: js.UndefOr[UserPendingChanges]
    var Username: js.UndefOr[__string]
  }

  object DescribeUserResponse {
    @inline
    def apply(
        BrokerId: js.UndefOr[__string] = js.undefined,
        ConsoleAccess: js.UndefOr[__boolean] = js.undefined,
        Groups: js.UndefOr[__listOf__string] = js.undefined,
        Pending: js.UndefOr[UserPendingChanges] = js.undefined,
        Username: js.UndefOr[__string] = js.undefined
    ): DescribeUserResponse = {
      val __obj = js.Dynamic.literal()
      BrokerId.foreach(__v => __obj.updateDynamic("BrokerId")(__v.asInstanceOf[js.Any]))
      ConsoleAccess.foreach(__v => __obj.updateDynamic("ConsoleAccess")(__v.asInstanceOf[js.Any]))
      Groups.foreach(__v => __obj.updateDynamic("Groups")(__v.asInstanceOf[js.Any]))
      Pending.foreach(__v => __obj.updateDynamic("Pending")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeUserResponse]
    }
  }

  /** <important>Does not apply to RabbitMQ brokers. </important> Encryption options for the broker.
    */
  @js.native
  trait EncryptionOptions extends js.Object {
    var UseAwsOwnedKey: __boolean
    var KmsKeyId: js.UndefOr[__string]
  }

  object EncryptionOptions {
    @inline
    def apply(
        UseAwsOwnedKey: __boolean,
        KmsKeyId: js.UndefOr[__string] = js.undefined
    ): EncryptionOptions = {
      val __obj = js.Dynamic.literal(
        "UseAwsOwnedKey" -> UseAwsOwnedKey.asInstanceOf[js.Any]
      )

      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EncryptionOptions]
    }
  }

  /** Id of the engine version.
    */
  @js.native
  trait EngineVersion extends js.Object {
    var Name: js.UndefOr[__string]
  }

  object EngineVersion {
    @inline
    def apply(
        Name: js.UndefOr[__string] = js.undefined
    ): EngineVersion = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EngineVersion]
    }
  }

  /** Optional. The metadata of the LDAP server used to authenticate and authorize connections to the broker. <important>Does not apply to RabbitMQ brokers. </important>
    */
  @js.native
  trait LdapServerMetadataInput extends js.Object {
    var Hosts: __listOf__string
    var RoleBase: __string
    var RoleSearchMatching: __string
    var ServiceAccountPassword: __string
    var ServiceAccountUsername: __string
    var UserBase: __string
    var UserSearchMatching: __string
    var RoleName: js.UndefOr[__string]
    var RoleSearchSubtree: js.UndefOr[__boolean]
    var UserRoleName: js.UndefOr[__string]
    var UserSearchSubtree: js.UndefOr[__boolean]
  }

  object LdapServerMetadataInput {
    @inline
    def apply(
        Hosts: __listOf__string,
        RoleBase: __string,
        RoleSearchMatching: __string,
        ServiceAccountPassword: __string,
        ServiceAccountUsername: __string,
        UserBase: __string,
        UserSearchMatching: __string,
        RoleName: js.UndefOr[__string] = js.undefined,
        RoleSearchSubtree: js.UndefOr[__boolean] = js.undefined,
        UserRoleName: js.UndefOr[__string] = js.undefined,
        UserSearchSubtree: js.UndefOr[__boolean] = js.undefined
    ): LdapServerMetadataInput = {
      val __obj = js.Dynamic.literal(
        "Hosts" -> Hosts.asInstanceOf[js.Any],
        "RoleBase" -> RoleBase.asInstanceOf[js.Any],
        "RoleSearchMatching" -> RoleSearchMatching.asInstanceOf[js.Any],
        "ServiceAccountPassword" -> ServiceAccountPassword.asInstanceOf[js.Any],
        "ServiceAccountUsername" -> ServiceAccountUsername.asInstanceOf[js.Any],
        "UserBase" -> UserBase.asInstanceOf[js.Any],
        "UserSearchMatching" -> UserSearchMatching.asInstanceOf[js.Any]
      )

      RoleName.foreach(__v => __obj.updateDynamic("RoleName")(__v.asInstanceOf[js.Any]))
      RoleSearchSubtree.foreach(__v => __obj.updateDynamic("RoleSearchSubtree")(__v.asInstanceOf[js.Any]))
      UserRoleName.foreach(__v => __obj.updateDynamic("UserRoleName")(__v.asInstanceOf[js.Any]))
      UserSearchSubtree.foreach(__v => __obj.updateDynamic("UserSearchSubtree")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LdapServerMetadataInput]
    }
  }

  /** Optional. The metadata of the LDAP server used to authenticate and authorize connections to the broker.
    */
  @js.native
  trait LdapServerMetadataOutput extends js.Object {
    var Hosts: __listOf__string
    var RoleBase: __string
    var RoleSearchMatching: __string
    var ServiceAccountUsername: __string
    var UserBase: __string
    var UserSearchMatching: __string
    var RoleName: js.UndefOr[__string]
    var RoleSearchSubtree: js.UndefOr[__boolean]
    var UserRoleName: js.UndefOr[__string]
    var UserSearchSubtree: js.UndefOr[__boolean]
  }

  object LdapServerMetadataOutput {
    @inline
    def apply(
        Hosts: __listOf__string,
        RoleBase: __string,
        RoleSearchMatching: __string,
        ServiceAccountUsername: __string,
        UserBase: __string,
        UserSearchMatching: __string,
        RoleName: js.UndefOr[__string] = js.undefined,
        RoleSearchSubtree: js.UndefOr[__boolean] = js.undefined,
        UserRoleName: js.UndefOr[__string] = js.undefined,
        UserSearchSubtree: js.UndefOr[__boolean] = js.undefined
    ): LdapServerMetadataOutput = {
      val __obj = js.Dynamic.literal(
        "Hosts" -> Hosts.asInstanceOf[js.Any],
        "RoleBase" -> RoleBase.asInstanceOf[js.Any],
        "RoleSearchMatching" -> RoleSearchMatching.asInstanceOf[js.Any],
        "ServiceAccountUsername" -> ServiceAccountUsername.asInstanceOf[js.Any],
        "UserBase" -> UserBase.asInstanceOf[js.Any],
        "UserSearchMatching" -> UserSearchMatching.asInstanceOf[js.Any]
      )

      RoleName.foreach(__v => __obj.updateDynamic("RoleName")(__v.asInstanceOf[js.Any]))
      RoleSearchSubtree.foreach(__v => __obj.updateDynamic("RoleSearchSubtree")(__v.asInstanceOf[js.Any]))
      UserRoleName.foreach(__v => __obj.updateDynamic("UserRoleName")(__v.asInstanceOf[js.Any]))
      UserSearchSubtree.foreach(__v => __obj.updateDynamic("UserSearchSubtree")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LdapServerMetadataOutput]
    }
  }

  @js.native
  trait ListBrokersRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListBrokersRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListBrokersRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBrokersRequest]
    }
  }

  @js.native
  trait ListBrokersResponse extends js.Object {
    var BrokerSummaries: js.UndefOr[__listOfBrokerSummary]
    var NextToken: js.UndefOr[__string]
  }

  object ListBrokersResponse {
    @inline
    def apply(
        BrokerSummaries: js.UndefOr[__listOfBrokerSummary] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListBrokersResponse = {
      val __obj = js.Dynamic.literal()
      BrokerSummaries.foreach(__v => __obj.updateDynamic("BrokerSummaries")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBrokersResponse]
    }
  }

  @js.native
  trait ListConfigurationRevisionsRequest extends js.Object {
    var ConfigurationId: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListConfigurationRevisionsRequest {
    @inline
    def apply(
        ConfigurationId: __string,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListConfigurationRevisionsRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationId" -> ConfigurationId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConfigurationRevisionsRequest]
    }
  }

  @js.native
  trait ListConfigurationRevisionsResponse extends js.Object {
    var ConfigurationId: js.UndefOr[__string]
    var MaxResults: js.UndefOr[__integer]
    var NextToken: js.UndefOr[__string]
    var Revisions: js.UndefOr[__listOfConfigurationRevision]
  }

  object ListConfigurationRevisionsResponse {
    @inline
    def apply(
        ConfigurationId: js.UndefOr[__string] = js.undefined,
        MaxResults: js.UndefOr[__integer] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        Revisions: js.UndefOr[__listOfConfigurationRevision] = js.undefined
    ): ListConfigurationRevisionsResponse = {
      val __obj = js.Dynamic.literal()
      ConfigurationId.foreach(__v => __obj.updateDynamic("ConfigurationId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Revisions.foreach(__v => __obj.updateDynamic("Revisions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConfigurationRevisionsResponse]
    }
  }

  @js.native
  trait ListConfigurationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListConfigurationsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListConfigurationsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConfigurationsRequest]
    }
  }

  @js.native
  trait ListConfigurationsResponse extends js.Object {
    var Configurations: js.UndefOr[__listOfConfiguration]
    var MaxResults: js.UndefOr[__integer]
    var NextToken: js.UndefOr[__string]
  }

  object ListConfigurationsResponse {
    @inline
    def apply(
        Configurations: js.UndefOr[__listOfConfiguration] = js.undefined,
        MaxResults: js.UndefOr[__integer] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListConfigurationsResponse = {
      val __obj = js.Dynamic.literal()
      Configurations.foreach(__v => __obj.updateDynamic("Configurations")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConfigurationsResponse]
    }
  }

  @js.native
  trait ListTagsRequest extends js.Object {
    var ResourceArn: __string
  }

  object ListTagsRequest {
    @inline
    def apply(
        ResourceArn: __string
    ): ListTagsRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsRequest]
    }
  }

  @js.native
  trait ListTagsResponse extends js.Object {
    var Tags: js.UndefOr[__mapOf__string]
  }

  object ListTagsResponse {
    @inline
    def apply(
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): ListTagsResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsResponse]
    }
  }

  @js.native
  trait ListUsersRequest extends js.Object {
    var BrokerId: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListUsersRequest {
    @inline
    def apply(
        BrokerId: __string,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListUsersRequest = {
      val __obj = js.Dynamic.literal(
        "BrokerId" -> BrokerId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersRequest]
    }
  }

  @js.native
  trait ListUsersResponse extends js.Object {
    var BrokerId: js.UndefOr[__string]
    var MaxResults: js.UndefOr[__integerMin5Max100]
    var NextToken: js.UndefOr[__string]
    var Users: js.UndefOr[__listOfUserSummary]
  }

  object ListUsersResponse {
    @inline
    def apply(
        BrokerId: js.UndefOr[__string] = js.undefined,
        MaxResults: js.UndefOr[__integerMin5Max100] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        Users: js.UndefOr[__listOfUserSummary] = js.undefined
    ): ListUsersResponse = {
      val __obj = js.Dynamic.literal()
      BrokerId.foreach(__v => __obj.updateDynamic("BrokerId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Users.foreach(__v => __obj.updateDynamic("Users")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListUsersResponse]
    }
  }

  /** The list of information about logs to be enabled for the specified broker.
    */
  @js.native
  trait Logs extends js.Object {
    var Audit: js.UndefOr[__boolean]
    var General: js.UndefOr[__boolean]
  }

  object Logs {
    @inline
    def apply(
        Audit: js.UndefOr[__boolean] = js.undefined,
        General: js.UndefOr[__boolean] = js.undefined
    ): Logs = {
      val __obj = js.Dynamic.literal()
      Audit.foreach(__v => __obj.updateDynamic("Audit")(__v.asInstanceOf[js.Any]))
      General.foreach(__v => __obj.updateDynamic("General")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Logs]
    }
  }

  /** The list of information about logs currently enabled and pending to be deployed for the specified broker.
    */
  @js.native
  trait LogsSummary extends js.Object {
    var General: __boolean
    var GeneralLogGroup: __string
    var Audit: js.UndefOr[__boolean]
    var AuditLogGroup: js.UndefOr[__string]
    var Pending: js.UndefOr[PendingLogs]
  }

  object LogsSummary {
    @inline
    def apply(
        General: __boolean,
        GeneralLogGroup: __string,
        Audit: js.UndefOr[__boolean] = js.undefined,
        AuditLogGroup: js.UndefOr[__string] = js.undefined,
        Pending: js.UndefOr[PendingLogs] = js.undefined
    ): LogsSummary = {
      val __obj = js.Dynamic.literal(
        "General" -> General.asInstanceOf[js.Any],
        "GeneralLogGroup" -> GeneralLogGroup.asInstanceOf[js.Any]
      )

      Audit.foreach(__v => __obj.updateDynamic("Audit")(__v.asInstanceOf[js.Any]))
      AuditLogGroup.foreach(__v => __obj.updateDynamic("AuditLogGroup")(__v.asInstanceOf[js.Any]))
      Pending.foreach(__v => __obj.updateDynamic("Pending")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LogsSummary]
    }
  }

  /** The list of information about logs to be enabled for the specified broker.
    */
  @js.native
  trait PendingLogs extends js.Object {
    var Audit: js.UndefOr[__boolean]
    var General: js.UndefOr[__boolean]
  }

  object PendingLogs {
    @inline
    def apply(
        Audit: js.UndefOr[__boolean] = js.undefined,
        General: js.UndefOr[__boolean] = js.undefined
    ): PendingLogs = {
      val __obj = js.Dynamic.literal()
      Audit.foreach(__v => __obj.updateDynamic("Audit")(__v.asInstanceOf[js.Any]))
      General.foreach(__v => __obj.updateDynamic("General")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PendingLogs]
    }
  }

  @js.native
  trait RebootBrokerRequest extends js.Object {
    var BrokerId: __string
  }

  object RebootBrokerRequest {
    @inline
    def apply(
        BrokerId: __string
    ): RebootBrokerRequest = {
      val __obj = js.Dynamic.literal(
        "BrokerId" -> BrokerId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RebootBrokerRequest]
    }
  }

  @js.native
  trait RebootBrokerResponse extends js.Object

  object RebootBrokerResponse {
    @inline
    def apply(): RebootBrokerResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RebootBrokerResponse]
    }
  }

  /** Returns information about the XML element or attribute that was sanitized in the configuration.
    */
  @js.native
  trait SanitizationWarning extends js.Object {
    var Reason: SanitizationWarningReason
    var AttributeName: js.UndefOr[__string]
    var ElementName: js.UndefOr[__string]
  }

  object SanitizationWarning {
    @inline
    def apply(
        Reason: SanitizationWarningReason,
        AttributeName: js.UndefOr[__string] = js.undefined,
        ElementName: js.UndefOr[__string] = js.undefined
    ): SanitizationWarning = {
      val __obj = js.Dynamic.literal(
        "Reason" -> Reason.asInstanceOf[js.Any]
      )

      AttributeName.foreach(__v => __obj.updateDynamic("AttributeName")(__v.asInstanceOf[js.Any]))
      ElementName.foreach(__v => __obj.updateDynamic("ElementName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SanitizationWarning]
    }
  }

  /** Updates the broker using the specified properties.
    */
  @js.native
  trait UpdateBrokerRequest extends js.Object {
    var BrokerId: __string
    var AuthenticationStrategy: js.UndefOr[AuthenticationStrategy]
    var AutoMinorVersionUpgrade: js.UndefOr[__boolean]
    var Configuration: js.UndefOr[ConfigurationId]
    var EngineVersion: js.UndefOr[__string]
    var HostInstanceType: js.UndefOr[__string]
    var LdapServerMetadata: js.UndefOr[LdapServerMetadataInput]
    var Logs: js.UndefOr[Logs]
    var MaintenanceWindowStartTime: js.UndefOr[WeeklyStartTime]
    var SecurityGroups: js.UndefOr[__listOf__string]
  }

  object UpdateBrokerRequest {
    @inline
    def apply(
        BrokerId: __string,
        AuthenticationStrategy: js.UndefOr[AuthenticationStrategy] = js.undefined,
        AutoMinorVersionUpgrade: js.UndefOr[__boolean] = js.undefined,
        Configuration: js.UndefOr[ConfigurationId] = js.undefined,
        EngineVersion: js.UndefOr[__string] = js.undefined,
        HostInstanceType: js.UndefOr[__string] = js.undefined,
        LdapServerMetadata: js.UndefOr[LdapServerMetadataInput] = js.undefined,
        Logs: js.UndefOr[Logs] = js.undefined,
        MaintenanceWindowStartTime: js.UndefOr[WeeklyStartTime] = js.undefined,
        SecurityGroups: js.UndefOr[__listOf__string] = js.undefined
    ): UpdateBrokerRequest = {
      val __obj = js.Dynamic.literal(
        "BrokerId" -> BrokerId.asInstanceOf[js.Any]
      )

      AuthenticationStrategy.foreach(__v => __obj.updateDynamic("AuthenticationStrategy")(__v.asInstanceOf[js.Any]))
      AutoMinorVersionUpgrade.foreach(__v => __obj.updateDynamic("AutoMinorVersionUpgrade")(__v.asInstanceOf[js.Any]))
      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      HostInstanceType.foreach(__v => __obj.updateDynamic("HostInstanceType")(__v.asInstanceOf[js.Any]))
      LdapServerMetadata.foreach(__v => __obj.updateDynamic("LdapServerMetadata")(__v.asInstanceOf[js.Any]))
      Logs.foreach(__v => __obj.updateDynamic("Logs")(__v.asInstanceOf[js.Any]))
      MaintenanceWindowStartTime.foreach(__v => __obj.updateDynamic("MaintenanceWindowStartTime")(__v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.updateDynamic("SecurityGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBrokerRequest]
    }
  }

  @js.native
  trait UpdateBrokerResponse extends js.Object {
    var AuthenticationStrategy: js.UndefOr[AuthenticationStrategy]
    var AutoMinorVersionUpgrade: js.UndefOr[__boolean]
    var BrokerId: js.UndefOr[__string]
    var Configuration: js.UndefOr[ConfigurationId]
    var EngineVersion: js.UndefOr[__string]
    var HostInstanceType: js.UndefOr[__string]
    var LdapServerMetadata: js.UndefOr[LdapServerMetadataOutput]
    var Logs: js.UndefOr[Logs]
    var MaintenanceWindowStartTime: js.UndefOr[WeeklyStartTime]
    var SecurityGroups: js.UndefOr[__listOf__string]
  }

  object UpdateBrokerResponse {
    @inline
    def apply(
        AuthenticationStrategy: js.UndefOr[AuthenticationStrategy] = js.undefined,
        AutoMinorVersionUpgrade: js.UndefOr[__boolean] = js.undefined,
        BrokerId: js.UndefOr[__string] = js.undefined,
        Configuration: js.UndefOr[ConfigurationId] = js.undefined,
        EngineVersion: js.UndefOr[__string] = js.undefined,
        HostInstanceType: js.UndefOr[__string] = js.undefined,
        LdapServerMetadata: js.UndefOr[LdapServerMetadataOutput] = js.undefined,
        Logs: js.UndefOr[Logs] = js.undefined,
        MaintenanceWindowStartTime: js.UndefOr[WeeklyStartTime] = js.undefined,
        SecurityGroups: js.UndefOr[__listOf__string] = js.undefined
    ): UpdateBrokerResponse = {
      val __obj = js.Dynamic.literal()
      AuthenticationStrategy.foreach(__v => __obj.updateDynamic("AuthenticationStrategy")(__v.asInstanceOf[js.Any]))
      AutoMinorVersionUpgrade.foreach(__v => __obj.updateDynamic("AutoMinorVersionUpgrade")(__v.asInstanceOf[js.Any]))
      BrokerId.foreach(__v => __obj.updateDynamic("BrokerId")(__v.asInstanceOf[js.Any]))
      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      HostInstanceType.foreach(__v => __obj.updateDynamic("HostInstanceType")(__v.asInstanceOf[js.Any]))
      LdapServerMetadata.foreach(__v => __obj.updateDynamic("LdapServerMetadata")(__v.asInstanceOf[js.Any]))
      Logs.foreach(__v => __obj.updateDynamic("Logs")(__v.asInstanceOf[js.Any]))
      MaintenanceWindowStartTime.foreach(__v => __obj.updateDynamic("MaintenanceWindowStartTime")(__v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.updateDynamic("SecurityGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBrokerResponse]
    }
  }

  /** Updates the specified configuration.
    */
  @js.native
  trait UpdateConfigurationRequest extends js.Object {
    var ConfigurationId: __string
    var Data: __string
    var Description: js.UndefOr[__string]
  }

  object UpdateConfigurationRequest {
    @inline
    def apply(
        ConfigurationId: __string,
        Data: __string,
        Description: js.UndefOr[__string] = js.undefined
    ): UpdateConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationId" -> ConfigurationId.asInstanceOf[js.Any],
        "Data" -> Data.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateConfigurationRequest]
    }
  }

  @js.native
  trait UpdateConfigurationResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Created: js.UndefOr[__timestampIso8601]
    var Id: js.UndefOr[__string]
    var LatestRevision: js.UndefOr[ConfigurationRevision]
    var Name: js.UndefOr[__string]
    var Warnings: js.UndefOr[__listOfSanitizationWarning]
  }

  object UpdateConfigurationResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Created: js.UndefOr[__timestampIso8601] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        LatestRevision: js.UndefOr[ConfigurationRevision] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        Warnings: js.UndefOr[__listOfSanitizationWarning] = js.undefined
    ): UpdateConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Created.foreach(__v => __obj.updateDynamic("Created")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LatestRevision.foreach(__v => __obj.updateDynamic("LatestRevision")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Warnings.foreach(__v => __obj.updateDynamic("Warnings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateConfigurationResponse]
    }
  }

  /** Updates the information for an ActiveMQ user.
    */
  @js.native
  trait UpdateUserRequest extends js.Object {
    var BrokerId: __string
    var Username: __string
    var ConsoleAccess: js.UndefOr[__boolean]
    var Groups: js.UndefOr[__listOf__string]
    var Password: js.UndefOr[__string]
  }

  object UpdateUserRequest {
    @inline
    def apply(
        BrokerId: __string,
        Username: __string,
        ConsoleAccess: js.UndefOr[__boolean] = js.undefined,
        Groups: js.UndefOr[__listOf__string] = js.undefined,
        Password: js.UndefOr[__string] = js.undefined
    ): UpdateUserRequest = {
      val __obj = js.Dynamic.literal(
        "BrokerId" -> BrokerId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )

      ConsoleAccess.foreach(__v => __obj.updateDynamic("ConsoleAccess")(__v.asInstanceOf[js.Any]))
      Groups.foreach(__v => __obj.updateDynamic("Groups")(__v.asInstanceOf[js.Any]))
      Password.foreach(__v => __obj.updateDynamic("Password")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUserRequest]
    }
  }

  @js.native
  trait UpdateUserResponse extends js.Object

  object UpdateUserResponse {
    @inline
    def apply(): UpdateUserResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateUserResponse]
    }
  }

  /** A user associated with the broker. For RabbitMQ brokers, one and only one administrative user is accepted and created when a broker is first provisioned. All subsequent broker users are created by making RabbitMQ API calls directly to brokers or via the RabbitMQ web console.
    */
  @js.native
  trait User extends js.Object {
    var Password: __string
    var Username: __string
    var ConsoleAccess: js.UndefOr[__boolean]
    var Groups: js.UndefOr[__listOf__string]
  }

  object User {
    @inline
    def apply(
        Password: __string,
        Username: __string,
        ConsoleAccess: js.UndefOr[__boolean] = js.undefined,
        Groups: js.UndefOr[__listOf__string] = js.undefined
    ): User = {
      val __obj = js.Dynamic.literal(
        "Password" -> Password.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )

      ConsoleAccess.foreach(__v => __obj.updateDynamic("ConsoleAccess")(__v.asInstanceOf[js.Any]))
      Groups.foreach(__v => __obj.updateDynamic("Groups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[User]
    }
  }

  /** Returns information about the status of the changes pending for the ActiveMQ user.
    */
  @js.native
  trait UserPendingChanges extends js.Object {
    var PendingChange: ChangeType
    var ConsoleAccess: js.UndefOr[__boolean]
    var Groups: js.UndefOr[__listOf__string]
  }

  object UserPendingChanges {
    @inline
    def apply(
        PendingChange: ChangeType,
        ConsoleAccess: js.UndefOr[__boolean] = js.undefined,
        Groups: js.UndefOr[__listOf__string] = js.undefined
    ): UserPendingChanges = {
      val __obj = js.Dynamic.literal(
        "PendingChange" -> PendingChange.asInstanceOf[js.Any]
      )

      ConsoleAccess.foreach(__v => __obj.updateDynamic("ConsoleAccess")(__v.asInstanceOf[js.Any]))
      Groups.foreach(__v => __obj.updateDynamic("Groups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserPendingChanges]
    }
  }

  /** Returns a list of all broker users. Does not apply to RabbitMQ brokers.
    */
  @js.native
  trait UserSummary extends js.Object {
    var Username: __string
    var PendingChange: js.UndefOr[ChangeType]
  }

  object UserSummary {
    @inline
    def apply(
        Username: __string,
        PendingChange: js.UndefOr[ChangeType] = js.undefined
    ): UserSummary = {
      val __obj = js.Dynamic.literal(
        "Username" -> Username.asInstanceOf[js.Any]
      )

      PendingChange.foreach(__v => __obj.updateDynamic("PendingChange")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserSummary]
    }
  }

  /** The scheduled time period relative to UTC during which Amazon MQ begins to apply pending updates or patches to the broker.
    */
  @js.native
  trait WeeklyStartTime extends js.Object {
    var DayOfWeek: DayOfWeek
    var TimeOfDay: __string
    var TimeZone: js.UndefOr[__string]
  }

  object WeeklyStartTime {
    @inline
    def apply(
        DayOfWeek: DayOfWeek,
        TimeOfDay: __string,
        TimeZone: js.UndefOr[__string] = js.undefined
    ): WeeklyStartTime = {
      val __obj = js.Dynamic.literal(
        "DayOfWeek" -> DayOfWeek.asInstanceOf[js.Any],
        "TimeOfDay" -> TimeOfDay.asInstanceOf[js.Any]
      )

      TimeZone.foreach(__v => __obj.updateDynamic("TimeZone")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WeeklyStartTime]
    }
  }
}
