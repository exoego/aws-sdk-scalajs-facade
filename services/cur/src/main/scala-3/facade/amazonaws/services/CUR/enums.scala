package facade.amazonaws.services.cur

import scalajs._

/** The region of the S3 bucket that AWS delivers the report into.
  */
type AWSRegion = "af-south-1" | "ap-east-1" | "ap-south-1" | "ap-southeast-1" | "ap-southeast-2" | "ap-northeast-1" | "ap-northeast-2" | "ap-northeast-3" | "ca-central-1" | "eu-central-1" | "eu-west-1" | "eu-west-2" | "eu-west-3" | "eu-north-1" | "eu-south-1" | "me-south-1" | "sa-east-1" | "us-east-1" | "us-east-2" | "us-west-1" | "us-west-2" | "cn-north-1" | "cn-northwest-1"
object AWSRegion {
  val `af-south-1`: "af-south-1" = "af-south-1"
  val `ap-east-1`: "ap-east-1" = "ap-east-1"
  val `ap-south-1`: "ap-south-1" = "ap-south-1"
  val `ap-southeast-1`: "ap-southeast-1" = "ap-southeast-1"
  val `ap-southeast-2`: "ap-southeast-2" = "ap-southeast-2"
  val `ap-northeast-1`: "ap-northeast-1" = "ap-northeast-1"
  val `ap-northeast-2`: "ap-northeast-2" = "ap-northeast-2"
  val `ap-northeast-3`: "ap-northeast-3" = "ap-northeast-3"
  val `ca-central-1`: "ca-central-1" = "ca-central-1"
  val `eu-central-1`: "eu-central-1" = "eu-central-1"
  val `eu-west-1`: "eu-west-1" = "eu-west-1"
  val `eu-west-2`: "eu-west-2" = "eu-west-2"
  val `eu-west-3`: "eu-west-3" = "eu-west-3"
  val `eu-north-1`: "eu-north-1" = "eu-north-1"
  val `eu-south-1`: "eu-south-1" = "eu-south-1"
  val `me-south-1`: "me-south-1" = "me-south-1"
  val `sa-east-1`: "sa-east-1" = "sa-east-1"
  val `us-east-1`: "us-east-1" = "us-east-1"
  val `us-east-2`: "us-east-2" = "us-east-2"
  val `us-west-1`: "us-west-1" = "us-west-1"
  val `us-west-2`: "us-west-2" = "us-west-2"
  val `cn-north-1`: "cn-north-1" = "cn-north-1"
  val `cn-northwest-1`: "cn-northwest-1" = "cn-northwest-1"

  @inline def values = js.Array[AWSRegion](
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
  val REDSHIFT: "REDSHIFT" = "REDSHIFT"
  val QUICKSIGHT: "QUICKSIGHT" = "QUICKSIGHT"
  val ATHENA: "ATHENA" = "ATHENA"

  @inline def values = js.Array[AdditionalArtifact](REDSHIFT, QUICKSIGHT, ATHENA)
}

/** The compression format that AWS uses for the report.
  */
type CompressionFormat = "ZIP" | "GZIP" | "Parquet"
object CompressionFormat {
  val ZIP: "ZIP" = "ZIP"
  val GZIP: "GZIP" = "GZIP"
  val Parquet: "Parquet" = "Parquet"

  @inline def values = js.Array[CompressionFormat](ZIP, GZIP, Parquet)
}

/** The format that AWS saves the report in.
  */
type ReportFormat = "textORcsv" | "Parquet"
object ReportFormat {
  val textORcsv: "textORcsv" = "textORcsv"
  val Parquet: "Parquet" = "Parquet"

  @inline def values = js.Array[ReportFormat](textORcsv, Parquet)
}

type ReportVersioning = "CREATE_NEW_REPORT" | "OVERWRITE_REPORT"
object ReportVersioning {
  val CREATE_NEW_REPORT: "CREATE_NEW_REPORT" = "CREATE_NEW_REPORT"
  val OVERWRITE_REPORT: "OVERWRITE_REPORT" = "OVERWRITE_REPORT"

  @inline def values = js.Array[ReportVersioning](CREATE_NEW_REPORT, OVERWRITE_REPORT)
}

/** Whether or not AWS includes resource IDs in the report.
  */
type SchemaElement = "RESOURCES"
object SchemaElement {
  val RESOURCES: "RESOURCES" = "RESOURCES"

  @inline def values = js.Array[SchemaElement](RESOURCES)
}

/** The length of time covered by the report.
  */
type TimeUnit = "HOURLY" | "DAILY" | "MONTHLY"
object TimeUnit {
  val HOURLY: "HOURLY" = "HOURLY"
  val DAILY: "DAILY" = "DAILY"
  val MONTHLY: "MONTHLY" = "MONTHLY"

  @inline def values = js.Array[TimeUnit](HOURLY, DAILY, MONTHLY)
}
