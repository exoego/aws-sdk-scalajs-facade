package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object marketplaceentitlementservice {
  type EntitlementList = js.Array[Entitlement]
  type ErrorMessage = String
  type FilterValue = String
  type FilterValueList = js.Array[FilterValue]
  type GetEntitlementFilterName = String
  type GetEntitlementFilters = js.Dictionary[FilterValueList]
  type NonEmptyString = String
  type ProductCode = String
  type Timestamp = js.Date
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
      Value: js.UndefOr[EntitlementValue] = js.undefined): Entitlement = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CustomerIdentifier" -> CustomerIdentifier.map { x => x.asInstanceOf[js.Any] },
        "Dimension" -> Dimension.map { x => x.asInstanceOf[js.Any] },
        "ExpirationDate" -> ExpirationDate.map { x => x.asInstanceOf[js.Any] },
        "ProductCode" -> ProductCode.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Entitlement]
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
      StringValue: js.UndefOr[String] = js.undefined): EntitlementValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "BooleanValue" -> BooleanValue.map { x => x.asInstanceOf[js.Any] },
        "DoubleValue" -> DoubleValue.map { x => x.asInstanceOf[js.Any] },
        "IntegerValue" -> IntegerValue.map { x => x.asInstanceOf[js.Any] },
        "StringValue" -> StringValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EntitlementValue]
    }
  }

  object GetEntitlementFilterNameEnum {
    val CUSTOMER_IDENTIFIER = "CUSTOMER_IDENTIFIER"
    val DIMENSION = "DIMENSION"

    val values = IndexedSeq(CUSTOMER_IDENTIFIER, DIMENSION)
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
      NextToken: js.UndefOr[NonEmptyString] = js.undefined): GetEntitlementsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProductCode" -> ProductCode.asInstanceOf[js.Any],
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEntitlementsRequest]
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
      NextToken: js.UndefOr[NonEmptyString] = js.undefined): GetEntitlementsResult = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Entitlements" -> Entitlements.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEntitlementsResult]
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
