package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object cloudtrail {
  type Date = js.Date
  type EventsList = js.Array[Event]
  type LookupAttributeKey = String
  type LookupAttributesList = js.Array[LookupAttribute]
  type MaxResults = Integer
  type NextToken = String
  type ResourceList = js.Array[Resource]
  type TrailList = js.Array[Trail]
  type TrailNameList = js.Array[String]
}

package cloudtrail {
  @js.native
  trait Cloudtrail extends js.Object {
    def createTrail(params: CreateTrailRequest, callback: Callback[CreateTrailResponse]): Unit = js.native
    def createTrail(params: CreateTrailRequest): Request[CreateTrailResponse] = js.native
    def deleteTrail(params: DeleteTrailRequest, callback: Callback[DeleteTrailResponse]): Unit = js.native
    def deleteTrail(params: DeleteTrailRequest): Request[DeleteTrailResponse] = js.native
    def describeTrails(params: DescribeTrailsRequest, callback: Callback[DescribeTrailsResponse]): Unit = js.native
    def describeTrails(params: DescribeTrailsRequest): Request[DescribeTrailsResponse] = js.native
    def getTrailStatus(params: GetTrailStatusRequest, callback: Callback[GetTrailStatusResponse]): Unit = js.native
    def getTrailStatus(params: GetTrailStatusRequest): Request[GetTrailStatusResponse] = js.native
    def lookupEvents(params: LookupEventsRequest, callback: Callback[LookupEventsResponse]): Unit = js.native
    def lookupEvents(params: LookupEventsRequest): Request[LookupEventsResponse] = js.native
    def startLogging(params: StartLoggingRequest, callback: Callback[StartLoggingResponse]): Unit = js.native
    def startLogging(params: StartLoggingRequest): Request[StartLoggingResponse] = js.native
    def stopLogging(params: StopLoggingRequest, callback: Callback[StopLoggingResponse]): Unit = js.native
    def stopLogging(params: StopLoggingRequest): Request[StopLoggingResponse] = js.native
    def updateTrail(params: UpdateTrailRequest, callback: Callback[UpdateTrailResponse]): Unit = js.native
    def updateTrail(params: UpdateTrailRequest): Request[UpdateTrailResponse] = js.native
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
    var S3BucketName: String
    var SnsTopicName: String
    var S3KeyPrefix: String
    var IncludeGlobalServiceEvents: Boolean
  }

  object CreateTrailRequest {
    def apply(
      CloudWatchLogsRoleArn: js.UndefOr[String] = js.undefined,
      CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      S3BucketName: js.UndefOr[String] = js.undefined,
      SnsTopicName: js.UndefOr[String] = js.undefined,
      S3KeyPrefix: js.UndefOr[String] = js.undefined,
      IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.undefined
    ): CreateTrailRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CloudWatchLogsRoleArn" -> CloudWatchLogsRoleArn.map { x => x: js.Any }),
        ("CloudWatchLogsLogGroupArn" -> CloudWatchLogsLogGroupArn.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("S3BucketName" -> S3BucketName.map { x => x: js.Any }),
        ("SnsTopicName" -> SnsTopicName.map { x => x: js.Any }),
        ("S3KeyPrefix" -> S3KeyPrefix.map { x => x: js.Any }),
        ("IncludeGlobalServiceEvents" -> IncludeGlobalServiceEvents.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTrailRequest]
    }
  }

  /**
   * Returns the objects or data listed below if successful. Otherwise, returns an error.
   */
  @js.native
  trait CreateTrailResponse extends js.Object {
    var CloudWatchLogsRoleArn: String
    var CloudWatchLogsLogGroupArn: String
    var Name: String
    var S3BucketName: String
    var SnsTopicName: String
    var S3KeyPrefix: String
    var IncludeGlobalServiceEvents: Boolean
  }

  object CreateTrailResponse {
    def apply(
      CloudWatchLogsRoleArn: js.UndefOr[String] = js.undefined,
      CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      S3BucketName: js.UndefOr[String] = js.undefined,
      SnsTopicName: js.UndefOr[String] = js.undefined,
      S3KeyPrefix: js.UndefOr[String] = js.undefined,
      IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.undefined
    ): CreateTrailResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CloudWatchLogsRoleArn" -> CloudWatchLogsRoleArn.map { x => x: js.Any }),
        ("CloudWatchLogsLogGroupArn" -> CloudWatchLogsLogGroupArn.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("S3BucketName" -> S3BucketName.map { x => x: js.Any }),
        ("SnsTopicName" -> SnsTopicName.map { x => x: js.Any }),
        ("S3KeyPrefix" -> S3KeyPrefix.map { x => x: js.Any }),
        ("IncludeGlobalServiceEvents" -> IncludeGlobalServiceEvents.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTrailResponse]
    }
  }

  /**
   * <a>The request that specifies the name of a trail to delete.</a>
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
  }

  object DescribeTrailsRequest {
    def apply(
      trailNameList: js.UndefOr[TrailNameList] = js.undefined
    ): DescribeTrailsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("trailNameList" -> trailNameList.map { x => x: js.Any })
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
   * <p>Contains information about an event that was returned by a lookup request. The result includes a representation of a CloudTrail event. </p>
   */
  @js.native
  trait Event extends js.Object {
    var Username: String
    var Resources: ResourceList
    var CloudTrailEvent: String
    var EventId: String
    var EventTime: Date
    var EventName: String
  }

  object Event {
    def apply(
      Username: js.UndefOr[String] = js.undefined,
      Resources: js.UndefOr[ResourceList] = js.undefined,
      CloudTrailEvent: js.UndefOr[String] = js.undefined,
      EventId: js.UndefOr[String] = js.undefined,
      EventTime: js.UndefOr[Date] = js.undefined,
      EventName: js.UndefOr[String] = js.undefined
    ): Event = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("Username" -> Username.map { x => x: js.Any }),
        ("Resources" -> Resources.map { x => x: js.Any }),
        ("CloudTrailEvent" -> CloudTrailEvent.map { x => x: js.Any }),
        ("EventId" -> EventId.map { x => x: js.Any }),
        ("EventTime" -> EventTime.map { x => x: js.Any }),
        ("EventName" -> EventName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Event]
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
    var LatestNotificationTime: Date
    var IsLogging: Boolean
    var StopLoggingTime: Date
    var LatestNotificationError: String
    var LatestCloudWatchLogsDeliveryTime: Date
    var LatestCloudWatchLogsDeliveryError: String
    var LatestDeliveryTime: Date
    var StartLoggingTime: Date
    var LatestDeliveryError: String
  }

  object GetTrailStatusResponse {
    def apply(
      LatestNotificationTime: js.UndefOr[Date] = js.undefined,
      IsLogging: js.UndefOr[Boolean] = js.undefined,
      StopLoggingTime: js.UndefOr[Date] = js.undefined,
      LatestNotificationError: js.UndefOr[String] = js.undefined,
      LatestCloudWatchLogsDeliveryTime: js.UndefOr[Date] = js.undefined,
      LatestCloudWatchLogsDeliveryError: js.UndefOr[String] = js.undefined,
      LatestDeliveryTime: js.UndefOr[Date] = js.undefined,
      StartLoggingTime: js.UndefOr[Date] = js.undefined,
      LatestDeliveryError: js.UndefOr[String] = js.undefined
    ): GetTrailStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("LatestNotificationTime" -> LatestNotificationTime.map { x => x: js.Any }),
        ("IsLogging" -> IsLogging.map { x => x: js.Any }),
        ("StopLoggingTime" -> StopLoggingTime.map { x => x: js.Any }),
        ("LatestNotificationError" -> LatestNotificationError.map { x => x: js.Any }),
        ("LatestCloudWatchLogsDeliveryTime" -> LatestCloudWatchLogsDeliveryTime.map { x => x: js.Any }),
        ("LatestCloudWatchLogsDeliveryError" -> LatestCloudWatchLogsDeliveryError.map { x => x: js.Any }),
        ("LatestDeliveryTime" -> LatestDeliveryTime.map { x => x: js.Any }),
        ("StartLoggingTime" -> StartLoggingTime.map { x => x: js.Any }),
        ("LatestDeliveryError" -> LatestDeliveryError.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTrailStatusResponse]
    }
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
   * <p>Occurs when an invalid lookup attribute is specified.</p>
   */
  @js.native
  trait InvalidLookupAttributesExceptionException extends js.Object {

  }

  /**
   * <p>This exception is thrown if the limit specified is invalid. </p>
   */
  @js.native
  trait InvalidMaxResultsExceptionException extends js.Object {

  }

  /**
   * <p>Invalid token or token that was previously used in a request with different parameters. This exception is thrown if the token is invalid. </p>
   */
  @js.native
  trait InvalidNextTokenExceptionException extends js.Object {

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
   * <p>This exception is thrown when the provided SNS topic name is not valid. </p>
   */
  @js.native
  trait InvalidSnsTopicNameExceptionException extends js.Object {

  }

  /**
   * <p>Occurs if the timestamp values are invalid. Either the start time occurs after the end time or the time range is outside the range of possible values. </p>
   */
  @js.native
  trait InvalidTimeRangeExceptionException extends js.Object {

  }

  /**
   * <p>This exception is thrown when the provided trail name is not valid.</p>
   */
  @js.native
  trait InvalidTrailNameExceptionException extends js.Object {

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

    val values = IndexedSeq(EventId, EventName, Username, ResourceType, ResourceName)
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
   * <p>The settings for a trail.</p>
   */
  @js.native
  trait Trail extends js.Object {
    var CloudWatchLogsRoleArn: String
    var CloudWatchLogsLogGroupArn: String
    var Name: String
    var S3BucketName: String
    var SnsTopicName: String
    var S3KeyPrefix: String
    var IncludeGlobalServiceEvents: Boolean
  }

  object Trail {
    def apply(
      CloudWatchLogsRoleArn: js.UndefOr[String] = js.undefined,
      CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      S3BucketName: js.UndefOr[String] = js.undefined,
      SnsTopicName: js.UndefOr[String] = js.undefined,
      S3KeyPrefix: js.UndefOr[String] = js.undefined,
      IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.undefined
    ): Trail = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CloudWatchLogsRoleArn" -> CloudWatchLogsRoleArn.map { x => x: js.Any }),
        ("CloudWatchLogsLogGroupArn" -> CloudWatchLogsLogGroupArn.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("S3BucketName" -> S3BucketName.map { x => x: js.Any }),
        ("SnsTopicName" -> SnsTopicName.map { x => x: js.Any }),
        ("S3KeyPrefix" -> S3KeyPrefix.map { x => x: js.Any }),
        ("IncludeGlobalServiceEvents" -> IncludeGlobalServiceEvents.map { x => x: js.Any })
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
   * <p>Specifies settings to update for the trail.</p>
   */
  @js.native
  trait UpdateTrailRequest extends js.Object {
    var CloudWatchLogsRoleArn: String
    var CloudWatchLogsLogGroupArn: String
    var Name: String
    var S3BucketName: String
    var SnsTopicName: String
    var S3KeyPrefix: String
    var IncludeGlobalServiceEvents: Boolean
  }

  object UpdateTrailRequest {
    def apply(
      CloudWatchLogsRoleArn: js.UndefOr[String] = js.undefined,
      CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      S3BucketName: js.UndefOr[String] = js.undefined,
      SnsTopicName: js.UndefOr[String] = js.undefined,
      S3KeyPrefix: js.UndefOr[String] = js.undefined,
      IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.undefined
    ): UpdateTrailRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CloudWatchLogsRoleArn" -> CloudWatchLogsRoleArn.map { x => x: js.Any }),
        ("CloudWatchLogsLogGroupArn" -> CloudWatchLogsLogGroupArn.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("S3BucketName" -> S3BucketName.map { x => x: js.Any }),
        ("SnsTopicName" -> SnsTopicName.map { x => x: js.Any }),
        ("S3KeyPrefix" -> S3KeyPrefix.map { x => x: js.Any }),
        ("IncludeGlobalServiceEvents" -> IncludeGlobalServiceEvents.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTrailRequest]
    }
  }

  /**
   * Returns the objects or data listed below if successful. Otherwise, returns an error.
   */
  @js.native
  trait UpdateTrailResponse extends js.Object {
    var CloudWatchLogsRoleArn: String
    var CloudWatchLogsLogGroupArn: String
    var Name: String
    var S3BucketName: String
    var SnsTopicName: String
    var S3KeyPrefix: String
    var IncludeGlobalServiceEvents: Boolean
  }

  object UpdateTrailResponse {
    def apply(
      CloudWatchLogsRoleArn: js.UndefOr[String] = js.undefined,
      CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.undefined,
      Name: js.UndefOr[String] = js.undefined,
      S3BucketName: js.UndefOr[String] = js.undefined,
      SnsTopicName: js.UndefOr[String] = js.undefined,
      S3KeyPrefix: js.UndefOr[String] = js.undefined,
      IncludeGlobalServiceEvents: js.UndefOr[Boolean] = js.undefined
    ): UpdateTrailResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("CloudWatchLogsRoleArn" -> CloudWatchLogsRoleArn.map { x => x: js.Any }),
        ("CloudWatchLogsLogGroupArn" -> CloudWatchLogsLogGroupArn.map { x => x: js.Any }),
        ("Name" -> Name.map { x => x: js.Any }),
        ("S3BucketName" -> S3BucketName.map { x => x: js.Any }),
        ("SnsTopicName" -> SnsTopicName.map { x => x: js.Any }),
        ("S3KeyPrefix" -> S3KeyPrefix.map { x => x: js.Any }),
        ("IncludeGlobalServiceEvents" -> IncludeGlobalServiceEvents.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTrailResponse]
    }
  }
}
