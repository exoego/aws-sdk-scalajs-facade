package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object iotwireless {
  type AccountLinked = Boolean
  type AckModeRetryDurationSecs = Int
  type AddGwMetadata = Boolean
  type AmazonId = String
  type AmazonResourceName = String
  type AppEui = String
  type AppKey = String
  type AppSKey = String
  type AppServerPrivateKey = String
  type Applications = js.Array[ApplicationConfig]
  type AssistPosition = js.Array[Coordinate]
  type AutoCreateTasks = Boolean
  type BCCH = Int
  type BSIC = Int
  type BaseLat = Float
  type BaseLng = Float
  type BaseStationId = Int
  type BeaconingDataRate = Int
  type BeaconingFrequencies = js.Array[BeaconingFrequency]
  type BeaconingFrequency = Int
  type CaptureTimeAccuracy = Float
  type CdmaChannel = Int
  type CdmaList = js.Array[CdmaObj]
  type CdmaNmrList = js.Array[CdmaNmrObj]
  type CellParams = Int
  type CertificatePEM = String
  type CertificateValue = String
  type ChannelMask = String
  type ClassBTimeout = Int
  type ClassCTimeout = Int
  type ClientRequestToken = String
  type Coordinate = Float
  type Crc = Double
  type CreatedAt = js.Date
  type CreationDate = js.Date
  type Description = String
  type DestinationArn = String
  type DestinationList = js.Array[Destinations]
  type DestinationName = String
  type DevAddr = String
  type DevEui = String
  type DevStatusReqFreq = Int
  type DeviceCertificateList = js.Array[CertificateList]
  type DeviceProfileArn = String
  type DeviceProfileId = String
  type DeviceProfileList = js.Array[DeviceProfile]
  type DeviceProfileName = String
  type DlBucketSize = Int
  type DlDr = Int
  type DlFreq = Int
  type DlRate = Int
  type DlRatePolicy = String
  type DownlinkFrequency = Int
  type DownlinkQueueMessagesList = js.Array[DownlinkQueueMessage]
  type DrMax = Int
  type DrMaxBox = Int
  type DrMin = Int
  type DrMinBox = Int
  type EARFCN = Int
  type EndPoint = String
  type EutranCid = Int
  type EventConfigurationsList = js.Array[EventConfigurationItem]
  type Expression = String
  type FCntStart = Int
  type FNwkSIntKey = String
  type FPort = Int
  type FactoryPresetFreqsList = js.Array[PresetFreq]
  type Fingerprint = String
  type FirmwareUpdateImage = String
  type FirmwareUpdateRole = String
  type FuotaTaskArn = String
  type FuotaTaskId = String
  type FuotaTaskList = js.Array[FuotaTask]
  type FuotaTaskName = String
  type GPST = Float
  type GatewayEui = String
  type GatewayList = js.Array[GatewayListItem]
  type GenAppKey = String
  type GeoJsonPayload = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type GeranCid = Int
  type GnssNav = String
  type GsmList = js.Array[GsmObj]
  type GsmNmrList = js.Array[GsmNmrObj]
  type GsmTimingAdvance = Int
  type HorizontalAccuracy = Float
  type HrAllowed = Boolean
  type IPAddress = String
  type ISODateTimeString = String
  type Identifier = String
  type IotCertificateId = String
  type JoinEui = String
  type JoinEuiFilters = js.Array[JoinEuiRange]
  type JoinEuiRange = js.Array[JoinEui]
  type LAC = Int
  type LoRaWANGatewayMetadataList = js.Array[LoRaWANGatewayMetadata]
  type LteList = js.Array[LteObj]
  type LteNmrList = js.Array[LteNmrObj]
  type LteTimingAdvance = Int
  type MCC = Int
  type MNC = Int
  type MacAddress = String
  type MacVersion = String
  type MaxDutyCycle = Int
  type MaxEirp = Int
  type MaxResults = Int
  type McGroupId = Int
  type MessageId = String
  type MinGwDiversity = Int
  type Model = String
  type MulticastDeviceStatus = String
  type MulticastGroupArn = String
  type MulticastGroupId = String
  type MulticastGroupList = js.Array[MulticastGroup]
  type MulticastGroupListByFuotaTask = js.Array[MulticastGroupByFuotaTask]
  type MulticastGroupMessageId = String
  type MulticastGroupName = String
  type MulticastGroupStatus = String
  type NRCapable = Boolean
  type NetId = String
  type NetIdFilters = js.Array[NetId]
  type NetworkAnalyzerConfigurationArn = String
  type NetworkAnalyzerConfigurationList = js.Array[NetworkAnalyzerConfigurations]
  type NetworkAnalyzerConfigurationName = String
  type NetworkId = Int
  type NextToken = String
  type NumberOfDevicesInGroup = Int
  type NumberOfDevicesRequested = Int
  type NwkGeoLoc = Boolean
  type NwkKey = String
  type NwkSEncKey = String
  type NwkSKey = String
  type PCI = Int
  type PSC = Int
  type PackageVersion = String
  type PartnerAccountArn = String
  type PartnerAccountId = String
  type PathLoss = Int
  type PayloadData = String
  type PilotPower = Int
  type PingSlotDr = Int
  type PingSlotFreq = Int
  type PingSlotPeriod = Int
  type PnOffset = Int
  type PositionConfigurationList = js.Array[PositionConfigurationItem]
  type PositionCoordinate = js.Array[PositionCoordinateValue]
  type PositionCoordinateValue = Float
  type PositionResourceIdentifier = String
  type PositionSolverVersion = String
  type PrAllowed = Boolean
  type PresetFreq = Int
  type QueryString = String
  type RSCP = Int
  type RSRP = Int
  type RSRQ = Float
  type RSS = Int
  type RaAllowed = Boolean
  type RegParamsRevision = String
  type RegistrationZone = Int
  type ReportDevStatusBattery = Boolean
  type ReportDevStatusMargin = Boolean
  type ResourceIdentifier = String
  type ResourceType = String
  type Result = String
  type RfRegion = String
  type RoleArn = String
  type RxDataRate2 = Int
  type RxDelay1 = Int
  type RxDrOffset1 = Int
  type RxFreq2 = Int
  type RxLevel = Int
  type SNwkSIntKey = String
  type Seq = Int
  type ServiceProfileArn = String
  type ServiceProfileId = String
  type ServiceProfileList = js.Array[ServiceProfile]
  type ServiceProfileName = String
  type SessionStartTimeTimestamp = js.Date
  type SessionTimeout = Int
  type SidewalkAccountList = js.Array[SidewalkAccountInfoWithFingerprint]
  type SidewalkId = String
  type SidewalkManufacturingSn = String
  type StartTime = js.Date
  type Station = String
  type SubBand = Int
  type SubBands = js.Array[SubBand]
  type Supports32BitFCnt = Boolean
  type SupportsClassB = Boolean
  type SupportsClassC = Boolean
  type SupportsJoin = Boolean
  type SystemId = Int
  type TAC = Int
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type TargetPer = Int
  type TdscdmaList = js.Array[TdscdmaObj]
  type TdscdmaNmrList = js.Array[TdscdmaNmrObj]
  type TdscdmaTimingAdvance = Int
  type ThingArn = String
  type ThingName = String
  type TransmissionInterval = Int
  type TransmitMode = Int
  type UARFCN = Int
  type UARFCNDL = Int
  type UlBucketSize = Int
  type UlRate = Int
  type UlRatePolicy = String
  type UpdateDataSource = String
  type UpdateSignature = String
  type Use2DSolver = Boolean
  type UtranCid = Int
  type VerticalAccuracy = Float
  type WcdmaList = js.Array[WcdmaObj]
  type WcdmaNmrList = js.Array[WcdmaNmrObj]
  type WiFiAccessPoints = js.Array[WiFiAccessPoint]
  type WirelessDeviceArn = String
  type WirelessDeviceEventLogOptionList = js.Array[WirelessDeviceEventLogOption]
  type WirelessDeviceId = String
  type WirelessDeviceList = js.Array[WirelessDeviceId]
  type WirelessDeviceLogOptionList = js.Array[WirelessDeviceLogOption]
  type WirelessDeviceName = String
  type WirelessDeviceStatisticsList = js.Array[WirelessDeviceStatistics]
  type WirelessGatewayArn = String
  type WirelessGatewayEventLogOptionList = js.Array[WirelessGatewayEventLogOption]
  type WirelessGatewayId = String
  type WirelessGatewayList = js.Array[WirelessGatewayId]
  type WirelessGatewayLogOptionList = js.Array[WirelessGatewayLogOption]
  type WirelessGatewayName = String
  type WirelessGatewayStatisticsList = js.Array[WirelessGatewayStatistics]
  type WirelessGatewayTaskDefinitionArn = String
  type WirelessGatewayTaskDefinitionId = String
  type WirelessGatewayTaskDefinitionList = js.Array[UpdateWirelessGatewayTaskEntry]
  type WirelessGatewayTaskName = String

  final class IoTWirelessOps(private val service: IoTWireless) extends AnyVal {

    @inline def associateAwsAccountWithPartnerAccountFuture(params: AssociateAwsAccountWithPartnerAccountRequest): Future[AssociateAwsAccountWithPartnerAccountResponse] = service.associateAwsAccountWithPartnerAccount(params).promise().toFuture
    @inline def associateMulticastGroupWithFuotaTaskFuture(params: AssociateMulticastGroupWithFuotaTaskRequest): Future[AssociateMulticastGroupWithFuotaTaskResponse] = service.associateMulticastGroupWithFuotaTask(params).promise().toFuture
    @inline def associateWirelessDeviceWithFuotaTaskFuture(params: AssociateWirelessDeviceWithFuotaTaskRequest): Future[AssociateWirelessDeviceWithFuotaTaskResponse] = service.associateWirelessDeviceWithFuotaTask(params).promise().toFuture
    @inline def associateWirelessDeviceWithMulticastGroupFuture(params: AssociateWirelessDeviceWithMulticastGroupRequest): Future[AssociateWirelessDeviceWithMulticastGroupResponse] = service.associateWirelessDeviceWithMulticastGroup(params).promise().toFuture
    @inline def associateWirelessDeviceWithThingFuture(params: AssociateWirelessDeviceWithThingRequest): Future[AssociateWirelessDeviceWithThingResponse] = service.associateWirelessDeviceWithThing(params).promise().toFuture
    @inline def associateWirelessGatewayWithCertificateFuture(params: AssociateWirelessGatewayWithCertificateRequest): Future[AssociateWirelessGatewayWithCertificateResponse] = service.associateWirelessGatewayWithCertificate(params).promise().toFuture
    @inline def associateWirelessGatewayWithThingFuture(params: AssociateWirelessGatewayWithThingRequest): Future[AssociateWirelessGatewayWithThingResponse] = service.associateWirelessGatewayWithThing(params).promise().toFuture
    @inline def cancelMulticastGroupSessionFuture(params: CancelMulticastGroupSessionRequest): Future[CancelMulticastGroupSessionResponse] = service.cancelMulticastGroupSession(params).promise().toFuture
    @inline def createDestinationFuture(params: CreateDestinationRequest): Future[CreateDestinationResponse] = service.createDestination(params).promise().toFuture
    @inline def createDeviceProfileFuture(params: CreateDeviceProfileRequest): Future[CreateDeviceProfileResponse] = service.createDeviceProfile(params).promise().toFuture
    @inline def createFuotaTaskFuture(params: CreateFuotaTaskRequest): Future[CreateFuotaTaskResponse] = service.createFuotaTask(params).promise().toFuture
    @inline def createMulticastGroupFuture(params: CreateMulticastGroupRequest): Future[CreateMulticastGroupResponse] = service.createMulticastGroup(params).promise().toFuture
    @inline def createNetworkAnalyzerConfigurationFuture(params: CreateNetworkAnalyzerConfigurationRequest): Future[CreateNetworkAnalyzerConfigurationResponse] = service.createNetworkAnalyzerConfiguration(params).promise().toFuture
    @inline def createServiceProfileFuture(params: CreateServiceProfileRequest): Future[CreateServiceProfileResponse] = service.createServiceProfile(params).promise().toFuture
    @inline def createWirelessDeviceFuture(params: CreateWirelessDeviceRequest): Future[CreateWirelessDeviceResponse] = service.createWirelessDevice(params).promise().toFuture
    @inline def createWirelessGatewayFuture(params: CreateWirelessGatewayRequest): Future[CreateWirelessGatewayResponse] = service.createWirelessGateway(params).promise().toFuture
    @inline def createWirelessGatewayTaskDefinitionFuture(params: CreateWirelessGatewayTaskDefinitionRequest): Future[CreateWirelessGatewayTaskDefinitionResponse] = service.createWirelessGatewayTaskDefinition(params).promise().toFuture
    @inline def createWirelessGatewayTaskFuture(params: CreateWirelessGatewayTaskRequest): Future[CreateWirelessGatewayTaskResponse] = service.createWirelessGatewayTask(params).promise().toFuture
    @inline def deleteDestinationFuture(params: DeleteDestinationRequest): Future[DeleteDestinationResponse] = service.deleteDestination(params).promise().toFuture
    @inline def deleteDeviceProfileFuture(params: DeleteDeviceProfileRequest): Future[DeleteDeviceProfileResponse] = service.deleteDeviceProfile(params).promise().toFuture
    @inline def deleteFuotaTaskFuture(params: DeleteFuotaTaskRequest): Future[DeleteFuotaTaskResponse] = service.deleteFuotaTask(params).promise().toFuture
    @inline def deleteMulticastGroupFuture(params: DeleteMulticastGroupRequest): Future[DeleteMulticastGroupResponse] = service.deleteMulticastGroup(params).promise().toFuture
    @inline def deleteNetworkAnalyzerConfigurationFuture(params: DeleteNetworkAnalyzerConfigurationRequest): Future[DeleteNetworkAnalyzerConfigurationResponse] = service.deleteNetworkAnalyzerConfiguration(params).promise().toFuture
    @inline def deleteQueuedMessagesFuture(params: DeleteQueuedMessagesRequest): Future[DeleteQueuedMessagesResponse] = service.deleteQueuedMessages(params).promise().toFuture
    @inline def deleteServiceProfileFuture(params: DeleteServiceProfileRequest): Future[DeleteServiceProfileResponse] = service.deleteServiceProfile(params).promise().toFuture
    @inline def deleteWirelessDeviceFuture(params: DeleteWirelessDeviceRequest): Future[DeleteWirelessDeviceResponse] = service.deleteWirelessDevice(params).promise().toFuture
    @inline def deleteWirelessGatewayFuture(params: DeleteWirelessGatewayRequest): Future[DeleteWirelessGatewayResponse] = service.deleteWirelessGateway(params).promise().toFuture
    @inline def deleteWirelessGatewayTaskDefinitionFuture(params: DeleteWirelessGatewayTaskDefinitionRequest): Future[DeleteWirelessGatewayTaskDefinitionResponse] = service.deleteWirelessGatewayTaskDefinition(params).promise().toFuture
    @inline def deleteWirelessGatewayTaskFuture(params: DeleteWirelessGatewayTaskRequest): Future[DeleteWirelessGatewayTaskResponse] = service.deleteWirelessGatewayTask(params).promise().toFuture
    @inline def disassociateAwsAccountFromPartnerAccountFuture(params: DisassociateAwsAccountFromPartnerAccountRequest): Future[DisassociateAwsAccountFromPartnerAccountResponse] = service.disassociateAwsAccountFromPartnerAccount(params).promise().toFuture
    @inline def disassociateMulticastGroupFromFuotaTaskFuture(params: DisassociateMulticastGroupFromFuotaTaskRequest): Future[DisassociateMulticastGroupFromFuotaTaskResponse] = service.disassociateMulticastGroupFromFuotaTask(params).promise().toFuture
    @inline def disassociateWirelessDeviceFromFuotaTaskFuture(params: DisassociateWirelessDeviceFromFuotaTaskRequest): Future[DisassociateWirelessDeviceFromFuotaTaskResponse] = service.disassociateWirelessDeviceFromFuotaTask(params).promise().toFuture
    @inline def disassociateWirelessDeviceFromMulticastGroupFuture(params: DisassociateWirelessDeviceFromMulticastGroupRequest): Future[DisassociateWirelessDeviceFromMulticastGroupResponse] = service.disassociateWirelessDeviceFromMulticastGroup(params).promise().toFuture
    @inline def disassociateWirelessDeviceFromThingFuture(params: DisassociateWirelessDeviceFromThingRequest): Future[DisassociateWirelessDeviceFromThingResponse] = service.disassociateWirelessDeviceFromThing(params).promise().toFuture
    @inline def disassociateWirelessGatewayFromCertificateFuture(params: DisassociateWirelessGatewayFromCertificateRequest): Future[DisassociateWirelessGatewayFromCertificateResponse] = service.disassociateWirelessGatewayFromCertificate(params).promise().toFuture
    @inline def disassociateWirelessGatewayFromThingFuture(params: DisassociateWirelessGatewayFromThingRequest): Future[DisassociateWirelessGatewayFromThingResponse] = service.disassociateWirelessGatewayFromThing(params).promise().toFuture
    @inline def getDestinationFuture(params: GetDestinationRequest): Future[GetDestinationResponse] = service.getDestination(params).promise().toFuture
    @inline def getDeviceProfileFuture(params: GetDeviceProfileRequest): Future[GetDeviceProfileResponse] = service.getDeviceProfile(params).promise().toFuture
    @inline def getEventConfigurationByResourceTypesFuture(params: GetEventConfigurationByResourceTypesRequest): Future[GetEventConfigurationByResourceTypesResponse] = service.getEventConfigurationByResourceTypes(params).promise().toFuture
    @inline def getFuotaTaskFuture(params: GetFuotaTaskRequest): Future[GetFuotaTaskResponse] = service.getFuotaTask(params).promise().toFuture
    @inline def getLogLevelsByResourceTypesFuture(params: GetLogLevelsByResourceTypesRequest): Future[GetLogLevelsByResourceTypesResponse] = service.getLogLevelsByResourceTypes(params).promise().toFuture
    @inline def getMulticastGroupFuture(params: GetMulticastGroupRequest): Future[GetMulticastGroupResponse] = service.getMulticastGroup(params).promise().toFuture
    @inline def getMulticastGroupSessionFuture(params: GetMulticastGroupSessionRequest): Future[GetMulticastGroupSessionResponse] = service.getMulticastGroupSession(params).promise().toFuture
    @inline def getNetworkAnalyzerConfigurationFuture(params: GetNetworkAnalyzerConfigurationRequest): Future[GetNetworkAnalyzerConfigurationResponse] = service.getNetworkAnalyzerConfiguration(params).promise().toFuture
    @inline def getPartnerAccountFuture(params: GetPartnerAccountRequest): Future[GetPartnerAccountResponse] = service.getPartnerAccount(params).promise().toFuture
    @inline def getPositionEstimateFuture(params: GetPositionEstimateRequest): Future[GetPositionEstimateResponse] = service.getPositionEstimate(params).promise().toFuture
    @inline def getResourceEventConfigurationFuture(params: GetResourceEventConfigurationRequest): Future[GetResourceEventConfigurationResponse] = service.getResourceEventConfiguration(params).promise().toFuture
    @inline def getResourceLogLevelFuture(params: GetResourceLogLevelRequest): Future[GetResourceLogLevelResponse] = service.getResourceLogLevel(params).promise().toFuture
    @inline def getResourcePositionFuture(params: GetResourcePositionRequest): Future[GetResourcePositionResponse] = service.getResourcePosition(params).promise().toFuture
    @inline def getServiceEndpointFuture(params: GetServiceEndpointRequest): Future[GetServiceEndpointResponse] = service.getServiceEndpoint(params).promise().toFuture
    @inline def getServiceProfileFuture(params: GetServiceProfileRequest): Future[GetServiceProfileResponse] = service.getServiceProfile(params).promise().toFuture
    @inline def getWirelessDeviceFuture(params: GetWirelessDeviceRequest): Future[GetWirelessDeviceResponse] = service.getWirelessDevice(params).promise().toFuture
    @inline def getWirelessDeviceStatisticsFuture(params: GetWirelessDeviceStatisticsRequest): Future[GetWirelessDeviceStatisticsResponse] = service.getWirelessDeviceStatistics(params).promise().toFuture
    @inline def getWirelessGatewayCertificateFuture(params: GetWirelessGatewayCertificateRequest): Future[GetWirelessGatewayCertificateResponse] = service.getWirelessGatewayCertificate(params).promise().toFuture
    @inline def getWirelessGatewayFirmwareInformationFuture(params: GetWirelessGatewayFirmwareInformationRequest): Future[GetWirelessGatewayFirmwareInformationResponse] = service.getWirelessGatewayFirmwareInformation(params).promise().toFuture
    @inline def getWirelessGatewayFuture(params: GetWirelessGatewayRequest): Future[GetWirelessGatewayResponse] = service.getWirelessGateway(params).promise().toFuture
    @inline def getWirelessGatewayStatisticsFuture(params: GetWirelessGatewayStatisticsRequest): Future[GetWirelessGatewayStatisticsResponse] = service.getWirelessGatewayStatistics(params).promise().toFuture
    @inline def getWirelessGatewayTaskDefinitionFuture(params: GetWirelessGatewayTaskDefinitionRequest): Future[GetWirelessGatewayTaskDefinitionResponse] = service.getWirelessGatewayTaskDefinition(params).promise().toFuture
    @inline def getWirelessGatewayTaskFuture(params: GetWirelessGatewayTaskRequest): Future[GetWirelessGatewayTaskResponse] = service.getWirelessGatewayTask(params).promise().toFuture
    @inline def listDestinationsFuture(params: ListDestinationsRequest): Future[ListDestinationsResponse] = service.listDestinations(params).promise().toFuture
    @inline def listDeviceProfilesFuture(params: ListDeviceProfilesRequest): Future[ListDeviceProfilesResponse] = service.listDeviceProfiles(params).promise().toFuture
    @inline def listEventConfigurationsFuture(params: ListEventConfigurationsRequest): Future[ListEventConfigurationsResponse] = service.listEventConfigurations(params).promise().toFuture
    @inline def listFuotaTasksFuture(params: ListFuotaTasksRequest): Future[ListFuotaTasksResponse] = service.listFuotaTasks(params).promise().toFuture
    @inline def listMulticastGroupsByFuotaTaskFuture(params: ListMulticastGroupsByFuotaTaskRequest): Future[ListMulticastGroupsByFuotaTaskResponse] = service.listMulticastGroupsByFuotaTask(params).promise().toFuture
    @inline def listMulticastGroupsFuture(params: ListMulticastGroupsRequest): Future[ListMulticastGroupsResponse] = service.listMulticastGroups(params).promise().toFuture
    @inline def listNetworkAnalyzerConfigurationsFuture(params: ListNetworkAnalyzerConfigurationsRequest): Future[ListNetworkAnalyzerConfigurationsResponse] = service.listNetworkAnalyzerConfigurations(params).promise().toFuture
    @inline def listPartnerAccountsFuture(params: ListPartnerAccountsRequest): Future[ListPartnerAccountsResponse] = service.listPartnerAccounts(params).promise().toFuture
    @inline def listQueuedMessagesFuture(params: ListQueuedMessagesRequest): Future[ListQueuedMessagesResponse] = service.listQueuedMessages(params).promise().toFuture
    @inline def listServiceProfilesFuture(params: ListServiceProfilesRequest): Future[ListServiceProfilesResponse] = service.listServiceProfiles(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listWirelessDevicesFuture(params: ListWirelessDevicesRequest): Future[ListWirelessDevicesResponse] = service.listWirelessDevices(params).promise().toFuture
    @inline def listWirelessGatewayTaskDefinitionsFuture(params: ListWirelessGatewayTaskDefinitionsRequest): Future[ListWirelessGatewayTaskDefinitionsResponse] = service.listWirelessGatewayTaskDefinitions(params).promise().toFuture
    @inline def listWirelessGatewaysFuture(params: ListWirelessGatewaysRequest): Future[ListWirelessGatewaysResponse] = service.listWirelessGateways(params).promise().toFuture
    @inline def putResourceLogLevelFuture(params: PutResourceLogLevelRequest): Future[PutResourceLogLevelResponse] = service.putResourceLogLevel(params).promise().toFuture
    @inline def resetAllResourceLogLevelsFuture(params: ResetAllResourceLogLevelsRequest): Future[ResetAllResourceLogLevelsResponse] = service.resetAllResourceLogLevels(params).promise().toFuture
    @inline def resetResourceLogLevelFuture(params: ResetResourceLogLevelRequest): Future[ResetResourceLogLevelResponse] = service.resetResourceLogLevel(params).promise().toFuture
    @inline def sendDataToMulticastGroupFuture(params: SendDataToMulticastGroupRequest): Future[SendDataToMulticastGroupResponse] = service.sendDataToMulticastGroup(params).promise().toFuture
    @inline def sendDataToWirelessDeviceFuture(params: SendDataToWirelessDeviceRequest): Future[SendDataToWirelessDeviceResponse] = service.sendDataToWirelessDevice(params).promise().toFuture
    @inline def startBulkAssociateWirelessDeviceWithMulticastGroupFuture(params: StartBulkAssociateWirelessDeviceWithMulticastGroupRequest): Future[StartBulkAssociateWirelessDeviceWithMulticastGroupResponse] = service.startBulkAssociateWirelessDeviceWithMulticastGroup(params).promise().toFuture
    @inline def startBulkDisassociateWirelessDeviceFromMulticastGroupFuture(params: StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest): Future[StartBulkDisassociateWirelessDeviceFromMulticastGroupResponse] = service.startBulkDisassociateWirelessDeviceFromMulticastGroup(params).promise().toFuture
    @inline def startFuotaTaskFuture(params: StartFuotaTaskRequest): Future[StartFuotaTaskResponse] = service.startFuotaTask(params).promise().toFuture
    @inline def startMulticastGroupSessionFuture(params: StartMulticastGroupSessionRequest): Future[StartMulticastGroupSessionResponse] = service.startMulticastGroupSession(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def testWirelessDeviceFuture(params: TestWirelessDeviceRequest): Future[TestWirelessDeviceResponse] = service.testWirelessDevice(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateDestinationFuture(params: UpdateDestinationRequest): Future[UpdateDestinationResponse] = service.updateDestination(params).promise().toFuture
    @inline def updateEventConfigurationByResourceTypesFuture(params: UpdateEventConfigurationByResourceTypesRequest): Future[UpdateEventConfigurationByResourceTypesResponse] = service.updateEventConfigurationByResourceTypes(params).promise().toFuture
    @inline def updateFuotaTaskFuture(params: UpdateFuotaTaskRequest): Future[UpdateFuotaTaskResponse] = service.updateFuotaTask(params).promise().toFuture
    @inline def updateLogLevelsByResourceTypesFuture(params: UpdateLogLevelsByResourceTypesRequest): Future[UpdateLogLevelsByResourceTypesResponse] = service.updateLogLevelsByResourceTypes(params).promise().toFuture
    @inline def updateMulticastGroupFuture(params: UpdateMulticastGroupRequest): Future[UpdateMulticastGroupResponse] = service.updateMulticastGroup(params).promise().toFuture
    @inline def updateNetworkAnalyzerConfigurationFuture(params: UpdateNetworkAnalyzerConfigurationRequest): Future[UpdateNetworkAnalyzerConfigurationResponse] = service.updateNetworkAnalyzerConfiguration(params).promise().toFuture
    @inline def updatePartnerAccountFuture(params: UpdatePartnerAccountRequest): Future[UpdatePartnerAccountResponse] = service.updatePartnerAccount(params).promise().toFuture
    @inline def updateResourceEventConfigurationFuture(params: UpdateResourceEventConfigurationRequest): Future[UpdateResourceEventConfigurationResponse] = service.updateResourceEventConfiguration(params).promise().toFuture
    @inline def updateResourcePositionFuture(params: UpdateResourcePositionRequest): Future[UpdateResourcePositionResponse] = service.updateResourcePosition(params).promise().toFuture
    @inline def updateWirelessDeviceFuture(params: UpdateWirelessDeviceRequest): Future[UpdateWirelessDeviceResponse] = service.updateWirelessDevice(params).promise().toFuture
    @inline def updateWirelessGatewayFuture(params: UpdateWirelessGatewayRequest): Future[UpdateWirelessGatewayResponse] = service.updateWirelessGateway(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/iotwireless", JSImport.Namespace, "AWS.IoTWireless")
  class IoTWireless() extends js.Object {
    def this(config: AWSConfig) = this()

    @deprecated("This operation is no longer supported.", "forever") def getPosition(params: GetPositionRequest): Request[GetPositionResponse] = js.native
    @deprecated("This operation is no longer supported.", "forever") def getPositionConfiguration(params: GetPositionConfigurationRequest): Request[GetPositionConfigurationResponse] = js.native
    @deprecated("This operation is no longer supported.", "forever") def listPositionConfigurations(params: ListPositionConfigurationsRequest): Request[ListPositionConfigurationsResponse] = js.native
    @deprecated("This operation is no longer supported.", "forever") def putPositionConfiguration(params: PutPositionConfigurationRequest): Request[PutPositionConfigurationResponse] = js.native
    @deprecated("This operation is no longer supported.", "forever") def updatePosition(params: UpdatePositionRequest): Request[UpdatePositionResponse] = js.native
    def associateAwsAccountWithPartnerAccount(params: AssociateAwsAccountWithPartnerAccountRequest): Request[AssociateAwsAccountWithPartnerAccountResponse] = js.native
    def associateMulticastGroupWithFuotaTask(params: AssociateMulticastGroupWithFuotaTaskRequest): Request[AssociateMulticastGroupWithFuotaTaskResponse] = js.native
    def associateWirelessDeviceWithFuotaTask(params: AssociateWirelessDeviceWithFuotaTaskRequest): Request[AssociateWirelessDeviceWithFuotaTaskResponse] = js.native
    def associateWirelessDeviceWithMulticastGroup(params: AssociateWirelessDeviceWithMulticastGroupRequest): Request[AssociateWirelessDeviceWithMulticastGroupResponse] = js.native
    def associateWirelessDeviceWithThing(params: AssociateWirelessDeviceWithThingRequest): Request[AssociateWirelessDeviceWithThingResponse] = js.native
    def associateWirelessGatewayWithCertificate(params: AssociateWirelessGatewayWithCertificateRequest): Request[AssociateWirelessGatewayWithCertificateResponse] = js.native
    def associateWirelessGatewayWithThing(params: AssociateWirelessGatewayWithThingRequest): Request[AssociateWirelessGatewayWithThingResponse] = js.native
    def cancelMulticastGroupSession(params: CancelMulticastGroupSessionRequest): Request[CancelMulticastGroupSessionResponse] = js.native
    def createDestination(params: CreateDestinationRequest): Request[CreateDestinationResponse] = js.native
    def createDeviceProfile(params: CreateDeviceProfileRequest): Request[CreateDeviceProfileResponse] = js.native
    def createFuotaTask(params: CreateFuotaTaskRequest): Request[CreateFuotaTaskResponse] = js.native
    def createMulticastGroup(params: CreateMulticastGroupRequest): Request[CreateMulticastGroupResponse] = js.native
    def createNetworkAnalyzerConfiguration(params: CreateNetworkAnalyzerConfigurationRequest): Request[CreateNetworkAnalyzerConfigurationResponse] = js.native
    def createServiceProfile(params: CreateServiceProfileRequest): Request[CreateServiceProfileResponse] = js.native
    def createWirelessDevice(params: CreateWirelessDeviceRequest): Request[CreateWirelessDeviceResponse] = js.native
    def createWirelessGateway(params: CreateWirelessGatewayRequest): Request[CreateWirelessGatewayResponse] = js.native
    def createWirelessGatewayTask(params: CreateWirelessGatewayTaskRequest): Request[CreateWirelessGatewayTaskResponse] = js.native
    def createWirelessGatewayTaskDefinition(params: CreateWirelessGatewayTaskDefinitionRequest): Request[CreateWirelessGatewayTaskDefinitionResponse] = js.native
    def deleteDestination(params: DeleteDestinationRequest): Request[DeleteDestinationResponse] = js.native
    def deleteDeviceProfile(params: DeleteDeviceProfileRequest): Request[DeleteDeviceProfileResponse] = js.native
    def deleteFuotaTask(params: DeleteFuotaTaskRequest): Request[DeleteFuotaTaskResponse] = js.native
    def deleteMulticastGroup(params: DeleteMulticastGroupRequest): Request[DeleteMulticastGroupResponse] = js.native
    def deleteNetworkAnalyzerConfiguration(params: DeleteNetworkAnalyzerConfigurationRequest): Request[DeleteNetworkAnalyzerConfigurationResponse] = js.native
    def deleteQueuedMessages(params: DeleteQueuedMessagesRequest): Request[DeleteQueuedMessagesResponse] = js.native
    def deleteServiceProfile(params: DeleteServiceProfileRequest): Request[DeleteServiceProfileResponse] = js.native
    def deleteWirelessDevice(params: DeleteWirelessDeviceRequest): Request[DeleteWirelessDeviceResponse] = js.native
    def deleteWirelessGateway(params: DeleteWirelessGatewayRequest): Request[DeleteWirelessGatewayResponse] = js.native
    def deleteWirelessGatewayTask(params: DeleteWirelessGatewayTaskRequest): Request[DeleteWirelessGatewayTaskResponse] = js.native
    def deleteWirelessGatewayTaskDefinition(params: DeleteWirelessGatewayTaskDefinitionRequest): Request[DeleteWirelessGatewayTaskDefinitionResponse] = js.native
    def disassociateAwsAccountFromPartnerAccount(params: DisassociateAwsAccountFromPartnerAccountRequest): Request[DisassociateAwsAccountFromPartnerAccountResponse] = js.native
    def disassociateMulticastGroupFromFuotaTask(params: DisassociateMulticastGroupFromFuotaTaskRequest): Request[DisassociateMulticastGroupFromFuotaTaskResponse] = js.native
    def disassociateWirelessDeviceFromFuotaTask(params: DisassociateWirelessDeviceFromFuotaTaskRequest): Request[DisassociateWirelessDeviceFromFuotaTaskResponse] = js.native
    def disassociateWirelessDeviceFromMulticastGroup(params: DisassociateWirelessDeviceFromMulticastGroupRequest): Request[DisassociateWirelessDeviceFromMulticastGroupResponse] = js.native
    def disassociateWirelessDeviceFromThing(params: DisassociateWirelessDeviceFromThingRequest): Request[DisassociateWirelessDeviceFromThingResponse] = js.native
    def disassociateWirelessGatewayFromCertificate(params: DisassociateWirelessGatewayFromCertificateRequest): Request[DisassociateWirelessGatewayFromCertificateResponse] = js.native
    def disassociateWirelessGatewayFromThing(params: DisassociateWirelessGatewayFromThingRequest): Request[DisassociateWirelessGatewayFromThingResponse] = js.native
    def getDestination(params: GetDestinationRequest): Request[GetDestinationResponse] = js.native
    def getDeviceProfile(params: GetDeviceProfileRequest): Request[GetDeviceProfileResponse] = js.native
    def getEventConfigurationByResourceTypes(params: GetEventConfigurationByResourceTypesRequest): Request[GetEventConfigurationByResourceTypesResponse] = js.native
    def getFuotaTask(params: GetFuotaTaskRequest): Request[GetFuotaTaskResponse] = js.native
    def getLogLevelsByResourceTypes(params: GetLogLevelsByResourceTypesRequest): Request[GetLogLevelsByResourceTypesResponse] = js.native
    def getMulticastGroup(params: GetMulticastGroupRequest): Request[GetMulticastGroupResponse] = js.native
    def getMulticastGroupSession(params: GetMulticastGroupSessionRequest): Request[GetMulticastGroupSessionResponse] = js.native
    def getNetworkAnalyzerConfiguration(params: GetNetworkAnalyzerConfigurationRequest): Request[GetNetworkAnalyzerConfigurationResponse] = js.native
    def getPartnerAccount(params: GetPartnerAccountRequest): Request[GetPartnerAccountResponse] = js.native
    def getPositionEstimate(params: GetPositionEstimateRequest): Request[GetPositionEstimateResponse] = js.native
    def getResourceEventConfiguration(params: GetResourceEventConfigurationRequest): Request[GetResourceEventConfigurationResponse] = js.native
    def getResourceLogLevel(params: GetResourceLogLevelRequest): Request[GetResourceLogLevelResponse] = js.native
    def getResourcePosition(params: GetResourcePositionRequest): Request[GetResourcePositionResponse] = js.native
    def getServiceEndpoint(params: GetServiceEndpointRequest): Request[GetServiceEndpointResponse] = js.native
    def getServiceProfile(params: GetServiceProfileRequest): Request[GetServiceProfileResponse] = js.native
    def getWirelessDevice(params: GetWirelessDeviceRequest): Request[GetWirelessDeviceResponse] = js.native
    def getWirelessDeviceStatistics(params: GetWirelessDeviceStatisticsRequest): Request[GetWirelessDeviceStatisticsResponse] = js.native
    def getWirelessGateway(params: GetWirelessGatewayRequest): Request[GetWirelessGatewayResponse] = js.native
    def getWirelessGatewayCertificate(params: GetWirelessGatewayCertificateRequest): Request[GetWirelessGatewayCertificateResponse] = js.native
    def getWirelessGatewayFirmwareInformation(params: GetWirelessGatewayFirmwareInformationRequest): Request[GetWirelessGatewayFirmwareInformationResponse] = js.native
    def getWirelessGatewayStatistics(params: GetWirelessGatewayStatisticsRequest): Request[GetWirelessGatewayStatisticsResponse] = js.native
    def getWirelessGatewayTask(params: GetWirelessGatewayTaskRequest): Request[GetWirelessGatewayTaskResponse] = js.native
    def getWirelessGatewayTaskDefinition(params: GetWirelessGatewayTaskDefinitionRequest): Request[GetWirelessGatewayTaskDefinitionResponse] = js.native
    def listDestinations(params: ListDestinationsRequest): Request[ListDestinationsResponse] = js.native
    def listDeviceProfiles(params: ListDeviceProfilesRequest): Request[ListDeviceProfilesResponse] = js.native
    def listEventConfigurations(params: ListEventConfigurationsRequest): Request[ListEventConfigurationsResponse] = js.native
    def listFuotaTasks(params: ListFuotaTasksRequest): Request[ListFuotaTasksResponse] = js.native
    def listMulticastGroups(params: ListMulticastGroupsRequest): Request[ListMulticastGroupsResponse] = js.native
    def listMulticastGroupsByFuotaTask(params: ListMulticastGroupsByFuotaTaskRequest): Request[ListMulticastGroupsByFuotaTaskResponse] = js.native
    def listNetworkAnalyzerConfigurations(params: ListNetworkAnalyzerConfigurationsRequest): Request[ListNetworkAnalyzerConfigurationsResponse] = js.native
    def listPartnerAccounts(params: ListPartnerAccountsRequest): Request[ListPartnerAccountsResponse] = js.native
    def listQueuedMessages(params: ListQueuedMessagesRequest): Request[ListQueuedMessagesResponse] = js.native
    def listServiceProfiles(params: ListServiceProfilesRequest): Request[ListServiceProfilesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listWirelessDevices(params: ListWirelessDevicesRequest): Request[ListWirelessDevicesResponse] = js.native
    def listWirelessGatewayTaskDefinitions(params: ListWirelessGatewayTaskDefinitionsRequest): Request[ListWirelessGatewayTaskDefinitionsResponse] = js.native
    def listWirelessGateways(params: ListWirelessGatewaysRequest): Request[ListWirelessGatewaysResponse] = js.native
    def putResourceLogLevel(params: PutResourceLogLevelRequest): Request[PutResourceLogLevelResponse] = js.native
    def resetAllResourceLogLevels(params: ResetAllResourceLogLevelsRequest): Request[ResetAllResourceLogLevelsResponse] = js.native
    def resetResourceLogLevel(params: ResetResourceLogLevelRequest): Request[ResetResourceLogLevelResponse] = js.native
    def sendDataToMulticastGroup(params: SendDataToMulticastGroupRequest): Request[SendDataToMulticastGroupResponse] = js.native
    def sendDataToWirelessDevice(params: SendDataToWirelessDeviceRequest): Request[SendDataToWirelessDeviceResponse] = js.native
    def startBulkAssociateWirelessDeviceWithMulticastGroup(params: StartBulkAssociateWirelessDeviceWithMulticastGroupRequest): Request[StartBulkAssociateWirelessDeviceWithMulticastGroupResponse] = js.native
    def startBulkDisassociateWirelessDeviceFromMulticastGroup(params: StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest): Request[StartBulkDisassociateWirelessDeviceFromMulticastGroupResponse] = js.native
    def startFuotaTask(params: StartFuotaTaskRequest): Request[StartFuotaTaskResponse] = js.native
    def startMulticastGroupSession(params: StartMulticastGroupSessionRequest): Request[StartMulticastGroupSessionResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def testWirelessDevice(params: TestWirelessDeviceRequest): Request[TestWirelessDeviceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateDestination(params: UpdateDestinationRequest): Request[UpdateDestinationResponse] = js.native
    def updateEventConfigurationByResourceTypes(params: UpdateEventConfigurationByResourceTypesRequest): Request[UpdateEventConfigurationByResourceTypesResponse] = js.native
    def updateFuotaTask(params: UpdateFuotaTaskRequest): Request[UpdateFuotaTaskResponse] = js.native
    def updateLogLevelsByResourceTypes(params: UpdateLogLevelsByResourceTypesRequest): Request[UpdateLogLevelsByResourceTypesResponse] = js.native
    def updateMulticastGroup(params: UpdateMulticastGroupRequest): Request[UpdateMulticastGroupResponse] = js.native
    def updateNetworkAnalyzerConfiguration(params: UpdateNetworkAnalyzerConfigurationRequest): Request[UpdateNetworkAnalyzerConfigurationResponse] = js.native
    def updatePartnerAccount(params: UpdatePartnerAccountRequest): Request[UpdatePartnerAccountResponse] = js.native
    def updateResourceEventConfiguration(params: UpdateResourceEventConfigurationRequest): Request[UpdateResourceEventConfigurationResponse] = js.native
    def updateResourcePosition(params: UpdateResourcePositionRequest): Request[UpdateResourcePositionResponse] = js.native
    def updateWirelessDevice(params: UpdateWirelessDeviceRequest): Request[UpdateWirelessDeviceResponse] = js.native
    def updateWirelessGateway(params: UpdateWirelessGatewayRequest): Request[UpdateWirelessGatewayResponse] = js.native
  }
  object IoTWireless {
    @inline implicit def toOps(service: IoTWireless): IoTWirelessOps = {
      new IoTWirelessOps(service)
    }
  }

  /** ABP device object for LoRaWAN specification v1.0.x
    */
  @js.native
  trait AbpV1_0_x extends js.Object {
    var DevAddr: js.UndefOr[DevAddr]
    var FCntStart: js.UndefOr[FCntStart]
    var SessionKeys: js.UndefOr[SessionKeysAbpV1_0_x]
  }

  object AbpV1_0_x {
    @inline
    def apply(
        DevAddr: js.UndefOr[DevAddr] = js.undefined,
        FCntStart: js.UndefOr[FCntStart] = js.undefined,
        SessionKeys: js.UndefOr[SessionKeysAbpV1_0_x] = js.undefined
    ): AbpV1_0_x = {
      val __obj = js.Dynamic.literal()
      DevAddr.foreach(__v => __obj.updateDynamic("DevAddr")(__v.asInstanceOf[js.Any]))
      FCntStart.foreach(__v => __obj.updateDynamic("FCntStart")(__v.asInstanceOf[js.Any]))
      SessionKeys.foreach(__v => __obj.updateDynamic("SessionKeys")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AbpV1_0_x]
    }
  }

  /** ABP device object for LoRaWAN specification v1.1
    */
  @js.native
  trait AbpV1_1 extends js.Object {
    var DevAddr: js.UndefOr[DevAddr]
    var FCntStart: js.UndefOr[FCntStart]
    var SessionKeys: js.UndefOr[SessionKeysAbpV1_1]
  }

  object AbpV1_1 {
    @inline
    def apply(
        DevAddr: js.UndefOr[DevAddr] = js.undefined,
        FCntStart: js.UndefOr[FCntStart] = js.undefined,
        SessionKeys: js.UndefOr[SessionKeysAbpV1_1] = js.undefined
    ): AbpV1_1 = {
      val __obj = js.Dynamic.literal()
      DevAddr.foreach(__v => __obj.updateDynamic("DevAddr")(__v.asInstanceOf[js.Any]))
      FCntStart.foreach(__v => __obj.updateDynamic("FCntStart")(__v.asInstanceOf[js.Any]))
      SessionKeys.foreach(__v => __obj.updateDynamic("SessionKeys")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AbpV1_1]
    }
  }

  /** The accuracy of the estimated position in meters. An empty value indicates that no position data is available. A value of ‘0.0’ value indicates that position data is available. This data corresponds to the position information that you specified instead of the position computed by solver.
    */
  @js.native
  trait Accuracy extends js.Object {
    var HorizontalAccuracy: js.UndefOr[HorizontalAccuracy]
    var VerticalAccuracy: js.UndefOr[VerticalAccuracy]
  }

  object Accuracy {
    @inline
    def apply(
        HorizontalAccuracy: js.UndefOr[HorizontalAccuracy] = js.undefined,
        VerticalAccuracy: js.UndefOr[VerticalAccuracy] = js.undefined
    ): Accuracy = {
      val __obj = js.Dynamic.literal()
      HorizontalAccuracy.foreach(__v => __obj.updateDynamic("HorizontalAccuracy")(__v.asInstanceOf[js.Any]))
      VerticalAccuracy.foreach(__v => __obj.updateDynamic("VerticalAccuracy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Accuracy]
    }
  }

  /** LoRaWAN application configuration, which can be used to perform geolocation.
    */
  @js.native
  trait ApplicationConfig extends js.Object {
    var DestinationName: js.UndefOr[DestinationName]
    var FPort: js.UndefOr[FPort]
    var Type: js.UndefOr[ApplicationConfigType]
  }

  object ApplicationConfig {
    @inline
    def apply(
        DestinationName: js.UndefOr[DestinationName] = js.undefined,
        FPort: js.UndefOr[FPort] = js.undefined,
        Type: js.UndefOr[ApplicationConfigType] = js.undefined
    ): ApplicationConfig = {
      val __obj = js.Dynamic.literal()
      DestinationName.foreach(__v => __obj.updateDynamic("DestinationName")(__v.asInstanceOf[js.Any]))
      FPort.foreach(__v => __obj.updateDynamic("FPort")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ApplicationConfig]
    }
  }

  @js.native
  trait AssociateAwsAccountWithPartnerAccountRequest extends js.Object {
    var Sidewalk: SidewalkAccountInfo
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Tags: js.UndefOr[TagList]
  }

  object AssociateAwsAccountWithPartnerAccountRequest {
    @inline
    def apply(
        Sidewalk: SidewalkAccountInfo,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): AssociateAwsAccountWithPartnerAccountRequest = {
      val __obj = js.Dynamic.literal(
        "Sidewalk" -> Sidewalk.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateAwsAccountWithPartnerAccountRequest]
    }
  }

  @js.native
  trait AssociateAwsAccountWithPartnerAccountResponse extends js.Object {
    var Arn: js.UndefOr[PartnerAccountArn]
    var Sidewalk: js.UndefOr[SidewalkAccountInfo]
  }

  object AssociateAwsAccountWithPartnerAccountResponse {
    @inline
    def apply(
        Arn: js.UndefOr[PartnerAccountArn] = js.undefined,
        Sidewalk: js.UndefOr[SidewalkAccountInfo] = js.undefined
    ): AssociateAwsAccountWithPartnerAccountResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Sidewalk.foreach(__v => __obj.updateDynamic("Sidewalk")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateAwsAccountWithPartnerAccountResponse]
    }
  }

  @js.native
  trait AssociateMulticastGroupWithFuotaTaskRequest extends js.Object {
    var Id: FuotaTaskId
    var MulticastGroupId: MulticastGroupId
  }

  object AssociateMulticastGroupWithFuotaTaskRequest {
    @inline
    def apply(
        Id: FuotaTaskId,
        MulticastGroupId: MulticastGroupId
    ): AssociateMulticastGroupWithFuotaTaskRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "MulticastGroupId" -> MulticastGroupId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateMulticastGroupWithFuotaTaskRequest]
    }
  }

  @js.native
  trait AssociateMulticastGroupWithFuotaTaskResponse extends js.Object

  object AssociateMulticastGroupWithFuotaTaskResponse {
    @inline
    def apply(): AssociateMulticastGroupWithFuotaTaskResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssociateMulticastGroupWithFuotaTaskResponse]
    }
  }

  @js.native
  trait AssociateWirelessDeviceWithFuotaTaskRequest extends js.Object {
    var Id: FuotaTaskId
    var WirelessDeviceId: WirelessDeviceId
  }

  object AssociateWirelessDeviceWithFuotaTaskRequest {
    @inline
    def apply(
        Id: FuotaTaskId,
        WirelessDeviceId: WirelessDeviceId
    ): AssociateWirelessDeviceWithFuotaTaskRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "WirelessDeviceId" -> WirelessDeviceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateWirelessDeviceWithFuotaTaskRequest]
    }
  }

  @js.native
  trait AssociateWirelessDeviceWithFuotaTaskResponse extends js.Object

  object AssociateWirelessDeviceWithFuotaTaskResponse {
    @inline
    def apply(): AssociateWirelessDeviceWithFuotaTaskResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssociateWirelessDeviceWithFuotaTaskResponse]
    }
  }

  @js.native
  trait AssociateWirelessDeviceWithMulticastGroupRequest extends js.Object {
    var Id: MulticastGroupId
    var WirelessDeviceId: WirelessDeviceId
  }

  object AssociateWirelessDeviceWithMulticastGroupRequest {
    @inline
    def apply(
        Id: MulticastGroupId,
        WirelessDeviceId: WirelessDeviceId
    ): AssociateWirelessDeviceWithMulticastGroupRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "WirelessDeviceId" -> WirelessDeviceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateWirelessDeviceWithMulticastGroupRequest]
    }
  }

  @js.native
  trait AssociateWirelessDeviceWithMulticastGroupResponse extends js.Object

  object AssociateWirelessDeviceWithMulticastGroupResponse {
    @inline
    def apply(): AssociateWirelessDeviceWithMulticastGroupResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssociateWirelessDeviceWithMulticastGroupResponse]
    }
  }

  @js.native
  trait AssociateWirelessDeviceWithThingRequest extends js.Object {
    var Id: WirelessDeviceId
    var ThingArn: ThingArn
  }

  object AssociateWirelessDeviceWithThingRequest {
    @inline
    def apply(
        Id: WirelessDeviceId,
        ThingArn: ThingArn
    ): AssociateWirelessDeviceWithThingRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "ThingArn" -> ThingArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateWirelessDeviceWithThingRequest]
    }
  }

  @js.native
  trait AssociateWirelessDeviceWithThingResponse extends js.Object

  object AssociateWirelessDeviceWithThingResponse {
    @inline
    def apply(): AssociateWirelessDeviceWithThingResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssociateWirelessDeviceWithThingResponse]
    }
  }

  @js.native
  trait AssociateWirelessGatewayWithCertificateRequest extends js.Object {
    var Id: WirelessGatewayId
    var IotCertificateId: IotCertificateId
  }

  object AssociateWirelessGatewayWithCertificateRequest {
    @inline
    def apply(
        Id: WirelessGatewayId,
        IotCertificateId: IotCertificateId
    ): AssociateWirelessGatewayWithCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "IotCertificateId" -> IotCertificateId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateWirelessGatewayWithCertificateRequest]
    }
  }

  @js.native
  trait AssociateWirelessGatewayWithCertificateResponse extends js.Object {
    var IotCertificateId: js.UndefOr[IotCertificateId]
  }

  object AssociateWirelessGatewayWithCertificateResponse {
    @inline
    def apply(
        IotCertificateId: js.UndefOr[IotCertificateId] = js.undefined
    ): AssociateWirelessGatewayWithCertificateResponse = {
      val __obj = js.Dynamic.literal()
      IotCertificateId.foreach(__v => __obj.updateDynamic("IotCertificateId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AssociateWirelessGatewayWithCertificateResponse]
    }
  }

  @js.native
  trait AssociateWirelessGatewayWithThingRequest extends js.Object {
    var Id: WirelessGatewayId
    var ThingArn: ThingArn
  }

  object AssociateWirelessGatewayWithThingRequest {
    @inline
    def apply(
        Id: WirelessGatewayId,
        ThingArn: ThingArn
    ): AssociateWirelessGatewayWithThingRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "ThingArn" -> ThingArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AssociateWirelessGatewayWithThingRequest]
    }
  }

  @js.native
  trait AssociateWirelessGatewayWithThingResponse extends js.Object

  object AssociateWirelessGatewayWithThingResponse {
    @inline
    def apply(): AssociateWirelessGatewayWithThingResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AssociateWirelessGatewayWithThingResponse]
    }
  }

  /** Beaconing parameters for configuring the wireless gateways.
    */
  @js.native
  trait Beaconing extends js.Object {
    var DataRate: js.UndefOr[BeaconingDataRate]
    var Frequencies: js.UndefOr[BeaconingFrequencies]
  }

  object Beaconing {
    @inline
    def apply(
        DataRate: js.UndefOr[BeaconingDataRate] = js.undefined,
        Frequencies: js.UndefOr[BeaconingFrequencies] = js.undefined
    ): Beaconing = {
      val __obj = js.Dynamic.literal()
      DataRate.foreach(__v => __obj.updateDynamic("DataRate")(__v.asInstanceOf[js.Any]))
      Frequencies.foreach(__v => __obj.updateDynamic("Frequencies")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Beaconing]
    }
  }

  @js.native
  trait CancelMulticastGroupSessionRequest extends js.Object {
    var Id: MulticastGroupId
  }

  object CancelMulticastGroupSessionRequest {
    @inline
    def apply(
        Id: MulticastGroupId
    ): CancelMulticastGroupSessionRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelMulticastGroupSessionRequest]
    }
  }

  @js.native
  trait CancelMulticastGroupSessionResponse extends js.Object

  object CancelMulticastGroupSessionResponse {
    @inline
    def apply(): CancelMulticastGroupSessionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CancelMulticastGroupSessionResponse]
    }
  }

  /** CDMA local ID information, which corresponds to the local identification parameters of a CDMA cell.
    */
  @js.native
  trait CdmaLocalId extends js.Object {
    var CdmaChannel: CdmaChannel
    var PnOffset: PnOffset
  }

  object CdmaLocalId {
    @inline
    def apply(
        CdmaChannel: CdmaChannel,
        PnOffset: PnOffset
    ): CdmaLocalId = {
      val __obj = js.Dynamic.literal(
        "CdmaChannel" -> CdmaChannel.asInstanceOf[js.Any],
        "PnOffset" -> PnOffset.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CdmaLocalId]
    }
  }

  /** CDMA object for network measurement reports.
    */
  @js.native
  trait CdmaNmrObj extends js.Object {
    var CdmaChannel: CdmaChannel
    var PnOffset: PnOffset
    var BaseStationId: js.UndefOr[BaseStationId]
    var PilotPower: js.UndefOr[PilotPower]
  }

  object CdmaNmrObj {
    @inline
    def apply(
        CdmaChannel: CdmaChannel,
        PnOffset: PnOffset,
        BaseStationId: js.UndefOr[BaseStationId] = js.undefined,
        PilotPower: js.UndefOr[PilotPower] = js.undefined
    ): CdmaNmrObj = {
      val __obj = js.Dynamic.literal(
        "CdmaChannel" -> CdmaChannel.asInstanceOf[js.Any],
        "PnOffset" -> PnOffset.asInstanceOf[js.Any]
      )

      BaseStationId.foreach(__v => __obj.updateDynamic("BaseStationId")(__v.asInstanceOf[js.Any]))
      PilotPower.foreach(__v => __obj.updateDynamic("PilotPower")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CdmaNmrObj]
    }
  }

  /** CDMA (Code-division multiple access) object.
    */
  @js.native
  trait CdmaObj extends js.Object {
    var BaseStationId: BaseStationId
    var NetworkId: NetworkId
    var SystemId: SystemId
    var BaseLat: js.UndefOr[BaseLat]
    var BaseLng: js.UndefOr[BaseLng]
    var CdmaLocalId: js.UndefOr[CdmaLocalId]
    var CdmaNmr: js.UndefOr[CdmaNmrList]
    var PilotPower: js.UndefOr[PilotPower]
    var RegistrationZone: js.UndefOr[RegistrationZone]
  }

  object CdmaObj {
    @inline
    def apply(
        BaseStationId: BaseStationId,
        NetworkId: NetworkId,
        SystemId: SystemId,
        BaseLat: js.UndefOr[BaseLat] = js.undefined,
        BaseLng: js.UndefOr[BaseLng] = js.undefined,
        CdmaLocalId: js.UndefOr[CdmaLocalId] = js.undefined,
        CdmaNmr: js.UndefOr[CdmaNmrList] = js.undefined,
        PilotPower: js.UndefOr[PilotPower] = js.undefined,
        RegistrationZone: js.UndefOr[RegistrationZone] = js.undefined
    ): CdmaObj = {
      val __obj = js.Dynamic.literal(
        "BaseStationId" -> BaseStationId.asInstanceOf[js.Any],
        "NetworkId" -> NetworkId.asInstanceOf[js.Any],
        "SystemId" -> SystemId.asInstanceOf[js.Any]
      )

      BaseLat.foreach(__v => __obj.updateDynamic("BaseLat")(__v.asInstanceOf[js.Any]))
      BaseLng.foreach(__v => __obj.updateDynamic("BaseLng")(__v.asInstanceOf[js.Any]))
      CdmaLocalId.foreach(__v => __obj.updateDynamic("CdmaLocalId")(__v.asInstanceOf[js.Any]))
      CdmaNmr.foreach(__v => __obj.updateDynamic("CdmaNmr")(__v.asInstanceOf[js.Any]))
      PilotPower.foreach(__v => __obj.updateDynamic("PilotPower")(__v.asInstanceOf[js.Any]))
      RegistrationZone.foreach(__v => __obj.updateDynamic("RegistrationZone")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CdmaObj]
    }
  }

  /** The cell towers that were used to perform the measurements.
    */
  @js.native
  trait CellTowers extends js.Object {
    var Cdma: js.UndefOr[CdmaList]
    var Gsm: js.UndefOr[GsmList]
    var Lte: js.UndefOr[LteList]
    var Tdscdma: js.UndefOr[TdscdmaList]
    var Wcdma: js.UndefOr[WcdmaList]
  }

  object CellTowers {
    @inline
    def apply(
        Cdma: js.UndefOr[CdmaList] = js.undefined,
        Gsm: js.UndefOr[GsmList] = js.undefined,
        Lte: js.UndefOr[LteList] = js.undefined,
        Tdscdma: js.UndefOr[TdscdmaList] = js.undefined,
        Wcdma: js.UndefOr[WcdmaList] = js.undefined
    ): CellTowers = {
      val __obj = js.Dynamic.literal()
      Cdma.foreach(__v => __obj.updateDynamic("Cdma")(__v.asInstanceOf[js.Any]))
      Gsm.foreach(__v => __obj.updateDynamic("Gsm")(__v.asInstanceOf[js.Any]))
      Lte.foreach(__v => __obj.updateDynamic("Lte")(__v.asInstanceOf[js.Any]))
      Tdscdma.foreach(__v => __obj.updateDynamic("Tdscdma")(__v.asInstanceOf[js.Any]))
      Wcdma.foreach(__v => __obj.updateDynamic("Wcdma")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CellTowers]
    }
  }

  /** List of sidewalk certificates.
    */
  @js.native
  trait CertificateList extends js.Object {
    var SigningAlg: SigningAlg
    var Value: CertificateValue
  }

  object CertificateList {
    @inline
    def apply(
        SigningAlg: SigningAlg,
        Value: CertificateValue
    ): CertificateList = {
      val __obj = js.Dynamic.literal(
        "SigningAlg" -> SigningAlg.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CertificateList]
    }
  }

  /** Connection status event configuration object for enabling or disabling topic.
    */
  @js.native
  trait ConnectionStatusEventConfiguration extends js.Object {
    var LoRaWAN: js.UndefOr[LoRaWANConnectionStatusEventNotificationConfigurations]
    var WirelessGatewayIdEventTopic: js.UndefOr[EventNotificationTopicStatus]
  }

  object ConnectionStatusEventConfiguration {
    @inline
    def apply(
        LoRaWAN: js.UndefOr[LoRaWANConnectionStatusEventNotificationConfigurations] = js.undefined,
        WirelessGatewayIdEventTopic: js.UndefOr[EventNotificationTopicStatus] = js.undefined
    ): ConnectionStatusEventConfiguration = {
      val __obj = js.Dynamic.literal()
      LoRaWAN.foreach(__v => __obj.updateDynamic("LoRaWAN")(__v.asInstanceOf[js.Any]))
      WirelessGatewayIdEventTopic.foreach(__v => __obj.updateDynamic("WirelessGatewayIdEventTopic")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectionStatusEventConfiguration]
    }
  }

  /** Connection status resource type event configuration object for enabling or disabling topic.
    */
  @js.native
  trait ConnectionStatusResourceTypeEventConfiguration extends js.Object {
    var LoRaWAN: js.UndefOr[LoRaWANConnectionStatusResourceTypeEventConfiguration]
  }

  object ConnectionStatusResourceTypeEventConfiguration {
    @inline
    def apply(
        LoRaWAN: js.UndefOr[LoRaWANConnectionStatusResourceTypeEventConfiguration] = js.undefined
    ): ConnectionStatusResourceTypeEventConfiguration = {
      val __obj = js.Dynamic.literal()
      LoRaWAN.foreach(__v => __obj.updateDynamic("LoRaWAN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConnectionStatusResourceTypeEventConfiguration]
    }
  }

  @js.native
  trait CreateDestinationRequest extends js.Object {
    var Expression: Expression
    var ExpressionType: ExpressionType
    var Name: DestinationName
    var RoleArn: RoleArn
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Description: js.UndefOr[Description]
    var Tags: js.UndefOr[TagList]
  }

  object CreateDestinationRequest {
    @inline
    def apply(
        Expression: Expression,
        ExpressionType: ExpressionType,
        Name: DestinationName,
        RoleArn: RoleArn,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateDestinationRequest = {
      val __obj = js.Dynamic.literal(
        "Expression" -> Expression.asInstanceOf[js.Any],
        "ExpressionType" -> ExpressionType.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "RoleArn" -> RoleArn.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDestinationRequest]
    }
  }

  @js.native
  trait CreateDestinationResponse extends js.Object {
    var Arn: js.UndefOr[DestinationArn]
    var Name: js.UndefOr[DestinationName]
  }

  object CreateDestinationResponse {
    @inline
    def apply(
        Arn: js.UndefOr[DestinationArn] = js.undefined,
        Name: js.UndefOr[DestinationName] = js.undefined
    ): CreateDestinationResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDestinationResponse]
    }
  }

  @js.native
  trait CreateDeviceProfileRequest extends js.Object {
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var LoRaWAN: js.UndefOr[LoRaWANDeviceProfile]
    var Name: js.UndefOr[DeviceProfileName]
    var Tags: js.UndefOr[TagList]
  }

  object CreateDeviceProfileRequest {
    @inline
    def apply(
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        LoRaWAN: js.UndefOr[LoRaWANDeviceProfile] = js.undefined,
        Name: js.UndefOr[DeviceProfileName] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateDeviceProfileRequest = {
      val __obj = js.Dynamic.literal()
      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      LoRaWAN.foreach(__v => __obj.updateDynamic("LoRaWAN")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeviceProfileRequest]
    }
  }

  @js.native
  trait CreateDeviceProfileResponse extends js.Object {
    var Arn: js.UndefOr[DeviceProfileArn]
    var Id: js.UndefOr[DeviceProfileId]
  }

  object CreateDeviceProfileResponse {
    @inline
    def apply(
        Arn: js.UndefOr[DeviceProfileArn] = js.undefined,
        Id: js.UndefOr[DeviceProfileId] = js.undefined
    ): CreateDeviceProfileResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDeviceProfileResponse]
    }
  }

  @js.native
  trait CreateFuotaTaskRequest extends js.Object {
    var FirmwareUpdateImage: FirmwareUpdateImage
    var FirmwareUpdateRole: FirmwareUpdateRole
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Description: js.UndefOr[Description]
    var LoRaWAN: js.UndefOr[LoRaWANFuotaTask]
    var Name: js.UndefOr[FuotaTaskName]
    var Tags: js.UndefOr[TagList]
  }

  object CreateFuotaTaskRequest {
    @inline
    def apply(
        FirmwareUpdateImage: FirmwareUpdateImage,
        FirmwareUpdateRole: FirmwareUpdateRole,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        LoRaWAN: js.UndefOr[LoRaWANFuotaTask] = js.undefined,
        Name: js.UndefOr[FuotaTaskName] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateFuotaTaskRequest = {
      val __obj = js.Dynamic.literal(
        "FirmwareUpdateImage" -> FirmwareUpdateImage.asInstanceOf[js.Any],
        "FirmwareUpdateRole" -> FirmwareUpdateRole.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LoRaWAN.foreach(__v => __obj.updateDynamic("LoRaWAN")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFuotaTaskRequest]
    }
  }

  @js.native
  trait CreateFuotaTaskResponse extends js.Object {
    var Arn: js.UndefOr[FuotaTaskArn]
    var Id: js.UndefOr[FuotaTaskId]
  }

  object CreateFuotaTaskResponse {
    @inline
    def apply(
        Arn: js.UndefOr[FuotaTaskArn] = js.undefined,
        Id: js.UndefOr[FuotaTaskId] = js.undefined
    ): CreateFuotaTaskResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateFuotaTaskResponse]
    }
  }

  @js.native
  trait CreateMulticastGroupRequest extends js.Object {
    var LoRaWAN: LoRaWANMulticast
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Description: js.UndefOr[Description]
    var Name: js.UndefOr[MulticastGroupName]
    var Tags: js.UndefOr[TagList]
  }

  object CreateMulticastGroupRequest {
    @inline
    def apply(
        LoRaWAN: LoRaWANMulticast,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Name: js.UndefOr[MulticastGroupName] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateMulticastGroupRequest = {
      val __obj = js.Dynamic.literal(
        "LoRaWAN" -> LoRaWAN.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMulticastGroupRequest]
    }
  }

  @js.native
  trait CreateMulticastGroupResponse extends js.Object {
    var Arn: js.UndefOr[MulticastGroupArn]
    var Id: js.UndefOr[MulticastGroupId]
  }

  object CreateMulticastGroupResponse {
    @inline
    def apply(
        Arn: js.UndefOr[MulticastGroupArn] = js.undefined,
        Id: js.UndefOr[MulticastGroupId] = js.undefined
    ): CreateMulticastGroupResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMulticastGroupResponse]
    }
  }

  @js.native
  trait CreateNetworkAnalyzerConfigurationRequest extends js.Object {
    var Name: NetworkAnalyzerConfigurationName
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Description: js.UndefOr[Description]
    var Tags: js.UndefOr[TagList]
    var TraceContent: js.UndefOr[TraceContent]
    var WirelessDevices: js.UndefOr[WirelessDeviceList]
    var WirelessGateways: js.UndefOr[WirelessGatewayList]
  }

  object CreateNetworkAnalyzerConfigurationRequest {
    @inline
    def apply(
        Name: NetworkAnalyzerConfigurationName,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        TraceContent: js.UndefOr[TraceContent] = js.undefined,
        WirelessDevices: js.UndefOr[WirelessDeviceList] = js.undefined,
        WirelessGateways: js.UndefOr[WirelessGatewayList] = js.undefined
    ): CreateNetworkAnalyzerConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TraceContent.foreach(__v => __obj.updateDynamic("TraceContent")(__v.asInstanceOf[js.Any]))
      WirelessDevices.foreach(__v => __obj.updateDynamic("WirelessDevices")(__v.asInstanceOf[js.Any]))
      WirelessGateways.foreach(__v => __obj.updateDynamic("WirelessGateways")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNetworkAnalyzerConfigurationRequest]
    }
  }

  @js.native
  trait CreateNetworkAnalyzerConfigurationResponse extends js.Object {
    var Arn: js.UndefOr[NetworkAnalyzerConfigurationArn]
    var Name: js.UndefOr[NetworkAnalyzerConfigurationName]
  }

  object CreateNetworkAnalyzerConfigurationResponse {
    @inline
    def apply(
        Arn: js.UndefOr[NetworkAnalyzerConfigurationArn] = js.undefined,
        Name: js.UndefOr[NetworkAnalyzerConfigurationName] = js.undefined
    ): CreateNetworkAnalyzerConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateNetworkAnalyzerConfigurationResponse]
    }
  }

  @js.native
  trait CreateServiceProfileRequest extends js.Object {
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var LoRaWAN: js.UndefOr[LoRaWANServiceProfile]
    var Name: js.UndefOr[ServiceProfileName]
    var Tags: js.UndefOr[TagList]
  }

  object CreateServiceProfileRequest {
    @inline
    def apply(
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        LoRaWAN: js.UndefOr[LoRaWANServiceProfile] = js.undefined,
        Name: js.UndefOr[ServiceProfileName] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateServiceProfileRequest = {
      val __obj = js.Dynamic.literal()
      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      LoRaWAN.foreach(__v => __obj.updateDynamic("LoRaWAN")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateServiceProfileRequest]
    }
  }

  @js.native
  trait CreateServiceProfileResponse extends js.Object {
    var Arn: js.UndefOr[ServiceProfileArn]
    var Id: js.UndefOr[ServiceProfileId]
  }

  object CreateServiceProfileResponse {
    @inline
    def apply(
        Arn: js.UndefOr[ServiceProfileArn] = js.undefined,
        Id: js.UndefOr[ServiceProfileId] = js.undefined
    ): CreateServiceProfileResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateServiceProfileResponse]
    }
  }

  @js.native
  trait CreateWirelessDeviceRequest extends js.Object {
    var DestinationName: DestinationName
    var Type: WirelessDeviceType
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Description: js.UndefOr[Description]
    var LoRaWAN: js.UndefOr[LoRaWANDevice]
    var Name: js.UndefOr[WirelessDeviceName]
    var Positioning: js.UndefOr[PositioningConfigStatus]
    var Tags: js.UndefOr[TagList]
  }

  object CreateWirelessDeviceRequest {
    @inline
    def apply(
        DestinationName: DestinationName,
        Type: WirelessDeviceType,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        LoRaWAN: js.UndefOr[LoRaWANDevice] = js.undefined,
        Name: js.UndefOr[WirelessDeviceName] = js.undefined,
        Positioning: js.UndefOr[PositioningConfigStatus] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateWirelessDeviceRequest = {
      val __obj = js.Dynamic.literal(
        "DestinationName" -> DestinationName.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LoRaWAN.foreach(__v => __obj.updateDynamic("LoRaWAN")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Positioning.foreach(__v => __obj.updateDynamic("Positioning")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWirelessDeviceRequest]
    }
  }

  @js.native
  trait CreateWirelessDeviceResponse extends js.Object {
    var Arn: js.UndefOr[WirelessDeviceArn]
    var Id: js.UndefOr[WirelessDeviceId]
  }

  object CreateWirelessDeviceResponse {
    @inline
    def apply(
        Arn: js.UndefOr[WirelessDeviceArn] = js.undefined,
        Id: js.UndefOr[WirelessDeviceId] = js.undefined
    ): CreateWirelessDeviceResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWirelessDeviceResponse]
    }
  }

  @js.native
  trait CreateWirelessGatewayRequest extends js.Object {
    var LoRaWAN: LoRaWANGateway
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Description: js.UndefOr[Description]
    var Name: js.UndefOr[WirelessGatewayName]
    var Tags: js.UndefOr[TagList]
  }

  object CreateWirelessGatewayRequest {
    @inline
    def apply(
        LoRaWAN: LoRaWANGateway,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Name: js.UndefOr[WirelessGatewayName] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateWirelessGatewayRequest = {
      val __obj = js.Dynamic.literal(
        "LoRaWAN" -> LoRaWAN.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWirelessGatewayRequest]
    }
  }

  @js.native
  trait CreateWirelessGatewayResponse extends js.Object {
    var Arn: js.UndefOr[WirelessGatewayArn]
    var Id: js.UndefOr[WirelessDeviceId]
  }

  object CreateWirelessGatewayResponse {
    @inline
    def apply(
        Arn: js.UndefOr[WirelessGatewayArn] = js.undefined,
        Id: js.UndefOr[WirelessDeviceId] = js.undefined
    ): CreateWirelessGatewayResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWirelessGatewayResponse]
    }
  }

  @js.native
  trait CreateWirelessGatewayTaskDefinitionRequest extends js.Object {
    var AutoCreateTasks: AutoCreateTasks
    var ClientRequestToken: js.UndefOr[ClientRequestToken]
    var Name: js.UndefOr[WirelessGatewayTaskName]
    var Tags: js.UndefOr[TagList]
    var Update: js.UndefOr[UpdateWirelessGatewayTaskCreate]
  }

  object CreateWirelessGatewayTaskDefinitionRequest {
    @inline
    def apply(
        AutoCreateTasks: AutoCreateTasks,
        ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined,
        Name: js.UndefOr[WirelessGatewayTaskName] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined,
        Update: js.UndefOr[UpdateWirelessGatewayTaskCreate] = js.undefined
    ): CreateWirelessGatewayTaskDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "AutoCreateTasks" -> AutoCreateTasks.asInstanceOf[js.Any]
      )

      ClientRequestToken.foreach(__v => __obj.updateDynamic("ClientRequestToken")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Update.foreach(__v => __obj.updateDynamic("Update")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWirelessGatewayTaskDefinitionRequest]
    }
  }

  @js.native
  trait CreateWirelessGatewayTaskDefinitionResponse extends js.Object {
    var Arn: js.UndefOr[WirelessGatewayTaskDefinitionArn]
    var Id: js.UndefOr[WirelessGatewayTaskDefinitionId]
  }

  object CreateWirelessGatewayTaskDefinitionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[WirelessGatewayTaskDefinitionArn] = js.undefined,
        Id: js.UndefOr[WirelessGatewayTaskDefinitionId] = js.undefined
    ): CreateWirelessGatewayTaskDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWirelessGatewayTaskDefinitionResponse]
    }
  }

  @js.native
  trait CreateWirelessGatewayTaskRequest extends js.Object {
    var Id: WirelessGatewayId
    var WirelessGatewayTaskDefinitionId: WirelessGatewayTaskDefinitionId
  }

  object CreateWirelessGatewayTaskRequest {
    @inline
    def apply(
        Id: WirelessGatewayId,
        WirelessGatewayTaskDefinitionId: WirelessGatewayTaskDefinitionId
    ): CreateWirelessGatewayTaskRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "WirelessGatewayTaskDefinitionId" -> WirelessGatewayTaskDefinitionId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateWirelessGatewayTaskRequest]
    }
  }

  @js.native
  trait CreateWirelessGatewayTaskResponse extends js.Object {
    var Status: js.UndefOr[WirelessGatewayTaskStatus]
    var WirelessGatewayTaskDefinitionId: js.UndefOr[WirelessGatewayTaskDefinitionId]
  }

  object CreateWirelessGatewayTaskResponse {
    @inline
    def apply(
        Status: js.UndefOr[WirelessGatewayTaskStatus] = js.undefined,
        WirelessGatewayTaskDefinitionId: js.UndefOr[WirelessGatewayTaskDefinitionId] = js.undefined
    ): CreateWirelessGatewayTaskResponse = {
      val __obj = js.Dynamic.literal()
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      WirelessGatewayTaskDefinitionId.foreach(__v => __obj.updateDynamic("WirelessGatewayTaskDefinitionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateWirelessGatewayTaskResponse]
    }
  }

  @js.native
  trait DeleteDestinationRequest extends js.Object {
    var Name: DestinationName
  }

  object DeleteDestinationRequest {
    @inline
    def apply(
        Name: DestinationName
    ): DeleteDestinationRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDestinationRequest]
    }
  }

  @js.native
  trait DeleteDestinationResponse extends js.Object

  object DeleteDestinationResponse {
    @inline
    def apply(): DeleteDestinationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteDestinationResponse]
    }
  }

  @js.native
  trait DeleteDeviceProfileRequest extends js.Object {
    var Id: DeviceProfileId
  }

  object DeleteDeviceProfileRequest {
    @inline
    def apply(
        Id: DeviceProfileId
    ): DeleteDeviceProfileRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDeviceProfileRequest]
    }
  }

  @js.native
  trait DeleteDeviceProfileResponse extends js.Object

  object DeleteDeviceProfileResponse {
    @inline
    def apply(): DeleteDeviceProfileResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteDeviceProfileResponse]
    }
  }

  @js.native
  trait DeleteFuotaTaskRequest extends js.Object {
    var Id: FuotaTaskId
  }

  object DeleteFuotaTaskRequest {
    @inline
    def apply(
        Id: FuotaTaskId
    ): DeleteFuotaTaskRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteFuotaTaskRequest]
    }
  }

  @js.native
  trait DeleteFuotaTaskResponse extends js.Object

  object DeleteFuotaTaskResponse {
    @inline
    def apply(): DeleteFuotaTaskResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteFuotaTaskResponse]
    }
  }

  @js.native
  trait DeleteMulticastGroupRequest extends js.Object {
    var Id: MulticastGroupId
  }

  object DeleteMulticastGroupRequest {
    @inline
    def apply(
        Id: MulticastGroupId
    ): DeleteMulticastGroupRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteMulticastGroupRequest]
    }
  }

  @js.native
  trait DeleteMulticastGroupResponse extends js.Object

  object DeleteMulticastGroupResponse {
    @inline
    def apply(): DeleteMulticastGroupResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteMulticastGroupResponse]
    }
  }

  @js.native
  trait DeleteNetworkAnalyzerConfigurationRequest extends js.Object {
    var ConfigurationName: NetworkAnalyzerConfigurationName
  }

  object DeleteNetworkAnalyzerConfigurationRequest {
    @inline
    def apply(
        ConfigurationName: NetworkAnalyzerConfigurationName
    ): DeleteNetworkAnalyzerConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationName" -> ConfigurationName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteNetworkAnalyzerConfigurationRequest]
    }
  }

  @js.native
  trait DeleteNetworkAnalyzerConfigurationResponse extends js.Object

  object DeleteNetworkAnalyzerConfigurationResponse {
    @inline
    def apply(): DeleteNetworkAnalyzerConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteNetworkAnalyzerConfigurationResponse]
    }
  }

  @js.native
  trait DeleteQueuedMessagesRequest extends js.Object {
    var Id: WirelessDeviceId
    var MessageId: MessageId
    var WirelessDeviceType: js.UndefOr[WirelessDeviceType]
  }

  object DeleteQueuedMessagesRequest {
    @inline
    def apply(
        Id: WirelessDeviceId,
        MessageId: MessageId,
        WirelessDeviceType: js.UndefOr[WirelessDeviceType] = js.undefined
    ): DeleteQueuedMessagesRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "MessageId" -> MessageId.asInstanceOf[js.Any]
      )

      WirelessDeviceType.foreach(__v => __obj.updateDynamic("WirelessDeviceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteQueuedMessagesRequest]
    }
  }

  @js.native
  trait DeleteQueuedMessagesResponse extends js.Object

  object DeleteQueuedMessagesResponse {
    @inline
    def apply(): DeleteQueuedMessagesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteQueuedMessagesResponse]
    }
  }

  @js.native
  trait DeleteServiceProfileRequest extends js.Object {
    var Id: ServiceProfileId
  }

  object DeleteServiceProfileRequest {
    @inline
    def apply(
        Id: ServiceProfileId
    ): DeleteServiceProfileRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteServiceProfileRequest]
    }
  }

  @js.native
  trait DeleteServiceProfileResponse extends js.Object

  object DeleteServiceProfileResponse {
    @inline
    def apply(): DeleteServiceProfileResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteServiceProfileResponse]
    }
  }

  @js.native
  trait DeleteWirelessDeviceRequest extends js.Object {
    var Id: WirelessDeviceId
  }

  object DeleteWirelessDeviceRequest {
    @inline
    def apply(
        Id: WirelessDeviceId
    ): DeleteWirelessDeviceRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteWirelessDeviceRequest]
    }
  }

  @js.native
  trait DeleteWirelessDeviceResponse extends js.Object

  object DeleteWirelessDeviceResponse {
    @inline
    def apply(): DeleteWirelessDeviceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteWirelessDeviceResponse]
    }
  }

  @js.native
  trait DeleteWirelessGatewayRequest extends js.Object {
    var Id: WirelessGatewayId
  }

  object DeleteWirelessGatewayRequest {
    @inline
    def apply(
        Id: WirelessGatewayId
    ): DeleteWirelessGatewayRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteWirelessGatewayRequest]
    }
  }

  @js.native
  trait DeleteWirelessGatewayResponse extends js.Object

  object DeleteWirelessGatewayResponse {
    @inline
    def apply(): DeleteWirelessGatewayResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteWirelessGatewayResponse]
    }
  }

  @js.native
  trait DeleteWirelessGatewayTaskDefinitionRequest extends js.Object {
    var Id: WirelessGatewayTaskDefinitionId
  }

  object DeleteWirelessGatewayTaskDefinitionRequest {
    @inline
    def apply(
        Id: WirelessGatewayTaskDefinitionId
    ): DeleteWirelessGatewayTaskDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteWirelessGatewayTaskDefinitionRequest]
    }
  }

  @js.native
  trait DeleteWirelessGatewayTaskDefinitionResponse extends js.Object

  object DeleteWirelessGatewayTaskDefinitionResponse {
    @inline
    def apply(): DeleteWirelessGatewayTaskDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteWirelessGatewayTaskDefinitionResponse]
    }
  }

  @js.native
  trait DeleteWirelessGatewayTaskRequest extends js.Object {
    var Id: WirelessGatewayId
  }

  object DeleteWirelessGatewayTaskRequest {
    @inline
    def apply(
        Id: WirelessGatewayId
    ): DeleteWirelessGatewayTaskRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteWirelessGatewayTaskRequest]
    }
  }

  @js.native
  trait DeleteWirelessGatewayTaskResponse extends js.Object

  object DeleteWirelessGatewayTaskResponse {
    @inline
    def apply(): DeleteWirelessGatewayTaskResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteWirelessGatewayTaskResponse]
    }
  }

  /** Describes a destination.
    */
  @js.native
  trait Destinations extends js.Object {
    var Arn: js.UndefOr[DestinationArn]
    var Description: js.UndefOr[Description]
    var Expression: js.UndefOr[Expression]
    var ExpressionType: js.UndefOr[ExpressionType]
    var Name: js.UndefOr[DestinationName]
    var RoleArn: js.UndefOr[RoleArn]
  }

  object Destinations {
    @inline
    def apply(
        Arn: js.UndefOr[DestinationArn] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Expression: js.UndefOr[Expression] = js.undefined,
        ExpressionType: js.UndefOr[ExpressionType] = js.undefined,
        Name: js.UndefOr[DestinationName] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined
    ): Destinations = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Expression.foreach(__v => __obj.updateDynamic("Expression")(__v.asInstanceOf[js.Any]))
      ExpressionType.foreach(__v => __obj.updateDynamic("ExpressionType")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Destinations]
    }
  }

  /** Describes a device profile.
    */
  @js.native
  trait DeviceProfile extends js.Object {
    var Arn: js.UndefOr[DeviceProfileArn]
    var Id: js.UndefOr[DeviceProfileId]
    var Name: js.UndefOr[DeviceProfileName]
  }

  object DeviceProfile {
    @inline
    def apply(
        Arn: js.UndefOr[DeviceProfileArn] = js.undefined,
        Id: js.UndefOr[DeviceProfileId] = js.undefined,
        Name: js.UndefOr[DeviceProfileName] = js.undefined
    ): DeviceProfile = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceProfile]
    }
  }

  /** Device registration state event configuration object for enabling and disabling relevant topics.
    */
  @js.native
  trait DeviceRegistrationStateEventConfiguration extends js.Object {
    var Sidewalk: js.UndefOr[SidewalkEventNotificationConfigurations]
    var WirelessDeviceIdEventTopic: js.UndefOr[EventNotificationTopicStatus]
  }

  object DeviceRegistrationStateEventConfiguration {
    @inline
    def apply(
        Sidewalk: js.UndefOr[SidewalkEventNotificationConfigurations] = js.undefined,
        WirelessDeviceIdEventTopic: js.UndefOr[EventNotificationTopicStatus] = js.undefined
    ): DeviceRegistrationStateEventConfiguration = {
      val __obj = js.Dynamic.literal()
      Sidewalk.foreach(__v => __obj.updateDynamic("Sidewalk")(__v.asInstanceOf[js.Any]))
      WirelessDeviceIdEventTopic.foreach(__v => __obj.updateDynamic("WirelessDeviceIdEventTopic")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceRegistrationStateEventConfiguration]
    }
  }

  /** Device registration state resource type event configuration object for enabling or disabling topic.
    */
  @js.native
  trait DeviceRegistrationStateResourceTypeEventConfiguration extends js.Object {
    var Sidewalk: js.UndefOr[SidewalkResourceTypeEventConfiguration]
  }

  object DeviceRegistrationStateResourceTypeEventConfiguration {
    @inline
    def apply(
        Sidewalk: js.UndefOr[SidewalkResourceTypeEventConfiguration] = js.undefined
    ): DeviceRegistrationStateResourceTypeEventConfiguration = {
      val __obj = js.Dynamic.literal()
      Sidewalk.foreach(__v => __obj.updateDynamic("Sidewalk")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceRegistrationStateResourceTypeEventConfiguration]
    }
  }

  @js.native
  trait DisassociateAwsAccountFromPartnerAccountRequest extends js.Object {
    var PartnerAccountId: PartnerAccountId
    var PartnerType: PartnerType
  }

  object DisassociateAwsAccountFromPartnerAccountRequest {
    @inline
    def apply(
        PartnerAccountId: PartnerAccountId,
        PartnerType: PartnerType
    ): DisassociateAwsAccountFromPartnerAccountRequest = {
      val __obj = js.Dynamic.literal(
        "PartnerAccountId" -> PartnerAccountId.asInstanceOf[js.Any],
        "PartnerType" -> PartnerType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateAwsAccountFromPartnerAccountRequest]
    }
  }

  @js.native
  trait DisassociateAwsAccountFromPartnerAccountResponse extends js.Object

  object DisassociateAwsAccountFromPartnerAccountResponse {
    @inline
    def apply(): DisassociateAwsAccountFromPartnerAccountResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateAwsAccountFromPartnerAccountResponse]
    }
  }

  @js.native
  trait DisassociateMulticastGroupFromFuotaTaskRequest extends js.Object {
    var Id: FuotaTaskId
    var MulticastGroupId: MulticastGroupId
  }

  object DisassociateMulticastGroupFromFuotaTaskRequest {
    @inline
    def apply(
        Id: FuotaTaskId,
        MulticastGroupId: MulticastGroupId
    ): DisassociateMulticastGroupFromFuotaTaskRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "MulticastGroupId" -> MulticastGroupId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateMulticastGroupFromFuotaTaskRequest]
    }
  }

  @js.native
  trait DisassociateMulticastGroupFromFuotaTaskResponse extends js.Object

  object DisassociateMulticastGroupFromFuotaTaskResponse {
    @inline
    def apply(): DisassociateMulticastGroupFromFuotaTaskResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateMulticastGroupFromFuotaTaskResponse]
    }
  }

  @js.native
  trait DisassociateWirelessDeviceFromFuotaTaskRequest extends js.Object {
    var Id: FuotaTaskId
    var WirelessDeviceId: WirelessDeviceId
  }

  object DisassociateWirelessDeviceFromFuotaTaskRequest {
    @inline
    def apply(
        Id: FuotaTaskId,
        WirelessDeviceId: WirelessDeviceId
    ): DisassociateWirelessDeviceFromFuotaTaskRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "WirelessDeviceId" -> WirelessDeviceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateWirelessDeviceFromFuotaTaskRequest]
    }
  }

  @js.native
  trait DisassociateWirelessDeviceFromFuotaTaskResponse extends js.Object

  object DisassociateWirelessDeviceFromFuotaTaskResponse {
    @inline
    def apply(): DisassociateWirelessDeviceFromFuotaTaskResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateWirelessDeviceFromFuotaTaskResponse]
    }
  }

  @js.native
  trait DisassociateWirelessDeviceFromMulticastGroupRequest extends js.Object {
    var Id: MulticastGroupId
    var WirelessDeviceId: WirelessDeviceId
  }

  object DisassociateWirelessDeviceFromMulticastGroupRequest {
    @inline
    def apply(
        Id: MulticastGroupId,
        WirelessDeviceId: WirelessDeviceId
    ): DisassociateWirelessDeviceFromMulticastGroupRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "WirelessDeviceId" -> WirelessDeviceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateWirelessDeviceFromMulticastGroupRequest]
    }
  }

  @js.native
  trait DisassociateWirelessDeviceFromMulticastGroupResponse extends js.Object

  object DisassociateWirelessDeviceFromMulticastGroupResponse {
    @inline
    def apply(): DisassociateWirelessDeviceFromMulticastGroupResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateWirelessDeviceFromMulticastGroupResponse]
    }
  }

  @js.native
  trait DisassociateWirelessDeviceFromThingRequest extends js.Object {
    var Id: WirelessDeviceId
  }

  object DisassociateWirelessDeviceFromThingRequest {
    @inline
    def apply(
        Id: WirelessDeviceId
    ): DisassociateWirelessDeviceFromThingRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateWirelessDeviceFromThingRequest]
    }
  }

  @js.native
  trait DisassociateWirelessDeviceFromThingResponse extends js.Object

  object DisassociateWirelessDeviceFromThingResponse {
    @inline
    def apply(): DisassociateWirelessDeviceFromThingResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateWirelessDeviceFromThingResponse]
    }
  }

  @js.native
  trait DisassociateWirelessGatewayFromCertificateRequest extends js.Object {
    var Id: WirelessGatewayId
  }

  object DisassociateWirelessGatewayFromCertificateRequest {
    @inline
    def apply(
        Id: WirelessGatewayId
    ): DisassociateWirelessGatewayFromCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateWirelessGatewayFromCertificateRequest]
    }
  }

  @js.native
  trait DisassociateWirelessGatewayFromCertificateResponse extends js.Object

  object DisassociateWirelessGatewayFromCertificateResponse {
    @inline
    def apply(): DisassociateWirelessGatewayFromCertificateResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateWirelessGatewayFromCertificateResponse]
    }
  }

  @js.native
  trait DisassociateWirelessGatewayFromThingRequest extends js.Object {
    var Id: WirelessGatewayId
  }

  object DisassociateWirelessGatewayFromThingRequest {
    @inline
    def apply(
        Id: WirelessGatewayId
    ): DisassociateWirelessGatewayFromThingRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DisassociateWirelessGatewayFromThingRequest]
    }
  }

  @js.native
  trait DisassociateWirelessGatewayFromThingResponse extends js.Object

  object DisassociateWirelessGatewayFromThingResponse {
    @inline
    def apply(): DisassociateWirelessGatewayFromThingResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisassociateWirelessGatewayFromThingResponse]
    }
  }

  /** The message in the downlink queue.
    */
  @js.native
  trait DownlinkQueueMessage extends js.Object {
    var LoRaWAN: js.UndefOr[LoRaWANSendDataToDevice]
    var MessageId: js.UndefOr[MessageId]
    var ReceivedAt: js.UndefOr[ISODateTimeString]
    var TransmitMode: js.UndefOr[TransmitMode]
  }

  object DownlinkQueueMessage {
    @inline
    def apply(
        LoRaWAN: js.UndefOr[LoRaWANSendDataToDevice] = js.undefined,
        MessageId: js.UndefOr[MessageId] = js.undefined,
        ReceivedAt: js.UndefOr[ISODateTimeString] = js.undefined,
        TransmitMode: js.UndefOr[TransmitMode] = js.undefined
    ): DownlinkQueueMessage = {
      val __obj = js.Dynamic.literal()
      LoRaWAN.foreach(__v => __obj.updateDynamic("LoRaWAN")(__v.asInstanceOf[js.Any]))
      MessageId.foreach(__v => __obj.updateDynamic("MessageId")(__v.asInstanceOf[js.Any]))
      ReceivedAt.foreach(__v => __obj.updateDynamic("ReceivedAt")(__v.asInstanceOf[js.Any]))
      TransmitMode.foreach(__v => __obj.updateDynamic("TransmitMode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DownlinkQueueMessage]
    }
  }

  /** Event configuration object for a single resource.
    */
  @js.native
  trait EventConfigurationItem extends js.Object {
    var Events: js.UndefOr[EventNotificationItemConfigurations]
    var Identifier: js.UndefOr[Identifier]
    var IdentifierType: js.UndefOr[IdentifierType]
    var PartnerType: js.UndefOr[EventNotificationPartnerType]
  }

  object EventConfigurationItem {
    @inline
    def apply(
        Events: js.UndefOr[EventNotificationItemConfigurations] = js.undefined,
        Identifier: js.UndefOr[Identifier] = js.undefined,
        IdentifierType: js.UndefOr[IdentifierType] = js.undefined,
        PartnerType: js.UndefOr[EventNotificationPartnerType] = js.undefined
    ): EventConfigurationItem = {
      val __obj = js.Dynamic.literal()
      Events.foreach(__v => __obj.updateDynamic("Events")(__v.asInstanceOf[js.Any]))
      Identifier.foreach(__v => __obj.updateDynamic("Identifier")(__v.asInstanceOf[js.Any]))
      IdentifierType.foreach(__v => __obj.updateDynamic("IdentifierType")(__v.asInstanceOf[js.Any]))
      PartnerType.foreach(__v => __obj.updateDynamic("PartnerType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventConfigurationItem]
    }
  }

  /** Object of all event configurations and the status of the event topics.
    */
  @js.native
  trait EventNotificationItemConfigurations extends js.Object {
    var ConnectionStatus: js.UndefOr[ConnectionStatusEventConfiguration]
    var DeviceRegistrationState: js.UndefOr[DeviceRegistrationStateEventConfiguration]
    var Join: js.UndefOr[JoinEventConfiguration]
    var MessageDeliveryStatus: js.UndefOr[MessageDeliveryStatusEventConfiguration]
    var Proximity: js.UndefOr[ProximityEventConfiguration]
  }

  object EventNotificationItemConfigurations {
    @inline
    def apply(
        ConnectionStatus: js.UndefOr[ConnectionStatusEventConfiguration] = js.undefined,
        DeviceRegistrationState: js.UndefOr[DeviceRegistrationStateEventConfiguration] = js.undefined,
        Join: js.UndefOr[JoinEventConfiguration] = js.undefined,
        MessageDeliveryStatus: js.UndefOr[MessageDeliveryStatusEventConfiguration] = js.undefined,
        Proximity: js.UndefOr[ProximityEventConfiguration] = js.undefined
    ): EventNotificationItemConfigurations = {
      val __obj = js.Dynamic.literal()
      ConnectionStatus.foreach(__v => __obj.updateDynamic("ConnectionStatus")(__v.asInstanceOf[js.Any]))
      DeviceRegistrationState.foreach(__v => __obj.updateDynamic("DeviceRegistrationState")(__v.asInstanceOf[js.Any]))
      Join.foreach(__v => __obj.updateDynamic("Join")(__v.asInstanceOf[js.Any]))
      MessageDeliveryStatus.foreach(__v => __obj.updateDynamic("MessageDeliveryStatus")(__v.asInstanceOf[js.Any]))
      Proximity.foreach(__v => __obj.updateDynamic("Proximity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventNotificationItemConfigurations]
    }
  }

  /** List of FPort assigned for different LoRaWAN application packages to use
    */
  @js.native
  trait FPorts extends js.Object {
    var Applications: js.UndefOr[Applications]
    var ClockSync: js.UndefOr[FPort]
    var Fuota: js.UndefOr[FPort]
    var Multicast: js.UndefOr[FPort]
    var Positioning: js.UndefOr[Positioning]
  }

  object FPorts {
    @inline
    def apply(
        Applications: js.UndefOr[Applications] = js.undefined,
        ClockSync: js.UndefOr[FPort] = js.undefined,
        Fuota: js.UndefOr[FPort] = js.undefined,
        Multicast: js.UndefOr[FPort] = js.undefined,
        Positioning: js.UndefOr[Positioning] = js.undefined
    ): FPorts = {
      val __obj = js.Dynamic.literal()
      Applications.foreach(__v => __obj.updateDynamic("Applications")(__v.asInstanceOf[js.Any]))
      ClockSync.foreach(__v => __obj.updateDynamic("ClockSync")(__v.asInstanceOf[js.Any]))
      Fuota.foreach(__v => __obj.updateDynamic("Fuota")(__v.asInstanceOf[js.Any]))
      Multicast.foreach(__v => __obj.updateDynamic("Multicast")(__v.asInstanceOf[js.Any]))
      Positioning.foreach(__v => __obj.updateDynamic("Positioning")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FPorts]
    }
  }

  /** A FUOTA task.
    */
  @js.native
  trait FuotaTask extends js.Object {
    var Arn: js.UndefOr[FuotaTaskArn]
    var Id: js.UndefOr[FuotaTaskId]
    var Name: js.UndefOr[FuotaTaskName]
  }

  object FuotaTask {
    @inline
    def apply(
        Arn: js.UndefOr[FuotaTaskArn] = js.undefined,
        Id: js.UndefOr[FuotaTaskId] = js.undefined,
        Name: js.UndefOr[FuotaTaskName] = js.undefined
    ): FuotaTask = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FuotaTask]
    }
  }

  /** Gateway list item object that specifies the frequency and list of gateways for which the downlink message should be sent.
    */
  @js.native
  trait GatewayListItem extends js.Object {
    var DownlinkFrequency: DownlinkFrequency
    var GatewayId: WirelessGatewayId
  }

  object GatewayListItem {
    @inline
    def apply(
        DownlinkFrequency: DownlinkFrequency,
        GatewayId: WirelessGatewayId
    ): GatewayListItem = {
      val __obj = js.Dynamic.literal(
        "DownlinkFrequency" -> DownlinkFrequency.asInstanceOf[js.Any],
        "GatewayId" -> GatewayId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GatewayListItem]
    }
  }

  @js.native
  trait GetDestinationRequest extends js.Object {
    var Name: DestinationName
  }

  object GetDestinationRequest {
    @inline
    def apply(
        Name: DestinationName
    ): GetDestinationRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDestinationRequest]
    }
  }

  @js.native
  trait GetDestinationResponse extends js.Object {
    var Arn: js.UndefOr[DestinationArn]
    var Description: js.UndefOr[Description]
    var Expression: js.UndefOr[Expression]
    var ExpressionType: js.UndefOr[ExpressionType]
    var Name: js.UndefOr[DestinationName]
    var RoleArn: js.UndefOr[RoleArn]
  }

  object GetDestinationResponse {
    @inline
    def apply(
        Arn: js.UndefOr[DestinationArn] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Expression: js.UndefOr[Expression] = js.undefined,
        ExpressionType: js.UndefOr[ExpressionType] = js.undefined,
        Name: js.UndefOr[DestinationName] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined
    ): GetDestinationResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Expression.foreach(__v => __obj.updateDynamic("Expression")(__v.asInstanceOf[js.Any]))
      ExpressionType.foreach(__v => __obj.updateDynamic("ExpressionType")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDestinationResponse]
    }
  }

  @js.native
  trait GetDeviceProfileRequest extends js.Object {
    var Id: DeviceProfileId
  }

  object GetDeviceProfileRequest {
    @inline
    def apply(
        Id: DeviceProfileId
    ): GetDeviceProfileRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDeviceProfileRequest]
    }
  }

  @js.native
  trait GetDeviceProfileResponse extends js.Object {
    var Arn: js.UndefOr[DeviceProfileArn]
    var Id: js.UndefOr[DeviceProfileId]
    var LoRaWAN: js.UndefOr[LoRaWANDeviceProfile]
    var Name: js.UndefOr[DeviceProfileName]
  }

  object GetDeviceProfileResponse {
    @inline
    def apply(
        Arn: js.UndefOr[DeviceProfileArn] = js.undefined,
        Id: js.UndefOr[DeviceProfileId] = js.undefined,
        LoRaWAN: js.UndefOr[LoRaWANDeviceProfile] = js.undefined,
        Name: js.UndefOr[DeviceProfileName] = js.undefined
    ): GetDeviceProfileResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LoRaWAN.foreach(__v => __obj.updateDynamic("LoRaWAN")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeviceProfileResponse]
    }
  }

  @js.native
  trait GetEventConfigurationByResourceTypesRequest extends js.Object

  object GetEventConfigurationByResourceTypesRequest {
    @inline
    def apply(): GetEventConfigurationByResourceTypesRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetEventConfigurationByResourceTypesRequest]
    }
  }

  @js.native
  trait GetEventConfigurationByResourceTypesResponse extends js.Object {
    var ConnectionStatus: js.UndefOr[ConnectionStatusResourceTypeEventConfiguration]
    var DeviceRegistrationState: js.UndefOr[DeviceRegistrationStateResourceTypeEventConfiguration]
    var Join: js.UndefOr[JoinResourceTypeEventConfiguration]
    var MessageDeliveryStatus: js.UndefOr[MessageDeliveryStatusResourceTypeEventConfiguration]
    var Proximity: js.UndefOr[ProximityResourceTypeEventConfiguration]
  }

  object GetEventConfigurationByResourceTypesResponse {
    @inline
    def apply(
        ConnectionStatus: js.UndefOr[ConnectionStatusResourceTypeEventConfiguration] = js.undefined,
        DeviceRegistrationState: js.UndefOr[DeviceRegistrationStateResourceTypeEventConfiguration] = js.undefined,
        Join: js.UndefOr[JoinResourceTypeEventConfiguration] = js.undefined,
        MessageDeliveryStatus: js.UndefOr[MessageDeliveryStatusResourceTypeEventConfiguration] = js.undefined,
        Proximity: js.UndefOr[ProximityResourceTypeEventConfiguration] = js.undefined
    ): GetEventConfigurationByResourceTypesResponse = {
      val __obj = js.Dynamic.literal()
      ConnectionStatus.foreach(__v => __obj.updateDynamic("ConnectionStatus")(__v.asInstanceOf[js.Any]))
      DeviceRegistrationState.foreach(__v => __obj.updateDynamic("DeviceRegistrationState")(__v.asInstanceOf[js.Any]))
      Join.foreach(__v => __obj.updateDynamic("Join")(__v.asInstanceOf[js.Any]))
      MessageDeliveryStatus.foreach(__v => __obj.updateDynamic("MessageDeliveryStatus")(__v.asInstanceOf[js.Any]))
      Proximity.foreach(__v => __obj.updateDynamic("Proximity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEventConfigurationByResourceTypesResponse]
    }
  }

  @js.native
  trait GetFuotaTaskRequest extends js.Object {
    var Id: FuotaTaskId
  }

  object GetFuotaTaskRequest {
    @inline
    def apply(
        Id: FuotaTaskId
    ): GetFuotaTaskRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetFuotaTaskRequest]
    }
  }

  @js.native
  trait GetFuotaTaskResponse extends js.Object {
    var Arn: js.UndefOr[FuotaTaskArn]
    var CreatedAt: js.UndefOr[CreatedAt]
    var Description: js.UndefOr[Description]
    var FirmwareUpdateImage: js.UndefOr[FirmwareUpdateImage]
    var FirmwareUpdateRole: js.UndefOr[FirmwareUpdateRole]
    var Id: js.UndefOr[FuotaTaskId]
    var LoRaWAN: js.UndefOr[LoRaWANFuotaTaskGetInfo]
    var Name: js.UndefOr[FuotaTaskName]
    var Status: js.UndefOr[FuotaTaskStatus]
  }

  object GetFuotaTaskResponse {
    @inline
    def apply(
        Arn: js.UndefOr[FuotaTaskArn] = js.undefined,
        CreatedAt: js.UndefOr[CreatedAt] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        FirmwareUpdateImage: js.UndefOr[FirmwareUpdateImage] = js.undefined,
        FirmwareUpdateRole: js.UndefOr[FirmwareUpdateRole] = js.undefined,
        Id: js.UndefOr[FuotaTaskId] = js.undefined,
        LoRaWAN: js.UndefOr[LoRaWANFuotaTaskGetInfo] = js.undefined,
        Name: js.UndefOr[FuotaTaskName] = js.undefined,
        Status: js.UndefOr[FuotaTaskStatus] = js.undefined
    ): GetFuotaTaskResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      FirmwareUpdateImage.foreach(__v => __obj.updateDynamic("FirmwareUpdateImage")(__v.asInstanceOf[js.Any]))
      FirmwareUpdateRole.foreach(__v => __obj.updateDynamic("FirmwareUpdateRole")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LoRaWAN.foreach(__v => __obj.updateDynamic("LoRaWAN")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetFuotaTaskResponse]
    }
  }

  @js.native
  trait GetLogLevelsByResourceTypesRequest extends js.Object

  object GetLogLevelsByResourceTypesRequest {
    @inline
    def apply(): GetLogLevelsByResourceTypesRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetLogLevelsByResourceTypesRequest]
    }
  }

  @js.native
  trait GetLogLevelsByResourceTypesResponse extends js.Object {
    var DefaultLogLevel: js.UndefOr[LogLevel]
    var WirelessDeviceLogOptions: js.UndefOr[WirelessDeviceLogOptionList]
    var WirelessGatewayLogOptions: js.UndefOr[WirelessGatewayLogOptionList]
  }

  object GetLogLevelsByResourceTypesResponse {
    @inline
    def apply(
        DefaultLogLevel: js.UndefOr[LogLevel] = js.undefined,
        WirelessDeviceLogOptions: js.UndefOr[WirelessDeviceLogOptionList] = js.undefined,
        WirelessGatewayLogOptions: js.UndefOr[WirelessGatewayLogOptionList] = js.undefined
    ): GetLogLevelsByResourceTypesResponse = {
      val __obj = js.Dynamic.literal()
      DefaultLogLevel.foreach(__v => __obj.updateDynamic("DefaultLogLevel")(__v.asInstanceOf[js.Any]))
      WirelessDeviceLogOptions.foreach(__v => __obj.updateDynamic("WirelessDeviceLogOptions")(__v.asInstanceOf[js.Any]))
      WirelessGatewayLogOptions.foreach(__v => __obj.updateDynamic("WirelessGatewayLogOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetLogLevelsByResourceTypesResponse]
    }
  }

  @js.native
  trait GetMulticastGroupRequest extends js.Object {
    var Id: MulticastGroupId
  }

  object GetMulticastGroupRequest {
    @inline
    def apply(
        Id: MulticastGroupId
    ): GetMulticastGroupRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMulticastGroupRequest]
    }
  }

  @js.native
  trait GetMulticastGroupResponse extends js.Object {
    var Arn: js.UndefOr[MulticastGroupArn]
    var CreatedAt: js.UndefOr[CreatedAt]
    var Description: js.UndefOr[Description]
    var Id: js.UndefOr[MulticastGroupId]
    var LoRaWAN: js.UndefOr[LoRaWANMulticastGet]
    var Name: js.UndefOr[MulticastGroupName]
    var Status: js.UndefOr[MulticastGroupStatus]
  }

  object GetMulticastGroupResponse {
    @inline
    def apply(
        Arn: js.UndefOr[MulticastGroupArn] = js.undefined,
        CreatedAt: js.UndefOr[CreatedAt] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Id: js.UndefOr[MulticastGroupId] = js.undefined,
        LoRaWAN: js.UndefOr[LoRaWANMulticastGet] = js.undefined,
        Name: js.UndefOr[MulticastGroupName] = js.undefined,
        Status: js.UndefOr[MulticastGroupStatus] = js.undefined
    ): GetMulticastGroupResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreatedAt.foreach(__v => __obj.updateDynamic("CreatedAt")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LoRaWAN.foreach(__v => __obj.updateDynamic("LoRaWAN")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMulticastGroupResponse]
    }
  }

  @js.native
  trait GetMulticastGroupSessionRequest extends js.Object {
    var Id: MulticastGroupId
  }

  object GetMulticastGroupSessionRequest {
    @inline
    def apply(
        Id: MulticastGroupId
    ): GetMulticastGroupSessionRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMulticastGroupSessionRequest]
    }
  }

  @js.native
  trait GetMulticastGroupSessionResponse extends js.Object {
    var LoRaWAN: js.UndefOr[LoRaWANMulticastSession]
  }

  object GetMulticastGroupSessionResponse {
    @inline
    def apply(
        LoRaWAN: js.UndefOr[LoRaWANMulticastSession] = js.undefined
    ): GetMulticastGroupSessionResponse = {
      val __obj = js.Dynamic.literal()
      LoRaWAN.foreach(__v => __obj.updateDynamic("LoRaWAN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMulticastGroupSessionResponse]
    }
  }

  @js.native
  trait GetNetworkAnalyzerConfigurationRequest extends js.Object {
    var ConfigurationName: NetworkAnalyzerConfigurationName
  }

  object GetNetworkAnalyzerConfigurationRequest {
    @inline
    def apply(
        ConfigurationName: NetworkAnalyzerConfigurationName
    ): GetNetworkAnalyzerConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationName" -> ConfigurationName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetNetworkAnalyzerConfigurationRequest]
    }
  }

  @js.native
  trait GetNetworkAnalyzerConfigurationResponse extends js.Object {
    var Arn: js.UndefOr[NetworkAnalyzerConfigurationArn]
    var Description: js.UndefOr[Description]
    var Name: js.UndefOr[NetworkAnalyzerConfigurationName]
    var TraceContent: js.UndefOr[TraceContent]
    var WirelessDevices: js.UndefOr[WirelessDeviceList]
    var WirelessGateways: js.UndefOr[WirelessGatewayList]
  }

  object GetNetworkAnalyzerConfigurationResponse {
    @inline
    def apply(
        Arn: js.UndefOr[NetworkAnalyzerConfigurationArn] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Name: js.UndefOr[NetworkAnalyzerConfigurationName] = js.undefined,
        TraceContent: js.UndefOr[TraceContent] = js.undefined,
        WirelessDevices: js.UndefOr[WirelessDeviceList] = js.undefined,
        WirelessGateways: js.UndefOr[WirelessGatewayList] = js.undefined
    ): GetNetworkAnalyzerConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      TraceContent.foreach(__v => __obj.updateDynamic("TraceContent")(__v.asInstanceOf[js.Any]))
      WirelessDevices.foreach(__v => __obj.updateDynamic("WirelessDevices")(__v.asInstanceOf[js.Any]))
      WirelessGateways.foreach(__v => __obj.updateDynamic("WirelessGateways")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetNetworkAnalyzerConfigurationResponse]
    }
  }

  @js.native
  trait GetPartnerAccountRequest extends js.Object {
    var PartnerAccountId: PartnerAccountId
    var PartnerType: PartnerType
  }

  object GetPartnerAccountRequest {
    @inline
    def apply(
        PartnerAccountId: PartnerAccountId,
        PartnerType: PartnerType
    ): GetPartnerAccountRequest = {
      val __obj = js.Dynamic.literal(
        "PartnerAccountId" -> PartnerAccountId.asInstanceOf[js.Any],
        "PartnerType" -> PartnerType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetPartnerAccountRequest]
    }
  }

  @js.native
  trait GetPartnerAccountResponse extends js.Object {
    var AccountLinked: js.UndefOr[AccountLinked]
    var Sidewalk: js.UndefOr[SidewalkAccountInfoWithFingerprint]
  }

  object GetPartnerAccountResponse {
    @inline
    def apply(
        AccountLinked: js.UndefOr[AccountLinked] = js.undefined,
        Sidewalk: js.UndefOr[SidewalkAccountInfoWithFingerprint] = js.undefined
    ): GetPartnerAccountResponse = {
      val __obj = js.Dynamic.literal()
      AccountLinked.foreach(__v => __obj.updateDynamic("AccountLinked")(__v.asInstanceOf[js.Any]))
      Sidewalk.foreach(__v => __obj.updateDynamic("Sidewalk")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPartnerAccountResponse]
    }
  }

  @deprecated("This operation is no longer supported.", "forever")
  @js.native
  trait GetPositionConfigurationRequest extends js.Object {
    var ResourceIdentifier: PositionResourceIdentifier
    var ResourceType: PositionResourceType
  }

  object GetPositionConfigurationRequest {
    @inline
    def apply(
        ResourceIdentifier: PositionResourceIdentifier,
        ResourceType: PositionResourceType
    ): GetPositionConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceIdentifier" -> ResourceIdentifier.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetPositionConfigurationRequest]
    }
  }

  @deprecated("This operation is no longer supported.", "forever")
  @js.native
  trait GetPositionConfigurationResponse extends js.Object {
    var Destination: js.UndefOr[DestinationName]
    var Solvers: js.UndefOr[PositionSolverDetails]
  }

  object GetPositionConfigurationResponse {
    @inline
    def apply(
        Destination: js.UndefOr[DestinationName] = js.undefined,
        Solvers: js.UndefOr[PositionSolverDetails] = js.undefined
    ): GetPositionConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      Solvers.foreach(__v => __obj.updateDynamic("Solvers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPositionConfigurationResponse]
    }
  }

  @js.native
  trait GetPositionEstimateRequest extends js.Object {
    var CellTowers: js.UndefOr[CellTowers]
    var Gnss: js.UndefOr[Gnss]
    var Ip: js.UndefOr[Ip]
    var Timestamp: js.UndefOr[CreationDate]
    var WiFiAccessPoints: js.UndefOr[WiFiAccessPoints]
  }

  object GetPositionEstimateRequest {
    @inline
    def apply(
        CellTowers: js.UndefOr[CellTowers] = js.undefined,
        Gnss: js.UndefOr[Gnss] = js.undefined,
        Ip: js.UndefOr[Ip] = js.undefined,
        Timestamp: js.UndefOr[CreationDate] = js.undefined,
        WiFiAccessPoints: js.UndefOr[WiFiAccessPoints] = js.undefined
    ): GetPositionEstimateRequest = {
      val __obj = js.Dynamic.literal()
      CellTowers.foreach(__v => __obj.updateDynamic("CellTowers")(__v.asInstanceOf[js.Any]))
      Gnss.foreach(__v => __obj.updateDynamic("Gnss")(__v.asInstanceOf[js.Any]))
      Ip.foreach(__v => __obj.updateDynamic("Ip")(__v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      WiFiAccessPoints.foreach(__v => __obj.updateDynamic("WiFiAccessPoints")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPositionEstimateRequest]
    }
  }

  @js.native
  trait GetPositionEstimateResponse extends js.Object {
    var GeoJsonPayload: js.UndefOr[GeoJsonPayload]
  }

  object GetPositionEstimateResponse {
    @inline
    def apply(
        GeoJsonPayload: js.UndefOr[GeoJsonPayload] = js.undefined
    ): GetPositionEstimateResponse = {
      val __obj = js.Dynamic.literal()
      GeoJsonPayload.foreach(__v => __obj.updateDynamic("GeoJsonPayload")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPositionEstimateResponse]
    }
  }

  @deprecated("This operation is no longer supported.", "forever")
  @js.native
  trait GetPositionRequest extends js.Object {
    var ResourceIdentifier: PositionResourceIdentifier
    var ResourceType: PositionResourceType
  }

  object GetPositionRequest {
    @inline
    def apply(
        ResourceIdentifier: PositionResourceIdentifier,
        ResourceType: PositionResourceType
    ): GetPositionRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceIdentifier" -> ResourceIdentifier.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetPositionRequest]
    }
  }

  @deprecated("This operation is no longer supported.", "forever")
  @js.native
  trait GetPositionResponse extends js.Object {
    var Accuracy: js.UndefOr[Accuracy]
    var Position: js.UndefOr[PositionCoordinate]
    var SolverProvider: js.UndefOr[PositionSolverProvider]
    var SolverType: js.UndefOr[PositionSolverType]
    var SolverVersion: js.UndefOr[PositionSolverVersion]
    var Timestamp: js.UndefOr[ISODateTimeString]
  }

  object GetPositionResponse {
    @inline
    def apply(
        Accuracy: js.UndefOr[Accuracy] = js.undefined,
        Position: js.UndefOr[PositionCoordinate] = js.undefined,
        SolverProvider: js.UndefOr[PositionSolverProvider] = js.undefined,
        SolverType: js.UndefOr[PositionSolverType] = js.undefined,
        SolverVersion: js.UndefOr[PositionSolverVersion] = js.undefined,
        Timestamp: js.UndefOr[ISODateTimeString] = js.undefined
    ): GetPositionResponse = {
      val __obj = js.Dynamic.literal()
      Accuracy.foreach(__v => __obj.updateDynamic("Accuracy")(__v.asInstanceOf[js.Any]))
      Position.foreach(__v => __obj.updateDynamic("Position")(__v.asInstanceOf[js.Any]))
      SolverProvider.foreach(__v => __obj.updateDynamic("SolverProvider")(__v.asInstanceOf[js.Any]))
      SolverType.foreach(__v => __obj.updateDynamic("SolverType")(__v.asInstanceOf[js.Any]))
      SolverVersion.foreach(__v => __obj.updateDynamic("SolverVersion")(__v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPositionResponse]
    }
  }

  @js.native
  trait GetResourceEventConfigurationRequest extends js.Object {
    var Identifier: Identifier
    var IdentifierType: IdentifierType
    var PartnerType: js.UndefOr[EventNotificationPartnerType]
  }

  object GetResourceEventConfigurationRequest {
    @inline
    def apply(
        Identifier: Identifier,
        IdentifierType: IdentifierType,
        PartnerType: js.UndefOr[EventNotificationPartnerType] = js.undefined
    ): GetResourceEventConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "Identifier" -> Identifier.asInstanceOf[js.Any],
        "IdentifierType" -> IdentifierType.asInstanceOf[js.Any]
      )

      PartnerType.foreach(__v => __obj.updateDynamic("PartnerType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourceEventConfigurationRequest]
    }
  }

  @js.native
  trait GetResourceEventConfigurationResponse extends js.Object {
    var ConnectionStatus: js.UndefOr[ConnectionStatusEventConfiguration]
    var DeviceRegistrationState: js.UndefOr[DeviceRegistrationStateEventConfiguration]
    var Join: js.UndefOr[JoinEventConfiguration]
    var MessageDeliveryStatus: js.UndefOr[MessageDeliveryStatusEventConfiguration]
    var Proximity: js.UndefOr[ProximityEventConfiguration]
  }

  object GetResourceEventConfigurationResponse {
    @inline
    def apply(
        ConnectionStatus: js.UndefOr[ConnectionStatusEventConfiguration] = js.undefined,
        DeviceRegistrationState: js.UndefOr[DeviceRegistrationStateEventConfiguration] = js.undefined,
        Join: js.UndefOr[JoinEventConfiguration] = js.undefined,
        MessageDeliveryStatus: js.UndefOr[MessageDeliveryStatusEventConfiguration] = js.undefined,
        Proximity: js.UndefOr[ProximityEventConfiguration] = js.undefined
    ): GetResourceEventConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      ConnectionStatus.foreach(__v => __obj.updateDynamic("ConnectionStatus")(__v.asInstanceOf[js.Any]))
      DeviceRegistrationState.foreach(__v => __obj.updateDynamic("DeviceRegistrationState")(__v.asInstanceOf[js.Any]))
      Join.foreach(__v => __obj.updateDynamic("Join")(__v.asInstanceOf[js.Any]))
      MessageDeliveryStatus.foreach(__v => __obj.updateDynamic("MessageDeliveryStatus")(__v.asInstanceOf[js.Any]))
      Proximity.foreach(__v => __obj.updateDynamic("Proximity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourceEventConfigurationResponse]
    }
  }

  @js.native
  trait GetResourceLogLevelRequest extends js.Object {
    var ResourceIdentifier: ResourceIdentifier
    var ResourceType: ResourceType
  }

  object GetResourceLogLevelRequest {
    @inline
    def apply(
        ResourceIdentifier: ResourceIdentifier,
        ResourceType: ResourceType
    ): GetResourceLogLevelRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceIdentifier" -> ResourceIdentifier.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetResourceLogLevelRequest]
    }
  }

  @js.native
  trait GetResourceLogLevelResponse extends js.Object {
    var LogLevel: js.UndefOr[LogLevel]
  }

  object GetResourceLogLevelResponse {
    @inline
    def apply(
        LogLevel: js.UndefOr[LogLevel] = js.undefined
    ): GetResourceLogLevelResponse = {
      val __obj = js.Dynamic.literal()
      LogLevel.foreach(__v => __obj.updateDynamic("LogLevel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourceLogLevelResponse]
    }
  }

  @js.native
  trait GetResourcePositionRequest extends js.Object {
    var ResourceIdentifier: PositionResourceIdentifier
    var ResourceType: PositionResourceType
  }

  object GetResourcePositionRequest {
    @inline
    def apply(
        ResourceIdentifier: PositionResourceIdentifier,
        ResourceType: PositionResourceType
    ): GetResourcePositionRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceIdentifier" -> ResourceIdentifier.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetResourcePositionRequest]
    }
  }

  @js.native
  trait GetResourcePositionResponse extends js.Object {
    var GeoJsonPayload: js.UndefOr[GeoJsonPayload]
  }

  object GetResourcePositionResponse {
    @inline
    def apply(
        GeoJsonPayload: js.UndefOr[GeoJsonPayload] = js.undefined
    ): GetResourcePositionResponse = {
      val __obj = js.Dynamic.literal()
      GeoJsonPayload.foreach(__v => __obj.updateDynamic("GeoJsonPayload")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetResourcePositionResponse]
    }
  }

  @js.native
  trait GetServiceEndpointRequest extends js.Object {
    var ServiceType: js.UndefOr[WirelessGatewayServiceType]
  }

  object GetServiceEndpointRequest {
    @inline
    def apply(
        ServiceType: js.UndefOr[WirelessGatewayServiceType] = js.undefined
    ): GetServiceEndpointRequest = {
      val __obj = js.Dynamic.literal()
      ServiceType.foreach(__v => __obj.updateDynamic("ServiceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetServiceEndpointRequest]
    }
  }

  @js.native
  trait GetServiceEndpointResponse extends js.Object {
    var ServerTrust: js.UndefOr[CertificatePEM]
    var ServiceEndpoint: js.UndefOr[EndPoint]
    var ServiceType: js.UndefOr[WirelessGatewayServiceType]
  }

  object GetServiceEndpointResponse {
    @inline
    def apply(
        ServerTrust: js.UndefOr[CertificatePEM] = js.undefined,
        ServiceEndpoint: js.UndefOr[EndPoint] = js.undefined,
        ServiceType: js.UndefOr[WirelessGatewayServiceType] = js.undefined
    ): GetServiceEndpointResponse = {
      val __obj = js.Dynamic.literal()
      ServerTrust.foreach(__v => __obj.updateDynamic("ServerTrust")(__v.asInstanceOf[js.Any]))
      ServiceEndpoint.foreach(__v => __obj.updateDynamic("ServiceEndpoint")(__v.asInstanceOf[js.Any]))
      ServiceType.foreach(__v => __obj.updateDynamic("ServiceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetServiceEndpointResponse]
    }
  }

  @js.native
  trait GetServiceProfileRequest extends js.Object {
    var Id: ServiceProfileId
  }

  object GetServiceProfileRequest {
    @inline
    def apply(
        Id: ServiceProfileId
    ): GetServiceProfileRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetServiceProfileRequest]
    }
  }

  @js.native
  trait GetServiceProfileResponse extends js.Object {
    var Arn: js.UndefOr[ServiceProfileArn]
    var Id: js.UndefOr[ServiceProfileId]
    var LoRaWAN: js.UndefOr[LoRaWANGetServiceProfileInfo]
    var Name: js.UndefOr[ServiceProfileName]
  }

  object GetServiceProfileResponse {
    @inline
    def apply(
        Arn: js.UndefOr[ServiceProfileArn] = js.undefined,
        Id: js.UndefOr[ServiceProfileId] = js.undefined,
        LoRaWAN: js.UndefOr[LoRaWANGetServiceProfileInfo] = js.undefined,
        Name: js.UndefOr[ServiceProfileName] = js.undefined
    ): GetServiceProfileResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LoRaWAN.foreach(__v => __obj.updateDynamic("LoRaWAN")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetServiceProfileResponse]
    }
  }

  @js.native
  trait GetWirelessDeviceRequest extends js.Object {
    var Identifier: Identifier
    var IdentifierType: WirelessDeviceIdType
  }

  object GetWirelessDeviceRequest {
    @inline
    def apply(
        Identifier: Identifier,
        IdentifierType: WirelessDeviceIdType
    ): GetWirelessDeviceRequest = {
      val __obj = js.Dynamic.literal(
        "Identifier" -> Identifier.asInstanceOf[js.Any],
        "IdentifierType" -> IdentifierType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetWirelessDeviceRequest]
    }
  }

  @js.native
  trait GetWirelessDeviceResponse extends js.Object {
    var Arn: js.UndefOr[WirelessDeviceArn]
    var Description: js.UndefOr[Description]
    var DestinationName: js.UndefOr[DestinationName]
    var Id: js.UndefOr[WirelessDeviceId]
    var LoRaWAN: js.UndefOr[LoRaWANDevice]
    var Name: js.UndefOr[WirelessDeviceName]
    var Positioning: js.UndefOr[PositioningConfigStatus]
    var Sidewalk: js.UndefOr[SidewalkDevice]
    var ThingArn: js.UndefOr[ThingArn]
    var ThingName: js.UndefOr[ThingName]
    var Type: js.UndefOr[WirelessDeviceType]
  }

  object GetWirelessDeviceResponse {
    @inline
    def apply(
        Arn: js.UndefOr[WirelessDeviceArn] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        DestinationName: js.UndefOr[DestinationName] = js.undefined,
        Id: js.UndefOr[WirelessDeviceId] = js.undefined,
        LoRaWAN: js.UndefOr[LoRaWANDevice] = js.undefined,
        Name: js.UndefOr[WirelessDeviceName] = js.undefined,
        Positioning: js.UndefOr[PositioningConfigStatus] = js.undefined,
        Sidewalk: js.UndefOr[SidewalkDevice] = js.undefined,
        ThingArn: js.UndefOr[ThingArn] = js.undefined,
        ThingName: js.UndefOr[ThingName] = js.undefined,
        Type: js.UndefOr[WirelessDeviceType] = js.undefined
    ): GetWirelessDeviceResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DestinationName.foreach(__v => __obj.updateDynamic("DestinationName")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LoRaWAN.foreach(__v => __obj.updateDynamic("LoRaWAN")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Positioning.foreach(__v => __obj.updateDynamic("Positioning")(__v.asInstanceOf[js.Any]))
      Sidewalk.foreach(__v => __obj.updateDynamic("Sidewalk")(__v.asInstanceOf[js.Any]))
      ThingArn.foreach(__v => __obj.updateDynamic("ThingArn")(__v.asInstanceOf[js.Any]))
      ThingName.foreach(__v => __obj.updateDynamic("ThingName")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetWirelessDeviceResponse]
    }
  }

  @js.native
  trait GetWirelessDeviceStatisticsRequest extends js.Object {
    var WirelessDeviceId: WirelessDeviceId
  }

  object GetWirelessDeviceStatisticsRequest {
    @inline
    def apply(
        WirelessDeviceId: WirelessDeviceId
    ): GetWirelessDeviceStatisticsRequest = {
      val __obj = js.Dynamic.literal(
        "WirelessDeviceId" -> WirelessDeviceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetWirelessDeviceStatisticsRequest]
    }
  }

  @js.native
  trait GetWirelessDeviceStatisticsResponse extends js.Object {
    var LastUplinkReceivedAt: js.UndefOr[ISODateTimeString]
    var LoRaWAN: js.UndefOr[LoRaWANDeviceMetadata]
    var Sidewalk: js.UndefOr[SidewalkDeviceMetadata]
    var WirelessDeviceId: js.UndefOr[WirelessDeviceId]
  }

  object GetWirelessDeviceStatisticsResponse {
    @inline
    def apply(
        LastUplinkReceivedAt: js.UndefOr[ISODateTimeString] = js.undefined,
        LoRaWAN: js.UndefOr[LoRaWANDeviceMetadata] = js.undefined,
        Sidewalk: js.UndefOr[SidewalkDeviceMetadata] = js.undefined,
        WirelessDeviceId: js.UndefOr[WirelessDeviceId] = js.undefined
    ): GetWirelessDeviceStatisticsResponse = {
      val __obj = js.Dynamic.literal()
      LastUplinkReceivedAt.foreach(__v => __obj.updateDynamic("LastUplinkReceivedAt")(__v.asInstanceOf[js.Any]))
      LoRaWAN.foreach(__v => __obj.updateDynamic("LoRaWAN")(__v.asInstanceOf[js.Any]))
      Sidewalk.foreach(__v => __obj.updateDynamic("Sidewalk")(__v.asInstanceOf[js.Any]))
      WirelessDeviceId.foreach(__v => __obj.updateDynamic("WirelessDeviceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetWirelessDeviceStatisticsResponse]
    }
  }

  @js.native
  trait GetWirelessGatewayCertificateRequest extends js.Object {
    var Id: WirelessGatewayId
  }

  object GetWirelessGatewayCertificateRequest {
    @inline
    def apply(
        Id: WirelessGatewayId
    ): GetWirelessGatewayCertificateRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetWirelessGatewayCertificateRequest]
    }
  }

  @js.native
  trait GetWirelessGatewayCertificateResponse extends js.Object {
    var IotCertificateId: js.UndefOr[IotCertificateId]
    var LoRaWANNetworkServerCertificateId: js.UndefOr[IotCertificateId]
  }

  object GetWirelessGatewayCertificateResponse {
    @inline
    def apply(
        IotCertificateId: js.UndefOr[IotCertificateId] = js.undefined,
        LoRaWANNetworkServerCertificateId: js.UndefOr[IotCertificateId] = js.undefined
    ): GetWirelessGatewayCertificateResponse = {
      val __obj = js.Dynamic.literal()
      IotCertificateId.foreach(__v => __obj.updateDynamic("IotCertificateId")(__v.asInstanceOf[js.Any]))
      LoRaWANNetworkServerCertificateId.foreach(__v => __obj.updateDynamic("LoRaWANNetworkServerCertificateId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetWirelessGatewayCertificateResponse]
    }
  }

  @js.native
  trait GetWirelessGatewayFirmwareInformationRequest extends js.Object {
    var Id: WirelessGatewayId
  }

  object GetWirelessGatewayFirmwareInformationRequest {
    @inline
    def apply(
        Id: WirelessGatewayId
    ): GetWirelessGatewayFirmwareInformationRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetWirelessGatewayFirmwareInformationRequest]
    }
  }

  @js.native
  trait GetWirelessGatewayFirmwareInformationResponse extends js.Object {
    var LoRaWAN: js.UndefOr[LoRaWANGatewayCurrentVersion]
  }

  object GetWirelessGatewayFirmwareInformationResponse {
    @inline
    def apply(
        LoRaWAN: js.UndefOr[LoRaWANGatewayCurrentVersion] = js.undefined
    ): GetWirelessGatewayFirmwareInformationResponse = {
      val __obj = js.Dynamic.literal()
      LoRaWAN.foreach(__v => __obj.updateDynamic("LoRaWAN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetWirelessGatewayFirmwareInformationResponse]
    }
  }

  @js.native
  trait GetWirelessGatewayRequest extends js.Object {
    var Identifier: Identifier
    var IdentifierType: WirelessGatewayIdType
  }

  object GetWirelessGatewayRequest {
    @inline
    def apply(
        Identifier: Identifier,
        IdentifierType: WirelessGatewayIdType
    ): GetWirelessGatewayRequest = {
      val __obj = js.Dynamic.literal(
        "Identifier" -> Identifier.asInstanceOf[js.Any],
        "IdentifierType" -> IdentifierType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetWirelessGatewayRequest]
    }
  }

  @js.native
  trait GetWirelessGatewayResponse extends js.Object {
    var Arn: js.UndefOr[WirelessGatewayArn]
    var Description: js.UndefOr[Description]
    var Id: js.UndefOr[WirelessGatewayId]
    var LoRaWAN: js.UndefOr[LoRaWANGateway]
    var Name: js.UndefOr[WirelessGatewayName]
    var ThingArn: js.UndefOr[ThingArn]
    var ThingName: js.UndefOr[ThingName]
  }

  object GetWirelessGatewayResponse {
    @inline
    def apply(
        Arn: js.UndefOr[WirelessGatewayArn] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Id: js.UndefOr[WirelessGatewayId] = js.undefined,
        LoRaWAN: js.UndefOr[LoRaWANGateway] = js.undefined,
        Name: js.UndefOr[WirelessGatewayName] = js.undefined,
        ThingArn: js.UndefOr[ThingArn] = js.undefined,
        ThingName: js.UndefOr[ThingName] = js.undefined
    ): GetWirelessGatewayResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LoRaWAN.foreach(__v => __obj.updateDynamic("LoRaWAN")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      ThingArn.foreach(__v => __obj.updateDynamic("ThingArn")(__v.asInstanceOf[js.Any]))
      ThingName.foreach(__v => __obj.updateDynamic("ThingName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetWirelessGatewayResponse]
    }
  }

  @js.native
  trait GetWirelessGatewayStatisticsRequest extends js.Object {
    var WirelessGatewayId: WirelessGatewayId
  }

  object GetWirelessGatewayStatisticsRequest {
    @inline
    def apply(
        WirelessGatewayId: WirelessGatewayId
    ): GetWirelessGatewayStatisticsRequest = {
      val __obj = js.Dynamic.literal(
        "WirelessGatewayId" -> WirelessGatewayId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetWirelessGatewayStatisticsRequest]
    }
  }

  @js.native
  trait GetWirelessGatewayStatisticsResponse extends js.Object {
    var ConnectionStatus: js.UndefOr[ConnectionStatus]
    var LastUplinkReceivedAt: js.UndefOr[ISODateTimeString]
    var WirelessGatewayId: js.UndefOr[WirelessGatewayId]
  }

  object GetWirelessGatewayStatisticsResponse {
    @inline
    def apply(
        ConnectionStatus: js.UndefOr[ConnectionStatus] = js.undefined,
        LastUplinkReceivedAt: js.UndefOr[ISODateTimeString] = js.undefined,
        WirelessGatewayId: js.UndefOr[WirelessGatewayId] = js.undefined
    ): GetWirelessGatewayStatisticsResponse = {
      val __obj = js.Dynamic.literal()
      ConnectionStatus.foreach(__v => __obj.updateDynamic("ConnectionStatus")(__v.asInstanceOf[js.Any]))
      LastUplinkReceivedAt.foreach(__v => __obj.updateDynamic("LastUplinkReceivedAt")(__v.asInstanceOf[js.Any]))
      WirelessGatewayId.foreach(__v => __obj.updateDynamic("WirelessGatewayId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetWirelessGatewayStatisticsResponse]
    }
  }

  @js.native
  trait GetWirelessGatewayTaskDefinitionRequest extends js.Object {
    var Id: WirelessGatewayTaskDefinitionId
  }

  object GetWirelessGatewayTaskDefinitionRequest {
    @inline
    def apply(
        Id: WirelessGatewayTaskDefinitionId
    ): GetWirelessGatewayTaskDefinitionRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetWirelessGatewayTaskDefinitionRequest]
    }
  }

  @js.native
  trait GetWirelessGatewayTaskDefinitionResponse extends js.Object {
    var Arn: js.UndefOr[WirelessGatewayTaskDefinitionArn]
    var AutoCreateTasks: js.UndefOr[AutoCreateTasks]
    var Name: js.UndefOr[WirelessGatewayTaskName]
    var Update: js.UndefOr[UpdateWirelessGatewayTaskCreate]
  }

  object GetWirelessGatewayTaskDefinitionResponse {
    @inline
    def apply(
        Arn: js.UndefOr[WirelessGatewayTaskDefinitionArn] = js.undefined,
        AutoCreateTasks: js.UndefOr[AutoCreateTasks] = js.undefined,
        Name: js.UndefOr[WirelessGatewayTaskName] = js.undefined,
        Update: js.UndefOr[UpdateWirelessGatewayTaskCreate] = js.undefined
    ): GetWirelessGatewayTaskDefinitionResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      AutoCreateTasks.foreach(__v => __obj.updateDynamic("AutoCreateTasks")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Update.foreach(__v => __obj.updateDynamic("Update")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetWirelessGatewayTaskDefinitionResponse]
    }
  }

  @js.native
  trait GetWirelessGatewayTaskRequest extends js.Object {
    var Id: WirelessGatewayId
  }

  object GetWirelessGatewayTaskRequest {
    @inline
    def apply(
        Id: WirelessGatewayId
    ): GetWirelessGatewayTaskRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetWirelessGatewayTaskRequest]
    }
  }

  @js.native
  trait GetWirelessGatewayTaskResponse extends js.Object {
    var LastUplinkReceivedAt: js.UndefOr[ISODateTimeString]
    var Status: js.UndefOr[WirelessGatewayTaskStatus]
    var TaskCreatedAt: js.UndefOr[ISODateTimeString]
    var WirelessGatewayId: js.UndefOr[WirelessGatewayId]
    var WirelessGatewayTaskDefinitionId: js.UndefOr[WirelessGatewayTaskDefinitionId]
  }

  object GetWirelessGatewayTaskResponse {
    @inline
    def apply(
        LastUplinkReceivedAt: js.UndefOr[ISODateTimeString] = js.undefined,
        Status: js.UndefOr[WirelessGatewayTaskStatus] = js.undefined,
        TaskCreatedAt: js.UndefOr[ISODateTimeString] = js.undefined,
        WirelessGatewayId: js.UndefOr[WirelessGatewayId] = js.undefined,
        WirelessGatewayTaskDefinitionId: js.UndefOr[WirelessGatewayTaskDefinitionId] = js.undefined
    ): GetWirelessGatewayTaskResponse = {
      val __obj = js.Dynamic.literal()
      LastUplinkReceivedAt.foreach(__v => __obj.updateDynamic("LastUplinkReceivedAt")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      TaskCreatedAt.foreach(__v => __obj.updateDynamic("TaskCreatedAt")(__v.asInstanceOf[js.Any]))
      WirelessGatewayId.foreach(__v => __obj.updateDynamic("WirelessGatewayId")(__v.asInstanceOf[js.Any]))
      WirelessGatewayTaskDefinitionId.foreach(__v => __obj.updateDynamic("WirelessGatewayTaskDefinitionId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetWirelessGatewayTaskResponse]
    }
  }

  /** Global identity information.
    */
  @js.native
  trait GlobalIdentity extends js.Object {
    var GeranCid: GeranCid
    var Lac: LAC
  }

  object GlobalIdentity {
    @inline
    def apply(
        GeranCid: GeranCid,
        Lac: LAC
    ): GlobalIdentity = {
      val __obj = js.Dynamic.literal(
        "GeranCid" -> GeranCid.asInstanceOf[js.Any],
        "Lac" -> Lac.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GlobalIdentity]
    }
  }

  /** Global navigation satellite system (GNSS) object used for positioning.
    */
  @js.native
  trait Gnss extends js.Object {
    var Payload: GnssNav
    var AssistAltitude: js.UndefOr[Coordinate]
    var AssistPosition: js.UndefOr[AssistPosition]
    var CaptureTime: js.UndefOr[GPST]
    var CaptureTimeAccuracy: js.UndefOr[CaptureTimeAccuracy]
    var Use2DSolver: js.UndefOr[Use2DSolver]
  }

  object Gnss {
    @inline
    def apply(
        Payload: GnssNav,
        AssistAltitude: js.UndefOr[Coordinate] = js.undefined,
        AssistPosition: js.UndefOr[AssistPosition] = js.undefined,
        CaptureTime: js.UndefOr[GPST] = js.undefined,
        CaptureTimeAccuracy: js.UndefOr[CaptureTimeAccuracy] = js.undefined,
        Use2DSolver: js.UndefOr[Use2DSolver] = js.undefined
    ): Gnss = {
      val __obj = js.Dynamic.literal(
        "Payload" -> Payload.asInstanceOf[js.Any]
      )

      AssistAltitude.foreach(__v => __obj.updateDynamic("AssistAltitude")(__v.asInstanceOf[js.Any]))
      AssistPosition.foreach(__v => __obj.updateDynamic("AssistPosition")(__v.asInstanceOf[js.Any]))
      CaptureTime.foreach(__v => __obj.updateDynamic("CaptureTime")(__v.asInstanceOf[js.Any]))
      CaptureTimeAccuracy.foreach(__v => __obj.updateDynamic("CaptureTimeAccuracy")(__v.asInstanceOf[js.Any]))
      Use2DSolver.foreach(__v => __obj.updateDynamic("Use2DSolver")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Gnss]
    }
  }

  /** GSM local ID information, which corresponds to the local identification parameters of a GSM cell.
    */
  @js.native
  trait GsmLocalId extends js.Object {
    var Bcch: BCCH
    var Bsic: BSIC
  }

  object GsmLocalId {
    @inline
    def apply(
        Bcch: BCCH,
        Bsic: BSIC
    ): GsmLocalId = {
      val __obj = js.Dynamic.literal(
        "Bcch" -> Bcch.asInstanceOf[js.Any],
        "Bsic" -> Bsic.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GsmLocalId]
    }
  }

  /** GSM object for network measurement reports.
    */
  @js.native
  trait GsmNmrObj extends js.Object {
    var Bcch: BCCH
    var Bsic: BSIC
    var GlobalIdentity: js.UndefOr[GlobalIdentity]
    var RxLevel: js.UndefOr[RxLevel]
  }

  object GsmNmrObj {
    @inline
    def apply(
        Bcch: BCCH,
        Bsic: BSIC,
        GlobalIdentity: js.UndefOr[GlobalIdentity] = js.undefined,
        RxLevel: js.UndefOr[RxLevel] = js.undefined
    ): GsmNmrObj = {
      val __obj = js.Dynamic.literal(
        "Bcch" -> Bcch.asInstanceOf[js.Any],
        "Bsic" -> Bsic.asInstanceOf[js.Any]
      )

      GlobalIdentity.foreach(__v => __obj.updateDynamic("GlobalIdentity")(__v.asInstanceOf[js.Any]))
      RxLevel.foreach(__v => __obj.updateDynamic("RxLevel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GsmNmrObj]
    }
  }

  /** GSM object.
    */
  @js.native
  trait GsmObj extends js.Object {
    var GeranCid: GeranCid
    var Lac: LAC
    var Mcc: MCC
    var Mnc: MNC
    var GsmLocalId: js.UndefOr[GsmLocalId]
    var GsmNmr: js.UndefOr[GsmNmrList]
    var GsmTimingAdvance: js.UndefOr[GsmTimingAdvance]
    var RxLevel: js.UndefOr[RxLevel]
  }

  object GsmObj {
    @inline
    def apply(
        GeranCid: GeranCid,
        Lac: LAC,
        Mcc: MCC,
        Mnc: MNC,
        GsmLocalId: js.UndefOr[GsmLocalId] = js.undefined,
        GsmNmr: js.UndefOr[GsmNmrList] = js.undefined,
        GsmTimingAdvance: js.UndefOr[GsmTimingAdvance] = js.undefined,
        RxLevel: js.UndefOr[RxLevel] = js.undefined
    ): GsmObj = {
      val __obj = js.Dynamic.literal(
        "GeranCid" -> GeranCid.asInstanceOf[js.Any],
        "Lac" -> Lac.asInstanceOf[js.Any],
        "Mcc" -> Mcc.asInstanceOf[js.Any],
        "Mnc" -> Mnc.asInstanceOf[js.Any]
      )

      GsmLocalId.foreach(__v => __obj.updateDynamic("GsmLocalId")(__v.asInstanceOf[js.Any]))
      GsmNmr.foreach(__v => __obj.updateDynamic("GsmNmr")(__v.asInstanceOf[js.Any]))
      GsmTimingAdvance.foreach(__v => __obj.updateDynamic("GsmTimingAdvance")(__v.asInstanceOf[js.Any]))
      RxLevel.foreach(__v => __obj.updateDynamic("RxLevel")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GsmObj]
    }
  }

  /** IP address used for resolving device location.
    */
  @js.native
  trait Ip extends js.Object {
    var IpAddress: IPAddress
  }

  object Ip {
    @inline
    def apply(
        IpAddress: IPAddress
    ): Ip = {
      val __obj = js.Dynamic.literal(
        "IpAddress" -> IpAddress.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Ip]
    }
  }

  /** Join event configuration object for enabling or disabling topic.
    */
  @js.native
  trait JoinEventConfiguration extends js.Object {
    var LoRaWAN: js.UndefOr[LoRaWANJoinEventNotificationConfigurations]
    var WirelessDeviceIdEventTopic: js.UndefOr[EventNotificationTopicStatus]
  }

  object JoinEventConfiguration {
    @inline
    def apply(
        LoRaWAN: js.UndefOr[LoRaWANJoinEventNotificationConfigurations] = js.undefined,
        WirelessDeviceIdEventTopic: js.UndefOr[EventNotificationTopicStatus] = js.undefined
    ): JoinEventConfiguration = {
      val __obj = js.Dynamic.literal()
      LoRaWAN.foreach(__v => __obj.updateDynamic("LoRaWAN")(__v.asInstanceOf[js.Any]))
      WirelessDeviceIdEventTopic.foreach(__v => __obj.updateDynamic("WirelessDeviceIdEventTopic")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JoinEventConfiguration]
    }
  }

  /** Join resource type event configuration object for enabling or disabling topic.
    */
  @js.native
  trait JoinResourceTypeEventConfiguration extends js.Object {
    var LoRaWAN: js.UndefOr[LoRaWANJoinResourceTypeEventConfiguration]
  }

  object JoinResourceTypeEventConfiguration {
    @inline
    def apply(
        LoRaWAN: js.UndefOr[LoRaWANJoinResourceTypeEventConfiguration] = js.undefined
    ): JoinResourceTypeEventConfiguration = {
      val __obj = js.Dynamic.literal()
      LoRaWAN.foreach(__v => __obj.updateDynamic("LoRaWAN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[JoinResourceTypeEventConfiguration]
    }
  }

  @js.native
  trait ListDestinationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDestinationsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDestinationsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDestinationsRequest]
    }
  }

  @js.native
  trait ListDestinationsResponse extends js.Object {
    var DestinationList: js.UndefOr[DestinationList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDestinationsResponse {
    @inline
    def apply(
        DestinationList: js.UndefOr[DestinationList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDestinationsResponse = {
      val __obj = js.Dynamic.literal()
      DestinationList.foreach(__v => __obj.updateDynamic("DestinationList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDestinationsResponse]
    }
  }

  @js.native
  trait ListDeviceProfilesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDeviceProfilesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDeviceProfilesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeviceProfilesRequest]
    }
  }

  @js.native
  trait ListDeviceProfilesResponse extends js.Object {
    var DeviceProfileList: js.UndefOr[DeviceProfileList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListDeviceProfilesResponse {
    @inline
    def apply(
        DeviceProfileList: js.UndefOr[DeviceProfileList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListDeviceProfilesResponse = {
      val __obj = js.Dynamic.literal()
      DeviceProfileList.foreach(__v => __obj.updateDynamic("DeviceProfileList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeviceProfilesResponse]
    }
  }

  @js.native
  trait ListEventConfigurationsRequest extends js.Object {
    var ResourceType: EventNotificationResourceType
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListEventConfigurationsRequest {
    @inline
    def apply(
        ResourceType: EventNotificationResourceType,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEventConfigurationsRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceType" -> ResourceType.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEventConfigurationsRequest]
    }
  }

  @js.native
  trait ListEventConfigurationsResponse extends js.Object {
    var EventConfigurationsList: js.UndefOr[EventConfigurationsList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListEventConfigurationsResponse {
    @inline
    def apply(
        EventConfigurationsList: js.UndefOr[EventConfigurationsList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListEventConfigurationsResponse = {
      val __obj = js.Dynamic.literal()
      EventConfigurationsList.foreach(__v => __obj.updateDynamic("EventConfigurationsList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEventConfigurationsResponse]
    }
  }

  @js.native
  trait ListFuotaTasksRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListFuotaTasksRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFuotaTasksRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFuotaTasksRequest]
    }
  }

  @js.native
  trait ListFuotaTasksResponse extends js.Object {
    var FuotaTaskList: js.UndefOr[FuotaTaskList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListFuotaTasksResponse {
    @inline
    def apply(
        FuotaTaskList: js.UndefOr[FuotaTaskList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListFuotaTasksResponse = {
      val __obj = js.Dynamic.literal()
      FuotaTaskList.foreach(__v => __obj.updateDynamic("FuotaTaskList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFuotaTasksResponse]
    }
  }

  @js.native
  trait ListMulticastGroupsByFuotaTaskRequest extends js.Object {
    var Id: FuotaTaskId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListMulticastGroupsByFuotaTaskRequest {
    @inline
    def apply(
        Id: FuotaTaskId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListMulticastGroupsByFuotaTaskRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMulticastGroupsByFuotaTaskRequest]
    }
  }

  @js.native
  trait ListMulticastGroupsByFuotaTaskResponse extends js.Object {
    var MulticastGroupList: js.UndefOr[MulticastGroupListByFuotaTask]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListMulticastGroupsByFuotaTaskResponse {
    @inline
    def apply(
        MulticastGroupList: js.UndefOr[MulticastGroupListByFuotaTask] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListMulticastGroupsByFuotaTaskResponse = {
      val __obj = js.Dynamic.literal()
      MulticastGroupList.foreach(__v => __obj.updateDynamic("MulticastGroupList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMulticastGroupsByFuotaTaskResponse]
    }
  }

  @js.native
  trait ListMulticastGroupsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListMulticastGroupsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListMulticastGroupsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMulticastGroupsRequest]
    }
  }

  @js.native
  trait ListMulticastGroupsResponse extends js.Object {
    var MulticastGroupList: js.UndefOr[MulticastGroupList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListMulticastGroupsResponse {
    @inline
    def apply(
        MulticastGroupList: js.UndefOr[MulticastGroupList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListMulticastGroupsResponse = {
      val __obj = js.Dynamic.literal()
      MulticastGroupList.foreach(__v => __obj.updateDynamic("MulticastGroupList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMulticastGroupsResponse]
    }
  }

  @js.native
  trait ListNetworkAnalyzerConfigurationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListNetworkAnalyzerConfigurationsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListNetworkAnalyzerConfigurationsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNetworkAnalyzerConfigurationsRequest]
    }
  }

  @js.native
  trait ListNetworkAnalyzerConfigurationsResponse extends js.Object {
    var NetworkAnalyzerConfigurationList: js.UndefOr[NetworkAnalyzerConfigurationList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListNetworkAnalyzerConfigurationsResponse {
    @inline
    def apply(
        NetworkAnalyzerConfigurationList: js.UndefOr[NetworkAnalyzerConfigurationList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListNetworkAnalyzerConfigurationsResponse = {
      val __obj = js.Dynamic.literal()
      NetworkAnalyzerConfigurationList.foreach(__v => __obj.updateDynamic("NetworkAnalyzerConfigurationList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNetworkAnalyzerConfigurationsResponse]
    }
  }

  @js.native
  trait ListPartnerAccountsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListPartnerAccountsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListPartnerAccountsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPartnerAccountsRequest]
    }
  }

  @js.native
  trait ListPartnerAccountsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Sidewalk: js.UndefOr[SidewalkAccountList]
  }

  object ListPartnerAccountsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Sidewalk: js.UndefOr[SidewalkAccountList] = js.undefined
    ): ListPartnerAccountsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Sidewalk.foreach(__v => __obj.updateDynamic("Sidewalk")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPartnerAccountsResponse]
    }
  }

  @deprecated("This operation is no longer supported.", "forever")
  @js.native
  trait ListPositionConfigurationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var ResourceType: js.UndefOr[PositionResourceType]
  }

  object ListPositionConfigurationsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ResourceType: js.UndefOr[PositionResourceType] = js.undefined
    ): ListPositionConfigurationsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPositionConfigurationsRequest]
    }
  }

  @deprecated("This operation is no longer supported.", "forever")
  @js.native
  trait ListPositionConfigurationsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var PositionConfigurationList: js.UndefOr[PositionConfigurationList]
  }

  object ListPositionConfigurationsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        PositionConfigurationList: js.UndefOr[PositionConfigurationList] = js.undefined
    ): ListPositionConfigurationsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PositionConfigurationList.foreach(__v => __obj.updateDynamic("PositionConfigurationList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPositionConfigurationsResponse]
    }
  }

  @js.native
  trait ListQueuedMessagesRequest extends js.Object {
    var Id: WirelessDeviceId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var WirelessDeviceType: js.UndefOr[WirelessDeviceType]
  }

  object ListQueuedMessagesRequest {
    @inline
    def apply(
        Id: WirelessDeviceId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        WirelessDeviceType: js.UndefOr[WirelessDeviceType] = js.undefined
    ): ListQueuedMessagesRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      WirelessDeviceType.foreach(__v => __obj.updateDynamic("WirelessDeviceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListQueuedMessagesRequest]
    }
  }

  @js.native
  trait ListQueuedMessagesResponse extends js.Object {
    var DownlinkQueueMessagesList: js.UndefOr[DownlinkQueueMessagesList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListQueuedMessagesResponse {
    @inline
    def apply(
        DownlinkQueueMessagesList: js.UndefOr[DownlinkQueueMessagesList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListQueuedMessagesResponse = {
      val __obj = js.Dynamic.literal()
      DownlinkQueueMessagesList.foreach(__v => __obj.updateDynamic("DownlinkQueueMessagesList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListQueuedMessagesResponse]
    }
  }

  @js.native
  trait ListServiceProfilesRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListServiceProfilesRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListServiceProfilesRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServiceProfilesRequest]
    }
  }

  @js.native
  trait ListServiceProfilesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var ServiceProfileList: js.UndefOr[ServiceProfileList]
  }

  object ListServiceProfilesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ServiceProfileList: js.UndefOr[ServiceProfileList] = js.undefined
    ): ListServiceProfilesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ServiceProfileList.foreach(__v => __obj.updateDynamic("ServiceProfileList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServiceProfilesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: AmazonResourceName
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: AmazonResourceName
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListWirelessDevicesRequest extends js.Object {
    var DestinationName: js.UndefOr[DestinationName]
    var DeviceProfileId: js.UndefOr[DeviceProfileId]
    var FuotaTaskId: js.UndefOr[FuotaTaskId]
    var MaxResults: js.UndefOr[MaxResults]
    var MulticastGroupId: js.UndefOr[MulticastGroupId]
    var NextToken: js.UndefOr[NextToken]
    var ServiceProfileId: js.UndefOr[ServiceProfileId]
    var WirelessDeviceType: js.UndefOr[WirelessDeviceType]
  }

  object ListWirelessDevicesRequest {
    @inline
    def apply(
        DestinationName: js.UndefOr[DestinationName] = js.undefined,
        DeviceProfileId: js.UndefOr[DeviceProfileId] = js.undefined,
        FuotaTaskId: js.UndefOr[FuotaTaskId] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        MulticastGroupId: js.UndefOr[MulticastGroupId] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        ServiceProfileId: js.UndefOr[ServiceProfileId] = js.undefined,
        WirelessDeviceType: js.UndefOr[WirelessDeviceType] = js.undefined
    ): ListWirelessDevicesRequest = {
      val __obj = js.Dynamic.literal()
      DestinationName.foreach(__v => __obj.updateDynamic("DestinationName")(__v.asInstanceOf[js.Any]))
      DeviceProfileId.foreach(__v => __obj.updateDynamic("DeviceProfileId")(__v.asInstanceOf[js.Any]))
      FuotaTaskId.foreach(__v => __obj.updateDynamic("FuotaTaskId")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      MulticastGroupId.foreach(__v => __obj.updateDynamic("MulticastGroupId")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ServiceProfileId.foreach(__v => __obj.updateDynamic("ServiceProfileId")(__v.asInstanceOf[js.Any]))
      WirelessDeviceType.foreach(__v => __obj.updateDynamic("WirelessDeviceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWirelessDevicesRequest]
    }
  }

  @js.native
  trait ListWirelessDevicesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var WirelessDeviceList: js.UndefOr[WirelessDeviceStatisticsList]
  }

  object ListWirelessDevicesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        WirelessDeviceList: js.UndefOr[WirelessDeviceStatisticsList] = js.undefined
    ): ListWirelessDevicesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      WirelessDeviceList.foreach(__v => __obj.updateDynamic("WirelessDeviceList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWirelessDevicesResponse]
    }
  }

  @js.native
  trait ListWirelessGatewayTaskDefinitionsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var TaskDefinitionType: js.UndefOr[WirelessGatewayTaskDefinitionType]
  }

  object ListWirelessGatewayTaskDefinitionsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TaskDefinitionType: js.UndefOr[WirelessGatewayTaskDefinitionType] = js.undefined
    ): ListWirelessGatewayTaskDefinitionsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TaskDefinitionType.foreach(__v => __obj.updateDynamic("TaskDefinitionType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWirelessGatewayTaskDefinitionsRequest]
    }
  }

  @js.native
  trait ListWirelessGatewayTaskDefinitionsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var TaskDefinitions: js.UndefOr[WirelessGatewayTaskDefinitionList]
  }

  object ListWirelessGatewayTaskDefinitionsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        TaskDefinitions: js.UndefOr[WirelessGatewayTaskDefinitionList] = js.undefined
    ): ListWirelessGatewayTaskDefinitionsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      TaskDefinitions.foreach(__v => __obj.updateDynamic("TaskDefinitions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWirelessGatewayTaskDefinitionsResponse]
    }
  }

  @js.native
  trait ListWirelessGatewaysRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListWirelessGatewaysRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListWirelessGatewaysRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWirelessGatewaysRequest]
    }
  }

  @js.native
  trait ListWirelessGatewaysResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var WirelessGatewayList: js.UndefOr[WirelessGatewayStatisticsList]
  }

  object ListWirelessGatewaysResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        WirelessGatewayList: js.UndefOr[WirelessGatewayStatisticsList] = js.undefined
    ): ListWirelessGatewaysResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      WirelessGatewayList.foreach(__v => __obj.updateDynamic("WirelessGatewayList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListWirelessGatewaysResponse]
    }
  }

  /** Object for LoRaWAN connection status resource type event configuration.
    */
  @js.native
  trait LoRaWANConnectionStatusEventNotificationConfigurations extends js.Object {
    var GatewayEuiEventTopic: js.UndefOr[EventNotificationTopicStatus]
  }

  object LoRaWANConnectionStatusEventNotificationConfigurations {
    @inline
    def apply(
        GatewayEuiEventTopic: js.UndefOr[EventNotificationTopicStatus] = js.undefined
    ): LoRaWANConnectionStatusEventNotificationConfigurations = {
      val __obj = js.Dynamic.literal()
      GatewayEuiEventTopic.foreach(__v => __obj.updateDynamic("GatewayEuiEventTopic")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoRaWANConnectionStatusEventNotificationConfigurations]
    }
  }

  /** Object for LoRaWAN connection status resource type event configuration.
    */
  @js.native
  trait LoRaWANConnectionStatusResourceTypeEventConfiguration extends js.Object {
    var WirelessGatewayEventTopic: js.UndefOr[EventNotificationTopicStatus]
  }

  object LoRaWANConnectionStatusResourceTypeEventConfiguration {
    @inline
    def apply(
        WirelessGatewayEventTopic: js.UndefOr[EventNotificationTopicStatus] = js.undefined
    ): LoRaWANConnectionStatusResourceTypeEventConfiguration = {
      val __obj = js.Dynamic.literal()
      WirelessGatewayEventTopic.foreach(__v => __obj.updateDynamic("WirelessGatewayEventTopic")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoRaWANConnectionStatusResourceTypeEventConfiguration]
    }
  }

  /** LoRaWAN object for create functions.
    */
  @js.native
  trait LoRaWANDevice extends js.Object {
    var AbpV1_0_x: js.UndefOr[AbpV1_0_x]
    var AbpV1_1: js.UndefOr[AbpV1_1]
    var DevEui: js.UndefOr[DevEui]
    var DeviceProfileId: js.UndefOr[DeviceProfileId]
    var FPorts: js.UndefOr[FPorts]
    var OtaaV1_0_x: js.UndefOr[OtaaV1_0_x]
    var OtaaV1_1: js.UndefOr[OtaaV1_1]
    var ServiceProfileId: js.UndefOr[ServiceProfileId]
  }

  object LoRaWANDevice {
    @inline
    def apply(
        AbpV1_0_x: js.UndefOr[AbpV1_0_x] = js.undefined,
        AbpV1_1: js.UndefOr[AbpV1_1] = js.undefined,
        DevEui: js.UndefOr[DevEui] = js.undefined,
        DeviceProfileId: js.UndefOr[DeviceProfileId] = js.undefined,
        FPorts: js.UndefOr[FPorts] = js.undefined,
        OtaaV1_0_x: js.UndefOr[OtaaV1_0_x] = js.undefined,
        OtaaV1_1: js.UndefOr[OtaaV1_1] = js.undefined,
        ServiceProfileId: js.UndefOr[ServiceProfileId] = js.undefined
    ): LoRaWANDevice = {
      val __obj = js.Dynamic.literal()
      AbpV1_0_x.foreach(__v => __obj.updateDynamic("AbpV1_0_x")(__v.asInstanceOf[js.Any]))
      AbpV1_1.foreach(__v => __obj.updateDynamic("AbpV1_1")(__v.asInstanceOf[js.Any]))
      DevEui.foreach(__v => __obj.updateDynamic("DevEui")(__v.asInstanceOf[js.Any]))
      DeviceProfileId.foreach(__v => __obj.updateDynamic("DeviceProfileId")(__v.asInstanceOf[js.Any]))
      FPorts.foreach(__v => __obj.updateDynamic("FPorts")(__v.asInstanceOf[js.Any]))
      OtaaV1_0_x.foreach(__v => __obj.updateDynamic("OtaaV1_0_x")(__v.asInstanceOf[js.Any]))
      OtaaV1_1.foreach(__v => __obj.updateDynamic("OtaaV1_1")(__v.asInstanceOf[js.Any]))
      ServiceProfileId.foreach(__v => __obj.updateDynamic("ServiceProfileId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoRaWANDevice]
    }
  }

  /** LoRaWAN device metatdata.
    */
  @js.native
  trait LoRaWANDeviceMetadata extends js.Object {
    var DataRate: js.UndefOr[Int]
    var DevEui: js.UndefOr[DevEui]
    var FPort: js.UndefOr[Int]
    var Frequency: js.UndefOr[Int]
    var Gateways: js.UndefOr[LoRaWANGatewayMetadataList]
    var Timestamp: js.UndefOr[ISODateTimeString]
  }

  object LoRaWANDeviceMetadata {
    @inline
    def apply(
        DataRate: js.UndefOr[Int] = js.undefined,
        DevEui: js.UndefOr[DevEui] = js.undefined,
        FPort: js.UndefOr[Int] = js.undefined,
        Frequency: js.UndefOr[Int] = js.undefined,
        Gateways: js.UndefOr[LoRaWANGatewayMetadataList] = js.undefined,
        Timestamp: js.UndefOr[ISODateTimeString] = js.undefined
    ): LoRaWANDeviceMetadata = {
      val __obj = js.Dynamic.literal()
      DataRate.foreach(__v => __obj.updateDynamic("DataRate")(__v.asInstanceOf[js.Any]))
      DevEui.foreach(__v => __obj.updateDynamic("DevEui")(__v.asInstanceOf[js.Any]))
      FPort.foreach(__v => __obj.updateDynamic("FPort")(__v.asInstanceOf[js.Any]))
      Frequency.foreach(__v => __obj.updateDynamic("Frequency")(__v.asInstanceOf[js.Any]))
      Gateways.foreach(__v => __obj.updateDynamic("Gateways")(__v.asInstanceOf[js.Any]))
      Timestamp.foreach(__v => __obj.updateDynamic("Timestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoRaWANDeviceMetadata]
    }
  }

  /** LoRaWANDeviceProfile object.
    */
  @js.native
  trait LoRaWANDeviceProfile extends js.Object {
    var ClassBTimeout: js.UndefOr[ClassBTimeout]
    var ClassCTimeout: js.UndefOr[ClassCTimeout]
    var FactoryPresetFreqsList: js.UndefOr[FactoryPresetFreqsList]
    var MacVersion: js.UndefOr[MacVersion]
    var MaxDutyCycle: js.UndefOr[MaxDutyCycle]
    var MaxEirp: js.UndefOr[MaxEirp]
    var PingSlotDr: js.UndefOr[PingSlotDr]
    var PingSlotFreq: js.UndefOr[PingSlotFreq]
    var PingSlotPeriod: js.UndefOr[PingSlotPeriod]
    var RegParamsRevision: js.UndefOr[RegParamsRevision]
    var RfRegion: js.UndefOr[RfRegion]
    var RxDataRate2: js.UndefOr[RxDataRate2]
    var RxDelay1: js.UndefOr[RxDelay1]
    var RxDrOffset1: js.UndefOr[RxDrOffset1]
    var RxFreq2: js.UndefOr[RxFreq2]
    var Supports32BitFCnt: js.UndefOr[Supports32BitFCnt]
    var SupportsClassB: js.UndefOr[SupportsClassB]
    var SupportsClassC: js.UndefOr[SupportsClassC]
    var SupportsJoin: js.UndefOr[SupportsJoin]
  }

  object LoRaWANDeviceProfile {
    @inline
    def apply(
        ClassBTimeout: js.UndefOr[ClassBTimeout] = js.undefined,
        ClassCTimeout: js.UndefOr[ClassCTimeout] = js.undefined,
        FactoryPresetFreqsList: js.UndefOr[FactoryPresetFreqsList] = js.undefined,
        MacVersion: js.UndefOr[MacVersion] = js.undefined,
        MaxDutyCycle: js.UndefOr[MaxDutyCycle] = js.undefined,
        MaxEirp: js.UndefOr[MaxEirp] = js.undefined,
        PingSlotDr: js.UndefOr[PingSlotDr] = js.undefined,
        PingSlotFreq: js.UndefOr[PingSlotFreq] = js.undefined,
        PingSlotPeriod: js.UndefOr[PingSlotPeriod] = js.undefined,
        RegParamsRevision: js.UndefOr[RegParamsRevision] = js.undefined,
        RfRegion: js.UndefOr[RfRegion] = js.undefined,
        RxDataRate2: js.UndefOr[RxDataRate2] = js.undefined,
        RxDelay1: js.UndefOr[RxDelay1] = js.undefined,
        RxDrOffset1: js.UndefOr[RxDrOffset1] = js.undefined,
        RxFreq2: js.UndefOr[RxFreq2] = js.undefined,
        Supports32BitFCnt: js.UndefOr[Supports32BitFCnt] = js.undefined,
        SupportsClassB: js.UndefOr[SupportsClassB] = js.undefined,
        SupportsClassC: js.UndefOr[SupportsClassC] = js.undefined,
        SupportsJoin: js.UndefOr[SupportsJoin] = js.undefined
    ): LoRaWANDeviceProfile = {
      val __obj = js.Dynamic.literal()
      ClassBTimeout.foreach(__v => __obj.updateDynamic("ClassBTimeout")(__v.asInstanceOf[js.Any]))
      ClassCTimeout.foreach(__v => __obj.updateDynamic("ClassCTimeout")(__v.asInstanceOf[js.Any]))
      FactoryPresetFreqsList.foreach(__v => __obj.updateDynamic("FactoryPresetFreqsList")(__v.asInstanceOf[js.Any]))
      MacVersion.foreach(__v => __obj.updateDynamic("MacVersion")(__v.asInstanceOf[js.Any]))
      MaxDutyCycle.foreach(__v => __obj.updateDynamic("MaxDutyCycle")(__v.asInstanceOf[js.Any]))
      MaxEirp.foreach(__v => __obj.updateDynamic("MaxEirp")(__v.asInstanceOf[js.Any]))
      PingSlotDr.foreach(__v => __obj.updateDynamic("PingSlotDr")(__v.asInstanceOf[js.Any]))
      PingSlotFreq.foreach(__v => __obj.updateDynamic("PingSlotFreq")(__v.asInstanceOf[js.Any]))
      PingSlotPeriod.foreach(__v => __obj.updateDynamic("PingSlotPeriod")(__v.asInstanceOf[js.Any]))
      RegParamsRevision.foreach(__v => __obj.updateDynamic("RegParamsRevision")(__v.asInstanceOf[js.Any]))
      RfRegion.foreach(__v => __obj.updateDynamic("RfRegion")(__v.asInstanceOf[js.Any]))
      RxDataRate2.foreach(__v => __obj.updateDynamic("RxDataRate2")(__v.asInstanceOf[js.Any]))
      RxDelay1.foreach(__v => __obj.updateDynamic("RxDelay1")(__v.asInstanceOf[js.Any]))
      RxDrOffset1.foreach(__v => __obj.updateDynamic("RxDrOffset1")(__v.asInstanceOf[js.Any]))
      RxFreq2.foreach(__v => __obj.updateDynamic("RxFreq2")(__v.asInstanceOf[js.Any]))
      Supports32BitFCnt.foreach(__v => __obj.updateDynamic("Supports32BitFCnt")(__v.asInstanceOf[js.Any]))
      SupportsClassB.foreach(__v => __obj.updateDynamic("SupportsClassB")(__v.asInstanceOf[js.Any]))
      SupportsClassC.foreach(__v => __obj.updateDynamic("SupportsClassC")(__v.asInstanceOf[js.Any]))
      SupportsJoin.foreach(__v => __obj.updateDynamic("SupportsJoin")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoRaWANDeviceProfile]
    }
  }

  /** The LoRaWAN information used with a FUOTA task.
    */
  @js.native
  trait LoRaWANFuotaTask extends js.Object {
    var RfRegion: js.UndefOr[SupportedRfRegion]
  }

  object LoRaWANFuotaTask {
    @inline
    def apply(
        RfRegion: js.UndefOr[SupportedRfRegion] = js.undefined
    ): LoRaWANFuotaTask = {
      val __obj = js.Dynamic.literal()
      RfRegion.foreach(__v => __obj.updateDynamic("RfRegion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoRaWANFuotaTask]
    }
  }

  /** The LoRaWAN information returned from getting a FUOTA task.
    */
  @js.native
  trait LoRaWANFuotaTaskGetInfo extends js.Object {
    var RfRegion: js.UndefOr[RfRegion]
    var StartTime: js.UndefOr[StartTime]
  }

  object LoRaWANFuotaTaskGetInfo {
    @inline
    def apply(
        RfRegion: js.UndefOr[RfRegion] = js.undefined,
        StartTime: js.UndefOr[StartTime] = js.undefined
    ): LoRaWANFuotaTaskGetInfo = {
      val __obj = js.Dynamic.literal()
      RfRegion.foreach(__v => __obj.updateDynamic("RfRegion")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoRaWANFuotaTaskGetInfo]
    }
  }

  /** LoRaWANGateway object.
    */
  @js.native
  trait LoRaWANGateway extends js.Object {
    var Beaconing: js.UndefOr[Beaconing]
    var GatewayEui: js.UndefOr[GatewayEui]
    var JoinEuiFilters: js.UndefOr[JoinEuiFilters]
    var NetIdFilters: js.UndefOr[NetIdFilters]
    var RfRegion: js.UndefOr[RfRegion]
    var SubBands: js.UndefOr[SubBands]
  }

  object LoRaWANGateway {
    @inline
    def apply(
        Beaconing: js.UndefOr[Beaconing] = js.undefined,
        GatewayEui: js.UndefOr[GatewayEui] = js.undefined,
        JoinEuiFilters: js.UndefOr[JoinEuiFilters] = js.undefined,
        NetIdFilters: js.UndefOr[NetIdFilters] = js.undefined,
        RfRegion: js.UndefOr[RfRegion] = js.undefined,
        SubBands: js.UndefOr[SubBands] = js.undefined
    ): LoRaWANGateway = {
      val __obj = js.Dynamic.literal()
      Beaconing.foreach(__v => __obj.updateDynamic("Beaconing")(__v.asInstanceOf[js.Any]))
      GatewayEui.foreach(__v => __obj.updateDynamic("GatewayEui")(__v.asInstanceOf[js.Any]))
      JoinEuiFilters.foreach(__v => __obj.updateDynamic("JoinEuiFilters")(__v.asInstanceOf[js.Any]))
      NetIdFilters.foreach(__v => __obj.updateDynamic("NetIdFilters")(__v.asInstanceOf[js.Any]))
      RfRegion.foreach(__v => __obj.updateDynamic("RfRegion")(__v.asInstanceOf[js.Any]))
      SubBands.foreach(__v => __obj.updateDynamic("SubBands")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoRaWANGateway]
    }
  }

  /** LoRaWANGatewayCurrentVersion object.
    */
  @js.native
  trait LoRaWANGatewayCurrentVersion extends js.Object {
    var CurrentVersion: js.UndefOr[LoRaWANGatewayVersion]
  }

  object LoRaWANGatewayCurrentVersion {
    @inline
    def apply(
        CurrentVersion: js.UndefOr[LoRaWANGatewayVersion] = js.undefined
    ): LoRaWANGatewayCurrentVersion = {
      val __obj = js.Dynamic.literal()
      CurrentVersion.foreach(__v => __obj.updateDynamic("CurrentVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoRaWANGatewayCurrentVersion]
    }
  }

  /** LoRaWAN gateway metatdata.
    */
  @js.native
  trait LoRaWANGatewayMetadata extends js.Object {
    var GatewayEui: js.UndefOr[GatewayEui]
    var Rssi: js.UndefOr[Double]
    var Snr: js.UndefOr[Double]
  }

  object LoRaWANGatewayMetadata {
    @inline
    def apply(
        GatewayEui: js.UndefOr[GatewayEui] = js.undefined,
        Rssi: js.UndefOr[Double] = js.undefined,
        Snr: js.UndefOr[Double] = js.undefined
    ): LoRaWANGatewayMetadata = {
      val __obj = js.Dynamic.literal()
      GatewayEui.foreach(__v => __obj.updateDynamic("GatewayEui")(__v.asInstanceOf[js.Any]))
      Rssi.foreach(__v => __obj.updateDynamic("Rssi")(__v.asInstanceOf[js.Any]))
      Snr.foreach(__v => __obj.updateDynamic("Snr")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoRaWANGatewayMetadata]
    }
  }

  /** LoRaWANGatewayVersion object.
    */
  @js.native
  trait LoRaWANGatewayVersion extends js.Object {
    var Model: js.UndefOr[Model]
    var PackageVersion: js.UndefOr[PackageVersion]
    var Station: js.UndefOr[Station]
  }

  object LoRaWANGatewayVersion {
    @inline
    def apply(
        Model: js.UndefOr[Model] = js.undefined,
        PackageVersion: js.UndefOr[PackageVersion] = js.undefined,
        Station: js.UndefOr[Station] = js.undefined
    ): LoRaWANGatewayVersion = {
      val __obj = js.Dynamic.literal()
      Model.foreach(__v => __obj.updateDynamic("Model")(__v.asInstanceOf[js.Any]))
      PackageVersion.foreach(__v => __obj.updateDynamic("PackageVersion")(__v.asInstanceOf[js.Any]))
      Station.foreach(__v => __obj.updateDynamic("Station")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoRaWANGatewayVersion]
    }
  }

  /** LoRaWANGetServiceProfileInfo object.
    */
  @js.native
  trait LoRaWANGetServiceProfileInfo extends js.Object {
    var AddGwMetadata: js.UndefOr[AddGwMetadata]
    var ChannelMask: js.UndefOr[ChannelMask]
    var DevStatusReqFreq: js.UndefOr[DevStatusReqFreq]
    var DlBucketSize: js.UndefOr[DlBucketSize]
    var DlRate: js.UndefOr[DlRate]
    var DlRatePolicy: js.UndefOr[DlRatePolicy]
    var DrMax: js.UndefOr[DrMax]
    var DrMin: js.UndefOr[DrMin]
    var HrAllowed: js.UndefOr[HrAllowed]
    var MinGwDiversity: js.UndefOr[MinGwDiversity]
    var NwkGeoLoc: js.UndefOr[NwkGeoLoc]
    var PrAllowed: js.UndefOr[PrAllowed]
    var RaAllowed: js.UndefOr[RaAllowed]
    var ReportDevStatusBattery: js.UndefOr[ReportDevStatusBattery]
    var ReportDevStatusMargin: js.UndefOr[ReportDevStatusMargin]
    var TargetPer: js.UndefOr[TargetPer]
    var UlBucketSize: js.UndefOr[UlBucketSize]
    var UlRate: js.UndefOr[UlRate]
    var UlRatePolicy: js.UndefOr[UlRatePolicy]
  }

  object LoRaWANGetServiceProfileInfo {
    @inline
    def apply(
        AddGwMetadata: js.UndefOr[AddGwMetadata] = js.undefined,
        ChannelMask: js.UndefOr[ChannelMask] = js.undefined,
        DevStatusReqFreq: js.UndefOr[DevStatusReqFreq] = js.undefined,
        DlBucketSize: js.UndefOr[DlBucketSize] = js.undefined,
        DlRate: js.UndefOr[DlRate] = js.undefined,
        DlRatePolicy: js.UndefOr[DlRatePolicy] = js.undefined,
        DrMax: js.UndefOr[DrMax] = js.undefined,
        DrMin: js.UndefOr[DrMin] = js.undefined,
        HrAllowed: js.UndefOr[HrAllowed] = js.undefined,
        MinGwDiversity: js.UndefOr[MinGwDiversity] = js.undefined,
        NwkGeoLoc: js.UndefOr[NwkGeoLoc] = js.undefined,
        PrAllowed: js.UndefOr[PrAllowed] = js.undefined,
        RaAllowed: js.UndefOr[RaAllowed] = js.undefined,
        ReportDevStatusBattery: js.UndefOr[ReportDevStatusBattery] = js.undefined,
        ReportDevStatusMargin: js.UndefOr[ReportDevStatusMargin] = js.undefined,
        TargetPer: js.UndefOr[TargetPer] = js.undefined,
        UlBucketSize: js.UndefOr[UlBucketSize] = js.undefined,
        UlRate: js.UndefOr[UlRate] = js.undefined,
        UlRatePolicy: js.UndefOr[UlRatePolicy] = js.undefined
    ): LoRaWANGetServiceProfileInfo = {
      val __obj = js.Dynamic.literal()
      AddGwMetadata.foreach(__v => __obj.updateDynamic("AddGwMetadata")(__v.asInstanceOf[js.Any]))
      ChannelMask.foreach(__v => __obj.updateDynamic("ChannelMask")(__v.asInstanceOf[js.Any]))
      DevStatusReqFreq.foreach(__v => __obj.updateDynamic("DevStatusReqFreq")(__v.asInstanceOf[js.Any]))
      DlBucketSize.foreach(__v => __obj.updateDynamic("DlBucketSize")(__v.asInstanceOf[js.Any]))
      DlRate.foreach(__v => __obj.updateDynamic("DlRate")(__v.asInstanceOf[js.Any]))
      DlRatePolicy.foreach(__v => __obj.updateDynamic("DlRatePolicy")(__v.asInstanceOf[js.Any]))
      DrMax.foreach(__v => __obj.updateDynamic("DrMax")(__v.asInstanceOf[js.Any]))
      DrMin.foreach(__v => __obj.updateDynamic("DrMin")(__v.asInstanceOf[js.Any]))
      HrAllowed.foreach(__v => __obj.updateDynamic("HrAllowed")(__v.asInstanceOf[js.Any]))
      MinGwDiversity.foreach(__v => __obj.updateDynamic("MinGwDiversity")(__v.asInstanceOf[js.Any]))
      NwkGeoLoc.foreach(__v => __obj.updateDynamic("NwkGeoLoc")(__v.asInstanceOf[js.Any]))
      PrAllowed.foreach(__v => __obj.updateDynamic("PrAllowed")(__v.asInstanceOf[js.Any]))
      RaAllowed.foreach(__v => __obj.updateDynamic("RaAllowed")(__v.asInstanceOf[js.Any]))
      ReportDevStatusBattery.foreach(__v => __obj.updateDynamic("ReportDevStatusBattery")(__v.asInstanceOf[js.Any]))
      ReportDevStatusMargin.foreach(__v => __obj.updateDynamic("ReportDevStatusMargin")(__v.asInstanceOf[js.Any]))
      TargetPer.foreach(__v => __obj.updateDynamic("TargetPer")(__v.asInstanceOf[js.Any]))
      UlBucketSize.foreach(__v => __obj.updateDynamic("UlBucketSize")(__v.asInstanceOf[js.Any]))
      UlRate.foreach(__v => __obj.updateDynamic("UlRate")(__v.asInstanceOf[js.Any]))
      UlRatePolicy.foreach(__v => __obj.updateDynamic("UlRatePolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoRaWANGetServiceProfileInfo]
    }
  }

  /** Object for LoRaWAN join resource type event configuration.
    */
  @js.native
  trait LoRaWANJoinEventNotificationConfigurations extends js.Object {
    var DevEuiEventTopic: js.UndefOr[EventNotificationTopicStatus]
  }

  object LoRaWANJoinEventNotificationConfigurations {
    @inline
    def apply(
        DevEuiEventTopic: js.UndefOr[EventNotificationTopicStatus] = js.undefined
    ): LoRaWANJoinEventNotificationConfigurations = {
      val __obj = js.Dynamic.literal()
      DevEuiEventTopic.foreach(__v => __obj.updateDynamic("DevEuiEventTopic")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoRaWANJoinEventNotificationConfigurations]
    }
  }

  /** Object for LoRaWAN join resource type event configuration.
    */
  @js.native
  trait LoRaWANJoinResourceTypeEventConfiguration extends js.Object {
    var WirelessDeviceEventTopic: js.UndefOr[EventNotificationTopicStatus]
  }

  object LoRaWANJoinResourceTypeEventConfiguration {
    @inline
    def apply(
        WirelessDeviceEventTopic: js.UndefOr[EventNotificationTopicStatus] = js.undefined
    ): LoRaWANJoinResourceTypeEventConfiguration = {
      val __obj = js.Dynamic.literal()
      WirelessDeviceEventTopic.foreach(__v => __obj.updateDynamic("WirelessDeviceEventTopic")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoRaWANJoinResourceTypeEventConfiguration]
    }
  }

  /** LoRaWAN object for list functions.
    */
  @js.native
  trait LoRaWANListDevice extends js.Object {
    var DevEui: js.UndefOr[DevEui]
  }

  object LoRaWANListDevice {
    @inline
    def apply(
        DevEui: js.UndefOr[DevEui] = js.undefined
    ): LoRaWANListDevice = {
      val __obj = js.Dynamic.literal()
      DevEui.foreach(__v => __obj.updateDynamic("DevEui")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoRaWANListDevice]
    }
  }

  /** The LoRaWAN information that is to be used with the multicast group.
    */
  @js.native
  trait LoRaWANMulticast extends js.Object {
    var DlClass: js.UndefOr[DlClass]
    var RfRegion: js.UndefOr[SupportedRfRegion]
  }

  object LoRaWANMulticast {
    @inline
    def apply(
        DlClass: js.UndefOr[DlClass] = js.undefined,
        RfRegion: js.UndefOr[SupportedRfRegion] = js.undefined
    ): LoRaWANMulticast = {
      val __obj = js.Dynamic.literal()
      DlClass.foreach(__v => __obj.updateDynamic("DlClass")(__v.asInstanceOf[js.Any]))
      RfRegion.foreach(__v => __obj.updateDynamic("RfRegion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoRaWANMulticast]
    }
  }

  /** The LoRaWAN information that is to be returned from getting multicast group information.
    */
  @js.native
  trait LoRaWANMulticastGet extends js.Object {
    var DlClass: js.UndefOr[DlClass]
    var NumberOfDevicesInGroup: js.UndefOr[NumberOfDevicesInGroup]
    var NumberOfDevicesRequested: js.UndefOr[NumberOfDevicesRequested]
    var RfRegion: js.UndefOr[SupportedRfRegion]
  }

  object LoRaWANMulticastGet {
    @inline
    def apply(
        DlClass: js.UndefOr[DlClass] = js.undefined,
        NumberOfDevicesInGroup: js.UndefOr[NumberOfDevicesInGroup] = js.undefined,
        NumberOfDevicesRequested: js.UndefOr[NumberOfDevicesRequested] = js.undefined,
        RfRegion: js.UndefOr[SupportedRfRegion] = js.undefined
    ): LoRaWANMulticastGet = {
      val __obj = js.Dynamic.literal()
      DlClass.foreach(__v => __obj.updateDynamic("DlClass")(__v.asInstanceOf[js.Any]))
      NumberOfDevicesInGroup.foreach(__v => __obj.updateDynamic("NumberOfDevicesInGroup")(__v.asInstanceOf[js.Any]))
      NumberOfDevicesRequested.foreach(__v => __obj.updateDynamic("NumberOfDevicesRequested")(__v.asInstanceOf[js.Any]))
      RfRegion.foreach(__v => __obj.updateDynamic("RfRegion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoRaWANMulticastGet]
    }
  }

  /** The metadata information of the LoRaWAN multicast group.
    */
  @js.native
  trait LoRaWANMulticastMetadata extends js.Object {
    var FPort: js.UndefOr[FPort]
  }

  object LoRaWANMulticastMetadata {
    @inline
    def apply(
        FPort: js.UndefOr[FPort] = js.undefined
    ): LoRaWANMulticastMetadata = {
      val __obj = js.Dynamic.literal()
      FPort.foreach(__v => __obj.updateDynamic("FPort")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoRaWANMulticastMetadata]
    }
  }

  /** The LoRaWAN information used with the multicast session.
    */
  @js.native
  trait LoRaWANMulticastSession extends js.Object {
    var DlDr: js.UndefOr[DlDr]
    var DlFreq: js.UndefOr[DlFreq]
    var SessionStartTime: js.UndefOr[SessionStartTimeTimestamp]
    var SessionTimeout: js.UndefOr[SessionTimeout]
  }

  object LoRaWANMulticastSession {
    @inline
    def apply(
        DlDr: js.UndefOr[DlDr] = js.undefined,
        DlFreq: js.UndefOr[DlFreq] = js.undefined,
        SessionStartTime: js.UndefOr[SessionStartTimeTimestamp] = js.undefined,
        SessionTimeout: js.UndefOr[SessionTimeout] = js.undefined
    ): LoRaWANMulticastSession = {
      val __obj = js.Dynamic.literal()
      DlDr.foreach(__v => __obj.updateDynamic("DlDr")(__v.asInstanceOf[js.Any]))
      DlFreq.foreach(__v => __obj.updateDynamic("DlFreq")(__v.asInstanceOf[js.Any]))
      SessionStartTime.foreach(__v => __obj.updateDynamic("SessionStartTime")(__v.asInstanceOf[js.Any]))
      SessionTimeout.foreach(__v => __obj.updateDynamic("SessionTimeout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoRaWANMulticastSession]
    }
  }

  /** LoRaWAN router info.
    */
  @js.native
  trait LoRaWANSendDataToDevice extends js.Object {
    var FPort: js.UndefOr[FPort]
    var ParticipatingGateways: js.UndefOr[ParticipatingGateways]
  }

  object LoRaWANSendDataToDevice {
    @inline
    def apply(
        FPort: js.UndefOr[FPort] = js.undefined,
        ParticipatingGateways: js.UndefOr[ParticipatingGateways] = js.undefined
    ): LoRaWANSendDataToDevice = {
      val __obj = js.Dynamic.literal()
      FPort.foreach(__v => __obj.updateDynamic("FPort")(__v.asInstanceOf[js.Any]))
      ParticipatingGateways.foreach(__v => __obj.updateDynamic("ParticipatingGateways")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoRaWANSendDataToDevice]
    }
  }

  /** LoRaWANServiceProfile object.
    */
  @js.native
  trait LoRaWANServiceProfile extends js.Object {
    var AddGwMetadata: js.UndefOr[AddGwMetadata]
    var DrMax: js.UndefOr[DrMaxBox]
    var DrMin: js.UndefOr[DrMinBox]
  }

  object LoRaWANServiceProfile {
    @inline
    def apply(
        AddGwMetadata: js.UndefOr[AddGwMetadata] = js.undefined,
        DrMax: js.UndefOr[DrMaxBox] = js.undefined,
        DrMin: js.UndefOr[DrMinBox] = js.undefined
    ): LoRaWANServiceProfile = {
      val __obj = js.Dynamic.literal()
      AddGwMetadata.foreach(__v => __obj.updateDynamic("AddGwMetadata")(__v.asInstanceOf[js.Any]))
      DrMax.foreach(__v => __obj.updateDynamic("DrMax")(__v.asInstanceOf[js.Any]))
      DrMin.foreach(__v => __obj.updateDynamic("DrMin")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoRaWANServiceProfile]
    }
  }

  /** The LoRaWAN information used to start a FUOTA task.
    */
  @js.native
  trait LoRaWANStartFuotaTask extends js.Object {
    var StartTime: js.UndefOr[StartTime]
  }

  object LoRaWANStartFuotaTask {
    @inline
    def apply(
        StartTime: js.UndefOr[StartTime] = js.undefined
    ): LoRaWANStartFuotaTask = {
      val __obj = js.Dynamic.literal()
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoRaWANStartFuotaTask]
    }
  }

  /** LoRaWAN object for update functions.
    */
  @js.native
  trait LoRaWANUpdateDevice extends js.Object {
    var AbpV1_0_x: js.UndefOr[UpdateAbpV1_0_x]
    var AbpV1_1: js.UndefOr[UpdateAbpV1_1]
    var DeviceProfileId: js.UndefOr[DeviceProfileId]
    var FPorts: js.UndefOr[UpdateFPorts]
    var ServiceProfileId: js.UndefOr[ServiceProfileId]
  }

  object LoRaWANUpdateDevice {
    @inline
    def apply(
        AbpV1_0_x: js.UndefOr[UpdateAbpV1_0_x] = js.undefined,
        AbpV1_1: js.UndefOr[UpdateAbpV1_1] = js.undefined,
        DeviceProfileId: js.UndefOr[DeviceProfileId] = js.undefined,
        FPorts: js.UndefOr[UpdateFPorts] = js.undefined,
        ServiceProfileId: js.UndefOr[ServiceProfileId] = js.undefined
    ): LoRaWANUpdateDevice = {
      val __obj = js.Dynamic.literal()
      AbpV1_0_x.foreach(__v => __obj.updateDynamic("AbpV1_0_x")(__v.asInstanceOf[js.Any]))
      AbpV1_1.foreach(__v => __obj.updateDynamic("AbpV1_1")(__v.asInstanceOf[js.Any]))
      DeviceProfileId.foreach(__v => __obj.updateDynamic("DeviceProfileId")(__v.asInstanceOf[js.Any]))
      FPorts.foreach(__v => __obj.updateDynamic("FPorts")(__v.asInstanceOf[js.Any]))
      ServiceProfileId.foreach(__v => __obj.updateDynamic("ServiceProfileId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoRaWANUpdateDevice]
    }
  }

  /** LoRaWANUpdateGatewayTaskCreate object.
    */
  @js.native
  trait LoRaWANUpdateGatewayTaskCreate extends js.Object {
    var CurrentVersion: js.UndefOr[LoRaWANGatewayVersion]
    var SigKeyCrc: js.UndefOr[Crc]
    var UpdateSignature: js.UndefOr[UpdateSignature]
    var UpdateVersion: js.UndefOr[LoRaWANGatewayVersion]
  }

  object LoRaWANUpdateGatewayTaskCreate {
    @inline
    def apply(
        CurrentVersion: js.UndefOr[LoRaWANGatewayVersion] = js.undefined,
        SigKeyCrc: js.UndefOr[Crc] = js.undefined,
        UpdateSignature: js.UndefOr[UpdateSignature] = js.undefined,
        UpdateVersion: js.UndefOr[LoRaWANGatewayVersion] = js.undefined
    ): LoRaWANUpdateGatewayTaskCreate = {
      val __obj = js.Dynamic.literal()
      CurrentVersion.foreach(__v => __obj.updateDynamic("CurrentVersion")(__v.asInstanceOf[js.Any]))
      SigKeyCrc.foreach(__v => __obj.updateDynamic("SigKeyCrc")(__v.asInstanceOf[js.Any]))
      UpdateSignature.foreach(__v => __obj.updateDynamic("UpdateSignature")(__v.asInstanceOf[js.Any]))
      UpdateVersion.foreach(__v => __obj.updateDynamic("UpdateVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoRaWANUpdateGatewayTaskCreate]
    }
  }

  /** LoRaWANUpdateGatewayTaskEntry object.
    */
  @js.native
  trait LoRaWANUpdateGatewayTaskEntry extends js.Object {
    var CurrentVersion: js.UndefOr[LoRaWANGatewayVersion]
    var UpdateVersion: js.UndefOr[LoRaWANGatewayVersion]
  }

  object LoRaWANUpdateGatewayTaskEntry {
    @inline
    def apply(
        CurrentVersion: js.UndefOr[LoRaWANGatewayVersion] = js.undefined,
        UpdateVersion: js.UndefOr[LoRaWANGatewayVersion] = js.undefined
    ): LoRaWANUpdateGatewayTaskEntry = {
      val __obj = js.Dynamic.literal()
      CurrentVersion.foreach(__v => __obj.updateDynamic("CurrentVersion")(__v.asInstanceOf[js.Any]))
      UpdateVersion.foreach(__v => __obj.updateDynamic("UpdateVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LoRaWANUpdateGatewayTaskEntry]
    }
  }

  /** LTE local identification (local ID) information.
    */
  @js.native
  trait LteLocalId extends js.Object {
    var Earfcn: EARFCN
    var Pci: PCI
  }

  object LteLocalId {
    @inline
    def apply(
        Earfcn: EARFCN,
        Pci: PCI
    ): LteLocalId = {
      val __obj = js.Dynamic.literal(
        "Earfcn" -> Earfcn.asInstanceOf[js.Any],
        "Pci" -> Pci.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LteLocalId]
    }
  }

  /** LTE object for network measurement reports.
    */
  @js.native
  trait LteNmrObj extends js.Object {
    var Earfcn: EARFCN
    var EutranCid: EutranCid
    var Pci: PCI
    var Rsrp: js.UndefOr[RSRP]
    var Rsrq: js.UndefOr[RSRQ]
  }

  object LteNmrObj {
    @inline
    def apply(
        Earfcn: EARFCN,
        EutranCid: EutranCid,
        Pci: PCI,
        Rsrp: js.UndefOr[RSRP] = js.undefined,
        Rsrq: js.UndefOr[RSRQ] = js.undefined
    ): LteNmrObj = {
      val __obj = js.Dynamic.literal(
        "Earfcn" -> Earfcn.asInstanceOf[js.Any],
        "EutranCid" -> EutranCid.asInstanceOf[js.Any],
        "Pci" -> Pci.asInstanceOf[js.Any]
      )

      Rsrp.foreach(__v => __obj.updateDynamic("Rsrp")(__v.asInstanceOf[js.Any]))
      Rsrq.foreach(__v => __obj.updateDynamic("Rsrq")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LteNmrObj]
    }
  }

  /** LTE object.
    */
  @js.native
  trait LteObj extends js.Object {
    var EutranCid: EutranCid
    var Mcc: MCC
    var Mnc: MNC
    var LteLocalId: js.UndefOr[LteLocalId]
    var LteNmr: js.UndefOr[LteNmrList]
    var LteTimingAdvance: js.UndefOr[LteTimingAdvance]
    var NrCapable: js.UndefOr[NRCapable]
    var Rsrp: js.UndefOr[RSRP]
    var Rsrq: js.UndefOr[RSRQ]
    var Tac: js.UndefOr[TAC]
  }

  object LteObj {
    @inline
    def apply(
        EutranCid: EutranCid,
        Mcc: MCC,
        Mnc: MNC,
        LteLocalId: js.UndefOr[LteLocalId] = js.undefined,
        LteNmr: js.UndefOr[LteNmrList] = js.undefined,
        LteTimingAdvance: js.UndefOr[LteTimingAdvance] = js.undefined,
        NrCapable: js.UndefOr[NRCapable] = js.undefined,
        Rsrp: js.UndefOr[RSRP] = js.undefined,
        Rsrq: js.UndefOr[RSRQ] = js.undefined,
        Tac: js.UndefOr[TAC] = js.undefined
    ): LteObj = {
      val __obj = js.Dynamic.literal(
        "EutranCid" -> EutranCid.asInstanceOf[js.Any],
        "Mcc" -> Mcc.asInstanceOf[js.Any],
        "Mnc" -> Mnc.asInstanceOf[js.Any]
      )

      LteLocalId.foreach(__v => __obj.updateDynamic("LteLocalId")(__v.asInstanceOf[js.Any]))
      LteNmr.foreach(__v => __obj.updateDynamic("LteNmr")(__v.asInstanceOf[js.Any]))
      LteTimingAdvance.foreach(__v => __obj.updateDynamic("LteTimingAdvance")(__v.asInstanceOf[js.Any]))
      NrCapable.foreach(__v => __obj.updateDynamic("NrCapable")(__v.asInstanceOf[js.Any]))
      Rsrp.foreach(__v => __obj.updateDynamic("Rsrp")(__v.asInstanceOf[js.Any]))
      Rsrq.foreach(__v => __obj.updateDynamic("Rsrq")(__v.asInstanceOf[js.Any]))
      Tac.foreach(__v => __obj.updateDynamic("Tac")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LteObj]
    }
  }

  /** Message delivery status event configuration object for enabling and disabling relevant topics.
    */
  @js.native
  trait MessageDeliveryStatusEventConfiguration extends js.Object {
    var Sidewalk: js.UndefOr[SidewalkEventNotificationConfigurations]
    var WirelessDeviceIdEventTopic: js.UndefOr[EventNotificationTopicStatus]
  }

  object MessageDeliveryStatusEventConfiguration {
    @inline
    def apply(
        Sidewalk: js.UndefOr[SidewalkEventNotificationConfigurations] = js.undefined,
        WirelessDeviceIdEventTopic: js.UndefOr[EventNotificationTopicStatus] = js.undefined
    ): MessageDeliveryStatusEventConfiguration = {
      val __obj = js.Dynamic.literal()
      Sidewalk.foreach(__v => __obj.updateDynamic("Sidewalk")(__v.asInstanceOf[js.Any]))
      WirelessDeviceIdEventTopic.foreach(__v => __obj.updateDynamic("WirelessDeviceIdEventTopic")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MessageDeliveryStatusEventConfiguration]
    }
  }

  /** Message delivery status resource type event configuration object for enabling or disabling relevant topic.
    */
  @js.native
  trait MessageDeliveryStatusResourceTypeEventConfiguration extends js.Object {
    var Sidewalk: js.UndefOr[SidewalkResourceTypeEventConfiguration]
  }

  object MessageDeliveryStatusResourceTypeEventConfiguration {
    @inline
    def apply(
        Sidewalk: js.UndefOr[SidewalkResourceTypeEventConfiguration] = js.undefined
    ): MessageDeliveryStatusResourceTypeEventConfiguration = {
      val __obj = js.Dynamic.literal()
      Sidewalk.foreach(__v => __obj.updateDynamic("Sidewalk")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MessageDeliveryStatusResourceTypeEventConfiguration]
    }
  }

  /** A multicast group.
    */
  @js.native
  trait MulticastGroup extends js.Object {
    var Arn: js.UndefOr[MulticastGroupArn]
    var Id: js.UndefOr[MulticastGroupId]
    var Name: js.UndefOr[MulticastGroupName]
  }

  object MulticastGroup {
    @inline
    def apply(
        Arn: js.UndefOr[MulticastGroupArn] = js.undefined,
        Id: js.UndefOr[MulticastGroupId] = js.undefined,
        Name: js.UndefOr[MulticastGroupName] = js.undefined
    ): MulticastGroup = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MulticastGroup]
    }
  }

  /** A multicast group that is associated with a FUOTA task.
    */
  @js.native
  trait MulticastGroupByFuotaTask extends js.Object {
    var Id: js.UndefOr[MulticastGroupId]
  }

  object MulticastGroupByFuotaTask {
    @inline
    def apply(
        Id: js.UndefOr[MulticastGroupId] = js.undefined
    ): MulticastGroupByFuotaTask = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MulticastGroupByFuotaTask]
    }
  }

  /** Wireless metadata that is to be sent to multicast group.
    */
  @js.native
  trait MulticastWirelessMetadata extends js.Object {
    var LoRaWAN: js.UndefOr[LoRaWANMulticastMetadata]
  }

  object MulticastWirelessMetadata {
    @inline
    def apply(
        LoRaWAN: js.UndefOr[LoRaWANMulticastMetadata] = js.undefined
    ): MulticastWirelessMetadata = {
      val __obj = js.Dynamic.literal()
      LoRaWAN.foreach(__v => __obj.updateDynamic("LoRaWAN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MulticastWirelessMetadata]
    }
  }

  /** Network analyzer configurations.
    */
  @js.native
  trait NetworkAnalyzerConfigurations extends js.Object {
    var Arn: js.UndefOr[NetworkAnalyzerConfigurationArn]
    var Name: js.UndefOr[NetworkAnalyzerConfigurationName]
  }

  object NetworkAnalyzerConfigurations {
    @inline
    def apply(
        Arn: js.UndefOr[NetworkAnalyzerConfigurationArn] = js.undefined,
        Name: js.UndefOr[NetworkAnalyzerConfigurationName] = js.undefined
    ): NetworkAnalyzerConfigurations = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NetworkAnalyzerConfigurations]
    }
  }

  /** OTAA device object for v1.0.x
    */
  @js.native
  trait OtaaV1_0_x extends js.Object {
    var AppEui: js.UndefOr[AppEui]
    var AppKey: js.UndefOr[AppKey]
    var GenAppKey: js.UndefOr[GenAppKey]
  }

  object OtaaV1_0_x {
    @inline
    def apply(
        AppEui: js.UndefOr[AppEui] = js.undefined,
        AppKey: js.UndefOr[AppKey] = js.undefined,
        GenAppKey: js.UndefOr[GenAppKey] = js.undefined
    ): OtaaV1_0_x = {
      val __obj = js.Dynamic.literal()
      AppEui.foreach(__v => __obj.updateDynamic("AppEui")(__v.asInstanceOf[js.Any]))
      AppKey.foreach(__v => __obj.updateDynamic("AppKey")(__v.asInstanceOf[js.Any]))
      GenAppKey.foreach(__v => __obj.updateDynamic("GenAppKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OtaaV1_0_x]
    }
  }

  /** OTAA device object for v1.1
    */
  @js.native
  trait OtaaV1_1 extends js.Object {
    var AppKey: js.UndefOr[AppKey]
    var JoinEui: js.UndefOr[JoinEui]
    var NwkKey: js.UndefOr[NwkKey]
  }

  object OtaaV1_1 {
    @inline
    def apply(
        AppKey: js.UndefOr[AppKey] = js.undefined,
        JoinEui: js.UndefOr[JoinEui] = js.undefined,
        NwkKey: js.UndefOr[NwkKey] = js.undefined
    ): OtaaV1_1 = {
      val __obj = js.Dynamic.literal()
      AppKey.foreach(__v => __obj.updateDynamic("AppKey")(__v.asInstanceOf[js.Any]))
      JoinEui.foreach(__v => __obj.updateDynamic("JoinEui")(__v.asInstanceOf[js.Any]))
      NwkKey.foreach(__v => __obj.updateDynamic("NwkKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OtaaV1_1]
    }
  }

  /** Specify the list of gateways to which you want to send downlink data traffic when the wireless device is running in class B or class C mode.
    */
  @js.native
  trait ParticipatingGateways extends js.Object {
    var DownlinkMode: DownlinkMode
    var GatewayList: GatewayList
    var TransmissionInterval: TransmissionInterval
  }

  object ParticipatingGateways {
    @inline
    def apply(
        DownlinkMode: DownlinkMode,
        GatewayList: GatewayList,
        TransmissionInterval: TransmissionInterval
    ): ParticipatingGateways = {
      val __obj = js.Dynamic.literal(
        "DownlinkMode" -> DownlinkMode.asInstanceOf[js.Any],
        "GatewayList" -> GatewayList.asInstanceOf[js.Any],
        "TransmissionInterval" -> TransmissionInterval.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ParticipatingGateways]
    }
  }

  /** The wrapper for a position configuration.
    */
  @js.native
  trait PositionConfigurationItem extends js.Object {
    var Destination: js.UndefOr[DestinationName]
    var ResourceIdentifier: js.UndefOr[PositionResourceIdentifier]
    var ResourceType: js.UndefOr[PositionResourceType]
    var Solvers: js.UndefOr[PositionSolverDetails]
  }

  object PositionConfigurationItem {
    @inline
    def apply(
        Destination: js.UndefOr[DestinationName] = js.undefined,
        ResourceIdentifier: js.UndefOr[PositionResourceIdentifier] = js.undefined,
        ResourceType: js.UndefOr[PositionResourceType] = js.undefined,
        Solvers: js.UndefOr[PositionSolverDetails] = js.undefined
    ): PositionConfigurationItem = {
      val __obj = js.Dynamic.literal()
      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      ResourceIdentifier.foreach(__v => __obj.updateDynamic("ResourceIdentifier")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      Solvers.foreach(__v => __obj.updateDynamic("Solvers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PositionConfigurationItem]
    }
  }

  /** The wrapper for position solver configurations.
    */
  @js.native
  trait PositionSolverConfigurations extends js.Object {
    var SemtechGnss: js.UndefOr[SemtechGnssConfiguration]
  }

  object PositionSolverConfigurations {
    @inline
    def apply(
        SemtechGnss: js.UndefOr[SemtechGnssConfiguration] = js.undefined
    ): PositionSolverConfigurations = {
      val __obj = js.Dynamic.literal()
      SemtechGnss.foreach(__v => __obj.updateDynamic("SemtechGnss")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PositionSolverConfigurations]
    }
  }

  /** The wrapper for position solver details.
    */
  @js.native
  trait PositionSolverDetails extends js.Object {
    var SemtechGnss: js.UndefOr[SemtechGnssDetail]
  }

  object PositionSolverDetails {
    @inline
    def apply(
        SemtechGnss: js.UndefOr[SemtechGnssDetail] = js.undefined
    ): PositionSolverDetails = {
      val __obj = js.Dynamic.literal()
      SemtechGnss.foreach(__v => __obj.updateDynamic("SemtechGnss")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PositionSolverDetails]
    }
  }

  /** The FPorts for the position information.
    */
  @js.native
  trait Positioning extends js.Object {
    var ClockSync: js.UndefOr[FPort]
    var Gnss: js.UndefOr[FPort]
    var Stream: js.UndefOr[FPort]
  }

  object Positioning {
    @inline
    def apply(
        ClockSync: js.UndefOr[FPort] = js.undefined,
        Gnss: js.UndefOr[FPort] = js.undefined,
        Stream: js.UndefOr[FPort] = js.undefined
    ): Positioning = {
      val __obj = js.Dynamic.literal()
      ClockSync.foreach(__v => __obj.updateDynamic("ClockSync")(__v.asInstanceOf[js.Any]))
      Gnss.foreach(__v => __obj.updateDynamic("Gnss")(__v.asInstanceOf[js.Any]))
      Stream.foreach(__v => __obj.updateDynamic("Stream")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Positioning]
    }
  }

  /** Proximity event configuration object for enabling and disabling relevant topics.
    */
  @js.native
  trait ProximityEventConfiguration extends js.Object {
    var Sidewalk: js.UndefOr[SidewalkEventNotificationConfigurations]
    var WirelessDeviceIdEventTopic: js.UndefOr[EventNotificationTopicStatus]
  }

  object ProximityEventConfiguration {
    @inline
    def apply(
        Sidewalk: js.UndefOr[SidewalkEventNotificationConfigurations] = js.undefined,
        WirelessDeviceIdEventTopic: js.UndefOr[EventNotificationTopicStatus] = js.undefined
    ): ProximityEventConfiguration = {
      val __obj = js.Dynamic.literal()
      Sidewalk.foreach(__v => __obj.updateDynamic("Sidewalk")(__v.asInstanceOf[js.Any]))
      WirelessDeviceIdEventTopic.foreach(__v => __obj.updateDynamic("WirelessDeviceIdEventTopic")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProximityEventConfiguration]
    }
  }

  /** Proximity resource type event configuration object for enabling or disabling topic.
    */
  @js.native
  trait ProximityResourceTypeEventConfiguration extends js.Object {
    var Sidewalk: js.UndefOr[SidewalkResourceTypeEventConfiguration]
  }

  object ProximityResourceTypeEventConfiguration {
    @inline
    def apply(
        Sidewalk: js.UndefOr[SidewalkResourceTypeEventConfiguration] = js.undefined
    ): ProximityResourceTypeEventConfiguration = {
      val __obj = js.Dynamic.literal()
      Sidewalk.foreach(__v => __obj.updateDynamic("Sidewalk")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ProximityResourceTypeEventConfiguration]
    }
  }

  @deprecated("This operation is no longer supported.", "forever")
  @js.native
  trait PutPositionConfigurationRequest extends js.Object {
    var ResourceIdentifier: PositionResourceIdentifier
    var ResourceType: PositionResourceType
    var Destination: js.UndefOr[DestinationName]
    var Solvers: js.UndefOr[PositionSolverConfigurations]
  }

  object PutPositionConfigurationRequest {
    @inline
    def apply(
        ResourceIdentifier: PositionResourceIdentifier,
        ResourceType: PositionResourceType,
        Destination: js.UndefOr[DestinationName] = js.undefined,
        Solvers: js.UndefOr[PositionSolverConfigurations] = js.undefined
    ): PutPositionConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceIdentifier" -> ResourceIdentifier.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any]
      )

      Destination.foreach(__v => __obj.updateDynamic("Destination")(__v.asInstanceOf[js.Any]))
      Solvers.foreach(__v => __obj.updateDynamic("Solvers")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutPositionConfigurationRequest]
    }
  }

  @deprecated("This operation is no longer supported.", "forever")
  @js.native
  trait PutPositionConfigurationResponse extends js.Object

  object PutPositionConfigurationResponse {
    @inline
    def apply(): PutPositionConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutPositionConfigurationResponse]
    }
  }

  @js.native
  trait PutResourceLogLevelRequest extends js.Object {
    var LogLevel: LogLevel
    var ResourceIdentifier: ResourceIdentifier
    var ResourceType: ResourceType
  }

  object PutResourceLogLevelRequest {
    @inline
    def apply(
        LogLevel: LogLevel,
        ResourceIdentifier: ResourceIdentifier,
        ResourceType: ResourceType
    ): PutResourceLogLevelRequest = {
      val __obj = js.Dynamic.literal(
        "LogLevel" -> LogLevel.asInstanceOf[js.Any],
        "ResourceIdentifier" -> ResourceIdentifier.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutResourceLogLevelRequest]
    }
  }

  @js.native
  trait PutResourceLogLevelResponse extends js.Object

  object PutResourceLogLevelResponse {
    @inline
    def apply(): PutResourceLogLevelResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutResourceLogLevelResponse]
    }
  }

  @js.native
  trait ResetAllResourceLogLevelsRequest extends js.Object

  object ResetAllResourceLogLevelsRequest {
    @inline
    def apply(): ResetAllResourceLogLevelsRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResetAllResourceLogLevelsRequest]
    }
  }

  @js.native
  trait ResetAllResourceLogLevelsResponse extends js.Object

  object ResetAllResourceLogLevelsResponse {
    @inline
    def apply(): ResetAllResourceLogLevelsResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResetAllResourceLogLevelsResponse]
    }
  }

  @js.native
  trait ResetResourceLogLevelRequest extends js.Object {
    var ResourceIdentifier: ResourceIdentifier
    var ResourceType: ResourceType
  }

  object ResetResourceLogLevelRequest {
    @inline
    def apply(
        ResourceIdentifier: ResourceIdentifier,
        ResourceType: ResourceType
    ): ResetResourceLogLevelRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceIdentifier" -> ResourceIdentifier.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ResetResourceLogLevelRequest]
    }
  }

  @js.native
  trait ResetResourceLogLevelResponse extends js.Object

  object ResetResourceLogLevelResponse {
    @inline
    def apply(): ResetResourceLogLevelResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResetResourceLogLevelResponse]
    }
  }

  /** Information about the Semtech GNSS solver configuration.
    */
  @js.native
  trait SemtechGnssConfiguration extends js.Object {
    var Fec: PositionConfigurationFec
    var Status: PositionConfigurationStatus
  }

  object SemtechGnssConfiguration {
    @inline
    def apply(
        Fec: PositionConfigurationFec,
        Status: PositionConfigurationStatus
    ): SemtechGnssConfiguration = {
      val __obj = js.Dynamic.literal(
        "Fec" -> Fec.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SemtechGnssConfiguration]
    }
  }

  /** Details of the Semtech GNSS solver object.
    */
  @js.native
  trait SemtechGnssDetail extends js.Object {
    var Fec: js.UndefOr[PositionConfigurationFec]
    var Provider: js.UndefOr[PositionSolverProvider]
    var Status: js.UndefOr[PositionConfigurationStatus]
    var Type: js.UndefOr[PositionSolverType]
  }

  object SemtechGnssDetail {
    @inline
    def apply(
        Fec: js.UndefOr[PositionConfigurationFec] = js.undefined,
        Provider: js.UndefOr[PositionSolverProvider] = js.undefined,
        Status: js.UndefOr[PositionConfigurationStatus] = js.undefined,
        Type: js.UndefOr[PositionSolverType] = js.undefined
    ): SemtechGnssDetail = {
      val __obj = js.Dynamic.literal()
      Fec.foreach(__v => __obj.updateDynamic("Fec")(__v.asInstanceOf[js.Any]))
      Provider.foreach(__v => __obj.updateDynamic("Provider")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SemtechGnssDetail]
    }
  }

  @js.native
  trait SendDataToMulticastGroupRequest extends js.Object {
    var Id: MulticastGroupId
    var PayloadData: PayloadData
    var WirelessMetadata: MulticastWirelessMetadata
  }

  object SendDataToMulticastGroupRequest {
    @inline
    def apply(
        Id: MulticastGroupId,
        PayloadData: PayloadData,
        WirelessMetadata: MulticastWirelessMetadata
    ): SendDataToMulticastGroupRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "PayloadData" -> PayloadData.asInstanceOf[js.Any],
        "WirelessMetadata" -> WirelessMetadata.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SendDataToMulticastGroupRequest]
    }
  }

  @js.native
  trait SendDataToMulticastGroupResponse extends js.Object {
    var MessageId: js.UndefOr[MulticastGroupMessageId]
  }

  object SendDataToMulticastGroupResponse {
    @inline
    def apply(
        MessageId: js.UndefOr[MulticastGroupMessageId] = js.undefined
    ): SendDataToMulticastGroupResponse = {
      val __obj = js.Dynamic.literal()
      MessageId.foreach(__v => __obj.updateDynamic("MessageId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendDataToMulticastGroupResponse]
    }
  }

  @js.native
  trait SendDataToWirelessDeviceRequest extends js.Object {
    var Id: WirelessDeviceId
    var PayloadData: PayloadData
    var TransmitMode: TransmitMode
    var WirelessMetadata: js.UndefOr[WirelessMetadata]
  }

  object SendDataToWirelessDeviceRequest {
    @inline
    def apply(
        Id: WirelessDeviceId,
        PayloadData: PayloadData,
        TransmitMode: TransmitMode,
        WirelessMetadata: js.UndefOr[WirelessMetadata] = js.undefined
    ): SendDataToWirelessDeviceRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "PayloadData" -> PayloadData.asInstanceOf[js.Any],
        "TransmitMode" -> TransmitMode.asInstanceOf[js.Any]
      )

      WirelessMetadata.foreach(__v => __obj.updateDynamic("WirelessMetadata")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendDataToWirelessDeviceRequest]
    }
  }

  @js.native
  trait SendDataToWirelessDeviceResponse extends js.Object {
    var MessageId: js.UndefOr[MessageId]
  }

  object SendDataToWirelessDeviceResponse {
    @inline
    def apply(
        MessageId: js.UndefOr[MessageId] = js.undefined
    ): SendDataToWirelessDeviceResponse = {
      val __obj = js.Dynamic.literal()
      MessageId.foreach(__v => __obj.updateDynamic("MessageId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SendDataToWirelessDeviceResponse]
    }
  }

  /** Information about a service profile.
    */
  @js.native
  trait ServiceProfile extends js.Object {
    var Arn: js.UndefOr[ServiceProfileArn]
    var Id: js.UndefOr[ServiceProfileId]
    var Name: js.UndefOr[ServiceProfileName]
  }

  object ServiceProfile {
    @inline
    def apply(
        Arn: js.UndefOr[ServiceProfileArn] = js.undefined,
        Id: js.UndefOr[ServiceProfileId] = js.undefined,
        Name: js.UndefOr[ServiceProfileName] = js.undefined
    ): ServiceProfile = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceProfile]
    }
  }

  /** Session keys for ABP v1.1
    */
  @js.native
  trait SessionKeysAbpV1_0_x extends js.Object {
    var AppSKey: js.UndefOr[AppSKey]
    var NwkSKey: js.UndefOr[NwkSKey]
  }

  object SessionKeysAbpV1_0_x {
    @inline
    def apply(
        AppSKey: js.UndefOr[AppSKey] = js.undefined,
        NwkSKey: js.UndefOr[NwkSKey] = js.undefined
    ): SessionKeysAbpV1_0_x = {
      val __obj = js.Dynamic.literal()
      AppSKey.foreach(__v => __obj.updateDynamic("AppSKey")(__v.asInstanceOf[js.Any]))
      NwkSKey.foreach(__v => __obj.updateDynamic("NwkSKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SessionKeysAbpV1_0_x]
    }
  }

  /** Session keys for ABP v1.1
    */
  @js.native
  trait SessionKeysAbpV1_1 extends js.Object {
    var AppSKey: js.UndefOr[AppSKey]
    var FNwkSIntKey: js.UndefOr[FNwkSIntKey]
    var NwkSEncKey: js.UndefOr[NwkSEncKey]
    var SNwkSIntKey: js.UndefOr[SNwkSIntKey]
  }

  object SessionKeysAbpV1_1 {
    @inline
    def apply(
        AppSKey: js.UndefOr[AppSKey] = js.undefined,
        FNwkSIntKey: js.UndefOr[FNwkSIntKey] = js.undefined,
        NwkSEncKey: js.UndefOr[NwkSEncKey] = js.undefined,
        SNwkSIntKey: js.UndefOr[SNwkSIntKey] = js.undefined
    ): SessionKeysAbpV1_1 = {
      val __obj = js.Dynamic.literal()
      AppSKey.foreach(__v => __obj.updateDynamic("AppSKey")(__v.asInstanceOf[js.Any]))
      FNwkSIntKey.foreach(__v => __obj.updateDynamic("FNwkSIntKey")(__v.asInstanceOf[js.Any]))
      NwkSEncKey.foreach(__v => __obj.updateDynamic("NwkSEncKey")(__v.asInstanceOf[js.Any]))
      SNwkSIntKey.foreach(__v => __obj.updateDynamic("SNwkSIntKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SessionKeysAbpV1_1]
    }
  }

  /** Information about a Sidewalk account.
    */
  @js.native
  trait SidewalkAccountInfo extends js.Object {
    var AmazonId: js.UndefOr[AmazonId]
    var AppServerPrivateKey: js.UndefOr[AppServerPrivateKey]
  }

  object SidewalkAccountInfo {
    @inline
    def apply(
        AmazonId: js.UndefOr[AmazonId] = js.undefined,
        AppServerPrivateKey: js.UndefOr[AppServerPrivateKey] = js.undefined
    ): SidewalkAccountInfo = {
      val __obj = js.Dynamic.literal()
      AmazonId.foreach(__v => __obj.updateDynamic("AmazonId")(__v.asInstanceOf[js.Any]))
      AppServerPrivateKey.foreach(__v => __obj.updateDynamic("AppServerPrivateKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SidewalkAccountInfo]
    }
  }

  /** Information about a Sidewalk account.
    */
  @js.native
  trait SidewalkAccountInfoWithFingerprint extends js.Object {
    var AmazonId: js.UndefOr[AmazonId]
    var Arn: js.UndefOr[PartnerAccountArn]
    var Fingerprint: js.UndefOr[Fingerprint]
  }

  object SidewalkAccountInfoWithFingerprint {
    @inline
    def apply(
        AmazonId: js.UndefOr[AmazonId] = js.undefined,
        Arn: js.UndefOr[PartnerAccountArn] = js.undefined,
        Fingerprint: js.UndefOr[Fingerprint] = js.undefined
    ): SidewalkAccountInfoWithFingerprint = {
      val __obj = js.Dynamic.literal()
      AmazonId.foreach(__v => __obj.updateDynamic("AmazonId")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Fingerprint.foreach(__v => __obj.updateDynamic("Fingerprint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SidewalkAccountInfoWithFingerprint]
    }
  }

  /** Sidewalk device object.
    */
  @js.native
  trait SidewalkDevice extends js.Object {
    var AmazonId: js.UndefOr[AmazonId]
    var DeviceCertificates: js.UndefOr[DeviceCertificateList]
    var SidewalkId: js.UndefOr[SidewalkId]
    var SidewalkManufacturingSn: js.UndefOr[SidewalkManufacturingSn]
  }

  object SidewalkDevice {
    @inline
    def apply(
        AmazonId: js.UndefOr[AmazonId] = js.undefined,
        DeviceCertificates: js.UndefOr[DeviceCertificateList] = js.undefined,
        SidewalkId: js.UndefOr[SidewalkId] = js.undefined,
        SidewalkManufacturingSn: js.UndefOr[SidewalkManufacturingSn] = js.undefined
    ): SidewalkDevice = {
      val __obj = js.Dynamic.literal()
      AmazonId.foreach(__v => __obj.updateDynamic("AmazonId")(__v.asInstanceOf[js.Any]))
      DeviceCertificates.foreach(__v => __obj.updateDynamic("DeviceCertificates")(__v.asInstanceOf[js.Any]))
      SidewalkId.foreach(__v => __obj.updateDynamic("SidewalkId")(__v.asInstanceOf[js.Any]))
      SidewalkManufacturingSn.foreach(__v => __obj.updateDynamic("SidewalkManufacturingSn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SidewalkDevice]
    }
  }

  /** MetaData for Sidewalk device.
    */
  @js.native
  trait SidewalkDeviceMetadata extends js.Object {
    var BatteryLevel: js.UndefOr[BatteryLevel]
    var DeviceState: js.UndefOr[DeviceState]
    var Event: js.UndefOr[Event]
    var Rssi: js.UndefOr[Int]
  }

  object SidewalkDeviceMetadata {
    @inline
    def apply(
        BatteryLevel: js.UndefOr[BatteryLevel] = js.undefined,
        DeviceState: js.UndefOr[DeviceState] = js.undefined,
        Event: js.UndefOr[Event] = js.undefined,
        Rssi: js.UndefOr[Int] = js.undefined
    ): SidewalkDeviceMetadata = {
      val __obj = js.Dynamic.literal()
      BatteryLevel.foreach(__v => __obj.updateDynamic("BatteryLevel")(__v.asInstanceOf[js.Any]))
      DeviceState.foreach(__v => __obj.updateDynamic("DeviceState")(__v.asInstanceOf[js.Any]))
      Event.foreach(__v => __obj.updateDynamic("Event")(__v.asInstanceOf[js.Any]))
      Rssi.foreach(__v => __obj.updateDynamic("Rssi")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SidewalkDeviceMetadata]
    }
  }

  /** <code>SidewalkEventNotificationConfigurations</code> object, which is the event configuration object for Sidewalk-related event topics.
    */
  @js.native
  trait SidewalkEventNotificationConfigurations extends js.Object {
    var AmazonIdEventTopic: js.UndefOr[EventNotificationTopicStatus]
  }

  object SidewalkEventNotificationConfigurations {
    @inline
    def apply(
        AmazonIdEventTopic: js.UndefOr[EventNotificationTopicStatus] = js.undefined
    ): SidewalkEventNotificationConfigurations = {
      val __obj = js.Dynamic.literal()
      AmazonIdEventTopic.foreach(__v => __obj.updateDynamic("AmazonIdEventTopic")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SidewalkEventNotificationConfigurations]
    }
  }

  /** Sidewalk object used by list functions.
    */
  @js.native
  trait SidewalkListDevice extends js.Object {
    var AmazonId: js.UndefOr[AmazonId]
    var DeviceCertificates: js.UndefOr[DeviceCertificateList]
    var SidewalkId: js.UndefOr[SidewalkId]
    var SidewalkManufacturingSn: js.UndefOr[SidewalkManufacturingSn]
  }

  object SidewalkListDevice {
    @inline
    def apply(
        AmazonId: js.UndefOr[AmazonId] = js.undefined,
        DeviceCertificates: js.UndefOr[DeviceCertificateList] = js.undefined,
        SidewalkId: js.UndefOr[SidewalkId] = js.undefined,
        SidewalkManufacturingSn: js.UndefOr[SidewalkManufacturingSn] = js.undefined
    ): SidewalkListDevice = {
      val __obj = js.Dynamic.literal()
      AmazonId.foreach(__v => __obj.updateDynamic("AmazonId")(__v.asInstanceOf[js.Any]))
      DeviceCertificates.foreach(__v => __obj.updateDynamic("DeviceCertificates")(__v.asInstanceOf[js.Any]))
      SidewalkId.foreach(__v => __obj.updateDynamic("SidewalkId")(__v.asInstanceOf[js.Any]))
      SidewalkManufacturingSn.foreach(__v => __obj.updateDynamic("SidewalkManufacturingSn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SidewalkListDevice]
    }
  }

  /** Sidewalk resource type event configuration object for enabling or disabling topic.
    */
  @js.native
  trait SidewalkResourceTypeEventConfiguration extends js.Object {
    var WirelessDeviceEventTopic: js.UndefOr[EventNotificationTopicStatus]
  }

  object SidewalkResourceTypeEventConfiguration {
    @inline
    def apply(
        WirelessDeviceEventTopic: js.UndefOr[EventNotificationTopicStatus] = js.undefined
    ): SidewalkResourceTypeEventConfiguration = {
      val __obj = js.Dynamic.literal()
      WirelessDeviceEventTopic.foreach(__v => __obj.updateDynamic("WirelessDeviceEventTopic")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SidewalkResourceTypeEventConfiguration]
    }
  }

  /** Information about a Sidewalk router.
    */
  @js.native
  trait SidewalkSendDataToDevice extends js.Object {
    var AckModeRetryDurationSecs: js.UndefOr[AckModeRetryDurationSecs]
    var MessageType: js.UndefOr[MessageType]
    var Seq: js.UndefOr[Seq]
  }

  object SidewalkSendDataToDevice {
    @inline
    def apply(
        AckModeRetryDurationSecs: js.UndefOr[AckModeRetryDurationSecs] = js.undefined,
        MessageType: js.UndefOr[MessageType] = js.undefined,
        Seq: js.UndefOr[Seq] = js.undefined
    ): SidewalkSendDataToDevice = {
      val __obj = js.Dynamic.literal()
      AckModeRetryDurationSecs.foreach(__v => __obj.updateDynamic("AckModeRetryDurationSecs")(__v.asInstanceOf[js.Any]))
      MessageType.foreach(__v => __obj.updateDynamic("MessageType")(__v.asInstanceOf[js.Any]))
      Seq.foreach(__v => __obj.updateDynamic("Seq")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SidewalkSendDataToDevice]
    }
  }

  /** Sidewalk update.
    */
  @js.native
  trait SidewalkUpdateAccount extends js.Object {
    var AppServerPrivateKey: js.UndefOr[AppServerPrivateKey]
  }

  object SidewalkUpdateAccount {
    @inline
    def apply(
        AppServerPrivateKey: js.UndefOr[AppServerPrivateKey] = js.undefined
    ): SidewalkUpdateAccount = {
      val __obj = js.Dynamic.literal()
      AppServerPrivateKey.foreach(__v => __obj.updateDynamic("AppServerPrivateKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SidewalkUpdateAccount]
    }
  }

  @js.native
  trait StartBulkAssociateWirelessDeviceWithMulticastGroupRequest extends js.Object {
    var Id: MulticastGroupId
    var QueryString: js.UndefOr[QueryString]
    var Tags: js.UndefOr[TagList]
  }

  object StartBulkAssociateWirelessDeviceWithMulticastGroupRequest {
    @inline
    def apply(
        Id: MulticastGroupId,
        QueryString: js.UndefOr[QueryString] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): StartBulkAssociateWirelessDeviceWithMulticastGroupRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      QueryString.foreach(__v => __obj.updateDynamic("QueryString")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartBulkAssociateWirelessDeviceWithMulticastGroupRequest]
    }
  }

  @js.native
  trait StartBulkAssociateWirelessDeviceWithMulticastGroupResponse extends js.Object

  object StartBulkAssociateWirelessDeviceWithMulticastGroupResponse {
    @inline
    def apply(): StartBulkAssociateWirelessDeviceWithMulticastGroupResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartBulkAssociateWirelessDeviceWithMulticastGroupResponse]
    }
  }

  @js.native
  trait StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest extends js.Object {
    var Id: MulticastGroupId
    var QueryString: js.UndefOr[QueryString]
    var Tags: js.UndefOr[TagList]
  }

  object StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest {
    @inline
    def apply(
        Id: MulticastGroupId,
        QueryString: js.UndefOr[QueryString] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      QueryString.foreach(__v => __obj.updateDynamic("QueryString")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartBulkDisassociateWirelessDeviceFromMulticastGroupRequest]
    }
  }

  @js.native
  trait StartBulkDisassociateWirelessDeviceFromMulticastGroupResponse extends js.Object

  object StartBulkDisassociateWirelessDeviceFromMulticastGroupResponse {
    @inline
    def apply(): StartBulkDisassociateWirelessDeviceFromMulticastGroupResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartBulkDisassociateWirelessDeviceFromMulticastGroupResponse]
    }
  }

  @js.native
  trait StartFuotaTaskRequest extends js.Object {
    var Id: FuotaTaskId
    var LoRaWAN: js.UndefOr[LoRaWANStartFuotaTask]
  }

  object StartFuotaTaskRequest {
    @inline
    def apply(
        Id: FuotaTaskId,
        LoRaWAN: js.UndefOr[LoRaWANStartFuotaTask] = js.undefined
    ): StartFuotaTaskRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      LoRaWAN.foreach(__v => __obj.updateDynamic("LoRaWAN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StartFuotaTaskRequest]
    }
  }

  @js.native
  trait StartFuotaTaskResponse extends js.Object

  object StartFuotaTaskResponse {
    @inline
    def apply(): StartFuotaTaskResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartFuotaTaskResponse]
    }
  }

  @js.native
  trait StartMulticastGroupSessionRequest extends js.Object {
    var Id: MulticastGroupId
    var LoRaWAN: LoRaWANMulticastSession
  }

  object StartMulticastGroupSessionRequest {
    @inline
    def apply(
        Id: MulticastGroupId,
        LoRaWAN: LoRaWANMulticastSession
    ): StartMulticastGroupSessionRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "LoRaWAN" -> LoRaWAN.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartMulticastGroupSessionRequest]
    }
  }

  @js.native
  trait StartMulticastGroupSessionResponse extends js.Object

  object StartMulticastGroupSessionResponse {
    @inline
    def apply(): StartMulticastGroupSessionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartMulticastGroupSessionResponse]
    }
  }

  /** A simple label consisting of a customer-defined key-value pair
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: AmazonResourceName
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: AmazonResourceName,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /** TD-SCDMA local identification (local Id) information.
    */
  @js.native
  trait TdscdmaLocalId extends js.Object {
    var CellParams: CellParams
    var Uarfcn: UARFCN
  }

  object TdscdmaLocalId {
    @inline
    def apply(
        CellParams: CellParams,
        Uarfcn: UARFCN
    ): TdscdmaLocalId = {
      val __obj = js.Dynamic.literal(
        "CellParams" -> CellParams.asInstanceOf[js.Any],
        "Uarfcn" -> Uarfcn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TdscdmaLocalId]
    }
  }

  /** TD-SCDMA object for network measurement reports.
    */
  @js.native
  trait TdscdmaNmrObj extends js.Object {
    var CellParams: CellParams
    var Uarfcn: UARFCN
    var PathLoss: js.UndefOr[PathLoss]
    var Rscp: js.UndefOr[RSCP]
    var UtranCid: js.UndefOr[UtranCid]
  }

  object TdscdmaNmrObj {
    @inline
    def apply(
        CellParams: CellParams,
        Uarfcn: UARFCN,
        PathLoss: js.UndefOr[PathLoss] = js.undefined,
        Rscp: js.UndefOr[RSCP] = js.undefined,
        UtranCid: js.UndefOr[UtranCid] = js.undefined
    ): TdscdmaNmrObj = {
      val __obj = js.Dynamic.literal(
        "CellParams" -> CellParams.asInstanceOf[js.Any],
        "Uarfcn" -> Uarfcn.asInstanceOf[js.Any]
      )

      PathLoss.foreach(__v => __obj.updateDynamic("PathLoss")(__v.asInstanceOf[js.Any]))
      Rscp.foreach(__v => __obj.updateDynamic("Rscp")(__v.asInstanceOf[js.Any]))
      UtranCid.foreach(__v => __obj.updateDynamic("UtranCid")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TdscdmaNmrObj]
    }
  }

  /** TD-SCDMA object.
    */
  @js.native
  trait TdscdmaObj extends js.Object {
    var Mcc: MCC
    var Mnc: MNC
    var UtranCid: UtranCid
    var Lac: js.UndefOr[LAC]
    var PathLoss: js.UndefOr[PathLoss]
    var Rscp: js.UndefOr[RSCP]
    var TdscdmaLocalId: js.UndefOr[TdscdmaLocalId]
    var TdscdmaNmr: js.UndefOr[TdscdmaNmrList]
    var TdscdmaTimingAdvance: js.UndefOr[TdscdmaTimingAdvance]
  }

  object TdscdmaObj {
    @inline
    def apply(
        Mcc: MCC,
        Mnc: MNC,
        UtranCid: UtranCid,
        Lac: js.UndefOr[LAC] = js.undefined,
        PathLoss: js.UndefOr[PathLoss] = js.undefined,
        Rscp: js.UndefOr[RSCP] = js.undefined,
        TdscdmaLocalId: js.UndefOr[TdscdmaLocalId] = js.undefined,
        TdscdmaNmr: js.UndefOr[TdscdmaNmrList] = js.undefined,
        TdscdmaTimingAdvance: js.UndefOr[TdscdmaTimingAdvance] = js.undefined
    ): TdscdmaObj = {
      val __obj = js.Dynamic.literal(
        "Mcc" -> Mcc.asInstanceOf[js.Any],
        "Mnc" -> Mnc.asInstanceOf[js.Any],
        "UtranCid" -> UtranCid.asInstanceOf[js.Any]
      )

      Lac.foreach(__v => __obj.updateDynamic("Lac")(__v.asInstanceOf[js.Any]))
      PathLoss.foreach(__v => __obj.updateDynamic("PathLoss")(__v.asInstanceOf[js.Any]))
      Rscp.foreach(__v => __obj.updateDynamic("Rscp")(__v.asInstanceOf[js.Any]))
      TdscdmaLocalId.foreach(__v => __obj.updateDynamic("TdscdmaLocalId")(__v.asInstanceOf[js.Any]))
      TdscdmaNmr.foreach(__v => __obj.updateDynamic("TdscdmaNmr")(__v.asInstanceOf[js.Any]))
      TdscdmaTimingAdvance.foreach(__v => __obj.updateDynamic("TdscdmaTimingAdvance")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TdscdmaObj]
    }
  }

  @js.native
  trait TestWirelessDeviceRequest extends js.Object {
    var Id: WirelessDeviceId
  }

  object TestWirelessDeviceRequest {
    @inline
    def apply(
        Id: WirelessDeviceId
    ): TestWirelessDeviceRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TestWirelessDeviceRequest]
    }
  }

  @js.native
  trait TestWirelessDeviceResponse extends js.Object {
    var Result: js.UndefOr[Result]
  }

  object TestWirelessDeviceResponse {
    @inline
    def apply(
        Result: js.UndefOr[Result] = js.undefined
    ): TestWirelessDeviceResponse = {
      val __obj = js.Dynamic.literal()
      Result.foreach(__v => __obj.updateDynamic("Result")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TestWirelessDeviceResponse]
    }
  }

  /** Trace content for your wireless gateway and wireless device resources.
    */
  @js.native
  trait TraceContent extends js.Object {
    var LogLevel: js.UndefOr[LogLevel]
    var WirelessDeviceFrameInfo: js.UndefOr[WirelessDeviceFrameInfo]
  }

  object TraceContent {
    @inline
    def apply(
        LogLevel: js.UndefOr[LogLevel] = js.undefined,
        WirelessDeviceFrameInfo: js.UndefOr[WirelessDeviceFrameInfo] = js.undefined
    ): TraceContent = {
      val __obj = js.Dynamic.literal()
      LogLevel.foreach(__v => __obj.updateDynamic("LogLevel")(__v.asInstanceOf[js.Any]))
      WirelessDeviceFrameInfo.foreach(__v => __obj.updateDynamic("WirelessDeviceFrameInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TraceContent]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: AmazonResourceName
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: AmazonResourceName,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  /** ABP device object for LoRaWAN specification v1.0.x
    */
  @js.native
  trait UpdateAbpV1_0_x extends js.Object {
    var FCntStart: js.UndefOr[FCntStart]
  }

  object UpdateAbpV1_0_x {
    @inline
    def apply(
        FCntStart: js.UndefOr[FCntStart] = js.undefined
    ): UpdateAbpV1_0_x = {
      val __obj = js.Dynamic.literal()
      FCntStart.foreach(__v => __obj.updateDynamic("FCntStart")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAbpV1_0_x]
    }
  }

  /** ABP device object for LoRaWAN specification v1.1
    */
  @js.native
  trait UpdateAbpV1_1 extends js.Object {
    var FCntStart: js.UndefOr[FCntStart]
  }

  object UpdateAbpV1_1 {
    @inline
    def apply(
        FCntStart: js.UndefOr[FCntStart] = js.undefined
    ): UpdateAbpV1_1 = {
      val __obj = js.Dynamic.literal()
      FCntStart.foreach(__v => __obj.updateDynamic("FCntStart")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateAbpV1_1]
    }
  }

  @js.native
  trait UpdateDestinationRequest extends js.Object {
    var Name: DestinationName
    var Description: js.UndefOr[Description]
    var Expression: js.UndefOr[Expression]
    var ExpressionType: js.UndefOr[ExpressionType]
    var RoleArn: js.UndefOr[RoleArn]
  }

  object UpdateDestinationRequest {
    @inline
    def apply(
        Name: DestinationName,
        Description: js.UndefOr[Description] = js.undefined,
        Expression: js.UndefOr[Expression] = js.undefined,
        ExpressionType: js.UndefOr[ExpressionType] = js.undefined,
        RoleArn: js.UndefOr[RoleArn] = js.undefined
    ): UpdateDestinationRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Expression.foreach(__v => __obj.updateDynamic("Expression")(__v.asInstanceOf[js.Any]))
      ExpressionType.foreach(__v => __obj.updateDynamic("ExpressionType")(__v.asInstanceOf[js.Any]))
      RoleArn.foreach(__v => __obj.updateDynamic("RoleArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDestinationRequest]
    }
  }

  @js.native
  trait UpdateDestinationResponse extends js.Object

  object UpdateDestinationResponse {
    @inline
    def apply(): UpdateDestinationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateDestinationResponse]
    }
  }

  @js.native
  trait UpdateEventConfigurationByResourceTypesRequest extends js.Object {
    var ConnectionStatus: js.UndefOr[ConnectionStatusResourceTypeEventConfiguration]
    var DeviceRegistrationState: js.UndefOr[DeviceRegistrationStateResourceTypeEventConfiguration]
    var Join: js.UndefOr[JoinResourceTypeEventConfiguration]
    var MessageDeliveryStatus: js.UndefOr[MessageDeliveryStatusResourceTypeEventConfiguration]
    var Proximity: js.UndefOr[ProximityResourceTypeEventConfiguration]
  }

  object UpdateEventConfigurationByResourceTypesRequest {
    @inline
    def apply(
        ConnectionStatus: js.UndefOr[ConnectionStatusResourceTypeEventConfiguration] = js.undefined,
        DeviceRegistrationState: js.UndefOr[DeviceRegistrationStateResourceTypeEventConfiguration] = js.undefined,
        Join: js.UndefOr[JoinResourceTypeEventConfiguration] = js.undefined,
        MessageDeliveryStatus: js.UndefOr[MessageDeliveryStatusResourceTypeEventConfiguration] = js.undefined,
        Proximity: js.UndefOr[ProximityResourceTypeEventConfiguration] = js.undefined
    ): UpdateEventConfigurationByResourceTypesRequest = {
      val __obj = js.Dynamic.literal()
      ConnectionStatus.foreach(__v => __obj.updateDynamic("ConnectionStatus")(__v.asInstanceOf[js.Any]))
      DeviceRegistrationState.foreach(__v => __obj.updateDynamic("DeviceRegistrationState")(__v.asInstanceOf[js.Any]))
      Join.foreach(__v => __obj.updateDynamic("Join")(__v.asInstanceOf[js.Any]))
      MessageDeliveryStatus.foreach(__v => __obj.updateDynamic("MessageDeliveryStatus")(__v.asInstanceOf[js.Any]))
      Proximity.foreach(__v => __obj.updateDynamic("Proximity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEventConfigurationByResourceTypesRequest]
    }
  }

  @js.native
  trait UpdateEventConfigurationByResourceTypesResponse extends js.Object

  object UpdateEventConfigurationByResourceTypesResponse {
    @inline
    def apply(): UpdateEventConfigurationByResourceTypesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateEventConfigurationByResourceTypesResponse]
    }
  }

  /** Object for updating the FPorts information.
    */
  @js.native
  trait UpdateFPorts extends js.Object {
    var Applications: js.UndefOr[Applications]
    var Positioning: js.UndefOr[Positioning]
  }

  object UpdateFPorts {
    @inline
    def apply(
        Applications: js.UndefOr[Applications] = js.undefined,
        Positioning: js.UndefOr[Positioning] = js.undefined
    ): UpdateFPorts = {
      val __obj = js.Dynamic.literal()
      Applications.foreach(__v => __obj.updateDynamic("Applications")(__v.asInstanceOf[js.Any]))
      Positioning.foreach(__v => __obj.updateDynamic("Positioning")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFPorts]
    }
  }

  @js.native
  trait UpdateFuotaTaskRequest extends js.Object {
    var Id: FuotaTaskId
    var Description: js.UndefOr[Description]
    var FirmwareUpdateImage: js.UndefOr[FirmwareUpdateImage]
    var FirmwareUpdateRole: js.UndefOr[FirmwareUpdateRole]
    var LoRaWAN: js.UndefOr[LoRaWANFuotaTask]
    var Name: js.UndefOr[FuotaTaskName]
  }

  object UpdateFuotaTaskRequest {
    @inline
    def apply(
        Id: FuotaTaskId,
        Description: js.UndefOr[Description] = js.undefined,
        FirmwareUpdateImage: js.UndefOr[FirmwareUpdateImage] = js.undefined,
        FirmwareUpdateRole: js.UndefOr[FirmwareUpdateRole] = js.undefined,
        LoRaWAN: js.UndefOr[LoRaWANFuotaTask] = js.undefined,
        Name: js.UndefOr[FuotaTaskName] = js.undefined
    ): UpdateFuotaTaskRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      FirmwareUpdateImage.foreach(__v => __obj.updateDynamic("FirmwareUpdateImage")(__v.asInstanceOf[js.Any]))
      FirmwareUpdateRole.foreach(__v => __obj.updateDynamic("FirmwareUpdateRole")(__v.asInstanceOf[js.Any]))
      LoRaWAN.foreach(__v => __obj.updateDynamic("LoRaWAN")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateFuotaTaskRequest]
    }
  }

  @js.native
  trait UpdateFuotaTaskResponse extends js.Object

  object UpdateFuotaTaskResponse {
    @inline
    def apply(): UpdateFuotaTaskResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateFuotaTaskResponse]
    }
  }

  @js.native
  trait UpdateLogLevelsByResourceTypesRequest extends js.Object {
    var DefaultLogLevel: js.UndefOr[LogLevel]
    var WirelessDeviceLogOptions: js.UndefOr[WirelessDeviceLogOptionList]
    var WirelessGatewayLogOptions: js.UndefOr[WirelessGatewayLogOptionList]
  }

  object UpdateLogLevelsByResourceTypesRequest {
    @inline
    def apply(
        DefaultLogLevel: js.UndefOr[LogLevel] = js.undefined,
        WirelessDeviceLogOptions: js.UndefOr[WirelessDeviceLogOptionList] = js.undefined,
        WirelessGatewayLogOptions: js.UndefOr[WirelessGatewayLogOptionList] = js.undefined
    ): UpdateLogLevelsByResourceTypesRequest = {
      val __obj = js.Dynamic.literal()
      DefaultLogLevel.foreach(__v => __obj.updateDynamic("DefaultLogLevel")(__v.asInstanceOf[js.Any]))
      WirelessDeviceLogOptions.foreach(__v => __obj.updateDynamic("WirelessDeviceLogOptions")(__v.asInstanceOf[js.Any]))
      WirelessGatewayLogOptions.foreach(__v => __obj.updateDynamic("WirelessGatewayLogOptions")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLogLevelsByResourceTypesRequest]
    }
  }

  @js.native
  trait UpdateLogLevelsByResourceTypesResponse extends js.Object

  object UpdateLogLevelsByResourceTypesResponse {
    @inline
    def apply(): UpdateLogLevelsByResourceTypesResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateLogLevelsByResourceTypesResponse]
    }
  }

  @js.native
  trait UpdateMulticastGroupRequest extends js.Object {
    var Id: MulticastGroupId
    var Description: js.UndefOr[Description]
    var LoRaWAN: js.UndefOr[LoRaWANMulticast]
    var Name: js.UndefOr[MulticastGroupName]
  }

  object UpdateMulticastGroupRequest {
    @inline
    def apply(
        Id: MulticastGroupId,
        Description: js.UndefOr[Description] = js.undefined,
        LoRaWAN: js.UndefOr[LoRaWANMulticast] = js.undefined,
        Name: js.UndefOr[MulticastGroupName] = js.undefined
    ): UpdateMulticastGroupRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      LoRaWAN.foreach(__v => __obj.updateDynamic("LoRaWAN")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMulticastGroupRequest]
    }
  }

  @js.native
  trait UpdateMulticastGroupResponse extends js.Object

  object UpdateMulticastGroupResponse {
    @inline
    def apply(): UpdateMulticastGroupResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateMulticastGroupResponse]
    }
  }

  @js.native
  trait UpdateNetworkAnalyzerConfigurationRequest extends js.Object {
    var ConfigurationName: NetworkAnalyzerConfigurationName
    var Description: js.UndefOr[Description]
    var TraceContent: js.UndefOr[TraceContent]
    var WirelessDevicesToAdd: js.UndefOr[WirelessDeviceList]
    var WirelessDevicesToRemove: js.UndefOr[WirelessDeviceList]
    var WirelessGatewaysToAdd: js.UndefOr[WirelessGatewayList]
    var WirelessGatewaysToRemove: js.UndefOr[WirelessGatewayList]
  }

  object UpdateNetworkAnalyzerConfigurationRequest {
    @inline
    def apply(
        ConfigurationName: NetworkAnalyzerConfigurationName,
        Description: js.UndefOr[Description] = js.undefined,
        TraceContent: js.UndefOr[TraceContent] = js.undefined,
        WirelessDevicesToAdd: js.UndefOr[WirelessDeviceList] = js.undefined,
        WirelessDevicesToRemove: js.UndefOr[WirelessDeviceList] = js.undefined,
        WirelessGatewaysToAdd: js.UndefOr[WirelessGatewayList] = js.undefined,
        WirelessGatewaysToRemove: js.UndefOr[WirelessGatewayList] = js.undefined
    ): UpdateNetworkAnalyzerConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "ConfigurationName" -> ConfigurationName.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      TraceContent.foreach(__v => __obj.updateDynamic("TraceContent")(__v.asInstanceOf[js.Any]))
      WirelessDevicesToAdd.foreach(__v => __obj.updateDynamic("WirelessDevicesToAdd")(__v.asInstanceOf[js.Any]))
      WirelessDevicesToRemove.foreach(__v => __obj.updateDynamic("WirelessDevicesToRemove")(__v.asInstanceOf[js.Any]))
      WirelessGatewaysToAdd.foreach(__v => __obj.updateDynamic("WirelessGatewaysToAdd")(__v.asInstanceOf[js.Any]))
      WirelessGatewaysToRemove.foreach(__v => __obj.updateDynamic("WirelessGatewaysToRemove")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateNetworkAnalyzerConfigurationRequest]
    }
  }

  @js.native
  trait UpdateNetworkAnalyzerConfigurationResponse extends js.Object

  object UpdateNetworkAnalyzerConfigurationResponse {
    @inline
    def apply(): UpdateNetworkAnalyzerConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateNetworkAnalyzerConfigurationResponse]
    }
  }

  @js.native
  trait UpdatePartnerAccountRequest extends js.Object {
    var PartnerAccountId: PartnerAccountId
    var PartnerType: PartnerType
    var Sidewalk: SidewalkUpdateAccount
  }

  object UpdatePartnerAccountRequest {
    @inline
    def apply(
        PartnerAccountId: PartnerAccountId,
        PartnerType: PartnerType,
        Sidewalk: SidewalkUpdateAccount
    ): UpdatePartnerAccountRequest = {
      val __obj = js.Dynamic.literal(
        "PartnerAccountId" -> PartnerAccountId.asInstanceOf[js.Any],
        "PartnerType" -> PartnerType.asInstanceOf[js.Any],
        "Sidewalk" -> Sidewalk.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdatePartnerAccountRequest]
    }
  }

  @js.native
  trait UpdatePartnerAccountResponse extends js.Object

  object UpdatePartnerAccountResponse {
    @inline
    def apply(): UpdatePartnerAccountResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdatePartnerAccountResponse]
    }
  }

  @deprecated("This operation is no longer supported.", "forever")
  @js.native
  trait UpdatePositionRequest extends js.Object {
    var Position: PositionCoordinate
    var ResourceIdentifier: PositionResourceIdentifier
    var ResourceType: PositionResourceType
  }

  object UpdatePositionRequest {
    @inline
    def apply(
        Position: PositionCoordinate,
        ResourceIdentifier: PositionResourceIdentifier,
        ResourceType: PositionResourceType
    ): UpdatePositionRequest = {
      val __obj = js.Dynamic.literal(
        "Position" -> Position.asInstanceOf[js.Any],
        "ResourceIdentifier" -> ResourceIdentifier.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdatePositionRequest]
    }
  }

  @deprecated("This operation is no longer supported.", "forever")
  @js.native
  trait UpdatePositionResponse extends js.Object

  object UpdatePositionResponse {
    @inline
    def apply(): UpdatePositionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdatePositionResponse]
    }
  }

  @js.native
  trait UpdateResourceEventConfigurationRequest extends js.Object {
    var Identifier: Identifier
    var IdentifierType: IdentifierType
    var ConnectionStatus: js.UndefOr[ConnectionStatusEventConfiguration]
    var DeviceRegistrationState: js.UndefOr[DeviceRegistrationStateEventConfiguration]
    var Join: js.UndefOr[JoinEventConfiguration]
    var MessageDeliveryStatus: js.UndefOr[MessageDeliveryStatusEventConfiguration]
    var PartnerType: js.UndefOr[EventNotificationPartnerType]
    var Proximity: js.UndefOr[ProximityEventConfiguration]
  }

  object UpdateResourceEventConfigurationRequest {
    @inline
    def apply(
        Identifier: Identifier,
        IdentifierType: IdentifierType,
        ConnectionStatus: js.UndefOr[ConnectionStatusEventConfiguration] = js.undefined,
        DeviceRegistrationState: js.UndefOr[DeviceRegistrationStateEventConfiguration] = js.undefined,
        Join: js.UndefOr[JoinEventConfiguration] = js.undefined,
        MessageDeliveryStatus: js.UndefOr[MessageDeliveryStatusEventConfiguration] = js.undefined,
        PartnerType: js.UndefOr[EventNotificationPartnerType] = js.undefined,
        Proximity: js.UndefOr[ProximityEventConfiguration] = js.undefined
    ): UpdateResourceEventConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "Identifier" -> Identifier.asInstanceOf[js.Any],
        "IdentifierType" -> IdentifierType.asInstanceOf[js.Any]
      )

      ConnectionStatus.foreach(__v => __obj.updateDynamic("ConnectionStatus")(__v.asInstanceOf[js.Any]))
      DeviceRegistrationState.foreach(__v => __obj.updateDynamic("DeviceRegistrationState")(__v.asInstanceOf[js.Any]))
      Join.foreach(__v => __obj.updateDynamic("Join")(__v.asInstanceOf[js.Any]))
      MessageDeliveryStatus.foreach(__v => __obj.updateDynamic("MessageDeliveryStatus")(__v.asInstanceOf[js.Any]))
      PartnerType.foreach(__v => __obj.updateDynamic("PartnerType")(__v.asInstanceOf[js.Any]))
      Proximity.foreach(__v => __obj.updateDynamic("Proximity")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateResourceEventConfigurationRequest]
    }
  }

  @js.native
  trait UpdateResourceEventConfigurationResponse extends js.Object

  object UpdateResourceEventConfigurationResponse {
    @inline
    def apply(): UpdateResourceEventConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateResourceEventConfigurationResponse]
    }
  }

  @js.native
  trait UpdateResourcePositionRequest extends js.Object {
    var ResourceIdentifier: PositionResourceIdentifier
    var ResourceType: PositionResourceType
    var GeoJsonPayload: js.UndefOr[GeoJsonPayload]
  }

  object UpdateResourcePositionRequest {
    @inline
    def apply(
        ResourceIdentifier: PositionResourceIdentifier,
        ResourceType: PositionResourceType,
        GeoJsonPayload: js.UndefOr[GeoJsonPayload] = js.undefined
    ): UpdateResourcePositionRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceIdentifier" -> ResourceIdentifier.asInstanceOf[js.Any],
        "ResourceType" -> ResourceType.asInstanceOf[js.Any]
      )

      GeoJsonPayload.foreach(__v => __obj.updateDynamic("GeoJsonPayload")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateResourcePositionRequest]
    }
  }

  @js.native
  trait UpdateResourcePositionResponse extends js.Object

  object UpdateResourcePositionResponse {
    @inline
    def apply(): UpdateResourcePositionResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateResourcePositionResponse]
    }
  }

  @js.native
  trait UpdateWirelessDeviceRequest extends js.Object {
    var Id: WirelessDeviceId
    var Description: js.UndefOr[Description]
    var DestinationName: js.UndefOr[DestinationName]
    var LoRaWAN: js.UndefOr[LoRaWANUpdateDevice]
    var Name: js.UndefOr[WirelessDeviceName]
    var Positioning: js.UndefOr[PositioningConfigStatus]
  }

  object UpdateWirelessDeviceRequest {
    @inline
    def apply(
        Id: WirelessDeviceId,
        Description: js.UndefOr[Description] = js.undefined,
        DestinationName: js.UndefOr[DestinationName] = js.undefined,
        LoRaWAN: js.UndefOr[LoRaWANUpdateDevice] = js.undefined,
        Name: js.UndefOr[WirelessDeviceName] = js.undefined,
        Positioning: js.UndefOr[PositioningConfigStatus] = js.undefined
    ): UpdateWirelessDeviceRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DestinationName.foreach(__v => __obj.updateDynamic("DestinationName")(__v.asInstanceOf[js.Any]))
      LoRaWAN.foreach(__v => __obj.updateDynamic("LoRaWAN")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Positioning.foreach(__v => __obj.updateDynamic("Positioning")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWirelessDeviceRequest]
    }
  }

  @js.native
  trait UpdateWirelessDeviceResponse extends js.Object

  object UpdateWirelessDeviceResponse {
    @inline
    def apply(): UpdateWirelessDeviceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateWirelessDeviceResponse]
    }
  }

  @js.native
  trait UpdateWirelessGatewayRequest extends js.Object {
    var Id: WirelessGatewayId
    var Description: js.UndefOr[Description]
    var JoinEuiFilters: js.UndefOr[JoinEuiFilters]
    var Name: js.UndefOr[WirelessGatewayName]
    var NetIdFilters: js.UndefOr[NetIdFilters]
  }

  object UpdateWirelessGatewayRequest {
    @inline
    def apply(
        Id: WirelessGatewayId,
        Description: js.UndefOr[Description] = js.undefined,
        JoinEuiFilters: js.UndefOr[JoinEuiFilters] = js.undefined,
        Name: js.UndefOr[WirelessGatewayName] = js.undefined,
        NetIdFilters: js.UndefOr[NetIdFilters] = js.undefined
    ): UpdateWirelessGatewayRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      JoinEuiFilters.foreach(__v => __obj.updateDynamic("JoinEuiFilters")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NetIdFilters.foreach(__v => __obj.updateDynamic("NetIdFilters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWirelessGatewayRequest]
    }
  }

  @js.native
  trait UpdateWirelessGatewayResponse extends js.Object

  object UpdateWirelessGatewayResponse {
    @inline
    def apply(): UpdateWirelessGatewayResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateWirelessGatewayResponse]
    }
  }

  /** UpdateWirelessGatewayTaskCreate object.
    */
  @js.native
  trait UpdateWirelessGatewayTaskCreate extends js.Object {
    var LoRaWAN: js.UndefOr[LoRaWANUpdateGatewayTaskCreate]
    var UpdateDataRole: js.UndefOr[UpdateDataSource]
    var UpdateDataSource: js.UndefOr[UpdateDataSource]
  }

  object UpdateWirelessGatewayTaskCreate {
    @inline
    def apply(
        LoRaWAN: js.UndefOr[LoRaWANUpdateGatewayTaskCreate] = js.undefined,
        UpdateDataRole: js.UndefOr[UpdateDataSource] = js.undefined,
        UpdateDataSource: js.UndefOr[UpdateDataSource] = js.undefined
    ): UpdateWirelessGatewayTaskCreate = {
      val __obj = js.Dynamic.literal()
      LoRaWAN.foreach(__v => __obj.updateDynamic("LoRaWAN")(__v.asInstanceOf[js.Any]))
      UpdateDataRole.foreach(__v => __obj.updateDynamic("UpdateDataRole")(__v.asInstanceOf[js.Any]))
      UpdateDataSource.foreach(__v => __obj.updateDynamic("UpdateDataSource")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWirelessGatewayTaskCreate]
    }
  }

  /** UpdateWirelessGatewayTaskEntry object.
    */
  @js.native
  trait UpdateWirelessGatewayTaskEntry extends js.Object {
    var Arn: js.UndefOr[WirelessGatewayTaskDefinitionArn]
    var Id: js.UndefOr[WirelessGatewayTaskDefinitionId]
    var LoRaWAN: js.UndefOr[LoRaWANUpdateGatewayTaskEntry]
  }

  object UpdateWirelessGatewayTaskEntry {
    @inline
    def apply(
        Arn: js.UndefOr[WirelessGatewayTaskDefinitionArn] = js.undefined,
        Id: js.UndefOr[WirelessGatewayTaskDefinitionId] = js.undefined,
        LoRaWAN: js.UndefOr[LoRaWANUpdateGatewayTaskEntry] = js.undefined
    ): UpdateWirelessGatewayTaskEntry = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LoRaWAN.foreach(__v => __obj.updateDynamic("LoRaWAN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateWirelessGatewayTaskEntry]
    }
  }

  /** WCDMA local identification (local ID) information.
    */
  @js.native
  trait WcdmaLocalId extends js.Object {
    var Psc: PSC
    var Uarfcndl: UARFCNDL
  }

  object WcdmaLocalId {
    @inline
    def apply(
        Psc: PSC,
        Uarfcndl: UARFCNDL
    ): WcdmaLocalId = {
      val __obj = js.Dynamic.literal(
        "Psc" -> Psc.asInstanceOf[js.Any],
        "Uarfcndl" -> Uarfcndl.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[WcdmaLocalId]
    }
  }

  /** Network Measurement Reports.
    */
  @js.native
  trait WcdmaNmrObj extends js.Object {
    var Psc: PSC
    var Uarfcndl: UARFCNDL
    var UtranCid: UtranCid
    var PathLoss: js.UndefOr[PathLoss]
    var Rscp: js.UndefOr[RSCP]
  }

  object WcdmaNmrObj {
    @inline
    def apply(
        Psc: PSC,
        Uarfcndl: UARFCNDL,
        UtranCid: UtranCid,
        PathLoss: js.UndefOr[PathLoss] = js.undefined,
        Rscp: js.UndefOr[RSCP] = js.undefined
    ): WcdmaNmrObj = {
      val __obj = js.Dynamic.literal(
        "Psc" -> Psc.asInstanceOf[js.Any],
        "Uarfcndl" -> Uarfcndl.asInstanceOf[js.Any],
        "UtranCid" -> UtranCid.asInstanceOf[js.Any]
      )

      PathLoss.foreach(__v => __obj.updateDynamic("PathLoss")(__v.asInstanceOf[js.Any]))
      Rscp.foreach(__v => __obj.updateDynamic("Rscp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WcdmaNmrObj]
    }
  }

  /** WCDMA.
    */
  @js.native
  trait WcdmaObj extends js.Object {
    var Mcc: MCC
    var Mnc: MNC
    var UtranCid: UtranCid
    var Lac: js.UndefOr[LAC]
    var PathLoss: js.UndefOr[PathLoss]
    var Rscp: js.UndefOr[RSCP]
    var WcdmaLocalId: js.UndefOr[WcdmaLocalId]
    var WcdmaNmr: js.UndefOr[WcdmaNmrList]
  }

  object WcdmaObj {
    @inline
    def apply(
        Mcc: MCC,
        Mnc: MNC,
        UtranCid: UtranCid,
        Lac: js.UndefOr[LAC] = js.undefined,
        PathLoss: js.UndefOr[PathLoss] = js.undefined,
        Rscp: js.UndefOr[RSCP] = js.undefined,
        WcdmaLocalId: js.UndefOr[WcdmaLocalId] = js.undefined,
        WcdmaNmr: js.UndefOr[WcdmaNmrList] = js.undefined
    ): WcdmaObj = {
      val __obj = js.Dynamic.literal(
        "Mcc" -> Mcc.asInstanceOf[js.Any],
        "Mnc" -> Mnc.asInstanceOf[js.Any],
        "UtranCid" -> UtranCid.asInstanceOf[js.Any]
      )

      Lac.foreach(__v => __obj.updateDynamic("Lac")(__v.asInstanceOf[js.Any]))
      PathLoss.foreach(__v => __obj.updateDynamic("PathLoss")(__v.asInstanceOf[js.Any]))
      Rscp.foreach(__v => __obj.updateDynamic("Rscp")(__v.asInstanceOf[js.Any]))
      WcdmaLocalId.foreach(__v => __obj.updateDynamic("WcdmaLocalId")(__v.asInstanceOf[js.Any]))
      WcdmaNmr.foreach(__v => __obj.updateDynamic("WcdmaNmr")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WcdmaObj]
    }
  }

  /** Wi-Fi access point.
    */
  @js.native
  trait WiFiAccessPoint extends js.Object {
    var MacAddress: MacAddress
    var Rss: RSS
  }

  object WiFiAccessPoint {
    @inline
    def apply(
        MacAddress: MacAddress,
        Rss: RSS
    ): WiFiAccessPoint = {
      val __obj = js.Dynamic.literal(
        "MacAddress" -> MacAddress.asInstanceOf[js.Any],
        "Rss" -> Rss.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[WiFiAccessPoint]
    }
  }

  /** The log options for a wireless device event and can be used to set log levels for a specific wireless device event. For a LoRaWAN device, possible events for a log messsage are: <code>Join</code>, <code>Rejoin</code>, <code>Downlink_Data</code>, and <code>Uplink_Data</code>. For a Sidewalk device, possible events for a log message are <code>Registration</code>, <code>Downlink_Data</code>, and <code>Uplink_Data</code>.
    */
  @js.native
  trait WirelessDeviceEventLogOption extends js.Object {
    var Event: WirelessDeviceEvent
    var LogLevel: LogLevel
  }

  object WirelessDeviceEventLogOption {
    @inline
    def apply(
        Event: WirelessDeviceEvent,
        LogLevel: LogLevel
    ): WirelessDeviceEventLogOption = {
      val __obj = js.Dynamic.literal(
        "Event" -> Event.asInstanceOf[js.Any],
        "LogLevel" -> LogLevel.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[WirelessDeviceEventLogOption]
    }
  }

  /** The log options for wireless devices and can be used to set log levels for a specific type of wireless device.
    */
  @js.native
  trait WirelessDeviceLogOption extends js.Object {
    var LogLevel: LogLevel
    var Type: WirelessDeviceType
    var Events: js.UndefOr[WirelessDeviceEventLogOptionList]
  }

  object WirelessDeviceLogOption {
    @inline
    def apply(
        LogLevel: LogLevel,
        Type: WirelessDeviceType,
        Events: js.UndefOr[WirelessDeviceEventLogOptionList] = js.undefined
    ): WirelessDeviceLogOption = {
      val __obj = js.Dynamic.literal(
        "LogLevel" -> LogLevel.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      Events.foreach(__v => __obj.updateDynamic("Events")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WirelessDeviceLogOption]
    }
  }

  /** Information about a wireless device's operation.
    */
  @js.native
  trait WirelessDeviceStatistics extends js.Object {
    var Arn: js.UndefOr[WirelessDeviceArn]
    var DestinationName: js.UndefOr[DestinationName]
    var FuotaDeviceStatus: js.UndefOr[FuotaDeviceStatus]
    var Id: js.UndefOr[WirelessDeviceId]
    var LastUplinkReceivedAt: js.UndefOr[ISODateTimeString]
    var LoRaWAN: js.UndefOr[LoRaWANListDevice]
    var McGroupId: js.UndefOr[McGroupId]
    var MulticastDeviceStatus: js.UndefOr[MulticastDeviceStatus]
    var Name: js.UndefOr[WirelessDeviceName]
    var Sidewalk: js.UndefOr[SidewalkListDevice]
    var Type: js.UndefOr[WirelessDeviceType]
  }

  object WirelessDeviceStatistics {
    @inline
    def apply(
        Arn: js.UndefOr[WirelessDeviceArn] = js.undefined,
        DestinationName: js.UndefOr[DestinationName] = js.undefined,
        FuotaDeviceStatus: js.UndefOr[FuotaDeviceStatus] = js.undefined,
        Id: js.UndefOr[WirelessDeviceId] = js.undefined,
        LastUplinkReceivedAt: js.UndefOr[ISODateTimeString] = js.undefined,
        LoRaWAN: js.UndefOr[LoRaWANListDevice] = js.undefined,
        McGroupId: js.UndefOr[McGroupId] = js.undefined,
        MulticastDeviceStatus: js.UndefOr[MulticastDeviceStatus] = js.undefined,
        Name: js.UndefOr[WirelessDeviceName] = js.undefined,
        Sidewalk: js.UndefOr[SidewalkListDevice] = js.undefined,
        Type: js.UndefOr[WirelessDeviceType] = js.undefined
    ): WirelessDeviceStatistics = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      DestinationName.foreach(__v => __obj.updateDynamic("DestinationName")(__v.asInstanceOf[js.Any]))
      FuotaDeviceStatus.foreach(__v => __obj.updateDynamic("FuotaDeviceStatus")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LastUplinkReceivedAt.foreach(__v => __obj.updateDynamic("LastUplinkReceivedAt")(__v.asInstanceOf[js.Any]))
      LoRaWAN.foreach(__v => __obj.updateDynamic("LoRaWAN")(__v.asInstanceOf[js.Any]))
      McGroupId.foreach(__v => __obj.updateDynamic("McGroupId")(__v.asInstanceOf[js.Any]))
      MulticastDeviceStatus.foreach(__v => __obj.updateDynamic("MulticastDeviceStatus")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Sidewalk.foreach(__v => __obj.updateDynamic("Sidewalk")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WirelessDeviceStatistics]
    }
  }

  /** The log options for a wireless gateway event and can be used to set log levels for a specific wireless gateway event. For a LoRaWAN gateway, possible events for a log message are <code>CUPS_Request</code> and <code>Certificate</code>.
    */
  @js.native
  trait WirelessGatewayEventLogOption extends js.Object {
    var Event: WirelessGatewayEvent
    var LogLevel: LogLevel
  }

  object WirelessGatewayEventLogOption {
    @inline
    def apply(
        Event: WirelessGatewayEvent,
        LogLevel: LogLevel
    ): WirelessGatewayEventLogOption = {
      val __obj = js.Dynamic.literal(
        "Event" -> Event.asInstanceOf[js.Any],
        "LogLevel" -> LogLevel.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[WirelessGatewayEventLogOption]
    }
  }

  /** The log options for wireless gateways and can be used to set log levels for a specific type of wireless gateway.
    */
  @js.native
  trait WirelessGatewayLogOption extends js.Object {
    var LogLevel: LogLevel
    var Type: WirelessGatewayType
    var Events: js.UndefOr[WirelessGatewayEventLogOptionList]
  }

  object WirelessGatewayLogOption {
    @inline
    def apply(
        LogLevel: LogLevel,
        Type: WirelessGatewayType,
        Events: js.UndefOr[WirelessGatewayEventLogOptionList] = js.undefined
    ): WirelessGatewayLogOption = {
      val __obj = js.Dynamic.literal(
        "LogLevel" -> LogLevel.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      Events.foreach(__v => __obj.updateDynamic("Events")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WirelessGatewayLogOption]
    }
  }

  /** Information about a wireless gateway's operation.
    */
  @js.native
  trait WirelessGatewayStatistics extends js.Object {
    var Arn: js.UndefOr[WirelessGatewayArn]
    var Description: js.UndefOr[Description]
    var Id: js.UndefOr[WirelessGatewayId]
    var LastUplinkReceivedAt: js.UndefOr[ISODateTimeString]
    var LoRaWAN: js.UndefOr[LoRaWANGateway]
    var Name: js.UndefOr[WirelessGatewayName]
  }

  object WirelessGatewayStatistics {
    @inline
    def apply(
        Arn: js.UndefOr[WirelessGatewayArn] = js.undefined,
        Description: js.UndefOr[Description] = js.undefined,
        Id: js.UndefOr[WirelessGatewayId] = js.undefined,
        LastUplinkReceivedAt: js.UndefOr[ISODateTimeString] = js.undefined,
        LoRaWAN: js.UndefOr[LoRaWANGateway] = js.undefined,
        Name: js.UndefOr[WirelessGatewayName] = js.undefined
    ): WirelessGatewayStatistics = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      LastUplinkReceivedAt.foreach(__v => __obj.updateDynamic("LastUplinkReceivedAt")(__v.asInstanceOf[js.Any]))
      LoRaWAN.foreach(__v => __obj.updateDynamic("LoRaWAN")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WirelessGatewayStatistics]
    }
  }

  /** WirelessMetadata object.
    */
  @js.native
  trait WirelessMetadata extends js.Object {
    var LoRaWAN: js.UndefOr[LoRaWANSendDataToDevice]
    var Sidewalk: js.UndefOr[SidewalkSendDataToDevice]
  }

  object WirelessMetadata {
    @inline
    def apply(
        LoRaWAN: js.UndefOr[LoRaWANSendDataToDevice] = js.undefined,
        Sidewalk: js.UndefOr[SidewalkSendDataToDevice] = js.undefined
    ): WirelessMetadata = {
      val __obj = js.Dynamic.literal()
      LoRaWAN.foreach(__v => __obj.updateDynamic("LoRaWAN")(__v.asInstanceOf[js.Any]))
      Sidewalk.foreach(__v => __obj.updateDynamic("Sidewalk")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WirelessMetadata]
    }
  }
}
