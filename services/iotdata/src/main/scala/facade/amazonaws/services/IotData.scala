package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object iotdata {
  type ErrorMessage = String
  type JsonDocument =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type Payload =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type Qos          = Int
  type ThingName    = String
  type Topic        = String
  type errorMessage = String

  implicit final class IotDataOps(val service: IotData) extends AnyVal {

    def deleteThingShadowFuture(params: DeleteThingShadowRequest): Future[DeleteThingShadowResponse] =
      service.deleteThingShadow(params).promise.toFuture
    def getThingShadowFuture(params: GetThingShadowRequest): Future[GetThingShadowResponse] =
      service.getThingShadow(params).promise.toFuture
    def publishFuture(params: PublishRequest): Future[js.Object] = service.publish(params).promise.toFuture
    def updateThingShadowFuture(params: UpdateThingShadowRequest): Future[UpdateThingShadowResponse] =
      service.updateThingShadow(params).promise.toFuture
  }
}

package iotdata {
  @js.native
  @JSImport("aws-sdk", "IotData")
  class IotData() extends js.Object {
    def this(config: AWSConfig) = this()

    def deleteThingShadow(params: DeleteThingShadowRequest): Request[DeleteThingShadowResponse] = js.native
    def getThingShadow(params: GetThingShadowRequest): Request[GetThingShadowResponse]          = js.native
    def publish(params: PublishRequest): Request[js.Object]                                     = js.native
    def updateThingShadow(params: UpdateThingShadowRequest): Request[UpdateThingShadowResponse] = js.native
  }

  /**
    * The specified version does not match the version of the document.
    */
  @js.native
  trait ConflictExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * The input for the DeleteThingShadow operation.
    */
  @js.native
  trait DeleteThingShadowRequest extends js.Object {
    var thingName: ThingName
  }

  object DeleteThingShadowRequest {
    def apply(
        thingName: ThingName
    ): DeleteThingShadowRequest = {
      val __obj = js.Dictionary[js.Any](
        "thingName" -> thingName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteThingShadowRequest]
    }
  }

  /**
    * The output from the DeleteThingShadow operation.
    */
  @js.native
  trait DeleteThingShadowResponse extends js.Object {
    var payload: JsonDocument
  }

  object DeleteThingShadowResponse {
    def apply(
        payload: JsonDocument
    ): DeleteThingShadowResponse = {
      val __obj = js.Dictionary[js.Any](
        "payload" -> payload.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteThingShadowResponse]
    }
  }

  /**
    * The input for the GetThingShadow operation.
    */
  @js.native
  trait GetThingShadowRequest extends js.Object {
    var thingName: ThingName
  }

  object GetThingShadowRequest {
    def apply(
        thingName: ThingName
    ): GetThingShadowRequest = {
      val __obj = js.Dictionary[js.Any](
        "thingName" -> thingName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetThingShadowRequest]
    }
  }

  /**
    * The output from the GetThingShadow operation.
    */
  @js.native
  trait GetThingShadowResponse extends js.Object {
    var payload: js.UndefOr[JsonDocument]
  }

  object GetThingShadowResponse {
    def apply(
        payload: js.UndefOr[JsonDocument] = js.undefined
    ): GetThingShadowResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      payload.foreach(__v => __obj.update("payload", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetThingShadowResponse]
    }
  }

  /**
    * An unexpected error has occurred.
    */
  @js.native
  trait InternalFailureExceptionException extends js.Object {
    val message: errorMessage
  }

  /**
    * The request is not valid.
    */
  @js.native
  trait InvalidRequestExceptionException extends js.Object {
    val message: errorMessage
  }

  /**
    * The specified combination of HTTP verb and URI is not supported.
    */
  @js.native
  trait MethodNotAllowedExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * The input for the Publish operation.
    */
  @js.native
  trait PublishRequest extends js.Object {
    var topic: Topic
    var payload: js.UndefOr[Payload]
    var qos: js.UndefOr[Qos]
  }

  object PublishRequest {
    def apply(
        topic: Topic,
        payload: js.UndefOr[Payload] = js.undefined,
        qos: js.UndefOr[Qos] = js.undefined
    ): PublishRequest = {
      val __obj = js.Dictionary[js.Any](
        "topic" -> topic.asInstanceOf[js.Any]
      )

      payload.foreach(__v => __obj.update("payload", __v.asInstanceOf[js.Any]))
      qos.foreach(__v => __obj.update("qos", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PublishRequest]
    }
  }

  /**
    * The payload exceeds the maximum size allowed.
    */
  @js.native
  trait RequestEntityTooLargeExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * The specified resource does not exist.
    */
  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {
    val message: errorMessage
  }

  /**
    * The service is temporarily unavailable.
    */
  @js.native
  trait ServiceUnavailableExceptionException extends js.Object {
    val message: errorMessage
  }

  /**
    * The rate exceeds the limit.
    */
  @js.native
  trait ThrottlingExceptionException extends js.Object {
    val message: errorMessage
  }

  /**
    * You are not authorized to perform this operation.
    */
  @js.native
  trait UnauthorizedExceptionException extends js.Object {
    val message: errorMessage
  }

  /**
    * The document encoding is not supported.
    */
  @js.native
  trait UnsupportedDocumentEncodingExceptionException extends js.Object {
    val message: errorMessage
  }

  /**
    * The input for the UpdateThingShadow operation.
    */
  @js.native
  trait UpdateThingShadowRequest extends js.Object {
    var payload: JsonDocument
    var thingName: ThingName
  }

  object UpdateThingShadowRequest {
    def apply(
        payload: JsonDocument,
        thingName: ThingName
    ): UpdateThingShadowRequest = {
      val __obj = js.Dictionary[js.Any](
        "payload"   -> payload.asInstanceOf[js.Any],
        "thingName" -> thingName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateThingShadowRequest]
    }
  }

  /**
    * The output from the UpdateThingShadow operation.
    */
  @js.native
  trait UpdateThingShadowResponse extends js.Object {
    var payload: js.UndefOr[JsonDocument]
  }

  object UpdateThingShadowResponse {
    def apply(
        payload: js.UndefOr[JsonDocument] = js.undefined
    ): UpdateThingShadowResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      payload.foreach(__v => __obj.update("payload", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateThingShadowResponse]
    }
  }
}
