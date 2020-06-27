package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object sagemakerruntime {
  type BodyBlob               = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type CustomAttributesHeader = String
  type EndpointName           = String
  type Header                 = String
  type TargetModelHeader      = String

  implicit final class SageMakerRuntimeOps(private val service: SageMakerRuntime) extends AnyVal {

    @inline def invokeEndpointFuture(params: InvokeEndpointInput): Future[InvokeEndpointOutput] =
      service.invokeEndpoint(params).promise().toFuture
  }
}

package sagemakerruntime {
  @js.native
  @JSImport("aws-sdk", "SageMakerRuntime")
  class SageMakerRuntime() extends js.Object {
    def this(config: AWSConfig) = this()

    def invokeEndpoint(params: InvokeEndpointInput): Request[InvokeEndpointOutput] = js.native
  }

  @js.native
  @Factory
  trait InvokeEndpointInput extends js.Object {
    var Body: BodyBlob
    var EndpointName: EndpointName
    var Accept: js.UndefOr[Header]
    var ContentType: js.UndefOr[Header]
    var CustomAttributes: js.UndefOr[CustomAttributesHeader]
    var TargetModel: js.UndefOr[TargetModelHeader]
  }

  @js.native
  @Factory
  trait InvokeEndpointOutput extends js.Object {
    var Body: BodyBlob
    var ContentType: js.UndefOr[Header]
    var CustomAttributes: js.UndefOr[CustomAttributesHeader]
    var InvokedProductionVariant: js.UndefOr[Header]
  }
}
