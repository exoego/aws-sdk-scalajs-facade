package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object apigateway {
  type ApiKeySourceType                       = String
  type ApiKeysFormat                          = String
  type AuthorizerType                         = String
  type Blob                                   = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type CacheClusterSize                       = String
  type CacheClusterStatus                     = String
  type ConnectionType                         = String
  type ContentHandlingStrategy                = String
  type DocumentationPartLocationStatusCode    = String
  type DocumentationPartType                  = String
  type DomainNameStatus                       = String
  type EndpointType                           = String
  type GatewayResponseType                    = String
  type IntegrationType                        = String
  type ListOfARNs                             = js.Array[ProviderARN]
  type ListOfApiKey                           = js.Array[ApiKey]
  type ListOfApiStage                         = js.Array[ApiStage]
  type ListOfAuthorizer                       = js.Array[Authorizer]
  type ListOfBasePathMapping                  = js.Array[BasePathMapping]
  type ListOfClientCertificate                = js.Array[ClientCertificate]
  type ListOfDeployment                       = js.Array[Deployment]
  type ListOfDocumentationPart                = js.Array[DocumentationPart]
  type ListOfDocumentationVersion             = js.Array[DocumentationVersion]
  type ListOfDomainName                       = js.Array[DomainName]
  type ListOfEndpointType                     = js.Array[EndpointType]
  type ListOfGatewayResponse                  = js.Array[GatewayResponse]
  type ListOfLong                             = js.Array[Double]
  type ListOfModel                            = js.Array[Model]
  type ListOfPatchOperation                   = js.Array[PatchOperation]
  type ListOfRequestValidator                 = js.Array[RequestValidator]
  type ListOfResource                         = js.Array[Resource]
  type ListOfRestApi                          = js.Array[RestApi]
  type ListOfSdkConfigurationProperty         = js.Array[SdkConfigurationProperty]
  type ListOfSdkType                          = js.Array[SdkType]
  type ListOfStage                            = js.Array[Stage]
  type ListOfStageKeys                        = js.Array[StageKey]
  type ListOfString                           = js.Array[String]
  type ListOfUsage                            = js.Array[ListOfLong]
  type ListOfUsagePlan                        = js.Array[UsagePlan]
  type ListOfUsagePlanKey                     = js.Array[UsagePlanKey]
  type ListOfVpcLink                          = js.Array[VpcLink]
  type LocationStatusType                     = String
  type MapOfApiStageThrottleSettings          = js.Dictionary[ThrottleSettings]
  type MapOfIntegrationResponse               = js.Dictionary[IntegrationResponse]
  type MapOfKeyUsages                         = js.Dictionary[ListOfUsage]
  type MapOfMethod                            = js.Dictionary[Method]
  type MapOfMethodResponse                    = js.Dictionary[MethodResponse]
  type MapOfMethodSettings                    = js.Dictionary[MethodSetting]
  type MapOfMethodSnapshot                    = js.Dictionary[MethodSnapshot]
  type MapOfStringToBoolean                   = js.Dictionary[NullableBoolean]
  type MapOfStringToList                      = js.Dictionary[ListOfString]
  type MapOfStringToString                    = js.Dictionary[String]
  type NullableBoolean                        = Boolean
  type NullableInteger                        = Int
  type Op                                     = String
  type PathToMapOfMethodSnapshot              = js.Dictionary[MapOfMethodSnapshot]
  type ProviderARN                            = String
  type PutMode                                = String
  type QuotaPeriodType                        = String
  type SecurityPolicy                         = String
  type StatusCode                             = String
  type Timestamp                              = js.Date
  type UnauthorizedCacheControlHeaderStrategy = String
  type VpcLinkStatus                          = String

  implicit final class APIGatewayOps(val service: APIGateway) extends AnyVal {

    def createApiKeyFuture(params: CreateApiKeyRequest): Future[ApiKey] = service.createApiKey(params).promise.toFuture
    def createAuthorizerFuture(params: CreateAuthorizerRequest): Future[Authorizer] =
      service.createAuthorizer(params).promise.toFuture
    def createBasePathMappingFuture(params: CreateBasePathMappingRequest): Future[BasePathMapping] =
      service.createBasePathMapping(params).promise.toFuture
    def createDeploymentFuture(params: CreateDeploymentRequest): Future[Deployment] =
      service.createDeployment(params).promise.toFuture
    def createDocumentationPartFuture(params: CreateDocumentationPartRequest): Future[DocumentationPart] =
      service.createDocumentationPart(params).promise.toFuture
    def createDocumentationVersionFuture(params: CreateDocumentationVersionRequest): Future[DocumentationVersion] =
      service.createDocumentationVersion(params).promise.toFuture
    def createDomainNameFuture(params: CreateDomainNameRequest): Future[DomainName] =
      service.createDomainName(params).promise.toFuture
    def createModelFuture(params: CreateModelRequest): Future[Model] = service.createModel(params).promise.toFuture
    def createRequestValidatorFuture(params: CreateRequestValidatorRequest): Future[RequestValidator] =
      service.createRequestValidator(params).promise.toFuture
    def createResourceFuture(params: CreateResourceRequest): Future[Resource] =
      service.createResource(params).promise.toFuture
    def createRestApiFuture(params: CreateRestApiRequest): Future[RestApi] =
      service.createRestApi(params).promise.toFuture
    def createStageFuture(params: CreateStageRequest): Future[Stage] = service.createStage(params).promise.toFuture
    def createUsagePlanFuture(params: CreateUsagePlanRequest): Future[UsagePlan] =
      service.createUsagePlan(params).promise.toFuture
    def createUsagePlanKeyFuture(params: CreateUsagePlanKeyRequest): Future[UsagePlanKey] =
      service.createUsagePlanKey(params).promise.toFuture
    def createVpcLinkFuture(params: CreateVpcLinkRequest): Future[VpcLink] =
      service.createVpcLink(params).promise.toFuture
    def deleteApiKeyFuture(params: DeleteApiKeyRequest): Future[js.Object] =
      service.deleteApiKey(params).promise.toFuture
    def deleteAuthorizerFuture(params: DeleteAuthorizerRequest): Future[js.Object] =
      service.deleteAuthorizer(params).promise.toFuture
    def deleteBasePathMappingFuture(params: DeleteBasePathMappingRequest): Future[js.Object] =
      service.deleteBasePathMapping(params).promise.toFuture
    def deleteClientCertificateFuture(params: DeleteClientCertificateRequest): Future[js.Object] =
      service.deleteClientCertificate(params).promise.toFuture
    def deleteDeploymentFuture(params: DeleteDeploymentRequest): Future[js.Object] =
      service.deleteDeployment(params).promise.toFuture
    def deleteDocumentationPartFuture(params: DeleteDocumentationPartRequest): Future[js.Object] =
      service.deleteDocumentationPart(params).promise.toFuture
    def deleteDocumentationVersionFuture(params: DeleteDocumentationVersionRequest): Future[js.Object] =
      service.deleteDocumentationVersion(params).promise.toFuture
    def deleteDomainNameFuture(params: DeleteDomainNameRequest): Future[js.Object] =
      service.deleteDomainName(params).promise.toFuture
    def deleteGatewayResponseFuture(params: DeleteGatewayResponseRequest): Future[js.Object] =
      service.deleteGatewayResponse(params).promise.toFuture
    def deleteIntegrationFuture(params: DeleteIntegrationRequest): Future[js.Object] =
      service.deleteIntegration(params).promise.toFuture
    def deleteIntegrationResponseFuture(params: DeleteIntegrationResponseRequest): Future[js.Object] =
      service.deleteIntegrationResponse(params).promise.toFuture
    def deleteMethodFuture(params: DeleteMethodRequest): Future[js.Object] =
      service.deleteMethod(params).promise.toFuture
    def deleteMethodResponseFuture(params: DeleteMethodResponseRequest): Future[js.Object] =
      service.deleteMethodResponse(params).promise.toFuture
    def deleteModelFuture(params: DeleteModelRequest): Future[js.Object] = service.deleteModel(params).promise.toFuture
    def deleteRequestValidatorFuture(params: DeleteRequestValidatorRequest): Future[js.Object] =
      service.deleteRequestValidator(params).promise.toFuture
    def deleteResourceFuture(params: DeleteResourceRequest): Future[js.Object] =
      service.deleteResource(params).promise.toFuture
    def deleteRestApiFuture(params: DeleteRestApiRequest): Future[js.Object] =
      service.deleteRestApi(params).promise.toFuture
    def deleteStageFuture(params: DeleteStageRequest): Future[js.Object] = service.deleteStage(params).promise.toFuture
    def deleteUsagePlanFuture(params: DeleteUsagePlanRequest): Future[js.Object] =
      service.deleteUsagePlan(params).promise.toFuture
    def deleteUsagePlanKeyFuture(params: DeleteUsagePlanKeyRequest): Future[js.Object] =
      service.deleteUsagePlanKey(params).promise.toFuture
    def deleteVpcLinkFuture(params: DeleteVpcLinkRequest): Future[js.Object] =
      service.deleteVpcLink(params).promise.toFuture
    def flushStageAuthorizersCacheFuture(params: FlushStageAuthorizersCacheRequest): Future[js.Object] =
      service.flushStageAuthorizersCache(params).promise.toFuture
    def flushStageCacheFuture(params: FlushStageCacheRequest): Future[js.Object] =
      service.flushStageCache(params).promise.toFuture
    def generateClientCertificateFuture(params: GenerateClientCertificateRequest): Future[ClientCertificate] =
      service.generateClientCertificate(params).promise.toFuture
    def getAccountFuture(params: GetAccountRequest): Future[Account] = service.getAccount(params).promise.toFuture
    def getApiKeyFuture(params: GetApiKeyRequest): Future[ApiKey]    = service.getApiKey(params).promise.toFuture
    def getApiKeysFuture(params: GetApiKeysRequest): Future[ApiKeys] = service.getApiKeys(params).promise.toFuture
    def getAuthorizerFuture(params: GetAuthorizerRequest): Future[Authorizer] =
      service.getAuthorizer(params).promise.toFuture
    def getAuthorizersFuture(params: GetAuthorizersRequest): Future[Authorizers] =
      service.getAuthorizers(params).promise.toFuture
    def getBasePathMappingFuture(params: GetBasePathMappingRequest): Future[BasePathMapping] =
      service.getBasePathMapping(params).promise.toFuture
    def getBasePathMappingsFuture(params: GetBasePathMappingsRequest): Future[BasePathMappings] =
      service.getBasePathMappings(params).promise.toFuture
    def getClientCertificateFuture(params: GetClientCertificateRequest): Future[ClientCertificate] =
      service.getClientCertificate(params).promise.toFuture
    def getClientCertificatesFuture(params: GetClientCertificatesRequest): Future[ClientCertificates] =
      service.getClientCertificates(params).promise.toFuture
    def getDeploymentFuture(params: GetDeploymentRequest): Future[Deployment] =
      service.getDeployment(params).promise.toFuture
    def getDeploymentsFuture(params: GetDeploymentsRequest): Future[Deployments] =
      service.getDeployments(params).promise.toFuture
    def getDocumentationPartFuture(params: GetDocumentationPartRequest): Future[DocumentationPart] =
      service.getDocumentationPart(params).promise.toFuture
    def getDocumentationPartsFuture(params: GetDocumentationPartsRequest): Future[DocumentationParts] =
      service.getDocumentationParts(params).promise.toFuture
    def getDocumentationVersionFuture(params: GetDocumentationVersionRequest): Future[DocumentationVersion] =
      service.getDocumentationVersion(params).promise.toFuture
    def getDocumentationVersionsFuture(params: GetDocumentationVersionsRequest): Future[DocumentationVersions] =
      service.getDocumentationVersions(params).promise.toFuture
    def getDomainNameFuture(params: GetDomainNameRequest): Future[DomainName] =
      service.getDomainName(params).promise.toFuture
    def getDomainNamesFuture(params: GetDomainNamesRequest): Future[DomainNames] =
      service.getDomainNames(params).promise.toFuture
    def getExportFuture(params: GetExportRequest): Future[ExportResponse] = service.getExport(params).promise.toFuture
    def getGatewayResponseFuture(params: GetGatewayResponseRequest): Future[GatewayResponse] =
      service.getGatewayResponse(params).promise.toFuture
    def getGatewayResponsesFuture(params: GetGatewayResponsesRequest): Future[GatewayResponses] =
      service.getGatewayResponses(params).promise.toFuture
    def getIntegrationFuture(params: GetIntegrationRequest): Future[Integration] =
      service.getIntegration(params).promise.toFuture
    def getIntegrationResponseFuture(params: GetIntegrationResponseRequest): Future[IntegrationResponse] =
      service.getIntegrationResponse(params).promise.toFuture
    def getMethodFuture(params: GetMethodRequest): Future[Method] = service.getMethod(params).promise.toFuture
    def getMethodResponseFuture(params: GetMethodResponseRequest): Future[MethodResponse] =
      service.getMethodResponse(params).promise.toFuture
    def getModelFuture(params: GetModelRequest): Future[Model] = service.getModel(params).promise.toFuture
    def getModelTemplateFuture(params: GetModelTemplateRequest): Future[Template] =
      service.getModelTemplate(params).promise.toFuture
    def getModelsFuture(params: GetModelsRequest): Future[Models] = service.getModels(params).promise.toFuture
    def getRequestValidatorFuture(params: GetRequestValidatorRequest): Future[RequestValidator] =
      service.getRequestValidator(params).promise.toFuture
    def getRequestValidatorsFuture(params: GetRequestValidatorsRequest): Future[RequestValidators] =
      service.getRequestValidators(params).promise.toFuture
    def getResourceFuture(params: GetResourceRequest): Future[Resource] = service.getResource(params).promise.toFuture
    def getResourcesFuture(params: GetResourcesRequest): Future[Resources] =
      service.getResources(params).promise.toFuture
    def getRestApiFuture(params: GetRestApiRequest): Future[RestApi]    = service.getRestApi(params).promise.toFuture
    def getRestApisFuture(params: GetRestApisRequest): Future[RestApis] = service.getRestApis(params).promise.toFuture
    def getSdkFuture(params: GetSdkRequest): Future[SdkResponse]        = service.getSdk(params).promise.toFuture
    def getSdkTypeFuture(params: GetSdkTypeRequest): Future[SdkType]    = service.getSdkType(params).promise.toFuture
    def getSdkTypesFuture(params: GetSdkTypesRequest): Future[SdkTypes] = service.getSdkTypes(params).promise.toFuture
    def getStageFuture(params: GetStageRequest): Future[Stage]          = service.getStage(params).promise.toFuture
    def getStagesFuture(params: GetStagesRequest): Future[Stages]       = service.getStages(params).promise.toFuture
    def getTagsFuture(params: GetTagsRequest): Future[Tags]             = service.getTags(params).promise.toFuture
    def getUsageFuture(params: GetUsageRequest): Future[Usage]          = service.getUsage(params).promise.toFuture
    def getUsagePlanFuture(params: GetUsagePlanRequest): Future[UsagePlan] =
      service.getUsagePlan(params).promise.toFuture
    def getUsagePlanKeyFuture(params: GetUsagePlanKeyRequest): Future[UsagePlanKey] =
      service.getUsagePlanKey(params).promise.toFuture
    def getUsagePlanKeysFuture(params: GetUsagePlanKeysRequest): Future[UsagePlanKeys] =
      service.getUsagePlanKeys(params).promise.toFuture
    def getUsagePlansFuture(params: GetUsagePlansRequest): Future[UsagePlans] =
      service.getUsagePlans(params).promise.toFuture
    def getVpcLinkFuture(params: GetVpcLinkRequest): Future[VpcLink]    = service.getVpcLink(params).promise.toFuture
    def getVpcLinksFuture(params: GetVpcLinksRequest): Future[VpcLinks] = service.getVpcLinks(params).promise.toFuture
    def importApiKeysFuture(params: ImportApiKeysRequest): Future[ApiKeyIds] =
      service.importApiKeys(params).promise.toFuture
    def importDocumentationPartsFuture(params: ImportDocumentationPartsRequest): Future[DocumentationPartIds] =
      service.importDocumentationParts(params).promise.toFuture
    def importRestApiFuture(params: ImportRestApiRequest): Future[RestApi] =
      service.importRestApi(params).promise.toFuture
    def putGatewayResponseFuture(params: PutGatewayResponseRequest): Future[GatewayResponse] =
      service.putGatewayResponse(params).promise.toFuture
    def putIntegrationFuture(params: PutIntegrationRequest): Future[Integration] =
      service.putIntegration(params).promise.toFuture
    def putIntegrationResponseFuture(params: PutIntegrationResponseRequest): Future[IntegrationResponse] =
      service.putIntegrationResponse(params).promise.toFuture
    def putMethodFuture(params: PutMethodRequest): Future[Method] = service.putMethod(params).promise.toFuture
    def putMethodResponseFuture(params: PutMethodResponseRequest): Future[MethodResponse] =
      service.putMethodResponse(params).promise.toFuture
    def putRestApiFuture(params: PutRestApiRequest): Future[RestApi]     = service.putRestApi(params).promise.toFuture
    def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise.toFuture
    def testInvokeAuthorizerFuture(params: TestInvokeAuthorizerRequest): Future[TestInvokeAuthorizerResponse] =
      service.testInvokeAuthorizer(params).promise.toFuture
    def testInvokeMethodFuture(params: TestInvokeMethodRequest): Future[TestInvokeMethodResponse] =
      service.testInvokeMethod(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise.toFuture
    def updateAccountFuture(params: UpdateAccountRequest): Future[Account] =
      service.updateAccount(params).promise.toFuture
    def updateApiKeyFuture(params: UpdateApiKeyRequest): Future[ApiKey] = service.updateApiKey(params).promise.toFuture
    def updateAuthorizerFuture(params: UpdateAuthorizerRequest): Future[Authorizer] =
      service.updateAuthorizer(params).promise.toFuture
    def updateBasePathMappingFuture(params: UpdateBasePathMappingRequest): Future[BasePathMapping] =
      service.updateBasePathMapping(params).promise.toFuture
    def updateClientCertificateFuture(params: UpdateClientCertificateRequest): Future[ClientCertificate] =
      service.updateClientCertificate(params).promise.toFuture
    def updateDeploymentFuture(params: UpdateDeploymentRequest): Future[Deployment] =
      service.updateDeployment(params).promise.toFuture
    def updateDocumentationPartFuture(params: UpdateDocumentationPartRequest): Future[DocumentationPart] =
      service.updateDocumentationPart(params).promise.toFuture
    def updateDocumentationVersionFuture(params: UpdateDocumentationVersionRequest): Future[DocumentationVersion] =
      service.updateDocumentationVersion(params).promise.toFuture
    def updateDomainNameFuture(params: UpdateDomainNameRequest): Future[DomainName] =
      service.updateDomainName(params).promise.toFuture
    def updateGatewayResponseFuture(params: UpdateGatewayResponseRequest): Future[GatewayResponse] =
      service.updateGatewayResponse(params).promise.toFuture
    def updateIntegrationFuture(params: UpdateIntegrationRequest): Future[Integration] =
      service.updateIntegration(params).promise.toFuture
    def updateIntegrationResponseFuture(params: UpdateIntegrationResponseRequest): Future[IntegrationResponse] =
      service.updateIntegrationResponse(params).promise.toFuture
    def updateMethodFuture(params: UpdateMethodRequest): Future[Method] = service.updateMethod(params).promise.toFuture
    def updateMethodResponseFuture(params: UpdateMethodResponseRequest): Future[MethodResponse] =
      service.updateMethodResponse(params).promise.toFuture
    def updateModelFuture(params: UpdateModelRequest): Future[Model] = service.updateModel(params).promise.toFuture
    def updateRequestValidatorFuture(params: UpdateRequestValidatorRequest): Future[RequestValidator] =
      service.updateRequestValidator(params).promise.toFuture
    def updateResourceFuture(params: UpdateResourceRequest): Future[Resource] =
      service.updateResource(params).promise.toFuture
    def updateRestApiFuture(params: UpdateRestApiRequest): Future[RestApi] =
      service.updateRestApi(params).promise.toFuture
    def updateStageFuture(params: UpdateStageRequest): Future[Stage] = service.updateStage(params).promise.toFuture
    def updateUsageFuture(params: UpdateUsageRequest): Future[Usage] = service.updateUsage(params).promise.toFuture
    def updateUsagePlanFuture(params: UpdateUsagePlanRequest): Future[UsagePlan] =
      service.updateUsagePlan(params).promise.toFuture
    def updateVpcLinkFuture(params: UpdateVpcLinkRequest): Future[VpcLink] =
      service.updateVpcLink(params).promise.toFuture
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
  trait AccessLogSettings extends js.Object {
    var destinationArn: js.UndefOr[String]
    var format: js.UndefOr[String]
  }

  object AccessLogSettings {
    def apply(
        destinationArn: js.UndefOr[String] = js.undefined,
        format: js.UndefOr[String] = js.undefined
    ): AccessLogSettings = {
      val __obj = js.Dictionary.empty[js.Any]
      destinationArn.foreach(__v => __obj.update("destinationArn", __v.asInstanceOf[js.Any]))
      format.foreach(__v => __obj.update("format", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccessLogSettings]
    }
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
  trait Account extends js.Object {
    var apiKeyVersion: js.UndefOr[String]
    var cloudwatchRoleArn: js.UndefOr[String]
    var features: js.UndefOr[ListOfString]
    var throttleSettings: js.UndefOr[ThrottleSettings]
  }

  object Account {
    def apply(
        apiKeyVersion: js.UndefOr[String] = js.undefined,
        cloudwatchRoleArn: js.UndefOr[String] = js.undefined,
        features: js.UndefOr[ListOfString] = js.undefined,
        throttleSettings: js.UndefOr[ThrottleSettings] = js.undefined
    ): Account = {
      val __obj = js.Dictionary.empty[js.Any]
      apiKeyVersion.foreach(__v => __obj.update("apiKeyVersion", __v.asInstanceOf[js.Any]))
      cloudwatchRoleArn.foreach(__v => __obj.update("cloudwatchRoleArn", __v.asInstanceOf[js.Any]))
      features.foreach(__v => __obj.update("features", __v.asInstanceOf[js.Any]))
      throttleSettings.foreach(__v => __obj.update("throttleSettings", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Account]
    }
  }

  /**
    * A resource that can be distributed to callers for executing <a>Method</a> resources that require an API key. API keys can be mapped to any <a>Stage</a> on any <a>RestApi</a>, which indicates that the callers with the API key can make requests to that stage.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-api-keys.html|Use API Keys]]
    */
  @js.native
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

  object ApiKey {
    def apply(
        createdDate: js.UndefOr[Timestamp] = js.undefined,
        customerId: js.UndefOr[String] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        enabled: js.UndefOr[Boolean] = js.undefined,
        id: js.UndefOr[String] = js.undefined,
        lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        stageKeys: js.UndefOr[ListOfString] = js.undefined,
        tags: js.UndefOr[MapOfStringToString] = js.undefined,
        value: js.UndefOr[String] = js.undefined
    ): ApiKey = {
      val __obj = js.Dictionary.empty[js.Any]
      createdDate.foreach(__v => __obj.update("createdDate", __v.asInstanceOf[js.Any]))
      customerId.foreach(__v => __obj.update("customerId", __v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      enabled.foreach(__v => __obj.update("enabled", __v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.update("id", __v.asInstanceOf[js.Any]))
      lastUpdatedDate.foreach(__v => __obj.update("lastUpdatedDate", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      stageKeys.foreach(__v => __obj.update("stageKeys", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.update("value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApiKey]
    }
  }

  /**
    * The identifier of an <a>ApiKey</a> used in a <a>UsagePlan</a>.
    */
  @js.native
  trait ApiKeyIds extends js.Object {
    var ids: js.UndefOr[ListOfString]
    var warnings: js.UndefOr[ListOfString]
  }

  object ApiKeyIds {
    def apply(
        ids: js.UndefOr[ListOfString] = js.undefined,
        warnings: js.UndefOr[ListOfString] = js.undefined
    ): ApiKeyIds = {
      val __obj = js.Dictionary.empty[js.Any]
      ids.foreach(__v => __obj.update("ids", __v.asInstanceOf[js.Any]))
      warnings.foreach(__v => __obj.update("warnings", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApiKeyIds]
    }
  }

  object ApiKeySourceTypeEnum {
    val HEADER     = "HEADER"
    val AUTHORIZER = "AUTHORIZER"

    val values = IndexedSeq(HEADER, AUTHORIZER)
  }

  /**
    * Represents a collection of API keys as represented by an <a>ApiKeys</a> resource.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-api-keys.html|Use API Keys]]
    */
  @js.native
  trait ApiKeys extends js.Object {
    var items: js.UndefOr[ListOfApiKey]
    var position: js.UndefOr[String]
    var warnings: js.UndefOr[ListOfString]
  }

  object ApiKeys {
    def apply(
        items: js.UndefOr[ListOfApiKey] = js.undefined,
        position: js.UndefOr[String] = js.undefined,
        warnings: js.UndefOr[ListOfString] = js.undefined
    ): ApiKeys = {
      val __obj = js.Dictionary.empty[js.Any]
      items.foreach(__v => __obj.update("items", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      warnings.foreach(__v => __obj.update("warnings", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApiKeys]
    }
  }

  object ApiKeysFormatEnum {
    val csv = "csv"

    val values = IndexedSeq(csv)
  }

  /**
    * API stage name of the associated API stage in a usage plan.
    */
  @js.native
  trait ApiStage extends js.Object {
    var apiId: js.UndefOr[String]
    var stage: js.UndefOr[String]
    var throttle: js.UndefOr[MapOfApiStageThrottleSettings]
  }

  object ApiStage {
    def apply(
        apiId: js.UndefOr[String] = js.undefined,
        stage: js.UndefOr[String] = js.undefined,
        throttle: js.UndefOr[MapOfApiStageThrottleSettings] = js.undefined
    ): ApiStage = {
      val __obj = js.Dictionary.empty[js.Any]
      apiId.foreach(__v => __obj.update("apiId", __v.asInstanceOf[js.Any]))
      stage.foreach(__v => __obj.update("stage", __v.asInstanceOf[js.Any]))
      throttle.foreach(__v => __obj.update("throttle", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApiStage]
    }
  }

  /**
    * Represents an authorization layer for methods. If enabled on a method, API Gateway will activate the authorizer when a client calls the method.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-use-lambda-authorizer.html|Use Lambda Function as Authorizer]] [[https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-integrate-with-cognito.html|Use Cognito User Pool as Authorizer]]
    */
  @js.native
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

  object Authorizer {
    def apply(
        authType: js.UndefOr[String] = js.undefined,
        authorizerCredentials: js.UndefOr[String] = js.undefined,
        authorizerResultTtlInSeconds: js.UndefOr[NullableInteger] = js.undefined,
        authorizerUri: js.UndefOr[String] = js.undefined,
        id: js.UndefOr[String] = js.undefined,
        identitySource: js.UndefOr[String] = js.undefined,
        identityValidationExpression: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        providerARNs: js.UndefOr[ListOfARNs] = js.undefined,
        `type`: js.UndefOr[AuthorizerType] = js.undefined
    ): Authorizer = {
      val __obj = js.Dictionary.empty[js.Any]
      authType.foreach(__v => __obj.update("authType", __v.asInstanceOf[js.Any]))
      authorizerCredentials.foreach(__v => __obj.update("authorizerCredentials", __v.asInstanceOf[js.Any]))
      authorizerResultTtlInSeconds.foreach(
        __v => __obj.update("authorizerResultTtlInSeconds", __v.asInstanceOf[js.Any])
      )
      authorizerUri.foreach(__v => __obj.update("authorizerUri", __v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.update("id", __v.asInstanceOf[js.Any]))
      identitySource.foreach(__v => __obj.update("identitySource", __v.asInstanceOf[js.Any]))
      identityValidationExpression.foreach(
        __v => __obj.update("identityValidationExpression", __v.asInstanceOf[js.Any])
      )
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      providerARNs.foreach(__v => __obj.update("providerARNs", __v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Authorizer]
    }
  }

  /**
    * The authorizer type. Valid values are <code>TOKEN</code> for a Lambda function using a single authorization token submitted in a custom header, <code>REQUEST</code> for a Lambda function using incoming request parameters, and <code>COGNITO_USER_POOLS</code> for using an Amazon Cognito user pool.
    */
  object AuthorizerTypeEnum {
    val TOKEN              = "TOKEN"
    val REQUEST            = "REQUEST"
    val COGNITO_USER_POOLS = "COGNITO_USER_POOLS"

    val values = IndexedSeq(TOKEN, REQUEST, COGNITO_USER_POOLS)
  }

  /**
    * Represents a collection of <a>Authorizer</a> resources.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-use-lambda-authorizer.html|Use Lambda Function as Authorizer]] [[https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-integrate-with-cognito.html|Use Cognito User Pool as Authorizer]]
    */
  @js.native
  trait Authorizers extends js.Object {
    var items: js.UndefOr[ListOfAuthorizer]
    var position: js.UndefOr[String]
  }

  object Authorizers {
    def apply(
        items: js.UndefOr[ListOfAuthorizer] = js.undefined,
        position: js.UndefOr[String] = js.undefined
    ): Authorizers = {
      val __obj = js.Dictionary.empty[js.Any]
      items.foreach(__v => __obj.update("items", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Authorizers]
    }
  }

  /**
    * Represents the base path that callers of the API must provide as part of the URL after the domain name.
    *  <div class="remarks">A custom domain name plus a <code>BasePathMapping</code> specification identifies a deployed <a>RestApi</a> in a given stage of the owner <a>Account</a>.</div>
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-custom-domains.html|Use Custom Domain Names]]
    */
  @js.native
  trait BasePathMapping extends js.Object {
    var basePath: js.UndefOr[String]
    var restApiId: js.UndefOr[String]
    var stage: js.UndefOr[String]
  }

  object BasePathMapping {
    def apply(
        basePath: js.UndefOr[String] = js.undefined,
        restApiId: js.UndefOr[String] = js.undefined,
        stage: js.UndefOr[String] = js.undefined
    ): BasePathMapping = {
      val __obj = js.Dictionary.empty[js.Any]
      basePath.foreach(__v => __obj.update("basePath", __v.asInstanceOf[js.Any]))
      restApiId.foreach(__v => __obj.update("restApiId", __v.asInstanceOf[js.Any]))
      stage.foreach(__v => __obj.update("stage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BasePathMapping]
    }
  }

  /**
    * Represents a collection of <a>BasePathMapping</a> resources.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-custom-domains.html|Use Custom Domain Names]]
    */
  @js.native
  trait BasePathMappings extends js.Object {
    var items: js.UndefOr[ListOfBasePathMapping]
    var position: js.UndefOr[String]
  }

  object BasePathMappings {
    def apply(
        items: js.UndefOr[ListOfBasePathMapping] = js.undefined,
        position: js.UndefOr[String] = js.undefined
    ): BasePathMappings = {
      val __obj = js.Dictionary.empty[js.Any]
      items.foreach(__v => __obj.update("items", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BasePathMappings]
    }
  }

  /**
    * Returns the size of the ```CacheCluster```.
    */
  object CacheClusterSizeEnum {
    val `0.5`  = "0.5"
    val `1.6`  = "1.6"
    val `6.1`  = "6.1"
    val `13.5` = "13.5"
    val `28.4` = "28.4"
    val `58.2` = "58.2"
    val `118`  = "118"
    val `237`  = "237"

    val values = IndexedSeq(`0.5`, `1.6`, `6.1`, `13.5`, `28.4`, `58.2`, `118`, `237`)
  }

  /**
    * Returns the status of the ```CacheCluster```.
    */
  object CacheClusterStatusEnum {
    val CREATE_IN_PROGRESS = "CREATE_IN_PROGRESS"
    val AVAILABLE          = "AVAILABLE"
    val DELETE_IN_PROGRESS = "DELETE_IN_PROGRESS"
    val NOT_AVAILABLE      = "NOT_AVAILABLE"
    val FLUSH_IN_PROGRESS  = "FLUSH_IN_PROGRESS"

    val values = IndexedSeq(CREATE_IN_PROGRESS, AVAILABLE, DELETE_IN_PROGRESS, NOT_AVAILABLE, FLUSH_IN_PROGRESS)
  }

  /**
    * Configuration settings of a canary deployment.
    */
  @js.native
  trait CanarySettings extends js.Object {
    var deploymentId: js.UndefOr[String]
    var percentTraffic: js.UndefOr[Double]
    var stageVariableOverrides: js.UndefOr[MapOfStringToString]
    var useStageCache: js.UndefOr[Boolean]
  }

  object CanarySettings {
    def apply(
        deploymentId: js.UndefOr[String] = js.undefined,
        percentTraffic: js.UndefOr[Double] = js.undefined,
        stageVariableOverrides: js.UndefOr[MapOfStringToString] = js.undefined,
        useStageCache: js.UndefOr[Boolean] = js.undefined
    ): CanarySettings = {
      val __obj = js.Dictionary.empty[js.Any]
      deploymentId.foreach(__v => __obj.update("deploymentId", __v.asInstanceOf[js.Any]))
      percentTraffic.foreach(__v => __obj.update("percentTraffic", __v.asInstanceOf[js.Any]))
      stageVariableOverrides.foreach(__v => __obj.update("stageVariableOverrides", __v.asInstanceOf[js.Any]))
      useStageCache.foreach(__v => __obj.update("useStageCache", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CanarySettings]
    }
  }

  /**
    * Represents a client certificate used to configure client-side SSL authentication while sending requests to the integration endpoint.
    *  <div class="remarks">Client certificates are used to authenticate an API by the backend server. To authenticate an API client (or user), use IAM roles and policies, a custom <a>Authorizer</a> or an Amazon Cognito user pool.</div>
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/getting-started-client-side-ssl-authentication.html|Use Client-Side Certificate]]
    */
  @js.native
  trait ClientCertificate extends js.Object {
    var clientCertificateId: js.UndefOr[String]
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[String]
    var expirationDate: js.UndefOr[Timestamp]
    var pemEncodedCertificate: js.UndefOr[String]
    var tags: js.UndefOr[MapOfStringToString]
  }

  object ClientCertificate {
    def apply(
        clientCertificateId: js.UndefOr[String] = js.undefined,
        createdDate: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        expirationDate: js.UndefOr[Timestamp] = js.undefined,
        pemEncodedCertificate: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[MapOfStringToString] = js.undefined
    ): ClientCertificate = {
      val __obj = js.Dictionary.empty[js.Any]
      clientCertificateId.foreach(__v => __obj.update("clientCertificateId", __v.asInstanceOf[js.Any]))
      createdDate.foreach(__v => __obj.update("createdDate", __v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      expirationDate.foreach(__v => __obj.update("expirationDate", __v.asInstanceOf[js.Any]))
      pemEncodedCertificate.foreach(__v => __obj.update("pemEncodedCertificate", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClientCertificate]
    }
  }

  /**
    * Represents a collection of <a>ClientCertificate</a> resources.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/getting-started-client-side-ssl-authentication.html|Use Client-Side Certificate]]
    */
  @js.native
  trait ClientCertificates extends js.Object {
    var items: js.UndefOr[ListOfClientCertificate]
    var position: js.UndefOr[String]
  }

  object ClientCertificates {
    def apply(
        items: js.UndefOr[ListOfClientCertificate] = js.undefined,
        position: js.UndefOr[String] = js.undefined
    ): ClientCertificates = {
      val __obj = js.Dictionary.empty[js.Any]
      items.foreach(__v => __obj.update("items", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClientCertificates]
    }
  }

  object ConnectionTypeEnum {
    val INTERNET = "INTERNET"
    val VPC_LINK = "VPC_LINK"

    val values = IndexedSeq(INTERNET, VPC_LINK)
  }

  object ContentHandlingStrategyEnum {
    val CONVERT_TO_BINARY = "CONVERT_TO_BINARY"
    val CONVERT_TO_TEXT   = "CONVERT_TO_TEXT"

    val values = IndexedSeq(CONVERT_TO_BINARY, CONVERT_TO_TEXT)
  }

  /**
    * Request to create an <a>ApiKey</a> resource.
    */
  @js.native
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

  object CreateApiKeyRequest {
    def apply(
        customerId: js.UndefOr[String] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        enabled: js.UndefOr[Boolean] = js.undefined,
        generateDistinctId: js.UndefOr[Boolean] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        stageKeys: js.UndefOr[ListOfStageKeys] = js.undefined,
        tags: js.UndefOr[MapOfStringToString] = js.undefined,
        value: js.UndefOr[String] = js.undefined
    ): CreateApiKeyRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      customerId.foreach(__v => __obj.update("customerId", __v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      enabled.foreach(__v => __obj.update("enabled", __v.asInstanceOf[js.Any]))
      generateDistinctId.foreach(__v => __obj.update("generateDistinctId", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      stageKeys.foreach(__v => __obj.update("stageKeys", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.update("value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateApiKeyRequest]
    }
  }

  /**
    * Request to add a new <a>Authorizer</a> to an existing <a>RestApi</a> resource.
    */
  @js.native
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

  object CreateAuthorizerRequest {
    def apply(
        name: String,
        restApiId: String,
        `type`: AuthorizerType,
        authType: js.UndefOr[String] = js.undefined,
        authorizerCredentials: js.UndefOr[String] = js.undefined,
        authorizerResultTtlInSeconds: js.UndefOr[NullableInteger] = js.undefined,
        authorizerUri: js.UndefOr[String] = js.undefined,
        identitySource: js.UndefOr[String] = js.undefined,
        identityValidationExpression: js.UndefOr[String] = js.undefined,
        providerARNs: js.UndefOr[ListOfARNs] = js.undefined
    ): CreateAuthorizerRequest = {
      val __obj = js.Dictionary[js.Any](
        "name"      -> name.asInstanceOf[js.Any],
        "restApiId" -> restApiId.asInstanceOf[js.Any],
        "type"      -> `type`.asInstanceOf[js.Any]
      )

      authType.foreach(__v => __obj.update("authType", __v.asInstanceOf[js.Any]))
      authorizerCredentials.foreach(__v => __obj.update("authorizerCredentials", __v.asInstanceOf[js.Any]))
      authorizerResultTtlInSeconds.foreach(
        __v => __obj.update("authorizerResultTtlInSeconds", __v.asInstanceOf[js.Any])
      )
      authorizerUri.foreach(__v => __obj.update("authorizerUri", __v.asInstanceOf[js.Any]))
      identitySource.foreach(__v => __obj.update("identitySource", __v.asInstanceOf[js.Any]))
      identityValidationExpression.foreach(
        __v => __obj.update("identityValidationExpression", __v.asInstanceOf[js.Any])
      )
      providerARNs.foreach(__v => __obj.update("providerARNs", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateAuthorizerRequest]
    }
  }

  /**
    * Requests API Gateway to create a new <a>BasePathMapping</a> resource.
    */
  @js.native
  trait CreateBasePathMappingRequest extends js.Object {
    var domainName: String
    var restApiId: String
    var basePath: js.UndefOr[String]
    var stage: js.UndefOr[String]
  }

  object CreateBasePathMappingRequest {
    def apply(
        domainName: String,
        restApiId: String,
        basePath: js.UndefOr[String] = js.undefined,
        stage: js.UndefOr[String] = js.undefined
    ): CreateBasePathMappingRequest = {
      val __obj = js.Dictionary[js.Any](
        "domainName" -> domainName.asInstanceOf[js.Any],
        "restApiId"  -> restApiId.asInstanceOf[js.Any]
      )

      basePath.foreach(__v => __obj.update("basePath", __v.asInstanceOf[js.Any]))
      stage.foreach(__v => __obj.update("stage", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateBasePathMappingRequest]
    }
  }

  /**
    * Requests API Gateway to create a <a>Deployment</a> resource.
    */
  @js.native
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

  object CreateDeploymentRequest {
    def apply(
        restApiId: String,
        cacheClusterEnabled: js.UndefOr[NullableBoolean] = js.undefined,
        cacheClusterSize: js.UndefOr[CacheClusterSize] = js.undefined,
        canarySettings: js.UndefOr[DeploymentCanarySettings] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        stageDescription: js.UndefOr[String] = js.undefined,
        stageName: js.UndefOr[String] = js.undefined,
        tracingEnabled: js.UndefOr[NullableBoolean] = js.undefined,
        variables: js.UndefOr[MapOfStringToString] = js.undefined
    ): CreateDeploymentRequest = {
      val __obj = js.Dictionary[js.Any](
        "restApiId" -> restApiId.asInstanceOf[js.Any]
      )

      cacheClusterEnabled.foreach(__v => __obj.update("cacheClusterEnabled", __v.asInstanceOf[js.Any]))
      cacheClusterSize.foreach(__v => __obj.update("cacheClusterSize", __v.asInstanceOf[js.Any]))
      canarySettings.foreach(__v => __obj.update("canarySettings", __v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      stageDescription.foreach(__v => __obj.update("stageDescription", __v.asInstanceOf[js.Any]))
      stageName.foreach(__v => __obj.update("stageName", __v.asInstanceOf[js.Any]))
      tracingEnabled.foreach(__v => __obj.update("tracingEnabled", __v.asInstanceOf[js.Any]))
      variables.foreach(__v => __obj.update("variables", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeploymentRequest]
    }
  }

  /**
    * Creates a new documentation part of a given API.
    */
  @js.native
  trait CreateDocumentationPartRequest extends js.Object {
    var location: DocumentationPartLocation
    var properties: String
    var restApiId: String
  }

  object CreateDocumentationPartRequest {
    def apply(
        location: DocumentationPartLocation,
        properties: String,
        restApiId: String
    ): CreateDocumentationPartRequest = {
      val __obj = js.Dictionary[js.Any](
        "location"   -> location.asInstanceOf[js.Any],
        "properties" -> properties.asInstanceOf[js.Any],
        "restApiId"  -> restApiId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateDocumentationPartRequest]
    }
  }

  /**
    * Creates a new documentation version of a given API.
    */
  @js.native
  trait CreateDocumentationVersionRequest extends js.Object {
    var documentationVersion: String
    var restApiId: String
    var description: js.UndefOr[String]
    var stageName: js.UndefOr[String]
  }

  object CreateDocumentationVersionRequest {
    def apply(
        documentationVersion: String,
        restApiId: String,
        description: js.UndefOr[String] = js.undefined,
        stageName: js.UndefOr[String] = js.undefined
    ): CreateDocumentationVersionRequest = {
      val __obj = js.Dictionary[js.Any](
        "documentationVersion" -> documentationVersion.asInstanceOf[js.Any],
        "restApiId"            -> restApiId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      stageName.foreach(__v => __obj.update("stageName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDocumentationVersionRequest]
    }
  }

  /**
    * A request to create a new domain name.
    */
  @js.native
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

  object CreateDomainNameRequest {
    def apply(
        domainName: String,
        certificateArn: js.UndefOr[String] = js.undefined,
        certificateBody: js.UndefOr[String] = js.undefined,
        certificateChain: js.UndefOr[String] = js.undefined,
        certificateName: js.UndefOr[String] = js.undefined,
        certificatePrivateKey: js.UndefOr[String] = js.undefined,
        endpointConfiguration: js.UndefOr[EndpointConfiguration] = js.undefined,
        regionalCertificateArn: js.UndefOr[String] = js.undefined,
        regionalCertificateName: js.UndefOr[String] = js.undefined,
        securityPolicy: js.UndefOr[SecurityPolicy] = js.undefined,
        tags: js.UndefOr[MapOfStringToString] = js.undefined
    ): CreateDomainNameRequest = {
      val __obj = js.Dictionary[js.Any](
        "domainName" -> domainName.asInstanceOf[js.Any]
      )

      certificateArn.foreach(__v => __obj.update("certificateArn", __v.asInstanceOf[js.Any]))
      certificateBody.foreach(__v => __obj.update("certificateBody", __v.asInstanceOf[js.Any]))
      certificateChain.foreach(__v => __obj.update("certificateChain", __v.asInstanceOf[js.Any]))
      certificateName.foreach(__v => __obj.update("certificateName", __v.asInstanceOf[js.Any]))
      certificatePrivateKey.foreach(__v => __obj.update("certificatePrivateKey", __v.asInstanceOf[js.Any]))
      endpointConfiguration.foreach(__v => __obj.update("endpointConfiguration", __v.asInstanceOf[js.Any]))
      regionalCertificateArn.foreach(__v => __obj.update("regionalCertificateArn", __v.asInstanceOf[js.Any]))
      regionalCertificateName.foreach(__v => __obj.update("regionalCertificateName", __v.asInstanceOf[js.Any]))
      securityPolicy.foreach(__v => __obj.update("securityPolicy", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDomainNameRequest]
    }
  }

  /**
    * Request to add a new <a>Model</a> to an existing <a>RestApi</a> resource.
    */
  @js.native
  trait CreateModelRequest extends js.Object {
    var contentType: String
    var name: String
    var restApiId: String
    var description: js.UndefOr[String]
    var schema: js.UndefOr[String]
  }

  object CreateModelRequest {
    def apply(
        contentType: String,
        name: String,
        restApiId: String,
        description: js.UndefOr[String] = js.undefined,
        schema: js.UndefOr[String] = js.undefined
    ): CreateModelRequest = {
      val __obj = js.Dictionary[js.Any](
        "contentType" -> contentType.asInstanceOf[js.Any],
        "name"        -> name.asInstanceOf[js.Any],
        "restApiId"   -> restApiId.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      schema.foreach(__v => __obj.update("schema", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateModelRequest]
    }
  }

  /**
    * Creates a <a>RequestValidator</a> of a given <a>RestApi</a>.
    */
  @js.native
  trait CreateRequestValidatorRequest extends js.Object {
    var restApiId: String
    var name: js.UndefOr[String]
    var validateRequestBody: js.UndefOr[Boolean]
    var validateRequestParameters: js.UndefOr[Boolean]
  }

  object CreateRequestValidatorRequest {
    def apply(
        restApiId: String,
        name: js.UndefOr[String] = js.undefined,
        validateRequestBody: js.UndefOr[Boolean] = js.undefined,
        validateRequestParameters: js.UndefOr[Boolean] = js.undefined
    ): CreateRequestValidatorRequest = {
      val __obj = js.Dictionary[js.Any](
        "restApiId" -> restApiId.asInstanceOf[js.Any]
      )

      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      validateRequestBody.foreach(__v => __obj.update("validateRequestBody", __v.asInstanceOf[js.Any]))
      validateRequestParameters.foreach(__v => __obj.update("validateRequestParameters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRequestValidatorRequest]
    }
  }

  /**
    * Requests API Gateway to create a <a>Resource</a> resource.
    */
  @js.native
  trait CreateResourceRequest extends js.Object {
    var parentId: String
    var pathPart: String
    var restApiId: String
  }

  object CreateResourceRequest {
    def apply(
        parentId: String,
        pathPart: String,
        restApiId: String
    ): CreateResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "parentId"  -> parentId.asInstanceOf[js.Any],
        "pathPart"  -> pathPart.asInstanceOf[js.Any],
        "restApiId" -> restApiId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateResourceRequest]
    }
  }

  /**
    * The POST Request to add a new <a>RestApi</a> resource to your collection.
    */
  @js.native
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

  object CreateRestApiRequest {
    def apply(
        name: String,
        apiKeySource: js.UndefOr[ApiKeySourceType] = js.undefined,
        binaryMediaTypes: js.UndefOr[ListOfString] = js.undefined,
        cloneFrom: js.UndefOr[String] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        endpointConfiguration: js.UndefOr[EndpointConfiguration] = js.undefined,
        minimumCompressionSize: js.UndefOr[NullableInteger] = js.undefined,
        policy: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[MapOfStringToString] = js.undefined,
        version: js.UndefOr[String] = js.undefined
    ): CreateRestApiRequest = {
      val __obj = js.Dictionary[js.Any](
        "name" -> name.asInstanceOf[js.Any]
      )

      apiKeySource.foreach(__v => __obj.update("apiKeySource", __v.asInstanceOf[js.Any]))
      binaryMediaTypes.foreach(__v => __obj.update("binaryMediaTypes", __v.asInstanceOf[js.Any]))
      cloneFrom.foreach(__v => __obj.update("cloneFrom", __v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      endpointConfiguration.foreach(__v => __obj.update("endpointConfiguration", __v.asInstanceOf[js.Any]))
      minimumCompressionSize.foreach(__v => __obj.update("minimumCompressionSize", __v.asInstanceOf[js.Any]))
      policy.foreach(__v => __obj.update("policy", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.update("version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRestApiRequest]
    }
  }

  /**
    * Requests API Gateway to create a <a>Stage</a> resource.
    */
  @js.native
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

  object CreateStageRequest {
    def apply(
        deploymentId: String,
        restApiId: String,
        stageName: String,
        cacheClusterEnabled: js.UndefOr[Boolean] = js.undefined,
        cacheClusterSize: js.UndefOr[CacheClusterSize] = js.undefined,
        canarySettings: js.UndefOr[CanarySettings] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        documentationVersion: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[MapOfStringToString] = js.undefined,
        tracingEnabled: js.UndefOr[Boolean] = js.undefined,
        variables: js.UndefOr[MapOfStringToString] = js.undefined
    ): CreateStageRequest = {
      val __obj = js.Dictionary[js.Any](
        "deploymentId" -> deploymentId.asInstanceOf[js.Any],
        "restApiId"    -> restApiId.asInstanceOf[js.Any],
        "stageName"    -> stageName.asInstanceOf[js.Any]
      )

      cacheClusterEnabled.foreach(__v => __obj.update("cacheClusterEnabled", __v.asInstanceOf[js.Any]))
      cacheClusterSize.foreach(__v => __obj.update("cacheClusterSize", __v.asInstanceOf[js.Any]))
      canarySettings.foreach(__v => __obj.update("canarySettings", __v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      documentationVersion.foreach(__v => __obj.update("documentationVersion", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      tracingEnabled.foreach(__v => __obj.update("tracingEnabled", __v.asInstanceOf[js.Any]))
      variables.foreach(__v => __obj.update("variables", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStageRequest]
    }
  }

  /**
    * The POST request to create a usage plan key for adding an existing API key to a usage plan.
    */
  @js.native
  trait CreateUsagePlanKeyRequest extends js.Object {
    var keyId: String
    var keyType: String
    var usagePlanId: String
  }

  object CreateUsagePlanKeyRequest {
    def apply(
        keyId: String,
        keyType: String,
        usagePlanId: String
    ): CreateUsagePlanKeyRequest = {
      val __obj = js.Dictionary[js.Any](
        "keyId"       -> keyId.asInstanceOf[js.Any],
        "keyType"     -> keyType.asInstanceOf[js.Any],
        "usagePlanId" -> usagePlanId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateUsagePlanKeyRequest]
    }
  }

  /**
    * The POST request to create a usage plan with the name, description, throttle limits and quota limits, as well as the associated API stages, specified in the payload.
    */
  @js.native
  trait CreateUsagePlanRequest extends js.Object {
    var name: String
    var apiStages: js.UndefOr[ListOfApiStage]
    var description: js.UndefOr[String]
    var quota: js.UndefOr[QuotaSettings]
    var tags: js.UndefOr[MapOfStringToString]
    var throttle: js.UndefOr[ThrottleSettings]
  }

  object CreateUsagePlanRequest {
    def apply(
        name: String,
        apiStages: js.UndefOr[ListOfApiStage] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        quota: js.UndefOr[QuotaSettings] = js.undefined,
        tags: js.UndefOr[MapOfStringToString] = js.undefined,
        throttle: js.UndefOr[ThrottleSettings] = js.undefined
    ): CreateUsagePlanRequest = {
      val __obj = js.Dictionary[js.Any](
        "name" -> name.asInstanceOf[js.Any]
      )

      apiStages.foreach(__v => __obj.update("apiStages", __v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      quota.foreach(__v => __obj.update("quota", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      throttle.foreach(__v => __obj.update("throttle", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateUsagePlanRequest]
    }
  }

  /**
    * Creates a VPC link, under the caller's account in a selected region, in an asynchronous operation that typically takes 2-4 minutes to complete and become operational. The caller must have permissions to create and update VPC Endpoint services.
    */
  @js.native
  trait CreateVpcLinkRequest extends js.Object {
    var name: String
    var targetArns: ListOfString
    var description: js.UndefOr[String]
    var tags: js.UndefOr[MapOfStringToString]
  }

  object CreateVpcLinkRequest {
    def apply(
        name: String,
        targetArns: ListOfString,
        description: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[MapOfStringToString] = js.undefined
    ): CreateVpcLinkRequest = {
      val __obj = js.Dictionary[js.Any](
        "name"       -> name.asInstanceOf[js.Any],
        "targetArns" -> targetArns.asInstanceOf[js.Any]
      )

      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVpcLinkRequest]
    }
  }

  /**
    * A request to delete the <a>ApiKey</a> resource.
    */
  @js.native
  trait DeleteApiKeyRequest extends js.Object {
    var apiKey: String
  }

  object DeleteApiKeyRequest {
    def apply(
        apiKey: String
    ): DeleteApiKeyRequest = {
      val __obj = js.Dictionary[js.Any](
        "apiKey" -> apiKey.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteApiKeyRequest]
    }
  }

  /**
    * Request to delete an existing <a>Authorizer</a> resource.
    */
  @js.native
  trait DeleteAuthorizerRequest extends js.Object {
    var authorizerId: String
    var restApiId: String
  }

  object DeleteAuthorizerRequest {
    def apply(
        authorizerId: String,
        restApiId: String
    ): DeleteAuthorizerRequest = {
      val __obj = js.Dictionary[js.Any](
        "authorizerId" -> authorizerId.asInstanceOf[js.Any],
        "restApiId"    -> restApiId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteAuthorizerRequest]
    }
  }

  /**
    * A request to delete the <a>BasePathMapping</a> resource.
    */
  @js.native
  trait DeleteBasePathMappingRequest extends js.Object {
    var basePath: String
    var domainName: String
  }

  object DeleteBasePathMappingRequest {
    def apply(
        basePath: String,
        domainName: String
    ): DeleteBasePathMappingRequest = {
      val __obj = js.Dictionary[js.Any](
        "basePath"   -> basePath.asInstanceOf[js.Any],
        "domainName" -> domainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteBasePathMappingRequest]
    }
  }

  /**
    * A request to delete the <a>ClientCertificate</a> resource.
    */
  @js.native
  trait DeleteClientCertificateRequest extends js.Object {
    var clientCertificateId: String
  }

  object DeleteClientCertificateRequest {
    def apply(
        clientCertificateId: String
    ): DeleteClientCertificateRequest = {
      val __obj = js.Dictionary[js.Any](
        "clientCertificateId" -> clientCertificateId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteClientCertificateRequest]
    }
  }

  /**
    * Requests API Gateway to delete a <a>Deployment</a> resource.
    */
  @js.native
  trait DeleteDeploymentRequest extends js.Object {
    var deploymentId: String
    var restApiId: String
  }

  object DeleteDeploymentRequest {
    def apply(
        deploymentId: String,
        restApiId: String
    ): DeleteDeploymentRequest = {
      val __obj = js.Dictionary[js.Any](
        "deploymentId" -> deploymentId.asInstanceOf[js.Any],
        "restApiId"    -> restApiId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDeploymentRequest]
    }
  }

  /**
    * Deletes an existing documentation part of an API.
    */
  @js.native
  trait DeleteDocumentationPartRequest extends js.Object {
    var documentationPartId: String
    var restApiId: String
  }

  object DeleteDocumentationPartRequest {
    def apply(
        documentationPartId: String,
        restApiId: String
    ): DeleteDocumentationPartRequest = {
      val __obj = js.Dictionary[js.Any](
        "documentationPartId" -> documentationPartId.asInstanceOf[js.Any],
        "restApiId"           -> restApiId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDocumentationPartRequest]
    }
  }

  /**
    * Deletes an existing documentation version of an API.
    */
  @js.native
  trait DeleteDocumentationVersionRequest extends js.Object {
    var documentationVersion: String
    var restApiId: String
  }

  object DeleteDocumentationVersionRequest {
    def apply(
        documentationVersion: String,
        restApiId: String
    ): DeleteDocumentationVersionRequest = {
      val __obj = js.Dictionary[js.Any](
        "documentationVersion" -> documentationVersion.asInstanceOf[js.Any],
        "restApiId"            -> restApiId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDocumentationVersionRequest]
    }
  }

  /**
    * A request to delete the <a>DomainName</a> resource.
    */
  @js.native
  trait DeleteDomainNameRequest extends js.Object {
    var domainName: String
  }

  object DeleteDomainNameRequest {
    def apply(
        domainName: String
    ): DeleteDomainNameRequest = {
      val __obj = js.Dictionary[js.Any](
        "domainName" -> domainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteDomainNameRequest]
    }
  }

  /**
    * Clears any customization of a <a>GatewayResponse</a> of a specified response type on the given <a>RestApi</a> and resets it with the default settings.
    */
  @js.native
  trait DeleteGatewayResponseRequest extends js.Object {
    var responseType: GatewayResponseType
    var restApiId: String
  }

  object DeleteGatewayResponseRequest {
    def apply(
        responseType: GatewayResponseType,
        restApiId: String
    ): DeleteGatewayResponseRequest = {
      val __obj = js.Dictionary[js.Any](
        "responseType" -> responseType.asInstanceOf[js.Any],
        "restApiId"    -> restApiId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteGatewayResponseRequest]
    }
  }

  /**
    * Represents a delete integration request.
    */
  @js.native
  trait DeleteIntegrationRequest extends js.Object {
    var httpMethod: String
    var resourceId: String
    var restApiId: String
  }

  object DeleteIntegrationRequest {
    def apply(
        httpMethod: String,
        resourceId: String,
        restApiId: String
    ): DeleteIntegrationRequest = {
      val __obj = js.Dictionary[js.Any](
        "httpMethod" -> httpMethod.asInstanceOf[js.Any],
        "resourceId" -> resourceId.asInstanceOf[js.Any],
        "restApiId"  -> restApiId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteIntegrationRequest]
    }
  }

  /**
    * Represents a delete integration response request.
    */
  @js.native
  trait DeleteIntegrationResponseRequest extends js.Object {
    var httpMethod: String
    var resourceId: String
    var restApiId: String
    var statusCode: StatusCode
  }

  object DeleteIntegrationResponseRequest {
    def apply(
        httpMethod: String,
        resourceId: String,
        restApiId: String,
        statusCode: StatusCode
    ): DeleteIntegrationResponseRequest = {
      val __obj = js.Dictionary[js.Any](
        "httpMethod" -> httpMethod.asInstanceOf[js.Any],
        "resourceId" -> resourceId.asInstanceOf[js.Any],
        "restApiId"  -> restApiId.asInstanceOf[js.Any],
        "statusCode" -> statusCode.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteIntegrationResponseRequest]
    }
  }

  /**
    * Request to delete an existing <a>Method</a> resource.
    */
  @js.native
  trait DeleteMethodRequest extends js.Object {
    var httpMethod: String
    var resourceId: String
    var restApiId: String
  }

  object DeleteMethodRequest {
    def apply(
        httpMethod: String,
        resourceId: String,
        restApiId: String
    ): DeleteMethodRequest = {
      val __obj = js.Dictionary[js.Any](
        "httpMethod" -> httpMethod.asInstanceOf[js.Any],
        "resourceId" -> resourceId.asInstanceOf[js.Any],
        "restApiId"  -> restApiId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteMethodRequest]
    }
  }

  /**
    * A request to delete an existing <a>MethodResponse</a> resource.
    */
  @js.native
  trait DeleteMethodResponseRequest extends js.Object {
    var httpMethod: String
    var resourceId: String
    var restApiId: String
    var statusCode: StatusCode
  }

  object DeleteMethodResponseRequest {
    def apply(
        httpMethod: String,
        resourceId: String,
        restApiId: String,
        statusCode: StatusCode
    ): DeleteMethodResponseRequest = {
      val __obj = js.Dictionary[js.Any](
        "httpMethod" -> httpMethod.asInstanceOf[js.Any],
        "resourceId" -> resourceId.asInstanceOf[js.Any],
        "restApiId"  -> restApiId.asInstanceOf[js.Any],
        "statusCode" -> statusCode.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteMethodResponseRequest]
    }
  }

  /**
    * Request to delete an existing model in an existing <a>RestApi</a> resource.
    */
  @js.native
  trait DeleteModelRequest extends js.Object {
    var modelName: String
    var restApiId: String
  }

  object DeleteModelRequest {
    def apply(
        modelName: String,
        restApiId: String
    ): DeleteModelRequest = {
      val __obj = js.Dictionary[js.Any](
        "modelName" -> modelName.asInstanceOf[js.Any],
        "restApiId" -> restApiId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteModelRequest]
    }
  }

  /**
    * Deletes a specified <a>RequestValidator</a> of a given <a>RestApi</a>.
    */
  @js.native
  trait DeleteRequestValidatorRequest extends js.Object {
    var requestValidatorId: String
    var restApiId: String
  }

  object DeleteRequestValidatorRequest {
    def apply(
        requestValidatorId: String,
        restApiId: String
    ): DeleteRequestValidatorRequest = {
      val __obj = js.Dictionary[js.Any](
        "requestValidatorId" -> requestValidatorId.asInstanceOf[js.Any],
        "restApiId"          -> restApiId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteRequestValidatorRequest]
    }
  }

  /**
    * Request to delete a <a>Resource</a>.
    */
  @js.native
  trait DeleteResourceRequest extends js.Object {
    var resourceId: String
    var restApiId: String
  }

  object DeleteResourceRequest {
    def apply(
        resourceId: String,
        restApiId: String
    ): DeleteResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "resourceId" -> resourceId.asInstanceOf[js.Any],
        "restApiId"  -> restApiId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteResourceRequest]
    }
  }

  /**
    * Request to delete the specified API from your collection.
    */
  @js.native
  trait DeleteRestApiRequest extends js.Object {
    var restApiId: String
  }

  object DeleteRestApiRequest {
    def apply(
        restApiId: String
    ): DeleteRestApiRequest = {
      val __obj = js.Dictionary[js.Any](
        "restApiId" -> restApiId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteRestApiRequest]
    }
  }

  /**
    * Requests API Gateway to delete a <a>Stage</a> resource.
    */
  @js.native
  trait DeleteStageRequest extends js.Object {
    var restApiId: String
    var stageName: String
  }

  object DeleteStageRequest {
    def apply(
        restApiId: String,
        stageName: String
    ): DeleteStageRequest = {
      val __obj = js.Dictionary[js.Any](
        "restApiId" -> restApiId.asInstanceOf[js.Any],
        "stageName" -> stageName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteStageRequest]
    }
  }

  /**
    * The DELETE request to delete a usage plan key and remove the underlying API key from the associated usage plan.
    */
  @js.native
  trait DeleteUsagePlanKeyRequest extends js.Object {
    var keyId: String
    var usagePlanId: String
  }

  object DeleteUsagePlanKeyRequest {
    def apply(
        keyId: String,
        usagePlanId: String
    ): DeleteUsagePlanKeyRequest = {
      val __obj = js.Dictionary[js.Any](
        "keyId"       -> keyId.asInstanceOf[js.Any],
        "usagePlanId" -> usagePlanId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteUsagePlanKeyRequest]
    }
  }

  /**
    * The DELETE request to delete a usage plan of a given plan Id.
    */
  @js.native
  trait DeleteUsagePlanRequest extends js.Object {
    var usagePlanId: String
  }

  object DeleteUsagePlanRequest {
    def apply(
        usagePlanId: String
    ): DeleteUsagePlanRequest = {
      val __obj = js.Dictionary[js.Any](
        "usagePlanId" -> usagePlanId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteUsagePlanRequest]
    }
  }

  /**
    * Deletes an existing <a>VpcLink</a> of a specified identifier.
    */
  @js.native
  trait DeleteVpcLinkRequest extends js.Object {
    var vpcLinkId: String
  }

  object DeleteVpcLinkRequest {
    def apply(
        vpcLinkId: String
    ): DeleteVpcLinkRequest = {
      val __obj = js.Dictionary[js.Any](
        "vpcLinkId" -> vpcLinkId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteVpcLinkRequest]
    }
  }

  /**
    * An immutable representation of a <a>RestApi</a> resource that can be called by users using <a>Stages</a>. A deployment must be associated with a <a>Stage</a> for it to be callable over the Internet.
    *  <div class="remarks">To create a deployment, call <code>POST</code> on the <a>Deployments</a> resource of a <a>RestApi</a>. To view, update, or delete a deployment, call <code>GET</code>, <code>PATCH</code>, or <code>DELETE</code> on the specified deployment resource (<code>/restapis/{restapi_id}/deployments/{deployment_id}</code>).</div>
    * @see <a>RestApi</a>, <a>Deployments</a>, <a>Stage</a>, [[https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-deployment.html|AWS CLI]], [[https://aws.amazon.com/tools/|AWS SDKs]]
    */
  @js.native
  trait Deployment extends js.Object {
    var apiSummary: js.UndefOr[PathToMapOfMethodSnapshot]
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[String]
    var id: js.UndefOr[String]
  }

  object Deployment {
    def apply(
        apiSummary: js.UndefOr[PathToMapOfMethodSnapshot] = js.undefined,
        createdDate: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        id: js.UndefOr[String] = js.undefined
    ): Deployment = {
      val __obj = js.Dictionary.empty[js.Any]
      apiSummary.foreach(__v => __obj.update("apiSummary", __v.asInstanceOf[js.Any]))
      createdDate.foreach(__v => __obj.update("createdDate", __v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.update("id", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Deployment]
    }
  }

  /**
    * The input configuration for a canary deployment.
    */
  @js.native
  trait DeploymentCanarySettings extends js.Object {
    var percentTraffic: js.UndefOr[Double]
    var stageVariableOverrides: js.UndefOr[MapOfStringToString]
    var useStageCache: js.UndefOr[Boolean]
  }

  object DeploymentCanarySettings {
    def apply(
        percentTraffic: js.UndefOr[Double] = js.undefined,
        stageVariableOverrides: js.UndefOr[MapOfStringToString] = js.undefined,
        useStageCache: js.UndefOr[Boolean] = js.undefined
    ): DeploymentCanarySettings = {
      val __obj = js.Dictionary.empty[js.Any]
      percentTraffic.foreach(__v => __obj.update("percentTraffic", __v.asInstanceOf[js.Any]))
      stageVariableOverrides.foreach(__v => __obj.update("stageVariableOverrides", __v.asInstanceOf[js.Any]))
      useStageCache.foreach(__v => __obj.update("useStageCache", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeploymentCanarySettings]
    }
  }

  /**
    * Represents a collection resource that contains zero or more references to your existing deployments, and links that guide you on how to interact with your collection. The collection offers a paginated view of the contained deployments.
    *  <div class="remarks">To create a new deployment of a <a>RestApi</a>, make a <code>POST</code> request against this resource. To view, update, or delete an existing deployment, make a <code>GET</code>, <code>PATCH</code>, or <code>DELETE</code> request, respectively, on a specified <a>Deployment</a> resource.</div>
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-deploy-api.html|Deploying an API]], [[https://docs.aws.amazon.com/cli/latest/reference/apigateway/get-deployment.html|AWS CLI]], [[https://aws.amazon.com/tools/|AWS SDKs]]
    */
  @js.native
  trait Deployments extends js.Object {
    var items: js.UndefOr[ListOfDeployment]
    var position: js.UndefOr[String]
  }

  object Deployments {
    def apply(
        items: js.UndefOr[ListOfDeployment] = js.undefined,
        position: js.UndefOr[String] = js.undefined
    ): Deployments = {
      val __obj = js.Dictionary.empty[js.Any]
      items.foreach(__v => __obj.update("items", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Deployments]
    }
  }

  /**
    * A documentation part for a targeted API entity.
    *  <div class="remarks"> A documentation part consists of a content map (<code>properties</code>) and a target (<code>location</code>). The target specifies an API entity to which the documentation content applies. The supported API entity types are <code>API</code>, <code>AUTHORIZER</code>, <code>MODEL</code>, <code>RESOURCE</code>, <code>METHOD</code>, <code>PATH_PARAMETER</code>, <code>QUERY_PARAMETER</code>, <code>REQUEST_HEADER</code>, <code>REQUEST_BODY</code>, <code>RESPONSE</code>, <code>RESPONSE_HEADER</code>, and <code>RESPONSE_BODY</code>. Valid <code>location</code> fields depend on the API entity type. All valid fields are not required.
    *  The content map is a JSON string of API-specific key-value pairs. Although an API can use any shape for the content map, only the OpenAPI-compliant documentation fields will be injected into the associated API entity definition in the exported OpenAPI definition file.
    * </div>
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-documenting-api.html|Documenting an API]], <a>DocumentationParts</a>
    */
  @js.native
  trait DocumentationPart extends js.Object {
    var id: js.UndefOr[String]
    var location: js.UndefOr[DocumentationPartLocation]
    var properties: js.UndefOr[String]
  }

  object DocumentationPart {
    def apply(
        id: js.UndefOr[String] = js.undefined,
        location: js.UndefOr[DocumentationPartLocation] = js.undefined,
        properties: js.UndefOr[String] = js.undefined
    ): DocumentationPart = {
      val __obj = js.Dictionary.empty[js.Any]
      id.foreach(__v => __obj.update("id", __v.asInstanceOf[js.Any]))
      location.foreach(__v => __obj.update("location", __v.asInstanceOf[js.Any]))
      properties.foreach(__v => __obj.update("properties", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentationPart]
    }
  }

  /**
    * A collection of the imported <a>DocumentationPart</a> identifiers.
    *  <div class="remarks">This is used to return the result when documentation parts in an external (e.g., OpenAPI) file are imported into API Gateway</div>
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-documenting-api.html|Documenting an API]], [[https://docs.aws.amazon.com/apigateway/api-reference/link-relation/documentationpart-import/|documentationpart:import]], <a>DocumentationPart</a>
    */
  @js.native
  trait DocumentationPartIds extends js.Object {
    var ids: js.UndefOr[ListOfString]
    var warnings: js.UndefOr[ListOfString]
  }

  object DocumentationPartIds {
    def apply(
        ids: js.UndefOr[ListOfString] = js.undefined,
        warnings: js.UndefOr[ListOfString] = js.undefined
    ): DocumentationPartIds = {
      val __obj = js.Dictionary.empty[js.Any]
      ids.foreach(__v => __obj.update("ids", __v.asInstanceOf[js.Any]))
      warnings.foreach(__v => __obj.update("warnings", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentationPartIds]
    }
  }

  /**
    * Specifies the target API entity to which the documentation applies.
    */
  @js.native
  trait DocumentationPartLocation extends js.Object {
    var `type`: DocumentationPartType
    var method: js.UndefOr[String]
    var name: js.UndefOr[String]
    var path: js.UndefOr[String]
    var statusCode: js.UndefOr[DocumentationPartLocationStatusCode]
  }

  object DocumentationPartLocation {
    def apply(
        `type`: DocumentationPartType,
        method: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        path: js.UndefOr[String] = js.undefined,
        statusCode: js.UndefOr[DocumentationPartLocationStatusCode] = js.undefined
    ): DocumentationPartLocation = {
      val __obj = js.Dictionary[js.Any](
        "type" -> `type`.asInstanceOf[js.Any]
      )

      method.foreach(__v => __obj.update("method", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      path.foreach(__v => __obj.update("path", __v.asInstanceOf[js.Any]))
      statusCode.foreach(__v => __obj.update("statusCode", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentationPartLocation]
    }
  }

  object DocumentationPartTypeEnum {
    val API             = "API"
    val AUTHORIZER      = "AUTHORIZER"
    val MODEL           = "MODEL"
    val RESOURCE        = "RESOURCE"
    val METHOD          = "METHOD"
    val PATH_PARAMETER  = "PATH_PARAMETER"
    val QUERY_PARAMETER = "QUERY_PARAMETER"
    val REQUEST_HEADER  = "REQUEST_HEADER"
    val REQUEST_BODY    = "REQUEST_BODY"
    val RESPONSE        = "RESPONSE"
    val RESPONSE_HEADER = "RESPONSE_HEADER"
    val RESPONSE_BODY   = "RESPONSE_BODY"

    val values = IndexedSeq(
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
  }

  /**
    * The collection of documentation parts of an API.
    *  <div class="remarks"/>
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-documenting-api.html|Documenting an API]], <a>DocumentationPart</a>
    */
  @js.native
  trait DocumentationParts extends js.Object {
    var items: js.UndefOr[ListOfDocumentationPart]
    var position: js.UndefOr[String]
  }

  object DocumentationParts {
    def apply(
        items: js.UndefOr[ListOfDocumentationPart] = js.undefined,
        position: js.UndefOr[String] = js.undefined
    ): DocumentationParts = {
      val __obj = js.Dictionary.empty[js.Any]
      items.foreach(__v => __obj.update("items", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentationParts]
    }
  }

  /**
    * A snapshot of the documentation of an API.
    *  <div class="remarks">Publishing API documentation involves creating a documentation version associated with an API stage and exporting the versioned documentation to an external (e.g., OpenAPI) file.
    * </div>
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-documenting-api.html|Documenting an API]], <a>DocumentationPart</a>, <a>DocumentationVersions</a>
    */
  @js.native
  trait DocumentationVersion extends js.Object {
    var createdDate: js.UndefOr[Timestamp]
    var description: js.UndefOr[String]
    var version: js.UndefOr[String]
  }

  object DocumentationVersion {
    def apply(
        createdDate: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        version: js.UndefOr[String] = js.undefined
    ): DocumentationVersion = {
      val __obj = js.Dictionary.empty[js.Any]
      createdDate.foreach(__v => __obj.update("createdDate", __v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.update("version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentationVersion]
    }
  }

  /**
    * The collection of documentation snapshots of an API.
    *  <div class="remarks">Use the <a>DocumentationVersions</a> to manage documentation snapshots associated with various API stages.
    * </div>
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-documenting-api.html|Documenting an API]], <a>DocumentationPart</a>, <a>DocumentationVersion</a>
    */
  @js.native
  trait DocumentationVersions extends js.Object {
    var items: js.UndefOr[ListOfDocumentationVersion]
    var position: js.UndefOr[String]
  }

  object DocumentationVersions {
    def apply(
        items: js.UndefOr[ListOfDocumentationVersion] = js.undefined,
        position: js.UndefOr[String] = js.undefined
    ): DocumentationVersions = {
      val __obj = js.Dictionary.empty[js.Any]
      items.foreach(__v => __obj.update("items", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DocumentationVersions]
    }
  }

  /**
    * Represents a custom domain name as a user-friendly host name of an API (<a>RestApi</a>).
    *  <div class="Remarks"> When you deploy an API, API Gateway creates a default host name for the API. This default API host name is of the <code>{restapi-id}.execute-api.{region}.amazonaws.com</code> format. With the default host name, you can access the API's root resource with the URL of <code>https://{restapi-id}.execute-api.{region}.amazonaws.com/{stage}/</code>. When you set up a custom domain name of <code>apis.example.com</code> for this API, you can then access the same resource using the URL of the <code>https://apis.examples.com/myApi</code>, where <code>myApi</code> is the base path mapping (<a>BasePathMapping</a>) of your API under the custom domain name.
    *  </div>
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-custom-domains.html|Set a Custom Host Name for an API]]
    */
  @js.native
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

  object DomainName {
    def apply(
        certificateArn: js.UndefOr[String] = js.undefined,
        certificateName: js.UndefOr[String] = js.undefined,
        certificateUploadDate: js.UndefOr[Timestamp] = js.undefined,
        distributionDomainName: js.UndefOr[String] = js.undefined,
        distributionHostedZoneId: js.UndefOr[String] = js.undefined,
        domainName: js.UndefOr[String] = js.undefined,
        domainNameStatus: js.UndefOr[DomainNameStatus] = js.undefined,
        domainNameStatusMessage: js.UndefOr[String] = js.undefined,
        endpointConfiguration: js.UndefOr[EndpointConfiguration] = js.undefined,
        regionalCertificateArn: js.UndefOr[String] = js.undefined,
        regionalCertificateName: js.UndefOr[String] = js.undefined,
        regionalDomainName: js.UndefOr[String] = js.undefined,
        regionalHostedZoneId: js.UndefOr[String] = js.undefined,
        securityPolicy: js.UndefOr[SecurityPolicy] = js.undefined,
        tags: js.UndefOr[MapOfStringToString] = js.undefined
    ): DomainName = {
      val __obj = js.Dictionary.empty[js.Any]
      certificateArn.foreach(__v => __obj.update("certificateArn", __v.asInstanceOf[js.Any]))
      certificateName.foreach(__v => __obj.update("certificateName", __v.asInstanceOf[js.Any]))
      certificateUploadDate.foreach(__v => __obj.update("certificateUploadDate", __v.asInstanceOf[js.Any]))
      distributionDomainName.foreach(__v => __obj.update("distributionDomainName", __v.asInstanceOf[js.Any]))
      distributionHostedZoneId.foreach(__v => __obj.update("distributionHostedZoneId", __v.asInstanceOf[js.Any]))
      domainName.foreach(__v => __obj.update("domainName", __v.asInstanceOf[js.Any]))
      domainNameStatus.foreach(__v => __obj.update("domainNameStatus", __v.asInstanceOf[js.Any]))
      domainNameStatusMessage.foreach(__v => __obj.update("domainNameStatusMessage", __v.asInstanceOf[js.Any]))
      endpointConfiguration.foreach(__v => __obj.update("endpointConfiguration", __v.asInstanceOf[js.Any]))
      regionalCertificateArn.foreach(__v => __obj.update("regionalCertificateArn", __v.asInstanceOf[js.Any]))
      regionalCertificateName.foreach(__v => __obj.update("regionalCertificateName", __v.asInstanceOf[js.Any]))
      regionalDomainName.foreach(__v => __obj.update("regionalDomainName", __v.asInstanceOf[js.Any]))
      regionalHostedZoneId.foreach(__v => __obj.update("regionalHostedZoneId", __v.asInstanceOf[js.Any]))
      securityPolicy.foreach(__v => __obj.update("securityPolicy", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainName]
    }
  }

  object DomainNameStatusEnum {
    val AVAILABLE = "AVAILABLE"
    val UPDATING  = "UPDATING"
    val PENDING   = "PENDING"

    val values = IndexedSeq(AVAILABLE, UPDATING, PENDING)
  }

  /**
    * Represents a collection of <a>DomainName</a> resources.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-custom-domains.html|Use Client-Side Certificate]]
    */
  @js.native
  trait DomainNames extends js.Object {
    var items: js.UndefOr[ListOfDomainName]
    var position: js.UndefOr[String]
  }

  object DomainNames {
    def apply(
        items: js.UndefOr[ListOfDomainName] = js.undefined,
        position: js.UndefOr[String] = js.undefined
    ): DomainNames = {
      val __obj = js.Dictionary.empty[js.Any]
      items.foreach(__v => __obj.update("items", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DomainNames]
    }
  }

  /**
    * The endpoint configuration to indicate the types of endpoints an API (<a>RestApi</a>) or its custom domain name (<a>DomainName</a>) has.
    */
  @js.native
  trait EndpointConfiguration extends js.Object {
    var types: js.UndefOr[ListOfEndpointType]
  }

  object EndpointConfiguration {
    def apply(
        types: js.UndefOr[ListOfEndpointType] = js.undefined
    ): EndpointConfiguration = {
      val __obj = js.Dictionary.empty[js.Any]
      types.foreach(__v => __obj.update("types", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointConfiguration]
    }
  }

  /**
    * The endpoint type. The valid values are <code>EDGE</code> for edge-optimized API setup, most suitable for mobile applications; <code>REGIONAL</code> for regional API endpoint setup, most suitable for calling from AWS Region; and <code>PRIVATE</code> for private APIs.
    */
  object EndpointTypeEnum {
    val REGIONAL = "REGIONAL"
    val EDGE     = "EDGE"
    val PRIVATE  = "PRIVATE"

    val values = IndexedSeq(REGIONAL, EDGE, PRIVATE)
  }

  /**
    * The binary blob response to <a>GetExport</a>, which contains the generated SDK.
    */
  @js.native
  trait ExportResponse extends js.Object {
    var body: js.UndefOr[Blob]
    var contentDisposition: js.UndefOr[String]
    var contentType: js.UndefOr[String]
  }

  object ExportResponse {
    def apply(
        body: js.UndefOr[Blob] = js.undefined,
        contentDisposition: js.UndefOr[String] = js.undefined,
        contentType: js.UndefOr[String] = js.undefined
    ): ExportResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      body.foreach(__v => __obj.update("body", __v.asInstanceOf[js.Any]))
      contentDisposition.foreach(__v => __obj.update("contentDisposition", __v.asInstanceOf[js.Any]))
      contentType.foreach(__v => __obj.update("contentType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ExportResponse]
    }
  }

  /**
    * Request to flush authorizer cache entries on a specified stage.
    */
  @js.native
  trait FlushStageAuthorizersCacheRequest extends js.Object {
    var restApiId: String
    var stageName: String
  }

  object FlushStageAuthorizersCacheRequest {
    def apply(
        restApiId: String,
        stageName: String
    ): FlushStageAuthorizersCacheRequest = {
      val __obj = js.Dictionary[js.Any](
        "restApiId" -> restApiId.asInstanceOf[js.Any],
        "stageName" -> stageName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[FlushStageAuthorizersCacheRequest]
    }
  }

  /**
    * Requests API Gateway to flush a stage's cache.
    */
  @js.native
  trait FlushStageCacheRequest extends js.Object {
    var restApiId: String
    var stageName: String
  }

  object FlushStageCacheRequest {
    def apply(
        restApiId: String,
        stageName: String
    ): FlushStageCacheRequest = {
      val __obj = js.Dictionary[js.Any](
        "restApiId" -> restApiId.asInstanceOf[js.Any],
        "stageName" -> stageName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[FlushStageCacheRequest]
    }
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
  trait GatewayResponse extends js.Object {
    var defaultResponse: js.UndefOr[Boolean]
    var responseParameters: js.UndefOr[MapOfStringToString]
    var responseTemplates: js.UndefOr[MapOfStringToString]
    var responseType: js.UndefOr[GatewayResponseType]
    var statusCode: js.UndefOr[StatusCode]
  }

  object GatewayResponse {
    def apply(
        defaultResponse: js.UndefOr[Boolean] = js.undefined,
        responseParameters: js.UndefOr[MapOfStringToString] = js.undefined,
        responseTemplates: js.UndefOr[MapOfStringToString] = js.undefined,
        responseType: js.UndefOr[GatewayResponseType] = js.undefined,
        statusCode: js.UndefOr[StatusCode] = js.undefined
    ): GatewayResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      defaultResponse.foreach(__v => __obj.update("defaultResponse", __v.asInstanceOf[js.Any]))
      responseParameters.foreach(__v => __obj.update("responseParameters", __v.asInstanceOf[js.Any]))
      responseTemplates.foreach(__v => __obj.update("responseTemplates", __v.asInstanceOf[js.Any]))
      responseType.foreach(__v => __obj.update("responseType", __v.asInstanceOf[js.Any]))
      statusCode.foreach(__v => __obj.update("statusCode", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GatewayResponse]
    }
  }

  object GatewayResponseTypeEnum {
    val DEFAULT_4XX                    = "DEFAULT_4XX"
    val DEFAULT_5XX                    = "DEFAULT_5XX"
    val RESOURCE_NOT_FOUND             = "RESOURCE_NOT_FOUND"
    val UNAUTHORIZED                   = "UNAUTHORIZED"
    val INVALID_API_KEY                = "INVALID_API_KEY"
    val ACCESS_DENIED                  = "ACCESS_DENIED"
    val AUTHORIZER_FAILURE             = "AUTHORIZER_FAILURE"
    val AUTHORIZER_CONFIGURATION_ERROR = "AUTHORIZER_CONFIGURATION_ERROR"
    val INVALID_SIGNATURE              = "INVALID_SIGNATURE"
    val EXPIRED_TOKEN                  = "EXPIRED_TOKEN"
    val MISSING_AUTHENTICATION_TOKEN   = "MISSING_AUTHENTICATION_TOKEN"
    val INTEGRATION_FAILURE            = "INTEGRATION_FAILURE"
    val INTEGRATION_TIMEOUT            = "INTEGRATION_TIMEOUT"
    val API_CONFIGURATION_ERROR        = "API_CONFIGURATION_ERROR"
    val UNSUPPORTED_MEDIA_TYPE         = "UNSUPPORTED_MEDIA_TYPE"
    val BAD_REQUEST_PARAMETERS         = "BAD_REQUEST_PARAMETERS"
    val BAD_REQUEST_BODY               = "BAD_REQUEST_BODY"
    val REQUEST_TOO_LARGE              = "REQUEST_TOO_LARGE"
    val THROTTLED                      = "THROTTLED"
    val QUOTA_EXCEEDED                 = "QUOTA_EXCEEDED"

    val values = IndexedSeq(
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
  trait GatewayResponses extends js.Object {
    var items: js.UndefOr[ListOfGatewayResponse]
    var position: js.UndefOr[String]
  }

  object GatewayResponses {
    def apply(
        items: js.UndefOr[ListOfGatewayResponse] = js.undefined,
        position: js.UndefOr[String] = js.undefined
    ): GatewayResponses = {
      val __obj = js.Dictionary.empty[js.Any]
      items.foreach(__v => __obj.update("items", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GatewayResponses]
    }
  }

  /**
    * A request to generate a <a>ClientCertificate</a> resource.
    */
  @js.native
  trait GenerateClientCertificateRequest extends js.Object {
    var description: js.UndefOr[String]
    var tags: js.UndefOr[MapOfStringToString]
  }

  object GenerateClientCertificateRequest {
    def apply(
        description: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[MapOfStringToString] = js.undefined
    ): GenerateClientCertificateRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GenerateClientCertificateRequest]
    }
  }

  /**
    * Requests API Gateway to get information about the current <a>Account</a> resource.
    */
  @js.native
  trait GetAccountRequest extends js.Object {}

  object GetAccountRequest {
    def apply(
        ): GetAccountRequest = {
      val __obj = js.Dictionary.empty[js.Any]

      __obj.asInstanceOf[GetAccountRequest]
    }
  }

  /**
    * A request to get information about the current <a>ApiKey</a> resource.
    */
  @js.native
  trait GetApiKeyRequest extends js.Object {
    var apiKey: String
    var includeValue: js.UndefOr[NullableBoolean]
  }

  object GetApiKeyRequest {
    def apply(
        apiKey: String,
        includeValue: js.UndefOr[NullableBoolean] = js.undefined
    ): GetApiKeyRequest = {
      val __obj = js.Dictionary[js.Any](
        "apiKey" -> apiKey.asInstanceOf[js.Any]
      )

      includeValue.foreach(__v => __obj.update("includeValue", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetApiKeyRequest]
    }
  }

  /**
    * A request to get information about the current <a>ApiKeys</a> resource.
    */
  @js.native
  trait GetApiKeysRequest extends js.Object {
    var customerId: js.UndefOr[String]
    var includeValues: js.UndefOr[NullableBoolean]
    var limit: js.UndefOr[NullableInteger]
    var nameQuery: js.UndefOr[String]
    var position: js.UndefOr[String]
  }

  object GetApiKeysRequest {
    def apply(
        customerId: js.UndefOr[String] = js.undefined,
        includeValues: js.UndefOr[NullableBoolean] = js.undefined,
        limit: js.UndefOr[NullableInteger] = js.undefined,
        nameQuery: js.UndefOr[String] = js.undefined,
        position: js.UndefOr[String] = js.undefined
    ): GetApiKeysRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      customerId.foreach(__v => __obj.update("customerId", __v.asInstanceOf[js.Any]))
      includeValues.foreach(__v => __obj.update("includeValues", __v.asInstanceOf[js.Any]))
      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      nameQuery.foreach(__v => __obj.update("nameQuery", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetApiKeysRequest]
    }
  }

  /**
    * Request to describe an existing <a>Authorizer</a> resource.
    */
  @js.native
  trait GetAuthorizerRequest extends js.Object {
    var authorizerId: String
    var restApiId: String
  }

  object GetAuthorizerRequest {
    def apply(
        authorizerId: String,
        restApiId: String
    ): GetAuthorizerRequest = {
      val __obj = js.Dictionary[js.Any](
        "authorizerId" -> authorizerId.asInstanceOf[js.Any],
        "restApiId"    -> restApiId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetAuthorizerRequest]
    }
  }

  /**
    * Request to describe an existing <a>Authorizers</a> resource.
    */
  @js.native
  trait GetAuthorizersRequest extends js.Object {
    var restApiId: String
    var limit: js.UndefOr[NullableInteger]
    var position: js.UndefOr[String]
  }

  object GetAuthorizersRequest {
    def apply(
        restApiId: String,
        limit: js.UndefOr[NullableInteger] = js.undefined,
        position: js.UndefOr[String] = js.undefined
    ): GetAuthorizersRequest = {
      val __obj = js.Dictionary[js.Any](
        "restApiId" -> restApiId.asInstanceOf[js.Any]
      )

      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetAuthorizersRequest]
    }
  }

  /**
    * Request to describe a <a>BasePathMapping</a> resource.
    */
  @js.native
  trait GetBasePathMappingRequest extends js.Object {
    var basePath: String
    var domainName: String
  }

  object GetBasePathMappingRequest {
    def apply(
        basePath: String,
        domainName: String
    ): GetBasePathMappingRequest = {
      val __obj = js.Dictionary[js.Any](
        "basePath"   -> basePath.asInstanceOf[js.Any],
        "domainName" -> domainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetBasePathMappingRequest]
    }
  }

  /**
    * A request to get information about a collection of <a>BasePathMapping</a> resources.
    */
  @js.native
  trait GetBasePathMappingsRequest extends js.Object {
    var domainName: String
    var limit: js.UndefOr[NullableInteger]
    var position: js.UndefOr[String]
  }

  object GetBasePathMappingsRequest {
    def apply(
        domainName: String,
        limit: js.UndefOr[NullableInteger] = js.undefined,
        position: js.UndefOr[String] = js.undefined
    ): GetBasePathMappingsRequest = {
      val __obj = js.Dictionary[js.Any](
        "domainName" -> domainName.asInstanceOf[js.Any]
      )

      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetBasePathMappingsRequest]
    }
  }

  /**
    * A request to get information about the current <a>ClientCertificate</a> resource.
    */
  @js.native
  trait GetClientCertificateRequest extends js.Object {
    var clientCertificateId: String
  }

  object GetClientCertificateRequest {
    def apply(
        clientCertificateId: String
    ): GetClientCertificateRequest = {
      val __obj = js.Dictionary[js.Any](
        "clientCertificateId" -> clientCertificateId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetClientCertificateRequest]
    }
  }

  /**
    * A request to get information about a collection of <a>ClientCertificate</a> resources.
    */
  @js.native
  trait GetClientCertificatesRequest extends js.Object {
    var limit: js.UndefOr[NullableInteger]
    var position: js.UndefOr[String]
  }

  object GetClientCertificatesRequest {
    def apply(
        limit: js.UndefOr[NullableInteger] = js.undefined,
        position: js.UndefOr[String] = js.undefined
    ): GetClientCertificatesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetClientCertificatesRequest]
    }
  }

  /**
    * Requests API Gateway to get information about a <a>Deployment</a> resource.
    */
  @js.native
  trait GetDeploymentRequest extends js.Object {
    var deploymentId: String
    var restApiId: String
    var embed: js.UndefOr[ListOfString]
  }

  object GetDeploymentRequest {
    def apply(
        deploymentId: String,
        restApiId: String,
        embed: js.UndefOr[ListOfString] = js.undefined
    ): GetDeploymentRequest = {
      val __obj = js.Dictionary[js.Any](
        "deploymentId" -> deploymentId.asInstanceOf[js.Any],
        "restApiId"    -> restApiId.asInstanceOf[js.Any]
      )

      embed.foreach(__v => __obj.update("embed", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeploymentRequest]
    }
  }

  /**
    * Requests API Gateway to get information about a <a>Deployments</a> collection.
    */
  @js.native
  trait GetDeploymentsRequest extends js.Object {
    var restApiId: String
    var limit: js.UndefOr[NullableInteger]
    var position: js.UndefOr[String]
  }

  object GetDeploymentsRequest {
    def apply(
        restApiId: String,
        limit: js.UndefOr[NullableInteger] = js.undefined,
        position: js.UndefOr[String] = js.undefined
    ): GetDeploymentsRequest = {
      val __obj = js.Dictionary[js.Any](
        "restApiId" -> restApiId.asInstanceOf[js.Any]
      )

      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeploymentsRequest]
    }
  }

  /**
    * Gets a specified documentation part of a given API.
    */
  @js.native
  trait GetDocumentationPartRequest extends js.Object {
    var documentationPartId: String
    var restApiId: String
  }

  object GetDocumentationPartRequest {
    def apply(
        documentationPartId: String,
        restApiId: String
    ): GetDocumentationPartRequest = {
      val __obj = js.Dictionary[js.Any](
        "documentationPartId" -> documentationPartId.asInstanceOf[js.Any],
        "restApiId"           -> restApiId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDocumentationPartRequest]
    }
  }

  /**
    * Gets the documentation parts of an API. The result may be filtered by the type, name, or path of API entities (targets).
    */
  @js.native
  trait GetDocumentationPartsRequest extends js.Object {
    var restApiId: String
    var limit: js.UndefOr[NullableInteger]
    var locationStatus: js.UndefOr[LocationStatusType]
    var nameQuery: js.UndefOr[String]
    var path: js.UndefOr[String]
    var position: js.UndefOr[String]
    var `type`: js.UndefOr[DocumentationPartType]
  }

  object GetDocumentationPartsRequest {
    def apply(
        restApiId: String,
        limit: js.UndefOr[NullableInteger] = js.undefined,
        locationStatus: js.UndefOr[LocationStatusType] = js.undefined,
        nameQuery: js.UndefOr[String] = js.undefined,
        path: js.UndefOr[String] = js.undefined,
        position: js.UndefOr[String] = js.undefined,
        `type`: js.UndefOr[DocumentationPartType] = js.undefined
    ): GetDocumentationPartsRequest = {
      val __obj = js.Dictionary[js.Any](
        "restApiId" -> restApiId.asInstanceOf[js.Any]
      )

      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      locationStatus.foreach(__v => __obj.update("locationStatus", __v.asInstanceOf[js.Any]))
      nameQuery.foreach(__v => __obj.update("nameQuery", __v.asInstanceOf[js.Any]))
      path.foreach(__v => __obj.update("path", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDocumentationPartsRequest]
    }
  }

  /**
    * Gets a documentation snapshot of an API.
    */
  @js.native
  trait GetDocumentationVersionRequest extends js.Object {
    var documentationVersion: String
    var restApiId: String
  }

  object GetDocumentationVersionRequest {
    def apply(
        documentationVersion: String,
        restApiId: String
    ): GetDocumentationVersionRequest = {
      val __obj = js.Dictionary[js.Any](
        "documentationVersion" -> documentationVersion.asInstanceOf[js.Any],
        "restApiId"            -> restApiId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDocumentationVersionRequest]
    }
  }

  /**
    * Gets the documentation versions of an API.
    */
  @js.native
  trait GetDocumentationVersionsRequest extends js.Object {
    var restApiId: String
    var limit: js.UndefOr[NullableInteger]
    var position: js.UndefOr[String]
  }

  object GetDocumentationVersionsRequest {
    def apply(
        restApiId: String,
        limit: js.UndefOr[NullableInteger] = js.undefined,
        position: js.UndefOr[String] = js.undefined
    ): GetDocumentationVersionsRequest = {
      val __obj = js.Dictionary[js.Any](
        "restApiId" -> restApiId.asInstanceOf[js.Any]
      )

      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDocumentationVersionsRequest]
    }
  }

  /**
    * Request to get the name of a <a>DomainName</a> resource.
    */
  @js.native
  trait GetDomainNameRequest extends js.Object {
    var domainName: String
  }

  object GetDomainNameRequest {
    def apply(
        domainName: String
    ): GetDomainNameRequest = {
      val __obj = js.Dictionary[js.Any](
        "domainName" -> domainName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetDomainNameRequest]
    }
  }

  /**
    * Request to describe a collection of <a>DomainName</a> resources.
    */
  @js.native
  trait GetDomainNamesRequest extends js.Object {
    var limit: js.UndefOr[NullableInteger]
    var position: js.UndefOr[String]
  }

  object GetDomainNamesRequest {
    def apply(
        limit: js.UndefOr[NullableInteger] = js.undefined,
        position: js.UndefOr[String] = js.undefined
    ): GetDomainNamesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDomainNamesRequest]
    }
  }

  /**
    * Request a new export of a <a>RestApi</a> for a particular <a>Stage</a>.
    */
  @js.native
  trait GetExportRequest extends js.Object {
    var exportType: String
    var restApiId: String
    var stageName: String
    var accepts: js.UndefOr[String]
    var parameters: js.UndefOr[MapOfStringToString]
  }

  object GetExportRequest {
    def apply(
        exportType: String,
        restApiId: String,
        stageName: String,
        accepts: js.UndefOr[String] = js.undefined,
        parameters: js.UndefOr[MapOfStringToString] = js.undefined
    ): GetExportRequest = {
      val __obj = js.Dictionary[js.Any](
        "exportType" -> exportType.asInstanceOf[js.Any],
        "restApiId"  -> restApiId.asInstanceOf[js.Any],
        "stageName"  -> stageName.asInstanceOf[js.Any]
      )

      accepts.foreach(__v => __obj.update("accepts", __v.asInstanceOf[js.Any]))
      parameters.foreach(__v => __obj.update("parameters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetExportRequest]
    }
  }

  /**
    * Gets a <a>GatewayResponse</a> of a specified response type on the given <a>RestApi</a>.
    */
  @js.native
  trait GetGatewayResponseRequest extends js.Object {
    var responseType: GatewayResponseType
    var restApiId: String
  }

  object GetGatewayResponseRequest {
    def apply(
        responseType: GatewayResponseType,
        restApiId: String
    ): GetGatewayResponseRequest = {
      val __obj = js.Dictionary[js.Any](
        "responseType" -> responseType.asInstanceOf[js.Any],
        "restApiId"    -> restApiId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetGatewayResponseRequest]
    }
  }

  /**
    * Gets the <a>GatewayResponses</a> collection on the given <a>RestApi</a>. If an API developer has not added any definitions for gateway responses, the result will be the API Gateway-generated default <a>GatewayResponses</a> collection for the supported response types.
    */
  @js.native
  trait GetGatewayResponsesRequest extends js.Object {
    var restApiId: String
    var limit: js.UndefOr[NullableInteger]
    var position: js.UndefOr[String]
  }

  object GetGatewayResponsesRequest {
    def apply(
        restApiId: String,
        limit: js.UndefOr[NullableInteger] = js.undefined,
        position: js.UndefOr[String] = js.undefined
    ): GetGatewayResponsesRequest = {
      val __obj = js.Dictionary[js.Any](
        "restApiId" -> restApiId.asInstanceOf[js.Any]
      )

      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGatewayResponsesRequest]
    }
  }

  /**
    * Represents a request to get the integration configuration.
    */
  @js.native
  trait GetIntegrationRequest extends js.Object {
    var httpMethod: String
    var resourceId: String
    var restApiId: String
  }

  object GetIntegrationRequest {
    def apply(
        httpMethod: String,
        resourceId: String,
        restApiId: String
    ): GetIntegrationRequest = {
      val __obj = js.Dictionary[js.Any](
        "httpMethod" -> httpMethod.asInstanceOf[js.Any],
        "resourceId" -> resourceId.asInstanceOf[js.Any],
        "restApiId"  -> restApiId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetIntegrationRequest]
    }
  }

  /**
    * Represents a get integration response request.
    */
  @js.native
  trait GetIntegrationResponseRequest extends js.Object {
    var httpMethod: String
    var resourceId: String
    var restApiId: String
    var statusCode: StatusCode
  }

  object GetIntegrationResponseRequest {
    def apply(
        httpMethod: String,
        resourceId: String,
        restApiId: String,
        statusCode: StatusCode
    ): GetIntegrationResponseRequest = {
      val __obj = js.Dictionary[js.Any](
        "httpMethod" -> httpMethod.asInstanceOf[js.Any],
        "resourceId" -> resourceId.asInstanceOf[js.Any],
        "restApiId"  -> restApiId.asInstanceOf[js.Any],
        "statusCode" -> statusCode.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetIntegrationResponseRequest]
    }
  }

  /**
    * Request to describe an existing <a>Method</a> resource.
    */
  @js.native
  trait GetMethodRequest extends js.Object {
    var httpMethod: String
    var resourceId: String
    var restApiId: String
  }

  object GetMethodRequest {
    def apply(
        httpMethod: String,
        resourceId: String,
        restApiId: String
    ): GetMethodRequest = {
      val __obj = js.Dictionary[js.Any](
        "httpMethod" -> httpMethod.asInstanceOf[js.Any],
        "resourceId" -> resourceId.asInstanceOf[js.Any],
        "restApiId"  -> restApiId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetMethodRequest]
    }
  }

  /**
    * Request to describe a <a>MethodResponse</a> resource.
    */
  @js.native
  trait GetMethodResponseRequest extends js.Object {
    var httpMethod: String
    var resourceId: String
    var restApiId: String
    var statusCode: StatusCode
  }

  object GetMethodResponseRequest {
    def apply(
        httpMethod: String,
        resourceId: String,
        restApiId: String,
        statusCode: StatusCode
    ): GetMethodResponseRequest = {
      val __obj = js.Dictionary[js.Any](
        "httpMethod" -> httpMethod.asInstanceOf[js.Any],
        "resourceId" -> resourceId.asInstanceOf[js.Any],
        "restApiId"  -> restApiId.asInstanceOf[js.Any],
        "statusCode" -> statusCode.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetMethodResponseRequest]
    }
  }

  /**
    * Request to list information about a model in an existing <a>RestApi</a> resource.
    */
  @js.native
  trait GetModelRequest extends js.Object {
    var modelName: String
    var restApiId: String
    var flatten: js.UndefOr[Boolean]
  }

  object GetModelRequest {
    def apply(
        modelName: String,
        restApiId: String,
        flatten: js.UndefOr[Boolean] = js.undefined
    ): GetModelRequest = {
      val __obj = js.Dictionary[js.Any](
        "modelName" -> modelName.asInstanceOf[js.Any],
        "restApiId" -> restApiId.asInstanceOf[js.Any]
      )

      flatten.foreach(__v => __obj.update("flatten", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetModelRequest]
    }
  }

  /**
    * Request to generate a sample mapping template used to transform the payload.
    */
  @js.native
  trait GetModelTemplateRequest extends js.Object {
    var modelName: String
    var restApiId: String
  }

  object GetModelTemplateRequest {
    def apply(
        modelName: String,
        restApiId: String
    ): GetModelTemplateRequest = {
      val __obj = js.Dictionary[js.Any](
        "modelName" -> modelName.asInstanceOf[js.Any],
        "restApiId" -> restApiId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetModelTemplateRequest]
    }
  }

  /**
    * Request to list existing <a>Models</a> defined for a <a>RestApi</a> resource.
    */
  @js.native
  trait GetModelsRequest extends js.Object {
    var restApiId: String
    var limit: js.UndefOr[NullableInteger]
    var position: js.UndefOr[String]
  }

  object GetModelsRequest {
    def apply(
        restApiId: String,
        limit: js.UndefOr[NullableInteger] = js.undefined,
        position: js.UndefOr[String] = js.undefined
    ): GetModelsRequest = {
      val __obj = js.Dictionary[js.Any](
        "restApiId" -> restApiId.asInstanceOf[js.Any]
      )

      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetModelsRequest]
    }
  }

  /**
    * Gets a <a>RequestValidator</a> of a given <a>RestApi</a>.
    */
  @js.native
  trait GetRequestValidatorRequest extends js.Object {
    var requestValidatorId: String
    var restApiId: String
  }

  object GetRequestValidatorRequest {
    def apply(
        requestValidatorId: String,
        restApiId: String
    ): GetRequestValidatorRequest = {
      val __obj = js.Dictionary[js.Any](
        "requestValidatorId" -> requestValidatorId.asInstanceOf[js.Any],
        "restApiId"          -> restApiId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetRequestValidatorRequest]
    }
  }

  /**
    * Gets the <a>RequestValidators</a> collection of a given <a>RestApi</a>.
    */
  @js.native
  trait GetRequestValidatorsRequest extends js.Object {
    var restApiId: String
    var limit: js.UndefOr[NullableInteger]
    var position: js.UndefOr[String]
  }

  object GetRequestValidatorsRequest {
    def apply(
        restApiId: String,
        limit: js.UndefOr[NullableInteger] = js.undefined,
        position: js.UndefOr[String] = js.undefined
    ): GetRequestValidatorsRequest = {
      val __obj = js.Dictionary[js.Any](
        "restApiId" -> restApiId.asInstanceOf[js.Any]
      )

      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRequestValidatorsRequest]
    }
  }

  /**
    * Request to list information about a resource.
    */
  @js.native
  trait GetResourceRequest extends js.Object {
    var resourceId: String
    var restApiId: String
    var embed: js.UndefOr[ListOfString]
  }

  object GetResourceRequest {
    def apply(
        resourceId: String,
        restApiId: String,
        embed: js.UndefOr[ListOfString] = js.undefined
    ): GetResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "resourceId" -> resourceId.asInstanceOf[js.Any],
        "restApiId"  -> restApiId.asInstanceOf[js.Any]
      )

      embed.foreach(__v => __obj.update("embed", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourceRequest]
    }
  }

  /**
    * Request to list information about a collection of resources.
    */
  @js.native
  trait GetResourcesRequest extends js.Object {
    var restApiId: String
    var embed: js.UndefOr[ListOfString]
    var limit: js.UndefOr[NullableInteger]
    var position: js.UndefOr[String]
  }

  object GetResourcesRequest {
    def apply(
        restApiId: String,
        embed: js.UndefOr[ListOfString] = js.undefined,
        limit: js.UndefOr[NullableInteger] = js.undefined,
        position: js.UndefOr[String] = js.undefined
    ): GetResourcesRequest = {
      val __obj = js.Dictionary[js.Any](
        "restApiId" -> restApiId.asInstanceOf[js.Any]
      )

      embed.foreach(__v => __obj.update("embed", __v.asInstanceOf[js.Any]))
      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourcesRequest]
    }
  }

  /**
    * The GET request to list an existing <a>RestApi</a> defined for your collection.
    */
  @js.native
  trait GetRestApiRequest extends js.Object {
    var restApiId: String
  }

  object GetRestApiRequest {
    def apply(
        restApiId: String
    ): GetRestApiRequest = {
      val __obj = js.Dictionary[js.Any](
        "restApiId" -> restApiId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetRestApiRequest]
    }
  }

  /**
    * The GET request to list existing <a>RestApis</a> defined for your collection.
    */
  @js.native
  trait GetRestApisRequest extends js.Object {
    var limit: js.UndefOr[NullableInteger]
    var position: js.UndefOr[String]
  }

  object GetRestApisRequest {
    def apply(
        limit: js.UndefOr[NullableInteger] = js.undefined,
        position: js.UndefOr[String] = js.undefined
    ): GetRestApisRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetRestApisRequest]
    }
  }

  /**
    * Request a new generated client SDK for a <a>RestApi</a> and <a>Stage</a>.
    */
  @js.native
  trait GetSdkRequest extends js.Object {
    var restApiId: String
    var sdkType: String
    var stageName: String
    var parameters: js.UndefOr[MapOfStringToString]
  }

  object GetSdkRequest {
    def apply(
        restApiId: String,
        sdkType: String,
        stageName: String,
        parameters: js.UndefOr[MapOfStringToString] = js.undefined
    ): GetSdkRequest = {
      val __obj = js.Dictionary[js.Any](
        "restApiId" -> restApiId.asInstanceOf[js.Any],
        "sdkType"   -> sdkType.asInstanceOf[js.Any],
        "stageName" -> stageName.asInstanceOf[js.Any]
      )

      parameters.foreach(__v => __obj.update("parameters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSdkRequest]
    }
  }

  /**
    * Get an <a>SdkType</a> instance.
    */
  @js.native
  trait GetSdkTypeRequest extends js.Object {
    var id: String
  }

  object GetSdkTypeRequest {
    def apply(
        id: String
    ): GetSdkTypeRequest = {
      val __obj = js.Dictionary[js.Any](
        "id" -> id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetSdkTypeRequest]
    }
  }

  /**
    * Get the <a>SdkTypes</a> collection.
    */
  @js.native
  trait GetSdkTypesRequest extends js.Object {
    var limit: js.UndefOr[NullableInteger]
    var position: js.UndefOr[String]
  }

  object GetSdkTypesRequest {
    def apply(
        limit: js.UndefOr[NullableInteger] = js.undefined,
        position: js.UndefOr[String] = js.undefined
    ): GetSdkTypesRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSdkTypesRequest]
    }
  }

  /**
    * Requests API Gateway to get information about a <a>Stage</a> resource.
    */
  @js.native
  trait GetStageRequest extends js.Object {
    var restApiId: String
    var stageName: String
  }

  object GetStageRequest {
    def apply(
        restApiId: String,
        stageName: String
    ): GetStageRequest = {
      val __obj = js.Dictionary[js.Any](
        "restApiId" -> restApiId.asInstanceOf[js.Any],
        "stageName" -> stageName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetStageRequest]
    }
  }

  /**
    * Requests API Gateway to get information about one or more <a>Stage</a> resources.
    */
  @js.native
  trait GetStagesRequest extends js.Object {
    var restApiId: String
    var deploymentId: js.UndefOr[String]
  }

  object GetStagesRequest {
    def apply(
        restApiId: String,
        deploymentId: js.UndefOr[String] = js.undefined
    ): GetStagesRequest = {
      val __obj = js.Dictionary[js.Any](
        "restApiId" -> restApiId.asInstanceOf[js.Any]
      )

      deploymentId.foreach(__v => __obj.update("deploymentId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetStagesRequest]
    }
  }

  /**
    * Gets the <a>Tags</a> collection for a given resource.
    */
  @js.native
  trait GetTagsRequest extends js.Object {
    var resourceArn: String
    var limit: js.UndefOr[NullableInteger]
    var position: js.UndefOr[String]
  }

  object GetTagsRequest {
    def apply(
        resourceArn: String,
        limit: js.UndefOr[NullableInteger] = js.undefined,
        position: js.UndefOr[String] = js.undefined
    ): GetTagsRequest = {
      val __obj = js.Dictionary[js.Any](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTagsRequest]
    }
  }

  /**
    * The GET request to get a usage plan key of a given key identifier.
    */
  @js.native
  trait GetUsagePlanKeyRequest extends js.Object {
    var keyId: String
    var usagePlanId: String
  }

  object GetUsagePlanKeyRequest {
    def apply(
        keyId: String,
        usagePlanId: String
    ): GetUsagePlanKeyRequest = {
      val __obj = js.Dictionary[js.Any](
        "keyId"       -> keyId.asInstanceOf[js.Any],
        "usagePlanId" -> usagePlanId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetUsagePlanKeyRequest]
    }
  }

  /**
    * The GET request to get all the usage plan keys representing the API keys added to a specified usage plan.
    */
  @js.native
  trait GetUsagePlanKeysRequest extends js.Object {
    var usagePlanId: String
    var limit: js.UndefOr[NullableInteger]
    var nameQuery: js.UndefOr[String]
    var position: js.UndefOr[String]
  }

  object GetUsagePlanKeysRequest {
    def apply(
        usagePlanId: String,
        limit: js.UndefOr[NullableInteger] = js.undefined,
        nameQuery: js.UndefOr[String] = js.undefined,
        position: js.UndefOr[String] = js.undefined
    ): GetUsagePlanKeysRequest = {
      val __obj = js.Dictionary[js.Any](
        "usagePlanId" -> usagePlanId.asInstanceOf[js.Any]
      )

      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      nameQuery.foreach(__v => __obj.update("nameQuery", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUsagePlanKeysRequest]
    }
  }

  /**
    * The GET request to get a usage plan of a given plan identifier.
    */
  @js.native
  trait GetUsagePlanRequest extends js.Object {
    var usagePlanId: String
  }

  object GetUsagePlanRequest {
    def apply(
        usagePlanId: String
    ): GetUsagePlanRequest = {
      val __obj = js.Dictionary[js.Any](
        "usagePlanId" -> usagePlanId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetUsagePlanRequest]
    }
  }

  /**
    * The GET request to get all the usage plans of the caller's account.
    */
  @js.native
  trait GetUsagePlansRequest extends js.Object {
    var keyId: js.UndefOr[String]
    var limit: js.UndefOr[NullableInteger]
    var position: js.UndefOr[String]
  }

  object GetUsagePlansRequest {
    def apply(
        keyId: js.UndefOr[String] = js.undefined,
        limit: js.UndefOr[NullableInteger] = js.undefined,
        position: js.UndefOr[String] = js.undefined
    ): GetUsagePlansRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      keyId.foreach(__v => __obj.update("keyId", __v.asInstanceOf[js.Any]))
      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUsagePlansRequest]
    }
  }

  /**
    * The GET request to get the usage data of a usage plan in a specified time interval.
    */
  @js.native
  trait GetUsageRequest extends js.Object {
    var endDate: String
    var startDate: String
    var usagePlanId: String
    var keyId: js.UndefOr[String]
    var limit: js.UndefOr[NullableInteger]
    var position: js.UndefOr[String]
  }

  object GetUsageRequest {
    def apply(
        endDate: String,
        startDate: String,
        usagePlanId: String,
        keyId: js.UndefOr[String] = js.undefined,
        limit: js.UndefOr[NullableInteger] = js.undefined,
        position: js.UndefOr[String] = js.undefined
    ): GetUsageRequest = {
      val __obj = js.Dictionary[js.Any](
        "endDate"     -> endDate.asInstanceOf[js.Any],
        "startDate"   -> startDate.asInstanceOf[js.Any],
        "usagePlanId" -> usagePlanId.asInstanceOf[js.Any]
      )

      keyId.foreach(__v => __obj.update("keyId", __v.asInstanceOf[js.Any]))
      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetUsageRequest]
    }
  }

  /**
    * Gets a specified VPC link under the caller's account in a region.
    */
  @js.native
  trait GetVpcLinkRequest extends js.Object {
    var vpcLinkId: String
  }

  object GetVpcLinkRequest {
    def apply(
        vpcLinkId: String
    ): GetVpcLinkRequest = {
      val __obj = js.Dictionary[js.Any](
        "vpcLinkId" -> vpcLinkId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetVpcLinkRequest]
    }
  }

  /**
    * Gets the <a>VpcLinks</a> collection under the caller's account in a selected region.
    */
  @js.native
  trait GetVpcLinksRequest extends js.Object {
    var limit: js.UndefOr[NullableInteger]
    var position: js.UndefOr[String]
  }

  object GetVpcLinksRequest {
    def apply(
        limit: js.UndefOr[NullableInteger] = js.undefined,
        position: js.UndefOr[String] = js.undefined
    ): GetVpcLinksRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVpcLinksRequest]
    }
  }

  /**
    * The POST request to import API keys from an external source, such as a CSV-formatted file.
    */
  @js.native
  trait ImportApiKeysRequest extends js.Object {
    var body: Blob
    var format: ApiKeysFormat
    var failOnWarnings: js.UndefOr[Boolean]
  }

  object ImportApiKeysRequest {
    def apply(
        body: Blob,
        format: ApiKeysFormat,
        failOnWarnings: js.UndefOr[Boolean] = js.undefined
    ): ImportApiKeysRequest = {
      val __obj = js.Dictionary[js.Any](
        "body"   -> body.asInstanceOf[js.Any],
        "format" -> format.asInstanceOf[js.Any]
      )

      failOnWarnings.foreach(__v => __obj.update("failOnWarnings", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportApiKeysRequest]
    }
  }

  /**
    * Import documentation parts from an external (e.g., OpenAPI) definition file.
    */
  @js.native
  trait ImportDocumentationPartsRequest extends js.Object {
    var body: Blob
    var restApiId: String
    var failOnWarnings: js.UndefOr[Boolean]
    var mode: js.UndefOr[PutMode]
  }

  object ImportDocumentationPartsRequest {
    def apply(
        body: Blob,
        restApiId: String,
        failOnWarnings: js.UndefOr[Boolean] = js.undefined,
        mode: js.UndefOr[PutMode] = js.undefined
    ): ImportDocumentationPartsRequest = {
      val __obj = js.Dictionary[js.Any](
        "body"      -> body.asInstanceOf[js.Any],
        "restApiId" -> restApiId.asInstanceOf[js.Any]
      )

      failOnWarnings.foreach(__v => __obj.update("failOnWarnings", __v.asInstanceOf[js.Any]))
      mode.foreach(__v => __obj.update("mode", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportDocumentationPartsRequest]
    }
  }

  /**
    * A POST request to import an API to API Gateway using an input of an API definition file.
    */
  @js.native
  trait ImportRestApiRequest extends js.Object {
    var body: Blob
    var failOnWarnings: js.UndefOr[Boolean]
    var parameters: js.UndefOr[MapOfStringToString]
  }

  object ImportRestApiRequest {
    def apply(
        body: Blob,
        failOnWarnings: js.UndefOr[Boolean] = js.undefined,
        parameters: js.UndefOr[MapOfStringToString] = js.undefined
    ): ImportRestApiRequest = {
      val __obj = js.Dictionary[js.Any](
        "body" -> body.asInstanceOf[js.Any]
      )

      failOnWarnings.foreach(__v => __obj.update("failOnWarnings", __v.asInstanceOf[js.Any]))
      parameters.foreach(__v => __obj.update("parameters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ImportRestApiRequest]
    }
  }

  /**
    * Represents an HTTP, HTTP_PROXY, AWS, AWS_PROXY, or Mock integration.
    *  <div class="remarks">In the API Gateway console, the built-in Lambda integration is an AWS integration.</div>
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html|Creating an API]]
    */
  @js.native
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

  object Integration {
    def apply(
        cacheKeyParameters: js.UndefOr[ListOfString] = js.undefined,
        cacheNamespace: js.UndefOr[String] = js.undefined,
        connectionId: js.UndefOr[String] = js.undefined,
        connectionType: js.UndefOr[ConnectionType] = js.undefined,
        contentHandling: js.UndefOr[ContentHandlingStrategy] = js.undefined,
        credentials: js.UndefOr[String] = js.undefined,
        httpMethod: js.UndefOr[String] = js.undefined,
        integrationResponses: js.UndefOr[MapOfIntegrationResponse] = js.undefined,
        passthroughBehavior: js.UndefOr[String] = js.undefined,
        requestParameters: js.UndefOr[MapOfStringToString] = js.undefined,
        requestTemplates: js.UndefOr[MapOfStringToString] = js.undefined,
        timeoutInMillis: js.UndefOr[Int] = js.undefined,
        `type`: js.UndefOr[IntegrationType] = js.undefined,
        uri: js.UndefOr[String] = js.undefined
    ): Integration = {
      val __obj = js.Dictionary.empty[js.Any]
      cacheKeyParameters.foreach(__v => __obj.update("cacheKeyParameters", __v.asInstanceOf[js.Any]))
      cacheNamespace.foreach(__v => __obj.update("cacheNamespace", __v.asInstanceOf[js.Any]))
      connectionId.foreach(__v => __obj.update("connectionId", __v.asInstanceOf[js.Any]))
      connectionType.foreach(__v => __obj.update("connectionType", __v.asInstanceOf[js.Any]))
      contentHandling.foreach(__v => __obj.update("contentHandling", __v.asInstanceOf[js.Any]))
      credentials.foreach(__v => __obj.update("credentials", __v.asInstanceOf[js.Any]))
      httpMethod.foreach(__v => __obj.update("httpMethod", __v.asInstanceOf[js.Any]))
      integrationResponses.foreach(__v => __obj.update("integrationResponses", __v.asInstanceOf[js.Any]))
      passthroughBehavior.foreach(__v => __obj.update("passthroughBehavior", __v.asInstanceOf[js.Any]))
      requestParameters.foreach(__v => __obj.update("requestParameters", __v.asInstanceOf[js.Any]))
      requestTemplates.foreach(__v => __obj.update("requestTemplates", __v.asInstanceOf[js.Any]))
      timeoutInMillis.foreach(__v => __obj.update("timeoutInMillis", __v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      uri.foreach(__v => __obj.update("uri", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Integration]
    }
  }

  /**
    * Represents an integration response. The status code must map to an existing <a>MethodResponse</a>, and parameters and templates can be used to transform the back-end response.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html|Creating an API]]
    */
  @js.native
  trait IntegrationResponse extends js.Object {
    var contentHandling: js.UndefOr[ContentHandlingStrategy]
    var responseParameters: js.UndefOr[MapOfStringToString]
    var responseTemplates: js.UndefOr[MapOfStringToString]
    var selectionPattern: js.UndefOr[String]
    var statusCode: js.UndefOr[StatusCode]
  }

  object IntegrationResponse {
    def apply(
        contentHandling: js.UndefOr[ContentHandlingStrategy] = js.undefined,
        responseParameters: js.UndefOr[MapOfStringToString] = js.undefined,
        responseTemplates: js.UndefOr[MapOfStringToString] = js.undefined,
        selectionPattern: js.UndefOr[String] = js.undefined,
        statusCode: js.UndefOr[StatusCode] = js.undefined
    ): IntegrationResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      contentHandling.foreach(__v => __obj.update("contentHandling", __v.asInstanceOf[js.Any]))
      responseParameters.foreach(__v => __obj.update("responseParameters", __v.asInstanceOf[js.Any]))
      responseTemplates.foreach(__v => __obj.update("responseTemplates", __v.asInstanceOf[js.Any]))
      selectionPattern.foreach(__v => __obj.update("selectionPattern", __v.asInstanceOf[js.Any]))
      statusCode.foreach(__v => __obj.update("statusCode", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[IntegrationResponse]
    }
  }

  /**
    * The integration type. The valid value is <code>HTTP</code> for integrating an API method with an HTTP backend; <code>AWS</code> with any AWS service endpoints; <code>MOCK</code> for testing without actually invoking the backend; <code>HTTP_PROXY</code> for integrating with the HTTP proxy integration; <code>AWS_PROXY</code> for integrating with the Lambda proxy integration.
    */
  object IntegrationTypeEnum {
    val HTTP       = "HTTP"
    val AWS        = "AWS"
    val MOCK       = "MOCK"
    val HTTP_PROXY = "HTTP_PROXY"
    val AWS_PROXY  = "AWS_PROXY"

    val values = IndexedSeq(HTTP, AWS, MOCK, HTTP_PROXY, AWS_PROXY)
  }

  object LocationStatusTypeEnum {
    val DOCUMENTED   = "DOCUMENTED"
    val UNDOCUMENTED = "UNDOCUMENTED"

    val values = IndexedSeq(DOCUMENTED, UNDOCUMENTED)
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

  object Method {
    def apply(
        apiKeyRequired: js.UndefOr[NullableBoolean] = js.undefined,
        authorizationScopes: js.UndefOr[ListOfString] = js.undefined,
        authorizationType: js.UndefOr[String] = js.undefined,
        authorizerId: js.UndefOr[String] = js.undefined,
        httpMethod: js.UndefOr[String] = js.undefined,
        methodIntegration: js.UndefOr[Integration] = js.undefined,
        methodResponses: js.UndefOr[MapOfMethodResponse] = js.undefined,
        operationName: js.UndefOr[String] = js.undefined,
        requestModels: js.UndefOr[MapOfStringToString] = js.undefined,
        requestParameters: js.UndefOr[MapOfStringToBoolean] = js.undefined,
        requestValidatorId: js.UndefOr[String] = js.undefined
    ): Method = {
      val __obj = js.Dictionary.empty[js.Any]
      apiKeyRequired.foreach(__v => __obj.update("apiKeyRequired", __v.asInstanceOf[js.Any]))
      authorizationScopes.foreach(__v => __obj.update("authorizationScopes", __v.asInstanceOf[js.Any]))
      authorizationType.foreach(__v => __obj.update("authorizationType", __v.asInstanceOf[js.Any]))
      authorizerId.foreach(__v => __obj.update("authorizerId", __v.asInstanceOf[js.Any]))
      httpMethod.foreach(__v => __obj.update("httpMethod", __v.asInstanceOf[js.Any]))
      methodIntegration.foreach(__v => __obj.update("methodIntegration", __v.asInstanceOf[js.Any]))
      methodResponses.foreach(__v => __obj.update("methodResponses", __v.asInstanceOf[js.Any]))
      operationName.foreach(__v => __obj.update("operationName", __v.asInstanceOf[js.Any]))
      requestModels.foreach(__v => __obj.update("requestModels", __v.asInstanceOf[js.Any]))
      requestParameters.foreach(__v => __obj.update("requestParameters", __v.asInstanceOf[js.Any]))
      requestValidatorId.foreach(__v => __obj.update("requestValidatorId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Method]
    }
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
  trait MethodResponse extends js.Object {
    var responseModels: js.UndefOr[MapOfStringToString]
    var responseParameters: js.UndefOr[MapOfStringToBoolean]
    var statusCode: js.UndefOr[StatusCode]
  }

  object MethodResponse {
    def apply(
        responseModels: js.UndefOr[MapOfStringToString] = js.undefined,
        responseParameters: js.UndefOr[MapOfStringToBoolean] = js.undefined,
        statusCode: js.UndefOr[StatusCode] = js.undefined
    ): MethodResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      responseModels.foreach(__v => __obj.update("responseModels", __v.asInstanceOf[js.Any]))
      responseParameters.foreach(__v => __obj.update("responseParameters", __v.asInstanceOf[js.Any]))
      statusCode.foreach(__v => __obj.update("statusCode", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MethodResponse]
    }
  }

  /**
    * Specifies the method setting properties.
    */
  @js.native
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

  object MethodSetting {
    def apply(
        cacheDataEncrypted: js.UndefOr[Boolean] = js.undefined,
        cacheTtlInSeconds: js.UndefOr[Int] = js.undefined,
        cachingEnabled: js.UndefOr[Boolean] = js.undefined,
        dataTraceEnabled: js.UndefOr[Boolean] = js.undefined,
        loggingLevel: js.UndefOr[String] = js.undefined,
        metricsEnabled: js.UndefOr[Boolean] = js.undefined,
        requireAuthorizationForCacheControl: js.UndefOr[Boolean] = js.undefined,
        throttlingBurstLimit: js.UndefOr[Int] = js.undefined,
        throttlingRateLimit: js.UndefOr[Double] = js.undefined,
        unauthorizedCacheControlHeaderStrategy: js.UndefOr[UnauthorizedCacheControlHeaderStrategy] = js.undefined
    ): MethodSetting = {
      val __obj = js.Dictionary.empty[js.Any]
      cacheDataEncrypted.foreach(__v => __obj.update("cacheDataEncrypted", __v.asInstanceOf[js.Any]))
      cacheTtlInSeconds.foreach(__v => __obj.update("cacheTtlInSeconds", __v.asInstanceOf[js.Any]))
      cachingEnabled.foreach(__v => __obj.update("cachingEnabled", __v.asInstanceOf[js.Any]))
      dataTraceEnabled.foreach(__v => __obj.update("dataTraceEnabled", __v.asInstanceOf[js.Any]))
      loggingLevel.foreach(__v => __obj.update("loggingLevel", __v.asInstanceOf[js.Any]))
      metricsEnabled.foreach(__v => __obj.update("metricsEnabled", __v.asInstanceOf[js.Any]))
      requireAuthorizationForCacheControl.foreach(
        __v => __obj.update("requireAuthorizationForCacheControl", __v.asInstanceOf[js.Any])
      )
      throttlingBurstLimit.foreach(__v => __obj.update("throttlingBurstLimit", __v.asInstanceOf[js.Any]))
      throttlingRateLimit.foreach(__v => __obj.update("throttlingRateLimit", __v.asInstanceOf[js.Any]))
      unauthorizedCacheControlHeaderStrategy.foreach(
        __v => __obj.update("unauthorizedCacheControlHeaderStrategy", __v.asInstanceOf[js.Any])
      )
      __obj.asInstanceOf[MethodSetting]
    }
  }

  /**
    * Represents a summary of a <a>Method</a> resource, given a particular date and time.
    */
  @js.native
  trait MethodSnapshot extends js.Object {
    var apiKeyRequired: js.UndefOr[Boolean]
    var authorizationType: js.UndefOr[String]
  }

  object MethodSnapshot {
    def apply(
        apiKeyRequired: js.UndefOr[Boolean] = js.undefined,
        authorizationType: js.UndefOr[String] = js.undefined
    ): MethodSnapshot = {
      val __obj = js.Dictionary.empty[js.Any]
      apiKeyRequired.foreach(__v => __obj.update("apiKeyRequired", __v.asInstanceOf[js.Any]))
      authorizationType.foreach(__v => __obj.update("authorizationType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MethodSnapshot]
    }
  }

  /**
    * Represents the data structure of a method's request or response payload.
    *  <div class="remarks"> A request model defines the data structure of the client-supplied request payload. A response model defines the data structure of the response payload returned by the back end. Although not required, models are useful for mapping payloads between the front end and back end.
    *  A model is used for generating an API's SDK, validating the input request body, and creating a skeletal mapping template.
    *  </div>
    * @see <a>Method</a>, <a>MethodResponse</a>, [[https://docs.aws.amazon.com/apigateway/latest/developerguide/models-mappings.html|Models and Mappings]]
    */
  @js.native
  trait Model extends js.Object {
    var contentType: js.UndefOr[String]
    var description: js.UndefOr[String]
    var id: js.UndefOr[String]
    var name: js.UndefOr[String]
    var schema: js.UndefOr[String]
  }

  object Model {
    def apply(
        contentType: js.UndefOr[String] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        id: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        schema: js.UndefOr[String] = js.undefined
    ): Model = {
      val __obj = js.Dictionary.empty[js.Any]
      contentType.foreach(__v => __obj.update("contentType", __v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.update("id", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      schema.foreach(__v => __obj.update("schema", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Model]
    }
  }

  /**
    * Represents a collection of <a>Model</a> resources.
    *
    * @see <a>Method</a>, <a>MethodResponse</a>, [[https://docs.aws.amazon.com/apigateway/latest/developerguide/models-mappings.html|Models and Mappings]]
    */
  @js.native
  trait Models extends js.Object {
    var items: js.UndefOr[ListOfModel]
    var position: js.UndefOr[String]
  }

  object Models {
    def apply(
        items: js.UndefOr[ListOfModel] = js.undefined,
        position: js.UndefOr[String] = js.undefined
    ): Models = {
      val __obj = js.Dictionary.empty[js.Any]
      items.foreach(__v => __obj.update("items", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Models]
    }
  }

  object OpEnum {
    val add     = "add"
    val remove  = "remove"
    val replace = "replace"
    val move    = "move"
    val copy    = "copy"
    val test    = "test"

    val values = IndexedSeq(add, remove, replace, move, copy, test)
  }

  /**
    * A single patch operation to apply to the specified resource. Please refer to http://tools.ietf.org/html/rfc6902#section-4 for an explanation of how each operation is used.
    */
  @js.native
  trait PatchOperation extends js.Object {
    var from: js.UndefOr[String]
    var op: js.UndefOr[Op]
    var path: js.UndefOr[String]
    var value: js.UndefOr[String]
  }

  object PatchOperation {
    def apply(
        from: js.UndefOr[String] = js.undefined,
        op: js.UndefOr[Op] = js.undefined,
        path: js.UndefOr[String] = js.undefined,
        value: js.UndefOr[String] = js.undefined
    ): PatchOperation = {
      val __obj = js.Dictionary.empty[js.Any]
      from.foreach(__v => __obj.update("from", __v.asInstanceOf[js.Any]))
      op.foreach(__v => __obj.update("op", __v.asInstanceOf[js.Any]))
      path.foreach(__v => __obj.update("path", __v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.update("value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PatchOperation]
    }
  }

  /**
    * Creates a customization of a <a>GatewayResponse</a> of a specified response type and status code on the given <a>RestApi</a>.
    */
  @js.native
  trait PutGatewayResponseRequest extends js.Object {
    var responseType: GatewayResponseType
    var restApiId: String
    var responseParameters: js.UndefOr[MapOfStringToString]
    var responseTemplates: js.UndefOr[MapOfStringToString]
    var statusCode: js.UndefOr[StatusCode]
  }

  object PutGatewayResponseRequest {
    def apply(
        responseType: GatewayResponseType,
        restApiId: String,
        responseParameters: js.UndefOr[MapOfStringToString] = js.undefined,
        responseTemplates: js.UndefOr[MapOfStringToString] = js.undefined,
        statusCode: js.UndefOr[StatusCode] = js.undefined
    ): PutGatewayResponseRequest = {
      val __obj = js.Dictionary[js.Any](
        "responseType" -> responseType.asInstanceOf[js.Any],
        "restApiId"    -> restApiId.asInstanceOf[js.Any]
      )

      responseParameters.foreach(__v => __obj.update("responseParameters", __v.asInstanceOf[js.Any]))
      responseTemplates.foreach(__v => __obj.update("responseTemplates", __v.asInstanceOf[js.Any]))
      statusCode.foreach(__v => __obj.update("statusCode", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutGatewayResponseRequest]
    }
  }

  /**
    * Sets up a method's integration.
    */
  @js.native
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

  object PutIntegrationRequest {
    def apply(
        httpMethod: String,
        resourceId: String,
        restApiId: String,
        `type`: IntegrationType,
        cacheKeyParameters: js.UndefOr[ListOfString] = js.undefined,
        cacheNamespace: js.UndefOr[String] = js.undefined,
        connectionId: js.UndefOr[String] = js.undefined,
        connectionType: js.UndefOr[ConnectionType] = js.undefined,
        contentHandling: js.UndefOr[ContentHandlingStrategy] = js.undefined,
        credentials: js.UndefOr[String] = js.undefined,
        integrationHttpMethod: js.UndefOr[String] = js.undefined,
        passthroughBehavior: js.UndefOr[String] = js.undefined,
        requestParameters: js.UndefOr[MapOfStringToString] = js.undefined,
        requestTemplates: js.UndefOr[MapOfStringToString] = js.undefined,
        timeoutInMillis: js.UndefOr[NullableInteger] = js.undefined,
        uri: js.UndefOr[String] = js.undefined
    ): PutIntegrationRequest = {
      val __obj = js.Dictionary[js.Any](
        "httpMethod" -> httpMethod.asInstanceOf[js.Any],
        "resourceId" -> resourceId.asInstanceOf[js.Any],
        "restApiId"  -> restApiId.asInstanceOf[js.Any],
        "type"       -> `type`.asInstanceOf[js.Any]
      )

      cacheKeyParameters.foreach(__v => __obj.update("cacheKeyParameters", __v.asInstanceOf[js.Any]))
      cacheNamespace.foreach(__v => __obj.update("cacheNamespace", __v.asInstanceOf[js.Any]))
      connectionId.foreach(__v => __obj.update("connectionId", __v.asInstanceOf[js.Any]))
      connectionType.foreach(__v => __obj.update("connectionType", __v.asInstanceOf[js.Any]))
      contentHandling.foreach(__v => __obj.update("contentHandling", __v.asInstanceOf[js.Any]))
      credentials.foreach(__v => __obj.update("credentials", __v.asInstanceOf[js.Any]))
      integrationHttpMethod.foreach(__v => __obj.update("integrationHttpMethod", __v.asInstanceOf[js.Any]))
      passthroughBehavior.foreach(__v => __obj.update("passthroughBehavior", __v.asInstanceOf[js.Any]))
      requestParameters.foreach(__v => __obj.update("requestParameters", __v.asInstanceOf[js.Any]))
      requestTemplates.foreach(__v => __obj.update("requestTemplates", __v.asInstanceOf[js.Any]))
      timeoutInMillis.foreach(__v => __obj.update("timeoutInMillis", __v.asInstanceOf[js.Any]))
      uri.foreach(__v => __obj.update("uri", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutIntegrationRequest]
    }
  }

  /**
    * Represents a put integration response request.
    */
  @js.native
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

  object PutIntegrationResponseRequest {
    def apply(
        httpMethod: String,
        resourceId: String,
        restApiId: String,
        statusCode: StatusCode,
        contentHandling: js.UndefOr[ContentHandlingStrategy] = js.undefined,
        responseParameters: js.UndefOr[MapOfStringToString] = js.undefined,
        responseTemplates: js.UndefOr[MapOfStringToString] = js.undefined,
        selectionPattern: js.UndefOr[String] = js.undefined
    ): PutIntegrationResponseRequest = {
      val __obj = js.Dictionary[js.Any](
        "httpMethod" -> httpMethod.asInstanceOf[js.Any],
        "resourceId" -> resourceId.asInstanceOf[js.Any],
        "restApiId"  -> restApiId.asInstanceOf[js.Any],
        "statusCode" -> statusCode.asInstanceOf[js.Any]
      )

      contentHandling.foreach(__v => __obj.update("contentHandling", __v.asInstanceOf[js.Any]))
      responseParameters.foreach(__v => __obj.update("responseParameters", __v.asInstanceOf[js.Any]))
      responseTemplates.foreach(__v => __obj.update("responseTemplates", __v.asInstanceOf[js.Any]))
      selectionPattern.foreach(__v => __obj.update("selectionPattern", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutIntegrationResponseRequest]
    }
  }

  /**
    * Request to add a method to an existing <a>Resource</a> resource.
    */
  @js.native
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

  object PutMethodRequest {
    def apply(
        authorizationType: String,
        httpMethod: String,
        resourceId: String,
        restApiId: String,
        apiKeyRequired: js.UndefOr[Boolean] = js.undefined,
        authorizationScopes: js.UndefOr[ListOfString] = js.undefined,
        authorizerId: js.UndefOr[String] = js.undefined,
        operationName: js.UndefOr[String] = js.undefined,
        requestModels: js.UndefOr[MapOfStringToString] = js.undefined,
        requestParameters: js.UndefOr[MapOfStringToBoolean] = js.undefined,
        requestValidatorId: js.UndefOr[String] = js.undefined
    ): PutMethodRequest = {
      val __obj = js.Dictionary[js.Any](
        "authorizationType" -> authorizationType.asInstanceOf[js.Any],
        "httpMethod"        -> httpMethod.asInstanceOf[js.Any],
        "resourceId"        -> resourceId.asInstanceOf[js.Any],
        "restApiId"         -> restApiId.asInstanceOf[js.Any]
      )

      apiKeyRequired.foreach(__v => __obj.update("apiKeyRequired", __v.asInstanceOf[js.Any]))
      authorizationScopes.foreach(__v => __obj.update("authorizationScopes", __v.asInstanceOf[js.Any]))
      authorizerId.foreach(__v => __obj.update("authorizerId", __v.asInstanceOf[js.Any]))
      operationName.foreach(__v => __obj.update("operationName", __v.asInstanceOf[js.Any]))
      requestModels.foreach(__v => __obj.update("requestModels", __v.asInstanceOf[js.Any]))
      requestParameters.foreach(__v => __obj.update("requestParameters", __v.asInstanceOf[js.Any]))
      requestValidatorId.foreach(__v => __obj.update("requestValidatorId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutMethodRequest]
    }
  }

  /**
    * Request to add a <a>MethodResponse</a> to an existing <a>Method</a> resource.
    */
  @js.native
  trait PutMethodResponseRequest extends js.Object {
    var httpMethod: String
    var resourceId: String
    var restApiId: String
    var statusCode: StatusCode
    var responseModels: js.UndefOr[MapOfStringToString]
    var responseParameters: js.UndefOr[MapOfStringToBoolean]
  }

  object PutMethodResponseRequest {
    def apply(
        httpMethod: String,
        resourceId: String,
        restApiId: String,
        statusCode: StatusCode,
        responseModels: js.UndefOr[MapOfStringToString] = js.undefined,
        responseParameters: js.UndefOr[MapOfStringToBoolean] = js.undefined
    ): PutMethodResponseRequest = {
      val __obj = js.Dictionary[js.Any](
        "httpMethod" -> httpMethod.asInstanceOf[js.Any],
        "resourceId" -> resourceId.asInstanceOf[js.Any],
        "restApiId"  -> restApiId.asInstanceOf[js.Any],
        "statusCode" -> statusCode.asInstanceOf[js.Any]
      )

      responseModels.foreach(__v => __obj.update("responseModels", __v.asInstanceOf[js.Any]))
      responseParameters.foreach(__v => __obj.update("responseParameters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutMethodResponseRequest]
    }
  }

  object PutModeEnum {
    val merge     = "merge"
    val overwrite = "overwrite"

    val values = IndexedSeq(merge, overwrite)
  }

  /**
    * A PUT request to update an existing API, with external API definitions specified as the request body.
    */
  @js.native
  trait PutRestApiRequest extends js.Object {
    var body: Blob
    var restApiId: String
    var failOnWarnings: js.UndefOr[Boolean]
    var mode: js.UndefOr[PutMode]
    var parameters: js.UndefOr[MapOfStringToString]
  }

  object PutRestApiRequest {
    def apply(
        body: Blob,
        restApiId: String,
        failOnWarnings: js.UndefOr[Boolean] = js.undefined,
        mode: js.UndefOr[PutMode] = js.undefined,
        parameters: js.UndefOr[MapOfStringToString] = js.undefined
    ): PutRestApiRequest = {
      val __obj = js.Dictionary[js.Any](
        "body"      -> body.asInstanceOf[js.Any],
        "restApiId" -> restApiId.asInstanceOf[js.Any]
      )

      failOnWarnings.foreach(__v => __obj.update("failOnWarnings", __v.asInstanceOf[js.Any]))
      mode.foreach(__v => __obj.update("mode", __v.asInstanceOf[js.Any]))
      parameters.foreach(__v => __obj.update("parameters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutRestApiRequest]
    }
  }

  object QuotaPeriodTypeEnum {
    val DAY   = "DAY"
    val WEEK  = "WEEK"
    val MONTH = "MONTH"

    val values = IndexedSeq(DAY, WEEK, MONTH)
  }

  /**
    * Quotas configured for a usage plan.
    */
  @js.native
  trait QuotaSettings extends js.Object {
    var limit: js.UndefOr[Int]
    var offset: js.UndefOr[Int]
    var period: js.UndefOr[QuotaPeriodType]
  }

  object QuotaSettings {
    def apply(
        limit: js.UndefOr[Int] = js.undefined,
        offset: js.UndefOr[Int] = js.undefined,
        period: js.UndefOr[QuotaPeriodType] = js.undefined
    ): QuotaSettings = {
      val __obj = js.Dictionary.empty[js.Any]
      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      offset.foreach(__v => __obj.update("offset", __v.asInstanceOf[js.Any]))
      period.foreach(__v => __obj.update("period", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QuotaSettings]
    }
  }

  /**
    * A set of validation rules for incoming <a>Method</a> requests.
    *  <div class="remarks"> In OpenAPI, a <a>RequestValidator</a> of an API is defined by the [[https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-swagger-extensions.html#api-gateway-swagger-extensions-request-validators.requestValidator.html|x-amazon-apigateway-request-validators.requestValidator]] object. It the referenced using the [[https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-swagger-extensions.html#api-gateway-swagger-extensions-request-validator|x-amazon-apigateway-request-validator]] property.
    *  </div>
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-method-request-validation.html|Enable Basic Request Validation in API Gateway]]
    */
  @js.native
  trait RequestValidator extends js.Object {
    var id: js.UndefOr[String]
    var name: js.UndefOr[String]
    var validateRequestBody: js.UndefOr[Boolean]
    var validateRequestParameters: js.UndefOr[Boolean]
  }

  object RequestValidator {
    def apply(
        id: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        validateRequestBody: js.UndefOr[Boolean] = js.undefined,
        validateRequestParameters: js.UndefOr[Boolean] = js.undefined
    ): RequestValidator = {
      val __obj = js.Dictionary.empty[js.Any]
      id.foreach(__v => __obj.update("id", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      validateRequestBody.foreach(__v => __obj.update("validateRequestBody", __v.asInstanceOf[js.Any]))
      validateRequestParameters.foreach(__v => __obj.update("validateRequestParameters", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RequestValidator]
    }
  }

  /**
    * A collection of <a>RequestValidator</a> resources of a given <a>RestApi</a>.
    *  <div class="remarks"> In OpenAPI, the <a>RequestValidators</a> of an API is defined by the [[https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-swagger-extensions.html#api-gateway-swagger-extensions-request-validators.html|x-amazon-apigateway-request-validators]] extension.
    *  </div>
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-method-request-validation.html|Enable Basic Request Validation in API Gateway]]
    */
  @js.native
  trait RequestValidators extends js.Object {
    var items: js.UndefOr[ListOfRequestValidator]
    var position: js.UndefOr[String]
  }

  object RequestValidators {
    def apply(
        items: js.UndefOr[ListOfRequestValidator] = js.undefined,
        position: js.UndefOr[String] = js.undefined
    ): RequestValidators = {
      val __obj = js.Dictionary.empty[js.Any]
      items.foreach(__v => __obj.update("items", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RequestValidators]
    }
  }

  /**
    * Represents an API resource.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html|Create an API]]
    */
  @js.native
  trait Resource extends js.Object {
    var id: js.UndefOr[String]
    var parentId: js.UndefOr[String]
    var path: js.UndefOr[String]
    var pathPart: js.UndefOr[String]
    var resourceMethods: js.UndefOr[MapOfMethod]
  }

  object Resource {
    def apply(
        id: js.UndefOr[String] = js.undefined,
        parentId: js.UndefOr[String] = js.undefined,
        path: js.UndefOr[String] = js.undefined,
        pathPart: js.UndefOr[String] = js.undefined,
        resourceMethods: js.UndefOr[MapOfMethod] = js.undefined
    ): Resource = {
      val __obj = js.Dictionary.empty[js.Any]
      id.foreach(__v => __obj.update("id", __v.asInstanceOf[js.Any]))
      parentId.foreach(__v => __obj.update("parentId", __v.asInstanceOf[js.Any]))
      path.foreach(__v => __obj.update("path", __v.asInstanceOf[js.Any]))
      pathPart.foreach(__v => __obj.update("pathPart", __v.asInstanceOf[js.Any]))
      resourceMethods.foreach(__v => __obj.update("resourceMethods", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Resource]
    }
  }

  /**
    * Represents a collection of <a>Resource</a> resources.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html|Create an API]]
    */
  @js.native
  trait Resources extends js.Object {
    var items: js.UndefOr[ListOfResource]
    var position: js.UndefOr[String]
  }

  object Resources {
    def apply(
        items: js.UndefOr[ListOfResource] = js.undefined,
        position: js.UndefOr[String] = js.undefined
    ): Resources = {
      val __obj = js.Dictionary.empty[js.Any]
      items.foreach(__v => __obj.update("items", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Resources]
    }
  }

  /**
    * Represents a REST API.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html|Create an API]]
    */
  @js.native
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

  object RestApi {
    def apply(
        apiKeySource: js.UndefOr[ApiKeySourceType] = js.undefined,
        binaryMediaTypes: js.UndefOr[ListOfString] = js.undefined,
        createdDate: js.UndefOr[Timestamp] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        endpointConfiguration: js.UndefOr[EndpointConfiguration] = js.undefined,
        id: js.UndefOr[String] = js.undefined,
        minimumCompressionSize: js.UndefOr[NullableInteger] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        policy: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[MapOfStringToString] = js.undefined,
        version: js.UndefOr[String] = js.undefined,
        warnings: js.UndefOr[ListOfString] = js.undefined
    ): RestApi = {
      val __obj = js.Dictionary.empty[js.Any]
      apiKeySource.foreach(__v => __obj.update("apiKeySource", __v.asInstanceOf[js.Any]))
      binaryMediaTypes.foreach(__v => __obj.update("binaryMediaTypes", __v.asInstanceOf[js.Any]))
      createdDate.foreach(__v => __obj.update("createdDate", __v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      endpointConfiguration.foreach(__v => __obj.update("endpointConfiguration", __v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.update("id", __v.asInstanceOf[js.Any]))
      minimumCompressionSize.foreach(__v => __obj.update("minimumCompressionSize", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      policy.foreach(__v => __obj.update("policy", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.update("version", __v.asInstanceOf[js.Any]))
      warnings.foreach(__v => __obj.update("warnings", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestApi]
    }
  }

  /**
    * Contains references to your APIs and links that guide you in how to interact with your collection. A collection offers a paginated view of your APIs.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-create-api.html|Create an API]]
    */
  @js.native
  trait RestApis extends js.Object {
    var items: js.UndefOr[ListOfRestApi]
    var position: js.UndefOr[String]
  }

  object RestApis {
    def apply(
        items: js.UndefOr[ListOfRestApi] = js.undefined,
        position: js.UndefOr[String] = js.undefined
    ): RestApis = {
      val __obj = js.Dictionary.empty[js.Any]
      items.foreach(__v => __obj.update("items", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestApis]
    }
  }

  /**
    * A configuration property of an SDK type.
    */
  @js.native
  trait SdkConfigurationProperty extends js.Object {
    var defaultValue: js.UndefOr[String]
    var description: js.UndefOr[String]
    var friendlyName: js.UndefOr[String]
    var name: js.UndefOr[String]
    var required: js.UndefOr[Boolean]
  }

  object SdkConfigurationProperty {
    def apply(
        defaultValue: js.UndefOr[String] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        friendlyName: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        required: js.UndefOr[Boolean] = js.undefined
    ): SdkConfigurationProperty = {
      val __obj = js.Dictionary.empty[js.Any]
      defaultValue.foreach(__v => __obj.update("defaultValue", __v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      friendlyName.foreach(__v => __obj.update("friendlyName", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      required.foreach(__v => __obj.update("required", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SdkConfigurationProperty]
    }
  }

  /**
    * The binary blob response to <a>GetSdk</a>, which contains the generated SDK.
    */
  @js.native
  trait SdkResponse extends js.Object {
    var body: js.UndefOr[Blob]
    var contentDisposition: js.UndefOr[String]
    var contentType: js.UndefOr[String]
  }

  object SdkResponse {
    def apply(
        body: js.UndefOr[Blob] = js.undefined,
        contentDisposition: js.UndefOr[String] = js.undefined,
        contentType: js.UndefOr[String] = js.undefined
    ): SdkResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      body.foreach(__v => __obj.update("body", __v.asInstanceOf[js.Any]))
      contentDisposition.foreach(__v => __obj.update("contentDisposition", __v.asInstanceOf[js.Any]))
      contentType.foreach(__v => __obj.update("contentType", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SdkResponse]
    }
  }

  /**
    * A type of SDK that API Gateway can generate.
    */
  @js.native
  trait SdkType extends js.Object {
    var configurationProperties: js.UndefOr[ListOfSdkConfigurationProperty]
    var description: js.UndefOr[String]
    var friendlyName: js.UndefOr[String]
    var id: js.UndefOr[String]
  }

  object SdkType {
    def apply(
        configurationProperties: js.UndefOr[ListOfSdkConfigurationProperty] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        friendlyName: js.UndefOr[String] = js.undefined,
        id: js.UndefOr[String] = js.undefined
    ): SdkType = {
      val __obj = js.Dictionary.empty[js.Any]
      configurationProperties.foreach(__v => __obj.update("configurationProperties", __v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      friendlyName.foreach(__v => __obj.update("friendlyName", __v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.update("id", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SdkType]
    }
  }

  /**
    * The collection of <a>SdkType</a> instances.
    */
  @js.native
  trait SdkTypes extends js.Object {
    var items: js.UndefOr[ListOfSdkType]
    var position: js.UndefOr[String]
  }

  object SdkTypes {
    def apply(
        items: js.UndefOr[ListOfSdkType] = js.undefined,
        position: js.UndefOr[String] = js.undefined
    ): SdkTypes = {
      val __obj = js.Dictionary.empty[js.Any]
      items.foreach(__v => __obj.update("items", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SdkTypes]
    }
  }

  object SecurityPolicyEnum {
    val TLS_1_0 = "TLS_1_0"
    val TLS_1_2 = "TLS_1_2"

    val values = IndexedSeq(TLS_1_0, TLS_1_2)
  }

  /**
    * Represents a unique identifier for a version of a deployed <a>RestApi</a> that is callable by users.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-deploy-api.html|Deploy an API]]
    */
  @js.native
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

  object Stage {
    def apply(
        accessLogSettings: js.UndefOr[AccessLogSettings] = js.undefined,
        cacheClusterEnabled: js.UndefOr[Boolean] = js.undefined,
        cacheClusterSize: js.UndefOr[CacheClusterSize] = js.undefined,
        cacheClusterStatus: js.UndefOr[CacheClusterStatus] = js.undefined,
        canarySettings: js.UndefOr[CanarySettings] = js.undefined,
        clientCertificateId: js.UndefOr[String] = js.undefined,
        createdDate: js.UndefOr[Timestamp] = js.undefined,
        deploymentId: js.UndefOr[String] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        documentationVersion: js.UndefOr[String] = js.undefined,
        lastUpdatedDate: js.UndefOr[Timestamp] = js.undefined,
        methodSettings: js.UndefOr[MapOfMethodSettings] = js.undefined,
        stageName: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[MapOfStringToString] = js.undefined,
        tracingEnabled: js.UndefOr[Boolean] = js.undefined,
        variables: js.UndefOr[MapOfStringToString] = js.undefined,
        webAclArn: js.UndefOr[String] = js.undefined
    ): Stage = {
      val __obj = js.Dictionary.empty[js.Any]
      accessLogSettings.foreach(__v => __obj.update("accessLogSettings", __v.asInstanceOf[js.Any]))
      cacheClusterEnabled.foreach(__v => __obj.update("cacheClusterEnabled", __v.asInstanceOf[js.Any]))
      cacheClusterSize.foreach(__v => __obj.update("cacheClusterSize", __v.asInstanceOf[js.Any]))
      cacheClusterStatus.foreach(__v => __obj.update("cacheClusterStatus", __v.asInstanceOf[js.Any]))
      canarySettings.foreach(__v => __obj.update("canarySettings", __v.asInstanceOf[js.Any]))
      clientCertificateId.foreach(__v => __obj.update("clientCertificateId", __v.asInstanceOf[js.Any]))
      createdDate.foreach(__v => __obj.update("createdDate", __v.asInstanceOf[js.Any]))
      deploymentId.foreach(__v => __obj.update("deploymentId", __v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      documentationVersion.foreach(__v => __obj.update("documentationVersion", __v.asInstanceOf[js.Any]))
      lastUpdatedDate.foreach(__v => __obj.update("lastUpdatedDate", __v.asInstanceOf[js.Any]))
      methodSettings.foreach(__v => __obj.update("methodSettings", __v.asInstanceOf[js.Any]))
      stageName.foreach(__v => __obj.update("stageName", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      tracingEnabled.foreach(__v => __obj.update("tracingEnabled", __v.asInstanceOf[js.Any]))
      variables.foreach(__v => __obj.update("variables", __v.asInstanceOf[js.Any]))
      webAclArn.foreach(__v => __obj.update("webAclArn", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Stage]
    }
  }

  /**
    * A reference to a unique stage identified in the format <code>{restApiId}/{stage}</code>.
    */
  @js.native
  trait StageKey extends js.Object {
    var restApiId: js.UndefOr[String]
    var stageName: js.UndefOr[String]
  }

  object StageKey {
    def apply(
        restApiId: js.UndefOr[String] = js.undefined,
        stageName: js.UndefOr[String] = js.undefined
    ): StageKey = {
      val __obj = js.Dictionary.empty[js.Any]
      restApiId.foreach(__v => __obj.update("restApiId", __v.asInstanceOf[js.Any]))
      stageName.foreach(__v => __obj.update("stageName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StageKey]
    }
  }

  /**
    * A list of <a>Stage</a> resources that are associated with the <a>ApiKey</a> resource.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/stages.html|Deploying API in Stages]]
    */
  @js.native
  trait Stages extends js.Object {
    var item: js.UndefOr[ListOfStage]
  }

  object Stages {
    def apply(
        item: js.UndefOr[ListOfStage] = js.undefined
    ): Stages = {
      val __obj = js.Dictionary.empty[js.Any]
      item.foreach(__v => __obj.update("item", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Stages]
    }
  }

  /**
    * Adds or updates a tag on a given resource.
    */
  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: String
    var tags: MapOfStringToString
  }

  object TagResourceRequest {
    def apply(
        resourceArn: String,
        tags: MapOfStringToString
    ): TagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags"        -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  @js.native
  trait Tags extends js.Object {
    var tags: js.UndefOr[MapOfStringToString]
  }

  object Tags {
    def apply(
        tags: js.UndefOr[MapOfStringToString] = js.undefined
    ): Tags = {
      val __obj = js.Dictionary.empty[js.Any]
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tags]
    }
  }

  /**
    * Represents a mapping template used to transform a payload.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/models-mappings.html#models-mappings-mappings|Mapping Templates]]
    */
  @js.native
  trait Template extends js.Object {
    var value: js.UndefOr[String]
  }

  object Template {
    def apply(
        value: js.UndefOr[String] = js.undefined
    ): Template = {
      val __obj = js.Dictionary.empty[js.Any]
      value.foreach(__v => __obj.update("value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Template]
    }
  }

  /**
    * Make a request to simulate the execution of an <a>Authorizer</a>.
    */
  @js.native
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

  object TestInvokeAuthorizerRequest {
    def apply(
        authorizerId: String,
        restApiId: String,
        additionalContext: js.UndefOr[MapOfStringToString] = js.undefined,
        body: js.UndefOr[String] = js.undefined,
        headers: js.UndefOr[MapOfStringToString] = js.undefined,
        multiValueHeaders: js.UndefOr[MapOfStringToList] = js.undefined,
        pathWithQueryString: js.UndefOr[String] = js.undefined,
        stageVariables: js.UndefOr[MapOfStringToString] = js.undefined
    ): TestInvokeAuthorizerRequest = {
      val __obj = js.Dictionary[js.Any](
        "authorizerId" -> authorizerId.asInstanceOf[js.Any],
        "restApiId"    -> restApiId.asInstanceOf[js.Any]
      )

      additionalContext.foreach(__v => __obj.update("additionalContext", __v.asInstanceOf[js.Any]))
      body.foreach(__v => __obj.update("body", __v.asInstanceOf[js.Any]))
      headers.foreach(__v => __obj.update("headers", __v.asInstanceOf[js.Any]))
      multiValueHeaders.foreach(__v => __obj.update("multiValueHeaders", __v.asInstanceOf[js.Any]))
      pathWithQueryString.foreach(__v => __obj.update("pathWithQueryString", __v.asInstanceOf[js.Any]))
      stageVariables.foreach(__v => __obj.update("stageVariables", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestInvokeAuthorizerRequest]
    }
  }

  /**
    * Represents the response of the test invoke request for a custom <a>Authorizer</a>
    */
  @js.native
  trait TestInvokeAuthorizerResponse extends js.Object {
    var authorization: js.UndefOr[MapOfStringToList]
    var claims: js.UndefOr[MapOfStringToString]
    var clientStatus: js.UndefOr[Int]
    var latency: js.UndefOr[Double]
    var log: js.UndefOr[String]
    var policy: js.UndefOr[String]
    var principalId: js.UndefOr[String]
  }

  object TestInvokeAuthorizerResponse {
    def apply(
        authorization: js.UndefOr[MapOfStringToList] = js.undefined,
        claims: js.UndefOr[MapOfStringToString] = js.undefined,
        clientStatus: js.UndefOr[Int] = js.undefined,
        latency: js.UndefOr[Double] = js.undefined,
        log: js.UndefOr[String] = js.undefined,
        policy: js.UndefOr[String] = js.undefined,
        principalId: js.UndefOr[String] = js.undefined
    ): TestInvokeAuthorizerResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      authorization.foreach(__v => __obj.update("authorization", __v.asInstanceOf[js.Any]))
      claims.foreach(__v => __obj.update("claims", __v.asInstanceOf[js.Any]))
      clientStatus.foreach(__v => __obj.update("clientStatus", __v.asInstanceOf[js.Any]))
      latency.foreach(__v => __obj.update("latency", __v.asInstanceOf[js.Any]))
      log.foreach(__v => __obj.update("log", __v.asInstanceOf[js.Any]))
      policy.foreach(__v => __obj.update("policy", __v.asInstanceOf[js.Any]))
      principalId.foreach(__v => __obj.update("principalId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestInvokeAuthorizerResponse]
    }
  }

  /**
    * Make a request to simulate the execution of a <a>Method</a>.
    */
  @js.native
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

  object TestInvokeMethodRequest {
    def apply(
        httpMethod: String,
        resourceId: String,
        restApiId: String,
        body: js.UndefOr[String] = js.undefined,
        clientCertificateId: js.UndefOr[String] = js.undefined,
        headers: js.UndefOr[MapOfStringToString] = js.undefined,
        multiValueHeaders: js.UndefOr[MapOfStringToList] = js.undefined,
        pathWithQueryString: js.UndefOr[String] = js.undefined,
        stageVariables: js.UndefOr[MapOfStringToString] = js.undefined
    ): TestInvokeMethodRequest = {
      val __obj = js.Dictionary[js.Any](
        "httpMethod" -> httpMethod.asInstanceOf[js.Any],
        "resourceId" -> resourceId.asInstanceOf[js.Any],
        "restApiId"  -> restApiId.asInstanceOf[js.Any]
      )

      body.foreach(__v => __obj.update("body", __v.asInstanceOf[js.Any]))
      clientCertificateId.foreach(__v => __obj.update("clientCertificateId", __v.asInstanceOf[js.Any]))
      headers.foreach(__v => __obj.update("headers", __v.asInstanceOf[js.Any]))
      multiValueHeaders.foreach(__v => __obj.update("multiValueHeaders", __v.asInstanceOf[js.Any]))
      pathWithQueryString.foreach(__v => __obj.update("pathWithQueryString", __v.asInstanceOf[js.Any]))
      stageVariables.foreach(__v => __obj.update("stageVariables", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestInvokeMethodRequest]
    }
  }

  /**
    * Represents the response of the test invoke request in the HTTP method.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-test-method.html#how-to-test-method-console|Test API using the API Gateway console]]
    */
  @js.native
  trait TestInvokeMethodResponse extends js.Object {
    var body: js.UndefOr[String]
    var headers: js.UndefOr[MapOfStringToString]
    var latency: js.UndefOr[Double]
    var log: js.UndefOr[String]
    var multiValueHeaders: js.UndefOr[MapOfStringToList]
    var status: js.UndefOr[Int]
  }

  object TestInvokeMethodResponse {
    def apply(
        body: js.UndefOr[String] = js.undefined,
        headers: js.UndefOr[MapOfStringToString] = js.undefined,
        latency: js.UndefOr[Double] = js.undefined,
        log: js.UndefOr[String] = js.undefined,
        multiValueHeaders: js.UndefOr[MapOfStringToList] = js.undefined,
        status: js.UndefOr[Int] = js.undefined
    ): TestInvokeMethodResponse = {
      val __obj = js.Dictionary.empty[js.Any]
      body.foreach(__v => __obj.update("body", __v.asInstanceOf[js.Any]))
      headers.foreach(__v => __obj.update("headers", __v.asInstanceOf[js.Any]))
      latency.foreach(__v => __obj.update("latency", __v.asInstanceOf[js.Any]))
      log.foreach(__v => __obj.update("log", __v.asInstanceOf[js.Any]))
      multiValueHeaders.foreach(__v => __obj.update("multiValueHeaders", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestInvokeMethodResponse]
    }
  }

  /**
    * The API request rate limits.
    */
  @js.native
  trait ThrottleSettings extends js.Object {
    var burstLimit: js.UndefOr[Int]
    var rateLimit: js.UndefOr[Double]
  }

  object ThrottleSettings {
    def apply(
        burstLimit: js.UndefOr[Int] = js.undefined,
        rateLimit: js.UndefOr[Double] = js.undefined
    ): ThrottleSettings = {
      val __obj = js.Dictionary.empty[js.Any]
      burstLimit.foreach(__v => __obj.update("burstLimit", __v.asInstanceOf[js.Any]))
      rateLimit.foreach(__v => __obj.update("rateLimit", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ThrottleSettings]
    }
  }

  object UnauthorizedCacheControlHeaderStrategyEnum {
    val FAIL_WITH_403                   = "FAIL_WITH_403"
    val SUCCEED_WITH_RESPONSE_HEADER    = "SUCCEED_WITH_RESPONSE_HEADER"
    val SUCCEED_WITHOUT_RESPONSE_HEADER = "SUCCEED_WITHOUT_RESPONSE_HEADER"

    val values = IndexedSeq(FAIL_WITH_403, SUCCEED_WITH_RESPONSE_HEADER, SUCCEED_WITHOUT_RESPONSE_HEADER)
  }

  /**
    * Removes a tag from a given resource.
    */
  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: String
    var tagKeys: ListOfString
  }

  object UntagResourceRequest {
    def apply(
        resourceArn: String,
        tagKeys: ListOfString
    ): UntagResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys"     -> tagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  /**
    * Requests API Gateway to change information about the current <a>Account</a> resource.
    */
  @js.native
  trait UpdateAccountRequest extends js.Object {
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateAccountRequest {
    def apply(
        patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    ): UpdateAccountRequest = {
      val __obj = js.Dictionary.empty[js.Any]
      patchOperations.foreach(__v => __obj.update("patchOperations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAccountRequest]
    }
  }

  /**
    * A request to change information about an <a>ApiKey</a> resource.
    */
  @js.native
  trait UpdateApiKeyRequest extends js.Object {
    var apiKey: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateApiKeyRequest {
    def apply(
        apiKey: String,
        patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    ): UpdateApiKeyRequest = {
      val __obj = js.Dictionary[js.Any](
        "apiKey" -> apiKey.asInstanceOf[js.Any]
      )

      patchOperations.foreach(__v => __obj.update("patchOperations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateApiKeyRequest]
    }
  }

  /**
    * Request to update an existing <a>Authorizer</a> resource.
    */
  @js.native
  trait UpdateAuthorizerRequest extends js.Object {
    var authorizerId: String
    var restApiId: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateAuthorizerRequest {
    def apply(
        authorizerId: String,
        restApiId: String,
        patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    ): UpdateAuthorizerRequest = {
      val __obj = js.Dictionary[js.Any](
        "authorizerId" -> authorizerId.asInstanceOf[js.Any],
        "restApiId"    -> restApiId.asInstanceOf[js.Any]
      )

      patchOperations.foreach(__v => __obj.update("patchOperations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAuthorizerRequest]
    }
  }

  /**
    * A request to change information about the <a>BasePathMapping</a> resource.
    */
  @js.native
  trait UpdateBasePathMappingRequest extends js.Object {
    var basePath: String
    var domainName: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateBasePathMappingRequest {
    def apply(
        basePath: String,
        domainName: String,
        patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    ): UpdateBasePathMappingRequest = {
      val __obj = js.Dictionary[js.Any](
        "basePath"   -> basePath.asInstanceOf[js.Any],
        "domainName" -> domainName.asInstanceOf[js.Any]
      )

      patchOperations.foreach(__v => __obj.update("patchOperations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateBasePathMappingRequest]
    }
  }

  /**
    * A request to change information about an <a>ClientCertificate</a> resource.
    */
  @js.native
  trait UpdateClientCertificateRequest extends js.Object {
    var clientCertificateId: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateClientCertificateRequest {
    def apply(
        clientCertificateId: String,
        patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    ): UpdateClientCertificateRequest = {
      val __obj = js.Dictionary[js.Any](
        "clientCertificateId" -> clientCertificateId.asInstanceOf[js.Any]
      )

      patchOperations.foreach(__v => __obj.update("patchOperations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateClientCertificateRequest]
    }
  }

  /**
    * Requests API Gateway to change information about a <a>Deployment</a> resource.
    */
  @js.native
  trait UpdateDeploymentRequest extends js.Object {
    var deploymentId: String
    var restApiId: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateDeploymentRequest {
    def apply(
        deploymentId: String,
        restApiId: String,
        patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    ): UpdateDeploymentRequest = {
      val __obj = js.Dictionary[js.Any](
        "deploymentId" -> deploymentId.asInstanceOf[js.Any],
        "restApiId"    -> restApiId.asInstanceOf[js.Any]
      )

      patchOperations.foreach(__v => __obj.update("patchOperations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDeploymentRequest]
    }
  }

  /**
    * Updates an existing documentation part of a given API.
    */
  @js.native
  trait UpdateDocumentationPartRequest extends js.Object {
    var documentationPartId: String
    var restApiId: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateDocumentationPartRequest {
    def apply(
        documentationPartId: String,
        restApiId: String,
        patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    ): UpdateDocumentationPartRequest = {
      val __obj = js.Dictionary[js.Any](
        "documentationPartId" -> documentationPartId.asInstanceOf[js.Any],
        "restApiId"           -> restApiId.asInstanceOf[js.Any]
      )

      patchOperations.foreach(__v => __obj.update("patchOperations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDocumentationPartRequest]
    }
  }

  /**
    * Updates an existing documentation version of an API.
    */
  @js.native
  trait UpdateDocumentationVersionRequest extends js.Object {
    var documentationVersion: String
    var restApiId: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateDocumentationVersionRequest {
    def apply(
        documentationVersion: String,
        restApiId: String,
        patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    ): UpdateDocumentationVersionRequest = {
      val __obj = js.Dictionary[js.Any](
        "documentationVersion" -> documentationVersion.asInstanceOf[js.Any],
        "restApiId"            -> restApiId.asInstanceOf[js.Any]
      )

      patchOperations.foreach(__v => __obj.update("patchOperations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDocumentationVersionRequest]
    }
  }

  /**
    * A request to change information about the <a>DomainName</a> resource.
    */
  @js.native
  trait UpdateDomainNameRequest extends js.Object {
    var domainName: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateDomainNameRequest {
    def apply(
        domainName: String,
        patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    ): UpdateDomainNameRequest = {
      val __obj = js.Dictionary[js.Any](
        "domainName" -> domainName.asInstanceOf[js.Any]
      )

      patchOperations.foreach(__v => __obj.update("patchOperations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDomainNameRequest]
    }
  }

  /**
    * Updates a <a>GatewayResponse</a> of a specified response type on the given <a>RestApi</a>.
    */
  @js.native
  trait UpdateGatewayResponseRequest extends js.Object {
    var responseType: GatewayResponseType
    var restApiId: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateGatewayResponseRequest {
    def apply(
        responseType: GatewayResponseType,
        restApiId: String,
        patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    ): UpdateGatewayResponseRequest = {
      val __obj = js.Dictionary[js.Any](
        "responseType" -> responseType.asInstanceOf[js.Any],
        "restApiId"    -> restApiId.asInstanceOf[js.Any]
      )

      patchOperations.foreach(__v => __obj.update("patchOperations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGatewayResponseRequest]
    }
  }

  /**
    * Represents an update integration request.
    */
  @js.native
  trait UpdateIntegrationRequest extends js.Object {
    var httpMethod: String
    var resourceId: String
    var restApiId: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateIntegrationRequest {
    def apply(
        httpMethod: String,
        resourceId: String,
        restApiId: String,
        patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    ): UpdateIntegrationRequest = {
      val __obj = js.Dictionary[js.Any](
        "httpMethod" -> httpMethod.asInstanceOf[js.Any],
        "resourceId" -> resourceId.asInstanceOf[js.Any],
        "restApiId"  -> restApiId.asInstanceOf[js.Any]
      )

      patchOperations.foreach(__v => __obj.update("patchOperations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateIntegrationRequest]
    }
  }

  /**
    * Represents an update integration response request.
    */
  @js.native
  trait UpdateIntegrationResponseRequest extends js.Object {
    var httpMethod: String
    var resourceId: String
    var restApiId: String
    var statusCode: StatusCode
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateIntegrationResponseRequest {
    def apply(
        httpMethod: String,
        resourceId: String,
        restApiId: String,
        statusCode: StatusCode,
        patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    ): UpdateIntegrationResponseRequest = {
      val __obj = js.Dictionary[js.Any](
        "httpMethod" -> httpMethod.asInstanceOf[js.Any],
        "resourceId" -> resourceId.asInstanceOf[js.Any],
        "restApiId"  -> restApiId.asInstanceOf[js.Any],
        "statusCode" -> statusCode.asInstanceOf[js.Any]
      )

      patchOperations.foreach(__v => __obj.update("patchOperations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateIntegrationResponseRequest]
    }
  }

  /**
    * Request to update an existing <a>Method</a> resource.
    */
  @js.native
  trait UpdateMethodRequest extends js.Object {
    var httpMethod: String
    var resourceId: String
    var restApiId: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateMethodRequest {
    def apply(
        httpMethod: String,
        resourceId: String,
        restApiId: String,
        patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    ): UpdateMethodRequest = {
      val __obj = js.Dictionary[js.Any](
        "httpMethod" -> httpMethod.asInstanceOf[js.Any],
        "resourceId" -> resourceId.asInstanceOf[js.Any],
        "restApiId"  -> restApiId.asInstanceOf[js.Any]
      )

      patchOperations.foreach(__v => __obj.update("patchOperations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMethodRequest]
    }
  }

  /**
    * A request to update an existing <a>MethodResponse</a> resource.
    */
  @js.native
  trait UpdateMethodResponseRequest extends js.Object {
    var httpMethod: String
    var resourceId: String
    var restApiId: String
    var statusCode: StatusCode
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateMethodResponseRequest {
    def apply(
        httpMethod: String,
        resourceId: String,
        restApiId: String,
        statusCode: StatusCode,
        patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    ): UpdateMethodResponseRequest = {
      val __obj = js.Dictionary[js.Any](
        "httpMethod" -> httpMethod.asInstanceOf[js.Any],
        "resourceId" -> resourceId.asInstanceOf[js.Any],
        "restApiId"  -> restApiId.asInstanceOf[js.Any],
        "statusCode" -> statusCode.asInstanceOf[js.Any]
      )

      patchOperations.foreach(__v => __obj.update("patchOperations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMethodResponseRequest]
    }
  }

  /**
    * Request to update an existing model in an existing <a>RestApi</a> resource.
    */
  @js.native
  trait UpdateModelRequest extends js.Object {
    var modelName: String
    var restApiId: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateModelRequest {
    def apply(
        modelName: String,
        restApiId: String,
        patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    ): UpdateModelRequest = {
      val __obj = js.Dictionary[js.Any](
        "modelName" -> modelName.asInstanceOf[js.Any],
        "restApiId" -> restApiId.asInstanceOf[js.Any]
      )

      patchOperations.foreach(__v => __obj.update("patchOperations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateModelRequest]
    }
  }

  /**
    * Updates a <a>RequestValidator</a> of a given <a>RestApi</a>.
    */
  @js.native
  trait UpdateRequestValidatorRequest extends js.Object {
    var requestValidatorId: String
    var restApiId: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateRequestValidatorRequest {
    def apply(
        requestValidatorId: String,
        restApiId: String,
        patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    ): UpdateRequestValidatorRequest = {
      val __obj = js.Dictionary[js.Any](
        "requestValidatorId" -> requestValidatorId.asInstanceOf[js.Any],
        "restApiId"          -> restApiId.asInstanceOf[js.Any]
      )

      patchOperations.foreach(__v => __obj.update("patchOperations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRequestValidatorRequest]
    }
  }

  /**
    * Request to change information about a <a>Resource</a> resource.
    */
  @js.native
  trait UpdateResourceRequest extends js.Object {
    var resourceId: String
    var restApiId: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateResourceRequest {
    def apply(
        resourceId: String,
        restApiId: String,
        patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    ): UpdateResourceRequest = {
      val __obj = js.Dictionary[js.Any](
        "resourceId" -> resourceId.asInstanceOf[js.Any],
        "restApiId"  -> restApiId.asInstanceOf[js.Any]
      )

      patchOperations.foreach(__v => __obj.update("patchOperations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateResourceRequest]
    }
  }

  /**
    * Request to update an existing <a>RestApi</a> resource in your collection.
    */
  @js.native
  trait UpdateRestApiRequest extends js.Object {
    var restApiId: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateRestApiRequest {
    def apply(
        restApiId: String,
        patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    ): UpdateRestApiRequest = {
      val __obj = js.Dictionary[js.Any](
        "restApiId" -> restApiId.asInstanceOf[js.Any]
      )

      patchOperations.foreach(__v => __obj.update("patchOperations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRestApiRequest]
    }
  }

  /**
    * Requests API Gateway to change information about a <a>Stage</a> resource.
    */
  @js.native
  trait UpdateStageRequest extends js.Object {
    var restApiId: String
    var stageName: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateStageRequest {
    def apply(
        restApiId: String,
        stageName: String,
        patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    ): UpdateStageRequest = {
      val __obj = js.Dictionary[js.Any](
        "restApiId" -> restApiId.asInstanceOf[js.Any],
        "stageName" -> stageName.asInstanceOf[js.Any]
      )

      patchOperations.foreach(__v => __obj.update("patchOperations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateStageRequest]
    }
  }

  /**
    * The PATCH request to update a usage plan of a given plan Id.
    */
  @js.native
  trait UpdateUsagePlanRequest extends js.Object {
    var usagePlanId: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateUsagePlanRequest {
    def apply(
        usagePlanId: String,
        patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    ): UpdateUsagePlanRequest = {
      val __obj = js.Dictionary[js.Any](
        "usagePlanId" -> usagePlanId.asInstanceOf[js.Any]
      )

      patchOperations.foreach(__v => __obj.update("patchOperations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUsagePlanRequest]
    }
  }

  /**
    * The PATCH request to grant a temporary extension to the remaining quota of a usage plan associated with a specified API key.
    */
  @js.native
  trait UpdateUsageRequest extends js.Object {
    var keyId: String
    var usagePlanId: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateUsageRequest {
    def apply(
        keyId: String,
        usagePlanId: String,
        patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    ): UpdateUsageRequest = {
      val __obj = js.Dictionary[js.Any](
        "keyId"       -> keyId.asInstanceOf[js.Any],
        "usagePlanId" -> usagePlanId.asInstanceOf[js.Any]
      )

      patchOperations.foreach(__v => __obj.update("patchOperations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateUsageRequest]
    }
  }

  /**
    * Updates an existing <a>VpcLink</a> of a specified identifier.
    */
  @js.native
  trait UpdateVpcLinkRequest extends js.Object {
    var vpcLinkId: String
    var patchOperations: js.UndefOr[ListOfPatchOperation]
  }

  object UpdateVpcLinkRequest {
    def apply(
        vpcLinkId: String,
        patchOperations: js.UndefOr[ListOfPatchOperation] = js.undefined
    ): UpdateVpcLinkRequest = {
      val __obj = js.Dictionary[js.Any](
        "vpcLinkId" -> vpcLinkId.asInstanceOf[js.Any]
      )

      patchOperations.foreach(__v => __obj.update("patchOperations", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVpcLinkRequest]
    }
  }

  /**
    * Represents the usage data of a usage plan.
    *  <div class="remarks"/>
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-api-usage-plans.html|Create and Use Usage Plans]], [[https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-create-usage-plans-with-console.html#api-gateway-usage-plan-manage-usage|Manage Usage in a Usage Plan]]
    */
  @js.native
  trait Usage extends js.Object {
    var endDate: js.UndefOr[String]
    var items: js.UndefOr[MapOfKeyUsages]
    var position: js.UndefOr[String]
    var startDate: js.UndefOr[String]
    var usagePlanId: js.UndefOr[String]
  }

  object Usage {
    def apply(
        endDate: js.UndefOr[String] = js.undefined,
        items: js.UndefOr[MapOfKeyUsages] = js.undefined,
        position: js.UndefOr[String] = js.undefined,
        startDate: js.UndefOr[String] = js.undefined,
        usagePlanId: js.UndefOr[String] = js.undefined
    ): Usage = {
      val __obj = js.Dictionary.empty[js.Any]
      endDate.foreach(__v => __obj.update("endDate", __v.asInstanceOf[js.Any]))
      items.foreach(__v => __obj.update("items", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      startDate.foreach(__v => __obj.update("startDate", __v.asInstanceOf[js.Any]))
      usagePlanId.foreach(__v => __obj.update("usagePlanId", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Usage]
    }
  }

  /**
    * Represents a usage plan than can specify who can assess associated API stages with specified request limits and quotas.
    *  <div class="remarks"> In a usage plan, you associate an API by specifying the API's Id and a stage name of the specified API. You add plan customers by adding API keys to the plan.
    *  </div>
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-api-usage-plans.html|Create and Use Usage Plans]]
    */
  @js.native
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

  object UsagePlan {
    def apply(
        apiStages: js.UndefOr[ListOfApiStage] = js.undefined,
        description: js.UndefOr[String] = js.undefined,
        id: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        productCode: js.UndefOr[String] = js.undefined,
        quota: js.UndefOr[QuotaSettings] = js.undefined,
        tags: js.UndefOr[MapOfStringToString] = js.undefined,
        throttle: js.UndefOr[ThrottleSettings] = js.undefined
    ): UsagePlan = {
      val __obj = js.Dictionary.empty[js.Any]
      apiStages.foreach(__v => __obj.update("apiStages", __v.asInstanceOf[js.Any]))
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.update("id", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      productCode.foreach(__v => __obj.update("productCode", __v.asInstanceOf[js.Any]))
      quota.foreach(__v => __obj.update("quota", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      throttle.foreach(__v => __obj.update("throttle", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UsagePlan]
    }
  }

  /**
    * Represents a usage plan key to identify a plan customer.
    *  <div class="remarks"> To associate an API stage with a selected API key in a usage plan, you must create a UsagePlanKey resource to represent the selected <a>ApiKey</a>.
    *  </div>"
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-api-usage-plans.html|Create and Use Usage Plans]]
    */
  @js.native
  trait UsagePlanKey extends js.Object {
    var id: js.UndefOr[String]
    var name: js.UndefOr[String]
    var `type`: js.UndefOr[String]
    var value: js.UndefOr[String]
  }

  object UsagePlanKey {
    def apply(
        id: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        `type`: js.UndefOr[String] = js.undefined,
        value: js.UndefOr[String] = js.undefined
    ): UsagePlanKey = {
      val __obj = js.Dictionary.empty[js.Any]
      id.foreach(__v => __obj.update("id", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      `type`.foreach(__v => __obj.update("type", __v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.update("value", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UsagePlanKey]
    }
  }

  /**
    * Represents the collection of usage plan keys added to usage plans for the associated API keys and, possibly, other types of keys.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-api-usage-plans.html|Create and Use Usage Plans]]
    */
  @js.native
  trait UsagePlanKeys extends js.Object {
    var items: js.UndefOr[ListOfUsagePlanKey]
    var position: js.UndefOr[String]
  }

  object UsagePlanKeys {
    def apply(
        items: js.UndefOr[ListOfUsagePlanKey] = js.undefined,
        position: js.UndefOr[String] = js.undefined
    ): UsagePlanKeys = {
      val __obj = js.Dictionary.empty[js.Any]
      items.foreach(__v => __obj.update("items", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UsagePlanKeys]
    }
  }

  /**
    * Represents a collection of usage plans for an AWS account.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-api-usage-plans.html|Create and Use Usage Plans]]
    */
  @js.native
  trait UsagePlans extends js.Object {
    var items: js.UndefOr[ListOfUsagePlan]
    var position: js.UndefOr[String]
  }

  object UsagePlans {
    def apply(
        items: js.UndefOr[ListOfUsagePlan] = js.undefined,
        position: js.UndefOr[String] = js.undefined
    ): UsagePlans = {
      val __obj = js.Dictionary.empty[js.Any]
      items.foreach(__v => __obj.update("items", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UsagePlans]
    }
  }

  /**
    * A API Gateway VPC link for a <a>RestApi</a> to access resources in an Amazon Virtual Private Cloud (VPC).
    *  <div class="remarks"> <p>To enable access to a resource in an Amazon Virtual Private Cloud through Amazon API Gateway, you, as an API developer, create a <a>VpcLink</a> resource targeted for one or more network load balancers of the VPC and then integrate an API method with a private integration that uses the <a>VpcLink</a>. The private integration has an integration type of <code>HTTP</code> or <code>HTTP_PROXY</code> and has a connection type of <code>VPC_LINK</code>. The integration uses the <code>connectionId</code> property to identify the <a>VpcLink</a> used.
    *  </p> </div>
    */
  @js.native
  trait VpcLink extends js.Object {
    var description: js.UndefOr[String]
    var id: js.UndefOr[String]
    var name: js.UndefOr[String]
    var status: js.UndefOr[VpcLinkStatus]
    var statusMessage: js.UndefOr[String]
    var tags: js.UndefOr[MapOfStringToString]
    var targetArns: js.UndefOr[ListOfString]
  }

  object VpcLink {
    def apply(
        description: js.UndefOr[String] = js.undefined,
        id: js.UndefOr[String] = js.undefined,
        name: js.UndefOr[String] = js.undefined,
        status: js.UndefOr[VpcLinkStatus] = js.undefined,
        statusMessage: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[MapOfStringToString] = js.undefined,
        targetArns: js.UndefOr[ListOfString] = js.undefined
    ): VpcLink = {
      val __obj = js.Dictionary.empty[js.Any]
      description.foreach(__v => __obj.update("description", __v.asInstanceOf[js.Any]))
      id.foreach(__v => __obj.update("id", __v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.update("name", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      statusMessage.foreach(__v => __obj.update("statusMessage", __v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.update("tags", __v.asInstanceOf[js.Any]))
      targetArns.foreach(__v => __obj.update("targetArns", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcLink]
    }
  }

  object VpcLinkStatusEnum {
    val AVAILABLE = "AVAILABLE"
    val PENDING   = "PENDING"
    val DELETING  = "DELETING"
    val FAILED    = "FAILED"

    val values = IndexedSeq(AVAILABLE, PENDING, DELETING, FAILED)
  }

  /**
    * The collection of VPC links under the caller's account in a region.
    *
    * @see [[https://docs.aws.amazon.com/apigateway/latest/developerguide/getting-started-with-private-integration.html|Getting Started with Private Integrations]], [[https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-private-integration.html|Set up Private Integrations]]
    */
  @js.native
  trait VpcLinks extends js.Object {
    var items: js.UndefOr[ListOfVpcLink]
    var position: js.UndefOr[String]
  }

  object VpcLinks {
    def apply(
        items: js.UndefOr[ListOfVpcLink] = js.undefined,
        position: js.UndefOr[String] = js.undefined
    ): VpcLinks = {
      val __obj = js.Dictionary.empty[js.Any]
      items.foreach(__v => __obj.update("items", __v.asInstanceOf[js.Any]))
      position.foreach(__v => __obj.update("position", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VpcLinks]
    }
  }
}
