package facade.amazonaws.services.apigateway

import scalajs.js

type ApiKeySourceType = "HEADER" | "AUTHORIZER"
object ApiKeySourceType {
  inline val HEADER: "HEADER" = "HEADER"
  inline val AUTHORIZER: "AUTHORIZER" = "AUTHORIZER"

  inline def values: js.Array[ApiKeySourceType] = js.Array(HEADER, AUTHORIZER)
}

type ApiKeysFormat = "csv"
object ApiKeysFormat {
  inline val csv: "csv" = "csv"

  inline def values: js.Array[ApiKeysFormat] = js.Array(csv)
}

/** The authorizer type. Valid values are <code>TOKEN</code> for a Lambda function using a single authorization token submitted in a custom header, <code>REQUEST</code> for a Lambda function using incoming request parameters, and <code>COGNITO_USER_POOLS</code> for using an Amazon Cognito user pool.
  */
type AuthorizerType = "TOKEN" | "REQUEST" | "COGNITO_USER_POOLS"
object AuthorizerType {
  inline val TOKEN: "TOKEN" = "TOKEN"
  inline val REQUEST: "REQUEST" = "REQUEST"
  inline val COGNITO_USER_POOLS: "COGNITO_USER_POOLS" = "COGNITO_USER_POOLS"

  inline def values: js.Array[AuthorizerType] = js.Array(TOKEN, REQUEST, COGNITO_USER_POOLS)
}

/** Returns the size of the ```CacheCluster```.
  */
type CacheClusterSize = "0.5" | "1.6" | "6.1" | "13.5" | "28.4" | "58.2" | "118" | "237"
object CacheClusterSize {
  inline val `0.5`: "0.5" = "0.5"
  inline val `1.6`: "1.6" = "1.6"
  inline val `6.1`: "6.1" = "6.1"
  inline val `13.5`: "13.5" = "13.5"
  inline val `28.4`: "28.4" = "28.4"
  inline val `58.2`: "58.2" = "58.2"
  inline val `118`: "118" = "118"
  inline val `237`: "237" = "237"

  inline def values: js.Array[CacheClusterSize] = js.Array(`0.5`, `1.6`, `6.1`, `13.5`, `28.4`, `58.2`, `118`, `237`)
}

/** Returns the status of the ```CacheCluster```.
  */
type CacheClusterStatus = "CREATE_IN_PROGRESS" | "AVAILABLE" | "DELETE_IN_PROGRESS" | "NOT_AVAILABLE" | "FLUSH_IN_PROGRESS"
object CacheClusterStatus {
  inline val CREATE_IN_PROGRESS: "CREATE_IN_PROGRESS" = "CREATE_IN_PROGRESS"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val DELETE_IN_PROGRESS: "DELETE_IN_PROGRESS" = "DELETE_IN_PROGRESS"
  inline val NOT_AVAILABLE: "NOT_AVAILABLE" = "NOT_AVAILABLE"
  inline val FLUSH_IN_PROGRESS: "FLUSH_IN_PROGRESS" = "FLUSH_IN_PROGRESS"

  inline def values: js.Array[CacheClusterStatus] = js.Array(CREATE_IN_PROGRESS, AVAILABLE, DELETE_IN_PROGRESS, NOT_AVAILABLE, FLUSH_IN_PROGRESS)
}

type ConnectionType = "INTERNET" | "VPC_LINK"
object ConnectionType {
  inline val INTERNET: "INTERNET" = "INTERNET"
  inline val VPC_LINK: "VPC_LINK" = "VPC_LINK"

  inline def values: js.Array[ConnectionType] = js.Array(INTERNET, VPC_LINK)
}

type ContentHandlingStrategy = "CONVERT_TO_BINARY" | "CONVERT_TO_TEXT"
object ContentHandlingStrategy {
  inline val CONVERT_TO_BINARY: "CONVERT_TO_BINARY" = "CONVERT_TO_BINARY"
  inline val CONVERT_TO_TEXT: "CONVERT_TO_TEXT" = "CONVERT_TO_TEXT"

  inline def values: js.Array[ContentHandlingStrategy] = js.Array(CONVERT_TO_BINARY, CONVERT_TO_TEXT)
}

type DocumentationPartType = "API" | "AUTHORIZER" | "MODEL" | "RESOURCE" | "METHOD" | "PATH_PARAMETER" | "QUERY_PARAMETER" | "REQUEST_HEADER" | "REQUEST_BODY" | "RESPONSE" | "RESPONSE_HEADER" | "RESPONSE_BODY"
object DocumentationPartType {
  inline val API: "API" = "API"
  inline val AUTHORIZER: "AUTHORIZER" = "AUTHORIZER"
  inline val MODEL: "MODEL" = "MODEL"
  inline val RESOURCE: "RESOURCE" = "RESOURCE"
  inline val METHOD: "METHOD" = "METHOD"
  inline val PATH_PARAMETER: "PATH_PARAMETER" = "PATH_PARAMETER"
  inline val QUERY_PARAMETER: "QUERY_PARAMETER" = "QUERY_PARAMETER"
  inline val REQUEST_HEADER: "REQUEST_HEADER" = "REQUEST_HEADER"
  inline val REQUEST_BODY: "REQUEST_BODY" = "REQUEST_BODY"
  inline val RESPONSE: "RESPONSE" = "RESPONSE"
  inline val RESPONSE_HEADER: "RESPONSE_HEADER" = "RESPONSE_HEADER"
  inline val RESPONSE_BODY: "RESPONSE_BODY" = "RESPONSE_BODY"

  inline def values: js.Array[DocumentationPartType] = js.Array(API, AUTHORIZER, MODEL, RESOURCE, METHOD, PATH_PARAMETER, QUERY_PARAMETER, REQUEST_HEADER, REQUEST_BODY, RESPONSE, RESPONSE_HEADER, RESPONSE_BODY)
}

type DomainNameStatus = "AVAILABLE" | "UPDATING" | "PENDING"
object DomainNameStatus {
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val UPDATING: "UPDATING" = "UPDATING"
  inline val PENDING: "PENDING" = "PENDING"

  inline def values: js.Array[DomainNameStatus] = js.Array(AVAILABLE, UPDATING, PENDING)
}

/** The endpoint type. The valid values are <code>EDGE</code> for edge-optimized API setup, most suitable for mobile applications; <code>REGIONAL</code> for regional API endpoint setup, most suitable for calling from AWS Region; and <code>PRIVATE</code> for private APIs.
  */
type EndpointType = "REGIONAL" | "EDGE" | "PRIVATE"
object EndpointType {
  inline val REGIONAL: "REGIONAL" = "REGIONAL"
  inline val EDGE: "EDGE" = "EDGE"
  inline val PRIVATE: "PRIVATE" = "PRIVATE"

  inline def values: js.Array[EndpointType] = js.Array(REGIONAL, EDGE, PRIVATE)
}

type GatewayResponseType = "DEFAULT_4XX" | "DEFAULT_5XX" | "RESOURCE_NOT_FOUND" | "UNAUTHORIZED" | "INVALID_API_KEY" | "ACCESS_DENIED" | "AUTHORIZER_FAILURE" | "AUTHORIZER_CONFIGURATION_ERROR" | "INVALID_SIGNATURE" | "EXPIRED_TOKEN" | "MISSING_AUTHENTICATION_TOKEN" | "INTEGRATION_FAILURE" | "INTEGRATION_TIMEOUT" | "API_CONFIGURATION_ERROR" | "UNSUPPORTED_MEDIA_TYPE" | "BAD_REQUEST_PARAMETERS" | "BAD_REQUEST_BODY" | "REQUEST_TOO_LARGE" | "THROTTLED" | "QUOTA_EXCEEDED"
object GatewayResponseType {
  inline val DEFAULT_4XX: "DEFAULT_4XX" = "DEFAULT_4XX"
  inline val DEFAULT_5XX: "DEFAULT_5XX" = "DEFAULT_5XX"
  inline val RESOURCE_NOT_FOUND: "RESOURCE_NOT_FOUND" = "RESOURCE_NOT_FOUND"
  inline val UNAUTHORIZED: "UNAUTHORIZED" = "UNAUTHORIZED"
  inline val INVALID_API_KEY: "INVALID_API_KEY" = "INVALID_API_KEY"
  inline val ACCESS_DENIED: "ACCESS_DENIED" = "ACCESS_DENIED"
  inline val AUTHORIZER_FAILURE: "AUTHORIZER_FAILURE" = "AUTHORIZER_FAILURE"
  inline val AUTHORIZER_CONFIGURATION_ERROR: "AUTHORIZER_CONFIGURATION_ERROR" = "AUTHORIZER_CONFIGURATION_ERROR"
  inline val INVALID_SIGNATURE: "INVALID_SIGNATURE" = "INVALID_SIGNATURE"
  inline val EXPIRED_TOKEN: "EXPIRED_TOKEN" = "EXPIRED_TOKEN"
  inline val MISSING_AUTHENTICATION_TOKEN: "MISSING_AUTHENTICATION_TOKEN" = "MISSING_AUTHENTICATION_TOKEN"
  inline val INTEGRATION_FAILURE: "INTEGRATION_FAILURE" = "INTEGRATION_FAILURE"
  inline val INTEGRATION_TIMEOUT: "INTEGRATION_TIMEOUT" = "INTEGRATION_TIMEOUT"
  inline val API_CONFIGURATION_ERROR: "API_CONFIGURATION_ERROR" = "API_CONFIGURATION_ERROR"
  inline val UNSUPPORTED_MEDIA_TYPE: "UNSUPPORTED_MEDIA_TYPE" = "UNSUPPORTED_MEDIA_TYPE"
  inline val BAD_REQUEST_PARAMETERS: "BAD_REQUEST_PARAMETERS" = "BAD_REQUEST_PARAMETERS"
  inline val BAD_REQUEST_BODY: "BAD_REQUEST_BODY" = "BAD_REQUEST_BODY"
  inline val REQUEST_TOO_LARGE: "REQUEST_TOO_LARGE" = "REQUEST_TOO_LARGE"
  inline val THROTTLED: "THROTTLED" = "THROTTLED"
  inline val QUOTA_EXCEEDED: "QUOTA_EXCEEDED" = "QUOTA_EXCEEDED"

  inline def values: js.Array[GatewayResponseType] = js.Array(
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
  inline val HTTP: "HTTP" = "HTTP"
  inline val AWS: "AWS" = "AWS"
  inline val MOCK: "MOCK" = "MOCK"
  inline val HTTP_PROXY: "HTTP_PROXY" = "HTTP_PROXY"
  inline val AWS_PROXY: "AWS_PROXY" = "AWS_PROXY"

  inline def values: js.Array[IntegrationType] = js.Array(HTTP, AWS, MOCK, HTTP_PROXY, AWS_PROXY)
}

type LocationStatusType = "DOCUMENTED" | "UNDOCUMENTED"
object LocationStatusType {
  inline val DOCUMENTED: "DOCUMENTED" = "DOCUMENTED"
  inline val UNDOCUMENTED: "UNDOCUMENTED" = "UNDOCUMENTED"

  inline def values: js.Array[LocationStatusType] = js.Array(DOCUMENTED, UNDOCUMENTED)
}

type Op = "add" | "remove" | "replace" | "move" | "copy" | "test"
object Op {
  inline val add: "add" = "add"
  inline val remove: "remove" = "remove"
  inline val replace: "replace" = "replace"
  inline val move: "move" = "move"
  inline val copy: "copy" = "copy"
  inline val test: "test" = "test"

  inline def values: js.Array[Op] = js.Array(add, remove, replace, move, copy, test)
}

type PutMode = "merge" | "overwrite"
object PutMode {
  inline val merge: "merge" = "merge"
  inline val overwrite: "overwrite" = "overwrite"

  inline def values: js.Array[PutMode] = js.Array(merge, overwrite)
}

type QuotaPeriodType = "DAY" | "WEEK" | "MONTH"
object QuotaPeriodType {
  inline val DAY: "DAY" = "DAY"
  inline val WEEK: "WEEK" = "WEEK"
  inline val MONTH: "MONTH" = "MONTH"

  inline def values: js.Array[QuotaPeriodType] = js.Array(DAY, WEEK, MONTH)
}

type SecurityPolicy = "TLS_1_0" | "TLS_1_2"
object SecurityPolicy {
  inline val TLS_1_0: "TLS_1_0" = "TLS_1_0"
  inline val TLS_1_2: "TLS_1_2" = "TLS_1_2"

  inline def values: js.Array[SecurityPolicy] = js.Array(TLS_1_0, TLS_1_2)
}

type UnauthorizedCacheControlHeaderStrategy = "FAIL_WITH_403" | "SUCCEED_WITH_RESPONSE_HEADER" | "SUCCEED_WITHOUT_RESPONSE_HEADER"
object UnauthorizedCacheControlHeaderStrategy {
  inline val FAIL_WITH_403: "FAIL_WITH_403" = "FAIL_WITH_403"
  inline val SUCCEED_WITH_RESPONSE_HEADER: "SUCCEED_WITH_RESPONSE_HEADER" = "SUCCEED_WITH_RESPONSE_HEADER"
  inline val SUCCEED_WITHOUT_RESPONSE_HEADER: "SUCCEED_WITHOUT_RESPONSE_HEADER" = "SUCCEED_WITHOUT_RESPONSE_HEADER"

  inline def values: js.Array[UnauthorizedCacheControlHeaderStrategy] = js.Array(FAIL_WITH_403, SUCCEED_WITH_RESPONSE_HEADER, SUCCEED_WITHOUT_RESPONSE_HEADER)
}

type VpcLinkStatus = "AVAILABLE" | "PENDING" | "DELETING" | "FAILED"
object VpcLinkStatus {
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val PENDING: "PENDING" = "PENDING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[VpcLinkStatus] = js.Array(AVAILABLE, PENDING, DELETING, FAILED)
}
