package facade.amazonaws

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("aws-sdk", JSImport.Namespace)
object AWS extends js.Object {
  var config: AWSConfigWithServicesDefault = js.native
}

class ParamsWithEndpoint(
    var params: js.UndefOr[AWSConfig] = js.undefined,
    var endpoint: js.UndefOr[String] = js.undefined
) extends js.Object

class S3ParamsWithEndpoint(
    params: js.UndefOr[AWSConfig] = js.undefined,
    endpoint: js.UndefOr[String] = js.undefined,
    var useDualstack: js.UndefOr[Boolean] = js.undefined
) extends ParamsWithEndpoint(params, endpoint)
