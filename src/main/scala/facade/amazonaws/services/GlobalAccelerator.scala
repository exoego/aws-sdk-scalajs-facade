package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object globalaccelerator {
  type AcceleratorStatus          = String
  type Accelerators               = js.Array[Accelerator]
  type ClientAffinity             = String
  type EndpointConfigurations     = js.Array[EndpointConfiguration]
  type EndpointDescriptions       = js.Array[EndpointDescription]
  type EndpointGroups             = js.Array[EndpointGroup]
  type EndpointWeight             = Int
  type GenericBoolean             = Boolean
  type GenericString              = String
  type HealthCheckIntervalSeconds = Int
  type HealthCheckPort            = Int
  type HealthCheckProtocol        = String
  type HealthState                = String
  type IdempotencyToken           = String
  type IpAddress                  = String
  type IpAddressType              = String
  type IpAddresses                = js.Array[IpAddress]
  type IpSets                     = js.Array[IpSet]
  type Listeners                  = js.Array[Listener]
  type MaxResults                 = Int
  type PortNumber                 = Int
  type PortRanges                 = js.Array[PortRange]
  type Protocol                   = String
  type ThresholdCount             = Int
  type Timestamp                  = js.Date
  type TrafficDialPercentage      = Float
}

package globalaccelerator {
  @js.native
  @JSImport("aws-sdk", "GlobalAccelerator")
  class GlobalAccelerator() extends js.Object {
    def this(config: AWSConfig) = this()

    def createAccelerator(params: CreateAcceleratorRequest): Request[CreateAcceleratorResponse]       = js.native
    def createEndpointGroup(params: CreateEndpointGroupRequest): Request[CreateEndpointGroupResponse] = js.native
    def createListener(params: CreateListenerRequest): Request[CreateListenerResponse]                = js.native
    def deleteAccelerator(params: DeleteAcceleratorRequest): Request[js.Object]                       = js.native
    def deleteEndpointGroup(params: DeleteEndpointGroupRequest): Request[js.Object]                   = js.native
    def deleteListener(params: DeleteListenerRequest): Request[js.Object]                             = js.native
    def describeAccelerator(params: DescribeAcceleratorRequest): Request[DescribeAcceleratorResponse] = js.native
    def describeAcceleratorAttributes(
        params: DescribeAcceleratorAttributesRequest
    ): Request[DescribeAcceleratorAttributesResponse]                                                       = js.native
    def describeEndpointGroup(params: DescribeEndpointGroupRequest): Request[DescribeEndpointGroupResponse] = js.native
    def describeListener(params: DescribeListenerRequest): Request[DescribeListenerResponse]                = js.native
    def listAccelerators(params: ListAcceleratorsRequest): Request[ListAcceleratorsResponse]                = js.native
    def listEndpointGroups(params: ListEndpointGroupsRequest): Request[ListEndpointGroupsResponse]          = js.native
    def listListeners(params: ListListenersRequest): Request[ListListenersResponse]                         = js.native
    def updateAccelerator(params: UpdateAcceleratorRequest): Request[UpdateAcceleratorResponse]             = js.native
    def updateAcceleratorAttributes(
        params: UpdateAcceleratorAttributesRequest
    ): Request[UpdateAcceleratorAttributesResponse]                                                   = js.native
    def updateEndpointGroup(params: UpdateEndpointGroupRequest): Request[UpdateEndpointGroupResponse] = js.native
    def updateListener(params: UpdateListenerRequest): Request[UpdateListenerResponse]                = js.native
  }

  /**
    * An accelerator is a complex type that includes one or more listeners that process inbound connections and then direct traffic to one or more endpoint groups, each of which includes endpoints, such as load balancers.
    */
  @js.native
  trait Accelerator extends js.Object {
    var AcceleratorArn: js.UndefOr[GenericString]
    var CreatedTime: js.UndefOr[Timestamp]
    var Enabled: js.UndefOr[GenericBoolean]
    var IpAddressType: js.UndefOr[IpAddressType]
    var IpSets: js.UndefOr[IpSets]
    var LastModifiedTime: js.UndefOr[Timestamp]
    var Name: js.UndefOr[GenericString]
    var Status: js.UndefOr[AcceleratorStatus]
  }

  object Accelerator {
    def apply(
        AcceleratorArn: js.UndefOr[GenericString] = js.undefined,
        CreatedTime: js.UndefOr[Timestamp] = js.undefined,
        Enabled: js.UndefOr[GenericBoolean] = js.undefined,
        IpAddressType: js.UndefOr[IpAddressType] = js.undefined,
        IpSets: js.UndefOr[IpSets] = js.undefined,
        LastModifiedTime: js.UndefOr[Timestamp] = js.undefined,
        Name: js.UndefOr[GenericString] = js.undefined,
        Status: js.UndefOr[AcceleratorStatus] = js.undefined
    ): Accelerator = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AcceleratorArn" -> AcceleratorArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "CreatedTime" -> CreatedTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IpAddressType" -> IpAddressType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IpSets" -> IpSets.map { x =>
          x.asInstanceOf[js.Any]
        },
        "LastModifiedTime" -> LastModifiedTime.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Status" -> Status.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Accelerator]
    }
  }

  /**
    * Attributes of an accelerator.
    */
  @js.native
  trait AcceleratorAttributes extends js.Object {
    var FlowLogsEnabled: js.UndefOr[GenericBoolean]
    var FlowLogsS3Bucket: js.UndefOr[GenericString]
    var FlowLogsS3Prefix: js.UndefOr[GenericString]
  }

  object AcceleratorAttributes {
    def apply(
        FlowLogsEnabled: js.UndefOr[GenericBoolean] = js.undefined,
        FlowLogsS3Bucket: js.UndefOr[GenericString] = js.undefined,
        FlowLogsS3Prefix: js.UndefOr[GenericString] = js.undefined
    ): AcceleratorAttributes = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FlowLogsEnabled" -> FlowLogsEnabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FlowLogsS3Bucket" -> FlowLogsS3Bucket.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FlowLogsS3Prefix" -> FlowLogsS3Prefix.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[AcceleratorAttributes]
    }
  }

  object AcceleratorStatusEnum {
    val DEPLOYED    = "DEPLOYED"
    val IN_PROGRESS = "IN_PROGRESS"

    val values = IndexedSeq(DEPLOYED, IN_PROGRESS)
  }

  object ClientAffinityEnum {
    val NONE      = "NONE"
    val SOURCE_IP = "SOURCE_IP"

    val values = IndexedSeq(NONE, SOURCE_IP)
  }

  @js.native
  trait CreateAcceleratorRequest extends js.Object {
    var IdempotencyToken: IdempotencyToken
    var Name: GenericString
    var Enabled: js.UndefOr[GenericBoolean]
    var IpAddressType: js.UndefOr[IpAddressType]
  }

  object CreateAcceleratorRequest {
    def apply(
        IdempotencyToken: IdempotencyToken,
        Name: GenericString,
        Enabled: js.UndefOr[GenericBoolean] = js.undefined,
        IpAddressType: js.UndefOr[IpAddressType] = js.undefined
    ): CreateAcceleratorRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IdempotencyToken" -> IdempotencyToken.asInstanceOf[js.Any],
        "Name"             -> Name.asInstanceOf[js.Any],
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IpAddressType" -> IpAddressType.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAcceleratorRequest]
    }
  }

  @js.native
  trait CreateAcceleratorResponse extends js.Object {
    var Accelerator: js.UndefOr[Accelerator]
  }

  object CreateAcceleratorResponse {
    def apply(
        Accelerator: js.UndefOr[Accelerator] = js.undefined
    ): CreateAcceleratorResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Accelerator" -> Accelerator.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateAcceleratorResponse]
    }
  }

  @js.native
  trait CreateEndpointGroupRequest extends js.Object {
    var EndpointGroupRegion: GenericString
    var IdempotencyToken: IdempotencyToken
    var ListenerArn: GenericString
    var EndpointConfigurations: js.UndefOr[EndpointConfigurations]
    var HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds]
    var HealthCheckPath: js.UndefOr[GenericString]
    var HealthCheckPort: js.UndefOr[HealthCheckPort]
    var HealthCheckProtocol: js.UndefOr[HealthCheckProtocol]
    var ThresholdCount: js.UndefOr[ThresholdCount]
    var TrafficDialPercentage: js.UndefOr[TrafficDialPercentage]
  }

  object CreateEndpointGroupRequest {
    def apply(
        EndpointGroupRegion: GenericString,
        IdempotencyToken: IdempotencyToken,
        ListenerArn: GenericString,
        EndpointConfigurations: js.UndefOr[EndpointConfigurations] = js.undefined,
        HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds] = js.undefined,
        HealthCheckPath: js.UndefOr[GenericString] = js.undefined,
        HealthCheckPort: js.UndefOr[HealthCheckPort] = js.undefined,
        HealthCheckProtocol: js.UndefOr[HealthCheckProtocol] = js.undefined,
        ThresholdCount: js.UndefOr[ThresholdCount] = js.undefined,
        TrafficDialPercentage: js.UndefOr[TrafficDialPercentage] = js.undefined
    ): CreateEndpointGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointGroupRegion" -> EndpointGroupRegion.asInstanceOf[js.Any],
        "IdempotencyToken"    -> IdempotencyToken.asInstanceOf[js.Any],
        "ListenerArn"         -> ListenerArn.asInstanceOf[js.Any],
        "EndpointConfigurations" -> EndpointConfigurations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HealthCheckIntervalSeconds" -> HealthCheckIntervalSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HealthCheckPath" -> HealthCheckPath.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HealthCheckPort" -> HealthCheckPort.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HealthCheckProtocol" -> HealthCheckProtocol.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ThresholdCount" -> ThresholdCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TrafficDialPercentage" -> TrafficDialPercentage.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEndpointGroupRequest]
    }
  }

  @js.native
  trait CreateEndpointGroupResponse extends js.Object {
    var EndpointGroup: js.UndefOr[EndpointGroup]
  }

  object CreateEndpointGroupResponse {
    def apply(
        EndpointGroup: js.UndefOr[EndpointGroup] = js.undefined
    ): CreateEndpointGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointGroup" -> EndpointGroup.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateEndpointGroupResponse]
    }
  }

  @js.native
  trait CreateListenerRequest extends js.Object {
    var AcceleratorArn: GenericString
    var IdempotencyToken: IdempotencyToken
    var PortRanges: PortRanges
    var Protocol: Protocol
    var ClientAffinity: js.UndefOr[ClientAffinity]
  }

  object CreateListenerRequest {
    def apply(
        AcceleratorArn: GenericString,
        IdempotencyToken: IdempotencyToken,
        PortRanges: PortRanges,
        Protocol: Protocol,
        ClientAffinity: js.UndefOr[ClientAffinity] = js.undefined
    ): CreateListenerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AcceleratorArn"   -> AcceleratorArn.asInstanceOf[js.Any],
        "IdempotencyToken" -> IdempotencyToken.asInstanceOf[js.Any],
        "PortRanges"       -> PortRanges.asInstanceOf[js.Any],
        "Protocol"         -> Protocol.asInstanceOf[js.Any],
        "ClientAffinity" -> ClientAffinity.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateListenerRequest]
    }
  }

  @js.native
  trait CreateListenerResponse extends js.Object {
    var Listener: js.UndefOr[Listener]
  }

  object CreateListenerResponse {
    def apply(
        Listener: js.UndefOr[Listener] = js.undefined
    ): CreateListenerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Listener" -> Listener.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateListenerResponse]
    }
  }

  @js.native
  trait DeleteAcceleratorRequest extends js.Object {
    var AcceleratorArn: GenericString
  }

  object DeleteAcceleratorRequest {
    def apply(
        AcceleratorArn: GenericString
    ): DeleteAcceleratorRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AcceleratorArn" -> AcceleratorArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteAcceleratorRequest]
    }
  }

  @js.native
  trait DeleteEndpointGroupRequest extends js.Object {
    var EndpointGroupArn: GenericString
  }

  object DeleteEndpointGroupRequest {
    def apply(
        EndpointGroupArn: GenericString
    ): DeleteEndpointGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointGroupArn" -> EndpointGroupArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteEndpointGroupRequest]
    }
  }

  @js.native
  trait DeleteListenerRequest extends js.Object {
    var ListenerArn: GenericString
  }

  object DeleteListenerRequest {
    def apply(
        ListenerArn: GenericString
    ): DeleteListenerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ListenerArn" -> ListenerArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteListenerRequest]
    }
  }

  @js.native
  trait DescribeAcceleratorAttributesRequest extends js.Object {
    var AcceleratorArn: js.UndefOr[GenericString]
  }

  object DescribeAcceleratorAttributesRequest {
    def apply(
        AcceleratorArn: js.UndefOr[GenericString] = js.undefined
    ): DescribeAcceleratorAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AcceleratorArn" -> AcceleratorArn.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAcceleratorAttributesRequest]
    }
  }

  @js.native
  trait DescribeAcceleratorAttributesResponse extends js.Object {
    var AcceleratorAttributes: js.UndefOr[AcceleratorAttributes]
  }

  object DescribeAcceleratorAttributesResponse {
    def apply(
        AcceleratorAttributes: js.UndefOr[AcceleratorAttributes] = js.undefined
    ): DescribeAcceleratorAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AcceleratorAttributes" -> AcceleratorAttributes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAcceleratorAttributesResponse]
    }
  }

  @js.native
  trait DescribeAcceleratorRequest extends js.Object {
    var AcceleratorArn: GenericString
  }

  object DescribeAcceleratorRequest {
    def apply(
        AcceleratorArn: GenericString
    ): DescribeAcceleratorRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AcceleratorArn" -> AcceleratorArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAcceleratorRequest]
    }
  }

  @js.native
  trait DescribeAcceleratorResponse extends js.Object {
    var Accelerator: js.UndefOr[Accelerator]
  }

  object DescribeAcceleratorResponse {
    def apply(
        Accelerator: js.UndefOr[Accelerator] = js.undefined
    ): DescribeAcceleratorResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Accelerator" -> Accelerator.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeAcceleratorResponse]
    }
  }

  @js.native
  trait DescribeEndpointGroupRequest extends js.Object {
    var EndpointGroupArn: GenericString
  }

  object DescribeEndpointGroupRequest {
    def apply(
        EndpointGroupArn: GenericString
    ): DescribeEndpointGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointGroupArn" -> EndpointGroupArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEndpointGroupRequest]
    }
  }

  @js.native
  trait DescribeEndpointGroupResponse extends js.Object {
    var EndpointGroup: js.UndefOr[EndpointGroup]
  }

  object DescribeEndpointGroupResponse {
    def apply(
        EndpointGroup: js.UndefOr[EndpointGroup] = js.undefined
    ): DescribeEndpointGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointGroup" -> EndpointGroup.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeEndpointGroupResponse]
    }
  }

  @js.native
  trait DescribeListenerRequest extends js.Object {
    var ListenerArn: GenericString
  }

  object DescribeListenerRequest {
    def apply(
        ListenerArn: GenericString
    ): DescribeListenerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ListenerArn" -> ListenerArn.asInstanceOf[js.Any]
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeListenerRequest]
    }
  }

  @js.native
  trait DescribeListenerResponse extends js.Object {
    var Listener: js.UndefOr[Listener]
  }

  object DescribeListenerResponse {
    def apply(
        Listener: js.UndefOr[Listener] = js.undefined
    ): DescribeListenerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Listener" -> Listener.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeListenerResponse]
    }
  }

  /**
    * A complex type for endpoints.
    */
  @js.native
  trait EndpointConfiguration extends js.Object {
    var EndpointId: js.UndefOr[GenericString]
    var Weight: js.UndefOr[EndpointWeight]
  }

  object EndpointConfiguration {
    def apply(
        EndpointId: js.UndefOr[GenericString] = js.undefined,
        Weight: js.UndefOr[EndpointWeight] = js.undefined
    ): EndpointConfiguration = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointId" -> EndpointId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Weight" -> Weight.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EndpointConfiguration]
    }
  }

  /**
    * A complex type for an endpoint. Each endpoint group can include one or more endpoints, such as load balancers.
    */
  @js.native
  trait EndpointDescription extends js.Object {
    var EndpointId: js.UndefOr[GenericString]
    var HealthReason: js.UndefOr[GenericString]
    var HealthState: js.UndefOr[HealthState]
    var Weight: js.UndefOr[EndpointWeight]
  }

  object EndpointDescription {
    def apply(
        EndpointId: js.UndefOr[GenericString] = js.undefined,
        HealthReason: js.UndefOr[GenericString] = js.undefined,
        HealthState: js.UndefOr[HealthState] = js.undefined,
        Weight: js.UndefOr[EndpointWeight] = js.undefined
    ): EndpointDescription = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointId" -> EndpointId.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HealthReason" -> HealthReason.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HealthState" -> HealthState.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Weight" -> Weight.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EndpointDescription]
    }
  }

  /**
    * A complex type for the endpoint group. An AWS Region can have only one endpoint group for a specific listener.
    */
  @js.native
  trait EndpointGroup extends js.Object {
    var EndpointDescriptions: js.UndefOr[EndpointDescriptions]
    var EndpointGroupArn: js.UndefOr[GenericString]
    var EndpointGroupRegion: js.UndefOr[GenericString]
    var HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds]
    var HealthCheckPath: js.UndefOr[GenericString]
    var HealthCheckPort: js.UndefOr[HealthCheckPort]
    var HealthCheckProtocol: js.UndefOr[HealthCheckProtocol]
    var ThresholdCount: js.UndefOr[ThresholdCount]
    var TrafficDialPercentage: js.UndefOr[TrafficDialPercentage]
  }

  object EndpointGroup {
    def apply(
        EndpointDescriptions: js.UndefOr[EndpointDescriptions] = js.undefined,
        EndpointGroupArn: js.UndefOr[GenericString] = js.undefined,
        EndpointGroupRegion: js.UndefOr[GenericString] = js.undefined,
        HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds] = js.undefined,
        HealthCheckPath: js.UndefOr[GenericString] = js.undefined,
        HealthCheckPort: js.UndefOr[HealthCheckPort] = js.undefined,
        HealthCheckProtocol: js.UndefOr[HealthCheckProtocol] = js.undefined,
        ThresholdCount: js.UndefOr[ThresholdCount] = js.undefined,
        TrafficDialPercentage: js.UndefOr[TrafficDialPercentage] = js.undefined
    ): EndpointGroup = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointDescriptions" -> EndpointDescriptions.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EndpointGroupArn" -> EndpointGroupArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "EndpointGroupRegion" -> EndpointGroupRegion.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HealthCheckIntervalSeconds" -> HealthCheckIntervalSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HealthCheckPath" -> HealthCheckPath.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HealthCheckPort" -> HealthCheckPort.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HealthCheckProtocol" -> HealthCheckProtocol.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ThresholdCount" -> ThresholdCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TrafficDialPercentage" -> TrafficDialPercentage.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[EndpointGroup]
    }
  }

  object HealthCheckProtocolEnum {
    val TCP   = "TCP"
    val HTTP  = "HTTP"
    val HTTPS = "HTTPS"

    val values = IndexedSeq(TCP, HTTP, HTTPS)
  }

  object HealthStateEnum {
    val INITIAL   = "INITIAL"
    val HEALTHY   = "HEALTHY"
    val UNHEALTHY = "UNHEALTHY"

    val values = IndexedSeq(INITIAL, HEALTHY, UNHEALTHY)
  }

  object IpAddressTypeEnum {
    val IPV4 = "IPV4"

    val values = IndexedSeq(IPV4)
  }

  /**
    * A complex type for the set of IP addresses for an accelerator.
    */
  @js.native
  trait IpSet extends js.Object {
    var IpAddresses: js.UndefOr[IpAddresses]
    var IpFamily: js.UndefOr[GenericString]
  }

  object IpSet {
    def apply(
        IpAddresses: js.UndefOr[IpAddresses] = js.undefined,
        IpFamily: js.UndefOr[GenericString] = js.undefined
    ): IpSet = {
      val _fields = IndexedSeq[(String, js.Any)](
        "IpAddresses" -> IpAddresses.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IpFamily" -> IpFamily.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[IpSet]
    }
  }

  @js.native
  trait ListAcceleratorsRequest extends js.Object {
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[GenericString]
  }

  object ListAcceleratorsRequest {
    def apply(
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): ListAcceleratorsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAcceleratorsRequest]
    }
  }

  @js.native
  trait ListAcceleratorsResponse extends js.Object {
    var Accelerators: js.UndefOr[Accelerators]
    var NextToken: js.UndefOr[GenericString]
  }

  object ListAcceleratorsResponse {
    def apply(
        Accelerators: js.UndefOr[Accelerators] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): ListAcceleratorsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Accelerators" -> Accelerators.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListAcceleratorsResponse]
    }
  }

  @js.native
  trait ListEndpointGroupsRequest extends js.Object {
    var ListenerArn: GenericString
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[GenericString]
  }

  object ListEndpointGroupsRequest {
    def apply(
        ListenerArn: GenericString,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): ListEndpointGroupsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ListenerArn" -> ListenerArn.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEndpointGroupsRequest]
    }
  }

  @js.native
  trait ListEndpointGroupsResponse extends js.Object {
    var EndpointGroups: js.UndefOr[EndpointGroups]
    var NextToken: js.UndefOr[GenericString]
  }

  object ListEndpointGroupsResponse {
    def apply(
        EndpointGroups: js.UndefOr[EndpointGroups] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): ListEndpointGroupsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointGroups" -> EndpointGroups.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListEndpointGroupsResponse]
    }
  }

  @js.native
  trait ListListenersRequest extends js.Object {
    var AcceleratorArn: GenericString
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[GenericString]
  }

  object ListListenersRequest {
    def apply(
        AcceleratorArn: GenericString,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): ListListenersRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AcceleratorArn" -> AcceleratorArn.asInstanceOf[js.Any],
        "MaxResults" -> MaxResults.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListListenersRequest]
    }
  }

  @js.native
  trait ListListenersResponse extends js.Object {
    var Listeners: js.UndefOr[Listeners]
    var NextToken: js.UndefOr[GenericString]
  }

  object ListListenersResponse {
    def apply(
        Listeners: js.UndefOr[Listeners] = js.undefined,
        NextToken: js.UndefOr[GenericString] = js.undefined
    ): ListListenersResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Listeners" -> Listeners.map { x =>
          x.asInstanceOf[js.Any]
        },
        "NextToken" -> NextToken.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListListenersResponse]
    }
  }

  /**
    * A complex type for a listener.
    */
  @js.native
  trait Listener extends js.Object {
    var ClientAffinity: js.UndefOr[ClientAffinity]
    var ListenerArn: js.UndefOr[GenericString]
    var PortRanges: js.UndefOr[PortRanges]
    var Protocol: js.UndefOr[Protocol]
  }

  object Listener {
    def apply(
        ClientAffinity: js.UndefOr[ClientAffinity] = js.undefined,
        ListenerArn: js.UndefOr[GenericString] = js.undefined,
        PortRanges: js.UndefOr[PortRanges] = js.undefined,
        Protocol: js.UndefOr[Protocol] = js.undefined
    ): Listener = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ClientAffinity" -> ClientAffinity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ListenerArn" -> ListenerArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PortRanges" -> PortRanges.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Protocol" -> Protocol.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Listener]
    }
  }

  /**
    * A complex type for a range of ports for a listener.
    */
  @js.native
  trait PortRange extends js.Object {
    var FromPort: js.UndefOr[PortNumber]
    var ToPort: js.UndefOr[PortNumber]
  }

  object PortRange {
    def apply(
        FromPort: js.UndefOr[PortNumber] = js.undefined,
        ToPort: js.UndefOr[PortNumber] = js.undefined
    ): PortRange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FromPort" -> FromPort.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ToPort" -> ToPort.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PortRange]
    }
  }

  object ProtocolEnum {
    val TCP = "TCP"
    val UDP = "UDP"

    val values = IndexedSeq(TCP, UDP)
  }

  @js.native
  trait UpdateAcceleratorAttributesRequest extends js.Object {
    var AcceleratorArn: js.UndefOr[GenericString]
    var FlowLogsEnabled: js.UndefOr[GenericBoolean]
    var FlowLogsS3Bucket: js.UndefOr[GenericString]
    var FlowLogsS3Prefix: js.UndefOr[GenericString]
  }

  object UpdateAcceleratorAttributesRequest {
    def apply(
        AcceleratorArn: js.UndefOr[GenericString] = js.undefined,
        FlowLogsEnabled: js.UndefOr[GenericBoolean] = js.undefined,
        FlowLogsS3Bucket: js.UndefOr[GenericString] = js.undefined,
        FlowLogsS3Prefix: js.UndefOr[GenericString] = js.undefined
    ): UpdateAcceleratorAttributesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AcceleratorArn" -> AcceleratorArn.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FlowLogsEnabled" -> FlowLogsEnabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FlowLogsS3Bucket" -> FlowLogsS3Bucket.map { x =>
          x.asInstanceOf[js.Any]
        },
        "FlowLogsS3Prefix" -> FlowLogsS3Prefix.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAcceleratorAttributesRequest]
    }
  }

  @js.native
  trait UpdateAcceleratorAttributesResponse extends js.Object {
    var AcceleratorAttributes: js.UndefOr[AcceleratorAttributes]
  }

  object UpdateAcceleratorAttributesResponse {
    def apply(
        AcceleratorAttributes: js.UndefOr[AcceleratorAttributes] = js.undefined
    ): UpdateAcceleratorAttributesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AcceleratorAttributes" -> AcceleratorAttributes.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAcceleratorAttributesResponse]
    }
  }

  @js.native
  trait UpdateAcceleratorRequest extends js.Object {
    var AcceleratorArn: GenericString
    var Enabled: js.UndefOr[GenericBoolean]
    var IpAddressType: js.UndefOr[IpAddressType]
    var Name: js.UndefOr[GenericString]
  }

  object UpdateAcceleratorRequest {
    def apply(
        AcceleratorArn: GenericString,
        Enabled: js.UndefOr[GenericBoolean] = js.undefined,
        IpAddressType: js.UndefOr[IpAddressType] = js.undefined,
        Name: js.UndefOr[GenericString] = js.undefined
    ): UpdateAcceleratorRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "AcceleratorArn" -> AcceleratorArn.asInstanceOf[js.Any],
        "Enabled" -> Enabled.map { x =>
          x.asInstanceOf[js.Any]
        },
        "IpAddressType" -> IpAddressType.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Name" -> Name.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAcceleratorRequest]
    }
  }

  @js.native
  trait UpdateAcceleratorResponse extends js.Object {
    var Accelerator: js.UndefOr[Accelerator]
  }

  object UpdateAcceleratorResponse {
    def apply(
        Accelerator: js.UndefOr[Accelerator] = js.undefined
    ): UpdateAcceleratorResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Accelerator" -> Accelerator.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateAcceleratorResponse]
    }
  }

  @js.native
  trait UpdateEndpointGroupRequest extends js.Object {
    var EndpointGroupArn: GenericString
    var EndpointConfigurations: js.UndefOr[EndpointConfigurations]
    var HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds]
    var HealthCheckPath: js.UndefOr[GenericString]
    var HealthCheckPort: js.UndefOr[HealthCheckPort]
    var HealthCheckProtocol: js.UndefOr[HealthCheckProtocol]
    var ThresholdCount: js.UndefOr[ThresholdCount]
    var TrafficDialPercentage: js.UndefOr[TrafficDialPercentage]
  }

  object UpdateEndpointGroupRequest {
    def apply(
        EndpointGroupArn: GenericString,
        EndpointConfigurations: js.UndefOr[EndpointConfigurations] = js.undefined,
        HealthCheckIntervalSeconds: js.UndefOr[HealthCheckIntervalSeconds] = js.undefined,
        HealthCheckPath: js.UndefOr[GenericString] = js.undefined,
        HealthCheckPort: js.UndefOr[HealthCheckPort] = js.undefined,
        HealthCheckProtocol: js.UndefOr[HealthCheckProtocol] = js.undefined,
        ThresholdCount: js.UndefOr[ThresholdCount] = js.undefined,
        TrafficDialPercentage: js.UndefOr[TrafficDialPercentage] = js.undefined
    ): UpdateEndpointGroupRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointGroupArn" -> EndpointGroupArn.asInstanceOf[js.Any],
        "EndpointConfigurations" -> EndpointConfigurations.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HealthCheckIntervalSeconds" -> HealthCheckIntervalSeconds.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HealthCheckPath" -> HealthCheckPath.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HealthCheckPort" -> HealthCheckPort.map { x =>
          x.asInstanceOf[js.Any]
        },
        "HealthCheckProtocol" -> HealthCheckProtocol.map { x =>
          x.asInstanceOf[js.Any]
        },
        "ThresholdCount" -> ThresholdCount.map { x =>
          x.asInstanceOf[js.Any]
        },
        "TrafficDialPercentage" -> TrafficDialPercentage.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEndpointGroupRequest]
    }
  }

  @js.native
  trait UpdateEndpointGroupResponse extends js.Object {
    var EndpointGroup: js.UndefOr[EndpointGroup]
  }

  object UpdateEndpointGroupResponse {
    def apply(
        EndpointGroup: js.UndefOr[EndpointGroup] = js.undefined
    ): UpdateEndpointGroupResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "EndpointGroup" -> EndpointGroup.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateEndpointGroupResponse]
    }
  }

  @js.native
  trait UpdateListenerRequest extends js.Object {
    var ListenerArn: GenericString
    var ClientAffinity: js.UndefOr[ClientAffinity]
    var PortRanges: js.UndefOr[PortRanges]
    var Protocol: js.UndefOr[Protocol]
  }

  object UpdateListenerRequest {
    def apply(
        ListenerArn: GenericString,
        ClientAffinity: js.UndefOr[ClientAffinity] = js.undefined,
        PortRanges: js.UndefOr[PortRanges] = js.undefined,
        Protocol: js.UndefOr[Protocol] = js.undefined
    ): UpdateListenerRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ListenerArn" -> ListenerArn.asInstanceOf[js.Any],
        "ClientAffinity" -> ClientAffinity.map { x =>
          x.asInstanceOf[js.Any]
        },
        "PortRanges" -> PortRanges.map { x =>
          x.asInstanceOf[js.Any]
        },
        "Protocol" -> Protocol.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateListenerRequest]
    }
  }

  @js.native
  trait UpdateListenerResponse extends js.Object {
    var Listener: js.UndefOr[Listener]
  }

  object UpdateListenerResponse {
    def apply(
        Listener: js.UndefOr[Listener] = js.undefined
    ): UpdateListenerResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Listener" -> Listener.map { x =>
          x.asInstanceOf[js.Any]
        }
      ).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateListenerResponse]
    }
  }
}
