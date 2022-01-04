package facade.amazonaws.credentials

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("aws-sdk/lib/node_loader", "ECSCredentials", "AWS.ECSCredentials")
class ECSCredentials() extends RemoteCredentials {
  def this(options: ECSCredentialsOptions) = this()
}

trait ECSCredentialsOptions extends js.Object {
  var httpOptions: js.UndefOr[ECSCredentialsOptions.HttpOptions]
  var maxRetries: js.UndefOr[Double]
}

object ECSCredentialsOptions {
  def apply(
      httpOptions: js.UndefOr[ECSCredentialsOptions.HttpOptions] = js.undefined,
      maxRetries: js.UndefOr[Double] = js.undefined
  ): ECSCredentialsOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    httpOptions.foreach(_v => _obj$.updateDynamic("httpOptions")(_v.asInstanceOf[js.Any]))
    maxRetries.foreach(_v => _obj$.updateDynamic("maxRetries")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[ECSCredentialsOptions]
  }

  trait HttpOptions extends js.Object {
    var timeout: js.UndefOr[Double]
  }

  object HttpOptions {
    def apply(
        timeout: js.UndefOr[Double] = js.undefined
    ): HttpOptions = {
      val _obj$ = js.Dynamic.literal(
      )
      timeout.foreach(_v => _obj$.updateDynamic("timeout")(_v.asInstanceOf[js.Any]))
      _obj$.asInstanceOf[HttpOptions]
    }
  }
}
