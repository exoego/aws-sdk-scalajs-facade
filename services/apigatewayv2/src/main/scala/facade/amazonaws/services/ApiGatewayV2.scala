package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object apigatewayv2 {
  type Arn                                    = String
  type AuthorizationScopes                    = js.Array[StringWithLengthBetween1And64]
  type CorsHeaderList                         = js.Array[__string]
  type CorsMethodList                         = js.Array[StringWithLengthBetween1And64]
  type CorsOriginList                         = js.Array[__string]
  type DomainNameConfigurations               = js.Array[DomainNameConfiguration]
  type Id                                     = String
  type IdentitySourceList                     = js.Array[__string]
  type IntegerWithLengthBetween0And3600       = Int
  type IntegerWithLengthBetween50And29000     = Int
  type IntegerWithLengthBetweenMinus1And86400 = Int
  type IntegrationParameters                  = js.Dictionary[StringWithLengthBetween1And512]
  type NextToken                              = String
  type RouteModels                            = js.Dictionary[StringWithLengthBetween1And128]
  type RouteParameters                        = js.Dictionary[ParameterConstraints]
  type RouteSettingsMap                       = js.Dictionary[RouteSettings]
  type SelectionExpression                    = String
  type SelectionKey                           = String
  type StageVariablesMap                      = js.Dictionary[StringWithLengthBetween0And2048]
  type StringWithLengthBetween0And1024        = String
  type StringWithLengthBetween0And2048        = String
  type StringWithLengthBetween0And32K         = String
  type StringWithLengthBetween1And1024        = String
  type StringWithLengthBetween1And128         = String
  type StringWithLengthBetween1And1600        = String
  type StringWithLengthBetween1And256         = String
  type StringWithLengthBetween1And512         = String
  type StringWithLengthBetween1And64          = String
  type Tags                                   = js.Dictionary[StringWithLengthBetween1And1600]
  type TemplateMap                            = js.Dictionary[StringWithLengthBetween0And32K]
  type UriWithLengthBetween1And2048           = String
  type __boolean                              = Boolean
  type __double                               = Double
  type __integer                              = Int
  type __listOfApi                            = js.Array[Api]
  type __listOfApiMapping                     = js.Array[ApiMapping]
  type __listOfAuthorizer                     = js.Array[Authorizer]
  type __listOfDeployment                     = js.Array[Deployment]
  type __listOfDomainName                     = js.Array[DomainName]
  type __listOfIntegration                    = js.Array[Integration]
  type __listOfIntegrationResponse            = js.Array[IntegrationResponse]
  type __listOfModel                          = js.Array[Model]
  type __listOfRoute                          = js.Array[Route]
  type __listOfRouteResponse                  = js.Array[RouteResponse]
  type __listOfStage                          = js.Array[Stage]
  type __listOf__string                       = js.Array[__string]
  type __string                               = String
  type __timestampIso8601                     = js.Date

  implicit final class ApiGatewayV2Ops(private val service: ApiGatewayV2) extends AnyVal {

    @inline def createApiFuture(params: CreateApiRequest): Future[CreateApiResponse] =
      service.createApi(params).promise().toFuture
    @inline def createApiMappingFuture(params: CreateApiMappingRequest): Future[CreateApiMappingResponse] =
      service.createApiMapping(params).promise().toFuture
    @inline def createAuthorizerFuture(params: CreateAuthorizerRequest): Future[CreateAuthorizerResponse] =
      service.createAuthorizer(params).promise().toFuture
    @inline def createDeploymentFuture(params: CreateDeploymentRequest): Future[CreateDeploymentResponse] =
      service.createDeployment(params).promise().toFuture
    @inline def createDomainNameFuture(params: CreateDomainNameRequest): Future[CreateDomainNameResponse] =
      service.createDomainName(params).promise().toFuture
    @inline def createIntegrationFuture(params: CreateIntegrationRequest): Future[CreateIntegrationResult] =
      service.createIntegration(params).promise().toFuture
    @inline def createIntegrationResponseFuture(
        params: CreateIntegrationResponseRequest
    ): Future[CreateIntegrationResponseResponse] = service.createIntegrationResponse(params).promise().toFuture
    @inline def createModelFuture(params: CreateModelRequest): Future[CreateModelResponse] =
      service.createModel(params).promise().toFuture
    @inline def createRouteFuture(params: CreateRouteRequest): Future[CreateRouteResult] =
      service.createRoute(params).promise().toFuture
    @inline def createRouteResponseFuture(params: CreateRouteResponseRequest): Future[CreateRouteResponseResponse] =
      service.createRouteResponse(params).promise().toFuture
    @inline def createStageFuture(params: CreateStageRequest): Future[CreateStageResponse] =
      service.createStage(params).promise().toFuture
    @inline def deleteApiFuture(params: DeleteApiRequest): Future[js.Object] =
      service.deleteApi(params).promise().toFuture
    @inline def deleteApiMappingFuture(params: DeleteApiMappingRequest): Future[js.Object] =
      service.deleteApiMapping(params).promise().toFuture
    @inline def deleteAuthorizerFuture(params: DeleteAuthorizerRequest): Future[js.Object] =
      service.deleteAuthorizer(params).promise().toFuture
    @inline def deleteCorsConfigurationFuture(params: DeleteCorsConfigurationRequest): Future[js.Object] =
      service.deleteCorsConfiguration(params).promise().toFuture
    @inline def deleteDeploymentFuture(params: DeleteDeploymentRequest): Future[js.Object] =
      service.deleteDeployment(params).promise().toFuture
    @inline def deleteDomainNameFuture(params: DeleteDomainNameRequest): Future[js.Object] =
      service.deleteDomainName(params).promise().toFuture
    @inline def deleteIntegrationFuture(params: DeleteIntegrationRequest): Future[js.Object] =
      service.deleteIntegration(params).promise().toFuture
    @inline def deleteIntegrationResponseFuture(params: DeleteIntegrationResponseRequest): Future[js.Object] =
      service.deleteIntegrationResponse(params).promise().toFuture
    @inline def deleteModelFuture(params: DeleteModelRequest): Future[js.Object] =
      service.deleteModel(params).promise().toFuture
    @inline def deleteRouteFuture(params: DeleteRouteRequest): Future[js.Object] =
      service.deleteRoute(params).promise().toFuture
    @inline def deleteRouteResponseFuture(params: DeleteRouteResponseRequest): Future[js.Object] =
      service.deleteRouteResponse(params).promise().toFuture
    @inline def deleteRouteSettingsFuture(params: DeleteRouteSettingsRequest): Future[js.Object] =
      service.deleteRouteSettings(params).promise().toFuture
    @inline def deleteStageFuture(params: DeleteStageRequest): Future[js.Object] =
      service.deleteStage(params).promise().toFuture
    @inline def getApiFuture(params: GetApiRequest): Future[GetApiResponse] = service.getApi(params).promise().toFuture
    @inline def getApiMappingFuture(params: GetApiMappingRequest): Future[GetApiMappingResponse] =
      service.getApiMapping(params).promise().toFuture
    @inline def getApiMappingsFuture(params: GetApiMappingsRequest): Future[GetApiMappingsResponse] =
      service.getApiMappings(params).promise().toFuture
    @inline def getApisFuture(params: GetApisRequest): Future[GetApisResponse] =
      service.getApis(params).promise().toFuture
    @inline def getAuthorizerFuture(params: GetAuthorizerRequest): Future[GetAuthorizerResponse] =
      service.getAuthorizer(params).promise().toFuture
    @inline def getAuthorizersFuture(params: GetAuthorizersRequest): Future[GetAuthorizersResponse] =
      service.getAuthorizers(params).promise().toFuture
    @inline def getDeploymentFuture(params: GetDeploymentRequest): Future[GetDeploymentResponse] =
      service.getDeployment(params).promise().toFuture
    @inline def getDeploymentsFuture(params: GetDeploymentsRequest): Future[GetDeploymentsResponse] =
      service.getDeployments(params).promise().toFuture
    @inline def getDomainNameFuture(params: GetDomainNameRequest): Future[GetDomainNameResponse] =
      service.getDomainName(params).promise().toFuture
    @inline def getDomainNamesFuture(params: GetDomainNamesRequest): Future[GetDomainNamesResponse] =
      service.getDomainNames(params).promise().toFuture
    @inline def getIntegrationFuture(params: GetIntegrationRequest): Future[GetIntegrationResult] =
      service.getIntegration(params).promise().toFuture
    @inline def getIntegrationResponseFuture(
        params: GetIntegrationResponseRequest
    ): Future[GetIntegrationResponseResponse] = service.getIntegrationResponse(params).promise().toFuture
    @inline def getIntegrationResponsesFuture(
        params: GetIntegrationResponsesRequest
    ): Future[GetIntegrationResponsesResponse] = service.getIntegrationResponses(params).promise().toFuture
    @inline def getIntegrationsFuture(params: GetIntegrationsRequest): Future[GetIntegrationsResponse] =
      service.getIntegrations(params).promise().toFuture
    @inline def getModelFuture(params: GetModelRequest): Future[GetModelResponse] =
      service.getModel(params).promise().toFuture
    @inline def getModelTemplateFuture(params: GetModelTemplateRequest): Future[GetModelTemplateResponse] =
      service.getModelTemplate(params).promise().toFuture
    @inline def getModelsFuture(params: GetModelsRequest): Future[GetModelsResponse] =
      service.getModels(params).promise().toFuture
    @inline def getRouteFuture(params: GetRouteRequest): Future[GetRouteResult] =
      service.getRoute(params).promise().toFuture
    @inline def getRouteResponseFuture(params: GetRouteResponseRequest): Future[GetRouteResponseResponse] =
      service.getRouteResponse(params).promise().toFuture
    @inline def getRouteResponsesFuture(params: GetRouteResponsesRequest): Future[GetRouteResponsesResponse] =
      service.getRouteResponses(params).promise().toFuture
    @inline def getRoutesFuture(params: GetRoutesRequest): Future[GetRoutesResponse] =
      service.getRoutes(params).promise().toFuture
    @inline def getStageFuture(params: GetStageRequest): Future[GetStageResponse] =
      service.getStage(params).promise().toFuture
    @inline def getStagesFuture(params: GetStagesRequest): Future[GetStagesResponse] =
      service.getStages(params).promise().toFuture
    @inline def getTagsFuture(params: GetTagsRequest): Future[GetTagsResponse] =
      service.getTags(params).promise().toFuture
    @inline def importApiFuture(params: ImportApiRequest): Future[ImportApiResponse] =
      service.importApi(params).promise().toFuture
    @inline def reimportApiFuture(params: ReimportApiRequest): Future[ReimportApiResponse] =
      service.reimportApi(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise().toFuture
    @inline def updateApiFuture(params: UpdateApiRequest): Future[UpdateApiResponse] =
      service.updateApi(params).promise().toFuture
    @inline def updateApiMappingFuture(params: UpdateApiMappingRequest): Future[UpdateApiMappingResponse] =
      service.updateApiMapping(params).promise().toFuture
    @inline def updateAuthorizerFuture(params: UpdateAuthorizerRequest): Future[UpdateAuthorizerResponse] =
      service.updateAuthorizer(params).promise().toFuture
    @inline def updateDeploymentFuture(params: UpdateDeploymentRequest): Future[UpdateDeploymentResponse] =
      service.updateDeployment(params).promise().toFuture
    @inline def updateDomainNameFuture(params: UpdateDomainNameRequest): Future[UpdateDomainNameResponse] =
      service.updateDomainName(params).promise().toFuture
    @inline def updateIntegrationFuture(params: UpdateIntegrationRequest): Future[UpdateIntegrationResult] =
      service.updateIntegration(params).promise().toFuture
    @inline def updateIntegrationResponseFuture(
        params: UpdateIntegrationResponseRequest
    ): Future[UpdateIntegrationResponseResponse] = service.updateIntegrationResponse(params).promise().toFuture
    @inline def updateModelFuture(params: UpdateModelRequest): Future[UpdateModelResponse] =
      service.updateModel(params).promise().toFuture
    @inline def updateRouteFuture(params: UpdateRouteRequest): Future[UpdateRouteResult] =
      service.updateRoute(params).promise().toFuture
    @inline def updateRouteResponseFuture(params: UpdateRouteResponseRequest): Future[UpdateRouteResponseResponse] =
      service.updateRouteResponse(params).promise().toFuture
    @inline def updateStageFuture(params: UpdateStageRequest): Future[UpdateStageResponse] =
      service.updateStage(params).promise().toFuture
  }
}

package apigatewayv2 {
  @js.native
  @JSImport("aws-sdk", "ApiGatewayV2")
  class ApiGatewayV2() extends js.Object {
    def this(config: AWSConfig) = this()

    def createApi(params: CreateApiRequest): Request[CreateApiResponse]                       = js.native
    def createApiMapping(params: CreateApiMappingRequest): Request[CreateApiMappingResponse]  = js.native
    def createAuthorizer(params: CreateAuthorizerRequest): Request[CreateAuthorizerResponse]  = js.native
    def createDeployment(params: CreateDeploymentRequest): Request[CreateDeploymentResponse]  = js.native
    def createDomainName(params: CreateDomainNameRequest): Request[CreateDomainNameResponse]  = js.native
    def createIntegration(params: CreateIntegrationRequest): Request[CreateIntegrationResult] = js.native
    def createIntegrationResponse(
        params: CreateIntegrationResponseRequest
    ): Request[CreateIntegrationResponseResponse]                                                     = js.native
    def createModel(params: CreateModelRequest): Request[CreateModelResponse]                         = js.native
    def createRoute(params: CreateRouteRequest): Request[CreateRouteResult]                           = js.native
    def createRouteResponse(params: CreateRouteResponseRequest): Request[CreateRouteResponseResponse] = js.native
    def createStage(params: CreateStageRequest): Request[CreateStageResponse]                         = js.native
    def deleteApi(params: DeleteApiRequest): Request[js.Object]                                       = js.native
    def deleteApiMapping(params: DeleteApiMappingRequest): Request[js.Object]                         = js.native
    def deleteAuthorizer(params: DeleteAuthorizerRequest): Request[js.Object]                         = js.native
    def deleteCorsConfiguration(params: DeleteCorsConfigurationRequest): Request[js.Object]           = js.native
    def deleteDeployment(params: DeleteDeploymentRequest): Request[js.Object]                         = js.native
    def deleteDomainName(params: DeleteDomainNameRequest): Request[js.Object]                         = js.native
    def deleteIntegration(params: DeleteIntegrationRequest): Request[js.Object]                       = js.native
    def deleteIntegrationResponse(params: DeleteIntegrationResponseRequest): Request[js.Object]       = js.native
    def deleteModel(params: DeleteModelRequest): Request[js.Object]                                   = js.native
    def deleteRoute(params: DeleteRouteRequest): Request[js.Object]                                   = js.native
    def deleteRouteResponse(params: DeleteRouteResponseRequest): Request[js.Object]                   = js.native
    def deleteRouteSettings(params: DeleteRouteSettingsRequest): Request[js.Object]                   = js.native
    def deleteStage(params: DeleteStageRequest): Request[js.Object]                                   = js.native
    def getApi(params: GetApiRequest): Request[GetApiResponse]                                        = js.native
    def getApiMapping(params: GetApiMappingRequest): Request[GetApiMappingResponse]                   = js.native
    def getApiMappings(params: GetApiMappingsRequest): Request[GetApiMappingsResponse]                = js.native
    def getApis(params: GetApisRequest): Request[GetApisResponse]                                     = js.native
    def getAuthorizer(params: GetAuthorizerRequest): Request[GetAuthorizerResponse]                   = js.native
    def getAuthorizers(params: GetAuthorizersRequest): Request[GetAuthorizersResponse]                = js.native
    def getDeployment(params: GetDeploymentRequest): Request[GetDeploymentResponse]                   = js.native
    def getDeployments(params: GetDeploymentsRequest): Request[GetDeploymentsResponse]                = js.native
    def getDomainName(params: GetDomainNameRequest): Request[GetDomainNameResponse]                   = js.native
    def getDomainNames(params: GetDomainNamesRequest): Request[GetDomainNamesResponse]                = js.native
    def getIntegration(params: GetIntegrationRequest): Request[GetIntegrationResult]                  = js.native
    def getIntegrationResponse(params: GetIntegrationResponseRequest): Request[GetIntegrationResponseResponse] =
      js.native
    def getIntegrationResponses(params: GetIntegrationResponsesRequest): Request[GetIntegrationResponsesResponse] =
      js.native
    def getIntegrations(params: GetIntegrationsRequest): Request[GetIntegrationsResponse]       = js.native
    def getModel(params: GetModelRequest): Request[GetModelResponse]                            = js.native
    def getModelTemplate(params: GetModelTemplateRequest): Request[GetModelTemplateResponse]    = js.native
    def getModels(params: GetModelsRequest): Request[GetModelsResponse]                         = js.native
    def getRoute(params: GetRouteRequest): Request[GetRouteResult]                              = js.native
    def getRouteResponse(params: GetRouteResponseRequest): Request[GetRouteResponseResponse]    = js.native
    def getRouteResponses(params: GetRouteResponsesRequest): Request[GetRouteResponsesResponse] = js.native
    def getRoutes(params: GetRoutesRequest): Request[GetRoutesResponse]                         = js.native
    def getStage(params: GetStageRequest): Request[GetStageResponse]                            = js.native
    def getStages(params: GetStagesRequest): Request[GetStagesResponse]                         = js.native
    def getTags(params: GetTagsRequest): Request[GetTagsResponse]                               = js.native
    def importApi(params: ImportApiRequest): Request[ImportApiResponse]                         = js.native
    def reimportApi(params: ReimportApiRequest): Request[ReimportApiResponse]                   = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                   = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object]                         = js.native
    def updateApi(params: UpdateApiRequest): Request[UpdateApiResponse]                         = js.native
    def updateApiMapping(params: UpdateApiMappingRequest): Request[UpdateApiMappingResponse]    = js.native
    def updateAuthorizer(params: UpdateAuthorizerRequest): Request[UpdateAuthorizerResponse]    = js.native
    def updateDeployment(params: UpdateDeploymentRequest): Request[UpdateDeploymentResponse]    = js.native
    def updateDomainName(params: UpdateDomainNameRequest): Request[UpdateDomainNameResponse]    = js.native
    def updateIntegration(params: UpdateIntegrationRequest): Request[UpdateIntegrationResult]   = js.native
    def updateIntegrationResponse(
        params: UpdateIntegrationResponseRequest
    ): Request[UpdateIntegrationResponseResponse]                                                     = js.native
    def updateModel(params: UpdateModelRequest): Request[UpdateModelResponse]                         = js.native
    def updateRoute(params: UpdateRouteRequest): Request[UpdateRouteResult]                           = js.native
    def updateRouteResponse(params: UpdateRouteResponseRequest): Request[UpdateRouteResponseResponse] = js.native
    def updateStage(params: UpdateStageRequest): Request[UpdateStageResponse]                         = js.native
  }

  /**
    * Settings for logging access in a stage.
    */
  @js.native
  @Factory
  trait AccessLogSettings extends js.Object {
    var DestinationArn: js.UndefOr[Arn]
    var Format: js.UndefOr[StringWithLengthBetween1And1024]
  }

  /**
    * Represents an API.
    */
  @js.native
  @Factory
  trait Api extends js.Object {
    var Name: StringWithLengthBetween1And128
    var ProtocolType: ProtocolType
    var RouteSelectionExpression: SelectionExpression
    var ApiEndpoint: js.UndefOr[__string]
    var ApiId: js.UndefOr[Id]
    var ApiKeySelectionExpression: js.UndefOr[SelectionExpression]
    var CorsConfiguration: js.UndefOr[Cors]
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var DisableSchemaValidation: js.UndefOr[__boolean]
    var ImportInfo: js.UndefOr[__listOf__string]
    var Tags: js.UndefOr[Tags]
    var Version: js.UndefOr[StringWithLengthBetween1And64]
    var Warnings: js.UndefOr[__listOf__string]
  }

  /**
    * Represents an API mapping.
    */
  @js.native
  @Factory
  trait ApiMapping extends js.Object {
    var ApiId: Id
    var Stage: StringWithLengthBetween1And128
    var ApiMappingId: js.UndefOr[Id]
    var ApiMappingKey: js.UndefOr[SelectionKey]
  }

  /**
    * The authorization type. For WebSocket APIs, valid values are NONE for open access, AWS_IAM for using AWS IAM permissions, and CUSTOM for using a Lambda authorizer. For HTTP APIs, valid values are NONE for open access, or JWT for using JSON Web Tokens.
    */
  @js.native
  sealed trait AuthorizationType extends js.Any
  object AuthorizationType extends js.Object {
    val NONE    = "NONE".asInstanceOf[AuthorizationType]
    val AWS_IAM = "AWS_IAM".asInstanceOf[AuthorizationType]
    val CUSTOM  = "CUSTOM".asInstanceOf[AuthorizationType]
    val JWT     = "JWT".asInstanceOf[AuthorizationType]

    val values = js.Object.freeze(js.Array(NONE, AWS_IAM, CUSTOM, JWT))
  }

  /**
    * Represents an authorizer.
    */
  @js.native
  @Factory
  trait Authorizer extends js.Object {
    var Name: StringWithLengthBetween1And128
    var AuthorizerCredentialsArn: js.UndefOr[Arn]
    var AuthorizerId: js.UndefOr[Id]
    var AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600]
    var AuthorizerType: js.UndefOr[AuthorizerType]
    var AuthorizerUri: js.UndefOr[UriWithLengthBetween1And2048]
    var IdentitySource: js.UndefOr[IdentitySourceList]
    var IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024]
    var JwtConfiguration: js.UndefOr[JWTConfiguration]
  }

  /**
    * The authorizer type. For WebSocket APIs, specify REQUEST for a Lambda function using incoming request parameters. For HTTP APIs, specify JWT to use JSON Web Tokens.
    */
  @js.native
  sealed trait AuthorizerType extends js.Any
  object AuthorizerType extends js.Object {
    val REQUEST = "REQUEST".asInstanceOf[AuthorizerType]
    val JWT     = "JWT".asInstanceOf[AuthorizerType]

    val values = js.Object.freeze(js.Array(REQUEST, JWT))
  }

  /**
    * Represents a connection type.
    */
  @js.native
  sealed trait ConnectionType extends js.Any
  object ConnectionType extends js.Object {
    val INTERNET = "INTERNET".asInstanceOf[ConnectionType]
    val VPC_LINK = "VPC_LINK".asInstanceOf[ConnectionType]

    val values = js.Object.freeze(js.Array(INTERNET, VPC_LINK))
  }

  /**
    * Specifies how to handle response payload content type conversions. Supported only for WebSocket APIs.
    */
  @js.native
  sealed trait ContentHandlingStrategy extends js.Any
  object ContentHandlingStrategy extends js.Object {
    val CONVERT_TO_BINARY = "CONVERT_TO_BINARY".asInstanceOf[ContentHandlingStrategy]
    val CONVERT_TO_TEXT   = "CONVERT_TO_TEXT".asInstanceOf[ContentHandlingStrategy]

    val values = js.Object.freeze(js.Array(CONVERT_TO_BINARY, CONVERT_TO_TEXT))
  }

  /**
    * Represents a CORS configuration. Supported only for HTTP APIs. See [[https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html|Configuring CORS]] for more information.
    */
  @js.native
  @Factory
  trait Cors extends js.Object {
    var AllowCredentials: js.UndefOr[__boolean]
    var AllowHeaders: js.UndefOr[CorsHeaderList]
    var AllowMethods: js.UndefOr[CorsMethodList]
    var AllowOrigins: js.UndefOr[CorsOriginList]
    var ExposeHeaders: js.UndefOr[CorsHeaderList]
    var MaxAge: js.UndefOr[IntegerWithLengthBetweenMinus1And86400]
  }

  /**
    * Creates a new ApiMapping resource to represent an API mapping.
    */
  @js.native
  @Factory
  trait CreateApiMappingRequest extends js.Object {
    var ApiId: Id
    var DomainName: __string
    var Stage: StringWithLengthBetween1And128
    var ApiMappingKey: js.UndefOr[SelectionKey]
  }

  @js.native
  @Factory
  trait CreateApiMappingResponse extends js.Object {
    var ApiId: js.UndefOr[Id]
    var ApiMappingId: js.UndefOr[Id]
    var ApiMappingKey: js.UndefOr[SelectionKey]
    var Stage: js.UndefOr[StringWithLengthBetween1And128]
  }

  /**
    * Creates a new Api resource to represent an API.
    */
  @js.native
  @Factory
  trait CreateApiRequest extends js.Object {
    var Name: StringWithLengthBetween1And128
    var ProtocolType: ProtocolType
    var ApiKeySelectionExpression: js.UndefOr[SelectionExpression]
    var CorsConfiguration: js.UndefOr[Cors]
    var CredentialsArn: js.UndefOr[Arn]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var DisableSchemaValidation: js.UndefOr[__boolean]
    var RouteKey: js.UndefOr[SelectionKey]
    var RouteSelectionExpression: js.UndefOr[SelectionExpression]
    var Tags: js.UndefOr[Tags]
    var Target: js.UndefOr[UriWithLengthBetween1And2048]
    var Version: js.UndefOr[StringWithLengthBetween1And64]
  }

  @js.native
  @Factory
  trait CreateApiResponse extends js.Object {
    var ApiEndpoint: js.UndefOr[__string]
    var ApiId: js.UndefOr[Id]
    var ApiKeySelectionExpression: js.UndefOr[SelectionExpression]
    var CorsConfiguration: js.UndefOr[Cors]
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var DisableSchemaValidation: js.UndefOr[__boolean]
    var ImportInfo: js.UndefOr[__listOf__string]
    var Name: js.UndefOr[StringWithLengthBetween1And128]
    var ProtocolType: js.UndefOr[ProtocolType]
    var RouteSelectionExpression: js.UndefOr[SelectionExpression]
    var Tags: js.UndefOr[Tags]
    var Version: js.UndefOr[StringWithLengthBetween1And64]
    var Warnings: js.UndefOr[__listOf__string]
  }

  /**
    * Creates a new Authorizer resource to represent an authorizer.
    */
  @js.native
  @Factory
  trait CreateAuthorizerRequest extends js.Object {
    var ApiId: __string
    var AuthorizerType: AuthorizerType
    var IdentitySource: IdentitySourceList
    var Name: StringWithLengthBetween1And128
    var AuthorizerCredentialsArn: js.UndefOr[Arn]
    var AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600]
    var AuthorizerUri: js.UndefOr[UriWithLengthBetween1And2048]
    var IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024]
    var JwtConfiguration: js.UndefOr[JWTConfiguration]
  }

  @js.native
  @Factory
  trait CreateAuthorizerResponse extends js.Object {
    var AuthorizerCredentialsArn: js.UndefOr[Arn]
    var AuthorizerId: js.UndefOr[Id]
    var AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600]
    var AuthorizerType: js.UndefOr[AuthorizerType]
    var AuthorizerUri: js.UndefOr[UriWithLengthBetween1And2048]
    var IdentitySource: js.UndefOr[IdentitySourceList]
    var IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024]
    var JwtConfiguration: js.UndefOr[JWTConfiguration]
    var Name: js.UndefOr[StringWithLengthBetween1And128]
  }

  /**
    * Creates a new Deployment resource to represent a deployment.
    */
  @js.native
  @Factory
  trait CreateDeploymentRequest extends js.Object {
    var ApiId: __string
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var StageName: js.UndefOr[StringWithLengthBetween1And128]
  }

  @js.native
  @Factory
  trait CreateDeploymentResponse extends js.Object {
    var AutoDeployed: js.UndefOr[__boolean]
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var DeploymentId: js.UndefOr[Id]
    var DeploymentStatus: js.UndefOr[DeploymentStatus]
    var DeploymentStatusMessage: js.UndefOr[__string]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
  }

  /**
    * Creates a new DomainName resource to represent a domain name.
    */
  @js.native
  @Factory
  trait CreateDomainNameRequest extends js.Object {
    var DomainName: StringWithLengthBetween1And512
    var DomainNameConfigurations: js.UndefOr[DomainNameConfigurations]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait CreateDomainNameResponse extends js.Object {
    var ApiMappingSelectionExpression: js.UndefOr[SelectionExpression]
    var DomainName: js.UndefOr[StringWithLengthBetween1And512]
    var DomainNameConfigurations: js.UndefOr[DomainNameConfigurations]
    var Tags: js.UndefOr[Tags]
  }

  /**
    * Creates a new Integration resource to represent an integration.
    */
  @js.native
  @Factory
  trait CreateIntegrationRequest extends js.Object {
    var ApiId: __string
    var IntegrationType: IntegrationType
    var ConnectionId: js.UndefOr[StringWithLengthBetween1And1024]
    var ConnectionType: js.UndefOr[ConnectionType]
    var ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy]
    var CredentialsArn: js.UndefOr[Arn]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var IntegrationMethod: js.UndefOr[StringWithLengthBetween1And64]
    var IntegrationUri: js.UndefOr[UriWithLengthBetween1And2048]
    var PassthroughBehavior: js.UndefOr[PassthroughBehavior]
    var PayloadFormatVersion: js.UndefOr[StringWithLengthBetween1And64]
    var RequestParameters: js.UndefOr[IntegrationParameters]
    var RequestTemplates: js.UndefOr[TemplateMap]
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression]
    var TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And29000]
  }

  /**
    * Creates a new IntegrationResponse resource to represent an integration response.
    */
  @js.native
  @Factory
  trait CreateIntegrationResponseRequest extends js.Object {
    var ApiId: __string
    var IntegrationId: __string
    var IntegrationResponseKey: SelectionKey
    var ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy]
    var ResponseParameters: js.UndefOr[IntegrationParameters]
    var ResponseTemplates: js.UndefOr[TemplateMap]
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression]
  }

  @js.native
  @Factory
  trait CreateIntegrationResponseResponse extends js.Object {
    var ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy]
    var IntegrationResponseId: js.UndefOr[Id]
    var IntegrationResponseKey: js.UndefOr[SelectionKey]
    var ResponseParameters: js.UndefOr[IntegrationParameters]
    var ResponseTemplates: js.UndefOr[TemplateMap]
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression]
  }

  @js.native
  @Factory
  trait CreateIntegrationResult extends js.Object {
    var ApiGatewayManaged: js.UndefOr[__boolean]
    var ConnectionId: js.UndefOr[StringWithLengthBetween1And1024]
    var ConnectionType: js.UndefOr[ConnectionType]
    var ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy]
    var CredentialsArn: js.UndefOr[Arn]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var IntegrationId: js.UndefOr[Id]
    var IntegrationMethod: js.UndefOr[StringWithLengthBetween1And64]
    var IntegrationResponseSelectionExpression: js.UndefOr[SelectionExpression]
    var IntegrationType: js.UndefOr[IntegrationType]
    var IntegrationUri: js.UndefOr[UriWithLengthBetween1And2048]
    var PassthroughBehavior: js.UndefOr[PassthroughBehavior]
    var PayloadFormatVersion: js.UndefOr[StringWithLengthBetween1And64]
    var RequestParameters: js.UndefOr[IntegrationParameters]
    var RequestTemplates: js.UndefOr[TemplateMap]
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression]
    var TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And29000]
  }

  /**
    * Creates a new Model.
    */
  @js.native
  @Factory
  trait CreateModelRequest extends js.Object {
    var ApiId: __string
    var Name: StringWithLengthBetween1And128
    var Schema: StringWithLengthBetween0And32K
    var ContentType: js.UndefOr[StringWithLengthBetween1And256]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
  }

  @js.native
  @Factory
  trait CreateModelResponse extends js.Object {
    var ContentType: js.UndefOr[StringWithLengthBetween1And256]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var ModelId: js.UndefOr[Id]
    var Name: js.UndefOr[StringWithLengthBetween1And128]
    var Schema: js.UndefOr[StringWithLengthBetween0And32K]
  }

  /**
    * Creates a new Route resource to represent a route.
    */
  @js.native
  @Factory
  trait CreateRouteRequest extends js.Object {
    var ApiId: __string
    var RouteKey: SelectionKey
    var ApiKeyRequired: js.UndefOr[__boolean]
    var AuthorizationScopes: js.UndefOr[AuthorizationScopes]
    var AuthorizationType: js.UndefOr[AuthorizationType]
    var AuthorizerId: js.UndefOr[Id]
    var ModelSelectionExpression: js.UndefOr[SelectionExpression]
    var OperationName: js.UndefOr[StringWithLengthBetween1And64]
    var RequestModels: js.UndefOr[RouteModels]
    var RequestParameters: js.UndefOr[RouteParameters]
    var RouteResponseSelectionExpression: js.UndefOr[SelectionExpression]
    var Target: js.UndefOr[StringWithLengthBetween1And128]
  }

  /**
    * Creates a new RouteResponse resource to represent a route response.
    */
  @js.native
  @Factory
  trait CreateRouteResponseRequest extends js.Object {
    var ApiId: __string
    var RouteId: __string
    var RouteResponseKey: SelectionKey
    var ModelSelectionExpression: js.UndefOr[SelectionExpression]
    var ResponseModels: js.UndefOr[RouteModels]
    var ResponseParameters: js.UndefOr[RouteParameters]
  }

  @js.native
  @Factory
  trait CreateRouteResponseResponse extends js.Object {
    var ModelSelectionExpression: js.UndefOr[SelectionExpression]
    var ResponseModels: js.UndefOr[RouteModels]
    var ResponseParameters: js.UndefOr[RouteParameters]
    var RouteResponseId: js.UndefOr[Id]
    var RouteResponseKey: js.UndefOr[SelectionKey]
  }

  @js.native
  @Factory
  trait CreateRouteResult extends js.Object {
    var ApiGatewayManaged: js.UndefOr[__boolean]
    var ApiKeyRequired: js.UndefOr[__boolean]
    var AuthorizationScopes: js.UndefOr[AuthorizationScopes]
    var AuthorizationType: js.UndefOr[AuthorizationType]
    var AuthorizerId: js.UndefOr[Id]
    var ModelSelectionExpression: js.UndefOr[SelectionExpression]
    var OperationName: js.UndefOr[StringWithLengthBetween1And64]
    var RequestModels: js.UndefOr[RouteModels]
    var RequestParameters: js.UndefOr[RouteParameters]
    var RouteId: js.UndefOr[Id]
    var RouteKey: js.UndefOr[SelectionKey]
    var RouteResponseSelectionExpression: js.UndefOr[SelectionExpression]
    var Target: js.UndefOr[StringWithLengthBetween1And128]
  }

  /**
    * Creates a new Stage resource to represent a stage.
    */
  @js.native
  @Factory
  trait CreateStageRequest extends js.Object {
    var ApiId: __string
    var StageName: StringWithLengthBetween1And128
    var AccessLogSettings: js.UndefOr[AccessLogSettings]
    var AutoDeploy: js.UndefOr[__boolean]
    var ClientCertificateId: js.UndefOr[Id]
    var DefaultRouteSettings: js.UndefOr[RouteSettings]
    var DeploymentId: js.UndefOr[Id]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var RouteSettings: js.UndefOr[RouteSettingsMap]
    var StageVariables: js.UndefOr[StageVariablesMap]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait CreateStageResponse extends js.Object {
    var AccessLogSettings: js.UndefOr[AccessLogSettings]
    var ApiGatewayManaged: js.UndefOr[__boolean]
    var AutoDeploy: js.UndefOr[__boolean]
    var ClientCertificateId: js.UndefOr[Id]
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var DefaultRouteSettings: js.UndefOr[RouteSettings]
    var DeploymentId: js.UndefOr[Id]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var LastDeploymentStatusMessage: js.UndefOr[__string]
    var LastUpdatedDate: js.UndefOr[__timestampIso8601]
    var RouteSettings: js.UndefOr[RouteSettingsMap]
    var StageName: js.UndefOr[StringWithLengthBetween1And128]
    var StageVariables: js.UndefOr[StageVariablesMap]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait DeleteApiMappingRequest extends js.Object {
    var ApiMappingId: __string
    var DomainName: __string
  }

  @js.native
  @Factory
  trait DeleteApiRequest extends js.Object {
    var ApiId: __string
  }

  @js.native
  @Factory
  trait DeleteAuthorizerRequest extends js.Object {
    var ApiId: __string
    var AuthorizerId: __string
  }

  @js.native
  @Factory
  trait DeleteCorsConfigurationRequest extends js.Object {
    var ApiId: __string
  }

  @js.native
  @Factory
  trait DeleteDeploymentRequest extends js.Object {
    var ApiId: __string
    var DeploymentId: __string
  }

  @js.native
  @Factory
  trait DeleteDomainNameRequest extends js.Object {
    var DomainName: __string
  }

  @js.native
  @Factory
  trait DeleteIntegrationRequest extends js.Object {
    var ApiId: __string
    var IntegrationId: __string
  }

  @js.native
  @Factory
  trait DeleteIntegrationResponseRequest extends js.Object {
    var ApiId: __string
    var IntegrationId: __string
    var IntegrationResponseId: __string
  }

  @js.native
  @Factory
  trait DeleteModelRequest extends js.Object {
    var ApiId: __string
    var ModelId: __string
  }

  @js.native
  @Factory
  trait DeleteRouteRequest extends js.Object {
    var ApiId: __string
    var RouteId: __string
  }

  @js.native
  @Factory
  trait DeleteRouteResponseRequest extends js.Object {
    var ApiId: __string
    var RouteId: __string
    var RouteResponseId: __string
  }

  @js.native
  @Factory
  trait DeleteRouteSettingsRequest extends js.Object {
    var ApiId: __string
    var RouteKey: __string
    var StageName: __string
  }

  @js.native
  @Factory
  trait DeleteStageRequest extends js.Object {
    var ApiId: __string
    var StageName: __string
  }

  /**
    * An immutable representation of an API that can be called by users. A Deployment must be associated with a Stage for it to be callable over the internet.
    */
  @js.native
  @Factory
  trait Deployment extends js.Object {
    var AutoDeployed: js.UndefOr[__boolean]
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var DeploymentId: js.UndefOr[Id]
    var DeploymentStatus: js.UndefOr[DeploymentStatus]
    var DeploymentStatusMessage: js.UndefOr[__string]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
  }

  /**
    * Represents a deployment status.
    */
  @js.native
  sealed trait DeploymentStatus extends js.Any
  object DeploymentStatus extends js.Object {
    val PENDING  = "PENDING".asInstanceOf[DeploymentStatus]
    val FAILED   = "FAILED".asInstanceOf[DeploymentStatus]
    val DEPLOYED = "DEPLOYED".asInstanceOf[DeploymentStatus]

    val values = js.Object.freeze(js.Array(PENDING, FAILED, DEPLOYED))
  }

  /**
    * Represents a domain name.
    */
  @js.native
  @Factory
  trait DomainName extends js.Object {
    var DomainName: StringWithLengthBetween1And512
    var ApiMappingSelectionExpression: js.UndefOr[SelectionExpression]
    var DomainNameConfigurations: js.UndefOr[DomainNameConfigurations]
    var Tags: js.UndefOr[Tags]
  }

  /**
    * The domain name configuration.
    */
  @js.native
  @Factory
  trait DomainNameConfiguration extends js.Object {
    var ApiGatewayDomainName: js.UndefOr[__string]
    var CertificateArn: js.UndefOr[Arn]
    var CertificateName: js.UndefOr[StringWithLengthBetween1And128]
    var CertificateUploadDate: js.UndefOr[__timestampIso8601]
    var DomainNameStatus: js.UndefOr[DomainNameStatus]
    var DomainNameStatusMessage: js.UndefOr[__string]
    var EndpointType: js.UndefOr[EndpointType]
    var HostedZoneId: js.UndefOr[__string]
    var SecurityPolicy: js.UndefOr[SecurityPolicy]
  }

  /**
    * The status of the domain name migration. The valid values are AVAILABLE and UPDATING. If the status is UPDATING, the domain cannot be modified further until the existing operation is complete. If it is AVAILABLE, the domain can be updated.
    */
  @js.native
  sealed trait DomainNameStatus extends js.Any
  object DomainNameStatus extends js.Object {
    val AVAILABLE = "AVAILABLE".asInstanceOf[DomainNameStatus]
    val UPDATING  = "UPDATING".asInstanceOf[DomainNameStatus]

    val values = js.Object.freeze(js.Array(AVAILABLE, UPDATING))
  }

  /**
    * Represents an endpoint type.
    */
  @js.native
  sealed trait EndpointType extends js.Any
  object EndpointType extends js.Object {
    val REGIONAL = "REGIONAL".asInstanceOf[EndpointType]
    val EDGE     = "EDGE".asInstanceOf[EndpointType]

    val values = js.Object.freeze(js.Array(REGIONAL, EDGE))
  }

  @js.native
  @Factory
  trait GetApiMappingRequest extends js.Object {
    var ApiMappingId: __string
    var DomainName: __string
  }

  @js.native
  @Factory
  trait GetApiMappingResponse extends js.Object {
    var ApiId: js.UndefOr[Id]
    var ApiMappingId: js.UndefOr[Id]
    var ApiMappingKey: js.UndefOr[SelectionKey]
    var Stage: js.UndefOr[StringWithLengthBetween1And128]
  }

  @js.native
  @Factory
  trait GetApiMappingsRequest extends js.Object {
    var DomainName: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetApiMappingsResponse extends js.Object {
    var Items: js.UndefOr[__listOfApiMapping]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetApiRequest extends js.Object {
    var ApiId: __string
  }

  @js.native
  @Factory
  trait GetApiResponse extends js.Object {
    var ApiEndpoint: js.UndefOr[__string]
    var ApiId: js.UndefOr[Id]
    var ApiKeySelectionExpression: js.UndefOr[SelectionExpression]
    var CorsConfiguration: js.UndefOr[Cors]
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var DisableSchemaValidation: js.UndefOr[__boolean]
    var ImportInfo: js.UndefOr[__listOf__string]
    var Name: js.UndefOr[StringWithLengthBetween1And128]
    var ProtocolType: js.UndefOr[ProtocolType]
    var RouteSelectionExpression: js.UndefOr[SelectionExpression]
    var Tags: js.UndefOr[Tags]
    var Version: js.UndefOr[StringWithLengthBetween1And64]
    var Warnings: js.UndefOr[__listOf__string]
  }

  @js.native
  @Factory
  trait GetApisRequest extends js.Object {
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetApisResponse extends js.Object {
    var Items: js.UndefOr[__listOfApi]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetAuthorizerRequest extends js.Object {
    var ApiId: __string
    var AuthorizerId: __string
  }

  @js.native
  @Factory
  trait GetAuthorizerResponse extends js.Object {
    var AuthorizerCredentialsArn: js.UndefOr[Arn]
    var AuthorizerId: js.UndefOr[Id]
    var AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600]
    var AuthorizerType: js.UndefOr[AuthorizerType]
    var AuthorizerUri: js.UndefOr[UriWithLengthBetween1And2048]
    var IdentitySource: js.UndefOr[IdentitySourceList]
    var IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024]
    var JwtConfiguration: js.UndefOr[JWTConfiguration]
    var Name: js.UndefOr[StringWithLengthBetween1And128]
  }

  @js.native
  @Factory
  trait GetAuthorizersRequest extends js.Object {
    var ApiId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetAuthorizersResponse extends js.Object {
    var Items: js.UndefOr[__listOfAuthorizer]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetDeploymentRequest extends js.Object {
    var ApiId: __string
    var DeploymentId: __string
  }

  @js.native
  @Factory
  trait GetDeploymentResponse extends js.Object {
    var AutoDeployed: js.UndefOr[__boolean]
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var DeploymentId: js.UndefOr[Id]
    var DeploymentStatus: js.UndefOr[DeploymentStatus]
    var DeploymentStatusMessage: js.UndefOr[__string]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
  }

  @js.native
  @Factory
  trait GetDeploymentsRequest extends js.Object {
    var ApiId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetDeploymentsResponse extends js.Object {
    var Items: js.UndefOr[__listOfDeployment]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetDomainNameRequest extends js.Object {
    var DomainName: __string
  }

  @js.native
  @Factory
  trait GetDomainNameResponse extends js.Object {
    var ApiMappingSelectionExpression: js.UndefOr[SelectionExpression]
    var DomainName: js.UndefOr[StringWithLengthBetween1And512]
    var DomainNameConfigurations: js.UndefOr[DomainNameConfigurations]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait GetDomainNamesRequest extends js.Object {
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetDomainNamesResponse extends js.Object {
    var Items: js.UndefOr[__listOfDomainName]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetIntegrationRequest extends js.Object {
    var ApiId: __string
    var IntegrationId: __string
  }

  @js.native
  @Factory
  trait GetIntegrationResponseRequest extends js.Object {
    var ApiId: __string
    var IntegrationId: __string
    var IntegrationResponseId: __string
  }

  @js.native
  @Factory
  trait GetIntegrationResponseResponse extends js.Object {
    var ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy]
    var IntegrationResponseId: js.UndefOr[Id]
    var IntegrationResponseKey: js.UndefOr[SelectionKey]
    var ResponseParameters: js.UndefOr[IntegrationParameters]
    var ResponseTemplates: js.UndefOr[TemplateMap]
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression]
  }

  @js.native
  @Factory
  trait GetIntegrationResponsesRequest extends js.Object {
    var ApiId: __string
    var IntegrationId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetIntegrationResponsesResponse extends js.Object {
    var Items: js.UndefOr[__listOfIntegrationResponse]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetIntegrationResult extends js.Object {
    var ApiGatewayManaged: js.UndefOr[__boolean]
    var ConnectionId: js.UndefOr[StringWithLengthBetween1And1024]
    var ConnectionType: js.UndefOr[ConnectionType]
    var ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy]
    var CredentialsArn: js.UndefOr[Arn]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var IntegrationId: js.UndefOr[Id]
    var IntegrationMethod: js.UndefOr[StringWithLengthBetween1And64]
    var IntegrationResponseSelectionExpression: js.UndefOr[SelectionExpression]
    var IntegrationType: js.UndefOr[IntegrationType]
    var IntegrationUri: js.UndefOr[UriWithLengthBetween1And2048]
    var PassthroughBehavior: js.UndefOr[PassthroughBehavior]
    var PayloadFormatVersion: js.UndefOr[StringWithLengthBetween1And64]
    var RequestParameters: js.UndefOr[IntegrationParameters]
    var RequestTemplates: js.UndefOr[TemplateMap]
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression]
    var TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And29000]
  }

  @js.native
  @Factory
  trait GetIntegrationsRequest extends js.Object {
    var ApiId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetIntegrationsResponse extends js.Object {
    var Items: js.UndefOr[__listOfIntegration]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetModelRequest extends js.Object {
    var ApiId: __string
    var ModelId: __string
  }

  @js.native
  @Factory
  trait GetModelResponse extends js.Object {
    var ContentType: js.UndefOr[StringWithLengthBetween1And256]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var ModelId: js.UndefOr[Id]
    var Name: js.UndefOr[StringWithLengthBetween1And128]
    var Schema: js.UndefOr[StringWithLengthBetween0And32K]
  }

  @js.native
  @Factory
  trait GetModelTemplateRequest extends js.Object {
    var ApiId: __string
    var ModelId: __string
  }

  @js.native
  @Factory
  trait GetModelTemplateResponse extends js.Object {
    var Value: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetModelsRequest extends js.Object {
    var ApiId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetModelsResponse extends js.Object {
    var Items: js.UndefOr[__listOfModel]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetRouteRequest extends js.Object {
    var ApiId: __string
    var RouteId: __string
  }

  @js.native
  @Factory
  trait GetRouteResponseRequest extends js.Object {
    var ApiId: __string
    var RouteId: __string
    var RouteResponseId: __string
  }

  @js.native
  @Factory
  trait GetRouteResponseResponse extends js.Object {
    var ModelSelectionExpression: js.UndefOr[SelectionExpression]
    var ResponseModels: js.UndefOr[RouteModels]
    var ResponseParameters: js.UndefOr[RouteParameters]
    var RouteResponseId: js.UndefOr[Id]
    var RouteResponseKey: js.UndefOr[SelectionKey]
  }

  @js.native
  @Factory
  trait GetRouteResponsesRequest extends js.Object {
    var ApiId: __string
    var RouteId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetRouteResponsesResponse extends js.Object {
    var Items: js.UndefOr[__listOfRouteResponse]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetRouteResult extends js.Object {
    var ApiGatewayManaged: js.UndefOr[__boolean]
    var ApiKeyRequired: js.UndefOr[__boolean]
    var AuthorizationScopes: js.UndefOr[AuthorizationScopes]
    var AuthorizationType: js.UndefOr[AuthorizationType]
    var AuthorizerId: js.UndefOr[Id]
    var ModelSelectionExpression: js.UndefOr[SelectionExpression]
    var OperationName: js.UndefOr[StringWithLengthBetween1And64]
    var RequestModels: js.UndefOr[RouteModels]
    var RequestParameters: js.UndefOr[RouteParameters]
    var RouteId: js.UndefOr[Id]
    var RouteKey: js.UndefOr[SelectionKey]
    var RouteResponseSelectionExpression: js.UndefOr[SelectionExpression]
    var Target: js.UndefOr[StringWithLengthBetween1And128]
  }

  @js.native
  @Factory
  trait GetRoutesRequest extends js.Object {
    var ApiId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetRoutesResponse extends js.Object {
    var Items: js.UndefOr[__listOfRoute]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetStageRequest extends js.Object {
    var ApiId: __string
    var StageName: __string
  }

  @js.native
  @Factory
  trait GetStageResponse extends js.Object {
    var AccessLogSettings: js.UndefOr[AccessLogSettings]
    var ApiGatewayManaged: js.UndefOr[__boolean]
    var AutoDeploy: js.UndefOr[__boolean]
    var ClientCertificateId: js.UndefOr[Id]
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var DefaultRouteSettings: js.UndefOr[RouteSettings]
    var DeploymentId: js.UndefOr[Id]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var LastDeploymentStatusMessage: js.UndefOr[__string]
    var LastUpdatedDate: js.UndefOr[__timestampIso8601]
    var RouteSettings: js.UndefOr[RouteSettingsMap]
    var StageName: js.UndefOr[StringWithLengthBetween1And128]
    var StageVariables: js.UndefOr[StageVariablesMap]
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait GetStagesRequest extends js.Object {
    var ApiId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetStagesResponse extends js.Object {
    var Items: js.UndefOr[__listOfStage]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetTagsRequest extends js.Object {
    var ResourceArn: __string
  }

  @js.native
  @Factory
  trait GetTagsResponse extends js.Object {
    var Tags: Tags
  }

  /**
    */
  @js.native
  @Factory
  trait ImportApiRequest extends js.Object {
    var Body: __string
    var Basepath: js.UndefOr[__string]
    var FailOnWarnings: js.UndefOr[__boolean]
  }

  @js.native
  @Factory
  trait ImportApiResponse extends js.Object {
    var ApiEndpoint: js.UndefOr[__string]
    var ApiId: js.UndefOr[Id]
    var ApiKeySelectionExpression: js.UndefOr[SelectionExpression]
    var CorsConfiguration: js.UndefOr[Cors]
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var DisableSchemaValidation: js.UndefOr[__boolean]
    var ImportInfo: js.UndefOr[__listOf__string]
    var Name: js.UndefOr[StringWithLengthBetween1And128]
    var ProtocolType: js.UndefOr[ProtocolType]
    var RouteSelectionExpression: js.UndefOr[SelectionExpression]
    var Tags: js.UndefOr[Tags]
    var Version: js.UndefOr[StringWithLengthBetween1And64]
    var Warnings: js.UndefOr[__listOf__string]
  }

  /**
    * Represents an integration.
    */
  @js.native
  @Factory
  trait Integration extends js.Object {
    var ApiGatewayManaged: js.UndefOr[__boolean]
    var ConnectionId: js.UndefOr[StringWithLengthBetween1And1024]
    var ConnectionType: js.UndefOr[ConnectionType]
    var ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy]
    var CredentialsArn: js.UndefOr[Arn]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var IntegrationId: js.UndefOr[Id]
    var IntegrationMethod: js.UndefOr[StringWithLengthBetween1And64]
    var IntegrationResponseSelectionExpression: js.UndefOr[SelectionExpression]
    var IntegrationType: js.UndefOr[IntegrationType]
    var IntegrationUri: js.UndefOr[UriWithLengthBetween1And2048]
    var PassthroughBehavior: js.UndefOr[PassthroughBehavior]
    var PayloadFormatVersion: js.UndefOr[StringWithLengthBetween1And64]
    var RequestParameters: js.UndefOr[IntegrationParameters]
    var RequestTemplates: js.UndefOr[TemplateMap]
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression]
    var TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And29000]
  }

  /**
    * Represents an integration response.
    */
  @js.native
  @Factory
  trait IntegrationResponse extends js.Object {
    var IntegrationResponseKey: SelectionKey
    var ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy]
    var IntegrationResponseId: js.UndefOr[Id]
    var ResponseParameters: js.UndefOr[IntegrationParameters]
    var ResponseTemplates: js.UndefOr[TemplateMap]
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression]
  }

  /**
    * Represents an API method integration type.
    */
  @js.native
  sealed trait IntegrationType extends js.Any
  object IntegrationType extends js.Object {
    val AWS        = "AWS".asInstanceOf[IntegrationType]
    val HTTP       = "HTTP".asInstanceOf[IntegrationType]
    val MOCK       = "MOCK".asInstanceOf[IntegrationType]
    val HTTP_PROXY = "HTTP_PROXY".asInstanceOf[IntegrationType]
    val AWS_PROXY  = "AWS_PROXY".asInstanceOf[IntegrationType]

    val values = js.Object.freeze(js.Array(AWS, HTTP, MOCK, HTTP_PROXY, AWS_PROXY))
  }

  /**
    * Represents the configuration of a JWT authorizer. Required for the JWT authorizer type. Supported only for HTTP APIs.
    */
  @js.native
  @Factory
  trait JWTConfiguration extends js.Object {
    var Audience: js.UndefOr[__listOf__string]
    var Issuer: js.UndefOr[UriWithLengthBetween1And2048]
  }

  /**
    * The logging level.
    */
  @js.native
  sealed trait LoggingLevel extends js.Any
  object LoggingLevel extends js.Object {
    val ERROR   = "ERROR".asInstanceOf[LoggingLevel]
    val INFO    = "INFO".asInstanceOf[LoggingLevel]
    val `false` = "false".asInstanceOf[LoggingLevel]

    val values = js.Object.freeze(js.Array(ERROR, INFO, `false`))
  }

  /**
    * Represents a data model for an API. Supported only for WebSocket APIs. See [[https://docs.aws.amazon.com/apigateway/latest/developerguide/models-mappings.html|Create Models and Mapping Templates for Request and Response Mappings]].
    */
  @js.native
  @Factory
  trait Model extends js.Object {
    var Name: StringWithLengthBetween1And128
    var ContentType: js.UndefOr[StringWithLengthBetween1And256]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var ModelId: js.UndefOr[Id]
    var Schema: js.UndefOr[StringWithLengthBetween0And32K]
  }

  /**
    * Validation constraints imposed on parameters of a request (path, query string, headers).
    */
  @js.native
  @Factory
  trait ParameterConstraints extends js.Object {
    var Required: js.UndefOr[__boolean]
  }

  /**
    * Represents passthrough behavior for an integration response. Supported only for WebSocket APIs.
    */
  @js.native
  sealed trait PassthroughBehavior extends js.Any
  object PassthroughBehavior extends js.Object {
    val WHEN_NO_MATCH     = "WHEN_NO_MATCH".asInstanceOf[PassthroughBehavior]
    val NEVER             = "NEVER".asInstanceOf[PassthroughBehavior]
    val WHEN_NO_TEMPLATES = "WHEN_NO_TEMPLATES".asInstanceOf[PassthroughBehavior]

    val values = js.Object.freeze(js.Array(WHEN_NO_MATCH, NEVER, WHEN_NO_TEMPLATES))
  }

  /**
    * Represents a protocol type.
    */
  @js.native
  sealed trait ProtocolType extends js.Any
  object ProtocolType extends js.Object {
    val WEBSOCKET = "WEBSOCKET".asInstanceOf[ProtocolType]
    val HTTP      = "HTTP".asInstanceOf[ProtocolType]

    val values = js.Object.freeze(js.Array(WEBSOCKET, HTTP))
  }

  /**
    */
  @js.native
  @Factory
  trait ReimportApiRequest extends js.Object {
    var ApiId: __string
    var Body: __string
    var Basepath: js.UndefOr[__string]
    var FailOnWarnings: js.UndefOr[__boolean]
  }

  @js.native
  @Factory
  trait ReimportApiResponse extends js.Object {
    var ApiEndpoint: js.UndefOr[__string]
    var ApiId: js.UndefOr[Id]
    var ApiKeySelectionExpression: js.UndefOr[SelectionExpression]
    var CorsConfiguration: js.UndefOr[Cors]
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var DisableSchemaValidation: js.UndefOr[__boolean]
    var ImportInfo: js.UndefOr[__listOf__string]
    var Name: js.UndefOr[StringWithLengthBetween1And128]
    var ProtocolType: js.UndefOr[ProtocolType]
    var RouteSelectionExpression: js.UndefOr[SelectionExpression]
    var Tags: js.UndefOr[Tags]
    var Version: js.UndefOr[StringWithLengthBetween1And64]
    var Warnings: js.UndefOr[__listOf__string]
  }

  /**
    * Represents a route.
    */
  @js.native
  @Factory
  trait Route extends js.Object {
    var RouteKey: SelectionKey
    var ApiGatewayManaged: js.UndefOr[__boolean]
    var ApiKeyRequired: js.UndefOr[__boolean]
    var AuthorizationScopes: js.UndefOr[AuthorizationScopes]
    var AuthorizationType: js.UndefOr[AuthorizationType]
    var AuthorizerId: js.UndefOr[Id]
    var ModelSelectionExpression: js.UndefOr[SelectionExpression]
    var OperationName: js.UndefOr[StringWithLengthBetween1And64]
    var RequestModels: js.UndefOr[RouteModels]
    var RequestParameters: js.UndefOr[RouteParameters]
    var RouteId: js.UndefOr[Id]
    var RouteResponseSelectionExpression: js.UndefOr[SelectionExpression]
    var Target: js.UndefOr[StringWithLengthBetween1And128]
  }

  /**
    * Represents a route response.
    */
  @js.native
  @Factory
  trait RouteResponse extends js.Object {
    var RouteResponseKey: SelectionKey
    var ModelSelectionExpression: js.UndefOr[SelectionExpression]
    var ResponseModels: js.UndefOr[RouteModels]
    var ResponseParameters: js.UndefOr[RouteParameters]
    var RouteResponseId: js.UndefOr[Id]
  }

  /**
    * Represents a collection of route settings.
    */
  @js.native
  @Factory
  trait RouteSettings extends js.Object {
    var DataTraceEnabled: js.UndefOr[__boolean]
    var DetailedMetricsEnabled: js.UndefOr[__boolean]
    var LoggingLevel: js.UndefOr[LoggingLevel]
    var ThrottlingBurstLimit: js.UndefOr[__integer]
    var ThrottlingRateLimit: js.UndefOr[__double]
  }

  /**
    * The Transport Layer Security (TLS) version of the security policy for this domain name. The valid values are TLS_1_0 and TLS_1_2.
    */
  @js.native
  sealed trait SecurityPolicy extends js.Any
  object SecurityPolicy extends js.Object {
    val TLS_1_0 = "TLS_1_0".asInstanceOf[SecurityPolicy]
    val TLS_1_2 = "TLS_1_2".asInstanceOf[SecurityPolicy]

    val values = js.Object.freeze(js.Array(TLS_1_0, TLS_1_2))
  }

  /**
    * Represents an API stage.
    */
  @js.native
  @Factory
  trait Stage extends js.Object {
    var StageName: StringWithLengthBetween1And128
    var AccessLogSettings: js.UndefOr[AccessLogSettings]
    var ApiGatewayManaged: js.UndefOr[__boolean]
    var AutoDeploy: js.UndefOr[__boolean]
    var ClientCertificateId: js.UndefOr[Id]
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var DefaultRouteSettings: js.UndefOr[RouteSettings]
    var DeploymentId: js.UndefOr[Id]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var LastDeploymentStatusMessage: js.UndefOr[__string]
    var LastUpdatedDate: js.UndefOr[__timestampIso8601]
    var RouteSettings: js.UndefOr[RouteSettingsMap]
    var StageVariables: js.UndefOr[StageVariablesMap]
    var Tags: js.UndefOr[Tags]
  }

  /**
    * Creates a new Tag resource to represent a tag.
    */
  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceArn: __string
    var Tags: js.UndefOr[Tags]
  }

  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: __string
    var TagKeys: __listOf__string
  }

  /**
    * Updates an ApiMapping.
    */
  @js.native
  @Factory
  trait UpdateApiMappingRequest extends js.Object {
    var ApiId: Id
    var ApiMappingId: __string
    var DomainName: __string
    var ApiMappingKey: js.UndefOr[SelectionKey]
    var Stage: js.UndefOr[StringWithLengthBetween1And128]
  }

  @js.native
  @Factory
  trait UpdateApiMappingResponse extends js.Object {
    var ApiId: js.UndefOr[Id]
    var ApiMappingId: js.UndefOr[Id]
    var ApiMappingKey: js.UndefOr[SelectionKey]
    var Stage: js.UndefOr[StringWithLengthBetween1And128]
  }

  /**
    * Updates an Api.
    */
  @js.native
  @Factory
  trait UpdateApiRequest extends js.Object {
    var ApiId: __string
    var ApiKeySelectionExpression: js.UndefOr[SelectionExpression]
    var CorsConfiguration: js.UndefOr[Cors]
    var CredentialsArn: js.UndefOr[Arn]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var DisableSchemaValidation: js.UndefOr[__boolean]
    var Name: js.UndefOr[StringWithLengthBetween1And128]
    var RouteKey: js.UndefOr[SelectionKey]
    var RouteSelectionExpression: js.UndefOr[SelectionExpression]
    var Target: js.UndefOr[UriWithLengthBetween1And2048]
    var Version: js.UndefOr[StringWithLengthBetween1And64]
  }

  @js.native
  @Factory
  trait UpdateApiResponse extends js.Object {
    var ApiEndpoint: js.UndefOr[__string]
    var ApiId: js.UndefOr[Id]
    var ApiKeySelectionExpression: js.UndefOr[SelectionExpression]
    var CorsConfiguration: js.UndefOr[Cors]
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var DisableSchemaValidation: js.UndefOr[__boolean]
    var ImportInfo: js.UndefOr[__listOf__string]
    var Name: js.UndefOr[StringWithLengthBetween1And128]
    var ProtocolType: js.UndefOr[ProtocolType]
    var RouteSelectionExpression: js.UndefOr[SelectionExpression]
    var Tags: js.UndefOr[Tags]
    var Version: js.UndefOr[StringWithLengthBetween1And64]
    var Warnings: js.UndefOr[__listOf__string]
  }

  /**
    * Updates an Authorizer.
    */
  @js.native
  @Factory
  trait UpdateAuthorizerRequest extends js.Object {
    var ApiId: __string
    var AuthorizerId: __string
    var AuthorizerCredentialsArn: js.UndefOr[Arn]
    var AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600]
    var AuthorizerType: js.UndefOr[AuthorizerType]
    var AuthorizerUri: js.UndefOr[UriWithLengthBetween1And2048]
    var IdentitySource: js.UndefOr[IdentitySourceList]
    var IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024]
    var JwtConfiguration: js.UndefOr[JWTConfiguration]
    var Name: js.UndefOr[StringWithLengthBetween1And128]
  }

  @js.native
  @Factory
  trait UpdateAuthorizerResponse extends js.Object {
    var AuthorizerCredentialsArn: js.UndefOr[Arn]
    var AuthorizerId: js.UndefOr[Id]
    var AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600]
    var AuthorizerType: js.UndefOr[AuthorizerType]
    var AuthorizerUri: js.UndefOr[UriWithLengthBetween1And2048]
    var IdentitySource: js.UndefOr[IdentitySourceList]
    var IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024]
    var JwtConfiguration: js.UndefOr[JWTConfiguration]
    var Name: js.UndefOr[StringWithLengthBetween1And128]
  }

  /**
    * Updates a Deployment.
    */
  @js.native
  @Factory
  trait UpdateDeploymentRequest extends js.Object {
    var ApiId: __string
    var DeploymentId: __string
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
  }

  @js.native
  @Factory
  trait UpdateDeploymentResponse extends js.Object {
    var AutoDeployed: js.UndefOr[__boolean]
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var DeploymentId: js.UndefOr[Id]
    var DeploymentStatus: js.UndefOr[DeploymentStatus]
    var DeploymentStatusMessage: js.UndefOr[__string]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
  }

  /**
    * Updates a DomainName.
    */
  @js.native
  @Factory
  trait UpdateDomainNameRequest extends js.Object {
    var DomainName: __string
    var DomainNameConfigurations: js.UndefOr[DomainNameConfigurations]
  }

  @js.native
  @Factory
  trait UpdateDomainNameResponse extends js.Object {
    var ApiMappingSelectionExpression: js.UndefOr[SelectionExpression]
    var DomainName: js.UndefOr[StringWithLengthBetween1And512]
    var DomainNameConfigurations: js.UndefOr[DomainNameConfigurations]
    var Tags: js.UndefOr[Tags]
  }

  /**
    * Updates an Integration.
    */
  @js.native
  @Factory
  trait UpdateIntegrationRequest extends js.Object {
    var ApiId: __string
    var IntegrationId: __string
    var ConnectionId: js.UndefOr[StringWithLengthBetween1And1024]
    var ConnectionType: js.UndefOr[ConnectionType]
    var ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy]
    var CredentialsArn: js.UndefOr[Arn]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var IntegrationMethod: js.UndefOr[StringWithLengthBetween1And64]
    var IntegrationType: js.UndefOr[IntegrationType]
    var IntegrationUri: js.UndefOr[UriWithLengthBetween1And2048]
    var PassthroughBehavior: js.UndefOr[PassthroughBehavior]
    var PayloadFormatVersion: js.UndefOr[StringWithLengthBetween1And64]
    var RequestParameters: js.UndefOr[IntegrationParameters]
    var RequestTemplates: js.UndefOr[TemplateMap]
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression]
    var TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And29000]
  }

  /**
    * Updates an IntegrationResponses.
    */
  @js.native
  @Factory
  trait UpdateIntegrationResponseRequest extends js.Object {
    var ApiId: __string
    var IntegrationId: __string
    var IntegrationResponseId: __string
    var ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy]
    var IntegrationResponseKey: js.UndefOr[SelectionKey]
    var ResponseParameters: js.UndefOr[IntegrationParameters]
    var ResponseTemplates: js.UndefOr[TemplateMap]
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression]
  }

  @js.native
  @Factory
  trait UpdateIntegrationResponseResponse extends js.Object {
    var ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy]
    var IntegrationResponseId: js.UndefOr[Id]
    var IntegrationResponseKey: js.UndefOr[SelectionKey]
    var ResponseParameters: js.UndefOr[IntegrationParameters]
    var ResponseTemplates: js.UndefOr[TemplateMap]
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression]
  }

  @js.native
  @Factory
  trait UpdateIntegrationResult extends js.Object {
    var ApiGatewayManaged: js.UndefOr[__boolean]
    var ConnectionId: js.UndefOr[StringWithLengthBetween1And1024]
    var ConnectionType: js.UndefOr[ConnectionType]
    var ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy]
    var CredentialsArn: js.UndefOr[Arn]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var IntegrationId: js.UndefOr[Id]
    var IntegrationMethod: js.UndefOr[StringWithLengthBetween1And64]
    var IntegrationResponseSelectionExpression: js.UndefOr[SelectionExpression]
    var IntegrationType: js.UndefOr[IntegrationType]
    var IntegrationUri: js.UndefOr[UriWithLengthBetween1And2048]
    var PassthroughBehavior: js.UndefOr[PassthroughBehavior]
    var PayloadFormatVersion: js.UndefOr[StringWithLengthBetween1And64]
    var RequestParameters: js.UndefOr[IntegrationParameters]
    var RequestTemplates: js.UndefOr[TemplateMap]
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression]
    var TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And29000]
  }

  /**
    * Updates a Model.
    */
  @js.native
  @Factory
  trait UpdateModelRequest extends js.Object {
    var ApiId: __string
    var ModelId: __string
    var ContentType: js.UndefOr[StringWithLengthBetween1And256]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var Name: js.UndefOr[StringWithLengthBetween1And128]
    var Schema: js.UndefOr[StringWithLengthBetween0And32K]
  }

  @js.native
  @Factory
  trait UpdateModelResponse extends js.Object {
    var ContentType: js.UndefOr[StringWithLengthBetween1And256]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var ModelId: js.UndefOr[Id]
    var Name: js.UndefOr[StringWithLengthBetween1And128]
    var Schema: js.UndefOr[StringWithLengthBetween0And32K]
  }

  /**
    * Updates a Route.
    */
  @js.native
  @Factory
  trait UpdateRouteRequest extends js.Object {
    var ApiId: __string
    var RouteId: __string
    var ApiKeyRequired: js.UndefOr[__boolean]
    var AuthorizationScopes: js.UndefOr[AuthorizationScopes]
    var AuthorizationType: js.UndefOr[AuthorizationType]
    var AuthorizerId: js.UndefOr[Id]
    var ModelSelectionExpression: js.UndefOr[SelectionExpression]
    var OperationName: js.UndefOr[StringWithLengthBetween1And64]
    var RequestModels: js.UndefOr[RouteModels]
    var RequestParameters: js.UndefOr[RouteParameters]
    var RouteKey: js.UndefOr[SelectionKey]
    var RouteResponseSelectionExpression: js.UndefOr[SelectionExpression]
    var Target: js.UndefOr[StringWithLengthBetween1And128]
  }

  /**
    * Updates a RouteResponse.
    */
  @js.native
  @Factory
  trait UpdateRouteResponseRequest extends js.Object {
    var ApiId: __string
    var RouteId: __string
    var RouteResponseId: __string
    var ModelSelectionExpression: js.UndefOr[SelectionExpression]
    var ResponseModels: js.UndefOr[RouteModels]
    var ResponseParameters: js.UndefOr[RouteParameters]
    var RouteResponseKey: js.UndefOr[SelectionKey]
  }

  @js.native
  @Factory
  trait UpdateRouteResponseResponse extends js.Object {
    var ModelSelectionExpression: js.UndefOr[SelectionExpression]
    var ResponseModels: js.UndefOr[RouteModels]
    var ResponseParameters: js.UndefOr[RouteParameters]
    var RouteResponseId: js.UndefOr[Id]
    var RouteResponseKey: js.UndefOr[SelectionKey]
  }

  @js.native
  @Factory
  trait UpdateRouteResult extends js.Object {
    var ApiGatewayManaged: js.UndefOr[__boolean]
    var ApiKeyRequired: js.UndefOr[__boolean]
    var AuthorizationScopes: js.UndefOr[AuthorizationScopes]
    var AuthorizationType: js.UndefOr[AuthorizationType]
    var AuthorizerId: js.UndefOr[Id]
    var ModelSelectionExpression: js.UndefOr[SelectionExpression]
    var OperationName: js.UndefOr[StringWithLengthBetween1And64]
    var RequestModels: js.UndefOr[RouteModels]
    var RequestParameters: js.UndefOr[RouteParameters]
    var RouteId: js.UndefOr[Id]
    var RouteKey: js.UndefOr[SelectionKey]
    var RouteResponseSelectionExpression: js.UndefOr[SelectionExpression]
    var Target: js.UndefOr[StringWithLengthBetween1And128]
  }

  /**
    * Updates a Stage.
    */
  @js.native
  @Factory
  trait UpdateStageRequest extends js.Object {
    var ApiId: __string
    var StageName: __string
    var AccessLogSettings: js.UndefOr[AccessLogSettings]
    var AutoDeploy: js.UndefOr[__boolean]
    var ClientCertificateId: js.UndefOr[Id]
    var DefaultRouteSettings: js.UndefOr[RouteSettings]
    var DeploymentId: js.UndefOr[Id]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var RouteSettings: js.UndefOr[RouteSettingsMap]
    var StageVariables: js.UndefOr[StageVariablesMap]
  }

  @js.native
  @Factory
  trait UpdateStageResponse extends js.Object {
    var AccessLogSettings: js.UndefOr[AccessLogSettings]
    var ApiGatewayManaged: js.UndefOr[__boolean]
    var AutoDeploy: js.UndefOr[__boolean]
    var ClientCertificateId: js.UndefOr[Id]
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var DefaultRouteSettings: js.UndefOr[RouteSettings]
    var DeploymentId: js.UndefOr[Id]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var LastDeploymentStatusMessage: js.UndefOr[__string]
    var LastUpdatedDate: js.UndefOr[__timestampIso8601]
    var RouteSettings: js.UndefOr[RouteSettingsMap]
    var StageName: js.UndefOr[StringWithLengthBetween1And128]
    var StageVariables: js.UndefOr[StageVariablesMap]
    var Tags: js.UndefOr[Tags]
  }
}
