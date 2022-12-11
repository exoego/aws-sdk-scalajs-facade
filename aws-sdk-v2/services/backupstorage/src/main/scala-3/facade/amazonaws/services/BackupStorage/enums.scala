package facade.amazonaws.services.backupstorage

import scalajs.js

type DataChecksumAlgorithm = "SHA256"
object DataChecksumAlgorithm {
  inline val SHA256: "SHA256" = "SHA256"

  inline def values: js.Array[DataChecksumAlgorithm] = js.Array(SHA256)
}

type SummaryChecksumAlgorithm = "SUMMARY"
object SummaryChecksumAlgorithm {
  inline val SUMMARY: "SUMMARY" = "SUMMARY"

  inline def values: js.Array[SummaryChecksumAlgorithm] = js.Array(SUMMARY)
}
