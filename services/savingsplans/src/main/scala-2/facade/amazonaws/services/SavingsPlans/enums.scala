package facade.amazonaws.services.savingsplans

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait CurrencyCode extends js.Any
object CurrencyCode {
  val CNY = "CNY".asInstanceOf[CurrencyCode]
  val USD = "USD".asInstanceOf[CurrencyCode]

  @inline def values = js.Array(CNY, USD)
}

@js.native
sealed trait SavingsPlanOfferingFilterAttribute extends js.Any
object SavingsPlanOfferingFilterAttribute {
  val region = "region".asInstanceOf[SavingsPlanOfferingFilterAttribute]
  val instanceFamily = "instanceFamily".asInstanceOf[SavingsPlanOfferingFilterAttribute]

  @inline def values = js.Array(region, instanceFamily)
}

@js.native
sealed trait SavingsPlanOfferingPropertyKey extends js.Any
object SavingsPlanOfferingPropertyKey {
  val region = "region".asInstanceOf[SavingsPlanOfferingPropertyKey]
  val instanceFamily = "instanceFamily".asInstanceOf[SavingsPlanOfferingPropertyKey]

  @inline def values = js.Array(region, instanceFamily)
}

@js.native
sealed trait SavingsPlanPaymentOption extends js.Any
object SavingsPlanPaymentOption {
  val `All Upfront` = "All Upfront".asInstanceOf[SavingsPlanPaymentOption]
  val `Partial Upfront` = "Partial Upfront".asInstanceOf[SavingsPlanPaymentOption]
  val `No Upfront` = "No Upfront".asInstanceOf[SavingsPlanPaymentOption]

  @inline def values = js.Array(`All Upfront`, `Partial Upfront`, `No Upfront`)
}

@js.native
sealed trait SavingsPlanProductType extends js.Any
object SavingsPlanProductType {
  val EC2 = "EC2".asInstanceOf[SavingsPlanProductType]
  val Fargate = "Fargate".asInstanceOf[SavingsPlanProductType]
  val Lambda = "Lambda".asInstanceOf[SavingsPlanProductType]
  val SageMaker = "SageMaker".asInstanceOf[SavingsPlanProductType]

  @inline def values = js.Array(EC2, Fargate, Lambda, SageMaker)
}

@js.native
sealed trait SavingsPlanRateFilterAttribute extends js.Any
object SavingsPlanRateFilterAttribute {
  val region = "region".asInstanceOf[SavingsPlanRateFilterAttribute]
  val instanceFamily = "instanceFamily".asInstanceOf[SavingsPlanRateFilterAttribute]
  val instanceType = "instanceType".asInstanceOf[SavingsPlanRateFilterAttribute]
  val productDescription = "productDescription".asInstanceOf[SavingsPlanRateFilterAttribute]
  val tenancy = "tenancy".asInstanceOf[SavingsPlanRateFilterAttribute]
  val productId = "productId".asInstanceOf[SavingsPlanRateFilterAttribute]

  @inline def values = js.Array(region, instanceFamily, instanceType, productDescription, tenancy, productId)
}

@js.native
sealed trait SavingsPlanRateFilterName extends js.Any
object SavingsPlanRateFilterName {
  val region = "region".asInstanceOf[SavingsPlanRateFilterName]
  val instanceType = "instanceType".asInstanceOf[SavingsPlanRateFilterName]
  val productDescription = "productDescription".asInstanceOf[SavingsPlanRateFilterName]
  val tenancy = "tenancy".asInstanceOf[SavingsPlanRateFilterName]
  val productType = "productType".asInstanceOf[SavingsPlanRateFilterName]
  val serviceCode = "serviceCode".asInstanceOf[SavingsPlanRateFilterName]
  val usageType = "usageType".asInstanceOf[SavingsPlanRateFilterName]
  val operation = "operation".asInstanceOf[SavingsPlanRateFilterName]

  @inline def values = js.Array(region, instanceType, productDescription, tenancy, productType, serviceCode, usageType, operation)
}

@js.native
sealed trait SavingsPlanRatePropertyKey extends js.Any
object SavingsPlanRatePropertyKey {
  val region = "region".asInstanceOf[SavingsPlanRatePropertyKey]
  val instanceType = "instanceType".asInstanceOf[SavingsPlanRatePropertyKey]
  val instanceFamily = "instanceFamily".asInstanceOf[SavingsPlanRatePropertyKey]
  val productDescription = "productDescription".asInstanceOf[SavingsPlanRatePropertyKey]
  val tenancy = "tenancy".asInstanceOf[SavingsPlanRatePropertyKey]

  @inline def values = js.Array(region, instanceType, instanceFamily, productDescription, tenancy)
}

@js.native
sealed trait SavingsPlanRateServiceCode extends js.Any
object SavingsPlanRateServiceCode {
  val AmazonEC2 = "AmazonEC2".asInstanceOf[SavingsPlanRateServiceCode]
  val AmazonECS = "AmazonECS".asInstanceOf[SavingsPlanRateServiceCode]
  val AmazonEKS = "AmazonEKS".asInstanceOf[SavingsPlanRateServiceCode]
  val AWSLambda = "AWSLambda".asInstanceOf[SavingsPlanRateServiceCode]
  val AmazonSageMaker = "AmazonSageMaker".asInstanceOf[SavingsPlanRateServiceCode]

  @inline def values = js.Array(AmazonEC2, AmazonECS, AmazonEKS, AWSLambda, AmazonSageMaker)
}

@js.native
sealed trait SavingsPlanRateUnit extends js.Any
object SavingsPlanRateUnit {
  val Hrs = "Hrs".asInstanceOf[SavingsPlanRateUnit]
  val `Lambda-GB-Second` = "Lambda-GB-Second".asInstanceOf[SavingsPlanRateUnit]
  val Request = "Request".asInstanceOf[SavingsPlanRateUnit]

  @inline def values = js.Array(Hrs, `Lambda-GB-Second`, Request)
}

@js.native
sealed trait SavingsPlanState extends js.Any
object SavingsPlanState {
  val `payment-pending` = "payment-pending".asInstanceOf[SavingsPlanState]
  val `payment-failed` = "payment-failed".asInstanceOf[SavingsPlanState]
  val active = "active".asInstanceOf[SavingsPlanState]
  val retired = "retired".asInstanceOf[SavingsPlanState]
  val queued = "queued".asInstanceOf[SavingsPlanState]
  val `queued-deleted` = "queued-deleted".asInstanceOf[SavingsPlanState]

  @inline def values = js.Array(`payment-pending`, `payment-failed`, active, retired, queued, `queued-deleted`)
}

@js.native
sealed trait SavingsPlanType extends js.Any
object SavingsPlanType {
  val Compute = "Compute".asInstanceOf[SavingsPlanType]
  val EC2Instance = "EC2Instance".asInstanceOf[SavingsPlanType]
  val SageMaker = "SageMaker".asInstanceOf[SavingsPlanType]

  @inline def values = js.Array(Compute, EC2Instance, SageMaker)
}

@js.native
sealed trait SavingsPlansFilterName extends js.Any
object SavingsPlansFilterName {
  val region = "region".asInstanceOf[SavingsPlansFilterName]
  val `ec2-instance-family` = "ec2-instance-family".asInstanceOf[SavingsPlansFilterName]
  val commitment = "commitment".asInstanceOf[SavingsPlansFilterName]
  val upfront = "upfront".asInstanceOf[SavingsPlansFilterName]
  val term = "term".asInstanceOf[SavingsPlansFilterName]
  val `savings-plan-type` = "savings-plan-type".asInstanceOf[SavingsPlansFilterName]
  val `payment-option` = "payment-option".asInstanceOf[SavingsPlansFilterName]
  val start = "start".asInstanceOf[SavingsPlansFilterName]
  val end = "end".asInstanceOf[SavingsPlansFilterName]

  @inline def values = js.Array(region, `ec2-instance-family`, commitment, upfront, term, `savings-plan-type`, `payment-option`, start, end)
}
