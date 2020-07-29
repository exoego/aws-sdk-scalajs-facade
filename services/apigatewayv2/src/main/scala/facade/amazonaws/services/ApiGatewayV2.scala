package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object apigatewayv2 {
  type Arn = String
  type AuthorizationScopes = js.Array[StringWithLengthBetween1And64]
  type CorsHeaderList = js.Array[__string]
  type CorsMethodList = js.Array[StringWithLengthBetween1And64]
  type CorsOriginList = js.Array[__string]
  type DomainNameConfigurations = js.Array[DomainNameConfiguration]
  type ExportedApi = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type Id = String
  type IdentitySourceList = js.Array[__string]
  type IntegerWithLengthBetween0And3600 = Int
  type IntegerWithLengthBetween50And30000 = Int
  type IntegerWithLengthBetweenMinus1And86400 = Int
  type IntegrationParameters = js.Dictionary[StringWithLengthBetween1And512]
  type NextToken = String
  type RouteModels = js.Dictionary[StringWithLengthBetween1And128]
  type RouteParameters = js.Dictionary[ParameterConstraints]
  type RouteSettingsMap = js.Dictionary[RouteSettings]
  type SecurityGroupIdList = js.Array[__string]
  type SelectionExpression = String
  type SelectionKey = String
  type StageVariablesMap = js.Dictionary[StringWithLengthBetween0And2048]
  type StringWithLengthBetween0And1024 = String
  type StringWithLengthBetween0And2048 = String
  type StringWithLengthBetween0And32K = String
  type StringWithLengthBetween1And1024 = String
  type StringWithLengthBetween1And128 = String
  type StringWithLengthBetween1And1600 = String
  type StringWithLengthBetween1And256 = String
  type StringWithLengthBetween1And512 = String
  type StringWithLengthBetween1And64 = String
  type SubnetIdList = js.Array[__string]
  type Tags = js.Dictionary[StringWithLengthBetween1And1600]
  type TemplateMap = js.Dictionary[StringWithLengthBetween0And32K]
  type UriWithLengthBetween1And2048 = String
  type __boolean = Boolean
  type __double = Double
  type __integer = Int
  type __listOfApi = js.Array[Api]
  type __listOfApiMapping = js.Array[ApiMapping]
  type __listOfAuthorizer = js.Array[Authorizer]
  type __listOfDeployment = js.Array[Deployment]
  type __listOfDomainName = js.Array[DomainName]
  type __listOfIntegration = js.Array[Integration]
  type __listOfIntegrationResponse = js.Array[IntegrationResponse]
  type __listOfModel = js.Array[Model]
  type __listOfRoute = js.Array[Route]
  type __listOfRouteResponse = js.Array[RouteResponse]
  type __listOfStage = js.Array[Stage]
  type __listOfVpcLink = js.Array[VpcLink]
  type __listOf__string = js.Array[__string]
  type __string = String
  type __timestampIso8601 = js.Date

  implicit final class ApiGatewayV2Ops(private val service: ApiGatewayV2) extends AnyVal {

    @inline def createApiFuture(params: CreateApiRequest): Future[CreateApiResponse] = service.createApi(params).promise().toFuture
    @inline def createApiMappingFuture(params: CreateApiMappingRequest): Future[CreateApiMappingResponse] = service.createApiMapping(params).promise().toFuture
    @inline def createAuthorizerFuture(params: CreateAuthorizerRequest): Future[CreateAuthorizerResponse] = service.createAuthorizer(params).promise().toFuture
    @inline def createDeploymentFuture(params: CreateDeploymentRequest): Future[CreateDeploymentResponse] = service.createDeployment(params).promise().toFuture
    @inline def createDomainNameFuture(params: CreateDomainNameRequest): Future[CreateDomainNameResponse] = service.createDomainName(params).promise().toFuture
    @inline def createIntegrationFuture(params: CreateIntegrationRequest): Future[CreateIntegrationResult] = service.createIntegration(params).promise().toFuture
    @inline def createIntegrationResponseFuture(params: CreateIntegrationResponseRequest): Future[CreateIntegrationResponseResponse] = service.createIntegrationResponse(params).promise().toFuture
    @inline def createModelFuture(params: CreateModelRequest): Future[CreateModelResponse] = service.createModel(params).promise().toFuture
    @inline def createRouteFuture(params: CreateRouteRequest): Future[CreateRouteResult] = service.createRoute(params).promise().toFuture
    @inline def createRouteResponseFuture(params: CreateRouteResponseRequest): Future[CreateRouteResponseResponse] = service.createRouteResponse(params).promise().toFuture
    @inline def createStageFuture(params: CreateStageRequest): Future[CreateStageResponse] = service.createStage(params).promise().toFuture
    @inline def createVpcLinkFuture(params: CreateVpcLinkRequest): Future[CreateVpcLinkResponse] = service.createVpcLink(params).promise().toFuture
    @inline def deleteAccessLogSettingsFuture(params: DeleteAccessLogSettingsRequest): Future[js.Object] = service.deleteAccessLogSettings(params).promise().toFuture
    @inline def deleteApiFuture(params: DeleteApiRequest): Future[js.Object] = service.deleteApi(params).promise().toFuture
    @inline def deleteApiMappingFuture(params: DeleteApiMappingRequest): Future[js.Object] = service.deleteApiMapping(params).promise().toFuture
    @inline def deleteAuthorizerFuture(params: DeleteAuthorizerRequest): Future[js.Object] = service.deleteAuthorizer(params).promise().toFuture
    @inline def deleteCorsConfigurationFuture(params: DeleteCorsConfigurationRequest): Future[js.Object] = service.deleteCorsConfiguration(params).promise().toFuture
    @inline def deleteDeploymentFuture(params: DeleteDeploymentRequest): Future[js.Object] = service.deleteDeployment(params).promise().toFuture
    @inline def deleteDomainNameFuture(params: DeleteDomainNameRequest): Future[js.Object] = service.deleteDomainName(params).promise().toFuture
    @inline def deleteIntegrationFuture(params: DeleteIntegrationRequest): Future[js.Object] = service.deleteIntegration(params).promise().toFuture
    @inline def deleteIntegrationResponseFuture(params: DeleteIntegrationResponseRequest): Future[js.Object] = service.deleteIntegrationResponse(params).promise().toFuture
    @inline def deleteModelFuture(params: DeleteModelRequest): Future[js.Object] = service.deleteModel(params).promise().toFuture
    @inline def deleteRouteFuture(params: DeleteRouteRequest): Future[js.Object] = service.deleteRoute(params).promise().toFuture
    @inline def deleteRouteRequestParameterFuture(params: DeleteRouteRequestParameterRequest): Future[js.Object] = service.deleteRouteRequestParameter(params).promise().toFuture
    @inline def deleteRouteResponseFuture(params: DeleteRouteResponseRequest): Future[js.Object] = service.deleteRouteResponse(params).promise().toFuture
    @inline def deleteRouteSettingsFuture(params: DeleteRouteSettingsRequest): Future[js.Object] = service.deleteRouteSettings(params).promise().toFuture
    @inline def deleteStageFuture(params: DeleteStageRequest): Future[js.Object] = service.deleteStage(params).promise().toFuture
    @inline def deleteVpcLinkFuture(params: DeleteVpcLinkRequest): Future[DeleteVpcLinkResponse] = service.deleteVpcLink(params).promise().toFuture
    @inline def exportApiFuture(params: ExportApiRequest): Future[ExportApiResponse] = service.exportApi(params).promise().toFuture
    @inline def getApiFuture(params: GetApiRequest): Future[GetApiResponse] = service.getApi(params).promise().toFuture
    @inline def getApiMappingFuture(params: GetApiMappingRequest): Future[GetApiMappingResponse] = service.getApiMapping(params).promise().toFuture
    @inline def getApiMappingsFuture(params: GetApiMappingsRequest): Future[GetApiMappingsResponse] = service.getApiMappings(params).promise().toFuture
    @inline def getApisFuture(params: GetApisRequest): Future[GetApisResponse] = service.getApis(params).promise().toFuture
    @inline def getAuthorizerFuture(params: GetAuthorizerRequest): Future[GetAuthorizerResponse] = service.getAuthorizer(params).promise().toFuture
    @inline def getAuthorizersFuture(params: GetAuthorizersRequest): Future[GetAuthorizersResponse] = service.getAuthorizers(params).promise().toFuture
    @inline def getDeploymentFuture(params: GetDeploymentRequest): Future[GetDeploymentResponse] = service.getDeployment(params).promise().toFuture
    @inline def getDeploymentsFuture(params: GetDeploymentsRequest): Future[GetDeploymentsResponse] = service.getDeployments(params).promise().toFuture
    @inline def getDomainNameFuture(params: GetDomainNameRequest): Future[GetDomainNameResponse] = service.getDomainName(params).promise().toFuture
    @inline def getDomainNamesFuture(params: GetDomainNamesRequest): Future[GetDomainNamesResponse] = service.getDomainNames(params).promise().toFuture
    @inline def getIntegrationFuture(params: GetIntegrationRequest): Future[GetIntegrationResult] = service.getIntegration(params).promise().toFuture
    @inline def getIntegrationResponseFuture(params: GetIntegrationResponseRequest): Future[GetIntegrationResponseResponse] = service.getIntegrationResponse(params).promise().toFuture
    @inline def getIntegrationResponsesFuture(params: GetIntegrationResponsesRequest): Future[GetIntegrationResponsesResponse] = service.getIntegrationResponses(params).promise().toFuture
    @inline def getIntegrationsFuture(params: GetIntegrationsRequest): Future[GetIntegrationsResponse] = service.getIntegrations(params).promise().toFuture
    @inline def getModelFuture(params: GetModelRequest): Future[GetModelResponse] = service.getModel(params).promise().toFuture
    @inline def getModelTemplateFuture(params: GetModelTemplateRequest): Future[GetModelTemplateResponse] = service.getModelTemplate(params).promise().toFuture
    @inline def getModelsFuture(params: GetModelsRequest): Future[GetModelsResponse] = service.getModels(params).promise().toFuture
    @inline def getRouteFuture(params: GetRouteRequest): Future[GetRouteResult] = service.getRoute(params).promise().toFuture
    @inline def getRouteResponseFuture(params: GetRouteResponseRequest): Future[GetRouteResponseResponse] = service.getRouteResponse(params).promise().toFuture
    @inline def getRouteResponsesFuture(params: GetRouteResponsesRequest): Future[GetRouteResponsesResponse] = service.getRouteResponses(params).promise().toFuture
    @inline def getRoutesFuture(params: GetRoutesRequest): Future[GetRoutesResponse] = service.getRoutes(params).promise().toFuture
    @inline def getStageFuture(params: GetStageRequest): Future[GetStageResponse] = service.getStage(params).promise().toFuture
    @inline def getStagesFuture(params: GetStagesRequest): Future[GetStagesResponse] = service.getStages(params).promise().toFuture
    @inline def getTagsFuture(params: GetTagsRequest): Future[GetTagsResponse] = service.getTags(params).promise().toFuture
    @inline def getVpcLinkFuture(params: GetVpcLinkRequest): Future[GetVpcLinkResponse] = service.getVpcLink(params).promise().toFuture
    @inline def getVpcLinksFuture(params: GetVpcLinksRequest): Future[GetVpcLinksResponse] = service.getVpcLinks(params).promise().toFuture
    @inline def importApiFuture(params: ImportApiRequest): Future[ImportApiResponse] = service.importApi(params).promise().toFuture
    @inline def reimportApiFuture(params: ReimportApiRequest): Future[ReimportApiResponse] = service.reimportApi(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] = service.untagResource(params).promise().toFuture
    @inline def updateApiFuture(params: UpdateApiRequest): Future[UpdateApiResponse] = service.updateApi(params).promise().toFuture
    @inline def updateApiMappingFuture(params: UpdateApiMappingRequest): Future[UpdateApiMappingResponse] = service.updateApiMapping(params).promise().toFuture
    @inline def updateAuthorizerFuture(params: UpdateAuthorizerRequest): Future[UpdateAuthorizerResponse] = service.updateAuthorizer(params).promise().toFuture
    @inline def updateDeploymentFuture(params: UpdateDeploymentRequest): Future[UpdateDeploymentResponse] = service.updateDeployment(params).promise().toFuture
    @inline def updateDomainNameFuture(params: UpdateDomainNameRequest): Future[UpdateDomainNameResponse] = service.updateDomainName(params).promise().toFuture
    @inline def updateIntegrationFuture(params: UpdateIntegrationRequest): Future[UpdateIntegrationResult] = service.updateIntegration(params).promise().toFuture
    @inline def updateIntegrationResponseFuture(params: UpdateIntegrationResponseRequest): Future[UpdateIntegrationResponseResponse] = service.updateIntegrationResponse(params).promise().toFuture
    @inline def updateModelFuture(params: UpdateModelRequest): Future[UpdateModelResponse] = service.updateModel(params).promise().toFuture
    @inline def updateRouteFuture(params: UpdateRouteRequest): Future[UpdateRouteResult] = service.updateRoute(params).promise().toFuture
    @inline def updateRouteResponseFuture(params: UpdateRouteResponseRequest): Future[UpdateRouteResponseResponse] = service.updateRouteResponse(params).promise().toFuture
    @inline def updateStageFuture(params: UpdateStageRequest): Future[UpdateStageResponse] = service.updateStage(params).promise().toFuture
    @inline def updateVpcLinkFuture(params: UpdateVpcLinkRequest): Future[UpdateVpcLinkResponse] = service.updateVpcLink(params).promise().toFuture
  }
}

package apigatewayv2 {
  @js.native
  @JSImport("aws-sdk", "ApiGatewayV2", "AWS.ApiGatewayV2")
  class ApiGatewayV2() extends js.Object {
    def this(config: AWSConfig) = this()

    def createApi(params: CreateApiRequest): Request[CreateApiResponse] = js.native
    def createApiMapping(params: CreateApiMappingRequest): Request[CreateApiMappingResponse] = js.native
    def createAuthorizer(params: CreateAuthorizerRequest): Request[CreateAuthorizerResponse] = js.native
    def createDeployment(params: CreateDeploymentRequest): Request[CreateDeploymentResponse] = js.native
    def createDomainName(params: CreateDomainNameRequest): Request[CreateDomainNameResponse] = js.native
    def createIntegration(params: CreateIntegrationRequest): Request[CreateIntegrationResult] = js.native
    def createIntegrationResponse(params: CreateIntegrationResponseRequest): Request[CreateIntegrationResponseResponse] = js.native
    def createModel(params: CreateModelRequest): Request[CreateModelResponse] = js.native
    def createRoute(params: CreateRouteRequest): Request[CreateRouteResult] = js.native
    def createRouteResponse(params: CreateRouteResponseRequest): Request[CreateRouteResponseResponse] = js.native
    def createStage(params: CreateStageRequest): Request[CreateStageResponse] = js.native
    def createVpcLink(params: CreateVpcLinkRequest): Request[CreateVpcLinkResponse] = js.native
    def deleteAccessLogSettings(params: DeleteAccessLogSettingsRequest): Request[js.Object] = js.native
    def deleteApi(params: DeleteApiRequest): Request[js.Object] = js.native
    def deleteApiMapping(params: DeleteApiMappingRequest): Request[js.Object] = js.native
    def deleteAuthorizer(params: DeleteAuthorizerRequest): Request[js.Object] = js.native
    def deleteCorsConfiguration(params: DeleteCorsConfigurationRequest): Request[js.Object] = js.native
    def deleteDeployment(params: DeleteDeploymentRequest): Request[js.Object] = js.native
    def deleteDomainName(params: DeleteDomainNameRequest): Request[js.Object] = js.native
    def deleteIntegration(params: DeleteIntegrationRequest): Request[js.Object] = js.native
    def deleteIntegrationResponse(params: DeleteIntegrationResponseRequest): Request[js.Object] = js.native
    def deleteModel(params: DeleteModelRequest): Request[js.Object] = js.native
    def deleteRoute(params: DeleteRouteRequest): Request[js.Object] = js.native
    def deleteRouteRequestParameter(params: DeleteRouteRequestParameterRequest): Request[js.Object] = js.native
    def deleteRouteResponse(params: DeleteRouteResponseRequest): Request[js.Object] = js.native
    def deleteRouteSettings(params: DeleteRouteSettingsRequest): Request[js.Object] = js.native
    def deleteStage(params: DeleteStageRequest): Request[js.Object] = js.native
    def deleteVpcLink(params: DeleteVpcLinkRequest): Request[DeleteVpcLinkResponse] = js.native
    def exportApi(params: ExportApiRequest): Request[ExportApiResponse] = js.native
    def getApi(params: GetApiRequest): Request[GetApiResponse] = js.native
    def getApiMapping(params: GetApiMappingRequest): Request[GetApiMappingResponse] = js.native
    def getApiMappings(params: GetApiMappingsRequest): Request[GetApiMappingsResponse] = js.native
    def getApis(params: GetApisRequest): Request[GetApisResponse] = js.native
    def getAuthorizer(params: GetAuthorizerRequest): Request[GetAuthorizerResponse] = js.native
    def getAuthorizers(params: GetAuthorizersRequest): Request[GetAuthorizersResponse] = js.native
    def getDeployment(params: GetDeploymentRequest): Request[GetDeploymentResponse] = js.native
    def getDeployments(params: GetDeploymentsRequest): Request[GetDeploymentsResponse] = js.native
    def getDomainName(params: GetDomainNameRequest): Request[GetDomainNameResponse] = js.native
    def getDomainNames(params: GetDomainNamesRequest): Request[GetDomainNamesResponse] = js.native
    def getIntegration(params: GetIntegrationRequest): Request[GetIntegrationResult] = js.native
    def getIntegrationResponse(params: GetIntegrationResponseRequest): Request[GetIntegrationResponseResponse] = js.native
    def getIntegrationResponses(params: GetIntegrationResponsesRequest): Request[GetIntegrationResponsesResponse] = js.native
    def getIntegrations(params: GetIntegrationsRequest): Request[GetIntegrationsResponse] = js.native
    def getModel(params: GetModelRequest): Request[GetModelResponse] = js.native
    def getModelTemplate(params: GetModelTemplateRequest): Request[GetModelTemplateResponse] = js.native
    def getModels(params: GetModelsRequest): Request[GetModelsResponse] = js.native
    def getRoute(params: GetRouteRequest): Request[GetRouteResult] = js.native
    def getRouteResponse(params: GetRouteResponseRequest): Request[GetRouteResponseResponse] = js.native
    def getRouteResponses(params: GetRouteResponsesRequest): Request[GetRouteResponsesResponse] = js.native
    def getRoutes(params: GetRoutesRequest): Request[GetRoutesResponse] = js.native
    def getStage(params: GetStageRequest): Request[GetStageResponse] = js.native
    def getStages(params: GetStagesRequest): Request[GetStagesResponse] = js.native
    def getTags(params: GetTagsRequest): Request[GetTagsResponse] = js.native
    def getVpcLink(params: GetVpcLinkRequest): Request[GetVpcLinkResponse] = js.native
    def getVpcLinks(params: GetVpcLinksRequest): Request[GetVpcLinksResponse] = js.native
    def importApi(params: ImportApiRequest): Request[ImportApiResponse] = js.native
    def reimportApi(params: ReimportApiRequest): Request[ReimportApiResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateApi(params: UpdateApiRequest): Request[UpdateApiResponse] = js.native
    def updateApiMapping(params: UpdateApiMappingRequest): Request[UpdateApiMappingResponse] = js.native
    def updateAuthorizer(params: UpdateAuthorizerRequest): Request[UpdateAuthorizerResponse] = js.native
    def updateDeployment(params: UpdateDeploymentRequest): Request[UpdateDeploymentResponse] = js.native
    def updateDomainName(params: UpdateDomainNameRequest): Request[UpdateDomainNameResponse] = js.native
    def updateIntegration(params: UpdateIntegrationRequest): Request[UpdateIntegrationResult] = js.native
    def updateIntegrationResponse(params: UpdateIntegrationResponseRequest): Request[UpdateIntegrationResponseResponse] = js.native
    def updateModel(params: UpdateModelRequest): Request[UpdateModelResponse] = js.native
    def updateRoute(params: UpdateRouteRequest): Request[UpdateRouteResult] = js.native
    def updateRouteResponse(params: UpdateRouteResponseRequest): Request[UpdateRouteResponseResponse] = js.native
    def updateStage(params: UpdateStageRequest): Request[UpdateStageResponse] = js.native
    def updateVpcLink(params: UpdateVpcLinkRequest): Request[UpdateVpcLinkResponse] = js.native
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
    @inline
    def apply(
        DestinationArn: js.UndefOr[Arn] = js.undefined,
        Format: js.UndefOr[StringWithLengthBetween1And1024] = js.undefined
    ): AccessLogSettings = {
      val __obj = js.Dynamic.literal()
      DestinationArn.foreach(__v => __obj.updateDynamic("DestinationArn")(__v.asInstanceOf[js.Any]))
      Format.foreach(__v => __obj.updateDynamic("Format")(__v.asInstanceOf[js.Any]))
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
    var CorsConfiguration: js.UndefOr[Cors]
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var DisableSchemaValidation: js.UndefOr[__boolean]
    var ImportInfo: js.UndefOr[__listOf__string]
    var Tags: js.UndefOr[Tags]
    var Version: js.UndefOr[StringWithLengthBetween1And64]
    var Warnings: js.UndefOr[__listOf__string]
  }

  object Api {
    @inline
    def apply(
        Name: StringWithLengthBetween1And128,
        ProtocolType: ProtocolType,
        RouteSelectionExpression: SelectionExpression,
        ApiEndpoint: js.UndefOr[__string] = js.undefined,
        ApiId: js.UndefOr[Id] = js.undefined,
        ApiKeySelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        CorsConfiguration: js.UndefOr[Cors] = js.undefined,
        CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        DisableSchemaValidation: js.UndefOr[__boolean] = js.undefined,
        ImportInfo: js.UndefOr[__listOf__string] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        Version: js.UndefOr[StringWithLengthBetween1And64] = js.undefined,
        Warnings: js.UndefOr[__listOf__string] = js.undefined
    ): Api = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "ProtocolType" -> ProtocolType.asInstanceOf[js.Any],
        "RouteSelectionExpression" -> RouteSelectionExpression.asInstanceOf[js.Any]
      )

      ApiEndpoint.foreach(__v => __obj.updateDynamic("ApiEndpoint")(__v.asInstanceOf[js.Any]))
      ApiId.foreach(__v => __obj.updateDynamic("ApiId")(__v.asInstanceOf[js.Any]))
      ApiKeySelectionExpression.foreach(__v => __obj.updateDynamic("ApiKeySelectionExpression")(__v.asInstanceOf[js.Any]))
      CorsConfiguration.foreach(__v => __obj.updateDynamic("CorsConfiguration")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisableSchemaValidation.foreach(__v => __obj.updateDynamic("DisableSchemaValidation")(__v.asInstanceOf[js.Any]))
      ImportInfo.foreach(__v => __obj.updateDynamic("ImportInfo")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      Warnings.foreach(__v => __obj.updateDynamic("Warnings")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ApiId: Id,
        Stage: StringWithLengthBetween1And128,
        ApiMappingId: js.UndefOr[Id] = js.undefined,
        ApiMappingKey: js.UndefOr[SelectionKey] = js.undefined
    ): ApiMapping = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "Stage" -> Stage.asInstanceOf[js.Any]
      )

      ApiMappingId.foreach(__v => __obj.updateDynamic("ApiMappingId")(__v.asInstanceOf[js.Any]))
      ApiMappingKey.foreach(__v => __obj.updateDynamic("ApiMappingKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApiMapping]
    }
  }

  /**
    * The authorization type. For WebSocket APIs, valid values are NONE for open access, AWS_IAM for using AWS IAM permissions, and CUSTOM for using a Lambda authorizer. For HTTP APIs, valid values are NONE for open access, or JWT for using JSON Web Tokens.
    */
  @js.native
  sealed trait AuthorizationType extends js.Any
  object AuthorizationType {
    val NONE = "NONE".asInstanceOf[AuthorizationType]
    val AWS_IAM = "AWS_IAM".asInstanceOf[AuthorizationType]
    val CUSTOM = "CUSTOM".asInstanceOf[AuthorizationType]
    val JWT = "JWT".asInstanceOf[AuthorizationType]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(NONE, AWS_IAM, CUSTOM, JWT))
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
    var JwtConfiguration: js.UndefOr[JWTConfiguration]
  }

  object Authorizer {
    @inline
    def apply(
        Name: StringWithLengthBetween1And128,
        AuthorizerCredentialsArn: js.UndefOr[Arn] = js.undefined,
        AuthorizerId: js.UndefOr[Id] = js.undefined,
        AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600] = js.undefined,
        AuthorizerType: js.UndefOr[AuthorizerType] = js.undefined,
        AuthorizerUri: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined,
        IdentitySource: js.UndefOr[IdentitySourceList] = js.undefined,
        IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        JwtConfiguration: js.UndefOr[JWTConfiguration] = js.undefined
    ): Authorizer = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AuthorizerCredentialsArn.foreach(__v => __obj.updateDynamic("AuthorizerCredentialsArn")(__v.asInstanceOf[js.Any]))
      AuthorizerId.foreach(__v => __obj.updateDynamic("AuthorizerId")(__v.asInstanceOf[js.Any]))
      AuthorizerResultTtlInSeconds.foreach(__v => __obj.updateDynamic("AuthorizerResultTtlInSeconds")(__v.asInstanceOf[js.Any]))
      AuthorizerType.foreach(__v => __obj.updateDynamic("AuthorizerType")(__v.asInstanceOf[js.Any]))
      AuthorizerUri.foreach(__v => __obj.updateDynamic("AuthorizerUri")(__v.asInstanceOf[js.Any]))
      IdentitySource.foreach(__v => __obj.updateDynamic("IdentitySource")(__v.asInstanceOf[js.Any]))
      IdentityValidationExpression.foreach(__v => __obj.updateDynamic("IdentityValidationExpression")(__v.asInstanceOf[js.Any]))
      JwtConfiguration.foreach(__v => __obj.updateDynamic("JwtConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Authorizer]
    }
  }

  /**
    * The authorizer type. For WebSocket APIs, specify REQUEST for a Lambda function using incoming request parameters. For HTTP APIs, specify JWT to use JSON Web Tokens.
    */
  @js.native
  sealed trait AuthorizerType extends js.Any
  object AuthorizerType {
    val REQUEST = "REQUEST".asInstanceOf[AuthorizerType]
    val JWT = "JWT".asInstanceOf[AuthorizerType]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(REQUEST, JWT))
  }

  /**
    * Represents a connection type.
    */
  @js.native
  sealed trait ConnectionType extends js.Any
  object ConnectionType {
    val INTERNET = "INTERNET".asInstanceOf[ConnectionType]
    val VPC_LINK = "VPC_LINK".asInstanceOf[ConnectionType]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(INTERNET, VPC_LINK))
  }

  /**
    * Specifies how to handle response payload content type conversions. Supported only for WebSocket APIs.
    */
  @js.native
  sealed trait ContentHandlingStrategy extends js.Any
  object ContentHandlingStrategy {
    val CONVERT_TO_BINARY = "CONVERT_TO_BINARY".asInstanceOf[ContentHandlingStrategy]
    val CONVERT_TO_TEXT = "CONVERT_TO_TEXT".asInstanceOf[ContentHandlingStrategy]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(CONVERT_TO_BINARY, CONVERT_TO_TEXT))
  }

  /**
    * Represents a CORS configuration. Supported only for HTTP APIs. See [[https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-cors.html|Configuring CORS]] for more information.
    */
  @js.native
  trait Cors extends js.Object {
    var AllowCredentials: js.UndefOr[__boolean]
    var AllowHeaders: js.UndefOr[CorsHeaderList]
    var AllowMethods: js.UndefOr[CorsMethodList]
    var AllowOrigins: js.UndefOr[CorsOriginList]
    var ExposeHeaders: js.UndefOr[CorsHeaderList]
    var MaxAge: js.UndefOr[IntegerWithLengthBetweenMinus1And86400]
  }

  object Cors {
    @inline
    def apply(
        AllowCredentials: js.UndefOr[__boolean] = js.undefined,
        AllowHeaders: js.UndefOr[CorsHeaderList] = js.undefined,
        AllowMethods: js.UndefOr[CorsMethodList] = js.undefined,
        AllowOrigins: js.UndefOr[CorsOriginList] = js.undefined,
        ExposeHeaders: js.UndefOr[CorsHeaderList] = js.undefined,
        MaxAge: js.UndefOr[IntegerWithLengthBetweenMinus1And86400] = js.undefined
    ): Cors = {
      val __obj = js.Dynamic.literal()
      AllowCredentials.foreach(__v => __obj.updateDynamic("AllowCredentials")(__v.asInstanceOf[js.Any]))
      AllowHeaders.foreach(__v => __obj.updateDynamic("AllowHeaders")(__v.asInstanceOf[js.Any]))
      AllowMethods.foreach(__v => __obj.updateDynamic("AllowMethods")(__v.asInstanceOf[js.Any]))
      AllowOrigins.foreach(__v => __obj.updateDynamic("AllowOrigins")(__v.asInstanceOf[js.Any]))
      ExposeHeaders.foreach(__v => __obj.updateDynamic("ExposeHeaders")(__v.asInstanceOf[js.Any]))
      MaxAge.foreach(__v => __obj.updateDynamic("MaxAge")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Cors]
    }
  }

  /**
    * Creates a new ApiMapping resource to represent an API mapping.
    */
  @js.native
  trait CreateApiMappingRequest extends js.Object {
    var ApiId: Id
    var DomainName: __string
    var Stage: StringWithLengthBetween1And128
    var ApiMappingKey: js.UndefOr[SelectionKey]
  }

  object CreateApiMappingRequest {
    @inline
    def apply(
        ApiId: Id,
        DomainName: __string,
        Stage: StringWithLengthBetween1And128,
        ApiMappingKey: js.UndefOr[SelectionKey] = js.undefined
    ): CreateApiMappingRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any],
        "Stage" -> Stage.asInstanceOf[js.Any]
      )

      ApiMappingKey.foreach(__v => __obj.updateDynamic("ApiMappingKey")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ApiId: js.UndefOr[Id] = js.undefined,
        ApiMappingId: js.UndefOr[Id] = js.undefined,
        ApiMappingKey: js.UndefOr[SelectionKey] = js.undefined,
        Stage: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    ): CreateApiMappingResponse = {
      val __obj = js.Dynamic.literal()
      ApiId.foreach(__v => __obj.updateDynamic("ApiId")(__v.asInstanceOf[js.Any]))
      ApiMappingId.foreach(__v => __obj.updateDynamic("ApiMappingId")(__v.asInstanceOf[js.Any]))
      ApiMappingKey.foreach(__v => __obj.updateDynamic("ApiMappingKey")(__v.asInstanceOf[js.Any]))
      Stage.foreach(__v => __obj.updateDynamic("Stage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApiMappingResponse]
    }
  }

  /**
    * Creates a new Api resource to represent an API.
    */
  @js.native
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

  object CreateApiRequest {
    @inline
    def apply(
        Name: StringWithLengthBetween1And128,
        ProtocolType: ProtocolType,
        ApiKeySelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        CorsConfiguration: js.UndefOr[Cors] = js.undefined,
        CredentialsArn: js.UndefOr[Arn] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        DisableSchemaValidation: js.UndefOr[__boolean] = js.undefined,
        RouteKey: js.UndefOr[SelectionKey] = js.undefined,
        RouteSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        Target: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined,
        Version: js.UndefOr[StringWithLengthBetween1And64] = js.undefined
    ): CreateApiRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "ProtocolType" -> ProtocolType.asInstanceOf[js.Any]
      )

      ApiKeySelectionExpression.foreach(__v => __obj.updateDynamic("ApiKeySelectionExpression")(__v.asInstanceOf[js.Any]))
      CorsConfiguration.foreach(__v => __obj.updateDynamic("CorsConfiguration")(__v.asInstanceOf[js.Any]))
      CredentialsArn.foreach(__v => __obj.updateDynamic("CredentialsArn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisableSchemaValidation.foreach(__v => __obj.updateDynamic("DisableSchemaValidation")(__v.asInstanceOf[js.Any]))
      RouteKey.foreach(__v => __obj.updateDynamic("RouteKey")(__v.asInstanceOf[js.Any]))
      RouteSelectionExpression.foreach(__v => __obj.updateDynamic("RouteSelectionExpression")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Target.foreach(__v => __obj.updateDynamic("Target")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApiRequest]
    }
  }

  @js.native
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

  object CreateApiResponse {
    @inline
    def apply(
        ApiEndpoint: js.UndefOr[__string] = js.undefined,
        ApiId: js.UndefOr[Id] = js.undefined,
        ApiKeySelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        CorsConfiguration: js.UndefOr[Cors] = js.undefined,
        CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        DisableSchemaValidation: js.UndefOr[__boolean] = js.undefined,
        ImportInfo: js.UndefOr[__listOf__string] = js.undefined,
        Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined,
        ProtocolType: js.UndefOr[ProtocolType] = js.undefined,
        RouteSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        Version: js.UndefOr[StringWithLengthBetween1And64] = js.undefined,
        Warnings: js.UndefOr[__listOf__string] = js.undefined
    ): CreateApiResponse = {
      val __obj = js.Dynamic.literal()
      ApiEndpoint.foreach(__v => __obj.updateDynamic("ApiEndpoint")(__v.asInstanceOf[js.Any]))
      ApiId.foreach(__v => __obj.updateDynamic("ApiId")(__v.asInstanceOf[js.Any]))
      ApiKeySelectionExpression.foreach(__v => __obj.updateDynamic("ApiKeySelectionExpression")(__v.asInstanceOf[js.Any]))
      CorsConfiguration.foreach(__v => __obj.updateDynamic("CorsConfiguration")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisableSchemaValidation.foreach(__v => __obj.updateDynamic("DisableSchemaValidation")(__v.asInstanceOf[js.Any]))
      ImportInfo.foreach(__v => __obj.updateDynamic("ImportInfo")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ProtocolType.foreach(__v => __obj.updateDynamic("ProtocolType")(__v.asInstanceOf[js.Any]))
      RouteSelectionExpression.foreach(__v => __obj.updateDynamic("RouteSelectionExpression")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      Warnings.foreach(__v => __obj.updateDynamic("Warnings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApiResponse]
    }
  }

  /**
    * Creates a new Authorizer resource to represent an authorizer.
    */
  @js.native
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

  object CreateAuthorizerRequest {
    @inline
    def apply(
        ApiId: __string,
        AuthorizerType: AuthorizerType,
        IdentitySource: IdentitySourceList,
        Name: StringWithLengthBetween1And128,
        AuthorizerCredentialsArn: js.UndefOr[Arn] = js.undefined,
        AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600] = js.undefined,
        AuthorizerUri: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined,
        IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        JwtConfiguration: js.UndefOr[JWTConfiguration] = js.undefined
    ): CreateAuthorizerRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "AuthorizerType" -> AuthorizerType.asInstanceOf[js.Any],
        "IdentitySource" -> IdentitySource.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AuthorizerCredentialsArn.foreach(__v => __obj.updateDynamic("AuthorizerCredentialsArn")(__v.asInstanceOf[js.Any]))
      AuthorizerResultTtlInSeconds.foreach(__v => __obj.updateDynamic("AuthorizerResultTtlInSeconds")(__v.asInstanceOf[js.Any]))
      AuthorizerUri.foreach(__v => __obj.updateDynamic("AuthorizerUri")(__v.asInstanceOf[js.Any]))
      IdentityValidationExpression.foreach(__v => __obj.updateDynamic("IdentityValidationExpression")(__v.asInstanceOf[js.Any]))
      JwtConfiguration.foreach(__v => __obj.updateDynamic("JwtConfiguration")(__v.asInstanceOf[js.Any]))
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
    var JwtConfiguration: js.UndefOr[JWTConfiguration]
    var Name: js.UndefOr[StringWithLengthBetween1And128]
  }

  object CreateAuthorizerResponse {
    @inline
    def apply(
        AuthorizerCredentialsArn: js.UndefOr[Arn] = js.undefined,
        AuthorizerId: js.UndefOr[Id] = js.undefined,
        AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600] = js.undefined,
        AuthorizerType: js.UndefOr[AuthorizerType] = js.undefined,
        AuthorizerUri: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined,
        IdentitySource: js.UndefOr[IdentitySourceList] = js.undefined,
        IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        JwtConfiguration: js.UndefOr[JWTConfiguration] = js.undefined,
        Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    ): CreateAuthorizerResponse = {
      val __obj = js.Dynamic.literal()
      AuthorizerCredentialsArn.foreach(__v => __obj.updateDynamic("AuthorizerCredentialsArn")(__v.asInstanceOf[js.Any]))
      AuthorizerId.foreach(__v => __obj.updateDynamic("AuthorizerId")(__v.asInstanceOf[js.Any]))
      AuthorizerResultTtlInSeconds.foreach(__v => __obj.updateDynamic("AuthorizerResultTtlInSeconds")(__v.asInstanceOf[js.Any]))
      AuthorizerType.foreach(__v => __obj.updateDynamic("AuthorizerType")(__v.asInstanceOf[js.Any]))
      AuthorizerUri.foreach(__v => __obj.updateDynamic("AuthorizerUri")(__v.asInstanceOf[js.Any]))
      IdentitySource.foreach(__v => __obj.updateDynamic("IdentitySource")(__v.asInstanceOf[js.Any]))
      IdentityValidationExpression.foreach(__v => __obj.updateDynamic("IdentityValidationExpression")(__v.asInstanceOf[js.Any]))
      JwtConfiguration.foreach(__v => __obj.updateDynamic("JwtConfiguration")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAuthorizerResponse]
    }
  }

  /**
    * Creates a new Deployment resource to represent a deployment.
    */
  @js.native
  trait CreateDeploymentRequest extends js.Object {
    var ApiId: __string
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
    var StageName: js.UndefOr[StringWithLengthBetween1And128]
  }

  object CreateDeploymentRequest {
    @inline
    def apply(
        ApiId: __string,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        StageName: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    ): CreateDeploymentRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      StageName.foreach(__v => __obj.updateDynamic("StageName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeploymentRequest]
    }
  }

  @js.native
  trait CreateDeploymentResponse extends js.Object {
    var AutoDeployed: js.UndefOr[__boolean]
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var DeploymentId: js.UndefOr[Id]
    var DeploymentStatus: js.UndefOr[DeploymentStatus]
    var DeploymentStatusMessage: js.UndefOr[__string]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
  }

  object CreateDeploymentResponse {
    @inline
    def apply(
        AutoDeployed: js.UndefOr[__boolean] = js.undefined,
        CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        DeploymentId: js.UndefOr[Id] = js.undefined,
        DeploymentStatus: js.UndefOr[DeploymentStatus] = js.undefined,
        DeploymentStatusMessage: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    ): CreateDeploymentResponse = {
      val __obj = js.Dynamic.literal()
      AutoDeployed.foreach(__v => __obj.updateDynamic("AutoDeployed")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      DeploymentId.foreach(__v => __obj.updateDynamic("DeploymentId")(__v.asInstanceOf[js.Any]))
      DeploymentStatus.foreach(__v => __obj.updateDynamic("DeploymentStatus")(__v.asInstanceOf[js.Any]))
      DeploymentStatusMessage.foreach(__v => __obj.updateDynamic("DeploymentStatusMessage")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeploymentResponse]
    }
  }

  /**
    * Creates a new DomainName resource to represent a domain name.
    */
  @js.native
  trait CreateDomainNameRequest extends js.Object {
    var DomainName: StringWithLengthBetween1And512
    var DomainNameConfigurations: js.UndefOr[DomainNameConfigurations]
    var Tags: js.UndefOr[Tags]
  }

  object CreateDomainNameRequest {
    @inline
    def apply(
        DomainName: StringWithLengthBetween1And512,
        DomainNameConfigurations: js.UndefOr[DomainNameConfigurations] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateDomainNameRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      DomainNameConfigurations.foreach(__v => __obj.updateDynamic("DomainNameConfigurations")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ApiMappingSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        DomainName: js.UndefOr[StringWithLengthBetween1And512] = js.undefined,
        DomainNameConfigurations: js.UndefOr[DomainNameConfigurations] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateDomainNameResponse = {
      val __obj = js.Dynamic.literal()
      ApiMappingSelectionExpression.foreach(__v => __obj.updateDynamic("ApiMappingSelectionExpression")(__v.asInstanceOf[js.Any]))
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      DomainNameConfigurations.foreach(__v => __obj.updateDynamic("DomainNameConfigurations")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDomainNameResponse]
    }
  }

  /**
    * Creates a new Integration resource to represent an integration.
    */
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
    var PayloadFormatVersion: js.UndefOr[StringWithLengthBetween1And64]
    var RequestParameters: js.UndefOr[IntegrationParameters]
    var RequestTemplates: js.UndefOr[TemplateMap]
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression]
    var TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And30000]
    var TlsConfig: js.UndefOr[TlsConfigInput]
  }

  object CreateIntegrationRequest {
    @inline
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
        PayloadFormatVersion: js.UndefOr[StringWithLengthBetween1And64] = js.undefined,
        RequestParameters: js.UndefOr[IntegrationParameters] = js.undefined,
        RequestTemplates: js.UndefOr[TemplateMap] = js.undefined,
        TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And30000] = js.undefined,
        TlsConfig: js.UndefOr[TlsConfigInput] = js.undefined
    ): CreateIntegrationRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "IntegrationType" -> IntegrationType.asInstanceOf[js.Any]
      )

      ConnectionId.foreach(__v => __obj.updateDynamic("ConnectionId")(__v.asInstanceOf[js.Any]))
      ConnectionType.foreach(__v => __obj.updateDynamic("ConnectionType")(__v.asInstanceOf[js.Any]))
      ContentHandlingStrategy.foreach(__v => __obj.updateDynamic("ContentHandlingStrategy")(__v.asInstanceOf[js.Any]))
      CredentialsArn.foreach(__v => __obj.updateDynamic("CredentialsArn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      IntegrationMethod.foreach(__v => __obj.updateDynamic("IntegrationMethod")(__v.asInstanceOf[js.Any]))
      IntegrationUri.foreach(__v => __obj.updateDynamic("IntegrationUri")(__v.asInstanceOf[js.Any]))
      PassthroughBehavior.foreach(__v => __obj.updateDynamic("PassthroughBehavior")(__v.asInstanceOf[js.Any]))
      PayloadFormatVersion.foreach(__v => __obj.updateDynamic("PayloadFormatVersion")(__v.asInstanceOf[js.Any]))
      RequestParameters.foreach(__v => __obj.updateDynamic("RequestParameters")(__v.asInstanceOf[js.Any]))
      RequestTemplates.foreach(__v => __obj.updateDynamic("RequestTemplates")(__v.asInstanceOf[js.Any]))
      TemplateSelectionExpression.foreach(__v => __obj.updateDynamic("TemplateSelectionExpression")(__v.asInstanceOf[js.Any]))
      TimeoutInMillis.foreach(__v => __obj.updateDynamic("TimeoutInMillis")(__v.asInstanceOf[js.Any]))
      TlsConfig.foreach(__v => __obj.updateDynamic("TlsConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateIntegrationRequest]
    }
  }

  /**
    * Creates a new IntegrationResponse resource to represent an integration response.
    */
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
    @inline
    def apply(
        ApiId: __string,
        IntegrationId: __string,
        IntegrationResponseKey: SelectionKey,
        ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy] = js.undefined,
        ResponseParameters: js.UndefOr[IntegrationParameters] = js.undefined,
        ResponseTemplates: js.UndefOr[TemplateMap] = js.undefined,
        TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    ): CreateIntegrationResponseRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "IntegrationId" -> IntegrationId.asInstanceOf[js.Any],
        "IntegrationResponseKey" -> IntegrationResponseKey.asInstanceOf[js.Any]
      )

      ContentHandlingStrategy.foreach(__v => __obj.updateDynamic("ContentHandlingStrategy")(__v.asInstanceOf[js.Any]))
      ResponseParameters.foreach(__v => __obj.updateDynamic("ResponseParameters")(__v.asInstanceOf[js.Any]))
      ResponseTemplates.foreach(__v => __obj.updateDynamic("ResponseTemplates")(__v.asInstanceOf[js.Any]))
      TemplateSelectionExpression.foreach(__v => __obj.updateDynamic("TemplateSelectionExpression")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy] = js.undefined,
        IntegrationResponseId: js.UndefOr[Id] = js.undefined,
        IntegrationResponseKey: js.UndefOr[SelectionKey] = js.undefined,
        ResponseParameters: js.UndefOr[IntegrationParameters] = js.undefined,
        ResponseTemplates: js.UndefOr[TemplateMap] = js.undefined,
        TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    ): CreateIntegrationResponseResponse = {
      val __obj = js.Dynamic.literal()
      ContentHandlingStrategy.foreach(__v => __obj.updateDynamic("ContentHandlingStrategy")(__v.asInstanceOf[js.Any]))
      IntegrationResponseId.foreach(__v => __obj.updateDynamic("IntegrationResponseId")(__v.asInstanceOf[js.Any]))
      IntegrationResponseKey.foreach(__v => __obj.updateDynamic("IntegrationResponseKey")(__v.asInstanceOf[js.Any]))
      ResponseParameters.foreach(__v => __obj.updateDynamic("ResponseParameters")(__v.asInstanceOf[js.Any]))
      ResponseTemplates.foreach(__v => __obj.updateDynamic("ResponseTemplates")(__v.asInstanceOf[js.Any]))
      TemplateSelectionExpression.foreach(__v => __obj.updateDynamic("TemplateSelectionExpression")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateIntegrationResponseResponse]
    }
  }

  @js.native
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
    var TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And30000]
    var TlsConfig: js.UndefOr[TlsConfig]
  }

  object CreateIntegrationResult {
    @inline
    def apply(
        ApiGatewayManaged: js.UndefOr[__boolean] = js.undefined,
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
        PayloadFormatVersion: js.UndefOr[StringWithLengthBetween1And64] = js.undefined,
        RequestParameters: js.UndefOr[IntegrationParameters] = js.undefined,
        RequestTemplates: js.UndefOr[TemplateMap] = js.undefined,
        TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And30000] = js.undefined,
        TlsConfig: js.UndefOr[TlsConfig] = js.undefined
    ): CreateIntegrationResult = {
      val __obj = js.Dynamic.literal()
      ApiGatewayManaged.foreach(__v => __obj.updateDynamic("ApiGatewayManaged")(__v.asInstanceOf[js.Any]))
      ConnectionId.foreach(__v => __obj.updateDynamic("ConnectionId")(__v.asInstanceOf[js.Any]))
      ConnectionType.foreach(__v => __obj.updateDynamic("ConnectionType")(__v.asInstanceOf[js.Any]))
      ContentHandlingStrategy.foreach(__v => __obj.updateDynamic("ContentHandlingStrategy")(__v.asInstanceOf[js.Any]))
      CredentialsArn.foreach(__v => __obj.updateDynamic("CredentialsArn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      IntegrationId.foreach(__v => __obj.updateDynamic("IntegrationId")(__v.asInstanceOf[js.Any]))
      IntegrationMethod.foreach(__v => __obj.updateDynamic("IntegrationMethod")(__v.asInstanceOf[js.Any]))
      IntegrationResponseSelectionExpression.foreach(__v => __obj.updateDynamic("IntegrationResponseSelectionExpression")(__v.asInstanceOf[js.Any]))
      IntegrationType.foreach(__v => __obj.updateDynamic("IntegrationType")(__v.asInstanceOf[js.Any]))
      IntegrationUri.foreach(__v => __obj.updateDynamic("IntegrationUri")(__v.asInstanceOf[js.Any]))
      PassthroughBehavior.foreach(__v => __obj.updateDynamic("PassthroughBehavior")(__v.asInstanceOf[js.Any]))
      PayloadFormatVersion.foreach(__v => __obj.updateDynamic("PayloadFormatVersion")(__v.asInstanceOf[js.Any]))
      RequestParameters.foreach(__v => __obj.updateDynamic("RequestParameters")(__v.asInstanceOf[js.Any]))
      RequestTemplates.foreach(__v => __obj.updateDynamic("RequestTemplates")(__v.asInstanceOf[js.Any]))
      TemplateSelectionExpression.foreach(__v => __obj.updateDynamic("TemplateSelectionExpression")(__v.asInstanceOf[js.Any]))
      TimeoutInMillis.foreach(__v => __obj.updateDynamic("TimeoutInMillis")(__v.asInstanceOf[js.Any]))
      TlsConfig.foreach(__v => __obj.updateDynamic("TlsConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateIntegrationResult]
    }
  }

  /**
    * Creates a new Model.
    */
  @js.native
  trait CreateModelRequest extends js.Object {
    var ApiId: __string
    var Name: StringWithLengthBetween1And128
    var Schema: StringWithLengthBetween0And32K
    var ContentType: js.UndefOr[StringWithLengthBetween1And256]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
  }

  object CreateModelRequest {
    @inline
    def apply(
        ApiId: __string,
        Name: StringWithLengthBetween1And128,
        Schema: StringWithLengthBetween0And32K,
        ContentType: js.UndefOr[StringWithLengthBetween1And256] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    ): CreateModelRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "Schema" -> Schema.asInstanceOf[js.Any]
      )

      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ContentType: js.UndefOr[StringWithLengthBetween1And256] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        ModelId: js.UndefOr[Id] = js.undefined,
        Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined,
        Schema: js.UndefOr[StringWithLengthBetween0And32K] = js.undefined
    ): CreateModelResponse = {
      val __obj = js.Dynamic.literal()
      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ModelId.foreach(__v => __obj.updateDynamic("ModelId")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Schema.foreach(__v => __obj.updateDynamic("Schema")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateModelResponse]
    }
  }

  /**
    * Creates a new Route resource to represent a route.
    */
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
    @inline
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
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "RouteKey" -> RouteKey.asInstanceOf[js.Any]
      )

      ApiKeyRequired.foreach(__v => __obj.updateDynamic("ApiKeyRequired")(__v.asInstanceOf[js.Any]))
      AuthorizationScopes.foreach(__v => __obj.updateDynamic("AuthorizationScopes")(__v.asInstanceOf[js.Any]))
      AuthorizationType.foreach(__v => __obj.updateDynamic("AuthorizationType")(__v.asInstanceOf[js.Any]))
      AuthorizerId.foreach(__v => __obj.updateDynamic("AuthorizerId")(__v.asInstanceOf[js.Any]))
      ModelSelectionExpression.foreach(__v => __obj.updateDynamic("ModelSelectionExpression")(__v.asInstanceOf[js.Any]))
      OperationName.foreach(__v => __obj.updateDynamic("OperationName")(__v.asInstanceOf[js.Any]))
      RequestModels.foreach(__v => __obj.updateDynamic("RequestModels")(__v.asInstanceOf[js.Any]))
      RequestParameters.foreach(__v => __obj.updateDynamic("RequestParameters")(__v.asInstanceOf[js.Any]))
      RouteResponseSelectionExpression.foreach(__v => __obj.updateDynamic("RouteResponseSelectionExpression")(__v.asInstanceOf[js.Any]))
      Target.foreach(__v => __obj.updateDynamic("Target")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRouteRequest]
    }
  }

  /**
    * Creates a new RouteResponse resource to represent a route response.
    */
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
    @inline
    def apply(
        ApiId: __string,
        RouteId: __string,
        RouteResponseKey: SelectionKey,
        ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        ResponseModels: js.UndefOr[RouteModels] = js.undefined,
        ResponseParameters: js.UndefOr[RouteParameters] = js.undefined
    ): CreateRouteResponseRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "RouteId" -> RouteId.asInstanceOf[js.Any],
        "RouteResponseKey" -> RouteResponseKey.asInstanceOf[js.Any]
      )

      ModelSelectionExpression.foreach(__v => __obj.updateDynamic("ModelSelectionExpression")(__v.asInstanceOf[js.Any]))
      ResponseModels.foreach(__v => __obj.updateDynamic("ResponseModels")(__v.asInstanceOf[js.Any]))
      ResponseParameters.foreach(__v => __obj.updateDynamic("ResponseParameters")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        ResponseModels: js.UndefOr[RouteModels] = js.undefined,
        ResponseParameters: js.UndefOr[RouteParameters] = js.undefined,
        RouteResponseId: js.UndefOr[Id] = js.undefined,
        RouteResponseKey: js.UndefOr[SelectionKey] = js.undefined
    ): CreateRouteResponseResponse = {
      val __obj = js.Dynamic.literal()
      ModelSelectionExpression.foreach(__v => __obj.updateDynamic("ModelSelectionExpression")(__v.asInstanceOf[js.Any]))
      ResponseModels.foreach(__v => __obj.updateDynamic("ResponseModels")(__v.asInstanceOf[js.Any]))
      ResponseParameters.foreach(__v => __obj.updateDynamic("ResponseParameters")(__v.asInstanceOf[js.Any]))
      RouteResponseId.foreach(__v => __obj.updateDynamic("RouteResponseId")(__v.asInstanceOf[js.Any]))
      RouteResponseKey.foreach(__v => __obj.updateDynamic("RouteResponseKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRouteResponseResponse]
    }
  }

  @js.native
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

  object CreateRouteResult {
    @inline
    def apply(
        ApiGatewayManaged: js.UndefOr[__boolean] = js.undefined,
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
    ): CreateRouteResult = {
      val __obj = js.Dynamic.literal()
      ApiGatewayManaged.foreach(__v => __obj.updateDynamic("ApiGatewayManaged")(__v.asInstanceOf[js.Any]))
      ApiKeyRequired.foreach(__v => __obj.updateDynamic("ApiKeyRequired")(__v.asInstanceOf[js.Any]))
      AuthorizationScopes.foreach(__v => __obj.updateDynamic("AuthorizationScopes")(__v.asInstanceOf[js.Any]))
      AuthorizationType.foreach(__v => __obj.updateDynamic("AuthorizationType")(__v.asInstanceOf[js.Any]))
      AuthorizerId.foreach(__v => __obj.updateDynamic("AuthorizerId")(__v.asInstanceOf[js.Any]))
      ModelSelectionExpression.foreach(__v => __obj.updateDynamic("ModelSelectionExpression")(__v.asInstanceOf[js.Any]))
      OperationName.foreach(__v => __obj.updateDynamic("OperationName")(__v.asInstanceOf[js.Any]))
      RequestModels.foreach(__v => __obj.updateDynamic("RequestModels")(__v.asInstanceOf[js.Any]))
      RequestParameters.foreach(__v => __obj.updateDynamic("RequestParameters")(__v.asInstanceOf[js.Any]))
      RouteId.foreach(__v => __obj.updateDynamic("RouteId")(__v.asInstanceOf[js.Any]))
      RouteKey.foreach(__v => __obj.updateDynamic("RouteKey")(__v.asInstanceOf[js.Any]))
      RouteResponseSelectionExpression.foreach(__v => __obj.updateDynamic("RouteResponseSelectionExpression")(__v.asInstanceOf[js.Any]))
      Target.foreach(__v => __obj.updateDynamic("Target")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRouteResult]
    }
  }

  /**
    * Creates a new Stage resource to represent a stage.
    */
  @js.native
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

  object CreateStageRequest {
    @inline
    def apply(
        ApiId: __string,
        StageName: StringWithLengthBetween1And128,
        AccessLogSettings: js.UndefOr[AccessLogSettings] = js.undefined,
        AutoDeploy: js.UndefOr[__boolean] = js.undefined,
        ClientCertificateId: js.UndefOr[Id] = js.undefined,
        DefaultRouteSettings: js.UndefOr[RouteSettings] = js.undefined,
        DeploymentId: js.UndefOr[Id] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        RouteSettings: js.UndefOr[RouteSettingsMap] = js.undefined,
        StageVariables: js.UndefOr[StageVariablesMap] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateStageRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "StageName" -> StageName.asInstanceOf[js.Any]
      )

      AccessLogSettings.foreach(__v => __obj.updateDynamic("AccessLogSettings")(__v.asInstanceOf[js.Any]))
      AutoDeploy.foreach(__v => __obj.updateDynamic("AutoDeploy")(__v.asInstanceOf[js.Any]))
      ClientCertificateId.foreach(__v => __obj.updateDynamic("ClientCertificateId")(__v.asInstanceOf[js.Any]))
      DefaultRouteSettings.foreach(__v => __obj.updateDynamic("DefaultRouteSettings")(__v.asInstanceOf[js.Any]))
      DeploymentId.foreach(__v => __obj.updateDynamic("DeploymentId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      RouteSettings.foreach(__v => __obj.updateDynamic("RouteSettings")(__v.asInstanceOf[js.Any]))
      StageVariables.foreach(__v => __obj.updateDynamic("StageVariables")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStageRequest]
    }
  }

  @js.native
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

  object CreateStageResponse {
    @inline
    def apply(
        AccessLogSettings: js.UndefOr[AccessLogSettings] = js.undefined,
        ApiGatewayManaged: js.UndefOr[__boolean] = js.undefined,
        AutoDeploy: js.UndefOr[__boolean] = js.undefined,
        ClientCertificateId: js.UndefOr[Id] = js.undefined,
        CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        DefaultRouteSettings: js.UndefOr[RouteSettings] = js.undefined,
        DeploymentId: js.UndefOr[Id] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        LastDeploymentStatusMessage: js.UndefOr[__string] = js.undefined,
        LastUpdatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        RouteSettings: js.UndefOr[RouteSettingsMap] = js.undefined,
        StageName: js.UndefOr[StringWithLengthBetween1And128] = js.undefined,
        StageVariables: js.UndefOr[StageVariablesMap] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateStageResponse = {
      val __obj = js.Dynamic.literal()
      AccessLogSettings.foreach(__v => __obj.updateDynamic("AccessLogSettings")(__v.asInstanceOf[js.Any]))
      ApiGatewayManaged.foreach(__v => __obj.updateDynamic("ApiGatewayManaged")(__v.asInstanceOf[js.Any]))
      AutoDeploy.foreach(__v => __obj.updateDynamic("AutoDeploy")(__v.asInstanceOf[js.Any]))
      ClientCertificateId.foreach(__v => __obj.updateDynamic("ClientCertificateId")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      DefaultRouteSettings.foreach(__v => __obj.updateDynamic("DefaultRouteSettings")(__v.asInstanceOf[js.Any]))
      DeploymentId.foreach(__v => __obj.updateDynamic("DeploymentId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastDeploymentStatusMessage.foreach(__v => __obj.updateDynamic("LastDeploymentStatusMessage")(__v.asInstanceOf[js.Any]))
      LastUpdatedDate.foreach(__v => __obj.updateDynamic("LastUpdatedDate")(__v.asInstanceOf[js.Any]))
      RouteSettings.foreach(__v => __obj.updateDynamic("RouteSettings")(__v.asInstanceOf[js.Any]))
      StageName.foreach(__v => __obj.updateDynamic("StageName")(__v.asInstanceOf[js.Any]))
      StageVariables.foreach(__v => __obj.updateDynamic("StageVariables")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStageResponse]
    }
  }

  /**
    * Creates a VPC link
    */
  @js.native
  trait CreateVpcLinkRequest extends js.Object {
    var Name: StringWithLengthBetween1And128
    var SubnetIds: SubnetIdList
    var SecurityGroupIds: js.UndefOr[SecurityGroupIdList]
    var Tags: js.UndefOr[Tags]
  }

  object CreateVpcLinkRequest {
    @inline
    def apply(
        Name: StringWithLengthBetween1And128,
        SubnetIds: SubnetIdList,
        SecurityGroupIds: js.UndefOr[SecurityGroupIdList] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): CreateVpcLinkRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "SubnetIds" -> SubnetIds.asInstanceOf[js.Any]
      )

      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVpcLinkRequest]
    }
  }

  @js.native
  trait CreateVpcLinkResponse extends js.Object {
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var Name: js.UndefOr[StringWithLengthBetween1And128]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIdList]
    var SubnetIds: js.UndefOr[SubnetIdList]
    var Tags: js.UndefOr[Tags]
    var VpcLinkId: js.UndefOr[Id]
    var VpcLinkStatus: js.UndefOr[VpcLinkStatus]
    var VpcLinkStatusMessage: js.UndefOr[StringWithLengthBetween0And1024]
    var VpcLinkVersion: js.UndefOr[VpcLinkVersion]
  }

  object CreateVpcLinkResponse {
    @inline
    def apply(
        CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined,
        SecurityGroupIds: js.UndefOr[SecurityGroupIdList] = js.undefined,
        SubnetIds: js.UndefOr[SubnetIdList] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        VpcLinkId: js.UndefOr[Id] = js.undefined,
        VpcLinkStatus: js.UndefOr[VpcLinkStatus] = js.undefined,
        VpcLinkStatusMessage: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        VpcLinkVersion: js.UndefOr[VpcLinkVersion] = js.undefined
    ): CreateVpcLinkResponse = {
      val __obj = js.Dynamic.literal()
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.updateDynamic("SubnetIds")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VpcLinkId.foreach(__v => __obj.updateDynamic("VpcLinkId")(__v.asInstanceOf[js.Any]))
      VpcLinkStatus.foreach(__v => __obj.updateDynamic("VpcLinkStatus")(__v.asInstanceOf[js.Any]))
      VpcLinkStatusMessage.foreach(__v => __obj.updateDynamic("VpcLinkStatusMessage")(__v.asInstanceOf[js.Any]))
      VpcLinkVersion.foreach(__v => __obj.updateDynamic("VpcLinkVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVpcLinkResponse]
    }
  }

  @js.native
  trait DeleteAccessLogSettingsRequest extends js.Object {
    var ApiId: __string
    var StageName: __string
  }

  object DeleteAccessLogSettingsRequest {
    @inline
    def apply(
        ApiId: __string,
        StageName: __string
    ): DeleteAccessLogSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "StageName" -> StageName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteAccessLogSettingsRequest]
    }
  }

  @js.native
  trait DeleteApiMappingRequest extends js.Object {
    var ApiMappingId: __string
    var DomainName: __string
  }

  object DeleteApiMappingRequest {
    @inline
    def apply(
        ApiMappingId: __string,
        DomainName: __string
    ): DeleteApiMappingRequest = {
      val __obj = js.Dynamic.literal(
        "ApiMappingId" -> ApiMappingId.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteApiMappingRequest]
    }
  }

  @js.native
  trait DeleteApiRequest extends js.Object {
    var ApiId: __string
  }

  object DeleteApiRequest {
    @inline
    def apply(
        ApiId: __string
    ): DeleteApiRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApiId: __string,
        AuthorizerId: __string
    ): DeleteAuthorizerRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "AuthorizerId" -> AuthorizerId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteAuthorizerRequest]
    }
  }

  @js.native
  trait DeleteCorsConfigurationRequest extends js.Object {
    var ApiId: __string
  }

  object DeleteCorsConfigurationRequest {
    @inline
    def apply(
        ApiId: __string
    ): DeleteCorsConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteCorsConfigurationRequest]
    }
  }

  @js.native
  trait DeleteDeploymentRequest extends js.Object {
    var ApiId: __string
    var DeploymentId: __string
  }

  object DeleteDeploymentRequest {
    @inline
    def apply(
        ApiId: __string,
        DeploymentId: __string
    ): DeleteDeploymentRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
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
    @inline
    def apply(
        DomainName: __string
    ): DeleteDomainNameRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApiId: __string,
        IntegrationId: __string
    ): DeleteIntegrationRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
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
    @inline
    def apply(
        ApiId: __string,
        IntegrationId: __string,
        IntegrationResponseId: __string
    ): DeleteIntegrationResponseRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "IntegrationId" -> IntegrationId.asInstanceOf[js.Any],
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
    @inline
    def apply(
        ApiId: __string,
        ModelId: __string
    ): DeleteModelRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
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
    @inline
    def apply(
        ApiId: __string,
        RouteId: __string
    ): DeleteRouteRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "RouteId" -> RouteId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteRouteRequest]
    }
  }

  @js.native
  trait DeleteRouteRequestParameterRequest extends js.Object {
    var ApiId: __string
    var RequestParameterKey: __string
    var RouteId: __string
  }

  object DeleteRouteRequestParameterRequest {
    @inline
    def apply(
        ApiId: __string,
        RequestParameterKey: __string,
        RouteId: __string
    ): DeleteRouteRequestParameterRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "RequestParameterKey" -> RequestParameterKey.asInstanceOf[js.Any],
        "RouteId" -> RouteId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteRouteRequestParameterRequest]
    }
  }

  @js.native
  trait DeleteRouteResponseRequest extends js.Object {
    var ApiId: __string
    var RouteId: __string
    var RouteResponseId: __string
  }

  object DeleteRouteResponseRequest {
    @inline
    def apply(
        ApiId: __string,
        RouteId: __string,
        RouteResponseId: __string
    ): DeleteRouteResponseRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "RouteId" -> RouteId.asInstanceOf[js.Any],
        "RouteResponseId" -> RouteResponseId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteRouteResponseRequest]
    }
  }

  @js.native
  trait DeleteRouteSettingsRequest extends js.Object {
    var ApiId: __string
    var RouteKey: __string
    var StageName: __string
  }

  object DeleteRouteSettingsRequest {
    @inline
    def apply(
        ApiId: __string,
        RouteKey: __string,
        StageName: __string
    ): DeleteRouteSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "RouteKey" -> RouteKey.asInstanceOf[js.Any],
        "StageName" -> StageName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteRouteSettingsRequest]
    }
  }

  @js.native
  trait DeleteStageRequest extends js.Object {
    var ApiId: __string
    var StageName: __string
  }

  object DeleteStageRequest {
    @inline
    def apply(
        ApiId: __string,
        StageName: __string
    ): DeleteStageRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "StageName" -> StageName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteStageRequest]
    }
  }

  @js.native
  trait DeleteVpcLinkRequest extends js.Object {
    var VpcLinkId: __string
  }

  object DeleteVpcLinkRequest {
    @inline
    def apply(
        VpcLinkId: __string
    ): DeleteVpcLinkRequest = {
      val __obj = js.Dynamic.literal(
        "VpcLinkId" -> VpcLinkId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteVpcLinkRequest]
    }
  }

  @js.native
  trait DeleteVpcLinkResponse extends js.Object {}

  object DeleteVpcLinkResponse {
    @inline
    def apply(
    ): DeleteVpcLinkResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteVpcLinkResponse]
    }
  }

  /**
    * An immutable representation of an API that can be called by users. A Deployment must be associated with a Stage for it to be callable over the internet.
    */
  @js.native
  trait Deployment extends js.Object {
    var AutoDeployed: js.UndefOr[__boolean]
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var DeploymentId: js.UndefOr[Id]
    var DeploymentStatus: js.UndefOr[DeploymentStatus]
    var DeploymentStatusMessage: js.UndefOr[__string]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
  }

  object Deployment {
    @inline
    def apply(
        AutoDeployed: js.UndefOr[__boolean] = js.undefined,
        CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        DeploymentId: js.UndefOr[Id] = js.undefined,
        DeploymentStatus: js.UndefOr[DeploymentStatus] = js.undefined,
        DeploymentStatusMessage: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    ): Deployment = {
      val __obj = js.Dynamic.literal()
      AutoDeployed.foreach(__v => __obj.updateDynamic("AutoDeployed")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      DeploymentId.foreach(__v => __obj.updateDynamic("DeploymentId")(__v.asInstanceOf[js.Any]))
      DeploymentStatus.foreach(__v => __obj.updateDynamic("DeploymentStatus")(__v.asInstanceOf[js.Any]))
      DeploymentStatusMessage.foreach(__v => __obj.updateDynamic("DeploymentStatusMessage")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Deployment]
    }
  }

  /**
    * Represents a deployment status.
    */
  @js.native
  sealed trait DeploymentStatus extends js.Any
  object DeploymentStatus {
    val PENDING = "PENDING".asInstanceOf[DeploymentStatus]
    val FAILED = "FAILED".asInstanceOf[DeploymentStatus]
    val DEPLOYED = "DEPLOYED".asInstanceOf[DeploymentStatus]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(PENDING, FAILED, DEPLOYED))
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
    @inline
    def apply(
        DomainName: StringWithLengthBetween1And512,
        ApiMappingSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        DomainNameConfigurations: js.UndefOr[DomainNameConfigurations] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): DomainName = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      ApiMappingSelectionExpression.foreach(__v => __obj.updateDynamic("ApiMappingSelectionExpression")(__v.asInstanceOf[js.Any]))
      DomainNameConfigurations.foreach(__v => __obj.updateDynamic("DomainNameConfigurations")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
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
    @inline
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
      val __obj = js.Dynamic.literal()
      ApiGatewayDomainName.foreach(__v => __obj.updateDynamic("ApiGatewayDomainName")(__v.asInstanceOf[js.Any]))
      CertificateArn.foreach(__v => __obj.updateDynamic("CertificateArn")(__v.asInstanceOf[js.Any]))
      CertificateName.foreach(__v => __obj.updateDynamic("CertificateName")(__v.asInstanceOf[js.Any]))
      CertificateUploadDate.foreach(__v => __obj.updateDynamic("CertificateUploadDate")(__v.asInstanceOf[js.Any]))
      DomainNameStatus.foreach(__v => __obj.updateDynamic("DomainNameStatus")(__v.asInstanceOf[js.Any]))
      DomainNameStatusMessage.foreach(__v => __obj.updateDynamic("DomainNameStatusMessage")(__v.asInstanceOf[js.Any]))
      EndpointType.foreach(__v => __obj.updateDynamic("EndpointType")(__v.asInstanceOf[js.Any]))
      HostedZoneId.foreach(__v => __obj.updateDynamic("HostedZoneId")(__v.asInstanceOf[js.Any]))
      SecurityPolicy.foreach(__v => __obj.updateDynamic("SecurityPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainNameConfiguration]
    }
  }

  /**
    * The status of the domain name migration. The valid values are AVAILABLE and UPDATING. If the status is UPDATING, the domain cannot be modified further until the existing operation is complete. If it is AVAILABLE, the domain can be updated.
    */
  @js.native
  sealed trait DomainNameStatus extends js.Any
  object DomainNameStatus {
    val AVAILABLE = "AVAILABLE".asInstanceOf[DomainNameStatus]
    val UPDATING = "UPDATING".asInstanceOf[DomainNameStatus]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(AVAILABLE, UPDATING))
  }

  /**
    * Represents an endpoint type.
    */
  @js.native
  sealed trait EndpointType extends js.Any
  object EndpointType {
    val REGIONAL = "REGIONAL".asInstanceOf[EndpointType]
    val EDGE = "EDGE".asInstanceOf[EndpointType]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(REGIONAL, EDGE))
  }

  @js.native
  trait ExportApiRequest extends js.Object {
    var ApiId: __string
    var OutputType: __string
    var Specification: __string
    var ExportVersion: js.UndefOr[__string]
    var IncludeExtensions: js.UndefOr[__boolean]
    var StageName: js.UndefOr[__string]
  }

  object ExportApiRequest {
    @inline
    def apply(
        ApiId: __string,
        OutputType: __string,
        Specification: __string,
        ExportVersion: js.UndefOr[__string] = js.undefined,
        IncludeExtensions: js.UndefOr[__boolean] = js.undefined,
        StageName: js.UndefOr[__string] = js.undefined
    ): ExportApiRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "OutputType" -> OutputType.asInstanceOf[js.Any],
        "Specification" -> Specification.asInstanceOf[js.Any]
      )

      ExportVersion.foreach(__v => __obj.updateDynamic("ExportVersion")(__v.asInstanceOf[js.Any]))
      IncludeExtensions.foreach(__v => __obj.updateDynamic("IncludeExtensions")(__v.asInstanceOf[js.Any]))
      StageName.foreach(__v => __obj.updateDynamic("StageName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportApiRequest]
    }
  }

  @js.native
  trait ExportApiResponse extends js.Object {
    var body: js.UndefOr[ExportedApi]
  }

  object ExportApiResponse {
    @inline
    def apply(
        body: js.UndefOr[ExportedApi] = js.undefined
    ): ExportApiResponse = {
      val __obj = js.Dynamic.literal()
      body.foreach(__v => __obj.updateDynamic("body")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportApiResponse]
    }
  }

  @js.native
  trait GetApiMappingRequest extends js.Object {
    var ApiMappingId: __string
    var DomainName: __string
  }

  object GetApiMappingRequest {
    @inline
    def apply(
        ApiMappingId: __string,
        DomainName: __string
    ): GetApiMappingRequest = {
      val __obj = js.Dynamic.literal(
        "ApiMappingId" -> ApiMappingId.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any]
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
    @inline
    def apply(
        ApiId: js.UndefOr[Id] = js.undefined,
        ApiMappingId: js.UndefOr[Id] = js.undefined,
        ApiMappingKey: js.UndefOr[SelectionKey] = js.undefined,
        Stage: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    ): GetApiMappingResponse = {
      val __obj = js.Dynamic.literal()
      ApiId.foreach(__v => __obj.updateDynamic("ApiId")(__v.asInstanceOf[js.Any]))
      ApiMappingId.foreach(__v => __obj.updateDynamic("ApiMappingId")(__v.asInstanceOf[js.Any]))
      ApiMappingKey.foreach(__v => __obj.updateDynamic("ApiMappingKey")(__v.asInstanceOf[js.Any]))
      Stage.foreach(__v => __obj.updateDynamic("Stage")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        DomainName: __string,
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): GetApiMappingsRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetApiMappingsRequest]
    }
  }

  @js.native
  trait GetApiMappingsResponse extends js.Object {
    var Items: js.UndefOr[__listOfApiMapping]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetApiMappingsResponse {
    @inline
    def apply(
        Items: js.UndefOr[__listOfApiMapping] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetApiMappingsResponse = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetApiMappingsResponse]
    }
  }

  @js.native
  trait GetApiRequest extends js.Object {
    var ApiId: __string
  }

  object GetApiRequest {
    @inline
    def apply(
        ApiId: __string
    ): GetApiRequest = {
      val __obj = js.Dynamic.literal(
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

  object GetApiResponse {
    @inline
    def apply(
        ApiEndpoint: js.UndefOr[__string] = js.undefined,
        ApiId: js.UndefOr[Id] = js.undefined,
        ApiKeySelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        CorsConfiguration: js.UndefOr[Cors] = js.undefined,
        CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        DisableSchemaValidation: js.UndefOr[__boolean] = js.undefined,
        ImportInfo: js.UndefOr[__listOf__string] = js.undefined,
        Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined,
        ProtocolType: js.UndefOr[ProtocolType] = js.undefined,
        RouteSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        Version: js.UndefOr[StringWithLengthBetween1And64] = js.undefined,
        Warnings: js.UndefOr[__listOf__string] = js.undefined
    ): GetApiResponse = {
      val __obj = js.Dynamic.literal()
      ApiEndpoint.foreach(__v => __obj.updateDynamic("ApiEndpoint")(__v.asInstanceOf[js.Any]))
      ApiId.foreach(__v => __obj.updateDynamic("ApiId")(__v.asInstanceOf[js.Any]))
      ApiKeySelectionExpression.foreach(__v => __obj.updateDynamic("ApiKeySelectionExpression")(__v.asInstanceOf[js.Any]))
      CorsConfiguration.foreach(__v => __obj.updateDynamic("CorsConfiguration")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisableSchemaValidation.foreach(__v => __obj.updateDynamic("DisableSchemaValidation")(__v.asInstanceOf[js.Any]))
      ImportInfo.foreach(__v => __obj.updateDynamic("ImportInfo")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ProtocolType.foreach(__v => __obj.updateDynamic("ProtocolType")(__v.asInstanceOf[js.Any]))
      RouteSelectionExpression.foreach(__v => __obj.updateDynamic("RouteSelectionExpression")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      Warnings.foreach(__v => __obj.updateDynamic("Warnings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetApiResponse]
    }
  }

  @js.native
  trait GetApisRequest extends js.Object {
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object GetApisRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): GetApisRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetApisRequest]
    }
  }

  @js.native
  trait GetApisResponse extends js.Object {
    var Items: js.UndefOr[__listOfApi]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetApisResponse {
    @inline
    def apply(
        Items: js.UndefOr[__listOfApi] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetApisResponse = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetApisResponse]
    }
  }

  @js.native
  trait GetAuthorizerRequest extends js.Object {
    var ApiId: __string
    var AuthorizerId: __string
  }

  object GetAuthorizerRequest {
    @inline
    def apply(
        ApiId: __string,
        AuthorizerId: __string
    ): GetAuthorizerRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
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
    var JwtConfiguration: js.UndefOr[JWTConfiguration]
    var Name: js.UndefOr[StringWithLengthBetween1And128]
  }

  object GetAuthorizerResponse {
    @inline
    def apply(
        AuthorizerCredentialsArn: js.UndefOr[Arn] = js.undefined,
        AuthorizerId: js.UndefOr[Id] = js.undefined,
        AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600] = js.undefined,
        AuthorizerType: js.UndefOr[AuthorizerType] = js.undefined,
        AuthorizerUri: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined,
        IdentitySource: js.UndefOr[IdentitySourceList] = js.undefined,
        IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        JwtConfiguration: js.UndefOr[JWTConfiguration] = js.undefined,
        Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    ): GetAuthorizerResponse = {
      val __obj = js.Dynamic.literal()
      AuthorizerCredentialsArn.foreach(__v => __obj.updateDynamic("AuthorizerCredentialsArn")(__v.asInstanceOf[js.Any]))
      AuthorizerId.foreach(__v => __obj.updateDynamic("AuthorizerId")(__v.asInstanceOf[js.Any]))
      AuthorizerResultTtlInSeconds.foreach(__v => __obj.updateDynamic("AuthorizerResultTtlInSeconds")(__v.asInstanceOf[js.Any]))
      AuthorizerType.foreach(__v => __obj.updateDynamic("AuthorizerType")(__v.asInstanceOf[js.Any]))
      AuthorizerUri.foreach(__v => __obj.updateDynamic("AuthorizerUri")(__v.asInstanceOf[js.Any]))
      IdentitySource.foreach(__v => __obj.updateDynamic("IdentitySource")(__v.asInstanceOf[js.Any]))
      IdentityValidationExpression.foreach(__v => __obj.updateDynamic("IdentityValidationExpression")(__v.asInstanceOf[js.Any]))
      JwtConfiguration.foreach(__v => __obj.updateDynamic("JwtConfiguration")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ApiId: __string,
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): GetAuthorizersRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAuthorizersRequest]
    }
  }

  @js.native
  trait GetAuthorizersResponse extends js.Object {
    var Items: js.UndefOr[__listOfAuthorizer]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetAuthorizersResponse {
    @inline
    def apply(
        Items: js.UndefOr[__listOfAuthorizer] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetAuthorizersResponse = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAuthorizersResponse]
    }
  }

  @js.native
  trait GetDeploymentRequest extends js.Object {
    var ApiId: __string
    var DeploymentId: __string
  }

  object GetDeploymentRequest {
    @inline
    def apply(
        ApiId: __string,
        DeploymentId: __string
    ): GetDeploymentRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "DeploymentId" -> DeploymentId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDeploymentRequest]
    }
  }

  @js.native
  trait GetDeploymentResponse extends js.Object {
    var AutoDeployed: js.UndefOr[__boolean]
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var DeploymentId: js.UndefOr[Id]
    var DeploymentStatus: js.UndefOr[DeploymentStatus]
    var DeploymentStatusMessage: js.UndefOr[__string]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
  }

  object GetDeploymentResponse {
    @inline
    def apply(
        AutoDeployed: js.UndefOr[__boolean] = js.undefined,
        CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        DeploymentId: js.UndefOr[Id] = js.undefined,
        DeploymentStatus: js.UndefOr[DeploymentStatus] = js.undefined,
        DeploymentStatusMessage: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    ): GetDeploymentResponse = {
      val __obj = js.Dynamic.literal()
      AutoDeployed.foreach(__v => __obj.updateDynamic("AutoDeployed")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      DeploymentId.foreach(__v => __obj.updateDynamic("DeploymentId")(__v.asInstanceOf[js.Any]))
      DeploymentStatus.foreach(__v => __obj.updateDynamic("DeploymentStatus")(__v.asInstanceOf[js.Any]))
      DeploymentStatusMessage.foreach(__v => __obj.updateDynamic("DeploymentStatusMessage")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ApiId: __string,
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): GetDeploymentsRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeploymentsRequest]
    }
  }

  @js.native
  trait GetDeploymentsResponse extends js.Object {
    var Items: js.UndefOr[__listOfDeployment]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetDeploymentsResponse {
    @inline
    def apply(
        Items: js.UndefOr[__listOfDeployment] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetDeploymentsResponse = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeploymentsResponse]
    }
  }

  @js.native
  trait GetDomainNameRequest extends js.Object {
    var DomainName: __string
  }

  object GetDomainNameRequest {
    @inline
    def apply(
        DomainName: __string
    ): GetDomainNameRequest = {
      val __obj = js.Dynamic.literal(
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
    @inline
    def apply(
        ApiMappingSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        DomainName: js.UndefOr[StringWithLengthBetween1And512] = js.undefined,
        DomainNameConfigurations: js.UndefOr[DomainNameConfigurations] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): GetDomainNameResponse = {
      val __obj = js.Dynamic.literal()
      ApiMappingSelectionExpression.foreach(__v => __obj.updateDynamic("ApiMappingSelectionExpression")(__v.asInstanceOf[js.Any]))
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      DomainNameConfigurations.foreach(__v => __obj.updateDynamic("DomainNameConfigurations")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDomainNameResponse]
    }
  }

  @js.native
  trait GetDomainNamesRequest extends js.Object {
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object GetDomainNamesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): GetDomainNamesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDomainNamesRequest]
    }
  }

  @js.native
  trait GetDomainNamesResponse extends js.Object {
    var Items: js.UndefOr[__listOfDomainName]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetDomainNamesResponse {
    @inline
    def apply(
        Items: js.UndefOr[__listOfDomainName] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetDomainNamesResponse = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDomainNamesResponse]
    }
  }

  @js.native
  trait GetIntegrationRequest extends js.Object {
    var ApiId: __string
    var IntegrationId: __string
  }

  object GetIntegrationRequest {
    @inline
    def apply(
        ApiId: __string,
        IntegrationId: __string
    ): GetIntegrationRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "IntegrationId" -> IntegrationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetIntegrationRequest]
    }
  }

  @js.native
  trait GetIntegrationResponseRequest extends js.Object {
    var ApiId: __string
    var IntegrationId: __string
    var IntegrationResponseId: __string
  }

  object GetIntegrationResponseRequest {
    @inline
    def apply(
        ApiId: __string,
        IntegrationId: __string,
        IntegrationResponseId: __string
    ): GetIntegrationResponseRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "IntegrationId" -> IntegrationId.asInstanceOf[js.Any],
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
    @inline
    def apply(
        ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy] = js.undefined,
        IntegrationResponseId: js.UndefOr[Id] = js.undefined,
        IntegrationResponseKey: js.UndefOr[SelectionKey] = js.undefined,
        ResponseParameters: js.UndefOr[IntegrationParameters] = js.undefined,
        ResponseTemplates: js.UndefOr[TemplateMap] = js.undefined,
        TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    ): GetIntegrationResponseResponse = {
      val __obj = js.Dynamic.literal()
      ContentHandlingStrategy.foreach(__v => __obj.updateDynamic("ContentHandlingStrategy")(__v.asInstanceOf[js.Any]))
      IntegrationResponseId.foreach(__v => __obj.updateDynamic("IntegrationResponseId")(__v.asInstanceOf[js.Any]))
      IntegrationResponseKey.foreach(__v => __obj.updateDynamic("IntegrationResponseKey")(__v.asInstanceOf[js.Any]))
      ResponseParameters.foreach(__v => __obj.updateDynamic("ResponseParameters")(__v.asInstanceOf[js.Any]))
      ResponseTemplates.foreach(__v => __obj.updateDynamic("ResponseTemplates")(__v.asInstanceOf[js.Any]))
      TemplateSelectionExpression.foreach(__v => __obj.updateDynamic("TemplateSelectionExpression")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ApiId: __string,
        IntegrationId: __string,
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): GetIntegrationResponsesRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "IntegrationId" -> IntegrationId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetIntegrationResponsesRequest]
    }
  }

  @js.native
  trait GetIntegrationResponsesResponse extends js.Object {
    var Items: js.UndefOr[__listOfIntegrationResponse]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetIntegrationResponsesResponse {
    @inline
    def apply(
        Items: js.UndefOr[__listOfIntegrationResponse] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetIntegrationResponsesResponse = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetIntegrationResponsesResponse]
    }
  }

  @js.native
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
    var TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And30000]
    var TlsConfig: js.UndefOr[TlsConfig]
  }

  object GetIntegrationResult {
    @inline
    def apply(
        ApiGatewayManaged: js.UndefOr[__boolean] = js.undefined,
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
        PayloadFormatVersion: js.UndefOr[StringWithLengthBetween1And64] = js.undefined,
        RequestParameters: js.UndefOr[IntegrationParameters] = js.undefined,
        RequestTemplates: js.UndefOr[TemplateMap] = js.undefined,
        TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And30000] = js.undefined,
        TlsConfig: js.UndefOr[TlsConfig] = js.undefined
    ): GetIntegrationResult = {
      val __obj = js.Dynamic.literal()
      ApiGatewayManaged.foreach(__v => __obj.updateDynamic("ApiGatewayManaged")(__v.asInstanceOf[js.Any]))
      ConnectionId.foreach(__v => __obj.updateDynamic("ConnectionId")(__v.asInstanceOf[js.Any]))
      ConnectionType.foreach(__v => __obj.updateDynamic("ConnectionType")(__v.asInstanceOf[js.Any]))
      ContentHandlingStrategy.foreach(__v => __obj.updateDynamic("ContentHandlingStrategy")(__v.asInstanceOf[js.Any]))
      CredentialsArn.foreach(__v => __obj.updateDynamic("CredentialsArn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      IntegrationId.foreach(__v => __obj.updateDynamic("IntegrationId")(__v.asInstanceOf[js.Any]))
      IntegrationMethod.foreach(__v => __obj.updateDynamic("IntegrationMethod")(__v.asInstanceOf[js.Any]))
      IntegrationResponseSelectionExpression.foreach(__v => __obj.updateDynamic("IntegrationResponseSelectionExpression")(__v.asInstanceOf[js.Any]))
      IntegrationType.foreach(__v => __obj.updateDynamic("IntegrationType")(__v.asInstanceOf[js.Any]))
      IntegrationUri.foreach(__v => __obj.updateDynamic("IntegrationUri")(__v.asInstanceOf[js.Any]))
      PassthroughBehavior.foreach(__v => __obj.updateDynamic("PassthroughBehavior")(__v.asInstanceOf[js.Any]))
      PayloadFormatVersion.foreach(__v => __obj.updateDynamic("PayloadFormatVersion")(__v.asInstanceOf[js.Any]))
      RequestParameters.foreach(__v => __obj.updateDynamic("RequestParameters")(__v.asInstanceOf[js.Any]))
      RequestTemplates.foreach(__v => __obj.updateDynamic("RequestTemplates")(__v.asInstanceOf[js.Any]))
      TemplateSelectionExpression.foreach(__v => __obj.updateDynamic("TemplateSelectionExpression")(__v.asInstanceOf[js.Any]))
      TimeoutInMillis.foreach(__v => __obj.updateDynamic("TimeoutInMillis")(__v.asInstanceOf[js.Any]))
      TlsConfig.foreach(__v => __obj.updateDynamic("TlsConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetIntegrationResult]
    }
  }

  @js.native
  trait GetIntegrationsRequest extends js.Object {
    var ApiId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object GetIntegrationsRequest {
    @inline
    def apply(
        ApiId: __string,
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): GetIntegrationsRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetIntegrationsRequest]
    }
  }

  @js.native
  trait GetIntegrationsResponse extends js.Object {
    var Items: js.UndefOr[__listOfIntegration]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetIntegrationsResponse {
    @inline
    def apply(
        Items: js.UndefOr[__listOfIntegration] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetIntegrationsResponse = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetIntegrationsResponse]
    }
  }

  @js.native
  trait GetModelRequest extends js.Object {
    var ApiId: __string
    var ModelId: __string
  }

  object GetModelRequest {
    @inline
    def apply(
        ApiId: __string,
        ModelId: __string
    ): GetModelRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
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
    @inline
    def apply(
        ContentType: js.UndefOr[StringWithLengthBetween1And256] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        ModelId: js.UndefOr[Id] = js.undefined,
        Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined,
        Schema: js.UndefOr[StringWithLengthBetween0And32K] = js.undefined
    ): GetModelResponse = {
      val __obj = js.Dynamic.literal()
      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ModelId.foreach(__v => __obj.updateDynamic("ModelId")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Schema.foreach(__v => __obj.updateDynamic("Schema")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetModelResponse]
    }
  }

  @js.native
  trait GetModelTemplateRequest extends js.Object {
    var ApiId: __string
    var ModelId: __string
  }

  object GetModelTemplateRequest {
    @inline
    def apply(
        ApiId: __string,
        ModelId: __string
    ): GetModelTemplateRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
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
    @inline
    def apply(
        Value: js.UndefOr[__string] = js.undefined
    ): GetModelTemplateResponse = {
      val __obj = js.Dynamic.literal()
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ApiId: __string,
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): GetModelsRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetModelsRequest]
    }
  }

  @js.native
  trait GetModelsResponse extends js.Object {
    var Items: js.UndefOr[__listOfModel]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetModelsResponse {
    @inline
    def apply(
        Items: js.UndefOr[__listOfModel] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetModelsResponse = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetModelsResponse]
    }
  }

  @js.native
  trait GetRouteRequest extends js.Object {
    var ApiId: __string
    var RouteId: __string
  }

  object GetRouteRequest {
    @inline
    def apply(
        ApiId: __string,
        RouteId: __string
    ): GetRouteRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "RouteId" -> RouteId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetRouteRequest]
    }
  }

  @js.native
  trait GetRouteResponseRequest extends js.Object {
    var ApiId: __string
    var RouteId: __string
    var RouteResponseId: __string
  }

  object GetRouteResponseRequest {
    @inline
    def apply(
        ApiId: __string,
        RouteId: __string,
        RouteResponseId: __string
    ): GetRouteResponseRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "RouteId" -> RouteId.asInstanceOf[js.Any],
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
    @inline
    def apply(
        ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        ResponseModels: js.UndefOr[RouteModels] = js.undefined,
        ResponseParameters: js.UndefOr[RouteParameters] = js.undefined,
        RouteResponseId: js.UndefOr[Id] = js.undefined,
        RouteResponseKey: js.UndefOr[SelectionKey] = js.undefined
    ): GetRouteResponseResponse = {
      val __obj = js.Dynamic.literal()
      ModelSelectionExpression.foreach(__v => __obj.updateDynamic("ModelSelectionExpression")(__v.asInstanceOf[js.Any]))
      ResponseModels.foreach(__v => __obj.updateDynamic("ResponseModels")(__v.asInstanceOf[js.Any]))
      ResponseParameters.foreach(__v => __obj.updateDynamic("ResponseParameters")(__v.asInstanceOf[js.Any]))
      RouteResponseId.foreach(__v => __obj.updateDynamic("RouteResponseId")(__v.asInstanceOf[js.Any]))
      RouteResponseKey.foreach(__v => __obj.updateDynamic("RouteResponseKey")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ApiId: __string,
        RouteId: __string,
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): GetRouteResponsesRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "RouteId" -> RouteId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRouteResponsesRequest]
    }
  }

  @js.native
  trait GetRouteResponsesResponse extends js.Object {
    var Items: js.UndefOr[__listOfRouteResponse]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetRouteResponsesResponse {
    @inline
    def apply(
        Items: js.UndefOr[__listOfRouteResponse] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetRouteResponsesResponse = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRouteResponsesResponse]
    }
  }

  @js.native
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

  object GetRouteResult {
    @inline
    def apply(
        ApiGatewayManaged: js.UndefOr[__boolean] = js.undefined,
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
    ): GetRouteResult = {
      val __obj = js.Dynamic.literal()
      ApiGatewayManaged.foreach(__v => __obj.updateDynamic("ApiGatewayManaged")(__v.asInstanceOf[js.Any]))
      ApiKeyRequired.foreach(__v => __obj.updateDynamic("ApiKeyRequired")(__v.asInstanceOf[js.Any]))
      AuthorizationScopes.foreach(__v => __obj.updateDynamic("AuthorizationScopes")(__v.asInstanceOf[js.Any]))
      AuthorizationType.foreach(__v => __obj.updateDynamic("AuthorizationType")(__v.asInstanceOf[js.Any]))
      AuthorizerId.foreach(__v => __obj.updateDynamic("AuthorizerId")(__v.asInstanceOf[js.Any]))
      ModelSelectionExpression.foreach(__v => __obj.updateDynamic("ModelSelectionExpression")(__v.asInstanceOf[js.Any]))
      OperationName.foreach(__v => __obj.updateDynamic("OperationName")(__v.asInstanceOf[js.Any]))
      RequestModels.foreach(__v => __obj.updateDynamic("RequestModels")(__v.asInstanceOf[js.Any]))
      RequestParameters.foreach(__v => __obj.updateDynamic("RequestParameters")(__v.asInstanceOf[js.Any]))
      RouteId.foreach(__v => __obj.updateDynamic("RouteId")(__v.asInstanceOf[js.Any]))
      RouteKey.foreach(__v => __obj.updateDynamic("RouteKey")(__v.asInstanceOf[js.Any]))
      RouteResponseSelectionExpression.foreach(__v => __obj.updateDynamic("RouteResponseSelectionExpression")(__v.asInstanceOf[js.Any]))
      Target.foreach(__v => __obj.updateDynamic("Target")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRouteResult]
    }
  }

  @js.native
  trait GetRoutesRequest extends js.Object {
    var ApiId: __string
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object GetRoutesRequest {
    @inline
    def apply(
        ApiId: __string,
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): GetRoutesRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRoutesRequest]
    }
  }

  @js.native
  trait GetRoutesResponse extends js.Object {
    var Items: js.UndefOr[__listOfRoute]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetRoutesResponse {
    @inline
    def apply(
        Items: js.UndefOr[__listOfRoute] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetRoutesResponse = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRoutesResponse]
    }
  }

  @js.native
  trait GetStageRequest extends js.Object {
    var ApiId: __string
    var StageName: __string
  }

  object GetStageRequest {
    @inline
    def apply(
        ApiId: __string,
        StageName: __string
    ): GetStageRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "StageName" -> StageName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetStageRequest]
    }
  }

  @js.native
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

  object GetStageResponse {
    @inline
    def apply(
        AccessLogSettings: js.UndefOr[AccessLogSettings] = js.undefined,
        ApiGatewayManaged: js.UndefOr[__boolean] = js.undefined,
        AutoDeploy: js.UndefOr[__boolean] = js.undefined,
        ClientCertificateId: js.UndefOr[Id] = js.undefined,
        CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        DefaultRouteSettings: js.UndefOr[RouteSettings] = js.undefined,
        DeploymentId: js.UndefOr[Id] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        LastDeploymentStatusMessage: js.UndefOr[__string] = js.undefined,
        LastUpdatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        RouteSettings: js.UndefOr[RouteSettingsMap] = js.undefined,
        StageName: js.UndefOr[StringWithLengthBetween1And128] = js.undefined,
        StageVariables: js.UndefOr[StageVariablesMap] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): GetStageResponse = {
      val __obj = js.Dynamic.literal()
      AccessLogSettings.foreach(__v => __obj.updateDynamic("AccessLogSettings")(__v.asInstanceOf[js.Any]))
      ApiGatewayManaged.foreach(__v => __obj.updateDynamic("ApiGatewayManaged")(__v.asInstanceOf[js.Any]))
      AutoDeploy.foreach(__v => __obj.updateDynamic("AutoDeploy")(__v.asInstanceOf[js.Any]))
      ClientCertificateId.foreach(__v => __obj.updateDynamic("ClientCertificateId")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      DefaultRouteSettings.foreach(__v => __obj.updateDynamic("DefaultRouteSettings")(__v.asInstanceOf[js.Any]))
      DeploymentId.foreach(__v => __obj.updateDynamic("DeploymentId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastDeploymentStatusMessage.foreach(__v => __obj.updateDynamic("LastDeploymentStatusMessage")(__v.asInstanceOf[js.Any]))
      LastUpdatedDate.foreach(__v => __obj.updateDynamic("LastUpdatedDate")(__v.asInstanceOf[js.Any]))
      RouteSettings.foreach(__v => __obj.updateDynamic("RouteSettings")(__v.asInstanceOf[js.Any]))
      StageName.foreach(__v => __obj.updateDynamic("StageName")(__v.asInstanceOf[js.Any]))
      StageVariables.foreach(__v => __obj.updateDynamic("StageVariables")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ApiId: __string,
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): GetStagesRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetStagesRequest]
    }
  }

  @js.native
  trait GetStagesResponse extends js.Object {
    var Items: js.UndefOr[__listOfStage]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetStagesResponse {
    @inline
    def apply(
        Items: js.UndefOr[__listOfStage] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetStagesResponse = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetStagesResponse]
    }
  }

  @js.native
  trait GetTagsRequest extends js.Object {
    var ResourceArn: __string
  }

  object GetTagsRequest {
    @inline
    def apply(
        ResourceArn: __string
    ): GetTagsRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetTagsRequest]
    }
  }

  @js.native
  trait GetTagsResponse extends js.Object {
    var Tags: js.UndefOr[Tags]
  }

  object GetTagsResponse {
    @inline
    def apply(
        Tags: js.UndefOr[Tags] = js.undefined
    ): GetTagsResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTagsResponse]
    }
  }

  @js.native
  trait GetVpcLinkRequest extends js.Object {
    var VpcLinkId: __string
  }

  object GetVpcLinkRequest {
    @inline
    def apply(
        VpcLinkId: __string
    ): GetVpcLinkRequest = {
      val __obj = js.Dynamic.literal(
        "VpcLinkId" -> VpcLinkId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetVpcLinkRequest]
    }
  }

  @js.native
  trait GetVpcLinkResponse extends js.Object {
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var Name: js.UndefOr[StringWithLengthBetween1And128]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIdList]
    var SubnetIds: js.UndefOr[SubnetIdList]
    var Tags: js.UndefOr[Tags]
    var VpcLinkId: js.UndefOr[Id]
    var VpcLinkStatus: js.UndefOr[VpcLinkStatus]
    var VpcLinkStatusMessage: js.UndefOr[StringWithLengthBetween0And1024]
    var VpcLinkVersion: js.UndefOr[VpcLinkVersion]
  }

  object GetVpcLinkResponse {
    @inline
    def apply(
        CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined,
        SecurityGroupIds: js.UndefOr[SecurityGroupIdList] = js.undefined,
        SubnetIds: js.UndefOr[SubnetIdList] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        VpcLinkId: js.UndefOr[Id] = js.undefined,
        VpcLinkStatus: js.UndefOr[VpcLinkStatus] = js.undefined,
        VpcLinkStatusMessage: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        VpcLinkVersion: js.UndefOr[VpcLinkVersion] = js.undefined
    ): GetVpcLinkResponse = {
      val __obj = js.Dynamic.literal()
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.updateDynamic("SubnetIds")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VpcLinkId.foreach(__v => __obj.updateDynamic("VpcLinkId")(__v.asInstanceOf[js.Any]))
      VpcLinkStatus.foreach(__v => __obj.updateDynamic("VpcLinkStatus")(__v.asInstanceOf[js.Any]))
      VpcLinkStatusMessage.foreach(__v => __obj.updateDynamic("VpcLinkStatusMessage")(__v.asInstanceOf[js.Any]))
      VpcLinkVersion.foreach(__v => __obj.updateDynamic("VpcLinkVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVpcLinkResponse]
    }
  }

  @js.native
  trait GetVpcLinksRequest extends js.Object {
    var MaxResults: js.UndefOr[__string]
    var NextToken: js.UndefOr[__string]
  }

  object GetVpcLinksRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[__string] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): GetVpcLinksRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVpcLinksRequest]
    }
  }

  @js.native
  trait GetVpcLinksResponse extends js.Object {
    var Items: js.UndefOr[__listOfVpcLink]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetVpcLinksResponse {
    @inline
    def apply(
        Items: js.UndefOr[__listOfVpcLink] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetVpcLinksResponse = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVpcLinksResponse]
    }
  }

  /**
    */
  @js.native
  trait ImportApiRequest extends js.Object {
    var Body: __string
    var Basepath: js.UndefOr[__string]
    var FailOnWarnings: js.UndefOr[__boolean]
  }

  object ImportApiRequest {
    @inline
    def apply(
        Body: __string,
        Basepath: js.UndefOr[__string] = js.undefined,
        FailOnWarnings: js.UndefOr[__boolean] = js.undefined
    ): ImportApiRequest = {
      val __obj = js.Dynamic.literal(
        "Body" -> Body.asInstanceOf[js.Any]
      )

      Basepath.foreach(__v => __obj.updateDynamic("Basepath")(__v.asInstanceOf[js.Any]))
      FailOnWarnings.foreach(__v => __obj.updateDynamic("FailOnWarnings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportApiRequest]
    }
  }

  @js.native
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

  object ImportApiResponse {
    @inline
    def apply(
        ApiEndpoint: js.UndefOr[__string] = js.undefined,
        ApiId: js.UndefOr[Id] = js.undefined,
        ApiKeySelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        CorsConfiguration: js.UndefOr[Cors] = js.undefined,
        CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        DisableSchemaValidation: js.UndefOr[__boolean] = js.undefined,
        ImportInfo: js.UndefOr[__listOf__string] = js.undefined,
        Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined,
        ProtocolType: js.UndefOr[ProtocolType] = js.undefined,
        RouteSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        Version: js.UndefOr[StringWithLengthBetween1And64] = js.undefined,
        Warnings: js.UndefOr[__listOf__string] = js.undefined
    ): ImportApiResponse = {
      val __obj = js.Dynamic.literal()
      ApiEndpoint.foreach(__v => __obj.updateDynamic("ApiEndpoint")(__v.asInstanceOf[js.Any]))
      ApiId.foreach(__v => __obj.updateDynamic("ApiId")(__v.asInstanceOf[js.Any]))
      ApiKeySelectionExpression.foreach(__v => __obj.updateDynamic("ApiKeySelectionExpression")(__v.asInstanceOf[js.Any]))
      CorsConfiguration.foreach(__v => __obj.updateDynamic("CorsConfiguration")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisableSchemaValidation.foreach(__v => __obj.updateDynamic("DisableSchemaValidation")(__v.asInstanceOf[js.Any]))
      ImportInfo.foreach(__v => __obj.updateDynamic("ImportInfo")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ProtocolType.foreach(__v => __obj.updateDynamic("ProtocolType")(__v.asInstanceOf[js.Any]))
      RouteSelectionExpression.foreach(__v => __obj.updateDynamic("RouteSelectionExpression")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      Warnings.foreach(__v => __obj.updateDynamic("Warnings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportApiResponse]
    }
  }

  /**
    * Represents an integration.
    */
  @js.native
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
    var TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And30000]
    var TlsConfig: js.UndefOr[TlsConfig]
  }

  object Integration {
    @inline
    def apply(
        ApiGatewayManaged: js.UndefOr[__boolean] = js.undefined,
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
        PayloadFormatVersion: js.UndefOr[StringWithLengthBetween1And64] = js.undefined,
        RequestParameters: js.UndefOr[IntegrationParameters] = js.undefined,
        RequestTemplates: js.UndefOr[TemplateMap] = js.undefined,
        TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And30000] = js.undefined,
        TlsConfig: js.UndefOr[TlsConfig] = js.undefined
    ): Integration = {
      val __obj = js.Dynamic.literal()
      ApiGatewayManaged.foreach(__v => __obj.updateDynamic("ApiGatewayManaged")(__v.asInstanceOf[js.Any]))
      ConnectionId.foreach(__v => __obj.updateDynamic("ConnectionId")(__v.asInstanceOf[js.Any]))
      ConnectionType.foreach(__v => __obj.updateDynamic("ConnectionType")(__v.asInstanceOf[js.Any]))
      ContentHandlingStrategy.foreach(__v => __obj.updateDynamic("ContentHandlingStrategy")(__v.asInstanceOf[js.Any]))
      CredentialsArn.foreach(__v => __obj.updateDynamic("CredentialsArn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      IntegrationId.foreach(__v => __obj.updateDynamic("IntegrationId")(__v.asInstanceOf[js.Any]))
      IntegrationMethod.foreach(__v => __obj.updateDynamic("IntegrationMethod")(__v.asInstanceOf[js.Any]))
      IntegrationResponseSelectionExpression.foreach(__v => __obj.updateDynamic("IntegrationResponseSelectionExpression")(__v.asInstanceOf[js.Any]))
      IntegrationType.foreach(__v => __obj.updateDynamic("IntegrationType")(__v.asInstanceOf[js.Any]))
      IntegrationUri.foreach(__v => __obj.updateDynamic("IntegrationUri")(__v.asInstanceOf[js.Any]))
      PassthroughBehavior.foreach(__v => __obj.updateDynamic("PassthroughBehavior")(__v.asInstanceOf[js.Any]))
      PayloadFormatVersion.foreach(__v => __obj.updateDynamic("PayloadFormatVersion")(__v.asInstanceOf[js.Any]))
      RequestParameters.foreach(__v => __obj.updateDynamic("RequestParameters")(__v.asInstanceOf[js.Any]))
      RequestTemplates.foreach(__v => __obj.updateDynamic("RequestTemplates")(__v.asInstanceOf[js.Any]))
      TemplateSelectionExpression.foreach(__v => __obj.updateDynamic("TemplateSelectionExpression")(__v.asInstanceOf[js.Any]))
      TimeoutInMillis.foreach(__v => __obj.updateDynamic("TimeoutInMillis")(__v.asInstanceOf[js.Any]))
      TlsConfig.foreach(__v => __obj.updateDynamic("TlsConfig")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        IntegrationResponseKey: SelectionKey,
        ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy] = js.undefined,
        IntegrationResponseId: js.UndefOr[Id] = js.undefined,
        ResponseParameters: js.UndefOr[IntegrationParameters] = js.undefined,
        ResponseTemplates: js.UndefOr[TemplateMap] = js.undefined,
        TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    ): IntegrationResponse = {
      val __obj = js.Dynamic.literal(
        "IntegrationResponseKey" -> IntegrationResponseKey.asInstanceOf[js.Any]
      )

      ContentHandlingStrategy.foreach(__v => __obj.updateDynamic("ContentHandlingStrategy")(__v.asInstanceOf[js.Any]))
      IntegrationResponseId.foreach(__v => __obj.updateDynamic("IntegrationResponseId")(__v.asInstanceOf[js.Any]))
      ResponseParameters.foreach(__v => __obj.updateDynamic("ResponseParameters")(__v.asInstanceOf[js.Any]))
      ResponseTemplates.foreach(__v => __obj.updateDynamic("ResponseTemplates")(__v.asInstanceOf[js.Any]))
      TemplateSelectionExpression.foreach(__v => __obj.updateDynamic("TemplateSelectionExpression")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IntegrationResponse]
    }
  }

  /**
    * Represents an API method integration type.
    */
  @js.native
  sealed trait IntegrationType extends js.Any
  object IntegrationType {
    val AWS = "AWS".asInstanceOf[IntegrationType]
    val HTTP = "HTTP".asInstanceOf[IntegrationType]
    val MOCK = "MOCK".asInstanceOf[IntegrationType]
    val HTTP_PROXY = "HTTP_PROXY".asInstanceOf[IntegrationType]
    val AWS_PROXY = "AWS_PROXY".asInstanceOf[IntegrationType]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(AWS, HTTP, MOCK, HTTP_PROXY, AWS_PROXY))
  }

  /**
    * Represents the configuration of a JWT authorizer. Required for the JWT authorizer type. Supported only for HTTP APIs.
    */
  @js.native
  trait JWTConfiguration extends js.Object {
    var Audience: js.UndefOr[__listOf__string]
    var Issuer: js.UndefOr[UriWithLengthBetween1And2048]
  }

  object JWTConfiguration {
    @inline
    def apply(
        Audience: js.UndefOr[__listOf__string] = js.undefined,
        Issuer: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined
    ): JWTConfiguration = {
      val __obj = js.Dynamic.literal()
      Audience.foreach(__v => __obj.updateDynamic("Audience")(__v.asInstanceOf[js.Any]))
      Issuer.foreach(__v => __obj.updateDynamic("Issuer")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JWTConfiguration]
    }
  }

  /**
    * The logging level.
    */
  @js.native
  sealed trait LoggingLevel extends js.Any
  object LoggingLevel {
    val ERROR = "ERROR".asInstanceOf[LoggingLevel]
    val INFO = "INFO".asInstanceOf[LoggingLevel]
    val OFF = "OFF".asInstanceOf[LoggingLevel]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(ERROR, INFO, OFF))
  }

  /**
    * Represents a data model for an API. Supported only for WebSocket APIs. See [[https://docs.aws.amazon.com/apigateway/latest/developerguide/models-mappings.html|Create Models and Mapping Templates for Request and Response Mappings]].
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
    @inline
    def apply(
        Name: StringWithLengthBetween1And128,
        ContentType: js.UndefOr[StringWithLengthBetween1And256] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        ModelId: js.UndefOr[Id] = js.undefined,
        Schema: js.UndefOr[StringWithLengthBetween0And32K] = js.undefined
    ): Model = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ModelId.foreach(__v => __obj.updateDynamic("ModelId")(__v.asInstanceOf[js.Any]))
      Schema.foreach(__v => __obj.updateDynamic("Schema")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Model]
    }
  }

  /**
    * Validation constraints imposed on parameters of a request (path, query string, headers).
    */
  @js.native
  trait ParameterConstraints extends js.Object {
    var Required: js.UndefOr[__boolean]
  }

  object ParameterConstraints {
    @inline
    def apply(
        Required: js.UndefOr[__boolean] = js.undefined
    ): ParameterConstraints = {
      val __obj = js.Dynamic.literal()
      Required.foreach(__v => __obj.updateDynamic("Required")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ParameterConstraints]
    }
  }

  /**
    * Represents passthrough behavior for an integration response. Supported only for WebSocket APIs.
    */
  @js.native
  sealed trait PassthroughBehavior extends js.Any
  object PassthroughBehavior {
    val WHEN_NO_MATCH = "WHEN_NO_MATCH".asInstanceOf[PassthroughBehavior]
    val NEVER = "NEVER".asInstanceOf[PassthroughBehavior]
    val WHEN_NO_TEMPLATES = "WHEN_NO_TEMPLATES".asInstanceOf[PassthroughBehavior]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(WHEN_NO_MATCH, NEVER, WHEN_NO_TEMPLATES))
  }

  /**
    * Represents a protocol type.
    */
  @js.native
  sealed trait ProtocolType extends js.Any
  object ProtocolType {
    val WEBSOCKET = "WEBSOCKET".asInstanceOf[ProtocolType]
    val HTTP = "HTTP".asInstanceOf[ProtocolType]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(WEBSOCKET, HTTP))
  }

  /**
    */
  @js.native
  trait ReimportApiRequest extends js.Object {
    var ApiId: __string
    var Body: __string
    var Basepath: js.UndefOr[__string]
    var FailOnWarnings: js.UndefOr[__boolean]
  }

  object ReimportApiRequest {
    @inline
    def apply(
        ApiId: __string,
        Body: __string,
        Basepath: js.UndefOr[__string] = js.undefined,
        FailOnWarnings: js.UndefOr[__boolean] = js.undefined
    ): ReimportApiRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "Body" -> Body.asInstanceOf[js.Any]
      )

      Basepath.foreach(__v => __obj.updateDynamic("Basepath")(__v.asInstanceOf[js.Any]))
      FailOnWarnings.foreach(__v => __obj.updateDynamic("FailOnWarnings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReimportApiRequest]
    }
  }

  @js.native
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

  object ReimportApiResponse {
    @inline
    def apply(
        ApiEndpoint: js.UndefOr[__string] = js.undefined,
        ApiId: js.UndefOr[Id] = js.undefined,
        ApiKeySelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        CorsConfiguration: js.UndefOr[Cors] = js.undefined,
        CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        DisableSchemaValidation: js.UndefOr[__boolean] = js.undefined,
        ImportInfo: js.UndefOr[__listOf__string] = js.undefined,
        Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined,
        ProtocolType: js.UndefOr[ProtocolType] = js.undefined,
        RouteSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        Version: js.UndefOr[StringWithLengthBetween1And64] = js.undefined,
        Warnings: js.UndefOr[__listOf__string] = js.undefined
    ): ReimportApiResponse = {
      val __obj = js.Dynamic.literal()
      ApiEndpoint.foreach(__v => __obj.updateDynamic("ApiEndpoint")(__v.asInstanceOf[js.Any]))
      ApiId.foreach(__v => __obj.updateDynamic("ApiId")(__v.asInstanceOf[js.Any]))
      ApiKeySelectionExpression.foreach(__v => __obj.updateDynamic("ApiKeySelectionExpression")(__v.asInstanceOf[js.Any]))
      CorsConfiguration.foreach(__v => __obj.updateDynamic("CorsConfiguration")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisableSchemaValidation.foreach(__v => __obj.updateDynamic("DisableSchemaValidation")(__v.asInstanceOf[js.Any]))
      ImportInfo.foreach(__v => __obj.updateDynamic("ImportInfo")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ProtocolType.foreach(__v => __obj.updateDynamic("ProtocolType")(__v.asInstanceOf[js.Any]))
      RouteSelectionExpression.foreach(__v => __obj.updateDynamic("RouteSelectionExpression")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      Warnings.foreach(__v => __obj.updateDynamic("Warnings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReimportApiResponse]
    }
  }

  /**
    * Represents a route.
    */
  @js.native
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

  object Route {
    @inline
    def apply(
        RouteKey: SelectionKey,
        ApiGatewayManaged: js.UndefOr[__boolean] = js.undefined,
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
      val __obj = js.Dynamic.literal(
        "RouteKey" -> RouteKey.asInstanceOf[js.Any]
      )

      ApiGatewayManaged.foreach(__v => __obj.updateDynamic("ApiGatewayManaged")(__v.asInstanceOf[js.Any]))
      ApiKeyRequired.foreach(__v => __obj.updateDynamic("ApiKeyRequired")(__v.asInstanceOf[js.Any]))
      AuthorizationScopes.foreach(__v => __obj.updateDynamic("AuthorizationScopes")(__v.asInstanceOf[js.Any]))
      AuthorizationType.foreach(__v => __obj.updateDynamic("AuthorizationType")(__v.asInstanceOf[js.Any]))
      AuthorizerId.foreach(__v => __obj.updateDynamic("AuthorizerId")(__v.asInstanceOf[js.Any]))
      ModelSelectionExpression.foreach(__v => __obj.updateDynamic("ModelSelectionExpression")(__v.asInstanceOf[js.Any]))
      OperationName.foreach(__v => __obj.updateDynamic("OperationName")(__v.asInstanceOf[js.Any]))
      RequestModels.foreach(__v => __obj.updateDynamic("RequestModels")(__v.asInstanceOf[js.Any]))
      RequestParameters.foreach(__v => __obj.updateDynamic("RequestParameters")(__v.asInstanceOf[js.Any]))
      RouteId.foreach(__v => __obj.updateDynamic("RouteId")(__v.asInstanceOf[js.Any]))
      RouteResponseSelectionExpression.foreach(__v => __obj.updateDynamic("RouteResponseSelectionExpression")(__v.asInstanceOf[js.Any]))
      Target.foreach(__v => __obj.updateDynamic("Target")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        RouteResponseKey: SelectionKey,
        ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        ResponseModels: js.UndefOr[RouteModels] = js.undefined,
        ResponseParameters: js.UndefOr[RouteParameters] = js.undefined,
        RouteResponseId: js.UndefOr[Id] = js.undefined
    ): RouteResponse = {
      val __obj = js.Dynamic.literal(
        "RouteResponseKey" -> RouteResponseKey.asInstanceOf[js.Any]
      )

      ModelSelectionExpression.foreach(__v => __obj.updateDynamic("ModelSelectionExpression")(__v.asInstanceOf[js.Any]))
      ResponseModels.foreach(__v => __obj.updateDynamic("ResponseModels")(__v.asInstanceOf[js.Any]))
      ResponseParameters.foreach(__v => __obj.updateDynamic("ResponseParameters")(__v.asInstanceOf[js.Any]))
      RouteResponseId.foreach(__v => __obj.updateDynamic("RouteResponseId")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        DataTraceEnabled: js.UndefOr[__boolean] = js.undefined,
        DetailedMetricsEnabled: js.UndefOr[__boolean] = js.undefined,
        LoggingLevel: js.UndefOr[LoggingLevel] = js.undefined,
        ThrottlingBurstLimit: js.UndefOr[__integer] = js.undefined,
        ThrottlingRateLimit: js.UndefOr[__double] = js.undefined
    ): RouteSettings = {
      val __obj = js.Dynamic.literal()
      DataTraceEnabled.foreach(__v => __obj.updateDynamic("DataTraceEnabled")(__v.asInstanceOf[js.Any]))
      DetailedMetricsEnabled.foreach(__v => __obj.updateDynamic("DetailedMetricsEnabled")(__v.asInstanceOf[js.Any]))
      LoggingLevel.foreach(__v => __obj.updateDynamic("LoggingLevel")(__v.asInstanceOf[js.Any]))
      ThrottlingBurstLimit.foreach(__v => __obj.updateDynamic("ThrottlingBurstLimit")(__v.asInstanceOf[js.Any]))
      ThrottlingRateLimit.foreach(__v => __obj.updateDynamic("ThrottlingRateLimit")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RouteSettings]
    }
  }

  /**
    * The Transport Layer Security (TLS) version of the security policy for this domain name. The valid values are TLS_1_0 and TLS_1_2.
    */
  @js.native
  sealed trait SecurityPolicy extends js.Any
  object SecurityPolicy {
    val TLS_1_0 = "TLS_1_0".asInstanceOf[SecurityPolicy]
    val TLS_1_2 = "TLS_1_2".asInstanceOf[SecurityPolicy]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(TLS_1_0, TLS_1_2))
  }

  /**
    * Represents an API stage.
    */
  @js.native
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

  object Stage {
    @inline
    def apply(
        StageName: StringWithLengthBetween1And128,
        AccessLogSettings: js.UndefOr[AccessLogSettings] = js.undefined,
        ApiGatewayManaged: js.UndefOr[__boolean] = js.undefined,
        AutoDeploy: js.UndefOr[__boolean] = js.undefined,
        ClientCertificateId: js.UndefOr[Id] = js.undefined,
        CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        DefaultRouteSettings: js.UndefOr[RouteSettings] = js.undefined,
        DeploymentId: js.UndefOr[Id] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        LastDeploymentStatusMessage: js.UndefOr[__string] = js.undefined,
        LastUpdatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        RouteSettings: js.UndefOr[RouteSettingsMap] = js.undefined,
        StageVariables: js.UndefOr[StageVariablesMap] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): Stage = {
      val __obj = js.Dynamic.literal(
        "StageName" -> StageName.asInstanceOf[js.Any]
      )

      AccessLogSettings.foreach(__v => __obj.updateDynamic("AccessLogSettings")(__v.asInstanceOf[js.Any]))
      ApiGatewayManaged.foreach(__v => __obj.updateDynamic("ApiGatewayManaged")(__v.asInstanceOf[js.Any]))
      AutoDeploy.foreach(__v => __obj.updateDynamic("AutoDeploy")(__v.asInstanceOf[js.Any]))
      ClientCertificateId.foreach(__v => __obj.updateDynamic("ClientCertificateId")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      DefaultRouteSettings.foreach(__v => __obj.updateDynamic("DefaultRouteSettings")(__v.asInstanceOf[js.Any]))
      DeploymentId.foreach(__v => __obj.updateDynamic("DeploymentId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastDeploymentStatusMessage.foreach(__v => __obj.updateDynamic("LastDeploymentStatusMessage")(__v.asInstanceOf[js.Any]))
      LastUpdatedDate.foreach(__v => __obj.updateDynamic("LastUpdatedDate")(__v.asInstanceOf[js.Any]))
      RouteSettings.foreach(__v => __obj.updateDynamic("RouteSettings")(__v.asInstanceOf[js.Any]))
      StageVariables.foreach(__v => __obj.updateDynamic("StageVariables")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Stage]
    }
  }

  /**
    * Creates a new Tag resource to represent a tag.
    */
  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: __string
    var Tags: js.UndefOr[Tags]
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: __string,
        Tags: js.UndefOr[Tags] = js.undefined
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
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
    * The TLS configuration for a private integration. If you specify a TLS configuration, private integration traffic uses the HTTPS protocol. Supported only for HTTP APIs.
    */
  @js.native
  trait TlsConfig extends js.Object {
    var ServerNameToVerify: js.UndefOr[StringWithLengthBetween1And512]
  }

  object TlsConfig {
    @inline
    def apply(
        ServerNameToVerify: js.UndefOr[StringWithLengthBetween1And512] = js.undefined
    ): TlsConfig = {
      val __obj = js.Dynamic.literal()
      ServerNameToVerify.foreach(__v => __obj.updateDynamic("ServerNameToVerify")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TlsConfig]
    }
  }

  /**
    * The TLS configuration for a private integration. If you specify a TLS configuration, private integration traffic uses the HTTPS protocol. Supported only for HTTP APIs.
    */
  @js.native
  trait TlsConfigInput extends js.Object {
    var ServerNameToVerify: js.UndefOr[StringWithLengthBetween1And512]
  }

  object TlsConfigInput {
    @inline
    def apply(
        ServerNameToVerify: js.UndefOr[StringWithLengthBetween1And512] = js.undefined
    ): TlsConfigInput = {
      val __obj = js.Dynamic.literal()
      ServerNameToVerify.foreach(__v => __obj.updateDynamic("ServerNameToVerify")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TlsConfigInput]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: __string
    var TagKeys: __listOf__string
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: __string,
        TagKeys: __listOf__string
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  /**
    * Updates an ApiMapping.
    */
  @js.native
  trait UpdateApiMappingRequest extends js.Object {
    var ApiId: Id
    var ApiMappingId: __string
    var DomainName: __string
    var ApiMappingKey: js.UndefOr[SelectionKey]
    var Stage: js.UndefOr[StringWithLengthBetween1And128]
  }

  object UpdateApiMappingRequest {
    @inline
    def apply(
        ApiId: Id,
        ApiMappingId: __string,
        DomainName: __string,
        ApiMappingKey: js.UndefOr[SelectionKey] = js.undefined,
        Stage: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    ): UpdateApiMappingRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "ApiMappingId" -> ApiMappingId.asInstanceOf[js.Any],
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      ApiMappingKey.foreach(__v => __obj.updateDynamic("ApiMappingKey")(__v.asInstanceOf[js.Any]))
      Stage.foreach(__v => __obj.updateDynamic("Stage")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ApiId: js.UndefOr[Id] = js.undefined,
        ApiMappingId: js.UndefOr[Id] = js.undefined,
        ApiMappingKey: js.UndefOr[SelectionKey] = js.undefined,
        Stage: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    ): UpdateApiMappingResponse = {
      val __obj = js.Dynamic.literal()
      ApiId.foreach(__v => __obj.updateDynamic("ApiId")(__v.asInstanceOf[js.Any]))
      ApiMappingId.foreach(__v => __obj.updateDynamic("ApiMappingId")(__v.asInstanceOf[js.Any]))
      ApiMappingKey.foreach(__v => __obj.updateDynamic("ApiMappingKey")(__v.asInstanceOf[js.Any]))
      Stage.foreach(__v => __obj.updateDynamic("Stage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApiMappingResponse]
    }
  }

  /**
    * Updates an Api.
    */
  @js.native
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

  object UpdateApiRequest {
    @inline
    def apply(
        ApiId: __string,
        ApiKeySelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        CorsConfiguration: js.UndefOr[Cors] = js.undefined,
        CredentialsArn: js.UndefOr[Arn] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        DisableSchemaValidation: js.UndefOr[__boolean] = js.undefined,
        Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined,
        RouteKey: js.UndefOr[SelectionKey] = js.undefined,
        RouteSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        Target: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined,
        Version: js.UndefOr[StringWithLengthBetween1And64] = js.undefined
    ): UpdateApiRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any]
      )

      ApiKeySelectionExpression.foreach(__v => __obj.updateDynamic("ApiKeySelectionExpression")(__v.asInstanceOf[js.Any]))
      CorsConfiguration.foreach(__v => __obj.updateDynamic("CorsConfiguration")(__v.asInstanceOf[js.Any]))
      CredentialsArn.foreach(__v => __obj.updateDynamic("CredentialsArn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisableSchemaValidation.foreach(__v => __obj.updateDynamic("DisableSchemaValidation")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RouteKey.foreach(__v => __obj.updateDynamic("RouteKey")(__v.asInstanceOf[js.Any]))
      RouteSelectionExpression.foreach(__v => __obj.updateDynamic("RouteSelectionExpression")(__v.asInstanceOf[js.Any]))
      Target.foreach(__v => __obj.updateDynamic("Target")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApiRequest]
    }
  }

  @js.native
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

  object UpdateApiResponse {
    @inline
    def apply(
        ApiEndpoint: js.UndefOr[__string] = js.undefined,
        ApiId: js.UndefOr[Id] = js.undefined,
        ApiKeySelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        CorsConfiguration: js.UndefOr[Cors] = js.undefined,
        CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        DisableSchemaValidation: js.UndefOr[__boolean] = js.undefined,
        ImportInfo: js.UndefOr[__listOf__string] = js.undefined,
        Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined,
        ProtocolType: js.UndefOr[ProtocolType] = js.undefined,
        RouteSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        Version: js.UndefOr[StringWithLengthBetween1And64] = js.undefined,
        Warnings: js.UndefOr[__listOf__string] = js.undefined
    ): UpdateApiResponse = {
      val __obj = js.Dynamic.literal()
      ApiEndpoint.foreach(__v => __obj.updateDynamic("ApiEndpoint")(__v.asInstanceOf[js.Any]))
      ApiId.foreach(__v => __obj.updateDynamic("ApiId")(__v.asInstanceOf[js.Any]))
      ApiKeySelectionExpression.foreach(__v => __obj.updateDynamic("ApiKeySelectionExpression")(__v.asInstanceOf[js.Any]))
      CorsConfiguration.foreach(__v => __obj.updateDynamic("CorsConfiguration")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DisableSchemaValidation.foreach(__v => __obj.updateDynamic("DisableSchemaValidation")(__v.asInstanceOf[js.Any]))
      ImportInfo.foreach(__v => __obj.updateDynamic("ImportInfo")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ProtocolType.foreach(__v => __obj.updateDynamic("ProtocolType")(__v.asInstanceOf[js.Any]))
      RouteSelectionExpression.foreach(__v => __obj.updateDynamic("RouteSelectionExpression")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      Warnings.foreach(__v => __obj.updateDynamic("Warnings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApiResponse]
    }
  }

  /**
    * Updates an Authorizer.
    */
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
    var JwtConfiguration: js.UndefOr[JWTConfiguration]
    var Name: js.UndefOr[StringWithLengthBetween1And128]
  }

  object UpdateAuthorizerRequest {
    @inline
    def apply(
        ApiId: __string,
        AuthorizerId: __string,
        AuthorizerCredentialsArn: js.UndefOr[Arn] = js.undefined,
        AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600] = js.undefined,
        AuthorizerType: js.UndefOr[AuthorizerType] = js.undefined,
        AuthorizerUri: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined,
        IdentitySource: js.UndefOr[IdentitySourceList] = js.undefined,
        IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        JwtConfiguration: js.UndefOr[JWTConfiguration] = js.undefined,
        Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    ): UpdateAuthorizerRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "AuthorizerId" -> AuthorizerId.asInstanceOf[js.Any]
      )

      AuthorizerCredentialsArn.foreach(__v => __obj.updateDynamic("AuthorizerCredentialsArn")(__v.asInstanceOf[js.Any]))
      AuthorizerResultTtlInSeconds.foreach(__v => __obj.updateDynamic("AuthorizerResultTtlInSeconds")(__v.asInstanceOf[js.Any]))
      AuthorizerType.foreach(__v => __obj.updateDynamic("AuthorizerType")(__v.asInstanceOf[js.Any]))
      AuthorizerUri.foreach(__v => __obj.updateDynamic("AuthorizerUri")(__v.asInstanceOf[js.Any]))
      IdentitySource.foreach(__v => __obj.updateDynamic("IdentitySource")(__v.asInstanceOf[js.Any]))
      IdentityValidationExpression.foreach(__v => __obj.updateDynamic("IdentityValidationExpression")(__v.asInstanceOf[js.Any]))
      JwtConfiguration.foreach(__v => __obj.updateDynamic("JwtConfiguration")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
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
    var JwtConfiguration: js.UndefOr[JWTConfiguration]
    var Name: js.UndefOr[StringWithLengthBetween1And128]
  }

  object UpdateAuthorizerResponse {
    @inline
    def apply(
        AuthorizerCredentialsArn: js.UndefOr[Arn] = js.undefined,
        AuthorizerId: js.UndefOr[Id] = js.undefined,
        AuthorizerResultTtlInSeconds: js.UndefOr[IntegerWithLengthBetween0And3600] = js.undefined,
        AuthorizerType: js.UndefOr[AuthorizerType] = js.undefined,
        AuthorizerUri: js.UndefOr[UriWithLengthBetween1And2048] = js.undefined,
        IdentitySource: js.UndefOr[IdentitySourceList] = js.undefined,
        IdentityValidationExpression: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        JwtConfiguration: js.UndefOr[JWTConfiguration] = js.undefined,
        Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    ): UpdateAuthorizerResponse = {
      val __obj = js.Dynamic.literal()
      AuthorizerCredentialsArn.foreach(__v => __obj.updateDynamic("AuthorizerCredentialsArn")(__v.asInstanceOf[js.Any]))
      AuthorizerId.foreach(__v => __obj.updateDynamic("AuthorizerId")(__v.asInstanceOf[js.Any]))
      AuthorizerResultTtlInSeconds.foreach(__v => __obj.updateDynamic("AuthorizerResultTtlInSeconds")(__v.asInstanceOf[js.Any]))
      AuthorizerType.foreach(__v => __obj.updateDynamic("AuthorizerType")(__v.asInstanceOf[js.Any]))
      AuthorizerUri.foreach(__v => __obj.updateDynamic("AuthorizerUri")(__v.asInstanceOf[js.Any]))
      IdentitySource.foreach(__v => __obj.updateDynamic("IdentitySource")(__v.asInstanceOf[js.Any]))
      IdentityValidationExpression.foreach(__v => __obj.updateDynamic("IdentityValidationExpression")(__v.asInstanceOf[js.Any]))
      JwtConfiguration.foreach(__v => __obj.updateDynamic("JwtConfiguration")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAuthorizerResponse]
    }
  }

  /**
    * Updates a Deployment.
    */
  @js.native
  trait UpdateDeploymentRequest extends js.Object {
    var ApiId: __string
    var DeploymentId: __string
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
  }

  object UpdateDeploymentRequest {
    @inline
    def apply(
        ApiId: __string,
        DeploymentId: __string,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    ): UpdateDeploymentRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "DeploymentId" -> DeploymentId.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDeploymentRequest]
    }
  }

  @js.native
  trait UpdateDeploymentResponse extends js.Object {
    var AutoDeployed: js.UndefOr[__boolean]
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var DeploymentId: js.UndefOr[Id]
    var DeploymentStatus: js.UndefOr[DeploymentStatus]
    var DeploymentStatusMessage: js.UndefOr[__string]
    var Description: js.UndefOr[StringWithLengthBetween0And1024]
  }

  object UpdateDeploymentResponse {
    @inline
    def apply(
        AutoDeployed: js.UndefOr[__boolean] = js.undefined,
        CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        DeploymentId: js.UndefOr[Id] = js.undefined,
        DeploymentStatus: js.UndefOr[DeploymentStatus] = js.undefined,
        DeploymentStatusMessage: js.UndefOr[__string] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
    ): UpdateDeploymentResponse = {
      val __obj = js.Dynamic.literal()
      AutoDeployed.foreach(__v => __obj.updateDynamic("AutoDeployed")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      DeploymentId.foreach(__v => __obj.updateDynamic("DeploymentId")(__v.asInstanceOf[js.Any]))
      DeploymentStatus.foreach(__v => __obj.updateDynamic("DeploymentStatus")(__v.asInstanceOf[js.Any]))
      DeploymentStatusMessage.foreach(__v => __obj.updateDynamic("DeploymentStatusMessage")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDeploymentResponse]
    }
  }

  /**
    * Updates a DomainName.
    */
  @js.native
  trait UpdateDomainNameRequest extends js.Object {
    var DomainName: __string
    var DomainNameConfigurations: js.UndefOr[DomainNameConfigurations]
  }

  object UpdateDomainNameRequest {
    @inline
    def apply(
        DomainName: __string,
        DomainNameConfigurations: js.UndefOr[DomainNameConfigurations] = js.undefined
    ): UpdateDomainNameRequest = {
      val __obj = js.Dynamic.literal(
        "DomainName" -> DomainName.asInstanceOf[js.Any]
      )

      DomainNameConfigurations.foreach(__v => __obj.updateDynamic("DomainNameConfigurations")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ApiMappingSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        DomainName: js.UndefOr[StringWithLengthBetween1And512] = js.undefined,
        DomainNameConfigurations: js.UndefOr[DomainNameConfigurations] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): UpdateDomainNameResponse = {
      val __obj = js.Dynamic.literal()
      ApiMappingSelectionExpression.foreach(__v => __obj.updateDynamic("ApiMappingSelectionExpression")(__v.asInstanceOf[js.Any]))
      DomainName.foreach(__v => __obj.updateDynamic("DomainName")(__v.asInstanceOf[js.Any]))
      DomainNameConfigurations.foreach(__v => __obj.updateDynamic("DomainNameConfigurations")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDomainNameResponse]
    }
  }

  /**
    * Updates an Integration.
    */
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
    var PayloadFormatVersion: js.UndefOr[StringWithLengthBetween1And64]
    var RequestParameters: js.UndefOr[IntegrationParameters]
    var RequestTemplates: js.UndefOr[TemplateMap]
    var TemplateSelectionExpression: js.UndefOr[SelectionExpression]
    var TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And30000]
    var TlsConfig: js.UndefOr[TlsConfigInput]
  }

  object UpdateIntegrationRequest {
    @inline
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
        PayloadFormatVersion: js.UndefOr[StringWithLengthBetween1And64] = js.undefined,
        RequestParameters: js.UndefOr[IntegrationParameters] = js.undefined,
        RequestTemplates: js.UndefOr[TemplateMap] = js.undefined,
        TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And30000] = js.undefined,
        TlsConfig: js.UndefOr[TlsConfigInput] = js.undefined
    ): UpdateIntegrationRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "IntegrationId" -> IntegrationId.asInstanceOf[js.Any]
      )

      ConnectionId.foreach(__v => __obj.updateDynamic("ConnectionId")(__v.asInstanceOf[js.Any]))
      ConnectionType.foreach(__v => __obj.updateDynamic("ConnectionType")(__v.asInstanceOf[js.Any]))
      ContentHandlingStrategy.foreach(__v => __obj.updateDynamic("ContentHandlingStrategy")(__v.asInstanceOf[js.Any]))
      CredentialsArn.foreach(__v => __obj.updateDynamic("CredentialsArn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      IntegrationMethod.foreach(__v => __obj.updateDynamic("IntegrationMethod")(__v.asInstanceOf[js.Any]))
      IntegrationType.foreach(__v => __obj.updateDynamic("IntegrationType")(__v.asInstanceOf[js.Any]))
      IntegrationUri.foreach(__v => __obj.updateDynamic("IntegrationUri")(__v.asInstanceOf[js.Any]))
      PassthroughBehavior.foreach(__v => __obj.updateDynamic("PassthroughBehavior")(__v.asInstanceOf[js.Any]))
      PayloadFormatVersion.foreach(__v => __obj.updateDynamic("PayloadFormatVersion")(__v.asInstanceOf[js.Any]))
      RequestParameters.foreach(__v => __obj.updateDynamic("RequestParameters")(__v.asInstanceOf[js.Any]))
      RequestTemplates.foreach(__v => __obj.updateDynamic("RequestTemplates")(__v.asInstanceOf[js.Any]))
      TemplateSelectionExpression.foreach(__v => __obj.updateDynamic("TemplateSelectionExpression")(__v.asInstanceOf[js.Any]))
      TimeoutInMillis.foreach(__v => __obj.updateDynamic("TimeoutInMillis")(__v.asInstanceOf[js.Any]))
      TlsConfig.foreach(__v => __obj.updateDynamic("TlsConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateIntegrationRequest]
    }
  }

  /**
    * Updates an IntegrationResponses.
    */
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
    @inline
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
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "IntegrationId" -> IntegrationId.asInstanceOf[js.Any],
        "IntegrationResponseId" -> IntegrationResponseId.asInstanceOf[js.Any]
      )

      ContentHandlingStrategy.foreach(__v => __obj.updateDynamic("ContentHandlingStrategy")(__v.asInstanceOf[js.Any]))
      IntegrationResponseKey.foreach(__v => __obj.updateDynamic("IntegrationResponseKey")(__v.asInstanceOf[js.Any]))
      ResponseParameters.foreach(__v => __obj.updateDynamic("ResponseParameters")(__v.asInstanceOf[js.Any]))
      ResponseTemplates.foreach(__v => __obj.updateDynamic("ResponseTemplates")(__v.asInstanceOf[js.Any]))
      TemplateSelectionExpression.foreach(__v => __obj.updateDynamic("TemplateSelectionExpression")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ContentHandlingStrategy: js.UndefOr[ContentHandlingStrategy] = js.undefined,
        IntegrationResponseId: js.UndefOr[Id] = js.undefined,
        IntegrationResponseKey: js.UndefOr[SelectionKey] = js.undefined,
        ResponseParameters: js.UndefOr[IntegrationParameters] = js.undefined,
        ResponseTemplates: js.UndefOr[TemplateMap] = js.undefined,
        TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined
    ): UpdateIntegrationResponseResponse = {
      val __obj = js.Dynamic.literal()
      ContentHandlingStrategy.foreach(__v => __obj.updateDynamic("ContentHandlingStrategy")(__v.asInstanceOf[js.Any]))
      IntegrationResponseId.foreach(__v => __obj.updateDynamic("IntegrationResponseId")(__v.asInstanceOf[js.Any]))
      IntegrationResponseKey.foreach(__v => __obj.updateDynamic("IntegrationResponseKey")(__v.asInstanceOf[js.Any]))
      ResponseParameters.foreach(__v => __obj.updateDynamic("ResponseParameters")(__v.asInstanceOf[js.Any]))
      ResponseTemplates.foreach(__v => __obj.updateDynamic("ResponseTemplates")(__v.asInstanceOf[js.Any]))
      TemplateSelectionExpression.foreach(__v => __obj.updateDynamic("TemplateSelectionExpression")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateIntegrationResponseResponse]
    }
  }

  @js.native
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
    var TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And30000]
    var TlsConfig: js.UndefOr[TlsConfig]
  }

  object UpdateIntegrationResult {
    @inline
    def apply(
        ApiGatewayManaged: js.UndefOr[__boolean] = js.undefined,
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
        PayloadFormatVersion: js.UndefOr[StringWithLengthBetween1And64] = js.undefined,
        RequestParameters: js.UndefOr[IntegrationParameters] = js.undefined,
        RequestTemplates: js.UndefOr[TemplateMap] = js.undefined,
        TemplateSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        TimeoutInMillis: js.UndefOr[IntegerWithLengthBetween50And30000] = js.undefined,
        TlsConfig: js.UndefOr[TlsConfig] = js.undefined
    ): UpdateIntegrationResult = {
      val __obj = js.Dynamic.literal()
      ApiGatewayManaged.foreach(__v => __obj.updateDynamic("ApiGatewayManaged")(__v.asInstanceOf[js.Any]))
      ConnectionId.foreach(__v => __obj.updateDynamic("ConnectionId")(__v.asInstanceOf[js.Any]))
      ConnectionType.foreach(__v => __obj.updateDynamic("ConnectionType")(__v.asInstanceOf[js.Any]))
      ContentHandlingStrategy.foreach(__v => __obj.updateDynamic("ContentHandlingStrategy")(__v.asInstanceOf[js.Any]))
      CredentialsArn.foreach(__v => __obj.updateDynamic("CredentialsArn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      IntegrationId.foreach(__v => __obj.updateDynamic("IntegrationId")(__v.asInstanceOf[js.Any]))
      IntegrationMethod.foreach(__v => __obj.updateDynamic("IntegrationMethod")(__v.asInstanceOf[js.Any]))
      IntegrationResponseSelectionExpression.foreach(__v => __obj.updateDynamic("IntegrationResponseSelectionExpression")(__v.asInstanceOf[js.Any]))
      IntegrationType.foreach(__v => __obj.updateDynamic("IntegrationType")(__v.asInstanceOf[js.Any]))
      IntegrationUri.foreach(__v => __obj.updateDynamic("IntegrationUri")(__v.asInstanceOf[js.Any]))
      PassthroughBehavior.foreach(__v => __obj.updateDynamic("PassthroughBehavior")(__v.asInstanceOf[js.Any]))
      PayloadFormatVersion.foreach(__v => __obj.updateDynamic("PayloadFormatVersion")(__v.asInstanceOf[js.Any]))
      RequestParameters.foreach(__v => __obj.updateDynamic("RequestParameters")(__v.asInstanceOf[js.Any]))
      RequestTemplates.foreach(__v => __obj.updateDynamic("RequestTemplates")(__v.asInstanceOf[js.Any]))
      TemplateSelectionExpression.foreach(__v => __obj.updateDynamic("TemplateSelectionExpression")(__v.asInstanceOf[js.Any]))
      TimeoutInMillis.foreach(__v => __obj.updateDynamic("TimeoutInMillis")(__v.asInstanceOf[js.Any]))
      TlsConfig.foreach(__v => __obj.updateDynamic("TlsConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateIntegrationResult]
    }
  }

  /**
    * Updates a Model.
    */
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
    @inline
    def apply(
        ApiId: __string,
        ModelId: __string,
        ContentType: js.UndefOr[StringWithLengthBetween1And256] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined,
        Schema: js.UndefOr[StringWithLengthBetween0And32K] = js.undefined
    ): UpdateModelRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "ModelId" -> ModelId.asInstanceOf[js.Any]
      )

      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Schema.foreach(__v => __obj.updateDynamic("Schema")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ContentType: js.UndefOr[StringWithLengthBetween1And256] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        ModelId: js.UndefOr[Id] = js.undefined,
        Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined,
        Schema: js.UndefOr[StringWithLengthBetween0And32K] = js.undefined
    ): UpdateModelResponse = {
      val __obj = js.Dynamic.literal()
      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      ModelId.foreach(__v => __obj.updateDynamic("ModelId")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Schema.foreach(__v => __obj.updateDynamic("Schema")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateModelResponse]
    }
  }

  /**
    * Updates a Route.
    */
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
    @inline
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
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "RouteId" -> RouteId.asInstanceOf[js.Any]
      )

      ApiKeyRequired.foreach(__v => __obj.updateDynamic("ApiKeyRequired")(__v.asInstanceOf[js.Any]))
      AuthorizationScopes.foreach(__v => __obj.updateDynamic("AuthorizationScopes")(__v.asInstanceOf[js.Any]))
      AuthorizationType.foreach(__v => __obj.updateDynamic("AuthorizationType")(__v.asInstanceOf[js.Any]))
      AuthorizerId.foreach(__v => __obj.updateDynamic("AuthorizerId")(__v.asInstanceOf[js.Any]))
      ModelSelectionExpression.foreach(__v => __obj.updateDynamic("ModelSelectionExpression")(__v.asInstanceOf[js.Any]))
      OperationName.foreach(__v => __obj.updateDynamic("OperationName")(__v.asInstanceOf[js.Any]))
      RequestModels.foreach(__v => __obj.updateDynamic("RequestModels")(__v.asInstanceOf[js.Any]))
      RequestParameters.foreach(__v => __obj.updateDynamic("RequestParameters")(__v.asInstanceOf[js.Any]))
      RouteKey.foreach(__v => __obj.updateDynamic("RouteKey")(__v.asInstanceOf[js.Any]))
      RouteResponseSelectionExpression.foreach(__v => __obj.updateDynamic("RouteResponseSelectionExpression")(__v.asInstanceOf[js.Any]))
      Target.foreach(__v => __obj.updateDynamic("Target")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRouteRequest]
    }
  }

  /**
    * Updates a RouteResponse.
    */
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
    @inline
    def apply(
        ApiId: __string,
        RouteId: __string,
        RouteResponseId: __string,
        ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        ResponseModels: js.UndefOr[RouteModels] = js.undefined,
        ResponseParameters: js.UndefOr[RouteParameters] = js.undefined,
        RouteResponseKey: js.UndefOr[SelectionKey] = js.undefined
    ): UpdateRouteResponseRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "RouteId" -> RouteId.asInstanceOf[js.Any],
        "RouteResponseId" -> RouteResponseId.asInstanceOf[js.Any]
      )

      ModelSelectionExpression.foreach(__v => __obj.updateDynamic("ModelSelectionExpression")(__v.asInstanceOf[js.Any]))
      ResponseModels.foreach(__v => __obj.updateDynamic("ResponseModels")(__v.asInstanceOf[js.Any]))
      ResponseParameters.foreach(__v => __obj.updateDynamic("ResponseParameters")(__v.asInstanceOf[js.Any]))
      RouteResponseKey.foreach(__v => __obj.updateDynamic("RouteResponseKey")(__v.asInstanceOf[js.Any]))
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
    @inline
    def apply(
        ModelSelectionExpression: js.UndefOr[SelectionExpression] = js.undefined,
        ResponseModels: js.UndefOr[RouteModels] = js.undefined,
        ResponseParameters: js.UndefOr[RouteParameters] = js.undefined,
        RouteResponseId: js.UndefOr[Id] = js.undefined,
        RouteResponseKey: js.UndefOr[SelectionKey] = js.undefined
    ): UpdateRouteResponseResponse = {
      val __obj = js.Dynamic.literal()
      ModelSelectionExpression.foreach(__v => __obj.updateDynamic("ModelSelectionExpression")(__v.asInstanceOf[js.Any]))
      ResponseModels.foreach(__v => __obj.updateDynamic("ResponseModels")(__v.asInstanceOf[js.Any]))
      ResponseParameters.foreach(__v => __obj.updateDynamic("ResponseParameters")(__v.asInstanceOf[js.Any]))
      RouteResponseId.foreach(__v => __obj.updateDynamic("RouteResponseId")(__v.asInstanceOf[js.Any]))
      RouteResponseKey.foreach(__v => __obj.updateDynamic("RouteResponseKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRouteResponseResponse]
    }
  }

  @js.native
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

  object UpdateRouteResult {
    @inline
    def apply(
        ApiGatewayManaged: js.UndefOr[__boolean] = js.undefined,
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
    ): UpdateRouteResult = {
      val __obj = js.Dynamic.literal()
      ApiGatewayManaged.foreach(__v => __obj.updateDynamic("ApiGatewayManaged")(__v.asInstanceOf[js.Any]))
      ApiKeyRequired.foreach(__v => __obj.updateDynamic("ApiKeyRequired")(__v.asInstanceOf[js.Any]))
      AuthorizationScopes.foreach(__v => __obj.updateDynamic("AuthorizationScopes")(__v.asInstanceOf[js.Any]))
      AuthorizationType.foreach(__v => __obj.updateDynamic("AuthorizationType")(__v.asInstanceOf[js.Any]))
      AuthorizerId.foreach(__v => __obj.updateDynamic("AuthorizerId")(__v.asInstanceOf[js.Any]))
      ModelSelectionExpression.foreach(__v => __obj.updateDynamic("ModelSelectionExpression")(__v.asInstanceOf[js.Any]))
      OperationName.foreach(__v => __obj.updateDynamic("OperationName")(__v.asInstanceOf[js.Any]))
      RequestModels.foreach(__v => __obj.updateDynamic("RequestModels")(__v.asInstanceOf[js.Any]))
      RequestParameters.foreach(__v => __obj.updateDynamic("RequestParameters")(__v.asInstanceOf[js.Any]))
      RouteId.foreach(__v => __obj.updateDynamic("RouteId")(__v.asInstanceOf[js.Any]))
      RouteKey.foreach(__v => __obj.updateDynamic("RouteKey")(__v.asInstanceOf[js.Any]))
      RouteResponseSelectionExpression.foreach(__v => __obj.updateDynamic("RouteResponseSelectionExpression")(__v.asInstanceOf[js.Any]))
      Target.foreach(__v => __obj.updateDynamic("Target")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRouteResult]
    }
  }

  /**
    * Updates a Stage.
    */
  @js.native
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

  object UpdateStageRequest {
    @inline
    def apply(
        ApiId: __string,
        StageName: __string,
        AccessLogSettings: js.UndefOr[AccessLogSettings] = js.undefined,
        AutoDeploy: js.UndefOr[__boolean] = js.undefined,
        ClientCertificateId: js.UndefOr[Id] = js.undefined,
        DefaultRouteSettings: js.UndefOr[RouteSettings] = js.undefined,
        DeploymentId: js.UndefOr[Id] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        RouteSettings: js.UndefOr[RouteSettingsMap] = js.undefined,
        StageVariables: js.UndefOr[StageVariablesMap] = js.undefined
    ): UpdateStageRequest = {
      val __obj = js.Dynamic.literal(
        "ApiId" -> ApiId.asInstanceOf[js.Any],
        "StageName" -> StageName.asInstanceOf[js.Any]
      )

      AccessLogSettings.foreach(__v => __obj.updateDynamic("AccessLogSettings")(__v.asInstanceOf[js.Any]))
      AutoDeploy.foreach(__v => __obj.updateDynamic("AutoDeploy")(__v.asInstanceOf[js.Any]))
      ClientCertificateId.foreach(__v => __obj.updateDynamic("ClientCertificateId")(__v.asInstanceOf[js.Any]))
      DefaultRouteSettings.foreach(__v => __obj.updateDynamic("DefaultRouteSettings")(__v.asInstanceOf[js.Any]))
      DeploymentId.foreach(__v => __obj.updateDynamic("DeploymentId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      RouteSettings.foreach(__v => __obj.updateDynamic("RouteSettings")(__v.asInstanceOf[js.Any]))
      StageVariables.foreach(__v => __obj.updateDynamic("StageVariables")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateStageRequest]
    }
  }

  @js.native
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

  object UpdateStageResponse {
    @inline
    def apply(
        AccessLogSettings: js.UndefOr[AccessLogSettings] = js.undefined,
        ApiGatewayManaged: js.UndefOr[__boolean] = js.undefined,
        AutoDeploy: js.UndefOr[__boolean] = js.undefined,
        ClientCertificateId: js.UndefOr[Id] = js.undefined,
        CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        DefaultRouteSettings: js.UndefOr[RouteSettings] = js.undefined,
        DeploymentId: js.UndefOr[Id] = js.undefined,
        Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        LastDeploymentStatusMessage: js.UndefOr[__string] = js.undefined,
        LastUpdatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        RouteSettings: js.UndefOr[RouteSettingsMap] = js.undefined,
        StageName: js.UndefOr[StringWithLengthBetween1And128] = js.undefined,
        StageVariables: js.UndefOr[StageVariablesMap] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined
    ): UpdateStageResponse = {
      val __obj = js.Dynamic.literal()
      AccessLogSettings.foreach(__v => __obj.updateDynamic("AccessLogSettings")(__v.asInstanceOf[js.Any]))
      ApiGatewayManaged.foreach(__v => __obj.updateDynamic("ApiGatewayManaged")(__v.asInstanceOf[js.Any]))
      AutoDeploy.foreach(__v => __obj.updateDynamic("AutoDeploy")(__v.asInstanceOf[js.Any]))
      ClientCertificateId.foreach(__v => __obj.updateDynamic("ClientCertificateId")(__v.asInstanceOf[js.Any]))
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      DefaultRouteSettings.foreach(__v => __obj.updateDynamic("DefaultRouteSettings")(__v.asInstanceOf[js.Any]))
      DeploymentId.foreach(__v => __obj.updateDynamic("DeploymentId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LastDeploymentStatusMessage.foreach(__v => __obj.updateDynamic("LastDeploymentStatusMessage")(__v.asInstanceOf[js.Any]))
      LastUpdatedDate.foreach(__v => __obj.updateDynamic("LastUpdatedDate")(__v.asInstanceOf[js.Any]))
      RouteSettings.foreach(__v => __obj.updateDynamic("RouteSettings")(__v.asInstanceOf[js.Any]))
      StageName.foreach(__v => __obj.updateDynamic("StageName")(__v.asInstanceOf[js.Any]))
      StageVariables.foreach(__v => __obj.updateDynamic("StageVariables")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateStageResponse]
    }
  }

  /**
    * Updates a VPC link.
    */
  @js.native
  trait UpdateVpcLinkRequest extends js.Object {
    var VpcLinkId: __string
    var Name: js.UndefOr[StringWithLengthBetween1And128]
  }

  object UpdateVpcLinkRequest {
    @inline
    def apply(
        VpcLinkId: __string,
        Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
    ): UpdateVpcLinkRequest = {
      val __obj = js.Dynamic.literal(
        "VpcLinkId" -> VpcLinkId.asInstanceOf[js.Any]
      )

      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVpcLinkRequest]
    }
  }

  @js.native
  trait UpdateVpcLinkResponse extends js.Object {
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var Name: js.UndefOr[StringWithLengthBetween1And128]
    var SecurityGroupIds: js.UndefOr[SecurityGroupIdList]
    var SubnetIds: js.UndefOr[SubnetIdList]
    var Tags: js.UndefOr[Tags]
    var VpcLinkId: js.UndefOr[Id]
    var VpcLinkStatus: js.UndefOr[VpcLinkStatus]
    var VpcLinkStatusMessage: js.UndefOr[StringWithLengthBetween0And1024]
    var VpcLinkVersion: js.UndefOr[VpcLinkVersion]
  }

  object UpdateVpcLinkResponse {
    @inline
    def apply(
        CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined,
        SecurityGroupIds: js.UndefOr[SecurityGroupIdList] = js.undefined,
        SubnetIds: js.UndefOr[SubnetIdList] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        VpcLinkId: js.UndefOr[Id] = js.undefined,
        VpcLinkStatus: js.UndefOr[VpcLinkStatus] = js.undefined,
        VpcLinkStatusMessage: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        VpcLinkVersion: js.UndefOr[VpcLinkVersion] = js.undefined
    ): UpdateVpcLinkResponse = {
      val __obj = js.Dynamic.literal()
      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SecurityGroupIds.foreach(__v => __obj.updateDynamic("SecurityGroupIds")(__v.asInstanceOf[js.Any]))
      SubnetIds.foreach(__v => __obj.updateDynamic("SubnetIds")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VpcLinkId.foreach(__v => __obj.updateDynamic("VpcLinkId")(__v.asInstanceOf[js.Any]))
      VpcLinkStatus.foreach(__v => __obj.updateDynamic("VpcLinkStatus")(__v.asInstanceOf[js.Any]))
      VpcLinkStatusMessage.foreach(__v => __obj.updateDynamic("VpcLinkStatusMessage")(__v.asInstanceOf[js.Any]))
      VpcLinkVersion.foreach(__v => __obj.updateDynamic("VpcLinkVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVpcLinkResponse]
    }
  }

  /**
    * Represents a VPC link.
    */
  @js.native
  trait VpcLink extends js.Object {
    var Name: StringWithLengthBetween1And128
    var SecurityGroupIds: SecurityGroupIdList
    var SubnetIds: SubnetIdList
    var VpcLinkId: Id
    var CreatedDate: js.UndefOr[__timestampIso8601]
    var Tags: js.UndefOr[Tags]
    var VpcLinkStatus: js.UndefOr[VpcLinkStatus]
    var VpcLinkStatusMessage: js.UndefOr[StringWithLengthBetween0And1024]
    var VpcLinkVersion: js.UndefOr[VpcLinkVersion]
  }

  object VpcLink {
    @inline
    def apply(
        Name: StringWithLengthBetween1And128,
        SecurityGroupIds: SecurityGroupIdList,
        SubnetIds: SubnetIdList,
        VpcLinkId: Id,
        CreatedDate: js.UndefOr[__timestampIso8601] = js.undefined,
        Tags: js.UndefOr[Tags] = js.undefined,
        VpcLinkStatus: js.UndefOr[VpcLinkStatus] = js.undefined,
        VpcLinkStatusMessage: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined,
        VpcLinkVersion: js.UndefOr[VpcLinkVersion] = js.undefined
    ): VpcLink = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "SecurityGroupIds" -> SecurityGroupIds.asInstanceOf[js.Any],
        "SubnetIds" -> SubnetIds.asInstanceOf[js.Any],
        "VpcLinkId" -> VpcLinkId.asInstanceOf[js.Any]
      )

      CreatedDate.foreach(__v => __obj.updateDynamic("CreatedDate")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VpcLinkStatus.foreach(__v => __obj.updateDynamic("VpcLinkStatus")(__v.asInstanceOf[js.Any]))
      VpcLinkStatusMessage.foreach(__v => __obj.updateDynamic("VpcLinkStatusMessage")(__v.asInstanceOf[js.Any]))
      VpcLinkVersion.foreach(__v => __obj.updateDynamic("VpcLinkVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcLink]
    }
  }

  /**
    * The status of the VPC link.
    */
  @js.native
  sealed trait VpcLinkStatus extends js.Any
  object VpcLinkStatus {
    val PENDING = "PENDING".asInstanceOf[VpcLinkStatus]
    val AVAILABLE = "AVAILABLE".asInstanceOf[VpcLinkStatus]
    val DELETING = "DELETING".asInstanceOf[VpcLinkStatus]
    val FAILED = "FAILED".asInstanceOf[VpcLinkStatus]
    val INACTIVE = "INACTIVE".asInstanceOf[VpcLinkStatus]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(PENDING, AVAILABLE, DELETING, FAILED, INACTIVE))
  }

  /**
    * The version of the VPC link.
    */
  @js.native
  sealed trait VpcLinkVersion extends js.Any
  object VpcLinkVersion {
    val V2 = "V2".asInstanceOf[VpcLinkVersion]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(V2))
  }
}
