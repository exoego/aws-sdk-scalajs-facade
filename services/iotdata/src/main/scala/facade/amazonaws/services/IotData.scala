package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object iotdata {
  type ErrorMessage = String
  type JsonDocument = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type Payload      = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type Qos          = Int
  type ThingName    = String
  type Topic        = String
  type errorMessage = String

  implicit final class IotDataOps(private val service: IotData) extends AnyVal {

    @inline def deleteThingShadowFuture(params: DeleteThingShadowRequest): Future[DeleteThingShadowResponse] =
      service.deleteThingShadow(params).promise().toFuture
    @inline def getThingShadowFuture(params: GetThingShadowRequest): Future[GetThingShadowResponse] =
      service.getThingShadow(params).promise().toFuture
    @inline def publishFuture(params: PublishRequest): Future[js.Object] = service.publish(params).promise().toFuture
    @inline def updateThingShadowFuture(params: UpdateThingShadowRequest): Future[UpdateThingShadowResponse] =
      service.updateThingShadow(params).promise().toFuture
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
  @Factory
  trait DeleteThingShadowRequest extends js.Object {
    var thingName: ThingName
  }

  /**
    * The output from the DeleteThingShadow operation.
    */
  @js.native
  @Factory
  trait DeleteThingShadowResponse extends js.Object {
    var payload: JsonDocument
  }

  /**
    * The input for the GetThingShadow operation.
    */
  @js.native
  @Factory
  trait GetThingShadowRequest extends js.Object {
    var thingName: ThingName
  }

  /**
    * The output from the GetThingShadow operation.
    */
  @js.native
  @Factory
  trait GetThingShadowResponse extends js.Object {
    var payload: js.UndefOr[JsonDocument]
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
  @Factory
  trait PublishRequest extends js.Object {
    var topic: Topic
    var payload: js.UndefOr[Payload]
    var qos: js.UndefOr[Qos]
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
  @Factory
  trait UpdateThingShadowRequest extends js.Object {
    var payload: JsonDocument
    var thingName: ThingName
  }

  /**
    * The output from the UpdateThingShadow operation.
    */
  @js.native
  @Factory
  trait UpdateThingShadowResponse extends js.Object {
    var payload: js.UndefOr[JsonDocument]
  }
}
