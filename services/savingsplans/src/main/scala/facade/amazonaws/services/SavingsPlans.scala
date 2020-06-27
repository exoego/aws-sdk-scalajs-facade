package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object savingsplans {
  type Amount                              = String
  type ClientToken                         = String
  type CurrencyList                        = js.Array[CurrencyCode]
  type DurationsList                       = js.Array[SavingsPlansDuration]
  type EC2InstanceFamily                   = String
  type FilterValuesList                    = js.Array[JsonSafeFilterValueString]
  type JsonSafeFilterValueString           = String
  type ListOfStrings                       = js.Array[String]
  type MaxResults                          = Int
  type PageSize                            = Int
  type PaginationToken                     = String
  type Region                              = String
  type SavingsPlanArn                      = String
  type SavingsPlanArnList                  = js.Array[SavingsPlanArn]
  type SavingsPlanDescription              = String
  type SavingsPlanDescriptionsList         = js.Array[SavingsPlanDescription]
  type SavingsPlanFilterList               = js.Array[SavingsPlanFilter]
  type SavingsPlanId                       = String
  type SavingsPlanIdList                   = js.Array[SavingsPlanId]
  type SavingsPlanList                     = js.Array[SavingsPlan]
  type SavingsPlanOfferingFiltersList      = js.Array[SavingsPlanOfferingFilterElement]
  type SavingsPlanOfferingId               = String
  type SavingsPlanOfferingPropertyList     = js.Array[SavingsPlanOfferingProperty]
  type SavingsPlanOfferingRateFiltersList  = js.Array[SavingsPlanOfferingRateFilterElement]
  type SavingsPlanOfferingRatePropertyList = js.Array[SavingsPlanOfferingRateProperty]
  type SavingsPlanOfferingRatesList        = js.Array[SavingsPlanOfferingRate]
  type SavingsPlanOfferingsList            = js.Array[SavingsPlanOffering]
  type SavingsPlanOperation                = String
  type SavingsPlanOperationList            = js.Array[SavingsPlanOperation]
  type SavingsPlanPaymentOptionList        = js.Array[SavingsPlanPaymentOption]
  type SavingsPlanProductTypeList          = js.Array[SavingsPlanProductType]
  type SavingsPlanRateFilterList           = js.Array[SavingsPlanRateFilter]
  type SavingsPlanRateList                 = js.Array[SavingsPlanRate]
  type SavingsPlanRateOperation            = String
  type SavingsPlanRateOperationList        = js.Array[SavingsPlanRateOperation]
  type SavingsPlanRatePricePerUnit         = String
  type SavingsPlanRatePropertyList         = js.Array[SavingsPlanRateProperty]
  type SavingsPlanRateServiceCodeList      = js.Array[SavingsPlanRateServiceCode]
  type SavingsPlanRateUsageType            = String
  type SavingsPlanRateUsageTypeList        = js.Array[SavingsPlanRateUsageType]
  type SavingsPlanServiceCode              = String
  type SavingsPlanServiceCodeList          = js.Array[SavingsPlanServiceCode]
  type SavingsPlanStateList                = js.Array[SavingsPlanState]
  type SavingsPlanTypeList                 = js.Array[SavingsPlanType]
  type SavingsPlanUsageType                = String
  type SavingsPlanUsageTypeList            = js.Array[SavingsPlanUsageType]
  type SavingsPlansDuration                = Double
  type TagKey                              = String
  type TagKeyList                          = js.Array[TagKey]
  type TagMap                              = js.Dictionary[TagValue]
  type TagValue                            = String
  type TermDurationInSeconds               = Double
  type UUID                                = String
  type UUIDs                               = js.Array[UUID]

  implicit final class SavingsPlansOps(private val service: SavingsPlans) extends AnyVal {

    @inline def createSavingsPlanFuture(params: CreateSavingsPlanRequest): Future[CreateSavingsPlanResponse] =
      service.createSavingsPlan(params).promise().toFuture
    @inline def describeSavingsPlanRatesFuture(
        params: DescribeSavingsPlanRatesRequest
    ): Future[DescribeSavingsPlanRatesResponse] = service.describeSavingsPlanRates(params).promise().toFuture
    @inline def describeSavingsPlansFuture(params: DescribeSavingsPlansRequest): Future[DescribeSavingsPlansResponse] =
      service.describeSavingsPlans(params).promise().toFuture
    @inline def describeSavingsPlansOfferingRatesFuture(
        params: DescribeSavingsPlansOfferingRatesRequest
    ): Future[DescribeSavingsPlansOfferingRatesResponse] =
      service.describeSavingsPlansOfferingRates(params).promise().toFuture
    @inline def describeSavingsPlansOfferingsFuture(
        params: DescribeSavingsPlansOfferingsRequest
    ): Future[DescribeSavingsPlansOfferingsResponse] = service.describeSavingsPlansOfferings(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
  }
}

package savingsplans {
  @js.native
  @JSImport("aws-sdk", "SavingsPlans")
  class SavingsPlans() extends js.Object {
    def this(config: AWSConfig) = this()

    def createSavingsPlan(params: CreateSavingsPlanRequest): Request[CreateSavingsPlanResponse] = js.native
    def describeSavingsPlanRates(params: DescribeSavingsPlanRatesRequest): Request[DescribeSavingsPlanRatesResponse] =
      js.native
    def describeSavingsPlans(params: DescribeSavingsPlansRequest): Request[DescribeSavingsPlansResponse] = js.native
    def describeSavingsPlansOfferingRates(
        params: DescribeSavingsPlansOfferingRatesRequest
    ): Request[DescribeSavingsPlansOfferingRatesResponse] = js.native
    def describeSavingsPlansOfferings(
        params: DescribeSavingsPlansOfferingsRequest
    ): Request[DescribeSavingsPlansOfferingsResponse]                                                 = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                         = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                   = js.native
  }

  @js.native
  @Factory
  trait CreateSavingsPlanRequest extends js.Object {
    var commitment: Amount
    var savingsPlanOfferingId: SavingsPlanOfferingId
    var clientToken: js.UndefOr[ClientToken]
    var tags: js.UndefOr[TagMap]
    var upfrontPaymentAmount: js.UndefOr[Amount]
  }

  @js.native
  @Factory
  trait CreateSavingsPlanResponse extends js.Object {
    var savingsPlanId: js.UndefOr[SavingsPlanId]
  }

  @js.native
  sealed trait CurrencyCode extends js.Any
  object CurrencyCode extends js.Object {
    val CNY = "CNY".asInstanceOf[CurrencyCode]
    val USD = "USD".asInstanceOf[CurrencyCode]

    val values = js.Object.freeze(js.Array(CNY, USD))
  }

  @js.native
  @Factory
  trait DescribeSavingsPlanRatesRequest extends js.Object {
    var savingsPlanId: SavingsPlanId
    var filters: js.UndefOr[SavingsPlanRateFilterList]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait DescribeSavingsPlanRatesResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var savingsPlanId: js.UndefOr[SavingsPlanId]
    var searchResults: js.UndefOr[SavingsPlanRateList]
  }

  @js.native
  @Factory
  trait DescribeSavingsPlansOfferingRatesRequest extends js.Object {
    var filters: js.UndefOr[SavingsPlanOfferingRateFiltersList]
    var maxResults: js.UndefOr[PageSize]
    var nextToken: js.UndefOr[PaginationToken]
    var operations: js.UndefOr[SavingsPlanRateOperationList]
    var products: js.UndefOr[SavingsPlanProductTypeList]
    var savingsPlanOfferingIds: js.UndefOr[UUIDs]
    var savingsPlanPaymentOptions: js.UndefOr[SavingsPlanPaymentOptionList]
    var savingsPlanTypes: js.UndefOr[SavingsPlanTypeList]
    var serviceCodes: js.UndefOr[SavingsPlanRateServiceCodeList]
    var usageTypes: js.UndefOr[SavingsPlanRateUsageTypeList]
  }

  @js.native
  @Factory
  trait DescribeSavingsPlansOfferingRatesResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var searchResults: js.UndefOr[SavingsPlanOfferingRatesList]
  }

  @js.native
  @Factory
  trait DescribeSavingsPlansOfferingsRequest extends js.Object {
    var currencies: js.UndefOr[CurrencyList]
    var descriptions: js.UndefOr[SavingsPlanDescriptionsList]
    var durations: js.UndefOr[DurationsList]
    var filters: js.UndefOr[SavingsPlanOfferingFiltersList]
    var maxResults: js.UndefOr[PageSize]
    var nextToken: js.UndefOr[PaginationToken]
    var offeringIds: js.UndefOr[UUIDs]
    var operations: js.UndefOr[SavingsPlanOperationList]
    var paymentOptions: js.UndefOr[SavingsPlanPaymentOptionList]
    var planTypes: js.UndefOr[SavingsPlanTypeList]
    var productType: js.UndefOr[SavingsPlanProductType]
    var serviceCodes: js.UndefOr[SavingsPlanServiceCodeList]
    var usageTypes: js.UndefOr[SavingsPlanUsageTypeList]
  }

  @js.native
  @Factory
  trait DescribeSavingsPlansOfferingsResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var searchResults: js.UndefOr[SavingsPlanOfferingsList]
  }

  @js.native
  @Factory
  trait DescribeSavingsPlansRequest extends js.Object {
    var filters: js.UndefOr[SavingsPlanFilterList]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
    var savingsPlanArns: js.UndefOr[SavingsPlanArnList]
    var savingsPlanIds: js.UndefOr[SavingsPlanIdList]
    var states: js.UndefOr[SavingsPlanStateList]
  }

  @js.native
  @Factory
  trait DescribeSavingsPlansResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var savingsPlans: js.UndefOr[SavingsPlanList]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: SavingsPlanArn
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  /**
    * Information about a Savings Plan offering.
    */
  @js.native
  @Factory
  trait ParentSavingsPlanOffering extends js.Object {
    var currency: js.UndefOr[CurrencyCode]
    var durationSeconds: js.UndefOr[SavingsPlansDuration]
    var offeringId: js.UndefOr[UUID]
    var paymentOption: js.UndefOr[SavingsPlanPaymentOption]
    var planDescription: js.UndefOr[SavingsPlanDescription]
    var planType: js.UndefOr[SavingsPlanType]
  }

  /**
    * Information about a Savings Plan.
    */
  @js.native
  @Factory
  trait SavingsPlan extends js.Object {
    var commitment: js.UndefOr[Amount]
    var currency: js.UndefOr[CurrencyCode]
    var description: js.UndefOr[String]
    var ec2InstanceFamily: js.UndefOr[EC2InstanceFamily]
    var end: js.UndefOr[String]
    var offeringId: js.UndefOr[SavingsPlanOfferingId]
    var paymentOption: js.UndefOr[SavingsPlanPaymentOption]
    var productTypes: js.UndefOr[SavingsPlanProductTypeList]
    var recurringPaymentAmount: js.UndefOr[Amount]
    var region: js.UndefOr[Region]
    var savingsPlanArn: js.UndefOr[SavingsPlanArn]
    var savingsPlanId: js.UndefOr[SavingsPlanId]
    var savingsPlanType: js.UndefOr[SavingsPlanType]
    var start: js.UndefOr[String]
    var state: js.UndefOr[SavingsPlanState]
    var tags: js.UndefOr[TagMap]
    var termDurationInSeconds: js.UndefOr[TermDurationInSeconds]
    var upfrontPaymentAmount: js.UndefOr[Amount]
  }

  /**
    * Information about a filter.
    */
  @js.native
  @Factory
  trait SavingsPlanFilter extends js.Object {
    var name: js.UndefOr[SavingsPlansFilterName]
    var values: js.UndefOr[ListOfStrings]
  }

  /**
    * Information about a Savings Plan offering.
    */
  @js.native
  @Factory
  trait SavingsPlanOffering extends js.Object {
    var currency: js.UndefOr[CurrencyCode]
    var description: js.UndefOr[SavingsPlanDescription]
    var durationSeconds: js.UndefOr[SavingsPlansDuration]
    var offeringId: js.UndefOr[UUID]
    var operation: js.UndefOr[SavingsPlanOperation]
    var paymentOption: js.UndefOr[SavingsPlanPaymentOption]
    var planType: js.UndefOr[SavingsPlanType]
    var productTypes: js.UndefOr[SavingsPlanProductTypeList]
    var properties: js.UndefOr[SavingsPlanOfferingPropertyList]
    var serviceCode: js.UndefOr[SavingsPlanServiceCode]
    var usageType: js.UndefOr[SavingsPlanUsageType]
  }

  @js.native
  sealed trait SavingsPlanOfferingFilterAttribute extends js.Any
  object SavingsPlanOfferingFilterAttribute extends js.Object {
    val region         = "region".asInstanceOf[SavingsPlanOfferingFilterAttribute]
    val instanceFamily = "instanceFamily".asInstanceOf[SavingsPlanOfferingFilterAttribute]

    val values = js.Object.freeze(js.Array(region, instanceFamily))
  }

  /**
    * Information about a filter.
    */
  @js.native
  @Factory
  trait SavingsPlanOfferingFilterElement extends js.Object {
    var name: js.UndefOr[SavingsPlanOfferingFilterAttribute]
    var values: js.UndefOr[FilterValuesList]
  }

  /**
    * Information about a property.
    */
  @js.native
  @Factory
  trait SavingsPlanOfferingProperty extends js.Object {
    var name: js.UndefOr[SavingsPlanOfferingPropertyKey]
    var value: js.UndefOr[JsonSafeFilterValueString]
  }

  @js.native
  sealed trait SavingsPlanOfferingPropertyKey extends js.Any
  object SavingsPlanOfferingPropertyKey extends js.Object {
    val region         = "region".asInstanceOf[SavingsPlanOfferingPropertyKey]
    val instanceFamily = "instanceFamily".asInstanceOf[SavingsPlanOfferingPropertyKey]

    val values = js.Object.freeze(js.Array(region, instanceFamily))
  }

  /**
    * Information about a Savings Plan offering rate.
    */
  @js.native
  @Factory
  trait SavingsPlanOfferingRate extends js.Object {
    var operation: js.UndefOr[SavingsPlanRateOperation]
    var productType: js.UndefOr[SavingsPlanProductType]
    var properties: js.UndefOr[SavingsPlanOfferingRatePropertyList]
    var rate: js.UndefOr[SavingsPlanRatePricePerUnit]
    var savingsPlanOffering: js.UndefOr[ParentSavingsPlanOffering]
    var serviceCode: js.UndefOr[SavingsPlanRateServiceCode]
    var unit: js.UndefOr[SavingsPlanRateUnit]
    var usageType: js.UndefOr[SavingsPlanRateUsageType]
  }

  /**
    * Information about a filter.
    */
  @js.native
  @Factory
  trait SavingsPlanOfferingRateFilterElement extends js.Object {
    var name: js.UndefOr[SavingsPlanRateFilterAttribute]
    var values: js.UndefOr[FilterValuesList]
  }

  /**
    * Information about a property.
    */
  @js.native
  @Factory
  trait SavingsPlanOfferingRateProperty extends js.Object {
    var name: js.UndefOr[JsonSafeFilterValueString]
    var value: js.UndefOr[JsonSafeFilterValueString]
  }

  @js.native
  sealed trait SavingsPlanPaymentOption extends js.Any
  object SavingsPlanPaymentOption extends js.Object {
    val `All Upfront`     = "All Upfront".asInstanceOf[SavingsPlanPaymentOption]
    val `Partial Upfront` = "Partial Upfront".asInstanceOf[SavingsPlanPaymentOption]
    val `No Upfront`      = "No Upfront".asInstanceOf[SavingsPlanPaymentOption]

    val values = js.Object.freeze(js.Array(`All Upfront`, `Partial Upfront`, `No Upfront`))
  }

  @js.native
  sealed trait SavingsPlanProductType extends js.Any
  object SavingsPlanProductType extends js.Object {
    val EC2     = "EC2".asInstanceOf[SavingsPlanProductType]
    val Fargate = "Fargate".asInstanceOf[SavingsPlanProductType]
    val Lambda  = "Lambda".asInstanceOf[SavingsPlanProductType]

    val values = js.Object.freeze(js.Array(EC2, Fargate, Lambda))
  }

  /**
    * Information about a Savings Plan rate.
    */
  @js.native
  @Factory
  trait SavingsPlanRate extends js.Object {
    var currency: js.UndefOr[CurrencyCode]
    var operation: js.UndefOr[SavingsPlanRateOperation]
    var productType: js.UndefOr[SavingsPlanProductType]
    var properties: js.UndefOr[SavingsPlanRatePropertyList]
    var rate: js.UndefOr[Amount]
    var serviceCode: js.UndefOr[SavingsPlanRateServiceCode]
    var unit: js.UndefOr[SavingsPlanRateUnit]
    var usageType: js.UndefOr[SavingsPlanRateUsageType]
  }

  /**
    * Information about a filter.
    */
  @js.native
  @Factory
  trait SavingsPlanRateFilter extends js.Object {
    var name: js.UndefOr[SavingsPlanRateFilterName]
    var values: js.UndefOr[ListOfStrings]
  }

  @js.native
  sealed trait SavingsPlanRateFilterAttribute extends js.Any
  object SavingsPlanRateFilterAttribute extends js.Object {
    val region             = "region".asInstanceOf[SavingsPlanRateFilterAttribute]
    val instanceFamily     = "instanceFamily".asInstanceOf[SavingsPlanRateFilterAttribute]
    val instanceType       = "instanceType".asInstanceOf[SavingsPlanRateFilterAttribute]
    val productDescription = "productDescription".asInstanceOf[SavingsPlanRateFilterAttribute]
    val tenancy            = "tenancy".asInstanceOf[SavingsPlanRateFilterAttribute]
    val productId          = "productId".asInstanceOf[SavingsPlanRateFilterAttribute]

    val values =
      js.Object.freeze(js.Array(region, instanceFamily, instanceType, productDescription, tenancy, productId))
  }

  @js.native
  sealed trait SavingsPlanRateFilterName extends js.Any
  object SavingsPlanRateFilterName extends js.Object {
    val region             = "region".asInstanceOf[SavingsPlanRateFilterName]
    val instanceType       = "instanceType".asInstanceOf[SavingsPlanRateFilterName]
    val productDescription = "productDescription".asInstanceOf[SavingsPlanRateFilterName]
    val tenancy            = "tenancy".asInstanceOf[SavingsPlanRateFilterName]
    val productType        = "productType".asInstanceOf[SavingsPlanRateFilterName]
    val serviceCode        = "serviceCode".asInstanceOf[SavingsPlanRateFilterName]
    val usageType          = "usageType".asInstanceOf[SavingsPlanRateFilterName]
    val operation          = "operation".asInstanceOf[SavingsPlanRateFilterName]

    val values = js.Object.freeze(
      js.Array(region, instanceType, productDescription, tenancy, productType, serviceCode, usageType, operation)
    )
  }

  /**
    * Information about a property.
    */
  @js.native
  @Factory
  trait SavingsPlanRateProperty extends js.Object {
    var name: js.UndefOr[SavingsPlanRatePropertyKey]
    var value: js.UndefOr[JsonSafeFilterValueString]
  }

  @js.native
  sealed trait SavingsPlanRatePropertyKey extends js.Any
  object SavingsPlanRatePropertyKey extends js.Object {
    val region             = "region".asInstanceOf[SavingsPlanRatePropertyKey]
    val instanceType       = "instanceType".asInstanceOf[SavingsPlanRatePropertyKey]
    val instanceFamily     = "instanceFamily".asInstanceOf[SavingsPlanRatePropertyKey]
    val productDescription = "productDescription".asInstanceOf[SavingsPlanRatePropertyKey]
    val tenancy            = "tenancy".asInstanceOf[SavingsPlanRatePropertyKey]

    val values = js.Object.freeze(js.Array(region, instanceType, instanceFamily, productDescription, tenancy))
  }

  @js.native
  sealed trait SavingsPlanRateServiceCode extends js.Any
  object SavingsPlanRateServiceCode extends js.Object {
    val AmazonEC2 = "AmazonEC2".asInstanceOf[SavingsPlanRateServiceCode]
    val AmazonECS = "AmazonECS".asInstanceOf[SavingsPlanRateServiceCode]
    val AWSLambda = "AWSLambda".asInstanceOf[SavingsPlanRateServiceCode]

    val values = js.Object.freeze(js.Array(AmazonEC2, AmazonECS, AWSLambda))
  }

  @js.native
  sealed trait SavingsPlanRateUnit extends js.Any
  object SavingsPlanRateUnit extends js.Object {
    val Hrs                = "Hrs".asInstanceOf[SavingsPlanRateUnit]
    val `Lambda-GB-Second` = "Lambda-GB-Second".asInstanceOf[SavingsPlanRateUnit]
    val Request            = "Request".asInstanceOf[SavingsPlanRateUnit]

    val values = js.Object.freeze(js.Array(Hrs, `Lambda-GB-Second`, Request))
  }

  @js.native
  sealed trait SavingsPlanState extends js.Any
  object SavingsPlanState extends js.Object {
    val `payment-pending` = "payment-pending".asInstanceOf[SavingsPlanState]
    val `payment-failed`  = "payment-failed".asInstanceOf[SavingsPlanState]
    val active            = "active".asInstanceOf[SavingsPlanState]
    val retired           = "retired".asInstanceOf[SavingsPlanState]

    val values = js.Object.freeze(js.Array(`payment-pending`, `payment-failed`, active, retired))
  }

  @js.native
  sealed trait SavingsPlanType extends js.Any
  object SavingsPlanType extends js.Object {
    val Compute     = "Compute".asInstanceOf[SavingsPlanType]
    val EC2Instance = "EC2Instance".asInstanceOf[SavingsPlanType]

    val values = js.Object.freeze(js.Array(Compute, EC2Instance))
  }

  @js.native
  sealed trait SavingsPlansFilterName extends js.Any
  object SavingsPlansFilterName extends js.Object {
    val region                = "region".asInstanceOf[SavingsPlansFilterName]
    val `ec2-instance-family` = "ec2-instance-family".asInstanceOf[SavingsPlansFilterName]
    val commitment            = "commitment".asInstanceOf[SavingsPlansFilterName]
    val upfront               = "upfront".asInstanceOf[SavingsPlansFilterName]
    val term                  = "term".asInstanceOf[SavingsPlansFilterName]
    val `savings-plan-type`   = "savings-plan-type".asInstanceOf[SavingsPlansFilterName]
    val `payment-option`      = "payment-option".asInstanceOf[SavingsPlansFilterName]
    val start                 = "start".asInstanceOf[SavingsPlansFilterName]
    val end                   = "end".asInstanceOf[SavingsPlansFilterName]

    val values = js.Object.freeze(
      js.Array(
        region,
        `ec2-instance-family`,
        commitment,
        upfront,
        term,
        `savings-plan-type`,
        `payment-option`,
        start,
        end
      )
    )
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var resourceArn: SavingsPlanArn
    var tags: TagMap
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var resourceArn: SavingsPlanArn
    var tagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}
}
