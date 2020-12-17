package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object gamelift {
  type AliasArn = String
  type AliasId = String
  type AliasIdOrArn = String
  type AliasList = js.Array[Alias]
  type AmazonResourceName = String
  type ArnStringModel = String
  type AutoScalingGroupArn = String
  type BooleanModel = Boolean
  type BuildArn = String
  type BuildId = String
  type BuildIdOrArn = String
  type BuildList = js.Array[Build]
  type CustomEventData = String
  type DesiredPlayerSessionList = js.Array[DesiredPlayerSession]
  type DnsName = String
  type DoubleObject = Double
  type EC2InstanceLimitList = js.Array[EC2InstanceLimit]
  type EventList = js.Array[Event]
  type FleetActionList = js.Array[FleetAction]
  type FleetArn = String
  type FleetAttributesList = js.Array[FleetAttributes]
  type FleetCapacityList = js.Array[FleetCapacity]
  type FleetId = String
  type FleetIdList = js.Array[FleetId]
  type FleetIdOrArn = String
  type FleetIdOrArnList = js.Array[FleetIdOrArn]
  type FleetUtilizationList = js.Array[FleetUtilization]
  type FreeText = String
  type GamePropertyKey = String
  type GamePropertyList = js.Array[GameProperty]
  type GamePropertyValue = String
  type GameServerConnectionInfo = String
  type GameServerData = String
  type GameServerGroupActions = js.Array[GameServerGroupAction]
  type GameServerGroupArn = String
  type GameServerGroupName = String
  type GameServerGroupNameOrArn = String
  type GameServerGroups = js.Array[GameServerGroup]
  type GameServerId = String
  type GameServerInstanceId = String
  type GameServerInstanceIds = js.Array[GameServerInstanceId]
  type GameServerInstances = js.Array[GameServerInstance]
  type GameServers = js.Array[GameServer]
  type GameSessionActivationTimeoutSeconds = Int
  type GameSessionData = String
  type GameSessionDetailList = js.Array[GameSessionDetail]
  type GameSessionList = js.Array[GameSession]
  type GameSessionQueueArn = String
  type GameSessionQueueDestinationList = js.Array[GameSessionQueueDestination]
  type GameSessionQueueList = js.Array[GameSessionQueue]
  type GameSessionQueueName = String
  type GameSessionQueueNameOrArn = String
  type GameSessionQueueNameOrArnList = js.Array[GameSessionQueueNameOrArn]
  type IamRoleArn = String
  type IdStringModel = String
  type InstanceDefinitions = js.Array[InstanceDefinition]
  type InstanceId = String
  type InstanceList = js.Array[Instance]
  type IpAddress = String
  type IpPermissionsList = js.Array[IpPermission]
  type LatencyMap = js.Dictionary[PositiveInteger]
  type LaunchTemplateId = String
  type LaunchTemplateName = String
  type LaunchTemplateVersion = String
  type MatchedPlayerSessionList = js.Array[MatchedPlayerSession]
  type MatchmakerData = String
  type MatchmakingAcceptanceTimeoutInteger = Int
  type MatchmakingConfigurationArn = String
  type MatchmakingConfigurationList = js.Array[MatchmakingConfiguration]
  type MatchmakingConfigurationName = String
  type MatchmakingConfigurationNameList = js.Array[MatchmakingConfigurationName]
  type MatchmakingIdList = js.Array[MatchmakingIdStringModel]
  type MatchmakingIdStringModel = String
  type MatchmakingRequestTimeoutInteger = Int
  type MatchmakingRuleSetArn = String
  type MatchmakingRuleSetList = js.Array[MatchmakingRuleSet]
  type MatchmakingRuleSetName = String
  type MatchmakingRuleSetNameList = js.Array[MatchmakingRuleSetName]
  type MatchmakingTicketList = js.Array[MatchmakingTicket]
  type MaxConcurrentGameSessionActivations = Int
  type MetricGroup = String
  type MetricGroupList = js.Array[MetricGroup]
  type NonBlankAndLengthConstraintString = String
  type NonBlankString = String
  type NonEmptyString = String
  type NonNegativeDouble = Double
  type NonZeroAndMaxString = String
  type PlacedPlayerSessionList = js.Array[PlacedPlayerSession]
  type PlayerAttributeMap = js.Dictionary[AttributeValue]
  type PlayerData = String
  type PlayerDataMap = js.Dictionary[PlayerData]
  type PlayerIdList = js.Array[NonZeroAndMaxString]
  type PlayerLatencyList = js.Array[PlayerLatency]
  type PlayerLatencyPolicyList = js.Array[PlayerLatencyPolicy]
  type PlayerList = js.Array[Player]
  type PlayerSessionId = String
  type PlayerSessionList = js.Array[PlayerSession]
  type PortNumber = Int
  type PositiveInteger = Int
  type PositiveLong = Double
  type QueueArnsList = js.Array[ArnStringModel]
  type RuleSetBody = String
  type RuleSetLimit = Int
  type ScalingPolicyList = js.Array[ScalingPolicy]
  type ScriptArn = String
  type ScriptId = String
  type ScriptIdOrArn = String
  type ScriptList = js.Array[Script]
  type ServerProcessList = js.Array[ServerProcess]
  type SnsArnStringModel = String
  type StringDoubleMap = js.Dictionary[DoubleObject]
  type StringList = js.Array[NonZeroAndMaxString]
  type StringModel = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type Timestamp = js.Date
  type VpcPeeringAuthorizationList = js.Array[VpcPeeringAuthorization]
  type VpcPeeringConnectionList = js.Array[VpcPeeringConnection]
  type VpcSubnet = String
  type VpcSubnets = js.Array[VpcSubnet]
  type WeightedCapacity = String
  type WholeNumber = Int
  type ZipBlob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String

  implicit final class GameLiftOps(private val service: GameLift) extends AnyVal {

    @inline def acceptMatchFuture(params: AcceptMatchInput): Future[AcceptMatchOutput] = service.acceptMatch(params).promise().toFuture
    @inline def claimGameServerFuture(params: ClaimGameServerInput): Future[ClaimGameServerOutput] = service.claimGameServer(params).promise().toFuture
    @inline def createAliasFuture(params: CreateAliasInput): Future[CreateAliasOutput] = service.createAlias(params).promise().toFuture
    @inline def createBuildFuture(params: CreateBuildInput): Future[CreateBuildOutput] = service.createBuild(params).promise().toFuture
    @inline def createFleetFuture(params: CreateFleetInput): Future[CreateFleetOutput] = service.createFleet(params).promise().toFuture
    @inline def createGameServerGroupFuture(params: CreateGameServerGroupInput): Future[CreateGameServerGroupOutput] = service.createGameServerGroup(params).promise().toFuture
    @inline def createGameSessionFuture(params: CreateGameSessionInput): Future[CreateGameSessionOutput] = service.createGameSession(params).promise().toFuture
    @inline def createGameSessionQueueFuture(params: CreateGameSessionQueueInput): Future[CreateGameSessionQueueOutput] = service.createGameSessionQueue(params).promise().toFuture
    @inline def createMatchmakingConfigurationFuture(params: CreateMatchmakingConfigurationInput): Future[CreateMatchmakingConfigurationOutput] = service.createMatchmakingConfiguration(params).promise().toFuture
    @inline def createMatchmakingRuleSetFuture(params: CreateMatchmakingRuleSetInput): Future[CreateMatchmakingRuleSetOutput] = service.createMatchmakingRuleSet(params).promise().toFuture
    @inline def createPlayerSessionFuture(params: CreatePlayerSessionInput): Future[CreatePlayerSessionOutput] = service.createPlayerSession(params).promise().toFuture
    @inline def createPlayerSessionsFuture(params: CreatePlayerSessionsInput): Future[CreatePlayerSessionsOutput] = service.createPlayerSessions(params).promise().toFuture
    @inline def createScriptFuture(params: CreateScriptInput): Future[CreateScriptOutput] = service.createScript(params).promise().toFuture
    @inline def createVpcPeeringAuthorizationFuture(params: CreateVpcPeeringAuthorizationInput): Future[CreateVpcPeeringAuthorizationOutput] = service.createVpcPeeringAuthorization(params).promise().toFuture
    @inline def createVpcPeeringConnectionFuture(params: CreateVpcPeeringConnectionInput): Future[CreateVpcPeeringConnectionOutput] = service.createVpcPeeringConnection(params).promise().toFuture
    @inline def deleteAliasFuture(params: DeleteAliasInput): Future[js.Object] = service.deleteAlias(params).promise().toFuture
    @inline def deleteBuildFuture(params: DeleteBuildInput): Future[js.Object] = service.deleteBuild(params).promise().toFuture
    @inline def deleteFleetFuture(params: DeleteFleetInput): Future[js.Object] = service.deleteFleet(params).promise().toFuture
    @inline def deleteGameServerGroupFuture(params: DeleteGameServerGroupInput): Future[DeleteGameServerGroupOutput] = service.deleteGameServerGroup(params).promise().toFuture
    @inline def deleteGameSessionQueueFuture(params: DeleteGameSessionQueueInput): Future[DeleteGameSessionQueueOutput] = service.deleteGameSessionQueue(params).promise().toFuture
    @inline def deleteMatchmakingConfigurationFuture(params: DeleteMatchmakingConfigurationInput): Future[DeleteMatchmakingConfigurationOutput] = service.deleteMatchmakingConfiguration(params).promise().toFuture
    @inline def deleteMatchmakingRuleSetFuture(params: DeleteMatchmakingRuleSetInput): Future[DeleteMatchmakingRuleSetOutput] = service.deleteMatchmakingRuleSet(params).promise().toFuture
    @inline def deleteScalingPolicyFuture(params: DeleteScalingPolicyInput): Future[js.Object] = service.deleteScalingPolicy(params).promise().toFuture
    @inline def deleteScriptFuture(params: DeleteScriptInput): Future[js.Object] = service.deleteScript(params).promise().toFuture
    @inline def deleteVpcPeeringAuthorizationFuture(params: DeleteVpcPeeringAuthorizationInput): Future[DeleteVpcPeeringAuthorizationOutput] = service.deleteVpcPeeringAuthorization(params).promise().toFuture
    @inline def deleteVpcPeeringConnectionFuture(params: DeleteVpcPeeringConnectionInput): Future[DeleteVpcPeeringConnectionOutput] = service.deleteVpcPeeringConnection(params).promise().toFuture
    @inline def deregisterGameServerFuture(params: DeregisterGameServerInput): Future[js.Object] = service.deregisterGameServer(params).promise().toFuture
    @inline def describeAliasFuture(params: DescribeAliasInput): Future[DescribeAliasOutput] = service.describeAlias(params).promise().toFuture
    @inline def describeBuildFuture(params: DescribeBuildInput): Future[DescribeBuildOutput] = service.describeBuild(params).promise().toFuture
    @inline def describeEC2InstanceLimitsFuture(params: DescribeEC2InstanceLimitsInput): Future[DescribeEC2InstanceLimitsOutput] = service.describeEC2InstanceLimits(params).promise().toFuture
    @inline def describeFleetAttributesFuture(params: DescribeFleetAttributesInput): Future[DescribeFleetAttributesOutput] = service.describeFleetAttributes(params).promise().toFuture
    @inline def describeFleetCapacityFuture(params: DescribeFleetCapacityInput): Future[DescribeFleetCapacityOutput] = service.describeFleetCapacity(params).promise().toFuture
    @inline def describeFleetEventsFuture(params: DescribeFleetEventsInput): Future[DescribeFleetEventsOutput] = service.describeFleetEvents(params).promise().toFuture
    @inline def describeFleetPortSettingsFuture(params: DescribeFleetPortSettingsInput): Future[DescribeFleetPortSettingsOutput] = service.describeFleetPortSettings(params).promise().toFuture
    @inline def describeFleetUtilizationFuture(params: DescribeFleetUtilizationInput): Future[DescribeFleetUtilizationOutput] = service.describeFleetUtilization(params).promise().toFuture
    @inline def describeGameServerFuture(params: DescribeGameServerInput): Future[DescribeGameServerOutput] = service.describeGameServer(params).promise().toFuture
    @inline def describeGameServerGroupFuture(params: DescribeGameServerGroupInput): Future[DescribeGameServerGroupOutput] = service.describeGameServerGroup(params).promise().toFuture
    @inline def describeGameServerInstancesFuture(params: DescribeGameServerInstancesInput): Future[DescribeGameServerInstancesOutput] = service.describeGameServerInstances(params).promise().toFuture
    @inline def describeGameSessionDetailsFuture(params: DescribeGameSessionDetailsInput): Future[DescribeGameSessionDetailsOutput] = service.describeGameSessionDetails(params).promise().toFuture
    @inline def describeGameSessionPlacementFuture(params: DescribeGameSessionPlacementInput): Future[DescribeGameSessionPlacementOutput] = service.describeGameSessionPlacement(params).promise().toFuture
    @inline def describeGameSessionQueuesFuture(params: DescribeGameSessionQueuesInput): Future[DescribeGameSessionQueuesOutput] = service.describeGameSessionQueues(params).promise().toFuture
    @inline def describeGameSessionsFuture(params: DescribeGameSessionsInput): Future[DescribeGameSessionsOutput] = service.describeGameSessions(params).promise().toFuture
    @inline def describeInstancesFuture(params: DescribeInstancesInput): Future[DescribeInstancesOutput] = service.describeInstances(params).promise().toFuture
    @inline def describeMatchmakingConfigurationsFuture(params: DescribeMatchmakingConfigurationsInput): Future[DescribeMatchmakingConfigurationsOutput] = service.describeMatchmakingConfigurations(params).promise().toFuture
    @inline def describeMatchmakingFuture(params: DescribeMatchmakingInput): Future[DescribeMatchmakingOutput] = service.describeMatchmaking(params).promise().toFuture
    @inline def describeMatchmakingRuleSetsFuture(params: DescribeMatchmakingRuleSetsInput): Future[DescribeMatchmakingRuleSetsOutput] = service.describeMatchmakingRuleSets(params).promise().toFuture
    @inline def describePlayerSessionsFuture(params: DescribePlayerSessionsInput): Future[DescribePlayerSessionsOutput] = service.describePlayerSessions(params).promise().toFuture
    @inline def describeRuntimeConfigurationFuture(params: DescribeRuntimeConfigurationInput): Future[DescribeRuntimeConfigurationOutput] = service.describeRuntimeConfiguration(params).promise().toFuture
    @inline def describeScalingPoliciesFuture(params: DescribeScalingPoliciesInput): Future[DescribeScalingPoliciesOutput] = service.describeScalingPolicies(params).promise().toFuture
    @inline def describeScriptFuture(params: DescribeScriptInput): Future[DescribeScriptOutput] = service.describeScript(params).promise().toFuture
    @inline def describeVpcPeeringAuthorizationsFuture(params: DescribeVpcPeeringAuthorizationsInput): Future[DescribeVpcPeeringAuthorizationsOutput] = service.describeVpcPeeringAuthorizations(params).promise().toFuture
    @inline def describeVpcPeeringConnectionsFuture(params: DescribeVpcPeeringConnectionsInput): Future[DescribeVpcPeeringConnectionsOutput] = service.describeVpcPeeringConnections(params).promise().toFuture
    @inline def getGameSessionLogUrlFuture(params: GetGameSessionLogUrlInput): Future[GetGameSessionLogUrlOutput] = service.getGameSessionLogUrl(params).promise().toFuture
    @inline def getInstanceAccessFuture(params: GetInstanceAccessInput): Future[GetInstanceAccessOutput] = service.getInstanceAccess(params).promise().toFuture
    @inline def listAliasesFuture(params: ListAliasesInput): Future[ListAliasesOutput] = service.listAliases(params).promise().toFuture
    @inline def listBuildsFuture(params: ListBuildsInput): Future[ListBuildsOutput] = service.listBuilds(params).promise().toFuture
    @inline def listFleetsFuture(params: ListFleetsInput): Future[ListFleetsOutput] = service.listFleets(params).promise().toFuture
    @inline def listGameServerGroupsFuture(params: ListGameServerGroupsInput): Future[ListGameServerGroupsOutput] = service.listGameServerGroups(params).promise().toFuture
    @inline def listGameServersFuture(params: ListGameServersInput): Future[ListGameServersOutput] = service.listGameServers(params).promise().toFuture
    @inline def listScriptsFuture(params: ListScriptsInput): Future[ListScriptsOutput] = service.listScripts(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def putScalingPolicyFuture(params: PutScalingPolicyInput): Future[PutScalingPolicyOutput] = service.putScalingPolicy(params).promise().toFuture
    @inline def registerGameServerFuture(params: RegisterGameServerInput): Future[RegisterGameServerOutput] = service.registerGameServer(params).promise().toFuture
    @inline def requestUploadCredentialsFuture(params: RequestUploadCredentialsInput): Future[RequestUploadCredentialsOutput] = service.requestUploadCredentials(params).promise().toFuture
    @inline def resolveAliasFuture(params: ResolveAliasInput): Future[ResolveAliasOutput] = service.resolveAlias(params).promise().toFuture
    @inline def resumeGameServerGroupFuture(params: ResumeGameServerGroupInput): Future[ResumeGameServerGroupOutput] = service.resumeGameServerGroup(params).promise().toFuture
    @inline def searchGameSessionsFuture(params: SearchGameSessionsInput): Future[SearchGameSessionsOutput] = service.searchGameSessions(params).promise().toFuture
    @inline def startFleetActionsFuture(params: StartFleetActionsInput): Future[StartFleetActionsOutput] = service.startFleetActions(params).promise().toFuture
    @inline def startGameSessionPlacementFuture(params: StartGameSessionPlacementInput): Future[StartGameSessionPlacementOutput] = service.startGameSessionPlacement(params).promise().toFuture
    @inline def startMatchBackfillFuture(params: StartMatchBackfillInput): Future[StartMatchBackfillOutput] = service.startMatchBackfill(params).promise().toFuture
    @inline def startMatchmakingFuture(params: StartMatchmakingInput): Future[StartMatchmakingOutput] = service.startMatchmaking(params).promise().toFuture
    @inline def stopFleetActionsFuture(params: StopFleetActionsInput): Future[StopFleetActionsOutput] = service.stopFleetActions(params).promise().toFuture
    @inline def stopGameSessionPlacementFuture(params: StopGameSessionPlacementInput): Future[StopGameSessionPlacementOutput] = service.stopGameSessionPlacement(params).promise().toFuture
    @inline def stopMatchmakingFuture(params: StopMatchmakingInput): Future[StopMatchmakingOutput] = service.stopMatchmaking(params).promise().toFuture
    @inline def suspendGameServerGroupFuture(params: SuspendGameServerGroupInput): Future[SuspendGameServerGroupOutput] = service.suspendGameServerGroup(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateAliasFuture(params: UpdateAliasInput): Future[UpdateAliasOutput] = service.updateAlias(params).promise().toFuture
    @inline def updateBuildFuture(params: UpdateBuildInput): Future[UpdateBuildOutput] = service.updateBuild(params).promise().toFuture
    @inline def updateFleetAttributesFuture(params: UpdateFleetAttributesInput): Future[UpdateFleetAttributesOutput] = service.updateFleetAttributes(params).promise().toFuture
    @inline def updateFleetCapacityFuture(params: UpdateFleetCapacityInput): Future[UpdateFleetCapacityOutput] = service.updateFleetCapacity(params).promise().toFuture
    @inline def updateFleetPortSettingsFuture(params: UpdateFleetPortSettingsInput): Future[UpdateFleetPortSettingsOutput] = service.updateFleetPortSettings(params).promise().toFuture
    @inline def updateGameServerFuture(params: UpdateGameServerInput): Future[UpdateGameServerOutput] = service.updateGameServer(params).promise().toFuture
    @inline def updateGameServerGroupFuture(params: UpdateGameServerGroupInput): Future[UpdateGameServerGroupOutput] = service.updateGameServerGroup(params).promise().toFuture
    @inline def updateGameSessionFuture(params: UpdateGameSessionInput): Future[UpdateGameSessionOutput] = service.updateGameSession(params).promise().toFuture
    @inline def updateGameSessionQueueFuture(params: UpdateGameSessionQueueInput): Future[UpdateGameSessionQueueOutput] = service.updateGameSessionQueue(params).promise().toFuture
    @inline def updateMatchmakingConfigurationFuture(params: UpdateMatchmakingConfigurationInput): Future[UpdateMatchmakingConfigurationOutput] = service.updateMatchmakingConfiguration(params).promise().toFuture
    @inline def updateRuntimeConfigurationFuture(params: UpdateRuntimeConfigurationInput): Future[UpdateRuntimeConfigurationOutput] = service.updateRuntimeConfiguration(params).promise().toFuture
    @inline def updateScriptFuture(params: UpdateScriptInput): Future[UpdateScriptOutput] = service.updateScript(params).promise().toFuture
    @inline def validateMatchmakingRuleSetFuture(params: ValidateMatchmakingRuleSetInput): Future[ValidateMatchmakingRuleSetOutput] = service.validateMatchmakingRuleSet(params).promise().toFuture

  }
}

package gamelift {
  @js.native
  @JSImport("aws-sdk/clients/gamelift", JSImport.Namespace, "AWS.GameLift")
  class GameLift() extends js.Object {
    def this(config: AWSConfig) = this()

    def acceptMatch(params: AcceptMatchInput): Request[AcceptMatchOutput] = js.native
    def claimGameServer(params: ClaimGameServerInput): Request[ClaimGameServerOutput] = js.native
    def createAlias(params: CreateAliasInput): Request[CreateAliasOutput] = js.native
    def createBuild(params: CreateBuildInput): Request[CreateBuildOutput] = js.native
    def createFleet(params: CreateFleetInput): Request[CreateFleetOutput] = js.native
    def createGameServerGroup(params: CreateGameServerGroupInput): Request[CreateGameServerGroupOutput] = js.native
    def createGameSession(params: CreateGameSessionInput): Request[CreateGameSessionOutput] = js.native
    def createGameSessionQueue(params: CreateGameSessionQueueInput): Request[CreateGameSessionQueueOutput] = js.native
    def createMatchmakingConfiguration(params: CreateMatchmakingConfigurationInput): Request[CreateMatchmakingConfigurationOutput] = js.native
    def createMatchmakingRuleSet(params: CreateMatchmakingRuleSetInput): Request[CreateMatchmakingRuleSetOutput] = js.native
    def createPlayerSession(params: CreatePlayerSessionInput): Request[CreatePlayerSessionOutput] = js.native
    def createPlayerSessions(params: CreatePlayerSessionsInput): Request[CreatePlayerSessionsOutput] = js.native
    def createScript(params: CreateScriptInput): Request[CreateScriptOutput] = js.native
    def createVpcPeeringAuthorization(params: CreateVpcPeeringAuthorizationInput): Request[CreateVpcPeeringAuthorizationOutput] = js.native
    def createVpcPeeringConnection(params: CreateVpcPeeringConnectionInput): Request[CreateVpcPeeringConnectionOutput] = js.native
    def deleteAlias(params: DeleteAliasInput): Request[js.Object] = js.native
    def deleteBuild(params: DeleteBuildInput): Request[js.Object] = js.native
    def deleteFleet(params: DeleteFleetInput): Request[js.Object] = js.native
    def deleteGameServerGroup(params: DeleteGameServerGroupInput): Request[DeleteGameServerGroupOutput] = js.native
    def deleteGameSessionQueue(params: DeleteGameSessionQueueInput): Request[DeleteGameSessionQueueOutput] = js.native
    def deleteMatchmakingConfiguration(params: DeleteMatchmakingConfigurationInput): Request[DeleteMatchmakingConfigurationOutput] = js.native
    def deleteMatchmakingRuleSet(params: DeleteMatchmakingRuleSetInput): Request[DeleteMatchmakingRuleSetOutput] = js.native
    def deleteScalingPolicy(params: DeleteScalingPolicyInput): Request[js.Object] = js.native
    def deleteScript(params: DeleteScriptInput): Request[js.Object] = js.native
    def deleteVpcPeeringAuthorization(params: DeleteVpcPeeringAuthorizationInput): Request[DeleteVpcPeeringAuthorizationOutput] = js.native
    def deleteVpcPeeringConnection(params: DeleteVpcPeeringConnectionInput): Request[DeleteVpcPeeringConnectionOutput] = js.native
    def deregisterGameServer(params: DeregisterGameServerInput): Request[js.Object] = js.native
    def describeAlias(params: DescribeAliasInput): Request[DescribeAliasOutput] = js.native
    def describeBuild(params: DescribeBuildInput): Request[DescribeBuildOutput] = js.native
    def describeEC2InstanceLimits(params: DescribeEC2InstanceLimitsInput): Request[DescribeEC2InstanceLimitsOutput] = js.native
    def describeFleetAttributes(params: DescribeFleetAttributesInput): Request[DescribeFleetAttributesOutput] = js.native
    def describeFleetCapacity(params: DescribeFleetCapacityInput): Request[DescribeFleetCapacityOutput] = js.native
    def describeFleetEvents(params: DescribeFleetEventsInput): Request[DescribeFleetEventsOutput] = js.native
    def describeFleetPortSettings(params: DescribeFleetPortSettingsInput): Request[DescribeFleetPortSettingsOutput] = js.native
    def describeFleetUtilization(params: DescribeFleetUtilizationInput): Request[DescribeFleetUtilizationOutput] = js.native
    def describeGameServer(params: DescribeGameServerInput): Request[DescribeGameServerOutput] = js.native
    def describeGameServerGroup(params: DescribeGameServerGroupInput): Request[DescribeGameServerGroupOutput] = js.native
    def describeGameServerInstances(params: DescribeGameServerInstancesInput): Request[DescribeGameServerInstancesOutput] = js.native
    def describeGameSessionDetails(params: DescribeGameSessionDetailsInput): Request[DescribeGameSessionDetailsOutput] = js.native
    def describeGameSessionPlacement(params: DescribeGameSessionPlacementInput): Request[DescribeGameSessionPlacementOutput] = js.native
    def describeGameSessionQueues(params: DescribeGameSessionQueuesInput): Request[DescribeGameSessionQueuesOutput] = js.native
    def describeGameSessions(params: DescribeGameSessionsInput): Request[DescribeGameSessionsOutput] = js.native
    def describeInstances(params: DescribeInstancesInput): Request[DescribeInstancesOutput] = js.native
    def describeMatchmaking(params: DescribeMatchmakingInput): Request[DescribeMatchmakingOutput] = js.native
    def describeMatchmakingConfigurations(params: DescribeMatchmakingConfigurationsInput): Request[DescribeMatchmakingConfigurationsOutput] = js.native
    def describeMatchmakingRuleSets(params: DescribeMatchmakingRuleSetsInput): Request[DescribeMatchmakingRuleSetsOutput] = js.native
    def describePlayerSessions(params: DescribePlayerSessionsInput): Request[DescribePlayerSessionsOutput] = js.native
    def describeRuntimeConfiguration(params: DescribeRuntimeConfigurationInput): Request[DescribeRuntimeConfigurationOutput] = js.native
    def describeScalingPolicies(params: DescribeScalingPoliciesInput): Request[DescribeScalingPoliciesOutput] = js.native
    def describeScript(params: DescribeScriptInput): Request[DescribeScriptOutput] = js.native
    def describeVpcPeeringAuthorizations(params: DescribeVpcPeeringAuthorizationsInput): Request[DescribeVpcPeeringAuthorizationsOutput] = js.native
    def describeVpcPeeringConnections(params: DescribeVpcPeeringConnectionsInput): Request[DescribeVpcPeeringConnectionsOutput] = js.native
    def getGameSessionLogUrl(params: GetGameSessionLogUrlInput): Request[GetGameSessionLogUrlOutput] = js.native
    def getInstanceAccess(params: GetInstanceAccessInput): Request[GetInstanceAccessOutput] = js.native
    def listAliases(params: ListAliasesInput): Request[ListAliasesOutput] = js.native
    def listBuilds(params: ListBuildsInput): Request[ListBuildsOutput] = js.native
    def listFleets(params: ListFleetsInput): Request[ListFleetsOutput] = js.native
    def listGameServerGroups(params: ListGameServerGroupsInput): Request[ListGameServerGroupsOutput] = js.native
    def listGameServers(params: ListGameServersInput): Request[ListGameServersOutput] = js.native
    def listScripts(params: ListScriptsInput): Request[ListScriptsOutput] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def putScalingPolicy(params: PutScalingPolicyInput): Request[PutScalingPolicyOutput] = js.native
    def registerGameServer(params: RegisterGameServerInput): Request[RegisterGameServerOutput] = js.native
    def requestUploadCredentials(params: RequestUploadCredentialsInput): Request[RequestUploadCredentialsOutput] = js.native
    def resolveAlias(params: ResolveAliasInput): Request[ResolveAliasOutput] = js.native
    def resumeGameServerGroup(params: ResumeGameServerGroupInput): Request[ResumeGameServerGroupOutput] = js.native
    def searchGameSessions(params: SearchGameSessionsInput): Request[SearchGameSessionsOutput] = js.native
    def startFleetActions(params: StartFleetActionsInput): Request[StartFleetActionsOutput] = js.native
    def startGameSessionPlacement(params: StartGameSessionPlacementInput): Request[StartGameSessionPlacementOutput] = js.native
    def startMatchBackfill(params: StartMatchBackfillInput): Request[StartMatchBackfillOutput] = js.native
    def startMatchmaking(params: StartMatchmakingInput): Request[StartMatchmakingOutput] = js.native
    def stopFleetActions(params: StopFleetActionsInput): Request[StopFleetActionsOutput] = js.native
    def stopGameSessionPlacement(params: StopGameSessionPlacementInput): Request[StopGameSessionPlacementOutput] = js.native
    def stopMatchmaking(params: StopMatchmakingInput): Request[StopMatchmakingOutput] = js.native
    def suspendGameServerGroup(params: SuspendGameServerGroupInput): Request[SuspendGameServerGroupOutput] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateAlias(params: UpdateAliasInput): Request[UpdateAliasOutput] = js.native
    def updateBuild(params: UpdateBuildInput): Request[UpdateBuildOutput] = js.native
    def updateFleetAttributes(params: UpdateFleetAttributesInput): Request[UpdateFleetAttributesOutput] = js.native
    def updateFleetCapacity(params: UpdateFleetCapacityInput): Request[UpdateFleetCapacityOutput] = js.native
    def updateFleetPortSettings(params: UpdateFleetPortSettingsInput): Request[UpdateFleetPortSettingsOutput] = js.native
    def updateGameServer(params: UpdateGameServerInput): Request[UpdateGameServerOutput] = js.native
    def updateGameServerGroup(params: UpdateGameServerGroupInput): Request[UpdateGameServerGroupOutput] = js.native
    def updateGameSession(params: UpdateGameSessionInput): Request[UpdateGameSessionOutput] = js.native
    def updateGameSessionQueue(params: UpdateGameSessionQueueInput): Request[UpdateGameSessionQueueOutput] = js.native
    def updateMatchmakingConfiguration(params: UpdateMatchmakingConfigurationInput): Request[UpdateMatchmakingConfigurationOutput] = js.native
    def updateRuntimeConfiguration(params: UpdateRuntimeConfigurationInput): Request[UpdateRuntimeConfigurationOutput] = js.native
    def updateScript(params: UpdateScriptInput): Request[UpdateScriptOutput] = js.native
    def validateMatchmakingRuleSet(params: ValidateMatchmakingRuleSetInput): Request[ValidateMatchmakingRuleSetOutput] = js.native
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait AcceptMatchInput extends js.Object {
    var AcceptanceType: AcceptanceType
    var PlayerIds: StringList
    var TicketId: MatchmakingIdStringModel
  }

  object AcceptMatchInput {
    @inline
    def apply(
        AcceptanceType: AcceptanceType,
        PlayerIds: StringList,
        TicketId: MatchmakingIdStringModel
    ): AcceptMatchInput = {
      val __obj = js.Dynamic.literal(
        "AcceptanceType" -> AcceptanceType.asInstanceOf[js.Any],
        "PlayerIds" -> PlayerIds.asInstanceOf[js.Any],
        "TicketId" -> TicketId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AcceptMatchInput]
    }
  }

  @js.native
  trait AcceptMatchOutput extends js.Object

  object AcceptMatchOutput {
    @inline
    def apply(): AcceptMatchOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AcceptMatchOutput]
    }
  }

  @js.native
  sealed trait AcceptanceType extends js.Any
  object AcceptanceType {
    val ACCEPT = "ACCEPT".asInstanceOf[AcceptanceType]
    val REJECT = "REJECT".asInstanceOf[AcceptanceType]

    @inline def values = js.Array(ACCEPT, REJECT)
  }

  /** Properties that describe an alias resource.
    * * <a>CreateAlias</a>
    * * <a>ListAliases</a>
    * * <a>DescribeAlias</a>
    * * <a>UpdateAlias</a>
    * * <a>DeleteAlias</a>
    * * <a>ResolveAlias</a>
    */
  @js.native
  trait Alias extends js.Object {
    var AliasArn: js.UndefOr[AliasArn]
    var AliasId: js.UndefOr[AliasId]
    var CreationTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[FreeText]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[NonBlankAndLengthConstraintString]
    var RoutingStrategy: js.UndefOr[RoutingStrategy]
  }

  object Alias {
    @inline
    def apply(
        AliasArn: js.UndefOr[AliasArn] = js.undefined,
        AliasId: js.UndefOr[AliasId] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[FreeText] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[NonBlankAndLengthConstraintString] = js.undefined,
        RoutingStrategy: js.UndefOr[RoutingStrategy] = js.undefined
    ): Alias = {
      val __obj = js.Dynamic.literal()
      AliasArn.foreach(__v => __obj.updateDynamic("AliasArn")(__v.asInstanceOf[js.Any]))
      AliasId.foreach(__v => __obj.updateDynamic("AliasId")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RoutingStrategy.foreach(__v => __obj.updateDynamic("RoutingStrategy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Alias]
    }
  }

  /** Values for use in <a>Player</a> attribute key-value pairs. This object lets you specify an attribute value using any of the valid data types: string, number, string array, or data map. Each <code>AttributeValue</code> object can use only one of the available properties.
    */
  @js.native
  trait AttributeValue extends js.Object {
    var N: js.UndefOr[DoubleObject]
    var S: js.UndefOr[NonZeroAndMaxString]
    var SDM: js.UndefOr[StringDoubleMap]
    var SL: js.UndefOr[StringList]
  }

  object AttributeValue {
    @inline
    def apply(
        N: js.UndefOr[DoubleObject] = js.undefined,
        S: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        SDM: js.UndefOr[StringDoubleMap] = js.undefined,
        SL: js.UndefOr[StringList] = js.undefined
    ): AttributeValue = {
      val __obj = js.Dynamic.literal()
      N.foreach(__v => __obj.updateDynamic("N")(__v.asInstanceOf[js.Any]))
      S.foreach(__v => __obj.updateDynamic("S")(__v.asInstanceOf[js.Any]))
      SDM.foreach(__v => __obj.updateDynamic("SDM")(__v.asInstanceOf[js.Any]))
      SL.foreach(__v => __obj.updateDynamic("SL")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttributeValue]
    }
  }

  /** Temporary access credentials used for uploading game build files to Amazon GameLift. They are valid for a limited time. If they expire before you upload your game build, get a new set by calling <a>RequestUploadCredentials</a>.
    */
  @js.native
  trait AwsCredentials extends js.Object {
    var AccessKeyId: js.UndefOr[NonEmptyString]
    var SecretAccessKey: js.UndefOr[NonEmptyString]
    var SessionToken: js.UndefOr[NonEmptyString]
  }

  object AwsCredentials {
    @inline
    def apply(
        AccessKeyId: js.UndefOr[NonEmptyString] = js.undefined,
        SecretAccessKey: js.UndefOr[NonEmptyString] = js.undefined,
        SessionToken: js.UndefOr[NonEmptyString] = js.undefined
    ): AwsCredentials = {
      val __obj = js.Dynamic.literal()
      AccessKeyId.foreach(__v => __obj.updateDynamic("AccessKeyId")(__v.asInstanceOf[js.Any]))
      SecretAccessKey.foreach(__v => __obj.updateDynamic("SecretAccessKey")(__v.asInstanceOf[js.Any]))
      SessionToken.foreach(__v => __obj.updateDynamic("SessionToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCredentials]
    }
  }

  @js.native
  sealed trait BackfillMode extends js.Any
  object BackfillMode {
    val AUTOMATIC = "AUTOMATIC".asInstanceOf[BackfillMode]
    val MANUAL = "MANUAL".asInstanceOf[BackfillMode]

    @inline def values = js.Array(AUTOMATIC, MANUAL)
  }

  @js.native
  sealed trait BalancingStrategy extends js.Any
  object BalancingStrategy {
    val SPOT_ONLY = "SPOT_ONLY".asInstanceOf[BalancingStrategy]
    val SPOT_PREFERRED = "SPOT_PREFERRED".asInstanceOf[BalancingStrategy]
    val ON_DEMAND_ONLY = "ON_DEMAND_ONLY".asInstanceOf[BalancingStrategy]

    @inline def values = js.Array(SPOT_ONLY, SPOT_PREFERRED, ON_DEMAND_ONLY)
  }

  /** Properties describing a custom game build.
    * ```Related operations```
    * * <a>CreateBuild</a>
    * * <a>ListBuilds</a>
    * * <a>DescribeBuild</a>
    * * <a>UpdateBuild</a>
    * * <a>DeleteBuild</a>
    */
  @js.native
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

  object Build {
    @inline
    def apply(
        BuildArn: js.UndefOr[BuildArn] = js.undefined,
        BuildId: js.UndefOr[BuildId] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[FreeText] = js.undefined,
        OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined,
        SizeOnDisk: js.UndefOr[PositiveLong] = js.undefined,
        Status: js.UndefOr[BuildStatus] = js.undefined,
        Version: js.UndefOr[FreeText] = js.undefined
    ): Build = {
      val __obj = js.Dynamic.literal()
      BuildArn.foreach(__v => __obj.updateDynamic("BuildArn")(__v.asInstanceOf[js.Any]))
      BuildId.foreach(__v => __obj.updateDynamic("BuildId")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OperatingSystem.foreach(__v => __obj.updateDynamic("OperatingSystem")(__v.asInstanceOf[js.Any]))
      SizeOnDisk.foreach(__v => __obj.updateDynamic("SizeOnDisk")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Build]
    }
  }

  @js.native
  sealed trait BuildStatus extends js.Any
  object BuildStatus {
    val INITIALIZED = "INITIALIZED".asInstanceOf[BuildStatus]
    val READY = "READY".asInstanceOf[BuildStatus]
    val FAILED = "FAILED".asInstanceOf[BuildStatus]

    @inline def values = js.Array(INITIALIZED, READY, FAILED)
  }

  /** Information about the use of a TLS/SSL certificate for a fleet. TLS certificate generation is enabled at the fleet level, with one certificate generated for the fleet. When this feature is enabled, the certificate can be retrieved using the [[https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-serversdk.html|GameLift Server SDK]] call <code>GetInstanceCertificate</code>. All instances in a fleet share the same certificate.
    */
  @js.native
  trait CertificateConfiguration extends js.Object {
    var CertificateType: CertificateType
  }

  object CertificateConfiguration {
    @inline
    def apply(
        CertificateType: CertificateType
    ): CertificateConfiguration = {
      val __obj = js.Dynamic.literal(
        "CertificateType" -> CertificateType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CertificateConfiguration]
    }
  }

  @js.native
  sealed trait CertificateType extends js.Any
  object CertificateType {
    val DISABLED = "DISABLED".asInstanceOf[CertificateType]
    val GENERATED = "GENERATED".asInstanceOf[CertificateType]

    @inline def values = js.Array(DISABLED, GENERATED)
  }

  @js.native
  trait ClaimGameServerInput extends js.Object {
    var GameServerGroupName: GameServerGroupNameOrArn
    var GameServerData: js.UndefOr[GameServerData]
    var GameServerId: js.UndefOr[GameServerId]
  }

  object ClaimGameServerInput {
    @inline
    def apply(
        GameServerGroupName: GameServerGroupNameOrArn,
        GameServerData: js.UndefOr[GameServerData] = js.undefined,
        GameServerId: js.UndefOr[GameServerId] = js.undefined
    ): ClaimGameServerInput = {
      val __obj = js.Dynamic.literal(
        "GameServerGroupName" -> GameServerGroupName.asInstanceOf[js.Any]
      )

      GameServerData.foreach(__v => __obj.updateDynamic("GameServerData")(__v.asInstanceOf[js.Any]))
      GameServerId.foreach(__v => __obj.updateDynamic("GameServerId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClaimGameServerInput]
    }
  }

  @js.native
  trait ClaimGameServerOutput extends js.Object {
    var GameServer: js.UndefOr[GameServer]
  }

  object ClaimGameServerOutput {
    @inline
    def apply(
        GameServer: js.UndefOr[GameServer] = js.undefined
    ): ClaimGameServerOutput = {
      val __obj = js.Dynamic.literal()
      GameServer.foreach(__v => __obj.updateDynamic("GameServer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClaimGameServerOutput]
    }
  }

  @js.native
  sealed trait ComparisonOperatorType extends js.Any
  object ComparisonOperatorType {
    val GreaterThanOrEqualToThreshold = "GreaterThanOrEqualToThreshold".asInstanceOf[ComparisonOperatorType]
    val GreaterThanThreshold = "GreaterThanThreshold".asInstanceOf[ComparisonOperatorType]
    val LessThanThreshold = "LessThanThreshold".asInstanceOf[ComparisonOperatorType]
    val LessThanOrEqualToThreshold = "LessThanOrEqualToThreshold".asInstanceOf[ComparisonOperatorType]

    @inline def values = js.Array(GreaterThanOrEqualToThreshold, GreaterThanThreshold, LessThanThreshold, LessThanOrEqualToThreshold)
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait CreateAliasInput extends js.Object {
    var Name: NonBlankAndLengthConstraintString
    var RoutingStrategy: RoutingStrategy
    var Description: js.UndefOr[NonZeroAndMaxString]
    var Tags: js.UndefOr[TagList]
  }

  object CreateAliasInput {
    @inline
    def apply(
        Name: NonBlankAndLengthConstraintString,
        RoutingStrategy: RoutingStrategy,
        Description: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateAliasInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "RoutingStrategy" -> RoutingStrategy.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAliasInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait CreateAliasOutput extends js.Object {
    var Alias: js.UndefOr[Alias]
  }

  object CreateAliasOutput {
    @inline
    def apply(
        Alias: js.UndefOr[Alias] = js.undefined
    ): CreateAliasOutput = {
      val __obj = js.Dynamic.literal()
      Alias.foreach(__v => __obj.updateDynamic("Alias")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAliasOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait CreateBuildInput extends js.Object {
    var Name: js.UndefOr[NonZeroAndMaxString]
    var OperatingSystem: js.UndefOr[OperatingSystem]
    var StorageLocation: js.UndefOr[S3Location]
    var Tags: js.UndefOr[TagList]
    var Version: js.UndefOr[NonZeroAndMaxString]
  }

  object CreateBuildInput {
    @inline
    def apply(
        Name: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined,
        StorageLocation: js.UndefOr[S3Location] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        Version: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): CreateBuildInput = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OperatingSystem.foreach(__v => __obj.updateDynamic("OperatingSystem")(__v.asInstanceOf[js.Any]))
      StorageLocation.foreach(__v => __obj.updateDynamic("StorageLocation")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBuildInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait CreateBuildOutput extends js.Object {
    var Build: js.UndefOr[Build]
    var StorageLocation: js.UndefOr[S3Location]
    var UploadCredentials: js.UndefOr[AwsCredentials]
  }

  object CreateBuildOutput {
    @inline
    def apply(
        Build: js.UndefOr[Build] = js.undefined,
        StorageLocation: js.UndefOr[S3Location] = js.undefined,
        UploadCredentials: js.UndefOr[AwsCredentials] = js.undefined
    ): CreateBuildOutput = {
      val __obj = js.Dynamic.literal()
      Build.foreach(__v => __obj.updateDynamic("Build")(__v.asInstanceOf[js.Any]))
      StorageLocation.foreach(__v => __obj.updateDynamic("StorageLocation")(__v.asInstanceOf[js.Any]))
      UploadCredentials.foreach(__v => __obj.updateDynamic("UploadCredentials")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBuildOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait CreateFleetInput extends js.Object {
    var EC2InstanceType: EC2InstanceType
    var Name: NonZeroAndMaxString
    var BuildId: js.UndefOr[BuildIdOrArn]
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
    var ScriptId: js.UndefOr[ScriptIdOrArn]
    var ServerLaunchParameters: js.UndefOr[NonZeroAndMaxString]
    var ServerLaunchPath: js.UndefOr[NonZeroAndMaxString]
    var Tags: js.UndefOr[TagList]
  }

  object CreateFleetInput {
    @inline
    def apply(
        EC2InstanceType: EC2InstanceType,
        Name: NonZeroAndMaxString,
        BuildId: js.UndefOr[BuildIdOrArn] = js.undefined,
        CertificateConfiguration: js.UndefOr[CertificateConfiguration] = js.undefined,
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
        ScriptId: js.UndefOr[ScriptIdOrArn] = js.undefined,
        ServerLaunchParameters: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        ServerLaunchPath: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateFleetInput = {
      val __obj = js.Dynamic.literal(
        "EC2InstanceType" -> EC2InstanceType.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      BuildId.foreach(__v => __obj.updateDynamic("BuildId")(__v.asInstanceOf[js.Any]))
      CertificateConfiguration.foreach(__v => __obj.updateDynamic("CertificateConfiguration")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EC2InboundPermissions.foreach(__v => __obj.updateDynamic("EC2InboundPermissions")(__v.asInstanceOf[js.Any]))
      FleetType.foreach(__v => __obj.updateDynamic("FleetType")(__v.asInstanceOf[js.Any]))
      InstanceRoleArn.foreach(__v => __obj.updateDynamic("InstanceRoleArn")(__v.asInstanceOf[js.Any]))
      LogPaths.foreach(__v => __obj.updateDynamic("LogPaths")(__v.asInstanceOf[js.Any]))
      MetricGroups.foreach(__v => __obj.updateDynamic("MetricGroups")(__v.asInstanceOf[js.Any]))
      NewGameSessionProtectionPolicy.foreach(__v => __obj.updateDynamic("NewGameSessionProtectionPolicy")(__v.asInstanceOf[js.Any]))
      PeerVpcAwsAccountId.foreach(__v => __obj.updateDynamic("PeerVpcAwsAccountId")(__v.asInstanceOf[js.Any]))
      PeerVpcId.foreach(__v => __obj.updateDynamic("PeerVpcId")(__v.asInstanceOf[js.Any]))
      ResourceCreationLimitPolicy.foreach(__v => __obj.updateDynamic("ResourceCreationLimitPolicy")(__v.asInstanceOf[js.Any]))
      RuntimeConfiguration.foreach(__v => __obj.updateDynamic("RuntimeConfiguration")(__v.asInstanceOf[js.Any]))
      ScriptId.foreach(__v => __obj.updateDynamic("ScriptId")(__v.asInstanceOf[js.Any]))
      ServerLaunchParameters.foreach(__v => __obj.updateDynamic("ServerLaunchParameters")(__v.asInstanceOf[js.Any]))
      ServerLaunchPath.foreach(__v => __obj.updateDynamic("ServerLaunchPath")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFleetInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait CreateFleetOutput extends js.Object {
    var FleetAttributes: js.UndefOr[FleetAttributes]
  }

  object CreateFleetOutput {
    @inline
    def apply(
        FleetAttributes: js.UndefOr[FleetAttributes] = js.undefined
    ): CreateFleetOutput = {
      val __obj = js.Dynamic.literal()
      FleetAttributes.foreach(__v => __obj.updateDynamic("FleetAttributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFleetOutput]
    }
  }

  @js.native
  trait CreateGameServerGroupInput extends js.Object {
    var GameServerGroupName: GameServerGroupName
    var InstanceDefinitions: InstanceDefinitions
    var LaunchTemplate: LaunchTemplateSpecification
    var MaxSize: PositiveInteger
    var MinSize: WholeNumber
    var RoleArn: IamRoleArn
    var AutoScalingPolicy: js.UndefOr[GameServerGroupAutoScalingPolicy]
    var BalancingStrategy: js.UndefOr[BalancingStrategy]
    var GameServerProtectionPolicy: js.UndefOr[GameServerProtectionPolicy]
    var Tags: js.UndefOr[TagList]
    var VpcSubnets: js.UndefOr[VpcSubnets]
  }

  object CreateGameServerGroupInput {
    @inline
    def apply(
        GameServerGroupName: GameServerGroupName,
        InstanceDefinitions: InstanceDefinitions,
        LaunchTemplate: LaunchTemplateSpecification,
        MaxSize: PositiveInteger,
        MinSize: WholeNumber,
        RoleArn: IamRoleArn,
        AutoScalingPolicy: js.UndefOr[GameServerGroupAutoScalingPolicy] = js.undefined,
        BalancingStrategy: js.UndefOr[BalancingStrategy] = js.undefined,
        GameServerProtectionPolicy: js.UndefOr[GameServerProtectionPolicy] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        VpcSubnets: js.UndefOr[VpcSubnets] = js.undefined
    ): CreateGameServerGroupInput = {
      val __obj = js.Dynamic.literal(
        "GameServerGroupName" -> GameServerGroupName.asInstanceOf[js.Any],
        "InstanceDefinitions" -> InstanceDefinitions.asInstanceOf[js.Any],
        "LaunchTemplate" -> LaunchTemplate.asInstanceOf[js.Any],
        "MaxSize" -> MaxSize.asInstanceOf[js.Any],
        "MinSize" -> MinSize.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      AutoScalingPolicy.foreach(__v => __obj.updateDynamic("AutoScalingPolicy")(__v.asInstanceOf[js.Any]))
      BalancingStrategy.foreach(__v => __obj.updateDynamic("BalancingStrategy")(__v.asInstanceOf[js.Any]))
      GameServerProtectionPolicy.foreach(__v => __obj.updateDynamic("GameServerProtectionPolicy")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VpcSubnets.foreach(__v => __obj.updateDynamic("VpcSubnets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGameServerGroupInput]
    }
  }

  @js.native
  trait CreateGameServerGroupOutput extends js.Object {
    var GameServerGroup: js.UndefOr[GameServerGroup]
  }

  object CreateGameServerGroupOutput {
    @inline
    def apply(
        GameServerGroup: js.UndefOr[GameServerGroup] = js.undefined
    ): CreateGameServerGroupOutput = {
      val __obj = js.Dynamic.literal()
      GameServerGroup.foreach(__v => __obj.updateDynamic("GameServerGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGameServerGroupOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait CreateGameSessionInput extends js.Object {
    var MaximumPlayerSessionCount: WholeNumber
    var AliasId: js.UndefOr[AliasIdOrArn]
    var CreatorId: js.UndefOr[NonZeroAndMaxString]
    var FleetId: js.UndefOr[FleetIdOrArn]
    var GameProperties: js.UndefOr[GamePropertyList]
    var GameSessionData: js.UndefOr[GameSessionData]
    var GameSessionId: js.UndefOr[IdStringModel]
    var IdempotencyToken: js.UndefOr[IdStringModel]
    var Name: js.UndefOr[NonZeroAndMaxString]
  }

  object CreateGameSessionInput {
    @inline
    def apply(
        MaximumPlayerSessionCount: WholeNumber,
        AliasId: js.UndefOr[AliasIdOrArn] = js.undefined,
        CreatorId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        FleetId: js.UndefOr[FleetIdOrArn] = js.undefined,
        GameProperties: js.UndefOr[GamePropertyList] = js.undefined,
        GameSessionData: js.UndefOr[GameSessionData] = js.undefined,
        GameSessionId: js.UndefOr[IdStringModel] = js.undefined,
        IdempotencyToken: js.UndefOr[IdStringModel] = js.undefined,
        Name: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): CreateGameSessionInput = {
      val __obj = js.Dynamic.literal(
        "MaximumPlayerSessionCount" -> MaximumPlayerSessionCount.asInstanceOf[js.Any]
      )

      AliasId.foreach(__v => __obj.updateDynamic("AliasId")(__v.asInstanceOf[js.Any]))
      CreatorId.foreach(__v => __obj.updateDynamic("CreatorId")(__v.asInstanceOf[js.Any]))
      FleetId.foreach(__v => __obj.updateDynamic("FleetId")(__v.asInstanceOf[js.Any]))
      GameProperties.foreach(__v => __obj.updateDynamic("GameProperties")(__v.asInstanceOf[js.Any]))
      GameSessionData.foreach(__v => __obj.updateDynamic("GameSessionData")(__v.asInstanceOf[js.Any]))
      GameSessionId.foreach(__v => __obj.updateDynamic("GameSessionId")(__v.asInstanceOf[js.Any]))
      IdempotencyToken.foreach(__v => __obj.updateDynamic("IdempotencyToken")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGameSessionInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait CreateGameSessionOutput extends js.Object {
    var GameSession: js.UndefOr[GameSession]
  }

  object CreateGameSessionOutput {
    @inline
    def apply(
        GameSession: js.UndefOr[GameSession] = js.undefined
    ): CreateGameSessionOutput = {
      val __obj = js.Dynamic.literal()
      GameSession.foreach(__v => __obj.updateDynamic("GameSession")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGameSessionOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait CreateGameSessionQueueInput extends js.Object {
    var Name: GameSessionQueueName
    var Destinations: js.UndefOr[GameSessionQueueDestinationList]
    var PlayerLatencyPolicies: js.UndefOr[PlayerLatencyPolicyList]
    var Tags: js.UndefOr[TagList]
    var TimeoutInSeconds: js.UndefOr[WholeNumber]
  }

  object CreateGameSessionQueueInput {
    @inline
    def apply(
        Name: GameSessionQueueName,
        Destinations: js.UndefOr[GameSessionQueueDestinationList] = js.undefined,
        PlayerLatencyPolicies: js.UndefOr[PlayerLatencyPolicyList] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        TimeoutInSeconds: js.UndefOr[WholeNumber] = js.undefined
    ): CreateGameSessionQueueInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Destinations.foreach(__v => __obj.updateDynamic("Destinations")(__v.asInstanceOf[js.Any]))
      PlayerLatencyPolicies.foreach(__v => __obj.updateDynamic("PlayerLatencyPolicies")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TimeoutInSeconds.foreach(__v => __obj.updateDynamic("TimeoutInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGameSessionQueueInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait CreateGameSessionQueueOutput extends js.Object {
    var GameSessionQueue: js.UndefOr[GameSessionQueue]
  }

  object CreateGameSessionQueueOutput {
    @inline
    def apply(
        GameSessionQueue: js.UndefOr[GameSessionQueue] = js.undefined
    ): CreateGameSessionQueueOutput = {
      val __obj = js.Dynamic.literal()
      GameSessionQueue.foreach(__v => __obj.updateDynamic("GameSessionQueue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGameSessionQueueOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait CreateMatchmakingConfigurationInput extends js.Object {
    var AcceptanceRequired: BooleanModel
    var Name: MatchmakingIdStringModel
    var RequestTimeoutSeconds: MatchmakingRequestTimeoutInteger
    var RuleSetName: MatchmakingRuleSetName
    var AcceptanceTimeoutSeconds: js.UndefOr[MatchmakingAcceptanceTimeoutInteger]
    var AdditionalPlayerCount: js.UndefOr[WholeNumber]
    var BackfillMode: js.UndefOr[BackfillMode]
    var CustomEventData: js.UndefOr[CustomEventData]
    var Description: js.UndefOr[NonZeroAndMaxString]
    var FlexMatchMode: js.UndefOr[FlexMatchMode]
    var GameProperties: js.UndefOr[GamePropertyList]
    var GameSessionData: js.UndefOr[GameSessionData]
    var GameSessionQueueArns: js.UndefOr[QueueArnsList]
    var NotificationTarget: js.UndefOr[SnsArnStringModel]
    var Tags: js.UndefOr[TagList]
  }

  object CreateMatchmakingConfigurationInput {
    @inline
    def apply(
        AcceptanceRequired: BooleanModel,
        Name: MatchmakingIdStringModel,
        RequestTimeoutSeconds: MatchmakingRequestTimeoutInteger,
        RuleSetName: MatchmakingRuleSetName,
        AcceptanceTimeoutSeconds: js.UndefOr[MatchmakingAcceptanceTimeoutInteger] = js.undefined,
        AdditionalPlayerCount: js.UndefOr[WholeNumber] = js.undefined,
        BackfillMode: js.UndefOr[BackfillMode] = js.undefined,
        CustomEventData: js.UndefOr[CustomEventData] = js.undefined,
        Description: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        FlexMatchMode: js.UndefOr[FlexMatchMode] = js.undefined,
        GameProperties: js.UndefOr[GamePropertyList] = js.undefined,
        GameSessionData: js.UndefOr[GameSessionData] = js.undefined,
        GameSessionQueueArns: js.UndefOr[QueueArnsList] = js.undefined,
        NotificationTarget: js.UndefOr[SnsArnStringModel] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateMatchmakingConfigurationInput = {
      val __obj = js.Dynamic.literal(
        "AcceptanceRequired" -> AcceptanceRequired.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "RequestTimeoutSeconds" -> RequestTimeoutSeconds.asInstanceOf[js.Any],
        "RuleSetName" -> RuleSetName.asInstanceOf[js.Any]
      )

      AcceptanceTimeoutSeconds.foreach(__v => __obj.updateDynamic("AcceptanceTimeoutSeconds")(__v.asInstanceOf[js.Any]))
      AdditionalPlayerCount.foreach(__v => __obj.updateDynamic("AdditionalPlayerCount")(__v.asInstanceOf[js.Any]))
      BackfillMode.foreach(__v => __obj.updateDynamic("BackfillMode")(__v.asInstanceOf[js.Any]))
      CustomEventData.foreach(__v => __obj.updateDynamic("CustomEventData")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      FlexMatchMode.foreach(__v => __obj.updateDynamic("FlexMatchMode")(__v.asInstanceOf[js.Any]))
      GameProperties.foreach(__v => __obj.updateDynamic("GameProperties")(__v.asInstanceOf[js.Any]))
      GameSessionData.foreach(__v => __obj.updateDynamic("GameSessionData")(__v.asInstanceOf[js.Any]))
      GameSessionQueueArns.foreach(__v => __obj.updateDynamic("GameSessionQueueArns")(__v.asInstanceOf[js.Any]))
      NotificationTarget.foreach(__v => __obj.updateDynamic("NotificationTarget")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMatchmakingConfigurationInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait CreateMatchmakingConfigurationOutput extends js.Object {
    var Configuration: js.UndefOr[MatchmakingConfiguration]
  }

  object CreateMatchmakingConfigurationOutput {
    @inline
    def apply(
        Configuration: js.UndefOr[MatchmakingConfiguration] = js.undefined
    ): CreateMatchmakingConfigurationOutput = {
      val __obj = js.Dynamic.literal()
      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMatchmakingConfigurationOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait CreateMatchmakingRuleSetInput extends js.Object {
    var Name: MatchmakingIdStringModel
    var RuleSetBody: RuleSetBody
    var Tags: js.UndefOr[TagList]
  }

  object CreateMatchmakingRuleSetInput {
    @inline
    def apply(
        Name: MatchmakingIdStringModel,
        RuleSetBody: RuleSetBody,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateMatchmakingRuleSetInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "RuleSetBody" -> RuleSetBody.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMatchmakingRuleSetInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait CreateMatchmakingRuleSetOutput extends js.Object {
    var RuleSet: MatchmakingRuleSet
  }

  object CreateMatchmakingRuleSetOutput {
    @inline
    def apply(
        RuleSet: MatchmakingRuleSet
    ): CreateMatchmakingRuleSetOutput = {
      val __obj = js.Dynamic.literal(
        "RuleSet" -> RuleSet.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateMatchmakingRuleSetOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait CreatePlayerSessionInput extends js.Object {
    var GameSessionId: ArnStringModel
    var PlayerId: NonZeroAndMaxString
    var PlayerData: js.UndefOr[PlayerData]
  }

  object CreatePlayerSessionInput {
    @inline
    def apply(
        GameSessionId: ArnStringModel,
        PlayerId: NonZeroAndMaxString,
        PlayerData: js.UndefOr[PlayerData] = js.undefined
    ): CreatePlayerSessionInput = {
      val __obj = js.Dynamic.literal(
        "GameSessionId" -> GameSessionId.asInstanceOf[js.Any],
        "PlayerId" -> PlayerId.asInstanceOf[js.Any]
      )

      PlayerData.foreach(__v => __obj.updateDynamic("PlayerData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePlayerSessionInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait CreatePlayerSessionOutput extends js.Object {
    var PlayerSession: js.UndefOr[PlayerSession]
  }

  object CreatePlayerSessionOutput {
    @inline
    def apply(
        PlayerSession: js.UndefOr[PlayerSession] = js.undefined
    ): CreatePlayerSessionOutput = {
      val __obj = js.Dynamic.literal()
      PlayerSession.foreach(__v => __obj.updateDynamic("PlayerSession")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePlayerSessionOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait CreatePlayerSessionsInput extends js.Object {
    var GameSessionId: ArnStringModel
    var PlayerIds: PlayerIdList
    var PlayerDataMap: js.UndefOr[PlayerDataMap]
  }

  object CreatePlayerSessionsInput {
    @inline
    def apply(
        GameSessionId: ArnStringModel,
        PlayerIds: PlayerIdList,
        PlayerDataMap: js.UndefOr[PlayerDataMap] = js.undefined
    ): CreatePlayerSessionsInput = {
      val __obj = js.Dynamic.literal(
        "GameSessionId" -> GameSessionId.asInstanceOf[js.Any],
        "PlayerIds" -> PlayerIds.asInstanceOf[js.Any]
      )

      PlayerDataMap.foreach(__v => __obj.updateDynamic("PlayerDataMap")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePlayerSessionsInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait CreatePlayerSessionsOutput extends js.Object {
    var PlayerSessions: js.UndefOr[PlayerSessionList]
  }

  object CreatePlayerSessionsOutput {
    @inline
    def apply(
        PlayerSessions: js.UndefOr[PlayerSessionList] = js.undefined
    ): CreatePlayerSessionsOutput = {
      val __obj = js.Dynamic.literal()
      PlayerSessions.foreach(__v => __obj.updateDynamic("PlayerSessions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePlayerSessionsOutput]
    }
  }

  @js.native
  trait CreateScriptInput extends js.Object {
    var Name: js.UndefOr[NonZeroAndMaxString]
    var StorageLocation: js.UndefOr[S3Location]
    var Tags: js.UndefOr[TagList]
    var Version: js.UndefOr[NonZeroAndMaxString]
    var ZipFile: js.UndefOr[ZipBlob]
  }

  object CreateScriptInput {
    @inline
    def apply(
        Name: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        StorageLocation: js.UndefOr[S3Location] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        Version: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        ZipFile: js.UndefOr[ZipBlob] = js.undefined
    ): CreateScriptInput = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      StorageLocation.foreach(__v => __obj.updateDynamic("StorageLocation")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      ZipFile.foreach(__v => __obj.updateDynamic("ZipFile")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateScriptInput]
    }
  }

  @js.native
  trait CreateScriptOutput extends js.Object {
    var Script: js.UndefOr[Script]
  }

  object CreateScriptOutput {
    @inline
    def apply(
        Script: js.UndefOr[Script] = js.undefined
    ): CreateScriptOutput = {
      val __obj = js.Dynamic.literal()
      Script.foreach(__v => __obj.updateDynamic("Script")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateScriptOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait CreateVpcPeeringAuthorizationInput extends js.Object {
    var GameLiftAwsAccountId: NonZeroAndMaxString
    var PeerVpcId: NonZeroAndMaxString
  }

  object CreateVpcPeeringAuthorizationInput {
    @inline
    def apply(
        GameLiftAwsAccountId: NonZeroAndMaxString,
        PeerVpcId: NonZeroAndMaxString
    ): CreateVpcPeeringAuthorizationInput = {
      val __obj = js.Dynamic.literal(
        "GameLiftAwsAccountId" -> GameLiftAwsAccountId.asInstanceOf[js.Any],
        "PeerVpcId" -> PeerVpcId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateVpcPeeringAuthorizationInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait CreateVpcPeeringAuthorizationOutput extends js.Object {
    var VpcPeeringAuthorization: js.UndefOr[VpcPeeringAuthorization]
  }

  object CreateVpcPeeringAuthorizationOutput {
    @inline
    def apply(
        VpcPeeringAuthorization: js.UndefOr[VpcPeeringAuthorization] = js.undefined
    ): CreateVpcPeeringAuthorizationOutput = {
      val __obj = js.Dynamic.literal()
      VpcPeeringAuthorization.foreach(__v => __obj.updateDynamic("VpcPeeringAuthorization")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVpcPeeringAuthorizationOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait CreateVpcPeeringConnectionInput extends js.Object {
    var FleetId: FleetId
    var PeerVpcAwsAccountId: NonZeroAndMaxString
    var PeerVpcId: NonZeroAndMaxString
  }

  object CreateVpcPeeringConnectionInput {
    @inline
    def apply(
        FleetId: FleetId,
        PeerVpcAwsAccountId: NonZeroAndMaxString,
        PeerVpcId: NonZeroAndMaxString
    ): CreateVpcPeeringConnectionInput = {
      val __obj = js.Dynamic.literal(
        "FleetId" -> FleetId.asInstanceOf[js.Any],
        "PeerVpcAwsAccountId" -> PeerVpcAwsAccountId.asInstanceOf[js.Any],
        "PeerVpcId" -> PeerVpcId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateVpcPeeringConnectionInput]
    }
  }

  @js.native
  trait CreateVpcPeeringConnectionOutput extends js.Object

  object CreateVpcPeeringConnectionOutput {
    @inline
    def apply(): CreateVpcPeeringConnectionOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateVpcPeeringConnectionOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait DeleteAliasInput extends js.Object {
    var AliasId: AliasIdOrArn
  }

  object DeleteAliasInput {
    @inline
    def apply(
        AliasId: AliasIdOrArn
    ): DeleteAliasInput = {
      val __obj = js.Dynamic.literal(
        "AliasId" -> AliasId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteAliasInput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait DeleteBuildInput extends js.Object {
    var BuildId: BuildIdOrArn
  }

  object DeleteBuildInput {
    @inline
    def apply(
        BuildId: BuildIdOrArn
    ): DeleteBuildInput = {
      val __obj = js.Dynamic.literal(
        "BuildId" -> BuildId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteBuildInput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait DeleteFleetInput extends js.Object {
    var FleetId: FleetIdOrArn
  }

  object DeleteFleetInput {
    @inline
    def apply(
        FleetId: FleetIdOrArn
    ): DeleteFleetInput = {
      val __obj = js.Dynamic.literal(
        "FleetId" -> FleetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteFleetInput]
    }
  }

  @js.native
  trait DeleteGameServerGroupInput extends js.Object {
    var GameServerGroupName: GameServerGroupNameOrArn
    var DeleteOption: js.UndefOr[GameServerGroupDeleteOption]
  }

  object DeleteGameServerGroupInput {
    @inline
    def apply(
        GameServerGroupName: GameServerGroupNameOrArn,
        DeleteOption: js.UndefOr[GameServerGroupDeleteOption] = js.undefined
    ): DeleteGameServerGroupInput = {
      val __obj = js.Dynamic.literal(
        "GameServerGroupName" -> GameServerGroupName.asInstanceOf[js.Any]
      )

      DeleteOption.foreach(__v => __obj.updateDynamic("DeleteOption")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteGameServerGroupInput]
    }
  }

  @js.native
  trait DeleteGameServerGroupOutput extends js.Object {
    var GameServerGroup: js.UndefOr[GameServerGroup]
  }

  object DeleteGameServerGroupOutput {
    @inline
    def apply(
        GameServerGroup: js.UndefOr[GameServerGroup] = js.undefined
    ): DeleteGameServerGroupOutput = {
      val __obj = js.Dynamic.literal()
      GameServerGroup.foreach(__v => __obj.updateDynamic("GameServerGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteGameServerGroupOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait DeleteGameSessionQueueInput extends js.Object {
    var Name: GameSessionQueueNameOrArn
  }

  object DeleteGameSessionQueueInput {
    @inline
    def apply(
        Name: GameSessionQueueNameOrArn
    ): DeleteGameSessionQueueInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteGameSessionQueueInput]
    }
  }

  @js.native
  trait DeleteGameSessionQueueOutput extends js.Object

  object DeleteGameSessionQueueOutput {
    @inline
    def apply(): DeleteGameSessionQueueOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteGameSessionQueueOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait DeleteMatchmakingConfigurationInput extends js.Object {
    var Name: MatchmakingConfigurationName
  }

  object DeleteMatchmakingConfigurationInput {
    @inline
    def apply(
        Name: MatchmakingConfigurationName
    ): DeleteMatchmakingConfigurationInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteMatchmakingConfigurationInput]
    }
  }

  @js.native
  trait DeleteMatchmakingConfigurationOutput extends js.Object

  object DeleteMatchmakingConfigurationOutput {
    @inline
    def apply(): DeleteMatchmakingConfigurationOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteMatchmakingConfigurationOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait DeleteMatchmakingRuleSetInput extends js.Object {
    var Name: MatchmakingRuleSetName
  }

  object DeleteMatchmakingRuleSetInput {
    @inline
    def apply(
        Name: MatchmakingRuleSetName
    ): DeleteMatchmakingRuleSetInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteMatchmakingRuleSetInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait DeleteMatchmakingRuleSetOutput extends js.Object

  object DeleteMatchmakingRuleSetOutput {
    @inline
    def apply(): DeleteMatchmakingRuleSetOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteMatchmakingRuleSetOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait DeleteScalingPolicyInput extends js.Object {
    var FleetId: FleetIdOrArn
    var Name: NonZeroAndMaxString
  }

  object DeleteScalingPolicyInput {
    @inline
    def apply(
        FleetId: FleetIdOrArn,
        Name: NonZeroAndMaxString
    ): DeleteScalingPolicyInput = {
      val __obj = js.Dynamic.literal(
        "FleetId" -> FleetId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteScalingPolicyInput]
    }
  }

  @js.native
  trait DeleteScriptInput extends js.Object {
    var ScriptId: ScriptIdOrArn
  }

  object DeleteScriptInput {
    @inline
    def apply(
        ScriptId: ScriptIdOrArn
    ): DeleteScriptInput = {
      val __obj = js.Dynamic.literal(
        "ScriptId" -> ScriptId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteScriptInput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait DeleteVpcPeeringAuthorizationInput extends js.Object {
    var GameLiftAwsAccountId: NonZeroAndMaxString
    var PeerVpcId: NonZeroAndMaxString
  }

  object DeleteVpcPeeringAuthorizationInput {
    @inline
    def apply(
        GameLiftAwsAccountId: NonZeroAndMaxString,
        PeerVpcId: NonZeroAndMaxString
    ): DeleteVpcPeeringAuthorizationInput = {
      val __obj = js.Dynamic.literal(
        "GameLiftAwsAccountId" -> GameLiftAwsAccountId.asInstanceOf[js.Any],
        "PeerVpcId" -> PeerVpcId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteVpcPeeringAuthorizationInput]
    }
  }

  @js.native
  trait DeleteVpcPeeringAuthorizationOutput extends js.Object

  object DeleteVpcPeeringAuthorizationOutput {
    @inline
    def apply(): DeleteVpcPeeringAuthorizationOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteVpcPeeringAuthorizationOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait DeleteVpcPeeringConnectionInput extends js.Object {
    var FleetId: FleetId
    var VpcPeeringConnectionId: NonZeroAndMaxString
  }

  object DeleteVpcPeeringConnectionInput {
    @inline
    def apply(
        FleetId: FleetId,
        VpcPeeringConnectionId: NonZeroAndMaxString
    ): DeleteVpcPeeringConnectionInput = {
      val __obj = js.Dynamic.literal(
        "FleetId" -> FleetId.asInstanceOf[js.Any],
        "VpcPeeringConnectionId" -> VpcPeeringConnectionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteVpcPeeringConnectionInput]
    }
  }

  @js.native
  trait DeleteVpcPeeringConnectionOutput extends js.Object

  object DeleteVpcPeeringConnectionOutput {
    @inline
    def apply(): DeleteVpcPeeringConnectionOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteVpcPeeringConnectionOutput]
    }
  }

  @js.native
  trait DeregisterGameServerInput extends js.Object {
    var GameServerGroupName: GameServerGroupNameOrArn
    var GameServerId: GameServerId
  }

  object DeregisterGameServerInput {
    @inline
    def apply(
        GameServerGroupName: GameServerGroupNameOrArn,
        GameServerId: GameServerId
    ): DeregisterGameServerInput = {
      val __obj = js.Dynamic.literal(
        "GameServerGroupName" -> GameServerGroupName.asInstanceOf[js.Any],
        "GameServerId" -> GameServerId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeregisterGameServerInput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait DescribeAliasInput extends js.Object {
    var AliasId: AliasIdOrArn
  }

  object DescribeAliasInput {
    @inline
    def apply(
        AliasId: AliasIdOrArn
    ): DescribeAliasInput = {
      val __obj = js.Dynamic.literal(
        "AliasId" -> AliasId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeAliasInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait DescribeAliasOutput extends js.Object {
    var Alias: js.UndefOr[Alias]
  }

  object DescribeAliasOutput {
    @inline
    def apply(
        Alias: js.UndefOr[Alias] = js.undefined
    ): DescribeAliasOutput = {
      val __obj = js.Dynamic.literal()
      Alias.foreach(__v => __obj.updateDynamic("Alias")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeAliasOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait DescribeBuildInput extends js.Object {
    var BuildId: BuildIdOrArn
  }

  object DescribeBuildInput {
    @inline
    def apply(
        BuildId: BuildIdOrArn
    ): DescribeBuildInput = {
      val __obj = js.Dynamic.literal(
        "BuildId" -> BuildId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeBuildInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait DescribeBuildOutput extends js.Object {
    var Build: js.UndefOr[Build]
  }

  object DescribeBuildOutput {
    @inline
    def apply(
        Build: js.UndefOr[Build] = js.undefined
    ): DescribeBuildOutput = {
      val __obj = js.Dynamic.literal()
      Build.foreach(__v => __obj.updateDynamic("Build")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeBuildOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait DescribeEC2InstanceLimitsInput extends js.Object {
    var EC2InstanceType: js.UndefOr[EC2InstanceType]
  }

  object DescribeEC2InstanceLimitsInput {
    @inline
    def apply(
        EC2InstanceType: js.UndefOr[EC2InstanceType] = js.undefined
    ): DescribeEC2InstanceLimitsInput = {
      val __obj = js.Dynamic.literal()
      EC2InstanceType.foreach(__v => __obj.updateDynamic("EC2InstanceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEC2InstanceLimitsInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait DescribeEC2InstanceLimitsOutput extends js.Object {
    var EC2InstanceLimits: js.UndefOr[EC2InstanceLimitList]
  }

  object DescribeEC2InstanceLimitsOutput {
    @inline
    def apply(
        EC2InstanceLimits: js.UndefOr[EC2InstanceLimitList] = js.undefined
    ): DescribeEC2InstanceLimitsOutput = {
      val __obj = js.Dynamic.literal()
      EC2InstanceLimits.foreach(__v => __obj.updateDynamic("EC2InstanceLimits")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEC2InstanceLimitsOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait DescribeFleetAttributesInput extends js.Object {
    var FleetIds: js.UndefOr[FleetIdOrArnList]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeFleetAttributesInput {
    @inline
    def apply(
        FleetIds: js.UndefOr[FleetIdOrArnList] = js.undefined,
        Limit: js.UndefOr[PositiveInteger] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeFleetAttributesInput = {
      val __obj = js.Dynamic.literal()
      FleetIds.foreach(__v => __obj.updateDynamic("FleetIds")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFleetAttributesInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait DescribeFleetAttributesOutput extends js.Object {
    var FleetAttributes: js.UndefOr[FleetAttributesList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeFleetAttributesOutput {
    @inline
    def apply(
        FleetAttributes: js.UndefOr[FleetAttributesList] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeFleetAttributesOutput = {
      val __obj = js.Dynamic.literal()
      FleetAttributes.foreach(__v => __obj.updateDynamic("FleetAttributes")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFleetAttributesOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait DescribeFleetCapacityInput extends js.Object {
    var FleetIds: js.UndefOr[FleetIdOrArnList]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeFleetCapacityInput {
    @inline
    def apply(
        FleetIds: js.UndefOr[FleetIdOrArnList] = js.undefined,
        Limit: js.UndefOr[PositiveInteger] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeFleetCapacityInput = {
      val __obj = js.Dynamic.literal()
      FleetIds.foreach(__v => __obj.updateDynamic("FleetIds")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFleetCapacityInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait DescribeFleetCapacityOutput extends js.Object {
    var FleetCapacity: js.UndefOr[FleetCapacityList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeFleetCapacityOutput {
    @inline
    def apply(
        FleetCapacity: js.UndefOr[FleetCapacityList] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeFleetCapacityOutput = {
      val __obj = js.Dynamic.literal()
      FleetCapacity.foreach(__v => __obj.updateDynamic("FleetCapacity")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFleetCapacityOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait DescribeFleetEventsInput extends js.Object {
    var FleetId: FleetIdOrArn
    var EndTime: js.UndefOr[Timestamp]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
    var StartTime: js.UndefOr[Timestamp]
  }

  object DescribeFleetEventsInput {
    @inline
    def apply(
        FleetId: FleetIdOrArn,
        EndTime: js.UndefOr[Timestamp] = js.undefined,
        Limit: js.UndefOr[PositiveInteger] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        StartTime: js.UndefOr[Timestamp] = js.undefined
    ): DescribeFleetEventsInput = {
      val __obj = js.Dynamic.literal(
        "FleetId" -> FleetId.asInstanceOf[js.Any]
      )

      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFleetEventsInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait DescribeFleetEventsOutput extends js.Object {
    var Events: js.UndefOr[EventList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeFleetEventsOutput {
    @inline
    def apply(
        Events: js.UndefOr[EventList] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeFleetEventsOutput = {
      val __obj = js.Dynamic.literal()
      Events.foreach(__v => __obj.updateDynamic("Events")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFleetEventsOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait DescribeFleetPortSettingsInput extends js.Object {
    var FleetId: FleetIdOrArn
  }

  object DescribeFleetPortSettingsInput {
    @inline
    def apply(
        FleetId: FleetIdOrArn
    ): DescribeFleetPortSettingsInput = {
      val __obj = js.Dynamic.literal(
        "FleetId" -> FleetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeFleetPortSettingsInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait DescribeFleetPortSettingsOutput extends js.Object {
    var InboundPermissions: js.UndefOr[IpPermissionsList]
  }

  object DescribeFleetPortSettingsOutput {
    @inline
    def apply(
        InboundPermissions: js.UndefOr[IpPermissionsList] = js.undefined
    ): DescribeFleetPortSettingsOutput = {
      val __obj = js.Dynamic.literal()
      InboundPermissions.foreach(__v => __obj.updateDynamic("InboundPermissions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFleetPortSettingsOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait DescribeFleetUtilizationInput extends js.Object {
    var FleetIds: js.UndefOr[FleetIdOrArnList]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeFleetUtilizationInput {
    @inline
    def apply(
        FleetIds: js.UndefOr[FleetIdOrArnList] = js.undefined,
        Limit: js.UndefOr[PositiveInteger] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeFleetUtilizationInput = {
      val __obj = js.Dynamic.literal()
      FleetIds.foreach(__v => __obj.updateDynamic("FleetIds")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFleetUtilizationInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait DescribeFleetUtilizationOutput extends js.Object {
    var FleetUtilization: js.UndefOr[FleetUtilizationList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeFleetUtilizationOutput {
    @inline
    def apply(
        FleetUtilization: js.UndefOr[FleetUtilizationList] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeFleetUtilizationOutput = {
      val __obj = js.Dynamic.literal()
      FleetUtilization.foreach(__v => __obj.updateDynamic("FleetUtilization")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeFleetUtilizationOutput]
    }
  }

  @js.native
  trait DescribeGameServerGroupInput extends js.Object {
    var GameServerGroupName: GameServerGroupNameOrArn
  }

  object DescribeGameServerGroupInput {
    @inline
    def apply(
        GameServerGroupName: GameServerGroupNameOrArn
    ): DescribeGameServerGroupInput = {
      val __obj = js.Dynamic.literal(
        "GameServerGroupName" -> GameServerGroupName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeGameServerGroupInput]
    }
  }

  @js.native
  trait DescribeGameServerGroupOutput extends js.Object {
    var GameServerGroup: js.UndefOr[GameServerGroup]
  }

  object DescribeGameServerGroupOutput {
    @inline
    def apply(
        GameServerGroup: js.UndefOr[GameServerGroup] = js.undefined
    ): DescribeGameServerGroupOutput = {
      val __obj = js.Dynamic.literal()
      GameServerGroup.foreach(__v => __obj.updateDynamic("GameServerGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeGameServerGroupOutput]
    }
  }

  @js.native
  trait DescribeGameServerInput extends js.Object {
    var GameServerGroupName: GameServerGroupNameOrArn
    var GameServerId: GameServerId
  }

  object DescribeGameServerInput {
    @inline
    def apply(
        GameServerGroupName: GameServerGroupNameOrArn,
        GameServerId: GameServerId
    ): DescribeGameServerInput = {
      val __obj = js.Dynamic.literal(
        "GameServerGroupName" -> GameServerGroupName.asInstanceOf[js.Any],
        "GameServerId" -> GameServerId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeGameServerInput]
    }
  }

  @js.native
  trait DescribeGameServerInstancesInput extends js.Object {
    var GameServerGroupName: GameServerGroupNameOrArn
    var InstanceIds: js.UndefOr[GameServerInstanceIds]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeGameServerInstancesInput {
    @inline
    def apply(
        GameServerGroupName: GameServerGroupNameOrArn,
        InstanceIds: js.UndefOr[GameServerInstanceIds] = js.undefined,
        Limit: js.UndefOr[PositiveInteger] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeGameServerInstancesInput = {
      val __obj = js.Dynamic.literal(
        "GameServerGroupName" -> GameServerGroupName.asInstanceOf[js.Any]
      )

      InstanceIds.foreach(__v => __obj.updateDynamic("InstanceIds")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeGameServerInstancesInput]
    }
  }

  @js.native
  trait DescribeGameServerInstancesOutput extends js.Object {
    var GameServerInstances: js.UndefOr[GameServerInstances]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeGameServerInstancesOutput {
    @inline
    def apply(
        GameServerInstances: js.UndefOr[GameServerInstances] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeGameServerInstancesOutput = {
      val __obj = js.Dynamic.literal()
      GameServerInstances.foreach(__v => __obj.updateDynamic("GameServerInstances")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeGameServerInstancesOutput]
    }
  }

  @js.native
  trait DescribeGameServerOutput extends js.Object {
    var GameServer: js.UndefOr[GameServer]
  }

  object DescribeGameServerOutput {
    @inline
    def apply(
        GameServer: js.UndefOr[GameServer] = js.undefined
    ): DescribeGameServerOutput = {
      val __obj = js.Dynamic.literal()
      GameServer.foreach(__v => __obj.updateDynamic("GameServer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeGameServerOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait DescribeGameSessionDetailsInput extends js.Object {
    var AliasId: js.UndefOr[AliasIdOrArn]
    var FleetId: js.UndefOr[FleetIdOrArn]
    var GameSessionId: js.UndefOr[ArnStringModel]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
    var StatusFilter: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeGameSessionDetailsInput {
    @inline
    def apply(
        AliasId: js.UndefOr[AliasIdOrArn] = js.undefined,
        FleetId: js.UndefOr[FleetIdOrArn] = js.undefined,
        GameSessionId: js.UndefOr[ArnStringModel] = js.undefined,
        Limit: js.UndefOr[PositiveInteger] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        StatusFilter: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeGameSessionDetailsInput = {
      val __obj = js.Dynamic.literal()
      AliasId.foreach(__v => __obj.updateDynamic("AliasId")(__v.asInstanceOf[js.Any]))
      FleetId.foreach(__v => __obj.updateDynamic("FleetId")(__v.asInstanceOf[js.Any]))
      GameSessionId.foreach(__v => __obj.updateDynamic("GameSessionId")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StatusFilter.foreach(__v => __obj.updateDynamic("StatusFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeGameSessionDetailsInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait DescribeGameSessionDetailsOutput extends js.Object {
    var GameSessionDetails: js.UndefOr[GameSessionDetailList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeGameSessionDetailsOutput {
    @inline
    def apply(
        GameSessionDetails: js.UndefOr[GameSessionDetailList] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeGameSessionDetailsOutput = {
      val __obj = js.Dynamic.literal()
      GameSessionDetails.foreach(__v => __obj.updateDynamic("GameSessionDetails")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeGameSessionDetailsOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait DescribeGameSessionPlacementInput extends js.Object {
    var PlacementId: IdStringModel
  }

  object DescribeGameSessionPlacementInput {
    @inline
    def apply(
        PlacementId: IdStringModel
    ): DescribeGameSessionPlacementInput = {
      val __obj = js.Dynamic.literal(
        "PlacementId" -> PlacementId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeGameSessionPlacementInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait DescribeGameSessionPlacementOutput extends js.Object {
    var GameSessionPlacement: js.UndefOr[GameSessionPlacement]
  }

  object DescribeGameSessionPlacementOutput {
    @inline
    def apply(
        GameSessionPlacement: js.UndefOr[GameSessionPlacement] = js.undefined
    ): DescribeGameSessionPlacementOutput = {
      val __obj = js.Dynamic.literal()
      GameSessionPlacement.foreach(__v => __obj.updateDynamic("GameSessionPlacement")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeGameSessionPlacementOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait DescribeGameSessionQueuesInput extends js.Object {
    var Limit: js.UndefOr[PositiveInteger]
    var Names: js.UndefOr[GameSessionQueueNameOrArnList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeGameSessionQueuesInput {
    @inline
    def apply(
        Limit: js.UndefOr[PositiveInteger] = js.undefined,
        Names: js.UndefOr[GameSessionQueueNameOrArnList] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeGameSessionQueuesInput = {
      val __obj = js.Dynamic.literal()
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      Names.foreach(__v => __obj.updateDynamic("Names")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeGameSessionQueuesInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait DescribeGameSessionQueuesOutput extends js.Object {
    var GameSessionQueues: js.UndefOr[GameSessionQueueList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeGameSessionQueuesOutput {
    @inline
    def apply(
        GameSessionQueues: js.UndefOr[GameSessionQueueList] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeGameSessionQueuesOutput = {
      val __obj = js.Dynamic.literal()
      GameSessionQueues.foreach(__v => __obj.updateDynamic("GameSessionQueues")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeGameSessionQueuesOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait DescribeGameSessionsInput extends js.Object {
    var AliasId: js.UndefOr[AliasIdOrArn]
    var FleetId: js.UndefOr[FleetIdOrArn]
    var GameSessionId: js.UndefOr[ArnStringModel]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
    var StatusFilter: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeGameSessionsInput {
    @inline
    def apply(
        AliasId: js.UndefOr[AliasIdOrArn] = js.undefined,
        FleetId: js.UndefOr[FleetIdOrArn] = js.undefined,
        GameSessionId: js.UndefOr[ArnStringModel] = js.undefined,
        Limit: js.UndefOr[PositiveInteger] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        StatusFilter: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeGameSessionsInput = {
      val __obj = js.Dynamic.literal()
      AliasId.foreach(__v => __obj.updateDynamic("AliasId")(__v.asInstanceOf[js.Any]))
      FleetId.foreach(__v => __obj.updateDynamic("FleetId")(__v.asInstanceOf[js.Any]))
      GameSessionId.foreach(__v => __obj.updateDynamic("GameSessionId")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StatusFilter.foreach(__v => __obj.updateDynamic("StatusFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeGameSessionsInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait DescribeGameSessionsOutput extends js.Object {
    var GameSessions: js.UndefOr[GameSessionList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeGameSessionsOutput {
    @inline
    def apply(
        GameSessions: js.UndefOr[GameSessionList] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeGameSessionsOutput = {
      val __obj = js.Dynamic.literal()
      GameSessions.foreach(__v => __obj.updateDynamic("GameSessions")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeGameSessionsOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait DescribeInstancesInput extends js.Object {
    var FleetId: FleetIdOrArn
    var InstanceId: js.UndefOr[InstanceId]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeInstancesInput {
    @inline
    def apply(
        FleetId: FleetIdOrArn,
        InstanceId: js.UndefOr[InstanceId] = js.undefined,
        Limit: js.UndefOr[PositiveInteger] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeInstancesInput = {
      val __obj = js.Dynamic.literal(
        "FleetId" -> FleetId.asInstanceOf[js.Any]
      )

      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInstancesInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait DescribeInstancesOutput extends js.Object {
    var Instances: js.UndefOr[InstanceList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeInstancesOutput {
    @inline
    def apply(
        Instances: js.UndefOr[InstanceList] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeInstancesOutput = {
      val __obj = js.Dynamic.literal()
      Instances.foreach(__v => __obj.updateDynamic("Instances")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeInstancesOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait DescribeMatchmakingConfigurationsInput extends js.Object {
    var Limit: js.UndefOr[PositiveInteger]
    var Names: js.UndefOr[MatchmakingConfigurationNameList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
    var RuleSetName: js.UndefOr[MatchmakingRuleSetName]
  }

  object DescribeMatchmakingConfigurationsInput {
    @inline
    def apply(
        Limit: js.UndefOr[PositiveInteger] = js.undefined,
        Names: js.UndefOr[MatchmakingConfigurationNameList] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        RuleSetName: js.UndefOr[MatchmakingRuleSetName] = js.undefined
    ): DescribeMatchmakingConfigurationsInput = {
      val __obj = js.Dynamic.literal()
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      Names.foreach(__v => __obj.updateDynamic("Names")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RuleSetName.foreach(__v => __obj.updateDynamic("RuleSetName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMatchmakingConfigurationsInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait DescribeMatchmakingConfigurationsOutput extends js.Object {
    var Configurations: js.UndefOr[MatchmakingConfigurationList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeMatchmakingConfigurationsOutput {
    @inline
    def apply(
        Configurations: js.UndefOr[MatchmakingConfigurationList] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeMatchmakingConfigurationsOutput = {
      val __obj = js.Dynamic.literal()
      Configurations.foreach(__v => __obj.updateDynamic("Configurations")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMatchmakingConfigurationsOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait DescribeMatchmakingInput extends js.Object {
    var TicketIds: MatchmakingIdList
  }

  object DescribeMatchmakingInput {
    @inline
    def apply(
        TicketIds: MatchmakingIdList
    ): DescribeMatchmakingInput = {
      val __obj = js.Dynamic.literal(
        "TicketIds" -> TicketIds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeMatchmakingInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait DescribeMatchmakingOutput extends js.Object {
    var TicketList: js.UndefOr[MatchmakingTicketList]
  }

  object DescribeMatchmakingOutput {
    @inline
    def apply(
        TicketList: js.UndefOr[MatchmakingTicketList] = js.undefined
    ): DescribeMatchmakingOutput = {
      val __obj = js.Dynamic.literal()
      TicketList.foreach(__v => __obj.updateDynamic("TicketList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMatchmakingOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait DescribeMatchmakingRuleSetsInput extends js.Object {
    var Limit: js.UndefOr[RuleSetLimit]
    var Names: js.UndefOr[MatchmakingRuleSetNameList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeMatchmakingRuleSetsInput {
    @inline
    def apply(
        Limit: js.UndefOr[RuleSetLimit] = js.undefined,
        Names: js.UndefOr[MatchmakingRuleSetNameList] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeMatchmakingRuleSetsInput = {
      val __obj = js.Dynamic.literal()
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      Names.foreach(__v => __obj.updateDynamic("Names")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMatchmakingRuleSetsInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait DescribeMatchmakingRuleSetsOutput extends js.Object {
    var RuleSets: MatchmakingRuleSetList
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object DescribeMatchmakingRuleSetsOutput {
    @inline
    def apply(
        RuleSets: MatchmakingRuleSetList,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribeMatchmakingRuleSetsOutput = {
      val __obj = js.Dynamic.literal(
        "RuleSets" -> RuleSets.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMatchmakingRuleSetsOutput]
    }
  }

  /** Represents the input for a request operation.
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
    @inline
    def apply(
        GameSessionId: js.UndefOr[ArnStringModel] = js.undefined,
        Limit: js.UndefOr[PositiveInteger] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        PlayerSessionId: js.UndefOr[PlayerSessionId] = js.undefined,
        PlayerSessionStatusFilter: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DescribePlayerSessionsInput = {
      val __obj = js.Dynamic.literal()
      GameSessionId.foreach(__v => __obj.updateDynamic("GameSessionId")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PlayerId.foreach(__v => __obj.updateDynamic("PlayerId")(__v.asInstanceOf[js.Any]))
      PlayerSessionId.foreach(__v => __obj.updateDynamic("PlayerSessionId")(__v.asInstanceOf[js.Any]))
      PlayerSessionStatusFilter.foreach(__v => __obj.updateDynamic("PlayerSessionStatusFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePlayerSessionsInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait DescribePlayerSessionsOutput extends js.Object {
    var NextToken: js.UndefOr[NonZeroAndMaxString]
    var PlayerSessions: js.UndefOr[PlayerSessionList]
  }

  object DescribePlayerSessionsOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        PlayerSessions: js.UndefOr[PlayerSessionList] = js.undefined
    ): DescribePlayerSessionsOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PlayerSessions.foreach(__v => __obj.updateDynamic("PlayerSessions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribePlayerSessionsOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait DescribeRuntimeConfigurationInput extends js.Object {
    var FleetId: FleetIdOrArn
  }

  object DescribeRuntimeConfigurationInput {
    @inline
    def apply(
        FleetId: FleetIdOrArn
    ): DescribeRuntimeConfigurationInput = {
      val __obj = js.Dynamic.literal(
        "FleetId" -> FleetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeRuntimeConfigurationInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait DescribeRuntimeConfigurationOutput extends js.Object {
    var RuntimeConfiguration: js.UndefOr[RuntimeConfiguration]
  }

  object DescribeRuntimeConfigurationOutput {
    @inline
    def apply(
        RuntimeConfiguration: js.UndefOr[RuntimeConfiguration] = js.undefined
    ): DescribeRuntimeConfigurationOutput = {
      val __obj = js.Dynamic.literal()
      RuntimeConfiguration.foreach(__v => __obj.updateDynamic("RuntimeConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRuntimeConfigurationOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait DescribeScalingPoliciesInput extends js.Object {
    var FleetId: FleetIdOrArn
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
    var StatusFilter: js.UndefOr[ScalingStatusType]
  }

  object DescribeScalingPoliciesInput {
    @inline
    def apply(
        FleetId: FleetIdOrArn,
        Limit: js.UndefOr[PositiveInteger] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        StatusFilter: js.UndefOr[ScalingStatusType] = js.undefined
    ): DescribeScalingPoliciesInput = {
      val __obj = js.Dynamic.literal(
        "FleetId" -> FleetId.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StatusFilter.foreach(__v => __obj.updateDynamic("StatusFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeScalingPoliciesInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait DescribeScalingPoliciesOutput extends js.Object {
    var NextToken: js.UndefOr[NonZeroAndMaxString]
    var ScalingPolicies: js.UndefOr[ScalingPolicyList]
  }

  object DescribeScalingPoliciesOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        ScalingPolicies: js.UndefOr[ScalingPolicyList] = js.undefined
    ): DescribeScalingPoliciesOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ScalingPolicies.foreach(__v => __obj.updateDynamic("ScalingPolicies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeScalingPoliciesOutput]
    }
  }

  @js.native
  trait DescribeScriptInput extends js.Object {
    var ScriptId: ScriptIdOrArn
  }

  object DescribeScriptInput {
    @inline
    def apply(
        ScriptId: ScriptIdOrArn
    ): DescribeScriptInput = {
      val __obj = js.Dynamic.literal(
        "ScriptId" -> ScriptId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeScriptInput]
    }
  }

  @js.native
  trait DescribeScriptOutput extends js.Object {
    var Script: js.UndefOr[Script]
  }

  object DescribeScriptOutput {
    @inline
    def apply(
        Script: js.UndefOr[Script] = js.undefined
    ): DescribeScriptOutput = {
      val __obj = js.Dynamic.literal()
      Script.foreach(__v => __obj.updateDynamic("Script")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeScriptOutput]
    }
  }

  @js.native
  trait DescribeVpcPeeringAuthorizationsInput extends js.Object

  object DescribeVpcPeeringAuthorizationsInput {
    @inline
    def apply(): DescribeVpcPeeringAuthorizationsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DescribeVpcPeeringAuthorizationsInput]
    }
  }

  @js.native
  trait DescribeVpcPeeringAuthorizationsOutput extends js.Object {
    var VpcPeeringAuthorizations: js.UndefOr[VpcPeeringAuthorizationList]
  }

  object DescribeVpcPeeringAuthorizationsOutput {
    @inline
    def apply(
        VpcPeeringAuthorizations: js.UndefOr[VpcPeeringAuthorizationList] = js.undefined
    ): DescribeVpcPeeringAuthorizationsOutput = {
      val __obj = js.Dynamic.literal()
      VpcPeeringAuthorizations.foreach(__v => __obj.updateDynamic("VpcPeeringAuthorizations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeVpcPeeringAuthorizationsOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait DescribeVpcPeeringConnectionsInput extends js.Object {
    var FleetId: js.UndefOr[FleetId]
  }

  object DescribeVpcPeeringConnectionsInput {
    @inline
    def apply(
        FleetId: js.UndefOr[FleetId] = js.undefined
    ): DescribeVpcPeeringConnectionsInput = {
      val __obj = js.Dynamic.literal()
      FleetId.foreach(__v => __obj.updateDynamic("FleetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeVpcPeeringConnectionsInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait DescribeVpcPeeringConnectionsOutput extends js.Object {
    var VpcPeeringConnections: js.UndefOr[VpcPeeringConnectionList]
  }

  object DescribeVpcPeeringConnectionsOutput {
    @inline
    def apply(
        VpcPeeringConnections: js.UndefOr[VpcPeeringConnectionList] = js.undefined
    ): DescribeVpcPeeringConnectionsOutput = {
      val __obj = js.Dynamic.literal()
      VpcPeeringConnections.foreach(__v => __obj.updateDynamic("VpcPeeringConnections")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeVpcPeeringConnectionsOutput]
    }
  }

  /** Player information for use when creating player sessions using a game session placement request with <a>StartGameSessionPlacement</a>.
    */
  @js.native
  trait DesiredPlayerSession extends js.Object {
    var PlayerData: js.UndefOr[PlayerData]
    var PlayerId: js.UndefOr[NonZeroAndMaxString]
  }

  object DesiredPlayerSession {
    @inline
    def apply(
        PlayerData: js.UndefOr[PlayerData] = js.undefined,
        PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): DesiredPlayerSession = {
      val __obj = js.Dynamic.literal()
      PlayerData.foreach(__v => __obj.updateDynamic("PlayerData")(__v.asInstanceOf[js.Any]))
      PlayerId.foreach(__v => __obj.updateDynamic("PlayerId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DesiredPlayerSession]
    }
  }

  /** Current status of fleet capacity. The number of active instances should match or be in the process of matching the number of desired instances. Pending and terminating counts are non-zero only if fleet capacity is adjusting to an <a>UpdateFleetCapacity</a> request, or if access to resources is temporarily affected.
    * * <a>CreateFleet</a>
    * * <a>ListFleets</a>
    * * <a>DeleteFleet</a>
    * * <a>DescribeFleetAttributes</a>
    * * <a>UpdateFleetAttributes</a>
    * * <a>StartFleetActions</a> or <a>StopFleetActions</a>
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
    @inline
    def apply(
        ACTIVE: js.UndefOr[WholeNumber] = js.undefined,
        DESIRED: js.UndefOr[WholeNumber] = js.undefined,
        IDLE: js.UndefOr[WholeNumber] = js.undefined,
        MAXIMUM: js.UndefOr[WholeNumber] = js.undefined,
        MINIMUM: js.UndefOr[WholeNumber] = js.undefined,
        PENDING: js.UndefOr[WholeNumber] = js.undefined,
        TERMINATING: js.UndefOr[WholeNumber] = js.undefined
    ): EC2InstanceCounts = {
      val __obj = js.Dynamic.literal()
      ACTIVE.foreach(__v => __obj.updateDynamic("ACTIVE")(__v.asInstanceOf[js.Any]))
      DESIRED.foreach(__v => __obj.updateDynamic("DESIRED")(__v.asInstanceOf[js.Any]))
      IDLE.foreach(__v => __obj.updateDynamic("IDLE")(__v.asInstanceOf[js.Any]))
      MAXIMUM.foreach(__v => __obj.updateDynamic("MAXIMUM")(__v.asInstanceOf[js.Any]))
      MINIMUM.foreach(__v => __obj.updateDynamic("MINIMUM")(__v.asInstanceOf[js.Any]))
      PENDING.foreach(__v => __obj.updateDynamic("PENDING")(__v.asInstanceOf[js.Any]))
      TERMINATING.foreach(__v => __obj.updateDynamic("TERMINATING")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EC2InstanceCounts]
    }
  }

  /** The maximum number of instances allowed based on the Amazon Elastic Compute Cloud (Amazon EC2) instance type. Instance limits can be retrieved by calling <a>DescribeEC2InstanceLimits</a>.
    */
  @js.native
  trait EC2InstanceLimit extends js.Object {
    var CurrentInstances: js.UndefOr[WholeNumber]
    var EC2InstanceType: js.UndefOr[EC2InstanceType]
    var InstanceLimit: js.UndefOr[WholeNumber]
  }

  object EC2InstanceLimit {
    @inline
    def apply(
        CurrentInstances: js.UndefOr[WholeNumber] = js.undefined,
        EC2InstanceType: js.UndefOr[EC2InstanceType] = js.undefined,
        InstanceLimit: js.UndefOr[WholeNumber] = js.undefined
    ): EC2InstanceLimit = {
      val __obj = js.Dynamic.literal()
      CurrentInstances.foreach(__v => __obj.updateDynamic("CurrentInstances")(__v.asInstanceOf[js.Any]))
      EC2InstanceType.foreach(__v => __obj.updateDynamic("EC2InstanceType")(__v.asInstanceOf[js.Any]))
      InstanceLimit.foreach(__v => __obj.updateDynamic("InstanceLimit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EC2InstanceLimit]
    }
  }

  @js.native
  sealed trait EC2InstanceType extends js.Any
  object EC2InstanceType {
    val `t2.micro` = "t2.micro".asInstanceOf[EC2InstanceType]
    val `t2.small` = "t2.small".asInstanceOf[EC2InstanceType]
    val `t2.medium` = "t2.medium".asInstanceOf[EC2InstanceType]
    val `t2.large` = "t2.large".asInstanceOf[EC2InstanceType]
    val `c3.large` = "c3.large".asInstanceOf[EC2InstanceType]
    val `c3.xlarge` = "c3.xlarge".asInstanceOf[EC2InstanceType]
    val `c3.2xlarge` = "c3.2xlarge".asInstanceOf[EC2InstanceType]
    val `c3.4xlarge` = "c3.4xlarge".asInstanceOf[EC2InstanceType]
    val `c3.8xlarge` = "c3.8xlarge".asInstanceOf[EC2InstanceType]
    val `c4.large` = "c4.large".asInstanceOf[EC2InstanceType]
    val `c4.xlarge` = "c4.xlarge".asInstanceOf[EC2InstanceType]
    val `c4.2xlarge` = "c4.2xlarge".asInstanceOf[EC2InstanceType]
    val `c4.4xlarge` = "c4.4xlarge".asInstanceOf[EC2InstanceType]
    val `c4.8xlarge` = "c4.8xlarge".asInstanceOf[EC2InstanceType]
    val `c5.large` = "c5.large".asInstanceOf[EC2InstanceType]
    val `c5.xlarge` = "c5.xlarge".asInstanceOf[EC2InstanceType]
    val `c5.2xlarge` = "c5.2xlarge".asInstanceOf[EC2InstanceType]
    val `c5.4xlarge` = "c5.4xlarge".asInstanceOf[EC2InstanceType]
    val `c5.9xlarge` = "c5.9xlarge".asInstanceOf[EC2InstanceType]
    val `c5.12xlarge` = "c5.12xlarge".asInstanceOf[EC2InstanceType]
    val `c5.18xlarge` = "c5.18xlarge".asInstanceOf[EC2InstanceType]
    val `c5.24xlarge` = "c5.24xlarge".asInstanceOf[EC2InstanceType]
    val `c5a.large` = "c5a.large".asInstanceOf[EC2InstanceType]
    val `c5a.xlarge` = "c5a.xlarge".asInstanceOf[EC2InstanceType]
    val `c5a.2xlarge` = "c5a.2xlarge".asInstanceOf[EC2InstanceType]
    val `c5a.4xlarge` = "c5a.4xlarge".asInstanceOf[EC2InstanceType]
    val `c5a.8xlarge` = "c5a.8xlarge".asInstanceOf[EC2InstanceType]
    val `c5a.12xlarge` = "c5a.12xlarge".asInstanceOf[EC2InstanceType]
    val `c5a.16xlarge` = "c5a.16xlarge".asInstanceOf[EC2InstanceType]
    val `c5a.24xlarge` = "c5a.24xlarge".asInstanceOf[EC2InstanceType]
    val `r3.large` = "r3.large".asInstanceOf[EC2InstanceType]
    val `r3.xlarge` = "r3.xlarge".asInstanceOf[EC2InstanceType]
    val `r3.2xlarge` = "r3.2xlarge".asInstanceOf[EC2InstanceType]
    val `r3.4xlarge` = "r3.4xlarge".asInstanceOf[EC2InstanceType]
    val `r3.8xlarge` = "r3.8xlarge".asInstanceOf[EC2InstanceType]
    val `r4.large` = "r4.large".asInstanceOf[EC2InstanceType]
    val `r4.xlarge` = "r4.xlarge".asInstanceOf[EC2InstanceType]
    val `r4.2xlarge` = "r4.2xlarge".asInstanceOf[EC2InstanceType]
    val `r4.4xlarge` = "r4.4xlarge".asInstanceOf[EC2InstanceType]
    val `r4.8xlarge` = "r4.8xlarge".asInstanceOf[EC2InstanceType]
    val `r4.16xlarge` = "r4.16xlarge".asInstanceOf[EC2InstanceType]
    val `r5.large` = "r5.large".asInstanceOf[EC2InstanceType]
    val `r5.xlarge` = "r5.xlarge".asInstanceOf[EC2InstanceType]
    val `r5.2xlarge` = "r5.2xlarge".asInstanceOf[EC2InstanceType]
    val `r5.4xlarge` = "r5.4xlarge".asInstanceOf[EC2InstanceType]
    val `r5.8xlarge` = "r5.8xlarge".asInstanceOf[EC2InstanceType]
    val `r5.12xlarge` = "r5.12xlarge".asInstanceOf[EC2InstanceType]
    val `r5.16xlarge` = "r5.16xlarge".asInstanceOf[EC2InstanceType]
    val `r5.24xlarge` = "r5.24xlarge".asInstanceOf[EC2InstanceType]
    val `r5a.large` = "r5a.large".asInstanceOf[EC2InstanceType]
    val `r5a.xlarge` = "r5a.xlarge".asInstanceOf[EC2InstanceType]
    val `r5a.2xlarge` = "r5a.2xlarge".asInstanceOf[EC2InstanceType]
    val `r5a.4xlarge` = "r5a.4xlarge".asInstanceOf[EC2InstanceType]
    val `r5a.8xlarge` = "r5a.8xlarge".asInstanceOf[EC2InstanceType]
    val `r5a.12xlarge` = "r5a.12xlarge".asInstanceOf[EC2InstanceType]
    val `r5a.16xlarge` = "r5a.16xlarge".asInstanceOf[EC2InstanceType]
    val `r5a.24xlarge` = "r5a.24xlarge".asInstanceOf[EC2InstanceType]
    val `m3.medium` = "m3.medium".asInstanceOf[EC2InstanceType]
    val `m3.large` = "m3.large".asInstanceOf[EC2InstanceType]
    val `m3.xlarge` = "m3.xlarge".asInstanceOf[EC2InstanceType]
    val `m3.2xlarge` = "m3.2xlarge".asInstanceOf[EC2InstanceType]
    val `m4.large` = "m4.large".asInstanceOf[EC2InstanceType]
    val `m4.xlarge` = "m4.xlarge".asInstanceOf[EC2InstanceType]
    val `m4.2xlarge` = "m4.2xlarge".asInstanceOf[EC2InstanceType]
    val `m4.4xlarge` = "m4.4xlarge".asInstanceOf[EC2InstanceType]
    val `m4.10xlarge` = "m4.10xlarge".asInstanceOf[EC2InstanceType]
    val `m5.large` = "m5.large".asInstanceOf[EC2InstanceType]
    val `m5.xlarge` = "m5.xlarge".asInstanceOf[EC2InstanceType]
    val `m5.2xlarge` = "m5.2xlarge".asInstanceOf[EC2InstanceType]
    val `m5.4xlarge` = "m5.4xlarge".asInstanceOf[EC2InstanceType]
    val `m5.8xlarge` = "m5.8xlarge".asInstanceOf[EC2InstanceType]
    val `m5.12xlarge` = "m5.12xlarge".asInstanceOf[EC2InstanceType]
    val `m5.16xlarge` = "m5.16xlarge".asInstanceOf[EC2InstanceType]
    val `m5.24xlarge` = "m5.24xlarge".asInstanceOf[EC2InstanceType]
    val `m5a.large` = "m5a.large".asInstanceOf[EC2InstanceType]
    val `m5a.xlarge` = "m5a.xlarge".asInstanceOf[EC2InstanceType]
    val `m5a.2xlarge` = "m5a.2xlarge".asInstanceOf[EC2InstanceType]
    val `m5a.4xlarge` = "m5a.4xlarge".asInstanceOf[EC2InstanceType]
    val `m5a.8xlarge` = "m5a.8xlarge".asInstanceOf[EC2InstanceType]
    val `m5a.12xlarge` = "m5a.12xlarge".asInstanceOf[EC2InstanceType]
    val `m5a.16xlarge` = "m5a.16xlarge".asInstanceOf[EC2InstanceType]
    val `m5a.24xlarge` = "m5a.24xlarge".asInstanceOf[EC2InstanceType]

    @inline def values = js.Array(
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
      `c5a.large`,
      `c5a.xlarge`,
      `c5a.2xlarge`,
      `c5a.4xlarge`,
      `c5a.8xlarge`,
      `c5a.12xlarge`,
      `c5a.16xlarge`,
      `c5a.24xlarge`,
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
      `r5a.large`,
      `r5a.xlarge`,
      `r5a.2xlarge`,
      `r5a.4xlarge`,
      `r5a.8xlarge`,
      `r5a.12xlarge`,
      `r5a.16xlarge`,
      `r5a.24xlarge`,
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
      `m5.24xlarge`,
      `m5a.large`,
      `m5a.xlarge`,
      `m5a.2xlarge`,
      `m5a.4xlarge`,
      `m5a.8xlarge`,
      `m5a.12xlarge`,
      `m5a.16xlarge`,
      `m5a.24xlarge`
    )
  }

  /** Log entry describing an event that involves Amazon GameLift resources (such as a fleet). In addition to tracking activity, event codes and messages can provide additional information for troubleshooting and debugging problems.
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
    @inline
    def apply(
        EventCode: js.UndefOr[EventCode] = js.undefined,
        EventId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        EventTime: js.UndefOr[Timestamp] = js.undefined,
        Message: js.UndefOr[NonEmptyString] = js.undefined,
        PreSignedLogUrl: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        ResourceId: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): Event = {
      val __obj = js.Dynamic.literal()
      EventCode.foreach(__v => __obj.updateDynamic("EventCode")(__v.asInstanceOf[js.Any]))
      EventId.foreach(__v => __obj.updateDynamic("EventId")(__v.asInstanceOf[js.Any]))
      EventTime.foreach(__v => __obj.updateDynamic("EventTime")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      PreSignedLogUrl.foreach(__v => __obj.updateDynamic("PreSignedLogUrl")(__v.asInstanceOf[js.Any]))
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Event]
    }
  }

  @js.native
  sealed trait EventCode extends js.Any
  object EventCode {
    val GENERIC_EVENT = "GENERIC_EVENT".asInstanceOf[EventCode]
    val FLEET_CREATED = "FLEET_CREATED".asInstanceOf[EventCode]
    val FLEET_DELETED = "FLEET_DELETED".asInstanceOf[EventCode]
    val FLEET_SCALING_EVENT = "FLEET_SCALING_EVENT".asInstanceOf[EventCode]
    val FLEET_STATE_DOWNLOADING = "FLEET_STATE_DOWNLOADING".asInstanceOf[EventCode]
    val FLEET_STATE_VALIDATING = "FLEET_STATE_VALIDATING".asInstanceOf[EventCode]
    val FLEET_STATE_BUILDING = "FLEET_STATE_BUILDING".asInstanceOf[EventCode]
    val FLEET_STATE_ACTIVATING = "FLEET_STATE_ACTIVATING".asInstanceOf[EventCode]
    val FLEET_STATE_ACTIVE = "FLEET_STATE_ACTIVE".asInstanceOf[EventCode]
    val FLEET_STATE_ERROR = "FLEET_STATE_ERROR".asInstanceOf[EventCode]
    val FLEET_INITIALIZATION_FAILED = "FLEET_INITIALIZATION_FAILED".asInstanceOf[EventCode]
    val FLEET_BINARY_DOWNLOAD_FAILED = "FLEET_BINARY_DOWNLOAD_FAILED".asInstanceOf[EventCode]
    val FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND = "FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND".asInstanceOf[EventCode]
    val FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE = "FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE".asInstanceOf[EventCode]
    val FLEET_VALIDATION_TIMED_OUT = "FLEET_VALIDATION_TIMED_OUT".asInstanceOf[EventCode]
    val FLEET_ACTIVATION_FAILED = "FLEET_ACTIVATION_FAILED".asInstanceOf[EventCode]
    val FLEET_ACTIVATION_FAILED_NO_INSTANCES = "FLEET_ACTIVATION_FAILED_NO_INSTANCES".asInstanceOf[EventCode]
    val FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED = "FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED".asInstanceOf[EventCode]
    val SERVER_PROCESS_INVALID_PATH = "SERVER_PROCESS_INVALID_PATH".asInstanceOf[EventCode]
    val SERVER_PROCESS_SDK_INITIALIZATION_TIMEOUT = "SERVER_PROCESS_SDK_INITIALIZATION_TIMEOUT".asInstanceOf[EventCode]
    val SERVER_PROCESS_PROCESS_READY_TIMEOUT = "SERVER_PROCESS_PROCESS_READY_TIMEOUT".asInstanceOf[EventCode]
    val SERVER_PROCESS_CRASHED = "SERVER_PROCESS_CRASHED".asInstanceOf[EventCode]
    val SERVER_PROCESS_TERMINATED_UNHEALTHY = "SERVER_PROCESS_TERMINATED_UNHEALTHY".asInstanceOf[EventCode]
    val SERVER_PROCESS_FORCE_TERMINATED = "SERVER_PROCESS_FORCE_TERMINATED".asInstanceOf[EventCode]
    val SERVER_PROCESS_PROCESS_EXIT_TIMEOUT = "SERVER_PROCESS_PROCESS_EXIT_TIMEOUT".asInstanceOf[EventCode]
    val GAME_SESSION_ACTIVATION_TIMEOUT = "GAME_SESSION_ACTIVATION_TIMEOUT".asInstanceOf[EventCode]
    val FLEET_CREATION_EXTRACTING_BUILD = "FLEET_CREATION_EXTRACTING_BUILD".asInstanceOf[EventCode]
    val FLEET_CREATION_RUNNING_INSTALLER = "FLEET_CREATION_RUNNING_INSTALLER".asInstanceOf[EventCode]
    val FLEET_CREATION_VALIDATING_RUNTIME_CONFIG = "FLEET_CREATION_VALIDATING_RUNTIME_CONFIG".asInstanceOf[EventCode]
    val FLEET_VPC_PEERING_SUCCEEDED = "FLEET_VPC_PEERING_SUCCEEDED".asInstanceOf[EventCode]
    val FLEET_VPC_PEERING_FAILED = "FLEET_VPC_PEERING_FAILED".asInstanceOf[EventCode]
    val FLEET_VPC_PEERING_DELETED = "FLEET_VPC_PEERING_DELETED".asInstanceOf[EventCode]
    val INSTANCE_INTERRUPTED = "INSTANCE_INTERRUPTED".asInstanceOf[EventCode]

    @inline def values = js.Array(
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

  @js.native
  sealed trait FleetAction extends js.Any
  object FleetAction {
    val AUTO_SCALING = "AUTO_SCALING".asInstanceOf[FleetAction]

    @inline def values = js.Array(AUTO_SCALING)
  }

  /** General properties describing a fleet.
    * * <a>CreateFleet</a>
    * * <a>ListFleets</a>
    * * <a>DeleteFleet</a>
    * * <a>DescribeFleetAttributes</a>
    * * <a>UpdateFleetAttributes</a>
    * * <a>StartFleetActions</a> or <a>StopFleetActions</a>
    */
  @js.native
  trait FleetAttributes extends js.Object {
    var BuildArn: js.UndefOr[BuildArn]
    var BuildId: js.UndefOr[BuildId]
    var CertificateConfiguration: js.UndefOr[CertificateConfiguration]
    var CreationTime: js.UndefOr[Timestamp]
    var Description: js.UndefOr[NonZeroAndMaxString]
    var FleetArn: js.UndefOr[FleetArn]
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

  object FleetAttributes {
    @inline
    def apply(
        BuildArn: js.UndefOr[BuildArn] = js.undefined,
        BuildId: js.UndefOr[BuildId] = js.undefined,
        CertificateConfiguration: js.UndefOr[CertificateConfiguration] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        FleetArn: js.UndefOr[FleetArn] = js.undefined,
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
        ScriptArn: js.UndefOr[ScriptArn] = js.undefined,
        ScriptId: js.UndefOr[ScriptId] = js.undefined,
        ServerLaunchParameters: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        ServerLaunchPath: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        Status: js.UndefOr[FleetStatus] = js.undefined,
        StoppedActions: js.UndefOr[FleetActionList] = js.undefined,
        TerminationTime: js.UndefOr[Timestamp] = js.undefined
    ): FleetAttributes = {
      val __obj = js.Dynamic.literal()
      BuildArn.foreach(__v => __obj.updateDynamic("BuildArn")(__v.asInstanceOf[js.Any]))
      BuildId.foreach(__v => __obj.updateDynamic("BuildId")(__v.asInstanceOf[js.Any]))
      CertificateConfiguration.foreach(__v => __obj.updateDynamic("CertificateConfiguration")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      FleetArn.foreach(__v => __obj.updateDynamic("FleetArn")(__v.asInstanceOf[js.Any]))
      FleetId.foreach(__v => __obj.updateDynamic("FleetId")(__v.asInstanceOf[js.Any]))
      FleetType.foreach(__v => __obj.updateDynamic("FleetType")(__v.asInstanceOf[js.Any]))
      InstanceRoleArn.foreach(__v => __obj.updateDynamic("InstanceRoleArn")(__v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      LogPaths.foreach(__v => __obj.updateDynamic("LogPaths")(__v.asInstanceOf[js.Any]))
      MetricGroups.foreach(__v => __obj.updateDynamic("MetricGroups")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NewGameSessionProtectionPolicy.foreach(__v => __obj.updateDynamic("NewGameSessionProtectionPolicy")(__v.asInstanceOf[js.Any]))
      OperatingSystem.foreach(__v => __obj.updateDynamic("OperatingSystem")(__v.asInstanceOf[js.Any]))
      ResourceCreationLimitPolicy.foreach(__v => __obj.updateDynamic("ResourceCreationLimitPolicy")(__v.asInstanceOf[js.Any]))
      ScriptArn.foreach(__v => __obj.updateDynamic("ScriptArn")(__v.asInstanceOf[js.Any]))
      ScriptId.foreach(__v => __obj.updateDynamic("ScriptId")(__v.asInstanceOf[js.Any]))
      ServerLaunchParameters.foreach(__v => __obj.updateDynamic("ServerLaunchParameters")(__v.asInstanceOf[js.Any]))
      ServerLaunchPath.foreach(__v => __obj.updateDynamic("ServerLaunchPath")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StoppedActions.foreach(__v => __obj.updateDynamic("StoppedActions")(__v.asInstanceOf[js.Any]))
      TerminationTime.foreach(__v => __obj.updateDynamic("TerminationTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FleetAttributes]
    }
  }

  /** Information about the fleet's capacity. Fleet capacity is measured in EC2 instances. By default, new fleets have a capacity of one instance, but can be updated as needed. The maximum number of instances for a fleet is determined by the fleet's instance type.
    * * <a>CreateFleet</a>
    * * <a>ListFleets</a>
    * * <a>DeleteFleet</a>
    * * <a>DescribeFleetAttributes</a>
    * * <a>UpdateFleetAttributes</a>
    * * <a>StartFleetActions</a> or <a>StopFleetActions</a>
    */
  @js.native
  trait FleetCapacity extends js.Object {
    var FleetId: js.UndefOr[FleetId]
    var InstanceCounts: js.UndefOr[EC2InstanceCounts]
    var InstanceType: js.UndefOr[EC2InstanceType]
  }

  object FleetCapacity {
    @inline
    def apply(
        FleetId: js.UndefOr[FleetId] = js.undefined,
        InstanceCounts: js.UndefOr[EC2InstanceCounts] = js.undefined,
        InstanceType: js.UndefOr[EC2InstanceType] = js.undefined
    ): FleetCapacity = {
      val __obj = js.Dynamic.literal()
      FleetId.foreach(__v => __obj.updateDynamic("FleetId")(__v.asInstanceOf[js.Any]))
      InstanceCounts.foreach(__v => __obj.updateDynamic("InstanceCounts")(__v.asInstanceOf[js.Any]))
      InstanceType.foreach(__v => __obj.updateDynamic("InstanceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FleetCapacity]
    }
  }

  @js.native
  sealed trait FleetStatus extends js.Any
  object FleetStatus {
    val NEW = "NEW".asInstanceOf[FleetStatus]
    val DOWNLOADING = "DOWNLOADING".asInstanceOf[FleetStatus]
    val VALIDATING = "VALIDATING".asInstanceOf[FleetStatus]
    val BUILDING = "BUILDING".asInstanceOf[FleetStatus]
    val ACTIVATING = "ACTIVATING".asInstanceOf[FleetStatus]
    val ACTIVE = "ACTIVE".asInstanceOf[FleetStatus]
    val DELETING = "DELETING".asInstanceOf[FleetStatus]
    val ERROR = "ERROR".asInstanceOf[FleetStatus]
    val TERMINATED = "TERMINATED".asInstanceOf[FleetStatus]

    @inline def values = js.Array(NEW, DOWNLOADING, VALIDATING, BUILDING, ACTIVATING, ACTIVE, DELETING, ERROR, TERMINATED)
  }

  @js.native
  sealed trait FleetType extends js.Any
  object FleetType {
    val ON_DEMAND = "ON_DEMAND".asInstanceOf[FleetType]
    val SPOT = "SPOT".asInstanceOf[FleetType]

    @inline def values = js.Array(ON_DEMAND, SPOT)
  }

  /** Current status of fleet utilization, including the number of game and player sessions being hosted.
    * * <a>CreateFleet</a>
    * * <a>ListFleets</a>
    * * <a>DeleteFleet</a>
    * * <a>DescribeFleetAttributes</a>
    * * <a>UpdateFleetAttributes</a>
    * * <a>StartFleetActions</a> or <a>StopFleetActions</a>
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
    @inline
    def apply(
        ActiveGameSessionCount: js.UndefOr[WholeNumber] = js.undefined,
        ActiveServerProcessCount: js.UndefOr[WholeNumber] = js.undefined,
        CurrentPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined,
        FleetId: js.UndefOr[FleetId] = js.undefined,
        MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined
    ): FleetUtilization = {
      val __obj = js.Dynamic.literal()
      ActiveGameSessionCount.foreach(__v => __obj.updateDynamic("ActiveGameSessionCount")(__v.asInstanceOf[js.Any]))
      ActiveServerProcessCount.foreach(__v => __obj.updateDynamic("ActiveServerProcessCount")(__v.asInstanceOf[js.Any]))
      CurrentPlayerSessionCount.foreach(__v => __obj.updateDynamic("CurrentPlayerSessionCount")(__v.asInstanceOf[js.Any]))
      FleetId.foreach(__v => __obj.updateDynamic("FleetId")(__v.asInstanceOf[js.Any]))
      MaximumPlayerSessionCount.foreach(__v => __obj.updateDynamic("MaximumPlayerSessionCount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FleetUtilization]
    }
  }

  @js.native
  sealed trait FlexMatchMode extends js.Any
  object FlexMatchMode {
    val STANDALONE = "STANDALONE".asInstanceOf[FlexMatchMode]
    val WITH_QUEUE = "WITH_QUEUE".asInstanceOf[FlexMatchMode]

    @inline def values = js.Array(STANDALONE, WITH_QUEUE)
  }

  /** Set of key-value pairs that contain information about a game session. When included in a game session request, these properties communicate details to be used when setting up the new game session. For example, a game property might specify a game mode, level, or map. Game properties are passed to the game server process when initiating a new game session. For more information, see the [[https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-client-api.html#gamelift-sdk-client-api-create| Amazon GameLift Developer Guide]].
    */
  @js.native
  trait GameProperty extends js.Object {
    var Key: GamePropertyKey
    var Value: GamePropertyValue
  }

  object GameProperty {
    @inline
    def apply(
        Key: GamePropertyKey,
        Value: GamePropertyValue
    ): GameProperty = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GameProperty]
    }
  }

  /** ```This data type is used with the Amazon GameLift FleetIQ and game server groups.```
    * Properties describing a game server that is running on an instance in a <a>GameServerGroup</a>.
    * A game server is created by a successful call to <code>RegisterGameServer</code> and deleted by calling <code>DeregisterGameServer</code>. A game server is claimed to host a game session by calling <code>ClaimGameServer</code>.
    * * <a>RegisterGameServer</a>
    * * <a>ListGameServers</a>
    * * <a>ClaimGameServer</a>
    * * <a>DescribeGameServer</a>
    * * <a>UpdateGameServer</a>
    * * <a>DeregisterGameServer</a>
    */
  @js.native
  trait GameServer extends js.Object {
    var ClaimStatus: js.UndefOr[GameServerClaimStatus]
    var ConnectionInfo: js.UndefOr[GameServerConnectionInfo]
    var GameServerData: js.UndefOr[GameServerData]
    var GameServerGroupArn: js.UndefOr[GameServerGroupArn]
    var GameServerGroupName: js.UndefOr[GameServerGroupName]
    var GameServerId: js.UndefOr[GameServerId]
    var InstanceId: js.UndefOr[GameServerInstanceId]
    var LastClaimTime: js.UndefOr[Timestamp]
    var LastHealthCheckTime: js.UndefOr[Timestamp]
    var RegistrationTime: js.UndefOr[Timestamp]
    var UtilizationStatus: js.UndefOr[GameServerUtilizationStatus]
  }

  object GameServer {
    @inline
    def apply(
        ClaimStatus: js.UndefOr[GameServerClaimStatus] = js.undefined,
        ConnectionInfo: js.UndefOr[GameServerConnectionInfo] = js.undefined,
        GameServerData: js.UndefOr[GameServerData] = js.undefined,
        GameServerGroupArn: js.UndefOr[GameServerGroupArn] = js.undefined,
        GameServerGroupName: js.UndefOr[GameServerGroupName] = js.undefined,
        GameServerId: js.UndefOr[GameServerId] = js.undefined,
        InstanceId: js.UndefOr[GameServerInstanceId] = js.undefined,
        LastClaimTime: js.UndefOr[Timestamp] = js.undefined,
        LastHealthCheckTime: js.UndefOr[Timestamp] = js.undefined,
        RegistrationTime: js.UndefOr[Timestamp] = js.undefined,
        UtilizationStatus: js.UndefOr[GameServerUtilizationStatus] = js.undefined
    ): GameServer = {
      val __obj = js.Dynamic.literal()
      ClaimStatus.foreach(__v => __obj.updateDynamic("ClaimStatus")(__v.asInstanceOf[js.Any]))
      ConnectionInfo.foreach(__v => __obj.updateDynamic("ConnectionInfo")(__v.asInstanceOf[js.Any]))
      GameServerData.foreach(__v => __obj.updateDynamic("GameServerData")(__v.asInstanceOf[js.Any]))
      GameServerGroupArn.foreach(__v => __obj.updateDynamic("GameServerGroupArn")(__v.asInstanceOf[js.Any]))
      GameServerGroupName.foreach(__v => __obj.updateDynamic("GameServerGroupName")(__v.asInstanceOf[js.Any]))
      GameServerId.foreach(__v => __obj.updateDynamic("GameServerId")(__v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      LastClaimTime.foreach(__v => __obj.updateDynamic("LastClaimTime")(__v.asInstanceOf[js.Any]))
      LastHealthCheckTime.foreach(__v => __obj.updateDynamic("LastHealthCheckTime")(__v.asInstanceOf[js.Any]))
      RegistrationTime.foreach(__v => __obj.updateDynamic("RegistrationTime")(__v.asInstanceOf[js.Any]))
      UtilizationStatus.foreach(__v => __obj.updateDynamic("UtilizationStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GameServer]
    }
  }

  @js.native
  sealed trait GameServerClaimStatus extends js.Any
  object GameServerClaimStatus {
    val CLAIMED = "CLAIMED".asInstanceOf[GameServerClaimStatus]

    @inline def values = js.Array(CLAIMED)
  }

  /** ```This data type is used with the Amazon GameLift FleetIQ and game server groups.```
    * Properties that describe a game server group resource. A game server group manages certain properties related to a corresponding EC2 Auto Scaling group.
    * A game server group is created by a successful call to <code>CreateGameServerGroup</code> and deleted by calling <code>DeleteGameServerGroup</code>. Game server group activity can be temporarily suspended and resumed by calling <code>SuspendGameServerGroup</code> and <code>ResumeGameServerGroup</code>, respectively.
    * * <a>CreateGameServerGroup</a>
    * * <a>ListGameServerGroups</a>
    * * <a>DescribeGameServerGroup</a>
    * * <a>UpdateGameServerGroup</a>
    * * <a>DeleteGameServerGroup</a>
    * * <a>ResumeGameServerGroup</a>
    * * <a>SuspendGameServerGroup</a>
    * * <a>DescribeGameServerInstances</a>
    */
  @js.native
  trait GameServerGroup extends js.Object {
    var AutoScalingGroupArn: js.UndefOr[AutoScalingGroupArn]
    var BalancingStrategy: js.UndefOr[BalancingStrategy]
    var CreationTime: js.UndefOr[Timestamp]
    var GameServerGroupArn: js.UndefOr[GameServerGroupArn]
    var GameServerGroupName: js.UndefOr[GameServerGroupName]
    var GameServerProtectionPolicy: js.UndefOr[GameServerProtectionPolicy]
    var InstanceDefinitions: js.UndefOr[InstanceDefinitions]
    var LastUpdatedTime: js.UndefOr[Timestamp]
    var RoleArn: js.UndefOr[IamRoleArn]
    var Status: js.UndefOr[GameServerGroupStatus]
    var StatusReason: js.UndefOr[NonZeroAndMaxString]
    var SuspendedActions: js.UndefOr[GameServerGroupActions]
  }

  object GameServerGroup {
    @inline
    def apply(
        AutoScalingGroupArn: js.UndefOr[AutoScalingGroupArn] = js.undefined,
        BalancingStrategy: js.UndefOr[BalancingStrategy] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        GameServerGroupArn: js.UndefOr[GameServerGroupArn] = js.undefined,
        GameServerGroupName: js.UndefOr[GameServerGroupName] = js.undefined,
        GameServerProtectionPolicy: js.UndefOr[GameServerProtectionPolicy] = js.undefined,
        InstanceDefinitions: js.UndefOr[InstanceDefinitions] = js.undefined,
        LastUpdatedTime: js.UndefOr[Timestamp] = js.undefined,
        RoleArn: js.UndefOr[IamRoleArn] = js.undefined,
        Status: js.UndefOr[GameServerGroupStatus] = js.undefined,
        StatusReason: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        SuspendedActions: js.UndefOr[GameServerGroupActions] = js.undefined
    ): GameServerGroup = {
      val __obj = js.Dynamic.literal()
      AutoScalingGroupArn.foreach(__v => __obj.updateDynamic("AutoScalingGroupArn")(__v.asInstanceOf[js.Any]))
      BalancingStrategy.foreach(__v => __obj.updateDynamic("BalancingStrategy")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      GameServerGroupArn.foreach(__v => __obj.updateDynamic("GameServerGroupArn")(__v.asInstanceOf[js.Any]))
      GameServerGroupName.foreach(__v => __obj.updateDynamic("GameServerGroupName")(__v.asInstanceOf[js.Any]))
      GameServerProtectionPolicy.foreach(__v => __obj.updateDynamic("GameServerProtectionPolicy")(__v.asInstanceOf[js.Any]))
      InstanceDefinitions.foreach(__v => __obj.updateDynamic("InstanceDefinitions")(__v.asInstanceOf[js.Any]))
      LastUpdatedTime.foreach(__v => __obj.updateDynamic("LastUpdatedTime")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusReason.foreach(__v => __obj.updateDynamic("StatusReason")(__v.asInstanceOf[js.Any]))
      SuspendedActions.foreach(__v => __obj.updateDynamic("SuspendedActions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GameServerGroup]
    }
  }

  @js.native
  sealed trait GameServerGroupAction extends js.Any
  object GameServerGroupAction {
    val REPLACE_INSTANCE_TYPES = "REPLACE_INSTANCE_TYPES".asInstanceOf[GameServerGroupAction]

    @inline def values = js.Array(REPLACE_INSTANCE_TYPES)
  }

  /** ```This data type is used with the Amazon GameLift FleetIQ and game server groups.```
    * Configuration settings for intelligent automatic scaling that uses target tracking. These settings are used to add an Auto Scaling policy when creating the corresponding Auto Scaling group with <a>CreateGameServerGroup</a>. After the Auto Scaling group is created, all updates to Auto Scaling policies, including changing this policy and adding or removing other policies, is done directly on the Auto Scaling group.
    */
  @js.native
  trait GameServerGroupAutoScalingPolicy extends js.Object {
    var TargetTrackingConfiguration: TargetTrackingConfiguration
    var EstimatedInstanceWarmup: js.UndefOr[PositiveInteger]
  }

  object GameServerGroupAutoScalingPolicy {
    @inline
    def apply(
        TargetTrackingConfiguration: TargetTrackingConfiguration,
        EstimatedInstanceWarmup: js.UndefOr[PositiveInteger] = js.undefined
    ): GameServerGroupAutoScalingPolicy = {
      val __obj = js.Dynamic.literal(
        "TargetTrackingConfiguration" -> TargetTrackingConfiguration.asInstanceOf[js.Any]
      )

      EstimatedInstanceWarmup.foreach(__v => __obj.updateDynamic("EstimatedInstanceWarmup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GameServerGroupAutoScalingPolicy]
    }
  }

  @js.native
  sealed trait GameServerGroupDeleteOption extends js.Any
  object GameServerGroupDeleteOption {
    val SAFE_DELETE = "SAFE_DELETE".asInstanceOf[GameServerGroupDeleteOption]
    val FORCE_DELETE = "FORCE_DELETE".asInstanceOf[GameServerGroupDeleteOption]
    val RETAIN = "RETAIN".asInstanceOf[GameServerGroupDeleteOption]

    @inline def values = js.Array(SAFE_DELETE, FORCE_DELETE, RETAIN)
  }

  @js.native
  sealed trait GameServerGroupInstanceType extends js.Any
  object GameServerGroupInstanceType {
    val `c4.large` = "c4.large".asInstanceOf[GameServerGroupInstanceType]
    val `c4.xlarge` = "c4.xlarge".asInstanceOf[GameServerGroupInstanceType]
    val `c4.2xlarge` = "c4.2xlarge".asInstanceOf[GameServerGroupInstanceType]
    val `c4.4xlarge` = "c4.4xlarge".asInstanceOf[GameServerGroupInstanceType]
    val `c4.8xlarge` = "c4.8xlarge".asInstanceOf[GameServerGroupInstanceType]
    val `c5.large` = "c5.large".asInstanceOf[GameServerGroupInstanceType]
    val `c5.xlarge` = "c5.xlarge".asInstanceOf[GameServerGroupInstanceType]
    val `c5.2xlarge` = "c5.2xlarge".asInstanceOf[GameServerGroupInstanceType]
    val `c5.4xlarge` = "c5.4xlarge".asInstanceOf[GameServerGroupInstanceType]
    val `c5.9xlarge` = "c5.9xlarge".asInstanceOf[GameServerGroupInstanceType]
    val `c5.12xlarge` = "c5.12xlarge".asInstanceOf[GameServerGroupInstanceType]
    val `c5.18xlarge` = "c5.18xlarge".asInstanceOf[GameServerGroupInstanceType]
    val `c5.24xlarge` = "c5.24xlarge".asInstanceOf[GameServerGroupInstanceType]
    val `r4.large` = "r4.large".asInstanceOf[GameServerGroupInstanceType]
    val `r4.xlarge` = "r4.xlarge".asInstanceOf[GameServerGroupInstanceType]
    val `r4.2xlarge` = "r4.2xlarge".asInstanceOf[GameServerGroupInstanceType]
    val `r4.4xlarge` = "r4.4xlarge".asInstanceOf[GameServerGroupInstanceType]
    val `r4.8xlarge` = "r4.8xlarge".asInstanceOf[GameServerGroupInstanceType]
    val `r4.16xlarge` = "r4.16xlarge".asInstanceOf[GameServerGroupInstanceType]
    val `r5.large` = "r5.large".asInstanceOf[GameServerGroupInstanceType]
    val `r5.xlarge` = "r5.xlarge".asInstanceOf[GameServerGroupInstanceType]
    val `r5.2xlarge` = "r5.2xlarge".asInstanceOf[GameServerGroupInstanceType]
    val `r5.4xlarge` = "r5.4xlarge".asInstanceOf[GameServerGroupInstanceType]
    val `r5.8xlarge` = "r5.8xlarge".asInstanceOf[GameServerGroupInstanceType]
    val `r5.12xlarge` = "r5.12xlarge".asInstanceOf[GameServerGroupInstanceType]
    val `r5.16xlarge` = "r5.16xlarge".asInstanceOf[GameServerGroupInstanceType]
    val `r5.24xlarge` = "r5.24xlarge".asInstanceOf[GameServerGroupInstanceType]
    val `m4.large` = "m4.large".asInstanceOf[GameServerGroupInstanceType]
    val `m4.xlarge` = "m4.xlarge".asInstanceOf[GameServerGroupInstanceType]
    val `m4.2xlarge` = "m4.2xlarge".asInstanceOf[GameServerGroupInstanceType]
    val `m4.4xlarge` = "m4.4xlarge".asInstanceOf[GameServerGroupInstanceType]
    val `m4.10xlarge` = "m4.10xlarge".asInstanceOf[GameServerGroupInstanceType]
    val `m5.large` = "m5.large".asInstanceOf[GameServerGroupInstanceType]
    val `m5.xlarge` = "m5.xlarge".asInstanceOf[GameServerGroupInstanceType]
    val `m5.2xlarge` = "m5.2xlarge".asInstanceOf[GameServerGroupInstanceType]
    val `m5.4xlarge` = "m5.4xlarge".asInstanceOf[GameServerGroupInstanceType]
    val `m5.8xlarge` = "m5.8xlarge".asInstanceOf[GameServerGroupInstanceType]
    val `m5.12xlarge` = "m5.12xlarge".asInstanceOf[GameServerGroupInstanceType]
    val `m5.16xlarge` = "m5.16xlarge".asInstanceOf[GameServerGroupInstanceType]
    val `m5.24xlarge` = "m5.24xlarge".asInstanceOf[GameServerGroupInstanceType]

    @inline def values = js.Array(
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
  }

  @js.native
  sealed trait GameServerGroupStatus extends js.Any
  object GameServerGroupStatus {
    val NEW = "NEW".asInstanceOf[GameServerGroupStatus]
    val ACTIVATING = "ACTIVATING".asInstanceOf[GameServerGroupStatus]
    val ACTIVE = "ACTIVE".asInstanceOf[GameServerGroupStatus]
    val DELETE_SCHEDULED = "DELETE_SCHEDULED".asInstanceOf[GameServerGroupStatus]
    val DELETING = "DELETING".asInstanceOf[GameServerGroupStatus]
    val DELETED = "DELETED".asInstanceOf[GameServerGroupStatus]
    val ERROR = "ERROR".asInstanceOf[GameServerGroupStatus]

    @inline def values = js.Array(NEW, ACTIVATING, ACTIVE, DELETE_SCHEDULED, DELETING, DELETED, ERROR)
  }

  @js.native
  sealed trait GameServerHealthCheck extends js.Any
  object GameServerHealthCheck {
    val HEALTHY = "HEALTHY".asInstanceOf[GameServerHealthCheck]

    @inline def values = js.Array(HEALTHY)
  }

  /** ```This data type is used with the Amazon GameLift FleetIQ and game server groups.```
    * Additional properties, including status, that describe an EC2 instance in a game server group. Instance configurations are set with game server group properties (see <code>DescribeGameServerGroup</code> and with the EC2 launch template that was used when creating the game server group.
    * Retrieve game server instances for a game server group by calling <code>DescribeGameServerInstances</code>.
    * * <a>CreateGameServerGroup</a>
    * * <a>ListGameServerGroups</a>
    * * <a>DescribeGameServerGroup</a>
    * * <a>UpdateGameServerGroup</a>
    * * <a>DeleteGameServerGroup</a>
    * * <a>ResumeGameServerGroup</a>
    * * <a>SuspendGameServerGroup</a>
    * * <a>DescribeGameServerInstances</a>
    */
  @js.native
  trait GameServerInstance extends js.Object {
    var GameServerGroupArn: js.UndefOr[GameServerGroupArn]
    var GameServerGroupName: js.UndefOr[GameServerGroupName]
    var InstanceId: js.UndefOr[GameServerInstanceId]
    var InstanceStatus: js.UndefOr[GameServerInstanceStatus]
  }

  object GameServerInstance {
    @inline
    def apply(
        GameServerGroupArn: js.UndefOr[GameServerGroupArn] = js.undefined,
        GameServerGroupName: js.UndefOr[GameServerGroupName] = js.undefined,
        InstanceId: js.UndefOr[GameServerInstanceId] = js.undefined,
        InstanceStatus: js.UndefOr[GameServerInstanceStatus] = js.undefined
    ): GameServerInstance = {
      val __obj = js.Dynamic.literal()
      GameServerGroupArn.foreach(__v => __obj.updateDynamic("GameServerGroupArn")(__v.asInstanceOf[js.Any]))
      GameServerGroupName.foreach(__v => __obj.updateDynamic("GameServerGroupName")(__v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      InstanceStatus.foreach(__v => __obj.updateDynamic("InstanceStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GameServerInstance]
    }
  }

  @js.native
  sealed trait GameServerInstanceStatus extends js.Any
  object GameServerInstanceStatus {
    val ACTIVE = "ACTIVE".asInstanceOf[GameServerInstanceStatus]
    val DRAINING = "DRAINING".asInstanceOf[GameServerInstanceStatus]
    val SPOT_TERMINATING = "SPOT_TERMINATING".asInstanceOf[GameServerInstanceStatus]

    @inline def values = js.Array(ACTIVE, DRAINING, SPOT_TERMINATING)
  }

  @js.native
  sealed trait GameServerProtectionPolicy extends js.Any
  object GameServerProtectionPolicy {
    val NO_PROTECTION = "NO_PROTECTION".asInstanceOf[GameServerProtectionPolicy]
    val FULL_PROTECTION = "FULL_PROTECTION".asInstanceOf[GameServerProtectionPolicy]

    @inline def values = js.Array(NO_PROTECTION, FULL_PROTECTION)
  }

  @js.native
  sealed trait GameServerUtilizationStatus extends js.Any
  object GameServerUtilizationStatus {
    val AVAILABLE = "AVAILABLE".asInstanceOf[GameServerUtilizationStatus]
    val UTILIZED = "UTILIZED".asInstanceOf[GameServerUtilizationStatus]

    @inline def values = js.Array(AVAILABLE, UTILIZED)
  }

  /** Properties describing a game session.
    * A game session in ACTIVE status can host players. When a game session ends, its status is set to <code>TERMINATED</code>.
    * Once the session ends, the game session object is retained for 30 days. This means you can reuse idempotency token values after this time. Game session logs are retained for 14 days.
    * * <a>CreateGameSession</a>
    * * <a>DescribeGameSessions</a>
    * * <a>DescribeGameSessionDetails</a>
    * * <a>SearchGameSessions</a>
    * * <a>UpdateGameSession</a>
    * * <a>GetGameSessionLogUrl</a>
    * * Game session placements
    * <li> <a>StartGameSessionPlacement</a>
    * * <a>DescribeGameSessionPlacement</a>
    * * <a>StopGameSessionPlacement</a>
    * </li>
    */
  @js.native
  trait GameSession extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var CreatorId: js.UndefOr[NonZeroAndMaxString]
    var CurrentPlayerSessionCount: js.UndefOr[WholeNumber]
    var DnsName: js.UndefOr[DnsName]
    var FleetArn: js.UndefOr[FleetArn]
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
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        CreatorId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        CurrentPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined,
        DnsName: js.UndefOr[DnsName] = js.undefined,
        FleetArn: js.UndefOr[FleetArn] = js.undefined,
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
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      CreatorId.foreach(__v => __obj.updateDynamic("CreatorId")(__v.asInstanceOf[js.Any]))
      CurrentPlayerSessionCount.foreach(__v => __obj.updateDynamic("CurrentPlayerSessionCount")(__v.asInstanceOf[js.Any]))
      DnsName.foreach(__v => __obj.updateDynamic("DnsName")(__v.asInstanceOf[js.Any]))
      FleetArn.foreach(__v => __obj.updateDynamic("FleetArn")(__v.asInstanceOf[js.Any]))
      FleetId.foreach(__v => __obj.updateDynamic("FleetId")(__v.asInstanceOf[js.Any]))
      GameProperties.foreach(__v => __obj.updateDynamic("GameProperties")(__v.asInstanceOf[js.Any]))
      GameSessionData.foreach(__v => __obj.updateDynamic("GameSessionData")(__v.asInstanceOf[js.Any]))
      GameSessionId.foreach(__v => __obj.updateDynamic("GameSessionId")(__v.asInstanceOf[js.Any]))
      IpAddress.foreach(__v => __obj.updateDynamic("IpAddress")(__v.asInstanceOf[js.Any]))
      MatchmakerData.foreach(__v => __obj.updateDynamic("MatchmakerData")(__v.asInstanceOf[js.Any]))
      MaximumPlayerSessionCount.foreach(__v => __obj.updateDynamic("MaximumPlayerSessionCount")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PlayerSessionCreationPolicy.foreach(__v => __obj.updateDynamic("PlayerSessionCreationPolicy")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusReason.foreach(__v => __obj.updateDynamic("StatusReason")(__v.asInstanceOf[js.Any]))
      TerminationTime.foreach(__v => __obj.updateDynamic("TerminationTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GameSession]
    }
  }

  /** Connection information for a new game session that is created in response to a <a>StartMatchmaking</a> request. Once a match is made, the FlexMatch engine creates a new game session for it. This information, including the game session endpoint and player sessions for each player in the original matchmaking request, is added to the <a>MatchmakingTicket</a>, which can be retrieved by calling <a>DescribeMatchmaking</a>.
    */
  @js.native
  trait GameSessionConnectionInfo extends js.Object {
    var DnsName: js.UndefOr[DnsName]
    var GameSessionArn: js.UndefOr[ArnStringModel]
    var IpAddress: js.UndefOr[StringModel]
    var MatchedPlayerSessions: js.UndefOr[MatchedPlayerSessionList]
    var Port: js.UndefOr[PositiveInteger]
  }

  object GameSessionConnectionInfo {
    @inline
    def apply(
        DnsName: js.UndefOr[DnsName] = js.undefined,
        GameSessionArn: js.UndefOr[ArnStringModel] = js.undefined,
        IpAddress: js.UndefOr[StringModel] = js.undefined,
        MatchedPlayerSessions: js.UndefOr[MatchedPlayerSessionList] = js.undefined,
        Port: js.UndefOr[PositiveInteger] = js.undefined
    ): GameSessionConnectionInfo = {
      val __obj = js.Dynamic.literal()
      DnsName.foreach(__v => __obj.updateDynamic("DnsName")(__v.asInstanceOf[js.Any]))
      GameSessionArn.foreach(__v => __obj.updateDynamic("GameSessionArn")(__v.asInstanceOf[js.Any]))
      IpAddress.foreach(__v => __obj.updateDynamic("IpAddress")(__v.asInstanceOf[js.Any]))
      MatchedPlayerSessions.foreach(__v => __obj.updateDynamic("MatchedPlayerSessions")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GameSessionConnectionInfo]
    }
  }

  /** A game session's properties plus the protection policy currently in force.
    */
  @js.native
  trait GameSessionDetail extends js.Object {
    var GameSession: js.UndefOr[GameSession]
    var ProtectionPolicy: js.UndefOr[ProtectionPolicy]
  }

  object GameSessionDetail {
    @inline
    def apply(
        GameSession: js.UndefOr[GameSession] = js.undefined,
        ProtectionPolicy: js.UndefOr[ProtectionPolicy] = js.undefined
    ): GameSessionDetail = {
      val __obj = js.Dynamic.literal()
      GameSession.foreach(__v => __obj.updateDynamic("GameSession")(__v.asInstanceOf[js.Any]))
      ProtectionPolicy.foreach(__v => __obj.updateDynamic("ProtectionPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GameSessionDetail]
    }
  }

  /** Object that describes a <a>StartGameSessionPlacement</a> request. This object includes the full details of the original request plus the current status and start/end time stamps.
    * Game session placement-related operations include:
    * * <a>StartGameSessionPlacement</a>
    * * <a>DescribeGameSessionPlacement</a>
    * * <a>StopGameSessionPlacement</a>
    */
  @js.native
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

  object GameSessionPlacement {
    @inline
    def apply(
        DnsName: js.UndefOr[DnsName] = js.undefined,
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
      val __obj = js.Dynamic.literal()
      DnsName.foreach(__v => __obj.updateDynamic("DnsName")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      GameProperties.foreach(__v => __obj.updateDynamic("GameProperties")(__v.asInstanceOf[js.Any]))
      GameSessionArn.foreach(__v => __obj.updateDynamic("GameSessionArn")(__v.asInstanceOf[js.Any]))
      GameSessionData.foreach(__v => __obj.updateDynamic("GameSessionData")(__v.asInstanceOf[js.Any]))
      GameSessionId.foreach(__v => __obj.updateDynamic("GameSessionId")(__v.asInstanceOf[js.Any]))
      GameSessionName.foreach(__v => __obj.updateDynamic("GameSessionName")(__v.asInstanceOf[js.Any]))
      GameSessionQueueName.foreach(__v => __obj.updateDynamic("GameSessionQueueName")(__v.asInstanceOf[js.Any]))
      GameSessionRegion.foreach(__v => __obj.updateDynamic("GameSessionRegion")(__v.asInstanceOf[js.Any]))
      IpAddress.foreach(__v => __obj.updateDynamic("IpAddress")(__v.asInstanceOf[js.Any]))
      MatchmakerData.foreach(__v => __obj.updateDynamic("MatchmakerData")(__v.asInstanceOf[js.Any]))
      MaximumPlayerSessionCount.foreach(__v => __obj.updateDynamic("MaximumPlayerSessionCount")(__v.asInstanceOf[js.Any]))
      PlacedPlayerSessions.foreach(__v => __obj.updateDynamic("PlacedPlayerSessions")(__v.asInstanceOf[js.Any]))
      PlacementId.foreach(__v => __obj.updateDynamic("PlacementId")(__v.asInstanceOf[js.Any]))
      PlayerLatencies.foreach(__v => __obj.updateDynamic("PlayerLatencies")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GameSessionPlacement]
    }
  }

  @js.native
  sealed trait GameSessionPlacementState extends js.Any
  object GameSessionPlacementState {
    val PENDING = "PENDING".asInstanceOf[GameSessionPlacementState]
    val FULFILLED = "FULFILLED".asInstanceOf[GameSessionPlacementState]
    val CANCELLED = "CANCELLED".asInstanceOf[GameSessionPlacementState]
    val TIMED_OUT = "TIMED_OUT".asInstanceOf[GameSessionPlacementState]
    val FAILED = "FAILED".asInstanceOf[GameSessionPlacementState]

    @inline def values = js.Array(PENDING, FULFILLED, CANCELLED, TIMED_OUT, FAILED)
  }

  /** Configuration of a queue that is used to process game session placement requests. The queue configuration identifies several game features:
    * * The destinations where a new game session can potentially be hosted. Amazon GameLift tries these destinations in an order based on either the queue's default order or player latency information, if provided in a placement request. With latency information, Amazon GameLift can place game sessions where the majority of players are reporting the lowest possible latency.
    * * The length of time that placement requests can wait in the queue before timing out.
    * * A set of optional latency policies that protect individual players from high latencies, preventing game sessions from being placed where any individual player is reporting latency higher than a policy's maximum.
    * * <a>CreateGameSessionQueue</a>
    * * <a>DescribeGameSessionQueues</a>
    * * <a>UpdateGameSessionQueue</a>
    * * <a>DeleteGameSessionQueue</a>
    */
  @js.native
  trait GameSessionQueue extends js.Object {
    var Destinations: js.UndefOr[GameSessionQueueDestinationList]
    var GameSessionQueueArn: js.UndefOr[GameSessionQueueArn]
    var Name: js.UndefOr[GameSessionQueueName]
    var PlayerLatencyPolicies: js.UndefOr[PlayerLatencyPolicyList]
    var TimeoutInSeconds: js.UndefOr[WholeNumber]
  }

  object GameSessionQueue {
    @inline
    def apply(
        Destinations: js.UndefOr[GameSessionQueueDestinationList] = js.undefined,
        GameSessionQueueArn: js.UndefOr[GameSessionQueueArn] = js.undefined,
        Name: js.UndefOr[GameSessionQueueName] = js.undefined,
        PlayerLatencyPolicies: js.UndefOr[PlayerLatencyPolicyList] = js.undefined,
        TimeoutInSeconds: js.UndefOr[WholeNumber] = js.undefined
    ): GameSessionQueue = {
      val __obj = js.Dynamic.literal()
      Destinations.foreach(__v => __obj.updateDynamic("Destinations")(__v.asInstanceOf[js.Any]))
      GameSessionQueueArn.foreach(__v => __obj.updateDynamic("GameSessionQueueArn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PlayerLatencyPolicies.foreach(__v => __obj.updateDynamic("PlayerLatencyPolicies")(__v.asInstanceOf[js.Any]))
      TimeoutInSeconds.foreach(__v => __obj.updateDynamic("TimeoutInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GameSessionQueue]
    }
  }

  /** Fleet designated in a game session queue. Requests for new game sessions in the queue are fulfilled by starting a new game session on any destination that is configured for a queue.
    * * <a>CreateGameSessionQueue</a>
    * * <a>DescribeGameSessionQueues</a>
    * * <a>UpdateGameSessionQueue</a>
    * * <a>DeleteGameSessionQueue</a>
    */
  @js.native
  trait GameSessionQueueDestination extends js.Object {
    var DestinationArn: js.UndefOr[ArnStringModel]
  }

  object GameSessionQueueDestination {
    @inline
    def apply(
        DestinationArn: js.UndefOr[ArnStringModel] = js.undefined
    ): GameSessionQueueDestination = {
      val __obj = js.Dynamic.literal()
      DestinationArn.foreach(__v => __obj.updateDynamic("DestinationArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GameSessionQueueDestination]
    }
  }

  @js.native
  sealed trait GameSessionStatus extends js.Any
  object GameSessionStatus {
    val ACTIVE = "ACTIVE".asInstanceOf[GameSessionStatus]
    val ACTIVATING = "ACTIVATING".asInstanceOf[GameSessionStatus]
    val TERMINATED = "TERMINATED".asInstanceOf[GameSessionStatus]
    val TERMINATING = "TERMINATING".asInstanceOf[GameSessionStatus]
    val ERROR = "ERROR".asInstanceOf[GameSessionStatus]

    @inline def values = js.Array(ACTIVE, ACTIVATING, TERMINATED, TERMINATING, ERROR)
  }

  @js.native
  sealed trait GameSessionStatusReason extends js.Any
  object GameSessionStatusReason {
    val INTERRUPTED = "INTERRUPTED".asInstanceOf[GameSessionStatusReason]

    @inline def values = js.Array(INTERRUPTED)
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait GetGameSessionLogUrlInput extends js.Object {
    var GameSessionId: ArnStringModel
  }

  object GetGameSessionLogUrlInput {
    @inline
    def apply(
        GameSessionId: ArnStringModel
    ): GetGameSessionLogUrlInput = {
      val __obj = js.Dynamic.literal(
        "GameSessionId" -> GameSessionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetGameSessionLogUrlInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait GetGameSessionLogUrlOutput extends js.Object {
    var PreSignedUrl: js.UndefOr[NonZeroAndMaxString]
  }

  object GetGameSessionLogUrlOutput {
    @inline
    def apply(
        PreSignedUrl: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): GetGameSessionLogUrlOutput = {
      val __obj = js.Dynamic.literal()
      PreSignedUrl.foreach(__v => __obj.updateDynamic("PreSignedUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGameSessionLogUrlOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait GetInstanceAccessInput extends js.Object {
    var FleetId: FleetIdOrArn
    var InstanceId: InstanceId
  }

  object GetInstanceAccessInput {
    @inline
    def apply(
        FleetId: FleetIdOrArn,
        InstanceId: InstanceId
    ): GetInstanceAccessInput = {
      val __obj = js.Dynamic.literal(
        "FleetId" -> FleetId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetInstanceAccessInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait GetInstanceAccessOutput extends js.Object {
    var InstanceAccess: js.UndefOr[InstanceAccess]
  }

  object GetInstanceAccessOutput {
    @inline
    def apply(
        InstanceAccess: js.UndefOr[InstanceAccess] = js.undefined
    ): GetInstanceAccessOutput = {
      val __obj = js.Dynamic.literal()
      InstanceAccess.foreach(__v => __obj.updateDynamic("InstanceAccess")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInstanceAccessOutput]
    }
  }

  /** Properties that describe an instance of a virtual computing resource that hosts one or more game servers. A fleet may contain zero or more instances.
    */
  @js.native
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

  object Instance {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        DnsName: js.UndefOr[DnsName] = js.undefined,
        FleetId: js.UndefOr[FleetId] = js.undefined,
        InstanceId: js.UndefOr[InstanceId] = js.undefined,
        IpAddress: js.UndefOr[IpAddress] = js.undefined,
        OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined,
        Status: js.UndefOr[InstanceStatus] = js.undefined,
        Type: js.UndefOr[EC2InstanceType] = js.undefined
    ): Instance = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DnsName.foreach(__v => __obj.updateDynamic("DnsName")(__v.asInstanceOf[js.Any]))
      FleetId.foreach(__v => __obj.updateDynamic("FleetId")(__v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      IpAddress.foreach(__v => __obj.updateDynamic("IpAddress")(__v.asInstanceOf[js.Any]))
      OperatingSystem.foreach(__v => __obj.updateDynamic("OperatingSystem")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Instance]
    }
  }

  /** Information required to remotely connect to a fleet instance. Access is requested by calling <a>GetInstanceAccess</a>.
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
    @inline
    def apply(
        Credentials: js.UndefOr[InstanceCredentials] = js.undefined,
        FleetId: js.UndefOr[FleetId] = js.undefined,
        InstanceId: js.UndefOr[InstanceId] = js.undefined,
        IpAddress: js.UndefOr[IpAddress] = js.undefined,
        OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined
    ): InstanceAccess = {
      val __obj = js.Dynamic.literal()
      Credentials.foreach(__v => __obj.updateDynamic("Credentials")(__v.asInstanceOf[js.Any]))
      FleetId.foreach(__v => __obj.updateDynamic("FleetId")(__v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      IpAddress.foreach(__v => __obj.updateDynamic("IpAddress")(__v.asInstanceOf[js.Any]))
      OperatingSystem.foreach(__v => __obj.updateDynamic("OperatingSystem")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceAccess]
    }
  }

  /** Set of credentials required to remotely access a fleet instance. Access credentials are requested by calling <a>GetInstanceAccess</a> and returned in an <a>InstanceAccess</a> object.
    */
  @js.native
  trait InstanceCredentials extends js.Object {
    var Secret: js.UndefOr[NonEmptyString]
    var UserName: js.UndefOr[NonEmptyString]
  }

  object InstanceCredentials {
    @inline
    def apply(
        Secret: js.UndefOr[NonEmptyString] = js.undefined,
        UserName: js.UndefOr[NonEmptyString] = js.undefined
    ): InstanceCredentials = {
      val __obj = js.Dynamic.literal()
      Secret.foreach(__v => __obj.updateDynamic("Secret")(__v.asInstanceOf[js.Any]))
      UserName.foreach(__v => __obj.updateDynamic("UserName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceCredentials]
    }
  }

  /** ```This data type is used with the Amazon GameLift FleetIQ and game server groups.```
    * An allowed instance type for a <a>GameServerGroup</a>. All game server groups must have at least two instance types defined for it. GameLift FleetIQ periodically evaluates each defined instance type for viability. It then updates the Auto Scaling group with the list of viable instance types.
    */
  @js.native
  trait InstanceDefinition extends js.Object {
    var InstanceType: GameServerGroupInstanceType
    var WeightedCapacity: js.UndefOr[WeightedCapacity]
  }

  object InstanceDefinition {
    @inline
    def apply(
        InstanceType: GameServerGroupInstanceType,
        WeightedCapacity: js.UndefOr[WeightedCapacity] = js.undefined
    ): InstanceDefinition = {
      val __obj = js.Dynamic.literal(
        "InstanceType" -> InstanceType.asInstanceOf[js.Any]
      )

      WeightedCapacity.foreach(__v => __obj.updateDynamic("WeightedCapacity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceDefinition]
    }
  }

  @js.native
  sealed trait InstanceStatus extends js.Any
  object InstanceStatus {
    val PENDING = "PENDING".asInstanceOf[InstanceStatus]
    val ACTIVE = "ACTIVE".asInstanceOf[InstanceStatus]
    val TERMINATING = "TERMINATING".asInstanceOf[InstanceStatus]

    @inline def values = js.Array(PENDING, ACTIVE, TERMINATING)
  }

  /** A range of IP addresses and port settings that allow inbound traffic to connect to server processes on an Amazon GameLift hosting resource. New game sessions that are started on the fleet are assigned an IP address/port number combination, which must fall into the fleet's allowed ranges. For fleets created with a custom game server, the ranges reflect the server's game session assignments. For Realtime Servers fleets, Amazon GameLift automatically opens two port ranges, one for TCP messaging and one for UDP for use by the Realtime servers.
    */
  @js.native
  trait IpPermission extends js.Object {
    var FromPort: PortNumber
    var IpRange: NonBlankString
    var Protocol: IpProtocol
    var ToPort: PortNumber
  }

  object IpPermission {
    @inline
    def apply(
        FromPort: PortNumber,
        IpRange: NonBlankString,
        Protocol: IpProtocol,
        ToPort: PortNumber
    ): IpPermission = {
      val __obj = js.Dynamic.literal(
        "FromPort" -> FromPort.asInstanceOf[js.Any],
        "IpRange" -> IpRange.asInstanceOf[js.Any],
        "Protocol" -> Protocol.asInstanceOf[js.Any],
        "ToPort" -> ToPort.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[IpPermission]
    }
  }

  @js.native
  sealed trait IpProtocol extends js.Any
  object IpProtocol {
    val TCP = "TCP".asInstanceOf[IpProtocol]
    val UDP = "UDP".asInstanceOf[IpProtocol]

    @inline def values = js.Array(TCP, UDP)
  }

  /** ```This data type is used with the Amazon GameLift FleetIQ and game server groups.```
    * An EC2 launch template that contains configuration settings and game server code to be deployed to all instances in a game server group. The launch template is specified when creating a new game server group with <a>CreateGameServerGroup</a>.
    */
  @js.native
  trait LaunchTemplateSpecification extends js.Object {
    var LaunchTemplateId: js.UndefOr[LaunchTemplateId]
    var LaunchTemplateName: js.UndefOr[LaunchTemplateName]
    var Version: js.UndefOr[LaunchTemplateVersion]
  }

  object LaunchTemplateSpecification {
    @inline
    def apply(
        LaunchTemplateId: js.UndefOr[LaunchTemplateId] = js.undefined,
        LaunchTemplateName: js.UndefOr[LaunchTemplateName] = js.undefined,
        Version: js.UndefOr[LaunchTemplateVersion] = js.undefined
    ): LaunchTemplateSpecification = {
      val __obj = js.Dynamic.literal()
      LaunchTemplateId.foreach(__v => __obj.updateDynamic("LaunchTemplateId")(__v.asInstanceOf[js.Any]))
      LaunchTemplateName.foreach(__v => __obj.updateDynamic("LaunchTemplateName")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LaunchTemplateSpecification]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait ListAliasesInput extends js.Object {
    var Limit: js.UndefOr[PositiveInteger]
    var Name: js.UndefOr[NonEmptyString]
    var NextToken: js.UndefOr[NonEmptyString]
    var RoutingStrategyType: js.UndefOr[RoutingStrategyType]
  }

  object ListAliasesInput {
    @inline
    def apply(
        Limit: js.UndefOr[PositiveInteger] = js.undefined,
        Name: js.UndefOr[NonEmptyString] = js.undefined,
        NextToken: js.UndefOr[NonEmptyString] = js.undefined,
        RoutingStrategyType: js.UndefOr[RoutingStrategyType] = js.undefined
    ): ListAliasesInput = {
      val __obj = js.Dynamic.literal()
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      RoutingStrategyType.foreach(__v => __obj.updateDynamic("RoutingStrategyType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAliasesInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait ListAliasesOutput extends js.Object {
    var Aliases: js.UndefOr[AliasList]
    var NextToken: js.UndefOr[NonEmptyString]
  }

  object ListAliasesOutput {
    @inline
    def apply(
        Aliases: js.UndefOr[AliasList] = js.undefined,
        NextToken: js.UndefOr[NonEmptyString] = js.undefined
    ): ListAliasesOutput = {
      val __obj = js.Dynamic.literal()
      Aliases.foreach(__v => __obj.updateDynamic("Aliases")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAliasesOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait ListBuildsInput extends js.Object {
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonEmptyString]
    var Status: js.UndefOr[BuildStatus]
  }

  object ListBuildsInput {
    @inline
    def apply(
        Limit: js.UndefOr[PositiveInteger] = js.undefined,
        NextToken: js.UndefOr[NonEmptyString] = js.undefined,
        Status: js.UndefOr[BuildStatus] = js.undefined
    ): ListBuildsInput = {
      val __obj = js.Dynamic.literal()
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBuildsInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait ListBuildsOutput extends js.Object {
    var Builds: js.UndefOr[BuildList]
    var NextToken: js.UndefOr[NonEmptyString]
  }

  object ListBuildsOutput {
    @inline
    def apply(
        Builds: js.UndefOr[BuildList] = js.undefined,
        NextToken: js.UndefOr[NonEmptyString] = js.undefined
    ): ListBuildsOutput = {
      val __obj = js.Dynamic.literal()
      Builds.foreach(__v => __obj.updateDynamic("Builds")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListBuildsOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait ListFleetsInput extends js.Object {
    var BuildId: js.UndefOr[BuildIdOrArn]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
    var ScriptId: js.UndefOr[ScriptIdOrArn]
  }

  object ListFleetsInput {
    @inline
    def apply(
        BuildId: js.UndefOr[BuildIdOrArn] = js.undefined,
        Limit: js.UndefOr[PositiveInteger] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        ScriptId: js.UndefOr[ScriptIdOrArn] = js.undefined
    ): ListFleetsInput = {
      val __obj = js.Dynamic.literal()
      BuildId.foreach(__v => __obj.updateDynamic("BuildId")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ScriptId.foreach(__v => __obj.updateDynamic("ScriptId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFleetsInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait ListFleetsOutput extends js.Object {
    var FleetIds: js.UndefOr[FleetIdList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object ListFleetsOutput {
    @inline
    def apply(
        FleetIds: js.UndefOr[FleetIdList] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): ListFleetsOutput = {
      val __obj = js.Dynamic.literal()
      FleetIds.foreach(__v => __obj.updateDynamic("FleetIds")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFleetsOutput]
    }
  }

  @js.native
  trait ListGameServerGroupsInput extends js.Object {
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object ListGameServerGroupsInput {
    @inline
    def apply(
        Limit: js.UndefOr[PositiveInteger] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): ListGameServerGroupsInput = {
      val __obj = js.Dynamic.literal()
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGameServerGroupsInput]
    }
  }

  @js.native
  trait ListGameServerGroupsOutput extends js.Object {
    var GameServerGroups: js.UndefOr[GameServerGroups]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object ListGameServerGroupsOutput {
    @inline
    def apply(
        GameServerGroups: js.UndefOr[GameServerGroups] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): ListGameServerGroupsOutput = {
      val __obj = js.Dynamic.literal()
      GameServerGroups.foreach(__v => __obj.updateDynamic("GameServerGroups")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGameServerGroupsOutput]
    }
  }

  @js.native
  trait ListGameServersInput extends js.Object {
    var GameServerGroupName: GameServerGroupNameOrArn
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
    var SortOrder: js.UndefOr[SortOrder]
  }

  object ListGameServersInput {
    @inline
    def apply(
        GameServerGroupName: GameServerGroupNameOrArn,
        Limit: js.UndefOr[PositiveInteger] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        SortOrder: js.UndefOr[SortOrder] = js.undefined
    ): ListGameServersInput = {
      val __obj = js.Dynamic.literal(
        "GameServerGroupName" -> GameServerGroupName.asInstanceOf[js.Any]
      )

      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortOrder.foreach(__v => __obj.updateDynamic("SortOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGameServersInput]
    }
  }

  @js.native
  trait ListGameServersOutput extends js.Object {
    var GameServers: js.UndefOr[GameServers]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object ListGameServersOutput {
    @inline
    def apply(
        GameServers: js.UndefOr[GameServers] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): ListGameServersOutput = {
      val __obj = js.Dynamic.literal()
      GameServers.foreach(__v => __obj.updateDynamic("GameServers")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGameServersOutput]
    }
  }

  @js.native
  trait ListScriptsInput extends js.Object {
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonEmptyString]
  }

  object ListScriptsInput {
    @inline
    def apply(
        Limit: js.UndefOr[PositiveInteger] = js.undefined,
        NextToken: js.UndefOr[NonEmptyString] = js.undefined
    ): ListScriptsInput = {
      val __obj = js.Dynamic.literal()
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListScriptsInput]
    }
  }

  @js.native
  trait ListScriptsOutput extends js.Object {
    var NextToken: js.UndefOr[NonEmptyString]
    var Scripts: js.UndefOr[ScriptList]
  }

  object ListScriptsOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NonEmptyString] = js.undefined,
        Scripts: js.UndefOr[ScriptList] = js.undefined
    ): ListScriptsOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Scripts.foreach(__v => __obj.updateDynamic("Scripts")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListScriptsOutput]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** Represents a new player session that is created as a result of a successful FlexMatch match. A successful match automatically creates new player sessions for every player ID in the original matchmaking request.
    * When players connect to the match's game session, they must include both player ID and player session ID in order to claim their assigned player slot.
    */
  @js.native
  trait MatchedPlayerSession extends js.Object {
    var PlayerId: js.UndefOr[NonZeroAndMaxString]
    var PlayerSessionId: js.UndefOr[PlayerSessionId]
  }

  object MatchedPlayerSession {
    @inline
    def apply(
        PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        PlayerSessionId: js.UndefOr[PlayerSessionId] = js.undefined
    ): MatchedPlayerSession = {
      val __obj = js.Dynamic.literal()
      PlayerId.foreach(__v => __obj.updateDynamic("PlayerId")(__v.asInstanceOf[js.Any]))
      PlayerSessionId.foreach(__v => __obj.updateDynamic("PlayerSessionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MatchedPlayerSession]
    }
  }

  /** Guidelines for use with FlexMatch to match players into games. All matchmaking requests must specify a matchmaking configuration.
    */
  @js.native
  trait MatchmakingConfiguration extends js.Object {
    var AcceptanceRequired: js.UndefOr[BooleanModel]
    var AcceptanceTimeoutSeconds: js.UndefOr[MatchmakingAcceptanceTimeoutInteger]
    var AdditionalPlayerCount: js.UndefOr[WholeNumber]
    var BackfillMode: js.UndefOr[BackfillMode]
    var ConfigurationArn: js.UndefOr[MatchmakingConfigurationArn]
    var CreationTime: js.UndefOr[Timestamp]
    var CustomEventData: js.UndefOr[CustomEventData]
    var Description: js.UndefOr[NonZeroAndMaxString]
    var FlexMatchMode: js.UndefOr[FlexMatchMode]
    var GameProperties: js.UndefOr[GamePropertyList]
    var GameSessionData: js.UndefOr[GameSessionData]
    var GameSessionQueueArns: js.UndefOr[QueueArnsList]
    var Name: js.UndefOr[MatchmakingIdStringModel]
    var NotificationTarget: js.UndefOr[SnsArnStringModel]
    var RequestTimeoutSeconds: js.UndefOr[MatchmakingRequestTimeoutInteger]
    var RuleSetArn: js.UndefOr[MatchmakingRuleSetArn]
    var RuleSetName: js.UndefOr[MatchmakingIdStringModel]
  }

  object MatchmakingConfiguration {
    @inline
    def apply(
        AcceptanceRequired: js.UndefOr[BooleanModel] = js.undefined,
        AcceptanceTimeoutSeconds: js.UndefOr[MatchmakingAcceptanceTimeoutInteger] = js.undefined,
        AdditionalPlayerCount: js.UndefOr[WholeNumber] = js.undefined,
        BackfillMode: js.UndefOr[BackfillMode] = js.undefined,
        ConfigurationArn: js.UndefOr[MatchmakingConfigurationArn] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        CustomEventData: js.UndefOr[CustomEventData] = js.undefined,
        Description: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        FlexMatchMode: js.UndefOr[FlexMatchMode] = js.undefined,
        GameProperties: js.UndefOr[GamePropertyList] = js.undefined,
        GameSessionData: js.UndefOr[GameSessionData] = js.undefined,
        GameSessionQueueArns: js.UndefOr[QueueArnsList] = js.undefined,
        Name: js.UndefOr[MatchmakingIdStringModel] = js.undefined,
        NotificationTarget: js.UndefOr[SnsArnStringModel] = js.undefined,
        RequestTimeoutSeconds: js.UndefOr[MatchmakingRequestTimeoutInteger] = js.undefined,
        RuleSetArn: js.UndefOr[MatchmakingRuleSetArn] = js.undefined,
        RuleSetName: js.UndefOr[MatchmakingIdStringModel] = js.undefined
    ): MatchmakingConfiguration = {
      val __obj = js.Dynamic.literal()
      AcceptanceRequired.foreach(__v => __obj.updateDynamic("AcceptanceRequired")(__v.asInstanceOf[js.Any]))
      AcceptanceTimeoutSeconds.foreach(__v => __obj.updateDynamic("AcceptanceTimeoutSeconds")(__v.asInstanceOf[js.Any]))
      AdditionalPlayerCount.foreach(__v => __obj.updateDynamic("AdditionalPlayerCount")(__v.asInstanceOf[js.Any]))
      BackfillMode.foreach(__v => __obj.updateDynamic("BackfillMode")(__v.asInstanceOf[js.Any]))
      ConfigurationArn.foreach(__v => __obj.updateDynamic("ConfigurationArn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      CustomEventData.foreach(__v => __obj.updateDynamic("CustomEventData")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      FlexMatchMode.foreach(__v => __obj.updateDynamic("FlexMatchMode")(__v.asInstanceOf[js.Any]))
      GameProperties.foreach(__v => __obj.updateDynamic("GameProperties")(__v.asInstanceOf[js.Any]))
      GameSessionData.foreach(__v => __obj.updateDynamic("GameSessionData")(__v.asInstanceOf[js.Any]))
      GameSessionQueueArns.foreach(__v => __obj.updateDynamic("GameSessionQueueArns")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NotificationTarget.foreach(__v => __obj.updateDynamic("NotificationTarget")(__v.asInstanceOf[js.Any]))
      RequestTimeoutSeconds.foreach(__v => __obj.updateDynamic("RequestTimeoutSeconds")(__v.asInstanceOf[js.Any]))
      RuleSetArn.foreach(__v => __obj.updateDynamic("RuleSetArn")(__v.asInstanceOf[js.Any]))
      RuleSetName.foreach(__v => __obj.updateDynamic("RuleSetName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MatchmakingConfiguration]
    }
  }

  @js.native
  sealed trait MatchmakingConfigurationStatus extends js.Any
  object MatchmakingConfigurationStatus {
    val CANCELLED = "CANCELLED".asInstanceOf[MatchmakingConfigurationStatus]
    val COMPLETED = "COMPLETED".asInstanceOf[MatchmakingConfigurationStatus]
    val FAILED = "FAILED".asInstanceOf[MatchmakingConfigurationStatus]
    val PLACING = "PLACING".asInstanceOf[MatchmakingConfigurationStatus]
    val QUEUED = "QUEUED".asInstanceOf[MatchmakingConfigurationStatus]
    val REQUIRES_ACCEPTANCE = "REQUIRES_ACCEPTANCE".asInstanceOf[MatchmakingConfigurationStatus]
    val SEARCHING = "SEARCHING".asInstanceOf[MatchmakingConfigurationStatus]
    val TIMED_OUT = "TIMED_OUT".asInstanceOf[MatchmakingConfigurationStatus]

    @inline def values = js.Array(CANCELLED, COMPLETED, FAILED, PLACING, QUEUED, REQUIRES_ACCEPTANCE, SEARCHING, TIMED_OUT)
  }

  /** Set of rule statements, used with FlexMatch, that determine how to build your player matches. Each rule set describes a type of group to be created and defines the parameters for acceptable player matches. Rule sets are used in <a>MatchmakingConfiguration</a> objects.
    * A rule set may define the following elements for a match. For detailed information and examples showing how to construct a rule set, see [[https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-rulesets.html|Build a FlexMatch Rule Set]].
    * * Teams -- Required. A rule set must define one or multiple teams for the match and set minimum and maximum team sizes. For example, a rule set might describe a 4x4 match that requires all eight slots to be filled.
    * * Player attributes -- Optional. These attributes specify a set of player characteristics to evaluate when looking for a match. Matchmaking requests that use a rule set with player attributes must provide the corresponding attribute values. For example, an attribute might specify a player's skill or level.
    * * Rules -- Optional. Rules define how to evaluate potential players for a match based on player attributes. A rule might specify minimum requirements for individual players, teams, or entire matches. For example, a rule might require each player to meet a certain skill level, each team to have at least one player in a certain role, or the match to have a minimum average skill level. or may describe an entire group--such as all teams must be evenly matched or have at least one player in a certain role.
    * * Expansions -- Optional. Expansions allow you to relax the rules after a period of time when no acceptable matches are found. This feature lets you balance getting players into games in a reasonable amount of time instead of making them wait indefinitely for the best possible match. For example, you might use an expansion to increase the maximum skill variance between players after 30 seconds.
    */
  @js.native
  trait MatchmakingRuleSet extends js.Object {
    var RuleSetBody: RuleSetBody
    var CreationTime: js.UndefOr[Timestamp]
    var RuleSetArn: js.UndefOr[MatchmakingRuleSetArn]
    var RuleSetName: js.UndefOr[MatchmakingIdStringModel]
  }

  object MatchmakingRuleSet {
    @inline
    def apply(
        RuleSetBody: RuleSetBody,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        RuleSetArn: js.UndefOr[MatchmakingRuleSetArn] = js.undefined,
        RuleSetName: js.UndefOr[MatchmakingIdStringModel] = js.undefined
    ): MatchmakingRuleSet = {
      val __obj = js.Dynamic.literal(
        "RuleSetBody" -> RuleSetBody.asInstanceOf[js.Any]
      )

      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      RuleSetArn.foreach(__v => __obj.updateDynamic("RuleSetArn")(__v.asInstanceOf[js.Any]))
      RuleSetName.foreach(__v => __obj.updateDynamic("RuleSetName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MatchmakingRuleSet]
    }
  }

  /** Ticket generated to track the progress of a matchmaking request. Each ticket is uniquely identified by a ticket ID, supplied by the requester, when creating a matchmaking request with <a>StartMatchmaking</a>. Tickets can be retrieved by calling <a>DescribeMatchmaking</a> with the ticket ID.
    */
  @js.native
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

  object MatchmakingTicket {
    @inline
    def apply(
        ConfigurationArn: js.UndefOr[MatchmakingConfigurationArn] = js.undefined,
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
      val __obj = js.Dynamic.literal()
      ConfigurationArn.foreach(__v => __obj.updateDynamic("ConfigurationArn")(__v.asInstanceOf[js.Any]))
      ConfigurationName.foreach(__v => __obj.updateDynamic("ConfigurationName")(__v.asInstanceOf[js.Any]))
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      EstimatedWaitTime.foreach(__v => __obj.updateDynamic("EstimatedWaitTime")(__v.asInstanceOf[js.Any]))
      GameSessionConnectionInfo.foreach(__v => __obj.updateDynamic("GameSessionConnectionInfo")(__v.asInstanceOf[js.Any]))
      Players.foreach(__v => __obj.updateDynamic("Players")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StatusMessage.foreach(__v => __obj.updateDynamic("StatusMessage")(__v.asInstanceOf[js.Any]))
      StatusReason.foreach(__v => __obj.updateDynamic("StatusReason")(__v.asInstanceOf[js.Any]))
      TicketId.foreach(__v => __obj.updateDynamic("TicketId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MatchmakingTicket]
    }
  }

  @js.native
  sealed trait MetricName extends js.Any
  object MetricName {
    val ActivatingGameSessions = "ActivatingGameSessions".asInstanceOf[MetricName]
    val ActiveGameSessions = "ActiveGameSessions".asInstanceOf[MetricName]
    val ActiveInstances = "ActiveInstances".asInstanceOf[MetricName]
    val AvailableGameSessions = "AvailableGameSessions".asInstanceOf[MetricName]
    val AvailablePlayerSessions = "AvailablePlayerSessions".asInstanceOf[MetricName]
    val CurrentPlayerSessions = "CurrentPlayerSessions".asInstanceOf[MetricName]
    val IdleInstances = "IdleInstances".asInstanceOf[MetricName]
    val PercentAvailableGameSessions = "PercentAvailableGameSessions".asInstanceOf[MetricName]
    val PercentIdleInstances = "PercentIdleInstances".asInstanceOf[MetricName]
    val QueueDepth = "QueueDepth".asInstanceOf[MetricName]
    val WaitTime = "WaitTime".asInstanceOf[MetricName]

    @inline def values = js.Array(
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

  @js.native
  sealed trait OperatingSystem extends js.Any
  object OperatingSystem {
    val WINDOWS_2012 = "WINDOWS_2012".asInstanceOf[OperatingSystem]
    val AMAZON_LINUX = "AMAZON_LINUX".asInstanceOf[OperatingSystem]
    val AMAZON_LINUX_2 = "AMAZON_LINUX_2".asInstanceOf[OperatingSystem]

    @inline def values = js.Array(WINDOWS_2012, AMAZON_LINUX, AMAZON_LINUX_2)
  }

  /** Information about a player session that was created as part of a <a>StartGameSessionPlacement</a> request. This object contains only the player ID and player session ID. To retrieve full details on a player session, call <a>DescribePlayerSessions</a> with the player session ID.
    * * <a>CreatePlayerSession</a>
    * * <a>CreatePlayerSessions</a>
    * * <a>DescribePlayerSessions</a>
    * * Game session placements
    * <li> <a>StartGameSessionPlacement</a>
    * * <a>DescribeGameSessionPlacement</a>
    * * <a>StopGameSessionPlacement</a>
    * </li>
    */
  @js.native
  trait PlacedPlayerSession extends js.Object {
    var PlayerId: js.UndefOr[NonZeroAndMaxString]
    var PlayerSessionId: js.UndefOr[PlayerSessionId]
  }

  object PlacedPlayerSession {
    @inline
    def apply(
        PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        PlayerSessionId: js.UndefOr[PlayerSessionId] = js.undefined
    ): PlacedPlayerSession = {
      val __obj = js.Dynamic.literal()
      PlayerId.foreach(__v => __obj.updateDynamic("PlayerId")(__v.asInstanceOf[js.Any]))
      PlayerSessionId.foreach(__v => __obj.updateDynamic("PlayerSessionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PlacedPlayerSession]
    }
  }

  /** Represents a player in matchmaking. When starting a matchmaking request, a player has a player ID, attributes, and may have latency data. Team information is added after a match has been successfully completed.
    */
  @js.native
  trait Player extends js.Object {
    var LatencyInMs: js.UndefOr[LatencyMap]
    var PlayerAttributes: js.UndefOr[PlayerAttributeMap]
    var PlayerId: js.UndefOr[NonZeroAndMaxString]
    var Team: js.UndefOr[NonZeroAndMaxString]
  }

  object Player {
    @inline
    def apply(
        LatencyInMs: js.UndefOr[LatencyMap] = js.undefined,
        PlayerAttributes: js.UndefOr[PlayerAttributeMap] = js.undefined,
        PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        Team: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): Player = {
      val __obj = js.Dynamic.literal()
      LatencyInMs.foreach(__v => __obj.updateDynamic("LatencyInMs")(__v.asInstanceOf[js.Any]))
      PlayerAttributes.foreach(__v => __obj.updateDynamic("PlayerAttributes")(__v.asInstanceOf[js.Any]))
      PlayerId.foreach(__v => __obj.updateDynamic("PlayerId")(__v.asInstanceOf[js.Any]))
      Team.foreach(__v => __obj.updateDynamic("Team")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Player]
    }
  }

  /** Regional latency information for a player, used when requesting a new game session with <a>StartGameSessionPlacement</a>. This value indicates the amount of time lag that exists when the player is connected to a fleet in the specified Region. The relative difference between a player's latency values for multiple Regions are used to determine which fleets are best suited to place a new game session for the player.
    */
  @js.native
  trait PlayerLatency extends js.Object {
    var LatencyInMilliseconds: js.UndefOr[Float]
    var PlayerId: js.UndefOr[NonZeroAndMaxString]
    var RegionIdentifier: js.UndefOr[NonZeroAndMaxString]
  }

  object PlayerLatency {
    @inline
    def apply(
        LatencyInMilliseconds: js.UndefOr[Float] = js.undefined,
        PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        RegionIdentifier: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): PlayerLatency = {
      val __obj = js.Dynamic.literal()
      LatencyInMilliseconds.foreach(__v => __obj.updateDynamic("LatencyInMilliseconds")(__v.asInstanceOf[js.Any]))
      PlayerId.foreach(__v => __obj.updateDynamic("PlayerId")(__v.asInstanceOf[js.Any]))
      RegionIdentifier.foreach(__v => __obj.updateDynamic("RegionIdentifier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PlayerLatency]
    }
  }

  /** Queue setting that determines the highest latency allowed for individual players when placing a game session. When a latency policy is in force, a game session cannot be placed with any fleet in a Region where a player reports latency higher than the cap. Latency policies are only enforced when the placement request contains player latency information.
    * * <a>CreateGameSessionQueue</a>
    * * <a>DescribeGameSessionQueues</a>
    * * <a>UpdateGameSessionQueue</a>
    * * <a>DeleteGameSessionQueue</a>
    */
  @js.native
  trait PlayerLatencyPolicy extends js.Object {
    var MaximumIndividualPlayerLatencyMilliseconds: js.UndefOr[WholeNumber]
    var PolicyDurationSeconds: js.UndefOr[WholeNumber]
  }

  object PlayerLatencyPolicy {
    @inline
    def apply(
        MaximumIndividualPlayerLatencyMilliseconds: js.UndefOr[WholeNumber] = js.undefined,
        PolicyDurationSeconds: js.UndefOr[WholeNumber] = js.undefined
    ): PlayerLatencyPolicy = {
      val __obj = js.Dynamic.literal()
      MaximumIndividualPlayerLatencyMilliseconds.foreach(__v => __obj.updateDynamic("MaximumIndividualPlayerLatencyMilliseconds")(__v.asInstanceOf[js.Any]))
      PolicyDurationSeconds.foreach(__v => __obj.updateDynamic("PolicyDurationSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PlayerLatencyPolicy]
    }
  }

  /** Properties describing a player session. Player session objects are created either by creating a player session for a specific game session, or as part of a game session placement. A player session represents either a player reservation for a game session (status <code>RESERVED</code>) or actual player activity in a game session (status <code>ACTIVE</code>). A player session object (including player data) is automatically passed to a game session when the player connects to the game session and is validated.
    * When a player disconnects, the player session status changes to <code>COMPLETED</code>. Once the session ends, the player session object is retained for 30 days and then removed.
    * * <a>CreatePlayerSession</a>
    * * <a>CreatePlayerSessions</a>
    * * <a>DescribePlayerSessions</a>
    * * Game session placements
    * <li> <a>StartGameSessionPlacement</a>
    * * <a>DescribeGameSessionPlacement</a>
    * * <a>StopGameSessionPlacement</a>
    * </li>
    */
  @js.native
  trait PlayerSession extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var DnsName: js.UndefOr[DnsName]
    var FleetArn: js.UndefOr[FleetArn]
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
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        DnsName: js.UndefOr[DnsName] = js.undefined,
        FleetArn: js.UndefOr[FleetArn] = js.undefined,
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
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DnsName.foreach(__v => __obj.updateDynamic("DnsName")(__v.asInstanceOf[js.Any]))
      FleetArn.foreach(__v => __obj.updateDynamic("FleetArn")(__v.asInstanceOf[js.Any]))
      FleetId.foreach(__v => __obj.updateDynamic("FleetId")(__v.asInstanceOf[js.Any]))
      GameSessionId.foreach(__v => __obj.updateDynamic("GameSessionId")(__v.asInstanceOf[js.Any]))
      IpAddress.foreach(__v => __obj.updateDynamic("IpAddress")(__v.asInstanceOf[js.Any]))
      PlayerData.foreach(__v => __obj.updateDynamic("PlayerData")(__v.asInstanceOf[js.Any]))
      PlayerId.foreach(__v => __obj.updateDynamic("PlayerId")(__v.asInstanceOf[js.Any]))
      PlayerSessionId.foreach(__v => __obj.updateDynamic("PlayerSessionId")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TerminationTime.foreach(__v => __obj.updateDynamic("TerminationTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PlayerSession]
    }
  }

  @js.native
  sealed trait PlayerSessionCreationPolicy extends js.Any
  object PlayerSessionCreationPolicy {
    val ACCEPT_ALL = "ACCEPT_ALL".asInstanceOf[PlayerSessionCreationPolicy]
    val DENY_ALL = "DENY_ALL".asInstanceOf[PlayerSessionCreationPolicy]

    @inline def values = js.Array(ACCEPT_ALL, DENY_ALL)
  }

  @js.native
  sealed trait PlayerSessionStatus extends js.Any
  object PlayerSessionStatus {
    val RESERVED = "RESERVED".asInstanceOf[PlayerSessionStatus]
    val ACTIVE = "ACTIVE".asInstanceOf[PlayerSessionStatus]
    val COMPLETED = "COMPLETED".asInstanceOf[PlayerSessionStatus]
    val TIMEDOUT = "TIMEDOUT".asInstanceOf[PlayerSessionStatus]

    @inline def values = js.Array(RESERVED, ACTIVE, COMPLETED, TIMEDOUT)
  }

  @js.native
  sealed trait PolicyType extends js.Any
  object PolicyType {
    val RuleBased = "RuleBased".asInstanceOf[PolicyType]
    val TargetBased = "TargetBased".asInstanceOf[PolicyType]

    @inline def values = js.Array(RuleBased, TargetBased)
  }

  @js.native
  sealed trait ProtectionPolicy extends js.Any
  object ProtectionPolicy {
    val NoProtection = "NoProtection".asInstanceOf[ProtectionPolicy]
    val FullProtection = "FullProtection".asInstanceOf[ProtectionPolicy]

    @inline def values = js.Array(NoProtection, FullProtection)
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait PutScalingPolicyInput extends js.Object {
    var FleetId: FleetIdOrArn
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
    @inline
    def apply(
        FleetId: FleetIdOrArn,
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
      val __obj = js.Dynamic.literal(
        "FleetId" -> FleetId.asInstanceOf[js.Any],
        "MetricName" -> MetricName.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ComparisonOperator.foreach(__v => __obj.updateDynamic("ComparisonOperator")(__v.asInstanceOf[js.Any]))
      EvaluationPeriods.foreach(__v => __obj.updateDynamic("EvaluationPeriods")(__v.asInstanceOf[js.Any]))
      PolicyType.foreach(__v => __obj.updateDynamic("PolicyType")(__v.asInstanceOf[js.Any]))
      ScalingAdjustment.foreach(__v => __obj.updateDynamic("ScalingAdjustment")(__v.asInstanceOf[js.Any]))
      ScalingAdjustmentType.foreach(__v => __obj.updateDynamic("ScalingAdjustmentType")(__v.asInstanceOf[js.Any]))
      TargetConfiguration.foreach(__v => __obj.updateDynamic("TargetConfiguration")(__v.asInstanceOf[js.Any]))
      Threshold.foreach(__v => __obj.updateDynamic("Threshold")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutScalingPolicyInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait PutScalingPolicyOutput extends js.Object {
    var Name: js.UndefOr[NonZeroAndMaxString]
  }

  object PutScalingPolicyOutput {
    @inline
    def apply(
        Name: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): PutScalingPolicyOutput = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutScalingPolicyOutput]
    }
  }

  @js.native
  trait RegisterGameServerInput extends js.Object {
    var GameServerGroupName: GameServerGroupNameOrArn
    var GameServerId: GameServerId
    var InstanceId: GameServerInstanceId
    var ConnectionInfo: js.UndefOr[GameServerConnectionInfo]
    var GameServerData: js.UndefOr[GameServerData]
  }

  object RegisterGameServerInput {
    @inline
    def apply(
        GameServerGroupName: GameServerGroupNameOrArn,
        GameServerId: GameServerId,
        InstanceId: GameServerInstanceId,
        ConnectionInfo: js.UndefOr[GameServerConnectionInfo] = js.undefined,
        GameServerData: js.UndefOr[GameServerData] = js.undefined
    ): RegisterGameServerInput = {
      val __obj = js.Dynamic.literal(
        "GameServerGroupName" -> GameServerGroupName.asInstanceOf[js.Any],
        "GameServerId" -> GameServerId.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any]
      )

      ConnectionInfo.foreach(__v => __obj.updateDynamic("ConnectionInfo")(__v.asInstanceOf[js.Any]))
      GameServerData.foreach(__v => __obj.updateDynamic("GameServerData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterGameServerInput]
    }
  }

  @js.native
  trait RegisterGameServerOutput extends js.Object {
    var GameServer: js.UndefOr[GameServer]
  }

  object RegisterGameServerOutput {
    @inline
    def apply(
        GameServer: js.UndefOr[GameServer] = js.undefined
    ): RegisterGameServerOutput = {
      val __obj = js.Dynamic.literal()
      GameServer.foreach(__v => __obj.updateDynamic("GameServer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterGameServerOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait RequestUploadCredentialsInput extends js.Object {
    var BuildId: BuildIdOrArn
  }

  object RequestUploadCredentialsInput {
    @inline
    def apply(
        BuildId: BuildIdOrArn
    ): RequestUploadCredentialsInput = {
      val __obj = js.Dynamic.literal(
        "BuildId" -> BuildId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RequestUploadCredentialsInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait RequestUploadCredentialsOutput extends js.Object {
    var StorageLocation: js.UndefOr[S3Location]
    var UploadCredentials: js.UndefOr[AwsCredentials]
  }

  object RequestUploadCredentialsOutput {
    @inline
    def apply(
        StorageLocation: js.UndefOr[S3Location] = js.undefined,
        UploadCredentials: js.UndefOr[AwsCredentials] = js.undefined
    ): RequestUploadCredentialsOutput = {
      val __obj = js.Dynamic.literal()
      StorageLocation.foreach(__v => __obj.updateDynamic("StorageLocation")(__v.asInstanceOf[js.Any]))
      UploadCredentials.foreach(__v => __obj.updateDynamic("UploadCredentials")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RequestUploadCredentialsOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait ResolveAliasInput extends js.Object {
    var AliasId: AliasIdOrArn
  }

  object ResolveAliasInput {
    @inline
    def apply(
        AliasId: AliasIdOrArn
    ): ResolveAliasInput = {
      val __obj = js.Dynamic.literal(
        "AliasId" -> AliasId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ResolveAliasInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait ResolveAliasOutput extends js.Object {
    var FleetArn: js.UndefOr[FleetArn]
    var FleetId: js.UndefOr[FleetId]
  }

  object ResolveAliasOutput {
    @inline
    def apply(
        FleetArn: js.UndefOr[FleetArn] = js.undefined,
        FleetId: js.UndefOr[FleetId] = js.undefined
    ): ResolveAliasOutput = {
      val __obj = js.Dynamic.literal()
      FleetArn.foreach(__v => __obj.updateDynamic("FleetArn")(__v.asInstanceOf[js.Any]))
      FleetId.foreach(__v => __obj.updateDynamic("FleetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResolveAliasOutput]
    }
  }

  /** A policy that limits the number of game sessions a player can create on the same fleet. This optional policy gives game owners control over how players can consume available game server resources. A resource creation policy makes the following statement: "An individual player can create a maximum number of new game sessions within a specified time period".
    * The policy is evaluated when a player tries to create a new game session. For example: Assume you have a policy of 10 new game sessions and a time period of 60 minutes. On receiving a <code>CreateGameSession</code> request, Amazon GameLift checks that the player (identified by <code>CreatorId</code>) has created fewer than 10 game sessions in the past 60 minutes.
    */
  @js.native
  trait ResourceCreationLimitPolicy extends js.Object {
    var NewGameSessionsPerCreator: js.UndefOr[WholeNumber]
    var PolicyPeriodInMinutes: js.UndefOr[WholeNumber]
  }

  object ResourceCreationLimitPolicy {
    @inline
    def apply(
        NewGameSessionsPerCreator: js.UndefOr[WholeNumber] = js.undefined,
        PolicyPeriodInMinutes: js.UndefOr[WholeNumber] = js.undefined
    ): ResourceCreationLimitPolicy = {
      val __obj = js.Dynamic.literal()
      NewGameSessionsPerCreator.foreach(__v => __obj.updateDynamic("NewGameSessionsPerCreator")(__v.asInstanceOf[js.Any]))
      PolicyPeriodInMinutes.foreach(__v => __obj.updateDynamic("PolicyPeriodInMinutes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceCreationLimitPolicy]
    }
  }

  @js.native
  trait ResumeGameServerGroupInput extends js.Object {
    var GameServerGroupName: GameServerGroupNameOrArn
    var ResumeActions: GameServerGroupActions
  }

  object ResumeGameServerGroupInput {
    @inline
    def apply(
        GameServerGroupName: GameServerGroupNameOrArn,
        ResumeActions: GameServerGroupActions
    ): ResumeGameServerGroupInput = {
      val __obj = js.Dynamic.literal(
        "GameServerGroupName" -> GameServerGroupName.asInstanceOf[js.Any],
        "ResumeActions" -> ResumeActions.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ResumeGameServerGroupInput]
    }
  }

  @js.native
  trait ResumeGameServerGroupOutput extends js.Object {
    var GameServerGroup: js.UndefOr[GameServerGroup]
  }

  object ResumeGameServerGroupOutput {
    @inline
    def apply(
        GameServerGroup: js.UndefOr[GameServerGroup] = js.undefined
    ): ResumeGameServerGroupOutput = {
      val __obj = js.Dynamic.literal()
      GameServerGroup.foreach(__v => __obj.updateDynamic("GameServerGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResumeGameServerGroupOutput]
    }
  }

  /** The routing configuration for a fleet alias.
    * * <a>CreateAlias</a>
    * * <a>ListAliases</a>
    * * <a>DescribeAlias</a>
    * * <a>UpdateAlias</a>
    * * <a>DeleteAlias</a>
    * * <a>ResolveAlias</a>
    */
  @js.native
  trait RoutingStrategy extends js.Object {
    var FleetId: js.UndefOr[FleetId]
    var Message: js.UndefOr[FreeText]
    var Type: js.UndefOr[RoutingStrategyType]
  }

  object RoutingStrategy {
    @inline
    def apply(
        FleetId: js.UndefOr[FleetId] = js.undefined,
        Message: js.UndefOr[FreeText] = js.undefined,
        Type: js.UndefOr[RoutingStrategyType] = js.undefined
    ): RoutingStrategy = {
      val __obj = js.Dynamic.literal()
      FleetId.foreach(__v => __obj.updateDynamic("FleetId")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RoutingStrategy]
    }
  }

  @js.native
  sealed trait RoutingStrategyType extends js.Any
  object RoutingStrategyType {
    val SIMPLE = "SIMPLE".asInstanceOf[RoutingStrategyType]
    val TERMINAL = "TERMINAL".asInstanceOf[RoutingStrategyType]

    @inline def values = js.Array(SIMPLE, TERMINAL)
  }

  /** A collection of server process configurations that describe what processes to run on each instance in a fleet. Server processes run either a custom game build executable or a Realtime Servers script. Each instance in the fleet starts the specified server processes and continues to start new processes as existing processes end. Each instance regularly checks for an updated runtime configuration.
    * The runtime configuration enables the instances in a fleet to run multiple processes simultaneously. Learn more about [[https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-multiprocess.html| Running Multiple Processes on a Fleet ]].
    * A Amazon GameLift instance is limited to 50 processes running simultaneously. To calculate the total number of processes in a runtime configuration, add the values of the <code>ConcurrentExecutions</code> parameter for each <a>ServerProcess</a> object.
    * * <a>CreateFleet</a>
    * * <a>ListFleets</a>
    * * <a>DeleteFleet</a>
    * * <a>DescribeFleetAttributes</a>
    * * <a>UpdateFleetAttributes</a>
    * * <a>StartFleetActions</a> or <a>StopFleetActions</a>
    */
  @js.native
  trait RuntimeConfiguration extends js.Object {
    var GameSessionActivationTimeoutSeconds: js.UndefOr[GameSessionActivationTimeoutSeconds]
    var MaxConcurrentGameSessionActivations: js.UndefOr[MaxConcurrentGameSessionActivations]
    var ServerProcesses: js.UndefOr[ServerProcessList]
  }

  object RuntimeConfiguration {
    @inline
    def apply(
        GameSessionActivationTimeoutSeconds: js.UndefOr[GameSessionActivationTimeoutSeconds] = js.undefined,
        MaxConcurrentGameSessionActivations: js.UndefOr[MaxConcurrentGameSessionActivations] = js.undefined,
        ServerProcesses: js.UndefOr[ServerProcessList] = js.undefined
    ): RuntimeConfiguration = {
      val __obj = js.Dynamic.literal()
      GameSessionActivationTimeoutSeconds.foreach(__v => __obj.updateDynamic("GameSessionActivationTimeoutSeconds")(__v.asInstanceOf[js.Any]))
      MaxConcurrentGameSessionActivations.foreach(__v => __obj.updateDynamic("MaxConcurrentGameSessionActivations")(__v.asInstanceOf[js.Any]))
      ServerProcesses.foreach(__v => __obj.updateDynamic("ServerProcesses")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RuntimeConfiguration]
    }
  }

  /** The location in S3 where build or script files are stored for access by Amazon GameLift. This location is specified in <a>CreateBuild</a>, <a>CreateScript</a>, and <a>UpdateScript</a> requests.
    */
  @js.native
  trait S3Location extends js.Object {
    var Bucket: js.UndefOr[NonEmptyString]
    var Key: js.UndefOr[NonEmptyString]
    var ObjectVersion: js.UndefOr[NonEmptyString]
    var RoleArn: js.UndefOr[NonEmptyString]
  }

  object S3Location {
    @inline
    def apply(
        Bucket: js.UndefOr[NonEmptyString] = js.undefined,
        Key: js.UndefOr[NonEmptyString] = js.undefined,
        ObjectVersion: js.UndefOr[NonEmptyString] = js.undefined,
        RoleArn: js.UndefOr[NonEmptyString] = js.undefined
    ): S3Location = {
      val __obj = js.Dynamic.literal()
      Bucket.foreach(__v => __obj.updateDynamic("Bucket")(__v.asInstanceOf[js.Any]))
      Key.foreach(__v => __obj.updateDynamic("Key")(__v.asInstanceOf[js.Any]))
      ObjectVersion.foreach(__v => __obj.updateDynamic("ObjectVersion")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Location]
    }
  }

  @js.native
  sealed trait ScalingAdjustmentType extends js.Any
  object ScalingAdjustmentType {
    val ChangeInCapacity = "ChangeInCapacity".asInstanceOf[ScalingAdjustmentType]
    val ExactCapacity = "ExactCapacity".asInstanceOf[ScalingAdjustmentType]
    val PercentChangeInCapacity = "PercentChangeInCapacity".asInstanceOf[ScalingAdjustmentType]

    @inline def values = js.Array(ChangeInCapacity, ExactCapacity, PercentChangeInCapacity)
  }

  /** Rule that controls how a fleet is scaled. Scaling policies are uniquely identified by the combination of name and fleet ID.
    * * <a>DescribeFleetCapacity</a>
    * * <a>UpdateFleetCapacity</a>
    * * <a>DescribeEC2InstanceLimits</a>
    * * Manage scaling policies:
    * <li> <a>PutScalingPolicy</a> (auto-scaling)
    * * <a>DescribeScalingPolicies</a> (auto-scaling)
    * * <a>DeleteScalingPolicy</a> (auto-scaling)
    * </li> * Manage fleet actions:
    * <li> <a>StartFleetActions</a>
    * * <a>StopFleetActions</a>
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
    @inline
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
      val __obj = js.Dynamic.literal()
      ComparisonOperator.foreach(__v => __obj.updateDynamic("ComparisonOperator")(__v.asInstanceOf[js.Any]))
      EvaluationPeriods.foreach(__v => __obj.updateDynamic("EvaluationPeriods")(__v.asInstanceOf[js.Any]))
      FleetId.foreach(__v => __obj.updateDynamic("FleetId")(__v.asInstanceOf[js.Any]))
      MetricName.foreach(__v => __obj.updateDynamic("MetricName")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PolicyType.foreach(__v => __obj.updateDynamic("PolicyType")(__v.asInstanceOf[js.Any]))
      ScalingAdjustment.foreach(__v => __obj.updateDynamic("ScalingAdjustment")(__v.asInstanceOf[js.Any]))
      ScalingAdjustmentType.foreach(__v => __obj.updateDynamic("ScalingAdjustmentType")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TargetConfiguration.foreach(__v => __obj.updateDynamic("TargetConfiguration")(__v.asInstanceOf[js.Any]))
      Threshold.foreach(__v => __obj.updateDynamic("Threshold")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScalingPolicy]
    }
  }

  @js.native
  sealed trait ScalingStatusType extends js.Any
  object ScalingStatusType {
    val ACTIVE = "ACTIVE".asInstanceOf[ScalingStatusType]
    val UPDATE_REQUESTED = "UPDATE_REQUESTED".asInstanceOf[ScalingStatusType]
    val UPDATING = "UPDATING".asInstanceOf[ScalingStatusType]
    val DELETE_REQUESTED = "DELETE_REQUESTED".asInstanceOf[ScalingStatusType]
    val DELETING = "DELETING".asInstanceOf[ScalingStatusType]
    val DELETED = "DELETED".asInstanceOf[ScalingStatusType]
    val ERROR = "ERROR".asInstanceOf[ScalingStatusType]

    @inline def values = js.Array(ACTIVE, UPDATE_REQUESTED, UPDATING, DELETE_REQUESTED, DELETING, DELETED, ERROR)
  }

  /** Properties describing a Realtime script.
    * ```Related operations```
    * * <a>CreateScript</a>
    * * <a>ListScripts</a>
    * * <a>DescribeScript</a>
    * * <a>UpdateScript</a>
    * * <a>DeleteScript</a>
    */
  @js.native
  trait Script extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[NonZeroAndMaxString]
    var ScriptArn: js.UndefOr[ScriptArn]
    var ScriptId: js.UndefOr[ScriptId]
    var SizeOnDisk: js.UndefOr[PositiveLong]
    var StorageLocation: js.UndefOr[S3Location]
    var Version: js.UndefOr[NonZeroAndMaxString]
  }

  object Script {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        ScriptArn: js.UndefOr[ScriptArn] = js.undefined,
        ScriptId: js.UndefOr[ScriptId] = js.undefined,
        SizeOnDisk: js.UndefOr[PositiveLong] = js.undefined,
        StorageLocation: js.UndefOr[S3Location] = js.undefined,
        Version: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): Script = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ScriptArn.foreach(__v => __obj.updateDynamic("ScriptArn")(__v.asInstanceOf[js.Any]))
      ScriptId.foreach(__v => __obj.updateDynamic("ScriptId")(__v.asInstanceOf[js.Any]))
      SizeOnDisk.foreach(__v => __obj.updateDynamic("SizeOnDisk")(__v.asInstanceOf[js.Any]))
      StorageLocation.foreach(__v => __obj.updateDynamic("StorageLocation")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Script]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait SearchGameSessionsInput extends js.Object {
    var AliasId: js.UndefOr[AliasIdOrArn]
    var FilterExpression: js.UndefOr[NonZeroAndMaxString]
    var FleetId: js.UndefOr[FleetIdOrArn]
    var Limit: js.UndefOr[PositiveInteger]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
    var SortExpression: js.UndefOr[NonZeroAndMaxString]
  }

  object SearchGameSessionsInput {
    @inline
    def apply(
        AliasId: js.UndefOr[AliasIdOrArn] = js.undefined,
        FilterExpression: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        FleetId: js.UndefOr[FleetIdOrArn] = js.undefined,
        Limit: js.UndefOr[PositiveInteger] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        SortExpression: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): SearchGameSessionsInput = {
      val __obj = js.Dynamic.literal()
      AliasId.foreach(__v => __obj.updateDynamic("AliasId")(__v.asInstanceOf[js.Any]))
      FilterExpression.foreach(__v => __obj.updateDynamic("FilterExpression")(__v.asInstanceOf[js.Any]))
      FleetId.foreach(__v => __obj.updateDynamic("FleetId")(__v.asInstanceOf[js.Any]))
      Limit.foreach(__v => __obj.updateDynamic("Limit")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SortExpression.foreach(__v => __obj.updateDynamic("SortExpression")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchGameSessionsInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait SearchGameSessionsOutput extends js.Object {
    var GameSessions: js.UndefOr[GameSessionList]
    var NextToken: js.UndefOr[NonZeroAndMaxString]
  }

  object SearchGameSessionsOutput {
    @inline
    def apply(
        GameSessions: js.UndefOr[GameSessionList] = js.undefined,
        NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): SearchGameSessionsOutput = {
      val __obj = js.Dynamic.literal()
      GameSessions.foreach(__v => __obj.updateDynamic("GameSessions")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchGameSessionsOutput]
    }
  }

  /** A set of instructions for launching server processes on each instance in a fleet. Server processes run either a custom game build executable or a Realtime Servers script. Each instruction set identifies the location of the custom game build executable or Realtime launch script, optional launch parameters, and the number of server processes with this configuration to maintain concurrently on the instance. Server process configurations make up a fleet's <code> <a>RuntimeConfiguration</a> </code>.
    */
  @js.native
  trait ServerProcess extends js.Object {
    var ConcurrentExecutions: PositiveInteger
    var LaunchPath: NonZeroAndMaxString
    var Parameters: js.UndefOr[NonZeroAndMaxString]
  }

  object ServerProcess {
    @inline
    def apply(
        ConcurrentExecutions: PositiveInteger,
        LaunchPath: NonZeroAndMaxString,
        Parameters: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): ServerProcess = {
      val __obj = js.Dynamic.literal(
        "ConcurrentExecutions" -> ConcurrentExecutions.asInstanceOf[js.Any],
        "LaunchPath" -> LaunchPath.asInstanceOf[js.Any]
      )

      Parameters.foreach(__v => __obj.updateDynamic("Parameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServerProcess]
    }
  }

  @js.native
  sealed trait SortOrder extends js.Any
  object SortOrder {
    val ASCENDING = "ASCENDING".asInstanceOf[SortOrder]
    val DESCENDING = "DESCENDING".asInstanceOf[SortOrder]

    @inline def values = js.Array(ASCENDING, DESCENDING)
  }

  @js.native
  trait StartFleetActionsInput extends js.Object {
    var Actions: FleetActionList
    var FleetId: FleetIdOrArn
  }

  object StartFleetActionsInput {
    @inline
    def apply(
        Actions: FleetActionList,
        FleetId: FleetIdOrArn
    ): StartFleetActionsInput = {
      val __obj = js.Dynamic.literal(
        "Actions" -> Actions.asInstanceOf[js.Any],
        "FleetId" -> FleetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartFleetActionsInput]
    }
  }

  @js.native
  trait StartFleetActionsOutput extends js.Object

  object StartFleetActionsOutput {
    @inline
    def apply(): StartFleetActionsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartFleetActionsOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait StartGameSessionPlacementInput extends js.Object {
    var GameSessionQueueName: GameSessionQueueNameOrArn
    var MaximumPlayerSessionCount: WholeNumber
    var PlacementId: IdStringModel
    var DesiredPlayerSessions: js.UndefOr[DesiredPlayerSessionList]
    var GameProperties: js.UndefOr[GamePropertyList]
    var GameSessionData: js.UndefOr[GameSessionData]
    var GameSessionName: js.UndefOr[NonZeroAndMaxString]
    var PlayerLatencies: js.UndefOr[PlayerLatencyList]
  }

  object StartGameSessionPlacementInput {
    @inline
    def apply(
        GameSessionQueueName: GameSessionQueueNameOrArn,
        MaximumPlayerSessionCount: WholeNumber,
        PlacementId: IdStringModel,
        DesiredPlayerSessions: js.UndefOr[DesiredPlayerSessionList] = js.undefined,
        GameProperties: js.UndefOr[GamePropertyList] = js.undefined,
        GameSessionData: js.UndefOr[GameSessionData] = js.undefined,
        GameSessionName: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        PlayerLatencies: js.UndefOr[PlayerLatencyList] = js.undefined
    ): StartGameSessionPlacementInput = {
      val __obj = js.Dynamic.literal(
        "GameSessionQueueName" -> GameSessionQueueName.asInstanceOf[js.Any],
        "MaximumPlayerSessionCount" -> MaximumPlayerSessionCount.asInstanceOf[js.Any],
        "PlacementId" -> PlacementId.asInstanceOf[js.Any]
      )

      DesiredPlayerSessions.foreach(__v => __obj.updateDynamic("DesiredPlayerSessions")(__v.asInstanceOf[js.Any]))
      GameProperties.foreach(__v => __obj.updateDynamic("GameProperties")(__v.asInstanceOf[js.Any]))
      GameSessionData.foreach(__v => __obj.updateDynamic("GameSessionData")(__v.asInstanceOf[js.Any]))
      GameSessionName.foreach(__v => __obj.updateDynamic("GameSessionName")(__v.asInstanceOf[js.Any]))
      PlayerLatencies.foreach(__v => __obj.updateDynamic("PlayerLatencies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartGameSessionPlacementInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait StartGameSessionPlacementOutput extends js.Object {
    var GameSessionPlacement: js.UndefOr[GameSessionPlacement]
  }

  object StartGameSessionPlacementOutput {
    @inline
    def apply(
        GameSessionPlacement: js.UndefOr[GameSessionPlacement] = js.undefined
    ): StartGameSessionPlacementOutput = {
      val __obj = js.Dynamic.literal()
      GameSessionPlacement.foreach(__v => __obj.updateDynamic("GameSessionPlacement")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartGameSessionPlacementOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait StartMatchBackfillInput extends js.Object {
    var ConfigurationName: MatchmakingConfigurationName
    var Players: PlayerList
    var GameSessionArn: js.UndefOr[ArnStringModel]
    var TicketId: js.UndefOr[MatchmakingIdStringModel]
  }

  object StartMatchBackfillInput {
    @inline
    def apply(
        ConfigurationName: MatchmakingConfigurationName,
        Players: PlayerList,
        GameSessionArn: js.UndefOr[ArnStringModel] = js.undefined,
        TicketId: js.UndefOr[MatchmakingIdStringModel] = js.undefined
    ): StartMatchBackfillInput = {
      val __obj = js.Dynamic.literal(
        "ConfigurationName" -> ConfigurationName.asInstanceOf[js.Any],
        "Players" -> Players.asInstanceOf[js.Any]
      )

      GameSessionArn.foreach(__v => __obj.updateDynamic("GameSessionArn")(__v.asInstanceOf[js.Any]))
      TicketId.foreach(__v => __obj.updateDynamic("TicketId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartMatchBackfillInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait StartMatchBackfillOutput extends js.Object {
    var MatchmakingTicket: js.UndefOr[MatchmakingTicket]
  }

  object StartMatchBackfillOutput {
    @inline
    def apply(
        MatchmakingTicket: js.UndefOr[MatchmakingTicket] = js.undefined
    ): StartMatchBackfillOutput = {
      val __obj = js.Dynamic.literal()
      MatchmakingTicket.foreach(__v => __obj.updateDynamic("MatchmakingTicket")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartMatchBackfillOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait StartMatchmakingInput extends js.Object {
    var ConfigurationName: MatchmakingConfigurationName
    var Players: PlayerList
    var TicketId: js.UndefOr[MatchmakingIdStringModel]
  }

  object StartMatchmakingInput {
    @inline
    def apply(
        ConfigurationName: MatchmakingConfigurationName,
        Players: PlayerList,
        TicketId: js.UndefOr[MatchmakingIdStringModel] = js.undefined
    ): StartMatchmakingInput = {
      val __obj = js.Dynamic.literal(
        "ConfigurationName" -> ConfigurationName.asInstanceOf[js.Any],
        "Players" -> Players.asInstanceOf[js.Any]
      )

      TicketId.foreach(__v => __obj.updateDynamic("TicketId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartMatchmakingInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait StartMatchmakingOutput extends js.Object {
    var MatchmakingTicket: js.UndefOr[MatchmakingTicket]
  }

  object StartMatchmakingOutput {
    @inline
    def apply(
        MatchmakingTicket: js.UndefOr[MatchmakingTicket] = js.undefined
    ): StartMatchmakingOutput = {
      val __obj = js.Dynamic.literal()
      MatchmakingTicket.foreach(__v => __obj.updateDynamic("MatchmakingTicket")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartMatchmakingOutput]
    }
  }

  @js.native
  trait StopFleetActionsInput extends js.Object {
    var Actions: FleetActionList
    var FleetId: FleetIdOrArn
  }

  object StopFleetActionsInput {
    @inline
    def apply(
        Actions: FleetActionList,
        FleetId: FleetIdOrArn
    ): StopFleetActionsInput = {
      val __obj = js.Dynamic.literal(
        "Actions" -> Actions.asInstanceOf[js.Any],
        "FleetId" -> FleetId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopFleetActionsInput]
    }
  }

  @js.native
  trait StopFleetActionsOutput extends js.Object

  object StopFleetActionsOutput {
    @inline
    def apply(): StopFleetActionsOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopFleetActionsOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait StopGameSessionPlacementInput extends js.Object {
    var PlacementId: IdStringModel
  }

  object StopGameSessionPlacementInput {
    @inline
    def apply(
        PlacementId: IdStringModel
    ): StopGameSessionPlacementInput = {
      val __obj = js.Dynamic.literal(
        "PlacementId" -> PlacementId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopGameSessionPlacementInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait StopGameSessionPlacementOutput extends js.Object {
    var GameSessionPlacement: js.UndefOr[GameSessionPlacement]
  }

  object StopGameSessionPlacementOutput {
    @inline
    def apply(
        GameSessionPlacement: js.UndefOr[GameSessionPlacement] = js.undefined
    ): StopGameSessionPlacementOutput = {
      val __obj = js.Dynamic.literal()
      GameSessionPlacement.foreach(__v => __obj.updateDynamic("GameSessionPlacement")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StopGameSessionPlacementOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait StopMatchmakingInput extends js.Object {
    var TicketId: MatchmakingIdStringModel
  }

  object StopMatchmakingInput {
    @inline
    def apply(
        TicketId: MatchmakingIdStringModel
    ): StopMatchmakingInput = {
      val __obj = js.Dynamic.literal(
        "TicketId" -> TicketId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopMatchmakingInput]
    }
  }

  @js.native
  trait StopMatchmakingOutput extends js.Object

  object StopMatchmakingOutput {
    @inline
    def apply(): StopMatchmakingOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopMatchmakingOutput]
    }
  }

  @js.native
  trait SuspendGameServerGroupInput extends js.Object {
    var GameServerGroupName: GameServerGroupNameOrArn
    var SuspendActions: GameServerGroupActions
  }

  object SuspendGameServerGroupInput {
    @inline
    def apply(
        GameServerGroupName: GameServerGroupNameOrArn,
        SuspendActions: GameServerGroupActions
    ): SuspendGameServerGroupInput = {
      val __obj = js.Dynamic.literal(
        "GameServerGroupName" -> GameServerGroupName.asInstanceOf[js.Any],
        "SuspendActions" -> SuspendActions.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SuspendGameServerGroupInput]
    }
  }

  @js.native
  trait SuspendGameServerGroupOutput extends js.Object {
    var GameServerGroup: js.UndefOr[GameServerGroup]
  }

  object SuspendGameServerGroupOutput {
    @inline
    def apply(
        GameServerGroup: js.UndefOr[GameServerGroup] = js.undefined
    ): SuspendGameServerGroupOutput = {
      val __obj = js.Dynamic.literal()
      GameServerGroup.foreach(__v => __obj.updateDynamic("GameServerGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SuspendGameServerGroupOutput]
    }
  }

  /** A label that can be assigned to a GameLift resource.
    * ```Learn more```
    * [[https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html|Tagging AWS Resources]] in the <i>AWS General Reference</i>
    * [[http://aws.amazon.com/answers/account-management/aws-tagging-strategies/| AWS Tagging Strategies]]
    * ```Related operations```
    * * <a>TagResource</a>
    * * <a>UntagResource</a>
    * * <a>ListTagsForResource</a>
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /** Settings for a target-based scaling policy (see <a>ScalingPolicy</a>. A target-based policy tracks a particular fleet metric specifies a target value for the metric. As player usage changes, the policy triggers Amazon GameLift to adjust capacity so that the metric returns to the target value. The target configuration specifies settings as needed for the target based policy, including the target value.
    * * <a>DescribeFleetCapacity</a>
    * * <a>UpdateFleetCapacity</a>
    * * <a>DescribeEC2InstanceLimits</a>
    * * Manage scaling policies:
    * <li> <a>PutScalingPolicy</a> (auto-scaling)
    * * <a>DescribeScalingPolicies</a> (auto-scaling)
    * * <a>DeleteScalingPolicy</a> (auto-scaling)
    * </li> * Manage fleet actions:
    * <li> <a>StartFleetActions</a>
    * * <a>StopFleetActions</a>
    * </li>
    */
  @js.native
  trait TargetConfiguration extends js.Object {
    var TargetValue: Double
  }

  object TargetConfiguration {
    @inline
    def apply(
        TargetValue: Double
    ): TargetConfiguration = {
      val __obj = js.Dynamic.literal(
        "TargetValue" -> TargetValue.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TargetConfiguration]
    }
  }

  /** ```This data type is used with the Amazon GameLift FleetIQ and game server groups.```
    * Settings for a target-based scaling policy as part of a <a>GameServerGroupAutoScalingPolicy</a>. These settings are used to create a target-based policy that tracks the GameLift FleetIQ metric <code>"PercentUtilizedGameServers"</code> and specifies a target value for the metric. As player usage changes, the policy triggers to adjust the game server group capacity so that the metric returns to the target value.
    */
  @js.native
  trait TargetTrackingConfiguration extends js.Object {
    var TargetValue: NonNegativeDouble
  }

  object TargetTrackingConfiguration {
    @inline
    def apply(
        TargetValue: NonNegativeDouble
    ): TargetTrackingConfiguration = {
      val __obj = js.Dynamic.literal(
        "TargetValue" -> TargetValue.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TargetTrackingConfiguration]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait UpdateAliasInput extends js.Object {
    var AliasId: AliasIdOrArn
    var Description: js.UndefOr[NonZeroAndMaxString]
    var Name: js.UndefOr[NonBlankAndLengthConstraintString]
    var RoutingStrategy: js.UndefOr[RoutingStrategy]
  }

  object UpdateAliasInput {
    @inline
    def apply(
        AliasId: AliasIdOrArn,
        Description: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        Name: js.UndefOr[NonBlankAndLengthConstraintString] = js.undefined,
        RoutingStrategy: js.UndefOr[RoutingStrategy] = js.undefined
    ): UpdateAliasInput = {
      val __obj = js.Dynamic.literal(
        "AliasId" -> AliasId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RoutingStrategy.foreach(__v => __obj.updateDynamic("RoutingStrategy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAliasInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait UpdateAliasOutput extends js.Object {
    var Alias: js.UndefOr[Alias]
  }

  object UpdateAliasOutput {
    @inline
    def apply(
        Alias: js.UndefOr[Alias] = js.undefined
    ): UpdateAliasOutput = {
      val __obj = js.Dynamic.literal()
      Alias.foreach(__v => __obj.updateDynamic("Alias")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAliasOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait UpdateBuildInput extends js.Object {
    var BuildId: BuildIdOrArn
    var Name: js.UndefOr[NonZeroAndMaxString]
    var Version: js.UndefOr[NonZeroAndMaxString]
  }

  object UpdateBuildInput {
    @inline
    def apply(
        BuildId: BuildIdOrArn,
        Name: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        Version: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): UpdateBuildInput = {
      val __obj = js.Dynamic.literal(
        "BuildId" -> BuildId.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBuildInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait UpdateBuildOutput extends js.Object {
    var Build: js.UndefOr[Build]
  }

  object UpdateBuildOutput {
    @inline
    def apply(
        Build: js.UndefOr[Build] = js.undefined
    ): UpdateBuildOutput = {
      val __obj = js.Dynamic.literal()
      Build.foreach(__v => __obj.updateDynamic("Build")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBuildOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait UpdateFleetAttributesInput extends js.Object {
    var FleetId: FleetIdOrArn
    var Description: js.UndefOr[NonZeroAndMaxString]
    var MetricGroups: js.UndefOr[MetricGroupList]
    var Name: js.UndefOr[NonZeroAndMaxString]
    var NewGameSessionProtectionPolicy: js.UndefOr[ProtectionPolicy]
    var ResourceCreationLimitPolicy: js.UndefOr[ResourceCreationLimitPolicy]
  }

  object UpdateFleetAttributesInput {
    @inline
    def apply(
        FleetId: FleetIdOrArn,
        Description: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        MetricGroups: js.UndefOr[MetricGroupList] = js.undefined,
        Name: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        NewGameSessionProtectionPolicy: js.UndefOr[ProtectionPolicy] = js.undefined,
        ResourceCreationLimitPolicy: js.UndefOr[ResourceCreationLimitPolicy] = js.undefined
    ): UpdateFleetAttributesInput = {
      val __obj = js.Dynamic.literal(
        "FleetId" -> FleetId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      MetricGroups.foreach(__v => __obj.updateDynamic("MetricGroups")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NewGameSessionProtectionPolicy.foreach(__v => __obj.updateDynamic("NewGameSessionProtectionPolicy")(__v.asInstanceOf[js.Any]))
      ResourceCreationLimitPolicy.foreach(__v => __obj.updateDynamic("ResourceCreationLimitPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFleetAttributesInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait UpdateFleetAttributesOutput extends js.Object {
    var FleetId: js.UndefOr[FleetId]
  }

  object UpdateFleetAttributesOutput {
    @inline
    def apply(
        FleetId: js.UndefOr[FleetId] = js.undefined
    ): UpdateFleetAttributesOutput = {
      val __obj = js.Dynamic.literal()
      FleetId.foreach(__v => __obj.updateDynamic("FleetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFleetAttributesOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait UpdateFleetCapacityInput extends js.Object {
    var FleetId: FleetIdOrArn
    var DesiredInstances: js.UndefOr[WholeNumber]
    var MaxSize: js.UndefOr[WholeNumber]
    var MinSize: js.UndefOr[WholeNumber]
  }

  object UpdateFleetCapacityInput {
    @inline
    def apply(
        FleetId: FleetIdOrArn,
        DesiredInstances: js.UndefOr[WholeNumber] = js.undefined,
        MaxSize: js.UndefOr[WholeNumber] = js.undefined,
        MinSize: js.UndefOr[WholeNumber] = js.undefined
    ): UpdateFleetCapacityInput = {
      val __obj = js.Dynamic.literal(
        "FleetId" -> FleetId.asInstanceOf[js.Any]
      )

      DesiredInstances.foreach(__v => __obj.updateDynamic("DesiredInstances")(__v.asInstanceOf[js.Any]))
      MaxSize.foreach(__v => __obj.updateDynamic("MaxSize")(__v.asInstanceOf[js.Any]))
      MinSize.foreach(__v => __obj.updateDynamic("MinSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFleetCapacityInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait UpdateFleetCapacityOutput extends js.Object {
    var FleetId: js.UndefOr[FleetId]
  }

  object UpdateFleetCapacityOutput {
    @inline
    def apply(
        FleetId: js.UndefOr[FleetId] = js.undefined
    ): UpdateFleetCapacityOutput = {
      val __obj = js.Dynamic.literal()
      FleetId.foreach(__v => __obj.updateDynamic("FleetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFleetCapacityOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait UpdateFleetPortSettingsInput extends js.Object {
    var FleetId: FleetIdOrArn
    var InboundPermissionAuthorizations: js.UndefOr[IpPermissionsList]
    var InboundPermissionRevocations: js.UndefOr[IpPermissionsList]
  }

  object UpdateFleetPortSettingsInput {
    @inline
    def apply(
        FleetId: FleetIdOrArn,
        InboundPermissionAuthorizations: js.UndefOr[IpPermissionsList] = js.undefined,
        InboundPermissionRevocations: js.UndefOr[IpPermissionsList] = js.undefined
    ): UpdateFleetPortSettingsInput = {
      val __obj = js.Dynamic.literal(
        "FleetId" -> FleetId.asInstanceOf[js.Any]
      )

      InboundPermissionAuthorizations.foreach(__v => __obj.updateDynamic("InboundPermissionAuthorizations")(__v.asInstanceOf[js.Any]))
      InboundPermissionRevocations.foreach(__v => __obj.updateDynamic("InboundPermissionRevocations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFleetPortSettingsInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait UpdateFleetPortSettingsOutput extends js.Object {
    var FleetId: js.UndefOr[FleetId]
  }

  object UpdateFleetPortSettingsOutput {
    @inline
    def apply(
        FleetId: js.UndefOr[FleetId] = js.undefined
    ): UpdateFleetPortSettingsOutput = {
      val __obj = js.Dynamic.literal()
      FleetId.foreach(__v => __obj.updateDynamic("FleetId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFleetPortSettingsOutput]
    }
  }

  @js.native
  trait UpdateGameServerGroupInput extends js.Object {
    var GameServerGroupName: GameServerGroupNameOrArn
    var BalancingStrategy: js.UndefOr[BalancingStrategy]
    var GameServerProtectionPolicy: js.UndefOr[GameServerProtectionPolicy]
    var InstanceDefinitions: js.UndefOr[InstanceDefinitions]
    var RoleArn: js.UndefOr[IamRoleArn]
  }

  object UpdateGameServerGroupInput {
    @inline
    def apply(
        GameServerGroupName: GameServerGroupNameOrArn,
        BalancingStrategy: js.UndefOr[BalancingStrategy] = js.undefined,
        GameServerProtectionPolicy: js.UndefOr[GameServerProtectionPolicy] = js.undefined,
        InstanceDefinitions: js.UndefOr[InstanceDefinitions] = js.undefined,
        RoleArn: js.UndefOr[IamRoleArn] = js.undefined
    ): UpdateGameServerGroupInput = {
      val __obj = js.Dynamic.literal(
        "GameServerGroupName" -> GameServerGroupName.asInstanceOf[js.Any]
      )

      BalancingStrategy.foreach(__v => __obj.updateDynamic("BalancingStrategy")(__v.asInstanceOf[js.Any]))
      GameServerProtectionPolicy.foreach(__v => __obj.updateDynamic("GameServerProtectionPolicy")(__v.asInstanceOf[js.Any]))
      InstanceDefinitions.foreach(__v => __obj.updateDynamic("InstanceDefinitions")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGameServerGroupInput]
    }
  }

  @js.native
  trait UpdateGameServerGroupOutput extends js.Object {
    var GameServerGroup: js.UndefOr[GameServerGroup]
  }

  object UpdateGameServerGroupOutput {
    @inline
    def apply(
        GameServerGroup: js.UndefOr[GameServerGroup] = js.undefined
    ): UpdateGameServerGroupOutput = {
      val __obj = js.Dynamic.literal()
      GameServerGroup.foreach(__v => __obj.updateDynamic("GameServerGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGameServerGroupOutput]
    }
  }

  @js.native
  trait UpdateGameServerInput extends js.Object {
    var GameServerGroupName: GameServerGroupNameOrArn
    var GameServerId: GameServerId
    var GameServerData: js.UndefOr[GameServerData]
    var HealthCheck: js.UndefOr[GameServerHealthCheck]
    var UtilizationStatus: js.UndefOr[GameServerUtilizationStatus]
  }

  object UpdateGameServerInput {
    @inline
    def apply(
        GameServerGroupName: GameServerGroupNameOrArn,
        GameServerId: GameServerId,
        GameServerData: js.UndefOr[GameServerData] = js.undefined,
        HealthCheck: js.UndefOr[GameServerHealthCheck] = js.undefined,
        UtilizationStatus: js.UndefOr[GameServerUtilizationStatus] = js.undefined
    ): UpdateGameServerInput = {
      val __obj = js.Dynamic.literal(
        "GameServerGroupName" -> GameServerGroupName.asInstanceOf[js.Any],
        "GameServerId" -> GameServerId.asInstanceOf[js.Any]
      )

      GameServerData.foreach(__v => __obj.updateDynamic("GameServerData")(__v.asInstanceOf[js.Any]))
      HealthCheck.foreach(__v => __obj.updateDynamic("HealthCheck")(__v.asInstanceOf[js.Any]))
      UtilizationStatus.foreach(__v => __obj.updateDynamic("UtilizationStatus")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGameServerInput]
    }
  }

  @js.native
  trait UpdateGameServerOutput extends js.Object {
    var GameServer: js.UndefOr[GameServer]
  }

  object UpdateGameServerOutput {
    @inline
    def apply(
        GameServer: js.UndefOr[GameServer] = js.undefined
    ): UpdateGameServerOutput = {
      val __obj = js.Dynamic.literal()
      GameServer.foreach(__v => __obj.updateDynamic("GameServer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGameServerOutput]
    }
  }

  /** Represents the input for a request operation.
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
    @inline
    def apply(
        GameSessionId: ArnStringModel,
        MaximumPlayerSessionCount: js.UndefOr[WholeNumber] = js.undefined,
        Name: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        PlayerSessionCreationPolicy: js.UndefOr[PlayerSessionCreationPolicy] = js.undefined,
        ProtectionPolicy: js.UndefOr[ProtectionPolicy] = js.undefined
    ): UpdateGameSessionInput = {
      val __obj = js.Dynamic.literal(
        "GameSessionId" -> GameSessionId.asInstanceOf[js.Any]
      )

      MaximumPlayerSessionCount.foreach(__v => __obj.updateDynamic("MaximumPlayerSessionCount")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PlayerSessionCreationPolicy.foreach(__v => __obj.updateDynamic("PlayerSessionCreationPolicy")(__v.asInstanceOf[js.Any]))
      ProtectionPolicy.foreach(__v => __obj.updateDynamic("ProtectionPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGameSessionInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait UpdateGameSessionOutput extends js.Object {
    var GameSession: js.UndefOr[GameSession]
  }

  object UpdateGameSessionOutput {
    @inline
    def apply(
        GameSession: js.UndefOr[GameSession] = js.undefined
    ): UpdateGameSessionOutput = {
      val __obj = js.Dynamic.literal()
      GameSession.foreach(__v => __obj.updateDynamic("GameSession")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGameSessionOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait UpdateGameSessionQueueInput extends js.Object {
    var Name: GameSessionQueueNameOrArn
    var Destinations: js.UndefOr[GameSessionQueueDestinationList]
    var PlayerLatencyPolicies: js.UndefOr[PlayerLatencyPolicyList]
    var TimeoutInSeconds: js.UndefOr[WholeNumber]
  }

  object UpdateGameSessionQueueInput {
    @inline
    def apply(
        Name: GameSessionQueueNameOrArn,
        Destinations: js.UndefOr[GameSessionQueueDestinationList] = js.undefined,
        PlayerLatencyPolicies: js.UndefOr[PlayerLatencyPolicyList] = js.undefined,
        TimeoutInSeconds: js.UndefOr[WholeNumber] = js.undefined
    ): UpdateGameSessionQueueInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Destinations.foreach(__v => __obj.updateDynamic("Destinations")(__v.asInstanceOf[js.Any]))
      PlayerLatencyPolicies.foreach(__v => __obj.updateDynamic("PlayerLatencyPolicies")(__v.asInstanceOf[js.Any]))
      TimeoutInSeconds.foreach(__v => __obj.updateDynamic("TimeoutInSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGameSessionQueueInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait UpdateGameSessionQueueOutput extends js.Object {
    var GameSessionQueue: js.UndefOr[GameSessionQueue]
  }

  object UpdateGameSessionQueueOutput {
    @inline
    def apply(
        GameSessionQueue: js.UndefOr[GameSessionQueue] = js.undefined
    ): UpdateGameSessionQueueOutput = {
      val __obj = js.Dynamic.literal()
      GameSessionQueue.foreach(__v => __obj.updateDynamic("GameSessionQueue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGameSessionQueueOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait UpdateMatchmakingConfigurationInput extends js.Object {
    var Name: MatchmakingConfigurationName
    var AcceptanceRequired: js.UndefOr[BooleanModel]
    var AcceptanceTimeoutSeconds: js.UndefOr[MatchmakingAcceptanceTimeoutInteger]
    var AdditionalPlayerCount: js.UndefOr[WholeNumber]
    var BackfillMode: js.UndefOr[BackfillMode]
    var CustomEventData: js.UndefOr[CustomEventData]
    var Description: js.UndefOr[NonZeroAndMaxString]
    var FlexMatchMode: js.UndefOr[FlexMatchMode]
    var GameProperties: js.UndefOr[GamePropertyList]
    var GameSessionData: js.UndefOr[GameSessionData]
    var GameSessionQueueArns: js.UndefOr[QueueArnsList]
    var NotificationTarget: js.UndefOr[SnsArnStringModel]
    var RequestTimeoutSeconds: js.UndefOr[MatchmakingRequestTimeoutInteger]
    var RuleSetName: js.UndefOr[MatchmakingRuleSetName]
  }

  object UpdateMatchmakingConfigurationInput {
    @inline
    def apply(
        Name: MatchmakingConfigurationName,
        AcceptanceRequired: js.UndefOr[BooleanModel] = js.undefined,
        AcceptanceTimeoutSeconds: js.UndefOr[MatchmakingAcceptanceTimeoutInteger] = js.undefined,
        AdditionalPlayerCount: js.UndefOr[WholeNumber] = js.undefined,
        BackfillMode: js.UndefOr[BackfillMode] = js.undefined,
        CustomEventData: js.UndefOr[CustomEventData] = js.undefined,
        Description: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        FlexMatchMode: js.UndefOr[FlexMatchMode] = js.undefined,
        GameProperties: js.UndefOr[GamePropertyList] = js.undefined,
        GameSessionData: js.UndefOr[GameSessionData] = js.undefined,
        GameSessionQueueArns: js.UndefOr[QueueArnsList] = js.undefined,
        NotificationTarget: js.UndefOr[SnsArnStringModel] = js.undefined,
        RequestTimeoutSeconds: js.UndefOr[MatchmakingRequestTimeoutInteger] = js.undefined,
        RuleSetName: js.UndefOr[MatchmakingRuleSetName] = js.undefined
    ): UpdateMatchmakingConfigurationInput = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AcceptanceRequired.foreach(__v => __obj.updateDynamic("AcceptanceRequired")(__v.asInstanceOf[js.Any]))
      AcceptanceTimeoutSeconds.foreach(__v => __obj.updateDynamic("AcceptanceTimeoutSeconds")(__v.asInstanceOf[js.Any]))
      AdditionalPlayerCount.foreach(__v => __obj.updateDynamic("AdditionalPlayerCount")(__v.asInstanceOf[js.Any]))
      BackfillMode.foreach(__v => __obj.updateDynamic("BackfillMode")(__v.asInstanceOf[js.Any]))
      CustomEventData.foreach(__v => __obj.updateDynamic("CustomEventData")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      FlexMatchMode.foreach(__v => __obj.updateDynamic("FlexMatchMode")(__v.asInstanceOf[js.Any]))
      GameProperties.foreach(__v => __obj.updateDynamic("GameProperties")(__v.asInstanceOf[js.Any]))
      GameSessionData.foreach(__v => __obj.updateDynamic("GameSessionData")(__v.asInstanceOf[js.Any]))
      GameSessionQueueArns.foreach(__v => __obj.updateDynamic("GameSessionQueueArns")(__v.asInstanceOf[js.Any]))
      NotificationTarget.foreach(__v => __obj.updateDynamic("NotificationTarget")(__v.asInstanceOf[js.Any]))
      RequestTimeoutSeconds.foreach(__v => __obj.updateDynamic("RequestTimeoutSeconds")(__v.asInstanceOf[js.Any]))
      RuleSetName.foreach(__v => __obj.updateDynamic("RuleSetName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMatchmakingConfigurationInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait UpdateMatchmakingConfigurationOutput extends js.Object {
    var Configuration: js.UndefOr[MatchmakingConfiguration]
  }

  object UpdateMatchmakingConfigurationOutput {
    @inline
    def apply(
        Configuration: js.UndefOr[MatchmakingConfiguration] = js.undefined
    ): UpdateMatchmakingConfigurationOutput = {
      val __obj = js.Dynamic.literal()
      Configuration.foreach(__v => __obj.updateDynamic("Configuration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMatchmakingConfigurationOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait UpdateRuntimeConfigurationInput extends js.Object {
    var FleetId: FleetIdOrArn
    var RuntimeConfiguration: RuntimeConfiguration
  }

  object UpdateRuntimeConfigurationInput {
    @inline
    def apply(
        FleetId: FleetIdOrArn,
        RuntimeConfiguration: RuntimeConfiguration
    ): UpdateRuntimeConfigurationInput = {
      val __obj = js.Dynamic.literal(
        "FleetId" -> FleetId.asInstanceOf[js.Any],
        "RuntimeConfiguration" -> RuntimeConfiguration.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateRuntimeConfigurationInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait UpdateRuntimeConfigurationOutput extends js.Object {
    var RuntimeConfiguration: js.UndefOr[RuntimeConfiguration]
  }

  object UpdateRuntimeConfigurationOutput {
    @inline
    def apply(
        RuntimeConfiguration: js.UndefOr[RuntimeConfiguration] = js.undefined
    ): UpdateRuntimeConfigurationOutput = {
      val __obj = js.Dynamic.literal()
      RuntimeConfiguration.foreach(__v => __obj.updateDynamic("RuntimeConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRuntimeConfigurationOutput]
    }
  }

  @js.native
  trait UpdateScriptInput extends js.Object {
    var ScriptId: ScriptIdOrArn
    var Name: js.UndefOr[NonZeroAndMaxString]
    var StorageLocation: js.UndefOr[S3Location]
    var Version: js.UndefOr[NonZeroAndMaxString]
    var ZipFile: js.UndefOr[ZipBlob]
  }

  object UpdateScriptInput {
    @inline
    def apply(
        ScriptId: ScriptIdOrArn,
        Name: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        StorageLocation: js.UndefOr[S3Location] = js.undefined,
        Version: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        ZipFile: js.UndefOr[ZipBlob] = js.undefined
    ): UpdateScriptInput = {
      val __obj = js.Dynamic.literal(
        "ScriptId" -> ScriptId.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      StorageLocation.foreach(__v => __obj.updateDynamic("StorageLocation")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      ZipFile.foreach(__v => __obj.updateDynamic("ZipFile")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateScriptInput]
    }
  }

  @js.native
  trait UpdateScriptOutput extends js.Object {
    var Script: js.UndefOr[Script]
  }

  object UpdateScriptOutput {
    @inline
    def apply(
        Script: js.UndefOr[Script] = js.undefined
    ): UpdateScriptOutput = {
      val __obj = js.Dynamic.literal()
      Script.foreach(__v => __obj.updateDynamic("Script")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateScriptOutput]
    }
  }

  /** Represents the input for a request operation.
    */
  @js.native
  trait ValidateMatchmakingRuleSetInput extends js.Object {
    var RuleSetBody: RuleSetBody
  }

  object ValidateMatchmakingRuleSetInput {
    @inline
    def apply(
        RuleSetBody: RuleSetBody
    ): ValidateMatchmakingRuleSetInput = {
      val __obj = js.Dynamic.literal(
        "RuleSetBody" -> RuleSetBody.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ValidateMatchmakingRuleSetInput]
    }
  }

  /** Represents the returned data in response to a request operation.
    */
  @js.native
  trait ValidateMatchmakingRuleSetOutput extends js.Object {
    var Valid: js.UndefOr[BooleanModel]
  }

  object ValidateMatchmakingRuleSetOutput {
    @inline
    def apply(
        Valid: js.UndefOr[BooleanModel] = js.undefined
    ): ValidateMatchmakingRuleSetOutput = {
      val __obj = js.Dynamic.literal()
      Valid.foreach(__v => __obj.updateDynamic("Valid")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ValidateMatchmakingRuleSetOutput]
    }
  }

  /** Represents an authorization for a VPC peering connection between the VPC for an Amazon GameLift fleet and another VPC on an account you have access to. This authorization must exist and be valid for the peering connection to be established. Authorizations are valid for 24 hours after they are issued.
    * * <a>CreateVpcPeeringAuthorization</a>
    * * <a>DescribeVpcPeeringAuthorizations</a>
    * * <a>DeleteVpcPeeringAuthorization</a>
    * * <a>CreateVpcPeeringConnection</a>
    * * <a>DescribeVpcPeeringConnections</a>
    * * <a>DeleteVpcPeeringConnection</a>
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
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        ExpirationTime: js.UndefOr[Timestamp] = js.undefined,
        GameLiftAwsAccountId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        PeerVpcAwsAccountId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        PeerVpcId: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): VpcPeeringAuthorization = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      ExpirationTime.foreach(__v => __obj.updateDynamic("ExpirationTime")(__v.asInstanceOf[js.Any]))
      GameLiftAwsAccountId.foreach(__v => __obj.updateDynamic("GameLiftAwsAccountId")(__v.asInstanceOf[js.Any]))
      PeerVpcAwsAccountId.foreach(__v => __obj.updateDynamic("PeerVpcAwsAccountId")(__v.asInstanceOf[js.Any]))
      PeerVpcId.foreach(__v => __obj.updateDynamic("PeerVpcId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcPeeringAuthorization]
    }
  }

  /** Represents a peering connection between a VPC on one of your AWS accounts and the VPC for your Amazon GameLift fleets. This record may be for an active peering connection or a pending connection that has not yet been established.
    * * <a>CreateVpcPeeringAuthorization</a>
    * * <a>DescribeVpcPeeringAuthorizations</a>
    * * <a>DeleteVpcPeeringAuthorization</a>
    * * <a>CreateVpcPeeringConnection</a>
    * * <a>DescribeVpcPeeringConnections</a>
    * * <a>DeleteVpcPeeringConnection</a>
    */
  @js.native
  trait VpcPeeringConnection extends js.Object {
    var FleetArn: js.UndefOr[FleetArn]
    var FleetId: js.UndefOr[FleetId]
    var GameLiftVpcId: js.UndefOr[NonZeroAndMaxString]
    var IpV4CidrBlock: js.UndefOr[NonZeroAndMaxString]
    var PeerVpcId: js.UndefOr[NonZeroAndMaxString]
    var Status: js.UndefOr[VpcPeeringConnectionStatus]
    var VpcPeeringConnectionId: js.UndefOr[NonZeroAndMaxString]
  }

  object VpcPeeringConnection {
    @inline
    def apply(
        FleetArn: js.UndefOr[FleetArn] = js.undefined,
        FleetId: js.UndefOr[FleetId] = js.undefined,
        GameLiftVpcId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        IpV4CidrBlock: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        PeerVpcId: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        Status: js.UndefOr[VpcPeeringConnectionStatus] = js.undefined,
        VpcPeeringConnectionId: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): VpcPeeringConnection = {
      val __obj = js.Dynamic.literal()
      FleetArn.foreach(__v => __obj.updateDynamic("FleetArn")(__v.asInstanceOf[js.Any]))
      FleetId.foreach(__v => __obj.updateDynamic("FleetId")(__v.asInstanceOf[js.Any]))
      GameLiftVpcId.foreach(__v => __obj.updateDynamic("GameLiftVpcId")(__v.asInstanceOf[js.Any]))
      IpV4CidrBlock.foreach(__v => __obj.updateDynamic("IpV4CidrBlock")(__v.asInstanceOf[js.Any]))
      PeerVpcId.foreach(__v => __obj.updateDynamic("PeerVpcId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      VpcPeeringConnectionId.foreach(__v => __obj.updateDynamic("VpcPeeringConnectionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcPeeringConnection]
    }
  }

  /** Represents status information for a VPC peering connection. Status is associated with a <a>VpcPeeringConnection</a> object. Status codes and messages are provided from EC2 (see [[https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_VpcPeeringConnectionStateReason.html|VpcPeeringConnectionStateReason]]). Connection status information is also communicated as a fleet <a>Event</a>.
    */
  @js.native
  trait VpcPeeringConnectionStatus extends js.Object {
    var Code: js.UndefOr[NonZeroAndMaxString]
    var Message: js.UndefOr[NonZeroAndMaxString]
  }

  object VpcPeeringConnectionStatus {
    @inline
    def apply(
        Code: js.UndefOr[NonZeroAndMaxString] = js.undefined,
        Message: js.UndefOr[NonZeroAndMaxString] = js.undefined
    ): VpcPeeringConnectionStatus = {
      val __obj = js.Dynamic.literal()
      Code.foreach(__v => __obj.updateDynamic("Code")(__v.asInstanceOf[js.Any]))
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcPeeringConnectionStatus]
    }
  }
}
