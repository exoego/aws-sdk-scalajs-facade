package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object pinpointsmsvoice {
  type ConfigurationSets            = js.Array[WordCharactersWithDelimiters]
  type EventDestinations            = js.Array[EventDestination]
  type EventType                    = String
  type EventTypes                   = js.Array[EventType]
  type NextTokenString              = String
  type NonEmptyString               = String
  type WordCharactersWithDelimiters = String
  type __string                     = String

  implicit final class PinpointSMSVoiceOps(val service: PinpointSMSVoice) extends AnyVal {

    def createConfigurationSetEventDestinationFuture(
        params: CreateConfigurationSetEventDestinationRequest
    ): Future[CreateConfigurationSetEventDestinationResponse] =
      service.createConfigurationSetEventDestination(params).promise.toFuture
    def createConfigurationSetFuture(params: CreateConfigurationSetRequest): Future[CreateConfigurationSetResponse] =
      service.createConfigurationSet(params).promise.toFuture
    def deleteConfigurationSetEventDestinationFuture(
        params: DeleteConfigurationSetEventDestinationRequest
    ): Future[DeleteConfigurationSetEventDestinationResponse] =
      service.deleteConfigurationSetEventDestination(params).promise.toFuture
    def deleteConfigurationSetFuture(params: DeleteConfigurationSetRequest): Future[DeleteConfigurationSetResponse] =
      service.deleteConfigurationSet(params).promise.toFuture
    def getConfigurationSetEventDestinationsFuture(
        params: GetConfigurationSetEventDestinationsRequest
    ): Future[GetConfigurationSetEventDestinationsResponse] =
      service.getConfigurationSetEventDestinations(params).promise.toFuture
    def listConfigurationSetsFuture(params: ListConfigurationSetsRequest): Future[ListConfigurationSetsResponse] =
      service.listConfigurationSets(params).promise.toFuture
    def sendVoiceMessageFuture(params: SendVoiceMessageRequest): Future[SendVoiceMessageResponse] =
      service.sendVoiceMessage(params).promise.toFuture
    def updateConfigurationSetEventDestinationFuture(
        params: UpdateConfigurationSetEventDestinationRequest
    ): Future[UpdateConfigurationSetEventDestinationResponse] =
      service.updateConfigurationSetEventDestination(params).promise.toFuture
  }
}

package pinpointsmsvoice {
  @js.native
  @JSImport("aws-sdk", "PinpointSMSVoice")
  class PinpointSMSVoice() extends js.Object {
    def this(config: AWSConfig) = this()

    def createConfigurationSet(params: CreateConfigurationSetRequest): Request[CreateConfigurationSetResponse] =
      js.native
    def createConfigurationSetEventDestination(
        params: CreateConfigurationSetEventDestinationRequest
    ): Request[CreateConfigurationSetEventDestinationResponse] = js.native
    def deleteConfigurationSet(params: DeleteConfigurationSetRequest): Request[DeleteConfigurationSetResponse] =
      js.native
    def deleteConfigurationSetEventDestination(
        params: DeleteConfigurationSetEventDestinationRequest
    ): Request[DeleteConfigurationSetEventDestinationResponse] = js.native
    def getConfigurationSetEventDestinations(
        params: GetConfigurationSetEventDestinationsRequest
    ): Request[GetConfigurationSetEventDestinationsResponse]                                                = js.native
    def listConfigurationSets(params: ListConfigurationSetsRequest): Request[ListConfigurationSetsResponse] = js.native
    def sendVoiceMessage(params: SendVoiceMessageRequest): Request[SendVoiceMessageResponse]                = js.native
    def updateConfigurationSetEventDestination(
        params: UpdateConfigurationSetEventDestinationRequest
    ): Request[UpdateConfigurationSetEventDestinationResponse] = js.native
  }

  /**
    * An object that defines a message that contains text formatted using Amazon Pinpoint Voice Instructions markup.
    */
  @js.native
  trait CallInstructionsMessageType extends js.Object {
    var Text: js.UndefOr[NonEmptyString]
  }

  object CallInstructionsMessageType {
    def apply(
        Text: js.UndefOr[NonEmptyString] = js.undefined
    ): CallInstructionsMessageType = {
      val __obj = js.Dictionary.empty[js.Any]
      Text.foreach(__v => __obj.update("Text", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CallInstructionsMessageType]
    }
  }

  /**
    * An object that contains information about an event destination that sends data to Amazon CloudWatch Logs.
    */
  @js.native
  trait CloudWatchLogsDestination extends js.Object {
    var IamRoleArn: js.UndefOr[String]
    var LogGroupArn: js.UndefOr[String]
  }

  object CloudWatchLogsDestination {
    def apply(
        IamRoleArn: js.UndefOr[String] = js.undefined,
        LogGroupArn: js.UndefOr[String] = js.undefined
    ): CloudWatchLogsDestination = {
      val __obj = js.Dictionary.empty[js.Any]
      IamRoleArn.foreach(__v => __obj.update("IamRoleArn", __v.asInstanceOf[js.Any]))
      LogGroupArn.foreach(__v => __obj.update("LogGroupArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CloudWatchLogsDestination]
    }
  }

  /**
    * Create a new event destination in a configuration set.
    */
  @js.native
  trait CreateConfigurationSetEventDestinationRequest extends js.Object {
    var ConfigurationSetName: __string
    var EventDestination: js.UndefOr[EventDestinationDefinition]
    var EventDestinationName: js.UndefOr[NonEmptyString]
  }

  object CreateConfigurationSetEventDestinationRequest {
    def apply(
        ConfigurationSetName: __string,
        EventDestination: js.UndefOr[EventDestinationDefinition] = js.undefined,
        EventDestinationName: js.UndefOr[NonEmptyString] = js.undefined
    ): CreateConfigurationSetEventDestinationRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]
      )

      EventDestination.foreach(__v => __obj.update("EventDestination", __v.asInstanceOf[js.Any]))
      EventDestinationName.foreach(__v => __obj.update("EventDestinationName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConfigurationSetEventDestinationRequest]
    }
  }

  /**
    * An empty object that indicates that the event destination was created successfully.
    */
  @js.native
  trait CreateConfigurationSetEventDestinationResponse extends js.Object {}

  object CreateConfigurationSetEventDestinationResponse {
    def apply(
        ): CreateConfigurationSetEventDestinationResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[CreateConfigurationSetEventDestinationResponse]
    }
  }

  /**
    * A request to create a new configuration set.
    */
  @js.native
  trait CreateConfigurationSetRequest extends js.Object {
    var ConfigurationSetName: js.UndefOr[WordCharactersWithDelimiters]
  }

  object CreateConfigurationSetRequest {
    def apply(
        ConfigurationSetName: js.UndefOr[WordCharactersWithDelimiters] = js.undefined
    ): CreateConfigurationSetRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      ConfigurationSetName.foreach(__v => __obj.update("ConfigurationSetName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConfigurationSetRequest]
    }
  }

  /**
    * An empty object that indicates that the configuration set was successfully created.
    */
  @js.native
  trait CreateConfigurationSetResponse extends js.Object {}

  object CreateConfigurationSetResponse {
    def apply(
        ): CreateConfigurationSetResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[CreateConfigurationSetResponse]
    }
  }

  @js.native
  trait DeleteConfigurationSetEventDestinationRequest extends js.Object {
    var ConfigurationSetName: __string
    var EventDestinationName: __string
  }

  object DeleteConfigurationSetEventDestinationRequest {
    def apply(
        ConfigurationSetName: __string,
        EventDestinationName: __string
    ): DeleteConfigurationSetEventDestinationRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "EventDestinationName" -> EventDestinationName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteConfigurationSetEventDestinationRequest]
    }
  }

  /**
    * An empty object that indicates that the event destination was deleted successfully.
    */
  @js.native
  trait DeleteConfigurationSetEventDestinationResponse extends js.Object {}

  object DeleteConfigurationSetEventDestinationResponse {
    def apply(
        ): DeleteConfigurationSetEventDestinationResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteConfigurationSetEventDestinationResponse]
    }
  }

  @js.native
  trait DeleteConfigurationSetRequest extends js.Object {
    var ConfigurationSetName: __string
  }

  object DeleteConfigurationSetRequest {
    def apply(
        ConfigurationSetName: __string
    ): DeleteConfigurationSetRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteConfigurationSetRequest]
    }
  }

  /**
    * An empty object that indicates that the configuration set was deleted successfully.
    */
  @js.native
  trait DeleteConfigurationSetResponse extends js.Object {}

  object DeleteConfigurationSetResponse {
    def apply(
        ): DeleteConfigurationSetResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteConfigurationSetResponse]
    }
  }

  /**
    * An object that defines an event destination.
    */
  @js.native
  trait EventDestination extends js.Object {
    var CloudWatchLogsDestination: js.UndefOr[CloudWatchLogsDestination]
    var Enabled: js.UndefOr[Boolean]
    var KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination]
    var MatchingEventTypes: js.UndefOr[EventTypes]
    var Name: js.UndefOr[String]
    var SnsDestination: js.UndefOr[SnsDestination]
  }

  object EventDestination {
    def apply(
        CloudWatchLogsDestination: js.UndefOr[CloudWatchLogsDestination] = js.undefined,
        Enabled: js.UndefOr[Boolean] = js.undefined,
        KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination] = js.undefined,
        MatchingEventTypes: js.UndefOr[EventTypes] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        SnsDestination: js.UndefOr[SnsDestination] = js.undefined
    ): EventDestination = {
      val __obj = js.Dictionary.empty[js.Any]
      CloudWatchLogsDestination.foreach(__v => __obj.update("CloudWatchLogsDestination", __v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      KinesisFirehoseDestination.foreach(__v => __obj.update("KinesisFirehoseDestination", __v.asInstanceOf[js.Any]))
      MatchingEventTypes.foreach(__v => __obj.update("MatchingEventTypes", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      SnsDestination.foreach(__v => __obj.update("SnsDestination", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventDestination]
    }
  }

  /**
    * An object that defines a single event destination.
    */
  @js.native
  trait EventDestinationDefinition extends js.Object {
    var CloudWatchLogsDestination: js.UndefOr[CloudWatchLogsDestination]
    var Enabled: js.UndefOr[Boolean]
    var KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination]
    var MatchingEventTypes: js.UndefOr[EventTypes]
    var SnsDestination: js.UndefOr[SnsDestination]
  }

  object EventDestinationDefinition {
    def apply(
        CloudWatchLogsDestination: js.UndefOr[CloudWatchLogsDestination] = js.undefined,
        Enabled: js.UndefOr[Boolean] = js.undefined,
        KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination] = js.undefined,
        MatchingEventTypes: js.UndefOr[EventTypes] = js.undefined,
        SnsDestination: js.UndefOr[SnsDestination] = js.undefined
    ): EventDestinationDefinition = {
      val __obj = js.Dictionary.empty[js.Any]
      CloudWatchLogsDestination.foreach(__v => __obj.update("CloudWatchLogsDestination", __v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.update("Enabled", __v.asInstanceOf[js.Any]))
      KinesisFirehoseDestination.foreach(__v => __obj.update("KinesisFirehoseDestination", __v.asInstanceOf[js.Any]))
      MatchingEventTypes.foreach(__v => __obj.update("MatchingEventTypes", __v.asInstanceOf[js.Any]))
      SnsDestination.foreach(__v => __obj.update("SnsDestination", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventDestinationDefinition]
    }
  }

  /**
    * The types of events that are sent to the event destination.
    */
  object EventTypeEnum {
    val INITIATED_CALL = "INITIATED_CALL"
    val RINGING        = "RINGING"
    val ANSWERED       = "ANSWERED"
    val COMPLETED_CALL = "COMPLETED_CALL"
    val BUSY           = "BUSY"
    val FAILED         = "FAILED"
    val NO_ANSWER      = "NO_ANSWER"

    val values = js.Object.freeze(js.Array(INITIATED_CALL, RINGING, ANSWERED, COMPLETED_CALL, BUSY, FAILED, NO_ANSWER))
  }

  @js.native
  trait GetConfigurationSetEventDestinationsRequest extends js.Object {
    var ConfigurationSetName: __string
  }

  object GetConfigurationSetEventDestinationsRequest {
    def apply(
        ConfigurationSetName: __string
    ): GetConfigurationSetEventDestinationsRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetConfigurationSetEventDestinationsRequest]
    }
  }

  /**
    * An object that contains information about an event destination.
    */
  @js.native
  trait GetConfigurationSetEventDestinationsResponse extends js.Object {
    var EventDestinations: js.UndefOr[EventDestinations]
  }

  object GetConfigurationSetEventDestinationsResponse {
    def apply(
        EventDestinations: js.UndefOr[EventDestinations] = js.undefined
    ): GetConfigurationSetEventDestinationsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      EventDestinations.foreach(__v => __obj.update("EventDestinations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConfigurationSetEventDestinationsResponse]
    }
  }

  /**
    * An object that contains information about an event destination that sends data to Amazon Kinesis Data Firehose.
    */
  @js.native
  trait KinesisFirehoseDestination extends js.Object {
    var DeliveryStreamArn: js.UndefOr[String]
    var IamRoleArn: js.UndefOr[String]
  }

  object KinesisFirehoseDestination {
    def apply(
        DeliveryStreamArn: js.UndefOr[String] = js.undefined,
        IamRoleArn: js.UndefOr[String] = js.undefined
    ): KinesisFirehoseDestination = {
      val __obj = js.Dictionary.empty[js.Any]
      DeliveryStreamArn.foreach(__v => __obj.update("DeliveryStreamArn", __v.asInstanceOf[js.Any]))
      IamRoleArn.foreach(__v => __obj.update("IamRoleArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[KinesisFirehoseDestination]
    }
  }

  @js.native
  trait ListConfigurationSetsRequest extends js.Object {
    var NextToken: js.UndefOr[__string]
    var PageSize: js.UndefOr[__string]
  }

  object ListConfigurationSetsRequest {
    def apply(
        NextToken: js.UndefOr[__string] = js.undefined,
        PageSize: js.UndefOr[__string] = js.undefined
    ): ListConfigurationSetsRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      PageSize.foreach(__v => __obj.update("PageSize", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConfigurationSetsRequest]
    }
  }

  /**
    * An object that contains information about the configuration sets for your account in the current region.
    */
  @js.native
  trait ListConfigurationSetsResponse extends js.Object {
    var ConfigurationSets: js.UndefOr[ConfigurationSets]
    var NextToken: js.UndefOr[NextTokenString]
  }

  object ListConfigurationSetsResponse {
    def apply(
        ConfigurationSets: js.UndefOr[ConfigurationSets] = js.undefined,
        NextToken: js.UndefOr[NextTokenString] = js.undefined
    ): ListConfigurationSetsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ConfigurationSets.foreach(__v => __obj.update("ConfigurationSets", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConfigurationSetsResponse]
    }
  }

  /**
    * An object that defines a message that contains unformatted text.
    */
  @js.native
  trait PlainTextMessageType extends js.Object {
    var LanguageCode: js.UndefOr[String]
    var Text: js.UndefOr[NonEmptyString]
    var VoiceId: js.UndefOr[String]
  }

  object PlainTextMessageType {
    def apply(
        LanguageCode: js.UndefOr[String] = js.undefined,
        Text: js.UndefOr[NonEmptyString] = js.undefined,
        VoiceId: js.UndefOr[String] = js.undefined
    ): PlainTextMessageType = {
      val __obj = js.Dictionary.empty[js.Any]
      LanguageCode.foreach(__v => __obj.update("LanguageCode", __v.asInstanceOf[js.Any]))
      Text.foreach(__v => __obj.update("Text", __v.asInstanceOf[js.Any]))
      VoiceId.foreach(__v => __obj.update("VoiceId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PlainTextMessageType]
    }
  }

  /**
    * An object that defines a message that contains SSML-formatted text.
    */
  @js.native
  trait SSMLMessageType extends js.Object {
    var LanguageCode: js.UndefOr[String]
    var Text: js.UndefOr[NonEmptyString]
    var VoiceId: js.UndefOr[String]
  }

  object SSMLMessageType {
    def apply(
        LanguageCode: js.UndefOr[String] = js.undefined,
        Text: js.UndefOr[NonEmptyString] = js.undefined,
        VoiceId: js.UndefOr[String] = js.undefined
    ): SSMLMessageType = {
      val __obj = js.Dictionary.empty[js.Any]
      LanguageCode.foreach(__v => __obj.update("LanguageCode", __v.asInstanceOf[js.Any]))
      Text.foreach(__v => __obj.update("Text", __v.asInstanceOf[js.Any]))
      VoiceId.foreach(__v => __obj.update("VoiceId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SSMLMessageType]
    }
  }

  /**
    * SendVoiceMessageRequest
    */
  @js.native
  trait SendVoiceMessageRequest extends js.Object {
    var CallerId: js.UndefOr[String]
    var ConfigurationSetName: js.UndefOr[WordCharactersWithDelimiters]
    var Content: js.UndefOr[VoiceMessageContent]
    var DestinationPhoneNumber: js.UndefOr[NonEmptyString]
    var OriginationPhoneNumber: js.UndefOr[NonEmptyString]
  }

  object SendVoiceMessageRequest {
    def apply(
        CallerId: js.UndefOr[String] = js.undefined,
        ConfigurationSetName: js.UndefOr[WordCharactersWithDelimiters] = js.undefined,
        Content: js.UndefOr[VoiceMessageContent] = js.undefined,
        DestinationPhoneNumber: js.UndefOr[NonEmptyString] = js.undefined,
        OriginationPhoneNumber: js.UndefOr[NonEmptyString] = js.undefined
    ): SendVoiceMessageRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      CallerId.foreach(__v => __obj.update("CallerId", __v.asInstanceOf[js.Any]))
      ConfigurationSetName.foreach(__v => __obj.update("ConfigurationSetName", __v.asInstanceOf[js.Any]))
      Content.foreach(__v => __obj.update("Content", __v.asInstanceOf[js.Any]))
      DestinationPhoneNumber.foreach(__v => __obj.update("DestinationPhoneNumber", __v.asInstanceOf[js.Any]))
      OriginationPhoneNumber.foreach(__v => __obj.update("OriginationPhoneNumber", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendVoiceMessageRequest]
    }
  }

  /**
    * An object that that contains the Message ID of a Voice message that was sent successfully.
    */
  @js.native
  trait SendVoiceMessageResponse extends js.Object {
    var MessageId: js.UndefOr[String]
  }

  object SendVoiceMessageResponse {
    def apply(
        MessageId: js.UndefOr[String] = js.undefined
    ): SendVoiceMessageResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      MessageId.foreach(__v => __obj.update("MessageId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendVoiceMessageResponse]
    }
  }

  /**
    * An object that contains information about an event destination that sends data to Amazon SNS.
    */
  @js.native
  trait SnsDestination extends js.Object {
    var TopicArn: js.UndefOr[String]
  }

  object SnsDestination {
    def apply(
        TopicArn: js.UndefOr[String] = js.undefined
    ): SnsDestination = {
      val __obj = js.Dictionary.empty[js.Any]
      TopicArn.foreach(__v => __obj.update("TopicArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SnsDestination]
    }
  }

  /**
    * UpdateConfigurationSetEventDestinationRequest
    */
  @js.native
  trait UpdateConfigurationSetEventDestinationRequest extends js.Object {
    var ConfigurationSetName: __string
    var EventDestinationName: __string
    var EventDestination: js.UndefOr[EventDestinationDefinition]
  }

  object UpdateConfigurationSetEventDestinationRequest {
    def apply(
        ConfigurationSetName: __string,
        EventDestinationName: __string,
        EventDestination: js.UndefOr[EventDestinationDefinition] = js.undefined
    ): UpdateConfigurationSetEventDestinationRequest = {
      val __obj = js.Dictionary[js.Any](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "EventDestinationName" -> EventDestinationName.asInstanceOf[js.Any]
      )

      EventDestination.foreach(__v => __obj.update("EventDestination", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateConfigurationSetEventDestinationRequest]
    }
  }

  /**
    * An empty object that indicates that the event destination was updated successfully.
    */
  @js.native
  trait UpdateConfigurationSetEventDestinationResponse extends js.Object {}

  object UpdateConfigurationSetEventDestinationResponse {
    def apply(
        ): UpdateConfigurationSetEventDestinationResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UpdateConfigurationSetEventDestinationResponse]
    }
  }

  /**
    * An object that contains a voice message and information about the recipient that you want to send it to.
    */
  @js.native
  trait VoiceMessageContent extends js.Object {
    var CallInstructionsMessage: js.UndefOr[CallInstructionsMessageType]
    var PlainTextMessage: js.UndefOr[PlainTextMessageType]
    var SSMLMessage: js.UndefOr[SSMLMessageType]
  }

  object VoiceMessageContent {
    def apply(
        CallInstructionsMessage: js.UndefOr[CallInstructionsMessageType] = js.undefined,
        PlainTextMessage: js.UndefOr[PlainTextMessageType] = js.undefined,
        SSMLMessage: js.UndefOr[SSMLMessageType] = js.undefined
    ): VoiceMessageContent = {
      val __obj = js.Dictionary.empty[js.Any]
      CallInstructionsMessage.foreach(__v => __obj.update("CallInstructionsMessage", __v.asInstanceOf[js.Any]))
      PlainTextMessage.foreach(__v => __obj.update("PlainTextMessage", __v.asInstanceOf[js.Any]))
      SSMLMessage.foreach(__v => __obj.update("SSMLMessage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VoiceMessageContent]
    }
  }
}
