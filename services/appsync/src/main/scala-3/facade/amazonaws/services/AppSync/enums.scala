package facade.amazonaws.services.appsync

import scalajs._

type ApiCacheStatus = "AVAILABLE" | "CREATING" | "DELETING" | "MODIFYING" | "FAILED"
object ApiCacheStatus {
  val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  val CREATING: "CREATING" = "CREATING"
  val DELETING: "DELETING" = "DELETING"
  val MODIFYING: "MODIFYING" = "MODIFYING"
  val FAILED: "FAILED" = "FAILED"

  @inline def values = js.Array[ApiCacheStatus](AVAILABLE, CREATING, DELETING, MODIFYING, FAILED)
}

type ApiCacheType = "T2_SMALL" | "T2_MEDIUM" | "R4_LARGE" | "R4_XLARGE" | "R4_2XLARGE" | "R4_4XLARGE" | "R4_8XLARGE" | "SMALL" | "MEDIUM" | "LARGE" | "XLARGE" | "LARGE_2X" | "LARGE_4X" | "LARGE_8X" | "LARGE_12X"
object ApiCacheType {
  val T2_SMALL: "T2_SMALL" = "T2_SMALL"
  val T2_MEDIUM: "T2_MEDIUM" = "T2_MEDIUM"
  val R4_LARGE: "R4_LARGE" = "R4_LARGE"
  val R4_XLARGE: "R4_XLARGE" = "R4_XLARGE"
  val R4_2XLARGE: "R4_2XLARGE" = "R4_2XLARGE"
  val R4_4XLARGE: "R4_4XLARGE" = "R4_4XLARGE"
  val R4_8XLARGE: "R4_8XLARGE" = "R4_8XLARGE"
  val SMALL: "SMALL" = "SMALL"
  val MEDIUM: "MEDIUM" = "MEDIUM"
  val LARGE: "LARGE" = "LARGE"
  val XLARGE: "XLARGE" = "XLARGE"
  val LARGE_2X: "LARGE_2X" = "LARGE_2X"
  val LARGE_4X: "LARGE_4X" = "LARGE_4X"
  val LARGE_8X: "LARGE_8X" = "LARGE_8X"
  val LARGE_12X: "LARGE_12X" = "LARGE_12X"

  @inline def values = js.Array[ApiCacheType](T2_SMALL, T2_MEDIUM, R4_LARGE, R4_XLARGE, R4_2XLARGE, R4_4XLARGE, R4_8XLARGE, SMALL, MEDIUM, LARGE, XLARGE, LARGE_2X, LARGE_4X, LARGE_8X, LARGE_12X)
}

type ApiCachingBehavior = "FULL_REQUEST_CACHING" | "PER_RESOLVER_CACHING"
object ApiCachingBehavior {
  val FULL_REQUEST_CACHING: "FULL_REQUEST_CACHING" = "FULL_REQUEST_CACHING"
  val PER_RESOLVER_CACHING: "PER_RESOLVER_CACHING" = "PER_RESOLVER_CACHING"

  @inline def values = js.Array[ApiCachingBehavior](FULL_REQUEST_CACHING, PER_RESOLVER_CACHING)
}

type AuthenticationType = "API_KEY" | "AWS_IAM" | "AMAZON_COGNITO_USER_POOLS" | "OPENID_CONNECT"
object AuthenticationType {
  val API_KEY: "API_KEY" = "API_KEY"
  val AWS_IAM: "AWS_IAM" = "AWS_IAM"
  val AMAZON_COGNITO_USER_POOLS: "AMAZON_COGNITO_USER_POOLS" = "AMAZON_COGNITO_USER_POOLS"
  val OPENID_CONNECT: "OPENID_CONNECT" = "OPENID_CONNECT"

  @inline def values = js.Array[AuthenticationType](API_KEY, AWS_IAM, AMAZON_COGNITO_USER_POOLS, OPENID_CONNECT)
}

type AuthorizationType = "AWS_IAM"
object AuthorizationType {
  val AWS_IAM: "AWS_IAM" = "AWS_IAM"

  @inline def values = js.Array[AuthorizationType](AWS_IAM)
}

type ConflictDetectionType = "VERSION" | "NONE"
object ConflictDetectionType {
  val VERSION: "VERSION" = "VERSION"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[ConflictDetectionType](VERSION, NONE)
}

type ConflictHandlerType = "OPTIMISTIC_CONCURRENCY" | "LAMBDA" | "AUTOMERGE" | "NONE"
object ConflictHandlerType {
  val OPTIMISTIC_CONCURRENCY: "OPTIMISTIC_CONCURRENCY" = "OPTIMISTIC_CONCURRENCY"
  val LAMBDA: "LAMBDA" = "LAMBDA"
  val AUTOMERGE: "AUTOMERGE" = "AUTOMERGE"
  val NONE: "NONE" = "NONE"

  @inline def values = js.Array[ConflictHandlerType](OPTIMISTIC_CONCURRENCY, LAMBDA, AUTOMERGE, NONE)
}

type DataSourceType = "AWS_LAMBDA" | "AMAZON_DYNAMODB" | "AMAZON_ELASTICSEARCH" | "NONE" | "HTTP" | "RELATIONAL_DATABASE"
object DataSourceType {
  val AWS_LAMBDA: "AWS_LAMBDA" = "AWS_LAMBDA"
  val AMAZON_DYNAMODB: "AMAZON_DYNAMODB" = "AMAZON_DYNAMODB"
  val AMAZON_ELASTICSEARCH: "AMAZON_ELASTICSEARCH" = "AMAZON_ELASTICSEARCH"
  val NONE: "NONE" = "NONE"
  val HTTP: "HTTP" = "HTTP"
  val RELATIONAL_DATABASE: "RELATIONAL_DATABASE" = "RELATIONAL_DATABASE"

  @inline def values = js.Array[DataSourceType](AWS_LAMBDA, AMAZON_DYNAMODB, AMAZON_ELASTICSEARCH, NONE, HTTP, RELATIONAL_DATABASE)
}

type DefaultAction = "ALLOW" | "DENY"
object DefaultAction {
  val ALLOW: "ALLOW" = "ALLOW"
  val DENY: "DENY" = "DENY"

  @inline def values = js.Array[DefaultAction](ALLOW, DENY)
}

type FieldLogLevel = "NONE" | "ERROR" | "ALL"
object FieldLogLevel {
  val NONE: "NONE" = "NONE"
  val ERROR: "ERROR" = "ERROR"
  val ALL: "ALL" = "ALL"

  @inline def values = js.Array[FieldLogLevel](NONE, ERROR, ALL)
}

type OutputType = "SDL" | "JSON"
object OutputType {
  val SDL: "SDL" = "SDL"
  val JSON: "JSON" = "JSON"

  @inline def values = js.Array[OutputType](SDL, JSON)
}

type RelationalDatabaseSourceType = "RDS_HTTP_ENDPOINT"
object RelationalDatabaseSourceType {
  val RDS_HTTP_ENDPOINT: "RDS_HTTP_ENDPOINT" = "RDS_HTTP_ENDPOINT"

  @inline def values = js.Array[RelationalDatabaseSourceType](RDS_HTTP_ENDPOINT)
}

type ResolverKind = "UNIT" | "PIPELINE"
object ResolverKind {
  val UNIT: "UNIT" = "UNIT"
  val PIPELINE: "PIPELINE" = "PIPELINE"

  @inline def values = js.Array[ResolverKind](UNIT, PIPELINE)
}

type SchemaStatus = "PROCESSING" | "ACTIVE" | "DELETING" | "FAILED" | "SUCCESS" | "NOT_APPLICABLE"
object SchemaStatus {
  val PROCESSING: "PROCESSING" = "PROCESSING"
  val ACTIVE: "ACTIVE" = "ACTIVE"
  val DELETING: "DELETING" = "DELETING"
  val FAILED: "FAILED" = "FAILED"
  val SUCCESS: "SUCCESS" = "SUCCESS"
  val NOT_APPLICABLE: "NOT_APPLICABLE" = "NOT_APPLICABLE"

  @inline def values = js.Array[SchemaStatus](PROCESSING, ACTIVE, DELETING, FAILED, SUCCESS, NOT_APPLICABLE)
}

type TypeDefinitionFormat = "SDL" | "JSON"
object TypeDefinitionFormat {
  val SDL: "SDL" = "SDL"
  val JSON: "JSON" = "JSON"

  @inline def values = js.Array[TypeDefinitionFormat](SDL, JSON)
}
