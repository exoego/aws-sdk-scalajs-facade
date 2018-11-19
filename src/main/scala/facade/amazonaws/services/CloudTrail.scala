package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object cloudtrail {
  type ByteBuffer = nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type DataResourceValues = js.Array[String]
  type DataResources = js.Array[DataResource]
  type Date = js.Date
  type EventSelectors = js.Array[EventSelector]
  type EventsList = js.Array[Event]
  type LookupAttributeKey = String
  type LookupAttributesList = js.Array[LookupAttribute]
  type MaxResults = Int
  type NextToken = String
  type PublicKeyList = js.Array[PublicKey]
  type ReadWriteType = String
  type ResourceIdList = js.Array[String]
  type ResourceList = js.Array[Resource]
  type ResourceTagList = js.Array[ResourceTag]
  type TagsList = js.Array[Tag]
  type TrailList = js.Array[Trail]
  type TrailNameList = js.Array[String]
}

package cloudtrail {
  @js.native
  @JSImport("aws-sdk", "CloudTrail")
  class CloudTrail(config: AWSConfig) extends js.Object {
    def addTags(params: AddTagsRequest): Request[AddTagsResponse] = js.native
    def createTrail(params: CreateTrailRequest): Request[CreateTrailResponse] = js.native
    def deleteTrail(params: DeleteTrailRequest): Request[DeleteTrailResponse] = js.native
    def describeTrails(params: DescribeTrailsRequest): Request[DescribeTrailsResponse] = js.native
    def getEventSelectors(params: GetEventSelectorsRequest): Request[GetEventSelectorsResponse] = js.native
    def getTrailStatus(params: GetTrailStatusRequest): Request[GetTrailStatusResponse] = js.native
    def listPublicKeys(params: ListPublicKeysRequest): Request[ListPublicKeysResponse] = js.native
    def listTags(params: ListTagsRequest): Request[ListTagsResponse] = js.native
    def lookupEvents(params: LookupEventsRequest): Request[LookupEventsResponse] = js.native
    def putEventSelectors(params: PutEventSelectorsRequest): Request[PutEventSelectorsResponse] = js.native
    def removeTags(params: RemoveTagsRequest): Request[RemoveTagsResponse] = js.native
    def startLogging(params: StartLoggingRequest): Request[StartLoggingResponse] = js.native
    def stopLogging(params: StopLoggingRequest): Request[StopLoggingResponse] = js.native
    def updateTrail(params: UpdateTrailRequest): Request[UpdateTrailResponse] = js.native
  }

  /**
   * <p>Specifies the tags to add to a trail.</p>
   */
  @js.native
  trait AddTagsRequest extends js.Object {
    var ResourceId: js.UndefOr[String]
    var TagsList: js.UndefOr[TagsList]
  }

  object AddTagsRequest {
    def apply(
      ResourceId: js.UndefOr[String] = js.undefined,
      TagsList: js.UndefOr[TagsList] = js.undefined): AddTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "TagsList" -> TagsList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsRequest]
    }
  }

  /**
   * <p>Returns the objects or data listed below if successful. Otherwise, returns an error.</p>
   */
  @js.native
  trait AddTagsResponse extends js.Object {

  }

  object AddTagsResponse {
    def apply(): AddTagsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsResponse]
    }
  }

  /**
   * <p>Specifies the settings for each trail.</p>
   */
  @js.native
  trait CreateTrailRequest extends js.Object {
    var CloudWatchLogsRoleArn: js.UndefOr[String]
    var CloudWatchLogsLogGroupArn: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var IsMultiRegionTrail: js.UndefOr[Boolean]
    var S3BucketName: js.UndefOr[String]
    var SnsTopicName: js.UndefOr[String]
    var S3KeyPrefix: js.UndefOr[String]
    var EnableLogFileValidation: js.UndefOr[Boolean]
    var IncludeGlobalServiceEvents: js.UndefOr[Boolean]
  }

  object CreateTrailRequest {
    def apply(
      CloudWatchLogsRoleArn: js.UndefOr[String] = js.undefined,
      CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      IsMultiRegionTrail: js.UndefOr[Boolean] = js.undefined,
      S3BucketName: js.UndefOr[String] = js.undefined,
      SnsTopicName: js.UndefOr[String] = js.undefined,
      S3KeyPrefix: js.UndefOr[String] = js.undefined,
      EnableLogFileValidation: js.UndefOr[Boolean] = js.undefined,
      IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.undefined): CreateTrailRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudWatchLogsRoleArn" -> CloudWatchLogsRoleArn.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLogsLogGroupArn" -> CloudWatchLogsLogGroupArn.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "IsMultiRegionTrail" -> IsMultiRegionTrail.map { x => x.asInstanceOf[js.Any] },
        "S3BucketName" -> S3BucketName.map { x => x.asInstanceOf[js.Any] },
        "SnsTopicName" -> SnsTopicName.map { x => x.asInstanceOf[js.Any] },
        "S3KeyPrefix" -> S3KeyPrefix.map { x => x.asInstanceOf[js.Any] },
        "EnableLogFileValidation" -> EnableLogFileValidation.map { x => x.asInstanceOf[js.Any] },
        "IncludeGlobalServiceEvents" -> IncludeGlobalServiceEvents.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTrailRequest]
    }
  }

  /**
   * <p>Returns the objects or data listed below if successful. Otherwise, returns an error.</p>
   */
  @js.native
  trait CreateTrailResponse extends js.Object {
    var CloudWatchLogsRoleArn: js.UndefOr[String]
    var CloudWatchLogsLogGroupArn: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var SnsTopicARN: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var IsMultiRegionTrail: js.UndefOr[Boolean]
    var S3BucketName: js.UndefOr[String]
    var SnsTopicName: js.UndefOr[String]
    var LogFileValidationEnabled: js.UndefOr[Boolean]
    var S3KeyPrefix: js.UndefOr[String]
    var IncludeGlobalServiceEvents: js.UndefOr[Boolean]
    var TrailARN: js.UndefOr[String]
  }

  object CreateTrailResponse {
    def apply(
      CloudWatchLogsRoleArn: js.UndefOr[String] = js.undefined,
      CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      SnsTopicARN: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      IsMultiRegionTrail: js.UndefOr[Boolean] = js.undefined,
      S3BucketName: js.UndefOr[String] = js.undefined,
      SnsTopicName: js.UndefOr[String] = js.undefined,
      LogFileValidationEnabled: js.UndefOr[Boolean] = js.undefined,
      S3KeyPrefix: js.UndefOr[String] = js.undefined,
      IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.undefined,
      TrailARN: js.UndefOr[String] = js.undefined): CreateTrailResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudWatchLogsRoleArn" -> CloudWatchLogsRoleArn.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLogsLogGroupArn" -> CloudWatchLogsLogGroupArn.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "SnsTopicARN" -> SnsTopicARN.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "IsMultiRegionTrail" -> IsMultiRegionTrail.map { x => x.asInstanceOf[js.Any] },
        "S3BucketName" -> S3BucketName.map { x => x.asInstanceOf[js.Any] },
        "SnsTopicName" -> SnsTopicName.map { x => x.asInstanceOf[js.Any] },
        "LogFileValidationEnabled" -> LogFileValidationEnabled.map { x => x.asInstanceOf[js.Any] },
        "S3KeyPrefix" -> S3KeyPrefix.map { x => x.asInstanceOf[js.Any] },
        "IncludeGlobalServiceEvents" -> IncludeGlobalServiceEvents.map { x => x.asInstanceOf[js.Any] },
        "TrailARN" -> TrailARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTrailResponse]
    }
  }

  /**
   * <p>The Amazon S3 buckets or AWS Lambda functions that you specify in your event selectors for your trail to log data events. Data events provide insight into the resource operations performed on or within a resource itself. These are also known as data plane operations. You can specify up to 250 data resources for a trail.</p> <note> <p>The total number of allowed data resources is 250. This number can be distributed between 1 and 5 event selectors, but the total cannot exceed 250 across all selectors.</p> </note> <p>The following example demonstrates how logging works when you configure logging of all data events for an S3 bucket named <code>bucket-1</code>. In this example, the CloudTrail user spcified an empty prefix, and the option to log both <code>Read</code> and <code>Write</code> data events.</p> <ol> <li> <p>A user uploads an image file to <code>bucket-1</code>.</p> </li> <li> <p>The <code>PutObject</code> API operation is an Amazon S3 object-level API. It is recorded as a data event in CloudTrail. Because the CloudTrail user specified an S3 bucket with an empty prefix, events that occur on any object in that bucket are logged. The trail processes and logs the event.</p> </li> <li> <p>A user uploads an object to an Amazon S3 bucket named <code>arn:aws:s3:::bucket-2</code>.</p> </li> <li> <p>The <code>PutObject</code> API operation occurred for an object in an S3 bucket that the CloudTrail user didn't specify for the trail. The trail doesn’t log the event.</p> </li> </ol> <p>The following example demonstrates how logging works when you configure logging of AWS Lambda data events for a Lambda function named <i>MyLambdaFunction</i>, but not for all AWS Lambda functions.</p> <ol> <li> <p>A user runs a script that includes a call to the <i>MyLambdaFunction</i> function and the <i>MyOtherLambdaFunction</i> function.</p> </li> <li> <p>The <code>Invoke</code> API operation on <i>MyLambdaFunction</i> is an AWS Lambda API. It is recorded as a data event in CloudTrail. Because the CloudTrail user specified logging data events for <i>MyLambdaFunction</i>, any invocations of that function are logged. The trail processes and logs the event. </p> </li> <li> <p>The <code>Invoke</code> API operation on <i>MyOtherLambdaFunction</i> is an AWS Lambda API. Because the CloudTrail user did not specify logging data events for all Lambda functions, the <code>Invoke</code> operation for <i>MyOtherLambdaFunction</i> does not match the function specified for the trail. The trail doesn’t log the event. </p> </li> </ol>
   */
  @js.native
  trait DataResource extends js.Object {
    var Type: js.UndefOr[String]
    var Values: js.UndefOr[DataResourceValues]
  }

  object DataResource {
    def apply(
      Type: js.UndefOr[String] = js.undefined,
      Values: js.UndefOr[DataResourceValues] = js.undefined): DataResource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DataResource]
    }
  }

  /**
   * <p>The request that specifies the name of a trail to delete.</p>
   */
  @js.native
  trait DeleteTrailRequest extends js.Object {
    var Name: js.UndefOr[String]
  }

  object DeleteTrailRequest {
    def apply(
      Name: js.UndefOr[String] = js.undefined): DeleteTrailRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTrailRequest]
    }
  }

  /**
   * <p>Returns the objects or data listed below if successful. Otherwise, returns an error.</p>
   */
  @js.native
  trait DeleteTrailResponse extends js.Object {

  }

  object DeleteTrailResponse {
    def apply(): DeleteTrailResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTrailResponse]
    }
  }

  /**
   * <p>Returns information about the trail.</p>
   */
  @js.native
  trait DescribeTrailsRequest extends js.Object {
    var trailNameList: js.UndefOr[TrailNameList]
    var includeShadowTrails: js.UndefOr[Boolean]
  }

  object DescribeTrailsRequest {
    def apply(
      trailNameList: js.UndefOr[TrailNameList] = js.undefined,
      includeShadowTrails: js.UndefOr[Boolean] = js.undefined): DescribeTrailsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "trailNameList" -> trailNameList.map { x => x.asInstanceOf[js.Any] },
        "includeShadowTrails" -> includeShadowTrails.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTrailsRequest]
    }
  }

  /**
   * <p>Returns the objects or data listed below if successful. Otherwise, returns an error.</p>
   */
  @js.native
  trait DescribeTrailsResponse extends js.Object {
    var trailList: js.UndefOr[TrailList]
  }

  object DescribeTrailsResponse {
    def apply(
      trailList: js.UndefOr[TrailList] = js.undefined): DescribeTrailsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "trailList" -> trailList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTrailsResponse]
    }
  }

  /**
   * <p>Contains information about an event that was returned by a lookup request. The result includes a representation of a CloudTrail event.</p>
   */
  @js.native
  trait Event extends js.Object {
    var Username: js.UndefOr[String]
    var Resources: js.UndefOr[ResourceList]
    var EventSource: js.UndefOr[String]
    var CloudTrailEvent: js.UndefOr[String]
    var EventId: js.UndefOr[String]
    var AccessKeyId: js.UndefOr[String]
    var ReadOnly: js.UndefOr[String]
    var EventTime: js.UndefOr[Date]
    var EventName: js.UndefOr[String]
  }

  object Event {
    def apply(
      Username: js.UndefOr[String] = js.undefined,
      Resources: js.UndefOr[ResourceList] = js.undefined,
      EventSource: js.UndefOr[String] = js.undefined,
      CloudTrailEvent: js.UndefOr[String] = js.undefined,
      EventId: js.UndefOr[String] = js.undefined,
      AccessKeyId: js.UndefOr[String] = js.undefined,
      ReadOnly: js.UndefOr[String] = js.undefined,
      EventTime: js.UndefOr[Date] = js.undefined,
      EventName: js.UndefOr[String] = js.undefined): Event = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Username" -> Username.map { x => x.asInstanceOf[js.Any] },
        "Resources" -> Resources.map { x => x.asInstanceOf[js.Any] },
        "EventSource" -> EventSource.map { x => x.asInstanceOf[js.Any] },
        "CloudTrailEvent" -> CloudTrailEvent.map { x => x.asInstanceOf[js.Any] },
        "EventId" -> EventId.map { x => x.asInstanceOf[js.Any] },
        "AccessKeyId" -> AccessKeyId.map { x => x.asInstanceOf[js.Any] },
        "ReadOnly" -> ReadOnly.map { x => x.asInstanceOf[js.Any] },
        "EventTime" -> EventTime.map { x => x.asInstanceOf[js.Any] },
        "EventName" -> EventName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Event]
    }
  }

  /**
   * <p>Use event selectors to further specify the management and data event settings for your trail. By default, trails created without specific event selectors will be configured to log all read and write management events, and no data events. When an event occurs in your account, CloudTrail evaluates the event selector for all trails. For each trail, if the event matches any event selector, the trail processes and logs the event. If the event doesn't match any event selector, the trail doesn't log the event.</p> <p>You can configure up to five event selectors for a trail.</p>
   */
  @js.native
  trait EventSelector extends js.Object {
    var ReadWriteType: js.UndefOr[ReadWriteType]
    var IncludeManagementEvents: js.UndefOr[Boolean]
    var DataResources: js.UndefOr[DataResources]
  }

  object EventSelector {
    def apply(
      ReadWriteType: js.UndefOr[ReadWriteType] = js.undefined,
      IncludeManagementEvents: js.UndefOr[Boolean] = js.undefined,
      DataResources: js.UndefOr[DataResources] = js.undefined): EventSelector = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ReadWriteType" -> ReadWriteType.map { x => x.asInstanceOf[js.Any] },
        "IncludeManagementEvents" -> IncludeManagementEvents.map { x => x.asInstanceOf[js.Any] },
        "DataResources" -> DataResources.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventSelector]
    }
  }

  @js.native
  trait GetEventSelectorsRequest extends js.Object {
    var TrailName: js.UndefOr[String]
  }

  object GetEventSelectorsRequest {
    def apply(
      TrailName: js.UndefOr[String] = js.undefined): GetEventSelectorsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrailName" -> TrailName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEventSelectorsRequest]
    }
  }

  @js.native
  trait GetEventSelectorsResponse extends js.Object {
    var TrailARN: js.UndefOr[String]
    var EventSelectors: js.UndefOr[EventSelectors]
  }

  object GetEventSelectorsResponse {
    def apply(
      TrailARN: js.UndefOr[String] = js.undefined,
      EventSelectors: js.UndefOr[EventSelectors] = js.undefined): GetEventSelectorsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrailARN" -> TrailARN.map { x => x.asInstanceOf[js.Any] },
        "EventSelectors" -> EventSelectors.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEventSelectorsResponse]
    }
  }

  /**
   * <p>The name of a trail about which you want the current status.</p>
   */
  @js.native
  trait GetTrailStatusRequest extends js.Object {
    var Name: js.UndefOr[String]
  }

  object GetTrailStatusRequest {
    def apply(
      Name: js.UndefOr[String] = js.undefined): GetTrailStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTrailStatusRequest]
    }
  }

  /**
   * <p>Returns the objects or data listed below if successful. Otherwise, returns an error.</p>
   */
  @js.native
  trait GetTrailStatusResponse extends js.Object {
    var LatestDeliveryAttemptTime: js.UndefOr[String]
    var LatestNotificationTime: js.UndefOr[Date]
    var LatestNotificationAttemptTime: js.UndefOr[String]
    var TimeLoggingStopped: js.UndefOr[String]
    var IsLogging: js.UndefOr[Boolean]
    var StopLoggingTime: js.UndefOr[Date]
    var LatestNotificationError: js.UndefOr[String]
    var LatestCloudWatchLogsDeliveryTime: js.UndefOr[Date]
    var LatestDigestDeliveryTime: js.UndefOr[Date]
    var LatestDeliveryAttemptSucceeded: js.UndefOr[String]
    var LatestCloudWatchLogsDeliveryError: js.UndefOr[String]
    var LatestDigestDeliveryError: js.UndefOr[String]
    var LatestDeliveryTime: js.UndefOr[Date]
    var StartLoggingTime: js.UndefOr[Date]
    var TimeLoggingStarted: js.UndefOr[String]
    var LatestDeliveryError: js.UndefOr[String]
    var LatestNotificationAttemptSucceeded: js.UndefOr[String]
  }

  object GetTrailStatusResponse {
    def apply(
      LatestDeliveryAttemptTime: js.UndefOr[String] = js.undefined,
      LatestNotificationTime: js.UndefOr[Date] = js.undefined,
      LatestNotificationAttemptTime: js.UndefOr[String] = js.undefined,
      TimeLoggingStopped: js.UndefOr[String] = js.undefined,
      IsLogging: js.UndefOr[Boolean] = js.undefined,
      StopLoggingTime: js.UndefOr[Date] = js.undefined,
      LatestNotificationError: js.UndefOr[String] = js.undefined,
      LatestCloudWatchLogsDeliveryTime: js.UndefOr[Date] = js.undefined,
      LatestDigestDeliveryTime: js.UndefOr[Date] = js.undefined,
      LatestDeliveryAttemptSucceeded: js.UndefOr[String] = js.undefined,
      LatestCloudWatchLogsDeliveryError: js.UndefOr[String] = js.undefined,
      LatestDigestDeliveryError: js.UndefOr[String] = js.undefined,
      LatestDeliveryTime: js.UndefOr[Date] = js.undefined,
      StartLoggingTime: js.UndefOr[Date] = js.undefined,
      TimeLoggingStarted: js.UndefOr[String] = js.undefined,
      LatestDeliveryError: js.UndefOr[String] = js.undefined,
      LatestNotificationAttemptSucceeded: js.UndefOr[String] = js.undefined): GetTrailStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "LatestDeliveryAttemptTime" -> LatestDeliveryAttemptTime.map { x => x.asInstanceOf[js.Any] },
        "LatestNotificationTime" -> LatestNotificationTime.map { x => x.asInstanceOf[js.Any] },
        "LatestNotificationAttemptTime" -> LatestNotificationAttemptTime.map { x => x.asInstanceOf[js.Any] },
        "TimeLoggingStopped" -> TimeLoggingStopped.map { x => x.asInstanceOf[js.Any] },
        "IsLogging" -> IsLogging.map { x => x.asInstanceOf[js.Any] },
        "StopLoggingTime" -> StopLoggingTime.map { x => x.asInstanceOf[js.Any] },
        "LatestNotificationError" -> LatestNotificationError.map { x => x.asInstanceOf[js.Any] },
        "LatestCloudWatchLogsDeliveryTime" -> LatestCloudWatchLogsDeliveryTime.map { x => x.asInstanceOf[js.Any] },
        "LatestDigestDeliveryTime" -> LatestDigestDeliveryTime.map { x => x.asInstanceOf[js.Any] },
        "LatestDeliveryAttemptSucceeded" -> LatestDeliveryAttemptSucceeded.map { x => x.asInstanceOf[js.Any] },
        "LatestCloudWatchLogsDeliveryError" -> LatestCloudWatchLogsDeliveryError.map { x => x.asInstanceOf[js.Any] },
        "LatestDigestDeliveryError" -> LatestDigestDeliveryError.map { x => x.asInstanceOf[js.Any] },
        "LatestDeliveryTime" -> LatestDeliveryTime.map { x => x.asInstanceOf[js.Any] },
        "StartLoggingTime" -> StartLoggingTime.map { x => x.asInstanceOf[js.Any] },
        "TimeLoggingStarted" -> TimeLoggingStarted.map { x => x.asInstanceOf[js.Any] },
        "LatestDeliveryError" -> LatestDeliveryError.map { x => x.asInstanceOf[js.Any] },
        "LatestNotificationAttemptSucceeded" -> LatestNotificationAttemptSucceeded.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTrailStatusResponse]
    }
  }

  /**
   * <p>Requests the public keys for a specified time range.</p>
   */
  @js.native
  trait ListPublicKeysRequest extends js.Object {
    var StartTime: js.UndefOr[Date]
    var EndTime: js.UndefOr[Date]
    var NextToken: js.UndefOr[String]
  }

  object ListPublicKeysRequest {
    def apply(
      StartTime: js.UndefOr[Date] = js.undefined,
      EndTime: js.UndefOr[Date] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): ListPublicKeysRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPublicKeysRequest]
    }
  }

  /**
   * <p>Returns the objects or data listed below if successful. Otherwise, returns an error.</p>
   */
  @js.native
  trait ListPublicKeysResponse extends js.Object {
    var PublicKeyList: js.UndefOr[PublicKeyList]
    var NextToken: js.UndefOr[String]
  }

  object ListPublicKeysResponse {
    def apply(
      PublicKeyList: js.UndefOr[PublicKeyList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): ListPublicKeysResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "PublicKeyList" -> PublicKeyList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPublicKeysResponse]
    }
  }

  /**
   * <p>Specifies a list of trail tags to return.</p>
   */
  @js.native
  trait ListTagsRequest extends js.Object {
    var ResourceIdList: js.UndefOr[ResourceIdList]
    var NextToken: js.UndefOr[String]
  }

  object ListTagsRequest {
    def apply(
      ResourceIdList: js.UndefOr[ResourceIdList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): ListTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceIdList" -> ResourceIdList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsRequest]
    }
  }

  /**
   * <p>Returns the objects or data listed below if successful. Otherwise, returns an error.</p>
   */
  @js.native
  trait ListTagsResponse extends js.Object {
    var ResourceTagList: js.UndefOr[ResourceTagList]
    var NextToken: js.UndefOr[String]
  }

  object ListTagsResponse {
    def apply(
      ResourceTagList: js.UndefOr[ResourceTagList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined): ListTagsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceTagList" -> ResourceTagList.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsResponse]
    }
  }

  /**
   * <p>Specifies an attribute and value that filter the events returned.</p>
   */
  @js.native
  trait LookupAttribute extends js.Object {
    var AttributeKey: js.UndefOr[LookupAttributeKey]
    var AttributeValue: js.UndefOr[String]
  }

  object LookupAttribute {
    def apply(
      AttributeKey: js.UndefOr[LookupAttributeKey] = js.undefined,
      AttributeValue: js.UndefOr[String] = js.undefined): LookupAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeKey" -> AttributeKey.map { x => x.asInstanceOf[js.Any] },
        "AttributeValue" -> AttributeValue.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LookupAttribute]
    }
  }

  object LookupAttributeKeyEnum {
    val EventId = "EventId"
    val EventName = "EventName"
    val ReadOnly = "ReadOnly"
    val Username = "Username"
    val ResourceType = "ResourceType"
    val ResourceName = "ResourceName"
    val EventSource = "EventSource"
    val AccessKeyId = "AccessKeyId"

    val values = IndexedSeq(EventId, EventName, ReadOnly, Username, ResourceType, ResourceName, EventSource, AccessKeyId)
  }

  /**
   * <p>Contains a request for LookupEvents.</p>
   */
  @js.native
  trait LookupEventsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var StartTime: js.UndefOr[Date]
    var EndTime: js.UndefOr[Date]
    var LookupAttributes: js.UndefOr[LookupAttributesList]
    var NextToken: js.UndefOr[NextToken]
  }

  object LookupEventsRequest {
    def apply(
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      StartTime: js.UndefOr[Date] = js.undefined,
      EndTime: js.UndefOr[Date] = js.undefined,
      LookupAttributes: js.UndefOr[LookupAttributesList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): LookupEventsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "StartTime" -> StartTime.map { x => x.asInstanceOf[js.Any] },
        "EndTime" -> EndTime.map { x => x.asInstanceOf[js.Any] },
        "LookupAttributes" -> LookupAttributes.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LookupEventsRequest]
    }
  }

  /**
   * <p>Contains a response to a LookupEvents action.</p>
   */
  @js.native
  trait LookupEventsResponse extends js.Object {
    var Events: js.UndefOr[EventsList]
    var NextToken: js.UndefOr[NextToken]
  }

  object LookupEventsResponse {
    def apply(
      Events: js.UndefOr[EventsList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): LookupEventsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Events" -> Events.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LookupEventsResponse]
    }
  }

  /**
   * <p>Contains information about a returned public key.</p>
   */
  @js.native
  trait PublicKey extends js.Object {
    var Value: js.UndefOr[ByteBuffer]
    var ValidityStartTime: js.UndefOr[Date]
    var ValidityEndTime: js.UndefOr[Date]
    var Fingerprint: js.UndefOr[String]
  }

  object PublicKey {
    def apply(
      Value: js.UndefOr[ByteBuffer] = js.undefined,
      ValidityStartTime: js.UndefOr[Date] = js.undefined,
      ValidityEndTime: js.UndefOr[Date] = js.undefined,
      Fingerprint: js.UndefOr[String] = js.undefined): PublicKey = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] },
        "ValidityStartTime" -> ValidityStartTime.map { x => x.asInstanceOf[js.Any] },
        "ValidityEndTime" -> ValidityEndTime.map { x => x.asInstanceOf[js.Any] },
        "Fingerprint" -> Fingerprint.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PublicKey]
    }
  }

  @js.native
  trait PutEventSelectorsRequest extends js.Object {
    var TrailName: js.UndefOr[String]
    var EventSelectors: js.UndefOr[EventSelectors]
  }

  object PutEventSelectorsRequest {
    def apply(
      TrailName: js.UndefOr[String] = js.undefined,
      EventSelectors: js.UndefOr[EventSelectors] = js.undefined): PutEventSelectorsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrailName" -> TrailName.map { x => x.asInstanceOf[js.Any] },
        "EventSelectors" -> EventSelectors.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutEventSelectorsRequest]
    }
  }

  @js.native
  trait PutEventSelectorsResponse extends js.Object {
    var TrailARN: js.UndefOr[String]
    var EventSelectors: js.UndefOr[EventSelectors]
  }

  object PutEventSelectorsResponse {
    def apply(
      TrailARN: js.UndefOr[String] = js.undefined,
      EventSelectors: js.UndefOr[EventSelectors] = js.undefined): PutEventSelectorsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrailARN" -> TrailARN.map { x => x.asInstanceOf[js.Any] },
        "EventSelectors" -> EventSelectors.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutEventSelectorsResponse]
    }
  }

  object ReadWriteTypeEnum {
    val ReadOnly = "ReadOnly"
    val WriteOnly = "WriteOnly"
    val All = "All"

    val values = IndexedSeq(ReadOnly, WriteOnly, All)
  }

  /**
   * <p>Specifies the tags to remove from a trail.</p>
   */
  @js.native
  trait RemoveTagsRequest extends js.Object {
    var ResourceId: js.UndefOr[String]
    var TagsList: js.UndefOr[TagsList]
  }

  object RemoveTagsRequest {
    def apply(
      ResourceId: js.UndefOr[String] = js.undefined,
      TagsList: js.UndefOr[TagsList] = js.undefined): RemoveTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "TagsList" -> TagsList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsRequest]
    }
  }

  /**
   * <p>Returns the objects or data listed below if successful. Otherwise, returns an error.</p>
   */
  @js.native
  trait RemoveTagsResponse extends js.Object {

  }

  object RemoveTagsResponse {
    def apply(): RemoveTagsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsResponse]
    }
  }

  /**
   * <p>Specifies the type and name of a resource referenced by an event.</p>
   */
  @js.native
  trait Resource extends js.Object {
    var ResourceType: js.UndefOr[String]
    var ResourceName: js.UndefOr[String]
  }

  object Resource {
    def apply(
      ResourceType: js.UndefOr[String] = js.undefined,
      ResourceName: js.UndefOr[String] = js.undefined): Resource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceType" -> ResourceType.map { x => x.asInstanceOf[js.Any] },
        "ResourceName" -> ResourceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Resource]
    }
  }

  /**
   * <p>A resource tag.</p>
   */
  @js.native
  trait ResourceTag extends js.Object {
    var ResourceId: js.UndefOr[String]
    var TagsList: js.UndefOr[TagsList]
  }

  object ResourceTag {
    def apply(
      ResourceId: js.UndefOr[String] = js.undefined,
      TagsList: js.UndefOr[TagsList] = js.undefined): ResourceTag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.map { x => x.asInstanceOf[js.Any] },
        "TagsList" -> TagsList.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceTag]
    }
  }

  /**
   * <p>The request to CloudTrail to start logging AWS API calls for an account.</p>
   */
  @js.native
  trait StartLoggingRequest extends js.Object {
    var Name: js.UndefOr[String]
  }

  object StartLoggingRequest {
    def apply(
      Name: js.UndefOr[String] = js.undefined): StartLoggingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartLoggingRequest]
    }
  }

  /**
   * <p>Returns the objects or data listed below if successful. Otherwise, returns an error.</p>
   */
  @js.native
  trait StartLoggingResponse extends js.Object {

  }

  object StartLoggingResponse {
    def apply(): StartLoggingResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartLoggingResponse]
    }
  }

  /**
   * <p>Passes the request to CloudTrail to stop logging AWS API calls for the specified account.</p>
   */
  @js.native
  trait StopLoggingRequest extends js.Object {
    var Name: js.UndefOr[String]
  }

  object StopLoggingRequest {
    def apply(
      Name: js.UndefOr[String] = js.undefined): StopLoggingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopLoggingRequest]
    }
  }

  /**
   * <p>Returns the objects or data listed below if successful. Otherwise, returns an error.</p>
   */
  @js.native
  trait StopLoggingResponse extends js.Object {

  }

  object StopLoggingResponse {
    def apply(): StopLoggingResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopLoggingResponse]
    }
  }

  /**
   * <p>A custom key-value pair associated with a resource such as a CloudTrail trail.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: js.UndefOr[String]
    var Value: js.UndefOr[String]
  }

  object Tag {
    def apply(
      Key: js.UndefOr[String] = js.undefined,
      Value: js.UndefOr[String] = js.undefined): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.map { x => x.asInstanceOf[js.Any] },
        "Value" -> Value.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
   * <p>The settings for a trail.</p>
   */
  @js.native
  trait Trail extends js.Object {
    var CloudWatchLogsRoleArn: js.UndefOr[String]
    var CloudWatchLogsLogGroupArn: js.UndefOr[String]
    var HasCustomEventSelectors: js.UndefOr[Boolean]
    var Name: js.UndefOr[String]
    var SnsTopicARN: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var IsMultiRegionTrail: js.UndefOr[Boolean]
    var S3BucketName: js.UndefOr[String]
    var SnsTopicName: js.UndefOr[String]
    var LogFileValidationEnabled: js.UndefOr[Boolean]
    var S3KeyPrefix: js.UndefOr[String]
    var HomeRegion: js.UndefOr[String]
    var IncludeGlobalServiceEvents: js.UndefOr[Boolean]
    var TrailARN: js.UndefOr[String]
  }

  object Trail {
    def apply(
      CloudWatchLogsRoleArn: js.UndefOr[String] = js.undefined,
      CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.undefined,
      HasCustomEventSelectors: js.UndefOr[Boolean] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      SnsTopicARN: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      IsMultiRegionTrail: js.UndefOr[Boolean] = js.undefined,
      S3BucketName: js.UndefOr[String] = js.undefined,
      SnsTopicName: js.UndefOr[String] = js.undefined,
      LogFileValidationEnabled: js.UndefOr[Boolean] = js.undefined,
      S3KeyPrefix: js.UndefOr[String] = js.undefined,
      HomeRegion: js.UndefOr[String] = js.undefined,
      IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.undefined,
      TrailARN: js.UndefOr[String] = js.undefined): Trail = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudWatchLogsRoleArn" -> CloudWatchLogsRoleArn.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLogsLogGroupArn" -> CloudWatchLogsLogGroupArn.map { x => x.asInstanceOf[js.Any] },
        "HasCustomEventSelectors" -> HasCustomEventSelectors.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "SnsTopicARN" -> SnsTopicARN.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "IsMultiRegionTrail" -> IsMultiRegionTrail.map { x => x.asInstanceOf[js.Any] },
        "S3BucketName" -> S3BucketName.map { x => x.asInstanceOf[js.Any] },
        "SnsTopicName" -> SnsTopicName.map { x => x.asInstanceOf[js.Any] },
        "LogFileValidationEnabled" -> LogFileValidationEnabled.map { x => x.asInstanceOf[js.Any] },
        "S3KeyPrefix" -> S3KeyPrefix.map { x => x.asInstanceOf[js.Any] },
        "HomeRegion" -> HomeRegion.map { x => x.asInstanceOf[js.Any] },
        "IncludeGlobalServiceEvents" -> IncludeGlobalServiceEvents.map { x => x.asInstanceOf[js.Any] },
        "TrailARN" -> TrailARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Trail]
    }
  }

  /**
   * <p>Specifies settings to update for the trail.</p>
   */
  @js.native
  trait UpdateTrailRequest extends js.Object {
    var CloudWatchLogsRoleArn: js.UndefOr[String]
    var CloudWatchLogsLogGroupArn: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var IsMultiRegionTrail: js.UndefOr[Boolean]
    var S3BucketName: js.UndefOr[String]
    var SnsTopicName: js.UndefOr[String]
    var S3KeyPrefix: js.UndefOr[String]
    var EnableLogFileValidation: js.UndefOr[Boolean]
    var IncludeGlobalServiceEvents: js.UndefOr[Boolean]
  }

  object UpdateTrailRequest {
    def apply(
      CloudWatchLogsRoleArn: js.UndefOr[String] = js.undefined,
      CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      IsMultiRegionTrail: js.UndefOr[Boolean] = js.undefined,
      S3BucketName: js.UndefOr[String] = js.undefined,
      SnsTopicName: js.UndefOr[String] = js.undefined,
      S3KeyPrefix: js.UndefOr[String] = js.undefined,
      EnableLogFileValidation: js.UndefOr[Boolean] = js.undefined,
      IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.undefined): UpdateTrailRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudWatchLogsRoleArn" -> CloudWatchLogsRoleArn.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLogsLogGroupArn" -> CloudWatchLogsLogGroupArn.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "IsMultiRegionTrail" -> IsMultiRegionTrail.map { x => x.asInstanceOf[js.Any] },
        "S3BucketName" -> S3BucketName.map { x => x.asInstanceOf[js.Any] },
        "SnsTopicName" -> SnsTopicName.map { x => x.asInstanceOf[js.Any] },
        "S3KeyPrefix" -> S3KeyPrefix.map { x => x.asInstanceOf[js.Any] },
        "EnableLogFileValidation" -> EnableLogFileValidation.map { x => x.asInstanceOf[js.Any] },
        "IncludeGlobalServiceEvents" -> IncludeGlobalServiceEvents.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTrailRequest]
    }
  }

  /**
   * <p>Returns the objects or data listed below if successful. Otherwise, returns an error.</p>
   */
  @js.native
  trait UpdateTrailResponse extends js.Object {
    var CloudWatchLogsRoleArn: js.UndefOr[String]
    var CloudWatchLogsLogGroupArn: js.UndefOr[String]
    var Name: js.UndefOr[String]
    var SnsTopicARN: js.UndefOr[String]
    var KmsKeyId: js.UndefOr[String]
    var IsMultiRegionTrail: js.UndefOr[Boolean]
    var S3BucketName: js.UndefOr[String]
    var SnsTopicName: js.UndefOr[String]
    var LogFileValidationEnabled: js.UndefOr[Boolean]
    var S3KeyPrefix: js.UndefOr[String]
    var IncludeGlobalServiceEvents: js.UndefOr[Boolean]
    var TrailARN: js.UndefOr[String]
  }

  object UpdateTrailResponse {
    def apply(
      CloudWatchLogsRoleArn: js.UndefOr[String] = js.undefined,
      CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      SnsTopicARN: js.UndefOr[String] = js.undefined,
      KmsKeyId: js.UndefOr[String] = js.undefined,
      IsMultiRegionTrail: js.UndefOr[Boolean] = js.undefined,
      S3BucketName: js.UndefOr[String] = js.undefined,
      SnsTopicName: js.UndefOr[String] = js.undefined,
      LogFileValidationEnabled: js.UndefOr[Boolean] = js.undefined,
      S3KeyPrefix: js.UndefOr[String] = js.undefined,
      IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.undefined,
      TrailARN: js.UndefOr[String] = js.undefined): UpdateTrailResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudWatchLogsRoleArn" -> CloudWatchLogsRoleArn.map { x => x.asInstanceOf[js.Any] },
        "CloudWatchLogsLogGroupArn" -> CloudWatchLogsLogGroupArn.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "SnsTopicARN" -> SnsTopicARN.map { x => x.asInstanceOf[js.Any] },
        "KmsKeyId" -> KmsKeyId.map { x => x.asInstanceOf[js.Any] },
        "IsMultiRegionTrail" -> IsMultiRegionTrail.map { x => x.asInstanceOf[js.Any] },
        "S3BucketName" -> S3BucketName.map { x => x.asInstanceOf[js.Any] },
        "SnsTopicName" -> SnsTopicName.map { x => x.asInstanceOf[js.Any] },
        "LogFileValidationEnabled" -> LogFileValidationEnabled.map { x => x.asInstanceOf[js.Any] },
        "S3KeyPrefix" -> S3KeyPrefix.map { x => x.asInstanceOf[js.Any] },
        "IncludeGlobalServiceEvents" -> IncludeGlobalServiceEvents.map { x => x.asInstanceOf[js.Any] },
        "TrailARN" -> TrailARN.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTrailResponse]
    }
  }
}
