package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object kinesisvideo {
  type ChannelInfoList = js.Array[ChannelInfo]
  type ChannelName = String
  type DataEndpoint = String
  type DataRetentionChangeInHours = Int
  type DataRetentionInHours = Int
  type DeviceName = String
  type KmsKeyId = String
  type ListOfProtocols = js.Array[ChannelProtocol]
  type ListStreamsInputLimit = Int
  type MediaType = String
  type MessageTtlSeconds = Int
  type NextToken = String
  type ResourceARN = String
  type ResourceEndpoint = String
  type ResourceEndpointList = js.Array[ResourceEndpointListItem]
  type ResourceTags = js.Dictionary[TagValue]
  type StreamInfoList = js.Array[StreamInfo]
  type StreamName = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagOnCreateList = js.Array[Tag]
  type TagValue = String
  type Timestamp = js.Date
  type Version = String

  implicit final class KinesisVideoOps(private val service: KinesisVideo) extends AnyVal {

    @inline def createSignalingChannelFuture(params: CreateSignalingChannelInput): Future[CreateSignalingChannelOutput] = service.createSignalingChannel(params).promise().toFuture
    @inline def createStreamFuture(params: CreateStreamInput): Future[CreateStreamOutput] = service.createStream(params).promise().toFuture
    @inline def deleteSignalingChannelFuture(params: DeleteSignalingChannelInput): Future[DeleteSignalingChannelOutput] = service.deleteSignalingChannel(params).promise().toFuture
    @inline def deleteStreamFuture(params: DeleteStreamInput): Future[DeleteStreamOutput] = service.deleteStream(params).promise().toFuture
    @inline def describeSignalingChannelFuture(params: DescribeSignalingChannelInput): Future[DescribeSignalingChannelOutput] = service.describeSignalingChannel(params).promise().toFuture
    @inline def describeStreamFuture(params: DescribeStreamInput): Future[DescribeStreamOutput] = service.describeStream(params).promise().toFuture
    @inline def getDataEndpointFuture(params: GetDataEndpointInput): Future[GetDataEndpointOutput] = service.getDataEndpoint(params).promise().toFuture
    @inline def getSignalingChannelEndpointFuture(params: GetSignalingChannelEndpointInput): Future[GetSignalingChannelEndpointOutput] = service.getSignalingChannelEndpoint(params).promise().toFuture
    @inline def listSignalingChannelsFuture(params: ListSignalingChannelsInput): Future[ListSignalingChannelsOutput] = service.listSignalingChannels(params).promise().toFuture
    @inline def listStreamsFuture(params: ListStreamsInput): Future[ListStreamsOutput] = service.listStreams(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] = service.listTagsForResource(params).promise().toFuture
    @inline def listTagsForStreamFuture(params: ListTagsForStreamInput): Future[ListTagsForStreamOutput] = service.listTagsForStream(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceInput): Future[TagResourceOutput] = service.tagResource(params).promise().toFuture
    @inline def tagStreamFuture(params: TagStreamInput): Future[TagStreamOutput] = service.tagStream(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceInput): Future[UntagResourceOutput] = service.untagResource(params).promise().toFuture
    @inline def untagStreamFuture(params: UntagStreamInput): Future[UntagStreamOutput] = service.untagStream(params).promise().toFuture
    @inline def updateDataRetentionFuture(params: UpdateDataRetentionInput): Future[UpdateDataRetentionOutput] = service.updateDataRetention(params).promise().toFuture
    @inline def updateSignalingChannelFuture(params: UpdateSignalingChannelInput): Future[UpdateSignalingChannelOutput] = service.updateSignalingChannel(params).promise().toFuture
    @inline def updateStreamFuture(params: UpdateStreamInput): Future[UpdateStreamOutput] = service.updateStream(params).promise().toFuture
  }
}

package kinesisvideo {
  @js.native
  @JSImport("aws-sdk", "KinesisVideo", "AWS.KinesisVideo")
  class KinesisVideo() extends js.Object {
    def this(config: AWSConfig) = this()

    def createSignalingChannel(params: CreateSignalingChannelInput): Request[CreateSignalingChannelOutput] = js.native
    def createStream(params: CreateStreamInput): Request[CreateStreamOutput] = js.native
    def deleteSignalingChannel(params: DeleteSignalingChannelInput): Request[DeleteSignalingChannelOutput] = js.native
    def deleteStream(params: DeleteStreamInput): Request[DeleteStreamOutput] = js.native
    def describeSignalingChannel(params: DescribeSignalingChannelInput): Request[DescribeSignalingChannelOutput] = js.native
    def describeStream(params: DescribeStreamInput): Request[DescribeStreamOutput] = js.native
    def getDataEndpoint(params: GetDataEndpointInput): Request[GetDataEndpointOutput] = js.native
    def getSignalingChannelEndpoint(params: GetSignalingChannelEndpointInput): Request[GetSignalingChannelEndpointOutput] = js.native
    def listSignalingChannels(params: ListSignalingChannelsInput): Request[ListSignalingChannelsOutput] = js.native
    def listStreams(params: ListStreamsInput): Request[ListStreamsOutput] = js.native
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput] = js.native
    def listTagsForStream(params: ListTagsForStreamInput): Request[ListTagsForStreamOutput] = js.native
    def tagResource(params: TagResourceInput): Request[TagResourceOutput] = js.native
    def tagStream(params: TagStreamInput): Request[TagStreamOutput] = js.native
    def untagResource(params: UntagResourceInput): Request[UntagResourceOutput] = js.native
    def untagStream(params: UntagStreamInput): Request[UntagStreamOutput] = js.native
    def updateDataRetention(params: UpdateDataRetentionInput): Request[UpdateDataRetentionOutput] = js.native
    def updateSignalingChannel(params: UpdateSignalingChannelInput): Request[UpdateSignalingChannelOutput] = js.native
    def updateStream(params: UpdateStreamInput): Request[UpdateStreamOutput] = js.native
  }

  @js.native
  sealed trait APIName extends js.Any
  object APIName {
    val PUT_MEDIA = "PUT_MEDIA".asInstanceOf[APIName]
    val GET_MEDIA = "GET_MEDIA".asInstanceOf[APIName]
    val LIST_FRAGMENTS = "LIST_FRAGMENTS".asInstanceOf[APIName]
    val GET_MEDIA_FOR_FRAGMENT_LIST = "GET_MEDIA_FOR_FRAGMENT_LIST".asInstanceOf[APIName]
    val GET_HLS_STREAMING_SESSION_URL = "GET_HLS_STREAMING_SESSION_URL".asInstanceOf[APIName]
    val GET_DASH_STREAMING_SESSION_URL = "GET_DASH_STREAMING_SESSION_URL".asInstanceOf[APIName]
    val GET_CLIP = "GET_CLIP".asInstanceOf[APIName]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(PUT_MEDIA, GET_MEDIA, LIST_FRAGMENTS, GET_MEDIA_FOR_FRAGMENT_LIST, GET_HLS_STREAMING_SESSION_URL, GET_DASH_STREAMING_SESSION_URL, GET_CLIP))
  }

  /**
    * A structure that encapsulates a signaling channel's metadata and properties.
    */
  @js.native
  trait ChannelInfo extends js.Object {
    var ChannelARN: js.UndefOr[ResourceARN]
    var ChannelName: js.UndefOr[ChannelName]
    var ChannelStatus: js.UndefOr[Status]
    var ChannelType: js.UndefOr[ChannelType]
    var CreationTime: js.UndefOr[Timestamp]
    var SingleMasterConfiguration: js.UndefOr[SingleMasterConfiguration]
    var Version: js.UndefOr[Version]
  }

  object ChannelInfo {
    @inline
    def apply(
        ChannelARN: js.UndefOr[ResourceARN] = js.undefined,
        ChannelName: js.UndefOr[ChannelName] = js.undefined,
        ChannelStatus: js.UndefOr[Status] = js.undefined,
        ChannelType: js.UndefOr[ChannelType] = js.undefined,
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        SingleMasterConfiguration: js.UndefOr[SingleMasterConfiguration] = js.undefined,
        Version: js.UndefOr[Version] = js.undefined
    ): ChannelInfo = {
      val __obj = js.Dynamic.literal()
      ChannelARN.foreach(__v => __obj.updateDynamic("ChannelARN")(__v.asInstanceOf[js.Any]))
      ChannelName.foreach(__v => __obj.updateDynamic("ChannelName")(__v.asInstanceOf[js.Any]))
      ChannelStatus.foreach(__v => __obj.updateDynamic("ChannelStatus")(__v.asInstanceOf[js.Any]))
      ChannelType.foreach(__v => __obj.updateDynamic("ChannelType")(__v.asInstanceOf[js.Any]))
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      SingleMasterConfiguration.foreach(__v => __obj.updateDynamic("SingleMasterConfiguration")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelInfo]
    }
  }

  /**
    * An optional input parameter for the <code>ListSignalingChannels</code> API. When this parameter is specified while invoking <code>ListSignalingChannels</code>, the API returns only the channels that satisfy a condition specified in <code>ChannelNameCondition</code>.
    */
  @js.native
  trait ChannelNameCondition extends js.Object {
    var ComparisonOperator: js.UndefOr[ComparisonOperator]
    var ComparisonValue: js.UndefOr[ChannelName]
  }

  object ChannelNameCondition {
    @inline
    def apply(
        ComparisonOperator: js.UndefOr[ComparisonOperator] = js.undefined,
        ComparisonValue: js.UndefOr[ChannelName] = js.undefined
    ): ChannelNameCondition = {
      val __obj = js.Dynamic.literal()
      ComparisonOperator.foreach(__v => __obj.updateDynamic("ComparisonOperator")(__v.asInstanceOf[js.Any]))
      ComparisonValue.foreach(__v => __obj.updateDynamic("ComparisonValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ChannelNameCondition]
    }
  }

  @js.native
  sealed trait ChannelProtocol extends js.Any
  object ChannelProtocol {
    val WSS = "WSS".asInstanceOf[ChannelProtocol]
    val HTTPS = "HTTPS".asInstanceOf[ChannelProtocol]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(WSS, HTTPS))
  }

  @js.native
  sealed trait ChannelRole extends js.Any
  object ChannelRole {
    val MASTER = "MASTER".asInstanceOf[ChannelRole]
    val VIEWER = "VIEWER".asInstanceOf[ChannelRole]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(MASTER, VIEWER))
  }

  @js.native
  sealed trait ChannelType extends js.Any
  object ChannelType {
    val SINGLE_MASTER = "SINGLE_MASTER".asInstanceOf[ChannelType]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(SINGLE_MASTER))
  }

  @js.native
  sealed trait ComparisonOperator extends js.Any
  object ComparisonOperator {
    val BEGINS_WITH = "BEGINS_WITH".asInstanceOf[ComparisonOperator]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(BEGINS_WITH))
  }

  @js.native
  trait CreateSignalingChannelInput extends js.Object {
    var ChannelName: ChannelName
    var ChannelType: js.UndefOr[ChannelType]
    var SingleMasterConfiguration: js.UndefOr[SingleMasterConfiguration]
    var Tags: js.UndefOr[TagOnCreateList]
  }

  object CreateSignalingChannelInput {
    @inline
    def apply(
        ChannelName: ChannelName,
        ChannelType: js.UndefOr[ChannelType] = js.undefined,
        SingleMasterConfiguration: js.UndefOr[SingleMasterConfiguration] = js.undefined,
        Tags: js.UndefOr[TagOnCreateList] = js.undefined
    ): CreateSignalingChannelInput = {
      val __obj = js.Dynamic.literal(
        "ChannelName" -> ChannelName.asInstanceOf[js.Any]
      )

      ChannelType.foreach(__v => __obj.updateDynamic("ChannelType")(__v.asInstanceOf[js.Any]))
      SingleMasterConfiguration.foreach(__v => __obj.updateDynamic("SingleMasterConfiguration")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSignalingChannelInput]
    }
  }

  @js.native
  trait CreateSignalingChannelOutput extends js.Object {
    var ChannelARN: js.UndefOr[ResourceARN]
  }

  object CreateSignalingChannelOutput {
    @inline
    def apply(
        ChannelARN: js.UndefOr[ResourceARN] = js.undefined
    ): CreateSignalingChannelOutput = {
      val __obj = js.Dynamic.literal()
      ChannelARN.foreach(__v => __obj.updateDynamic("ChannelARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateSignalingChannelOutput]
    }
  }

  @js.native
  trait CreateStreamInput extends js.Object {
    var StreamName: StreamName
    var DataRetentionInHours: js.UndefOr[DataRetentionInHours]
    var DeviceName: js.UndefOr[DeviceName]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var MediaType: js.UndefOr[MediaType]
    var Tags: js.UndefOr[ResourceTags]
  }

  object CreateStreamInput {
    @inline
    def apply(
        StreamName: StreamName,
        DataRetentionInHours: js.UndefOr[DataRetentionInHours] = js.undefined,
        DeviceName: js.UndefOr[DeviceName] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        MediaType: js.UndefOr[MediaType] = js.undefined,
        Tags: js.UndefOr[ResourceTags] = js.undefined
    ): CreateStreamInput = {
      val __obj = js.Dynamic.literal(
        "StreamName" -> StreamName.asInstanceOf[js.Any]
      )

      DataRetentionInHours.foreach(__v => __obj.updateDynamic("DataRetentionInHours")(__v.asInstanceOf[js.Any]))
      DeviceName.foreach(__v => __obj.updateDynamic("DeviceName")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      MediaType.foreach(__v => __obj.updateDynamic("MediaType")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStreamInput]
    }
  }

  @js.native
  trait CreateStreamOutput extends js.Object {
    var StreamARN: js.UndefOr[ResourceARN]
  }

  object CreateStreamOutput {
    @inline
    def apply(
        StreamARN: js.UndefOr[ResourceARN] = js.undefined
    ): CreateStreamOutput = {
      val __obj = js.Dynamic.literal()
      StreamARN.foreach(__v => __obj.updateDynamic("StreamARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateStreamOutput]
    }
  }

  @js.native
  trait DeleteSignalingChannelInput extends js.Object {
    var ChannelARN: ResourceARN
    var CurrentVersion: js.UndefOr[Version]
  }

  object DeleteSignalingChannelInput {
    @inline
    def apply(
        ChannelARN: ResourceARN,
        CurrentVersion: js.UndefOr[Version] = js.undefined
    ): DeleteSignalingChannelInput = {
      val __obj = js.Dynamic.literal(
        "ChannelARN" -> ChannelARN.asInstanceOf[js.Any]
      )

      CurrentVersion.foreach(__v => __obj.updateDynamic("CurrentVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteSignalingChannelInput]
    }
  }

  @js.native
  trait DeleteSignalingChannelOutput extends js.Object {}

  object DeleteSignalingChannelOutput {
    @inline
    def apply(
    ): DeleteSignalingChannelOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteSignalingChannelOutput]
    }
  }

  @js.native
  trait DeleteStreamInput extends js.Object {
    var StreamARN: ResourceARN
    var CurrentVersion: js.UndefOr[Version]
  }

  object DeleteStreamInput {
    @inline
    def apply(
        StreamARN: ResourceARN,
        CurrentVersion: js.UndefOr[Version] = js.undefined
    ): DeleteStreamInput = {
      val __obj = js.Dynamic.literal(
        "StreamARN" -> StreamARN.asInstanceOf[js.Any]
      )

      CurrentVersion.foreach(__v => __obj.updateDynamic("CurrentVersion")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteStreamInput]
    }
  }

  @js.native
  trait DeleteStreamOutput extends js.Object {}

  object DeleteStreamOutput {
    @inline
    def apply(
    ): DeleteStreamOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteStreamOutput]
    }
  }

  @js.native
  trait DescribeSignalingChannelInput extends js.Object {
    var ChannelARN: js.UndefOr[ResourceARN]
    var ChannelName: js.UndefOr[ChannelName]
  }

  object DescribeSignalingChannelInput {
    @inline
    def apply(
        ChannelARN: js.UndefOr[ResourceARN] = js.undefined,
        ChannelName: js.UndefOr[ChannelName] = js.undefined
    ): DescribeSignalingChannelInput = {
      val __obj = js.Dynamic.literal()
      ChannelARN.foreach(__v => __obj.updateDynamic("ChannelARN")(__v.asInstanceOf[js.Any]))
      ChannelName.foreach(__v => __obj.updateDynamic("ChannelName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSignalingChannelInput]
    }
  }

  @js.native
  trait DescribeSignalingChannelOutput extends js.Object {
    var ChannelInfo: js.UndefOr[ChannelInfo]
  }

  object DescribeSignalingChannelOutput {
    @inline
    def apply(
        ChannelInfo: js.UndefOr[ChannelInfo] = js.undefined
    ): DescribeSignalingChannelOutput = {
      val __obj = js.Dynamic.literal()
      ChannelInfo.foreach(__v => __obj.updateDynamic("ChannelInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeSignalingChannelOutput]
    }
  }

  @js.native
  trait DescribeStreamInput extends js.Object {
    var StreamARN: js.UndefOr[ResourceARN]
    var StreamName: js.UndefOr[StreamName]
  }

  object DescribeStreamInput {
    @inline
    def apply(
        StreamARN: js.UndefOr[ResourceARN] = js.undefined,
        StreamName: js.UndefOr[StreamName] = js.undefined
    ): DescribeStreamInput = {
      val __obj = js.Dynamic.literal()
      StreamARN.foreach(__v => __obj.updateDynamic("StreamARN")(__v.asInstanceOf[js.Any]))
      StreamName.foreach(__v => __obj.updateDynamic("StreamName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStreamInput]
    }
  }

  @js.native
  trait DescribeStreamOutput extends js.Object {
    var StreamInfo: js.UndefOr[StreamInfo]
  }

  object DescribeStreamOutput {
    @inline
    def apply(
        StreamInfo: js.UndefOr[StreamInfo] = js.undefined
    ): DescribeStreamOutput = {
      val __obj = js.Dynamic.literal()
      StreamInfo.foreach(__v => __obj.updateDynamic("StreamInfo")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeStreamOutput]
    }
  }

  @js.native
  trait GetDataEndpointInput extends js.Object {
    var APIName: APIName
    var StreamARN: js.UndefOr[ResourceARN]
    var StreamName: js.UndefOr[StreamName]
  }

  object GetDataEndpointInput {
    @inline
    def apply(
        APIName: APIName,
        StreamARN: js.UndefOr[ResourceARN] = js.undefined,
        StreamName: js.UndefOr[StreamName] = js.undefined
    ): GetDataEndpointInput = {
      val __obj = js.Dynamic.literal(
        "APIName" -> APIName.asInstanceOf[js.Any]
      )

      StreamARN.foreach(__v => __obj.updateDynamic("StreamARN")(__v.asInstanceOf[js.Any]))
      StreamName.foreach(__v => __obj.updateDynamic("StreamName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDataEndpointInput]
    }
  }

  @js.native
  trait GetDataEndpointOutput extends js.Object {
    var DataEndpoint: js.UndefOr[DataEndpoint]
  }

  object GetDataEndpointOutput {
    @inline
    def apply(
        DataEndpoint: js.UndefOr[DataEndpoint] = js.undefined
    ): GetDataEndpointOutput = {
      val __obj = js.Dynamic.literal()
      DataEndpoint.foreach(__v => __obj.updateDynamic("DataEndpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDataEndpointOutput]
    }
  }

  @js.native
  trait GetSignalingChannelEndpointInput extends js.Object {
    var ChannelARN: ResourceARN
    var SingleMasterChannelEndpointConfiguration: js.UndefOr[SingleMasterChannelEndpointConfiguration]
  }

  object GetSignalingChannelEndpointInput {
    @inline
    def apply(
        ChannelARN: ResourceARN,
        SingleMasterChannelEndpointConfiguration: js.UndefOr[SingleMasterChannelEndpointConfiguration] = js.undefined
    ): GetSignalingChannelEndpointInput = {
      val __obj = js.Dynamic.literal(
        "ChannelARN" -> ChannelARN.asInstanceOf[js.Any]
      )

      SingleMasterChannelEndpointConfiguration.foreach(__v => __obj.updateDynamic("SingleMasterChannelEndpointConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSignalingChannelEndpointInput]
    }
  }

  @js.native
  trait GetSignalingChannelEndpointOutput extends js.Object {
    var ResourceEndpointList: js.UndefOr[ResourceEndpointList]
  }

  object GetSignalingChannelEndpointOutput {
    @inline
    def apply(
        ResourceEndpointList: js.UndefOr[ResourceEndpointList] = js.undefined
    ): GetSignalingChannelEndpointOutput = {
      val __obj = js.Dynamic.literal()
      ResourceEndpointList.foreach(__v => __obj.updateDynamic("ResourceEndpointList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetSignalingChannelEndpointOutput]
    }
  }

  @js.native
  trait ListSignalingChannelsInput extends js.Object {
    var ChannelNameCondition: js.UndefOr[ChannelNameCondition]
    var MaxResults: js.UndefOr[ListStreamsInputLimit]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListSignalingChannelsInput {
    @inline
    def apply(
        ChannelNameCondition: js.UndefOr[ChannelNameCondition] = js.undefined,
        MaxResults: js.UndefOr[ListStreamsInputLimit] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSignalingChannelsInput = {
      val __obj = js.Dynamic.literal()
      ChannelNameCondition.foreach(__v => __obj.updateDynamic("ChannelNameCondition")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSignalingChannelsInput]
    }
  }

  @js.native
  trait ListSignalingChannelsOutput extends js.Object {
    var ChannelInfoList: js.UndefOr[ChannelInfoList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListSignalingChannelsOutput {
    @inline
    def apply(
        ChannelInfoList: js.UndefOr[ChannelInfoList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListSignalingChannelsOutput = {
      val __obj = js.Dynamic.literal()
      ChannelInfoList.foreach(__v => __obj.updateDynamic("ChannelInfoList")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListSignalingChannelsOutput]
    }
  }

  @js.native
  trait ListStreamsInput extends js.Object {
    var MaxResults: js.UndefOr[ListStreamsInputLimit]
    var NextToken: js.UndefOr[NextToken]
    var StreamNameCondition: js.UndefOr[StreamNameCondition]
  }

  object ListStreamsInput {
    @inline
    def apply(
        MaxResults: js.UndefOr[ListStreamsInputLimit] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        StreamNameCondition: js.UndefOr[StreamNameCondition] = js.undefined
    ): ListStreamsInput = {
      val __obj = js.Dynamic.literal()
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StreamNameCondition.foreach(__v => __obj.updateDynamic("StreamNameCondition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStreamsInput]
    }
  }

  @js.native
  trait ListStreamsOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var StreamInfoList: js.UndefOr[StreamInfoList]
  }

  object ListStreamsOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        StreamInfoList: js.UndefOr[StreamInfoList] = js.undefined
    ): ListStreamsOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StreamInfoList.foreach(__v => __obj.updateDynamic("StreamInfoList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListStreamsOutput]
    }
  }

  @js.native
  trait ListTagsForResourceInput extends js.Object {
    var ResourceARN: ResourceARN
    var NextToken: js.UndefOr[NextToken]
  }

  object ListTagsForResourceInput {
    @inline
    def apply(
        ResourceARN: ResourceARN,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListTagsForResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceInput]
    }
  }

  @js.native
  trait ListTagsForResourceOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[ResourceTags]
  }

  object ListTagsForResourceOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Tags: js.UndefOr[ResourceTags] = js.undefined
    ): ListTagsForResourceOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceOutput]
    }
  }

  @js.native
  trait ListTagsForStreamInput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var StreamARN: js.UndefOr[ResourceARN]
    var StreamName: js.UndefOr[StreamName]
  }

  object ListTagsForStreamInput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        StreamARN: js.UndefOr[ResourceARN] = js.undefined,
        StreamName: js.UndefOr[StreamName] = js.undefined
    ): ListTagsForStreamInput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StreamARN.foreach(__v => __obj.updateDynamic("StreamARN")(__v.asInstanceOf[js.Any]))
      StreamName.foreach(__v => __obj.updateDynamic("StreamName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForStreamInput]
    }
  }

  @js.native
  trait ListTagsForStreamOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[ResourceTags]
  }

  object ListTagsForStreamOutput {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Tags: js.UndefOr[ResourceTags] = js.undefined
    ): ListTagsForStreamOutput = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForStreamOutput]
    }
  }

  /**
    * An object that describes the endpoint of the signaling channel returned by the <code>GetSignalingChannelEndpoint</code> API.
    */
  @js.native
  trait ResourceEndpointListItem extends js.Object {
    var Protocol: js.UndefOr[ChannelProtocol]
    var ResourceEndpoint: js.UndefOr[ResourceEndpoint]
  }

  object ResourceEndpointListItem {
    @inline
    def apply(
        Protocol: js.UndefOr[ChannelProtocol] = js.undefined,
        ResourceEndpoint: js.UndefOr[ResourceEndpoint] = js.undefined
    ): ResourceEndpointListItem = {
      val __obj = js.Dynamic.literal()
      Protocol.foreach(__v => __obj.updateDynamic("Protocol")(__v.asInstanceOf[js.Any]))
      ResourceEndpoint.foreach(__v => __obj.updateDynamic("ResourceEndpoint")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceEndpointListItem]
    }
  }

  /**
    * An object that contains the endpoint configuration for the <code>SINGLE_MASTER</code> channel type.
    */
  @js.native
  trait SingleMasterChannelEndpointConfiguration extends js.Object {
    var Protocols: js.UndefOr[ListOfProtocols]
    var Role: js.UndefOr[ChannelRole]
  }

  object SingleMasterChannelEndpointConfiguration {
    @inline
    def apply(
        Protocols: js.UndefOr[ListOfProtocols] = js.undefined,
        Role: js.UndefOr[ChannelRole] = js.undefined
    ): SingleMasterChannelEndpointConfiguration = {
      val __obj = js.Dynamic.literal()
      Protocols.foreach(__v => __obj.updateDynamic("Protocols")(__v.asInstanceOf[js.Any]))
      Role.foreach(__v => __obj.updateDynamic("Role")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SingleMasterChannelEndpointConfiguration]
    }
  }

  /**
    * A structure that contains the configuration for the <code>SINGLE_MASTER</code> channel type.
    */
  @js.native
  trait SingleMasterConfiguration extends js.Object {
    var MessageTtlSeconds: js.UndefOr[MessageTtlSeconds]
  }

  object SingleMasterConfiguration {
    @inline
    def apply(
        MessageTtlSeconds: js.UndefOr[MessageTtlSeconds] = js.undefined
    ): SingleMasterConfiguration = {
      val __obj = js.Dynamic.literal()
      MessageTtlSeconds.foreach(__v => __obj.updateDynamic("MessageTtlSeconds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[SingleMasterConfiguration]
    }
  }

  @js.native
  sealed trait Status extends js.Any
  object Status {
    val CREATING = "CREATING".asInstanceOf[Status]
    val ACTIVE = "ACTIVE".asInstanceOf[Status]
    val UPDATING = "UPDATING".asInstanceOf[Status]
    val DELETING = "DELETING".asInstanceOf[Status]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(CREATING, ACTIVE, UPDATING, DELETING))
  }

  /**
    * An object describing a Kinesis video stream.
    */
  @js.native
  trait StreamInfo extends js.Object {
    var CreationTime: js.UndefOr[Timestamp]
    var DataRetentionInHours: js.UndefOr[DataRetentionInHours]
    var DeviceName: js.UndefOr[DeviceName]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var MediaType: js.UndefOr[MediaType]
    var Status: js.UndefOr[Status]
    var StreamARN: js.UndefOr[ResourceARN]
    var StreamName: js.UndefOr[StreamName]
    var Version: js.UndefOr[Version]
  }

  object StreamInfo {
    @inline
    def apply(
        CreationTime: js.UndefOr[Timestamp] = js.undefined,
        DataRetentionInHours: js.UndefOr[DataRetentionInHours] = js.undefined,
        DeviceName: js.UndefOr[DeviceName] = js.undefined,
        KmsKeyId: js.UndefOr[KmsKeyId] = js.undefined,
        MediaType: js.UndefOr[MediaType] = js.undefined,
        Status: js.UndefOr[Status] = js.undefined,
        StreamARN: js.UndefOr[ResourceARN] = js.undefined,
        StreamName: js.UndefOr[StreamName] = js.undefined,
        Version: js.UndefOr[Version] = js.undefined
    ): StreamInfo = {
      val __obj = js.Dynamic.literal()
      CreationTime.foreach(__v => __obj.updateDynamic("CreationTime")(__v.asInstanceOf[js.Any]))
      DataRetentionInHours.foreach(__v => __obj.updateDynamic("DataRetentionInHours")(__v.asInstanceOf[js.Any]))
      DeviceName.foreach(__v => __obj.updateDynamic("DeviceName")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      MediaType.foreach(__v => __obj.updateDynamic("MediaType")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      StreamARN.foreach(__v => __obj.updateDynamic("StreamARN")(__v.asInstanceOf[js.Any]))
      StreamName.foreach(__v => __obj.updateDynamic("StreamName")(__v.asInstanceOf[js.Any]))
      Version.foreach(__v => __obj.updateDynamic("Version")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamInfo]
    }
  }

  /**
    * Specifies the condition that streams must satisfy to be returned when you list streams (see the <code>ListStreams</code> API). A condition has a comparison operation and a value. Currently, you can specify only the <code>BEGINS_WITH</code> operator, which finds streams whose names start with a given prefix.
    */
  @js.native
  trait StreamNameCondition extends js.Object {
    var ComparisonOperator: js.UndefOr[ComparisonOperator]
    var ComparisonValue: js.UndefOr[StreamName]
  }

  object StreamNameCondition {
    @inline
    def apply(
        ComparisonOperator: js.UndefOr[ComparisonOperator] = js.undefined,
        ComparisonValue: js.UndefOr[StreamName] = js.undefined
    ): StreamNameCondition = {
      val __obj = js.Dynamic.literal()
      ComparisonOperator.foreach(__v => __obj.updateDynamic("ComparisonOperator")(__v.asInstanceOf[js.Any]))
      ComparisonValue.foreach(__v => __obj.updateDynamic("ComparisonValue")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[StreamNameCondition]
    }
  }

  /**
    * A key and value pair that is associated with the specified signaling channel.
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
  trait TagResourceInput extends js.Object {
    var ResourceARN: ResourceARN
    var Tags: TagList
  }

  object TagResourceInput {
    @inline
    def apply(
        ResourceARN: ResourceARN,
        Tags: TagList
    ): TagResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceInput]
    }
  }

  @js.native
  trait TagResourceOutput extends js.Object {}

  object TagResourceOutput {
    @inline
    def apply(
    ): TagResourceOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagResourceOutput]
    }
  }

  @js.native
  trait TagStreamInput extends js.Object {
    var Tags: ResourceTags
    var StreamARN: js.UndefOr[ResourceARN]
    var StreamName: js.UndefOr[StreamName]
  }

  object TagStreamInput {
    @inline
    def apply(
        Tags: ResourceTags,
        StreamARN: js.UndefOr[ResourceARN] = js.undefined,
        StreamName: js.UndefOr[StreamName] = js.undefined
    ): TagStreamInput = {
      val __obj = js.Dynamic.literal(
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      StreamARN.foreach(__v => __obj.updateDynamic("StreamARN")(__v.asInstanceOf[js.Any]))
      StreamName.foreach(__v => __obj.updateDynamic("StreamName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagStreamInput]
    }
  }

  @js.native
  trait TagStreamOutput extends js.Object {}

  object TagStreamOutput {
    @inline
    def apply(
    ): TagStreamOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagStreamOutput]
    }
  }

  @js.native
  trait UntagResourceInput extends js.Object {
    var ResourceARN: ResourceARN
    var TagKeyList: TagKeyList
  }

  object UntagResourceInput {
    @inline
    def apply(
        ResourceARN: ResourceARN,
        TagKeyList: TagKeyList
    ): UntagResourceInput = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "TagKeyList" -> TagKeyList.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceInput]
    }
  }

  @js.native
  trait UntagResourceOutput extends js.Object {}

  object UntagResourceOutput {
    @inline
    def apply(
    ): UntagResourceOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagResourceOutput]
    }
  }

  @js.native
  trait UntagStreamInput extends js.Object {
    var TagKeyList: TagKeyList
    var StreamARN: js.UndefOr[ResourceARN]
    var StreamName: js.UndefOr[StreamName]
  }

  object UntagStreamInput {
    @inline
    def apply(
        TagKeyList: TagKeyList,
        StreamARN: js.UndefOr[ResourceARN] = js.undefined,
        StreamName: js.UndefOr[StreamName] = js.undefined
    ): UntagStreamInput = {
      val __obj = js.Dynamic.literal(
        "TagKeyList" -> TagKeyList.asInstanceOf[js.Any]
      )

      StreamARN.foreach(__v => __obj.updateDynamic("StreamARN")(__v.asInstanceOf[js.Any]))
      StreamName.foreach(__v => __obj.updateDynamic("StreamName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UntagStreamInput]
    }
  }

  @js.native
  trait UntagStreamOutput extends js.Object {}

  object UntagStreamOutput {
    @inline
    def apply(
    ): UntagStreamOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagStreamOutput]
    }
  }

  @js.native
  trait UpdateDataRetentionInput extends js.Object {
    var CurrentVersion: Version
    var DataRetentionChangeInHours: DataRetentionChangeInHours
    var Operation: UpdateDataRetentionOperation
    var StreamARN: js.UndefOr[ResourceARN]
    var StreamName: js.UndefOr[StreamName]
  }

  object UpdateDataRetentionInput {
    @inline
    def apply(
        CurrentVersion: Version,
        DataRetentionChangeInHours: DataRetentionChangeInHours,
        Operation: UpdateDataRetentionOperation,
        StreamARN: js.UndefOr[ResourceARN] = js.undefined,
        StreamName: js.UndefOr[StreamName] = js.undefined
    ): UpdateDataRetentionInput = {
      val __obj = js.Dynamic.literal(
        "CurrentVersion" -> CurrentVersion.asInstanceOf[js.Any],
        "DataRetentionChangeInHours" -> DataRetentionChangeInHours.asInstanceOf[js.Any],
        "Operation" -> Operation.asInstanceOf[js.Any]
      )

      StreamARN.foreach(__v => __obj.updateDynamic("StreamARN")(__v.asInstanceOf[js.Any]))
      StreamName.foreach(__v => __obj.updateDynamic("StreamName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDataRetentionInput]
    }
  }

  @js.native
  sealed trait UpdateDataRetentionOperation extends js.Any
  object UpdateDataRetentionOperation {
    val INCREASE_DATA_RETENTION = "INCREASE_DATA_RETENTION".asInstanceOf[UpdateDataRetentionOperation]
    val DECREASE_DATA_RETENTION = "DECREASE_DATA_RETENTION".asInstanceOf[UpdateDataRetentionOperation]

    @deprecated("This will be removed to reduce footprint and initialization overhead.", "v0.31.0")
    val values = js.Object.freeze(js.Array(INCREASE_DATA_RETENTION, DECREASE_DATA_RETENTION))
  }

  @js.native
  trait UpdateDataRetentionOutput extends js.Object {}

  object UpdateDataRetentionOutput {
    @inline
    def apply(
    ): UpdateDataRetentionOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateDataRetentionOutput]
    }
  }

  @js.native
  trait UpdateSignalingChannelInput extends js.Object {
    var ChannelARN: ResourceARN
    var CurrentVersion: Version
    var SingleMasterConfiguration: js.UndefOr[SingleMasterConfiguration]
  }

  object UpdateSignalingChannelInput {
    @inline
    def apply(
        ChannelARN: ResourceARN,
        CurrentVersion: Version,
        SingleMasterConfiguration: js.UndefOr[SingleMasterConfiguration] = js.undefined
    ): UpdateSignalingChannelInput = {
      val __obj = js.Dynamic.literal(
        "ChannelARN" -> ChannelARN.asInstanceOf[js.Any],
        "CurrentVersion" -> CurrentVersion.asInstanceOf[js.Any]
      )

      SingleMasterConfiguration.foreach(__v => __obj.updateDynamic("SingleMasterConfiguration")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateSignalingChannelInput]
    }
  }

  @js.native
  trait UpdateSignalingChannelOutput extends js.Object {}

  object UpdateSignalingChannelOutput {
    @inline
    def apply(
    ): UpdateSignalingChannelOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateSignalingChannelOutput]
    }
  }

  @js.native
  trait UpdateStreamInput extends js.Object {
    var CurrentVersion: Version
    var DeviceName: js.UndefOr[DeviceName]
    var MediaType: js.UndefOr[MediaType]
    var StreamARN: js.UndefOr[ResourceARN]
    var StreamName: js.UndefOr[StreamName]
  }

  object UpdateStreamInput {
    @inline
    def apply(
        CurrentVersion: Version,
        DeviceName: js.UndefOr[DeviceName] = js.undefined,
        MediaType: js.UndefOr[MediaType] = js.undefined,
        StreamARN: js.UndefOr[ResourceARN] = js.undefined,
        StreamName: js.UndefOr[StreamName] = js.undefined
    ): UpdateStreamInput = {
      val __obj = js.Dynamic.literal(
        "CurrentVersion" -> CurrentVersion.asInstanceOf[js.Any]
      )

      DeviceName.foreach(__v => __obj.updateDynamic("DeviceName")(__v.asInstanceOf[js.Any]))
      MediaType.foreach(__v => __obj.updateDynamic("MediaType")(__v.asInstanceOf[js.Any]))
      StreamARN.foreach(__v => __obj.updateDynamic("StreamARN")(__v.asInstanceOf[js.Any]))
      StreamName.foreach(__v => __obj.updateDynamic("StreamName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateStreamInput]
    }
  }

  @js.native
  trait UpdateStreamOutput extends js.Object {}

  object UpdateStreamOutput {
    @inline
    def apply(
    ): UpdateStreamOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UpdateStreamOutput]
    }
  }
}
