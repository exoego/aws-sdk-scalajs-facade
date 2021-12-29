package facade.amazonaws.services.apigateway

import scalajs._
import scala.scalajs.js.|

@js.native
sealed trait ApiKeySourceType extends js.Any
object ApiKeySourceType {
  val HEADER = "HEADER".asInstanceOf[ApiKeySourceType]
  val AUTHORIZER = "AUTHORIZER".asInstanceOf[ApiKeySourceType]

  @inline def values = js.Array(HEADER, AUTHORIZER)
}

@js.native
sealed trait ApiKeysFormat extends js.Any
object ApiKeysFormat {
  val csv = "csv".asInstanceOf[ApiKeysFormat]

  @inline def values = js.Array(csv)
}

/** The authorizer type. Valid values are <code>TOKEN</code> for a Lambda function using a single authorization token submitted in a custom header, <code>REQUEST</code> for a Lambda function using incoming request parameters, and <code>COGNITO_USER_POOLS</code> for using an Amazon Cognito user pool.
  */
@js.native
sealed trait AuthorizerType extends js.Any
object AuthorizerType {
  val TOKEN = "TOKEN".asInstanceOf[AuthorizerType]
  val REQUEST = "REQUEST".asInstanceOf[AuthorizerType]
  val COGNITO_USER_POOLS = "COGNITO_USER_POOLS".asInstanceOf[AuthorizerType]

  @inline def values = js.Array(TOKEN, REQUEST, COGNITO_USER_POOLS)
}

/** Returns the size of the ```CacheCluster```.
  */
@js.native
sealed trait CacheClusterSize extends js.Any
object CacheClusterSize {
  val `0.5` = "0.5".asInstanceOf[CacheClusterSize]
  val `1.6` = "1.6".asInstanceOf[CacheClusterSize]
  val `6.1` = "6.1".asInstanceOf[CacheClusterSize]
  val `13.5` = "13.5".asInstanceOf[CacheClusterSize]
  val `28.4` = "28.4".asInstanceOf[CacheClusterSize]
  val `58.2` = "58.2".asInstanceOf[CacheClusterSize]
  val `118` = "118".asInstanceOf[CacheClusterSize]
  val `237` = "237".asInstanceOf[CacheClusterSize]

  @inline def values = js.Array(`0.5`, `1.6`, `6.1`, `13.5`, `28.4`, `58.2`, `118`, `237`)
}

/** Returns the status of the ```CacheCluster```.
  */
@js.native
sealed trait CacheClusterStatus extends js.Any
object CacheClusterStatus {
  val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[CacheClusterStatus]
  val AVAILABLE = "AVAILABLE".asInstanceOf[CacheClusterStatus]
  val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[CacheClusterStatus]
  val NOT_AVAILABLE = "NOT_AVAILABLE".asInstanceOf[CacheClusterStatus]
  val FLUSH_IN_PROGRESS = "FLUSH_IN_PROGRESS".asInstanceOf[CacheClusterStatus]

  @inline def values = js.Array(CREATE_IN_PROGRESS, AVAILABLE, DELETE_IN_PROGRESS, NOT_AVAILABLE, FLUSH_IN_PROGRESS)
}

@js.native
sealed trait ConnectionType extends js.Any
object ConnectionType {
  val INTERNET = "INTERNET".asInstanceOf[ConnectionType]
  val VPC_LINK = "VPC_LINK".asInstanceOf[ConnectionType]

  @inline def values = js.Array(INTERNET, VPC_LINK)
}

@js.native
sealed trait ContentHandlingStrategy extends js.Any
object ContentHandlingStrategy {
  val CONVERT_TO_BINARY = "CONVERT_TO_BINARY".asInstanceOf[ContentHandlingStrategy]
  val CONVERT_TO_TEXT = "CONVERT_TO_TEXT".asInstanceOf[ContentHandlingStrategy]

  @inline def values = js.Array(CONVERT_TO_BINARY, CONVERT_TO_TEXT)
}

@js.native
sealed trait DocumentationPartType extends js.Any
object DocumentationPartType {
  val API = "API".asInstanceOf[DocumentationPartType]
  val AUTHORIZER = "AUTHORIZER".asInstanceOf[DocumentationPartType]
  val MODEL = "MODEL".asInstanceOf[DocumentationPartType]
  val RESOURCE = "RESOURCE".asInstanceOf[DocumentationPartType]
  val METHOD = "METHOD".asInstanceOf[DocumentationPartType]
  val PATH_PARAMETER = "PATH_PARAMETER".asInstanceOf[DocumentationPartType]
  val QUERY_PARAMETER = "QUERY_PARAMETER".asInstanceOf[DocumentationPartType]
  val REQUEST_HEADER = "REQUEST_HEADER".asInstanceOf[DocumentationPartType]
  val REQUEST_BODY = "REQUEST_BODY".asInstanceOf[DocumentationPartType]
  val RESPONSE = "RESPONSE".asInstanceOf[DocumentationPartType]
  val RESPONSE_HEADER = "RESPONSE_HEADER".asInstanceOf[DocumentationPartType]
  val RESPONSE_BODY = "RESPONSE_BODY".asInstanceOf[DocumentationPartType]

  @inline def values = js.Array(API, AUTHORIZER, MODEL, RESOURCE, METHOD, PATH_PARAMETER, QUERY_PARAMETER, REQUEST_HEADER, REQUEST_BODY, RESPONSE, RESPONSE_HEADER, RESPONSE_BODY)
}

@js.native
sealed trait DomainNameStatus extends js.Any
object DomainNameStatus {
  val AVAILABLE = "AVAILABLE".asInstanceOf[DomainNameStatus]
  val UPDATING = "UPDATING".asInstanceOf[DomainNameStatus]
  val PENDING = "PENDING".asInstanceOf[DomainNameStatus]

  @inline def values = js.Array(AVAILABLE, UPDATING, PENDING)
}

/** The endpoint type. The valid values are <code>EDGE</code> for edge-optimized API setup, most suitable for mobile applications; <code>REGIONAL</code> for regional API endpoint setup, most suitable for calling from AWS Region; and <code>PRIVATE</code> for private APIs.
  */
@js.native
sealed trait EndpointType extends js.Any
object EndpointType {
  val REGIONAL = "REGIONAL".asInstanceOf[EndpointType]
  val EDGE = "EDGE".asInstanceOf[EndpointType]
  val PRIVATE = "PRIVATE".asInstanceOf[EndpointType]

  @inline def values = js.Array(REGIONAL, EDGE, PRIVATE)
}

@js.native
sealed trait GatewayResponseType extends js.Any
object GatewayResponseType {
  val DEFAULT_4XX = "DEFAULT_4XX".asInstanceOf[GatewayResponseType]
  val DEFAULT_5XX = "DEFAULT_5XX".asInstanceOf[GatewayResponseType]
  val RESOURCE_NOT_FOUND = "RESOURCE_NOT_FOUND".asInstanceOf[GatewayResponseType]
  val UNAUTHORIZED = "UNAUTHORIZED".asInstanceOf[GatewayResponseType]
  val INVALID_API_KEY = "INVALID_API_KEY".asInstanceOf[GatewayResponseType]
  val ACCESS_DENIED = "ACCESS_DENIED".asInstanceOf[GatewayResponseType]
  val AUTHORIZER_FAILURE = "AUTHORIZER_FAILURE".asInstanceOf[GatewayResponseType]
  val AUTHORIZER_CONFIGURATION_ERROR = "AUTHORIZER_CONFIGURATION_ERROR".asInstanceOf[GatewayResponseType]
  val INVALID_SIGNATURE = "INVALID_SIGNATURE".asInstanceOf[GatewayResponseType]
  val EXPIRED_TOKEN = "EXPIRED_TOKEN".asInstanceOf[GatewayResponseType]
  val MISSING_AUTHENTICATION_TOKEN = "MISSING_AUTHENTICATION_TOKEN".asInstanceOf[GatewayResponseType]
  val INTEGRATION_FAILURE = "INTEGRATION_FAILURE".asInstanceOf[GatewayResponseType]
  val INTEGRATION_TIMEOUT = "INTEGRATION_TIMEOUT".asInstanceOf[GatewayResponseType]
  val API_CONFIGURATION_ERROR = "API_CONFIGURATION_ERROR".asInstanceOf[GatewayResponseType]
  val UNSUPPORTED_MEDIA_TYPE = "UNSUPPORTED_MEDIA_TYPE".asInstanceOf[GatewayResponseType]
  val BAD_REQUEST_PARAMETERS = "BAD_REQUEST_PARAMETERS".asInstanceOf[GatewayResponseType]
  val BAD_REQUEST_BODY = "BAD_REQUEST_BODY".asInstanceOf[GatewayResponseType]
  val REQUEST_TOO_LARGE = "REQUEST_TOO_LARGE".asInstanceOf[GatewayResponseType]
  val THROTTLED = "THROTTLED".asInstanceOf[GatewayResponseType]
  val QUOTA_EXCEEDED = "QUOTA_EXCEEDED".asInstanceOf[GatewayResponseType]

  @inline def values = js.Array(DEFAULT_4XX, DEFAULT_5XX, RESOURCE_NOT_FOUND, UNAUTHORIZED, INVALID_API_KEY, ACCESS_DENIED, AUTHORIZER_FAILURE, AUTHORIZER_CONFIGURATION_ERROR, INVALID_SIGNATURE, EXPIRED_TOKEN, MISSING_AUTHENTICATION_TOKEN, INTEGRATION_FAILURE, INTEGRATION_TIMEOUT, API_CONFIGURATION_ERROR, UNSUPPORTED_MEDIA_TYPE, BAD_REQUEST_PARAMETERS, BAD_REQUEST_BODY, REQUEST_TOO_LARGE, THROTTLED, QUOTA_EXCEEDED)
}

/** The integration type. The valid value is <code>HTTP</code> for integrating an API method with an HTTP backend; <code>AWS</code> with any AWS service endpoints; <code>MOCK</code> for testing without actually invoking the backend; <code>HTTP_PROXY</code> for integrating with the HTTP proxy integration; <code>AWS_PROXY</code> for integrating with the Lambda proxy integration.
  */
@js.native
sealed trait IntegrationType extends js.Any
object IntegrationType {
  val HTTP = "HTTP".asInstanceOf[IntegrationType]
  val AWS = "AWS".asInstanceOf[IntegrationType]
  val MOCK = "MOCK".asInstanceOf[IntegrationType]
  val HTTP_PROXY = "HTTP_PROXY".asInstanceOf[IntegrationType]
  val AWS_PROXY = "AWS_PROXY".asInstanceOf[IntegrationType]

  @inline def values = js.Array(HTTP, AWS, MOCK, HTTP_PROXY, AWS_PROXY)
}

@js.native
sealed trait LocationStatusType extends js.Any
object LocationStatusType {
  val DOCUMENTED = "DOCUMENTED".asInstanceOf[LocationStatusType]
  val UNDOCUMENTED = "UNDOCUMENTED".asInstanceOf[LocationStatusType]

  @inline def values = js.Array(DOCUMENTED, UNDOCUMENTED)
}

@js.native
sealed trait Op extends js.Any
object Op {
  val add = "add".asInstanceOf[Op]
  val remove = "remove".asInstanceOf[Op]
  val replace = "replace".asInstanceOf[Op]
  val move = "move".asInstanceOf[Op]
  val copy = "copy".asInstanceOf[Op]
  val test = "test".asInstanceOf[Op]

  @inline def values = js.Array(add, remove, replace, move, copy, test)
}

@js.native
sealed trait PutMode extends js.Any
object PutMode {
  val merge = "merge".asInstanceOf[PutMode]
  val overwrite = "overwrite".asInstanceOf[PutMode]

  @inline def values = js.Array(merge, overwrite)
}

@js.native
sealed trait QuotaPeriodType extends js.Any
object QuotaPeriodType {
  val DAY = "DAY".asInstanceOf[QuotaPeriodType]
  val WEEK = "WEEK".asInstanceOf[QuotaPeriodType]
  val MONTH = "MONTH".asInstanceOf[QuotaPeriodType]

  @inline def values = js.Array(DAY, WEEK, MONTH)
}

@js.native
sealed trait SecurityPolicy extends js.Any
object SecurityPolicy {
  val TLS_1_0 = "TLS_1_0".asInstanceOf[SecurityPolicy]
  val TLS_1_2 = "TLS_1_2".asInstanceOf[SecurityPolicy]

  @inline def values = js.Array(TLS_1_0, TLS_1_2)
}

@js.native
sealed trait UnauthorizedCacheControlHeaderStrategy extends js.Any
object UnauthorizedCacheControlHeaderStrategy {
  val FAIL_WITH_403 = "FAIL_WITH_403".asInstanceOf[UnauthorizedCacheControlHeaderStrategy]
  val SUCCEED_WITH_RESPONSE_HEADER = "SUCCEED_WITH_RESPONSE_HEADER".asInstanceOf[UnauthorizedCacheControlHeaderStrategy]
  val SUCCEED_WITHOUT_RESPONSE_HEADER = "SUCCEED_WITHOUT_RESPONSE_HEADER".asInstanceOf[UnauthorizedCacheControlHeaderStrategy]

  @inline def values = js.Array(FAIL_WITH_403, SUCCEED_WITH_RESPONSE_HEADER, SUCCEED_WITHOUT_RESPONSE_HEADER)
}

@js.native
sealed trait VpcLinkStatus extends js.Any
object VpcLinkStatus {
  val AVAILABLE = "AVAILABLE".asInstanceOf[VpcLinkStatus]
  val PENDING = "PENDING".asInstanceOf[VpcLinkStatus]
  val DELETING = "DELETING".asInstanceOf[VpcLinkStatus]
  val FAILED = "FAILED".asInstanceOf[VpcLinkStatus]

  @inline def values = js.Array(AVAILABLE, PENDING, DELETING, FAILED)
}

