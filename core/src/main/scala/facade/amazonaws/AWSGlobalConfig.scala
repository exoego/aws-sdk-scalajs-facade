package facade.amazonaws

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("aws-sdk", JSImport.Namespace)
private[amazonaws] object AWSGlobal extends js.Object {
  var config: AWSConfigWithServicesDefault = js.native
}

object AWSGlobalConfig {
  def config: AWSConfigWithServicesDefault = AWSGlobal.config
  def config_=(config: AWSConfig): Unit = {
    AWSGlobal.config = config match {
      case global: AWSConfigWithServicesDefault => global
      case _                                    => config.asInstanceOf[AWSConfigWithServicesDefault]
    }
  }
  def config_=(config: AWSConfigWithServicesDefault): Unit = {
    AWSGlobal.config = config
  }
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
