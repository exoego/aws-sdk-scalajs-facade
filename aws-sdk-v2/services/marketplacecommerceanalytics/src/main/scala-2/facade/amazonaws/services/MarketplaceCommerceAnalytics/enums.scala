package facade.amazonaws.services.marketplacecommerceanalytics

import scalajs.js

@js.native
sealed trait DataSetType extends js.Any
object DataSetType {
  val customer_subscriber_hourly_monthly_subscriptions = "customer_subscriber_hourly_monthly_subscriptions".asInstanceOf[DataSetType]
  val customer_subscriber_annual_subscriptions = "customer_subscriber_annual_subscriptions".asInstanceOf[DataSetType]
  val daily_business_usage_by_instance_type = "daily_business_usage_by_instance_type".asInstanceOf[DataSetType]
  val daily_business_fees = "daily_business_fees".asInstanceOf[DataSetType]
  val daily_business_free_trial_conversions = "daily_business_free_trial_conversions".asInstanceOf[DataSetType]
  val daily_business_new_instances = "daily_business_new_instances".asInstanceOf[DataSetType]
  val daily_business_new_product_subscribers = "daily_business_new_product_subscribers".asInstanceOf[DataSetType]
  val daily_business_canceled_product_subscribers = "daily_business_canceled_product_subscribers".asInstanceOf[DataSetType]
  val monthly_revenue_billing_and_revenue_data = "monthly_revenue_billing_and_revenue_data".asInstanceOf[DataSetType]
  val monthly_revenue_annual_subscriptions = "monthly_revenue_annual_subscriptions".asInstanceOf[DataSetType]
  val monthly_revenue_field_demonstration_usage = "monthly_revenue_field_demonstration_usage".asInstanceOf[DataSetType]
  val monthly_revenue_flexible_payment_schedule = "monthly_revenue_flexible_payment_schedule".asInstanceOf[DataSetType]
  val disbursed_amount_by_product = "disbursed_amount_by_product".asInstanceOf[DataSetType]
  val disbursed_amount_by_product_with_uncollected_funds = "disbursed_amount_by_product_with_uncollected_funds".asInstanceOf[DataSetType]
  val disbursed_amount_by_instance_hours = "disbursed_amount_by_instance_hours".asInstanceOf[DataSetType]
  val disbursed_amount_by_customer_geo = "disbursed_amount_by_customer_geo".asInstanceOf[DataSetType]
  val disbursed_amount_by_age_of_uncollected_funds = "disbursed_amount_by_age_of_uncollected_funds".asInstanceOf[DataSetType]
  val disbursed_amount_by_age_of_disbursed_funds = "disbursed_amount_by_age_of_disbursed_funds".asInstanceOf[DataSetType]
  val disbursed_amount_by_age_of_past_due_funds = "disbursed_amount_by_age_of_past_due_funds".asInstanceOf[DataSetType]
  val disbursed_amount_by_uncollected_funds_breakdown = "disbursed_amount_by_uncollected_funds_breakdown".asInstanceOf[DataSetType]
  val customer_profile_by_industry = "customer_profile_by_industry".asInstanceOf[DataSetType]
  val customer_profile_by_revenue = "customer_profile_by_revenue".asInstanceOf[DataSetType]
  val customer_profile_by_geography = "customer_profile_by_geography".asInstanceOf[DataSetType]
  val sales_compensation_billed_revenue = "sales_compensation_billed_revenue".asInstanceOf[DataSetType]
  val us_sales_and_use_tax_records = "us_sales_and_use_tax_records".asInstanceOf[DataSetType]

  @inline def values: js.Array[DataSetType] = js.Array(
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
}

@js.native
sealed trait SupportDataSetType extends js.Any
object SupportDataSetType {
  val customer_support_contacts_data = "customer_support_contacts_data".asInstanceOf[SupportDataSetType]
  val test_customer_support_contacts_data = "test_customer_support_contacts_data".asInstanceOf[SupportDataSetType]

  @inline def values: js.Array[SupportDataSetType] = js.Array(customer_support_contacts_data, test_customer_support_contacts_data)
}
