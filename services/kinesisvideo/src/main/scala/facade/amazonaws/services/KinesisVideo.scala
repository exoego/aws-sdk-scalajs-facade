package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object kinesisvideo {
  type APIName                      = String
  type ComparisonOperator           = String
  type DataEndpoint                 = String
  type DataRetentionChangeInHours   = Int
  type DataRetentionInHours         = Int
  type DeviceName                   = String
  type KmsKeyId                     = String
  type ListStreamsInputLimit        = Int
  type MediaType                    = String
  type NextToken                    = String
  type ResourceARN                  = String
  type ResourceTags                 = js.Dictionary[TagValue]
  type Status                       = String
  type StreamInfoList               = js.Array[StreamInfo]
  type StreamName                   = String
  type TagKey                       = String
  type TagKeyList                   = js.Array[TagKey]
  type TagValue                     = String
  type Timestamp                    = js.Date
  type UpdateDataRetentionOperation = String
  type Version                      = String

  implicit final class KinesisVideoOps(private val service: KinesisVideo) extends AnyVal {

    @inline def createStreamFuture(params: CreateStreamInput): Future[CreateStreamOutput] =
      service.createStream(params).promise.toFuture
    @inline def deleteStreamFuture(params: DeleteStreamInput): Future[DeleteStreamOutput] =
      service.deleteStream(params).promise.toFuture
    @inline def describeStreamFuture(params: DescribeStreamInput): Future[DescribeStreamOutput] =
      service.describeStream(params).promise.toFuture
    @inline def getDataEndpointFuture(params: GetDataEndpointInput): Future[GetDataEndpointOutput] =
      service.getDataEndpoint(params).promise.toFuture
    @inline def listStreamsFuture(params: ListStreamsInput): Future[ListStreamsOutput] =
      service.listStreams(params).promise.toFuture
    @inline def listTagsForStreamFuture(params: ListTagsForStreamInput): Future[ListTagsForStreamOutput] =
      service.listTagsForStream(params).promise.toFuture
    @inline def tagStreamFuture(params: TagStreamInput): Future[TagStreamOutput] =
      service.tagStream(params).promise.toFuture
    @inline def untagStreamFuture(params: UntagStreamInput): Future[UntagStreamOutput] =
      service.untagStream(params).promise.toFuture
    @inline def updateDataRetentionFuture(params: UpdateDataRetentionInput): Future[UpdateDataRetentionOutput] =
      service.updateDataRetention(params).promise.toFuture
    @inline def updateStreamFuture(params: UpdateStreamInput): Future[UpdateStreamOutput] =
      service.updateStream(params).promise.toFuture
  }
}

package kinesisvideo {
  @js.native
  @JSImport("aws-sdk", "KinesisVideo")
  class KinesisVideo() extends js.Object {
    def this(config: AWSConfig) = this()

    def createStream(params: CreateStreamInput): Request[CreateStreamOutput]                      = js.native
    def deleteStream(params: DeleteStreamInput): Request[DeleteStreamOutput]                      = js.native
    def describeStream(params: DescribeStreamInput): Request[DescribeStreamOutput]                = js.native
    def getDataEndpoint(params: GetDataEndpointInput): Request[GetDataEndpointOutput]             = js.native
    def listStreams(params: ListStreamsInput): Request[ListStreamsOutput]                         = js.native
    def listTagsForStream(params: ListTagsForStreamInput): Request[ListTagsForStreamOutput]       = js.native
    def tagStream(params: TagStreamInput): Request[TagStreamOutput]                               = js.native
    def untagStream(params: UntagStreamInput): Request[UntagStreamOutput]                         = js.native
    def updateDataRetention(params: UpdateDataRetentionInput): Request[UpdateDataRetentionOutput] = js.native
    def updateStream(params: UpdateStreamInput): Request[UpdateStreamOutput]                      = js.native
  }

  object APINameEnum {
    val PUT_MEDIA                      = "PUT_MEDIA"
    val GET_MEDIA                      = "GET_MEDIA"
    val LIST_FRAGMENTS                 = "LIST_FRAGMENTS"
    val GET_MEDIA_FOR_FRAGMENT_LIST    = "GET_MEDIA_FOR_FRAGMENT_LIST"
    val GET_HLS_STREAMING_SESSION_URL  = "GET_HLS_STREAMING_SESSION_URL"
    val GET_DASH_STREAMING_SESSION_URL = "GET_DASH_STREAMING_SESSION_URL"

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

  object ComparisonOperatorEnum {
    val BEGINS_WITH = "BEGINS_WITH"

    val values = js.Object.freeze(js.Array(BEGINS_WITH))
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

  object StatusEnum {
    val CREATING = "CREATING"
    val ACTIVE   = "ACTIVE"
    val UPDATING = "UPDATING"
    val DELETING = "DELETING"

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
        "CurrentVersion"             -> CurrentVersion.asInstanceOf[js.Any],
        "DataRetentionChangeInHours" -> DataRetentionChangeInHours.asInstanceOf[js.Any],
        "Operation"                  -> Operation.asInstanceOf[js.Any]
      )

      StreamARN.foreach(__v => __obj.updateDynamic("StreamARN")(__v.asInstanceOf[js.Any]))
      StreamName.foreach(__v => __obj.updateDynamic("StreamName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDataRetentionInput]
    }
  }

  object UpdateDataRetentionOperationEnum {
    val INCREASE_DATA_RETENTION = "INCREASE_DATA_RETENTION"
    val DECREASE_DATA_RETENTION = "DECREASE_DATA_RETENTION"

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
