package facade.amazonaws.services.apigateway

import scalajs._

type ApiKeySourceType = "HEADER" | "AUTHORIZER"
object ApiKeySourceType {
  val HEADER: "HEADER" = "HEADER"
  val AUTHORIZER: "AUTHORIZER" = "AUTHORIZER"

  @inline def values = js.Array[ApiKeySourceType](HEADER, AUTHORIZER)
}

type ApiKeysFormat = "csv"
object ApiKeysFormat {
  val csv: "csv" = "csv"

  @inline def values = js.Array[ApiKeysFormat](csv)
}

/** The authorizer type. Valid values are <code>TOKEN</code> for a Lambda function using a single authorization token submitted in a custom header, <code>REQUEST</code> for a Lambda function using incoming request parameters, and <code>COGNITO_USER_POOLS</code> for using an Amazon Cognito user pool.
  */
type AuthorizerType = "TOKEN" | "REQUEST" | "COGNITO_USER_POOLS"
object AuthorizerType {
  val TOKEN: "TOKEN" = "TOKEN"
  val REQUEST: "REQUEST" = "REQUEST"
  val COGNITO_USER_POOLS: "COGNITO_USER_POOLS" = "COGNITO_USER_POOLS"

  @inline def values = js.Array[AuthorizerType](TOKEN, REQUEST, COGNITO_USER_POOLS)
}

/** Returns the size of the ```CacheCluster```.
  */
type CacheClusterSize = "0.5" | "1.6" | "6.1" | "13.5" | "28.4" | "58.2" | "118" | "237"
object CacheClusterSize {
  val `0.5`: "0.5" = "0.5"
  val `1.6`: "1.6" = "1.6"
  val `6.1`: "6.1" = "6.1"
  val `13.5`: "13.5" = "13.5"
  val `28.4`: "28.4" = "28.4"
  val `58.2`: "58.2" = "58.2"
  val `118`: "118" = "118"
  val `237`: "237" = "237"

  @inline def values = js.Array[CacheClusterSize](`0.5`, `1.6`, `6.1`, `13.5`, `28.4`, `58.2`, `118`, `237`)
}

/** Returns the status of the ```CacheCluster```.
  */
type CacheClusterStatus = "CREATE_IN_PROGRESS" | "AVAILABLE" | "DELETE_IN_PROGRESS" | "NOT_AVAILABLE" | "FLUSH_IN_PROGRESS"
object CacheClusterStatus {
  val CREATE_IN_PROGRESS: "CREATE_IN_PROGRESS" = "CREATE_IN_PROGRESS"
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val DELETE_IN_PROGRESS: "DELETE_IN_PROGRESS" = "DELETE_IN_PROGRESS"
  val NOT_AVAILABLE: "NOT_AVAILABLE" = "NOT_AVAILABLE"
  val FLUSH_IN_PROGRESS: "FLUSH_IN_PROGRESS" = "FLUSH_IN_PROGRESS"

  @inline def values = js.Array[CacheClusterStatus](CREATE_IN_PROGRESS, AVAILABLE, DELETE_IN_PROGRESS, NOT_AVAILABLE, FLUSH_IN_PROGRESS)
}

type ConnectionType = "INTERNET" | "VPC_LINK"
object ConnectionType {
  val INTERNET: "INTERNET" = "INTERNET"
  val VPC_LINK: "VPC_LINK" = "VPC_LINK"

  @inline def values = js.Array[ConnectionType](INTERNET, VPC_LINK)
}

type ContentHandlingStrategy = "CONVERT_TO_BINARY" | "CONVERT_TO_TEXT"
object ContentHandlingStrategy {
  val CONVERT_TO_BINARY: "CONVERT_TO_BINARY" = "CONVERT_TO_BINARY"
  val CONVERT_TO_TEXT: "CONVERT_TO_TEXT" = "CONVERT_TO_TEXT"

  @inline def values = js.Array[ContentHandlingStrategy](CONVERT_TO_BINARY, CONVERT_TO_TEXT)
}

type DocumentationPartType = "API" | "AUTHORIZER" | "MODEL" | "RESOURCE" | "METHOD" | "PATH_PARAMETER" | "QUERY_PARAMETER" | "REQUEST_HEADER" | "REQUEST_BODY" | "RESPONSE" | "RESPONSE_HEADER" | "RESPONSE_BODY"
object DocumentationPartType {
  val API: "API" = "API"
  val AUTHORIZER: "AUTHORIZER" = "AUTHORIZER"
  val MODEL: "MODEL" = "MODEL"
  val RESOURCE: "RESOURCE" = "RESOURCE"
  val METHOD: "METHOD" = "METHOD"
  val PATH_PARAMETER: "PATH_PARAMETER" = "PATH_PARAMETER"
  val QUERY_PARAMETER: "QUERY_PARAMETER" = "QUERY_PARAMETER"
  val REQUEST_HEADER: "REQUEST_HEADER" = "REQUEST_HEADER"
  val REQUEST_BODY: "REQUEST_BODY" = "REQUEST_BODY"
  val RESPONSE: "RESPONSE" = "RESPONSE"
  val RESPONSE_HEADER: "RESPONSE_HEADER" = "RESPONSE_HEADER"
  val RESPONSE_BODY: "RESPONSE_BODY" = "RESPONSE_BODY"

  @inline def values = js.Array[DocumentationPartType](API, AUTHORIZER, MODEL, RESOURCE, METHOD, PATH_PARAMETER, QUERY_PARAMETER, REQUEST_HEADER, REQUEST_BODY, RESPONSE, RESPONSE_HEADER, RESPONSE_BODY)
}

type DomainNameStatus = "AVAILABLE" | "UPDATING" | "PENDING"
object DomainNameStatus {
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val UPDATING: "UPDATING" = "UPDATING"
  val PENDING: "PENDING" = "PENDING"

  @inline def values = js.Array[DomainNameStatus](AVAILABLE, UPDATING, PENDING)
}

/** The endpoint type. The valid values are <code>EDGE</code> for edge-optimized API setup, most suitable for mobile applications; <code>REGIONAL</code> for regional API endpoint setup, most suitable for calling from AWS Region; and <code>PRIVATE</code> for private APIs.
  */
type EndpointType = "REGIONAL" | "EDGE" | "PRIVATE"
object EndpointType {
  val REGIONAL: "REGIONAL" = "REGIONAL"
  val EDGE: "EDGE" = "EDGE"
  val PRIVATE: "PRIVATE" = "PRIVATE"

  @inline def values = js.Array[EndpointType](REGIONAL, EDGE, PRIVATE)
}

type GatewayResponseType = "DEFAULT_4XX" | "DEFAULT_5XX" | "RESOURCE_NOT_FOUND" | "UNAUTHORIZED" | "INVALID_API_KEY" | "ACCESS_DENIED" | "AUTHORIZER_FAILURE" | "AUTHORIZER_CONFIGURATION_ERROR" | "INVALID_SIGNATURE" | "EXPIRED_TOKEN" | "MISSING_AUTHENTICATION_TOKEN" | "INTEGRATION_FAILURE" | "INTEGRATION_TIMEOUT" | "API_CONFIGURATION_ERROR" | "UNSUPPORTED_MEDIA_TYPE" | "BAD_REQUEST_PARAMETERS" | "BAD_REQUEST_BODY" | "REQUEST_TOO_LARGE" | "THROTTLED" | "QUOTA_EXCEEDED"
object GatewayResponseType {
  val DEFAULT_4XX: "DEFAULT_4XX" = "DEFAULT_4XX"
  val DEFAULT_5XX: "DEFAULT_5XX" = "DEFAULT_5XX"
  val RESOURCE_NOT_FOUND: "RESOURCE_NOT_FOUND" = "RESOURCE_NOT_FOUND"
  val UNAUTHORIZED: "UNAUTHORIZED" = "UNAUTHORIZED"
  val INVALID_API_KEY: "INVALID_API_KEY" = "INVALID_API_KEY"
  val ACCESS_DENIED: "ACCESS_DENIED" = "ACCESS_DENIED"
  val AUTHORIZER_FAILURE: "AUTHORIZER_FAILURE" = "AUTHORIZER_FAILURE"
  val AUTHORIZER_CONFIGURATION_ERROR: "AUTHORIZER_CONFIGURATION_ERROR" = "AUTHORIZER_CONFIGURATION_ERROR"
  val INVALID_SIGNATURE: "INVALID_SIGNATURE" = "INVALID_SIGNATURE"
  val EXPIRED_TOKEN: "EXPIRED_TOKEN" = "EXPIRED_TOKEN"
  val MISSING_AUTHENTICATION_TOKEN: "MISSING_AUTHENTICATION_TOKEN" = "MISSING_AUTHENTICATION_TOKEN"
  val INTEGRATION_FAILURE: "INTEGRATION_FAILURE" = "INTEGRATION_FAILURE"
  val INTEGRATION_TIMEOUT: "INTEGRATION_TIMEOUT" = "INTEGRATION_TIMEOUT"
  val API_CONFIGURATION_ERROR: "API_CONFIGURATION_ERROR" = "API_CONFIGURATION_ERROR"
  val UNSUPPORTED_MEDIA_TYPE: "UNSUPPORTED_MEDIA_TYPE" = "UNSUPPORTED_MEDIA_TYPE"
  val BAD_REQUEST_PARAMETERS: "BAD_REQUEST_PARAMETERS" = "BAD_REQUEST_PARAMETERS"
  val BAD_REQUEST_BODY: "BAD_REQUEST_BODY" = "BAD_REQUEST_BODY"
  val REQUEST_TOO_LARGE: "REQUEST_TOO_LARGE" = "REQUEST_TOO_LARGE"
  val THROTTLED: "THROTTLED" = "THROTTLED"
  val QUOTA_EXCEEDED: "QUOTA_EXCEEDED" = "QUOTA_EXCEEDED"

  @inline def values = js.Array[GatewayResponseType](
    DEFAULT_4XX,
    DEFAULT_5XX,
    RESOURCE_NOT_FOUND,
    UNAUTHORIZED,
    INVALID_API_KEY,
    ACCESS_DENIED,
    AUTHORIZER_FAILURE,
    AUTHORIZER_CONFIGURATION_ERROR,
    INVALID_SIGNATURE,
    EXPIRED_TOKEN,
    MISSING_AUTHENTICATION_TOKEN,
    INTEGRATION_FAILURE,
    INTEGRATION_TIMEOUT,
    API_CONFIGURATION_ERROR,
    UNSUPPORTED_MEDIA_TYPE,
    BAD_REQUEST_PARAMETERS,
    BAD_REQUEST_BODY,
    REQUEST_TOO_LARGE,
    THROTTLED,
    QUOTA_EXCEEDED
  )
}

/** The integration type. The valid value is <code>HTTP</code> for integrating an API method with an HTTP backend; <code>AWS</code> with any AWS service endpoints; <code>MOCK</code> for testing without actually invoking the backend; <code>HTTP_PROXY</code> for integrating with the HTTP proxy integration; <code>AWS_PROXY</code> for integrating with the Lambda proxy integration.
  */
type IntegrationType = "HTTP" | "AWS" | "MOCK" | "HTTP_PROXY" | "AWS_PROXY"
object IntegrationType {
  val HTTP: "HTTP" = "HTTP"
  val AWS: "AWS" = "AWS"
  val MOCK: "MOCK" = "MOCK"
  val HTTP_PROXY: "HTTP_PROXY" = "HTTP_PROXY"
  val AWS_PROXY: "AWS_PROXY" = "AWS_PROXY"

  @inline def values = js.Array[IntegrationType](HTTP, AWS, MOCK, HTTP_PROXY, AWS_PROXY)
}

type LocationStatusType = "DOCUMENTED" | "UNDOCUMENTED"
object LocationStatusType {
  val DOCUMENTED: "DOCUMENTED" = "DOCUMENTED"
  val UNDOCUMENTED: "UNDOCUMENTED" = "UNDOCUMENTED"

  @inline def values = js.Array[LocationStatusType](DOCUMENTED, UNDOCUMENTED)
}

type Op = "add" | "remove" | "replace" | "move" | "copy" | "test"
object Op {
  val add: "add" = "add"
  val remove: "remove" = "remove"
  val replace: "replace" = "replace"
  val move: "move" = "move"
  val copy: "copy" = "copy"
  val test: "test" = "test"

  @inline def values = js.Array[Op](add, remove, replace, move, copy, test)
}

type PutMode = "merge" | "overwrite"
object PutMode {
  val merge: "merge" = "merge"
  val overwrite: "overwrite" = "overwrite"

  @inline def values = js.Array[PutMode](merge, overwrite)
}

type QuotaPeriodType = "DAY" | "WEEK" | "MONTH"
object QuotaPeriodType {
  val DAY: "DAY" = "DAY"
  val WEEK: "WEEK" = "WEEK"
  val MONTH: "MONTH" = "MONTH"

  @inline def values = js.Array[QuotaPeriodType](DAY, WEEK, MONTH)
}

type SecurityPolicy = "TLS_1_0" | "TLS_1_2"
object SecurityPolicy {
  val TLS_1_0: "TLS_1_0" = "TLS_1_0"
  val TLS_1_2: "TLS_1_2" = "TLS_1_2"

  @inline def values = js.Array[SecurityPolicy](TLS_1_0, TLS_1_2)
}

type UnauthorizedCacheControlHeaderStrategy = "FAIL_WITH_403" | "SUCCEED_WITH_RESPONSE_HEADER" | "SUCCEED_WITHOUT_RESPONSE_HEADER"
object UnauthorizedCacheControlHeaderStrategy {
  val FAIL_WITH_403: "FAIL_WITH_403" = "FAIL_WITH_403"
  val SUCCEED_WITH_RESPONSE_HEADER: "SUCCEED_WITH_RESPONSE_HEADER" = "SUCCEED_WITH_RESPONSE_HEADER"
  val SUCCEED_WITHOUT_RESPONSE_HEADER: "SUCCEED_WITHOUT_RESPONSE_HEADER" = "SUCCEED_WITHOUT_RESPONSE_HEADER"

  @inline def values = js.Array[UnauthorizedCacheControlHeaderStrategy](FAIL_WITH_403, SUCCEED_WITH_RESPONSE_HEADER, SUCCEED_WITHOUT_RESPONSE_HEADER)
}

type VpcLinkStatus = "AVAILABLE" | "PENDING" | "DELETING" | "FAILED"
object VpcLinkStatus {
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val PENDING: "PENDING" = "PENDING"
  val DELETING: "DELETING" = "DELETING"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[VpcLinkStatus](AVAILABLE, PENDING, DELETING, FAILED)
}
