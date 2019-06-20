package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object kinesisvideoarchivedmedia {
  type ContainerFormat          = String
  type ContentType              = String
  type DiscontinuityMode        = String
  type DisplayFragmentTimestamp = String
  type Expires                  = Int
  type FragmentList             = js.Array[Fragment]
  type FragmentNumberList       = js.Array[FragmentNumberString]
  type FragmentNumberString     = String
  type FragmentSelectorType     = String
  type HLSFragmentSelectorType  = String
  type HLSStreamingSessionURL   = String
  type PageLimit                = Double
  type Payload =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type PlaybackMode = String
  type ResourceARN  = String
  type StreamName   = String
  type Timestamp    = js.Date
}

package kinesisvideoarchivedmedia {
  @js.native
  @JSImport("aws-sdk", "KinesisVideoArchivedMedia")
  class KinesisVideoArchivedMedia() extends js.Object {
    def this(config: AWSConfig) = this()

    def getHLSStreamingSessionURL(params: GetHLSStreamingSessionURLInput): Request[GetHLSStreamingSessionURLOutput] =
      js.native
    def getMediaForFragmentList(params: GetMediaForFragmentListInput): Request[GetMediaForFragmentListOutput] =
      js.native
    def listFragments(params: ListFragmentsInput): Request[ListFragmentsOutput] = js.native
  }

  object ContainerFormatEnum {
    val FRAGMENTED_MP4 = "FRAGMENTED_MP4"
    val MPEG_TS        = "MPEG_TS"

    val values = IndexedSeq(FRAGMENTED_MP4, MPEG_TS)
  }

  object DiscontinuityModeEnum {
    val ALWAYS = "ALWAYS"
    val NEVER  = "NEVER"

    val values = IndexedSeq(ALWAYS, NEVER)
  }

  object DisplayFragmentTimestampEnum {
    val ALWAYS = "ALWAYS"
    val NEVER  = "NEVER"

    val values = IndexedSeq(ALWAYS, NEVER)
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
    def apply(
        FragmentLengthInMilliseconds: js.UndefOr[Double] = js.undefined,
        FragmentNumber: js.UndefOr[String] = js.undefined,
        FragmentSizeInBytes: js.UndefOr[Double] = js.undefined,
        ProducerTimestamp: js.UndefOr[Timestamp] = js.undefined,
        ServerTimestamp: js.UndefOr[Timestamp] = js.undefined
    ): Fragment = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FragmentLengthInMilliseconds" -> FragmentLengthInMilliseconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FragmentNumber" -> FragmentNumber.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FragmentSizeInBytes" -> FragmentSizeInBytes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ProducerTimestamp" -> ProducerTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ServerTimestamp" -> ServerTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Fragment]
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
    def apply(
        FragmentSelectorType: FragmentSelectorType,
        TimestampRange: TimestampRange
    ): FragmentSelector = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FragmentSelectorType" -> FragmentSelectorType.asInstanceOf[js.Any],
        "TimestampRange"       -> TimestampRange.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FragmentSelector]
    }
  }

  object FragmentSelectorTypeEnum {
    val PRODUCER_TIMESTAMP = "PRODUCER_TIMESTAMP"
    val SERVER_TIMESTAMP   = "SERVER_TIMESTAMP"

    val values = IndexedSeq(PRODUCER_TIMESTAMP, SERVER_TIMESTAMP)
  }

  @js.native
  trait GetHLSStreamingSessionURLInput extends js.Object {
    var ContainerFormat: js.UndefOr[ContainerFormat]
    var DiscontinuityMode: js.UndefOr[DiscontinuityMode]
    var DisplayFragmentTimestamp: js.UndefOr[DisplayFragmentTimestamp]
    var Expires: js.UndefOr[Expires]
    var HLSFragmentSelector: js.UndefOr[HLSFragmentSelector]
    var MaxMediaPlaylistFragmentResults: js.UndefOr[PageLimit]
    var PlaybackMode: js.UndefOr[PlaybackMode]
    var StreamARN: js.UndefOr[ResourceARN]
    var StreamName: js.UndefOr[StreamName]
  }

  object GetHLSStreamingSessionURLInput {
    def apply(
        ContainerFormat: js.UndefOr[ContainerFormat] = js.undefined,
        DiscontinuityMode: js.UndefOr[DiscontinuityMode] = js.undefined,
        DisplayFragmentTimestamp: js.UndefOr[DisplayFragmentTimestamp] = js.undefined,
        Expires: js.UndefOr[Expires] = js.undefined,
        HLSFragmentSelector: js.UndefOr[HLSFragmentSelector] = js.undefined,
        MaxMediaPlaylistFragmentResults: js.UndefOr[PageLimit] = js.undefined,
        PlaybackMode: js.UndefOr[PlaybackMode] = js.undefined,
        StreamARN: js.UndefOr[ResourceARN] = js.undefined,
        StreamName: js.UndefOr[StreamName] = js.undefined
    ): GetHLSStreamingSessionURLInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContainerFormat" -> ContainerFormat.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DiscontinuityMode" -> DiscontinuityMode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DisplayFragmentTimestamp" -> DisplayFragmentTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Expires" -> Expires.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HLSFragmentSelector" -> HLSFragmentSelector.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxMediaPlaylistFragmentResults" -> MaxMediaPlaylistFragmentResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PlaybackMode" -> PlaybackMode.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StreamARN" -> StreamARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StreamName" -> StreamName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHLSStreamingSessionURLInput]
    }
  }

  @js.native
  trait GetHLSStreamingSessionURLOutput extends js.Object {
    var HLSStreamingSessionURL: js.UndefOr[HLSStreamingSessionURL]
  }

  object GetHLSStreamingSessionURLOutput {
    def apply(
        HLSStreamingSessionURL: js.UndefOr[HLSStreamingSessionURL] = js.undefined
    ): GetHLSStreamingSessionURLOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HLSStreamingSessionURL" -> HLSStreamingSessionURL.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetHLSStreamingSessionURLOutput]
    }
  }

  @js.native
  trait GetMediaForFragmentListInput extends js.Object {
    var Fragments: FragmentNumberList
    var StreamName: StreamName
  }

  object GetMediaForFragmentListInput {
    def apply(
        Fragments: FragmentNumberList,
        StreamName: StreamName
    ): GetMediaForFragmentListInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Fragments"  -> Fragments.asInstanceOf[js.Any],
        "StreamName" -> StreamName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMediaForFragmentListInput]
    }
  }

  @js.native
  trait GetMediaForFragmentListOutput extends js.Object {
    var ContentType: js.UndefOr[ContentType]
    var Payload: js.UndefOr[Payload]
  }

  object GetMediaForFragmentListOutput {
    def apply(
        ContentType: js.UndefOr[ContentType] = js.undefined,
        Payload: js.UndefOr[Payload] = js.undefined
    ): GetMediaForFragmentListOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ContentType" -> ContentType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Payload" -> Payload.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetMediaForFragmentListOutput]
    }
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
    def apply(
        FragmentSelectorType: js.UndefOr[HLSFragmentSelectorType] = js.undefined,
        TimestampRange: js.UndefOr[HLSTimestampRange] = js.undefined
    ): HLSFragmentSelector = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FragmentSelectorType" -> FragmentSelectorType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimestampRange" -> TimestampRange.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HLSFragmentSelector]
    }
  }

  object HLSFragmentSelectorTypeEnum {
    val PRODUCER_TIMESTAMP = "PRODUCER_TIMESTAMP"
    val SERVER_TIMESTAMP   = "SERVER_TIMESTAMP"

    val values = IndexedSeq(PRODUCER_TIMESTAMP, SERVER_TIMESTAMP)
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
    def apply(
        EndTimestamp: js.UndefOr[Timestamp] = js.undefined,
        StartTimestamp: js.UndefOr[Timestamp] = js.undefined
    ): HLSTimestampRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndTimestamp" -> EndTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartTimestamp" -> StartTimestamp.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HLSTimestampRange]
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
    def apply(
        StreamName: StreamName,
        FragmentSelector: js.UndefOr[FragmentSelector] = js.undefined,
        MaxResults: js.UndefOr[PageLimit] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListFragmentsInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StreamName" -> StreamName.asInstanceOf[js.Any],
        "FragmentSelector" -> FragmentSelector.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFragmentsInput]
    }
  }

  @js.native
  trait ListFragmentsOutput extends js.Object {
    var Fragments: js.UndefOr[FragmentList]
    var NextToken: js.UndefOr[String]
  }

  object ListFragmentsOutput {
    def apply(
        Fragments: js.UndefOr[FragmentList] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListFragmentsOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Fragments" -> Fragments.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListFragmentsOutput]
    }
  }

  object PlaybackModeEnum {
    val LIVE      = "LIVE"
    val ON_DEMAND = "ON_DEMAND"

    val values = IndexedSeq(LIVE, ON_DEMAND)
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
    def apply(
        EndTimestamp: Timestamp,
        StartTimestamp: Timestamp
    ): TimestampRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndTimestamp"   -> EndTimestamp.asInstanceOf[js.Any],
        "StartTimestamp" -> StartTimestamp.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[TimestampRange]
    }
  }
}
