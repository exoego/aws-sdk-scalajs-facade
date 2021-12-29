package facade.amazonaws.services.savingsplans

import scalajs._

type CurrencyCode = "CNY" | "USD"
object CurrencyCode {
  inline val CNY: "CNY" = "CNY"
  inline val USD: "USD" = "USD"

  inline def values: js.Array[CurrencyCode] = js.Array(CNY, USD)
}

type SavingsPlanOfferingFilterAttribute = "region" | "instanceFamily"
object SavingsPlanOfferingFilterAttribute {
  inline val region: "region" = "region"
  inline val instanceFamily: "instanceFamily" = "instanceFamily"

  inline def values: js.Array[SavingsPlanOfferingFilterAttribute] = js.Array(region, instanceFamily)
}

type SavingsPlanOfferingPropertyKey = "region" | "instanceFamily"
object SavingsPlanOfferingPropertyKey {
  inline val region: "region" = "region"
  inline val instanceFamily: "instanceFamily" = "instanceFamily"

  inline def values: js.Array[SavingsPlanOfferingPropertyKey] = js.Array(region, instanceFamily)
}

type SavingsPlanPaymentOption = "All Upfront" | "Partial Upfront" | "No Upfront"
object SavingsPlanPaymentOption {
  inline val `All Upfront`: "All Upfront" = "All Upfront"
  inline val `Partial Upfront`: "Partial Upfront" = "Partial Upfront"
  inline val `No Upfront`: "No Upfront" = "No Upfront"

  inline def values: js.Array[SavingsPlanPaymentOption] = js.Array(`All Upfront`, `Partial Upfront`, `No Upfront`)
}

type SavingsPlanProductType = "EC2" | "Fargate" | "Lambda" | "SageMaker"
object SavingsPlanProductType {
  inline val EC2: "EC2" = "EC2"
  inline val Fargate: "Fargate" = "Fargate"
  inline val Lambda: "Lambda" = "Lambda"
  inline val SageMaker: "SageMaker" = "SageMaker"

  inline def values: js.Array[SavingsPlanProductType] = js.Array(EC2, Fargate, Lambda, SageMaker)
}

type SavingsPlanRateFilterAttribute = "region" | "instanceFamily" | "instanceType" | "productDescription" | "tenancy" | "productId"
object SavingsPlanRateFilterAttribute {
  inline val region: "region" = "region"
  inline val instanceFamily: "instanceFamily" = "instanceFamily"
  inline val instanceType: "instanceType" = "instanceType"
  inline val productDescription: "productDescription" = "productDescription"
  inline val tenancy: "tenancy" = "tenancy"
  inline val productId: "productId" = "productId"

  inline def values: js.Array[SavingsPlanRateFilterAttribute] = js.Array(region, instanceFamily, instanceType, productDescription, tenancy, productId)
}

type SavingsPlanRateFilterName = "region" | "instanceType" | "productDescription" | "tenancy" | "productType" | "serviceCode" | "usageType" | "operation"
object SavingsPlanRateFilterName {
  inline val region: "region" = "region"
  inline val instanceType: "instanceType" = "instanceType"
  inline val productDescription: "productDescription" = "productDescription"
  inline val tenancy: "tenancy" = "tenancy"
  inline val productType: "productType" = "productType"
  inline val serviceCode: "serviceCode" = "serviceCode"
  inline val usageType: "usageType" = "usageType"
  inline val operation: "operation" = "operation"

  inline def values: js.Array[SavingsPlanRateFilterName] = js.Array(region, instanceType, productDescription, tenancy, productType, serviceCode, usageType, operation)
}

type SavingsPlanRatePropertyKey = "region" | "instanceType" | "instanceFamily" | "productDescription" | "tenancy"
object SavingsPlanRatePropertyKey {
  inline val region: "region" = "region"
  inline val instanceType: "instanceType" = "instanceType"
  inline val instanceFamily: "instanceFamily" = "instanceFamily"
  inline val productDescription: "productDescription" = "productDescription"
  inline val tenancy: "tenancy" = "tenancy"

  inline def values: js.Array[SavingsPlanRatePropertyKey] = js.Array(region, instanceType, instanceFamily, productDescription, tenancy)
}

type SavingsPlanRateServiceCode = "AmazonEC2" | "AmazonECS" | "AmazonEKS" | "AWSLambda" | "AmazonSageMaker"
object SavingsPlanRateServiceCode {
  inline val AmazonEC2: "AmazonEC2" = "AmazonEC2"
  inline val AmazonECS: "AmazonECS" = "AmazonECS"
  inline val AmazonEKS: "AmazonEKS" = "AmazonEKS"
  inline val AWSLambda: "AWSLambda" = "AWSLambda"
  inline val AmazonSageMaker: "AmazonSageMaker" = "AmazonSageMaker"

  inline def values: js.Array[SavingsPlanRateServiceCode] = js.Array(AmazonEC2, AmazonECS, AmazonEKS, AWSLambda, AmazonSageMaker)
}

type SavingsPlanRateUnit = "Hrs" | "Lambda-GB-Second" | "Request"
object SavingsPlanRateUnit {
  inline val Hrs: "Hrs" = "Hrs"
  inline val `Lambda-GB-Second`: "Lambda-GB-Second" = "Lambda-GB-Second"
  inline val Request: "Request" = "Request"

  inline def values: js.Array[SavingsPlanRateUnit] = js.Array(Hrs, `Lambda-GB-Second`, Request)
}

type SavingsPlanState = "payment-pending" | "payment-failed" | "active" | "retired" | "queued" | "queued-deleted"
object SavingsPlanState {
  inline val `payment-pending`: "payment-pending" = "payment-pending"
  inline val `payment-failed`: "payment-failed" = "payment-failed"
  inline val active: "active" = "active"
  inline val retired: "retired" = "retired"
  inline val queued: "queued" = "queued"
  inline val `queued-deleted`: "queued-deleted" = "queued-deleted"

  inline def values: js.Array[SavingsPlanState] = js.Array(`payment-pending`, `payment-failed`, active, retired, queued, `queued-deleted`)
}

type SavingsPlanType = "Compute" | "EC2Instance" | "SageMaker"
object SavingsPlanType {
  inline val Compute: "Compute" = "Compute"
  inline val EC2Instance: "EC2Instance" = "EC2Instance"
  inline val SageMaker: "SageMaker" = "SageMaker"

  inline def values: js.Array[SavingsPlanType] = js.Array(Compute, EC2Instance, SageMaker)
}

type SavingsPlansFilterName = "region" | "ec2-instance-family" | "commitment" | "upfront" | "term" | "savings-plan-type" | "payment-option" | "start" | "end"
object SavingsPlansFilterName {
  inline val region: "region" = "region"
  inline val `ec2-instance-family`: "ec2-instance-family" = "ec2-instance-family"
  inline val commitment: "commitment" = "commitment"
  inline val upfront: "upfront" = "upfront"
  inline val term: "term" = "term"
  inline val `savings-plan-type`: "savings-plan-type" = "savings-plan-type"
  inline val `payment-option`: "payment-option" = "payment-option"
  inline val start: "start" = "start"
  inline val end: "end" = "end"

  inline def values: js.Array[SavingsPlansFilterName] = js.Array(region, `ec2-instance-family`, commitment, upfront, term, `savings-plan-type`, `payment-option`, start, end)
}
