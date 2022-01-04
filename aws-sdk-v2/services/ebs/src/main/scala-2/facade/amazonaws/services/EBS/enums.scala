package facade.amazonaws.services.ebs

import scalajs.js

@js.native
sealed trait ChecksumAggregationMethod extends js.Any
object ChecksumAggregationMethod {
  val LINEAR = "LINEAR".asInstanceOf[ChecksumAggregationMethod]

  @inline def values: js.Array[ChecksumAggregationMethod] = js.Array(LINEAR)
}

@js.native
sealed trait ChecksumAlgorithm extends js.Any
object ChecksumAlgorithm {
  val SHA256 = "SHA256".asInstanceOf[ChecksumAlgorithm]

  @inline def values: js.Array[ChecksumAlgorithm] = js.Array(SHA256)
}

@js.native
sealed trait Status extends js.Any
object Status {
  val completed = "completed".asInstanceOf[Status]
  val pending = "pending".asInstanceOf[Status]
  val error = "error".asInstanceOf[Status]

  @inline def values: js.Array[Status] = js.Array(completed, pending, error)
}
