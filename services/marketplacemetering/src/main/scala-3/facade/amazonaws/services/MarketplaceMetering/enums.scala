package facade.amazonaws.services.marketplacemetering

import scalajs._

type UsageRecordResultStatus = "Success" | "CustomerNotSubscribed" | "DuplicateRecord"
object UsageRecordResultStatus {
  val Success: "Success" = "Success"
  val CustomerNotSubscribed: "CustomerNotSubscribed" = "CustomerNotSubscribed"
  val DuplicateRecord: "DuplicateRecord" = "DuplicateRecord"

  @inline def values = js.Array[UsageRecordResultStatus](Success, CustomerNotSubscribed, DuplicateRecord)
}
