package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object iot1clickdevicesservice {
  type DeviceAttributes = js.Dictionary[__string]
  type MaxResults = Int
  type __boolean = Boolean
  type __doubleMin0Max100 = Double
  type __integer = Int
  type __listOfDeviceDescription = js.Array[DeviceDescription]
  type __listOfDeviceEvent = js.Array[DeviceEvent]
  type __listOfDeviceMethod = js.Array[DeviceMethod]
  type __listOf__string = js.Array[__string]
  type __mapOf__string = js.Dictionary[__string]
  type __string = String
  type __stringMin12Max40 = String
  type __timestampIso8601 = js.Date

  final class IoT1ClickDevicesServiceOps(private val service: IoT1ClickDevicesService) extends AnyVal {

    @inline def claimDevicesByClaimCodeFuture(params: ClaimDevicesByClaimCodeRequest): Future[ClaimDevicesByClaimCodeResponse] = service.claimDevicesByClaimCode(params).promise().toFuture
    @inline def describeDeviceFuture(params: DescribeDeviceRequest): Future[DescribeDeviceResponse] = service.describeDevice(params).promise().toFuture
    @inline def finalizeDeviceClaimFuture(params: FinalizeDeviceClaimRequest): Future[FinalizeDeviceClaimResponse] = service.finalizeDeviceClaim(params).promise().toFuture
    @inline def getDeviceMethodsFuture(params: GetDeviceMethodsRequest): Future[GetDeviceMethodsResponse] = service.getDeviceMethods(params).promise().toFuture
    @inline def initiateDeviceClaimFuture(params: InitiateDeviceClaimRequest): Future[InitiateDeviceClaimResponse] = service.initiateDeviceClaim(params).promise().toFuture
    @inline def invokeDeviceMethodFuture(params: InvokeDeviceMethodRequest): Future[InvokeDeviceMethodResponse] = service.invokeDeviceMethod(params).promise().toFuture
    @inline def listDeviceEventsFuture(params: ListDeviceEventsRequest): Future[ListDeviceEventsResponse] = service.listDeviceEvents(params).promise().toFuture
    @inline def listDevicesFuture(params: ListDevicesRequest): Future[ListDevicesResponse] = service.listDevices(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] = service.tagResource(params).promise().toFuture
    @inline def unclaimDeviceFuture(params: UnclaimDeviceRequest): Future[UnclaimDeviceResponse] = service.unclaimDevice(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] = service.untagResource(params).promise().toFuture
    @inline def updateDeviceStateFuture(params: UpdateDeviceStateRequest): Future[UpdateDeviceStateResponse] = service.updateDeviceState(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/iot1clickdevicesservice", JSImport.Namespace, "AWS.IoT1ClickDevicesService")
  class IoT1ClickDevicesService() extends js.Object {
    def this(config: AWSConfig) = this()

    def claimDevicesByClaimCode(params: ClaimDevicesByClaimCodeRequest): Request[ClaimDevicesByClaimCodeResponse] = js.native
    def describeDevice(params: DescribeDeviceRequest): Request[DescribeDeviceResponse] = js.native
    def finalizeDeviceClaim(params: FinalizeDeviceClaimRequest): Request[FinalizeDeviceClaimResponse] = js.native
    def getDeviceMethods(params: GetDeviceMethodsRequest): Request[GetDeviceMethodsResponse] = js.native
    def initiateDeviceClaim(params: InitiateDeviceClaimRequest): Request[InitiateDeviceClaimResponse] = js.native
    def invokeDeviceMethod(params: InvokeDeviceMethodRequest): Request[InvokeDeviceMethodResponse] = js.native
    def listDeviceEvents(params: ListDeviceEventsRequest): Request[ListDeviceEventsResponse] = js.native
    def listDevices(params: ListDevicesRequest): Request[ListDevicesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object] = js.native
    def unclaimDevice(params: UnclaimDeviceRequest): Request[UnclaimDeviceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object] = js.native
    def updateDeviceState(params: UpdateDeviceStateRequest): Request[UpdateDeviceStateResponse] = js.native
  }
  object IoT1ClickDevicesService {
    @inline implicit def toOps(service: IoT1ClickDevicesService): IoT1ClickDevicesServiceOps = {
      new IoT1ClickDevicesServiceOps(service)
    }
  }

  @js.native
  trait Attributes extends js.Object

  object Attributes {
    @inline
    def apply(): Attributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attributes]
    }
  }

  @js.native
  trait ClaimDevicesByClaimCodeRequest extends js.Object {
    var ClaimCode: __string
  }

  object ClaimDevicesByClaimCodeRequest {
    @inline
    def apply(
        ClaimCode: __string
    ): ClaimDevicesByClaimCodeRequest = {
      val __obj = js.Dynamic.literal(
        "ClaimCode" -> ClaimCode.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ClaimDevicesByClaimCodeRequest]
    }
  }

  @js.native
  trait ClaimDevicesByClaimCodeResponse extends js.Object {
    var ClaimCode: js.UndefOr[__stringMin12Max40]
    var Total: js.UndefOr[__integer]
  }

  object ClaimDevicesByClaimCodeResponse {
    @inline
    def apply(
        ClaimCode: js.UndefOr[__stringMin12Max40] = js.undefined,
        Total: js.UndefOr[__integer] = js.undefined
    ): ClaimDevicesByClaimCodeResponse = {
      val __obj = js.Dynamic.literal()
      ClaimCode.foreach(__v => __obj.updateDynamic("ClaimCode")(__v.asInstanceOf[js.Any]))
      Total.foreach(__v => __obj.updateDynamic("Total")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClaimDevicesByClaimCodeResponse]
    }
  }

  @js.native
  trait DescribeDeviceRequest extends js.Object {
    var DeviceId: __string
  }

  object DescribeDeviceRequest {
    @inline
    def apply(
        DeviceId: __string
    ): DescribeDeviceRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceId" -> DeviceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeDeviceRequest]
    }
  }

  @js.native
  trait DescribeDeviceResponse extends js.Object {
    var DeviceDescription: js.UndefOr[DeviceDescription]
  }

  object DescribeDeviceResponse {
    @inline
    def apply(
        DeviceDescription: js.UndefOr[DeviceDescription] = js.undefined
    ): DescribeDeviceResponse = {
      val __obj = js.Dynamic.literal()
      DeviceDescription.foreach(__v => __obj.updateDynamic("DeviceDescription")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeDeviceResponse]
    }
  }

  @js.native
  trait Device extends js.Object {
    var Attributes: js.UndefOr[Attributes]
    var DeviceId: js.UndefOr[__string]
    var Type: js.UndefOr[__string]
  }

  object Device {
    @inline
    def apply(
        Attributes: js.UndefOr[Attributes] = js.undefined,
        DeviceId: js.UndefOr[__string] = js.undefined,
        Type: js.UndefOr[__string] = js.undefined
    ): Device = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      DeviceId.foreach(__v => __obj.updateDynamic("DeviceId")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Device]
    }
  }

  @js.native
  trait DeviceDescription extends js.Object {
    var Arn: js.UndefOr[__string]
    var Attributes: js.UndefOr[DeviceAttributes]
    var DeviceId: js.UndefOr[__string]
    var Enabled: js.UndefOr[__boolean]
    var RemainingLife: js.UndefOr[__doubleMin0Max100]
    var Tags: js.UndefOr[__mapOf__string]
    var Type: js.UndefOr[__string]
  }

  object DeviceDescription {
    @inline
    def apply(
        Arn: js.UndefOr[__string] = js.undefined,
        Attributes: js.UndefOr[DeviceAttributes] = js.undefined,
        DeviceId: js.UndefOr[__string] = js.undefined,
        Enabled: js.UndefOr[__boolean] = js.undefined,
        RemainingLife: js.UndefOr[__doubleMin0Max100] = js.undefined,
        Tags: js.UndefOr[__mapOf__string] = js.undefined,
        Type: js.UndefOr[__string] = js.undefined
    ): DeviceDescription = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      DeviceId.foreach(__v => __obj.updateDynamic("DeviceId")(__v.asInstanceOf[js.Any]))
      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      RemainingLife.foreach(__v => __obj.updateDynamic("RemainingLife")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceDescription]
    }
  }

  @js.native
  trait DeviceEvent extends js.Object {
    var Device: js.UndefOr[Device]
    var StdEvent: js.UndefOr[__string]
  }

  object DeviceEvent {
    @inline
    def apply(
        Device: js.UndefOr[Device] = js.undefined,
        StdEvent: js.UndefOr[__string] = js.undefined
    ): DeviceEvent = {
      val __obj = js.Dynamic.literal()
      Device.foreach(__v => __obj.updateDynamic("Device")(__v.asInstanceOf[js.Any]))
      StdEvent.foreach(__v => __obj.updateDynamic("StdEvent")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceEvent]
    }
  }

  @js.native
  trait DeviceMethod extends js.Object {
    var DeviceType: js.UndefOr[__string]
    var MethodName: js.UndefOr[__string]
  }

  object DeviceMethod {
    @inline
    def apply(
        DeviceType: js.UndefOr[__string] = js.undefined,
        MethodName: js.UndefOr[__string] = js.undefined
    ): DeviceMethod = {
      val __obj = js.Dynamic.literal()
      DeviceType.foreach(__v => __obj.updateDynamic("DeviceType")(__v.asInstanceOf[js.Any]))
      MethodName.foreach(__v => __obj.updateDynamic("MethodName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeviceMethod]
    }
  }

  @js.native
  trait FinalizeDeviceClaimRequest extends js.Object {
    var DeviceId: __string
    var Tags: js.UndefOr[__mapOf__string]
  }

  object FinalizeDeviceClaimRequest {
    @inline
    def apply(
        DeviceId: __string,
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): FinalizeDeviceClaimRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceId" -> DeviceId.asInstanceOf[js.Any]
      )

      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FinalizeDeviceClaimRequest]
    }
  }

  @js.native
  trait FinalizeDeviceClaimResponse extends js.Object {
    var State: js.UndefOr[__string]
  }

  object FinalizeDeviceClaimResponse {
    @inline
    def apply(
        State: js.UndefOr[__string] = js.undefined
    ): FinalizeDeviceClaimResponse = {
      val __obj = js.Dynamic.literal()
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[FinalizeDeviceClaimResponse]
    }
  }

  @js.native
  trait GetDeviceMethodsRequest extends js.Object {
    var DeviceId: __string
  }

  object GetDeviceMethodsRequest {
    @inline
    def apply(
        DeviceId: __string
    ): GetDeviceMethodsRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceId" -> DeviceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GetDeviceMethodsRequest]
    }
  }

  @js.native
  trait GetDeviceMethodsResponse extends js.Object {
    var DeviceMethods: js.UndefOr[__listOfDeviceMethod]
  }

  object GetDeviceMethodsResponse {
    @inline
    def apply(
        DeviceMethods: js.UndefOr[__listOfDeviceMethod] = js.undefined
    ): GetDeviceMethodsResponse = {
      val __obj = js.Dynamic.literal()
      DeviceMethods.foreach(__v => __obj.updateDynamic("DeviceMethods")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetDeviceMethodsResponse]
    }
  }

  @js.native
  trait InitiateDeviceClaimRequest extends js.Object {
    var DeviceId: __string
  }

  object InitiateDeviceClaimRequest {
    @inline
    def apply(
        DeviceId: __string
    ): InitiateDeviceClaimRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceId" -> DeviceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[InitiateDeviceClaimRequest]
    }
  }

  @js.native
  trait InitiateDeviceClaimResponse extends js.Object {
    var State: js.UndefOr[__string]
  }

  object InitiateDeviceClaimResponse {
    @inline
    def apply(
        State: js.UndefOr[__string] = js.undefined
    ): InitiateDeviceClaimResponse = {
      val __obj = js.Dynamic.literal()
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InitiateDeviceClaimResponse]
    }
  }

  @js.native
  trait InvokeDeviceMethodRequest extends js.Object {
    var DeviceId: __string
    var DeviceMethod: js.UndefOr[DeviceMethod]
    var DeviceMethodParameters: js.UndefOr[__string]
  }

  object InvokeDeviceMethodRequest {
    @inline
    def apply(
        DeviceId: __string,
        DeviceMethod: js.UndefOr[DeviceMethod] = js.undefined,
        DeviceMethodParameters: js.UndefOr[__string] = js.undefined
    ): InvokeDeviceMethodRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceId" -> DeviceId.asInstanceOf[js.Any]
      )

      DeviceMethod.foreach(__v => __obj.updateDynamic("DeviceMethod")(__v.asInstanceOf[js.Any]))
      DeviceMethodParameters.foreach(__v => __obj.updateDynamic("DeviceMethodParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InvokeDeviceMethodRequest]
    }
  }

  @js.native
  trait InvokeDeviceMethodResponse extends js.Object {
    var DeviceMethodResponse: js.UndefOr[__string]
  }

  object InvokeDeviceMethodResponse {
    @inline
    def apply(
        DeviceMethodResponse: js.UndefOr[__string] = js.undefined
    ): InvokeDeviceMethodResponse = {
      val __obj = js.Dynamic.literal()
      DeviceMethodResponse.foreach(__v => __obj.updateDynamic("DeviceMethodResponse")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InvokeDeviceMethodResponse]
    }
  }

  @js.native
  trait ListDeviceEventsRequest extends js.Object {
    var DeviceId: __string
    var FromTimeStamp: __timestampIso8601
    var ToTimeStamp: __timestampIso8601
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListDeviceEventsRequest {
    @inline
    def apply(
        DeviceId: __string,
        FromTimeStamp: __timestampIso8601,
        ToTimeStamp: __timestampIso8601,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListDeviceEventsRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceId" -> DeviceId.asInstanceOf[js.Any],
        "FromTimeStamp" -> FromTimeStamp.asInstanceOf[js.Any],
        "ToTimeStamp" -> ToTimeStamp.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeviceEventsRequest]
    }
  }

  @js.native
  trait ListDeviceEventsResponse extends js.Object {
    var Events: js.UndefOr[__listOfDeviceEvent]
    var NextToken: js.UndefOr[__string]
  }

  object ListDeviceEventsResponse {
    @inline
    def apply(
        Events: js.UndefOr[__listOfDeviceEvent] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListDeviceEventsResponse = {
      val __obj = js.Dynamic.literal()
      Events.foreach(__v => __obj.updateDynamic("Events")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDeviceEventsResponse]
    }
  }

  @js.native
  trait ListDevicesRequest extends js.Object {
    var DeviceType: js.UndefOr[__string]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListDevicesRequest {
    @inline
    def apply(
        DeviceType: js.UndefOr[__string] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListDevicesRequest = {
      val __obj = js.Dynamic.literal()
      DeviceType.foreach(__v => __obj.updateDynamic("DeviceType")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDevicesRequest]
    }
  }

  @js.native
  trait ListDevicesResponse extends js.Object {
    var Devices: js.UndefOr[__listOfDeviceDescription]
    var NextToken: js.UndefOr[__string]
  }

  object ListDevicesResponse {
    @inline
    def apply(
        Devices: js.UndefOr[__listOfDeviceDescription] = js.undefined,
        NextToken: js.UndefOr[__string] = js.undefined
    ): ListDevicesResponse = {
      val __obj = js.Dynamic.literal()
      Devices.foreach(__v => __obj.updateDynamic("Devices")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListDevicesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: __string
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceArn: __string
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[__mapOf__string]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[__mapOf__string] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceArn: __string
    var Tags: __mapOf__string
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceArn: __string,
        Tags: __mapOf__string
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait UnclaimDeviceRequest extends js.Object {
    var DeviceId: __string
  }

  object UnclaimDeviceRequest {
    @inline
    def apply(
        DeviceId: __string
    ): UnclaimDeviceRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceId" -> DeviceId.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UnclaimDeviceRequest]
    }
  }

  @js.native
  trait UnclaimDeviceResponse extends js.Object {
    var State: js.UndefOr[__string]
  }

  object UnclaimDeviceResponse {
    @inline
    def apply(
        State: js.UndefOr[__string] = js.undefined
    ): UnclaimDeviceResponse = {
      val __obj = js.Dynamic.literal()
      State.foreach(__v => __obj.updateDynamic("State")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UnclaimDeviceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: __string
    var TagKeys: __listOf__string
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceArn: __string,
        TagKeys: __listOf__string
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceArn" -> ResourceArn.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UpdateDeviceStateRequest extends js.Object {
    var DeviceId: __string
    var Enabled: js.UndefOr[__boolean]
  }

  object UpdateDeviceStateRequest {
    @inline
    def apply(
        DeviceId: __string,
        Enabled: js.UndefOr[__boolean] = js.undefined
    ): UpdateDeviceStateRequest = {
      val __obj = js.Dynamic.literal(
        "DeviceId" -> DeviceId.asInstanceOf[js.Any]
      )

      Enabled.foreach(__v => __obj.updateDynamic("Enabled")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateDeviceStateRequest]
    }
  }

  @js.native
  trait UpdateDeviceStateResponse extends js.Object

  object UpdateDeviceStateResponse {
    @inline
    def apply(): UpdateDeviceStateResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateDeviceStateResponse]
    }
  }
}
