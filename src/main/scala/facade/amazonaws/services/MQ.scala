package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object mq {
  type BrokerState                   = String
  type ChangeType                    = String
  type DayOfWeek                     = String
  type DeploymentMode                = String
  type EngineType                    = String
  type MaxResults                    = Int
  type SanitizationWarningReason     = String
  type __boolean                     = Boolean
  type __integer                     = Int
  type __integerMin5Max100           = Int
  type __listOfBrokerInstance        = js.Array[BrokerInstance]
  type __listOfBrokerSummary         = js.Array[BrokerSummary]
  type __listOfConfiguration         = js.Array[Configuration]
  type __listOfConfigurationId       = js.Array[ConfigurationId]
  type __listOfConfigurationRevision = js.Array[ConfigurationRevision]
  type __listOfSanitizationWarning   = js.Array[SanitizationWarning]
  type __listOfUser                  = js.Array[User]
  type __listOfUserSummary           = js.Array[UserSummary]
  type __listOf__string              = js.Array[__string]
  type __mapOf__string               = js.Dictionary[__string]
  type __string                      = String
  type __timestampIso8601            = js.Date
}

package mq {
  @js.native
  @JSImport("aws-sdk", "MQ")
  class MQ() extends js.Object {
    def this(config: AWSConfig) = this()

    def createBroker(params: CreateBrokerRequest): Request[CreateBrokerResponse]                            = js.native
    def createConfiguration(params: CreateConfigurationRequest): Request[CreateConfigurationResponse]       = js.native
    def createTags(params: CreateTagsRequest): Request[js.Object]                                           = js.native
    def createUser(params: CreateUserRequest): Request[CreateUserResponse]                                  = js.native
    def deleteBroker(params: DeleteBrokerRequest): Request[DeleteBrokerResponse]                            = js.native
    def deleteTags(params: DeleteTagsRequest): Request[js.Object]                                           = js.native
    def deleteUser(params: DeleteUserRequest): Request[DeleteUserResponse]                                  = js.native
    def describeBroker(params: DescribeBrokerRequest): Request[DescribeBrokerResponse]                      = js.native
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
    * Returns information about all brokers.
    */
  @js.native
  trait BrokerInstance extends js.Object {
    var ConsoleURL: js.UndefOr[__string]
    var Endpoints: js.UndefOr[__listOf__string]
    var IpAddress: js.UndefOr[__string]
  }

  object BrokerInstance {
    def apply(
        ConsoleURL: js.UndefOr[__string] = js.undefined,
        Endpoints: js.UndefOr[__listOf__string] = js.undefined,
        IpAddress: js.UndefOr[__string] = js.undefined
    ): BrokerInstance = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConsoleURL" -> ConsoleURL.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Endpoints" -> Endpoints.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IpAddress" -> IpAddress.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BrokerInstance]
    }
  }

  /**
    * The status of the broker.
    */
  object BrokerStateEnum {
    val CREATION_IN_PROGRESS = "CREATION_IN_PROGRESS"
    val CREATION_FAILED      = "CREATION_FAILED"
    val DELETION_IN_PROGRESS = "DELETION_IN_PROGRESS"
    val RUNNING              = "RUNNING"
    val REBOOT_IN_PROGRESS   = "REBOOT_IN_PROGRESS"

    val values = IndexedSeq(CREATION_IN_PROGRESS, CREATION_FAILED, DELETION_IN_PROGRESS, RUNNING, REBOOT_IN_PROGRESS)
  }

  /**
    * The Amazon Resource Name (ARN) of the broker.
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
    def apply(
        BrokerArn: js.UndefOr[__string] = js.undefined,
        BrokerId: js.UndefOr[__string] = js.undefined,
        BrokerName: js.UndefOr[__string] = js.undefined,
        BrokerState: js.UndefOr[BrokerState] = js.undefined,
        Created: js.UndefOr[__timestampIso8601] = js.undefined,
        DeploymentMode: js.UndefOr[DeploymentMode] = js.undefined,
        HostInstanceType: js.UndefOr[__string] = js.undefined
    ): BrokerSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BrokerArn" -> BrokerArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BrokerId" -> BrokerId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BrokerName" -> BrokerName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BrokerState" -> BrokerState.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Created" -> Created.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeploymentMode" -> DeploymentMode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HostInstanceType" -> HostInstanceType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BrokerSummary]
    }
  }

  /**
    * The type of change pending for the ActiveMQ user.
    */
  object ChangeTypeEnum {
    val CREATE = "CREATE"
    val UPDATE = "UPDATE"
    val DELETE = "DELETE"

    val values = IndexedSeq(CREATE, UPDATE, DELETE)
  }

  /**
    * Returns information about all configurations.
    */
  @js.native
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

  object Configuration {
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Created: js.UndefOr[__timestampIso8601] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        EngineType: js.UndefOr[EngineType] = js.undefined,
        EngineVersion: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        LatestRevision: js.UndefOr[ConfigurationRevision] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): Configuration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Created" -> Created.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineType" -> EngineType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineVersion" -> EngineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestRevision" -> LatestRevision.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Configuration]
    }
  }

  /**
    * A list of information about the configuration.
    */
  @js.native
  trait ConfigurationId extends js.Object {
    var Id: js.UndefOr[__string]
    var Revision: js.UndefOr[__integer]
  }

  object ConfigurationId {
    def apply(
        Id: js.UndefOr[__string] = js.undefined,
        Revision: js.UndefOr[__integer] = js.undefined
    ): ConfigurationId = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Revision" -> Revision.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigurationId]
    }
  }

  /**
    * Returns information about the specified configuration revision.
    */
  @js.native
  trait ConfigurationRevision extends js.Object {
    var Created: js.UndefOr[__timestampIso8601]
    var Description: js.UndefOr[__string]
    var Revision: js.UndefOr[__integer]
  }

  object ConfigurationRevision {
    def apply(
        Created: js.UndefOr[__timestampIso8601] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        Revision: js.UndefOr[__integer] = js.undefined
    ): ConfigurationRevision = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Created" -> Created.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Revision" -> Revision.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigurationRevision]
    }
  }

  /**
    * Broker configuration information
    */
  @js.native
  trait Configurations extends js.Object {
    var Current: js.UndefOr[ConfigurationId]
    var History: js.UndefOr[__listOfConfigurationId]
    var Pending: js.UndefOr[ConfigurationId]
  }

  object Configurations {
    def apply(
        Current: js.UndefOr[ConfigurationId] = js.undefined,
        History: js.UndefOr[__listOfConfigurationId] = js.undefined,
        Pending: js.UndefOr[ConfigurationId] = js.undefined
    ): Configurations = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Current" -> Current.map { x =>
          x.asInstanceOf[js.Any]
        },
        "History" -> History.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Pending" -> Pending.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Configurations]
    }
  }

  /**
    * Creates a broker using the specified properties.
    */
  @js.native
  trait CreateBrokerRequest extends js.Object {
    var AutoMinorVersionUpgrade: js.UndefOr[__boolean]
    var BrokerName: js.UndefOr[__string]
    var Configuration: js.UndefOr[ConfigurationId]
    var CreatorRequestId: js.UndefOr[__string]
    var DeploymentMode: js.UndefOr[DeploymentMode]
    var EngineType: js.UndefOr[EngineType]
    var EngineVersion: js.UndefOr[__string]
    var HostInstanceType: js.UndefOr[__string]
    var Logs: js.UndefOr[Logs]
    var MaintenanceWindowStartTime: js.UndefOr[WeeklyStartTime]
    var PubliclyAccessible: js.UndefOr[__boolean]
    var SecurityGroups: js.UndefOr[__listOf__string]
    var SubnetIds: js.UndefOr[__listOf__string]
    var Tags: js.UndefOr[__mapOf__string]
    var Users: js.UndefOr[__listOfUser]
  }

  object CreateBrokerRequest {
    def apply(
        AutoMinorVersionUpgrade: js.UndefOr[__boolean] = js.undefined,
        BrokerName: js.UndefOr[__string] = js.undefined,
        Configuration: js.UndefOr[ConfigurationId] = js.undefined,
        CreatorRequestId: js.UndefOr[__string] = js.undefined,
        DeploymentMode: js.UndefOr[DeploymentMode] = js.undefined,
        EngineType: js.UndefOr[EngineType] = js.undefined,
        EngineVersion: js.UndefOr[__string] = js.undefined,
        HostInstanceType: js.UndefOr[__string] = js.undefined,
        Logs: js.UndefOr[Logs] = js.undefined,
        MaintenanceWindowStartTime: js.UndefOr[WeeklyStartTime] = js.undefined,
        PubliclyAccessible: js.UndefOr[__boolean] = js.undefined,
        SecurityGroups: js.UndefOr[__listOf__string] = js.undefined,
        SubnetIds: js.UndefOr[__listOf__string] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined,
        Users: js.UndefOr[__listOfUser] = js.undefined
    ): CreateBrokerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BrokerName" -> BrokerName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Configuration" -> Configuration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreatorRequestId" -> CreatorRequestId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeploymentMode" -> DeploymentMode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineType" -> EngineType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineVersion" -> EngineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HostInstanceType" -> HostInstanceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Logs" -> Logs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaintenanceWindowStartTime" -> MaintenanceWindowStartTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PubliclyAccessible" -> PubliclyAccessible.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecurityGroups" -> SecurityGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SubnetIds" -> SubnetIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Users" -> Users.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBrokerRequest]
    }
  }

  @js.native
  trait CreateBrokerResponse extends js.Object {
    var BrokerArn: js.UndefOr[__string]
    var BrokerId: js.UndefOr[__string]
  }

  object CreateBrokerResponse {
    def apply(
        BrokerArn: js.UndefOr[__string] = js.undefined,
        BrokerId: js.UndefOr[__string] = js.undefined
    ): CreateBrokerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BrokerArn" -> BrokerArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BrokerId" -> BrokerId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBrokerResponse]
    }
  }

  /**
    * Creates a new configuration for the specified configuration name. Amazon MQ uses the default configuration (the engine type and version).
    */
  @js.native
  trait CreateConfigurationRequest extends js.Object {
    var EngineType: js.UndefOr[EngineType]
    var EngineVersion: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
  }

  object CreateConfigurationRequest {
    def apply(
        EngineType: js.UndefOr[EngineType] = js.undefined,
        EngineVersion: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): CreateConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EngineType" -> EngineType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineVersion" -> EngineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateConfigurationRequest]
    }
  }

  @js.native
  trait CreateConfigurationResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Created: js.UndefOr[__timestampIso8601]
    var Id: js.UndefOr[__string]
    var LatestRevision: js.UndefOr[ConfigurationRevision]
    var Name: js.UndefOr[__string]
  }

  object CreateConfigurationResponse {
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Created: js.UndefOr[__timestampIso8601] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        LatestRevision: js.UndefOr[ConfigurationRevision] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined
    ): CreateConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Created" -> Created.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestRevision" -> LatestRevision.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateConfigurationResponse]
    }
  }

  /**
    * A map of the key-value pairs for the resource tag.
    */
  @js.native
  trait CreateTagsRequest extends js.Object {
    var ResourceArn: __string
    var Tags: js.UndefOr[__mapOf__string]
  }

  object CreateTagsRequest {
    def apply(
        ResourceArn: __string,
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): CreateTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTagsRequest]
    }
  }

  /**
    * Creates a new ActiveMQ user.
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
    def apply(
        BrokerId: __string,
        Username: __string,
        ConsoleAccess: js.UndefOr[__boolean] = js.undefined,
        Groups: js.UndefOr[__listOf__string] = js.undefined,
        Password: js.UndefOr[__string] = js.undefined
    ): CreateUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BrokerId" -> BrokerId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any],
        "ConsoleAccess" -> ConsoleAccess.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Groups" -> Groups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Password" -> Password.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserRequest]
    }
  }

  @js.native
  trait CreateUserResponse extends js.Object {}

  object CreateUserResponse {
    def apply(
        ): CreateUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateUserResponse]
    }
  }

  object DayOfWeekEnum {
    val MONDAY    = "MONDAY"
    val TUESDAY   = "TUESDAY"
    val WEDNESDAY = "WEDNESDAY"
    val THURSDAY  = "THURSDAY"
    val FRIDAY    = "FRIDAY"
    val SATURDAY  = "SATURDAY"
    val SUNDAY    = "SUNDAY"

    val values = IndexedSeq(MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY)
  }

  @js.native
  trait DeleteBrokerRequest extends js.Object {
    var BrokerId: __string
  }

  object DeleteBrokerRequest {
    def apply(
        BrokerId: __string
    ): DeleteBrokerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BrokerId" -> BrokerId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBrokerRequest]
    }
  }

  @js.native
  trait DeleteBrokerResponse extends js.Object {
    var BrokerId: js.UndefOr[__string]
  }

  object DeleteBrokerResponse {
    def apply(
        BrokerId: js.UndefOr[__string] = js.undefined
    ): DeleteBrokerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BrokerId" -> BrokerId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBrokerResponse]
    }
  }

  @js.native
  trait DeleteTagsRequest extends js.Object {
    var ResourceArn: __string
    var TagKeys: __listOf__string
  }

  object DeleteTagsRequest {
    def apply(
        ResourceArn: __string,
        TagKeys: __listOf__string
    ): DeleteTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTagsRequest]
    }
  }

  @js.native
  trait DeleteUserRequest extends js.Object {
    var BrokerId: __string
    var Username: __string
  }

  object DeleteUserRequest {
    def apply(
        BrokerId: __string,
        Username: __string
    ): DeleteUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BrokerId" -> BrokerId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserRequest]
    }
  }

  @js.native
  trait DeleteUserResponse extends js.Object {}

  object DeleteUserResponse {
    def apply(
        ): DeleteUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteUserResponse]
    }
  }

  /**
    * The deployment mode of the broker.
    */
  object DeploymentModeEnum {
    val SINGLE_INSTANCE         = "SINGLE_INSTANCE"
    val ACTIVE_STANDBY_MULTI_AZ = "ACTIVE_STANDBY_MULTI_AZ"

    val values = IndexedSeq(SINGLE_INSTANCE, ACTIVE_STANDBY_MULTI_AZ)
  }

  @js.native
  trait DescribeBrokerRequest extends js.Object {
    var BrokerId: __string
  }

  object DescribeBrokerRequest {
    def apply(
        BrokerId: __string
    ): DescribeBrokerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BrokerId" -> BrokerId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBrokerRequest]
    }
  }

  @js.native
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
    var EngineType: js.UndefOr[EngineType]
    var EngineVersion: js.UndefOr[__string]
    var HostInstanceType: js.UndefOr[__string]
    var Logs: js.UndefOr[LogsSummary]
    var MaintenanceWindowStartTime: js.UndefOr[WeeklyStartTime]
    var PendingEngineVersion: js.UndefOr[__string]
    var PubliclyAccessible: js.UndefOr[__boolean]
    var SecurityGroups: js.UndefOr[__listOf__string]
    var SubnetIds: js.UndefOr[__listOf__string]
    var Tags: js.UndefOr[__mapOf__string]
    var Users: js.UndefOr[__listOfUserSummary]
  }

  object DescribeBrokerResponse {
    def apply(
        AutoMinorVersionUpgrade: js.UndefOr[__boolean] = js.undefined,
        BrokerArn: js.UndefOr[__string] = js.undefined,
        BrokerId: js.UndefOr[__string] = js.undefined,
        BrokerInstances: js.UndefOr[__listOfBrokerInstance] = js.undefined,
        BrokerName: js.UndefOr[__string] = js.undefined,
        BrokerState: js.UndefOr[BrokerState] = js.undefined,
        Configurations: js.UndefOr[Configurations] = js.undefined,
        Created: js.UndefOr[__timestampIso8601] = js.undefined,
        DeploymentMode: js.UndefOr[DeploymentMode] = js.undefined,
        EngineType: js.UndefOr[EngineType] = js.undefined,
        EngineVersion: js.UndefOr[__string] = js.undefined,
        HostInstanceType: js.UndefOr[__string] = js.undefined,
        Logs: js.UndefOr[LogsSummary] = js.undefined,
        MaintenanceWindowStartTime: js.UndefOr[WeeklyStartTime] = js.undefined,
        PendingEngineVersion: js.UndefOr[__string] = js.undefined,
        PubliclyAccessible: js.UndefOr[__boolean] = js.undefined,
        SecurityGroups: js.UndefOr[__listOf__string] = js.undefined,
        SubnetIds: js.UndefOr[__listOf__string] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined,
        Users: js.UndefOr[__listOfUserSummary] = js.undefined
    ): DescribeBrokerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BrokerArn" -> BrokerArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BrokerId" -> BrokerId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BrokerInstances" -> BrokerInstances.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BrokerName" -> BrokerName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BrokerState" -> BrokerState.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Configurations" -> Configurations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Created" -> Created.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeploymentMode" -> DeploymentMode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineType" -> EngineType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineVersion" -> EngineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HostInstanceType" -> HostInstanceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Logs" -> Logs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaintenanceWindowStartTime" -> MaintenanceWindowStartTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PendingEngineVersion" -> PendingEngineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PubliclyAccessible" -> PubliclyAccessible.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecurityGroups" -> SecurityGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SubnetIds" -> SubnetIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Users" -> Users.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBrokerResponse]
    }
  }

  @js.native
  trait DescribeConfigurationRequest extends js.Object {
    var ConfigurationId: __string
  }

  object DescribeConfigurationRequest {
    def apply(
        ConfigurationId: __string
    ): DescribeConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationId" -> ConfigurationId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigurationRequest]
    }
  }

  @js.native
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

  object DescribeConfigurationResponse {
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Created: js.UndefOr[__timestampIso8601] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined,
        EngineType: js.UndefOr[EngineType] = js.undefined,
        EngineVersion: js.UndefOr[__string] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        LatestRevision: js.UndefOr[ConfigurationRevision] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): DescribeConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Created" -> Created.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineType" -> EngineType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineVersion" -> EngineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestRevision" -> LatestRevision.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigurationResponse]
    }
  }

  @js.native
  trait DescribeConfigurationRevisionRequest extends js.Object {
    var ConfigurationId: __string
    var ConfigurationRevision: __string
  }

  object DescribeConfigurationRevisionRequest {
    def apply(
        ConfigurationId: __string,
        ConfigurationRevision: __string
    ): DescribeConfigurationRevisionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationId"       -> ConfigurationId.asInstanceOf[js.Any],
        "ConfigurationRevision" -> ConfigurationRevision.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigurationRevisionRequest]
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
    def apply(
        ConfigurationId: js.UndefOr[__string] = js.undefined,
        Created: js.UndefOr[__timestampIso8601] = js.undefined,
        Data: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined
    ): DescribeConfigurationRevisionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationId" -> ConfigurationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Created" -> Created.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Data" -> Data.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigurationRevisionResponse]
    }
  }

  @js.native
  trait DescribeUserRequest extends js.Object {
    var BrokerId: __string
    var Username: __string
  }

  object DescribeUserRequest {
    def apply(
        BrokerId: __string,
        Username: __string
    ): DescribeUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BrokerId" -> BrokerId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserRequest]
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
    def apply(
        BrokerId: js.UndefOr[__string] = js.undefined,
        ConsoleAccess: js.UndefOr[__boolean] = js.undefined,
        Groups: js.UndefOr[__listOf__string] = js.undefined,
        Pending: js.UndefOr[UserPendingChanges] = js.undefined,
        Username: js.UndefOr[__string] = js.undefined
    ): DescribeUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BrokerId" -> BrokerId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConsoleAccess" -> ConsoleAccess.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Groups" -> Groups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Pending" -> Pending.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Username" -> Username.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeUserResponse]
    }
  }

  /**
    * The type of broker engine. Note: Currently, Amazon MQ supports only ActiveMQ.
    */
  object EngineTypeEnum {
    val ACTIVEMQ = "ACTIVEMQ"

    val values = IndexedSeq(ACTIVEMQ)
  }

  @js.native
  trait ListBrokersRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListBrokersRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListBrokersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBrokersRequest]
    }
  }

  @js.native
  trait ListBrokersResponse extends js.Object {
    var BrokerSummaries: js.UndefOr[__listOfBrokerSummary]
    var NextToken: js.UndefOr[__string]
  }

  object ListBrokersResponse {
    def apply(
        BrokerSummaries: js.UndefOr[__listOfBrokerSummary] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListBrokersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BrokerSummaries" -> BrokerSummaries.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBrokersResponse]
    }
  }

  @js.native
  trait ListConfigurationRevisionsRequest extends js.Object {
    var ConfigurationId: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListConfigurationRevisionsRequest {
    def apply(
        ConfigurationId: __string,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListConfigurationRevisionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationId" -> ConfigurationId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListConfigurationRevisionsRequest]
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
    def apply(
        ConfigurationId: js.UndefOr[__string] = js.undefined,
        MaxResults: js.UndefOr[__integer] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        Revisions: js.UndefOr[__listOfConfigurationRevision] = js.undefined
    ): ListConfigurationRevisionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationId" -> ConfigurationId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Revisions" -> Revisions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListConfigurationRevisionsResponse]
    }
  }

  @js.native
  trait ListConfigurationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListConfigurationsRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListConfigurationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListConfigurationsRequest]
    }
  }

  @js.native
  trait ListConfigurationsResponse extends js.Object {
    var Configurations: js.UndefOr[__listOfConfiguration]
    var MaxResults: js.UndefOr[__integer]
    var NextToken: js.UndefOr[__string]
  }

  object ListConfigurationsResponse {
    def apply(
        Configurations: js.UndefOr[__listOfConfiguration] = js.undefined,
        MaxResults: js.UndefOr[__integer] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListConfigurationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Configurations" -> Configurations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListConfigurationsResponse]
    }
  }

  @js.native
  trait ListTagsRequest extends js.Object {
    var ResourceArn: __string
  }

  object ListTagsRequest {
    def apply(
        ResourceArn: __string
    ): ListTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsRequest]
    }
  }

  @js.native
  trait ListTagsResponse extends js.Object {
    var Tags: js.UndefOr[__mapOf__string]
  }

  object ListTagsResponse {
    def apply(
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): ListTagsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Tags" -> Tags.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsResponse]
    }
  }

  @js.native
  trait ListUsersRequest extends js.Object {
    var BrokerId: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListUsersRequest {
    def apply(
        BrokerId: __string,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListUsersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BrokerId" -> BrokerId.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUsersRequest]
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
    def apply(
        BrokerId: js.UndefOr[__string] = js.undefined,
        MaxResults: js.UndefOr[__integerMin5Max100] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        Users: js.UndefOr[__listOfUserSummary] = js.undefined
    ): ListUsersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BrokerId" -> BrokerId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Users" -> Users.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListUsersResponse]
    }
  }

  /**
    * The list of information about logs to be enabled for the specified broker.
    */
  @js.native
  trait Logs extends js.Object {
    var Audit: js.UndefOr[__boolean]
    var General: js.UndefOr[__boolean]
  }

  object Logs {
    def apply(
        Audit: js.UndefOr[__boolean] = js.undefined,
        General: js.UndefOr[__boolean] = js.undefined
    ): Logs = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Audit" -> Audit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "General" -> General.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Logs]
    }
  }

  /**
    * The list of information about logs currently enabled and pending to be deployed for the specified broker.
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
    def apply(
        Audit: js.UndefOr[__boolean] = js.undefined,
        AuditLogGroup: js.UndefOr[__string] = js.undefined,
        General: js.UndefOr[__boolean] = js.undefined,
        GeneralLogGroup: js.UndefOr[__string] = js.undefined,
        Pending: js.UndefOr[PendingLogs] = js.undefined
    ): LogsSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Audit" -> Audit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AuditLogGroup" -> AuditLogGroup.map { x =>
          x.asInstanceOf[js.Any]
        },
        "General" -> General.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GeneralLogGroup" -> GeneralLogGroup.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Pending" -> Pending.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LogsSummary]
    }
  }

  /**
    * The list of information about logs to be enabled for the specified broker.
    */
  @js.native
  trait PendingLogs extends js.Object {
    var Audit: js.UndefOr[__boolean]
    var General: js.UndefOr[__boolean]
  }

  object PendingLogs {
    def apply(
        Audit: js.UndefOr[__boolean] = js.undefined,
        General: js.UndefOr[__boolean] = js.undefined
    ): PendingLogs = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Audit" -> Audit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "General" -> General.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PendingLogs]
    }
  }

  @js.native
  trait RebootBrokerRequest extends js.Object {
    var BrokerId: __string
  }

  object RebootBrokerRequest {
    def apply(
        BrokerId: __string
    ): RebootBrokerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BrokerId" -> BrokerId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootBrokerRequest]
    }
  }

  @js.native
  trait RebootBrokerResponse extends js.Object {}

  object RebootBrokerResponse {
    def apply(
        ): RebootBrokerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RebootBrokerResponse]
    }
  }

  /**
    * Returns information about the XML element or attribute that was sanitized in the configuration.
    */
  @js.native
  trait SanitizationWarning extends js.Object {
    var AttributeName: js.UndefOr[__string]
    var ElementName: js.UndefOr[__string]
    var Reason: js.UndefOr[SanitizationWarningReason]
  }

  object SanitizationWarning {
    def apply(
        AttributeName: js.UndefOr[__string] = js.undefined,
        ElementName: js.UndefOr[__string] = js.undefined,
        Reason: js.UndefOr[SanitizationWarningReason] = js.undefined
    ): SanitizationWarning = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeName" -> AttributeName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ElementName" -> ElementName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Reason" -> Reason.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SanitizationWarning]
    }
  }

  /**
    * The reason for which the XML elements or attributes were sanitized.
    */
  object SanitizationWarningReasonEnum {
    val DISALLOWED_ELEMENT_REMOVED      = "DISALLOWED_ELEMENT_REMOVED"
    val DISALLOWED_ATTRIBUTE_REMOVED    = "DISALLOWED_ATTRIBUTE_REMOVED"
    val INVALID_ATTRIBUTE_VALUE_REMOVED = "INVALID_ATTRIBUTE_VALUE_REMOVED"

    val values = IndexedSeq(DISALLOWED_ELEMENT_REMOVED, DISALLOWED_ATTRIBUTE_REMOVED, INVALID_ATTRIBUTE_VALUE_REMOVED)
  }

  /**
    * Updates the broker using the specified properties.
    */
  @js.native
  trait UpdateBrokerRequest extends js.Object {
    var BrokerId: __string
    var AutoMinorVersionUpgrade: js.UndefOr[__boolean]
    var Configuration: js.UndefOr[ConfigurationId]
    var EngineVersion: js.UndefOr[__string]
    var Logs: js.UndefOr[Logs]
  }

  object UpdateBrokerRequest {
    def apply(
        BrokerId: __string,
        AutoMinorVersionUpgrade: js.UndefOr[__boolean] = js.undefined,
        Configuration: js.UndefOr[ConfigurationId] = js.undefined,
        EngineVersion: js.UndefOr[__string] = js.undefined,
        Logs: js.UndefOr[Logs] = js.undefined
    ): UpdateBrokerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BrokerId" -> BrokerId.asInstanceOf[js.Any],
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Configuration" -> Configuration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineVersion" -> EngineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Logs" -> Logs.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateBrokerRequest]
    }
  }

  @js.native
  trait UpdateBrokerResponse extends js.Object {
    var AutoMinorVersionUpgrade: js.UndefOr[__boolean]
    var BrokerId: js.UndefOr[__string]
    var Configuration: js.UndefOr[ConfigurationId]
    var EngineVersion: js.UndefOr[__string]
    var Logs: js.UndefOr[Logs]
  }

  object UpdateBrokerResponse {
    def apply(
        AutoMinorVersionUpgrade: js.UndefOr[__boolean] = js.undefined,
        BrokerId: js.UndefOr[__string] = js.undefined,
        Configuration: js.UndefOr[ConfigurationId] = js.undefined,
        EngineVersion: js.UndefOr[__string] = js.undefined,
        Logs: js.UndefOr[Logs] = js.undefined
    ): UpdateBrokerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AutoMinorVersionUpgrade" -> AutoMinorVersionUpgrade.map { x =>
          x.asInstanceOf[js.Any]
        },
        "BrokerId" -> BrokerId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Configuration" -> Configuration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EngineVersion" -> EngineVersion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Logs" -> Logs.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateBrokerResponse]
    }
  }

  /**
    * Updates the specified configuration.
    */
  @js.native
  trait UpdateConfigurationRequest extends js.Object {
    var ConfigurationId: __string
    var Data: js.UndefOr[__string]
    var Description: js.UndefOr[__string]
  }

  object UpdateConfigurationRequest {
    def apply(
        ConfigurationId: __string,
        Data: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[__string] = js.undefined
    ): UpdateConfigurationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationId" -> ConfigurationId.asInstanceOf[js.Any],
        "Data" -> Data.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateConfigurationRequest]
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
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Created: js.UndefOr[__timestampIso8601] = js.undefined,
        Id: js.UndefOr[__string] = js.undefined,
        LatestRevision: js.UndefOr[ConfigurationRevision] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        Warnings: js.UndefOr[__listOfSanitizationWarning] = js.undefined
    ): UpdateConfigurationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Arn" -> Arn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Created" -> Created.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Id" -> Id.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestRevision" -> LatestRevision.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Warnings" -> Warnings.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateConfigurationResponse]
    }
  }

  /**
    * Updates the information for an ActiveMQ user.
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
    def apply(
        BrokerId: __string,
        Username: __string,
        ConsoleAccess: js.UndefOr[__boolean] = js.undefined,
        Groups: js.UndefOr[__listOf__string] = js.undefined,
        Password: js.UndefOr[__string] = js.undefined
    ): UpdateUserRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BrokerId" -> BrokerId.asInstanceOf[js.Any],
        "Username" -> Username.asInstanceOf[js.Any],
        "ConsoleAccess" -> ConsoleAccess.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Groups" -> Groups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Password" -> Password.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserRequest]
    }
  }

  @js.native
  trait UpdateUserResponse extends js.Object {}

  object UpdateUserResponse {
    def apply(
        ): UpdateUserResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateUserResponse]
    }
  }

  /**
    * An ActiveMQ user associated with the broker.
    */
  @js.native
  trait User extends js.Object {
    var ConsoleAccess: js.UndefOr[__boolean]
    var Groups: js.UndefOr[__listOf__string]
    var Password: js.UndefOr[__string]
    var Username: js.UndefOr[__string]
  }

  object User {
    def apply(
        ConsoleAccess: js.UndefOr[__boolean] = js.undefined,
        Groups: js.UndefOr[__listOf__string] = js.undefined,
        Password: js.UndefOr[__string] = js.undefined,
        Username: js.UndefOr[__string] = js.undefined
    ): User = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConsoleAccess" -> ConsoleAccess.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Groups" -> Groups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Password" -> Password.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Username" -> Username.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[User]
    }
  }

  /**
    * Returns information about the status of the changes pending for the ActiveMQ user.
    */
  @js.native
  trait UserPendingChanges extends js.Object {
    var ConsoleAccess: js.UndefOr[__boolean]
    var Groups: js.UndefOr[__listOf__string]
    var PendingChange: js.UndefOr[ChangeType]
  }

  object UserPendingChanges {
    def apply(
        ConsoleAccess: js.UndefOr[__boolean] = js.undefined,
        Groups: js.UndefOr[__listOf__string] = js.undefined,
        PendingChange: js.UndefOr[ChangeType] = js.undefined
    ): UserPendingChanges = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConsoleAccess" -> ConsoleAccess.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Groups" -> Groups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PendingChange" -> PendingChange.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserPendingChanges]
    }
  }

  /**
    * Returns a list of all ActiveMQ users.
    */
  @js.native
  trait UserSummary extends js.Object {
    var PendingChange: js.UndefOr[ChangeType]
    var Username: js.UndefOr[__string]
  }

  object UserSummary {
    def apply(
        PendingChange: js.UndefOr[ChangeType] = js.undefined,
        Username: js.UndefOr[__string] = js.undefined
    ): UserSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PendingChange" -> PendingChange.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Username" -> Username.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserSummary]
    }
  }

  /**
    * The scheduled time period relative to UTC during which Amazon MQ begins to apply pending updates or patches to the broker.
    */
  @js.native
  trait WeeklyStartTime extends js.Object {
    var DayOfWeek: js.UndefOr[DayOfWeek]
    var TimeOfDay: js.UndefOr[__string]
    var TimeZone: js.UndefOr[__string]
  }

  object WeeklyStartTime {
    def apply(
        DayOfWeek: js.UndefOr[DayOfWeek] = js.undefined,
        TimeOfDay: js.UndefOr[__string] = js.undefined,
        TimeZone: js.UndefOr[__string] = js.undefined
    ): WeeklyStartTime = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DayOfWeek" -> DayOfWeek.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimeOfDay" -> TimeOfDay.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimeZone" -> TimeZone.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WeeklyStartTime]
    }
  }
}
