package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object appsync {
  type ApiKeys = js.Array[ApiKey]
  type AuthenticationType = String
  type AuthorizationType = String
  type Blob = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type DataSourceType = String
  type DataSources = js.Array[DataSource]
  type DefaultAction = String
  type FieldLogLevel = String
  type Functions = js.Array[FunctionConfiguration]
  type FunctionsIds = js.Array[String]
  type GraphqlApis = js.Array[GraphqlApi]
  type MapOfStringToString = js.Dictionary[String]
  type MappingTemplate = String
  type MaxResults = Int
  type OutputType = String
  type PaginationToken = String
  type RelationalDatabaseSourceType = String
  type ResolverKind = String
  type Resolvers = js.Array[Resolver]
  type ResourceName = String
  type SchemaStatus = String
  type TypeDefinitionFormat = String
  type TypeList = js.Array[Type]
}

package appsync {
  @js.native
  @JSImport("aws-sdk", "AppSync")
  class AppSync(config: AWSConfig) extends js.Object {
    def createApiKey(params: CreateApiKeyRequest): Request[CreateApiKeyResponse] = js.native
    def createDataSource(params: CreateDataSourceRequest): Request[CreateDataSourceResponse] = js.native
    def createFunction(params: CreateFunctionRequest): Request[CreateFunctionResponse] = js.native
    def createGraphqlApi(params: CreateGraphqlApiRequest): Request[CreateGraphqlApiResponse] = js.native
    def createResolver(params: CreateResolverRequest): Request[CreateResolverResponse] = js.native
    def createType(params: CreateTypeRequest): Request[CreateTypeResponse] = js.native
    def deleteApiKey(params: DeleteApiKeyRequest): Request[DeleteApiKeyResponse] = js.native
    def deleteDataSource(params: DeleteDataSourceRequest): Request[DeleteDataSourceResponse] = js.native
    def deleteFunction(params: DeleteFunctionRequest): Request[DeleteFunctionResponse] = js.native
    def deleteGraphqlApi(params: DeleteGraphqlApiRequest): Request[DeleteGraphqlApiResponse] = js.native
    def deleteResolver(params: DeleteResolverRequest): Request[DeleteResolverResponse] = js.native
    def deleteType(params: DeleteTypeRequest): Request[DeleteTypeResponse] = js.native
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
    def listTypes(params: ListTypesRequest): Request[ListTypesResponse] = js.native
    def startSchemaCreation(params: StartSchemaCreationRequest): Request[StartSchemaCreationResponse] = js.native
    def updateApiKey(params: UpdateApiKeyRequest): Request[UpdateApiKeyResponse] = js.native
    def updateDataSource(params: UpdateDataSourceRequest): Request[UpdateDataSourceResponse] = js.native
    def updateFunction(params: UpdateFunctionRequest): Request[UpdateFunctionResponse] = js.native
    def updateGraphqlApi(params: UpdateGraphqlApiRequest): Request[UpdateGraphqlApiResponse] = js.native
    def updateResolver(params: UpdateResolverRequest): Request[UpdateResolverResponse] = js.native
    def updateType(params: UpdateTypeRequest): Request[UpdateTypeResponse] = js.native
  }

  /**
   * <p>Describes an API key.</p> <p>Customers invoke AWS AppSync GraphQL API operations with API keys as an identity mechanism. There are two key versions:</p> <p> <b>da1</b>: This version was introduced at launch in November 2017. These keys always expire after 7 days. Key expiration is managed by Amazon DynamoDB TTL. The keys ceased to be valid after February 21, 2018 and should not be used after that date.</p> <ul> <li> <p> <code>ListApiKeys</code> returns the expiration time in milliseconds.</p> </li> <li> <p> <code>CreateApiKey</code> returns the expiration time in milliseconds.</p> </li> <li> <p> <code>UpdateApiKey</code> is not available for this key version.</p> </li> <li> <p> <code>DeleteApiKey</code> deletes the item from the table.</p> </li> <li> <p>Expiration is stored in Amazon DynamoDB as milliseconds. This results in a bug where keys are not automatically deleted because DynamoDB expects the TTL to be stored in seconds. As a one-time action, we will delete these keys from the table after February 21, 2018.</p> </li> </ul> <p> <b>da2</b>: This version was introduced in February 2018 when AppSync added support to extend key expiration.</p> <ul> <li> <p> <code>ListApiKeys</code> returns the expiration time in seconds.</p> </li> <li> <p> <code>CreateApiKey</code> returns the expiration time in seconds and accepts a user-provided expiration time in seconds.</p> </li> <li> <p> <code>UpdateApiKey</code> returns the expiration time in seconds and accepts a user-provided expiration time in seconds. Key expiration can only be updated while the key has not expired.</p> </li> <li> <p> <code>DeleteApiKey</code> deletes the item from the table.</p> </li> <li> <p>Expiration is stored in Amazon DynamoDB as seconds.</p> </li> </ul>
   */
  @js.native
  trait ApiKey extends js.Object {
    var id: js.UndefOr[String]
    var description: js.UndefOr[String]
    var expires: js.UndefOr[Double]
  }

  object ApiKey {
    def apply(
      id: js.UndefOr[String] = js.undefined,
      description: js.UndefOr[String] = js.undefined,
      expires: js.UndefOr[Double] = js.undefined): ApiKey = {
      val _fields = IndexedSeq[(String, js.Any)](
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "expires" -> expires.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ApiKey]
    }
  }

  object AuthenticationTypeEnum {
    val API_KEY = "API_KEY"
    val AWS_IAM = "AWS_IAM"
    val AMAZON_COGNITO_USER_POOLS = "AMAZON_COGNITO_USER_POOLS"
    val OPENID_CONNECT = "OPENID_CONNECT"

    val values = IndexedSeq(API_KEY, AWS_IAM, AMAZON_COGNITO_USER_POOLS, OPENID_CONNECT)
  }

  /**
   * <p>The authorization config in case the HTTP endpoint requires authorization.</p>
   */
  @js.native
  trait AuthorizationConfig extends js.Object {
    var authorizationType: js.UndefOr[AuthorizationType]
    var awsIamConfig: js.UndefOr[AwsIamConfig]
  }

  object AuthorizationConfig {
    def apply(
      authorizationType: js.UndefOr[AuthorizationType] = js.undefined,
      awsIamConfig: js.UndefOr[AwsIamConfig] = js.undefined): AuthorizationConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "authorizationType" -> authorizationType.map { x => x.asInstanceOf[js.Any] },
        "awsIamConfig" -> awsIamConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AuthorizationConfig]
    }
  }

  object AuthorizationTypeEnum {
    val AWS_IAM = "AWS_IAM"

    val values = IndexedSeq(AWS_IAM)
  }

  /**
   * <p>The AWS IAM configuration.</p>
   */
  @js.native
  trait AwsIamConfig extends js.Object {
    var signingRegion: js.UndefOr[String]
    var signingServiceName: js.UndefOr[String]
  }

  object AwsIamConfig {
    def apply(
      signingRegion: js.UndefOr[String] = js.undefined,
      signingServiceName: js.UndefOr[String] = js.undefined): AwsIamConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "signingRegion" -> signingRegion.map { x => x.asInstanceOf[js.Any] },
        "signingServiceName" -> signingServiceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AwsIamConfig]
    }
  }

  @js.native
  trait CreateApiKeyRequest extends js.Object {
    var apiId: js.UndefOr[String]
    var description: js.UndefOr[String]
    var expires: js.UndefOr[Double]
  }

  object CreateApiKeyRequest {
    def apply(
      apiId: js.UndefOr[String] = js.undefined,
      description: js.UndefOr[String] = js.undefined,
      expires: js.UndefOr[Double] = js.undefined): CreateApiKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "apiId" -> apiId.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "expires" -> expires.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateApiKeyRequest]
    }
  }

  @js.native
  trait CreateApiKeyResponse extends js.Object {
    var apiKey: js.UndefOr[ApiKey]
  }

  object CreateApiKeyResponse {
    def apply(
      apiKey: js.UndefOr[ApiKey] = js.undefined): CreateApiKeyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "apiKey" -> apiKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateApiKeyResponse]
    }
  }

  @js.native
  trait CreateDataSourceRequest extends js.Object {
    var name: js.UndefOr[ResourceName]
    var elasticsearchConfig: js.UndefOr[ElasticsearchDataSourceConfig]
    var description: js.UndefOr[String]
    var serviceRoleArn: js.UndefOr[String]
    var relationalDatabaseConfig: js.UndefOr[RelationalDatabaseDataSourceConfig]
    var apiId: js.UndefOr[String]
    var dynamodbConfig: js.UndefOr[DynamodbDataSourceConfig]
    var `type`: js.UndefOr[DataSourceType]
    var lambdaConfig: js.UndefOr[LambdaDataSourceConfig]
    var httpConfig: js.UndefOr[HttpDataSourceConfig]
  }

  object CreateDataSourceRequest {
    def apply(
      name: js.UndefOr[ResourceName] = js.undefined,
      elasticsearchConfig: js.UndefOr[ElasticsearchDataSourceConfig] = js.undefined,
      description: js.UndefOr[String] = js.undefined,
      serviceRoleArn: js.UndefOr[String] = js.undefined,
      relationalDatabaseConfig: js.UndefOr[RelationalDatabaseDataSourceConfig] = js.undefined,
      apiId: js.UndefOr[String] = js.undefined,
      dynamodbConfig: js.UndefOr[DynamodbDataSourceConfig] = js.undefined,
      `type`: js.UndefOr[DataSourceType] = js.undefined,
      lambdaConfig: js.UndefOr[LambdaDataSourceConfig] = js.undefined,
      httpConfig: js.UndefOr[HttpDataSourceConfig] = js.undefined): CreateDataSourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "elasticsearchConfig" -> elasticsearchConfig.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "serviceRoleArn" -> serviceRoleArn.map { x => x.asInstanceOf[js.Any] },
        "relationalDatabaseConfig" -> relationalDatabaseConfig.map { x => x.asInstanceOf[js.Any] },
        "apiId" -> apiId.map { x => x.asInstanceOf[js.Any] },
        "dynamodbConfig" -> dynamodbConfig.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "lambdaConfig" -> lambdaConfig.map { x => x.asInstanceOf[js.Any] },
        "httpConfig" -> httpConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDataSourceRequest]
    }
  }

  @js.native
  trait CreateDataSourceResponse extends js.Object {
    var dataSource: js.UndefOr[DataSource]
  }

  object CreateDataSourceResponse {
    def apply(
      dataSource: js.UndefOr[DataSource] = js.undefined): CreateDataSourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "dataSource" -> dataSource.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateDataSourceResponse]
    }
  }

  @js.native
  trait CreateFunctionRequest extends js.Object {
    var name: js.UndefOr[ResourceName]
    var responseMappingTemplate: js.UndefOr[MappingTemplate]
    var requestMappingTemplate: js.UndefOr[MappingTemplate]
    var description: js.UndefOr[String]
    var functionVersion: js.UndefOr[String]
    var dataSourceName: js.UndefOr[ResourceName]
    var apiId: js.UndefOr[String]
  }

  object CreateFunctionRequest {
    def apply(
      name: js.UndefOr[ResourceName] = js.undefined,
      responseMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined,
      requestMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined,
      description: js.UndefOr[String] = js.undefined,
      functionVersion: js.UndefOr[String] = js.undefined,
      dataSourceName: js.UndefOr[ResourceName] = js.undefined,
      apiId: js.UndefOr[String] = js.undefined): CreateFunctionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "responseMappingTemplate" -> responseMappingTemplate.map { x => x.asInstanceOf[js.Any] },
        "requestMappingTemplate" -> requestMappingTemplate.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "functionVersion" -> functionVersion.map { x => x.asInstanceOf[js.Any] },
        "dataSourceName" -> dataSourceName.map { x => x.asInstanceOf[js.Any] },
        "apiId" -> apiId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFunctionRequest]
    }
  }

  @js.native
  trait CreateFunctionResponse extends js.Object {
    var functionConfiguration: js.UndefOr[FunctionConfiguration]
  }

  object CreateFunctionResponse {
    def apply(
      functionConfiguration: js.UndefOr[FunctionConfiguration] = js.undefined): CreateFunctionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "functionConfiguration" -> functionConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateFunctionResponse]
    }
  }

  @js.native
  trait CreateGraphqlApiRequest extends js.Object {
    var name: js.UndefOr[String]
    var authenticationType: js.UndefOr[AuthenticationType]
    var logConfig: js.UndefOr[LogConfig]
    var userPoolConfig: js.UndefOr[UserPoolConfig]
    var openIDConnectConfig: js.UndefOr[OpenIDConnectConfig]
  }

  object CreateGraphqlApiRequest {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      authenticationType: js.UndefOr[AuthenticationType] = js.undefined,
      logConfig: js.UndefOr[LogConfig] = js.undefined,
      userPoolConfig: js.UndefOr[UserPoolConfig] = js.undefined,
      openIDConnectConfig: js.UndefOr[OpenIDConnectConfig] = js.undefined): CreateGraphqlApiRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "authenticationType" -> authenticationType.map { x => x.asInstanceOf[js.Any] },
        "logConfig" -> logConfig.map { x => x.asInstanceOf[js.Any] },
        "userPoolConfig" -> userPoolConfig.map { x => x.asInstanceOf[js.Any] },
        "openIDConnectConfig" -> openIDConnectConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGraphqlApiRequest]
    }
  }

  @js.native
  trait CreateGraphqlApiResponse extends js.Object {
    var graphqlApi: js.UndefOr[GraphqlApi]
  }

  object CreateGraphqlApiResponse {
    def apply(
      graphqlApi: js.UndefOr[GraphqlApi] = js.undefined): CreateGraphqlApiResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "graphqlApi" -> graphqlApi.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateGraphqlApiResponse]
    }
  }

  @js.native
  trait CreateResolverRequest extends js.Object {
    var pipelineConfig: js.UndefOr[PipelineConfig]
    var responseMappingTemplate: js.UndefOr[MappingTemplate]
    var requestMappingTemplate: js.UndefOr[MappingTemplate]
    var typeName: js.UndefOr[ResourceName]
    var dataSourceName: js.UndefOr[ResourceName]
    var fieldName: js.UndefOr[ResourceName]
    var apiId: js.UndefOr[String]
    var kind: js.UndefOr[ResolverKind]
  }

  object CreateResolverRequest {
    def apply(
      pipelineConfig: js.UndefOr[PipelineConfig] = js.undefined,
      responseMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined,
      requestMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined,
      typeName: js.UndefOr[ResourceName] = js.undefined,
      dataSourceName: js.UndefOr[ResourceName] = js.undefined,
      fieldName: js.UndefOr[ResourceName] = js.undefined,
      apiId: js.UndefOr[String] = js.undefined,
      kind: js.UndefOr[ResolverKind] = js.undefined): CreateResolverRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pipelineConfig" -> pipelineConfig.map { x => x.asInstanceOf[js.Any] },
        "responseMappingTemplate" -> responseMappingTemplate.map { x => x.asInstanceOf[js.Any] },
        "requestMappingTemplate" -> requestMappingTemplate.map { x => x.asInstanceOf[js.Any] },
        "typeName" -> typeName.map { x => x.asInstanceOf[js.Any] },
        "dataSourceName" -> dataSourceName.map { x => x.asInstanceOf[js.Any] },
        "fieldName" -> fieldName.map { x => x.asInstanceOf[js.Any] },
        "apiId" -> apiId.map { x => x.asInstanceOf[js.Any] },
        "kind" -> kind.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateResolverRequest]
    }
  }

  @js.native
  trait CreateResolverResponse extends js.Object {
    var resolver: js.UndefOr[Resolver]
  }

  object CreateResolverResponse {
    def apply(
      resolver: js.UndefOr[Resolver] = js.undefined): CreateResolverResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resolver" -> resolver.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateResolverResponse]
    }
  }

  @js.native
  trait CreateTypeRequest extends js.Object {
    var apiId: js.UndefOr[String]
    var definition: js.UndefOr[String]
    var format: js.UndefOr[TypeDefinitionFormat]
  }

  object CreateTypeRequest {
    def apply(
      apiId: js.UndefOr[String] = js.undefined,
      definition: js.UndefOr[String] = js.undefined,
      format: js.UndefOr[TypeDefinitionFormat] = js.undefined): CreateTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "apiId" -> apiId.map { x => x.asInstanceOf[js.Any] },
        "definition" -> definition.map { x => x.asInstanceOf[js.Any] },
        "format" -> format.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTypeRequest]
    }
  }

  @js.native
  trait CreateTypeResponse extends js.Object {
    var `type`: js.UndefOr[Type]
  }

  object CreateTypeResponse {
    def apply(
      `type`: js.UndefOr[Type] = js.undefined): CreateTypeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTypeResponse]
    }
  }

  /**
   * <p>Describes a data source.</p>
   */
  @js.native
  trait DataSource extends js.Object {
    var name: js.UndefOr[ResourceName]
    var elasticsearchConfig: js.UndefOr[ElasticsearchDataSourceConfig]
    var description: js.UndefOr[String]
    var dataSourceArn: js.UndefOr[String]
    var serviceRoleArn: js.UndefOr[String]
    var relationalDatabaseConfig: js.UndefOr[RelationalDatabaseDataSourceConfig]
    var dynamodbConfig: js.UndefOr[DynamodbDataSourceConfig]
    var `type`: js.UndefOr[DataSourceType]
    var lambdaConfig: js.UndefOr[LambdaDataSourceConfig]
    var httpConfig: js.UndefOr[HttpDataSourceConfig]
  }

  object DataSource {
    def apply(
      name: js.UndefOr[ResourceName] = js.undefined,
      elasticsearchConfig: js.UndefOr[ElasticsearchDataSourceConfig] = js.undefined,
      description: js.UndefOr[String] = js.undefined,
      dataSourceArn: js.UndefOr[String] = js.undefined,
      serviceRoleArn: js.UndefOr[String] = js.undefined,
      relationalDatabaseConfig: js.UndefOr[RelationalDatabaseDataSourceConfig] = js.undefined,
      dynamodbConfig: js.UndefOr[DynamodbDataSourceConfig] = js.undefined,
      `type`: js.UndefOr[DataSourceType] = js.undefined,
      lambdaConfig: js.UndefOr[LambdaDataSourceConfig] = js.undefined,
      httpConfig: js.UndefOr[HttpDataSourceConfig] = js.undefined): DataSource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "elasticsearchConfig" -> elasticsearchConfig.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "dataSourceArn" -> dataSourceArn.map { x => x.asInstanceOf[js.Any] },
        "serviceRoleArn" -> serviceRoleArn.map { x => x.asInstanceOf[js.Any] },
        "relationalDatabaseConfig" -> relationalDatabaseConfig.map { x => x.asInstanceOf[js.Any] },
        "dynamodbConfig" -> dynamodbConfig.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "lambdaConfig" -> lambdaConfig.map { x => x.asInstanceOf[js.Any] },
        "httpConfig" -> httpConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DataSource]
    }
  }

  object DataSourceTypeEnum {
    val AWS_LAMBDA = "AWS_LAMBDA"
    val AMAZON_DYNAMODB = "AMAZON_DYNAMODB"
    val AMAZON_ELASTICSEARCH = "AMAZON_ELASTICSEARCH"
    val NONE = "NONE"
    val HTTP = "HTTP"
    val RELATIONAL_DATABASE = "RELATIONAL_DATABASE"

    val values = IndexedSeq(AWS_LAMBDA, AMAZON_DYNAMODB, AMAZON_ELASTICSEARCH, NONE, HTTP, RELATIONAL_DATABASE)
  }

  object DefaultActionEnum {
    val ALLOW = "ALLOW"
    val DENY = "DENY"

    val values = IndexedSeq(ALLOW, DENY)
  }

  @js.native
  trait DeleteApiKeyRequest extends js.Object {
    var apiId: js.UndefOr[String]
    var id: js.UndefOr[String]
  }

  object DeleteApiKeyRequest {
    def apply(
      apiId: js.UndefOr[String] = js.undefined,
      id: js.UndefOr[String] = js.undefined): DeleteApiKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "apiId" -> apiId.map { x => x.asInstanceOf[js.Any] },
        "id" -> id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApiKeyRequest]
    }
  }

  @js.native
  trait DeleteApiKeyResponse extends js.Object {

  }

  object DeleteApiKeyResponse {
    def apply(): DeleteApiKeyResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteApiKeyResponse]
    }
  }

  @js.native
  trait DeleteDataSourceRequest extends js.Object {
    var apiId: js.UndefOr[String]
    var name: js.UndefOr[ResourceName]
  }

  object DeleteDataSourceRequest {
    def apply(
      apiId: js.UndefOr[String] = js.undefined,
      name: js.UndefOr[ResourceName] = js.undefined): DeleteDataSourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "apiId" -> apiId.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDataSourceRequest]
    }
  }

  @js.native
  trait DeleteDataSourceResponse extends js.Object {

  }

  object DeleteDataSourceResponse {
    def apply(): DeleteDataSourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDataSourceResponse]
    }
  }

  @js.native
  trait DeleteFunctionRequest extends js.Object {
    var apiId: js.UndefOr[String]
    var functionId: js.UndefOr[ResourceName]
  }

  object DeleteFunctionRequest {
    def apply(
      apiId: js.UndefOr[String] = js.undefined,
      functionId: js.UndefOr[ResourceName] = js.undefined): DeleteFunctionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "apiId" -> apiId.map { x => x.asInstanceOf[js.Any] },
        "functionId" -> functionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFunctionRequest]
    }
  }

  @js.native
  trait DeleteFunctionResponse extends js.Object {

  }

  object DeleteFunctionResponse {
    def apply(): DeleteFunctionResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteFunctionResponse]
    }
  }

  @js.native
  trait DeleteGraphqlApiRequest extends js.Object {
    var apiId: js.UndefOr[String]
  }

  object DeleteGraphqlApiRequest {
    def apply(
      apiId: js.UndefOr[String] = js.undefined): DeleteGraphqlApiRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "apiId" -> apiId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGraphqlApiRequest]
    }
  }

  @js.native
  trait DeleteGraphqlApiResponse extends js.Object {

  }

  object DeleteGraphqlApiResponse {
    def apply(): DeleteGraphqlApiResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteGraphqlApiResponse]
    }
  }

  @js.native
  trait DeleteResolverRequest extends js.Object {
    var apiId: js.UndefOr[String]
    var typeName: js.UndefOr[ResourceName]
    var fieldName: js.UndefOr[ResourceName]
  }

  object DeleteResolverRequest {
    def apply(
      apiId: js.UndefOr[String] = js.undefined,
      typeName: js.UndefOr[ResourceName] = js.undefined,
      fieldName: js.UndefOr[ResourceName] = js.undefined): DeleteResolverRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "apiId" -> apiId.map { x => x.asInstanceOf[js.Any] },
        "typeName" -> typeName.map { x => x.asInstanceOf[js.Any] },
        "fieldName" -> fieldName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteResolverRequest]
    }
  }

  @js.native
  trait DeleteResolverResponse extends js.Object {

  }

  object DeleteResolverResponse {
    def apply(): DeleteResolverResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteResolverResponse]
    }
  }

  @js.native
  trait DeleteTypeRequest extends js.Object {
    var apiId: js.UndefOr[String]
    var typeName: js.UndefOr[ResourceName]
  }

  object DeleteTypeRequest {
    def apply(
      apiId: js.UndefOr[String] = js.undefined,
      typeName: js.UndefOr[ResourceName] = js.undefined): DeleteTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "apiId" -> apiId.map { x => x.asInstanceOf[js.Any] },
        "typeName" -> typeName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTypeRequest]
    }
  }

  @js.native
  trait DeleteTypeResponse extends js.Object {

  }

  object DeleteTypeResponse {
    def apply(): DeleteTypeResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTypeResponse]
    }
  }

  /**
   * <p>Describes an Amazon DynamoDB data source configuration.</p>
   */
  @js.native
  trait DynamodbDataSourceConfig extends js.Object {
    var tableName: js.UndefOr[String]
    var awsRegion: js.UndefOr[String]
    var useCallerCredentials: js.UndefOr[Boolean]
  }

  object DynamodbDataSourceConfig {
    def apply(
      tableName: js.UndefOr[String] = js.undefined,
      awsRegion: js.UndefOr[String] = js.undefined,
      useCallerCredentials: js.UndefOr[Boolean] = js.undefined): DynamodbDataSourceConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "tableName" -> tableName.map { x => x.asInstanceOf[js.Any] },
        "awsRegion" -> awsRegion.map { x => x.asInstanceOf[js.Any] },
        "useCallerCredentials" -> useCallerCredentials.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DynamodbDataSourceConfig]
    }
  }

  /**
   * <p>Describes an Elasticsearch data source configuration.</p>
   */
  @js.native
  trait ElasticsearchDataSourceConfig extends js.Object {
    var endpoint: js.UndefOr[String]
    var awsRegion: js.UndefOr[String]
  }

  object ElasticsearchDataSourceConfig {
    def apply(
      endpoint: js.UndefOr[String] = js.undefined,
      awsRegion: js.UndefOr[String] = js.undefined): ElasticsearchDataSourceConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "endpoint" -> endpoint.map { x => x.asInstanceOf[js.Any] },
        "awsRegion" -> awsRegion.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ElasticsearchDataSourceConfig]
    }
  }

  object FieldLogLevelEnum {
    val NONE = "NONE"
    val ERROR = "ERROR"
    val ALL = "ALL"

    val values = IndexedSeq(NONE, ERROR, ALL)
  }

  /**
   * <p>A function is a reusable entity. Multiple functions can be used to compose the resolver logic.</p>
   */
  @js.native
  trait FunctionConfiguration extends js.Object {
    var name: js.UndefOr[ResourceName]
    var responseMappingTemplate: js.UndefOr[MappingTemplate]
    var requestMappingTemplate: js.UndefOr[MappingTemplate]
    var functionId: js.UndefOr[String]
    var description: js.UndefOr[String]
    var functionVersion: js.UndefOr[String]
    var dataSourceName: js.UndefOr[ResourceName]
    var functionArn: js.UndefOr[String]
  }

  object FunctionConfiguration {
    def apply(
      name: js.UndefOr[ResourceName] = js.undefined,
      responseMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined,
      requestMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined,
      functionId: js.UndefOr[String] = js.undefined,
      description: js.UndefOr[String] = js.undefined,
      functionVersion: js.UndefOr[String] = js.undefined,
      dataSourceName: js.UndefOr[ResourceName] = js.undefined,
      functionArn: js.UndefOr[String] = js.undefined): FunctionConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "responseMappingTemplate" -> responseMappingTemplate.map { x => x.asInstanceOf[js.Any] },
        "requestMappingTemplate" -> requestMappingTemplate.map { x => x.asInstanceOf[js.Any] },
        "functionId" -> functionId.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "functionVersion" -> functionVersion.map { x => x.asInstanceOf[js.Any] },
        "dataSourceName" -> dataSourceName.map { x => x.asInstanceOf[js.Any] },
        "functionArn" -> functionArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FunctionConfiguration]
    }
  }

  @js.native
  trait GetDataSourceRequest extends js.Object {
    var apiId: js.UndefOr[String]
    var name: js.UndefOr[ResourceName]
  }

  object GetDataSourceRequest {
    def apply(
      apiId: js.UndefOr[String] = js.undefined,
      name: js.UndefOr[ResourceName] = js.undefined): GetDataSourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "apiId" -> apiId.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDataSourceRequest]
    }
  }

  @js.native
  trait GetDataSourceResponse extends js.Object {
    var dataSource: js.UndefOr[DataSource]
  }

  object GetDataSourceResponse {
    def apply(
      dataSource: js.UndefOr[DataSource] = js.undefined): GetDataSourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "dataSource" -> dataSource.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDataSourceResponse]
    }
  }

  @js.native
  trait GetFunctionRequest extends js.Object {
    var apiId: js.UndefOr[String]
    var functionId: js.UndefOr[ResourceName]
  }

  object GetFunctionRequest {
    def apply(
      apiId: js.UndefOr[String] = js.undefined,
      functionId: js.UndefOr[ResourceName] = js.undefined): GetFunctionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "apiId" -> apiId.map { x => x.asInstanceOf[js.Any] },
        "functionId" -> functionId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFunctionRequest]
    }
  }

  @js.native
  trait GetFunctionResponse extends js.Object {
    var functionConfiguration: js.UndefOr[FunctionConfiguration]
  }

  object GetFunctionResponse {
    def apply(
      functionConfiguration: js.UndefOr[FunctionConfiguration] = js.undefined): GetFunctionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "functionConfiguration" -> functionConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetFunctionResponse]
    }
  }

  @js.native
  trait GetGraphqlApiRequest extends js.Object {
    var apiId: js.UndefOr[String]
  }

  object GetGraphqlApiRequest {
    def apply(
      apiId: js.UndefOr[String] = js.undefined): GetGraphqlApiRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "apiId" -> apiId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGraphqlApiRequest]
    }
  }

  @js.native
  trait GetGraphqlApiResponse extends js.Object {
    var graphqlApi: js.UndefOr[GraphqlApi]
  }

  object GetGraphqlApiResponse {
    def apply(
      graphqlApi: js.UndefOr[GraphqlApi] = js.undefined): GetGraphqlApiResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "graphqlApi" -> graphqlApi.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetGraphqlApiResponse]
    }
  }

  @js.native
  trait GetIntrospectionSchemaRequest extends js.Object {
    var apiId: js.UndefOr[String]
    var format: js.UndefOr[OutputType]
  }

  object GetIntrospectionSchemaRequest {
    def apply(
      apiId: js.UndefOr[String] = js.undefined,
      format: js.UndefOr[OutputType] = js.undefined): GetIntrospectionSchemaRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "apiId" -> apiId.map { x => x.asInstanceOf[js.Any] },
        "format" -> format.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIntrospectionSchemaRequest]
    }
  }

  @js.native
  trait GetIntrospectionSchemaResponse extends js.Object {
    var schema: js.UndefOr[Blob]
  }

  object GetIntrospectionSchemaResponse {
    def apply(
      schema: js.UndefOr[Blob] = js.undefined): GetIntrospectionSchemaResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "schema" -> schema.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetIntrospectionSchemaResponse]
    }
  }

  @js.native
  trait GetResolverRequest extends js.Object {
    var apiId: js.UndefOr[String]
    var typeName: js.UndefOr[ResourceName]
    var fieldName: js.UndefOr[ResourceName]
  }

  object GetResolverRequest {
    def apply(
      apiId: js.UndefOr[String] = js.undefined,
      typeName: js.UndefOr[ResourceName] = js.undefined,
      fieldName: js.UndefOr[ResourceName] = js.undefined): GetResolverRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "apiId" -> apiId.map { x => x.asInstanceOf[js.Any] },
        "typeName" -> typeName.map { x => x.asInstanceOf[js.Any] },
        "fieldName" -> fieldName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResolverRequest]
    }
  }

  @js.native
  trait GetResolverResponse extends js.Object {
    var resolver: js.UndefOr[Resolver]
  }

  object GetResolverResponse {
    def apply(
      resolver: js.UndefOr[Resolver] = js.undefined): GetResolverResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resolver" -> resolver.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResolverResponse]
    }
  }

  @js.native
  trait GetSchemaCreationStatusRequest extends js.Object {
    var apiId: js.UndefOr[String]
  }

  object GetSchemaCreationStatusRequest {
    def apply(
      apiId: js.UndefOr[String] = js.undefined): GetSchemaCreationStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "apiId" -> apiId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSchemaCreationStatusRequest]
    }
  }

  @js.native
  trait GetSchemaCreationStatusResponse extends js.Object {
    var status: js.UndefOr[SchemaStatus]
    var details: js.UndefOr[String]
  }

  object GetSchemaCreationStatusResponse {
    def apply(
      status: js.UndefOr[SchemaStatus] = js.undefined,
      details: js.UndefOr[String] = js.undefined): GetSchemaCreationStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "details" -> details.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetSchemaCreationStatusResponse]
    }
  }

  @js.native
  trait GetTypeRequest extends js.Object {
    var apiId: js.UndefOr[String]
    var typeName: js.UndefOr[ResourceName]
    var format: js.UndefOr[TypeDefinitionFormat]
  }

  object GetTypeRequest {
    def apply(
      apiId: js.UndefOr[String] = js.undefined,
      typeName: js.UndefOr[ResourceName] = js.undefined,
      format: js.UndefOr[TypeDefinitionFormat] = js.undefined): GetTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "apiId" -> apiId.map { x => x.asInstanceOf[js.Any] },
        "typeName" -> typeName.map { x => x.asInstanceOf[js.Any] },
        "format" -> format.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTypeRequest]
    }
  }

  @js.native
  trait GetTypeResponse extends js.Object {
    var `type`: js.UndefOr[Type]
  }

  object GetTypeResponse {
    def apply(
      `type`: js.UndefOr[Type] = js.undefined): GetTypeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTypeResponse]
    }
  }

  /**
   * <p>Describes a GraphQL API.</p>
   */
  @js.native
  trait GraphqlApi extends js.Object {
    var arn: js.UndefOr[String]
    var name: js.UndefOr[ResourceName]
    var authenticationType: js.UndefOr[AuthenticationType]
    var logConfig: js.UndefOr[LogConfig]
    var userPoolConfig: js.UndefOr[UserPoolConfig]
    var uris: js.UndefOr[MapOfStringToString]
    var apiId: js.UndefOr[String]
    var openIDConnectConfig: js.UndefOr[OpenIDConnectConfig]
  }

  object GraphqlApi {
    def apply(
      arn: js.UndefOr[String] = js.undefined,
      name: js.UndefOr[ResourceName] = js.undefined,
      authenticationType: js.UndefOr[AuthenticationType] = js.undefined,
      logConfig: js.UndefOr[LogConfig] = js.undefined,
      userPoolConfig: js.UndefOr[UserPoolConfig] = js.undefined,
      uris: js.UndefOr[MapOfStringToString] = js.undefined,
      apiId: js.UndefOr[String] = js.undefined,
      openIDConnectConfig: js.UndefOr[OpenIDConnectConfig] = js.undefined): GraphqlApi = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "authenticationType" -> authenticationType.map { x => x.asInstanceOf[js.Any] },
        "logConfig" -> logConfig.map { x => x.asInstanceOf[js.Any] },
        "userPoolConfig" -> userPoolConfig.map { x => x.asInstanceOf[js.Any] },
        "uris" -> uris.map { x => x.asInstanceOf[js.Any] },
        "apiId" -> apiId.map { x => x.asInstanceOf[js.Any] },
        "openIDConnectConfig" -> openIDConnectConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GraphqlApi]
    }
  }

  /**
   * <p>Describes an HTTP data source configuration.</p>
   */
  @js.native
  trait HttpDataSourceConfig extends js.Object {
    var endpoint: js.UndefOr[String]
    var authorizationConfig: js.UndefOr[AuthorizationConfig]
  }

  object HttpDataSourceConfig {
    def apply(
      endpoint: js.UndefOr[String] = js.undefined,
      authorizationConfig: js.UndefOr[AuthorizationConfig] = js.undefined): HttpDataSourceConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "endpoint" -> endpoint.map { x => x.asInstanceOf[js.Any] },
        "authorizationConfig" -> authorizationConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HttpDataSourceConfig]
    }
  }

  /**
   * <p>Describes an AWS Lambda data source configuration.</p>
   */
  @js.native
  trait LambdaDataSourceConfig extends js.Object {
    var lambdaFunctionArn: js.UndefOr[String]
  }

  object LambdaDataSourceConfig {
    def apply(
      lambdaFunctionArn: js.UndefOr[String] = js.undefined): LambdaDataSourceConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "lambdaFunctionArn" -> lambdaFunctionArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LambdaDataSourceConfig]
    }
  }

  @js.native
  trait ListApiKeysRequest extends js.Object {
    var apiId: js.UndefOr[String]
    var nextToken: js.UndefOr[PaginationToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object ListApiKeysRequest {
    def apply(
      apiId: js.UndefOr[String] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): ListApiKeysRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "apiId" -> apiId.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListApiKeysRequest]
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
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListApiKeysResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "apiKeys" -> apiKeys.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListApiKeysResponse]
    }
  }

  @js.native
  trait ListDataSourcesRequest extends js.Object {
    var apiId: js.UndefOr[String]
    var nextToken: js.UndefOr[PaginationToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object ListDataSourcesRequest {
    def apply(
      apiId: js.UndefOr[String] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): ListDataSourcesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "apiId" -> apiId.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDataSourcesRequest]
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
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListDataSourcesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "dataSources" -> dataSources.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDataSourcesResponse]
    }
  }

  @js.native
  trait ListFunctionsRequest extends js.Object {
    var apiId: js.UndefOr[String]
    var nextToken: js.UndefOr[PaginationToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object ListFunctionsRequest {
    def apply(
      apiId: js.UndefOr[String] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): ListFunctionsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "apiId" -> apiId.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFunctionsRequest]
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
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListFunctionsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "functions" -> functions.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFunctionsResponse]
    }
  }

  @js.native
  trait ListGraphqlApisRequest extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object ListGraphqlApisRequest {
    def apply(
      nextToken: js.UndefOr[PaginationToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): ListGraphqlApisRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGraphqlApisRequest]
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
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListGraphqlApisResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "graphqlApis" -> graphqlApis.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListGraphqlApisResponse]
    }
  }

  @js.native
  trait ListResolversByFunctionRequest extends js.Object {
    var apiId: js.UndefOr[String]
    var functionId: js.UndefOr[String]
    var nextToken: js.UndefOr[PaginationToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object ListResolversByFunctionRequest {
    def apply(
      apiId: js.UndefOr[String] = js.undefined,
      functionId: js.UndefOr[String] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): ListResolversByFunctionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "apiId" -> apiId.map { x => x.asInstanceOf[js.Any] },
        "functionId" -> functionId.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResolversByFunctionRequest]
    }
  }

  @js.native
  trait ListResolversByFunctionResponse extends js.Object {
    var resolvers: js.UndefOr[Resolvers]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListResolversByFunctionResponse {
    def apply(
      resolvers: js.UndefOr[Resolvers] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListResolversByFunctionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resolvers" -> resolvers.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResolversByFunctionResponse]
    }
  }

  @js.native
  trait ListResolversRequest extends js.Object {
    var apiId: js.UndefOr[String]
    var typeName: js.UndefOr[String]
    var nextToken: js.UndefOr[PaginationToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object ListResolversRequest {
    def apply(
      apiId: js.UndefOr[String] = js.undefined,
      typeName: js.UndefOr[String] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): ListResolversRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "apiId" -> apiId.map { x => x.asInstanceOf[js.Any] },
        "typeName" -> typeName.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResolversRequest]
    }
  }

  @js.native
  trait ListResolversResponse extends js.Object {
    var resolvers: js.UndefOr[Resolvers]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListResolversResponse {
    def apply(
      resolvers: js.UndefOr[Resolvers] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListResolversResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resolvers" -> resolvers.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListResolversResponse]
    }
  }

  @js.native
  trait ListTypesRequest extends js.Object {
    var apiId: js.UndefOr[String]
    var format: js.UndefOr[TypeDefinitionFormat]
    var nextToken: js.UndefOr[PaginationToken]
    var maxResults: js.UndefOr[MaxResults]
  }

  object ListTypesRequest {
    def apply(
      apiId: js.UndefOr[String] = js.undefined,
      format: js.UndefOr[TypeDefinitionFormat] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined,
      maxResults: js.UndefOr[MaxResults] = js.undefined): ListTypesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "apiId" -> apiId.map { x => x.asInstanceOf[js.Any] },
        "format" -> format.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "maxResults" -> maxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTypesRequest]
    }
  }

  @js.native
  trait ListTypesResponse extends js.Object {
    var types: js.UndefOr[TypeList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListTypesResponse {
    def apply(
      types: js.UndefOr[TypeList] = js.undefined,
      nextToken: js.UndefOr[PaginationToken] = js.undefined): ListTypesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "types" -> types.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTypesResponse]
    }
  }

  /**
   * <p>The CloudWatch Logs configuration.</p>
   */
  @js.native
  trait LogConfig extends js.Object {
    var fieldLogLevel: js.UndefOr[FieldLogLevel]
    var cloudWatchLogsRoleArn: js.UndefOr[String]
  }

  object LogConfig {
    def apply(
      fieldLogLevel: js.UndefOr[FieldLogLevel] = js.undefined,
      cloudWatchLogsRoleArn: js.UndefOr[String] = js.undefined): LogConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "fieldLogLevel" -> fieldLogLevel.map { x => x.asInstanceOf[js.Any] },
        "cloudWatchLogsRoleArn" -> cloudWatchLogsRoleArn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LogConfig]
    }
  }

  /**
   * <p>Describes an OpenID Connect configuration.</p>
   */
  @js.native
  trait OpenIDConnectConfig extends js.Object {
    var issuer: js.UndefOr[String]
    var clientId: js.UndefOr[String]
    var iatTTL: js.UndefOr[Double]
    var authTTL: js.UndefOr[Double]
  }

  object OpenIDConnectConfig {
    def apply(
      issuer: js.UndefOr[String] = js.undefined,
      clientId: js.UndefOr[String] = js.undefined,
      iatTTL: js.UndefOr[Double] = js.undefined,
      authTTL: js.UndefOr[Double] = js.undefined): OpenIDConnectConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "issuer" -> issuer.map { x => x.asInstanceOf[js.Any] },
        "clientId" -> clientId.map { x => x.asInstanceOf[js.Any] },
        "iatTTL" -> iatTTL.map { x => x.asInstanceOf[js.Any] },
        "authTTL" -> authTTL.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OpenIDConnectConfig]
    }
  }

  object OutputTypeEnum {
    val SDL = "SDL"
    val JSON = "JSON"

    val values = IndexedSeq(SDL, JSON)
  }

  /**
   * <p>The pipeline configuration for a resolver of kind <code>PIPELINE</code>.</p>
   */
  @js.native
  trait PipelineConfig extends js.Object {
    var functions: js.UndefOr[FunctionsIds]
  }

  object PipelineConfig {
    def apply(
      functions: js.UndefOr[FunctionsIds] = js.undefined): PipelineConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "functions" -> functions.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PipelineConfig]
    }
  }

  /**
   * <p>The Amazon RDS HTTP endpoint configuration.</p>
   */
  @js.native
  trait RdsHttpEndpointConfig extends js.Object {
    var dbClusterIdentifier: js.UndefOr[String]
    var awsRegion: js.UndefOr[String]
    var awsSecretStoreArn: js.UndefOr[String]
    var schema: js.UndefOr[String]
    var databaseName: js.UndefOr[String]
  }

  object RdsHttpEndpointConfig {
    def apply(
      dbClusterIdentifier: js.UndefOr[String] = js.undefined,
      awsRegion: js.UndefOr[String] = js.undefined,
      awsSecretStoreArn: js.UndefOr[String] = js.undefined,
      schema: js.UndefOr[String] = js.undefined,
      databaseName: js.UndefOr[String] = js.undefined): RdsHttpEndpointConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "dbClusterIdentifier" -> dbClusterIdentifier.map { x => x.asInstanceOf[js.Any] },
        "awsRegion" -> awsRegion.map { x => x.asInstanceOf[js.Any] },
        "awsSecretStoreArn" -> awsSecretStoreArn.map { x => x.asInstanceOf[js.Any] },
        "schema" -> schema.map { x => x.asInstanceOf[js.Any] },
        "databaseName" -> databaseName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RdsHttpEndpointConfig]
    }
  }

  /**
   * <p>Describes a relational database data source configuration.</p>
   */
  @js.native
  trait RelationalDatabaseDataSourceConfig extends js.Object {
    var relationalDatabaseSourceType: js.UndefOr[RelationalDatabaseSourceType]
    var rdsHttpEndpointConfig: js.UndefOr[RdsHttpEndpointConfig]
  }

  object RelationalDatabaseDataSourceConfig {
    def apply(
      relationalDatabaseSourceType: js.UndefOr[RelationalDatabaseSourceType] = js.undefined,
      rdsHttpEndpointConfig: js.UndefOr[RdsHttpEndpointConfig] = js.undefined): RelationalDatabaseDataSourceConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "relationalDatabaseSourceType" -> relationalDatabaseSourceType.map { x => x.asInstanceOf[js.Any] },
        "rdsHttpEndpointConfig" -> rdsHttpEndpointConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RelationalDatabaseDataSourceConfig]
    }
  }

  object RelationalDatabaseSourceTypeEnum {
    val RDS_HTTP_ENDPOINT = "RDS_HTTP_ENDPOINT"

    val values = IndexedSeq(RDS_HTTP_ENDPOINT)
  }

  /**
   * <p>Describes a resolver.</p>
   */
  @js.native
  trait Resolver extends js.Object {
    var pipelineConfig: js.UndefOr[PipelineConfig]
    var responseMappingTemplate: js.UndefOr[MappingTemplate]
    var requestMappingTemplate: js.UndefOr[MappingTemplate]
    var typeName: js.UndefOr[ResourceName]
    var dataSourceName: js.UndefOr[ResourceName]
    var fieldName: js.UndefOr[ResourceName]
    var resolverArn: js.UndefOr[String]
    var kind: js.UndefOr[ResolverKind]
  }

  object Resolver {
    def apply(
      pipelineConfig: js.UndefOr[PipelineConfig] = js.undefined,
      responseMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined,
      requestMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined,
      typeName: js.UndefOr[ResourceName] = js.undefined,
      dataSourceName: js.UndefOr[ResourceName] = js.undefined,
      fieldName: js.UndefOr[ResourceName] = js.undefined,
      resolverArn: js.UndefOr[String] = js.undefined,
      kind: js.UndefOr[ResolverKind] = js.undefined): Resolver = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pipelineConfig" -> pipelineConfig.map { x => x.asInstanceOf[js.Any] },
        "responseMappingTemplate" -> responseMappingTemplate.map { x => x.asInstanceOf[js.Any] },
        "requestMappingTemplate" -> requestMappingTemplate.map { x => x.asInstanceOf[js.Any] },
        "typeName" -> typeName.map { x => x.asInstanceOf[js.Any] },
        "dataSourceName" -> dataSourceName.map { x => x.asInstanceOf[js.Any] },
        "fieldName" -> fieldName.map { x => x.asInstanceOf[js.Any] },
        "resolverArn" -> resolverArn.map { x => x.asInstanceOf[js.Any] },
        "kind" -> kind.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Resolver]
    }
  }

  object ResolverKindEnum {
    val UNIT = "UNIT"
    val PIPELINE = "PIPELINE"

    val values = IndexedSeq(UNIT, PIPELINE)
  }

  object SchemaStatusEnum {
    val PROCESSING = "PROCESSING"
    val ACTIVE = "ACTIVE"
    val DELETING = "DELETING"

    val values = IndexedSeq(PROCESSING, ACTIVE, DELETING)
  }

  @js.native
  trait StartSchemaCreationRequest extends js.Object {
    var apiId: js.UndefOr[String]
    var definition: js.UndefOr[Blob]
  }

  object StartSchemaCreationRequest {
    def apply(
      apiId: js.UndefOr[String] = js.undefined,
      definition: js.UndefOr[Blob] = js.undefined): StartSchemaCreationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "apiId" -> apiId.map { x => x.asInstanceOf[js.Any] },
        "definition" -> definition.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartSchemaCreationRequest]
    }
  }

  @js.native
  trait StartSchemaCreationResponse extends js.Object {
    var status: js.UndefOr[SchemaStatus]
  }

  object StartSchemaCreationResponse {
    def apply(
      status: js.UndefOr[SchemaStatus] = js.undefined): StartSchemaCreationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartSchemaCreationResponse]
    }
  }

  /**
   * <p>Describes a type.</p>
   */
  @js.native
  trait Type extends js.Object {
    var format: js.UndefOr[TypeDefinitionFormat]
    var arn: js.UndefOr[String]
    var name: js.UndefOr[ResourceName]
    var description: js.UndefOr[String]
    var definition: js.UndefOr[String]
  }

  object Type {
    def apply(
      format: js.UndefOr[TypeDefinitionFormat] = js.undefined,
      arn: js.UndefOr[String] = js.undefined,
      name: js.UndefOr[ResourceName] = js.undefined,
      description: js.UndefOr[String] = js.undefined,
      definition: js.UndefOr[String] = js.undefined): Type = {
      val _fields = IndexedSeq[(String, js.Any)](
        "format" -> format.map { x => x.asInstanceOf[js.Any] },
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "definition" -> definition.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Type]
    }
  }

  object TypeDefinitionFormatEnum {
    val SDL = "SDL"
    val JSON = "JSON"

    val values = IndexedSeq(SDL, JSON)
  }

  @js.native
  trait UpdateApiKeyRequest extends js.Object {
    var apiId: js.UndefOr[String]
    var id: js.UndefOr[String]
    var description: js.UndefOr[String]
    var expires: js.UndefOr[Double]
  }

  object UpdateApiKeyRequest {
    def apply(
      apiId: js.UndefOr[String] = js.undefined,
      id: js.UndefOr[String] = js.undefined,
      description: js.UndefOr[String] = js.undefined,
      expires: js.UndefOr[Double] = js.undefined): UpdateApiKeyRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "apiId" -> apiId.map { x => x.asInstanceOf[js.Any] },
        "id" -> id.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "expires" -> expires.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateApiKeyRequest]
    }
  }

  @js.native
  trait UpdateApiKeyResponse extends js.Object {
    var apiKey: js.UndefOr[ApiKey]
  }

  object UpdateApiKeyResponse {
    def apply(
      apiKey: js.UndefOr[ApiKey] = js.undefined): UpdateApiKeyResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "apiKey" -> apiKey.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateApiKeyResponse]
    }
  }

  @js.native
  trait UpdateDataSourceRequest extends js.Object {
    var name: js.UndefOr[ResourceName]
    var elasticsearchConfig: js.UndefOr[ElasticsearchDataSourceConfig]
    var description: js.UndefOr[String]
    var serviceRoleArn: js.UndefOr[String]
    var relationalDatabaseConfig: js.UndefOr[RelationalDatabaseDataSourceConfig]
    var apiId: js.UndefOr[String]
    var dynamodbConfig: js.UndefOr[DynamodbDataSourceConfig]
    var `type`: js.UndefOr[DataSourceType]
    var lambdaConfig: js.UndefOr[LambdaDataSourceConfig]
    var httpConfig: js.UndefOr[HttpDataSourceConfig]
  }

  object UpdateDataSourceRequest {
    def apply(
      name: js.UndefOr[ResourceName] = js.undefined,
      elasticsearchConfig: js.UndefOr[ElasticsearchDataSourceConfig] = js.undefined,
      description: js.UndefOr[String] = js.undefined,
      serviceRoleArn: js.UndefOr[String] = js.undefined,
      relationalDatabaseConfig: js.UndefOr[RelationalDatabaseDataSourceConfig] = js.undefined,
      apiId: js.UndefOr[String] = js.undefined,
      dynamodbConfig: js.UndefOr[DynamodbDataSourceConfig] = js.undefined,
      `type`: js.UndefOr[DataSourceType] = js.undefined,
      lambdaConfig: js.UndefOr[LambdaDataSourceConfig] = js.undefined,
      httpConfig: js.UndefOr[HttpDataSourceConfig] = js.undefined): UpdateDataSourceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "elasticsearchConfig" -> elasticsearchConfig.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "serviceRoleArn" -> serviceRoleArn.map { x => x.asInstanceOf[js.Any] },
        "relationalDatabaseConfig" -> relationalDatabaseConfig.map { x => x.asInstanceOf[js.Any] },
        "apiId" -> apiId.map { x => x.asInstanceOf[js.Any] },
        "dynamodbConfig" -> dynamodbConfig.map { x => x.asInstanceOf[js.Any] },
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] },
        "lambdaConfig" -> lambdaConfig.map { x => x.asInstanceOf[js.Any] },
        "httpConfig" -> httpConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDataSourceRequest]
    }
  }

  @js.native
  trait UpdateDataSourceResponse extends js.Object {
    var dataSource: js.UndefOr[DataSource]
  }

  object UpdateDataSourceResponse {
    def apply(
      dataSource: js.UndefOr[DataSource] = js.undefined): UpdateDataSourceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "dataSource" -> dataSource.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDataSourceResponse]
    }
  }

  @js.native
  trait UpdateFunctionRequest extends js.Object {
    var name: js.UndefOr[ResourceName]
    var responseMappingTemplate: js.UndefOr[MappingTemplate]
    var requestMappingTemplate: js.UndefOr[MappingTemplate]
    var functionId: js.UndefOr[ResourceName]
    var description: js.UndefOr[String]
    var functionVersion: js.UndefOr[String]
    var dataSourceName: js.UndefOr[ResourceName]
    var apiId: js.UndefOr[String]
  }

  object UpdateFunctionRequest {
    def apply(
      name: js.UndefOr[ResourceName] = js.undefined,
      responseMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined,
      requestMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined,
      functionId: js.UndefOr[ResourceName] = js.undefined,
      description: js.UndefOr[String] = js.undefined,
      functionVersion: js.UndefOr[String] = js.undefined,
      dataSourceName: js.UndefOr[ResourceName] = js.undefined,
      apiId: js.UndefOr[String] = js.undefined): UpdateFunctionRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "responseMappingTemplate" -> responseMappingTemplate.map { x => x.asInstanceOf[js.Any] },
        "requestMappingTemplate" -> requestMappingTemplate.map { x => x.asInstanceOf[js.Any] },
        "functionId" -> functionId.map { x => x.asInstanceOf[js.Any] },
        "description" -> description.map { x => x.asInstanceOf[js.Any] },
        "functionVersion" -> functionVersion.map { x => x.asInstanceOf[js.Any] },
        "dataSourceName" -> dataSourceName.map { x => x.asInstanceOf[js.Any] },
        "apiId" -> apiId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFunctionRequest]
    }
  }

  @js.native
  trait UpdateFunctionResponse extends js.Object {
    var functionConfiguration: js.UndefOr[FunctionConfiguration]
  }

  object UpdateFunctionResponse {
    def apply(
      functionConfiguration: js.UndefOr[FunctionConfiguration] = js.undefined): UpdateFunctionResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "functionConfiguration" -> functionConfiguration.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateFunctionResponse]
    }
  }

  @js.native
  trait UpdateGraphqlApiRequest extends js.Object {
    var name: js.UndefOr[String]
    var authenticationType: js.UndefOr[AuthenticationType]
    var logConfig: js.UndefOr[LogConfig]
    var userPoolConfig: js.UndefOr[UserPoolConfig]
    var apiId: js.UndefOr[String]
    var openIDConnectConfig: js.UndefOr[OpenIDConnectConfig]
  }

  object UpdateGraphqlApiRequest {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      authenticationType: js.UndefOr[AuthenticationType] = js.undefined,
      logConfig: js.UndefOr[LogConfig] = js.undefined,
      userPoolConfig: js.UndefOr[UserPoolConfig] = js.undefined,
      apiId: js.UndefOr[String] = js.undefined,
      openIDConnectConfig: js.UndefOr[OpenIDConnectConfig] = js.undefined): UpdateGraphqlApiRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "name" -> name.map { x => x.asInstanceOf[js.Any] },
        "authenticationType" -> authenticationType.map { x => x.asInstanceOf[js.Any] },
        "logConfig" -> logConfig.map { x => x.asInstanceOf[js.Any] },
        "userPoolConfig" -> userPoolConfig.map { x => x.asInstanceOf[js.Any] },
        "apiId" -> apiId.map { x => x.asInstanceOf[js.Any] },
        "openIDConnectConfig" -> openIDConnectConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGraphqlApiRequest]
    }
  }

  @js.native
  trait UpdateGraphqlApiResponse extends js.Object {
    var graphqlApi: js.UndefOr[GraphqlApi]
  }

  object UpdateGraphqlApiResponse {
    def apply(
      graphqlApi: js.UndefOr[GraphqlApi] = js.undefined): UpdateGraphqlApiResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "graphqlApi" -> graphqlApi.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateGraphqlApiResponse]
    }
  }

  @js.native
  trait UpdateResolverRequest extends js.Object {
    var pipelineConfig: js.UndefOr[PipelineConfig]
    var responseMappingTemplate: js.UndefOr[MappingTemplate]
    var requestMappingTemplate: js.UndefOr[MappingTemplate]
    var typeName: js.UndefOr[ResourceName]
    var dataSourceName: js.UndefOr[ResourceName]
    var fieldName: js.UndefOr[ResourceName]
    var apiId: js.UndefOr[String]
    var kind: js.UndefOr[ResolverKind]
  }

  object UpdateResolverRequest {
    def apply(
      pipelineConfig: js.UndefOr[PipelineConfig] = js.undefined,
      responseMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined,
      requestMappingTemplate: js.UndefOr[MappingTemplate] = js.undefined,
      typeName: js.UndefOr[ResourceName] = js.undefined,
      dataSourceName: js.UndefOr[ResourceName] = js.undefined,
      fieldName: js.UndefOr[ResourceName] = js.undefined,
      apiId: js.UndefOr[String] = js.undefined,
      kind: js.UndefOr[ResolverKind] = js.undefined): UpdateResolverRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "pipelineConfig" -> pipelineConfig.map { x => x.asInstanceOf[js.Any] },
        "responseMappingTemplate" -> responseMappingTemplate.map { x => x.asInstanceOf[js.Any] },
        "requestMappingTemplate" -> requestMappingTemplate.map { x => x.asInstanceOf[js.Any] },
        "typeName" -> typeName.map { x => x.asInstanceOf[js.Any] },
        "dataSourceName" -> dataSourceName.map { x => x.asInstanceOf[js.Any] },
        "fieldName" -> fieldName.map { x => x.asInstanceOf[js.Any] },
        "apiId" -> apiId.map { x => x.asInstanceOf[js.Any] },
        "kind" -> kind.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateResolverRequest]
    }
  }

  @js.native
  trait UpdateResolverResponse extends js.Object {
    var resolver: js.UndefOr[Resolver]
  }

  object UpdateResolverResponse {
    def apply(
      resolver: js.UndefOr[Resolver] = js.undefined): UpdateResolverResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "resolver" -> resolver.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateResolverResponse]
    }
  }

  @js.native
  trait UpdateTypeRequest extends js.Object {
    var apiId: js.UndefOr[String]
    var typeName: js.UndefOr[ResourceName]
    var definition: js.UndefOr[String]
    var format: js.UndefOr[TypeDefinitionFormat]
  }

  object UpdateTypeRequest {
    def apply(
      apiId: js.UndefOr[String] = js.undefined,
      typeName: js.UndefOr[ResourceName] = js.undefined,
      definition: js.UndefOr[String] = js.undefined,
      format: js.UndefOr[TypeDefinitionFormat] = js.undefined): UpdateTypeRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "apiId" -> apiId.map { x => x.asInstanceOf[js.Any] },
        "typeName" -> typeName.map { x => x.asInstanceOf[js.Any] },
        "definition" -> definition.map { x => x.asInstanceOf[js.Any] },
        "format" -> format.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTypeRequest]
    }
  }

  @js.native
  trait UpdateTypeResponse extends js.Object {
    var `type`: js.UndefOr[Type]
  }

  object UpdateTypeResponse {
    def apply(
      `type`: js.UndefOr[Type] = js.undefined): UpdateTypeResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "`type`" -> `type`.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTypeResponse]
    }
  }

  /**
   * <p>Describes an Amazon Cognito user pool configuration.</p>
   */
  @js.native
  trait UserPoolConfig extends js.Object {
    var userPoolId: js.UndefOr[String]
    var awsRegion: js.UndefOr[String]
    var defaultAction: js.UndefOr[DefaultAction]
    var appIdClientRegex: js.UndefOr[String]
  }

  object UserPoolConfig {
    def apply(
      userPoolId: js.UndefOr[String] = js.undefined,
      awsRegion: js.UndefOr[String] = js.undefined,
      defaultAction: js.UndefOr[DefaultAction] = js.undefined,
      appIdClientRegex: js.UndefOr[String] = js.undefined): UserPoolConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "userPoolId" -> userPoolId.map { x => x.asInstanceOf[js.Any] },
        "awsRegion" -> awsRegion.map { x => x.asInstanceOf[js.Any] },
        "defaultAction" -> defaultAction.map { x => x.asInstanceOf[js.Any] },
        "appIdClientRegex" -> appIdClientRegex.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UserPoolConfig]
    }
  }
}
