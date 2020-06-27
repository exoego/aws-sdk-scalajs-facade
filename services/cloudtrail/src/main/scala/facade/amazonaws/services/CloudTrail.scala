package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

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
      service.addTags(params).promise().toFuture
    @inline def createTrailFuture(params: CreateTrailRequest): Future[CreateTrailResponse] =
      service.createTrail(params).promise().toFuture
    @inline def deleteTrailFuture(params: DeleteTrailRequest): Future[DeleteTrailResponse] =
      service.deleteTrail(params).promise().toFuture
    @inline def describeTrailsFuture(params: DescribeTrailsRequest): Future[DescribeTrailsResponse] =
      service.describeTrails(params).promise().toFuture
    @inline def getEventSelectorsFuture(params: GetEventSelectorsRequest): Future[GetEventSelectorsResponse] =
      service.getEventSelectors(params).promise().toFuture
    @inline def getInsightSelectorsFuture(params: GetInsightSelectorsRequest): Future[GetInsightSelectorsResponse] =
      service.getInsightSelectors(params).promise().toFuture
    @inline def getTrailFuture(params: GetTrailRequest): Future[GetTrailResponse] =
      service.getTrail(params).promise().toFuture
    @inline def getTrailStatusFuture(params: GetTrailStatusRequest): Future[GetTrailStatusResponse] =
      service.getTrailStatus(params).promise().toFuture
    @inline def listPublicKeysFuture(params: ListPublicKeysRequest): Future[ListPublicKeysResponse] =
      service.listPublicKeys(params).promise().toFuture
    @inline def listTagsFuture(params: ListTagsRequest): Future[ListTagsResponse] =
      service.listTags(params).promise().toFuture
    @inline def listTrailsFuture(params: ListTrailsRequest): Future[ListTrailsResponse] =
      service.listTrails(params).promise().toFuture
    @inline def lookupEventsFuture(params: LookupEventsRequest): Future[LookupEventsResponse] =
      service.lookupEvents(params).promise().toFuture
    @inline def putEventSelectorsFuture(params: PutEventSelectorsRequest): Future[PutEventSelectorsResponse] =
      service.putEventSelectors(params).promise().toFuture
    @inline def putInsightSelectorsFuture(params: PutInsightSelectorsRequest): Future[PutInsightSelectorsResponse] =
      service.putInsightSelectors(params).promise().toFuture
    @inline def removeTagsFuture(params: RemoveTagsRequest): Future[RemoveTagsResponse] =
      service.removeTags(params).promise().toFuture
    @inline def startLoggingFuture(params: StartLoggingRequest): Future[StartLoggingResponse] =
      service.startLogging(params).promise().toFuture
    @inline def stopLoggingFuture(params: StopLoggingRequest): Future[StopLoggingResponse] =
      service.stopLogging(params).promise().toFuture
    @inline def updateTrailFuture(params: UpdateTrailRequest): Future[UpdateTrailResponse] =
      service.updateTrail(params).promise().toFuture
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
  @Factory
  trait AddTagsRequest extends js.Object {
    var ResourceId: String
    var TagsList: js.UndefOr[TagsList]
  }

  /**
    * Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  @Factory
  trait AddTagsResponse extends js.Object {}

  /**
    * Specifies the settings for each trail.
    */
  @js.native
  @Factory
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

  /**
    * Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  @Factory
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
  @Factory
  trait DataResource extends js.Object {
    var Type: js.UndefOr[String]
    var Values: js.UndefOr[DataResourceValues]
  }

  /**
    * The request that specifies the name of a trail to delete.
    */
  @js.native
  @Factory
  trait DeleteTrailRequest extends js.Object {
    var Name: String
  }

  /**
    * Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  @Factory
  trait DeleteTrailResponse extends js.Object {}

  /**
    * Returns information about the trail.
    */
  @js.native
  @Factory
  trait DescribeTrailsRequest extends js.Object {
    var includeShadowTrails: js.UndefOr[Boolean]
    var trailNameList: js.UndefOr[TrailNameList]
  }

  /**
    * Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  @Factory
  trait DescribeTrailsResponse extends js.Object {
    var trailList: js.UndefOr[TrailList]
  }

  /**
    * Contains information about an event that was returned by a lookup request. The result includes a representation of a CloudTrail event.
    */
  @js.native
  @Factory
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
  @Factory
  trait EventSelector extends js.Object {
    var DataResources: js.UndefOr[DataResources]
    var ExcludeManagementEventSources: js.UndefOr[ExcludeManagementEventSources]
    var IncludeManagementEvents: js.UndefOr[Boolean]
    var ReadWriteType: js.UndefOr[ReadWriteType]
  }

  @js.native
  @Factory
  trait GetEventSelectorsRequest extends js.Object {
    var TrailName: String
  }

  @js.native
  @Factory
  trait GetEventSelectorsResponse extends js.Object {
    var EventSelectors: js.UndefOr[EventSelectors]
    var TrailARN: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetInsightSelectorsRequest extends js.Object {
    var TrailName: String
  }

  @js.native
  @Factory
  trait GetInsightSelectorsResponse extends js.Object {
    var InsightSelectors: js.UndefOr[InsightSelectors]
    var TrailARN: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait GetTrailRequest extends js.Object {
    var Name: String
  }

  @js.native
  @Factory
  trait GetTrailResponse extends js.Object {
    var Trail: js.UndefOr[Trail]
  }

  /**
    * The name of a trail about which you want the current status.
    */
  @js.native
  @Factory
  trait GetTrailStatusRequest extends js.Object {
    var Name: String
  }

  /**
    * Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  @Factory
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

  /**
    * A JSON string that contains a list of insight types that are logged on a trail.
    */
  @js.native
  @Factory
  trait InsightSelector extends js.Object {
    var InsightType: js.UndefOr[InsightType]
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
  @Factory
  trait ListPublicKeysRequest extends js.Object {
    var EndTime: js.UndefOr[Date]
    var NextToken: js.UndefOr[String]
    var StartTime: js.UndefOr[Date]
  }

  /**
    * Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  @Factory
  trait ListPublicKeysResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var PublicKeyList: js.UndefOr[PublicKeyList]
  }

  /**
    * Specifies a list of trail tags to return.
    */
  @js.native
  @Factory
  trait ListTagsRequest extends js.Object {
    var ResourceIdList: ResourceIdList
    var NextToken: js.UndefOr[String]
  }

  /**
    * Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  @Factory
  trait ListTagsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var ResourceTagList: js.UndefOr[ResourceTagList]
  }

  @js.native
  @Factory
  trait ListTrailsRequest extends js.Object {
    var NextToken: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait ListTrailsResponse extends js.Object {
    var NextToken: js.UndefOr[String]
    var Trails: js.UndefOr[Trails]
  }

  /**
    * Specifies an attribute and value that filter the events returned.
    */
  @js.native
  @Factory
  trait LookupAttribute extends js.Object {
    var AttributeKey: LookupAttributeKey
    var AttributeValue: String
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
  @Factory
  trait LookupEventsRequest extends js.Object {
    var EndTime: js.UndefOr[Date]
    var EventCategory: js.UndefOr[EventCategory]
    var LookupAttributes: js.UndefOr[LookupAttributesList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var StartTime: js.UndefOr[Date]
  }

  /**
    * Contains a response to a LookupEvents action.
    */
  @js.native
  @Factory
  trait LookupEventsResponse extends js.Object {
    var Events: js.UndefOr[EventsList]
    var NextToken: js.UndefOr[NextToken]
  }

  /**
    * Contains information about a returned public key.
    */
  @js.native
  @Factory
  trait PublicKey extends js.Object {
    var Fingerprint: js.UndefOr[String]
    var ValidityEndTime: js.UndefOr[Date]
    var ValidityStartTime: js.UndefOr[Date]
    var Value: js.UndefOr[ByteBuffer]
  }

  @js.native
  @Factory
  trait PutEventSelectorsRequest extends js.Object {
    var EventSelectors: EventSelectors
    var TrailName: String
  }

  @js.native
  @Factory
  trait PutEventSelectorsResponse extends js.Object {
    var EventSelectors: js.UndefOr[EventSelectors]
    var TrailARN: js.UndefOr[String]
  }

  @js.native
  @Factory
  trait PutInsightSelectorsRequest extends js.Object {
    var InsightSelectors: InsightSelectors
    var TrailName: String
  }

  @js.native
  @Factory
  trait PutInsightSelectorsResponse extends js.Object {
    var InsightSelectors: js.UndefOr[InsightSelectors]
    var TrailARN: js.UndefOr[String]
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
  @Factory
  trait RemoveTagsRequest extends js.Object {
    var ResourceId: String
    var TagsList: js.UndefOr[TagsList]
  }

  /**
    * Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  @Factory
  trait RemoveTagsResponse extends js.Object {}

  /**
    * Specifies the type and name of a resource referenced by an event.
    */
  @js.native
  @Factory
  trait Resource extends js.Object {
    var ResourceName: js.UndefOr[String]
    var ResourceType: js.UndefOr[String]
  }

  /**
    * A resource tag.
    */
  @js.native
  @Factory
  trait ResourceTag extends js.Object {
    var ResourceId: js.UndefOr[String]
    var TagsList: js.UndefOr[TagsList]
  }

  /**
    * The request to CloudTrail to start logging AWS API calls for an account.
    */
  @js.native
  @Factory
  trait StartLoggingRequest extends js.Object {
    var Name: String
  }

  /**
    * Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  @Factory
  trait StartLoggingResponse extends js.Object {}

  /**
    * Passes the request to CloudTrail to stop logging AWS API calls for the specified account.
    */
  @js.native
  @Factory
  trait StopLoggingRequest extends js.Object {
    var Name: String
  }

  /**
    * Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  @Factory
  trait StopLoggingResponse extends js.Object {}

  /**
    * A custom key-value pair associated with a resource such as a CloudTrail trail.
    */
  @js.native
  @Factory
  trait Tag extends js.Object {
    var Key: String
    var Value: js.UndefOr[String]
  }

  /**
    * The settings for a trail.
    */
  @js.native
  @Factory
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

  /**
    * Information about a CloudTrail trail, including the trail's name, home region, and Amazon Resource Name (ARN).
    */
  @js.native
  @Factory
  trait TrailInfo extends js.Object {
    var HomeRegion: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var TrailARN: js.UndefOr[String]
  }

  /**
    * Specifies settings to update for the trail.
    */
  @js.native
  @Factory
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

  /**
    * Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  @Factory
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
}
