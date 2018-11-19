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
  class MarketplaceEntitlementService(config: AWSConfig) extends js.Object {
    def getEntitlements(params: GetEntitlementsRequest): Request[GetEntitlementsResult] = js.native
  }

  /**
   * <p>An entitlement represents capacity in a product owned by the customer. For example, a customer might own some number of users or seats in an SaaS application or some amount of data capacity in a multi-tenant database.</p>
   */
  @js.native
  trait Entitlement extends js.Object {
    var ProductCode: js.UndefOr[ProductCode]
    var CustomerIdentifier: js.UndefOr[NonEmptyString]
    var Value: js.UndefOr[EntitlementValue]
    var ExpirationDate: js.UndefOr[Timestamp]
    var Dimension: js.UndefOr[NonEmptyString]
  }

  object Entitlement {
    def apply(
      ProductCode: js.UndefOr[ProductCode] = js.undefined,
      CustomerIdentifier: js.UndefOr[NonEmptyString] = js.undefined,
      Value: js.UndefOr[EntitlementValue] = js.undefined,
      ExpirationDate: js.UndefOr[Timestamp] = js.undefined,
      Dimension: js.UndefOr[NonEmptyString] = js.undefined): Entitlement = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProductCode" -> ProductCode.map { x => x.asInstanceOf[js.Any] },
        "CustomerIdentifier" -> CustomerIdentifier.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] },
        "ExpirationDate" -> ExpirationDate.map { x => x.asInstanceOf[js.Any] },
        "Dimension" -> Dimension.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Entitlement]
    }
  }

  /**
   * <p>The EntitlementValue represents the amount of capacity that the customer is entitled to for the product.</p>
   */
  @js.native
  trait EntitlementValue extends js.Object {
    var IntegerValue: js.UndefOr[Int]
    var DoubleValue: js.UndefOr[Double]
    var BooleanValue: js.UndefOr[Boolean]
    var StringValue: js.UndefOr[String]
  }

  object EntitlementValue {
    def apply(
      IntegerValue: js.UndefOr[Int] = js.undefined,
      DoubleValue: js.UndefOr[Double] = js.undefined,
      BooleanValue: js.UndefOr[Boolean] = js.undefined,
      StringValue: js.UndefOr[String] = js.undefined): EntitlementValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IntegerValue" -> IntegerValue.map { x => x.asInstanceOf[js.Any] },
        "DoubleValue" -> DoubleValue.map { x => x.asInstanceOf[js.Any] },
        "BooleanValue" -> BooleanValue.map { x => x.asInstanceOf[js.Any] },
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
   * <p>The GetEntitlementsRequest contains parameters for the GetEntitlements operation.</p>
   */
  @js.native
  trait GetEntitlementsRequest extends js.Object {
    var ProductCode: js.UndefOr[ProductCode]
    var Filter: js.UndefOr[GetEntitlementFilters]
    var NextToken: js.UndefOr[NonEmptyString]
    var MaxResults: js.UndefOr[Int]
  }

  object GetEntitlementsRequest {
    def apply(
      ProductCode: js.UndefOr[ProductCode] = js.undefined,
      Filter: js.UndefOr[GetEntitlementFilters] = js.undefined,
      NextToken: js.UndefOr[NonEmptyString] = js.undefined,
      MaxResults: js.UndefOr[Int] = js.undefined): GetEntitlementsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ProductCode" -> ProductCode.map { x => x.asInstanceOf[js.Any] },
        "Filter" -> Filter.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEntitlementsRequest]
    }
  }

  /**
   * <p>The GetEntitlementsRequest contains results from the GetEntitlements operation.</p>
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
   * <p>An internal error has occurred. Retry your request. If the problem persists, post a message with details on the AWS forums.</p>
   */
  @js.native
  trait InternalServiceErrorExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>One or more parameters in your request was invalid.</p>
   */
  @js.native
  trait InvalidParameterExceptionException extends js.Object {
    val message: ErrorMessage
  }

  /**
   * <p>The calls to the GetEntitlements API are throttled.</p>
   */
  @js.native
  trait ThrottlingExceptionException extends js.Object {
    val message: ErrorMessage
  }
}
