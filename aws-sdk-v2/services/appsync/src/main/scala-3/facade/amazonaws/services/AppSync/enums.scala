package facade.amazonaws.services.appsync

import scalajs.js

type ApiCacheStatus = "AVAILABLE" | "CREATING" | "DELETING" | "MODIFYING" | "FAILED"
object ApiCacheStatus {
  inline val AVAILABLE: "AVAILABLE" = "AVAILABLE"
  inline val CREATING: "CREATING" = "CREATING"
  inline val DELETING: "DELETING" = "DELETING"
  inline val MODIFYING: "MODIFYING" = "MODIFYING"
  inline val FAILED: "FAILED" = "FAILED"

  inline def values: js.Array[ApiCacheStatus] = js.Array(AVAILABLE, CREATING, DELETING, MODIFYING, FAILED)
}

type ApiCacheType = "T2_SMALL" | "T2_MEDIUM" | "R4_LARGE" | "R4_XLARGE" | "R4_2XLARGE" | "R4_4XLARGE" | "R4_8XLARGE" | "SMALL" | "MEDIUM" | "LARGE" | "XLARGE" | "LARGE_2X" | "LARGE_4X" | "LARGE_8X" | "LARGE_12X"
object ApiCacheType {
  inline val T2_SMALL: "T2_SMALL" = "T2_SMALL"
  inline val T2_MEDIUM: "T2_MEDIUM" = "T2_MEDIUM"
  inline val R4_LARGE: "R4_LARGE" = "R4_LARGE"
  inline val R4_XLARGE: "R4_XLARGE" = "R4_XLARGE"
  inline val R4_2XLARGE: "R4_2XLARGE" = "R4_2XLARGE"
  inline val R4_4XLARGE: "R4_4XLARGE" = "R4_4XLARGE"
  inline val R4_8XLARGE: "R4_8XLARGE" = "R4_8XLARGE"
  inline val SMALL: "SMALL" = "SMALL"
  inline val MEDIUM: "MEDIUM" = "MEDIUM"
  inline val LARGE: "LARGE" = "LARGE"
  inline val XLARGE: "XLARGE" = "XLARGE"
  inline val LARGE_2X: "LARGE_2X" = "LARGE_2X"
  inline val LARGE_4X: "LARGE_4X" = "LARGE_4X"
  inline val LARGE_8X: "LARGE_8X" = "LARGE_8X"
  inline val LARGE_12X: "LARGE_12X" = "LARGE_12X"

  inline def values: js.Array[ApiCacheType] = js.Array(T2_SMALL, T2_MEDIUM, R4_LARGE, R4_XLARGE, R4_2XLARGE, R4_4XLARGE, R4_8XLARGE, SMALL, MEDIUM, LARGE, XLARGE, LARGE_2X, LARGE_4X, LARGE_8X, LARGE_12X)
}

type ApiCachingBehavior = "FULL_REQUEST_CACHING" | "PER_RESOLVER_CACHING"
object ApiCachingBehavior {
  inline val FULL_REQUEST_CACHING: "FULL_REQUEST_CACHING" = "FULL_REQUEST_CACHING"
  inline val PER_RESOLVER_CACHING: "PER_RESOLVER_CACHING" = "PER_RESOLVER_CACHING"

  inline def values: js.Array[ApiCachingBehavior] = js.Array(FULL_REQUEST_CACHING, PER_RESOLVER_CACHING)
}

type AssociationStatus = "PROCESSING" | "FAILED" | "SUCCESS"
object AssociationStatus {
  inline val PROCESSING: "PROCESSING" = "PROCESSING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val SUCCESS: "SUCCESS" = "SUCCESS"

  inline def values: js.Array[AssociationStatus] = js.Array(PROCESSING, FAILED, SUCCESS)
}

type AuthenticationType = "API_KEY" | "AWS_IAM" | "AMAZON_COGNITO_USER_POOLS" | "OPENID_CONNECT" | "AWS_LAMBDA"
object AuthenticationType {
  inline val API_KEY: "API_KEY" = "API_KEY"
  inline val AWS_IAM: "AWS_IAM" = "AWS_IAM"
  inline val AMAZON_COGNITO_USER_POOLS: "AMAZON_COGNITO_USER_POOLS" = "AMAZON_COGNITO_USER_POOLS"
  inline val OPENID_CONNECT: "OPENID_CONNECT" = "OPENID_CONNECT"
  inline val AWS_LAMBDA: "AWS_LAMBDA" = "AWS_LAMBDA"

  inline def values: js.Array[AuthenticationType] = js.Array(API_KEY, AWS_IAM, AMAZON_COGNITO_USER_POOLS, OPENID_CONNECT, AWS_LAMBDA)
}

type AuthorizationType = "AWS_IAM"
object AuthorizationType {
  inline val AWS_IAM: "AWS_IAM" = "AWS_IAM"

  inline def values: js.Array[AuthorizationType] = js.Array(AWS_IAM)
}

type ConflictDetectionType = "VERSION" | "NONE"
object ConflictDetectionType {
  inline val VERSION: "VERSION" = "VERSION"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[ConflictDetectionType] = js.Array(VERSION, NONE)
}

type ConflictHandlerType = "OPTIMISTIC_CONCURRENCY" | "LAMBDA" | "AUTOMERGE" | "NONE"
object ConflictHandlerType {
  inline val OPTIMISTIC_CONCURRENCY: "OPTIMISTIC_CONCURRENCY" = "OPTIMISTIC_CONCURRENCY"
  inline val LAMBDA: "LAMBDA" = "LAMBDA"
  inline val AUTOMERGE: "AUTOMERGE" = "AUTOMERGE"
  inline val NONE: "NONE" = "NONE"

  inline def values: js.Array[ConflictHandlerType] = js.Array(OPTIMISTIC_CONCURRENCY, LAMBDA, AUTOMERGE, NONE)
}

type DataSourceType = "AWS_LAMBDA" | "AMAZON_DYNAMODB" | "AMAZON_ELASTICSEARCH" | "NONE" | "HTTP" | "RELATIONAL_DATABASE" | "AMAZON_OPENSEARCH_SERVICE"
object DataSourceType {
  inline val AWS_LAMBDA: "AWS_LAMBDA" = "AWS_LAMBDA"
  inline val AMAZON_DYNAMODB: "AMAZON_DYNAMODB" = "AMAZON_DYNAMODB"
  inline val AMAZON_ELASTICSEARCH: "AMAZON_ELASTICSEARCH" = "AMAZON_ELASTICSEARCH"
  inline val NONE: "NONE" = "NONE"
  inline val HTTP: "HTTP" = "HTTP"
  inline val RELATIONAL_DATABASE: "RELATIONAL_DATABASE" = "RELATIONAL_DATABASE"
  inline val AMAZON_OPENSEARCH_SERVICE: "AMAZON_OPENSEARCH_SERVICE" = "AMAZON_OPENSEARCH_SERVICE"

  inline def values: js.Array[DataSourceType] = js.Array(AWS_LAMBDA, AMAZON_DYNAMODB, AMAZON_ELASTICSEARCH, NONE, HTTP, RELATIONAL_DATABASE, AMAZON_OPENSEARCH_SERVICE)
}

type DefaultAction = "ALLOW" | "DENY"
object DefaultAction {
  inline val ALLOW: "ALLOW" = "ALLOW"
  inline val DENY: "DENY" = "DENY"

  inline def values: js.Array[DefaultAction] = js.Array(ALLOW, DENY)
}

type FieldLogLevel = "NONE" | "ERROR" | "ALL"
object FieldLogLevel {
  inline val NONE: "NONE" = "NONE"
  inline val ERROR: "ERROR" = "ERROR"
  inline val ALL: "ALL" = "ALL"

  inline def values: js.Array[FieldLogLevel] = js.Array(NONE, ERROR, ALL)
}

type OutputType = "SDL" | "JSON"
object OutputType {
  inline val SDL: "SDL" = "SDL"
  inline val JSON: "JSON" = "JSON"

  inline def values: js.Array[OutputType] = js.Array(SDL, JSON)
}

type RelationalDatabaseSourceType = "RDS_HTTP_ENDPOINT"
object RelationalDatabaseSourceType {
  inline val RDS_HTTP_ENDPOINT: "RDS_HTTP_ENDPOINT" = "RDS_HTTP_ENDPOINT"

  inline def values: js.Array[RelationalDatabaseSourceType] = js.Array(RDS_HTTP_ENDPOINT)
}

type ResolverKind = "UNIT" | "PIPELINE"
object ResolverKind {
  inline val UNIT: "UNIT" = "UNIT"
  inline val PIPELINE: "PIPELINE" = "PIPELINE"

  inline def values: js.Array[ResolverKind] = js.Array(UNIT, PIPELINE)
}

type RuntimeName = "APPSYNC_JS"
object RuntimeName {
  inline val APPSYNC_JS: "APPSYNC_JS" = "APPSYNC_JS"

  inline def values: js.Array[RuntimeName] = js.Array(APPSYNC_JS)
}

type SchemaStatus = "PROCESSING" | "ACTIVE" | "DELETING" | "FAILED" | "SUCCESS" | "NOT_APPLICABLE"
object SchemaStatus {
  inline val PROCESSING: "PROCESSING" = "PROCESSING"
  inline val ACTIVE: "ACTIVE" = "ACTIVE"
  inline val DELETING: "DELETING" = "DELETING"
  inline val FAILED: "FAILED" = "FAILED"
  inline val SUCCESS: "SUCCESS" = "SUCCESS"
  inline val NOT_APPLICABLE: "NOT_APPLICABLE" = "NOT_APPLICABLE"

  inline def values: js.Array[SchemaStatus] = js.Array(PROCESSING, ACTIVE, DELETING, FAILED, SUCCESS, NOT_APPLICABLE)
}

type TypeDefinitionFormat = "SDL" | "JSON"
object TypeDefinitionFormat {
  inline val SDL: "SDL" = "SDL"
  inline val JSON: "JSON" = "JSON"

  inline def values: js.Array[TypeDefinitionFormat] = js.Array(SDL, JSON)
}
