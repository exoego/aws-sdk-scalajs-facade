package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object cloudtrail {
  type ByteBuffer = js.Array[Byte]
  type DataResourceValues = js.Array[String]
  type DataResources = js.Array[DataResource]
  type Date = js.Date
  type EventSelectors = js.Array[EventSelector]
  type EventsList = js.Array[Event]
  type LookupAttributeKey = String
  type LookupAttributesList = js.Array[LookupAttribute]
  type MaxResults = Integer
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
  trait Cloudtrail extends js.Object {
    def addTags(params: AddTagsRequest, callback: Callback[AddTagsResponse]): Unit = js.native
    def addTags(params: AddTagsRequest): Request[AddTagsResponse] = js.native
    def createTrail(params: CreateTrailRequest, callback: Callback[CreateTrailResponse]): Unit = js.native
    def createTrail(params: CreateTrailRequest): Request[CreateTrailResponse] = js.native
    def deleteTrail(params: DeleteTrailRequest, callback: Callback[DeleteTrailResponse]): Unit = js.native
    def deleteTrail(params: DeleteTrailRequest): Request[DeleteTrailResponse] = js.native
    def describeTrails(params: DescribeTrailsRequest, callback: Callback[DescribeTrailsResponse]): Unit = js.native
    def describeTrails(params: DescribeTrailsRequest): Request[DescribeTrailsResponse] = js.native
    def getEventSelectors(params: GetEventSelectorsRequest, callback: Callback[GetEventSelectorsResponse]): Unit = js.native
    def getEventSelectors(params: GetEventSelectorsRequest): Request[GetEventSelectorsResponse] = js.native
    def getTrailStatus(params: GetTrailStatusRequest, callback: Callback[GetTrailStatusResponse]): Unit = js.native
    def getTrailStatus(params: GetTrailStatusRequest): Request[GetTrailStatusResponse] = js.native
    def listPublicKeys(params: ListPublicKeysRequest, callback: Callback[ListPublicKeysResponse]): Unit = js.native
    def listPublicKeys(params: ListPublicKeysRequest): Request[ListPublicKeysResponse] = js.native
    def listTags(params: ListTagsRequest, callback: Callback[ListTagsResponse]): Unit = js.native
    def listTags(params: ListTagsRequest): Request[ListTagsResponse] = js.native
    def lookupEvents(params: LookupEventsRequest, callback: Callback[LookupEventsResponse]): Unit = js.native
    def lookupEvents(params: LookupEventsRequest): Request[LookupEventsResponse] = js.native
    def putEventSelectors(params: PutEventSelectorsRequest, callback: Callback[PutEventSelectorsResponse]): Unit = js.native
    def putEventSelectors(params: PutEventSelectorsRequest): Request[PutEventSelectorsResponse] = js.native
    def removeTags(params: RemoveTagsRequest, callback: Callback[RemoveTagsResponse]): Unit = js.native
    def removeTags(params: RemoveTagsRequest): Request[RemoveTagsResponse] = js.native
    def startLogging(params: StartLoggingRequest, callback: Callback[StartLoggingResponse]): Unit = js.native
    def startLogging(params: StartLoggingRequest): Request[StartLoggingResponse] = js.native
    def stopLogging(params: StopLoggingRequest, callback: Callback[StopLoggingResponse]): Unit = js.native
    def stopLogging(params: StopLoggingRequest): Request[StopLoggingResponse] = js.native
    def updateTrail(params: UpdateTrailRequest, callback: Callback[UpdateTrailResponse]): Unit = js.native
    def updateTrail(params: UpdateTrailRequest): Request[UpdateTrailResponse] = js.native
  }

  /**
   * <p>Specifies the tags to add to a trail.</p>
   */
  @js.native
  trait AddTagsRequest extends js.Object {
    var ResourceId: String
    var TagsList: TagsList
  }

  object AddTagsRequest {
    def apply(
      ResourceId: js.UndefOr[String] = js.undefined,
      TagsList: js.UndefOr[TagsList] = js.undefined
    ): AddTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceId" -> ResourceId.map { x => x: js.Any }),
        ("TagsList" -> TagsList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): AddTagsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsResponse]
    }
  }

  /**
   * <p>This exception is thrown when an operation is called with an invalid trail ARN. The format of a trail ARN is:</p> <p> <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code> </p>
   */
  @js.native
  trait CloudTrailARNInvalidExceptionException extends js.Object {

  }

  /**
   * <p>Cannot set a CloudWatch Logs delivery for this region.</p>
   */
  @js.native
  trait CloudWatchLogsDeliveryUnavailableExceptionException extends js.Object {

  }

  /**
   * <p>Specifies the settings for each trail.</p>
   */
  @js.native
  trait CreateTrailRequest extends js.Object {
    var CloudWatchLogsRoleArn: String
    var CloudWatchLogsLogGroupArn: String
    var Name: String
    var KmsKeyId: String
    var IsMultiRegionTrail: Boolean
    var S3BucketName: String
    var SnsTopicName: String
    var S3KeyPrefix: String
    var EnableLogFileValidation: Boolean
    var IncludeGlobalServiceEvents: Boolean
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
      IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.undefined
    ): CreateTrailRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CloudWatchLogsRoleArn" -> CloudWatchLogsRoleArn.map { x => x: js.Any }),
        ("CloudWatchLogsLogGroupArn" -> CloudWatchLogsLogGroupArn.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("KmsKeyId" -> KmsKeyId.map { x => x: js.Any }),
        ("IsMultiRegionTrail" -> IsMultiRegionTrail.map { x => x: js.Any }),
        ("S3BucketName" -> S3BucketName.map { x => x: js.Any }),
        ("SnsTopicName" -> SnsTopicName.map { x => x: js.Any }),
        ("S3KeyPrefix" -> S3KeyPrefix.map { x => x: js.Any }),
        ("EnableLogFileValidation" -> EnableLogFileValidation.map { x => x: js.Any }),
        ("IncludeGlobalServiceEvents" -> IncludeGlobalServiceEvents.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTrailRequest]
    }
  }

  /**
   * <p>Returns the objects or data listed below if successful. Otherwise, returns an error.</p>
   */
  @js.native
  trait CreateTrailResponse extends js.Object {
    var CloudWatchLogsRoleArn: String
    var CloudWatchLogsLogGroupArn: String
    var Name: String
    var SnsTopicARN: String
    var KmsKeyId: String
    var IsMultiRegionTrail: Boolean
    var S3BucketName: String
    var SnsTopicName: String
    var LogFileValidationEnabled: Boolean
    var S3KeyPrefix: String
    var IncludeGlobalServiceEvents: Boolean
    var TrailARN: String
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
      TrailARN: js.UndefOr[String] = js.undefined
    ): CreateTrailResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CloudWatchLogsRoleArn" -> CloudWatchLogsRoleArn.map { x => x: js.Any }),
        ("CloudWatchLogsLogGroupArn" -> CloudWatchLogsLogGroupArn.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("SnsTopicARN" -> SnsTopicARN.map { x => x: js.Any }),
        ("KmsKeyId" -> KmsKeyId.map { x => x: js.Any }),
        ("IsMultiRegionTrail" -> IsMultiRegionTrail.map { x => x: js.Any }),
        ("S3BucketName" -> S3BucketName.map { x => x: js.Any }),
        ("SnsTopicName" -> SnsTopicName.map { x => x: js.Any }),
        ("LogFileValidationEnabled" -> LogFileValidationEnabled.map { x => x: js.Any }),
        ("S3KeyPrefix" -> S3KeyPrefix.map { x => x: js.Any }),
        ("IncludeGlobalServiceEvents" -> IncludeGlobalServiceEvents.map { x => x: js.Any }),
        ("TrailARN" -> TrailARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTrailResponse]
    }
  }

  /**
   * <p>The Amazon S3 objects that you specify in your event selectors for your trail to log data events. Data events are object level API operations that access S3 objects, such as <code>GetObject</code>, <code>DeleteObject</code>, and <code>PutObject</code>. You can specify up to 50 S3 buckets and object prefixes for an event selector. </p> <p>Example</p> <ol> <li> <p>You create an event selector for a trail and specify an S3 bucket and an empty prefix, such as <code>arn:aws:s3:::bucket-1/</code>.</p> </li> <li> <p>You upload an image file to <code>bucket-1</code>.</p> </li> <li> <p>The <code>PutObject</code> API operation occurs on an object in the S3 bucket that you specified in the event selector. The trail processes and logs the event.</p> </li> <li> <p>You upload another image file to a different S3 bucket named <code>arn:aws:s3:::bucket-2</code>.</p> </li> <li> <p>The event occurs on an object in an S3 bucket that you didn't specify in the event selector. The trail doesn’t log the event.</p> </li> </ol>
   */
  @js.native
  trait DataResource extends js.Object {
    var Type: String
    var Values: DataResourceValues
  }

  object DataResource {
    def apply(
      Type: js.UndefOr[String] = js.undefined,
      Values: js.UndefOr[DataResourceValues] = js.undefined
    ): DataResource = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Type" -> Type.map { x => x: js.Any }),
        ("Values" -> Values.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DataResource]
    }
  }

  /**
   * <p>The request that specifies the name of a trail to delete.</p>
   */
  @js.native
  trait DeleteTrailRequest extends js.Object {
    var Name: String
  }

  object DeleteTrailRequest {
    def apply(
      Name: js.UndefOr[String] = js.undefined
    ): DeleteTrailRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): DeleteTrailResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTrailResponse]
    }
  }

  /**
   * <p>Returns information about the trail.</p>
   */
  @js.native
  trait DescribeTrailsRequest extends js.Object {
    var trailNameList: TrailNameList
    var includeShadowTrails: Boolean
  }

  object DescribeTrailsRequest {
    def apply(
      trailNameList: js.UndefOr[TrailNameList] = js.undefined,
      includeShadowTrails: js.UndefOr[Boolean] = js.undefined
    ): DescribeTrailsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("trailNameList" -> trailNameList.map { x => x: js.Any }),
        ("includeShadowTrails" -> includeShadowTrails.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTrailsRequest]
    }
  }

  /**
   * <p>Returns the objects or data listed below if successful. Otherwise, returns an error.</p>
   */
  @js.native
  trait DescribeTrailsResponse extends js.Object {
    var trailList: TrailList
  }

  object DescribeTrailsResponse {
    def apply(
      trailList: js.UndefOr[TrailList] = js.undefined
    ): DescribeTrailsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("trailList" -> trailList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTrailsResponse]
    }
  }

  /**
   * <p>Contains information about an event that was returned by a lookup request. The result includes a representation of a CloudTrail event.</p>
   */
  @js.native
  trait Event extends js.Object {
    var Username: String
    var Resources: ResourceList
    var EventSource: String
    var CloudTrailEvent: String
    var EventId: String
    var EventTime: Date
    var EventName: String
  }

  object Event {
    def apply(
      Username: js.UndefOr[String] = js.undefined,
      Resources: js.UndefOr[ResourceList] = js.undefined,
      EventSource: js.UndefOr[String] = js.undefined,
      CloudTrailEvent: js.UndefOr[String] = js.undefined,
      EventId: js.UndefOr[String] = js.undefined,
      EventTime: js.UndefOr[Date] = js.undefined,
      EventName: js.UndefOr[String] = js.undefined
    ): Event = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Username" -> Username.map { x => x: js.Any }),
        ("Resources" -> Resources.map { x => x: js.Any }),
        ("EventSource" -> EventSource.map { x => x: js.Any }),
        ("CloudTrailEvent" -> CloudTrailEvent.map { x => x: js.Any }),
        ("EventId" -> EventId.map { x => x: js.Any }),
        ("EventTime" -> EventTime.map { x => x: js.Any }),
        ("EventName" -> EventName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Event]
    }
  }

  /**
   * <p>Use event selectors to specify the types of events that you want your trail to log. When an event occurs in your account, CloudTrail evaluates the event selector for all trails. For each trail, if the event matches any event selector, the trail processes and logs the event. If the event doesn't match any event selector, the trail doesn't log the event.</p> <p>You can configure up to five event selectors for a trail.</p>
   */
  @js.native
  trait EventSelector extends js.Object {
    var ReadWriteType: ReadWriteType
    var IncludeManagementEvents: Boolean
    var DataResources: DataResources
  }

  object EventSelector {
    def apply(
      ReadWriteType: js.UndefOr[ReadWriteType] = js.undefined,
      IncludeManagementEvents: js.UndefOr[Boolean] = js.undefined,
      DataResources: js.UndefOr[DataResources] = js.undefined
    ): EventSelector = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ReadWriteType" -> ReadWriteType.map { x => x: js.Any }),
        ("IncludeManagementEvents" -> IncludeManagementEvents.map { x => x: js.Any }),
        ("DataResources" -> DataResources.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventSelector]
    }
  }

  @js.native
  trait GetEventSelectorsRequest extends js.Object {
    var TrailName: String
  }

  object GetEventSelectorsRequest {
    def apply(
      TrailName: js.UndefOr[String] = js.undefined
    ): GetEventSelectorsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TrailName" -> TrailName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEventSelectorsRequest]
    }
  }

  @js.native
  trait GetEventSelectorsResponse extends js.Object {
    var TrailARN: String
    var EventSelectors: EventSelectors
  }

  object GetEventSelectorsResponse {
    def apply(
      TrailARN: js.UndefOr[String] = js.undefined,
      EventSelectors: js.UndefOr[EventSelectors] = js.undefined
    ): GetEventSelectorsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TrailARN" -> TrailARN.map { x => x: js.Any }),
        ("EventSelectors" -> EventSelectors.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEventSelectorsResponse]
    }
  }

  /**
   * <p>The name of a trail about which you want the current status.</p>
   */
  @js.native
  trait GetTrailStatusRequest extends js.Object {
    var Name: String
  }

  object GetTrailStatusRequest {
    def apply(
      Name: js.UndefOr[String] = js.undefined
    ): GetTrailStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTrailStatusRequest]
    }
  }

  /**
   * <p>Returns the objects or data listed below if successful. Otherwise, returns an error.</p>
   */
  @js.native
  trait GetTrailStatusResponse extends js.Object {
    var LatestDeliveryAttemptTime: String
    var LatestNotificationTime: Date
    var LatestNotificationAttemptTime: String
    var TimeLoggingStopped: String
    var IsLogging: Boolean
    var StopLoggingTime: Date
    var LatestNotificationError: String
    var LatestCloudWatchLogsDeliveryTime: Date
    var LatestDigestDeliveryTime: Date
    var LatestDeliveryAttemptSucceeded: String
    var LatestCloudWatchLogsDeliveryError: String
    var LatestDigestDeliveryError: String
    var LatestDeliveryTime: Date
    var StartLoggingTime: Date
    var TimeLoggingStarted: String
    var LatestDeliveryError: String
    var LatestNotificationAttemptSucceeded: String
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
      LatestNotificationAttemptSucceeded: js.UndefOr[String] = js.undefined
    ): GetTrailStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LatestDeliveryAttemptTime" -> LatestDeliveryAttemptTime.map { x => x: js.Any }),
        ("LatestNotificationTime" -> LatestNotificationTime.map { x => x: js.Any }),
        ("LatestNotificationAttemptTime" -> LatestNotificationAttemptTime.map { x => x: js.Any }),
        ("TimeLoggingStopped" -> TimeLoggingStopped.map { x => x: js.Any }),
        ("IsLogging" -> IsLogging.map { x => x: js.Any }),
        ("StopLoggingTime" -> StopLoggingTime.map { x => x: js.Any }),
        ("LatestNotificationError" -> LatestNotificationError.map { x => x: js.Any }),
        ("LatestCloudWatchLogsDeliveryTime" -> LatestCloudWatchLogsDeliveryTime.map { x => x: js.Any }),
        ("LatestDigestDeliveryTime" -> LatestDigestDeliveryTime.map { x => x: js.Any }),
        ("LatestDeliveryAttemptSucceeded" -> LatestDeliveryAttemptSucceeded.map { x => x: js.Any }),
        ("LatestCloudWatchLogsDeliveryError" -> LatestCloudWatchLogsDeliveryError.map { x => x: js.Any }),
        ("LatestDigestDeliveryError" -> LatestDigestDeliveryError.map { x => x: js.Any }),
        ("LatestDeliveryTime" -> LatestDeliveryTime.map { x => x: js.Any }),
        ("StartLoggingTime" -> StartLoggingTime.map { x => x: js.Any }),
        ("TimeLoggingStarted" -> TimeLoggingStarted.map { x => x: js.Any }),
        ("LatestDeliveryError" -> LatestDeliveryError.map { x => x: js.Any }),
        ("LatestNotificationAttemptSucceeded" -> LatestNotificationAttemptSucceeded.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTrailStatusResponse]
    }
  }

  /**
   * <p>This exception is thrown when the policy on the S3 bucket or KMS key is not sufficient.</p>
   */
  @js.native
  trait InsufficientEncryptionPolicyExceptionException extends js.Object {

  }

  /**
   * <p>This exception is thrown when the policy on the S3 bucket is not sufficient.</p>
   */
  @js.native
  trait InsufficientS3BucketPolicyExceptionException extends js.Object {

  }

  /**
   * <p>This exception is thrown when the policy on the SNS topic is not sufficient.</p>
   */
  @js.native
  trait InsufficientSnsTopicPolicyExceptionException extends js.Object {

  }

  /**
   * <p>This exception is thrown when the provided CloudWatch log group is not valid.</p>
   */
  @js.native
  trait InvalidCloudWatchLogsLogGroupArnExceptionException extends js.Object {

  }

  /**
   * <p>This exception is thrown when the provided role is not valid.</p>
   */
  @js.native
  trait InvalidCloudWatchLogsRoleArnExceptionException extends js.Object {

  }

  /**
   * <p>This exception is thrown when the <code>PutEventSelectors</code> operation is called with an invalid number of event selectors, data resources, or an invalid value for a parameter:</p> <ul> <li> <p>Specify a valid number of event selectors (1 to 5) for a trail.</p> </li> <li> <p>Specify a valid number of data resources (1 to 50) for an event selector.</p> </li> <li> <p>Specify a valid value for a parameter. For example, specifying the <code>ReadWriteType</code> parameter with a value of <code>read-only</code> is invalid.</p> </li> </ul>
   */
  @js.native
  trait InvalidEventSelectorsExceptionException extends js.Object {

  }

  /**
   * <p>This exception is thrown when an operation is called on a trail from a region other than the region in which the trail was created.</p>
   */
  @js.native
  trait InvalidHomeRegionExceptionException extends js.Object {

  }

  /**
   * <p>This exception is thrown when the KMS key ARN is invalid.</p>
   */
  @js.native
  trait InvalidKmsKeyIdExceptionException extends js.Object {

  }

  /**
   * <p>Occurs when an invalid lookup attribute is specified.</p>
   */
  @js.native
  trait InvalidLookupAttributesExceptionException extends js.Object {

  }

  /**
   * <p>This exception is thrown if the limit specified is invalid.</p>
   */
  @js.native
  trait InvalidMaxResultsExceptionException extends js.Object {

  }

  /**
   * <p>Invalid token or token that was previously used in a request with different parameters. This exception is thrown if the token is invalid.</p>
   */
  @js.native
  trait InvalidNextTokenExceptionException extends js.Object {

  }

  /**
   * <p>This exception is thrown when the combination of parameters provided is not valid.</p>
   */
  @js.native
  trait InvalidParameterCombinationExceptionException extends js.Object {

  }

  /**
   * <p>This exception is thrown when the provided S3 bucket name is not valid.</p>
   */
  @js.native
  trait InvalidS3BucketNameExceptionException extends js.Object {

  }

  /**
   * <p>This exception is thrown when the provided S3 prefix is not valid.</p>
   */
  @js.native
  trait InvalidS3PrefixExceptionException extends js.Object {

  }

  /**
   * <p>This exception is thrown when the provided SNS topic name is not valid.</p>
   */
  @js.native
  trait InvalidSnsTopicNameExceptionException extends js.Object {

  }

  /**
   * <p>This exception is thrown when the key or value specified for the tag does not match the regular expression <code>^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-@]*)$</code>.</p>
   */
  @js.native
  trait InvalidTagParameterExceptionException extends js.Object {

  }

  /**
   * <p>Occurs if the timestamp values are invalid. Either the start time occurs after the end time or the time range is outside the range of possible values.</p>
   */
  @js.native
  trait InvalidTimeRangeExceptionException extends js.Object {

  }

  /**
   * <p>Reserved for future use.</p>
   */
  @js.native
  trait InvalidTokenExceptionException extends js.Object {

  }

  /**
   * <p>This exception is thrown when the provided trail name is not valid. Trail names must meet the following requirements:</p> <ul> <li> <p>Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.), underscores (_), or dashes (-)</p> </li> <li> <p>Start with a letter or number, and end with a letter or number</p> </li> <li> <p>Be between 3 and 128 characters</p> </li> <li> <p>Have no adjacent periods, underscores or dashes. Names like <code>my-_namespace</code> and <code>my--namespace</code> are invalid.</p> </li> <li> <p>Not be in IP address format (for example, 192.168.5.4)</p> </li> </ul>
   */
  @js.native
  trait InvalidTrailNameExceptionException extends js.Object {

  }

  /**
   * <p>This exception is thrown when there is an issue with the specified KMS key and the trail can’t be updated.</p>
   */
  @js.native
  trait KmsExceptionException extends js.Object {

  }

  /**
   * <p>This exception is deprecated.</p>
   */
  @deprecated
  @js.native
  trait KmsKeyDisabledExceptionException extends js.Object {

  }

  /**
   * <p>This exception is thrown when the KMS key does not exist, or when the S3 bucket and the KMS key are not in the same region.</p>
   */
  @js.native
  trait KmsKeyNotFoundExceptionException extends js.Object {

  }

  /**
   * <p>Requests the public keys for a specified time range.</p>
   */
  @js.native
  trait ListPublicKeysRequest extends js.Object {
    var StartTime: Date
    var EndTime: Date
    var NextToken: String
  }

  object ListPublicKeysRequest {
    def apply(
      StartTime: js.UndefOr[Date] = js.undefined,
      EndTime: js.UndefOr[Date] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): ListPublicKeysRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("StartTime" -> StartTime.map { x => x: js.Any }),
        ("EndTime" -> EndTime.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPublicKeysRequest]
    }
  }

  /**
   * <p>Returns the objects or data listed below if successful. Otherwise, returns an error.</p>
   */
  @js.native
  trait ListPublicKeysResponse extends js.Object {
    var PublicKeyList: PublicKeyList
    var NextToken: String
  }

  object ListPublicKeysResponse {
    def apply(
      PublicKeyList: js.UndefOr[PublicKeyList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): ListPublicKeysResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("PublicKeyList" -> PublicKeyList.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPublicKeysResponse]
    }
  }

  /**
   * <p>Specifies a list of trail tags to return.</p>
   */
  @js.native
  trait ListTagsRequest extends js.Object {
    var ResourceIdList: ResourceIdList
    var NextToken: String
  }

  object ListTagsRequest {
    def apply(
      ResourceIdList: js.UndefOr[ResourceIdList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): ListTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceIdList" -> ResourceIdList.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsRequest]
    }
  }

  /**
   * <p>Returns the objects or data listed below if successful. Otherwise, returns an error.</p>
   */
  @js.native
  trait ListTagsResponse extends js.Object {
    var ResourceTagList: ResourceTagList
    var NextToken: String
  }

  object ListTagsResponse {
    def apply(
      ResourceTagList: js.UndefOr[ResourceTagList] = js.undefined,
      NextToken: js.UndefOr[String] = js.undefined
    ): ListTagsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceTagList" -> ResourceTagList.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsResponse]
    }
  }

  /**
   * <p>Specifies an attribute and value that filter the events returned.</p>
   */
  @js.native
  trait LookupAttribute extends js.Object {
    var AttributeKey: LookupAttributeKey
    var AttributeValue: String
  }

  object LookupAttribute {
    def apply(
      AttributeKey: js.UndefOr[LookupAttributeKey] = js.undefined,
      AttributeValue: js.UndefOr[String] = js.undefined
    ): LookupAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("AttributeKey" -> AttributeKey.map { x => x: js.Any }),
        ("AttributeValue" -> AttributeValue.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LookupAttribute]
    }
  }


  object LookupAttributeKeyEnum {
    val EventId = "EventId"
    val EventName = "EventName"
    val Username = "Username"
    val ResourceType = "ResourceType"
    val ResourceName = "ResourceName"
    val EventSource = "EventSource"

    val values = IndexedSeq(EventId, EventName, Username, ResourceType, ResourceName, EventSource)
  }

  /**
   * <p>Contains a request for LookupEvents.</p>
   */
  @js.native
  trait LookupEventsRequest extends js.Object {
    var MaxResults: MaxResults
    var StartTime: Date
    var EndTime: Date
    var LookupAttributes: LookupAttributesList
    var NextToken: NextToken
  }

  object LookupEventsRequest {
    def apply(
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      StartTime: js.UndefOr[Date] = js.undefined,
      EndTime: js.UndefOr[Date] = js.undefined,
      LookupAttributes: js.UndefOr[LookupAttributesList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): LookupEventsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("MaxResults" -> MaxResults.map { x => x: js.Any }),
        ("StartTime" -> StartTime.map { x => x: js.Any }),
        ("EndTime" -> EndTime.map { x => x: js.Any }),
        ("LookupAttributes" -> LookupAttributes.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LookupEventsRequest]
    }
  }

  /**
   * <p>Contains a response to a LookupEvents action.</p>
   */
  @js.native
  trait LookupEventsResponse extends js.Object {
    var Events: EventsList
    var NextToken: NextToken
  }

  object LookupEventsResponse {
    def apply(
      Events: js.UndefOr[EventsList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined
    ): LookupEventsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Events" -> Events.map { x => x: js.Any }),
        ("NextToken" -> NextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LookupEventsResponse]
    }
  }

  /**
   * <p>This exception is thrown when the maximum number of trails is reached.</p>
   */
  @js.native
  trait MaximumNumberOfTrailsExceededExceptionException extends js.Object {

  }

  /**
   * <p>This exception is thrown when the requested operation is not permitted.</p>
   */
  @js.native
  trait OperationNotPermittedExceptionException extends js.Object {

  }

  /**
   * <p>Contains information about a returned public key.</p>
   */
  @js.native
  trait PublicKey extends js.Object {
    var Value: ByteBuffer
    var ValidityStartTime: Date
    var ValidityEndTime: Date
    var Fingerprint: String
  }

  object PublicKey {
    def apply(
      Value: js.UndefOr[ByteBuffer] = js.undefined,
      ValidityStartTime: js.UndefOr[Date] = js.undefined,
      ValidityEndTime: js.UndefOr[Date] = js.undefined,
      Fingerprint: js.UndefOr[String] = js.undefined
    ): PublicKey = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Value" -> Value.map { x => x: js.Any }),
        ("ValidityStartTime" -> ValidityStartTime.map { x => x: js.Any }),
        ("ValidityEndTime" -> ValidityEndTime.map { x => x: js.Any }),
        ("Fingerprint" -> Fingerprint.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PublicKey]
    }
  }

  @js.native
  trait PutEventSelectorsRequest extends js.Object {
    var TrailName: String
    var EventSelectors: EventSelectors
  }

  object PutEventSelectorsRequest {
    def apply(
      TrailName: js.UndefOr[String] = js.undefined,
      EventSelectors: js.UndefOr[EventSelectors] = js.undefined
    ): PutEventSelectorsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TrailName" -> TrailName.map { x => x: js.Any }),
        ("EventSelectors" -> EventSelectors.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutEventSelectorsRequest]
    }
  }

  @js.native
  trait PutEventSelectorsResponse extends js.Object {
    var TrailARN: String
    var EventSelectors: EventSelectors
  }

  object PutEventSelectorsResponse {
    def apply(
      TrailARN: js.UndefOr[String] = js.undefined,
      EventSelectors: js.UndefOr[EventSelectors] = js.undefined
    ): PutEventSelectorsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("TrailARN" -> TrailARN.map { x => x: js.Any }),
        ("EventSelectors" -> EventSelectors.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    var ResourceId: String
    var TagsList: TagsList
  }

  object RemoveTagsRequest {
    def apply(
      ResourceId: js.UndefOr[String] = js.undefined,
      TagsList: js.UndefOr[TagsList] = js.undefined
    ): RemoveTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceId" -> ResourceId.map { x => x: js.Any }),
        ("TagsList" -> TagsList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): RemoveTagsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsResponse]
    }
  }

  /**
   * <p>Specifies the type and name of a resource referenced by an event.</p>
   */
  @js.native
  trait Resource extends js.Object {
    var ResourceType: String
    var ResourceName: String
  }

  object Resource {
    def apply(
      ResourceType: js.UndefOr[String] = js.undefined,
      ResourceName: js.UndefOr[String] = js.undefined
    ): Resource = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceType" -> ResourceType.map { x => x: js.Any }),
        ("ResourceName" -> ResourceName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Resource]
    }
  }

  /**
   * <p>This exception is thrown when the specified resource is not found.</p>
   */
  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {

  }

  /**
   * <p>A resource tag.</p>
   */
  @js.native
  trait ResourceTag extends js.Object {
    var ResourceId: String
    var TagsList: TagsList
  }

  object ResourceTag {
    def apply(
      ResourceId: js.UndefOr[String] = js.undefined,
      TagsList: js.UndefOr[TagsList] = js.undefined
    ): ResourceTag = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ResourceId" -> ResourceId.map { x => x: js.Any }),
        ("TagsList" -> TagsList.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceTag]
    }
  }

  /**
   * <p>This exception is thrown when the specified resource type is not supported by CloudTrail.</p>
   */
  @js.native
  trait ResourceTypeNotSupportedExceptionException extends js.Object {

  }

  /**
   * <p>This exception is thrown when the specified S3 bucket does not exist.</p>
   */
  @js.native
  trait S3BucketDoesNotExistExceptionException extends js.Object {

  }

  /**
   * <p>The request to CloudTrail to start logging AWS API calls for an account.</p>
   */
  @js.native
  trait StartLoggingRequest extends js.Object {
    var Name: String
  }

  object StartLoggingRequest {
    def apply(
      Name: js.UndefOr[String] = js.undefined
    ): StartLoggingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): StartLoggingResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartLoggingResponse]
    }
  }

  /**
   * <p>Passes the request to CloudTrail to stop logging AWS API calls for the specified account.</p>
   */
  @js.native
  trait StopLoggingRequest extends js.Object {
    var Name: String
  }

  object StopLoggingRequest {
    def apply(
      Name: js.UndefOr[String] = js.undefined
    ): StopLoggingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Name" -> Name.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

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
    def apply(

    ): StopLoggingResponse = {
      val _fields = IndexedSeq[(String, js.Any)](

      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopLoggingResponse]
    }
  }

  /**
   * <p>A custom key-value pair associated with a resource such as a CloudTrail trail.</p>
   */
  @js.native
  trait Tag extends js.Object {
    var Key: String
    var Value: String
  }

  object Tag {
    def apply(
      Key: js.UndefOr[String] = js.undefined,
      Value: js.UndefOr[String] = js.undefined
    ): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Key" -> Key.map { x => x: js.Any }),
        ("Value" -> Value.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
    }
  }

  /**
   * <p>The number of tags per trail has exceeded the permitted amount. Currently, the limit is 50.</p>
   */
  @js.native
  trait TagsLimitExceededExceptionException extends js.Object {

  }

  /**
   * <p>The settings for a trail.</p>
   */
  @js.native
  trait Trail extends js.Object {
    var CloudWatchLogsRoleArn: String
    var CloudWatchLogsLogGroupArn: String
    var HasCustomEventSelectors: Boolean
    var Name: String
    var SnsTopicARN: String
    var KmsKeyId: String
    var IsMultiRegionTrail: Boolean
    var S3BucketName: String
    var SnsTopicName: String
    var LogFileValidationEnabled: Boolean
    var S3KeyPrefix: String
    var HomeRegion: String
    var IncludeGlobalServiceEvents: Boolean
    var TrailARN: String
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
      TrailARN: js.UndefOr[String] = js.undefined
    ): Trail = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CloudWatchLogsRoleArn" -> CloudWatchLogsRoleArn.map { x => x: js.Any }),
        ("CloudWatchLogsLogGroupArn" -> CloudWatchLogsLogGroupArn.map { x => x: js.Any }),
        ("HasCustomEventSelectors" -> HasCustomEventSelectors.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("SnsTopicARN" -> SnsTopicARN.map { x => x: js.Any }),
        ("KmsKeyId" -> KmsKeyId.map { x => x: js.Any }),
        ("IsMultiRegionTrail" -> IsMultiRegionTrail.map { x => x: js.Any }),
        ("S3BucketName" -> S3BucketName.map { x => x: js.Any }),
        ("SnsTopicName" -> SnsTopicName.map { x => x: js.Any }),
        ("LogFileValidationEnabled" -> LogFileValidationEnabled.map { x => x: js.Any }),
        ("S3KeyPrefix" -> S3KeyPrefix.map { x => x: js.Any }),
        ("HomeRegion" -> HomeRegion.map { x => x: js.Any }),
        ("IncludeGlobalServiceEvents" -> IncludeGlobalServiceEvents.map { x => x: js.Any }),
        ("TrailARN" -> TrailARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Trail]
    }
  }

  /**
   * <p>This exception is thrown when the specified trail already exists.</p>
   */
  @js.native
  trait TrailAlreadyExistsExceptionException extends js.Object {

  }

  /**
   * <p>This exception is thrown when the trail with the given name is not found.</p>
   */
  @js.native
  trait TrailNotFoundExceptionException extends js.Object {

  }

  /**
   * <p>This exception is deprecated.</p>
   */
  @js.native
  trait TrailNotProvidedExceptionException extends js.Object {

  }

  /**
   * <p>This exception is thrown when the requested operation is not supported.</p>
   */
  @js.native
  trait UnsupportedOperationExceptionException extends js.Object {

  }

  /**
   * <p>Specifies settings to update for the trail.</p>
   */
  @js.native
  trait UpdateTrailRequest extends js.Object {
    var CloudWatchLogsRoleArn: String
    var CloudWatchLogsLogGroupArn: String
    var Name: String
    var KmsKeyId: String
    var IsMultiRegionTrail: Boolean
    var S3BucketName: String
    var SnsTopicName: String
    var S3KeyPrefix: String
    var EnableLogFileValidation: Boolean
    var IncludeGlobalServiceEvents: Boolean
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
      IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.undefined
    ): UpdateTrailRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CloudWatchLogsRoleArn" -> CloudWatchLogsRoleArn.map { x => x: js.Any }),
        ("CloudWatchLogsLogGroupArn" -> CloudWatchLogsLogGroupArn.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("KmsKeyId" -> KmsKeyId.map { x => x: js.Any }),
        ("IsMultiRegionTrail" -> IsMultiRegionTrail.map { x => x: js.Any }),
        ("S3BucketName" -> S3BucketName.map { x => x: js.Any }),
        ("SnsTopicName" -> SnsTopicName.map { x => x: js.Any }),
        ("S3KeyPrefix" -> S3KeyPrefix.map { x => x: js.Any }),
        ("EnableLogFileValidation" -> EnableLogFileValidation.map { x => x: js.Any }),
        ("IncludeGlobalServiceEvents" -> IncludeGlobalServiceEvents.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTrailRequest]
    }
  }

  /**
   * <p>Returns the objects or data listed below if successful. Otherwise, returns an error.</p>
   */
  @js.native
  trait UpdateTrailResponse extends js.Object {
    var CloudWatchLogsRoleArn: String
    var CloudWatchLogsLogGroupArn: String
    var Name: String
    var SnsTopicARN: String
    var KmsKeyId: String
    var IsMultiRegionTrail: Boolean
    var S3BucketName: String
    var SnsTopicName: String
    var LogFileValidationEnabled: Boolean
    var S3KeyPrefix: String
    var IncludeGlobalServiceEvents: Boolean
    var TrailARN: String
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
      TrailARN: js.UndefOr[String] = js.undefined
    ): UpdateTrailResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CloudWatchLogsRoleArn" -> CloudWatchLogsRoleArn.map { x => x: js.Any }),
        ("CloudWatchLogsLogGroupArn" -> CloudWatchLogsLogGroupArn.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("SnsTopicARN" -> SnsTopicARN.map { x => x: js.Any }),
        ("KmsKeyId" -> KmsKeyId.map { x => x: js.Any }),
        ("IsMultiRegionTrail" -> IsMultiRegionTrail.map { x => x: js.Any }),
        ("S3BucketName" -> S3BucketName.map { x => x: js.Any }),
        ("SnsTopicName" -> SnsTopicName.map { x => x: js.Any }),
        ("LogFileValidationEnabled" -> LogFileValidationEnabled.map { x => x: js.Any }),
        ("S3KeyPrefix" -> S3KeyPrefix.map { x => x: js.Any }),
        ("IncludeGlobalServiceEvents" -> IncludeGlobalServiceEvents.map { x => x: js.Any }),
        ("TrailARN" -> TrailARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTrailResponse]
    }
  }
}
