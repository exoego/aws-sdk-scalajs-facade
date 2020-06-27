package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object iot1clickdevicesservice {
  type DeviceAttributes          = js.Dictionary[__string]
  type MaxResults                = Int
  type __boolean                 = Boolean
  type __doubleMin0Max100        = Double
  type __integer                 = Int
  type __listOfDeviceDescription = js.Array[DeviceDescription]
  type __listOfDeviceEvent       = js.Array[DeviceEvent]
  type __listOfDeviceMethod      = js.Array[DeviceMethod]
  type __listOf__string          = js.Array[__string]
  type __mapOf__string           = js.Dictionary[__string]
  type __string                  = String
  type __stringMin12Max40        = String
  type __timestampIso8601        = js.Date

  implicit final class IoT1ClickDevicesServiceOps(private val service: IoT1ClickDevicesService) extends AnyVal {

    @inline def claimDevicesByClaimCodeFuture(
        params: ClaimDevicesByClaimCodeRequest
    ): Future[ClaimDevicesByClaimCodeResponse] = service.claimDevicesByClaimCode(params).promise().toFuture
    @inline def describeDeviceFuture(params: DescribeDeviceRequest): Future[DescribeDeviceResponse] =
      service.describeDevice(params).promise().toFuture
    @inline def finalizeDeviceClaimFuture(params: FinalizeDeviceClaimRequest): Future[FinalizeDeviceClaimResponse] =
      service.finalizeDeviceClaim(params).promise().toFuture
    @inline def getDeviceMethodsFuture(params: GetDeviceMethodsRequest): Future[GetDeviceMethodsResponse] =
      service.getDeviceMethods(params).promise().toFuture
    @inline def initiateDeviceClaimFuture(params: InitiateDeviceClaimRequest): Future[InitiateDeviceClaimResponse] =
      service.initiateDeviceClaim(params).promise().toFuture
    @inline def invokeDeviceMethodFuture(params: InvokeDeviceMethodRequest): Future[InvokeDeviceMethodResponse] =
      service.invokeDeviceMethod(params).promise().toFuture
    @inline def listDeviceEventsFuture(params: ListDeviceEventsRequest): Future[ListDeviceEventsResponse] =
      service.listDeviceEvents(params).promise().toFuture
    @inline def listDevicesFuture(params: ListDevicesRequest): Future[ListDevicesResponse] =
      service.listDevices(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] =
      service.listTagsForResource(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[js.Object] =
      service.tagResource(params).promise().toFuture
    @inline def unclaimDeviceFuture(params: UnclaimDeviceRequest): Future[UnclaimDeviceResponse] =
      service.unclaimDevice(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[js.Object] =
      service.untagResource(params).promise().toFuture
    @inline def updateDeviceStateFuture(params: UpdateDeviceStateRequest): Future[UpdateDeviceStateResponse] =
      service.updateDeviceState(params).promise().toFuture
  }
}

package iot1clickdevicesservice {
  @js.native
  @JSImport("aws-sdk", "IoT1ClickDevicesService")
  class IoT1ClickDevicesService() extends js.Object {
    def this(config: AWSConfig) = this()

    def claimDevicesByClaimCode(params: ClaimDevicesByClaimCodeRequest): Request[ClaimDevicesByClaimCodeResponse] =
      js.native
    def describeDevice(params: DescribeDeviceRequest): Request[DescribeDeviceResponse]                = js.native
    def finalizeDeviceClaim(params: FinalizeDeviceClaimRequest): Request[FinalizeDeviceClaimResponse] = js.native
    def getDeviceMethods(params: GetDeviceMethodsRequest): Request[GetDeviceMethodsResponse]          = js.native
    def initiateDeviceClaim(params: InitiateDeviceClaimRequest): Request[InitiateDeviceClaimResponse] = js.native
    def invokeDeviceMethod(params: InvokeDeviceMethodRequest): Request[InvokeDeviceMethodResponse]    = js.native
    def listDeviceEvents(params: ListDeviceEventsRequest): Request[ListDeviceEventsResponse]          = js.native
    def listDevices(params: ListDevicesRequest): Request[ListDevicesResponse]                         = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[js.Object]                                   = js.native
    def unclaimDevice(params: UnclaimDeviceRequest): Request[UnclaimDeviceResponse]                   = js.native
    def untagResource(params: UntagResourceRequest): Request[js.Object]                               = js.native
    def updateDeviceState(params: UpdateDeviceStateRequest): Request[UpdateDeviceStateResponse]       = js.native
  }

  @js.native
  @Factory
  trait Attributes extends js.Object {}

  @js.native
  @Factory
  trait ClaimDevicesByClaimCodeRequest extends js.Object {
    var ClaimCode: __string
  }

  @js.native
  @Factory
  trait ClaimDevicesByClaimCodeResponse extends js.Object {
    var ClaimCode: js.UndefOr[__stringMin12Max40]
    var Total: js.UndefOr[__integer]
  }

  @js.native
  @Factory
  trait DescribeDeviceRequest extends js.Object {
    var DeviceId: __string
  }

  @js.native
  @Factory
  trait DescribeDeviceResponse extends js.Object {
    var DeviceDescription: js.UndefOr[DeviceDescription]
  }

  @js.native
  @Factory
  trait Device extends js.Object {
    var Attributes: js.UndefOr[Attributes]
    var DeviceId: js.UndefOr[__string]
    var Type: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait DeviceDescription extends js.Object {
    var Arn: js.UndefOr[__string]
    var Attributes: js.UndefOr[DeviceAttributes]
    var DeviceId: js.UndefOr[__string]
    var Enabled: js.UndefOr[__boolean]
    var RemainingLife: js.UndefOr[__doubleMin0Max100]
    var Tags: js.UndefOr[__mapOf__string]
    var Type: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait DeviceEvent extends js.Object {
    var Device: js.UndefOr[Device]
    var StdEvent: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait DeviceMethod extends js.Object {
    var DeviceType: js.UndefOr[__string]
    var MethodName: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait FinalizeDeviceClaimRequest extends js.Object {
    var DeviceId: __string
    var Tags: js.UndefOr[__mapOf__string]
  }

  @js.native
  @Factory
  trait FinalizeDeviceClaimResponse extends js.Object {
    var State: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait GetDeviceMethodsRequest extends js.Object {
    var DeviceId: __string
  }

  @js.native
  @Factory
  trait GetDeviceMethodsResponse extends js.Object {
    var DeviceMethods: js.UndefOr[__listOfDeviceMethod]
  }

  @js.native
  @Factory
  trait InitiateDeviceClaimRequest extends js.Object {
    var DeviceId: __string
  }

  @js.native
  @Factory
  trait InitiateDeviceClaimResponse extends js.Object {
    var State: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait InvokeDeviceMethodRequest extends js.Object {
    var DeviceId: __string
    var DeviceMethod: js.UndefOr[DeviceMethod]
    var DeviceMethodParameters: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait InvokeDeviceMethodResponse extends js.Object {
    var DeviceMethodResponse: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListDeviceEventsRequest extends js.Object {
    var DeviceId: __string
    var FromTimeStamp: __timestampIso8601
    var ToTimeStamp: __timestampIso8601
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListDeviceEventsResponse extends js.Object {
    var Events: js.UndefOr[__listOfDeviceEvent]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListDevicesRequest extends js.Object {
    var DeviceType: js.UndefOr[__string]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListDevicesResponse extends js.Object {
    var Devices: js.UndefOr[__listOfDeviceDescription]
    var NextToken: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceArn: __string
  }

  @js.native
  @Factory
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[__mapOf__string]
  }

  @js.native
  @Factory
  trait TagResourceRequest extends js.Object {
    var ResourceArn: __string
    var Tags: __mapOf__string
  }

  @js.native
  @Factory
  trait UnclaimDeviceRequest extends js.Object {
    var DeviceId: __string
  }

  @js.native
  @Factory
  trait UnclaimDeviceResponse extends js.Object {
    var State: js.UndefOr[__string]
  }

  @js.native
  @Factory
  trait UntagResourceRequest extends js.Object {
    var ResourceArn: __string
    var TagKeys: __listOf__string
  }

  @js.native
  @Factory
  trait UpdateDeviceStateRequest extends js.Object {
    var DeviceId: __string
    var Enabled: js.UndefOr[__boolean]
  }

  @js.native
  @Factory
  trait UpdateDeviceStateResponse extends js.Object {}
}
