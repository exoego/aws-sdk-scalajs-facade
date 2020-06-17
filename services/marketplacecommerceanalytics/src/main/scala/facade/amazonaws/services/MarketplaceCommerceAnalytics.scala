package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object marketplacecommerceanalytics {
  type CustomerDefinedValues   = js.Dictionary[OptionalValue]
  type DataSetPublicationDate  = js.Date
  type DataSetRequestId        = String
  type DestinationS3BucketName = String
  type DestinationS3Prefix     = String
  type FromDate                = js.Date
  type OptionalKey             = String
  type OptionalValue           = String
  type RoleNameArn             = String
  type SnsTopicArn             = String

  implicit final class MarketplaceCommerceAnalyticsOps(private val service: MarketplaceCommerceAnalytics)
      extends AnyVal {

    @inline def generateDataSetFuture(params: GenerateDataSetRequest): Future[GenerateDataSetResult] =
      service.generateDataSet(params).promise.toFuture
    @inline def startSupportDataExportFuture(
        params: StartSupportDataExportRequest
    ): Future[StartSupportDataExportResult] = service.startSupportDataExport(params).promise.toFuture
  }
}

package marketplacecommerceanalytics {
  @js.native
  @JSImport("aws-sdk", "MarketplaceCommerceAnalytics")
  class MarketplaceCommerceAnalytics() extends js.Object {
    def this(config: AWSConfig) = this()

    def generateDataSet(params: GenerateDataSetRequest): Request[GenerateDataSetResult]                      = js.native
    def startSupportDataExport(params: StartSupportDataExportRequest): Request[StartSupportDataExportResult] = js.native
  }

  @js.native
  sealed trait DataSetType extends js.Any
  object DataSetType extends js.Object {
    val customer_subscriber_hourly_monthly_subscriptions =
      "customer_subscriber_hourly_monthly_subscriptions".asInstanceOf[DataSetType]
    val customer_subscriber_annual_subscriptions = "customer_subscriber_annual_subscriptions".asInstanceOf[DataSetType]
    val daily_business_usage_by_instance_type    = "daily_business_usage_by_instance_type".asInstanceOf[DataSetType]
    val daily_business_fees                      = "daily_business_fees".asInstanceOf[DataSetType]
    val daily_business_free_trial_conversions    = "daily_business_free_trial_conversions".asInstanceOf[DataSetType]
    val daily_business_new_instances             = "daily_business_new_instances".asInstanceOf[DataSetType]
    val daily_business_new_product_subscribers   = "daily_business_new_product_subscribers".asInstanceOf[DataSetType]
    val daily_business_canceled_product_subscribers =
      "daily_business_canceled_product_subscribers".asInstanceOf[DataSetType]
    val monthly_revenue_billing_and_revenue_data = "monthly_revenue_billing_and_revenue_data".asInstanceOf[DataSetType]
    val monthly_revenue_annual_subscriptions     = "monthly_revenue_annual_subscriptions".asInstanceOf[DataSetType]
    val monthly_revenue_field_demonstration_usage =
      "monthly_revenue_field_demonstration_usage".asInstanceOf[DataSetType]
    val monthly_revenue_flexible_payment_schedule =
      "monthly_revenue_flexible_payment_schedule".asInstanceOf[DataSetType]
    val disbursed_amount_by_product = "disbursed_amount_by_product".asInstanceOf[DataSetType]
    val disbursed_amount_by_product_with_uncollected_funds =
      "disbursed_amount_by_product_with_uncollected_funds".asInstanceOf[DataSetType]
    val disbursed_amount_by_instance_hours = "disbursed_amount_by_instance_hours".asInstanceOf[DataSetType]
    val disbursed_amount_by_customer_geo   = "disbursed_amount_by_customer_geo".asInstanceOf[DataSetType]
    val disbursed_amount_by_age_of_uncollected_funds =
      "disbursed_amount_by_age_of_uncollected_funds".asInstanceOf[DataSetType]
    val disbursed_amount_by_age_of_disbursed_funds =
      "disbursed_amount_by_age_of_disbursed_funds".asInstanceOf[DataSetType]
    val disbursed_amount_by_age_of_past_due_funds =
      "disbursed_amount_by_age_of_past_due_funds".asInstanceOf[DataSetType]
    val disbursed_amount_by_uncollected_funds_breakdown =
      "disbursed_amount_by_uncollected_funds_breakdown".asInstanceOf[DataSetType]
    val customer_profile_by_industry      = "customer_profile_by_industry".asInstanceOf[DataSetType]
    val customer_profile_by_revenue       = "customer_profile_by_revenue".asInstanceOf[DataSetType]
    val customer_profile_by_geography     = "customer_profile_by_geography".asInstanceOf[DataSetType]
    val sales_compensation_billed_revenue = "sales_compensation_billed_revenue".asInstanceOf[DataSetType]
    val us_sales_and_use_tax_records      = "us_sales_and_use_tax_records".asInstanceOf[DataSetType]

    val values = js.Object.freeze(
      js.Array(
        customer_subscriber_hourly_monthly_subscriptions,
        customer_subscriber_annual_subscriptions,
        daily_business_usage_by_instance_type,
        daily_business_fees,
        daily_business_free_trial_conversions,
        daily_business_new_instances,
        daily_business_new_product_subscribers,
        daily_business_canceled_product_subscribers,
        monthly_revenue_billing_and_revenue_data,
        monthly_revenue_annual_subscriptions,
        monthly_revenue_field_demonstration_usage,
        monthly_revenue_flexible_payment_schedule,
        disbursed_amount_by_product,
        disbursed_amount_by_product_with_uncollected_funds,
        disbursed_amount_by_instance_hours,
        disbursed_amount_by_customer_geo,
        disbursed_amount_by_age_of_uncollected_funds,
        disbursed_amount_by_age_of_disbursed_funds,
        disbursed_amount_by_age_of_past_due_funds,
        disbursed_amount_by_uncollected_funds_breakdown,
        customer_profile_by_industry,
        customer_profile_by_revenue,
        customer_profile_by_geography,
        sales_compensation_billed_revenue,
        us_sales_and_use_tax_records
      )
    )
  }

  /**
    * Container for the parameters to the GenerateDataSet operation.
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
        "dataSetPublicationDate"  -> dataSetPublicationDate.asInstanceOf[js.Any],
        "dataSetType"             -> dataSetType.asInstanceOf[js.Any],
        "destinationS3BucketName" -> destinationS3BucketName.asInstanceOf[js.Any],
        "roleNameArn"             -> roleNameArn.asInstanceOf[js.Any],
        "snsTopicArn"             -> snsTopicArn.asInstanceOf[js.Any]
      )

      customerDefinedValues.foreach(__v => __obj.updateDynamic("customerDefinedValues")(__v.asInstanceOf[js.Any]))
      destinationS3Prefix.foreach(__v => __obj.updateDynamic("destinationS3Prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GenerateDataSetRequest]
    }
  }

  /**
    * Container for the result of the GenerateDataSet operation.
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

  /**
    * Container for the parameters to the StartSupportDataExport operation.
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
        "dataSetType"             -> dataSetType.asInstanceOf[js.Any],
        "destinationS3BucketName" -> destinationS3BucketName.asInstanceOf[js.Any],
        "fromDate"                -> fromDate.asInstanceOf[js.Any],
        "roleNameArn"             -> roleNameArn.asInstanceOf[js.Any],
        "snsTopicArn"             -> snsTopicArn.asInstanceOf[js.Any]
      )

      customerDefinedValues.foreach(__v => __obj.updateDynamic("customerDefinedValues")(__v.asInstanceOf[js.Any]))
      destinationS3Prefix.foreach(__v => __obj.updateDynamic("destinationS3Prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSupportDataExportRequest]
    }
  }

  /**
    * Container for the result of the StartSupportDataExport operation.
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

  @js.native
  sealed trait SupportDataSetType extends js.Any
  object SupportDataSetType extends js.Object {
    val customer_support_contacts_data      = "customer_support_contacts_data".asInstanceOf[SupportDataSetType]
    val test_customer_support_contacts_data = "test_customer_support_contacts_data".asInstanceOf[SupportDataSetType]

    val values = js.Object.freeze(js.Array(customer_support_contacts_data, test_customer_support_contacts_data))
  }
}
