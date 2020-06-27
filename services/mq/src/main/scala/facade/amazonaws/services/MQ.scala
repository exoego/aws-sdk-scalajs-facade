package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object mq {
  type MaxResults                    = Int
  type __boolean                     = Boolean
  type __integer                     = Int
  type __integerMin5Max100           = Int
  type __listOfAvailabilityZone      = js.Array[AvailabilityZone]
  type __listOfBrokerEngineType      = js.Array[BrokerEngineType]
  type __listOfBrokerInstance        = js.Array[BrokerInstance]
  type __listOfBrokerInstanceOption  = js.Array[BrokerInstanceOption]
  type __listOfBrokerSummary         = js.Array[BrokerSummary]
  type __listOfConfiguration         = js.Array[Configuration]
  type __listOfConfigurationId       = js.Array[ConfigurationId]
  type __listOfConfigurationRevision = js.Array[ConfigurationRevision]
  type __listOfDeploymentMode        = js.Array[DeploymentMode]
  type __listOfEngineVersion         = js.Array[EngineVersion]
  type __listOfSanitizationWarning   = js.Array[SanitizationWarning]
  type __listOfUser                  = js.Array[User]
  type __listOfUserSummary           = js.Array[UserSummary]
  type __listOf__string              = js.Array[__string]
  type __mapOf__string               = js.Dictionary[__string]
  type __string                      = String
  type __timestampIso8601            = js.Date

  implicit final class MQOps(private val service: MQ) extends AnyVal {

    @inline def createBrokerFuture(params: CreateBrokerRequest): Future[CreateBrokerResponse] =
      service.createBroker(params).promise().toFuture
    @inline def createConfigurationFuture(params: CreateConfigurationRequest): Future[CreateConfigurationResponse] =
      service.createConfiguration(params).promise().toFuture
    @inline def createTagsFuture(params: CreateTagsRequest): Future[js.Object] =
      service.createTags(params).promise().toFuture
    @inline def createUserFuture(params: CreateUserRequest): Future[CreateUserResponse] =
      service.createUser(params).promise().toFuture
    @inline def deleteBrokerFuture(params: DeleteBrokerRequest): Future[DeleteBrokerResponse] =
      service.deleteBroker(params).promise().toFuture
    @inline def deleteTagsFuture(params: DeleteTagsRequest): Future[js.Object] =
      service.deleteTags(params).promise().toFuture
    @inline def deleteUserFuture(params: DeleteUserRequest): Future[DeleteUserResponse] =
      service.deleteUser(params).promise().toFuture
    @inline def describeBrokerEngineTypesFuture(
        params: DescribeBrokerEngineTypesRequest
    ): Future[DescribeBrokerEngineTypesResponse] = service.describeBrokerEngineTypes(params).promise().toFuture
    @inline def describeBrokerFuture(params: DescribeBrokerRequest): Future[DescribeBrokerResponse] =
      service.describeBroker(params).promise().toFuture
    @inline def describeBrokerInstanceOptionsFuture(
        params: DescribeBrokerInstanceOptionsRequest
    ): Future[DescribeBrokerInstanceOptionsResponse] = service.describeBrokerInstanceOptions(params).promise().toFuture
    @inline def describeConfigurationFuture(
        params: DescribeConfigurationRequest
    ): Future[DescribeConfigurationResponse] = service.describeConfiguration(params).promise().toFuture
    @inline def describeConfigurationRevisionFuture(
        params: DescribeConfigurationRevisionRequest
    ): Future[DescribeConfigurationRevisionResponse] = service.describeConfigurationRevision(params).promise().toFuture
    @inline def describeUserFuture(params: DescribeUserRequest): Future[DescribeUserResponse] =
      service.describeUser(params).promise().toFuture
    @inline def listBrokersFuture(params: ListBrokersRequest): Future[ListBrokersResponse] =
      service.listBrokers(params).promise().toFuture
    @inline def listConfigurationRevisionsFuture(
        params: ListConfigurationRevisionsRequest
    ): Future[ListConfigurationRevisionsResponse] = service.listConfigurationRevisions(params).promise().toFuture
    @inline def listConfigurationsFuture(params: ListConfigurationsRequest): Future[ListConfigurationsResponse] =
      service.listConfigurations(params).promise().toFuture
    @inline def listTagsFuture(params: ListTagsRequest): Future[ListTagsResponse] =
      service.listTags(params).promise().toFuture
    @inline def listUsersFuture(params: ListUsersRequest): Future[ListUsersResponse] =
      service.listUsers(params).promise().toFuture
    @inline def rebootBrokerFuture(params: RebootBrokerRequest): Future[RebootBrokerResponse] =
      service.rebootBroker(params).promise().toFuture
    @inline def updateBrokerFuture(params: UpdateBrokerRequest): Future[UpdateBrokerResponse] =
      service.updateBroker(params).promise().toFuture
    @inline def updateConfigurationFuture(params: UpdateConfigurationRequest): Future[UpdateConfigurationResponse] =
      service.updateConfiguration(params).promise().toFuture
    @inline def updateUserFuture(params: UpdateUserRequest): Future[UpdateUserResponse] =
      service.updateUser(params).promise().toFuture
  }
}

package mq {
  @js.native
  @JSImport("aws-sdk", "MQ")
  class MQ() extends js.Object {
    def this(config: AWSConfig) = this()

    def createBroker(params: CreateBrokerRequest): Request[CreateBrokerResponse]                      = js.native
    def createConfiguration(params: CreateConfigurationRequest): Request[CreateConfigurationResponse] = js.native
    def createTags(params: CreateTagsRequest): Request[js.Object]                                     = js.native
    def createUser(params: CreateUserRequest): Request[CreateUserResponse]                            = js.native
    def deleteBroker(params: DeleteBrokerRequest): Request[DeleteBrokerResponse]                      = js.native
    def deleteTags(params: DeleteTagsRequest): Request[js.Object]                                     = js.native
    def deleteUser(params: DeleteUserRequest): Request[DeleteUserResponse]                            = js.native
    def describeBroker(params: DescribeBrokerRequest): Request[DescribeBrokerResponse]                = js.native
    def describeBrokerEngineTypes(
        params: DescribeBrokerEngineTypesRequest
    ): Request[DescribeBrokerEngineTypesResponse] = js.native
    def describeBrokerInstanceOptions(
        params: DescribeBrokerInstanceOptionsRequest
    ): Request[DescribeBrokerInstanceOptionsResponse]                                                       = js.native
    def describeConfiguration(params: DescribeConfigurationRequest): Request[DescribeConfigurationResponse] = js.native
    def describeConfigurationRevision(
        params: DescribeConfigurationRevisionRequest
    ): Request[DescribeConfigurationRevisionResponse]                            = js.native
    def describeUser(params: DescribeUserRequest): Request[DescribeUserResponse] = js.native
    def listBrokers(params: ListBrokersRequest): Request[ListBrokersResponse]    = js.native
    def listConfigurationRevisions(
        params: ListConfigurationRevisionsRequest
    ): Request[ListConfigurationRevisionsResponse]                                                    = js.native
    def listConfigurations(params: ListConfigurationsRequest): Request[ListConfigurationsResponse]    = js.native
    def listTags(params: ListTagsRequest): Request[ListTagsResponse]                                  = js.native
    def listUsers(params: ListUsersRequest): Request[ListUsersResponse]                               = js.native
    def rebootBroker(params: RebootBrokerRequest): Request[RebootBrokerResponse]                      = js.native
    def updateBroker(params: UpdateBrokerRequest): Request[UpdateBrokerResponse]                      = js.native
    def updateConfiguration(params: UpdateConfigurationRequest): Request[UpdateConfigurationResponse] = js.native
    def updateUser(params: UpdateUserRequest): Request[UpdateUserResponse]                            = js.native
  }

  /**
    * Name of the availability zone.
    */
  @js.native
  @Factory
  trait AvailabilityZone extends js.Object {
    var Name: js.UndefOr[__string]
  }

  /**
    * Types of broker engines.
    */
  @js.native
  @Factory
  trait BrokerEngineType extends js.Object {
    var EngineType: js.UndefOr[EngineType]
    var EngineVersions: js.UndefOr[__listOfEngineVersion]
  }

  /**
    * Returns information about all brokers.
    */
  @js.native
  @Factory
  trait BrokerInstance extends js.Object {
    var ConsoleURL: js.UndefOr[__string]
    var Endpoints: js.UndefOr[__listOf__string]
    var IpAddress: js.UndefOr[__string]
  }

  /**
    * Option for host instance type.
    */
  @js.native
  @Factory
  trait BrokerInstanceOption extends js.Object {
    var AvailabilityZones: js.UndefOr[__listOfAvailabilityZone]
    var EngineType: js.UndefOr[EngineType]
    var HostInstanceType: js.UndefOr[__string]
    var StorageType: js.UndefOr[BrokerStorageType]
    var SupportedDeploymentModes: js.UndefOr[__listOfDeploymentMode]
    var SupportedEngineVersions: js.UndefOr[__listOf__string]
  }

  /**
    * The status of the broker.
    */
  @js.native
  sealed trait BrokerState extends js.Any
  object BrokerState extends js.Object {
    val CREATION_IN_PROGRESS = "CREATION_IN_PROGRESS".asInstanceOf[BrokerState]
    val CREATION_FAILED      = "CREATION_FAILED".asInstanceOf[BrokerState]
    val DELETION_IN_PROGRESS = "DELETION_IN_PROGRESS".asInstanceOf[BrokerState]
    val RUNNING              = "RUNNING".asInstanceOf[BrokerState]
    val REBOOT_IN_PROGRESS   = "REBOOT_IN_PROGRESS".asInstanceOf[BrokerState]

    val values = js.Object.freeze(
      js.Array(CREATION_IN_PROGRESS, CREATION_FAILED, DELETION_IN_PROGRESS, RUNNING, REBOOT_IN_PROGRESS)
    )
  }

  /**
    * The storage type of the broker.
    */
  @js.native
  sealed trait BrokerStorageType extends js.Any
  object BrokerStorageType extends js.Object {
    val EBS = "EBS".asInstanceOf[BrokerStorageType]
    val EFS = "EFS".asInstanceOf[BrokerStorageType]

    val values = js.Object.freeze(js.Array(EBS, EFS))
  }

  /**
    * The Amazon Resource Name (ARN) of the broker.
    */
  @js.native
  @Factory
  trait BrokerSummary extends js.Object {
    var BrokerArn: js.UndefOr[__string]
    var BrokerId: js.UndefOr[__string]
    var BrokerName: js.UndefOr[__string]
    var BrokerState: js.UndefOr[BrokerState]
    var Created: js.UndefOr[__timestampIso8601]
    var DeploymentMode: js.UndefOr[DeploymentMode]
    var HostInstanceType: js.UndefOr[__string]
  }

  /**
    * The type of change pending for the ActiveMQ user.
    */
  @js.native
  sealed trait ChangeType extends js.Any
  object ChangeType extends js.Object {
    val CREATE = "CREATE".asInstanceOf[ChangeType]
    val UPDATE = "UPDATE".asInstanceOf[ChangeType]
    val DELETE = "DELETE".asInstanceOf[ChangeType]

    val values = js.Object.freeze(js.Array(CREATE, UPDATE, DELETE))
  }

  /**
    * Returns information about all configurations.
    */
  @js.native
  @Factory
  trait Configuration extends js.Object {
    var Arn: js.UndefOr[__string]
    var Created: js.UndefOr[__timestampIso8601]
    var Description: js.UndefOr[__string]
    var EngineType: js.UndefOr[EngineType]
    var EngineVersion: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var LatestRevision: js.UndefOr[ConfigurationRevision]
    var Name: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
  }

  /**
    * A list of information about the configuration.
    */
  @js.native
  @Factory
  trait ConfigurationId extends js.Object {
    var Id: js.UndefOr[__string]
    var Revision: js.UndefOr[__integer]
  }

  /**
    * Returns information about the specified configuration revision.
    */
  @js.native
  @Factory
  trait ConfigurationRevision extends js.Object {
    var Created: js.UndefOr[__timestampIso8601]
    var Description: js.UndefOr[__string]
    var Revision: js.UndefOr[__integer]
  }

  /**
    * Broker configuration information
    */
  @js.native
  @Factory
  trait Configurations extends js.Object {
    var Current: js.UndefOr[ConfigurationId]
    var History: js.UndefOr[__listOfConfigurationId]
    var Pending: js.UndefOr[ConfigurationId]
  }

  /**
    * Creates a broker using the specified properties.
    */
  @js.native
  @Factory
  trait CreateBrokerRequest extends js.Object {
    var AutoMinorVersionUpgrade: js.UndefOr[__boolean]
    var BrokerName: js.UndefOr[__string]
    var Configuration: js.UndefOr[ConfigurationId]
    var CreatorRequestId: js.UndefOr[__string]
    var DeploymentMode: js.UndefOr[DeploymentMode]
    var EncryptionOptions: js.UndefOr[EncryptionOptions]
    var EngineType: js.UndefOr[EngineType]
    var EngineVersion: js.UndefOr[__string]
    var HostInstanceType: js.UndefOr[__string]
    var Logs: js.UndefOr[Logs]
    var MaintenanceWindowStartTime: js.UndefOr[WeeklyStartTime]
    var PubliclyAccessible: js.UndefOr[__boolean]
    var SecurityGroups: js.UndefOr[__listOf__string]
    var StorageType: js.UndefOr[BrokerStorageType]
    var SubnetIds: js.UndefOr[__listOf__string]
    var Tags: js.UndefOr[__mapOf__string]
    var Users: js.UndefOr[__listOfUser]
  }

  @js.native
  @Factory
  trait CreateBrokerResponse extends js.Object {
    var BrokerArn: js.UndefOr[__string]
    var BrokerId: js.UndefOr[__string]
  }

  /**
    * Creates a new configuration for the specified configuration name. Amazon MQ uses the default configuration (the engine type and version).
    */
  @js.native
  @Factory
  trait CreateConfigurationRequest extends js.Object {
    var EngineType: js.UndefOr[EngineType]
    var EngineVersion: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
  }

  @js.native
  @Factory
  trait CreateConfigurationResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Created: js.UndefOr[__timestampIso8601]
    var Id: js.UndefOr[__string]
    var LatestRevision: js.UndefOr[ConfigurationRevision]
    var Name: js.UndefOr[__string]
  }

  /**
    * A map of the key-value pairs for the resource tag.
    */
  @js.native
  @Factory
  trait CreateTagsRequest extends js.Object {
    var ResourceArn: __string
    var Tags: js.UndefOr[__mapOf__string]
  }

  /**
    * Creates a new ActiveMQ user.
    */
  @js.native
  @Factory
  trait CreateUserRequest extends js.Object {
    var BrokerId: __string
    var Username: __string
    var ConsoleAccess: js.UndefOr[__boolean]
    var Groups: js.UndefOr[__listOf__string]
    var Password: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait CreateUserResponse extends js.Object {}

  @js.native
  sealed trait DayOfWeek extends js.Any
  object DayOfWeek extends js.Object {
    val MONDAY    = "MONDAY".asInstanceOf[DayOfWeek]
    val TUESDAY   = "TUESDAY".asInstanceOf[DayOfWeek]
    val WEDNESDAY = "WEDNESDAY".asInstanceOf[DayOfWeek]
    val THURSDAY  = "THURSDAY".asInstanceOf[DayOfWeek]
    val FRIDAY    = "FRIDAY".asInstanceOf[DayOfWeek]
    val SATURDAY  = "SATURDAY".asInstanceOf[DayOfWeek]
    val SUNDAY    = "SUNDAY".asInstanceOf[DayOfWeek]

    val values = js.Object.freeze(js.Array(MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY))
  }

  @js.native
  @Factory
  trait DeleteBrokerRequest extends js.Object {
    var BrokerId: __string
  }

  @js.native
  @Factory
  trait DeleteBrokerResponse extends js.Object {
    var BrokerId: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait DeleteTagsRequest extends js.Object {
    var ResourceArn: __string
    var TagKeys: __listOf__string
  }

  @js.native
  @Factory
  trait DeleteUserRequest extends js.Object {
    var BrokerId: __string
    var Username: __string
  }

  @js.native
  @Factory
  trait DeleteUserResponse extends js.Object {}

  /**
    * The deployment mode of the broker.
    */
  @js.native
  sealed trait DeploymentMode extends js.Any
  object DeploymentMode extends js.Object {
    val SINGLE_INSTANCE         = "SINGLE_INSTANCE".asInstanceOf[DeploymentMode]
    val ACTIVE_STANDBY_MULTI_AZ = "ACTIVE_STANDBY_MULTI_AZ".asInstanceOf[DeploymentMode]

    val values = js.Object.freeze(js.Array(SINGLE_INSTANCE, ACTIVE_STANDBY_MULTI_AZ))
  }

  @js.native
  @Factory
  trait DescribeBrokerEngineTypesRequest extends js.Object {
    var EngineType: js.UndefOr[__string]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait DescribeBrokerEngineTypesResponse extends js.Object {
    var BrokerEngineTypes: js.UndefOr[__listOfBrokerEngineType]
    var MaxResults: js.UndefOr[__integerMin5Max100]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait DescribeBrokerInstanceOptionsRequest extends js.Object {
    var EngineType: js.UndefOr[__string]
    var HostInstanceType: js.UndefOr[__string]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
    var StorageType: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait DescribeBrokerInstanceOptionsResponse extends js.Object {
    var BrokerInstanceOptions: js.UndefOr[__listOfBrokerInstanceOption]
    var MaxResults: js.UndefOr[__integerMin5Max100]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait DescribeBrokerRequest extends js.Object {
    var BrokerId: __string
  }

  @js.native
  @Factory
  trait DescribeBrokerResponse extends js.Object {
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
    var Logs: js.UndefOr[LogsSummary]
    var MaintenanceWindowStartTime: js.UndefOr[WeeklyStartTime]
    var PendingEngineVersion: js.UndefOr[__string]
    var PendingHostInstanceType: js.UndefOr[__string]
    var PendingSecurityGroups: js.UndefOr[__listOf__string]
    var PubliclyAccessible: js.UndefOr[__boolean]
    var SecurityGroups: js.UndefOr[__listOf__string]
    var StorageType: js.UndefOr[BrokerStorageType]
    var SubnetIds: js.UndefOr[__listOf__string]
    var Tags: js.UndefOr[__mapOf__string]
    var Users: js.UndefOr[__listOfUserSummary]
  }

  @js.native
  @Factory
  trait DescribeConfigurationRequest extends js.Object {
    var ConfigurationId: __string
  }

  @js.native
  @Factory
  trait DescribeConfigurationResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Created: js.UndefOr[__timestampIso8601]
    var Description: js.UndefOr[__string]
    var EngineType: js.UndefOr[EngineType]
    var EngineVersion: js.UndefOr[__string]
    var Id: js.UndefOr[__string]
    var LatestRevision: js.UndefOr[ConfigurationRevision]
    var Name: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
  }

  @js.native
  @Factory
  trait DescribeConfigurationRevisionRequest extends js.Object {
    var ConfigurationId: __string
    var ConfigurationRevision: __string
  }

  @js.native
  @Factory
  trait DescribeConfigurationRevisionResponse extends js.Object {
    var ConfigurationId: js.UndefOr[__string]
    var Created: js.UndefOr[__timestampIso8601]
    var Data: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait DescribeUserRequest extends js.Object {
    var BrokerId: __string
    var Username: __string
  }

  @js.native
  @Factory
  trait DescribeUserResponse extends js.Object {
    var BrokerId: js.UndefOr[__string]
    var ConsoleAccess: js.UndefOr[__boolean]
    var Groups: js.UndefOr[__listOf__string]
    var Pending: js.UndefOr[UserPendingChanges]
    var Username: js.UndefOr[__string]
  }

  /**
    * Encryption options for the broker.
    */
  @js.native
  @Factory
  trait EncryptionOptions extends js.Object {
    var UseAwsOwnedKey: __boolean
    var KmsKeyId: js.UndefOr[__string]
  }

  /**
    * The type of broker engine. Note: Currently, Amazon MQ supports only ActiveMQ.
    */
  @js.native
  sealed trait EngineType extends js.Any
  object EngineType extends js.Object {
    val ACTIVEMQ = "ACTIVEMQ".asInstanceOf[EngineType]

    val values = js.Object.freeze(js.Array(ACTIVEMQ))
  }

  /**
    * Id of the engine version.
    */
  @js.native
  @Factory
  trait EngineVersion extends js.Object {
    var Name: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListBrokersRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListBrokersResponse extends js.Object {
    var BrokerSummaries: js.UndefOr[__listOfBrokerSummary]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListConfigurationRevisionsRequest extends js.Object {
    var ConfigurationId: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListConfigurationRevisionsResponse extends js.Object {
    var ConfigurationId: js.UndefOr[__string]
    var MaxResults: js.UndefOr[__integer]
    var NextToken: js.UndefOr[__string]
    var Revisions: js.UndefOr[__listOfConfigurationRevision]
  }

  @js.native
  @Factory
  trait ListConfigurationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListConfigurationsResponse extends js.Object {
    var Configurations: js.UndefOr[__listOfConfiguration]
    var MaxResults: js.UndefOr[__integer]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListTagsRequest extends js.Object {
    var ResourceArn: __string
  }

  @js.native
  @Factory
  trait ListTagsResponse extends js.Object {
    var Tags: js.UndefOr[__mapOf__string]
  }

  @js.native
  @Factory
  trait ListUsersRequest extends js.Object {
    var BrokerId: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListUsersResponse extends js.Object {
    var BrokerId: js.UndefOr[__string]
    var MaxResults: js.UndefOr[__integerMin5Max100]
    var NextToken: js.UndefOr[__string]
    var Users: js.UndefOr[__listOfUserSummary]
  }

  /**
    * The list of information about logs to be enabled for the specified broker.
    */
  @js.native
  @Factory
  trait Logs extends js.Object {
    var Audit: js.UndefOr[__boolean]
    var General: js.UndefOr[__boolean]
  }

  /**
    * The list of information about logs currently enabled and pending to be deployed for the specified broker.
    */
  @js.native
  @Factory
  trait LogsSummary extends js.Object {
    var Audit: js.UndefOr[__boolean]
    var AuditLogGroup: js.UndefOr[__string]
    var General: js.UndefOr[__boolean]
    var GeneralLogGroup: js.UndefOr[__string]
    var Pending: js.UndefOr[PendingLogs]
  }

  /**
    * The list of information about logs to be enabled for the specified broker.
    */
  @js.native
  @Factory
  trait PendingLogs extends js.Object {
    var Audit: js.UndefOr[__boolean]
    var General: js.UndefOr[__boolean]
  }

  @js.native
  @Factory
  trait RebootBrokerRequest extends js.Object {
    var BrokerId: __string
  }

  @js.native
  @Factory
  trait RebootBrokerResponse extends js.Object {}

  /**
    * Returns information about the XML element or attribute that was sanitized in the configuration.
    */
  @js.native
  @Factory
  trait SanitizationWarning extends js.Object {
    var AttributeName: js.UndefOr[__string]
    var ElementName: js.UndefOr[__string]
    var Reason: js.UndefOr[SanitizationWarningReason]
  }

  /**
    * The reason for which the XML elements or attributes were sanitized.
    */
  @js.native
  sealed trait SanitizationWarningReason extends js.Any
  object SanitizationWarningReason extends js.Object {
    val DISALLOWED_ELEMENT_REMOVED      = "DISALLOWED_ELEMENT_REMOVED".asInstanceOf[SanitizationWarningReason]
    val DISALLOWED_ATTRIBUTE_REMOVED    = "DISALLOWED_ATTRIBUTE_REMOVED".asInstanceOf[SanitizationWarningReason]
    val INVALID_ATTRIBUTE_VALUE_REMOVED = "INVALID_ATTRIBUTE_VALUE_REMOVED".asInstanceOf[SanitizationWarningReason]

    val values = js.Object.freeze(
      js.Array(DISALLOWED_ELEMENT_REMOVED, DISALLOWED_ATTRIBUTE_REMOVED, INVALID_ATTRIBUTE_VALUE_REMOVED)
    )
  }

  /**
    * Updates the broker using the specified properties.
    */
  @js.native
  @Factory
  trait UpdateBrokerRequest extends js.Object {
    var BrokerId: __string
    var AutoMinorVersionUpgrade: js.UndefOr[__boolean]
    var Configuration: js.UndefOr[ConfigurationId]
    var EngineVersion: js.UndefOr[__string]
    var HostInstanceType: js.UndefOr[__string]
    var Logs: js.UndefOr[Logs]
    var SecurityGroups: js.UndefOr[__listOf__string]
  }

  @js.native
  @Factory
  trait UpdateBrokerResponse extends js.Object {
    var AutoMinorVersionUpgrade: js.UndefOr[__boolean]
    var BrokerId: js.UndefOr[__string]
    var Configuration: js.UndefOr[ConfigurationId]
    var EngineVersion: js.UndefOr[__string]
    var HostInstanceType: js.UndefOr[__string]
    var Logs: js.UndefOr[Logs]
    var SecurityGroups: js.UndefOr[__listOf__string]
  }

  /**
    * Updates the specified configuration.
    */
  @js.native
  @Factory
  trait UpdateConfigurationRequest extends js.Object {
    var ConfigurationId: __string
    var Data: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait UpdateConfigurationResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Created: js.UndefOr[__timestampIso8601]
    var Id: js.UndefOr[__string]
    var LatestRevision: js.UndefOr[ConfigurationRevision]
    var Name: js.UndefOr[__string]
    var Warnings: js.UndefOr[__listOfSanitizationWarning]
  }

  /**
    * Updates the information for an ActiveMQ user.
    */
  @js.native
  @Factory
  trait UpdateUserRequest extends js.Object {
    var BrokerId: __string
    var Username: __string
    var ConsoleAccess: js.UndefOr[__boolean]
    var Groups: js.UndefOr[__listOf__string]
    var Password: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait UpdateUserResponse extends js.Object {}

  /**
    * An ActiveMQ user associated with the broker.
    */
  @js.native
  @Factory
  trait User extends js.Object {
    var ConsoleAccess: js.UndefOr[__boolean]
    var Groups: js.UndefOr[__listOf__string]
    var Password: js.UndefOr[__string]
    var Username: js.UndefOr[__string]
  }

  /**
    * Returns information about the status of the changes pending for the ActiveMQ user.
    */
  @js.native
  @Factory
  trait UserPendingChanges extends js.Object {
    var ConsoleAccess: js.UndefOr[__boolean]
    var Groups: js.UndefOr[__listOf__string]
    var PendingChange: js.UndefOr[ChangeType]
  }

  /**
    * Returns a list of all ActiveMQ users.
    */
  @js.native
  @Factory
  trait UserSummary extends js.Object {
    var PendingChange: js.UndefOr[ChangeType]
    var Username: js.UndefOr[__string]
  }

  /**
    * The scheduled time period relative to UTC during which Amazon MQ begins to apply pending updates or patches to the broker.
    */
  @js.native
  @Factory
  trait WeeklyStartTime extends js.Object {
    var DayOfWeek: js.UndefOr[DayOfWeek]
    var TimeOfDay: js.UndefOr[__string]
    var TimeZone: js.UndefOr[__string]
  }
}
