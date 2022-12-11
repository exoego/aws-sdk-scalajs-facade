package facade.amazonaws.services.billingconductor

import scalajs.js

type AssociateResourceErrorReason = "INVALID_ARN" | "SERVICE_LIMIT_EXCEEDED" | "ILLEGAL_CUSTOMLINEITEM" | "INTERNAL_SERVER_EXCEPTION" | "INVALID_BILLING_PERIOD_RANGE"
object AssociateResourceErrorReason {
  inline val INVALID_ARN: "INVALID_ARN" = "INVALID_ARN"
  inline val SERVICE_LIMIT_EXCEEDED: "SERVICE_LIMIT_EXCEEDED" = "SERVICE_LIMIT_EXCEEDED"
  inline val ILLEGAL_CUSTOMLINEITEM: "ILLEGAL_CUSTOMLINEITEM" = "ILLEGAL_CUSTOMLINEITEM"
  inline val INTERNAL_SERVER_EXCEPTION: "INTERNAL_SERVER_EXCEPTION" = "INTERNAL_SERVER_EXCEPTION"
  inline val INVALID_BILLING_PERIOD_RANGE: "INVALID_BILLING_PERIOD_RANGE" = "INVALID_BILLING_PERIOD_RANGE"

  inline def values: js.Array[AssociateResourceErrorReason] = js.Array(INVALID_ARN, SERVICE_LIMIT_EXCEEDED, ILLEGAL_CUSTOMLINEITEM, INTERNAL_SERVER_EXCEPTION, INVALID_BILLING_PERIOD_RANGE)
}

type BillingGroupStatus = "ACTIVE" | "PRIMARY_ACCOUNT_MISSING"
object BillingGroupStatus {
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val PRIMARY_ACCOUNT_MISSING: "PRIMARY_ACCOUNT_MISSING" = "PRIMARY_ACCOUNT_MISSING"

  inline def values: js.Array[BillingGroupStatus] = js.Array(ACTIVE, PRIMARY_ACCOUNT_MISSING)
}

type CurrencyCode = "USD" | "CNY"
object CurrencyCode {
  inline val USD: "USD" = "USD"
  inline val CNY: "CNY" = "CNY"

  inline def values: js.Array[CurrencyCode] = js.Array(USD, CNY)
}

type CustomLineItemRelationship = "PARENT" | "CHILD"
object CustomLineItemRelationship {
  inline val PARENT: "PARENT" = "PARENT"
  inline val CHILD: "CHILD" = "CHILD"

  inline def values: js.Array[CustomLineItemRelationship] = js.Array(PARENT, CHILD)
}

type CustomLineItemType = "CREDIT" | "FEE"
object CustomLineItemType {
  inline val CREDIT: "CREDIT" = "CREDIT"
  inline val FEE: "FEE" = "FEE"

  inline def values: js.Array[CustomLineItemType] = js.Array(CREDIT, FEE)
}

type PricingRuleScope = "GLOBAL" | "SERVICE" | "BILLING_ENTITY"
object PricingRuleScope {
  inline val GLOBAL: "GLOBAL" = "GLOBAL"
  inline val SERVICE: "SERVICE" = "SERVICE"
  inline val BILLING_ENTITY: "BILLING_ENTITY" = "BILLING_ENTITY"

  inline def values: js.Array[PricingRuleScope] = js.Array(GLOBAL, SERVICE, BILLING_ENTITY)
}

type PricingRuleType = "MARKUP" | "DISCOUNT" | "TIERING"
object PricingRuleType {
  inline val MARKUP: "MARKUP" = "MARKUP"
  inline val DISCOUNT: "DISCOUNT" = "DISCOUNT"
  inline val TIERING: "TIERING" = "TIERING"

  inline def values: js.Array[PricingRuleType] = js.Array(MARKUP, DISCOUNT, TIERING)
}
