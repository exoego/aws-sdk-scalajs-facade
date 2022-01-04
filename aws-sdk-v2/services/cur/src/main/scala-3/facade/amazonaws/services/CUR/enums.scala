package facade.amazonaws.services.cur

import scalajs.js

/** The region of the S3 bucket that AWS delivers the report into.
  */
type AWSRegion = "af-south-1" | "ap-east-1" | "ap-south-1" | "ap-southeast-1" | "ap-southeast-2" | "ap-northeast-1" | "ap-northeast-2" | "ap-northeast-3" | "ca-central-1" | "eu-central-1" | "eu-west-1" | "eu-west-2" | "eu-west-3" | "eu-north-1" | "eu-south-1" | "me-south-1" | "sa-east-1" | "us-east-1" | "us-east-2" | "us-west-1" | "us-west-2" | "cn-north-1" | "cn-northwest-1"
object AWSRegion {
  inline val `af-south-1`: "af-south-1" = "af-south-1"
  inline val `ap-east-1`: "ap-east-1" = "ap-east-1"
  inline val `ap-south-1`: "ap-south-1" = "ap-south-1"
  inline val `ap-southeast-1`: "ap-southeast-1" = "ap-southeast-1"
  inline val `ap-southeast-2`: "ap-southeast-2" = "ap-southeast-2"
  inline val `ap-northeast-1`: "ap-northeast-1" = "ap-northeast-1"
  inline val `ap-northeast-2`: "ap-northeast-2" = "ap-northeast-2"
  inline val `ap-northeast-3`: "ap-northeast-3" = "ap-northeast-3"
  inline val `ca-central-1`: "ca-central-1" = "ca-central-1"
  inline val `eu-central-1`: "eu-central-1" = "eu-central-1"
  inline val `eu-west-1`: "eu-west-1" = "eu-west-1"
  inline val `eu-west-2`: "eu-west-2" = "eu-west-2"
  inline val `eu-west-3`: "eu-west-3" = "eu-west-3"
  inline val `eu-north-1`: "eu-north-1" = "eu-north-1"
  inline val `eu-south-1`: "eu-south-1" = "eu-south-1"
  inline val `me-south-1`: "me-south-1" = "me-south-1"
  inline val `sa-east-1`: "sa-east-1" = "sa-east-1"
  inline val `us-east-1`: "us-east-1" = "us-east-1"
  inline val `us-east-2`: "us-east-2" = "us-east-2"
  inline val `us-west-1`: "us-west-1" = "us-west-1"
  inline val `us-west-2`: "us-west-2" = "us-west-2"
  inline val `cn-north-1`: "cn-north-1" = "cn-north-1"
  inline val `cn-northwest-1`: "cn-northwest-1" = "cn-northwest-1"

  inline def values: js.Array[AWSRegion] = js.Array(
    `af-south-1`,
    `ap-east-1`,
    `ap-south-1`,
    `ap-southeast-1`,
    `ap-southeast-2`,
    `ap-northeast-1`,
    `ap-northeast-2`,
    `ap-northeast-3`,
    `ca-central-1`,
    `eu-central-1`,
    `eu-west-1`,
    `eu-west-2`,
    `eu-west-3`,
    `eu-north-1`,
    `eu-south-1`,
    `me-south-1`,
    `sa-east-1`,
    `us-east-1`,
    `us-east-2`,
    `us-west-1`,
    `us-west-2`,
    `cn-north-1`,
    `cn-northwest-1`
  )
}

/** The types of manifest that you want AWS to create for this report.
  */
type AdditionalArtifact = "REDSHIFT" | "QUICKSIGHT" | "ATHENA"
object AdditionalArtifact {
  inline val REDSHIFT: "REDSHIFT" = "REDSHIFT"
  inline val QUICKSIGHT: "QUICKSIGHT" = "QUICKSIGHT"
  inline val ATHENA: "ATHENA" = "ATHENA"

  inline def values: js.Array[AdditionalArtifact] = js.Array(REDSHIFT, QUICKSIGHT, ATHENA)
}

/** The compression format that AWS uses for the report.
  */
type CompressionFormat = "ZIP" | "GZIP" | "Parquet"
object CompressionFormat {
  inline val ZIP: "ZIP" = "ZIP"
  inline val GZIP: "GZIP" = "GZIP"
  inline val Parquet: "Parquet" = "Parquet"

  inline def values: js.Array[CompressionFormat] = js.Array(ZIP, GZIP, Parquet)
}

/** The format that AWS saves the report in.
  */
type ReportFormat = "textORcsv" | "Parquet"
object ReportFormat {
  inline val textORcsv: "textORcsv" = "textORcsv"
  inline val Parquet: "Parquet" = "Parquet"

  inline def values: js.Array[ReportFormat] = js.Array(textORcsv, Parquet)
}

type ReportVersioning = "CREATE_NEW_REPORT" | "OVERWRITE_REPORT"
object ReportVersioning {
  inline val CREATE_NEW_REPORT: "CREATE_NEW_REPORT" = "CREATE_NEW_REPORT"
  inline val OVERWRITE_REPORT: "OVERWRITE_REPORT" = "OVERWRITE_REPORT"

  inline def values: js.Array[ReportVersioning] = js.Array(CREATE_NEW_REPORT, OVERWRITE_REPORT)
}

/** Whether or not AWS includes resource IDs in the report.
  */
type SchemaElement = "RESOURCES"
object SchemaElement {
  inline val RESOURCES: "RESOURCES" = "RESOURCES"

  inline def values: js.Array[SchemaElement] = js.Array(RESOURCES)
}

/** The length of time covered by the report.
  */
type TimeUnit = "HOURLY" | "DAILY" | "MONTHLY"
object TimeUnit {
  inline val HOURLY: "HOURLY" = "HOURLY"
  inline val DAILY: "DAILY" = "DAILY"
  inline val MONTHLY: "MONTHLY" = "MONTHLY"

  inline def values: js.Array[TimeUnit] = js.Array(HOURLY, DAILY, MONTHLY)
}
