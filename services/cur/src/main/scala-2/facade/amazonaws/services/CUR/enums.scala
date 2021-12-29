package facade.amazonaws.services.cur

import scalajs._
import scala.scalajs.js.|

/** The region of the S3 bucket that AWS delivers the report into.
  */
@js.native
sealed trait AWSRegion extends js.Any
object AWSRegion {
  val `af-south-1` = "af-south-1".asInstanceOf[AWSRegion]
  val `ap-east-1` = "ap-east-1".asInstanceOf[AWSRegion]
  val `ap-south-1` = "ap-south-1".asInstanceOf[AWSRegion]
  val `ap-southeast-1` = "ap-southeast-1".asInstanceOf[AWSRegion]
  val `ap-southeast-2` = "ap-southeast-2".asInstanceOf[AWSRegion]
  val `ap-northeast-1` = "ap-northeast-1".asInstanceOf[AWSRegion]
  val `ap-northeast-2` = "ap-northeast-2".asInstanceOf[AWSRegion]
  val `ap-northeast-3` = "ap-northeast-3".asInstanceOf[AWSRegion]
  val `ca-central-1` = "ca-central-1".asInstanceOf[AWSRegion]
  val `eu-central-1` = "eu-central-1".asInstanceOf[AWSRegion]
  val `eu-west-1` = "eu-west-1".asInstanceOf[AWSRegion]
  val `eu-west-2` = "eu-west-2".asInstanceOf[AWSRegion]
  val `eu-west-3` = "eu-west-3".asInstanceOf[AWSRegion]
  val `eu-north-1` = "eu-north-1".asInstanceOf[AWSRegion]
  val `eu-south-1` = "eu-south-1".asInstanceOf[AWSRegion]
  val `me-south-1` = "me-south-1".asInstanceOf[AWSRegion]
  val `sa-east-1` = "sa-east-1".asInstanceOf[AWSRegion]
  val `us-east-1` = "us-east-1".asInstanceOf[AWSRegion]
  val `us-east-2` = "us-east-2".asInstanceOf[AWSRegion]
  val `us-west-1` = "us-west-1".asInstanceOf[AWSRegion]
  val `us-west-2` = "us-west-2".asInstanceOf[AWSRegion]
  val `cn-north-1` = "cn-north-1".asInstanceOf[AWSRegion]
  val `cn-northwest-1` = "cn-northwest-1".asInstanceOf[AWSRegion]

  @inline def values = js.Array(`af-south-1`, `ap-east-1`, `ap-south-1`, `ap-southeast-1`, `ap-southeast-2`, `ap-northeast-1`, `ap-northeast-2`, `ap-northeast-3`, `ca-central-1`, `eu-central-1`, `eu-west-1`, `eu-west-2`, `eu-west-3`, `eu-north-1`, `eu-south-1`, `me-south-1`, `sa-east-1`, `us-east-1`, `us-east-2`, `us-west-1`, `us-west-2`, `cn-north-1`, `cn-northwest-1`)
}

/** The types of manifest that you want AWS to create for this report.
  */
@js.native
sealed trait AdditionalArtifact extends js.Any
object AdditionalArtifact {
  val REDSHIFT = "REDSHIFT".asInstanceOf[AdditionalArtifact]
  val QUICKSIGHT = "QUICKSIGHT".asInstanceOf[AdditionalArtifact]
  val ATHENA = "ATHENA".asInstanceOf[AdditionalArtifact]

  @inline def values = js.Array(REDSHIFT, QUICKSIGHT, ATHENA)
}

/** The compression format that AWS uses for the report.
  */
@js.native
sealed trait CompressionFormat extends js.Any
object CompressionFormat {
  val ZIP = "ZIP".asInstanceOf[CompressionFormat]
  val GZIP = "GZIP".asInstanceOf[CompressionFormat]
  val Parquet = "Parquet".asInstanceOf[CompressionFormat]

  @inline def values = js.Array(ZIP, GZIP, Parquet)
}

/** The format that AWS saves the report in.
  */
@js.native
sealed trait ReportFormat extends js.Any
object ReportFormat {
  val textORcsv = "textORcsv".asInstanceOf[ReportFormat]
  val Parquet = "Parquet".asInstanceOf[ReportFormat]

  @inline def values = js.Array(textORcsv, Parquet)
}

@js.native
sealed trait ReportVersioning extends js.Any
object ReportVersioning {
  val CREATE_NEW_REPORT = "CREATE_NEW_REPORT".asInstanceOf[ReportVersioning]
  val OVERWRITE_REPORT = "OVERWRITE_REPORT".asInstanceOf[ReportVersioning]

  @inline def values = js.Array(CREATE_NEW_REPORT, OVERWRITE_REPORT)
}

/** Whether or not AWS includes resource IDs in the report.
  */
@js.native
sealed trait SchemaElement extends js.Any
object SchemaElement {
  val RESOURCES = "RESOURCES".asInstanceOf[SchemaElement]

  @inline def values = js.Array(RESOURCES)
}

/** The length of time covered by the report.
  */
@js.native
sealed trait TimeUnit extends js.Any
object TimeUnit {
  val HOURLY = "HOURLY".asInstanceOf[TimeUnit]
  val DAILY = "DAILY".asInstanceOf[TimeUnit]
  val MONTHLY = "MONTHLY".asInstanceOf[TimeUnit]

  @inline def values = js.Array(HOURLY, DAILY, MONTHLY)
}

