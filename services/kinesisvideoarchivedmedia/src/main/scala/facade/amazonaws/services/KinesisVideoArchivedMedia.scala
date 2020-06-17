package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object kinesisvideoarchivedmedia {
  type ContentType             = String
  type DASHStreamingSessionURL = String
  type Expires                 = Int
  type FragmentList            = js.Array[Fragment]
  type FragmentNumberList      = js.Array[FragmentNumberString]
  type FragmentNumberString    = String
  type HLSStreamingSessionURL  = String
  type PageLimit               = Double
  type Payload                 = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type ResourceARN             = String
  type StreamName              = String
  type Timestamp               = js.Date

  implicit final class KinesisVideoArchivedMediaOps(private val service: KinesisVideoArchivedMedia) extends AnyVal {

    @inline def getDASHStreamingSessionURLFuture(
        params: GetDASHStreamingSessionURLInput
    ): Future[GetDASHStreamingSessionURLOutput] = service.getDASHStreamingSessionURL(params).promise.toFuture
    @inline def getHLSStreamingSessionURLFuture(
        params: GetHLSStreamingSessionURLInput
    ): Future[GetHLSStreamingSessionURLOutput] = service.getHLSStreamingSessionURL(params).promise.toFuture
    @inline def getMediaForFragmentListFuture(
        params: GetMediaForFragmentListInput
    ): Future[GetMediaForFragmentListOutput] = service.getMediaForFragmentList(params).promise.toFuture
    @inline def listFragmentsFuture(params: ListFragmentsInput): Future[ListFragmentsOutput] =
      service.listFragments(params).promise.toFuture
  }
}

package kinesisvideoarchivedmedia {
  @js.native
  @JSImport("aws-sdk", "KinesisVideoArchivedMedia")
  class KinesisVideoArchivedMedia() extends js.Object {
    def this(config: AWSConfig) = this()

    def getDASHStreamingSessionURL(params: GetDASHStreamingSessionURLInput): Request[GetDASHStreamingSessionURLOutput] =
      js.native
    def getHLSStreamingSessionURL(params: GetHLSStreamingSessionURLInput): Request[GetHLSStreamingSessionURLOutput] =
      js.native
    def getMediaForFragmentList(params: GetMediaForFragmentListInput): Request[GetMediaForFragmentListOutput] =
      js.native
    def listFragments(params: ListFragmentsInput): Request[ListFragmentsOutput] = js.native
  }

  @js.native
  sealed trait ContainerFormat extends js.Any
  object ContainerFormat extends js.Object {
    val FRAGMENTED_MP4 = "FRAGMENTED_MP4".asInstanceOf[ContainerFormat]
    val MPEG_TS        = "MPEG_TS".asInstanceOf[ContainerFormat]

    val values = js.Object.freeze(js.Array(FRAGMENTED_MP4, MPEG_TS))
  }

  @js.native
  sealed trait DASHDisplayFragmentNumber extends js.Any
  object DASHDisplayFragmentNumber extends js.Object {
    val ALWAYS = "ALWAYS".asInstanceOf[DASHDisplayFragmentNumber]
    val NEVER  = "NEVER".asInstanceOf[DASHDisplayFragmentNumber]

    val values = js.Object.freeze(js.Array(ALWAYS, NEVER))
  }

  @js.native
  sealed trait DASHDisplayFragmentTimestamp extends js.Any
  object DASHDisplayFragmentTimestamp extends js.Object {
    val ALWAYS = "ALWAYS".asInstanceOf[DASHDisplayFragmentTimestamp]
    val NEVER  = "NEVER".asInstanceOf[DASHDisplayFragmentTimestamp]

    val values = js.Object.freeze(js.Array(ALWAYS, NEVER))
  }

  /**
    * Contains the range of timestamps for the requested media, and the source of the timestamps.
    */
  @js.native
  trait DASHFragmentSelector extends js.Object {
    var FragmentSelectorType: js.UndefOr[DASHFragmentSelectorType]
    var TimestampRange: js.UndefOr[DASHTimestampRange]
  }

  object DASHFragmentSelector {
    @inline
    def apply(
        FragmentSelectorType: js.UndefOr[DASHFragmentSelectorType] = js.undefined,
        TimestampRange: js.UndefOr[DASHTimestampRange] = js.undefined
    ): DASHFragmentSelector = {
      val __obj = js.Dynamic.literal()
      FragmentSelectorType.foreach(__v => __obj.updateDynamic("FragmentSelectorType")(__v.asInstanceOf[js.Any]))
      TimestampRange.foreach(__v => __obj.updateDynamic("TimestampRange")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DASHFragmentSelector]
    }
  }

  @js.native
  sealed trait DASHFragmentSelectorType extends js.Any
  object DASHFragmentSelectorType extends js.Object {
    val PRODUCER_TIMESTAMP = "PRODUCER_TIMESTAMP".asInstanceOf[DASHFragmentSelectorType]
    val SERVER_TIMESTAMP   = "SERVER_TIMESTAMP".asInstanceOf[DASHFragmentSelectorType]

    val values = js.Object.freeze(js.Array(PRODUCER_TIMESTAMP, SERVER_TIMESTAMP))
  }

  @js.native
  sealed trait DASHPlaybackMode extends js.Any
  object DASHPlaybackMode extends js.Object {
    val LIVE        = "LIVE".asInstanceOf[DASHPlaybackMode]
    val LIVE_REPLAY = "LIVE_REPLAY".asInstanceOf[DASHPlaybackMode]
    val ON_DEMAND   = "ON_DEMAND".asInstanceOf[DASHPlaybackMode]

    val values = js.Object.freeze(js.Array(LIVE, LIVE_REPLAY, ON_DEMAND))
  }

  /**
    * The start and end of the timestamp range for the requested media.
    *  This value should not be present if <code>PlaybackType</code> is <code>LIVE</code>.
    *
    * '''Note:'''The values in the <code>DASHimestampRange</code> are inclusive. Fragments that begin before the start time but continue past it, or fragments that begin before the end time but continue past it, are included in the session.
    */
  @js.native
  trait DASHTimestampRange extends js.Object {
    var EndTimestamp: js.UndefOr[Timestamp]
    var StartTimestamp: js.UndefOr[Timestamp]
  }

  object DASHTimestampRange {
    @inline
    def apply(
        EndTimestamp: js.UndefOr[Timestamp] = js.undefined,
        StartTimestamp: js.UndefOr[Timestamp] = js.undefined
    ): DASHTimestampRange = {
      val __obj = js.Dynamic.literal()
      EndTimestamp.foreach(__v => __obj.updateDynamic("EndTimestamp")(__v.asInstanceOf[js.Any]))
      StartTimestamp.foreach(__v => __obj.updateDynamic("StartTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DASHTimestampRange]
    }
  }

  /**
    * Represents a segment of video or other time-delimited data.
    */
  @js.native
  trait Fragment extends js.Object {
    var FragmentLengthInMilliseconds: js.UndefOr[Double]
    var FragmentNumber: js.UndefOr[String]
    var FragmentSizeInBytes: js.UndefOr[Double]
    var ProducerTimestamp: js.UndefOr[Timestamp]
    var ServerTimestamp: js.UndefOr[Timestamp]
  }

  object Fragment {
    @inline
    def apply(
        FragmentLengthInMilliseconds: js.UndefOr[Double] = js.undefined,
        FragmentNumber: js.UndefOr[String] = js.undefined,
        FragmentSizeInBytes: js.UndefOr[Double] = js.undefined,
        ProducerTimestamp: js.UndefOr[Timestamp] = js.undefined,
        ServerTimestamp: js.UndefOr[Timestamp] = js.undefined
    ): Fragment = {
      val __obj = js.Dynamic.literal()
      FragmentLengthInMilliseconds.foreach(__v =>
        __obj.updateDynamic("FragmentLengthInMilliseconds")(__v.asInstanceOf[js.Any])
      )
      FragmentNumber.foreach(__v => __obj.updateDynamic("FragmentNumber")(__v.asInstanceOf[js.Any]))
      FragmentSizeInBytes.foreach(__v => __obj.updateDynamic("FragmentSizeInBytes")(__v.asInstanceOf[js.Any]))
      ProducerTimestamp.foreach(__v => __obj.updateDynamic("ProducerTimestamp")(__v.asInstanceOf[js.Any]))
      ServerTimestamp.foreach(__v => __obj.updateDynamic("ServerTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Fragment]
    }
  }

  /**
    * Describes the timestamp range and timestamp origin of a range of fragments.
    *  Only fragments with a start timestamp greater than or equal to the given start time and less than or equal to the end time are returned. For example, if a stream contains fragments with the following start timestamps:
    * * 00:00:00
    *  * 00:00:02
    *  * 00:00:04
    *  * 00:00:06
    * A fragment selector range with a start time of 00:00:01 and end time of 00:00:04 would return the fragments with start times of 00:00:02 and 00:00:04.
    */
  @js.native
  trait FragmentSelector extends js.Object {
    var FragmentSelectorType: FragmentSelectorType
    var TimestampRange: TimestampRange
  }

  object FragmentSelector {
    @inline
    def apply(
        FragmentSelectorType: FragmentSelectorType,
        TimestampRange: TimestampRange
    ): FragmentSelector = {
      val __obj = js.Dynamic.literal(
        "FragmentSelectorType" -> FragmentSelectorType.asInstanceOf[js.Any],
        "TimestampRange"       -> TimestampRange.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[FragmentSelector]
    }
  }

  @js.native
  sealed trait FragmentSelectorType extends js.Any
  object FragmentSelectorType extends js.Object {
    val PRODUCER_TIMESTAMP = "PRODUCER_TIMESTAMP".asInstanceOf[FragmentSelectorType]
    val SERVER_TIMESTAMP   = "SERVER_TIMESTAMP".asInstanceOf[FragmentSelectorType]

    val values = js.Object.freeze(js.Array(PRODUCER_TIMESTAMP, SERVER_TIMESTAMP))
  }

  @js.native
  trait GetDASHStreamingSessionURLInput extends js.Object {
    var DASHFragmentSelector: js.UndefOr[DASHFragmentSelector]
    var DisplayFragmentNumber: js.UndefOr[DASHDisplayFragmentNumber]
    var DisplayFragmentTimestamp: js.UndefOr[DASHDisplayFragmentTimestamp]
    var Expires: js.UndefOr[Expires]
    var MaxManifestFragmentResults: js.UndefOr[PageLimit]
    var PlaybackMode: js.UndefOr[DASHPlaybackMode]
    var StreamARN: js.UndefOr[ResourceARN]
    var StreamName: js.UndefOr[StreamName]
  }

  object GetDASHStreamingSessionURLInput {
    @inline
    def apply(
        DASHFragmentSelector: js.UndefOr[DASHFragmentSelector] = js.undefined,
        DisplayFragmentNumber: js.UndefOr[DASHDisplayFragmentNumber] = js.undefined,
        DisplayFragmentTimestamp: js.UndefOr[DASHDisplayFragmentTimestamp] = js.undefined,
        Expires: js.UndefOr[Expires] = js.undefined,
        MaxManifestFragmentResults: js.UndefOr[PageLimit] = js.undefined,
        PlaybackMode: js.UndefOr[DASHPlaybackMode] = js.undefined,
        StreamARN: js.UndefOr[ResourceARN] = js.undefined,
        StreamName: js.UndefOr[StreamName] = js.undefined
    ): GetDASHStreamingSessionURLInput = {
      val __obj = js.Dynamic.literal()
      DASHFragmentSelector.foreach(__v => __obj.updateDynamic("DASHFragmentSelector")(__v.asInstanceOf[js.Any]))
      DisplayFragmentNumber.foreach(__v => __obj.updateDynamic("DisplayFragmentNumber")(__v.asInstanceOf[js.Any]))
      DisplayFragmentTimestamp.foreach(__v => __obj.updateDynamic("DisplayFragmentTimestamp")(__v.asInstanceOf[js.Any]))
      Expires.foreach(__v => __obj.updateDynamic("Expires")(__v.asInstanceOf[js.Any]))
      MaxManifestFragmentResults.foreach(__v =>
        __obj.updateDynamic("MaxManifestFragmentResults")(__v.asInstanceOf[js.Any])
      )
      PlaybackMode.foreach(__v => __obj.updateDynamic("PlaybackMode")(__v.asInstanceOf[js.Any]))
      StreamARN.foreach(__v => __obj.updateDynamic("StreamARN")(__v.asInstanceOf[js.Any]))
      StreamName.foreach(__v => __obj.updateDynamic("StreamName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDASHStreamingSessionURLInput]
    }
  }

  @js.native
  trait GetDASHStreamingSessionURLOutput extends js.Object {
    var DASHStreamingSessionURL: js.UndefOr[DASHStreamingSessionURL]
  }

  object GetDASHStreamingSessionURLOutput {
    @inline
    def apply(
        DASHStreamingSessionURL: js.UndefOr[DASHStreamingSessionURL] = js.undefined
    ): GetDASHStreamingSessionURLOutput = {
      val __obj = js.Dynamic.literal()
      DASHStreamingSessionURL.foreach(__v => __obj.updateDynamic("DASHStreamingSessionURL")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDASHStreamingSessionURLOutput]
    }
  }

  @js.native
  trait GetHLSStreamingSessionURLInput extends js.Object {
    var ContainerFormat: js.UndefOr[ContainerFormat]
    var DiscontinuityMode: js.UndefOr[HLSDiscontinuityMode]
    var DisplayFragmentTimestamp: js.UndefOr[HLSDisplayFragmentTimestamp]
    var Expires: js.UndefOr[Expires]
    var HLSFragmentSelector: js.UndefOr[HLSFragmentSelector]
    var MaxMediaPlaylistFragmentResults: js.UndefOr[PageLimit]
    var PlaybackMode: js.UndefOr[HLSPlaybackMode]
    var StreamARN: js.UndefOr[ResourceARN]
    var StreamName: js.UndefOr[StreamName]
  }

  object GetHLSStreamingSessionURLInput {
    @inline
    def apply(
        ContainerFormat: js.UndefOr[ContainerFormat] = js.undefined,
        DiscontinuityMode: js.UndefOr[HLSDiscontinuityMode] = js.undefined,
        DisplayFragmentTimestamp: js.UndefOr[HLSDisplayFragmentTimestamp] = js.undefined,
        Expires: js.UndefOr[Expires] = js.undefined,
        HLSFragmentSelector: js.UndefOr[HLSFragmentSelector] = js.undefined,
        MaxMediaPlaylistFragmentResults: js.UndefOr[PageLimit] = js.undefined,
        PlaybackMode: js.UndefOr[HLSPlaybackMode] = js.undefined,
        StreamARN: js.UndefOr[ResourceARN] = js.undefined,
        StreamName: js.UndefOr[StreamName] = js.undefined
    ): GetHLSStreamingSessionURLInput = {
      val __obj = js.Dynamic.literal()
      ContainerFormat.foreach(__v => __obj.updateDynamic("ContainerFormat")(__v.asInstanceOf[js.Any]))
      DiscontinuityMode.foreach(__v => __obj.updateDynamic("DiscontinuityMode")(__v.asInstanceOf[js.Any]))
      DisplayFragmentTimestamp.foreach(__v => __obj.updateDynamic("DisplayFragmentTimestamp")(__v.asInstanceOf[js.Any]))
      Expires.foreach(__v => __obj.updateDynamic("Expires")(__v.asInstanceOf[js.Any]))
      HLSFragmentSelector.foreach(__v => __obj.updateDynamic("HLSFragmentSelector")(__v.asInstanceOf[js.Any]))
      MaxMediaPlaylistFragmentResults.foreach(__v =>
        __obj.updateDynamic("MaxMediaPlaylistFragmentResults")(__v.asInstanceOf[js.Any])
      )
      PlaybackMode.foreach(__v => __obj.updateDynamic("PlaybackMode")(__v.asInstanceOf[js.Any]))
      StreamARN.foreach(__v => __obj.updateDynamic("StreamARN")(__v.asInstanceOf[js.Any]))
      StreamName.foreach(__v => __obj.updateDynamic("StreamName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetHLSStreamingSessionURLInput]
    }
  }

  @js.native
  trait GetHLSStreamingSessionURLOutput extends js.Object {
    var HLSStreamingSessionURL: js.UndefOr[HLSStreamingSessionURL]
  }

  object GetHLSStreamingSessionURLOutput {
    @inline
    def apply(
        HLSStreamingSessionURL: js.UndefOr[HLSStreamingSessionURL] = js.undefined
    ): GetHLSStreamingSessionURLOutput = {
      val __obj = js.Dynamic.literal()
      HLSStreamingSessionURL.foreach(__v => __obj.updateDynamic("HLSStreamingSessionURL")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetHLSStreamingSessionURLOutput]
    }
  }

  @js.native
  trait GetMediaForFragmentListInput extends js.Object {
    var Fragments: FragmentNumberList
    var StreamName: StreamName
  }

  object GetMediaForFragmentListInput {
    @inline
    def apply(
        Fragments: FragmentNumberList,
        StreamName: StreamName
    ): GetMediaForFragmentListInput = {
      val __obj = js.Dynamic.literal(
        "Fragments"  -> Fragments.asInstanceOf[js.Any],
        "StreamName" -> StreamName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetMediaForFragmentListInput]
    }
  }

  @js.native
  trait GetMediaForFragmentListOutput extends js.Object {
    var ContentType: js.UndefOr[ContentType]
    var Payload: js.UndefOr[Payload]
  }

  object GetMediaForFragmentListOutput {
    @inline
    def apply(
        ContentType: js.UndefOr[ContentType] = js.undefined,
        Payload: js.UndefOr[Payload] = js.undefined
    ): GetMediaForFragmentListOutput = {
      val __obj = js.Dynamic.literal()
      ContentType.foreach(__v => __obj.updateDynamic("ContentType")(__v.asInstanceOf[js.Any]))
      Payload.foreach(__v => __obj.updateDynamic("Payload")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetMediaForFragmentListOutput]
    }
  }

  @js.native
  sealed trait HLSDiscontinuityMode extends js.Any
  object HLSDiscontinuityMode extends js.Object {
    val ALWAYS           = "ALWAYS".asInstanceOf[HLSDiscontinuityMode]
    val NEVER            = "NEVER".asInstanceOf[HLSDiscontinuityMode]
    val ON_DISCONTINUITY = "ON_DISCONTINUITY".asInstanceOf[HLSDiscontinuityMode]

    val values = js.Object.freeze(js.Array(ALWAYS, NEVER, ON_DISCONTINUITY))
  }

  @js.native
  sealed trait HLSDisplayFragmentTimestamp extends js.Any
  object HLSDisplayFragmentTimestamp extends js.Object {
    val ALWAYS = "ALWAYS".asInstanceOf[HLSDisplayFragmentTimestamp]
    val NEVER  = "NEVER".asInstanceOf[HLSDisplayFragmentTimestamp]

    val values = js.Object.freeze(js.Array(ALWAYS, NEVER))
  }

  /**
    * Contains the range of timestamps for the requested media, and the source of the timestamps.
    */
  @js.native
  trait HLSFragmentSelector extends js.Object {
    var FragmentSelectorType: js.UndefOr[HLSFragmentSelectorType]
    var TimestampRange: js.UndefOr[HLSTimestampRange]
  }

  object HLSFragmentSelector {
    @inline
    def apply(
        FragmentSelectorType: js.UndefOr[HLSFragmentSelectorType] = js.undefined,
        TimestampRange: js.UndefOr[HLSTimestampRange] = js.undefined
    ): HLSFragmentSelector = {
      val __obj = js.Dynamic.literal()
      FragmentSelectorType.foreach(__v => __obj.updateDynamic("FragmentSelectorType")(__v.asInstanceOf[js.Any]))
      TimestampRange.foreach(__v => __obj.updateDynamic("TimestampRange")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HLSFragmentSelector]
    }
  }

  @js.native
  sealed trait HLSFragmentSelectorType extends js.Any
  object HLSFragmentSelectorType extends js.Object {
    val PRODUCER_TIMESTAMP = "PRODUCER_TIMESTAMP".asInstanceOf[HLSFragmentSelectorType]
    val SERVER_TIMESTAMP   = "SERVER_TIMESTAMP".asInstanceOf[HLSFragmentSelectorType]

    val values = js.Object.freeze(js.Array(PRODUCER_TIMESTAMP, SERVER_TIMESTAMP))
  }

  @js.native
  sealed trait HLSPlaybackMode extends js.Any
  object HLSPlaybackMode extends js.Object {
    val LIVE        = "LIVE".asInstanceOf[HLSPlaybackMode]
    val LIVE_REPLAY = "LIVE_REPLAY".asInstanceOf[HLSPlaybackMode]
    val ON_DEMAND   = "ON_DEMAND".asInstanceOf[HLSPlaybackMode]

    val values = js.Object.freeze(js.Array(LIVE, LIVE_REPLAY, ON_DEMAND))
  }

  /**
    * The start and end of the timestamp range for the requested media.
    *  This value should not be present if <code>PlaybackType</code> is <code>LIVE</code>.
    *
    * '''Note:'''The values in the <code>HLSTimestampRange</code> are inclusive. Fragments that begin before the start time but continue past it, or fragments that begin before the end time but continue past it, are included in the session.
    */
  @js.native
  trait HLSTimestampRange extends js.Object {
    var EndTimestamp: js.UndefOr[Timestamp]
    var StartTimestamp: js.UndefOr[Timestamp]
  }

  object HLSTimestampRange {
    @inline
    def apply(
        EndTimestamp: js.UndefOr[Timestamp] = js.undefined,
        StartTimestamp: js.UndefOr[Timestamp] = js.undefined
    ): HLSTimestampRange = {
      val __obj = js.Dynamic.literal()
      EndTimestamp.foreach(__v => __obj.updateDynamic("EndTimestamp")(__v.asInstanceOf[js.Any]))
      StartTimestamp.foreach(__v => __obj.updateDynamic("StartTimestamp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HLSTimestampRange]
    }
  }

  @js.native
  trait ListFragmentsInput extends js.Object {
    var StreamName: StreamName
    var FragmentSelector: js.UndefOr[FragmentSelector]
    var MaxResults: js.UndefOr[PageLimit]
    var NextToken: js.UndefOr[String]
  }

  object ListFragmentsInput {
    @inline
    def apply(
        StreamName: StreamName,
        FragmentSelector: js.UndefOr[FragmentSelector] = js.undefined,
        MaxResults: js.UndefOr[PageLimit] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListFragmentsInput = {
      val __obj = js.Dynamic.literal(
        "StreamName" -> StreamName.asInstanceOf[js.Any]
      )

      FragmentSelector.foreach(__v => __obj.updateDynamic("FragmentSelector")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFragmentsInput]
    }
  }

  @js.native
  trait ListFragmentsOutput extends js.Object {
    var Fragments: js.UndefOr[FragmentList]
    var NextToken: js.UndefOr[String]
  }

  object ListFragmentsOutput {
    @inline
    def apply(
        Fragments: js.UndefOr[FragmentList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListFragmentsOutput = {
      val __obj = js.Dynamic.literal()
      Fragments.foreach(__v => __obj.updateDynamic("Fragments")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListFragmentsOutput]
    }
  }

  /**
    * The range of timestamps for which to return fragments.
    */
  @js.native
  trait TimestampRange extends js.Object {
    var EndTimestamp: Timestamp
    var StartTimestamp: Timestamp
  }

  object TimestampRange {
    @inline
    def apply(
        EndTimestamp: Timestamp,
        StartTimestamp: Timestamp
    ): TimestampRange = {
      val __obj = js.Dynamic.literal(
        "EndTimestamp"   -> EndTimestamp.asInstanceOf[js.Any],
        "StartTimestamp" -> StartTimestamp.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TimestampRange]
    }
  }
}
