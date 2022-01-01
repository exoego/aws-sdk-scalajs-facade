package facade.amazonaws.services.redshiftdata

import scalajs.js

@js.native
sealed trait StatementStatusString extends js.Any
object StatementStatusString {
  val SUBMITTED = "SUBMITTED".asInstanceOf[StatementStatusString]
  val PICKED = "PICKED".asInstanceOf[StatementStatusString]
  val STARTED = "STARTED".asInstanceOf[StatementStatusString]
  val FINISHED = "FINISHED".asInstanceOf[StatementStatusString]
  val ABORTED = "ABORTED".asInstanceOf[StatementStatusString]
  val FAILED = "FAILED".asInstanceOf[StatementStatusString]

  @inline def values: js.Array[StatementStatusString] = js.Array(SUBMITTED, PICKED, STARTED, FINISHED, ABORTED, FAILED)
}

@js.native
sealed trait StatusString extends js.Any
object StatusString {
  val SUBMITTED = "SUBMITTED".asInstanceOf[StatusString]
  val PICKED = "PICKED".asInstanceOf[StatusString]
  val STARTED = "STARTED".asInstanceOf[StatusString]
  val FINISHED = "FINISHED".asInstanceOf[StatusString]
  val ABORTED = "ABORTED".asInstanceOf[StatusString]
  val FAILED = "FAILED".asInstanceOf[StatusString]
  val ALL = "ALL".asInstanceOf[StatusString]

  @inline def values: js.Array[StatusString] = js.Array(SUBMITTED, PICKED, STARTED, FINISHED, ABORTED, FAILED, ALL)
}
