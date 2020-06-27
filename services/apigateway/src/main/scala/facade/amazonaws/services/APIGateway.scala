package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object apigateway {
  type Blob                                = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type DocumentationPartLocationStatusCode = String
  type ListOfARNs                          = js.Array[ProviderARN]
  type ListOfApiKey                        = js.Array[ApiKey]
  type ListOfApiStage                      = js.Array[ApiStage]
  type ListOfAuthorizer                    = js.Array[Authorizer]
  type ListOfBasePathMapping               = js.Array[BasePathMapping]
  type ListOfClientCertificate             = js.Array[ClientCertificate]
  type ListOfDeployment                    = js.Array[Deployment]
  type ListOfDocumentationPart             = js.Array[DocumentationPart]
  type ListOfDocumentationVersion          = js.Array[DocumentationVersion]
  type ListOfDomainName                    = js.Array[DomainName]
  type ListOfEndpointType                  = js.Array[EndpointType]
  type ListOfGatewayResponse               = js.Array[GatewayResponse]
  type ListOfLong                          = js.Array[Double]
  type ListOfModel                         = js.Array[Model]
  type ListOfPatchOperation                = js.Array[PatchOperation]
  type ListOfRequestValidator              = js.Array[RequestValidator]
  type ListOfResource                      = js.Array[Resource]
  type ListOfRestApi                       = js.Array[RestApi]
  type ListOfSdkConfigurationProperty      = js.Array[SdkConfigurationProperty]
  type ListOfSdkType                       = js.Array[SdkType]
  type ListOfStage                         = js.Array[Stage]
  type ListOfStageKeys                     = js.Array[StageKey]
  type ListOfString                        = js.Array[String]
  type ListOfUsage                         = js.Array[ListOfLong]
  type ListOfUsagePlan                     = js.Array[UsagePlan]
  type ListOfUsagePlanKey                  = js.Array[UsagePlanKey]
  type ListOfVpcLink                       = js.Array[VpcLink]
  type MapOfApiStageThrottleSettings       = js.Dictionary[ThrottleSettings]
  type MapOfIntegrationResponse            = js.Dictionary[IntegrationResponse]
  type MapOfKeyUsages                      = js.Dictionary[ListOfUsage]
  type MapOfMethod                         = js.Dictionary[Method]
  type MapOfMethodResponse                 = js.Dictionary[MethodResponse]
  type MapOfMethodSettings                 = js.Dictionary[MethodSetting]
  type MapOfMethodSnapshot                 = js.Dictionary[MethodSnapshot]
  type MapOfStringToBoolean                = js.Dictionary[NullableBoolean]
  type MapOfStringToList                   = js.Dictionary[ListOfString]
  type MapOfStringToString                 = js.Dictionary[String]
  type NullableBoolean                     = Boolean
  type NullableInteger                     = Int
  type PathToMapOfMethodSnapshot           = js.Dictionary[MapOfMethodSnapshot]
  type ProviderARN                         = String
  type StatusCode                          = String
  type Timestamp                           = js.Date

  implicit final class APIGatewayOps(private val service: APIGateway) extends AnyVal {

    @inline def createApiKeyFuture(params: CreateApiKeyRequest): Future[ApiKey] =
      service.createApiKey(params).promise().toFuture
    @inline def createAuthorizerFuture(params: CreateAuthorizerRequest): Future[Authorizer] =
      service.createAuthorizer(params).promise().toFuture
    @inline def createBasePathMappingFuture(params: CreateBasePathMappingRequest): Future[BasePathMapping] =
      service.createBasePathMapping(params).promise().toFuture
    @inline def createDeploymentFuture(params: CreateDeploymentRequest): Future[Deployment] =
      service.createDeployment(params).promise().toFuture
    @inline def createDocumentationPartFuture(params: CreateDocumentationPartRequest): Future[DocumentationPart] =
      service.createDocumentationPart(params).promise().toFuture
    @inline def createDocumentationVersionFuture(
        params: CreateDocumentationVersionRequest
    ): Future[DocumentationVersion] = service.createDocumentationVersion(params).promise().toFuture
    @inline def createDomainNameFuture(params: CreateDomainNameRequest): Future[DomainName] =
      service.createDomainName(params).promise().toFuture
    @inline def createModelFuture(params: CreateModelRequest): Future[Model] =
      service.createModel(params).promise().toFuture
    @inline def createRequestValidatorFuture(params: CreateRequestValidatorRequest): Future[RequestValidator] =
      service.createRequestValidator(params).promise().toFuture
    @inline def createResourceFuture(params: CreateResourceRequest): Future[Resource] =
      service.createResource(params).promise().toFuture
    @inline def createRestApiFuture(params: CreateRestApiRequest): Future[RestApi] =
      service.createRestApi(params).promise().toFuture
    @inline def createStageFuture(params: CreateStageRequest): Future[Stage] =
      service.createStage(params).promise().toFuture
    @inline def createUsagePlanFuture(params: CreateUsagePlanRequest): Future[UsagePlan] =
      service.createUsagePlan(params).promise().toFuture
    @inline def createUsagePlanKeyFuture(params: CreateUsagePlanKeyRequest): Future[UsagePlanKey] =
      service.createUsagePlanKey(params).promise().toFuture
    @inline def createVpcLinkFuture(params: CreateVpcLinkRequest): Future[VpcLink] =
      service.createVpcLink(params).promise().toFuture
    @inline def deleteApiKeyFuture(params: DeleteApiKeyRequest): Future[js.Object] =
      service.deleteApiKey(params).promise().toFuture
    @inline def deleteAuthorizerFuture(params: DeleteAuthorizerRequest): Future[js.Object] =
      service.deleteAuthorizer(params).promise().toFuture
    @inline def deleteBasePathMappingFuture(params: DeleteBasePathMappingRequest): Future[js.Object] =
      service.deleteBasePathMapping(params).promise().toFuture
    @inline def deleteClientCertificateFuture(params: DeleteClientCertificateRequest): Future[js.Object] =
      service.deleteClientCertificate(params).promise().toFuture
    @inline def deleteDeploymentFuture(params: DeleteDeploymentRequest): Future[js.Object] =
      service.deleteDeployment(params).promise().toFuture
    @inline def deleteDocumentationPartFuture(params: DeleteDocumentationPartRequest): Future[js.Object] =
      service.deleteDocumentationPart(params).promise().toFuture
    @inline def deleteDocumentationVersionFuture(params: DeleteDocumentationVersionRequest): Future[js.Object] =
      service.deleteDocumentationVersion(params).promise().toFuture
    @inline def deleteDomainNameFuture(params: DeleteDomainNameRequest): Future[js.Object] =
      service.deleteDomainName(params).promise().toFuture
    @inline def deleteGatewayResponseFuture(params: DeleteGatewayResponseRequest): Future[js.Object] =
      service.deleteGatewayResponse(params).promise().toFuture
    @inline def deleteIntegrationFuture(params: DeleteIntegrationRequest): Future[js.Object] =
      service.deleteIntegration(params).promise().toFuture
    @inline def deleteIntegrationResponseFuture(params: DeleteIntegrationResponseRequest): Future[js.Object] =
      service.deleteIntegrationResponse(params).promise().toFuture
    @inline def deleteMethodFuture(params: DeleteMethodRequest): Future[js.Object] =
      service.deleteMethod(params).promise().toFuture
    @inline def deleteMethodResponseFuture(params: DeleteMethodResponseRequest): Future[js.Object] =
      service.deleteMethodResponse(params).promise().toFuture
    @inline def deleteModelFuture(params: DeleteModelRequest): Future[js.Object] =
      service.deleteModel(params).promise().toFuture
    @inline def deleteRequestValidatorFuture(params: DeleteRequestValidatorRequest): Future[js.Object] =
      service.deleteRequestValidator(params).promise().toFuture
    @inline def deleteResourceFuture(params: DeleteResourceRequest): Future[js.Object] =
      service.deleteResource(params).promise().toFuture
    @inline def deleteRestApiFuture(params: DeleteRestApiRequest): Future[js.Object] =
      service.deleteRestApi(params).promise().toFuture
    @inline def deleteStageFuture(params: DeleteStageRequest): Future[js.Object] =
      service.deleteStage(params).promise().toFuture
    @inline def deleteUsagePlanFuture(params: DeleteUsagePlanRequest): Future[js.Object] =
      service.deleteUsagePlan(params).promise().toFuture
    @inline def deleteUsagePlanKeyFuture(params: DeleteUsagePlanKeyRequest): Future[js.Object] =
      service.deleteUsagePlanKey(params).promise().toFuture
    @inline def deleteVpcLinkFuture(params: DeleteVpcLinkRequest): Future[js.Object] =
      service.deleteVpcLink(params).promise().toFuture
    @inline def flushStageAuthorizersCacheFuture(params: FlushStageAuthorizersCacheRequest): Future[js.Object] =
      service.flushStageAuthorizersCache(params).promise().toFuture
    @inline def flushStageCacheFuture(params: FlushStageCacheRequest): Future[js.Object] =
      service.flushStageCache(params).promise().toFuture
    @inline def generateClientCertificateFuture(params: GenerateClientCertificateRequest): Future[ClientCertificate] =
      service.generateClientCertificate(params).promise().toFuture
    @inline def getAccountFuture(params: GetAccountRequest): Future[Account] =
      service.getAccount(params).promise().toFuture
    @inline def getApiKeyFuture(params: GetApiKeyRequest): Future[ApiKey] = service.getApiKey(params).promise().toFuture
    @inline def getApiKeysFuture(params: GetApiKeysRequest): Future[ApiKeys] =
      service.getApiKeys(params).promise().toFuture
    @inline def getAuthorizerFuture(params: GetAuthorizerRequest): Future[Authorizer] =
      service.getAuthorizer(params).promise().toFuture
    @inline def getAuthorizersFuture(params: GetAuthorizersRequest): Future[Authorizers] =
      service.getAuthorizers(params).promise().toFuture
    @inline def getBasePathMappingFuture(params: GetBasePathMappingRequest): Future[BasePathMapping] =
      service.getBasePathMapping(params).promise().toFuture
    @inline def getBasePathMappingsFuture(params: GetBasePathMappingsRequest): Future[BasePathMappings] =
      service.getBasePathMappings(params).promise().toFuture
    @inline def getClientCertificateFuture(params: GetClientCertificateRequest): Future[ClientCertificate] =
      service.getClientCertificate(params).promise().toFuture
    @inline def getClientCertificatesFuture(params: GetClientCertificatesRequest): Future[ClientCertificates] =
      service.getClientCertificates(params).promise().toFuture
    @inline def getDeploymentFuture(params: GetDeploymentRequest): Future[Deployment] =
      service.getDeployment(params).promise().toFuture
    @inline def getDeploymentsFuture(params: GetDeploymentsRequest): Future[Deployments] =
      service.getDeployments(params).promise().toFuture
    @inline def getDocumentationPartFuture(params: GetDocumentationPartRequest): Future[DocumentationPart] =
      service.getDocumentationPart(params).promise().toFuture
    @inline def getDocumentationPartsFuture(params: GetDocumentationPartsRequest): Future[DocumentationParts] =
      service.getDocumentationParts(params).promise().toFuture
    @inline def getDocumentationVersionFuture(params: GetDocumentationVersionRequest): Future[DocumentationVersion] =
      service.getDocumentationVersion(params).promise().toFuture
    @inline def getDocumentationVersionsFuture(params: GetDocumentationVersionsRequest): Future[DocumentationVersions] =
      service.getDocumentationVersions(params).promise().toFuture
    @inline def getDomainNameFuture(params: GetDomainNameRequest): Future[DomainName] =
      service.getDomainName(params).promise().toFuture
    @inline def getDomainNamesFuture(params: GetDomainNamesRequest): Future[DomainNames] =
      service.getDomainNames(params).promise().toFuture
    @inline def getExportFuture(params: GetExportRequest): Future[ExportResponse] =
      service.getExport(params).promise().toFuture
    @inline def getGatewayResponseFuture(params: GetGatewayResponseRequest): Future[GatewayResponse] =
      service.getGatewayResponse(params).promise().toFuture
    @inline def getGatewayResponsesFuture(params: GetGatewayResponsesRequest): Future[GatewayResponses] =
      service.getGatewayResponses(params).promise().toFuture
    @inline def getIntegrationFuture(params: GetIntegrationRequest): Future[Integration] =
      service.getIntegration(params).promise().toFuture
    @inline def getIntegrationResponseFuture(params: GetIntegrationResponseRequest): Future[IntegrationResponse] =
      service.getIntegrationResponse(params).promise().toFuture
    @inline def getMethodFuture(params: GetMethodRequest): Future[Method] = service.getMethod(params).promise().toFuture
    @inline def getMethodResponseFuture(params: GetMethodResponseRequest): Future[MethodResponse] =
      service.getMethodResponse(params).promise().toFuture
    @inline def getModelFuture(params: GetModelRequest): Future[Model] = service.getModel(params).promise().toFuture
    @inline def getModelTemplateFuture(params: GetModelTemplateRequest): Future[Template] =
      service.getModelTemplate(params).promise().toFuture
    @inline def getModelsFuture(params: GetModelsRequest): Future[Models] = service.getModels(params).promise().toFuture
    @inline def getRequestValidatorFuture(params: GetRequestValidatorRequest): Future[RequestValidator] =
      service.getRequestValidator(params).promise().toFuture
    @inline def getRequestValidatorsFuture(params: GetRequestValidatorsRequest): Future[RequestValidators] =
      service.getRequestValidators(params).promise().toFuture
    @inline def getResourceFuture(params: GetResourceRequest): Future[Resource] =
      service.getResource(params).promise().toFuture
    @inline def getResourcesFuture(params: GetResourcesRequest): Future[Resources] =
      service.getResources(params).promise().toFuture
    @inline def getRestApiFuture(params: GetRestApiRequest): Future[RestApi] =
      service.getRestApi(params).promise().toFuture
    @inline def getRestApisFuture(params: GetRestApisRequest): Future[RestApis] =
      service.getRestApis(params).promise().toFuture
    @inline def getSdkFuture(params: GetSdkRequest): Future[SdkResponse] = service.getSdk(params).promise().toFuture
    @inline def getSdkTypeFuture(params: GetSdkTypeRequest): Future[SdkType] =
      service.getSdkType(params).promise().toFuture
    @inline def getSdkTypesFuture(params: GetSdkTypesRequest): Future[SdkTypes] =
      service.getSdkTypes(params).promise().toFuture
    @inline def getStageFuture(params: GetStageRequest): Future[Stage]    = service.getStage(params).promise().toFuture
    @inline def getStagesFuture(params: GetStagesRequest): Future[Stages] = service.getStages(params).promise().toFuture
    @inline def getTagsFuture(params: GetTagsRequest): Future[Tags]       = service.getTags(params).promise().toFuture
    @inline def getUsageFuture(params: GetUsageRequest): Future[Usage]    = service.getUsage(params).promise().toFuture
    @inline def getUsagePlanFuture(params: GetUsagePlanRequest): Future[UsagePlan] =
      service.getUsagePlan(params).promise().toFuture
    @inline def getUsagePlanKeyFuture(params: GetUsagePlanKeyRequest): Future[UsagePlanKey] =
      service.getUsagePlanKey(params).promise().toFuture
    @inline def getUsagePlanKeysFuture(params: GetUsagePlanKeysRequest): Future[UsagePlanKeys] =
      service.getUsagePlanKeys(params).promise().toFuture
    @inline def getUsagePlansFuture(params: GetUsagePlansRequest): Future[UsagePlans] =
      service.getUsagePlans(params).promise().toFuture
    @inline def getVpcLinkFuture(params: GetVpcLinkRequest): Future[VpcLink] =
      service.getVpcLink(params).promise().toFuture
    @inline def getVpcLinksFuture(params: GetVpcLinksRequest): Future[VpcLinks] =
      service.getVpcLinks(params).promise().toFuture
    @inline def importApiKeysFuture(params: ImportApiKeysRequest): Future[ApiKeyIds] =
      service.importApiKeys(params).promise().toFuture
    @inline def importDocumentationPartsFuture(params: ImportDocumentationPartsRequest): Future[DocumentationPartIds] =
      service.importDocumentationParts(params).promise().toFuture
    @inline def importRestApiFuture(params: ImportRestApiRequest): Future[RestApi] =
      service.importRestApi(params).promise().toFuture
    @inline def putGatewayResponseFuture(params: PutGatewayResponseRequest): Future[GatewayResponse] =
      service.putGatewayResponse(params).promise().toFuture
    @inline def putIntegrationFuture(params: PutIntegrationRequest): Future[Integration] =
      service.putIntegration(params).promise().toFuture
    @inline def putIntegrationResponseFuture(params: PutIntegrationResponseRequest): Future[IntegrationResponse] =
      service.putIntegrationResponse(params).promise().toFuture
    @inline def putMethodFuture(params: PutMethodRequest): Future[Method] = service.putMethod(params).promise().toFuture
    @inline def putMethodResponseFuture(params: PutMethodResponseRequest): Future[MethodResponse] =
      service.putMethodResponse(params).promise().toFuture
    @inline def putRestApiFuture(params: PutRestApiRequest): Future[RestApi] =
      service.putRestApi(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] =
      service.tagResource(params).promise().toFuture
    @inline def testInvokeAuthorizerFuture(params: TestInvokeAuthorizerRequest): Future[TestInvokeAuthorizerResponse] =
      service.testInvokeAuthorizer(params).promise().toFuture
    @inline def testInvokeMethodFuture(params: TestInvokeMethodRequest): Future[TestInvokeMethodResponse] =
      service.testInvokeMethod(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise().toFuture
    @inline def updateAccountFuture(params: UpdateAccountRequest): Future[Account] =
      service.updateAccount(params).promise().toFuture
    @inline def updateApiKeyFuture(params: UpdateApiKeyRequest): Future[ApiKey] =
      service.updateApiKey(params).promise().toFuture
    @inline def updateAuthorizerFuture(params: UpdateAuthorizerRequest): Future[Authorizer] =
      service.updateAuthorizer(params).promise().toFuture
    @inline def updateBasePathMappingFuture(params: UpdateBasePathMappingRequest): Future[BasePathMapping] =
      service.updateBasePathMapping(params).promise().toFuture
    @inline def updateClientCertificateFuture(params: UpdateClientCertificateRequest): Future[ClientCertificate] =
      service.updateClientCertificate(params).promise().toFuture
    @inline def updateDeploymentFuture(params: UpdateDeploymentRequest): Future[Deployment] =
      service.updateDeployment(params).promise().toFuture
    @inline def updateDocumentationPartFuture(params: UpdateDocumentationPartRequest): Future[DocumentationPart] =
      service.updateDocumentationPart(params).promise().toFuture
    @inline def updateDocumentationVersionFuture(
        params: UpdateDocumentationVersionRequest
    ): Future[DocumentationVersion] = service.updateDocumentationVersion(params).promise().toFuture
    @inline def updateDomainNameFuture(params: UpdateDomainNameRequest): Future[DomainName] =
      service.updateDomainName(params).promise().toFuture
    @inline def updateGatewayResponseFuture(params: UpdateGatewayResponseRequest): Future[GatewayResponse] =
      service.updateGatewayResponse(params).promise().toFuture
    @inline def updateIntegrationFuture(params: UpdateIntegrationRequest): Future[Integration] =
      service.updateIntegration(params).promise().toFuture
    @inline def updateIntegrationResponseFuture(params: UpdateIntegrationResponseRequest): Future[IntegrationResponse] =
      service.updateIntegrationResponse(params).promise().toFuture
    @inline def updateMethodFuture(params: UpdateMethodRequest): Future[Method] =
      service.updateMethod(params).promise().toFuture
    @inline def updateMethodResponseFuture(params: UpdateMethodResponseRequest): Future[MethodResponse] =
      service.updateMethodResponse(params).promise().toFuture
    @inline def updateModelFuture(params: UpdateModelRequest): Future[Model] =
      service.updateModel(params).promise().toFuture
    @inline def updateRequestValidatorFuture(params: UpdateRequestValidatorRequest): Future[RequestValidator] =
      service.updateRequestValidator(params).promise().toFuture
    @inline def updateResourceFuture(params: UpdateResourceRequest): Future[Resource] =
      service.updateResource(params).promise().toFuture
    @inline def updateRestApiFuture(params: UpdateRestApiRequest): Future[RestApi] =
      service.updateRestApi(params).promise().toFuture
    @inline def updateStageFuture(params: UpdateStageRequest): Future[Stage] =
      service.updateStage(params).promise().toFuture
    @inline def updateUsageFuture(params: UpdateUsageRequest): Future[Usage] =
      service.updateUsage(params).promise().toFuture
    @inline def updateUsagePlanFuture(params: UpdateUsagePlanRequest): Future[UsagePlan] =
      service.updateUsagePlan(params).promise().toFuture
    @inline def updateVpcLinkFuture(params: UpdateVpcLinkRequest): Future[VpcLink] =
      service.updateVpcLink(params).promise().toFuture
  }
}

package apigateway {
  @js.native
  @JSImport("aws-sdk", "APIGateway")
  class APIGateway() extends js.Object {
    def this(config: AWSConfig) = this()

    def createApiKey(params: CreateApiKeyRequest): Request[ApiKey]                                           = js.native
    def createAuthorizer(params: CreateAuthorizerRequest): Request[Authorizer]                               = js.native
    def createBasePathMapping(params: CreateBasePathMappingRequest): Request[BasePathMapping]                = js.native
    def createDeployment(params: CreateDeploymentRequest): Request[Deployment]                               = js.native
    def createDocumentationPart(params: CreateDocumentationPartRequest): Request[DocumentationPart]          = js.native
    def createDocumentationVersion(params: CreateDocumentationVersionRequest): Request[DocumentationVersion] = js.native
    def createDomainName(params: CreateDomainNameRequest): Request[DomainName]                               = js.native
    def createModel(params: CreateModelRequest): Request[Model]                                              = js.native
    def createRequestValidator(params: CreateRequestValidatorRequest): Request[RequestValidator]             = js.native
    def createResource(params: CreateResourceRequest): Request[Resource]                                     = js.native
    def createRestApi(params: CreateRestApiRequest): Request[RestApi]                                        = js.native
    def createStage(params: CreateStageRequest): Request[Stage]                                              = js.native
    def createUsagePlan(params: CreateUsagePlanRequest): Request[UsagePlan]                                  = js.native
    def createUsagePlanKey(params: CreateUsagePlanKeyRequest): Request[UsagePlanKey]                         = js.native
    def createVpcLink(params: CreateVpcLinkRequest): Request[VpcLink]                                        = js.native
    def deleteApiKey(params: DeleteApiKeyRequest): Request[js.Object]                                        = js.native
    def deleteAuthorizer(params: DeleteAuthorizerRequest): Request[js.Object]                                = js.native
    def deleteBasePathMapping(params: DeleteBasePathMappingRequest): Request[js.Object]                      = js.native
    def deleteClientCertificate(params: DeleteClientCertificateRequest): Request[js.Object]                  = js.native
    def deleteDeployment(params: DeleteDeploymentRequest): Request[js.Object]                                = js.native
    def deleteDocumentationPart(params: DeleteDocumentationPartRequest): Request[js.Object]                  = js.native
    def deleteDocumentationVersion(params: DeleteDocumentationVersionRequest): Request[js.Object]            = js.native
    def deleteDomainName(params: DeleteDomainNameRequest): Request[js.Object]                                = js.native
    def deleteGatewayResponse(params: DeleteGatewayResponseRequest): Request[js.Object]                      = js.native
    def deleteIntegration(params: DeleteIntegrationRequest): Request[js.Object]                              = js.native
    def deleteIntegrationResponse(params: DeleteIntegrationResponseRequest): Request[js.Object]              = js.native
    def deleteMethod(params: DeleteMethodRequest): Request[js.Object]                                        = js.native
    def deleteMethodResponse(params: DeleteMethodResponseRequest): Request[js.Object]                        = js.native
    def deleteModel(params: DeleteModelRequest): Request[js.Object]                                          = js.native
    def deleteRequestValidator(params: DeleteRequestValidatorRequest): Request[js.Object]                    = js.native
    def deleteResource(params: DeleteResourceRequest): Request[js.Object]                                    = js.native
    def deleteRestApi(params: DeleteRestApiRequest): Request[js.Object]                                      = js.native
    def deleteStage(params: DeleteStageRequest): Request[js.Object]                                          = js.native
    def deleteUsagePlan(params: DeleteUsagePlanRequest): Request[js.Object]                                  = js.native
    def deleteUsagePlanKey(params: DeleteUsagePlanKeyRequest): Request[js.Object]                            = js.native
    def deleteVpcLink(params: DeleteVpcLinkRequest): Request[js.Object]                                      = js.native
    def flushStageAuthorizersCache(params: FlushStageAuthorizersCacheRequest): Request[js.Object]            = js.native
    def flushStageCache(params: FlushStageCacheRequest): Request[js.Object]                                  = js.native
    def generateClientCertificate(params: GenerateClientCertificateRequest): Request[ClientCertificate]      = js.native
    def getAccount(params: GetAccountRequest): Request[Account]                                              = js.native
    def getApiKey(params: GetApiKeyRequest): Request[ApiKey]                                                 = js.native
    def getApiKeys(params: GetApiKeysRequest): Request[ApiKeys]                                              = js.native
    def getAuthorizer(params: GetAuthorizerRequest): Request[Authorizer]                                     = js.native
    def getAuthorizers(params: GetAuthorizersRequest): Request[Authorizers]                                  = js.native
    def getBasePathMapping(params: GetBasePathMappingRequest): Request[BasePathMapping]                      = js.native
    def getBasePathMappings(params: GetBasePathMappingsRequest): Request[BasePathMappings]                   = js.native
    def getClientCertificate(params: GetClientCertificateRequest): Request[ClientCertificate]                = js.native
    def getClientCertificates(params: GetClientCertificatesRequest): Request[ClientCertificates]             = js.native
    def getDeployment(params: GetDeploymentRequest): Request[Deployment]                                     = js.native
    def getDeployments(params: GetDeploymentsRequest): Request[Deployments]                                  = js.native
    def getDocumentationPart(params: GetDocumentationPartRequest): Request[DocumentationPart]                = js.native
    def getDocumentationParts(params: GetDocumentationPartsRequest): Request[DocumentationParts]             = js.native
    def getDocumentationVersion(params: GetDocumentationVersionRequest): Request[DocumentationVersion]       = js.native
    def getDocumentationVersions(params: GetDocumentationVersionsRequest): Request[DocumentationVersions]    = js.native
    def getDomainName(params: GetDomainNameRequest): Request[DomainName]                                     = js.native
    def getDomainNames(params: GetDomainNamesRequest): Request[DomainNames]                                  = js.native
    def getExport(params: GetExportRequest): Request[ExportResponse]                                         = js.native
    def getGatewayResponse(params: GetGatewayResponseRequest): Request[GatewayResponse]                      = js.native
    def getGatewayResponses(params: GetGatewayResponsesRequest): Request[GatewayResponses]                   = js.native
    def getIntegration(params: GetIntegrationRequest): Request[Integration]                                  = js.native
    def getIntegrationResponse(params: GetIntegrationResponseRequest): Request[IntegrationResponse]          = js.native
    def getMethod(params: GetMethodRequest): Request[Method]                                                 = js.native
    def getMethodResponse(params: GetMethodResponseRequest): Request[MethodResponse]                         = js.native
    def getModel(params: GetModelRequest): Request[Model]                                                    = js.native
    def getModelTemplate(params: GetModelTemplateRequest): Request[Template]                                 = js.native
    def getModels(params: GetModelsRequest): Request[Models]                                                 = js.native
    def getRequestValidator(params: GetRequestValidatorRequest): Request[RequestValidator]                   = js.native
    def getRequestValidators(params: GetRequestValidatorsRequest): Request[RequestValidators]                = js.native
    def getResource(params: GetResourceRequest): Request[Resource]                                           = js.native
    def getResources(params: GetResourcesRequest): Request[Resources]                                        = js.native
    def getRestApi(params: GetRestApiRequest): Request[RestApi]                                              = js.native
    def getRestApis(params: GetRestApisRequest): Request[RestApis]                                           = js.native
    def getSdk(params: GetSdkRequest): Request[SdkResponse]                                                  = js.native
    def getSdkType(params: GetSdkTypeRequest): Request[SdkType]                                              = js.native
    def getSdkTypes(params: GetSdkTypesRequest): Request[SdkTypes]                                           = js.native
    def getStage(params: GetStageRequest): Request[Stage]                                                    = js.native
    def getStages(params: GetStagesRequest): Request[Stages]                                                 = js.native
    def getTags(params: GetTagsRequest): Request[Tags]                                                       = js.native
    def getUsage(params: GetUsageRequest): Request[Usage]                                                    = js.native
    def getUsagePlan(params: GetUsagePlanRequest): Request[UsagePlan]                                        = js.native
    def getUsagePlanKey(params: GetUsagePlanKeyRequest): Request[UsagePlanKey]                               = js.native
    def getUsagePlanKeys(params: GetUsagePlanKeysRequest): Request[UsagePlanKeys]                            = js.native
    def getUsagePlans(params: GetUsagePlansRequest): Request[UsagePlans]                                     = js.native
    def getVpcLink(params: GetVpcLinkRequest): Request[VpcLink]                                              = js.native
    def getVpcLinks(params: GetVpcLinksRequest): Request[VpcLinks]                                           = js.native
    def importApiKeys(params: ImportApiKeysRequest): Request[ApiKeyIds]                                      = js.native
    def importDocumentationParts(params: ImportDocumentationPartsRequest): Request[DocumentationPartIds]     = js.native
    def importRestApi(params: ImportRestApiRequest): Request[RestApi]                                        = js.native
    def putGatewayResponse(params: PutGatewayResponseRequest): Request[GatewayResponse]                      = js.native
    def putIntegration(params: PutIntegrationRequest): Request[Integration]                                  = js.native
    def putIntegrationResponse(params: PutIntegrationResponseRequest): Request[IntegrationResponse]          = js.native
    def putMethod(params: PutMethodRequest): Request[Method]                                                 = js.native
    def putMethodResponse(params: PutMethodResponseRequest): Request[MethodResponse]                         = js.native
    def putRestApi(params: PutRestApiRequest): Request[RestApi]                                              = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object]                                          = js.native
    def testInvokeAuthorizer(params: TestInvokeAuthorizerRequest): Request[TestInvokeAuthorizerResponse]     = js.native
    def testInvokeMethod(params: TestInvokeMethodRequest): Request[TestInvokeMethodResponse]                 = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object]                                      = js.native
    def updateAccount(params: UpdateAccountRequest): Request[Account]                                        = js.native
    def updateApiKey(params: UpdateApiKeyRequest): Request[ApiKey]                                           = js.native
    def updateAuthorizer(params: UpdateAuthorizerRequest): Request[Authorizer]                               = js.native
    def updateBasePathMapping(params: UpdateBasePathMappingRequest): Request[BasePathMapping]                = js.native
    def updateClientCertificate(params: UpdateClientCertificateRequest): Request[ClientCertificate]          = js.native
    def updateDeployment(params: UpdateDeploymentRequest): Request[Deployment]                               = js.native
    def updateDocumentationPart(params: UpdateDocumentationPartRequest): Request[DocumentationPart]          = js.native
    def updateDocumentationVersion(params: UpdateDocumentationVersionRequest): Request[DocumentationVersion] = js.native
    def updateDomainName(params: UpdateDomainNameRequest): Request[DomainName]                               = js.native
    def updateGatewayResponse(params: UpdateGatewayResponseRequest): Request[GatewayResponse]                = js.native
    def updateIntegration(params: UpdateIntegrationRequest): Request[Integration]                            = js.native
    def updateIntegrationResponse(params: UpdateIntegrationResponseRequest): Request[IntegrationResponse]    = js.native
    def updateMethod(params: UpdateMethodRequest): Request[Method]                                           = js.native
    def updateMethodResponse(params: UpdateMethodResponseRequest): Request[MethodResponse]                   = js.native
    def updateModel(params: UpdateModelRequest): Request[Model]                                              = js.native
    def updateRequestValidator(params: UpdateRequestValidatorRequest): Request[RequestValidator]             = js.native
    def updateResource(params: UpdateResourceRequest): Request[Resource]                                     = js.native
    def updateRestApi(params: UpdateRestApiRequest): Request[RestApi]                                        = js.native
    def updateStage(params: UpdateStageRequest): Request[Stage]                                              = js.native
    def updateUsage(params: UpdateUsageRequest): Request[Usage]                                              = js.native
    def updateUsagePlan(params: UpdateUsagePlanRequest): Request[UsagePlan]                                  = js.native
    def updateVpcLink(params: UpdateVpcLinkRequest): Request[VpcLink]                                        = js.native
  }

  /**
    * Access log settings, including the access log format and access log destination ARN.
    */
  @js.native
  @Factory
  trait AccessLogSettings extends js.Object {
    var destinationArn: js.UndefOr[String]
    var format: js.UndefOr[String]
  }

  /**
    * Represents an AWS account that is associated with API Gateway.
    *  <div class="remarks"> To view the account info, call <code>GET</code> on this resource.
    *
    * =Error Codes=
    *  The following exception may be thrown when the request fails.
    * * UnauthorizedException
    *  * NotFoundException
    *  * TooManyRequestsException
    * For detailed error code information, including the corresponding HTTP Status Codes, see [[https://docs.aws.amazon.com/apigateway/api-reference/handling-errors/#api-error-codes|API Gateway Error Codes]]
    *
    * =Example: Get the information about an account.=
    *
    * ==Request==
    *  {{{GET /account HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com X-Amz-Date: 20160531T184618Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash} }}}
    * ==Response==
    *  The successful response returns a <code>200 OK</code> status code and a payload similar to the following:
    *  {{{{ "_links": { "curies": { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/account-apigateway-{rel}.html", "name": "account", "templated": true }, "self": { "href": "/account" }, "account:update": { "href": "/account" } }, "cloudwatchRoleArn": "arn:aws:iam::123456789012:role/apigAwsProxyRole", "throttleSettings": { "rateLimit": 500, "burstLimit": 1000 } } }}} In addition to making the REST API call directly, you can use the AWS CLI and an AWS SDK to access this resource.
    *  </div>
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-limits.html|API Gateway Limits]] [[https://docs.aws.amazon.com/apigateway/latest/developerguide/welcome.html|Developer Guide]], [[https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-account.html|AWS CLI]]
    */
  @js.native
  @Factory
  trait Account extends js.Object {
    var apiKeyVersion: js.UndefOr[String]
    var cloudwatchRoleArn: js.UndefOr[String]
    var features: js.UndefOr[ListOfString]
    var throttleSettings: js.UndefOr[ThrottleSettings]
  }

  /**
    * A resource that can be distributed to callers for executing <a>Method</a> resources that require an API key. API keys can be mapped to any <a>Stage</a> on any <a>RestApi</a>, which indicates that the callers with the API key can make requests to that stage.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-api-keys.html|Use API Keys]]
    */
  @js.native
  @Factory
  trait ApiKey extends js.Object {
    var createdDate: js.UndefOr[Timestamp]
    var customerId: js.UndefOr[String]
    var description: js.UndefOr[String]
    var enabled: js.UndefOr[Boolean]
    var id: js.UndefOr[String]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var name: js.UndefOr[String]
    var stageKeys: js.UndefOr[ListOfString]
    var tags: js.UndefOr[MapOfStringToString]
    var value: js.UndefOr[String]
  }

  /**
    * The identifier of an <a>ApiKey</a> used in a <a>UsagePlan</a>.
    */
  @js.native
  @Factory
  trait ApiKeyIds extends js.Object {
    var ids: js.UndefOr[ListOfString]
    var warnings: js.UndefOr[ListOfString]
  }

  @js.native
  sealed trait ApiKeySourceType extends js.Any
  object ApiKeySourceType extends js.Object {
    val HEADER     = "HEADER".asInstanceOf[ApiKeySourceType]
    val AUTHORIZER = "AUTHORIZER".asInstanceOf[ApiKeySourceType]

    val values = js.Object.freeze(js.Array(HEADER, AUTHORIZER))
  }

  /**
    * Represents a collection of API keys as represented by an <a>ApiKeys</a> resource.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-api-keys.html|Use API Keys]]
    */
  @js.native
  @Factory
  trait ApiKeys extends js.Object {
    var items: js.UndefOr[ListOfApiKey]
    var position: js.UndefOr[String]
    var warnings: js.UndefOr[ListOfString]
  }

  @js.native
  sealed trait ApiKeysFormat extends js.Any
  object ApiKeysFormat extends js.Object {
    val csv = "csv".asInstanceOf[ApiKeysFormat]

    val values = js.Object.freeze(js.Array(csv))
  }

  /**
    * API stage name of the associated API stage in a usage plan.
    */
  @js.native
  @Factory
  trait ApiStage extends js.Object {
    var apiId: js.UndefOr[String]
    var stage: js.UndefOr[String]
    var throttle: js.UndefOr[MapOfApiStageThrottleSettings]
  }

  /**
    * Represents an authorization layer for methods. If enabled on a method, API Gateway will activate the authorizer when a client calls the method.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-use-lambda-authorizer.html|Use Lambda Function as Authorizer]] [[https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-integrate-with-cognito.html|Use Cognito User Pool as Authorizer]]
    */
  @js.native
  @Factory
  trait Authorizer extends js.Object {
    var authType: js.UndefOr[String]
    var authorizerCredentials: js.UndefOr[String]
    var authorizerResultTtlInSeconds: js.UndefOr[NullableInteger]
    var authorizerUri: js.UndefOr[String]
    var id: js.UndefOr[String]
    var identitySource: js.UndefOr[String]
    var identityValidationExpression: js.UndefOr[String]
    var name: js.UndefOr[String]
    var providerARNs: js.UndefOr[ListOfARNs]
    var `type`: js.UndefOr[AuthorizerType]
  }

  /**
    * The authorizer type. Valid values are <code>TOKEN</code> for a Lambda function using a single authorization token submitted in a custom header, <code>REQUEST</code> for a Lambda function using incoming request parameters, and <code>COGNITO_USER_POOLS</code> for using an Amazon Cognito user pool.
    */
  @js.native
  sealed trait AuthorizerType extends js.Any
  object AuthorizerType extends js.Object {
    val TOKEN              = "TOKEN".asInstanceOf[AuthorizerType]
    val REQUEST            = "REQUEST".asInstanceOf[AuthorizerType]
    val COGNITO_USER_POOLS = "COGNITO_USER_POOLS".asInstanceOf[AuthorizerType]

    val values = js.Object.freeze(js.Array(TOKEN, REQUEST, COGNITO_USER_POOLS))
  }

  /**
    * Represents a collection of <a>Authorizer</a> resources.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-use-lambda-authorizer.html|Use Lambda Function as Authorizer]] [[https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-integrate-with-cognito.html|Use Cognito User Pool as Authorizer]]
    */
  @js.native
  @Factory
  trait Authorizers extends js.Object {
    var items: js.UndefOr[ListOfAuthorizer]
    var position: js.UndefOr[String]
  }

  /**
    * Represents the base path that callers of the API must provide as part of the URL after the domain name.
    *  <div class="remarks">A custom domain name plus a <code>BasePathMapping</code> specification identifies a deployed <a>RestApi</a> in a given stage of the owner <a>Account</a>.</div>
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-custom-domains.html|Use Custom Domain Names]]
    */
  @js.native
  @Factory
  trait BasePathMapping extends js.Object {
    var basePath: js.UndefOr[String]
    var restApiId: js.UndefOr[String]
    var stage: js.UndefOr[String]
  }

  /**
    * Represents a collection of <a>BasePathMapping</a> resources.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-custom-domains.html|Use Custom Domain Names]]
    */
  @js.native
  @Factory
  trait BasePathMappings extends js.Object {
    var items: js.UndefOr[ListOfBasePathMapping]
    var position: js.UndefOr[String]
  }

  /**
    * Returns the size of the ```CacheCluster```.
    */
  @js.native
  sealed trait CacheClusterSize extends js.Any
  object CacheClusterSize extends js.Object {
    val `0.5`  = "0.5".asInstanceOf[CacheClusterSize]
    val `1.6`  = "1.6".asInstanceOf[CacheClusterSize]
    val `6.1`  = "6.1".asInstanceOf[CacheClusterSize]
    val `13.5` = "13.5".asInstanceOf[CacheClusterSize]
    val `28.4` = "28.4".asInstanceOf[CacheClusterSize]
    val `58.2` = "58.2".asInstanceOf[CacheClusterSize]
    val `118`  = "118".asInstanceOf[CacheClusterSize]
    val `237`  = "237".asInstanceOf[CacheClusterSize]

    val values = js.Object.freeze(js.Array(`0.5`, `1.6`, `6.1`, `13.5`, `28.4`, `58.2`, `118`, `237`))
  }

  /**
    * Returns the status of the ```CacheCluster```.
    */
  @js.native
  sealed trait CacheClusterStatus extends js.Any
  object CacheClusterStatus extends js.Object {
    val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS".asInstanceOf[CacheClusterStatus]
    val AVAILABLE          = "AVAILABLE".asInstanceOf[CacheClusterStatus]
    val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS".asInstanceOf[CacheClusterStatus]
    val NOT_AVAILABLE      = "NOT_AVAILABLE".asInstanceOf[CacheClusterStatus]
    val FLUSH_IN_PROGRESS  = "FLUSH_IN_PROGRESS".asInstanceOf[CacheClusterStatus]

    val values =
      js.Object.freeze(js.Array(CREATE_IN_PROGRESS, AVAILABLE, DELETE_IN_PROGRESS, NOT_AVAILABLE, FLUSH_IN_PROGRESS))
  }

  /**
    * Configuration settings of a canary deployment.
    */
  @js.native
  @Factory
  trait CanarySettings extends js.Object {
    var deploymentId: js.UndefOr[String]
    var percentTraffic: js.UndefOr[Double]
    var stageVariableOverrides: js.UndefOr[MapOfStringToString]
    var useStageCache: js.UndefOr[Boolean]
  }

  /**
    * Represents a client certificate used to configure client-side SSL authentication while sending requests to the integration endpoint.
    *  <div class="remarks">Client certificates are used to authenticate an API by the backend server. To authenticate an API client (or user), use IAM roles and policies, a custom <a>Authorizer</a> or an Amazon Cognito user pool.</div>
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/getting-started-client-side-ssl-authentication.html|Use Client-Side Certificate]]
    */
  @js.native
  @Factory
  trait ClientCertificate extends js.Object {
    var clientCertificateId: js.UndefOr[String]
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[String]
    var expirationDate: js.UndefOr[Timestamp]
    var pemEncodedCertificate: js.UndefOr[String]
    var tags: js.UndefOr[MapOfStringToString]
  }

  /**
    * Represents a collection of <a>ClientCertificate</a> resources.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/getting-started-client-side-ssl-authentication.html|Use Client-Side Certificate]]
    */
  @js.native
  @Factory
  trait ClientCertificates extends js.Object {
    var items: js.UndefOr[ListOfClientCertificate]
    var position: js.UndefOr[String]
  }

  @js.native
  sealed trait ConnectionType extends js.Any
  object ConnectionType extends js.Object {
    val INTERNET = "INTERNET".asInstanceOf[ConnectionType]
    val VPC_LINK = "VPC_LINK".asInstanceOf[ConnectionType]

    val values = js.Object.freeze(js.Array(INTERNET, VPC_LINK))
  }

  @js.native
  sealed trait ContentHandlingStrategy extends js.Any
  object ContentHandlingStrategy extends js.Object {
    val CONVERT_TO_BINARY = "CONVERT_TO_BINARY".asInstanceOf[ContentHandlingStrategy]
    val CONVERT_TO_TEXT   = "CONVERT_TO_TEXT".asInstanceOf[ContentHandlingStrategy]

    val values = js.Object.freeze(js.Array(CONVERT_TO_BINARY, CONVERT_TO_TEXT))
  }

  /**
    * Request to create an <a>ApiKey</a> resource.
    */
  @js.native
  @Factory
  trait CreateApiKeyRequest extends js.Object {
    var customerId: js.UndefOr[String]
    var description: js.UndefOr[String]
    var enabled: js.UndefOr[Boolean]
    var generateDistinctId: js.UndefOr[Boolean]
    var name: js.UndefOr[String]
    var stageKeys: js.UndefOr[ListOfStageKeys]
    var tags: js.UndefOr[MapOfStringToString]
    var value: js.UndefOr[String]
  }

  /**
    * Request to add a new <a>Authorizer</a> to an existing <a>RestApi</a> resource.
    */
  @js.native
  @Factory
  trait CreateAuthorizerRequest extends js.Object {
    var name: String
    var restApiId: String
    var `type`: AuthorizerType
    var authType: js.UndefOr[String]
    var authorizerCredentials: js.UndefOr[String]
    var authorizerResultTtlInSeconds: js.UndefOr[NullableInteger]
    var authorizerUri: js.UndefOr[String]
    var identitySource: js.UndefOr[String]
    var identityValidationExpression: js.UndefOr[String]
    var providerARNs: js.UndefOr[ListOfARNs]
  }

  /**
    * Requests API Gateway to create a new <a>BasePathMapping</a> resource.
    */
  @js.native
  @Factory
  trait CreateBasePathMappingRequest extends js.Object {
    var domainName: String
    var restApiId: String
    var basePath: js.UndefOr[String]
    var stage: js.UndefOr[String]
  }

  /**
    * Requests API Gateway to create a <a>Deployment</a> resource.
    */
  @js.native
  @Factory
  trait CreateDeploymentRequest extends js.Object {
    var restApiId: String
    var cacheClusterEnabled: js.UndefOr[NullableBoolean]
    var cacheClusterSize: js.UndefOr[CacheClusterSize]
    var canarySettings: js.UndefOr[DeploymentCanarySettings]
    var description: js.UndefOr[String]
    var stageDescription: js.UndefOr[String]
    var stageName: js.UndefOr[String]
    var tracingEnabled: js.UndefOr[NullableBoolean]
    var variables: js.UndefOr[MapOfStringToString]
  }

  /**
    * Creates a new documentation part of a given API.
    */
  @js.native
  @Factory
  trait CreateDocumentationPartRequest extends js.Object {
    var location: DocumentationPartLocation
    var properties: String
    var restApiId: String
  }

  /**
    * Creates a new documentation version of a given API.
    */
  @js.native
  @Factory
  trait CreateDocumentationVersionRequest extends js.Object {
    var documentationVersion: String
    var restApiId: String
    var description: js.UndefOr[String]
    var stageName: js.UndefOr[String]
  }

  /**
    * A request to create a new domain name.
    */
  @js.native
  @Factory
  trait CreateDomainNameRequest extends js.Object {
    var domainName: String
    var certificateArn: js.UndefOr[String]
    var certificateBody: js.UndefOr[String]
    var certificateChain: js.UndefOr[String]
    var certificateName: js.UndefOr[String]
    var certificatePrivateKey: js.UndefOr[String]
    var endpointConfiguration: js.UndefOr[EndpointConfiguration]
    var regionalCertificateArn: js.UndefOr[String]
    var regionalCertificateName: js.UndefOr[String]
    var securityPolicy: js.UndefOr[SecurityPolicy]
    var tags: js.UndefOr[MapOfStringToString]
  }

  /**
    * Request to add a new <a>Model</a> to an existing <a>RestApi</a> resource.
    */
  @js.native
  @Factory
  trait CreateModelRequest extends js.Object {
    var contentType: String
    var name: String
    var restApiId: String
    var description: js.UndefOr[String]
    var schema: js.UndefOr[String]
  }

  /**
    * Creates a <a>RequestValidator</a> of a given <a>RestApi</a>.
    */
  @js.native
  @Factory
  trait CreateRequestValidatorRequest extends js.Object {
    var restApiId: String
    var name: js.UndefOr[String]
    var validateRequestBody: js.UndefOr[Boolean]
    var validateRequestParameters: js.UndefOr[Boolean]
  }

  /**
    * Requests API Gateway to create a <a>Resource</a> resource.
    */
  @js.native
  @Factory
  trait CreateResourceRequest extends js.Object {
    var parentId: String
    var pathPart: String
    var restApiId: String
  }

  /**
    * The POST Request to add a new <a>RestApi</a> resource to your collection.
    */
  @js.native
  @Factory
  trait CreateRestApiRequest extends js.Object {
    var name: String
    var apiKeySource: js.UndefOr[ApiKeySourceType]
    var binaryMediaTypes: js.UndefOr[ListOfString]
    var cloneFrom: js.UndefOr[String]
    var description: js.UndefOr[String]
    var endpointConfiguration: js.UndefOr[EndpointConfiguration]
    var minimumCompressionSize: js.UndefOr[NullableInteger]
    var policy: js.UndefOr[String]
    var tags: js.UndefOr[MapOfStringToString]
    var version: js.UndefOr[String]
  }

  /**
    * Requests API Gateway to create a <a>Stage</a> resource.
    */
  @js.native
  @Factory
  trait CreateStageRequest extends js.Object {
    var deploymentId: String
    var restApiId: String
    var stageName: String
    var cacheClusterEnabled: js.UndefOr[Boolean]
    var cacheClusterSize: js.UndefOr[CacheClusterSize]
    var canarySettings: js.UndefOr[CanarySettings]
    var description: js.UndefOr[String]
    var documentationVersion: js.UndefOr[String]
    var tags: js.UndefOr[MapOfStringToString]
    var tracingEnabled: js.UndefOr[Boolean]
    var variables: js.UndefOr[MapOfStringToString]
  }

  /**
    * The POST request to create a usage plan key for adding an existing API key to a usage plan.
    */
  @js.native
  @Factory
  trait CreateUsagePlanKeyRequest extends js.Object {
    var keyId: String
    var keyType: String
    var usagePlanId: String
  }

  /**
    * The POST request to create a usage plan with the name, description, throttle limits and quota limits, as well as the associated API stages, specified in the payload.
    */
  @js.native
  @Factory
  trait CreateUsagePlanRequest extends js.Object {
    var name: String
    var apiStages: js.UndefOr[ListOfApiStage]
    var description: js.UndefOr[String]
    var quota: js.UndefOr[QuotaSettings]
    var tags: js.UndefOr[MapOfStringToString]
    var throttle: js.UndefOr[ThrottleSettings]
  }

  /**
    * Creates a VPC link, under the caller's account in a selected region, in an asynchronous operation that typically takes 2-4 minutes to complete and become operational. The caller must have permissions to create and update VPC Endpoint services.
    */
  @js.native
  @Factory
  trait CreateVpcLinkRequest extends js.Object {
    var name: String
    var targetArns: ListOfString
    var description: js.UndefOr[String]
    var tags: js.UndefOr[MapOfStringToString]
  }

  /**
    * A request to delete the <a>ApiKey</a> resource.
    */
  @js.native
  @Factory
  trait DeleteApiKeyRequest extends js.Object {
    var apiKey: String
  }

  /**
    * Request to delete an existing <a>Authorizer</a> resource.
    */
  @js.native
  @Factory
  trait DeleteAuthorizerRequest extends js.Object {
    var authorizerId: String
    var restApiId: String
  }

  /**
    * A request to delete the <a>BasePathMapping</a> resource.
    */
  @js.native
  @Factory
  trait DeleteBasePathMappingRequest extends js.Object {
    var basePath: String
    var domainName: String
  }

  /**
    * A request to delete the <a>ClientCertificate</a> resource.
    */
  @js.native
  @Factory
  trait DeleteClientCertificateRequest extends js.Object {
    var clientCertificateId: String
  }

  /**
    * Requests API Gateway to delete a <a>Deployment</a> resource.
    */
  @js.native
  @Factory
  trait DeleteDeploymentRequest extends js.Object {
    var deploymentId: String
    var restApiId: String
  }

  /**
    * Deletes an existing documentation part of an API.
    */
  @js.native
  @Factory
  trait DeleteDocumentationPartRequest extends js.Object {
    var documentationPartId: String
    var restApiId: String
  }

  /**
    * Deletes an existing documentation version of an API.
    */
  @js.native
  @Factory
  trait DeleteDocumentationVersionRequest extends js.Object {
    var documentationVersion: String
    var restApiId: String
  }

  /**
    * A request to delete the <a>DomainName</a> resource.
    */
  @js.native
  @Factory
  trait DeleteDomainNameRequest extends js.Object {
    var domainName: String
  }

  /**
    * Clears any customization of a <a>GatewayResponse</a> of a specified response type on the given <a>RestApi</a> and resets it with the default settings.
    */
  @js.native
  @Factory
  trait DeleteGatewayResponseRequest extends js.Object {
    var responseType: GatewayResponseType
    var restApiId: String
  }

  /**
    * Represents a delete integration request.
    */
  @js.native
  @Factory
  trait DeleteIntegrationRequest extends js.Object {
    var httpMethod: String
    var resourceId: String
    var restApiId: String
  }

  /**
    * Represents a delete integration response request.
    */
  @js.native
  @Factory
  trait DeleteIntegrationResponseRequest extends js.Object {
    var httpMethod: String
    var resourceId: String
    var restApiId: String
    var statusCode: StatusCode
  }

  /**
    * Request to delete an existing <a>Method</a> resource.
    */
  @js.native
  @Factory
  trait DeleteMethodRequest extends js.Object {
    var httpMethod: String
    var resourceId: String
    var restApiId: String
  }

  /**
    * A request to delete an existing <a>MethodResponse</a> resource.
    */
  @js.native
  @Factory
  trait DeleteMethodResponseRequest extends js.Object {
    var httpMethod: String
    var resourceId: String
    var restApiId: String
    var statusCode: StatusCode
  }

  /**
    * Request to delete an existing model in an existing <a>RestApi</a> resource.
    */
  @js.native
  @Factory
  trait DeleteModelRequest extends js.Object {
    var modelName: String
    var restApiId: String
  }

  /**
    * Deletes a specified <a>RequestValidator</a> of a given <a>RestApi</a>.
    */
  @js.native
  @Factory
  trait DeleteRequestValidatorRequest extends js.Object {
    var requestValidatorId: String
    var restApiId: String
  }

  /**
    * Request to delete a <a>Resource</a>.
    */
  @js.native
  @Factory
  trait DeleteResourceRequest extends js.Object {
    var resourceId: String
    var restApiId: String
  }

  /**
    * Request to delete the specified API from your collection.
    */
  @js.native
  @Factory
  trait DeleteRestApiRequest extends js.Object {
    var restApiId: String
  }

  /**
    * Requests API Gateway to delete a <a>Stage</a> resource.
    */
  @js.native
  @Factory
  trait DeleteStageRequest extends js.Object {
    var restApiId: String
    var stageName: String
  }

  /**
    * The DELETE request to delete a usage plan key and remove the underlying API key from the associated usage plan.
    */
  @js.native
  @Factory
  trait DeleteUsagePlanKeyRequest extends js.Object {
    var keyId: String
    var usagePlanId: String
  }

  /**
    * The DELETE request to delete a usage plan of a given plan Id.
    */
  @js.native
  @Factory
  trait DeleteUsagePlanRequest extends js.Object {
    var usagePlanId: String
  }

  /**
    * Deletes an existing <a>VpcLink</a> of a specified identifier.
    */
  @js.native
  @Factory
  trait DeleteVpcLinkRequest extends js.Object {
    var vpcLinkId: String
  }

  /**
    * An immutable representation of a <a>RestApi</a> resource that can be called by users using <a>Stages</a>. A deployment must be associated with a <a>Stage</a> for it to be callable over the Internet.
    *  <div class="remarks">To create a deployment, call <code>POST</code> on the <a>Deployments</a> resource of a <a>RestApi</a>. To view, update, or delete a deployment, call <code>GET</code>, <code>PATCH</code>, or <code>DELETE</code> on the specified deployment resource (<code>/restapis/{restapi_id}/deployments/{deployment_id}</code>).</div>
    * @see <a>RestApi</a>, <a>Deployments</a>, <a>Stage</a>, [[https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-deployment.html|AWS CLI]], [[https://aws.amazon.com/tools/|AWS SDKs]]
    */
  @js.native
  @Factory
  trait Deployment extends js.Object {
    var apiSummary: js.UndefOr[PathToMapOfMethodSnapshot]
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[String]
    var id: js.UndefOr[String]
  }

  /**
    * The input configuration for a canary deployment.
    */
  @js.native
  @Factory
  trait DeploymentCanarySettings extends js.Object {
    var percentTraffic: js.UndefOr[Double]
    var stageVariableOverrides: js.UndefOr[MapOfStringToString]
    var useStageCache: js.UndefOr[Boolean]
  }

  /**
    * Represents a collection resource that contains zero or more references to your existing deployments, and links that guide you on how to interact with your collection. The collection offers a paginated view of the contained deployments.
    *  <div class="remarks">To create a new deployment of a <a>RestApi</a>, make a <code>POST</code> request against this resource. To view, update, or delete an existing deployment, make a <code>GET</code>, <code>PATCH</code>, or <code>DELETE</code> request, respectively, on a specified <a>Deployment</a> resource.</div>
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-deploy-api.html|Deploying an API]], [[https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-deployment.html|AWS CLI]], [[https://aws.amazon.com/tools/|AWS SDKs]]
    */
  @js.native
  @Factory
  trait Deployments extends js.Object {
    var items: js.UndefOr[ListOfDeployment]
    var position: js.UndefOr[String]
  }

  /**
    * A documentation part for a targeted API entity.
    *  <div class="remarks"> A documentation part consists of a content map (<code>properties</code>) and a target (<code>location</code>). The target specifies an API entity to which the documentation content applies. The supported API entity types are <code>API</code>, <code>AUTHORIZER</code>, <code>MODEL</code>, <code>RESOURCE</code>, <code>METHOD</code>, <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>, <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>, <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>. Valid <code>location</code> fields depend on the API entity type. All valid fields are not required.
    *  The content map is a JSON string of API-specific key-value pairs. Although an API can use any shape for the content map, only the OpenAPI-compliant documentation fields will be injected into the associated API entity definition in the exported OpenAPI definition file.
    * </div>
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-documenting-api.html|Documenting an API]], <a>DocumentationParts</a>
    */
  @js.native
  @Factory
  trait DocumentationPart extends js.Object {
    var id: js.UndefOr[String]
    var location: js.UndefOr[DocumentationPartLocation]
    var properties: js.UndefOr[String]
  }

  /**
    * A collection of the imported <a>DocumentationPart</a> identifiers.
    *  <div class="remarks">This is used to return the result when documentation parts in an external (e.g., OpenAPI) file are imported into API Gateway</div>
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-documenting-api.html|Documenting an API]], [[https://docs.aws.amazon.com/apigateway/api-reference/link-relation/documentationpart-import/|documentationpart:import]], <a>DocumentationPart</a>
    */
  @js.native
  @Factory
  trait DocumentationPartIds extends js.Object {
    var ids: js.UndefOr[ListOfString]
    var warnings: js.UndefOr[ListOfString]
  }

  /**
    * Specifies the target API entity to which the documentation applies.
    */
  @js.native
  @Factory
  trait DocumentationPartLocation extends js.Object {
    var `type`: DocumentationPartType
    var method: js.UndefOr[String]
    var name: js.UndefOr[String]
    var path: js.UndefOr[String]
    var statusCode: js.UndefOr[DocumentationPartLocationStatusCode]
  }

  @js.native
  sealed trait DocumentationPartType extends js.Any
  object DocumentationPartType extends js.Object {
    val API             = "API".asInstanceOf[DocumentationPartType]
    val AUTHORIZER      = "AUTHORIZER".asInstanceOf[DocumentationPartType]
    val MODEL           = "MODEL".asInstanceOf[DocumentationPartType]
    val RESOURCE        = "RESOURCE".asInstanceOf[DocumentationPartType]
    val METHOD          = "METHOD".asInstanceOf[DocumentationPartType]
    val PATH_PARAMETER  = "PATH_PARAMETER".asInstanceOf[DocumentationPartType]
    val QUERY_PARAMETER = "QUERY_PARAMETER".asInstanceOf[DocumentationPartType]
    val REQUEST_HEADER  = "REQUEST_HEADER".asInstanceOf[DocumentationPartType]
    val REQUEST_BODY    = "REQUEST_BODY".asInstanceOf[DocumentationPartType]
    val RESPONSE        = "RESPONSE".asInstanceOf[DocumentationPartType]
    val RESPONSE_HEADER = "RESPONSE_HEADER".asInstanceOf[DocumentationPartType]
    val RESPONSE_BODY   = "RESPONSE_BODY".asInstanceOf[DocumentationPartType]

    val values = js.Object.freeze(
      js.Array(
        API,
        AUTHORIZER,
        MODEL,
        RESOURCE,
        METHOD,
        PATH_PARAMETER,
        QUERY_PARAMETER,
        REQUEST_HEADER,
        REQUEST_BODY,
        RESPONSE,
        RESPONSE_HEADER,
        RESPONSE_BODY
      )
    )
  }

  /**
    * The collection of documentation parts of an API.
    *  <div class="remarks"/>
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-documenting-api.html|Documenting an API]], <a>DocumentationPart</a>
    */
  @js.native
  @Factory
  trait DocumentationParts extends js.Object {
    var items: js.UndefOr[ListOfDocumentationPart]
    var position: js.UndefOr[String]
  }

  /**
    * A snapshot of the documentation of an API.
    *  <div class="remarks">Publishing API documentation involves creating a documentation version associated with an API stage and exporting the versioned documentation to an external (e.g., OpenAPI) file.
    * </div>
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-documenting-api.html|Documenting an API]], <a>DocumentationPart</a>, <a>DocumentationVersions</a>
    */
  @js.native
  @Factory
  trait DocumentationVersion extends js.Object {
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[String]
    var version: js.UndefOr[String]
  }

  /**
    * The collection of documentation snapshots of an API.
    *  <div class="remarks">Use the <a>DocumentationVersions</a> to manage documentation snapshots associated with various API stages.
    * </div>
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-documenting-api.html|Documenting an API]], <a>DocumentationPart</a>, <a>DocumentationVersion</a>
    */
  @js.native
  @Factory
  trait DocumentationVersions extends js.Object {
    var items: js.UndefOr[ListOfDocumentationVersion]
    var position: js.UndefOr[String]
  }

  /**
    * Represents a custom domain name as a user-friendly host name of an API (<a>RestApi</a>).
    *  <div class="Remarks"> When you deploy an API, API Gateway creates a default host name for the API. This default API host name is of the <code>{restapi-id}.execute-api.{region}.amazonaws.com</code> format. With the default host name, you can access the API's root resource with the URL of <code>https://{restapi-id}.execute-api.{region}.amazonaws.com/{stage}/</code>. When you set up a custom domain name of <code>apis.example.com</code> for this API, you can then access the same resource using the URL of the <code>https://apis.examples.com/myApi</code>, where <code>myApi</code> is the base path mapping (<a>BasePathMapping</a>) of your API under the custom domain name.
    *  </div>
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-custom-domains.html|Set a Custom Host Name for an API]]
    */
  @js.native
  @Factory
  trait DomainName extends js.Object {
    var certificateArn: js.UndefOr[String]
    var certificateName: js.UndefOr[String]
    var certificateUploadDate: js.UndefOr[Timestamp]
    var distributionDomainName: js.UndefOr[String]
    var distributionHostedZoneId: js.UndefOr[String]
    var domainName: js.UndefOr[String]
    var domainNameStatus: js.UndefOr[DomainNameStatus]
    var domainNameStatusMessage: js.UndefOr[String]
    var endpointConfiguration: js.UndefOr[EndpointConfiguration]
    var regionalCertificateArn: js.UndefOr[String]
    var regionalCertificateName: js.UndefOr[String]
    var regionalDomainName: js.UndefOr[String]
    var regionalHostedZoneId: js.UndefOr[String]
    var securityPolicy: js.UndefOr[SecurityPolicy]
    var tags: js.UndefOr[MapOfStringToString]
  }

  @js.native
  sealed trait DomainNameStatus extends js.Any
  object DomainNameStatus extends js.Object {
    val AVAILABLE = "AVAILABLE".asInstanceOf[DomainNameStatus]
    val UPDATING  = "UPDATING".asInstanceOf[DomainNameStatus]
    val PENDING   = "PENDING".asInstanceOf[DomainNameStatus]

    val values = js.Object.freeze(js.Array(AVAILABLE, UPDATING, PENDING))
  }

  /**
    * Represents a collection of <a>DomainName</a> resources.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-custom-domains.html|Use Client-Side Certificate]]
    */
  @js.native
  @Factory
  trait DomainNames extends js.Object {
    var items: js.UndefOr[ListOfDomainName]
    var position: js.UndefOr[String]
  }

  /**
    * The endpoint configuration to indicate the types of endpoints an API (<a>RestApi</a>) or its custom domain name (<a>DomainName</a>) has.
    */
  @js.native
  @Factory
  trait EndpointConfiguration extends js.Object {
    var types: js.UndefOr[ListOfEndpointType]
    var vpcEndpointIds: js.UndefOr[ListOfString]
  }

  /**
    * The endpoint type. The valid values are <code>EDGE</code> for edge-optimized API setup, most suitable for mobile applications; <code>REGIONAL</code> for regional API endpoint setup, most suitable for calling from AWS Region; and <code>PRIVATE</code> for private APIs.
    */
  @js.native
  sealed trait EndpointType extends js.Any
  object EndpointType extends js.Object {
    val REGIONAL = "REGIONAL".asInstanceOf[EndpointType]
    val EDGE     = "EDGE".asInstanceOf[EndpointType]
    val PRIVATE  = "PRIVATE".asInstanceOf[EndpointType]

    val values = js.Object.freeze(js.Array(REGIONAL, EDGE, PRIVATE))
  }

  /**
    * The binary blob response to <a>GetExport</a>, which contains the generated SDK.
    */
  @js.native
  @Factory
  trait ExportResponse extends js.Object {
    var body: js.UndefOr[Blob]
    var contentDisposition: js.UndefOr[String]
    var contentType: js.UndefOr[String]
  }

  /**
    * Request to flush authorizer cache entries on a specified stage.
    */
  @js.native
  @Factory
  trait FlushStageAuthorizersCacheRequest extends js.Object {
    var restApiId: String
    var stageName: String
  }

  /**
    * Requests API Gateway to flush a stage's cache.
    */
  @js.native
  @Factory
  trait FlushStageCacheRequest extends js.Object {
    var restApiId: String
    var stageName: String
  }

  /**
    * A gateway response of a given response type and status code, with optional response parameters and mapping templates.
    *  <div class="remarks"> For more information about valid gateway response types, see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/supported-gateway-response-types.html|Gateway Response Types Supported by API Gateway]] <div class="example">
    * =Example: Get a Gateway Response of a given response type=
    *
    * ==Request==
    *  This example shows how to get a gateway response of the <code>MISSING_AUTHENTICATION_TOKEN</code> type.
    *  {{{GET /restapis/o81lxisefl/gatewayresponses/MISSING_AUTHENTICATION_TOKEN HTTP/1.1 Host: beta-apigateway.us-east-1.amazonaws.com Content-Type: application/json X-Amz-Date: 20170503T202516Z Authorization: AWS4-HMAC-SHA256 Credential={access-key-id}/20170503/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature=1b52460e3159c1a26cff29093855d50ea141c1c5b937528fecaf60f51129697a Cache-Control: no-cache Postman-Token: 3b2a1ce9-c848-2e26-2e2f-9c2caefbed45 }}} The response type is specified as a URL path.
    *
    * ==Response==
    *  The successful operation returns the <code>200 OK</code> status code and a payload similar to the following:
    *  {{{{ "_links": { "curies": { "href": "http://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-gatewayresponse-{rel}.html", "name": "gatewayresponse", "templated": true }, "self": { "href": "/restapis/o81lxisefl/gatewayresponses/MISSING_AUTHENTICATION_TOKEN" }, "gatewayresponse:delete": { "href": "/restapis/o81lxisefl/gatewayresponses/MISSING_AUTHENTICATION_TOKEN" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/MISSING_AUTHENTICATION_TOKEN" } }, "defaultResponse": false, "responseParameters": { "gatewayresponse.header.x-request-path": "method.request.path.petId", "gatewayresponse.header.Access-Control-Allow-Origin": "&apos;a.b.c&apos;", "gatewayresponse.header.x-request-query": "method.request.querystring.q", "gatewayresponse.header.x-request-header": "method.request.header.Accept" }, "responseTemplates": { "application/json": "{n "message": context.error.messageString,n "type": "context.error.responseType",n "stage": "context.stage",n "resourcePath": "context.resourcePath",n "stageVariables.a": "stageVariables.a",n "statusCode": "&apos;404&apos;"n}" }, "responseType": "MISSING_AUTHENTICATION_TOKEN", "statusCode": "404" }}}}
    *  </div> </div>
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/customize-gateway-responses.html|Customize Gateway Responses]]
    */
  @js.native
  @Factory
  trait GatewayResponse extends js.Object {
    var defaultResponse: js.UndefOr[Boolean]
    var responseParameters: js.UndefOr[MapOfStringToString]
    var responseTemplates: js.UndefOr[MapOfStringToString]
    var responseType: js.UndefOr[GatewayResponseType]
    var statusCode: js.UndefOr[StatusCode]
  }

  @js.native
  sealed trait GatewayResponseType extends js.Any
  object GatewayResponseType extends js.Object {
    val DEFAULT_4XX                    = "DEFAULT_4XX".asInstanceOf[GatewayResponseType]
    val DEFAULT_5XX                    = "DEFAULT_5XX".asInstanceOf[GatewayResponseType]
    val RESOURCE_NOT_FOUND             = "RESOURCE_NOT_FOUND".asInstanceOf[GatewayResponseType]
    val UNAUTHORIZED                   = "UNAUTHORIZED".asInstanceOf[GatewayResponseType]
    val INVALID_API_KEY                = "INVALID_API_KEY".asInstanceOf[GatewayResponseType]
    val ACCESS_DENIED                  = "ACCESS_DENIED".asInstanceOf[GatewayResponseType]
    val AUTHORIZER_FAILURE             = "AUTHORIZER_FAILURE".asInstanceOf[GatewayResponseType]
    val AUTHORIZER_CONFIGURATION_ERROR = "AUTHORIZER_CONFIGURATION_ERROR".asInstanceOf[GatewayResponseType]
    val INVALID_SIGNATURE              = "INVALID_SIGNATURE".asInstanceOf[GatewayResponseType]
    val EXPIRED_TOKEN                  = "EXPIRED_TOKEN".asInstanceOf[GatewayResponseType]
    val MISSING_AUTHENTICATION_TOKEN   = "MISSING_AUTHENTICATION_TOKEN".asInstanceOf[GatewayResponseType]
    val INTEGRATION_FAILURE            = "INTEGRATION_FAILURE".asInstanceOf[GatewayResponseType]
    val INTEGRATION_TIMEOUT            = "INTEGRATION_TIMEOUT".asInstanceOf[GatewayResponseType]
    val API_CONFIGURATION_ERROR        = "API_CONFIGURATION_ERROR".asInstanceOf[GatewayResponseType]
    val UNSUPPORTED_MEDIA_TYPE         = "UNSUPPORTED_MEDIA_TYPE".asInstanceOf[GatewayResponseType]
    val BAD_REQUEST_PARAMETERS         = "BAD_REQUEST_PARAMETERS".asInstanceOf[GatewayResponseType]
    val BAD_REQUEST_BODY               = "BAD_REQUEST_BODY".asInstanceOf[GatewayResponseType]
    val REQUEST_TOO_LARGE              = "REQUEST_TOO_LARGE".asInstanceOf[GatewayResponseType]
    val THROTTLED                      = "THROTTLED".asInstanceOf[GatewayResponseType]
    val QUOTA_EXCEEDED                 = "QUOTA_EXCEEDED".asInstanceOf[GatewayResponseType]

    val values = js.Object.freeze(
      js.Array(
        DEFAULT_4XX,
        DEFAULT_5XX,
        RESOURCE_NOT_FOUND,
        UNAUTHORIZED,
        INVALID_API_KEY,
        ACCESS_DENIED,
        AUTHORIZER_FAILURE,
        AUTHORIZER_CONFIGURATION_ERROR,
        INVALID_SIGNATURE,
        EXPIRED_TOKEN,
        MISSING_AUTHENTICATION_TOKEN,
        INTEGRATION_FAILURE,
        INTEGRATION_TIMEOUT,
        API_CONFIGURATION_ERROR,
        UNSUPPORTED_MEDIA_TYPE,
        BAD_REQUEST_PARAMETERS,
        BAD_REQUEST_BODY,
        REQUEST_TOO_LARGE,
        THROTTLED,
        QUOTA_EXCEEDED
      )
    )
  }

  /**
    * The collection of the <a>GatewayResponse</a> instances of a <a>RestApi</a> as a <code>responseType</code>-to-<a>GatewayResponse</a> object map of key-value pairs. As such, pagination is not supported for querying this collection.
    *  <div class="remarks"> For more information about valid gateway response types, see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/supported-gateway-response-types.html|Gateway Response Types Supported by API Gateway]] <div class="example">
    * =Example: Get the collection of gateway responses of an API=
    *
    * ==Request==
    *  This example request shows how to retrieve the <a>GatewayResponses</a> collection from an API.
    *  {{{GET /restapis/o81lxisefl/gatewayresponses HTTP/1.1 Host: beta-apigateway.us-east-1.amazonaws.com Content-Type: application/json X-Amz-Date: 20170503T220604Z Authorization: AWS4-HMAC-SHA256 Credential={access-key-id}/20170503/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature=59b42fe54a76a5de8adf2c67baa6d39206f8e9ad49a1d77ccc6a5da3103a398a Cache-Control: no-cache Postman-Token: 5637af27-dc29-fc5c-9dfe-0645d52cb515 }}}
    *
    * ==Response==
    *  The successful operation returns the <code>200 OK</code> status code and a payload similar to the following:
    *  {{{{ "_links": { "curies": { "href": "http://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-gatewayresponse-{rel}.html", "name": "gatewayresponse", "templated": true }, "self": { "href": "/restapis/o81lxisefl/gatewayresponses" }, "first": { "href": "/restapis/o81lxisefl/gatewayresponses" }, "gatewayresponse:by-type": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "item": [ { "href": "/restapis/o81lxisefl/gatewayresponses/INTEGRATION_FAILURE" }, { "href": "/restapis/o81lxisefl/gatewayresponses/RESOURCE_NOT_FOUND" }, { "href": "/restapis/o81lxisefl/gatewayresponses/REQUEST_TOO_LARGE" }, { "href": "/restapis/o81lxisefl/gatewayresponses/THROTTLED" }, { "href": "/restapis/o81lxisefl/gatewayresponses/UNSUPPORTED_MEDIA_TYPE" }, { "href": "/restapis/o81lxisefl/gatewayresponses/AUTHORIZER_CONFIGURATION_ERROR" }, { "href": "/restapis/o81lxisefl/gatewayresponses/DEFAULT_5XX" }, { "href": "/restapis/o81lxisefl/gatewayresponses/DEFAULT_4XX" }, { "href": "/restapis/o81lxisefl/gatewayresponses/BAD_REQUEST_PARAMETERS" }, { "href": "/restapis/o81lxisefl/gatewayresponses/BAD_REQUEST_BODY" }, { "href": "/restapis/o81lxisefl/gatewayresponses/EXPIRED_TOKEN" }, { "href": "/restapis/o81lxisefl/gatewayresponses/ACCESS_DENIED" }, { "href": "/restapis/o81lxisefl/gatewayresponses/INVALID_API_KEY" }, { "href": "/restapis/o81lxisefl/gatewayresponses/UNAUTHORIZED" }, { "href": "/restapis/o81lxisefl/gatewayresponses/API_CONFIGURATION_ERROR" }, { "href": "/restapis/o81lxisefl/gatewayresponses/QUOTA_EXCEEDED" }, { "href": "/restapis/o81lxisefl/gatewayresponses/INTEGRATION_TIMEOUT" }, { "href": "/restapis/o81lxisefl/gatewayresponses/MISSING_AUTHENTICATION_TOKEN" }, { "href": "/restapis/o81lxisefl/gatewayresponses/INVALID_SIGNATURE" }, { "href": "/restapis/o81lxisefl/gatewayresponses/AUTHORIZER_FAILURE" } ] }, "_embedded": { "item": [ { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/INTEGRATION_FAILURE" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/INTEGRATION_FAILURE" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{"message":context.error.messageString}" }, "responseType": "INTEGRATION_FAILURE", "statusCode": "504" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/RESOURCE_NOT_FOUND" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/RESOURCE_NOT_FOUND" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{"message":context.error.messageString}" }, "responseType": "RESOURCE_NOT_FOUND", "statusCode": "404" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/REQUEST_TOO_LARGE" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/REQUEST_TOO_LARGE" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{"message":context.error.messageString}" }, "responseType": "REQUEST_TOO_LARGE", "statusCode": "413" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/THROTTLED" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/THROTTLED" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{"message":context.error.messageString}" }, "responseType": "THROTTLED", "statusCode": "429" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/UNSUPPORTED_MEDIA_TYPE" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/UNSUPPORTED_MEDIA_TYPE" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{"message":context.error.messageString}" }, "responseType": "UNSUPPORTED_MEDIA_TYPE", "statusCode": "415" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/AUTHORIZER_CONFIGURATION_ERROR" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/AUTHORIZER_CONFIGURATION_ERROR" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{"message":context.error.messageString}" }, "responseType": "AUTHORIZER_CONFIGURATION_ERROR", "statusCode": "500" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/DEFAULT_5XX" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/DEFAULT_5XX" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{"message":context.error.messageString}" }, "responseType": "DEFAULT_5XX" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/DEFAULT_4XX" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/DEFAULT_4XX" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{"message":context.error.messageString}" }, "responseType": "DEFAULT_4XX" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/BAD_REQUEST_PARAMETERS" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/BAD_REQUEST_PARAMETERS" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{"message":context.error.messageString}" }, "responseType": "BAD_REQUEST_PARAMETERS", "statusCode": "400" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/BAD_REQUEST_BODY" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/BAD_REQUEST_BODY" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{"message":context.error.messageString}" }, "responseType": "BAD_REQUEST_BODY", "statusCode": "400" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/EXPIRED_TOKEN" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/EXPIRED_TOKEN" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{"message":context.error.messageString}" }, "responseType": "EXPIRED_TOKEN", "statusCode": "403" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/ACCESS_DENIED" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/ACCESS_DENIED" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{"message":context.error.messageString}" }, "responseType": "ACCESS_DENIED", "statusCode": "403" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/INVALID_API_KEY" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/INVALID_API_KEY" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{"message":context.error.messageString}" }, "responseType": "INVALID_API_KEY", "statusCode": "403" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/UNAUTHORIZED" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/UNAUTHORIZED" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{"message":context.error.messageString}" }, "responseType": "UNAUTHORIZED", "statusCode": "401" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/API_CONFIGURATION_ERROR" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/API_CONFIGURATION_ERROR" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{"message":context.error.messageString}" }, "responseType": "API_CONFIGURATION_ERROR", "statusCode": "500" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/QUOTA_EXCEEDED" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/QUOTA_EXCEEDED" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{"message":context.error.messageString}" }, "responseType": "QUOTA_EXCEEDED", "statusCode": "429" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/INTEGRATION_TIMEOUT" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/INTEGRATION_TIMEOUT" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{"message":context.error.messageString}" }, "responseType": "INTEGRATION_TIMEOUT", "statusCode": "504" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/MISSING_AUTHENTICATION_TOKEN" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/MISSING_AUTHENTICATION_TOKEN" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{"message":context.error.messageString}" }, "responseType": "MISSING_AUTHENTICATION_TOKEN", "statusCode": "403" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/INVALID_SIGNATURE" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/INVALID_SIGNATURE" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{"message":context.error.messageString}" }, "responseType": "INVALID_SIGNATURE", "statusCode": "403" }, { "_links": { "self": { "href": "/restapis/o81lxisefl/gatewayresponses/AUTHORIZER_FAILURE" }, "gatewayresponse:put": { "href": "/restapis/o81lxisefl/gatewayresponses/{response_type}", "templated": true }, "gatewayresponse:update": { "href": "/restapis/o81lxisefl/gatewayresponses/AUTHORIZER_FAILURE" } }, "defaultResponse": true, "responseParameters": {}, "responseTemplates": { "application/json": "{"message":context.error.messageString}" }, "responseType": "AUTHORIZER_FAILURE", "statusCode": "500" } ] } }}}}
    *  </div> </div>
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/customize-gateway-responses.html|Customize Gateway Responses]]
    */
  @js.native
  @Factory
  trait GatewayResponses extends js.Object {
    var items: js.UndefOr[ListOfGatewayResponse]
    var position: js.UndefOr[String]
  }

  /**
    * A request to generate a <a>ClientCertificate</a> resource.
    */
  @js.native
  @Factory
  trait GenerateClientCertificateRequest extends js.Object {
    var description: js.UndefOr[String]
    var tags: js.UndefOr[MapOfStringToString]
  }

  /**
    * Requests API Gateway to get information about the current <a>Account</a> resource.
    */
  @js.native
  @Factory
  trait GetAccountRequest extends js.Object {}

  /**
    * A request to get information about the current <a>ApiKey</a> resource.
    */
  @js.native
  @Factory
  trait GetApiKeyRequest extends js.Object {
    var apiKey: String
    var includeValue: js.UndefOr[NullableBoolean]
  }

  /**
    * A request to get information about the current <a>ApiKeys</a> resource.
    */
  @js.native
  @Factory
  trait GetApiKeysRequest extends js.Object {
    var customerId: js.UndefOr[String]
    var includeValues: js.UndefOr[NullableBoolean]
    var limit: js.UndefOr[NullableInteger]
    var nameQuery: js.UndefOr[String]
    var position: js.UndefOr[String]
  }

  /**
    * Request to describe an existing <a>Authorizer</a> resource.
    */
  @js.native
  @Factory
  trait GetAuthorizerRequest extends js.Object {
    var authorizerId: String
    var restApiId: String
  }

  /**
    * Request to describe an existing <a>Authorizers</a> resource.
    */
  @js.native
  @Factory
  trait GetAuthorizersRequest extends js.Object {
    var restApiId: String
    var limit: js.UndefOr[NullableInteger]
    var position: js.UndefOr[String]
  }

  /**
    * Request to describe a <a>BasePathMapping</a> resource.
    */
  @js.native
  @Factory
  trait GetBasePathMappingRequest extends js.Object {
    var basePath: String
    var domainName: String
  }

  /**
    * A request to get information about a collection of <a>BasePathMapping</a> resources.
    */
  @js.native
  @Factory
  trait GetBasePathMappingsRequest extends js.Object {
    var domainName: String
    var limit: js.UndefOr[NullableInteger]
    var position: js.UndefOr[String]
  }

  /**
    * A request to get information about the current <a>ClientCertificate</a> resource.
    */
  @js.native
  @Factory
  trait GetClientCertificateRequest extends js.Object {
    var clientCertificateId: String
  }

  /**
    * A request to get information about a collection of <a>ClientCertificate</a> resources.
    */
  @js.native
  @Factory
  trait GetClientCertificatesRequest extends js.Object {
    var limit: js.UndefOr[NullableInteger]
    var position: js.UndefOr[String]
  }

  /**
    * Requests API Gateway to get information about a <a>Deployment</a> resource.
    */
  @js.native
  @Factory
  trait GetDeploymentRequest extends js.Object {
    var deploymentId: String
    var restApiId: String
    var embed: js.UndefOr[ListOfString]
  }

  /**
    * Requests API Gateway to get information about a <a>Deployments</a> collection.
    */
  @js.native
  @Factory
  trait GetDeploymentsRequest extends js.Object {
    var restApiId: String
    var limit: js.UndefOr[NullableInteger]
    var position: js.UndefOr[String]
  }

  /**
    * Gets a specified documentation part of a given API.
    */
  @js.native
  @Factory
  trait GetDocumentationPartRequest extends js.Object {
    var documentationPartId: String
    var restApiId: String
  }

  /**
    * Gets the documentation parts of an API. The result may be filtered by the type, name, or path of API entities (targets).
    */
  @js.native
  @Factory
  trait GetDocumentationPartsRequest extends js.Object {
    var restApiId: String
    var limit: js.UndefOr[NullableInteger]
    var locationStatus: js.UndefOr[LocationStatusType]
    var nameQuery: js.UndefOr[String]
    var path: js.UndefOr[String]
    var position: js.UndefOr[String]
    var `type`: js.UndefOr[DocumentationPartType]
  }

  /**
    * Gets a documentation snapshot of an API.
    */
  @js.native
  @Factory
  trait GetDocumentationVersionRequest extends js.Object {
    var documentationVersion: String
    var restApiId: String
  }

  /**
    * Gets the documentation versions of an API.
    */
  @js.native
  @Factory
  trait GetDocumentationVersionsRequest extends js.Object {
    var restApiId: String
    var limit: js.UndefOr[NullableInteger]
    var position: js.UndefOr[String]
  }

  /**
    * Request to get the name of a <a>DomainName</a> resource.
    */
  @js.native
  @Factory
  trait GetDomainNameRequest extends js.Object {
    var domainName: String
  }

  /**
    * Request to describe a collection of <a>DomainName</a> resources.
    */
  @js.native
  @Factory
  trait GetDomainNamesRequest extends js.Object {
    var limit: js.UndefOr[NullableInteger]
    var position: js.UndefOr[String]
  }

  /**
    * Request a new export of a <a>RestApi</a> for a particular <a>Stage</a>.
    */
  @js.native
  @Factory
  trait GetExportRequest extends js.Object {
    var exportType: String
    var restApiId: String
    var stageName: String
    var accepts: js.UndefOr[String]
    var parameters: js.UndefOr[MapOfStringToString]
  }

  /**
    * Gets a <a>GatewayResponse</a> of a specified response type on the given <a>RestApi</a>.
    */
  @js.native
  @Factory
  trait GetGatewayResponseRequest extends js.Object {
    var responseType: GatewayResponseType
    var restApiId: String
  }

  /**
    * Gets the <a>GatewayResponses</a> collection on the given <a>RestApi</a>. If an API developer has not added any definitions for gateway responses, the result will be the API Gateway-generated default <a>GatewayResponses</a> collection for the supported response types.
    */
  @js.native
  @Factory
  trait GetGatewayResponsesRequest extends js.Object {
    var restApiId: String
    var limit: js.UndefOr[NullableInteger]
    var position: js.UndefOr[String]
  }

  /**
    * Represents a request to get the integration configuration.
    */
  @js.native
  @Factory
  trait GetIntegrationRequest extends js.Object {
    var httpMethod: String
    var resourceId: String
    var restApiId: String
  }

  /**
    * Represents a get integration response request.
    */
  @js.native
  @Factory
  trait GetIntegrationResponseRequest extends js.Object {
    var httpMethod: String
    var resourceId: String
    var restApiId: String
    var statusCode: StatusCode
  }

  /**
    * Request to describe an existing <a>Method</a> resource.
    */
  @js.native
  @Factory
  trait GetMethodRequest extends js.Object {
    var httpMethod: String
    var resourceId: String
    var restApiId: String
  }

  /**
    * Request to describe a <a>MethodResponse</a> resource.
    */
  @js.native
  @Factory
  trait GetMethodResponseRequest extends js.Object {
    var httpMethod: String
    var resourceId: String
    var restApiId: String
    var statusCode: StatusCode
  }

  /**
    * Request to list information about a model in an existing <a>RestApi</a> resource.
    */
  @js.native
  @Factory
  trait GetModelRequest extends js.Object {
    var modelName: String
    var restApiId: String
    var flatten: js.UndefOr[Boolean]
  }

  /**
    * Request to generate a sample mapping template used to transform the payload.
    */
  @js.native
  @Factory
  trait GetModelTemplateRequest extends js.Object {
    var modelName: String
    var restApiId: String
  }

  /**
    * Request to list existing <a>Models</a> defined for a <a>RestApi</a> resource.
    */
  @js.native
  @Factory
  trait GetModelsRequest extends js.Object {
    var restApiId: String
    var limit: js.UndefOr[NullableInteger]
    var position: js.UndefOr[String]
  }

  /**
    * Gets a <a>RequestValidator</a> of a given <a>RestApi</a>.
    */
  @js.native
  @Factory
  trait GetRequestValidatorRequest extends js.Object {
    var requestValidatorId: String
    var restApiId: String
  }

  /**
    * Gets the <a>RequestValidators</a> collection of a given <a>RestApi</a>.
    */
  @js.native
  @Factory
  trait GetRequestValidatorsRequest extends js.Object {
    var restApiId: String
    var limit: js.UndefOr[NullableInteger]
    var position: js.UndefOr[String]
  }

  /**
    * Request to list information about a resource.
    */
  @js.native
  @Factory
  trait GetResourceRequest extends js.Object {
    var resourceId: String
    var restApiId: String
    var embed: js.UndefOr[ListOfString]
  }

  /**
    * Request to list information about a collection of resources.
    */
  @js.native
  @Factory
  trait GetResourcesRequest extends js.Object {
    var restApiId: String
    var embed: js.UndefOr[ListOfString]
    var limit: js.UndefOr[NullableInteger]
    var position: js.UndefOr[String]
  }

  /**
    * The GET request to list an existing <a>RestApi</a> defined for your collection.
    */
  @js.native
  @Factory
  trait GetRestApiRequest extends js.Object {
    var restApiId: String
  }

  /**
    * The GET request to list existing <a>RestApis</a> defined for your collection.
    */
  @js.native
  @Factory
  trait GetRestApisRequest extends js.Object {
    var limit: js.UndefOr[NullableInteger]
    var position: js.UndefOr[String]
  }

  /**
    * Request a new generated client SDK for a <a>RestApi</a> and <a>Stage</a>.
    */
  @js.native
  @Factory
  trait GetSdkRequest extends js.Object {
    var restApiId: String
    var sdkType: String
    var stageName: String
    var parameters: js.UndefOr[MapOfStringToString]
  }

  /**
    * Get an <a>SdkType</a> instance.
    */
  @js.native
  @Factory
  trait GetSdkTypeRequest extends js.Object {
    var id: String
  }

  /**
    * Get the <a>SdkTypes</a> collection.
    */
  @js.native
  @Factory
  trait GetSdkTypesRequest extends js.Object {
    var limit: js.UndefOr[NullableInteger]
    var position: js.UndefOr[String]
  }

  /**
    * Requests API Gateway to get information about a <a>Stage</a> resource.
    */
  @js.native
  @Factory
  trait GetStageRequest extends js.Object {
    var restApiId: String
    var stageName: String
  }

  /**
    * Requests API Gateway to get information about one or more <a>Stage</a> resources.
    */
  @js.native
  @Factory
  trait GetStagesRequest extends js.Object {
    var restApiId: String
    var deploymentId: js.UndefOr[String]
  }

  /**
    * Gets the <a>Tags</a> collection for a given resource.
    */
  @js.native
  @Factory
  trait GetTagsRequest extends js.Object {
    var resourceArn: String
    var limit: js.UndefOr[NullableInteger]
    var position: js.UndefOr[String]
  }

  /**
    * The GET request to get a usage plan key of a given key identifier.
    */
  @js.native
  @Factory
  trait GetUsagePlanKeyRequest extends js.Object {
    var keyId: String
    var usagePlanId: String
  }

  /**
    * The GET request to get all the usage plan keys representing the API keys added to a specified usage plan.
    */
  @js.native
  @Factory
  trait GetUsagePlanKeysRequest extends js.Object {
    var usagePlanId: String
    var limit: js.UndefOr[NullableInteger]
    var nameQuery: js.UndefOr[String]
    var position: js.UndefOr[String]
  }

  /**
    * The GET request to get a usage plan of a given plan identifier.
    */
  @js.native
  @Factory
  trait GetUsagePlanRequest extends js.Object {
    var usagePlanId: String
  }

  /**
    * The GET request to get all the usage plans of the caller's account.
    */
  @js.native
  @Factory
  trait GetUsagePlansRequest extends js.Object {
    var keyId: js.UndefOr[String]
    var limit: js.UndefOr[NullableInteger]
    var position: js.UndefOr[String]
  }

  /**
    * The GET request to get the usage data of a usage plan in a specified time interval.
    */
  @js.native
  @Factory
  trait GetUsageRequest extends js.Object {
    var endDate: String
    var startDate: String
    var usagePlanId: String
    var keyId: js.UndefOr[String]
    var limit: js.UndefOr[NullableInteger]
    var position: js.UndefOr[String]
  }

  /**
    * Gets a specified VPC link under the caller's account in a region.
    */
  @js.native
  @Factory
  trait GetVpcLinkRequest extends js.Object {
    var vpcLinkId: String
  }

  /**
    * Gets the <a>VpcLinks</a> collection under the caller's account in a selected region.
    */
  @js.native
  @Factory
  trait GetVpcLinksRequest extends js.Object {
    var limit: js.UndefOr[NullableInteger]
    var position: js.UndefOr[String]
  }

  /**
    * The POST request to import API keys from an external source, such as a CSV-formatted file.
    */
  @js.native
  @Factory
  trait ImportApiKeysRequest extends js.Object {
    var body: Blob
    var format: ApiKeysFormat
    var failOnWarnings: js.UndefOr[Boolean]
  }

  /**
    * Import documentation parts from an external (e.g., OpenAPI) definition file.
    */
  @js.native
  @Factory
  trait ImportDocumentationPartsRequest extends js.Object {
    var body: Blob
    var restApiId: String
    var failOnWarnings: js.UndefOr[Boolean]
    var mode: js.UndefOr[PutMode]
  }

  /**
    * A POST request to import an API to API Gateway using an input of an API definition file.
    */
  @js.native
  @Factory
  trait ImportRestApiRequest extends js.Object {
    var body: Blob
    var failOnWarnings: js.UndefOr[Boolean]
    var parameters: js.UndefOr[MapOfStringToString]
  }

  /**
    * Represents an HTTP, HTTP_PROXY, AWS, AWS_PROXY, or Mock integration.
    *  <div class="remarks">In the API Gateway console, the built-in Lambda integration is an AWS integration.</div>
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html|Creating an API]]
    */
  @js.native
  @Factory
  trait Integration extends js.Object {
    var cacheKeyParameters: js.UndefOr[ListOfString]
    var cacheNamespace: js.UndefOr[String]
    var connectionId: js.UndefOr[String]
    var connectionType: js.UndefOr[ConnectionType]
    var contentHandling: js.UndefOr[ContentHandlingStrategy]
    var credentials: js.UndefOr[String]
    var httpMethod: js.UndefOr[String]
    var integrationResponses: js.UndefOr[MapOfIntegrationResponse]
    var passthroughBehavior: js.UndefOr[String]
    var requestParameters: js.UndefOr[MapOfStringToString]
    var requestTemplates: js.UndefOr[MapOfStringToString]
    var timeoutInMillis: js.UndefOr[Int]
    var `type`: js.UndefOr[IntegrationType]
    var uri: js.UndefOr[String]
  }

  /**
    * Represents an integration response. The status code must map to an existing <a>MethodResponse</a>, and parameters and templates can be used to transform the back-end response.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html|Creating an API]]
    */
  @js.native
  @Factory
  trait IntegrationResponse extends js.Object {
    var contentHandling: js.UndefOr[ContentHandlingStrategy]
    var responseParameters: js.UndefOr[MapOfStringToString]
    var responseTemplates: js.UndefOr[MapOfStringToString]
    var selectionPattern: js.UndefOr[String]
    var statusCode: js.UndefOr[StatusCode]
  }

  /**
    * The integration type. The valid value is <code>HTTP</code> for integrating an API method with an HTTP backend; <code>AWS</code> with any AWS service endpoints; <code>MOCK</code> for testing without actually invoking the backend; <code>HTTP_PROXY</code> for integrating with the HTTP proxy integration; <code>AWS_PROXY</code> for integrating with the Lambda proxy integration.
    */
  @js.native
  sealed trait IntegrationType extends js.Any
  object IntegrationType extends js.Object {
    val HTTP       = "HTTP".asInstanceOf[IntegrationType]
    val AWS        = "AWS".asInstanceOf[IntegrationType]
    val MOCK       = "MOCK".asInstanceOf[IntegrationType]
    val HTTP_PROXY = "HTTP_PROXY".asInstanceOf[IntegrationType]
    val AWS_PROXY  = "AWS_PROXY".asInstanceOf[IntegrationType]

    val values = js.Object.freeze(js.Array(HTTP, AWS, MOCK, HTTP_PROXY, AWS_PROXY))
  }

  @js.native
  sealed trait LocationStatusType extends js.Any
  object LocationStatusType extends js.Object {
    val DOCUMENTED   = "DOCUMENTED".asInstanceOf[LocationStatusType]
    val UNDOCUMENTED = "UNDOCUMENTED".asInstanceOf[LocationStatusType]

    val values = js.Object.freeze(js.Array(DOCUMENTED, UNDOCUMENTED))
  }

  /**
    * Represents a client-facing interface by which the client calls the API to access back-end resources. A ```Method``` resource is integrated with an <a>Integration</a> resource. Both consist of a request and one or more responses. The method request takes the client input that is passed to the back end through the integration request. A method response returns the output from the back end to the client through an integration response. A method request is embodied in a ```Method``` resource, whereas an integration request is embodied in an <a>Integration</a> resource. On the other hand, a method response is represented by a <a>MethodResponse</a> resource, whereas an integration response is represented by an <a>IntegrationResponse</a> resource.
    *  <div class="remarks"> <p/>
    * =Example: Retrive the GET method on a specified resource=
    *
    * ==Request==
    *  The following example request retrieves the information about the GET method on an API resource (<code>3kzxbg5sa2</code>) of an API (<code>fugvjdxtri</code>).
    *  {{{GET /restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com X-Amz-Date: 20160603T210259Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160603/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash}}}}
    * ==Response==
    *  The successful response returns a <code>200 OK</code> status code and a payload similar to the following:
    *  {{{{ "_links": { "curies": [ { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-{rel}.html", "name": "integration", "templated": true }, { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-integration-response-{rel}.html", "name": "integrationresponse", "templated": true }, { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-method-{rel}.html", "name": "method", "templated": true }, { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-method-response-{rel}.html", "name": "methodresponse", "templated": true } ], "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET", "name": "GET", "title": "GET" }, "integration:put": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration" }, "method:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET" }, "method:integration": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration" }, "method:responses": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/200", "name": "200", "title": "200" }, "method:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET" }, "methodresponse:put": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/{status_code}", "templated": true } }, "apiKeyRequired": true, "authorizationType": "NONE", "httpMethod": "GET", "_embedded": { "method:integration": { "_links": { "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration" }, "integration:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration" }, "integration:responses": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200", "name": "200", "title": "200" }, "integration:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration" }, "integrationresponse:put": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/{status_code}", "templated": true } }, "cacheKeyParameters": [], "cacheNamespace": "3kzxbg5sa2", "credentials": "arn:aws:iam::123456789012:role/apigAwsProxyRole", "httpMethod": "POST", "passthroughBehavior": "WHEN_NO_MATCH", "requestParameters": { "integration.request.header.Content-Type": "'application/x-amz-json-1.1'" }, "requestTemplates": { "application/json": "{n}" }, "type": "AWS", "uri": "arn:aws:apigateway:us-east-1:kinesis:action/ListStreams", "_embedded": { "integration:responses": { "_links": { "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200", "name": "200", "title": "200" }, "integrationresponse:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" }, "integrationresponse:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/integration/responses/200" } }, "responseParameters": { "method.response.header.Content-Type": "'application/xml'" }, "responseTemplates": { "application/json": "util.urlDecode("%3CkinesisStreams%3E%23foreach(%24stream%20in%20%24input.path(%27%24.StreamNames%27))%3Cstream%3E%3Cname%3E%24stream%3C%2Fname%3E%3C%2Fstream%3E%23end%3C%2FkinesisStreams%3E")" }, "statusCode": "200" } } }, "method:responses": { "_links": { "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/200", "name": "200", "title": "200" }, "methodresponse:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/200" }, "methodresponse:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/200" } }, "responseModels": { "application/json": "Empty" }, "responseParameters": { "method.response.header.Content-Type": false }, "statusCode": "200" } } }}}} In the example above, the response template for the <code>200 OK</code> response maps the JSON output from the <code>ListStreams</code> action in the back end to an XML output. The mapping template is URL-encoded as <code>%3CkinesisStreams%3E%23foreach(%24stream%20in%20%24input.path(%27%24.StreamNames%27))%3Cstream%3E%3Cname%3E%24stream%3C%2Fname%3E%3C%2Fstream%3E%23end%3C%2FkinesisStreams%3E</code> and the output is decoded using the [[https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-mapping-template-reference.html#util-templat-reference|util.urlDecode()]] helper function.
    *  </div>
    * @see <a>MethodResponse</a>, <a>Integration</a>, <a>IntegrationResponse</a>, <a>Resource</a>, [[https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-method-settings.html|Set up an API's method]]
    */
  @js.native
  @Factory
  trait Method extends js.Object {
    var apiKeyRequired: js.UndefOr[NullableBoolean]
    var authorizationScopes: js.UndefOr[ListOfString]
    var authorizationType: js.UndefOr[String]
    var authorizerId: js.UndefOr[String]
    var httpMethod: js.UndefOr[String]
    var methodIntegration: js.UndefOr[Integration]
    var methodResponses: js.UndefOr[MapOfMethodResponse]
    var operationName: js.UndefOr[String]
    var requestModels: js.UndefOr[MapOfStringToString]
    var requestParameters: js.UndefOr[MapOfStringToBoolean]
    var requestValidatorId: js.UndefOr[String]
  }

  /**
    * Represents a method response of a given HTTP status code returned to the client. The method response is passed from the back end through the associated integration response that can be transformed using a mapping template.
    *  <div class="remarks"> <p/>
    * =Example: A ```MethodResponse``` instance of an API=
    *
    * ==Request==
    *  The example request retrieves a ```MethodResponse``` of the 200 status code.
    *  {{{GET /restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/200 HTTP/1.1 Content-Type: application/json Host: apigateway.us-east-1.amazonaws.com X-Amz-Date: 20160603T222952Z Authorization: AWS4-HMAC-SHA256 Credential={access_key_ID}/20160603/us-east-1/apigateway/aws4_request, SignedHeaders=content-type;host;x-amz-date, Signature={sig4_hash}}}}
    * ==Response==
    *  The successful response returns <code>200 OK</code> status and a payload as follows:
    *  {{{{ "_links": { "curies": { "href": "https://docs.aws.amazon.com/apigateway/latest/developerguide/restapi-method-response-{rel}.html", "name": "methodresponse", "templated": true }, "self": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/200", "title": "200" }, "methodresponse:delete": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/200" }, "methodresponse:update": { "href": "/restapis/fugvjdxtri/resources/3kzxbg5sa2/methods/GET/responses/200" } }, "responseModels": { "application/json": "Empty" }, "responseParameters": { "method.response.header.Content-Type": false }, "statusCode": "200" }}}} <p/> </div>
    * @see <a>Method</a>, <a>IntegrationResponse</a>, <a>Integration</a> [[https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html|Creating an API]]
    */
  @js.native
  @Factory
  trait MethodResponse extends js.Object {
    var responseModels: js.UndefOr[MapOfStringToString]
    var responseParameters: js.UndefOr[MapOfStringToBoolean]
    var statusCode: js.UndefOr[StatusCode]
  }

  /**
    * Specifies the method setting properties.
    */
  @js.native
  @Factory
  trait MethodSetting extends js.Object {
    var cacheDataEncrypted: js.UndefOr[Boolean]
    var cacheTtlInSeconds: js.UndefOr[Int]
    var cachingEnabled: js.UndefOr[Boolean]
    var dataTraceEnabled: js.UndefOr[Boolean]
    var loggingLevel: js.UndefOr[String]
    var metricsEnabled: js.UndefOr[Boolean]
    var requireAuthorizationForCacheControl: js.UndefOr[Boolean]
    var throttlingBurstLimit: js.UndefOr[Int]
    var throttlingRateLimit: js.UndefOr[Double]
    var unauthorizedCacheControlHeaderStrategy: js.UndefOr[UnauthorizedCacheControlHeaderStrategy]
  }

  /**
    * Represents a summary of a <a>Method</a> resource, given a particular date and time.
    */
  @js.native
  @Factory
  trait MethodSnapshot extends js.Object {
    var apiKeyRequired: js.UndefOr[Boolean]
    var authorizationType: js.UndefOr[String]
  }

  /**
    * Represents the data structure of a method's request or response payload.
    *  <div class="remarks"> A request model defines the data structure of the client-supplied request payload. A response model defines the data structure of the response payload returned by the back end. Although not required, models are useful for mapping payloads between the front end and back end.
    *  A model is used for generating an API's SDK, validating the input request body, and creating a skeletal mapping template.
    *  </div>
    * @see <a>Method</a>, <a>MethodResponse</a>, [[https://docs.aws.amazon.com/apigateway/latest/developerguide/models-mappings.html|Models and Mappings]]
    */
  @js.native
  @Factory
  trait Model extends js.Object {
    var contentType: js.UndefOr[String]
    var description: js.UndefOr[String]
    var id: js.UndefOr[String]
    var name: js.UndefOr[String]
    var schema: js.UndefOr[String]
  }

  /**
    * Represents a collection of <a>Model</a> resources.
    *
    * @see <a>Method</a>, <a>MethodResponse</a>, [[https://docs.aws.amazon.com/apigateway/latest/developerguide/models-mappings.html|Models and Mappings]]
    */
  @js.native
  @Factory
  trait Models extends js.Object {
    var items: js.UndefOr[ListOfModel]
    var position: js.UndefOr[String]
  }

  @js.native
  sealed trait Op extends js.Any
  object Op extends js.Object {
    val add     = "add".asInstanceOf[Op]
    val remove  = "remove".asInstanceOf[Op]
    val replace = "replace".asInstanceOf[Op]
    val move    = "move".asInstanceOf[Op]
    val copy    = "copy".asInstanceOf[Op]
    val test    = "test".asInstanceOf[Op]

    val values = js.Object.freeze(js.Array(add, remove, replace, move, copy, test))
  }

  /**
    * A single patch operation to apply to the specified resource. Please refer to http://tools.ietf.org/html/rfc6902#section-4 for an explanation of how each operation is used.
    */
  @js.native
  @Factory
  trait PatchOperation extends js.Object {
    var from: js.UndefOr[String]
    var op: js.UndefOr[Op]
    var path: js.UndefOr[String]
    var value: js.UndefOr[String]
  }

  /**
    * Creates a customization of a <a>GatewayResponse</a> of a specified response type and status code on the given <a>RestApi</a>.
    */
  @js.native
  @Factory
  trait PutGatewayResponseRequest extends js.Object {
    var responseType: GatewayResponseType
    var restApiId: String
    var responseParameters: js.UndefOr[MapOfStringToString]
    var responseTemplates: js.UndefOr[MapOfStringToString]
    var statusCode: js.UndefOr[StatusCode]
  }

  /**
    * Sets up a method's integration.
    */
  @js.native
  @Factory
  trait PutIntegrationRequest extends js.Object {
    var httpMethod: String
    var resourceId: String
    var restApiId: String
    var `type`: IntegrationType
    var cacheKeyParameters: js.UndefOr[ListOfString]
    var cacheNamespace: js.UndefOr[String]
    var connectionId: js.UndefOr[String]
    var connectionType: js.UndefOr[ConnectionType]
    var contentHandling: js.UndefOr[ContentHandlingStrategy]
    var credentials: js.UndefOr[String]
    var integrationHttpMethod: js.UndefOr[String]
    var passthroughBehavior: js.UndefOr[String]
    var requestParameters: js.UndefOr[MapOfStringToString]
    var requestTemplates: js.UndefOr[MapOfStringToString]
    var timeoutInMillis: js.UndefOr[NullableInteger]
    var uri: js.UndefOr[String]
  }

  /**
    * Represents a put integration response request.
    */
  @js.native
  @Factory
  trait PutIntegrationResponseRequest extends js.Object {
    var httpMethod: String
    var resourceId: String
    var restApiId: String
    var statusCode: StatusCode
    var contentHandling: js.UndefOr[ContentHandlingStrategy]
    var responseParameters: js.UndefOr[MapOfStringToString]
    var responseTemplates: js.UndefOr[MapOfStringToString]
    var selectionPattern: js.UndefOr[String]
  }

  /**
    * Request to add a method to an existing <a>Resource</a> resource.
    */
  @js.native
  @Factory
  trait PutMethodRequest extends js.Object {
    var authorizationType: String
    var httpMethod: String
    var resourceId: String
    var restApiId: String
    var apiKeyRequired: js.UndefOr[Boolean]
    var authorizationScopes: js.UndefOr[ListOfString]
    var authorizerId: js.UndefOr[String]
    var operationName: js.UndefOr[String]
    var requestModels: js.UndefOr[MapOfStringToString]
    var requestParameters: js.UndefOr[MapOfStringToBoolean]
    var requestValidatorId: js.UndefOr[String]
  }

  /**
    * Request to add a <a>MethodResponse</a> to an existing <a>Method</a> resource.
    */
  @js.native
  @Factory
  trait PutMethodResponseRequest extends js.Object {
    var httpMethod: String
    var resourceId: String
    var restApiId: String
    var statusCode: StatusCode
    var responseModels: js.UndefOr[MapOfStringToString]
    var responseParameters: js.UndefOr[MapOfStringToBoolean]
  }

  @js.native
  sealed trait PutMode extends js.Any
  object PutMode extends js.Object {
    val merge     = "merge".asInstanceOf[PutMode]
    val overwrite = "overwrite".asInstanceOf[PutMode]

    val values = js.Object.freeze(js.Array(merge, overwrite))
  }

  /**
    * A PUT request to update an existing API, with external API definitions specified as the request body.
    */
  @js.native
  @Factory
  trait PutRestApiRequest extends js.Object {
    var body: Blob
    var restApiId: String
    var failOnWarnings: js.UndefOr[Boolean]
    var mode: js.UndefOr[PutMode]
    var parameters: js.UndefOr[MapOfStringToString]
  }

  @js.native
  sealed trait QuotaPeriodType extends js.Any
  object QuotaPeriodType extends js.Object {
    val DAY   = "DAY".asInstanceOf[QuotaPeriodType]
    val WEEK  = "WEEK".asInstanceOf[QuotaPeriodType]
    val MONTH = "MONTH".asInstanceOf[QuotaPeriodType]

    val values = js.Object.freeze(js.Array(DAY, WEEK, MONTH))
  }

  /**
    * Quotas configured for a usage plan.
    */
  @js.native
  @Factory
  trait QuotaSettings extends js.Object {
    var limit: js.UndefOr[Int]
    var offset: js.UndefOr[Int]
    var period: js.UndefOr[QuotaPeriodType]
  }

  /**
    * A set of validation rules for incoming <a>Method</a> requests.
    *  <div class="remarks"> In OpenAPI, a <a>RequestValidator</a> of an API is defined by the [[https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-swagger-extensions.html#api-gateway-swagger-extensions-request-validators.requestValidator.html|x-amazon-apigateway-request-validators.requestValidator]] object. It the referenced using the [[https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-swagger-extensions.html#api-gateway-swagger-extensions-request-validator|x-amazon-apigateway-request-validator]] property.
    *  </div>
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-method-request-validation.html|Enable Basic Request Validation in API Gateway]]
    */
  @js.native
  @Factory
  trait RequestValidator extends js.Object {
    var id: js.UndefOr[String]
    var name: js.UndefOr[String]
    var validateRequestBody: js.UndefOr[Boolean]
    var validateRequestParameters: js.UndefOr[Boolean]
  }

  /**
    * A collection of <a>RequestValidator</a> resources of a given <a>RestApi</a>.
    *  <div class="remarks"> In OpenAPI, the <a>RequestValidators</a> of an API is defined by the [[https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-swagger-extensions.html#api-gateway-swagger-extensions-request-validators.html|x-amazon-apigateway-request-validators]] extension.
    *  </div>
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-method-request-validation.html|Enable Basic Request Validation in API Gateway]]
    */
  @js.native
  @Factory
  trait RequestValidators extends js.Object {
    var items: js.UndefOr[ListOfRequestValidator]
    var position: js.UndefOr[String]
  }

  /**
    * Represents an API resource.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html|Create an API]]
    */
  @js.native
  @Factory
  trait Resource extends js.Object {
    var id: js.UndefOr[String]
    var parentId: js.UndefOr[String]
    var path: js.UndefOr[String]
    var pathPart: js.UndefOr[String]
    var resourceMethods: js.UndefOr[MapOfMethod]
  }

  /**
    * Represents a collection of <a>Resource</a> resources.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html|Create an API]]
    */
  @js.native
  @Factory
  trait Resources extends js.Object {
    var items: js.UndefOr[ListOfResource]
    var position: js.UndefOr[String]
  }

  /**
    * Represents a REST API.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html|Create an API]]
    */
  @js.native
  @Factory
  trait RestApi extends js.Object {
    var apiKeySource: js.UndefOr[ApiKeySourceType]
    var binaryMediaTypes: js.UndefOr[ListOfString]
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[String]
    var endpointConfiguration: js.UndefOr[EndpointConfiguration]
    var id: js.UndefOr[String]
    var minimumCompressionSize: js.UndefOr[NullableInteger]
    var name: js.UndefOr[String]
    var policy: js.UndefOr[String]
    var tags: js.UndefOr[MapOfStringToString]
    var version: js.UndefOr[String]
    var warnings: js.UndefOr[ListOfString]
  }

  /**
    * Contains references to your APIs and links that guide you in how to interact with your collection. A collection offers a paginated view of your APIs.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html|Create an API]]
    */
  @js.native
  @Factory
  trait RestApis extends js.Object {
    var items: js.UndefOr[ListOfRestApi]
    var position: js.UndefOr[String]
  }

  /**
    * A configuration property of an SDK type.
    */
  @js.native
  @Factory
  trait SdkConfigurationProperty extends js.Object {
    var defaultValue: js.UndefOr[String]
    var description: js.UndefOr[String]
    var friendlyName: js.UndefOr[String]
    var name: js.UndefOr[String]
    var required: js.UndefOr[Boolean]
  }

  /**
    * The binary blob response to <a>GetSdk</a>, which contains the generated SDK.
    */
  @js.native
  @Factory
  trait SdkResponse extends js.Object {
    var body: js.UndefOr[Blob]
    var contentDisposition: js.UndefOr[String]
    var contentType: js.UndefOr[String]
  }

  /**
    * A type of SDK that API Gateway can generate.
    */
  @js.native
  @Factory
  trait SdkType extends js.Object {
    var configurationProperties: js.UndefOr[ListOfSdkConfigurationProperty]
    var description: js.UndefOr[String]
    var friendlyName: js.UndefOr[String]
    var id: js.UndefOr[String]
  }

  /**
    * The collection of <a>SdkType</a> instances.
    */
  @js.native
  @Factory
  trait SdkTypes extends js.Object {
    var items: js.UndefOr[ListOfSdkType]
    var position: js.UndefOr[String]
  }

  @js.native
  sealed trait SecurityPolicy extends js.Any
  object SecurityPolicy extends js.Object {
    val TLS_1_0 = "TLS_1_0".asInstanceOf[SecurityPolicy]
    val TLS_1_2 = "TLS_1_2".asInstanceOf[SecurityPolicy]

    val values = js.Object.freeze(js.Array(TLS_1_0, TLS_1_2))
  }

  /**
    * Represents a unique identifier for a version of a deployed <a>RestApi</a> that is callable by users.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-deploy-api.html|Deploy an API]]
    */
  @js.native
  @Factory
  trait Stage extends js.Object {
    var accessLogSettings: js.UndefOr[AccessLogSettings]
    var cacheClusterEnabled: js.UndefOr[Boolean]
    var cacheClusterSize: js.UndefOr[CacheClusterSize]
    var cacheClusterStatus: js.UndefOr[CacheClusterStatus]
    var canarySettings: js.UndefOr[CanarySettings]
    var clientCertificateId: js.UndefOr[String]
    var createdDate: js.UndefOr[Timestamp]
    var deploymentId: js.UndefOr[String]
    var description: js.UndefOr[String]
    var documentationVersion: js.UndefOr[String]
    var lastUpdatedDate: js.UndefOr[Timestamp]
    var methodSettings: js.UndefOr[MapOfMethodSettings]
    var stageName: js.UndefOr[String]
    var tags: js.UndefOr[MapOfStringToString]
    var tracingEnabled: js.UndefOr[Boolean]
    var variables: js.UndefOr[MapOfStringToString]
    var webAclArn: js.UndefOr[String]
  }

  /**
    * A reference to a unique stage identified in the format <code>{restApiId}/{stage}</code>.
    */
  @js.native
  @Factory
  trait StageKey extends js.Object {
    var restApiId: js.UndefOr[String]
    var stageName: js.UndefOr[String]
  }

  /**
    * A list of <a>Stage</a> resources that are associated with the <a>ApiKey</a> resource.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/stages.html|Deploying API in Stages]]
    */
  @js.native
  @Factory
  trait Stages extends js.Object {
    var item: js.UndefOr[ListOfStage]
  }

  /**
    * Adds or updates a tag on a given resource.
    */
  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var resourceArn: String
    var tags: MapOfStringToString
  }

  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  @js.native
  @Factory
  trait Tags extends js.Object {
    var tags: js.UndefOr[MapOfStringToString]
  }

  /**
    * Represents a mapping template used to transform a payload.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/models-mappings.html#models-mappings-mappings|Mapping Templates]]
    */
  @js.native
  @Factory
  trait Template extends js.Object {
    var value: js.UndefOr[String]
  }

  /**
    * Make a request to simulate the execution of an <a>Authorizer</a>.
    */
  @js.native
  @Factory
  trait TestInvokeAuthorizerRequest extends js.Object {
    var authorizerId: String
    var restApiId: String
    var additionalContext: js.UndefOr[MapOfStringToString]
    var body: js.UndefOr[String]
    var headers: js.UndefOr[MapOfStringToString]
    var multiValueHeaders: js.UndefOr[MapOfStringToList]
    var pathWithQueryString: js.UndefOr[String]
    var stageVariables: js.UndefOr[MapOfStringToString]
  }

  /**
    * Represents the response of the test invoke request for a custom <a>Authorizer</a>
    */
  @js.native
  @Factory
  trait TestInvokeAuthorizerResponse extends js.Object {
    var authorization: js.UndefOr[MapOfStringToList]
    var claims: js.UndefOr[MapOfStringToString]
    var clientStatus: js.UndefOr[Int]
    var latency: js.UndefOr[Double]
    var log: js.UndefOr[String]
    var policy: js.UndefOr[String]
    var principalId: js.UndefOr[String]
  }

  /**
    * Make a request to simulate the execution of a <a>Method</a>.
    */
  @js.native
  @Factory
  trait TestInvokeMethodRequest extends js.Object {
    var httpMethod: String
    var resourceId: String
    var restApiId: String
    var body: js.UndefOr[String]
    var clientCertificateId: js.UndefOr[String]
    var headers: js.UndefOr[MapOfStringToString]
    var multiValueHeaders: js.UndefOr[MapOfStringToList]
    var pathWithQueryString: js.UndefOr[String]
    var stageVariables: js.UndefOr[MapOfStringToString]
  }

  /**
    * Represents the response of the test invoke request in the HTTP method.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-test-method.html#how-to-test-method-console|Test API using the API Gateway console]]
    */
  @js.native
  @Factory
  trait TestInvokeMethodResponse extends js.Object {
    var body: js.UndefOr[String]
    var headers: js.UndefOr[MapOfStringToString]
    var latency: js.UndefOr[Double]
    var log: js.UndefOr[String]
    var multiValueHeaders: js.UndefOr[MapOfStringToList]
    var status: js.UndefOr[Int]
  }

  /**
    * The API request rate limits.
    */
  @js.native
  @Factory
  trait ThrottleSettings extends js.Object {
    var burstLimit: js.UndefOr[Int]
    var rateLimit: js.UndefOr[Double]
  }

  @js.native
  sealed trait UnauthorizedCacheControlHeaderStrategy extends js.Any
  object UnauthorizedCacheControlHeaderStrategy extends js.Object {
    val FAIL_WITH_403 = "FAIL_WITH_403".asInstanceOf[UnauthorizedCacheControlHeaderStrategy]
    val SUCCEED_WITH_RESPONSE_HEADER =
      "SUCCEED_WITH_RESPONSE_HEADER".asInstanceOf[UnauthorizedCacheControlHeaderStrategy]
    val SUCCEED_WITHOUT_RESPONSE_HEADER =
      "SUCCEED_WITHOUT_RESPONSE_HEADER".asInstanceOf[UnauthorizedCacheControlHeaderStrategy]

    val values =
      js.Object.freeze(js.Array(FAIL_WITH_403, SUCCEED_WITH_RESPONSE_HEADER, SUCCEED_WITHOUT_RESPONSE_HEADER))
  }

  /**
    * Removes a tag from a given resource.
    */
  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var resourceArn: String
    var tagKeys: ListOfString
  }

  /**
    * Requests API Gateway to change information about the current <a>Account</a> resource.
    */
  @js.native
  @Factory
  trait UpdateAccountRequest extends js.Object {
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  /**
    * A request to change information about an <a>ApiKey</a> resource.
    */
  @js.native
  @Factory
  trait UpdateApiKeyRequest extends js.Object {
    var apiKey: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  /**
    * Request to update an existing <a>Authorizer</a> resource.
    */
  @js.native
  @Factory
  trait UpdateAuthorizerRequest extends js.Object {
    var authorizerId: String
    var restApiId: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  /**
    * A request to change information about the <a>BasePathMapping</a> resource.
    */
  @js.native
  @Factory
  trait UpdateBasePathMappingRequest extends js.Object {
    var basePath: String
    var domainName: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  /**
    * A request to change information about an <a>ClientCertificate</a> resource.
    */
  @js.native
  @Factory
  trait UpdateClientCertificateRequest extends js.Object {
    var clientCertificateId: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  /**
    * Requests API Gateway to change information about a <a>Deployment</a> resource.
    */
  @js.native
  @Factory
  trait UpdateDeploymentRequest extends js.Object {
    var deploymentId: String
    var restApiId: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  /**
    * Updates an existing documentation part of a given API.
    */
  @js.native
  @Factory
  trait UpdateDocumentationPartRequest extends js.Object {
    var documentationPartId: String
    var restApiId: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  /**
    * Updates an existing documentation version of an API.
    */
  @js.native
  @Factory
  trait UpdateDocumentationVersionRequest extends js.Object {
    var documentationVersion: String
    var restApiId: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  /**
    * A request to change information about the <a>DomainName</a> resource.
    */
  @js.native
  @Factory
  trait UpdateDomainNameRequest extends js.Object {
    var domainName: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  /**
    * Updates a <a>GatewayResponse</a> of a specified response type on the given <a>RestApi</a>.
    */
  @js.native
  @Factory
  trait UpdateGatewayResponseRequest extends js.Object {
    var responseType: GatewayResponseType
    var restApiId: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  /**
    * Represents an update integration request.
    */
  @js.native
  @Factory
  trait UpdateIntegrationRequest extends js.Object {
    var httpMethod: String
    var resourceId: String
    var restApiId: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  /**
    * Represents an update integration response request.
    */
  @js.native
  @Factory
  trait UpdateIntegrationResponseRequest extends js.Object {
    var httpMethod: String
    var resourceId: String
    var restApiId: String
    var statusCode: StatusCode
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  /**
    * Request to update an existing <a>Method</a> resource.
    */
  @js.native
  @Factory
  trait UpdateMethodRequest extends js.Object {
    var httpMethod: String
    var resourceId: String
    var restApiId: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  /**
    * A request to update an existing <a>MethodResponse</a> resource.
    */
  @js.native
  @Factory
  trait UpdateMethodResponseRequest extends js.Object {
    var httpMethod: String
    var resourceId: String
    var restApiId: String
    var statusCode: StatusCode
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  /**
    * Request to update an existing model in an existing <a>RestApi</a> resource.
    */
  @js.native
  @Factory
  trait UpdateModelRequest extends js.Object {
    var modelName: String
    var restApiId: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  /**
    * Updates a <a>RequestValidator</a> of a given <a>RestApi</a>.
    */
  @js.native
  @Factory
  trait UpdateRequestValidatorRequest extends js.Object {
    var requestValidatorId: String
    var restApiId: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  /**
    * Request to change information about a <a>Resource</a> resource.
    */
  @js.native
  @Factory
  trait UpdateResourceRequest extends js.Object {
    var resourceId: String
    var restApiId: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  /**
    * Request to update an existing <a>RestApi</a> resource in your collection.
    */
  @js.native
  @Factory
  trait UpdateRestApiRequest extends js.Object {
    var restApiId: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  /**
    * Requests API Gateway to change information about a <a>Stage</a> resource.
    */
  @js.native
  @Factory
  trait UpdateStageRequest extends js.Object {
    var restApiId: String
    var stageName: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  /**
    * The PATCH request to update a usage plan of a given plan Id.
    */
  @js.native
  @Factory
  trait UpdateUsagePlanRequest extends js.Object {
    var usagePlanId: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  /**
    * The PATCH request to grant a temporary extension to the remaining quota of a usage plan associated with a specified API key.
    */
  @js.native
  @Factory
  trait UpdateUsageRequest extends js.Object {
    var keyId: String
    var usagePlanId: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  /**
    * Updates an existing <a>VpcLink</a> of a specified identifier.
    */
  @js.native
  @Factory
  trait UpdateVpcLinkRequest extends js.Object {
    var vpcLinkId: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  /**
    * Represents the usage data of a usage plan.
    *  <div class="remarks"/>
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-api-usage-plans.html|Create and Use Usage Plans]], [[https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-create-usage-plans-with-console.html#api-gateway-usage-plan-manage-usage|Manage Usage in a Usage Plan]]
    */
  @js.native
  @Factory
  trait Usage extends js.Object {
    var endDate: js.UndefOr[String]
    var items: js.UndefOr[MapOfKeyUsages]
    var position: js.UndefOr[String]
    var startDate: js.UndefOr[String]
    var usagePlanId: js.UndefOr[String]
  }

  /**
    * Represents a usage plan than can specify who can assess associated API stages with specified request limits and quotas.
    *  <div class="remarks"> In a usage plan, you associate an API by specifying the API's Id and a stage name of the specified API. You add plan customers by adding API keys to the plan.
    *  </div>
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-api-usage-plans.html|Create and Use Usage Plans]]
    */
  @js.native
  @Factory
  trait UsagePlan extends js.Object {
    var apiStages: js.UndefOr[ListOfApiStage]
    var description: js.UndefOr[String]
    var id: js.UndefOr[String]
    var name: js.UndefOr[String]
    var productCode: js.UndefOr[String]
    var quota: js.UndefOr[QuotaSettings]
    var tags: js.UndefOr[MapOfStringToString]
    var throttle: js.UndefOr[ThrottleSettings]
  }

  /**
    * Represents a usage plan key to identify a plan customer.
    *  <div class="remarks"> To associate an API stage with a selected API key in a usage plan, you must create a UsagePlanKey resource to represent the selected <a>ApiKey</a>.
    *  </div>"
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-api-usage-plans.html|Create and Use Usage Plans]]
    */
  @js.native
  @Factory
  trait UsagePlanKey extends js.Object {
    var id: js.UndefOr[String]
    var name: js.UndefOr[String]
    var `type`: js.UndefOr[String]
    var value: js.UndefOr[String]
  }

  /**
    * Represents the collection of usage plan keys added to usage plans for the associated API keys and, possibly, other types of keys.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-api-usage-plans.html|Create and Use Usage Plans]]
    */
  @js.native
  @Factory
  trait UsagePlanKeys extends js.Object {
    var items: js.UndefOr[ListOfUsagePlanKey]
    var position: js.UndefOr[String]
  }

  /**
    * Represents a collection of usage plans for an AWS account.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-api-usage-plans.html|Create and Use Usage Plans]]
    */
  @js.native
  @Factory
  trait UsagePlans extends js.Object {
    var items: js.UndefOr[ListOfUsagePlan]
    var position: js.UndefOr[String]
  }

  /**
    * A API Gateway VPC link for a <a>RestApi</a> to access resources in an Amazon Virtual Private Cloud (VPC).
    *  <div class="remarks"> <p>To enable access to a resource in an Amazon Virtual Private Cloud through Amazon API Gateway, you, as an API developer, create a <a>VpcLink</a> resource targeted for one or more network load balancers of the VPC and then integrate an API method with a private integration that uses the <a>VpcLink</a>. The private integration has an integration type of <code>HTTP</code> or <code>HTTP_PROXY</code> and has a connection type of <code>VPC_LINK</code>. The integration uses the <code>connectionId</code> property to identify the <a>VpcLink</a> used.
    *  </p> </div>
    */
  @js.native
  @Factory
  trait VpcLink extends js.Object {
    var description: js.UndefOr[String]
    var id: js.UndefOr[String]
    var name: js.UndefOr[String]
    var status: js.UndefOr[VpcLinkStatus]
    var statusMessage: js.UndefOr[String]
    var tags: js.UndefOr[MapOfStringToString]
    var targetArns: js.UndefOr[ListOfString]
  }

  @js.native
  sealed trait VpcLinkStatus extends js.Any
  object VpcLinkStatus extends js.Object {
    val AVAILABLE = "AVAILABLE".asInstanceOf[VpcLinkStatus]
    val PENDING   = "PENDING".asInstanceOf[VpcLinkStatus]
    val DELETING  = "DELETING".asInstanceOf[VpcLinkStatus]
    val FAILED    = "FAILED".asInstanceOf[VpcLinkStatus]

    val values = js.Object.freeze(js.Array(AVAILABLE, PENDING, DELETING, FAILED))
  }

  /**
    * The collection of VPC links under the caller's account in a region.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/getting-started-with-private-integration.html|Getting Started with Private Integrations]], [[https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-private-integration.html|Set up Private Integrations]]
    */
  @js.native
  @Factory
  trait VpcLinks extends js.Object {
    var items: js.UndefOr[ListOfVpcLink]
    var position: js.UndefOr[String]
  }
}
