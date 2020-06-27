package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object cur {
  type AdditionalArtifactList = js.Array[AdditionalArtifact]
  type DeleteResponseMessage  = String
  type GenericString          = String
  type MaxResults             = Int
  type RefreshClosedReports   = Boolean
  type ReportDefinitionList   = js.Array[ReportDefinition]
  type ReportName             = String
  type S3Bucket               = String
  type S3Prefix               = String
  type SchemaElementList      = js.Array[SchemaElement]

  implicit final class CUROps(private val service: CUR) extends AnyVal {

    @inline def deleteReportDefinitionFuture(
        params: DeleteReportDefinitionRequest
    ): Future[DeleteReportDefinitionResponse] = service.deleteReportDefinition(params).promise().toFuture
    @inline def describeReportDefinitionsFuture(
        params: DescribeReportDefinitionsRequest
    ): Future[DescribeReportDefinitionsResponse] = service.describeReportDefinitions(params).promise().toFuture
    @inline def modifyReportDefinitionFuture(
        params: ModifyReportDefinitionRequest
    ): Future[ModifyReportDefinitionResponse] = service.modifyReportDefinition(params).promise().toFuture
    @inline def putReportDefinitionFuture(params: PutReportDefinitionRequest): Future[PutReportDefinitionResponse] =
      service.putReportDefinition(params).promise().toFuture
  }
}

package cur {
  @js.native
  @JSImport("aws-sdk", "CUR")
  class CUR() extends js.Object {
    def this(config: AWSConfig) = this()

    def deleteReportDefinition(params: DeleteReportDefinitionRequest): Request[DeleteReportDefinitionResponse] =
      js.native
    def describeReportDefinitions(
        params: DescribeReportDefinitionsRequest
    ): Request[DescribeReportDefinitionsResponse] = js.native
    def modifyReportDefinition(params: ModifyReportDefinitionRequest): Request[ModifyReportDefinitionResponse] =
      js.native
    def putReportDefinition(params: PutReportDefinitionRequest): Request[PutReportDefinitionResponse] = js.native
  }

  /**
    * The region of the S3 bucket that AWS delivers the report into.
    */
  @js.native
  sealed trait AWSRegion extends js.Any
  object AWSRegion extends js.Object {
    val `us-east-1`      = "us-east-1".asInstanceOf[AWSRegion]
    val `us-west-1`      = "us-west-1".asInstanceOf[AWSRegion]
    val `us-west-2`      = "us-west-2".asInstanceOf[AWSRegion]
    val `eu-central-1`   = "eu-central-1".asInstanceOf[AWSRegion]
    val `eu-west-1`      = "eu-west-1".asInstanceOf[AWSRegion]
    val `ap-southeast-1` = "ap-southeast-1".asInstanceOf[AWSRegion]
    val `ap-southeast-2` = "ap-southeast-2".asInstanceOf[AWSRegion]
    val `ap-northeast-1` = "ap-northeast-1".asInstanceOf[AWSRegion]
    val `eu-north-1`     = "eu-north-1".asInstanceOf[AWSRegion]
    val `ap-northeast-3` = "ap-northeast-3".asInstanceOf[AWSRegion]
    val `ap-east-1`      = "ap-east-1".asInstanceOf[AWSRegion]

    val values = js.Object.freeze(
      js.Array(
        `us-east-1`,
        `us-west-1`,
        `us-west-2`,
        `eu-central-1`,
        `eu-west-1`,
        `ap-southeast-1`,
        `ap-southeast-2`,
        `ap-northeast-1`,
        `eu-north-1`,
        `ap-northeast-3`,
        `ap-east-1`
      )
    )
  }

  /**
    * The types of manifest that you want AWS to create for this report.
    */
  @js.native
  sealed trait AdditionalArtifact extends js.Any
  object AdditionalArtifact extends js.Object {
    val REDSHIFT   = "REDSHIFT".asInstanceOf[AdditionalArtifact]
    val QUICKSIGHT = "QUICKSIGHT".asInstanceOf[AdditionalArtifact]
    val ATHENA     = "ATHENA".asInstanceOf[AdditionalArtifact]

    val values = js.Object.freeze(js.Array(REDSHIFT, QUICKSIGHT, ATHENA))
  }

  /**
    * The compression format that AWS uses for the report.
    */
  @js.native
  sealed trait CompressionFormat extends js.Any
  object CompressionFormat extends js.Object {
    val ZIP     = "ZIP".asInstanceOf[CompressionFormat]
    val GZIP    = "GZIP".asInstanceOf[CompressionFormat]
    val Parquet = "Parquet".asInstanceOf[CompressionFormat]

    val values = js.Object.freeze(js.Array(ZIP, GZIP, Parquet))
  }

  /**
    * Deletes the specified report.
    */
  @js.native
  @Factory
  trait DeleteReportDefinitionRequest extends js.Object {
    var ReportName: js.UndefOr[ReportName]
  }

  /**
    * If the action is successful, the service sends back an HTTP 200 response.
    */
  @js.native
  @Factory
  trait DeleteReportDefinitionResponse extends js.Object {
    var ResponseMessage: js.UndefOr[DeleteResponseMessage]
  }

  /**
    * Requests a list of AWS Cost and Usage reports owned by the account.
    */
  @js.native
  @Factory
  trait DescribeReportDefinitionsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[GenericString]
  }

  /**
    * If the action is successful, the service sends back an HTTP 200 response.
    */
  @js.native
  @Factory
  trait DescribeReportDefinitionsResponse extends js.Object {
    var NextToken: js.UndefOr[GenericString]
    var ReportDefinitions: js.UndefOr[ReportDefinitionList]
  }

  @js.native
  @Factory
  trait ModifyReportDefinitionRequest extends js.Object {
    var ReportDefinition: ReportDefinition
    var ReportName: ReportName
  }

  @js.native
  @Factory
  trait ModifyReportDefinitionResponse extends js.Object {}

  /**
    * Creates a Cost and Usage Report.
    */
  @js.native
  @Factory
  trait PutReportDefinitionRequest extends js.Object {
    var ReportDefinition: ReportDefinition
  }

  /**
    * If the action is successful, the service sends back an HTTP 200 response with an empty HTTP body.
    */
  @js.native
  @Factory
  trait PutReportDefinitionResponse extends js.Object {}

  /**
    * The definition of AWS Cost and Usage Report. You can specify the report name, time unit, report format, compression format, S3 bucket, additional artifacts, and schema elements in the definition.
    */
  @js.native
  @Factory
  trait ReportDefinition extends js.Object {
    var AdditionalSchemaElements: SchemaElementList
    var Compression: CompressionFormat
    var Format: ReportFormat
    var ReportName: ReportName
    var S3Bucket: S3Bucket
    var S3Prefix: S3Prefix
    var S3Region: AWSRegion
    var TimeUnit: TimeUnit
    var AdditionalArtifacts: js.UndefOr[AdditionalArtifactList]
    var RefreshClosedReports: js.UndefOr[RefreshClosedReports]
    var ReportVersioning: js.UndefOr[ReportVersioning]
  }

  /**
    * The format that AWS saves the report in.
    */
  @js.native
  sealed trait ReportFormat extends js.Any
  object ReportFormat extends js.Object {
    val textORcsv = "textORcsv".asInstanceOf[ReportFormat]
    val Parquet   = "Parquet".asInstanceOf[ReportFormat]

    val values = js.Object.freeze(js.Array(textORcsv, Parquet))
  }

  @js.native
  sealed trait ReportVersioning extends js.Any
  object ReportVersioning extends js.Object {
    val CREATE_NEW_REPORT = "CREATE_NEW_REPORT".asInstanceOf[ReportVersioning]
    val OVERWRITE_REPORT  = "OVERWRITE_REPORT".asInstanceOf[ReportVersioning]

    val values = js.Object.freeze(js.Array(CREATE_NEW_REPORT, OVERWRITE_REPORT))
  }

  /**
    * Whether or not AWS includes resource IDs in the report.
    */
  @js.native
  sealed trait SchemaElement extends js.Any
  object SchemaElement extends js.Object {
    val RESOURCES = "RESOURCES".asInstanceOf[SchemaElement]

    val values = js.Object.freeze(js.Array(RESOURCES))
  }

  /**
    * The length of time covered by the report.
    */
  @js.native
  sealed trait TimeUnit extends js.Any
  object TimeUnit extends js.Object {
    val HOURLY = "HOURLY".asInstanceOf[TimeUnit]
    val DAILY  = "DAILY".asInstanceOf[TimeUnit]

    val values = js.Object.freeze(js.Array(HOURLY, DAILY))
  }
}
