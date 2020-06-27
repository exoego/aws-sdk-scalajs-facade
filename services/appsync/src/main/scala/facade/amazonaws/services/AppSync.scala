package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object appsync {
  type AdditionalAuthenticationProviders = js.Array[AdditionalAuthenticationProvider]
  type ApiKeys                           = js.Array[ApiKey]
  type Blob                              = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BooleanValue                      = Boolean
  type CachingKeys                       = js.Array[String]
  type DataSources                       = js.Array[DataSource]
  type Functions                         = js.Array[FunctionConfiguration]
  type FunctionsIds                      = js.Array[String]
  type GraphqlApis                       = js.Array[GraphqlApi]
  type MapOfStringToString               = js.Dictionary[String]
  type MappingTemplate                   = String
  type MaxResults                        = Int
  type PaginationToken                   = String
  type Resolvers                         = js.Array[Resolver]
  type ResourceArn                       = String
  type ResourceName                      = String
  type TagKey                            = String
  type TagKeyList                        = js.Array[TagKey]
  type TagMap                            = js.Dictionary[TagValue]
  type TagValue                          = String
  type TypeList                          = js.Array[Type]

  implicit final class AppSyncOps(private val service: AppSync) extends AnyVal {

    @inline def createApiCacheFuture(params: CreateApiCacheRequest): Future[CreateApiCacheResponse] =
      service.createApiCache(params).promise().toFuture
    @inline def createApiKeyFuture(params: CreateApiKeyRequest): Future[CreateApiKeyResponse] =
      service.createApiKey(params).promise().toFuture
    @inline def createDataSourceFuture(params: CreateDataSourceRequest): Future[CreateDataSourceResponse] =
      service.createDataSource(params).promise().toFuture
    @inline def createFunctionFuture(params: CreateFunctionRequest): Future[CreateFunctionResponse] =
      service.createFunction(params).promise().toFuture
    @inline def createGraphqlApiFuture(params: CreateGraphqlApiRequest): Future[CreateGraphqlApiResponse] =
      service.createGraphqlApi(params).promise().toFuture
    @inline def createResolverFuture(params: CreateResolverRequest): Future[CreateResolverResponse] =
      service.createResolver(params).promise().toFuture
    @inline def createTypeFuture(params: CreateTypeRequest): Future[CreateTypeResponse] =
      service.createType(params).promise().toFuture
    @inline def deleteApiCacheFuture(params: DeleteApiCacheRequest): Future[DeleteApiCacheResponse] =
      service.deleteApiCache(params).promise().toFuture
    @inline def deleteApiKeyFuture(params: DeleteApiKeyRequest): Future[DeleteApiKeyResponse] =
      service.deleteApiKey(params).promise().toFuture
    @inline def deleteDataSourceFuture(params: DeleteDataSourceRequest): Future[DeleteDataSourceResponse] =
      service.deleteDataSource(params).promise().toFuture
    @inline def deleteFunctionFuture(params: DeleteFunctionRequest): Future[DeleteFunctionResponse] =
      service.deleteFunction(params).promise().toFuture
    @inline def deleteGraphqlApiFuture(params: DeleteGraphqlApiRequest): Future[DeleteGraphqlApiResponse] =
      service.deleteGraphqlApi(params).promise().toFuture
    @inline def deleteResolverFuture(params: DeleteResolverRequest): Future[DeleteResolverResponse] =
      service.deleteResolver(params).promise().toFuture
    @inline def deleteTypeFuture(params: DeleteTypeRequest): Future[DeleteTypeResponse] =
      service.deleteType(params).promise().toFuture
    @inline def flushApiCacheFuture(params: FlushApiCacheRequest): Future[FlushApiCacheResponse] =
      service.flushApiCache(params).promise().toFuture
    @inline def getApiCacheFuture(params: GetApiCacheRequest): Future[GetApiCacheResponse] =
      service.getApiCache(params).promise().toFuture
    @inline def getDataSourceFuture(params: GetDataSourceRequest): Future[GetDataSourceResponse] =
      service.getDataSource(params).promise().toFuture
    @inline def getFunctionFuture(params: GetFunctionRequest): Future[GetFunctionResponse] =
      service.getFunction(params).promise().toFuture
    @inline def getGraphqlApiFuture(params: GetGraphqlApiRequest): Future[GetGraphqlApiResponse] =
      service.getGraphqlApi(params).promise().toFuture
    @inline def getIntrospectionSchemaFuture(
        params: GetIntrospectionSchemaRequest
    ): Future[GetIntrospectionSchemaResponse] = service.getIntrospectionSchema(params).promise().toFuture
    @inline def getResolverFuture(params: GetResolverRequest): Future[GetResolverResponse] =
      service.getResolver(params).promise().toFuture
    @inline def getSchemaCreationStatusFuture(
        params: GetSchemaCreationStatusRequest
    ): Future[GetSchemaCreationStatusResponse] = service.getSchemaCreationStatus(params).promise().toFuture
    @inline def getTypeFuture(params: GetTypeRequest): Future[GetTypeResponse] =
      service.getType(params).promise().toFuture
    @inline def listApiKeysFuture(params: ListApiKeysRequest): Future[ListApiKeysResponse] =
      service.listApiKeys(params).promise().toFuture
    @inline def listDataSourcesFuture(params: ListDataSourcesRequest): Future[ListDataSourcesResponse] =
      service.listDataSources(params).promise().toFuture
    @inline def listFunctionsFuture(params: ListFunctionsRequest): Future[ListFunctionsResponse] =
      service.listFunctions(params).promise().toFuture
    @inline def listGraphqlApisFuture(params: ListGraphqlApisRequest): Future[ListGraphqlApisResponse] =
      service.listGraphqlApis(params).promise().toFuture
    @inline def listResolversByFunctionFuture(
        params: ListResolversByFunctionRequest
    ): Future[ListResolversByFunctionResponse] = service.listResolversByFunction(params).promise().toFuture
    @inline def listResolversFuture(params: ListResolversRequest): Future[ListResolversResponse] =
      service.listResolvers(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def listTypesFuture(params: ListTypesRequest): Future[ListTypesResponse] =
      service.listTypes(params).promise().toFuture
    @inline def startSchemaCreationFuture(params: StartSchemaCreationRequest): Future[StartSchemaCreationResponse] =
      service.startSchemaCreation(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateApiCacheFuture(params: UpdateApiCacheRequest): Future[UpdateApiCacheResponse] =
      service.updateApiCache(params).promise().toFuture
    @inline def updateApiKeyFuture(params: UpdateApiKeyRequest): Future[UpdateApiKeyResponse] =
      service.updateApiKey(params).promise().toFuture
    @inline def updateDataSourceFuture(params: UpdateDataSourceRequest): Future[UpdateDataSourceResponse] =
      service.updateDataSource(params).promise().toFuture
    @inline def updateFunctionFuture(params: UpdateFunctionRequest): Future[UpdateFunctionResponse] =
      service.updateFunction(params).promise().toFuture
    @inline def updateGraphqlApiFuture(params: UpdateGraphqlApiRequest): Future[UpdateGraphqlApiResponse] =
      service.updateGraphqlApi(params).promise().toFuture
    @inline def updateResolverFuture(params: UpdateResolverRequest): Future[UpdateResolverResponse] =
      service.updateResolver(params).promise().toFuture
    @inline def updateTypeFuture(params: UpdateTypeRequest): Future[UpdateTypeResponse] =
      service.updateType(params).promise().toFuture
  }
}

package appsync {
  @js.native
  @JSImport("aws-sdk", "AppSync")
  class AppSync() extends js.Object {
    def this(config: AWSConfig) = this()

    def createApiCache(params: CreateApiCacheRequest): Request[CreateApiCacheResponse]       = js.native
    def createApiKey(params: CreateApiKeyRequest): Request[CreateApiKeyResponse]             = js.native
    def createDataSource(params: CreateDataSourceRequest): Request[CreateDataSourceResponse] = js.native
    def createFunction(params: CreateFunctionRequest): Request[CreateFunctionResponse]       = js.native
    def createGraphqlApi(params: CreateGraphqlApiRequest): Request[CreateGraphqlApiResponse] = js.native
    def createResolver(params: CreateResolverRequest): Request[CreateResolverResponse]       = js.native
    def createType(params: CreateTypeRequest): Request[CreateTypeResponse]                   = js.native
    def deleteApiCache(params: DeleteApiCacheRequest): Request[DeleteApiCacheResponse]       = js.native
    def deleteApiKey(params: DeleteApiKeyRequest): Request[DeleteApiKeyResponse]             = js.native
    def deleteDataSource(params: DeleteDataSourceRequest): Request[DeleteDataSourceResponse] = js.native
    def deleteFunction(params: DeleteFunctionRequest): Request[DeleteFunctionResponse]       = js.native
    def deleteGraphqlApi(params: DeleteGraphqlApiRequest): Request[DeleteGraphqlApiResponse] = js.native
    def deleteResolver(params: DeleteResolverRequest): Request[DeleteResolverResponse]       = js.native
    def deleteType(params: DeleteTypeRequest): Request[DeleteTypeResponse]                   = js.native
    def flushApiCache(params: FlushApiCacheRequest): Request[FlushApiCacheResponse]          = js.native
    def getApiCache(params: GetApiCacheRequest): Request[GetApiCacheResponse]                = js.native
    def getDataSource(params: GetDataSourceRequest): Request[GetDataSourceResponse]          = js.native
    def getFunction(params: GetFunctionRequest): Request[GetFunctionResponse]                = js.native
    def getGraphqlApi(params: GetGraphqlApiRequest): Request[GetGraphqlApiResponse]          = js.native
    def getIntrospectionSchema(params: GetIntrospectionSchemaRequest): Request[GetIntrospectionSchemaResponse] =
      js.native
    def getResolver(params: GetResolverRequest): Request[GetResolverResponse] = js.native
    def getSchemaCreationStatus(params: GetSchemaCreationStatusRequest): Request[GetSchemaCreationStatusResponse] =
      js.native
    def getType(params: GetTypeRequest): Request[GetTypeResponse]                         = js.native
    def listApiKeys(params: ListApiKeysRequest): Request[ListApiKeysResponse]             = js.native
    def listDataSources(params: ListDataSourcesRequest): Request[ListDataSourcesResponse] = js.native
    def listFunctions(params: ListFunctionsRequest): Request[ListFunctionsResponse]       = js.native
    def listGraphqlApis(params: ListGraphqlApisRequest): Request[ListGraphqlApisResponse] = js.native
    def listResolvers(params: ListResolversRequest): Request[ListResolversResponse]       = js.native
    def listResolversByFunction(params: ListResolversByFunctionRequest): Request[ListResolversByFunctionResponse] =
      js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listTypes(params: ListTypesRequest): Request[ListTypesResponse]                               = js.native
    def startSchemaCreation(params: StartSchemaCreationRequest): Request[StartSchemaCreationResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                         = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                   = js.native
    def updateApiCache(params: UpdateApiCacheRequest): Request[UpdateApiCacheResponse]                = js.native
    def updateApiKey(params: UpdateApiKeyRequest): Request[UpdateApiKeyResponse]                      = js.native
    def updateDataSource(params: UpdateDataSourceRequest): Request[UpdateDataSourceResponse]          = js.native
    def updateFunction(params: UpdateFunctionRequest): Request[UpdateFunctionResponse]                = js.native
    def updateGraphqlApi(params: UpdateGraphqlApiRequest): Request[UpdateGraphqlApiResponse]          = js.native
    def updateResolver(params: UpdateResolverRequest): Request[UpdateResolverResponse]                = js.native
    def updateType(params: UpdateTypeRequest): Request[UpdateTypeResponse]                            = js.native
  }

  /**
    * Describes an additional authentication provider.
    */
  @js.native
  @Factory
  trait AdditionalAuthenticationProvider extends js.Object {
    var authenticationType: js.UndefOr[AuthenticationType]
    var openIDConnectConfig: js.UndefOr[OpenIDConnectConfig]
    var userPoolConfig: js.UndefOr[CognitoUserPoolConfig]
  }

  /**
    * The <code>ApiCache</code> object.
    */
  @js.native
  @Factory
  trait ApiCache extends js.Object {
    var apiCachingBehavior: js.UndefOr[ApiCachingBehavior]
    var atRestEncryptionEnabled: js.UndefOr[Boolean]
    var status: js.UndefOr[ApiCacheStatus]
    var transitEncryptionEnabled: js.UndefOr[Boolean]
    var ttl: js.UndefOr[Double]
    var `type`: js.UndefOr[ApiCacheType]
  }

  @js.native
  sealed trait ApiCacheStatus extends js.Any
  object ApiCacheStatus extends js.Object {
    val AVAILABLE = "AVAILABLE".asInstanceOf[ApiCacheStatus]
    val CREATING  = "CREATING".asInstanceOf[ApiCacheStatus]
    val DELETING  = "DELETING".asInstanceOf[ApiCacheStatus]
    val MODIFYING = "MODIFYING".asInstanceOf[ApiCacheStatus]
    val FAILED    = "FAILED".asInstanceOf[ApiCacheStatus]

    val values = js.Object.freeze(js.Array(AVAILABLE, CREATING, DELETING, MODIFYING, FAILED))
  }

  @js.native
  sealed trait ApiCacheType extends js.Any
  object ApiCacheType extends js.Object {
    val T2_SMALL   = "T2_SMALL".asInstanceOf[ApiCacheType]
    val T2_MEDIUM  = "T2_MEDIUM".asInstanceOf[ApiCacheType]
    val R4_LARGE   = "R4_LARGE".asInstanceOf[ApiCacheType]
    val R4_XLARGE  = "R4_XLARGE".asInstanceOf[ApiCacheType]
    val R4_2XLARGE = "R4_2XLARGE".asInstanceOf[ApiCacheType]
    val R4_4XLARGE = "R4_4XLARGE".asInstanceOf[ApiCacheType]
    val R4_8XLARGE = "R4_8XLARGE".asInstanceOf[ApiCacheType]

    val values =
      js.Object.freeze(js.Array(T2_SMALL, T2_MEDIUM, R4_LARGE, R4_XLARGE, R4_2XLARGE, R4_4XLARGE, R4_8XLARGE))
  }

  @js.native
  sealed trait ApiCachingBehavior extends js.Any
  object ApiCachingBehavior extends js.Object {
    val FULL_REQUEST_CACHING = "FULL_REQUEST_CACHING".asInstanceOf[ApiCachingBehavior]
    val PER_RESOLVER_CACHING = "PER_RESOLVER_CACHING".asInstanceOf[ApiCachingBehavior]

    val values = js.Object.freeze(js.Array(FULL_REQUEST_CACHING, PER_RESOLVER_CACHING))
  }

  /**
    * Describes an API key.
    *  Customers invoke AWS AppSync GraphQL API operations with API keys as an identity mechanism. There are two key versions:
    *  ```da1```: This version was introduced at launch in November 2017. These keys always expire after 7 days. Key expiration is managed by Amazon DynamoDB TTL. The keys ceased to be valid after February 21, 2018 and should not be used after that date.
    * * <code>ListApiKeys</code> returns the expiration time in milliseconds.
    *  * <code>CreateApiKey</code> returns the expiration time in milliseconds.
    *  * <code>UpdateApiKey</code> is not available for this key version.
    *  * <code>DeleteApiKey</code> deletes the item from the table.
    *  * Expiration is stored in Amazon DynamoDB as milliseconds. This results in a bug where keys are not automatically deleted because DynamoDB expects the TTL to be stored in seconds. As a one-time action, we will delete these keys from the table after February 21, 2018.
    * ```da2```: This version was introduced in February 2018 when AppSync added support to extend key expiration.
    * * <code>ListApiKeys</code> returns the expiration time in seconds.
    *  * <code>CreateApiKey</code> returns the expiration time in seconds and accepts a user-provided expiration time in seconds.
    *  * <code>UpdateApiKey</code> returns the expiration time in seconds and accepts a user-provided expiration time in seconds. Key expiration can only be updated while the key has not expired.
    *  * <code>DeleteApiKey</code> deletes the item from the table.
    *  * Expiration is stored in Amazon DynamoDB as seconds.
    */
  @js.native
  @Factory
  trait ApiKey extends js.Object {
    var description: js.UndefOr[String]
    var expires: js.UndefOr[Double]
    var id: js.UndefOr[String]
  }

  @js.native
  sealed trait AuthenticationType extends js.Any
  object AuthenticationType extends js.Object {
    val API_KEY                   = "API_KEY".asInstanceOf[AuthenticationType]
    val AWS_IAM                   = "AWS_IAM".asInstanceOf[AuthenticationType]
    val AMAZON_COGNITO_USER_POOLS = "AMAZON_COGNITO_USER_POOLS".asInstanceOf[AuthenticationType]
    val OPENID_CONNECT            = "OPENID_CONNECT".asInstanceOf[AuthenticationType]

    val values = js.Object.freeze(js.Array(API_KEY, AWS_IAM, AMAZON_COGNITO_USER_POOLS, OPENID_CONNECT))
  }

  /**
    * The authorization config in case the HTTP endpoint requires authorization.
    */
  @js.native
  @Factory
  trait AuthorizationConfig extends js.Object {
    var authorizationType: AuthorizationType
    var awsIamConfig: js.UndefOr[AwsIamConfig]
  }

  @js.native
  sealed trait AuthorizationType extends js.Any
  object AuthorizationType extends js.Object {
    val AWS_IAM = "AWS_IAM".asInstanceOf[AuthorizationType]

    val values = js.Object.freeze(js.Array(AWS_IAM))
  }

  /**
    * The AWS IAM configuration.
    */
  @js.native
  @Factory
  trait AwsIamConfig extends js.Object {
    var signingRegion: js.UndefOr[String]
    var signingServiceName: js.UndefOr[String]
  }

  /**
    * The caching configuration for a resolver that has caching enabled.
    */
  @js.native
  @Factory
  trait CachingConfig extends js.Object {
    var cachingKeys: js.UndefOr[CachingKeys]
    var ttl: js.UndefOr[Double]
  }

  /**
    * Describes an Amazon Cognito user pool configuration.
    */
  @js.native
  @Factory
  trait CognitoUserPoolConfig extends js.Object {
    var awsRegion: String
    var userPoolId: String
    var appIdClientRegex: js.UndefOr[String]
  }

  @js.native
  sealed trait ConflictDetectionType extends js.Any
  object ConflictDetectionType extends js.Object {
    val VERSION = "VERSION".asInstanceOf[ConflictDetectionType]
    val NONE    = "NONE".asInstanceOf[ConflictDetectionType]

    val values = js.Object.freeze(js.Array(VERSION, NONE))
  }

  @js.native
  sealed trait ConflictHandlerType extends js.Any
  object ConflictHandlerType extends js.Object {
    val OPTIMISTIC_CONCURRENCY = "OPTIMISTIC_CONCURRENCY".asInstanceOf[ConflictHandlerType]
    val LAMBDA                 = "LAMBDA".asInstanceOf[ConflictHandlerType]
    val AUTOMERGE              = "AUTOMERGE".asInstanceOf[ConflictHandlerType]
    val NONE                   = "NONE".asInstanceOf[ConflictHandlerType]

    val values = js.Object.freeze(js.Array(OPTIMISTIC_CONCURRENCY, LAMBDA, AUTOMERGE, NONE))
  }

  /**
    * Represents the input of a <code>CreateApiCache</code> operation.
    */
  @js.native
  @Factory
  trait CreateApiCacheRequest extends js.Object {
    var apiCachingBehavior: ApiCachingBehavior
    var apiId: String
    var ttl: Double
    var `type`: ApiCacheType
    var atRestEncryptionEnabled: js.UndefOr[Boolean]
    var transitEncryptionEnabled: js.UndefOr[Boolean]
  }

  /**
    * Represents the output of a <code>CreateApiCache</code> operation.
    */
  @js.native
  @Factory
  trait CreateApiCacheResponse extends js.Object {
    var apiCache: js.UndefOr[ApiCache]
  }

  @js.native
  @Factory
  trait CreateApiKeyRequest extends js.Object {
    var apiId: String
    var description: js.UndefOr[String]
    var expires: js.UndefOr[Double]
  }

  @js.native
  @Factory
  trait CreateApiKeyResponse extends js.Object {
    var apiKey: js.UndefOr[ApiKey]
  }

  @js.native
  @Factory
  trait CreateDataSourceRequest extends js.Object {
    var apiId: String
    var name: ResourceName
    var `type`: DataSourceType
    var description: js.UndefOr[String]
    var dynamodbConfig: js.UndefOr[DynamodbDataSourceConfig]
    var elasticsearchConfig: js.UndefOr[ElasticsearchDataSourceConfig]
    var httpConfig: js.UndefOr[HttpDataSourceConfig]
    var lambdaConfig: js.UndefOr[LambdaDataSourceConfig]
    var relationalDatabaseConfig: js.UndefOr[RelationalDatabaseDataSourceConfig]
    var serviceRoleArn: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait CreateDataSourceResponse extends js.Object {
    var dataSource: js.UndefOr[DataSource]
  }

  @js.native
  @Factory
  trait CreateFunctionRequest extends js.Object {
    var apiId: String
    var dataSourceName: ResourceName
    var functionVersion: String
    var name: ResourceName
    var requestMappingTemplate: MappingTemplate
    var description: js.UndefOr[String]
    var responseMappingTemplate: js.UndefOr[MappingTemplate]
  }

  @js.native
  @Factory
  trait CreateFunctionResponse extends js.Object {
    var functionConfiguration: js.UndefOr[FunctionConfiguration]
  }

  @js.native
  @Factory
  trait CreateGraphqlApiRequest extends js.Object {
    var authenticationType: AuthenticationType
    var name: String
    var additionalAuthenticationProviders: js.UndefOr[AdditionalAuthenticationProviders]
    var logConfig: js.UndefOr[LogConfig]
    var openIDConnectConfig: js.UndefOr[OpenIDConnectConfig]
    var tags: js.UndefOr[TagMap]
    var userPoolConfig: js.UndefOr[UserPoolConfig]
    var xrayEnabled: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait CreateGraphqlApiResponse extends js.Object {
    var graphqlApi: js.UndefOr[GraphqlApi]
  }

  @js.native
  @Factory
  trait CreateResolverRequest extends js.Object {
    var apiId: String
    var fieldName: ResourceName
    var requestMappingTemplate: MappingTemplate
    var typeName: ResourceName
    var cachingConfig: js.UndefOr[CachingConfig]
    var dataSourceName: js.UndefOr[ResourceName]
    var kind: js.UndefOr[ResolverKind]
    var pipelineConfig: js.UndefOr[PipelineConfig]
    var responseMappingTemplate: js.UndefOr[MappingTemplate]
    var syncConfig: js.UndefOr[SyncConfig]
  }

  @js.native
  @Factory
  trait CreateResolverResponse extends js.Object {
    var resolver: js.UndefOr[Resolver]
  }

  @js.native
  @Factory
  trait CreateTypeRequest extends js.Object {
    var apiId: String
    var definition: String
    var format: TypeDefinitionFormat
  }

  @js.native
  @Factory
  trait CreateTypeResponse extends js.Object {
    var `type`: js.UndefOr[Type]
  }

  /**
    * Describes a data source.
    */
  @js.native
  @Factory
  trait DataSource extends js.Object {
    var dataSourceArn: js.UndefOr[String]
    var description: js.UndefOr[String]
    var dynamodbConfig: js.UndefOr[DynamodbDataSourceConfig]
    var elasticsearchConfig: js.UndefOr[ElasticsearchDataSourceConfig]
    var httpConfig: js.UndefOr[HttpDataSourceConfig]
    var lambdaConfig: js.UndefOr[LambdaDataSourceConfig]
    var name: js.UndefOr[ResourceName]
    var relationalDatabaseConfig: js.UndefOr[RelationalDatabaseDataSourceConfig]
    var serviceRoleArn: js.UndefOr[String]
    var `type`: js.UndefOr[DataSourceType]
  }

  @js.native
  sealed trait DataSourceType extends js.Any
  object DataSourceType extends js.Object {
    val AWS_LAMBDA           = "AWS_LAMBDA".asInstanceOf[DataSourceType]
    val AMAZON_DYNAMODB      = "AMAZON_DYNAMODB".asInstanceOf[DataSourceType]
    val AMAZON_ELASTICSEARCH = "AMAZON_ELASTICSEARCH".asInstanceOf[DataSourceType]
    val NONE                 = "NONE".asInstanceOf[DataSourceType]
    val HTTP                 = "HTTP".asInstanceOf[DataSourceType]
    val RELATIONAL_DATABASE  = "RELATIONAL_DATABASE".asInstanceOf[DataSourceType]

    val values =
      js.Object.freeze(js.Array(AWS_LAMBDA, AMAZON_DYNAMODB, AMAZON_ELASTICSEARCH, NONE, HTTP, RELATIONAL_DATABASE))
  }

  @js.native
  sealed trait DefaultAction extends js.Any
  object DefaultAction extends js.Object {
    val ALLOW = "ALLOW".asInstanceOf[DefaultAction]
    val DENY  = "DENY".asInstanceOf[DefaultAction]

    val values = js.Object.freeze(js.Array(ALLOW, DENY))
  }

  /**
    * Represents the input of a <code>DeleteApiCache</code> operation.
    */
  @js.native
  @Factory
  trait DeleteApiCacheRequest extends js.Object {
    var apiId: String
  }

  /**
    * Represents the output of a <code>DeleteApiCache</code> operation.
    */
  @js.native
  @Factory
  trait DeleteApiCacheResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteApiKeyRequest extends js.Object {
    var apiId: String
    var id: String
  }

  @js.native
  @Factory
  trait DeleteApiKeyResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteDataSourceRequest extends js.Object {
    var apiId: String
    var name: ResourceName
  }

  @js.native
  @Factory
  trait DeleteDataSourceResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteFunctionRequest extends js.Object {
    var apiId: String
    var functionId: ResourceName
  }

  @js.native
  @Factory
  trait DeleteFunctionResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteGraphqlApiRequest extends js.Object {
    var apiId: String
  }

  @js.native
  @Factory
  trait DeleteGraphqlApiResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteResolverRequest extends js.Object {
    var apiId: String
    var fieldName: ResourceName
    var typeName: ResourceName
  }

  @js.native
  @Factory
  trait DeleteResolverResponse extends js.Object {}

  @js.native
  @Factory
  trait DeleteTypeRequest extends js.Object {
    var apiId: String
    var typeName: ResourceName
  }

  @js.native
  @Factory
  trait DeleteTypeResponse extends js.Object {}

  /**
    * Describes a Delta Sync configuration.
    */
  @js.native
  @Factory
  trait DeltaSyncConfig extends js.Object {
    var baseTableTTL: js.UndefOr[Double]
    var deltaSyncTableName: js.UndefOr[String]
    var deltaSyncTableTTL: js.UndefOr[Double]
  }

  /**
    * Describes an Amazon DynamoDB data source configuration.
    */
  @js.native
  @Factory
  trait DynamodbDataSourceConfig extends js.Object {
    var awsRegion: String
    var tableName: String
    var deltaSyncConfig: js.UndefOr[DeltaSyncConfig]
    var useCallerCredentials: js.UndefOr[Boolean]
    var versioned: js.UndefOr[Boolean]
  }

  /**
    * Describes an Elasticsearch data source configuration.
    */
  @js.native
  @Factory
  trait ElasticsearchDataSourceConfig extends js.Object {
    var awsRegion: String
    var endpoint: String
  }

  @js.native
  sealed trait FieldLogLevel extends js.Any
  object FieldLogLevel extends js.Object {
    val NONE  = "NONE".asInstanceOf[FieldLogLevel]
    val ERROR = "ERROR".asInstanceOf[FieldLogLevel]
    val ALL   = "ALL".asInstanceOf[FieldLogLevel]

    val values = js.Object.freeze(js.Array(NONE, ERROR, ALL))
  }

  /**
    * Represents the input of a <code>FlushApiCache</code> operation.
    */
  @js.native
  @Factory
  trait FlushApiCacheRequest extends js.Object {
    var apiId: String
  }

  /**
    * Represents the output of a <code>FlushApiCache</code> operation.
    */
  @js.native
  @Factory
  trait FlushApiCacheResponse extends js.Object {}

  /**
    * A function is a reusable entity. Multiple functions can be used to compose the resolver logic.
    */
  @js.native
  @Factory
  trait FunctionConfiguration extends js.Object {
    var dataSourceName: js.UndefOr[ResourceName]
    var description: js.UndefOr[String]
    var functionArn: js.UndefOr[String]
    var functionId: js.UndefOr[String]
    var functionVersion: js.UndefOr[String]
    var name: js.UndefOr[ResourceName]
    var requestMappingTemplate: js.UndefOr[MappingTemplate]
    var responseMappingTemplate: js.UndefOr[MappingTemplate]
  }

  /**
    * Represents the input of a <code>GetApiCache</code> operation.
    */
  @js.native
  @Factory
  trait GetApiCacheRequest extends js.Object {
    var apiId: String
  }

  /**
    * Represents the output of a <code>GetApiCache</code> operation.
    */
  @js.native
  @Factory
  trait GetApiCacheResponse extends js.Object {
    var apiCache: js.UndefOr[ApiCache]
  }

  @js.native
  @Factory
  trait GetDataSourceRequest extends js.Object {
    var apiId: String
    var name: ResourceName
  }

  @js.native
  @Factory
  trait GetDataSourceResponse extends js.Object {
    var dataSource: js.UndefOr[DataSource]
  }

  @js.native
  @Factory
  trait GetFunctionRequest extends js.Object {
    var apiId: String
    var functionId: ResourceName
  }

  @js.native
  @Factory
  trait GetFunctionResponse extends js.Object {
    var functionConfiguration: js.UndefOr[FunctionConfiguration]
  }

  @js.native
  @Factory
  trait GetGraphqlApiRequest extends js.Object {
    var apiId: String
  }

  @js.native
  @Factory
  trait GetGraphqlApiResponse extends js.Object {
    var graphqlApi: js.UndefOr[GraphqlApi]
  }

  @js.native
  @Factory
  trait GetIntrospectionSchemaRequest extends js.Object {
    var apiId: String
    var format: OutputType
    var includeDirectives: js.UndefOr[BooleanValue]
  }

  @js.native
  @Factory
  trait GetIntrospectionSchemaResponse extends js.Object {
    var schema: js.UndefOr[Blob]
  }

  @js.native
  @Factory
  trait GetResolverRequest extends js.Object {
    var apiId: String
    var fieldName: ResourceName
    var typeName: ResourceName
  }

  @js.native
  @Factory
  trait GetResolverResponse extends js.Object {
    var resolver: js.UndefOr[Resolver]
  }

  @js.native
  @Factory
  trait GetSchemaCreationStatusRequest extends js.Object {
    var apiId: String
  }

  @js.native
  @Factory
  trait GetSchemaCreationStatusResponse extends js.Object {
    var details: js.UndefOr[String]
    var status: js.UndefOr[SchemaStatus]
  }

  @js.native
  @Factory
  trait GetTypeRequest extends js.Object {
    var apiId: String
    var format: TypeDefinitionFormat
    var typeName: ResourceName
  }

  @js.native
  @Factory
  trait GetTypeResponse extends js.Object {
    var `type`: js.UndefOr[Type]
  }

  /**
    * Describes a GraphQL API.
    */
  @js.native
  @Factory
  trait GraphqlApi extends js.Object {
    var additionalAuthenticationProviders: js.UndefOr[AdditionalAuthenticationProviders]
    var apiId: js.UndefOr[String]
    var arn: js.UndefOr[String]
    var authenticationType: js.UndefOr[AuthenticationType]
    var logConfig: js.UndefOr[LogConfig]
    var name: js.UndefOr[ResourceName]
    var openIDConnectConfig: js.UndefOr[OpenIDConnectConfig]
    var tags: js.UndefOr[TagMap]
    var uris: js.UndefOr[MapOfStringToString]
    var userPoolConfig: js.UndefOr[UserPoolConfig]
    var xrayEnabled: js.UndefOr[Boolean]
  }

  /**
    * Describes an HTTP data source configuration.
    */
  @js.native
  @Factory
  trait HttpDataSourceConfig extends js.Object {
    var authorizationConfig: js.UndefOr[AuthorizationConfig]
    var endpoint: js.UndefOr[String]
  }

  /**
    * The <code>LambdaConflictHandlerConfig</code> object when configuring LAMBDA as the Conflict Handler.
    */
  @js.native
  @Factory
  trait LambdaConflictHandlerConfig extends js.Object {
    var lambdaConflictHandlerArn: js.UndefOr[String]
  }

  /**
    * Describes an AWS Lambda data source configuration.
    */
  @js.native
  @Factory
  trait LambdaDataSourceConfig extends js.Object {
    var lambdaFunctionArn: String
  }

  @js.native
  @Factory
  trait ListApiKeysRequest extends js.Object {
    var apiId: String
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListApiKeysResponse extends js.Object {
    var apiKeys: js.UndefOr[ApiKeys]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListDataSourcesRequest extends js.Object {
    var apiId: String
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListDataSourcesResponse extends js.Object {
    var dataSources: js.UndefOr[DataSources]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListFunctionsRequest extends js.Object {
    var apiId: String
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListFunctionsResponse extends js.Object {
    var functions: js.UndefOr[Functions]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListGraphqlApisRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListGraphqlApisResponse extends js.Object {
    var graphqlApis: js.UndefOr[GraphqlApis]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListResolversByFunctionRequest extends js.Object {
    var apiId: String
    var functionId: String
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListResolversByFunctionResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var resolvers: js.UndefOr[Resolvers]
  }

  @js.native
  @Factory
  trait ListResolversRequest extends js.Object {
    var apiId: String
    var typeName: String
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListResolversResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var resolvers: js.UndefOr[Resolvers]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: ResourceArn
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  @js.native
  @Factory
  trait ListTypesRequest extends js.Object {
    var apiId: String
    var format: TypeDefinitionFormat
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  @js.native
  @Factory
  trait ListTypesResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var types: js.UndefOr[TypeList]
  }

  /**
    * The CloudWatch Logs configuration.
    */
  @js.native
  @Factory
  trait LogConfig extends js.Object {
    var cloudWatchLogsRoleArn: String
    var fieldLogLevel: FieldLogLevel
    var excludeVerboseContent: js.UndefOr[Boolean]
  }

  /**
    * Describes an OpenID Connect configuration.
    */
  @js.native
  @Factory
  trait OpenIDConnectConfig extends js.Object {
    var issuer: String
    var authTTL: js.UndefOr[Double]
    var clientId: js.UndefOr[String]
    var iatTTL: js.UndefOr[Double]
  }

  @js.native
  sealed trait OutputType extends js.Any
  object OutputType extends js.Object {
    val SDL  = "SDL".asInstanceOf[OutputType]
    val JSON = "JSON".asInstanceOf[OutputType]

    val values = js.Object.freeze(js.Array(SDL, JSON))
  }

  /**
    * The pipeline configuration for a resolver of kind <code>PIPELINE</code>.
    */
  @js.native
  @Factory
  trait PipelineConfig extends js.Object {
    var functions: js.UndefOr[FunctionsIds]
  }

  /**
    * The Amazon RDS HTTP endpoint configuration.
    */
  @js.native
  @Factory
  trait RdsHttpEndpointConfig extends js.Object {
    var awsRegion: js.UndefOr[String]
    var awsSecretStoreArn: js.UndefOr[String]
    var databaseName: js.UndefOr[String]
    var dbClusterIdentifier: js.UndefOr[String]
    var schema: js.UndefOr[String]
  }

  /**
    * Describes a relational database data source configuration.
    */
  @js.native
  @Factory
  trait RelationalDatabaseDataSourceConfig extends js.Object {
    var rdsHttpEndpointConfig: js.UndefOr[RdsHttpEndpointConfig]
    var relationalDatabaseSourceType: js.UndefOr[RelationalDatabaseSourceType]
  }

  @js.native
  sealed trait RelationalDatabaseSourceType extends js.Any
  object RelationalDatabaseSourceType extends js.Object {
    val RDS_HTTP_ENDPOINT = "RDS_HTTP_ENDPOINT".asInstanceOf[RelationalDatabaseSourceType]

    val values = js.Object.freeze(js.Array(RDS_HTTP_ENDPOINT))
  }

  /**
    * Describes a resolver.
    */
  @js.native
  @Factory
  trait Resolver extends js.Object {
    var cachingConfig: js.UndefOr[CachingConfig]
    var dataSourceName: js.UndefOr[ResourceName]
    var fieldName: js.UndefOr[ResourceName]
    var kind: js.UndefOr[ResolverKind]
    var pipelineConfig: js.UndefOr[PipelineConfig]
    var requestMappingTemplate: js.UndefOr[MappingTemplate]
    var resolverArn: js.UndefOr[String]
    var responseMappingTemplate: js.UndefOr[MappingTemplate]
    var syncConfig: js.UndefOr[SyncConfig]
    var typeName: js.UndefOr[ResourceName]
  }

  @js.native
  sealed trait ResolverKind extends js.Any
  object ResolverKind extends js.Object {
    val UNIT     = "UNIT".asInstanceOf[ResolverKind]
    val PIPELINE = "PIPELINE".asInstanceOf[ResolverKind]

    val values = js.Object.freeze(js.Array(UNIT, PIPELINE))
  }

  @js.native
  sealed trait SchemaStatus extends js.Any
  object SchemaStatus extends js.Object {
    val PROCESSING     = "PROCESSING".asInstanceOf[SchemaStatus]
    val ACTIVE         = "ACTIVE".asInstanceOf[SchemaStatus]
    val DELETING       = "DELETING".asInstanceOf[SchemaStatus]
    val FAILED         = "FAILED".asInstanceOf[SchemaStatus]
    val SUCCESS        = "SUCCESS".asInstanceOf[SchemaStatus]
    val NOT_APPLICABLE = "NOT_APPLICABLE".asInstanceOf[SchemaStatus]

    val values = js.Object.freeze(js.Array(PROCESSING, ACTIVE, DELETING, FAILED, SUCCESS, NOT_APPLICABLE))
  }

  @js.native
  @Factory
  trait StartSchemaCreationRequest extends js.Object {
    var apiId: String
    var definition: Blob
  }

  @js.native
  @Factory
  trait StartSchemaCreationResponse extends js.Object {
    var status: js.UndefOr[SchemaStatus]
  }

  /**
    * Describes a Sync configuration for a resolver.
    *  Contains information on which Conflict Detection as well as Resolution strategy should be performed when the resolver is invoked.
    */
  @js.native
  @Factory
  trait SyncConfig extends js.Object {
    var conflictDetection: js.UndefOr[ConflictDetectionType]
    var conflictHandler: js.UndefOr[ConflictHandlerType]
    var lambdaConflictHandlerConfig: js.UndefOr[LambdaConflictHandlerConfig]
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tags: TagMap
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  /**
    * Describes a type.
    */
  @js.native
  @Factory
  trait Type extends js.Object {
    var arn: js.UndefOr[String]
    var definition: js.UndefOr[String]
    var description: js.UndefOr[String]
    var format: js.UndefOr[TypeDefinitionFormat]
    var name: js.UndefOr[ResourceName]
  }

  @js.native
  sealed trait TypeDefinitionFormat extends js.Any
  object TypeDefinitionFormat extends js.Object {
    val SDL  = "SDL".asInstanceOf[TypeDefinitionFormat]
    val JSON = "JSON".asInstanceOf[TypeDefinitionFormat]

    val values = js.Object.freeze(js.Array(SDL, JSON))
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tagKeys: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  /**
    * Represents the input of a <code>UpdateApiCache</code> operation.
    */
  @js.native
  @Factory
  trait UpdateApiCacheRequest extends js.Object {
    var apiCachingBehavior: ApiCachingBehavior
    var apiId: String
    var ttl: Double
    var `type`: ApiCacheType
  }

  /**
    * Represents the output of a <code>UpdateApiCache</code> operation.
    */
  @js.native
  @Factory
  trait UpdateApiCacheResponse extends js.Object {
    var apiCache: js.UndefOr[ApiCache]
  }

  @js.native
  @Factory
  trait UpdateApiKeyRequest extends js.Object {
    var apiId: String
    var id: String
    var description: js.UndefOr[String]
    var expires: js.UndefOr[Double]
  }

  @js.native
  @Factory
  trait UpdateApiKeyResponse extends js.Object {
    var apiKey: js.UndefOr[ApiKey]
  }

  @js.native
  @Factory
  trait UpdateDataSourceRequest extends js.Object {
    var apiId: String
    var name: ResourceName
    var `type`: DataSourceType
    var description: js.UndefOr[String]
    var dynamodbConfig: js.UndefOr[DynamodbDataSourceConfig]
    var elasticsearchConfig: js.UndefOr[ElasticsearchDataSourceConfig]
    var httpConfig: js.UndefOr[HttpDataSourceConfig]
    var lambdaConfig: js.UndefOr[LambdaDataSourceConfig]
    var relationalDatabaseConfig: js.UndefOr[RelationalDatabaseDataSourceConfig]
    var serviceRoleArn: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait UpdateDataSourceResponse extends js.Object {
    var dataSource: js.UndefOr[DataSource]
  }

  @js.native
  @Factory
  trait UpdateFunctionRequest extends js.Object {
    var apiId: String
    var dataSourceName: ResourceName
    var functionId: ResourceName
    var functionVersion: String
    var name: ResourceName
    var requestMappingTemplate: MappingTemplate
    var description: js.UndefOr[String]
    var responseMappingTemplate: js.UndefOr[MappingTemplate]
  }

  @js.native
  @Factory
  trait UpdateFunctionResponse extends js.Object {
    var functionConfiguration: js.UndefOr[FunctionConfiguration]
  }

  @js.native
  @Factory
  trait UpdateGraphqlApiRequest extends js.Object {
    var apiId: String
    var name: String
    var additionalAuthenticationProviders: js.UndefOr[AdditionalAuthenticationProviders]
    var authenticationType: js.UndefOr[AuthenticationType]
    var logConfig: js.UndefOr[LogConfig]
    var openIDConnectConfig: js.UndefOr[OpenIDConnectConfig]
    var userPoolConfig: js.UndefOr[UserPoolConfig]
    var xrayEnabled: js.UndefOr[Boolean]
  }

  @js.native
  @Factory
  trait UpdateGraphqlApiResponse extends js.Object {
    var graphqlApi: js.UndefOr[GraphqlApi]
  }

  @js.native
  @Factory
  trait UpdateResolverRequest extends js.Object {
    var apiId: String
    var fieldName: ResourceName
    var requestMappingTemplate: MappingTemplate
    var typeName: ResourceName
    var cachingConfig: js.UndefOr[CachingConfig]
    var dataSourceName: js.UndefOr[ResourceName]
    var kind: js.UndefOr[ResolverKind]
    var pipelineConfig: js.UndefOr[PipelineConfig]
    var responseMappingTemplate: js.UndefOr[MappingTemplate]
    var syncConfig: js.UndefOr[SyncConfig]
  }

  @js.native
  @Factory
  trait UpdateResolverResponse extends js.Object {
    var resolver: js.UndefOr[Resolver]
  }

  @js.native
  @Factory
  trait UpdateTypeRequest extends js.Object {
    var apiId: String
    var format: TypeDefinitionFormat
    var typeName: ResourceName
    var definition: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait UpdateTypeResponse extends js.Object {
    var `type`: js.UndefOr[Type]
  }

  /**
    * Describes an Amazon Cognito user pool configuration.
    */
  @js.native
  @Factory
  trait UserPoolConfig extends js.Object {
    var awsRegion: String
    var defaultAction: DefaultAction
    var userPoolId: String
    var appIdClientRegex: js.UndefOr[String]
  }
}
