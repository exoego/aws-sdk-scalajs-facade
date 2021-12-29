package facade.amazonaws.services.honeycode

import scalajs._

type Format = "AUTO" | "NUMBER" | "CURRENCY" | "DATE" | "TIME" | "DATE_TIME" | "PERCENTAGE" | "TEXT" | "ACCOUNTING" | "CONTACT" | "ROWLINK"
object Format {
  inline val AUTO: "AUTO" = "AUTO"
  inline val NUMBER: "NUMBER" = "NUMBER"
  inline val CURRENCY: "CURRENCY" = "CURRENCY"
  inline val DATE: "DATE" = "DATE"
  inline val TIME: "TIME" = "TIME"
  inline val DATE_TIME: "DATE_TIME" = "DATE_TIME"
  inline val PERCENTAGE: "PERCENTAGE" = "PERCENTAGE"
  inline val TEXT: "TEXT" = "TEXT"
  inline val ACCOUNTING: "ACCOUNTING" = "ACCOUNTING"
  inline val CONTACT: "CONTACT" = "CONTACT"
  inline val ROWLINK: "ROWLINK" = "ROWLINK"

  inline def values: js.Array[Format] = js.Array(AUTO, NUMBER, CURRENCY, DATE, TIME, DATE_TIME, PERCENTAGE, TEXT, ACCOUNTING, CONTACT, ROWLINK)
}

type ImportDataCharacterEncoding = "UTF-8" | "US-ASCII" | "ISO-8859-1" | "UTF-16BE" | "UTF-16LE" | "UTF-16"
object ImportDataCharacterEncoding {
  inline val `UTF-8`: "UTF-8" = "UTF-8"
  inline val `US-ASCII`: "US-ASCII" = "US-ASCII"
  inline val `ISO-8859-1`: "ISO-8859-1" = "ISO-8859-1"
  inline val `UTF-16BE`: "UTF-16BE" = "UTF-16BE"
  inline val `UTF-16LE`: "UTF-16LE" = "UTF-16LE"
  inline val `UTF-16`: "UTF-16" = "UTF-16"

  inline def values: js.Array[ImportDataCharacterEncoding] = js.Array(`UTF-8`, `US-ASCII`, `ISO-8859-1`, `UTF-16BE`, `UTF-16LE`, `UTF-16`)
}

type ImportSourceDataFormat = "DELIMITED_TEXT"
object ImportSourceDataFormat {
  inline val DELIMITED_TEXT: "DELIMITED_TEXT" = "DELIMITED_TEXT"

  inline def values: js.Array[ImportSourceDataFormat] = js.Array(DELIMITED_TEXT)
}

type TableDataImportJobStatus = "SUBMITTED" | "IN_PROGRESS" | "COMPLETED" | "FAILED"
object TableDataImportJobStatus {
  inline val SUBMITTED: "SUBMITTED" = "SUBMITTED"
  inline val IN_PROGRESS: "IN_PROGRESS" = "IN_PROGRESS"
  inline val COMPLETED: "COMPLETED" = "COMPLETED"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[TableDataImportJobStatus] = js.Array(SUBMITTED, IN_PROGRESS, COMPLETED, FAILED)
}

type UpsertAction = "UPDATED" | "APPENDED"
object UpsertAction {
  inline val UPDATED: "UPDATED" = "UPDATED"
  inline val APPENDED: "APPENDED" = "APPENDED"

  inline def values: js.Array[UpsertAction] = js.Array(UPDATED, APPENDED)
}
