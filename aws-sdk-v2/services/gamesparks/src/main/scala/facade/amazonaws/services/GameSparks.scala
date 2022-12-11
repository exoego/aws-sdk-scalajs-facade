package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object gamesparks {
  type ARN = String
  type ByteSize = Int
  type ClientToken = String
  type ConnectionId = String
  type ConnectionIdList = js.Array[ConnectionId]
  type ConnectionList = js.Array[Connection]
  type DateTime = js.Date
  type DeploymentId = String
  type ExtensionDescription = String
  type ExtensionDetailsList = js.Array[ExtensionDetails]
  type ExtensionName = String
  type ExtensionNamespace = String
  type ExtensionVersion = String
  type ExtensionVersionDetailsList = js.Array[ExtensionVersionDetails]
  type ExtensionVersionSchema = String
  type GameDescription = String
  type GameKey = String
  type GameName = String
  type GameSdkVersion = String
  type GameSummaryList = js.Array[GameSummary]
  type GameTerminationProtection = Boolean
  type GeneratedCodeJobDescription = String
  type GeneratedCodeJobDetailsList = js.Array[GeneratedCodeJobDetails]
  type GeneratedCodeJobId = String
  type Language = String
  type LogGroupName = String
  type MaxResults = Int
  type Message = String
  type NextToken = String
  type Path = String
  type PlayerId = String
  type RawGameConfigurationData = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ResourceArn = String
  type RoleARN = String
  type S3PresignedUrl = String
  type SectionList = js.Array[SectionName]
  type SectionModificationList = js.Array[SectionModification]
  type SectionName = String
  type Sections = js.Dictionary[Section]
  type SnapshotDescription = String
  type SnapshotId = String
  type SnapshotSummaryList = js.Array[SnapshotSummary]
  type StageDeploymentList = js.Array[StageDeploymentSummary]
  type StageDescription = String
  type StageName = String
  type StageSummaryList = js.Array[StageSummary]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type TargetPlatform = String

  final class GameSparksOps(private val service: GameSparks) extends AnyVal {

    @inline def createGameFuture(params: CreateGameRequest): Future[CreateGameResult] = service.createGame(params).promise().toFuture
    @inline def createSnapshotFuture(params: CreateSnapshotRequest): Future[CreateSnapshotResult] = service.createSnapshot(params).promise().toFuture
    @inline def createStageFuture(params: CreateStageRequest): Future[CreateStageResult] = service.createStage(params).promise().toFuture
    @inline def deleteGameFuture(params: DeleteGameRequest): Future[DeleteGameResult] = service.deleteGame(params).promise().toFuture
    @inline def deleteStageFuture(params: DeleteStageRequest): Future[DeleteStageResult] = service.deleteStage(params).promise().toFuture
    @inline def disconnectPlayerFuture(params: DisconnectPlayerRequest): Future[DisconnectPlayerResult] = service.disconnectPlayer(params).promise().toFuture
    @inline def exportSnapshotFuture(params: ExportSnapshotRequest): Future[ExportSnapshotResult] = service.exportSnapshot(params).promise().toFuture
    @inline def getExtensionFuture(params: GetExtensionRequest): Future[GetExtensionResult] = service.getExtension(params).promise().toFuture
    @inline def getExtensionVersionFuture(params: GetExtensionVersionRequest): Future[GetExtensionVersionResult] = service.getExtensionVersion(params).promise().toFuture
    @inline def getGameConfigurationFuture(params: GetGameConfigurationRequest): Future[GetGameConfigurationResult] = service.getGameConfiguration(params).promise().toFuture
    @inline def getGameFuture(params: GetGameRequest): Future[GetGameResult] = service.getGame(params).promise().toFuture
    @inline def getGeneratedCodeJobFuture(params: GetGeneratedCodeJobRequest): Future[GetGeneratedCodeJobResult] = service.getGeneratedCodeJob(params).promise().toFuture
    @inline def getPlayerConnectionStatusFuture(params: GetPlayerConnectionStatusRequest): Future[GetPlayerConnectionStatusResult] = service.getPlayerConnectionStatus(params).promise().toFuture
    @inline def getSnapshotFuture(params: GetSnapshotRequest): Future[GetSnapshotResult] = service.getSnapshot(params).promise().toFuture
    @inline def getStageDeploymentFuture(params: GetStageDeploymentRequest): Future[GetStageDeploymentResult] = service.getStageDeployment(params).promise().toFuture
    @inline def getStageFuture(params: GetStageRequest): Future[GetStageResult] = service.getStage(params).promise().toFuture
    @inline def importGameConfigurationFuture(params: ImportGameConfigurationRequest): Future[ImportGameConfigurationResult] = service.importGameConfiguration(params).promise().toFuture
    @inline def listExtensionVersionsFuture(params: ListExtensionVersionsRequest): Future[ListExtensionVersionsResult] = service.listExtensionVersions(params).promise().toFuture
    @inline def listExtensionsFuture(params: ListExtensionsRequest): Future[ListExtensionsResult] = service.listExtensions(params).promise().toFuture
    @inline def listGamesFuture(params: ListGamesRequest): Future[ListGamesResult] = service.listGames(params).promise().toFuture
    @inline def listGeneratedCodeJobsFuture(params: ListGeneratedCodeJobsRequest): Future[ListGeneratedCodeJobsResult] = service.listGeneratedCodeJobs(params).promise().toFuture
    @inline def listSnapshotsFuture(params: ListSnapshotsRequest): Future[ListSnapshotsResult] = service.listSnapshots(params).promise().toFuture
    @inline def listStageDeploymentsFuture(params: ListStageDeploymentsRequest): Future[ListStageDeploymentsResult] = service.listStageDeployments(params).promise().toFuture
    @inline def listStagesFuture(params: ListStagesRequest): Future[ListStagesResult] = service.listStages(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResult] = service.listTagsForResource(params).promise().toFuture
    @inline def startGeneratedCodeJobFuture(params: StartGeneratedCodeJobRequest): Future[StartGeneratedCodeJobResult] = service.startGeneratedCodeJob(params).promise().toFuture
    @inline def startStageDeploymentFuture(params: StartStageDeploymentRequest): Future[StartStageDeploymentResult] = service.startStageDeployment(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResult] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResult] = service.untagResource(params).promise().toFuture
    @inline def updateGameConfigurationFuture(params: UpdateGameConfigurationRequest): Future[UpdateGameConfigurationResult] = service.updateGameConfiguration(params).promise().toFuture
    @inline def updateGameFuture(params: UpdateGameRequest): Future[UpdateGameResult] = service.updateGame(params).promise().toFuture
    @inline def updateSnapshotFuture(params: UpdateSnapshotRequest): Future[UpdateSnapshotResult] = service.updateSnapshot(params).promise().toFuture
    @inline def updateStageFuture(params: UpdateStageRequest): Future[UpdateStageResult] = service.updateStage(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/gamesparks", JSImport.Namespace, "AWS.GameSparks")
  class GameSparks() extends js.Object {
    def this(config: AWSConfig) = this()

    def createGame(params: CreateGameRequest): Request[CreateGameResult] = js.native
    def createSnapshot(params: CreateSnapshotRequest): Request[CreateSnapshotResult] = js.native
    def createStage(params: CreateStageRequest): Request[CreateStageResult] = js.native
    def deleteGame(params: DeleteGameRequest): Request[DeleteGameResult] = js.native
    def deleteStage(params: DeleteStageRequest): Request[DeleteStageResult] = js.native
    def disconnectPlayer(params: DisconnectPlayerRequest): Request[DisconnectPlayerResult] = js.native
    def exportSnapshot(params: ExportSnapshotRequest): Request[ExportSnapshotResult] = js.native
    def getExtension(params: GetExtensionRequest): Request[GetExtensionResult] = js.native
    def getExtensionVersion(params: GetExtensionVersionRequest): Request[GetExtensionVersionResult] = js.native
    def getGame(params: GetGameRequest): Request[GetGameResult] = js.native
    def getGameConfiguration(params: GetGameConfigurationRequest): Request[GetGameConfigurationResult] = js.native
    def getGeneratedCodeJob(params: GetGeneratedCodeJobRequest): Request[GetGeneratedCodeJobResult] = js.native
    def getPlayerConnectionStatus(params: GetPlayerConnectionStatusRequest): Request[GetPlayerConnectionStatusResult] = js.native
    def getSnapshot(params: GetSnapshotRequest): Request[GetSnapshotResult] = js.native
    def getStage(params: GetStageRequest): Request[GetStageResult] = js.native
    def getStageDeployment(params: GetStageDeploymentRequest): Request[GetStageDeploymentResult] = js.native
    def importGameConfiguration(params: ImportGameConfigurationRequest): Request[ImportGameConfigurationResult] = js.native
    def listExtensionVersions(params: ListExtensionVersionsRequest): Request[ListExtensionVersionsResult] = js.native
    def listExtensions(params: ListExtensionsRequest): Request[ListExtensionsResult] = js.native
    def listGames(params: ListGamesRequest): Request[ListGamesResult] = js.native
    def listGeneratedCodeJobs(params: ListGeneratedCodeJobsRequest): Request[ListGeneratedCodeJobsResult] = js.native
    def listSnapshots(params: ListSnapshotsRequest): Request[ListSnapshotsResult] = js.native
    def listStageDeployments(params: ListStageDeploymentsRequest): Request[ListStageDeploymentsResult] = js.native
    def listStages(params: ListStagesRequest): Request[ListStagesResult] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResult] = js.native
    def startGeneratedCodeJob(params: StartGeneratedCodeJobRequest): Request[StartGeneratedCodeJobResult] = js.native
    def startStageDeployment(params: StartStageDeploymentRequest): Request[StartStageDeploymentResult] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResult] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResult] = js.native
    def updateGame(params: UpdateGameRequest): Request[UpdateGameResult] = js.native
    def updateGameConfiguration(params: UpdateGameConfigurationRequest): Request[UpdateGameConfigurationResult] = js.native
    def updateSnapshot(params: UpdateSnapshotRequest): Request[UpdateSnapshotResult] = js.native
    def updateStage(params: UpdateStageRequest): Request[UpdateStageResult] = js.native
  }
  object GameSparks {
    @inline implicit def toOps(service: GameSparks): GameSparksOps = {
      new GameSparksOps(service)
    }
  }

  /** Details about a WebSocket connection.
    */
  @js.native
  trait Connection extends js.Object {
    var Created: js.UndefOr[DateTime]
    var Id: js.UndefOr[ConnectionId]
  }

  object Connection {
    @inline
    def apply(
        Created: js.UndefOr[DateTime] = js.undefined,
        Id: js.UndefOr[ConnectionId] = js.undefined
    ): Connection = {
      val __obj = js.Dynamic.literal()
      Created.foreach(__v => __obj.updateDynamic("Created")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Connection]
    }
  }

  @js.native
  trait CreateGameRequest extends js.Object {
    var GameName: GameName
    var ClientToken: js.UndefOr[ClientToken]
    var Description: js.UndefOr[GameDescription]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateGameRequest {
    @inline
    def apply(
        GameName: GameName,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Description: js.UndefOr[GameDescription] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateGameRequest = {
      val __obj = js.Dynamic.literal(
        "GameName" -> GameName.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGameRequest]
    }
  }

  @js.native
  trait CreateGameResult extends js.Object {
    var Game: js.UndefOr[GameDetails]
  }

  object CreateGameResult {
    @inline
    def apply(
        Game: js.UndefOr[GameDetails] = js.undefined
    ): CreateGameResult = {
      val __obj = js.Dynamic.literal()
      Game.foreach(__v => __obj.updateDynamic("Game")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGameResult]
    }
  }

  @js.native
  trait CreateSnapshotRequest extends js.Object {
    var GameName: GameName
    var Description: js.UndefOr[SnapshotDescription]
  }

  object CreateSnapshotRequest {
    @inline
    def apply(
        GameName: GameName,
        Description: js.UndefOr[SnapshotDescription] = js.undefined
    ): CreateSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "GameName" -> GameName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSnapshotRequest]
    }
  }

  @js.native
  trait CreateSnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[SnapshotDetails]
  }

  object CreateSnapshotResult {
    @inline
    def apply(
        Snapshot: js.UndefOr[SnapshotDetails] = js.undefined
    ): CreateSnapshotResult = {
      val __obj = js.Dynamic.literal()
      Snapshot.foreach(__v => __obj.updateDynamic("Snapshot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSnapshotResult]
    }
  }

  @js.native
  trait CreateStageRequest extends js.Object {
    var GameName: GameName
    var Role: RoleARN
    var StageName: StageName
    var ClientToken: js.UndefOr[ClientToken]
    var Description: js.UndefOr[StageDescription]
    var Tags: js.UndefOr[TagMap]
  }

  object CreateStageRequest {
    @inline
    def apply(
        GameName: GameName,
        Role: RoleARN,
        StageName: StageName,
        ClientToken: js.UndefOr[ClientToken] = js.undefined,
        Description: js.UndefOr[StageDescription] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): CreateStageRequest = {
      val __obj = js.Dynamic.literal(
        "GameName" -> GameName.asInstanceOf[js.Any],
        "Role" -> Role.asInstanceOf[js.Any],
        "StageName" -> StageName.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStageRequest]
    }
  }

  @js.native
  trait CreateStageResult extends js.Object {
    var Stage: js.UndefOr[StageDetails]
  }

  object CreateStageResult {
    @inline
    def apply(
        Stage: js.UndefOr[StageDetails] = js.undefined
    ): CreateStageResult = {
      val __obj = js.Dynamic.literal()
      Stage.foreach(__v => __obj.updateDynamic("Stage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStageResult]
    }
  }

  @js.native
  trait DeleteGameRequest extends js.Object {
    var GameName: GameName
  }

  object DeleteGameRequest {
    @inline
    def apply(
        GameName: GameName
    ): DeleteGameRequest = {
      val __obj = js.Dynamic.literal(
        "GameName" -> GameName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteGameRequest]
    }
  }

  @js.native
  trait DeleteGameResult extends js.Object

  object DeleteGameResult {
    @inline
    def apply(): DeleteGameResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteGameResult]
    }
  }

  @js.native
  trait DeleteStageRequest extends js.Object {
    var GameName: GameName
    var StageName: StageName
  }

  object DeleteStageRequest {
    @inline
    def apply(
        GameName: GameName,
        StageName: StageName
    ): DeleteStageRequest = {
      val __obj = js.Dynamic.literal(
        "GameName" -> GameName.asInstanceOf[js.Any],
        "StageName" -> StageName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteStageRequest]
    }
  }

  @js.native
  trait DeleteStageResult extends js.Object

  object DeleteStageResult {
    @inline
    def apply(): DeleteStageResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteStageResult]
    }
  }

  /** The result of the deployment.
    */
  @js.native
  trait DeploymentResult extends js.Object {
    var Message: js.UndefOr[Message]
    var ResultCode: js.UndefOr[ResultCode]
  }

  object DeploymentResult {
    @inline
    def apply(
        Message: js.UndefOr[Message] = js.undefined,
        ResultCode: js.UndefOr[ResultCode] = js.undefined
    ): DeploymentResult = {
      val __obj = js.Dynamic.literal()
      Message.foreach(__v => __obj.updateDynamic("Message")(__v.asInstanceOf[js.Any]))
      ResultCode.foreach(__v => __obj.updateDynamic("ResultCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeploymentResult]
    }
  }

  @js.native
  trait DisconnectPlayerRequest extends js.Object {
    var GameName: GameName
    var PlayerId: PlayerId
    var StageName: StageName
  }

  object DisconnectPlayerRequest {
    @inline
    def apply(
        GameName: GameName,
        PlayerId: PlayerId,
        StageName: StageName
    ): DisconnectPlayerRequest = {
      val __obj = js.Dynamic.literal(
        "GameName" -> GameName.asInstanceOf[js.Any],
        "PlayerId" -> PlayerId.asInstanceOf[js.Any],
        "StageName" -> StageName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisconnectPlayerRequest]
    }
  }

  @js.native
  trait DisconnectPlayerResult extends js.Object {
    var DisconnectFailures: js.UndefOr[ConnectionIdList]
    var DisconnectSuccesses: js.UndefOr[ConnectionIdList]
  }

  object DisconnectPlayerResult {
    @inline
    def apply(
        DisconnectFailures: js.UndefOr[ConnectionIdList] = js.undefined,
        DisconnectSuccesses: js.UndefOr[ConnectionIdList] = js.undefined
    ): DisconnectPlayerResult = {
      val __obj = js.Dynamic.literal()
      DisconnectFailures.foreach(__v => __obj.updateDynamic("DisconnectFailures")(__v.asInstanceOf[js.Any]))
      DisconnectSuccesses.foreach(__v => __obj.updateDynamic("DisconnectSuccesses")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisconnectPlayerResult]
    }
  }

  /** <p/>
    */
  @js.native
  trait Document extends js.Object

  object Document {
    @inline
    def apply(): Document = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Document]
    }
  }

  @js.native
  trait ExportSnapshotRequest extends js.Object {
    var GameName: GameName
    var SnapshotId: SnapshotId
  }

  object ExportSnapshotRequest {
    @inline
    def apply(
        GameName: GameName,
        SnapshotId: SnapshotId
    ): ExportSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "GameName" -> GameName.asInstanceOf[js.Any],
        "SnapshotId" -> SnapshotId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ExportSnapshotRequest]
    }
  }

  @js.native
  trait ExportSnapshotResult extends js.Object {
    var S3Url: js.UndefOr[S3PresignedUrl]
  }

  object ExportSnapshotResult {
    @inline
    def apply(
        S3Url: js.UndefOr[S3PresignedUrl] = js.undefined
    ): ExportSnapshotResult = {
      val __obj = js.Dynamic.literal()
      S3Url.foreach(__v => __obj.updateDynamic("S3Url")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportSnapshotResult]
    }
  }

  /** Details about the extension.
    */
  @js.native
  trait ExtensionDetails extends js.Object {
    var Description: js.UndefOr[ExtensionDescription]
    var Name: js.UndefOr[ExtensionName]
    var Namespace: js.UndefOr[ExtensionNamespace]
  }

  object ExtensionDetails {
    @inline
    def apply(
        Description: js.UndefOr[ExtensionDescription] = js.undefined,
        Name: js.UndefOr[ExtensionName] = js.undefined,
        Namespace: js.UndefOr[ExtensionNamespace] = js.undefined
    ): ExtensionDetails = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExtensionDetails]
    }
  }

  /** Details about the extension version.
    */
  @js.native
  trait ExtensionVersionDetails extends js.Object {
    var Name: js.UndefOr[ExtensionName]
    var Namespace: js.UndefOr[ExtensionNamespace]
    var Schema: js.UndefOr[ExtensionVersionSchema]
    var Version: js.UndefOr[ExtensionVersion]
  }

  object ExtensionVersionDetails {
    @inline
    def apply(
        Name: js.UndefOr[ExtensionName] = js.undefined,
        Namespace: js.UndefOr[ExtensionNamespace] = js.undefined,
        Schema: js.UndefOr[ExtensionVersionSchema] = js.undefined,
        Version: js.UndefOr[ExtensionVersion] = js.undefined
    ): ExtensionVersionDetails = {
      val __obj = js.Dynamic.literal()
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      Schema.foreach(__v => __obj.updateDynamic("Schema")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExtensionVersionDetails]
    }
  }

  /** Details about the game configuration. The game configuration is organized into named sections, where the schema of each section is defined by an extension. The schema for these sections can be retrieved using the <code>GetExtensionVersion</code> operation.
    */
  @js.native
  trait GameConfigurationDetails extends js.Object {
    var Created: js.UndefOr[DateTime]
    var LastUpdated: js.UndefOr[DateTime]
    var Sections: js.UndefOr[Sections]
  }

  object GameConfigurationDetails {
    @inline
    def apply(
        Created: js.UndefOr[DateTime] = js.undefined,
        LastUpdated: js.UndefOr[DateTime] = js.undefined,
        Sections: js.UndefOr[Sections] = js.undefined
    ): GameConfigurationDetails = {
      val __obj = js.Dynamic.literal()
      Created.foreach(__v => __obj.updateDynamic("Created")(__v.asInstanceOf[js.Any]))
      LastUpdated.foreach(__v => __obj.updateDynamic("LastUpdated")(__v.asInstanceOf[js.Any]))
      Sections.foreach(__v => __obj.updateDynamic("Sections")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GameConfigurationDetails]
    }
  }

  /** Details about a game.
    */
  @js.native
  trait GameDetails extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Created: js.UndefOr[DateTime]
    var Description: js.UndefOr[GameDescription]
    var EnableTerminationProtection: js.UndefOr[GameTerminationProtection]
    var LastUpdated: js.UndefOr[DateTime]
    var Name: js.UndefOr[GameName]
    var State: js.UndefOr[GameState]
    var Tags: js.UndefOr[TagMap]
  }

  object GameDetails {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Created: js.UndefOr[DateTime] = js.undefined,
        Description: js.UndefOr[GameDescription] = js.undefined,
        EnableTerminationProtection: js.UndefOr[GameTerminationProtection] = js.undefined,
        LastUpdated: js.UndefOr[DateTime] = js.undefined,
        Name: js.UndefOr[GameName] = js.undefined,
        State: js.UndefOr[GameState] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): GameDetails = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Created.foreach(__v => __obj.updateDynamic("Created")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      EnableTerminationProtection.foreach(__v => __obj.updateDynamic("EnableTerminationProtection")(__v.asInstanceOf[js.Any]))
      LastUpdated.foreach(__v => __obj.updateDynamic("LastUpdated")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GameDetails]
    }
  }

  /** The summary of the properties of a game.
    */
  @js.native
  trait GameSummary extends js.Object {
    var Description: js.UndefOr[GameDescription]
    var Name: js.UndefOr[GameName]
    var State: js.UndefOr[GameState]
    var Tags: js.UndefOr[TagMap]
  }

  object GameSummary {
    @inline
    def apply(
        Description: js.UndefOr[GameDescription] = js.undefined,
        Name: js.UndefOr[GameName] = js.undefined,
        State: js.UndefOr[GameState] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): GameSummary = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GameSummary]
    }
  }

  /** Details about a generated code job.
    */
  @js.native
  trait GeneratedCodeJobDetails extends js.Object {
    var Description: js.UndefOr[GeneratedCodeJobDescription]
    var ExpirationTime: js.UndefOr[DateTime]
    var GeneratedCodeJobId: js.UndefOr[GeneratedCodeJobId]
    var S3Url: js.UndefOr[S3PresignedUrl]
    var Status: js.UndefOr[GeneratedCodeJobState]
  }

  object GeneratedCodeJobDetails {
    @inline
    def apply(
        Description: js.UndefOr[GeneratedCodeJobDescription] = js.undefined,
        ExpirationTime: js.UndefOr[DateTime] = js.undefined,
        GeneratedCodeJobId: js.UndefOr[GeneratedCodeJobId] = js.undefined,
        S3Url: js.UndefOr[S3PresignedUrl] = js.undefined,
        Status: js.UndefOr[GeneratedCodeJobState] = js.undefined
    ): GeneratedCodeJobDetails = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ExpirationTime.foreach(__v => __obj.updateDynamic("ExpirationTime")(__v.asInstanceOf[js.Any]))
      GeneratedCodeJobId.foreach(__v => __obj.updateDynamic("GeneratedCodeJobId")(__v.asInstanceOf[js.Any]))
      S3Url.foreach(__v => __obj.updateDynamic("S3Url")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GeneratedCodeJobDetails]
    }
  }

  /** Properties that specify the code generator for a generated code job.
    */
  @js.native
  trait Generator extends js.Object {
    var GameSdkVersion: js.UndefOr[GameSdkVersion]
    var Language: js.UndefOr[Language]
    var TargetPlatform: js.UndefOr[TargetPlatform]
  }

  object Generator {
    @inline
    def apply(
        GameSdkVersion: js.UndefOr[GameSdkVersion] = js.undefined,
        Language: js.UndefOr[Language] = js.undefined,
        TargetPlatform: js.UndefOr[TargetPlatform] = js.undefined
    ): Generator = {
      val __obj = js.Dynamic.literal()
      GameSdkVersion.foreach(__v => __obj.updateDynamic("GameSdkVersion")(__v.asInstanceOf[js.Any]))
      Language.foreach(__v => __obj.updateDynamic("Language")(__v.asInstanceOf[js.Any]))
      TargetPlatform.foreach(__v => __obj.updateDynamic("TargetPlatform")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Generator]
    }
  }

  @js.native
  trait GetExtensionRequest extends js.Object {
    var Name: ExtensionName
    var Namespace: ExtensionNamespace
  }

  object GetExtensionRequest {
    @inline
    def apply(
        Name: ExtensionName,
        Namespace: ExtensionNamespace
    ): GetExtensionRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetExtensionRequest]
    }
  }

  @js.native
  trait GetExtensionResult extends js.Object {
    var Extension: js.UndefOr[ExtensionDetails]
  }

  object GetExtensionResult {
    @inline
    def apply(
        Extension: js.UndefOr[ExtensionDetails] = js.undefined
    ): GetExtensionResult = {
      val __obj = js.Dynamic.literal()
      Extension.foreach(__v => __obj.updateDynamic("Extension")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetExtensionResult]
    }
  }

  @js.native
  trait GetExtensionVersionRequest extends js.Object {
    var ExtensionVersion: ExtensionVersion
    var Name: ExtensionName
    var Namespace: ExtensionNamespace
  }

  object GetExtensionVersionRequest {
    @inline
    def apply(
        ExtensionVersion: ExtensionVersion,
        Name: ExtensionName,
        Namespace: ExtensionNamespace
    ): GetExtensionVersionRequest = {
      val __obj = js.Dynamic.literal(
        "ExtensionVersion" -> ExtensionVersion.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetExtensionVersionRequest]
    }
  }

  @js.native
  trait GetExtensionVersionResult extends js.Object {
    var ExtensionVersion: js.UndefOr[ExtensionVersionDetails]
  }

  object GetExtensionVersionResult {
    @inline
    def apply(
        ExtensionVersion: js.UndefOr[ExtensionVersionDetails] = js.undefined
    ): GetExtensionVersionResult = {
      val __obj = js.Dynamic.literal()
      ExtensionVersion.foreach(__v => __obj.updateDynamic("ExtensionVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetExtensionVersionResult]
    }
  }

  @js.native
  trait GetGameConfigurationRequest extends js.Object {
    var GameName: GameName
    var Sections: js.UndefOr[SectionList]
  }

  object GetGameConfigurationRequest {
    @inline
    def apply(
        GameName: GameName,
        Sections: js.UndefOr[SectionList] = js.undefined
    ): GetGameConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "GameName" -> GameName.asInstanceOf[js.Any]
      )

      Sections.foreach(__v => __obj.updateDynamic("Sections")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGameConfigurationRequest]
    }
  }

  @js.native
  trait GetGameConfigurationResult extends js.Object {
    var GameConfiguration: js.UndefOr[GameConfigurationDetails]
  }

  object GetGameConfigurationResult {
    @inline
    def apply(
        GameConfiguration: js.UndefOr[GameConfigurationDetails] = js.undefined
    ): GetGameConfigurationResult = {
      val __obj = js.Dynamic.literal()
      GameConfiguration.foreach(__v => __obj.updateDynamic("GameConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGameConfigurationResult]
    }
  }

  @js.native
  trait GetGameRequest extends js.Object {
    var GameName: GameName
  }

  object GetGameRequest {
    @inline
    def apply(
        GameName: GameName
    ): GetGameRequest = {
      val __obj = js.Dynamic.literal(
        "GameName" -> GameName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetGameRequest]
    }
  }

  @js.native
  trait GetGameResult extends js.Object {
    var Game: js.UndefOr[GameDetails]
  }

  object GetGameResult {
    @inline
    def apply(
        Game: js.UndefOr[GameDetails] = js.undefined
    ): GetGameResult = {
      val __obj = js.Dynamic.literal()
      Game.foreach(__v => __obj.updateDynamic("Game")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGameResult]
    }
  }

  @js.native
  trait GetGeneratedCodeJobRequest extends js.Object {
    var GameName: GameName
    var JobId: GeneratedCodeJobId
    var SnapshotId: SnapshotId
  }

  object GetGeneratedCodeJobRequest {
    @inline
    def apply(
        GameName: GameName,
        JobId: GeneratedCodeJobId,
        SnapshotId: SnapshotId
    ): GetGeneratedCodeJobRequest = {
      val __obj = js.Dynamic.literal(
        "GameName" -> GameName.asInstanceOf[js.Any],
        "JobId" -> JobId.asInstanceOf[js.Any],
        "SnapshotId" -> SnapshotId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetGeneratedCodeJobRequest]
    }
  }

  @js.native
  trait GetGeneratedCodeJobResult extends js.Object {
    var GeneratedCodeJob: js.UndefOr[GeneratedCodeJobDetails]
  }

  object GetGeneratedCodeJobResult {
    @inline
    def apply(
        GeneratedCodeJob: js.UndefOr[GeneratedCodeJobDetails] = js.undefined
    ): GetGeneratedCodeJobResult = {
      val __obj = js.Dynamic.literal()
      GeneratedCodeJob.foreach(__v => __obj.updateDynamic("GeneratedCodeJob")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGeneratedCodeJobResult]
    }
  }

  @js.native
  trait GetPlayerConnectionStatusRequest extends js.Object {
    var GameName: GameName
    var PlayerId: PlayerId
    var StageName: StageName
  }

  object GetPlayerConnectionStatusRequest {
    @inline
    def apply(
        GameName: GameName,
        PlayerId: PlayerId,
        StageName: StageName
    ): GetPlayerConnectionStatusRequest = {
      val __obj = js.Dynamic.literal(
        "GameName" -> GameName.asInstanceOf[js.Any],
        "PlayerId" -> PlayerId.asInstanceOf[js.Any],
        "StageName" -> StageName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetPlayerConnectionStatusRequest]
    }
  }

  @js.native
  trait GetPlayerConnectionStatusResult extends js.Object {
    var Connections: js.UndefOr[ConnectionList]
  }

  object GetPlayerConnectionStatusResult {
    @inline
    def apply(
        Connections: js.UndefOr[ConnectionList] = js.undefined
    ): GetPlayerConnectionStatusResult = {
      val __obj = js.Dynamic.literal()
      Connections.foreach(__v => __obj.updateDynamic("Connections")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPlayerConnectionStatusResult]
    }
  }

  @js.native
  trait GetSnapshotRequest extends js.Object {
    var GameName: GameName
    var SnapshotId: SnapshotId
    var Sections: js.UndefOr[SectionList]
  }

  object GetSnapshotRequest {
    @inline
    def apply(
        GameName: GameName,
        SnapshotId: SnapshotId,
        Sections: js.UndefOr[SectionList] = js.undefined
    ): GetSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "GameName" -> GameName.asInstanceOf[js.Any],
        "SnapshotId" -> SnapshotId.asInstanceOf[js.Any]
      )

      Sections.foreach(__v => __obj.updateDynamic("Sections")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSnapshotRequest]
    }
  }

  @js.native
  trait GetSnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[SnapshotDetails]
  }

  object GetSnapshotResult {
    @inline
    def apply(
        Snapshot: js.UndefOr[SnapshotDetails] = js.undefined
    ): GetSnapshotResult = {
      val __obj = js.Dynamic.literal()
      Snapshot.foreach(__v => __obj.updateDynamic("Snapshot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSnapshotResult]
    }
  }

  @js.native
  trait GetStageDeploymentRequest extends js.Object {
    var GameName: GameName
    var StageName: StageName
    var DeploymentId: js.UndefOr[DeploymentId]
  }

  object GetStageDeploymentRequest {
    @inline
    def apply(
        GameName: GameName,
        StageName: StageName,
        DeploymentId: js.UndefOr[DeploymentId] = js.undefined
    ): GetStageDeploymentRequest = {
      val __obj = js.Dynamic.literal(
        "GameName" -> GameName.asInstanceOf[js.Any],
        "StageName" -> StageName.asInstanceOf[js.Any]
      )

      DeploymentId.foreach(__v => __obj.updateDynamic("DeploymentId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetStageDeploymentRequest]
    }
  }

  @js.native
  trait GetStageDeploymentResult extends js.Object {
    var StageDeployment: js.UndefOr[StageDeploymentDetails]
  }

  object GetStageDeploymentResult {
    @inline
    def apply(
        StageDeployment: js.UndefOr[StageDeploymentDetails] = js.undefined
    ): GetStageDeploymentResult = {
      val __obj = js.Dynamic.literal()
      StageDeployment.foreach(__v => __obj.updateDynamic("StageDeployment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetStageDeploymentResult]
    }
  }

  @js.native
  trait GetStageRequest extends js.Object {
    var GameName: GameName
    var StageName: StageName
  }

  object GetStageRequest {
    @inline
    def apply(
        GameName: GameName,
        StageName: StageName
    ): GetStageRequest = {
      val __obj = js.Dynamic.literal(
        "GameName" -> GameName.asInstanceOf[js.Any],
        "StageName" -> StageName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetStageRequest]
    }
  }

  @js.native
  trait GetStageResult extends js.Object {
    var Stage: js.UndefOr[StageDetails]
  }

  object GetStageResult {
    @inline
    def apply(
        Stage: js.UndefOr[StageDetails] = js.undefined
    ): GetStageResult = {
      val __obj = js.Dynamic.literal()
      Stage.foreach(__v => __obj.updateDynamic("Stage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetStageResult]
    }
  }

  @js.native
  trait ImportGameConfigurationRequest extends js.Object {
    var GameName: GameName
    var ImportSource: ImportGameConfigurationSource
  }

  object ImportGameConfigurationRequest {
    @inline
    def apply(
        GameName: GameName,
        ImportSource: ImportGameConfigurationSource
    ): ImportGameConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "GameName" -> GameName.asInstanceOf[js.Any],
        "ImportSource" -> ImportSource.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ImportGameConfigurationRequest]
    }
  }

  @js.native
  trait ImportGameConfigurationResult extends js.Object {
    var GameConfiguration: js.UndefOr[GameConfigurationDetails]
  }

  object ImportGameConfigurationResult {
    @inline
    def apply(
        GameConfiguration: js.UndefOr[GameConfigurationDetails] = js.undefined
    ): ImportGameConfigurationResult = {
      val __obj = js.Dynamic.literal()
      GameConfiguration.foreach(__v => __obj.updateDynamic("GameConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportGameConfigurationResult]
    }
  }

  /** The source used to import configuration sections.
    */
  @js.native
  trait ImportGameConfigurationSource extends js.Object {
    var File: RawGameConfigurationData
  }

  object ImportGameConfigurationSource {
    @inline
    def apply(
        File: RawGameConfigurationData
    ): ImportGameConfigurationSource = {
      val __obj = js.Dynamic.literal(
        "File" -> File.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ImportGameConfigurationSource]
    }
  }

  @js.native
  trait ListExtensionVersionsRequest extends js.Object {
    var Name: ExtensionName
    var Namespace: ExtensionNamespace
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListExtensionVersionsRequest {
    @inline
    def apply(
        Name: ExtensionName,
        Namespace: ExtensionNamespace,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListExtensionVersionsRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Namespace" -> Namespace.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExtensionVersionsRequest]
    }
  }

  @js.native
  trait ListExtensionVersionsResult extends js.Object {
    var ExtensionVersions: js.UndefOr[ExtensionVersionDetailsList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListExtensionVersionsResult {
    @inline
    def apply(
        ExtensionVersions: js.UndefOr[ExtensionVersionDetailsList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListExtensionVersionsResult = {
      val __obj = js.Dynamic.literal()
      ExtensionVersions.foreach(__v => __obj.updateDynamic("ExtensionVersions")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExtensionVersionsResult]
    }
  }

  @js.native
  trait ListExtensionsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListExtensionsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListExtensionsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExtensionsRequest]
    }
  }

  @js.native
  trait ListExtensionsResult extends js.Object {
    var Extensions: js.UndefOr[ExtensionDetailsList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListExtensionsResult {
    @inline
    def apply(
        Extensions: js.UndefOr[ExtensionDetailsList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListExtensionsResult = {
      val __obj = js.Dynamic.literal()
      Extensions.foreach(__v => __obj.updateDynamic("Extensions")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListExtensionsResult]
    }
  }

  @js.native
  trait ListGamesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGamesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGamesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGamesRequest]
    }
  }

  @js.native
  trait ListGamesResult extends js.Object {
    var Games: js.UndefOr[GameSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGamesResult {
    @inline
    def apply(
        Games: js.UndefOr[GameSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGamesResult = {
      val __obj = js.Dynamic.literal()
      Games.foreach(__v => __obj.updateDynamic("Games")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGamesResult]
    }
  }

  @js.native
  trait ListGeneratedCodeJobsRequest extends js.Object {
    var GameName: GameName
    var SnapshotId: SnapshotId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGeneratedCodeJobsRequest {
    @inline
    def apply(
        GameName: GameName,
        SnapshotId: SnapshotId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGeneratedCodeJobsRequest = {
      val __obj = js.Dynamic.literal(
        "GameName" -> GameName.asInstanceOf[js.Any],
        "SnapshotId" -> SnapshotId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGeneratedCodeJobsRequest]
    }
  }

  @js.native
  trait ListGeneratedCodeJobsResult extends js.Object {
    var GeneratedCodeJobs: js.UndefOr[GeneratedCodeJobDetailsList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListGeneratedCodeJobsResult {
    @inline
    def apply(
        GeneratedCodeJobs: js.UndefOr[GeneratedCodeJobDetailsList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListGeneratedCodeJobsResult = {
      val __obj = js.Dynamic.literal()
      GeneratedCodeJobs.foreach(__v => __obj.updateDynamic("GeneratedCodeJobs")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGeneratedCodeJobsResult]
    }
  }

  @js.native
  trait ListSnapshotsRequest extends js.Object {
    var GameName: GameName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListSnapshotsRequest {
    @inline
    def apply(
        GameName: GameName,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSnapshotsRequest = {
      val __obj = js.Dynamic.literal(
        "GameName" -> GameName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSnapshotsRequest]
    }
  }

  @js.native
  trait ListSnapshotsResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Snapshots: js.UndefOr[SnapshotSummaryList]
  }

  object ListSnapshotsResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Snapshots: js.UndefOr[SnapshotSummaryList] = js.undefined
    ): ListSnapshotsResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Snapshots.foreach(__v => __obj.updateDynamic("Snapshots")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSnapshotsResult]
    }
  }

  @js.native
  trait ListStageDeploymentsRequest extends js.Object {
    var GameName: GameName
    var StageName: StageName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListStageDeploymentsRequest {
    @inline
    def apply(
        GameName: GameName,
        StageName: StageName,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListStageDeploymentsRequest = {
      val __obj = js.Dynamic.literal(
        "GameName" -> GameName.asInstanceOf[js.Any],
        "StageName" -> StageName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStageDeploymentsRequest]
    }
  }

  @js.native
  trait ListStageDeploymentsResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var StageDeployments: js.UndefOr[StageDeploymentList]
  }

  object ListStageDeploymentsResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        StageDeployments: js.UndefOr[StageDeploymentList] = js.undefined
    ): ListStageDeploymentsResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StageDeployments.foreach(__v => __obj.updateDynamic("StageDeployments")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStageDeploymentsResult]
    }
  }

  @js.native
  trait ListStagesRequest extends js.Object {
    var GameName: GameName
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListStagesRequest {
    @inline
    def apply(
        GameName: GameName,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListStagesRequest = {
      val __obj = js.Dynamic.literal(
        "GameName" -> GameName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStagesRequest]
    }
  }

  @js.native
  trait ListStagesResult extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Stages: js.UndefOr[StageSummaryList]
  }

  object ListStagesResult {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Stages: js.UndefOr[StageSummaryList] = js.undefined
    ): ListStagesResult = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Stages.foreach(__v => __obj.updateDynamic("Stages")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStagesResult]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResult extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResult {
    @inline
    def apply(
        tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResult = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResult]
    }
  }

  /** The configuration section.
    */
  @js.native
  trait Section extends js.Object {
    var Attributes: js.UndefOr[Document]
    var Name: js.UndefOr[SectionName]
    var Size: js.UndefOr[ByteSize]
  }

  object Section {
    @inline
    def apply(
        Attributes: js.UndefOr[Document] = js.undefined,
        Name: js.UndefOr[SectionName] = js.undefined,
        Size: js.UndefOr[ByteSize] = js.undefined
    ): Section = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Size.foreach(__v => __obj.updateDynamic("Size")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Section]
    }
  }

  /** A single modification to the configuration section.
    */
  @js.native
  trait SectionModification extends js.Object {
    var Operation: Operation
    var Path: Path
    var Section: SectionName
    var Value: js.UndefOr[Document]
  }

  object SectionModification {
    @inline
    def apply(
        Operation: Operation,
        Path: Path,
        Section: SectionName,
        Value: js.UndefOr[Document] = js.undefined
    ): SectionModification = {
      val __obj = js.Dynamic.literal(
        "Operation" -> Operation.asInstanceOf[js.Any],
        "Path" -> Path.asInstanceOf[js.Any],
        "Section" -> Section.asInstanceOf[js.Any]
      )

      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SectionModification]
    }
  }

  /** Properties that provide details of a snapshot.
    */
  @js.native
  trait SnapshotDetails extends js.Object {
    var Created: js.UndefOr[DateTime]
    var Description: js.UndefOr[SnapshotDescription]
    var Id: js.UndefOr[SnapshotId]
    var LastUpdated: js.UndefOr[DateTime]
    var Sections: js.UndefOr[Sections]
  }

  object SnapshotDetails {
    @inline
    def apply(
        Created: js.UndefOr[DateTime] = js.undefined,
        Description: js.UndefOr[SnapshotDescription] = js.undefined,
        Id: js.UndefOr[SnapshotId] = js.undefined,
        LastUpdated: js.UndefOr[DateTime] = js.undefined,
        Sections: js.UndefOr[Sections] = js.undefined
    ): SnapshotDetails = {
      val __obj = js.Dynamic.literal()
      Created.foreach(__v => __obj.updateDynamic("Created")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LastUpdated.foreach(__v => __obj.updateDynamic("LastUpdated")(__v.asInstanceOf[js.Any]))
      Sections.foreach(__v => __obj.updateDynamic("Sections")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SnapshotDetails]
    }
  }

  /** The summary of the properties of a snapshot.
    */
  @js.native
  trait SnapshotSummary extends js.Object {
    var Created: js.UndefOr[DateTime]
    var Description: js.UndefOr[SnapshotDescription]
    var Id: js.UndefOr[SnapshotId]
    var LastUpdated: js.UndefOr[DateTime]
  }

  object SnapshotSummary {
    @inline
    def apply(
        Created: js.UndefOr[DateTime] = js.undefined,
        Description: js.UndefOr[SnapshotDescription] = js.undefined,
        Id: js.UndefOr[SnapshotId] = js.undefined,
        LastUpdated: js.UndefOr[DateTime] = js.undefined
    ): SnapshotSummary = {
      val __obj = js.Dynamic.literal()
      Created.foreach(__v => __obj.updateDynamic("Created")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LastUpdated.foreach(__v => __obj.updateDynamic("LastUpdated")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SnapshotSummary]
    }
  }

  /** Properties that provide details of a stage deployment.
    */
  @js.native
  trait StageDeploymentDetails extends js.Object {
    var Created: js.UndefOr[DateTime]
    var DeploymentAction: js.UndefOr[DeploymentAction]
    var DeploymentId: js.UndefOr[DeploymentId]
    var DeploymentResult: js.UndefOr[DeploymentResult]
    var DeploymentState: js.UndefOr[DeploymentState]
    var LastUpdated: js.UndefOr[DateTime]
    var SnapshotId: js.UndefOr[SnapshotId]
  }

  object StageDeploymentDetails {
    @inline
    def apply(
        Created: js.UndefOr[DateTime] = js.undefined,
        DeploymentAction: js.UndefOr[DeploymentAction] = js.undefined,
        DeploymentId: js.UndefOr[DeploymentId] = js.undefined,
        DeploymentResult: js.UndefOr[DeploymentResult] = js.undefined,
        DeploymentState: js.UndefOr[DeploymentState] = js.undefined,
        LastUpdated: js.UndefOr[DateTime] = js.undefined,
        SnapshotId: js.UndefOr[SnapshotId] = js.undefined
    ): StageDeploymentDetails = {
      val __obj = js.Dynamic.literal()
      Created.foreach(__v => __obj.updateDynamic("Created")(__v.asInstanceOf[js.Any]))
      DeploymentAction.foreach(__v => __obj.updateDynamic("DeploymentAction")(__v.asInstanceOf[js.Any]))
      DeploymentId.foreach(__v => __obj.updateDynamic("DeploymentId")(__v.asInstanceOf[js.Any]))
      DeploymentResult.foreach(__v => __obj.updateDynamic("DeploymentResult")(__v.asInstanceOf[js.Any]))
      DeploymentState.foreach(__v => __obj.updateDynamic("DeploymentState")(__v.asInstanceOf[js.Any]))
      LastUpdated.foreach(__v => __obj.updateDynamic("LastUpdated")(__v.asInstanceOf[js.Any]))
      SnapshotId.foreach(__v => __obj.updateDynamic("SnapshotId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StageDeploymentDetails]
    }
  }

  /** The summary of the properties of a stage deployment.
    */
  @js.native
  trait StageDeploymentSummary extends js.Object {
    var DeploymentAction: js.UndefOr[DeploymentAction]
    var DeploymentId: js.UndefOr[DeploymentId]
    var DeploymentResult: js.UndefOr[DeploymentResult]
    var DeploymentState: js.UndefOr[DeploymentState]
    var LastUpdated: js.UndefOr[DateTime]
    var SnapshotId: js.UndefOr[SnapshotId]
  }

  object StageDeploymentSummary {
    @inline
    def apply(
        DeploymentAction: js.UndefOr[DeploymentAction] = js.undefined,
        DeploymentId: js.UndefOr[DeploymentId] = js.undefined,
        DeploymentResult: js.UndefOr[DeploymentResult] = js.undefined,
        DeploymentState: js.UndefOr[DeploymentState] = js.undefined,
        LastUpdated: js.UndefOr[DateTime] = js.undefined,
        SnapshotId: js.UndefOr[SnapshotId] = js.undefined
    ): StageDeploymentSummary = {
      val __obj = js.Dynamic.literal()
      DeploymentAction.foreach(__v => __obj.updateDynamic("DeploymentAction")(__v.asInstanceOf[js.Any]))
      DeploymentId.foreach(__v => __obj.updateDynamic("DeploymentId")(__v.asInstanceOf[js.Any]))
      DeploymentResult.foreach(__v => __obj.updateDynamic("DeploymentResult")(__v.asInstanceOf[js.Any]))
      DeploymentState.foreach(__v => __obj.updateDynamic("DeploymentState")(__v.asInstanceOf[js.Any]))
      LastUpdated.foreach(__v => __obj.updateDynamic("LastUpdated")(__v.asInstanceOf[js.Any]))
      SnapshotId.foreach(__v => __obj.updateDynamic("SnapshotId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StageDeploymentSummary]
    }
  }

  /** Properties that provide details of a stage.
    */
  @js.native
  trait StageDetails extends js.Object {
    var Arn: js.UndefOr[ARN]
    var Created: js.UndefOr[DateTime]
    var Description: js.UndefOr[StageDescription]
    var GameKey: js.UndefOr[GameKey]
    var LastUpdated: js.UndefOr[DateTime]
    var LogGroup: js.UndefOr[LogGroupName]
    var Name: js.UndefOr[StageName]
    var Role: js.UndefOr[RoleARN]
    var State: js.UndefOr[StageState]
    var Tags: js.UndefOr[TagMap]
  }

  object StageDetails {
    @inline
    def apply(
        Arn: js.UndefOr[ARN] = js.undefined,
        Created: js.UndefOr[DateTime] = js.undefined,
        Description: js.UndefOr[StageDescription] = js.undefined,
        GameKey: js.UndefOr[GameKey] = js.undefined,
        LastUpdated: js.UndefOr[DateTime] = js.undefined,
        LogGroup: js.UndefOr[LogGroupName] = js.undefined,
        Name: js.UndefOr[StageName] = js.undefined,
        Role: js.UndefOr[RoleARN] = js.undefined,
        State: js.UndefOr[StageState] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): StageDetails = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Created.foreach(__v => __obj.updateDynamic("Created")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      GameKey.foreach(__v => __obj.updateDynamic("GameKey")(__v.asInstanceOf[js.Any]))
      LastUpdated.foreach(__v => __obj.updateDynamic("LastUpdated")(__v.asInstanceOf[js.Any]))
      LogGroup.foreach(__v => __obj.updateDynamic("LogGroup")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.updateDynamic("Role")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StageDetails]
    }
  }

  /** The summary of the properties of a stage.
    */
  @js.native
  trait StageSummary extends js.Object {
    var Description: js.UndefOr[StageDescription]
    var GameKey: js.UndefOr[GameKey]
    var Name: js.UndefOr[StageName]
    var State: js.UndefOr[StageState]
    var Tags: js.UndefOr[TagMap]
  }

  object StageSummary {
    @inline
    def apply(
        Description: js.UndefOr[StageDescription] = js.undefined,
        GameKey: js.UndefOr[GameKey] = js.undefined,
        Name: js.UndefOr[StageName] = js.undefined,
        State: js.UndefOr[StageState] = js.undefined,
        Tags: js.UndefOr[TagMap] = js.undefined
    ): StageSummary = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      GameKey.foreach(__v => __obj.updateDynamic("GameKey")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StageSummary]
    }
  }

  @js.native
  trait StartGeneratedCodeJobRequest extends js.Object {
    var GameName: GameName
    var Generator: Generator
    var SnapshotId: SnapshotId
  }

  object StartGeneratedCodeJobRequest {
    @inline
    def apply(
        GameName: GameName,
        Generator: Generator,
        SnapshotId: SnapshotId
    ): StartGeneratedCodeJobRequest = {
      val __obj = js.Dynamic.literal(
        "GameName" -> GameName.asInstanceOf[js.Any],
        "Generator" -> Generator.asInstanceOf[js.Any],
        "SnapshotId" -> SnapshotId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartGeneratedCodeJobRequest]
    }
  }

  @js.native
  trait StartGeneratedCodeJobResult extends js.Object {
    var GeneratedCodeJobId: js.UndefOr[GeneratedCodeJobId]
  }

  object StartGeneratedCodeJobResult {
    @inline
    def apply(
        GeneratedCodeJobId: js.UndefOr[GeneratedCodeJobId] = js.undefined
    ): StartGeneratedCodeJobResult = {
      val __obj = js.Dynamic.literal()
      GeneratedCodeJobId.foreach(__v => __obj.updateDynamic("GeneratedCodeJobId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartGeneratedCodeJobResult]
    }
  }

  @js.native
  trait StartStageDeploymentRequest extends js.Object {
    var GameName: GameName
    var SnapshotId: SnapshotId
    var StageName: StageName
    var ClientToken: js.UndefOr[ClientToken]
  }

  object StartStageDeploymentRequest {
    @inline
    def apply(
        GameName: GameName,
        SnapshotId: SnapshotId,
        StageName: StageName,
        ClientToken: js.UndefOr[ClientToken] = js.undefined
    ): StartStageDeploymentRequest = {
      val __obj = js.Dynamic.literal(
        "GameName" -> GameName.asInstanceOf[js.Any],
        "SnapshotId" -> SnapshotId.asInstanceOf[js.Any],
        "StageName" -> StageName.asInstanceOf[js.Any]
      )

      ClientToken.foreach(__v => __obj.updateDynamic("ClientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartStageDeploymentRequest]
    }
  }

  @js.native
  trait StartStageDeploymentResult extends js.Object {
    var StageDeployment: js.UndefOr[StageDeploymentDetails]
  }

  object StartStageDeploymentResult {
    @inline
    def apply(
        StageDeployment: js.UndefOr[StageDeploymentDetails] = js.undefined
    ): StartStageDeploymentResult = {
      val __obj = js.Dynamic.literal()
      StageDeployment.foreach(__v => __obj.updateDynamic("StageDeployment")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartStageDeploymentResult]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn,
        tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResult extends js.Object

  object TagResourceResult {
    @inline
    def apply(): TagResourceResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResult]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: ResourceArn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: ResourceArn,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResult extends js.Object

  object UntagResourceResult {
    @inline
    def apply(): UntagResourceResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResult]
    }
  }

  @js.native
  trait UpdateGameConfigurationRequest extends js.Object {
    var GameName: GameName
    var Modifications: SectionModificationList
  }

  object UpdateGameConfigurationRequest {
    @inline
    def apply(
        GameName: GameName,
        Modifications: SectionModificationList
    ): UpdateGameConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "GameName" -> GameName.asInstanceOf[js.Any],
        "Modifications" -> Modifications.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateGameConfigurationRequest]
    }
  }

  @js.native
  trait UpdateGameConfigurationResult extends js.Object {
    var GameConfiguration: js.UndefOr[GameConfigurationDetails]
  }

  object UpdateGameConfigurationResult {
    @inline
    def apply(
        GameConfiguration: js.UndefOr[GameConfigurationDetails] = js.undefined
    ): UpdateGameConfigurationResult = {
      val __obj = js.Dynamic.literal()
      GameConfiguration.foreach(__v => __obj.updateDynamic("GameConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGameConfigurationResult]
    }
  }

  @js.native
  trait UpdateGameRequest extends js.Object {
    var GameName: GameName
    var Description: js.UndefOr[GameDescription]
  }

  object UpdateGameRequest {
    @inline
    def apply(
        GameName: GameName,
        Description: js.UndefOr[GameDescription] = js.undefined
    ): UpdateGameRequest = {
      val __obj = js.Dynamic.literal(
        "GameName" -> GameName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGameRequest]
    }
  }

  @js.native
  trait UpdateGameResult extends js.Object {
    var Game: js.UndefOr[GameDetails]
  }

  object UpdateGameResult {
    @inline
    def apply(
        Game: js.UndefOr[GameDetails] = js.undefined
    ): UpdateGameResult = {
      val __obj = js.Dynamic.literal()
      Game.foreach(__v => __obj.updateDynamic("Game")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGameResult]
    }
  }

  @js.native
  trait UpdateSnapshotRequest extends js.Object {
    var GameName: GameName
    var SnapshotId: SnapshotId
    var Description: js.UndefOr[SnapshotDescription]
  }

  object UpdateSnapshotRequest {
    @inline
    def apply(
        GameName: GameName,
        SnapshotId: SnapshotId,
        Description: js.UndefOr[SnapshotDescription] = js.undefined
    ): UpdateSnapshotRequest = {
      val __obj = js.Dynamic.literal(
        "GameName" -> GameName.asInstanceOf[js.Any],
        "SnapshotId" -> SnapshotId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSnapshotRequest]
    }
  }

  @js.native
  trait UpdateSnapshotResult extends js.Object {
    var Snapshot: js.UndefOr[SnapshotDetails]
  }

  object UpdateSnapshotResult {
    @inline
    def apply(
        Snapshot: js.UndefOr[SnapshotDetails] = js.undefined
    ): UpdateSnapshotResult = {
      val __obj = js.Dynamic.literal()
      Snapshot.foreach(__v => __obj.updateDynamic("Snapshot")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSnapshotResult]
    }
  }

  @js.native
  trait UpdateStageRequest extends js.Object {
    var GameName: GameName
    var StageName: StageName
    var Description: js.UndefOr[StageDescription]
    var Role: js.UndefOr[RoleARN]
  }

  object UpdateStageRequest {
    @inline
    def apply(
        GameName: GameName,
        StageName: StageName,
        Description: js.UndefOr[StageDescription] = js.undefined,
        Role: js.UndefOr[RoleARN] = js.undefined
    ): UpdateStageRequest = {
      val __obj = js.Dynamic.literal(
        "GameName" -> GameName.asInstanceOf[js.Any],
        "StageName" -> StageName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.updateDynamic("Role")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateStageRequest]
    }
  }

  @js.native
  trait UpdateStageResult extends js.Object {
    var Stage: js.UndefOr[StageDetails]
  }

  object UpdateStageResult {
    @inline
    def apply(
        Stage: js.UndefOr[StageDetails] = js.undefined
    ): UpdateStageResult = {
      val __obj = js.Dynamic.literal()
      Stage.foreach(__v => __obj.updateDynamic("Stage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateStageResult]
    }
  }
}
