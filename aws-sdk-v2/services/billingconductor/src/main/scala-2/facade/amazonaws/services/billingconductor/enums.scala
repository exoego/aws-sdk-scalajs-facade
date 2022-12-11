package facade.amazonaws.services.billingconductor

import scalajs.js

@js.native
sealed trait AssociateResourceErrorReason extends js.Any
object AssociateResourceErrorReason {
  val INVALID_ARN = "INVALID_ARN".asInstanceOf[AssociateResourceErrorReason]
  val SERVICE_LIMIT_EXCEEDED = "SERVICE_LIMIT_EXCEEDED".asInstanceOf[AssociateResourceErrorReason]
  val ILLEGAL_CUSTOMLINEITEM = "ILLEGAL_CUSTOMLINEITEM".asInstanceOf[AssociateResourceErrorReason]
  val INTERNAL_SERVER_EXCEPTION = "INTERNAL_SERVER_EXCEPTION".asInstanceOf[AssociateResourceErrorReason]
  val INVALID_BILLING_PERIOD_RANGE = "INVALID_BILLING_PERIOD_RANGE".asInstanceOf[AssociateResourceErrorReason]

  @inline def values: js.Array[AssociateResourceErrorReason] = js.Array(INVALID_ARN, SERVICE_LIMIT_EXCEEDED, ILLEGAL_CUSTOMLINEITEM, INTERNAL_SERVER_EXCEPTION, INVALID_BILLING_PERIOD_RANGE)
}

@js.native
sealed trait BillingGroupStatus extends js.Any
object BillingGroupStatus {
  val ACTIVE = "ACTIVE".asInstanceOf[BillingGroupStatus]
  val PRIMARY_ACCOUNT_MISSING = "PRIMARY_ACCOUNT_MISSING".asInstanceOf[BillingGroupStatus]

  @inline def values: js.Array[BillingGroupStatus] = js.Array(ACTIVE, PRIMARY_ACCOUNT_MISSING)
}

@js.native
sealed trait CurrencyCode extends js.Any
object CurrencyCode {
  val USD = "USD".asInstanceOf[CurrencyCode]
  val CNY = "CNY".asInstanceOf[CurrencyCode]

  @inline def values: js.Array[CurrencyCode] = js.Array(USD, CNY)
}

@js.native
sealed trait CustomLineItemRelationship extends js.Any
object CustomLineItemRelationship {
  val PARENT = "PARENT".asInstanceOf[CustomLineItemRelationship]
  val CHILD = "CHILD".asInstanceOf[CustomLineItemRelationship]

  @inline def values: js.Array[CustomLineItemRelationship] = js.Array(PARENT, CHILD)
}

@js.native
sealed trait CustomLineItemType extends js.Any
object CustomLineItemType {
  val CREDIT = "CREDIT".asInstanceOf[CustomLineItemType]
  val FEE = "FEE".asInstanceOf[CustomLineItemType]

  @inline def values: js.Array[CustomLineItemType] = js.Array(CREDIT, FEE)
}

@js.native
sealed trait PricingRuleScope extends js.Any
object PricingRuleScope {
  val GLOBAL = "GLOBAL".asInstanceOf[PricingRuleScope]
  val SERVICE = "SERVICE".asInstanceOf[PricingRuleScope]
  val BILLING_ENTITY = "BILLING_ENTITY".asInstanceOf[PricingRuleScope]

  @inline def values: js.Array[PricingRuleScope] = js.Array(GLOBAL, SERVICE, BILLING_ENTITY)
}

@js.native
sealed trait PricingRuleType extends js.Any
object PricingRuleType {
  val MARKUP = "MARKUP".asInstanceOf[PricingRuleType]
  val DISCOUNT = "DISCOUNT".asInstanceOf[PricingRuleType]
  val TIERING = "TIERING".asInstanceOf[PricingRuleType]

  @inline def values: js.Array[PricingRuleType] = js.Array(MARKUP, DISCOUNT, TIERING)
}
