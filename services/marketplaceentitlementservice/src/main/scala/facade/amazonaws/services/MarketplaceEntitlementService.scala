package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object marketplaceentitlementservice {
  type EntitlementList          = js.Array[Entitlement]
  type ErrorMessage             = String
  type FilterValue              = String
  type FilterValueList          = js.Array[FilterValue]
  type GetEntitlementFilterName = String
  type GetEntitlementFilters    = js.Dictionary[FilterValueList]
  type NonEmptyString           = String
  type ProductCode              = String
  type Timestamp                = js.Date

  implicit final class MarketplaceEntitlementServiceOps(private val service: MarketplaceEntitlementService)
      extends AnyVal {

    def getEntitlementsFuture(params: GetEntitlementsRequest): Future[GetEntitlementsResult] =
      service.getEntitlements(params).promise.toFuture
  }
}

package marketplaceentitlementservice {
  @js.native
  @JSImport("aws-sdk", "MarketplaceEntitlementService")
  class MarketplaceEntitlementService() extends js.Object {
    def this(config: AWSConfig) = this()

    def getEntitlements(params: GetEntitlementsRequest): Request[GetEntitlementsResult] = js.native
  }

  /**
    * An entitlement represents capacity in a product owned by the customer. For example, a customer might own some number of users or seats in an SaaS application or some amount of data capacity in a multi-tenant database.
    */
  @js.native
  trait Entitlement extends js.Object {
    var CustomerIdentifier: js.UndefOr[NonEmptyString]
    var Dimension: js.UndefOr[NonEmptyString]
    var ExpirationDate: js.UndefOr[Timestamp]
    var ProductCode: js.UndefOr[ProductCode]
    var Value: js.UndefOr[EntitlementValue]
  }

  object Entitlement {
    def apply(
        CustomerIdentifier: js.UndefOr[NonEmptyString] = js.undefined,
        Dimension: js.UndefOr[NonEmptyString] = js.undefined,
        ExpirationDate: js.UndefOr[Timestamp] = js.undefined,
        ProductCode: js.UndefOr[ProductCode] = js.undefined,
        Value: js.UndefOr[EntitlementValue] = js.undefined
    ): Entitlement = {
      val __obj = js.Dictionary.empty[js.Any]
      CustomerIdentifier.foreach(__v => __obj.update("CustomerIdentifier", __v.asInstanceOf[js.Any]))
      Dimension.foreach(__v => __obj.update("Dimension", __v.asInstanceOf[js.Any]))
      ExpirationDate.foreach(__v => __obj.update("ExpirationDate", __v.asInstanceOf[js.Any]))
      ProductCode.foreach(__v => __obj.update("ProductCode", __v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Entitlement]
    }
  }

  /**
    * The EntitlementValue represents the amount of capacity that the customer is entitled to for the product.
    */
  @js.native
  trait EntitlementValue extends js.Object {
    var BooleanValue: js.UndefOr[Boolean]
    var DoubleValue: js.UndefOr[Double]
    var IntegerValue: js.UndefOr[Int]
    var StringValue: js.UndefOr[String]
  }

  object EntitlementValue {
    def apply(
        BooleanValue: js.UndefOr[Boolean] = js.undefined,
        DoubleValue: js.UndefOr[Double] = js.undefined,
        IntegerValue: js.UndefOr[Int] = js.undefined,
        StringValue: js.UndefOr[String] = js.undefined
    ): EntitlementValue = {
      val __obj = js.Dictionary.empty[js.Any]
      BooleanValue.foreach(__v => __obj.update("BooleanValue", __v.asInstanceOf[js.Any]))
      DoubleValue.foreach(__v => __obj.update("DoubleValue", __v.asInstanceOf[js.Any]))
      IntegerValue.foreach(__v => __obj.update("IntegerValue", __v.asInstanceOf[js.Any]))
      StringValue.foreach(__v => __obj.update("StringValue", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EntitlementValue]
    }
  }

  object GetEntitlementFilterNameEnum {
    val CUSTOMER_IDENTIFIER = "CUSTOMER_IDENTIFIER"
    val DIMENSION           = "DIMENSION"

    val values = js.Object.freeze(js.Array(CUSTOMER_IDENTIFIER, DIMENSION))
  }

  /**
    * The GetEntitlementsRequest contains parameters for the GetEntitlements operation.
    */
  @js.native
  trait GetEntitlementsRequest extends js.Object {
    var ProductCode: ProductCode
    var Filter: js.UndefOr[GetEntitlementFilters]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[NonEmptyString]
  }

  object GetEntitlementsRequest {
    def apply(
        ProductCode: ProductCode,
        Filter: js.UndefOr[GetEntitlementFilters] = js.undefined,
        MaxResults: js.UndefOr[Int] = js.undefined,
        NextToken: js.UndefOr[NonEmptyString] = js.undefined
    ): GetEntitlementsRequest = {
      val __obj = js.Dictionary[js.Any](
        "ProductCode" -> ProductCode.asInstanceOf[js.Any]
      )

      Filter.foreach(__v => __obj.update("Filter", __v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEntitlementsRequest]
    }
  }

  /**
    * The GetEntitlementsRequest contains results from the GetEntitlements operation.
    */
  @js.native
  trait GetEntitlementsResult extends js.Object {
    var Entitlements: js.UndefOr[EntitlementList]
    var NextToken: js.UndefOr[NonEmptyString]
  }

  object GetEntitlementsResult {
    def apply(
        Entitlements: js.UndefOr[EntitlementList] = js.undefined,
        NextToken: js.UndefOr[NonEmptyString] = js.undefined
    ): GetEntitlementsResult = {
      val __obj = js.Dictionary.empty[js.Any]
      Entitlements.foreach(__v => __obj.update("Entitlements", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEntitlementsResult]
    }
  }

  /**
    * An internal error has occurred. Retry your request. If the problem persists, post a message with details on the AWS forums.
    */
  @js.native
  trait InternalServiceErrorExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * One or more parameters in your request was invalid.
    */
  @js.native
  trait InvalidParameterExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
    * The calls to the GetEntitlements API are throttled.
    */
  @js.native
  trait ThrottlingExceptionException extends js.Object {
    val message: ErrorMessage
  }
}
