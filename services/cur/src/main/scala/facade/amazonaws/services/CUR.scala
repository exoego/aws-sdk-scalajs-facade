package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object cur {
  type AdditionalArtifactList = js.Array[AdditionalArtifact]
  type DeleteResponseMessage = String
  type GenericString = String
  type MaxResults = Int
  type RefreshClosedReports = Boolean
  type ReportDefinitionList = js.Array[ReportDefinition]
  type ReportName = String
  type S3Bucket = String
  type S3Prefix = String
  type SchemaElementList = js.Array[SchemaElement]

  implicit final class CUROps(private val service: CUR) extends AnyVal {

    @inline def deleteReportDefinitionFuture(params: DeleteReportDefinitionRequest): Future[DeleteReportDefinitionResponse] = service.deleteReportDefinition(params).promise().toFuture
    @inline def describeReportDefinitionsFuture(params: DescribeReportDefinitionsRequest): Future[DescribeReportDefinitionsResponse] = service.describeReportDefinitions(params).promise().toFuture
    @inline def modifyReportDefinitionFuture(params: ModifyReportDefinitionRequest): Future[ModifyReportDefinitionResponse] = service.modifyReportDefinition(params).promise().toFuture
    @inline def putReportDefinitionFuture(params: PutReportDefinitionRequest): Future[PutReportDefinitionResponse] = service.putReportDefinition(params).promise().toFuture
  }
}

package cur {
  @js.native
  @JSImport("aws-sdk", "CUR", "AWS.CUR")
  class CUR() extends js.Object {
    def this(config: AWSConfig) = this()

    def deleteReportDefinition(params: DeleteReportDefinitionRequest): Request[DeleteReportDefinitionResponse] = js.native
    def describeReportDefinitions(params: DescribeReportDefinitionsRequest): Request[DescribeReportDefinitionsResponse] = js.native
    def modifyReportDefinition(params: ModifyReportDefinitionRequest): Request[ModifyReportDefinitionResponse] = js.native
    def putReportDefinition(params: PutReportDefinitionRequest): Request[PutReportDefinitionResponse] = js.native
  }

  /**
    * The region of the S3 bucket that AWS delivers the report into.
    */
  @js.native
  sealed trait AWSRegion extends js.Any
  object AWSRegion {
    @inline def `us-east-1` = "us-east-1".asInstanceOf[AWSRegion]
    @inline def `us-west-1` = "us-west-1".asInstanceOf[AWSRegion]
    @inline def `us-west-2` = "us-west-2".asInstanceOf[AWSRegion]
    @inline def `eu-central-1` = "eu-central-1".asInstanceOf[AWSRegion]
    @inline def `eu-west-1` = "eu-west-1".asInstanceOf[AWSRegion]
    @inline def `ap-southeast-1` = "ap-southeast-1".asInstanceOf[AWSRegion]
    @inline def `ap-southeast-2` = "ap-southeast-2".asInstanceOf[AWSRegion]
    @inline def `ap-northeast-1` = "ap-northeast-1".asInstanceOf[AWSRegion]
    @inline def `eu-north-1` = "eu-north-1".asInstanceOf[AWSRegion]
    @inline def `ap-northeast-3` = "ap-northeast-3".asInstanceOf[AWSRegion]
    @inline def `ap-east-1` = "ap-east-1".asInstanceOf[AWSRegion]

    @inline def values =
      js.Object.freeze(js.Array(
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
      ))
  }

  /**
    * The types of manifest that you want AWS to create for this report.
    */
  @js.native
  sealed trait AdditionalArtifact extends js.Any
  object AdditionalArtifact {
    @inline def REDSHIFT = "REDSHIFT".asInstanceOf[AdditionalArtifact]
    @inline def QUICKSIGHT = "QUICKSIGHT".asInstanceOf[AdditionalArtifact]
    @inline def ATHENA = "ATHENA".asInstanceOf[AdditionalArtifact]

    @inline def values = js.Object.freeze(js.Array(REDSHIFT, QUICKSIGHT, ATHENA))
  }

  /**
    * The compression format that AWS uses for the report.
    */
  @js.native
  sealed trait CompressionFormat extends js.Any
  object CompressionFormat {
    @inline def ZIP = "ZIP".asInstanceOf[CompressionFormat]
    @inline def GZIP = "GZIP".asInstanceOf[CompressionFormat]
    @inline def Parquet = "Parquet".asInstanceOf[CompressionFormat]

    @inline def values = js.Object.freeze(js.Array(ZIP, GZIP, Parquet))
  }

  /**
    * Deletes the specified report.
    */
  @js.native
  trait DeleteReportDefinitionRequest extends js.Object {
    var ReportName: js.UndefOr[ReportName]
  }

  object DeleteReportDefinitionRequest {
    @inline
    def apply(
        ReportName: js.UndefOr[ReportName] = js.undefined
    ): DeleteReportDefinitionRequest = {
      val __obj = js.Dynamic.literal()
      ReportName.foreach(__v => __obj.updateDynamic("ReportName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteReportDefinitionRequest]
    }
  }

  /**
    * If the action is successful, the service sends back an HTTP 200 response.
    */
  @js.native
  trait DeleteReportDefinitionResponse extends js.Object {
    var ResponseMessage: js.UndefOr[DeleteResponseMessage]
  }

  object DeleteReportDefinitionResponse {
    @inline
    def apply(
        ResponseMessage: js.UndefOr[DeleteResponseMessage] = js.undefined
    ): DeleteReportDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      ResponseMessage.foreach(__v => __obj.updateDynamic("ResponseMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteReportDefinitionResponse]
    }
  }

  /**
    * Requests a list of AWS Cost and Usage reports owned by the account.
    */
  @js.native
  trait DescribeReportDefinitionsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[GenericString]
  }

  object DescribeReportDefinitionsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): DescribeReportDefinitionsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReportDefinitionsRequest]
    }
  }

  /**
    * If the action is successful, the service sends back an HTTP 200 response.
    */
  @js.native
  trait DescribeReportDefinitionsResponse extends js.Object {
    var NextToken: js.UndefOr[GenericString]
    var ReportDefinitions: js.UndefOr[ReportDefinitionList]
  }

  object DescribeReportDefinitionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[GenericString] = js.undefined,
        ReportDefinitions: js.UndefOr[ReportDefinitionList] = js.undefined
    ): DescribeReportDefinitionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ReportDefinitions.foreach(__v => __obj.updateDynamic("ReportDefinitions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeReportDefinitionsResponse]
    }
  }

  @js.native
  trait ModifyReportDefinitionRequest extends js.Object {
    var ReportDefinition: ReportDefinition
    var ReportName: ReportName
  }

  object ModifyReportDefinitionRequest {
    @inline
    def apply(
        ReportDefinition: ReportDefinition,
        ReportName: ReportName
    ): ModifyReportDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "ReportDefinition" -> ReportDefinition.asInstanceOf[js.Any],
        "ReportName" -> ReportName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ModifyReportDefinitionRequest]
    }
  }

  @js.native
  trait ModifyReportDefinitionResponse extends js.Object {}

  object ModifyReportDefinitionResponse {
    @inline
    def apply(
    ): ModifyReportDefinitionResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[ModifyReportDefinitionResponse]
    }
  }

  /**
    * Creates a Cost and Usage Report.
    */
  @js.native
  trait PutReportDefinitionRequest extends js.Object {
    var ReportDefinition: ReportDefinition
  }

  object PutReportDefinitionRequest {
    @inline
    def apply(
        ReportDefinition: ReportDefinition
    ): PutReportDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "ReportDefinition" -> ReportDefinition.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutReportDefinitionRequest]
    }
  }

  /**
    * If the action is successful, the service sends back an HTTP 200 response with an empty HTTP body.
    */
  @js.native
  trait PutReportDefinitionResponse extends js.Object {}

  object PutReportDefinitionResponse {
    @inline
    def apply(
    ): PutReportDefinitionResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[PutReportDefinitionResponse]
    }
  }

  /**
    * The definition of AWS Cost and Usage Report. You can specify the report name, time unit, report format, compression format, S3 bucket, additional artifacts, and schema elements in the definition.
    */
  @js.native
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

  object ReportDefinition {
    @inline
    def apply(
        AdditionalSchemaElements: SchemaElementList,
        Compression: CompressionFormat,
        Format: ReportFormat,
        ReportName: ReportName,
        S3Bucket: S3Bucket,
        S3Prefix: S3Prefix,
        S3Region: AWSRegion,
        TimeUnit: TimeUnit,
        AdditionalArtifacts: js.UndefOr[AdditionalArtifactList] = js.undefined,
        RefreshClosedReports: js.UndefOr[RefreshClosedReports] = js.undefined,
        ReportVersioning: js.UndefOr[ReportVersioning] = js.undefined
    ): ReportDefinition = {
      val __obj = js.Dynamic.literal(
        "AdditionalSchemaElements" -> AdditionalSchemaElements.asInstanceOf[js.Any],
        "Compression" -> Compression.asInstanceOf[js.Any],
        "Format" -> Format.asInstanceOf[js.Any],
        "ReportName" -> ReportName.asInstanceOf[js.Any],
        "S3Bucket" -> S3Bucket.asInstanceOf[js.Any],
        "S3Prefix" -> S3Prefix.asInstanceOf[js.Any],
        "S3Region" -> S3Region.asInstanceOf[js.Any],
        "TimeUnit" -> TimeUnit.asInstanceOf[js.Any]
      )

      AdditionalArtifacts.foreach(__v => __obj.updateDynamic("AdditionalArtifacts")(__v.asInstanceOf[js.Any]))
      RefreshClosedReports.foreach(__v => __obj.updateDynamic("RefreshClosedReports")(__v.asInstanceOf[js.Any]))
      ReportVersioning.foreach(__v => __obj.updateDynamic("ReportVersioning")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReportDefinition]
    }
  }

  /**
    * The format that AWS saves the report in.
    */
  @js.native
  sealed trait ReportFormat extends js.Any
  object ReportFormat {
    @inline def textORcsv = "textORcsv".asInstanceOf[ReportFormat]
    @inline def Parquet = "Parquet".asInstanceOf[ReportFormat]

    @inline def values = js.Object.freeze(js.Array(textORcsv, Parquet))
  }

  @js.native
  sealed trait ReportVersioning extends js.Any
  object ReportVersioning {
    @inline def CREATE_NEW_REPORT = "CREATE_NEW_REPORT".asInstanceOf[ReportVersioning]
    @inline def OVERWRITE_REPORT = "OVERWRITE_REPORT".asInstanceOf[ReportVersioning]

    @inline def values = js.Object.freeze(js.Array(CREATE_NEW_REPORT, OVERWRITE_REPORT))
  }

  /**
    * Whether or not AWS includes resource IDs in the report.
    */
  @js.native
  sealed trait SchemaElement extends js.Any
  object SchemaElement {
    @inline def RESOURCES = "RESOURCES".asInstanceOf[SchemaElement]

    @inline def values = js.Object.freeze(js.Array(RESOURCES))
  }

  /**
    * The length of time covered by the report.
    */
  @js.native
  sealed trait TimeUnit extends js.Any
  object TimeUnit {
    @inline def HOURLY = "HOURLY".asInstanceOf[TimeUnit]
    @inline def DAILY = "DAILY".asInstanceOf[TimeUnit]

    @inline def values = js.Object.freeze(js.Array(HOURLY, DAILY))
  }
}
