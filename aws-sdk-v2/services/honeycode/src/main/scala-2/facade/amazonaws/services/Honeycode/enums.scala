package facade.amazonaws.services.honeycode

import scalajs.js

@js.native
sealed trait Format extends js.Any
object Format {
  val AUTO = "AUTO".asInstanceOf[Format]
  val NUMBER = "NUMBER".asInstanceOf[Format]
  val CURRENCY = "CURRENCY".asInstanceOf[Format]
  val DATE = "DATE".asInstanceOf[Format]
  val TIME = "TIME".asInstanceOf[Format]
  val DATE_TIME = "DATE_TIME".asInstanceOf[Format]
  val PERCENTAGE = "PERCENTAGE".asInstanceOf[Format]
  val TEXT = "TEXT".asInstanceOf[Format]
  val ACCOUNTING = "ACCOUNTING".asInstanceOf[Format]
  val CONTACT = "CONTACT".asInstanceOf[Format]
  val ROWLINK = "ROWLINK".asInstanceOf[Format]

  @inline def values: js.Array[Format] = js.Array(AUTO, NUMBER, CURRENCY, DATE, TIME, DATE_TIME, PERCENTAGE, TEXT, ACCOUNTING, CONTACT, ROWLINK)
}

@js.native
sealed trait ImportDataCharacterEncoding extends js.Any
object ImportDataCharacterEncoding {
  val `UTF-8` = "UTF-8".asInstanceOf[ImportDataCharacterEncoding]
  val `US-ASCII` = "US-ASCII".asInstanceOf[ImportDataCharacterEncoding]
  val `ISO-8859-1` = "ISO-8859-1".asInstanceOf[ImportDataCharacterEncoding]
  val `UTF-16BE` = "UTF-16BE".asInstanceOf[ImportDataCharacterEncoding]
  val `UTF-16LE` = "UTF-16LE".asInstanceOf[ImportDataCharacterEncoding]
  val `UTF-16` = "UTF-16".asInstanceOf[ImportDataCharacterEncoding]

  @inline def values: js.Array[ImportDataCharacterEncoding] = js.Array(`UTF-8`, `US-ASCII`, `ISO-8859-1`, `UTF-16BE`, `UTF-16LE`, `UTF-16`)
}

@js.native
sealed trait ImportSourceDataFormat extends js.Any
object ImportSourceDataFormat {
  val DELIMITED_TEXT = "DELIMITED_TEXT".asInstanceOf[ImportSourceDataFormat]

  @inline def values: js.Array[ImportSourceDataFormat] = js.Array(DELIMITED_TEXT)
}

@js.native
sealed trait TableDataImportJobStatus extends js.Any
object TableDataImportJobStatus {
  val SUBMITTED = "SUBMITTED".asInstanceOf[TableDataImportJobStatus]
  val IN_PROGRESS = "IN_PROGRESS".asInstanceOf[TableDataImportJobStatus]
  val COMPLETED = "COMPLETED".asInstanceOf[TableDataImportJobStatus]
  val FAILED = "FAILED".asInstanceOf[TableDataImportJobStatus]

  @inline def values: js.Array[TableDataImportJobStatus] = js.Array(SUBMITTED, IN_PROGRESS, COMPLETED, FAILED)
}

@js.native
sealed trait UpsertAction extends js.Any
object UpsertAction {
  val UPDATED = "UPDATED".asInstanceOf[UpsertAction]
  val APPENDED = "APPENDED".asInstanceOf[UpsertAction]

  @inline def values: js.Array[UpsertAction] = js.Array(UPDATED, APPENDED)
}
