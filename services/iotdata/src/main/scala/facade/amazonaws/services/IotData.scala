package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object iotdata {
  type JsonDocument = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type MaxResults = Int
  type NamedShadowList = js.Array[ShadowName]
  type NextToken = String
  type PageSize = Int
  type Payload = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type PayloadSize = Double
  type Qos = Int
  type Retain = Boolean
  type RetainedMessageList = js.Array[RetainedMessageSummary]
  type ShadowName = String
  type ThingName = String
  type Timestamp = Double
  type Topic = String

  final class IotDataOps(private val service: IotData) extends AnyVal {

    @inline def deleteThingShadowFuture(params: DeleteThingShadowRequest): Future[DeleteThingShadowResponse] = service.deleteThingShadow(params).promise().toFuture
    @inline def getRetainedMessageFuture(params: GetRetainedMessageRequest): Future[GetRetainedMessageResponse] = service.getRetainedMessage(params).promise().toFuture
    @inline def getThingShadowFuture(params: GetThingShadowRequest): Future[GetThingShadowResponse] = service.getThingShadow(params).promise().toFuture
    @inline def listNamedShadowsForThingFuture(params: ListNamedShadowsForThingRequest): Future[ListNamedShadowsForThingResponse] = service.listNamedShadowsForThing(params).promise().toFuture
    @inline def listRetainedMessagesFuture(params: ListRetainedMessagesRequest): Future[ListRetainedMessagesResponse] = service.listRetainedMessages(params).promise().toFuture
    @inline def publishFuture(params: PublishRequest): Future[js.Object] = service.publish(params).promise().toFuture
    @inline def updateThingShadowFuture(params: UpdateThingShadowRequest): Future[UpdateThingShadowResponse] = service.updateThingShadow(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/iotdata", JSImport.Namespace, "AWS.IotData")
  class IotData() extends js.Object {
    def this(config: AWSConfig) = this()

    def deleteThingShadow(params: DeleteThingShadowRequest): Request[DeleteThingShadowResponse] = js.native
    def getRetainedMessage(params: GetRetainedMessageRequest): Request[GetRetainedMessageResponse] = js.native
    def getThingShadow(params: GetThingShadowRequest): Request[GetThingShadowResponse] = js.native
    def listNamedShadowsForThing(params: ListNamedShadowsForThingRequest): Request[ListNamedShadowsForThingResponse] = js.native
    def listRetainedMessages(params: ListRetainedMessagesRequest): Request[ListRetainedMessagesResponse] = js.native
    def publish(params: PublishRequest): Request[js.Object] = js.native
    def updateThingShadow(params: UpdateThingShadowRequest): Request[UpdateThingShadowResponse] = js.native
  }
  object IotData {
    @inline implicit def toOps(service: IotData): IotDataOps = {
      new IotDataOps(service)
    }
  }

  /** The input for the DeleteThingShadow operation.
    */
  @js.native
  trait DeleteThingShadowRequest extends js.Object {
    var thingName: ThingName
    var shadowName: js.UndefOr[ShadowName]
  }

  object DeleteThingShadowRequest {
    @inline
    def apply(
        thingName: ThingName,
        shadowName: js.UndefOr[ShadowName] = js.undefined
    ): DeleteThingShadowRequest = {
      val __obj = js.Dynamic.literal(
        "thingName" -> thingName.asInstanceOf[js.Any]
      )

      shadowName.foreach(__v => __obj.updateDynamic("shadowName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteThingShadowRequest]
    }
  }

  /** The output from the DeleteThingShadow operation.
    */
  @js.native
  trait DeleteThingShadowResponse extends js.Object {
    var payload: JsonDocument
  }

  object DeleteThingShadowResponse {
    @inline
    def apply(
        payload: JsonDocument
    ): DeleteThingShadowResponse = {
      val __obj = js.Dynamic.literal(
        "payload" -> payload.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteThingShadowResponse]
    }
  }

  /** The input for the GetRetainedMessage operation.
    */
  @js.native
  trait GetRetainedMessageRequest extends js.Object {
    var topic: Topic
  }

  object GetRetainedMessageRequest {
    @inline
    def apply(
        topic: Topic
    ): GetRetainedMessageRequest = {
      val __obj = js.Dynamic.literal(
        "topic" -> topic.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetRetainedMessageRequest]
    }
  }

  /** The output from the GetRetainedMessage operation.
    */
  @js.native
  trait GetRetainedMessageResponse extends js.Object {
    var lastModifiedTime: js.UndefOr[Timestamp]
    var payload: js.UndefOr[Payload]
    var qos: js.UndefOr[Qos]
    var topic: js.UndefOr[Topic]
  }

  object GetRetainedMessageResponse {
    @inline
    def apply(
        lastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        payload: js.UndefOr[Payload] = js.undefined,
        qos: js.UndefOr[Qos] = js.undefined,
        topic: js.UndefOr[Topic] = js.undefined
    ): GetRetainedMessageResponse = {
      val __obj = js.Dynamic.literal()
      lastModifiedTime.foreach(__v => __obj.updateDynamic("lastModifiedTime")(__v.asInstanceOf[js.Any]))
      payload.foreach(__v => __obj.updateDynamic("payload")(__v.asInstanceOf[js.Any]))
      qos.foreach(__v => __obj.updateDynamic("qos")(__v.asInstanceOf[js.Any]))
      topic.foreach(__v => __obj.updateDynamic("topic")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRetainedMessageResponse]
    }
  }

  /** The input for the GetThingShadow operation.
    */
  @js.native
  trait GetThingShadowRequest extends js.Object {
    var thingName: ThingName
    var shadowName: js.UndefOr[ShadowName]
  }

  object GetThingShadowRequest {
    @inline
    def apply(
        thingName: ThingName,
        shadowName: js.UndefOr[ShadowName] = js.undefined
    ): GetThingShadowRequest = {
      val __obj = js.Dynamic.literal(
        "thingName" -> thingName.asInstanceOf[js.Any]
      )

      shadowName.foreach(__v => __obj.updateDynamic("shadowName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetThingShadowRequest]
    }
  }

  /** The output from the GetThingShadow operation.
    */
  @js.native
  trait GetThingShadowResponse extends js.Object {
    var payload: js.UndefOr[JsonDocument]
  }

  object GetThingShadowResponse {
    @inline
    def apply(
        payload: js.UndefOr[JsonDocument] = js.undefined
    ): GetThingShadowResponse = {
      val __obj = js.Dynamic.literal()
      payload.foreach(__v => __obj.updateDynamic("payload")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetThingShadowResponse]
    }
  }

  @js.native
  trait ListNamedShadowsForThingRequest extends js.Object {
    var thingName: ThingName
    var nextToken: js.UndefOr[NextToken]
    var pageSize: js.UndefOr[PageSize]
  }

  object ListNamedShadowsForThingRequest {
    @inline
    def apply(
        thingName: ThingName,
        nextToken: js.UndefOr[NextToken] = js.undefined,
        pageSize: js.UndefOr[PageSize] = js.undefined
    ): ListNamedShadowsForThingRequest = {
      val __obj = js.Dynamic.literal(
        "thingName" -> thingName.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      pageSize.foreach(__v => __obj.updateDynamic("pageSize")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNamedShadowsForThingRequest]
    }
  }

  @js.native
  trait ListNamedShadowsForThingResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var results: js.UndefOr[NamedShadowList]
    var timestamp: js.UndefOr[Timestamp]
  }

  object ListNamedShadowsForThingResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        results: js.UndefOr[NamedShadowList] = js.undefined,
        timestamp: js.UndefOr[Timestamp] = js.undefined
    ): ListNamedShadowsForThingResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      results.foreach(__v => __obj.updateDynamic("results")(__v.asInstanceOf[js.Any]))
      timestamp.foreach(__v => __obj.updateDynamic("timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNamedShadowsForThingResponse]
    }
  }

  @js.native
  trait ListRetainedMessagesRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[NextToken]
  }

  object ListRetainedMessagesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[NextToken] = js.undefined
    ): ListRetainedMessagesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRetainedMessagesRequest]
    }
  }

  @js.native
  trait ListRetainedMessagesResponse extends js.Object {
    var nextToken: js.UndefOr[NextToken]
    var retainedTopics: js.UndefOr[RetainedMessageList]
  }

  object ListRetainedMessagesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[NextToken] = js.undefined,
        retainedTopics: js.UndefOr[RetainedMessageList] = js.undefined
    ): ListRetainedMessagesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      retainedTopics.foreach(__v => __obj.updateDynamic("retainedTopics")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRetainedMessagesResponse]
    }
  }

  /** The input for the Publish operation.
    */
  @js.native
  trait PublishRequest extends js.Object {
    var topic: Topic
    var payload: js.UndefOr[Payload]
    var qos: js.UndefOr[Qos]
    var retain: js.UndefOr[Retain]
  }

  object PublishRequest {
    @inline
    def apply(
        topic: Topic,
        payload: js.UndefOr[Payload] = js.undefined,
        qos: js.UndefOr[Qos] = js.undefined,
        retain: js.UndefOr[Retain] = js.undefined
    ): PublishRequest = {
      val __obj = js.Dynamic.literal(
        "topic" -> topic.asInstanceOf[js.Any]
      )

      payload.foreach(__v => __obj.updateDynamic("payload")(__v.asInstanceOf[js.Any]))
      qos.foreach(__v => __obj.updateDynamic("qos")(__v.asInstanceOf[js.Any]))
      retain.foreach(__v => __obj.updateDynamic("retain")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PublishRequest]
    }
  }

  /** Information about a single retained message.
    */
  @js.native
  trait RetainedMessageSummary extends js.Object {
    var lastModifiedTime: js.UndefOr[Timestamp]
    var payloadSize: js.UndefOr[PayloadSize]
    var qos: js.UndefOr[Qos]
    var topic: js.UndefOr[Topic]
  }

  object RetainedMessageSummary {
    @inline
    def apply(
        lastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        payloadSize: js.UndefOr[PayloadSize] = js.undefined,
        qos: js.UndefOr[Qos] = js.undefined,
        topic: js.UndefOr[Topic] = js.undefined
    ): RetainedMessageSummary = {
      val __obj = js.Dynamic.literal()
      lastModifiedTime.foreach(__v => __obj.updateDynamic("lastModifiedTime")(__v.asInstanceOf[js.Any]))
      payloadSize.foreach(__v => __obj.updateDynamic("payloadSize")(__v.asInstanceOf[js.Any]))
      qos.foreach(__v => __obj.updateDynamic("qos")(__v.asInstanceOf[js.Any]))
      topic.foreach(__v => __obj.updateDynamic("topic")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RetainedMessageSummary]
    }
  }

  /** The input for the UpdateThingShadow operation.
    */
  @js.native
  trait UpdateThingShadowRequest extends js.Object {
    var payload: JsonDocument
    var thingName: ThingName
    var shadowName: js.UndefOr[ShadowName]
  }

  object UpdateThingShadowRequest {
    @inline
    def apply(
        payload: JsonDocument,
        thingName: ThingName,
        shadowName: js.UndefOr[ShadowName] = js.undefined
    ): UpdateThingShadowRequest = {
      val __obj = js.Dynamic.literal(
        "payload" -> payload.asInstanceOf[js.Any],
        "thingName" -> thingName.asInstanceOf[js.Any]
      )

      shadowName.foreach(__v => __obj.updateDynamic("shadowName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateThingShadowRequest]
    }
  }

  /** The output from the UpdateThingShadow operation.
    */
  @js.native
  trait UpdateThingShadowResponse extends js.Object {
    var payload: js.UndefOr[JsonDocument]
  }

  object UpdateThingShadowResponse {
    @inline
    def apply(
        payload: js.UndefOr[JsonDocument] = js.undefined
    ): UpdateThingShadowResponse = {
      val __obj = js.Dynamic.literal()
      payload.foreach(__v => __obj.updateDynamic("payload")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateThingShadowResponse]
    }
  }
}
