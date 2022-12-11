package facade.amazonaws.services.appsync

import scalajs.js

@js.native
sealed trait ApiCacheStatus extends js.Any
object ApiCacheStatus {
  val AVAILABLE = "AVAILABLE".asInstanceOf[ApiCacheStatus]
  val CREATING = "CREATING".asInstanceOf[ApiCacheStatus]
  val DELETING = "DELETING".asInstanceOf[ApiCacheStatus]
  val MODIFYING = "MODIFYING".asInstanceOf[ApiCacheStatus]
  val FAILED = "FAILED".asInstanceOf[ApiCacheStatus]

  @inline def values: js.Array[ApiCacheStatus] = js.Array(AVAILABLE, CREATING, DELETING, MODIFYING, FAILED)
}

@js.native
sealed trait ApiCacheType extends js.Any
object ApiCacheType {
  val T2_SMALL = "T2_SMALL".asInstanceOf[ApiCacheType]
  val T2_MEDIUM = "T2_MEDIUM".asInstanceOf[ApiCacheType]
  val R4_LARGE = "R4_LARGE".asInstanceOf[ApiCacheType]
  val R4_XLARGE = "R4_XLARGE".asInstanceOf[ApiCacheType]
  val R4_2XLARGE = "R4_2XLARGE".asInstanceOf[ApiCacheType]
  val R4_4XLARGE = "R4_4XLARGE".asInstanceOf[ApiCacheType]
  val R4_8XLARGE = "R4_8XLARGE".asInstanceOf[ApiCacheType]
  val SMALL = "SMALL".asInstanceOf[ApiCacheType]
  val MEDIUM = "MEDIUM".asInstanceOf[ApiCacheType]
  val LARGE = "LARGE".asInstanceOf[ApiCacheType]
  val XLARGE = "XLARGE".asInstanceOf[ApiCacheType]
  val LARGE_2X = "LARGE_2X".asInstanceOf[ApiCacheType]
  val LARGE_4X = "LARGE_4X".asInstanceOf[ApiCacheType]
  val LARGE_8X = "LARGE_8X".asInstanceOf[ApiCacheType]
  val LARGE_12X = "LARGE_12X".asInstanceOf[ApiCacheType]

  @inline def values: js.Array[ApiCacheType] = js.Array(T2_SMALL, T2_MEDIUM, R4_LARGE, R4_XLARGE, R4_2XLARGE, R4_4XLARGE, R4_8XLARGE, SMALL, MEDIUM, LARGE, XLARGE, LARGE_2X, LARGE_4X, LARGE_8X, LARGE_12X)
}

@js.native
sealed trait ApiCachingBehavior extends js.Any
object ApiCachingBehavior {
  val FULL_REQUEST_CACHING = "FULL_REQUEST_CACHING".asInstanceOf[ApiCachingBehavior]
  val PER_RESOLVER_CACHING = "PER_RESOLVER_CACHING".asInstanceOf[ApiCachingBehavior]

  @inline def values: js.Array[ApiCachingBehavior] = js.Array(FULL_REQUEST_CACHING, PER_RESOLVER_CACHING)
}

@js.native
sealed trait AssociationStatus extends js.Any
object AssociationStatus {
  val PROCESSING = "PROCESSING".asInstanceOf[AssociationStatus]
  val FAILED = "FAILED".asInstanceOf[AssociationStatus]
  val SUCCESS = "SUCCESS".asInstanceOf[AssociationStatus]

  @inline def values: js.Array[AssociationStatus] = js.Array(PROCESSING, FAILED, SUCCESS)
}

@js.native
sealed trait AuthenticationType extends js.Any
object AuthenticationType {
  val API_KEY = "API_KEY".asInstanceOf[AuthenticationType]
  val AWS_IAM = "AWS_IAM".asInstanceOf[AuthenticationType]
  val AMAZON_COGNITO_USER_POOLS = "AMAZON_COGNITO_USER_POOLS".asInstanceOf[AuthenticationType]
  val OPENID_CONNECT = "OPENID_CONNECT".asInstanceOf[AuthenticationType]
  val AWS_LAMBDA = "AWS_LAMBDA".asInstanceOf[AuthenticationType]

  @inline def values: js.Array[AuthenticationType] = js.Array(API_KEY, AWS_IAM, AMAZON_COGNITO_USER_POOLS, OPENID_CONNECT, AWS_LAMBDA)
}

@js.native
sealed trait AuthorizationType extends js.Any
object AuthorizationType {
  val AWS_IAM = "AWS_IAM".asInstanceOf[AuthorizationType]

  @inline def values: js.Array[AuthorizationType] = js.Array(AWS_IAM)
}

@js.native
sealed trait ConflictDetectionType extends js.Any
object ConflictDetectionType {
  val VERSION = "VERSION".asInstanceOf[ConflictDetectionType]
  val NONE = "NONE".asInstanceOf[ConflictDetectionType]

  @inline def values: js.Array[ConflictDetectionType] = js.Array(VERSION, NONE)
}

@js.native
sealed trait ConflictHandlerType extends js.Any
object ConflictHandlerType {
  val OPTIMISTIC_CONCURRENCY = "OPTIMISTIC_CONCURRENCY".asInstanceOf[ConflictHandlerType]
  val LAMBDA = "LAMBDA".asInstanceOf[ConflictHandlerType]
  val AUTOMERGE = "AUTOMERGE".asInstanceOf[ConflictHandlerType]
  val NONE = "NONE".asInstanceOf[ConflictHandlerType]

  @inline def values: js.Array[ConflictHandlerType] = js.Array(OPTIMISTIC_CONCURRENCY, LAMBDA, AUTOMERGE, NONE)
}

@js.native
sealed trait DataSourceType extends js.Any
object DataSourceType {
  val AWS_LAMBDA = "AWS_LAMBDA".asInstanceOf[DataSourceType]
  val AMAZON_DYNAMODB = "AMAZON_DYNAMODB".asInstanceOf[DataSourceType]
  val AMAZON_ELASTICSEARCH = "AMAZON_ELASTICSEARCH".asInstanceOf[DataSourceType]
  val NONE = "NONE".asInstanceOf[DataSourceType]
  val HTTP = "HTTP".asInstanceOf[DataSourceType]
  val RELATIONAL_DATABASE = "RELATIONAL_DATABASE".asInstanceOf[DataSourceType]
  val AMAZON_OPENSEARCH_SERVICE = "AMAZON_OPENSEARCH_SERVICE".asInstanceOf[DataSourceType]

  @inline def values: js.Array[DataSourceType] = js.Array(AWS_LAMBDA, AMAZON_DYNAMODB, AMAZON_ELASTICSEARCH, NONE, HTTP, RELATIONAL_DATABASE, AMAZON_OPENSEARCH_SERVICE)
}

@js.native
sealed trait DefaultAction extends js.Any
object DefaultAction {
  val ALLOW = "ALLOW".asInstanceOf[DefaultAction]
  val DENY = "DENY".asInstanceOf[DefaultAction]

  @inline def values: js.Array[DefaultAction] = js.Array(ALLOW, DENY)
}

@js.native
sealed trait FieldLogLevel extends js.Any
object FieldLogLevel {
  val NONE = "NONE".asInstanceOf[FieldLogLevel]
  val ERROR = "ERROR".asInstanceOf[FieldLogLevel]
  val ALL = "ALL".asInstanceOf[FieldLogLevel]

  @inline def values: js.Array[FieldLogLevel] = js.Array(NONE, ERROR, ALL)
}

@js.native
sealed trait OutputType extends js.Any
object OutputType {
  val SDL = "SDL".asInstanceOf[OutputType]
  val JSON = "JSON".asInstanceOf[OutputType]

  @inline def values: js.Array[OutputType] = js.Array(SDL, JSON)
}

@js.native
sealed trait RelationalDatabaseSourceType extends js.Any
object RelationalDatabaseSourceType {
  val RDS_HTTP_ENDPOINT = "RDS_HTTP_ENDPOINT".asInstanceOf[RelationalDatabaseSourceType]

  @inline def values: js.Array[RelationalDatabaseSourceType] = js.Array(RDS_HTTP_ENDPOINT)
}

@js.native
sealed trait ResolverKind extends js.Any
object ResolverKind {
  val UNIT = "UNIT".asInstanceOf[ResolverKind]
  val PIPELINE = "PIPELINE".asInstanceOf[ResolverKind]

  @inline def values: js.Array[ResolverKind] = js.Array(UNIT, PIPELINE)
}

@js.native
sealed trait RuntimeName extends js.Any
object RuntimeName {
  val APPSYNC_JS = "APPSYNC_JS".asInstanceOf[RuntimeName]

  @inline def values: js.Array[RuntimeName] = js.Array(APPSYNC_JS)
}

@js.native
sealed trait SchemaStatus extends js.Any
object SchemaStatus {
  val PROCESSING = "PROCESSING".asInstanceOf[SchemaStatus]
  val ACTIVE = "ACTIVE".asInstanceOf[SchemaStatus]
  val DELETING = "DELETING".asInstanceOf[SchemaStatus]
  val FAILED = "FAILED".asInstanceOf[SchemaStatus]
  val SUCCESS = "SUCCESS".asInstanceOf[SchemaStatus]
  val NOT_APPLICABLE = "NOT_APPLICABLE".asInstanceOf[SchemaStatus]

  @inline def values: js.Array[SchemaStatus] = js.Array(PROCESSING, ACTIVE, DELETING, FAILED, SUCCESS, NOT_APPLICABLE)
}

@js.native
sealed trait TypeDefinitionFormat extends js.Any
object TypeDefinitionFormat {
  val SDL = "SDL".asInstanceOf[TypeDefinitionFormat]
  val JSON = "JSON".asInstanceOf[TypeDefinitionFormat]

  @inline def values: js.Array[TypeDefinitionFormat] = js.Array(SDL, JSON)
}
