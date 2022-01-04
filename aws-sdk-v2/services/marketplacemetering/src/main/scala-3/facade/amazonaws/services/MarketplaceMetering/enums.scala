package facade.amazonaws.services.marketplacemetering

import scalajs.js

type UsageRecordResultStatus = "Success" | "CustomerNotSubscribed" | "DuplicateRecord"
object UsageRecordResultStatus {
  inline val Success: "Success" = "Success"
  inline val CustomerNotSubscribed: "CustomerNotSubscribed" = "CustomerNotSubscribed"
  inline val DuplicateRecord: "DuplicateRecord" = "DuplicateRecord"

  inline def values: js.Array[UsageRecordResultStatus] = js.Array(Success, CustomerNotSubscribed, DuplicateRecord)
}
