package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object kinesisvideo {
  type ChannelInfoList            = js.Array[ChannelInfo]
  type ChannelName                = String
  type DataEndpoint               = String
  type DataRetentionChangeInHours = Int
  type DataRetentionInHours       = Int
  type DeviceName                 = String
  type KmsKeyId                   = String
  type ListOfProtocols            = js.Array[ChannelProtocol]
  type ListStreamsInputLimit      = Int
  type MediaType                  = String
  type MessageTtlSeconds          = Int
  type NextToken                  = String
  type ResourceARN                = String
  type ResourceEndpoint           = String
  type ResourceEndpointList       = js.Array[ResourceEndpointListItem]
  type ResourceTags               = js.Dictionary[TagValue]
  type StreamInfoList             = js.Array[StreamInfo]
  type StreamName                 = String
  type TagKey                     = String
  type TagKeyList                 = js.Array[TagKey]
  type TagList                    = js.Array[Tag]
  type TagOnCreateList            = js.Array[Tag]
  type TagValue                   = String
  type Timestamp                  = js.Date
  type Version                    = String

  implicit final class KinesisVideoOps(private val service: KinesisVideo) extends AnyVal {

    @inline def createSignalingChannelFuture(
        params: CreateSignalingChannelInput
    ): Future[CreateSignalingChannelOutput] = service.createSignalingChannel(params).promise().toFuture
    @inline def createStreamFuture(params: CreateStreamInput): Future[CreateStreamOutput] =
      service.createStream(params).promise().toFuture
    @inline def deleteSignalingChannelFuture(
        params: DeleteSignalingChannelInput
    ): Future[DeleteSignalingChannelOutput] = service.deleteSignalingChannel(params).promise().toFuture
    @inline def deleteStreamFuture(params: DeleteStreamInput): Future[DeleteStreamOutput] =
      service.deleteStream(params).promise().toFuture
    @inline def describeSignalingChannelFuture(
        params: DescribeSignalingChannelInput
    ): Future[DescribeSignalingChannelOutput] = service.describeSignalingChannel(params).promise().toFuture
    @inline def describeStreamFuture(params: DescribeStreamInput): Future[DescribeStreamOutput] =
      service.describeStream(params).promise().toFuture
    @inline def getDataEndpointFuture(params: GetDataEndpointInput): Future[GetDataEndpointOutput] =
      service.getDataEndpoint(params).promise().toFuture
    @inline def getSignalingChannelEndpointFuture(
        params: GetSignalingChannelEndpointInput
    ): Future[GetSignalingChannelEndpointOutput] = service.getSignalingChannelEndpoint(params).promise().toFuture
    @inline def listSignalingChannelsFuture(params: ListSignalingChannelsInput): Future[ListSignalingChannelsOutput] =
      service.listSignalingChannels(params).promise().toFuture
    @inline def listStreamsFuture(params: ListStreamsInput): Future[ListStreamsOutput] =
      service.listStreams(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] =
      service.listTagsForResource(params).promise().toFuture
    @inline def listTagsForStreamFuture(params: ListTagsForStreamInput): Future[ListTagsForStreamOutput] =
      service.listTagsForStream(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceInput): Future[TagResourceOutput] =
      service.tagResource(params).promise().toFuture
    @inline def tagStreamFuture(params: TagStreamInput): Future[TagStreamOutput] =
      service.tagStream(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceInput): Future[UntagResourceOutput] =
      service.untagResource(params).promise().toFuture
    @inline def untagStreamFuture(params: UntagStreamInput): Future[UntagStreamOutput] =
      service.untagStream(params).promise().toFuture
    @inline def updateDataRetentionFuture(params: UpdateDataRetentionInput): Future[UpdateDataRetentionOutput] =
      service.updateDataRetention(params).promise().toFuture
    @inline def updateSignalingChannelFuture(
        params: UpdateSignalingChannelInput
    ): Future[UpdateSignalingChannelOutput] = service.updateSignalingChannel(params).promise().toFuture
    @inline def updateStreamFuture(params: UpdateStreamInput): Future[UpdateStreamOutput] =
      service.updateStream(params).promise().toFuture
  }
}

package kinesisvideo {
  @js.native
  @JSImport("aws-sdk", "KinesisVideo")
  class KinesisVideo() extends js.Object {
    def this(config: AWSConfig) = this()

    def createSignalingChannel(params: CreateSignalingChannelInput): Request[CreateSignalingChannelOutput] = js.native
    def createStream(params: CreateStreamInput): Request[CreateStreamOutput]                               = js.native
    def deleteSignalingChannel(params: DeleteSignalingChannelInput): Request[DeleteSignalingChannelOutput] = js.native
    def deleteStream(params: DeleteStreamInput): Request[DeleteStreamOutput]                               = js.native
    def describeSignalingChannel(params: DescribeSignalingChannelInput): Request[DescribeSignalingChannelOutput] =
      js.native
    def describeStream(params: DescribeStreamInput): Request[DescribeStreamOutput]    = js.native
    def getDataEndpoint(params: GetDataEndpointInput): Request[GetDataEndpointOutput] = js.native
    def getSignalingChannelEndpoint(
        params: GetSignalingChannelEndpointInput
    ): Request[GetSignalingChannelEndpointOutput]                                                          = js.native
    def listSignalingChannels(params: ListSignalingChannelsInput): Request[ListSignalingChannelsOutput]    = js.native
    def listStreams(params: ListStreamsInput): Request[ListStreamsOutput]                                  = js.native
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput]          = js.native
    def listTagsForStream(params: ListTagsForStreamInput): Request[ListTagsForStreamOutput]                = js.native
    def tagResource(params: TagResourceInput): Request[TagResourceOutput]                                  = js.native
    def tagStream(params: TagStreamInput): Request[TagStreamOutput]                                        = js.native
    def untagResource(params: UntagResourceInput): Request[UntagResourceOutput]                            = js.native
    def untagStream(params: UntagStreamInput): Request[UntagStreamOutput]                                  = js.native
    def updateDataRetention(params: UpdateDataRetentionInput): Request[UpdateDataRetentionOutput]          = js.native
    def updateSignalingChannel(params: UpdateSignalingChannelInput): Request[UpdateSignalingChannelOutput] = js.native
    def updateStream(params: UpdateStreamInput): Request[UpdateStreamOutput]                               = js.native
  }

  @js.native
  sealed trait APIName extends js.Any
  object APIName extends js.Object {
    val PUT_MEDIA                      = "PUT_MEDIA".asInstanceOf[APIName]
    val GET_MEDIA                      = "GET_MEDIA".asInstanceOf[APIName]
    val LIST_FRAGMENTS                 = "LIST_FRAGMENTS".asInstanceOf[APIName]
    val GET_MEDIA_FOR_FRAGMENT_LIST    = "GET_MEDIA_FOR_FRAGMENT_LIST".asInstanceOf[APIName]
    val GET_HLS_STREAMING_SESSION_URL  = "GET_HLS_STREAMING_SESSION_URL".asInstanceOf[APIName]
    val GET_DASH_STREAMING_SESSION_URL = "GET_DASH_STREAMING_SESSION_URL".asInstanceOf[APIName]

    val values = js.Object.freeze(
      js.Array(
        PUT_MEDIA,
        GET_MEDIA,
        LIST_FRAGMENTS,
        GET_MEDIA_FOR_FRAGMENT_LIST,
        GET_HLS_STREAMING_SESSION_URL,
        GET_DASH_STREAMING_SESSION_URL
      )
    )
  }

  /**
    * A structure that encapsulates a signaling channel's metadata and properties.
    */
  @js.native
  @Factory
  trait ChannelInfo extends js.Object {
    var ChannelARN: js.UndefOr[ResourceARN]
    var ChannelName: js.UndefOr[ChannelName]
    var ChannelStatus: js.UndefOr[Status]
    var ChannelType: js.UndefOr[ChannelType]
    var CreationTime: js.UndefOr[Timestamp]
    var SingleMasterConfiguration: js.UndefOr[SingleMasterConfiguration]
    var Version: js.UndefOr[Version]
  }

  /**
    * An optional input parameter for the <code>ListSignalingChannels</code> API. When this parameter is specified while invoking <code>ListSignalingChannels</code>, the API returns only the channels that satisfy a condition specified in <code>ChannelNameCondition</code>.
    */
  @js.native
  @Factory
  trait ChannelNameCondition extends js.Object {
    var ComparisonOperator: js.UndefOr[ComparisonOperator]
    var ComparisonValue: js.UndefOr[ChannelName]
  }

  @js.native
  sealed trait ChannelProtocol extends js.Any
  object ChannelProtocol extends js.Object {
    val WSS   = "WSS".asInstanceOf[ChannelProtocol]
    val HTTPS = "HTTPS".asInstanceOf[ChannelProtocol]

    val values = js.Object.freeze(js.Array(WSS, HTTPS))
  }

  @js.native
  sealed trait ChannelRole extends js.Any
  object ChannelRole extends js.Object {
    val MASTER = "MASTER".asInstanceOf[ChannelRole]
    val VIEWER = "VIEWER".asInstanceOf[ChannelRole]

    val values = js.Object.freeze(js.Array(MASTER, VIEWER))
  }

  @js.native
  sealed trait ChannelType extends js.Any
  object ChannelType extends js.Object {
    val SINGLE_MASTER = "SINGLE_MASTER".asInstanceOf[ChannelType]

    val values = js.Object.freeze(js.Array(SINGLE_MASTER))
  }

  @js.native
  sealed trait ComparisonOperator extends js.Any
  object ComparisonOperator extends js.Object {
    val BEGINS_WITH = "BEGINS_WITH".asInstanceOf[ComparisonOperator]

    val values = js.Object.freeze(js.Array(BEGINS_WITH))
  }

  @js.native
  @Factory
  trait CreateSignalingChannelInput extends js.Object {
    var ChannelName: ChannelName
    var ChannelType: js.UndefOr[ChannelType]
    var SingleMasterConfiguration: js.UndefOr[SingleMasterConfiguration]
    var Tags: js.UndefOr[TagOnCreateList]
  }

  @js.native
  @Factory
  trait CreateSignalingChannelOutput extends js.Object {
    var ChannelARN: js.UndefOr[ResourceARN]
  }

  @js.native
  @Factory
  trait CreateStreamInput extends js.Object {
    var StreamName: StreamName
    var DataRetentionInHours: js.UndefOr[DataRetentionInHours]
    var DeviceName: js.UndefOr[DeviceName]
    var KmsKeyId: js.UndefOr[KmsKeyId]
    var MediaType: js.UndefOr[MediaType]
    var Tags: js.UndefOr[ResourceTags]
  }

  @js.native
  @Factory
  trait CreateStreamOutput extends js.Object {
    var StreamARN: js.UndefOr[ResourceARN]
  }

  @js.native
  @Factory
  trait DeleteSignalingChannelInput extends js.Object {
    var ChannelARN: ResourceARN
    var CurrentVersion: js.UndefOr[Version]
  }

  @js.native
  @Factory
  trait DeleteSignalingChannelOutput extends js.Object {}

  @js.native
  @Factory
  trait DeleteStreamInput extends js.Object {
    var StreamARN: ResourceARN
    var CurrentVersion: js.UndefOr[Version]
  }

  @js.native
  @Factory
  trait DeleteStreamOutput extends js.Object {}

  @js.native
  @Factory
  trait DescribeSignalingChannelInput extends js.Object {
    var ChannelARN: js.UndefOr[ResourceARN]
    var ChannelName: js.UndefOr[ChannelName]
  }

  @js.native
  @Factory
  trait DescribeSignalingChannelOutput extends js.Object {
    var ChannelInfo: js.UndefOr[ChannelInfo]
  }

  @js.native
  @Factory
  trait DescribeStreamInput extends js.Object {
    var StreamARN: js.UndefOr[ResourceARN]
    var StreamName: js.UndefOr[StreamName]
  }

  @js.native
  @Factory
  trait DescribeStreamOutput extends js.Object {
    var StreamInfo: js.UndefOr[StreamInfo]
  }

  @js.native
  @Factory
  trait GetDataEndpointInput extends js.Object {
    var APIName: APIName
    var StreamARN: js.UndefOr[ResourceARN]
    var StreamName: js.UndefOr[StreamName]
  }

  @js.native
  @Factory
  trait GetDataEndpointOutput extends js.Object {
    var DataEndpoint: js.UndefOr[DataEndpoint]
  }

  @js.native
  @Factory
  trait GetSignalingChannelEndpointInput extends js.Object {
    var ChannelARN: ResourceARN
    var SingleMasterChannelEndpointConfiguration: js.UndefOr[SingleMasterChannelEndpointConfiguration]
  }

  @js.native
  @Factory
  trait GetSignalingChannelEndpointOutput extends js.Object {
    var ResourceEndpointList: js.UndefOr[ResourceEndpointList]
  }

  @js.native
  @Factory
  trait ListSignalingChannelsInput extends js.Object {
    var ChannelNameCondition: js.UndefOr[ChannelNameCondition]
    var MaxResults: js.UndefOr[ListStreamsInputLimit]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListSignalingChannelsOutput extends js.Object {
    var ChannelInfoList: js.UndefOr[ChannelInfoList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListStreamsInput extends js.Object {
    var MaxResults: js.UndefOr[ListStreamsInputLimit]
    var NextToken: js.UndefOr[NextToken]
    var StreamNameCondition: js.UndefOr[StreamNameCondition]
  }

  @js.native
  @Factory
  trait ListStreamsOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var StreamInfoList: js.UndefOr[StreamInfoList]
  }

  @js.native
  @Factory
  trait ListTagsForResourceInput extends js.Object {
    var ResourceARN: ResourceARN
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListTagsForResourceOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[ResourceTags]
  }

  @js.native
  @Factory
  trait ListTagsForStreamInput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var StreamARN: js.UndefOr[ResourceARN]
    var StreamName: js.UndefOr[StreamName]
  }

  @js.native
  @Factory
  trait ListTagsForStreamOutput extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Tags: js.UndefOr[ResourceTags]
  }

  /**
    * An object that describes the endpoint of the signaling channel returned by the <code>GetSignalingChannelEndpoint</code> API.
    */
  @js.native
  @Factory
  trait ResourceEndpointListItem extends js.Object {
    var Protocol: js.UndefOr[ChannelProtocol]
    var ResourceEndpoint: js.UndefOr[ResourceEndpoint]
  }

  /**
    * An object that contains the endpoint configuration for the <code>SINGLE_MASTER</code> channel type.
    */
  @js.native
  @Factory
  trait SingleMasterChannelEndpointConfiguration extends js.Object {
    var Protocols: js.UndefOr[ListOfProtocols]
    var Role: js.UndefOr[ChannelRole]
  }

  /**
    * A structure that contains the configuration for the <code>SINGLE_MASTER</code> channel type.
    */
  @js.native
  @Factory
  trait SingleMasterConfiguration extends js.Object {
    var MessageTtlSeconds: js.UndefOr[MessageTtlSeconds]
  }

  @js.native
  sealed trait Status extends js.Any
  object Status extends js.Object {
    val CREATING = "CREATING".asInstanceOf[Status]
    val ACTIVE   = "ACTIVE".asInstanceOf[Status]
    val UPDATING = "UPDATING".asInstanceOf[Status]
    val DELETING = "DELETING".asInstanceOf[Status]

    val values = js.Object.freeze(js.Array(CREATING, ACTIVE, UPDATING, DELETING))
  }

  /**
    * An object describing a Kinesis video stream.
    */
  @js.native
  @Factory
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

  /**
    * Specifies the condition that streams must satisfy to be returned when you list streams (see the <code>ListStreams</code> API). A condition has a comparison operation and a value. Currently, you can specify only the <code>BEGINS_WITH</code> operator, which finds streams whose names start with a given prefix.
    */
  @js.native
  @Factory
  trait StreamNameCondition extends js.Object {
    var ComparisonOperator: js.UndefOr[ComparisonOperator]
    var ComparisonValue: js.UndefOr[StreamName]
  }

  /**
    * A key and value pair that is associated with the specified signaling channel.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  @js.native
  @Factory
  trait TagResourceInput extends js.Object {
    var ResourceARN: ResourceARN
    var Tags: TagList
  }

  @js.native
  @Factory
  trait TagResourceOutput extends js.Object {}

  @js.native
  @Factory
  trait TagStreamInput extends js.Object {
    var Tags: ResourceTags
    var StreamARN: js.UndefOr[ResourceARN]
    var StreamName: js.UndefOr[StreamName]
  }

  @js.native
  @Factory
  trait TagStreamOutput extends js.Object {}

  @js.native
  @Factory
  trait UntagResourceInput extends js.Object {
    var ResourceARN: ResourceARN
    var TagKeyList: TagKeyList
  }

  @js.native
  @Factory
  trait UntagResourceOutput extends js.Object {}

  @js.native
  @Factory
  trait UntagStreamInput extends js.Object {
    var TagKeyList: TagKeyList
    var StreamARN: js.UndefOr[ResourceARN]
    var StreamName: js.UndefOr[StreamName]
  }

  @js.native
  @Factory
  trait UntagStreamOutput extends js.Object {}

  @js.native
  @Factory
  trait UpdateDataRetentionInput extends js.Object {
    var CurrentVersion: Version
    var DataRetentionChangeInHours: DataRetentionChangeInHours
    var Operation: UpdateDataRetentionOperation
    var StreamARN: js.UndefOr[ResourceARN]
    var StreamName: js.UndefOr[StreamName]
  }

  @js.native
  sealed trait UpdateDataRetentionOperation extends js.Any
  object UpdateDataRetentionOperation extends js.Object {
    val INCREASE_DATA_RETENTION = "INCREASE_DATA_RETENTION".asInstanceOf[UpdateDataRetentionOperation]
    val DECREASE_DATA_RETENTION = "DECREASE_DATA_RETENTION".asInstanceOf[UpdateDataRetentionOperation]

    val values = js.Object.freeze(js.Array(INCREASE_DATA_RETENTION, DECREASE_DATA_RETENTION))
  }

  @js.native
  @Factory
  trait UpdateDataRetentionOutput extends js.Object {}

  @js.native
  @Factory
  trait UpdateSignalingChannelInput extends js.Object {
    var ChannelARN: ResourceARN
    var CurrentVersion: Version
    var SingleMasterConfiguration: js.UndefOr[SingleMasterConfiguration]
  }

  @js.native
  @Factory
  trait UpdateSignalingChannelOutput extends js.Object {}

  @js.native
  @Factory
  trait UpdateStreamInput extends js.Object {
    var CurrentVersion: Version
    var DeviceName: js.UndefOr[DeviceName]
    var MediaType: js.UndefOr[MediaType]
    var StreamARN: js.UndefOr[ResourceARN]
    var StreamName: js.UndefOr[StreamName]
  }

  @js.native
  @Factory
  trait UpdateStreamOutput extends js.Object {}
}
