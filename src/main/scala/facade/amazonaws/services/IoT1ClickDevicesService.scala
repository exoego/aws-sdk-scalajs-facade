package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object iot1clickdevicesservice {
  type DeviceAttributes          = js.Dictionary[__string]
  type MaxResults                = Int
  type __boolean                 = Boolean
  type __double                  = Double
  type __doubleMin0Max100        = Double
  type __integer                 = Int
  type __listOfDeviceDescription = js.Array[DeviceDescription]
  type __listOfDeviceEvent       = js.Array[DeviceEvent]
  type __listOfDeviceMethod      = js.Array[DeviceMethod]
  type __long                    = Double
  type __string                  = String
  type __stringMin12Max40        = String
  type __timestampIso8601        = js.Date
  type __timestampUnix           = js.Date
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
    def unclaimDevice(params: UnclaimDeviceRequest): Request[UnclaimDeviceResponse]                   = js.native
    def updateDeviceState(params: UpdateDeviceStateRequest): Request[UpdateDeviceStateResponse]       = js.native
  }

  @js.native
  trait Attributes extends js.Object {}

  object Attributes {
    def apply(): Attributes = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Attributes]
    }
  }

  @js.native
  trait ClaimDevicesByClaimCodeRequest extends js.Object {
    var ClaimCode: __string
  }

  object ClaimDevicesByClaimCodeRequest {
    def apply(ClaimCode: __string): ClaimDevicesByClaimCodeRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("ClaimCode" -> ClaimCode.asInstanceOf[js.Any])
        .filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClaimDevicesByClaimCodeRequest]
    }
  }

  @js.native
  trait ClaimDevicesByClaimCodeResponse extends js.Object {
    var ClaimCode: js.UndefOr[__stringMin12Max40]
    var Total: js.UndefOr[__integer]
  }

  object ClaimDevicesByClaimCodeResponse {
    def apply(ClaimCode: js.UndefOr[__stringMin12Max40] = js.undefined,
              Total: js.UndefOr[__integer] = js.undefined): ClaimDevicesByClaimCodeResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("ClaimCode" -> ClaimCode.map { x =>
        x.asInstanceOf[js.Any]
      }, "Total" -> Total.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ClaimDevicesByClaimCodeResponse]
    }
  }

  @js.native
  trait DescribeDeviceRequest extends js.Object {
    var DeviceId: __string
  }

  object DescribeDeviceRequest {
    def apply(DeviceId: __string): DescribeDeviceRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("DeviceId" -> DeviceId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDeviceRequest]
    }
  }

  @js.native
  trait DescribeDeviceResponse extends js.Object {
    var DeviceDescription: js.UndefOr[DeviceDescription]
  }

  object DescribeDeviceResponse {
    def apply(DeviceDescription: js.UndefOr[DeviceDescription] = js.undefined): DescribeDeviceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("DeviceDescription" -> DeviceDescription.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeDeviceResponse]
    }
  }

  @js.native
  trait Device extends js.Object {
    var Attributes: js.UndefOr[Attributes]
    var DeviceId: js.UndefOr[__string]
    var Type: js.UndefOr[__string]
  }

  object Device {
    def apply(Attributes: js.UndefOr[Attributes] = js.undefined,
              DeviceId: js.UndefOr[__string] = js.undefined,
              Type: js.UndefOr[__string] = js.undefined): Device = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeviceId" -> DeviceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Device]
    }
  }

  @js.native
  trait DeviceClaimResponse extends js.Object {
    var State: js.UndefOr[__string]
  }

  object DeviceClaimResponse {
    def apply(State: js.UndefOr[__string] = js.undefined): DeviceClaimResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("State" -> State.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeviceClaimResponse]
    }
  }

  @js.native
  trait DeviceDescription extends js.Object {
    var Attributes: js.UndefOr[DeviceAttributes]
    var DeviceId: js.UndefOr[__string]
    var Enabled: js.UndefOr[__boolean]
    var RemainingLife: js.UndefOr[__doubleMin0Max100]
    var Type: js.UndefOr[__string]
  }

  object DeviceDescription {
    def apply(Attributes: js.UndefOr[DeviceAttributes] = js.undefined,
              DeviceId: js.UndefOr[__string] = js.undefined,
              Enabled: js.UndefOr[__boolean] = js.undefined,
              RemainingLife: js.UndefOr[__doubleMin0Max100] = js.undefined,
              Type: js.UndefOr[__string] = js.undefined): DeviceDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Attributes" -> Attributes.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeviceId" -> DeviceId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "RemainingLife" -> RemainingLife.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Type" -> Type.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeviceDescription]
    }
  }

  @js.native
  trait DeviceEvent extends js.Object {
    var Device: js.UndefOr[Device]
    var StdEvent: js.UndefOr[__string]
  }

  object DeviceEvent {
    def apply(Device: js.UndefOr[Device] = js.undefined, StdEvent: js.UndefOr[__string] = js.undefined): DeviceEvent = {
      val _fields = IndexedSeq[(String, js.Any)]("Device" -> Device.map { x =>
        x.asInstanceOf[js.Any]
      }, "StdEvent" -> StdEvent.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeviceEvent]
    }
  }

  @js.native
  trait DeviceEventsResponse extends js.Object {
    var Events: js.UndefOr[__listOfDeviceEvent]
    var NextToken: js.UndefOr[__string]
  }

  object DeviceEventsResponse {
    def apply(Events: js.UndefOr[__listOfDeviceEvent] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): DeviceEventsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Events" -> Events.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeviceEventsResponse]
    }
  }

  @js.native
  trait DeviceMethod extends js.Object {
    var DeviceType: js.UndefOr[__string]
    var MethodName: js.UndefOr[__string]
  }

  object DeviceMethod {
    def apply(DeviceType: js.UndefOr[__string] = js.undefined,
              MethodName: js.UndefOr[__string] = js.undefined): DeviceMethod = {
      val _fields = IndexedSeq[(String, js.Any)]("DeviceType" -> DeviceType.map { x =>
        x.asInstanceOf[js.Any]
      }, "MethodName" -> MethodName.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeviceMethod]
    }
  }

  /**
    * On success, an empty object is returned.
    */
  @js.native
  trait Empty extends js.Object {}

  object Empty {
    def apply(): Empty = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Empty]
    }
  }

  @js.native
  trait FinalizeDeviceClaimRequest extends js.Object {
    var DeviceId: __string
  }

  object FinalizeDeviceClaimRequest {
    def apply(DeviceId: __string): FinalizeDeviceClaimRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("DeviceId" -> DeviceId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FinalizeDeviceClaimRequest]
    }
  }

  @js.native
  trait FinalizeDeviceClaimResponse extends js.Object {
    var State: js.UndefOr[__string]
  }

  object FinalizeDeviceClaimResponse {
    def apply(State: js.UndefOr[__string] = js.undefined): FinalizeDeviceClaimResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("State" -> State.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[FinalizeDeviceClaimResponse]
    }
  }

  @js.native
  trait ForbiddenExceptionException extends js.Object {
    val Code: __string
    val Message: __string
  }

  @js.native
  trait GetDeviceMethodsRequest extends js.Object {
    var DeviceId: __string
  }

  object GetDeviceMethodsRequest {
    def apply(DeviceId: __string): GetDeviceMethodsRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("DeviceId" -> DeviceId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeviceMethodsRequest]
    }
  }

  @js.native
  trait GetDeviceMethodsResponse extends js.Object {
    var DeviceMethods: js.UndefOr[__listOfDeviceMethod]
  }

  object GetDeviceMethodsResponse {
    def apply(DeviceMethods: js.UndefOr[__listOfDeviceMethod] = js.undefined): GetDeviceMethodsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("DeviceMethods" -> DeviceMethods.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetDeviceMethodsResponse]
    }
  }

  @js.native
  trait InitiateDeviceClaimRequest extends js.Object {
    var DeviceId: __string
  }

  object InitiateDeviceClaimRequest {
    def apply(DeviceId: __string): InitiateDeviceClaimRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("DeviceId" -> DeviceId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InitiateDeviceClaimRequest]
    }
  }

  @js.native
  trait InitiateDeviceClaimResponse extends js.Object {
    var State: js.UndefOr[__string]
  }

  object InitiateDeviceClaimResponse {
    def apply(State: js.UndefOr[__string] = js.undefined): InitiateDeviceClaimResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("State" -> State.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InitiateDeviceClaimResponse]
    }
  }

  @js.native
  trait InternalFailureExceptionException extends js.Object {
    val Code: __string
    val Message: __string
  }

  @js.native
  trait InvalidRequestExceptionException extends js.Object {
    val Code: __string
    val Message: __string
  }

  @js.native
  trait InvokeDeviceMethodRequest extends js.Object {
    var DeviceId: __string
    var DeviceMethod: js.UndefOr[DeviceMethod]
    var DeviceMethodParameters: js.UndefOr[__string]
  }

  object InvokeDeviceMethodRequest {
    def apply(DeviceId: __string,
              DeviceMethod: js.UndefOr[DeviceMethod] = js.undefined,
              DeviceMethodParameters: js.UndefOr[__string] = js.undefined): InvokeDeviceMethodRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceId" -> DeviceId.asInstanceOf[js.Any],
        "DeviceMethod" -> DeviceMethod.map { x =>
          x.asInstanceOf[js.Any]
        },
        "DeviceMethodParameters" -> DeviceMethodParameters.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InvokeDeviceMethodRequest]
    }
  }

  @js.native
  trait InvokeDeviceMethodResponse extends js.Object {
    var DeviceMethodResponse: js.UndefOr[__string]
  }

  object InvokeDeviceMethodResponse {
    def apply(DeviceMethodResponse: js.UndefOr[__string] = js.undefined): InvokeDeviceMethodResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("DeviceMethodResponse" -> DeviceMethodResponse.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InvokeDeviceMethodResponse]
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
    def apply(DeviceId: __string,
              FromTimeStamp: __timestampIso8601,
              ToTimeStamp: __timestampIso8601,
              MaxResults: js.UndefOr[MaxResults] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListDeviceEventsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceId"      -> DeviceId.asInstanceOf[js.Any],
        "FromTimeStamp" -> FromTimeStamp.asInstanceOf[js.Any],
        "ToTimeStamp"   -> ToTimeStamp.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeviceEventsRequest]
    }
  }

  @js.native
  trait ListDeviceEventsResponse extends js.Object {
    var Events: js.UndefOr[__listOfDeviceEvent]
    var NextToken: js.UndefOr[__string]
  }

  object ListDeviceEventsResponse {
    def apply(Events: js.UndefOr[__listOfDeviceEvent] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListDeviceEventsResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Events" -> Events.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDeviceEventsResponse]
    }
  }

  @js.native
  trait ListDevicesRequest extends js.Object {
    var DeviceType: js.UndefOr[__string]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[__string]
  }

  object ListDevicesRequest {
    def apply(DeviceType: js.UndefOr[__string] = js.undefined,
              MaxResults: js.UndefOr[MaxResults] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListDevicesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DeviceType" -> DeviceType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDevicesRequest]
    }
  }

  @js.native
  trait ListDevicesResponse extends js.Object {
    var Devices: js.UndefOr[__listOfDeviceDescription]
    var NextToken: js.UndefOr[__string]
  }

  object ListDevicesResponse {
    def apply(Devices: js.UndefOr[__listOfDeviceDescription] = js.undefined,
              NextToken: js.UndefOr[__string] = js.undefined): ListDevicesResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("Devices" -> Devices.map { x =>
        x.asInstanceOf[js.Any]
      }, "NextToken" -> NextToken.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListDevicesResponse]
    }
  }

  @js.native
  trait PreconditionFailedExceptionException extends js.Object {
    val Code: __string
    val Message: __string
  }

  @js.native
  trait RangeNotSatisfiableExceptionException extends js.Object {
    val Code: __string
    val Message: __string
  }

  @js.native
  trait ResourceConflictExceptionException extends js.Object {
    val Code: __string
    val Message: __string
  }

  @js.native
  trait ResourceNotFoundExceptionException extends js.Object {
    val Code: __string
    val Message: __string
  }

  @js.native
  trait UnclaimDeviceRequest extends js.Object {
    var DeviceId: __string
  }

  object UnclaimDeviceRequest {
    def apply(DeviceId: __string): UnclaimDeviceRequest = {
      val _fields =
        IndexedSeq[(String, js.Any)]("DeviceId" -> DeviceId.asInstanceOf[js.Any]).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnclaimDeviceRequest]
    }
  }

  @js.native
  trait UnclaimDeviceResponse extends js.Object {
    var State: js.UndefOr[__string]
  }

  object UnclaimDeviceResponse {
    def apply(State: js.UndefOr[__string] = js.undefined): UnclaimDeviceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]("State" -> State.map { x =>
        x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UnclaimDeviceResponse]
    }
  }

  @js.native
  trait UpdateDeviceStateRequest extends js.Object {
    var DeviceId: __string
    var Enabled: js.UndefOr[__boolean]
  }

  object UpdateDeviceStateRequest {
    def apply(DeviceId: __string, Enabled: js.UndefOr[__boolean] = js.undefined): UpdateDeviceStateRequest = {
      val _fields = IndexedSeq[(String, js.Any)]("DeviceId" -> DeviceId.asInstanceOf[js.Any], "Enabled" -> Enabled.map {
        x =>
          x.asInstanceOf[js.Any]
      }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDeviceStateRequest]
    }
  }

  @js.native
  trait UpdateDeviceStateResponse extends js.Object {}

  object UpdateDeviceStateResponse {
    def apply(): UpdateDeviceStateResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateDeviceStateResponse]
    }
  }
}
