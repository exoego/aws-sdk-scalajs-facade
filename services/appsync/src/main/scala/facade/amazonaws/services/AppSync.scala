package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object appsync {
  type AdditionalAuthenticationProviders = js.Array[AdditionalAuthenticationProvider]
  type ApiKeys                           = js.Array[ApiKey]
  type AuthenticationType                = String
  type AuthorizationType                 = String
  type Blob                              = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type BooleanValue                      = Boolean
  type DataSourceType                    = String
  type DataSources                       = js.Array[DataSource]
  type DefaultAction                     = String
  type FieldLogLevel                     = String
  type Functions                         = js.Array[FunctionConfiguration]
  type FunctionsIds                      = js.Array[String]
  type GraphqlApis                       = js.Array[GraphqlApi]
  type MapOfStringToString               = js.Dictionary[String]
  type MappingTemplate                   = String
  type MaxResults                        = Int
  type OutputType                        = String
  type PaginationToken                   = String
  type RelationalDatabaseSourceType      = String
  type ResolverKind                      = String
  type Resolvers                         = js.Array[Resolver]
  type ResourceArn                       = String
  type ResourceName                      = String
  type SchemaStatus                      = String
  type TagKey                            = String
  type TagKeyList                        = js.Array[TagKey]
  type TagMap                            = js.Dictionary[TagValue]
  type TagValue                          = String
  type TypeDefinitionFormat              = String
  type TypeList                          = js.Array[Type]

  implicit final class AppSyncOps(val service: AppSync) extends AnyVal {

    def createApiKeyFuture(params: CreateApiKeyRequest): Future[CreateApiKeyResponse] =
      service.createApiKey(params).promise.toFuture
    def createDataSourceFuture(params: CreateDataSourceRequest): Future[CreateDataSourceResponse] =
      service.createDataSource(params).promise.toFuture
    def createFunctionFuture(params: CreateFunctionRequest): Future[CreateFunctionResponse] =
      service.createFunction(params).promise.toFuture
    def createGraphqlApiFuture(params: CreateGraphqlApiRequest): Future[CreateGraphqlApiResponse] =
      service.createGraphqlApi(params).promise.toFuture
    def createResolverFuture(params: CreateResolverRequest): Future[CreateResolverResponse] =
      service.createResolver(params).promise.toFuture
    def createTypeFuture(params: CreateTypeRequest): Future[CreateTypeResponse] =
      service.createType(params).promise.toFuture
    def deleteApiKeyFuture(params: DeleteApiKeyRequest): Future[DeleteApiKeyResponse] =
      service.deleteApiKey(params).promise.toFuture
    def deleteDataSourceFuture(params: DeleteDataSourceRequest): Future[DeleteDataSourceResponse] =
      service.deleteDataSource(params).promise.toFuture
    def deleteFunctionFuture(params: DeleteFunctionRequest): Future[DeleteFunctionResponse] =
      service.deleteFunction(params).promise.toFuture
    def deleteGraphqlApiFuture(params: DeleteGraphqlApiRequest): Future[DeleteGraphqlApiResponse] =
      service.deleteGraphqlApi(params).promise.toFuture
    def deleteResolverFuture(params: DeleteResolverRequest): Future[DeleteResolverResponse] =
      service.deleteResolver(params).promise.toFuture
    def deleteTypeFuture(params: DeleteTypeRequest): Future[DeleteTypeResponse] =
      service.deleteType(params).promise.toFuture
    def getDataSourceFuture(params: GetDataSourceRequest): Future[GetDataSourceResponse] =
      service.getDataSource(params).promise.toFuture
    def getFunctionFuture(params: GetFunctionRequest): Future[GetFunctionResponse] =
      service.getFunction(params).promise.toFuture
    def getGraphqlApiFuture(params: GetGraphqlApiRequest): Future[GetGraphqlApiResponse] =
      service.getGraphqlApi(params).promise.toFuture
    def getIntrospectionSchemaFuture(params: GetIntrospectionSchemaRequest): Future[GetIntrospectionSchemaResponse] =
      service.getIntrospectionSchema(params).promise.toFuture
    def getResolverFuture(params: GetResolverRequest): Future[GetResolverResponse] =
      service.getResolver(params).promise.toFuture
    def getSchemaCreationStatusFuture(params: GetSchemaCreationStatusRequest): Future[GetSchemaCreationStatusResponse] =
      service.getSchemaCreationStatus(params).promise.toFuture
    def getTypeFuture(params: GetTypeRequest): Future[GetTypeResponse] = service.getType(params).promise.toFuture
    def listApiKeysFuture(params: ListApiKeysRequest): Future[ListApiKeysResponse] =
      service.listApiKeys(params).promise.toFuture
    def listDataSourcesFuture(params: ListDataSourcesRequest): Future[ListDataSourcesResponse] =
      service.listDataSources(params).promise.toFuture
    def listFunctionsFuture(params: ListFunctionsRequest): Future[ListFunctionsResponse] =
      service.listFunctions(params).promise.toFuture
    def listGraphqlApisFuture(params: ListGraphqlApisRequest): Future[ListGraphqlApisResponse] =
      service.listGraphqlApis(params).promise.toFuture
    def listResolversByFunctionFuture(params: ListResolversByFunctionRequest): Future[ListResolversByFunctionResponse] =
      service.listResolversByFunction(params).promise.toFuture
    def listResolversFuture(params: ListResolversRequest): Future[ListResolversResponse] =
      service.listResolvers(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise.toFuture
    def listTypesFuture(params: ListTypesRequest): Future[ListTypesResponse] =
      service.listTypes(params).promise.toFuture
    def startSchemaCreationFuture(params: StartSchemaCreationRequest): Future[StartSchemaCreationResponse] =
      service.startSchemaCreation(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise.toFuture
    def updateApiKeyFuture(params: UpdateApiKeyRequest): Future[UpdateApiKeyResponse] =
      service.updateApiKey(params).promise.toFuture
    def updateDataSourceFuture(params: UpdateDataSourceRequest): Future[UpdateDataSourceResponse] =
      service.updateDataSource(params).promise.toFuture
    def updateFunctionFuture(params: UpdateFunctionRequest): Future[UpdateFunctionResponse] =
      service.updateFunction(params).promise.toFuture
    def updateGraphqlApiFuture(params: UpdateGraphqlApiRequest): Future[UpdateGraphqlApiResponse] =
      service.updateGraphqlApi(params).promise.toFuture
    def updateResolverFuture(params: UpdateResolverRequest): Future[UpdateResolverResponse] =
      service.updateResolver(params).promise.toFuture
    def updateTypeFuture(params: UpdateTypeRequest): Future[UpdateTypeResponse] =
      service.updateType(params).promise.toFuture
  }
}

package appsync {
  @js.native
  @JSImport("aws-sdk", "AppSync")
  class AppSync() extends js.Object {
    def this(config: AWSConfig) = this()

    def createApiKey(params: CreateApiKeyRequest): Request[CreateApiKeyResponse]             = js.native
    def createDataSource(params: CreateDataSourceRequest): Request[CreateDataSourceResponse] = js.native
    def createFunction(params: CreateFunctionRequest): Request[CreateFunctionResponse]       = js.native
    def createGraphqlApi(params: CreateGraphqlApiRequest): Request[CreateGraphqlApiResponse] = js.native
    def createResolver(params: CreateResolverRequest): Request[CreateResolverResponse]       = js.native
    def createType(params: CreateTypeRequest): Request[CreateTypeResponse]                   = js.native
    def deleteApiKey(params: DeleteApiKeyRequest): Request[DeleteApiKeyResponse]             = js.native
    def deleteDataSource(params: DeleteDataSourceRequest): Request[DeleteDataSourceResponse] = js.native
    def deleteFunction(params: DeleteFunctionRequest): Request[DeleteFunctionResponse]       = js.native
    def deleteGraphqlApi(params: DeleteGraphqlApiRequest): Request[DeleteGraphqlApiResponse] = js.native
    def deleteResolver(params: DeleteResolverRequest): Request[DeleteResolverResponse]       = js.native
    def deleteType(params: DeleteTypeRequest): Request[DeleteTypeResponse]                   = js.native
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
  trait AdditionalAuthenticationProvider extends js.Object {
    var authenticationType: js.UndefOr[AuthenticationType]
    var openIDConnectConfig: js.UndefOr[OpenIDConnectConfig]
    var userPoolConfig: js.UndefOr[CognitoUserPoolConfig]
  }

  object AdditionalAuthenticationProvider {
    def apply(
        authenticationType: js.UndefOr[AuthenticationType] = js.undefined,
        openIDConnectConfig: js.UndefOr[OpenIDConnectConfig] = js.undefined,
        userPoolConfig: js.UndefOr[CognitoUserPoolConfig] = js.undefined
    ): AdditionalAuthenticationProvider = {
      val __obj = js.Dictionary.empty[js.Any]
      authenticationType.foreach(__v => __obj.update("authenticationType", __v.asInstanceOf[js.Any]))
      openIDConnectConfig.foreach(__v => __obj.update("openIDConnectConfig", __v.asInstanceOf[js.Any]))
      userPoolConfig.foreach(__v => __obj.update("userPoolConfig", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdditionalAuthenticationProvider]
    }
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
    def apply(
        description: js.UndefOr[String] = js.undefined,
        expires: js.UndefOr[Double] = js.undefined,
        id: js.UndefOr[String] = js.undefined
    ): ApiKey = {
      val __obj = js.Dictionary.empty[js.Any]
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      expires.foreach(__v => __obj.update("expires", __v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.update("id", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApiKey]
    }
  }

  object AuthenticationTypeEnum {
    val API_KEY                   = "API_KEY"
    val AWS_IAM                   = "AWS_IAM"
    val AMAZON_COGNITO_USER_POOLS = "AMAZON_COGNITO_USER_POOLS"
    val OPENID_CONNECT            = "OPENID_CONNECT"

    val values = IndexedSeq(API_KEY, AWS_IAM, AMAZON_COGNITO_USER_POOLS, OPENID_CONNECT)
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
    def apply(
        authorizationType: AuthorizationType,
        awsIamConfig: js.UndefOr[AwsIamConfig] = js.undefined
    ): AuthorizationConfig = {
      val __obj = js.Dictionary[js.Any](
        "authorizationType" -> authorizationType.asInstanceOf[js.Any]
      )

      awsIamConfig.foreach(__v => __obj.update("awsIamConfig", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AuthorizationConfig]
    }
  }

  object AuthorizationTypeEnum {
    val AWS_IAM = "AWS_IAM"

    val values = IndexedSeq(AWS_IAM)
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
    def apply(
        signingRegion: js.UndefOr[String] = js.undefined,
        signingServiceName: js.UndefOr[String] = js.undefined
    ): AwsIamConfig = {
      val __obj = js.Dictionary.empty[js.Any]
      signingRegion.foreach(__v => __obj.update("signingRegion", __v.asInstanceOf[js.Any]))
      signingServiceName.foreach(__v => __obj.update("signingServiceName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsIamConfig]
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
    def apply(
        awsRegion: String,
        userPoolId: String,
        appIdClientRegex: js.UndefOr[String] = js.undefined
    ): CognitoUserPoolConfig = {
      val __obj = js.Dictionary[js.Any](
        "awsRegion"  -> awsRegion.asInstanceOf[js.Any],
        "userPoolId" -> userPoolId.asInstanceOf[js.Any]
      )

      appIdClientRegex.foreach(__v => __obj.update("appIdClientRegex", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CognitoUserPoolConfig]
    }
  }

  @js.native
  trait CreateApiKeyRequest extends js.Object {
    var apiId: String
    var description: js.UndefOr[String]
    var expires: js.UndefOr[Double]
  }

  object CreateApiKeyRequest {
    def apply(
        apiId: String,
        description: js.UndefOr[String] = js.undefined,
        expires: js.UndefOr[Double] = js.undefined
    ): CreateApiKeyRequest = {
      val __obj = js.Dictionary[js.Any](
        "apiId" -> apiId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      expires.foreach(__v => __obj.update("expires", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApiKeyRequest]
    }
  }

  @js.native
  trait CreateApiKeyResponse extends js.Object {
    var apiKey: js.UndefOr[ApiKey]
  }

  object CreateApiKeyResponse {
    def apply(
        apiKey: js.UndefOr[ApiKey] = js.undefined
    ): CreateApiKeyResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      apiKey.foreach(__v => __obj.update("apiKey", __v.asInstanceOf[js.Any]))
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
      val __obj = js.Dictionary[js.Any](
        "apiId" -> apiId.asInstanceOf[js.Any],
        "name"  -> name.asInstanceOf[js.Any],
        "type"  -> `type`.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      dynamodbConfig.foreach(__v => __obj.update("dynamodbConfig", __v.asInstanceOf[js.Any]))
      elasticsearchConfig.foreach(__v => __obj.update("elasticsearchConfig", __v.asInstanceOf[js.Any]))
      httpConfig.foreach(__v => __obj.update("httpConfig", __v.asInstanceOf[js.Any]))
      lambdaConfig.foreach(__v => __obj.update("lambdaConfig", __v.asInstanceOf[js.Any]))
      relationalDatabaseConfig.foreach(__v => __obj.update("relationalDatabaseConfig", __v.asInstanceOf[js.Any]))
      serviceRoleArn.foreach(__v => __obj.update("serviceRoleArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDataSourceRequest]
    }
  }

  @js.native
  trait CreateDataSourceResponse extends js.Object {
    var dataSource: js.UndefOr[DataSource]
  }

  object CreateDataSourceResponse {
    def apply(
        dataSource: js.UndefOr[DataSource] = js.undefined
    ): CreateDataSourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      dataSource.foreach(__v => __obj.update("dataSource", __v.asInstanceOf[js.Any]))
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
    def apply(
        apiId: String,
        dataSourceName: ResourceName,
        functionVersion: String,
        name: ResourceName,
        requestMappingTemplate: MappingTemplate,
        description: js.UndefOr[String] = js.undefined,
        responseMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined
    ): CreateFunctionRequest = {
      val __obj = js.Dictionary[js.Any](
        "apiId"                  -> apiId.asInstanceOf[js.Any],
        "dataSourceName"         -> dataSourceName.asInstanceOf[js.Any],
        "functionVersion"        -> functionVersion.asInstanceOf[js.Any],
        "name"                   -> name.asInstanceOf[js.Any],
        "requestMappingTemplate" -> requestMappingTemplate.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      responseMappingTemplate.foreach(__v => __obj.update("responseMappingTemplate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFunctionRequest]
    }
  }

  @js.native
  trait CreateFunctionResponse extends js.Object {
    var functionConfiguration: js.UndefOr[FunctionConfiguration]
  }

  object CreateFunctionResponse {
    def apply(
        functionConfiguration: js.UndefOr[FunctionConfiguration] = js.undefined
    ): CreateFunctionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      functionConfiguration.foreach(__v => __obj.update("functionConfiguration", __v.asInstanceOf[js.Any]))
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
  }

  object CreateGraphqlApiRequest {
    def apply(
        authenticationType: AuthenticationType,
        name: String,
        additionalAuthenticationProviders: js.UndefOr[AdditionalAuthenticationProviders] = js.undefined,
        logConfig: js.UndefOr[LogConfig] = js.undefined,
        openIDConnectConfig: js.UndefOr[OpenIDConnectConfig] = js.undefined,
        tags: js.UndefOr[TagMap] = js.undefined,
        userPoolConfig: js.UndefOr[UserPoolConfig] = js.undefined
    ): CreateGraphqlApiRequest = {
      val __obj = js.Dictionary[js.Any](
        "authenticationType" -> authenticationType.asInstanceOf[js.Any],
        "name"               -> name.asInstanceOf[js.Any]
      )

      additionalAuthenticationProviders.foreach(
        __v => __obj.update("additionalAuthenticationProviders", __v.asInstanceOf[js.Any])
      )
      logConfig.foreach(__v => __obj.update("logConfig", __v.asInstanceOf[js.Any]))
      openIDConnectConfig.foreach(__v => __obj.update("openIDConnectConfig", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      userPoolConfig.foreach(__v => __obj.update("userPoolConfig", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGraphqlApiRequest]
    }
  }

  @js.native
  trait CreateGraphqlApiResponse extends js.Object {
    var graphqlApi: js.UndefOr[GraphqlApi]
  }

  object CreateGraphqlApiResponse {
    def apply(
        graphqlApi: js.UndefOr[GraphqlApi] = js.undefined
    ): CreateGraphqlApiResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      graphqlApi.foreach(__v => __obj.update("graphqlApi", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGraphqlApiResponse]
    }
  }

  @js.native
  trait CreateResolverRequest extends js.Object {
    var apiId: String
    var fieldName: ResourceName
    var requestMappingTemplate: MappingTemplate
    var typeName: ResourceName
    var dataSourceName: js.UndefOr[ResourceName]
    var kind: js.UndefOr[ResolverKind]
    var pipelineConfig: js.UndefOr[PipelineConfig]
    var responseMappingTemplate: js.UndefOr[MappingTemplate]
  }

  object CreateResolverRequest {
    def apply(
        apiId: String,
        fieldName: ResourceName,
        requestMappingTemplate: MappingTemplate,
        typeName: ResourceName,
        dataSourceName: js.UndefOr[ResourceName] = js.undefined,
        kind: js.UndefOr[ResolverKind] = js.undefined,
        pipelineConfig: js.UndefOr[PipelineConfig] = js.undefined,
        responseMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined
    ): CreateResolverRequest = {
      val __obj = js.Dictionary[js.Any](
        "apiId"                  -> apiId.asInstanceOf[js.Any],
        "fieldName"              -> fieldName.asInstanceOf[js.Any],
        "requestMappingTemplate" -> requestMappingTemplate.asInstanceOf[js.Any],
        "typeName"               -> typeName.asInstanceOf[js.Any]
      )

      dataSourceName.foreach(__v => __obj.update("dataSourceName", __v.asInstanceOf[js.Any]))
      kind.foreach(__v => __obj.update("kind", __v.asInstanceOf[js.Any]))
      pipelineConfig.foreach(__v => __obj.update("pipelineConfig", __v.asInstanceOf[js.Any]))
      responseMappingTemplate.foreach(__v => __obj.update("responseMappingTemplate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateResolverRequest]
    }
  }

  @js.native
  trait CreateResolverResponse extends js.Object {
    var resolver: js.UndefOr[Resolver]
  }

  object CreateResolverResponse {
    def apply(
        resolver: js.UndefOr[Resolver] = js.undefined
    ): CreateResolverResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      resolver.foreach(__v => __obj.update("resolver", __v.asInstanceOf[js.Any]))
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
    def apply(
        apiId: String,
        definition: String,
        format: TypeDefinitionFormat
    ): CreateTypeRequest = {
      val __obj = js.Dictionary[js.Any](
        "apiId"      -> apiId.asInstanceOf[js.Any],
        "definition" -> definition.asInstanceOf[js.Any],
        "format"     -> format.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateTypeRequest]
    }
  }

  @js.native
  trait CreateTypeResponse extends js.Object {
    var `type`: js.UndefOr[Type]
  }

  object CreateTypeResponse {
    def apply(
        `type`: js.UndefOr[Type] = js.undefined
    ): CreateTypeResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
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
      val __obj = js.Dictionary.empty[js.Any]
      dataSourceArn.foreach(__v => __obj.update("dataSourceArn", __v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      dynamodbConfig.foreach(__v => __obj.update("dynamodbConfig", __v.asInstanceOf[js.Any]))
      elasticsearchConfig.foreach(__v => __obj.update("elasticsearchConfig", __v.asInstanceOf[js.Any]))
      httpConfig.foreach(__v => __obj.update("httpConfig", __v.asInstanceOf[js.Any]))
      lambdaConfig.foreach(__v => __obj.update("lambdaConfig", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      relationalDatabaseConfig.foreach(__v => __obj.update("relationalDatabaseConfig", __v.asInstanceOf[js.Any]))
      serviceRoleArn.foreach(__v => __obj.update("serviceRoleArn", __v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataSource]
    }
  }

  object DataSourceTypeEnum {
    val AWS_LAMBDA           = "AWS_LAMBDA"
    val AMAZON_DYNAMODB      = "AMAZON_DYNAMODB"
    val AMAZON_ELASTICSEARCH = "AMAZON_ELASTICSEARCH"
    val NONE                 = "NONE"
    val HTTP                 = "HTTP"
    val RELATIONAL_DATABASE  = "RELATIONAL_DATABASE"

    val values = IndexedSeq(AWS_LAMBDA, AMAZON_DYNAMODB, AMAZON_ELASTICSEARCH, NONE, HTTP, RELATIONAL_DATABASE)
  }

  object DefaultActionEnum {
    val ALLOW = "ALLOW"
    val DENY  = "DENY"

    val values = IndexedSeq(ALLOW, DENY)
  }

  @js.native
  trait DeleteApiKeyRequest extends js.Object {
    var apiId: String
    var id: String
  }

  object DeleteApiKeyRequest {
    def apply(
        apiId: String,
        id: String
    ): DeleteApiKeyRequest = {
      val __obj = js.Dictionary[js.Any](
        "apiId" -> apiId.asInstanceOf[js.Any],
        "id"    -> id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteApiKeyRequest]
    }
  }

  @js.native
  trait DeleteApiKeyResponse extends js.Object {}

  object DeleteApiKeyResponse {
    def apply(
        ): DeleteApiKeyResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteApiKeyResponse]
    }
  }

  @js.native
  trait DeleteDataSourceRequest extends js.Object {
    var apiId: String
    var name: ResourceName
  }

  object DeleteDataSourceRequest {
    def apply(
        apiId: String,
        name: ResourceName
    ): DeleteDataSourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "apiId" -> apiId.asInstanceOf[js.Any],
        "name"  -> name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDataSourceRequest]
    }
  }

  @js.native
  trait DeleteDataSourceResponse extends js.Object {}

  object DeleteDataSourceResponse {
    def apply(
        ): DeleteDataSourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteDataSourceResponse]
    }
  }

  @js.native
  trait DeleteFunctionRequest extends js.Object {
    var apiId: String
    var functionId: ResourceName
  }

  object DeleteFunctionRequest {
    def apply(
        apiId: String,
        functionId: ResourceName
    ): DeleteFunctionRequest = {
      val __obj = js.Dictionary[js.Any](
        "apiId"      -> apiId.asInstanceOf[js.Any],
        "functionId" -> functionId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteFunctionRequest]
    }
  }

  @js.native
  trait DeleteFunctionResponse extends js.Object {}

  object DeleteFunctionResponse {
    def apply(
        ): DeleteFunctionResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteFunctionResponse]
    }
  }

  @js.native
  trait DeleteGraphqlApiRequest extends js.Object {
    var apiId: String
  }

  object DeleteGraphqlApiRequest {
    def apply(
        apiId: String
    ): DeleteGraphqlApiRequest = {
      val __obj = js.Dictionary[js.Any](
        "apiId" -> apiId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteGraphqlApiRequest]
    }
  }

  @js.native
  trait DeleteGraphqlApiResponse extends js.Object {}

  object DeleteGraphqlApiResponse {
    def apply(
        ): DeleteGraphqlApiResponse = {
      val __obj = js.Dictionary.empty[js.Any]

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
    def apply(
        apiId: String,
        fieldName: ResourceName,
        typeName: ResourceName
    ): DeleteResolverRequest = {
      val __obj = js.Dictionary[js.Any](
        "apiId"     -> apiId.asInstanceOf[js.Any],
        "fieldName" -> fieldName.asInstanceOf[js.Any],
        "typeName"  -> typeName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteResolverRequest]
    }
  }

  @js.native
  trait DeleteResolverResponse extends js.Object {}

  object DeleteResolverResponse {
    def apply(
        ): DeleteResolverResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteResolverResponse]
    }
  }

  @js.native
  trait DeleteTypeRequest extends js.Object {
    var apiId: String
    var typeName: ResourceName
  }

  object DeleteTypeRequest {
    def apply(
        apiId: String,
        typeName: ResourceName
    ): DeleteTypeRequest = {
      val __obj = js.Dictionary[js.Any](
        "apiId"    -> apiId.asInstanceOf[js.Any],
        "typeName" -> typeName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteTypeRequest]
    }
  }

  @js.native
  trait DeleteTypeResponse extends js.Object {}

  object DeleteTypeResponse {
    def apply(
        ): DeleteTypeResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[DeleteTypeResponse]
    }
  }

  /**
    * Describes an Amazon DynamoDB data source configuration.
    */
  @js.native
  trait DynamodbDataSourceConfig extends js.Object {
    var awsRegion: String
    var tableName: String
    var useCallerCredentials: js.UndefOr[Boolean]
  }

  object DynamodbDataSourceConfig {
    def apply(
        awsRegion: String,
        tableName: String,
        useCallerCredentials: js.UndefOr[Boolean] = js.undefined
    ): DynamodbDataSourceConfig = {
      val __obj = js.Dictionary[js.Any](
        "awsRegion" -> awsRegion.asInstanceOf[js.Any],
        "tableName" -> tableName.asInstanceOf[js.Any]
      )

      useCallerCredentials.foreach(__v => __obj.update("useCallerCredentials", __v.asInstanceOf[js.Any]))
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
    def apply(
        awsRegion: String,
        endpoint: String
    ): ElasticsearchDataSourceConfig = {
      val __obj = js.Dictionary[js.Any](
        "awsRegion" -> awsRegion.asInstanceOf[js.Any],
        "endpoint"  -> endpoint.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ElasticsearchDataSourceConfig]
    }
  }

  object FieldLogLevelEnum {
    val NONE  = "NONE"
    val ERROR = "ERROR"
    val ALL   = "ALL"

    val values = IndexedSeq(NONE, ERROR, ALL)
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
      val __obj = js.Dictionary.empty[js.Any]
      dataSourceName.foreach(__v => __obj.update("dataSourceName", __v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      functionArn.foreach(__v => __obj.update("functionArn", __v.asInstanceOf[js.Any]))
      functionId.foreach(__v => __obj.update("functionId", __v.asInstanceOf[js.Any]))
      functionVersion.foreach(__v => __obj.update("functionVersion", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      requestMappingTemplate.foreach(__v => __obj.update("requestMappingTemplate", __v.asInstanceOf[js.Any]))
      responseMappingTemplate.foreach(__v => __obj.update("responseMappingTemplate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FunctionConfiguration]
    }
  }

  @js.native
  trait GetDataSourceRequest extends js.Object {
    var apiId: String
    var name: ResourceName
  }

  object GetDataSourceRequest {
    def apply(
        apiId: String,
        name: ResourceName
    ): GetDataSourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "apiId" -> apiId.asInstanceOf[js.Any],
        "name"  -> name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDataSourceRequest]
    }
  }

  @js.native
  trait GetDataSourceResponse extends js.Object {
    var dataSource: js.UndefOr[DataSource]
  }

  object GetDataSourceResponse {
    def apply(
        dataSource: js.UndefOr[DataSource] = js.undefined
    ): GetDataSourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      dataSource.foreach(__v => __obj.update("dataSource", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDataSourceResponse]
    }
  }

  @js.native
  trait GetFunctionRequest extends js.Object {
    var apiId: String
    var functionId: ResourceName
  }

  object GetFunctionRequest {
    def apply(
        apiId: String,
        functionId: ResourceName
    ): GetFunctionRequest = {
      val __obj = js.Dictionary[js.Any](
        "apiId"      -> apiId.asInstanceOf[js.Any],
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
    def apply(
        functionConfiguration: js.UndefOr[FunctionConfiguration] = js.undefined
    ): GetFunctionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      functionConfiguration.foreach(__v => __obj.update("functionConfiguration", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFunctionResponse]
    }
  }

  @js.native
  trait GetGraphqlApiRequest extends js.Object {
    var apiId: String
  }

  object GetGraphqlApiRequest {
    def apply(
        apiId: String
    ): GetGraphqlApiRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        graphqlApi: js.UndefOr[GraphqlApi] = js.undefined
    ): GetGraphqlApiResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      graphqlApi.foreach(__v => __obj.update("graphqlApi", __v.asInstanceOf[js.Any]))
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
    def apply(
        apiId: String,
        format: OutputType,
        includeDirectives: js.UndefOr[BooleanValue] = js.undefined
    ): GetIntrospectionSchemaRequest = {
      val __obj = js.Dictionary[js.Any](
        "apiId"  -> apiId.asInstanceOf[js.Any],
        "format" -> format.asInstanceOf[js.Any]
      )

      includeDirectives.foreach(__v => __obj.update("includeDirectives", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetIntrospectionSchemaRequest]
    }
  }

  @js.native
  trait GetIntrospectionSchemaResponse extends js.Object {
    var schema: js.UndefOr[Blob]
  }

  object GetIntrospectionSchemaResponse {
    def apply(
        schema: js.UndefOr[Blob] = js.undefined
    ): GetIntrospectionSchemaResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      schema.foreach(__v => __obj.update("schema", __v.asInstanceOf[js.Any]))
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
    def apply(
        apiId: String,
        fieldName: ResourceName,
        typeName: ResourceName
    ): GetResolverRequest = {
      val __obj = js.Dictionary[js.Any](
        "apiId"     -> apiId.asInstanceOf[js.Any],
        "fieldName" -> fieldName.asInstanceOf[js.Any],
        "typeName"  -> typeName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetResolverRequest]
    }
  }

  @js.native
  trait GetResolverResponse extends js.Object {
    var resolver: js.UndefOr[Resolver]
  }

  object GetResolverResponse {
    def apply(
        resolver: js.UndefOr[Resolver] = js.undefined
    ): GetResolverResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      resolver.foreach(__v => __obj.update("resolver", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResolverResponse]
    }
  }

  @js.native
  trait GetSchemaCreationStatusRequest extends js.Object {
    var apiId: String
  }

  object GetSchemaCreationStatusRequest {
    def apply(
        apiId: String
    ): GetSchemaCreationStatusRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        details: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[SchemaStatus] = js.undefined
    ): GetSchemaCreationStatusResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      details.foreach(__v => __obj.update("details", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
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
    def apply(
        apiId: String,
        format: TypeDefinitionFormat,
        typeName: ResourceName
    ): GetTypeRequest = {
      val __obj = js.Dictionary[js.Any](
        "apiId"    -> apiId.asInstanceOf[js.Any],
        "format"   -> format.asInstanceOf[js.Any],
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
    def apply(
        `type`: js.UndefOr[Type] = js.undefined
    ): GetTypeResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
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
  }

  object GraphqlApi {
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
        userPoolConfig: js.UndefOr[UserPoolConfig] = js.undefined
    ): GraphqlApi = {
      val __obj = js.Dictionary.empty[js.Any]
      additionalAuthenticationProviders.foreach(
        __v => __obj.update("additionalAuthenticationProviders", __v.asInstanceOf[js.Any])
      )
      apiId.foreach(__v => __obj.update("apiId", __v.asInstanceOf[js.Any]))
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      authenticationType.foreach(__v => __obj.update("authenticationType", __v.asInstanceOf[js.Any]))
      logConfig.foreach(__v => __obj.update("logConfig", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      openIDConnectConfig.foreach(__v => __obj.update("openIDConnectConfig", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      uris.foreach(__v => __obj.update("uris", __v.asInstanceOf[js.Any]))
      userPoolConfig.foreach(__v => __obj.update("userPoolConfig", __v.asInstanceOf[js.Any]))
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
    def apply(
        authorizationConfig: js.UndefOr[AuthorizationConfig] = js.undefined,
        endpoint: js.UndefOr[String] = js.undefined
    ): HttpDataSourceConfig = {
      val __obj = js.Dictionary.empty[js.Any]
      authorizationConfig.foreach(__v => __obj.update("authorizationConfig", __v.asInstanceOf[js.Any]))
      endpoint.foreach(__v => __obj.update("endpoint", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HttpDataSourceConfig]
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
    def apply(
        lambdaFunctionArn: String
    ): LambdaDataSourceConfig = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        apiId: String,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListApiKeysRequest = {
      val __obj = js.Dictionary[js.Any](
        "apiId" -> apiId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListApiKeysRequest]
    }
  }

  @js.native
  trait ListApiKeysResponse extends js.Object {
    var apiKeys: js.UndefOr[ApiKeys]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListApiKeysResponse {
    def apply(
        apiKeys: js.UndefOr[ApiKeys] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListApiKeysResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      apiKeys.foreach(__v => __obj.update("apiKeys", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        apiId: String,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListDataSourcesRequest = {
      val __obj = js.Dictionary[js.Any](
        "apiId" -> apiId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataSourcesRequest]
    }
  }

  @js.native
  trait ListDataSourcesResponse extends js.Object {
    var dataSources: js.UndefOr[DataSources]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListDataSourcesResponse {
    def apply(
        dataSources: js.UndefOr[DataSources] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListDataSourcesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      dataSources.foreach(__v => __obj.update("dataSources", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        apiId: String,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListFunctionsRequest = {
      val __obj = js.Dictionary[js.Any](
        "apiId" -> apiId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFunctionsRequest]
    }
  }

  @js.native
  trait ListFunctionsResponse extends js.Object {
    var functions: js.UndefOr[Functions]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListFunctionsResponse {
    def apply(
        functions: js.UndefOr[Functions] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListFunctionsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      functions.foreach(__v => __obj.update("functions", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFunctionsResponse]
    }
  }

  @js.native
  trait ListGraphqlApisRequest extends js.Object {
    var maxResults: js.UndefOr[MaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListGraphqlApisRequest {
    def apply(
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListGraphqlApisRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGraphqlApisRequest]
    }
  }

  @js.native
  trait ListGraphqlApisResponse extends js.Object {
    var graphqlApis: js.UndefOr[GraphqlApis]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListGraphqlApisResponse {
    def apply(
        graphqlApis: js.UndefOr[GraphqlApis] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListGraphqlApisResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      graphqlApis.foreach(__v => __obj.update("graphqlApis", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
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
    def apply(
        apiId: String,
        functionId: String,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListResolversByFunctionRequest = {
      val __obj = js.Dictionary[js.Any](
        "apiId"      -> apiId.asInstanceOf[js.Any],
        "functionId" -> functionId.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResolversByFunctionRequest]
    }
  }

  @js.native
  trait ListResolversByFunctionResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var resolvers: js.UndefOr[Resolvers]
  }

  object ListResolversByFunctionResponse {
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        resolvers: js.UndefOr[Resolvers] = js.undefined
    ): ListResolversByFunctionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      resolvers.foreach(__v => __obj.update("resolvers", __v.asInstanceOf[js.Any]))
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
    def apply(
        apiId: String,
        typeName: String,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListResolversRequest = {
      val __obj = js.Dictionary[js.Any](
        "apiId"    -> apiId.asInstanceOf[js.Any],
        "typeName" -> typeName.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResolversRequest]
    }
  }

  @js.native
  trait ListResolversResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var resolvers: js.UndefOr[Resolvers]
  }

  object ListResolversResponse {
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        resolvers: js.UndefOr[Resolvers] = js.undefined
    ): ListResolversResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      resolvers.foreach(__v => __obj.update("resolvers", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListResolversResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: ResourceArn
  }

  object ListTagsForResourceRequest {
    def apply(
        resourceArn: ResourceArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dictionary[js.Any](
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
    def apply(
        tags: js.UndefOr[TagMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
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
    def apply(
        apiId: String,
        format: TypeDefinitionFormat,
        maxResults: js.UndefOr[MaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListTypesRequest = {
      val __obj = js.Dictionary[js.Any](
        "apiId"  -> apiId.asInstanceOf[js.Any],
        "format" -> format.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.update("maxResults", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTypesRequest]
    }
  }

  @js.native
  trait ListTypesResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var types: js.UndefOr[TypeList]
  }

  object ListTypesResponse {
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        types: js.UndefOr[TypeList] = js.undefined
    ): ListTypesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      types.foreach(__v => __obj.update("types", __v.asInstanceOf[js.Any]))
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
    def apply(
        cloudWatchLogsRoleArn: String,
        fieldLogLevel: FieldLogLevel,
        excludeVerboseContent: js.UndefOr[Boolean] = js.undefined
    ): LogConfig = {
      val __obj = js.Dictionary[js.Any](
        "cloudWatchLogsRoleArn" -> cloudWatchLogsRoleArn.asInstanceOf[js.Any],
        "fieldLogLevel"         -> fieldLogLevel.asInstanceOf[js.Any]
      )

      excludeVerboseContent.foreach(__v => __obj.update("excludeVerboseContent", __v.asInstanceOf[js.Any]))
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
    def apply(
        issuer: String,
        authTTL: js.UndefOr[Double] = js.undefined,
        clientId: js.UndefOr[String] = js.undefined,
        iatTTL: js.UndefOr[Double] = js.undefined
    ): OpenIDConnectConfig = {
      val __obj = js.Dictionary[js.Any](
        "issuer" -> issuer.asInstanceOf[js.Any]
      )

      authTTL.foreach(__v => __obj.update("authTTL", __v.asInstanceOf[js.Any]))
      clientId.foreach(__v => __obj.update("clientId", __v.asInstanceOf[js.Any]))
      iatTTL.foreach(__v => __obj.update("iatTTL", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OpenIDConnectConfig]
    }
  }

  object OutputTypeEnum {
    val SDL  = "SDL"
    val JSON = "JSON"

    val values = IndexedSeq(SDL, JSON)
  }

  /**
    * The pipeline configuration for a resolver of kind <code>PIPELINE</code>.
    */
  @js.native
  trait PipelineConfig extends js.Object {
    var functions: js.UndefOr[FunctionsIds]
  }

  object PipelineConfig {
    def apply(
        functions: js.UndefOr[FunctionsIds] = js.undefined
    ): PipelineConfig = {
      val __obj = js.Dictionary.empty[js.Any]
      functions.foreach(__v => __obj.update("functions", __v.asInstanceOf[js.Any]))
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
    def apply(
        awsRegion: js.UndefOr[String] = js.undefined,
        awsSecretStoreArn: js.UndefOr[String] = js.undefined,
        databaseName: js.UndefOr[String] = js.undefined,
        dbClusterIdentifier: js.UndefOr[String] = js.undefined,
        schema: js.UndefOr[String] = js.undefined
    ): RdsHttpEndpointConfig = {
      val __obj = js.Dictionary.empty[js.Any]
      awsRegion.foreach(__v => __obj.update("awsRegion", __v.asInstanceOf[js.Any]))
      awsSecretStoreArn.foreach(__v => __obj.update("awsSecretStoreArn", __v.asInstanceOf[js.Any]))
      databaseName.foreach(__v => __obj.update("databaseName", __v.asInstanceOf[js.Any]))
      dbClusterIdentifier.foreach(__v => __obj.update("dbClusterIdentifier", __v.asInstanceOf[js.Any]))
      schema.foreach(__v => __obj.update("schema", __v.asInstanceOf[js.Any]))
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
    def apply(
        rdsHttpEndpointConfig: js.UndefOr[RdsHttpEndpointConfig] = js.undefined,
        relationalDatabaseSourceType: js.UndefOr[RelationalDatabaseSourceType] = js.undefined
    ): RelationalDatabaseDataSourceConfig = {
      val __obj = js.Dictionary.empty[js.Any]
      rdsHttpEndpointConfig.foreach(__v => __obj.update("rdsHttpEndpointConfig", __v.asInstanceOf[js.Any]))
      relationalDatabaseSourceType.foreach(
        __v => __obj.update("relationalDatabaseSourceType", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[RelationalDatabaseDataSourceConfig]
    }
  }

  object RelationalDatabaseSourceTypeEnum {
    val RDS_HTTP_ENDPOINT = "RDS_HTTP_ENDPOINT"

    val values = IndexedSeq(RDS_HTTP_ENDPOINT)
  }

  /**
    * Describes a resolver.
    */
  @js.native
  trait Resolver extends js.Object {
    var dataSourceName: js.UndefOr[ResourceName]
    var fieldName: js.UndefOr[ResourceName]
    var kind: js.UndefOr[ResolverKind]
    var pipelineConfig: js.UndefOr[PipelineConfig]
    var requestMappingTemplate: js.UndefOr[MappingTemplate]
    var resolverArn: js.UndefOr[String]
    var responseMappingTemplate: js.UndefOr[MappingTemplate]
    var typeName: js.UndefOr[ResourceName]
  }

  object Resolver {
    def apply(
        dataSourceName: js.UndefOr[ResourceName] = js.undefined,
        fieldName: js.UndefOr[ResourceName] = js.undefined,
        kind: js.UndefOr[ResolverKind] = js.undefined,
        pipelineConfig: js.UndefOr[PipelineConfig] = js.undefined,
        requestMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined,
        resolverArn: js.UndefOr[String] = js.undefined,
        responseMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined,
        typeName: js.UndefOr[ResourceName] = js.undefined
    ): Resolver = {
      val __obj = js.Dictionary.empty[js.Any]
      dataSourceName.foreach(__v => __obj.update("dataSourceName", __v.asInstanceOf[js.Any]))
      fieldName.foreach(__v => __obj.update("fieldName", __v.asInstanceOf[js.Any]))
      kind.foreach(__v => __obj.update("kind", __v.asInstanceOf[js.Any]))
      pipelineConfig.foreach(__v => __obj.update("pipelineConfig", __v.asInstanceOf[js.Any]))
      requestMappingTemplate.foreach(__v => __obj.update("requestMappingTemplate", __v.asInstanceOf[js.Any]))
      resolverArn.foreach(__v => __obj.update("resolverArn", __v.asInstanceOf[js.Any]))
      responseMappingTemplate.foreach(__v => __obj.update("responseMappingTemplate", __v.asInstanceOf[js.Any]))
      typeName.foreach(__v => __obj.update("typeName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Resolver]
    }
  }

  object ResolverKindEnum {
    val UNIT     = "UNIT"
    val PIPELINE = "PIPELINE"

    val values = IndexedSeq(UNIT, PIPELINE)
  }

  object SchemaStatusEnum {
    val PROCESSING     = "PROCESSING"
    val ACTIVE         = "ACTIVE"
    val DELETING       = "DELETING"
    val FAILED         = "FAILED"
    val SUCCESS        = "SUCCESS"
    val NOT_APPLICABLE = "NOT_APPLICABLE"

    val values = IndexedSeq(PROCESSING, ACTIVE, DELETING, FAILED, SUCCESS, NOT_APPLICABLE)
  }

  @js.native
  trait StartSchemaCreationRequest extends js.Object {
    var apiId: String
    var definition: Blob
  }

  object StartSchemaCreationRequest {
    def apply(
        apiId: String,
        definition: Blob
    ): StartSchemaCreationRequest = {
      val __obj = js.Dictionary[js.Any](
        "apiId"      -> apiId.asInstanceOf[js.Any],
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
    def apply(
        status: js.UndefOr[SchemaStatus] = js.undefined
    ): StartSchemaCreationResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartSchemaCreationResponse]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tags: TagMap
  }

  object TagResourceRequest {
    def apply(
        resourceArn: ResourceArn,
        tags: TagMap
    ): TagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags"        -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    def apply(
        ): TagResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

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
    def apply(
        arn: js.UndefOr[String] = js.undefined,
        definition: js.UndefOr[String] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        format: js.UndefOr[TypeDefinitionFormat] = js.undefined,
        name: js.UndefOr[ResourceName] = js.undefined
    ): Type = {
      val __obj = js.Dictionary.empty[js.Any]
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      definition.foreach(__v => __obj.update("definition", __v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      format.foreach(__v => __obj.update("format", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Type]
    }
  }

  object TypeDefinitionFormatEnum {
    val SDL  = "SDL"
    val JSON = "JSON"

    val values = IndexedSeq(SDL, JSON)
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: ResourceArn
    var tagKeys: TagKeyList
  }

  object UntagResourceRequest {
    def apply(
        resourceArn: ResourceArn,
        tagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys"     -> tagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    def apply(
        ): UntagResourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[UntagResourceResponse]
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
    def apply(
        apiId: String,
        id: String,
        description: js.UndefOr[String] = js.undefined,
        expires: js.UndefOr[Double] = js.undefined
    ): UpdateApiKeyRequest = {
      val __obj = js.Dictionary[js.Any](
        "apiId" -> apiId.asInstanceOf[js.Any],
        "id"    -> id.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      expires.foreach(__v => __obj.update("expires", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApiKeyRequest]
    }
  }

  @js.native
  trait UpdateApiKeyResponse extends js.Object {
    var apiKey: js.UndefOr[ApiKey]
  }

  object UpdateApiKeyResponse {
    def apply(
        apiKey: js.UndefOr[ApiKey] = js.undefined
    ): UpdateApiKeyResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      apiKey.foreach(__v => __obj.update("apiKey", __v.asInstanceOf[js.Any]))
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
      val __obj = js.Dictionary[js.Any](
        "apiId" -> apiId.asInstanceOf[js.Any],
        "name"  -> name.asInstanceOf[js.Any],
        "type"  -> `type`.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      dynamodbConfig.foreach(__v => __obj.update("dynamodbConfig", __v.asInstanceOf[js.Any]))
      elasticsearchConfig.foreach(__v => __obj.update("elasticsearchConfig", __v.asInstanceOf[js.Any]))
      httpConfig.foreach(__v => __obj.update("httpConfig", __v.asInstanceOf[js.Any]))
      lambdaConfig.foreach(__v => __obj.update("lambdaConfig", __v.asInstanceOf[js.Any]))
      relationalDatabaseConfig.foreach(__v => __obj.update("relationalDatabaseConfig", __v.asInstanceOf[js.Any]))
      serviceRoleArn.foreach(__v => __obj.update("serviceRoleArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDataSourceRequest]
    }
  }

  @js.native
  trait UpdateDataSourceResponse extends js.Object {
    var dataSource: js.UndefOr[DataSource]
  }

  object UpdateDataSourceResponse {
    def apply(
        dataSource: js.UndefOr[DataSource] = js.undefined
    ): UpdateDataSourceResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      dataSource.foreach(__v => __obj.update("dataSource", __v.asInstanceOf[js.Any]))
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
      val __obj = js.Dictionary[js.Any](
        "apiId"                  -> apiId.asInstanceOf[js.Any],
        "dataSourceName"         -> dataSourceName.asInstanceOf[js.Any],
        "functionId"             -> functionId.asInstanceOf[js.Any],
        "functionVersion"        -> functionVersion.asInstanceOf[js.Any],
        "name"                   -> name.asInstanceOf[js.Any],
        "requestMappingTemplate" -> requestMappingTemplate.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      responseMappingTemplate.foreach(__v => __obj.update("responseMappingTemplate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFunctionRequest]
    }
  }

  @js.native
  trait UpdateFunctionResponse extends js.Object {
    var functionConfiguration: js.UndefOr[FunctionConfiguration]
  }

  object UpdateFunctionResponse {
    def apply(
        functionConfiguration: js.UndefOr[FunctionConfiguration] = js.undefined
    ): UpdateFunctionResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      functionConfiguration.foreach(__v => __obj.update("functionConfiguration", __v.asInstanceOf[js.Any]))
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
  }

  object UpdateGraphqlApiRequest {
    def apply(
        apiId: String,
        name: String,
        additionalAuthenticationProviders: js.UndefOr[AdditionalAuthenticationProviders] = js.undefined,
        authenticationType: js.UndefOr[AuthenticationType] = js.undefined,
        logConfig: js.UndefOr[LogConfig] = js.undefined,
        openIDConnectConfig: js.UndefOr[OpenIDConnectConfig] = js.undefined,
        userPoolConfig: js.UndefOr[UserPoolConfig] = js.undefined
    ): UpdateGraphqlApiRequest = {
      val __obj = js.Dictionary[js.Any](
        "apiId" -> apiId.asInstanceOf[js.Any],
        "name"  -> name.asInstanceOf[js.Any]
      )

      additionalAuthenticationProviders.foreach(
        __v => __obj.update("additionalAuthenticationProviders", __v.asInstanceOf[js.Any])
      )
      authenticationType.foreach(__v => __obj.update("authenticationType", __v.asInstanceOf[js.Any]))
      logConfig.foreach(__v => __obj.update("logConfig", __v.asInstanceOf[js.Any]))
      openIDConnectConfig.foreach(__v => __obj.update("openIDConnectConfig", __v.asInstanceOf[js.Any]))
      userPoolConfig.foreach(__v => __obj.update("userPoolConfig", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGraphqlApiRequest]
    }
  }

  @js.native
  trait UpdateGraphqlApiResponse extends js.Object {
    var graphqlApi: js.UndefOr[GraphqlApi]
  }

  object UpdateGraphqlApiResponse {
    def apply(
        graphqlApi: js.UndefOr[GraphqlApi] = js.undefined
    ): UpdateGraphqlApiResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      graphqlApi.foreach(__v => __obj.update("graphqlApi", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGraphqlApiResponse]
    }
  }

  @js.native
  trait UpdateResolverRequest extends js.Object {
    var apiId: String
    var fieldName: ResourceName
    var requestMappingTemplate: MappingTemplate
    var typeName: ResourceName
    var dataSourceName: js.UndefOr[ResourceName]
    var kind: js.UndefOr[ResolverKind]
    var pipelineConfig: js.UndefOr[PipelineConfig]
    var responseMappingTemplate: js.UndefOr[MappingTemplate]
  }

  object UpdateResolverRequest {
    def apply(
        apiId: String,
        fieldName: ResourceName,
        requestMappingTemplate: MappingTemplate,
        typeName: ResourceName,
        dataSourceName: js.UndefOr[ResourceName] = js.undefined,
        kind: js.UndefOr[ResolverKind] = js.undefined,
        pipelineConfig: js.UndefOr[PipelineConfig] = js.undefined,
        responseMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined
    ): UpdateResolverRequest = {
      val __obj = js.Dictionary[js.Any](
        "apiId"                  -> apiId.asInstanceOf[js.Any],
        "fieldName"              -> fieldName.asInstanceOf[js.Any],
        "requestMappingTemplate" -> requestMappingTemplate.asInstanceOf[js.Any],
        "typeName"               -> typeName.asInstanceOf[js.Any]
      )

      dataSourceName.foreach(__v => __obj.update("dataSourceName", __v.asInstanceOf[js.Any]))
      kind.foreach(__v => __obj.update("kind", __v.asInstanceOf[js.Any]))
      pipelineConfig.foreach(__v => __obj.update("pipelineConfig", __v.asInstanceOf[js.Any]))
      responseMappingTemplate.foreach(__v => __obj.update("responseMappingTemplate", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateResolverRequest]
    }
  }

  @js.native
  trait UpdateResolverResponse extends js.Object {
    var resolver: js.UndefOr[Resolver]
  }

  object UpdateResolverResponse {
    def apply(
        resolver: js.UndefOr[Resolver] = js.undefined
    ): UpdateResolverResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      resolver.foreach(__v => __obj.update("resolver", __v.asInstanceOf[js.Any]))
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
    def apply(
        apiId: String,
        format: TypeDefinitionFormat,
        typeName: ResourceName,
        definition: js.UndefOr[String] = js.undefined
    ): UpdateTypeRequest = {
      val __obj = js.Dictionary[js.Any](
        "apiId"    -> apiId.asInstanceOf[js.Any],
        "format"   -> format.asInstanceOf[js.Any],
        "typeName" -> typeName.asInstanceOf[js.Any]
      )

      definition.foreach(__v => __obj.update("definition", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTypeRequest]
    }
  }

  @js.native
  trait UpdateTypeResponse extends js.Object {
    var `type`: js.UndefOr[Type]
  }

  object UpdateTypeResponse {
    def apply(
        `type`: js.UndefOr[Type] = js.undefined
    ): UpdateTypeResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
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
    def apply(
        awsRegion: String,
        defaultAction: DefaultAction,
        userPoolId: String,
        appIdClientRegex: js.UndefOr[String] = js.undefined
    ): UserPoolConfig = {
      val __obj = js.Dictionary[js.Any](
        "awsRegion"     -> awsRegion.asInstanceOf[js.Any],
        "defaultAction" -> defaultAction.asInstanceOf[js.Any],
        "userPoolId"    -> userPoolId.asInstanceOf[js.Any]
      )

      appIdClientRegex.foreach(__v => __obj.update("appIdClientRegex", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UserPoolConfig]
    }
  }
}
