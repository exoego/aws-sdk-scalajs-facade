package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object marketplaceentitlementservice {
  type EntitlementList       = js.Array[Entitlement]
  type ErrorMessage          = String
  type FilterValue           = String
  type FilterValueList       = js.Array[FilterValue]
  type GetEntitlementFilters = js.Dictionary[FilterValueList]
  type NonEmptyString        = String
  type ProductCode           = String
  type Timestamp             = js.Date

  implicit final class MarketplaceEntitlementServiceOps(private val service: MarketplaceEntitlementService)
      extends AnyVal {

    @inline def getEntitlementsFuture(params: GetEntitlementsRequest): Future[GetEntitlementsResult] =
      service.getEntitlements(params).promise().toFuture
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
  @Factory
  trait Entitlement extends js.Object {
    var CustomerIdentifier: js.UndefOr[NonEmptyString]
    var Dimension: js.UndefOr[NonEmptyString]
    var ExpirationDate: js.UndefOr[Timestamp]
    var ProductCode: js.UndefOr[ProductCode]
    var Value: js.UndefOr[EntitlementValue]
  }

  /**
    * The EntitlementValue represents the amount of capacity that the customer is entitled to for the product.
    */
  @js.native
  @Factory
  trait EntitlementValue extends js.Object {
    var BooleanValue: js.UndefOr[Boolean]
    var DoubleValue: js.UndefOr[Double]
    var IntegerValue: js.UndefOr[Int]
    var StringValue: js.UndefOr[String]
  }

  @js.native
  sealed trait GetEntitlementFilterName extends js.Any
  object GetEntitlementFilterName extends js.Object {
    val CUSTOMER_IDENTIFIER = "CUSTOMER_IDENTIFIER".asInstanceOf[GetEntitlementFilterName]
    val DIMENSION           = "DIMENSION".asInstanceOf[GetEntitlementFilterName]

    val values = js.Object.freeze(js.Array(CUSTOMER_IDENTIFIER, DIMENSION))
  }

  /**
    * The GetEntitlementsRequest contains parameters for the GetEntitlements operation.
    */
  @js.native
  @Factory
  trait GetEntitlementsRequest extends js.Object {
    var ProductCode: ProductCode
    var Filter: js.UndefOr[GetEntitlementFilters]
    var MaxResults: js.UndefOr[Int]
    var NextToken: js.UndefOr[NonEmptyString]
  }

  /**
    * The GetEntitlementsRequest contains results from the GetEntitlements operation.
    */
  @js.native
  @Factory
  trait GetEntitlementsResult extends js.Object {
    var Entitlements: js.UndefOr[EntitlementList]
    var NextToken: js.UndefOr[NonEmptyString]
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
