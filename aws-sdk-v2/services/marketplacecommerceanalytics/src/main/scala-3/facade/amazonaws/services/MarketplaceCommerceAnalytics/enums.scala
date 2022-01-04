package facade.amazonaws.services.marketplacecommerceanalytics

import scalajs.js

type DataSetType = "customer_subscriber_hourly_monthly_subscriptions" | "customer_subscriber_annual_subscriptions" | "daily_business_usage_by_instance_type" | "daily_business_fees" | "daily_business_free_trial_conversions" | "daily_business_new_instances" | "daily_business_new_product_subscribers" | "daily_business_canceled_product_subscribers" | "monthly_revenue_billing_and_revenue_data" | "monthly_revenue_annual_subscriptions" | "monthly_revenue_field_demonstration_usage" | "monthly_revenue_flexible_payment_schedule" | "disbursed_amount_by_product" | "disbursed_amount_by_product_with_uncollected_funds" | "disbursed_amount_by_instance_hours" | "disbursed_amount_by_customer_geo" | "disbursed_amount_by_age_of_uncollected_funds" | "disbursed_amount_by_age_of_disbursed_funds" | "disbursed_amount_by_age_of_past_due_funds" | "disbursed_amount_by_uncollected_funds_breakdown" | "customer_profile_by_industry" | "customer_profile_by_revenue" | "customer_profile_by_geography" |
  "sales_compensation_billed_revenue" | "us_sales_and_use_tax_records"
object DataSetType {
  inline val customer_subscriber_hourly_monthly_subscriptions: "customer_subscriber_hourly_monthly_subscriptions" = "customer_subscriber_hourly_monthly_subscriptions"
  inline val customer_subscriber_annual_subscriptions: "customer_subscriber_annual_subscriptions" = "customer_subscriber_annual_subscriptions"
  inline val daily_business_usage_by_instance_type: "daily_business_usage_by_instance_type" = "daily_business_usage_by_instance_type"
  inline val daily_business_fees: "daily_business_fees" = "daily_business_fees"
  inline val daily_business_free_trial_conversions: "daily_business_free_trial_conversions" = "daily_business_free_trial_conversions"
  inline val daily_business_new_instances: "daily_business_new_instances" = "daily_business_new_instances"
  inline val daily_business_new_product_subscribers: "daily_business_new_product_subscribers" = "daily_business_new_product_subscribers"
  inline val daily_business_canceled_product_subscribers: "daily_business_canceled_product_subscribers" = "daily_business_canceled_product_subscribers"
  inline val monthly_revenue_billing_and_revenue_data: "monthly_revenue_billing_and_revenue_data" = "monthly_revenue_billing_and_revenue_data"
  inline val monthly_revenue_annual_subscriptions: "monthly_revenue_annual_subscriptions" = "monthly_revenue_annual_subscriptions"
  inline val monthly_revenue_field_demonstration_usage: "monthly_revenue_field_demonstration_usage" = "monthly_revenue_field_demonstration_usage"
  inline val monthly_revenue_flexible_payment_schedule: "monthly_revenue_flexible_payment_schedule" = "monthly_revenue_flexible_payment_schedule"
  inline val disbursed_amount_by_product: "disbursed_amount_by_product" = "disbursed_amount_by_product"
  inline val disbursed_amount_by_product_with_uncollected_funds: "disbursed_amount_by_product_with_uncollected_funds" = "disbursed_amount_by_product_with_uncollected_funds"
  inline val disbursed_amount_by_instance_hours: "disbursed_amount_by_instance_hours" = "disbursed_amount_by_instance_hours"
  inline val disbursed_amount_by_customer_geo: "disbursed_amount_by_customer_geo" = "disbursed_amount_by_customer_geo"
  inline val disbursed_amount_by_age_of_uncollected_funds: "disbursed_amount_by_age_of_uncollected_funds" = "disbursed_amount_by_age_of_uncollected_funds"
  inline val disbursed_amount_by_age_of_disbursed_funds: "disbursed_amount_by_age_of_disbursed_funds" = "disbursed_amount_by_age_of_disbursed_funds"
  inline val disbursed_amount_by_age_of_past_due_funds: "disbursed_amount_by_age_of_past_due_funds" = "disbursed_amount_by_age_of_past_due_funds"
  inline val disbursed_amount_by_uncollected_funds_breakdown: "disbursed_amount_by_uncollected_funds_breakdown" = "disbursed_amount_by_uncollected_funds_breakdown"
  inline val customer_profile_by_industry: "customer_profile_by_industry" = "customer_profile_by_industry"
  inline val customer_profile_by_revenue: "customer_profile_by_revenue" = "customer_profile_by_revenue"
  inline val customer_profile_by_geography: "customer_profile_by_geography" = "customer_profile_by_geography"
  inline val sales_compensation_billed_revenue: "sales_compensation_billed_revenue" = "sales_compensation_billed_revenue"
  inline val us_sales_and_use_tax_records: "us_sales_and_use_tax_records" = "us_sales_and_use_tax_records"

  inline def values: js.Array[DataSetType] = js.Array(
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

type SupportDataSetType = "customer_support_contacts_data" | "test_customer_support_contacts_data"
object SupportDataSetType {
  inline val customer_support_contacts_data: "customer_support_contacts_data" = "customer_support_contacts_data"
  inline val test_customer_support_contacts_data: "test_customer_support_contacts_data" = "test_customer_support_contacts_data"

  inline def values: js.Array[SupportDataSetType] = js.Array(customer_support_contacts_data, test_customer_support_contacts_data)
}
