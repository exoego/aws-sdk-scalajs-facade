package facade.amazonaws.services.apigatewayv2

import scalajs._

/** The authorization type. For WebSocket APIs, valid values are NONE for open access, AWS_IAM for using AWS IAM permissions, and CUSTOM for using a Lambda authorizer. For HTTP APIs, valid values are NONE for open access, JWT for using JSON Web Tokens, AWS_IAM for using AWS IAM permissions, and CUSTOM for using a Lambda authorizer.
  */
type AuthorizationType = "NONE" | "AWS_IAM" | "CUSTOM" | "JWT"
object AuthorizationType {
  inline val NONE: "NONE" = "NONE"
  inline val AWS_IAM: "AWS_IAM" = "AWS_IAM"
  inline val CUSTOM: "CUSTOM" = "CUSTOM"
  inline val JWT: "JWT" = "JWT"

  inline def values: js.Array[AuthorizationType] = js.Array(NONE, AWS_IAM, CUSTOM, JWT)
}

/** The authorizer type. Specify REQUEST for a Lambda function using incoming request parameters. Specify JWT to use JSON Web Tokens (supported only for HTTP APIs).
  */
type AuthorizerType = "REQUEST" | "JWT"
object AuthorizerType {
  inline val REQUEST: "REQUEST" = "REQUEST"
  inline val JWT: "JWT" = "JWT"

  inline def values: js.Array[AuthorizerType] = js.Array(REQUEST, JWT)
}

/** Represents a connection type.
  */
type ConnectionType = "INTERNET" | "VPC_LINK"
object ConnectionType {
  inline val INTERNET: "INTERNET" = "INTERNET"
  inline val VPC_LINK: "VPC_LINK" = "VPC_LINK"

  inline def values: js.Array[ConnectionType] = js.Array(INTERNET, VPC_LINK)
}

/** Specifies how to handle response payload content type conversions. Supported only for WebSocket APIs.
  */
type ContentHandlingStrategy = "CONVERT_TO_BINARY" | "CONVERT_TO_TEXT"
object ContentHandlingStrategy {
  inline val CONVERT_TO_BINARY: "CONVERT_TO_BINARY" = "CONVERT_TO_BINARY"
  inline val CONVERT_TO_TEXT: "CONVERT_TO_TEXT" = "CONVERT_TO_TEXT"

  inline def values: js.Array[ContentHandlingStrategy] = js.Array(CONVERT_TO_BINARY, CONVERT_TO_TEXT)
}

/** Represents a deployment status.
  */
type DeploymentStatus = "PENDING" | "FAILED" | "DEPLOYED"
object DeploymentStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val DEPLOYED: "DEPLOYED" = "DEPLOYED"

  inline def values: js.Array[DeploymentStatus] = js.Array(PENDING, FAILED, DEPLOYED)
}

/** The status of the domain name migration. The valid values are AVAILABLE and UPDATING. If the status is UPDATING, the domain cannot be modified further until the existing operation is complete. If it is AVAILABLE, the domain can be updated.
  */
type DomainNameStatus = "AVAILABLE" | "UPDATING"
object DomainNameStatus {
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val UPDATING: "UPDATING" = "UPDATING"

  inline def values: js.Array[DomainNameStatus] = js.Array(AVAILABLE, UPDATING)
}

/** Represents an endpoint type.
  */
type EndpointType = "REGIONAL" | "EDGE"
object EndpointType {
  inline val REGIONAL: "REGIONAL" = "REGIONAL"
  inline val EDGE: "EDGE" = "EDGE"

  inline def values: js.Array[EndpointType] = js.Array(REGIONAL, EDGE)
}

/** Represents an API method integration type.
  */
type IntegrationType = "AWS" | "HTTP" | "MOCK" | "HTTP_PROXY" | "AWS_PROXY"
object IntegrationType {
  inline val AWS: "AWS" = "AWS"
  inline val HTTP: "HTTP" = "HTTP"
  inline val MOCK: "MOCK" = "MOCK"
  inline val HTTP_PROXY: "HTTP_PROXY" = "HTTP_PROXY"
  inline val AWS_PROXY: "AWS_PROXY" = "AWS_PROXY"

  inline def values: js.Array[IntegrationType] = js.Array(AWS, HTTP, MOCK, HTTP_PROXY, AWS_PROXY)
}

/** The logging level.
  */
type LoggingLevel = "ERROR" | "INFO" | "OFF"
object LoggingLevel {
  inline val ERROR: "ERROR" = "ERROR"
  inline val INFO: "INFO" = "INFO"
  inline val OFF: "OFF" = "OFF"

  inline def values: js.Array[LoggingLevel] = js.Array(ERROR, INFO, OFF)
}

/** Represents passthrough behavior for an integration response. Supported only for WebSocket APIs.
  */
type PassthroughBehavior = "WHEN_NO_MATCH" | "NEVER" | "WHEN_NO_TEMPLATES"
object PassthroughBehavior {
  inline val WHEN_NO_MATCH: "WHEN_NO_MATCH" = "WHEN_NO_MATCH"
  inline val NEVER: "NEVER" = "NEVER"
  inline val WHEN_NO_TEMPLATES: "WHEN_NO_TEMPLATES" = "WHEN_NO_TEMPLATES"

  inline def values: js.Array[PassthroughBehavior] = js.Array(WHEN_NO_MATCH, NEVER, WHEN_NO_TEMPLATES)
}

/** Represents a protocol type.
  */
type ProtocolType = "WEBSOCKET" | "HTTP"
object ProtocolType {
  inline val WEBSOCKET: "WEBSOCKET" = "WEBSOCKET"
  inline val HTTP: "HTTP" = "HTTP"

  inline def values: js.Array[ProtocolType] = js.Array(WEBSOCKET, HTTP)
}

/** The Transport Layer Security (TLS) version of the security policy for this domain name. The valid values are TLS_1_0 and TLS_1_2.
  */
type SecurityPolicy = "TLS_1_0" | "TLS_1_2"
object SecurityPolicy {
  inline val TLS_1_0: "TLS_1_0" = "TLS_1_0"
  inline val TLS_1_2: "TLS_1_2" = "TLS_1_2"

  inline def values: js.Array[SecurityPolicy] = js.Array(TLS_1_0, TLS_1_2)
}

/** The status of the VPC link.
  */
type VpcLinkStatus = "PENDING" | "AVAILABLE" | "DELETING" | "FAILED" | "INACTIVE"
object VpcLinkStatus {
  inline val PENDING: "PENDING" = "PENDING"
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val INACTIVE: "INACTIVE" = "INACTIVE"

  inline def values: js.Array[VpcLinkStatus] = js.Array(PENDING, AVAILABLE, DELETING, FAILED, INACTIVE)
}

/** The version of the VPC link.
  */
type VpcLinkVersion = "V2"
object VpcLinkVersion {
  inline val V2: "V2" = "V2"

  inline def values: js.Array[VpcLinkVersion] = js.Array(V2)
}
