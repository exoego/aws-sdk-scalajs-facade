package facade.amazonaws.services.applicationcostprofiler

import scalajs.js

type Format = "CSV" | "PARQUET"
object Format {
  inline val CSV: "CSV" = "CSV"
  inline val PARQUET: "PARQUET" = "PARQUET"

  inline def values: js.Array[Format] = js.Array(CSV, PARQUET)
}

type ReportFrequency = "MONTHLY" | "DAILY" | "ALL"
object ReportFrequency {
  inline val MONTHLY: "MONTHLY" = "MONTHLY"
  inline val DAILY: "DAILY" = "DAILY"
  inline val ALL: "ALL" = "ALL"

  inline def values: js.Array[ReportFrequency] = js.Array(MONTHLY, DAILY, ALL)
}

type S3BucketRegion = "ap-east-1" | "me-south-1" | "eu-south-1" | "af-south-1"
object S3BucketRegion {
  inline val `ap-east-1`: "ap-east-1" = "ap-east-1"
  inline val `me-south-1`: "me-south-1" = "me-south-1"
  inline val `eu-south-1`: "eu-south-1" = "eu-south-1"
  inline val `af-south-1`: "af-south-1" = "af-south-1"

  inline def values: js.Array[S3BucketRegion] = js.Array(`ap-east-1`, `me-south-1`, `eu-south-1`, `af-south-1`)
}
