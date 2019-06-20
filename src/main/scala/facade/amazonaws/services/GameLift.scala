package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object gamelift {
  type AcceptanceType                      = String
  type AliasId                             = String
  type AliasList                           = js.Array[Alias]
  type ArnStringModel                      = String
  type BooleanModel                        = Boolean
  type BuildId                             = String
  type BuildList                           = js.Array[Build]
  type BuildStatus                         = String
  type ComparisonOperatorType              = String
  type CustomEventData                     = String
  type DesiredPlayerSessionList            = js.Array[DesiredPlayerSession]
  type DoubleObject                        = Double
  type EC2InstanceLimitList                = js.Array[EC2InstanceLimit]
  type EC2InstanceType                     = String
  type EventCode                           = String
  type EventList                           = js.Array[Event]
  type FleetAction                         = String
  type FleetActionList                     = js.Array[FleetAction]
  type FleetAttributesList                 = js.Array[FleetAttributes]
  type FleetCapacityList                   = js.Array[FleetCapacity]
  type FleetId                             = String
  type FleetIdList                         = js.Array[FleetId]
  type FleetStatus                         = String
  type FleetType                           = String
  type FleetUtilizationList                = js.Array[FleetUtilization]
  type FreeText                            = String
  type GamePropertyKey                     = String
  type GamePropertyList                    = js.Array[GameProperty]
  type GamePropertyValue                   = String
  type GameSessionActivationTimeoutSeconds = Int
  type GameSessionData                     = String
  type GameSessionDetailList               = js.Array[GameSessionDetail]
  type GameSessionList                     = js.Array[GameSession]
  type GameSessionPlacementState           = String
  type GameSessionQueueDestinationList     = js.Array[GameSessionQueueDestination]
  type GameSessionQueueList                = js.Array[GameSessionQueue]
  type GameSessionQueueName                = String
  type GameSessionQueueNameList            = js.Array[GameSessionQueueName]
  type GameSessionStatus                   = String
  type GameSessionStatusReason             = String
  type IdStringModel                       = String
  type InstanceId                          = String
  type InstanceList                        = js.Array[Instance]
  type InstanceStatus                      = String
  type IpAddress                           = String
  type IpPermissionsList                   = js.Array[IpPermission]
  type IpProtocol                          = String
  type LatencyMap                          = js.Dictionary[PositiveInteger]
  type MatchedPlayerSessionList            = js.Array[MatchedPlayerSession]
  type MatchmakerData                      = String
  type MatchmakingAcceptanceTimeoutInteger = Int
  type MatchmakingConfigurationList        = js.Array[MatchmakingConfiguration]
  type MatchmakingConfigurationStatus      = String
  type MatchmakingIdList                   = js.Array[MatchmakingIdStringModel]
  type MatchmakingIdStringModel            = String
  type MatchmakingRequestTimeoutInteger    = Int
  type MatchmakingRuleSetList              = js.Array[MatchmakingRuleSet]
  type MatchmakingRuleSetNameList          = js.Array[MatchmakingIdStringModel]
  type MatchmakingTicketList               = js.Array[MatchmakingTicket]
  type MaxConcurrentGameSessionActivations = Int
  type MetricGroup                         = String
  type MetricGroupList                     = js.Array[MetricGroup]
  type MetricName                          = String
  type NonBlankAndLengthConstraintString   = String
  type NonBlankString                      = String
  type NonEmptyString                      = String
  type NonZeroAndMaxString                 = String
  type OperatingSystem                     = String
  type PlacedPlayerSessionList             = js.Array[PlacedPlayerSession]
  type PlayerAttributeMap                  = js.Dictionary[AttributeValue]
  type PlayerData                          = String
  type PlayerDataMap                       = js.Dictionary[PlayerData]
  type PlayerIdList                        = js.Array[NonZeroAndMaxString]
  type PlayerLatencyList                   = js.Array[PlayerLatency]
  type PlayerLatencyPolicyList             = js.Array[PlayerLatencyPolicy]
  type PlayerList                          = js.Array[Player]
  type PlayerSessionCreationPolicy         = String
  type PlayerSessionId                     = String
  type PlayerSessionList                   = js.Array[PlayerSession]
  type PlayerSessionStatus                 = String
  type PolicyType                          = String
  type PortNumber                          = Int
  type PositiveInteger                     = Int
  type PositiveLong                        = Double
  type ProtectionPolicy                    = String
  type QueueArnsList                       = js.Array[ArnStringModel]
  type RoutingStrategyType                 = String
  type RuleSetBody                         = String
  type RuleSetLimit                        = Int
  type ScalingAdjustmentType               = String
  type ScalingPolicyList                   = js.Array[ScalingPolicy]
  type ScalingStatusType                   = String
  type ServerProcessList                   = js.Array[ServerProcess]
  type SnsArnStringModel                   = String
  type StringDoubleMap                     = js.Dictionary[DoubleObject]
  type StringList                          = js.Array[NonZeroAndMaxString]
  type StringModel                         = String
  type Timestamp                           = js.Date
  type VpcPeeringAuthorizationList         = js.Array[VpcPeeringAuthorization]
  type VpcPeeringConnectionList            = js.Array[VpcPeeringConnection]
  type WholeNumber                         = Int
}

package gamelift {
  @js.native
  @JSImport("aws-sdk", "GameLift")
  class GameLift() extends js.Object {
    def this(config: AWSConfig) = this()

    def acceptMatch(params: AcceptMatchInput): Request[AcceptMatchOutput]                                  = js.native
    def createAlias(params: CreateAliasInput): Request[CreateAliasOutput]                                  = js.native
    def createBuild(params: CreateBuildInput): Request[CreateBuildOutput]                                  = js.native
    def createFleet(params: CreateFleetInput): Request[CreateFleetOutput]                                  = js.native
    def createGameSession(params: CreateGameSessionInput): Request[CreateGameSessionOutput]                = js.native
    def createGameSessionQueue(params: CreateGameSessionQueueInput): Request[CreateGameSessionQueueOutput] = js.native
    def createMatchmakingConfiguration(
        params: CreateMatchmakingConfigurationInput
    ): Request[CreateMatchmakingConfigurationOutput] = js.native
    def createMatchmakingRuleSet(params: CreateMatchmakingRuleSetInput): Request[CreateMatchmakingRuleSetOutput] =
      js.native
    def createPlayerSession(params: CreatePlayerSessionInput): Request[CreatePlayerSessionOutput]    = js.native
    def createPlayerSessions(params: CreatePlayerSessionsInput): Request[CreatePlayerSessionsOutput] = js.native
    def createVpcPeeringAuthorization(
        params: CreateVpcPeeringAuthorizationInput
    ): Request[CreateVpcPeeringAuthorizationOutput] = js.native
    def createVpcPeeringConnection(params: CreateVpcPeeringConnectionInput): Request[CreateVpcPeeringConnectionOutput] =
      js.native
    def deleteAlias(params: DeleteAliasInput): Request[js.Object]                                          = js.native
    def deleteBuild(params: DeleteBuildInput): Request[js.Object]                                          = js.native
    def deleteFleet(params: DeleteFleetInput): Request[js.Object]                                          = js.native
    def deleteGameSessionQueue(params: DeleteGameSessionQueueInput): Request[DeleteGameSessionQueueOutput] = js.native
    def deleteMatchmakingConfiguration(
        params: DeleteMatchmakingConfigurationInput
    ): Request[DeleteMatchmakingConfigurationOutput] = js.native
    def deleteMatchmakingRuleSet(params: DeleteMatchmakingRuleSetInput): Request[DeleteMatchmakingRuleSetOutput] =
      js.native
    def deleteScalingPolicy(params: DeleteScalingPolicyInput): Request[js.Object] = js.native
    def deleteVpcPeeringAuthorization(
        params: DeleteVpcPeeringAuthorizationInput
    ): Request[DeleteVpcPeeringAuthorizationOutput] = js.native
    def deleteVpcPeeringConnection(params: DeleteVpcPeeringConnectionInput): Request[DeleteVpcPeeringConnectionOutput] =
      js.native
    def describeAlias(params: DescribeAliasInput): Request[DescribeAliasOutput] = js.native
    def describeBuild(params: DescribeBuildInput): Request[DescribeBuildOutput] = js.native
    def describeEC2InstanceLimits(params: DescribeEC2InstanceLimitsInput): Request[DescribeEC2InstanceLimitsOutput] =
      js.native
    def describeFleetAttributes(params: DescribeFleetAttributesInput): Request[DescribeFleetAttributesOutput] =
      js.native
    def describeFleetCapacity(params: DescribeFleetCapacityInput): Request[DescribeFleetCapacityOutput] = js.native
    def describeFleetEvents(params: DescribeFleetEventsInput): Request[DescribeFleetEventsOutput]       = js.native
    def describeFleetPortSettings(params: DescribeFleetPortSettingsInput): Request[DescribeFleetPortSettingsOutput] =
      js.native
    def describeFleetUtilization(params: DescribeFleetUtilizationInput): Request[DescribeFleetUtilizationOutput] =
      js.native
    def describeGameSessionDetails(params: DescribeGameSessionDetailsInput): Request[DescribeGameSessionDetailsOutput] =
      js.native
    def describeGameSessionPlacement(
        params: DescribeGameSessionPlacementInput
    ): Request[DescribeGameSessionPlacementOutput] = js.native
    def describeGameSessionQueues(params: DescribeGameSessionQueuesInput): Request[DescribeGameSessionQueuesOutput] =
      js.native
    def describeGameSessions(params: DescribeGameSessionsInput): Request[DescribeGameSessionsOutput] = js.native
    def describeInstances(params: DescribeInstancesInput): Request[DescribeInstancesOutput]          = js.native
    def describeMatchmaking(params: DescribeMatchmakingInput): Request[DescribeMatchmakingOutput]    = js.native
    def describeMatchmakingConfigurations(
        params: DescribeMatchmakingConfigurationsInput
    ): Request[DescribeMatchmakingConfigurationsOutput] = js.native
    def describeMatchmakingRuleSets(
        params: DescribeMatchmakingRuleSetsInput
    ): Request[DescribeMatchmakingRuleSetsOutput]                                                          = js.native
    def describePlayerSessions(params: DescribePlayerSessionsInput): Request[DescribePlayerSessionsOutput] = js.native
    def describeRuntimeConfiguration(
        params: DescribeRuntimeConfigurationInput
    ): Request[DescribeRuntimeConfigurationOutput] = js.native
    def describeScalingPolicies(params: DescribeScalingPoliciesInput): Request[DescribeScalingPoliciesOutput] =
      js.native
    def describeVpcPeeringAuthorizations(
        params: DescribeVpcPeeringAuthorizationsInput
    ): Request[DescribeVpcPeeringAuthorizationsOutput] = js.native
    def describeVpcPeeringConnections(
        params: DescribeVpcPeeringConnectionsInput
    ): Request[DescribeVpcPeeringConnectionsOutput]                                                  = js.native
    def getGameSessionLogUrl(params: GetGameSessionLogUrlInput): Request[GetGameSessionLogUrlOutput] = js.native
    def getInstanceAccess(params: GetInstanceAccessInput): Request[GetInstanceAccessOutput]          = js.native
    def listAliases(params: ListAliasesInput): Request[ListAliasesOutput]                            = js.native
    def listBuilds(params: ListBuildsInput): Request[ListBuildsOutput]                               = js.native
    def listFleets(params: ListFleetsInput): Request[ListFleetsOutput]                               = js.native
    def putScalingPolicy(params: PutScalingPolicyInput): Request[PutScalingPolicyOutput]             = js.native
    def requestUploadCredentials(params: RequestUploadCredentialsInput): Request[RequestUploadCredentialsOutput] =
      js.native
    def resolveAlias(params: ResolveAliasInput): Request[ResolveAliasOutput]                   = js.native
    def searchGameSessions(params: SearchGameSessionsInput): Request[SearchGameSessionsOutput] = js.native
    def startFleetActions(params: StartFleetActionsInput): Request[StartFleetActionsOutput]    = js.native
    def startGameSessionPlacement(params: StartGameSessionPlacementInput): Request[StartGameSessionPlacementOutput] =
      js.native
    def startMatchBackfill(params: StartMatchBackfillInput): Request[StartMatchBackfillOutput] = js.native
    def startMatchmaking(params: StartMatchmakingInput): Request[StartMatchmakingOutput]       = js.native
    def stopFleetActions(params: StopFleetActionsInput): Request[StopFleetActionsOutput]       = js.native
    def stopGameSessionPlacement(params: StopGameSessionPlacementInput): Request[StopGameSessionPlacementOutput] =
      js.native
    def stopMatchmaking(params: StopMatchmakingInput): Request[StopMatchmakingOutput]                   = js.native
    def updateAlias(params: UpdateAliasInput): Request[UpdateAliasOutput]                               = js.native
    def updateBuild(params: UpdateBuildInput): Request[UpdateBuildOutput]                               = js.native
    def updateFleetAttributes(params: UpdateFleetAttributesInput): Request[UpdateFleetAttributesOutput] = js.native
    def updateFleetCapacity(params: UpdateFleetCapacityInput): Request[UpdateFleetCapacityOutput]       = js.native
    def updateFleetPortSettings(params: UpdateFleetPortSettingsInput): Request[UpdateFleetPortSettingsOutput] =
      js.native
    def updateGameSession(params: UpdateGameSessionInput): Request[UpdateGameSessionOutput]                = js.native
    def updateGameSessionQueue(params: UpdateGameSessionQueueInput): Request[UpdateGameSessionQueueOutput] = js.native
    def updateMatchmakingConfiguration(
        params: UpdateMatchmakingConfigurationInput
    ): Request[UpdateMatchmakingConfigurationOutput] = js.native
    def updateRuntimeConfiguration(params: UpdateRuntimeConfigurationInput): Request[UpdateRuntimeConfigurationOutput] =
      js.native
    def validateMatchmakingRuleSet(params: ValidateMatchmakingRuleSetInput): Request[ValidateMatchmakingRuleSetOutput] =
      js.native
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait AcceptMatchInput extends js.Object {
    var AcceptanceType: AcceptanceType
    var PlayerIds: StringList
    var TicketId: MatchmakingIdStringModel
  }

  object AcceptMatchInput {
    def apply(
        AcceptanceType: AcceptanceType,
        PlayerIds: StringList,
        TicketId: MatchmakingIdStringModel
    ): AcceptMatchInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AcceptanceType" -> AcceptanceType.asInstanceOf[js.Any],
        "PlayerIds"      -> PlayerIds.asInstanceOf[js.Any],
        "TicketId"       -> TicketId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptMatchInput]
    }
  }

  @js.native
  trait AcceptMatchOutput extends js.Object {}

  object AcceptMatchOutput {
    def apply(
        ): AcceptMatchOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceptMatchOutput]
    }
  }

  object AcceptanceTypeEnum {
    val ACCEPT = "ACCEPT"
    val REJECT = "REJECT"

    val values = IndexedSeq(ACCEPT, REJECT)
  }

  /**
    * Properties describing a fleet alias.
    * * <a>CreateAlias</a>
    *  * <a>ListAliases</a>
    *  * <a>DescribeAlias</a>
    *  * <a>UpdateAlias</a>
    *  * <a>DeleteAlias</a>
    *  * <a>ResolveAlias</a>
    */
  @js.native
  trait Alias extends js.Object {
    var AliasArn: js.UndefOr[ArnStringModel]
    var AliasId: js.UndefOr[AliasId]
    var CreationTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[FreeText]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[NonBlankAndLengthConstraintString]
    var RoutingStrategy: js.UndefOr[RoutingStrategy]
  }

  object Alias {
    def apply(
        AliasArn: js.UndefOr[ArnStringModel] = js.undefined,
        AliasId: js.UndefOr[AliasId] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[FreeText] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[NonBlankAndLengthConstraintString] = js.undefined,
        RoutingStrategy: js.UndefOr[RoutingStrategy] = js.undefined
    ): Alias = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AliasArn" -> AliasArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AliasId" -> AliasId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTime" -> CreationTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastUpdatedTime" -> LastUpdatedTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoutingStrategy" -> RoutingStrategy.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Alias]
    }
  }

  /**
    * Values for use in <a>Player</a> attribute key:value pairs. This object lets you specify an attribute value using any of the valid data types: string, number, string array or data map. Each <code>AttributeValue</code> object can use only one of the available properties.
    */
  @js.native
  trait AttributeValue extends js.Object {
    var N: js.UndefOr[DoubleObject]
    var S: js.UndefOr[NonZeroAndMaxString]
    var SDM: js.UndefOr[StringDoubleMap]
    var SL: js.UndefOr[StringList]
  }

  object AttributeValue {
    def apply(
        N: js.UndefOr[DoubleObject] = js.undefined,
        S: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        SDM: js.UndefOr[StringDoubleMap] = js.undefined,
        SL: js.UndefOr[StringList] = js.undefined
    ): AttributeValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "N" -> N.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S" -> S.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SDM" -> SDM.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SL" -> SL.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttributeValue]
    }
  }

  /**
    * Temporary access credentials used for uploading game build files to Amazon GameLift. They are valid for a limited time. If they expire before you upload your game build, get a new set by calling <a>RequestUploadCredentials</a>.
    */
  @js.native
  trait AwsCredentials extends js.Object {
    var AccessKeyId: js.UndefOr[NonEmptyString]
    var SecretAccessKey: js.UndefOr[NonEmptyString]
    var SessionToken: js.UndefOr[NonEmptyString]
  }

  object AwsCredentials {
    def apply(
        AccessKeyId: js.UndefOr[NonEmptyString] = js.undefined,
        SecretAccessKey: js.UndefOr[NonEmptyString] = js.undefined,
        SessionToken: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsCredentials = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessKeyId" -> AccessKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SecretAccessKey" -> SecretAccessKey.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SessionToken" -> SessionToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AwsCredentials]
    }
  }

  /**
    * Properties describing a game build.
    * * <a>CreateBuild</a>
    *  * <a>ListBuilds</a>
    *  * <a>DescribeBuild</a>
    *  * <a>UpdateBuild</a>
    *  * <a>DeleteBuild</a>
    */
  @js.native
  trait Build extends js.Object {
    var BuildId: js.UndefOr[BuildId]
    var CreationTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[FreeText]
    var OperatingSystem: js.UndefOr[OperatingSystem]
    var SizeOnDisk: js.UndefOr[PositiveLong]
    var Status: js.UndefOr[BuildStatus]
    var Version: js.UndefOr[FreeText]
  }

  object Build {
    def apply(
        BuildId: js.UndefOr[BuildId] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[FreeText] = js.undefined,
        OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined,
        SizeOnDisk: js.UndefOr[PositiveLong] = js.undefined,
        Status: js.UndefOr[BuildStatus] = js.undefined,
        Version: js.UndefOr[FreeText] = js.undefined
    ): Build = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BuildId" -> BuildId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTime" -> CreationTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OperatingSystem" -> OperatingSystem.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SizeOnDisk" -> SizeOnDisk.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Build]
    }
  }

  object BuildStatusEnum {
    val INITIALIZED = "INITIALIZED"
    val READY       = "READY"
    val FAILED      = "FAILED"

    val values = IndexedSeq(INITIALIZED, READY, FAILED)
  }

  object ComparisonOperatorTypeEnum {
    val GreaterThanOrEqualToThreshold = "GreaterThanOrEqualToThreshold"
    val GreaterThanThreshold          = "GreaterThanThreshold"
    val LessThanThreshold             = "LessThanThreshold"
    val LessThanOrEqualToThreshold    = "LessThanOrEqualToThreshold"

    val values =
      IndexedSeq(GreaterThanOrEqualToThreshold, GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold)
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait CreateAliasInput extends js.Object {
    var Name: NonBlankAndLengthConstraintString
    var RoutingStrategy: RoutingStrategy
    var Description: js.UndefOr[NonZeroAndMaxString]
  }

  object CreateAliasInput {
    def apply(
        Name: NonBlankAndLengthConstraintString,
        RoutingStrategy: RoutingStrategy,
        Description: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): CreateAliasInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"            -> Name.asInstanceOf[js.Any],
        "RoutingStrategy" -> RoutingStrategy.asInstanceOf[js.Any],
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAliasInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait CreateAliasOutput extends js.Object {
    var Alias: js.UndefOr[Alias]
  }

  object CreateAliasOutput {
    def apply(
        Alias: js.UndefOr[Alias] = js.undefined
    ): CreateAliasOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Alias" -> Alias.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAliasOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait CreateBuildInput extends js.Object {
    var Name: js.UndefOr[NonZeroAndMaxString]
    var OperatingSystem: js.UndefOr[OperatingSystem]
    var StorageLocation: js.UndefOr[S3Location]
    var Version: js.UndefOr[NonZeroAndMaxString]
  }

  object CreateBuildInput {
    def apply(
        Name: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined,
        StorageLocation: js.UndefOr[S3Location] = js.undefined,
        Version: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): CreateBuildInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OperatingSystem" -> OperatingSystem.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StorageLocation" -> StorageLocation.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBuildInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait CreateBuildOutput extends js.Object {
    var Build: js.UndefOr[Build]
    var StorageLocation: js.UndefOr[S3Location]
    var UploadCredentials: js.UndefOr[AwsCredentials]
  }

  object CreateBuildOutput {
    def apply(
        Build: js.UndefOr[Build] = js.undefined,
        StorageLocation: js.UndefOr[S3Location] = js.undefined,
        UploadCredentials: js.UndefOr[AwsCredentials] = js.undefined
    ): CreateBuildOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Build" -> Build.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StorageLocation" -> StorageLocation.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UploadCredentials" -> UploadCredentials.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateBuildOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait CreateFleetInput extends js.Object {
    var BuildId: BuildId
    var EC2InstanceType: EC2InstanceType
    var Name: NonZeroAndMaxString
    var Description: js.UndefOr[NonZeroAndMaxString]
    var EC2InboundPermissions: js.UndefOr[IpPermissionsList]
    var FleetType: js.UndefOr[FleetType]
    var InstanceRoleArn: js.UndefOr[NonEmptyString]
    var LogPaths: js.UndefOr[StringList]
    var MetricGroups: js.UndefOr[MetricGroupList]
    var NewGameSessionProtectionPolicy: js.UndefOr[ProtectionPolicy]
    var PeerVpcAwsAccountId: js.UndefOr[NonZeroAndMaxString]
    var PeerVpcId: js.UndefOr[NonZeroAndMaxString]
    var ResourceCreationLimitPolicy: js.UndefOr[ResourceCreationLimitPolicy]
    var RuntimeConfiguration: js.UndefOr[RuntimeConfiguration]
    var ServerLaunchParameters: js.UndefOr[NonZeroAndMaxString]
    var ServerLaunchPath: js.UndefOr[NonZeroAndMaxString]
  }

  object CreateFleetInput {
    def apply(
        BuildId: BuildId,
        EC2InstanceType: EC2InstanceType,
        Name: NonZeroAndMaxString,
        Description: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        EC2InboundPermissions: js.UndefOr[IpPermissionsList] = js.undefined,
        FleetType: js.UndefOr[FleetType] = js.undefined,
        InstanceRoleArn: js.UndefOr[NonEmptyString] = js.undefined,
        LogPaths: js.UndefOr[StringList] = js.undefined,
        MetricGroups: js.UndefOr[MetricGroupList] = js.undefined,
        NewGameSessionProtectionPolicy: js.UndefOr[ProtectionPolicy] = js.undefined,
        PeerVpcAwsAccountId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        PeerVpcId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        ResourceCreationLimitPolicy: js.UndefOr[ResourceCreationLimitPolicy] = js.undefined,
        RuntimeConfiguration: js.UndefOr[RuntimeConfiguration] = js.undefined,
        ServerLaunchParameters: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        ServerLaunchPath: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): CreateFleetInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BuildId"         -> BuildId.asInstanceOf[js.Any],
        "EC2InstanceType" -> EC2InstanceType.asInstanceOf[js.Any],
        "Name"            -> Name.asInstanceOf[js.Any],
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EC2InboundPermissions" -> EC2InboundPermissions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FleetType" -> FleetType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceRoleArn" -> InstanceRoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogPaths" -> LogPaths.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MetricGroups" -> MetricGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NewGameSessionProtectionPolicy" -> NewGameSessionProtectionPolicy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PeerVpcAwsAccountId" -> PeerVpcAwsAccountId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PeerVpcId" -> PeerVpcId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceCreationLimitPolicy" -> ResourceCreationLimitPolicy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RuntimeConfiguration" -> RuntimeConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ServerLaunchParameters" -> ServerLaunchParameters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ServerLaunchPath" -> ServerLaunchPath.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFleetInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait CreateFleetOutput extends js.Object {
    var FleetAttributes: js.UndefOr[FleetAttributes]
  }

  object CreateFleetOutput {
    def apply(
        FleetAttributes: js.UndefOr[FleetAttributes] = js.undefined
    ): CreateFleetOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetAttributes" -> FleetAttributes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFleetOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait CreateGameSessionInput extends js.Object {
    var MaximumPlayerSessionCount: WholeNumber
    var AliasId: js.UndefOr[AliasId]
    var CreatorId: js.UndefOr[NonZeroAndMaxString]
    var FleetId: js.UndefOr[FleetId]
    var GameProperties: js.UndefOr[GamePropertyList]
    var GameSessionData: js.UndefOr[GameSessionData]
    var GameSessionId: js.UndefOr[IdStringModel]
    var IdempotencyToken: js.UndefOr[IdStringModel]
    var Name: js.UndefOr[NonZeroAndMaxString]
  }

  object CreateGameSessionInput {
    def apply(
        MaximumPlayerSessionCount: WholeNumber,
        AliasId: js.UndefOr[AliasId] = js.undefined,
        CreatorId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        FleetId: js.UndefOr[FleetId] = js.undefined,
        GameProperties: js.UndefOr[GamePropertyList] = js.undefined,
        GameSessionData: js.UndefOr[GameSessionData] = js.undefined,
        GameSessionId: js.UndefOr[IdStringModel] = js.undefined,
        IdempotencyToken: js.UndefOr[IdStringModel] = js.undefined,
        Name: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): CreateGameSessionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaximumPlayerSessionCount" -> MaximumPlayerSessionCount.asInstanceOf[js.Any],
        "AliasId" -> AliasId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreatorId" -> CreatorId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FleetId" -> FleetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GameProperties" -> GameProperties.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GameSessionData" -> GameSessionData.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GameSessionId" -> GameSessionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IdempotencyToken" -> IdempotencyToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGameSessionInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait CreateGameSessionOutput extends js.Object {
    var GameSession: js.UndefOr[GameSession]
  }

  object CreateGameSessionOutput {
    def apply(
        GameSession: js.UndefOr[GameSession] = js.undefined
    ): CreateGameSessionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSession" -> GameSession.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGameSessionOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait CreateGameSessionQueueInput extends js.Object {
    var Name: GameSessionQueueName
    var Destinations: js.UndefOr[GameSessionQueueDestinationList]
    var PlayerLatencyPolicies: js.UndefOr[PlayerLatencyPolicyList]
    var TimeoutInSeconds: js.UndefOr[WholeNumber]
  }

  object CreateGameSessionQueueInput {
    def apply(
        Name: GameSessionQueueName,
        Destinations: js.UndefOr[GameSessionQueueDestinationList] = js.undefined,
        PlayerLatencyPolicies: js.UndefOr[PlayerLatencyPolicyList] = js.undefined,
        TimeoutInSeconds: js.UndefOr[WholeNumber] = js.undefined
    ): CreateGameSessionQueueInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Destinations" -> Destinations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlayerLatencyPolicies" -> PlayerLatencyPolicies.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimeoutInSeconds" -> TimeoutInSeconds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGameSessionQueueInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait CreateGameSessionQueueOutput extends js.Object {
    var GameSessionQueue: js.UndefOr[GameSessionQueue]
  }

  object CreateGameSessionQueueOutput {
    def apply(
        GameSessionQueue: js.UndefOr[GameSessionQueue] = js.undefined
    ): CreateGameSessionQueueOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSessionQueue" -> GameSessionQueue.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGameSessionQueueOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait CreateMatchmakingConfigurationInput extends js.Object {
    var AcceptanceRequired: BooleanModel
    var GameSessionQueueArns: QueueArnsList
    var Name: MatchmakingIdStringModel
    var RequestTimeoutSeconds: MatchmakingRequestTimeoutInteger
    var RuleSetName: MatchmakingIdStringModel
    var AcceptanceTimeoutSeconds: js.UndefOr[MatchmakingAcceptanceTimeoutInteger]
    var AdditionalPlayerCount: js.UndefOr[WholeNumber]
    var CustomEventData: js.UndefOr[CustomEventData]
    var Description: js.UndefOr[NonZeroAndMaxString]
    var GameProperties: js.UndefOr[GamePropertyList]
    var GameSessionData: js.UndefOr[GameSessionData]
    var NotificationTarget: js.UndefOr[SnsArnStringModel]
  }

  object CreateMatchmakingConfigurationInput {
    def apply(
        AcceptanceRequired: BooleanModel,
        GameSessionQueueArns: QueueArnsList,
        Name: MatchmakingIdStringModel,
        RequestTimeoutSeconds: MatchmakingRequestTimeoutInteger,
        RuleSetName: MatchmakingIdStringModel,
        AcceptanceTimeoutSeconds: js.UndefOr[MatchmakingAcceptanceTimeoutInteger] = js.undefined,
        AdditionalPlayerCount: js.UndefOr[WholeNumber] = js.undefined,
        CustomEventData: js.UndefOr[CustomEventData] = js.undefined,
        Description: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        GameProperties: js.UndefOr[GamePropertyList] = js.undefined,
        GameSessionData: js.UndefOr[GameSessionData] = js.undefined,
        NotificationTarget: js.UndefOr[SnsArnStringModel] = js.undefined
    ): CreateMatchmakingConfigurationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AcceptanceRequired"    -> AcceptanceRequired.asInstanceOf[js.Any],
        "GameSessionQueueArns"  -> GameSessionQueueArns.asInstanceOf[js.Any],
        "Name"                  -> Name.asInstanceOf[js.Any],
        "RequestTimeoutSeconds" -> RequestTimeoutSeconds.asInstanceOf[js.Any],
        "RuleSetName"           -> RuleSetName.asInstanceOf[js.Any],
        "AcceptanceTimeoutSeconds" -> AcceptanceTimeoutSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AdditionalPlayerCount" -> AdditionalPlayerCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomEventData" -> CustomEventData.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GameProperties" -> GameProperties.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GameSessionData" -> GameSessionData.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NotificationTarget" -> NotificationTarget.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateMatchmakingConfigurationInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait CreateMatchmakingConfigurationOutput extends js.Object {
    var Configuration: js.UndefOr[MatchmakingConfiguration]
  }

  object CreateMatchmakingConfigurationOutput {
    def apply(
        Configuration: js.UndefOr[MatchmakingConfiguration] = js.undefined
    ): CreateMatchmakingConfigurationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Configuration" -> Configuration.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateMatchmakingConfigurationOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait CreateMatchmakingRuleSetInput extends js.Object {
    var Name: MatchmakingIdStringModel
    var RuleSetBody: RuleSetBody
  }

  object CreateMatchmakingRuleSetInput {
    def apply(
        Name: MatchmakingIdStringModel,
        RuleSetBody: RuleSetBody
    ): CreateMatchmakingRuleSetInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"        -> Name.asInstanceOf[js.Any],
        "RuleSetBody" -> RuleSetBody.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateMatchmakingRuleSetInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait CreateMatchmakingRuleSetOutput extends js.Object {
    var RuleSet: MatchmakingRuleSet
  }

  object CreateMatchmakingRuleSetOutput {
    def apply(
        RuleSet: MatchmakingRuleSet
    ): CreateMatchmakingRuleSetOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleSet" -> RuleSet.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateMatchmakingRuleSetOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait CreatePlayerSessionInput extends js.Object {
    var GameSessionId: ArnStringModel
    var PlayerId: NonZeroAndMaxString
    var PlayerData: js.UndefOr[PlayerData]
  }

  object CreatePlayerSessionInput {
    def apply(
        GameSessionId: ArnStringModel,
        PlayerId: NonZeroAndMaxString,
        PlayerData: js.UndefOr[PlayerData] = js.undefined
    ): CreatePlayerSessionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSessionId" -> GameSessionId.asInstanceOf[js.Any],
        "PlayerId"      -> PlayerId.asInstanceOf[js.Any],
        "PlayerData" -> PlayerData.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePlayerSessionInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait CreatePlayerSessionOutput extends js.Object {
    var PlayerSession: js.UndefOr[PlayerSession]
  }

  object CreatePlayerSessionOutput {
    def apply(
        PlayerSession: js.UndefOr[PlayerSession] = js.undefined
    ): CreatePlayerSessionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PlayerSession" -> PlayerSession.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePlayerSessionOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait CreatePlayerSessionsInput extends js.Object {
    var GameSessionId: ArnStringModel
    var PlayerIds: PlayerIdList
    var PlayerDataMap: js.UndefOr[PlayerDataMap]
  }

  object CreatePlayerSessionsInput {
    def apply(
        GameSessionId: ArnStringModel,
        PlayerIds: PlayerIdList,
        PlayerDataMap: js.UndefOr[PlayerDataMap] = js.undefined
    ): CreatePlayerSessionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSessionId" -> GameSessionId.asInstanceOf[js.Any],
        "PlayerIds"     -> PlayerIds.asInstanceOf[js.Any],
        "PlayerDataMap" -> PlayerDataMap.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePlayerSessionsInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait CreatePlayerSessionsOutput extends js.Object {
    var PlayerSessions: js.UndefOr[PlayerSessionList]
  }

  object CreatePlayerSessionsOutput {
    def apply(
        PlayerSessions: js.UndefOr[PlayerSessionList] = js.undefined
    ): CreatePlayerSessionsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PlayerSessions" -> PlayerSessions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePlayerSessionsOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait CreateVpcPeeringAuthorizationInput extends js.Object {
    var GameLiftAwsAccountId: NonZeroAndMaxString
    var PeerVpcId: NonZeroAndMaxString
  }

  object CreateVpcPeeringAuthorizationInput {
    def apply(
        GameLiftAwsAccountId: NonZeroAndMaxString,
        PeerVpcId: NonZeroAndMaxString
    ): CreateVpcPeeringAuthorizationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameLiftAwsAccountId" -> GameLiftAwsAccountId.asInstanceOf[js.Any],
        "PeerVpcId"            -> PeerVpcId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVpcPeeringAuthorizationInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait CreateVpcPeeringAuthorizationOutput extends js.Object {
    var VpcPeeringAuthorization: js.UndefOr[VpcPeeringAuthorization]
  }

  object CreateVpcPeeringAuthorizationOutput {
    def apply(
        VpcPeeringAuthorization: js.UndefOr[VpcPeeringAuthorization] = js.undefined
    ): CreateVpcPeeringAuthorizationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VpcPeeringAuthorization" -> VpcPeeringAuthorization.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVpcPeeringAuthorizationOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait CreateVpcPeeringConnectionInput extends js.Object {
    var FleetId: FleetId
    var PeerVpcAwsAccountId: NonZeroAndMaxString
    var PeerVpcId: NonZeroAndMaxString
  }

  object CreateVpcPeeringConnectionInput {
    def apply(
        FleetId: FleetId,
        PeerVpcAwsAccountId: NonZeroAndMaxString,
        PeerVpcId: NonZeroAndMaxString
    ): CreateVpcPeeringConnectionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId"             -> FleetId.asInstanceOf[js.Any],
        "PeerVpcAwsAccountId" -> PeerVpcAwsAccountId.asInstanceOf[js.Any],
        "PeerVpcId"           -> PeerVpcId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVpcPeeringConnectionInput]
    }
  }

  @js.native
  trait CreateVpcPeeringConnectionOutput extends js.Object {}

  object CreateVpcPeeringConnectionOutput {
    def apply(
        ): CreateVpcPeeringConnectionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVpcPeeringConnectionOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait DeleteAliasInput extends js.Object {
    var AliasId: AliasId
  }

  object DeleteAliasInput {
    def apply(
        AliasId: AliasId
    ): DeleteAliasInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AliasId" -> AliasId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAliasInput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait DeleteBuildInput extends js.Object {
    var BuildId: BuildId
  }

  object DeleteBuildInput {
    def apply(
        BuildId: BuildId
    ): DeleteBuildInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BuildId" -> BuildId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteBuildInput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait DeleteFleetInput extends js.Object {
    var FleetId: FleetId
  }

  object DeleteFleetInput {
    def apply(
        FleetId: FleetId
    ): DeleteFleetInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFleetInput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait DeleteGameSessionQueueInput extends js.Object {
    var Name: GameSessionQueueName
  }

  object DeleteGameSessionQueueInput {
    def apply(
        Name: GameSessionQueueName
    ): DeleteGameSessionQueueInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGameSessionQueueInput]
    }
  }

  @js.native
  trait DeleteGameSessionQueueOutput extends js.Object {}

  object DeleteGameSessionQueueOutput {
    def apply(
        ): DeleteGameSessionQueueOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGameSessionQueueOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait DeleteMatchmakingConfigurationInput extends js.Object {
    var Name: MatchmakingIdStringModel
  }

  object DeleteMatchmakingConfigurationInput {
    def apply(
        Name: MatchmakingIdStringModel
    ): DeleteMatchmakingConfigurationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMatchmakingConfigurationInput]
    }
  }

  @js.native
  trait DeleteMatchmakingConfigurationOutput extends js.Object {}

  object DeleteMatchmakingConfigurationOutput {
    def apply(
        ): DeleteMatchmakingConfigurationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMatchmakingConfigurationOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait DeleteMatchmakingRuleSetInput extends js.Object {
    var Name: MatchmakingIdStringModel
  }

  object DeleteMatchmakingRuleSetInput {
    def apply(
        Name: MatchmakingIdStringModel
    ): DeleteMatchmakingRuleSetInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMatchmakingRuleSetInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait DeleteMatchmakingRuleSetOutput extends js.Object {}

  object DeleteMatchmakingRuleSetOutput {
    def apply(
        ): DeleteMatchmakingRuleSetOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMatchmakingRuleSetOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait DeleteScalingPolicyInput extends js.Object {
    var FleetId: FleetId
    var Name: NonZeroAndMaxString
  }

  object DeleteScalingPolicyInput {
    def apply(
        FleetId: FleetId,
        Name: NonZeroAndMaxString
    ): DeleteScalingPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.asInstanceOf[js.Any],
        "Name"    -> Name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteScalingPolicyInput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait DeleteVpcPeeringAuthorizationInput extends js.Object {
    var GameLiftAwsAccountId: NonZeroAndMaxString
    var PeerVpcId: NonZeroAndMaxString
  }

  object DeleteVpcPeeringAuthorizationInput {
    def apply(
        GameLiftAwsAccountId: NonZeroAndMaxString,
        PeerVpcId: NonZeroAndMaxString
    ): DeleteVpcPeeringAuthorizationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameLiftAwsAccountId" -> GameLiftAwsAccountId.asInstanceOf[js.Any],
        "PeerVpcId"            -> PeerVpcId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVpcPeeringAuthorizationInput]
    }
  }

  @js.native
  trait DeleteVpcPeeringAuthorizationOutput extends js.Object {}

  object DeleteVpcPeeringAuthorizationOutput {
    def apply(
        ): DeleteVpcPeeringAuthorizationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVpcPeeringAuthorizationOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait DeleteVpcPeeringConnectionInput extends js.Object {
    var FleetId: FleetId
    var VpcPeeringConnectionId: NonZeroAndMaxString
  }

  object DeleteVpcPeeringConnectionInput {
    def apply(
        FleetId: FleetId,
        VpcPeeringConnectionId: NonZeroAndMaxString
    ): DeleteVpcPeeringConnectionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId"                -> FleetId.asInstanceOf[js.Any],
        "VpcPeeringConnectionId" -> VpcPeeringConnectionId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVpcPeeringConnectionInput]
    }
  }

  @js.native
  trait DeleteVpcPeeringConnectionOutput extends js.Object {}

  object DeleteVpcPeeringConnectionOutput {
    def apply(
        ): DeleteVpcPeeringConnectionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVpcPeeringConnectionOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait DescribeAliasInput extends js.Object {
    var AliasId: AliasId
  }

  object DescribeAliasInput {
    def apply(
        AliasId: AliasId
    ): DescribeAliasInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AliasId" -> AliasId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAliasInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait DescribeAliasOutput extends js.Object {
    var Alias: js.UndefOr[Alias]
  }

  object DescribeAliasOutput {
    def apply(
        Alias: js.UndefOr[Alias] = js.undefined
    ): DescribeAliasOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Alias" -> Alias.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAliasOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait DescribeBuildInput extends js.Object {
    var BuildId: BuildId
  }

  object DescribeBuildInput {
    def apply(
        BuildId: BuildId
    ): DescribeBuildInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BuildId" -> BuildId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBuildInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait DescribeBuildOutput extends js.Object {
    var Build: js.UndefOr[Build]
  }

  object DescribeBuildOutput {
    def apply(
        Build: js.UndefOr[Build] = js.undefined
    ): DescribeBuildOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Build" -> Build.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeBuildOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait DescribeEC2InstanceLimitsInput extends js.Object {
    var EC2InstanceType: js.UndefOr[EC2InstanceType]
  }

  object DescribeEC2InstanceLimitsInput {
    def apply(
        EC2InstanceType: js.UndefOr[EC2InstanceType] = js.undefined
    ): DescribeEC2InstanceLimitsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EC2InstanceType" -> EC2InstanceType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEC2InstanceLimitsInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait DescribeEC2InstanceLimitsOutput extends js.Object {
    var EC2InstanceLimits: js.UndefOr[EC2InstanceLimitList]
  }

  object DescribeEC2InstanceLimitsOutput {
    def apply(
        EC2InstanceLimits: js.UndefOr[EC2InstanceLimitList] = js.undefined
    ): DescribeEC2InstanceLimitsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EC2InstanceLimits" -> EC2InstanceLimits.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEC2InstanceLimitsOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait DescribeFleetAttributesInput extends js.Object {
    var FleetIds: js.UndefOr[FleetIdList]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeFleetAttributesInput {
    def apply(
        FleetIds: js.UndefOr[FleetIdList] = js.undefined,
        Limit: js.UndefOr[PositiveInteger] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeFleetAttributesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetIds" -> FleetIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Limit" -> Limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFleetAttributesInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait DescribeFleetAttributesOutput extends js.Object {
    var FleetAttributes: js.UndefOr[FleetAttributesList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeFleetAttributesOutput {
    def apply(
        FleetAttributes: js.UndefOr[FleetAttributesList] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeFleetAttributesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetAttributes" -> FleetAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFleetAttributesOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait DescribeFleetCapacityInput extends js.Object {
    var FleetIds: js.UndefOr[FleetIdList]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeFleetCapacityInput {
    def apply(
        FleetIds: js.UndefOr[FleetIdList] = js.undefined,
        Limit: js.UndefOr[PositiveInteger] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeFleetCapacityInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetIds" -> FleetIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Limit" -> Limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFleetCapacityInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait DescribeFleetCapacityOutput extends js.Object {
    var FleetCapacity: js.UndefOr[FleetCapacityList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeFleetCapacityOutput {
    def apply(
        FleetCapacity: js.UndefOr[FleetCapacityList] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeFleetCapacityOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetCapacity" -> FleetCapacity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFleetCapacityOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait DescribeFleetEventsInput extends js.Object {
    var FleetId: FleetId
    var EndTime: js.UndefOr[Timestamp]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
    var StartTime: js.UndefOr[Timestamp]
  }

  object DescribeFleetEventsInput {
    def apply(
        FleetId: FleetId,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        Limit: js.UndefOr[PositiveInteger] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        StartTime: js.UndefOr[Timestamp] = js.undefined
    ): DescribeFleetEventsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.asInstanceOf[js.Any],
        "EndTime" -> EndTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Limit" -> Limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartTime" -> StartTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFleetEventsInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait DescribeFleetEventsOutput extends js.Object {
    var Events: js.UndefOr[EventList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeFleetEventsOutput {
    def apply(
        Events: js.UndefOr[EventList] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeFleetEventsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Events" -> Events.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFleetEventsOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait DescribeFleetPortSettingsInput extends js.Object {
    var FleetId: FleetId
  }

  object DescribeFleetPortSettingsInput {
    def apply(
        FleetId: FleetId
    ): DescribeFleetPortSettingsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFleetPortSettingsInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait DescribeFleetPortSettingsOutput extends js.Object {
    var InboundPermissions: js.UndefOr[IpPermissionsList]
  }

  object DescribeFleetPortSettingsOutput {
    def apply(
        InboundPermissions: js.UndefOr[IpPermissionsList] = js.undefined
    ): DescribeFleetPortSettingsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InboundPermissions" -> InboundPermissions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFleetPortSettingsOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait DescribeFleetUtilizationInput extends js.Object {
    var FleetIds: js.UndefOr[FleetIdList]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeFleetUtilizationInput {
    def apply(
        FleetIds: js.UndefOr[FleetIdList] = js.undefined,
        Limit: js.UndefOr[PositiveInteger] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeFleetUtilizationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetIds" -> FleetIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Limit" -> Limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFleetUtilizationInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait DescribeFleetUtilizationOutput extends js.Object {
    var FleetUtilization: js.UndefOr[FleetUtilizationList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeFleetUtilizationOutput {
    def apply(
        FleetUtilization: js.UndefOr[FleetUtilizationList] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeFleetUtilizationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetUtilization" -> FleetUtilization.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeFleetUtilizationOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait DescribeGameSessionDetailsInput extends js.Object {
    var AliasId: js.UndefOr[AliasId]
    var FleetId: js.UndefOr[FleetId]
    var GameSessionId: js.UndefOr[ArnStringModel]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
    var StatusFilter: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeGameSessionDetailsInput {
    def apply(
        AliasId: js.UndefOr[AliasId] = js.undefined,
        FleetId: js.UndefOr[FleetId] = js.undefined,
        GameSessionId: js.UndefOr[ArnStringModel] = js.undefined,
        Limit: js.UndefOr[PositiveInteger] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        StatusFilter: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeGameSessionDetailsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AliasId" -> AliasId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FleetId" -> FleetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GameSessionId" -> GameSessionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Limit" -> Limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StatusFilter" -> StatusFilter.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGameSessionDetailsInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait DescribeGameSessionDetailsOutput extends js.Object {
    var GameSessionDetails: js.UndefOr[GameSessionDetailList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeGameSessionDetailsOutput {
    def apply(
        GameSessionDetails: js.UndefOr[GameSessionDetailList] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeGameSessionDetailsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSessionDetails" -> GameSessionDetails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGameSessionDetailsOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait DescribeGameSessionPlacementInput extends js.Object {
    var PlacementId: IdStringModel
  }

  object DescribeGameSessionPlacementInput {
    def apply(
        PlacementId: IdStringModel
    ): DescribeGameSessionPlacementInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PlacementId" -> PlacementId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGameSessionPlacementInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait DescribeGameSessionPlacementOutput extends js.Object {
    var GameSessionPlacement: js.UndefOr[GameSessionPlacement]
  }

  object DescribeGameSessionPlacementOutput {
    def apply(
        GameSessionPlacement: js.UndefOr[GameSessionPlacement] = js.undefined
    ): DescribeGameSessionPlacementOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSessionPlacement" -> GameSessionPlacement.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGameSessionPlacementOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait DescribeGameSessionQueuesInput extends js.Object {
    var Limit: js.UndefOr[PositiveInteger]
    var Names: js.UndefOr[GameSessionQueueNameList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeGameSessionQueuesInput {
    def apply(
        Limit: js.UndefOr[PositiveInteger] = js.undefined,
        Names: js.UndefOr[GameSessionQueueNameList] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeGameSessionQueuesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Names" -> Names.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGameSessionQueuesInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait DescribeGameSessionQueuesOutput extends js.Object {
    var GameSessionQueues: js.UndefOr[GameSessionQueueList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeGameSessionQueuesOutput {
    def apply(
        GameSessionQueues: js.UndefOr[GameSessionQueueList] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeGameSessionQueuesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSessionQueues" -> GameSessionQueues.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGameSessionQueuesOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait DescribeGameSessionsInput extends js.Object {
    var AliasId: js.UndefOr[AliasId]
    var FleetId: js.UndefOr[FleetId]
    var GameSessionId: js.UndefOr[ArnStringModel]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
    var StatusFilter: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeGameSessionsInput {
    def apply(
        AliasId: js.UndefOr[AliasId] = js.undefined,
        FleetId: js.UndefOr[FleetId] = js.undefined,
        GameSessionId: js.UndefOr[ArnStringModel] = js.undefined,
        Limit: js.UndefOr[PositiveInteger] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        StatusFilter: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeGameSessionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AliasId" -> AliasId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FleetId" -> FleetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GameSessionId" -> GameSessionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Limit" -> Limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StatusFilter" -> StatusFilter.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGameSessionsInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait DescribeGameSessionsOutput extends js.Object {
    var GameSessions: js.UndefOr[GameSessionList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeGameSessionsOutput {
    def apply(
        GameSessions: js.UndefOr[GameSessionList] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeGameSessionsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSessions" -> GameSessions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeGameSessionsOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait DescribeInstancesInput extends js.Object {
    var FleetId: FleetId
    var InstanceId: js.UndefOr[InstanceId]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeInstancesInput {
    def apply(
        FleetId: FleetId,
        InstanceId: js.UndefOr[InstanceId] = js.undefined,
        Limit: js.UndefOr[PositiveInteger] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeInstancesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Limit" -> Limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstancesInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait DescribeInstancesOutput extends js.Object {
    var Instances: js.UndefOr[InstanceList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeInstancesOutput {
    def apply(
        Instances: js.UndefOr[InstanceList] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeInstancesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Instances" -> Instances.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeInstancesOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait DescribeMatchmakingConfigurationsInput extends js.Object {
    var Limit: js.UndefOr[PositiveInteger]
    var Names: js.UndefOr[MatchmakingIdList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
    var RuleSetName: js.UndefOr[MatchmakingIdStringModel]
  }

  object DescribeMatchmakingConfigurationsInput {
    def apply(
        Limit: js.UndefOr[PositiveInteger] = js.undefined,
        Names: js.UndefOr[MatchmakingIdList] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        RuleSetName: js.UndefOr[MatchmakingIdStringModel] = js.undefined
    ): DescribeMatchmakingConfigurationsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Names" -> Names.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RuleSetName" -> RuleSetName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMatchmakingConfigurationsInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait DescribeMatchmakingConfigurationsOutput extends js.Object {
    var Configurations: js.UndefOr[MatchmakingConfigurationList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeMatchmakingConfigurationsOutput {
    def apply(
        Configurations: js.UndefOr[MatchmakingConfigurationList] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeMatchmakingConfigurationsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Configurations" -> Configurations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMatchmakingConfigurationsOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait DescribeMatchmakingInput extends js.Object {
    var TicketIds: MatchmakingIdList
  }

  object DescribeMatchmakingInput {
    def apply(
        TicketIds: MatchmakingIdList
    ): DescribeMatchmakingInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TicketIds" -> TicketIds.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMatchmakingInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait DescribeMatchmakingOutput extends js.Object {
    var TicketList: js.UndefOr[MatchmakingTicketList]
  }

  object DescribeMatchmakingOutput {
    def apply(
        TicketList: js.UndefOr[MatchmakingTicketList] = js.undefined
    ): DescribeMatchmakingOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TicketList" -> TicketList.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMatchmakingOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait DescribeMatchmakingRuleSetsInput extends js.Object {
    var Limit: js.UndefOr[RuleSetLimit]
    var Names: js.UndefOr[MatchmakingRuleSetNameList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeMatchmakingRuleSetsInput {
    def apply(
        Limit: js.UndefOr[RuleSetLimit] = js.undefined,
        Names: js.UndefOr[MatchmakingRuleSetNameList] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeMatchmakingRuleSetsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Names" -> Names.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMatchmakingRuleSetsInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait DescribeMatchmakingRuleSetsOutput extends js.Object {
    var RuleSets: MatchmakingRuleSetList
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeMatchmakingRuleSetsOutput {
    def apply(
        RuleSets: MatchmakingRuleSetList,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeMatchmakingRuleSetsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleSets" -> RuleSets.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMatchmakingRuleSetsOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait DescribePlayerSessionsInput extends js.Object {
    var GameSessionId: js.UndefOr[ArnStringModel]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
    var PlayerId: js.UndefOr[NonZeroAndMaxString]
    var PlayerSessionId: js.UndefOr[PlayerSessionId]
    var PlayerSessionStatusFilter: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribePlayerSessionsInput {
    def apply(
        GameSessionId: js.UndefOr[ArnStringModel] = js.undefined,
        Limit: js.UndefOr[PositiveInteger] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        PlayerSessionId: js.UndefOr[PlayerSessionId] = js.undefined,
        PlayerSessionStatusFilter: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribePlayerSessionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSessionId" -> GameSessionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Limit" -> Limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlayerId" -> PlayerId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlayerSessionId" -> PlayerSessionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlayerSessionStatusFilter" -> PlayerSessionStatusFilter.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePlayerSessionsInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait DescribePlayerSessionsOutput extends js.Object {
    var NextToken: js.UndefOr[NonZeroAndMaxString]
    var PlayerSessions: js.UndefOr[PlayerSessionList]
  }

  object DescribePlayerSessionsOutput {
    def apply(
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        PlayerSessions: js.UndefOr[PlayerSessionList] = js.undefined
    ): DescribePlayerSessionsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlayerSessions" -> PlayerSessions.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribePlayerSessionsOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait DescribeRuntimeConfigurationInput extends js.Object {
    var FleetId: FleetId
  }

  object DescribeRuntimeConfigurationInput {
    def apply(
        FleetId: FleetId
    ): DescribeRuntimeConfigurationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRuntimeConfigurationInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait DescribeRuntimeConfigurationOutput extends js.Object {
    var RuntimeConfiguration: js.UndefOr[RuntimeConfiguration]
  }

  object DescribeRuntimeConfigurationOutput {
    def apply(
        RuntimeConfiguration: js.UndefOr[RuntimeConfiguration] = js.undefined
    ): DescribeRuntimeConfigurationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuntimeConfiguration" -> RuntimeConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRuntimeConfigurationOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait DescribeScalingPoliciesInput extends js.Object {
    var FleetId: FleetId
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
    var StatusFilter: js.UndefOr[ScalingStatusType]
  }

  object DescribeScalingPoliciesInput {
    def apply(
        FleetId: FleetId,
        Limit: js.UndefOr[PositiveInteger] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        StatusFilter: js.UndefOr[ScalingStatusType] = js.undefined
    ): DescribeScalingPoliciesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.asInstanceOf[js.Any],
        "Limit" -> Limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StatusFilter" -> StatusFilter.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScalingPoliciesInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait DescribeScalingPoliciesOutput extends js.Object {
    var NextToken: js.UndefOr[NonZeroAndMaxString]
    var ScalingPolicies: js.UndefOr[ScalingPolicyList]
  }

  object DescribeScalingPoliciesOutput {
    def apply(
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        ScalingPolicies: js.UndefOr[ScalingPolicyList] = js.undefined
    ): DescribeScalingPoliciesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScalingPolicies" -> ScalingPolicies.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeScalingPoliciesOutput]
    }
  }

  @js.native
  trait DescribeVpcPeeringAuthorizationsInput extends js.Object {}

  object DescribeVpcPeeringAuthorizationsInput {
    def apply(
        ): DescribeVpcPeeringAuthorizationsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcPeeringAuthorizationsInput]
    }
  }

  @js.native
  trait DescribeVpcPeeringAuthorizationsOutput extends js.Object {
    var VpcPeeringAuthorizations: js.UndefOr[VpcPeeringAuthorizationList]
  }

  object DescribeVpcPeeringAuthorizationsOutput {
    def apply(
        VpcPeeringAuthorizations: js.UndefOr[VpcPeeringAuthorizationList] = js.undefined
    ): DescribeVpcPeeringAuthorizationsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VpcPeeringAuthorizations" -> VpcPeeringAuthorizations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcPeeringAuthorizationsOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait DescribeVpcPeeringConnectionsInput extends js.Object {
    var FleetId: js.UndefOr[FleetId]
  }

  object DescribeVpcPeeringConnectionsInput {
    def apply(
        FleetId: js.UndefOr[FleetId] = js.undefined
    ): DescribeVpcPeeringConnectionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcPeeringConnectionsInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait DescribeVpcPeeringConnectionsOutput extends js.Object {
    var VpcPeeringConnections: js.UndefOr[VpcPeeringConnectionList]
  }

  object DescribeVpcPeeringConnectionsOutput {
    def apply(
        VpcPeeringConnections: js.UndefOr[VpcPeeringConnectionList] = js.undefined
    ): DescribeVpcPeeringConnectionsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "VpcPeeringConnections" -> VpcPeeringConnections.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVpcPeeringConnectionsOutput]
    }
  }

  /**
    * Player information for use when creating player sessions using a game session placement request with <a>StartGameSessionPlacement</a>.
    */
  @js.native
  trait DesiredPlayerSession extends js.Object {
    var PlayerData: js.UndefOr[PlayerData]
    var PlayerId: js.UndefOr[NonZeroAndMaxString]
  }

  object DesiredPlayerSession {
    def apply(
        PlayerData: js.UndefOr[PlayerData] = js.undefined,
        PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DesiredPlayerSession = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PlayerData" -> PlayerData.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlayerId" -> PlayerId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DesiredPlayerSession]
    }
  }

  /**
    * Current status of fleet capacity. The number of active instances should match or be in the process of matching the number of desired instances. Pending and terminating counts are non-zero only if fleet capacity is adjusting to an <a>UpdateFleetCapacity</a> request, or if access to resources is temporarily affected.
    * * <a>CreateFleet</a>
    *  * <a>ListFleets</a>
    *  * <a>DeleteFleet</a>
    *  * Describe fleets:
    * <li> <a>DescribeFleetAttributes</a>
    *  * <a>DescribeFleetCapacity</a>
    *  * <a>DescribeFleetPortSettings</a>
    *  * <a>DescribeFleetUtilization</a>
    *  * <a>DescribeRuntimeConfiguration</a>
    *  * <a>DescribeEC2InstanceLimits</a>
    *  * <a>DescribeFleetEvents</a>
    * </li> * Update fleets:
    * <li> <a>UpdateFleetAttributes</a>
    *  * <a>UpdateFleetCapacity</a>
    *  * <a>UpdateFleetPortSettings</a>
    *  * <a>UpdateRuntimeConfiguration</a>
    * </li> * Manage fleet actions:
    * <li> <a>StartFleetActions</a>
    *  * <a>StopFleetActions</a>
    * </li>
    */
  @js.native
  trait EC2InstanceCounts extends js.Object {
    var ACTIVE: js.UndefOr[WholeNumber]
    var DESIRED: js.UndefOr[WholeNumber]
    var IDLE: js.UndefOr[WholeNumber]
    var MAXIMUM: js.UndefOr[WholeNumber]
    var MINIMUM: js.UndefOr[WholeNumber]
    var PENDING: js.UndefOr[WholeNumber]
    var TERMINATING: js.UndefOr[WholeNumber]
  }

  object EC2InstanceCounts {
    def apply(
        ACTIVE: js.UndefOr[WholeNumber] = js.undefined,
        DESIRED: js.UndefOr[WholeNumber] = js.undefined,
        IDLE: js.UndefOr[WholeNumber] = js.undefined,
        MAXIMUM: js.UndefOr[WholeNumber] = js.undefined,
        MINIMUM: js.UndefOr[WholeNumber] = js.undefined,
        PENDING: js.UndefOr[WholeNumber] = js.undefined,
        TERMINATING: js.UndefOr[WholeNumber] = js.undefined
    ): EC2InstanceCounts = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ACTIVE" -> ACTIVE.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DESIRED" -> DESIRED.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IDLE" -> IDLE.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MAXIMUM" -> MAXIMUM.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MINIMUM" -> MINIMUM.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PENDING" -> PENDING.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TERMINATING" -> TERMINATING.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EC2InstanceCounts]
    }
  }

  /**
    * Maximum number of instances allowed based on the Amazon Elastic Compute Cloud (Amazon EC2) instance type. Instance limits can be retrieved by calling <a>DescribeEC2InstanceLimits</a>.
    */
  @js.native
  trait EC2InstanceLimit extends js.Object {
    var CurrentInstances: js.UndefOr[WholeNumber]
    var EC2InstanceType: js.UndefOr[EC2InstanceType]
    var InstanceLimit: js.UndefOr[WholeNumber]
  }

  object EC2InstanceLimit {
    def apply(
        CurrentInstances: js.UndefOr[WholeNumber] = js.undefined,
        EC2InstanceType: js.UndefOr[EC2InstanceType] = js.undefined,
        InstanceLimit: js.UndefOr[WholeNumber] = js.undefined
    ): EC2InstanceLimit = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CurrentInstances" -> CurrentInstances.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EC2InstanceType" -> EC2InstanceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceLimit" -> InstanceLimit.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EC2InstanceLimit]
    }
  }

  object EC2InstanceTypeEnum {
    val `t2.micro`    = "t2.micro"
    val `t2.small`    = "t2.small"
    val `t2.medium`   = "t2.medium"
    val `t2.large`    = "t2.large"
    val `c3.large`    = "c3.large"
    val `c3.xlarge`   = "c3.xlarge"
    val `c3.2xlarge`  = "c3.2xlarge"
    val `c3.4xlarge`  = "c3.4xlarge"
    val `c3.8xlarge`  = "c3.8xlarge"
    val `c4.large`    = "c4.large"
    val `c4.xlarge`   = "c4.xlarge"
    val `c4.2xlarge`  = "c4.2xlarge"
    val `c4.4xlarge`  = "c4.4xlarge"
    val `c4.8xlarge`  = "c4.8xlarge"
    val `r3.large`    = "r3.large"
    val `r3.xlarge`   = "r3.xlarge"
    val `r3.2xlarge`  = "r3.2xlarge"
    val `r3.4xlarge`  = "r3.4xlarge"
    val `r3.8xlarge`  = "r3.8xlarge"
    val `r4.large`    = "r4.large"
    val `r4.xlarge`   = "r4.xlarge"
    val `r4.2xlarge`  = "r4.2xlarge"
    val `r4.4xlarge`  = "r4.4xlarge"
    val `r4.8xlarge`  = "r4.8xlarge"
    val `r4.16xlarge` = "r4.16xlarge"
    val `m3.medium`   = "m3.medium"
    val `m3.large`    = "m3.large"
    val `m3.xlarge`   = "m3.xlarge"
    val `m3.2xlarge`  = "m3.2xlarge"
    val `m4.large`    = "m4.large"
    val `m4.xlarge`   = "m4.xlarge"
    val `m4.2xlarge`  = "m4.2xlarge"
    val `m4.4xlarge`  = "m4.4xlarge"
    val `m4.10xlarge` = "m4.10xlarge"

    val values = IndexedSeq(
      `t2.micro`,
      `t2.small`,
      `t2.medium`,
      `t2.large`,
      `c3.large`,
      `c3.xlarge`,
      `c3.2xlarge`,
      `c3.4xlarge`,
      `c3.8xlarge`,
      `c4.large`,
      `c4.xlarge`,
      `c4.2xlarge`,
      `c4.4xlarge`,
      `c4.8xlarge`,
      `r3.large`,
      `r3.xlarge`,
      `r3.2xlarge`,
      `r3.4xlarge`,
      `r3.8xlarge`,
      `r4.large`,
      `r4.xlarge`,
      `r4.2xlarge`,
      `r4.4xlarge`,
      `r4.8xlarge`,
      `r4.16xlarge`,
      `m3.medium`,
      `m3.large`,
      `m3.xlarge`,
      `m3.2xlarge`,
      `m4.large`,
      `m4.xlarge`,
      `m4.2xlarge`,
      `m4.4xlarge`,
      `m4.10xlarge`
    )
  }

  /**
    * Log entry describing an event that involves Amazon GameLift resources (such as a fleet). In addition to tracking activity, event codes and messages can provide additional information for troubleshooting and debugging problems.
    */
  @js.native
  trait Event extends js.Object {
    var EventCode: js.UndefOr[EventCode]
    var EventId: js.UndefOr[NonZeroAndMaxString]
    var EventTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[NonEmptyString]
    var PreSignedLogUrl: js.UndefOr[NonZeroAndMaxString]
    var ResourceId: js.UndefOr[NonZeroAndMaxString]
  }

  object Event {
    def apply(
        EventCode: js.UndefOr[EventCode] = js.undefined,
        EventId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        EventTime: js.UndefOr[Timestamp] = js.undefined,
        Message: js.UndefOr[NonEmptyString] = js.undefined,
        PreSignedLogUrl: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        ResourceId: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): Event = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventCode" -> EventCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EventId" -> EventId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EventTime" -> EventTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Message" -> Message.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PreSignedLogUrl" -> PreSignedLogUrl.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceId" -> ResourceId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Event]
    }
  }

  object EventCodeEnum {
    val GENERIC_EVENT                                    = "GENERIC_EVENT"
    val FLEET_CREATED                                    = "FLEET_CREATED"
    val FLEET_DELETED                                    = "FLEET_DELETED"
    val FLEET_SCALING_EVENT                              = "FLEET_SCALING_EVENT"
    val FLEET_STATE_DOWNLOADING                          = "FLEET_STATE_DOWNLOADING"
    val FLEET_STATE_VALIDATING                           = "FLEET_STATE_VALIDATING"
    val FLEET_STATE_BUILDING                             = "FLEET_STATE_BUILDING"
    val FLEET_STATE_ACTIVATING                           = "FLEET_STATE_ACTIVATING"
    val FLEET_STATE_ACTIVE                               = "FLEET_STATE_ACTIVE"
    val FLEET_STATE_ERROR                                = "FLEET_STATE_ERROR"
    val FLEET_INITIALIZATION_FAILED                      = "FLEET_INITIALIZATION_FAILED"
    val FLEET_BINARY_DOWNLOAD_FAILED                     = "FLEET_BINARY_DOWNLOAD_FAILED"
    val FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND           = "FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND"
    val FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE      = "FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE"
    val FLEET_VALIDATION_TIMED_OUT                       = "FLEET_VALIDATION_TIMED_OUT"
    val FLEET_ACTIVATION_FAILED                          = "FLEET_ACTIVATION_FAILED"
    val FLEET_ACTIVATION_FAILED_NO_INSTANCES             = "FLEET_ACTIVATION_FAILED_NO_INSTANCES"
    val FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED = "FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED"
    val SERVER_PROCESS_INVALID_PATH                      = "SERVER_PROCESS_INVALID_PATH"
    val SERVER_PROCESS_SDK_INITIALIZATION_TIMEOUT        = "SERVER_PROCESS_SDK_INITIALIZATION_TIMEOUT"
    val SERVER_PROCESS_PROCESS_READY_TIMEOUT             = "SERVER_PROCESS_PROCESS_READY_TIMEOUT"
    val SERVER_PROCESS_CRASHED                           = "SERVER_PROCESS_CRASHED"
    val SERVER_PROCESS_TERMINATED_UNHEALTHY              = "SERVER_PROCESS_TERMINATED_UNHEALTHY"
    val SERVER_PROCESS_FORCE_TERMINATED                  = "SERVER_PROCESS_FORCE_TERMINATED"
    val SERVER_PROCESS_PROCESS_EXIT_TIMEOUT              = "SERVER_PROCESS_PROCESS_EXIT_TIMEOUT"
    val GAME_SESSION_ACTIVATION_TIMEOUT                  = "GAME_SESSION_ACTIVATION_TIMEOUT"
    val FLEET_CREATION_EXTRACTING_BUILD                  = "FLEET_CREATION_EXTRACTING_BUILD"
    val FLEET_CREATION_RUNNING_INSTALLER                 = "FLEET_CREATION_RUNNING_INSTALLER"
    val FLEET_CREATION_VALIDATING_RUNTIME_CONFIG         = "FLEET_CREATION_VALIDATING_RUNTIME_CONFIG"
    val FLEET_VPC_PEERING_SUCCEEDED                      = "FLEET_VPC_PEERING_SUCCEEDED"
    val FLEET_VPC_PEERING_FAILED                         = "FLEET_VPC_PEERING_FAILED"
    val FLEET_VPC_PEERING_DELETED                        = "FLEET_VPC_PEERING_DELETED"
    val INSTANCE_INTERRUPTED                             = "INSTANCE_INTERRUPTED"

    val values = IndexedSeq(
      GENERIC_EVENT,
      FLEET_CREATED,
      FLEET_DELETED,
      FLEET_SCALING_EVENT,
      FLEET_STATE_DOWNLOADING,
      FLEET_STATE_VALIDATING,
      FLEET_STATE_BUILDING,
      FLEET_STATE_ACTIVATING,
      FLEET_STATE_ACTIVE,
      FLEET_STATE_ERROR,
      FLEET_INITIALIZATION_FAILED,
      FLEET_BINARY_DOWNLOAD_FAILED,
      FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND,
      FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE,
      FLEET_VALIDATION_TIMED_OUT,
      FLEET_ACTIVATION_FAILED,
      FLEET_ACTIVATION_FAILED_NO_INSTANCES,
      FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED,
      SERVER_PROCESS_INVALID_PATH,
      SERVER_PROCESS_SDK_INITIALIZATION_TIMEOUT,
      SERVER_PROCESS_PROCESS_READY_TIMEOUT,
      SERVER_PROCESS_CRASHED,
      SERVER_PROCESS_TERMINATED_UNHEALTHY,
      SERVER_PROCESS_FORCE_TERMINATED,
      SERVER_PROCESS_PROCESS_EXIT_TIMEOUT,
      GAME_SESSION_ACTIVATION_TIMEOUT,
      FLEET_CREATION_EXTRACTING_BUILD,
      FLEET_CREATION_RUNNING_INSTALLER,
      FLEET_CREATION_VALIDATING_RUNTIME_CONFIG,
      FLEET_VPC_PEERING_SUCCEEDED,
      FLEET_VPC_PEERING_FAILED,
      FLEET_VPC_PEERING_DELETED,
      INSTANCE_INTERRUPTED
    )
  }

  object FleetActionEnum {
    val AUTO_SCALING = "AUTO_SCALING"

    val values = IndexedSeq(AUTO_SCALING)
  }

  /**
    * General properties describing a fleet.
    * * <a>CreateFleet</a>
    *  * <a>ListFleets</a>
    *  * <a>DeleteFleet</a>
    *  * Describe fleets:
    * <li> <a>DescribeFleetAttributes</a>
    *  * <a>DescribeFleetCapacity</a>
    *  * <a>DescribeFleetPortSettings</a>
    *  * <a>DescribeFleetUtilization</a>
    *  * <a>DescribeRuntimeConfiguration</a>
    *  * <a>DescribeEC2InstanceLimits</a>
    *  * <a>DescribeFleetEvents</a>
    * </li> * Update fleets:
    * <li> <a>UpdateFleetAttributes</a>
    *  * <a>UpdateFleetCapacity</a>
    *  * <a>UpdateFleetPortSettings</a>
    *  * <a>UpdateRuntimeConfiguration</a>
    * </li> * Manage fleet actions:
    * <li> <a>StartFleetActions</a>
    *  * <a>StopFleetActions</a>
    * </li>
    */
  @js.native
  trait FleetAttributes extends js.Object {
    var BuildId: js.UndefOr[BuildId]
    var CreationTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[NonZeroAndMaxString]
    var FleetArn: js.UndefOr[ArnStringModel]
    var FleetId: js.UndefOr[FleetId]
    var FleetType: js.UndefOr[FleetType]
    var InstanceRoleArn: js.UndefOr[NonEmptyString]
    var InstanceType: js.UndefOr[EC2InstanceType]
    var LogPaths: js.UndefOr[StringList]
    var MetricGroups: js.UndefOr[MetricGroupList]
    var Name: js.UndefOr[NonZeroAndMaxString]
    var NewGameSessionProtectionPolicy: js.UndefOr[ProtectionPolicy]
    var OperatingSystem: js.UndefOr[OperatingSystem]
    var ResourceCreationLimitPolicy: js.UndefOr[ResourceCreationLimitPolicy]
    var ServerLaunchParameters: js.UndefOr[NonZeroAndMaxString]
    var ServerLaunchPath: js.UndefOr[NonZeroAndMaxString]
    var Status: js.UndefOr[FleetStatus]
    var StoppedActions: js.UndefOr[FleetActionList]
    var TerminationTime: js.UndefOr[Timestamp]
  }

  object FleetAttributes {
    def apply(
        BuildId: js.UndefOr[BuildId] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        FleetArn: js.UndefOr[ArnStringModel] = js.undefined,
        FleetId: js.UndefOr[FleetId] = js.undefined,
        FleetType: js.UndefOr[FleetType] = js.undefined,
        InstanceRoleArn: js.UndefOr[NonEmptyString] = js.undefined,
        InstanceType: js.UndefOr[EC2InstanceType] = js.undefined,
        LogPaths: js.UndefOr[StringList] = js.undefined,
        MetricGroups: js.UndefOr[MetricGroupList] = js.undefined,
        Name: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        NewGameSessionProtectionPolicy: js.UndefOr[ProtectionPolicy] = js.undefined,
        OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined,
        ResourceCreationLimitPolicy: js.UndefOr[ResourceCreationLimitPolicy] = js.undefined,
        ServerLaunchParameters: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        ServerLaunchPath: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        Status: js.UndefOr[FleetStatus] = js.undefined,
        StoppedActions: js.UndefOr[FleetActionList] = js.undefined,
        TerminationTime: js.UndefOr[Timestamp] = js.undefined
    ): FleetAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BuildId" -> BuildId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTime" -> CreationTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FleetArn" -> FleetArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FleetId" -> FleetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FleetType" -> FleetType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceRoleArn" -> InstanceRoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceType" -> InstanceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogPaths" -> LogPaths.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MetricGroups" -> MetricGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NewGameSessionProtectionPolicy" -> NewGameSessionProtectionPolicy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OperatingSystem" -> OperatingSystem.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceCreationLimitPolicy" -> ResourceCreationLimitPolicy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ServerLaunchParameters" -> ServerLaunchParameters.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ServerLaunchPath" -> ServerLaunchPath.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StoppedActions" -> StoppedActions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TerminationTime" -> TerminationTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FleetAttributes]
    }
  }

  /**
    * Information about the fleet's capacity. Fleet capacity is measured in EC2 instances. By default, new fleets have a capacity of one instance, but can be updated as needed. The maximum number of instances for a fleet is determined by the fleet's instance type.
    * * <a>CreateFleet</a>
    *  * <a>ListFleets</a>
    *  * <a>DeleteFleet</a>
    *  * Describe fleets:
    * <li> <a>DescribeFleetAttributes</a>
    *  * <a>DescribeFleetCapacity</a>
    *  * <a>DescribeFleetPortSettings</a>
    *  * <a>DescribeFleetUtilization</a>
    *  * <a>DescribeRuntimeConfiguration</a>
    *  * <a>DescribeEC2InstanceLimits</a>
    *  * <a>DescribeFleetEvents</a>
    * </li> * Update fleets:
    * <li> <a>UpdateFleetAttributes</a>
    *  * <a>UpdateFleetCapacity</a>
    *  * <a>UpdateFleetPortSettings</a>
    *  * <a>UpdateRuntimeConfiguration</a>
    * </li> * Manage fleet actions:
    * <li> <a>StartFleetActions</a>
    *  * <a>StopFleetActions</a>
    * </li>
    */
  @js.native
  trait FleetCapacity extends js.Object {
    var FleetId: js.UndefOr[FleetId]
    var InstanceCounts: js.UndefOr[EC2InstanceCounts]
    var InstanceType: js.UndefOr[EC2InstanceType]
  }

  object FleetCapacity {
    def apply(
        FleetId: js.UndefOr[FleetId] = js.undefined,
        InstanceCounts: js.UndefOr[EC2InstanceCounts] = js.undefined,
        InstanceType: js.UndefOr[EC2InstanceType] = js.undefined
    ): FleetCapacity = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceCounts" -> InstanceCounts.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceType" -> InstanceType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FleetCapacity]
    }
  }

  object FleetStatusEnum {
    val NEW         = "NEW"
    val DOWNLOADING = "DOWNLOADING"
    val VALIDATING  = "VALIDATING"
    val BUILDING    = "BUILDING"
    val ACTIVATING  = "ACTIVATING"
    val ACTIVE      = "ACTIVE"
    val DELETING    = "DELETING"
    val ERROR       = "ERROR"
    val TERMINATED  = "TERMINATED"

    val values = IndexedSeq(NEW, DOWNLOADING, VALIDATING, BUILDING, ACTIVATING, ACTIVE, DELETING, ERROR, TERMINATED)
  }

  object FleetTypeEnum {
    val ON_DEMAND = "ON_DEMAND"
    val SPOT      = "SPOT"

    val values = IndexedSeq(ON_DEMAND, SPOT)
  }

  /**
    * Current status of fleet utilization, including the number of game and player sessions being hosted.
    * * <a>CreateFleet</a>
    *  * <a>ListFleets</a>
    *  * <a>DeleteFleet</a>
    *  * Describe fleets:
    * <li> <a>DescribeFleetAttributes</a>
    *  * <a>DescribeFleetCapacity</a>
    *  * <a>DescribeFleetPortSettings</a>
    *  * <a>DescribeFleetUtilization</a>
    *  * <a>DescribeRuntimeConfiguration</a>
    *  * <a>DescribeEC2InstanceLimits</a>
    *  * <a>DescribeFleetEvents</a>
    * </li> * Update fleets:
    * <li> <a>UpdateFleetAttributes</a>
    *  * <a>UpdateFleetCapacity</a>
    *  * <a>UpdateFleetPortSettings</a>
    *  * <a>UpdateRuntimeConfiguration</a>
    * </li> * Manage fleet actions:
    * <li> <a>StartFleetActions</a>
    *  * <a>StopFleetActions</a>
    * </li>
    */
  @js.native
  trait FleetUtilization extends js.Object {
    var ActiveGameSessionCount: js.UndefOr[WholeNumber]
    var ActiveServerProcessCount: js.UndefOr[WholeNumber]
    var CurrentPlayerSessionCount: js.UndefOr[WholeNumber]
    var FleetId: js.UndefOr[FleetId]
    var MaximumPlayerSessionCount: js.UndefOr[WholeNumber]
  }

  object FleetUtilization {
    def apply(
        ActiveGameSessionCount: js.UndefOr[WholeNumber] = js.undefined,
        ActiveServerProcessCount: js.UndefOr[WholeNumber] = js.undefined,
        CurrentPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined,
        FleetId: js.UndefOr[FleetId] = js.undefined,
        MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined
    ): FleetUtilization = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ActiveGameSessionCount" -> ActiveGameSessionCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ActiveServerProcessCount" -> ActiveServerProcessCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CurrentPlayerSessionCount" -> CurrentPlayerSessionCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FleetId" -> FleetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaximumPlayerSessionCount" -> MaximumPlayerSessionCount.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FleetUtilization]
    }
  }

  /**
    * Set of key-value pairs that contain information about a game session. When included in a game session request, these properties communicate details to be used when setting up the new game session, such as to specify a game mode, level, or map. Game properties are passed to the game server process when initiating a new game session; the server process uses the properties as appropriate. For more information, see the [[https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-client-api.html#gamelift-sdk-client-api-create| Amazon GameLift Developer Guide]].
    */
  @js.native
  trait GameProperty extends js.Object {
    var Key: GamePropertyKey
    var Value: GamePropertyValue
  }

  object GameProperty {
    def apply(
        Key: GamePropertyKey,
        Value: GamePropertyValue
    ): GameProperty = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key"   -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GameProperty]
    }
  }

  /**
    * Properties describing a game session.
    *  A game session in ACTIVE status can host players. When a game session ends, its status is set to <code>TERMINATED</code>.
    *  Once the session ends, the game session object is retained for 30 days. This means you can reuse idempotency token values after this time. Game session logs are retained for 14 days.
    * * <a>CreateGameSession</a>
    *  * <a>DescribeGameSessions</a>
    *  * <a>DescribeGameSessionDetails</a>
    *  * <a>SearchGameSessions</a>
    *  * <a>UpdateGameSession</a>
    *  * <a>GetGameSessionLogUrl</a>
    *  * Game session placements
    * <li> <a>StartGameSessionPlacement</a>
    *  * <a>DescribeGameSessionPlacement</a>
    *  * <a>StopGameSessionPlacement</a>
    * </li>
    */
  @js.native
  trait GameSession extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var CreatorId: js.UndefOr[NonZeroAndMaxString]
    var CurrentPlayerSessionCount: js.UndefOr[WholeNumber]
    var FleetId: js.UndefOr[FleetId]
    var GameProperties: js.UndefOr[GamePropertyList]
    var GameSessionData: js.UndefOr[GameSessionData]
    var GameSessionId: js.UndefOr[NonZeroAndMaxString]
    var IpAddress: js.UndefOr[IpAddress]
    var MatchmakerData: js.UndefOr[MatchmakerData]
    var MaximumPlayerSessionCount: js.UndefOr[WholeNumber]
    var Name: js.UndefOr[NonZeroAndMaxString]
    var PlayerSessionCreationPolicy: js.UndefOr[PlayerSessionCreationPolicy]
    var Port: js.UndefOr[PortNumber]
    var Status: js.UndefOr[GameSessionStatus]
    var StatusReason: js.UndefOr[GameSessionStatusReason]
    var TerminationTime: js.UndefOr[Timestamp]
  }

  object GameSession {
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        CreatorId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        CurrentPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined,
        FleetId: js.UndefOr[FleetId] = js.undefined,
        GameProperties: js.UndefOr[GamePropertyList] = js.undefined,
        GameSessionData: js.UndefOr[GameSessionData] = js.undefined,
        GameSessionId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        IpAddress: js.UndefOr[IpAddress] = js.undefined,
        MatchmakerData: js.UndefOr[MatchmakerData] = js.undefined,
        MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined,
        Name: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        PlayerSessionCreationPolicy: js.UndefOr[PlayerSessionCreationPolicy] = js.undefined,
        Port: js.UndefOr[PortNumber] = js.undefined,
        Status: js.UndefOr[GameSessionStatus] = js.undefined,
        StatusReason: js.UndefOr[GameSessionStatusReason] = js.undefined,
        TerminationTime: js.UndefOr[Timestamp] = js.undefined
    ): GameSession = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTime" -> CreationTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreatorId" -> CreatorId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CurrentPlayerSessionCount" -> CurrentPlayerSessionCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FleetId" -> FleetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GameProperties" -> GameProperties.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GameSessionData" -> GameSessionData.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GameSessionId" -> GameSessionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IpAddress" -> IpAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MatchmakerData" -> MatchmakerData.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaximumPlayerSessionCount" -> MaximumPlayerSessionCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlayerSessionCreationPolicy" -> PlayerSessionCreationPolicy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Port" -> Port.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StatusReason" -> StatusReason.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TerminationTime" -> TerminationTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GameSession]
    }
  }

  /**
    * Connection information for the new game session that is created with matchmaking. (with <a>StartMatchmaking</a>). Once a match is set, the FlexMatch engine places the match and creates a new game session for it. This information, including the game session endpoint and player sessions for each player in the original matchmaking request, is added to the <a>MatchmakingTicket</a>, which can be retrieved by calling <a>DescribeMatchmaking</a>.
    */
  @js.native
  trait GameSessionConnectionInfo extends js.Object {
    var GameSessionArn: js.UndefOr[ArnStringModel]
    var IpAddress: js.UndefOr[StringModel]
    var MatchedPlayerSessions: js.UndefOr[MatchedPlayerSessionList]
    var Port: js.UndefOr[PositiveInteger]
  }

  object GameSessionConnectionInfo {
    def apply(
        GameSessionArn: js.UndefOr[ArnStringModel] = js.undefined,
        IpAddress: js.UndefOr[StringModel] = js.undefined,
        MatchedPlayerSessions: js.UndefOr[MatchedPlayerSessionList] = js.undefined,
        Port: js.UndefOr[PositiveInteger] = js.undefined
    ): GameSessionConnectionInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSessionArn" -> GameSessionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IpAddress" -> IpAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MatchedPlayerSessions" -> MatchedPlayerSessions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Port" -> Port.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GameSessionConnectionInfo]
    }
  }

  /**
    * A game session's properties plus the protection policy currently in force.
    */
  @js.native
  trait GameSessionDetail extends js.Object {
    var GameSession: js.UndefOr[GameSession]
    var ProtectionPolicy: js.UndefOr[ProtectionPolicy]
  }

  object GameSessionDetail {
    def apply(
        GameSession: js.UndefOr[GameSession] = js.undefined,
        ProtectionPolicy: js.UndefOr[ProtectionPolicy] = js.undefined
    ): GameSessionDetail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSession" -> GameSession.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProtectionPolicy" -> ProtectionPolicy.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GameSessionDetail]
    }
  }

  /**
    * Object that describes a <a>StartGameSessionPlacement</a> request. This object includes the full details of the original request plus the current status and start/end time stamps.
    *  Game session placement-related operations include:
    * * <a>StartGameSessionPlacement</a>
    *  * <a>DescribeGameSessionPlacement</a>
    *  * <a>StopGameSessionPlacement</a>
    */
  @js.native
  trait GameSessionPlacement extends js.Object {
    var EndTime: js.UndefOr[Timestamp]
    var GameProperties: js.UndefOr[GamePropertyList]
    var GameSessionArn: js.UndefOr[NonZeroAndMaxString]
    var GameSessionData: js.UndefOr[GameSessionData]
    var GameSessionId: js.UndefOr[NonZeroAndMaxString]
    var GameSessionName: js.UndefOr[NonZeroAndMaxString]
    var GameSessionQueueName: js.UndefOr[GameSessionQueueName]
    var GameSessionRegion: js.UndefOr[NonZeroAndMaxString]
    var IpAddress: js.UndefOr[IpAddress]
    var MatchmakerData: js.UndefOr[MatchmakerData]
    var MaximumPlayerSessionCount: js.UndefOr[WholeNumber]
    var PlacedPlayerSessions: js.UndefOr[PlacedPlayerSessionList]
    var PlacementId: js.UndefOr[IdStringModel]
    var PlayerLatencies: js.UndefOr[PlayerLatencyList]
    var Port: js.UndefOr[PortNumber]
    var StartTime: js.UndefOr[Timestamp]
    var Status: js.UndefOr[GameSessionPlacementState]
  }

  object GameSessionPlacement {
    def apply(
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        GameProperties: js.UndefOr[GamePropertyList] = js.undefined,
        GameSessionArn: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        GameSessionData: js.UndefOr[GameSessionData] = js.undefined,
        GameSessionId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        GameSessionName: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        GameSessionQueueName: js.UndefOr[GameSessionQueueName] = js.undefined,
        GameSessionRegion: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        IpAddress: js.UndefOr[IpAddress] = js.undefined,
        MatchmakerData: js.UndefOr[MatchmakerData] = js.undefined,
        MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined,
        PlacedPlayerSessions: js.UndefOr[PlacedPlayerSessionList] = js.undefined,
        PlacementId: js.UndefOr[IdStringModel] = js.undefined,
        PlayerLatencies: js.UndefOr[PlayerLatencyList] = js.undefined,
        Port: js.UndefOr[PortNumber] = js.undefined,
        StartTime: js.UndefOr[Timestamp] = js.undefined,
        Status: js.UndefOr[GameSessionPlacementState] = js.undefined
    ): GameSessionPlacement = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndTime" -> EndTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GameProperties" -> GameProperties.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GameSessionArn" -> GameSessionArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GameSessionData" -> GameSessionData.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GameSessionId" -> GameSessionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GameSessionName" -> GameSessionName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GameSessionQueueName" -> GameSessionQueueName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GameSessionRegion" -> GameSessionRegion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IpAddress" -> IpAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MatchmakerData" -> MatchmakerData.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaximumPlayerSessionCount" -> MaximumPlayerSessionCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlacedPlayerSessions" -> PlacedPlayerSessions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlacementId" -> PlacementId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlayerLatencies" -> PlayerLatencies.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Port" -> Port.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartTime" -> StartTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GameSessionPlacement]
    }
  }

  object GameSessionPlacementStateEnum {
    val PENDING   = "PENDING"
    val FULFILLED = "FULFILLED"
    val CANCELLED = "CANCELLED"
    val TIMED_OUT = "TIMED_OUT"

    val values = IndexedSeq(PENDING, FULFILLED, CANCELLED, TIMED_OUT)
  }

  /**
    * Configuration of a queue that is used to process game session placement requests. The queue configuration identifies several game features:
    * * The destinations where a new game session can potentially be hosted. Amazon GameLift tries these destinations in an order based on either the queue's default order or player latency information, if provided in a placement request. With latency information, Amazon GameLift can place game sessions where the majority of players are reporting the lowest possible latency.
    *  * The length of time that placement requests can wait in the queue before timing out.
    *  * A set of optional latency policies that protect individual players from high latencies, preventing game sessions from being placed where any individual player is reporting latency higher than a policy's maximum.
    * * <a>CreateGameSessionQueue</a>
    *  * <a>DescribeGameSessionQueues</a>
    *  * <a>UpdateGameSessionQueue</a>
    *  * <a>DeleteGameSessionQueue</a>
    */
  @js.native
  trait GameSessionQueue extends js.Object {
    var Destinations: js.UndefOr[GameSessionQueueDestinationList]
    var GameSessionQueueArn: js.UndefOr[ArnStringModel]
    var Name: js.UndefOr[GameSessionQueueName]
    var PlayerLatencyPolicies: js.UndefOr[PlayerLatencyPolicyList]
    var TimeoutInSeconds: js.UndefOr[WholeNumber]
  }

  object GameSessionQueue {
    def apply(
        Destinations: js.UndefOr[GameSessionQueueDestinationList] = js.undefined,
        GameSessionQueueArn: js.UndefOr[ArnStringModel] = js.undefined,
        Name: js.UndefOr[GameSessionQueueName] = js.undefined,
        PlayerLatencyPolicies: js.UndefOr[PlayerLatencyPolicyList] = js.undefined,
        TimeoutInSeconds: js.UndefOr[WholeNumber] = js.undefined
    ): GameSessionQueue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Destinations" -> Destinations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GameSessionQueueArn" -> GameSessionQueueArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlayerLatencyPolicies" -> PlayerLatencyPolicies.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimeoutInSeconds" -> TimeoutInSeconds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GameSessionQueue]
    }
  }

  /**
    * Fleet designated in a game session queue. Requests for new game sessions in the queue are fulfilled by starting a new game session on any destination configured for a queue.
    * * <a>CreateGameSessionQueue</a>
    *  * <a>DescribeGameSessionQueues</a>
    *  * <a>UpdateGameSessionQueue</a>
    *  * <a>DeleteGameSessionQueue</a>
    */
  @js.native
  trait GameSessionQueueDestination extends js.Object {
    var DestinationArn: js.UndefOr[ArnStringModel]
  }

  object GameSessionQueueDestination {
    def apply(
        DestinationArn: js.UndefOr[ArnStringModel] = js.undefined
    ): GameSessionQueueDestination = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DestinationArn" -> DestinationArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GameSessionQueueDestination]
    }
  }

  object GameSessionStatusEnum {
    val ACTIVE      = "ACTIVE"
    val ACTIVATING  = "ACTIVATING"
    val TERMINATED  = "TERMINATED"
    val TERMINATING = "TERMINATING"
    val ERROR       = "ERROR"

    val values = IndexedSeq(ACTIVE, ACTIVATING, TERMINATED, TERMINATING, ERROR)
  }

  object GameSessionStatusReasonEnum {
    val INTERRUPTED = "INTERRUPTED"

    val values = IndexedSeq(INTERRUPTED)
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait GetGameSessionLogUrlInput extends js.Object {
    var GameSessionId: ArnStringModel
  }

  object GetGameSessionLogUrlInput {
    def apply(
        GameSessionId: ArnStringModel
    ): GetGameSessionLogUrlInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSessionId" -> GameSessionId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGameSessionLogUrlInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait GetGameSessionLogUrlOutput extends js.Object {
    var PreSignedUrl: js.UndefOr[NonZeroAndMaxString]
  }

  object GetGameSessionLogUrlOutput {
    def apply(
        PreSignedUrl: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): GetGameSessionLogUrlOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PreSignedUrl" -> PreSignedUrl.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGameSessionLogUrlOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait GetInstanceAccessInput extends js.Object {
    var FleetId: FleetId
    var InstanceId: InstanceId
  }

  object GetInstanceAccessInput {
    def apply(
        FleetId: FleetId,
        InstanceId: InstanceId
    ): GetInstanceAccessInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId"    -> FleetId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceAccessInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait GetInstanceAccessOutput extends js.Object {
    var InstanceAccess: js.UndefOr[InstanceAccess]
  }

  object GetInstanceAccessOutput {
    def apply(
        InstanceAccess: js.UndefOr[InstanceAccess] = js.undefined
    ): GetInstanceAccessOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "InstanceAccess" -> InstanceAccess.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceAccessOutput]
    }
  }

  /**
    * Properties that describe an instance of a virtual computing resource that hosts one or more game servers. A fleet may contain zero or more instances.
    */
  @js.native
  trait Instance extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var FleetId: js.UndefOr[FleetId]
    var InstanceId: js.UndefOr[InstanceId]
    var IpAddress: js.UndefOr[IpAddress]
    var OperatingSystem: js.UndefOr[OperatingSystem]
    var Status: js.UndefOr[InstanceStatus]
    var Type: js.UndefOr[EC2InstanceType]
  }

  object Instance {
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        FleetId: js.UndefOr[FleetId] = js.undefined,
        InstanceId: js.UndefOr[InstanceId] = js.undefined,
        IpAddress: js.UndefOr[IpAddress] = js.undefined,
        OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined,
        Status: js.UndefOr[InstanceStatus] = js.undefined,
        Type: js.UndefOr[EC2InstanceType] = js.undefined
    ): Instance = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTime" -> CreationTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FleetId" -> FleetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceId" -> InstanceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IpAddress" -> IpAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OperatingSystem" -> OperatingSystem.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Instance]
    }
  }

  /**
    * Information required to remotely connect to a fleet instance. Access is requested by calling <a>GetInstanceAccess</a>.
    */
  @js.native
  trait InstanceAccess extends js.Object {
    var Credentials: js.UndefOr[InstanceCredentials]
    var FleetId: js.UndefOr[FleetId]
    var InstanceId: js.UndefOr[InstanceId]
    var IpAddress: js.UndefOr[IpAddress]
    var OperatingSystem: js.UndefOr[OperatingSystem]
  }

  object InstanceAccess {
    def apply(
        Credentials: js.UndefOr[InstanceCredentials] = js.undefined,
        FleetId: js.UndefOr[FleetId] = js.undefined,
        InstanceId: js.UndefOr[InstanceId] = js.undefined,
        IpAddress: js.UndefOr[IpAddress] = js.undefined,
        OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined
    ): InstanceAccess = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Credentials" -> Credentials.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FleetId" -> FleetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InstanceId" -> InstanceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IpAddress" -> IpAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OperatingSystem" -> OperatingSystem.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceAccess]
    }
  }

  /**
    * Set of credentials required to remotely access a fleet instance. Access credentials are requested by calling <a>GetInstanceAccess</a> and returned in an <a>InstanceAccess</a> object.
    */
  @js.native
  trait InstanceCredentials extends js.Object {
    var Secret: js.UndefOr[NonEmptyString]
    var UserName: js.UndefOr[NonEmptyString]
  }

  object InstanceCredentials {
    def apply(
        Secret: js.UndefOr[NonEmptyString] = js.undefined,
        UserName: js.UndefOr[NonEmptyString] = js.undefined
    ): InstanceCredentials = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Secret" -> Secret.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UserName" -> UserName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceCredentials]
    }
  }

  object InstanceStatusEnum {
    val PENDING     = "PENDING"
    val ACTIVE      = "ACTIVE"
    val TERMINATING = "TERMINATING"

    val values = IndexedSeq(PENDING, ACTIVE, TERMINATING)
  }

  /**
    * A range of IP addresses and port settings that allow inbound traffic to connect to server processes on Amazon GameLift. Each game session hosted on a fleet is assigned a unique combination of IP address and port number, which must fall into the fleet's allowed ranges. This combination is included in the <a>GameSession</a> object.
    */
  @js.native
  trait IpPermission extends js.Object {
    var FromPort: PortNumber
    var IpRange: NonBlankString
    var Protocol: IpProtocol
    var ToPort: PortNumber
  }

  object IpPermission {
    def apply(
        FromPort: PortNumber,
        IpRange: NonBlankString,
        Protocol: IpProtocol,
        ToPort: PortNumber
    ): IpPermission = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FromPort" -> FromPort.asInstanceOf[js.Any],
        "IpRange"  -> IpRange.asInstanceOf[js.Any],
        "Protocol" -> Protocol.asInstanceOf[js.Any],
        "ToPort"   -> ToPort.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IpPermission]
    }
  }

  object IpProtocolEnum {
    val TCP = "TCP"
    val UDP = "UDP"

    val values = IndexedSeq(TCP, UDP)
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait ListAliasesInput extends js.Object {
    var Limit: js.UndefOr[PositiveInteger]
    var Name: js.UndefOr[NonEmptyString]
    var NextToken: js.UndefOr[NonEmptyString]
    var RoutingStrategyType: js.UndefOr[RoutingStrategyType]
  }

  object ListAliasesInput {
    def apply(
        Limit: js.UndefOr[PositiveInteger] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        NextToken: js.UndefOr[NonEmptyString] = js.undefined,
        RoutingStrategyType: js.UndefOr[RoutingStrategyType] = js.undefined
    ): ListAliasesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoutingStrategyType" -> RoutingStrategyType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAliasesInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait ListAliasesOutput extends js.Object {
    var Aliases: js.UndefOr[AliasList]
    var NextToken: js.UndefOr[NonEmptyString]
  }

  object ListAliasesOutput {
    def apply(
        Aliases: js.UndefOr[AliasList] = js.undefined,
        NextToken: js.UndefOr[NonEmptyString] = js.undefined
    ): ListAliasesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Aliases" -> Aliases.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAliasesOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait ListBuildsInput extends js.Object {
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[BuildStatus]
  }

  object ListBuildsInput {
    def apply(
        Limit: js.UndefOr[PositiveInteger] = js.undefined,
        NextToken: js.UndefOr[NonEmptyString] = js.undefined,
        Status: js.UndefOr[BuildStatus] = js.undefined
    ): ListBuildsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Limit" -> Limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBuildsInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait ListBuildsOutput extends js.Object {
    var Builds: js.UndefOr[BuildList]
    var NextToken: js.UndefOr[NonEmptyString]
  }

  object ListBuildsOutput {
    def apply(
        Builds: js.UndefOr[BuildList] = js.undefined,
        NextToken: js.UndefOr[NonEmptyString] = js.undefined
    ): ListBuildsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Builds" -> Builds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListBuildsOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait ListFleetsInput extends js.Object {
    var BuildId: js.UndefOr[BuildId]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object ListFleetsInput {
    def apply(
        BuildId: js.UndefOr[BuildId] = js.undefined,
        Limit: js.UndefOr[PositiveInteger] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): ListFleetsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BuildId" -> BuildId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Limit" -> Limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFleetsInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait ListFleetsOutput extends js.Object {
    var FleetIds: js.UndefOr[FleetIdList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object ListFleetsOutput {
    def apply(
        FleetIds: js.UndefOr[FleetIdList] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): ListFleetsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetIds" -> FleetIds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFleetsOutput]
    }
  }

  /**
    * Represents a new player session that is created as a result of a successful FlexMatch match. A successful match automatically creates new player sessions for every player ID in the original matchmaking request.
    *  When players connect to the match's game session, they must include both player ID and player session ID in order to claim their assigned player slot.
    */
  @js.native
  trait MatchedPlayerSession extends js.Object {
    var PlayerId: js.UndefOr[NonZeroAndMaxString]
    var PlayerSessionId: js.UndefOr[PlayerSessionId]
  }

  object MatchedPlayerSession {
    def apply(
        PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        PlayerSessionId: js.UndefOr[PlayerSessionId] = js.undefined
    ): MatchedPlayerSession = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PlayerId" -> PlayerId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlayerSessionId" -> PlayerSessionId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MatchedPlayerSession]
    }
  }

  /**
    * Guidelines for use with FlexMatch to match players into games. All matchmaking requests must specify a matchmaking configuration.
    */
  @js.native
  trait MatchmakingConfiguration extends js.Object {
    var AcceptanceRequired: js.UndefOr[BooleanModel]
    var AcceptanceTimeoutSeconds: js.UndefOr[MatchmakingAcceptanceTimeoutInteger]
    var AdditionalPlayerCount: js.UndefOr[WholeNumber]
    var CreationTime: js.UndefOr[Timestamp]
    var CustomEventData: js.UndefOr[CustomEventData]
    var Description: js.UndefOr[NonZeroAndMaxString]
    var GameProperties: js.UndefOr[GamePropertyList]
    var GameSessionData: js.UndefOr[GameSessionData]
    var GameSessionQueueArns: js.UndefOr[QueueArnsList]
    var Name: js.UndefOr[MatchmakingIdStringModel]
    var NotificationTarget: js.UndefOr[SnsArnStringModel]
    var RequestTimeoutSeconds: js.UndefOr[MatchmakingRequestTimeoutInteger]
    var RuleSetName: js.UndefOr[MatchmakingIdStringModel]
  }

  object MatchmakingConfiguration {
    def apply(
        AcceptanceRequired: js.UndefOr[BooleanModel] = js.undefined,
        AcceptanceTimeoutSeconds: js.UndefOr[MatchmakingAcceptanceTimeoutInteger] = js.undefined,
        AdditionalPlayerCount: js.UndefOr[WholeNumber] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        CustomEventData: js.UndefOr[CustomEventData] = js.undefined,
        Description: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        GameProperties: js.UndefOr[GamePropertyList] = js.undefined,
        GameSessionData: js.UndefOr[GameSessionData] = js.undefined,
        GameSessionQueueArns: js.UndefOr[QueueArnsList] = js.undefined,
        Name: js.UndefOr[MatchmakingIdStringModel] = js.undefined,
        NotificationTarget: js.UndefOr[SnsArnStringModel] = js.undefined,
        RequestTimeoutSeconds: js.UndefOr[MatchmakingRequestTimeoutInteger] = js.undefined,
        RuleSetName: js.UndefOr[MatchmakingIdStringModel] = js.undefined
    ): MatchmakingConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AcceptanceRequired" -> AcceptanceRequired.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AcceptanceTimeoutSeconds" -> AcceptanceTimeoutSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AdditionalPlayerCount" -> AdditionalPlayerCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreationTime" -> CreationTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomEventData" -> CustomEventData.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GameProperties" -> GameProperties.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GameSessionData" -> GameSessionData.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GameSessionQueueArns" -> GameSessionQueueArns.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NotificationTarget" -> NotificationTarget.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RequestTimeoutSeconds" -> RequestTimeoutSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RuleSetName" -> RuleSetName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MatchmakingConfiguration]
    }
  }

  object MatchmakingConfigurationStatusEnum {
    val CANCELLED           = "CANCELLED"
    val COMPLETED           = "COMPLETED"
    val FAILED              = "FAILED"
    val PLACING             = "PLACING"
    val QUEUED              = "QUEUED"
    val REQUIRES_ACCEPTANCE = "REQUIRES_ACCEPTANCE"
    val SEARCHING           = "SEARCHING"
    val TIMED_OUT           = "TIMED_OUT"

    val values = IndexedSeq(CANCELLED, COMPLETED, FAILED, PLACING, QUEUED, REQUIRES_ACCEPTANCE, SEARCHING, TIMED_OUT)
  }

  /**
    * Set of rule statements, used with FlexMatch, that determine how to build a certain kind of player match. Each rule set describes a type of group to be created and defines the parameters for acceptable player matches. Rule sets are used in <a>MatchmakingConfiguration</a> objects.
    *  A rule set may define the following elements for a match. For detailed information and examples showing how to construct a rule set, see [[https://docs.aws.amazon.com/gamelift/latest/developerguide/match-rulesets.html|Build a FlexMatch Rule Set]].
    * * Teams -- Required. A rule set must define one or multiple teams for the match and set minimum and maximum team sizes. For example, a rule set might describe a 4x4 match that requires all eight slots to be filled.
    *  * Player attributes -- Optional. These attributes specify a set of player characteristics to evaluate when looking for a match. Matchmaking requests that use a rule set with player attributes must provide the corresponding attribute values. For example, an attribute might specify a player's skill or level.
    *  * Rules -- Optional. Rules define how to evaluate potential players for a match based on player attributes. A rule might specify minimum requirements for individual players, teams, or entire matches. For example, a rule might require each player to meet a certain skill level, each team to have at least one player in a certain role, or the match to have a minimum average skill level. or may describe an entire group--such as all teams must be evenly matched or have at least one player in a certain role.
    *  * Expansions -- Optional. Expansions allow you to relax the rules after a period of time when no acceptable matches are found. This feature lets you balance getting players into games in a reasonable amount of time instead of making them wait indefinitely for the best possible match. For example, you might use an expansion to increase the maximum skill variance between players after 30 seconds.
    */
  @js.native
  trait MatchmakingRuleSet extends js.Object {
    var RuleSetBody: RuleSetBody
    var CreationTime: js.UndefOr[Timestamp]
    var RuleSetName: js.UndefOr[MatchmakingIdStringModel]
  }

  object MatchmakingRuleSet {
    def apply(
        RuleSetBody: RuleSetBody,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        RuleSetName: js.UndefOr[MatchmakingIdStringModel] = js.undefined
    ): MatchmakingRuleSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleSetBody" -> RuleSetBody.asInstanceOf[js.Any],
        "CreationTime" -> CreationTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RuleSetName" -> RuleSetName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MatchmakingRuleSet]
    }
  }

  /**
    * Ticket generated to track the progress of a matchmaking request. Each ticket is uniquely identified by a ticket ID, supplied by the requester, when creating a matchmaking request with <a>StartMatchmaking</a>. Tickets can be retrieved by calling <a>DescribeMatchmaking</a> with the ticket ID.
    */
  @js.native
  trait MatchmakingTicket extends js.Object {
    var ConfigurationName: js.UndefOr[MatchmakingIdStringModel]
    var EndTime: js.UndefOr[Timestamp]
    var EstimatedWaitTime: js.UndefOr[WholeNumber]
    var GameSessionConnectionInfo: js.UndefOr[GameSessionConnectionInfo]
    var Players: js.UndefOr[PlayerList]
    var StartTime: js.UndefOr[Timestamp]
    var Status: js.UndefOr[MatchmakingConfigurationStatus]
    var StatusMessage: js.UndefOr[StringModel]
    var StatusReason: js.UndefOr[StringModel]
    var TicketId: js.UndefOr[MatchmakingIdStringModel]
  }

  object MatchmakingTicket {
    def apply(
        ConfigurationName: js.UndefOr[MatchmakingIdStringModel] = js.undefined,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        EstimatedWaitTime: js.UndefOr[WholeNumber] = js.undefined,
        GameSessionConnectionInfo: js.UndefOr[GameSessionConnectionInfo] = js.undefined,
        Players: js.UndefOr[PlayerList] = js.undefined,
        StartTime: js.UndefOr[Timestamp] = js.undefined,
        Status: js.UndefOr[MatchmakingConfigurationStatus] = js.undefined,
        StatusMessage: js.UndefOr[StringModel] = js.undefined,
        StatusReason: js.UndefOr[StringModel] = js.undefined,
        TicketId: js.UndefOr[MatchmakingIdStringModel] = js.undefined
    ): MatchmakingTicket = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationName" -> ConfigurationName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EndTime" -> EndTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EstimatedWaitTime" -> EstimatedWaitTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GameSessionConnectionInfo" -> GameSessionConnectionInfo.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Players" -> Players.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartTime" -> StartTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StatusMessage" -> StatusMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StatusReason" -> StatusReason.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TicketId" -> TicketId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MatchmakingTicket]
    }
  }

  object MetricNameEnum {
    val ActivatingGameSessions       = "ActivatingGameSessions"
    val ActiveGameSessions           = "ActiveGameSessions"
    val ActiveInstances              = "ActiveInstances"
    val AvailableGameSessions        = "AvailableGameSessions"
    val AvailablePlayerSessions      = "AvailablePlayerSessions"
    val CurrentPlayerSessions        = "CurrentPlayerSessions"
    val IdleInstances                = "IdleInstances"
    val PercentAvailableGameSessions = "PercentAvailableGameSessions"
    val PercentIdleInstances         = "PercentIdleInstances"
    val QueueDepth                   = "QueueDepth"
    val WaitTime                     = "WaitTime"

    val values = IndexedSeq(
      ActivatingGameSessions,
      ActiveGameSessions,
      ActiveInstances,
      AvailableGameSessions,
      AvailablePlayerSessions,
      CurrentPlayerSessions,
      IdleInstances,
      PercentAvailableGameSessions,
      PercentIdleInstances,
      QueueDepth,
      WaitTime
    )
  }

  object OperatingSystemEnum {
    val WINDOWS_2012 = "WINDOWS_2012"
    val AMAZON_LINUX = "AMAZON_LINUX"

    val values = IndexedSeq(WINDOWS_2012, AMAZON_LINUX)
  }

  /**
    * Information about a player session that was created as part of a <a>StartGameSessionPlacement</a> request. This object contains only the player ID and player session ID. To retrieve full details on a player session, call <a>DescribePlayerSessions</a> with the player session ID.
    * * <a>CreatePlayerSession</a>
    *  * <a>CreatePlayerSessions</a>
    *  * <a>DescribePlayerSessions</a>
    *  * Game session placements
    * <li> <a>StartGameSessionPlacement</a>
    *  * <a>DescribeGameSessionPlacement</a>
    *  * <a>StopGameSessionPlacement</a>
    * </li>
    */
  @js.native
  trait PlacedPlayerSession extends js.Object {
    var PlayerId: js.UndefOr[NonZeroAndMaxString]
    var PlayerSessionId: js.UndefOr[PlayerSessionId]
  }

  object PlacedPlayerSession {
    def apply(
        PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        PlayerSessionId: js.UndefOr[PlayerSessionId] = js.undefined
    ): PlacedPlayerSession = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PlayerId" -> PlayerId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlayerSessionId" -> PlayerSessionId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PlacedPlayerSession]
    }
  }

  /**
    * Represents a player in matchmaking. When starting a matchmaking request, a player has a player ID, attributes, and may have latency data. Team information is added after a match has been successfully completed.
    */
  @js.native
  trait Player extends js.Object {
    var LatencyInMs: js.UndefOr[LatencyMap]
    var PlayerAttributes: js.UndefOr[PlayerAttributeMap]
    var PlayerId: js.UndefOr[NonZeroAndMaxString]
    var Team: js.UndefOr[NonZeroAndMaxString]
  }

  object Player {
    def apply(
        LatencyInMs: js.UndefOr[LatencyMap] = js.undefined,
        PlayerAttributes: js.UndefOr[PlayerAttributeMap] = js.undefined,
        PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        Team: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): Player = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LatencyInMs" -> LatencyInMs.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlayerAttributes" -> PlayerAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlayerId" -> PlayerId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Team" -> Team.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Player]
    }
  }

  /**
    * Regional latency information for a player, used when requesting a new game session with <a>StartGameSessionPlacement</a>. This value indicates the amount of time lag that exists when the player is connected to a fleet in the specified region. The relative difference between a player's latency values for multiple regions are used to determine which fleets are best suited to place a new game session for the player.
    */
  @js.native
  trait PlayerLatency extends js.Object {
    var LatencyInMilliseconds: js.UndefOr[Float]
    var PlayerId: js.UndefOr[NonZeroAndMaxString]
    var RegionIdentifier: js.UndefOr[NonZeroAndMaxString]
  }

  object PlayerLatency {
    def apply(
        LatencyInMilliseconds: js.UndefOr[Float] = js.undefined,
        PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        RegionIdentifier: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): PlayerLatency = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LatencyInMilliseconds" -> LatencyInMilliseconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlayerId" -> PlayerId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RegionIdentifier" -> RegionIdentifier.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PlayerLatency]
    }
  }

  /**
    * Queue setting that determines the highest latency allowed for individual players when placing a game session. When a latency policy is in force, a game session cannot be placed at any destination in a region where a player is reporting latency higher than the cap. Latency policies are only enforced when the placement request contains player latency information.
    * * <a>CreateGameSessionQueue</a>
    *  * <a>DescribeGameSessionQueues</a>
    *  * <a>UpdateGameSessionQueue</a>
    *  * <a>DeleteGameSessionQueue</a>
    */
  @js.native
  trait PlayerLatencyPolicy extends js.Object {
    var MaximumIndividualPlayerLatencyMilliseconds: js.UndefOr[WholeNumber]
    var PolicyDurationSeconds: js.UndefOr[WholeNumber]
  }

  object PlayerLatencyPolicy {
    def apply(
        MaximumIndividualPlayerLatencyMilliseconds: js.UndefOr[WholeNumber] = js.undefined,
        PolicyDurationSeconds: js.UndefOr[WholeNumber] = js.undefined
    ): PlayerLatencyPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaximumIndividualPlayerLatencyMilliseconds" -> MaximumIndividualPlayerLatencyMilliseconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PolicyDurationSeconds" -> PolicyDurationSeconds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PlayerLatencyPolicy]
    }
  }

  /**
    * Properties describing a player session. Player session objects are created either by creating a player session for a specific game session, or as part of a game session placement. A player session represents either a player reservation for a game session (status <code>RESERVED</code>) or actual player activity in a game session (status <code>ACTIVE</code>). A player session object (including player data) is automatically passed to a game session when the player connects to the game session and is validated.
    *  When a player disconnects, the player session status changes to <code>COMPLETED</code>. Once the session ends, the player session object is retained for 30 days and then removed.
    * * <a>CreatePlayerSession</a>
    *  * <a>CreatePlayerSessions</a>
    *  * <a>DescribePlayerSessions</a>
    *  * Game session placements
    * <li> <a>StartGameSessionPlacement</a>
    *  * <a>DescribeGameSessionPlacement</a>
    *  * <a>StopGameSessionPlacement</a>
    * </li>
    */
  @js.native
  trait PlayerSession extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var FleetId: js.UndefOr[FleetId]
    var GameSessionId: js.UndefOr[NonZeroAndMaxString]
    var IpAddress: js.UndefOr[IpAddress]
    var PlayerData: js.UndefOr[PlayerData]
    var PlayerId: js.UndefOr[NonZeroAndMaxString]
    var PlayerSessionId: js.UndefOr[PlayerSessionId]
    var Port: js.UndefOr[PortNumber]
    var Status: js.UndefOr[PlayerSessionStatus]
    var TerminationTime: js.UndefOr[Timestamp]
  }

  object PlayerSession {
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        FleetId: js.UndefOr[FleetId] = js.undefined,
        GameSessionId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        IpAddress: js.UndefOr[IpAddress] = js.undefined,
        PlayerData: js.UndefOr[PlayerData] = js.undefined,
        PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        PlayerSessionId: js.UndefOr[PlayerSessionId] = js.undefined,
        Port: js.UndefOr[PortNumber] = js.undefined,
        Status: js.UndefOr[PlayerSessionStatus] = js.undefined,
        TerminationTime: js.UndefOr[Timestamp] = js.undefined
    ): PlayerSession = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTime" -> CreationTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FleetId" -> FleetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GameSessionId" -> GameSessionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IpAddress" -> IpAddress.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlayerData" -> PlayerData.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlayerId" -> PlayerId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlayerSessionId" -> PlayerSessionId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Port" -> Port.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TerminationTime" -> TerminationTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PlayerSession]
    }
  }

  object PlayerSessionCreationPolicyEnum {
    val ACCEPT_ALL = "ACCEPT_ALL"
    val DENY_ALL   = "DENY_ALL"

    val values = IndexedSeq(ACCEPT_ALL, DENY_ALL)
  }

  object PlayerSessionStatusEnum {
    val RESERVED  = "RESERVED"
    val ACTIVE    = "ACTIVE"
    val COMPLETED = "COMPLETED"
    val TIMEDOUT  = "TIMEDOUT"

    val values = IndexedSeq(RESERVED, ACTIVE, COMPLETED, TIMEDOUT)
  }

  object PolicyTypeEnum {
    val RuleBased   = "RuleBased"
    val TargetBased = "TargetBased"

    val values = IndexedSeq(RuleBased, TargetBased)
  }

  object ProtectionPolicyEnum {
    val NoProtection   = "NoProtection"
    val FullProtection = "FullProtection"

    val values = IndexedSeq(NoProtection, FullProtection)
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait PutScalingPolicyInput extends js.Object {
    var FleetId: FleetId
    var MetricName: MetricName
    var Name: NonZeroAndMaxString
    var ComparisonOperator: js.UndefOr[ComparisonOperatorType]
    var EvaluationPeriods: js.UndefOr[PositiveInteger]
    var PolicyType: js.UndefOr[PolicyType]
    var ScalingAdjustment: js.UndefOr[Int]
    var ScalingAdjustmentType: js.UndefOr[ScalingAdjustmentType]
    var TargetConfiguration: js.UndefOr[TargetConfiguration]
    var Threshold: js.UndefOr[Double]
  }

  object PutScalingPolicyInput {
    def apply(
        FleetId: FleetId,
        MetricName: MetricName,
        Name: NonZeroAndMaxString,
        ComparisonOperator: js.UndefOr[ComparisonOperatorType] = js.undefined,
        EvaluationPeriods: js.UndefOr[PositiveInteger] = js.undefined,
        PolicyType: js.UndefOr[PolicyType] = js.undefined,
        ScalingAdjustment: js.UndefOr[Int] = js.undefined,
        ScalingAdjustmentType: js.UndefOr[ScalingAdjustmentType] = js.undefined,
        TargetConfiguration: js.UndefOr[TargetConfiguration] = js.undefined,
        Threshold: js.UndefOr[Double] = js.undefined
    ): PutScalingPolicyInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId"    -> FleetId.asInstanceOf[js.Any],
        "MetricName" -> MetricName.asInstanceOf[js.Any],
        "Name"       -> Name.asInstanceOf[js.Any],
        "ComparisonOperator" -> ComparisonOperator.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EvaluationPeriods" -> EvaluationPeriods.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PolicyType" -> PolicyType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScalingAdjustment" -> ScalingAdjustment.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScalingAdjustmentType" -> ScalingAdjustmentType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TargetConfiguration" -> TargetConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Threshold" -> Threshold.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutScalingPolicyInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait PutScalingPolicyOutput extends js.Object {
    var Name: js.UndefOr[NonZeroAndMaxString]
  }

  object PutScalingPolicyOutput {
    def apply(
        Name: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): PutScalingPolicyOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutScalingPolicyOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait RequestUploadCredentialsInput extends js.Object {
    var BuildId: BuildId
  }

  object RequestUploadCredentialsInput {
    def apply(
        BuildId: BuildId
    ): RequestUploadCredentialsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BuildId" -> BuildId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestUploadCredentialsInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait RequestUploadCredentialsOutput extends js.Object {
    var StorageLocation: js.UndefOr[S3Location]
    var UploadCredentials: js.UndefOr[AwsCredentials]
  }

  object RequestUploadCredentialsOutput {
    def apply(
        StorageLocation: js.UndefOr[S3Location] = js.undefined,
        UploadCredentials: js.UndefOr[AwsCredentials] = js.undefined
    ): RequestUploadCredentialsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StorageLocation" -> StorageLocation.map { x =>
          x.asInstanceOf[js.Any]
        },
        "UploadCredentials" -> UploadCredentials.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RequestUploadCredentialsOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait ResolveAliasInput extends js.Object {
    var AliasId: AliasId
  }

  object ResolveAliasInput {
    def apply(
        AliasId: AliasId
    ): ResolveAliasInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AliasId" -> AliasId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResolveAliasInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait ResolveAliasOutput extends js.Object {
    var FleetId: js.UndefOr[FleetId]
  }

  object ResolveAliasOutput {
    def apply(
        FleetId: js.UndefOr[FleetId] = js.undefined
    ): ResolveAliasOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResolveAliasOutput]
    }
  }

  /**
    * Policy that limits the number of game sessions a player can create on the same fleet. This optional policy gives game owners control over how players can consume available game server resources. A resource creation policy makes the following statement: "An individual player can create a maximum number of new game sessions within a specified time period".
    *  The policy is evaluated when a player tries to create a new game session. For example, with a policy of 10 new game sessions and a time period of 60 minutes, on receiving a <code>CreateGameSession</code> request, Amazon GameLift checks that the player (identified by <code>CreatorId</code>) has created fewer than 10 game sessions in the past 60 minutes.
    */
  @js.native
  trait ResourceCreationLimitPolicy extends js.Object {
    var NewGameSessionsPerCreator: js.UndefOr[WholeNumber]
    var PolicyPeriodInMinutes: js.UndefOr[WholeNumber]
  }

  object ResourceCreationLimitPolicy {
    def apply(
        NewGameSessionsPerCreator: js.UndefOr[WholeNumber] = js.undefined,
        PolicyPeriodInMinutes: js.UndefOr[WholeNumber] = js.undefined
    ): ResourceCreationLimitPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NewGameSessionsPerCreator" -> NewGameSessionsPerCreator.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PolicyPeriodInMinutes" -> PolicyPeriodInMinutes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceCreationLimitPolicy]
    }
  }

  /**
    * Routing configuration for a fleet alias.
    * * <a>CreateFleet</a>
    *  * <a>ListFleets</a>
    *  * <a>DeleteFleet</a>
    *  * Describe fleets:
    * <li> <a>DescribeFleetAttributes</a>
    *  * <a>DescribeFleetCapacity</a>
    *  * <a>DescribeFleetPortSettings</a>
    *  * <a>DescribeFleetUtilization</a>
    *  * <a>DescribeRuntimeConfiguration</a>
    *  * <a>DescribeEC2InstanceLimits</a>
    *  * <a>DescribeFleetEvents</a>
    * </li> * Update fleets:
    * <li> <a>UpdateFleetAttributes</a>
    *  * <a>UpdateFleetCapacity</a>
    *  * <a>UpdateFleetPortSettings</a>
    *  * <a>UpdateRuntimeConfiguration</a>
    * </li> * Manage fleet actions:
    * <li> <a>StartFleetActions</a>
    *  * <a>StopFleetActions</a>
    * </li>
    */
  @js.native
  trait RoutingStrategy extends js.Object {
    var FleetId: js.UndefOr[FleetId]
    var Message: js.UndefOr[FreeText]
    var Type: js.UndefOr[RoutingStrategyType]
  }

  object RoutingStrategy {
    def apply(
        FleetId: js.UndefOr[FleetId] = js.undefined,
        Message: js.UndefOr[FreeText] = js.undefined,
        Type: js.UndefOr[RoutingStrategyType] = js.undefined
    ): RoutingStrategy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Message" -> Message.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RoutingStrategy]
    }
  }

  object RoutingStrategyTypeEnum {
    val SIMPLE   = "SIMPLE"
    val TERMINAL = "TERMINAL"

    val values = IndexedSeq(SIMPLE, TERMINAL)
  }

  /**
    * A collection of server process configurations that describe what processes to run on each instance in a fleet. All fleets must have a run-time configuration. Each instance in the fleet launches the server processes specified in the run-time configuration and launches new ones as existing processes end. Each instance regularly checks for an updated run-time configuration and follows the new instructions.
    *  The run-time configuration enables the instances in a fleet to run multiple processes simultaneously. Potential scenarios are as follows: (1) Run multiple processes of a single game server executable to maximize usage of your hosting resources. (2) Run one or more processes of different build executables, such as your game server executable and a related program, or two or more different versions of a game server. (3) Run multiple processes of a single game server but with different launch parameters, for example to run one process on each instance in debug mode.
    *  A Amazon GameLift instance is limited to 50 processes running simultaneously. A run-time configuration must specify fewer than this limit. To calculate the total number of processes specified in a run-time configuration, add the values of the <code>ConcurrentExecutions</code> parameter for each <code> <a>ServerProcess</a> </code> object in the run-time configuration.
    * * <a>CreateFleet</a>
    *  * <a>ListFleets</a>
    *  * <a>DeleteFleet</a>
    *  * Describe fleets:
    * <li> <a>DescribeFleetAttributes</a>
    *  * <a>DescribeFleetCapacity</a>
    *  * <a>DescribeFleetPortSettings</a>
    *  * <a>DescribeFleetUtilization</a>
    *  * <a>DescribeRuntimeConfiguration</a>
    *  * <a>DescribeEC2InstanceLimits</a>
    *  * <a>DescribeFleetEvents</a>
    * </li> * Update fleets:
    * <li> <a>UpdateFleetAttributes</a>
    *  * <a>UpdateFleetCapacity</a>
    *  * <a>UpdateFleetPortSettings</a>
    *  * <a>UpdateRuntimeConfiguration</a>
    * </li> * Manage fleet actions:
    * <li> <a>StartFleetActions</a>
    *  * <a>StopFleetActions</a>
    * </li>
    */
  @js.native
  trait RuntimeConfiguration extends js.Object {
    var GameSessionActivationTimeoutSeconds: js.UndefOr[GameSessionActivationTimeoutSeconds]
    var MaxConcurrentGameSessionActivations: js.UndefOr[MaxConcurrentGameSessionActivations]
    var ServerProcesses: js.UndefOr[ServerProcessList]
  }

  object RuntimeConfiguration {
    def apply(
        GameSessionActivationTimeoutSeconds: js.UndefOr[GameSessionActivationTimeoutSeconds] = js.undefined,
        MaxConcurrentGameSessionActivations: js.UndefOr[MaxConcurrentGameSessionActivations] = js.undefined,
        ServerProcesses: js.UndefOr[ServerProcessList] = js.undefined
    ): RuntimeConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSessionActivationTimeoutSeconds" -> GameSessionActivationTimeoutSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxConcurrentGameSessionActivations" -> MaxConcurrentGameSessionActivations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ServerProcesses" -> ServerProcesses.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RuntimeConfiguration]
    }
  }

  /**
    * Location in Amazon Simple Storage Service (Amazon S3) where build files can be stored for access by Amazon GameLift. This location is specified in a <a>CreateBuild</a> request. For more details, see the [[https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-build-cli-uploading.html#gamelift-build-cli-uploading-create-build|Create a Build with Files in Amazon S3]].
    */
  @js.native
  trait S3Location extends js.Object {
    var Bucket: js.UndefOr[NonEmptyString]
    var Key: js.UndefOr[NonEmptyString]
    var RoleArn: js.UndefOr[NonEmptyString]
  }

  object S3Location {
    def apply(
        Bucket: js.UndefOr[NonEmptyString] = js.undefined,
        Key: js.UndefOr[NonEmptyString] = js.undefined,
        RoleArn: js.UndefOr[NonEmptyString] = js.undefined
    ): S3Location = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Bucket" -> Bucket.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Key" -> Key.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoleArn" -> RoleArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[S3Location]
    }
  }

  object ScalingAdjustmentTypeEnum {
    val ChangeInCapacity        = "ChangeInCapacity"
    val ExactCapacity           = "ExactCapacity"
    val PercentChangeInCapacity = "PercentChangeInCapacity"

    val values = IndexedSeq(ChangeInCapacity, ExactCapacity, PercentChangeInCapacity)
  }

  /**
    * Rule that controls how a fleet is scaled. Scaling policies are uniquely identified by the combination of name and fleet ID.
    * * <a>DescribeFleetCapacity</a>
    *  * <a>UpdateFleetCapacity</a>
    *  * <a>DescribeEC2InstanceLimits</a>
    *  * Manage scaling policies:
    * <li> <a>PutScalingPolicy</a> (auto-scaling)
    *  * <a>DescribeScalingPolicies</a> (auto-scaling)
    *  * <a>DeleteScalingPolicy</a> (auto-scaling)
    * </li> * Manage fleet actions:
    * <li> <a>StartFleetActions</a>
    *  * <a>StopFleetActions</a>
    * </li>
    */
  @js.native
  trait ScalingPolicy extends js.Object {
    var ComparisonOperator: js.UndefOr[ComparisonOperatorType]
    var EvaluationPeriods: js.UndefOr[PositiveInteger]
    var FleetId: js.UndefOr[FleetId]
    var MetricName: js.UndefOr[MetricName]
    var Name: js.UndefOr[NonZeroAndMaxString]
    var PolicyType: js.UndefOr[PolicyType]
    var ScalingAdjustment: js.UndefOr[Int]
    var ScalingAdjustmentType: js.UndefOr[ScalingAdjustmentType]
    var Status: js.UndefOr[ScalingStatusType]
    var TargetConfiguration: js.UndefOr[TargetConfiguration]
    var Threshold: js.UndefOr[Double]
  }

  object ScalingPolicy {
    def apply(
        ComparisonOperator: js.UndefOr[ComparisonOperatorType] = js.undefined,
        EvaluationPeriods: js.UndefOr[PositiveInteger] = js.undefined,
        FleetId: js.UndefOr[FleetId] = js.undefined,
        MetricName: js.UndefOr[MetricName] = js.undefined,
        Name: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        PolicyType: js.UndefOr[PolicyType] = js.undefined,
        ScalingAdjustment: js.UndefOr[Int] = js.undefined,
        ScalingAdjustmentType: js.UndefOr[ScalingAdjustmentType] = js.undefined,
        Status: js.UndefOr[ScalingStatusType] = js.undefined,
        TargetConfiguration: js.UndefOr[TargetConfiguration] = js.undefined,
        Threshold: js.UndefOr[Double] = js.undefined
    ): ScalingPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ComparisonOperator" -> ComparisonOperator.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EvaluationPeriods" -> EvaluationPeriods.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FleetId" -> FleetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MetricName" -> MetricName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PolicyType" -> PolicyType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScalingAdjustment" -> ScalingAdjustment.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ScalingAdjustmentType" -> ScalingAdjustmentType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TargetConfiguration" -> TargetConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Threshold" -> Threshold.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ScalingPolicy]
    }
  }

  object ScalingStatusTypeEnum {
    val ACTIVE           = "ACTIVE"
    val UPDATE_REQUESTED = "UPDATE_REQUESTED"
    val UPDATING         = "UPDATING"
    val DELETE_REQUESTED = "DELETE_REQUESTED"
    val DELETING         = "DELETING"
    val DELETED          = "DELETED"
    val ERROR            = "ERROR"

    val values = IndexedSeq(ACTIVE, UPDATE_REQUESTED, UPDATING, DELETE_REQUESTED, DELETING, DELETED, ERROR)
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait SearchGameSessionsInput extends js.Object {
    var AliasId: js.UndefOr[AliasId]
    var FilterExpression: js.UndefOr[NonZeroAndMaxString]
    var FleetId: js.UndefOr[FleetId]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
    var SortExpression: js.UndefOr[NonZeroAndMaxString]
  }

  object SearchGameSessionsInput {
    def apply(
        AliasId: js.UndefOr[AliasId] = js.undefined,
        FilterExpression: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        FleetId: js.UndefOr[FleetId] = js.undefined,
        Limit: js.UndefOr[PositiveInteger] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        SortExpression: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): SearchGameSessionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AliasId" -> AliasId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FilterExpression" -> FilterExpression.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FleetId" -> FleetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Limit" -> Limit.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SortExpression" -> SortExpression.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchGameSessionsInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait SearchGameSessionsOutput extends js.Object {
    var GameSessions: js.UndefOr[GameSessionList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object SearchGameSessionsOutput {
    def apply(
        GameSessions: js.UndefOr[GameSessionList] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): SearchGameSessionsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSessions" -> GameSessions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SearchGameSessionsOutput]
    }
  }

  /**
    * A set of instructions for launching server processes on each instance in a fleet. Each instruction set identifies the location of the server executable, optional launch parameters, and the number of server processes with this configuration to maintain concurrently on the instance. Server process configurations make up a fleet's <code> <a>RuntimeConfiguration</a> </code>.
    */
  @js.native
  trait ServerProcess extends js.Object {
    var ConcurrentExecutions: PositiveInteger
    var LaunchPath: NonZeroAndMaxString
    var Parameters: js.UndefOr[NonZeroAndMaxString]
  }

  object ServerProcess {
    def apply(
        ConcurrentExecutions: PositiveInteger,
        LaunchPath: NonZeroAndMaxString,
        Parameters: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): ServerProcess = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConcurrentExecutions" -> ConcurrentExecutions.asInstanceOf[js.Any],
        "LaunchPath"           -> LaunchPath.asInstanceOf[js.Any],
        "Parameters" -> Parameters.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServerProcess]
    }
  }

  @js.native
  trait StartFleetActionsInput extends js.Object {
    var Actions: FleetActionList
    var FleetId: FleetId
  }

  object StartFleetActionsInput {
    def apply(
        Actions: FleetActionList,
        FleetId: FleetId
    ): StartFleetActionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Actions" -> Actions.asInstanceOf[js.Any],
        "FleetId" -> FleetId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartFleetActionsInput]
    }
  }

  @js.native
  trait StartFleetActionsOutput extends js.Object {}

  object StartFleetActionsOutput {
    def apply(
        ): StartFleetActionsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartFleetActionsOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait StartGameSessionPlacementInput extends js.Object {
    var GameSessionQueueName: GameSessionQueueName
    var MaximumPlayerSessionCount: WholeNumber
    var PlacementId: IdStringModel
    var DesiredPlayerSessions: js.UndefOr[DesiredPlayerSessionList]
    var GameProperties: js.UndefOr[GamePropertyList]
    var GameSessionData: js.UndefOr[GameSessionData]
    var GameSessionName: js.UndefOr[NonZeroAndMaxString]
    var PlayerLatencies: js.UndefOr[PlayerLatencyList]
  }

  object StartGameSessionPlacementInput {
    def apply(
        GameSessionQueueName: GameSessionQueueName,
        MaximumPlayerSessionCount: WholeNumber,
        PlacementId: IdStringModel,
        DesiredPlayerSessions: js.UndefOr[DesiredPlayerSessionList] = js.undefined,
        GameProperties: js.UndefOr[GamePropertyList] = js.undefined,
        GameSessionData: js.UndefOr[GameSessionData] = js.undefined,
        GameSessionName: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        PlayerLatencies: js.UndefOr[PlayerLatencyList] = js.undefined
    ): StartGameSessionPlacementInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSessionQueueName"      -> GameSessionQueueName.asInstanceOf[js.Any],
        "MaximumPlayerSessionCount" -> MaximumPlayerSessionCount.asInstanceOf[js.Any],
        "PlacementId"               -> PlacementId.asInstanceOf[js.Any],
        "DesiredPlayerSessions" -> DesiredPlayerSessions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GameProperties" -> GameProperties.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GameSessionData" -> GameSessionData.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GameSessionName" -> GameSessionName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlayerLatencies" -> PlayerLatencies.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartGameSessionPlacementInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait StartGameSessionPlacementOutput extends js.Object {
    var GameSessionPlacement: js.UndefOr[GameSessionPlacement]
  }

  object StartGameSessionPlacementOutput {
    def apply(
        GameSessionPlacement: js.UndefOr[GameSessionPlacement] = js.undefined
    ): StartGameSessionPlacementOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSessionPlacement" -> GameSessionPlacement.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartGameSessionPlacementOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait StartMatchBackfillInput extends js.Object {
    var ConfigurationName: MatchmakingIdStringModel
    var GameSessionArn: ArnStringModel
    var Players: PlayerList
    var TicketId: js.UndefOr[MatchmakingIdStringModel]
  }

  object StartMatchBackfillInput {
    def apply(
        ConfigurationName: MatchmakingIdStringModel,
        GameSessionArn: ArnStringModel,
        Players: PlayerList,
        TicketId: js.UndefOr[MatchmakingIdStringModel] = js.undefined
    ): StartMatchBackfillInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationName" -> ConfigurationName.asInstanceOf[js.Any],
        "GameSessionArn"    -> GameSessionArn.asInstanceOf[js.Any],
        "Players"           -> Players.asInstanceOf[js.Any],
        "TicketId" -> TicketId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartMatchBackfillInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait StartMatchBackfillOutput extends js.Object {
    var MatchmakingTicket: js.UndefOr[MatchmakingTicket]
  }

  object StartMatchBackfillOutput {
    def apply(
        MatchmakingTicket: js.UndefOr[MatchmakingTicket] = js.undefined
    ): StartMatchBackfillOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MatchmakingTicket" -> MatchmakingTicket.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartMatchBackfillOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait StartMatchmakingInput extends js.Object {
    var ConfigurationName: MatchmakingIdStringModel
    var Players: PlayerList
    var TicketId: js.UndefOr[MatchmakingIdStringModel]
  }

  object StartMatchmakingInput {
    def apply(
        ConfigurationName: MatchmakingIdStringModel,
        Players: PlayerList,
        TicketId: js.UndefOr[MatchmakingIdStringModel] = js.undefined
    ): StartMatchmakingInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationName" -> ConfigurationName.asInstanceOf[js.Any],
        "Players"           -> Players.asInstanceOf[js.Any],
        "TicketId" -> TicketId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartMatchmakingInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait StartMatchmakingOutput extends js.Object {
    var MatchmakingTicket: js.UndefOr[MatchmakingTicket]
  }

  object StartMatchmakingOutput {
    def apply(
        MatchmakingTicket: js.UndefOr[MatchmakingTicket] = js.undefined
    ): StartMatchmakingOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MatchmakingTicket" -> MatchmakingTicket.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartMatchmakingOutput]
    }
  }

  @js.native
  trait StopFleetActionsInput extends js.Object {
    var Actions: FleetActionList
    var FleetId: FleetId
  }

  object StopFleetActionsInput {
    def apply(
        Actions: FleetActionList,
        FleetId: FleetId
    ): StopFleetActionsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Actions" -> Actions.asInstanceOf[js.Any],
        "FleetId" -> FleetId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopFleetActionsInput]
    }
  }

  @js.native
  trait StopFleetActionsOutput extends js.Object {}

  object StopFleetActionsOutput {
    def apply(
        ): StopFleetActionsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopFleetActionsOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait StopGameSessionPlacementInput extends js.Object {
    var PlacementId: IdStringModel
  }

  object StopGameSessionPlacementInput {
    def apply(
        PlacementId: IdStringModel
    ): StopGameSessionPlacementInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PlacementId" -> PlacementId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopGameSessionPlacementInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait StopGameSessionPlacementOutput extends js.Object {
    var GameSessionPlacement: js.UndefOr[GameSessionPlacement]
  }

  object StopGameSessionPlacementOutput {
    def apply(
        GameSessionPlacement: js.UndefOr[GameSessionPlacement] = js.undefined
    ): StopGameSessionPlacementOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSessionPlacement" -> GameSessionPlacement.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopGameSessionPlacementOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait StopMatchmakingInput extends js.Object {
    var TicketId: MatchmakingIdStringModel
  }

  object StopMatchmakingInput {
    def apply(
        TicketId: MatchmakingIdStringModel
    ): StopMatchmakingInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TicketId" -> TicketId.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopMatchmakingInput]
    }
  }

  @js.native
  trait StopMatchmakingOutput extends js.Object {}

  object StopMatchmakingOutput {
    def apply(
        ): StopMatchmakingOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopMatchmakingOutput]
    }
  }

  /**
    * Settings for a target-based scaling policy (see <a>ScalingPolicy</a>. A target-based policy tracks a particular fleet metric specifies a target value for the metric. As player usage changes, the policy triggers Amazon GameLift to adjust capacity so that the metric returns to the target value. The target configuration specifies settings as needed for the target based policy, including the target value.
    * * <a>DescribeFleetCapacity</a>
    *  * <a>UpdateFleetCapacity</a>
    *  * <a>DescribeEC2InstanceLimits</a>
    *  * Manage scaling policies:
    * <li> <a>PutScalingPolicy</a> (auto-scaling)
    *  * <a>DescribeScalingPolicies</a> (auto-scaling)
    *  * <a>DeleteScalingPolicy</a> (auto-scaling)
    * </li> * Manage fleet actions:
    * <li> <a>StartFleetActions</a>
    *  * <a>StopFleetActions</a>
    * </li>
    */
  @js.native
  trait TargetConfiguration extends js.Object {
    var TargetValue: Double
  }

  object TargetConfiguration {
    def apply(
        TargetValue: Double
    ): TargetConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TargetValue" -> TargetValue.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TargetConfiguration]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait UpdateAliasInput extends js.Object {
    var AliasId: AliasId
    var Description: js.UndefOr[NonZeroAndMaxString]
    var Name: js.UndefOr[NonBlankAndLengthConstraintString]
    var RoutingStrategy: js.UndefOr[RoutingStrategy]
  }

  object UpdateAliasInput {
    def apply(
        AliasId: AliasId,
        Description: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        Name: js.UndefOr[NonBlankAndLengthConstraintString] = js.undefined,
        RoutingStrategy: js.UndefOr[RoutingStrategy] = js.undefined
    ): UpdateAliasInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AliasId" -> AliasId.asInstanceOf[js.Any],
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RoutingStrategy" -> RoutingStrategy.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAliasInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait UpdateAliasOutput extends js.Object {
    var Alias: js.UndefOr[Alias]
  }

  object UpdateAliasOutput {
    def apply(
        Alias: js.UndefOr[Alias] = js.undefined
    ): UpdateAliasOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Alias" -> Alias.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAliasOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait UpdateBuildInput extends js.Object {
    var BuildId: BuildId
    var Name: js.UndefOr[NonZeroAndMaxString]
    var Version: js.UndefOr[NonZeroAndMaxString]
  }

  object UpdateBuildInput {
    def apply(
        BuildId: BuildId,
        Name: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        Version: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): UpdateBuildInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BuildId" -> BuildId.asInstanceOf[js.Any],
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Version" -> Version.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateBuildInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait UpdateBuildOutput extends js.Object {
    var Build: js.UndefOr[Build]
  }

  object UpdateBuildOutput {
    def apply(
        Build: js.UndefOr[Build] = js.undefined
    ): UpdateBuildOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Build" -> Build.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateBuildOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait UpdateFleetAttributesInput extends js.Object {
    var FleetId: FleetId
    var Description: js.UndefOr[NonZeroAndMaxString]
    var MetricGroups: js.UndefOr[MetricGroupList]
    var Name: js.UndefOr[NonZeroAndMaxString]
    var NewGameSessionProtectionPolicy: js.UndefOr[ProtectionPolicy]
    var ResourceCreationLimitPolicy: js.UndefOr[ResourceCreationLimitPolicy]
  }

  object UpdateFleetAttributesInput {
    def apply(
        FleetId: FleetId,
        Description: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        MetricGroups: js.UndefOr[MetricGroupList] = js.undefined,
        Name: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        NewGameSessionProtectionPolicy: js.UndefOr[ProtectionPolicy] = js.undefined,
        ResourceCreationLimitPolicy: js.UndefOr[ResourceCreationLimitPolicy] = js.undefined
    ): UpdateFleetAttributesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.asInstanceOf[js.Any],
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MetricGroups" -> MetricGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NewGameSessionProtectionPolicy" -> NewGameSessionProtectionPolicy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceCreationLimitPolicy" -> ResourceCreationLimitPolicy.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFleetAttributesInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait UpdateFleetAttributesOutput extends js.Object {
    var FleetId: js.UndefOr[FleetId]
  }

  object UpdateFleetAttributesOutput {
    def apply(
        FleetId: js.UndefOr[FleetId] = js.undefined
    ): UpdateFleetAttributesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFleetAttributesOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait UpdateFleetCapacityInput extends js.Object {
    var FleetId: FleetId
    var DesiredInstances: js.UndefOr[WholeNumber]
    var MaxSize: js.UndefOr[WholeNumber]
    var MinSize: js.UndefOr[WholeNumber]
  }

  object UpdateFleetCapacityInput {
    def apply(
        FleetId: FleetId,
        DesiredInstances: js.UndefOr[WholeNumber] = js.undefined,
        MaxSize: js.UndefOr[WholeNumber] = js.undefined,
        MinSize: js.UndefOr[WholeNumber] = js.undefined
    ): UpdateFleetCapacityInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.asInstanceOf[js.Any],
        "DesiredInstances" -> DesiredInstances.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxSize" -> MaxSize.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MinSize" -> MinSize.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFleetCapacityInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait UpdateFleetCapacityOutput extends js.Object {
    var FleetId: js.UndefOr[FleetId]
  }

  object UpdateFleetCapacityOutput {
    def apply(
        FleetId: js.UndefOr[FleetId] = js.undefined
    ): UpdateFleetCapacityOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFleetCapacityOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait UpdateFleetPortSettingsInput extends js.Object {
    var FleetId: FleetId
    var InboundPermissionAuthorizations: js.UndefOr[IpPermissionsList]
    var InboundPermissionRevocations: js.UndefOr[IpPermissionsList]
  }

  object UpdateFleetPortSettingsInput {
    def apply(
        FleetId: FleetId,
        InboundPermissionAuthorizations: js.UndefOr[IpPermissionsList] = js.undefined,
        InboundPermissionRevocations: js.UndefOr[IpPermissionsList] = js.undefined
    ): UpdateFleetPortSettingsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.asInstanceOf[js.Any],
        "InboundPermissionAuthorizations" -> InboundPermissionAuthorizations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "InboundPermissionRevocations" -> InboundPermissionRevocations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFleetPortSettingsInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait UpdateFleetPortSettingsOutput extends js.Object {
    var FleetId: js.UndefOr[FleetId]
  }

  object UpdateFleetPortSettingsOutput {
    def apply(
        FleetId: js.UndefOr[FleetId] = js.undefined
    ): UpdateFleetPortSettingsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFleetPortSettingsOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait UpdateGameSessionInput extends js.Object {
    var GameSessionId: ArnStringModel
    var MaximumPlayerSessionCount: js.UndefOr[WholeNumber]
    var Name: js.UndefOr[NonZeroAndMaxString]
    var PlayerSessionCreationPolicy: js.UndefOr[PlayerSessionCreationPolicy]
    var ProtectionPolicy: js.UndefOr[ProtectionPolicy]
  }

  object UpdateGameSessionInput {
    def apply(
        GameSessionId: ArnStringModel,
        MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined,
        Name: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        PlayerSessionCreationPolicy: js.UndefOr[PlayerSessionCreationPolicy] = js.undefined,
        ProtectionPolicy: js.UndefOr[ProtectionPolicy] = js.undefined
    ): UpdateGameSessionInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSessionId" -> GameSessionId.asInstanceOf[js.Any],
        "MaximumPlayerSessionCount" -> MaximumPlayerSessionCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlayerSessionCreationPolicy" -> PlayerSessionCreationPolicy.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProtectionPolicy" -> ProtectionPolicy.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGameSessionInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait UpdateGameSessionOutput extends js.Object {
    var GameSession: js.UndefOr[GameSession]
  }

  object UpdateGameSessionOutput {
    def apply(
        GameSession: js.UndefOr[GameSession] = js.undefined
    ): UpdateGameSessionOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSession" -> GameSession.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGameSessionOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait UpdateGameSessionQueueInput extends js.Object {
    var Name: GameSessionQueueName
    var Destinations: js.UndefOr[GameSessionQueueDestinationList]
    var PlayerLatencyPolicies: js.UndefOr[PlayerLatencyPolicyList]
    var TimeoutInSeconds: js.UndefOr[WholeNumber]
  }

  object UpdateGameSessionQueueInput {
    def apply(
        Name: GameSessionQueueName,
        Destinations: js.UndefOr[GameSessionQueueDestinationList] = js.undefined,
        PlayerLatencyPolicies: js.UndefOr[PlayerLatencyPolicyList] = js.undefined,
        TimeoutInSeconds: js.UndefOr[WholeNumber] = js.undefined
    ): UpdateGameSessionQueueInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "Destinations" -> Destinations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlayerLatencyPolicies" -> PlayerLatencyPolicies.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimeoutInSeconds" -> TimeoutInSeconds.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGameSessionQueueInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait UpdateGameSessionQueueOutput extends js.Object {
    var GameSessionQueue: js.UndefOr[GameSessionQueue]
  }

  object UpdateGameSessionQueueOutput {
    def apply(
        GameSessionQueue: js.UndefOr[GameSessionQueue] = js.undefined
    ): UpdateGameSessionQueueOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "GameSessionQueue" -> GameSessionQueue.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGameSessionQueueOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait UpdateMatchmakingConfigurationInput extends js.Object {
    var Name: MatchmakingIdStringModel
    var AcceptanceRequired: js.UndefOr[BooleanModel]
    var AcceptanceTimeoutSeconds: js.UndefOr[MatchmakingAcceptanceTimeoutInteger]
    var AdditionalPlayerCount: js.UndefOr[WholeNumber]
    var CustomEventData: js.UndefOr[CustomEventData]
    var Description: js.UndefOr[NonZeroAndMaxString]
    var GameProperties: js.UndefOr[GamePropertyList]
    var GameSessionData: js.UndefOr[GameSessionData]
    var GameSessionQueueArns: js.UndefOr[QueueArnsList]
    var NotificationTarget: js.UndefOr[SnsArnStringModel]
    var RequestTimeoutSeconds: js.UndefOr[MatchmakingRequestTimeoutInteger]
    var RuleSetName: js.UndefOr[MatchmakingIdStringModel]
  }

  object UpdateMatchmakingConfigurationInput {
    def apply(
        Name: MatchmakingIdStringModel,
        AcceptanceRequired: js.UndefOr[BooleanModel] = js.undefined,
        AcceptanceTimeoutSeconds: js.UndefOr[MatchmakingAcceptanceTimeoutInteger] = js.undefined,
        AdditionalPlayerCount: js.UndefOr[WholeNumber] = js.undefined,
        CustomEventData: js.UndefOr[CustomEventData] = js.undefined,
        Description: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        GameProperties: js.UndefOr[GamePropertyList] = js.undefined,
        GameSessionData: js.UndefOr[GameSessionData] = js.undefined,
        GameSessionQueueArns: js.UndefOr[QueueArnsList] = js.undefined,
        NotificationTarget: js.UndefOr[SnsArnStringModel] = js.undefined,
        RequestTimeoutSeconds: js.UndefOr[MatchmakingRequestTimeoutInteger] = js.undefined,
        RuleSetName: js.UndefOr[MatchmakingIdStringModel] = js.undefined
    ): UpdateMatchmakingConfigurationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "AcceptanceRequired" -> AcceptanceRequired.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AcceptanceTimeoutSeconds" -> AcceptanceTimeoutSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "AdditionalPlayerCount" -> AdditionalPlayerCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CustomEventData" -> CustomEventData.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Description" -> Description.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GameProperties" -> GameProperties.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GameSessionData" -> GameSessionData.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GameSessionQueueArns" -> GameSessionQueueArns.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NotificationTarget" -> NotificationTarget.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RequestTimeoutSeconds" -> RequestTimeoutSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RuleSetName" -> RuleSetName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateMatchmakingConfigurationInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait UpdateMatchmakingConfigurationOutput extends js.Object {
    var Configuration: js.UndefOr[MatchmakingConfiguration]
  }

  object UpdateMatchmakingConfigurationOutput {
    def apply(
        Configuration: js.UndefOr[MatchmakingConfiguration] = js.undefined
    ): UpdateMatchmakingConfigurationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Configuration" -> Configuration.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateMatchmakingConfigurationOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait UpdateRuntimeConfigurationInput extends js.Object {
    var FleetId: FleetId
    var RuntimeConfiguration: RuntimeConfiguration
  }

  object UpdateRuntimeConfigurationInput {
    def apply(
        FleetId: FleetId,
        RuntimeConfiguration: RuntimeConfiguration
    ): UpdateRuntimeConfigurationInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId"              -> FleetId.asInstanceOf[js.Any],
        "RuntimeConfiguration" -> RuntimeConfiguration.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRuntimeConfigurationInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait UpdateRuntimeConfigurationOutput extends js.Object {
    var RuntimeConfiguration: js.UndefOr[RuntimeConfiguration]
  }

  object UpdateRuntimeConfigurationOutput {
    def apply(
        RuntimeConfiguration: js.UndefOr[RuntimeConfiguration] = js.undefined
    ): UpdateRuntimeConfigurationOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuntimeConfiguration" -> RuntimeConfiguration.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRuntimeConfigurationOutput]
    }
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  trait ValidateMatchmakingRuleSetInput extends js.Object {
    var RuleSetBody: RuleSetBody
  }

  object ValidateMatchmakingRuleSetInput {
    def apply(
        RuleSetBody: RuleSetBody
    ): ValidateMatchmakingRuleSetInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RuleSetBody" -> RuleSetBody.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ValidateMatchmakingRuleSetInput]
    }
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  trait ValidateMatchmakingRuleSetOutput extends js.Object {
    var Valid: js.UndefOr[BooleanModel]
  }

  object ValidateMatchmakingRuleSetOutput {
    def apply(
        Valid: js.UndefOr[BooleanModel] = js.undefined
    ): ValidateMatchmakingRuleSetOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Valid" -> Valid.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ValidateMatchmakingRuleSetOutput]
    }
  }

  /**
    * Represents an authorization for a VPC peering connection between the VPC for an Amazon GameLift fleet and another VPC on an account you have access to. This authorization must exist and be valid for the peering connection to be established. Authorizations are valid for 24 hours after they are issued.
    * * <a>CreateVpcPeeringAuthorization</a>
    *  * <a>DescribeVpcPeeringAuthorizations</a>
    *  * <a>DeleteVpcPeeringAuthorization</a>
    *  * <a>CreateVpcPeeringConnection</a>
    *  * <a>DescribeVpcPeeringConnections</a>
    *  * <a>DeleteVpcPeeringConnection</a>
    */
  @js.native
  trait VpcPeeringAuthorization extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var ExpirationTime: js.UndefOr[Timestamp]
    var GameLiftAwsAccountId: js.UndefOr[NonZeroAndMaxString]
    var PeerVpcAwsAccountId: js.UndefOr[NonZeroAndMaxString]
    var PeerVpcId: js.UndefOr[NonZeroAndMaxString]
  }

  object VpcPeeringAuthorization {
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        ExpirationTime: js.UndefOr[Timestamp] = js.undefined,
        GameLiftAwsAccountId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        PeerVpcAwsAccountId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        PeerVpcId: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): VpcPeeringAuthorization = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CreationTime" -> CreationTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ExpirationTime" -> ExpirationTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GameLiftAwsAccountId" -> GameLiftAwsAccountId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PeerVpcAwsAccountId" -> PeerVpcAwsAccountId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PeerVpcId" -> PeerVpcId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcPeeringAuthorization]
    }
  }

  /**
    * Represents a peering connection between a VPC on one of your AWS accounts and the VPC for your Amazon GameLift fleets. This record may be for an active peering connection or a pending connection that has not yet been established.
    * * <a>CreateVpcPeeringAuthorization</a>
    *  * <a>DescribeVpcPeeringAuthorizations</a>
    *  * <a>DeleteVpcPeeringAuthorization</a>
    *  * <a>CreateVpcPeeringConnection</a>
    *  * <a>DescribeVpcPeeringConnections</a>
    *  * <a>DeleteVpcPeeringConnection</a>
    */
  @js.native
  trait VpcPeeringConnection extends js.Object {
    var FleetId: js.UndefOr[FleetId]
    var GameLiftVpcId: js.UndefOr[NonZeroAndMaxString]
    var IpV4CidrBlock: js.UndefOr[NonZeroAndMaxString]
    var PeerVpcId: js.UndefOr[NonZeroAndMaxString]
    var Status: js.UndefOr[VpcPeeringConnectionStatus]
    var VpcPeeringConnectionId: js.UndefOr[NonZeroAndMaxString]
  }

  object VpcPeeringConnection {
    def apply(
        FleetId: js.UndefOr[FleetId] = js.undefined,
        GameLiftVpcId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        IpV4CidrBlock: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        PeerVpcId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        Status: js.UndefOr[VpcPeeringConnectionStatus] = js.undefined,
        VpcPeeringConnectionId: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): VpcPeeringConnection = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FleetId" -> FleetId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "GameLiftVpcId" -> GameLiftVpcId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IpV4CidrBlock" -> IpV4CidrBlock.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PeerVpcId" -> PeerVpcId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VpcPeeringConnectionId" -> VpcPeeringConnectionId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcPeeringConnection]
    }
  }

  /**
    * Represents status information for a VPC peering connection. Status is associated with a <a>VpcPeeringConnection</a> object. Status codes and messages are provided from EC2 (see [[https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_VpcPeeringConnectionStateReason.html|VpcPeeringConnectionStateReason]]). Connection status information is also communicated as a fleet <a>Event</a>.
    */
  @js.native
  trait VpcPeeringConnectionStatus extends js.Object {
    var Code: js.UndefOr[NonZeroAndMaxString]
    var Message: js.UndefOr[NonZeroAndMaxString]
  }

  object VpcPeeringConnectionStatus {
    def apply(
        Code: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        Message: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): VpcPeeringConnectionStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Code" -> Code.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Message" -> Message.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VpcPeeringConnectionStatus]
    }
  }
}
