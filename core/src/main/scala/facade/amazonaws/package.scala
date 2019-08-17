package facade

import scala.scalajs.js

package object amazonaws {
  type Callback[T <: js.Object] = js.Function2[Error, T, Unit]
}
