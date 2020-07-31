package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object savingsplans {
  type Amount = String
  type ClientToken = String
  type CurrencyList = js.Array[CurrencyCode]
  type DurationsList = js.Array[SavingsPlansDuration]
  type EC2InstanceFamily = String
  type FilterValuesList = js.Array[JsonSafeFilterValueString]
  type JsonSafeFilterValueString = String
  type ListOfStrings = js.Array[String]
  type MaxResults = Int
  type PageSize = Int
  type PaginationToken = String
  type Region = String
  type SavingsPlanArn = String
  type SavingsPlanArnList = js.Array[SavingsPlanArn]
  type SavingsPlanDescription = String
  type SavingsPlanDescriptionsList = js.Array[SavingsPlanDescription]
  type SavingsPlanFilterList = js.Array[SavingsPlanFilter]
  type SavingsPlanId = String
  type SavingsPlanIdList = js.Array[SavingsPlanId]
  type SavingsPlanList = js.Array[SavingsPlan]
  type SavingsPlanOfferingFiltersList = js.Array[SavingsPlanOfferingFilterElement]
  type SavingsPlanOfferingId = String
  type SavingsPlanOfferingPropertyList = js.Array[SavingsPlanOfferingProperty]
  type SavingsPlanOfferingRateFiltersList = js.Array[SavingsPlanOfferingRateFilterElement]
  type SavingsPlanOfferingRatePropertyList = js.Array[SavingsPlanOfferingRateProperty]
  type SavingsPlanOfferingRatesList = js.Array[SavingsPlanOfferingRate]
  type SavingsPlanOfferingsList = js.Array[SavingsPlanOffering]
  type SavingsPlanOperation = String
  type SavingsPlanOperationList = js.Array[SavingsPlanOperation]
  type SavingsPlanPaymentOptionList = js.Array[SavingsPlanPaymentOption]
  type SavingsPlanProductTypeList = js.Array[SavingsPlanProductType]
  type SavingsPlanRateFilterList = js.Array[SavingsPlanRateFilter]
  type SavingsPlanRateList = js.Array[SavingsPlanRate]
  type SavingsPlanRateOperation = String
  type SavingsPlanRateOperationList = js.Array[SavingsPlanRateOperation]
  type SavingsPlanRatePricePerUnit = String
  type SavingsPlanRatePropertyList = js.Array[SavingsPlanRateProperty]
  type SavingsPlanRateServiceCodeList = js.Array[SavingsPlanRateServiceCode]
  type SavingsPlanRateUsageType = String
  type SavingsPlanRateUsageTypeList = js.Array[SavingsPlanRateUsageType]
  type SavingsPlanServiceCode = String
  type SavingsPlanServiceCodeList = js.Array[SavingsPlanServiceCode]
  type SavingsPlanStateList = js.Array[SavingsPlanState]
  type SavingsPlanTypeList = js.Array[SavingsPlanType]
  type SavingsPlanUsageType = String
  type SavingsPlanUsageTypeList = js.Array[SavingsPlanUsageType]
  type SavingsPlansDuration = Double
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type TermDurationInSeconds = Double
  type UUID = String
  type UUIDs = js.Array[UUID]

  implicit final class SavingsPlansOps(private val service: SavingsPlans) extends AnyVal {

    @inline def createSavingsPlanFuture(params: CreateSavingsPlanRequest): Future[CreateSavingsPlanResponse] = service.createSavingsPlan(params).promise().toFuture
    @inline def describeSavingsPlanRatesFuture(params: DescribeSavingsPlanRatesRequest): Future[DescribeSavingsPlanRatesResponse] = service.describeSavingsPlanRates(params).promise().toFuture
    @inline def describeSavingsPlansFuture(params: DescribeSavingsPlansRequest): Future[DescribeSavingsPlansResponse] = service.describeSavingsPlans(params).promise().toFuture
    @inline def describeSavingsPlansOfferingRatesFuture(params: DescribeSavingsPlansOfferingRatesRequest): Future[DescribeSavingsPlansOfferingRatesResponse] = service.describeSavingsPlansOfferingRates(params).promise().toFuture
    @inline def describeSavingsPlansOfferingsFuture(params: DescribeSavingsPlansOfferingsRequest): Future[DescribeSavingsPlansOfferingsResponse] = service.describeSavingsPlansOfferings(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
  }
}

package savingsplans {
  @js.native
  @JSImport("aws-sdk", "SavingsPlans", "AWS.SavingsPlans")
  class SavingsPlans() extends js.Object {
    def this(config: AWSConfig) = this()

    def createSavingsPlan(params: CreateSavingsPlanRequest): Request[CreateSavingsPlanResponse] = js.native
    def describeSavingsPlanRates(params: DescribeSavingsPlanRatesRequest): Request[DescribeSavingsPlanRatesResponse] = js.native
    def describeSavingsPlans(params: DescribeSavingsPlansRequest): Request[DescribeSavingsPlansResponse] = js.native
    def describeSavingsPlansOfferingRates(params: DescribeSavingsPlansOfferingRatesRequest): Request[DescribeSavingsPlansOfferingRatesResponse] = js.native
    def describeSavingsPlansOfferings(params: DescribeSavingsPlansOfferingsRequest): Request[DescribeSavingsPlansOfferingsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
  }

  @js.native
  trait CreateSavingsPlanRequest extends js.Object {
    var commitment: Amount
    var savingsPlanOfferingId: SavingsPlanOfferingId
    var clientToken: js.UndefOr[ClientToken]
    var tags: js.UndefOr[TagMap]
    var upfrontPaymentAmount: js.UndefOr[Amount]
  }

  object CreateSavingsPlanRequest {
    @inline
    def apply(
        commitment: Amount,
        savingsPlanOfferingId: SavingsPlanOfferingId,
        clientToken: js.UndefOr[ClientToken] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        upfrontPaymentAmount: js.UndefOr[Amount] = js.undefined
    ): CreateSavingsPlanRequest = {
      val __obj = js.Dynamic.literal(
        "commitment" -> commitment.asInstanceOf[js.Any],
        "savingsPlanOfferingId" -> savingsPlanOfferingId.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      upfrontPaymentAmount.foreach(__v => __obj.updateDynamic("upfrontPaymentAmount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSavingsPlanRequest]
    }
  }

  @js.native
  trait CreateSavingsPlanResponse extends js.Object {
    var savingsPlanId: js.UndefOr[SavingsPlanId]
  }

  object CreateSavingsPlanResponse {
    @inline
    def apply(
        savingsPlanId: js.UndefOr[SavingsPlanId] = js.undefined
    ): CreateSavingsPlanResponse = {
      val __obj = js.Dynamic.literal()
      savingsPlanId.foreach(__v => __obj.updateDynamic("savingsPlanId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSavingsPlanResponse]
    }
  }

  @js.native
  sealed trait CurrencyCode extends js.Any
  object CurrencyCode {
    @inline def CNY = "CNY".asInstanceOf[CurrencyCode]
    @inline def USD = "USD".asInstanceOf[CurrencyCode]

    @inline def values = js.Object.freeze(js.Array(CNY, USD))
  }

  @js.native
  trait DescribeSavingsPlanRatesRequest extends js.Object {
    var savingsPlanId: SavingsPlanId
    var filters: js.UndefOr[SavingsPlanRateFilterList]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object DescribeSavingsPlanRatesRequest {
    @inline
    def apply(
        savingsPlanId: SavingsPlanId,
        filters: js.UndefOr[SavingsPlanRateFilterList] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): DescribeSavingsPlanRatesRequest = {
      val __obj = js.Dynamic.literal(
        "savingsPlanId" -> savingsPlanId.asInstanceOf[js.Any]
      )

      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSavingsPlanRatesRequest]
    }
  }

  @js.native
  trait DescribeSavingsPlanRatesResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var savingsPlanId: js.UndefOr[SavingsPlanId]
    var searchResults: js.UndefOr[SavingsPlanRateList]
  }

  object DescribeSavingsPlanRatesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        savingsPlanId: js.UndefOr[SavingsPlanId] = js.undefined,
        searchResults: js.UndefOr[SavingsPlanRateList] = js.undefined
    ): DescribeSavingsPlanRatesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      savingsPlanId.foreach(__v => __obj.updateDynamic("savingsPlanId")(__v.asInstanceOf[js.Any]))
      searchResults.foreach(__v => __obj.updateDynamic("searchResults")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSavingsPlanRatesResponse]
    }
  }

  @js.native
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

  object DescribeSavingsPlansOfferingRatesRequest {
    @inline
    def apply(
        filters: js.UndefOr[SavingsPlanOfferingRateFiltersList] = js.undefined,
        maxResults: js.UndefOr[PageSize] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        operations: js.UndefOr[SavingsPlanRateOperationList] = js.undefined,
        products: js.UndefOr[SavingsPlanProductTypeList] = js.undefined,
        savingsPlanOfferingIds: js.UndefOr[UUIDs] = js.undefined,
        savingsPlanPaymentOptions: js.UndefOr[SavingsPlanPaymentOptionList] = js.undefined,
        savingsPlanTypes: js.UndefOr[SavingsPlanTypeList] = js.undefined,
        serviceCodes: js.UndefOr[SavingsPlanRateServiceCodeList] = js.undefined,
        usageTypes: js.UndefOr[SavingsPlanRateUsageTypeList] = js.undefined
    ): DescribeSavingsPlansOfferingRatesRequest = {
      val __obj = js.Dynamic.literal()
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      products.foreach(__v => __obj.updateDynamic("products")(__v.asInstanceOf[js.Any]))
      savingsPlanOfferingIds.foreach(__v => __obj.updateDynamic("savingsPlanOfferingIds")(__v.asInstanceOf[js.Any]))
      savingsPlanPaymentOptions.foreach(__v => __obj.updateDynamic("savingsPlanPaymentOptions")(__v.asInstanceOf[js.Any]))
      savingsPlanTypes.foreach(__v => __obj.updateDynamic("savingsPlanTypes")(__v.asInstanceOf[js.Any]))
      serviceCodes.foreach(__v => __obj.updateDynamic("serviceCodes")(__v.asInstanceOf[js.Any]))
      usageTypes.foreach(__v => __obj.updateDynamic("usageTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSavingsPlansOfferingRatesRequest]
    }
  }

  @js.native
  trait DescribeSavingsPlansOfferingRatesResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var searchResults: js.UndefOr[SavingsPlanOfferingRatesList]
  }

  object DescribeSavingsPlansOfferingRatesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        searchResults: js.UndefOr[SavingsPlanOfferingRatesList] = js.undefined
    ): DescribeSavingsPlansOfferingRatesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      searchResults.foreach(__v => __obj.updateDynamic("searchResults")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSavingsPlansOfferingRatesResponse]
    }
  }

  @js.native
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

  object DescribeSavingsPlansOfferingsRequest {
    @inline
    def apply(
        currencies: js.UndefOr[CurrencyList] = js.undefined,
        descriptions: js.UndefOr[SavingsPlanDescriptionsList] = js.undefined,
        durations: js.UndefOr[DurationsList] = js.undefined,
        filters: js.UndefOr[SavingsPlanOfferingFiltersList] = js.undefined,
        maxResults: js.UndefOr[PageSize] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        offeringIds: js.UndefOr[UUIDs] = js.undefined,
        operations: js.UndefOr[SavingsPlanOperationList] = js.undefined,
        paymentOptions: js.UndefOr[SavingsPlanPaymentOptionList] = js.undefined,
        planTypes: js.UndefOr[SavingsPlanTypeList] = js.undefined,
        productType: js.UndefOr[SavingsPlanProductType] = js.undefined,
        serviceCodes: js.UndefOr[SavingsPlanServiceCodeList] = js.undefined,
        usageTypes: js.UndefOr[SavingsPlanUsageTypeList] = js.undefined
    ): DescribeSavingsPlansOfferingsRequest = {
      val __obj = js.Dynamic.literal()
      currencies.foreach(__v => __obj.updateDynamic("currencies")(__v.asInstanceOf[js.Any]))
      descriptions.foreach(__v => __obj.updateDynamic("descriptions")(__v.asInstanceOf[js.Any]))
      durations.foreach(__v => __obj.updateDynamic("durations")(__v.asInstanceOf[js.Any]))
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      offeringIds.foreach(__v => __obj.updateDynamic("offeringIds")(__v.asInstanceOf[js.Any]))
      operations.foreach(__v => __obj.updateDynamic("operations")(__v.asInstanceOf[js.Any]))
      paymentOptions.foreach(__v => __obj.updateDynamic("paymentOptions")(__v.asInstanceOf[js.Any]))
      planTypes.foreach(__v => __obj.updateDynamic("planTypes")(__v.asInstanceOf[js.Any]))
      productType.foreach(__v => __obj.updateDynamic("productType")(__v.asInstanceOf[js.Any]))
      serviceCodes.foreach(__v => __obj.updateDynamic("serviceCodes")(__v.asInstanceOf[js.Any]))
      usageTypes.foreach(__v => __obj.updateDynamic("usageTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSavingsPlansOfferingsRequest]
    }
  }

  @js.native
  trait DescribeSavingsPlansOfferingsResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var searchResults: js.UndefOr[SavingsPlanOfferingsList]
  }

  object DescribeSavingsPlansOfferingsResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        searchResults: js.UndefOr[SavingsPlanOfferingsList] = js.undefined
    ): DescribeSavingsPlansOfferingsResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      searchResults.foreach(__v => __obj.updateDynamic("searchResults")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSavingsPlansOfferingsResponse]
    }
  }

  @js.native
  trait DescribeSavingsPlansRequest extends js.Object {
    var filters: js.UndefOr[SavingsPlanFilterList]
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
    var savingsPlanArns: js.UndefOr[SavingsPlanArnList]
    var savingsPlanIds: js.UndefOr[SavingsPlanIdList]
    var states: js.UndefOr[SavingsPlanStateList]
  }

  object DescribeSavingsPlansRequest {
    @inline
    def apply(
        filters: js.UndefOr[SavingsPlanFilterList] = js.undefined,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        savingsPlanArns: js.UndefOr[SavingsPlanArnList] = js.undefined,
        savingsPlanIds: js.UndefOr[SavingsPlanIdList] = js.undefined,
        states: js.UndefOr[SavingsPlanStateList] = js.undefined
    ): DescribeSavingsPlansRequest = {
      val __obj = js.Dynamic.literal()
      filters.foreach(__v => __obj.updateDynamic("filters")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      savingsPlanArns.foreach(__v => __obj.updateDynamic("savingsPlanArns")(__v.asInstanceOf[js.Any]))
      savingsPlanIds.foreach(__v => __obj.updateDynamic("savingsPlanIds")(__v.asInstanceOf[js.Any]))
      states.foreach(__v => __obj.updateDynamic("states")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSavingsPlansRequest]
    }
  }

  @js.native
  trait DescribeSavingsPlansResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var savingsPlans: js.UndefOr[SavingsPlanList]
  }

  object DescribeSavingsPlansResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        savingsPlans: js.UndefOr[SavingsPlanList] = js.undefined
    ): DescribeSavingsPlansResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      savingsPlans.foreach(__v => __obj.updateDynamic("savingsPlans")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSavingsPlansResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: SavingsPlanArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: SavingsPlanArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /**
    * Information about a Savings Plan offering.
    */
  @js.native
  trait ParentSavingsPlanOffering extends js.Object {
    var currency: js.UndefOr[CurrencyCode]
    var durationSeconds: js.UndefOr[SavingsPlansDuration]
    var offeringId: js.UndefOr[UUID]
    var paymentOption: js.UndefOr[SavingsPlanPaymentOption]
    var planDescription: js.UndefOr[SavingsPlanDescription]
    var planType: js.UndefOr[SavingsPlanType]
  }

  object ParentSavingsPlanOffering {
    @inline
    def apply(
        currency: js.UndefOr[CurrencyCode] = js.undefined,
        durationSeconds: js.UndefOr[SavingsPlansDuration] = js.undefined,
        offeringId: js.UndefOr[UUID] = js.undefined,
        paymentOption: js.UndefOr[SavingsPlanPaymentOption] = js.undefined,
        planDescription: js.UndefOr[SavingsPlanDescription] = js.undefined,
        planType: js.UndefOr[SavingsPlanType] = js.undefined
    ): ParentSavingsPlanOffering = {
      val __obj = js.Dynamic.literal()
      currency.foreach(__v => __obj.updateDynamic("currency")(__v.asInstanceOf[js.Any]))
      durationSeconds.foreach(__v => __obj.updateDynamic("durationSeconds")(__v.asInstanceOf[js.Any]))
      offeringId.foreach(__v => __obj.updateDynamic("offeringId")(__v.asInstanceOf[js.Any]))
      paymentOption.foreach(__v => __obj.updateDynamic("paymentOption")(__v.asInstanceOf[js.Any]))
      planDescription.foreach(__v => __obj.updateDynamic("planDescription")(__v.asInstanceOf[js.Any]))
      planType.foreach(__v => __obj.updateDynamic("planType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParentSavingsPlanOffering]
    }
  }

  /**
    * Information about a Savings Plan.
    */
  @js.native
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

  object SavingsPlan {
    @inline
    def apply(
        commitment: js.UndefOr[Amount] = js.undefined,
        currency: js.UndefOr[CurrencyCode] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        ec2InstanceFamily: js.UndefOr[EC2InstanceFamily] = js.undefined,
        end: js.UndefOr[String] = js.undefined,
        offeringId: js.UndefOr[SavingsPlanOfferingId] = js.undefined,
        paymentOption: js.UndefOr[SavingsPlanPaymentOption] = js.undefined,
        productTypes: js.UndefOr[SavingsPlanProductTypeList] = js.undefined,
        recurringPaymentAmount: js.UndefOr[Amount] = js.undefined,
        region: js.UndefOr[Region] = js.undefined,
        savingsPlanArn: js.UndefOr[SavingsPlanArn] = js.undefined,
        savingsPlanId: js.UndefOr[SavingsPlanId] = js.undefined,
        savingsPlanType: js.UndefOr[SavingsPlanType] = js.undefined,
        start: js.UndefOr[String] = js.undefined,
        state: js.UndefOr[SavingsPlanState] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        termDurationInSeconds: js.UndefOr[TermDurationInSeconds] = js.undefined,
        upfrontPaymentAmount: js.UndefOr[Amount] = js.undefined
    ): SavingsPlan = {
      val __obj = js.Dynamic.literal()
      commitment.foreach(__v => __obj.updateDynamic("commitment")(__v.asInstanceOf[js.Any]))
      currency.foreach(__v => __obj.updateDynamic("currency")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      ec2InstanceFamily.foreach(__v => __obj.updateDynamic("ec2InstanceFamily")(__v.asInstanceOf[js.Any]))
      end.foreach(__v => __obj.updateDynamic("end")(__v.asInstanceOf[js.Any]))
      offeringId.foreach(__v => __obj.updateDynamic("offeringId")(__v.asInstanceOf[js.Any]))
      paymentOption.foreach(__v => __obj.updateDynamic("paymentOption")(__v.asInstanceOf[js.Any]))
      productTypes.foreach(__v => __obj.updateDynamic("productTypes")(__v.asInstanceOf[js.Any]))
      recurringPaymentAmount.foreach(__v => __obj.updateDynamic("recurringPaymentAmount")(__v.asInstanceOf[js.Any]))
      region.foreach(__v => __obj.updateDynamic("region")(__v.asInstanceOf[js.Any]))
      savingsPlanArn.foreach(__v => __obj.updateDynamic("savingsPlanArn")(__v.asInstanceOf[js.Any]))
      savingsPlanId.foreach(__v => __obj.updateDynamic("savingsPlanId")(__v.asInstanceOf[js.Any]))
      savingsPlanType.foreach(__v => __obj.updateDynamic("savingsPlanType")(__v.asInstanceOf[js.Any]))
      start.foreach(__v => __obj.updateDynamic("start")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      termDurationInSeconds.foreach(__v => __obj.updateDynamic("termDurationInSeconds")(__v.asInstanceOf[js.Any]))
      upfrontPaymentAmount.foreach(__v => __obj.updateDynamic("upfrontPaymentAmount")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SavingsPlan]
    }
  }

  /**
    * Information about a filter.
    */
  @js.native
  trait SavingsPlanFilter extends js.Object {
    var name: js.UndefOr[SavingsPlansFilterName]
    var values: js.UndefOr[ListOfStrings]
  }

  object SavingsPlanFilter {
    @inline
    def apply(
        name: js.UndefOr[SavingsPlansFilterName] = js.undefined,
        values: js.UndefOr[ListOfStrings] = js.undefined
    ): SavingsPlanFilter = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      values.foreach(__v => __obj.updateDynamic("values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SavingsPlanFilter]
    }
  }

  /**
    * Information about a Savings Plan offering.
    */
  @js.native
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

  object SavingsPlanOffering {
    @inline
    def apply(
        currency: js.UndefOr[CurrencyCode] = js.undefined,
        description: js.UndefOr[SavingsPlanDescription] = js.undefined,
        durationSeconds: js.UndefOr[SavingsPlansDuration] = js.undefined,
        offeringId: js.UndefOr[UUID] = js.undefined,
        operation: js.UndefOr[SavingsPlanOperation] = js.undefined,
        paymentOption: js.UndefOr[SavingsPlanPaymentOption] = js.undefined,
        planType: js.UndefOr[SavingsPlanType] = js.undefined,
        productTypes: js.UndefOr[SavingsPlanProductTypeList] = js.undefined,
        properties: js.UndefOr[SavingsPlanOfferingPropertyList] = js.undefined,
        serviceCode: js.UndefOr[SavingsPlanServiceCode] = js.undefined,
        usageType: js.UndefOr[SavingsPlanUsageType] = js.undefined
    ): SavingsPlanOffering = {
      val __obj = js.Dynamic.literal()
      currency.foreach(__v => __obj.updateDynamic("currency")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      durationSeconds.foreach(__v => __obj.updateDynamic("durationSeconds")(__v.asInstanceOf[js.Any]))
      offeringId.foreach(__v => __obj.updateDynamic("offeringId")(__v.asInstanceOf[js.Any]))
      operation.foreach(__v => __obj.updateDynamic("operation")(__v.asInstanceOf[js.Any]))
      paymentOption.foreach(__v => __obj.updateDynamic("paymentOption")(__v.asInstanceOf[js.Any]))
      planType.foreach(__v => __obj.updateDynamic("planType")(__v.asInstanceOf[js.Any]))
      productTypes.foreach(__v => __obj.updateDynamic("productTypes")(__v.asInstanceOf[js.Any]))
      properties.foreach(__v => __obj.updateDynamic("properties")(__v.asInstanceOf[js.Any]))
      serviceCode.foreach(__v => __obj.updateDynamic("serviceCode")(__v.asInstanceOf[js.Any]))
      usageType.foreach(__v => __obj.updateDynamic("usageType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SavingsPlanOffering]
    }
  }

  @js.native
  sealed trait SavingsPlanOfferingFilterAttribute extends js.Any
  object SavingsPlanOfferingFilterAttribute {
    @inline def region = "region".asInstanceOf[SavingsPlanOfferingFilterAttribute]
    @inline def instanceFamily = "instanceFamily".asInstanceOf[SavingsPlanOfferingFilterAttribute]

    @inline def values = js.Object.freeze(js.Array(region, instanceFamily))
  }

  /**
    * Information about a filter.
    */
  @js.native
  trait SavingsPlanOfferingFilterElement extends js.Object {
    var name: js.UndefOr[SavingsPlanOfferingFilterAttribute]
    var values: js.UndefOr[FilterValuesList]
  }

  object SavingsPlanOfferingFilterElement {
    @inline
    def apply(
        name: js.UndefOr[SavingsPlanOfferingFilterAttribute] = js.undefined,
        values: js.UndefOr[FilterValuesList] = js.undefined
    ): SavingsPlanOfferingFilterElement = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      values.foreach(__v => __obj.updateDynamic("values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SavingsPlanOfferingFilterElement]
    }
  }

  /**
    * Information about a property.
    */
  @js.native
  trait SavingsPlanOfferingProperty extends js.Object {
    var name: js.UndefOr[SavingsPlanOfferingPropertyKey]
    var value: js.UndefOr[JsonSafeFilterValueString]
  }

  object SavingsPlanOfferingProperty {
    @inline
    def apply(
        name: js.UndefOr[SavingsPlanOfferingPropertyKey] = js.undefined,
        value: js.UndefOr[JsonSafeFilterValueString] = js.undefined
    ): SavingsPlanOfferingProperty = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SavingsPlanOfferingProperty]
    }
  }

  @js.native
  sealed trait SavingsPlanOfferingPropertyKey extends js.Any
  object SavingsPlanOfferingPropertyKey {
    @inline def region = "region".asInstanceOf[SavingsPlanOfferingPropertyKey]
    @inline def instanceFamily = "instanceFamily".asInstanceOf[SavingsPlanOfferingPropertyKey]

    @inline def values = js.Object.freeze(js.Array(region, instanceFamily))
  }

  /**
    * Information about a Savings Plan offering rate.
    */
  @js.native
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

  object SavingsPlanOfferingRate {
    @inline
    def apply(
        operation: js.UndefOr[SavingsPlanRateOperation] = js.undefined,
        productType: js.UndefOr[SavingsPlanProductType] = js.undefined,
        properties: js.UndefOr[SavingsPlanOfferingRatePropertyList] = js.undefined,
        rate: js.UndefOr[SavingsPlanRatePricePerUnit] = js.undefined,
        savingsPlanOffering: js.UndefOr[ParentSavingsPlanOffering] = js.undefined,
        serviceCode: js.UndefOr[SavingsPlanRateServiceCode] = js.undefined,
        unit: js.UndefOr[SavingsPlanRateUnit] = js.undefined,
        usageType: js.UndefOr[SavingsPlanRateUsageType] = js.undefined
    ): SavingsPlanOfferingRate = {
      val __obj = js.Dynamic.literal()
      operation.foreach(__v => __obj.updateDynamic("operation")(__v.asInstanceOf[js.Any]))
      productType.foreach(__v => __obj.updateDynamic("productType")(__v.asInstanceOf[js.Any]))
      properties.foreach(__v => __obj.updateDynamic("properties")(__v.asInstanceOf[js.Any]))
      rate.foreach(__v => __obj.updateDynamic("rate")(__v.asInstanceOf[js.Any]))
      savingsPlanOffering.foreach(__v => __obj.updateDynamic("savingsPlanOffering")(__v.asInstanceOf[js.Any]))
      serviceCode.foreach(__v => __obj.updateDynamic("serviceCode")(__v.asInstanceOf[js.Any]))
      unit.foreach(__v => __obj.updateDynamic("unit")(__v.asInstanceOf[js.Any]))
      usageType.foreach(__v => __obj.updateDynamic("usageType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SavingsPlanOfferingRate]
    }
  }

  /**
    * Information about a filter.
    */
  @js.native
  trait SavingsPlanOfferingRateFilterElement extends js.Object {
    var name: js.UndefOr[SavingsPlanRateFilterAttribute]
    var values: js.UndefOr[FilterValuesList]
  }

  object SavingsPlanOfferingRateFilterElement {
    @inline
    def apply(
        name: js.UndefOr[SavingsPlanRateFilterAttribute] = js.undefined,
        values: js.UndefOr[FilterValuesList] = js.undefined
    ): SavingsPlanOfferingRateFilterElement = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      values.foreach(__v => __obj.updateDynamic("values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SavingsPlanOfferingRateFilterElement]
    }
  }

  /**
    * Information about a property.
    */
  @js.native
  trait SavingsPlanOfferingRateProperty extends js.Object {
    var name: js.UndefOr[JsonSafeFilterValueString]
    var value: js.UndefOr[JsonSafeFilterValueString]
  }

  object SavingsPlanOfferingRateProperty {
    @inline
    def apply(
        name: js.UndefOr[JsonSafeFilterValueString] = js.undefined,
        value: js.UndefOr[JsonSafeFilterValueString] = js.undefined
    ): SavingsPlanOfferingRateProperty = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SavingsPlanOfferingRateProperty]
    }
  }

  @js.native
  sealed trait SavingsPlanPaymentOption extends js.Any
  object SavingsPlanPaymentOption {
    @inline def `All Upfront` = "All Upfront".asInstanceOf[SavingsPlanPaymentOption]
    @inline def `Partial Upfront` = "Partial Upfront".asInstanceOf[SavingsPlanPaymentOption]
    @inline def `No Upfront` = "No Upfront".asInstanceOf[SavingsPlanPaymentOption]

    @inline def values = js.Object.freeze(js.Array(`All Upfront`, `Partial Upfront`, `No Upfront`))
  }

  @js.native
  sealed trait SavingsPlanProductType extends js.Any
  object SavingsPlanProductType {
    @inline def EC2 = "EC2".asInstanceOf[SavingsPlanProductType]
    @inline def Fargate = "Fargate".asInstanceOf[SavingsPlanProductType]
    @inline def Lambda = "Lambda".asInstanceOf[SavingsPlanProductType]

    @inline def values = js.Object.freeze(js.Array(EC2, Fargate, Lambda))
  }

  /**
    * Information about a Savings Plan rate.
    */
  @js.native
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

  object SavingsPlanRate {
    @inline
    def apply(
        currency: js.UndefOr[CurrencyCode] = js.undefined,
        operation: js.UndefOr[SavingsPlanRateOperation] = js.undefined,
        productType: js.UndefOr[SavingsPlanProductType] = js.undefined,
        properties: js.UndefOr[SavingsPlanRatePropertyList] = js.undefined,
        rate: js.UndefOr[Amount] = js.undefined,
        serviceCode: js.UndefOr[SavingsPlanRateServiceCode] = js.undefined,
        unit: js.UndefOr[SavingsPlanRateUnit] = js.undefined,
        usageType: js.UndefOr[SavingsPlanRateUsageType] = js.undefined
    ): SavingsPlanRate = {
      val __obj = js.Dynamic.literal()
      currency.foreach(__v => __obj.updateDynamic("currency")(__v.asInstanceOf[js.Any]))
      operation.foreach(__v => __obj.updateDynamic("operation")(__v.asInstanceOf[js.Any]))
      productType.foreach(__v => __obj.updateDynamic("productType")(__v.asInstanceOf[js.Any]))
      properties.foreach(__v => __obj.updateDynamic("properties")(__v.asInstanceOf[js.Any]))
      rate.foreach(__v => __obj.updateDynamic("rate")(__v.asInstanceOf[js.Any]))
      serviceCode.foreach(__v => __obj.updateDynamic("serviceCode")(__v.asInstanceOf[js.Any]))
      unit.foreach(__v => __obj.updateDynamic("unit")(__v.asInstanceOf[js.Any]))
      usageType.foreach(__v => __obj.updateDynamic("usageType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SavingsPlanRate]
    }
  }

  /**
    * Information about a filter.
    */
  @js.native
  trait SavingsPlanRateFilter extends js.Object {
    var name: js.UndefOr[SavingsPlanRateFilterName]
    var values: js.UndefOr[ListOfStrings]
  }

  object SavingsPlanRateFilter {
    @inline
    def apply(
        name: js.UndefOr[SavingsPlanRateFilterName] = js.undefined,
        values: js.UndefOr[ListOfStrings] = js.undefined
    ): SavingsPlanRateFilter = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      values.foreach(__v => __obj.updateDynamic("values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SavingsPlanRateFilter]
    }
  }

  @js.native
  sealed trait SavingsPlanRateFilterAttribute extends js.Any
  object SavingsPlanRateFilterAttribute {
    @inline def region = "region".asInstanceOf[SavingsPlanRateFilterAttribute]
    @inline def instanceFamily = "instanceFamily".asInstanceOf[SavingsPlanRateFilterAttribute]
    @inline def instanceType = "instanceType".asInstanceOf[SavingsPlanRateFilterAttribute]
    @inline def productDescription = "productDescription".asInstanceOf[SavingsPlanRateFilterAttribute]
    @inline def tenancy = "tenancy".asInstanceOf[SavingsPlanRateFilterAttribute]
    @inline def productId = "productId".asInstanceOf[SavingsPlanRateFilterAttribute]

    @inline def values = js.Object.freeze(js.Array(region, instanceFamily, instanceType, productDescription, tenancy, productId))
  }

  @js.native
  sealed trait SavingsPlanRateFilterName extends js.Any
  object SavingsPlanRateFilterName {
    @inline def region = "region".asInstanceOf[SavingsPlanRateFilterName]
    @inline def instanceType = "instanceType".asInstanceOf[SavingsPlanRateFilterName]
    @inline def productDescription = "productDescription".asInstanceOf[SavingsPlanRateFilterName]
    @inline def tenancy = "tenancy".asInstanceOf[SavingsPlanRateFilterName]
    @inline def productType = "productType".asInstanceOf[SavingsPlanRateFilterName]
    @inline def serviceCode = "serviceCode".asInstanceOf[SavingsPlanRateFilterName]
    @inline def usageType = "usageType".asInstanceOf[SavingsPlanRateFilterName]
    @inline def operation = "operation".asInstanceOf[SavingsPlanRateFilterName]

    @inline def values = js.Object.freeze(js.Array(region, instanceType, productDescription, tenancy, productType, serviceCode, usageType, operation))
  }

  /**
    * Information about a property.
    */
  @js.native
  trait SavingsPlanRateProperty extends js.Object {
    var name: js.UndefOr[SavingsPlanRatePropertyKey]
    var value: js.UndefOr[JsonSafeFilterValueString]
  }

  object SavingsPlanRateProperty {
    @inline
    def apply(
        name: js.UndefOr[SavingsPlanRatePropertyKey] = js.undefined,
        value: js.UndefOr[JsonSafeFilterValueString] = js.undefined
    ): SavingsPlanRateProperty = {
      val __obj = js.Dynamic.literal()
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SavingsPlanRateProperty]
    }
  }

  @js.native
  sealed trait SavingsPlanRatePropertyKey extends js.Any
  object SavingsPlanRatePropertyKey {
    @inline def region = "region".asInstanceOf[SavingsPlanRatePropertyKey]
    @inline def instanceType = "instanceType".asInstanceOf[SavingsPlanRatePropertyKey]
    @inline def instanceFamily = "instanceFamily".asInstanceOf[SavingsPlanRatePropertyKey]
    @inline def productDescription = "productDescription".asInstanceOf[SavingsPlanRatePropertyKey]
    @inline def tenancy = "tenancy".asInstanceOf[SavingsPlanRatePropertyKey]

    @inline def values = js.Object.freeze(js.Array(region, instanceType, instanceFamily, productDescription, tenancy))
  }

  @js.native
  sealed trait SavingsPlanRateServiceCode extends js.Any
  object SavingsPlanRateServiceCode {
    @inline def AmazonEC2 = "AmazonEC2".asInstanceOf[SavingsPlanRateServiceCode]
    @inline def AmazonECS = "AmazonECS".asInstanceOf[SavingsPlanRateServiceCode]
    @inline def AWSLambda = "AWSLambda".asInstanceOf[SavingsPlanRateServiceCode]

    @inline def values = js.Object.freeze(js.Array(AmazonEC2, AmazonECS, AWSLambda))
  }

  @js.native
  sealed trait SavingsPlanRateUnit extends js.Any
  object SavingsPlanRateUnit {
    @inline def Hrs = "Hrs".asInstanceOf[SavingsPlanRateUnit]
    @inline def `Lambda-GB-Second` = "Lambda-GB-Second".asInstanceOf[SavingsPlanRateUnit]
    @inline def Request = "Request".asInstanceOf[SavingsPlanRateUnit]

    @inline def values = js.Object.freeze(js.Array(Hrs, `Lambda-GB-Second`, Request))
  }

  @js.native
  sealed trait SavingsPlanState extends js.Any
  object SavingsPlanState {
    @inline def `payment-pending` = "payment-pending".asInstanceOf[SavingsPlanState]
    @inline def `payment-failed` = "payment-failed".asInstanceOf[SavingsPlanState]
    @inline def active = "active".asInstanceOf[SavingsPlanState]
    @inline def retired = "retired".asInstanceOf[SavingsPlanState]

    @inline def values = js.Object.freeze(js.Array(`payment-pending`, `payment-failed`, active, retired))
  }

  @js.native
  sealed trait SavingsPlanType extends js.Any
  object SavingsPlanType {
    @inline def Compute = "Compute".asInstanceOf[SavingsPlanType]
    @inline def EC2Instance = "EC2Instance".asInstanceOf[SavingsPlanType]

    @inline def values = js.Object.freeze(js.Array(Compute, EC2Instance))
  }

  @js.native
  sealed trait SavingsPlansFilterName extends js.Any
  object SavingsPlansFilterName {
    @inline def region = "region".asInstanceOf[SavingsPlansFilterName]
    @inline def `ec2-instance-family` = "ec2-instance-family".asInstanceOf[SavingsPlansFilterName]
    @inline def commitment = "commitment".asInstanceOf[SavingsPlansFilterName]
    @inline def upfront = "upfront".asInstanceOf[SavingsPlansFilterName]
    @inline def term = "term".asInstanceOf[SavingsPlansFilterName]
    @inline def `savings-plan-type` = "savings-plan-type".asInstanceOf[SavingsPlansFilterName]
    @inline def `payment-option` = "payment-option".asInstanceOf[SavingsPlansFilterName]
    @inline def start = "start".asInstanceOf[SavingsPlansFilterName]
    @inline def end = "end".asInstanceOf[SavingsPlansFilterName]

    @inline def values = js.Object.freeze(js.Array(region, `ec2-instance-family`, commitment, upfront, term, `savings-plan-type`, `payment-option`, start, end))
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: SavingsPlanArn
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: SavingsPlanArn,
        tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    @inline
    def apply(
    ): TagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: SavingsPlanArn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: SavingsPlanArn,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    @inline
    def apply(
    ): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }
}
