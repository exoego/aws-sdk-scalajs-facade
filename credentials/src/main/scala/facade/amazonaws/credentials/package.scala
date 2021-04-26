package facade.amazonaws

import scala.scalajs.js

package object credentials {
  type Provider = js.Function0[AWSCredentials]
}
