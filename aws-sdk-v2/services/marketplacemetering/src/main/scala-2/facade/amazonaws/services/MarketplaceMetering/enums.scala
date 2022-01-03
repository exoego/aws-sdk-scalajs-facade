package facade.amazonaws.services.marketplacemetering

import scalajs.js

@js.native
sealed trait UsageRecordResultStatus extends js.Any
object UsageRecordResultStatus {
  val Success = "Success".asInstanceOf[UsageRecordResultStatus]
  val CustomerNotSubscribed = "CustomerNotSubscribed".asInstanceOf[UsageRecordResultStatus]
  val DuplicateRecord = "DuplicateRecord".asInstanceOf[UsageRecordResultStatus]

  @inline def values: js.Array[UsageRecordResultStatus] = js.Array(Success, CustomerNotSubscribed, DuplicateRecord)
}
