package facade.amazonaws.services.ebs

import scalajs._

type ChecksumAggregationMethod = "LINEAR"
object ChecksumAggregationMethod {
  val LINEAR: "LINEAR" = "LINEAR"

  @inline def values = js.Array[ChecksumAggregationMethod](LINEAR)
}

type ChecksumAlgorithm = "SHA256"
object ChecksumAlgorithm {
  val SHA256: "SHA256" = "SHA256"

  @inline def values = js.Array[ChecksumAlgorithm](SHA256)
}

type Status = "completed" | "pending" | "error"
object Status {
  val completed: "completed" = "completed"
  val pending: "pending" = "pending"
  val error: "error" = "error"

  @inline def values = js.Array[Status](completed, pending, error)
}
