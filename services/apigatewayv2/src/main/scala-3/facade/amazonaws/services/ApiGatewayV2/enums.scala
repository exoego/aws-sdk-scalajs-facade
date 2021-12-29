package facade.amazonaws.services.apigatewayv2

import scalajs._

/** The authorization type. For WebSocket APIs, valid values are NONE for open access, AWS_IAM for using AWS IAM permissions, and CUSTOM for using a Lambda authorizer. For HTTP APIs, valid values are NONE for open access, JWT for using JSON Web Tokens, AWS_IAM for using AWS IAM permissions, and CUSTOM for using a Lambda authorizer.
  */
type AuthorizationType = "NONE" | "AWS_IAM" | "CUSTOM" | "JWT"
object AuthorizationType {
  val NONE: "NONE" = "NONE"
  val AWS_IAM: "AWS_IAM" = "AWS_IAM"
  val CUSTOM: "CUSTOM" = "CUSTOM"
  val JWT: "JWT" = "JWT"

  @inline def values = js.Array[AuthorizationType](NONE, AWS_IAM, CUSTOM, JWT)
}

/** The authorizer type. Specify REQUEST for a Lambda function using incoming request parameters. Specify JWT to use JSON Web Tokens (supported only for HTTP APIs).
  */
type AuthorizerType = "REQUEST" | "JWT"
object AuthorizerType {
  val REQUEST: "REQUEST" = "REQUEST"
  val JWT: "JWT" = "JWT"

  @inline def values = js.Array[AuthorizerType](REQUEST, JWT)
}

/** Represents a connection type.
  */
type ConnectionType = "INTERNET" | "VPC_LINK"
object ConnectionType {
  val INTERNET: "INTERNET" = "INTERNET"
  val VPC_LINK: "VPC_LINK" = "VPC_LINK"

  @inline def values = js.Array[ConnectionType](INTERNET, VPC_LINK)
}

/** Specifies how to handle response payload content type conversions. Supported only for WebSocket APIs.
  */
type ContentHandlingStrategy = "CONVERT_TO_BINARY" | "CONVERT_TO_TEXT"
object ContentHandlingStrategy {
  val CONVERT_TO_BINARY: "CONVERT_TO_BINARY" = "CONVERT_TO_BINARY"
  val CONVERT_TO_TEXT: "CONVERT_TO_TEXT" = "CONVERT_TO_TEXT"

  @inline def values = js.Array[ContentHandlingStrategy](CONVERT_TO_BINARY, CONVERT_TO_TEXT)
}

/** Represents a deployment status.
  */
type DeploymentStatus = "PENDING" | "FAILED" | "DEPLOYED"
object DeploymentStatus {
  val PENDING: "PENDING" = "PENDING"
  val FAILED: "FAILED" = "FAILED"
  val DEPLOYED: "DEPLOYED" = "DEPLOYED"

  @inline def values = js.Array[DeploymentStatus](PENDING, FAILED, DEPLOYED)
}

/** The status of the domain name migration. The valid values are AVAILABLE and UPDATING. If the status is UPDATING, the domain cannot be modified further until the existing operation is complete. If it is AVAILABLE, the domain can be updated.
  */
type DomainNameStatus = "AVAILABLE" | "UPDATING"
object DomainNameStatus {
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val UPDATING: "UPDATING" = "UPDATING"

  @inline def values = js.Array[DomainNameStatus](AVAILABLE, UPDATING)
}

/** Represents an endpoint type.
  */
type EndpointType = "REGIONAL" | "EDGE"
object EndpointType {
  val REGIONAL: "REGIONAL" = "REGIONAL"
  val EDGE: "EDGE" = "EDGE"

  @inline def values = js.Array[EndpointType](REGIONAL, EDGE)
}

/** Represents an API method integration type.
  */
type IntegrationType = "AWS" | "HTTP" | "MOCK" | "HTTP_PROXY" | "AWS_PROXY"
object IntegrationType {
  val AWS: "AWS" = "AWS"
  val HTTP: "HTTP" = "HTTP"
  val MOCK: "MOCK" = "MOCK"
  val HTTP_PROXY: "HTTP_PROXY" = "HTTP_PROXY"
  val AWS_PROXY: "AWS_PROXY" = "AWS_PROXY"

  @inline def values = js.Array[IntegrationType](AWS, HTTP, MOCK, HTTP_PROXY, AWS_PROXY)
}

/** The logging level.
  */
type LoggingLevel = "ERROR" | "INFO" | "OFF"
object LoggingLevel {
  val ERROR: "ERROR" = "ERROR"
  val INFO: "INFO" = "INFO"
  val OFF: "OFF" = "OFF"

  @inline def values = js.Array[LoggingLevel](ERROR, INFO, OFF)
}

/** Represents passthrough behavior for an integration response. Supported only for WebSocket APIs.
  */
type PassthroughBehavior = "WHEN_NO_MATCH" | "NEVER" | "WHEN_NO_TEMPLATES"
object PassthroughBehavior {
  val WHEN_NO_MATCH: "WHEN_NO_MATCH" = "WHEN_NO_MATCH"
  val NEVER: "NEVER" = "NEVER"
  val WHEN_NO_TEMPLATES: "WHEN_NO_TEMPLATES" = "WHEN_NO_TEMPLATES"

  @inline def values = js.Array[PassthroughBehavior](WHEN_NO_MATCH, NEVER, WHEN_NO_TEMPLATES)
}

/** Represents a protocol type.
  */
type ProtocolType = "WEBSOCKET" | "HTTP"
object ProtocolType {
  val WEBSOCKET: "WEBSOCKET" = "WEBSOCKET"
  val HTTP: "HTTP" = "HTTP"

  @inline def values = js.Array[ProtocolType](WEBSOCKET, HTTP)
}

/** The Transport Layer Security (TLS) version of the security policy for this domain name. The valid values are TLS_1_0 and TLS_1_2.
  */
type SecurityPolicy = "TLS_1_0" | "TLS_1_2"
object SecurityPolicy {
  val TLS_1_0: "TLS_1_0" = "TLS_1_0"
  val TLS_1_2: "TLS_1_2" = "TLS_1_2"

  @inline def values = js.Array[SecurityPolicy](TLS_1_0, TLS_1_2)
}

/** The status of the VPC link.
  */
type VpcLinkStatus = "PENDING" | "AVAILABLE" | "DELETING" | "FAILED" | "INACTIVE"
object VpcLinkStatus {
  val PENDING: "PENDING" = "PENDING"
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val DELETING: "DELETING" = "DELETING"
  val FAILED: "FAILED" = "FAILED"
  val INACTIVE: "INACTIVE" = "INACTIVE"

  @inline def values = js.Array[VpcLinkStatus](PENDING, AVAILABLE, DELETING, FAILED, INACTIVE)
}

/** The version of the VPC link.
  */
type VpcLinkVersion = "V2"
object VpcLinkVersion {
  val V2: "V2" = "V2"

  @inline def values = js.Array[VpcLinkVersion](V2)
}
