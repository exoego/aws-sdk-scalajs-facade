package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
import facade.amazonaws._

package object mediatailor {
  type ConfigurationAliasesRequest = js.Dictionary[__mapOf__string]
  type ConfigurationAliasesResponse = js.Dictionary[__mapOf__string]
  type HttpPackageConfigurations = js.Array[HttpPackageConfiguration]
  type MaxResults = Int
  type RequestOutputs = js.Array[RequestOutputItem]
  type ResponseOutputs = js.Array[ResponseOutputItem]
  type SegmentationDescriptorList = js.Array[SegmentationDescriptor]
  type __boolean = Boolean
  type __integer = Int
  type __integerMin1 = Int
  type __integerMin1Max100 = Int
  type __listOfAdBreak = js.Array[AdBreak]
  type __listOfAlert = js.Array[Alert]
  type __listOfAvailMatchingCriteria = js.Array[AvailMatchingCriteria]
  type __listOfChannel = js.Array[Channel]
  type __listOfLiveSource = js.Array[LiveSource]
  type __listOfPlaybackConfiguration = js.Array[PlaybackConfiguration]
  type __listOfPrefetchSchedule = js.Array[PrefetchSchedule]
  type __listOfScheduleAdBreak = js.Array[ScheduleAdBreak]
  type __listOfScheduleEntry = js.Array[ScheduleEntry]
  type __listOfSegmentDeliveryConfiguration = js.Array[SegmentDeliveryConfiguration]
  type __listOfSourceLocation = js.Array[SourceLocation]
  type __listOfVodSource = js.Array[VodSource]
  type __listOf__string = js.Array[__string]
  type __long = Double
  type __mapOf__string = js.Dictionary[__string]
  type __string = String
  type __timestampUnix = js.Date

  final class MediaTailorOps(private val service: MediaTailor) extends AnyVal {

    @inline def configureLogsForPlaybackConfigurationFuture(params: ConfigureLogsForPlaybackConfigurationRequest): Future[ConfigureLogsForPlaybackConfigurationResponse] = service.configureLogsForPlaybackConfiguration(params).promise().toFuture
    @inline def createChannelFuture(params: CreateChannelRequest): Future[CreateChannelResponse] = service.createChannel(params).promise().toFuture
    @inline def createLiveSourceFuture(params: CreateLiveSourceRequest): Future[CreateLiveSourceResponse] = service.createLiveSource(params).promise().toFuture
    @inline def createPrefetchScheduleFuture(params: CreatePrefetchScheduleRequest): Future[CreatePrefetchScheduleResponse] = service.createPrefetchSchedule(params).promise().toFuture
    @inline def createProgramFuture(params: CreateProgramRequest): Future[CreateProgramResponse] = service.createProgram(params).promise().toFuture
    @inline def createSourceLocationFuture(params: CreateSourceLocationRequest): Future[CreateSourceLocationResponse] = service.createSourceLocation(params).promise().toFuture
    @inline def createVodSourceFuture(params: CreateVodSourceRequest): Future[CreateVodSourceResponse] = service.createVodSource(params).promise().toFuture
    @inline def deleteChannelFuture(params: DeleteChannelRequest): Future[DeleteChannelResponse] = service.deleteChannel(params).promise().toFuture
    @inline def deleteChannelPolicyFuture(params: DeleteChannelPolicyRequest): Future[DeleteChannelPolicyResponse] = service.deleteChannelPolicy(params).promise().toFuture
    @inline def deleteLiveSourceFuture(params: DeleteLiveSourceRequest): Future[DeleteLiveSourceResponse] = service.deleteLiveSource(params).promise().toFuture
    @inline def deletePlaybackConfigurationFuture(params: DeletePlaybackConfigurationRequest): Future[DeletePlaybackConfigurationResponse] = service.deletePlaybackConfiguration(params).promise().toFuture
    @inline def deletePrefetchScheduleFuture(params: DeletePrefetchScheduleRequest): Future[DeletePrefetchScheduleResponse] = service.deletePrefetchSchedule(params).promise().toFuture
    @inline def deleteProgramFuture(params: DeleteProgramRequest): Future[DeleteProgramResponse] = service.deleteProgram(params).promise().toFuture
    @inline def deleteSourceLocationFuture(params: DeleteSourceLocationRequest): Future[DeleteSourceLocationResponse] = service.deleteSourceLocation(params).promise().toFuture
    @inline def deleteVodSourceFuture(params: DeleteVodSourceRequest): Future[DeleteVodSourceResponse] = service.deleteVodSource(params).promise().toFuture
    @inline def describeChannelFuture(params: DescribeChannelRequest): Future[DescribeChannelResponse] = service.describeChannel(params).promise().toFuture
    @inline def describeLiveSourceFuture(params: DescribeLiveSourceRequest): Future[DescribeLiveSourceResponse] = service.describeLiveSource(params).promise().toFuture
    @inline def describeProgramFuture(params: DescribeProgramRequest): Future[DescribeProgramResponse] = service.describeProgram(params).promise().toFuture
    @inline def describeSourceLocationFuture(params: DescribeSourceLocationRequest): Future[DescribeSourceLocationResponse] = service.describeSourceLocation(params).promise().toFuture
    @inline def describeVodSourceFuture(params: DescribeVodSourceRequest): Future[DescribeVodSourceResponse] = service.describeVodSource(params).promise().toFuture
    @inline def getChannelPolicyFuture(params: GetChannelPolicyRequest): Future[GetChannelPolicyResponse] = service.getChannelPolicy(params).promise().toFuture
    @inline def getChannelScheduleFuture(params: GetChannelScheduleRequest): Future[GetChannelScheduleResponse] = service.getChannelSchedule(params).promise().toFuture
    @inline def getPlaybackConfigurationFuture(params: GetPlaybackConfigurationRequest): Future[GetPlaybackConfigurationResponse] = service.getPlaybackConfiguration(params).promise().toFuture
    @inline def getPrefetchScheduleFuture(params: GetPrefetchScheduleRequest): Future[GetPrefetchScheduleResponse] = service.getPrefetchSchedule(params).promise().toFuture
    @inline def listAlertsFuture(params: ListAlertsRequest): Future[ListAlertsResponse] = service.listAlerts(params).promise().toFuture
    @inline def listChannelsFuture(params: ListChannelsRequest): Future[ListChannelsResponse] = service.listChannels(params).promise().toFuture
    @inline def listLiveSourcesFuture(params: ListLiveSourcesRequest): Future[ListLiveSourcesResponse] = service.listLiveSources(params).promise().toFuture
    @inline def listPlaybackConfigurationsFuture(params: ListPlaybackConfigurationsRequest): Future[ListPlaybackConfigurationsResponse] = service.listPlaybackConfigurations(params).promise().toFuture
    @inline def listPrefetchSchedulesFuture(params: ListPrefetchSchedulesRequest): Future[ListPrefetchSchedulesResponse] = service.listPrefetchSchedules(params).promise().toFuture
    @inline def listSourceLocationsFuture(params: ListSourceLocationsRequest): Future[ListSourceLocationsResponse] = service.listSourceLocations(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def listVodSourcesFuture(params: ListVodSourcesRequest): Future[ListVodSourcesResponse] = service.listVodSources(params).promise().toFuture
    @inline def putChannelPolicyFuture(params: PutChannelPolicyRequest): Future[PutChannelPolicyResponse] = service.putChannelPolicy(params).promise().toFuture
    @inline def putPlaybackConfigurationFuture(params: PutPlaybackConfigurationRequest): Future[PutPlaybackConfigurationResponse] = service.putPlaybackConfiguration(params).promise().toFuture
    @inline def startChannelFuture(params: StartChannelRequest): Future[StartChannelResponse] = service.startChannel(params).promise().toFuture
    @inline def stopChannelFuture(params: StopChannelRequest): Future[StopChannelResponse] = service.stopChannel(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] = service.untagResource(params).promise().toFuture
    @inline def updateChannelFuture(params: UpdateChannelRequest): Future[UpdateChannelResponse] = service.updateChannel(params).promise().toFuture
    @inline def updateLiveSourceFuture(params: UpdateLiveSourceRequest): Future[UpdateLiveSourceResponse] = service.updateLiveSource(params).promise().toFuture
    @inline def updateSourceLocationFuture(params: UpdateSourceLocationRequest): Future[UpdateSourceLocationResponse] = service.updateSourceLocation(params).promise().toFuture
    @inline def updateVodSourceFuture(params: UpdateVodSourceRequest): Future[UpdateVodSourceResponse] = service.updateVodSource(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/mediatailor", JSImport.Namespace, "AWS.MediaTailor")
  class MediaTailor() extends js.Object {
    def this(config: AWSConfig) = this()

    def configureLogsForPlaybackConfiguration(params: ConfigureLogsForPlaybackConfigurationRequest): Request[ConfigureLogsForPlaybackConfigurationResponse] = js.native
    def createChannel(params: CreateChannelRequest): Request[CreateChannelResponse] = js.native
    def createLiveSource(params: CreateLiveSourceRequest): Request[CreateLiveSourceResponse] = js.native
    def createPrefetchSchedule(params: CreatePrefetchScheduleRequest): Request[CreatePrefetchScheduleResponse] = js.native
    def createProgram(params: CreateProgramRequest): Request[CreateProgramResponse] = js.native
    def createSourceLocation(params: CreateSourceLocationRequest): Request[CreateSourceLocationResponse] = js.native
    def createVodSource(params: CreateVodSourceRequest): Request[CreateVodSourceResponse] = js.native
    def deleteChannel(params: DeleteChannelRequest): Request[DeleteChannelResponse] = js.native
    def deleteChannelPolicy(params: DeleteChannelPolicyRequest): Request[DeleteChannelPolicyResponse] = js.native
    def deleteLiveSource(params: DeleteLiveSourceRequest): Request[DeleteLiveSourceResponse] = js.native
    def deletePlaybackConfiguration(params: DeletePlaybackConfigurationRequest): Request[DeletePlaybackConfigurationResponse] = js.native
    def deletePrefetchSchedule(params: DeletePrefetchScheduleRequest): Request[DeletePrefetchScheduleResponse] = js.native
    def deleteProgram(params: DeleteProgramRequest): Request[DeleteProgramResponse] = js.native
    def deleteSourceLocation(params: DeleteSourceLocationRequest): Request[DeleteSourceLocationResponse] = js.native
    def deleteVodSource(params: DeleteVodSourceRequest): Request[DeleteVodSourceResponse] = js.native
    def describeChannel(params: DescribeChannelRequest): Request[DescribeChannelResponse] = js.native
    def describeLiveSource(params: DescribeLiveSourceRequest): Request[DescribeLiveSourceResponse] = js.native
    def describeProgram(params: DescribeProgramRequest): Request[DescribeProgramResponse] = js.native
    def describeSourceLocation(params: DescribeSourceLocationRequest): Request[DescribeSourceLocationResponse] = js.native
    def describeVodSource(params: DescribeVodSourceRequest): Request[DescribeVodSourceResponse] = js.native
    def getChannelPolicy(params: GetChannelPolicyRequest): Request[GetChannelPolicyResponse] = js.native
    def getChannelSchedule(params: GetChannelScheduleRequest): Request[GetChannelScheduleResponse] = js.native
    def getPlaybackConfiguration(params: GetPlaybackConfigurationRequest): Request[GetPlaybackConfigurationResponse] = js.native
    def getPrefetchSchedule(params: GetPrefetchScheduleRequest): Request[GetPrefetchScheduleResponse] = js.native
    def listAlerts(params: ListAlertsRequest): Request[ListAlertsResponse] = js.native
    def listChannels(params: ListChannelsRequest): Request[ListChannelsResponse] = js.native
    def listLiveSources(params: ListLiveSourcesRequest): Request[ListLiveSourcesResponse] = js.native
    def listPlaybackConfigurations(params: ListPlaybackConfigurationsRequest): Request[ListPlaybackConfigurationsResponse] = js.native
    def listPrefetchSchedules(params: ListPrefetchSchedulesRequest): Request[ListPrefetchSchedulesResponse] = js.native
    def listSourceLocations(params: ListSourceLocationsRequest): Request[ListSourceLocationsResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def listVodSources(params: ListVodSourcesRequest): Request[ListVodSourcesResponse] = js.native
    def putChannelPolicy(params: PutChannelPolicyRequest): Request[PutChannelPolicyResponse] = js.native
    def putPlaybackConfiguration(params: PutPlaybackConfigurationRequest): Request[PutPlaybackConfigurationResponse] = js.native
    def startChannel(params: StartChannelRequest): Request[StartChannelResponse] = js.native
    def stopChannel(params: StopChannelRequest): Request[StopChannelResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateChannel(params: UpdateChannelRequest): Request[UpdateChannelResponse] = js.native
    def updateLiveSource(params: UpdateLiveSourceRequest): Request[UpdateLiveSourceResponse] = js.native
    def updateSourceLocation(params: UpdateSourceLocationRequest): Request[UpdateSourceLocationResponse] = js.native
    def updateVodSource(params: UpdateVodSourceRequest): Request[UpdateVodSourceResponse] = js.native
  }
  object MediaTailor {
    @inline implicit def toOps(service: MediaTailor): MediaTailorOps = {
      new MediaTailorOps(service)
    }
  }

  /** Access configuration parameters.
    */
  @js.native
  trait AccessConfiguration extends js.Object {
    var AccessType: js.UndefOr[AccessType]
    var SecretsManagerAccessTokenConfiguration: js.UndefOr[SecretsManagerAccessTokenConfiguration]
  }

  object AccessConfiguration {
    @inline
    def apply(
        AccessType: js.UndefOr[AccessType] = js.undefined,
        SecretsManagerAccessTokenConfiguration: js.UndefOr[SecretsManagerAccessTokenConfiguration] = js.undefined
    ): AccessConfiguration = {
      val __obj = js.Dynamic.literal()
      AccessType.foreach(__v => __obj.updateDynamic("AccessType")(__v.asInstanceOf[js.Any]))
      SecretsManagerAccessTokenConfiguration.foreach(__v => __obj.updateDynamic("SecretsManagerAccessTokenConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccessConfiguration]
    }
  }

  /** Ad break configuration parameters.
    */
  @js.native
  trait AdBreak extends js.Object {
    var MessageType: js.UndefOr[MessageType]
    var OffsetMillis: js.UndefOr[__long]
    var Slate: js.UndefOr[SlateSource]
    var SpliceInsertMessage: js.UndefOr[SpliceInsertMessage]
    var TimeSignalMessage: js.UndefOr[TimeSignalMessage]
  }

  object AdBreak {
    @inline
    def apply(
        MessageType: js.UndefOr[MessageType] = js.undefined,
        OffsetMillis: js.UndefOr[__long] = js.undefined,
        Slate: js.UndefOr[SlateSource] = js.undefined,
        SpliceInsertMessage: js.UndefOr[SpliceInsertMessage] = js.undefined,
        TimeSignalMessage: js.UndefOr[TimeSignalMessage] = js.undefined
    ): AdBreak = {
      val __obj = js.Dynamic.literal()
      MessageType.foreach(__v => __obj.updateDynamic("MessageType")(__v.asInstanceOf[js.Any]))
      OffsetMillis.foreach(__v => __obj.updateDynamic("OffsetMillis")(__v.asInstanceOf[js.Any]))
      Slate.foreach(__v => __obj.updateDynamic("Slate")(__v.asInstanceOf[js.Any]))
      SpliceInsertMessage.foreach(__v => __obj.updateDynamic("SpliceInsertMessage")(__v.asInstanceOf[js.Any]))
      TimeSignalMessage.foreach(__v => __obj.updateDynamic("TimeSignalMessage")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdBreak]
    }
  }

  /** For HLS, when set to <code>true</code>, MediaTailor passes through <code>EXT-X-CUE-IN</code>, <code>EXT-X-CUE-OUT</code>, and <code>EXT-X-SPLICEPOINT-SCTE35</code> ad markers from the origin manifest to the MediaTailor personalized manifest. No logic is applied to these ad markers. For example, if <code>EXT-X-CUE-OUT</code> has a value of <code>60</code>, but no ads are filled for that ad break, MediaTailor will not set the value to <code>0</code>.
    */
  @js.native
  trait AdMarkerPassthrough extends js.Object {
    var Enabled: js.UndefOr[__boolean]
  }

  object AdMarkerPassthrough {
    @inline
    def apply(
        Enabled: js.UndefOr[__boolean] = js.undefined
    ): AdMarkerPassthrough = {
      val __obj = js.Dynamic.literal()
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AdMarkerPassthrough]
    }
  }

  /** Alert configuration parameters.
    */
  @js.native
  trait Alert extends js.Object {
    var AlertCode: __string
    var AlertMessage: __string
    var LastModifiedTime: __timestampUnix
    var RelatedResourceArns: __listOf__string
    var ResourceArn: __string
  }

  object Alert {
    @inline
    def apply(
        AlertCode: __string,
        AlertMessage: __string,
        LastModifiedTime: __timestampUnix,
        RelatedResourceArns: __listOf__string,
        ResourceArn: __string
    ): Alert = {
      val __obj = js.Dynamic.literal(
        "AlertCode" -> AlertCode.asInstanceOf[js.Any],
        "AlertMessage" -> AlertMessage.asInstanceOf[js.Any],
        "LastModifiedTime" -> LastModifiedTime.asInstanceOf[js.Any],
        "RelatedResourceArns" -> RelatedResourceArns.asInstanceOf[js.Any],
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[Alert]
    }
  }

  /** MediaTailor only places (consumes) prefetched ads if the ad break meets the criteria defined by the dynamic variables. This gives you granular control over which ad break to place the prefetched ads into. As an example, let's say that you set <code>DynamicVariable</code> to <code>scte.event_id</code> and <code>Operator</code> to <code>EQUALS</code>, and your playback configuration has an ADS URL of <code>https://my.ads.server.com/path?&amp;podId=[scte.avail_num]&amp;event=[scte.event_id]&amp;duration=[session.avail_duration_secs]</code>. And the prefetch request to the ADS contains these values <code>https://my.ads.server.com/path?&amp;podId=3&amp;event=my-awesome-event&amp;duration=30</code>. MediaTailor will only insert the prefetched ads into the ad break if has a SCTE marker with an event id of <code>my-awesome-event</code>, since it must match the event id that MediaTailor uses to query the ADS. You can specify up to five <code>AvailMatchingCriteria</code>. If you specify
    * multiple <code>AvailMatchingCriteria</code>, MediaTailor combines them to match using a logical <code>AND</code>. You can model logical <code>OR</code> combinations by creating multiple prefetch schedules.
    */
  @js.native
  trait AvailMatchingCriteria extends js.Object {
    var DynamicVariable: __string
    var Operator: Operator
  }

  object AvailMatchingCriteria {
    @inline
    def apply(
        DynamicVariable: __string,
        Operator: Operator
    ): AvailMatchingCriteria = {
      val __obj = js.Dynamic.literal(
        "DynamicVariable" -> DynamicVariable.asInstanceOf[js.Any],
        "Operator" -> Operator.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[AvailMatchingCriteria]
    }
  }

  /** The configuration for avail suppression, also known as ad suppression. For more information about ad suppression, see [[https://docs.aws.amazon.com/mediatailor/latest/ug/ad-behavior.html|Ad Suppression]].
    */
  @js.native
  trait AvailSuppression extends js.Object {
    var Mode: js.UndefOr[Mode]
    var Value: js.UndefOr[__string]
  }

  object AvailSuppression {
    @inline
    def apply(
        Mode: js.UndefOr[Mode] = js.undefined,
        Value: js.UndefOr[__string] = js.undefined
    ): AvailSuppression = {
      val __obj = js.Dynamic.literal()
      Mode.foreach(__v => __obj.updateDynamic("Mode")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AvailSuppression]
    }
  }

  /** The configuration for bumpers. Bumpers are short audio or video clips that play at the start or before the end of an ad break. To learn more about bumpers, see [[https://docs.aws.amazon.com/mediatailor/latest/ug/bumpers.html|Bumpers]].
    */
  @js.native
  trait Bumper extends js.Object {
    var EndUrl: js.UndefOr[__string]
    var StartUrl: js.UndefOr[__string]
  }

  object Bumper {
    @inline
    def apply(
        EndUrl: js.UndefOr[__string] = js.undefined,
        StartUrl: js.UndefOr[__string] = js.undefined
    ): Bumper = {
      val __obj = js.Dynamic.literal()
      EndUrl.foreach(__v => __obj.updateDynamic("EndUrl")(__v.asInstanceOf[js.Any]))
      StartUrl.foreach(__v => __obj.updateDynamic("StartUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Bumper]
    }
  }

  /** The configuration for using a content delivery network (CDN), like Amazon CloudFront, for content and ad segment management.
    */
  @js.native
  trait CdnConfiguration extends js.Object {
    var AdSegmentUrlPrefix: js.UndefOr[__string]
    var ContentSegmentUrlPrefix: js.UndefOr[__string]
  }

  object CdnConfiguration {
    @inline
    def apply(
        AdSegmentUrlPrefix: js.UndefOr[__string] = js.undefined,
        ContentSegmentUrlPrefix: js.UndefOr[__string] = js.undefined
    ): CdnConfiguration = {
      val __obj = js.Dynamic.literal()
      AdSegmentUrlPrefix.foreach(__v => __obj.updateDynamic("AdSegmentUrlPrefix")(__v.asInstanceOf[js.Any]))
      ContentSegmentUrlPrefix.foreach(__v => __obj.updateDynamic("ContentSegmentUrlPrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CdnConfiguration]
    }
  }

  /** The configuration parameters for a channel. For information about MediaTailor channels, see [[https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-channels.html|Working with channels]] in the <i>MediaTailor User Guide</i>.
    */
  @js.native
  trait Channel extends js.Object {
    var Arn: __string
    var ChannelName: __string
    var ChannelState: __string
    var Outputs: ResponseOutputs
    var PlaybackMode: __string
    var Tier: __string
    var CreationTime: js.UndefOr[__timestampUnix]
    var FillerSlate: js.UndefOr[SlateSource]
    var LastModifiedTime: js.UndefOr[__timestampUnix]
    var Tags: js.UndefOr[__mapOf__string]
  }

  object Channel {
    @inline
    def apply(
        Arn: __string,
        ChannelName: __string,
        ChannelState: __string,
        Outputs: ResponseOutputs,
        PlaybackMode: __string,
        Tier: __string,
        CreationTime: js.UndefOr[__timestampUnix] = js.undefined,
        FillerSlate: js.UndefOr[SlateSource] = js.undefined,
        LastModifiedTime: js.UndefOr[__timestampUnix] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): Channel = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "ChannelName" -> ChannelName.asInstanceOf[js.Any],
        "ChannelState" -> ChannelState.asInstanceOf[js.Any],
        "Outputs" -> Outputs.asInstanceOf[js.Any],
        "PlaybackMode" -> PlaybackMode.asInstanceOf[js.Any],
        "Tier" -> Tier.asInstanceOf[js.Any]
      )

      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      FillerSlate.foreach(__v => __obj.updateDynamic("FillerSlate")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Channel]
    }
  }

  /** Configures Amazon CloudWatch log settings for a playback configuration.
    */
  @js.native
  trait ConfigureLogsForPlaybackConfigurationRequest extends js.Object {
    var PercentEnabled: __integer
    var PlaybackConfigurationName: __string
  }

  object ConfigureLogsForPlaybackConfigurationRequest {
    @inline
    def apply(
        PercentEnabled: __integer,
        PlaybackConfigurationName: __string
    ): ConfigureLogsForPlaybackConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "PercentEnabled" -> PercentEnabled.asInstanceOf[js.Any],
        "PlaybackConfigurationName" -> PlaybackConfigurationName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ConfigureLogsForPlaybackConfigurationRequest]
    }
  }

  @js.native
  trait ConfigureLogsForPlaybackConfigurationResponse extends js.Object {
    var PercentEnabled: __integer
    var PlaybackConfigurationName: js.UndefOr[__string]
  }

  object ConfigureLogsForPlaybackConfigurationResponse {
    @inline
    def apply(
        PercentEnabled: __integer,
        PlaybackConfigurationName: js.UndefOr[__string] = js.undefined
    ): ConfigureLogsForPlaybackConfigurationResponse = {
      val __obj = js.Dynamic.literal(
        "PercentEnabled" -> PercentEnabled.asInstanceOf[js.Any]
      )

      PlaybackConfigurationName.foreach(__v => __obj.updateDynamic("PlaybackConfigurationName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ConfigureLogsForPlaybackConfigurationResponse]
    }
  }

  @js.native
  trait CreateChannelRequest extends js.Object {
    var ChannelName: __string
    var Outputs: RequestOutputs
    var PlaybackMode: PlaybackMode
    var FillerSlate: js.UndefOr[SlateSource]
    var Tags: js.UndefOr[__mapOf__string]
    var Tier: js.UndefOr[Tier]
  }

  object CreateChannelRequest {
    @inline
    def apply(
        ChannelName: __string,
        Outputs: RequestOutputs,
        PlaybackMode: PlaybackMode,
        FillerSlate: js.UndefOr[SlateSource] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined,
        Tier: js.UndefOr[Tier] = js.undefined
    ): CreateChannelRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelName" -> ChannelName.asInstanceOf[js.Any],
        "Outputs" -> Outputs.asInstanceOf[js.Any],
        "PlaybackMode" -> PlaybackMode.asInstanceOf[js.Any]
      )

      FillerSlate.foreach(__v => __obj.updateDynamic("FillerSlate")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Tier.foreach(__v => __obj.updateDynamic("Tier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateChannelRequest]
    }
  }

  @js.native
  trait CreateChannelResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var ChannelName: js.UndefOr[__string]
    var ChannelState: js.UndefOr[ChannelState]
    var CreationTime: js.UndefOr[__timestampUnix]
    var FillerSlate: js.UndefOr[SlateSource]
    var LastModifiedTime: js.UndefOr[__timestampUnix]
    var Outputs: js.UndefOr[ResponseOutputs]
    var PlaybackMode: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
    var Tier: js.UndefOr[__string]
  }

  object CreateChannelResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        ChannelName: js.UndefOr[__string] = js.undefined,
        ChannelState: js.UndefOr[ChannelState] = js.undefined,
        CreationTime: js.UndefOr[__timestampUnix] = js.undefined,
        FillerSlate: js.UndefOr[SlateSource] = js.undefined,
        LastModifiedTime: js.UndefOr[__timestampUnix] = js.undefined,
        Outputs: js.UndefOr[ResponseOutputs] = js.undefined,
        PlaybackMode: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined,
        Tier: js.UndefOr[__string] = js.undefined
    ): CreateChannelResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      ChannelName.foreach(__v => __obj.updateDynamic("ChannelName")(__v.asInstanceOf[js.Any]))
      ChannelState.foreach(__v => __obj.updateDynamic("ChannelState")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      FillerSlate.foreach(__v => __obj.updateDynamic("FillerSlate")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Outputs.foreach(__v => __obj.updateDynamic("Outputs")(__v.asInstanceOf[js.Any]))
      PlaybackMode.foreach(__v => __obj.updateDynamic("PlaybackMode")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Tier.foreach(__v => __obj.updateDynamic("Tier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateChannelResponse]
    }
  }

  @js.native
  trait CreateLiveSourceRequest extends js.Object {
    var HttpPackageConfigurations: HttpPackageConfigurations
    var LiveSourceName: __string
    var SourceLocationName: __string
    var Tags: js.UndefOr[__mapOf__string]
  }

  object CreateLiveSourceRequest {
    @inline
    def apply(
        HttpPackageConfigurations: HttpPackageConfigurations,
        LiveSourceName: __string,
        SourceLocationName: __string,
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): CreateLiveSourceRequest = {
      val __obj = js.Dynamic.literal(
        "HttpPackageConfigurations" -> HttpPackageConfigurations.asInstanceOf[js.Any],
        "LiveSourceName" -> LiveSourceName.asInstanceOf[js.Any],
        "SourceLocationName" -> SourceLocationName.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLiveSourceRequest]
    }
  }

  @js.native
  trait CreateLiveSourceResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTime: js.UndefOr[__timestampUnix]
    var HttpPackageConfigurations: js.UndefOr[HttpPackageConfigurations]
    var LastModifiedTime: js.UndefOr[__timestampUnix]
    var LiveSourceName: js.UndefOr[__string]
    var SourceLocationName: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
  }

  object CreateLiveSourceResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTime: js.UndefOr[__timestampUnix] = js.undefined,
        HttpPackageConfigurations: js.UndefOr[HttpPackageConfigurations] = js.undefined,
        LastModifiedTime: js.UndefOr[__timestampUnix] = js.undefined,
        LiveSourceName: js.UndefOr[__string] = js.undefined,
        SourceLocationName: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): CreateLiveSourceResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      HttpPackageConfigurations.foreach(__v => __obj.updateDynamic("HttpPackageConfigurations")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      LiveSourceName.foreach(__v => __obj.updateDynamic("LiveSourceName")(__v.asInstanceOf[js.Any]))
      SourceLocationName.foreach(__v => __obj.updateDynamic("SourceLocationName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateLiveSourceResponse]
    }
  }

  @js.native
  trait CreatePrefetchScheduleRequest extends js.Object {
    var Consumption: PrefetchConsumption
    var Name: __string
    var PlaybackConfigurationName: __string
    var Retrieval: PrefetchRetrieval
    var StreamId: js.UndefOr[__string]
  }

  object CreatePrefetchScheduleRequest {
    @inline
    def apply(
        Consumption: PrefetchConsumption,
        Name: __string,
        PlaybackConfigurationName: __string,
        Retrieval: PrefetchRetrieval,
        StreamId: js.UndefOr[__string] = js.undefined
    ): CreatePrefetchScheduleRequest = {
      val __obj = js.Dynamic.literal(
        "Consumption" -> Consumption.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "PlaybackConfigurationName" -> PlaybackConfigurationName.asInstanceOf[js.Any],
        "Retrieval" -> Retrieval.asInstanceOf[js.Any]
      )

      StreamId.foreach(__v => __obj.updateDynamic("StreamId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePrefetchScheduleRequest]
    }
  }

  @js.native
  trait CreatePrefetchScheduleResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Consumption: js.UndefOr[PrefetchConsumption]
    var Name: js.UndefOr[__string]
    var PlaybackConfigurationName: js.UndefOr[__string]
    var Retrieval: js.UndefOr[PrefetchRetrieval]
    var StreamId: js.UndefOr[__string]
  }

  object CreatePrefetchScheduleResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Consumption: js.UndefOr[PrefetchConsumption] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        PlaybackConfigurationName: js.UndefOr[__string] = js.undefined,
        Retrieval: js.UndefOr[PrefetchRetrieval] = js.undefined,
        StreamId: js.UndefOr[__string] = js.undefined
    ): CreatePrefetchScheduleResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Consumption.foreach(__v => __obj.updateDynamic("Consumption")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PlaybackConfigurationName.foreach(__v => __obj.updateDynamic("PlaybackConfigurationName")(__v.asInstanceOf[js.Any]))
      Retrieval.foreach(__v => __obj.updateDynamic("Retrieval")(__v.asInstanceOf[js.Any]))
      StreamId.foreach(__v => __obj.updateDynamic("StreamId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePrefetchScheduleResponse]
    }
  }

  @js.native
  trait CreateProgramRequest extends js.Object {
    var ChannelName: __string
    var ProgramName: __string
    var ScheduleConfiguration: ScheduleConfiguration
    var SourceLocationName: __string
    var AdBreaks: js.UndefOr[__listOfAdBreak]
    var LiveSourceName: js.UndefOr[__string]
    var VodSourceName: js.UndefOr[__string]
  }

  object CreateProgramRequest {
    @inline
    def apply(
        ChannelName: __string,
        ProgramName: __string,
        ScheduleConfiguration: ScheduleConfiguration,
        SourceLocationName: __string,
        AdBreaks: js.UndefOr[__listOfAdBreak] = js.undefined,
        LiveSourceName: js.UndefOr[__string] = js.undefined,
        VodSourceName: js.UndefOr[__string] = js.undefined
    ): CreateProgramRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelName" -> ChannelName.asInstanceOf[js.Any],
        "ProgramName" -> ProgramName.asInstanceOf[js.Any],
        "ScheduleConfiguration" -> ScheduleConfiguration.asInstanceOf[js.Any],
        "SourceLocationName" -> SourceLocationName.asInstanceOf[js.Any]
      )

      AdBreaks.foreach(__v => __obj.updateDynamic("AdBreaks")(__v.asInstanceOf[js.Any]))
      LiveSourceName.foreach(__v => __obj.updateDynamic("LiveSourceName")(__v.asInstanceOf[js.Any]))
      VodSourceName.foreach(__v => __obj.updateDynamic("VodSourceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProgramRequest]
    }
  }

  @js.native
  trait CreateProgramResponse extends js.Object {
    var AdBreaks: js.UndefOr[__listOfAdBreak]
    var Arn: js.UndefOr[__string]
    var ChannelName: js.UndefOr[__string]
    var CreationTime: js.UndefOr[__timestampUnix]
    var LiveSourceName: js.UndefOr[__string]
    var ProgramName: js.UndefOr[__string]
    var ScheduledStartTime: js.UndefOr[__timestampUnix]
    var SourceLocationName: js.UndefOr[__string]
    var VodSourceName: js.UndefOr[__string]
  }

  object CreateProgramResponse {
    @inline
    def apply(
        AdBreaks: js.UndefOr[__listOfAdBreak] = js.undefined,
        Arn: js.UndefOr[__string] = js.undefined,
        ChannelName: js.UndefOr[__string] = js.undefined,
        CreationTime: js.UndefOr[__timestampUnix] = js.undefined,
        LiveSourceName: js.UndefOr[__string] = js.undefined,
        ProgramName: js.UndefOr[__string] = js.undefined,
        ScheduledStartTime: js.UndefOr[__timestampUnix] = js.undefined,
        SourceLocationName: js.UndefOr[__string] = js.undefined,
        VodSourceName: js.UndefOr[__string] = js.undefined
    ): CreateProgramResponse = {
      val __obj = js.Dynamic.literal()
      AdBreaks.foreach(__v => __obj.updateDynamic("AdBreaks")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      ChannelName.foreach(__v => __obj.updateDynamic("ChannelName")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LiveSourceName.foreach(__v => __obj.updateDynamic("LiveSourceName")(__v.asInstanceOf[js.Any]))
      ProgramName.foreach(__v => __obj.updateDynamic("ProgramName")(__v.asInstanceOf[js.Any]))
      ScheduledStartTime.foreach(__v => __obj.updateDynamic("ScheduledStartTime")(__v.asInstanceOf[js.Any]))
      SourceLocationName.foreach(__v => __obj.updateDynamic("SourceLocationName")(__v.asInstanceOf[js.Any]))
      VodSourceName.foreach(__v => __obj.updateDynamic("VodSourceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateProgramResponse]
    }
  }

  @js.native
  trait CreateSourceLocationRequest extends js.Object {
    var HttpConfiguration: HttpConfiguration
    var SourceLocationName: __string
    var AccessConfiguration: js.UndefOr[AccessConfiguration]
    var DefaultSegmentDeliveryConfiguration: js.UndefOr[DefaultSegmentDeliveryConfiguration]
    var SegmentDeliveryConfigurations: js.UndefOr[__listOfSegmentDeliveryConfiguration]
    var Tags: js.UndefOr[__mapOf__string]
  }

  object CreateSourceLocationRequest {
    @inline
    def apply(
        HttpConfiguration: HttpConfiguration,
        SourceLocationName: __string,
        AccessConfiguration: js.UndefOr[AccessConfiguration] = js.undefined,
        DefaultSegmentDeliveryConfiguration: js.UndefOr[DefaultSegmentDeliveryConfiguration] = js.undefined,
        SegmentDeliveryConfigurations: js.UndefOr[__listOfSegmentDeliveryConfiguration] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): CreateSourceLocationRequest = {
      val __obj = js.Dynamic.literal(
        "HttpConfiguration" -> HttpConfiguration.asInstanceOf[js.Any],
        "SourceLocationName" -> SourceLocationName.asInstanceOf[js.Any]
      )

      AccessConfiguration.foreach(__v => __obj.updateDynamic("AccessConfiguration")(__v.asInstanceOf[js.Any]))
      DefaultSegmentDeliveryConfiguration.foreach(__v => __obj.updateDynamic("DefaultSegmentDeliveryConfiguration")(__v.asInstanceOf[js.Any]))
      SegmentDeliveryConfigurations.foreach(__v => __obj.updateDynamic("SegmentDeliveryConfigurations")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSourceLocationRequest]
    }
  }

  @js.native
  trait CreateSourceLocationResponse extends js.Object {
    var AccessConfiguration: js.UndefOr[AccessConfiguration]
    var Arn: js.UndefOr[__string]
    var CreationTime: js.UndefOr[__timestampUnix]
    var DefaultSegmentDeliveryConfiguration: js.UndefOr[DefaultSegmentDeliveryConfiguration]
    var HttpConfiguration: js.UndefOr[HttpConfiguration]
    var LastModifiedTime: js.UndefOr[__timestampUnix]
    var SegmentDeliveryConfigurations: js.UndefOr[__listOfSegmentDeliveryConfiguration]
    var SourceLocationName: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
  }

  object CreateSourceLocationResponse {
    @inline
    def apply(
        AccessConfiguration: js.UndefOr[AccessConfiguration] = js.undefined,
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTime: js.UndefOr[__timestampUnix] = js.undefined,
        DefaultSegmentDeliveryConfiguration: js.UndefOr[DefaultSegmentDeliveryConfiguration] = js.undefined,
        HttpConfiguration: js.UndefOr[HttpConfiguration] = js.undefined,
        LastModifiedTime: js.UndefOr[__timestampUnix] = js.undefined,
        SegmentDeliveryConfigurations: js.UndefOr[__listOfSegmentDeliveryConfiguration] = js.undefined,
        SourceLocationName: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): CreateSourceLocationResponse = {
      val __obj = js.Dynamic.literal()
      AccessConfiguration.foreach(__v => __obj.updateDynamic("AccessConfiguration")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DefaultSegmentDeliveryConfiguration.foreach(__v => __obj.updateDynamic("DefaultSegmentDeliveryConfiguration")(__v.asInstanceOf[js.Any]))
      HttpConfiguration.foreach(__v => __obj.updateDynamic("HttpConfiguration")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      SegmentDeliveryConfigurations.foreach(__v => __obj.updateDynamic("SegmentDeliveryConfigurations")(__v.asInstanceOf[js.Any]))
      SourceLocationName.foreach(__v => __obj.updateDynamic("SourceLocationName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSourceLocationResponse]
    }
  }

  @js.native
  trait CreateVodSourceRequest extends js.Object {
    var HttpPackageConfigurations: HttpPackageConfigurations
    var SourceLocationName: __string
    var VodSourceName: __string
    var Tags: js.UndefOr[__mapOf__string]
  }

  object CreateVodSourceRequest {
    @inline
    def apply(
        HttpPackageConfigurations: HttpPackageConfigurations,
        SourceLocationName: __string,
        VodSourceName: __string,
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): CreateVodSourceRequest = {
      val __obj = js.Dynamic.literal(
        "HttpPackageConfigurations" -> HttpPackageConfigurations.asInstanceOf[js.Any],
        "SourceLocationName" -> SourceLocationName.asInstanceOf[js.Any],
        "VodSourceName" -> VodSourceName.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVodSourceRequest]
    }
  }

  @js.native
  trait CreateVodSourceResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTime: js.UndefOr[__timestampUnix]
    var HttpPackageConfigurations: js.UndefOr[HttpPackageConfigurations]
    var LastModifiedTime: js.UndefOr[__timestampUnix]
    var SourceLocationName: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
    var VodSourceName: js.UndefOr[__string]
  }

  object CreateVodSourceResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTime: js.UndefOr[__timestampUnix] = js.undefined,
        HttpPackageConfigurations: js.UndefOr[HttpPackageConfigurations] = js.undefined,
        LastModifiedTime: js.UndefOr[__timestampUnix] = js.undefined,
        SourceLocationName: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined,
        VodSourceName: js.UndefOr[__string] = js.undefined
    ): CreateVodSourceResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      HttpPackageConfigurations.foreach(__v => __obj.updateDynamic("HttpPackageConfigurations")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      SourceLocationName.foreach(__v => __obj.updateDynamic("SourceLocationName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VodSourceName.foreach(__v => __obj.updateDynamic("VodSourceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVodSourceResponse]
    }
  }

  /** The configuration for DASH content.
    */
  @js.native
  trait DashConfiguration extends js.Object {
    var ManifestEndpointPrefix: js.UndefOr[__string]
    var MpdLocation: js.UndefOr[__string]
    var OriginManifestType: js.UndefOr[OriginManifestType]
  }

  object DashConfiguration {
    @inline
    def apply(
        ManifestEndpointPrefix: js.UndefOr[__string] = js.undefined,
        MpdLocation: js.UndefOr[__string] = js.undefined,
        OriginManifestType: js.UndefOr[OriginManifestType] = js.undefined
    ): DashConfiguration = {
      val __obj = js.Dynamic.literal()
      ManifestEndpointPrefix.foreach(__v => __obj.updateDynamic("ManifestEndpointPrefix")(__v.asInstanceOf[js.Any]))
      MpdLocation.foreach(__v => __obj.updateDynamic("MpdLocation")(__v.asInstanceOf[js.Any]))
      OriginManifestType.foreach(__v => __obj.updateDynamic("OriginManifestType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DashConfiguration]
    }
  }

  /** The configuration for DASH PUT operations.
    */
  @js.native
  trait DashConfigurationForPut extends js.Object {
    var MpdLocation: js.UndefOr[__string]
    var OriginManifestType: js.UndefOr[OriginManifestType]
  }

  object DashConfigurationForPut {
    @inline
    def apply(
        MpdLocation: js.UndefOr[__string] = js.undefined,
        OriginManifestType: js.UndefOr[OriginManifestType] = js.undefined
    ): DashConfigurationForPut = {
      val __obj = js.Dynamic.literal()
      MpdLocation.foreach(__v => __obj.updateDynamic("MpdLocation")(__v.asInstanceOf[js.Any]))
      OriginManifestType.foreach(__v => __obj.updateDynamic("OriginManifestType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DashConfigurationForPut]
    }
  }

  /** Dash manifest configuration parameters.
    */
  @js.native
  trait DashPlaylistSettings extends js.Object {
    var ManifestWindowSeconds: js.UndefOr[__integer]
    var MinBufferTimeSeconds: js.UndefOr[__integer]
    var MinUpdatePeriodSeconds: js.UndefOr[__integer]
    var SuggestedPresentationDelaySeconds: js.UndefOr[__integer]
  }

  object DashPlaylistSettings {
    @inline
    def apply(
        ManifestWindowSeconds: js.UndefOr[__integer] = js.undefined,
        MinBufferTimeSeconds: js.UndefOr[__integer] = js.undefined,
        MinUpdatePeriodSeconds: js.UndefOr[__integer] = js.undefined,
        SuggestedPresentationDelaySeconds: js.UndefOr[__integer] = js.undefined
    ): DashPlaylistSettings = {
      val __obj = js.Dynamic.literal()
      ManifestWindowSeconds.foreach(__v => __obj.updateDynamic("ManifestWindowSeconds")(__v.asInstanceOf[js.Any]))
      MinBufferTimeSeconds.foreach(__v => __obj.updateDynamic("MinBufferTimeSeconds")(__v.asInstanceOf[js.Any]))
      MinUpdatePeriodSeconds.foreach(__v => __obj.updateDynamic("MinUpdatePeriodSeconds")(__v.asInstanceOf[js.Any]))
      SuggestedPresentationDelaySeconds.foreach(__v => __obj.updateDynamic("SuggestedPresentationDelaySeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DashPlaylistSettings]
    }
  }

  /** The optional configuration for a server that serves segments. Use this if you want the segment delivery server to be different from the source location server. For example, you can configure your source location server to be an origination server, such as MediaPackage, and the segment delivery server to be a content delivery network (CDN), such as CloudFront. If you don't specify a segment delivery server, then the source location server is used.
    */
  @js.native
  trait DefaultSegmentDeliveryConfiguration extends js.Object {
    var BaseUrl: js.UndefOr[__string]
  }

  object DefaultSegmentDeliveryConfiguration {
    @inline
    def apply(
        BaseUrl: js.UndefOr[__string] = js.undefined
    ): DefaultSegmentDeliveryConfiguration = {
      val __obj = js.Dynamic.literal()
      BaseUrl.foreach(__v => __obj.updateDynamic("BaseUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DefaultSegmentDeliveryConfiguration]
    }
  }

  @js.native
  trait DeleteChannelPolicyRequest extends js.Object {
    var ChannelName: __string
  }

  object DeleteChannelPolicyRequest {
    @inline
    def apply(
        ChannelName: __string
    ): DeleteChannelPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelName" -> ChannelName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteChannelPolicyRequest]
    }
  }

  @js.native
  trait DeleteChannelPolicyResponse extends js.Object

  object DeleteChannelPolicyResponse {
    @inline
    def apply(): DeleteChannelPolicyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteChannelPolicyResponse]
    }
  }

  @js.native
  trait DeleteChannelRequest extends js.Object {
    var ChannelName: __string
  }

  object DeleteChannelRequest {
    @inline
    def apply(
        ChannelName: __string
    ): DeleteChannelRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelName" -> ChannelName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteChannelRequest]
    }
  }

  @js.native
  trait DeleteChannelResponse extends js.Object

  object DeleteChannelResponse {
    @inline
    def apply(): DeleteChannelResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteChannelResponse]
    }
  }

  @js.native
  trait DeleteLiveSourceRequest extends js.Object {
    var LiveSourceName: __string
    var SourceLocationName: __string
  }

  object DeleteLiveSourceRequest {
    @inline
    def apply(
        LiveSourceName: __string,
        SourceLocationName: __string
    ): DeleteLiveSourceRequest = {
      val __obj = js.Dynamic.literal(
        "LiveSourceName" -> LiveSourceName.asInstanceOf[js.Any],
        "SourceLocationName" -> SourceLocationName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteLiveSourceRequest]
    }
  }

  @js.native
  trait DeleteLiveSourceResponse extends js.Object

  object DeleteLiveSourceResponse {
    @inline
    def apply(): DeleteLiveSourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteLiveSourceResponse]
    }
  }

  @js.native
  trait DeletePlaybackConfigurationRequest extends js.Object {
    var Name: __string
  }

  object DeletePlaybackConfigurationRequest {
    @inline
    def apply(
        Name: __string
    ): DeletePlaybackConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeletePlaybackConfigurationRequest]
    }
  }

  @js.native
  trait DeletePlaybackConfigurationResponse extends js.Object

  object DeletePlaybackConfigurationResponse {
    @inline
    def apply(): DeletePlaybackConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeletePlaybackConfigurationResponse]
    }
  }

  @js.native
  trait DeletePrefetchScheduleRequest extends js.Object {
    var Name: __string
    var PlaybackConfigurationName: __string
  }

  object DeletePrefetchScheduleRequest {
    @inline
    def apply(
        Name: __string,
        PlaybackConfigurationName: __string
    ): DeletePrefetchScheduleRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "PlaybackConfigurationName" -> PlaybackConfigurationName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeletePrefetchScheduleRequest]
    }
  }

  @js.native
  trait DeletePrefetchScheduleResponse extends js.Object

  object DeletePrefetchScheduleResponse {
    @inline
    def apply(): DeletePrefetchScheduleResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeletePrefetchScheduleResponse]
    }
  }

  @js.native
  trait DeleteProgramRequest extends js.Object {
    var ChannelName: __string
    var ProgramName: __string
  }

  object DeleteProgramRequest {
    @inline
    def apply(
        ChannelName: __string,
        ProgramName: __string
    ): DeleteProgramRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelName" -> ChannelName.asInstanceOf[js.Any],
        "ProgramName" -> ProgramName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteProgramRequest]
    }
  }

  @js.native
  trait DeleteProgramResponse extends js.Object

  object DeleteProgramResponse {
    @inline
    def apply(): DeleteProgramResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteProgramResponse]
    }
  }

  @js.native
  trait DeleteSourceLocationRequest extends js.Object {
    var SourceLocationName: __string
  }

  object DeleteSourceLocationRequest {
    @inline
    def apply(
        SourceLocationName: __string
    ): DeleteSourceLocationRequest = {
      val __obj = js.Dynamic.literal(
        "SourceLocationName" -> SourceLocationName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteSourceLocationRequest]
    }
  }

  @js.native
  trait DeleteSourceLocationResponse extends js.Object

  object DeleteSourceLocationResponse {
    @inline
    def apply(): DeleteSourceLocationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteSourceLocationResponse]
    }
  }

  @js.native
  trait DeleteVodSourceRequest extends js.Object {
    var SourceLocationName: __string
    var VodSourceName: __string
  }

  object DeleteVodSourceRequest {
    @inline
    def apply(
        SourceLocationName: __string,
        VodSourceName: __string
    ): DeleteVodSourceRequest = {
      val __obj = js.Dynamic.literal(
        "SourceLocationName" -> SourceLocationName.asInstanceOf[js.Any],
        "VodSourceName" -> VodSourceName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteVodSourceRequest]
    }
  }

  @js.native
  trait DeleteVodSourceResponse extends js.Object

  object DeleteVodSourceResponse {
    @inline
    def apply(): DeleteVodSourceResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeleteVodSourceResponse]
    }
  }

  @js.native
  trait DescribeChannelRequest extends js.Object {
    var ChannelName: __string
  }

  object DescribeChannelRequest {
    @inline
    def apply(
        ChannelName: __string
    ): DescribeChannelRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelName" -> ChannelName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeChannelRequest]
    }
  }

  @js.native
  trait DescribeChannelResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var ChannelName: js.UndefOr[__string]
    var ChannelState: js.UndefOr[ChannelState]
    var CreationTime: js.UndefOr[__timestampUnix]
    var FillerSlate: js.UndefOr[SlateSource]
    var LastModifiedTime: js.UndefOr[__timestampUnix]
    var Outputs: js.UndefOr[ResponseOutputs]
    var PlaybackMode: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
    var Tier: js.UndefOr[__string]
  }

  object DescribeChannelResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        ChannelName: js.UndefOr[__string] = js.undefined,
        ChannelState: js.UndefOr[ChannelState] = js.undefined,
        CreationTime: js.UndefOr[__timestampUnix] = js.undefined,
        FillerSlate: js.UndefOr[SlateSource] = js.undefined,
        LastModifiedTime: js.UndefOr[__timestampUnix] = js.undefined,
        Outputs: js.UndefOr[ResponseOutputs] = js.undefined,
        PlaybackMode: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined,
        Tier: js.UndefOr[__string] = js.undefined
    ): DescribeChannelResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      ChannelName.foreach(__v => __obj.updateDynamic("ChannelName")(__v.asInstanceOf[js.Any]))
      ChannelState.foreach(__v => __obj.updateDynamic("ChannelState")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      FillerSlate.foreach(__v => __obj.updateDynamic("FillerSlate")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Outputs.foreach(__v => __obj.updateDynamic("Outputs")(__v.asInstanceOf[js.Any]))
      PlaybackMode.foreach(__v => __obj.updateDynamic("PlaybackMode")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Tier.foreach(__v => __obj.updateDynamic("Tier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeChannelResponse]
    }
  }

  @js.native
  trait DescribeLiveSourceRequest extends js.Object {
    var LiveSourceName: __string
    var SourceLocationName: __string
  }

  object DescribeLiveSourceRequest {
    @inline
    def apply(
        LiveSourceName: __string,
        SourceLocationName: __string
    ): DescribeLiveSourceRequest = {
      val __obj = js.Dynamic.literal(
        "LiveSourceName" -> LiveSourceName.asInstanceOf[js.Any],
        "SourceLocationName" -> SourceLocationName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeLiveSourceRequest]
    }
  }

  @js.native
  trait DescribeLiveSourceResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTime: js.UndefOr[__timestampUnix]
    var HttpPackageConfigurations: js.UndefOr[HttpPackageConfigurations]
    var LastModifiedTime: js.UndefOr[__timestampUnix]
    var LiveSourceName: js.UndefOr[__string]
    var SourceLocationName: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
  }

  object DescribeLiveSourceResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTime: js.UndefOr[__timestampUnix] = js.undefined,
        HttpPackageConfigurations: js.UndefOr[HttpPackageConfigurations] = js.undefined,
        LastModifiedTime: js.UndefOr[__timestampUnix] = js.undefined,
        LiveSourceName: js.UndefOr[__string] = js.undefined,
        SourceLocationName: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): DescribeLiveSourceResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      HttpPackageConfigurations.foreach(__v => __obj.updateDynamic("HttpPackageConfigurations")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      LiveSourceName.foreach(__v => __obj.updateDynamic("LiveSourceName")(__v.asInstanceOf[js.Any]))
      SourceLocationName.foreach(__v => __obj.updateDynamic("SourceLocationName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeLiveSourceResponse]
    }
  }

  @js.native
  trait DescribeProgramRequest extends js.Object {
    var ChannelName: __string
    var ProgramName: __string
  }

  object DescribeProgramRequest {
    @inline
    def apply(
        ChannelName: __string,
        ProgramName: __string
    ): DescribeProgramRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelName" -> ChannelName.asInstanceOf[js.Any],
        "ProgramName" -> ProgramName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeProgramRequest]
    }
  }

  @js.native
  trait DescribeProgramResponse extends js.Object {
    var AdBreaks: js.UndefOr[__listOfAdBreak]
    var Arn: js.UndefOr[__string]
    var ChannelName: js.UndefOr[__string]
    var CreationTime: js.UndefOr[__timestampUnix]
    var LiveSourceName: js.UndefOr[__string]
    var ProgramName: js.UndefOr[__string]
    var ScheduledStartTime: js.UndefOr[__timestampUnix]
    var SourceLocationName: js.UndefOr[__string]
    var VodSourceName: js.UndefOr[__string]
  }

  object DescribeProgramResponse {
    @inline
    def apply(
        AdBreaks: js.UndefOr[__listOfAdBreak] = js.undefined,
        Arn: js.UndefOr[__string] = js.undefined,
        ChannelName: js.UndefOr[__string] = js.undefined,
        CreationTime: js.UndefOr[__timestampUnix] = js.undefined,
        LiveSourceName: js.UndefOr[__string] = js.undefined,
        ProgramName: js.UndefOr[__string] = js.undefined,
        ScheduledStartTime: js.UndefOr[__timestampUnix] = js.undefined,
        SourceLocationName: js.UndefOr[__string] = js.undefined,
        VodSourceName: js.UndefOr[__string] = js.undefined
    ): DescribeProgramResponse = {
      val __obj = js.Dynamic.literal()
      AdBreaks.foreach(__v => __obj.updateDynamic("AdBreaks")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      ChannelName.foreach(__v => __obj.updateDynamic("ChannelName")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LiveSourceName.foreach(__v => __obj.updateDynamic("LiveSourceName")(__v.asInstanceOf[js.Any]))
      ProgramName.foreach(__v => __obj.updateDynamic("ProgramName")(__v.asInstanceOf[js.Any]))
      ScheduledStartTime.foreach(__v => __obj.updateDynamic("ScheduledStartTime")(__v.asInstanceOf[js.Any]))
      SourceLocationName.foreach(__v => __obj.updateDynamic("SourceLocationName")(__v.asInstanceOf[js.Any]))
      VodSourceName.foreach(__v => __obj.updateDynamic("VodSourceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeProgramResponse]
    }
  }

  @js.native
  trait DescribeSourceLocationRequest extends js.Object {
    var SourceLocationName: __string
  }

  object DescribeSourceLocationRequest {
    @inline
    def apply(
        SourceLocationName: __string
    ): DescribeSourceLocationRequest = {
      val __obj = js.Dynamic.literal(
        "SourceLocationName" -> SourceLocationName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeSourceLocationRequest]
    }
  }

  @js.native
  trait DescribeSourceLocationResponse extends js.Object {
    var AccessConfiguration: js.UndefOr[AccessConfiguration]
    var Arn: js.UndefOr[__string]
    var CreationTime: js.UndefOr[__timestampUnix]
    var DefaultSegmentDeliveryConfiguration: js.UndefOr[DefaultSegmentDeliveryConfiguration]
    var HttpConfiguration: js.UndefOr[HttpConfiguration]
    var LastModifiedTime: js.UndefOr[__timestampUnix]
    var SegmentDeliveryConfigurations: js.UndefOr[__listOfSegmentDeliveryConfiguration]
    var SourceLocationName: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
  }

  object DescribeSourceLocationResponse {
    @inline
    def apply(
        AccessConfiguration: js.UndefOr[AccessConfiguration] = js.undefined,
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTime: js.UndefOr[__timestampUnix] = js.undefined,
        DefaultSegmentDeliveryConfiguration: js.UndefOr[DefaultSegmentDeliveryConfiguration] = js.undefined,
        HttpConfiguration: js.UndefOr[HttpConfiguration] = js.undefined,
        LastModifiedTime: js.UndefOr[__timestampUnix] = js.undefined,
        SegmentDeliveryConfigurations: js.UndefOr[__listOfSegmentDeliveryConfiguration] = js.undefined,
        SourceLocationName: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): DescribeSourceLocationResponse = {
      val __obj = js.Dynamic.literal()
      AccessConfiguration.foreach(__v => __obj.updateDynamic("AccessConfiguration")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DefaultSegmentDeliveryConfiguration.foreach(__v => __obj.updateDynamic("DefaultSegmentDeliveryConfiguration")(__v.asInstanceOf[js.Any]))
      HttpConfiguration.foreach(__v => __obj.updateDynamic("HttpConfiguration")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      SegmentDeliveryConfigurations.foreach(__v => __obj.updateDynamic("SegmentDeliveryConfigurations")(__v.asInstanceOf[js.Any]))
      SourceLocationName.foreach(__v => __obj.updateDynamic("SourceLocationName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSourceLocationResponse]
    }
  }

  @js.native
  trait DescribeVodSourceRequest extends js.Object {
    var SourceLocationName: __string
    var VodSourceName: __string
  }

  object DescribeVodSourceRequest {
    @inline
    def apply(
        SourceLocationName: __string,
        VodSourceName: __string
    ): DescribeVodSourceRequest = {
      val __obj = js.Dynamic.literal(
        "SourceLocationName" -> SourceLocationName.asInstanceOf[js.Any],
        "VodSourceName" -> VodSourceName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeVodSourceRequest]
    }
  }

  @js.native
  trait DescribeVodSourceResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTime: js.UndefOr[__timestampUnix]
    var HttpPackageConfigurations: js.UndefOr[HttpPackageConfigurations]
    var LastModifiedTime: js.UndefOr[__timestampUnix]
    var SourceLocationName: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
    var VodSourceName: js.UndefOr[__string]
  }

  object DescribeVodSourceResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTime: js.UndefOr[__timestampUnix] = js.undefined,
        HttpPackageConfigurations: js.UndefOr[HttpPackageConfigurations] = js.undefined,
        LastModifiedTime: js.UndefOr[__timestampUnix] = js.undefined,
        SourceLocationName: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined,
        VodSourceName: js.UndefOr[__string] = js.undefined
    ): DescribeVodSourceResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      HttpPackageConfigurations.foreach(__v => __obj.updateDynamic("HttpPackageConfigurations")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      SourceLocationName.foreach(__v => __obj.updateDynamic("SourceLocationName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VodSourceName.foreach(__v => __obj.updateDynamic("VodSourceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeVodSourceResponse]
    }
  }

  @js.native
  trait GetChannelPolicyRequest extends js.Object {
    var ChannelName: __string
  }

  object GetChannelPolicyRequest {
    @inline
    def apply(
        ChannelName: __string
    ): GetChannelPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelName" -> ChannelName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetChannelPolicyRequest]
    }
  }

  @js.native
  trait GetChannelPolicyResponse extends js.Object {
    var Policy: js.UndefOr[__string]
  }

  object GetChannelPolicyResponse {
    @inline
    def apply(
        Policy: js.UndefOr[__string] = js.undefined
    ): GetChannelPolicyResponse = {
      val __obj = js.Dynamic.literal()
      Policy.foreach(__v => __obj.updateDynamic("Policy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetChannelPolicyResponse]
    }
  }

  @js.native
  trait GetChannelScheduleRequest extends js.Object {
    var ChannelName: __string
    var DurationMinutes: js.UndefOr[__string]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object GetChannelScheduleRequest {
    @inline
    def apply(
        ChannelName: __string,
        DurationMinutes: js.UndefOr[__string] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): GetChannelScheduleRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelName" -> ChannelName.asInstanceOf[js.Any]
      )

      DurationMinutes.foreach(__v => __obj.updateDynamic("DurationMinutes")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetChannelScheduleRequest]
    }
  }

  @js.native
  trait GetChannelScheduleResponse extends js.Object {
    var Items: js.UndefOr[__listOfScheduleEntry]
    var NextToken: js.UndefOr[__string]
  }

  object GetChannelScheduleResponse {
    @inline
    def apply(
        Items: js.UndefOr[__listOfScheduleEntry] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): GetChannelScheduleResponse = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetChannelScheduleResponse]
    }
  }

  @js.native
  trait GetPlaybackConfigurationRequest extends js.Object {
    var Name: __string
  }

  object GetPlaybackConfigurationRequest {
    @inline
    def apply(
        Name: __string
    ): GetPlaybackConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetPlaybackConfigurationRequest]
    }
  }

  @js.native
  trait GetPlaybackConfigurationResponse extends js.Object {
    var AdDecisionServerUrl: js.UndefOr[__string]
    var AvailSuppression: js.UndefOr[AvailSuppression]
    var Bumper: js.UndefOr[Bumper]
    var CdnConfiguration: js.UndefOr[CdnConfiguration]
    var ConfigurationAliases: js.UndefOr[ConfigurationAliasesResponse]
    var DashConfiguration: js.UndefOr[DashConfiguration]
    var HlsConfiguration: js.UndefOr[HlsConfiguration]
    var LivePreRollConfiguration: js.UndefOr[LivePreRollConfiguration]
    var LogConfiguration: js.UndefOr[LogConfiguration]
    var ManifestProcessingRules: js.UndefOr[ManifestProcessingRules]
    var Name: js.UndefOr[__string]
    var PersonalizationThresholdSeconds: js.UndefOr[__integerMin1]
    var PlaybackConfigurationArn: js.UndefOr[__string]
    var PlaybackEndpointPrefix: js.UndefOr[__string]
    var SessionInitializationEndpointPrefix: js.UndefOr[__string]
    var SlateAdUrl: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
    var TranscodeProfileName: js.UndefOr[__string]
    var VideoContentSourceUrl: js.UndefOr[__string]
  }

  object GetPlaybackConfigurationResponse {
    @inline
    def apply(
        AdDecisionServerUrl: js.UndefOr[__string] = js.undefined,
        AvailSuppression: js.UndefOr[AvailSuppression] = js.undefined,
        Bumper: js.UndefOr[Bumper] = js.undefined,
        CdnConfiguration: js.UndefOr[CdnConfiguration] = js.undefined,
        ConfigurationAliases: js.UndefOr[ConfigurationAliasesResponse] = js.undefined,
        DashConfiguration: js.UndefOr[DashConfiguration] = js.undefined,
        HlsConfiguration: js.UndefOr[HlsConfiguration] = js.undefined,
        LivePreRollConfiguration: js.UndefOr[LivePreRollConfiguration] = js.undefined,
        LogConfiguration: js.UndefOr[LogConfiguration] = js.undefined,
        ManifestProcessingRules: js.UndefOr[ManifestProcessingRules] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        PersonalizationThresholdSeconds: js.UndefOr[__integerMin1] = js.undefined,
        PlaybackConfigurationArn: js.UndefOr[__string] = js.undefined,
        PlaybackEndpointPrefix: js.UndefOr[__string] = js.undefined,
        SessionInitializationEndpointPrefix: js.UndefOr[__string] = js.undefined,
        SlateAdUrl: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined,
        TranscodeProfileName: js.UndefOr[__string] = js.undefined,
        VideoContentSourceUrl: js.UndefOr[__string] = js.undefined
    ): GetPlaybackConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      AdDecisionServerUrl.foreach(__v => __obj.updateDynamic("AdDecisionServerUrl")(__v.asInstanceOf[js.Any]))
      AvailSuppression.foreach(__v => __obj.updateDynamic("AvailSuppression")(__v.asInstanceOf[js.Any]))
      Bumper.foreach(__v => __obj.updateDynamic("Bumper")(__v.asInstanceOf[js.Any]))
      CdnConfiguration.foreach(__v => __obj.updateDynamic("CdnConfiguration")(__v.asInstanceOf[js.Any]))
      ConfigurationAliases.foreach(__v => __obj.updateDynamic("ConfigurationAliases")(__v.asInstanceOf[js.Any]))
      DashConfiguration.foreach(__v => __obj.updateDynamic("DashConfiguration")(__v.asInstanceOf[js.Any]))
      HlsConfiguration.foreach(__v => __obj.updateDynamic("HlsConfiguration")(__v.asInstanceOf[js.Any]))
      LivePreRollConfiguration.foreach(__v => __obj.updateDynamic("LivePreRollConfiguration")(__v.asInstanceOf[js.Any]))
      LogConfiguration.foreach(__v => __obj.updateDynamic("LogConfiguration")(__v.asInstanceOf[js.Any]))
      ManifestProcessingRules.foreach(__v => __obj.updateDynamic("ManifestProcessingRules")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PersonalizationThresholdSeconds.foreach(__v => __obj.updateDynamic("PersonalizationThresholdSeconds")(__v.asInstanceOf[js.Any]))
      PlaybackConfigurationArn.foreach(__v => __obj.updateDynamic("PlaybackConfigurationArn")(__v.asInstanceOf[js.Any]))
      PlaybackEndpointPrefix.foreach(__v => __obj.updateDynamic("PlaybackEndpointPrefix")(__v.asInstanceOf[js.Any]))
      SessionInitializationEndpointPrefix.foreach(__v => __obj.updateDynamic("SessionInitializationEndpointPrefix")(__v.asInstanceOf[js.Any]))
      SlateAdUrl.foreach(__v => __obj.updateDynamic("SlateAdUrl")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TranscodeProfileName.foreach(__v => __obj.updateDynamic("TranscodeProfileName")(__v.asInstanceOf[js.Any]))
      VideoContentSourceUrl.foreach(__v => __obj.updateDynamic("VideoContentSourceUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPlaybackConfigurationResponse]
    }
  }

  @js.native
  trait GetPrefetchScheduleRequest extends js.Object {
    var Name: __string
    var PlaybackConfigurationName: __string
  }

  object GetPrefetchScheduleRequest {
    @inline
    def apply(
        Name: __string,
        PlaybackConfigurationName: __string
    ): GetPrefetchScheduleRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "PlaybackConfigurationName" -> PlaybackConfigurationName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetPrefetchScheduleRequest]
    }
  }

  @js.native
  trait GetPrefetchScheduleResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var Consumption: js.UndefOr[PrefetchConsumption]
    var Name: js.UndefOr[__string]
    var PlaybackConfigurationName: js.UndefOr[__string]
    var Retrieval: js.UndefOr[PrefetchRetrieval]
    var StreamId: js.UndefOr[__string]
  }

  object GetPrefetchScheduleResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Consumption: js.UndefOr[PrefetchConsumption] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        PlaybackConfigurationName: js.UndefOr[__string] = js.undefined,
        Retrieval: js.UndefOr[PrefetchRetrieval] = js.undefined,
        StreamId: js.UndefOr[__string] = js.undefined
    ): GetPrefetchScheduleResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Consumption.foreach(__v => __obj.updateDynamic("Consumption")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PlaybackConfigurationName.foreach(__v => __obj.updateDynamic("PlaybackConfigurationName")(__v.asInstanceOf[js.Any]))
      Retrieval.foreach(__v => __obj.updateDynamic("Retrieval")(__v.asInstanceOf[js.Any]))
      StreamId.foreach(__v => __obj.updateDynamic("StreamId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetPrefetchScheduleResponse]
    }
  }

  /** The configuration for HLS content.
    */
  @js.native
  trait HlsConfiguration extends js.Object {
    var ManifestEndpointPrefix: js.UndefOr[__string]
  }

  object HlsConfiguration {
    @inline
    def apply(
        ManifestEndpointPrefix: js.UndefOr[__string] = js.undefined
    ): HlsConfiguration = {
      val __obj = js.Dynamic.literal()
      ManifestEndpointPrefix.foreach(__v => __obj.updateDynamic("ManifestEndpointPrefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsConfiguration]
    }
  }

  /** HLS playlist configuration parameters.
    */
  @js.native
  trait HlsPlaylistSettings extends js.Object {
    var ManifestWindowSeconds: js.UndefOr[__integer]
  }

  object HlsPlaylistSettings {
    @inline
    def apply(
        ManifestWindowSeconds: js.UndefOr[__integer] = js.undefined
    ): HlsPlaylistSettings = {
      val __obj = js.Dynamic.literal()
      ManifestWindowSeconds.foreach(__v => __obj.updateDynamic("ManifestWindowSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HlsPlaylistSettings]
    }
  }

  /** The HTTP configuration for the source location.
    */
  @js.native
  trait HttpConfiguration extends js.Object {
    var BaseUrl: __string
  }

  object HttpConfiguration {
    @inline
    def apply(
        BaseUrl: __string
    ): HttpConfiguration = {
      val __obj = js.Dynamic.literal(
        "BaseUrl" -> BaseUrl.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[HttpConfiguration]
    }
  }

  /** The HTTP package configuration properties for the requested VOD source.
    */
  @js.native
  trait HttpPackageConfiguration extends js.Object {
    var Path: __string
    var SourceGroup: __string
    var Type: Type
  }

  object HttpPackageConfiguration {
    @inline
    def apply(
        Path: __string,
        SourceGroup: __string,
        Type: Type
    ): HttpPackageConfiguration = {
      val __obj = js.Dynamic.literal(
        "Path" -> Path.asInstanceOf[js.Any],
        "SourceGroup" -> SourceGroup.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[HttpPackageConfiguration]
    }
  }

  @js.native
  trait ListAlertsRequest extends js.Object {
    var ResourceArn: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListAlertsRequest {
    @inline
    def apply(
        ResourceArn: __string,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListAlertsRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAlertsRequest]
    }
  }

  @js.native
  trait ListAlertsResponse extends js.Object {
    var Items: js.UndefOr[__listOfAlert]
    var NextToken: js.UndefOr[__string]
  }

  object ListAlertsResponse {
    @inline
    def apply(
        Items: js.UndefOr[__listOfAlert] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListAlertsResponse = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListAlertsResponse]
    }
  }

  @js.native
  trait ListChannelsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListChannelsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListChannelsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChannelsRequest]
    }
  }

  @js.native
  trait ListChannelsResponse extends js.Object {
    var Items: js.UndefOr[__listOfChannel]
    var NextToken: js.UndefOr[__string]
  }

  object ListChannelsResponse {
    @inline
    def apply(
        Items: js.UndefOr[__listOfChannel] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListChannelsResponse = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListChannelsResponse]
    }
  }

  @js.native
  trait ListLiveSourcesRequest extends js.Object {
    var SourceLocationName: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListLiveSourcesRequest {
    @inline
    def apply(
        SourceLocationName: __string,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListLiveSourcesRequest = {
      val __obj = js.Dynamic.literal(
        "SourceLocationName" -> SourceLocationName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLiveSourcesRequest]
    }
  }

  @js.native
  trait ListLiveSourcesResponse extends js.Object {
    var Items: js.UndefOr[__listOfLiveSource]
    var NextToken: js.UndefOr[__string]
  }

  object ListLiveSourcesResponse {
    @inline
    def apply(
        Items: js.UndefOr[__listOfLiveSource] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListLiveSourcesResponse = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListLiveSourcesResponse]
    }
  }

  @js.native
  trait ListPlaybackConfigurationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListPlaybackConfigurationsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListPlaybackConfigurationsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPlaybackConfigurationsRequest]
    }
  }

  @js.native
  trait ListPlaybackConfigurationsResponse extends js.Object {
    var Items: js.UndefOr[__listOfPlaybackConfiguration]
    var NextToken: js.UndefOr[__string]
  }

  object ListPlaybackConfigurationsResponse {
    @inline
    def apply(
        Items: js.UndefOr[__listOfPlaybackConfiguration] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListPlaybackConfigurationsResponse = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPlaybackConfigurationsResponse]
    }
  }

  @js.native
  trait ListPrefetchSchedulesRequest extends js.Object {
    var PlaybackConfigurationName: __string
    var MaxResults: js.UndefOr[__integerMin1Max100]
    var NextToken: js.UndefOr[__string]
    var StreamId: js.UndefOr[__string]
  }

  object ListPrefetchSchedulesRequest {
    @inline
    def apply(
        PlaybackConfigurationName: __string,
        MaxResults: js.UndefOr[__integerMin1Max100] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined,
        StreamId: js.UndefOr[__string] = js.undefined
    ): ListPrefetchSchedulesRequest = {
      val __obj = js.Dynamic.literal(
        "PlaybackConfigurationName" -> PlaybackConfigurationName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StreamId.foreach(__v => __obj.updateDynamic("StreamId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPrefetchSchedulesRequest]
    }
  }

  @js.native
  trait ListPrefetchSchedulesResponse extends js.Object {
    var Items: js.UndefOr[__listOfPrefetchSchedule]
    var NextToken: js.UndefOr[__string]
  }

  object ListPrefetchSchedulesResponse {
    @inline
    def apply(
        Items: js.UndefOr[__listOfPrefetchSchedule] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListPrefetchSchedulesResponse = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPrefetchSchedulesResponse]
    }
  }

  @js.native
  trait ListSourceLocationsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListSourceLocationsRequest {
    @inline
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListSourceLocationsRequest = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSourceLocationsRequest]
    }
  }

  @js.native
  trait ListSourceLocationsResponse extends js.Object {
    var Items: js.UndefOr[__listOfSourceLocation]
    var NextToken: js.UndefOr[__string]
  }

  object ListSourceLocationsResponse {
    @inline
    def apply(
        Items: js.UndefOr[__listOfSourceLocation] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListSourceLocationsResponse = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSourceLocationsResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: __string
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: __string
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[__mapOf__string]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait ListVodSourcesRequest extends js.Object {
    var SourceLocationName: __string
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListVodSourcesRequest {
    @inline
    def apply(
        SourceLocationName: __string,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListVodSourcesRequest = {
      val __obj = js.Dynamic.literal(
        "SourceLocationName" -> SourceLocationName.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVodSourcesRequest]
    }
  }

  @js.native
  trait ListVodSourcesResponse extends js.Object {
    var Items: js.UndefOr[__listOfVodSource]
    var NextToken: js.UndefOr[__string]
  }

  object ListVodSourcesResponse {
    @inline
    def apply(
        Items: js.UndefOr[__listOfVodSource] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListVodSourcesResponse = {
      val __obj = js.Dynamic.literal()
      Items.foreach(__v => __obj.updateDynamic("Items")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVodSourcesResponse]
    }
  }

  /** The configuration for pre-roll ad insertion.
    */
  @js.native
  trait LivePreRollConfiguration extends js.Object {
    var AdDecisionServerUrl: js.UndefOr[__string]
    var MaxDurationSeconds: js.UndefOr[__integer]
  }

  object LivePreRollConfiguration {
    @inline
    def apply(
        AdDecisionServerUrl: js.UndefOr[__string] = js.undefined,
        MaxDurationSeconds: js.UndefOr[__integer] = js.undefined
    ): LivePreRollConfiguration = {
      val __obj = js.Dynamic.literal()
      AdDecisionServerUrl.foreach(__v => __obj.updateDynamic("AdDecisionServerUrl")(__v.asInstanceOf[js.Any]))
      MaxDurationSeconds.foreach(__v => __obj.updateDynamic("MaxDurationSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LivePreRollConfiguration]
    }
  }

  /** Live source configuration parameters.
    */
  @js.native
  trait LiveSource extends js.Object {
    var Arn: __string
    var HttpPackageConfigurations: HttpPackageConfigurations
    var LiveSourceName: __string
    var SourceLocationName: __string
    var CreationTime: js.UndefOr[__timestampUnix]
    var LastModifiedTime: js.UndefOr[__timestampUnix]
    var Tags: js.UndefOr[__mapOf__string]
  }

  object LiveSource {
    @inline
    def apply(
        Arn: __string,
        HttpPackageConfigurations: HttpPackageConfigurations,
        LiveSourceName: __string,
        SourceLocationName: __string,
        CreationTime: js.UndefOr[__timestampUnix] = js.undefined,
        LastModifiedTime: js.UndefOr[__timestampUnix] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): LiveSource = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "HttpPackageConfigurations" -> HttpPackageConfigurations.asInstanceOf[js.Any],
        "LiveSourceName" -> LiveSourceName.asInstanceOf[js.Any],
        "SourceLocationName" -> SourceLocationName.asInstanceOf[js.Any]
      )

      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LiveSource]
    }
  }

  /** Returns Amazon CloudWatch log settings for a playback configuration.
    */
  @js.native
  trait LogConfiguration extends js.Object {
    var PercentEnabled: __integer
  }

  object LogConfiguration {
    @inline
    def apply(
        PercentEnabled: __integer
    ): LogConfiguration = {
      val __obj = js.Dynamic.literal(
        "PercentEnabled" -> PercentEnabled.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[LogConfiguration]
    }
  }

  /** The configuration for manifest processing rules. Manifest processing rules enable customization of the personalized manifests created by MediaTailor.
    */
  @js.native
  trait ManifestProcessingRules extends js.Object {
    var AdMarkerPassthrough: js.UndefOr[AdMarkerPassthrough]
  }

  object ManifestProcessingRules {
    @inline
    def apply(
        AdMarkerPassthrough: js.UndefOr[AdMarkerPassthrough] = js.undefined
    ): ManifestProcessingRules = {
      val __obj = js.Dynamic.literal()
      AdMarkerPassthrough.foreach(__v => __obj.updateDynamic("AdMarkerPassthrough")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ManifestProcessingRules]
    }
  }

  /** A playback configuration. For information about MediaTailor configurations, see [[https://docs.aws.amazon.com/mediatailor/latest/ug/configurations.html|Working with configurations in AWS Elemental MediaTailor]].
    */
  @js.native
  trait PlaybackConfiguration extends js.Object {
    var AdDecisionServerUrl: js.UndefOr[__string]
    var AvailSuppression: js.UndefOr[AvailSuppression]
    var Bumper: js.UndefOr[Bumper]
    var CdnConfiguration: js.UndefOr[CdnConfiguration]
    var ConfigurationAliases: js.UndefOr[ConfigurationAliasesResponse]
    var DashConfiguration: js.UndefOr[DashConfiguration]
    var HlsConfiguration: js.UndefOr[HlsConfiguration]
    var LivePreRollConfiguration: js.UndefOr[LivePreRollConfiguration]
    var LogConfiguration: js.UndefOr[LogConfiguration]
    var ManifestProcessingRules: js.UndefOr[ManifestProcessingRules]
    var Name: js.UndefOr[__string]
    var PersonalizationThresholdSeconds: js.UndefOr[__integerMin1]
    var PlaybackConfigurationArn: js.UndefOr[__string]
    var PlaybackEndpointPrefix: js.UndefOr[__string]
    var SessionInitializationEndpointPrefix: js.UndefOr[__string]
    var SlateAdUrl: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
    var TranscodeProfileName: js.UndefOr[__string]
    var VideoContentSourceUrl: js.UndefOr[__string]
  }

  object PlaybackConfiguration {
    @inline
    def apply(
        AdDecisionServerUrl: js.UndefOr[__string] = js.undefined,
        AvailSuppression: js.UndefOr[AvailSuppression] = js.undefined,
        Bumper: js.UndefOr[Bumper] = js.undefined,
        CdnConfiguration: js.UndefOr[CdnConfiguration] = js.undefined,
        ConfigurationAliases: js.UndefOr[ConfigurationAliasesResponse] = js.undefined,
        DashConfiguration: js.UndefOr[DashConfiguration] = js.undefined,
        HlsConfiguration: js.UndefOr[HlsConfiguration] = js.undefined,
        LivePreRollConfiguration: js.UndefOr[LivePreRollConfiguration] = js.undefined,
        LogConfiguration: js.UndefOr[LogConfiguration] = js.undefined,
        ManifestProcessingRules: js.UndefOr[ManifestProcessingRules] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        PersonalizationThresholdSeconds: js.UndefOr[__integerMin1] = js.undefined,
        PlaybackConfigurationArn: js.UndefOr[__string] = js.undefined,
        PlaybackEndpointPrefix: js.UndefOr[__string] = js.undefined,
        SessionInitializationEndpointPrefix: js.UndefOr[__string] = js.undefined,
        SlateAdUrl: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined,
        TranscodeProfileName: js.UndefOr[__string] = js.undefined,
        VideoContentSourceUrl: js.UndefOr[__string] = js.undefined
    ): PlaybackConfiguration = {
      val __obj = js.Dynamic.literal()
      AdDecisionServerUrl.foreach(__v => __obj.updateDynamic("AdDecisionServerUrl")(__v.asInstanceOf[js.Any]))
      AvailSuppression.foreach(__v => __obj.updateDynamic("AvailSuppression")(__v.asInstanceOf[js.Any]))
      Bumper.foreach(__v => __obj.updateDynamic("Bumper")(__v.asInstanceOf[js.Any]))
      CdnConfiguration.foreach(__v => __obj.updateDynamic("CdnConfiguration")(__v.asInstanceOf[js.Any]))
      ConfigurationAliases.foreach(__v => __obj.updateDynamic("ConfigurationAliases")(__v.asInstanceOf[js.Any]))
      DashConfiguration.foreach(__v => __obj.updateDynamic("DashConfiguration")(__v.asInstanceOf[js.Any]))
      HlsConfiguration.foreach(__v => __obj.updateDynamic("HlsConfiguration")(__v.asInstanceOf[js.Any]))
      LivePreRollConfiguration.foreach(__v => __obj.updateDynamic("LivePreRollConfiguration")(__v.asInstanceOf[js.Any]))
      LogConfiguration.foreach(__v => __obj.updateDynamic("LogConfiguration")(__v.asInstanceOf[js.Any]))
      ManifestProcessingRules.foreach(__v => __obj.updateDynamic("ManifestProcessingRules")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PersonalizationThresholdSeconds.foreach(__v => __obj.updateDynamic("PersonalizationThresholdSeconds")(__v.asInstanceOf[js.Any]))
      PlaybackConfigurationArn.foreach(__v => __obj.updateDynamic("PlaybackConfigurationArn")(__v.asInstanceOf[js.Any]))
      PlaybackEndpointPrefix.foreach(__v => __obj.updateDynamic("PlaybackEndpointPrefix")(__v.asInstanceOf[js.Any]))
      SessionInitializationEndpointPrefix.foreach(__v => __obj.updateDynamic("SessionInitializationEndpointPrefix")(__v.asInstanceOf[js.Any]))
      SlateAdUrl.foreach(__v => __obj.updateDynamic("SlateAdUrl")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TranscodeProfileName.foreach(__v => __obj.updateDynamic("TranscodeProfileName")(__v.asInstanceOf[js.Any]))
      VideoContentSourceUrl.foreach(__v => __obj.updateDynamic("VideoContentSourceUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PlaybackConfiguration]
    }
  }

  /** A complex type that contains settings that determine how and when that MediaTailor places prefetched ads into upcoming ad breaks.
    */
  @js.native
  trait PrefetchConsumption extends js.Object {
    var EndTime: __timestampUnix
    var AvailMatchingCriteria: js.UndefOr[__listOfAvailMatchingCriteria]
    var StartTime: js.UndefOr[__timestampUnix]
  }

  object PrefetchConsumption {
    @inline
    def apply(
        EndTime: __timestampUnix,
        AvailMatchingCriteria: js.UndefOr[__listOfAvailMatchingCriteria] = js.undefined,
        StartTime: js.UndefOr[__timestampUnix] = js.undefined
    ): PrefetchConsumption = {
      val __obj = js.Dynamic.literal(
        "EndTime" -> EndTime.asInstanceOf[js.Any]
      )

      AvailMatchingCriteria.foreach(__v => __obj.updateDynamic("AvailMatchingCriteria")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PrefetchConsumption]
    }
  }

  /** A complex type that contains settings governing when MediaTailor prefetches ads, and which dynamic variables that MediaTailor includes in the request to the ad decision server.
    */
  @js.native
  trait PrefetchRetrieval extends js.Object {
    var EndTime: __timestampUnix
    var DynamicVariables: js.UndefOr[__mapOf__string]
    var StartTime: js.UndefOr[__timestampUnix]
  }

  object PrefetchRetrieval {
    @inline
    def apply(
        EndTime: __timestampUnix,
        DynamicVariables: js.UndefOr[__mapOf__string] = js.undefined,
        StartTime: js.UndefOr[__timestampUnix] = js.undefined
    ): PrefetchRetrieval = {
      val __obj = js.Dynamic.literal(
        "EndTime" -> EndTime.asInstanceOf[js.Any]
      )

      DynamicVariables.foreach(__v => __obj.updateDynamic("DynamicVariables")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PrefetchRetrieval]
    }
  }

  /** A prefetch schedule allows you to tell MediaTailor to fetch and prepare certain ads before an ad break happens. For more information about ad prefetching, see [[https://docs.aws.amazon.com/mediatailor/latest/ug/prefetching-ads.html|Using ad prefetching]] in the <i>MediaTailor User Guide</i>.
    */
  @js.native
  trait PrefetchSchedule extends js.Object {
    var Arn: __string
    var Consumption: PrefetchConsumption
    var Name: __string
    var PlaybackConfigurationName: __string
    var Retrieval: PrefetchRetrieval
    var StreamId: js.UndefOr[__string]
  }

  object PrefetchSchedule {
    @inline
    def apply(
        Arn: __string,
        Consumption: PrefetchConsumption,
        Name: __string,
        PlaybackConfigurationName: __string,
        Retrieval: PrefetchRetrieval,
        StreamId: js.UndefOr[__string] = js.undefined
    ): PrefetchSchedule = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "Consumption" -> Consumption.asInstanceOf[js.Any],
        "Name" -> Name.asInstanceOf[js.Any],
        "PlaybackConfigurationName" -> PlaybackConfigurationName.asInstanceOf[js.Any],
        "Retrieval" -> Retrieval.asInstanceOf[js.Any]
      )

      StreamId.foreach(__v => __obj.updateDynamic("StreamId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PrefetchSchedule]
    }
  }

  @js.native
  trait PutChannelPolicyRequest extends js.Object {
    var ChannelName: __string
    var Policy: __string
  }

  object PutChannelPolicyRequest {
    @inline
    def apply(
        ChannelName: __string,
        Policy: __string
    ): PutChannelPolicyRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelName" -> ChannelName.asInstanceOf[js.Any],
        "Policy" -> Policy.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[PutChannelPolicyRequest]
    }
  }

  @js.native
  trait PutChannelPolicyResponse extends js.Object

  object PutChannelPolicyResponse {
    @inline
    def apply(): PutChannelPolicyResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutChannelPolicyResponse]
    }
  }

  @js.native
  trait PutPlaybackConfigurationRequest extends js.Object {
    var Name: __string
    var AdDecisionServerUrl: js.UndefOr[__string]
    var AvailSuppression: js.UndefOr[AvailSuppression]
    var Bumper: js.UndefOr[Bumper]
    var CdnConfiguration: js.UndefOr[CdnConfiguration]
    var ConfigurationAliases: js.UndefOr[ConfigurationAliasesRequest]
    var DashConfiguration: js.UndefOr[DashConfigurationForPut]
    var LivePreRollConfiguration: js.UndefOr[LivePreRollConfiguration]
    var ManifestProcessingRules: js.UndefOr[ManifestProcessingRules]
    var PersonalizationThresholdSeconds: js.UndefOr[__integerMin1]
    var SlateAdUrl: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
    var TranscodeProfileName: js.UndefOr[__string]
    var VideoContentSourceUrl: js.UndefOr[__string]
  }

  object PutPlaybackConfigurationRequest {
    @inline
    def apply(
        Name: __string,
        AdDecisionServerUrl: js.UndefOr[__string] = js.undefined,
        AvailSuppression: js.UndefOr[AvailSuppression] = js.undefined,
        Bumper: js.UndefOr[Bumper] = js.undefined,
        CdnConfiguration: js.UndefOr[CdnConfiguration] = js.undefined,
        ConfigurationAliases: js.UndefOr[ConfigurationAliasesRequest] = js.undefined,
        DashConfiguration: js.UndefOr[DashConfigurationForPut] = js.undefined,
        LivePreRollConfiguration: js.UndefOr[LivePreRollConfiguration] = js.undefined,
        ManifestProcessingRules: js.UndefOr[ManifestProcessingRules] = js.undefined,
        PersonalizationThresholdSeconds: js.UndefOr[__integerMin1] = js.undefined,
        SlateAdUrl: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined,
        TranscodeProfileName: js.UndefOr[__string] = js.undefined,
        VideoContentSourceUrl: js.UndefOr[__string] = js.undefined
    ): PutPlaybackConfigurationRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      AdDecisionServerUrl.foreach(__v => __obj.updateDynamic("AdDecisionServerUrl")(__v.asInstanceOf[js.Any]))
      AvailSuppression.foreach(__v => __obj.updateDynamic("AvailSuppression")(__v.asInstanceOf[js.Any]))
      Bumper.foreach(__v => __obj.updateDynamic("Bumper")(__v.asInstanceOf[js.Any]))
      CdnConfiguration.foreach(__v => __obj.updateDynamic("CdnConfiguration")(__v.asInstanceOf[js.Any]))
      ConfigurationAliases.foreach(__v => __obj.updateDynamic("ConfigurationAliases")(__v.asInstanceOf[js.Any]))
      DashConfiguration.foreach(__v => __obj.updateDynamic("DashConfiguration")(__v.asInstanceOf[js.Any]))
      LivePreRollConfiguration.foreach(__v => __obj.updateDynamic("LivePreRollConfiguration")(__v.asInstanceOf[js.Any]))
      ManifestProcessingRules.foreach(__v => __obj.updateDynamic("ManifestProcessingRules")(__v.asInstanceOf[js.Any]))
      PersonalizationThresholdSeconds.foreach(__v => __obj.updateDynamic("PersonalizationThresholdSeconds")(__v.asInstanceOf[js.Any]))
      SlateAdUrl.foreach(__v => __obj.updateDynamic("SlateAdUrl")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TranscodeProfileName.foreach(__v => __obj.updateDynamic("TranscodeProfileName")(__v.asInstanceOf[js.Any]))
      VideoContentSourceUrl.foreach(__v => __obj.updateDynamic("VideoContentSourceUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutPlaybackConfigurationRequest]
    }
  }

  @js.native
  trait PutPlaybackConfigurationResponse extends js.Object {
    var AdDecisionServerUrl: js.UndefOr[__string]
    var AvailSuppression: js.UndefOr[AvailSuppression]
    var Bumper: js.UndefOr[Bumper]
    var CdnConfiguration: js.UndefOr[CdnConfiguration]
    var ConfigurationAliases: js.UndefOr[ConfigurationAliasesResponse]
    var DashConfiguration: js.UndefOr[DashConfiguration]
    var HlsConfiguration: js.UndefOr[HlsConfiguration]
    var LivePreRollConfiguration: js.UndefOr[LivePreRollConfiguration]
    var LogConfiguration: js.UndefOr[LogConfiguration]
    var ManifestProcessingRules: js.UndefOr[ManifestProcessingRules]
    var Name: js.UndefOr[__string]
    var PersonalizationThresholdSeconds: js.UndefOr[__integerMin1]
    var PlaybackConfigurationArn: js.UndefOr[__string]
    var PlaybackEndpointPrefix: js.UndefOr[__string]
    var SessionInitializationEndpointPrefix: js.UndefOr[__string]
    var SlateAdUrl: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
    var TranscodeProfileName: js.UndefOr[__string]
    var VideoContentSourceUrl: js.UndefOr[__string]
  }

  object PutPlaybackConfigurationResponse {
    @inline
    def apply(
        AdDecisionServerUrl: js.UndefOr[__string] = js.undefined,
        AvailSuppression: js.UndefOr[AvailSuppression] = js.undefined,
        Bumper: js.UndefOr[Bumper] = js.undefined,
        CdnConfiguration: js.UndefOr[CdnConfiguration] = js.undefined,
        ConfigurationAliases: js.UndefOr[ConfigurationAliasesResponse] = js.undefined,
        DashConfiguration: js.UndefOr[DashConfiguration] = js.undefined,
        HlsConfiguration: js.UndefOr[HlsConfiguration] = js.undefined,
        LivePreRollConfiguration: js.UndefOr[LivePreRollConfiguration] = js.undefined,
        LogConfiguration: js.UndefOr[LogConfiguration] = js.undefined,
        ManifestProcessingRules: js.UndefOr[ManifestProcessingRules] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined,
        PersonalizationThresholdSeconds: js.UndefOr[__integerMin1] = js.undefined,
        PlaybackConfigurationArn: js.UndefOr[__string] = js.undefined,
        PlaybackEndpointPrefix: js.UndefOr[__string] = js.undefined,
        SessionInitializationEndpointPrefix: js.UndefOr[__string] = js.undefined,
        SlateAdUrl: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined,
        TranscodeProfileName: js.UndefOr[__string] = js.undefined,
        VideoContentSourceUrl: js.UndefOr[__string] = js.undefined
    ): PutPlaybackConfigurationResponse = {
      val __obj = js.Dynamic.literal()
      AdDecisionServerUrl.foreach(__v => __obj.updateDynamic("AdDecisionServerUrl")(__v.asInstanceOf[js.Any]))
      AvailSuppression.foreach(__v => __obj.updateDynamic("AvailSuppression")(__v.asInstanceOf[js.Any]))
      Bumper.foreach(__v => __obj.updateDynamic("Bumper")(__v.asInstanceOf[js.Any]))
      CdnConfiguration.foreach(__v => __obj.updateDynamic("CdnConfiguration")(__v.asInstanceOf[js.Any]))
      ConfigurationAliases.foreach(__v => __obj.updateDynamic("ConfigurationAliases")(__v.asInstanceOf[js.Any]))
      DashConfiguration.foreach(__v => __obj.updateDynamic("DashConfiguration")(__v.asInstanceOf[js.Any]))
      HlsConfiguration.foreach(__v => __obj.updateDynamic("HlsConfiguration")(__v.asInstanceOf[js.Any]))
      LivePreRollConfiguration.foreach(__v => __obj.updateDynamic("LivePreRollConfiguration")(__v.asInstanceOf[js.Any]))
      LogConfiguration.foreach(__v => __obj.updateDynamic("LogConfiguration")(__v.asInstanceOf[js.Any]))
      ManifestProcessingRules.foreach(__v => __obj.updateDynamic("ManifestProcessingRules")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      PersonalizationThresholdSeconds.foreach(__v => __obj.updateDynamic("PersonalizationThresholdSeconds")(__v.asInstanceOf[js.Any]))
      PlaybackConfigurationArn.foreach(__v => __obj.updateDynamic("PlaybackConfigurationArn")(__v.asInstanceOf[js.Any]))
      PlaybackEndpointPrefix.foreach(__v => __obj.updateDynamic("PlaybackEndpointPrefix")(__v.asInstanceOf[js.Any]))
      SessionInitializationEndpointPrefix.foreach(__v => __obj.updateDynamic("SessionInitializationEndpointPrefix")(__v.asInstanceOf[js.Any]))
      SlateAdUrl.foreach(__v => __obj.updateDynamic("SlateAdUrl")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      TranscodeProfileName.foreach(__v => __obj.updateDynamic("TranscodeProfileName")(__v.asInstanceOf[js.Any]))
      VideoContentSourceUrl.foreach(__v => __obj.updateDynamic("VideoContentSourceUrl")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutPlaybackConfigurationResponse]
    }
  }

  /** The output configuration for this channel.
    */
  @js.native
  trait RequestOutputItem extends js.Object {
    var ManifestName: __string
    var SourceGroup: __string
    var DashPlaylistSettings: js.UndefOr[DashPlaylistSettings]
    var HlsPlaylistSettings: js.UndefOr[HlsPlaylistSettings]
  }

  object RequestOutputItem {
    @inline
    def apply(
        ManifestName: __string,
        SourceGroup: __string,
        DashPlaylistSettings: js.UndefOr[DashPlaylistSettings] = js.undefined,
        HlsPlaylistSettings: js.UndefOr[HlsPlaylistSettings] = js.undefined
    ): RequestOutputItem = {
      val __obj = js.Dynamic.literal(
        "ManifestName" -> ManifestName.asInstanceOf[js.Any],
        "SourceGroup" -> SourceGroup.asInstanceOf[js.Any]
      )

      DashPlaylistSettings.foreach(__v => __obj.updateDynamic("DashPlaylistSettings")(__v.asInstanceOf[js.Any]))
      HlsPlaylistSettings.foreach(__v => __obj.updateDynamic("HlsPlaylistSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RequestOutputItem]
    }
  }

  /** The output item response.
    */
  @js.native
  trait ResponseOutputItem extends js.Object {
    var ManifestName: __string
    var PlaybackUrl: __string
    var SourceGroup: __string
    var DashPlaylistSettings: js.UndefOr[DashPlaylistSettings]
    var HlsPlaylistSettings: js.UndefOr[HlsPlaylistSettings]
  }

  object ResponseOutputItem {
    @inline
    def apply(
        ManifestName: __string,
        PlaybackUrl: __string,
        SourceGroup: __string,
        DashPlaylistSettings: js.UndefOr[DashPlaylistSettings] = js.undefined,
        HlsPlaylistSettings: js.UndefOr[HlsPlaylistSettings] = js.undefined
    ): ResponseOutputItem = {
      val __obj = js.Dynamic.literal(
        "ManifestName" -> ManifestName.asInstanceOf[js.Any],
        "PlaybackUrl" -> PlaybackUrl.asInstanceOf[js.Any],
        "SourceGroup" -> SourceGroup.asInstanceOf[js.Any]
      )

      DashPlaylistSettings.foreach(__v => __obj.updateDynamic("DashPlaylistSettings")(__v.asInstanceOf[js.Any]))
      HlsPlaylistSettings.foreach(__v => __obj.updateDynamic("HlsPlaylistSettings")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResponseOutputItem]
    }
  }

  /** The schedule's ad break properties.
    */
  @js.native
  trait ScheduleAdBreak extends js.Object {
    var ApproximateDurationSeconds: js.UndefOr[__long]
    var ApproximateStartTime: js.UndefOr[__timestampUnix]
    var SourceLocationName: js.UndefOr[__string]
    var VodSourceName: js.UndefOr[__string]
  }

  object ScheduleAdBreak {
    @inline
    def apply(
        ApproximateDurationSeconds: js.UndefOr[__long] = js.undefined,
        ApproximateStartTime: js.UndefOr[__timestampUnix] = js.undefined,
        SourceLocationName: js.UndefOr[__string] = js.undefined,
        VodSourceName: js.UndefOr[__string] = js.undefined
    ): ScheduleAdBreak = {
      val __obj = js.Dynamic.literal()
      ApproximateDurationSeconds.foreach(__v => __obj.updateDynamic("ApproximateDurationSeconds")(__v.asInstanceOf[js.Any]))
      ApproximateStartTime.foreach(__v => __obj.updateDynamic("ApproximateStartTime")(__v.asInstanceOf[js.Any]))
      SourceLocationName.foreach(__v => __obj.updateDynamic("SourceLocationName")(__v.asInstanceOf[js.Any]))
      VodSourceName.foreach(__v => __obj.updateDynamic("VodSourceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScheduleAdBreak]
    }
  }

  /** Schedule configuration parameters. A channel must be stopped before changes can be made to the schedule.
    */
  @js.native
  trait ScheduleConfiguration extends js.Object {
    var Transition: Transition
  }

  object ScheduleConfiguration {
    @inline
    def apply(
        Transition: Transition
    ): ScheduleConfiguration = {
      val __obj = js.Dynamic.literal(
        "Transition" -> Transition.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ScheduleConfiguration]
    }
  }

  /** The properties for a schedule.
    */
  @js.native
  trait ScheduleEntry extends js.Object {
    var Arn: __string
    var ChannelName: __string
    var ProgramName: __string
    var SourceLocationName: __string
    var ApproximateDurationSeconds: js.UndefOr[__long]
    var ApproximateStartTime: js.UndefOr[__timestampUnix]
    var LiveSourceName: js.UndefOr[__string]
    var ScheduleAdBreaks: js.UndefOr[__listOfScheduleAdBreak]
    var ScheduleEntryType: js.UndefOr[ScheduleEntryType]
    var VodSourceName: js.UndefOr[__string]
  }

  object ScheduleEntry {
    @inline
    def apply(
        Arn: __string,
        ChannelName: __string,
        ProgramName: __string,
        SourceLocationName: __string,
        ApproximateDurationSeconds: js.UndefOr[__long] = js.undefined,
        ApproximateStartTime: js.UndefOr[__timestampUnix] = js.undefined,
        LiveSourceName: js.UndefOr[__string] = js.undefined,
        ScheduleAdBreaks: js.UndefOr[__listOfScheduleAdBreak] = js.undefined,
        ScheduleEntryType: js.UndefOr[ScheduleEntryType] = js.undefined,
        VodSourceName: js.UndefOr[__string] = js.undefined
    ): ScheduleEntry = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "ChannelName" -> ChannelName.asInstanceOf[js.Any],
        "ProgramName" -> ProgramName.asInstanceOf[js.Any],
        "SourceLocationName" -> SourceLocationName.asInstanceOf[js.Any]
      )

      ApproximateDurationSeconds.foreach(__v => __obj.updateDynamic("ApproximateDurationSeconds")(__v.asInstanceOf[js.Any]))
      ApproximateStartTime.foreach(__v => __obj.updateDynamic("ApproximateStartTime")(__v.asInstanceOf[js.Any]))
      LiveSourceName.foreach(__v => __obj.updateDynamic("LiveSourceName")(__v.asInstanceOf[js.Any]))
      ScheduleAdBreaks.foreach(__v => __obj.updateDynamic("ScheduleAdBreaks")(__v.asInstanceOf[js.Any]))
      ScheduleEntryType.foreach(__v => __obj.updateDynamic("ScheduleEntryType")(__v.asInstanceOf[js.Any]))
      VodSourceName.foreach(__v => __obj.updateDynamic("VodSourceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ScheduleEntry]
    }
  }

  /** AWS Secrets Manager access token configuration parameters. For information about Secrets Manager access token authentication, see [[https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-access-configuration-access-token.html|Working with AWS Secrets Manager access token authentication]].
    */
  @js.native
  trait SecretsManagerAccessTokenConfiguration extends js.Object {
    var HeaderName: js.UndefOr[__string]
    var SecretArn: js.UndefOr[__string]
    var SecretStringKey: js.UndefOr[__string]
  }

  object SecretsManagerAccessTokenConfiguration {
    @inline
    def apply(
        HeaderName: js.UndefOr[__string] = js.undefined,
        SecretArn: js.UndefOr[__string] = js.undefined,
        SecretStringKey: js.UndefOr[__string] = js.undefined
    ): SecretsManagerAccessTokenConfiguration = {
      val __obj = js.Dynamic.literal()
      HeaderName.foreach(__v => __obj.updateDynamic("HeaderName")(__v.asInstanceOf[js.Any]))
      SecretArn.foreach(__v => __obj.updateDynamic("SecretArn")(__v.asInstanceOf[js.Any]))
      SecretStringKey.foreach(__v => __obj.updateDynamic("SecretStringKey")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SecretsManagerAccessTokenConfiguration]
    }
  }

  /** The segment delivery configuration settings.
    */
  @js.native
  trait SegmentDeliveryConfiguration extends js.Object {
    var BaseUrl: js.UndefOr[__string]
    var Name: js.UndefOr[__string]
  }

  object SegmentDeliveryConfiguration {
    @inline
    def apply(
        BaseUrl: js.UndefOr[__string] = js.undefined,
        Name: js.UndefOr[__string] = js.undefined
    ): SegmentDeliveryConfiguration = {
      val __obj = js.Dynamic.literal()
      BaseUrl.foreach(__v => __obj.updateDynamic("BaseUrl")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SegmentDeliveryConfiguration]
    }
  }

  /** The <code>segmentation_descriptor</code> message can contain advanced metadata fields, like content identifiers, to convey a wide range of information about the ad break. MediaTailor writes the ad metadata in the egress manifest as part of the <code>EXT-X-DATERANGE</code> or <code>EventStream</code> ad marker's SCTE-35 data. <code>segmentation_descriptor</code> messages must be sent with the <code>time_signal</code> message type. See the <code>segmentation_descriptor()</code> table of the 2022 SCTE-35 specification for more information.
    */
  @js.native
  trait SegmentationDescriptor extends js.Object {
    var SegmentNum: js.UndefOr[Int]
    var SegmentationEventId: js.UndefOr[Int]
    var SegmentationTypeId: js.UndefOr[Int]
    var SegmentationUpid: js.UndefOr[String]
    var SegmentationUpidType: js.UndefOr[Int]
    var SegmentsExpected: js.UndefOr[Int]
    var SubSegmentNum: js.UndefOr[Int]
    var SubSegmentsExpected: js.UndefOr[Int]
  }

  object SegmentationDescriptor {
    @inline
    def apply(
        SegmentNum: js.UndefOr[Int] = js.undefined,
        SegmentationEventId: js.UndefOr[Int] = js.undefined,
        SegmentationTypeId: js.UndefOr[Int] = js.undefined,
        SegmentationUpid: js.UndefOr[String] = js.undefined,
        SegmentationUpidType: js.UndefOr[Int] = js.undefined,
        SegmentsExpected: js.UndefOr[Int] = js.undefined,
        SubSegmentNum: js.UndefOr[Int] = js.undefined,
        SubSegmentsExpected: js.UndefOr[Int] = js.undefined
    ): SegmentationDescriptor = {
      val __obj = js.Dynamic.literal()
      SegmentNum.foreach(__v => __obj.updateDynamic("SegmentNum")(__v.asInstanceOf[js.Any]))
      SegmentationEventId.foreach(__v => __obj.updateDynamic("SegmentationEventId")(__v.asInstanceOf[js.Any]))
      SegmentationTypeId.foreach(__v => __obj.updateDynamic("SegmentationTypeId")(__v.asInstanceOf[js.Any]))
      SegmentationUpid.foreach(__v => __obj.updateDynamic("SegmentationUpid")(__v.asInstanceOf[js.Any]))
      SegmentationUpidType.foreach(__v => __obj.updateDynamic("SegmentationUpidType")(__v.asInstanceOf[js.Any]))
      SegmentsExpected.foreach(__v => __obj.updateDynamic("SegmentsExpected")(__v.asInstanceOf[js.Any]))
      SubSegmentNum.foreach(__v => __obj.updateDynamic("SubSegmentNum")(__v.asInstanceOf[js.Any]))
      SubSegmentsExpected.foreach(__v => __obj.updateDynamic("SubSegmentsExpected")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SegmentationDescriptor]
    }
  }

  /** Slate VOD source configuration.
    */
  @js.native
  trait SlateSource extends js.Object {
    var SourceLocationName: js.UndefOr[__string]
    var VodSourceName: js.UndefOr[__string]
  }

  object SlateSource {
    @inline
    def apply(
        SourceLocationName: js.UndefOr[__string] = js.undefined,
        VodSourceName: js.UndefOr[__string] = js.undefined
    ): SlateSource = {
      val __obj = js.Dynamic.literal()
      SourceLocationName.foreach(__v => __obj.updateDynamic("SourceLocationName")(__v.asInstanceOf[js.Any]))
      VodSourceName.foreach(__v => __obj.updateDynamic("VodSourceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SlateSource]
    }
  }

  /** A source location is a container for sources. For more information about source locations, see [[https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-source-locations.html|Working with source locations]] in the <i>MediaTailor User Guide</i>.
    */
  @js.native
  trait SourceLocation extends js.Object {
    var Arn: __string
    var HttpConfiguration: HttpConfiguration
    var SourceLocationName: __string
    var AccessConfiguration: js.UndefOr[AccessConfiguration]
    var CreationTime: js.UndefOr[__timestampUnix]
    var DefaultSegmentDeliveryConfiguration: js.UndefOr[DefaultSegmentDeliveryConfiguration]
    var LastModifiedTime: js.UndefOr[__timestampUnix]
    var SegmentDeliveryConfigurations: js.UndefOr[__listOfSegmentDeliveryConfiguration]
    var Tags: js.UndefOr[__mapOf__string]
  }

  object SourceLocation {
    @inline
    def apply(
        Arn: __string,
        HttpConfiguration: HttpConfiguration,
        SourceLocationName: __string,
        AccessConfiguration: js.UndefOr[AccessConfiguration] = js.undefined,
        CreationTime: js.UndefOr[__timestampUnix] = js.undefined,
        DefaultSegmentDeliveryConfiguration: js.UndefOr[DefaultSegmentDeliveryConfiguration] = js.undefined,
        LastModifiedTime: js.UndefOr[__timestampUnix] = js.undefined,
        SegmentDeliveryConfigurations: js.UndefOr[__listOfSegmentDeliveryConfiguration] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): SourceLocation = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "HttpConfiguration" -> HttpConfiguration.asInstanceOf[js.Any],
        "SourceLocationName" -> SourceLocationName.asInstanceOf[js.Any]
      )

      AccessConfiguration.foreach(__v => __obj.updateDynamic("AccessConfiguration")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DefaultSegmentDeliveryConfiguration.foreach(__v => __obj.updateDynamic("DefaultSegmentDeliveryConfiguration")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      SegmentDeliveryConfigurations.foreach(__v => __obj.updateDynamic("SegmentDeliveryConfigurations")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SourceLocation]
    }
  }

  /** Splice insert message configuration.
    */
  @js.native
  trait SpliceInsertMessage extends js.Object {
    var AvailNum: js.UndefOr[__integer]
    var AvailsExpected: js.UndefOr[__integer]
    var SpliceEventId: js.UndefOr[__integer]
    var UniqueProgramId: js.UndefOr[__integer]
  }

  object SpliceInsertMessage {
    @inline
    def apply(
        AvailNum: js.UndefOr[__integer] = js.undefined,
        AvailsExpected: js.UndefOr[__integer] = js.undefined,
        SpliceEventId: js.UndefOr[__integer] = js.undefined,
        UniqueProgramId: js.UndefOr[__integer] = js.undefined
    ): SpliceInsertMessage = {
      val __obj = js.Dynamic.literal()
      AvailNum.foreach(__v => __obj.updateDynamic("AvailNum")(__v.asInstanceOf[js.Any]))
      AvailsExpected.foreach(__v => __obj.updateDynamic("AvailsExpected")(__v.asInstanceOf[js.Any]))
      SpliceEventId.foreach(__v => __obj.updateDynamic("SpliceEventId")(__v.asInstanceOf[js.Any]))
      UniqueProgramId.foreach(__v => __obj.updateDynamic("UniqueProgramId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SpliceInsertMessage]
    }
  }

  @js.native
  trait StartChannelRequest extends js.Object {
    var ChannelName: __string
  }

  object StartChannelRequest {
    @inline
    def apply(
        ChannelName: __string
    ): StartChannelRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelName" -> ChannelName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StartChannelRequest]
    }
  }

  @js.native
  trait StartChannelResponse extends js.Object

  object StartChannelResponse {
    @inline
    def apply(): StartChannelResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartChannelResponse]
    }
  }

  @js.native
  trait StopChannelRequest extends js.Object {
    var ChannelName: __string
  }

  object StopChannelRequest {
    @inline
    def apply(
        ChannelName: __string
    ): StopChannelRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelName" -> ChannelName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[StopChannelRequest]
    }
  }

  @js.native
  trait StopChannelResponse extends js.Object

  object StopChannelResponse {
    @inline
    def apply(): StopChannelResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StopChannelResponse]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: __string
    var Tags: __mapOf__string
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: __string,
        Tags: __mapOf__string
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  /** The SCTE-35 <code>time_signal</code> message can be sent with one or more <code>segmentation_descriptor</code> messages. A <code>time_signal</code> message can be sent only if a single <code>segmentation_descriptor</code> message is sent. The <code>time_signal</code> message contains only the <code>splice_time</code> field which is constructed using a given presentation timestamp. When sending a <code>time_signal</code> message, the <code>splice_command_type</code> field in the <code>splice_info_section</code> message is set to 6 (0x06). See the <code>time_signal()</code> table of the 2022 SCTE-35 specification for more information.
    */
  @js.native
  trait TimeSignalMessage extends js.Object {
    var SegmentationDescriptors: js.UndefOr[SegmentationDescriptorList]
  }

  object TimeSignalMessage {
    @inline
    def apply(
        SegmentationDescriptors: js.UndefOr[SegmentationDescriptorList] = js.undefined
    ): TimeSignalMessage = {
      val __obj = js.Dynamic.literal()
      SegmentationDescriptors.foreach(__v => __obj.updateDynamic("SegmentationDescriptors")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TimeSignalMessage]
    }
  }

  /** Program transition configuration.
    */
  @js.native
  trait Transition extends js.Object {
    var RelativePosition: RelativePosition
    var Type: __string
    var DurationMillis: js.UndefOr[__long]
    var RelativeProgram: js.UndefOr[__string]
    var ScheduledStartTimeMillis: js.UndefOr[__long]
  }

  object Transition {
    @inline
    def apply(
        RelativePosition: RelativePosition,
        Type: __string,
        DurationMillis: js.UndefOr[__long] = js.undefined,
        RelativeProgram: js.UndefOr[__string] = js.undefined,
        ScheduledStartTimeMillis: js.UndefOr[__long] = js.undefined
    ): Transition = {
      val __obj = js.Dynamic.literal(
        "RelativePosition" -> RelativePosition.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      DurationMillis.foreach(__v => __obj.updateDynamic("DurationMillis")(__v.asInstanceOf[js.Any]))
      RelativeProgram.foreach(__v => __obj.updateDynamic("RelativeProgram")(__v.asInstanceOf[js.Any]))
      ScheduledStartTimeMillis.foreach(__v => __obj.updateDynamic("ScheduledStartTimeMillis")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Transition]
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

  @js.native
  trait UpdateChannelRequest extends js.Object {
    var ChannelName: __string
    var Outputs: RequestOutputs
    var FillerSlate: js.UndefOr[SlateSource]
  }

  object UpdateChannelRequest {
    @inline
    def apply(
        ChannelName: __string,
        Outputs: RequestOutputs,
        FillerSlate: js.UndefOr[SlateSource] = js.undefined
    ): UpdateChannelRequest = {
      val __obj = js.Dynamic.literal(
        "ChannelName" -> ChannelName.asInstanceOf[js.Any],
        "Outputs" -> Outputs.asInstanceOf[js.Any]
      )

      FillerSlate.foreach(__v => __obj.updateDynamic("FillerSlate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateChannelRequest]
    }
  }

  @js.native
  trait UpdateChannelResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var ChannelName: js.UndefOr[__string]
    var ChannelState: js.UndefOr[ChannelState]
    var CreationTime: js.UndefOr[__timestampUnix]
    var FillerSlate: js.UndefOr[SlateSource]
    var LastModifiedTime: js.UndefOr[__timestampUnix]
    var Outputs: js.UndefOr[ResponseOutputs]
    var PlaybackMode: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
    var Tier: js.UndefOr[__string]
  }

  object UpdateChannelResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        ChannelName: js.UndefOr[__string] = js.undefined,
        ChannelState: js.UndefOr[ChannelState] = js.undefined,
        CreationTime: js.UndefOr[__timestampUnix] = js.undefined,
        FillerSlate: js.UndefOr[SlateSource] = js.undefined,
        LastModifiedTime: js.UndefOr[__timestampUnix] = js.undefined,
        Outputs: js.UndefOr[ResponseOutputs] = js.undefined,
        PlaybackMode: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined,
        Tier: js.UndefOr[__string] = js.undefined
    ): UpdateChannelResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      ChannelName.foreach(__v => __obj.updateDynamic("ChannelName")(__v.asInstanceOf[js.Any]))
      ChannelState.foreach(__v => __obj.updateDynamic("ChannelState")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      FillerSlate.foreach(__v => __obj.updateDynamic("FillerSlate")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Outputs.foreach(__v => __obj.updateDynamic("Outputs")(__v.asInstanceOf[js.Any]))
      PlaybackMode.foreach(__v => __obj.updateDynamic("PlaybackMode")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Tier.foreach(__v => __obj.updateDynamic("Tier")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateChannelResponse]
    }
  }

  @js.native
  trait UpdateLiveSourceRequest extends js.Object {
    var HttpPackageConfigurations: HttpPackageConfigurations
    var LiveSourceName: __string
    var SourceLocationName: __string
  }

  object UpdateLiveSourceRequest {
    @inline
    def apply(
        HttpPackageConfigurations: HttpPackageConfigurations,
        LiveSourceName: __string,
        SourceLocationName: __string
    ): UpdateLiveSourceRequest = {
      val __obj = js.Dynamic.literal(
        "HttpPackageConfigurations" -> HttpPackageConfigurations.asInstanceOf[js.Any],
        "LiveSourceName" -> LiveSourceName.asInstanceOf[js.Any],
        "SourceLocationName" -> SourceLocationName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateLiveSourceRequest]
    }
  }

  @js.native
  trait UpdateLiveSourceResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTime: js.UndefOr[__timestampUnix]
    var HttpPackageConfigurations: js.UndefOr[HttpPackageConfigurations]
    var LastModifiedTime: js.UndefOr[__timestampUnix]
    var LiveSourceName: js.UndefOr[__string]
    var SourceLocationName: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
  }

  object UpdateLiveSourceResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTime: js.UndefOr[__timestampUnix] = js.undefined,
        HttpPackageConfigurations: js.UndefOr[HttpPackageConfigurations] = js.undefined,
        LastModifiedTime: js.UndefOr[__timestampUnix] = js.undefined,
        LiveSourceName: js.UndefOr[__string] = js.undefined,
        SourceLocationName: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): UpdateLiveSourceResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      HttpPackageConfigurations.foreach(__v => __obj.updateDynamic("HttpPackageConfigurations")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      LiveSourceName.foreach(__v => __obj.updateDynamic("LiveSourceName")(__v.asInstanceOf[js.Any]))
      SourceLocationName.foreach(__v => __obj.updateDynamic("SourceLocationName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateLiveSourceResponse]
    }
  }

  @js.native
  trait UpdateSourceLocationRequest extends js.Object {
    var HttpConfiguration: HttpConfiguration
    var SourceLocationName: __string
    var AccessConfiguration: js.UndefOr[AccessConfiguration]
    var DefaultSegmentDeliveryConfiguration: js.UndefOr[DefaultSegmentDeliveryConfiguration]
    var SegmentDeliveryConfigurations: js.UndefOr[__listOfSegmentDeliveryConfiguration]
  }

  object UpdateSourceLocationRequest {
    @inline
    def apply(
        HttpConfiguration: HttpConfiguration,
        SourceLocationName: __string,
        AccessConfiguration: js.UndefOr[AccessConfiguration] = js.undefined,
        DefaultSegmentDeliveryConfiguration: js.UndefOr[DefaultSegmentDeliveryConfiguration] = js.undefined,
        SegmentDeliveryConfigurations: js.UndefOr[__listOfSegmentDeliveryConfiguration] = js.undefined
    ): UpdateSourceLocationRequest = {
      val __obj = js.Dynamic.literal(
        "HttpConfiguration" -> HttpConfiguration.asInstanceOf[js.Any],
        "SourceLocationName" -> SourceLocationName.asInstanceOf[js.Any]
      )

      AccessConfiguration.foreach(__v => __obj.updateDynamic("AccessConfiguration")(__v.asInstanceOf[js.Any]))
      DefaultSegmentDeliveryConfiguration.foreach(__v => __obj.updateDynamic("DefaultSegmentDeliveryConfiguration")(__v.asInstanceOf[js.Any]))
      SegmentDeliveryConfigurations.foreach(__v => __obj.updateDynamic("SegmentDeliveryConfigurations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSourceLocationRequest]
    }
  }

  @js.native
  trait UpdateSourceLocationResponse extends js.Object {
    var AccessConfiguration: js.UndefOr[AccessConfiguration]
    var Arn: js.UndefOr[__string]
    var CreationTime: js.UndefOr[__timestampUnix]
    var DefaultSegmentDeliveryConfiguration: js.UndefOr[DefaultSegmentDeliveryConfiguration]
    var HttpConfiguration: js.UndefOr[HttpConfiguration]
    var LastModifiedTime: js.UndefOr[__timestampUnix]
    var SegmentDeliveryConfigurations: js.UndefOr[__listOfSegmentDeliveryConfiguration]
    var SourceLocationName: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
  }

  object UpdateSourceLocationResponse {
    @inline
    def apply(
        AccessConfiguration: js.UndefOr[AccessConfiguration] = js.undefined,
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTime: js.UndefOr[__timestampUnix] = js.undefined,
        DefaultSegmentDeliveryConfiguration: js.UndefOr[DefaultSegmentDeliveryConfiguration] = js.undefined,
        HttpConfiguration: js.UndefOr[HttpConfiguration] = js.undefined,
        LastModifiedTime: js.UndefOr[__timestampUnix] = js.undefined,
        SegmentDeliveryConfigurations: js.UndefOr[__listOfSegmentDeliveryConfiguration] = js.undefined,
        SourceLocationName: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): UpdateSourceLocationResponse = {
      val __obj = js.Dynamic.literal()
      AccessConfiguration.foreach(__v => __obj.updateDynamic("AccessConfiguration")(__v.asInstanceOf[js.Any]))
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DefaultSegmentDeliveryConfiguration.foreach(__v => __obj.updateDynamic("DefaultSegmentDeliveryConfiguration")(__v.asInstanceOf[js.Any]))
      HttpConfiguration.foreach(__v => __obj.updateDynamic("HttpConfiguration")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      SegmentDeliveryConfigurations.foreach(__v => __obj.updateDynamic("SegmentDeliveryConfigurations")(__v.asInstanceOf[js.Any]))
      SourceLocationName.foreach(__v => __obj.updateDynamic("SourceLocationName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSourceLocationResponse]
    }
  }

  @js.native
  trait UpdateVodSourceRequest extends js.Object {
    var HttpPackageConfigurations: HttpPackageConfigurations
    var SourceLocationName: __string
    var VodSourceName: __string
  }

  object UpdateVodSourceRequest {
    @inline
    def apply(
        HttpPackageConfigurations: HttpPackageConfigurations,
        SourceLocationName: __string,
        VodSourceName: __string
    ): UpdateVodSourceRequest = {
      val __obj = js.Dynamic.literal(
        "HttpPackageConfigurations" -> HttpPackageConfigurations.asInstanceOf[js.Any],
        "SourceLocationName" -> SourceLocationName.asInstanceOf[js.Any],
        "VodSourceName" -> VodSourceName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateVodSourceRequest]
    }
  }

  @js.native
  trait UpdateVodSourceResponse extends js.Object {
    var Arn: js.UndefOr[__string]
    var CreationTime: js.UndefOr[__timestampUnix]
    var HttpPackageConfigurations: js.UndefOr[HttpPackageConfigurations]
    var LastModifiedTime: js.UndefOr[__timestampUnix]
    var SourceLocationName: js.UndefOr[__string]
    var Tags: js.UndefOr[__mapOf__string]
    var VodSourceName: js.UndefOr[__string]
  }

  object UpdateVodSourceResponse {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        CreationTime: js.UndefOr[__timestampUnix] = js.undefined,
        HttpPackageConfigurations: js.UndefOr[HttpPackageConfigurations] = js.undefined,
        LastModifiedTime: js.UndefOr[__timestampUnix] = js.undefined,
        SourceLocationName: js.UndefOr[__string] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined,
        VodSourceName: js.UndefOr[__string] = js.undefined
    ): UpdateVodSourceResponse = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      HttpPackageConfigurations.foreach(__v => __obj.updateDynamic("HttpPackageConfigurations")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      SourceLocationName.foreach(__v => __obj.updateDynamic("SourceLocationName")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      VodSourceName.foreach(__v => __obj.updateDynamic("VodSourceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVodSourceResponse]
    }
  }

  /** VOD source configuration parameters.
    */
  @js.native
  trait VodSource extends js.Object {
    var Arn: __string
    var HttpPackageConfigurations: HttpPackageConfigurations
    var SourceLocationName: __string
    var VodSourceName: __string
    var CreationTime: js.UndefOr[__timestampUnix]
    var LastModifiedTime: js.UndefOr[__timestampUnix]
    var Tags: js.UndefOr[__mapOf__string]
  }

  object VodSource {
    @inline
    def apply(
        Arn: __string,
        HttpPackageConfigurations: HttpPackageConfigurations,
        SourceLocationName: __string,
        VodSourceName: __string,
        CreationTime: js.UndefOr[__timestampUnix] = js.undefined,
        LastModifiedTime: js.UndefOr[__timestampUnix] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): VodSource = {
      val __obj = js.Dynamic.literal(
        "Arn" -> Arn.asInstanceOf[js.Any],
        "HttpPackageConfigurations" -> HttpPackageConfigurations.asInstanceOf[js.Any],
        "SourceLocationName" -> SourceLocationName.asInstanceOf[js.Any],
        "VodSourceName" -> VodSourceName.asInstanceOf[js.Any]
      )

      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      LastModifiedTime.foreach(__v => __obj.updateDynamic("LastModifiedTime")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VodSource]
    }
  }
}
