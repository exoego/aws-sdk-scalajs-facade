package facade.amazonaws.services.applicationcostprofiler

import scalajs.js

@js.native
sealed trait Format extends js.Any
object Format {
  val CSV = "CSV".asInstanceOf[Format]
  val PARQUET = "PARQUET".asInstanceOf[Format]

  @inline def values: js.Array[Format] = js.Array(CSV, PARQUET)
}

@js.native
sealed trait ReportFrequency extends js.Any
object ReportFrequency {
  val MONTHLY = "MONTHLY".asInstanceOf[ReportFrequency]
  val DAILY = "DAILY".asInstanceOf[ReportFrequency]
  val ALL = "ALL".asInstanceOf[ReportFrequency]

  @inline def values: js.Array[ReportFrequency] = js.Array(MONTHLY, DAILY, ALL)
}

@js.native
sealed trait S3BucketRegion extends js.Any
object S3BucketRegion {
  val `ap-east-1` = "ap-east-1".asInstanceOf[S3BucketRegion]
  val `me-south-1` = "me-south-1".asInstanceOf[S3BucketRegion]
  val `eu-south-1` = "eu-south-1".asInstanceOf[S3BucketRegion]
  val `af-south-1` = "af-south-1".asInstanceOf[S3BucketRegion]

  @inline def values: js.Array[S3BucketRegion] = js.Array(`ap-east-1`, `me-south-1`, `eu-south-1`, `af-south-1`)
}
