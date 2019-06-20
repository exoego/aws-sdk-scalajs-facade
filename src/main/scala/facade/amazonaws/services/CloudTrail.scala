package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object cloudtrail {
  type ByteBuffer =
    nodejs.buffer.Buffer | nodejs.stream.Readable | js.typedarray.TypedArray[_, _] | js.Array[Byte] | String
  type DataResourceValues   = js.Array[String]
  type DataResources        = js.Array[DataResource]
  type Date                 = js.Date
  type EventSelectors       = js.Array[EventSelector]
  type EventsList           = js.Array[Event]
  type LookupAttributeKey   = String
  type LookupAttributesList = js.Array[LookupAttribute]
  type MaxResults           = Int
  type NextToken            = String
  type PublicKeyList        = js.Array[PublicKey]
  type ReadWriteType        = String
  type ResourceIdList       = js.Array[String]
  type ResourceList         = js.Array[Resource]
  type ResourceTagList      = js.Array[ResourceTag]
  type TagsList             = js.Array[Tag]
  type TrailList            = js.Array[Trail]
  type TrailNameList        = js.Array[String]
}

package cloudtrail {
  @js.native
  @JSImport("aws-sdk", "CloudTrail")
  class CloudTrail() extends js.Object {
    def this(config: AWSConfig) = this()

    def addTags(params: AddTagsRequest): Request[AddTagsResponse]                               = js.native
    def createTrail(params: CreateTrailRequest): Request[CreateTrailResponse]                   = js.native
    def deleteTrail(params: DeleteTrailRequest): Request[DeleteTrailResponse]                   = js.native
    def describeTrails(params: DescribeTrailsRequest): Request[DescribeTrailsResponse]          = js.native
    def getEventSelectors(params: GetEventSelectorsRequest): Request[GetEventSelectorsResponse] = js.native
    def getTrailStatus(params: GetTrailStatusRequest): Request[GetTrailStatusResponse]          = js.native
    def listPublicKeys(params: ListPublicKeysRequest): Request[ListPublicKeysResponse]          = js.native
    def listTags(params: ListTagsRequest): Request[ListTagsResponse]                            = js.native
    def lookupEvents(params: LookupEventsRequest): Request[LookupEventsResponse]                = js.native
    def putEventSelectors(params: PutEventSelectorsRequest): Request[PutEventSelectorsResponse] = js.native
    def removeTags(params: RemoveTagsRequest): Request[RemoveTagsResponse]                      = js.native
    def startLogging(params: StartLoggingRequest): Request[StartLoggingResponse]                = js.native
    def stopLogging(params: StopLoggingRequest): Request[StopLoggingResponse]                   = js.native
    def updateTrail(params: UpdateTrailRequest): Request[UpdateTrailResponse]                   = js.native
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
    def apply(
        ResourceId: String,
        TagsList: js.UndefOr[TagsList] = js.undefined
    ): AddTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "TagsList" -> TagsList.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsRequest]
    }
  }

  /**
    * Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  trait AddTagsResponse extends js.Object {}

  object AddTagsResponse {
    def apply(
        ): AddTagsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AddTagsResponse]
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
  }

  object CreateTrailRequest {
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
        SnsTopicName: js.UndefOr[String] = js.undefined
    ): CreateTrailRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name"         -> Name.asInstanceOf[js.Any],
        "S3BucketName" -> S3BucketName.asInstanceOf[js.Any],
        "CloudWatchLogsLogGroupArn" -> CloudWatchLogsLogGroupArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CloudWatchLogsRoleArn" -> CloudWatchLogsRoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableLogFileValidation" -> EnableLogFileValidation.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IncludeGlobalServiceEvents" -> IncludeGlobalServiceEvents.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IsMultiRegionTrail" -> IsMultiRegionTrail.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IsOrganizationTrail" -> IsOrganizationTrail.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KmsKeyId" -> KmsKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3KeyPrefix" -> S3KeyPrefix.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnsTopicName" -> SnsTopicName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTrailRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudWatchLogsLogGroupArn" -> CloudWatchLogsLogGroupArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CloudWatchLogsRoleArn" -> CloudWatchLogsRoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IncludeGlobalServiceEvents" -> IncludeGlobalServiceEvents.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IsMultiRegionTrail" -> IsMultiRegionTrail.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IsOrganizationTrail" -> IsOrganizationTrail.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KmsKeyId" -> KmsKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogFileValidationEnabled" -> LogFileValidationEnabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3BucketName" -> S3BucketName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3KeyPrefix" -> S3KeyPrefix.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnsTopicARN" -> SnsTopicARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnsTopicName" -> SnsTopicName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TrailARN" -> TrailARN.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateTrailResponse]
    }
  }

  /**
    * The Amazon S3 buckets or AWS Lambda functions that you specify in your event selectors for your trail to log data events. Data events provide insight into the resource operations performed on or within a resource itself. These are also known as data plane operations. You can specify up to 250 data resources for a trail.
    *
    * '''Note:'''The total number of allowed data resources is 250. This number can be distributed between 1 and 5 event selectors, but the total cannot exceed 250 across all selectors.
    * The following example demonstrates how logging works when you configure logging of all data events for an S3 bucket named <code>bucket-1</code>. In this example, the CloudTrail user spcified an empty prefix, and the option to log both <code>Read</code> and <code>Write</code> data events.
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
    def apply(
        Type: js.UndefOr[String] = js.undefined,
        Values: js.UndefOr[DataResourceValues] = js.undefined
    ): DataResource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Values" -> Values.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DataResource]
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
    def apply(
        Name: String
    ): DeleteTrailRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTrailRequest]
    }
  }

  /**
    * Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  trait DeleteTrailResponse extends js.Object {}

  object DeleteTrailResponse {
    def apply(
        ): DeleteTrailResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteTrailResponse]
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
    def apply(
        includeShadowTrails: js.UndefOr[Boolean] = js.undefined,
        trailNameList: js.UndefOr[TrailNameList] = js.undefined
    ): DescribeTrailsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "includeShadowTrails" -> includeShadowTrails.map { x =>
          x.asInstanceOf[js.Any]
        },
        "trailNameList" -> trailNameList.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTrailsRequest]
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
    def apply(
        trailList: js.UndefOr[TrailList] = js.undefined
    ): DescribeTrailsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "trailList" -> trailList.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeTrailsResponse]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "AccessKeyId" -> AccessKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CloudTrailEvent" -> CloudTrailEvent.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EventId" -> EventId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EventName" -> EventName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EventSource" -> EventSource.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EventTime" -> EventTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReadOnly" -> ReadOnly.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Resources" -> Resources.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Username" -> Username.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Event]
    }
  }

  /**
    * Use event selectors to further specify the management and data event settings for your trail. By default, trails created without specific event selectors will be configured to log all read and write management events, and no data events. When an event occurs in your account, CloudTrail evaluates the event selector for all trails. For each trail, if the event matches any event selector, the trail processes and logs the event. If the event doesn't match any event selector, the trail doesn't log the event.
    *  You can configure up to five event selectors for a trail.
    */
  @js.native
  trait EventSelector extends js.Object {
    var DataResources: js.UndefOr[DataResources]
    var IncludeManagementEvents: js.UndefOr[Boolean]
    var ReadWriteType: js.UndefOr[ReadWriteType]
  }

  object EventSelector {
    def apply(
        DataResources: js.UndefOr[DataResources] = js.undefined,
        IncludeManagementEvents: js.UndefOr[Boolean] = js.undefined,
        ReadWriteType: js.UndefOr[ReadWriteType] = js.undefined
    ): EventSelector = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DataResources" -> DataResources.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IncludeManagementEvents" -> IncludeManagementEvents.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ReadWriteType" -> ReadWriteType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EventSelector]
    }
  }

  @js.native
  trait GetEventSelectorsRequest extends js.Object {
    var TrailName: String
  }

  object GetEventSelectorsRequest {
    def apply(
        TrailName: String
    ): GetEventSelectorsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "TrailName" -> TrailName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEventSelectorsRequest]
    }
  }

  @js.native
  trait GetEventSelectorsResponse extends js.Object {
    var EventSelectors: js.UndefOr[EventSelectors]
    var TrailARN: js.UndefOr[String]
  }

  object GetEventSelectorsResponse {
    def apply(
        EventSelectors: js.UndefOr[EventSelectors] = js.undefined,
        TrailARN: js.UndefOr[String] = js.undefined
    ): GetEventSelectorsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventSelectors" -> EventSelectors.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TrailARN" -> TrailARN.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetEventSelectorsResponse]
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
    def apply(
        Name: String
    ): GetTrailStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTrailStatusRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "IsLogging" -> IsLogging.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestCloudWatchLogsDeliveryError" -> LatestCloudWatchLogsDeliveryError.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestCloudWatchLogsDeliveryTime" -> LatestCloudWatchLogsDeliveryTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestDeliveryAttemptSucceeded" -> LatestDeliveryAttemptSucceeded.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestDeliveryAttemptTime" -> LatestDeliveryAttemptTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestDeliveryError" -> LatestDeliveryError.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestDeliveryTime" -> LatestDeliveryTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestDigestDeliveryError" -> LatestDigestDeliveryError.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestDigestDeliveryTime" -> LatestDigestDeliveryTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestNotificationAttemptSucceeded" -> LatestNotificationAttemptSucceeded.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestNotificationAttemptTime" -> LatestNotificationAttemptTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestNotificationError" -> LatestNotificationError.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LatestNotificationTime" -> LatestNotificationTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartLoggingTime" -> StartLoggingTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StopLoggingTime" -> StopLoggingTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimeLoggingStarted" -> TimeLoggingStarted.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TimeLoggingStopped" -> TimeLoggingStopped.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetTrailStatusResponse]
    }
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
    def apply(
        EndTime: js.UndefOr[Date] = js.undefined,
        NextToken: js.UndefOr[String] = js.undefined,
        StartTime: js.UndefOr[Date] = js.undefined
    ): ListPublicKeysRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndTime" -> EndTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartTime" -> StartTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPublicKeysRequest]
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
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        PublicKeyList: js.UndefOr[PublicKeyList] = js.undefined
    ): ListPublicKeysResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PublicKeyList" -> PublicKeyList.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListPublicKeysResponse]
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
    def apply(
        ResourceIdList: ResourceIdList,
        NextToken: js.UndefOr[String] = js.undefined
    ): ListTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceIdList" -> ResourceIdList.asInstanceOf[js.Any],
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsRequest]
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
    def apply(
        NextToken: js.UndefOr[String] = js.undefined,
        ResourceTagList: js.UndefOr[ResourceTagList] = js.undefined
    ): ListTagsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceTagList" -> ResourceTagList.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListTagsResponse]
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
    def apply(
        AttributeKey: LookupAttributeKey,
        AttributeValue: String
    ): LookupAttribute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AttributeKey"   -> AttributeKey.asInstanceOf[js.Any],
        "AttributeValue" -> AttributeValue.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LookupAttribute]
    }
  }

  object LookupAttributeKeyEnum {
    val EventId      = "EventId"
    val EventName    = "EventName"
    val ReadOnly     = "ReadOnly"
    val Username     = "Username"
    val ResourceType = "ResourceType"
    val ResourceName = "ResourceName"
    val EventSource  = "EventSource"
    val AccessKeyId  = "AccessKeyId"

    val values =
      IndexedSeq(EventId, EventName, ReadOnly, Username, ResourceType, ResourceName, EventSource, AccessKeyId)
  }

  /**
    * Contains a request for LookupEvents.
    */
  @js.native
  trait LookupEventsRequest extends js.Object {
    var EndTime: js.UndefOr[Date]
    var LookupAttributes: js.UndefOr[LookupAttributesList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
    var StartTime: js.UndefOr[Date]
  }

  object LookupEventsRequest {
    def apply(
        EndTime: js.UndefOr[Date] = js.undefined,
        LookupAttributes: js.UndefOr[LookupAttributesList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined,
        StartTime: js.UndefOr[Date] = js.undefined
    ): LookupEventsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndTime" -> EndTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LookupAttributes" -> LookupAttributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        },
        "StartTime" -> StartTime.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LookupEventsRequest]
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
    def apply(
        Events: js.UndefOr[EventsList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): LookupEventsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Events" -> Events.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[LookupEventsResponse]
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
    def apply(
        Fingerprint: js.UndefOr[String] = js.undefined,
        ValidityEndTime: js.UndefOr[Date] = js.undefined,
        ValidityStartTime: js.UndefOr[Date] = js.undefined,
        Value: js.UndefOr[ByteBuffer] = js.undefined
    ): PublicKey = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Fingerprint" -> Fingerprint.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ValidityEndTime" -> ValidityEndTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ValidityStartTime" -> ValidityStartTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Value" -> Value.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PublicKey]
    }
  }

  @js.native
  trait PutEventSelectorsRequest extends js.Object {
    var EventSelectors: EventSelectors
    var TrailName: String
  }

  object PutEventSelectorsRequest {
    def apply(
        EventSelectors: EventSelectors,
        TrailName: String
    ): PutEventSelectorsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventSelectors" -> EventSelectors.asInstanceOf[js.Any],
        "TrailName"      -> TrailName.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutEventSelectorsRequest]
    }
  }

  @js.native
  trait PutEventSelectorsResponse extends js.Object {
    var EventSelectors: js.UndefOr[EventSelectors]
    var TrailARN: js.UndefOr[String]
  }

  object PutEventSelectorsResponse {
    def apply(
        EventSelectors: js.UndefOr[EventSelectors] = js.undefined,
        TrailARN: js.UndefOr[String] = js.undefined
    ): PutEventSelectorsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EventSelectors" -> EventSelectors.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TrailARN" -> TrailARN.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutEventSelectorsResponse]
    }
  }

  object ReadWriteTypeEnum {
    val ReadOnly  = "ReadOnly"
    val WriteOnly = "WriteOnly"
    val All       = "All"

    val values = IndexedSeq(ReadOnly, WriteOnly, All)
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
    def apply(
        ResourceId: String,
        TagsList: js.UndefOr[TagsList] = js.undefined
    ): RemoveTagsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.asInstanceOf[js.Any],
        "TagsList" -> TagsList.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsRequest]
    }
  }

  /**
    * Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  trait RemoveTagsResponse extends js.Object {}

  object RemoveTagsResponse {
    def apply(
        ): RemoveTagsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RemoveTagsResponse]
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
    def apply(
        ResourceName: js.UndefOr[String] = js.undefined,
        ResourceType: js.UndefOr[String] = js.undefined
    ): Resource = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceName" -> ResourceName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ResourceType" -> ResourceType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Resource]
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
    def apply(
        ResourceId: js.UndefOr[String] = js.undefined,
        TagsList: js.UndefOr[TagsList] = js.undefined
    ): ResourceTag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ResourceId" -> ResourceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TagsList" -> TagsList.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceTag]
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
    def apply(
        Name: String
    ): StartLoggingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartLoggingRequest]
    }
  }

  /**
    * Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  trait StartLoggingResponse extends js.Object {}

  object StartLoggingResponse {
    def apply(
        ): StartLoggingResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartLoggingResponse]
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
    def apply(
        Name: String
    ): StopLoggingRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopLoggingRequest]
    }
  }

  /**
    * Returns the objects or data listed below if successful. Otherwise, returns an error.
    */
  @js.native
  trait StopLoggingResponse extends js.Object {}

  object StopLoggingResponse {
    def apply(
        ): StopLoggingResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopLoggingResponse]
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
    def apply(
        Key: String,
        Value: js.UndefOr[String] = js.undefined
    ): Tag = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Tag]
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
    def apply(
        CloudWatchLogsLogGroupArn: js.UndefOr[String] = js.undefined,
        CloudWatchLogsRoleArn: js.UndefOr[String] = js.undefined,
        HasCustomEventSelectors: js.UndefOr[Boolean] = js.undefined,
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudWatchLogsLogGroupArn" -> CloudWatchLogsLogGroupArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CloudWatchLogsRoleArn" -> CloudWatchLogsRoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HasCustomEventSelectors" -> HasCustomEventSelectors.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HomeRegion" -> HomeRegion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IncludeGlobalServiceEvents" -> IncludeGlobalServiceEvents.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IsMultiRegionTrail" -> IsMultiRegionTrail.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IsOrganizationTrail" -> IsOrganizationTrail.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KmsKeyId" -> KmsKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogFileValidationEnabled" -> LogFileValidationEnabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3BucketName" -> S3BucketName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3KeyPrefix" -> S3KeyPrefix.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnsTopicARN" -> SnsTopicARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnsTopicName" -> SnsTopicName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TrailARN" -> TrailARN.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Trail]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.asInstanceOf[js.Any],
        "CloudWatchLogsLogGroupArn" -> CloudWatchLogsLogGroupArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CloudWatchLogsRoleArn" -> CloudWatchLogsRoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EnableLogFileValidation" -> EnableLogFileValidation.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IncludeGlobalServiceEvents" -> IncludeGlobalServiceEvents.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IsMultiRegionTrail" -> IsMultiRegionTrail.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IsOrganizationTrail" -> IsOrganizationTrail.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KmsKeyId" -> KmsKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3BucketName" -> S3BucketName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3KeyPrefix" -> S3KeyPrefix.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnsTopicName" -> SnsTopicName.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTrailRequest]
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
      val _fields = IndexedSeq[(String, js.Any)](
        "CloudWatchLogsLogGroupArn" -> CloudWatchLogsLogGroupArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CloudWatchLogsRoleArn" -> CloudWatchLogsRoleArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IncludeGlobalServiceEvents" -> IncludeGlobalServiceEvents.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IsMultiRegionTrail" -> IsMultiRegionTrail.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IsOrganizationTrail" -> IsOrganizationTrail.map { x =>
          x.asInstanceOf[js.Any]
        },
        "KmsKeyId" -> KmsKeyId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LogFileValidationEnabled" -> LogFileValidationEnabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3BucketName" -> S3BucketName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "S3KeyPrefix" -> S3KeyPrefix.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnsTopicARN" -> SnsTopicARN.map { x =>
          x.asInstanceOf[js.Any]
        },
        "SnsTopicName" -> SnsTopicName.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TrailARN" -> TrailARN.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateTrailResponse]
    }
  }
}
