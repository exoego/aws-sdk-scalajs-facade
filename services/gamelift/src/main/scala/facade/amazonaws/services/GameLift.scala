package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object gamelift {
  type AliasId                             = String
  type AliasList                           = js.Array[Alias]
  type AmazonResourceName                  = String
  type ArnStringModel                      = String
  type BooleanModel                        = Boolean
  type BuildArn                            = String
  type BuildId                             = String
  type BuildList                           = js.Array[Build]
  type CustomEventData                     = String
  type DesiredPlayerSessionList            = js.Array[DesiredPlayerSession]
  type DnsName                             = String
  type DoubleObject                        = Double
  type EC2InstanceLimitList                = js.Array[EC2InstanceLimit]
  type EventList                           = js.Array[Event]
  type FleetActionList                     = js.Array[FleetAction]
  type FleetAttributesList                 = js.Array[FleetAttributes]
  type FleetCapacityList                   = js.Array[FleetCapacity]
  type FleetId                             = String
  type FleetIdList                         = js.Array[FleetId]
  type FleetUtilizationList                = js.Array[FleetUtilization]
  type FreeText                            = String
  type GamePropertyKey                     = String
  type GamePropertyList                    = js.Array[GameProperty]
  type GamePropertyValue                   = String
  type GameSessionActivationTimeoutSeconds = Int
  type GameSessionData                     = String
  type GameSessionDetailList               = js.Array[GameSessionDetail]
  type GameSessionList                     = js.Array[GameSession]
  type GameSessionQueueDestinationList     = js.Array[GameSessionQueueDestination]
  type GameSessionQueueList                = js.Array[GameSessionQueue]
  type GameSessionQueueName                = String
  type GameSessionQueueNameList            = js.Array[GameSessionQueueName]
  type IdStringModel                       = String
  type InstanceId                          = String
  type InstanceList                        = js.Array[Instance]
  type IpAddress                           = String
  type IpPermissionsList                   = js.Array[IpPermission]
  type LatencyMap                          = js.Dictionary[PositiveInteger]
  type MatchedPlayerSessionList            = js.Array[MatchedPlayerSession]
  type MatchmakerData                      = String
  type MatchmakingAcceptanceTimeoutInteger = Int
  type MatchmakingConfigurationArn         = String
  type MatchmakingConfigurationList        = js.Array[MatchmakingConfiguration]
  type MatchmakingConfigurationName        = String
  type MatchmakingConfigurationNameList    = js.Array[MatchmakingConfigurationName]
  type MatchmakingIdList                   = js.Array[MatchmakingIdStringModel]
  type MatchmakingIdStringModel            = String
  type MatchmakingRequestTimeoutInteger    = Int
  type MatchmakingRuleSetArn               = String
  type MatchmakingRuleSetList              = js.Array[MatchmakingRuleSet]
  type MatchmakingRuleSetName              = String
  type MatchmakingRuleSetNameList          = js.Array[MatchmakingRuleSetName]
  type MatchmakingTicketList               = js.Array[MatchmakingTicket]
  type MaxConcurrentGameSessionActivations = Int
  type MetricGroup                         = String
  type MetricGroupList                     = js.Array[MetricGroup]
  type NonBlankAndLengthConstraintString   = String
  type NonBlankString                      = String
  type NonEmptyString                      = String
  type NonZeroAndMaxString                 = String
  type PlacedPlayerSessionList             = js.Array[PlacedPlayerSession]
  type PlayerAttributeMap                  = js.Dictionary[AttributeValue]
  type PlayerData                          = String
  type PlayerDataMap                       = js.Dictionary[PlayerData]
  type PlayerIdList                        = js.Array[NonZeroAndMaxString]
  type PlayerLatencyList                   = js.Array[PlayerLatency]
  type PlayerLatencyPolicyList             = js.Array[PlayerLatencyPolicy]
  type PlayerList                          = js.Array[Player]
  type PlayerSessionId                     = String
  type PlayerSessionList                   = js.Array[PlayerSession]
  type PortNumber                          = Int
  type PositiveInteger                     = Int
  type PositiveLong                        = Double
  type QueueArnsList                       = js.Array[ArnStringModel]
  type RuleSetBody                         = String
  type RuleSetLimit                        = Int
  type ScalingPolicyList                   = js.Array[ScalingPolicy]
  type ScriptArn                           = String
  type ScriptId                            = String
  type ScriptList                          = js.Array[Script]
  type ServerProcessList                   = js.Array[ServerProcess]
  type SnsArnStringModel                   = String
  type StringDoubleMap                     = js.Dictionary[DoubleObject]
  type StringList                          = js.Array[NonZeroAndMaxString]
  type StringModel                         = String
  type TagKey                              = String
  type TagKeyList                          = js.Array[TagKey]
  type TagList                             = js.Array[Tag]
  type TagValue                            = String
  type Timestamp                           = js.Date
  type VpcPeeringAuthorizationList         = js.Array[VpcPeeringAuthorization]
  type VpcPeeringConnectionList            = js.Array[VpcPeeringConnection]
  type WholeNumber                         = Int
  type ZipBlob                             = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String

  implicit final class GameLiftOps(private val service: GameLift) extends AnyVal {

    @inline def acceptMatchFuture(params: AcceptMatchInput): Future[AcceptMatchOutput] =
      service.acceptMatch(params).promise().toFuture
    @inline def createAliasFuture(params: CreateAliasInput): Future[CreateAliasOutput] =
      service.createAlias(params).promise().toFuture
    @inline def createBuildFuture(params: CreateBuildInput): Future[CreateBuildOutput] =
      service.createBuild(params).promise().toFuture
    @inline def createFleetFuture(params: CreateFleetInput): Future[CreateFleetOutput] =
      service.createFleet(params).promise().toFuture
    @inline def createGameSessionFuture(params: CreateGameSessionInput): Future[CreateGameSessionOutput] =
      service.createGameSession(params).promise().toFuture
    @inline def createGameSessionQueueFuture(
        params: CreateGameSessionQueueInput
    ): Future[CreateGameSessionQueueOutput] = service.createGameSessionQueue(params).promise().toFuture
    @inline def createMatchmakingConfigurationFuture(
        params: CreateMatchmakingConfigurationInput
    ): Future[CreateMatchmakingConfigurationOutput] = service.createMatchmakingConfiguration(params).promise().toFuture
    @inline def createMatchmakingRuleSetFuture(
        params: CreateMatchmakingRuleSetInput
    ): Future[CreateMatchmakingRuleSetOutput] = service.createMatchmakingRuleSet(params).promise().toFuture
    @inline def createPlayerSessionFuture(params: CreatePlayerSessionInput): Future[CreatePlayerSessionOutput] =
      service.createPlayerSession(params).promise().toFuture
    @inline def createPlayerSessionsFuture(params: CreatePlayerSessionsInput): Future[CreatePlayerSessionsOutput] =
      service.createPlayerSessions(params).promise().toFuture
    @inline def createScriptFuture(params: CreateScriptInput): Future[CreateScriptOutput] =
      service.createScript(params).promise().toFuture
    @inline def createVpcPeeringAuthorizationFuture(
        params: CreateVpcPeeringAuthorizationInput
    ): Future[CreateVpcPeeringAuthorizationOutput] = service.createVpcPeeringAuthorization(params).promise().toFuture
    @inline def createVpcPeeringConnectionFuture(
        params: CreateVpcPeeringConnectionInput
    ): Future[CreateVpcPeeringConnectionOutput] = service.createVpcPeeringConnection(params).promise().toFuture
    @inline def deleteAliasFuture(params: DeleteAliasInput): Future[js.Object] =
      service.deleteAlias(params).promise().toFuture
    @inline def deleteBuildFuture(params: DeleteBuildInput): Future[js.Object] =
      service.deleteBuild(params).promise().toFuture
    @inline def deleteFleetFuture(params: DeleteFleetInput): Future[js.Object] =
      service.deleteFleet(params).promise().toFuture
    @inline def deleteGameSessionQueueFuture(
        params: DeleteGameSessionQueueInput
    ): Future[DeleteGameSessionQueueOutput] = service.deleteGameSessionQueue(params).promise().toFuture
    @inline def deleteMatchmakingConfigurationFuture(
        params: DeleteMatchmakingConfigurationInput
    ): Future[DeleteMatchmakingConfigurationOutput] = service.deleteMatchmakingConfiguration(params).promise().toFuture
    @inline def deleteMatchmakingRuleSetFuture(
        params: DeleteMatchmakingRuleSetInput
    ): Future[DeleteMatchmakingRuleSetOutput] = service.deleteMatchmakingRuleSet(params).promise().toFuture
    @inline def deleteScalingPolicyFuture(params: DeleteScalingPolicyInput): Future[js.Object] =
      service.deleteScalingPolicy(params).promise().toFuture
    @inline def deleteScriptFuture(params: DeleteScriptInput): Future[js.Object] =
      service.deleteScript(params).promise().toFuture
    @inline def deleteVpcPeeringAuthorizationFuture(
        params: DeleteVpcPeeringAuthorizationInput
    ): Future[DeleteVpcPeeringAuthorizationOutput] = service.deleteVpcPeeringAuthorization(params).promise().toFuture
    @inline def deleteVpcPeeringConnectionFuture(
        params: DeleteVpcPeeringConnectionInput
    ): Future[DeleteVpcPeeringConnectionOutput] = service.deleteVpcPeeringConnection(params).promise().toFuture
    @inline def describeAliasFuture(params: DescribeAliasInput): Future[DescribeAliasOutput] =
      service.describeAlias(params).promise().toFuture
    @inline def describeBuildFuture(params: DescribeBuildInput): Future[DescribeBuildOutput] =
      service.describeBuild(params).promise().toFuture
    @inline def describeEC2InstanceLimitsFuture(
        params: DescribeEC2InstanceLimitsInput
    ): Future[DescribeEC2InstanceLimitsOutput] = service.describeEC2InstanceLimits(params).promise().toFuture
    @inline def describeFleetAttributesFuture(
        params: DescribeFleetAttributesInput
    ): Future[DescribeFleetAttributesOutput] = service.describeFleetAttributes(params).promise().toFuture
    @inline def describeFleetCapacityFuture(params: DescribeFleetCapacityInput): Future[DescribeFleetCapacityOutput] =
      service.describeFleetCapacity(params).promise().toFuture
    @inline def describeFleetEventsFuture(params: DescribeFleetEventsInput): Future[DescribeFleetEventsOutput] =
      service.describeFleetEvents(params).promise().toFuture
    @inline def describeFleetPortSettingsFuture(
        params: DescribeFleetPortSettingsInput
    ): Future[DescribeFleetPortSettingsOutput] = service.describeFleetPortSettings(params).promise().toFuture
    @inline def describeFleetUtilizationFuture(
        params: DescribeFleetUtilizationInput
    ): Future[DescribeFleetUtilizationOutput] = service.describeFleetUtilization(params).promise().toFuture
    @inline def describeGameSessionDetailsFuture(
        params: DescribeGameSessionDetailsInput
    ): Future[DescribeGameSessionDetailsOutput] = service.describeGameSessionDetails(params).promise().toFuture
    @inline def describeGameSessionPlacementFuture(
        params: DescribeGameSessionPlacementInput
    ): Future[DescribeGameSessionPlacementOutput] = service.describeGameSessionPlacement(params).promise().toFuture
    @inline def describeGameSessionQueuesFuture(
        params: DescribeGameSessionQueuesInput
    ): Future[DescribeGameSessionQueuesOutput] = service.describeGameSessionQueues(params).promise().toFuture
    @inline def describeGameSessionsFuture(params: DescribeGameSessionsInput): Future[DescribeGameSessionsOutput] =
      service.describeGameSessions(params).promise().toFuture
    @inline def describeInstancesFuture(params: DescribeInstancesInput): Future[DescribeInstancesOutput] =
      service.describeInstances(params).promise().toFuture
    @inline def describeMatchmakingConfigurationsFuture(
        params: DescribeMatchmakingConfigurationsInput
    ): Future[DescribeMatchmakingConfigurationsOutput] =
      service.describeMatchmakingConfigurations(params).promise().toFuture
    @inline def describeMatchmakingFuture(params: DescribeMatchmakingInput): Future[DescribeMatchmakingOutput] =
      service.describeMatchmaking(params).promise().toFuture
    @inline def describeMatchmakingRuleSetsFuture(
        params: DescribeMatchmakingRuleSetsInput
    ): Future[DescribeMatchmakingRuleSetsOutput] = service.describeMatchmakingRuleSets(params).promise().toFuture
    @inline def describePlayerSessionsFuture(
        params: DescribePlayerSessionsInput
    ): Future[DescribePlayerSessionsOutput] = service.describePlayerSessions(params).promise().toFuture
    @inline def describeRuntimeConfigurationFuture(
        params: DescribeRuntimeConfigurationInput
    ): Future[DescribeRuntimeConfigurationOutput] = service.describeRuntimeConfiguration(params).promise().toFuture
    @inline def describeScalingPoliciesFuture(
        params: DescribeScalingPoliciesInput
    ): Future[DescribeScalingPoliciesOutput] = service.describeScalingPolicies(params).promise().toFuture
    @inline def describeScriptFuture(params: DescribeScriptInput): Future[DescribeScriptOutput] =
      service.describeScript(params).promise().toFuture
    @inline def describeVpcPeeringAuthorizationsFuture(
        params: DescribeVpcPeeringAuthorizationsInput
    ): Future[DescribeVpcPeeringAuthorizationsOutput] =
      service.describeVpcPeeringAuthorizations(params).promise().toFuture
    @inline def describeVpcPeeringConnectionsFuture(
        params: DescribeVpcPeeringConnectionsInput
    ): Future[DescribeVpcPeeringConnectionsOutput] = service.describeVpcPeeringConnections(params).promise().toFuture
    @inline def getGameSessionLogUrlFuture(params: GetGameSessionLogUrlInput): Future[GetGameSessionLogUrlOutput] =
      service.getGameSessionLogUrl(params).promise().toFuture
    @inline def getInstanceAccessFuture(params: GetInstanceAccessInput): Future[GetInstanceAccessOutput] =
      service.getInstanceAccess(params).promise().toFuture
    @inline def listAliasesFuture(params: ListAliasesInput): Future[ListAliasesOutput] =
      service.listAliases(params).promise().toFuture
    @inline def listBuildsFuture(params: ListBuildsInput): Future[ListBuildsOutput] =
      service.listBuilds(params).promise().toFuture
    @inline def listFleetsFuture(params: ListFleetsInput): Future[ListFleetsOutput] =
      service.listFleets(params).promise().toFuture
    @inline def listScriptsFuture(params: ListScriptsInput): Future[ListScriptsOutput] =
      service.listScripts(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def putScalingPolicyFuture(params: PutScalingPolicyInput): Future[PutScalingPolicyOutput] =
      service.putScalingPolicy(params).promise().toFuture
    @inline def requestUploadCredentialsFuture(
        params: RequestUploadCredentialsInput
    ): Future[RequestUploadCredentialsOutput] = service.requestUploadCredentials(params).promise().toFuture
    @inline def resolveAliasFuture(params: ResolveAliasInput): Future[ResolveAliasOutput] =
      service.resolveAlias(params).promise().toFuture
    @inline def searchGameSessionsFuture(params: SearchGameSessionsInput): Future[SearchGameSessionsOutput] =
      service.searchGameSessions(params).promise().toFuture
    @inline def startFleetActionsFuture(params: StartFleetActionsInput): Future[StartFleetActionsOutput] =
      service.startFleetActions(params).promise().toFuture
    @inline def startGameSessionPlacementFuture(
        params: StartGameSessionPlacementInput
    ): Future[StartGameSessionPlacementOutput] = service.startGameSessionPlacement(params).promise().toFuture
    @inline def startMatchBackfillFuture(params: StartMatchBackfillInput): Future[StartMatchBackfillOutput] =
      service.startMatchBackfill(params).promise().toFuture
    @inline def startMatchmakingFuture(params: StartMatchmakingInput): Future[StartMatchmakingOutput] =
      service.startMatchmaking(params).promise().toFuture
    @inline def stopFleetActionsFuture(params: StopFleetActionsInput): Future[StopFleetActionsOutput] =
      service.stopFleetActions(params).promise().toFuture
    @inline def stopGameSessionPlacementFuture(
        params: StopGameSessionPlacementInput
    ): Future[StopGameSessionPlacementOutput] = service.stopGameSessionPlacement(params).promise().toFuture
    @inline def stopMatchmakingFuture(params: StopMatchmakingInput): Future[StopMatchmakingOutput] =
      service.stopMatchmaking(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateAliasFuture(params: UpdateAliasInput): Future[UpdateAliasOutput] =
      service.updateAlias(params).promise().toFuture
    @inline def updateBuildFuture(params: UpdateBuildInput): Future[UpdateBuildOutput] =
      service.updateBuild(params).promise().toFuture
    @inline def updateFleetAttributesFuture(params: UpdateFleetAttributesInput): Future[UpdateFleetAttributesOutput] =
      service.updateFleetAttributes(params).promise().toFuture
    @inline def updateFleetCapacityFuture(params: UpdateFleetCapacityInput): Future[UpdateFleetCapacityOutput] =
      service.updateFleetCapacity(params).promise().toFuture
    @inline def updateFleetPortSettingsFuture(
        params: UpdateFleetPortSettingsInput
    ): Future[UpdateFleetPortSettingsOutput] = service.updateFleetPortSettings(params).promise().toFuture
    @inline def updateGameSessionFuture(params: UpdateGameSessionInput): Future[UpdateGameSessionOutput] =
      service.updateGameSession(params).promise().toFuture
    @inline def updateGameSessionQueueFuture(
        params: UpdateGameSessionQueueInput
    ): Future[UpdateGameSessionQueueOutput] = service.updateGameSessionQueue(params).promise().toFuture
    @inline def updateMatchmakingConfigurationFuture(
        params: UpdateMatchmakingConfigurationInput
    ): Future[UpdateMatchmakingConfigurationOutput] = service.updateMatchmakingConfiguration(params).promise().toFuture
    @inline def updateRuntimeConfigurationFuture(
        params: UpdateRuntimeConfigurationInput
    ): Future[UpdateRuntimeConfigurationOutput] = service.updateRuntimeConfiguration(params).promise().toFuture
    @inline def updateScriptFuture(params: UpdateScriptInput): Future[UpdateScriptOutput] =
      service.updateScript(params).promise().toFuture
    @inline def validateMatchmakingRuleSetFuture(
        params: ValidateMatchmakingRuleSetInput
    ): Future[ValidateMatchmakingRuleSetOutput] = service.validateMatchmakingRuleSet(params).promise().toFuture
  }
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
    def createScript(params: CreateScriptInput): Request[CreateScriptOutput]                         = js.native
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
    def deleteScript(params: DeleteScriptInput): Request[js.Object]               = js.native
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
    def describeScript(params: DescribeScriptInput): Request[DescribeScriptOutput] = js.native
    def describeVpcPeeringAuthorizations(
        params: DescribeVpcPeeringAuthorizationsInput
    ): Request[DescribeVpcPeeringAuthorizationsOutput] = js.native
    def describeVpcPeeringConnections(
        params: DescribeVpcPeeringConnectionsInput
    ): Request[DescribeVpcPeeringConnectionsOutput]                                                   = js.native
    def getGameSessionLogUrl(params: GetGameSessionLogUrlInput): Request[GetGameSessionLogUrlOutput]  = js.native
    def getInstanceAccess(params: GetInstanceAccessInput): Request[GetInstanceAccessOutput]           = js.native
    def listAliases(params: ListAliasesInput): Request[ListAliasesOutput]                             = js.native
    def listBuilds(params: ListBuildsInput): Request[ListBuildsOutput]                                = js.native
    def listFleets(params: ListFleetsInput): Request[ListFleetsOutput]                                = js.native
    def listScripts(params: ListScriptsInput): Request[ListScriptsOutput]                             = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putScalingPolicy(params: PutScalingPolicyInput): Request[PutScalingPolicyOutput]              = js.native
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
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                           = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                     = js.native
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
    def updateScript(params: UpdateScriptInput): Request[UpdateScriptOutput] = js.native
    def validateMatchmakingRuleSet(params: ValidateMatchmakingRuleSetInput): Request[ValidateMatchmakingRuleSetOutput] =
      js.native
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait AcceptMatchInput extends js.Object {
    var AcceptanceType: AcceptanceType
    var PlayerIds: StringList
    var TicketId: MatchmakingIdStringModel
  }

  @js.native
  @Factory
  trait AcceptMatchOutput extends js.Object {}

  @js.native
  sealed trait AcceptanceType extends js.Any
  object AcceptanceType extends js.Object {
    val ACCEPT = "ACCEPT".asInstanceOf[AcceptanceType]
    val REJECT = "REJECT".asInstanceOf[AcceptanceType]

    val values = js.Object.freeze(js.Array(ACCEPT, REJECT))
  }

  /**
    * Properties that describe an alias resource.
    * * <a>CreateAlias</a>
    *  * <a>ListAliases</a>
    *  * <a>DescribeAlias</a>
    *  * <a>UpdateAlias</a>
    *  * <a>DeleteAlias</a>
    *  * <a>ResolveAlias</a>
    */
  @js.native
  @Factory
  trait Alias extends js.Object {
    var AliasArn: js.UndefOr[ArnStringModel]
    var AliasId: js.UndefOr[AliasId]
    var CreationTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[FreeText]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[NonBlankAndLengthConstraintString]
    var RoutingStrategy: js.UndefOr[RoutingStrategy]
  }

  /**
    * Values for use in <a>Player</a> attribute key-value pairs. This object lets you specify an attribute value using any of the valid data types: string, number, string array, or data map. Each <code>AttributeValue</code> object can use only one of the available properties.
    */
  @js.native
  @Factory
  trait AttributeValue extends js.Object {
    var N: js.UndefOr[DoubleObject]
    var S: js.UndefOr[NonZeroAndMaxString]
    var SDM: js.UndefOr[StringDoubleMap]
    var SL: js.UndefOr[StringList]
  }

  /**
    * Temporary access credentials used for uploading game build files to Amazon GameLift. They are valid for a limited time. If they expire before you upload your game build, get a new set by calling <a>RequestUploadCredentials</a>.
    */
  @js.native
  @Factory
  trait AwsCredentials extends js.Object {
    var AccessKeyId: js.UndefOr[NonEmptyString]
    var SecretAccessKey: js.UndefOr[NonEmptyString]
    var SessionToken: js.UndefOr[NonEmptyString]
  }

  @js.native
  sealed trait BackfillMode extends js.Any
  object BackfillMode extends js.Object {
    val AUTOMATIC = "AUTOMATIC".asInstanceOf[BackfillMode]
    val MANUAL    = "MANUAL".asInstanceOf[BackfillMode]

    val values = js.Object.freeze(js.Array(AUTOMATIC, MANUAL))
  }

  /**
    * Properties describing a custom game build.
    *  ```Related operations```
    * * <a>CreateBuild</a>
    *  * <a>ListBuilds</a>
    *  * <a>DescribeBuild</a>
    *  * <a>UpdateBuild</a>
    *  * <a>DeleteBuild</a>
    */
  @js.native
  @Factory
  trait Build extends js.Object {
    var BuildArn: js.UndefOr[BuildArn]
    var BuildId: js.UndefOr[BuildId]
    var CreationTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[FreeText]
    var OperatingSystem: js.UndefOr[OperatingSystem]
    var SizeOnDisk: js.UndefOr[PositiveLong]
    var Status: js.UndefOr[BuildStatus]
    var Version: js.UndefOr[FreeText]
  }

  @js.native
  sealed trait BuildStatus extends js.Any
  object BuildStatus extends js.Object {
    val INITIALIZED = "INITIALIZED".asInstanceOf[BuildStatus]
    val READY       = "READY".asInstanceOf[BuildStatus]
    val FAILED      = "FAILED".asInstanceOf[BuildStatus]

    val values = js.Object.freeze(js.Array(INITIALIZED, READY, FAILED))
  }

  /**
    * Information about the use of a TLS/SSL certificate for a fleet. TLS certificate generation is enabled at the fleet level, with one certificate generated for the fleet. When this feature is enabled, the certificate can be retrieved using the [[https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-serversdk.html|GameLift Server SDK]] call <code>GetInstanceCertificate</code>. All instances in a fleet share the same certificate.
    */
  @js.native
  @Factory
  trait CertificateConfiguration extends js.Object {
    var CertificateType: CertificateType
  }

  @js.native
  sealed trait CertificateType extends js.Any
  object CertificateType extends js.Object {
    val DISABLED  = "DISABLED".asInstanceOf[CertificateType]
    val GENERATED = "GENERATED".asInstanceOf[CertificateType]

    val values = js.Object.freeze(js.Array(DISABLED, GENERATED))
  }

  @js.native
  sealed trait ComparisonOperatorType extends js.Any
  object ComparisonOperatorType extends js.Object {
    val GreaterThanOrEqualToThreshold = "GreaterThanOrEqualToThreshold".asInstanceOf[ComparisonOperatorType]
    val GreaterThanThreshold          = "GreaterThanThreshold".asInstanceOf[ComparisonOperatorType]
    val LessThanThreshold             = "LessThanThreshold".asInstanceOf[ComparisonOperatorType]
    val LessThanOrEqualToThreshold    = "LessThanOrEqualToThreshold".asInstanceOf[ComparisonOperatorType]

    val values = js.Object.freeze(
      js.Array(GreaterThanOrEqualToThreshold, GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold)
    )
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait CreateAliasInput extends js.Object {
    var Name: NonBlankAndLengthConstraintString
    var RoutingStrategy: RoutingStrategy
    var Description: js.UndefOr[NonZeroAndMaxString]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait CreateAliasOutput extends js.Object {
    var Alias: js.UndefOr[Alias]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait CreateBuildInput extends js.Object {
    var Name: js.UndefOr[NonZeroAndMaxString]
    var OperatingSystem: js.UndefOr[OperatingSystem]
    var StorageLocation: js.UndefOr[S3Location]
    var Tags: js.UndefOr[TagList]
    var Version: js.UndefOr[NonZeroAndMaxString]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait CreateBuildOutput extends js.Object {
    var Build: js.UndefOr[Build]
    var StorageLocation: js.UndefOr[S3Location]
    var UploadCredentials: js.UndefOr[AwsCredentials]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait CreateFleetInput extends js.Object {
    var EC2InstanceType: EC2InstanceType
    var Name: NonZeroAndMaxString
    var BuildId: js.UndefOr[BuildId]
    var CertificateConfiguration: js.UndefOr[CertificateConfiguration]
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
    var ScriptId: js.UndefOr[ScriptId]
    var ServerLaunchParameters: js.UndefOr[NonZeroAndMaxString]
    var ServerLaunchPath: js.UndefOr[NonZeroAndMaxString]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait CreateFleetOutput extends js.Object {
    var FleetAttributes: js.UndefOr[FleetAttributes]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
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

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait CreateGameSessionOutput extends js.Object {
    var GameSession: js.UndefOr[GameSession]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait CreateGameSessionQueueInput extends js.Object {
    var Name: GameSessionQueueName
    var Destinations: js.UndefOr[GameSessionQueueDestinationList]
    var PlayerLatencyPolicies: js.UndefOr[PlayerLatencyPolicyList]
    var Tags: js.UndefOr[TagList]
    var TimeoutInSeconds: js.UndefOr[WholeNumber]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait CreateGameSessionQueueOutput extends js.Object {
    var GameSessionQueue: js.UndefOr[GameSessionQueue]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait CreateMatchmakingConfigurationInput extends js.Object {
    var AcceptanceRequired: BooleanModel
    var GameSessionQueueArns: QueueArnsList
    var Name: MatchmakingIdStringModel
    var RequestTimeoutSeconds: MatchmakingRequestTimeoutInteger
    var RuleSetName: MatchmakingRuleSetName
    var AcceptanceTimeoutSeconds: js.UndefOr[MatchmakingAcceptanceTimeoutInteger]
    var AdditionalPlayerCount: js.UndefOr[WholeNumber]
    var BackfillMode: js.UndefOr[BackfillMode]
    var CustomEventData: js.UndefOr[CustomEventData]
    var Description: js.UndefOr[NonZeroAndMaxString]
    var GameProperties: js.UndefOr[GamePropertyList]
    var GameSessionData: js.UndefOr[GameSessionData]
    var NotificationTarget: js.UndefOr[SnsArnStringModel]
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait CreateMatchmakingConfigurationOutput extends js.Object {
    var Configuration: js.UndefOr[MatchmakingConfiguration]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait CreateMatchmakingRuleSetInput extends js.Object {
    var Name: MatchmakingIdStringModel
    var RuleSetBody: RuleSetBody
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait CreateMatchmakingRuleSetOutput extends js.Object {
    var RuleSet: MatchmakingRuleSet
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait CreatePlayerSessionInput extends js.Object {
    var GameSessionId: ArnStringModel
    var PlayerId: NonZeroAndMaxString
    var PlayerData: js.UndefOr[PlayerData]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait CreatePlayerSessionOutput extends js.Object {
    var PlayerSession: js.UndefOr[PlayerSession]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait CreatePlayerSessionsInput extends js.Object {
    var GameSessionId: ArnStringModel
    var PlayerIds: PlayerIdList
    var PlayerDataMap: js.UndefOr[PlayerDataMap]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait CreatePlayerSessionsOutput extends js.Object {
    var PlayerSessions: js.UndefOr[PlayerSessionList]
  }

  @js.native
  @Factory
  trait CreateScriptInput extends js.Object {
    var Name: js.UndefOr[NonZeroAndMaxString]
    var StorageLocation: js.UndefOr[S3Location]
    var Tags: js.UndefOr[TagList]
    var Version: js.UndefOr[NonZeroAndMaxString]
    var ZipFile: js.UndefOr[ZipBlob]
  }

  @js.native
  @Factory
  trait CreateScriptOutput extends js.Object {
    var Script: js.UndefOr[Script]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait CreateVpcPeeringAuthorizationInput extends js.Object {
    var GameLiftAwsAccountId: NonZeroAndMaxString
    var PeerVpcId: NonZeroAndMaxString
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait CreateVpcPeeringAuthorizationOutput extends js.Object {
    var VpcPeeringAuthorization: js.UndefOr[VpcPeeringAuthorization]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait CreateVpcPeeringConnectionInput extends js.Object {
    var FleetId: FleetId
    var PeerVpcAwsAccountId: NonZeroAndMaxString
    var PeerVpcId: NonZeroAndMaxString
  }

  @js.native
  @Factory
  trait CreateVpcPeeringConnectionOutput extends js.Object {}

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait DeleteAliasInput extends js.Object {
    var AliasId: AliasId
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait DeleteBuildInput extends js.Object {
    var BuildId: BuildId
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait DeleteFleetInput extends js.Object {
    var FleetId: FleetId
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait DeleteGameSessionQueueInput extends js.Object {
    var Name: GameSessionQueueName
  }

  @js.native
  @Factory
  trait DeleteGameSessionQueueOutput extends js.Object {}

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait DeleteMatchmakingConfigurationInput extends js.Object {
    var Name: MatchmakingConfigurationName
  }

  @js.native
  @Factory
  trait DeleteMatchmakingConfigurationOutput extends js.Object {}

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait DeleteMatchmakingRuleSetInput extends js.Object {
    var Name: MatchmakingRuleSetName
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait DeleteMatchmakingRuleSetOutput extends js.Object {}

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait DeleteScalingPolicyInput extends js.Object {
    var FleetId: FleetId
    var Name: NonZeroAndMaxString
  }

  @js.native
  @Factory
  trait DeleteScriptInput extends js.Object {
    var ScriptId: ScriptId
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait DeleteVpcPeeringAuthorizationInput extends js.Object {
    var GameLiftAwsAccountId: NonZeroAndMaxString
    var PeerVpcId: NonZeroAndMaxString
  }

  @js.native
  @Factory
  trait DeleteVpcPeeringAuthorizationOutput extends js.Object {}

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait DeleteVpcPeeringConnectionInput extends js.Object {
    var FleetId: FleetId
    var VpcPeeringConnectionId: NonZeroAndMaxString
  }

  @js.native
  @Factory
  trait DeleteVpcPeeringConnectionOutput extends js.Object {}

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait DescribeAliasInput extends js.Object {
    var AliasId: AliasId
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait DescribeAliasOutput extends js.Object {
    var Alias: js.UndefOr[Alias]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait DescribeBuildInput extends js.Object {
    var BuildId: BuildId
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait DescribeBuildOutput extends js.Object {
    var Build: js.UndefOr[Build]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait DescribeEC2InstanceLimitsInput extends js.Object {
    var EC2InstanceType: js.UndefOr[EC2InstanceType]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait DescribeEC2InstanceLimitsOutput extends js.Object {
    var EC2InstanceLimits: js.UndefOr[EC2InstanceLimitList]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait DescribeFleetAttributesInput extends js.Object {
    var FleetIds: js.UndefOr[FleetIdList]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait DescribeFleetAttributesOutput extends js.Object {
    var FleetAttributes: js.UndefOr[FleetAttributesList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait DescribeFleetCapacityInput extends js.Object {
    var FleetIds: js.UndefOr[FleetIdList]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait DescribeFleetCapacityOutput extends js.Object {
    var FleetCapacity: js.UndefOr[FleetCapacityList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait DescribeFleetEventsInput extends js.Object {
    var FleetId: FleetId
    var EndTime: js.UndefOr[Timestamp]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
    var StartTime: js.UndefOr[Timestamp]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait DescribeFleetEventsOutput extends js.Object {
    var Events: js.UndefOr[EventList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait DescribeFleetPortSettingsInput extends js.Object {
    var FleetId: FleetId
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait DescribeFleetPortSettingsOutput extends js.Object {
    var InboundPermissions: js.UndefOr[IpPermissionsList]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait DescribeFleetUtilizationInput extends js.Object {
    var FleetIds: js.UndefOr[FleetIdList]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait DescribeFleetUtilizationOutput extends js.Object {
    var FleetUtilization: js.UndefOr[FleetUtilizationList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait DescribeGameSessionDetailsInput extends js.Object {
    var AliasId: js.UndefOr[AliasId]
    var FleetId: js.UndefOr[FleetId]
    var GameSessionId: js.UndefOr[ArnStringModel]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
    var StatusFilter: js.UndefOr[NonZeroAndMaxString]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait DescribeGameSessionDetailsOutput extends js.Object {
    var GameSessionDetails: js.UndefOr[GameSessionDetailList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait DescribeGameSessionPlacementInput extends js.Object {
    var PlacementId: IdStringModel
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait DescribeGameSessionPlacementOutput extends js.Object {
    var GameSessionPlacement: js.UndefOr[GameSessionPlacement]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait DescribeGameSessionQueuesInput extends js.Object {
    var Limit: js.UndefOr[PositiveInteger]
    var Names: js.UndefOr[GameSessionQueueNameList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait DescribeGameSessionQueuesOutput extends js.Object {
    var GameSessionQueues: js.UndefOr[GameSessionQueueList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait DescribeGameSessionsInput extends js.Object {
    var AliasId: js.UndefOr[AliasId]
    var FleetId: js.UndefOr[FleetId]
    var GameSessionId: js.UndefOr[ArnStringModel]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
    var StatusFilter: js.UndefOr[NonZeroAndMaxString]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait DescribeGameSessionsOutput extends js.Object {
    var GameSessions: js.UndefOr[GameSessionList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait DescribeInstancesInput extends js.Object {
    var FleetId: FleetId
    var InstanceId: js.UndefOr[InstanceId]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait DescribeInstancesOutput extends js.Object {
    var Instances: js.UndefOr[InstanceList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait DescribeMatchmakingConfigurationsInput extends js.Object {
    var Limit: js.UndefOr[PositiveInteger]
    var Names: js.UndefOr[MatchmakingConfigurationNameList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
    var RuleSetName: js.UndefOr[MatchmakingRuleSetName]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait DescribeMatchmakingConfigurationsOutput extends js.Object {
    var Configurations: js.UndefOr[MatchmakingConfigurationList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait DescribeMatchmakingInput extends js.Object {
    var TicketIds: MatchmakingIdList
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait DescribeMatchmakingOutput extends js.Object {
    var TicketList: js.UndefOr[MatchmakingTicketList]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait DescribeMatchmakingRuleSetsInput extends js.Object {
    var Limit: js.UndefOr[RuleSetLimit]
    var Names: js.UndefOr[MatchmakingRuleSetNameList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait DescribeMatchmakingRuleSetsOutput extends js.Object {
    var RuleSets: MatchmakingRuleSetList
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait DescribePlayerSessionsInput extends js.Object {
    var GameSessionId: js.UndefOr[ArnStringModel]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
    var PlayerId: js.UndefOr[NonZeroAndMaxString]
    var PlayerSessionId: js.UndefOr[PlayerSessionId]
    var PlayerSessionStatusFilter: js.UndefOr[NonZeroAndMaxString]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait DescribePlayerSessionsOutput extends js.Object {
    var NextToken: js.UndefOr[NonZeroAndMaxString]
    var PlayerSessions: js.UndefOr[PlayerSessionList]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait DescribeRuntimeConfigurationInput extends js.Object {
    var FleetId: FleetId
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait DescribeRuntimeConfigurationOutput extends js.Object {
    var RuntimeConfiguration: js.UndefOr[RuntimeConfiguration]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait DescribeScalingPoliciesInput extends js.Object {
    var FleetId: FleetId
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
    var StatusFilter: js.UndefOr[ScalingStatusType]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait DescribeScalingPoliciesOutput extends js.Object {
    var NextToken: js.UndefOr[NonZeroAndMaxString]
    var ScalingPolicies: js.UndefOr[ScalingPolicyList]
  }

  @js.native
  @Factory
  trait DescribeScriptInput extends js.Object {
    var ScriptId: ScriptId
  }

  @js.native
  @Factory
  trait DescribeScriptOutput extends js.Object {
    var Script: js.UndefOr[Script]
  }

  @js.native
  @Factory
  trait DescribeVpcPeeringAuthorizationsInput extends js.Object {}

  @js.native
  @Factory
  trait DescribeVpcPeeringAuthorizationsOutput extends js.Object {
    var VpcPeeringAuthorizations: js.UndefOr[VpcPeeringAuthorizationList]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait DescribeVpcPeeringConnectionsInput extends js.Object {
    var FleetId: js.UndefOr[FleetId]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait DescribeVpcPeeringConnectionsOutput extends js.Object {
    var VpcPeeringConnections: js.UndefOr[VpcPeeringConnectionList]
  }

  /**
    * Player information for use when creating player sessions using a game session placement request with <a>StartGameSessionPlacement</a>.
    */
  @js.native
  @Factory
  trait DesiredPlayerSession extends js.Object {
    var PlayerData: js.UndefOr[PlayerData]
    var PlayerId: js.UndefOr[NonZeroAndMaxString]
  }

  /**
    * Current status of fleet capacity. The number of active instances should match or be in the process of matching the number of desired instances. Pending and terminating counts are non-zero only if fleet capacity is adjusting to an <a>UpdateFleetCapacity</a> request, or if access to resources is temporarily affected.
    * * <a>CreateFleet</a>
    *  * <a>ListFleets</a>
    *  * <a>DeleteFleet</a>
    *  * <a>DescribeFleetAttributes</a>
    *  * <a>UpdateFleetAttributes</a>
    *  * Manage fleet actions:
    * <li> <a>StartFleetActions</a>
    *  * <a>StopFleetActions</a>
    * </li>
    */
  @js.native
  @Factory
  trait EC2InstanceCounts extends js.Object {
    var ACTIVE: js.UndefOr[WholeNumber]
    var DESIRED: js.UndefOr[WholeNumber]
    var IDLE: js.UndefOr[WholeNumber]
    var MAXIMUM: js.UndefOr[WholeNumber]
    var MINIMUM: js.UndefOr[WholeNumber]
    var PENDING: js.UndefOr[WholeNumber]
    var TERMINATING: js.UndefOr[WholeNumber]
  }

  /**
    * The maximum number of instances allowed based on the Amazon Elastic Compute Cloud (Amazon EC2) instance type. Instance limits can be retrieved by calling <a>DescribeEC2InstanceLimits</a>.
    */
  @js.native
  @Factory
  trait EC2InstanceLimit extends js.Object {
    var CurrentInstances: js.UndefOr[WholeNumber]
    var EC2InstanceType: js.UndefOr[EC2InstanceType]
    var InstanceLimit: js.UndefOr[WholeNumber]
  }

  @js.native
  sealed trait EC2InstanceType extends js.Any
  object EC2InstanceType extends js.Object {
    val `t2.micro`    = "t2.micro".asInstanceOf[EC2InstanceType]
    val `t2.small`    = "t2.small".asInstanceOf[EC2InstanceType]
    val `t2.medium`   = "t2.medium".asInstanceOf[EC2InstanceType]
    val `t2.large`    = "t2.large".asInstanceOf[EC2InstanceType]
    val `c3.large`    = "c3.large".asInstanceOf[EC2InstanceType]
    val `c3.xlarge`   = "c3.xlarge".asInstanceOf[EC2InstanceType]
    val `c3.2xlarge`  = "c3.2xlarge".asInstanceOf[EC2InstanceType]
    val `c3.4xlarge`  = "c3.4xlarge".asInstanceOf[EC2InstanceType]
    val `c3.8xlarge`  = "c3.8xlarge".asInstanceOf[EC2InstanceType]
    val `c4.large`    = "c4.large".asInstanceOf[EC2InstanceType]
    val `c4.xlarge`   = "c4.xlarge".asInstanceOf[EC2InstanceType]
    val `c4.2xlarge`  = "c4.2xlarge".asInstanceOf[EC2InstanceType]
    val `c4.4xlarge`  = "c4.4xlarge".asInstanceOf[EC2InstanceType]
    val `c4.8xlarge`  = "c4.8xlarge".asInstanceOf[EC2InstanceType]
    val `c5.large`    = "c5.large".asInstanceOf[EC2InstanceType]
    val `c5.xlarge`   = "c5.xlarge".asInstanceOf[EC2InstanceType]
    val `c5.2xlarge`  = "c5.2xlarge".asInstanceOf[EC2InstanceType]
    val `c5.4xlarge`  = "c5.4xlarge".asInstanceOf[EC2InstanceType]
    val `c5.9xlarge`  = "c5.9xlarge".asInstanceOf[EC2InstanceType]
    val `c5.12xlarge` = "c5.12xlarge".asInstanceOf[EC2InstanceType]
    val `c5.18xlarge` = "c5.18xlarge".asInstanceOf[EC2InstanceType]
    val `c5.24xlarge` = "c5.24xlarge".asInstanceOf[EC2InstanceType]
    val `r3.large`    = "r3.large".asInstanceOf[EC2InstanceType]
    val `r3.xlarge`   = "r3.xlarge".asInstanceOf[EC2InstanceType]
    val `r3.2xlarge`  = "r3.2xlarge".asInstanceOf[EC2InstanceType]
    val `r3.4xlarge`  = "r3.4xlarge".asInstanceOf[EC2InstanceType]
    val `r3.8xlarge`  = "r3.8xlarge".asInstanceOf[EC2InstanceType]
    val `r4.large`    = "r4.large".asInstanceOf[EC2InstanceType]
    val `r4.xlarge`   = "r4.xlarge".asInstanceOf[EC2InstanceType]
    val `r4.2xlarge`  = "r4.2xlarge".asInstanceOf[EC2InstanceType]
    val `r4.4xlarge`  = "r4.4xlarge".asInstanceOf[EC2InstanceType]
    val `r4.8xlarge`  = "r4.8xlarge".asInstanceOf[EC2InstanceType]
    val `r4.16xlarge` = "r4.16xlarge".asInstanceOf[EC2InstanceType]
    val `r5.large`    = "r5.large".asInstanceOf[EC2InstanceType]
    val `r5.xlarge`   = "r5.xlarge".asInstanceOf[EC2InstanceType]
    val `r5.2xlarge`  = "r5.2xlarge".asInstanceOf[EC2InstanceType]
    val `r5.4xlarge`  = "r5.4xlarge".asInstanceOf[EC2InstanceType]
    val `r5.8xlarge`  = "r5.8xlarge".asInstanceOf[EC2InstanceType]
    val `r5.12xlarge` = "r5.12xlarge".asInstanceOf[EC2InstanceType]
    val `r5.16xlarge` = "r5.16xlarge".asInstanceOf[EC2InstanceType]
    val `r5.24xlarge` = "r5.24xlarge".asInstanceOf[EC2InstanceType]
    val `m3.medium`   = "m3.medium".asInstanceOf[EC2InstanceType]
    val `m3.large`    = "m3.large".asInstanceOf[EC2InstanceType]
    val `m3.xlarge`   = "m3.xlarge".asInstanceOf[EC2InstanceType]
    val `m3.2xlarge`  = "m3.2xlarge".asInstanceOf[EC2InstanceType]
    val `m4.large`    = "m4.large".asInstanceOf[EC2InstanceType]
    val `m4.xlarge`   = "m4.xlarge".asInstanceOf[EC2InstanceType]
    val `m4.2xlarge`  = "m4.2xlarge".asInstanceOf[EC2InstanceType]
    val `m4.4xlarge`  = "m4.4xlarge".asInstanceOf[EC2InstanceType]
    val `m4.10xlarge` = "m4.10xlarge".asInstanceOf[EC2InstanceType]
    val `m5.large`    = "m5.large".asInstanceOf[EC2InstanceType]
    val `m5.xlarge`   = "m5.xlarge".asInstanceOf[EC2InstanceType]
    val `m5.2xlarge`  = "m5.2xlarge".asInstanceOf[EC2InstanceType]
    val `m5.4xlarge`  = "m5.4xlarge".asInstanceOf[EC2InstanceType]
    val `m5.8xlarge`  = "m5.8xlarge".asInstanceOf[EC2InstanceType]
    val `m5.12xlarge` = "m5.12xlarge".asInstanceOf[EC2InstanceType]
    val `m5.16xlarge` = "m5.16xlarge".asInstanceOf[EC2InstanceType]
    val `m5.24xlarge` = "m5.24xlarge".asInstanceOf[EC2InstanceType]

    val values = js.Object.freeze(
      js.Array(
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
        `c5.large`,
        `c5.xlarge`,
        `c5.2xlarge`,
        `c5.4xlarge`,
        `c5.9xlarge`,
        `c5.12xlarge`,
        `c5.18xlarge`,
        `c5.24xlarge`,
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
        `r5.large`,
        `r5.xlarge`,
        `r5.2xlarge`,
        `r5.4xlarge`,
        `r5.8xlarge`,
        `r5.12xlarge`,
        `r5.16xlarge`,
        `r5.24xlarge`,
        `m3.medium`,
        `m3.large`,
        `m3.xlarge`,
        `m3.2xlarge`,
        `m4.large`,
        `m4.xlarge`,
        `m4.2xlarge`,
        `m4.4xlarge`,
        `m4.10xlarge`,
        `m5.large`,
        `m5.xlarge`,
        `m5.2xlarge`,
        `m5.4xlarge`,
        `m5.8xlarge`,
        `m5.12xlarge`,
        `m5.16xlarge`,
        `m5.24xlarge`
      )
    )
  }

  /**
    * Log entry describing an event that involves Amazon GameLift resources (such as a fleet). In addition to tracking activity, event codes and messages can provide additional information for troubleshooting and debugging problems.
    */
  @js.native
  @Factory
  trait Event extends js.Object {
    var EventCode: js.UndefOr[EventCode]
    var EventId: js.UndefOr[NonZeroAndMaxString]
    var EventTime: js.UndefOr[Timestamp]
    var Message: js.UndefOr[NonEmptyString]
    var PreSignedLogUrl: js.UndefOr[NonZeroAndMaxString]
    var ResourceId: js.UndefOr[NonZeroAndMaxString]
  }

  @js.native
  sealed trait EventCode extends js.Any
  object EventCode extends js.Object {
    val GENERIC_EVENT                          = "GENERIC_EVENT".asInstanceOf[EventCode]
    val FLEET_CREATED                          = "FLEET_CREATED".asInstanceOf[EventCode]
    val FLEET_DELETED                          = "FLEET_DELETED".asInstanceOf[EventCode]
    val FLEET_SCALING_EVENT                    = "FLEET_SCALING_EVENT".asInstanceOf[EventCode]
    val FLEET_STATE_DOWNLOADING                = "FLEET_STATE_DOWNLOADING".asInstanceOf[EventCode]
    val FLEET_STATE_VALIDATING                 = "FLEET_STATE_VALIDATING".asInstanceOf[EventCode]
    val FLEET_STATE_BUILDING                   = "FLEET_STATE_BUILDING".asInstanceOf[EventCode]
    val FLEET_STATE_ACTIVATING                 = "FLEET_STATE_ACTIVATING".asInstanceOf[EventCode]
    val FLEET_STATE_ACTIVE                     = "FLEET_STATE_ACTIVE".asInstanceOf[EventCode]
    val FLEET_STATE_ERROR                      = "FLEET_STATE_ERROR".asInstanceOf[EventCode]
    val FLEET_INITIALIZATION_FAILED            = "FLEET_INITIALIZATION_FAILED".asInstanceOf[EventCode]
    val FLEET_BINARY_DOWNLOAD_FAILED           = "FLEET_BINARY_DOWNLOAD_FAILED".asInstanceOf[EventCode]
    val FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND = "FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND".asInstanceOf[EventCode]
    val FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE =
      "FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE".asInstanceOf[EventCode]
    val FLEET_VALIDATION_TIMED_OUT           = "FLEET_VALIDATION_TIMED_OUT".asInstanceOf[EventCode]
    val FLEET_ACTIVATION_FAILED              = "FLEET_ACTIVATION_FAILED".asInstanceOf[EventCode]
    val FLEET_ACTIVATION_FAILED_NO_INSTANCES = "FLEET_ACTIVATION_FAILED_NO_INSTANCES".asInstanceOf[EventCode]
    val FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED =
      "FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED".asInstanceOf[EventCode]
    val SERVER_PROCESS_INVALID_PATH               = "SERVER_PROCESS_INVALID_PATH".asInstanceOf[EventCode]
    val SERVER_PROCESS_SDK_INITIALIZATION_TIMEOUT = "SERVER_PROCESS_SDK_INITIALIZATION_TIMEOUT".asInstanceOf[EventCode]
    val SERVER_PROCESS_PROCESS_READY_TIMEOUT      = "SERVER_PROCESS_PROCESS_READY_TIMEOUT".asInstanceOf[EventCode]
    val SERVER_PROCESS_CRASHED                    = "SERVER_PROCESS_CRASHED".asInstanceOf[EventCode]
    val SERVER_PROCESS_TERMINATED_UNHEALTHY       = "SERVER_PROCESS_TERMINATED_UNHEALTHY".asInstanceOf[EventCode]
    val SERVER_PROCESS_FORCE_TERMINATED           = "SERVER_PROCESS_FORCE_TERMINATED".asInstanceOf[EventCode]
    val SERVER_PROCESS_PROCESS_EXIT_TIMEOUT       = "SERVER_PROCESS_PROCESS_EXIT_TIMEOUT".asInstanceOf[EventCode]
    val GAME_SESSION_ACTIVATION_TIMEOUT           = "GAME_SESSION_ACTIVATION_TIMEOUT".asInstanceOf[EventCode]
    val FLEET_CREATION_EXTRACTING_BUILD           = "FLEET_CREATION_EXTRACTING_BUILD".asInstanceOf[EventCode]
    val FLEET_CREATION_RUNNING_INSTALLER          = "FLEET_CREATION_RUNNING_INSTALLER".asInstanceOf[EventCode]
    val FLEET_CREATION_VALIDATING_RUNTIME_CONFIG  = "FLEET_CREATION_VALIDATING_RUNTIME_CONFIG".asInstanceOf[EventCode]
    val FLEET_VPC_PEERING_SUCCEEDED               = "FLEET_VPC_PEERING_SUCCEEDED".asInstanceOf[EventCode]
    val FLEET_VPC_PEERING_FAILED                  = "FLEET_VPC_PEERING_FAILED".asInstanceOf[EventCode]
    val FLEET_VPC_PEERING_DELETED                 = "FLEET_VPC_PEERING_DELETED".asInstanceOf[EventCode]
    val INSTANCE_INTERRUPTED                      = "INSTANCE_INTERRUPTED".asInstanceOf[EventCode]

    val values = js.Object.freeze(
      js.Array(
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
    )
  }

  @js.native
  sealed trait FleetAction extends js.Any
  object FleetAction extends js.Object {
    val AUTO_SCALING = "AUTO_SCALING".asInstanceOf[FleetAction]

    val values = js.Object.freeze(js.Array(AUTO_SCALING))
  }

  /**
    * General properties describing a fleet.
    * * <a>CreateFleet</a>
    *  * <a>ListFleets</a>
    *  * <a>DeleteFleet</a>
    *  * <a>DescribeFleetAttributes</a>
    *  * <a>UpdateFleetAttributes</a>
    *  * Manage fleet actions:
    * <li> <a>StartFleetActions</a>
    *  * <a>StopFleetActions</a>
    * </li>
    */
  @js.native
  @Factory
  trait FleetAttributes extends js.Object {
    var BuildArn: js.UndefOr[BuildArn]
    var BuildId: js.UndefOr[BuildId]
    var CertificateConfiguration: js.UndefOr[CertificateConfiguration]
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
    var ScriptArn: js.UndefOr[ScriptArn]
    var ScriptId: js.UndefOr[ScriptId]
    var ServerLaunchParameters: js.UndefOr[NonZeroAndMaxString]
    var ServerLaunchPath: js.UndefOr[NonZeroAndMaxString]
    var Status: js.UndefOr[FleetStatus]
    var StoppedActions: js.UndefOr[FleetActionList]
    var TerminationTime: js.UndefOr[Timestamp]
  }

  /**
    * Information about the fleet's capacity. Fleet capacity is measured in EC2 instances. By default, new fleets have a capacity of one instance, but can be updated as needed. The maximum number of instances for a fleet is determined by the fleet's instance type.
    * * <a>CreateFleet</a>
    *  * <a>ListFleets</a>
    *  * <a>DeleteFleet</a>
    *  * <a>DescribeFleetAttributes</a>
    *  * <a>UpdateFleetAttributes</a>
    *  * Manage fleet actions:
    * <li> <a>StartFleetActions</a>
    *  * <a>StopFleetActions</a>
    * </li>
    */
  @js.native
  @Factory
  trait FleetCapacity extends js.Object {
    var FleetId: js.UndefOr[FleetId]
    var InstanceCounts: js.UndefOr[EC2InstanceCounts]
    var InstanceType: js.UndefOr[EC2InstanceType]
  }

  @js.native
  sealed trait FleetStatus extends js.Any
  object FleetStatus extends js.Object {
    val NEW         = "NEW".asInstanceOf[FleetStatus]
    val DOWNLOADING = "DOWNLOADING".asInstanceOf[FleetStatus]
    val VALIDATING  = "VALIDATING".asInstanceOf[FleetStatus]
    val BUILDING    = "BUILDING".asInstanceOf[FleetStatus]
    val ACTIVATING  = "ACTIVATING".asInstanceOf[FleetStatus]
    val ACTIVE      = "ACTIVE".asInstanceOf[FleetStatus]
    val DELETING    = "DELETING".asInstanceOf[FleetStatus]
    val ERROR       = "ERROR".asInstanceOf[FleetStatus]
    val TERMINATED  = "TERMINATED".asInstanceOf[FleetStatus]

    val values = js.Object.freeze(
      js.Array(NEW, DOWNLOADING, VALIDATING, BUILDING, ACTIVATING, ACTIVE, DELETING, ERROR, TERMINATED)
    )
  }

  @js.native
  sealed trait FleetType extends js.Any
  object FleetType extends js.Object {
    val ON_DEMAND = "ON_DEMAND".asInstanceOf[FleetType]
    val SPOT      = "SPOT".asInstanceOf[FleetType]

    val values = js.Object.freeze(js.Array(ON_DEMAND, SPOT))
  }

  /**
    * Current status of fleet utilization, including the number of game and player sessions being hosted.
    * * <a>CreateFleet</a>
    *  * <a>ListFleets</a>
    *  * <a>DeleteFleet</a>
    *  * <a>DescribeFleetAttributes</a>
    *  * <a>UpdateFleetAttributes</a>
    *  * Manage fleet actions:
    * <li> <a>StartFleetActions</a>
    *  * <a>StopFleetActions</a>
    * </li>
    */
  @js.native
  @Factory
  trait FleetUtilization extends js.Object {
    var ActiveGameSessionCount: js.UndefOr[WholeNumber]
    var ActiveServerProcessCount: js.UndefOr[WholeNumber]
    var CurrentPlayerSessionCount: js.UndefOr[WholeNumber]
    var FleetId: js.UndefOr[FleetId]
    var MaximumPlayerSessionCount: js.UndefOr[WholeNumber]
  }

  /**
    * Set of key-value pairs that contain information about a game session. When included in a game session request, these properties communicate details to be used when setting up the new game session. For example, a game property might specify a game mode, level, or map. Game properties are passed to the game server process when initiating a new game session. For more information, see the [[https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-client-api.html#gamelift-sdk-client-api-create| Amazon GameLift Developer Guide]].
    */
  @js.native
  @Factory
  trait GameProperty extends js.Object {
    var Key: GamePropertyKey
    var Value: GamePropertyValue
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
  @Factory
  trait GameSession extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var CreatorId: js.UndefOr[NonZeroAndMaxString]
    var CurrentPlayerSessionCount: js.UndefOr[WholeNumber]
    var DnsName: js.UndefOr[DnsName]
    var FleetArn: js.UndefOr[ArnStringModel]
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

  /**
    * Connection information for the new game session that is created with matchmaking. (with <a>StartMatchmaking</a>). Once a match is set, the FlexMatch engine places the match and creates a new game session for it. This information, including the game session endpoint and player sessions for each player in the original matchmaking request, is added to the <a>MatchmakingTicket</a>, which can be retrieved by calling <a>DescribeMatchmaking</a>.
    */
  @js.native
  @Factory
  trait GameSessionConnectionInfo extends js.Object {
    var DnsName: js.UndefOr[DnsName]
    var GameSessionArn: js.UndefOr[ArnStringModel]
    var IpAddress: js.UndefOr[StringModel]
    var MatchedPlayerSessions: js.UndefOr[MatchedPlayerSessionList]
    var Port: js.UndefOr[PositiveInteger]
  }

  /**
    * A game session's properties plus the protection policy currently in force.
    */
  @js.native
  @Factory
  trait GameSessionDetail extends js.Object {
    var GameSession: js.UndefOr[GameSession]
    var ProtectionPolicy: js.UndefOr[ProtectionPolicy]
  }

  /**
    * Object that describes a <a>StartGameSessionPlacement</a> request. This object includes the full details of the original request plus the current status and start/end time stamps.
    *  Game session placement-related operations include:
    * * <a>StartGameSessionPlacement</a>
    *  * <a>DescribeGameSessionPlacement</a>
    *  * <a>StopGameSessionPlacement</a>
    */
  @js.native
  @Factory
  trait GameSessionPlacement extends js.Object {
    var DnsName: js.UndefOr[DnsName]
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

  @js.native
  sealed trait GameSessionPlacementState extends js.Any
  object GameSessionPlacementState extends js.Object {
    val PENDING   = "PENDING".asInstanceOf[GameSessionPlacementState]
    val FULFILLED = "FULFILLED".asInstanceOf[GameSessionPlacementState]
    val CANCELLED = "CANCELLED".asInstanceOf[GameSessionPlacementState]
    val TIMED_OUT = "TIMED_OUT".asInstanceOf[GameSessionPlacementState]
    val FAILED    = "FAILED".asInstanceOf[GameSessionPlacementState]

    val values = js.Object.freeze(js.Array(PENDING, FULFILLED, CANCELLED, TIMED_OUT, FAILED))
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
  @Factory
  trait GameSessionQueue extends js.Object {
    var Destinations: js.UndefOr[GameSessionQueueDestinationList]
    var GameSessionQueueArn: js.UndefOr[ArnStringModel]
    var Name: js.UndefOr[GameSessionQueueName]
    var PlayerLatencyPolicies: js.UndefOr[PlayerLatencyPolicyList]
    var TimeoutInSeconds: js.UndefOr[WholeNumber]
  }

  /**
    * Fleet designated in a game session queue. Requests for new game sessions in the queue are fulfilled by starting a new game session on any destination that is configured for a queue.
    * * <a>CreateGameSessionQueue</a>
    *  * <a>DescribeGameSessionQueues</a>
    *  * <a>UpdateGameSessionQueue</a>
    *  * <a>DeleteGameSessionQueue</a>
    */
  @js.native
  @Factory
  trait GameSessionQueueDestination extends js.Object {
    var DestinationArn: js.UndefOr[ArnStringModel]
  }

  @js.native
  sealed trait GameSessionStatus extends js.Any
  object GameSessionStatus extends js.Object {
    val ACTIVE      = "ACTIVE".asInstanceOf[GameSessionStatus]
    val ACTIVATING  = "ACTIVATING".asInstanceOf[GameSessionStatus]
    val TERMINATED  = "TERMINATED".asInstanceOf[GameSessionStatus]
    val TERMINATING = "TERMINATING".asInstanceOf[GameSessionStatus]
    val ERROR       = "ERROR".asInstanceOf[GameSessionStatus]

    val values = js.Object.freeze(js.Array(ACTIVE, ACTIVATING, TERMINATED, TERMINATING, ERROR))
  }

  @js.native
  sealed trait GameSessionStatusReason extends js.Any
  object GameSessionStatusReason extends js.Object {
    val INTERRUPTED = "INTERRUPTED".asInstanceOf[GameSessionStatusReason]

    val values = js.Object.freeze(js.Array(INTERRUPTED))
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait GetGameSessionLogUrlInput extends js.Object {
    var GameSessionId: ArnStringModel
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait GetGameSessionLogUrlOutput extends js.Object {
    var PreSignedUrl: js.UndefOr[NonZeroAndMaxString]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait GetInstanceAccessInput extends js.Object {
    var FleetId: FleetId
    var InstanceId: InstanceId
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait GetInstanceAccessOutput extends js.Object {
    var InstanceAccess: js.UndefOr[InstanceAccess]
  }

  /**
    * Properties that describe an instance of a virtual computing resource that hosts one or more game servers. A fleet may contain zero or more instances.
    */
  @js.native
  @Factory
  trait Instance extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var DnsName: js.UndefOr[DnsName]
    var FleetId: js.UndefOr[FleetId]
    var InstanceId: js.UndefOr[InstanceId]
    var IpAddress: js.UndefOr[IpAddress]
    var OperatingSystem: js.UndefOr[OperatingSystem]
    var Status: js.UndefOr[InstanceStatus]
    var Type: js.UndefOr[EC2InstanceType]
  }

  /**
    * Information required to remotely connect to a fleet instance. Access is requested by calling <a>GetInstanceAccess</a>.
    */
  @js.native
  @Factory
  trait InstanceAccess extends js.Object {
    var Credentials: js.UndefOr[InstanceCredentials]
    var FleetId: js.UndefOr[FleetId]
    var InstanceId: js.UndefOr[InstanceId]
    var IpAddress: js.UndefOr[IpAddress]
    var OperatingSystem: js.UndefOr[OperatingSystem]
  }

  /**
    * Set of credentials required to remotely access a fleet instance. Access credentials are requested by calling <a>GetInstanceAccess</a> and returned in an <a>InstanceAccess</a> object.
    */
  @js.native
  @Factory
  trait InstanceCredentials extends js.Object {
    var Secret: js.UndefOr[NonEmptyString]
    var UserName: js.UndefOr[NonEmptyString]
  }

  @js.native
  sealed trait InstanceStatus extends js.Any
  object InstanceStatus extends js.Object {
    val PENDING     = "PENDING".asInstanceOf[InstanceStatus]
    val ACTIVE      = "ACTIVE".asInstanceOf[InstanceStatus]
    val TERMINATING = "TERMINATING".asInstanceOf[InstanceStatus]

    val values = js.Object.freeze(js.Array(PENDING, ACTIVE, TERMINATING))
  }

  /**
    * A range of IP addresses and port settings that allow inbound traffic to connect to server processes on an Amazon GameLift hosting resource. New game sessions that are started on the fleet are assigned an IP address/port number combination, which must fall into the fleet's allowed ranges. For fleets created with a custom game server, the ranges reflect the server's game session assignments. For Realtime Servers fleets, Amazon GameLift automatically opens two port ranges, one for TCP messaging and one for UDP for use by the Realtime servers.
    */
  @js.native
  @Factory
  trait IpPermission extends js.Object {
    var FromPort: PortNumber
    var IpRange: NonBlankString
    var Protocol: IpProtocol
    var ToPort: PortNumber
  }

  @js.native
  sealed trait IpProtocol extends js.Any
  object IpProtocol extends js.Object {
    val TCP = "TCP".asInstanceOf[IpProtocol]
    val UDP = "UDP".asInstanceOf[IpProtocol]

    val values = js.Object.freeze(js.Array(TCP, UDP))
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait ListAliasesInput extends js.Object {
    var Limit: js.UndefOr[PositiveInteger]
    var Name: js.UndefOr[NonEmptyString]
    var NextToken: js.UndefOr[NonEmptyString]
    var RoutingStrategyType: js.UndefOr[RoutingStrategyType]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait ListAliasesOutput extends js.Object {
    var Aliases: js.UndefOr[AliasList]
    var NextToken: js.UndefOr[NonEmptyString]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait ListBuildsInput extends js.Object {
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[BuildStatus]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait ListBuildsOutput extends js.Object {
    var Builds: js.UndefOr[BuildList]
    var NextToken: js.UndefOr[NonEmptyString]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait ListFleetsInput extends js.Object {
    var BuildId: js.UndefOr[BuildId]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
    var ScriptId: js.UndefOr[ScriptId]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait ListFleetsOutput extends js.Object {
    var FleetIds: js.UndefOr[FleetIdList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  @js.native
  @Factory
  trait ListScriptsInput extends js.Object {
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonEmptyString]
  }

  @js.native
  @Factory
  trait ListScriptsOutput extends js.Object {
    var NextToken: js.UndefOr[NonEmptyString]
    var Scripts: js.UndefOr[ScriptList]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  /**
    * Represents a new player session that is created as a result of a successful FlexMatch match. A successful match automatically creates new player sessions for every player ID in the original matchmaking request.
    *  When players connect to the match's game session, they must include both player ID and player session ID in order to claim their assigned player slot.
    */
  @js.native
  @Factory
  trait MatchedPlayerSession extends js.Object {
    var PlayerId: js.UndefOr[NonZeroAndMaxString]
    var PlayerSessionId: js.UndefOr[PlayerSessionId]
  }

  /**
    * Guidelines for use with FlexMatch to match players into games. All matchmaking requests must specify a matchmaking configuration.
    */
  @js.native
  @Factory
  trait MatchmakingConfiguration extends js.Object {
    var AcceptanceRequired: js.UndefOr[BooleanModel]
    var AcceptanceTimeoutSeconds: js.UndefOr[MatchmakingAcceptanceTimeoutInteger]
    var AdditionalPlayerCount: js.UndefOr[WholeNumber]
    var BackfillMode: js.UndefOr[BackfillMode]
    var ConfigurationArn: js.UndefOr[MatchmakingConfigurationArn]
    var CreationTime: js.UndefOr[Timestamp]
    var CustomEventData: js.UndefOr[CustomEventData]
    var Description: js.UndefOr[NonZeroAndMaxString]
    var GameProperties: js.UndefOr[GamePropertyList]
    var GameSessionData: js.UndefOr[GameSessionData]
    var GameSessionQueueArns: js.UndefOr[QueueArnsList]
    var Name: js.UndefOr[MatchmakingIdStringModel]
    var NotificationTarget: js.UndefOr[SnsArnStringModel]
    var RequestTimeoutSeconds: js.UndefOr[MatchmakingRequestTimeoutInteger]
    var RuleSetArn: js.UndefOr[MatchmakingRuleSetArn]
    var RuleSetName: js.UndefOr[MatchmakingIdStringModel]
  }

  @js.native
  sealed trait MatchmakingConfigurationStatus extends js.Any
  object MatchmakingConfigurationStatus extends js.Object {
    val CANCELLED           = "CANCELLED".asInstanceOf[MatchmakingConfigurationStatus]
    val COMPLETED           = "COMPLETED".asInstanceOf[MatchmakingConfigurationStatus]
    val FAILED              = "FAILED".asInstanceOf[MatchmakingConfigurationStatus]
    val PLACING             = "PLACING".asInstanceOf[MatchmakingConfigurationStatus]
    val QUEUED              = "QUEUED".asInstanceOf[MatchmakingConfigurationStatus]
    val REQUIRES_ACCEPTANCE = "REQUIRES_ACCEPTANCE".asInstanceOf[MatchmakingConfigurationStatus]
    val SEARCHING           = "SEARCHING".asInstanceOf[MatchmakingConfigurationStatus]
    val TIMED_OUT           = "TIMED_OUT".asInstanceOf[MatchmakingConfigurationStatus]

    val values = js.Object.freeze(
      js.Array(CANCELLED, COMPLETED, FAILED, PLACING, QUEUED, REQUIRES_ACCEPTANCE, SEARCHING, TIMED_OUT)
    )
  }

  /**
    * Set of rule statements, used with FlexMatch, that determine how to build your player matches. Each rule set describes a type of group to be created and defines the parameters for acceptable player matches. Rule sets are used in <a>MatchmakingConfiguration</a> objects.
    *  A rule set may define the following elements for a match. For detailed information and examples showing how to construct a rule set, see [[https://docs.aws.amazon.com/gamelift/latest/developerguide/match-rulesets.html|Build a FlexMatch Rule Set]].
    * * Teams -- Required. A rule set must define one or multiple teams for the match and set minimum and maximum team sizes. For example, a rule set might describe a 4x4 match that requires all eight slots to be filled.
    *  * Player attributes -- Optional. These attributes specify a set of player characteristics to evaluate when looking for a match. Matchmaking requests that use a rule set with player attributes must provide the corresponding attribute values. For example, an attribute might specify a player's skill or level.
    *  * Rules -- Optional. Rules define how to evaluate potential players for a match based on player attributes. A rule might specify minimum requirements for individual players, teams, or entire matches. For example, a rule might require each player to meet a certain skill level, each team to have at least one player in a certain role, or the match to have a minimum average skill level. or may describe an entire group--such as all teams must be evenly matched or have at least one player in a certain role.
    *  * Expansions -- Optional. Expansions allow you to relax the rules after a period of time when no acceptable matches are found. This feature lets you balance getting players into games in a reasonable amount of time instead of making them wait indefinitely for the best possible match. For example, you might use an expansion to increase the maximum skill variance between players after 30 seconds.
    */
  @js.native
  @Factory
  trait MatchmakingRuleSet extends js.Object {
    var RuleSetBody: RuleSetBody
    var CreationTime: js.UndefOr[Timestamp]
    var RuleSetArn: js.UndefOr[MatchmakingRuleSetArn]
    var RuleSetName: js.UndefOr[MatchmakingIdStringModel]
  }

  /**
    * Ticket generated to track the progress of a matchmaking request. Each ticket is uniquely identified by a ticket ID, supplied by the requester, when creating a matchmaking request with <a>StartMatchmaking</a>. Tickets can be retrieved by calling <a>DescribeMatchmaking</a> with the ticket ID.
    */
  @js.native
  @Factory
  trait MatchmakingTicket extends js.Object {
    var ConfigurationArn: js.UndefOr[MatchmakingConfigurationArn]
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

  @js.native
  sealed trait MetricName extends js.Any
  object MetricName extends js.Object {
    val ActivatingGameSessions       = "ActivatingGameSessions".asInstanceOf[MetricName]
    val ActiveGameSessions           = "ActiveGameSessions".asInstanceOf[MetricName]
    val ActiveInstances              = "ActiveInstances".asInstanceOf[MetricName]
    val AvailableGameSessions        = "AvailableGameSessions".asInstanceOf[MetricName]
    val AvailablePlayerSessions      = "AvailablePlayerSessions".asInstanceOf[MetricName]
    val CurrentPlayerSessions        = "CurrentPlayerSessions".asInstanceOf[MetricName]
    val IdleInstances                = "IdleInstances".asInstanceOf[MetricName]
    val PercentAvailableGameSessions = "PercentAvailableGameSessions".asInstanceOf[MetricName]
    val PercentIdleInstances         = "PercentIdleInstances".asInstanceOf[MetricName]
    val QueueDepth                   = "QueueDepth".asInstanceOf[MetricName]
    val WaitTime                     = "WaitTime".asInstanceOf[MetricName]

    val values = js.Object.freeze(
      js.Array(
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
    )
  }

  @js.native
  sealed trait OperatingSystem extends js.Any
  object OperatingSystem extends js.Object {
    val WINDOWS_2012   = "WINDOWS_2012".asInstanceOf[OperatingSystem]
    val AMAZON_LINUX   = "AMAZON_LINUX".asInstanceOf[OperatingSystem]
    val AMAZON_LINUX_2 = "AMAZON_LINUX_2".asInstanceOf[OperatingSystem]

    val values = js.Object.freeze(js.Array(WINDOWS_2012, AMAZON_LINUX, AMAZON_LINUX_2))
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
  @Factory
  trait PlacedPlayerSession extends js.Object {
    var PlayerId: js.UndefOr[NonZeroAndMaxString]
    var PlayerSessionId: js.UndefOr[PlayerSessionId]
  }

  /**
    * Represents a player in matchmaking. When starting a matchmaking request, a player has a player ID, attributes, and may have latency data. Team information is added after a match has been successfully completed.
    */
  @js.native
  @Factory
  trait Player extends js.Object {
    var LatencyInMs: js.UndefOr[LatencyMap]
    var PlayerAttributes: js.UndefOr[PlayerAttributeMap]
    var PlayerId: js.UndefOr[NonZeroAndMaxString]
    var Team: js.UndefOr[NonZeroAndMaxString]
  }

  /**
    * Regional latency information for a player, used when requesting a new game session with <a>StartGameSessionPlacement</a>. This value indicates the amount of time lag that exists when the player is connected to a fleet in the specified Region. The relative difference between a player's latency values for multiple Regions are used to determine which fleets are best suited to place a new game session for the player.
    */
  @js.native
  @Factory
  trait PlayerLatency extends js.Object {
    var LatencyInMilliseconds: js.UndefOr[Float]
    var PlayerId: js.UndefOr[NonZeroAndMaxString]
    var RegionIdentifier: js.UndefOr[NonZeroAndMaxString]
  }

  /**
    * Queue setting that determines the highest latency allowed for individual players when placing a game session. When a latency policy is in force, a game session cannot be placed with any fleet in a Region where a player reports latency higher than the cap. Latency policies are only enforced when the placement request contains player latency information.
    * * <a>CreateGameSessionQueue</a>
    *  * <a>DescribeGameSessionQueues</a>
    *  * <a>UpdateGameSessionQueue</a>
    *  * <a>DeleteGameSessionQueue</a>
    */
  @js.native
  @Factory
  trait PlayerLatencyPolicy extends js.Object {
    var MaximumIndividualPlayerLatencyMilliseconds: js.UndefOr[WholeNumber]
    var PolicyDurationSeconds: js.UndefOr[WholeNumber]
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
  @Factory
  trait PlayerSession extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var DnsName: js.UndefOr[DnsName]
    var FleetArn: js.UndefOr[ArnStringModel]
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

  @js.native
  sealed trait PlayerSessionCreationPolicy extends js.Any
  object PlayerSessionCreationPolicy extends js.Object {
    val ACCEPT_ALL = "ACCEPT_ALL".asInstanceOf[PlayerSessionCreationPolicy]
    val DENY_ALL   = "DENY_ALL".asInstanceOf[PlayerSessionCreationPolicy]

    val values = js.Object.freeze(js.Array(ACCEPT_ALL, DENY_ALL))
  }

  @js.native
  sealed trait PlayerSessionStatus extends js.Any
  object PlayerSessionStatus extends js.Object {
    val RESERVED  = "RESERVED".asInstanceOf[PlayerSessionStatus]
    val ACTIVE    = "ACTIVE".asInstanceOf[PlayerSessionStatus]
    val COMPLETED = "COMPLETED".asInstanceOf[PlayerSessionStatus]
    val TIMEDOUT  = "TIMEDOUT".asInstanceOf[PlayerSessionStatus]

    val values = js.Object.freeze(js.Array(RESERVED, ACTIVE, COMPLETED, TIMEDOUT))
  }

  @js.native
  sealed trait PolicyType extends js.Any
  object PolicyType extends js.Object {
    val RuleBased   = "RuleBased".asInstanceOf[PolicyType]
    val TargetBased = "TargetBased".asInstanceOf[PolicyType]

    val values = js.Object.freeze(js.Array(RuleBased, TargetBased))
  }

  @js.native
  sealed trait ProtectionPolicy extends js.Any
  object ProtectionPolicy extends js.Object {
    val NoProtection   = "NoProtection".asInstanceOf[ProtectionPolicy]
    val FullProtection = "FullProtection".asInstanceOf[ProtectionPolicy]

    val values = js.Object.freeze(js.Array(NoProtection, FullProtection))
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
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

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait PutScalingPolicyOutput extends js.Object {
    var Name: js.UndefOr[NonZeroAndMaxString]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait RequestUploadCredentialsInput extends js.Object {
    var BuildId: BuildId
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait RequestUploadCredentialsOutput extends js.Object {
    var StorageLocation: js.UndefOr[S3Location]
    var UploadCredentials: js.UndefOr[AwsCredentials]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait ResolveAliasInput extends js.Object {
    var AliasId: AliasId
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait ResolveAliasOutput extends js.Object {
    var FleetArn: js.UndefOr[ArnStringModel]
    var FleetId: js.UndefOr[FleetId]
  }

  /**
    * A policy that limits the number of game sessions a player can create on the same fleet. This optional policy gives game owners control over how players can consume available game server resources. A resource creation policy makes the following statement: "An individual player can create a maximum number of new game sessions within a specified time period".
    *  The policy is evaluated when a player tries to create a new game session. For example: Assume you have a policy of 10 new game sessions and a time period of 60 minutes. On receiving a <code>CreateGameSession</code> request, Amazon GameLift checks that the player (identified by <code>CreatorId</code>) has created fewer than 10 game sessions in the past 60 minutes.
    */
  @js.native
  @Factory
  trait ResourceCreationLimitPolicy extends js.Object {
    var NewGameSessionsPerCreator: js.UndefOr[WholeNumber]
    var PolicyPeriodInMinutes: js.UndefOr[WholeNumber]
  }

  /**
    * The routing configuration for a fleet alias.
    * * <a>CreateAlias</a>
    *  * <a>ListAliases</a>
    *  * <a>DescribeAlias</a>
    *  * <a>UpdateAlias</a>
    *  * <a>DeleteAlias</a>
    *  * <a>ResolveAlias</a>
    */
  @js.native
  @Factory
  trait RoutingStrategy extends js.Object {
    var FleetId: js.UndefOr[FleetId]
    var Message: js.UndefOr[FreeText]
    var Type: js.UndefOr[RoutingStrategyType]
  }

  @js.native
  sealed trait RoutingStrategyType extends js.Any
  object RoutingStrategyType extends js.Object {
    val SIMPLE   = "SIMPLE".asInstanceOf[RoutingStrategyType]
    val TERMINAL = "TERMINAL".asInstanceOf[RoutingStrategyType]

    val values = js.Object.freeze(js.Array(SIMPLE, TERMINAL))
  }

  /**
    * A collection of server process configurations that describe what processes to run on each instance in a fleet. Server processes run either a custom game build executable or a Realtime Servers script. Each instance in the fleet starts the specified server processes and continues to start new processes as existing processes end. Each instance regularly checks for an updated runtime configuration.
    *  The runtime configuration enables the instances in a fleet to run multiple processes simultaneously. Learn more about [[https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-multiprocess.html| Running Multiple Processes on a Fleet ]].
    *  A Amazon GameLift instance is limited to 50 processes running simultaneously. To calculate the total number of processes in a runtime configuration, add the values of the <code>ConcurrentExecutions</code> parameter for each <a>ServerProcess</a> object.
    * * <a>CreateFleet</a>
    *  * <a>ListFleets</a>
    *  * <a>DeleteFleet</a>
    *  * <a>DescribeFleetAttributes</a>
    *  * <a>UpdateFleetAttributes</a>
    *  * Manage fleet actions:
    * <li> <a>StartFleetActions</a>
    *  * <a>StopFleetActions</a>
    * </li>
    */
  @js.native
  @Factory
  trait RuntimeConfiguration extends js.Object {
    var GameSessionActivationTimeoutSeconds: js.UndefOr[GameSessionActivationTimeoutSeconds]
    var MaxConcurrentGameSessionActivations: js.UndefOr[MaxConcurrentGameSessionActivations]
    var ServerProcesses: js.UndefOr[ServerProcessList]
  }

  /**
    * The location in Amazon S3 where build or script files are stored for access by Amazon GameLift. This location is specified in <a>CreateBuild</a>, <a>CreateScript</a>, and <a>UpdateScript</a> requests.
    */
  @js.native
  @Factory
  trait S3Location extends js.Object {
    var Bucket: js.UndefOr[NonEmptyString]
    var Key: js.UndefOr[NonEmptyString]
    var ObjectVersion: js.UndefOr[NonEmptyString]
    var RoleArn: js.UndefOr[NonEmptyString]
  }

  @js.native
  sealed trait ScalingAdjustmentType extends js.Any
  object ScalingAdjustmentType extends js.Object {
    val ChangeInCapacity        = "ChangeInCapacity".asInstanceOf[ScalingAdjustmentType]
    val ExactCapacity           = "ExactCapacity".asInstanceOf[ScalingAdjustmentType]
    val PercentChangeInCapacity = "PercentChangeInCapacity".asInstanceOf[ScalingAdjustmentType]

    val values = js.Object.freeze(js.Array(ChangeInCapacity, ExactCapacity, PercentChangeInCapacity))
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
  @Factory
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

  @js.native
  sealed trait ScalingStatusType extends js.Any
  object ScalingStatusType extends js.Object {
    val ACTIVE           = "ACTIVE".asInstanceOf[ScalingStatusType]
    val UPDATE_REQUESTED = "UPDATE_REQUESTED".asInstanceOf[ScalingStatusType]
    val UPDATING         = "UPDATING".asInstanceOf[ScalingStatusType]
    val DELETE_REQUESTED = "DELETE_REQUESTED".asInstanceOf[ScalingStatusType]
    val DELETING         = "DELETING".asInstanceOf[ScalingStatusType]
    val DELETED          = "DELETED".asInstanceOf[ScalingStatusType]
    val ERROR            = "ERROR".asInstanceOf[ScalingStatusType]

    val values =
      js.Object.freeze(js.Array(ACTIVE, UPDATE_REQUESTED, UPDATING, DELETE_REQUESTED, DELETING, DELETED, ERROR))
  }

  /**
    * Properties describing a Realtime script.
    *  ```Related operations```
    * * <a>CreateScript</a>
    *  * <a>ListScripts</a>
    *  * <a>DescribeScript</a>
    *  * <a>UpdateScript</a>
    *  * <a>DeleteScript</a>
    */
  @js.native
  @Factory
  trait Script extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[NonZeroAndMaxString]
    var ScriptArn: js.UndefOr[ScriptArn]
    var ScriptId: js.UndefOr[ScriptId]
    var SizeOnDisk: js.UndefOr[PositiveLong]
    var StorageLocation: js.UndefOr[S3Location]
    var Version: js.UndefOr[NonZeroAndMaxString]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait SearchGameSessionsInput extends js.Object {
    var AliasId: js.UndefOr[AliasId]
    var FilterExpression: js.UndefOr[NonZeroAndMaxString]
    var FleetId: js.UndefOr[FleetId]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
    var SortExpression: js.UndefOr[NonZeroAndMaxString]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait SearchGameSessionsOutput extends js.Object {
    var GameSessions: js.UndefOr[GameSessionList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  /**
    * A set of instructions for launching server processes on each instance in a fleet. Server processes run either a custom game build executable or a Realtime Servers script. Each instruction set identifies the location of the custom game build executable or Realtime launch script, optional launch parameters, and the number of server processes with this configuration to maintain concurrently on the instance. Server process configurations make up a fleet's <code> <a>RuntimeConfiguration</a> </code>.
    */
  @js.native
  @Factory
  trait ServerProcess extends js.Object {
    var ConcurrentExecutions: PositiveInteger
    var LaunchPath: NonZeroAndMaxString
    var Parameters: js.UndefOr[NonZeroAndMaxString]
  }

  @js.native
  @Factory
  trait StartFleetActionsInput extends js.Object {
    var Actions: FleetActionList
    var FleetId: FleetId
  }

  @js.native
  @Factory
  trait StartFleetActionsOutput extends js.Object {}

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
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

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait StartGameSessionPlacementOutput extends js.Object {
    var GameSessionPlacement: js.UndefOr[GameSessionPlacement]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait StartMatchBackfillInput extends js.Object {
    var ConfigurationName: MatchmakingConfigurationName
    var GameSessionArn: ArnStringModel
    var Players: PlayerList
    var TicketId: js.UndefOr[MatchmakingIdStringModel]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait StartMatchBackfillOutput extends js.Object {
    var MatchmakingTicket: js.UndefOr[MatchmakingTicket]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait StartMatchmakingInput extends js.Object {
    var ConfigurationName: MatchmakingConfigurationName
    var Players: PlayerList
    var TicketId: js.UndefOr[MatchmakingIdStringModel]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait StartMatchmakingOutput extends js.Object {
    var MatchmakingTicket: js.UndefOr[MatchmakingTicket]
  }

  @js.native
  @Factory
  trait StopFleetActionsInput extends js.Object {
    var Actions: FleetActionList
    var FleetId: FleetId
  }

  @js.native
  @Factory
  trait StopFleetActionsOutput extends js.Object {}

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait StopGameSessionPlacementInput extends js.Object {
    var PlacementId: IdStringModel
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait StopGameSessionPlacementOutput extends js.Object {
    var GameSessionPlacement: js.UndefOr[GameSessionPlacement]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait StopMatchmakingInput extends js.Object {
    var TicketId: MatchmakingIdStringModel
  }

  @js.native
  @Factory
  trait StopMatchmakingOutput extends js.Object {}

  /**
    * A label that can be assigned to a GameLift resource.
    *  ```Learn more```
    *  [[https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html|Tagging AWS Resources]] in the <i>AWS General Reference</i>
    *  [[http://aws.amazon.com/answers/account-management/aws-tagging-strategies/| AWS Tagging Strategies]]
    *  ```Related operations```
    * * <a>TagResource</a>
    *  * <a>UntagResource</a>
    *  * <a>ListTagsForResource</a>
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
    var Tags: TagList
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

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
  @Factory
  trait TargetConfiguration extends js.Object {
    var TargetValue: Double
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
    var TagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait UpdateAliasInput extends js.Object {
    var AliasId: AliasId
    var Description: js.UndefOr[NonZeroAndMaxString]
    var Name: js.UndefOr[NonBlankAndLengthConstraintString]
    var RoutingStrategy: js.UndefOr[RoutingStrategy]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait UpdateAliasOutput extends js.Object {
    var Alias: js.UndefOr[Alias]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait UpdateBuildInput extends js.Object {
    var BuildId: BuildId
    var Name: js.UndefOr[NonZeroAndMaxString]
    var Version: js.UndefOr[NonZeroAndMaxString]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait UpdateBuildOutput extends js.Object {
    var Build: js.UndefOr[Build]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait UpdateFleetAttributesInput extends js.Object {
    var FleetId: FleetId
    var Description: js.UndefOr[NonZeroAndMaxString]
    var MetricGroups: js.UndefOr[MetricGroupList]
    var Name: js.UndefOr[NonZeroAndMaxString]
    var NewGameSessionProtectionPolicy: js.UndefOr[ProtectionPolicy]
    var ResourceCreationLimitPolicy: js.UndefOr[ResourceCreationLimitPolicy]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait UpdateFleetAttributesOutput extends js.Object {
    var FleetId: js.UndefOr[FleetId]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait UpdateFleetCapacityInput extends js.Object {
    var FleetId: FleetId
    var DesiredInstances: js.UndefOr[WholeNumber]
    var MaxSize: js.UndefOr[WholeNumber]
    var MinSize: js.UndefOr[WholeNumber]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait UpdateFleetCapacityOutput extends js.Object {
    var FleetId: js.UndefOr[FleetId]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait UpdateFleetPortSettingsInput extends js.Object {
    var FleetId: FleetId
    var InboundPermissionAuthorizations: js.UndefOr[IpPermissionsList]
    var InboundPermissionRevocations: js.UndefOr[IpPermissionsList]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait UpdateFleetPortSettingsOutput extends js.Object {
    var FleetId: js.UndefOr[FleetId]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait UpdateGameSessionInput extends js.Object {
    var GameSessionId: ArnStringModel
    var MaximumPlayerSessionCount: js.UndefOr[WholeNumber]
    var Name: js.UndefOr[NonZeroAndMaxString]
    var PlayerSessionCreationPolicy: js.UndefOr[PlayerSessionCreationPolicy]
    var ProtectionPolicy: js.UndefOr[ProtectionPolicy]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait UpdateGameSessionOutput extends js.Object {
    var GameSession: js.UndefOr[GameSession]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait UpdateGameSessionQueueInput extends js.Object {
    var Name: GameSessionQueueName
    var Destinations: js.UndefOr[GameSessionQueueDestinationList]
    var PlayerLatencyPolicies: js.UndefOr[PlayerLatencyPolicyList]
    var TimeoutInSeconds: js.UndefOr[WholeNumber]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait UpdateGameSessionQueueOutput extends js.Object {
    var GameSessionQueue: js.UndefOr[GameSessionQueue]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait UpdateMatchmakingConfigurationInput extends js.Object {
    var Name: MatchmakingConfigurationName
    var AcceptanceRequired: js.UndefOr[BooleanModel]
    var AcceptanceTimeoutSeconds: js.UndefOr[MatchmakingAcceptanceTimeoutInteger]
    var AdditionalPlayerCount: js.UndefOr[WholeNumber]
    var BackfillMode: js.UndefOr[BackfillMode]
    var CustomEventData: js.UndefOr[CustomEventData]
    var Description: js.UndefOr[NonZeroAndMaxString]
    var GameProperties: js.UndefOr[GamePropertyList]
    var GameSessionData: js.UndefOr[GameSessionData]
    var GameSessionQueueArns: js.UndefOr[QueueArnsList]
    var NotificationTarget: js.UndefOr[SnsArnStringModel]
    var RequestTimeoutSeconds: js.UndefOr[MatchmakingRequestTimeoutInteger]
    var RuleSetName: js.UndefOr[MatchmakingRuleSetName]
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait UpdateMatchmakingConfigurationOutput extends js.Object {
    var Configuration: js.UndefOr[MatchmakingConfiguration]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait UpdateRuntimeConfigurationInput extends js.Object {
    var FleetId: FleetId
    var RuntimeConfiguration: RuntimeConfiguration
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait UpdateRuntimeConfigurationOutput extends js.Object {
    var RuntimeConfiguration: js.UndefOr[RuntimeConfiguration]
  }

  @js.native
  @Factory
  trait UpdateScriptInput extends js.Object {
    var ScriptId: ScriptId
    var Name: js.UndefOr[NonZeroAndMaxString]
    var StorageLocation: js.UndefOr[S3Location]
    var Version: js.UndefOr[NonZeroAndMaxString]
    var ZipFile: js.UndefOr[ZipBlob]
  }

  @js.native
  @Factory
  trait UpdateScriptOutput extends js.Object {
    var Script: js.UndefOr[Script]
  }

  /**
    * Represents the input for a request action.
    */
  @js.native
  @Factory
  trait ValidateMatchmakingRuleSetInput extends js.Object {
    var RuleSetBody: RuleSetBody
  }

  /**
    * Represents the returned data in response to a request action.
    */
  @js.native
  @Factory
  trait ValidateMatchmakingRuleSetOutput extends js.Object {
    var Valid: js.UndefOr[BooleanModel]
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
  @Factory
  trait VpcPeeringAuthorization extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var ExpirationTime: js.UndefOr[Timestamp]
    var GameLiftAwsAccountId: js.UndefOr[NonZeroAndMaxString]
    var PeerVpcAwsAccountId: js.UndefOr[NonZeroAndMaxString]
    var PeerVpcId: js.UndefOr[NonZeroAndMaxString]
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
  @Factory
  trait VpcPeeringConnection extends js.Object {
    var FleetArn: js.UndefOr[ArnStringModel]
    var FleetId: js.UndefOr[FleetId]
    var GameLiftVpcId: js.UndefOr[NonZeroAndMaxString]
    var IpV4CidrBlock: js.UndefOr[NonZeroAndMaxString]
    var PeerVpcId: js.UndefOr[NonZeroAndMaxString]
    var Status: js.UndefOr[VpcPeeringConnectionStatus]
    var VpcPeeringConnectionId: js.UndefOr[NonZeroAndMaxString]
  }

  /**
    * Represents status information for a VPC peering connection. Status is associated with a <a>VpcPeeringConnection</a> object. Status codes and messages are provided from EC2 (see [[https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_VpcPeeringConnectionStateReason.html|VpcPeeringConnectionStateReason]]). Connection status information is also communicated as a fleet <a>Event</a>.
    */
  @js.native
  @Factory
  trait VpcPeeringConnectionStatus extends js.Object {
    var Code: js.UndefOr[NonZeroAndMaxString]
    var Message: js.UndefOr[NonZeroAndMaxString]
  }
}
