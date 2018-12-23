package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object pricing {
  type AttributeNameList = js.Array[String]
  type AttributeValueList = js.Array[AttributeValue]
  type BoxedInteger = Int
  type FilterType = String
  type Filters = js.Array[Filter]
  type PriceList = js.Array[PriceListItemJSON]
  type PriceListItemJSON = String
  type ServiceList = js.Array[Service]
  type errorMessage = String
}

package pricing {
  @js.native
  @JSImport("aws-sdk", "Pricing")
  class Pricing(config: AWSConfig) extends js.Object {
    def describeServices(params: DescribeServicesRequest): Request[DescribeServicesResponse] = js.native
    def getAttributeValues(params: GetAttributeValuesRequest): Request[GetAttributeValuesResponse] = js.native
    def getProducts(params: GetProductsRequest): Request[GetProductsResponse] = js.native
  }

  /**
   * The values of a given attribute, such as <code>Throughput Optimized HDD</code> or <code>Provisioned IOPS</code> for the <code>Amazon EC2</code> <code>volumeType</code> attribute.
   */
  @js.native
  trait AttributeValue extends js.Object {
    var Value: js.UndefOr[String]
  }

  object AttributeValue {
    def apply(
      Value: js.UndefOr[String] = js.undefined): AttributeValue = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AttributeValue]
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
    def apply(
      FormatVersion: js.UndefOr[String] = js.undefined,
      MaxResults: js.UndefOr[BoxedInteger] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      ServiceCode: js.UndefOr[String] = js.undefined): DescribeServicesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FormatVersion" -> FormatVersion.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ServiceCode" -> ServiceCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeServicesRequest]
    }
  }

  @js.native
  trait DescribeServicesResponse extends js.Object {
    var FormatVersion: js.UndefOr[String]
    var NextToken: js.UndefOr[String]
    var Services: js.UndefOr[ServiceList]
  }

  object DescribeServicesResponse {
    def apply(
      FormatVersion: js.UndefOr[String] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      Services: js.UndefOr[ServiceList] = js.undefined): DescribeServicesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FormatVersion" -> FormatVersion.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "Services" -> Services.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeServicesResponse]
    }
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
  trait Filter extends js.Object {
    var Field: String
    var Type: FilterType
    var Value: String
  }

  object Filter {
    def apply(
      Field: String,
      Type: FilterType,
      Value: String): Filter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Field" -> Field.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Filter]
    }
  }

  object FilterTypeEnum {
    val TERM_MATCH = "TERM_MATCH"

    val values = IndexedSeq(TERM_MATCH)
  }

  @js.native
  trait GetAttributeValuesRequest extends js.Object {
    var AttributeName: String
    var ServiceCode: String
    var MaxResults: js.UndefOr[BoxedInteger]
    var NextToken: js.UndefOr[String]
  }

  object GetAttributeValuesRequest {
    def apply(
      AttributeName: String,
      ServiceCode: String,
      MaxResults: js.UndefOr[BoxedInteger] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): GetAttributeValuesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeName" -> AttributeName.asInstanceOf[js.Any],
        "ServiceCode" -> ServiceCode.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAttributeValuesRequest]
    }
  }

  @js.native
  trait GetAttributeValuesResponse extends js.Object {
    var AttributeValues: js.UndefOr[AttributeValueList]
    var NextToken: js.UndefOr[String]
  }

  object GetAttributeValuesResponse {
    def apply(
      AttributeValues: js.UndefOr[AttributeValueList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): GetAttributeValuesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeValues" -> AttributeValues.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetAttributeValuesResponse]
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
    def apply(
      Filters: js.UndefOr[Filters] = js.undefined,
      FormatVersion: js.UndefOr[String] = js.undefined,
      MaxResults: js.UndefOr[BoxedInteger] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      ServiceCode: js.UndefOr[String] = js.undefined): GetProductsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "FormatVersion" -> FormatVersion.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "ServiceCode" -> ServiceCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetProductsRequest]
    }
  }

  @js.native
  trait GetProductsResponse extends js.Object {
    var FormatVersion: js.UndefOr[String]
    var NextToken: js.UndefOr[String]
    var PriceList: js.UndefOr[PriceList]
  }

  object GetProductsResponse {
    def apply(
      FormatVersion: js.UndefOr[String] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      PriceList: js.UndefOr[PriceList] = js.undefined): GetProductsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FormatVersion" -> FormatVersion.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "PriceList" -> PriceList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetProductsResponse]
    }
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
  trait Service extends js.Object {
    var AttributeNames: js.UndefOr[AttributeNameList]
    var ServiceCode: js.UndefOr[String]
  }

  object Service {
    def apply(
      AttributeNames: js.UndefOr[AttributeNameList] = js.undefined,
      ServiceCode: js.UndefOr[String] = js.undefined): Service = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeNames" -> AttributeNames.map { x => x.asInstanceOf[js.Any] },
        "ServiceCode" -> ServiceCode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Service]
    }
  }
}
