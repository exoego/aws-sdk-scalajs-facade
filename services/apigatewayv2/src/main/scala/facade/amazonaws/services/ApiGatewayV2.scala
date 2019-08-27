package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object apigatewayv2 {
  type Arn                                = String
  type AuthorizationScopes                = js.Array[StringWithLengthBetween1And64]
  type AuthorizationType                  = String
  type AuthorizerType                     = String
  type ConnectionType                     = String
  type ContentHandlingStrategy            = String
  type DeploymentStatus                   = String
  type DomainNameConfigurations           = js.Array[DomainNameConfiguration]
  type DomainNameStatus                   = String
  type EndpointType                       = String
  type Id                                 = String
  type IdentitySourceList                 = js.Array[__string]
  type IntegerWithLengthBetween0And3600   = Int
  type IntegerWithLengthBetween50And29000 = Int
  type IntegrationParameters              = js.Dictionary[StringWithLengthBetween1And512]
  type IntegrationType                    = String
  type LoggingLevel                       = String
  type NextToken                          = String
  type PassthroughBehavior                = String
  type ProtocolType                       = String
  type ProviderArnList                    = js.Array[Arn]
  type RouteModels                        = js.Dictionary[StringWithLengthBetween1And128]
  type RouteParameters                    = js.Dictionary[ParameterConstraints]
  type RouteSettingsMap                   = js.Dictionary[RouteSettings]
  type SecurityPolicy                     = String
  type SelectionExpression                = String
  type SelectionKey                       = String
  type StageVariablesMap                  = js.Dictionary[StringWithLengthBetween0And2048]
  type StringWithLengthBetween0And1024    = String
  type StringWithLengthBetween0And2048    = String
  type StringWithLengthBetween0And32K     = String
  type StringWithLengthBetween1And1024    = String
  type StringWithLengthBetween1And128     = String
  type StringWithLengthBetween1And1600    = String
  type StringWithLengthBetween1And256     = String
  type StringWithLengthBetween1And512     = String
  type StringWithLengthBetween1And64      = String
  type Tags                               = js.Dictionary[StringWithLengthBetween1And1600]
  type TemplateMap                        = js.Dictionary[StringWithLengthBetween0And32K]
  type UriWithLengthBetween1And2048       = String
  type __boolean                          = Boolean
  type __double                           = Double
  type __integer                          = Int
  type __listOfApi                        = js.Array[Api]
  type __listOfApiMapping                 = js.Array[ApiMapping]
  type __listOfAuthorizer                 = js.Array[Authorizer]
  type __listOfDeployment                 = js.Array[Deployment]
  type __listOfDomainName                 = js.Array[DomainName]
  type __listOfIntegration                = js.Array[Integration]
  type __listOfIntegrationResponse        = js.Array[IntegrationResponse]
  type __listOfModel                      = js.Array[Model]
  type __listOfRoute                      = js.Array[Route]
  type __listOfRouteResponse              = js.Array[RouteResponse]
  type __listOfStage                      = js.Array[Stage]
  type __listOf__string                   = js.Array[__string]
  type __mapOf__string                    = js.Dictionary[__string]
  type __string                           = String
  type __timestampIso8601                 = js.Date

  implicit final class ApiGatewayV2Ops(val service: ApiGatewayV2) extends AnyVal {

    def createApiFuture(params: CreateApiRequest): Future[CreateApiResponse] =
      service.createApi(params).promise.toFuture
    def createApiMappingFuture(params: CreateApiMappingRequest): Future[CreateApiMappingResponse] =
      service.createApiMapping(params).promise.toFuture
    def createAuthorizerFuture(params: CreateAuthorizerRequest): Future[CreateAuthorizerResponse] =
      service.createAuthorizer(params).promise.toFuture
    def createDeploymentFuture(params: CreateDeploymentRequest): Future[CreateDeploymentResponse] =
      service.createDeployment(params).promise.toFuture
    def createDomainNameFuture(params: CreateDomainNameRequest): Future[CreateDomainNameResponse] =
      service.createDomainName(params).promise.toFuture
    def createIntegrationFuture(params: CreateIntegrationRequest): Future[CreateIntegrationResponse] =
      service.createIntegration(params).promise.toFuture
    def createIntegrationResponseFuture(
        params: CreateIntegrationResponseRequest
    ): Future[CreateIntegrationResponseResponse] = service.createIntegrationResponse(params).promise.toFuture
    def createModelFuture(params: CreateModelRequest): Future[CreateModelResponse] =
      service.createModel(params).promise.toFuture
    def createRouteFuture(params: CreateRouteRequest): Future[CreateRouteResponse] =
      service.createRoute(params).promise.toFuture
    def createRouteResponseFuture(params: CreateRouteResponseRequest): Future[CreateRouteResponseResponse] =
      service.createRouteResponse(params).promise.toFuture
    def createStageFuture(params: CreateStageRequest): Future[CreateStageResponse] =
      service.createStage(params).promise.toFuture
    def deleteApiFuture(params: DeleteApiRequest): Future[js.Object] = service.deleteApi(params).promise.toFuture
    def deleteApiMappingFuture(params: DeleteApiMappingRequest): Future[js.Object] =
      service.deleteApiMapping(params).promise.toFuture
    def deleteAuthorizerFuture(params: DeleteAuthorizerRequest): Future[js.Object] =
      service.deleteAuthorizer(params).promise.toFuture
    def deleteDeploymentFuture(params: DeleteDeploymentRequest): Future[js.Object] =
      service.deleteDeployment(params).promise.toFuture
    def deleteDomainNameFuture(params: DeleteDomainNameRequest): Future[js.Object] =
      service.deleteDomainName(params).promise.toFuture
    def deleteIntegrationFuture(params: DeleteIntegrationRequest): Future[js.Object] =
      service.deleteIntegration(params).promise.toFuture
    def deleteIntegrationResponseFuture(params: DeleteIntegrationResponseRequest): Future[js.Object] =
      service.deleteIntegrationResponse(params).promise.toFuture
    def deleteModelFuture(params: DeleteModelRequest): Future[js.Object] = service.deleteModel(params).promise.toFuture
    def deleteRouteFuture(params: DeleteRouteRequest): Future[js.Object] = service.deleteRoute(params).promise.toFuture
    def deleteRouteResponseFuture(params: DeleteRouteResponseRequest): Future[js.Object] =
      service.deleteRouteResponse(params).promise.toFuture
    def deleteStageFuture(params: DeleteStageRequest): Future[js.Object] = service.deleteStage(params).promise.toFuture
    def getApiFuture(params: GetApiRequest): Future[GetApiResponse]      = service.getApi(params).promise.toFuture
    def getApiMappingFuture(params: GetApiMappingRequest): Future[GetApiMappingResponse] =
      service.getApiMapping(params).promise.toFuture
    def getApiMappingsFuture(params: GetApiMappingsRequest): Future[GetApiMappingsResponse] =
      service.getApiMappings(params).promise.toFuture
    def getApisFuture(params: GetApisRequest): Future[GetApisResponse] = service.getApis(params).promise.toFuture
    def getAuthorizerFuture(params: GetAuthorizerRequest): Future[GetAuthorizerResponse] =
      service.getAuthorizer(params).promise.toFuture
    def getAuthorizersFuture(params: GetAuthorizersRequest): Future[GetAuthorizersResponse] =
      service.getAuthorizers(params).promise.toFuture
    def getDeploymentFuture(params: GetDeploymentRequest): Future[GetDeploymentResponse] =
      service.getDeployment(params).promise.toFuture
    def getDeploymentsFuture(params: GetDeploymentsRequest): Future[GetDeploymentsResponse] =
      service.getDeployments(params).promise.toFuture
    def getDomainNameFuture(params: GetDomainNameRequest): Future[GetDomainNameResponse] =
      service.getDomainName(params).promise.toFuture
    def getDomainNamesFuture(params: GetDomainNamesRequest): Future[GetDomainNamesResponse] =
      service.getDomainNames(params).promise.toFuture
    def getIntegrationFuture(params: GetIntegrationRequest): Future[GetIntegrationResponse] =
      service.getIntegration(params).promise.toFuture
    def getIntegrationResponseFuture(params: GetIntegrationResponseRequest): Future[GetIntegrationResponseResponse] =
      service.getIntegrationResponse(params).promise.toFuture
    def getIntegrationResponsesFuture(params: GetIntegrationResponsesRequest): Future[GetIntegrationResponsesResponse] =
      service.getIntegrationResponses(params).promise.toFuture
    def getIntegrationsFuture(params: GetIntegrationsRequest): Future[GetIntegrationsResponse] =
      service.getIntegrations(params).promise.toFuture
    def getModelFuture(params: GetModelRequest): Future[GetModelResponse] = service.getModel(params).promise.toFuture
    def getModelTemplateFuture(params: GetModelTemplateRequest): Future[GetModelTemplateResponse] =
      service.getModelTemplate(params).promise.toFuture
    def getModelsFuture(params: GetModelsRequest): Future[GetModelsResponse] =
      service.getModels(params).promise.toFuture
    def getRouteFuture(params: GetRouteRequest): Future[GetRouteResponse] = service.getRoute(params).promise.toFuture
    def getRouteResponseFuture(params: GetRouteResponseRequest): Future[GetRouteResponseResponse] =
      service.getRouteResponse(params).promise.toFuture
    def getRouteResponsesFuture(params: GetRouteResponsesRequest): Future[GetRouteResponsesResponse] =
      service.getRouteResponses(params).promise.toFuture
    def getRoutesFuture(params: GetRoutesRequest): Future[GetRoutesResponse] =
      service.getRoutes(params).promise.toFuture
    def getStageFuture(params: GetStageRequest): Future[GetStageResponse] = service.getStage(params).promise.toFuture
    def getStagesFuture(params: GetStagesRequest): Future[GetStagesResponse] =
      service.getStages(params).promise.toFuture
    def getTagsFuture(params: GetTagsRequest): Future[GetTagsResponse] = service.getTags(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise.toFuture
    def updateApiFuture(params: UpdateApiRequest): Future[UpdateApiResponse] =
      service.updateApi(params).promise.toFuture
    def updateApiMappingFuture(params: UpdateApiMappingRequest): Future[UpdateApiMappingResponse] =
      service.updateApiMapping(params).promise.toFuture
    def updateAuthorizerFuture(params: UpdateAuthorizerRequest): Future[UpdateAuthorizerResponse] =
      service.updateAuthorizer(params).promise.toFuture
    def updateDeploymentFuture(params: UpdateDeploymentRequest): Future[UpdateDeploymentResponse] =
      service.updateDeployment(params).promise.toFuture
    def updateDomainNameFuture(params: UpdateDomainNameRequest): Future[UpdateDomainNameResponse] =
      service.updateDomainName(params).promise.toFuture
    def updateIntegrationFuture(params: UpdateIntegrationRequest): Future[UpdateIntegrationResponse] =
      service.updateIntegration(params).promise.toFuture
    def updateIntegrationResponseFuture(
        params: UpdateIntegrationResponseRequest
    ): Future[UpdateIntegrationResponseResponse] = service.updateIntegrationResponse(params).promise.toFuture
    def updateModelFuture(params: UpdateModelRequest): Future[UpdateModelResponse] =
      service.updateModel(params).promise.toFuture
    def updateRouteFuture(params: UpdateRouteRequest): Future[UpdateRouteResponse] =
      service.updateRoute(params).promise.toFuture
    def updateRouteResponseFuture(params: UpdateRouteResponseRequest): Future[UpdateRouteResponseResponse] =
      service.updateRouteResponse(params).promise.toFuture
    def updateStageFuture(params: UpdateStageRequest): Future[UpdateStageResponse] =
      service.updateStage(params).promise.toFuture
  }
}

package apigatewayv2 {
  @js.native
  @JSImport("aws-sdk", "ApiGatewayV2")
  class ApiGatewayV2() extends js.Object {
    def this(config: AWSConfig) = this()

    def createApi(params: CreateApiRequest): Request[CreateApiResponse]                         = js.native
    def createApiMapping(params: CreateApiMappingRequest): Request[CreateApiMappingResponse]    = js.native
    def createAuthorizer(params: CreateAuthorizerRequest): Request[CreateAuthorizerResponse]    = js.native
    def createDeployment(params: CreateDeploymentRequest): Request[CreateDeploymentResponse]    = js.native
    def createDomainName(params: CreateDomainNameRequest): Request[CreateDomainNameResponse]    = js.native
    def createIntegration(params: CreateIntegrationRequest): Request[CreateIntegrationResponse] = js.native
    def createIntegrationResponse(
        params: CreateIntegrationResponseRequest
    ): Request[CreateIntegrationResponseResponse]                                                     = js.native
    def createModel(params: CreateModelRequest): Request[CreateModelResponse]                         = js.native
    def createRoute(params: CreateRouteRequest): Request[CreateRouteResponse]                         = js.native
    def createRouteResponse(params: CreateRouteResponseRequest): Request[CreateRouteResponseResponse] = js.native
    def createStage(params: CreateStageRequest): Request[CreateStageResponse]                         = js.native
    def deleteApi(params: DeleteApiRequest): Request[js.Object]                                       = js.native
    def deleteApiMapping(params: DeleteApiMappingRequest): Request[js.Object]                         = js.native
    def deleteAuthorizer(params: DeleteAuthorizerRequest): Request[js.Object]                         = js.native
    def deleteDeployment(params: DeleteDeploymentRequest): Request[js.Object]                         = js.native
    def deleteDomainName(params: DeleteDomainNameRequest): Request[js.Object]                         = js.native
    def deleteIntegration(params: DeleteIntegrationRequest): Request[js.Object]                       = js.native
    def deleteIntegrationResponse(params: DeleteIntegrationResponseRequest): Request[js.Object]       = js.native
    def deleteModel(params: DeleteModelRequest): Request[js.Object]                                   = js.native
    def deleteRoute(params: DeleteRouteRequest): Request[js.Object]                                   = js.native
    def deleteRouteResponse(params: DeleteRouteResponseRequest): Request[js.Object]                   = js.native
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
    def getIntegration(params: GetIntegrationRequest): Request[GetIntegrationResponse]                = js.native
    def getIntegrationResponse(params: GetIntegrationResponseRequest): Request[GetIntegrationResponseResponse] =
      js.native
    def getIntegrationResponses(params: GetIntegrationResponsesRequest): Request[GetIntegrationResponsesResponse] =
      js.native
    def getIntegrations(params: GetIntegrationsRequest): Request[GetIntegrationsResponse]       = js.native
    def getModel(params: GetModelRequest): Request[GetModelResponse]                            = js.native
    def getModelTemplate(params: GetModelTemplateRequest): Request[GetModelTemplateResponse]    = js.native
    def getModels(params: GetModelsRequest): Request[GetModelsResponse]                         = js.native
    def getRoute(params: GetRouteRequest): Request[GetRouteResponse]                            = js.native
    def getRouteResponse(params: GetRouteResponseRequest): Request[GetRouteResponseResponse]    = js.native
    def getRouteResponses(params: GetRouteResponsesRequest): Request[GetRouteResponsesResponse] = js.native
    def getRoutes(params: GetRoutesRequest): Request[GetRoutesResponse]                         = js.native
    def getStage(params: GetStageRequest): Request[GetStageResponse]                            = js.native
    def getStages(params: GetStagesRequest): Request[GetStagesResponse]                         = js.native
    def getTags(params: GetTagsRequest): Request[GetTagsResponse]                               = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                   = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object]                         = js.native
    def updateApi(params: UpdateApiRequest): Request[UpdateApiResponse]                         = js.native
    def updateApiMapping(params: UpdateApiMappingRequest): Request[UpdateApiMappingResponse]    = js.native
    def updateAuthorizer(params: UpdateAuthorizerRequest): Request[UpdateAuthorizerResponse]    = js.native
    def updateDeployment(params: UpdateDeploymentRequest): Request[UpdateDeploymentResponse]    = js.native
    def updateDomainName(params: UpdateDomainNameRequest): Request[UpdateDomainNameResponse]    = js.native
    def updateIntegration(params: UpdateIntegrationRequest): Request[UpdateIntegrationResponse] = js.native
    def updateIntegrationResponse(
        params: UpdateIntegrationResponseRequest
    ): Request[UpdateIntegrationResponseResponse]                                                     = js.native
    def updateModel(params: UpdateModelRequest): Request[UpdateModelResponse]                         = js.native
    def updateRoute(params: UpdateRouteRequest): Request[UpdateRouteResponse]                         = js.native
    def updateRouteResponse(params: UpdateRouteResponseRequest): Request[UpdateRouteResponseResponse] = js.native
    def updateStage(params: UpdateStageRequest): Request[UpdateStageResponse]                         = js.native
  }

  /**
    * Settings for logging access in a stage.
    */
  @js.native
  trait AccessLogSettings extends js.Object {
    var DestinationArn: js.UndefOr[Arn]
    var Format: js.UndefOr[StringWithLengthBetween1And1024]
  }

  object AccessLogSettings {
    def apply(
        DestinationArn: js.UndefOr[Arn] = js.undefined,
        Format: js.UndefOr[StringWithLengthBetween1And1024] = js.undefined
    ): AccessLogSettings = {
      val __obj = js.Dictionary.empty[js.Any]
      DestinationArn.foreach(__v => __obj.update("DestinationArn", __v.asInstanceOf[js.Any]))
      Format.foreach(__v => __obj.update("Format", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccessLogSettings]
    }
  }

  /**
    * Represents an API.
    */
  @js.native
  trait Api extends js.Object {
    var Name: StringWithLengthBetween1And128
    var ProtocolType: ProtocolType
    var RouteSelectionExpression: SelectionExpression
    var ApiEndpoint: js.UndefOr[__string]
    var ApiId: js.UndefOr[Id]
    var ApiKeySelectionExpression: js.UndefOr[SelectionExpression]
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var DisableSchemaValidation: js.UndefOr[__boolean]
    var Tags: js.UndefOr[Tags]
    var Version: js.UndefOr[StringWithLengthBetween1And64]
    var Warnings: js.UndefOr[__listOf__string]
  }

  object Api {
    def apply(
        Name: StringWithLengthBetween1And128,
        ProtocolType: ProtocolType,
        RouteSelectionExpression: SelectionExpression,
        ApiEndpoint: js.UndefOr[__string] = js.undefined,
        ApiId: js.UndefOr[Id] = js.undefined,
        ApiKeySelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        DisableSchemaValidation: js.UndefOr[__boolean] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        Version: js.UndefOr[StringWithLengthBetween1And64] = js.undefined,
        Warnings: js.UndefOr[__listOf__string] = js.undefined
    ): Api = {
      val __obj = js.Dictionary[js.Any](
        "Name"                     -> Name.asInstanceOf[js.Any],
        "ProtocolType"             -> ProtocolType.asInstanceOf[js.Any],
        "RouteSelectionExpression" -> RouteSelectionExpression.asInstanceOf[js.Any]
      )

      ApiEndpoint.foreach(__v => __obj.update("ApiEndpoint", __v.asInstanceOf[js.Any]))
      ApiId.foreach(__v => __obj.update("ApiId", __v.asInstanceOf[js.Any]))
      ApiKeySelectionExpression.foreach(__v => __obj.update("ApiKeySelectionExpression", __v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.update("CreatedDate", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      DisableSchemaValidation.foreach(__v => __obj.update("DisableSchemaValidation", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      Warnings.foreach(__v => __obj.update("Warnings", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Api]
    }
  }

  /**
    * Represents an API mapping.
    */
  @js.native
  trait ApiMapping extends js.Object {
    var ApiId: Id
    var Stage: StringWithLengthBetween1And128
    var ApiMappingId: js.UndefOr[Id]
    var ApiMappingKey: js.UndefOr[SelectionKey]
  }

  object ApiMapping {
    def apply(
        ApiId: Id,
        Stage: StringWithLengthBetween1And128,
        ApiMappingId: js.UndefOr[Id] = js.undefined,
        ApiMappingKey: js.UndefOr[SelectionKey] = js.undefined
    ): ApiMapping = {
      val __obj = js.Dictionary[js.Any](
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "Stage" -> Stage.asInstanceOf[js.Any]
      )

      ApiMappingId.foreach(__v => __obj.update("ApiMappingId", __v.asInstanceOf[js.Any]))
      ApiMappingKey.foreach(__v => __obj.update("ApiMappingKey", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApiMapping]
    }
  }

  /**
    * <p>The authorization type. Valid values are NONE for open access,
    *  AWS_IAM for using AWS IAM permissions, and CUSTOM for
    *  using a Lambda authorizer.</p>
    */
  object AuthorizationTypeEnum {
    val NONE    = "NONE"
    val AWS_IAM = "AWS_IAM"
    val CUSTOM  = "CUSTOM"

    val values = IndexedSeq(NONE, AWS_IAM, CUSTOM)
  }

  /**
    * Represents an authorizer.
    */
  @js.native
  trait Authorizer extends js.Object {
    var Name: StringWithLengthBetween1And128
    var AuthorizerCredentialsArn: js.UndefOr[Arn]
    var AuthorizerId: js.UndefOr[Id]
    var AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600]
    var AuthorizerType: js.UndefOr[AuthorizerType]
    var AuthorizerUri: js.UndefOr[UriWithLengthBetween1And2048]
    var IdentitySource: js.UndefOr[IdentitySourceList]
    var IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024]
    var ProviderArns: js.UndefOr[ProviderArnList]
  }

  object Authorizer {
    def apply(
        Name: StringWithLengthBetween1And128,
        AuthorizerCredentialsArn: js.UndefOr[Arn] = js.undefined,
        AuthorizerId: js.UndefOr[Id] = js.undefined,
        AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600] = js.undefined,
        AuthorizerType: js.UndefOr[AuthorizerType] = js.undefined,
        AuthorizerUri: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined,
        IdentitySource: js.UndefOr[IdentitySourceList] = js.undefined,
        IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        ProviderArns: js.UndefOr[ProviderArnList] = js.undefined
    ): Authorizer = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AuthorizerCredentialsArn.foreach(__v => __obj.update("AuthorizerCredentialsArn", __v.asInstanceOf[js.Any]))
      AuthorizerId.foreach(__v => __obj.update("AuthorizerId", __v.asInstanceOf[js.Any]))
      AuthorizerResultTtlInSeconds.foreach(
        __v => __obj.update("AuthorizerResultTtlInSeconds", __v.asInstanceOf[js.Any])
      )
      AuthorizerType.foreach(__v => __obj.update("AuthorizerType", __v.asInstanceOf[js.Any]))
      AuthorizerUri.foreach(__v => __obj.update("AuthorizerUri", __v.asInstanceOf[js.Any]))
      IdentitySource.foreach(__v => __obj.update("IdentitySource", __v.asInstanceOf[js.Any]))
      IdentityValidationExpression.foreach(
        __v => __obj.update("IdentityValidationExpression", __v.asInstanceOf[js.Any])
      )
      ProviderArns.foreach(__v => __obj.update("ProviderArns", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Authorizer]
    }
  }

  /**
    * <p>The authorizer type. Currently the only valid value is REQUEST, for a
    *  Lambda function using incoming request parameters.</p>
    */
  object AuthorizerTypeEnum {
    val REQUEST = "REQUEST"

    val values = IndexedSeq(REQUEST)
  }

  /**
    * Represents a connection type.
    */
  object ConnectionTypeEnum {
    val INTERNET = "INTERNET"
    val VPC_LINK = "VPC_LINK"

    val values = IndexedSeq(INTERNET, VPC_LINK)
  }

  /**
    * Specifies how to handle response payload content type conversions.
    */
  object ContentHandlingStrategyEnum {
    val CONVERT_TO_BINARY = "CONVERT_TO_BINARY"
    val CONVERT_TO_TEXT   = "CONVERT_TO_TEXT"

    val values = IndexedSeq(CONVERT_TO_BINARY, CONVERT_TO_TEXT)
  }

  @js.native
  trait CreateApiMappingRequest extends js.Object {
    var ApiId: Id
    var DomainName: __string
    var Stage: StringWithLengthBetween1And128
    var ApiMappingKey: js.UndefOr[SelectionKey]
  }

  object CreateApiMappingRequest {
    def apply(
        ApiId: Id,
        DomainName: __string,
        Stage: StringWithLengthBetween1And128,
        ApiMappingKey: js.UndefOr[SelectionKey] = js.undefined
    ): CreateApiMappingRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"      -> ApiId.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "Stage"      -> Stage.asInstanceOf[js.Any]
      )

      ApiMappingKey.foreach(__v => __obj.update("ApiMappingKey", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApiMappingRequest]
    }
  }

  @js.native
  trait CreateApiMappingResponse extends js.Object {
    var ApiId: js.UndefOr[Id]
    var ApiMappingId: js.UndefOr[Id]
    var ApiMappingKey: js.UndefOr[SelectionKey]
    var Stage: js.UndefOr[StringWithLengthBetween1And128]
  }

  object CreateApiMappingResponse {
    def apply(
        ApiId: js.UndefOr[Id] = js.undefined,
        ApiMappingId: js.UndefOr[Id] = js.undefined,
        ApiMappingKey: js.UndefOr[SelectionKey] = js.undefined,
        Stage: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    ): CreateApiMappingResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ApiId.foreach(__v => __obj.update("ApiId", __v.asInstanceOf[js.Any]))
      ApiMappingId.foreach(__v => __obj.update("ApiMappingId", __v.asInstanceOf[js.Any]))
      ApiMappingKey.foreach(__v => __obj.update("ApiMappingKey", __v.asInstanceOf[js.Any]))
      Stage.foreach(__v => __obj.update("Stage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApiMappingResponse]
    }
  }

  @js.native
  trait CreateApiRequest extends js.Object {
    var Name: StringWithLengthBetween1And128
    var ProtocolType: ProtocolType
    var RouteSelectionExpression: SelectionExpression
    var ApiKeySelectionExpression: js.UndefOr[SelectionExpression]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var DisableSchemaValidation: js.UndefOr[__boolean]
    var Tags: js.UndefOr[Tags]
    var Version: js.UndefOr[StringWithLengthBetween1And64]
  }

  object CreateApiRequest {
    def apply(
        Name: StringWithLengthBetween1And128,
        ProtocolType: ProtocolType,
        RouteSelectionExpression: SelectionExpression,
        ApiKeySelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        DisableSchemaValidation: js.UndefOr[__boolean] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        Version: js.UndefOr[StringWithLengthBetween1And64] = js.undefined
    ): CreateApiRequest = {
      val __obj = js.Dictionary[js.Any](
        "Name"                     -> Name.asInstanceOf[js.Any],
        "ProtocolType"             -> ProtocolType.asInstanceOf[js.Any],
        "RouteSelectionExpression" -> RouteSelectionExpression.asInstanceOf[js.Any]
      )

      ApiKeySelectionExpression.foreach(__v => __obj.update("ApiKeySelectionExpression", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      DisableSchemaValidation.foreach(__v => __obj.update("DisableSchemaValidation", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApiRequest]
    }
  }

  @js.native
  trait CreateApiResponse extends js.Object {
    var ApiEndpoint: js.UndefOr[__string]
    var ApiId: js.UndefOr[Id]
    var ApiKeySelectionExpression: js.UndefOr[SelectionExpression]
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var DisableSchemaValidation: js.UndefOr[__boolean]
    var Name: js.UndefOr[StringWithLengthBetween1And128]
    var ProtocolType: js.UndefOr[ProtocolType]
    var RouteSelectionExpression: js.UndefOr[SelectionExpression]
    var Tags: js.UndefOr[Tags]
    var Version: js.UndefOr[StringWithLengthBetween1And64]
    var Warnings: js.UndefOr[__listOf__string]
  }

  object CreateApiResponse {
    def apply(
        ApiEndpoint: js.UndefOr[__string] = js.undefined,
        ApiId: js.UndefOr[Id] = js.undefined,
        ApiKeySelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        DisableSchemaValidation: js.UndefOr[__boolean] = js.undefined,
        Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined,
        ProtocolType: js.UndefOr[ProtocolType] = js.undefined,
        RouteSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        Version: js.UndefOr[StringWithLengthBetween1And64] = js.undefined,
        Warnings: js.UndefOr[__listOf__string] = js.undefined
    ): CreateApiResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ApiEndpoint.foreach(__v => __obj.update("ApiEndpoint", __v.asInstanceOf[js.Any]))
      ApiId.foreach(__v => __obj.update("ApiId", __v.asInstanceOf[js.Any]))
      ApiKeySelectionExpression.foreach(__v => __obj.update("ApiKeySelectionExpression", __v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.update("CreatedDate", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      DisableSchemaValidation.foreach(__v => __obj.update("DisableSchemaValidation", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      ProtocolType.foreach(__v => __obj.update("ProtocolType", __v.asInstanceOf[js.Any]))
      RouteSelectionExpression.foreach(__v => __obj.update("RouteSelectionExpression", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      Warnings.foreach(__v => __obj.update("Warnings", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApiResponse]
    }
  }

  @js.native
  trait CreateAuthorizerRequest extends js.Object {
    var ApiId: __string
    var AuthorizerType: AuthorizerType
    var AuthorizerUri: UriWithLengthBetween1And2048
    var IdentitySource: IdentitySourceList
    var Name: StringWithLengthBetween1And128
    var AuthorizerCredentialsArn: js.UndefOr[Arn]
    var AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600]
    var IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024]
    var ProviderArns: js.UndefOr[ProviderArnList]
  }

  object CreateAuthorizerRequest {
    def apply(
        ApiId: __string,
        AuthorizerType: AuthorizerType,
        AuthorizerUri: UriWithLengthBetween1And2048,
        IdentitySource: IdentitySourceList,
        Name: StringWithLengthBetween1And128,
        AuthorizerCredentialsArn: js.UndefOr[Arn] = js.undefined,
        AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600] = js.undefined,
        IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        ProviderArns: js.UndefOr[ProviderArnList] = js.undefined
    ): CreateAuthorizerRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"          -> ApiId.asInstanceOf[js.Any],
        "AuthorizerType" -> AuthorizerType.asInstanceOf[js.Any],
        "AuthorizerUri"  -> AuthorizerUri.asInstanceOf[js.Any],
        "IdentitySource" -> IdentitySource.asInstanceOf[js.Any],
        "Name"           -> Name.asInstanceOf[js.Any]
      )

      AuthorizerCredentialsArn.foreach(__v => __obj.update("AuthorizerCredentialsArn", __v.asInstanceOf[js.Any]))
      AuthorizerResultTtlInSeconds.foreach(
        __v => __obj.update("AuthorizerResultTtlInSeconds", __v.asInstanceOf[js.Any])
      )
      IdentityValidationExpression.foreach(
        __v => __obj.update("IdentityValidationExpression", __v.asInstanceOf[js.Any])
      )
      ProviderArns.foreach(__v => __obj.update("ProviderArns", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAuthorizerRequest]
    }
  }

  @js.native
  trait CreateAuthorizerResponse extends js.Object {
    var AuthorizerCredentialsArn: js.UndefOr[Arn]
    var AuthorizerId: js.UndefOr[Id]
    var AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600]
    var AuthorizerType: js.UndefOr[AuthorizerType]
    var AuthorizerUri: js.UndefOr[UriWithLengthBetween1And2048]
    var IdentitySource: js.UndefOr[IdentitySourceList]
    var IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024]
    var Name: js.UndefOr[StringWithLengthBetween1And128]
    var ProviderArns: js.UndefOr[ProviderArnList]
  }

  object CreateAuthorizerResponse {
    def apply(
        AuthorizerCredentialsArn: js.UndefOr[Arn] = js.undefined,
        AuthorizerId: js.UndefOr[Id] = js.undefined,
        AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600] = js.undefined,
        AuthorizerType: js.UndefOr[AuthorizerType] = js.undefined,
        AuthorizerUri: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined,
        IdentitySource: js.UndefOr[IdentitySourceList] = js.undefined,
        IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined,
        ProviderArns: js.UndefOr[ProviderArnList] = js.undefined
    ): CreateAuthorizerResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AuthorizerCredentialsArn.foreach(__v => __obj.update("AuthorizerCredentialsArn", __v.asInstanceOf[js.Any]))
      AuthorizerId.foreach(__v => __obj.update("AuthorizerId", __v.asInstanceOf[js.Any]))
      AuthorizerResultTtlInSeconds.foreach(
        __v => __obj.update("AuthorizerResultTtlInSeconds", __v.asInstanceOf[js.Any])
      )
      AuthorizerType.foreach(__v => __obj.update("AuthorizerType", __v.asInstanceOf[js.Any]))
      AuthorizerUri.foreach(__v => __obj.update("AuthorizerUri", __v.asInstanceOf[js.Any]))
      IdentitySource.foreach(__v => __obj.update("IdentitySource", __v.asInstanceOf[js.Any]))
      IdentityValidationExpression.foreach(
        __v => __obj.update("IdentityValidationExpression", __v.asInstanceOf[js.Any])
      )
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      ProviderArns.foreach(__v => __obj.update("ProviderArns", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAuthorizerResponse]
    }
  }

  @js.native
  trait CreateDeploymentRequest extends js.Object {
    var ApiId: __string
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var StageName: js.UndefOr[StringWithLengthBetween1And128]
  }

  object CreateDeploymentRequest {
    def apply(
        ApiId: __string,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        StageName: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    ): CreateDeploymentRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId" -> ApiId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      StageName.foreach(__v => __obj.update("StageName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeploymentRequest]
    }
  }

  @js.native
  trait CreateDeploymentResponse extends js.Object {
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var DeploymentId: js.UndefOr[Id]
    var DeploymentStatus: js.UndefOr[DeploymentStatus]
    var DeploymentStatusMessage: js.UndefOr[__string]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
  }

  object CreateDeploymentResponse {
    def apply(
        CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        DeploymentId: js.UndefOr[Id] = js.undefined,
        DeploymentStatus: js.UndefOr[DeploymentStatus] = js.undefined,
        DeploymentStatusMessage: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    ): CreateDeploymentResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      CreatedDate.foreach(__v => __obj.update("CreatedDate", __v.asInstanceOf[js.Any]))
      DeploymentId.foreach(__v => __obj.update("DeploymentId", __v.asInstanceOf[js.Any]))
      DeploymentStatus.foreach(__v => __obj.update("DeploymentStatus", __v.asInstanceOf[js.Any]))
      DeploymentStatusMessage.foreach(__v => __obj.update("DeploymentStatusMessage", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeploymentResponse]
    }
  }

  @js.native
  trait CreateDomainNameRequest extends js.Object {
    var DomainName: StringWithLengthBetween1And512
    var DomainNameConfigurations: js.UndefOr[DomainNameConfigurations]
    var Tags: js.UndefOr[Tags]
  }

  object CreateDomainNameRequest {
    def apply(
        DomainName: StringWithLengthBetween1And512,
        DomainNameConfigurations: js.UndefOr[DomainNameConfigurations] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateDomainNameRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      DomainNameConfigurations.foreach(__v => __obj.update("DomainNameConfigurations", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDomainNameRequest]
    }
  }

  @js.native
  trait CreateDomainNameResponse extends js.Object {
    var ApiMappingSelectionExpression: js.UndefOr[SelectionExpression]
    var DomainName: js.UndefOr[StringWithLengthBetween1And512]
    var DomainNameConfigurations: js.UndefOr[DomainNameConfigurations]
    var Tags: js.UndefOr[Tags]
  }

  object CreateDomainNameResponse {
    def apply(
        ApiMappingSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        DomainName: js.UndefOr[StringWithLengthBetween1And512] = js.undefined,
        DomainNameConfigurations: js.UndefOr[DomainNameConfigurations] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateDomainNameResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ApiMappingSelectionExpression.foreach(
        __v => __obj.update("ApiMappingSelectionExpression", __v.asInstanceOf[js.Any])
      )
      DomainName.foreach(__v => __obj.update("DomainName", __v.asInstanceOf[js.Any]))
      DomainNameConfigurations.foreach(__v => __obj.update("DomainNameConfigurations", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDomainNameResponse]
    }
  }

  @js.native
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
    var RequestParameters: js.UndefOr[IntegrationParameters]
    var RequestTemplates: js.UndefOr[TemplateMap]
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression]
    var TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And29000]
  }

  object CreateIntegrationRequest {
    def apply(
        ApiId: __string,
        IntegrationType: IntegrationType,
        ConnectionId: js.UndefOr[StringWithLengthBetween1And1024] = js.undefined,
        ConnectionType: js.UndefOr[ConnectionType] = js.undefined,
        ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy] = js.undefined,
        CredentialsArn: js.UndefOr[Arn] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        IntegrationMethod: js.UndefOr[StringWithLengthBetween1And64] = js.undefined,
        IntegrationUri: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined,
        PassthroughBehavior: js.UndefOr[PassthroughBehavior] = js.undefined,
        RequestParameters: js.UndefOr[IntegrationParameters] = js.undefined,
        RequestTemplates: js.UndefOr[TemplateMap] = js.undefined,
        TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And29000] = js.undefined
    ): CreateIntegrationRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"           -> ApiId.asInstanceOf[js.Any],
        "IntegrationType" -> IntegrationType.asInstanceOf[js.Any]
      )

      ConnectionId.foreach(__v => __obj.update("ConnectionId", __v.asInstanceOf[js.Any]))
      ConnectionType.foreach(__v => __obj.update("ConnectionType", __v.asInstanceOf[js.Any]))
      ContentHandlingStrategy.foreach(__v => __obj.update("ContentHandlingStrategy", __v.asInstanceOf[js.Any]))
      CredentialsArn.foreach(__v => __obj.update("CredentialsArn", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      IntegrationMethod.foreach(__v => __obj.update("IntegrationMethod", __v.asInstanceOf[js.Any]))
      IntegrationUri.foreach(__v => __obj.update("IntegrationUri", __v.asInstanceOf[js.Any]))
      PassthroughBehavior.foreach(__v => __obj.update("PassthroughBehavior", __v.asInstanceOf[js.Any]))
      RequestParameters.foreach(__v => __obj.update("RequestParameters", __v.asInstanceOf[js.Any]))
      RequestTemplates.foreach(__v => __obj.update("RequestTemplates", __v.asInstanceOf[js.Any]))
      TemplateSelectionExpression.foreach(__v => __obj.update("TemplateSelectionExpression", __v.asInstanceOf[js.Any]))
      TimeoutInMillis.foreach(__v => __obj.update("TimeoutInMillis", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateIntegrationRequest]
    }
  }

  @js.native
  trait CreateIntegrationResponse extends js.Object {
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
    var RequestParameters: js.UndefOr[IntegrationParameters]
    var RequestTemplates: js.UndefOr[TemplateMap]
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression]
    var TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And29000]
  }

  object CreateIntegrationResponse {
    def apply(
        ConnectionId: js.UndefOr[StringWithLengthBetween1And1024] = js.undefined,
        ConnectionType: js.UndefOr[ConnectionType] = js.undefined,
        ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy] = js.undefined,
        CredentialsArn: js.UndefOr[Arn] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        IntegrationId: js.UndefOr[Id] = js.undefined,
        IntegrationMethod: js.UndefOr[StringWithLengthBetween1And64] = js.undefined,
        IntegrationResponseSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        IntegrationType: js.UndefOr[IntegrationType] = js.undefined,
        IntegrationUri: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined,
        PassthroughBehavior: js.UndefOr[PassthroughBehavior] = js.undefined,
        RequestParameters: js.UndefOr[IntegrationParameters] = js.undefined,
        RequestTemplates: js.UndefOr[TemplateMap] = js.undefined,
        TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And29000] = js.undefined
    ): CreateIntegrationResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ConnectionId.foreach(__v => __obj.update("ConnectionId", __v.asInstanceOf[js.Any]))
      ConnectionType.foreach(__v => __obj.update("ConnectionType", __v.asInstanceOf[js.Any]))
      ContentHandlingStrategy.foreach(__v => __obj.update("ContentHandlingStrategy", __v.asInstanceOf[js.Any]))
      CredentialsArn.foreach(__v => __obj.update("CredentialsArn", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      IntegrationId.foreach(__v => __obj.update("IntegrationId", __v.asInstanceOf[js.Any]))
      IntegrationMethod.foreach(__v => __obj.update("IntegrationMethod", __v.asInstanceOf[js.Any]))
      IntegrationResponseSelectionExpression.foreach(
        __v => __obj.update("IntegrationResponseSelectionExpression", __v.asInstanceOf[js.Any])
      )
      IntegrationType.foreach(__v => __obj.update("IntegrationType", __v.asInstanceOf[js.Any]))
      IntegrationUri.foreach(__v => __obj.update("IntegrationUri", __v.asInstanceOf[js.Any]))
      PassthroughBehavior.foreach(__v => __obj.update("PassthroughBehavior", __v.asInstanceOf[js.Any]))
      RequestParameters.foreach(__v => __obj.update("RequestParameters", __v.asInstanceOf[js.Any]))
      RequestTemplates.foreach(__v => __obj.update("RequestTemplates", __v.asInstanceOf[js.Any]))
      TemplateSelectionExpression.foreach(__v => __obj.update("TemplateSelectionExpression", __v.asInstanceOf[js.Any]))
      TimeoutInMillis.foreach(__v => __obj.update("TimeoutInMillis", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateIntegrationResponse]
    }
  }

  @js.native
  trait CreateIntegrationResponseRequest extends js.Object {
    var ApiId: __string
    var IntegrationId: __string
    var IntegrationResponseKey: SelectionKey
    var ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy]
    var ResponseParameters: js.UndefOr[IntegrationParameters]
    var ResponseTemplates: js.UndefOr[TemplateMap]
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression]
  }

  object CreateIntegrationResponseRequest {
    def apply(
        ApiId: __string,
        IntegrationId: __string,
        IntegrationResponseKey: SelectionKey,
        ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy] = js.undefined,
        ResponseParameters: js.UndefOr[IntegrationParameters] = js.undefined,
        ResponseTemplates: js.UndefOr[TemplateMap] = js.undefined,
        TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    ): CreateIntegrationResponseRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"                  -> ApiId.asInstanceOf[js.Any],
        "IntegrationId"          -> IntegrationId.asInstanceOf[js.Any],
        "IntegrationResponseKey" -> IntegrationResponseKey.asInstanceOf[js.Any]
      )

      ContentHandlingStrategy.foreach(__v => __obj.update("ContentHandlingStrategy", __v.asInstanceOf[js.Any]))
      ResponseParameters.foreach(__v => __obj.update("ResponseParameters", __v.asInstanceOf[js.Any]))
      ResponseTemplates.foreach(__v => __obj.update("ResponseTemplates", __v.asInstanceOf[js.Any]))
      TemplateSelectionExpression.foreach(__v => __obj.update("TemplateSelectionExpression", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateIntegrationResponseRequest]
    }
  }

  @js.native
  trait CreateIntegrationResponseResponse extends js.Object {
    var ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy]
    var IntegrationResponseId: js.UndefOr[Id]
    var IntegrationResponseKey: js.UndefOr[SelectionKey]
    var ResponseParameters: js.UndefOr[IntegrationParameters]
    var ResponseTemplates: js.UndefOr[TemplateMap]
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression]
  }

  object CreateIntegrationResponseResponse {
    def apply(
        ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy] = js.undefined,
        IntegrationResponseId: js.UndefOr[Id] = js.undefined,
        IntegrationResponseKey: js.UndefOr[SelectionKey] = js.undefined,
        ResponseParameters: js.UndefOr[IntegrationParameters] = js.undefined,
        ResponseTemplates: js.UndefOr[TemplateMap] = js.undefined,
        TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    ): CreateIntegrationResponseResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ContentHandlingStrategy.foreach(__v => __obj.update("ContentHandlingStrategy", __v.asInstanceOf[js.Any]))
      IntegrationResponseId.foreach(__v => __obj.update("IntegrationResponseId", __v.asInstanceOf[js.Any]))
      IntegrationResponseKey.foreach(__v => __obj.update("IntegrationResponseKey", __v.asInstanceOf[js.Any]))
      ResponseParameters.foreach(__v => __obj.update("ResponseParameters", __v.asInstanceOf[js.Any]))
      ResponseTemplates.foreach(__v => __obj.update("ResponseTemplates", __v.asInstanceOf[js.Any]))
      TemplateSelectionExpression.foreach(__v => __obj.update("TemplateSelectionExpression", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateIntegrationResponseResponse]
    }
  }

  @js.native
  trait CreateModelRequest extends js.Object {
    var ApiId: __string
    var Name: StringWithLengthBetween1And128
    var Schema: StringWithLengthBetween0And32K
    var ContentType: js.UndefOr[StringWithLengthBetween1And256]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
  }

  object CreateModelRequest {
    def apply(
        ApiId: __string,
        Name: StringWithLengthBetween1And128,
        Schema: StringWithLengthBetween0And32K,
        ContentType: js.UndefOr[StringWithLengthBetween1And256] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    ): CreateModelRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"  -> ApiId.asInstanceOf[js.Any],
        "Name"   -> Name.asInstanceOf[js.Any],
        "Schema" -> Schema.asInstanceOf[js.Any]
      )

      ContentType.foreach(__v => __obj.update("ContentType", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateModelRequest]
    }
  }

  @js.native
  trait CreateModelResponse extends js.Object {
    var ContentType: js.UndefOr[StringWithLengthBetween1And256]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var ModelId: js.UndefOr[Id]
    var Name: js.UndefOr[StringWithLengthBetween1And128]
    var Schema: js.UndefOr[StringWithLengthBetween0And32K]
  }

  object CreateModelResponse {
    def apply(
        ContentType: js.UndefOr[StringWithLengthBetween1And256] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        ModelId: js.UndefOr[Id] = js.undefined,
        Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined,
        Schema: js.UndefOr[StringWithLengthBetween0And32K] = js.undefined
    ): CreateModelResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ContentType.foreach(__v => __obj.update("ContentType", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      ModelId.foreach(__v => __obj.update("ModelId", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Schema.foreach(__v => __obj.update("Schema", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateModelResponse]
    }
  }

  @js.native
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

  object CreateRouteRequest {
    def apply(
        ApiId: __string,
        RouteKey: SelectionKey,
        ApiKeyRequired: js.UndefOr[__boolean] = js.undefined,
        AuthorizationScopes: js.UndefOr[AuthorizationScopes] = js.undefined,
        AuthorizationType: js.UndefOr[AuthorizationType] = js.undefined,
        AuthorizerId: js.UndefOr[Id] = js.undefined,
        ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        OperationName: js.UndefOr[StringWithLengthBetween1And64] = js.undefined,
        RequestModels: js.UndefOr[RouteModels] = js.undefined,
        RequestParameters: js.UndefOr[RouteParameters] = js.undefined,
        RouteResponseSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        Target: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    ): CreateRouteRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"    -> ApiId.asInstanceOf[js.Any],
        "RouteKey" -> RouteKey.asInstanceOf[js.Any]
      )

      ApiKeyRequired.foreach(__v => __obj.update("ApiKeyRequired", __v.asInstanceOf[js.Any]))
      AuthorizationScopes.foreach(__v => __obj.update("AuthorizationScopes", __v.asInstanceOf[js.Any]))
      AuthorizationType.foreach(__v => __obj.update("AuthorizationType", __v.asInstanceOf[js.Any]))
      AuthorizerId.foreach(__v => __obj.update("AuthorizerId", __v.asInstanceOf[js.Any]))
      ModelSelectionExpression.foreach(__v => __obj.update("ModelSelectionExpression", __v.asInstanceOf[js.Any]))
      OperationName.foreach(__v => __obj.update("OperationName", __v.asInstanceOf[js.Any]))
      RequestModels.foreach(__v => __obj.update("RequestModels", __v.asInstanceOf[js.Any]))
      RequestParameters.foreach(__v => __obj.update("RequestParameters", __v.asInstanceOf[js.Any]))
      RouteResponseSelectionExpression.foreach(
        __v => __obj.update("RouteResponseSelectionExpression", __v.asInstanceOf[js.Any])
      )
      Target.foreach(__v => __obj.update("Target", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRouteRequest]
    }
  }

  @js.native
  trait CreateRouteResponse extends js.Object {
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

  object CreateRouteResponse {
    def apply(
        ApiKeyRequired: js.UndefOr[__boolean] = js.undefined,
        AuthorizationScopes: js.UndefOr[AuthorizationScopes] = js.undefined,
        AuthorizationType: js.UndefOr[AuthorizationType] = js.undefined,
        AuthorizerId: js.UndefOr[Id] = js.undefined,
        ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        OperationName: js.UndefOr[StringWithLengthBetween1And64] = js.undefined,
        RequestModels: js.UndefOr[RouteModels] = js.undefined,
        RequestParameters: js.UndefOr[RouteParameters] = js.undefined,
        RouteId: js.UndefOr[Id] = js.undefined,
        RouteKey: js.UndefOr[SelectionKey] = js.undefined,
        RouteResponseSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        Target: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    ): CreateRouteResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ApiKeyRequired.foreach(__v => __obj.update("ApiKeyRequired", __v.asInstanceOf[js.Any]))
      AuthorizationScopes.foreach(__v => __obj.update("AuthorizationScopes", __v.asInstanceOf[js.Any]))
      AuthorizationType.foreach(__v => __obj.update("AuthorizationType", __v.asInstanceOf[js.Any]))
      AuthorizerId.foreach(__v => __obj.update("AuthorizerId", __v.asInstanceOf[js.Any]))
      ModelSelectionExpression.foreach(__v => __obj.update("ModelSelectionExpression", __v.asInstanceOf[js.Any]))
      OperationName.foreach(__v => __obj.update("OperationName", __v.asInstanceOf[js.Any]))
      RequestModels.foreach(__v => __obj.update("RequestModels", __v.asInstanceOf[js.Any]))
      RequestParameters.foreach(__v => __obj.update("RequestParameters", __v.asInstanceOf[js.Any]))
      RouteId.foreach(__v => __obj.update("RouteId", __v.asInstanceOf[js.Any]))
      RouteKey.foreach(__v => __obj.update("RouteKey", __v.asInstanceOf[js.Any]))
      RouteResponseSelectionExpression.foreach(
        __v => __obj.update("RouteResponseSelectionExpression", __v.asInstanceOf[js.Any])
      )
      Target.foreach(__v => __obj.update("Target", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRouteResponse]
    }
  }

  @js.native
  trait CreateRouteResponseRequest extends js.Object {
    var ApiId: __string
    var RouteId: __string
    var RouteResponseKey: SelectionKey
    var ModelSelectionExpression: js.UndefOr[SelectionExpression]
    var ResponseModels: js.UndefOr[RouteModels]
    var ResponseParameters: js.UndefOr[RouteParameters]
  }

  object CreateRouteResponseRequest {
    def apply(
        ApiId: __string,
        RouteId: __string,
        RouteResponseKey: SelectionKey,
        ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        ResponseModels: js.UndefOr[RouteModels] = js.undefined,
        ResponseParameters: js.UndefOr[RouteParameters] = js.undefined
    ): CreateRouteResponseRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"            -> ApiId.asInstanceOf[js.Any],
        "RouteId"          -> RouteId.asInstanceOf[js.Any],
        "RouteResponseKey" -> RouteResponseKey.asInstanceOf[js.Any]
      )

      ModelSelectionExpression.foreach(__v => __obj.update("ModelSelectionExpression", __v.asInstanceOf[js.Any]))
      ResponseModels.foreach(__v => __obj.update("ResponseModels", __v.asInstanceOf[js.Any]))
      ResponseParameters.foreach(__v => __obj.update("ResponseParameters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRouteResponseRequest]
    }
  }

  @js.native
  trait CreateRouteResponseResponse extends js.Object {
    var ModelSelectionExpression: js.UndefOr[SelectionExpression]
    var ResponseModels: js.UndefOr[RouteModels]
    var ResponseParameters: js.UndefOr[RouteParameters]
    var RouteResponseId: js.UndefOr[Id]
    var RouteResponseKey: js.UndefOr[SelectionKey]
  }

  object CreateRouteResponseResponse {
    def apply(
        ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        ResponseModels: js.UndefOr[RouteModels] = js.undefined,
        ResponseParameters: js.UndefOr[RouteParameters] = js.undefined,
        RouteResponseId: js.UndefOr[Id] = js.undefined,
        RouteResponseKey: js.UndefOr[SelectionKey] = js.undefined
    ): CreateRouteResponseResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ModelSelectionExpression.foreach(__v => __obj.update("ModelSelectionExpression", __v.asInstanceOf[js.Any]))
      ResponseModels.foreach(__v => __obj.update("ResponseModels", __v.asInstanceOf[js.Any]))
      ResponseParameters.foreach(__v => __obj.update("ResponseParameters", __v.asInstanceOf[js.Any]))
      RouteResponseId.foreach(__v => __obj.update("RouteResponseId", __v.asInstanceOf[js.Any]))
      RouteResponseKey.foreach(__v => __obj.update("RouteResponseKey", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRouteResponseResponse]
    }
  }

  @js.native
  trait CreateStageRequest extends js.Object {
    var ApiId: __string
    var StageName: StringWithLengthBetween1And128
    var AccessLogSettings: js.UndefOr[AccessLogSettings]
    var ClientCertificateId: js.UndefOr[Id]
    var DefaultRouteSettings: js.UndefOr[RouteSettings]
    var DeploymentId: js.UndefOr[Id]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var RouteSettings: js.UndefOr[RouteSettingsMap]
    var StageVariables: js.UndefOr[StageVariablesMap]
    var Tags: js.UndefOr[Tags]
  }

  object CreateStageRequest {
    def apply(
        ApiId: __string,
        StageName: StringWithLengthBetween1And128,
        AccessLogSettings: js.UndefOr[AccessLogSettings] = js.undefined,
        ClientCertificateId: js.UndefOr[Id] = js.undefined,
        DefaultRouteSettings: js.UndefOr[RouteSettings] = js.undefined,
        DeploymentId: js.UndefOr[Id] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        RouteSettings: js.UndefOr[RouteSettingsMap] = js.undefined,
        StageVariables: js.UndefOr[StageVariablesMap] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateStageRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"     -> ApiId.asInstanceOf[js.Any],
        "StageName" -> StageName.asInstanceOf[js.Any]
      )

      AccessLogSettings.foreach(__v => __obj.update("AccessLogSettings", __v.asInstanceOf[js.Any]))
      ClientCertificateId.foreach(__v => __obj.update("ClientCertificateId", __v.asInstanceOf[js.Any]))
      DefaultRouteSettings.foreach(__v => __obj.update("DefaultRouteSettings", __v.asInstanceOf[js.Any]))
      DeploymentId.foreach(__v => __obj.update("DeploymentId", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      RouteSettings.foreach(__v => __obj.update("RouteSettings", __v.asInstanceOf[js.Any]))
      StageVariables.foreach(__v => __obj.update("StageVariables", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStageRequest]
    }
  }

  @js.native
  trait CreateStageResponse extends js.Object {
    var AccessLogSettings: js.UndefOr[AccessLogSettings]
    var ClientCertificateId: js.UndefOr[Id]
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var DefaultRouteSettings: js.UndefOr[RouteSettings]
    var DeploymentId: js.UndefOr[Id]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var LastUpdatedDate: js.UndefOr[__timestampIso8601]
    var RouteSettings: js.UndefOr[RouteSettingsMap]
    var StageName: js.UndefOr[StringWithLengthBetween1And128]
    var StageVariables: js.UndefOr[StageVariablesMap]
    var Tags: js.UndefOr[Tags]
  }

  object CreateStageResponse {
    def apply(
        AccessLogSettings: js.UndefOr[AccessLogSettings] = js.undefined,
        ClientCertificateId: js.UndefOr[Id] = js.undefined,
        CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        DefaultRouteSettings: js.UndefOr[RouteSettings] = js.undefined,
        DeploymentId: js.UndefOr[Id] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        LastUpdatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        RouteSettings: js.UndefOr[RouteSettingsMap] = js.undefined,
        StageName: js.UndefOr[StringWithLengthBetween1And128] = js.undefined,
        StageVariables: js.UndefOr[StageVariablesMap] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateStageResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AccessLogSettings.foreach(__v => __obj.update("AccessLogSettings", __v.asInstanceOf[js.Any]))
      ClientCertificateId.foreach(__v => __obj.update("ClientCertificateId", __v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.update("CreatedDate", __v.asInstanceOf[js.Any]))
      DefaultRouteSettings.foreach(__v => __obj.update("DefaultRouteSettings", __v.asInstanceOf[js.Any]))
      DeploymentId.foreach(__v => __obj.update("DeploymentId", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      LastUpdatedDate.foreach(__v => __obj.update("LastUpdatedDate", __v.asInstanceOf[js.Any]))
      RouteSettings.foreach(__v => __obj.update("RouteSettings", __v.asInstanceOf[js.Any]))
      StageName.foreach(__v => __obj.update("StageName", __v.asInstanceOf[js.Any]))
      StageVariables.foreach(__v => __obj.update("StageVariables", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStageResponse]
    }
  }

  @js.native
  trait DeleteApiMappingRequest extends js.Object {
    var ApiMappingId: __string
    var DomainName: __string
  }

  object DeleteApiMappingRequest {
    def apply(
        ApiMappingId: __string,
        DomainName: __string
    ): DeleteApiMappingRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiMappingId" -> ApiMappingId.asInstanceOf[js.Any],
        "DomainName"   -> DomainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteApiMappingRequest]
    }
  }

  @js.native
  trait DeleteApiRequest extends js.Object {
    var ApiId: __string
  }

  object DeleteApiRequest {
    def apply(
        ApiId: __string
    ): DeleteApiRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId" -> ApiId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteApiRequest]
    }
  }

  @js.native
  trait DeleteAuthorizerRequest extends js.Object {
    var ApiId: __string
    var AuthorizerId: __string
  }

  object DeleteAuthorizerRequest {
    def apply(
        ApiId: __string,
        AuthorizerId: __string
    ): DeleteAuthorizerRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"        -> ApiId.asInstanceOf[js.Any],
        "AuthorizerId" -> AuthorizerId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteAuthorizerRequest]
    }
  }

  @js.native
  trait DeleteDeploymentRequest extends js.Object {
    var ApiId: __string
    var DeploymentId: __string
  }

  object DeleteDeploymentRequest {
    def apply(
        ApiId: __string,
        DeploymentId: __string
    ): DeleteDeploymentRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"        -> ApiId.asInstanceOf[js.Any],
        "DeploymentId" -> DeploymentId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDeploymentRequest]
    }
  }

  @js.native
  trait DeleteDomainNameRequest extends js.Object {
    var DomainName: __string
  }

  object DeleteDomainNameRequest {
    def apply(
        DomainName: __string
    ): DeleteDomainNameRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDomainNameRequest]
    }
  }

  @js.native
  trait DeleteIntegrationRequest extends js.Object {
    var ApiId: __string
    var IntegrationId: __string
  }

  object DeleteIntegrationRequest {
    def apply(
        ApiId: __string,
        IntegrationId: __string
    ): DeleteIntegrationRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"         -> ApiId.asInstanceOf[js.Any],
        "IntegrationId" -> IntegrationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteIntegrationRequest]
    }
  }

  @js.native
  trait DeleteIntegrationResponseRequest extends js.Object {
    var ApiId: __string
    var IntegrationId: __string
    var IntegrationResponseId: __string
  }

  object DeleteIntegrationResponseRequest {
    def apply(
        ApiId: __string,
        IntegrationId: __string,
        IntegrationResponseId: __string
    ): DeleteIntegrationResponseRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"                 -> ApiId.asInstanceOf[js.Any],
        "IntegrationId"         -> IntegrationId.asInstanceOf[js.Any],
        "IntegrationResponseId" -> IntegrationResponseId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteIntegrationResponseRequest]
    }
  }

  @js.native
  trait DeleteModelRequest extends js.Object {
    var ApiId: __string
    var ModelId: __string
  }

  object DeleteModelRequest {
    def apply(
        ApiId: __string,
        ModelId: __string
    ): DeleteModelRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"   -> ApiId.asInstanceOf[js.Any],
        "ModelId" -> ModelId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteModelRequest]
    }
  }

  @js.native
  trait DeleteRouteRequest extends js.Object {
    var ApiId: __string
    var RouteId: __string
  }

  object DeleteRouteRequest {
    def apply(
        ApiId: __string,
        RouteId: __string
    ): DeleteRouteRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"   -> ApiId.asInstanceOf[js.Any],
        "RouteId" -> RouteId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteRouteRequest]
    }
  }

  @js.native
  trait DeleteRouteResponseRequest extends js.Object {
    var ApiId: __string
    var RouteId: __string
    var RouteResponseId: __string
  }

  object DeleteRouteResponseRequest {
    def apply(
        ApiId: __string,
        RouteId: __string,
        RouteResponseId: __string
    ): DeleteRouteResponseRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"           -> ApiId.asInstanceOf[js.Any],
        "RouteId"         -> RouteId.asInstanceOf[js.Any],
        "RouteResponseId" -> RouteResponseId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteRouteResponseRequest]
    }
  }

  @js.native
  trait DeleteStageRequest extends js.Object {
    var ApiId: __string
    var StageName: __string
  }

  object DeleteStageRequest {
    def apply(
        ApiId: __string,
        StageName: __string
    ): DeleteStageRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"     -> ApiId.asInstanceOf[js.Any],
        "StageName" -> StageName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteStageRequest]
    }
  }

  /**
    * <p>An immutable representation of an API that can be called by users. A
    *  Deployment must be associated with a Stage for it to be
    *  callable over the internet.</p>
    */
  @js.native
  trait Deployment extends js.Object {
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var DeploymentId: js.UndefOr[Id]
    var DeploymentStatus: js.UndefOr[DeploymentStatus]
    var DeploymentStatusMessage: js.UndefOr[__string]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
  }

  object Deployment {
    def apply(
        CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        DeploymentId: js.UndefOr[Id] = js.undefined,
        DeploymentStatus: js.UndefOr[DeploymentStatus] = js.undefined,
        DeploymentStatusMessage: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    ): Deployment = {
      val __obj = js.Dictionary.empty[js.Any]
      CreatedDate.foreach(__v => __obj.update("CreatedDate", __v.asInstanceOf[js.Any]))
      DeploymentId.foreach(__v => __obj.update("DeploymentId", __v.asInstanceOf[js.Any]))
      DeploymentStatus.foreach(__v => __obj.update("DeploymentStatus", __v.asInstanceOf[js.Any]))
      DeploymentStatusMessage.foreach(__v => __obj.update("DeploymentStatusMessage", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Deployment]
    }
  }

  /**
    * Represents a deployment status.
    */
  object DeploymentStatusEnum {
    val PENDING  = "PENDING"
    val FAILED   = "FAILED"
    val DEPLOYED = "DEPLOYED"

    val values = IndexedSeq(PENDING, FAILED, DEPLOYED)
  }

  /**
    * Represents a domain name.
    */
  @js.native
  trait DomainName extends js.Object {
    var DomainName: StringWithLengthBetween1And512
    var ApiMappingSelectionExpression: js.UndefOr[SelectionExpression]
    var DomainNameConfigurations: js.UndefOr[DomainNameConfigurations]
    var Tags: js.UndefOr[Tags]
  }

  object DomainName {
    def apply(
        DomainName: StringWithLengthBetween1And512,
        ApiMappingSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        DomainNameConfigurations: js.UndefOr[DomainNameConfigurations] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): DomainName = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      ApiMappingSelectionExpression.foreach(
        __v => __obj.update("ApiMappingSelectionExpression", __v.asInstanceOf[js.Any])
      )
      DomainNameConfigurations.foreach(__v => __obj.update("DomainNameConfigurations", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainName]
    }
  }

  /**
    * The domain name configuration.
    */
  @js.native
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

  object DomainNameConfiguration {
    def apply(
        ApiGatewayDomainName: js.UndefOr[__string] = js.undefined,
        CertificateArn: js.UndefOr[Arn] = js.undefined,
        CertificateName: js.UndefOr[StringWithLengthBetween1And128] = js.undefined,
        CertificateUploadDate: js.UndefOr[__timestampIso8601] = js.undefined,
        DomainNameStatus: js.UndefOr[DomainNameStatus] = js.undefined,
        DomainNameStatusMessage: js.UndefOr[__string] = js.undefined,
        EndpointType: js.UndefOr[EndpointType] = js.undefined,
        HostedZoneId: js.UndefOr[__string] = js.undefined,
        SecurityPolicy: js.UndefOr[SecurityPolicy] = js.undefined
    ): DomainNameConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      ApiGatewayDomainName.foreach(__v => __obj.update("ApiGatewayDomainName", __v.asInstanceOf[js.Any]))
      CertificateArn.foreach(__v => __obj.update("CertificateArn", __v.asInstanceOf[js.Any]))
      CertificateName.foreach(__v => __obj.update("CertificateName", __v.asInstanceOf[js.Any]))
      CertificateUploadDate.foreach(__v => __obj.update("CertificateUploadDate", __v.asInstanceOf[js.Any]))
      DomainNameStatus.foreach(__v => __obj.update("DomainNameStatus", __v.asInstanceOf[js.Any]))
      DomainNameStatusMessage.foreach(__v => __obj.update("DomainNameStatusMessage", __v.asInstanceOf[js.Any]))
      EndpointType.foreach(__v => __obj.update("EndpointType", __v.asInstanceOf[js.Any]))
      HostedZoneId.foreach(__v => __obj.update("HostedZoneId", __v.asInstanceOf[js.Any]))
      SecurityPolicy.foreach(__v => __obj.update("SecurityPolicy", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainNameConfiguration]
    }
  }

  /**
    * The status of the domain name migration. The valid values are AVAILABLE and UPDATING. If the status is UPDATING, the domain cannot be modified further until the existing operation is complete. If it is AVAILABLE, the domain can be updated.
    */
  object DomainNameStatusEnum {
    val AVAILABLE = "AVAILABLE"
    val UPDATING  = "UPDATING"

    val values = IndexedSeq(AVAILABLE, UPDATING)
  }

  /**
    * Represents an endpoint type.
    */
  object EndpointTypeEnum {
    val REGIONAL = "REGIONAL"
    val EDGE     = "EDGE"

    val values = IndexedSeq(REGIONAL, EDGE)
  }

  @js.native
  trait GetApiMappingRequest extends js.Object {
    var ApiMappingId: __string
    var DomainName: __string
  }

  object GetApiMappingRequest {
    def apply(
        ApiMappingId: __string,
        DomainName: __string
    ): GetApiMappingRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiMappingId" -> ApiMappingId.asInstanceOf[js.Any],
        "DomainName"   -> DomainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetApiMappingRequest]
    }
  }

  @js.native
  trait GetApiMappingResponse extends js.Object {
    var ApiId: js.UndefOr[Id]
    var ApiMappingId: js.UndefOr[Id]
    var ApiMappingKey: js.UndefOr[SelectionKey]
    var Stage: js.UndefOr[StringWithLengthBetween1And128]
  }

  object GetApiMappingResponse {
    def apply(
        ApiId: js.UndefOr[Id] = js.undefined,
        ApiMappingId: js.UndefOr[Id] = js.undefined,
        ApiMappingKey: js.UndefOr[SelectionKey] = js.undefined,
        Stage: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    ): GetApiMappingResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ApiId.foreach(__v => __obj.update("ApiId", __v.asInstanceOf[js.Any]))
      ApiMappingId.foreach(__v => __obj.update("ApiMappingId", __v.asInstanceOf[js.Any]))
      ApiMappingKey.foreach(__v => __obj.update("ApiMappingKey", __v.asInstanceOf[js.Any]))
      Stage.foreach(__v => __obj.update("Stage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetApiMappingResponse]
    }
  }

  @js.native
  trait GetApiMappingsRequest extends js.Object {
    var DomainName: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object GetApiMappingsRequest {
    def apply(
        DomainName: __string,
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): GetApiMappingsRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetApiMappingsRequest]
    }
  }

  @js.native
  trait GetApiMappingsResponse extends js.Object {
    var Items: js.UndefOr[__listOfApiMapping]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetApiMappingsResponse {
    def apply(
        Items: js.UndefOr[__listOfApiMapping] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetApiMappingsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetApiMappingsResponse]
    }
  }

  @js.native
  trait GetApiRequest extends js.Object {
    var ApiId: __string
  }

  object GetApiRequest {
    def apply(
        ApiId: __string
    ): GetApiRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId" -> ApiId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetApiRequest]
    }
  }

  @js.native
  trait GetApiResponse extends js.Object {
    var ApiEndpoint: js.UndefOr[__string]
    var ApiId: js.UndefOr[Id]
    var ApiKeySelectionExpression: js.UndefOr[SelectionExpression]
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var DisableSchemaValidation: js.UndefOr[__boolean]
    var Name: js.UndefOr[StringWithLengthBetween1And128]
    var ProtocolType: js.UndefOr[ProtocolType]
    var RouteSelectionExpression: js.UndefOr[SelectionExpression]
    var Tags: js.UndefOr[Tags]
    var Version: js.UndefOr[StringWithLengthBetween1And64]
    var Warnings: js.UndefOr[__listOf__string]
  }

  object GetApiResponse {
    def apply(
        ApiEndpoint: js.UndefOr[__string] = js.undefined,
        ApiId: js.UndefOr[Id] = js.undefined,
        ApiKeySelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        DisableSchemaValidation: js.UndefOr[__boolean] = js.undefined,
        Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined,
        ProtocolType: js.UndefOr[ProtocolType] = js.undefined,
        RouteSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        Version: js.UndefOr[StringWithLengthBetween1And64] = js.undefined,
        Warnings: js.UndefOr[__listOf__string] = js.undefined
    ): GetApiResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ApiEndpoint.foreach(__v => __obj.update("ApiEndpoint", __v.asInstanceOf[js.Any]))
      ApiId.foreach(__v => __obj.update("ApiId", __v.asInstanceOf[js.Any]))
      ApiKeySelectionExpression.foreach(__v => __obj.update("ApiKeySelectionExpression", __v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.update("CreatedDate", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      DisableSchemaValidation.foreach(__v => __obj.update("DisableSchemaValidation", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      ProtocolType.foreach(__v => __obj.update("ProtocolType", __v.asInstanceOf[js.Any]))
      RouteSelectionExpression.foreach(__v => __obj.update("RouteSelectionExpression", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      Warnings.foreach(__v => __obj.update("Warnings", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetApiResponse]
    }
  }

  @js.native
  trait GetApisRequest extends js.Object {
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object GetApisRequest {
    def apply(
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): GetApisRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetApisRequest]
    }
  }

  @js.native
  trait GetApisResponse extends js.Object {
    var Items: js.UndefOr[__listOfApi]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetApisResponse {
    def apply(
        Items: js.UndefOr[__listOfApi] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetApisResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetApisResponse]
    }
  }

  @js.native
  trait GetAuthorizerRequest extends js.Object {
    var ApiId: __string
    var AuthorizerId: __string
  }

  object GetAuthorizerRequest {
    def apply(
        ApiId: __string,
        AuthorizerId: __string
    ): GetAuthorizerRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"        -> ApiId.asInstanceOf[js.Any],
        "AuthorizerId" -> AuthorizerId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetAuthorizerRequest]
    }
  }

  @js.native
  trait GetAuthorizerResponse extends js.Object {
    var AuthorizerCredentialsArn: js.UndefOr[Arn]
    var AuthorizerId: js.UndefOr[Id]
    var AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600]
    var AuthorizerType: js.UndefOr[AuthorizerType]
    var AuthorizerUri: js.UndefOr[UriWithLengthBetween1And2048]
    var IdentitySource: js.UndefOr[IdentitySourceList]
    var IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024]
    var Name: js.UndefOr[StringWithLengthBetween1And128]
    var ProviderArns: js.UndefOr[ProviderArnList]
  }

  object GetAuthorizerResponse {
    def apply(
        AuthorizerCredentialsArn: js.UndefOr[Arn] = js.undefined,
        AuthorizerId: js.UndefOr[Id] = js.undefined,
        AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600] = js.undefined,
        AuthorizerType: js.UndefOr[AuthorizerType] = js.undefined,
        AuthorizerUri: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined,
        IdentitySource: js.UndefOr[IdentitySourceList] = js.undefined,
        IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined,
        ProviderArns: js.UndefOr[ProviderArnList] = js.undefined
    ): GetAuthorizerResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AuthorizerCredentialsArn.foreach(__v => __obj.update("AuthorizerCredentialsArn", __v.asInstanceOf[js.Any]))
      AuthorizerId.foreach(__v => __obj.update("AuthorizerId", __v.asInstanceOf[js.Any]))
      AuthorizerResultTtlInSeconds.foreach(
        __v => __obj.update("AuthorizerResultTtlInSeconds", __v.asInstanceOf[js.Any])
      )
      AuthorizerType.foreach(__v => __obj.update("AuthorizerType", __v.asInstanceOf[js.Any]))
      AuthorizerUri.foreach(__v => __obj.update("AuthorizerUri", __v.asInstanceOf[js.Any]))
      IdentitySource.foreach(__v => __obj.update("IdentitySource", __v.asInstanceOf[js.Any]))
      IdentityValidationExpression.foreach(
        __v => __obj.update("IdentityValidationExpression", __v.asInstanceOf[js.Any])
      )
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      ProviderArns.foreach(__v => __obj.update("ProviderArns", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAuthorizerResponse]
    }
  }

  @js.native
  trait GetAuthorizersRequest extends js.Object {
    var ApiId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object GetAuthorizersRequest {
    def apply(
        ApiId: __string,
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): GetAuthorizersRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId" -> ApiId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAuthorizersRequest]
    }
  }

  @js.native
  trait GetAuthorizersResponse extends js.Object {
    var Items: js.UndefOr[__listOfAuthorizer]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetAuthorizersResponse {
    def apply(
        Items: js.UndefOr[__listOfAuthorizer] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetAuthorizersResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAuthorizersResponse]
    }
  }

  @js.native
  trait GetDeploymentRequest extends js.Object {
    var ApiId: __string
    var DeploymentId: __string
  }

  object GetDeploymentRequest {
    def apply(
        ApiId: __string,
        DeploymentId: __string
    ): GetDeploymentRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"        -> ApiId.asInstanceOf[js.Any],
        "DeploymentId" -> DeploymentId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDeploymentRequest]
    }
  }

  @js.native
  trait GetDeploymentResponse extends js.Object {
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var DeploymentId: js.UndefOr[Id]
    var DeploymentStatus: js.UndefOr[DeploymentStatus]
    var DeploymentStatusMessage: js.UndefOr[__string]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
  }

  object GetDeploymentResponse {
    def apply(
        CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        DeploymentId: js.UndefOr[Id] = js.undefined,
        DeploymentStatus: js.UndefOr[DeploymentStatus] = js.undefined,
        DeploymentStatusMessage: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    ): GetDeploymentResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      CreatedDate.foreach(__v => __obj.update("CreatedDate", __v.asInstanceOf[js.Any]))
      DeploymentId.foreach(__v => __obj.update("DeploymentId", __v.asInstanceOf[js.Any]))
      DeploymentStatus.foreach(__v => __obj.update("DeploymentStatus", __v.asInstanceOf[js.Any]))
      DeploymentStatusMessage.foreach(__v => __obj.update("DeploymentStatusMessage", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeploymentResponse]
    }
  }

  @js.native
  trait GetDeploymentsRequest extends js.Object {
    var ApiId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object GetDeploymentsRequest {
    def apply(
        ApiId: __string,
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): GetDeploymentsRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId" -> ApiId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeploymentsRequest]
    }
  }

  @js.native
  trait GetDeploymentsResponse extends js.Object {
    var Items: js.UndefOr[__listOfDeployment]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetDeploymentsResponse {
    def apply(
        Items: js.UndefOr[__listOfDeployment] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetDeploymentsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeploymentsResponse]
    }
  }

  @js.native
  trait GetDomainNameRequest extends js.Object {
    var DomainName: __string
  }

  object GetDomainNameRequest {
    def apply(
        DomainName: __string
    ): GetDomainNameRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDomainNameRequest]
    }
  }

  @js.native
  trait GetDomainNameResponse extends js.Object {
    var ApiMappingSelectionExpression: js.UndefOr[SelectionExpression]
    var DomainName: js.UndefOr[StringWithLengthBetween1And512]
    var DomainNameConfigurations: js.UndefOr[DomainNameConfigurations]
    var Tags: js.UndefOr[Tags]
  }

  object GetDomainNameResponse {
    def apply(
        ApiMappingSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        DomainName: js.UndefOr[StringWithLengthBetween1And512] = js.undefined,
        DomainNameConfigurations: js.UndefOr[DomainNameConfigurations] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): GetDomainNameResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ApiMappingSelectionExpression.foreach(
        __v => __obj.update("ApiMappingSelectionExpression", __v.asInstanceOf[js.Any])
      )
      DomainName.foreach(__v => __obj.update("DomainName", __v.asInstanceOf[js.Any]))
      DomainNameConfigurations.foreach(__v => __obj.update("DomainNameConfigurations", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDomainNameResponse]
    }
  }

  @js.native
  trait GetDomainNamesRequest extends js.Object {
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object GetDomainNamesRequest {
    def apply(
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): GetDomainNamesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDomainNamesRequest]
    }
  }

  @js.native
  trait GetDomainNamesResponse extends js.Object {
    var Items: js.UndefOr[__listOfDomainName]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetDomainNamesResponse {
    def apply(
        Items: js.UndefOr[__listOfDomainName] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetDomainNamesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDomainNamesResponse]
    }
  }

  @js.native
  trait GetIntegrationRequest extends js.Object {
    var ApiId: __string
    var IntegrationId: __string
  }

  object GetIntegrationRequest {
    def apply(
        ApiId: __string,
        IntegrationId: __string
    ): GetIntegrationRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"         -> ApiId.asInstanceOf[js.Any],
        "IntegrationId" -> IntegrationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetIntegrationRequest]
    }
  }

  @js.native
  trait GetIntegrationResponse extends js.Object {
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
    var RequestParameters: js.UndefOr[IntegrationParameters]
    var RequestTemplates: js.UndefOr[TemplateMap]
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression]
    var TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And29000]
  }

  object GetIntegrationResponse {
    def apply(
        ConnectionId: js.UndefOr[StringWithLengthBetween1And1024] = js.undefined,
        ConnectionType: js.UndefOr[ConnectionType] = js.undefined,
        ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy] = js.undefined,
        CredentialsArn: js.UndefOr[Arn] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        IntegrationId: js.UndefOr[Id] = js.undefined,
        IntegrationMethod: js.UndefOr[StringWithLengthBetween1And64] = js.undefined,
        IntegrationResponseSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        IntegrationType: js.UndefOr[IntegrationType] = js.undefined,
        IntegrationUri: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined,
        PassthroughBehavior: js.UndefOr[PassthroughBehavior] = js.undefined,
        RequestParameters: js.UndefOr[IntegrationParameters] = js.undefined,
        RequestTemplates: js.UndefOr[TemplateMap] = js.undefined,
        TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And29000] = js.undefined
    ): GetIntegrationResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ConnectionId.foreach(__v => __obj.update("ConnectionId", __v.asInstanceOf[js.Any]))
      ConnectionType.foreach(__v => __obj.update("ConnectionType", __v.asInstanceOf[js.Any]))
      ContentHandlingStrategy.foreach(__v => __obj.update("ContentHandlingStrategy", __v.asInstanceOf[js.Any]))
      CredentialsArn.foreach(__v => __obj.update("CredentialsArn", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      IntegrationId.foreach(__v => __obj.update("IntegrationId", __v.asInstanceOf[js.Any]))
      IntegrationMethod.foreach(__v => __obj.update("IntegrationMethod", __v.asInstanceOf[js.Any]))
      IntegrationResponseSelectionExpression.foreach(
        __v => __obj.update("IntegrationResponseSelectionExpression", __v.asInstanceOf[js.Any])
      )
      IntegrationType.foreach(__v => __obj.update("IntegrationType", __v.asInstanceOf[js.Any]))
      IntegrationUri.foreach(__v => __obj.update("IntegrationUri", __v.asInstanceOf[js.Any]))
      PassthroughBehavior.foreach(__v => __obj.update("PassthroughBehavior", __v.asInstanceOf[js.Any]))
      RequestParameters.foreach(__v => __obj.update("RequestParameters", __v.asInstanceOf[js.Any]))
      RequestTemplates.foreach(__v => __obj.update("RequestTemplates", __v.asInstanceOf[js.Any]))
      TemplateSelectionExpression.foreach(__v => __obj.update("TemplateSelectionExpression", __v.asInstanceOf[js.Any]))
      TimeoutInMillis.foreach(__v => __obj.update("TimeoutInMillis", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetIntegrationResponse]
    }
  }

  @js.native
  trait GetIntegrationResponseRequest extends js.Object {
    var ApiId: __string
    var IntegrationId: __string
    var IntegrationResponseId: __string
  }

  object GetIntegrationResponseRequest {
    def apply(
        ApiId: __string,
        IntegrationId: __string,
        IntegrationResponseId: __string
    ): GetIntegrationResponseRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"                 -> ApiId.asInstanceOf[js.Any],
        "IntegrationId"         -> IntegrationId.asInstanceOf[js.Any],
        "IntegrationResponseId" -> IntegrationResponseId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetIntegrationResponseRequest]
    }
  }

  @js.native
  trait GetIntegrationResponseResponse extends js.Object {
    var ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy]
    var IntegrationResponseId: js.UndefOr[Id]
    var IntegrationResponseKey: js.UndefOr[SelectionKey]
    var ResponseParameters: js.UndefOr[IntegrationParameters]
    var ResponseTemplates: js.UndefOr[TemplateMap]
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression]
  }

  object GetIntegrationResponseResponse {
    def apply(
        ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy] = js.undefined,
        IntegrationResponseId: js.UndefOr[Id] = js.undefined,
        IntegrationResponseKey: js.UndefOr[SelectionKey] = js.undefined,
        ResponseParameters: js.UndefOr[IntegrationParameters] = js.undefined,
        ResponseTemplates: js.UndefOr[TemplateMap] = js.undefined,
        TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    ): GetIntegrationResponseResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ContentHandlingStrategy.foreach(__v => __obj.update("ContentHandlingStrategy", __v.asInstanceOf[js.Any]))
      IntegrationResponseId.foreach(__v => __obj.update("IntegrationResponseId", __v.asInstanceOf[js.Any]))
      IntegrationResponseKey.foreach(__v => __obj.update("IntegrationResponseKey", __v.asInstanceOf[js.Any]))
      ResponseParameters.foreach(__v => __obj.update("ResponseParameters", __v.asInstanceOf[js.Any]))
      ResponseTemplates.foreach(__v => __obj.update("ResponseTemplates", __v.asInstanceOf[js.Any]))
      TemplateSelectionExpression.foreach(__v => __obj.update("TemplateSelectionExpression", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetIntegrationResponseResponse]
    }
  }

  @js.native
  trait GetIntegrationResponsesRequest extends js.Object {
    var ApiId: __string
    var IntegrationId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object GetIntegrationResponsesRequest {
    def apply(
        ApiId: __string,
        IntegrationId: __string,
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): GetIntegrationResponsesRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"         -> ApiId.asInstanceOf[js.Any],
        "IntegrationId" -> IntegrationId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetIntegrationResponsesRequest]
    }
  }

  @js.native
  trait GetIntegrationResponsesResponse extends js.Object {
    var Items: js.UndefOr[__listOfIntegrationResponse]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetIntegrationResponsesResponse {
    def apply(
        Items: js.UndefOr[__listOfIntegrationResponse] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetIntegrationResponsesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetIntegrationResponsesResponse]
    }
  }

  @js.native
  trait GetIntegrationsRequest extends js.Object {
    var ApiId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object GetIntegrationsRequest {
    def apply(
        ApiId: __string,
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): GetIntegrationsRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId" -> ApiId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetIntegrationsRequest]
    }
  }

  @js.native
  trait GetIntegrationsResponse extends js.Object {
    var Items: js.UndefOr[__listOfIntegration]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetIntegrationsResponse {
    def apply(
        Items: js.UndefOr[__listOfIntegration] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetIntegrationsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetIntegrationsResponse]
    }
  }

  @js.native
  trait GetModelRequest extends js.Object {
    var ApiId: __string
    var ModelId: __string
  }

  object GetModelRequest {
    def apply(
        ApiId: __string,
        ModelId: __string
    ): GetModelRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"   -> ApiId.asInstanceOf[js.Any],
        "ModelId" -> ModelId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetModelRequest]
    }
  }

  @js.native
  trait GetModelResponse extends js.Object {
    var ContentType: js.UndefOr[StringWithLengthBetween1And256]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var ModelId: js.UndefOr[Id]
    var Name: js.UndefOr[StringWithLengthBetween1And128]
    var Schema: js.UndefOr[StringWithLengthBetween0And32K]
  }

  object GetModelResponse {
    def apply(
        ContentType: js.UndefOr[StringWithLengthBetween1And256] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        ModelId: js.UndefOr[Id] = js.undefined,
        Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined,
        Schema: js.UndefOr[StringWithLengthBetween0And32K] = js.undefined
    ): GetModelResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ContentType.foreach(__v => __obj.update("ContentType", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      ModelId.foreach(__v => __obj.update("ModelId", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Schema.foreach(__v => __obj.update("Schema", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetModelResponse]
    }
  }

  @js.native
  trait GetModelTemplateRequest extends js.Object {
    var ApiId: __string
    var ModelId: __string
  }

  object GetModelTemplateRequest {
    def apply(
        ApiId: __string,
        ModelId: __string
    ): GetModelTemplateRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"   -> ApiId.asInstanceOf[js.Any],
        "ModelId" -> ModelId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetModelTemplateRequest]
    }
  }

  @js.native
  trait GetModelTemplateResponse extends js.Object {
    var Value: js.UndefOr[__string]
  }

  object GetModelTemplateResponse {
    def apply(
        Value: js.UndefOr[__string] = js.undefined
    ): GetModelTemplateResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Value.foreach(__v => __obj.update("Value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetModelTemplateResponse]
    }
  }

  @js.native
  trait GetModelsRequest extends js.Object {
    var ApiId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object GetModelsRequest {
    def apply(
        ApiId: __string,
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): GetModelsRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId" -> ApiId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetModelsRequest]
    }
  }

  @js.native
  trait GetModelsResponse extends js.Object {
    var Items: js.UndefOr[__listOfModel]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetModelsResponse {
    def apply(
        Items: js.UndefOr[__listOfModel] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetModelsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetModelsResponse]
    }
  }

  @js.native
  trait GetRouteRequest extends js.Object {
    var ApiId: __string
    var RouteId: __string
  }

  object GetRouteRequest {
    def apply(
        ApiId: __string,
        RouteId: __string
    ): GetRouteRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"   -> ApiId.asInstanceOf[js.Any],
        "RouteId" -> RouteId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetRouteRequest]
    }
  }

  @js.native
  trait GetRouteResponse extends js.Object {
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

  object GetRouteResponse {
    def apply(
        ApiKeyRequired: js.UndefOr[__boolean] = js.undefined,
        AuthorizationScopes: js.UndefOr[AuthorizationScopes] = js.undefined,
        AuthorizationType: js.UndefOr[AuthorizationType] = js.undefined,
        AuthorizerId: js.UndefOr[Id] = js.undefined,
        ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        OperationName: js.UndefOr[StringWithLengthBetween1And64] = js.undefined,
        RequestModels: js.UndefOr[RouteModels] = js.undefined,
        RequestParameters: js.UndefOr[RouteParameters] = js.undefined,
        RouteId: js.UndefOr[Id] = js.undefined,
        RouteKey: js.UndefOr[SelectionKey] = js.undefined,
        RouteResponseSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        Target: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    ): GetRouteResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ApiKeyRequired.foreach(__v => __obj.update("ApiKeyRequired", __v.asInstanceOf[js.Any]))
      AuthorizationScopes.foreach(__v => __obj.update("AuthorizationScopes", __v.asInstanceOf[js.Any]))
      AuthorizationType.foreach(__v => __obj.update("AuthorizationType", __v.asInstanceOf[js.Any]))
      AuthorizerId.foreach(__v => __obj.update("AuthorizerId", __v.asInstanceOf[js.Any]))
      ModelSelectionExpression.foreach(__v => __obj.update("ModelSelectionExpression", __v.asInstanceOf[js.Any]))
      OperationName.foreach(__v => __obj.update("OperationName", __v.asInstanceOf[js.Any]))
      RequestModels.foreach(__v => __obj.update("RequestModels", __v.asInstanceOf[js.Any]))
      RequestParameters.foreach(__v => __obj.update("RequestParameters", __v.asInstanceOf[js.Any]))
      RouteId.foreach(__v => __obj.update("RouteId", __v.asInstanceOf[js.Any]))
      RouteKey.foreach(__v => __obj.update("RouteKey", __v.asInstanceOf[js.Any]))
      RouteResponseSelectionExpression.foreach(
        __v => __obj.update("RouteResponseSelectionExpression", __v.asInstanceOf[js.Any])
      )
      Target.foreach(__v => __obj.update("Target", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRouteResponse]
    }
  }

  @js.native
  trait GetRouteResponseRequest extends js.Object {
    var ApiId: __string
    var RouteId: __string
    var RouteResponseId: __string
  }

  object GetRouteResponseRequest {
    def apply(
        ApiId: __string,
        RouteId: __string,
        RouteResponseId: __string
    ): GetRouteResponseRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"           -> ApiId.asInstanceOf[js.Any],
        "RouteId"         -> RouteId.asInstanceOf[js.Any],
        "RouteResponseId" -> RouteResponseId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetRouteResponseRequest]
    }
  }

  @js.native
  trait GetRouteResponseResponse extends js.Object {
    var ModelSelectionExpression: js.UndefOr[SelectionExpression]
    var ResponseModels: js.UndefOr[RouteModels]
    var ResponseParameters: js.UndefOr[RouteParameters]
    var RouteResponseId: js.UndefOr[Id]
    var RouteResponseKey: js.UndefOr[SelectionKey]
  }

  object GetRouteResponseResponse {
    def apply(
        ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        ResponseModels: js.UndefOr[RouteModels] = js.undefined,
        ResponseParameters: js.UndefOr[RouteParameters] = js.undefined,
        RouteResponseId: js.UndefOr[Id] = js.undefined,
        RouteResponseKey: js.UndefOr[SelectionKey] = js.undefined
    ): GetRouteResponseResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ModelSelectionExpression.foreach(__v => __obj.update("ModelSelectionExpression", __v.asInstanceOf[js.Any]))
      ResponseModels.foreach(__v => __obj.update("ResponseModels", __v.asInstanceOf[js.Any]))
      ResponseParameters.foreach(__v => __obj.update("ResponseParameters", __v.asInstanceOf[js.Any]))
      RouteResponseId.foreach(__v => __obj.update("RouteResponseId", __v.asInstanceOf[js.Any]))
      RouteResponseKey.foreach(__v => __obj.update("RouteResponseKey", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRouteResponseResponse]
    }
  }

  @js.native
  trait GetRouteResponsesRequest extends js.Object {
    var ApiId: __string
    var RouteId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object GetRouteResponsesRequest {
    def apply(
        ApiId: __string,
        RouteId: __string,
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): GetRouteResponsesRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"   -> ApiId.asInstanceOf[js.Any],
        "RouteId" -> RouteId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRouteResponsesRequest]
    }
  }

  @js.native
  trait GetRouteResponsesResponse extends js.Object {
    var Items: js.UndefOr[__listOfRouteResponse]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetRouteResponsesResponse {
    def apply(
        Items: js.UndefOr[__listOfRouteResponse] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetRouteResponsesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRouteResponsesResponse]
    }
  }

  @js.native
  trait GetRoutesRequest extends js.Object {
    var ApiId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object GetRoutesRequest {
    def apply(
        ApiId: __string,
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): GetRoutesRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId" -> ApiId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRoutesRequest]
    }
  }

  @js.native
  trait GetRoutesResponse extends js.Object {
    var Items: js.UndefOr[__listOfRoute]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetRoutesResponse {
    def apply(
        Items: js.UndefOr[__listOfRoute] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetRoutesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRoutesResponse]
    }
  }

  @js.native
  trait GetStageRequest extends js.Object {
    var ApiId: __string
    var StageName: __string
  }

  object GetStageRequest {
    def apply(
        ApiId: __string,
        StageName: __string
    ): GetStageRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"     -> ApiId.asInstanceOf[js.Any],
        "StageName" -> StageName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetStageRequest]
    }
  }

  @js.native
  trait GetStageResponse extends js.Object {
    var AccessLogSettings: js.UndefOr[AccessLogSettings]
    var ClientCertificateId: js.UndefOr[Id]
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var DefaultRouteSettings: js.UndefOr[RouteSettings]
    var DeploymentId: js.UndefOr[Id]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var LastUpdatedDate: js.UndefOr[__timestampIso8601]
    var RouteSettings: js.UndefOr[RouteSettingsMap]
    var StageName: js.UndefOr[StringWithLengthBetween1And128]
    var StageVariables: js.UndefOr[StageVariablesMap]
    var Tags: js.UndefOr[Tags]
  }

  object GetStageResponse {
    def apply(
        AccessLogSettings: js.UndefOr[AccessLogSettings] = js.undefined,
        ClientCertificateId: js.UndefOr[Id] = js.undefined,
        CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        DefaultRouteSettings: js.UndefOr[RouteSettings] = js.undefined,
        DeploymentId: js.UndefOr[Id] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        LastUpdatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        RouteSettings: js.UndefOr[RouteSettingsMap] = js.undefined,
        StageName: js.UndefOr[StringWithLengthBetween1And128] = js.undefined,
        StageVariables: js.UndefOr[StageVariablesMap] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): GetStageResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AccessLogSettings.foreach(__v => __obj.update("AccessLogSettings", __v.asInstanceOf[js.Any]))
      ClientCertificateId.foreach(__v => __obj.update("ClientCertificateId", __v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.update("CreatedDate", __v.asInstanceOf[js.Any]))
      DefaultRouteSettings.foreach(__v => __obj.update("DefaultRouteSettings", __v.asInstanceOf[js.Any]))
      DeploymentId.foreach(__v => __obj.update("DeploymentId", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      LastUpdatedDate.foreach(__v => __obj.update("LastUpdatedDate", __v.asInstanceOf[js.Any]))
      RouteSettings.foreach(__v => __obj.update("RouteSettings", __v.asInstanceOf[js.Any]))
      StageName.foreach(__v => __obj.update("StageName", __v.asInstanceOf[js.Any]))
      StageVariables.foreach(__v => __obj.update("StageVariables", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetStageResponse]
    }
  }

  @js.native
  trait GetStagesRequest extends js.Object {
    var ApiId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object GetStagesRequest {
    def apply(
        ApiId: __string,
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): GetStagesRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId" -> ApiId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.update("MaxResults", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetStagesRequest]
    }
  }

  @js.native
  trait GetStagesResponse extends js.Object {
    var Items: js.UndefOr[__listOfStage]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetStagesResponse {
    def apply(
        Items: js.UndefOr[__listOfStage] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetStagesResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Items.foreach(__v => __obj.update("Items", __v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.update("NextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetStagesResponse]
    }
  }

  @js.native
  trait GetTagsRequest extends js.Object {
    var ResourceArn: __string
  }

  object GetTagsRequest {
    def apply(
        ResourceArn: __string
    ): GetTagsRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetTagsRequest]
    }
  }

  @js.native
  trait GetTagsResponse extends js.Object {
    var Tags: js.UndefOr[__mapOf__string]
  }

  object GetTagsResponse {
    def apply(
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): GetTagsResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTagsResponse]
    }
  }

  /**
    * Represents an integration.
    */
  @js.native
  trait Integration extends js.Object {
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
    var RequestParameters: js.UndefOr[IntegrationParameters]
    var RequestTemplates: js.UndefOr[TemplateMap]
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression]
    var TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And29000]
  }

  object Integration {
    def apply(
        ConnectionId: js.UndefOr[StringWithLengthBetween1And1024] = js.undefined,
        ConnectionType: js.UndefOr[ConnectionType] = js.undefined,
        ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy] = js.undefined,
        CredentialsArn: js.UndefOr[Arn] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        IntegrationId: js.UndefOr[Id] = js.undefined,
        IntegrationMethod: js.UndefOr[StringWithLengthBetween1And64] = js.undefined,
        IntegrationResponseSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        IntegrationType: js.UndefOr[IntegrationType] = js.undefined,
        IntegrationUri: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined,
        PassthroughBehavior: js.UndefOr[PassthroughBehavior] = js.undefined,
        RequestParameters: js.UndefOr[IntegrationParameters] = js.undefined,
        RequestTemplates: js.UndefOr[TemplateMap] = js.undefined,
        TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And29000] = js.undefined
    ): Integration = {
      val __obj = js.Dictionary.empty[js.Any]
      ConnectionId.foreach(__v => __obj.update("ConnectionId", __v.asInstanceOf[js.Any]))
      ConnectionType.foreach(__v => __obj.update("ConnectionType", __v.asInstanceOf[js.Any]))
      ContentHandlingStrategy.foreach(__v => __obj.update("ContentHandlingStrategy", __v.asInstanceOf[js.Any]))
      CredentialsArn.foreach(__v => __obj.update("CredentialsArn", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      IntegrationId.foreach(__v => __obj.update("IntegrationId", __v.asInstanceOf[js.Any]))
      IntegrationMethod.foreach(__v => __obj.update("IntegrationMethod", __v.asInstanceOf[js.Any]))
      IntegrationResponseSelectionExpression.foreach(
        __v => __obj.update("IntegrationResponseSelectionExpression", __v.asInstanceOf[js.Any])
      )
      IntegrationType.foreach(__v => __obj.update("IntegrationType", __v.asInstanceOf[js.Any]))
      IntegrationUri.foreach(__v => __obj.update("IntegrationUri", __v.asInstanceOf[js.Any]))
      PassthroughBehavior.foreach(__v => __obj.update("PassthroughBehavior", __v.asInstanceOf[js.Any]))
      RequestParameters.foreach(__v => __obj.update("RequestParameters", __v.asInstanceOf[js.Any]))
      RequestTemplates.foreach(__v => __obj.update("RequestTemplates", __v.asInstanceOf[js.Any]))
      TemplateSelectionExpression.foreach(__v => __obj.update("TemplateSelectionExpression", __v.asInstanceOf[js.Any]))
      TimeoutInMillis.foreach(__v => __obj.update("TimeoutInMillis", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Integration]
    }
  }

  /**
    * Represents an integration response.
    */
  @js.native
  trait IntegrationResponse extends js.Object {
    var IntegrationResponseKey: SelectionKey
    var ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy]
    var IntegrationResponseId: js.UndefOr[Id]
    var ResponseParameters: js.UndefOr[IntegrationParameters]
    var ResponseTemplates: js.UndefOr[TemplateMap]
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression]
  }

  object IntegrationResponse {
    def apply(
        IntegrationResponseKey: SelectionKey,
        ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy] = js.undefined,
        IntegrationResponseId: js.UndefOr[Id] = js.undefined,
        ResponseParameters: js.UndefOr[IntegrationParameters] = js.undefined,
        ResponseTemplates: js.UndefOr[TemplateMap] = js.undefined,
        TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    ): IntegrationResponse = {
      val __obj = js.Dictionary[js.Any](
        "IntegrationResponseKey" -> IntegrationResponseKey.asInstanceOf[js.Any]
      )

      ContentHandlingStrategy.foreach(__v => __obj.update("ContentHandlingStrategy", __v.asInstanceOf[js.Any]))
      IntegrationResponseId.foreach(__v => __obj.update("IntegrationResponseId", __v.asInstanceOf[js.Any]))
      ResponseParameters.foreach(__v => __obj.update("ResponseParameters", __v.asInstanceOf[js.Any]))
      ResponseTemplates.foreach(__v => __obj.update("ResponseTemplates", __v.asInstanceOf[js.Any]))
      TemplateSelectionExpression.foreach(__v => __obj.update("TemplateSelectionExpression", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IntegrationResponse]
    }
  }

  /**
    * Represents an API method integration type.
    */
  object IntegrationTypeEnum {
    val AWS        = "AWS"
    val HTTP       = "HTTP"
    val MOCK       = "MOCK"
    val HTTP_PROXY = "HTTP_PROXY"
    val AWS_PROXY  = "AWS_PROXY"

    val values = IndexedSeq(AWS, HTTP, MOCK, HTTP_PROXY, AWS_PROXY)
  }

  /**
    * The logging level.
    */
  object LoggingLevelEnum {
    val ERROR   = "ERROR"
    val INFO    = "INFO"
    val `false` = "false"

    val values = IndexedSeq(ERROR, INFO, `false`)
  }

  /**
    * <p>Represents a data model for an API. See [[https://docs.aws.amazon.com/apigateway/latest/developerguide/models-mappings.html|Create Models and Mapping Templates for Request and Response
    *  Mappings]].</p>
    */
  @js.native
  trait Model extends js.Object {
    var Name: StringWithLengthBetween1And128
    var ContentType: js.UndefOr[StringWithLengthBetween1And256]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var ModelId: js.UndefOr[Id]
    var Schema: js.UndefOr[StringWithLengthBetween0And32K]
  }

  object Model {
    def apply(
        Name: StringWithLengthBetween1And128,
        ContentType: js.UndefOr[StringWithLengthBetween1And256] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        ModelId: js.UndefOr[Id] = js.undefined,
        Schema: js.UndefOr[StringWithLengthBetween0And32K] = js.undefined
    ): Model = {
      val __obj = js.Dictionary[js.Any](
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ContentType.foreach(__v => __obj.update("ContentType", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      ModelId.foreach(__v => __obj.update("ModelId", __v.asInstanceOf[js.Any]))
      Schema.foreach(__v => __obj.update("Schema", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Model]
    }
  }

  /**
    * <p>Validation constraints imposed on parameters of a request (path, query string,
    *  headers).</p>
    */
  @js.native
  trait ParameterConstraints extends js.Object {
    var Required: js.UndefOr[__boolean]
  }

  object ParameterConstraints {
    def apply(
        Required: js.UndefOr[__boolean] = js.undefined
    ): ParameterConstraints = {
      val __obj = js.Dictionary.empty[js.Any]
      Required.foreach(__v => __obj.update("Required", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterConstraints]
    }
  }

  /**
    * Represents passthrough behavior for an integration response.
    */
  object PassthroughBehaviorEnum {
    val WHEN_NO_MATCH     = "WHEN_NO_MATCH"
    val NEVER             = "NEVER"
    val WHEN_NO_TEMPLATES = "WHEN_NO_TEMPLATES"

    val values = IndexedSeq(WHEN_NO_MATCH, NEVER, WHEN_NO_TEMPLATES)
  }

  /**
    *
    */
  object ProtocolTypeEnum {
    val WEBSOCKET = "WEBSOCKET"

    val values = IndexedSeq(WEBSOCKET)
  }

  /**
    * Represents a route.
    */
  @js.native
  trait Route extends js.Object {
    var RouteKey: SelectionKey
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

  object Route {
    def apply(
        RouteKey: SelectionKey,
        ApiKeyRequired: js.UndefOr[__boolean] = js.undefined,
        AuthorizationScopes: js.UndefOr[AuthorizationScopes] = js.undefined,
        AuthorizationType: js.UndefOr[AuthorizationType] = js.undefined,
        AuthorizerId: js.UndefOr[Id] = js.undefined,
        ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        OperationName: js.UndefOr[StringWithLengthBetween1And64] = js.undefined,
        RequestModels: js.UndefOr[RouteModels] = js.undefined,
        RequestParameters: js.UndefOr[RouteParameters] = js.undefined,
        RouteId: js.UndefOr[Id] = js.undefined,
        RouteResponseSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        Target: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    ): Route = {
      val __obj = js.Dictionary[js.Any](
        "RouteKey" -> RouteKey.asInstanceOf[js.Any]
      )

      ApiKeyRequired.foreach(__v => __obj.update("ApiKeyRequired", __v.asInstanceOf[js.Any]))
      AuthorizationScopes.foreach(__v => __obj.update("AuthorizationScopes", __v.asInstanceOf[js.Any]))
      AuthorizationType.foreach(__v => __obj.update("AuthorizationType", __v.asInstanceOf[js.Any]))
      AuthorizerId.foreach(__v => __obj.update("AuthorizerId", __v.asInstanceOf[js.Any]))
      ModelSelectionExpression.foreach(__v => __obj.update("ModelSelectionExpression", __v.asInstanceOf[js.Any]))
      OperationName.foreach(__v => __obj.update("OperationName", __v.asInstanceOf[js.Any]))
      RequestModels.foreach(__v => __obj.update("RequestModels", __v.asInstanceOf[js.Any]))
      RequestParameters.foreach(__v => __obj.update("RequestParameters", __v.asInstanceOf[js.Any]))
      RouteId.foreach(__v => __obj.update("RouteId", __v.asInstanceOf[js.Any]))
      RouteResponseSelectionExpression.foreach(
        __v => __obj.update("RouteResponseSelectionExpression", __v.asInstanceOf[js.Any])
      )
      Target.foreach(__v => __obj.update("Target", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Route]
    }
  }

  /**
    * Represents a route response.
    */
  @js.native
  trait RouteResponse extends js.Object {
    var RouteResponseKey: SelectionKey
    var ModelSelectionExpression: js.UndefOr[SelectionExpression]
    var ResponseModels: js.UndefOr[RouteModels]
    var ResponseParameters: js.UndefOr[RouteParameters]
    var RouteResponseId: js.UndefOr[Id]
  }

  object RouteResponse {
    def apply(
        RouteResponseKey: SelectionKey,
        ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        ResponseModels: js.UndefOr[RouteModels] = js.undefined,
        ResponseParameters: js.UndefOr[RouteParameters] = js.undefined,
        RouteResponseId: js.UndefOr[Id] = js.undefined
    ): RouteResponse = {
      val __obj = js.Dictionary[js.Any](
        "RouteResponseKey" -> RouteResponseKey.asInstanceOf[js.Any]
      )

      ModelSelectionExpression.foreach(__v => __obj.update("ModelSelectionExpression", __v.asInstanceOf[js.Any]))
      ResponseModels.foreach(__v => __obj.update("ResponseModels", __v.asInstanceOf[js.Any]))
      ResponseParameters.foreach(__v => __obj.update("ResponseParameters", __v.asInstanceOf[js.Any]))
      RouteResponseId.foreach(__v => __obj.update("RouteResponseId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RouteResponse]
    }
  }

  /**
    * Represents a collection of route settings.
    */
  @js.native
  trait RouteSettings extends js.Object {
    var DataTraceEnabled: js.UndefOr[__boolean]
    var DetailedMetricsEnabled: js.UndefOr[__boolean]
    var LoggingLevel: js.UndefOr[LoggingLevel]
    var ThrottlingBurstLimit: js.UndefOr[__integer]
    var ThrottlingRateLimit: js.UndefOr[__double]
  }

  object RouteSettings {
    def apply(
        DataTraceEnabled: js.UndefOr[__boolean] = js.undefined,
        DetailedMetricsEnabled: js.UndefOr[__boolean] = js.undefined,
        LoggingLevel: js.UndefOr[LoggingLevel] = js.undefined,
        ThrottlingBurstLimit: js.UndefOr[__integer] = js.undefined,
        ThrottlingRateLimit: js.UndefOr[__double] = js.undefined
    ): RouteSettings = {
      val __obj = js.Dictionary.empty[js.Any]
      DataTraceEnabled.foreach(__v => __obj.update("DataTraceEnabled", __v.asInstanceOf[js.Any]))
      DetailedMetricsEnabled.foreach(__v => __obj.update("DetailedMetricsEnabled", __v.asInstanceOf[js.Any]))
      LoggingLevel.foreach(__v => __obj.update("LoggingLevel", __v.asInstanceOf[js.Any]))
      ThrottlingBurstLimit.foreach(__v => __obj.update("ThrottlingBurstLimit", __v.asInstanceOf[js.Any]))
      ThrottlingRateLimit.foreach(__v => __obj.update("ThrottlingRateLimit", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RouteSettings]
    }
  }

  /**
    * The Transport Layer Security (TLS) version of the security policy for this domain name. The valid values are TLS_1_0 and TLS_1_2.
    */
  object SecurityPolicyEnum {
    val TLS_1_0 = "TLS_1_0"
    val TLS_1_2 = "TLS_1_2"

    val values = IndexedSeq(TLS_1_0, TLS_1_2)
  }

  /**
    * Represents an API stage.
    */
  @js.native
  trait Stage extends js.Object {
    var StageName: StringWithLengthBetween1And128
    var AccessLogSettings: js.UndefOr[AccessLogSettings]
    var ClientCertificateId: js.UndefOr[Id]
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var DefaultRouteSettings: js.UndefOr[RouteSettings]
    var DeploymentId: js.UndefOr[Id]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var LastUpdatedDate: js.UndefOr[__timestampIso8601]
    var RouteSettings: js.UndefOr[RouteSettingsMap]
    var StageVariables: js.UndefOr[StageVariablesMap]
    var Tags: js.UndefOr[Tags]
  }

  object Stage {
    def apply(
        StageName: StringWithLengthBetween1And128,
        AccessLogSettings: js.UndefOr[AccessLogSettings] = js.undefined,
        ClientCertificateId: js.UndefOr[Id] = js.undefined,
        CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        DefaultRouteSettings: js.UndefOr[RouteSettings] = js.undefined,
        DeploymentId: js.UndefOr[Id] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        LastUpdatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        RouteSettings: js.UndefOr[RouteSettingsMap] = js.undefined,
        StageVariables: js.UndefOr[StageVariablesMap] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): Stage = {
      val __obj = js.Dictionary[js.Any](
        "StageName" -> StageName.asInstanceOf[js.Any]
      )

      AccessLogSettings.foreach(__v => __obj.update("AccessLogSettings", __v.asInstanceOf[js.Any]))
      ClientCertificateId.foreach(__v => __obj.update("ClientCertificateId", __v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.update("CreatedDate", __v.asInstanceOf[js.Any]))
      DefaultRouteSettings.foreach(__v => __obj.update("DefaultRouteSettings", __v.asInstanceOf[js.Any]))
      DeploymentId.foreach(__v => __obj.update("DeploymentId", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      LastUpdatedDate.foreach(__v => __obj.update("LastUpdatedDate", __v.asInstanceOf[js.Any]))
      RouteSettings.foreach(__v => __obj.update("RouteSettings", __v.asInstanceOf[js.Any]))
      StageVariables.foreach(__v => __obj.update("StageVariables", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Stage]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: __string
    var Tags: js.UndefOr[Tags]
  }

  object TagResourceRequest {
    def apply(
        ResourceArn: __string,
        Tags: js.UndefOr[Tags] = js.undefined
    ): TagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
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

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: __string
    var TagKeys: __listOf__string
  }

  object UntagResourceRequest {
    def apply(
        ResourceArn: __string,
        TagKeys: __listOf__string
    ): UntagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys"     -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UpdateApiMappingRequest extends js.Object {
    var ApiId: Id
    var ApiMappingId: __string
    var DomainName: __string
    var ApiMappingKey: js.UndefOr[SelectionKey]
    var Stage: js.UndefOr[StringWithLengthBetween1And128]
  }

  object UpdateApiMappingRequest {
    def apply(
        ApiId: Id,
        ApiMappingId: __string,
        DomainName: __string,
        ApiMappingKey: js.UndefOr[SelectionKey] = js.undefined,
        Stage: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    ): UpdateApiMappingRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"        -> ApiId.asInstanceOf[js.Any],
        "ApiMappingId" -> ApiMappingId.asInstanceOf[js.Any],
        "DomainName"   -> DomainName.asInstanceOf[js.Any]
      )

      ApiMappingKey.foreach(__v => __obj.update("ApiMappingKey", __v.asInstanceOf[js.Any]))
      Stage.foreach(__v => __obj.update("Stage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApiMappingRequest]
    }
  }

  @js.native
  trait UpdateApiMappingResponse extends js.Object {
    var ApiId: js.UndefOr[Id]
    var ApiMappingId: js.UndefOr[Id]
    var ApiMappingKey: js.UndefOr[SelectionKey]
    var Stage: js.UndefOr[StringWithLengthBetween1And128]
  }

  object UpdateApiMappingResponse {
    def apply(
        ApiId: js.UndefOr[Id] = js.undefined,
        ApiMappingId: js.UndefOr[Id] = js.undefined,
        ApiMappingKey: js.UndefOr[SelectionKey] = js.undefined,
        Stage: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    ): UpdateApiMappingResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ApiId.foreach(__v => __obj.update("ApiId", __v.asInstanceOf[js.Any]))
      ApiMappingId.foreach(__v => __obj.update("ApiMappingId", __v.asInstanceOf[js.Any]))
      ApiMappingKey.foreach(__v => __obj.update("ApiMappingKey", __v.asInstanceOf[js.Any]))
      Stage.foreach(__v => __obj.update("Stage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApiMappingResponse]
    }
  }

  @js.native
  trait UpdateApiRequest extends js.Object {
    var ApiId: __string
    var ApiKeySelectionExpression: js.UndefOr[SelectionExpression]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var DisableSchemaValidation: js.UndefOr[__boolean]
    var Name: js.UndefOr[StringWithLengthBetween1And128]
    var RouteSelectionExpression: js.UndefOr[SelectionExpression]
    var Version: js.UndefOr[StringWithLengthBetween1And64]
  }

  object UpdateApiRequest {
    def apply(
        ApiId: __string,
        ApiKeySelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        DisableSchemaValidation: js.UndefOr[__boolean] = js.undefined,
        Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined,
        RouteSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        Version: js.UndefOr[StringWithLengthBetween1And64] = js.undefined
    ): UpdateApiRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId" -> ApiId.asInstanceOf[js.Any]
      )

      ApiKeySelectionExpression.foreach(__v => __obj.update("ApiKeySelectionExpression", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      DisableSchemaValidation.foreach(__v => __obj.update("DisableSchemaValidation", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      RouteSelectionExpression.foreach(__v => __obj.update("RouteSelectionExpression", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApiRequest]
    }
  }

  @js.native
  trait UpdateApiResponse extends js.Object {
    var ApiEndpoint: js.UndefOr[__string]
    var ApiId: js.UndefOr[Id]
    var ApiKeySelectionExpression: js.UndefOr[SelectionExpression]
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var DisableSchemaValidation: js.UndefOr[__boolean]
    var Name: js.UndefOr[StringWithLengthBetween1And128]
    var ProtocolType: js.UndefOr[ProtocolType]
    var RouteSelectionExpression: js.UndefOr[SelectionExpression]
    var Tags: js.UndefOr[Tags]
    var Version: js.UndefOr[StringWithLengthBetween1And64]
    var Warnings: js.UndefOr[__listOf__string]
  }

  object UpdateApiResponse {
    def apply(
        ApiEndpoint: js.UndefOr[__string] = js.undefined,
        ApiId: js.UndefOr[Id] = js.undefined,
        ApiKeySelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        DisableSchemaValidation: js.UndefOr[__boolean] = js.undefined,
        Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined,
        ProtocolType: js.UndefOr[ProtocolType] = js.undefined,
        RouteSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        Version: js.UndefOr[StringWithLengthBetween1And64] = js.undefined,
        Warnings: js.UndefOr[__listOf__string] = js.undefined
    ): UpdateApiResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ApiEndpoint.foreach(__v => __obj.update("ApiEndpoint", __v.asInstanceOf[js.Any]))
      ApiId.foreach(__v => __obj.update("ApiId", __v.asInstanceOf[js.Any]))
      ApiKeySelectionExpression.foreach(__v => __obj.update("ApiKeySelectionExpression", __v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.update("CreatedDate", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      DisableSchemaValidation.foreach(__v => __obj.update("DisableSchemaValidation", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      ProtocolType.foreach(__v => __obj.update("ProtocolType", __v.asInstanceOf[js.Any]))
      RouteSelectionExpression.foreach(__v => __obj.update("RouteSelectionExpression", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.update("Version", __v.asInstanceOf[js.Any]))
      Warnings.foreach(__v => __obj.update("Warnings", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApiResponse]
    }
  }

  @js.native
  trait UpdateAuthorizerRequest extends js.Object {
    var ApiId: __string
    var AuthorizerId: __string
    var AuthorizerCredentialsArn: js.UndefOr[Arn]
    var AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600]
    var AuthorizerType: js.UndefOr[AuthorizerType]
    var AuthorizerUri: js.UndefOr[UriWithLengthBetween1And2048]
    var IdentitySource: js.UndefOr[IdentitySourceList]
    var IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024]
    var Name: js.UndefOr[StringWithLengthBetween1And128]
    var ProviderArns: js.UndefOr[ProviderArnList]
  }

  object UpdateAuthorizerRequest {
    def apply(
        ApiId: __string,
        AuthorizerId: __string,
        AuthorizerCredentialsArn: js.UndefOr[Arn] = js.undefined,
        AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600] = js.undefined,
        AuthorizerType: js.UndefOr[AuthorizerType] = js.undefined,
        AuthorizerUri: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined,
        IdentitySource: js.UndefOr[IdentitySourceList] = js.undefined,
        IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined,
        ProviderArns: js.UndefOr[ProviderArnList] = js.undefined
    ): UpdateAuthorizerRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"        -> ApiId.asInstanceOf[js.Any],
        "AuthorizerId" -> AuthorizerId.asInstanceOf[js.Any]
      )

      AuthorizerCredentialsArn.foreach(__v => __obj.update("AuthorizerCredentialsArn", __v.asInstanceOf[js.Any]))
      AuthorizerResultTtlInSeconds.foreach(
        __v => __obj.update("AuthorizerResultTtlInSeconds", __v.asInstanceOf[js.Any])
      )
      AuthorizerType.foreach(__v => __obj.update("AuthorizerType", __v.asInstanceOf[js.Any]))
      AuthorizerUri.foreach(__v => __obj.update("AuthorizerUri", __v.asInstanceOf[js.Any]))
      IdentitySource.foreach(__v => __obj.update("IdentitySource", __v.asInstanceOf[js.Any]))
      IdentityValidationExpression.foreach(
        __v => __obj.update("IdentityValidationExpression", __v.asInstanceOf[js.Any])
      )
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      ProviderArns.foreach(__v => __obj.update("ProviderArns", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAuthorizerRequest]
    }
  }

  @js.native
  trait UpdateAuthorizerResponse extends js.Object {
    var AuthorizerCredentialsArn: js.UndefOr[Arn]
    var AuthorizerId: js.UndefOr[Id]
    var AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600]
    var AuthorizerType: js.UndefOr[AuthorizerType]
    var AuthorizerUri: js.UndefOr[UriWithLengthBetween1And2048]
    var IdentitySource: js.UndefOr[IdentitySourceList]
    var IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024]
    var Name: js.UndefOr[StringWithLengthBetween1And128]
    var ProviderArns: js.UndefOr[ProviderArnList]
  }

  object UpdateAuthorizerResponse {
    def apply(
        AuthorizerCredentialsArn: js.UndefOr[Arn] = js.undefined,
        AuthorizerId: js.UndefOr[Id] = js.undefined,
        AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600] = js.undefined,
        AuthorizerType: js.UndefOr[AuthorizerType] = js.undefined,
        AuthorizerUri: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined,
        IdentitySource: js.UndefOr[IdentitySourceList] = js.undefined,
        IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined,
        ProviderArns: js.UndefOr[ProviderArnList] = js.undefined
    ): UpdateAuthorizerResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AuthorizerCredentialsArn.foreach(__v => __obj.update("AuthorizerCredentialsArn", __v.asInstanceOf[js.Any]))
      AuthorizerId.foreach(__v => __obj.update("AuthorizerId", __v.asInstanceOf[js.Any]))
      AuthorizerResultTtlInSeconds.foreach(
        __v => __obj.update("AuthorizerResultTtlInSeconds", __v.asInstanceOf[js.Any])
      )
      AuthorizerType.foreach(__v => __obj.update("AuthorizerType", __v.asInstanceOf[js.Any]))
      AuthorizerUri.foreach(__v => __obj.update("AuthorizerUri", __v.asInstanceOf[js.Any]))
      IdentitySource.foreach(__v => __obj.update("IdentitySource", __v.asInstanceOf[js.Any]))
      IdentityValidationExpression.foreach(
        __v => __obj.update("IdentityValidationExpression", __v.asInstanceOf[js.Any])
      )
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      ProviderArns.foreach(__v => __obj.update("ProviderArns", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAuthorizerResponse]
    }
  }

  @js.native
  trait UpdateDeploymentRequest extends js.Object {
    var ApiId: __string
    var DeploymentId: __string
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
  }

  object UpdateDeploymentRequest {
    def apply(
        ApiId: __string,
        DeploymentId: __string,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    ): UpdateDeploymentRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"        -> ApiId.asInstanceOf[js.Any],
        "DeploymentId" -> DeploymentId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDeploymentRequest]
    }
  }

  @js.native
  trait UpdateDeploymentResponse extends js.Object {
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var DeploymentId: js.UndefOr[Id]
    var DeploymentStatus: js.UndefOr[DeploymentStatus]
    var DeploymentStatusMessage: js.UndefOr[__string]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
  }

  object UpdateDeploymentResponse {
    def apply(
        CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        DeploymentId: js.UndefOr[Id] = js.undefined,
        DeploymentStatus: js.UndefOr[DeploymentStatus] = js.undefined,
        DeploymentStatusMessage: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    ): UpdateDeploymentResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      CreatedDate.foreach(__v => __obj.update("CreatedDate", __v.asInstanceOf[js.Any]))
      DeploymentId.foreach(__v => __obj.update("DeploymentId", __v.asInstanceOf[js.Any]))
      DeploymentStatus.foreach(__v => __obj.update("DeploymentStatus", __v.asInstanceOf[js.Any]))
      DeploymentStatusMessage.foreach(__v => __obj.update("DeploymentStatusMessage", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDeploymentResponse]
    }
  }

  @js.native
  trait UpdateDomainNameRequest extends js.Object {
    var DomainName: __string
    var DomainNameConfigurations: js.UndefOr[DomainNameConfigurations]
  }

  object UpdateDomainNameRequest {
    def apply(
        DomainName: __string,
        DomainNameConfigurations: js.UndefOr[DomainNameConfigurations] = js.undefined
    ): UpdateDomainNameRequest = {
      val __obj = js.Dictionary[js.Any](
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      DomainNameConfigurations.foreach(__v => __obj.update("DomainNameConfigurations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDomainNameRequest]
    }
  }

  @js.native
  trait UpdateDomainNameResponse extends js.Object {
    var ApiMappingSelectionExpression: js.UndefOr[SelectionExpression]
    var DomainName: js.UndefOr[StringWithLengthBetween1And512]
    var DomainNameConfigurations: js.UndefOr[DomainNameConfigurations]
    var Tags: js.UndefOr[Tags]
  }

  object UpdateDomainNameResponse {
    def apply(
        ApiMappingSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        DomainName: js.UndefOr[StringWithLengthBetween1And512] = js.undefined,
        DomainNameConfigurations: js.UndefOr[DomainNameConfigurations] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): UpdateDomainNameResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ApiMappingSelectionExpression.foreach(
        __v => __obj.update("ApiMappingSelectionExpression", __v.asInstanceOf[js.Any])
      )
      DomainName.foreach(__v => __obj.update("DomainName", __v.asInstanceOf[js.Any]))
      DomainNameConfigurations.foreach(__v => __obj.update("DomainNameConfigurations", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDomainNameResponse]
    }
  }

  @js.native
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
    var RequestParameters: js.UndefOr[IntegrationParameters]
    var RequestTemplates: js.UndefOr[TemplateMap]
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression]
    var TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And29000]
  }

  object UpdateIntegrationRequest {
    def apply(
        ApiId: __string,
        IntegrationId: __string,
        ConnectionId: js.UndefOr[StringWithLengthBetween1And1024] = js.undefined,
        ConnectionType: js.UndefOr[ConnectionType] = js.undefined,
        ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy] = js.undefined,
        CredentialsArn: js.UndefOr[Arn] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        IntegrationMethod: js.UndefOr[StringWithLengthBetween1And64] = js.undefined,
        IntegrationType: js.UndefOr[IntegrationType] = js.undefined,
        IntegrationUri: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined,
        PassthroughBehavior: js.UndefOr[PassthroughBehavior] = js.undefined,
        RequestParameters: js.UndefOr[IntegrationParameters] = js.undefined,
        RequestTemplates: js.UndefOr[TemplateMap] = js.undefined,
        TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And29000] = js.undefined
    ): UpdateIntegrationRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"         -> ApiId.asInstanceOf[js.Any],
        "IntegrationId" -> IntegrationId.asInstanceOf[js.Any]
      )

      ConnectionId.foreach(__v => __obj.update("ConnectionId", __v.asInstanceOf[js.Any]))
      ConnectionType.foreach(__v => __obj.update("ConnectionType", __v.asInstanceOf[js.Any]))
      ContentHandlingStrategy.foreach(__v => __obj.update("ContentHandlingStrategy", __v.asInstanceOf[js.Any]))
      CredentialsArn.foreach(__v => __obj.update("CredentialsArn", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      IntegrationMethod.foreach(__v => __obj.update("IntegrationMethod", __v.asInstanceOf[js.Any]))
      IntegrationType.foreach(__v => __obj.update("IntegrationType", __v.asInstanceOf[js.Any]))
      IntegrationUri.foreach(__v => __obj.update("IntegrationUri", __v.asInstanceOf[js.Any]))
      PassthroughBehavior.foreach(__v => __obj.update("PassthroughBehavior", __v.asInstanceOf[js.Any]))
      RequestParameters.foreach(__v => __obj.update("RequestParameters", __v.asInstanceOf[js.Any]))
      RequestTemplates.foreach(__v => __obj.update("RequestTemplates", __v.asInstanceOf[js.Any]))
      TemplateSelectionExpression.foreach(__v => __obj.update("TemplateSelectionExpression", __v.asInstanceOf[js.Any]))
      TimeoutInMillis.foreach(__v => __obj.update("TimeoutInMillis", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateIntegrationRequest]
    }
  }

  @js.native
  trait UpdateIntegrationResponse extends js.Object {
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
    var RequestParameters: js.UndefOr[IntegrationParameters]
    var RequestTemplates: js.UndefOr[TemplateMap]
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression]
    var TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And29000]
  }

  object UpdateIntegrationResponse {
    def apply(
        ConnectionId: js.UndefOr[StringWithLengthBetween1And1024] = js.undefined,
        ConnectionType: js.UndefOr[ConnectionType] = js.undefined,
        ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy] = js.undefined,
        CredentialsArn: js.UndefOr[Arn] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        IntegrationId: js.UndefOr[Id] = js.undefined,
        IntegrationMethod: js.UndefOr[StringWithLengthBetween1And64] = js.undefined,
        IntegrationResponseSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        IntegrationType: js.UndefOr[IntegrationType] = js.undefined,
        IntegrationUri: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined,
        PassthroughBehavior: js.UndefOr[PassthroughBehavior] = js.undefined,
        RequestParameters: js.UndefOr[IntegrationParameters] = js.undefined,
        RequestTemplates: js.UndefOr[TemplateMap] = js.undefined,
        TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And29000] = js.undefined
    ): UpdateIntegrationResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ConnectionId.foreach(__v => __obj.update("ConnectionId", __v.asInstanceOf[js.Any]))
      ConnectionType.foreach(__v => __obj.update("ConnectionType", __v.asInstanceOf[js.Any]))
      ContentHandlingStrategy.foreach(__v => __obj.update("ContentHandlingStrategy", __v.asInstanceOf[js.Any]))
      CredentialsArn.foreach(__v => __obj.update("CredentialsArn", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      IntegrationId.foreach(__v => __obj.update("IntegrationId", __v.asInstanceOf[js.Any]))
      IntegrationMethod.foreach(__v => __obj.update("IntegrationMethod", __v.asInstanceOf[js.Any]))
      IntegrationResponseSelectionExpression.foreach(
        __v => __obj.update("IntegrationResponseSelectionExpression", __v.asInstanceOf[js.Any])
      )
      IntegrationType.foreach(__v => __obj.update("IntegrationType", __v.asInstanceOf[js.Any]))
      IntegrationUri.foreach(__v => __obj.update("IntegrationUri", __v.asInstanceOf[js.Any]))
      PassthroughBehavior.foreach(__v => __obj.update("PassthroughBehavior", __v.asInstanceOf[js.Any]))
      RequestParameters.foreach(__v => __obj.update("RequestParameters", __v.asInstanceOf[js.Any]))
      RequestTemplates.foreach(__v => __obj.update("RequestTemplates", __v.asInstanceOf[js.Any]))
      TemplateSelectionExpression.foreach(__v => __obj.update("TemplateSelectionExpression", __v.asInstanceOf[js.Any]))
      TimeoutInMillis.foreach(__v => __obj.update("TimeoutInMillis", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateIntegrationResponse]
    }
  }

  @js.native
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

  object UpdateIntegrationResponseRequest {
    def apply(
        ApiId: __string,
        IntegrationId: __string,
        IntegrationResponseId: __string,
        ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy] = js.undefined,
        IntegrationResponseKey: js.UndefOr[SelectionKey] = js.undefined,
        ResponseParameters: js.UndefOr[IntegrationParameters] = js.undefined,
        ResponseTemplates: js.UndefOr[TemplateMap] = js.undefined,
        TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    ): UpdateIntegrationResponseRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"                 -> ApiId.asInstanceOf[js.Any],
        "IntegrationId"         -> IntegrationId.asInstanceOf[js.Any],
        "IntegrationResponseId" -> IntegrationResponseId.asInstanceOf[js.Any]
      )

      ContentHandlingStrategy.foreach(__v => __obj.update("ContentHandlingStrategy", __v.asInstanceOf[js.Any]))
      IntegrationResponseKey.foreach(__v => __obj.update("IntegrationResponseKey", __v.asInstanceOf[js.Any]))
      ResponseParameters.foreach(__v => __obj.update("ResponseParameters", __v.asInstanceOf[js.Any]))
      ResponseTemplates.foreach(__v => __obj.update("ResponseTemplates", __v.asInstanceOf[js.Any]))
      TemplateSelectionExpression.foreach(__v => __obj.update("TemplateSelectionExpression", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateIntegrationResponseRequest]
    }
  }

  @js.native
  trait UpdateIntegrationResponseResponse extends js.Object {
    var ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy]
    var IntegrationResponseId: js.UndefOr[Id]
    var IntegrationResponseKey: js.UndefOr[SelectionKey]
    var ResponseParameters: js.UndefOr[IntegrationParameters]
    var ResponseTemplates: js.UndefOr[TemplateMap]
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression]
  }

  object UpdateIntegrationResponseResponse {
    def apply(
        ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy] = js.undefined,
        IntegrationResponseId: js.UndefOr[Id] = js.undefined,
        IntegrationResponseKey: js.UndefOr[SelectionKey] = js.undefined,
        ResponseParameters: js.UndefOr[IntegrationParameters] = js.undefined,
        ResponseTemplates: js.UndefOr[TemplateMap] = js.undefined,
        TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    ): UpdateIntegrationResponseResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ContentHandlingStrategy.foreach(__v => __obj.update("ContentHandlingStrategy", __v.asInstanceOf[js.Any]))
      IntegrationResponseId.foreach(__v => __obj.update("IntegrationResponseId", __v.asInstanceOf[js.Any]))
      IntegrationResponseKey.foreach(__v => __obj.update("IntegrationResponseKey", __v.asInstanceOf[js.Any]))
      ResponseParameters.foreach(__v => __obj.update("ResponseParameters", __v.asInstanceOf[js.Any]))
      ResponseTemplates.foreach(__v => __obj.update("ResponseTemplates", __v.asInstanceOf[js.Any]))
      TemplateSelectionExpression.foreach(__v => __obj.update("TemplateSelectionExpression", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateIntegrationResponseResponse]
    }
  }

  @js.native
  trait UpdateModelRequest extends js.Object {
    var ApiId: __string
    var ModelId: __string
    var ContentType: js.UndefOr[StringWithLengthBetween1And256]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var Name: js.UndefOr[StringWithLengthBetween1And128]
    var Schema: js.UndefOr[StringWithLengthBetween0And32K]
  }

  object UpdateModelRequest {
    def apply(
        ApiId: __string,
        ModelId: __string,
        ContentType: js.UndefOr[StringWithLengthBetween1And256] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined,
        Schema: js.UndefOr[StringWithLengthBetween0And32K] = js.undefined
    ): UpdateModelRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"   -> ApiId.asInstanceOf[js.Any],
        "ModelId" -> ModelId.asInstanceOf[js.Any]
      )

      ContentType.foreach(__v => __obj.update("ContentType", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Schema.foreach(__v => __obj.update("Schema", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateModelRequest]
    }
  }

  @js.native
  trait UpdateModelResponse extends js.Object {
    var ContentType: js.UndefOr[StringWithLengthBetween1And256]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var ModelId: js.UndefOr[Id]
    var Name: js.UndefOr[StringWithLengthBetween1And128]
    var Schema: js.UndefOr[StringWithLengthBetween0And32K]
  }

  object UpdateModelResponse {
    def apply(
        ContentType: js.UndefOr[StringWithLengthBetween1And256] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        ModelId: js.UndefOr[Id] = js.undefined,
        Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined,
        Schema: js.UndefOr[StringWithLengthBetween0And32K] = js.undefined
    ): UpdateModelResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ContentType.foreach(__v => __obj.update("ContentType", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      ModelId.foreach(__v => __obj.update("ModelId", __v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.update("Name", __v.asInstanceOf[js.Any]))
      Schema.foreach(__v => __obj.update("Schema", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateModelResponse]
    }
  }

  @js.native
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

  object UpdateRouteRequest {
    def apply(
        ApiId: __string,
        RouteId: __string,
        ApiKeyRequired: js.UndefOr[__boolean] = js.undefined,
        AuthorizationScopes: js.UndefOr[AuthorizationScopes] = js.undefined,
        AuthorizationType: js.UndefOr[AuthorizationType] = js.undefined,
        AuthorizerId: js.UndefOr[Id] = js.undefined,
        ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        OperationName: js.UndefOr[StringWithLengthBetween1And64] = js.undefined,
        RequestModels: js.UndefOr[RouteModels] = js.undefined,
        RequestParameters: js.UndefOr[RouteParameters] = js.undefined,
        RouteKey: js.UndefOr[SelectionKey] = js.undefined,
        RouteResponseSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        Target: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    ): UpdateRouteRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"   -> ApiId.asInstanceOf[js.Any],
        "RouteId" -> RouteId.asInstanceOf[js.Any]
      )

      ApiKeyRequired.foreach(__v => __obj.update("ApiKeyRequired", __v.asInstanceOf[js.Any]))
      AuthorizationScopes.foreach(__v => __obj.update("AuthorizationScopes", __v.asInstanceOf[js.Any]))
      AuthorizationType.foreach(__v => __obj.update("AuthorizationType", __v.asInstanceOf[js.Any]))
      AuthorizerId.foreach(__v => __obj.update("AuthorizerId", __v.asInstanceOf[js.Any]))
      ModelSelectionExpression.foreach(__v => __obj.update("ModelSelectionExpression", __v.asInstanceOf[js.Any]))
      OperationName.foreach(__v => __obj.update("OperationName", __v.asInstanceOf[js.Any]))
      RequestModels.foreach(__v => __obj.update("RequestModels", __v.asInstanceOf[js.Any]))
      RequestParameters.foreach(__v => __obj.update("RequestParameters", __v.asInstanceOf[js.Any]))
      RouteKey.foreach(__v => __obj.update("RouteKey", __v.asInstanceOf[js.Any]))
      RouteResponseSelectionExpression.foreach(
        __v => __obj.update("RouteResponseSelectionExpression", __v.asInstanceOf[js.Any])
      )
      Target.foreach(__v => __obj.update("Target", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRouteRequest]
    }
  }

  @js.native
  trait UpdateRouteResponse extends js.Object {
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

  object UpdateRouteResponse {
    def apply(
        ApiKeyRequired: js.UndefOr[__boolean] = js.undefined,
        AuthorizationScopes: js.UndefOr[AuthorizationScopes] = js.undefined,
        AuthorizationType: js.UndefOr[AuthorizationType] = js.undefined,
        AuthorizerId: js.UndefOr[Id] = js.undefined,
        ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        OperationName: js.UndefOr[StringWithLengthBetween1And64] = js.undefined,
        RequestModels: js.UndefOr[RouteModels] = js.undefined,
        RequestParameters: js.UndefOr[RouteParameters] = js.undefined,
        RouteId: js.UndefOr[Id] = js.undefined,
        RouteKey: js.UndefOr[SelectionKey] = js.undefined,
        RouteResponseSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        Target: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    ): UpdateRouteResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ApiKeyRequired.foreach(__v => __obj.update("ApiKeyRequired", __v.asInstanceOf[js.Any]))
      AuthorizationScopes.foreach(__v => __obj.update("AuthorizationScopes", __v.asInstanceOf[js.Any]))
      AuthorizationType.foreach(__v => __obj.update("AuthorizationType", __v.asInstanceOf[js.Any]))
      AuthorizerId.foreach(__v => __obj.update("AuthorizerId", __v.asInstanceOf[js.Any]))
      ModelSelectionExpression.foreach(__v => __obj.update("ModelSelectionExpression", __v.asInstanceOf[js.Any]))
      OperationName.foreach(__v => __obj.update("OperationName", __v.asInstanceOf[js.Any]))
      RequestModels.foreach(__v => __obj.update("RequestModels", __v.asInstanceOf[js.Any]))
      RequestParameters.foreach(__v => __obj.update("RequestParameters", __v.asInstanceOf[js.Any]))
      RouteId.foreach(__v => __obj.update("RouteId", __v.asInstanceOf[js.Any]))
      RouteKey.foreach(__v => __obj.update("RouteKey", __v.asInstanceOf[js.Any]))
      RouteResponseSelectionExpression.foreach(
        __v => __obj.update("RouteResponseSelectionExpression", __v.asInstanceOf[js.Any])
      )
      Target.foreach(__v => __obj.update("Target", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRouteResponse]
    }
  }

  @js.native
  trait UpdateRouteResponseRequest extends js.Object {
    var ApiId: __string
    var RouteId: __string
    var RouteResponseId: __string
    var ModelSelectionExpression: js.UndefOr[SelectionExpression]
    var ResponseModels: js.UndefOr[RouteModels]
    var ResponseParameters: js.UndefOr[RouteParameters]
    var RouteResponseKey: js.UndefOr[SelectionKey]
  }

  object UpdateRouteResponseRequest {
    def apply(
        ApiId: __string,
        RouteId: __string,
        RouteResponseId: __string,
        ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        ResponseModels: js.UndefOr[RouteModels] = js.undefined,
        ResponseParameters: js.UndefOr[RouteParameters] = js.undefined,
        RouteResponseKey: js.UndefOr[SelectionKey] = js.undefined
    ): UpdateRouteResponseRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"           -> ApiId.asInstanceOf[js.Any],
        "RouteId"         -> RouteId.asInstanceOf[js.Any],
        "RouteResponseId" -> RouteResponseId.asInstanceOf[js.Any]
      )

      ModelSelectionExpression.foreach(__v => __obj.update("ModelSelectionExpression", __v.asInstanceOf[js.Any]))
      ResponseModels.foreach(__v => __obj.update("ResponseModels", __v.asInstanceOf[js.Any]))
      ResponseParameters.foreach(__v => __obj.update("ResponseParameters", __v.asInstanceOf[js.Any]))
      RouteResponseKey.foreach(__v => __obj.update("RouteResponseKey", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRouteResponseRequest]
    }
  }

  @js.native
  trait UpdateRouteResponseResponse extends js.Object {
    var ModelSelectionExpression: js.UndefOr[SelectionExpression]
    var ResponseModels: js.UndefOr[RouteModels]
    var ResponseParameters: js.UndefOr[RouteParameters]
    var RouteResponseId: js.UndefOr[Id]
    var RouteResponseKey: js.UndefOr[SelectionKey]
  }

  object UpdateRouteResponseResponse {
    def apply(
        ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        ResponseModels: js.UndefOr[RouteModels] = js.undefined,
        ResponseParameters: js.UndefOr[RouteParameters] = js.undefined,
        RouteResponseId: js.UndefOr[Id] = js.undefined,
        RouteResponseKey: js.UndefOr[SelectionKey] = js.undefined
    ): UpdateRouteResponseResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      ModelSelectionExpression.foreach(__v => __obj.update("ModelSelectionExpression", __v.asInstanceOf[js.Any]))
      ResponseModels.foreach(__v => __obj.update("ResponseModels", __v.asInstanceOf[js.Any]))
      ResponseParameters.foreach(__v => __obj.update("ResponseParameters", __v.asInstanceOf[js.Any]))
      RouteResponseId.foreach(__v => __obj.update("RouteResponseId", __v.asInstanceOf[js.Any]))
      RouteResponseKey.foreach(__v => __obj.update("RouteResponseKey", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRouteResponseResponse]
    }
  }

  @js.native
  trait UpdateStageRequest extends js.Object {
    var ApiId: __string
    var StageName: __string
    var AccessLogSettings: js.UndefOr[AccessLogSettings]
    var ClientCertificateId: js.UndefOr[Id]
    var DefaultRouteSettings: js.UndefOr[RouteSettings]
    var DeploymentId: js.UndefOr[Id]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var RouteSettings: js.UndefOr[RouteSettingsMap]
    var StageVariables: js.UndefOr[StageVariablesMap]
  }

  object UpdateStageRequest {
    def apply(
        ApiId: __string,
        StageName: __string,
        AccessLogSettings: js.UndefOr[AccessLogSettings] = js.undefined,
        ClientCertificateId: js.UndefOr[Id] = js.undefined,
        DefaultRouteSettings: js.UndefOr[RouteSettings] = js.undefined,
        DeploymentId: js.UndefOr[Id] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        RouteSettings: js.UndefOr[RouteSettingsMap] = js.undefined,
        StageVariables: js.UndefOr[StageVariablesMap] = js.undefined
    ): UpdateStageRequest = {
      val __obj = js.Dictionary[js.Any](
        "ApiId"     -> ApiId.asInstanceOf[js.Any],
        "StageName" -> StageName.asInstanceOf[js.Any]
      )

      AccessLogSettings.foreach(__v => __obj.update("AccessLogSettings", __v.asInstanceOf[js.Any]))
      ClientCertificateId.foreach(__v => __obj.update("ClientCertificateId", __v.asInstanceOf[js.Any]))
      DefaultRouteSettings.foreach(__v => __obj.update("DefaultRouteSettings", __v.asInstanceOf[js.Any]))
      DeploymentId.foreach(__v => __obj.update("DeploymentId", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      RouteSettings.foreach(__v => __obj.update("RouteSettings", __v.asInstanceOf[js.Any]))
      StageVariables.foreach(__v => __obj.update("StageVariables", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateStageRequest]
    }
  }

  @js.native
  trait UpdateStageResponse extends js.Object {
    var AccessLogSettings: js.UndefOr[AccessLogSettings]
    var ClientCertificateId: js.UndefOr[Id]
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var DefaultRouteSettings: js.UndefOr[RouteSettings]
    var DeploymentId: js.UndefOr[Id]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var LastUpdatedDate: js.UndefOr[__timestampIso8601]
    var RouteSettings: js.UndefOr[RouteSettingsMap]
    var StageName: js.UndefOr[StringWithLengthBetween1And128]
    var StageVariables: js.UndefOr[StageVariablesMap]
    var Tags: js.UndefOr[Tags]
  }

  object UpdateStageResponse {
    def apply(
        AccessLogSettings: js.UndefOr[AccessLogSettings] = js.undefined,
        ClientCertificateId: js.UndefOr[Id] = js.undefined,
        CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        DefaultRouteSettings: js.UndefOr[RouteSettings] = js.undefined,
        DeploymentId: js.UndefOr[Id] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        LastUpdatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        RouteSettings: js.UndefOr[RouteSettingsMap] = js.undefined,
        StageName: js.UndefOr[StringWithLengthBetween1And128] = js.undefined,
        StageVariables: js.UndefOr[StageVariablesMap] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): UpdateStageResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      AccessLogSettings.foreach(__v => __obj.update("AccessLogSettings", __v.asInstanceOf[js.Any]))
      ClientCertificateId.foreach(__v => __obj.update("ClientCertificateId", __v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.update("CreatedDate", __v.asInstanceOf[js.Any]))
      DefaultRouteSettings.foreach(__v => __obj.update("DefaultRouteSettings", __v.asInstanceOf[js.Any]))
      DeploymentId.foreach(__v => __obj.update("DeploymentId", __v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.update("Description", __v.asInstanceOf[js.Any]))
      LastUpdatedDate.foreach(__v => __obj.update("LastUpdatedDate", __v.asInstanceOf[js.Any]))
      RouteSettings.foreach(__v => __obj.update("RouteSettings", __v.asInstanceOf[js.Any]))
      StageName.foreach(__v => __obj.update("StageName", __v.asInstanceOf[js.Any]))
      StageVariables.foreach(__v => __obj.update("StageVariables", __v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.update("Tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateStageResponse]
    }
  }
}
