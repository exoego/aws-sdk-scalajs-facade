package facade.amazonaws.services.savingsplans

import scalajs._

type CurrencyCode = "CNY" | "USD"
object CurrencyCode {
  val CNY: "CNY" = "CNY"
  val USD: "USD" = "USD"

  @inline def values = js.Array[CurrencyCode](CNY, USD)
}

type SavingsPlanOfferingFilterAttribute = "region" | "instanceFamily"
object SavingsPlanOfferingFilterAttribute {
  val region: "region" = "region"
  val instanceFamily: "instanceFamily" = "instanceFamily"

  @inline def values = js.Array[SavingsPlanOfferingFilterAttribute](region, instanceFamily)
}

type SavingsPlanOfferingPropertyKey = "region" | "instanceFamily"
object SavingsPlanOfferingPropertyKey {
  val region: "region" = "region"
  val instanceFamily: "instanceFamily" = "instanceFamily"

  @inline def values = js.Array[SavingsPlanOfferingPropertyKey](region, instanceFamily)
}

type SavingsPlanPaymentOption = "All Upfront" | "Partial Upfront" | "No Upfront"
object SavingsPlanPaymentOption {
  val `All Upfront`: "All Upfront" = "All Upfront"
  val `Partial Upfront`: "Partial Upfront" = "Partial Upfront"
  val `No Upfront`: "No Upfront" = "No Upfront"

  @inline def values = js.Array[SavingsPlanPaymentOption](`All Upfront`, `Partial Upfront`, `No Upfront`)
}

type SavingsPlanProductType = "EC2" | "Fargate" | "Lambda" | "SageMaker"
object SavingsPlanProductType {
  val EC2: "EC2" = "EC2"
  val Fargate: "Fargate" = "Fargate"
  val Lambda: "Lambda" = "Lambda"
  val SageMaker: "SageMaker" = "SageMaker"

  @inline def values = js.Array[SavingsPlanProductType](EC2, Fargate, Lambda, SageMaker)
}

type SavingsPlanRateFilterAttribute = "region" | "instanceFamily" | "instanceType" | "productDescription" | "tenancy" | "productId"
object SavingsPlanRateFilterAttribute {
  val region: "region" = "region"
  val instanceFamily: "instanceFamily" = "instanceFamily"
  val instanceType: "instanceType" = "instanceType"
  val productDescription: "productDescription" = "productDescription"
  val tenancy: "tenancy" = "tenancy"
  val productId: "productId" = "productId"

  @inline def values = js.Array[SavingsPlanRateFilterAttribute](region, instanceFamily, instanceType, productDescription, tenancy, productId)
}

type SavingsPlanRateFilterName = "region" | "instanceType" | "productDescription" | "tenancy" | "productType" | "serviceCode" | "usageType" | "operation"
object SavingsPlanRateFilterName {
  val region: "region" = "region"
  val instanceType: "instanceType" = "instanceType"
  val productDescription: "productDescription" = "productDescription"
  val tenancy: "tenancy" = "tenancy"
  val productType: "productType" = "productType"
  val serviceCode: "serviceCode" = "serviceCode"
  val usageType: "usageType" = "usageType"
  val operation: "operation" = "operation"

  @inline def values = js.Array[SavingsPlanRateFilterName](region, instanceType, productDescription, tenancy, productType, serviceCode, usageType, operation)
}

type SavingsPlanRatePropertyKey = "region" | "instanceType" | "instanceFamily" | "productDescription" | "tenancy"
object SavingsPlanRatePropertyKey {
  val region: "region" = "region"
  val instanceType: "instanceType" = "instanceType"
  val instanceFamily: "instanceFamily" = "instanceFamily"
  val productDescription: "productDescription" = "productDescription"
  val tenancy: "tenancy" = "tenancy"

  @inline def values = js.Array[SavingsPlanRatePropertyKey](region, instanceType, instanceFamily, productDescription, tenancy)
}

type SavingsPlanRateServiceCode = "AmazonEC2" | "AmazonECS" | "AmazonEKS" | "AWSLambda" | "AmazonSageMaker"
object SavingsPlanRateServiceCode {
  val AmazonEC2: "AmazonEC2" = "AmazonEC2"
  val AmazonECS: "AmazonECS" = "AmazonECS"
  val AmazonEKS: "AmazonEKS" = "AmazonEKS"
  val AWSLambda: "AWSLambda" = "AWSLambda"
  val AmazonSageMaker: "AmazonSageMaker" = "AmazonSageMaker"

  @inline def values = js.Array[SavingsPlanRateServiceCode](AmazonEC2, AmazonECS, AmazonEKS, AWSLambda, AmazonSageMaker)
}

type SavingsPlanRateUnit = "Hrs" | "Lambda-GB-Second" | "Request"
object SavingsPlanRateUnit {
  val Hrs: "Hrs" = "Hrs"
  val `Lambda-GB-Second`: "Lambda-GB-Second" = "Lambda-GB-Second"
  val Request: "Request" = "Request"

  @inline def values = js.Array[SavingsPlanRateUnit](Hrs, `Lambda-GB-Second`, Request)
}

type SavingsPlanState = "payment-pending" | "payment-failed" | "active" | "retired" | "queued" | "queued-deleted"
object SavingsPlanState {
  val `payment-pending`: "payment-pending" = "payment-pending"
  val `payment-failed`: "payment-failed" = "payment-failed"
  val active: "active" = "active"
  val retired: "retired" = "retired"
  val queued: "queued" = "queued"
  val `queued-deleted`: "queued-deleted" = "queued-deleted"

  @inline def values = js.Array[SavingsPlanState](`payment-pending`, `payment-failed`, active, retired, queued, `queued-deleted`)
}

type SavingsPlanType = "Compute" | "EC2Instance" | "SageMaker"
object SavingsPlanType {
  val Compute: "Compute" = "Compute"
  val EC2Instance: "EC2Instance" = "EC2Instance"
  val SageMaker: "SageMaker" = "SageMaker"

  @inline def values = js.Array[SavingsPlanType](Compute, EC2Instance, SageMaker)
}

type SavingsPlansFilterName = "region" | "ec2-instance-family" | "commitment" | "upfront" | "term" | "savings-plan-type" | "payment-option" | "start" | "end"
object SavingsPlansFilterName {
  val region: "region" = "region"
  val `ec2-instance-family`: "ec2-instance-family" = "ec2-instance-family"
  val commitment: "commitment" = "commitment"
  val upfront: "upfront" = "upfront"
  val term: "term" = "term"
  val `savings-plan-type`: "savings-plan-type" = "savings-plan-type"
  val `payment-option`: "payment-option" = "payment-option"
  val start: "start" = "start"
  val end: "end" = "end"

  @inline def values = js.Array[SavingsPlansFilterName](region, `ec2-instance-family`, commitment, upfront, term, `savings-plan-type`, `payment-option`, start, end)
}
