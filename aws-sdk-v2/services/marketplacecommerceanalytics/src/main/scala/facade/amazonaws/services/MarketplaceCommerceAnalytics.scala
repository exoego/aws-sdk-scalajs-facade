package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object marketplacecommerceanalytics {
  type CustomerDefinedValues = js.Dictionary[OptionalValue]
  type DataSetPublicationDate = js.Date
  type DataSetRequestId = String
  type DestinationS3BucketName = String
  type DestinationS3Prefix = String
  type FromDate = js.Date
  type OptionalKey = String
  type OptionalValue = String
  type RoleNameArn = String
  type SnsTopicArn = String

  final class MarketplaceCommerceAnalyticsOps(private val service: MarketplaceCommerceAnalytics) extends AnyVal {

    @inline def generateDataSetFuture(params: GenerateDataSetRequest): Future[GenerateDataSetResult] = service.generateDataSet(params).promise().toFuture
    @inline def startSupportDataExportFuture(params: StartSupportDataExportRequest): Future[StartSupportDataExportResult] = service.startSupportDataExport(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/marketplacecommerceanalytics", JSImport.Namespace, "AWS.MarketplaceCommerceAnalytics")
  class MarketplaceCommerceAnalytics() extends js.Object {
    def this(config: AWSConfig) = this()

    def generateDataSet(params: GenerateDataSetRequest): Request[GenerateDataSetResult] = js.native
    def startSupportDataExport(params: StartSupportDataExportRequest): Request[StartSupportDataExportResult] = js.native
  }
  object MarketplaceCommerceAnalytics {
    @inline implicit def toOps(service: MarketplaceCommerceAnalytics): MarketplaceCommerceAnalyticsOps = {
      new MarketplaceCommerceAnalyticsOps(service)
    }
  }

  /** Container for the parameters to the GenerateDataSet operation.
    */
  @js.native
  trait GenerateDataSetRequest extends js.Object {
    var dataSetPublicationDate: DataSetPublicationDate
    var dataSetType: DataSetType
    var destinationS3BucketName: DestinationS3BucketName
    var roleNameArn: RoleNameArn
    var snsTopicArn: SnsTopicArn
    var customerDefinedValues: js.UndefOr[CustomerDefinedValues]
    var destinationS3Prefix: js.UndefOr[DestinationS3Prefix]
  }

  object GenerateDataSetRequest {
    @inline
    def apply(
        dataSetPublicationDate: DataSetPublicationDate,
        dataSetType: DataSetType,
        destinationS3BucketName: DestinationS3BucketName,
        roleNameArn: RoleNameArn,
        snsTopicArn: SnsTopicArn,
        customerDefinedValues: js.UndefOr[CustomerDefinedValues] = js.undefined,
        destinationS3Prefix: js.UndefOr[DestinationS3Prefix] = js.undefined
    ): GenerateDataSetRequest = {
      val __obj = js.Dynamic.literal(
        "dataSetPublicationDate" -> dataSetPublicationDate.asInstanceOf[js.Any],
        "dataSetType" -> dataSetType.asInstanceOf[js.Any],
        "destinationS3BucketName" -> destinationS3BucketName.asInstanceOf[js.Any],
        "roleNameArn" -> roleNameArn.asInstanceOf[js.Any],
        "snsTopicArn" -> snsTopicArn.asInstanceOf[js.Any]
      )

      customerDefinedValues.foreach(__v => __obj.updateDynamic("customerDefinedValues")(__v.asInstanceOf[js.Any]))
      destinationS3Prefix.foreach(__v => __obj.updateDynamic("destinationS3Prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GenerateDataSetRequest]
    }
  }

  /** Container for the result of the GenerateDataSet operation.
    */
  @js.native
  trait GenerateDataSetResult extends js.Object {
    var dataSetRequestId: js.UndefOr[DataSetRequestId]
  }

  object GenerateDataSetResult {
    @inline
    def apply(
        dataSetRequestId: js.UndefOr[DataSetRequestId] = js.undefined
    ): GenerateDataSetResult = {
      val __obj = js.Dynamic.literal()
      dataSetRequestId.foreach(__v => __obj.updateDynamic("dataSetRequestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GenerateDataSetResult]
    }
  }

  /** Container for the parameters to the StartSupportDataExport operation.
    */
  @js.native
  trait StartSupportDataExportRequest extends js.Object {
    var dataSetType: SupportDataSetType
    var destinationS3BucketName: DestinationS3BucketName
    var fromDate: FromDate
    var roleNameArn: RoleNameArn
    var snsTopicArn: SnsTopicArn
    var customerDefinedValues: js.UndefOr[CustomerDefinedValues]
    var destinationS3Prefix: js.UndefOr[DestinationS3Prefix]
  }

  object StartSupportDataExportRequest {
    @inline
    def apply(
        dataSetType: SupportDataSetType,
        destinationS3BucketName: DestinationS3BucketName,
        fromDate: FromDate,
        roleNameArn: RoleNameArn,
        snsTopicArn: SnsTopicArn,
        customerDefinedValues: js.UndefOr[CustomerDefinedValues] = js.undefined,
        destinationS3Prefix: js.UndefOr[DestinationS3Prefix] = js.undefined
    ): StartSupportDataExportRequest = {
      val __obj = js.Dynamic.literal(
        "dataSetType" -> dataSetType.asInstanceOf[js.Any],
        "destinationS3BucketName" -> destinationS3BucketName.asInstanceOf[js.Any],
        "fromDate" -> fromDate.asInstanceOf[js.Any],
        "roleNameArn" -> roleNameArn.asInstanceOf[js.Any],
        "snsTopicArn" -> snsTopicArn.asInstanceOf[js.Any]
      )

      customerDefinedValues.foreach(__v => __obj.updateDynamic("customerDefinedValues")(__v.asInstanceOf[js.Any]))
      destinationS3Prefix.foreach(__v => __obj.updateDynamic("destinationS3Prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSupportDataExportRequest]
    }
  }

  /** Container for the result of the StartSupportDataExport operation.
    */
  @js.native
  trait StartSupportDataExportResult extends js.Object {
    var dataSetRequestId: js.UndefOr[DataSetRequestId]
  }

  object StartSupportDataExportResult {
    @inline
    def apply(
        dataSetRequestId: js.UndefOr[DataSetRequestId] = js.undefined
    ): StartSupportDataExportResult = {
      val __obj = js.Dynamic.literal()
      dataSetRequestId.foreach(__v => __obj.updateDynamic("dataSetRequestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSupportDataExportResult]
    }
  }
}