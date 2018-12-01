package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object appmesh {
  type Arn = String
  type Backends = js.Array[ServiceName]
  type DurationMillis = Double
  type ListMeshesLimit = Int
  type ListRoutesLimit = Int
  type ListVirtualNodesLimit = Int
  type ListVirtualRoutersLimit = Int
  type Listeners = js.Array[Listener]
  type MeshList = js.Array[MeshRef]
  type MeshStatusCode = String
  type NonNegativeInt = Int
  type PercentInt = Int
  type PortNumber = Int
  type PortProtocol = String
  type ResourceName = String
  type RouteList = js.Array[RouteRef]
  type RouteStatusCode = String
  type ServiceName = String
  type ServiceNames = js.Array[ServiceName]
  type Timestamp = js.Date
  type VirtualNodeList = js.Array[VirtualNodeRef]
  type VirtualNodeStatusCode = String
  type VirtualRouterList = js.Array[VirtualRouterRef]
  type VirtualRouterStatusCode = String
  type WeightedTargets = js.Array[WeightedTarget]
}

package appmesh {
  @js.native
  @JSImport("aws-sdk", "AppMesh")
  class AppMesh(config: AWSConfig) extends js.Object {
    def createMesh(params: CreateMeshInput): Request[CreateMeshOutput] = js.native
    def createRoute(params: CreateRouteInput): Request[CreateRouteOutput] = js.native
    def createVirtualNode(params: CreateVirtualNodeInput): Request[CreateVirtualNodeOutput] = js.native
    def createVirtualRouter(params: CreateVirtualRouterInput): Request[CreateVirtualRouterOutput] = js.native
    def deleteMesh(params: DeleteMeshInput): Request[DeleteMeshOutput] = js.native
    def deleteRoute(params: DeleteRouteInput): Request[DeleteRouteOutput] = js.native
    def deleteVirtualNode(params: DeleteVirtualNodeInput): Request[DeleteVirtualNodeOutput] = js.native
    def deleteVirtualRouter(params: DeleteVirtualRouterInput): Request[DeleteVirtualRouterOutput] = js.native
    def describeMesh(params: DescribeMeshInput): Request[DescribeMeshOutput] = js.native
    def describeRoute(params: DescribeRouteInput): Request[DescribeRouteOutput] = js.native
    def describeVirtualNode(params: DescribeVirtualNodeInput): Request[DescribeVirtualNodeOutput] = js.native
    def describeVirtualRouter(params: DescribeVirtualRouterInput): Request[DescribeVirtualRouterOutput] = js.native
    def listMeshes(params: ListMeshesInput): Request[ListMeshesOutput] = js.native
    def listRoutes(params: ListRoutesInput): Request[ListRoutesOutput] = js.native
    def listVirtualNodes(params: ListVirtualNodesInput): Request[ListVirtualNodesOutput] = js.native
    def listVirtualRouters(params: ListVirtualRoutersInput): Request[ListVirtualRoutersOutput] = js.native
    def updateRoute(params: UpdateRouteInput): Request[UpdateRouteOutput] = js.native
    def updateVirtualNode(params: UpdateVirtualNodeInput): Request[UpdateVirtualNodeOutput] = js.native
    def updateVirtualRouter(params: UpdateVirtualRouterInput): Request[UpdateVirtualRouterOutput] = js.native
  }

  /**
   *
   */
  @js.native
  trait CreateMeshInput extends js.Object {
    var clientToken: js.UndefOr[String]
    var meshName: js.UndefOr[ResourceName]
  }

  object CreateMeshInput {
    def apply(
      clientToken: js.UndefOr[String] = js.undefined,
      meshName: js.UndefOr[ResourceName] = js.undefined): CreateMeshInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "clientToken" -> clientToken.map { x => x.asInstanceOf[js.Any] },
        "meshName" -> meshName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateMeshInput]
    }
  }

  /**
   *
   */
  @js.native
  trait CreateMeshOutput extends js.Object {
    var mesh: js.UndefOr[MeshData]
  }

  object CreateMeshOutput {
    def apply(
      mesh: js.UndefOr[MeshData] = js.undefined): CreateMeshOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "mesh" -> mesh.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateMeshOutput]
    }
  }

  /**
   *
   */
  @js.native
  trait CreateRouteInput extends js.Object {
    var meshName: js.UndefOr[ResourceName]
    var virtualRouterName: js.UndefOr[ResourceName]
    var clientToken: js.UndefOr[String]
    var spec: js.UndefOr[RouteSpec]
    var routeName: js.UndefOr[ResourceName]
  }

  object CreateRouteInput {
    def apply(
      meshName: js.UndefOr[ResourceName] = js.undefined,
      virtualRouterName: js.UndefOr[ResourceName] = js.undefined,
      clientToken: js.UndefOr[String] = js.undefined,
      spec: js.UndefOr[RouteSpec] = js.undefined,
      routeName: js.UndefOr[ResourceName] = js.undefined): CreateRouteInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "meshName" -> meshName.map { x => x.asInstanceOf[js.Any] },
        "virtualRouterName" -> virtualRouterName.map { x => x.asInstanceOf[js.Any] },
        "clientToken" -> clientToken.map { x => x.asInstanceOf[js.Any] },
        "spec" -> spec.map { x => x.asInstanceOf[js.Any] },
        "routeName" -> routeName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRouteInput]
    }
  }

  /**
   *
   */
  @js.native
  trait CreateRouteOutput extends js.Object {
    var route: js.UndefOr[RouteData]
  }

  object CreateRouteOutput {
    def apply(
      route: js.UndefOr[RouteData] = js.undefined): CreateRouteOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "route" -> route.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateRouteOutput]
    }
  }

  /**
   *
   */
  @js.native
  trait CreateVirtualNodeInput extends js.Object {
    var clientToken: js.UndefOr[String]
    var meshName: js.UndefOr[ResourceName]
    var spec: js.UndefOr[VirtualNodeSpec]
    var virtualNodeName: js.UndefOr[ResourceName]
  }

  object CreateVirtualNodeInput {
    def apply(
      clientToken: js.UndefOr[String] = js.undefined,
      meshName: js.UndefOr[ResourceName] = js.undefined,
      spec: js.UndefOr[VirtualNodeSpec] = js.undefined,
      virtualNodeName: js.UndefOr[ResourceName] = js.undefined): CreateVirtualNodeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "clientToken" -> clientToken.map { x => x.asInstanceOf[js.Any] },
        "meshName" -> meshName.map { x => x.asInstanceOf[js.Any] },
        "spec" -> spec.map { x => x.asInstanceOf[js.Any] },
        "virtualNodeName" -> virtualNodeName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVirtualNodeInput]
    }
  }

  /**
   *
   */
  @js.native
  trait CreateVirtualNodeOutput extends js.Object {
    var virtualNode: js.UndefOr[VirtualNodeData]
  }

  object CreateVirtualNodeOutput {
    def apply(
      virtualNode: js.UndefOr[VirtualNodeData] = js.undefined): CreateVirtualNodeOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "virtualNode" -> virtualNode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVirtualNodeOutput]
    }
  }

  /**
   *
   */
  @js.native
  trait CreateVirtualRouterInput extends js.Object {
    var clientToken: js.UndefOr[String]
    var meshName: js.UndefOr[ResourceName]
    var spec: js.UndefOr[VirtualRouterSpec]
    var virtualRouterName: js.UndefOr[ResourceName]
  }

  object CreateVirtualRouterInput {
    def apply(
      clientToken: js.UndefOr[String] = js.undefined,
      meshName: js.UndefOr[ResourceName] = js.undefined,
      spec: js.UndefOr[VirtualRouterSpec] = js.undefined,
      virtualRouterName: js.UndefOr[ResourceName] = js.undefined): CreateVirtualRouterInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "clientToken" -> clientToken.map { x => x.asInstanceOf[js.Any] },
        "meshName" -> meshName.map { x => x.asInstanceOf[js.Any] },
        "spec" -> spec.map { x => x.asInstanceOf[js.Any] },
        "virtualRouterName" -> virtualRouterName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVirtualRouterInput]
    }
  }

  /**
   *
   */
  @js.native
  trait CreateVirtualRouterOutput extends js.Object {
    var virtualRouter: js.UndefOr[VirtualRouterData]
  }

  object CreateVirtualRouterOutput {
    def apply(
      virtualRouter: js.UndefOr[VirtualRouterData] = js.undefined): CreateVirtualRouterOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "virtualRouter" -> virtualRouter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateVirtualRouterOutput]
    }
  }

  /**
   *
   */
  @js.native
  trait DeleteMeshInput extends js.Object {
    var meshName: js.UndefOr[ResourceName]
  }

  object DeleteMeshInput {
    def apply(
      meshName: js.UndefOr[ResourceName] = js.undefined): DeleteMeshInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "meshName" -> meshName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMeshInput]
    }
  }

  /**
   *
   */
  @js.native
  trait DeleteMeshOutput extends js.Object {
    var mesh: js.UndefOr[MeshData]
  }

  object DeleteMeshOutput {
    def apply(
      mesh: js.UndefOr[MeshData] = js.undefined): DeleteMeshOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "mesh" -> mesh.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteMeshOutput]
    }
  }

  /**
   *
   */
  @js.native
  trait DeleteRouteInput extends js.Object {
    var meshName: js.UndefOr[ResourceName]
    var routeName: js.UndefOr[ResourceName]
    var virtualRouterName: js.UndefOr[ResourceName]
  }

  object DeleteRouteInput {
    def apply(
      meshName: js.UndefOr[ResourceName] = js.undefined,
      routeName: js.UndefOr[ResourceName] = js.undefined,
      virtualRouterName: js.UndefOr[ResourceName] = js.undefined): DeleteRouteInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "meshName" -> meshName.map { x => x.asInstanceOf[js.Any] },
        "routeName" -> routeName.map { x => x.asInstanceOf[js.Any] },
        "virtualRouterName" -> virtualRouterName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRouteInput]
    }
  }

  /**
   *
   */
  @js.native
  trait DeleteRouteOutput extends js.Object {
    var route: js.UndefOr[RouteData]
  }

  object DeleteRouteOutput {
    def apply(
      route: js.UndefOr[RouteData] = js.undefined): DeleteRouteOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "route" -> route.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteRouteOutput]
    }
  }

  /**
   *
   */
  @js.native
  trait DeleteVirtualNodeInput extends js.Object {
    var meshName: js.UndefOr[ResourceName]
    var virtualNodeName: js.UndefOr[ResourceName]
  }

  object DeleteVirtualNodeInput {
    def apply(
      meshName: js.UndefOr[ResourceName] = js.undefined,
      virtualNodeName: js.UndefOr[ResourceName] = js.undefined): DeleteVirtualNodeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "meshName" -> meshName.map { x => x.asInstanceOf[js.Any] },
        "virtualNodeName" -> virtualNodeName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVirtualNodeInput]
    }
  }

  /**
   *
   */
  @js.native
  trait DeleteVirtualNodeOutput extends js.Object {
    var virtualNode: js.UndefOr[VirtualNodeData]
  }

  object DeleteVirtualNodeOutput {
    def apply(
      virtualNode: js.UndefOr[VirtualNodeData] = js.undefined): DeleteVirtualNodeOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "virtualNode" -> virtualNode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVirtualNodeOutput]
    }
  }

  /**
   *
   */
  @js.native
  trait DeleteVirtualRouterInput extends js.Object {
    var meshName: js.UndefOr[ResourceName]
    var virtualRouterName: js.UndefOr[ResourceName]
  }

  object DeleteVirtualRouterInput {
    def apply(
      meshName: js.UndefOr[ResourceName] = js.undefined,
      virtualRouterName: js.UndefOr[ResourceName] = js.undefined): DeleteVirtualRouterInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "meshName" -> meshName.map { x => x.asInstanceOf[js.Any] },
        "virtualRouterName" -> virtualRouterName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVirtualRouterInput]
    }
  }

  /**
   *
   */
  @js.native
  trait DeleteVirtualRouterOutput extends js.Object {
    var virtualRouter: js.UndefOr[VirtualRouterData]
  }

  object DeleteVirtualRouterOutput {
    def apply(
      virtualRouter: js.UndefOr[VirtualRouterData] = js.undefined): DeleteVirtualRouterOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "virtualRouter" -> virtualRouter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteVirtualRouterOutput]
    }
  }

  /**
   *
   */
  @js.native
  trait DescribeMeshInput extends js.Object {
    var meshName: js.UndefOr[ResourceName]
  }

  object DescribeMeshInput {
    def apply(
      meshName: js.UndefOr[ResourceName] = js.undefined): DescribeMeshInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "meshName" -> meshName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMeshInput]
    }
  }

  /**
   *
   */
  @js.native
  trait DescribeMeshOutput extends js.Object {
    var mesh: js.UndefOr[MeshData]
  }

  object DescribeMeshOutput {
    def apply(
      mesh: js.UndefOr[MeshData] = js.undefined): DescribeMeshOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "mesh" -> mesh.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeMeshOutput]
    }
  }

  /**
   *
   */
  @js.native
  trait DescribeRouteInput extends js.Object {
    var meshName: js.UndefOr[ResourceName]
    var routeName: js.UndefOr[ResourceName]
    var virtualRouterName: js.UndefOr[ResourceName]
  }

  object DescribeRouteInput {
    def apply(
      meshName: js.UndefOr[ResourceName] = js.undefined,
      routeName: js.UndefOr[ResourceName] = js.undefined,
      virtualRouterName: js.UndefOr[ResourceName] = js.undefined): DescribeRouteInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "meshName" -> meshName.map { x => x.asInstanceOf[js.Any] },
        "routeName" -> routeName.map { x => x.asInstanceOf[js.Any] },
        "virtualRouterName" -> virtualRouterName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRouteInput]
    }
  }

  /**
   *
   */
  @js.native
  trait DescribeRouteOutput extends js.Object {
    var route: js.UndefOr[RouteData]
  }

  object DescribeRouteOutput {
    def apply(
      route: js.UndefOr[RouteData] = js.undefined): DescribeRouteOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "route" -> route.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeRouteOutput]
    }
  }

  /**
   *
   */
  @js.native
  trait DescribeVirtualNodeInput extends js.Object {
    var meshName: js.UndefOr[ResourceName]
    var virtualNodeName: js.UndefOr[ResourceName]
  }

  object DescribeVirtualNodeInput {
    def apply(
      meshName: js.UndefOr[ResourceName] = js.undefined,
      virtualNodeName: js.UndefOr[ResourceName] = js.undefined): DescribeVirtualNodeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "meshName" -> meshName.map { x => x.asInstanceOf[js.Any] },
        "virtualNodeName" -> virtualNodeName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVirtualNodeInput]
    }
  }

  /**
   *
   */
  @js.native
  trait DescribeVirtualNodeOutput extends js.Object {
    var virtualNode: js.UndefOr[VirtualNodeData]
  }

  object DescribeVirtualNodeOutput {
    def apply(
      virtualNode: js.UndefOr[VirtualNodeData] = js.undefined): DescribeVirtualNodeOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "virtualNode" -> virtualNode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVirtualNodeOutput]
    }
  }

  /**
   *
   */
  @js.native
  trait DescribeVirtualRouterInput extends js.Object {
    var meshName: js.UndefOr[ResourceName]
    var virtualRouterName: js.UndefOr[ResourceName]
  }

  object DescribeVirtualRouterInput {
    def apply(
      meshName: js.UndefOr[ResourceName] = js.undefined,
      virtualRouterName: js.UndefOr[ResourceName] = js.undefined): DescribeVirtualRouterInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "meshName" -> meshName.map { x => x.asInstanceOf[js.Any] },
        "virtualRouterName" -> virtualRouterName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVirtualRouterInput]
    }
  }

  /**
   *
   */
  @js.native
  trait DescribeVirtualRouterOutput extends js.Object {
    var virtualRouter: js.UndefOr[VirtualRouterData]
  }

  object DescribeVirtualRouterOutput {
    def apply(
      virtualRouter: js.UndefOr[VirtualRouterData] = js.undefined): DescribeVirtualRouterOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "virtualRouter" -> virtualRouter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DescribeVirtualRouterOutput]
    }
  }

  /**
   * <p>The DNS service discovery information for your virtual node.</p>
   */
  @js.native
  trait DnsServiceDiscovery extends js.Object {
    var serviceName: js.UndefOr[ServiceName]
  }

  object DnsServiceDiscovery {
    def apply(
      serviceName: js.UndefOr[ServiceName] = js.undefined): DnsServiceDiscovery = {
      val _fields = IndexedSeq[(String, js.Any)](
        "serviceName" -> serviceName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DnsServiceDiscovery]
    }
  }

  /**
   * <p>An object representing the health check policy for a virtual node's listener.</p>
   * <note>
   * <p>Listener health checks are not available during the App Mesh preview.</p>
   * </note>
   */
  @js.native
  trait HealthCheckPolicy extends js.Object {
    var intervalMillis: js.UndefOr[DurationMillis]
    var path: js.UndefOr[String]
    var timeoutMillis: js.UndefOr[DurationMillis]
    var healthyThreshold: js.UndefOr[NonNegativeInt]
    var unhealthyThreshold: js.UndefOr[NonNegativeInt]
    var port: js.UndefOr[PortNumber]
    var protocol: js.UndefOr[PortProtocol]
  }

  object HealthCheckPolicy {
    def apply(
      intervalMillis: js.UndefOr[DurationMillis] = js.undefined,
      path: js.UndefOr[String] = js.undefined,
      timeoutMillis: js.UndefOr[DurationMillis] = js.undefined,
      healthyThreshold: js.UndefOr[NonNegativeInt] = js.undefined,
      unhealthyThreshold: js.UndefOr[NonNegativeInt] = js.undefined,
      port: js.UndefOr[PortNumber] = js.undefined,
      protocol: js.UndefOr[PortProtocol] = js.undefined): HealthCheckPolicy = {
      val _fields = IndexedSeq[(String, js.Any)](
        "intervalMillis" -> intervalMillis.map { x => x.asInstanceOf[js.Any] },
        "path" -> path.map { x => x.asInstanceOf[js.Any] },
        "timeoutMillis" -> timeoutMillis.map { x => x.asInstanceOf[js.Any] },
        "healthyThreshold" -> healthyThreshold.map { x => x.asInstanceOf[js.Any] },
        "unhealthyThreshold" -> unhealthyThreshold.map { x => x.asInstanceOf[js.Any] },
        "port" -> port.map { x => x.asInstanceOf[js.Any] },
        "protocol" -> protocol.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HealthCheckPolicy]
    }
  }

  /**
   * <p>An object representing the HTTP routing specification for a route.</p>
   */
  @js.native
  trait HttpRoute extends js.Object {
    var action: js.UndefOr[HttpRouteAction]
    var `match`: js.UndefOr[HttpRouteMatch]
  }

  object HttpRoute {
    def apply(
      action: js.UndefOr[HttpRouteAction] = js.undefined,
      `match`: js.UndefOr[HttpRouteMatch] = js.undefined): HttpRoute = {
      val _fields = IndexedSeq[(String, js.Any)](
        "action" -> action.map { x => x.asInstanceOf[js.Any] },
        "`match`" -> `match`.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HttpRoute]
    }
  }

  /**
   * <p>An object representing the traffic distribution requirements for matched HTTP
   * requests.</p>
   */
  @js.native
  trait HttpRouteAction extends js.Object {
    var weightedTargets: js.UndefOr[WeightedTargets]
  }

  object HttpRouteAction {
    def apply(
      weightedTargets: js.UndefOr[WeightedTargets] = js.undefined): HttpRouteAction = {
      val _fields = IndexedSeq[(String, js.Any)](
        "weightedTargets" -> weightedTargets.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HttpRouteAction]
    }
  }

  /**
   * <p>An object representing the requirements for a route to match HTTP requests for a virtual
   * router.</p>
   */
  @js.native
  trait HttpRouteMatch extends js.Object {
    var prefix: js.UndefOr[String]
  }

  object HttpRouteMatch {
    def apply(
      prefix: js.UndefOr[String] = js.undefined): HttpRouteMatch = {
      val _fields = IndexedSeq[(String, js.Any)](
        "prefix" -> prefix.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HttpRouteMatch]
    }
  }

  /**
   *
   */
  @js.native
  trait ListMeshesInput extends js.Object {
    var limit: js.UndefOr[ListMeshesLimit]
    var nextToken: js.UndefOr[String]
  }

  object ListMeshesInput {
    def apply(
      limit: js.UndefOr[ListMeshesLimit] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined): ListMeshesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListMeshesInput]
    }
  }

  /**
   *
   */
  @js.native
  trait ListMeshesOutput extends js.Object {
    var meshes: js.UndefOr[MeshList]
    var nextToken: js.UndefOr[String]
  }

  object ListMeshesOutput {
    def apply(
      meshes: js.UndefOr[MeshList] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined): ListMeshesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "meshes" -> meshes.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListMeshesOutput]
    }
  }

  /**
   *
   */
  @js.native
  trait ListRoutesInput extends js.Object {
    var limit: js.UndefOr[ListRoutesLimit]
    var meshName: js.UndefOr[ResourceName]
    var nextToken: js.UndefOr[String]
    var virtualRouterName: js.UndefOr[ResourceName]
  }

  object ListRoutesInput {
    def apply(
      limit: js.UndefOr[ListRoutesLimit] = js.undefined,
      meshName: js.UndefOr[ResourceName] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined,
      virtualRouterName: js.UndefOr[ResourceName] = js.undefined): ListRoutesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] },
        "meshName" -> meshName.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "virtualRouterName" -> virtualRouterName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRoutesInput]
    }
  }

  /**
   *
   */
  @js.native
  trait ListRoutesOutput extends js.Object {
    var nextToken: js.UndefOr[String]
    var routes: js.UndefOr[RouteList]
  }

  object ListRoutesOutput {
    def apply(
      nextToken: js.UndefOr[String] = js.undefined,
      routes: js.UndefOr[RouteList] = js.undefined): ListRoutesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "routes" -> routes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListRoutesOutput]
    }
  }

  /**
   *
   */
  @js.native
  trait ListVirtualNodesInput extends js.Object {
    var limit: js.UndefOr[ListVirtualNodesLimit]
    var meshName: js.UndefOr[ResourceName]
    var nextToken: js.UndefOr[String]
  }

  object ListVirtualNodesInput {
    def apply(
      limit: js.UndefOr[ListVirtualNodesLimit] = js.undefined,
      meshName: js.UndefOr[ResourceName] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined): ListVirtualNodesInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] },
        "meshName" -> meshName.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVirtualNodesInput]
    }
  }

  /**
   *
   */
  @js.native
  trait ListVirtualNodesOutput extends js.Object {
    var nextToken: js.UndefOr[String]
    var virtualNodes: js.UndefOr[VirtualNodeList]
  }

  object ListVirtualNodesOutput {
    def apply(
      nextToken: js.UndefOr[String] = js.undefined,
      virtualNodes: js.UndefOr[VirtualNodeList] = js.undefined): ListVirtualNodesOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "virtualNodes" -> virtualNodes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVirtualNodesOutput]
    }
  }

  /**
   *
   */
  @js.native
  trait ListVirtualRoutersInput extends js.Object {
    var limit: js.UndefOr[ListVirtualRoutersLimit]
    var meshName: js.UndefOr[ResourceName]
    var nextToken: js.UndefOr[String]
  }

  object ListVirtualRoutersInput {
    def apply(
      limit: js.UndefOr[ListVirtualRoutersLimit] = js.undefined,
      meshName: js.UndefOr[ResourceName] = js.undefined,
      nextToken: js.UndefOr[String] = js.undefined): ListVirtualRoutersInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "limit" -> limit.map { x => x.asInstanceOf[js.Any] },
        "meshName" -> meshName.map { x => x.asInstanceOf[js.Any] },
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVirtualRoutersInput]
    }
  }

  /**
   *
   */
  @js.native
  trait ListVirtualRoutersOutput extends js.Object {
    var nextToken: js.UndefOr[String]
    var virtualRouters: js.UndefOr[VirtualRouterList]
  }

  object ListVirtualRoutersOutput {
    def apply(
      nextToken: js.UndefOr[String] = js.undefined,
      virtualRouters: js.UndefOr[VirtualRouterList] = js.undefined): ListVirtualRoutersOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "nextToken" -> nextToken.map { x => x.asInstanceOf[js.Any] },
        "virtualRouters" -> virtualRouters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListVirtualRoutersOutput]
    }
  }

  /**
   * <p>An object representing a listener for a virtual node.</p>
   */
  @js.native
  trait Listener extends js.Object {
    var healthCheck: js.UndefOr[HealthCheckPolicy]
    var portMapping: js.UndefOr[PortMapping]
  }

  object Listener {
    def apply(
      healthCheck: js.UndefOr[HealthCheckPolicy] = js.undefined,
      portMapping: js.UndefOr[PortMapping] = js.undefined): Listener = {
      val _fields = IndexedSeq[(String, js.Any)](
        "healthCheck" -> healthCheck.map { x => x.asInstanceOf[js.Any] },
        "portMapping" -> portMapping.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Listener]
    }
  }

  /**
   * <p>An object representing a service mesh returned by a describe operation.</p>
   */
  @js.native
  trait MeshData extends js.Object {
    var meshName: js.UndefOr[ResourceName]
    var metadata: js.UndefOr[ResourceMetadata]
    var status: js.UndefOr[MeshStatus]
  }

  object MeshData {
    def apply(
      meshName: js.UndefOr[ResourceName] = js.undefined,
      metadata: js.UndefOr[ResourceMetadata] = js.undefined,
      status: js.UndefOr[MeshStatus] = js.undefined): MeshData = {
      val _fields = IndexedSeq[(String, js.Any)](
        "meshName" -> meshName.map { x => x.asInstanceOf[js.Any] },
        "metadata" -> metadata.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MeshData]
    }
  }

  /**
   * <p>An object representing a service mesh returned by a list operation.</p>
   */
  @js.native
  trait MeshRef extends js.Object {
    var arn: js.UndefOr[Arn]
    var meshName: js.UndefOr[ResourceName]
  }

  object MeshRef {
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      meshName: js.UndefOr[ResourceName] = js.undefined): MeshRef = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "meshName" -> meshName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MeshRef]
    }
  }

  /**
   * <p>An object representing the status of a service mesh.</p>
   */
  @js.native
  trait MeshStatus extends js.Object {
    var status: js.UndefOr[MeshStatusCode]
  }

  object MeshStatus {
    def apply(
      status: js.UndefOr[MeshStatusCode] = js.undefined): MeshStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[MeshStatus]
    }
  }

  object MeshStatusCodeEnum {
    val ACTIVE = "ACTIVE"
    val DELETED = "DELETED"
    val INACTIVE = "INACTIVE"

    val values = IndexedSeq(ACTIVE, DELETED, INACTIVE)
  }

  /**
   * <p>An object representing a virtual node listener port mapping.</p>
   */
  @js.native
  trait PortMapping extends js.Object {
    var port: js.UndefOr[PortNumber]
    var protocol: js.UndefOr[PortProtocol]
  }

  object PortMapping {
    def apply(
      port: js.UndefOr[PortNumber] = js.undefined,
      protocol: js.UndefOr[PortProtocol] = js.undefined): PortMapping = {
      val _fields = IndexedSeq[(String, js.Any)](
        "port" -> port.map { x => x.asInstanceOf[js.Any] },
        "protocol" -> protocol.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[PortMapping]
    }
  }

  object PortProtocolEnum {
    val http = "http"
    val tcp = "tcp"

    val values = IndexedSeq(http, tcp)
  }

  /**
   * <p>An object representing metadata for a resource.</p>
   */
  @js.native
  trait ResourceMetadata extends js.Object {
    var arn: js.UndefOr[Arn]
    var version: js.UndefOr[Double]
    var createdAt: js.UndefOr[Timestamp]
    var uid: js.UndefOr[String]
    var lastUpdatedAt: js.UndefOr[Timestamp]
  }

  object ResourceMetadata {
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      version: js.UndefOr[Double] = js.undefined,
      createdAt: js.UndefOr[Timestamp] = js.undefined,
      uid: js.UndefOr[String] = js.undefined,
      lastUpdatedAt: js.UndefOr[Timestamp] = js.undefined): ResourceMetadata = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "version" -> version.map { x => x.asInstanceOf[js.Any] },
        "createdAt" -> createdAt.map { x => x.asInstanceOf[js.Any] },
        "uid" -> uid.map { x => x.asInstanceOf[js.Any] },
        "lastUpdatedAt" -> lastUpdatedAt.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ResourceMetadata]
    }
  }

  /**
   * <p>An object representing a route returned by a describe operation.</p>
   */
  @js.native
  trait RouteData extends js.Object {
    var meshName: js.UndefOr[ResourceName]
    var virtualRouterName: js.UndefOr[ResourceName]
    var status: js.UndefOr[RouteStatus]
    var spec: js.UndefOr[RouteSpec]
    var routeName: js.UndefOr[ResourceName]
    var metadata: js.UndefOr[ResourceMetadata]
  }

  object RouteData {
    def apply(
      meshName: js.UndefOr[ResourceName] = js.undefined,
      virtualRouterName: js.UndefOr[ResourceName] = js.undefined,
      status: js.UndefOr[RouteStatus] = js.undefined,
      spec: js.UndefOr[RouteSpec] = js.undefined,
      routeName: js.UndefOr[ResourceName] = js.undefined,
      metadata: js.UndefOr[ResourceMetadata] = js.undefined): RouteData = {
      val _fields = IndexedSeq[(String, js.Any)](
        "meshName" -> meshName.map { x => x.asInstanceOf[js.Any] },
        "virtualRouterName" -> virtualRouterName.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "spec" -> spec.map { x => x.asInstanceOf[js.Any] },
        "routeName" -> routeName.map { x => x.asInstanceOf[js.Any] },
        "metadata" -> metadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RouteData]
    }
  }

  /**
   * <p>An object representing a route returned by a list operation.</p>
   */
  @js.native
  trait RouteRef extends js.Object {
    var arn: js.UndefOr[Arn]
    var meshName: js.UndefOr[ResourceName]
    var routeName: js.UndefOr[ResourceName]
    var virtualRouterName: js.UndefOr[ResourceName]
  }

  object RouteRef {
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      meshName: js.UndefOr[ResourceName] = js.undefined,
      routeName: js.UndefOr[ResourceName] = js.undefined,
      virtualRouterName: js.UndefOr[ResourceName] = js.undefined): RouteRef = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "meshName" -> meshName.map { x => x.asInstanceOf[js.Any] },
        "routeName" -> routeName.map { x => x.asInstanceOf[js.Any] },
        "virtualRouterName" -> virtualRouterName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RouteRef]
    }
  }

  /**
   * <p>An object representing the specification of a route.</p>
   */
  @js.native
  trait RouteSpec extends js.Object {
    var httpRoute: js.UndefOr[HttpRoute]
  }

  object RouteSpec {
    def apply(
      httpRoute: js.UndefOr[HttpRoute] = js.undefined): RouteSpec = {
      val _fields = IndexedSeq[(String, js.Any)](
        "httpRoute" -> httpRoute.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RouteSpec]
    }
  }

  /**
   * <p>An object representing the current status of a route.</p>
   */
  @js.native
  trait RouteStatus extends js.Object {
    var status: js.UndefOr[RouteStatusCode]
  }

  object RouteStatus {
    def apply(
      status: js.UndefOr[RouteStatusCode] = js.undefined): RouteStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RouteStatus]
    }
  }

  object RouteStatusCodeEnum {
    val ACTIVE = "ACTIVE"
    val DELETED = "DELETED"
    val INACTIVE = "INACTIVE"

    val values = IndexedSeq(ACTIVE, DELETED, INACTIVE)
  }

  /**
   * <p>An object representing the service discovery information for a virtual node.</p>
   */
  @js.native
  trait ServiceDiscovery extends js.Object {
    var dns: js.UndefOr[DnsServiceDiscovery]
  }

  object ServiceDiscovery {
    def apply(
      dns: js.UndefOr[DnsServiceDiscovery] = js.undefined): ServiceDiscovery = {
      val _fields = IndexedSeq[(String, js.Any)](
        "dns" -> dns.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServiceDiscovery]
    }
  }

  /**
   *
   */
  @js.native
  trait UpdateRouteInput extends js.Object {
    var meshName: js.UndefOr[ResourceName]
    var virtualRouterName: js.UndefOr[ResourceName]
    var clientToken: js.UndefOr[String]
    var spec: js.UndefOr[RouteSpec]
    var routeName: js.UndefOr[ResourceName]
  }

  object UpdateRouteInput {
    def apply(
      meshName: js.UndefOr[ResourceName] = js.undefined,
      virtualRouterName: js.UndefOr[ResourceName] = js.undefined,
      clientToken: js.UndefOr[String] = js.undefined,
      spec: js.UndefOr[RouteSpec] = js.undefined,
      routeName: js.UndefOr[ResourceName] = js.undefined): UpdateRouteInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "meshName" -> meshName.map { x => x.asInstanceOf[js.Any] },
        "virtualRouterName" -> virtualRouterName.map { x => x.asInstanceOf[js.Any] },
        "clientToken" -> clientToken.map { x => x.asInstanceOf[js.Any] },
        "spec" -> spec.map { x => x.asInstanceOf[js.Any] },
        "routeName" -> routeName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRouteInput]
    }
  }

  /**
   *
   */
  @js.native
  trait UpdateRouteOutput extends js.Object {
    var route: js.UndefOr[RouteData]
  }

  object UpdateRouteOutput {
    def apply(
      route: js.UndefOr[RouteData] = js.undefined): UpdateRouteOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "route" -> route.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateRouteOutput]
    }
  }

  /**
   *
   */
  @js.native
  trait UpdateVirtualNodeInput extends js.Object {
    var clientToken: js.UndefOr[String]
    var meshName: js.UndefOr[ResourceName]
    var spec: js.UndefOr[VirtualNodeSpec]
    var virtualNodeName: js.UndefOr[ResourceName]
  }

  object UpdateVirtualNodeInput {
    def apply(
      clientToken: js.UndefOr[String] = js.undefined,
      meshName: js.UndefOr[ResourceName] = js.undefined,
      spec: js.UndefOr[VirtualNodeSpec] = js.undefined,
      virtualNodeName: js.UndefOr[ResourceName] = js.undefined): UpdateVirtualNodeInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "clientToken" -> clientToken.map { x => x.asInstanceOf[js.Any] },
        "meshName" -> meshName.map { x => x.asInstanceOf[js.Any] },
        "spec" -> spec.map { x => x.asInstanceOf[js.Any] },
        "virtualNodeName" -> virtualNodeName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateVirtualNodeInput]
    }
  }

  /**
   *
   */
  @js.native
  trait UpdateVirtualNodeOutput extends js.Object {
    var virtualNode: js.UndefOr[VirtualNodeData]
  }

  object UpdateVirtualNodeOutput {
    def apply(
      virtualNode: js.UndefOr[VirtualNodeData] = js.undefined): UpdateVirtualNodeOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "virtualNode" -> virtualNode.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateVirtualNodeOutput]
    }
  }

  /**
   *
   */
  @js.native
  trait UpdateVirtualRouterInput extends js.Object {
    var clientToken: js.UndefOr[String]
    var meshName: js.UndefOr[ResourceName]
    var spec: js.UndefOr[VirtualRouterSpec]
    var virtualRouterName: js.UndefOr[ResourceName]
  }

  object UpdateVirtualRouterInput {
    def apply(
      clientToken: js.UndefOr[String] = js.undefined,
      meshName: js.UndefOr[ResourceName] = js.undefined,
      spec: js.UndefOr[VirtualRouterSpec] = js.undefined,
      virtualRouterName: js.UndefOr[ResourceName] = js.undefined): UpdateVirtualRouterInput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "clientToken" -> clientToken.map { x => x.asInstanceOf[js.Any] },
        "meshName" -> meshName.map { x => x.asInstanceOf[js.Any] },
        "spec" -> spec.map { x => x.asInstanceOf[js.Any] },
        "virtualRouterName" -> virtualRouterName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateVirtualRouterInput]
    }
  }

  /**
   *
   */
  @js.native
  trait UpdateVirtualRouterOutput extends js.Object {
    var virtualRouter: js.UndefOr[VirtualRouterData]
  }

  object UpdateVirtualRouterOutput {
    def apply(
      virtualRouter: js.UndefOr[VirtualRouterData] = js.undefined): UpdateVirtualRouterOutput = {
      val _fields = IndexedSeq[(String, js.Any)](
        "virtualRouter" -> virtualRouter.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateVirtualRouterOutput]
    }
  }

  /**
   * <p>An object representing a virtual node returned by a describe operation.</p>
   */
  @js.native
  trait VirtualNodeData extends js.Object {
    var meshName: js.UndefOr[ResourceName]
    var status: js.UndefOr[VirtualNodeStatus]
    var spec: js.UndefOr[VirtualNodeSpec]
    var metadata: js.UndefOr[ResourceMetadata]
    var virtualNodeName: js.UndefOr[ResourceName]
  }

  object VirtualNodeData {
    def apply(
      meshName: js.UndefOr[ResourceName] = js.undefined,
      status: js.UndefOr[VirtualNodeStatus] = js.undefined,
      spec: js.UndefOr[VirtualNodeSpec] = js.undefined,
      metadata: js.UndefOr[ResourceMetadata] = js.undefined,
      virtualNodeName: js.UndefOr[ResourceName] = js.undefined): VirtualNodeData = {
      val _fields = IndexedSeq[(String, js.Any)](
        "meshName" -> meshName.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "spec" -> spec.map { x => x.asInstanceOf[js.Any] },
        "metadata" -> metadata.map { x => x.asInstanceOf[js.Any] },
        "virtualNodeName" -> virtualNodeName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VirtualNodeData]
    }
  }

  /**
   * <p>An object representing a virtual node returned by a list operation.</p>
   */
  @js.native
  trait VirtualNodeRef extends js.Object {
    var arn: js.UndefOr[Arn]
    var meshName: js.UndefOr[ResourceName]
    var virtualNodeName: js.UndefOr[ResourceName]
  }

  object VirtualNodeRef {
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      meshName: js.UndefOr[ResourceName] = js.undefined,
      virtualNodeName: js.UndefOr[ResourceName] = js.undefined): VirtualNodeRef = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "meshName" -> meshName.map { x => x.asInstanceOf[js.Any] },
        "virtualNodeName" -> virtualNodeName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VirtualNodeRef]
    }
  }

  /**
   * <p>An object representing the specification of a virtual node.</p>
   */
  @js.native
  trait VirtualNodeSpec extends js.Object {
    var backends: js.UndefOr[Backends]
    var listeners: js.UndefOr[Listeners]
    var serviceDiscovery: js.UndefOr[ServiceDiscovery]
  }

  object VirtualNodeSpec {
    def apply(
      backends: js.UndefOr[Backends] = js.undefined,
      listeners: js.UndefOr[Listeners] = js.undefined,
      serviceDiscovery: js.UndefOr[ServiceDiscovery] = js.undefined): VirtualNodeSpec = {
      val _fields = IndexedSeq[(String, js.Any)](
        "backends" -> backends.map { x => x.asInstanceOf[js.Any] },
        "listeners" -> listeners.map { x => x.asInstanceOf[js.Any] },
        "serviceDiscovery" -> serviceDiscovery.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VirtualNodeSpec]
    }
  }

  /**
   * <p>An object representing the current status of the virtual node.</p>
   */
  @js.native
  trait VirtualNodeStatus extends js.Object {
    var status: js.UndefOr[VirtualNodeStatusCode]
  }

  object VirtualNodeStatus {
    def apply(
      status: js.UndefOr[VirtualNodeStatusCode] = js.undefined): VirtualNodeStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VirtualNodeStatus]
    }
  }

  object VirtualNodeStatusCodeEnum {
    val ACTIVE = "ACTIVE"
    val DELETED = "DELETED"
    val INACTIVE = "INACTIVE"

    val values = IndexedSeq(ACTIVE, DELETED, INACTIVE)
  }

  /**
   * <p>An object representing a virtual router returned by a describe operation.</p>
   */
  @js.native
  trait VirtualRouterData extends js.Object {
    var meshName: js.UndefOr[ResourceName]
    var virtualRouterName: js.UndefOr[ResourceName]
    var status: js.UndefOr[VirtualRouterStatus]
    var spec: js.UndefOr[VirtualRouterSpec]
    var metadata: js.UndefOr[ResourceMetadata]
  }

  object VirtualRouterData {
    def apply(
      meshName: js.UndefOr[ResourceName] = js.undefined,
      virtualRouterName: js.UndefOr[ResourceName] = js.undefined,
      status: js.UndefOr[VirtualRouterStatus] = js.undefined,
      spec: js.UndefOr[VirtualRouterSpec] = js.undefined,
      metadata: js.UndefOr[ResourceMetadata] = js.undefined): VirtualRouterData = {
      val _fields = IndexedSeq[(String, js.Any)](
        "meshName" -> meshName.map { x => x.asInstanceOf[js.Any] },
        "virtualRouterName" -> virtualRouterName.map { x => x.asInstanceOf[js.Any] },
        "status" -> status.map { x => x.asInstanceOf[js.Any] },
        "spec" -> spec.map { x => x.asInstanceOf[js.Any] },
        "metadata" -> metadata.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VirtualRouterData]
    }
  }

  /**
   * <p>An object representing a virtual router returned by a list operation.</p>
   */
  @js.native
  trait VirtualRouterRef extends js.Object {
    var arn: js.UndefOr[Arn]
    var meshName: js.UndefOr[ResourceName]
    var virtualRouterName: js.UndefOr[ResourceName]
  }

  object VirtualRouterRef {
    def apply(
      arn: js.UndefOr[Arn] = js.undefined,
      meshName: js.UndefOr[ResourceName] = js.undefined,
      virtualRouterName: js.UndefOr[ResourceName] = js.undefined): VirtualRouterRef = {
      val _fields = IndexedSeq[(String, js.Any)](
        "arn" -> arn.map { x => x.asInstanceOf[js.Any] },
        "meshName" -> meshName.map { x => x.asInstanceOf[js.Any] },
        "virtualRouterName" -> virtualRouterName.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VirtualRouterRef]
    }
  }

  /**
   * <p>An object representing the specification of a virtual router.</p>
   */
  @js.native
  trait VirtualRouterSpec extends js.Object {
    var serviceNames: js.UndefOr[ServiceNames]
  }

  object VirtualRouterSpec {
    def apply(
      serviceNames: js.UndefOr[ServiceNames] = js.undefined): VirtualRouterSpec = {
      val _fields = IndexedSeq[(String, js.Any)](
        "serviceNames" -> serviceNames.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VirtualRouterSpec]
    }
  }

  /**
   * <p>An object representing the status of a virtual router. </p>
   */
  @js.native
  trait VirtualRouterStatus extends js.Object {
    var status: js.UndefOr[VirtualRouterStatusCode]
  }

  object VirtualRouterStatus {
    def apply(
      status: js.UndefOr[VirtualRouterStatusCode] = js.undefined): VirtualRouterStatus = {
      val _fields = IndexedSeq[(String, js.Any)](
        "status" -> status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[VirtualRouterStatus]
    }
  }

  object VirtualRouterStatusCodeEnum {
    val ACTIVE = "ACTIVE"
    val DELETED = "DELETED"
    val INACTIVE = "INACTIVE"

    val values = IndexedSeq(ACTIVE, DELETED, INACTIVE)
  }

  /**
   * <p>An object representing a target and its relative weight. Traffic is distributed across
   * targets according to their relative weight. For example, a weighted target with a relative
   * weight of 50 receives five times as much traffic as one with a relative weight of
   * 10.</p>
   */
  @js.native
  trait WeightedTarget extends js.Object {
    var virtualNode: js.UndefOr[ResourceName]
    var weight: js.UndefOr[PercentInt]
  }

  object WeightedTarget {
    def apply(
      virtualNode: js.UndefOr[ResourceName] = js.undefined,
      weight: js.UndefOr[PercentInt] = js.undefined): WeightedTarget = {
      val _fields = IndexedSeq[(String, js.Any)](
        "virtualNode" -> virtualNode.map { x => x.asInstanceOf[js.Any] },
        "weight" -> weight.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[WeightedTarget]
    }
  }
}
