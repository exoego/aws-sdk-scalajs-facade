package facade.amazonaws.services.ebs

import scalajs._

type ChecksumAggregationMethod = "LINEAR"
object ChecksumAggregationMethod {
  inline val LINEAR: "LINEAR" = "LINEAR"

  inline def values: js.Array[ChecksumAggregationMethod] = js.Array(LINEAR)
}

type ChecksumAlgorithm = "SHA256"
object ChecksumAlgorithm {
  inline val SHA256: "SHA256" = "SHA256"

  inline def values: js.Array[ChecksumAlgorithm] = js.Array(SHA256)
}

type Status = "completed" | "pending" | "error"
object Status {
  inline val completed: "completed" = "completed"
  inline val pending: "pending" = "pending"
  inline val error: "error" = "error"

  inline def values: js.Array[Status] = js.Array(completed, pending, error)
}
