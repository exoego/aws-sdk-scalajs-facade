package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object pricing {
  type AttributeNameList = js.Array[String]
  type AttributeValueList = js.Array[AttributeValue]
  type BoxedInteger = Int
  type Filters = js.Array[Filter]
  type PriceList = js.Array[PriceListItemJSON]
  type PriceListItemJSON = String
  type ServiceList = js.Array[Service]
  type errorMessage = String

  implicit final class PricingOps(private val service: Pricing) extends AnyVal {

    @inline def describeServicesFuture(params: DescribeServicesRequest): Future[DescribeServicesResponse] = service.describeServices(params).promise().toFuture
    @inline def getAttributeValuesFuture(params: GetAttributeValuesRequest): Future[GetAttributeValuesResponse] = service.getAttributeValues(params).promise().toFuture
    @inline def getProductsFuture(params: GetProductsRequest): Future[GetProductsResponse] = service.getProducts(params).promise().toFuture

  }
}

package pricing {
  @js.native
  @JSImport("aws-sdk/clients/pricing", JSImport.Namespace, "AWS.Pricing")
  class Pricing() extends js.Object {
    def this(config: AWSConfig) = this()

    def describeServices(params: DescribeServicesRequest): Request[DescribeServicesResponse] = js.native
    def getAttributeValues(params: GetAttributeValuesRequest): Request[GetAttributeValuesResponse] = js.native
    def getProducts(params: GetProductsRequest): Request[GetProductsResponse] = js.native
  }

  /** The values of a given attribute, such as <code>Throughput Optimized HDD</code> or <code>Provisioned IOPS</code> for the <code>Amazon EC2</code> <code>volumeType</code> attribute.
    */
  @js.native
  trait AttributeValue extends js.Object {
    var Value: js.UndefOr[String]
  }

  object AttributeValue {
    @inline
    def apply(
        Value: js.UndefOr[String] = js.undefined
    ): AttributeValue = {
      val __obj = js.Dynamic.literal()
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AttributeValue]
    }
  }

  @js.native
  trait DescribeServicesRequest extends js.Object {
    var FormatVersion: js.UndefOr[String]
    var MaxResults: js.UndefOr[BoxedInteger]
    var NextToken: js.UndefOr[String]
    var ServiceCode: js.UndefOr[String]
  }

  object DescribeServicesRequest {
    @inline
    def apply(
        FormatVersion: js.UndefOr[String] = js.undefined,
        MaxResults: js.UndefOr[BoxedInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        ServiceCode: js.UndefOr[String] = js.undefined
    ): DescribeServicesRequest = {
      val __obj = js.Dynamic.literal()
      FormatVersion.foreach(__v => __obj.updateDynamic("FormatVersion")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ServiceCode.foreach(__v => __obj.updateDynamic("ServiceCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeServicesRequest]
    }
  }

  @js.native
  trait DescribeServicesResponse extends js.Object {
    var FormatVersion: js.UndefOr[String]
    var NextToken: js.UndefOr[String]
    var Services: js.UndefOr[ServiceList]
  }

  object DescribeServicesResponse {
    @inline
    def apply(
        FormatVersion: js.UndefOr[String] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        Services: js.UndefOr[ServiceList] = js.undefined
    ): DescribeServicesResponse = {
      val __obj = js.Dynamic.literal()
      FormatVersion.foreach(__v => __obj.updateDynamic("FormatVersion")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Services.foreach(__v => __obj.updateDynamic("Services")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeServicesResponse]
    }
  }

  /** The pagination token expired. Try again without a pagination token.
    */
  @js.native
  trait ExpiredNextTokenExceptionException extends js.Object {
    val Message: errorMessage
  }

  /** The constraints that you want all returned products to match.
    */
  @js.native
  trait Filter extends js.Object {
    var Field: String
    var Type: FilterType
    var Value: String
  }

  object Filter {
    @inline
    def apply(
        Field: String,
        Type: FilterType,
        Value: String
    ): Filter = {
      val __obj = js.Dynamic.literal(
        "Field" -> Field.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Filter]
    }
  }

  @js.native
  sealed trait FilterType extends js.Any
  object FilterType {
    val TERM_MATCH = "TERM_MATCH".asInstanceOf[FilterType]

    @inline def values = js.Array(TERM_MATCH)
  }

  @js.native
  trait GetAttributeValuesRequest extends js.Object {
    var AttributeName: String
    var ServiceCode: String
    var MaxResults: js.UndefOr[BoxedInteger]
    var NextToken: js.UndefOr[String]
  }

  object GetAttributeValuesRequest {
    @inline
    def apply(
        AttributeName: String,
        ServiceCode: String,
        MaxResults: js.UndefOr[BoxedInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): GetAttributeValuesRequest = {
      val __obj = js.Dynamic.literal(
        "AttributeName" -> AttributeName.asInstanceOf[js.Any],
        "ServiceCode" -> ServiceCode.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAttributeValuesRequest]
    }
  }

  @js.native
  trait GetAttributeValuesResponse extends js.Object {
    var AttributeValues: js.UndefOr[AttributeValueList]
    var NextToken: js.UndefOr[String]
  }

  object GetAttributeValuesResponse {
    @inline
    def apply(
        AttributeValues: js.UndefOr[AttributeValueList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): GetAttributeValuesResponse = {
      val __obj = js.Dynamic.literal()
      AttributeValues.foreach(__v => __obj.updateDynamic("AttributeValues")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAttributeValuesResponse]
    }
  }

  @js.native
  trait GetProductsRequest extends js.Object {
    var Filters: js.UndefOr[Filters]
    var FormatVersion: js.UndefOr[String]
    var MaxResults: js.UndefOr[BoxedInteger]
    var NextToken: js.UndefOr[String]
    var ServiceCode: js.UndefOr[String]
  }

  object GetProductsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[Filters] = js.undefined,
        FormatVersion: js.UndefOr[String] = js.undefined,
        MaxResults: js.UndefOr[BoxedInteger] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        ServiceCode: js.UndefOr[String] = js.undefined
    ): GetProductsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      FormatVersion.foreach(__v => __obj.updateDynamic("FormatVersion")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ServiceCode.foreach(__v => __obj.updateDynamic("ServiceCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetProductsRequest]
    }
  }

  @js.native
  trait GetProductsResponse extends js.Object {
    var FormatVersion: js.UndefOr[String]
    var NextToken: js.UndefOr[String]
    var PriceList: js.UndefOr[PriceList]
  }

  object GetProductsResponse {
    @inline
    def apply(
        FormatVersion: js.UndefOr[String] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        PriceList: js.UndefOr[PriceList] = js.undefined
    ): GetProductsResponse = {
      val __obj = js.Dynamic.literal()
      FormatVersion.foreach(__v => __obj.updateDynamic("FormatVersion")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PriceList.foreach(__v => __obj.updateDynamic("PriceList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetProductsResponse]
    }
  }

  /** An error on the server occurred during the processing of your request. Try again later.
    */
  @js.native
  trait InternalErrorExceptionException extends js.Object {
    val Message: errorMessage
  }

  /** The pagination token is invalid. Try again without a pagination token.
    */
  @js.native
  trait InvalidNextTokenExceptionException extends js.Object {
    val Message: errorMessage
  }

  /** One or more parameters had an invalid value.
    */
  @js.native
  trait InvalidParameterExceptionException extends js.Object {
    val Message: errorMessage
  }

  /** The requested resource can't be found.
    */
  @js.native
  trait NotFoundExceptionException extends js.Object {
    val Message: errorMessage
  }

  /** The metadata for a service, such as the service code and available attribute names.
    */
  @js.native
  trait Service extends js.Object {
    var AttributeNames: js.UndefOr[AttributeNameList]
    var ServiceCode: js.UndefOr[String]
  }

  object Service {
    @inline
    def apply(
        AttributeNames: js.UndefOr[AttributeNameList] = js.undefined,
        ServiceCode: js.UndefOr[String] = js.undefined
    ): Service = {
      val __obj = js.Dynamic.literal()
      AttributeNames.foreach(__v => __obj.updateDynamic("AttributeNames")(__v.asInstanceOf[js.Any]))
      ServiceCode.foreach(__v => __obj.updateDynamic("ServiceCode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Service]
    }
  }
}
