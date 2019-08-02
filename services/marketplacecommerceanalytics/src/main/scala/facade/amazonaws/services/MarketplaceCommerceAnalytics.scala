package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object marketplacecommerceanalytics {
  type CustomerDefinedValues   = js.Dictionary[OptionalValue]
  type DataSetPublicationDate  = js.Date
  type DataSetRequestId        = String
  type DataSetType             = String
  type DestinationS3BucketName = String
  type DestinationS3Prefix     = String
  type ExceptionMessage        = String
  type FromDate                = js.Date
  type OptionalKey             = String
  type OptionalValue           = String
  type RoleNameArn             = String
  type SnsTopicArn             = String
  type SupportDataSetType      = String

  implicit final class MarketplaceCommerceAnalyticsOps(val service: MarketplaceCommerceAnalytics) extends AnyVal {

    def generateDataSetFuture(params: GenerateDataSetRequest): Future[GenerateDataSetResult] =
      service.generateDataSet(params).promise.toFuture
    def startSupportDataExportFuture(params: StartSupportDataExportRequest): Future[StartSupportDataExportResult] =
      service.startSupportDataExport(params).promise.toFuture
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

  object DataSetTypeEnum {
    val customer_subscriber_hourly_monthly_subscriptions   = "customer_subscriber_hourly_monthly_subscriptions"
    val customer_subscriber_annual_subscriptions           = "customer_subscriber_annual_subscriptions"
    val daily_business_usage_by_instance_type              = "daily_business_usage_by_instance_type"
    val daily_business_fees                                = "daily_business_fees"
    val daily_business_free_trial_conversions              = "daily_business_free_trial_conversions"
    val daily_business_new_instances                       = "daily_business_new_instances"
    val daily_business_new_product_subscribers             = "daily_business_new_product_subscribers"
    val daily_business_canceled_product_subscribers        = "daily_business_canceled_product_subscribers"
    val monthly_revenue_billing_and_revenue_data           = "monthly_revenue_billing_and_revenue_data"
    val monthly_revenue_annual_subscriptions               = "monthly_revenue_annual_subscriptions"
    val disbursed_amount_by_product                        = "disbursed_amount_by_product"
    val disbursed_amount_by_product_with_uncollected_funds = "disbursed_amount_by_product_with_uncollected_funds"
    val disbursed_amount_by_instance_hours                 = "disbursed_amount_by_instance_hours"
    val disbursed_amount_by_customer_geo                   = "disbursed_amount_by_customer_geo"
    val disbursed_amount_by_age_of_uncollected_funds       = "disbursed_amount_by_age_of_uncollected_funds"
    val disbursed_amount_by_age_of_disbursed_funds         = "disbursed_amount_by_age_of_disbursed_funds"
    val customer_profile_by_industry                       = "customer_profile_by_industry"
    val customer_profile_by_revenue                        = "customer_profile_by_revenue"
    val customer_profile_by_geography                      = "customer_profile_by_geography"
    val sales_compensation_billed_revenue                  = "sales_compensation_billed_revenue"
    val us_sales_and_use_tax_records                       = "us_sales_and_use_tax_records"

    val values = IndexedSeq(
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
      disbursed_amount_by_product,
      disbursed_amount_by_product_with_uncollected_funds,
      disbursed_amount_by_instance_hours,
      disbursed_amount_by_customer_geo,
      disbursed_amount_by_age_of_uncollected_funds,
      disbursed_amount_by_age_of_disbursed_funds,
      customer_profile_by_industry,
      customer_profile_by_revenue,
      customer_profile_by_geography,
      sales_compensation_billed_revenue,
      us_sales_and_use_tax_records
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
    def apply(
        dataSetPublicationDate: DataSetPublicationDate,
        dataSetType: DataSetType,
        destinationS3BucketName: DestinationS3BucketName,
        roleNameArn: RoleNameArn,
        snsTopicArn: SnsTopicArn,
        customerDefinedValues: js.UndefOr[CustomerDefinedValues] = js.undefined,
        destinationS3Prefix: js.UndefOr[DestinationS3Prefix] = js.undefined
    ): GenerateDataSetRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "dataSetPublicationDate"  -> dataSetPublicationDate.asInstanceOf[js.Any],
        "dataSetType"             -> dataSetType.asInstanceOf[js.Any],
        "destinationS3BucketName" -> destinationS3BucketName.asInstanceOf[js.Any],
        "roleNameArn"             -> roleNameArn.asInstanceOf[js.Any],
        "snsTopicArn"             -> snsTopicArn.asInstanceOf[js.Any],
        "customerDefinedValues" -> customerDefinedValues.map { x =>
          x.asInstanceOf[js.Any]
        },
        "destinationS3Prefix" -> destinationS3Prefix.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GenerateDataSetRequest]
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
    def apply(
        dataSetRequestId: js.UndefOr[DataSetRequestId] = js.undefined
    ): GenerateDataSetResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "dataSetRequestId" -> dataSetRequestId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GenerateDataSetResult]
    }
  }

  /**
    * This exception is thrown when an internal service error occurs.
    */
  @js.native
  trait MarketplaceCommerceAnalyticsExceptionException extends js.Object {
    val message: ExceptionMessage
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
    def apply(
        dataSetType: SupportDataSetType,
        destinationS3BucketName: DestinationS3BucketName,
        fromDate: FromDate,
        roleNameArn: RoleNameArn,
        snsTopicArn: SnsTopicArn,
        customerDefinedValues: js.UndefOr[CustomerDefinedValues] = js.undefined,
        destinationS3Prefix: js.UndefOr[DestinationS3Prefix] = js.undefined
    ): StartSupportDataExportRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "dataSetType"             -> dataSetType.asInstanceOf[js.Any],
        "destinationS3BucketName" -> destinationS3BucketName.asInstanceOf[js.Any],
        "fromDate"                -> fromDate.asInstanceOf[js.Any],
        "roleNameArn"             -> roleNameArn.asInstanceOf[js.Any],
        "snsTopicArn"             -> snsTopicArn.asInstanceOf[js.Any],
        "customerDefinedValues" -> customerDefinedValues.map { x =>
          x.asInstanceOf[js.Any]
        },
        "destinationS3Prefix" -> destinationS3Prefix.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartSupportDataExportRequest]
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
    def apply(
        dataSetRequestId: js.UndefOr[DataSetRequestId] = js.undefined
    ): StartSupportDataExportResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "dataSetRequestId" -> dataSetRequestId.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartSupportDataExportResult]
    }
  }

  object SupportDataSetTypeEnum {
    val customer_support_contacts_data      = "customer_support_contacts_data"
    val test_customer_support_contacts_data = "test_customer_support_contacts_data"

    val values = IndexedSeq(customer_support_contacts_data, test_customer_support_contacts_data)
  }
}
