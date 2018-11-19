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
   * <p>The values of a given attribute, such as <code>Throughput Optimized HDD</code> or <code>Provisioned IOPS</code> for the <code>Amazon EC2</code> <code>volumeType</code> attribute.</p>
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
    var ServiceCode: js.UndefOr[String]
    var FormatVersion: js.UndefOr[String]
    var NextToken: js.UndefOr[String]
    var MaxResults: js.UndefOr[BoxedInteger]
  }

  object DescribeServicesRequest {
    def apply(
      ServiceCode: js.UndefOr[String] = js.undefined,
      FormatVersion: js.UndefOr[String] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      MaxResults: js.UndefOr[BoxedInteger] = js.undefined): DescribeServicesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceCode" -> ServiceCode.map { x => x.asInstanceOf[js.Any] },
        "FormatVersion" -> FormatVersion.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeServicesRequest]
    }
  }

  @js.native
  trait DescribeServicesResponse extends js.Object {
    var Services: js.UndefOr[ServiceList]
    var FormatVersion: js.UndefOr[String]
    var NextToken: js.UndefOr[String]
  }

  object DescribeServicesResponse {
    def apply(
      Services: js.UndefOr[ServiceList] = js.undefined,
      FormatVersion: js.UndefOr[String] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): DescribeServicesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Services" -> Services.map { x => x.asInstanceOf[js.Any] },
        "FormatVersion" -> FormatVersion.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeServicesResponse]
    }
  }

  /**
   * <p>The pagination token expired. Try again without a pagination token.</p>
   */
  @js.native
  trait ExpiredNextTokenExceptionException extends js.Object {
    val Message: errorMessage
  }

  /**
   * <p>The constraints that you want all returned products to match.</p>
   */
  @js.native
  trait Filter extends js.Object {
    var Type: js.UndefOr[FilterType]
    var Field: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object Filter {
    def apply(
      Type: js.UndefOr[FilterType] = js.undefined,
      Field: js.UndefOr[String] = js.undefined,
      Value: js.UndefOr[String] = js.undefined): Filter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "Field" -> Field.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Filter]
    }
  }

  object FilterTypeEnum {
    val TERM_MATCH = "TERM_MATCH"

    val values = IndexedSeq(TERM_MATCH)
  }

  @js.native
  trait GetAttributeValuesRequest extends js.Object {
    var ServiceCode: js.UndefOr[String]
    var AttributeName: js.UndefOr[String]
    var NextToken: js.UndefOr[String]
    var MaxResults: js.UndefOr[BoxedInteger]
  }

  object GetAttributeValuesRequest {
    def apply(
      ServiceCode: js.UndefOr[String] = js.undefined,
      AttributeName: js.UndefOr[String] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined,
      MaxResults: js.UndefOr[BoxedInteger] = js.undefined): GetAttributeValuesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceCode" -> ServiceCode.map { x => x.asInstanceOf[js.Any] },
        "AttributeName" -> AttributeName.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

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
    var FormatVersion: js.UndefOr[String]
    var MaxResults: js.UndefOr[BoxedInteger]
    var ServiceCode: js.UndefOr[String]
    var Filters: js.UndefOr[Filters]
    var NextToken: js.UndefOr[String]
  }

  object GetProductsRequest {
    def apply(
      FormatVersion: js.UndefOr[String] = js.undefined,
      MaxResults: js.UndefOr[BoxedInteger] = js.undefined,
      ServiceCode: js.UndefOr[String] = js.undefined,
      Filters: js.UndefOr[Filters] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): GetProductsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FormatVersion" -> FormatVersion.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "ServiceCode" -> ServiceCode.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetProductsRequest]
    }
  }

  @js.native
  trait GetProductsResponse extends js.Object {
    var FormatVersion: js.UndefOr[String]
    var PriceList: js.UndefOr[PriceList]
    var NextToken: js.UndefOr[String]
  }

  object GetProductsResponse {
    def apply(
      FormatVersion: js.UndefOr[String] = js.undefined,
      PriceList: js.UndefOr[PriceList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): GetProductsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FormatVersion" -> FormatVersion.map { x => x.asInstanceOf[js.Any] },
        "PriceList" -> PriceList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetProductsResponse]
    }
  }

  /**
   * <p>An error on the server occurred during the processing of your request. Try again later.</p>
   */
  @js.native
  trait InternalErrorExceptionException extends js.Object {
    val Message: errorMessage
  }

  /**
   * <p>The pagination token is invalid. Try again without a pagination token.</p>
   */
  @js.native
  trait InvalidNextTokenExceptionException extends js.Object {
    val Message: errorMessage
  }

  /**
   * <p>One or more parameters had an invalid value.</p>
   */
  @js.native
  trait InvalidParameterExceptionException extends js.Object {
    val Message: errorMessage
  }

  /**
   * <p>The requested resource can't be found.</p>
   */
  @js.native
  trait NotFoundExceptionException extends js.Object {
    val Message: errorMessage
  }

  /**
   * <p>The metadata for a service, such as the service code and available attribute names.</p>
   */
  @js.native
  trait Service extends js.Object {
    var ServiceCode: js.UndefOr[String]
    var AttributeNames: js.UndefOr[AttributeNameList]
  }

  object Service {
    def apply(
      ServiceCode: js.UndefOr[String] = js.undefined,
      AttributeNames: js.UndefOr[AttributeNameList] = js.undefined): Service = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceCode" -> ServiceCode.map { x => x.asInstanceOf[js.Any] },
        "AttributeNames" -> AttributeNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Service]
    }
  }
}
