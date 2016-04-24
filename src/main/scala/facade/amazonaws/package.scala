package facade

import scalajs._

package object amazonaws {
  type Callback[T <: js.Object] = js.Function2[Error, T, Unit]
}
