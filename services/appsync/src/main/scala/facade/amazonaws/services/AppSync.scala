package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object appsync {
  type AdditionalAuthenticationProviders = js.Array[AdditionalAuthenticationProvider]
  type ApiKeys = js.Array[ApiKey]
  type Blob = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BooleanValue = Boolean
  type CachingKeys = js.Array[String]
  type DataSources = js.Array[DataSource]
  type Functions = js.Array[FunctionConfiguration]
  type FunctionsIds = js.Array[String]
  type GraphqlApis = js.Array[GraphqlApi]
  type MapOfStringToString = js.Dictionary[String]
  type MappingTemplate = String
  type MaxResults = Int
  type PaginationToken = String
  type Resolvers = js.Array[Resolver]
  type ResourceArn = String
  type ResourceName = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = js.Dictionary[TagValue]
  type TagValue = String
  type TypeList = js.Array[Type]

  implicit final class AppSyncOps(private val service: AppSync) extends AnyVal {

    @inline def createApiCacheFuture(params: CreateApiCacheRequest): Future[CreateApiCacheResponse] = service.createApiCache(params).promise().toFuture
    @inline def createApiKeyFuture(params: CreateApiKeyRequest): Future[CreateApiKeyResponse] = service.createApiKey(params).promise().toFuture
    @inline def createDataSourceFuture(params: CreateDataSourceRequest): Future[CreateDataSourceResponse] = service.createDataSource(params).promise().toFuture
    @inline def createFunctionFuture(params: CreateFunctionRequest): Future[CreateFunctionResponse] = service.createFunction(params).promise().toFuture
    @inline def createGraphqlApiFuture(params: CreateGraphqlApiRequest): Future[CreateGraphqlApiResponse] = service.createGraphqlApi(params).promise().toFuture
    @inline def createResolverFuture(params: CreateResolverRequest): Future[CreateResolverResponse] = service.createResolver(params).promise().toFuture
    @inline def createTypeFuture(params: CreateTypeRequest): Future[CreateTypeResponse] = service.createType(params).promise().toFuture
    @inline def deleteApiCacheFuture(params: DeleteApiCacheRequest): Future[DeleteApiCacheResponse] = service.deleteApiCache(params).promise().toFuture
    @inline def deleteApiKeyFuture(params: DeleteApiKeyRequest): Future[DeleteApiKeyResponse] = service.deleteApiKey(params).promise().toFuture
    @inline def deleteDataSourceFuture(params: DeleteDataSourceRequest): Future[DeleteDataSourceResponse] = service.deleteDataSource(params).promise().toFuture
    @inline def deleteFunctionFuture(params: DeleteFunctionRequest): Future[DeleteFunctionResponse] = service.deleteFunction(params).promise().toFuture
    @inline def deleteGraphqlApiFuture(params: DeleteGraphqlApiRequest): Future[DeleteGraphqlApiResponse] = service.deleteGraphqlApi(params).promise().toFuture
    @inline def deleteResolverFuture(params: DeleteResolverRequest): Future[DeleteResolverResponse] = service.deleteResolver(params).promise().toFuture
    @inline def deleteTypeFuture(params: DeleteTypeRequest): Future[DeleteTypeResponse] = service.deleteType(params).promise().toFuture
    @inline def flushApiCacheFuture(params: FlushApiCacheRequest): Future[FlushApiCacheResponse] = service.flushApiCache(params).promise().toFuture
    @inline def getApiCacheFuture(params: GetApiCacheRequest): Future[GetApiCacheResponse] = service.getApiCache(params).promise().toFuture
    @inline def getDataSourceFuture(params: GetDataSourceRequest): Future[GetDataSourceResponse] = service.getDataSource(params).promise().toFuture
    @inline def getFunctionFuture(params: GetFunctionRequest): Future[GetFunctionResponse] = service.getFunction(params).promise().toFuture
    @inline def getGraphqlApiFuture(params: GetGraphqlApiRequest): Future[GetGraphqlApiResponse] = service.getGraphqlApi(params).promise().toFuture
    @inline def getIntrospectionSchemaFuture(params: GetIntrospectionSchemaRequest): Future[GetIntrospectionSchemaResponse] = service.getIntrospectionSchema(params).promise().toFuture
    @inline def getResolverFuture(params: GetResolverRequest): Future[GetResolverResponse] = service.getResolver(params).promise().toFuture
    @inline def getSchemaCreationStatusFuture(params: GetSchemaCreationStatusRequest): Future[GetSchemaCreationStatusResponse] = service.getSchemaCreationStatus(params).promise().toFuture
    @inline def getTypeFuture(params: GetTypeRequest): Future[GetTypeResponse] = service.getType(params).promise().toFuture
    @inline def listApiKeysFuture(params: ListApiKeysRequest): Future[ListApiKeysResponse] = service.listApiKeys(params).promise().toFuture
    @inline def listDataSourcesFuture(params: ListDataSourcesRequest): Future[ListDataSourcesResponse] = service.listDataSources(params).promise().toFuture
    @inline def listFunctionsFuture(params: ListFunctionsRequest): Future[ListFunctionsResponse] = service.listFunctions(params).promise().toFuture
    @inline def listGraphqlApisFuture(params: ListGraphqlApisRequest): Future[ListGraphqlApisResponse] = service.listGraphqlApis(params).promise().toFuture
    @inline def listResolversByFunctionFuture(params: ListResolversByFunctionRequest): Future[ListResolversByFunctionResponse] = service.listResolversByFunction(params).promise().toFuture
    @inline def listResolversFuture(params: ListResolversRequest): Future[ListResolversResponse] = service.listResolvers(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listTypesFuture(params: ListTypesRequest): Future[ListTypesResponse] = service.listTypes(params).promise().toFuture
    @inline def startSchemaCreationFuture(params: StartSchemaCreationRequest): Future[StartSchemaCreationResponse] = service.startSchemaCreation(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateApiCacheFuture(params: UpdateApiCacheRequest): Future[UpdateApiCacheResponse] = service.updateApiCache(params).promise().toFuture
    @inline def updateApiKeyFuture(params: UpdateApiKeyRequest): Future[UpdateApiKeyResponse] = service.updateApiKey(params).promise().toFuture
    @inline def updateDataSourceFuture(params: UpdateDataSourceRequest): Future[UpdateDataSourceResponse] = service.updateDataSource(params).promise().toFuture
    @inline def updateFunctionFuture(params: UpdateFunctionRequest): Future[UpdateFunctionResponse] = service.updateFunction(params).promise().toFuture
    @inline def updateGraphqlApiFuture(params: UpdateGraphqlApiRequest): Future[UpdateGraphqlApiResponse] = service.updateGraphqlApi(params).promise().toFuture
    @inline def updateResolverFuture(params: UpdateResolverRequest): Future[UpdateResolverResponse] = service.updateResolver(params).promise().toFuture
    @inline def updateTypeFuture(params: UpdateTypeRequest): Future[UpdateTypeResponse] = service.updateType(params).promise().toFuture

  }
}

package appsync {
  @js.native
  @JSImport("aws-sdk", "AppSync", "AWS.AppSync")
  class AppSync() extends js.Object {
    def this(config: AWSConfig) = this()

    def createApiCache(params: CreateApiCacheRequest): Request[CreateApiCacheResponse] = js.native
    def createApiKey(params: CreateApiKeyRequest): Request[CreateApiKeyResponse] = js.native
    def createDataSource(params: CreateDataSourceRequest): Request[CreateDataSourceResponse] = js.native
    def createFunction(params: CreateFunctionRequest): Request[CreateFunctionResponse] = js.native
    def createGraphqlApi(params: CreateGraphqlApiRequest): Request[CreateGraphqlApiResponse] = js.native
    def createResolver(params: CreateResolverRequest): Request[CreateResolverResponse] = js.native
    def createType(params: CreateTypeRequest): Request[CreateTypeResponse] = js.native
    def deleteApiCache(params: DeleteApiCacheRequest): Request[DeleteApiCacheResponse] = js.native
    def deleteApiKey(params: DeleteApiKeyRequest): Request[DeleteApiKeyResponse] = js.native
    def deleteDataSource(params: DeleteDataSourceRequest): Request[DeleteDataSourceResponse] = js.native
    def deleteFunction(params: DeleteFunctionRequest): Request[DeleteFunctionResponse] = js.native
    def deleteGraphqlApi(params: DeleteGraphqlApiRequest): Request[DeleteGraphqlApiResponse] = js.native
    def deleteResolver(params: DeleteResolverRequest): Request[DeleteResolverResponse] = js.native
    def deleteType(params: DeleteTypeRequest): Request[DeleteTypeResponse] = js.native
    def flushApiCache(params: FlushApiCacheRequest): Request[FlushApiCacheResponse] = js.native
    def getApiCache(params: GetApiCacheRequest): Request[GetApiCacheResponse] = js.native
    def getDataSource(params: GetDataSourceRequest): Request[GetDataSourceResponse] = js.native
    def getFunction(params: GetFunctionRequest): Request[GetFunctionResponse] = js.native
    def getGraphqlApi(params: GetGraphqlApiRequest): Request[GetGraphqlApiResponse] = js.native
    def getIntrospectionSchema(params: GetIntrospectionSchemaRequest): Request[GetIntrospectionSchemaResponse] = js.native
    def getResolver(params: GetResolverRequest): Request[GetResolverResponse] = js.native
    def getSchemaCreationStatus(params: GetSchemaCreationStatusRequest): Request[GetSchemaCreationStatusResponse] = js.native
    def getType(params: GetTypeRequest): Request[GetTypeResponse] = js.native
    def listApiKeys(params: ListApiKeysRequest): Request[ListApiKeysResponse] = js.native
    def listDataSources(params: ListDataSourcesRequest): Request[ListDataSourcesResponse] = js.native
    def listFunctions(params: ListFunctionsRequest): Request[ListFunctionsResponse] = js.native
    def listGraphqlApis(params: ListGraphqlApisRequest): Request[ListGraphqlApisResponse] = js.native
    def listResolvers(params: ListResolversRequest): Request[ListResolversResponse] = js.native
    def listResolversByFunction(params: ListResolversByFunctionRequest): Request[ListResolversByFunctionResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listTypes(params: ListTypesRequest): Request[ListTypesResponse] = js.native
    def startSchemaCreation(params: StartSchemaCreationRequest): Request[StartSchemaCreationResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateApiCache(params: UpdateApiCacheRequest): Request[UpdateApiCacheResponse] = js.native
    def updateApiKey(params: UpdateApiKeyRequest): Request[UpdateApiKeyResponse] = js.native
    def updateDataSource(params: UpdateDataSourceRequest): Request[UpdateDataSourceResponse] = js.native
    def updateFunction(params: UpdateFunctionRequest): Request[UpdateFunctionResponse] = js.native
    def updateGraphqlApi(params: UpdateGraphqlApiRequest): Request[UpdateGraphqlApiResponse] = js.native
    def updateResolver(params: UpdateResolverRequest): Request[UpdateResolverResponse] = js.native
    def updateType(params: UpdateTypeRequest): Request[UpdateTypeResponse] = js.native
  }

  /**
    * Describes an additional authentication provider.
    */
  @js.native
  trait AdditionalAuthenticationProvider extends js.Object {
    var authenticationType: js.UndefOr[AuthenticationType]
    var openIDConnectConfig: js.UndefOr[OpenIDConnectConfig]
    var userPoolConfig: js.UndefOr[CognitoUserPoolConfig]
  }

  object AdditionalAuthenticationProvider {
    @inline
    def apply(
        authenticationType: js.UndefOr[AuthenticationType] = js.undefined,
        openIDConnectConfig: js.UndefOr[OpenIDConnectConfig] = js.undefined,
        userPoolConfig: js.UndefOr[CognitoUserPoolConfig] = js.undefined
    ): AdditionalAuthenticationProvider = {
      val __obj = js.Dynamic.literal()
      authenticationType.foreach(__v => __obj.updateDynamic("authenticationType")(__v.asInstanceOf[js.Any]))
      openIDConnectConfig.foreach(__v => __obj.updateDynamic("openIDConnectConfig")(__v.asInstanceOf[js.Any]))
      userPoolConfig.foreach(__v => __obj.updateDynamic("userPoolConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdditionalAuthenticationProvider]
    }
  }

  /**
    * The <code>ApiCache</code> object.
    */
  @js.native
  trait ApiCache extends js.Object {
    var apiCachingBehavior: js.UndefOr[ApiCachingBehavior]
    var atRestEncryptionEnabled: js.UndefOr[Boolean]
    var status: js.UndefOr[ApiCacheStatus]
    var transitEncryptionEnabled: js.UndefOr[Boolean]
    var ttl: js.UndefOr[Double]
    var `type`: js.UndefOr[ApiCacheType]
  }

  object ApiCache {
    @inline
    def apply(
        apiCachingBehavior: js.UndefOr[ApiCachingBehavior] = js.undefined,
        atRestEncryptionEnabled: js.UndefOr[Boolean] = js.undefined,
        status: js.UndefOr[ApiCacheStatus] = js.undefined,
        transitEncryptionEnabled: js.UndefOr[Boolean] = js.undefined,
        ttl: js.UndefOr[Double] = js.undefined,
        `type`: js.UndefOr[ApiCacheType] = js.undefined
    ): ApiCache = {
      val __obj = js.Dynamic.literal()
      apiCachingBehavior.foreach(__v => __obj.updateDynamic("apiCachingBehavior")(__v.asInstanceOf[js.Any]))
      atRestEncryptionEnabled.foreach(__v => __obj.updateDynamic("atRestEncryptionEnabled")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      transitEncryptionEnabled.foreach(__v => __obj.updateDynamic("transitEncryptionEnabled")(__v.asInstanceOf[js.Any]))
      ttl.foreach(__v => __obj.updateDynamic("ttl")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApiCache]
    }
  }

  @js.native
  sealed trait ApiCacheStatus extends js.Any
  object ApiCacheStatus {
    val AVAILABLE = "AVAILABLE".asInstanceOf[ApiCacheStatus]
    val CREATING = "CREATING".asInstanceOf[ApiCacheStatus]
    val DELETING = "DELETING".asInstanceOf[ApiCacheStatus]
    val MODIFYING = "MODIFYING".asInstanceOf[ApiCacheStatus]
    val FAILED = "FAILED".asInstanceOf[ApiCacheStatus]

    @inline def values = js.Array(AVAILABLE, CREATING, DELETING, MODIFYING, FAILED)
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

    @inline def values = js.Array(T2_SMALL, T2_MEDIUM, R4_LARGE, R4_XLARGE, R4_2XLARGE, R4_4XLARGE, R4_8XLARGE, SMALL, MEDIUM, LARGE, XLARGE, LARGE_2X, LARGE_4X, LARGE_8X, LARGE_12X)
  }

  @js.native
  sealed trait ApiCachingBehavior extends js.Any
  object ApiCachingBehavior {
    val FULL_REQUEST_CACHING = "FULL_REQUEST_CACHING".asInstanceOf[ApiCachingBehavior]
    val PER_RESOLVER_CACHING = "PER_RESOLVER_CACHING".asInstanceOf[ApiCachingBehavior]

    @inline def values = js.Array(FULL_REQUEST_CACHING, PER_RESOLVER_CACHING)
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
  trait ApiKey extends js.Object {
    var description: js.UndefOr[String]
    var expires: js.UndefOr[Double]
    var id: js.UndefOr[String]
  }

  object ApiKey {
    @inline
    def apply(
        description: js.UndefOr[String] = js.undefined,
        expires: js.UndefOr[Double] = js.undefined,
        id: js.UndefOr[String] = js.undefined
    ): ApiKey = {
      val __obj = js.Dynamic.literal()
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      expires.foreach(__v => __obj.updateDynamic("expires")(__v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.updateDynamic("id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApiKey]
    }
  }

  @js.native
  sealed trait AuthenticationType extends js.Any
  object AuthenticationType {
    val API_KEY = "API_KEY".asInstanceOf[AuthenticationType]
    val AWS_IAM = "AWS_IAM".asInstanceOf[AuthenticationType]
    val AMAZON_COGNITO_USER_POOLS = "AMAZON_COGNITO_USER_POOLS".asInstanceOf[AuthenticationType]
    val OPENID_CONNECT = "OPENID_CONNECT".asInstanceOf[AuthenticationType]

    @inline def values = js.Array(API_KEY, AWS_IAM, AMAZON_COGNITO_USER_POOLS, OPENID_CONNECT)
  }

  /**
    * The authorization config in case the HTTP endpoint requires authorization.
    */
  @js.native
  trait AuthorizationConfig extends js.Object {
    var authorizationType: AuthorizationType
    var awsIamConfig: js.UndefOr[AwsIamConfig]
  }

  object AuthorizationConfig {
    @inline
    def apply(
        authorizationType: AuthorizationType,
        awsIamConfig: js.UndefOr[AwsIamConfig] = js.undefined
    ): AuthorizationConfig = {
      val __obj = js.Dynamic.literal(
        "authorizationType" -> authorizationType.asInstanceOf[js.Any]
      )

      awsIamConfig.foreach(__v => __obj.updateDynamic("awsIamConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuthorizationConfig]
    }
  }

  @js.native
  sealed trait AuthorizationType extends js.Any
  object AuthorizationType {
    val AWS_IAM = "AWS_IAM".asInstanceOf[AuthorizationType]

    @inline def values = js.Array(AWS_IAM)
  }

  /**
    * The AWS IAM configuration.
    */
  @js.native
  trait AwsIamConfig extends js.Object {
    var signingRegion: js.UndefOr[String]
    var signingServiceName: js.UndefOr[String]
  }

  object AwsIamConfig {
    @inline
    def apply(
        signingRegion: js.UndefOr[String] = js.undefined,
        signingServiceName: js.UndefOr[String] = js.undefined
    ): AwsIamConfig = {
      val __obj = js.Dynamic.literal()
      signingRegion.foreach(__v => __obj.updateDynamic("signingRegion")(__v.asInstanceOf[js.Any]))
      signingServiceName.foreach(__v => __obj.updateDynamic("signingServiceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsIamConfig]
    }
  }

  /**
    * The caching configuration for a resolver that has caching enabled.
    */
  @js.native
  trait CachingConfig extends js.Object {
    var cachingKeys: js.UndefOr[CachingKeys]
    var ttl: js.UndefOr[Double]
  }

  object CachingConfig {
    @inline
    def apply(
        cachingKeys: js.UndefOr[CachingKeys] = js.undefined,
        ttl: js.UndefOr[Double] = js.undefined
    ): CachingConfig = {
      val __obj = js.Dynamic.literal()
      cachingKeys.foreach(__v => __obj.updateDynamic("cachingKeys")(__v.asInstanceOf[js.Any]))
      ttl.foreach(__v => __obj.updateDynamic("ttl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CachingConfig]
    }
  }

  /**
    * Describes an Amazon Cognito user pool configuration.
    */
  @js.native
  trait CognitoUserPoolConfig extends js.Object {
    var awsRegion: String
    var userPoolId: String
    var appIdClientRegex: js.UndefOr[String]
  }

  object CognitoUserPoolConfig {
    @inline
    def apply(
        awsRegion: String,
        userPoolId: String,
        appIdClientRegex: js.UndefOr[String] = js.undefined
    ): CognitoUserPoolConfig = {
      val __obj = js.Dynamic.literal(
        "awsRegion" -> awsRegion.asInstanceOf[js.Any],
        "userPoolId" -> userPoolId.asInstanceOf[js.Any]
      )

      appIdClientRegex.foreach(__v => __obj.updateDynamic("appIdClientRegex")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CognitoUserPoolConfig]
    }
  }

  @js.native
  sealed trait ConflictDetectionType extends js.Any
  object ConflictDetectionType {
    val VERSION = "VERSION".asInstanceOf[ConflictDetectionType]
    val NONE = "NONE".asInstanceOf[ConflictDetectionType]

    @inline def values = js.Array(VERSION, NONE)
  }

  @js.native
  sealed trait ConflictHandlerType extends js.Any
  object ConflictHandlerType {
    val OPTIMISTIC_CONCURRENCY = "OPTIMISTIC_CONCURRENCY".asInstanceOf[ConflictHandlerType]
    val LAMBDA = "LAMBDA".asInstanceOf[ConflictHandlerType]
    val AUTOMERGE = "AUTOMERGE".asInstanceOf[ConflictHandlerType]
    val NONE = "NONE".asInstanceOf[ConflictHandlerType]

    @inline def values = js.Array(OPTIMISTIC_CONCURRENCY, LAMBDA, AUTOMERGE, NONE)
  }

  /**
    * Represents the input of a <code>CreateApiCache</code> operation.
    */
  @js.native
  trait CreateApiCacheRequest extends js.Object {
    var apiCachingBehavior: ApiCachingBehavior
    var apiId: String
    var ttl: Double
    var `type`: ApiCacheType
    var atRestEncryptionEnabled: js.UndefOr[Boolean]
    var transitEncryptionEnabled: js.UndefOr[Boolean]
  }

  object CreateApiCacheRequest {
    @inline
    def apply(
        apiCachingBehavior: ApiCachingBehavior,
        apiId: String,
        ttl: Double,
        `type`: ApiCacheType,
        atRestEncryptionEnabled: js.UndefOr[Boolean] = js.undefined,
        transitEncryptionEnabled: js.UndefOr[Boolean] = js.undefined
    ): CreateApiCacheRequest = {
      val __obj = js.Dynamic.literal(
        "apiCachingBehavior" -> apiCachingBehavior.asInstanceOf[js.Any],
        "apiId" -> apiId.asInstanceOf[js.Any],
        "ttl" -> ttl.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      atRestEncryptionEnabled.foreach(__v => __obj.updateDynamic("atRestEncryptionEnabled")(__v.asInstanceOf[js.Any]))
      transitEncryptionEnabled.foreach(__v => __obj.updateDynamic("transitEncryptionEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApiCacheRequest]
    }
  }

  /**
    * Represents the output of a <code>CreateApiCache</code> operation.
    */
  @js.native
  trait CreateApiCacheResponse extends js.Object {
    var apiCache: js.UndefOr[ApiCache]
  }

  object CreateApiCacheResponse {
    @inline
    def apply(
        apiCache: js.UndefOr[ApiCache] = js.undefined
    ): CreateApiCacheResponse = {
      val __obj = js.Dynamic.literal()
      apiCache.foreach(__v => __obj.updateDynamic("apiCache")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApiCacheResponse]
    }
  }

  @js.native
  trait CreateApiKeyRequest extends js.Object {
    var apiId: String
    var description: js.UndefOr[String]
    var expires: js.UndefOr[Double]
  }

  object CreateApiKeyRequest {
    @inline
    def apply(
        apiId: String,
        description: js.UndefOr[String] = js.undefined,
        expires: js.UndefOr[Double] = js.undefined
    ): CreateApiKeyRequest = {
      val __obj = js.Dynamic.literal(
        "apiId" -> apiId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      expires.foreach(__v => __obj.updateDynamic("expires")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApiKeyRequest]
    }
  }

  @js.native
  trait CreateApiKeyResponse extends js.Object {
    var apiKey: js.UndefOr[ApiKey]
  }

  object CreateApiKeyResponse {
    @inline
    def apply(
        apiKey: js.UndefOr[ApiKey] = js.undefined
    ): CreateApiKeyResponse = {
      val __obj = js.Dynamic.literal()
      apiKey.foreach(__v => __obj.updateDynamic("apiKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApiKeyResponse]
    }
  }

  @js.native
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

  object CreateDataSourceRequest {
    @inline
    def apply(
        apiId: String,
        name: ResourceName,
        `type`: DataSourceType,
        description: js.UndefOr[String] = js.undefined,
        dynamodbConfig: js.UndefOr[DynamodbDataSourceConfig] = js.undefined,
        elasticsearchConfig: js.UndefOr[ElasticsearchDataSourceConfig] = js.undefined,
        httpConfig: js.UndefOr[HttpDataSourceConfig] = js.undefined,
        lambdaConfig: js.UndefOr[LambdaDataSourceConfig] = js.undefined,
        relationalDatabaseConfig: js.UndefOr[RelationalDatabaseDataSourceConfig] = js.undefined,
        serviceRoleArn: js.UndefOr[String] = js.undefined
    ): CreateDataSourceRequest = {
      val __obj = js.Dynamic.literal(
        "apiId" -> apiId.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      dynamodbConfig.foreach(__v => __obj.updateDynamic("dynamodbConfig")(__v.asInstanceOf[js.Any]))
      elasticsearchConfig.foreach(__v => __obj.updateDynamic("elasticsearchConfig")(__v.asInstanceOf[js.Any]))
      httpConfig.foreach(__v => __obj.updateDynamic("httpConfig")(__v.asInstanceOf[js.Any]))
      lambdaConfig.foreach(__v => __obj.updateDynamic("lambdaConfig")(__v.asInstanceOf[js.Any]))
      relationalDatabaseConfig.foreach(__v => __obj.updateDynamic("relationalDatabaseConfig")(__v.asInstanceOf[js.Any]))
      serviceRoleArn.foreach(__v => __obj.updateDynamic("serviceRoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDataSourceRequest]
    }
  }

  @js.native
  trait CreateDataSourceResponse extends js.Object {
    var dataSource: js.UndefOr[DataSource]
  }

  object CreateDataSourceResponse {
    @inline
    def apply(
        dataSource: js.UndefOr[DataSource] = js.undefined
    ): CreateDataSourceResponse = {
      val __obj = js.Dynamic.literal()
      dataSource.foreach(__v => __obj.updateDynamic("dataSource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDataSourceResponse]
    }
  }

  @js.native
  trait CreateFunctionRequest extends js.Object {
    var apiId: String
    var dataSourceName: ResourceName
    var functionVersion: String
    var name: ResourceName
    var requestMappingTemplate: MappingTemplate
    var description: js.UndefOr[String]
    var responseMappingTemplate: js.UndefOr[MappingTemplate]
  }

  object CreateFunctionRequest {
    @inline
    def apply(
        apiId: String,
        dataSourceName: ResourceName,
        functionVersion: String,
        name: ResourceName,
        requestMappingTemplate: MappingTemplate,
        description: js.UndefOr[String] = js.undefined,
        responseMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined
    ): CreateFunctionRequest = {
      val __obj = js.Dynamic.literal(
        "apiId" -> apiId.asInstanceOf[js.Any],
        "dataSourceName" -> dataSourceName.asInstanceOf[js.Any],
        "functionVersion" -> functionVersion.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "requestMappingTemplate" -> requestMappingTemplate.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      responseMappingTemplate.foreach(__v => __obj.updateDynamic("responseMappingTemplate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFunctionRequest]
    }
  }

  @js.native
  trait CreateFunctionResponse extends js.Object {
    var functionConfiguration: js.UndefOr[FunctionConfiguration]
  }

  object CreateFunctionResponse {
    @inline
    def apply(
        functionConfiguration: js.UndefOr[FunctionConfiguration] = js.undefined
    ): CreateFunctionResponse = {
      val __obj = js.Dynamic.literal()
      functionConfiguration.foreach(__v => __obj.updateDynamic("functionConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFunctionResponse]
    }
  }

  @js.native
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

  object CreateGraphqlApiRequest {
    @inline
    def apply(
        authenticationType: AuthenticationType,
        name: String,
        additionalAuthenticationProviders: js.UndefOr[AdditionalAuthenticationProviders] = js.undefined,
        logConfig: js.UndefOr[LogConfig] = js.undefined,
        openIDConnectConfig: js.UndefOr[OpenIDConnectConfig] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        userPoolConfig: js.UndefOr[UserPoolConfig] = js.undefined,
        xrayEnabled: js.UndefOr[Boolean] = js.undefined
    ): CreateGraphqlApiRequest = {
      val __obj = js.Dynamic.literal(
        "authenticationType" -> authenticationType.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      additionalAuthenticationProviders.foreach(__v => __obj.updateDynamic("additionalAuthenticationProviders")(__v.asInstanceOf[js.Any]))
      logConfig.foreach(__v => __obj.updateDynamic("logConfig")(__v.asInstanceOf[js.Any]))
      openIDConnectConfig.foreach(__v => __obj.updateDynamic("openIDConnectConfig")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      userPoolConfig.foreach(__v => __obj.updateDynamic("userPoolConfig")(__v.asInstanceOf[js.Any]))
      xrayEnabled.foreach(__v => __obj.updateDynamic("xrayEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGraphqlApiRequest]
    }
  }

  @js.native
  trait CreateGraphqlApiResponse extends js.Object {
    var graphqlApi: js.UndefOr[GraphqlApi]
  }

  object CreateGraphqlApiResponse {
    @inline
    def apply(
        graphqlApi: js.UndefOr[GraphqlApi] = js.undefined
    ): CreateGraphqlApiResponse = {
      val __obj = js.Dynamic.literal()
      graphqlApi.foreach(__v => __obj.updateDynamic("graphqlApi")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGraphqlApiResponse]
    }
  }

  @js.native
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

  object CreateResolverRequest {
    @inline
    def apply(
        apiId: String,
        fieldName: ResourceName,
        requestMappingTemplate: MappingTemplate,
        typeName: ResourceName,
        cachingConfig: js.UndefOr[CachingConfig] = js.undefined,
        dataSourceName: js.UndefOr[ResourceName] = js.undefined,
        kind: js.UndefOr[ResolverKind] = js.undefined,
        pipelineConfig: js.UndefOr[PipelineConfig] = js.undefined,
        responseMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined,
        syncConfig: js.UndefOr[SyncConfig] = js.undefined
    ): CreateResolverRequest = {
      val __obj = js.Dynamic.literal(
        "apiId" -> apiId.asInstanceOf[js.Any],
        "fieldName" -> fieldName.asInstanceOf[js.Any],
        "requestMappingTemplate" -> requestMappingTemplate.asInstanceOf[js.Any],
        "typeName" -> typeName.asInstanceOf[js.Any]
      )

      cachingConfig.foreach(__v => __obj.updateDynamic("cachingConfig")(__v.asInstanceOf[js.Any]))
      dataSourceName.foreach(__v => __obj.updateDynamic("dataSourceName")(__v.asInstanceOf[js.Any]))
      kind.foreach(__v => __obj.updateDynamic("kind")(__v.asInstanceOf[js.Any]))
      pipelineConfig.foreach(__v => __obj.updateDynamic("pipelineConfig")(__v.asInstanceOf[js.Any]))
      responseMappingTemplate.foreach(__v => __obj.updateDynamic("responseMappingTemplate")(__v.asInstanceOf[js.Any]))
      syncConfig.foreach(__v => __obj.updateDynamic("syncConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateResolverRequest]
    }
  }

  @js.native
  trait CreateResolverResponse extends js.Object {
    var resolver: js.UndefOr[Resolver]
  }

  object CreateResolverResponse {
    @inline
    def apply(
        resolver: js.UndefOr[Resolver] = js.undefined
    ): CreateResolverResponse = {
      val __obj = js.Dynamic.literal()
      resolver.foreach(__v => __obj.updateDynamic("resolver")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateResolverResponse]
    }
  }

  @js.native
  trait CreateTypeRequest extends js.Object {
    var apiId: String
    var definition: String
    var format: TypeDefinitionFormat
  }

  object CreateTypeRequest {
    @inline
    def apply(
        apiId: String,
        definition: String,
        format: TypeDefinitionFormat
    ): CreateTypeRequest = {
      val __obj = js.Dynamic.literal(
        "apiId" -> apiId.asInstanceOf[js.Any],
        "definition" -> definition.asInstanceOf[js.Any],
        "format" -> format.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateTypeRequest]
    }
  }

  @js.native
  trait CreateTypeResponse extends js.Object {
    var `type`: js.UndefOr[Type]
  }

  object CreateTypeResponse {
    @inline
    def apply(
        `type`: js.UndefOr[Type] = js.undefined
    ): CreateTypeResponse = {
      val __obj = js.Dynamic.literal()
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTypeResponse]
    }
  }

  /**
    * Describes a data source.
    */
  @js.native
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

  object DataSource {
    @inline
    def apply(
        dataSourceArn: js.UndefOr[String] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        dynamodbConfig: js.UndefOr[DynamodbDataSourceConfig] = js.undefined,
        elasticsearchConfig: js.UndefOr[ElasticsearchDataSourceConfig] = js.undefined,
        httpConfig: js.UndefOr[HttpDataSourceConfig] = js.undefined,
        lambdaConfig: js.UndefOr[LambdaDataSourceConfig] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        relationalDatabaseConfig: js.UndefOr[RelationalDatabaseDataSourceConfig] = js.undefined,
        serviceRoleArn: js.UndefOr[String] = js.undefined,
        `type`: js.UndefOr[DataSourceType] = js.undefined
    ): DataSource = {
      val __obj = js.Dynamic.literal()
      dataSourceArn.foreach(__v => __obj.updateDynamic("dataSourceArn")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      dynamodbConfig.foreach(__v => __obj.updateDynamic("dynamodbConfig")(__v.asInstanceOf[js.Any]))
      elasticsearchConfig.foreach(__v => __obj.updateDynamic("elasticsearchConfig")(__v.asInstanceOf[js.Any]))
      httpConfig.foreach(__v => __obj.updateDynamic("httpConfig")(__v.asInstanceOf[js.Any]))
      lambdaConfig.foreach(__v => __obj.updateDynamic("lambdaConfig")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      relationalDatabaseConfig.foreach(__v => __obj.updateDynamic("relationalDatabaseConfig")(__v.asInstanceOf[js.Any]))
      serviceRoleArn.foreach(__v => __obj.updateDynamic("serviceRoleArn")(__v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataSource]
    }
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

    @inline def values = js.Array(AWS_LAMBDA, AMAZON_DYNAMODB, AMAZON_ELASTICSEARCH, NONE, HTTP, RELATIONAL_DATABASE)
  }

  @js.native
  sealed trait DefaultAction extends js.Any
  object DefaultAction {
    val ALLOW = "ALLOW".asInstanceOf[DefaultAction]
    val DENY = "DENY".asInstanceOf[DefaultAction]

    @inline def values = js.Array(ALLOW, DENY)
  }

  /**
    * Represents the input of a <code>DeleteApiCache</code> operation.
    */
  @js.native
  trait DeleteApiCacheRequest extends js.Object {
    var apiId: String
  }

  object DeleteApiCacheRequest {
    @inline
    def apply(
        apiId: String
    ): DeleteApiCacheRequest = {
      val __obj = js.Dynamic.literal(
        "apiId" -> apiId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteApiCacheRequest]
    }
  }

  /**
    * Represents the output of a <code>DeleteApiCache</code> operation.
    */
  @js.native
  trait DeleteApiCacheResponse extends js.Object {}

  object DeleteApiCacheResponse {
    @inline
    def apply(
    ): DeleteApiCacheResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteApiCacheResponse]
    }
  }

  @js.native
  trait DeleteApiKeyRequest extends js.Object {
    var apiId: String
    var id: String
  }

  object DeleteApiKeyRequest {
    @inline
    def apply(
        apiId: String,
        id: String
    ): DeleteApiKeyRequest = {
      val __obj = js.Dynamic.literal(
        "apiId" -> apiId.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteApiKeyRequest]
    }
  }

  @js.native
  trait DeleteApiKeyResponse extends js.Object {}

  object DeleteApiKeyResponse {
    @inline
    def apply(
    ): DeleteApiKeyResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteApiKeyResponse]
    }
  }

  @js.native
  trait DeleteDataSourceRequest extends js.Object {
    var apiId: String
    var name: ResourceName
  }

  object DeleteDataSourceRequest {
    @inline
    def apply(
        apiId: String,
        name: ResourceName
    ): DeleteDataSourceRequest = {
      val __obj = js.Dynamic.literal(
        "apiId" -> apiId.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDataSourceRequest]
    }
  }

  @js.native
  trait DeleteDataSourceResponse extends js.Object {}

  object DeleteDataSourceResponse {
    @inline
    def apply(
    ): DeleteDataSourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteDataSourceResponse]
    }
  }

  @js.native
  trait DeleteFunctionRequest extends js.Object {
    var apiId: String
    var functionId: ResourceName
  }

  object DeleteFunctionRequest {
    @inline
    def apply(
        apiId: String,
        functionId: ResourceName
    ): DeleteFunctionRequest = {
      val __obj = js.Dynamic.literal(
        "apiId" -> apiId.asInstanceOf[js.Any],
        "functionId" -> functionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteFunctionRequest]
    }
  }

  @js.native
  trait DeleteFunctionResponse extends js.Object {}

  object DeleteFunctionResponse {
    @inline
    def apply(
    ): DeleteFunctionResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteFunctionResponse]
    }
  }

  @js.native
  trait DeleteGraphqlApiRequest extends js.Object {
    var apiId: String
  }

  object DeleteGraphqlApiRequest {
    @inline
    def apply(
        apiId: String
    ): DeleteGraphqlApiRequest = {
      val __obj = js.Dynamic.literal(
        "apiId" -> apiId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteGraphqlApiRequest]
    }
  }

  @js.native
  trait DeleteGraphqlApiResponse extends js.Object {}

  object DeleteGraphqlApiResponse {
    @inline
    def apply(
    ): DeleteGraphqlApiResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteGraphqlApiResponse]
    }
  }

  @js.native
  trait DeleteResolverRequest extends js.Object {
    var apiId: String
    var fieldName: ResourceName
    var typeName: ResourceName
  }

  object DeleteResolverRequest {
    @inline
    def apply(
        apiId: String,
        fieldName: ResourceName,
        typeName: ResourceName
    ): DeleteResolverRequest = {
      val __obj = js.Dynamic.literal(
        "apiId" -> apiId.asInstanceOf[js.Any],
        "fieldName" -> fieldName.asInstanceOf[js.Any],
        "typeName" -> typeName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteResolverRequest]
    }
  }

  @js.native
  trait DeleteResolverResponse extends js.Object {}

  object DeleteResolverResponse {
    @inline
    def apply(
    ): DeleteResolverResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteResolverResponse]
    }
  }

  @js.native
  trait DeleteTypeRequest extends js.Object {
    var apiId: String
    var typeName: ResourceName
  }

  object DeleteTypeRequest {
    @inline
    def apply(
        apiId: String,
        typeName: ResourceName
    ): DeleteTypeRequest = {
      val __obj = js.Dynamic.literal(
        "apiId" -> apiId.asInstanceOf[js.Any],
        "typeName" -> typeName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteTypeRequest]
    }
  }

  @js.native
  trait DeleteTypeResponse extends js.Object {}

  object DeleteTypeResponse {
    @inline
    def apply(
    ): DeleteTypeResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteTypeResponse]
    }
  }

  /**
    * Describes a Delta Sync configuration.
    */
  @js.native
  trait DeltaSyncConfig extends js.Object {
    var baseTableTTL: js.UndefOr[Double]
    var deltaSyncTableName: js.UndefOr[String]
    var deltaSyncTableTTL: js.UndefOr[Double]
  }

  object DeltaSyncConfig {
    @inline
    def apply(
        baseTableTTL: js.UndefOr[Double] = js.undefined,
        deltaSyncTableName: js.UndefOr[String] = js.undefined,
        deltaSyncTableTTL: js.UndefOr[Double] = js.undefined
    ): DeltaSyncConfig = {
      val __obj = js.Dynamic.literal()
      baseTableTTL.foreach(__v => __obj.updateDynamic("baseTableTTL")(__v.asInstanceOf[js.Any]))
      deltaSyncTableName.foreach(__v => __obj.updateDynamic("deltaSyncTableName")(__v.asInstanceOf[js.Any]))
      deltaSyncTableTTL.foreach(__v => __obj.updateDynamic("deltaSyncTableTTL")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeltaSyncConfig]
    }
  }

  /**
    * Describes an Amazon DynamoDB data source configuration.
    */
  @js.native
  trait DynamodbDataSourceConfig extends js.Object {
    var awsRegion: String
    var tableName: String
    var deltaSyncConfig: js.UndefOr[DeltaSyncConfig]
    var useCallerCredentials: js.UndefOr[Boolean]
    var versioned: js.UndefOr[Boolean]
  }

  object DynamodbDataSourceConfig {
    @inline
    def apply(
        awsRegion: String,
        tableName: String,
        deltaSyncConfig: js.UndefOr[DeltaSyncConfig] = js.undefined,
        useCallerCredentials: js.UndefOr[Boolean] = js.undefined,
        versioned: js.UndefOr[Boolean] = js.undefined
    ): DynamodbDataSourceConfig = {
      val __obj = js.Dynamic.literal(
        "awsRegion" -> awsRegion.asInstanceOf[js.Any],
        "tableName" -> tableName.asInstanceOf[js.Any]
      )

      deltaSyncConfig.foreach(__v => __obj.updateDynamic("deltaSyncConfig")(__v.asInstanceOf[js.Any]))
      useCallerCredentials.foreach(__v => __obj.updateDynamic("useCallerCredentials")(__v.asInstanceOf[js.Any]))
      versioned.foreach(__v => __obj.updateDynamic("versioned")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DynamodbDataSourceConfig]
    }
  }

  /**
    * Describes an Elasticsearch data source configuration.
    */
  @js.native
  trait ElasticsearchDataSourceConfig extends js.Object {
    var awsRegion: String
    var endpoint: String
  }

  object ElasticsearchDataSourceConfig {
    @inline
    def apply(
        awsRegion: String,
        endpoint: String
    ): ElasticsearchDataSourceConfig = {
      val __obj = js.Dynamic.literal(
        "awsRegion" -> awsRegion.asInstanceOf[js.Any],
        "endpoint" -> endpoint.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ElasticsearchDataSourceConfig]
    }
  }

  @js.native
  sealed trait FieldLogLevel extends js.Any
  object FieldLogLevel {
    val NONE = "NONE".asInstanceOf[FieldLogLevel]
    val ERROR = "ERROR".asInstanceOf[FieldLogLevel]
    val ALL = "ALL".asInstanceOf[FieldLogLevel]

    @inline def values = js.Array(NONE, ERROR, ALL)
  }

  /**
    * Represents the input of a <code>FlushApiCache</code> operation.
    */
  @js.native
  trait FlushApiCacheRequest extends js.Object {
    var apiId: String
  }

  object FlushApiCacheRequest {
    @inline
    def apply(
        apiId: String
    ): FlushApiCacheRequest = {
      val __obj = js.Dynamic.literal(
        "apiId" -> apiId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[FlushApiCacheRequest]
    }
  }

  /**
    * Represents the output of a <code>FlushApiCache</code> operation.
    */
  @js.native
  trait FlushApiCacheResponse extends js.Object {}

  object FlushApiCacheResponse {
    @inline
    def apply(
    ): FlushApiCacheResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[FlushApiCacheResponse]
    }
  }

  /**
    * A function is a reusable entity. Multiple functions can be used to compose the resolver logic.
    */
  @js.native
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

  object FunctionConfiguration {
    @inline
    def apply(
        dataSourceName: js.UndefOr[ResourceName] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        functionArn: js.UndefOr[String] = js.undefined,
        functionId: js.UndefOr[String] = js.undefined,
        functionVersion: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        requestMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined,
        responseMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined
    ): FunctionConfiguration = {
      val __obj = js.Dynamic.literal()
      dataSourceName.foreach(__v => __obj.updateDynamic("dataSourceName")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      functionArn.foreach(__v => __obj.updateDynamic("functionArn")(__v.asInstanceOf[js.Any]))
      functionId.foreach(__v => __obj.updateDynamic("functionId")(__v.asInstanceOf[js.Any]))
      functionVersion.foreach(__v => __obj.updateDynamic("functionVersion")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      requestMappingTemplate.foreach(__v => __obj.updateDynamic("requestMappingTemplate")(__v.asInstanceOf[js.Any]))
      responseMappingTemplate.foreach(__v => __obj.updateDynamic("responseMappingTemplate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FunctionConfiguration]
    }
  }

  /**
    * Represents the input of a <code>GetApiCache</code> operation.
    */
  @js.native
  trait GetApiCacheRequest extends js.Object {
    var apiId: String
  }

  object GetApiCacheRequest {
    @inline
    def apply(
        apiId: String
    ): GetApiCacheRequest = {
      val __obj = js.Dynamic.literal(
        "apiId" -> apiId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetApiCacheRequest]
    }
  }

  /**
    * Represents the output of a <code>GetApiCache</code> operation.
    */
  @js.native
  trait GetApiCacheResponse extends js.Object {
    var apiCache: js.UndefOr[ApiCache]
  }

  object GetApiCacheResponse {
    @inline
    def apply(
        apiCache: js.UndefOr[ApiCache] = js.undefined
    ): GetApiCacheResponse = {
      val __obj = js.Dynamic.literal()
      apiCache.foreach(__v => __obj.updateDynamic("apiCache")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetApiCacheResponse]
    }
  }

  @js.native
  trait GetDataSourceRequest extends js.Object {
    var apiId: String
    var name: ResourceName
  }

  object GetDataSourceRequest {
    @inline
    def apply(
        apiId: String,
        name: ResourceName
    ): GetDataSourceRequest = {
      val __obj = js.Dynamic.literal(
        "apiId" -> apiId.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDataSourceRequest]
    }
  }

  @js.native
  trait GetDataSourceResponse extends js.Object {
    var dataSource: js.UndefOr[DataSource]
  }

  object GetDataSourceResponse {
    @inline
    def apply(
        dataSource: js.UndefOr[DataSource] = js.undefined
    ): GetDataSourceResponse = {
      val __obj = js.Dynamic.literal()
      dataSource.foreach(__v => __obj.updateDynamic("dataSource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDataSourceResponse]
    }
  }

  @js.native
  trait GetFunctionRequest extends js.Object {
    var apiId: String
    var functionId: ResourceName
  }

  object GetFunctionRequest {
    @inline
    def apply(
        apiId: String,
        functionId: ResourceName
    ): GetFunctionRequest = {
      val __obj = js.Dynamic.literal(
        "apiId" -> apiId.asInstanceOf[js.Any],
        "functionId" -> functionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetFunctionRequest]
    }
  }

  @js.native
  trait GetFunctionResponse extends js.Object {
    var functionConfiguration: js.UndefOr[FunctionConfiguration]
  }

  object GetFunctionResponse {
    @inline
    def apply(
        functionConfiguration: js.UndefOr[FunctionConfiguration] = js.undefined
    ): GetFunctionResponse = {
      val __obj = js.Dynamic.literal()
      functionConfiguration.foreach(__v => __obj.updateDynamic("functionConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFunctionResponse]
    }
  }

  @js.native
  trait GetGraphqlApiRequest extends js.Object {
    var apiId: String
  }

  object GetGraphqlApiRequest {
    @inline
    def apply(
        apiId: String
    ): GetGraphqlApiRequest = {
      val __obj = js.Dynamic.literal(
        "apiId" -> apiId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetGraphqlApiRequest]
    }
  }

  @js.native
  trait GetGraphqlApiResponse extends js.Object {
    var graphqlApi: js.UndefOr[GraphqlApi]
  }

  object GetGraphqlApiResponse {
    @inline
    def apply(
        graphqlApi: js.UndefOr[GraphqlApi] = js.undefined
    ): GetGraphqlApiResponse = {
      val __obj = js.Dynamic.literal()
      graphqlApi.foreach(__v => __obj.updateDynamic("graphqlApi")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGraphqlApiResponse]
    }
  }

  @js.native
  trait GetIntrospectionSchemaRequest extends js.Object {
    var apiId: String
    var format: OutputType
    var includeDirectives: js.UndefOr[BooleanValue]
  }

  object GetIntrospectionSchemaRequest {
    @inline
    def apply(
        apiId: String,
        format: OutputType,
        includeDirectives: js.UndefOr[BooleanValue] = js.undefined
    ): GetIntrospectionSchemaRequest = {
      val __obj = js.Dynamic.literal(
        "apiId" -> apiId.asInstanceOf[js.Any],
        "format" -> format.asInstanceOf[js.Any]
      )

      includeDirectives.foreach(__v => __obj.updateDynamic("includeDirectives")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetIntrospectionSchemaRequest]
    }
  }

  @js.native
  trait GetIntrospectionSchemaResponse extends js.Object {
    var schema: js.UndefOr[Blob]
  }

  object GetIntrospectionSchemaResponse {
    @inline
    def apply(
        schema: js.UndefOr[Blob] = js.undefined
    ): GetIntrospectionSchemaResponse = {
      val __obj = js.Dynamic.literal()
      schema.foreach(__v => __obj.updateDynamic("schema")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetIntrospectionSchemaResponse]
    }
  }

  @js.native
  trait GetResolverRequest extends js.Object {
    var apiId: String
    var fieldName: ResourceName
    var typeName: ResourceName
  }

  object GetResolverRequest {
    @inline
    def apply(
        apiId: String,
        fieldName: ResourceName,
        typeName: ResourceName
    ): GetResolverRequest = {
      val __obj = js.Dynamic.literal(
        "apiId" -> apiId.asInstanceOf[js.Any],
        "fieldName" -> fieldName.asInstanceOf[js.Any],
        "typeName" -> typeName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetResolverRequest]
    }
  }

  @js.native
  trait GetResolverResponse extends js.Object {
    var resolver: js.UndefOr[Resolver]
  }

  object GetResolverResponse {
    @inline
    def apply(
        resolver: js.UndefOr[Resolver] = js.undefined
    ): GetResolverResponse = {
      val __obj = js.Dynamic.literal()
      resolver.foreach(__v => __obj.updateDynamic("resolver")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResolverResponse]
    }
  }

  @js.native
  trait GetSchemaCreationStatusRequest extends js.Object {
    var apiId: String
  }

  object GetSchemaCreationStatusRequest {
    @inline
    def apply(
        apiId: String
    ): GetSchemaCreationStatusRequest = {
      val __obj = js.Dynamic.literal(
        "apiId" -> apiId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetSchemaCreationStatusRequest]
    }
  }

  @js.native
  trait GetSchemaCreationStatusResponse extends js.Object {
    var details: js.UndefOr[String]
    var status: js.UndefOr[SchemaStatus]
  }

  object GetSchemaCreationStatusResponse {
    @inline
    def apply(
        details: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[SchemaStatus] = js.undefined
    ): GetSchemaCreationStatusResponse = {
      val __obj = js.Dynamic.literal()
      details.foreach(__v => __obj.updateDynamic("details")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSchemaCreationStatusResponse]
    }
  }

  @js.native
  trait GetTypeRequest extends js.Object {
    var apiId: String
    var format: TypeDefinitionFormat
    var typeName: ResourceName
  }

  object GetTypeRequest {
    @inline
    def apply(
        apiId: String,
        format: TypeDefinitionFormat,
        typeName: ResourceName
    ): GetTypeRequest = {
      val __obj = js.Dynamic.literal(
        "apiId" -> apiId.asInstanceOf[js.Any],
        "format" -> format.asInstanceOf[js.Any],
        "typeName" -> typeName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetTypeRequest]
    }
  }

  @js.native
  trait GetTypeResponse extends js.Object {
    var `type`: js.UndefOr[Type]
  }

  object GetTypeResponse {
    @inline
    def apply(
        `type`: js.UndefOr[Type] = js.undefined
    ): GetTypeResponse = {
      val __obj = js.Dynamic.literal()
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTypeResponse]
    }
  }

  /**
    * Describes a GraphQL API.
    */
  @js.native
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

  object GraphqlApi {
    @inline
    def apply(
        additionalAuthenticationProviders: js.UndefOr[AdditionalAuthenticationProviders] = js.undefined,
        apiId: js.UndefOr[String] = js.undefined,
        arn: js.UndefOr[String] = js.undefined,
        authenticationType: js.UndefOr[AuthenticationType] = js.undefined,
        logConfig: js.UndefOr[LogConfig] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined,
        openIDConnectConfig: js.UndefOr[OpenIDConnectConfig] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        uris: js.UndefOr[MapOfStringToString] = js.undefined,
        userPoolConfig: js.UndefOr[UserPoolConfig] = js.undefined,
        xrayEnabled: js.UndefOr[Boolean] = js.undefined
    ): GraphqlApi = {
      val __obj = js.Dynamic.literal()
      additionalAuthenticationProviders.foreach(__v => __obj.updateDynamic("additionalAuthenticationProviders")(__v.asInstanceOf[js.Any]))
      apiId.foreach(__v => __obj.updateDynamic("apiId")(__v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      authenticationType.foreach(__v => __obj.updateDynamic("authenticationType")(__v.asInstanceOf[js.Any]))
      logConfig.foreach(__v => __obj.updateDynamic("logConfig")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      openIDConnectConfig.foreach(__v => __obj.updateDynamic("openIDConnectConfig")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      uris.foreach(__v => __obj.updateDynamic("uris")(__v.asInstanceOf[js.Any]))
      userPoolConfig.foreach(__v => __obj.updateDynamic("userPoolConfig")(__v.asInstanceOf[js.Any]))
      xrayEnabled.foreach(__v => __obj.updateDynamic("xrayEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GraphqlApi]
    }
  }

  /**
    * Describes an HTTP data source configuration.
    */
  @js.native
  trait HttpDataSourceConfig extends js.Object {
    var authorizationConfig: js.UndefOr[AuthorizationConfig]
    var endpoint: js.UndefOr[String]
  }

  object HttpDataSourceConfig {
    @inline
    def apply(
        authorizationConfig: js.UndefOr[AuthorizationConfig] = js.undefined,
        endpoint: js.UndefOr[String] = js.undefined
    ): HttpDataSourceConfig = {
      val __obj = js.Dynamic.literal()
      authorizationConfig.foreach(__v => __obj.updateDynamic("authorizationConfig")(__v.asInstanceOf[js.Any]))
      endpoint.foreach(__v => __obj.updateDynamic("endpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HttpDataSourceConfig]
    }
  }

  /**
    * The <code>LambdaConflictHandlerConfig</code> object when configuring LAMBDA as the Conflict Handler.
    */
  @js.native
  trait LambdaConflictHandlerConfig extends js.Object {
    var lambdaConflictHandlerArn: js.UndefOr[String]
  }

  object LambdaConflictHandlerConfig {
    @inline
    def apply(
        lambdaConflictHandlerArn: js.UndefOr[String] = js.undefined
    ): LambdaConflictHandlerConfig = {
      val __obj = js.Dynamic.literal()
      lambdaConflictHandlerArn.foreach(__v => __obj.updateDynamic("lambdaConflictHandlerArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LambdaConflictHandlerConfig]
    }
  }

  /**
    * Describes an AWS Lambda data source configuration.
    */
  @js.native
  trait LambdaDataSourceConfig extends js.Object {
    var lambdaFunctionArn: String
  }

  object LambdaDataSourceConfig {
    @inline
    def apply(
        lambdaFunctionArn: String
    ): LambdaDataSourceConfig = {
      val __obj = js.Dynamic.literal(
        "lambdaFunctionArn" -> lambdaFunctionArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[LambdaDataSourceConfig]
    }
  }

  @js.native
  trait ListApiKeysRequest extends js.Object {
    var apiId: String
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListApiKeysRequest {
    @inline
    def apply(
        apiId: String,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListApiKeysRequest = {
      val __obj = js.Dynamic.literal(
        "apiId" -> apiId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApiKeysRequest]
    }
  }

  @js.native
  trait ListApiKeysResponse extends js.Object {
    var apiKeys: js.UndefOr[ApiKeys]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListApiKeysResponse {
    @inline
    def apply(
        apiKeys: js.UndefOr[ApiKeys] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListApiKeysResponse = {
      val __obj = js.Dynamic.literal()
      apiKeys.foreach(__v => __obj.updateDynamic("apiKeys")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApiKeysResponse]
    }
  }

  @js.native
  trait ListDataSourcesRequest extends js.Object {
    var apiId: String
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListDataSourcesRequest {
    @inline
    def apply(
        apiId: String,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListDataSourcesRequest = {
      val __obj = js.Dynamic.literal(
        "apiId" -> apiId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataSourcesRequest]
    }
  }

  @js.native
  trait ListDataSourcesResponse extends js.Object {
    var dataSources: js.UndefOr[DataSources]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListDataSourcesResponse {
    @inline
    def apply(
        dataSources: js.UndefOr[DataSources] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListDataSourcesResponse = {
      val __obj = js.Dynamic.literal()
      dataSources.foreach(__v => __obj.updateDynamic("dataSources")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataSourcesResponse]
    }
  }

  @js.native
  trait ListFunctionsRequest extends js.Object {
    var apiId: String
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListFunctionsRequest {
    @inline
    def apply(
        apiId: String,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListFunctionsRequest = {
      val __obj = js.Dynamic.literal(
        "apiId" -> apiId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFunctionsRequest]
    }
  }

  @js.native
  trait ListFunctionsResponse extends js.Object {
    var functions: js.UndefOr[Functions]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListFunctionsResponse {
    @inline
    def apply(
        functions: js.UndefOr[Functions] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListFunctionsResponse = {
      val __obj = js.Dynamic.literal()
      functions.foreach(__v => __obj.updateDynamic("functions")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFunctionsResponse]
    }
  }

  @js.native
  trait ListGraphqlApisRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListGraphqlApisRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListGraphqlApisRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGraphqlApisRequest]
    }
  }

  @js.native
  trait ListGraphqlApisResponse extends js.Object {
    var graphqlApis: js.UndefOr[GraphqlApis]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListGraphqlApisResponse {
    @inline
    def apply(
        graphqlApis: js.UndefOr[GraphqlApis] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListGraphqlApisResponse = {
      val __obj = js.Dynamic.literal()
      graphqlApis.foreach(__v => __obj.updateDynamic("graphqlApis")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGraphqlApisResponse]
    }
  }

  @js.native
  trait ListResolversByFunctionRequest extends js.Object {
    var apiId: String
    var functionId: String
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListResolversByFunctionRequest {
    @inline
    def apply(
        apiId: String,
        functionId: String,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListResolversByFunctionRequest = {
      val __obj = js.Dynamic.literal(
        "apiId" -> apiId.asInstanceOf[js.Any],
        "functionId" -> functionId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResolversByFunctionRequest]
    }
  }

  @js.native
  trait ListResolversByFunctionResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var resolvers: js.UndefOr[Resolvers]
  }

  object ListResolversByFunctionResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        resolvers: js.UndefOr[Resolvers] = js.undefined
    ): ListResolversByFunctionResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      resolvers.foreach(__v => __obj.updateDynamic("resolvers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResolversByFunctionResponse]
    }
  }

  @js.native
  trait ListResolversRequest extends js.Object {
    var apiId: String
    var typeName: String
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListResolversRequest {
    @inline
    def apply(
        apiId: String,
        typeName: String,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListResolversRequest = {
      val __obj = js.Dynamic.literal(
        "apiId" -> apiId.asInstanceOf[js.Any],
        "typeName" -> typeName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResolversRequest]
    }
  }

  @js.native
  trait ListResolversResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var resolvers: js.UndefOr[Resolvers]
  }

  object ListResolversResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        resolvers: js.UndefOr[Resolvers] = js.undefined
    ): ListResolversResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      resolvers.foreach(__v => __obj.updateDynamic("resolvers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResolversResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: ResourceArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListTypesRequest extends js.Object {
    var apiId: String
    var format: TypeDefinitionFormat
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListTypesRequest {
    @inline
    def apply(
        apiId: String,
        format: TypeDefinitionFormat,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListTypesRequest = {
      val __obj = js.Dynamic.literal(
        "apiId" -> apiId.asInstanceOf[js.Any],
        "format" -> format.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTypesRequest]
    }
  }

  @js.native
  trait ListTypesResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var types: js.UndefOr[TypeList]
  }

  object ListTypesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        types: js.UndefOr[TypeList] = js.undefined
    ): ListTypesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      types.foreach(__v => __obj.updateDynamic("types")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTypesResponse]
    }
  }

  /**
    * The CloudWatch Logs configuration.
    */
  @js.native
  trait LogConfig extends js.Object {
    var cloudWatchLogsRoleArn: String
    var fieldLogLevel: FieldLogLevel
    var excludeVerboseContent: js.UndefOr[Boolean]
  }

  object LogConfig {
    @inline
    def apply(
        cloudWatchLogsRoleArn: String,
        fieldLogLevel: FieldLogLevel,
        excludeVerboseContent: js.UndefOr[Boolean] = js.undefined
    ): LogConfig = {
      val __obj = js.Dynamic.literal(
        "cloudWatchLogsRoleArn" -> cloudWatchLogsRoleArn.asInstanceOf[js.Any],
        "fieldLogLevel" -> fieldLogLevel.asInstanceOf[js.Any]
      )

      excludeVerboseContent.foreach(__v => __obj.updateDynamic("excludeVerboseContent")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LogConfig]
    }
  }

  /**
    * Describes an OpenID Connect configuration.
    */
  @js.native
  trait OpenIDConnectConfig extends js.Object {
    var issuer: String
    var authTTL: js.UndefOr[Double]
    var clientId: js.UndefOr[String]
    var iatTTL: js.UndefOr[Double]
  }

  object OpenIDConnectConfig {
    @inline
    def apply(
        issuer: String,
        authTTL: js.UndefOr[Double] = js.undefined,
        clientId: js.UndefOr[String] = js.undefined,
        iatTTL: js.UndefOr[Double] = js.undefined
    ): OpenIDConnectConfig = {
      val __obj = js.Dynamic.literal(
        "issuer" -> issuer.asInstanceOf[js.Any]
      )

      authTTL.foreach(__v => __obj.updateDynamic("authTTL")(__v.asInstanceOf[js.Any]))
      clientId.foreach(__v => __obj.updateDynamic("clientId")(__v.asInstanceOf[js.Any]))
      iatTTL.foreach(__v => __obj.updateDynamic("iatTTL")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OpenIDConnectConfig]
    }
  }

  @js.native
  sealed trait OutputType extends js.Any
  object OutputType {
    val SDL = "SDL".asInstanceOf[OutputType]
    val JSON = "JSON".asInstanceOf[OutputType]

    @inline def values = js.Array(SDL, JSON)
  }

  /**
    * The pipeline configuration for a resolver of kind <code>PIPELINE</code>.
    */
  @js.native
  trait PipelineConfig extends js.Object {
    var functions: js.UndefOr[FunctionsIds]
  }

  object PipelineConfig {
    @inline
    def apply(
        functions: js.UndefOr[FunctionsIds] = js.undefined
    ): PipelineConfig = {
      val __obj = js.Dynamic.literal()
      functions.foreach(__v => __obj.updateDynamic("functions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PipelineConfig]
    }
  }

  /**
    * The Amazon RDS HTTP endpoint configuration.
    */
  @js.native
  trait RdsHttpEndpointConfig extends js.Object {
    var awsRegion: js.UndefOr[String]
    var awsSecretStoreArn: js.UndefOr[String]
    var databaseName: js.UndefOr[String]
    var dbClusterIdentifier: js.UndefOr[String]
    var schema: js.UndefOr[String]
  }

  object RdsHttpEndpointConfig {
    @inline
    def apply(
        awsRegion: js.UndefOr[String] = js.undefined,
        awsSecretStoreArn: js.UndefOr[String] = js.undefined,
        databaseName: js.UndefOr[String] = js.undefined,
        dbClusterIdentifier: js.UndefOr[String] = js.undefined,
        schema: js.UndefOr[String] = js.undefined
    ): RdsHttpEndpointConfig = {
      val __obj = js.Dynamic.literal()
      awsRegion.foreach(__v => __obj.updateDynamic("awsRegion")(__v.asInstanceOf[js.Any]))
      awsSecretStoreArn.foreach(__v => __obj.updateDynamic("awsSecretStoreArn")(__v.asInstanceOf[js.Any]))
      databaseName.foreach(__v => __obj.updateDynamic("databaseName")(__v.asInstanceOf[js.Any]))
      dbClusterIdentifier.foreach(__v => __obj.updateDynamic("dbClusterIdentifier")(__v.asInstanceOf[js.Any]))
      schema.foreach(__v => __obj.updateDynamic("schema")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RdsHttpEndpointConfig]
    }
  }

  /**
    * Describes a relational database data source configuration.
    */
  @js.native
  trait RelationalDatabaseDataSourceConfig extends js.Object {
    var rdsHttpEndpointConfig: js.UndefOr[RdsHttpEndpointConfig]
    var relationalDatabaseSourceType: js.UndefOr[RelationalDatabaseSourceType]
  }

  object RelationalDatabaseDataSourceConfig {
    @inline
    def apply(
        rdsHttpEndpointConfig: js.UndefOr[RdsHttpEndpointConfig] = js.undefined,
        relationalDatabaseSourceType: js.UndefOr[RelationalDatabaseSourceType] = js.undefined
    ): RelationalDatabaseDataSourceConfig = {
      val __obj = js.Dynamic.literal()
      rdsHttpEndpointConfig.foreach(__v => __obj.updateDynamic("rdsHttpEndpointConfig")(__v.asInstanceOf[js.Any]))
      relationalDatabaseSourceType.foreach(__v => __obj.updateDynamic("relationalDatabaseSourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RelationalDatabaseDataSourceConfig]
    }
  }

  @js.native
  sealed trait RelationalDatabaseSourceType extends js.Any
  object RelationalDatabaseSourceType {
    val RDS_HTTP_ENDPOINT = "RDS_HTTP_ENDPOINT".asInstanceOf[RelationalDatabaseSourceType]

    @inline def values = js.Array(RDS_HTTP_ENDPOINT)
  }

  /**
    * Describes a resolver.
    */
  @js.native
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

  object Resolver {
    @inline
    def apply(
        cachingConfig: js.UndefOr[CachingConfig] = js.undefined,
        dataSourceName: js.UndefOr[ResourceName] = js.undefined,
        fieldName: js.UndefOr[ResourceName] = js.undefined,
        kind: js.UndefOr[ResolverKind] = js.undefined,
        pipelineConfig: js.UndefOr[PipelineConfig] = js.undefined,
        requestMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined,
        resolverArn: js.UndefOr[String] = js.undefined,
        responseMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined,
        syncConfig: js.UndefOr[SyncConfig] = js.undefined,
        typeName: js.UndefOr[ResourceName] = js.undefined
    ): Resolver = {
      val __obj = js.Dynamic.literal()
      cachingConfig.foreach(__v => __obj.updateDynamic("cachingConfig")(__v.asInstanceOf[js.Any]))
      dataSourceName.foreach(__v => __obj.updateDynamic("dataSourceName")(__v.asInstanceOf[js.Any]))
      fieldName.foreach(__v => __obj.updateDynamic("fieldName")(__v.asInstanceOf[js.Any]))
      kind.foreach(__v => __obj.updateDynamic("kind")(__v.asInstanceOf[js.Any]))
      pipelineConfig.foreach(__v => __obj.updateDynamic("pipelineConfig")(__v.asInstanceOf[js.Any]))
      requestMappingTemplate.foreach(__v => __obj.updateDynamic("requestMappingTemplate")(__v.asInstanceOf[js.Any]))
      resolverArn.foreach(__v => __obj.updateDynamic("resolverArn")(__v.asInstanceOf[js.Any]))
      responseMappingTemplate.foreach(__v => __obj.updateDynamic("responseMappingTemplate")(__v.asInstanceOf[js.Any]))
      syncConfig.foreach(__v => __obj.updateDynamic("syncConfig")(__v.asInstanceOf[js.Any]))
      typeName.foreach(__v => __obj.updateDynamic("typeName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Resolver]
    }
  }

  @js.native
  sealed trait ResolverKind extends js.Any
  object ResolverKind {
    val UNIT = "UNIT".asInstanceOf[ResolverKind]
    val PIPELINE = "PIPELINE".asInstanceOf[ResolverKind]

    @inline def values = js.Array(UNIT, PIPELINE)
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

    @inline def values = js.Array(PROCESSING, ACTIVE, DELETING, FAILED, SUCCESS, NOT_APPLICABLE)
  }

  @js.native
  trait StartSchemaCreationRequest extends js.Object {
    var apiId: String
    var definition: Blob
  }

  object StartSchemaCreationRequest {
    @inline
    def apply(
        apiId: String,
        definition: Blob
    ): StartSchemaCreationRequest = {
      val __obj = js.Dynamic.literal(
        "apiId" -> apiId.asInstanceOf[js.Any],
        "definition" -> definition.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartSchemaCreationRequest]
    }
  }

  @js.native
  trait StartSchemaCreationResponse extends js.Object {
    var status: js.UndefOr[SchemaStatus]
  }

  object StartSchemaCreationResponse {
    @inline
    def apply(
        status: js.UndefOr[SchemaStatus] = js.undefined
    ): StartSchemaCreationResponse = {
      val __obj = js.Dynamic.literal()
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSchemaCreationResponse]
    }
  }

  /**
    * Describes a Sync configuration for a resolver.
    *  Contains information on which Conflict Detection as well as Resolution strategy should be performed when the resolver is invoked.
    */
  @js.native
  trait SyncConfig extends js.Object {
    var conflictDetection: js.UndefOr[ConflictDetectionType]
    var conflictHandler: js.UndefOr[ConflictHandlerType]
    var lambdaConflictHandlerConfig: js.UndefOr[LambdaConflictHandlerConfig]
  }

  object SyncConfig {
    @inline
    def apply(
        conflictDetection: js.UndefOr[ConflictDetectionType] = js.undefined,
        conflictHandler: js.UndefOr[ConflictHandlerType] = js.undefined,
        lambdaConflictHandlerConfig: js.UndefOr[LambdaConflictHandlerConfig] = js.undefined
    ): SyncConfig = {
      val __obj = js.Dynamic.literal()
      conflictDetection.foreach(__v => __obj.updateDynamic("conflictDetection")(__v.asInstanceOf[js.Any]))
      conflictHandler.foreach(__v => __obj.updateDynamic("conflictHandler")(__v.asInstanceOf[js.Any]))
      lambdaConflictHandlerConfig.foreach(__v => __obj.updateDynamic("lambdaConflictHandlerConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SyncConfig]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tags: TagMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceArn,
        tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    @inline
    def apply(
    ): TagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /**
    * Describes a type.
    */
  @js.native
  trait Type extends js.Object {
    var arn: js.UndefOr[String]
    var definition: js.UndefOr[String]
    var description: js.UndefOr[String]
    var format: js.UndefOr[TypeDefinitionFormat]
    var name: js.UndefOr[ResourceName]
  }

  object Type {
    @inline
    def apply(
        arn: js.UndefOr[String] = js.undefined,
        definition: js.UndefOr[String] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        format: js.UndefOr[TypeDefinitionFormat] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined
    ): Type = {
      val __obj = js.Dynamic.literal()
      arn.foreach(__v => __obj.updateDynamic("arn")(__v.asInstanceOf[js.Any]))
      definition.foreach(__v => __obj.updateDynamic("definition")(__v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      format.foreach(__v => __obj.updateDynamic("format")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Type]
    }
  }

  @js.native
  sealed trait TypeDefinitionFormat extends js.Any
  object TypeDefinitionFormat {
    val SDL = "SDL".asInstanceOf[TypeDefinitionFormat]
    val JSON = "JSON".asInstanceOf[TypeDefinitionFormat]

    @inline def values = js.Array(SDL, JSON)
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: ResourceArn,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    @inline
    def apply(
    ): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  /**
    * Represents the input of a <code>UpdateApiCache</code> operation.
    */
  @js.native
  trait UpdateApiCacheRequest extends js.Object {
    var apiCachingBehavior: ApiCachingBehavior
    var apiId: String
    var ttl: Double
    var `type`: ApiCacheType
  }

  object UpdateApiCacheRequest {
    @inline
    def apply(
        apiCachingBehavior: ApiCachingBehavior,
        apiId: String,
        ttl: Double,
        `type`: ApiCacheType
    ): UpdateApiCacheRequest = {
      val __obj = js.Dynamic.literal(
        "apiCachingBehavior" -> apiCachingBehavior.asInstanceOf[js.Any],
        "apiId" -> apiId.asInstanceOf[js.Any],
        "ttl" -> ttl.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateApiCacheRequest]
    }
  }

  /**
    * Represents the output of a <code>UpdateApiCache</code> operation.
    */
  @js.native
  trait UpdateApiCacheResponse extends js.Object {
    var apiCache: js.UndefOr[ApiCache]
  }

  object UpdateApiCacheResponse {
    @inline
    def apply(
        apiCache: js.UndefOr[ApiCache] = js.undefined
    ): UpdateApiCacheResponse = {
      val __obj = js.Dynamic.literal()
      apiCache.foreach(__v => __obj.updateDynamic("apiCache")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApiCacheResponse]
    }
  }

  @js.native
  trait UpdateApiKeyRequest extends js.Object {
    var apiId: String
    var id: String
    var description: js.UndefOr[String]
    var expires: js.UndefOr[Double]
  }

  object UpdateApiKeyRequest {
    @inline
    def apply(
        apiId: String,
        id: String,
        description: js.UndefOr[String] = js.undefined,
        expires: js.UndefOr[Double] = js.undefined
    ): UpdateApiKeyRequest = {
      val __obj = js.Dynamic.literal(
        "apiId" -> apiId.asInstanceOf[js.Any],
        "id" -> id.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      expires.foreach(__v => __obj.updateDynamic("expires")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApiKeyRequest]
    }
  }

  @js.native
  trait UpdateApiKeyResponse extends js.Object {
    var apiKey: js.UndefOr[ApiKey]
  }

  object UpdateApiKeyResponse {
    @inline
    def apply(
        apiKey: js.UndefOr[ApiKey] = js.undefined
    ): UpdateApiKeyResponse = {
      val __obj = js.Dynamic.literal()
      apiKey.foreach(__v => __obj.updateDynamic("apiKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApiKeyResponse]
    }
  }

  @js.native
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

  object UpdateDataSourceRequest {
    @inline
    def apply(
        apiId: String,
        name: ResourceName,
        `type`: DataSourceType,
        description: js.UndefOr[String] = js.undefined,
        dynamodbConfig: js.UndefOr[DynamodbDataSourceConfig] = js.undefined,
        elasticsearchConfig: js.UndefOr[ElasticsearchDataSourceConfig] = js.undefined,
        httpConfig: js.UndefOr[HttpDataSourceConfig] = js.undefined,
        lambdaConfig: js.UndefOr[LambdaDataSourceConfig] = js.undefined,
        relationalDatabaseConfig: js.UndefOr[RelationalDatabaseDataSourceConfig] = js.undefined,
        serviceRoleArn: js.UndefOr[String] = js.undefined
    ): UpdateDataSourceRequest = {
      val __obj = js.Dynamic.literal(
        "apiId" -> apiId.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "type" -> `type`.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      dynamodbConfig.foreach(__v => __obj.updateDynamic("dynamodbConfig")(__v.asInstanceOf[js.Any]))
      elasticsearchConfig.foreach(__v => __obj.updateDynamic("elasticsearchConfig")(__v.asInstanceOf[js.Any]))
      httpConfig.foreach(__v => __obj.updateDynamic("httpConfig")(__v.asInstanceOf[js.Any]))
      lambdaConfig.foreach(__v => __obj.updateDynamic("lambdaConfig")(__v.asInstanceOf[js.Any]))
      relationalDatabaseConfig.foreach(__v => __obj.updateDynamic("relationalDatabaseConfig")(__v.asInstanceOf[js.Any]))
      serviceRoleArn.foreach(__v => __obj.updateDynamic("serviceRoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDataSourceRequest]
    }
  }

  @js.native
  trait UpdateDataSourceResponse extends js.Object {
    var dataSource: js.UndefOr[DataSource]
  }

  object UpdateDataSourceResponse {
    @inline
    def apply(
        dataSource: js.UndefOr[DataSource] = js.undefined
    ): UpdateDataSourceResponse = {
      val __obj = js.Dynamic.literal()
      dataSource.foreach(__v => __obj.updateDynamic("dataSource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDataSourceResponse]
    }
  }

  @js.native
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

  object UpdateFunctionRequest {
    @inline
    def apply(
        apiId: String,
        dataSourceName: ResourceName,
        functionId: ResourceName,
        functionVersion: String,
        name: ResourceName,
        requestMappingTemplate: MappingTemplate,
        description: js.UndefOr[String] = js.undefined,
        responseMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined
    ): UpdateFunctionRequest = {
      val __obj = js.Dynamic.literal(
        "apiId" -> apiId.asInstanceOf[js.Any],
        "dataSourceName" -> dataSourceName.asInstanceOf[js.Any],
        "functionId" -> functionId.asInstanceOf[js.Any],
        "functionVersion" -> functionVersion.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "requestMappingTemplate" -> requestMappingTemplate.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.updateDynamic("description")(__v.asInstanceOf[js.Any]))
      responseMappingTemplate.foreach(__v => __obj.updateDynamic("responseMappingTemplate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFunctionRequest]
    }
  }

  @js.native
  trait UpdateFunctionResponse extends js.Object {
    var functionConfiguration: js.UndefOr[FunctionConfiguration]
  }

  object UpdateFunctionResponse {
    @inline
    def apply(
        functionConfiguration: js.UndefOr[FunctionConfiguration] = js.undefined
    ): UpdateFunctionResponse = {
      val __obj = js.Dynamic.literal()
      functionConfiguration.foreach(__v => __obj.updateDynamic("functionConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFunctionResponse]
    }
  }

  @js.native
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

  object UpdateGraphqlApiRequest {
    @inline
    def apply(
        apiId: String,
        name: String,
        additionalAuthenticationProviders: js.UndefOr[AdditionalAuthenticationProviders] = js.undefined,
        authenticationType: js.UndefOr[AuthenticationType] = js.undefined,
        logConfig: js.UndefOr[LogConfig] = js.undefined,
        openIDConnectConfig: js.UndefOr[OpenIDConnectConfig] = js.undefined,
        userPoolConfig: js.UndefOr[UserPoolConfig] = js.undefined,
        xrayEnabled: js.UndefOr[Boolean] = js.undefined
    ): UpdateGraphqlApiRequest = {
      val __obj = js.Dynamic.literal(
        "apiId" -> apiId.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      additionalAuthenticationProviders.foreach(__v => __obj.updateDynamic("additionalAuthenticationProviders")(__v.asInstanceOf[js.Any]))
      authenticationType.foreach(__v => __obj.updateDynamic("authenticationType")(__v.asInstanceOf[js.Any]))
      logConfig.foreach(__v => __obj.updateDynamic("logConfig")(__v.asInstanceOf[js.Any]))
      openIDConnectConfig.foreach(__v => __obj.updateDynamic("openIDConnectConfig")(__v.asInstanceOf[js.Any]))
      userPoolConfig.foreach(__v => __obj.updateDynamic("userPoolConfig")(__v.asInstanceOf[js.Any]))
      xrayEnabled.foreach(__v => __obj.updateDynamic("xrayEnabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGraphqlApiRequest]
    }
  }

  @js.native
  trait UpdateGraphqlApiResponse extends js.Object {
    var graphqlApi: js.UndefOr[GraphqlApi]
  }

  object UpdateGraphqlApiResponse {
    @inline
    def apply(
        graphqlApi: js.UndefOr[GraphqlApi] = js.undefined
    ): UpdateGraphqlApiResponse = {
      val __obj = js.Dynamic.literal()
      graphqlApi.foreach(__v => __obj.updateDynamic("graphqlApi")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGraphqlApiResponse]
    }
  }

  @js.native
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

  object UpdateResolverRequest {
    @inline
    def apply(
        apiId: String,
        fieldName: ResourceName,
        requestMappingTemplate: MappingTemplate,
        typeName: ResourceName,
        cachingConfig: js.UndefOr[CachingConfig] = js.undefined,
        dataSourceName: js.UndefOr[ResourceName] = js.undefined,
        kind: js.UndefOr[ResolverKind] = js.undefined,
        pipelineConfig: js.UndefOr[PipelineConfig] = js.undefined,
        responseMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined,
        syncConfig: js.UndefOr[SyncConfig] = js.undefined
    ): UpdateResolverRequest = {
      val __obj = js.Dynamic.literal(
        "apiId" -> apiId.asInstanceOf[js.Any],
        "fieldName" -> fieldName.asInstanceOf[js.Any],
        "requestMappingTemplate" -> requestMappingTemplate.asInstanceOf[js.Any],
        "typeName" -> typeName.asInstanceOf[js.Any]
      )

      cachingConfig.foreach(__v => __obj.updateDynamic("cachingConfig")(__v.asInstanceOf[js.Any]))
      dataSourceName.foreach(__v => __obj.updateDynamic("dataSourceName")(__v.asInstanceOf[js.Any]))
      kind.foreach(__v => __obj.updateDynamic("kind")(__v.asInstanceOf[js.Any]))
      pipelineConfig.foreach(__v => __obj.updateDynamic("pipelineConfig")(__v.asInstanceOf[js.Any]))
      responseMappingTemplate.foreach(__v => __obj.updateDynamic("responseMappingTemplate")(__v.asInstanceOf[js.Any]))
      syncConfig.foreach(__v => __obj.updateDynamic("syncConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateResolverRequest]
    }
  }

  @js.native
  trait UpdateResolverResponse extends js.Object {
    var resolver: js.UndefOr[Resolver]
  }

  object UpdateResolverResponse {
    @inline
    def apply(
        resolver: js.UndefOr[Resolver] = js.undefined
    ): UpdateResolverResponse = {
      val __obj = js.Dynamic.literal()
      resolver.foreach(__v => __obj.updateDynamic("resolver")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateResolverResponse]
    }
  }

  @js.native
  trait UpdateTypeRequest extends js.Object {
    var apiId: String
    var format: TypeDefinitionFormat
    var typeName: ResourceName
    var definition: js.UndefOr[String]
  }

  object UpdateTypeRequest {
    @inline
    def apply(
        apiId: String,
        format: TypeDefinitionFormat,
        typeName: ResourceName,
        definition: js.UndefOr[String] = js.undefined
    ): UpdateTypeRequest = {
      val __obj = js.Dynamic.literal(
        "apiId" -> apiId.asInstanceOf[js.Any],
        "format" -> format.asInstanceOf[js.Any],
        "typeName" -> typeName.asInstanceOf[js.Any]
      )

      definition.foreach(__v => __obj.updateDynamic("definition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTypeRequest]
    }
  }

  @js.native
  trait UpdateTypeResponse extends js.Object {
    var `type`: js.UndefOr[Type]
  }

  object UpdateTypeResponse {
    @inline
    def apply(
        `type`: js.UndefOr[Type] = js.undefined
    ): UpdateTypeResponse = {
      val __obj = js.Dynamic.literal()
      `type`.foreach(__v => __obj.updateDynamic("type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTypeResponse]
    }
  }

  /**
    * Describes an Amazon Cognito user pool configuration.
    */
  @js.native
  trait UserPoolConfig extends js.Object {
    var awsRegion: String
    var defaultAction: DefaultAction
    var userPoolId: String
    var appIdClientRegex: js.UndefOr[String]
  }

  object UserPoolConfig {
    @inline
    def apply(
        awsRegion: String,
        defaultAction: DefaultAction,
        userPoolId: String,
        appIdClientRegex: js.UndefOr[String] = js.undefined
    ): UserPoolConfig = {
      val __obj = js.Dynamic.literal(
        "awsRegion" -> awsRegion.asInstanceOf[js.Any],
        "defaultAction" -> defaultAction.asInstanceOf[js.Any],
        "userPoolId" -> userPoolId.asInstanceOf[js.Any]
      )

      appIdClientRegex.foreach(__v => __obj.updateDynamic("appIdClientRegex")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserPoolConfig]
    }
  }
}
