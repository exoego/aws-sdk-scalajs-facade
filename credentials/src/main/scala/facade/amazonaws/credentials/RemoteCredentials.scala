package facade.amazonaws.credentials

import facade.amazonaws.AWSCredentials

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("aws-sdk/lib/node_loader", "RemoteCredentials", "AWS.RemoteCredentials")
class RemoteCredentials() extends AWSCredentials {
  def this(options: RemoteCredentialsOptions) = this()
}

trait RemoteCredentialsOptions extends js.Object {
  var httpOptions: js.UndefOr[RemoteCredentialsOptions.HttpOptions]
  var maxRetries: js.UndefOr[Double]
}

object RemoteCredentialsOptions {
  def apply(
      httpOptions: js.UndefOr[RemoteCredentialsOptions.HttpOptions] = js.undefined,
      maxRetries: js.UndefOr[Double] = js.undefined
  ): RemoteCredentialsOptions = {
    val _obj$ = js.Dynamic.literal(
    )
    httpOptions.foreach(_v => _obj$.updateDynamic("httpOptions")(_v.asInstanceOf[js.Any]))
    maxRetries.foreach(_v => _obj$.updateDynamic("maxRetries")(_v.asInstanceOf[js.Any]))
    _obj$.asInstanceOf[RemoteCredentialsOptions]
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
