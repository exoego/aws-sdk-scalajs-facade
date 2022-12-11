package facade.amazonaws.services.backupstorage

import scalajs.js

@js.native
sealed trait DataChecksumAlgorithm extends js.Any
object DataChecksumAlgorithm {
  val SHA256 = "SHA256".asInstanceOf[DataChecksumAlgorithm]

  @inline def values: js.Array[DataChecksumAlgorithm] = js.Array(SHA256)
}

@js.native
sealed trait SummaryChecksumAlgorithm extends js.Any
object SummaryChecksumAlgorithm {
  val SUMMARY = "SUMMARY".asInstanceOf[SummaryChecksumAlgorithm]

  @inline def values: js.Array[SummaryChecksumAlgorithm] = js.Array(SUMMARY)
}
