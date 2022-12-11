package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object chimesdkvoice {
  type AlexaSkillId = String
  type AlexaSkillIdList = js.Array[AlexaSkillId]
  type Alpha2CountryCode = String
  type AreaCode = String
  type CallingName = String
  type CallingRegion = String
  type CallingRegionList = js.Array[CallingRegion]
  type CandidateAddressList = js.Array[CandidateAddress]
  type CapabilityList = js.Array[Capability]
  type Country = String
  type CountryList = js.Array[Country]
  type CpsLimit = Int
  type CredentialList = js.Array[Credential]
  type DNISEmergencyCallingConfigurationList = js.Array[DNISEmergencyCallingConfiguration]
  type DataRetentionInHours = Int
  type E164PhoneNumber = String
  type E164PhoneNumberList = js.Array[E164PhoneNumber]
  type FunctionArn = String
  type GuidString = String
  type Iso8601Timestamp = js.Date
  type NextTokenString = String
  type NonEmptyString = String
  type NonEmptyString128 = String
  type NonEmptyStringList = js.Array[String]
  type NullableBoolean = Boolean
  type OrderedPhoneNumberList = js.Array[OrderedPhoneNumber]
  type OriginationRouteList = js.Array[OriginationRoute]
  type OriginationRoutePriority = Int
  type OriginationRouteWeight = Int
  type ParticipantPhoneNumberList = js.Array[E164PhoneNumber]
  type Participants = js.Array[Participant]
  type PhoneNumberAssociationList = js.Array[PhoneNumberAssociation]
  type PhoneNumberCountriesList = js.Array[PhoneNumberCountry]
  type PhoneNumberErrorList = js.Array[PhoneNumberError]
  type PhoneNumberList = js.Array[PhoneNumber]
  type PhoneNumberMaxResults = Int
  type PhoneNumberOrderList = js.Array[PhoneNumberOrder]
  type PhoneNumberTypeList = js.Array[PhoneNumberType]
  type Port = Int
  type PositiveInteger = Int
  type ProxySessionNameString = String
  type ProxySessions = js.Array[ProxySession]
  type ResultMax = Int
  type SMACreateCallArgumentsMap = js.Dictionary[SensitiveString]
  type SMAUpdateCallArgumentsMap = js.Dictionary[SensitiveString]
  type SensitiveNonEmptyString = String
  type SensitiveString = String
  type SensitiveStringList = js.Array[SensitiveString]
  type SipApplicationPriority = Int
  type SipHeadersMap = js.Dictionary[SensitiveString]
  type SipMediaApplicationEndpointList = js.Array[SipMediaApplicationEndpoint]
  type SipMediaApplicationList = js.Array[SipMediaApplication]
  type SipMediaApplicationName = String
  type SipRuleList = js.Array[SipRule]
  type SipRuleName = String
  type SipRuleTargetApplicationList = js.Array[SipRuleTargetApplication]
  type StreamingNotificationTargetList = js.Array[StreamingNotificationTarget]
  type String128 = String
  type StringList = js.Array[String]
  type TollFreePrefix = String
  type UpdatePhoneNumberRequestItemList = js.Array[UpdatePhoneNumberRequestItem]
  type ValidationResult = Int
  type VoiceConnectorAwsRegionList = js.Array[VoiceConnectorAwsRegion]
  type VoiceConnectorGroupList = js.Array[VoiceConnectorGroup]
  type VoiceConnectorGroupName = String
  type VoiceConnectorItemList = js.Array[VoiceConnectorItem]
  type VoiceConnectorItemPriority = Int
  type VoiceConnectorList = js.Array[VoiceConnector]
  type VoiceConnectorName = String

  final class ChimeSDKVoiceOps(private val service: ChimeSDKVoice) extends AnyVal {

    @inline def associatePhoneNumbersWithVoiceConnectorFuture(params: AssociatePhoneNumbersWithVoiceConnectorRequest): Future[AssociatePhoneNumbersWithVoiceConnectorResponse] = service.associatePhoneNumbersWithVoiceConnector(params).promise().toFuture
    @inline def associatePhoneNumbersWithVoiceConnectorGroupFuture(params: AssociatePhoneNumbersWithVoiceConnectorGroupRequest): Future[AssociatePhoneNumbersWithVoiceConnectorGroupResponse] = service.associatePhoneNumbersWithVoiceConnectorGroup(params).promise().toFuture
    @inline def batchDeletePhoneNumberFuture(params: BatchDeletePhoneNumberRequest): Future[BatchDeletePhoneNumberResponse] = service.batchDeletePhoneNumber(params).promise().toFuture
    @inline def batchUpdatePhoneNumberFuture(params: BatchUpdatePhoneNumberRequest): Future[BatchUpdatePhoneNumberResponse] = service.batchUpdatePhoneNumber(params).promise().toFuture
    @inline def createPhoneNumberOrderFuture(params: CreatePhoneNumberOrderRequest): Future[CreatePhoneNumberOrderResponse] = service.createPhoneNumberOrder(params).promise().toFuture
    @inline def createProxySessionFuture(params: CreateProxySessionRequest): Future[CreateProxySessionResponse] = service.createProxySession(params).promise().toFuture
    @inline def createSipMediaApplicationCallFuture(params: CreateSipMediaApplicationCallRequest): Future[CreateSipMediaApplicationCallResponse] = service.createSipMediaApplicationCall(params).promise().toFuture
    @inline def createSipMediaApplicationFuture(params: CreateSipMediaApplicationRequest): Future[CreateSipMediaApplicationResponse] = service.createSipMediaApplication(params).promise().toFuture
    @inline def createSipRuleFuture(params: CreateSipRuleRequest): Future[CreateSipRuleResponse] = service.createSipRule(params).promise().toFuture
    @inline def createVoiceConnectorFuture(params: CreateVoiceConnectorRequest): Future[CreateVoiceConnectorResponse] = service.createVoiceConnector(params).promise().toFuture
    @inline def createVoiceConnectorGroupFuture(params: CreateVoiceConnectorGroupRequest): Future[CreateVoiceConnectorGroupResponse] = service.createVoiceConnectorGroup(params).promise().toFuture
    @inline def deletePhoneNumberFuture(params: DeletePhoneNumberRequest): Future[js.Object] = service.deletePhoneNumber(params).promise().toFuture
    @inline def deleteProxySessionFuture(params: DeleteProxySessionRequest): Future[js.Object] = service.deleteProxySession(params).promise().toFuture
    @inline def deleteSipMediaApplicationFuture(params: DeleteSipMediaApplicationRequest): Future[js.Object] = service.deleteSipMediaApplication(params).promise().toFuture
    @inline def deleteSipRuleFuture(params: DeleteSipRuleRequest): Future[js.Object] = service.deleteSipRule(params).promise().toFuture
    @inline def deleteVoiceConnectorEmergencyCallingConfigurationFuture(params: DeleteVoiceConnectorEmergencyCallingConfigurationRequest): Future[js.Object] = service.deleteVoiceConnectorEmergencyCallingConfiguration(params).promise().toFuture
    @inline def deleteVoiceConnectorFuture(params: DeleteVoiceConnectorRequest): Future[js.Object] = service.deleteVoiceConnector(params).promise().toFuture
    @inline def deleteVoiceConnectorGroupFuture(params: DeleteVoiceConnectorGroupRequest): Future[js.Object] = service.deleteVoiceConnectorGroup(params).promise().toFuture
    @inline def deleteVoiceConnectorOriginationFuture(params: DeleteVoiceConnectorOriginationRequest): Future[js.Object] = service.deleteVoiceConnectorOrigination(params).promise().toFuture
    @inline def deleteVoiceConnectorProxyFuture(params: DeleteVoiceConnectorProxyRequest): Future[js.Object] = service.deleteVoiceConnectorProxy(params).promise().toFuture
    @inline def deleteVoiceConnectorStreamingConfigurationFuture(params: DeleteVoiceConnectorStreamingConfigurationRequest): Future[js.Object] = service.deleteVoiceConnectorStreamingConfiguration(params).promise().toFuture
    @inline def deleteVoiceConnectorTerminationCredentialsFuture(params: DeleteVoiceConnectorTerminationCredentialsRequest): Future[js.Object] = service.deleteVoiceConnectorTerminationCredentials(params).promise().toFuture
    @inline def deleteVoiceConnectorTerminationFuture(params: DeleteVoiceConnectorTerminationRequest): Future[js.Object] = service.deleteVoiceConnectorTermination(params).promise().toFuture
    @inline def disassociatePhoneNumbersFromVoiceConnectorFuture(params: DisassociatePhoneNumbersFromVoiceConnectorRequest): Future[DisassociatePhoneNumbersFromVoiceConnectorResponse] = service.disassociatePhoneNumbersFromVoiceConnector(params).promise().toFuture
    @inline def disassociatePhoneNumbersFromVoiceConnectorGroupFuture(params: DisassociatePhoneNumbersFromVoiceConnectorGroupRequest): Future[DisassociatePhoneNumbersFromVoiceConnectorGroupResponse] = service.disassociatePhoneNumbersFromVoiceConnectorGroup(params).promise().toFuture
    @inline def getGlobalSettingsFuture(): Future[GetGlobalSettingsResponse] = service.getGlobalSettings().promise().toFuture
    @inline def getPhoneNumberFuture(params: GetPhoneNumberRequest): Future[GetPhoneNumberResponse] = service.getPhoneNumber(params).promise().toFuture
    @inline def getPhoneNumberOrderFuture(params: GetPhoneNumberOrderRequest): Future[GetPhoneNumberOrderResponse] = service.getPhoneNumberOrder(params).promise().toFuture
    @inline def getPhoneNumberSettingsFuture(): Future[GetPhoneNumberSettingsResponse] = service.getPhoneNumberSettings().promise().toFuture
    @inline def getProxySessionFuture(params: GetProxySessionRequest): Future[GetProxySessionResponse] = service.getProxySession(params).promise().toFuture
    @inline def getSipMediaApplicationAlexaSkillConfigurationFuture(params: GetSipMediaApplicationAlexaSkillConfigurationRequest): Future[GetSipMediaApplicationAlexaSkillConfigurationResponse] = service.getSipMediaApplicationAlexaSkillConfiguration(params).promise().toFuture
    @inline def getSipMediaApplicationFuture(params: GetSipMediaApplicationRequest): Future[GetSipMediaApplicationResponse] = service.getSipMediaApplication(params).promise().toFuture
    @inline def getSipMediaApplicationLoggingConfigurationFuture(params: GetSipMediaApplicationLoggingConfigurationRequest): Future[GetSipMediaApplicationLoggingConfigurationResponse] = service.getSipMediaApplicationLoggingConfiguration(params).promise().toFuture
    @inline def getSipRuleFuture(params: GetSipRuleRequest): Future[GetSipRuleResponse] = service.getSipRule(params).promise().toFuture
    @inline def getVoiceConnectorEmergencyCallingConfigurationFuture(params: GetVoiceConnectorEmergencyCallingConfigurationRequest): Future[GetVoiceConnectorEmergencyCallingConfigurationResponse] = service.getVoiceConnectorEmergencyCallingConfiguration(params).promise().toFuture
    @inline def getVoiceConnectorFuture(params: GetVoiceConnectorRequest): Future[GetVoiceConnectorResponse] = service.getVoiceConnector(params).promise().toFuture
    @inline def getVoiceConnectorGroupFuture(params: GetVoiceConnectorGroupRequest): Future[GetVoiceConnectorGroupResponse] = service.getVoiceConnectorGroup(params).promise().toFuture
    @inline def getVoiceConnectorLoggingConfigurationFuture(params: GetVoiceConnectorLoggingConfigurationRequest): Future[GetVoiceConnectorLoggingConfigurationResponse] = service.getVoiceConnectorLoggingConfiguration(params).promise().toFuture
    @inline def getVoiceConnectorOriginationFuture(params: GetVoiceConnectorOriginationRequest): Future[GetVoiceConnectorOriginationResponse] = service.getVoiceConnectorOrigination(params).promise().toFuture
    @inline def getVoiceConnectorProxyFuture(params: GetVoiceConnectorProxyRequest): Future[GetVoiceConnectorProxyResponse] = service.getVoiceConnectorProxy(params).promise().toFuture
    @inline def getVoiceConnectorStreamingConfigurationFuture(params: GetVoiceConnectorStreamingConfigurationRequest): Future[GetVoiceConnectorStreamingConfigurationResponse] = service.getVoiceConnectorStreamingConfiguration(params).promise().toFuture
    @inline def getVoiceConnectorTerminationFuture(params: GetVoiceConnectorTerminationRequest): Future[GetVoiceConnectorTerminationResponse] = service.getVoiceConnectorTermination(params).promise().toFuture
    @inline def getVoiceConnectorTerminationHealthFuture(params: GetVoiceConnectorTerminationHealthRequest): Future[GetVoiceConnectorTerminationHealthResponse] = service.getVoiceConnectorTerminationHealth(params).promise().toFuture
    @inline def listAvailableVoiceConnectorRegionsFuture(): Future[ListAvailableVoiceConnectorRegionsResponse] = service.listAvailableVoiceConnectorRegions().promise().toFuture
    @inline def listPhoneNumberOrdersFuture(params: ListPhoneNumberOrdersRequest): Future[ListPhoneNumberOrdersResponse] = service.listPhoneNumberOrders(params).promise().toFuture
    @inline def listPhoneNumbersFuture(params: ListPhoneNumbersRequest): Future[ListPhoneNumbersResponse] = service.listPhoneNumbers(params).promise().toFuture
    @inline def listProxySessionsFuture(params: ListProxySessionsRequest): Future[ListProxySessionsResponse] = service.listProxySessions(params).promise().toFuture
    @inline def listSipMediaApplicationsFuture(params: ListSipMediaApplicationsRequest): Future[ListSipMediaApplicationsResponse] = service.listSipMediaApplications(params).promise().toFuture
    @inline def listSipRulesFuture(params: ListSipRulesRequest): Future[ListSipRulesResponse] = service.listSipRules(params).promise().toFuture
    @inline def listSupportedPhoneNumberCountriesFuture(params: ListSupportedPhoneNumberCountriesRequest): Future[ListSupportedPhoneNumberCountriesResponse] = service.listSupportedPhoneNumberCountries(params).promise().toFuture
    @inline def listVoiceConnectorGroupsFuture(params: ListVoiceConnectorGroupsRequest): Future[ListVoiceConnectorGroupsResponse] = service.listVoiceConnectorGroups(params).promise().toFuture
    @inline def listVoiceConnectorTerminationCredentialsFuture(params: ListVoiceConnectorTerminationCredentialsRequest): Future[ListVoiceConnectorTerminationCredentialsResponse] = service.listVoiceConnectorTerminationCredentials(params).promise().toFuture
    @inline def listVoiceConnectorsFuture(params: ListVoiceConnectorsRequest): Future[ListVoiceConnectorsResponse] = service.listVoiceConnectors(params).promise().toFuture
    @inline def putSipMediaApplicationAlexaSkillConfigurationFuture(params: PutSipMediaApplicationAlexaSkillConfigurationRequest): Future[PutSipMediaApplicationAlexaSkillConfigurationResponse] = service.putSipMediaApplicationAlexaSkillConfiguration(params).promise().toFuture
    @inline def putSipMediaApplicationLoggingConfigurationFuture(params: PutSipMediaApplicationLoggingConfigurationRequest): Future[PutSipMediaApplicationLoggingConfigurationResponse] = service.putSipMediaApplicationLoggingConfiguration(params).promise().toFuture
    @inline def putVoiceConnectorEmergencyCallingConfigurationFuture(params: PutVoiceConnectorEmergencyCallingConfigurationRequest): Future[PutVoiceConnectorEmergencyCallingConfigurationResponse] = service.putVoiceConnectorEmergencyCallingConfiguration(params).promise().toFuture
    @inline def putVoiceConnectorLoggingConfigurationFuture(params: PutVoiceConnectorLoggingConfigurationRequest): Future[PutVoiceConnectorLoggingConfigurationResponse] = service.putVoiceConnectorLoggingConfiguration(params).promise().toFuture
    @inline def putVoiceConnectorOriginationFuture(params: PutVoiceConnectorOriginationRequest): Future[PutVoiceConnectorOriginationResponse] = service.putVoiceConnectorOrigination(params).promise().toFuture
    @inline def putVoiceConnectorProxyFuture(params: PutVoiceConnectorProxyRequest): Future[PutVoiceConnectorProxyResponse] = service.putVoiceConnectorProxy(params).promise().toFuture
    @inline def putVoiceConnectorStreamingConfigurationFuture(params: PutVoiceConnectorStreamingConfigurationRequest): Future[PutVoiceConnectorStreamingConfigurationResponse] = service.putVoiceConnectorStreamingConfiguration(params).promise().toFuture
    @inline def putVoiceConnectorTerminationCredentialsFuture(params: PutVoiceConnectorTerminationCredentialsRequest): Future[js.Object] = service.putVoiceConnectorTerminationCredentials(params).promise().toFuture
    @inline def putVoiceConnectorTerminationFuture(params: PutVoiceConnectorTerminationRequest): Future[PutVoiceConnectorTerminationResponse] = service.putVoiceConnectorTermination(params).promise().toFuture
    @inline def restorePhoneNumberFuture(params: RestorePhoneNumberRequest): Future[RestorePhoneNumberResponse] = service.restorePhoneNumber(params).promise().toFuture
    @inline def searchAvailablePhoneNumbersFuture(params: SearchAvailablePhoneNumbersRequest): Future[SearchAvailablePhoneNumbersResponse] = service.searchAvailablePhoneNumbers(params).promise().toFuture
    @inline def updateGlobalSettingsFuture(params: UpdateGlobalSettingsRequest): Future[js.Object] = service.updateGlobalSettings(params).promise().toFuture
    @inline def updatePhoneNumberFuture(params: UpdatePhoneNumberRequest): Future[UpdatePhoneNumberResponse] = service.updatePhoneNumber(params).promise().toFuture
    @inline def updatePhoneNumberSettingsFuture(params: UpdatePhoneNumberSettingsRequest): Future[js.Object] = service.updatePhoneNumberSettings(params).promise().toFuture
    @inline def updateProxySessionFuture(params: UpdateProxySessionRequest): Future[UpdateProxySessionResponse] = service.updateProxySession(params).promise().toFuture
    @inline def updateSipMediaApplicationCallFuture(params: UpdateSipMediaApplicationCallRequest): Future[UpdateSipMediaApplicationCallResponse] = service.updateSipMediaApplicationCall(params).promise().toFuture
    @inline def updateSipMediaApplicationFuture(params: UpdateSipMediaApplicationRequest): Future[UpdateSipMediaApplicationResponse] = service.updateSipMediaApplication(params).promise().toFuture
    @inline def updateSipRuleFuture(params: UpdateSipRuleRequest): Future[UpdateSipRuleResponse] = service.updateSipRule(params).promise().toFuture
    @inline def updateVoiceConnectorFuture(params: UpdateVoiceConnectorRequest): Future[UpdateVoiceConnectorResponse] = service.updateVoiceConnector(params).promise().toFuture
    @inline def updateVoiceConnectorGroupFuture(params: UpdateVoiceConnectorGroupRequest): Future[UpdateVoiceConnectorGroupResponse] = service.updateVoiceConnectorGroup(params).promise().toFuture
    @inline def validateE911AddressFuture(params: ValidateE911AddressRequest): Future[ValidateE911AddressResponse] = service.validateE911Address(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/chimesdkvoice", JSImport.Namespace, "AWS.ChimeSDKVoice")
  class ChimeSDKVoice() extends js.Object {
    def this(config: AWSConfig) = this()

    def associatePhoneNumbersWithVoiceConnector(params: AssociatePhoneNumbersWithVoiceConnectorRequest): Request[AssociatePhoneNumbersWithVoiceConnectorResponse] = js.native
    def associatePhoneNumbersWithVoiceConnectorGroup(params: AssociatePhoneNumbersWithVoiceConnectorGroupRequest): Request[AssociatePhoneNumbersWithVoiceConnectorGroupResponse] = js.native
    def batchDeletePhoneNumber(params: BatchDeletePhoneNumberRequest): Request[BatchDeletePhoneNumberResponse] = js.native
    def batchUpdatePhoneNumber(params: BatchUpdatePhoneNumberRequest): Request[BatchUpdatePhoneNumberResponse] = js.native
    def createPhoneNumberOrder(params: CreatePhoneNumberOrderRequest): Request[CreatePhoneNumberOrderResponse] = js.native
    def createProxySession(params: CreateProxySessionRequest): Request[CreateProxySessionResponse] = js.native
    def createSipMediaApplication(params: CreateSipMediaApplicationRequest): Request[CreateSipMediaApplicationResponse] = js.native
    def createSipMediaApplicationCall(params: CreateSipMediaApplicationCallRequest): Request[CreateSipMediaApplicationCallResponse] = js.native
    def createSipRule(params: CreateSipRuleRequest): Request[CreateSipRuleResponse] = js.native
    def createVoiceConnector(params: CreateVoiceConnectorRequest): Request[CreateVoiceConnectorResponse] = js.native
    def createVoiceConnectorGroup(params: CreateVoiceConnectorGroupRequest): Request[CreateVoiceConnectorGroupResponse] = js.native
    def deletePhoneNumber(params: DeletePhoneNumberRequest): Request[js.Object] = js.native
    def deleteProxySession(params: DeleteProxySessionRequest): Request[js.Object] = js.native
    def deleteSipMediaApplication(params: DeleteSipMediaApplicationRequest): Request[js.Object] = js.native
    def deleteSipRule(params: DeleteSipRuleRequest): Request[js.Object] = js.native
    def deleteVoiceConnector(params: DeleteVoiceConnectorRequest): Request[js.Object] = js.native
    def deleteVoiceConnectorEmergencyCallingConfiguration(params: DeleteVoiceConnectorEmergencyCallingConfigurationRequest): Request[js.Object] = js.native
    def deleteVoiceConnectorGroup(params: DeleteVoiceConnectorGroupRequest): Request[js.Object] = js.native
    def deleteVoiceConnectorOrigination(params: DeleteVoiceConnectorOriginationRequest): Request[js.Object] = js.native
    def deleteVoiceConnectorProxy(params: DeleteVoiceConnectorProxyRequest): Request[js.Object] = js.native
    def deleteVoiceConnectorStreamingConfiguration(params: DeleteVoiceConnectorStreamingConfigurationRequest): Request[js.Object] = js.native
    def deleteVoiceConnectorTermination(params: DeleteVoiceConnectorTerminationRequest): Request[js.Object] = js.native
    def deleteVoiceConnectorTerminationCredentials(params: DeleteVoiceConnectorTerminationCredentialsRequest): Request[js.Object] = js.native
    def disassociatePhoneNumbersFromVoiceConnector(params: DisassociatePhoneNumbersFromVoiceConnectorRequest): Request[DisassociatePhoneNumbersFromVoiceConnectorResponse] = js.native
    def disassociatePhoneNumbersFromVoiceConnectorGroup(params: DisassociatePhoneNumbersFromVoiceConnectorGroupRequest): Request[DisassociatePhoneNumbersFromVoiceConnectorGroupResponse] = js.native
    def getGlobalSettings(): Request[GetGlobalSettingsResponse] = js.native
    def getPhoneNumber(params: GetPhoneNumberRequest): Request[GetPhoneNumberResponse] = js.native
    def getPhoneNumberOrder(params: GetPhoneNumberOrderRequest): Request[GetPhoneNumberOrderResponse] = js.native
    def getPhoneNumberSettings(): Request[GetPhoneNumberSettingsResponse] = js.native
    def getProxySession(params: GetProxySessionRequest): Request[GetProxySessionResponse] = js.native
    def getSipMediaApplication(params: GetSipMediaApplicationRequest): Request[GetSipMediaApplicationResponse] = js.native
    def getSipMediaApplicationAlexaSkillConfiguration(params: GetSipMediaApplicationAlexaSkillConfigurationRequest): Request[GetSipMediaApplicationAlexaSkillConfigurationResponse] = js.native
    def getSipMediaApplicationLoggingConfiguration(params: GetSipMediaApplicationLoggingConfigurationRequest): Request[GetSipMediaApplicationLoggingConfigurationResponse] = js.native
    def getSipRule(params: GetSipRuleRequest): Request[GetSipRuleResponse] = js.native
    def getVoiceConnector(params: GetVoiceConnectorRequest): Request[GetVoiceConnectorResponse] = js.native
    def getVoiceConnectorEmergencyCallingConfiguration(params: GetVoiceConnectorEmergencyCallingConfigurationRequest): Request[GetVoiceConnectorEmergencyCallingConfigurationResponse] = js.native
    def getVoiceConnectorGroup(params: GetVoiceConnectorGroupRequest): Request[GetVoiceConnectorGroupResponse] = js.native
    def getVoiceConnectorLoggingConfiguration(params: GetVoiceConnectorLoggingConfigurationRequest): Request[GetVoiceConnectorLoggingConfigurationResponse] = js.native
    def getVoiceConnectorOrigination(params: GetVoiceConnectorOriginationRequest): Request[GetVoiceConnectorOriginationResponse] = js.native
    def getVoiceConnectorProxy(params: GetVoiceConnectorProxyRequest): Request[GetVoiceConnectorProxyResponse] = js.native
    def getVoiceConnectorStreamingConfiguration(params: GetVoiceConnectorStreamingConfigurationRequest): Request[GetVoiceConnectorStreamingConfigurationResponse] = js.native
    def getVoiceConnectorTermination(params: GetVoiceConnectorTerminationRequest): Request[GetVoiceConnectorTerminationResponse] = js.native
    def getVoiceConnectorTerminationHealth(params: GetVoiceConnectorTerminationHealthRequest): Request[GetVoiceConnectorTerminationHealthResponse] = js.native
    def listAvailableVoiceConnectorRegions(): Request[ListAvailableVoiceConnectorRegionsResponse] = js.native
    def listPhoneNumberOrders(params: ListPhoneNumberOrdersRequest): Request[ListPhoneNumberOrdersResponse] = js.native
    def listPhoneNumbers(params: ListPhoneNumbersRequest): Request[ListPhoneNumbersResponse] = js.native
    def listProxySessions(params: ListProxySessionsRequest): Request[ListProxySessionsResponse] = js.native
    def listSipMediaApplications(params: ListSipMediaApplicationsRequest): Request[ListSipMediaApplicationsResponse] = js.native
    def listSipRules(params: ListSipRulesRequest): Request[ListSipRulesResponse] = js.native
    def listSupportedPhoneNumberCountries(params: ListSupportedPhoneNumberCountriesRequest): Request[ListSupportedPhoneNumberCountriesResponse] = js.native
    def listVoiceConnectorGroups(params: ListVoiceConnectorGroupsRequest): Request[ListVoiceConnectorGroupsResponse] = js.native
    def listVoiceConnectorTerminationCredentials(params: ListVoiceConnectorTerminationCredentialsRequest): Request[ListVoiceConnectorTerminationCredentialsResponse] = js.native
    def listVoiceConnectors(params: ListVoiceConnectorsRequest): Request[ListVoiceConnectorsResponse] = js.native
    def putSipMediaApplicationAlexaSkillConfiguration(params: PutSipMediaApplicationAlexaSkillConfigurationRequest): Request[PutSipMediaApplicationAlexaSkillConfigurationResponse] = js.native
    def putSipMediaApplicationLoggingConfiguration(params: PutSipMediaApplicationLoggingConfigurationRequest): Request[PutSipMediaApplicationLoggingConfigurationResponse] = js.native
    def putVoiceConnectorEmergencyCallingConfiguration(params: PutVoiceConnectorEmergencyCallingConfigurationRequest): Request[PutVoiceConnectorEmergencyCallingConfigurationResponse] = js.native
    def putVoiceConnectorLoggingConfiguration(params: PutVoiceConnectorLoggingConfigurationRequest): Request[PutVoiceConnectorLoggingConfigurationResponse] = js.native
    def putVoiceConnectorOrigination(params: PutVoiceConnectorOriginationRequest): Request[PutVoiceConnectorOriginationResponse] = js.native
    def putVoiceConnectorProxy(params: PutVoiceConnectorProxyRequest): Request[PutVoiceConnectorProxyResponse] = js.native
    def putVoiceConnectorStreamingConfiguration(params: PutVoiceConnectorStreamingConfigurationRequest): Request[PutVoiceConnectorStreamingConfigurationResponse] = js.native
    def putVoiceConnectorTermination(params: PutVoiceConnectorTerminationRequest): Request[PutVoiceConnectorTerminationResponse] = js.native
    def putVoiceConnectorTerminationCredentials(params: PutVoiceConnectorTerminationCredentialsRequest): Request[js.Object] = js.native
    def restorePhoneNumber(params: RestorePhoneNumberRequest): Request[RestorePhoneNumberResponse] = js.native
    def searchAvailablePhoneNumbers(params: SearchAvailablePhoneNumbersRequest): Request[SearchAvailablePhoneNumbersResponse] = js.native
    def updateGlobalSettings(params: UpdateGlobalSettingsRequest): Request[js.Object] = js.native
    def updatePhoneNumber(params: UpdatePhoneNumberRequest): Request[UpdatePhoneNumberResponse] = js.native
    def updatePhoneNumberSettings(params: UpdatePhoneNumberSettingsRequest): Request[js.Object] = js.native
    def updateProxySession(params: UpdateProxySessionRequest): Request[UpdateProxySessionResponse] = js.native
    def updateSipMediaApplication(params: UpdateSipMediaApplicationRequest): Request[UpdateSipMediaApplicationResponse] = js.native
    def updateSipMediaApplicationCall(params: UpdateSipMediaApplicationCallRequest): Request[UpdateSipMediaApplicationCallResponse] = js.native
    def updateSipRule(params: UpdateSipRuleRequest): Request[UpdateSipRuleResponse] = js.native
    def updateVoiceConnector(params: UpdateVoiceConnectorRequest): Request[UpdateVoiceConnectorResponse] = js.native
    def updateVoiceConnectorGroup(params: UpdateVoiceConnectorGroupRequest): Request[UpdateVoiceConnectorGroupResponse] = js.native
    def validateE911Address(params: ValidateE911AddressRequest): Request[ValidateE911AddressResponse] = js.native
  }
  object ChimeSDKVoice {
    @inline implicit def toOps(service: ChimeSDKVoice): ChimeSDKVoiceOps = {
      new ChimeSDKVoiceOps(service)
    }
  }

  @js.native
  trait Address extends js.Object {
    var city: js.UndefOr[SensitiveNonEmptyString]
    var country: js.UndefOr[SensitiveNonEmptyString]
    var postDirectional: js.UndefOr[SensitiveNonEmptyString]
    var postalCode: js.UndefOr[SensitiveNonEmptyString]
    var postalCodePlus4: js.UndefOr[SensitiveNonEmptyString]
    var preDirectional: js.UndefOr[SensitiveNonEmptyString]
    var state: js.UndefOr[SensitiveNonEmptyString]
    var streetName: js.UndefOr[SensitiveNonEmptyString]
    var streetNumber: js.UndefOr[SensitiveNonEmptyString]
    var streetSuffix: js.UndefOr[SensitiveNonEmptyString]
  }

  object Address {
    @inline
    def apply(
        city: js.UndefOr[SensitiveNonEmptyString] = js.undefined,
        country: js.UndefOr[SensitiveNonEmptyString] = js.undefined,
        postDirectional: js.UndefOr[SensitiveNonEmptyString] = js.undefined,
        postalCode: js.UndefOr[SensitiveNonEmptyString] = js.undefined,
        postalCodePlus4: js.UndefOr[SensitiveNonEmptyString] = js.undefined,
        preDirectional: js.UndefOr[SensitiveNonEmptyString] = js.undefined,
        state: js.UndefOr[SensitiveNonEmptyString] = js.undefined,
        streetName: js.UndefOr[SensitiveNonEmptyString] = js.undefined,
        streetNumber: js.UndefOr[SensitiveNonEmptyString] = js.undefined,
        streetSuffix: js.UndefOr[SensitiveNonEmptyString] = js.undefined
    ): Address = {
      val __obj = js.Dynamic.literal()
      city.foreach(__v => __obj.updateDynamic("city")(__v.asInstanceOf[js.Any]))
      country.foreach(__v => __obj.updateDynamic("country")(__v.asInstanceOf[js.Any]))
      postDirectional.foreach(__v => __obj.updateDynamic("postDirectional")(__v.asInstanceOf[js.Any]))
      postalCode.foreach(__v => __obj.updateDynamic("postalCode")(__v.asInstanceOf[js.Any]))
      postalCodePlus4.foreach(__v => __obj.updateDynamic("postalCodePlus4")(__v.asInstanceOf[js.Any]))
      preDirectional.foreach(__v => __obj.updateDynamic("preDirectional")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      streetName.foreach(__v => __obj.updateDynamic("streetName")(__v.asInstanceOf[js.Any]))
      streetNumber.foreach(__v => __obj.updateDynamic("streetNumber")(__v.asInstanceOf[js.Any]))
      streetSuffix.foreach(__v => __obj.updateDynamic("streetSuffix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Address]
    }
  }

  @js.native
  trait AssociatePhoneNumbersWithVoiceConnectorGroupRequest extends js.Object {
    var E164PhoneNumbers: E164PhoneNumberList
    var VoiceConnectorGroupId: NonEmptyString
    var ForceAssociate: js.UndefOr[NullableBoolean]
  }

  object AssociatePhoneNumbersWithVoiceConnectorGroupRequest {
    @inline
    def apply(
        E164PhoneNumbers: E164PhoneNumberList,
        VoiceConnectorGroupId: NonEmptyString,
        ForceAssociate: js.UndefOr[NullableBoolean] = js.undefined
    ): AssociatePhoneNumbersWithVoiceConnectorGroupRequest = {
      val __obj = js.Dynamic.literal(
        "E164PhoneNumbers" -> E164PhoneNumbers.asInstanceOf[js.Any],
        "VoiceConnectorGroupId" -> VoiceConnectorGroupId.asInstanceOf[js.Any]
      )

      ForceAssociate.foreach(__v => __obj.updateDynamic("ForceAssociate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociatePhoneNumbersWithVoiceConnectorGroupRequest]
    }
  }

  @js.native
  trait AssociatePhoneNumbersWithVoiceConnectorGroupResponse extends js.Object {
    var PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList]
  }

  object AssociatePhoneNumbersWithVoiceConnectorGroupResponse {
    @inline
    def apply(
        PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList] = js.undefined
    ): AssociatePhoneNumbersWithVoiceConnectorGroupResponse = {
      val __obj = js.Dynamic.literal()
      PhoneNumberErrors.foreach(__v => __obj.updateDynamic("PhoneNumberErrors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociatePhoneNumbersWithVoiceConnectorGroupResponse]
    }
  }

  @js.native
  trait AssociatePhoneNumbersWithVoiceConnectorRequest extends js.Object {
    var E164PhoneNumbers: E164PhoneNumberList
    var VoiceConnectorId: NonEmptyString
    var ForceAssociate: js.UndefOr[NullableBoolean]
  }

  object AssociatePhoneNumbersWithVoiceConnectorRequest {
    @inline
    def apply(
        E164PhoneNumbers: E164PhoneNumberList,
        VoiceConnectorId: NonEmptyString,
        ForceAssociate: js.UndefOr[NullableBoolean] = js.undefined
    ): AssociatePhoneNumbersWithVoiceConnectorRequest = {
      val __obj = js.Dynamic.literal(
        "E164PhoneNumbers" -> E164PhoneNumbers.asInstanceOf[js.Any],
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )

      ForceAssociate.foreach(__v => __obj.updateDynamic("ForceAssociate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociatePhoneNumbersWithVoiceConnectorRequest]
    }
  }

  @js.native
  trait AssociatePhoneNumbersWithVoiceConnectorResponse extends js.Object {
    var PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList]
  }

  object AssociatePhoneNumbersWithVoiceConnectorResponse {
    @inline
    def apply(
        PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList] = js.undefined
    ): AssociatePhoneNumbersWithVoiceConnectorResponse = {
      val __obj = js.Dynamic.literal()
      PhoneNumberErrors.foreach(__v => __obj.updateDynamic("PhoneNumberErrors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociatePhoneNumbersWithVoiceConnectorResponse]
    }
  }

  @js.native
  trait BatchDeletePhoneNumberRequest extends js.Object {
    var PhoneNumberIds: NonEmptyStringList
  }

  object BatchDeletePhoneNumberRequest {
    @inline
    def apply(
        PhoneNumberIds: NonEmptyStringList
    ): BatchDeletePhoneNumberRequest = {
      val __obj = js.Dynamic.literal(
        "PhoneNumberIds" -> PhoneNumberIds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchDeletePhoneNumberRequest]
    }
  }

  @js.native
  trait BatchDeletePhoneNumberResponse extends js.Object {
    var PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList]
  }

  object BatchDeletePhoneNumberResponse {
    @inline
    def apply(
        PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList] = js.undefined
    ): BatchDeletePhoneNumberResponse = {
      val __obj = js.Dynamic.literal()
      PhoneNumberErrors.foreach(__v => __obj.updateDynamic("PhoneNumberErrors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchDeletePhoneNumberResponse]
    }
  }

  @js.native
  trait BatchUpdatePhoneNumberRequest extends js.Object {
    var UpdatePhoneNumberRequestItems: UpdatePhoneNumberRequestItemList
  }

  object BatchUpdatePhoneNumberRequest {
    @inline
    def apply(
        UpdatePhoneNumberRequestItems: UpdatePhoneNumberRequestItemList
    ): BatchUpdatePhoneNumberRequest = {
      val __obj = js.Dynamic.literal(
        "UpdatePhoneNumberRequestItems" -> UpdatePhoneNumberRequestItems.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[BatchUpdatePhoneNumberRequest]
    }
  }

  @js.native
  trait BatchUpdatePhoneNumberResponse extends js.Object {
    var PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList]
  }

  object BatchUpdatePhoneNumberResponse {
    @inline
    def apply(
        PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList] = js.undefined
    ): BatchUpdatePhoneNumberResponse = {
      val __obj = js.Dynamic.literal()
      PhoneNumberErrors.foreach(__v => __obj.updateDynamic("PhoneNumberErrors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BatchUpdatePhoneNumberResponse]
    }
  }

  @js.native
  trait CandidateAddress extends js.Object {
    var city: js.UndefOr[SensitiveNonEmptyString]
    var country: js.UndefOr[SensitiveNonEmptyString]
    var postalCode: js.UndefOr[SensitiveNonEmptyString]
    var postalCodePlus4: js.UndefOr[SensitiveNonEmptyString]
    var state: js.UndefOr[SensitiveNonEmptyString]
    var streetInfo: js.UndefOr[SensitiveNonEmptyString]
    var streetNumber: js.UndefOr[SensitiveNonEmptyString]
  }

  object CandidateAddress {
    @inline
    def apply(
        city: js.UndefOr[SensitiveNonEmptyString] = js.undefined,
        country: js.UndefOr[SensitiveNonEmptyString] = js.undefined,
        postalCode: js.UndefOr[SensitiveNonEmptyString] = js.undefined,
        postalCodePlus4: js.UndefOr[SensitiveNonEmptyString] = js.undefined,
        state: js.UndefOr[SensitiveNonEmptyString] = js.undefined,
        streetInfo: js.UndefOr[SensitiveNonEmptyString] = js.undefined,
        streetNumber: js.UndefOr[SensitiveNonEmptyString] = js.undefined
    ): CandidateAddress = {
      val __obj = js.Dynamic.literal()
      city.foreach(__v => __obj.updateDynamic("city")(__v.asInstanceOf[js.Any]))
      country.foreach(__v => __obj.updateDynamic("country")(__v.asInstanceOf[js.Any]))
      postalCode.foreach(__v => __obj.updateDynamic("postalCode")(__v.asInstanceOf[js.Any]))
      postalCodePlus4.foreach(__v => __obj.updateDynamic("postalCodePlus4")(__v.asInstanceOf[js.Any]))
      state.foreach(__v => __obj.updateDynamic("state")(__v.asInstanceOf[js.Any]))
      streetInfo.foreach(__v => __obj.updateDynamic("streetInfo")(__v.asInstanceOf[js.Any]))
      streetNumber.foreach(__v => __obj.updateDynamic("streetNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CandidateAddress]
    }
  }

  @js.native
  trait CreatePhoneNumberOrderRequest extends js.Object {
    var E164PhoneNumbers: E164PhoneNumberList
    var ProductType: PhoneNumberProductType
  }

  object CreatePhoneNumberOrderRequest {
    @inline
    def apply(
        E164PhoneNumbers: E164PhoneNumberList,
        ProductType: PhoneNumberProductType
    ): CreatePhoneNumberOrderRequest = {
      val __obj = js.Dynamic.literal(
        "E164PhoneNumbers" -> E164PhoneNumbers.asInstanceOf[js.Any],
        "ProductType" -> ProductType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreatePhoneNumberOrderRequest]
    }
  }

  @js.native
  trait CreatePhoneNumberOrderResponse extends js.Object {
    var PhoneNumberOrder: js.UndefOr[PhoneNumberOrder]
  }

  object CreatePhoneNumberOrderResponse {
    @inline
    def apply(
        PhoneNumberOrder: js.UndefOr[PhoneNumberOrder] = js.undefined
    ): CreatePhoneNumberOrderResponse = {
      val __obj = js.Dynamic.literal()
      PhoneNumberOrder.foreach(__v => __obj.updateDynamic("PhoneNumberOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePhoneNumberOrderResponse]
    }
  }

  @js.native
  trait CreateProxySessionRequest extends js.Object {
    var Capabilities: CapabilityList
    var ParticipantPhoneNumbers: ParticipantPhoneNumberList
    var VoiceConnectorId: NonEmptyString128
    var ExpiryMinutes: js.UndefOr[PositiveInteger]
    var GeoMatchLevel: js.UndefOr[GeoMatchLevel]
    var GeoMatchParams: js.UndefOr[GeoMatchParams]
    var Name: js.UndefOr[ProxySessionNameString]
    var NumberSelectionBehavior: js.UndefOr[NumberSelectionBehavior]
  }

  object CreateProxySessionRequest {
    @inline
    def apply(
        Capabilities: CapabilityList,
        ParticipantPhoneNumbers: ParticipantPhoneNumberList,
        VoiceConnectorId: NonEmptyString128,
        ExpiryMinutes: js.UndefOr[PositiveInteger] = js.undefined,
        GeoMatchLevel: js.UndefOr[GeoMatchLevel] = js.undefined,
        GeoMatchParams: js.UndefOr[GeoMatchParams] = js.undefined,
        Name: js.UndefOr[ProxySessionNameString] = js.undefined,
        NumberSelectionBehavior: js.UndefOr[NumberSelectionBehavior] = js.undefined
    ): CreateProxySessionRequest = {
      val __obj = js.Dynamic.literal(
        "Capabilities" -> Capabilities.asInstanceOf[js.Any],
        "ParticipantPhoneNumbers" -> ParticipantPhoneNumbers.asInstanceOf[js.Any],
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )

      ExpiryMinutes.foreach(__v => __obj.updateDynamic("ExpiryMinutes")(__v.asInstanceOf[js.Any]))
      GeoMatchLevel.foreach(__v => __obj.updateDynamic("GeoMatchLevel")(__v.asInstanceOf[js.Any]))
      GeoMatchParams.foreach(__v => __obj.updateDynamic("GeoMatchParams")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NumberSelectionBehavior.foreach(__v => __obj.updateDynamic("NumberSelectionBehavior")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProxySessionRequest]
    }
  }

  @js.native
  trait CreateProxySessionResponse extends js.Object {
    var ProxySession: js.UndefOr[ProxySession]
  }

  object CreateProxySessionResponse {
    @inline
    def apply(
        ProxySession: js.UndefOr[ProxySession] = js.undefined
    ): CreateProxySessionResponse = {
      val __obj = js.Dynamic.literal()
      ProxySession.foreach(__v => __obj.updateDynamic("ProxySession")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProxySessionResponse]
    }
  }

  @js.native
  trait CreateSipMediaApplicationCallRequest extends js.Object {
    var FromPhoneNumber: E164PhoneNumber
    var SipMediaApplicationId: NonEmptyString
    var ToPhoneNumber: E164PhoneNumber
    var ArgumentsMap: js.UndefOr[SMACreateCallArgumentsMap]
    var SipHeaders: js.UndefOr[SipHeadersMap]
  }

  object CreateSipMediaApplicationCallRequest {
    @inline
    def apply(
        FromPhoneNumber: E164PhoneNumber,
        SipMediaApplicationId: NonEmptyString,
        ToPhoneNumber: E164PhoneNumber,
        ArgumentsMap: js.UndefOr[SMACreateCallArgumentsMap] = js.undefined,
        SipHeaders: js.UndefOr[SipHeadersMap] = js.undefined
    ): CreateSipMediaApplicationCallRequest = {
      val __obj = js.Dynamic.literal(
        "FromPhoneNumber" -> FromPhoneNumber.asInstanceOf[js.Any],
        "SipMediaApplicationId" -> SipMediaApplicationId.asInstanceOf[js.Any],
        "ToPhoneNumber" -> ToPhoneNumber.asInstanceOf[js.Any]
      )

      ArgumentsMap.foreach(__v => __obj.updateDynamic("ArgumentsMap")(__v.asInstanceOf[js.Any]))
      SipHeaders.foreach(__v => __obj.updateDynamic("SipHeaders")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSipMediaApplicationCallRequest]
    }
  }

  @js.native
  trait CreateSipMediaApplicationCallResponse extends js.Object {
    var SipMediaApplicationCall: js.UndefOr[SipMediaApplicationCall]
  }

  object CreateSipMediaApplicationCallResponse {
    @inline
    def apply(
        SipMediaApplicationCall: js.UndefOr[SipMediaApplicationCall] = js.undefined
    ): CreateSipMediaApplicationCallResponse = {
      val __obj = js.Dynamic.literal()
      SipMediaApplicationCall.foreach(__v => __obj.updateDynamic("SipMediaApplicationCall")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSipMediaApplicationCallResponse]
    }
  }

  @js.native
  trait CreateSipMediaApplicationRequest extends js.Object {
    var AwsRegion: String
    var Endpoints: SipMediaApplicationEndpointList
    var Name: SipMediaApplicationName
  }

  object CreateSipMediaApplicationRequest {
    @inline
    def apply(
        AwsRegion: String,
        Endpoints: SipMediaApplicationEndpointList,
        Name: SipMediaApplicationName
    ): CreateSipMediaApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "AwsRegion" -> AwsRegion.asInstanceOf[js.Any],
        "Endpoints" -> Endpoints.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateSipMediaApplicationRequest]
    }
  }

  @js.native
  trait CreateSipMediaApplicationResponse extends js.Object {
    var SipMediaApplication: js.UndefOr[SipMediaApplication]
  }

  object CreateSipMediaApplicationResponse {
    @inline
    def apply(
        SipMediaApplication: js.UndefOr[SipMediaApplication] = js.undefined
    ): CreateSipMediaApplicationResponse = {
      val __obj = js.Dynamic.literal()
      SipMediaApplication.foreach(__v => __obj.updateDynamic("SipMediaApplication")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSipMediaApplicationResponse]
    }
  }

  @js.native
  trait CreateSipRuleRequest extends js.Object {
    var Name: SipRuleName
    var TriggerType: SipRuleTriggerType
    var TriggerValue: NonEmptyString
    var Disabled: js.UndefOr[NullableBoolean]
    var TargetApplications: js.UndefOr[SipRuleTargetApplicationList]
  }

  object CreateSipRuleRequest {
    @inline
    def apply(
        Name: SipRuleName,
        TriggerType: SipRuleTriggerType,
        TriggerValue: NonEmptyString,
        Disabled: js.UndefOr[NullableBoolean] = js.undefined,
        TargetApplications: js.UndefOr[SipRuleTargetApplicationList] = js.undefined
    ): CreateSipRuleRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "TriggerType" -> TriggerType.asInstanceOf[js.Any],
        "TriggerValue" -> TriggerValue.asInstanceOf[js.Any]
      )

      Disabled.foreach(__v => __obj.updateDynamic("Disabled")(__v.asInstanceOf[js.Any]))
      TargetApplications.foreach(__v => __obj.updateDynamic("TargetApplications")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSipRuleRequest]
    }
  }

  @js.native
  trait CreateSipRuleResponse extends js.Object {
    var SipRule: js.UndefOr[SipRule]
  }

  object CreateSipRuleResponse {
    @inline
    def apply(
        SipRule: js.UndefOr[SipRule] = js.undefined
    ): CreateSipRuleResponse = {
      val __obj = js.Dynamic.literal()
      SipRule.foreach(__v => __obj.updateDynamic("SipRule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSipRuleResponse]
    }
  }

  @js.native
  trait CreateVoiceConnectorGroupRequest extends js.Object {
    var Name: VoiceConnectorGroupName
    var VoiceConnectorItems: js.UndefOr[VoiceConnectorItemList]
  }

  object CreateVoiceConnectorGroupRequest {
    @inline
    def apply(
        Name: VoiceConnectorGroupName,
        VoiceConnectorItems: js.UndefOr[VoiceConnectorItemList] = js.undefined
    ): CreateVoiceConnectorGroupRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      VoiceConnectorItems.foreach(__v => __obj.updateDynamic("VoiceConnectorItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVoiceConnectorGroupRequest]
    }
  }

  @js.native
  trait CreateVoiceConnectorGroupResponse extends js.Object {
    var VoiceConnectorGroup: js.UndefOr[VoiceConnectorGroup]
  }

  object CreateVoiceConnectorGroupResponse {
    @inline
    def apply(
        VoiceConnectorGroup: js.UndefOr[VoiceConnectorGroup] = js.undefined
    ): CreateVoiceConnectorGroupResponse = {
      val __obj = js.Dynamic.literal()
      VoiceConnectorGroup.foreach(__v => __obj.updateDynamic("VoiceConnectorGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVoiceConnectorGroupResponse]
    }
  }

  @js.native
  trait CreateVoiceConnectorRequest extends js.Object {
    var Name: VoiceConnectorName
    var RequireEncryption: Boolean
    var AwsRegion: js.UndefOr[VoiceConnectorAwsRegion]
  }

  object CreateVoiceConnectorRequest {
    @inline
    def apply(
        Name: VoiceConnectorName,
        RequireEncryption: Boolean,
        AwsRegion: js.UndefOr[VoiceConnectorAwsRegion] = js.undefined
    ): CreateVoiceConnectorRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "RequireEncryption" -> RequireEncryption.asInstanceOf[js.Any]
      )

      AwsRegion.foreach(__v => __obj.updateDynamic("AwsRegion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVoiceConnectorRequest]
    }
  }

  @js.native
  trait CreateVoiceConnectorResponse extends js.Object {
    var VoiceConnector: js.UndefOr[VoiceConnector]
  }

  object CreateVoiceConnectorResponse {
    @inline
    def apply(
        VoiceConnector: js.UndefOr[VoiceConnector] = js.undefined
    ): CreateVoiceConnectorResponse = {
      val __obj = js.Dynamic.literal()
      VoiceConnector.foreach(__v => __obj.updateDynamic("VoiceConnector")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVoiceConnectorResponse]
    }
  }

  @js.native
  trait Credential extends js.Object {
    var Password: js.UndefOr[SensitiveString]
    var Username: js.UndefOr[SensitiveString]
  }

  object Credential {
    @inline
    def apply(
        Password: js.UndefOr[SensitiveString] = js.undefined,
        Username: js.UndefOr[SensitiveString] = js.undefined
    ): Credential = {
      val __obj = js.Dynamic.literal()
      Password.foreach(__v => __obj.updateDynamic("Password")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Credential]
    }
  }

  @js.native
  trait DNISEmergencyCallingConfiguration extends js.Object {
    var CallingCountry: Alpha2CountryCode
    var EmergencyPhoneNumber: E164PhoneNumber
    var TestPhoneNumber: js.UndefOr[E164PhoneNumber]
  }

  object DNISEmergencyCallingConfiguration {
    @inline
    def apply(
        CallingCountry: Alpha2CountryCode,
        EmergencyPhoneNumber: E164PhoneNumber,
        TestPhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined
    ): DNISEmergencyCallingConfiguration = {
      val __obj = js.Dynamic.literal(
        "CallingCountry" -> CallingCountry.asInstanceOf[js.Any],
        "EmergencyPhoneNumber" -> EmergencyPhoneNumber.asInstanceOf[js.Any]
      )

      TestPhoneNumber.foreach(__v => __obj.updateDynamic("TestPhoneNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DNISEmergencyCallingConfiguration]
    }
  }

  @js.native
  trait DeletePhoneNumberRequest extends js.Object {
    var PhoneNumberId: SensitiveNonEmptyString
  }

  object DeletePhoneNumberRequest {
    @inline
    def apply(
        PhoneNumberId: SensitiveNonEmptyString
    ): DeletePhoneNumberRequest = {
      val __obj = js.Dynamic.literal(
        "PhoneNumberId" -> PhoneNumberId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeletePhoneNumberRequest]
    }
  }

  @js.native
  trait DeleteProxySessionRequest extends js.Object {
    var ProxySessionId: NonEmptyString128
    var VoiceConnectorId: NonEmptyString128
  }

  object DeleteProxySessionRequest {
    @inline
    def apply(
        ProxySessionId: NonEmptyString128,
        VoiceConnectorId: NonEmptyString128
    ): DeleteProxySessionRequest = {
      val __obj = js.Dynamic.literal(
        "ProxySessionId" -> ProxySessionId.asInstanceOf[js.Any],
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteProxySessionRequest]
    }
  }

  @js.native
  trait DeleteSipMediaApplicationRequest extends js.Object {
    var SipMediaApplicationId: NonEmptyString
  }

  object DeleteSipMediaApplicationRequest {
    @inline
    def apply(
        SipMediaApplicationId: NonEmptyString
    ): DeleteSipMediaApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "SipMediaApplicationId" -> SipMediaApplicationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSipMediaApplicationRequest]
    }
  }

  @js.native
  trait DeleteSipRuleRequest extends js.Object {
    var SipRuleId: NonEmptyString
  }

  object DeleteSipRuleRequest {
    @inline
    def apply(
        SipRuleId: NonEmptyString
    ): DeleteSipRuleRequest = {
      val __obj = js.Dynamic.literal(
        "SipRuleId" -> SipRuleId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSipRuleRequest]
    }
  }

  @js.native
  trait DeleteVoiceConnectorEmergencyCallingConfigurationRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object DeleteVoiceConnectorEmergencyCallingConfigurationRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString
    ): DeleteVoiceConnectorEmergencyCallingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteVoiceConnectorEmergencyCallingConfigurationRequest]
    }
  }

  @js.native
  trait DeleteVoiceConnectorGroupRequest extends js.Object {
    var VoiceConnectorGroupId: NonEmptyString
  }

  object DeleteVoiceConnectorGroupRequest {
    @inline
    def apply(
        VoiceConnectorGroupId: NonEmptyString
    ): DeleteVoiceConnectorGroupRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorGroupId" -> VoiceConnectorGroupId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteVoiceConnectorGroupRequest]
    }
  }

  @js.native
  trait DeleteVoiceConnectorOriginationRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object DeleteVoiceConnectorOriginationRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString
    ): DeleteVoiceConnectorOriginationRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteVoiceConnectorOriginationRequest]
    }
  }

  @js.native
  trait DeleteVoiceConnectorProxyRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString128
  }

  object DeleteVoiceConnectorProxyRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString128
    ): DeleteVoiceConnectorProxyRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteVoiceConnectorProxyRequest]
    }
  }

  @js.native
  trait DeleteVoiceConnectorRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object DeleteVoiceConnectorRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString
    ): DeleteVoiceConnectorRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteVoiceConnectorRequest]
    }
  }

  @js.native
  trait DeleteVoiceConnectorStreamingConfigurationRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object DeleteVoiceConnectorStreamingConfigurationRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString
    ): DeleteVoiceConnectorStreamingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteVoiceConnectorStreamingConfigurationRequest]
    }
  }

  @js.native
  trait DeleteVoiceConnectorTerminationCredentialsRequest extends js.Object {
    var Usernames: SensitiveStringList
    var VoiceConnectorId: NonEmptyString
  }

  object DeleteVoiceConnectorTerminationCredentialsRequest {
    @inline
    def apply(
        Usernames: SensitiveStringList,
        VoiceConnectorId: NonEmptyString
    ): DeleteVoiceConnectorTerminationCredentialsRequest = {
      val __obj = js.Dynamic.literal(
        "Usernames" -> Usernames.asInstanceOf[js.Any],
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteVoiceConnectorTerminationCredentialsRequest]
    }
  }

  @js.native
  trait DeleteVoiceConnectorTerminationRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object DeleteVoiceConnectorTerminationRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString
    ): DeleteVoiceConnectorTerminationRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteVoiceConnectorTerminationRequest]
    }
  }

  @js.native
  trait DisassociatePhoneNumbersFromVoiceConnectorGroupRequest extends js.Object {
    var E164PhoneNumbers: E164PhoneNumberList
    var VoiceConnectorGroupId: NonEmptyString
  }

  object DisassociatePhoneNumbersFromVoiceConnectorGroupRequest {
    @inline
    def apply(
        E164PhoneNumbers: E164PhoneNumberList,
        VoiceConnectorGroupId: NonEmptyString
    ): DisassociatePhoneNumbersFromVoiceConnectorGroupRequest = {
      val __obj = js.Dynamic.literal(
        "E164PhoneNumbers" -> E164PhoneNumbers.asInstanceOf[js.Any],
        "VoiceConnectorGroupId" -> VoiceConnectorGroupId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociatePhoneNumbersFromVoiceConnectorGroupRequest]
    }
  }

  @js.native
  trait DisassociatePhoneNumbersFromVoiceConnectorGroupResponse extends js.Object {
    var PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList]
  }

  object DisassociatePhoneNumbersFromVoiceConnectorGroupResponse {
    @inline
    def apply(
        PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList] = js.undefined
    ): DisassociatePhoneNumbersFromVoiceConnectorGroupResponse = {
      val __obj = js.Dynamic.literal()
      PhoneNumberErrors.foreach(__v => __obj.updateDynamic("PhoneNumberErrors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociatePhoneNumbersFromVoiceConnectorGroupResponse]
    }
  }

  @js.native
  trait DisassociatePhoneNumbersFromVoiceConnectorRequest extends js.Object {
    var E164PhoneNumbers: E164PhoneNumberList
    var VoiceConnectorId: NonEmptyString
  }

  object DisassociatePhoneNumbersFromVoiceConnectorRequest {
    @inline
    def apply(
        E164PhoneNumbers: E164PhoneNumberList,
        VoiceConnectorId: NonEmptyString
    ): DisassociatePhoneNumbersFromVoiceConnectorRequest = {
      val __obj = js.Dynamic.literal(
        "E164PhoneNumbers" -> E164PhoneNumbers.asInstanceOf[js.Any],
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociatePhoneNumbersFromVoiceConnectorRequest]
    }
  }

  @js.native
  trait DisassociatePhoneNumbersFromVoiceConnectorResponse extends js.Object {
    var PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList]
  }

  object DisassociatePhoneNumbersFromVoiceConnectorResponse {
    @inline
    def apply(
        PhoneNumberErrors: js.UndefOr[PhoneNumberErrorList] = js.undefined
    ): DisassociatePhoneNumbersFromVoiceConnectorResponse = {
      val __obj = js.Dynamic.literal()
      PhoneNumberErrors.foreach(__v => __obj.updateDynamic("PhoneNumberErrors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DisassociatePhoneNumbersFromVoiceConnectorResponse]
    }
  }

  @js.native
  trait EmergencyCallingConfiguration extends js.Object {
    var DNIS: js.UndefOr[DNISEmergencyCallingConfigurationList]
  }

  object EmergencyCallingConfiguration {
    @inline
    def apply(
        DNIS: js.UndefOr[DNISEmergencyCallingConfigurationList] = js.undefined
    ): EmergencyCallingConfiguration = {
      val __obj = js.Dynamic.literal()
      DNIS.foreach(__v => __obj.updateDynamic("DNIS")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EmergencyCallingConfiguration]
    }
  }

  @js.native
  trait GeoMatchParams extends js.Object {
    var AreaCode: AreaCode
    var Country: Country
  }

  object GeoMatchParams {
    @inline
    def apply(
        AreaCode: AreaCode,
        Country: Country
    ): GeoMatchParams = {
      val __obj = js.Dynamic.literal(
        "AreaCode" -> AreaCode.asInstanceOf[js.Any],
        "Country" -> Country.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GeoMatchParams]
    }
  }

  @js.native
  trait GetGlobalSettingsResponse extends js.Object {
    var VoiceConnector: js.UndefOr[VoiceConnectorSettings]
  }

  object GetGlobalSettingsResponse {
    @inline
    def apply(
        VoiceConnector: js.UndefOr[VoiceConnectorSettings] = js.undefined
    ): GetGlobalSettingsResponse = {
      val __obj = js.Dynamic.literal()
      VoiceConnector.foreach(__v => __obj.updateDynamic("VoiceConnector")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetGlobalSettingsResponse]
    }
  }

  @js.native
  trait GetPhoneNumberOrderRequest extends js.Object {
    var PhoneNumberOrderId: GuidString
  }

  object GetPhoneNumberOrderRequest {
    @inline
    def apply(
        PhoneNumberOrderId: GuidString
    ): GetPhoneNumberOrderRequest = {
      val __obj = js.Dynamic.literal(
        "PhoneNumberOrderId" -> PhoneNumberOrderId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetPhoneNumberOrderRequest]
    }
  }

  @js.native
  trait GetPhoneNumberOrderResponse extends js.Object {
    var PhoneNumberOrder: js.UndefOr[PhoneNumberOrder]
  }

  object GetPhoneNumberOrderResponse {
    @inline
    def apply(
        PhoneNumberOrder: js.UndefOr[PhoneNumberOrder] = js.undefined
    ): GetPhoneNumberOrderResponse = {
      val __obj = js.Dynamic.literal()
      PhoneNumberOrder.foreach(__v => __obj.updateDynamic("PhoneNumberOrder")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPhoneNumberOrderResponse]
    }
  }

  @js.native
  trait GetPhoneNumberRequest extends js.Object {
    var PhoneNumberId: SensitiveNonEmptyString
  }

  object GetPhoneNumberRequest {
    @inline
    def apply(
        PhoneNumberId: SensitiveNonEmptyString
    ): GetPhoneNumberRequest = {
      val __obj = js.Dynamic.literal(
        "PhoneNumberId" -> PhoneNumberId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetPhoneNumberRequest]
    }
  }

  @js.native
  trait GetPhoneNumberResponse extends js.Object {
    var PhoneNumber: js.UndefOr[PhoneNumber]
  }

  object GetPhoneNumberResponse {
    @inline
    def apply(
        PhoneNumber: js.UndefOr[PhoneNumber] = js.undefined
    ): GetPhoneNumberResponse = {
      val __obj = js.Dynamic.literal()
      PhoneNumber.foreach(__v => __obj.updateDynamic("PhoneNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPhoneNumberResponse]
    }
  }

  @js.native
  trait GetPhoneNumberSettingsResponse extends js.Object {
    var CallingName: js.UndefOr[CallingName]
    var CallingNameUpdatedTimestamp: js.UndefOr[Iso8601Timestamp]
  }

  object GetPhoneNumberSettingsResponse {
    @inline
    def apply(
        CallingName: js.UndefOr[CallingName] = js.undefined,
        CallingNameUpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
    ): GetPhoneNumberSettingsResponse = {
      val __obj = js.Dynamic.literal()
      CallingName.foreach(__v => __obj.updateDynamic("CallingName")(__v.asInstanceOf[js.Any]))
      CallingNameUpdatedTimestamp.foreach(__v => __obj.updateDynamic("CallingNameUpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPhoneNumberSettingsResponse]
    }
  }

  @js.native
  trait GetProxySessionRequest extends js.Object {
    var ProxySessionId: NonEmptyString128
    var VoiceConnectorId: NonEmptyString128
  }

  object GetProxySessionRequest {
    @inline
    def apply(
        ProxySessionId: NonEmptyString128,
        VoiceConnectorId: NonEmptyString128
    ): GetProxySessionRequest = {
      val __obj = js.Dynamic.literal(
        "ProxySessionId" -> ProxySessionId.asInstanceOf[js.Any],
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetProxySessionRequest]
    }
  }

  @js.native
  trait GetProxySessionResponse extends js.Object {
    var ProxySession: js.UndefOr[ProxySession]
  }

  object GetProxySessionResponse {
    @inline
    def apply(
        ProxySession: js.UndefOr[ProxySession] = js.undefined
    ): GetProxySessionResponse = {
      val __obj = js.Dynamic.literal()
      ProxySession.foreach(__v => __obj.updateDynamic("ProxySession")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetProxySessionResponse]
    }
  }

  @js.native
  trait GetSipMediaApplicationAlexaSkillConfigurationRequest extends js.Object {
    var SipMediaApplicationId: NonEmptyString
  }

  object GetSipMediaApplicationAlexaSkillConfigurationRequest {
    @inline
    def apply(
        SipMediaApplicationId: NonEmptyString
    ): GetSipMediaApplicationAlexaSkillConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "SipMediaApplicationId" -> SipMediaApplicationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSipMediaApplicationAlexaSkillConfigurationRequest]
    }
  }

  @js.native
  trait GetSipMediaApplicationAlexaSkillConfigurationResponse extends js.Object {
    var SipMediaApplicationAlexaSkillConfiguration: js.UndefOr[SipMediaApplicationAlexaSkillConfiguration]
  }

  object GetSipMediaApplicationAlexaSkillConfigurationResponse {
    @inline
    def apply(
        SipMediaApplicationAlexaSkillConfiguration: js.UndefOr[SipMediaApplicationAlexaSkillConfiguration] = js.undefined
    ): GetSipMediaApplicationAlexaSkillConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      SipMediaApplicationAlexaSkillConfiguration.foreach(__v => __obj.updateDynamic("SipMediaApplicationAlexaSkillConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSipMediaApplicationAlexaSkillConfigurationResponse]
    }
  }

  @js.native
  trait GetSipMediaApplicationLoggingConfigurationRequest extends js.Object {
    var SipMediaApplicationId: NonEmptyString
  }

  object GetSipMediaApplicationLoggingConfigurationRequest {
    @inline
    def apply(
        SipMediaApplicationId: NonEmptyString
    ): GetSipMediaApplicationLoggingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "SipMediaApplicationId" -> SipMediaApplicationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSipMediaApplicationLoggingConfigurationRequest]
    }
  }

  @js.native
  trait GetSipMediaApplicationLoggingConfigurationResponse extends js.Object {
    var SipMediaApplicationLoggingConfiguration: js.UndefOr[SipMediaApplicationLoggingConfiguration]
  }

  object GetSipMediaApplicationLoggingConfigurationResponse {
    @inline
    def apply(
        SipMediaApplicationLoggingConfiguration: js.UndefOr[SipMediaApplicationLoggingConfiguration] = js.undefined
    ): GetSipMediaApplicationLoggingConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      SipMediaApplicationLoggingConfiguration.foreach(__v => __obj.updateDynamic("SipMediaApplicationLoggingConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSipMediaApplicationLoggingConfigurationResponse]
    }
  }

  @js.native
  trait GetSipMediaApplicationRequest extends js.Object {
    var SipMediaApplicationId: NonEmptyString
  }

  object GetSipMediaApplicationRequest {
    @inline
    def apply(
        SipMediaApplicationId: NonEmptyString
    ): GetSipMediaApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "SipMediaApplicationId" -> SipMediaApplicationId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSipMediaApplicationRequest]
    }
  }

  @js.native
  trait GetSipMediaApplicationResponse extends js.Object {
    var SipMediaApplication: js.UndefOr[SipMediaApplication]
  }

  object GetSipMediaApplicationResponse {
    @inline
    def apply(
        SipMediaApplication: js.UndefOr[SipMediaApplication] = js.undefined
    ): GetSipMediaApplicationResponse = {
      val __obj = js.Dynamic.literal()
      SipMediaApplication.foreach(__v => __obj.updateDynamic("SipMediaApplication")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSipMediaApplicationResponse]
    }
  }

  @js.native
  trait GetSipRuleRequest extends js.Object {
    var SipRuleId: NonEmptyString
  }

  object GetSipRuleRequest {
    @inline
    def apply(
        SipRuleId: NonEmptyString
    ): GetSipRuleRequest = {
      val __obj = js.Dynamic.literal(
        "SipRuleId" -> SipRuleId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSipRuleRequest]
    }
  }

  @js.native
  trait GetSipRuleResponse extends js.Object {
    var SipRule: js.UndefOr[SipRule]
  }

  object GetSipRuleResponse {
    @inline
    def apply(
        SipRule: js.UndefOr[SipRule] = js.undefined
    ): GetSipRuleResponse = {
      val __obj = js.Dynamic.literal()
      SipRule.foreach(__v => __obj.updateDynamic("SipRule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSipRuleResponse]
    }
  }

  @js.native
  trait GetVoiceConnectorEmergencyCallingConfigurationRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object GetVoiceConnectorEmergencyCallingConfigurationRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString
    ): GetVoiceConnectorEmergencyCallingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetVoiceConnectorEmergencyCallingConfigurationRequest]
    }
  }

  @js.native
  trait GetVoiceConnectorEmergencyCallingConfigurationResponse extends js.Object {
    var EmergencyCallingConfiguration: js.UndefOr[EmergencyCallingConfiguration]
  }

  object GetVoiceConnectorEmergencyCallingConfigurationResponse {
    @inline
    def apply(
        EmergencyCallingConfiguration: js.UndefOr[EmergencyCallingConfiguration] = js.undefined
    ): GetVoiceConnectorEmergencyCallingConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      EmergencyCallingConfiguration.foreach(__v => __obj.updateDynamic("EmergencyCallingConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVoiceConnectorEmergencyCallingConfigurationResponse]
    }
  }

  @js.native
  trait GetVoiceConnectorGroupRequest extends js.Object {
    var VoiceConnectorGroupId: NonEmptyString
  }

  object GetVoiceConnectorGroupRequest {
    @inline
    def apply(
        VoiceConnectorGroupId: NonEmptyString
    ): GetVoiceConnectorGroupRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorGroupId" -> VoiceConnectorGroupId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetVoiceConnectorGroupRequest]
    }
  }

  @js.native
  trait GetVoiceConnectorGroupResponse extends js.Object {
    var VoiceConnectorGroup: js.UndefOr[VoiceConnectorGroup]
  }

  object GetVoiceConnectorGroupResponse {
    @inline
    def apply(
        VoiceConnectorGroup: js.UndefOr[VoiceConnectorGroup] = js.undefined
    ): GetVoiceConnectorGroupResponse = {
      val __obj = js.Dynamic.literal()
      VoiceConnectorGroup.foreach(__v => __obj.updateDynamic("VoiceConnectorGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVoiceConnectorGroupResponse]
    }
  }

  @js.native
  trait GetVoiceConnectorLoggingConfigurationRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object GetVoiceConnectorLoggingConfigurationRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString
    ): GetVoiceConnectorLoggingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetVoiceConnectorLoggingConfigurationRequest]
    }
  }

  @js.native
  trait GetVoiceConnectorLoggingConfigurationResponse extends js.Object {
    var LoggingConfiguration: js.UndefOr[LoggingConfiguration]
  }

  object GetVoiceConnectorLoggingConfigurationResponse {
    @inline
    def apply(
        LoggingConfiguration: js.UndefOr[LoggingConfiguration] = js.undefined
    ): GetVoiceConnectorLoggingConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      LoggingConfiguration.foreach(__v => __obj.updateDynamic("LoggingConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVoiceConnectorLoggingConfigurationResponse]
    }
  }

  @js.native
  trait GetVoiceConnectorOriginationRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object GetVoiceConnectorOriginationRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString
    ): GetVoiceConnectorOriginationRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetVoiceConnectorOriginationRequest]
    }
  }

  @js.native
  trait GetVoiceConnectorOriginationResponse extends js.Object {
    var Origination: js.UndefOr[Origination]
  }

  object GetVoiceConnectorOriginationResponse {
    @inline
    def apply(
        Origination: js.UndefOr[Origination] = js.undefined
    ): GetVoiceConnectorOriginationResponse = {
      val __obj = js.Dynamic.literal()
      Origination.foreach(__v => __obj.updateDynamic("Origination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVoiceConnectorOriginationResponse]
    }
  }

  @js.native
  trait GetVoiceConnectorProxyRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString128
  }

  object GetVoiceConnectorProxyRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString128
    ): GetVoiceConnectorProxyRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetVoiceConnectorProxyRequest]
    }
  }

  @js.native
  trait GetVoiceConnectorProxyResponse extends js.Object {
    var Proxy: js.UndefOr[Proxy]
  }

  object GetVoiceConnectorProxyResponse {
    @inline
    def apply(
        Proxy: js.UndefOr[Proxy] = js.undefined
    ): GetVoiceConnectorProxyResponse = {
      val __obj = js.Dynamic.literal()
      Proxy.foreach(__v => __obj.updateDynamic("Proxy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVoiceConnectorProxyResponse]
    }
  }

  @js.native
  trait GetVoiceConnectorRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object GetVoiceConnectorRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString
    ): GetVoiceConnectorRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetVoiceConnectorRequest]
    }
  }

  @js.native
  trait GetVoiceConnectorResponse extends js.Object {
    var VoiceConnector: js.UndefOr[VoiceConnector]
  }

  object GetVoiceConnectorResponse {
    @inline
    def apply(
        VoiceConnector: js.UndefOr[VoiceConnector] = js.undefined
    ): GetVoiceConnectorResponse = {
      val __obj = js.Dynamic.literal()
      VoiceConnector.foreach(__v => __obj.updateDynamic("VoiceConnector")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVoiceConnectorResponse]
    }
  }

  @js.native
  trait GetVoiceConnectorStreamingConfigurationRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object GetVoiceConnectorStreamingConfigurationRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString
    ): GetVoiceConnectorStreamingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetVoiceConnectorStreamingConfigurationRequest]
    }
  }

  @js.native
  trait GetVoiceConnectorStreamingConfigurationResponse extends js.Object {
    var StreamingConfiguration: js.UndefOr[StreamingConfiguration]
  }

  object GetVoiceConnectorStreamingConfigurationResponse {
    @inline
    def apply(
        StreamingConfiguration: js.UndefOr[StreamingConfiguration] = js.undefined
    ): GetVoiceConnectorStreamingConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      StreamingConfiguration.foreach(__v => __obj.updateDynamic("StreamingConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVoiceConnectorStreamingConfigurationResponse]
    }
  }

  @js.native
  trait GetVoiceConnectorTerminationHealthRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object GetVoiceConnectorTerminationHealthRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString
    ): GetVoiceConnectorTerminationHealthRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetVoiceConnectorTerminationHealthRequest]
    }
  }

  @js.native
  trait GetVoiceConnectorTerminationHealthResponse extends js.Object {
    var TerminationHealth: js.UndefOr[TerminationHealth]
  }

  object GetVoiceConnectorTerminationHealthResponse {
    @inline
    def apply(
        TerminationHealth: js.UndefOr[TerminationHealth] = js.undefined
    ): GetVoiceConnectorTerminationHealthResponse = {
      val __obj = js.Dynamic.literal()
      TerminationHealth.foreach(__v => __obj.updateDynamic("TerminationHealth")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVoiceConnectorTerminationHealthResponse]
    }
  }

  @js.native
  trait GetVoiceConnectorTerminationRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object GetVoiceConnectorTerminationRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString
    ): GetVoiceConnectorTerminationRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetVoiceConnectorTerminationRequest]
    }
  }

  @js.native
  trait GetVoiceConnectorTerminationResponse extends js.Object {
    var Termination: js.UndefOr[Termination]
  }

  object GetVoiceConnectorTerminationResponse {
    @inline
    def apply(
        Termination: js.UndefOr[Termination] = js.undefined
    ): GetVoiceConnectorTerminationResponse = {
      val __obj = js.Dynamic.literal()
      Termination.foreach(__v => __obj.updateDynamic("Termination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetVoiceConnectorTerminationResponse]
    }
  }

  @js.native
  trait ListAvailableVoiceConnectorRegionsResponse extends js.Object {
    var VoiceConnectorRegions: js.UndefOr[VoiceConnectorAwsRegionList]
  }

  object ListAvailableVoiceConnectorRegionsResponse {
    @inline
    def apply(
        VoiceConnectorRegions: js.UndefOr[VoiceConnectorAwsRegionList] = js.undefined
    ): ListAvailableVoiceConnectorRegionsResponse = {
      val __obj = js.Dynamic.literal()
      VoiceConnectorRegions.foreach(__v => __obj.updateDynamic("VoiceConnectorRegions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAvailableVoiceConnectorRegionsResponse]
    }
  }

  @js.native
  trait ListPhoneNumberOrdersRequest extends js.Object {
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[String]
  }

  object ListPhoneNumberOrdersRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ResultMax] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListPhoneNumberOrdersRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPhoneNumberOrdersRequest]
    }
  }

  @js.native
  trait ListPhoneNumberOrdersResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var PhoneNumberOrders: js.UndefOr[PhoneNumberOrderList]
  }

  object ListPhoneNumberOrdersResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        PhoneNumberOrders: js.UndefOr[PhoneNumberOrderList] = js.undefined
    ): ListPhoneNumberOrdersResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PhoneNumberOrders.foreach(__v => __obj.updateDynamic("PhoneNumberOrders")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPhoneNumberOrdersResponse]
    }
  }

  @js.native
  trait ListPhoneNumbersRequest extends js.Object {
    var FilterName: js.UndefOr[PhoneNumberAssociationName]
    var FilterValue: js.UndefOr[String]
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[String]
    var ProductType: js.UndefOr[PhoneNumberProductType]
    var Status: js.UndefOr[String]
  }

  object ListPhoneNumbersRequest {
    @inline
    def apply(
        FilterName: js.UndefOr[PhoneNumberAssociationName] = js.undefined,
        FilterValue: js.UndefOr[String] = js.undefined,
        MaxResults: js.UndefOr[ResultMax] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        ProductType: js.UndefOr[PhoneNumberProductType] = js.undefined,
        Status: js.UndefOr[String] = js.undefined
    ): ListPhoneNumbersRequest = {
      val __obj = js.Dynamic.literal()
      FilterName.foreach(__v => __obj.updateDynamic("FilterName")(__v.asInstanceOf[js.Any]))
      FilterValue.foreach(__v => __obj.updateDynamic("FilterValue")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ProductType.foreach(__v => __obj.updateDynamic("ProductType")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPhoneNumbersRequest]
    }
  }

  @js.native
  trait ListPhoneNumbersResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var PhoneNumbers: js.UndefOr[PhoneNumberList]
  }

  object ListPhoneNumbersResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        PhoneNumbers: js.UndefOr[PhoneNumberList] = js.undefined
    ): ListPhoneNumbersResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PhoneNumbers.foreach(__v => __obj.updateDynamic("PhoneNumbers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPhoneNumbersResponse]
    }
  }

  @js.native
  trait ListProxySessionsRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString128
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[NextTokenString]
    var Status: js.UndefOr[ProxySessionStatus]
  }

  object ListProxySessionsRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString128,
        MaxResults: js.UndefOr[ResultMax] = js.undefined,
        NextToken: js.UndefOr[NextTokenString] = js.undefined,
        Status: js.UndefOr[ProxySessionStatus] = js.undefined
    ): ListProxySessionsRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProxySessionsRequest]
    }
  }

  @js.native
  trait ListProxySessionsResponse extends js.Object {
    var NextToken: js.UndefOr[NextTokenString]
    var ProxySessions: js.UndefOr[ProxySessions]
  }

  object ListProxySessionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextTokenString] = js.undefined,
        ProxySessions: js.UndefOr[ProxySessions] = js.undefined
    ): ListProxySessionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ProxySessions.foreach(__v => __obj.updateDynamic("ProxySessions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListProxySessionsResponse]
    }
  }

  @js.native
  trait ListSipMediaApplicationsRequest extends js.Object {
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[NextTokenString]
  }

  object ListSipMediaApplicationsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ResultMax] = js.undefined,
        NextToken: js.UndefOr[NextTokenString] = js.undefined
    ): ListSipMediaApplicationsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSipMediaApplicationsRequest]
    }
  }

  @js.native
  trait ListSipMediaApplicationsResponse extends js.Object {
    var NextToken: js.UndefOr[NextTokenString]
    var SipMediaApplications: js.UndefOr[SipMediaApplicationList]
  }

  object ListSipMediaApplicationsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextTokenString] = js.undefined,
        SipMediaApplications: js.UndefOr[SipMediaApplicationList] = js.undefined
    ): ListSipMediaApplicationsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SipMediaApplications.foreach(__v => __obj.updateDynamic("SipMediaApplications")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSipMediaApplicationsResponse]
    }
  }

  @js.native
  trait ListSipRulesRequest extends js.Object {
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[NextTokenString]
    var SipMediaApplicationId: js.UndefOr[NonEmptyString]
  }

  object ListSipRulesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ResultMax] = js.undefined,
        NextToken: js.UndefOr[NextTokenString] = js.undefined,
        SipMediaApplicationId: js.UndefOr[NonEmptyString] = js.undefined
    ): ListSipRulesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SipMediaApplicationId.foreach(__v => __obj.updateDynamic("SipMediaApplicationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSipRulesRequest]
    }
  }

  @js.native
  trait ListSipRulesResponse extends js.Object {
    var NextToken: js.UndefOr[NextTokenString]
    var SipRules: js.UndefOr[SipRuleList]
  }

  object ListSipRulesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextTokenString] = js.undefined,
        SipRules: js.UndefOr[SipRuleList] = js.undefined
    ): ListSipRulesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      SipRules.foreach(__v => __obj.updateDynamic("SipRules")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSipRulesResponse]
    }
  }

  @js.native
  trait ListSupportedPhoneNumberCountriesRequest extends js.Object {
    var ProductType: PhoneNumberProductType
  }

  object ListSupportedPhoneNumberCountriesRequest {
    @inline
    def apply(
        ProductType: PhoneNumberProductType
    ): ListSupportedPhoneNumberCountriesRequest = {
      val __obj = js.Dynamic.literal(
        "ProductType" -> ProductType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListSupportedPhoneNumberCountriesRequest]
    }
  }

  @js.native
  trait ListSupportedPhoneNumberCountriesResponse extends js.Object {
    var PhoneNumberCountries: js.UndefOr[PhoneNumberCountriesList]
  }

  object ListSupportedPhoneNumberCountriesResponse {
    @inline
    def apply(
        PhoneNumberCountries: js.UndefOr[PhoneNumberCountriesList] = js.undefined
    ): ListSupportedPhoneNumberCountriesResponse = {
      val __obj = js.Dynamic.literal()
      PhoneNumberCountries.foreach(__v => __obj.updateDynamic("PhoneNumberCountries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSupportedPhoneNumberCountriesResponse]
    }
  }

  @js.native
  trait ListVoiceConnectorGroupsRequest extends js.Object {
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[String]
  }

  object ListVoiceConnectorGroupsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ResultMax] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListVoiceConnectorGroupsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVoiceConnectorGroupsRequest]
    }
  }

  @js.native
  trait ListVoiceConnectorGroupsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var VoiceConnectorGroups: js.UndefOr[VoiceConnectorGroupList]
  }

  object ListVoiceConnectorGroupsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        VoiceConnectorGroups: js.UndefOr[VoiceConnectorGroupList] = js.undefined
    ): ListVoiceConnectorGroupsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      VoiceConnectorGroups.foreach(__v => __obj.updateDynamic("VoiceConnectorGroups")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVoiceConnectorGroupsResponse]
    }
  }

  @js.native
  trait ListVoiceConnectorTerminationCredentialsRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
  }

  object ListVoiceConnectorTerminationCredentialsRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString
    ): ListVoiceConnectorTerminationCredentialsRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListVoiceConnectorTerminationCredentialsRequest]
    }
  }

  @js.native
  trait ListVoiceConnectorTerminationCredentialsResponse extends js.Object {
    var Usernames: js.UndefOr[SensitiveStringList]
  }

  object ListVoiceConnectorTerminationCredentialsResponse {
    @inline
    def apply(
        Usernames: js.UndefOr[SensitiveStringList] = js.undefined
    ): ListVoiceConnectorTerminationCredentialsResponse = {
      val __obj = js.Dynamic.literal()
      Usernames.foreach(__v => __obj.updateDynamic("Usernames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVoiceConnectorTerminationCredentialsResponse]
    }
  }

  @js.native
  trait ListVoiceConnectorsRequest extends js.Object {
    var MaxResults: js.UndefOr[ResultMax]
    var NextToken: js.UndefOr[String]
  }

  object ListVoiceConnectorsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[ResultMax] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListVoiceConnectorsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVoiceConnectorsRequest]
    }
  }

  @js.native
  trait ListVoiceConnectorsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var VoiceConnectors: js.UndefOr[VoiceConnectorList]
  }

  object ListVoiceConnectorsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        VoiceConnectors: js.UndefOr[VoiceConnectorList] = js.undefined
    ): ListVoiceConnectorsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      VoiceConnectors.foreach(__v => __obj.updateDynamic("VoiceConnectors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVoiceConnectorsResponse]
    }
  }

  @js.native
  trait LoggingConfiguration extends js.Object {
    var EnableSIPLogs: js.UndefOr[Boolean]
  }

  object LoggingConfiguration {
    @inline
    def apply(
        EnableSIPLogs: js.UndefOr[Boolean] = js.undefined
    ): LoggingConfiguration = {
      val __obj = js.Dynamic.literal()
      EnableSIPLogs.foreach(__v => __obj.updateDynamic("EnableSIPLogs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoggingConfiguration]
    }
  }

  @js.native
  trait OrderedPhoneNumber extends js.Object {
    var E164PhoneNumber: js.UndefOr[E164PhoneNumber]
    var Status: js.UndefOr[OrderedPhoneNumberStatus]
  }

  object OrderedPhoneNumber {
    @inline
    def apply(
        E164PhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined,
        Status: js.UndefOr[OrderedPhoneNumberStatus] = js.undefined
    ): OrderedPhoneNumber = {
      val __obj = js.Dynamic.literal()
      E164PhoneNumber.foreach(__v => __obj.updateDynamic("E164PhoneNumber")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OrderedPhoneNumber]
    }
  }

  @js.native
  trait Origination extends js.Object {
    var Disabled: js.UndefOr[Boolean]
    var Routes: js.UndefOr[OriginationRouteList]
  }

  object Origination {
    @inline
    def apply(
        Disabled: js.UndefOr[Boolean] = js.undefined,
        Routes: js.UndefOr[OriginationRouteList] = js.undefined
    ): Origination = {
      val __obj = js.Dynamic.literal()
      Disabled.foreach(__v => __obj.updateDynamic("Disabled")(__v.asInstanceOf[js.Any]))
      Routes.foreach(__v => __obj.updateDynamic("Routes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Origination]
    }
  }

  @js.native
  trait OriginationRoute extends js.Object {
    var Host: js.UndefOr[String]
    var Port: js.UndefOr[Port]
    var Priority: js.UndefOr[OriginationRoutePriority]
    var Protocol: js.UndefOr[OriginationRouteProtocol]
    var Weight: js.UndefOr[OriginationRouteWeight]
  }

  object OriginationRoute {
    @inline
    def apply(
        Host: js.UndefOr[String] = js.undefined,
        Port: js.UndefOr[Port] = js.undefined,
        Priority: js.UndefOr[OriginationRoutePriority] = js.undefined,
        Protocol: js.UndefOr[OriginationRouteProtocol] = js.undefined,
        Weight: js.UndefOr[OriginationRouteWeight] = js.undefined
    ): OriginationRoute = {
      val __obj = js.Dynamic.literal()
      Host.foreach(__v => __obj.updateDynamic("Host")(__v.asInstanceOf[js.Any]))
      Port.foreach(__v => __obj.updateDynamic("Port")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      Weight.foreach(__v => __obj.updateDynamic("Weight")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OriginationRoute]
    }
  }

  @js.native
  trait Participant extends js.Object {
    var PhoneNumber: js.UndefOr[E164PhoneNumber]
    var ProxyPhoneNumber: js.UndefOr[E164PhoneNumber]
  }

  object Participant {
    @inline
    def apply(
        PhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined,
        ProxyPhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined
    ): Participant = {
      val __obj = js.Dynamic.literal()
      PhoneNumber.foreach(__v => __obj.updateDynamic("PhoneNumber")(__v.asInstanceOf[js.Any]))
      ProxyPhoneNumber.foreach(__v => __obj.updateDynamic("ProxyPhoneNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Participant]
    }
  }

  @js.native
  trait PhoneNumber extends js.Object {
    var Associations: js.UndefOr[PhoneNumberAssociationList]
    var CallingName: js.UndefOr[CallingName]
    var CallingNameStatus: js.UndefOr[CallingNameStatus]
    var Capabilities: js.UndefOr[PhoneNumberCapabilities]
    var Country: js.UndefOr[Alpha2CountryCode]
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var DeletionTimestamp: js.UndefOr[Iso8601Timestamp]
    var E164PhoneNumber: js.UndefOr[E164PhoneNumber]
    var OrderId: js.UndefOr[GuidString]
    var PhoneNumberId: js.UndefOr[SensitiveNonEmptyString]
    var ProductType: js.UndefOr[PhoneNumberProductType]
    var Status: js.UndefOr[PhoneNumberStatus]
    var Type: js.UndefOr[PhoneNumberType]
    var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp]
  }

  object PhoneNumber {
    @inline
    def apply(
        Associations: js.UndefOr[PhoneNumberAssociationList] = js.undefined,
        CallingName: js.UndefOr[CallingName] = js.undefined,
        CallingNameStatus: js.UndefOr[CallingNameStatus] = js.undefined,
        Capabilities: js.UndefOr[PhoneNumberCapabilities] = js.undefined,
        Country: js.UndefOr[Alpha2CountryCode] = js.undefined,
        CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        DeletionTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        E164PhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined,
        OrderId: js.UndefOr[GuidString] = js.undefined,
        PhoneNumberId: js.UndefOr[SensitiveNonEmptyString] = js.undefined,
        ProductType: js.UndefOr[PhoneNumberProductType] = js.undefined,
        Status: js.UndefOr[PhoneNumberStatus] = js.undefined,
        Type: js.UndefOr[PhoneNumberType] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
    ): PhoneNumber = {
      val __obj = js.Dynamic.literal()
      Associations.foreach(__v => __obj.updateDynamic("Associations")(__v.asInstanceOf[js.Any]))
      CallingName.foreach(__v => __obj.updateDynamic("CallingName")(__v.asInstanceOf[js.Any]))
      CallingNameStatus.foreach(__v => __obj.updateDynamic("CallingNameStatus")(__v.asInstanceOf[js.Any]))
      Capabilities.foreach(__v => __obj.updateDynamic("Capabilities")(__v.asInstanceOf[js.Any]))
      Country.foreach(__v => __obj.updateDynamic("Country")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      DeletionTimestamp.foreach(__v => __obj.updateDynamic("DeletionTimestamp")(__v.asInstanceOf[js.Any]))
      E164PhoneNumber.foreach(__v => __obj.updateDynamic("E164PhoneNumber")(__v.asInstanceOf[js.Any]))
      OrderId.foreach(__v => __obj.updateDynamic("OrderId")(__v.asInstanceOf[js.Any]))
      PhoneNumberId.foreach(__v => __obj.updateDynamic("PhoneNumberId")(__v.asInstanceOf[js.Any]))
      ProductType.foreach(__v => __obj.updateDynamic("ProductType")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      UpdatedTimestamp.foreach(__v => __obj.updateDynamic("UpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PhoneNumber]
    }
  }

  @js.native
  trait PhoneNumberAssociation extends js.Object {
    var AssociatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var Name: js.UndefOr[PhoneNumberAssociationName]
    var Value: js.UndefOr[String]
  }

  object PhoneNumberAssociation {
    @inline
    def apply(
        AssociatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        Name: js.UndefOr[PhoneNumberAssociationName] = js.undefined,
        Value: js.UndefOr[String] = js.undefined
    ): PhoneNumberAssociation = {
      val __obj = js.Dynamic.literal()
      AssociatedTimestamp.foreach(__v => __obj.updateDynamic("AssociatedTimestamp")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PhoneNumberAssociation]
    }
  }

  @js.native
  trait PhoneNumberCapabilities extends js.Object {
    var InboundCall: js.UndefOr[NullableBoolean]
    var InboundMMS: js.UndefOr[NullableBoolean]
    var InboundSMS: js.UndefOr[NullableBoolean]
    var OutboundCall: js.UndefOr[NullableBoolean]
    var OutboundMMS: js.UndefOr[NullableBoolean]
    var OutboundSMS: js.UndefOr[NullableBoolean]
  }

  object PhoneNumberCapabilities {
    @inline
    def apply(
        InboundCall: js.UndefOr[NullableBoolean] = js.undefined,
        InboundMMS: js.UndefOr[NullableBoolean] = js.undefined,
        InboundSMS: js.UndefOr[NullableBoolean] = js.undefined,
        OutboundCall: js.UndefOr[NullableBoolean] = js.undefined,
        OutboundMMS: js.UndefOr[NullableBoolean] = js.undefined,
        OutboundSMS: js.UndefOr[NullableBoolean] = js.undefined
    ): PhoneNumberCapabilities = {
      val __obj = js.Dynamic.literal()
      InboundCall.foreach(__v => __obj.updateDynamic("InboundCall")(__v.asInstanceOf[js.Any]))
      InboundMMS.foreach(__v => __obj.updateDynamic("InboundMMS")(__v.asInstanceOf[js.Any]))
      InboundSMS.foreach(__v => __obj.updateDynamic("InboundSMS")(__v.asInstanceOf[js.Any]))
      OutboundCall.foreach(__v => __obj.updateDynamic("OutboundCall")(__v.asInstanceOf[js.Any]))
      OutboundMMS.foreach(__v => __obj.updateDynamic("OutboundMMS")(__v.asInstanceOf[js.Any]))
      OutboundSMS.foreach(__v => __obj.updateDynamic("OutboundSMS")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PhoneNumberCapabilities]
    }
  }

  @js.native
  trait PhoneNumberCountry extends js.Object {
    var CountryCode: js.UndefOr[Alpha2CountryCode]
    var SupportedPhoneNumberTypes: js.UndefOr[PhoneNumberTypeList]
  }

  object PhoneNumberCountry {
    @inline
    def apply(
        CountryCode: js.UndefOr[Alpha2CountryCode] = js.undefined,
        SupportedPhoneNumberTypes: js.UndefOr[PhoneNumberTypeList] = js.undefined
    ): PhoneNumberCountry = {
      val __obj = js.Dynamic.literal()
      CountryCode.foreach(__v => __obj.updateDynamic("CountryCode")(__v.asInstanceOf[js.Any]))
      SupportedPhoneNumberTypes.foreach(__v => __obj.updateDynamic("SupportedPhoneNumberTypes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PhoneNumberCountry]
    }
  }

  @js.native
  trait PhoneNumberError extends js.Object {
    var ErrorCode: js.UndefOr[ErrorCode]
    var ErrorMessage: js.UndefOr[String]
    var PhoneNumberId: js.UndefOr[SensitiveNonEmptyString]
  }

  object PhoneNumberError {
    @inline
    def apply(
        ErrorCode: js.UndefOr[ErrorCode] = js.undefined,
        ErrorMessage: js.UndefOr[String] = js.undefined,
        PhoneNumberId: js.UndefOr[SensitiveNonEmptyString] = js.undefined
    ): PhoneNumberError = {
      val __obj = js.Dynamic.literal()
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      PhoneNumberId.foreach(__v => __obj.updateDynamic("PhoneNumberId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PhoneNumberError]
    }
  }

  @js.native
  trait PhoneNumberOrder extends js.Object {
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var OrderType: js.UndefOr[PhoneNumberOrderType]
    var OrderedPhoneNumbers: js.UndefOr[OrderedPhoneNumberList]
    var PhoneNumberOrderId: js.UndefOr[GuidString]
    var ProductType: js.UndefOr[PhoneNumberProductType]
    var Status: js.UndefOr[PhoneNumberOrderStatus]
    var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp]
  }

  object PhoneNumberOrder {
    @inline
    def apply(
        CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        OrderType: js.UndefOr[PhoneNumberOrderType] = js.undefined,
        OrderedPhoneNumbers: js.UndefOr[OrderedPhoneNumberList] = js.undefined,
        PhoneNumberOrderId: js.UndefOr[GuidString] = js.undefined,
        ProductType: js.UndefOr[PhoneNumberProductType] = js.undefined,
        Status: js.UndefOr[PhoneNumberOrderStatus] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
    ): PhoneNumberOrder = {
      val __obj = js.Dynamic.literal()
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      OrderType.foreach(__v => __obj.updateDynamic("OrderType")(__v.asInstanceOf[js.Any]))
      OrderedPhoneNumbers.foreach(__v => __obj.updateDynamic("OrderedPhoneNumbers")(__v.asInstanceOf[js.Any]))
      PhoneNumberOrderId.foreach(__v => __obj.updateDynamic("PhoneNumberOrderId")(__v.asInstanceOf[js.Any]))
      ProductType.foreach(__v => __obj.updateDynamic("ProductType")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdatedTimestamp.foreach(__v => __obj.updateDynamic("UpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PhoneNumberOrder]
    }
  }

  @js.native
  trait Proxy extends js.Object {
    var DefaultSessionExpiryMinutes: js.UndefOr[Int]
    var Disabled: js.UndefOr[Boolean]
    var FallBackPhoneNumber: js.UndefOr[E164PhoneNumber]
    var PhoneNumberCountries: js.UndefOr[StringList]
  }

  object Proxy {
    @inline
    def apply(
        DefaultSessionExpiryMinutes: js.UndefOr[Int] = js.undefined,
        Disabled: js.UndefOr[Boolean] = js.undefined,
        FallBackPhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined,
        PhoneNumberCountries: js.UndefOr[StringList] = js.undefined
    ): Proxy = {
      val __obj = js.Dynamic.literal()
      DefaultSessionExpiryMinutes.foreach(__v => __obj.updateDynamic("DefaultSessionExpiryMinutes")(__v.asInstanceOf[js.Any]))
      Disabled.foreach(__v => __obj.updateDynamic("Disabled")(__v.asInstanceOf[js.Any]))
      FallBackPhoneNumber.foreach(__v => __obj.updateDynamic("FallBackPhoneNumber")(__v.asInstanceOf[js.Any]))
      PhoneNumberCountries.foreach(__v => __obj.updateDynamic("PhoneNumberCountries")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Proxy]
    }
  }

  @js.native
  trait ProxySession extends js.Object {
    var Capabilities: js.UndefOr[CapabilityList]
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var EndedTimestamp: js.UndefOr[Iso8601Timestamp]
    var ExpiryMinutes: js.UndefOr[PositiveInteger]
    var GeoMatchLevel: js.UndefOr[GeoMatchLevel]
    var GeoMatchParams: js.UndefOr[GeoMatchParams]
    var Name: js.UndefOr[String128]
    var NumberSelectionBehavior: js.UndefOr[NumberSelectionBehavior]
    var Participants: js.UndefOr[Participants]
    var ProxySessionId: js.UndefOr[NonEmptyString128]
    var Status: js.UndefOr[ProxySessionStatus]
    var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var VoiceConnectorId: js.UndefOr[NonEmptyString128]
  }

  object ProxySession {
    @inline
    def apply(
        Capabilities: js.UndefOr[CapabilityList] = js.undefined,
        CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        EndedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        ExpiryMinutes: js.UndefOr[PositiveInteger] = js.undefined,
        GeoMatchLevel: js.UndefOr[GeoMatchLevel] = js.undefined,
        GeoMatchParams: js.UndefOr[GeoMatchParams] = js.undefined,
        Name: js.UndefOr[String128] = js.undefined,
        NumberSelectionBehavior: js.UndefOr[NumberSelectionBehavior] = js.undefined,
        Participants: js.UndefOr[Participants] = js.undefined,
        ProxySessionId: js.UndefOr[NonEmptyString128] = js.undefined,
        Status: js.UndefOr[ProxySessionStatus] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        VoiceConnectorId: js.UndefOr[NonEmptyString128] = js.undefined
    ): ProxySession = {
      val __obj = js.Dynamic.literal()
      Capabilities.foreach(__v => __obj.updateDynamic("Capabilities")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      EndedTimestamp.foreach(__v => __obj.updateDynamic("EndedTimestamp")(__v.asInstanceOf[js.Any]))
      ExpiryMinutes.foreach(__v => __obj.updateDynamic("ExpiryMinutes")(__v.asInstanceOf[js.Any]))
      GeoMatchLevel.foreach(__v => __obj.updateDynamic("GeoMatchLevel")(__v.asInstanceOf[js.Any]))
      GeoMatchParams.foreach(__v => __obj.updateDynamic("GeoMatchParams")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NumberSelectionBehavior.foreach(__v => __obj.updateDynamic("NumberSelectionBehavior")(__v.asInstanceOf[js.Any]))
      Participants.foreach(__v => __obj.updateDynamic("Participants")(__v.asInstanceOf[js.Any]))
      ProxySessionId.foreach(__v => __obj.updateDynamic("ProxySessionId")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      UpdatedTimestamp.foreach(__v => __obj.updateDynamic("UpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      VoiceConnectorId.foreach(__v => __obj.updateDynamic("VoiceConnectorId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProxySession]
    }
  }

  @js.native
  trait PutSipMediaApplicationAlexaSkillConfigurationRequest extends js.Object {
    var SipMediaApplicationId: NonEmptyString
    var SipMediaApplicationAlexaSkillConfiguration: js.UndefOr[SipMediaApplicationAlexaSkillConfiguration]
  }

  object PutSipMediaApplicationAlexaSkillConfigurationRequest {
    @inline
    def apply(
        SipMediaApplicationId: NonEmptyString,
        SipMediaApplicationAlexaSkillConfiguration: js.UndefOr[SipMediaApplicationAlexaSkillConfiguration] = js.undefined
    ): PutSipMediaApplicationAlexaSkillConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "SipMediaApplicationId" -> SipMediaApplicationId.asInstanceOf[js.Any]
      )

      SipMediaApplicationAlexaSkillConfiguration.foreach(__v => __obj.updateDynamic("SipMediaApplicationAlexaSkillConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutSipMediaApplicationAlexaSkillConfigurationRequest]
    }
  }

  @js.native
  trait PutSipMediaApplicationAlexaSkillConfigurationResponse extends js.Object {
    var SipMediaApplicationAlexaSkillConfiguration: js.UndefOr[SipMediaApplicationAlexaSkillConfiguration]
  }

  object PutSipMediaApplicationAlexaSkillConfigurationResponse {
    @inline
    def apply(
        SipMediaApplicationAlexaSkillConfiguration: js.UndefOr[SipMediaApplicationAlexaSkillConfiguration] = js.undefined
    ): PutSipMediaApplicationAlexaSkillConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      SipMediaApplicationAlexaSkillConfiguration.foreach(__v => __obj.updateDynamic("SipMediaApplicationAlexaSkillConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutSipMediaApplicationAlexaSkillConfigurationResponse]
    }
  }

  @js.native
  trait PutSipMediaApplicationLoggingConfigurationRequest extends js.Object {
    var SipMediaApplicationId: NonEmptyString
    var SipMediaApplicationLoggingConfiguration: js.UndefOr[SipMediaApplicationLoggingConfiguration]
  }

  object PutSipMediaApplicationLoggingConfigurationRequest {
    @inline
    def apply(
        SipMediaApplicationId: NonEmptyString,
        SipMediaApplicationLoggingConfiguration: js.UndefOr[SipMediaApplicationLoggingConfiguration] = js.undefined
    ): PutSipMediaApplicationLoggingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "SipMediaApplicationId" -> SipMediaApplicationId.asInstanceOf[js.Any]
      )

      SipMediaApplicationLoggingConfiguration.foreach(__v => __obj.updateDynamic("SipMediaApplicationLoggingConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutSipMediaApplicationLoggingConfigurationRequest]
    }
  }

  @js.native
  trait PutSipMediaApplicationLoggingConfigurationResponse extends js.Object {
    var SipMediaApplicationLoggingConfiguration: js.UndefOr[SipMediaApplicationLoggingConfiguration]
  }

  object PutSipMediaApplicationLoggingConfigurationResponse {
    @inline
    def apply(
        SipMediaApplicationLoggingConfiguration: js.UndefOr[SipMediaApplicationLoggingConfiguration] = js.undefined
    ): PutSipMediaApplicationLoggingConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      SipMediaApplicationLoggingConfiguration.foreach(__v => __obj.updateDynamic("SipMediaApplicationLoggingConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutSipMediaApplicationLoggingConfigurationResponse]
    }
  }

  @js.native
  trait PutVoiceConnectorEmergencyCallingConfigurationRequest extends js.Object {
    var EmergencyCallingConfiguration: EmergencyCallingConfiguration
    var VoiceConnectorId: NonEmptyString
  }

  object PutVoiceConnectorEmergencyCallingConfigurationRequest {
    @inline
    def apply(
        EmergencyCallingConfiguration: EmergencyCallingConfiguration,
        VoiceConnectorId: NonEmptyString
    ): PutVoiceConnectorEmergencyCallingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "EmergencyCallingConfiguration" -> EmergencyCallingConfiguration.asInstanceOf[js.Any],
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutVoiceConnectorEmergencyCallingConfigurationRequest]
    }
  }

  @js.native
  trait PutVoiceConnectorEmergencyCallingConfigurationResponse extends js.Object {
    var EmergencyCallingConfiguration: js.UndefOr[EmergencyCallingConfiguration]
  }

  object PutVoiceConnectorEmergencyCallingConfigurationResponse {
    @inline
    def apply(
        EmergencyCallingConfiguration: js.UndefOr[EmergencyCallingConfiguration] = js.undefined
    ): PutVoiceConnectorEmergencyCallingConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      EmergencyCallingConfiguration.foreach(__v => __obj.updateDynamic("EmergencyCallingConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutVoiceConnectorEmergencyCallingConfigurationResponse]
    }
  }

  @js.native
  trait PutVoiceConnectorLoggingConfigurationRequest extends js.Object {
    var LoggingConfiguration: LoggingConfiguration
    var VoiceConnectorId: NonEmptyString
  }

  object PutVoiceConnectorLoggingConfigurationRequest {
    @inline
    def apply(
        LoggingConfiguration: LoggingConfiguration,
        VoiceConnectorId: NonEmptyString
    ): PutVoiceConnectorLoggingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "LoggingConfiguration" -> LoggingConfiguration.asInstanceOf[js.Any],
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutVoiceConnectorLoggingConfigurationRequest]
    }
  }

  @js.native
  trait PutVoiceConnectorLoggingConfigurationResponse extends js.Object {
    var LoggingConfiguration: js.UndefOr[LoggingConfiguration]
  }

  object PutVoiceConnectorLoggingConfigurationResponse {
    @inline
    def apply(
        LoggingConfiguration: js.UndefOr[LoggingConfiguration] = js.undefined
    ): PutVoiceConnectorLoggingConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      LoggingConfiguration.foreach(__v => __obj.updateDynamic("LoggingConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutVoiceConnectorLoggingConfigurationResponse]
    }
  }

  @js.native
  trait PutVoiceConnectorOriginationRequest extends js.Object {
    var Origination: Origination
    var VoiceConnectorId: NonEmptyString
  }

  object PutVoiceConnectorOriginationRequest {
    @inline
    def apply(
        Origination: Origination,
        VoiceConnectorId: NonEmptyString
    ): PutVoiceConnectorOriginationRequest = {
      val __obj = js.Dynamic.literal(
        "Origination" -> Origination.asInstanceOf[js.Any],
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutVoiceConnectorOriginationRequest]
    }
  }

  @js.native
  trait PutVoiceConnectorOriginationResponse extends js.Object {
    var Origination: js.UndefOr[Origination]
  }

  object PutVoiceConnectorOriginationResponse {
    @inline
    def apply(
        Origination: js.UndefOr[Origination] = js.undefined
    ): PutVoiceConnectorOriginationResponse = {
      val __obj = js.Dynamic.literal()
      Origination.foreach(__v => __obj.updateDynamic("Origination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutVoiceConnectorOriginationResponse]
    }
  }

  @js.native
  trait PutVoiceConnectorProxyRequest extends js.Object {
    var DefaultSessionExpiryMinutes: Int
    var PhoneNumberPoolCountries: CountryList
    var VoiceConnectorId: NonEmptyString128
    var Disabled: js.UndefOr[Boolean]
    var FallBackPhoneNumber: js.UndefOr[E164PhoneNumber]
  }

  object PutVoiceConnectorProxyRequest {
    @inline
    def apply(
        DefaultSessionExpiryMinutes: Int,
        PhoneNumberPoolCountries: CountryList,
        VoiceConnectorId: NonEmptyString128,
        Disabled: js.UndefOr[Boolean] = js.undefined,
        FallBackPhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined
    ): PutVoiceConnectorProxyRequest = {
      val __obj = js.Dynamic.literal(
        "DefaultSessionExpiryMinutes" -> DefaultSessionExpiryMinutes.asInstanceOf[js.Any],
        "PhoneNumberPoolCountries" -> PhoneNumberPoolCountries.asInstanceOf[js.Any],
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )

      Disabled.foreach(__v => __obj.updateDynamic("Disabled")(__v.asInstanceOf[js.Any]))
      FallBackPhoneNumber.foreach(__v => __obj.updateDynamic("FallBackPhoneNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutVoiceConnectorProxyRequest]
    }
  }

  @js.native
  trait PutVoiceConnectorProxyResponse extends js.Object {
    var Proxy: js.UndefOr[Proxy]
  }

  object PutVoiceConnectorProxyResponse {
    @inline
    def apply(
        Proxy: js.UndefOr[Proxy] = js.undefined
    ): PutVoiceConnectorProxyResponse = {
      val __obj = js.Dynamic.literal()
      Proxy.foreach(__v => __obj.updateDynamic("Proxy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutVoiceConnectorProxyResponse]
    }
  }

  @js.native
  trait PutVoiceConnectorStreamingConfigurationRequest extends js.Object {
    var StreamingConfiguration: StreamingConfiguration
    var VoiceConnectorId: NonEmptyString
  }

  object PutVoiceConnectorStreamingConfigurationRequest {
    @inline
    def apply(
        StreamingConfiguration: StreamingConfiguration,
        VoiceConnectorId: NonEmptyString
    ): PutVoiceConnectorStreamingConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "StreamingConfiguration" -> StreamingConfiguration.asInstanceOf[js.Any],
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutVoiceConnectorStreamingConfigurationRequest]
    }
  }

  @js.native
  trait PutVoiceConnectorStreamingConfigurationResponse extends js.Object {
    var StreamingConfiguration: js.UndefOr[StreamingConfiguration]
  }

  object PutVoiceConnectorStreamingConfigurationResponse {
    @inline
    def apply(
        StreamingConfiguration: js.UndefOr[StreamingConfiguration] = js.undefined
    ): PutVoiceConnectorStreamingConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      StreamingConfiguration.foreach(__v => __obj.updateDynamic("StreamingConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutVoiceConnectorStreamingConfigurationResponse]
    }
  }

  @js.native
  trait PutVoiceConnectorTerminationCredentialsRequest extends js.Object {
    var VoiceConnectorId: NonEmptyString
    var Credentials: js.UndefOr[CredentialList]
  }

  object PutVoiceConnectorTerminationCredentialsRequest {
    @inline
    def apply(
        VoiceConnectorId: NonEmptyString,
        Credentials: js.UndefOr[CredentialList] = js.undefined
    ): PutVoiceConnectorTerminationCredentialsRequest = {
      val __obj = js.Dynamic.literal(
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )

      Credentials.foreach(__v => __obj.updateDynamic("Credentials")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutVoiceConnectorTerminationCredentialsRequest]
    }
  }

  @js.native
  trait PutVoiceConnectorTerminationRequest extends js.Object {
    var Termination: Termination
    var VoiceConnectorId: NonEmptyString
  }

  object PutVoiceConnectorTerminationRequest {
    @inline
    def apply(
        Termination: Termination,
        VoiceConnectorId: NonEmptyString
    ): PutVoiceConnectorTerminationRequest = {
      val __obj = js.Dynamic.literal(
        "Termination" -> Termination.asInstanceOf[js.Any],
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutVoiceConnectorTerminationRequest]
    }
  }

  @js.native
  trait PutVoiceConnectorTerminationResponse extends js.Object {
    var Termination: js.UndefOr[Termination]
  }

  object PutVoiceConnectorTerminationResponse {
    @inline
    def apply(
        Termination: js.UndefOr[Termination] = js.undefined
    ): PutVoiceConnectorTerminationResponse = {
      val __obj = js.Dynamic.literal()
      Termination.foreach(__v => __obj.updateDynamic("Termination")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutVoiceConnectorTerminationResponse]
    }
  }

  @js.native
  trait RestorePhoneNumberRequest extends js.Object {
    var PhoneNumberId: SensitiveNonEmptyString
  }

  object RestorePhoneNumberRequest {
    @inline
    def apply(
        PhoneNumberId: SensitiveNonEmptyString
    ): RestorePhoneNumberRequest = {
      val __obj = js.Dynamic.literal(
        "PhoneNumberId" -> PhoneNumberId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[RestorePhoneNumberRequest]
    }
  }

  @js.native
  trait RestorePhoneNumberResponse extends js.Object {
    var PhoneNumber: js.UndefOr[PhoneNumber]
  }

  object RestorePhoneNumberResponse {
    @inline
    def apply(
        PhoneNumber: js.UndefOr[PhoneNumber] = js.undefined
    ): RestorePhoneNumberResponse = {
      val __obj = js.Dynamic.literal()
      PhoneNumber.foreach(__v => __obj.updateDynamic("PhoneNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RestorePhoneNumberResponse]
    }
  }

  @js.native
  trait SearchAvailablePhoneNumbersRequest extends js.Object {
    var AreaCode: js.UndefOr[String]
    var City: js.UndefOr[String]
    var Country: js.UndefOr[Alpha2CountryCode]
    var MaxResults: js.UndefOr[PhoneNumberMaxResults]
    var NextToken: js.UndefOr[String]
    var PhoneNumberType: js.UndefOr[PhoneNumberType]
    var State: js.UndefOr[String]
    var TollFreePrefix: js.UndefOr[TollFreePrefix]
  }

  object SearchAvailablePhoneNumbersRequest {
    @inline
    def apply(
        AreaCode: js.UndefOr[String] = js.undefined,
        City: js.UndefOr[String] = js.undefined,
        Country: js.UndefOr[Alpha2CountryCode] = js.undefined,
        MaxResults: js.UndefOr[PhoneNumberMaxResults] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        PhoneNumberType: js.UndefOr[PhoneNumberType] = js.undefined,
        State: js.UndefOr[String] = js.undefined,
        TollFreePrefix: js.UndefOr[TollFreePrefix] = js.undefined
    ): SearchAvailablePhoneNumbersRequest = {
      val __obj = js.Dynamic.literal()
      AreaCode.foreach(__v => __obj.updateDynamic("AreaCode")(__v.asInstanceOf[js.Any]))
      City.foreach(__v => __obj.updateDynamic("City")(__v.asInstanceOf[js.Any]))
      Country.foreach(__v => __obj.updateDynamic("Country")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PhoneNumberType.foreach(__v => __obj.updateDynamic("PhoneNumberType")(__v.asInstanceOf[js.Any]))
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      TollFreePrefix.foreach(__v => __obj.updateDynamic("TollFreePrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchAvailablePhoneNumbersRequest]
    }
  }

  @js.native
  trait SearchAvailablePhoneNumbersResponse extends js.Object {
    var E164PhoneNumbers: js.UndefOr[E164PhoneNumberList]
    var NextToken: js.UndefOr[String]
  }

  object SearchAvailablePhoneNumbersResponse {
    @inline
    def apply(
        E164PhoneNumbers: js.UndefOr[E164PhoneNumberList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): SearchAvailablePhoneNumbersResponse = {
      val __obj = js.Dynamic.literal()
      E164PhoneNumbers.foreach(__v => __obj.updateDynamic("E164PhoneNumbers")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SearchAvailablePhoneNumbersResponse]
    }
  }

  @js.native
  trait SipMediaApplication extends js.Object {
    var AwsRegion: js.UndefOr[String]
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var Endpoints: js.UndefOr[SipMediaApplicationEndpointList]
    var Name: js.UndefOr[SipMediaApplicationName]
    var SipMediaApplicationId: js.UndefOr[NonEmptyString]
    var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp]
  }

  object SipMediaApplication {
    @inline
    def apply(
        AwsRegion: js.UndefOr[String] = js.undefined,
        CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        Endpoints: js.UndefOr[SipMediaApplicationEndpointList] = js.undefined,
        Name: js.UndefOr[SipMediaApplicationName] = js.undefined,
        SipMediaApplicationId: js.UndefOr[NonEmptyString] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
    ): SipMediaApplication = {
      val __obj = js.Dynamic.literal()
      AwsRegion.foreach(__v => __obj.updateDynamic("AwsRegion")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      Endpoints.foreach(__v => __obj.updateDynamic("Endpoints")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SipMediaApplicationId.foreach(__v => __obj.updateDynamic("SipMediaApplicationId")(__v.asInstanceOf[js.Any]))
      UpdatedTimestamp.foreach(__v => __obj.updateDynamic("UpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SipMediaApplication]
    }
  }

  @js.native
  trait SipMediaApplicationAlexaSkillConfiguration extends js.Object {
    var AlexaSkillIds: AlexaSkillIdList
    var AlexaSkillStatus: AlexaSkillStatus
  }

  object SipMediaApplicationAlexaSkillConfiguration {
    @inline
    def apply(
        AlexaSkillIds: AlexaSkillIdList,
        AlexaSkillStatus: AlexaSkillStatus
    ): SipMediaApplicationAlexaSkillConfiguration = {
      val __obj = js.Dynamic.literal(
        "AlexaSkillIds" -> AlexaSkillIds.asInstanceOf[js.Any],
        "AlexaSkillStatus" -> AlexaSkillStatus.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SipMediaApplicationAlexaSkillConfiguration]
    }
  }

  @js.native
  trait SipMediaApplicationCall extends js.Object {
    var TransactionId: js.UndefOr[GuidString]
  }

  object SipMediaApplicationCall {
    @inline
    def apply(
        TransactionId: js.UndefOr[GuidString] = js.undefined
    ): SipMediaApplicationCall = {
      val __obj = js.Dynamic.literal()
      TransactionId.foreach(__v => __obj.updateDynamic("TransactionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SipMediaApplicationCall]
    }
  }

  @js.native
  trait SipMediaApplicationEndpoint extends js.Object {
    var LambdaArn: js.UndefOr[FunctionArn]
  }

  object SipMediaApplicationEndpoint {
    @inline
    def apply(
        LambdaArn: js.UndefOr[FunctionArn] = js.undefined
    ): SipMediaApplicationEndpoint = {
      val __obj = js.Dynamic.literal()
      LambdaArn.foreach(__v => __obj.updateDynamic("LambdaArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SipMediaApplicationEndpoint]
    }
  }

  @js.native
  trait SipMediaApplicationLoggingConfiguration extends js.Object {
    var EnableSipMediaApplicationMessageLogs: js.UndefOr[Boolean]
  }

  object SipMediaApplicationLoggingConfiguration {
    @inline
    def apply(
        EnableSipMediaApplicationMessageLogs: js.UndefOr[Boolean] = js.undefined
    ): SipMediaApplicationLoggingConfiguration = {
      val __obj = js.Dynamic.literal()
      EnableSipMediaApplicationMessageLogs.foreach(__v => __obj.updateDynamic("EnableSipMediaApplicationMessageLogs")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SipMediaApplicationLoggingConfiguration]
    }
  }

  @js.native
  trait SipRule extends js.Object {
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var Disabled: js.UndefOr[Boolean]
    var Name: js.UndefOr[SipRuleName]
    var SipRuleId: js.UndefOr[NonEmptyString]
    var TargetApplications: js.UndefOr[SipRuleTargetApplicationList]
    var TriggerType: js.UndefOr[SipRuleTriggerType]
    var TriggerValue: js.UndefOr[NonEmptyString]
    var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp]
  }

  object SipRule {
    @inline
    def apply(
        CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        Disabled: js.UndefOr[Boolean] = js.undefined,
        Name: js.UndefOr[SipRuleName] = js.undefined,
        SipRuleId: js.UndefOr[NonEmptyString] = js.undefined,
        TargetApplications: js.UndefOr[SipRuleTargetApplicationList] = js.undefined,
        TriggerType: js.UndefOr[SipRuleTriggerType] = js.undefined,
        TriggerValue: js.UndefOr[NonEmptyString] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
    ): SipRule = {
      val __obj = js.Dynamic.literal()
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      Disabled.foreach(__v => __obj.updateDynamic("Disabled")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      SipRuleId.foreach(__v => __obj.updateDynamic("SipRuleId")(__v.asInstanceOf[js.Any]))
      TargetApplications.foreach(__v => __obj.updateDynamic("TargetApplications")(__v.asInstanceOf[js.Any]))
      TriggerType.foreach(__v => __obj.updateDynamic("TriggerType")(__v.asInstanceOf[js.Any]))
      TriggerValue.foreach(__v => __obj.updateDynamic("TriggerValue")(__v.asInstanceOf[js.Any]))
      UpdatedTimestamp.foreach(__v => __obj.updateDynamic("UpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SipRule]
    }
  }

  @js.native
  trait SipRuleTargetApplication extends js.Object {
    var AwsRegion: js.UndefOr[String]
    var Priority: js.UndefOr[SipApplicationPriority]
    var SipMediaApplicationId: js.UndefOr[NonEmptyString]
  }

  object SipRuleTargetApplication {
    @inline
    def apply(
        AwsRegion: js.UndefOr[String] = js.undefined,
        Priority: js.UndefOr[SipApplicationPriority] = js.undefined,
        SipMediaApplicationId: js.UndefOr[NonEmptyString] = js.undefined
    ): SipRuleTargetApplication = {
      val __obj = js.Dynamic.literal()
      AwsRegion.foreach(__v => __obj.updateDynamic("AwsRegion")(__v.asInstanceOf[js.Any]))
      Priority.foreach(__v => __obj.updateDynamic("Priority")(__v.asInstanceOf[js.Any]))
      SipMediaApplicationId.foreach(__v => __obj.updateDynamic("SipMediaApplicationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SipRuleTargetApplication]
    }
  }

  @js.native
  trait StreamingConfiguration extends js.Object {
    var DataRetentionInHours: DataRetentionInHours
    var Disabled: Boolean
    var StreamingNotificationTargets: js.UndefOr[StreamingNotificationTargetList]
  }

  object StreamingConfiguration {
    @inline
    def apply(
        DataRetentionInHours: DataRetentionInHours,
        Disabled: Boolean,
        StreamingNotificationTargets: js.UndefOr[StreamingNotificationTargetList] = js.undefined
    ): StreamingConfiguration = {
      val __obj = js.Dynamic.literal(
        "DataRetentionInHours" -> DataRetentionInHours.asInstanceOf[js.Any],
        "Disabled" -> Disabled.asInstanceOf[js.Any]
      )

      StreamingNotificationTargets.foreach(__v => __obj.updateDynamic("StreamingNotificationTargets")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamingConfiguration]
    }
  }

  @js.native
  trait StreamingNotificationTarget extends js.Object {
    var NotificationTarget: js.UndefOr[NotificationTarget]
  }

  object StreamingNotificationTarget {
    @inline
    def apply(
        NotificationTarget: js.UndefOr[NotificationTarget] = js.undefined
    ): StreamingNotificationTarget = {
      val __obj = js.Dynamic.literal()
      NotificationTarget.foreach(__v => __obj.updateDynamic("NotificationTarget")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamingNotificationTarget]
    }
  }

  @js.native
  trait Termination extends js.Object {
    var CallingRegions: js.UndefOr[CallingRegionList]
    var CidrAllowedList: js.UndefOr[StringList]
    var CpsLimit: js.UndefOr[CpsLimit]
    var DefaultPhoneNumber: js.UndefOr[E164PhoneNumber]
    var Disabled: js.UndefOr[Boolean]
  }

  object Termination {
    @inline
    def apply(
        CallingRegions: js.UndefOr[CallingRegionList] = js.undefined,
        CidrAllowedList: js.UndefOr[StringList] = js.undefined,
        CpsLimit: js.UndefOr[CpsLimit] = js.undefined,
        DefaultPhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined,
        Disabled: js.UndefOr[Boolean] = js.undefined
    ): Termination = {
      val __obj = js.Dynamic.literal()
      CallingRegions.foreach(__v => __obj.updateDynamic("CallingRegions")(__v.asInstanceOf[js.Any]))
      CidrAllowedList.foreach(__v => __obj.updateDynamic("CidrAllowedList")(__v.asInstanceOf[js.Any]))
      CpsLimit.foreach(__v => __obj.updateDynamic("CpsLimit")(__v.asInstanceOf[js.Any]))
      DefaultPhoneNumber.foreach(__v => __obj.updateDynamic("DefaultPhoneNumber")(__v.asInstanceOf[js.Any]))
      Disabled.foreach(__v => __obj.updateDynamic("Disabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Termination]
    }
  }

  @js.native
  trait TerminationHealth extends js.Object {
    var Source: js.UndefOr[String]
    var Timestamp: js.UndefOr[Iso8601Timestamp]
  }

  object TerminationHealth {
    @inline
    def apply(
        Source: js.UndefOr[String] = js.undefined,
        Timestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
    ): TerminationHealth = {
      val __obj = js.Dynamic.literal()
      Source.foreach(__v => __obj.updateDynamic("Source")(__v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TerminationHealth]
    }
  }

  @js.native
  trait UpdateGlobalSettingsRequest extends js.Object {
    var VoiceConnector: js.UndefOr[VoiceConnectorSettings]
  }

  object UpdateGlobalSettingsRequest {
    @inline
    def apply(
        VoiceConnector: js.UndefOr[VoiceConnectorSettings] = js.undefined
    ): UpdateGlobalSettingsRequest = {
      val __obj = js.Dynamic.literal()
      VoiceConnector.foreach(__v => __obj.updateDynamic("VoiceConnector")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGlobalSettingsRequest]
    }
  }

  @js.native
  trait UpdatePhoneNumberRequest extends js.Object {
    var PhoneNumberId: SensitiveNonEmptyString
    var CallingName: js.UndefOr[CallingName]
    var ProductType: js.UndefOr[PhoneNumberProductType]
  }

  object UpdatePhoneNumberRequest {
    @inline
    def apply(
        PhoneNumberId: SensitiveNonEmptyString,
        CallingName: js.UndefOr[CallingName] = js.undefined,
        ProductType: js.UndefOr[PhoneNumberProductType] = js.undefined
    ): UpdatePhoneNumberRequest = {
      val __obj = js.Dynamic.literal(
        "PhoneNumberId" -> PhoneNumberId.asInstanceOf[js.Any]
      )

      CallingName.foreach(__v => __obj.updateDynamic("CallingName")(__v.asInstanceOf[js.Any]))
      ProductType.foreach(__v => __obj.updateDynamic("ProductType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePhoneNumberRequest]
    }
  }

  @js.native
  trait UpdatePhoneNumberRequestItem extends js.Object {
    var PhoneNumberId: SensitiveNonEmptyString
    var CallingName: js.UndefOr[CallingName]
    var ProductType: js.UndefOr[PhoneNumberProductType]
  }

  object UpdatePhoneNumberRequestItem {
    @inline
    def apply(
        PhoneNumberId: SensitiveNonEmptyString,
        CallingName: js.UndefOr[CallingName] = js.undefined,
        ProductType: js.UndefOr[PhoneNumberProductType] = js.undefined
    ): UpdatePhoneNumberRequestItem = {
      val __obj = js.Dynamic.literal(
        "PhoneNumberId" -> PhoneNumberId.asInstanceOf[js.Any]
      )

      CallingName.foreach(__v => __obj.updateDynamic("CallingName")(__v.asInstanceOf[js.Any]))
      ProductType.foreach(__v => __obj.updateDynamic("ProductType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePhoneNumberRequestItem]
    }
  }

  @js.native
  trait UpdatePhoneNumberResponse extends js.Object {
    var PhoneNumber: js.UndefOr[PhoneNumber]
  }

  object UpdatePhoneNumberResponse {
    @inline
    def apply(
        PhoneNumber: js.UndefOr[PhoneNumber] = js.undefined
    ): UpdatePhoneNumberResponse = {
      val __obj = js.Dynamic.literal()
      PhoneNumber.foreach(__v => __obj.updateDynamic("PhoneNumber")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdatePhoneNumberResponse]
    }
  }

  @js.native
  trait UpdatePhoneNumberSettingsRequest extends js.Object {
    var CallingName: CallingName
  }

  object UpdatePhoneNumberSettingsRequest {
    @inline
    def apply(
        CallingName: CallingName
    ): UpdatePhoneNumberSettingsRequest = {
      val __obj = js.Dynamic.literal(
        "CallingName" -> CallingName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdatePhoneNumberSettingsRequest]
    }
  }

  @js.native
  trait UpdateProxySessionRequest extends js.Object {
    var Capabilities: CapabilityList
    var ProxySessionId: NonEmptyString128
    var VoiceConnectorId: NonEmptyString128
    var ExpiryMinutes: js.UndefOr[PositiveInteger]
  }

  object UpdateProxySessionRequest {
    @inline
    def apply(
        Capabilities: CapabilityList,
        ProxySessionId: NonEmptyString128,
        VoiceConnectorId: NonEmptyString128,
        ExpiryMinutes: js.UndefOr[PositiveInteger] = js.undefined
    ): UpdateProxySessionRequest = {
      val __obj = js.Dynamic.literal(
        "Capabilities" -> Capabilities.asInstanceOf[js.Any],
        "ProxySessionId" -> ProxySessionId.asInstanceOf[js.Any],
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )

      ExpiryMinutes.foreach(__v => __obj.updateDynamic("ExpiryMinutes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProxySessionRequest]
    }
  }

  @js.native
  trait UpdateProxySessionResponse extends js.Object {
    var ProxySession: js.UndefOr[ProxySession]
  }

  object UpdateProxySessionResponse {
    @inline
    def apply(
        ProxySession: js.UndefOr[ProxySession] = js.undefined
    ): UpdateProxySessionResponse = {
      val __obj = js.Dynamic.literal()
      ProxySession.foreach(__v => __obj.updateDynamic("ProxySession")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateProxySessionResponse]
    }
  }

  @js.native
  trait UpdateSipMediaApplicationCallRequest extends js.Object {
    var Arguments: SMAUpdateCallArgumentsMap
    var SipMediaApplicationId: NonEmptyString
    var TransactionId: NonEmptyString
  }

  object UpdateSipMediaApplicationCallRequest {
    @inline
    def apply(
        Arguments: SMAUpdateCallArgumentsMap,
        SipMediaApplicationId: NonEmptyString,
        TransactionId: NonEmptyString
    ): UpdateSipMediaApplicationCallRequest = {
      val __obj = js.Dynamic.literal(
        "Arguments" -> Arguments.asInstanceOf[js.Any],
        "SipMediaApplicationId" -> SipMediaApplicationId.asInstanceOf[js.Any],
        "TransactionId" -> TransactionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateSipMediaApplicationCallRequest]
    }
  }

  @js.native
  trait UpdateSipMediaApplicationCallResponse extends js.Object {
    var SipMediaApplicationCall: js.UndefOr[SipMediaApplicationCall]
  }

  object UpdateSipMediaApplicationCallResponse {
    @inline
    def apply(
        SipMediaApplicationCall: js.UndefOr[SipMediaApplicationCall] = js.undefined
    ): UpdateSipMediaApplicationCallResponse = {
      val __obj = js.Dynamic.literal()
      SipMediaApplicationCall.foreach(__v => __obj.updateDynamic("SipMediaApplicationCall")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSipMediaApplicationCallResponse]
    }
  }

  @js.native
  trait UpdateSipMediaApplicationRequest extends js.Object {
    var SipMediaApplicationId: NonEmptyString
    var Endpoints: js.UndefOr[SipMediaApplicationEndpointList]
    var Name: js.UndefOr[SipMediaApplicationName]
  }

  object UpdateSipMediaApplicationRequest {
    @inline
    def apply(
        SipMediaApplicationId: NonEmptyString,
        Endpoints: js.UndefOr[SipMediaApplicationEndpointList] = js.undefined,
        Name: js.UndefOr[SipMediaApplicationName] = js.undefined
    ): UpdateSipMediaApplicationRequest = {
      val __obj = js.Dynamic.literal(
        "SipMediaApplicationId" -> SipMediaApplicationId.asInstanceOf[js.Any]
      )

      Endpoints.foreach(__v => __obj.updateDynamic("Endpoints")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSipMediaApplicationRequest]
    }
  }

  @js.native
  trait UpdateSipMediaApplicationResponse extends js.Object {
    var SipMediaApplication: js.UndefOr[SipMediaApplication]
  }

  object UpdateSipMediaApplicationResponse {
    @inline
    def apply(
        SipMediaApplication: js.UndefOr[SipMediaApplication] = js.undefined
    ): UpdateSipMediaApplicationResponse = {
      val __obj = js.Dynamic.literal()
      SipMediaApplication.foreach(__v => __obj.updateDynamic("SipMediaApplication")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSipMediaApplicationResponse]
    }
  }

  @js.native
  trait UpdateSipRuleRequest extends js.Object {
    var Name: SipRuleName
    var SipRuleId: NonEmptyString
    var Disabled: js.UndefOr[NullableBoolean]
    var TargetApplications: js.UndefOr[SipRuleTargetApplicationList]
  }

  object UpdateSipRuleRequest {
    @inline
    def apply(
        Name: SipRuleName,
        SipRuleId: NonEmptyString,
        Disabled: js.UndefOr[NullableBoolean] = js.undefined,
        TargetApplications: js.UndefOr[SipRuleTargetApplicationList] = js.undefined
    ): UpdateSipRuleRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "SipRuleId" -> SipRuleId.asInstanceOf[js.Any]
      )

      Disabled.foreach(__v => __obj.updateDynamic("Disabled")(__v.asInstanceOf[js.Any]))
      TargetApplications.foreach(__v => __obj.updateDynamic("TargetApplications")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSipRuleRequest]
    }
  }

  @js.native
  trait UpdateSipRuleResponse extends js.Object {
    var SipRule: js.UndefOr[SipRule]
  }

  object UpdateSipRuleResponse {
    @inline
    def apply(
        SipRule: js.UndefOr[SipRule] = js.undefined
    ): UpdateSipRuleResponse = {
      val __obj = js.Dynamic.literal()
      SipRule.foreach(__v => __obj.updateDynamic("SipRule")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSipRuleResponse]
    }
  }

  @js.native
  trait UpdateVoiceConnectorGroupRequest extends js.Object {
    var Name: VoiceConnectorGroupName
    var VoiceConnectorGroupId: NonEmptyString
    var VoiceConnectorItems: VoiceConnectorItemList
  }

  object UpdateVoiceConnectorGroupRequest {
    @inline
    def apply(
        Name: VoiceConnectorGroupName,
        VoiceConnectorGroupId: NonEmptyString,
        VoiceConnectorItems: VoiceConnectorItemList
    ): UpdateVoiceConnectorGroupRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "VoiceConnectorGroupId" -> VoiceConnectorGroupId.asInstanceOf[js.Any],
        "VoiceConnectorItems" -> VoiceConnectorItems.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateVoiceConnectorGroupRequest]
    }
  }

  @js.native
  trait UpdateVoiceConnectorGroupResponse extends js.Object {
    var VoiceConnectorGroup: js.UndefOr[VoiceConnectorGroup]
  }

  object UpdateVoiceConnectorGroupResponse {
    @inline
    def apply(
        VoiceConnectorGroup: js.UndefOr[VoiceConnectorGroup] = js.undefined
    ): UpdateVoiceConnectorGroupResponse = {
      val __obj = js.Dynamic.literal()
      VoiceConnectorGroup.foreach(__v => __obj.updateDynamic("VoiceConnectorGroup")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVoiceConnectorGroupResponse]
    }
  }

  @js.native
  trait UpdateVoiceConnectorRequest extends js.Object {
    var Name: VoiceConnectorName
    var RequireEncryption: Boolean
    var VoiceConnectorId: NonEmptyString
  }

  object UpdateVoiceConnectorRequest {
    @inline
    def apply(
        Name: VoiceConnectorName,
        RequireEncryption: Boolean,
        VoiceConnectorId: NonEmptyString
    ): UpdateVoiceConnectorRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "RequireEncryption" -> RequireEncryption.asInstanceOf[js.Any],
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateVoiceConnectorRequest]
    }
  }

  @js.native
  trait UpdateVoiceConnectorResponse extends js.Object {
    var VoiceConnector: js.UndefOr[VoiceConnector]
  }

  object UpdateVoiceConnectorResponse {
    @inline
    def apply(
        VoiceConnector: js.UndefOr[VoiceConnector] = js.undefined
    ): UpdateVoiceConnectorResponse = {
      val __obj = js.Dynamic.literal()
      VoiceConnector.foreach(__v => __obj.updateDynamic("VoiceConnector")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVoiceConnectorResponse]
    }
  }

  @js.native
  trait ValidateE911AddressRequest extends js.Object {
    var AwsAccountId: NonEmptyString
    var City: SensitiveNonEmptyString
    var Country: SensitiveNonEmptyString
    var PostalCode: SensitiveNonEmptyString
    var State: SensitiveNonEmptyString
    var StreetInfo: SensitiveNonEmptyString
    var StreetNumber: SensitiveNonEmptyString
  }

  object ValidateE911AddressRequest {
    @inline
    def apply(
        AwsAccountId: NonEmptyString,
        City: SensitiveNonEmptyString,
        Country: SensitiveNonEmptyString,
        PostalCode: SensitiveNonEmptyString,
        State: SensitiveNonEmptyString,
        StreetInfo: SensitiveNonEmptyString,
        StreetNumber: SensitiveNonEmptyString
    ): ValidateE911AddressRequest = {
      val __obj = js.Dynamic.literal(
        "AwsAccountId" -> AwsAccountId.asInstanceOf[js.Any],
        "City" -> City.asInstanceOf[js.Any],
        "Country" -> Country.asInstanceOf[js.Any],
        "PostalCode" -> PostalCode.asInstanceOf[js.Any],
        "State" -> State.asInstanceOf[js.Any],
        "StreetInfo" -> StreetInfo.asInstanceOf[js.Any],
        "StreetNumber" -> StreetNumber.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ValidateE911AddressRequest]
    }
  }

  @js.native
  trait ValidateE911AddressResponse extends js.Object {
    var Address: js.UndefOr[Address]
    var AddressExternalId: js.UndefOr[String]
    var CandidateAddressList: js.UndefOr[CandidateAddressList]
    var ValidationResult: js.UndefOr[ValidationResult]
  }

  object ValidateE911AddressResponse {
    @inline
    def apply(
        Address: js.UndefOr[Address] = js.undefined,
        AddressExternalId: js.UndefOr[String] = js.undefined,
        CandidateAddressList: js.UndefOr[CandidateAddressList] = js.undefined,
        ValidationResult: js.UndefOr[ValidationResult] = js.undefined
    ): ValidateE911AddressResponse = {
      val __obj = js.Dynamic.literal()
      Address.foreach(__v => __obj.updateDynamic("Address")(__v.asInstanceOf[js.Any]))
      AddressExternalId.foreach(__v => __obj.updateDynamic("AddressExternalId")(__v.asInstanceOf[js.Any]))
      CandidateAddressList.foreach(__v => __obj.updateDynamic("CandidateAddressList")(__v.asInstanceOf[js.Any]))
      ValidationResult.foreach(__v => __obj.updateDynamic("ValidationResult")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ValidateE911AddressResponse]
    }
  }

  @js.native
  trait VoiceConnector extends js.Object {
    var AwsRegion: js.UndefOr[VoiceConnectorAwsRegion]
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var Name: js.UndefOr[VoiceConnectorName]
    var OutboundHostName: js.UndefOr[String]
    var RequireEncryption: js.UndefOr[Boolean]
    var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var VoiceConnectorArn: js.UndefOr[NonEmptyString]
    var VoiceConnectorId: js.UndefOr[NonEmptyString]
  }

  object VoiceConnector {
    @inline
    def apply(
        AwsRegion: js.UndefOr[VoiceConnectorAwsRegion] = js.undefined,
        CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        Name: js.UndefOr[VoiceConnectorName] = js.undefined,
        OutboundHostName: js.UndefOr[String] = js.undefined,
        RequireEncryption: js.UndefOr[Boolean] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        VoiceConnectorArn: js.UndefOr[NonEmptyString] = js.undefined,
        VoiceConnectorId: js.UndefOr[NonEmptyString] = js.undefined
    ): VoiceConnector = {
      val __obj = js.Dynamic.literal()
      AwsRegion.foreach(__v => __obj.updateDynamic("AwsRegion")(__v.asInstanceOf[js.Any]))
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      OutboundHostName.foreach(__v => __obj.updateDynamic("OutboundHostName")(__v.asInstanceOf[js.Any]))
      RequireEncryption.foreach(__v => __obj.updateDynamic("RequireEncryption")(__v.asInstanceOf[js.Any]))
      UpdatedTimestamp.foreach(__v => __obj.updateDynamic("UpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      VoiceConnectorArn.foreach(__v => __obj.updateDynamic("VoiceConnectorArn")(__v.asInstanceOf[js.Any]))
      VoiceConnectorId.foreach(__v => __obj.updateDynamic("VoiceConnectorId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VoiceConnector]
    }
  }

  @js.native
  trait VoiceConnectorGroup extends js.Object {
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var Name: js.UndefOr[VoiceConnectorGroupName]
    var UpdatedTimestamp: js.UndefOr[Iso8601Timestamp]
    var VoiceConnectorGroupArn: js.UndefOr[NonEmptyString]
    var VoiceConnectorGroupId: js.UndefOr[NonEmptyString]
    var VoiceConnectorItems: js.UndefOr[VoiceConnectorItemList]
  }

  object VoiceConnectorGroup {
    @inline
    def apply(
        CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        Name: js.UndefOr[VoiceConnectorGroupName] = js.undefined,
        UpdatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined,
        VoiceConnectorGroupArn: js.UndefOr[NonEmptyString] = js.undefined,
        VoiceConnectorGroupId: js.UndefOr[NonEmptyString] = js.undefined,
        VoiceConnectorItems: js.UndefOr[VoiceConnectorItemList] = js.undefined
    ): VoiceConnectorGroup = {
      val __obj = js.Dynamic.literal()
      CreatedTimestamp.foreach(__v => __obj.updateDynamic("CreatedTimestamp")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      UpdatedTimestamp.foreach(__v => __obj.updateDynamic("UpdatedTimestamp")(__v.asInstanceOf[js.Any]))
      VoiceConnectorGroupArn.foreach(__v => __obj.updateDynamic("VoiceConnectorGroupArn")(__v.asInstanceOf[js.Any]))
      VoiceConnectorGroupId.foreach(__v => __obj.updateDynamic("VoiceConnectorGroupId")(__v.asInstanceOf[js.Any]))
      VoiceConnectorItems.foreach(__v => __obj.updateDynamic("VoiceConnectorItems")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VoiceConnectorGroup]
    }
  }

  @js.native
  trait VoiceConnectorItem extends js.Object {
    var Priority: VoiceConnectorItemPriority
    var VoiceConnectorId: NonEmptyString
  }

  object VoiceConnectorItem {
    @inline
    def apply(
        Priority: VoiceConnectorItemPriority,
        VoiceConnectorId: NonEmptyString
    ): VoiceConnectorItem = {
      val __obj = js.Dynamic.literal(
        "Priority" -> Priority.asInstanceOf[js.Any],
        "VoiceConnectorId" -> VoiceConnectorId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VoiceConnectorItem]
    }
  }

  @js.native
  trait VoiceConnectorSettings extends js.Object {
    var CdrBucket: js.UndefOr[String]
  }

  object VoiceConnectorSettings {
    @inline
    def apply(
        CdrBucket: js.UndefOr[String] = js.undefined
    ): VoiceConnectorSettings = {
      val __obj = js.Dynamic.literal()
      CdrBucket.foreach(__v => __obj.updateDynamic("CdrBucket")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VoiceConnectorSettings]
    }
  }
}
