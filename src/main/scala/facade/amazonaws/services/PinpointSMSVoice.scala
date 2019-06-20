package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Text" -> Text.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CallInstructionsMessageType]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "IamRoleArn" -> IamRoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogGroupArn" -> LogGroupArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CloudWatchLogsDestination]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "EventDestination" -> EventDestination.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EventDestinationName" -> EventDestinationName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[CreateConfigurationSetEventDestinationRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[CreateConfigurationSetEventDestinationResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateConfigurationSetRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateConfigurationSetResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "EventDestinationName" -> EventDestinationName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[DeleteConfigurationSetEventDestinationRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[DeleteConfigurationSetEventDestinationResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConfigurationSetRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteConfigurationSetResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudWatchLogsDestination" -> CloudWatchLogsDestination.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KinesisFirehoseDestination" -> KinesisFirehoseDestination.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MatchingEventTypes" -> MatchingEventTypes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnsDestination" -> SnsDestination.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventDestination]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudWatchLogsDestination" -> CloudWatchLogsDestination.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KinesisFirehoseDestination" -> KinesisFirehoseDestination.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MatchingEventTypes" -> MatchingEventTypes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnsDestination" -> SnsDestination.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventDestinationDefinition]
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

    val values = IndexedSeq(INITIATED_CALL, RINGING, ANSWERED, COMPLETED_CALL, BUSY, FAILED, NO_ANSWER)
  }

  @js.native
  trait GetConfigurationSetEventDestinationsRequest extends js.Object {
    var ConfigurationSetName: __string
  }

  object GetConfigurationSetEventDestinationsRequest {
    def apply(
        ConfigurationSetName: __string
    ): GetConfigurationSetEventDestinationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[GetConfigurationSetEventDestinationsRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "EventDestinations" -> EventDestinations.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[GetConfigurationSetEventDestinationsResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "DeliveryStreamArn" -> DeliveryStreamArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IamRoleArn" -> IamRoleArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[KinesisFirehoseDestination]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PageSize" -> PageSize.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListConfigurationSetsRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSets" -> ConfigurationSets.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListConfigurationSetsResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "LanguageCode" -> LanguageCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Text" -> Text.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VoiceId" -> VoiceId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PlainTextMessageType]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "LanguageCode" -> LanguageCode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Text" -> Text.map { x =>
          x.asInstanceOf[js.Any]
        },
        "VoiceId" -> VoiceId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SSMLMessageType]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CallerId" -> CallerId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ConfigurationSetName" -> ConfigurationSetName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Content" -> Content.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DestinationPhoneNumber" -> DestinationPhoneNumber.map { x =>
          x.asInstanceOf[js.Any]
        },
        "OriginationPhoneNumber" -> OriginationPhoneNumber.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendVoiceMessageRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "MessageId" -> MessageId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SendVoiceMessageResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "TopicArn" -> TopicArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[SnsDestination]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "ConfigurationSetName" -> ConfigurationSetName.asInstanceOf[js.Any],
        "EventDestinationName" -> EventDestinationName.asInstanceOf[js.Any],
        "EventDestination" -> EventDestination.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[UpdateConfigurationSetEventDestinationRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal
        .applyDynamicNamed("apply")(_fields: _*)
        .asInstanceOf[UpdateConfigurationSetEventDestinationResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CallInstructionsMessage" -> CallInstructionsMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlainTextMessage" -> PlainTextMessage.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SSMLMessage" -> SSMLMessage.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VoiceMessageContent]
    }
  }
}
