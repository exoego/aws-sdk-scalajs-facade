package facade.amazonaws

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("aws-sdk/lib/core", JSImport.Namespace, "AWS")
object AWS extends js.Object {
  var config: AWSConfigWithServicesDefault = js.native
}

trait ParamsWithEndpoint extends js.Object {
  var params: js.UndefOr[AWSConfig] = js.undefined
  var endpoint: js.UndefOr[String] = js.undefined
}
object ParamsWithEndpoint {
  @inline
  def apply(
      params: js.UndefOr[AWSConfig] = js.undefined,
      endpoint: js.UndefOr[String] = js.undefined
  ): ParamsWithEndpoint = {
    val __obj = js.Dynamic.literal()
    params.foreach(v => __obj.updateDynamic("params")(v))
    endpoint.foreach(v => __obj.updateDynamic("endpoint")(v))
    __obj.asInstanceOf[ParamsWithEndpoint]
  }
}

trait S3ParamsWithEndpoint extends ParamsWithEndpoint {
  var useDualstack: js.UndefOr[Boolean] = js.undefined
}
object S3ParamsWithEndpoint {
  @inline
  def apply(
      params: js.UndefOr[AWSConfig] = js.undefined,
      endpoint: js.UndefOr[String] = js.undefined,
      useDualstack: js.UndefOr[Boolean] = js.undefined
  ): S3ParamsWithEndpoint = {
    val __obj = js.Dynamic.literal()
    params.foreach(v => __obj.updateDynamic("params")(v))
    endpoint.foreach(v => __obj.updateDynamic("endpoint")(v))
    useDualstack.foreach(v => __obj.updateDynamic("useDualstack")(v))
    __obj.asInstanceOf[S3ParamsWithEndpoint]
  }
}
