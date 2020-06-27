package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object groundstation {
  type ConfigArn                 = String
  type ConfigList                = js.Array[ConfigListItem]
  type ContactList               = js.Array[ContactData]
  type DataflowEdge              = js.Array[ConfigArn]
  type DataflowEdgeList          = js.Array[DataflowEdge]
  type DataflowEndpointGroupArn  = String
  type DataflowEndpointGroupList = js.Array[DataflowEndpointListItem]
  type DurationInSeconds         = Int
  type EndpointDetailsList       = js.Array[EndpointDetails]
  type GroundStationIdList       = js.Array[String]
  type GroundStationList         = js.Array[GroundStationData]
  type JsonString                = String
  type MissionProfileArn         = String
  type MissionProfileList        = js.Array[MissionProfileListItem]
  type RoleArn                   = String
  type SafeName                  = String
  type SatelliteList             = js.Array[SatelliteListItem]
  type SecurityGroupIdList       = js.Array[String]
  type StatusList                = js.Array[ContactStatus]
  type SubnetList                = js.Array[String]
  type TagKeys                   = js.Array[String]
  type TagsMap                   = js.Dictionary[String]
  type Timestamp                 = js.Date
  type Uuid                      = String
  type noradSatelliteID          = Int
  type satelliteArn              = String

  implicit final class GroundStationOps(private val service: GroundStation) extends AnyVal {

    @inline def cancelContactFuture(params: CancelContactRequest): Future[ContactIdResponse] =
      service.cancelContact(params).promise().toFuture
    @inline def createConfigFuture(params: CreateConfigRequest): Future[ConfigIdResponse] =
      service.createConfig(params).promise().toFuture
    @inline def createDataflowEndpointGroupFuture(
        params: CreateDataflowEndpointGroupRequest
    ): Future[DataflowEndpointGroupIdResponse] = service.createDataflowEndpointGroup(params).promise().toFuture
    @inline def createMissionProfileFuture(params: CreateMissionProfileRequest): Future[MissionProfileIdResponse] =
      service.createMissionProfile(params).promise().toFuture
    @inline def deleteConfigFuture(params: DeleteConfigRequest): Future[ConfigIdResponse] =
      service.deleteConfig(params).promise().toFuture
    @inline def deleteDataflowEndpointGroupFuture(
        params: DeleteDataflowEndpointGroupRequest
    ): Future[DataflowEndpointGroupIdResponse] = service.deleteDataflowEndpointGroup(params).promise().toFuture
    @inline def deleteMissionProfileFuture(params: DeleteMissionProfileRequest): Future[MissionProfileIdResponse] =
      service.deleteMissionProfile(params).promise().toFuture
    @inline def describeContactFuture(params: DescribeContactRequest): Future[DescribeContactResponse] =
      service.describeContact(params).promise().toFuture
    @inline def getConfigFuture(params: GetConfigRequest): Future[GetConfigResponse] =
      service.getConfig(params).promise().toFuture
    @inline def getDataflowEndpointGroupFuture(
        params: GetDataflowEndpointGroupRequest
    ): Future[GetDataflowEndpointGroupResponse] = service.getDataflowEndpointGroup(params).promise().toFuture
    @inline def getMinuteUsageFuture(params: GetMinuteUsageRequest): Future[GetMinuteUsageResponse] =
      service.getMinuteUsage(params).promise().toFuture
    @inline def getMissionProfileFuture(params: GetMissionProfileRequest): Future[GetMissionProfileResponse] =
      service.getMissionProfile(params).promise().toFuture
    @inline def getSatelliteFuture(params: GetSatelliteRequest): Future[GetSatelliteResponse] =
      service.getSatellite(params).promise().toFuture
    @inline def listConfigsFuture(params: ListConfigsRequest): Future[ListConfigsResponse] =
      service.listConfigs(params).promise().toFuture
    @inline def listContactsFuture(params: ListContactsRequest): Future[ListContactsResponse] =
      service.listContacts(params).promise().toFuture
    @inline def listDataflowEndpointGroupsFuture(
        params: ListDataflowEndpointGroupsRequest
    ): Future[ListDataflowEndpointGroupsResponse] = service.listDataflowEndpointGroups(params).promise().toFuture
    @inline def listGroundStationsFuture(params: ListGroundStationsRequest): Future[ListGroundStationsResponse] =
      service.listGroundStations(params).promise().toFuture
    @inline def listMissionProfilesFuture(params: ListMissionProfilesRequest): Future[ListMissionProfilesResponse] =
      service.listMissionProfiles(params).promise().toFuture
    @inline def listSatellitesFuture(params: ListSatellitesRequest): Future[ListSatellitesResponse] =
      service.listSatellites(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def reserveContactFuture(params: ReserveContactRequest): Future[ContactIdResponse] =
      service.reserveContact(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] =
      service.untagResource(params).promise().toFuture
    @inline def updateConfigFuture(params: UpdateConfigRequest): Future[ConfigIdResponse] =
      service.updateConfig(params).promise().toFuture
    @inline def updateMissionProfileFuture(params: UpdateMissionProfileRequest): Future[MissionProfileIdResponse] =
      service.updateMissionProfile(params).promise().toFuture
  }
}

package groundstation {
  @js.native
  @JSImport("aws-sdk", "GroundStation")
  class GroundStation() extends js.Object {
    def this(config: AWSConfig) = this()

    def cancelContact(params: CancelContactRequest): Request[ContactIdResponse] = js.native
    def createConfig(params: CreateConfigRequest): Request[ConfigIdResponse]    = js.native
    def createDataflowEndpointGroup(
        params: CreateDataflowEndpointGroupRequest
    ): Request[DataflowEndpointGroupIdResponse]                                                      = js.native
    def createMissionProfile(params: CreateMissionProfileRequest): Request[MissionProfileIdResponse] = js.native
    def deleteConfig(params: DeleteConfigRequest): Request[ConfigIdResponse]                         = js.native
    def deleteDataflowEndpointGroup(
        params: DeleteDataflowEndpointGroupRequest
    ): Request[DataflowEndpointGroupIdResponse]                                                      = js.native
    def deleteMissionProfile(params: DeleteMissionProfileRequest): Request[MissionProfileIdResponse] = js.native
    def describeContact(params: DescribeContactRequest): Request[DescribeContactResponse]            = js.native
    def getConfig(params: GetConfigRequest): Request[GetConfigResponse]                              = js.native
    def getDataflowEndpointGroup(params: GetDataflowEndpointGroupRequest): Request[GetDataflowEndpointGroupResponse] =
      js.native
    def getMinuteUsage(params: GetMinuteUsageRequest): Request[GetMinuteUsageResponse]          = js.native
    def getMissionProfile(params: GetMissionProfileRequest): Request[GetMissionProfileResponse] = js.native
    def getSatellite(params: GetSatelliteRequest): Request[GetSatelliteResponse]                = js.native
    def listConfigs(params: ListConfigsRequest): Request[ListConfigsResponse]                   = js.native
    def listContacts(params: ListContactsRequest): Request[ListContactsResponse]                = js.native
    def listDataflowEndpointGroups(
        params: ListDataflowEndpointGroupsRequest
    ): Request[ListDataflowEndpointGroupsResponse]                                                    = js.native
    def listGroundStations(params: ListGroundStationsRequest): Request[ListGroundStationsResponse]    = js.native
    def listMissionProfiles(params: ListMissionProfilesRequest): Request[ListMissionProfilesResponse] = js.native
    def listSatellites(params: ListSatellitesRequest): Request[ListSatellitesResponse]                = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def reserveContact(params: ReserveContactRequest): Request[ContactIdResponse]                     = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse]                         = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse]                   = js.native
    def updateConfig(params: UpdateConfigRequest): Request[ConfigIdResponse]                          = js.native
    def updateMissionProfile(params: UpdateMissionProfileRequest): Request[MissionProfileIdResponse]  = js.native
  }

  @js.native
  sealed trait AngleUnits extends js.Any
  object AngleUnits extends js.Object {
    val DEGREE_ANGLE = "DEGREE_ANGLE".asInstanceOf[AngleUnits]
    val RADIAN       = "RADIAN".asInstanceOf[AngleUnits]

    val values = js.Object.freeze(js.Array(DEGREE_ANGLE, RADIAN))
  }

  /**
    * Information about how AWS Ground Station should configure an antenna for downlink during a contact.
    */
  @js.native
  @Factory
  trait AntennaDownlinkConfig extends js.Object {
    var spectrumConfig: SpectrumConfig
  }

  /**
    * Information about how AWS Ground Station should conﬁgure an antenna for downlink demod decode during a contact.
    */
  @js.native
  @Factory
  trait AntennaDownlinkDemodDecodeConfig extends js.Object {
    var decodeConfig: DecodeConfig
    var demodulationConfig: DemodulationConfig
    var spectrumConfig: SpectrumConfig
  }

  /**
    * Information about the uplink <code>Config</code> of an antenna.
    */
  @js.native
  @Factory
  trait AntennaUplinkConfig extends js.Object {
    var spectrumConfig: UplinkSpectrumConfig
    var targetEirp: Eirp
  }

  @js.native
  sealed trait BandwidthUnits extends js.Any
  object BandwidthUnits extends js.Object {
    val GHz = "GHz".asInstanceOf[BandwidthUnits]
    val MHz = "MHz".asInstanceOf[BandwidthUnits]
    val kHz = "kHz".asInstanceOf[BandwidthUnits]

    val values = js.Object.freeze(js.Array(GHz, MHz, kHz))
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CancelContactRequest extends js.Object {
    var contactId: String
  }

  @js.native
  sealed trait ConfigCapabilityType extends js.Any
  object ConfigCapabilityType extends js.Object {
    val `antenna-downlink`              = "antenna-downlink".asInstanceOf[ConfigCapabilityType]
    val `antenna-downlink-demod-decode` = "antenna-downlink-demod-decode".asInstanceOf[ConfigCapabilityType]
    val `antenna-uplink`                = "antenna-uplink".asInstanceOf[ConfigCapabilityType]
    val `dataflow-endpoint`             = "dataflow-endpoint".asInstanceOf[ConfigCapabilityType]
    val tracking                        = "tracking".asInstanceOf[ConfigCapabilityType]
    val `uplink-echo`                   = "uplink-echo".asInstanceOf[ConfigCapabilityType]

    val values = js.Object.freeze(
      js.Array(
        `antenna-downlink`,
        `antenna-downlink-demod-decode`,
        `antenna-uplink`,
        `dataflow-endpoint`,
        tracking,
        `uplink-echo`
      )
    )
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ConfigIdResponse extends js.Object {
    var configArn: js.UndefOr[ConfigArn]
    var configId: js.UndefOr[String]
    var configType: js.UndefOr[ConfigCapabilityType]
  }

  /**
    * An item in a list of <code>Config</code> objects.
    */
  @js.native
  @Factory
  trait ConfigListItem extends js.Object {
    var configArn: js.UndefOr[ConfigArn]
    var configId: js.UndefOr[String]
    var configType: js.UndefOr[ConfigCapabilityType]
    var name: js.UndefOr[String]
  }

  /**
    * Object containing the parameters of a <code>Config</code>.
    *  See the subtype definitions for what each type of <code>Config</code> contains.
    */
  @js.native
  @Factory
  trait ConfigTypeData extends js.Object {
    var antennaDownlinkConfig: js.UndefOr[AntennaDownlinkConfig]
    var antennaDownlinkDemodDecodeConfig: js.UndefOr[AntennaDownlinkDemodDecodeConfig]
    var antennaUplinkConfig: js.UndefOr[AntennaUplinkConfig]
    var dataflowEndpointConfig: js.UndefOr[DataflowEndpointConfig]
    var trackingConfig: js.UndefOr[TrackingConfig]
    var uplinkEchoConfig: js.UndefOr[UplinkEchoConfig]
  }

  /**
    * Data describing a contact.
    */
  @js.native
  @Factory
  trait ContactData extends js.Object {
    var contactId: js.UndefOr[String]
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

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ContactIdResponse extends js.Object {
    var contactId: js.UndefOr[String]
  }

  @js.native
  sealed trait ContactStatus extends js.Any
  object ContactStatus extends js.Object {
    val AVAILABLE          = "AVAILABLE".asInstanceOf[ContactStatus]
    val AWS_CANCELLED      = "AWS_CANCELLED".asInstanceOf[ContactStatus]
    val CANCELLED          = "CANCELLED".asInstanceOf[ContactStatus]
    val CANCELLING         = "CANCELLING".asInstanceOf[ContactStatus]
    val COMPLETED          = "COMPLETED".asInstanceOf[ContactStatus]
    val FAILED             = "FAILED".asInstanceOf[ContactStatus]
    val FAILED_TO_SCHEDULE = "FAILED_TO_SCHEDULE".asInstanceOf[ContactStatus]
    val PASS               = "PASS".asInstanceOf[ContactStatus]
    val POSTPASS           = "POSTPASS".asInstanceOf[ContactStatus]
    val PREPASS            = "PREPASS".asInstanceOf[ContactStatus]
    val SCHEDULED          = "SCHEDULED".asInstanceOf[ContactStatus]
    val SCHEDULING         = "SCHEDULING".asInstanceOf[ContactStatus]

    val values = js.Object.freeze(
      js.Array(
        AVAILABLE,
        AWS_CANCELLED,
        CANCELLED,
        CANCELLING,
        COMPLETED,
        FAILED,
        FAILED_TO_SCHEDULE,
        PASS,
        POSTPASS,
        PREPASS,
        SCHEDULED,
        SCHEDULING
      )
    )
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CreateConfigRequest extends js.Object {
    var configData: ConfigTypeData
    var name: SafeName
    var tags: js.UndefOr[TagsMap]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CreateDataflowEndpointGroupRequest extends js.Object {
    var endpointDetails: EndpointDetailsList
    var tags: js.UndefOr[TagsMap]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait CreateMissionProfileRequest extends js.Object {
    var dataflowEdges: DataflowEdgeList
    var minimumViableContactDurationSeconds: DurationInSeconds
    var name: SafeName
    var trackingConfigArn: ConfigArn
    var contactPostPassDurationSeconds: js.UndefOr[DurationInSeconds]
    var contactPrePassDurationSeconds: js.UndefOr[DurationInSeconds]
    var tags: js.UndefOr[TagsMap]
  }

  @js.native
  sealed trait Criticality extends js.Any
  object Criticality extends js.Object {
    val PREFERRED = "PREFERRED".asInstanceOf[Criticality]
    val REMOVED   = "REMOVED".asInstanceOf[Criticality]
    val REQUIRED  = "REQUIRED".asInstanceOf[Criticality]

    val values = js.Object.freeze(js.Array(PREFERRED, REMOVED, REQUIRED))
  }

  /**
    * Information about a dataflow endpoint.
    */
  @js.native
  @Factory
  trait DataflowEndpoint extends js.Object {
    var address: js.UndefOr[SocketAddress]
    var name: js.UndefOr[SafeName]
    var status: js.UndefOr[EndpointStatus]
  }

  /**
    * Information about the dataflow endpoint <code>Config</code>.
    */
  @js.native
  @Factory
  trait DataflowEndpointConfig extends js.Object {
    var dataflowEndpointName: String
    var dataflowEndpointRegion: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DataflowEndpointGroupIdResponse extends js.Object {
    var dataflowEndpointGroupId: js.UndefOr[String]
  }

  /**
    * Item in a list of <code>DataflowEndpoint</code> groups.
    */
  @js.native
  @Factory
  trait DataflowEndpointListItem extends js.Object {
    var dataflowEndpointGroupArn: js.UndefOr[DataflowEndpointGroupArn]
    var dataflowEndpointGroupId: js.UndefOr[String]
  }

  /**
    * Information about the decode <code>Config</code>.
    */
  @js.native
  @Factory
  trait DecodeConfig extends js.Object {
    var unvalidatedJSON: JsonString
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteConfigRequest extends js.Object {
    var configId: String
    var configType: ConfigCapabilityType
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteDataflowEndpointGroupRequest extends js.Object {
    var dataflowEndpointGroupId: String
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DeleteMissionProfileRequest extends js.Object {
    var missionProfileId: String
  }

  /**
    * Information about the demodulation <code>Config</code>.
    */
  @js.native
  @Factory
  trait DemodulationConfig extends js.Object {
    var unvalidatedJSON: JsonString
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeContactRequest extends js.Object {
    var contactId: String
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait DescribeContactResponse extends js.Object {
    var contactId: js.UndefOr[String]
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

  /**
    * Object that represents EIRP.
    */
  @js.native
  @Factory
  trait Eirp extends js.Object {
    var units: EirpUnits
    var value: Double
  }

  @js.native
  sealed trait EirpUnits extends js.Any
  object EirpUnits extends js.Object {
    val dBW = "dBW".asInstanceOf[EirpUnits]

    val values = js.Object.freeze(js.Array(dBW))
  }

  /**
    * Elevation angle of the satellite in the sky during a contact.
    */
  @js.native
  @Factory
  trait Elevation extends js.Object {
    var unit: AngleUnits
    var value: Double
  }

  /**
    * Information about the endpoint details.
    */
  @js.native
  @Factory
  trait EndpointDetails extends js.Object {
    var endpoint: js.UndefOr[DataflowEndpoint]
    var securityDetails: js.UndefOr[SecurityDetails]
  }

  @js.native
  sealed trait EndpointStatus extends js.Any
  object EndpointStatus extends js.Object {
    val created  = "created".asInstanceOf[EndpointStatus]
    val creating = "creating".asInstanceOf[EndpointStatus]
    val deleted  = "deleted".asInstanceOf[EndpointStatus]
    val deleting = "deleting".asInstanceOf[EndpointStatus]
    val failed   = "failed".asInstanceOf[EndpointStatus]

    val values = js.Object.freeze(js.Array(created, creating, deleted, deleting, failed))
  }

  /**
    * Object that describes the frequency.
    */
  @js.native
  @Factory
  trait Frequency extends js.Object {
    var units: FrequencyUnits
    var value: Double
  }

  /**
    * Object that describes the frequency bandwidth.
    */
  @js.native
  @Factory
  trait FrequencyBandwidth extends js.Object {
    var units: BandwidthUnits
    var value: Double
  }

  @js.native
  sealed trait FrequencyUnits extends js.Any
  object FrequencyUnits extends js.Object {
    val GHz = "GHz".asInstanceOf[FrequencyUnits]
    val MHz = "MHz".asInstanceOf[FrequencyUnits]
    val kHz = "kHz".asInstanceOf[FrequencyUnits]

    val values = js.Object.freeze(js.Array(GHz, MHz, kHz))
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait GetConfigRequest extends js.Object {
    var configId: String
    var configType: ConfigCapabilityType
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait GetConfigResponse extends js.Object {
    var configArn: ConfigArn
    var configData: ConfigTypeData
    var configId: String
    var name: String
    var configType: js.UndefOr[ConfigCapabilityType]
    var tags: js.UndefOr[TagsMap]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait GetDataflowEndpointGroupRequest extends js.Object {
    var dataflowEndpointGroupId: String
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait GetDataflowEndpointGroupResponse extends js.Object {
    var dataflowEndpointGroupArn: js.UndefOr[DataflowEndpointGroupArn]
    var dataflowEndpointGroupId: js.UndefOr[String]
    var endpointsDetails: js.UndefOr[EndpointDetailsList]
    var tags: js.UndefOr[TagsMap]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait GetMinuteUsageRequest extends js.Object {
    var month: Int
    var year: Int
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait GetMinuteUsageResponse extends js.Object {
    var estimatedMinutesRemaining: js.UndefOr[Int]
    var isReservedMinutesCustomer: js.UndefOr[Boolean]
    var totalReservedMinuteAllocation: js.UndefOr[Int]
    var totalScheduledMinutes: js.UndefOr[Int]
    var upcomingMinutesScheduled: js.UndefOr[Int]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait GetMissionProfileRequest extends js.Object {
    var missionProfileId: String
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait GetMissionProfileResponse extends js.Object {
    var contactPostPassDurationSeconds: js.UndefOr[DurationInSeconds]
    var contactPrePassDurationSeconds: js.UndefOr[DurationInSeconds]
    var dataflowEdges: js.UndefOr[DataflowEdgeList]
    var minimumViableContactDurationSeconds: js.UndefOr[DurationInSeconds]
    var missionProfileArn: js.UndefOr[MissionProfileArn]
    var missionProfileId: js.UndefOr[String]
    var name: js.UndefOr[String]
    var region: js.UndefOr[String]
    var tags: js.UndefOr[TagsMap]
    var trackingConfigArn: js.UndefOr[ConfigArn]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait GetSatelliteRequest extends js.Object {
    var satelliteId: String
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait GetSatelliteResponse extends js.Object {
    var groundStations: js.UndefOr[GroundStationIdList]
    var noradSatelliteID: js.UndefOr[noradSatelliteID]
    var satelliteArn: js.UndefOr[satelliteArn]
    var satelliteId: js.UndefOr[Uuid]
  }

  /**
    * Information about the ground station data.
    */
  @js.native
  @Factory
  trait GroundStationData extends js.Object {
    var groundStationId: js.UndefOr[String]
    var groundStationName: js.UndefOr[String]
    var region: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ListConfigsRequest extends js.Object {
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ListConfigsResponse extends js.Object {
    var configList: js.UndefOr[ConfigList]
    var nextToken: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ListContactsRequest extends js.Object {
    var endTime: Timestamp
    var startTime: Timestamp
    var statusList: StatusList
    var groundStation: js.UndefOr[String]
    var maxResults: js.UndefOr[Int]
    var missionProfileArn: js.UndefOr[MissionProfileArn]
    var nextToken: js.UndefOr[String]
    var satelliteArn: js.UndefOr[satelliteArn]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ListContactsResponse extends js.Object {
    var contactList: js.UndefOr[ContactList]
    var nextToken: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ListDataflowEndpointGroupsRequest extends js.Object {
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ListDataflowEndpointGroupsResponse extends js.Object {
    var dataflowEndpointGroupList: js.UndefOr[DataflowEndpointGroupList]
    var nextToken: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ListGroundStationsRequest extends js.Object {
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[String]
    var satelliteId: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ListGroundStationsResponse extends js.Object {
    var groundStationList: js.UndefOr[GroundStationList]
    var nextToken: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ListMissionProfilesRequest extends js.Object {
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ListMissionProfilesResponse extends js.Object {
    var missionProfileList: js.UndefOr[MissionProfileList]
    var nextToken: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ListSatellitesRequest extends js.Object {
    var maxResults: js.UndefOr[Int]
    var nextToken: js.UndefOr[String]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ListSatellitesResponse extends js.Object {
    var nextToken: js.UndefOr[String]
    var satellites: js.UndefOr[SatelliteList]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var resourceArn: String
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var tags: js.UndefOr[TagsMap]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait MissionProfileIdResponse extends js.Object {
    var missionProfileId: js.UndefOr[String]
  }

  /**
    * Item in a list of mission profiles.
    */
  @js.native
  @Factory
  trait MissionProfileListItem extends js.Object {
    var missionProfileArn: js.UndefOr[MissionProfileArn]
    var missionProfileId: js.UndefOr[String]
    var name: js.UndefOr[String]
    var region: js.UndefOr[String]
  }

  @js.native
  sealed trait Polarization extends js.Any
  object Polarization extends js.Object {
    val LEFT_HAND  = "LEFT_HAND".asInstanceOf[Polarization]
    val NONE       = "NONE".asInstanceOf[Polarization]
    val RIGHT_HAND = "RIGHT_HAND".asInstanceOf[Polarization]

    val values = js.Object.freeze(js.Array(LEFT_HAND, NONE, RIGHT_HAND))
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait ReserveContactRequest extends js.Object {
    var endTime: Timestamp
    var groundStation: String
    var missionProfileArn: MissionProfileArn
    var satelliteArn: satelliteArn
    var startTime: Timestamp
    var tags: js.UndefOr[TagsMap]
  }

  /**
    * Item in a list of satellites.
    */
  @js.native
  @Factory
  trait SatelliteListItem extends js.Object {
    var groundStations: js.UndefOr[GroundStationIdList]
    var noradSatelliteID: js.UndefOr[noradSatelliteID]
    var satelliteArn: js.UndefOr[satelliteArn]
    var satelliteId: js.UndefOr[Uuid]
  }

  /**
    * Information about endpoints.
    */
  @js.native
  @Factory
  trait SecurityDetails extends js.Object {
    var roleArn: RoleArn
    var securityGroupIds: SecurityGroupIdList
    var subnetIds: SubnetList
  }

  /**
    * Information about the socket address.
    */
  @js.native
  @Factory
  trait SocketAddress extends js.Object {
    var name: String
    var port: Int
  }

  /**
    * Object that describes a spectral <code>Config</code>.
    */
  @js.native
  @Factory
  trait SpectrumConfig extends js.Object {
    var bandwidth: FrequencyBandwidth
    var centerFrequency: Frequency
    var polarization: js.UndefOr[Polarization]
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var resourceArn: String
    var tags: TagsMap
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait TagResourceResponse extends js.Object {}

  /**
    * Object that determines whether tracking should be used during a contact executed with this <code>Config</code> in the mission profile.
    */
  @js.native
  @Factory
  trait TrackingConfig extends js.Object {
    var autotrack: Criticality
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var resourceArn: String
    var tagKeys: TagKeys
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait UntagResourceResponse extends js.Object {}

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait UpdateConfigRequest extends js.Object {
    var configData: ConfigTypeData
    var configId: String
    var configType: ConfigCapabilityType
    var name: SafeName
  }

  /**
    * <p/>
    */
  @js.native
  @Factory
  trait UpdateMissionProfileRequest extends js.Object {
    var missionProfileId: String
    var contactPostPassDurationSeconds: js.UndefOr[DurationInSeconds]
    var contactPrePassDurationSeconds: js.UndefOr[DurationInSeconds]
    var dataflowEdges: js.UndefOr[DataflowEdgeList]
    var minimumViableContactDurationSeconds: js.UndefOr[DurationInSeconds]
    var name: js.UndefOr[SafeName]
    var trackingConfigArn: js.UndefOr[ConfigArn]
  }

  /**
    * Information about an uplink echo <code>Config</code>.
    *  Parameters from the <code>AntennaUplinkConfig</code>, corresponding to the specified <code>AntennaUplinkConfigArn</code>, are used when this <code>UplinkEchoConfig</code> is used in a contact.
    */
  @js.native
  @Factory
  trait UplinkEchoConfig extends js.Object {
    var antennaUplinkConfigArn: ConfigArn
    var enabled: Boolean
  }

  /**
    * Information about the uplink spectral <code>Config</code>.
    */
  @js.native
  @Factory
  trait UplinkSpectrumConfig extends js.Object {
    var centerFrequency: Frequency
    var polarization: js.UndefOr[Polarization]
  }
}
