package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object marketplacemetering {
  type CustomerIdentifier    = String
  type NonEmptyString        = String
  type Nonce                 = String
  type ProductCode           = String
  type Timestamp             = js.Date
  type UsageDimension        = String
  type UsageQuantity         = Int
  type UsageRecordList       = js.Array[UsageRecord]
  type UsageRecordResultList = js.Array[UsageRecordResult]
  type VersionInteger        = Int

  implicit final class MarketplaceMeteringOps(private val service: MarketplaceMetering) extends AnyVal {

    @inline def batchMeterUsageFuture(params: BatchMeterUsageRequest): Future[BatchMeterUsageResult] =
      service.batchMeterUsage(params).promise().toFuture
    @inline def meterUsageFuture(params: MeterUsageRequest): Future[MeterUsageResult] =
      service.meterUsage(params).promise().toFuture
    @inline def registerUsageFuture(params: RegisterUsageRequest): Future[RegisterUsageResult] =
      service.registerUsage(params).promise().toFuture
    @inline def resolveCustomerFuture(params: ResolveCustomerRequest): Future[ResolveCustomerResult] =
      service.resolveCustomer(params).promise().toFuture
  }
}

package marketplacemetering {
  @js.native
  @JSImport("aws-sdk", "MarketplaceMetering")
  class MarketplaceMetering() extends js.Object {
    def this(config: AWSConfig) = this()

    def batchMeterUsage(params: BatchMeterUsageRequest): Request[BatchMeterUsageResult] = js.native
    def meterUsage(params: MeterUsageRequest): Request[MeterUsageResult]                = js.native
    def registerUsage(params: RegisterUsageRequest): Request[RegisterUsageResult]       = js.native
    def resolveCustomer(params: ResolveCustomerRequest): Request[ResolveCustomerResult] = js.native
  }

  /**
    * A BatchMeterUsageRequest contains UsageRecords, which indicate quantities of usage within your application.
    */
  @js.native
  @Factory
  trait BatchMeterUsageRequest extends js.Object {
    var ProductCode: ProductCode
    var UsageRecords: UsageRecordList
  }

  /**
    * Contains the UsageRecords processed by BatchMeterUsage and any records that have failed due to transient error.
    */
  @js.native
  @Factory
  trait BatchMeterUsageResult extends js.Object {
    var Results: js.UndefOr[UsageRecordResultList]
    var UnprocessedRecords: js.UndefOr[UsageRecordList]
  }

  @js.native
  @Factory
  trait MeterUsageRequest extends js.Object {
    var ProductCode: ProductCode
    var Timestamp: Timestamp
    var UsageDimension: UsageDimension
    var DryRun: js.UndefOr[Boolean]
    var UsageQuantity: js.UndefOr[UsageQuantity]
  }

  @js.native
  @Factory
  trait MeterUsageResult extends js.Object {
    var MeteringRecordId: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait RegisterUsageRequest extends js.Object {
    var ProductCode: ProductCode
    var PublicKeyVersion: VersionInteger
    var Nonce: js.UndefOr[Nonce]
  }

  @js.native
  @Factory
  trait RegisterUsageResult extends js.Object {
    var PublicKeyRotationTimestamp: js.UndefOr[Timestamp]
    var Signature: js.UndefOr[NonEmptyString]
  }

  /**
    * Contains input to the ResolveCustomer operation.
    */
  @js.native
  @Factory
  trait ResolveCustomerRequest extends js.Object {
    var RegistrationToken: NonEmptyString
  }

  /**
    * The result of the ResolveCustomer operation. Contains the CustomerIdentifier and product code.
    */
  @js.native
  @Factory
  trait ResolveCustomerResult extends js.Object {
    var CustomerIdentifier: js.UndefOr[CustomerIdentifier]
    var ProductCode: js.UndefOr[ProductCode]
  }

  /**
    * A UsageRecord indicates a quantity of usage for a given product, customer, dimension and time.
    *  Multiple requests with the same UsageRecords as input will be deduplicated to prevent double charges.
    */
  @js.native
  @Factory
  trait UsageRecord extends js.Object {
    var CustomerIdentifier: CustomerIdentifier
    var Dimension: UsageDimension
    var Timestamp: Timestamp
    var Quantity: js.UndefOr[UsageQuantity]
  }

  /**
    * A UsageRecordResult indicates the status of a given UsageRecord processed by BatchMeterUsage.
    */
  @js.native
  @Factory
  trait UsageRecordResult extends js.Object {
    var MeteringRecordId: js.UndefOr[String]
    var Status: js.UndefOr[UsageRecordResultStatus]
    var UsageRecord: js.UndefOr[UsageRecord]
  }

  @js.native
  sealed trait UsageRecordResultStatus extends js.Any
  object UsageRecordResultStatus extends js.Object {
    val Success               = "Success".asInstanceOf[UsageRecordResultStatus]
    val CustomerNotSubscribed = "CustomerNotSubscribed".asInstanceOf[UsageRecordResultStatus]
    val DuplicateRecord       = "DuplicateRecord".asInstanceOf[UsageRecordResultStatus]

    val values = js.Object.freeze(js.Array(Success, CustomerNotSubscribed, DuplicateRecord))
  }
}
