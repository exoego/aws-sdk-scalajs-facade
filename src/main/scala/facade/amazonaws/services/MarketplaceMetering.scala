package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object marketplacemetering {
  type CustomerIdentifier = String
  type NonEmptyString = String
  type ProductCode = String
  type Timestamp = js.Date
  type UsageDimension = String
  type UsageQuantity = Int
  type UsageRecordList = js.Array[UsageRecord]
  type UsageRecordResultList = js.Array[UsageRecordResult]
  type UsageRecordResultStatus = String
  type errorMessage = String
}

package marketplacemetering {
  @js.native
  @JSImport("aws-sdk", "MarketplaceMetering")
  class MarketplaceMetering(config: AWSConfig) extends js.Object {
    def batchMeterUsage(params: BatchMeterUsageRequest): Request[BatchMeterUsageResult] = js.native
    def meterUsage(params: MeterUsageRequest): Request[MeterUsageResult] = js.native
    def resolveCustomer(params: ResolveCustomerRequest): Request[ResolveCustomerResult] = js.native
  }

  /**
   * <p>A BatchMeterUsageRequest contains UsageRecords, which indicate quantities of usage within your application.</p>
   */
  @js.native
  trait BatchMeterUsageRequest extends js.Object {
    var UsageRecords: js.UndefOr[UsageRecordList]
    var ProductCode: js.UndefOr[ProductCode]
  }

  object BatchMeterUsageRequest {
    def apply(
      UsageRecords: js.UndefOr[UsageRecordList] = js.undefined,
      ProductCode: js.UndefOr[ProductCode] = js.undefined): BatchMeterUsageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UsageRecords" -> UsageRecords.map { x => x.asInstanceOf[js.Any] },
        "ProductCode" -> ProductCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchMeterUsageRequest]
    }
  }

  /**
   * <p>Contains the UsageRecords processed by BatchMeterUsage and any records that have failed due to transient error.</p>
   */
  @js.native
  trait BatchMeterUsageResult extends js.Object {
    var Results: js.UndefOr[UsageRecordResultList]
    var UnprocessedRecords: js.UndefOr[UsageRecordList]
  }

  object BatchMeterUsageResult {
    def apply(
      Results: js.UndefOr[UsageRecordResultList] = js.undefined,
      UnprocessedRecords: js.UndefOr[UsageRecordList] = js.undefined): BatchMeterUsageResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Results" -> Results.map { x => x.asInstanceOf[js.Any] },
        "UnprocessedRecords" -> UnprocessedRecords.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[BatchMeterUsageResult]
    }
  }

  /**
   * <p>A metering record has already been emitted by the same EC2 instance for the given {usageDimension, timestamp} with a different usageQuantity.</p>
   */
  @js.native
  trait DuplicateRequestExceptionException extends js.Object {
    val message: errorMessage
  }

  /**
   * <p>The submitted registration token has expired. This can happen if the buyer's browser takes too long to redirect to your page, the buyer has resubmitted the registration token, or your application has held on to the registration token for too long. Your SaaS registration website should redeem this token as soon as it is submitted by the buyer's browser.</p>
   */
  @js.native
  trait ExpiredTokenExceptionException extends js.Object {
    val message: errorMessage
  }

  /**
   * <p>An internal error has occurred. Retry your request. If the problem persists, post a message with details on the AWS forums.</p>
   */
  @js.native
  trait InternalServiceErrorExceptionException extends js.Object {
    val message: errorMessage
  }

  /**
   * <p>You have metered usage for a CustomerIdentifier that does not exist.</p>
   */
  @js.native
  trait InvalidCustomerIdentifierExceptionException extends js.Object {
    val message: errorMessage
  }

  /**
   * <p>The endpoint being called is in a region different from your EC2 instance. The region of the Metering service endpoint and the region of the EC2 instance must match.</p>
   */
  @js.native
  trait InvalidEndpointRegionExceptionException extends js.Object {
    val message: errorMessage
  }

  /**
   * <p>The product code passed does not match the product code used for publishing the product.</p>
   */
  @js.native
  trait InvalidProductCodeExceptionException extends js.Object {
    val message: errorMessage
  }

  @js.native
  trait InvalidTokenExceptionException extends js.Object {
    val message: errorMessage
  }

  /**
   * <p>The usage dimension does not match one of the UsageDimensions associated with products.</p>
   */
  @js.native
  trait InvalidUsageDimensionExceptionException extends js.Object {
    val message: errorMessage
  }

  @js.native
  trait MeterUsageRequest extends js.Object {
    var ProductCode: js.UndefOr[ProductCode]
    var DryRun: js.UndefOr[Boolean]
    var Timestamp: js.UndefOr[Timestamp]
    var UsageQuantity: js.UndefOr[UsageQuantity]
    var UsageDimension: js.UndefOr[UsageDimension]
  }

  object MeterUsageRequest {
    def apply(
      ProductCode: js.UndefOr[ProductCode] = js.undefined,
      DryRun: js.UndefOr[Boolean] = js.undefined,
      Timestamp: js.UndefOr[Timestamp] = js.undefined,
      UsageQuantity: js.UndefOr[UsageQuantity] = js.undefined,
      UsageDimension: js.UndefOr[UsageDimension] = js.undefined): MeterUsageRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProductCode" -> ProductCode.map { x => x.asInstanceOf[js.Any] },
        "DryRun" -> DryRun.map { x => x.asInstanceOf[js.Any] },
        "Timestamp" -> Timestamp.map { x => x.asInstanceOf[js.Any] },
        "UsageQuantity" -> UsageQuantity.map { x => x.asInstanceOf[js.Any] },
        "UsageDimension" -> UsageDimension.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MeterUsageRequest]
    }
  }

  @js.native
  trait MeterUsageResult extends js.Object {
    var MeteringRecordId: js.UndefOr[String]
  }

  object MeterUsageResult {
    def apply(
      MeteringRecordId: js.UndefOr[String] = js.undefined): MeterUsageResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MeteringRecordId" -> MeteringRecordId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MeterUsageResult]
    }
  }

  /**
   * <p>Contains input to the ResolveCustomer operation.</p>
   */
  @js.native
  trait ResolveCustomerRequest extends js.Object {
    var RegistrationToken: js.UndefOr[NonEmptyString]
  }

  object ResolveCustomerRequest {
    def apply(
      RegistrationToken: js.UndefOr[NonEmptyString] = js.undefined): ResolveCustomerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "RegistrationToken" -> RegistrationToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResolveCustomerRequest]
    }
  }

  /**
   * <p>The result of the ResolveCustomer operation. Contains the CustomerIdentifier and product code.</p>
   */
  @js.native
  trait ResolveCustomerResult extends js.Object {
    var CustomerIdentifier: js.UndefOr[CustomerIdentifier]
    var ProductCode: js.UndefOr[ProductCode]
  }

  object ResolveCustomerResult {
    def apply(
      CustomerIdentifier: js.UndefOr[CustomerIdentifier] = js.undefined,
      ProductCode: js.UndefOr[ProductCode] = js.undefined): ResolveCustomerResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CustomerIdentifier" -> CustomerIdentifier.map { x => x.asInstanceOf[js.Any] },
        "ProductCode" -> ProductCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResolveCustomerResult]
    }
  }

  /**
   * <p>The calls to the MeterUsage API are throttled.</p>
   */
  @js.native
  trait ThrottlingExceptionException extends js.Object {
    val message: errorMessage
  }

  /**
   * <p>The timestamp value passed in the meterUsage() is out of allowed range.</p>
   */
  @js.native
  trait TimestampOutOfBoundsExceptionException extends js.Object {
    val message: errorMessage
  }

  /**
   * <p>A UsageRecord indicates a quantity of usage for a given product, customer, dimension and time.</p> <p>Multiple requests with the same UsageRecords as input will be deduplicated to prevent double charges.</p>
   */
  @js.native
  trait UsageRecord extends js.Object {
    var Timestamp: js.UndefOr[Timestamp]
    var CustomerIdentifier: js.UndefOr[CustomerIdentifier]
    var Dimension: js.UndefOr[UsageDimension]
    var Quantity: js.UndefOr[UsageQuantity]
  }

  object UsageRecord {
    def apply(
      Timestamp: js.UndefOr[Timestamp] = js.undefined,
      CustomerIdentifier: js.UndefOr[CustomerIdentifier] = js.undefined,
      Dimension: js.UndefOr[UsageDimension] = js.undefined,
      Quantity: js.UndefOr[UsageQuantity] = js.undefined): UsageRecord = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Timestamp" -> Timestamp.map { x => x.asInstanceOf[js.Any] },
        "CustomerIdentifier" -> CustomerIdentifier.map { x => x.asInstanceOf[js.Any] },
        "Dimension" -> Dimension.map { x => x.asInstanceOf[js.Any] },
        "Quantity" -> Quantity.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UsageRecord]
    }
  }

  /**
   * <p>A UsageRecordResult indicates the status of a given UsageRecord processed by BatchMeterUsage.</p>
   */
  @js.native
  trait UsageRecordResult extends js.Object {
    var UsageRecord: js.UndefOr[UsageRecord]
    var MeteringRecordId: js.UndefOr[String]
    var Status: js.UndefOr[UsageRecordResultStatus]
  }

  object UsageRecordResult {
    def apply(
      UsageRecord: js.UndefOr[UsageRecord] = js.undefined,
      MeteringRecordId: js.UndefOr[String] = js.undefined,
      Status: js.UndefOr[UsageRecordResultStatus] = js.undefined): UsageRecordResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "UsageRecord" -> UsageRecord.map { x => x.asInstanceOf[js.Any] },
        "MeteringRecordId" -> MeteringRecordId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UsageRecordResult]
    }
  }

  object UsageRecordResultStatusEnum {
    val Success = "Success"
    val CustomerNotSubscribed = "CustomerNotSubscribed"
    val DuplicateRecord = "DuplicateRecord"

    val values = IndexedSeq(Success, CustomerNotSubscribed, DuplicateRecord)
  }
}
