package facade.amazonaws.services.apigatewayv2

import scalajs._
import scala.scalajs.js.|

/** The authorization type. For WebSocket APIs, valid values are NONE for open access, AWS_IAM for using AWS IAM permissions, and CUSTOM for using a Lambda authorizer. For HTTP APIs, valid values are NONE for open access, JWT for using JSON Web Tokens, AWS_IAM for using AWS IAM permissions, and CUSTOM for using a Lambda authorizer.
  */
@js.native
sealed trait AuthorizationType extends js.Any
object AuthorizationType {
  val NONE = "NONE".asInstanceOf[AuthorizationType]
  val AWS_IAM = "AWS_IAM".asInstanceOf[AuthorizationType]
  val CUSTOM = "CUSTOM".asInstanceOf[AuthorizationType]
  val JWT = "JWT".asInstanceOf[AuthorizationType]

  @inline def values = js.Array(NONE, AWS_IAM, CUSTOM, JWT)
}

/** The authorizer type. Specify REQUEST for a Lambda function using incoming request parameters. Specify JWT to use JSON Web Tokens (supported only for HTTP APIs).
  */
@js.native
sealed trait AuthorizerType extends js.Any
object AuthorizerType {
  val REQUEST = "REQUEST".asInstanceOf[AuthorizerType]
  val JWT = "JWT".asInstanceOf[AuthorizerType]

  @inline def values = js.Array(REQUEST, JWT)
}

/** Represents a connection type.
  */
@js.native
sealed trait ConnectionType extends js.Any
object ConnectionType {
  val INTERNET = "INTERNET".asInstanceOf[ConnectionType]
  val VPC_LINK = "VPC_LINK".asInstanceOf[ConnectionType]

  @inline def values = js.Array(INTERNET, VPC_LINK)
}

/** Specifies how to handle response payload content type conversions. Supported only for WebSocket APIs.
  */
@js.native
sealed trait ContentHandlingStrategy extends js.Any
object ContentHandlingStrategy {
  val CONVERT_TO_BINARY = "CONVERT_TO_BINARY".asInstanceOf[ContentHandlingStrategy]
  val CONVERT_TO_TEXT = "CONVERT_TO_TEXT".asInstanceOf[ContentHandlingStrategy]

  @inline def values = js.Array(CONVERT_TO_BINARY, CONVERT_TO_TEXT)
}

/** Represents a deployment status.
  */
@js.native
sealed trait DeploymentStatus extends js.Any
object DeploymentStatus {
  val PENDING = "PENDING".asInstanceOf[DeploymentStatus]
  val FAILED = "FAILED".asInstanceOf[DeploymentStatus]
  val DEPLOYED = "DEPLOYED".asInstanceOf[DeploymentStatus]

  @inline def values = js.Array(PENDING, FAILED, DEPLOYED)
}

/** The status of the domain name migration. The valid values are AVAILABLE and UPDATING. If the status is UPDATING, the domain cannot be modified further until the existing operation is complete. If it is AVAILABLE, the domain can be updated.
  */
@js.native
sealed trait DomainNameStatus extends js.Any
object DomainNameStatus {
  val AVAILABLE = "AVAILABLE".asInstanceOf[DomainNameStatus]
  val UPDATING = "UPDATING".asInstanceOf[DomainNameStatus]

  @inline def values = js.Array(AVAILABLE, UPDATING)
}

/** Represents an endpoint type.
  */
@js.native
sealed trait EndpointType extends js.Any
object EndpointType {
  val REGIONAL = "REGIONAL".asInstanceOf[EndpointType]
  val EDGE = "EDGE".asInstanceOf[EndpointType]

  @inline def values = js.Array(REGIONAL, EDGE)
}

/** Represents an API method integration type.
  */
@js.native
sealed trait IntegrationType extends js.Any
object IntegrationType {
  val AWS = "AWS".asInstanceOf[IntegrationType]
  val HTTP = "HTTP".asInstanceOf[IntegrationType]
  val MOCK = "MOCK".asInstanceOf[IntegrationType]
  val HTTP_PROXY = "HTTP_PROXY".asInstanceOf[IntegrationType]
  val AWS_PROXY = "AWS_PROXY".asInstanceOf[IntegrationType]

  @inline def values = js.Array(AWS, HTTP, MOCK, HTTP_PROXY, AWS_PROXY)
}

/** The logging level.
  */
@js.native
sealed trait LoggingLevel extends js.Any
object LoggingLevel {
  val ERROR = "ERROR".asInstanceOf[LoggingLevel]
  val INFO = "INFO".asInstanceOf[LoggingLevel]
  val OFF = "OFF".asInstanceOf[LoggingLevel]

  @inline def values = js.Array(ERROR, INFO, OFF)
}

/** Represents passthrough behavior for an integration response. Supported only for WebSocket APIs.
  */
@js.native
sealed trait PassthroughBehavior extends js.Any
object PassthroughBehavior {
  val WHEN_NO_MATCH = "WHEN_NO_MATCH".asInstanceOf[PassthroughBehavior]
  val NEVER = "NEVER".asInstanceOf[PassthroughBehavior]
  val WHEN_NO_TEMPLATES = "WHEN_NO_TEMPLATES".asInstanceOf[PassthroughBehavior]

  @inline def values = js.Array(WHEN_NO_MATCH, NEVER, WHEN_NO_TEMPLATES)
}

/** Represents a protocol type.
  */
@js.native
sealed trait ProtocolType extends js.Any
object ProtocolType {
  val WEBSOCKET = "WEBSOCKET".asInstanceOf[ProtocolType]
  val HTTP = "HTTP".asInstanceOf[ProtocolType]

  @inline def values = js.Array(WEBSOCKET, HTTP)
}

/** The Transport Layer Security (TLS) version of the security policy for this domain name. The valid values are TLS_1_0 and TLS_1_2.
  */
@js.native
sealed trait SecurityPolicy extends js.Any
object SecurityPolicy {
  val TLS_1_0 = "TLS_1_0".asInstanceOf[SecurityPolicy]
  val TLS_1_2 = "TLS_1_2".asInstanceOf[SecurityPolicy]

  @inline def values = js.Array(TLS_1_0, TLS_1_2)
}

/** The status of the VPC link.
  */
@js.native
sealed trait VpcLinkStatus extends js.Any
object VpcLinkStatus {
  val PENDING = "PENDING".asInstanceOf[VpcLinkStatus]
  val AVAILABLE = "AVAILABLE".asInstanceOf[VpcLinkStatus]
  val DELETING = "DELETING".asInstanceOf[VpcLinkStatus]
  val FAILED = "FAILED".asInstanceOf[VpcLinkStatus]
  val INACTIVE = "INACTIVE".asInstanceOf[VpcLinkStatus]

  @inline def values = js.Array(PENDING, AVAILABLE, DELETING, FAILED, INACTIVE)
}

/** The version of the VPC link.
  */
@js.native
sealed trait VpcLinkVersion extends js.Any
object VpcLinkVersion {
  val V2 = "V2".asInstanceOf[VpcLinkVersion]

  @inline def values = js.Array(V2)
}
