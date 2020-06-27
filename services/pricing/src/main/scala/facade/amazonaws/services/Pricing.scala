package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object pricing {
  type AttributeNameList  = js.Array[String]
  type AttributeValueList = js.Array[AttributeValue]
  type BoxedInteger       = Int
  type Filters            = js.Array[Filter]
  type PriceList          = js.Array[PriceListItemJSON]
  type PriceListItemJSON  = String
  type ServiceList        = js.Array[Service]
  type errorMessage       = String

  implicit final class PricingOps(private val service: Pricing) extends AnyVal {

    @inline def describeServicesFuture(params: DescribeServicesRequest): Future[DescribeServicesResponse] =
      service.describeServices(params).promise().toFuture
    @inline def getAttributeValuesFuture(params: GetAttributeValuesRequest): Future[GetAttributeValuesResponse] =
      service.getAttributeValues(params).promise().toFuture
    @inline def getProductsFuture(params: GetProductsRequest): Future[GetProductsResponse] =
      service.getProducts(params).promise().toFuture
  }
}

package pricing {
  @js.native
  @JSImport("aws-sdk", "Pricing")
  class Pricing() extends js.Object {
    def this(config: AWSConfig) = this()

    def describeServices(params: DescribeServicesRequest): Request[DescribeServicesResponse]       = js.native
    def getAttributeValues(params: GetAttributeValuesRequest): Request[GetAttributeValuesResponse] = js.native
    def getProducts(params: GetProductsRequest): Request[GetProductsResponse]                      = js.native
  }

  /**
    * The values of a given attribute, such as <code>Throughput Optimized HDD</code> or <code>Provisioned IOPS</code> for the <code>Amazon EC2</code> <code>volumeType</code> attribute.
    */
  @js.native
  @Factory
  trait AttributeValue extends js.Object {
    var Value: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeServicesRequest extends js.Object {
    var FormatVersion: js.UndefOr[String]
    var MaxResults: js.UndefOr[BoxedInteger]
    var NextToken: js.UndefOr[String]
    var ServiceCode: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait DescribeServicesResponse extends js.Object {
    var FormatVersion: js.UndefOr[String]
    var NextToken: js.UndefOr[String]
    var Services: js.UndefOr[ServiceList]
  }

  /**
    * The pagination token expired. Try again without a pagination token.
    */
  @js.native
  trait ExpiredNextTokenExceptionException extends js.Object {
    val Message: errorMessage
  }

  /**
    * The constraints that you want all returned products to match.
    */
  @js.native
  @Factory
  trait Filter extends js.Object {
    var Field: String
    var Type: FilterType
    var Value: String
  }

  @js.native
  sealed trait FilterType extends js.Any
  object FilterType extends js.Object {
    val TERM_MATCH = "TERM_MATCH".asInstanceOf[FilterType]

    val values = js.Object.freeze(js.Array(TERM_MATCH))
  }

  @js.native
  @Factory
  trait GetAttributeValuesRequest extends js.Object {
    var AttributeName: String
    var ServiceCode: String
    var MaxResults: js.UndefOr[BoxedInteger]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetAttributeValuesResponse extends js.Object {
    var AttributeValues: js.UndefOr[AttributeValueList]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetProductsRequest extends js.Object {
    var Filters: js.UndefOr[Filters]
    var FormatVersion: js.UndefOr[String]
    var MaxResults: js.UndefOr[BoxedInteger]
    var NextToken: js.UndefOr[String]
    var ServiceCode: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetProductsResponse extends js.Object {
    var FormatVersion: js.UndefOr[String]
    var NextToken: js.UndefOr[String]
    var PriceList: js.UndefOr[PriceList]
  }

  /**
    * An error on the server occurred during the processing of your request. Try again later.
    */
  @js.native
  trait InternalErrorExceptionException extends js.Object {
    val Message: errorMessage
  }

  /**
    * The pagination token is invalid. Try again without a pagination token.
    */
  @js.native
  trait InvalidNextTokenExceptionException extends js.Object {
    val Message: errorMessage
  }

  /**
    * One or more parameters had an invalid value.
    */
  @js.native
  trait InvalidParameterExceptionException extends js.Object {
    val Message: errorMessage
  }

  /**
    * The requested resource can't be found.
    */
  @js.native
  trait NotFoundExceptionException extends js.Object {
    val Message: errorMessage
  }

  /**
    * The metadata for a service, such as the service code and available attribute names.
    */
  @js.native
  @Factory
  trait Service extends js.Object {
    var AttributeNames: js.UndefOr[AttributeNameList]
    var ServiceCode: js.UndefOr[String]
  }
}
