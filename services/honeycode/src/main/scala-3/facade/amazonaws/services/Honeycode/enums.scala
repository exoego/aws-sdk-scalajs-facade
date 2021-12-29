package facade.amazonaws.services.honeycode

import scalajs._

type Format = "AUTO" | "NUMBER" | "CURRENCY" | "DATE" | "TIME" | "DATE_TIME" | "PERCENTAGE" | "TEXT" | "ACCOUNTING" | "CONTACT" | "ROWLINK"
object Format {
  val AUTO: "AUTO" = "AUTO"
  val NUMBER: "NUMBER" = "NUMBER"
  val CURRENCY: "CURRENCY" = "CURRENCY"
  val DATE: "DATE" = "DATE"
  val TIME: "TIME" = "TIME"
  val DATE_TIME: "DATE_TIME" = "DATE_TIME"
  val PERCENTAGE: "PERCENTAGE" = "PERCENTAGE"
  val TEXT: "TEXT" = "TEXT"
  val ACCOUNTING: "ACCOUNTING" = "ACCOUNTING"
  val CONTACT: "CONTACT" = "CONTACT"
  val ROWLINK: "ROWLINK" = "ROWLINK"

  @inline def values = js.Array[Format](AUTO, NUMBER, CURRENCY, DATE, TIME, DATE_TIME, PERCENTAGE, TEXT, ACCOUNTING, CONTACT, ROWLINK)
}

type ImportDataCharacterEncoding = "UTF-8" | "US-ASCII" | "ISO-8859-1" | "UTF-16BE" | "UTF-16LE" | "UTF-16"
object ImportDataCharacterEncoding {
  val `UTF-8`: "UTF-8" = "UTF-8"
  val `US-ASCII`: "US-ASCII" = "US-ASCII"
  val `ISO-8859-1`: "ISO-8859-1" = "ISO-8859-1"
  val `UTF-16BE`: "UTF-16BE" = "UTF-16BE"
  val `UTF-16LE`: "UTF-16LE" = "UTF-16LE"
  val `UTF-16`: "UTF-16" = "UTF-16"

  @inline def values = js.Array[ImportDataCharacterEncoding](`UTF-8`, `US-ASCII`, `ISO-8859-1`, `UTF-16BE`, `UTF-16LE`, `UTF-16`)
}

type ImportSourceDataFormat = "DELIMITED_TEXT"
object ImportSourceDataFormat {
  val DELIMITED_TEXT: "DELIMITED_TEXT" = "DELIMITED_TEXT"

  @inline def values = js.Array[ImportSourceDataFormat](DELIMITED_TEXT)
}

type TableDataImportJobStatus = "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "FAILED"
object TableDataImportJobStatus {
  val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  val COMPLETED: "COMPLETED" = "COMPLETED"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[TableDataImportJobStatus](SUBMITTED, IN_PROGRESS, COMPLETED, FAILED)
}

type UpsertAction = "UPDATED" | "APPENDED"
object UpsertAction {
  val UPDATED: "UPDATED" = "UPDATED"
  val APPENDED: "APPENDED" = "APPENDED"

  @inline def values = js.Array[UpsertAction](UPDATED, APPENDED)
}
