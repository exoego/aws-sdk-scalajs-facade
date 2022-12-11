package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object groundstation {
  type AWSRegion = String
  type AnyArn = String
  type BucketArn = String
  type ConfigArn = String
  type ConfigList = js.Array[ConfigListItem]
  type ContactList = js.Array[ContactData]
  type CustomerEphemerisPriority = Int
  type DataflowEdge = js.Array[ConfigArn]
  type DataflowEdgeList = js.Array[DataflowEdge]
  type DataflowEndpointGroupArn = String
  type DataflowEndpointGroupList = js.Array[DataflowEndpointListItem]
  type DataflowEndpointMtuInteger = Int
  type DataflowList = js.Array[DataflowDetail]
  type DurationInSeconds = Int
  type EndpointDetailsList = js.Array[EndpointDetails]
  type EphemeridesList = js.Array[EphemerisItem]
  type EphemerisPriority = Int
  type EphemerisStatusList = js.Array[EphemerisStatus]
  type GroundStationIdList = js.Array[GroundStationName]
  type GroundStationList = js.Array[GroundStationData]
  type GroundStationName = String
  type JsonString = String
  type KeyArn = String
  type MissionProfileArn = String
  type MissionProfileList = js.Array[MissionProfileListItem]
  type Month = Int
  type PaginationMaxResults = Int
  type PaginationToken = String
  type PositiveDurationInSeconds = Int
  type RoleArn = String
  type S3BucketName = String
  type S3KeyPrefix = String
  type S3ObjectKey = String
  type S3VersionId = String
  type SafeName = String
  type SatelliteList = js.Array[SatelliteListItem]
  type SecurityGroupIdList = js.Array[String]
  type StatusList = js.Array[ContactStatus]
  type SubnetList = js.Array[String]
  type TLEDataList = js.Array[TLEData]
  type TagKeys = js.Array[UnboundedString]
  type TagsMap = js.Dictionary[String]
  type Timestamp = js.Date
  type TleLineOne = String
  type TleLineTwo = String
  type UnboundedString = String
  type Uuid = String
  type Year = Int
  type noradSatelliteID = Int
  type satelliteArn = String

  final class GroundStationOps(private val service: GroundStation) extends AnyVal {

    @inline def cancelContactFuture(params: CancelContactRequest): Future[ContactIdResponse] = service.cancelContact(params).promise().toFuture
    @inline def createConfigFuture(params: CreateConfigRequest): Future[ConfigIdResponse] = service.createConfig(params).promise().toFuture
    @inline def createDataflowEndpointGroupFuture(params: CreateDataflowEndpointGroupRequest): Future[DataflowEndpointGroupIdResponse] = service.createDataflowEndpointGroup(params).promise().toFuture
    @inline def createEphemerisFuture(params: CreateEphemerisRequest): Future[EphemerisIdResponse] = service.createEphemeris(params).promise().toFuture
    @inline def createMissionProfileFuture(params: CreateMissionProfileRequest): Future[MissionProfileIdResponse] = service.createMissionProfile(params).promise().toFuture
    @inline def deleteConfigFuture(params: DeleteConfigRequest): Future[ConfigIdResponse] = service.deleteConfig(params).promise().toFuture
    @inline def deleteDataflowEndpointGroupFuture(params: DeleteDataflowEndpointGroupRequest): Future[DataflowEndpointGroupIdResponse] = service.deleteDataflowEndpointGroup(params).promise().toFuture
    @inline def deleteEphemerisFuture(params: DeleteEphemerisRequest): Future[EphemerisIdResponse] = service.deleteEphemeris(params).promise().toFuture
    @inline def deleteMissionProfileFuture(params: DeleteMissionProfileRequest): Future[MissionProfileIdResponse] = service.deleteMissionProfile(params).promise().toFuture
    @inline def describeContactFuture(params: DescribeContactRequest): Future[DescribeContactResponse] = service.describeContact(params).promise().toFuture
    @inline def describeEphemerisFuture(params: DescribeEphemerisRequest): Future[DescribeEphemerisResponse] = service.describeEphemeris(params).promise().toFuture
    @inline def getConfigFuture(params: GetConfigRequest): Future[GetConfigResponse] = service.getConfig(params).promise().toFuture
    @inline def getDataflowEndpointGroupFuture(params: GetDataflowEndpointGroupRequest): Future[GetDataflowEndpointGroupResponse] = service.getDataflowEndpointGroup(params).promise().toFuture
    @inline def getMinuteUsageFuture(params: GetMinuteUsageRequest): Future[GetMinuteUsageResponse] = service.getMinuteUsage(params).promise().toFuture
    @inline def getMissionProfileFuture(params: GetMissionProfileRequest): Future[GetMissionProfileResponse] = service.getMissionProfile(params).promise().toFuture
    @inline def getSatelliteFuture(params: GetSatelliteRequest): Future[GetSatelliteResponse] = service.getSatellite(params).promise().toFuture
    @inline def listConfigsFuture(params: ListConfigsRequest): Future[ListConfigsResponse] = service.listConfigs(params).promise().toFuture
    @inline def listContactsFuture(params: ListContactsRequest): Future[ListContactsResponse] = service.listContacts(params).promise().toFuture
    @inline def listDataflowEndpointGroupsFuture(params: ListDataflowEndpointGroupsRequest): Future[ListDataflowEndpointGroupsResponse] = service.listDataflowEndpointGroups(params).promise().toFuture
    @inline def listEphemeridesFuture(params: ListEphemeridesRequest): Future[ListEphemeridesResponse] = service.listEphemerides(params).promise().toFuture
    @inline def listGroundStationsFuture(params: ListGroundStationsRequest): Future[ListGroundStationsResponse] = service.listGroundStations(params).promise().toFuture
    @inline def listMissionProfilesFuture(params: ListMissionProfilesRequest): Future[ListMissionProfilesResponse] = service.listMissionProfiles(params).promise().toFuture
    @inline def listSatellitesFuture(params: ListSatellitesRequest): Future[ListSatellitesResponse] = service.listSatellites(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def reserveContactFuture(params: ReserveContactRequest): Future[ContactIdResponse] = service.reserveContact(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateConfigFuture(params: UpdateConfigRequest): Future[ConfigIdResponse] = service.updateConfig(params).promise().toFuture
    @inline def updateEphemerisFuture(params: UpdateEphemerisRequest): Future[EphemerisIdResponse] = service.updateEphemeris(params).promise().toFuture
    @inline def updateMissionProfileFuture(params: UpdateMissionProfileRequest): Future[MissionProfileIdResponse] = service.updateMissionProfile(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/groundstation", JSImport.Namespace, "AWS.GroundStation")
  class GroundStation() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelContact(params: CancelContactRequest): Request[ContactIdResponse] = js.native
    def createConfig(params: CreateConfigRequest): Request[ConfigIdResponse] = js.native
    def createDataflowEndpointGroup(params: CreateDataflowEndpointGroupRequest): Request[DataflowEndpointGroupIdResponse] = js.native
    def createEphemeris(params: CreateEphemerisRequest): Request[EphemerisIdResponse] = js.native
    def createMissionProfile(params: CreateMissionProfileRequest): Request[MissionProfileIdResponse] = js.native
    def deleteConfig(params: DeleteConfigRequest): Request[ConfigIdResponse] = js.native
    def deleteDataflowEndpointGroup(params: DeleteDataflowEndpointGroupRequest): Request[DataflowEndpointGroupIdResponse] = js.native
    def deleteEphemeris(params: DeleteEphemerisRequest): Request[EphemerisIdResponse] = js.native
    def deleteMissionProfile(params: DeleteMissionProfileRequest): Request[MissionProfileIdResponse] = js.native
    def describeContact(params: DescribeContactRequest): Request[DescribeContactResponse] = js.native
    def describeEphemeris(params: DescribeEphemerisRequest): Request[DescribeEphemerisResponse] = js.native
    def getConfig(params: GetConfigRequest): Request[GetConfigResponse] = js.native
    def getDataflowEndpointGroup(params: GetDataflowEndpointGroupRequest): Request[GetDataflowEndpointGroupResponse] = js.native
    def getMinuteUsage(params: GetMinuteUsageRequest): Request[GetMinuteUsageResponse] = js.native
    def getMissionProfile(params: GetMissionProfileRequest): Request[GetMissionProfileResponse] = js.native
    def getSatellite(params: GetSatelliteRequest): Request[GetSatelliteResponse] = js.native
    def listConfigs(params: ListConfigsRequest): Request[ListConfigsResponse] = js.native
    def listContacts(params: ListContactsRequest): Request[ListContactsResponse] = js.native
    def listDataflowEndpointGroups(params: ListDataflowEndpointGroupsRequest): Request[ListDataflowEndpointGroupsResponse] = js.native
    def listEphemerides(params: ListEphemeridesRequest): Request[ListEphemeridesResponse] = js.native
    def listGroundStations(params: ListGroundStationsRequest): Request[ListGroundStationsResponse] = js.native
    def listMissionProfiles(params: ListMissionProfilesRequest): Request[ListMissionProfilesResponse] = js.native
    def listSatellites(params: ListSatellitesRequest): Request[ListSatellitesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def reserveContact(params: ReserveContactRequest): Request[ContactIdResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateConfig(params: UpdateConfigRequest): Request[ConfigIdResponse] = js.native
    def updateEphemeris(params: UpdateEphemerisRequest): Request[EphemerisIdResponse] = js.native
    def updateMissionProfile(params: UpdateMissionProfileRequest): Request[MissionProfileIdResponse] = js.native
  }
  object GroundStation {
    @inline implicit def toOps(service: GroundStation): GroundStationOps = {
      new GroundStationOps(service)
    }
  }

  /** Details about an antenna demod decode <code>Config</code> used in a contact.
    */
  @js.native
  trait AntennaDemodDecodeDetails extends js.Object {
    var outputNode: js.UndefOr[String]
  }

  object AntennaDemodDecodeDetails {
    @inline
    def apply(
        outputNode: js.UndefOr[String] = js.undefined
    ): AntennaDemodDecodeDetails = {
      val __obj = js.Dynamic.literal()
      outputNode.foreach(__v => __obj.updateDynamic("outputNode")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AntennaDemodDecodeDetails]
    }
  }

  /** Information about how AWS Ground Station should configure an antenna for downlink during a contact.
    */
  @js.native
  trait AntennaDownlinkConfig extends js.Object {
    var spectrumConfig: SpectrumConfig
  }

  object AntennaDownlinkConfig {
    @inline
    def apply(
        spectrumConfig: SpectrumConfig
    ): AntennaDownlinkConfig = {
      val __obj = js.Dynamic.literal(
        "spectrumConfig" -> spectrumConfig.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AntennaDownlinkConfig]
    }
  }

  /** Information about how AWS Ground Station should conﬁgure an antenna for downlink demod decode during a contact.
    */
  @js.native
  trait AntennaDownlinkDemodDecodeConfig extends js.Object {
    var decodeConfig: DecodeConfig
    var demodulationConfig: DemodulationConfig
    var spectrumConfig: SpectrumConfig
  }

  object AntennaDownlinkDemodDecodeConfig {
    @inline
    def apply(
        decodeConfig: DecodeConfig,
        demodulationConfig: DemodulationConfig,
        spectrumConfig: SpectrumConfig
    ): AntennaDownlinkDemodDecodeConfig = {
      val __obj = js.Dynamic.literal(
        "decodeConfig" -> decodeConfig.asInstanceOf[js.Any],
        "demodulationConfig" -> demodulationConfig.asInstanceOf[js.Any],
        "spectrumConfig" -> spectrumConfig.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AntennaDownlinkDemodDecodeConfig]
    }
  }

  /** Information about the uplink <code>Config</code> of an antenna.
    */
  @js.native
  trait AntennaUplinkConfig extends js.Object {
    var spectrumConfig: UplinkSpectrumConfig
    var targetEirp: Eirp
    var transmitDisabled: js.UndefOr[Boolean]
  }

  object AntennaUplinkConfig {
    @inline
    def apply(
        spectrumConfig: UplinkSpectrumConfig,
        targetEirp: Eirp,
        transmitDisabled: js.UndefOr[Boolean] = js.undefined
    ): AntennaUplinkConfig = {
      val __obj = js.Dynamic.literal(
        "spectrumConfig" -> spectrumConfig.asInstanceOf[js.Any],
        "targetEirp" -> targetEirp.asInstanceOf[js.Any]
      )

      transmitDisabled.foreach(__v => __obj.updateDynamic("transmitDisabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AntennaUplinkConfig]
    }
  }

  /** <p/>
    */
  @js.native
  trait CancelContactRequest extends js.Object {
    var contactId: Uuid
  }

  object CancelContactRequest {
    @inline
    def apply(
        contactId: Uuid
    ): CancelContactRequest = {
      val __obj = js.Dynamic.literal(
        "contactId" -> contactId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CancelContactRequest]
    }
  }

  /** Details for certain <code>Config</code> object types in a contact.
    */
  @js.native
  trait ConfigDetails extends js.Object {
    var antennaDemodDecodeDetails: js.UndefOr[AntennaDemodDecodeDetails]
    var endpointDetails: js.UndefOr[EndpointDetails]
    var s3RecordingDetails: js.UndefOr[S3RecordingDetails]
  }

  object ConfigDetails {
    @inline
    def apply(
        antennaDemodDecodeDetails: js.UndefOr[AntennaDemodDecodeDetails] = js.undefined,
        endpointDetails: js.UndefOr[EndpointDetails] = js.undefined,
        s3RecordingDetails: js.UndefOr[S3RecordingDetails] = js.undefined
    ): ConfigDetails = {
      val __obj = js.Dynamic.literal()
      antennaDemodDecodeDetails.foreach(__v => __obj.updateDynamic("antennaDemodDecodeDetails")(__v.asInstanceOf[js.Any]))
      endpointDetails.foreach(__v => __obj.updateDynamic("endpointDetails")(__v.asInstanceOf[js.Any]))
      s3RecordingDetails.foreach(__v => __obj.updateDynamic("s3RecordingDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigDetails]
    }
  }

  /** <p/>
    */
  @js.native
  trait ConfigIdResponse extends js.Object {
    var configArn: js.UndefOr[ConfigArn]
    var configId: js.UndefOr[String]
    var configType: js.UndefOr[ConfigCapabilityType]
  }

  object ConfigIdResponse {
    @inline
    def apply(
        configArn: js.UndefOr[ConfigArn] = js.undefined,
        configId: js.UndefOr[String] = js.undefined,
        configType: js.UndefOr[ConfigCapabilityType] = js.undefined
    ): ConfigIdResponse = {
      val __obj = js.Dynamic.literal()
      configArn.foreach(__v => __obj.updateDynamic("configArn")(__v.asInstanceOf[js.Any]))
      configId.foreach(__v => __obj.updateDynamic("configId")(__v.asInstanceOf[js.Any]))
      configType.foreach(__v => __obj.updateDynamic("configType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigIdResponse]
    }
  }

  /** An item in a list of <code>Config</code> objects.
    */
  @js.native
  trait ConfigListItem extends js.Object {
    var configArn: js.UndefOr[ConfigArn]
    var configId: js.UndefOr[String]
    var configType: js.UndefOr[ConfigCapabilityType]
    var name: js.UndefOr[String]
  }

  object ConfigListItem {
    @inline
    def apply(
        configArn: js.UndefOr[ConfigArn] = js.undefined,
        configId: js.UndefOr[String] = js.undefined,
        configType: js.UndefOr[ConfigCapabilityType] = js.undefined,
        name: js.UndefOr[String] = js.undefined
    ): ConfigListItem = {
      val __obj = js.Dynamic.literal()
      configArn.foreach(__v => __obj.updateDynamic("configArn")(__v.asInstanceOf[js.Any]))
      configId.foreach(__v => __obj.updateDynamic("configId")(__v.asInstanceOf[js.Any]))
      configType.foreach(__v => __obj.updateDynamic("configType")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigListItem]
    }
  }

  /** Object containing the parameters of a <code>Config</code>. See the subtype definitions for what each type of <code>Config</code> contains.
    */
  @js.native
  trait ConfigTypeData extends js.Object {
    var antennaDownlinkConfig: js.UndefOr[AntennaDownlinkConfig]
    var antennaDownlinkDemodDecodeConfig: js.UndefOr[AntennaDownlinkDemodDecodeConfig]
    var antennaUplinkConfig: js.UndefOr[AntennaUplinkConfig]
    var dataflowEndpointConfig: js.UndefOr[DataflowEndpointConfig]
    var s3RecordingConfig: js.UndefOr[S3RecordingConfig]
    var trackingConfig: js.UndefOr[TrackingConfig]
    var uplinkEchoConfig: js.UndefOr[UplinkEchoConfig]
  }

  object ConfigTypeData {
    @inline
    def apply(
        antennaDownlinkConfig: js.UndefOr[AntennaDownlinkConfig] = js.undefined,
        antennaDownlinkDemodDecodeConfig: js.UndefOr[AntennaDownlinkDemodDecodeConfig] = js.undefined,
        antennaUplinkConfig: js.UndefOr[AntennaUplinkConfig] = js.undefined,
        dataflowEndpointConfig: js.UndefOr[DataflowEndpointConfig] = js.undefined,
        s3RecordingConfig: js.UndefOr[S3RecordingConfig] = js.undefined,
        trackingConfig: js.UndefOr[TrackingConfig] = js.undefined,
        uplinkEchoConfig: js.UndefOr[UplinkEchoConfig] = js.undefined
    ): ConfigTypeData = {
      val __obj = js.Dynamic.literal()
      antennaDownlinkConfig.foreach(__v => __obj.updateDynamic("antennaDownlinkConfig")(__v.asInstanceOf[js.Any]))
      antennaDownlinkDemodDecodeConfig.foreach(__v => __obj.updateDynamic("antennaDownlinkDemodDecodeConfig")(__v.asInstanceOf[js.Any]))
      antennaUplinkConfig.foreach(__v => __obj.updateDynamic("antennaUplinkConfig")(__v.asInstanceOf[js.Any]))
      dataflowEndpointConfig.foreach(__v => __obj.updateDynamic("dataflowEndpointConfig")(__v.asInstanceOf[js.Any]))
      s3RecordingConfig.foreach(__v => __obj.updateDynamic("s3RecordingConfig")(__v.asInstanceOf[js.Any]))
      trackingConfig.foreach(__v => __obj.updateDynamic("trackingConfig")(__v.asInstanceOf[js.Any]))
      uplinkEchoConfig.foreach(__v => __obj.updateDynamic("uplinkEchoConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigTypeData]
    }
  }

  /** Data describing a contact.
    */
  @js.native
  trait ContactData extends js.Object {
    var contactId: js.UndefOr[Uuid]
    var contactStatus: js.UndefOr[ContactStatus]
    var endTime: js.UndefOr[Timestamp]
    var errorMessage: js.UndefOr[String]
    var groundStation: js.UndefOr[String]
    var maximumElevation: js.UndefOr[Elevation]
    var missionProfileArn: js.UndefOr[MissionProfileArn]
    var postPassEndTime: js.UndefOr[Timestamp]
    var prePassStartTime: js.UndefOr[Timestamp]
    var region: js.UndefOr[String]
    var satelliteArn: js.UndefOr[satelliteArn]
    var startTime: js.UndefOr[Timestamp]
    var tags: js.UndefOr[TagsMap]
  }

  object ContactData {
    @inline
    def apply(
        contactId: js.UndefOr[Uuid] = js.undefined,
        contactStatus: js.UndefOr[ContactStatus] = js.undefined,
        endTime: js.UndefOr[Timestamp] = js.undefined,
        errorMessage: js.UndefOr[String] = js.undefined,
        groundStation: js.UndefOr[String] = js.undefined,
        maximumElevation: js.UndefOr[Elevation] = js.undefined,
        missionProfileArn: js.UndefOr[MissionProfileArn] = js.undefined,
        postPassEndTime: js.UndefOr[Timestamp] = js.undefined,
        prePassStartTime: js.UndefOr[Timestamp] = js.undefined,
        region: js.UndefOr[String] = js.undefined,
        satelliteArn: js.UndefOr[satelliteArn] = js.undefined,
        startTime: js.UndefOr[Timestamp] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): ContactData = {
      val __obj = js.Dynamic.literal()
      contactId.foreach(__v => __obj.updateDynamic("contactId")(__v.asInstanceOf[js.Any]))
      contactStatus.foreach(__v => __obj.updateDynamic("contactStatus")(__v.asInstanceOf[js.Any]))
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      groundStation.foreach(__v => __obj.updateDynamic("groundStation")(__v.asInstanceOf[js.Any]))
      maximumElevation.foreach(__v => __obj.updateDynamic("maximumElevation")(__v.asInstanceOf[js.Any]))
      missionProfileArn.foreach(__v => __obj.updateDynamic("missionProfileArn")(__v.asInstanceOf[js.Any]))
      postPassEndTime.foreach(__v => __obj.updateDynamic("postPassEndTime")(__v.asInstanceOf[js.Any]))
      prePassStartTime.foreach(__v => __obj.updateDynamic("prePassStartTime")(__v.asInstanceOf[js.Any]))
      region.foreach(__v => __obj.updateDynamic("region")(__v.asInstanceOf[js.Any]))
      satelliteArn.foreach(__v => __obj.updateDynamic("satelliteArn")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContactData]
    }
  }

  /** <p/>
    */
  @js.native
  trait ContactIdResponse extends js.Object {
    var contactId: js.UndefOr[Uuid]
  }

  object ContactIdResponse {
    @inline
    def apply(
        contactId: js.UndefOr[Uuid] = js.undefined
    ): ContactIdResponse = {
      val __obj = js.Dynamic.literal()
      contactId.foreach(__v => __obj.updateDynamic("contactId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ContactIdResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait CreateConfigRequest extends js.Object {
    var configData: ConfigTypeData
    var name: SafeName
    var tags: js.UndefOr[TagsMap]
  }

  object CreateConfigRequest {
    @inline
    def apply(
        configData: ConfigTypeData,
        name: SafeName,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): CreateConfigRequest = {
      val __obj = js.Dynamic.literal(
        "configData" -> configData.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateConfigRequest]
    }
  }

  /** <p/>
    */
  @js.native
  trait CreateDataflowEndpointGroupRequest extends js.Object {
    var endpointDetails: EndpointDetailsList
    var tags: js.UndefOr[TagsMap]
  }

  object CreateDataflowEndpointGroupRequest {
    @inline
    def apply(
        endpointDetails: EndpointDetailsList,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): CreateDataflowEndpointGroupRequest = {
      val __obj = js.Dynamic.literal(
        "endpointDetails" -> endpointDetails.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateDataflowEndpointGroupRequest]
    }
  }

  @js.native
  trait CreateEphemerisRequest extends js.Object {
    var name: SafeName
    var satelliteId: Uuid
    var enabled: js.UndefOr[Boolean]
    var ephemeris: js.UndefOr[EphemerisData]
    var expirationTime: js.UndefOr[Timestamp]
    var kmsKeyArn: js.UndefOr[KeyArn]
    var priority: js.UndefOr[CustomerEphemerisPriority]
    var tags: js.UndefOr[TagsMap]
  }

  object CreateEphemerisRequest {
    @inline
    def apply(
        name: SafeName,
        satelliteId: Uuid,
        enabled: js.UndefOr[Boolean] = js.undefined,
        ephemeris: js.UndefOr[EphemerisData] = js.undefined,
        expirationTime: js.UndefOr[Timestamp] = js.undefined,
        kmsKeyArn: js.UndefOr[KeyArn] = js.undefined,
        priority: js.UndefOr[CustomerEphemerisPriority] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): CreateEphemerisRequest = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "satelliteId" -> satelliteId.asInstanceOf[js.Any]
      )

      enabled.foreach(__v => __obj.updateDynamic("enabled")(__v.asInstanceOf[js.Any]))
      ephemeris.foreach(__v => __obj.updateDynamic("ephemeris")(__v.asInstanceOf[js.Any]))
      expirationTime.foreach(__v => __obj.updateDynamic("expirationTime")(__v.asInstanceOf[js.Any]))
      kmsKeyArn.foreach(__v => __obj.updateDynamic("kmsKeyArn")(__v.asInstanceOf[js.Any]))
      priority.foreach(__v => __obj.updateDynamic("priority")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateEphemerisRequest]
    }
  }

  /** <p/>
    */
  @js.native
  trait CreateMissionProfileRequest extends js.Object {
    var dataflowEdges: DataflowEdgeList
    var minimumViableContactDurationSeconds: PositiveDurationInSeconds
    var name: SafeName
    var trackingConfigArn: ConfigArn
    var contactPostPassDurationSeconds: js.UndefOr[DurationInSeconds]
    var contactPrePassDurationSeconds: js.UndefOr[DurationInSeconds]
    var tags: js.UndefOr[TagsMap]
  }

  object CreateMissionProfileRequest {
    @inline
    def apply(
        dataflowEdges: DataflowEdgeList,
        minimumViableContactDurationSeconds: PositiveDurationInSeconds,
        name: SafeName,
        trackingConfigArn: ConfigArn,
        contactPostPassDurationSeconds: js.UndefOr[DurationInSeconds] = js.undefined,
        contactPrePassDurationSeconds: js.UndefOr[DurationInSeconds] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): CreateMissionProfileRequest = {
      val __obj = js.Dynamic.literal(
        "dataflowEdges" -> dataflowEdges.asInstanceOf[js.Any],
        "minimumViableContactDurationSeconds" -> minimumViableContactDurationSeconds.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any],
        "trackingConfigArn" -> trackingConfigArn.asInstanceOf[js.Any]
      )

      contactPostPassDurationSeconds.foreach(__v => __obj.updateDynamic("contactPostPassDurationSeconds")(__v.asInstanceOf[js.Any]))
      contactPrePassDurationSeconds.foreach(__v => __obj.updateDynamic("contactPrePassDurationSeconds")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMissionProfileRequest]
    }
  }

  /** Information about a dataflow edge used in a contact.
    */
  @js.native
  trait DataflowDetail extends js.Object {
    var destination: js.UndefOr[Destination]
    var errorMessage: js.UndefOr[String]
    var source: js.UndefOr[Source]
  }

  object DataflowDetail {
    @inline
    def apply(
        destination: js.UndefOr[Destination] = js.undefined,
        errorMessage: js.UndefOr[String] = js.undefined,
        source: js.UndefOr[Source] = js.undefined
    ): DataflowDetail = {
      val __obj = js.Dynamic.literal()
      destination.foreach(__v => __obj.updateDynamic("destination")(__v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      source.foreach(__v => __obj.updateDynamic("source")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataflowDetail]
    }
  }

  /** Information about a dataflow endpoint.
    */
  @js.native
  trait DataflowEndpoint extends js.Object {
    var address: js.UndefOr[SocketAddress]
    var mtu: js.UndefOr[DataflowEndpointMtuInteger]
    var name: js.UndefOr[SafeName]
    var status: js.UndefOr[EndpointStatus]
  }

  object DataflowEndpoint {
    @inline
    def apply(
        address: js.UndefOr[SocketAddress] = js.undefined,
        mtu: js.UndefOr[DataflowEndpointMtuInteger] = js.undefined,
        name: js.UndefOr[SafeName] = js.undefined,
        status: js.UndefOr[EndpointStatus] = js.undefined
    ): DataflowEndpoint = {
      val __obj = js.Dynamic.literal()
      address.foreach(__v => __obj.updateDynamic("address")(__v.asInstanceOf[js.Any]))
      mtu.foreach(__v => __obj.updateDynamic("mtu")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataflowEndpoint]
    }
  }

  /** Information about the dataflow endpoint <code>Config</code>.
    */
  @js.native
  trait DataflowEndpointConfig extends js.Object {
    var dataflowEndpointName: String
    var dataflowEndpointRegion: js.UndefOr[String]
  }

  object DataflowEndpointConfig {
    @inline
    def apply(
        dataflowEndpointName: String,
        dataflowEndpointRegion: js.UndefOr[String] = js.undefined
    ): DataflowEndpointConfig = {
      val __obj = js.Dynamic.literal(
        "dataflowEndpointName" -> dataflowEndpointName.asInstanceOf[js.Any]
      )

      dataflowEndpointRegion.foreach(__v => __obj.updateDynamic("dataflowEndpointRegion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataflowEndpointConfig]
    }
  }

  /** <p/>
    */
  @js.native
  trait DataflowEndpointGroupIdResponse extends js.Object {
    var dataflowEndpointGroupId: js.UndefOr[Uuid]
  }

  object DataflowEndpointGroupIdResponse {
    @inline
    def apply(
        dataflowEndpointGroupId: js.UndefOr[Uuid] = js.undefined
    ): DataflowEndpointGroupIdResponse = {
      val __obj = js.Dynamic.literal()
      dataflowEndpointGroupId.foreach(__v => __obj.updateDynamic("dataflowEndpointGroupId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataflowEndpointGroupIdResponse]
    }
  }

  /** Item in a list of <code>DataflowEndpoint</code> groups.
    */
  @js.native
  trait DataflowEndpointListItem extends js.Object {
    var dataflowEndpointGroupArn: js.UndefOr[DataflowEndpointGroupArn]
    var dataflowEndpointGroupId: js.UndefOr[Uuid]
  }

  object DataflowEndpointListItem {
    @inline
    def apply(
        dataflowEndpointGroupArn: js.UndefOr[DataflowEndpointGroupArn] = js.undefined,
        dataflowEndpointGroupId: js.UndefOr[Uuid] = js.undefined
    ): DataflowEndpointListItem = {
      val __obj = js.Dynamic.literal()
      dataflowEndpointGroupArn.foreach(__v => __obj.updateDynamic("dataflowEndpointGroupArn")(__v.asInstanceOf[js.Any]))
      dataflowEndpointGroupId.foreach(__v => __obj.updateDynamic("dataflowEndpointGroupId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataflowEndpointListItem]
    }
  }

  /** Information about the decode <code>Config</code>.
    */
  @js.native
  trait DecodeConfig extends js.Object {
    var unvalidatedJSON: JsonString
  }

  object DecodeConfig {
    @inline
    def apply(
        unvalidatedJSON: JsonString
    ): DecodeConfig = {
      val __obj = js.Dynamic.literal(
        "unvalidatedJSON" -> unvalidatedJSON.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DecodeConfig]
    }
  }

  /** <p/>
    */
  @js.native
  trait DeleteConfigRequest extends js.Object {
    var configId: Uuid
    var configType: ConfigCapabilityType
  }

  object DeleteConfigRequest {
    @inline
    def apply(
        configId: Uuid,
        configType: ConfigCapabilityType
    ): DeleteConfigRequest = {
      val __obj = js.Dynamic.literal(
        "configId" -> configId.asInstanceOf[js.Any],
        "configType" -> configType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteConfigRequest]
    }
  }

  /** <p/>
    */
  @js.native
  trait DeleteDataflowEndpointGroupRequest extends js.Object {
    var dataflowEndpointGroupId: Uuid
  }

  object DeleteDataflowEndpointGroupRequest {
    @inline
    def apply(
        dataflowEndpointGroupId: Uuid
    ): DeleteDataflowEndpointGroupRequest = {
      val __obj = js.Dynamic.literal(
        "dataflowEndpointGroupId" -> dataflowEndpointGroupId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteDataflowEndpointGroupRequest]
    }
  }

  @js.native
  trait DeleteEphemerisRequest extends js.Object {
    var ephemerisId: Uuid
  }

  object DeleteEphemerisRequest {
    @inline
    def apply(
        ephemerisId: Uuid
    ): DeleteEphemerisRequest = {
      val __obj = js.Dynamic.literal(
        "ephemerisId" -> ephemerisId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteEphemerisRequest]
    }
  }

  /** <p/>
    */
  @js.native
  trait DeleteMissionProfileRequest extends js.Object {
    var missionProfileId: Uuid
  }

  object DeleteMissionProfileRequest {
    @inline
    def apply(
        missionProfileId: Uuid
    ): DeleteMissionProfileRequest = {
      val __obj = js.Dynamic.literal(
        "missionProfileId" -> missionProfileId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteMissionProfileRequest]
    }
  }

  /** Information about the demodulation <code>Config</code>.
    */
  @js.native
  trait DemodulationConfig extends js.Object {
    var unvalidatedJSON: JsonString
  }

  object DemodulationConfig {
    @inline
    def apply(
        unvalidatedJSON: JsonString
    ): DemodulationConfig = {
      val __obj = js.Dynamic.literal(
        "unvalidatedJSON" -> unvalidatedJSON.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DemodulationConfig]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeContactRequest extends js.Object {
    var contactId: Uuid
  }

  object DescribeContactRequest {
    @inline
    def apply(
        contactId: Uuid
    ): DescribeContactRequest = {
      val __obj = js.Dynamic.literal(
        "contactId" -> contactId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeContactRequest]
    }
  }

  /** <p/>
    */
  @js.native
  trait DescribeContactResponse extends js.Object {
    var contactId: js.UndefOr[Uuid]
    var contactStatus: js.UndefOr[ContactStatus]
    var dataflowList: js.UndefOr[DataflowList]
    var endTime: js.UndefOr[Timestamp]
    var errorMessage: js.UndefOr[String]
    var groundStation: js.UndefOr[String]
    var maximumElevation: js.UndefOr[Elevation]
    var missionProfileArn: js.UndefOr[MissionProfileArn]
    var postPassEndTime: js.UndefOr[Timestamp]
    var prePassStartTime: js.UndefOr[Timestamp]
    var region: js.UndefOr[String]
    var satelliteArn: js.UndefOr[satelliteArn]
    var startTime: js.UndefOr[Timestamp]
    var tags: js.UndefOr[TagsMap]
  }

  object DescribeContactResponse {
    @inline
    def apply(
        contactId: js.UndefOr[Uuid] = js.undefined,
        contactStatus: js.UndefOr[ContactStatus] = js.undefined,
        dataflowList: js.UndefOr[DataflowList] = js.undefined,
        endTime: js.UndefOr[Timestamp] = js.undefined,
        errorMessage: js.UndefOr[String] = js.undefined,
        groundStation: js.UndefOr[String] = js.undefined,
        maximumElevation: js.UndefOr[Elevation] = js.undefined,
        missionProfileArn: js.UndefOr[MissionProfileArn] = js.undefined,
        postPassEndTime: js.UndefOr[Timestamp] = js.undefined,
        prePassStartTime: js.UndefOr[Timestamp] = js.undefined,
        region: js.UndefOr[String] = js.undefined,
        satelliteArn: js.UndefOr[satelliteArn] = js.undefined,
        startTime: js.UndefOr[Timestamp] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): DescribeContactResponse = {
      val __obj = js.Dynamic.literal()
      contactId.foreach(__v => __obj.updateDynamic("contactId")(__v.asInstanceOf[js.Any]))
      contactStatus.foreach(__v => __obj.updateDynamic("contactStatus")(__v.asInstanceOf[js.Any]))
      dataflowList.foreach(__v => __obj.updateDynamic("dataflowList")(__v.asInstanceOf[js.Any]))
      endTime.foreach(__v => __obj.updateDynamic("endTime")(__v.asInstanceOf[js.Any]))
      errorMessage.foreach(__v => __obj.updateDynamic("errorMessage")(__v.asInstanceOf[js.Any]))
      groundStation.foreach(__v => __obj.updateDynamic("groundStation")(__v.asInstanceOf[js.Any]))
      maximumElevation.foreach(__v => __obj.updateDynamic("maximumElevation")(__v.asInstanceOf[js.Any]))
      missionProfileArn.foreach(__v => __obj.updateDynamic("missionProfileArn")(__v.asInstanceOf[js.Any]))
      postPassEndTime.foreach(__v => __obj.updateDynamic("postPassEndTime")(__v.asInstanceOf[js.Any]))
      prePassStartTime.foreach(__v => __obj.updateDynamic("prePassStartTime")(__v.asInstanceOf[js.Any]))
      region.foreach(__v => __obj.updateDynamic("region")(__v.asInstanceOf[js.Any]))
      satelliteArn.foreach(__v => __obj.updateDynamic("satelliteArn")(__v.asInstanceOf[js.Any]))
      startTime.foreach(__v => __obj.updateDynamic("startTime")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeContactResponse]
    }
  }

  @js.native
  trait DescribeEphemerisRequest extends js.Object {
    var ephemerisId: Uuid
  }

  object DescribeEphemerisRequest {
    @inline
    def apply(
        ephemerisId: Uuid
    ): DescribeEphemerisRequest = {
      val __obj = js.Dynamic.literal(
        "ephemerisId" -> ephemerisId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeEphemerisRequest]
    }
  }

  @js.native
  trait DescribeEphemerisResponse extends js.Object {
    var creationTime: js.UndefOr[Timestamp]
    var enabled: js.UndefOr[Boolean]
    var ephemerisId: js.UndefOr[Uuid]
    var invalidReason: js.UndefOr[EphemerisInvalidReason]
    var name: js.UndefOr[SafeName]
    var priority: js.UndefOr[EphemerisPriority]
    var satelliteId: js.UndefOr[Uuid]
    var status: js.UndefOr[EphemerisStatus]
    var suppliedData: js.UndefOr[EphemerisTypeDescription]
    var tags: js.UndefOr[TagsMap]
  }

  object DescribeEphemerisResponse {
    @inline
    def apply(
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        enabled: js.UndefOr[Boolean] = js.undefined,
        ephemerisId: js.UndefOr[Uuid] = js.undefined,
        invalidReason: js.UndefOr[EphemerisInvalidReason] = js.undefined,
        name: js.UndefOr[SafeName] = js.undefined,
        priority: js.UndefOr[EphemerisPriority] = js.undefined,
        satelliteId: js.UndefOr[Uuid] = js.undefined,
        status: js.UndefOr[EphemerisStatus] = js.undefined,
        suppliedData: js.UndefOr[EphemerisTypeDescription] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): DescribeEphemerisResponse = {
      val __obj = js.Dynamic.literal()
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      enabled.foreach(__v => __obj.updateDynamic("enabled")(__v.asInstanceOf[js.Any]))
      ephemerisId.foreach(__v => __obj.updateDynamic("ephemerisId")(__v.asInstanceOf[js.Any]))
      invalidReason.foreach(__v => __obj.updateDynamic("invalidReason")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      priority.foreach(__v => __obj.updateDynamic("priority")(__v.asInstanceOf[js.Any]))
      satelliteId.foreach(__v => __obj.updateDynamic("satelliteId")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      suppliedData.foreach(__v => __obj.updateDynamic("suppliedData")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeEphemerisResponse]
    }
  }

  /** Dataflow details for the destination side.
    */
  @js.native
  trait Destination extends js.Object {
    var configDetails: js.UndefOr[ConfigDetails]
    var configId: js.UndefOr[Uuid]
    var configType: js.UndefOr[ConfigCapabilityType]
    var dataflowDestinationRegion: js.UndefOr[String]
  }

  object Destination {
    @inline
    def apply(
        configDetails: js.UndefOr[ConfigDetails] = js.undefined,
        configId: js.UndefOr[Uuid] = js.undefined,
        configType: js.UndefOr[ConfigCapabilityType] = js.undefined,
        dataflowDestinationRegion: js.UndefOr[String] = js.undefined
    ): Destination = {
      val __obj = js.Dynamic.literal()
      configDetails.foreach(__v => __obj.updateDynamic("configDetails")(__v.asInstanceOf[js.Any]))
      configId.foreach(__v => __obj.updateDynamic("configId")(__v.asInstanceOf[js.Any]))
      configType.foreach(__v => __obj.updateDynamic("configType")(__v.asInstanceOf[js.Any]))
      dataflowDestinationRegion.foreach(__v => __obj.updateDynamic("dataflowDestinationRegion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Destination]
    }
  }

  /** Object that represents EIRP.
    */
  @js.native
  trait Eirp extends js.Object {
    var units: EirpUnits
    var value: Double
  }

  object Eirp {
    @inline
    def apply(
        units: EirpUnits,
        value: Double
    ): Eirp = {
      val __obj = js.Dynamic.literal(
        "units" -> units.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Eirp]
    }
  }

  /** Elevation angle of the satellite in the sky during a contact.
    */
  @js.native
  trait Elevation extends js.Object {
    var unit: AngleUnits
    var value: Double
  }

  object Elevation {
    @inline
    def apply(
        unit: AngleUnits,
        value: Double
    ): Elevation = {
      val __obj = js.Dynamic.literal(
        "unit" -> unit.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Elevation]
    }
  }

  /** Information about the endpoint details.
    */
  @js.native
  trait EndpointDetails extends js.Object {
    var endpoint: js.UndefOr[DataflowEndpoint]
    var securityDetails: js.UndefOr[SecurityDetails]
  }

  object EndpointDetails {
    @inline
    def apply(
        endpoint: js.UndefOr[DataflowEndpoint] = js.undefined,
        securityDetails: js.UndefOr[SecurityDetails] = js.undefined
    ): EndpointDetails = {
      val __obj = js.Dynamic.literal()
      endpoint.foreach(__v => __obj.updateDynamic("endpoint")(__v.asInstanceOf[js.Any]))
      securityDetails.foreach(__v => __obj.updateDynamic("securityDetails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EndpointDetails]
    }
  }

  /** Ephemeris data.
    */
  @js.native
  trait EphemerisData extends js.Object {
    var oem: js.UndefOr[OEMEphemeris]
    var tle: js.UndefOr[TLEEphemeris]
  }

  object EphemerisData {
    @inline
    def apply(
        oem: js.UndefOr[OEMEphemeris] = js.undefined,
        tle: js.UndefOr[TLEEphemeris] = js.undefined
    ): EphemerisData = {
      val __obj = js.Dynamic.literal()
      oem.foreach(__v => __obj.updateDynamic("oem")(__v.asInstanceOf[js.Any]))
      tle.foreach(__v => __obj.updateDynamic("tle")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EphemerisData]
    }
  }

  /** Description of ephemeris.
    */
  @js.native
  trait EphemerisDescription extends js.Object {
    var ephemerisData: js.UndefOr[UnboundedString]
    var sourceS3Object: js.UndefOr[S3Object]
  }

  object EphemerisDescription {
    @inline
    def apply(
        ephemerisData: js.UndefOr[UnboundedString] = js.undefined,
        sourceS3Object: js.UndefOr[S3Object] = js.undefined
    ): EphemerisDescription = {
      val __obj = js.Dynamic.literal()
      ephemerisData.foreach(__v => __obj.updateDynamic("ephemerisData")(__v.asInstanceOf[js.Any]))
      sourceS3Object.foreach(__v => __obj.updateDynamic("sourceS3Object")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EphemerisDescription]
    }
  }

  @js.native
  trait EphemerisIdResponse extends js.Object {
    var ephemerisId: js.UndefOr[Uuid]
  }

  object EphemerisIdResponse {
    @inline
    def apply(
        ephemerisId: js.UndefOr[Uuid] = js.undefined
    ): EphemerisIdResponse = {
      val __obj = js.Dynamic.literal()
      ephemerisId.foreach(__v => __obj.updateDynamic("ephemerisId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EphemerisIdResponse]
    }
  }

  /** Ephemeris item.
    */
  @js.native
  trait EphemerisItem extends js.Object {
    var creationTime: js.UndefOr[Timestamp]
    var enabled: js.UndefOr[Boolean]
    var ephemerisId: js.UndefOr[Uuid]
    var name: js.UndefOr[SafeName]
    var priority: js.UndefOr[EphemerisPriority]
    var sourceS3Object: js.UndefOr[S3Object]
    var status: js.UndefOr[EphemerisStatus]
  }

  object EphemerisItem {
    @inline
    def apply(
        creationTime: js.UndefOr[Timestamp] = js.undefined,
        enabled: js.UndefOr[Boolean] = js.undefined,
        ephemerisId: js.UndefOr[Uuid] = js.undefined,
        name: js.UndefOr[SafeName] = js.undefined,
        priority: js.UndefOr[EphemerisPriority] = js.undefined,
        sourceS3Object: js.UndefOr[S3Object] = js.undefined,
        status: js.UndefOr[EphemerisStatus] = js.undefined
    ): EphemerisItem = {
      val __obj = js.Dynamic.literal()
      creationTime.foreach(__v => __obj.updateDynamic("creationTime")(__v.asInstanceOf[js.Any]))
      enabled.foreach(__v => __obj.updateDynamic("enabled")(__v.asInstanceOf[js.Any]))
      ephemerisId.foreach(__v => __obj.updateDynamic("ephemerisId")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      priority.foreach(__v => __obj.updateDynamic("priority")(__v.asInstanceOf[js.Any]))
      sourceS3Object.foreach(__v => __obj.updateDynamic("sourceS3Object")(__v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EphemerisItem]
    }
  }

  /** Metadata describing a particular ephemeris.
    */
  @js.native
  trait EphemerisMetaData extends js.Object {
    var source: EphemerisSource
    var ephemerisId: js.UndefOr[Uuid]
    var epoch: js.UndefOr[Timestamp]
    var name: js.UndefOr[SafeName]
  }

  object EphemerisMetaData {
    @inline
    def apply(
        source: EphemerisSource,
        ephemerisId: js.UndefOr[Uuid] = js.undefined,
        epoch: js.UndefOr[Timestamp] = js.undefined,
        name: js.UndefOr[SafeName] = js.undefined
    ): EphemerisMetaData = {
      val __obj = js.Dynamic.literal(
        "source" -> source.asInstanceOf[js.Any]
      )

      ephemerisId.foreach(__v => __obj.updateDynamic("ephemerisId")(__v.asInstanceOf[js.Any]))
      epoch.foreach(__v => __obj.updateDynamic("epoch")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EphemerisMetaData]
    }
  }

  /** <p/>
    */
  @js.native
  trait EphemerisTypeDescription extends js.Object {
    var oem: js.UndefOr[EphemerisDescription]
    var tle: js.UndefOr[EphemerisDescription]
  }

  object EphemerisTypeDescription {
    @inline
    def apply(
        oem: js.UndefOr[EphemerisDescription] = js.undefined,
        tle: js.UndefOr[EphemerisDescription] = js.undefined
    ): EphemerisTypeDescription = {
      val __obj = js.Dynamic.literal()
      oem.foreach(__v => __obj.updateDynamic("oem")(__v.asInstanceOf[js.Any]))
      tle.foreach(__v => __obj.updateDynamic("tle")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EphemerisTypeDescription]
    }
  }

  /** Object that describes the frequency.
    */
  @js.native
  trait Frequency extends js.Object {
    var units: FrequencyUnits
    var value: Double
  }

  object Frequency {
    @inline
    def apply(
        units: FrequencyUnits,
        value: Double
    ): Frequency = {
      val __obj = js.Dynamic.literal(
        "units" -> units.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Frequency]
    }
  }

  /** Object that describes the frequency bandwidth.
    */
  @js.native
  trait FrequencyBandwidth extends js.Object {
    var units: BandwidthUnits
    var value: Double
  }

  object FrequencyBandwidth {
    @inline
    def apply(
        units: BandwidthUnits,
        value: Double
    ): FrequencyBandwidth = {
      val __obj = js.Dynamic.literal(
        "units" -> units.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[FrequencyBandwidth]
    }
  }

  /** <p/>
    */
  @js.native
  trait GetConfigRequest extends js.Object {
    var configId: Uuid
    var configType: ConfigCapabilityType
  }

  object GetConfigRequest {
    @inline
    def apply(
        configId: Uuid,
        configType: ConfigCapabilityType
    ): GetConfigRequest = {
      val __obj = js.Dynamic.literal(
        "configId" -> configId.asInstanceOf[js.Any],
        "configType" -> configType.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetConfigRequest]
    }
  }

  /** <p/>
    */
  @js.native
  trait GetConfigResponse extends js.Object {
    var configArn: ConfigArn
    var configData: ConfigTypeData
    var configId: String
    var name: String
    var configType: js.UndefOr[ConfigCapabilityType]
    var tags: js.UndefOr[TagsMap]
  }

  object GetConfigResponse {
    @inline
    def apply(
        configArn: ConfigArn,
        configData: ConfigTypeData,
        configId: String,
        name: String,
        configType: js.UndefOr[ConfigCapabilityType] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): GetConfigResponse = {
      val __obj = js.Dynamic.literal(
        "configArn" -> configArn.asInstanceOf[js.Any],
        "configData" -> configData.asInstanceOf[js.Any],
        "configId" -> configId.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )

      configType.foreach(__v => __obj.updateDynamic("configType")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetConfigResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait GetDataflowEndpointGroupRequest extends js.Object {
    var dataflowEndpointGroupId: Uuid
  }

  object GetDataflowEndpointGroupRequest {
    @inline
    def apply(
        dataflowEndpointGroupId: Uuid
    ): GetDataflowEndpointGroupRequest = {
      val __obj = js.Dynamic.literal(
        "dataflowEndpointGroupId" -> dataflowEndpointGroupId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDataflowEndpointGroupRequest]
    }
  }

  /** <p/>
    */
  @js.native
  trait GetDataflowEndpointGroupResponse extends js.Object {
    var dataflowEndpointGroupArn: js.UndefOr[DataflowEndpointGroupArn]
    var dataflowEndpointGroupId: js.UndefOr[Uuid]
    var endpointsDetails: js.UndefOr[EndpointDetailsList]
    var tags: js.UndefOr[TagsMap]
  }

  object GetDataflowEndpointGroupResponse {
    @inline
    def apply(
        dataflowEndpointGroupArn: js.UndefOr[DataflowEndpointGroupArn] = js.undefined,
        dataflowEndpointGroupId: js.UndefOr[Uuid] = js.undefined,
        endpointsDetails: js.UndefOr[EndpointDetailsList] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): GetDataflowEndpointGroupResponse = {
      val __obj = js.Dynamic.literal()
      dataflowEndpointGroupArn.foreach(__v => __obj.updateDynamic("dataflowEndpointGroupArn")(__v.asInstanceOf[js.Any]))
      dataflowEndpointGroupId.foreach(__v => __obj.updateDynamic("dataflowEndpointGroupId")(__v.asInstanceOf[js.Any]))
      endpointsDetails.foreach(__v => __obj.updateDynamic("endpointsDetails")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDataflowEndpointGroupResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait GetMinuteUsageRequest extends js.Object {
    var month: Month
    var year: Year
  }

  object GetMinuteUsageRequest {
    @inline
    def apply(
        month: Month,
        year: Year
    ): GetMinuteUsageRequest = {
      val __obj = js.Dynamic.literal(
        "month" -> month.asInstanceOf[js.Any],
        "year" -> year.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMinuteUsageRequest]
    }
  }

  /** <p/>
    */
  @js.native
  trait GetMinuteUsageResponse extends js.Object {
    var estimatedMinutesRemaining: js.UndefOr[Int]
    var isReservedMinutesCustomer: js.UndefOr[Boolean]
    var totalReservedMinuteAllocation: js.UndefOr[Int]
    var totalScheduledMinutes: js.UndefOr[Int]
    var upcomingMinutesScheduled: js.UndefOr[Int]
  }

  object GetMinuteUsageResponse {
    @inline
    def apply(
        estimatedMinutesRemaining: js.UndefOr[Int] = js.undefined,
        isReservedMinutesCustomer: js.UndefOr[Boolean] = js.undefined,
        totalReservedMinuteAllocation: js.UndefOr[Int] = js.undefined,
        totalScheduledMinutes: js.UndefOr[Int] = js.undefined,
        upcomingMinutesScheduled: js.UndefOr[Int] = js.undefined
    ): GetMinuteUsageResponse = {
      val __obj = js.Dynamic.literal()
      estimatedMinutesRemaining.foreach(__v => __obj.updateDynamic("estimatedMinutesRemaining")(__v.asInstanceOf[js.Any]))
      isReservedMinutesCustomer.foreach(__v => __obj.updateDynamic("isReservedMinutesCustomer")(__v.asInstanceOf[js.Any]))
      totalReservedMinuteAllocation.foreach(__v => __obj.updateDynamic("totalReservedMinuteAllocation")(__v.asInstanceOf[js.Any]))
      totalScheduledMinutes.foreach(__v => __obj.updateDynamic("totalScheduledMinutes")(__v.asInstanceOf[js.Any]))
      upcomingMinutesScheduled.foreach(__v => __obj.updateDynamic("upcomingMinutesScheduled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMinuteUsageResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait GetMissionProfileRequest extends js.Object {
    var missionProfileId: Uuid
  }

  object GetMissionProfileRequest {
    @inline
    def apply(
        missionProfileId: Uuid
    ): GetMissionProfileRequest = {
      val __obj = js.Dynamic.literal(
        "missionProfileId" -> missionProfileId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetMissionProfileRequest]
    }
  }

  /** <p/>
    */
  @js.native
  trait GetMissionProfileResponse extends js.Object {
    var contactPostPassDurationSeconds: js.UndefOr[DurationInSeconds]
    var contactPrePassDurationSeconds: js.UndefOr[DurationInSeconds]
    var dataflowEdges: js.UndefOr[DataflowEdgeList]
    var minimumViableContactDurationSeconds: js.UndefOr[PositiveDurationInSeconds]
    var missionProfileArn: js.UndefOr[MissionProfileArn]
    var missionProfileId: js.UndefOr[Uuid]
    var name: js.UndefOr[SafeName]
    var region: js.UndefOr[AWSRegion]
    var tags: js.UndefOr[TagsMap]
    var trackingConfigArn: js.UndefOr[ConfigArn]
  }

  object GetMissionProfileResponse {
    @inline
    def apply(
        contactPostPassDurationSeconds: js.UndefOr[DurationInSeconds] = js.undefined,
        contactPrePassDurationSeconds: js.UndefOr[DurationInSeconds] = js.undefined,
        dataflowEdges: js.UndefOr[DataflowEdgeList] = js.undefined,
        minimumViableContactDurationSeconds: js.UndefOr[PositiveDurationInSeconds] = js.undefined,
        missionProfileArn: js.UndefOr[MissionProfileArn] = js.undefined,
        missionProfileId: js.UndefOr[Uuid] = js.undefined,
        name: js.UndefOr[SafeName] = js.undefined,
        region: js.UndefOr[AWSRegion] = js.undefined,
        tags: js.UndefOr[TagsMap] = js.undefined,
        trackingConfigArn: js.UndefOr[ConfigArn] = js.undefined
    ): GetMissionProfileResponse = {
      val __obj = js.Dynamic.literal()
      contactPostPassDurationSeconds.foreach(__v => __obj.updateDynamic("contactPostPassDurationSeconds")(__v.asInstanceOf[js.Any]))
      contactPrePassDurationSeconds.foreach(__v => __obj.updateDynamic("contactPrePassDurationSeconds")(__v.asInstanceOf[js.Any]))
      dataflowEdges.foreach(__v => __obj.updateDynamic("dataflowEdges")(__v.asInstanceOf[js.Any]))
      minimumViableContactDurationSeconds.foreach(__v => __obj.updateDynamic("minimumViableContactDurationSeconds")(__v.asInstanceOf[js.Any]))
      missionProfileArn.foreach(__v => __obj.updateDynamic("missionProfileArn")(__v.asInstanceOf[js.Any]))
      missionProfileId.foreach(__v => __obj.updateDynamic("missionProfileId")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      region.foreach(__v => __obj.updateDynamic("region")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      trackingConfigArn.foreach(__v => __obj.updateDynamic("trackingConfigArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMissionProfileResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait GetSatelliteRequest extends js.Object {
    var satelliteId: Uuid
  }

  object GetSatelliteRequest {
    @inline
    def apply(
        satelliteId: Uuid
    ): GetSatelliteRequest = {
      val __obj = js.Dynamic.literal(
        "satelliteId" -> satelliteId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetSatelliteRequest]
    }
  }

  /** <p/>
    */
  @js.native
  trait GetSatelliteResponse extends js.Object {
    var currentEphemeris: js.UndefOr[EphemerisMetaData]
    var groundStations: js.UndefOr[GroundStationIdList]
    var noradSatelliteID: js.UndefOr[noradSatelliteID]
    var satelliteArn: js.UndefOr[satelliteArn]
    var satelliteId: js.UndefOr[Uuid]
  }

  object GetSatelliteResponse {
    @inline
    def apply(
        currentEphemeris: js.UndefOr[EphemerisMetaData] = js.undefined,
        groundStations: js.UndefOr[GroundStationIdList] = js.undefined,
        noradSatelliteID: js.UndefOr[noradSatelliteID] = js.undefined,
        satelliteArn: js.UndefOr[satelliteArn] = js.undefined,
        satelliteId: js.UndefOr[Uuid] = js.undefined
    ): GetSatelliteResponse = {
      val __obj = js.Dynamic.literal()
      currentEphemeris.foreach(__v => __obj.updateDynamic("currentEphemeris")(__v.asInstanceOf[js.Any]))
      groundStations.foreach(__v => __obj.updateDynamic("groundStations")(__v.asInstanceOf[js.Any]))
      noradSatelliteID.foreach(__v => __obj.updateDynamic("noradSatelliteID")(__v.asInstanceOf[js.Any]))
      satelliteArn.foreach(__v => __obj.updateDynamic("satelliteArn")(__v.asInstanceOf[js.Any]))
      satelliteId.foreach(__v => __obj.updateDynamic("satelliteId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSatelliteResponse]
    }
  }

  /** Information about the ground station data.
    */
  @js.native
  trait GroundStationData extends js.Object {
    var groundStationId: js.UndefOr[GroundStationName]
    var groundStationName: js.UndefOr[GroundStationName]
    var region: js.UndefOr[AWSRegion]
  }

  object GroundStationData {
    @inline
    def apply(
        groundStationId: js.UndefOr[GroundStationName] = js.undefined,
        groundStationName: js.UndefOr[GroundStationName] = js.undefined,
        region: js.UndefOr[AWSRegion] = js.undefined
    ): GroundStationData = {
      val __obj = js.Dynamic.literal()
      groundStationId.foreach(__v => __obj.updateDynamic("groundStationId")(__v.asInstanceOf[js.Any]))
      groundStationName.foreach(__v => __obj.updateDynamic("groundStationName")(__v.asInstanceOf[js.Any]))
      region.foreach(__v => __obj.updateDynamic("region")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GroundStationData]
    }
  }

  /** <p/>
    */
  @js.native
  trait ListConfigsRequest extends js.Object {
    var maxResults: js.UndefOr[PaginationMaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListConfigsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[PaginationMaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListConfigsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConfigsRequest]
    }
  }

  /** <p/>
    */
  @js.native
  trait ListConfigsResponse extends js.Object {
    var configList: js.UndefOr[ConfigList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListConfigsResponse {
    @inline
    def apply(
        configList: js.UndefOr[ConfigList] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListConfigsResponse = {
      val __obj = js.Dynamic.literal()
      configList.foreach(__v => __obj.updateDynamic("configList")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListConfigsResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait ListContactsRequest extends js.Object {
    var endTime: Timestamp
    var startTime: Timestamp
    var statusList: StatusList
    var groundStation: js.UndefOr[GroundStationName]
    var maxResults: js.UndefOr[PaginationMaxResults]
    var missionProfileArn: js.UndefOr[MissionProfileArn]
    var nextToken: js.UndefOr[PaginationToken]
    var satelliteArn: js.UndefOr[satelliteArn]
  }

  object ListContactsRequest {
    @inline
    def apply(
        endTime: Timestamp,
        startTime: Timestamp,
        statusList: StatusList,
        groundStation: js.UndefOr[GroundStationName] = js.undefined,
        maxResults: js.UndefOr[PaginationMaxResults] = js.undefined,
        missionProfileArn: js.UndefOr[MissionProfileArn] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        satelliteArn: js.UndefOr[satelliteArn] = js.undefined
    ): ListContactsRequest = {
      val __obj = js.Dynamic.literal(
        "endTime" -> endTime.asInstanceOf[js.Any],
        "startTime" -> startTime.asInstanceOf[js.Any],
        "statusList" -> statusList.asInstanceOf[js.Any]
      )

      groundStation.foreach(__v => __obj.updateDynamic("groundStation")(__v.asInstanceOf[js.Any]))
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      missionProfileArn.foreach(__v => __obj.updateDynamic("missionProfileArn")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      satelliteArn.foreach(__v => __obj.updateDynamic("satelliteArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListContactsRequest]
    }
  }

  /** <p/>
    */
  @js.native
  trait ListContactsResponse extends js.Object {
    var contactList: js.UndefOr[ContactList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListContactsResponse {
    @inline
    def apply(
        contactList: js.UndefOr[ContactList] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListContactsResponse = {
      val __obj = js.Dynamic.literal()
      contactList.foreach(__v => __obj.updateDynamic("contactList")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListContactsResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait ListDataflowEndpointGroupsRequest extends js.Object {
    var maxResults: js.UndefOr[PaginationMaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListDataflowEndpointGroupsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[PaginationMaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListDataflowEndpointGroupsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataflowEndpointGroupsRequest]
    }
  }

  /** <p/>
    */
  @js.native
  trait ListDataflowEndpointGroupsResponse extends js.Object {
    var dataflowEndpointGroupList: js.UndefOr[DataflowEndpointGroupList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListDataflowEndpointGroupsResponse {
    @inline
    def apply(
        dataflowEndpointGroupList: js.UndefOr[DataflowEndpointGroupList] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListDataflowEndpointGroupsResponse = {
      val __obj = js.Dynamic.literal()
      dataflowEndpointGroupList.foreach(__v => __obj.updateDynamic("dataflowEndpointGroupList")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDataflowEndpointGroupsResponse]
    }
  }

  @js.native
  trait ListEphemeridesRequest extends js.Object {
    var endTime: Timestamp
    var satelliteId: Uuid
    var startTime: Timestamp
    var maxResults: js.UndefOr[PaginationMaxResults]
    var nextToken: js.UndefOr[PaginationToken]
    var statusList: js.UndefOr[EphemerisStatusList]
  }

  object ListEphemeridesRequest {
    @inline
    def apply(
        endTime: Timestamp,
        satelliteId: Uuid,
        startTime: Timestamp,
        maxResults: js.UndefOr[PaginationMaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        statusList: js.UndefOr[EphemerisStatusList] = js.undefined
    ): ListEphemeridesRequest = {
      val __obj = js.Dynamic.literal(
        "endTime" -> endTime.asInstanceOf[js.Any],
        "satelliteId" -> satelliteId.asInstanceOf[js.Any],
        "startTime" -> startTime.asInstanceOf[js.Any]
      )

      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      statusList.foreach(__v => __obj.updateDynamic("statusList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEphemeridesRequest]
    }
  }

  @js.native
  trait ListEphemeridesResponse extends js.Object {
    var ephemerides: js.UndefOr[EphemeridesList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListEphemeridesResponse {
    @inline
    def apply(
        ephemerides: js.UndefOr[EphemeridesList] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListEphemeridesResponse = {
      val __obj = js.Dynamic.literal()
      ephemerides.foreach(__v => __obj.updateDynamic("ephemerides")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListEphemeridesResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait ListGroundStationsRequest extends js.Object {
    var maxResults: js.UndefOr[PaginationMaxResults]
    var nextToken: js.UndefOr[PaginationToken]
    var satelliteId: js.UndefOr[Uuid]
  }

  object ListGroundStationsRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[PaginationMaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        satelliteId: js.UndefOr[Uuid] = js.undefined
    ): ListGroundStationsRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      satelliteId.foreach(__v => __obj.updateDynamic("satelliteId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroundStationsRequest]
    }
  }

  /** <p/>
    */
  @js.native
  trait ListGroundStationsResponse extends js.Object {
    var groundStationList: js.UndefOr[GroundStationList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListGroundStationsResponse {
    @inline
    def apply(
        groundStationList: js.UndefOr[GroundStationList] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListGroundStationsResponse = {
      val __obj = js.Dynamic.literal()
      groundStationList.foreach(__v => __obj.updateDynamic("groundStationList")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGroundStationsResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait ListMissionProfilesRequest extends js.Object {
    var maxResults: js.UndefOr[PaginationMaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListMissionProfilesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[PaginationMaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListMissionProfilesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMissionProfilesRequest]
    }
  }

  /** <p/>
    */
  @js.native
  trait ListMissionProfilesResponse extends js.Object {
    var missionProfileList: js.UndefOr[MissionProfileList]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListMissionProfilesResponse {
    @inline
    def apply(
        missionProfileList: js.UndefOr[MissionProfileList] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListMissionProfilesResponse = {
      val __obj = js.Dynamic.literal()
      missionProfileList.foreach(__v => __obj.updateDynamic("missionProfileList")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMissionProfilesResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait ListSatellitesRequest extends js.Object {
    var maxResults: js.UndefOr[PaginationMaxResults]
    var nextToken: js.UndefOr[PaginationToken]
  }

  object ListSatellitesRequest {
    @inline
    def apply(
        maxResults: js.UndefOr[PaginationMaxResults] = js.undefined,
        nextToken: js.UndefOr[PaginationToken] = js.undefined
    ): ListSatellitesRequest = {
      val __obj = js.Dynamic.literal()
      maxResults.foreach(__v => __obj.updateDynamic("maxResults")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSatellitesRequest]
    }
  }

  /** <p/>
    */
  @js.native
  trait ListSatellitesResponse extends js.Object {
    var nextToken: js.UndefOr[PaginationToken]
    var satellites: js.UndefOr[SatelliteList]
  }

  object ListSatellitesResponse {
    @inline
    def apply(
        nextToken: js.UndefOr[PaginationToken] = js.undefined,
        satellites: js.UndefOr[SatelliteList] = js.undefined
    ): ListSatellitesResponse = {
      val __obj = js.Dynamic.literal()
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      satellites.foreach(__v => __obj.updateDynamic("satellites")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSatellitesResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: AnyArn
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        resourceArn: AnyArn
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  /** <p/>
    */
  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagsMap]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        tags: js.UndefOr[TagsMap] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait MissionProfileIdResponse extends js.Object {
    var missionProfileId: js.UndefOr[Uuid]
  }

  object MissionProfileIdResponse {
    @inline
    def apply(
        missionProfileId: js.UndefOr[Uuid] = js.undefined
    ): MissionProfileIdResponse = {
      val __obj = js.Dynamic.literal()
      missionProfileId.foreach(__v => __obj.updateDynamic("missionProfileId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MissionProfileIdResponse]
    }
  }

  /** Item in a list of mission profiles.
    */
  @js.native
  trait MissionProfileListItem extends js.Object {
    var missionProfileArn: js.UndefOr[MissionProfileArn]
    var missionProfileId: js.UndefOr[Uuid]
    var name: js.UndefOr[SafeName]
    var region: js.UndefOr[AWSRegion]
  }

  object MissionProfileListItem {
    @inline
    def apply(
        missionProfileArn: js.UndefOr[MissionProfileArn] = js.undefined,
        missionProfileId: js.UndefOr[Uuid] = js.undefined,
        name: js.UndefOr[SafeName] = js.undefined,
        region: js.UndefOr[AWSRegion] = js.undefined
    ): MissionProfileListItem = {
      val __obj = js.Dynamic.literal()
      missionProfileArn.foreach(__v => __obj.updateDynamic("missionProfileArn")(__v.asInstanceOf[js.Any]))
      missionProfileId.foreach(__v => __obj.updateDynamic("missionProfileId")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      region.foreach(__v => __obj.updateDynamic("region")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MissionProfileListItem]
    }
  }

  /** Ephemeris data in Orbit Ephemeris Message (OEM) format.
    */
  @js.native
  trait OEMEphemeris extends js.Object {
    var oemData: js.UndefOr[UnboundedString]
    var s3Object: js.UndefOr[S3Object]
  }

  object OEMEphemeris {
    @inline
    def apply(
        oemData: js.UndefOr[UnboundedString] = js.undefined,
        s3Object: js.UndefOr[S3Object] = js.undefined
    ): OEMEphemeris = {
      val __obj = js.Dynamic.literal()
      oemData.foreach(__v => __obj.updateDynamic("oemData")(__v.asInstanceOf[js.Any]))
      s3Object.foreach(__v => __obj.updateDynamic("s3Object")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OEMEphemeris]
    }
  }

  /** <p/>
    */
  @js.native
  trait ReserveContactRequest extends js.Object {
    var endTime: Timestamp
    var groundStation: GroundStationName
    var missionProfileArn: MissionProfileArn
    var satelliteArn: satelliteArn
    var startTime: Timestamp
    var tags: js.UndefOr[TagsMap]
  }

  object ReserveContactRequest {
    @inline
    def apply(
        endTime: Timestamp,
        groundStation: GroundStationName,
        missionProfileArn: MissionProfileArn,
        satelliteArn: satelliteArn,
        startTime: Timestamp,
        tags: js.UndefOr[TagsMap] = js.undefined
    ): ReserveContactRequest = {
      val __obj = js.Dynamic.literal(
        "endTime" -> endTime.asInstanceOf[js.Any],
        "groundStation" -> groundStation.asInstanceOf[js.Any],
        "missionProfileArn" -> missionProfileArn.asInstanceOf[js.Any],
        "satelliteArn" -> satelliteArn.asInstanceOf[js.Any],
        "startTime" -> startTime.asInstanceOf[js.Any]
      )

      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ReserveContactRequest]
    }
  }

  /** Object stored in S3 containing ephemeris data.
    */
  @js.native
  trait S3Object extends js.Object {
    var bucket: js.UndefOr[S3BucketName]
    var key: js.UndefOr[S3ObjectKey]
    var version: js.UndefOr[S3VersionId]
  }

  object S3Object {
    @inline
    def apply(
        bucket: js.UndefOr[S3BucketName] = js.undefined,
        key: js.UndefOr[S3ObjectKey] = js.undefined,
        version: js.UndefOr[S3VersionId] = js.undefined
    ): S3Object = {
      val __obj = js.Dynamic.literal()
      bucket.foreach(__v => __obj.updateDynamic("bucket")(__v.asInstanceOf[js.Any]))
      key.foreach(__v => __obj.updateDynamic("key")(__v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.updateDynamic("version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3Object]
    }
  }

  /** Information about an S3 recording <code>Config</code>.
    */
  @js.native
  trait S3RecordingConfig extends js.Object {
    var bucketArn: BucketArn
    var roleArn: RoleArn
    var prefix: js.UndefOr[S3KeyPrefix]
  }

  object S3RecordingConfig {
    @inline
    def apply(
        bucketArn: BucketArn,
        roleArn: RoleArn,
        prefix: js.UndefOr[S3KeyPrefix] = js.undefined
    ): S3RecordingConfig = {
      val __obj = js.Dynamic.literal(
        "bucketArn" -> bucketArn.asInstanceOf[js.Any],
        "roleArn" -> roleArn.asInstanceOf[js.Any]
      )

      prefix.foreach(__v => __obj.updateDynamic("prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3RecordingConfig]
    }
  }

  /** Details about an S3 recording <code>Config</code> used in a contact.
    */
  @js.native
  trait S3RecordingDetails extends js.Object {
    var bucketArn: js.UndefOr[BucketArn]
    var keyTemplate: js.UndefOr[String]
  }

  object S3RecordingDetails {
    @inline
    def apply(
        bucketArn: js.UndefOr[BucketArn] = js.undefined,
        keyTemplate: js.UndefOr[String] = js.undefined
    ): S3RecordingDetails = {
      val __obj = js.Dynamic.literal()
      bucketArn.foreach(__v => __obj.updateDynamic("bucketArn")(__v.asInstanceOf[js.Any]))
      keyTemplate.foreach(__v => __obj.updateDynamic("keyTemplate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[S3RecordingDetails]
    }
  }

  /** Item in a list of satellites.
    */
  @js.native
  trait SatelliteListItem extends js.Object {
    var currentEphemeris: js.UndefOr[EphemerisMetaData]
    var groundStations: js.UndefOr[GroundStationIdList]
    var noradSatelliteID: js.UndefOr[noradSatelliteID]
    var satelliteArn: js.UndefOr[satelliteArn]
    var satelliteId: js.UndefOr[Uuid]
  }

  object SatelliteListItem {
    @inline
    def apply(
        currentEphemeris: js.UndefOr[EphemerisMetaData] = js.undefined,
        groundStations: js.UndefOr[GroundStationIdList] = js.undefined,
        noradSatelliteID: js.UndefOr[noradSatelliteID] = js.undefined,
        satelliteArn: js.UndefOr[satelliteArn] = js.undefined,
        satelliteId: js.UndefOr[Uuid] = js.undefined
    ): SatelliteListItem = {
      val __obj = js.Dynamic.literal()
      currentEphemeris.foreach(__v => __obj.updateDynamic("currentEphemeris")(__v.asInstanceOf[js.Any]))
      groundStations.foreach(__v => __obj.updateDynamic("groundStations")(__v.asInstanceOf[js.Any]))
      noradSatelliteID.foreach(__v => __obj.updateDynamic("noradSatelliteID")(__v.asInstanceOf[js.Any]))
      satelliteArn.foreach(__v => __obj.updateDynamic("satelliteArn")(__v.asInstanceOf[js.Any]))
      satelliteId.foreach(__v => __obj.updateDynamic("satelliteId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SatelliteListItem]
    }
  }

  /** Information about endpoints.
    */
  @js.native
  trait SecurityDetails extends js.Object {
    var roleArn: RoleArn
    var securityGroupIds: SecurityGroupIdList
    var subnetIds: SubnetList
  }

  object SecurityDetails {
    @inline
    def apply(
        roleArn: RoleArn,
        securityGroupIds: SecurityGroupIdList,
        subnetIds: SubnetList
    ): SecurityDetails = {
      val __obj = js.Dynamic.literal(
        "roleArn" -> roleArn.asInstanceOf[js.Any],
        "securityGroupIds" -> securityGroupIds.asInstanceOf[js.Any],
        "subnetIds" -> subnetIds.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SecurityDetails]
    }
  }

  /** Information about the socket address.
    */
  @js.native
  trait SocketAddress extends js.Object {
    var name: String
    var port: Int
  }

  object SocketAddress {
    @inline
    def apply(
        name: String,
        port: Int
    ): SocketAddress = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any],
        "port" -> port.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SocketAddress]
    }
  }

  /** Dataflow details for the source side.
    */
  @js.native
  trait Source extends js.Object {
    var configDetails: js.UndefOr[ConfigDetails]
    var configId: js.UndefOr[String]
    var configType: js.UndefOr[ConfigCapabilityType]
    var dataflowSourceRegion: js.UndefOr[String]
  }

  object Source {
    @inline
    def apply(
        configDetails: js.UndefOr[ConfigDetails] = js.undefined,
        configId: js.UndefOr[String] = js.undefined,
        configType: js.UndefOr[ConfigCapabilityType] = js.undefined,
        dataflowSourceRegion: js.UndefOr[String] = js.undefined
    ): Source = {
      val __obj = js.Dynamic.literal()
      configDetails.foreach(__v => __obj.updateDynamic("configDetails")(__v.asInstanceOf[js.Any]))
      configId.foreach(__v => __obj.updateDynamic("configId")(__v.asInstanceOf[js.Any]))
      configType.foreach(__v => __obj.updateDynamic("configType")(__v.asInstanceOf[js.Any]))
      dataflowSourceRegion.foreach(__v => __obj.updateDynamic("dataflowSourceRegion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Source]
    }
  }

  /** Object that describes a spectral <code>Config</code>.
    */
  @js.native
  trait SpectrumConfig extends js.Object {
    var bandwidth: FrequencyBandwidth
    var centerFrequency: Frequency
    var polarization: js.UndefOr[Polarization]
  }

  object SpectrumConfig {
    @inline
    def apply(
        bandwidth: FrequencyBandwidth,
        centerFrequency: Frequency,
        polarization: js.UndefOr[Polarization] = js.undefined
    ): SpectrumConfig = {
      val __obj = js.Dynamic.literal(
        "bandwidth" -> bandwidth.asInstanceOf[js.Any],
        "centerFrequency" -> centerFrequency.asInstanceOf[js.Any]
      )

      polarization.foreach(__v => __obj.updateDynamic("polarization")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SpectrumConfig]
    }
  }

  /** Two-line element set (TLE) data.
    */
  @js.native
  trait TLEData extends js.Object {
    var tleLine1: TleLineOne
    var tleLine2: TleLineTwo
    var validTimeRange: TimeRange
  }

  object TLEData {
    @inline
    def apply(
        tleLine1: TleLineOne,
        tleLine2: TleLineTwo,
        validTimeRange: TimeRange
    ): TLEData = {
      val __obj = js.Dynamic.literal(
        "tleLine1" -> tleLine1.asInstanceOf[js.Any],
        "tleLine2" -> tleLine2.asInstanceOf[js.Any],
        "validTimeRange" -> validTimeRange.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TLEData]
    }
  }

  /** Two-line element set (TLE) ephemeris.
    */
  @js.native
  trait TLEEphemeris extends js.Object {
    var s3Object: js.UndefOr[S3Object]
    var tleData: js.UndefOr[TLEDataList]
  }

  object TLEEphemeris {
    @inline
    def apply(
        s3Object: js.UndefOr[S3Object] = js.undefined,
        tleData: js.UndefOr[TLEDataList] = js.undefined
    ): TLEEphemeris = {
      val __obj = js.Dynamic.literal()
      s3Object.foreach(__v => __obj.updateDynamic("s3Object")(__v.asInstanceOf[js.Any]))
      tleData.foreach(__v => __obj.updateDynamic("tleData")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TLEEphemeris]
    }
  }

  /** <p/>
    */
  @js.native
  trait TagResourceRequest extends js.Object {
    var resourceArn: AnyArn
    var tags: TagsMap
  }

  object TagResourceRequest {
    @inline
    def apply(
        resourceArn: AnyArn,
        tags: TagsMap
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  /** <p/>
    */
  @js.native
  trait TagResourceResponse extends js.Object

  object TagResourceResponse {
    @inline
    def apply(): TagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  /** A time range with a start and end time.
    */
  @js.native
  trait TimeRange extends js.Object {
    var endTime: Timestamp
    var startTime: Timestamp
  }

  object TimeRange {
    @inline
    def apply(
        endTime: Timestamp,
        startTime: Timestamp
    ): TimeRange = {
      val __obj = js.Dynamic.literal(
        "endTime" -> endTime.asInstanceOf[js.Any],
        "startTime" -> startTime.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TimeRange]
    }
  }

  /** Object that determines whether tracking should be used during a contact executed with this <code>Config</code> in the mission profile.
    */
  @js.native
  trait TrackingConfig extends js.Object {
    var autotrack: Criticality
  }

  object TrackingConfig {
    @inline
    def apply(
        autotrack: Criticality
    ): TrackingConfig = {
      val __obj = js.Dynamic.literal(
        "autotrack" -> autotrack.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TrackingConfig]
    }
  }

  /** <p/>
    */
  @js.native
  trait UntagResourceRequest extends js.Object {
    var resourceArn: AnyArn
    var tagKeys: TagKeys
  }

  object UntagResourceRequest {
    @inline
    def apply(
        resourceArn: AnyArn,
        tagKeys: TagKeys
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  /** <p/>
    */
  @js.native
  trait UntagResourceResponse extends js.Object

  object UntagResourceResponse {
    @inline
    def apply(): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  /** <p/>
    */
  @js.native
  trait UpdateConfigRequest extends js.Object {
    var configData: ConfigTypeData
    var configId: Uuid
    var configType: ConfigCapabilityType
    var name: SafeName
  }

  object UpdateConfigRequest {
    @inline
    def apply(
        configData: ConfigTypeData,
        configId: Uuid,
        configType: ConfigCapabilityType,
        name: SafeName
    ): UpdateConfigRequest = {
      val __obj = js.Dynamic.literal(
        "configData" -> configData.asInstanceOf[js.Any],
        "configId" -> configId.asInstanceOf[js.Any],
        "configType" -> configType.asInstanceOf[js.Any],
        "name" -> name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateConfigRequest]
    }
  }

  @js.native
  trait UpdateEphemerisRequest extends js.Object {
    var enabled: Boolean
    var ephemerisId: Uuid
    var name: js.UndefOr[SafeName]
    var priority: js.UndefOr[EphemerisPriority]
  }

  object UpdateEphemerisRequest {
    @inline
    def apply(
        enabled: Boolean,
        ephemerisId: Uuid,
        name: js.UndefOr[SafeName] = js.undefined,
        priority: js.UndefOr[EphemerisPriority] = js.undefined
    ): UpdateEphemerisRequest = {
      val __obj = js.Dynamic.literal(
        "enabled" -> enabled.asInstanceOf[js.Any],
        "ephemerisId" -> ephemerisId.asInstanceOf[js.Any]
      )

      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      priority.foreach(__v => __obj.updateDynamic("priority")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateEphemerisRequest]
    }
  }

  /** <p/>
    */
  @js.native
  trait UpdateMissionProfileRequest extends js.Object {
    var missionProfileId: Uuid
    var contactPostPassDurationSeconds: js.UndefOr[DurationInSeconds]
    var contactPrePassDurationSeconds: js.UndefOr[DurationInSeconds]
    var dataflowEdges: js.UndefOr[DataflowEdgeList]
    var minimumViableContactDurationSeconds: js.UndefOr[PositiveDurationInSeconds]
    var name: js.UndefOr[SafeName]
    var trackingConfigArn: js.UndefOr[ConfigArn]
  }

  object UpdateMissionProfileRequest {
    @inline
    def apply(
        missionProfileId: Uuid,
        contactPostPassDurationSeconds: js.UndefOr[DurationInSeconds] = js.undefined,
        contactPrePassDurationSeconds: js.UndefOr[DurationInSeconds] = js.undefined,
        dataflowEdges: js.UndefOr[DataflowEdgeList] = js.undefined,
        minimumViableContactDurationSeconds: js.UndefOr[PositiveDurationInSeconds] = js.undefined,
        name: js.UndefOr[SafeName] = js.undefined,
        trackingConfigArn: js.UndefOr[ConfigArn] = js.undefined
    ): UpdateMissionProfileRequest = {
      val __obj = js.Dynamic.literal(
        "missionProfileId" -> missionProfileId.asInstanceOf[js.Any]
      )

      contactPostPassDurationSeconds.foreach(__v => __obj.updateDynamic("contactPostPassDurationSeconds")(__v.asInstanceOf[js.Any]))
      contactPrePassDurationSeconds.foreach(__v => __obj.updateDynamic("contactPrePassDurationSeconds")(__v.asInstanceOf[js.Any]))
      dataflowEdges.foreach(__v => __obj.updateDynamic("dataflowEdges")(__v.asInstanceOf[js.Any]))
      minimumViableContactDurationSeconds.foreach(__v => __obj.updateDynamic("minimumViableContactDurationSeconds")(__v.asInstanceOf[js.Any]))
      name.foreach(__v => __obj.updateDynamic("name")(__v.asInstanceOf[js.Any]))
      trackingConfigArn.foreach(__v => __obj.updateDynamic("trackingConfigArn")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMissionProfileRequest]
    }
  }

  /** Information about an uplink echo <code>Config</code>. Parameters from the <code>AntennaUplinkConfig</code>, corresponding to the specified <code>AntennaUplinkConfigArn</code>, are used when this <code>UplinkEchoConfig</code> is used in a contact.
    */
  @js.native
  trait UplinkEchoConfig extends js.Object {
    var antennaUplinkConfigArn: ConfigArn
    var enabled: Boolean
  }

  object UplinkEchoConfig {
    @inline
    def apply(
        antennaUplinkConfigArn: ConfigArn,
        enabled: Boolean
    ): UplinkEchoConfig = {
      val __obj = js.Dynamic.literal(
        "antennaUplinkConfigArn" -> antennaUplinkConfigArn.asInstanceOf[js.Any],
        "enabled" -> enabled.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UplinkEchoConfig]
    }
  }

  /** Information about the uplink spectral <code>Config</code>.
    */
  @js.native
  trait UplinkSpectrumConfig extends js.Object {
    var centerFrequency: Frequency
    var polarization: js.UndefOr[Polarization]
  }

  object UplinkSpectrumConfig {
    @inline
    def apply(
        centerFrequency: Frequency,
        polarization: js.UndefOr[Polarization] = js.undefined
    ): UplinkSpectrumConfig = {
      val __obj = js.Dynamic.literal(
        "centerFrequency" -> centerFrequency.asInstanceOf[js.Any]
      )

      polarization.foreach(__v => __obj.updateDynamic("polarization")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UplinkSpectrumConfig]
    }
  }
}
