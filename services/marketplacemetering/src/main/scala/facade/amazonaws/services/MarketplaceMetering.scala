package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object marketplacemetering {
  type AllocatedUsageQuantity = Int
  type CustomerIdentifier = String
  type NonEmptyString = String
  type Nonce = String
  type ProductCode = String
  type TagKey = String
  type TagList = js.Array[Tag]
  type TagValue = String
  type Timestamp = js.Date
  type UsageAllocations = js.Array[UsageAllocation]
  type UsageDimension = String
  type UsageQuantity = Int
  type UsageRecordList = js.Array[UsageRecord]
  type UsageRecordResultList = js.Array[UsageRecordResult]
  type VersionInteger = Int

  final class MarketplaceMeteringOps(private val service: MarketplaceMetering) extends AnyVal {

    @inline def batchMeterUsageFuture(params: BatchMeterUsageRequest): Future[BatchMeterUsageResult] = service.batchMeterUsage(params).promise().toFuture
    @inline def meterUsageFuture(params: MeterUsageRequest): Future[MeterUsageResult] = service.meterUsage(params).promise().toFuture
    @inline def registerUsageFuture(params: RegisterUsageRequest): Future[RegisterUsageResult] = service.registerUsage(params).promise().toFuture
    @inline def resolveCustomerFuture(params: ResolveCustomerRequest): Future[ResolveCustomerResult] = service.resolveCustomer(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/marketplacemetering", JSImport.Namespace, "AWS.MarketplaceMetering")
  class MarketplaceMetering() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchMeterUsage(params: BatchMeterUsageRequest): Request[BatchMeterUsageResult] = js.native
    def meterUsage(params: MeterUsageRequest): Request[MeterUsageResult] = js.native
    def registerUsage(params: RegisterUsageRequest): Request[RegisterUsageResult] = js.native
    def resolveCustomer(params: ResolveCustomerRequest): Request[ResolveCustomerResult] = js.native
  }
  object MarketplaceMetering {
    @inline implicit def toOps(service: MarketplaceMetering): MarketplaceMeteringOps = {
      new MarketplaceMeteringOps(service)
    }
  }

  /** A BatchMeterUsageRequest contains UsageRecords, which indicate quantities of usage within your application.
    */
  @js.native
  trait BatchMeterUsageRequest extends js.Object {
    var ProductCode: ProductCode
    var UsageRecords: UsageRecordList
  }

  object BatchMeterUsageRequest {
    @inline
    def apply(
        ProductCode: ProductCode,
        UsageRecords: UsageRecordList
    ): BatchMeterUsageRequest = {
      val __obj = js.Dynamic.literal(
        "ProductCode" -> ProductCode.asInstanceOf[js.Any],
        "UsageRecords" -> UsageRecords.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchMeterUsageRequest]
    }
  }

  /** Contains the UsageRecords processed by BatchMeterUsage and any records that have failed due to transient error.
    */
  @js.native
  trait BatchMeterUsageResult extends js.Object {
    var Results: js.UndefOr[UsageRecordResultList]
    var UnprocessedRecords: js.UndefOr[UsageRecordList]
  }

  object BatchMeterUsageResult {
    @inline
    def apply(
        Results: js.UndefOr[UsageRecordResultList] = js.undefined,
        UnprocessedRecords: js.UndefOr[UsageRecordList] = js.undefined
    ): BatchMeterUsageResult = {
      val __obj = js.Dynamic.literal()
      Results.foreach(__v => __obj.updateDynamic("Results")(__v.asInstanceOf[js.Any]))
      UnprocessedRecords.foreach(__v => __obj.updateDynamic("UnprocessedRecords")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchMeterUsageResult]
    }
  }

  @js.native
  trait MeterUsageRequest extends js.Object {
    var ProductCode: ProductCode
    var Timestamp: Timestamp
    var UsageDimension: UsageDimension
    var DryRun: js.UndefOr[Boolean]
    var UsageAllocations: js.UndefOr[UsageAllocations]
    var UsageQuantity: js.UndefOr[UsageQuantity]
  }

  object MeterUsageRequest {
    @inline
    def apply(
        ProductCode: ProductCode,
        Timestamp: Timestamp,
        UsageDimension: UsageDimension,
        DryRun: js.UndefOr[Boolean] = js.undefined,
        UsageAllocations: js.UndefOr[UsageAllocations] = js.undefined,
        UsageQuantity: js.UndefOr[UsageQuantity] = js.undefined
    ): MeterUsageRequest = {
      val __obj = js.Dynamic.literal(
        "ProductCode" -> ProductCode.asInstanceOf[js.Any],
        "Timestamp" -> Timestamp.asInstanceOf[js.Any],
        "UsageDimension" -> UsageDimension.asInstanceOf[js.Any]
      )

      DryRun.foreach(__v => __obj.updateDynamic("DryRun")(__v.asInstanceOf[js.Any]))
      UsageAllocations.foreach(__v => __obj.updateDynamic("UsageAllocations")(__v.asInstanceOf[js.Any]))
      UsageQuantity.foreach(__v => __obj.updateDynamic("UsageQuantity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MeterUsageRequest]
    }
  }

  @js.native
  trait MeterUsageResult extends js.Object {
    var MeteringRecordId: js.UndefOr[String]
  }

  object MeterUsageResult {
    @inline
    def apply(
        MeteringRecordId: js.UndefOr[String] = js.undefined
    ): MeterUsageResult = {
      val __obj = js.Dynamic.literal()
      MeteringRecordId.foreach(__v => __obj.updateDynamic("MeteringRecordId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MeterUsageResult]
    }
  }

  @js.native
  trait RegisterUsageRequest extends js.Object {
    var ProductCode: ProductCode
    var PublicKeyVersion: VersionInteger
    var Nonce: js.UndefOr[Nonce]
  }

  object RegisterUsageRequest {
    @inline
    def apply(
        ProductCode: ProductCode,
        PublicKeyVersion: VersionInteger,
        Nonce: js.UndefOr[Nonce] = js.undefined
    ): RegisterUsageRequest = {
      val __obj = js.Dynamic.literal(
        "ProductCode" -> ProductCode.asInstanceOf[js.Any],
        "PublicKeyVersion" -> PublicKeyVersion.asInstanceOf[js.Any]
      )

      Nonce.foreach(__v => __obj.updateDynamic("Nonce")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterUsageRequest]
    }
  }

  @js.native
  trait RegisterUsageResult extends js.Object {
    var PublicKeyRotationTimestamp: js.UndefOr[Timestamp]
    var Signature: js.UndefOr[NonEmptyString]
  }

  object RegisterUsageResult {
    @inline
    def apply(
        PublicKeyRotationTimestamp: js.UndefOr[Timestamp] = js.undefined,
        Signature: js.UndefOr[NonEmptyString] = js.undefined
    ): RegisterUsageResult = {
      val __obj = js.Dynamic.literal()
      PublicKeyRotationTimestamp.foreach(__v => __obj.updateDynamic("PublicKeyRotationTimestamp")(__v.asInstanceOf[js.Any]))
      Signature.foreach(__v => __obj.updateDynamic("Signature")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterUsageResult]
    }
  }

  /** Contains input to the ResolveCustomer operation.
    */
  @js.native
  trait ResolveCustomerRequest extends js.Object {
    var RegistrationToken: NonEmptyString
  }

  object ResolveCustomerRequest {
    @inline
    def apply(
        RegistrationToken: NonEmptyString
    ): ResolveCustomerRequest = {
      val __obj = js.Dynamic.literal(
        "RegistrationToken" -> RegistrationToken.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ResolveCustomerRequest]
    }
  }

  /** The result of the ResolveCustomer operation. Contains the CustomerIdentifier and product code.
    */
  @js.native
  trait ResolveCustomerResult extends js.Object {
    var CustomerIdentifier: js.UndefOr[CustomerIdentifier]
    var ProductCode: js.UndefOr[ProductCode]
  }

  object ResolveCustomerResult {
    @inline
    def apply(
        CustomerIdentifier: js.UndefOr[CustomerIdentifier] = js.undefined,
        ProductCode: js.UndefOr[ProductCode] = js.undefined
    ): ResolveCustomerResult = {
      val __obj = js.Dynamic.literal()
      CustomerIdentifier.foreach(__v => __obj.updateDynamic("CustomerIdentifier")(__v.asInstanceOf[js.Any]))
      ProductCode.foreach(__v => __obj.updateDynamic("ProductCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResolveCustomerResult]
    }
  }

  /** Metadata assigned to an allocation. Each tag is made up of a key and a value.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tag]
    }
  }

  /** Usage allocations allow you to split usage into buckets by tags. Each UsageAllocation indicates the usage quantity for a specific set of tags.
    */
  @js.native
  trait UsageAllocation extends js.Object {
    var AllocatedUsageQuantity: AllocatedUsageQuantity
    var Tags: js.UndefOr[TagList]
  }

  object UsageAllocation {
    @inline
    def apply(
        AllocatedUsageQuantity: AllocatedUsageQuantity,
        Tags: js.UndefOr[TagList] = js.undefined
    ): UsageAllocation = {
      val __obj = js.Dynamic.literal(
        "AllocatedUsageQuantity" -> AllocatedUsageQuantity.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UsageAllocation]
    }
  }

  /** A UsageRecord indicates a quantity of usage for a given product, customer, dimension and time. Multiple requests with the same UsageRecords as input will be deduplicated to prevent double charges.
    */
  @js.native
  trait UsageRecord extends js.Object {
    var CustomerIdentifier: CustomerIdentifier
    var Dimension: UsageDimension
    var Timestamp: Timestamp
    var Quantity: js.UndefOr[UsageQuantity]
    var UsageAllocations: js.UndefOr[UsageAllocations]
  }

  object UsageRecord {
    @inline
    def apply(
        CustomerIdentifier: CustomerIdentifier,
        Dimension: UsageDimension,
        Timestamp: Timestamp,
        Quantity: js.UndefOr[UsageQuantity] = js.undefined,
        UsageAllocations: js.UndefOr[UsageAllocations] = js.undefined
    ): UsageRecord = {
      val __obj = js.Dynamic.literal(
        "CustomerIdentifier" -> CustomerIdentifier.asInstanceOf[js.Any],
        "Dimension" -> Dimension.asInstanceOf[js.Any],
        "Timestamp" -> Timestamp.asInstanceOf[js.Any]
      )

      Quantity.foreach(__v => __obj.updateDynamic("Quantity")(__v.asInstanceOf[js.Any]))
      UsageAllocations.foreach(__v => __obj.updateDynamic("UsageAllocations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UsageRecord]
    }
  }

  /** A UsageRecordResult indicates the status of a given UsageRecord processed by BatchMeterUsage.
    */
  @js.native
  trait UsageRecordResult extends js.Object {
    var MeteringRecordId: js.UndefOr[String]
    var Status: js.UndefOr[UsageRecordResultStatus]
    var UsageRecord: js.UndefOr[UsageRecord]
  }

  object UsageRecordResult {
    @inline
    def apply(
        MeteringRecordId: js.UndefOr[String] = js.undefined,
        Status: js.UndefOr[UsageRecordResultStatus] = js.undefined,
        UsageRecord: js.UndefOr[UsageRecord] = js.undefined
    ): UsageRecordResult = {
      val __obj = js.Dynamic.literal()
      MeteringRecordId.foreach(__v => __obj.updateDynamic("MeteringRecordId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UsageRecord.foreach(__v => __obj.updateDynamic("UsageRecord")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UsageRecordResult]
    }
  }
}
