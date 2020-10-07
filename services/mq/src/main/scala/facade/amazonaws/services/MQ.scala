package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object mq {
  type MaxResults = Int
  type __boolean = Boolean
  type __integer = Int
  type __integerMin5Max100 = Int
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

  implicit final class MQOps(private val service: MQ) extends AnyVal {

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
}

package mq {
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

  /** The authentication strategy used to secure the broker.
    */
  @js.native
  sealed trait AuthenticationStrategy extends js.Any
  object AuthenticationStrategy {
    val SIMPLE = "SIMPLE".asInstanceOf[AuthenticationStrategy]
    val LDAP = "LDAP".asInstanceOf[AuthenticationStrategy]

    @inline def values = js.Array(SIMPLE, LDAP)
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

  /** The status of the broker.
    */
  @js.native
  sealed trait BrokerState extends js.Any
  object BrokerState {
    val CREATION_IN_PROGRESS = "CREATION_IN_PROGRESS".asInstanceOf[BrokerState]
    val CREATION_FAILED = "CREATION_FAILED".asInstanceOf[BrokerState]
    val DELETION_IN_PROGRESS = "DELETION_IN_PROGRESS".asInstanceOf[BrokerState]
    val RUNNING = "RUNNING".asInstanceOf[BrokerState]
    val REBOOT_IN_PROGRESS = "REBOOT_IN_PROGRESS".asInstanceOf[BrokerState]

    @inline def values = js.Array(CREATION_IN_PROGRESS, CREATION_FAILED, DELETION_IN_PROGRESS, RUNNING, REBOOT_IN_PROGRESS)
  }

  /** The storage type of the broker.
    */
  @js.native
  sealed trait BrokerStorageType extends js.Any
  object BrokerStorageType {
    val EBS = "EBS".asInstanceOf[BrokerStorageType]
    val EFS = "EFS".asInstanceOf[BrokerStorageType]

    @inline def values = js.Array(EBS, EFS)
  }

  /** The Amazon Resource Name (ARN) of the broker.
    */
  @js.native
  trait BrokerSummary extends js.Object {
    var BrokerArn: js.UndefOr[__string]
    var BrokerId: js.UndefOr[__string]
    var BrokerName: js.UndefOr[__string]
    var BrokerState: js.UndefOr[BrokerState]
    var Created: js.UndefOr[__timestampIso8601]
    var DeploymentMode: js.UndefOr[DeploymentMode]
    var HostInstanceType: js.UndefOr[__string]
  }

  object BrokerSummary {
    @inline
    def apply(
        BrokerArn: js.UndefOr[__string] = js.undefined,
        BrokerId: js.UndefOr[__string] = js.undefined,
        BrokerName: js.UndefOr[__string] = js.undefined,
        BrokerState: js.UndefOr[BrokerState] = js.undefined,
        Created: js.UndefOr[__timestampIso8601] = js.undefined,
        DeploymentMode: js.UndefOr[DeploymentMode] = js.undefined,
        HostInstanceType: js.UndefOr[__string] = js.undefined
    ): BrokerSummary = {
      val __obj = js.Dynamic.literal()
      BrokerArn.foreach(__v => __obj.updateDynamic("BrokerArn")(__v.asInstanceOf[js.Any]))
      BrokerId.foreach(__v => __obj.updateDynamic("BrokerId")(__v.asInstanceOf[js.Any]))
      BrokerName.foreach(__v => __obj.updateDynamic("BrokerName")(__v.asInstanceOf[js.Any]))
      BrokerState.foreach(__v => __obj.updateDynamic("BrokerState")(__v.asInstanceOf[js.Any]))
      Created.foreach(__v => __obj.updateDynamic("Created")(__v.asInstanceOf[js.Any]))
      DeploymentMode.foreach(__v => __obj.updateDynamic("DeploymentMode")(__v.asInstanceOf[js.Any]))
      HostInstanceType.foreach(__v => __obj.updateDynamic("HostInstanceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BrokerSummary]
    }
  }

  /** The type of change pending for the ActiveMQ user.
    */
  @js.native
  sealed trait ChangeType extends js.Any
  object ChangeType {
    val CREATE = "CREATE".asInstanceOf[ChangeType]
    val UPDATE = "UPDATE".asInstanceOf[ChangeType]
    val DELETE = "DELETE".asInstanceOf[ChangeType]

    @inline def values = js.Array(CREATE, UPDATE, DELETE)
  }

  /** Returns information about all configurations.
    */
  @js.native
  trait Configuration extends js.Object {
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

  object Configuration {
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
    ): Configuration = {
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
      __obj.asInstanceOf[Configuration]
    }
  }

  /** A list of information about the configuration.
    */
  @js.native
  trait ConfigurationId extends js.Object {
    var Id: js.UndefOr[__string]
    var Revision: js.UndefOr[__integer]
  }

  object ConfigurationId {
    @inline
    def apply(
        Id: js.UndefOr[__string] = js.undefined,
        Revision: js.UndefOr[__integer] = js.undefined
    ): ConfigurationId = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Revision.foreach(__v => __obj.updateDynamic("Revision")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigurationId]
    }
  }

  /** Returns information about the specified configuration revision.
    */
  @js.native
  trait ConfigurationRevision extends js.Object {
    var Created: js.UndefOr[__timestampIso8601]
    var Description: js.UndefOr[__string]
    var Revision: js.UndefOr[__integer]
  }

  object ConfigurationRevision {
    @inline
    def apply(
        Created: js.UndefOr[__timestampIso8601] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        Revision: js.UndefOr[__integer] = js.undefined
    ): ConfigurationRevision = {
      val __obj = js.Dynamic.literal()
      Created.foreach(__v => __obj.updateDynamic("Created")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Revision.foreach(__v => __obj.updateDynamic("Revision")(__v.asInstanceOf[js.Any]))
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
    var AuthenticationStrategy: js.UndefOr[AuthenticationStrategy]
    var AutoMinorVersionUpgrade: js.UndefOr[__boolean]
    var BrokerName: js.UndefOr[__string]
    var Configuration: js.UndefOr[ConfigurationId]
    var CreatorRequestId: js.UndefOr[__string]
    var DeploymentMode: js.UndefOr[DeploymentMode]
    var EncryptionOptions: js.UndefOr[EncryptionOptions]
    var EngineType: js.UndefOr[EngineType]
    var EngineVersion: js.UndefOr[__string]
    var HostInstanceType: js.UndefOr[__string]
    var LdapServerMetadata: js.UndefOr[LdapServerMetadataInput]
    var Logs: js.UndefOr[Logs]
    var MaintenanceWindowStartTime: js.UndefOr[WeeklyStartTime]
    var PubliclyAccessible: js.UndefOr[__boolean]
    var SecurityGroups: js.UndefOr[__listOf__string]
    var StorageType: js.UndefOr[BrokerStorageType]
    var SubnetIds: js.UndefOr[__listOf__string]
    var Tags: js.UndefOr[__mapOf__string]
    var Users: js.UndefOr[__listOfUser]
  }

  object CreateBrokerRequest {
    @inline
    def apply(
        AuthenticationStrategy: js.UndefOr[AuthenticationStrategy] = js.undefined,
        AutoMinorVersionUpgrade: js.UndefOr[__boolean] = js.undefined,
        BrokerName: js.UndefOr[__string] = js.undefined,
        Configuration: js.UndefOr[ConfigurationId] = js.undefined,
        CreatorRequestId: js.UndefOr[__string] = js.undefined,
        DeploymentMode: js.UndefOr[DeploymentMode] = js.undefined,
        EncryptionOptions: js.UndefOr[EncryptionOptions] = js.undefined,
        EngineType: js.UndefOr[EngineType] = js.undefined,
        EngineVersion: js.UndefOr[__string] = js.undefined,
        HostInstanceType: js.UndefOr[__string] = js.undefined,
        LdapServerMetadata: js.UndefOr[LdapServerMetadataInput] = js.undefined,
        Logs: js.UndefOr[Logs] = js.undefined,
        MaintenanceWindowStartTime: js.UndefOr[WeeklyStartTime] = js.undefined,
        PubliclyAccessible: js.UndefOr[__boolean] = js.undefined,
        SecurityGroups: js.UndefOr[__listOf__string] = js.undefined,
        StorageType: js.UndefOr[BrokerStorageType] = js.undefined,
        SubnetIds: js.UndefOr[__listOf__string] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined,
        Users: js.UndefOr[__listOfUser] = js.undefined
    ): CreateBrokerRequest = {
      val __obj = js.Dynamic.literal()
      AuthenticationStrategy.foreach(__v => __obj.updateDynamic("AuthenticationStrategy")(__v.asInstanceOf[js.Any]))
      AutoMinorVersionUpgrade.foreach(__v => __obj.updateDynamic("AutoMinorVersionUpgrade")(__v.asInstanceOf[js.Any]))
      BrokerName.foreach(__v => __obj.updateDynamic("BrokerName")(__v.asInstanceOf[js.Any]))
      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      CreatorRequestId.foreach(__v => __obj.updateDynamic("CreatorRequestId")(__v.asInstanceOf[js.Any]))
      DeploymentMode.foreach(__v => __obj.updateDynamic("DeploymentMode")(__v.asInstanceOf[js.Any]))
      EncryptionOptions.foreach(__v => __obj.updateDynamic("EncryptionOptions")(__v.asInstanceOf[js.Any]))
      EngineType.foreach(__v => __obj.updateDynamic("EngineType")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      HostInstanceType.foreach(__v => __obj.updateDynamic("HostInstanceType")(__v.asInstanceOf[js.Any]))
      LdapServerMetadata.foreach(__v => __obj.updateDynamic("LdapServerMetadata")(__v.asInstanceOf[js.Any]))
      Logs.foreach(__v => __obj.updateDynamic("Logs")(__v.asInstanceOf[js.Any]))
      MaintenanceWindowStartTime.foreach(__v => __obj.updateDynamic("MaintenanceWindowStartTime")(__v.asInstanceOf[js.Any]))
      PubliclyAccessible.foreach(__v => __obj.updateDynamic("PubliclyAccessible")(__v.asInstanceOf[js.Any]))
      SecurityGroups.foreach(__v => __obj.updateDynamic("SecurityGroups")(__v.asInstanceOf[js.Any]))
      StorageType.foreach(__v => __obj.updateDynamic("StorageType")(__v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.updateDynamic("SubnetIds")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Users.foreach(__v => __obj.updateDynamic("Users")(__v.asInstanceOf[js.Any]))
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
    var AuthenticationStrategy: js.UndefOr[AuthenticationStrategy]
    var EngineType: js.UndefOr[EngineType]
    var EngineVersion: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
  }

  object CreateConfigurationRequest {
    @inline
    def apply(
        AuthenticationStrategy: js.UndefOr[AuthenticationStrategy] = js.undefined,
        EngineType: js.UndefOr[EngineType] = js.undefined,
        EngineVersion: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): CreateConfigurationRequest = {
      val __obj = js.Dynamic.literal()
      AuthenticationStrategy.foreach(__v => __obj.updateDynamic("AuthenticationStrategy")(__v.asInstanceOf[js.Any]))
      EngineType.foreach(__v => __obj.updateDynamic("EngineType")(__v.asInstanceOf[js.Any]))
      EngineVersion.foreach(__v => __obj.updateDynamic("EngineVersion")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
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
    var Username: __string
    var ConsoleAccess: js.UndefOr[__boolean]
    var Groups: js.UndefOr[__listOf__string]
    var Password: js.UndefOr[__string]
  }

  object CreateUserRequest {
    @inline
    def apply(
        BrokerId: __string,
        Username: __string,
        ConsoleAccess: js.UndefOr[__boolean] = js.undefined,
        Groups: js.UndefOr[__listOf__string] = js.undefined,
        Password: js.UndefOr[__string] = js.undefined
    ): CreateUserRequest = {
      val __obj = js.Dynamic.literal(
        "BrokerId" -> BrokerId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      )

      ConsoleAccess.foreach(__v => __obj.updateDynamic("ConsoleAccess")(__v.asInstanceOf[js.Any]))
      Groups.foreach(__v => __obj.updateDynamic("Groups")(__v.asInstanceOf[js.Any]))
      Password.foreach(__v => __obj.updateDynamic("Password")(__v.asInstanceOf[js.Any]))
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
  sealed trait DayOfWeek extends js.Any
  object DayOfWeek {
    val MONDAY = "MONDAY".asInstanceOf[DayOfWeek]
    val TUESDAY = "TUESDAY".asInstanceOf[DayOfWeek]
    val WEDNESDAY = "WEDNESDAY".asInstanceOf[DayOfWeek]
    val THURSDAY = "THURSDAY".asInstanceOf[DayOfWeek]
    val FRIDAY = "FRIDAY".asInstanceOf[DayOfWeek]
    val SATURDAY = "SATURDAY".asInstanceOf[DayOfWeek]
    val SUNDAY = "SUNDAY".asInstanceOf[DayOfWeek]

    @inline def values = js.Array(MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY)
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

  /** The deployment mode of the broker.
    */
  @js.native
  sealed trait DeploymentMode extends js.Any
  object DeploymentMode {
    val SINGLE_INSTANCE = "SINGLE_INSTANCE".asInstanceOf[DeploymentMode]
    val ACTIVE_STANDBY_MULTI_AZ = "ACTIVE_STANDBY_MULTI_AZ".asInstanceOf[DeploymentMode]

    @inline def values = js.Array(SINGLE_INSTANCE, ACTIVE_STANDBY_MULTI_AZ)
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

  /** Encryption options for the broker.
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

  /** The type of broker engine. Note: Currently, Amazon MQ supports only ActiveMQ.
    */
  @js.native
  sealed trait EngineType extends js.Any
  object EngineType {
    val ACTIVEMQ = "ACTIVEMQ".asInstanceOf[EngineType]

    @inline def values = js.Array(ACTIVEMQ)
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

  /** The metadata of the LDAP server used to authenticate and authorize connections to the broker.
    */
  @js.native
  trait LdapServerMetadataInput extends js.Object {
    var Hosts: js.UndefOr[__listOf__string]
    var RoleBase: js.UndefOr[__string]
    var RoleName: js.UndefOr[__string]
    var RoleSearchMatching: js.UndefOr[__string]
    var RoleSearchSubtree: js.UndefOr[__boolean]
    var ServiceAccountPassword: js.UndefOr[__string]
    var ServiceAccountUsername: js.UndefOr[__string]
    var UserBase: js.UndefOr[__string]
    var UserRoleName: js.UndefOr[__string]
    var UserSearchMatching: js.UndefOr[__string]
    var UserSearchSubtree: js.UndefOr[__boolean]
  }

  object LdapServerMetadataInput {
    @inline
    def apply(
        Hosts: js.UndefOr[__listOf__string] = js.undefined,
        RoleBase: js.UndefOr[__string] = js.undefined,
        RoleName: js.UndefOr[__string] = js.undefined,
        RoleSearchMatching: js.UndefOr[__string] = js.undefined,
        RoleSearchSubtree: js.UndefOr[__boolean] = js.undefined,
        ServiceAccountPassword: js.UndefOr[__string] = js.undefined,
        ServiceAccountUsername: js.UndefOr[__string] = js.undefined,
        UserBase: js.UndefOr[__string] = js.undefined,
        UserRoleName: js.UndefOr[__string] = js.undefined,
        UserSearchMatching: js.UndefOr[__string] = js.undefined,
        UserSearchSubtree: js.UndefOr[__boolean] = js.undefined
    ): LdapServerMetadataInput = {
      val __obj = js.Dynamic.literal()
      Hosts.foreach(__v => __obj.updateDynamic("Hosts")(__v.asInstanceOf[js.Any]))
      RoleBase.foreach(__v => __obj.updateDynamic("RoleBase")(__v.asInstanceOf[js.Any]))
      RoleName.foreach(__v => __obj.updateDynamic("RoleName")(__v.asInstanceOf[js.Any]))
      RoleSearchMatching.foreach(__v => __obj.updateDynamic("RoleSearchMatching")(__v.asInstanceOf[js.Any]))
      RoleSearchSubtree.foreach(__v => __obj.updateDynamic("RoleSearchSubtree")(__v.asInstanceOf[js.Any]))
      ServiceAccountPassword.foreach(__v => __obj.updateDynamic("ServiceAccountPassword")(__v.asInstanceOf[js.Any]))
      ServiceAccountUsername.foreach(__v => __obj.updateDynamic("ServiceAccountUsername")(__v.asInstanceOf[js.Any]))
      UserBase.foreach(__v => __obj.updateDynamic("UserBase")(__v.asInstanceOf[js.Any]))
      UserRoleName.foreach(__v => __obj.updateDynamic("UserRoleName")(__v.asInstanceOf[js.Any]))
      UserSearchMatching.foreach(__v => __obj.updateDynamic("UserSearchMatching")(__v.asInstanceOf[js.Any]))
      UserSearchSubtree.foreach(__v => __obj.updateDynamic("UserSearchSubtree")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LdapServerMetadataInput]
    }
  }

  /** The metadata of the LDAP server used to authenticate and authorize connections to the broker.
    */
  @js.native
  trait LdapServerMetadataOutput extends js.Object {
    var Hosts: js.UndefOr[__listOf__string]
    var RoleBase: js.UndefOr[__string]
    var RoleName: js.UndefOr[__string]
    var RoleSearchMatching: js.UndefOr[__string]
    var RoleSearchSubtree: js.UndefOr[__boolean]
    var ServiceAccountUsername: js.UndefOr[__string]
    var UserBase: js.UndefOr[__string]
    var UserRoleName: js.UndefOr[__string]
    var UserSearchMatching: js.UndefOr[__string]
    var UserSearchSubtree: js.UndefOr[__boolean]
  }

  object LdapServerMetadataOutput {
    @inline
    def apply(
        Hosts: js.UndefOr[__listOf__string] = js.undefined,
        RoleBase: js.UndefOr[__string] = js.undefined,
        RoleName: js.UndefOr[__string] = js.undefined,
        RoleSearchMatching: js.UndefOr[__string] = js.undefined,
        RoleSearchSubtree: js.UndefOr[__boolean] = js.undefined,
        ServiceAccountUsername: js.UndefOr[__string] = js.undefined,
        UserBase: js.UndefOr[__string] = js.undefined,
        UserRoleName: js.UndefOr[__string] = js.undefined,
        UserSearchMatching: js.UndefOr[__string] = js.undefined,
        UserSearchSubtree: js.UndefOr[__boolean] = js.undefined
    ): LdapServerMetadataOutput = {
      val __obj = js.Dynamic.literal()
      Hosts.foreach(__v => __obj.updateDynamic("Hosts")(__v.asInstanceOf[js.Any]))
      RoleBase.foreach(__v => __obj.updateDynamic("RoleBase")(__v.asInstanceOf[js.Any]))
      RoleName.foreach(__v => __obj.updateDynamic("RoleName")(__v.asInstanceOf[js.Any]))
      RoleSearchMatching.foreach(__v => __obj.updateDynamic("RoleSearchMatching")(__v.asInstanceOf[js.Any]))
      RoleSearchSubtree.foreach(__v => __obj.updateDynamic("RoleSearchSubtree")(__v.asInstanceOf[js.Any]))
      ServiceAccountUsername.foreach(__v => __obj.updateDynamic("ServiceAccountUsername")(__v.asInstanceOf[js.Any]))
      UserBase.foreach(__v => __obj.updateDynamic("UserBase")(__v.asInstanceOf[js.Any]))
      UserRoleName.foreach(__v => __obj.updateDynamic("UserRoleName")(__v.asInstanceOf[js.Any]))
      UserSearchMatching.foreach(__v => __obj.updateDynamic("UserSearchMatching")(__v.asInstanceOf[js.Any]))
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
    var Audit: js.UndefOr[__boolean]
    var AuditLogGroup: js.UndefOr[__string]
    var General: js.UndefOr[__boolean]
    var GeneralLogGroup: js.UndefOr[__string]
    var Pending: js.UndefOr[PendingLogs]
  }

  object LogsSummary {
    @inline
    def apply(
        Audit: js.UndefOr[__boolean] = js.undefined,
        AuditLogGroup: js.UndefOr[__string] = js.undefined,
        General: js.UndefOr[__boolean] = js.undefined,
        GeneralLogGroup: js.UndefOr[__string] = js.undefined,
        Pending: js.UndefOr[PendingLogs] = js.undefined
    ): LogsSummary = {
      val __obj = js.Dynamic.literal()
      Audit.foreach(__v => __obj.updateDynamic("Audit")(__v.asInstanceOf[js.Any]))
      AuditLogGroup.foreach(__v => __obj.updateDynamic("AuditLogGroup")(__v.asInstanceOf[js.Any]))
      General.foreach(__v => __obj.updateDynamic("General")(__v.asInstanceOf[js.Any]))
      GeneralLogGroup.foreach(__v => __obj.updateDynamic("GeneralLogGroup")(__v.asInstanceOf[js.Any]))
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
    var AttributeName: js.UndefOr[__string]
    var ElementName: js.UndefOr[__string]
    var Reason: js.UndefOr[SanitizationWarningReason]
  }

  object SanitizationWarning {
    @inline
    def apply(
        AttributeName: js.UndefOr[__string] = js.undefined,
        ElementName: js.UndefOr[__string] = js.undefined,
        Reason: js.UndefOr[SanitizationWarningReason] = js.undefined
    ): SanitizationWarning = {
      val __obj = js.Dynamic.literal()
      AttributeName.foreach(__v => __obj.updateDynamic("AttributeName")(__v.asInstanceOf[js.Any]))
      ElementName.foreach(__v => __obj.updateDynamic("ElementName")(__v.asInstanceOf[js.Any]))
      Reason.foreach(__v => __obj.updateDynamic("Reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SanitizationWarning]
    }
  }

  /** The reason for which the XML elements or attributes were sanitized.
    */
  @js.native
  sealed trait SanitizationWarningReason extends js.Any
  object SanitizationWarningReason {
    val DISALLOWED_ELEMENT_REMOVED = "DISALLOWED_ELEMENT_REMOVED".asInstanceOf[SanitizationWarningReason]
    val DISALLOWED_ATTRIBUTE_REMOVED = "DISALLOWED_ATTRIBUTE_REMOVED".asInstanceOf[SanitizationWarningReason]
    val INVALID_ATTRIBUTE_VALUE_REMOVED = "INVALID_ATTRIBUTE_VALUE_REMOVED".asInstanceOf[SanitizationWarningReason]

    @inline def values = js.Array(DISALLOWED_ELEMENT_REMOVED, DISALLOWED_ATTRIBUTE_REMOVED, INVALID_ATTRIBUTE_VALUE_REMOVED)
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
      SecurityGroups.foreach(__v => __obj.updateDynamic("SecurityGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBrokerResponse]
    }
  }

  /** Updates the specified configuration.
    */
  @js.native
  trait UpdateConfigurationRequest extends js.Object {
    var ConfigurationId: __string
    var Data: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
  }

  object UpdateConfigurationRequest {
    @inline
    def apply(
        ConfigurationId: __string,
        Data: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined
    ): UpdateConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationId" -> ConfigurationId.asInstanceOf[js.Any]
      )

      Data.foreach(__v => __obj.updateDynamic("Data")(__v.asInstanceOf[js.Any]))
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

  /** An ActiveMQ user associated with the broker.
    */
  @js.native
  trait User extends js.Object {
    var ConsoleAccess: js.UndefOr[__boolean]
    var Groups: js.UndefOr[__listOf__string]
    var Password: js.UndefOr[__string]
    var Username: js.UndefOr[__string]
  }

  object User {
    @inline
    def apply(
        ConsoleAccess: js.UndefOr[__boolean] = js.undefined,
        Groups: js.UndefOr[__listOf__string] = js.undefined,
        Password: js.UndefOr[__string] = js.undefined,
        Username: js.UndefOr[__string] = js.undefined
    ): User = {
      val __obj = js.Dynamic.literal()
      ConsoleAccess.foreach(__v => __obj.updateDynamic("ConsoleAccess")(__v.asInstanceOf[js.Any]))
      Groups.foreach(__v => __obj.updateDynamic("Groups")(__v.asInstanceOf[js.Any]))
      Password.foreach(__v => __obj.updateDynamic("Password")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[User]
    }
  }

  /** Returns information about the status of the changes pending for the ActiveMQ user.
    */
  @js.native
  trait UserPendingChanges extends js.Object {
    var ConsoleAccess: js.UndefOr[__boolean]
    var Groups: js.UndefOr[__listOf__string]
    var PendingChange: js.UndefOr[ChangeType]
  }

  object UserPendingChanges {
    @inline
    def apply(
        ConsoleAccess: js.UndefOr[__boolean] = js.undefined,
        Groups: js.UndefOr[__listOf__string] = js.undefined,
        PendingChange: js.UndefOr[ChangeType] = js.undefined
    ): UserPendingChanges = {
      val __obj = js.Dynamic.literal()
      ConsoleAccess.foreach(__v => __obj.updateDynamic("ConsoleAccess")(__v.asInstanceOf[js.Any]))
      Groups.foreach(__v => __obj.updateDynamic("Groups")(__v.asInstanceOf[js.Any]))
      PendingChange.foreach(__v => __obj.updateDynamic("PendingChange")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserPendingChanges]
    }
  }

  /** Returns a list of all ActiveMQ users.
    */
  @js.native
  trait UserSummary extends js.Object {
    var PendingChange: js.UndefOr[ChangeType]
    var Username: js.UndefOr[__string]
  }

  object UserSummary {
    @inline
    def apply(
        PendingChange: js.UndefOr[ChangeType] = js.undefined,
        Username: js.UndefOr[__string] = js.undefined
    ): UserSummary = {
      val __obj = js.Dynamic.literal()
      PendingChange.foreach(__v => __obj.updateDynamic("PendingChange")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserSummary]
    }
  }

  /** The scheduled time period relative to UTC during which Amazon MQ begins to apply pending updates or patches to the broker.
    */
  @js.native
  trait WeeklyStartTime extends js.Object {
    var DayOfWeek: js.UndefOr[DayOfWeek]
    var TimeOfDay: js.UndefOr[__string]
    var TimeZone: js.UndefOr[__string]
  }

  object WeeklyStartTime {
    @inline
    def apply(
        DayOfWeek: js.UndefOr[DayOfWeek] = js.undefined,
        TimeOfDay: js.UndefOr[__string] = js.undefined,
        TimeZone: js.UndefOr[__string] = js.undefined
    ): WeeklyStartTime = {
      val __obj = js.Dynamic.literal()
      DayOfWeek.foreach(__v => __obj.updateDynamic("DayOfWeek")(__v.asInstanceOf[js.Any]))
      TimeOfDay.foreach(__v => __obj.updateDynamic("TimeOfDay")(__v.asInstanceOf[js.Any]))
      TimeZone.foreach(__v => __obj.updateDynamic("TimeZone")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WeeklyStartTime]
    }
  }
}
