package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object pinpointsmsvoice {
  type ConfigurationSets            = js.Array[WordCharactersWithDelimiters]
  type EventDestinations            = js.Array[EventDestination]
  type EventTypes                   = js.Array[EventType]
  type NextTokenString              = String
  type NonEmptyString               = String
  type WordCharactersWithDelimiters = String
  type __string                     = String

  implicit final class PinpointSMSVoiceOps(private val service: PinpointSMSVoice) extends AnyVal {

    @inline def createConfigurationSetEventDestinationFuture(
        params: CreateConfigurationSetEventDestinationRequest
    ): Future[CreateConfigurationSetEventDestinationResponse] =
      service.createConfigurationSetEventDestination(params).promise().toFuture
    @inline def createConfigurationSetFuture(
        params: CreateConfigurationSetRequest
    ): Future[CreateConfigurationSetResponse] = service.createConfigurationSet(params).promise().toFuture
    @inline def deleteConfigurationSetEventDestinationFuture(
        params: DeleteConfigurationSetEventDestinationRequest
    ): Future[DeleteConfigurationSetEventDestinationResponse] =
      service.deleteConfigurationSetEventDestination(params).promise().toFuture
    @inline def deleteConfigurationSetFuture(
        params: DeleteConfigurationSetRequest
    ): Future[DeleteConfigurationSetResponse] = service.deleteConfigurationSet(params).promise().toFuture
    @inline def getConfigurationSetEventDestinationsFuture(
        params: GetConfigurationSetEventDestinationsRequest
    ): Future[GetConfigurationSetEventDestinationsResponse] =
      service.getConfigurationSetEventDestinations(params).promise().toFuture
    @inline def listConfigurationSetsFuture(
        params: ListConfigurationSetsRequest
    ): Future[ListConfigurationSetsResponse] = service.listConfigurationSets(params).promise().toFuture
    @inline def sendVoiceMessageFuture(params: SendVoiceMessageRequest): Future[SendVoiceMessageResponse] =
      service.sendVoiceMessage(params).promise().toFuture
    @inline def updateConfigurationSetEventDestinationFuture(
        params: UpdateConfigurationSetEventDestinationRequest
    ): Future[UpdateConfigurationSetEventDestinationResponse] =
      service.updateConfigurationSetEventDestination(params).promise().toFuture
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
  @Factory
  trait CallInstructionsMessageType extends js.Object {
    var Text: js.UndefOr[NonEmptyString]
  }

  /**
    * An object that contains information about an event destination that sends data to Amazon CloudWatch Logs.
    */
  @js.native
  @Factory
  trait CloudWatchLogsDestination extends js.Object {
    var IamRoleArn: js.UndefOr[String]
    var LogGroupArn: js.UndefOr[String]
  }

  /**
    * Create a new event destination in a configuration set.
    */
  @js.native
  @Factory
  trait CreateConfigurationSetEventDestinationRequest extends js.Object {
    var ConfigurationSetName: __string
    var EventDestination: js.UndefOr[EventDestinationDefinition]
    var EventDestinationName: js.UndefOr[NonEmptyString]
  }

  /**
    * An empty object that indicates that the event destination was created successfully.
    */
  @js.native
  @Factory
  trait CreateConfigurationSetEventDestinationResponse extends js.Object {}

  /**
    * A request to create a new configuration set.
    */
  @js.native
  @Factory
  trait CreateConfigurationSetRequest extends js.Object {
    var ConfigurationSetName: js.UndefOr[WordCharactersWithDelimiters]
  }

  /**
    * An empty object that indicates that the configuration set was successfully created.
    */
  @js.native
  @Factory
  trait CreateConfigurationSetResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteConfigurationSetEventDestinationRequest extends js.Object {
    var ConfigurationSetName: __string
    var EventDestinationName: __string
  }

  /**
    * An empty object that indicates that the event destination was deleted successfully.
    */
  @js.native
  @Factory
  trait DeleteConfigurationSetEventDestinationResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteConfigurationSetRequest extends js.Object {
    var ConfigurationSetName: __string
  }

  /**
    * An empty object that indicates that the configuration set was deleted successfully.
    */
  @js.native
  @Factory
  trait DeleteConfigurationSetResponse extends js.Object {}

  /**
    * An object that defines an event destination.
    */
  @js.native
  @Factory
  trait EventDestination extends js.Object {
    var CloudWatchLogsDestination: js.UndefOr[CloudWatchLogsDestination]
    var Enabled: js.UndefOr[Boolean]
    var KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination]
    var MatchingEventTypes: js.UndefOr[EventTypes]
    var Name: js.UndefOr[String]
    var SnsDestination: js.UndefOr[SnsDestination]
  }

  /**
    * An object that defines a single event destination.
    */
  @js.native
  @Factory
  trait EventDestinationDefinition extends js.Object {
    var CloudWatchLogsDestination: js.UndefOr[CloudWatchLogsDestination]
    var Enabled: js.UndefOr[Boolean]
    var KinesisFirehoseDestination: js.UndefOr[KinesisFirehoseDestination]
    var MatchingEventTypes: js.UndefOr[EventTypes]
    var SnsDestination: js.UndefOr[SnsDestination]
  }

  /**
    * The types of events that are sent to the event destination.
    */
  @js.native
  sealed trait EventType extends js.Any
  object EventType extends js.Object {
    val INITIATED_CALL = "INITIATED_CALL".asInstanceOf[EventType]
    val RINGING        = "RINGING".asInstanceOf[EventType]
    val ANSWERED       = "ANSWERED".asInstanceOf[EventType]
    val COMPLETED_CALL = "COMPLETED_CALL".asInstanceOf[EventType]
    val BUSY           = "BUSY".asInstanceOf[EventType]
    val FAILED         = "FAILED".asInstanceOf[EventType]
    val NO_ANSWER      = "NO_ANSWER".asInstanceOf[EventType]

    val values = js.Object.freeze(js.Array(INITIATED_CALL, RINGING, ANSWERED, COMPLETED_CALL, BUSY, FAILED, NO_ANSWER))
  }

  @js.native
  @Factory
  trait GetConfigurationSetEventDestinationsRequest extends js.Object {
    var ConfigurationSetName: __string
  }

  /**
    * An object that contains information about an event destination.
    */
  @js.native
  @Factory
  trait GetConfigurationSetEventDestinationsResponse extends js.Object {
    var EventDestinations: js.UndefOr[EventDestinations]
  }

  /**
    * An object that contains information about an event destination that sends data to Amazon Kinesis Data Firehose.
    */
  @js.native
  @Factory
  trait KinesisFirehoseDestination extends js.Object {
    var DeliveryStreamArn: js.UndefOr[String]
    var IamRoleArn: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListConfigurationSetsRequest extends js.Object {
    var NextToken: js.UndefOr[__string]
    var PageSize: js.UndefOr[__string]
  }

  /**
    * An object that contains information about the configuration sets for your account in the current region.
    */
  @js.native
  @Factory
  trait ListConfigurationSetsResponse extends js.Object {
    var ConfigurationSets: js.UndefOr[ConfigurationSets]
    var NextToken: js.UndefOr[NextTokenString]
  }

  /**
    * An object that defines a message that contains unformatted text.
    */
  @js.native
  @Factory
  trait PlainTextMessageType extends js.Object {
    var LanguageCode: js.UndefOr[String]
    var Text: js.UndefOr[NonEmptyString]
    var VoiceId: js.UndefOr[String]
  }

  /**
    * An object that defines a message that contains SSML-formatted text.
    */
  @js.native
  @Factory
  trait SSMLMessageType extends js.Object {
    var LanguageCode: js.UndefOr[String]
    var Text: js.UndefOr[NonEmptyString]
    var VoiceId: js.UndefOr[String]
  }

  /**
    * SendVoiceMessageRequest
    */
  @js.native
  @Factory
  trait SendVoiceMessageRequest extends js.Object {
    var CallerId: js.UndefOr[String]
    var ConfigurationSetName: js.UndefOr[WordCharactersWithDelimiters]
    var Content: js.UndefOr[VoiceMessageContent]
    var DestinationPhoneNumber: js.UndefOr[NonEmptyString]
    var OriginationPhoneNumber: js.UndefOr[NonEmptyString]
  }

  /**
    * An object that that contains the Message ID of a Voice message that was sent successfully.
    */
  @js.native
  @Factory
  trait SendVoiceMessageResponse extends js.Object {
    var MessageId: js.UndefOr[String]
  }

  /**
    * An object that contains information about an event destination that sends data to Amazon SNS.
    */
  @js.native
  @Factory
  trait SnsDestination extends js.Object {
    var TopicArn: js.UndefOr[String]
  }

  /**
    * UpdateConfigurationSetEventDestinationRequest
    */
  @js.native
  @Factory
  trait UpdateConfigurationSetEventDestinationRequest extends js.Object {
    var ConfigurationSetName: __string
    var EventDestinationName: __string
    var EventDestination: js.UndefOr[EventDestinationDefinition]
  }

  /**
    * An empty object that indicates that the event destination was updated successfully.
    */
  @js.native
  @Factory
  trait UpdateConfigurationSetEventDestinationResponse extends js.Object {}

  /**
    * An object that contains a voice message and information about the recipient that you want to send it to.
    */
  @js.native
  @Factory
  trait VoiceMessageContent extends js.Object {
    var CallInstructionsMessage: js.UndefOr[CallInstructionsMessageType]
    var PlainTextMessage: js.UndefOr[PlainTextMessageType]
    var SSMLMessage: js.UndefOr[SSMLMessageType]
  }
}
