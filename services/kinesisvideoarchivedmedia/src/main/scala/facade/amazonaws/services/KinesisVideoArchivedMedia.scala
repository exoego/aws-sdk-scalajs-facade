package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

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
    ): Future[GetDASHStreamingSessionURLOutput] = service.getDASHStreamingSessionURL(params).promise().toFuture
    @inline def getHLSStreamingSessionURLFuture(
        params: GetHLSStreamingSessionURLInput
    ): Future[GetHLSStreamingSessionURLOutput] = service.getHLSStreamingSessionURL(params).promise().toFuture
    @inline def getMediaForFragmentListFuture(
        params: GetMediaForFragmentListInput
    ): Future[GetMediaForFragmentListOutput] = service.getMediaForFragmentList(params).promise().toFuture
    @inline def listFragmentsFuture(params: ListFragmentsInput): Future[ListFragmentsOutput] =
      service.listFragments(params).promise().toFuture
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
  @Factory
  trait DASHFragmentSelector extends js.Object {
    var FragmentSelectorType: js.UndefOr[DASHFragmentSelectorType]
    var TimestampRange: js.UndefOr[DASHTimestampRange]
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
  @Factory
  trait DASHTimestampRange extends js.Object {
    var EndTimestamp: js.UndefOr[Timestamp]
    var StartTimestamp: js.UndefOr[Timestamp]
  }

  /**
    * Represents a segment of video or other time-delimited data.
    */
  @js.native
  @Factory
  trait Fragment extends js.Object {
    var FragmentLengthInMilliseconds: js.UndefOr[Double]
    var FragmentNumber: js.UndefOr[String]
    var FragmentSizeInBytes: js.UndefOr[Double]
    var ProducerTimestamp: js.UndefOr[Timestamp]
    var ServerTimestamp: js.UndefOr[Timestamp]
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
  @Factory
  trait FragmentSelector extends js.Object {
    var FragmentSelectorType: FragmentSelectorType
    var TimestampRange: TimestampRange
  }

  @js.native
  sealed trait FragmentSelectorType extends js.Any
  object FragmentSelectorType extends js.Object {
    val PRODUCER_TIMESTAMP = "PRODUCER_TIMESTAMP".asInstanceOf[FragmentSelectorType]
    val SERVER_TIMESTAMP   = "SERVER_TIMESTAMP".asInstanceOf[FragmentSelectorType]

    val values = js.Object.freeze(js.Array(PRODUCER_TIMESTAMP, SERVER_TIMESTAMP))
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait GetDASHStreamingSessionURLOutput extends js.Object {
    var DASHStreamingSessionURL: js.UndefOr[DASHStreamingSessionURL]
  }

  @js.native
  @Factory
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

  @js.native
  @Factory
  trait GetHLSStreamingSessionURLOutput extends js.Object {
    var HLSStreamingSessionURL: js.UndefOr[HLSStreamingSessionURL]
  }

  @js.native
  @Factory
  trait GetMediaForFragmentListInput extends js.Object {
    var Fragments: FragmentNumberList
    var StreamName: StreamName
  }

  @js.native
  @Factory
  trait GetMediaForFragmentListOutput extends js.Object {
    var ContentType: js.UndefOr[ContentType]
    var Payload: js.UndefOr[Payload]
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
  @Factory
  trait HLSFragmentSelector extends js.Object {
    var FragmentSelectorType: js.UndefOr[HLSFragmentSelectorType]
    var TimestampRange: js.UndefOr[HLSTimestampRange]
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
  @Factory
  trait HLSTimestampRange extends js.Object {
    var EndTimestamp: js.UndefOr[Timestamp]
    var StartTimestamp: js.UndefOr[Timestamp]
  }

  @js.native
  @Factory
  trait ListFragmentsInput extends js.Object {
    var StreamName: StreamName
    var FragmentSelector: js.UndefOr[FragmentSelector]
    var MaxResults: js.UndefOr[PageLimit]
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListFragmentsOutput extends js.Object {
    var Fragments: js.UndefOr[FragmentList]
    var NextToken: js.UndefOr[String]
  }

  /**
    * The range of timestamps for which to return fragments.
    */
  @js.native
  @Factory
  trait TimestampRange extends js.Object {
    var EndTimestamp: Timestamp
    var StartTimestamp: Timestamp
  }
}
