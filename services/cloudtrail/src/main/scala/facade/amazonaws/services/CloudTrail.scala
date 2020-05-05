package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object cloudtrail {
  type ByteBuffer                    = js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type DataResourceValues            = js.Array[String]
  type DataResources                 = js.Array[DataResource]
  type Date                          = js.Date
  type EventSelectors                = js.Array[EventSelector]
  type EventsList                    = js.Array[Event]
  type ExcludeManagementEventSources = js.Array[String]
  type InsightSelectors              = js.Array[InsightSelector]
  type LookupAttributesList          = js.Array[LookupAttribute]
  type MaxResults                    = Int
  type NextToken                     = String
  type PublicKeyList                 = js.Array[PublicKey]
  type ResourceIdList                = js.Array[String]
  type ResourceList                  = js.Array[Resource]
  type ResourceTagList               = js.Array[ResourceTag]
  type TagsList                      = js.Array[Tag]
  type TrailList                     = js.Array[Trail]
  type TrailNameList                 = js.Array[String]
  type Trails                        = js.Array[TrailInfo]

  implicit final class CloudTrailOps(private val service: CloudTrail) extends AnyVal {

    @inline def addTagsFuture(params: AddTagsRequest): Future[AddTagsResponse] =
      service.addTags(params).promise.toFuture
    @inline def createTrailFuture(params: CreateTrailRequest): Future[CreateTrailResponse] =
      service.createTrail(params).promise.toFuture
    @inline def deleteTrailFuture(params: DeleteTrailRequest): Future[DeleteTrailResponse] =
      service.deleteTrail(params).promise.toFuture
    @inline def describeTrailsFuture(params: DescribeTrailsRequest): Future[DescribeTrailsResponse] =
      service.describeTrails(params).promise.toFuture
    @inline def getEventSelectorsFuture(params: GetEventSelectorsRequest): Future[GetEventSelectorsResponse] =
      service.getEventSelectors(params).promise.toFuture
    @inline def getInsightSelectorsFuture(params: GetInsightSelectorsRequest): Future[GetInsightSelectorsResponse] =
      service.getInsightSelectors(params).promise.toFuture
    @inline def getTrailFuture(params: GetTrailRequest): Future[GetTrailResponse] =
      service.getTrail(params).promise.toFuture
    @inline def getTrailStatusFuture(params: GetTrailStatusRequest): Future[GetTrailStatusResponse] =
      service.getTrailStatus(params).promise.toFuture
    @inline def listPublicKeysFuture(params: ListPublicKeysRequest): Future[ListPublicKeysResponse] =
      service.listPublicKeys(params).promise.toFuture
    @inline def listTagsFuture(params: ListTagsRequest): Future[ListTagsResponse] =
      service.listTags(params).promise.toFuture
    @inline def listTrailsFuture(params: ListTrailsRequest): Future[ListTrailsResponse] =
      service.listTrails(params).promise.toFuture
    @inline def lookupEventsFuture(params: LookupEventsRequest): Future[LookupEventsResponse] =
      service.lookupEvents(params).promise.toFuture
    @inline def putEventSelectorsFuture(params: PutEventSelectorsRequest): Future[PutEventSelectorsResponse] =
      service.putEventSelectors(params).promise.toFuture
    @inline def putInsightSelectorsFuture(params: PutInsightSelectorsRequest): Future[PutInsightSelectorsResponse] =
      service.putInsightSelectors(params).promise.toFuture
    @inline def removeTagsFuture(params: RemoveTagsRequest): Future[RemoveTagsResponse] =
      service.removeTags(params).promise.toFuture
    @inline def startLoggingFuture(params: StartLoggingRequest): Future[StartLoggingResponse] =
      service.startLogging(params).promise.toFuture
    @inline def stopLoggingFuture(params: StopLoggingRequest): Future[StopLoggingResponse] =
      service.stopLogging(params).promise.toFuture
    @inline def updateTrailFuture(params: UpdateTrailRequest): Future[UpdateTrailResponse] =
      service.updateTrail(params).promise.toFuture
  }
}

package cloudtrail {
  @js.native
  @JSImport("aws-sdk", "CloudTrail")
  class CloudTrail() extends js.Object {
    def this(config: AWSConfig) = this()

    def addTags(params: AddTagsRequest): Request[AddTagsResponse]                                     = js.native
    def createTrail(params: CreateTrailRequest): Request[CreateTrailResponse]                         = js.native
    def deleteTrail(params: DeleteTrailRequest): Request[DeleteTrailResponse]                         = js.native
    def describeTrails(params: DescribeTrailsRequest): Request[DescribeTrailsResponse]                = js.native
    def getEventSelectors(params: GetEventSelectorsRequest): Request[GetEventSelectorsResponse]       = js.native
    def getInsightSelectors(params: GetInsightSelectorsRequest): Request[GetInsightSelectorsResponse] = js.native
    def getTrail(params: GetTrailRequest): Request[GetTrailResponse]                                  = js.native
    def getTrailStatus(params: GetTrailStatusRequest): Request[GetTrailStatusResponse]                = js.native
    def listPublicKeys(params: ListPublicKeysRequest): Request[ListPublicKeysResponse]                = js.native
    def listTags(params: ListTagsRequest): Request[ListTagsResponse]                                  = js.native
    def listTrails(params: ListTrailsRequest): Request[ListTrailsResponse]                            = js.native
    def lookupEvents(params: LookupEventsRequest): Request[LookupEventsResponse]                      = js.native
    def putEventSelectors(params: PutEventSelectorsRequest): Request[PutEventSelectorsResponse]       = js.native
    def putInsightSelectors(params: PutInsightSelectorsRequest): Request[PutInsightSelectorsResponse] = js.native
    def removeTags(params: RemoveTagsRequest): Request[RemoveTagsResponse]                            = js.native
    def startLogging(params: StartLoggingRequest): Request[StartLoggingResponse]                      = js.native
    def stopLogging(params: StopLoggingRequest): Request[StopLoggingResponse]                         = js.native
    def updateTrail(params: UpdateTrailRequest): Request[UpdateTrailResponse]                         = js.native
  }

  /**
    * Specifies the tags to add to a trail.
    */
  @js.native
  trait AddTagsRequest extends js.Object {
    var ResourceId: String
    var TagsList: js.UndefOr[TagsList]
  }

  object AddTagsRequest {
    @inline
    def apply(
        ResourceId: String,
        TagsList: js.UndefOr[TagsList] = js.undefined
    ): AddTagsRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )

      TagsList.foreach(__v => __obj.updateDynamic("TagsList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AddTagsRequest]
    }
  }

  /**
    * Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  trait AddTagsResponse extends js.Object {}

  object AddTagsResponse {
    @inline
    def apply(
    ): AddTagsResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[AddTagsResponse]
    }
  }

  /**
    * Specifies the settings for each trail.
    */
  @js.native
  trait CreateTrailRequest extends js.Object {
    var Name: String
    var S3BucketName: String
    var CloudWatchLogsLogGroupArn: js.UndefOr[String]
    var CloudWatchLogsRoleArn: js.UndefOr[String]
    var EnableLogFileValidation: js.UndefOr[Boolean]
    var IncludeGlobalServiceEvents: js.UndefOr[Boolean]
    var IsMultiRegionTrail: js.UndefOr[Boolean]
    var IsOrganizationTrail: js.UndefOr[Boolean]
    var KmsKeyId: js.UndefOr[String]
    var S3KeyPrefix: js.UndefOr[String]
    var SnsTopicName: js.UndefOr[String]
    var TagsList: js.UndefOr[TagsList]
  }

  object CreateTrailRequest {
    @inline
    def apply(
        Name: String,
        S3BucketName: String,
        CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.undefined,
        CloudWatchLogsRoleArn: js.UndefOr[String] = js.undefined,
        EnableLogFileValidation: js.UndefOr[Boolean] = js.undefined,
        IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.undefined,
        IsMultiRegionTrail: js.UndefOr[Boolean] = js.undefined,
        IsOrganizationTrail: js.UndefOr[Boolean] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        S3KeyPrefix: js.UndefOr[String] = js.undefined,
        SnsTopicName: js.UndefOr[String] = js.undefined,
        TagsList: js.UndefOr[TagsList] = js.undefined
    ): CreateTrailRequest = {
      val __obj = js.Dynamic.literal(
        "Name"         -> Name.asInstanceOf[js.Any],
        "S3BucketName" -> S3BucketName.asInstanceOf[js.Any]
      )

      CloudWatchLogsLogGroupArn.foreach(__v =>
        __obj.updateDynamic("CloudWatchLogsLogGroupArn")(__v.asInstanceOf[js.Any])
      )
      CloudWatchLogsRoleArn.foreach(__v => __obj.updateDynamic("CloudWatchLogsRoleArn")(__v.asInstanceOf[js.Any]))
      EnableLogFileValidation.foreach(__v => __obj.updateDynamic("EnableLogFileValidation")(__v.asInstanceOf[js.Any]))
      IncludeGlobalServiceEvents.foreach(__v =>
        __obj.updateDynamic("IncludeGlobalServiceEvents")(__v.asInstanceOf[js.Any])
      )
      IsMultiRegionTrail.foreach(__v => __obj.updateDynamic("IsMultiRegionTrail")(__v.asInstanceOf[js.Any]))
      IsOrganizationTrail.foreach(__v => __obj.updateDynamic("IsOrganizationTrail")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      S3KeyPrefix.foreach(__v => __obj.updateDynamic("S3KeyPrefix")(__v.asInstanceOf[js.Any]))
      SnsTopicName.foreach(__v => __obj.updateDynamic("SnsTopicName")(__v.asInstanceOf[js.Any]))
      TagsList.foreach(__v => __obj.updateDynamic("TagsList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTrailRequest]
    }
  }

  /**
    * Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  trait CreateTrailResponse extends js.Object {
    var CloudWatchLogsLogGroupArn: js.UndefOr[String]
    var CloudWatchLogsRoleArn: js.UndefOr[String]
    var IncludeGlobalServiceEvents: js.UndefOr[Boolean]
    var IsMultiRegionTrail: js.UndefOr[Boolean]
    var IsOrganizationTrail: js.UndefOr[Boolean]
    var KmsKeyId: js.UndefOr[String]
    var LogFileValidationEnabled: js.UndefOr[Boolean]
    var Name: js.UndefOr[String]
    var S3BucketName: js.UndefOr[String]
    var S3KeyPrefix: js.UndefOr[String]
    var SnsTopicARN: js.UndefOr[String]
    var SnsTopicName: js.UndefOr[String]
    var TrailARN: js.UndefOr[String]
  }

  object CreateTrailResponse {
    @inline
    def apply(
        CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.undefined,
        CloudWatchLogsRoleArn: js.UndefOr[String] = js.undefined,
        IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.undefined,
        IsMultiRegionTrail: js.UndefOr[Boolean] = js.undefined,
        IsOrganizationTrail: js.UndefOr[Boolean] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        LogFileValidationEnabled: js.UndefOr[Boolean] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        S3BucketName: js.UndefOr[String] = js.undefined,
        S3KeyPrefix: js.UndefOr[String] = js.undefined,
        SnsTopicARN: js.UndefOr[String] = js.undefined,
        SnsTopicName: js.UndefOr[String] = js.undefined,
        TrailARN: js.UndefOr[String] = js.undefined
    ): CreateTrailResponse = {
      val __obj = js.Dynamic.literal()
      CloudWatchLogsLogGroupArn.foreach(__v =>
        __obj.updateDynamic("CloudWatchLogsLogGroupArn")(__v.asInstanceOf[js.Any])
      )
      CloudWatchLogsRoleArn.foreach(__v => __obj.updateDynamic("CloudWatchLogsRoleArn")(__v.asInstanceOf[js.Any]))
      IncludeGlobalServiceEvents.foreach(__v =>
        __obj.updateDynamic("IncludeGlobalServiceEvents")(__v.asInstanceOf[js.Any])
      )
      IsMultiRegionTrail.foreach(__v => __obj.updateDynamic("IsMultiRegionTrail")(__v.asInstanceOf[js.Any]))
      IsOrganizationTrail.foreach(__v => __obj.updateDynamic("IsOrganizationTrail")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      LogFileValidationEnabled.foreach(__v => __obj.updateDynamic("LogFileValidationEnabled")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      S3BucketName.foreach(__v => __obj.updateDynamic("S3BucketName")(__v.asInstanceOf[js.Any]))
      S3KeyPrefix.foreach(__v => __obj.updateDynamic("S3KeyPrefix")(__v.asInstanceOf[js.Any]))
      SnsTopicARN.foreach(__v => __obj.updateDynamic("SnsTopicARN")(__v.asInstanceOf[js.Any]))
      SnsTopicName.foreach(__v => __obj.updateDynamic("SnsTopicName")(__v.asInstanceOf[js.Any]))
      TrailARN.foreach(__v => __obj.updateDynamic("TrailARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateTrailResponse]
    }
  }

  /**
    * The Amazon S3 buckets or AWS Lambda functions that you specify in your event selectors for your trail to log data events. Data events provide information about the resource operations performed on or within a resource itself. These are also known as data plane operations. You can specify up to 250 data resources for a trail.
    *
    * '''Note:'''The total number of allowed data resources is 250. This number can be distributed between 1 and 5 event selectors, but the total cannot exceed 250 across all selectors.
    * The following example demonstrates how logging works when you configure logging of all data events for an S3 bucket named <code>bucket-1</code>. In this example, the CloudTrail user specified an empty prefix, and the option to log both <code>Read</code> and <code>Write</code> data events.
    *  <ol> * A user uploads an image file to <code>bucket-1</code>.
    *  * The <code>PutObject</code> API operation is an Amazon S3 object-level API. It is recorded as a data event in CloudTrail. Because the CloudTrail user specified an S3 bucket with an empty prefix, events that occur on any object in that bucket are logged. The trail processes and logs the event.
    *  * A user uploads an object to an Amazon S3 bucket named <code>arn:aws:s3:::bucket-2</code>.
    *  * The <code>PutObject</code> API operation occurred for an object in an S3 bucket that the CloudTrail user didn't specify for the trail. The trail doesn’t log the event.
    *  </ol> The following example demonstrates how logging works when you configure logging of AWS Lambda data events for a Lambda function named <i>MyLambdaFunction</i>, but not for all AWS Lambda functions.
    *  <ol> * A user runs a script that includes a call to the <i>MyLambdaFunction</i> function and the <i>MyOtherLambdaFunction</i> function.
    *  * The <code>Invoke</code> API operation on <i>MyLambdaFunction</i> is an AWS Lambda API. It is recorded as a data event in CloudTrail. Because the CloudTrail user specified logging data events for <i>MyLambdaFunction</i>, any invocations of that function are logged. The trail processes and logs the event.
    *  * The <code>Invoke</code> API operation on <i>MyOtherLambdaFunction</i> is an AWS Lambda API. Because the CloudTrail user did not specify logging data events for all Lambda functions, the <code>Invoke</code> operation for <i>MyOtherLambdaFunction</i> does not match the function specified for the trail. The trail doesn’t log the event.
    *  </ol>
    */
  @js.native
  trait DataResource extends js.Object {
    var Type: js.UndefOr[String]
    var Values: js.UndefOr[DataResourceValues]
  }

  object DataResource {
    @inline
    def apply(
        Type: js.UndefOr[String] = js.undefined,
        Values: js.UndefOr[DataResourceValues] = js.undefined
    ): DataResource = {
      val __obj = js.Dynamic.literal()
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      Values.foreach(__v => __obj.updateDynamic("Values")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DataResource]
    }
  }

  /**
    * The request that specifies the name of a trail to delete.
    */
  @js.native
  trait DeleteTrailRequest extends js.Object {
    var Name: String
  }

  object DeleteTrailRequest {
    @inline
    def apply(
        Name: String
    ): DeleteTrailRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteTrailRequest]
    }
  }

  /**
    * Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  trait DeleteTrailResponse extends js.Object {}

  object DeleteTrailResponse {
    @inline
    def apply(
    ): DeleteTrailResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteTrailResponse]
    }
  }

  /**
    * Returns information about the trail.
    */
  @js.native
  trait DescribeTrailsRequest extends js.Object {
    var includeShadowTrails: js.UndefOr[Boolean]
    var trailNameList: js.UndefOr[TrailNameList]
  }

  object DescribeTrailsRequest {
    @inline
    def apply(
        includeShadowTrails: js.UndefOr[Boolean] = js.undefined,
        trailNameList: js.UndefOr[TrailNameList] = js.undefined
    ): DescribeTrailsRequest = {
      val __obj = js.Dynamic.literal()
      includeShadowTrails.foreach(__v => __obj.updateDynamic("includeShadowTrails")(__v.asInstanceOf[js.Any]))
      trailNameList.foreach(__v => __obj.updateDynamic("trailNameList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTrailsRequest]
    }
  }

  /**
    * Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  trait DescribeTrailsResponse extends js.Object {
    var trailList: js.UndefOr[TrailList]
  }

  object DescribeTrailsResponse {
    @inline
    def apply(
        trailList: js.UndefOr[TrailList] = js.undefined
    ): DescribeTrailsResponse = {
      val __obj = js.Dynamic.literal()
      trailList.foreach(__v => __obj.updateDynamic("trailList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeTrailsResponse]
    }
  }

  /**
    * Contains information about an event that was returned by a lookup request. The result includes a representation of a CloudTrail event.
    */
  @js.native
  trait Event extends js.Object {
    var AccessKeyId: js.UndefOr[String]
    var CloudTrailEvent: js.UndefOr[String]
    var EventId: js.UndefOr[String]
    var EventName: js.UndefOr[String]
    var EventSource: js.UndefOr[String]
    var EventTime: js.UndefOr[Date]
    var ReadOnly: js.UndefOr[String]
    var Resources: js.UndefOr[ResourceList]
    var Username: js.UndefOr[String]
  }

  object Event {
    @inline
    def apply(
        AccessKeyId: js.UndefOr[String] = js.undefined,
        CloudTrailEvent: js.UndefOr[String] = js.undefined,
        EventId: js.UndefOr[String] = js.undefined,
        EventName: js.UndefOr[String] = js.undefined,
        EventSource: js.UndefOr[String] = js.undefined,
        EventTime: js.UndefOr[Date] = js.undefined,
        ReadOnly: js.UndefOr[String] = js.undefined,
        Resources: js.UndefOr[ResourceList] = js.undefined,
        Username: js.UndefOr[String] = js.undefined
    ): Event = {
      val __obj = js.Dynamic.literal()
      AccessKeyId.foreach(__v => __obj.updateDynamic("AccessKeyId")(__v.asInstanceOf[js.Any]))
      CloudTrailEvent.foreach(__v => __obj.updateDynamic("CloudTrailEvent")(__v.asInstanceOf[js.Any]))
      EventId.foreach(__v => __obj.updateDynamic("EventId")(__v.asInstanceOf[js.Any]))
      EventName.foreach(__v => __obj.updateDynamic("EventName")(__v.asInstanceOf[js.Any]))
      EventSource.foreach(__v => __obj.updateDynamic("EventSource")(__v.asInstanceOf[js.Any]))
      EventTime.foreach(__v => __obj.updateDynamic("EventTime")(__v.asInstanceOf[js.Any]))
      ReadOnly.foreach(__v => __obj.updateDynamic("ReadOnly")(__v.asInstanceOf[js.Any]))
      Resources.foreach(__v => __obj.updateDynamic("Resources")(__v.asInstanceOf[js.Any]))
      Username.foreach(__v => __obj.updateDynamic("Username")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Event]
    }
  }
  @js.native
  sealed trait EventCategory extends js.Any
  object EventCategory extends js.Object {
    val insight = "insight".asInstanceOf[EventCategory]

    val values = js.Object.freeze(js.Array(insight))
  }

  /**
    * Use event selectors to further specify the management and data event settings for your trail. By default, trails created without specific event selectors will be configured to log all read and write management events, and no data events. When an event occurs in your account, CloudTrail evaluates the event selector for all trails. For each trail, if the event matches any event selector, the trail processes and logs the event. If the event doesn't match any event selector, the trail doesn't log the event.
    *  You can configure up to five event selectors for a trail.
    */
  @js.native
  trait EventSelector extends js.Object {
    var DataResources: js.UndefOr[DataResources]
    var ExcludeManagementEventSources: js.UndefOr[ExcludeManagementEventSources]
    var IncludeManagementEvents: js.UndefOr[Boolean]
    var ReadWriteType: js.UndefOr[ReadWriteType]
  }

  object EventSelector {
    @inline
    def apply(
        DataResources: js.UndefOr[DataResources] = js.undefined,
        ExcludeManagementEventSources: js.UndefOr[ExcludeManagementEventSources] = js.undefined,
        IncludeManagementEvents: js.UndefOr[Boolean] = js.undefined,
        ReadWriteType: js.UndefOr[ReadWriteType] = js.undefined
    ): EventSelector = {
      val __obj = js.Dynamic.literal()
      DataResources.foreach(__v => __obj.updateDynamic("DataResources")(__v.asInstanceOf[js.Any]))
      ExcludeManagementEventSources.foreach(__v =>
        __obj.updateDynamic("ExcludeManagementEventSources")(__v.asInstanceOf[js.Any])
      )
      IncludeManagementEvents.foreach(__v => __obj.updateDynamic("IncludeManagementEvents")(__v.asInstanceOf[js.Any]))
      ReadWriteType.foreach(__v => __obj.updateDynamic("ReadWriteType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[EventSelector]
    }
  }

  @js.native
  trait GetEventSelectorsRequest extends js.Object {
    var TrailName: String
  }

  object GetEventSelectorsRequest {
    @inline
    def apply(
        TrailName: String
    ): GetEventSelectorsRequest = {
      val __obj = js.Dynamic.literal(
        "TrailName" -> TrailName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetEventSelectorsRequest]
    }
  }

  @js.native
  trait GetEventSelectorsResponse extends js.Object {
    var EventSelectors: js.UndefOr[EventSelectors]
    var TrailARN: js.UndefOr[String]
  }

  object GetEventSelectorsResponse {
    @inline
    def apply(
        EventSelectors: js.UndefOr[EventSelectors] = js.undefined,
        TrailARN: js.UndefOr[String] = js.undefined
    ): GetEventSelectorsResponse = {
      val __obj = js.Dynamic.literal()
      EventSelectors.foreach(__v => __obj.updateDynamic("EventSelectors")(__v.asInstanceOf[js.Any]))
      TrailARN.foreach(__v => __obj.updateDynamic("TrailARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetEventSelectorsResponse]
    }
  }

  @js.native
  trait GetInsightSelectorsRequest extends js.Object {
    var TrailName: String
  }

  object GetInsightSelectorsRequest {
    @inline
    def apply(
        TrailName: String
    ): GetInsightSelectorsRequest = {
      val __obj = js.Dynamic.literal(
        "TrailName" -> TrailName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetInsightSelectorsRequest]
    }
  }

  @js.native
  trait GetInsightSelectorsResponse extends js.Object {
    var InsightSelectors: js.UndefOr[InsightSelectors]
    var TrailARN: js.UndefOr[String]
  }

  object GetInsightSelectorsResponse {
    @inline
    def apply(
        InsightSelectors: js.UndefOr[InsightSelectors] = js.undefined,
        TrailARN: js.UndefOr[String] = js.undefined
    ): GetInsightSelectorsResponse = {
      val __obj = js.Dynamic.literal()
      InsightSelectors.foreach(__v => __obj.updateDynamic("InsightSelectors")(__v.asInstanceOf[js.Any]))
      TrailARN.foreach(__v => __obj.updateDynamic("TrailARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInsightSelectorsResponse]
    }
  }

  @js.native
  trait GetTrailRequest extends js.Object {
    var Name: String
  }

  object GetTrailRequest {
    @inline
    def apply(
        Name: String
    ): GetTrailRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetTrailRequest]
    }
  }

  @js.native
  trait GetTrailResponse extends js.Object {
    var Trail: js.UndefOr[Trail]
  }

  object GetTrailResponse {
    @inline
    def apply(
        Trail: js.UndefOr[Trail] = js.undefined
    ): GetTrailResponse = {
      val __obj = js.Dynamic.literal()
      Trail.foreach(__v => __obj.updateDynamic("Trail")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTrailResponse]
    }
  }

  /**
    * The name of a trail about which you want the current status.
    */
  @js.native
  trait GetTrailStatusRequest extends js.Object {
    var Name: String
  }

  object GetTrailStatusRequest {
    @inline
    def apply(
        Name: String
    ): GetTrailStatusRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetTrailStatusRequest]
    }
  }

  /**
    * Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  trait GetTrailStatusResponse extends js.Object {
    var IsLogging: js.UndefOr[Boolean]
    var LatestCloudWatchLogsDeliveryError: js.UndefOr[String]
    var LatestCloudWatchLogsDeliveryTime: js.UndefOr[Date]
    var LatestDeliveryAttemptSucceeded: js.UndefOr[String]
    var LatestDeliveryAttemptTime: js.UndefOr[String]
    var LatestDeliveryError: js.UndefOr[String]
    var LatestDeliveryTime: js.UndefOr[Date]
    var LatestDigestDeliveryError: js.UndefOr[String]
    var LatestDigestDeliveryTime: js.UndefOr[Date]
    var LatestNotificationAttemptSucceeded: js.UndefOr[String]
    var LatestNotificationAttemptTime: js.UndefOr[String]
    var LatestNotificationError: js.UndefOr[String]
    var LatestNotificationTime: js.UndefOr[Date]
    var StartLoggingTime: js.UndefOr[Date]
    var StopLoggingTime: js.UndefOr[Date]
    var TimeLoggingStarted: js.UndefOr[String]
    var TimeLoggingStopped: js.UndefOr[String]
  }

  object GetTrailStatusResponse {
    @inline
    def apply(
        IsLogging: js.UndefOr[Boolean] = js.undefined,
        LatestCloudWatchLogsDeliveryError: js.UndefOr[String] = js.undefined,
        LatestCloudWatchLogsDeliveryTime: js.UndefOr[Date] = js.undefined,
        LatestDeliveryAttemptSucceeded: js.UndefOr[String] = js.undefined,
        LatestDeliveryAttemptTime: js.UndefOr[String] = js.undefined,
        LatestDeliveryError: js.UndefOr[String] = js.undefined,
        LatestDeliveryTime: js.UndefOr[Date] = js.undefined,
        LatestDigestDeliveryError: js.UndefOr[String] = js.undefined,
        LatestDigestDeliveryTime: js.UndefOr[Date] = js.undefined,
        LatestNotificationAttemptSucceeded: js.UndefOr[String] = js.undefined,
        LatestNotificationAttemptTime: js.UndefOr[String] = js.undefined,
        LatestNotificationError: js.UndefOr[String] = js.undefined,
        LatestNotificationTime: js.UndefOr[Date] = js.undefined,
        StartLoggingTime: js.UndefOr[Date] = js.undefined,
        StopLoggingTime: js.UndefOr[Date] = js.undefined,
        TimeLoggingStarted: js.UndefOr[String] = js.undefined,
        TimeLoggingStopped: js.UndefOr[String] = js.undefined
    ): GetTrailStatusResponse = {
      val __obj = js.Dynamic.literal()
      IsLogging.foreach(__v => __obj.updateDynamic("IsLogging")(__v.asInstanceOf[js.Any]))
      LatestCloudWatchLogsDeliveryError.foreach(__v =>
        __obj.updateDynamic("LatestCloudWatchLogsDeliveryError")(__v.asInstanceOf[js.Any])
      )
      LatestCloudWatchLogsDeliveryTime.foreach(__v =>
        __obj.updateDynamic("LatestCloudWatchLogsDeliveryTime")(__v.asInstanceOf[js.Any])
      )
      LatestDeliveryAttemptSucceeded.foreach(__v =>
        __obj.updateDynamic("LatestDeliveryAttemptSucceeded")(__v.asInstanceOf[js.Any])
      )
      LatestDeliveryAttemptTime.foreach(__v =>
        __obj.updateDynamic("LatestDeliveryAttemptTime")(__v.asInstanceOf[js.Any])
      )
      LatestDeliveryError.foreach(__v => __obj.updateDynamic("LatestDeliveryError")(__v.asInstanceOf[js.Any]))
      LatestDeliveryTime.foreach(__v => __obj.updateDynamic("LatestDeliveryTime")(__v.asInstanceOf[js.Any]))
      LatestDigestDeliveryError.foreach(__v =>
        __obj.updateDynamic("LatestDigestDeliveryError")(__v.asInstanceOf[js.Any])
      )
      LatestDigestDeliveryTime.foreach(__v => __obj.updateDynamic("LatestDigestDeliveryTime")(__v.asInstanceOf[js.Any]))
      LatestNotificationAttemptSucceeded.foreach(__v =>
        __obj.updateDynamic("LatestNotificationAttemptSucceeded")(__v.asInstanceOf[js.Any])
      )
      LatestNotificationAttemptTime.foreach(__v =>
        __obj.updateDynamic("LatestNotificationAttemptTime")(__v.asInstanceOf[js.Any])
      )
      LatestNotificationError.foreach(__v => __obj.updateDynamic("LatestNotificationError")(__v.asInstanceOf[js.Any]))
      LatestNotificationTime.foreach(__v => __obj.updateDynamic("LatestNotificationTime")(__v.asInstanceOf[js.Any]))
      StartLoggingTime.foreach(__v => __obj.updateDynamic("StartLoggingTime")(__v.asInstanceOf[js.Any]))
      StopLoggingTime.foreach(__v => __obj.updateDynamic("StopLoggingTime")(__v.asInstanceOf[js.Any]))
      TimeLoggingStarted.foreach(__v => __obj.updateDynamic("TimeLoggingStarted")(__v.asInstanceOf[js.Any]))
      TimeLoggingStopped.foreach(__v => __obj.updateDynamic("TimeLoggingStopped")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetTrailStatusResponse]
    }
  }

  /**
    * A JSON string that contains a list of insight types that are logged on a trail.
    */
  @js.native
  trait InsightSelector extends js.Object {
    var InsightType: js.UndefOr[InsightType]
  }

  object InsightSelector {
    @inline
    def apply(
        InsightType: js.UndefOr[InsightType] = js.undefined
    ): InsightSelector = {
      val __obj = js.Dynamic.literal()
      InsightType.foreach(__v => __obj.updateDynamic("InsightType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InsightSelector]
    }
  }
  @js.native
  sealed trait InsightType extends js.Any
  object InsightType extends js.Object {
    val ApiCallRateInsight = "ApiCallRateInsight".asInstanceOf[InsightType]

    val values = js.Object.freeze(js.Array(ApiCallRateInsight))
  }

  /**
    * Requests the public keys for a specified time range.
    */
  @js.native
  trait ListPublicKeysRequest extends js.Object {
    var EndTime: js.UndefOr[Date]
    var NextToken: js.UndefOr[String]
    var StartTime: js.UndefOr[Date]
  }

  object ListPublicKeysRequest {
    @inline
    def apply(
        EndTime: js.UndefOr[Date] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        StartTime: js.UndefOr[Date] = js.undefined
    ): ListPublicKeysRequest = {
      val __obj = js.Dynamic.literal()
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPublicKeysRequest]
    }
  }

  /**
    * Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  trait ListPublicKeysResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var PublicKeyList: js.UndefOr[PublicKeyList]
  }

  object ListPublicKeysResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        PublicKeyList: js.UndefOr[PublicKeyList] = js.undefined
    ): ListPublicKeysResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      PublicKeyList.foreach(__v => __obj.updateDynamic("PublicKeyList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListPublicKeysResponse]
    }
  }

  /**
    * Specifies a list of trail tags to return.
    */
  @js.native
  trait ListTagsRequest extends js.Object {
    var ResourceIdList: ResourceIdList
    var NextToken: js.UndefOr[String]
  }

  object ListTagsRequest {
    @inline
    def apply(
        ResourceIdList: ResourceIdList,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListTagsRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceIdList" -> ResourceIdList.asInstanceOf[js.Any]
      )

      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsRequest]
    }
  }

  /**
    * Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  trait ListTagsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var ResourceTagList: js.UndefOr[ResourceTagList]
  }

  object ListTagsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        ResourceTagList: js.UndefOr[ResourceTagList] = js.undefined
    ): ListTagsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      ResourceTagList.foreach(__v => __obj.updateDynamic("ResourceTagList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsResponse]
    }
  }

  @js.native
  trait ListTrailsRequest extends js.Object {
    var NextToken: js.UndefOr[String]
  }

  object ListTrailsRequest {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined
    ): ListTrailsRequest = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTrailsRequest]
    }
  }

  @js.native
  trait ListTrailsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var Trails: js.UndefOr[Trails]
  }

  object ListTrailsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        Trails: js.UndefOr[Trails] = js.undefined
    ): ListTrailsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Trails.foreach(__v => __obj.updateDynamic("Trails")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTrailsResponse]
    }
  }

  /**
    * Specifies an attribute and value that filter the events returned.
    */
  @js.native
  trait LookupAttribute extends js.Object {
    var AttributeKey: LookupAttributeKey
    var AttributeValue: String
  }

  object LookupAttribute {
    @inline
    def apply(
        AttributeKey: LookupAttributeKey,
        AttributeValue: String
    ): LookupAttribute = {
      val __obj = js.Dynamic.literal(
        "AttributeKey"   -> AttributeKey.asInstanceOf[js.Any],
        "AttributeValue" -> AttributeValue.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[LookupAttribute]
    }
  }
  @js.native
  sealed trait LookupAttributeKey extends js.Any
  object LookupAttributeKey extends js.Object {
    val EventId      = "EventId".asInstanceOf[LookupAttributeKey]
    val EventName    = "EventName".asInstanceOf[LookupAttributeKey]
    val ReadOnly     = "ReadOnly".asInstanceOf[LookupAttributeKey]
    val Username     = "Username".asInstanceOf[LookupAttributeKey]
    val ResourceType = "ResourceType".asInstanceOf[LookupAttributeKey]
    val ResourceName = "ResourceName".asInstanceOf[LookupAttributeKey]
    val EventSource  = "EventSource".asInstanceOf[LookupAttributeKey]
    val AccessKeyId  = "AccessKeyId".asInstanceOf[LookupAttributeKey]

    val values = js.Object.freeze(
      js.Array(EventId, EventName, ReadOnly, Username, ResourceType, ResourceName, EventSource, AccessKeyId)
    )
  }

  /**
    * Contains a request for LookupEvents.
    */
  @js.native
  trait LookupEventsRequest extends js.Object {
    var EndTime: js.UndefOr[Date]
    var EventCategory: js.UndefOr[EventCategory]
    var LookupAttributes: js.UndefOr[LookupAttributesList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var StartTime: js.UndefOr[Date]
  }

  object LookupEventsRequest {
    @inline
    def apply(
        EndTime: js.UndefOr[Date] = js.undefined,
        EventCategory: js.UndefOr[EventCategory] = js.undefined,
        LookupAttributes: js.UndefOr[LookupAttributesList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        StartTime: js.UndefOr[Date] = js.undefined
    ): LookupEventsRequest = {
      val __obj = js.Dynamic.literal()
      EndTime.foreach(__v => __obj.updateDynamic("EndTime")(__v.asInstanceOf[js.Any]))
      EventCategory.foreach(__v => __obj.updateDynamic("EventCategory")(__v.asInstanceOf[js.Any]))
      LookupAttributes.foreach(__v => __obj.updateDynamic("LookupAttributes")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      StartTime.foreach(__v => __obj.updateDynamic("StartTime")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LookupEventsRequest]
    }
  }

  /**
    * Contains a response to a LookupEvents action.
    */
  @js.native
  trait LookupEventsResponse extends js.Object {
    var Events: js.UndefOr[EventsList]
    var NextToken: js.UndefOr[NextToken]
  }

  object LookupEventsResponse {
    @inline
    def apply(
        Events: js.UndefOr[EventsList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): LookupEventsResponse = {
      val __obj = js.Dynamic.literal()
      Events.foreach(__v => __obj.updateDynamic("Events")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[LookupEventsResponse]
    }
  }

  /**
    * Contains information about a returned public key.
    */
  @js.native
  trait PublicKey extends js.Object {
    var Fingerprint: js.UndefOr[String]
    var ValidityEndTime: js.UndefOr[Date]
    var ValidityStartTime: js.UndefOr[Date]
    var Value: js.UndefOr[ByteBuffer]
  }

  object PublicKey {
    @inline
    def apply(
        Fingerprint: js.UndefOr[String] = js.undefined,
        ValidityEndTime: js.UndefOr[Date] = js.undefined,
        ValidityStartTime: js.UndefOr[Date] = js.undefined,
        Value: js.UndefOr[ByteBuffer] = js.undefined
    ): PublicKey = {
      val __obj = js.Dynamic.literal()
      Fingerprint.foreach(__v => __obj.updateDynamic("Fingerprint")(__v.asInstanceOf[js.Any]))
      ValidityEndTime.foreach(__v => __obj.updateDynamic("ValidityEndTime")(__v.asInstanceOf[js.Any]))
      ValidityStartTime.foreach(__v => __obj.updateDynamic("ValidityStartTime")(__v.asInstanceOf[js.Any]))
      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PublicKey]
    }
  }

  @js.native
  trait PutEventSelectorsRequest extends js.Object {
    var EventSelectors: EventSelectors
    var TrailName: String
  }

  object PutEventSelectorsRequest {
    @inline
    def apply(
        EventSelectors: EventSelectors,
        TrailName: String
    ): PutEventSelectorsRequest = {
      val __obj = js.Dynamic.literal(
        "EventSelectors" -> EventSelectors.asInstanceOf[js.Any],
        "TrailName"      -> TrailName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutEventSelectorsRequest]
    }
  }

  @js.native
  trait PutEventSelectorsResponse extends js.Object {
    var EventSelectors: js.UndefOr[EventSelectors]
    var TrailARN: js.UndefOr[String]
  }

  object PutEventSelectorsResponse {
    @inline
    def apply(
        EventSelectors: js.UndefOr[EventSelectors] = js.undefined,
        TrailARN: js.UndefOr[String] = js.undefined
    ): PutEventSelectorsResponse = {
      val __obj = js.Dynamic.literal()
      EventSelectors.foreach(__v => __obj.updateDynamic("EventSelectors")(__v.asInstanceOf[js.Any]))
      TrailARN.foreach(__v => __obj.updateDynamic("TrailARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutEventSelectorsResponse]
    }
  }

  @js.native
  trait PutInsightSelectorsRequest extends js.Object {
    var InsightSelectors: InsightSelectors
    var TrailName: String
  }

  object PutInsightSelectorsRequest {
    @inline
    def apply(
        InsightSelectors: InsightSelectors,
        TrailName: String
    ): PutInsightSelectorsRequest = {
      val __obj = js.Dynamic.literal(
        "InsightSelectors" -> InsightSelectors.asInstanceOf[js.Any],
        "TrailName"        -> TrailName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PutInsightSelectorsRequest]
    }
  }

  @js.native
  trait PutInsightSelectorsResponse extends js.Object {
    var InsightSelectors: js.UndefOr[InsightSelectors]
    var TrailARN: js.UndefOr[String]
  }

  object PutInsightSelectorsResponse {
    @inline
    def apply(
        InsightSelectors: js.UndefOr[InsightSelectors] = js.undefined,
        TrailARN: js.UndefOr[String] = js.undefined
    ): PutInsightSelectorsResponse = {
      val __obj = js.Dynamic.literal()
      InsightSelectors.foreach(__v => __obj.updateDynamic("InsightSelectors")(__v.asInstanceOf[js.Any]))
      TrailARN.foreach(__v => __obj.updateDynamic("TrailARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PutInsightSelectorsResponse]
    }
  }
  @js.native
  sealed trait ReadWriteType extends js.Any
  object ReadWriteType extends js.Object {
    val ReadOnly  = "ReadOnly".asInstanceOf[ReadWriteType]
    val WriteOnly = "WriteOnly".asInstanceOf[ReadWriteType]
    val All       = "All".asInstanceOf[ReadWriteType]

    val values = js.Object.freeze(js.Array(ReadOnly, WriteOnly, All))
  }

  /**
    * Specifies the tags to remove from a trail.
    */
  @js.native
  trait RemoveTagsRequest extends js.Object {
    var ResourceId: String
    var TagsList: js.UndefOr[TagsList]
  }

  object RemoveTagsRequest {
    @inline
    def apply(
        ResourceId: String,
        TagsList: js.UndefOr[TagsList] = js.undefined
    ): RemoveTagsRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceId" -> ResourceId.asInstanceOf[js.Any]
      )

      TagsList.foreach(__v => __obj.updateDynamic("TagsList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RemoveTagsRequest]
    }
  }

  /**
    * Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  trait RemoveTagsResponse extends js.Object {}

  object RemoveTagsResponse {
    @inline
    def apply(
    ): RemoveTagsResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[RemoveTagsResponse]
    }
  }

  /**
    * Specifies the type and name of a resource referenced by an event.
    */
  @js.native
  trait Resource extends js.Object {
    var ResourceName: js.UndefOr[String]
    var ResourceType: js.UndefOr[String]
  }

  object Resource {
    @inline
    def apply(
        ResourceName: js.UndefOr[String] = js.undefined,
        ResourceType: js.UndefOr[String] = js.undefined
    ): Resource = {
      val __obj = js.Dynamic.literal()
      ResourceName.foreach(__v => __obj.updateDynamic("ResourceName")(__v.asInstanceOf[js.Any]))
      ResourceType.foreach(__v => __obj.updateDynamic("ResourceType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Resource]
    }
  }

  /**
    * A resource tag.
    */
  @js.native
  trait ResourceTag extends js.Object {
    var ResourceId: js.UndefOr[String]
    var TagsList: js.UndefOr[TagsList]
  }

  object ResourceTag {
    @inline
    def apply(
        ResourceId: js.UndefOr[String] = js.undefined,
        TagsList: js.UndefOr[TagsList] = js.undefined
    ): ResourceTag = {
      val __obj = js.Dynamic.literal()
      ResourceId.foreach(__v => __obj.updateDynamic("ResourceId")(__v.asInstanceOf[js.Any]))
      TagsList.foreach(__v => __obj.updateDynamic("TagsList")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceTag]
    }
  }

  /**
    * The request to CloudTrail to start logging AWS API calls for an account.
    */
  @js.native
  trait StartLoggingRequest extends js.Object {
    var Name: String
  }

  object StartLoggingRequest {
    @inline
    def apply(
        Name: String
    ): StartLoggingRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StartLoggingRequest]
    }
  }

  /**
    * Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  trait StartLoggingResponse extends js.Object {}

  object StartLoggingResponse {
    @inline
    def apply(
    ): StartLoggingResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[StartLoggingResponse]
    }
  }

  /**
    * Passes the request to CloudTrail to stop logging AWS API calls for the specified account.
    */
  @js.native
  trait StopLoggingRequest extends js.Object {
    var Name: String
  }

  object StopLoggingRequest {
    @inline
    def apply(
        Name: String
    ): StopLoggingRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[StopLoggingRequest]
    }
  }

  /**
    * Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  trait StopLoggingResponse extends js.Object {}

  object StopLoggingResponse {
    @inline
    def apply(
    ): StopLoggingResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[StopLoggingResponse]
    }
  }

  /**
    * A custom key-value pair associated with a resource such as a CloudTrail trail.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: String
    var Value: js.UndefOr[String]
  }

  object Tag {
    @inline
    def apply(
        Key: String,
        Value: js.UndefOr[String] = js.undefined
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any]
      )

      Value.foreach(__v => __obj.updateDynamic("Value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Tag]
    }
  }

  /**
    * The settings for a trail.
    */
  @js.native
  trait Trail extends js.Object {
    var CloudWatchLogsLogGroupArn: js.UndefOr[String]
    var CloudWatchLogsRoleArn: js.UndefOr[String]
    var HasCustomEventSelectors: js.UndefOr[Boolean]
    var HasInsightSelectors: js.UndefOr[Boolean]
    var HomeRegion: js.UndefOr[String]
    var IncludeGlobalServiceEvents: js.UndefOr[Boolean]
    var IsMultiRegionTrail: js.UndefOr[Boolean]
    var IsOrganizationTrail: js.UndefOr[Boolean]
    var KmsKeyId: js.UndefOr[String]
    var LogFileValidationEnabled: js.UndefOr[Boolean]
    var Name: js.UndefOr[String]
    var S3BucketName: js.UndefOr[String]
    var S3KeyPrefix: js.UndefOr[String]
    var SnsTopicARN: js.UndefOr[String]
    var SnsTopicName: js.UndefOr[String]
    var TrailARN: js.UndefOr[String]
  }

  object Trail {
    @inline
    def apply(
        CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.undefined,
        CloudWatchLogsRoleArn: js.UndefOr[String] = js.undefined,
        HasCustomEventSelectors: js.UndefOr[Boolean] = js.undefined,
        HasInsightSelectors: js.UndefOr[Boolean] = js.undefined,
        HomeRegion: js.UndefOr[String] = js.undefined,
        IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.undefined,
        IsMultiRegionTrail: js.UndefOr[Boolean] = js.undefined,
        IsOrganizationTrail: js.UndefOr[Boolean] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        LogFileValidationEnabled: js.UndefOr[Boolean] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        S3BucketName: js.UndefOr[String] = js.undefined,
        S3KeyPrefix: js.UndefOr[String] = js.undefined,
        SnsTopicARN: js.UndefOr[String] = js.undefined,
        SnsTopicName: js.UndefOr[String] = js.undefined,
        TrailARN: js.UndefOr[String] = js.undefined
    ): Trail = {
      val __obj = js.Dynamic.literal()
      CloudWatchLogsLogGroupArn.foreach(__v =>
        __obj.updateDynamic("CloudWatchLogsLogGroupArn")(__v.asInstanceOf[js.Any])
      )
      CloudWatchLogsRoleArn.foreach(__v => __obj.updateDynamic("CloudWatchLogsRoleArn")(__v.asInstanceOf[js.Any]))
      HasCustomEventSelectors.foreach(__v => __obj.updateDynamic("HasCustomEventSelectors")(__v.asInstanceOf[js.Any]))
      HasInsightSelectors.foreach(__v => __obj.updateDynamic("HasInsightSelectors")(__v.asInstanceOf[js.Any]))
      HomeRegion.foreach(__v => __obj.updateDynamic("HomeRegion")(__v.asInstanceOf[js.Any]))
      IncludeGlobalServiceEvents.foreach(__v =>
        __obj.updateDynamic("IncludeGlobalServiceEvents")(__v.asInstanceOf[js.Any])
      )
      IsMultiRegionTrail.foreach(__v => __obj.updateDynamic("IsMultiRegionTrail")(__v.asInstanceOf[js.Any]))
      IsOrganizationTrail.foreach(__v => __obj.updateDynamic("IsOrganizationTrail")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      LogFileValidationEnabled.foreach(__v => __obj.updateDynamic("LogFileValidationEnabled")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      S3BucketName.foreach(__v => __obj.updateDynamic("S3BucketName")(__v.asInstanceOf[js.Any]))
      S3KeyPrefix.foreach(__v => __obj.updateDynamic("S3KeyPrefix")(__v.asInstanceOf[js.Any]))
      SnsTopicARN.foreach(__v => __obj.updateDynamic("SnsTopicARN")(__v.asInstanceOf[js.Any]))
      SnsTopicName.foreach(__v => __obj.updateDynamic("SnsTopicName")(__v.asInstanceOf[js.Any]))
      TrailARN.foreach(__v => __obj.updateDynamic("TrailARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Trail]
    }
  }

  /**
    * Information about a CloudTrail trail, including the trail's name, home region, and Amazon Resource Name (ARN).
    */
  @js.native
  trait TrailInfo extends js.Object {
    var HomeRegion: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var TrailARN: js.UndefOr[String]
  }

  object TrailInfo {
    @inline
    def apply(
        HomeRegion: js.UndefOr[String] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        TrailARN: js.UndefOr[String] = js.undefined
    ): TrailInfo = {
      val __obj = js.Dynamic.literal()
      HomeRegion.foreach(__v => __obj.updateDynamic("HomeRegion")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      TrailARN.foreach(__v => __obj.updateDynamic("TrailARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TrailInfo]
    }
  }

  /**
    * Specifies settings to update for the trail.
    */
  @js.native
  trait UpdateTrailRequest extends js.Object {
    var Name: String
    var CloudWatchLogsLogGroupArn: js.UndefOr[String]
    var CloudWatchLogsRoleArn: js.UndefOr[String]
    var EnableLogFileValidation: js.UndefOr[Boolean]
    var IncludeGlobalServiceEvents: js.UndefOr[Boolean]
    var IsMultiRegionTrail: js.UndefOr[Boolean]
    var IsOrganizationTrail: js.UndefOr[Boolean]
    var KmsKeyId: js.UndefOr[String]
    var S3BucketName: js.UndefOr[String]
    var S3KeyPrefix: js.UndefOr[String]
    var SnsTopicName: js.UndefOr[String]
  }

  object UpdateTrailRequest {
    @inline
    def apply(
        Name: String,
        CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.undefined,
        CloudWatchLogsRoleArn: js.UndefOr[String] = js.undefined,
        EnableLogFileValidation: js.UndefOr[Boolean] = js.undefined,
        IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.undefined,
        IsMultiRegionTrail: js.UndefOr[Boolean] = js.undefined,
        IsOrganizationTrail: js.UndefOr[Boolean] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        S3BucketName: js.UndefOr[String] = js.undefined,
        S3KeyPrefix: js.UndefOr[String] = js.undefined,
        SnsTopicName: js.UndefOr[String] = js.undefined
    ): UpdateTrailRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CloudWatchLogsLogGroupArn.foreach(__v =>
        __obj.updateDynamic("CloudWatchLogsLogGroupArn")(__v.asInstanceOf[js.Any])
      )
      CloudWatchLogsRoleArn.foreach(__v => __obj.updateDynamic("CloudWatchLogsRoleArn")(__v.asInstanceOf[js.Any]))
      EnableLogFileValidation.foreach(__v => __obj.updateDynamic("EnableLogFileValidation")(__v.asInstanceOf[js.Any]))
      IncludeGlobalServiceEvents.foreach(__v =>
        __obj.updateDynamic("IncludeGlobalServiceEvents")(__v.asInstanceOf[js.Any])
      )
      IsMultiRegionTrail.foreach(__v => __obj.updateDynamic("IsMultiRegionTrail")(__v.asInstanceOf[js.Any]))
      IsOrganizationTrail.foreach(__v => __obj.updateDynamic("IsOrganizationTrail")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      S3BucketName.foreach(__v => __obj.updateDynamic("S3BucketName")(__v.asInstanceOf[js.Any]))
      S3KeyPrefix.foreach(__v => __obj.updateDynamic("S3KeyPrefix")(__v.asInstanceOf[js.Any]))
      SnsTopicName.foreach(__v => __obj.updateDynamic("SnsTopicName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTrailRequest]
    }
  }

  /**
    * Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  trait UpdateTrailResponse extends js.Object {
    var CloudWatchLogsLogGroupArn: js.UndefOr[String]
    var CloudWatchLogsRoleArn: js.UndefOr[String]
    var IncludeGlobalServiceEvents: js.UndefOr[Boolean]
    var IsMultiRegionTrail: js.UndefOr[Boolean]
    var IsOrganizationTrail: js.UndefOr[Boolean]
    var KmsKeyId: js.UndefOr[String]
    var LogFileValidationEnabled: js.UndefOr[Boolean]
    var Name: js.UndefOr[String]
    var S3BucketName: js.UndefOr[String]
    var S3KeyPrefix: js.UndefOr[String]
    var SnsTopicARN: js.UndefOr[String]
    var SnsTopicName: js.UndefOr[String]
    var TrailARN: js.UndefOr[String]
  }

  object UpdateTrailResponse {
    @inline
    def apply(
        CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.undefined,
        CloudWatchLogsRoleArn: js.UndefOr[String] = js.undefined,
        IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.undefined,
        IsMultiRegionTrail: js.UndefOr[Boolean] = js.undefined,
        IsOrganizationTrail: js.UndefOr[Boolean] = js.undefined,
        KmsKeyId: js.UndefOr[String] = js.undefined,
        LogFileValidationEnabled: js.UndefOr[Boolean] = js.undefined,
        Name: js.UndefOr[String] = js.undefined,
        S3BucketName: js.UndefOr[String] = js.undefined,
        S3KeyPrefix: js.UndefOr[String] = js.undefined,
        SnsTopicARN: js.UndefOr[String] = js.undefined,
        SnsTopicName: js.UndefOr[String] = js.undefined,
        TrailARN: js.UndefOr[String] = js.undefined
    ): UpdateTrailResponse = {
      val __obj = js.Dynamic.literal()
      CloudWatchLogsLogGroupArn.foreach(__v =>
        __obj.updateDynamic("CloudWatchLogsLogGroupArn")(__v.asInstanceOf[js.Any])
      )
      CloudWatchLogsRoleArn.foreach(__v => __obj.updateDynamic("CloudWatchLogsRoleArn")(__v.asInstanceOf[js.Any]))
      IncludeGlobalServiceEvents.foreach(__v =>
        __obj.updateDynamic("IncludeGlobalServiceEvents")(__v.asInstanceOf[js.Any])
      )
      IsMultiRegionTrail.foreach(__v => __obj.updateDynamic("IsMultiRegionTrail")(__v.asInstanceOf[js.Any]))
      IsOrganizationTrail.foreach(__v => __obj.updateDynamic("IsOrganizationTrail")(__v.asInstanceOf[js.Any]))
      KmsKeyId.foreach(__v => __obj.updateDynamic("KmsKeyId")(__v.asInstanceOf[js.Any]))
      LogFileValidationEnabled.foreach(__v => __obj.updateDynamic("LogFileValidationEnabled")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      S3BucketName.foreach(__v => __obj.updateDynamic("S3BucketName")(__v.asInstanceOf[js.Any]))
      S3KeyPrefix.foreach(__v => __obj.updateDynamic("S3KeyPrefix")(__v.asInstanceOf[js.Any]))
      SnsTopicARN.foreach(__v => __obj.updateDynamic("SnsTopicARN")(__v.asInstanceOf[js.Any]))
      SnsTopicName.foreach(__v => __obj.updateDynamic("SnsTopicName")(__v.asInstanceOf[js.Any]))
      TrailARN.foreach(__v => __obj.updateDynamic("TrailARN")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateTrailResponse]
    }
  }
}
