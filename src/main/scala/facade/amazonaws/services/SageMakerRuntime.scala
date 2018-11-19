package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object sagemakerruntime {
  type BodyBlob = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type CustomAttributesHeader = String
  type EndpointName = String
  type Header = String
}

package sagemakerruntime {
  @js.native
  @JSImport("aws-sdk", "SageMakerRuntime")
  class SageMakerRuntime(config: AWSConfig) extends js.Object {
    def invokeEndpoint(params: InvokeEndpointInput): Request[InvokeEndpointOutput] = js.native
  }

  @js.native
  trait InvokeEndpointInput extends js.Object {
    var Accept: js.UndefOr[Header]
    var Body: js.UndefOr[BodyBlob]
    var CustomAttributes: js.UndefOr[CustomAttributesHeader]
    var EndpointName: js.UndefOr[EndpointName]
    var ContentType: js.UndefOr[Header]
  }

  object InvokeEndpointInput {
    def apply(
      Accept: js.UndefOr[Header] = js.undefined,
      Body: js.UndefOr[BodyBlob] = js.undefined,
      CustomAttributes: js.UndefOr[CustomAttributesHeader] = js.undefined,
      EndpointName: js.UndefOr[EndpointName] = js.undefined,
      ContentType: js.UndefOr[Header] = js.undefined): InvokeEndpointInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Accept" -> Accept.map { x => x.asInstanceOf[js.Any] },
        "Body" -> Body.map { x => x.asInstanceOf[js.Any] },
        "CustomAttributes" -> CustomAttributes.map { x => x.asInstanceOf[js.Any] },
        "EndpointName" -> EndpointName.map { x => x.asInstanceOf[js.Any] },
        "ContentType" -> ContentType.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InvokeEndpointInput]
    }
  }

  @js.native
  trait InvokeEndpointOutput extends js.Object {
    var Body: js.UndefOr[BodyBlob]
    var ContentType: js.UndefOr[Header]
    var InvokedProductionVariant: js.UndefOr[Header]
    var CustomAttributes: js.UndefOr[CustomAttributesHeader]
  }

  object InvokeEndpointOutput {
    def apply(
      Body: js.UndefOr[BodyBlob] = js.undefined,
      ContentType: js.UndefOr[Header] = js.undefined,
      InvokedProductionVariant: js.UndefOr[Header] = js.undefined,
      CustomAttributes: js.UndefOr[CustomAttributesHeader] = js.undefined): InvokeEndpointOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Body" -> Body.map { x => x.asInstanceOf[js.Any] },
        "ContentType" -> ContentType.map { x => x.asInstanceOf[js.Any] },
        "InvokedProductionVariant" -> InvokedProductionVariant.map { x => x.asInstanceOf[js.Any] },
        "CustomAttributes" -> CustomAttributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InvokeEndpointOutput]
    }
  }
}
