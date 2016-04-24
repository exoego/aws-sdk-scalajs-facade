package facade.amazonaws.services

import scalajs._
import facade.amazonaws._

package object config {
  type ARN = String
  type AccountId = String
  type AvailabilityZone = String
  type ChannelName = String
  type ChronologicalOrder = String
  type Configuration = String
  type ConfigurationItemCaptureTime = js.Date
  type ConfigurationItemList = js.Array[ConfigurationItem]
  type ConfigurationItemMD5Hash = String
  type ConfigurationItemStatus = String
  type ConfigurationRecorderList = js.Array[ConfigurationRecorder]
  type ConfigurationRecorderNameList = js.Array[RecorderName]
  type ConfigurationRecorderStatusList = js.Array[ConfigurationRecorderStatus]
  type ConfigurationStateId = String
  type Date = js.Date
  type DeliveryChannelList = js.Array[DeliveryChannel]
  type DeliveryChannelNameList = js.Array[ChannelName]
  type DeliveryChannelStatusList = js.Array[DeliveryChannelStatus]
  type DeliveryStatus = String
  type EarlierTime = js.Date
  type LaterTime = js.Date
  type Limit = Integer
  type Name = String
  type NextToken = String
  type RecorderName = String
  type RecorderStatus = String
  type RelatedEvent = String
  type RelatedEventList = js.Array[RelatedEvent]
  type RelationshipList = js.Array[Relationship]
  type RelationshipName = String
  type ResourceCreationTime = js.Date
  type ResourceId = String
  type ResourceType = String
  type Tags = js.Dictionary[Value]
  type Value = String
  type Version = String
}

package config {
  @js.native
  trait Config extends js.Object {
    def deleteDeliveryChannel(params: DeleteDeliveryChannelRequest, callback: Callback[js.Object]): Unit = js.native
    def deleteDeliveryChannel(params: DeleteDeliveryChannelRequest): Request[js.Object] = js.native
    def deliverConfigSnapshot(params: DeliverConfigSnapshotRequest, callback: Callback[DeliverConfigSnapshotResponse]): Unit = js.native
    def deliverConfigSnapshot(params: DeliverConfigSnapshotRequest): Request[DeliverConfigSnapshotResponse] = js.native
    def describeConfigurationRecorderStatus(params: DescribeConfigurationRecorderStatusRequest, callback: Callback[DescribeConfigurationRecorderStatusResponse]): Unit = js.native
    def describeConfigurationRecorderStatus(params: DescribeConfigurationRecorderStatusRequest): Request[DescribeConfigurationRecorderStatusResponse] = js.native
    def describeConfigurationRecorders(params: DescribeConfigurationRecordersRequest, callback: Callback[DescribeConfigurationRecordersResponse]): Unit = js.native
    def describeConfigurationRecorders(params: DescribeConfigurationRecordersRequest): Request[DescribeConfigurationRecordersResponse] = js.native
    def describeDeliveryChannelStatus(params: DescribeDeliveryChannelStatusRequest, callback: Callback[DescribeDeliveryChannelStatusResponse]): Unit = js.native
    def describeDeliveryChannelStatus(params: DescribeDeliveryChannelStatusRequest): Request[DescribeDeliveryChannelStatusResponse] = js.native
    def describeDeliveryChannels(params: DescribeDeliveryChannelsRequest, callback: Callback[DescribeDeliveryChannelsResponse]): Unit = js.native
    def describeDeliveryChannels(params: DescribeDeliveryChannelsRequest): Request[DescribeDeliveryChannelsResponse] = js.native
    def getResourceConfigHistory(params: GetResourceConfigHistoryRequest, callback: Callback[GetResourceConfigHistoryResponse]): Unit = js.native
    def getResourceConfigHistory(params: GetResourceConfigHistoryRequest): Request[GetResourceConfigHistoryResponse] = js.native
    def putConfigurationRecorder(params: PutConfigurationRecorderRequest, callback: Callback[js.Object]): Unit = js.native
    def putConfigurationRecorder(params: PutConfigurationRecorderRequest): Request[js.Object] = js.native
    def putDeliveryChannel(params: PutDeliveryChannelRequest, callback: Callback[js.Object]): Unit = js.native
    def putDeliveryChannel(params: PutDeliveryChannelRequest): Request[js.Object] = js.native
    def startConfigurationRecorder(params: StartConfigurationRecorderRequest, callback: Callback[js.Object]): Unit = js.native
    def startConfigurationRecorder(params: StartConfigurationRecorderRequest): Request[js.Object] = js.native
    def stopConfigurationRecorder(params: StopConfigurationRecorderRequest, callback: Callback[js.Object]): Unit = js.native
    def stopConfigurationRecorder(params: StopConfigurationRecorderRequest): Request[js.Object] = js.native
  }


  object ChronologicalOrderEnum {
    val Reverse = "Reverse"
    val Forward = "Forward"

    val values = IndexedSeq(Reverse, Forward)
  }

  /**
   * <p>A list that contains the status of the delivery of either the snapshot or the configuration history to the specified Amazon S3 bucket.</p>
   */
  @js.native
  trait ConfigExportDeliveryInfo extends js.Object {
    var lastAttemptTime: Date
    var lastStatus: DeliveryStatus
    var lastErrorMessage: String
    var lastErrorCode: String
    var lastSuccessfulTime: Date
  }

  object ConfigExportDeliveryInfo {
    def apply(
      lastAttemptTime: js.UndefOr[Date] = js.undefined,
      lastStatus: js.UndefOr[DeliveryStatus] = js.undefined,
      lastErrorMessage: js.UndefOr[String] = js.undefined,
      lastErrorCode: js.UndefOr[String] = js.undefined,
      lastSuccessfulTime: js.UndefOr[Date] = js.undefined
    ): ConfigExportDeliveryInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("lastAttemptTime" -> lastAttemptTime.map { x => x: js.Any }),
        ("lastStatus" -> lastStatus.map { x => x: js.Any }),
        ("lastErrorMessage" -> lastErrorMessage.map { x => x: js.Any }),
        ("lastErrorCode" -> lastErrorCode.map { x => x: js.Any }),
        ("lastSuccessfulTime" -> lastSuccessfulTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigExportDeliveryInfo]
    }
  }

  /**
   * <p>A list that contains the status of the delivery of the configuration stream notification to the Amazon SNS topic. </p>
   */
  @js.native
  trait ConfigStreamDeliveryInfo extends js.Object {
    var lastStatus: DeliveryStatus
    var lastErrorCode: String
    var lastErrorMessage: String
    var lastStatusChangeTime: Date
  }

  object ConfigStreamDeliveryInfo {
    def apply(
      lastStatus: js.UndefOr[DeliveryStatus] = js.undefined,
      lastErrorCode: js.UndefOr[String] = js.undefined,
      lastErrorMessage: js.UndefOr[String] = js.undefined,
      lastStatusChangeTime: js.UndefOr[Date] = js.undefined
    ): ConfigStreamDeliveryInfo = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("lastStatus" -> lastStatus.map { x => x: js.Any }),
        ("lastErrorCode" -> lastErrorCode.map { x => x: js.Any }),
        ("lastErrorMessage" -> lastErrorMessage.map { x => x: js.Any }),
        ("lastStatusChangeTime" -> lastStatusChangeTime.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigStreamDeliveryInfo]
    }
  }

  /**
   * <p>A list that contains detailed configurations of a specified resource.</p> <note> <p>Currently, the list does not contain information about non-AWS components (for example, applications on your Amazon EC2 instances). </p> </note>
   */
  @js.native
  trait ConfigurationItem extends js.Object {
    var resourceId: ResourceId
    var arn: ARN
    var resourceType: ResourceType
    var tags: Tags
    var availabilityZone: AvailabilityZone
    var accountId: AccountId
    var configurationItemCaptureTime: ConfigurationItemCaptureTime
    var relationships: RelationshipList
    var version: Version
    var relatedEvents: RelatedEventList
    var resourceCreationTime: ResourceCreationTime
    var configuration: Configuration
    var configurationItemStatus: ConfigurationItemStatus
    var configurationItemMD5Hash: ConfigurationItemMD5Hash
    var configurationStateId: ConfigurationStateId
  }

  object ConfigurationItem {
    def apply(
      resourceId: js.UndefOr[ResourceId] = js.undefined,
      arn: js.UndefOr[ARN] = js.undefined,
      resourceType: js.UndefOr[ResourceType] = js.undefined,
      tags: js.UndefOr[Tags] = js.undefined,
      availabilityZone: js.UndefOr[AvailabilityZone] = js.undefined,
      accountId: js.UndefOr[AccountId] = js.undefined,
      configurationItemCaptureTime: js.UndefOr[ConfigurationItemCaptureTime] = js.undefined,
      relationships: js.UndefOr[RelationshipList] = js.undefined,
      version: js.UndefOr[Version] = js.undefined,
      relatedEvents: js.UndefOr[RelatedEventList] = js.undefined,
      resourceCreationTime: js.UndefOr[ResourceCreationTime] = js.undefined,
      configuration: js.UndefOr[Configuration] = js.undefined,
      configurationItemStatus: js.UndefOr[ConfigurationItemStatus] = js.undefined,
      configurationItemMD5Hash: js.UndefOr[ConfigurationItemMD5Hash] = js.undefined,
      configurationStateId: js.UndefOr[ConfigurationStateId] = js.undefined
    ): ConfigurationItem = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("resourceId" -> resourceId.map { x => x: js.Any }),
        ("arn" -> arn.map { x => x: js.Any }),
        ("resourceType" -> resourceType.map { x => x: js.Any }),
        ("tags" -> tags.map { x => x: js.Any }),
        ("availabilityZone" -> availabilityZone.map { x => x: js.Any }),
        ("accountId" -> accountId.map { x => x: js.Any }),
        ("configurationItemCaptureTime" -> configurationItemCaptureTime.map { x => x: js.Any }),
        ("relationships" -> relationships.map { x => x: js.Any }),
        ("version" -> version.map { x => x: js.Any }),
        ("relatedEvents" -> relatedEvents.map { x => x: js.Any }),
        ("resourceCreationTime" -> resourceCreationTime.map { x => x: js.Any }),
        ("configuration" -> configuration.map { x => x: js.Any }),
        ("configurationItemStatus" -> configurationItemStatus.map { x => x: js.Any }),
        ("configurationItemMD5Hash" -> configurationItemMD5Hash.map { x => x: js.Any }),
        ("configurationStateId" -> configurationStateId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigurationItem]
    }
  }


  object ConfigurationItemStatusEnum {
    val Ok = "Ok"
    val Failed = "Failed"
    val Discovered = "Discovered"
    val Deleted = "Deleted"

    val values = IndexedSeq(Ok, Failed, Discovered, Deleted)
  }

  /**
   * <p>An object that represents the recording of configuration changes of an AWS resource.</p>
   */
  @js.native
  trait ConfigurationRecorder extends js.Object {
    var name: RecorderName
    var roleARN: String
  }

  object ConfigurationRecorder {
    def apply(
      name: js.UndefOr[RecorderName] = js.undefined,
      roleARN: js.UndefOr[String] = js.undefined
    ): ConfigurationRecorder = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("name" -> name.map { x => x: js.Any }),
        ("roleARN" -> roleARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigurationRecorder]
    }
  }

  /**
   * <p>The current status of the configuration recorder.</p>
   */
  @js.native
  trait ConfigurationRecorderStatus extends js.Object {
    var name: String
    var lastStatus: RecorderStatus
    var lastErrorMessage: String
    var lastErrorCode: String
    var lastStartTime: Date
    var lastStatusChangeTime: Date
    var lastStopTime: Date
    var recording: Boolean
  }

  object ConfigurationRecorderStatus {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      lastStatus: js.UndefOr[RecorderStatus] = js.undefined,
      lastErrorMessage: js.UndefOr[String] = js.undefined,
      lastErrorCode: js.UndefOr[String] = js.undefined,
      lastStartTime: js.UndefOr[Date] = js.undefined,
      lastStatusChangeTime: js.UndefOr[Date] = js.undefined,
      lastStopTime: js.UndefOr[Date] = js.undefined,
      recording: js.UndefOr[Boolean] = js.undefined
    ): ConfigurationRecorderStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("name" -> name.map { x => x: js.Any }),
        ("lastStatus" -> lastStatus.map { x => x: js.Any }),
        ("lastErrorMessage" -> lastErrorMessage.map { x => x: js.Any }),
        ("lastErrorCode" -> lastErrorCode.map { x => x: js.Any }),
        ("lastStartTime" -> lastStartTime.map { x => x: js.Any }),
        ("lastStatusChangeTime" -> lastStatusChangeTime.map { x => x: js.Any }),
        ("lastStopTime" -> lastStopTime.map { x => x: js.Any }),
        ("recording" -> recording.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ConfigurationRecorderStatus]
    }
  }

  /**
   * <p> The input for the <a>DeleteDeliveryChannel</a> action. The action accepts the following data in JSON format. </p>
   */
  @js.native
  trait DeleteDeliveryChannelRequest extends js.Object {
    var DeliveryChannelName: ChannelName
  }

  object DeleteDeliveryChannelRequest {
    def apply(
      DeliveryChannelName: js.UndefOr[ChannelName] = js.undefined
    ): DeleteDeliveryChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DeliveryChannelName" -> DeliveryChannelName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteDeliveryChannelRequest]
    }
  }

  /**
   * <p> The input for the <a>DeliverConfigSnapshot</a> action. </p>
   */
  @js.native
  trait DeliverConfigSnapshotRequest extends js.Object {
    var deliveryChannelName: ChannelName
  }

  object DeliverConfigSnapshotRequest {
    def apply(
      deliveryChannelName: js.UndefOr[ChannelName] = js.undefined
    ): DeliverConfigSnapshotRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("deliveryChannelName" -> deliveryChannelName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeliverConfigSnapshotRequest]
    }
  }

  /**
   * <p> The output for the <a>DeliverConfigSnapshot</a> action in JSON format. </p>
   */
  @js.native
  trait DeliverConfigSnapshotResponse extends js.Object {
    var configSnapshotId: String
  }

  object DeliverConfigSnapshotResponse {
    def apply(
      configSnapshotId: js.UndefOr[String] = js.undefined
    ): DeliverConfigSnapshotResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("configSnapshotId" -> configSnapshotId.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeliverConfigSnapshotResponse]
    }
  }

  /**
   * <p>A logical container used for storing the configuration changes of an AWS resource.</p>
   */
  @js.native
  trait DeliveryChannel extends js.Object {
    var name: ChannelName
    var s3BucketName: String
    var s3KeyPrefix: String
    var snsTopicARN: String
  }

  object DeliveryChannel {
    def apply(
      name: js.UndefOr[ChannelName] = js.undefined,
      s3BucketName: js.UndefOr[String] = js.undefined,
      s3KeyPrefix: js.UndefOr[String] = js.undefined,
      snsTopicARN: js.UndefOr[String] = js.undefined
    ): DeliveryChannel = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("name" -> name.map { x => x: js.Any }),
        ("s3BucketName" -> s3BucketName.map { x => x: js.Any }),
        ("s3KeyPrefix" -> s3KeyPrefix.map { x => x: js.Any }),
        ("snsTopicARN" -> snsTopicARN.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeliveryChannel]
    }
  }

  /**
   * <p>The status of a specified delivery channel.</p> <p>Valid values: <code>Success</code> | <code>Failure</code></p>
   */
  @js.native
  trait DeliveryChannelStatus extends js.Object {
    var name: String
    var configSnapshotDeliveryInfo: ConfigExportDeliveryInfo
    var configHistoryDeliveryInfo: ConfigExportDeliveryInfo
    var configStreamDeliveryInfo: ConfigStreamDeliveryInfo
  }

  object DeliveryChannelStatus {
    def apply(
      name: js.UndefOr[String] = js.undefined,
      configSnapshotDeliveryInfo: js.UndefOr[ConfigExportDeliveryInfo] = js.undefined,
      configHistoryDeliveryInfo: js.UndefOr[ConfigExportDeliveryInfo] = js.undefined,
      configStreamDeliveryInfo: js.UndefOr[ConfigStreamDeliveryInfo] = js.undefined
    ): DeliveryChannelStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("name" -> name.map { x => x: js.Any }),
        ("configSnapshotDeliveryInfo" -> configSnapshotDeliveryInfo.map { x => x: js.Any }),
        ("configHistoryDeliveryInfo" -> configHistoryDeliveryInfo.map { x => x: js.Any }),
        ("configStreamDeliveryInfo" -> configStreamDeliveryInfo.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeliveryChannelStatus]
    }
  }


  object DeliveryStatusEnum {
    val Success = "Success"
    val Failure = "Failure"

    val values = IndexedSeq(Success, Failure)
  }

  /**
   * <p>The input for the <a>DescribeConfigurationRecorderStatus</a> action.</p>
   */
  @js.native
  trait DescribeConfigurationRecorderStatusRequest extends js.Object {
    var ConfigurationRecorderNames: ConfigurationRecorderNameList
  }

  object DescribeConfigurationRecorderStatusRequest {
    def apply(
      ConfigurationRecorderNames: js.UndefOr[ConfigurationRecorderNameList] = js.undefined
    ): DescribeConfigurationRecorderStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigurationRecorderNames" -> ConfigurationRecorderNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigurationRecorderStatusRequest]
    }
  }

  /**
   * <p>The output for the <a>DescribeConfigurationRecorderStatus</a> action in JSON format.</p>
   */
  @js.native
  trait DescribeConfigurationRecorderStatusResponse extends js.Object {
    var ConfigurationRecordersStatus: ConfigurationRecorderStatusList
  }

  object DescribeConfigurationRecorderStatusResponse {
    def apply(
      ConfigurationRecordersStatus: js.UndefOr[ConfigurationRecorderStatusList] = js.undefined
    ): DescribeConfigurationRecorderStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigurationRecordersStatus" -> ConfigurationRecordersStatus.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigurationRecorderStatusResponse]
    }
  }

  /**
   * <p>The input for the <a>DescribeConfigurationRecorders</a> action.</p>
   */
  @js.native
  trait DescribeConfigurationRecordersRequest extends js.Object {
    var ConfigurationRecorderNames: ConfigurationRecorderNameList
  }

  object DescribeConfigurationRecordersRequest {
    def apply(
      ConfigurationRecorderNames: js.UndefOr[ConfigurationRecorderNameList] = js.undefined
    ): DescribeConfigurationRecordersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigurationRecorderNames" -> ConfigurationRecorderNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigurationRecordersRequest]
    }
  }

  /**
   * <p>The ouput for the <a>DescribeConfigurationRecorders</a> action.</p>
   */
  @js.native
  trait DescribeConfigurationRecordersResponse extends js.Object {
    var ConfigurationRecorders: ConfigurationRecorderList
  }

  object DescribeConfigurationRecordersResponse {
    def apply(
      ConfigurationRecorders: js.UndefOr[ConfigurationRecorderList] = js.undefined
    ): DescribeConfigurationRecordersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigurationRecorders" -> ConfigurationRecorders.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeConfigurationRecordersResponse]
    }
  }

  /**
   * <p>The input for the <a>DeliveryChannelStatus</a> action.</p>
   */
  @js.native
  trait DescribeDeliveryChannelStatusRequest extends js.Object {
    var DeliveryChannelNames: DeliveryChannelNameList
  }

  object DescribeDeliveryChannelStatusRequest {
    def apply(
      DeliveryChannelNames: js.UndefOr[DeliveryChannelNameList] = js.undefined
    ): DescribeDeliveryChannelStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DeliveryChannelNames" -> DeliveryChannelNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDeliveryChannelStatusRequest]
    }
  }

  /**
   * <p>The output for the <a>DescribeDeliveryChannelStatus</a> action.</p>
   */
  @js.native
  trait DescribeDeliveryChannelStatusResponse extends js.Object {
    var DeliveryChannelsStatus: DeliveryChannelStatusList
  }

  object DescribeDeliveryChannelStatusResponse {
    def apply(
      DeliveryChannelsStatus: js.UndefOr[DeliveryChannelStatusList] = js.undefined
    ): DescribeDeliveryChannelStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DeliveryChannelsStatus" -> DeliveryChannelsStatus.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDeliveryChannelStatusResponse]
    }
  }

  /**
   * <p>The input for the <a>DescribeDeliveryChannels</a> action.</p>
   */
  @js.native
  trait DescribeDeliveryChannelsRequest extends js.Object {
    var DeliveryChannelNames: DeliveryChannelNameList
  }

  object DescribeDeliveryChannelsRequest {
    def apply(
      DeliveryChannelNames: js.UndefOr[DeliveryChannelNameList] = js.undefined
    ): DescribeDeliveryChannelsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DeliveryChannelNames" -> DeliveryChannelNames.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDeliveryChannelsRequest]
    }
  }

  /**
   * <p>The output for the <a>DescribeDeliveryChannels</a> action.</p>
   */
  @js.native
  trait DescribeDeliveryChannelsResponse extends js.Object {
    var DeliveryChannels: DeliveryChannelList
  }

  object DescribeDeliveryChannelsResponse {
    def apply(
      DeliveryChannels: js.UndefOr[DeliveryChannelList] = js.undefined
    ): DescribeDeliveryChannelsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DeliveryChannels" -> DeliveryChannels.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDeliveryChannelsResponse]
    }
  }

  /**
   * <p>The input for the <a>GetResourceConfigHistory</a> action.</p>
   */
  @js.native
  trait GetResourceConfigHistoryRequest extends js.Object {
    var resourceId: ResourceId
    var earlierTime: EarlierTime
    var laterTime: LaterTime
    var resourceType: ResourceType
    var nextToken: NextToken
    var chronologicalOrder: ChronologicalOrder
    var limit: Limit
  }

  object GetResourceConfigHistoryRequest {
    def apply(
      resourceId: js.UndefOr[ResourceId] = js.undefined,
      earlierTime: js.UndefOr[EarlierTime] = js.undefined,
      laterTime: js.UndefOr[LaterTime] = js.undefined,
      resourceType: js.UndefOr[ResourceType] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined,
      chronologicalOrder: js.UndefOr[ChronologicalOrder] = js.undefined,
      limit: js.UndefOr[Limit] = js.undefined
    ): GetResourceConfigHistoryRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("resourceId" -> resourceId.map { x => x: js.Any }),
        ("earlierTime" -> earlierTime.map { x => x: js.Any }),
        ("laterTime" -> laterTime.map { x => x: js.Any }),
        ("resourceType" -> resourceType.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any }),
        ("chronologicalOrder" -> chronologicalOrder.map { x => x: js.Any }),
        ("limit" -> limit.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourceConfigHistoryRequest]
    }
  }

  /**
   * <p>The output for the <a>GetResourceConfigHistory</a> action.</p>
   */
  @js.native
  trait GetResourceConfigHistoryResponse extends js.Object {
    var configurationItems: ConfigurationItemList
    var nextToken: NextToken
  }

  object GetResourceConfigHistoryResponse {
    def apply(
      configurationItems: js.UndefOr[ConfigurationItemList] = js.undefined,
      nextToken: js.UndefOr[NextToken] = js.undefined
    ): GetResourceConfigHistoryResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("configurationItems" -> configurationItems.map { x => x: js.Any }),
        ("nextToken" -> nextToken.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetResourceConfigHistoryResponse]
    }
  }

  /**
   * <p>Your Amazon S3 bucket policy does not permit AWS Config to write to it.</p>
   */
  @js.native
  trait InsufficientDeliveryPolicyExceptionException extends js.Object {

  }

  /**
   * <p>You have provided a configuration recorder name that is not valid.</p>
   */
  @js.native
  trait InvalidConfigurationRecorderNameExceptionException extends js.Object {

  }

  /**
   * <p>The specified delivery channel name is not valid.</p>
   */
  @js.native
  trait InvalidDeliveryChannelNameExceptionException extends js.Object {

  }

  /**
   * <p>You have reached the limit on the pagination.</p>
   */
  @js.native
  trait InvalidLimitExceptionException extends js.Object {

  }

  /**
   * <p>The specified nextToken for pagination is not valid.</p>
   */
  @js.native
  trait InvalidNextTokenExceptionException extends js.Object {

  }

  /**
   * <p>You have provided a null or empty role ARN.</p>
   */
  @js.native
  trait InvalidRoleExceptionException extends js.Object {

  }

  /**
   * <p>The specified Amazon S3 key prefix is not valid.</p>
   */
  @js.native
  trait InvalidS3KeyPrefixExceptionException extends js.Object {

  }

  /**
   * <p>The specified Amazon SNS topic does not exist.</p>
   */
  @js.native
  trait InvalidSNSTopicARNExceptionException extends js.Object {

  }

  /**
   * <p>The specified time range is not valid. The earlier time is not chronologically before the later time.</p>
   */
  @js.native
  trait InvalidTimeRangeExceptionException extends js.Object {

  }

  /**
   * <p>You cannot delete the delivery channel you specified because the configuration recorder is running.</p>
   */
  @js.native
  trait LastDeliveryChannelDeleteFailedExceptionException extends js.Object {

  }

  /**
   * <p>You have reached the limit on the number of recorders you can create.</p>
   */
  @js.native
  trait MaxNumberOfConfigurationRecordersExceededExceptionException extends js.Object {

  }

  /**
   * <p>You have reached the limit on the number of delivery channels you can create.</p>
   */
  @js.native
  trait MaxNumberOfDeliveryChannelsExceededExceptionException extends js.Object {

  }

  /**
   * <p>There are no configuration recorders available to provide the role needed to describe your resources.</p>
   */
  @js.native
  trait NoAvailableConfigurationRecorderExceptionException extends js.Object {

  }

  /**
   * <p>There is no delivery channel available to record configurations.</p>
   */
  @js.native
  trait NoAvailableDeliveryChannelExceptionException extends js.Object {

  }

  /**
   * <p>There is no configuration recorder running.</p>
   */
  @js.native
  trait NoRunningConfigurationRecorderExceptionException extends js.Object {

  }

  /**
   * <p>The specified Amazon S3 bucket does not exist.</p>
   */
  @js.native
  trait NoSuchBucketExceptionException extends js.Object {

  }

  /**
   * <p>You have specified a configuration recorder that does not exist.</p>
   */
  @js.native
  trait NoSuchConfigurationRecorderExceptionException extends js.Object {

  }

  /**
   * <p>You have specified a delivery channel that does not exist.</p>
   */
  @js.native
  trait NoSuchDeliveryChannelExceptionException extends js.Object {

  }

  /**
   * <p>The input for the <a>PutConfigurationRecorder</a> action.</p>
   */
  @js.native
  trait PutConfigurationRecorderRequest extends js.Object {
    var ConfigurationRecorder: ConfigurationRecorder
  }

  object PutConfigurationRecorderRequest {
    def apply(
      ConfigurationRecorder: js.UndefOr[ConfigurationRecorder] = js.undefined
    ): PutConfigurationRecorderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigurationRecorder" -> ConfigurationRecorder.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutConfigurationRecorderRequest]
    }
  }

  /**
   * <p>The input for the <a>PutDeliveryChannel</a> action.</p>
   */
  @js.native
  trait PutDeliveryChannelRequest extends js.Object {
    var DeliveryChannel: DeliveryChannel
  }

  object PutDeliveryChannelRequest {
    def apply(
      DeliveryChannel: js.UndefOr[DeliveryChannel] = js.undefined
    ): PutDeliveryChannelRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("DeliveryChannel" -> DeliveryChannel.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PutDeliveryChannelRequest]
    }
  }


  object RecorderStatusEnum {
    val Pending = "Pending"
    val Success = "Success"
    val Failure = "Failure"

    val values = IndexedSeq(Pending, Success, Failure)
  }

  /**
   * <p>The relationship of the related resource to the main resource.</p>
   */
  @js.native
  trait Relationship extends js.Object {
    var resourceType: ResourceType
    var resourceId: ResourceId
    var relationshipName: RelationshipName
  }

  object Relationship {
    def apply(
      resourceType: js.UndefOr[ResourceType] = js.undefined,
      resourceId: js.UndefOr[ResourceId] = js.undefined,
      relationshipName: js.UndefOr[RelationshipName] = js.undefined
    ): Relationship = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("resourceType" -> resourceType.map { x => x: js.Any }),
        ("resourceId" -> resourceId.map { x => x: js.Any }),
        ("relationshipName" -> relationshipName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Relationship]
    }
  }

  /**
   * <p>You have specified a resource that is either unknown or has not been discovered.</p>
   */
  @js.native
  trait ResourceNotDiscoveredExceptionException extends js.Object {

  }


  object ResourceTypeEnum {
    val `AWS::EC2::CustomerGateway` = "AWS::EC2::CustomerGateway"
    val `AWS::EC2::EIP` = "AWS::EC2::EIP"
    val `AWS::EC2::Instance` = "AWS::EC2::Instance"
    val `AWS::EC2::InternetGateway` = "AWS::EC2::InternetGateway"
    val `AWS::EC2::NetworkAcl` = "AWS::EC2::NetworkAcl"
    val `AWS::EC2::NetworkInterface` = "AWS::EC2::NetworkInterface"
    val `AWS::EC2::RouteTable` = "AWS::EC2::RouteTable"
    val `AWS::EC2::SecurityGroup` = "AWS::EC2::SecurityGroup"
    val `AWS::EC2::Subnet` = "AWS::EC2::Subnet"
    val `AWS::CloudTrail::Trail` = "AWS::CloudTrail::Trail"
    val `AWS::EC2::Volume` = "AWS::EC2::Volume"
    val `AWS::EC2::VPC` = "AWS::EC2::VPC"
    val `AWS::EC2::VPNConnection` = "AWS::EC2::VPNConnection"
    val `AWS::EC2::VPNGateway` = "AWS::EC2::VPNGateway"

    val values = IndexedSeq(`AWS::EC2::CustomerGateway`, `AWS::EC2::EIP`, `AWS::EC2::Instance`, `AWS::EC2::InternetGateway`, `AWS::EC2::NetworkAcl`, `AWS::EC2::NetworkInterface`, `AWS::EC2::RouteTable`, `AWS::EC2::SecurityGroup`, `AWS::EC2::Subnet`, `AWS::CloudTrail::Trail`, `AWS::EC2::Volume`, `AWS::EC2::VPC`, `AWS::EC2::VPNConnection`, `AWS::EC2::VPNGateway`)
  }

  /**
   * <p>The input for the <a>StartConfigurationRecorder</a> action.</p>
   */
  @js.native
  trait StartConfigurationRecorderRequest extends js.Object {
    var ConfigurationRecorderName: RecorderName
  }

  object StartConfigurationRecorderRequest {
    def apply(
      ConfigurationRecorderName: js.UndefOr[RecorderName] = js.undefined
    ): StartConfigurationRecorderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigurationRecorderName" -> ConfigurationRecorderName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StartConfigurationRecorderRequest]
    }
  }

  /**
   * <p><p>The input for the <a>StopConfigurationRecorder</a> action.</p></p>
   */
  @js.native
  trait StopConfigurationRecorderRequest extends js.Object {
    var ConfigurationRecorderName: RecorderName
  }

  object StopConfigurationRecorderRequest {
    def apply(
      ConfigurationRecorderName: js.UndefOr[RecorderName] = js.undefined
    ): StopConfigurationRecorderRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        ("ConfigurationRecorderName" -> ConfigurationRecorderName.map { x => x: js.Any })
      ).filter(_._2 != js.undefined)

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[StopConfigurationRecorderRequest]
    }
  }

  /**
   * <p>The requested action is not valid.</p>
   */
  @js.native
  trait ValidationExceptionException extends js.Object {

  }
}
