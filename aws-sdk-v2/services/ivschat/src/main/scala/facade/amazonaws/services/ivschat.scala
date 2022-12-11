package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object ivschat {
  type BucketName = String
  type ChatToken = String
  type ChatTokenAttributes = js.Dictionary[String]
  type ChatTokenCapabilities = js.Array[ChatTokenCapability]
  type DeliveryStreamName = String
  type EventAttributes = js.Dictionary[String]
  type EventName = String
  type ID = String
  type LambdaArn = String
  type LogGroupName = String
  type LoggingConfigurationArn = String
  type LoggingConfigurationID = String
  type LoggingConfigurationIdentifier = String
  type LoggingConfigurationIdentifierList = js.Array[LoggingConfigurationIdentifier]
  type LoggingConfigurationList = js.Array[LoggingConfigurationSummary]
  type LoggingConfigurationName = String
  type MaxLoggingConfigurationResults = Int
  type MaxRoomResults = Int
  type MessageID = String
  type PaginationToken = String
  type Reason = String
  type ResourceArn = String
  type RoomArn = String
  type RoomID = String
  type RoomIdentifier = String
  type RoomList = js.Array[RoomSummary]
  type RoomMaxMessageLength = Int
  type RoomMaxMessageRatePerSecond = Int
  type RoomName = String
  type SessionDurationInMinutes = Int
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagValue = String
  type Tags = js.Dictionary[TagValue]
  type Time = js.Date
  type UserID = String

  final class IVSChatOps(private val service: IVSChat) extends AnyVal {

    @inline def createChatTokenFuture(params: CreateChatTokenRequest): Future[CreateChatTokenResponse] = service.createChatToken(params).promise().toFuture
    @inline def createLoggingConfigurationFuture(params: CreateLoggingConfigurationRequest): Future[CreateLoggingConfigurationResponse] = service.createLoggingConfiguration(params).promise().toFuture
    @inline def createRoomFuture(params: CreateRoomRequest): Future[CreateRoomResponse] = service.createRoom(params).promise().toFuture
    @inline def deleteLoggingConfigurationFuture(params: DeleteLoggingConfigurationRequest): Future[js.Object] = service.deleteLoggingConfiguration(params).promise().toFuture
    @inline def deleteMessageFuture(params: DeleteMessageRequest): Future[DeleteMessageResponse] = service.deleteMessage(params).promise().toFuture
    @inline def deleteRoomFuture(params: DeleteRoomRequest): Future[js.Object] = service.deleteRoom(params).promise().toFuture
    @inline def disconnectUserFuture(params: DisconnectUserRequest): Future[DisconnectUserResponse] = service.disconnectUser(params).promise().toFuture
    @inline def getLoggingConfigurationFuture(params: GetLoggingConfigurationRequest): Future[GetLoggingConfigurationResponse] = service.getLoggingConfiguration(params).promise().toFuture
    @inline def getRoomFuture(params: GetRoomRequest): Future[GetRoomResponse] = service.getRoom(params).promise().toFuture
    @inline def listLoggingConfigurationsFuture(params: ListLoggingConfigurationsRequest): Future[ListLoggingConfigurationsResponse] = service.listLoggingConfigurations(params).promise().toFuture
    @inline def listRoomsFuture(params: ListRoomsRequest): Future[ListRoomsResponse] = service.listRooms(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def sendEventFuture(params: SendEventRequest): Future[SendEventResponse] = service.sendEvent(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateLoggingConfigurationFuture(params: UpdateLoggingConfigurationRequest): Future[UpdateLoggingConfigurationResponse] = service.updateLoggingConfiguration(params).promise().toFuture
    @inline def updateRoomFuture(params: UpdateRoomRequest): Future[UpdateRoomResponse] = service.updateRoom(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/ivschat", JSImport.Namespace, "AWS.Ivschat")
  class IVSChat() extends js.Object {
    def this(config: AWSConfig) = this()

    def createChatToken(params: CreateChatTokenRequest): Request[CreateChatTokenResponse] = js.native
    def createLoggingConfiguration(params: CreateLoggingConfigurationRequest): Request[CreateLoggingConfigurationResponse] = js.native
    def createRoom(params: CreateRoomRequest): Request[CreateRoomResponse] = js.native
    def deleteLoggingConfiguration(params: DeleteLoggingConfigurationRequest): Request[js.Object] = js.native
    def deleteMessage(params: DeleteMessageRequest): Request[DeleteMessageResponse] = js.native
    def deleteRoom(params: DeleteRoomRequest): Request[js.Object] = js.native
    def disconnectUser(params: DisconnectUserRequest): Request[DisconnectUserResponse] = js.native
    def getLoggingConfiguration(params: GetLoggingConfigurationRequest): Request[GetLoggingConfigurationResponse] = js.native
    def getRoom(params: GetRoomRequest): Request[GetRoomResponse] = js.native
    def listLoggingConfigurations(params: ListLoggingConfigurationsRequest): Request[ListLoggingConfigurationsResponse] = js.native
    def listRooms(params: ListRoomsRequest): Request[ListRoomsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def sendEvent(params: SendEventRequest): Request[SendEventResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateLoggingConfiguration(params: UpdateLoggingConfigurationRequest): Request[UpdateLoggingConfigurationResponse] = js.native
    def updateRoom(params: UpdateRoomRequest): Request[UpdateRoomResponse] = js.native
  }
  object IVSChat {
    @inline implicit def toOps(service: IVSChat): IVSChatOps = {
      new IVSChatOps(service)
    }
  }

  /** Specifies a CloudWatch Logs location where chat logs will be stored.
    */
  @js.native
  trait CloudWatchLogsDestinationConfiguration extends js.Object {
    var logGroupName: LogGroupName
  }

  object CloudWatchLogsDestinationConfiguration {
    @inline
    def apply(
        logGroupName: LogGroupName
    ): CloudWatchLogsDestinationConfiguration = {
      val __obj = js.Dynamic.literal(
        "logGroupName" -> logGroupName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CloudWatchLogsDestinationConfiguration]
    }
  }

  @js.native
  trait CreateChatTokenRequest extends js.Object {
    var roomIdentifier: RoomIdentifier
    var userId: UserID
    var attributes: js.UndefOr[ChatTokenAttributes]
    var capabilities: js.UndefOr[ChatTokenCapabilities]
    var sessionDurationInMinutes: js.UndefOr[SessionDurationInMinutes]
  }

  object CreateChatTokenRequest {
    @inline
    def apply(
        roomIdentifier: RoomIdentifier,
        userId: UserID,
        attributes: js.UndefOr[ChatTokenAttributes] = js.undefined,
        capabilities: js.UndefOr[ChatTokenCapabilities] = js.undefined,
        sessionDurationInMinutes: js.UndefOr[SessionDurationInMinutes] = js.undefined
    ): CreateChatTokenRequest = {
      val __obj = js.Dynamic.literal(
        "roomIdentifier" -> roomIdentifier.asInstanceOf[js.Any],
        "userId" -> userId.asInstanceOf[js.Any]
      )

      attributes.foreach(__v => __obj.updateDynamic("attributes")(__v.asInstanceOf[js.Any]))
      capabilities.foreach(__v => __obj.updateDynamic("capabilities")(__v.asInstanceOf[js.Any]))
      sessionDurationInMinutes.foreach(__v => __obj.updateDynamic("sessionDurationInMinutes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateChatTokenRequest]
    }
  }

  @js.native
  trait CreateChatTokenResponse extends js.Object {
    var sessionExpirationTime: js.UndefOr[Time]
    var token: js.UndefOr[ChatToken]
    var tokenExpirationTime: js.UndefOr[Time]
  }

  object CreateChatTokenResponse {
    @inline
    def apply(
        sessionExpirationTime: js.UndefOr[Time] = js.undefined,
        token: js.UndefOr[ChatToken] = js.undefined,
        tokenExpirationTime: js.UndefOr[Time] = js.undefined
    ): CreateChatTokenResponse = {
      val __obj = js.Dynamic.literal()
      sessionExpirationTime.foreach(__v => __obj.updateDynamic("sessionExpirationTime")(__v.asInstanceOf[js.Any]))
      token.foreach(__v => __obj.updateDynamic("token")(__v.asInstanceOf[js.Any]))
      tokenExpirationTime.foreach(__v => __obj.updateDynamic("tokenExpirationTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateChatTokenResponse]
    }
  }

  @js.native
  trait CreateLoggingConfigurationRequest extends js.Object {
    var destinationConfiguration: DestinationConfiguration
    var name: js.UndefOr[LoggingConfigurationName]
    var tags: js.UndefOr[Tags]
  }

  object CreateLoggingConfigurationRequest {
    @inline
    def apply(
        destinationConfiguration: DestinationConfiguration,
        name: js.UndefOr[LoggingConfigurationName] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateLoggingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "destinationConfiguration" -> destinationConfiguration.asInstanceOf[js.Any]
      )

      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLoggingConfigurationRequest]
    }
  }

  @js.native
  trait CreateLoggingConfigurationResponse extends js.Object {
    var arn: js.UndefOr[LoggingConfigurationArn]
    var createTime: js.UndefOr[Time]
    var destinationConfiguration: js.UndefOr[DestinationConfiguration]
    var id: js.UndefOr[LoggingConfigurationID]
    var name: js.UndefOr[LoggingConfigurationName]
    var state: js.UndefOr[CreateLoggingConfigurationState]
    var tags: js.UndefOr[Tags]
    var updateTime: js.UndefOr[Time]
  }

  object CreateLoggingConfigurationResponse {
    @inline
    def apply(
        arn: js.UndefOr[LoggingConfigurationArn] = js.undefined,
        createTime: js.UndefOr[Time] = js.undefined,
        destinationConfiguration: js.UndefOr[DestinationConfiguration] = js.undefined,
        id: js.UndefOr[LoggingConfigurationID] = js.undefined,
        name: js.UndefOr[LoggingConfigurationName] = js.undefined,
        state: js.UndefOr[CreateLoggingConfigurationState] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined,
        updateTime: js.UndefOr[Time] = js.undefined
    ): CreateLoggingConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createTime.foreach(__v => __obj.updateDynamic("createTime")(__v.asInstanceOf[js.Any]))
      destinationConfiguration.foreach(__v => __obj.updateDynamic("destinationConfiguration")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      updateTime.foreach(__v => __obj.updateDynamic("updateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLoggingConfigurationResponse]
    }
  }

  @js.native
  trait CreateRoomRequest extends js.Object {
    var loggingConfigurationIdentifiers: js.UndefOr[LoggingConfigurationIdentifierList]
    var maximumMessageLength: js.UndefOr[RoomMaxMessageLength]
    var maximumMessageRatePerSecond: js.UndefOr[RoomMaxMessageRatePerSecond]
    var messageReviewHandler: js.UndefOr[MessageReviewHandler]
    var name: js.UndefOr[RoomName]
    var tags: js.UndefOr[Tags]
  }

  object CreateRoomRequest {
    @inline
    def apply(
        loggingConfigurationIdentifiers: js.UndefOr[LoggingConfigurationIdentifierList] = js.undefined,
        maximumMessageLength: js.UndefOr[RoomMaxMessageLength] = js.undefined,
        maximumMessageRatePerSecond: js.UndefOr[RoomMaxMessageRatePerSecond] = js.undefined,
        messageReviewHandler: js.UndefOr[MessageReviewHandler] = js.undefined,
        name: js.UndefOr[RoomName] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined
    ): CreateRoomRequest = {
      val __obj = js.Dynamic.literal()
      loggingConfigurationIdentifiers.foreach(__v => __obj.updateDynamic("loggingConfigurationIdentifiers")(__v.asInstanceOf[js.Any]))
      maximumMessageLength.foreach(__v => __obj.updateDynamic("maximumMessageLength")(__v.asInstanceOf[js.Any]))
      maximumMessageRatePerSecond.foreach(__v => __obj.updateDynamic("maximumMessageRatePerSecond")(__v.asInstanceOf[js.Any]))
      messageReviewHandler.foreach(__v => __obj.updateDynamic("messageReviewHandler")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRoomRequest]
    }
  }

  @js.native
  trait CreateRoomResponse extends js.Object {
    var arn: js.UndefOr[RoomArn]
    var createTime: js.UndefOr[Time]
    var id: js.UndefOr[RoomID]
    var loggingConfigurationIdentifiers: js.UndefOr[LoggingConfigurationIdentifierList]
    var maximumMessageLength: js.UndefOr[RoomMaxMessageLength]
    var maximumMessageRatePerSecond: js.UndefOr[RoomMaxMessageRatePerSecond]
    var messageReviewHandler: js.UndefOr[MessageReviewHandler]
    var name: js.UndefOr[RoomName]
    var tags: js.UndefOr[Tags]
    var updateTime: js.UndefOr[Time]
  }

  object CreateRoomResponse {
    @inline
    def apply(
        arn: js.UndefOr[RoomArn] = js.undefined,
        createTime: js.UndefOr[Time] = js.undefined,
        id: js.UndefOr[RoomID] = js.undefined,
        loggingConfigurationIdentifiers: js.UndefOr[LoggingConfigurationIdentifierList] = js.undefined,
        maximumMessageLength: js.UndefOr[RoomMaxMessageLength] = js.undefined,
        maximumMessageRatePerSecond: js.UndefOr[RoomMaxMessageRatePerSecond] = js.undefined,
        messageReviewHandler: js.UndefOr[MessageReviewHandler] = js.undefined,
        name: js.UndefOr[RoomName] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined,
        updateTime: js.UndefOr[Time] = js.undefined
    ): CreateRoomResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createTime.foreach(__v => __obj.updateDynamic("createTime")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      loggingConfigurationIdentifiers.foreach(__v => __obj.updateDynamic("loggingConfigurationIdentifiers")(__v.asInstanceOf[js.Any]))
      maximumMessageLength.foreach(__v => __obj.updateDynamic("maximumMessageLength")(__v.asInstanceOf[js.Any]))
      maximumMessageRatePerSecond.foreach(__v => __obj.updateDynamic("maximumMessageRatePerSecond")(__v.asInstanceOf[js.Any]))
      messageReviewHandler.foreach(__v => __obj.updateDynamic("messageReviewHandler")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      updateTime.foreach(__v => __obj.updateDynamic("updateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRoomResponse]
    }
  }

  @js.native
  trait DeleteLoggingConfigurationRequest extends js.Object {
    var identifier: LoggingConfigurationIdentifier
  }

  object DeleteLoggingConfigurationRequest {
    @inline
    def apply(
        identifier: LoggingConfigurationIdentifier
    ): DeleteLoggingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "identifier" -> identifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteLoggingConfigurationRequest]
    }
  }

  @js.native
  trait DeleteMessageRequest extends js.Object {
    var id: MessageID
    var roomIdentifier: RoomIdentifier
    var reason: js.UndefOr[Reason]
  }

  object DeleteMessageRequest {
    @inline
    def apply(
        id: MessageID,
        roomIdentifier: RoomIdentifier,
        reason: js.UndefOr[Reason] = js.undefined
    ): DeleteMessageRequest = {
      val __obj = js.Dynamic.literal(
        "id" -> id.asInstanceOf[js.Any],
        "roomIdentifier" -> roomIdentifier.asInstanceOf[js.Any]
      )

      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteMessageRequest]
    }
  }

  @js.native
  trait DeleteMessageResponse extends js.Object {
    var id: js.UndefOr[ID]
  }

  object DeleteMessageResponse {
    @inline
    def apply(
        id: js.UndefOr[ID] = js.undefined
    ): DeleteMessageResponse = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteMessageResponse]
    }
  }

  @js.native
  trait DeleteRoomRequest extends js.Object {
    var identifier: RoomIdentifier
  }

  object DeleteRoomRequest {
    @inline
    def apply(
        identifier: RoomIdentifier
    ): DeleteRoomRequest = {
      val __obj = js.Dynamic.literal(
        "identifier" -> identifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteRoomRequest]
    }
  }

  /** A complex type that describes a location where chat logs will be stored. Each member represents the configuration of one log destination. For logging, you define only one type of destination (for CloudWatch Logs, Kinesis Firehose, or S3).
    */
  @js.native
  trait DestinationConfiguration extends js.Object {
    var cloudWatchLogs: js.UndefOr[CloudWatchLogsDestinationConfiguration]
    var firehose: js.UndefOr[FirehoseDestinationConfiguration]
    var s3: js.UndefOr[S3DestinationConfiguration]
  }

  object DestinationConfiguration {
    @inline
    def apply(
        cloudWatchLogs: js.UndefOr[CloudWatchLogsDestinationConfiguration] = js.undefined,
        firehose: js.UndefOr[FirehoseDestinationConfiguration] = js.undefined,
        s3: js.UndefOr[S3DestinationConfiguration] = js.undefined
    ): DestinationConfiguration = {
      val __obj = js.Dynamic.literal()
      cloudWatchLogs.foreach(__v => __obj.updateDynamic("cloudWatchLogs")(__v.asInstanceOf[js.Any]))
      firehose.foreach(__v => __obj.updateDynamic("firehose")(__v.asInstanceOf[js.Any]))
      s3.foreach(__v => __obj.updateDynamic("s3")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DestinationConfiguration]
    }
  }

  @js.native
  trait DisconnectUserRequest extends js.Object {
    var roomIdentifier: RoomIdentifier
    var userId: UserID
    var reason: js.UndefOr[Reason]
  }

  object DisconnectUserRequest {
    @inline
    def apply(
        roomIdentifier: RoomIdentifier,
        userId: UserID,
        reason: js.UndefOr[Reason] = js.undefined
    ): DisconnectUserRequest = {
      val __obj = js.Dynamic.literal(
        "roomIdentifier" -> roomIdentifier.asInstanceOf[js.Any],
        "userId" -> userId.asInstanceOf[js.Any]
      )

      reason.foreach(__v => __obj.updateDynamic("reason")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisconnectUserRequest]
    }
  }

  @js.native
  trait DisconnectUserResponse extends js.Object

  object DisconnectUserResponse {
    @inline
    def apply(): DisconnectUserResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisconnectUserResponse]
    }
  }

  /** Specifies a Kinesis Firehose location where chat logs will be stored.
    */
  @js.native
  trait FirehoseDestinationConfiguration extends js.Object {
    var deliveryStreamName: DeliveryStreamName
  }

  object FirehoseDestinationConfiguration {
    @inline
    def apply(
        deliveryStreamName: DeliveryStreamName
    ): FirehoseDestinationConfiguration = {
      val __obj = js.Dynamic.literal(
        "deliveryStreamName" -> deliveryStreamName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FirehoseDestinationConfiguration]
    }
  }

  @js.native
  trait GetLoggingConfigurationRequest extends js.Object {
    var identifier: LoggingConfigurationIdentifier
  }

  object GetLoggingConfigurationRequest {
    @inline
    def apply(
        identifier: LoggingConfigurationIdentifier
    ): GetLoggingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "identifier" -> identifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetLoggingConfigurationRequest]
    }
  }

  @js.native
  trait GetLoggingConfigurationResponse extends js.Object {
    var arn: js.UndefOr[LoggingConfigurationArn]
    var createTime: js.UndefOr[Time]
    var destinationConfiguration: js.UndefOr[DestinationConfiguration]
    var id: js.UndefOr[LoggingConfigurationID]
    var name: js.UndefOr[LoggingConfigurationName]
    var state: js.UndefOr[LoggingConfigurationState]
    var tags: js.UndefOr[Tags]
    var updateTime: js.UndefOr[Time]
  }

  object GetLoggingConfigurationResponse {
    @inline
    def apply(
        arn: js.UndefOr[LoggingConfigurationArn] = js.undefined,
        createTime: js.UndefOr[Time] = js.undefined,
        destinationConfiguration: js.UndefOr[DestinationConfiguration] = js.undefined,
        id: js.UndefOr[LoggingConfigurationID] = js.undefined,
        name: js.UndefOr[LoggingConfigurationName] = js.undefined,
        state: js.UndefOr[LoggingConfigurationState] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined,
        updateTime: js.UndefOr[Time] = js.undefined
    ): GetLoggingConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createTime.foreach(__v => __obj.updateDynamic("createTime")(__v.asInstanceOf[js.Any]))
      destinationConfiguration.foreach(__v => __obj.updateDynamic("destinationConfiguration")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      updateTime.foreach(__v => __obj.updateDynamic("updateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLoggingConfigurationResponse]
    }
  }

  @js.native
  trait GetRoomRequest extends js.Object {
    var identifier: RoomIdentifier
  }

  object GetRoomRequest {
    @inline
    def apply(
        identifier: RoomIdentifier
    ): GetRoomRequest = {
      val __obj = js.Dynamic.literal(
        "identifier" -> identifier.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRoomRequest]
    }
  }

  @js.native
  trait GetRoomResponse extends js.Object {
    var arn: js.UndefOr[RoomArn]
    var createTime: js.UndefOr[Time]
    var id: js.UndefOr[RoomID]
    var loggingConfigurationIdentifiers: js.UndefOr[LoggingConfigurationIdentifierList]
    var maximumMessageLength: js.UndefOr[RoomMaxMessageLength]
    var maximumMessageRatePerSecond: js.UndefOr[RoomMaxMessageRatePerSecond]
    var messageReviewHandler: js.UndefOr[MessageReviewHandler]
    var name: js.UndefOr[RoomName]
    var tags: js.UndefOr[Tags]
    var updateTime: js.UndefOr[Time]
  }

  object GetRoomResponse {
    @inline
    def apply(
        arn: js.UndefOr[RoomArn] = js.undefined,
        createTime: js.UndefOr[Time] = js.undefined,
        id: js.UndefOr[RoomID] = js.undefined,
        loggingConfigurationIdentifiers: js.UndefOr[LoggingConfigurationIdentifierList] = js.undefined,
        maximumMessageLength: js.UndefOr[RoomMaxMessageLength] = js.undefined,
        maximumMessageRatePerSecond: js.UndefOr[RoomMaxMessageRatePerSecond] = js.undefined,
        messageReviewHandler: js.UndefOr[MessageReviewHandler] = js.undefined,
        name: js.UndefOr[RoomName] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined,
        updateTime: js.UndefOr[Time] = js.undefined
    ): GetRoomResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createTime.foreach(__v => __obj.updateDynamic("createTime")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      loggingConfigurationIdentifiers.foreach(__v => __obj.updateDynamic("loggingConfigurationIdentifiers")(__v.asInstanceOf[js.Any]))
      maximumMessageLength.foreach(__v => __obj.updateDynamic("maximumMessageLength")(__v.asInstanceOf[js.Any]))
      maximumMessageRatePerSecond.foreach(__v => __obj.updateDynamic("maximumMessageRatePerSecond")(__v.asInstanceOf[js.Any]))
      messageReviewHandler.foreach(__v => __obj.updateDynamic("messageReviewHandler")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      updateTime.foreach(__v => __obj.updateDynamic("updateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRoomResponse]
    }
  }

  @js.native
  trait ListLoggingConfigurationsRequest extends js.Object {
    var maxResults: js.UndefOr[MaxLoggingConfigurationResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListLoggingConfigurationsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxLoggingConfigurationResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListLoggingConfigurationsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLoggingConfigurationsRequest]
    }
  }

  @js.native
  trait ListLoggingConfigurationsResponse extends js.Object {
    var loggingConfigurations: LoggingConfigurationList
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListLoggingConfigurationsResponse {
    @inline
    def apply(
        loggingConfigurations: LoggingConfigurationList,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListLoggingConfigurationsResponse = {
      val __obj = js.Dynamic.literal(
        "loggingConfigurations" -> loggingConfigurations.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLoggingConfigurationsResponse]
    }
  }

  @js.native
  trait ListRoomsRequest extends js.Object {
    var loggingConfigurationIdentifier: js.UndefOr[LoggingConfigurationIdentifier]
    var maxResults: js.UndefOr[MaxRoomResults]
    var messageReviewHandlerUri: js.UndefOr[LambdaArn]
    var name: js.UndefOr[RoomName]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListRoomsRequest {
    @inline
    def apply(
        loggingConfigurationIdentifier: js.UndefOr[LoggingConfigurationIdentifier] = js.undefined,
        maxResults: js.UndefOr[MaxRoomResults] = js.undefined,
        messageReviewHandlerUri: js.UndefOr[LambdaArn] = js.undefined,
        name: js.UndefOr[RoomName] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListRoomsRequest = {
      val __obj = js.Dynamic.literal()
      loggingConfigurationIdentifier.foreach(__v => __obj.updateDynamic("loggingConfigurationIdentifier")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      messageReviewHandlerUri.foreach(__v => __obj.updateDynamic("messageReviewHandlerUri")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRoomsRequest]
    }
  }

  @js.native
  trait ListRoomsResponse extends js.Object {
    var rooms: RoomList
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListRoomsResponse {
    @inline
    def apply(
        rooms: RoomList,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListRoomsResponse = {
      val __obj = js.Dynamic.literal(
        "rooms" -> rooms.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRoomsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: ResourceArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: Tags
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: Tags
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal(
        "tags" -> tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** Summary information about a logging configuration.
    */
  @js.native
  trait LoggingConfigurationSummary extends js.Object {
    var arn: js.UndefOr[LoggingConfigurationArn]
    var createTime: js.UndefOr[Time]
    var destinationConfiguration: js.UndefOr[DestinationConfiguration]
    var id: js.UndefOr[LoggingConfigurationID]
    var name: js.UndefOr[LoggingConfigurationName]
    var state: js.UndefOr[LoggingConfigurationState]
    var tags: js.UndefOr[Tags]
    var updateTime: js.UndefOr[Time]
  }

  object LoggingConfigurationSummary {
    @inline
    def apply(
        arn: js.UndefOr[LoggingConfigurationArn] = js.undefined,
        createTime: js.UndefOr[Time] = js.undefined,
        destinationConfiguration: js.UndefOr[DestinationConfiguration] = js.undefined,
        id: js.UndefOr[LoggingConfigurationID] = js.undefined,
        name: js.UndefOr[LoggingConfigurationName] = js.undefined,
        state: js.UndefOr[LoggingConfigurationState] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined,
        updateTime: js.UndefOr[Time] = js.undefined
    ): LoggingConfigurationSummary = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createTime.foreach(__v => __obj.updateDynamic("createTime")(__v.asInstanceOf[js.Any]))
      destinationConfiguration.foreach(__v => __obj.updateDynamic("destinationConfiguration")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      updateTime.foreach(__v => __obj.updateDynamic("updateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoggingConfigurationSummary]
    }
  }

  /** Configuration information for optional message review.
    */
  @js.native
  trait MessageReviewHandler extends js.Object {
    var fallbackResult: js.UndefOr[FallbackResult]
    var uri: js.UndefOr[LambdaArn]
  }

  object MessageReviewHandler {
    @inline
    def apply(
        fallbackResult: js.UndefOr[FallbackResult] = js.undefined,
        uri: js.UndefOr[LambdaArn] = js.undefined
    ): MessageReviewHandler = {
      val __obj = js.Dynamic.literal()
      fallbackResult.foreach(__v => __obj.updateDynamic("fallbackResult")(__v.asInstanceOf[js.Any]))
      uri.foreach(__v => __obj.updateDynamic("uri")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MessageReviewHandler]
    }
  }

  /** Summary information about a room.
    */
  @js.native
  trait RoomSummary extends js.Object {
    var arn: js.UndefOr[RoomArn]
    var createTime: js.UndefOr[Time]
    var id: js.UndefOr[RoomID]
    var loggingConfigurationIdentifiers: js.UndefOr[LoggingConfigurationIdentifierList]
    var messageReviewHandler: js.UndefOr[MessageReviewHandler]
    var name: js.UndefOr[RoomName]
    var tags: js.UndefOr[Tags]
    var updateTime: js.UndefOr[Time]
  }

  object RoomSummary {
    @inline
    def apply(
        arn: js.UndefOr[RoomArn] = js.undefined,
        createTime: js.UndefOr[Time] = js.undefined,
        id: js.UndefOr[RoomID] = js.undefined,
        loggingConfigurationIdentifiers: js.UndefOr[LoggingConfigurationIdentifierList] = js.undefined,
        messageReviewHandler: js.UndefOr[MessageReviewHandler] = js.undefined,
        name: js.UndefOr[RoomName] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined,
        updateTime: js.UndefOr[Time] = js.undefined
    ): RoomSummary = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createTime.foreach(__v => __obj.updateDynamic("createTime")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      loggingConfigurationIdentifiers.foreach(__v => __obj.updateDynamic("loggingConfigurationIdentifiers")(__v.asInstanceOf[js.Any]))
      messageReviewHandler.foreach(__v => __obj.updateDynamic("messageReviewHandler")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      updateTime.foreach(__v => __obj.updateDynamic("updateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RoomSummary]
    }
  }

  /** Specifies an S3 location where chat logs will be stored.
    */
  @js.native
  trait S3DestinationConfiguration extends js.Object {
    var bucketName: BucketName
  }

  object S3DestinationConfiguration {
    @inline
    def apply(
        bucketName: BucketName
    ): S3DestinationConfiguration = {
      val __obj = js.Dynamic.literal(
        "bucketName" -> bucketName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[S3DestinationConfiguration]
    }
  }

  @js.native
  trait SendEventRequest extends js.Object {
    var eventName: EventName
    var roomIdentifier: RoomIdentifier
    var attributes: js.UndefOr[EventAttributes]
  }

  object SendEventRequest {
    @inline
    def apply(
        eventName: EventName,
        roomIdentifier: RoomIdentifier,
        attributes: js.UndefOr[EventAttributes] = js.undefined
    ): SendEventRequest = {
      val __obj = js.Dynamic.literal(
        "eventName" -> eventName.asInstanceOf[js.Any],
        "roomIdentifier" -> roomIdentifier.asInstanceOf[js.Any]
      )

      attributes.foreach(__v => __obj.updateDynamic("attributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendEventRequest]
    }
  }

  @js.native
  trait SendEventResponse extends js.Object {
    var id: js.UndefOr[ID]
  }

  object SendEventResponse {
    @inline
    def apply(
        id: js.UndefOr[ID] = js.undefined
    ): SendEventResponse = {
      val __obj = js.Dynamic.literal()
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendEventResponse]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tags: Tags
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceArn,
        tags: Tags
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
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

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceArn,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
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

  @js.native
  trait UpdateLoggingConfigurationRequest extends js.Object {
    var identifier: LoggingConfigurationIdentifier
    var destinationConfiguration: js.UndefOr[DestinationConfiguration]
    var name: js.UndefOr[LoggingConfigurationName]
  }

  object UpdateLoggingConfigurationRequest {
    @inline
    def apply(
        identifier: LoggingConfigurationIdentifier,
        destinationConfiguration: js.UndefOr[DestinationConfiguration] = js.undefined,
        name: js.UndefOr[LoggingConfigurationName] = js.undefined
    ): UpdateLoggingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "identifier" -> identifier.asInstanceOf[js.Any]
      )

      destinationConfiguration.foreach(__v => __obj.updateDynamic("destinationConfiguration")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLoggingConfigurationRequest]
    }
  }

  @js.native
  trait UpdateLoggingConfigurationResponse extends js.Object {
    var arn: js.UndefOr[LoggingConfigurationArn]
    var createTime: js.UndefOr[Time]
    var destinationConfiguration: js.UndefOr[DestinationConfiguration]
    var id: js.UndefOr[LoggingConfigurationID]
    var name: js.UndefOr[LoggingConfigurationName]
    var state: js.UndefOr[UpdateLoggingConfigurationState]
    var tags: js.UndefOr[Tags]
    var updateTime: js.UndefOr[Time]
  }

  object UpdateLoggingConfigurationResponse {
    @inline
    def apply(
        arn: js.UndefOr[LoggingConfigurationArn] = js.undefined,
        createTime: js.UndefOr[Time] = js.undefined,
        destinationConfiguration: js.UndefOr[DestinationConfiguration] = js.undefined,
        id: js.UndefOr[LoggingConfigurationID] = js.undefined,
        name: js.UndefOr[LoggingConfigurationName] = js.undefined,
        state: js.UndefOr[UpdateLoggingConfigurationState] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined,
        updateTime: js.UndefOr[Time] = js.undefined
    ): UpdateLoggingConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createTime.foreach(__v => __obj.updateDynamic("createTime")(__v.asInstanceOf[js.Any]))
      destinationConfiguration.foreach(__v => __obj.updateDynamic("destinationConfiguration")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      updateTime.foreach(__v => __obj.updateDynamic("updateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLoggingConfigurationResponse]
    }
  }

  @js.native
  trait UpdateRoomRequest extends js.Object {
    var identifier: RoomIdentifier
    var loggingConfigurationIdentifiers: js.UndefOr[LoggingConfigurationIdentifierList]
    var maximumMessageLength: js.UndefOr[RoomMaxMessageLength]
    var maximumMessageRatePerSecond: js.UndefOr[RoomMaxMessageRatePerSecond]
    var messageReviewHandler: js.UndefOr[MessageReviewHandler]
    var name: js.UndefOr[RoomName]
  }

  object UpdateRoomRequest {
    @inline
    def apply(
        identifier: RoomIdentifier,
        loggingConfigurationIdentifiers: js.UndefOr[LoggingConfigurationIdentifierList] = js.undefined,
        maximumMessageLength: js.UndefOr[RoomMaxMessageLength] = js.undefined,
        maximumMessageRatePerSecond: js.UndefOr[RoomMaxMessageRatePerSecond] = js.undefined,
        messageReviewHandler: js.UndefOr[MessageReviewHandler] = js.undefined,
        name: js.UndefOr[RoomName] = js.undefined
    ): UpdateRoomRequest = {
      val __obj = js.Dynamic.literal(
        "identifier" -> identifier.asInstanceOf[js.Any]
      )

      loggingConfigurationIdentifiers.foreach(__v => __obj.updateDynamic("loggingConfigurationIdentifiers")(__v.asInstanceOf[js.Any]))
      maximumMessageLength.foreach(__v => __obj.updateDynamic("maximumMessageLength")(__v.asInstanceOf[js.Any]))
      maximumMessageRatePerSecond.foreach(__v => __obj.updateDynamic("maximumMessageRatePerSecond")(__v.asInstanceOf[js.Any]))
      messageReviewHandler.foreach(__v => __obj.updateDynamic("messageReviewHandler")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRoomRequest]
    }
  }

  @js.native
  trait UpdateRoomResponse extends js.Object {
    var arn: js.UndefOr[RoomArn]
    var createTime: js.UndefOr[Time]
    var id: js.UndefOr[RoomID]
    var loggingConfigurationIdentifiers: js.UndefOr[LoggingConfigurationIdentifierList]
    var maximumMessageLength: js.UndefOr[RoomMaxMessageLength]
    var maximumMessageRatePerSecond: js.UndefOr[RoomMaxMessageRatePerSecond]
    var messageReviewHandler: js.UndefOr[MessageReviewHandler]
    var name: js.UndefOr[RoomName]
    var tags: js.UndefOr[Tags]
    var updateTime: js.UndefOr[Time]
  }

  object UpdateRoomResponse {
    @inline
    def apply(
        arn: js.UndefOr[RoomArn] = js.undefined,
        createTime: js.UndefOr[Time] = js.undefined,
        id: js.UndefOr[RoomID] = js.undefined,
        loggingConfigurationIdentifiers: js.UndefOr[LoggingConfigurationIdentifierList] = js.undefined,
        maximumMessageLength: js.UndefOr[RoomMaxMessageLength] = js.undefined,
        maximumMessageRatePerSecond: js.UndefOr[RoomMaxMessageRatePerSecond] = js.undefined,
        messageReviewHandler: js.UndefOr[MessageReviewHandler] = js.undefined,
        name: js.UndefOr[RoomName] = js.undefined,
        tags: js.UndefOr[Tags] = js.undefined,
        updateTime: js.UndefOr[Time] = js.undefined
    ): UpdateRoomResponse = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      createTime.foreach(__v => __obj.updateDynamic("createTime")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      loggingConfigurationIdentifiers.foreach(__v => __obj.updateDynamic("loggingConfigurationIdentifiers")(__v.asInstanceOf[js.Any]))
      maximumMessageLength.foreach(__v => __obj.updateDynamic("maximumMessageLength")(__v.asInstanceOf[js.Any]))
      maximumMessageRatePerSecond.foreach(__v => __obj.updateDynamic("maximumMessageRatePerSecond")(__v.asInstanceOf[js.Any]))
      messageReviewHandler.foreach(__v => __obj.updateDynamic("messageReviewHandler")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      updateTime.foreach(__v => __obj.updateDynamic("updateTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRoomResponse]
    }
  }
}
