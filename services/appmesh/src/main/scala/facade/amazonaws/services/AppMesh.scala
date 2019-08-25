package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object appmesh {
  type Arn                       = String
  type Backends                  = js.Array[ServiceName]
  type HealthCheckIntervalMillis = Double
  type HealthCheckThreshold      = Int
  type HealthCheckTimeoutMillis  = Double
  type ListMeshesLimit           = Int
  type ListRoutesLimit           = Int
  type ListVirtualNodesLimit     = Int
  type ListVirtualRoutersLimit   = Int
  type Listeners                 = js.Array[Listener]
  type MeshList                  = js.Array[MeshRef]
  type MeshStatusCode            = String
  type PercentInt                = Int
  type PortNumber                = Int
  type PortProtocol              = String
  type ResourceName              = String
  type RouteList                 = js.Array[RouteRef]
  type RouteStatusCode           = String
  type ServiceName               = String
  type ServiceNames              = js.Array[ServiceName]
  type Timestamp                 = js.Date
  type VirtualNodeList           = js.Array[VirtualNodeRef]
  type VirtualNodeStatusCode     = String
  type VirtualRouterList         = js.Array[VirtualRouterRef]
  type VirtualRouterStatusCode   = String
  type WeightedTargets           = js.Array[WeightedTarget]

  implicit final class AppMeshOps(val service: AppMesh) extends AnyVal {

    def createMeshFuture(params: CreateMeshInput): Future[CreateMeshOutput] =
      service.createMesh(params).promise.toFuture
    def createRouteFuture(params: CreateRouteInput): Future[CreateRouteOutput] =
      service.createRoute(params).promise.toFuture
    def createVirtualNodeFuture(params: CreateVirtualNodeInput): Future[CreateVirtualNodeOutput] =
      service.createVirtualNode(params).promise.toFuture
    def createVirtualRouterFuture(params: CreateVirtualRouterInput): Future[CreateVirtualRouterOutput] =
      service.createVirtualRouter(params).promise.toFuture
    def deleteMeshFuture(params: DeleteMeshInput): Future[DeleteMeshOutput] =
      service.deleteMesh(params).promise.toFuture
    def deleteRouteFuture(params: DeleteRouteInput): Future[DeleteRouteOutput] =
      service.deleteRoute(params).promise.toFuture
    def deleteVirtualNodeFuture(params: DeleteVirtualNodeInput): Future[DeleteVirtualNodeOutput] =
      service.deleteVirtualNode(params).promise.toFuture
    def deleteVirtualRouterFuture(params: DeleteVirtualRouterInput): Future[DeleteVirtualRouterOutput] =
      service.deleteVirtualRouter(params).promise.toFuture
    def describeMeshFuture(params: DescribeMeshInput): Future[DescribeMeshOutput] =
      service.describeMesh(params).promise.toFuture
    def describeRouteFuture(params: DescribeRouteInput): Future[DescribeRouteOutput] =
      service.describeRoute(params).promise.toFuture
    def describeVirtualNodeFuture(params: DescribeVirtualNodeInput): Future[DescribeVirtualNodeOutput] =
      service.describeVirtualNode(params).promise.toFuture
    def describeVirtualRouterFuture(params: DescribeVirtualRouterInput): Future[DescribeVirtualRouterOutput] =
      service.describeVirtualRouter(params).promise.toFuture
    def listMeshesFuture(params: ListMeshesInput): Future[ListMeshesOutput] =
      service.listMeshes(params).promise.toFuture
    def listRoutesFuture(params: ListRoutesInput): Future[ListRoutesOutput] =
      service.listRoutes(params).promise.toFuture
    def listVirtualNodesFuture(params: ListVirtualNodesInput): Future[ListVirtualNodesOutput] =
      service.listVirtualNodes(params).promise.toFuture
    def listVirtualRoutersFuture(params: ListVirtualRoutersInput): Future[ListVirtualRoutersOutput] =
      service.listVirtualRouters(params).promise.toFuture
    def updateRouteFuture(params: UpdateRouteInput): Future[UpdateRouteOutput] =
      service.updateRoute(params).promise.toFuture
    def updateVirtualNodeFuture(params: UpdateVirtualNodeInput): Future[UpdateVirtualNodeOutput] =
      service.updateVirtualNode(params).promise.toFuture
    def updateVirtualRouterFuture(params: UpdateVirtualRouterInput): Future[UpdateVirtualRouterOutput] =
      service.updateVirtualRouter(params).promise.toFuture
  }
}

package appmesh {
  @js.native
  @JSImport("aws-sdk", "AppMesh")
  class AppMesh() extends js.Object {
    def this(config: AWSConfig) = this()

    def createMesh(params: CreateMeshInput): Request[CreateMeshOutput]                                  = js.native
    def createRoute(params: CreateRouteInput): Request[CreateRouteOutput]                               = js.native
    def createVirtualNode(params: CreateVirtualNodeInput): Request[CreateVirtualNodeOutput]             = js.native
    def createVirtualRouter(params: CreateVirtualRouterInput): Request[CreateVirtualRouterOutput]       = js.native
    def deleteMesh(params: DeleteMeshInput): Request[DeleteMeshOutput]                                  = js.native
    def deleteRoute(params: DeleteRouteInput): Request[DeleteRouteOutput]                               = js.native
    def deleteVirtualNode(params: DeleteVirtualNodeInput): Request[DeleteVirtualNodeOutput]             = js.native
    def deleteVirtualRouter(params: DeleteVirtualRouterInput): Request[DeleteVirtualRouterOutput]       = js.native
    def describeMesh(params: DescribeMeshInput): Request[DescribeMeshOutput]                            = js.native
    def describeRoute(params: DescribeRouteInput): Request[DescribeRouteOutput]                         = js.native
    def describeVirtualNode(params: DescribeVirtualNodeInput): Request[DescribeVirtualNodeOutput]       = js.native
    def describeVirtualRouter(params: DescribeVirtualRouterInput): Request[DescribeVirtualRouterOutput] = js.native
    def listMeshes(params: ListMeshesInput): Request[ListMeshesOutput]                                  = js.native
    def listRoutes(params: ListRoutesInput): Request[ListRoutesOutput]                                  = js.native
    def listVirtualNodes(params: ListVirtualNodesInput): Request[ListVirtualNodesOutput]                = js.native
    def listVirtualRouters(params: ListVirtualRoutersInput): Request[ListVirtualRoutersOutput]          = js.native
    def updateRoute(params: UpdateRouteInput): Request[UpdateRouteOutput]                               = js.native
    def updateVirtualNode(params: UpdateVirtualNodeInput): Request[UpdateVirtualNodeOutput]             = js.native
    def updateVirtualRouter(params: UpdateVirtualRouterInput): Request[UpdateVirtualRouterOutput]       = js.native
  }

  /**
    *
    */
  @js.native
  trait CreateMeshInput extends js.Object {
    var meshName: ResourceName
    var clientToken: js.UndefOr[String]
  }

  object CreateMeshInput {
    def apply(
        meshName: ResourceName,
        clientToken: js.UndefOr[String] = js.undefined
    ): CreateMeshInput = {
      val __obj = js.Dictionary[js.Any](
        "meshName" -> meshName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.update("clientToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMeshInput]
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
        mesh: js.UndefOr[MeshData] = js.undefined
    ): CreateMeshOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      mesh.foreach(__v => __obj.update("mesh", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMeshOutput]
    }
  }

  /**
    *
    */
  @js.native
  trait CreateRouteInput extends js.Object {
    var meshName: ResourceName
    var routeName: ResourceName
    var spec: RouteSpec
    var virtualRouterName: ResourceName
    var clientToken: js.UndefOr[String]
  }

  object CreateRouteInput {
    def apply(
        meshName: ResourceName,
        routeName: ResourceName,
        spec: RouteSpec,
        virtualRouterName: ResourceName,
        clientToken: js.UndefOr[String] = js.undefined
    ): CreateRouteInput = {
      val __obj = js.Dictionary[js.Any](
        "meshName"          -> meshName.asInstanceOf[js.Any],
        "routeName"         -> routeName.asInstanceOf[js.Any],
        "spec"              -> spec.asInstanceOf[js.Any],
        "virtualRouterName" -> virtualRouterName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.update("clientToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRouteInput]
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
        route: js.UndefOr[RouteData] = js.undefined
    ): CreateRouteOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      route.foreach(__v => __obj.update("route", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRouteOutput]
    }
  }

  /**
    *
    */
  @js.native
  trait CreateVirtualNodeInput extends js.Object {
    var meshName: ResourceName
    var spec: VirtualNodeSpec
    var virtualNodeName: ResourceName
    var clientToken: js.UndefOr[String]
  }

  object CreateVirtualNodeInput {
    def apply(
        meshName: ResourceName,
        spec: VirtualNodeSpec,
        virtualNodeName: ResourceName,
        clientToken: js.UndefOr[String] = js.undefined
    ): CreateVirtualNodeInput = {
      val __obj = js.Dictionary[js.Any](
        "meshName"        -> meshName.asInstanceOf[js.Any],
        "spec"            -> spec.asInstanceOf[js.Any],
        "virtualNodeName" -> virtualNodeName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.update("clientToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVirtualNodeInput]
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
        virtualNode: js.UndefOr[VirtualNodeData] = js.undefined
    ): CreateVirtualNodeOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      virtualNode.foreach(__v => __obj.update("virtualNode", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVirtualNodeOutput]
    }
  }

  /**
    *
    */
  @js.native
  trait CreateVirtualRouterInput extends js.Object {
    var meshName: ResourceName
    var spec: VirtualRouterSpec
    var virtualRouterName: ResourceName
    var clientToken: js.UndefOr[String]
  }

  object CreateVirtualRouterInput {
    def apply(
        meshName: ResourceName,
        spec: VirtualRouterSpec,
        virtualRouterName: ResourceName,
        clientToken: js.UndefOr[String] = js.undefined
    ): CreateVirtualRouterInput = {
      val __obj = js.Dictionary[js.Any](
        "meshName"          -> meshName.asInstanceOf[js.Any],
        "spec"              -> spec.asInstanceOf[js.Any],
        "virtualRouterName" -> virtualRouterName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.update("clientToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVirtualRouterInput]
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
        virtualRouter: js.UndefOr[VirtualRouterData] = js.undefined
    ): CreateVirtualRouterOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      virtualRouter.foreach(__v => __obj.update("virtualRouter", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVirtualRouterOutput]
    }
  }

  /**
    *
    */
  @js.native
  trait DeleteMeshInput extends js.Object {
    var meshName: ResourceName
  }

  object DeleteMeshInput {
    def apply(
        meshName: ResourceName
    ): DeleteMeshInput = {
      val __obj = js.Dictionary[js.Any](
        "meshName" -> meshName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteMeshInput]
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
        mesh: js.UndefOr[MeshData] = js.undefined
    ): DeleteMeshOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      mesh.foreach(__v => __obj.update("mesh", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteMeshOutput]
    }
  }

  /**
    *
    */
  @js.native
  trait DeleteRouteInput extends js.Object {
    var meshName: ResourceName
    var routeName: ResourceName
    var virtualRouterName: ResourceName
  }

  object DeleteRouteInput {
    def apply(
        meshName: ResourceName,
        routeName: ResourceName,
        virtualRouterName: ResourceName
    ): DeleteRouteInput = {
      val __obj = js.Dictionary[js.Any](
        "meshName"          -> meshName.asInstanceOf[js.Any],
        "routeName"         -> routeName.asInstanceOf[js.Any],
        "virtualRouterName" -> virtualRouterName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteRouteInput]
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
        route: js.UndefOr[RouteData] = js.undefined
    ): DeleteRouteOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      route.foreach(__v => __obj.update("route", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRouteOutput]
    }
  }

  /**
    *
    */
  @js.native
  trait DeleteVirtualNodeInput extends js.Object {
    var meshName: ResourceName
    var virtualNodeName: ResourceName
  }

  object DeleteVirtualNodeInput {
    def apply(
        meshName: ResourceName,
        virtualNodeName: ResourceName
    ): DeleteVirtualNodeInput = {
      val __obj = js.Dictionary[js.Any](
        "meshName"        -> meshName.asInstanceOf[js.Any],
        "virtualNodeName" -> virtualNodeName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteVirtualNodeInput]
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
        virtualNode: js.UndefOr[VirtualNodeData] = js.undefined
    ): DeleteVirtualNodeOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      virtualNode.foreach(__v => __obj.update("virtualNode", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteVirtualNodeOutput]
    }
  }

  /**
    *
    */
  @js.native
  trait DeleteVirtualRouterInput extends js.Object {
    var meshName: ResourceName
    var virtualRouterName: ResourceName
  }

  object DeleteVirtualRouterInput {
    def apply(
        meshName: ResourceName,
        virtualRouterName: ResourceName
    ): DeleteVirtualRouterInput = {
      val __obj = js.Dictionary[js.Any](
        "meshName"          -> meshName.asInstanceOf[js.Any],
        "virtualRouterName" -> virtualRouterName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteVirtualRouterInput]
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
        virtualRouter: js.UndefOr[VirtualRouterData] = js.undefined
    ): DeleteVirtualRouterOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      virtualRouter.foreach(__v => __obj.update("virtualRouter", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteVirtualRouterOutput]
    }
  }

  /**
    *
    */
  @js.native
  trait DescribeMeshInput extends js.Object {
    var meshName: ResourceName
  }

  object DescribeMeshInput {
    def apply(
        meshName: ResourceName
    ): DescribeMeshInput = {
      val __obj = js.Dictionary[js.Any](
        "meshName" -> meshName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeMeshInput]
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
        mesh: js.UndefOr[MeshData] = js.undefined
    ): DescribeMeshOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      mesh.foreach(__v => __obj.update("mesh", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMeshOutput]
    }
  }

  /**
    *
    */
  @js.native
  trait DescribeRouteInput extends js.Object {
    var meshName: ResourceName
    var routeName: ResourceName
    var virtualRouterName: ResourceName
  }

  object DescribeRouteInput {
    def apply(
        meshName: ResourceName,
        routeName: ResourceName,
        virtualRouterName: ResourceName
    ): DescribeRouteInput = {
      val __obj = js.Dictionary[js.Any](
        "meshName"          -> meshName.asInstanceOf[js.Any],
        "routeName"         -> routeName.asInstanceOf[js.Any],
        "virtualRouterName" -> virtualRouterName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeRouteInput]
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
        route: js.UndefOr[RouteData] = js.undefined
    ): DescribeRouteOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      route.foreach(__v => __obj.update("route", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRouteOutput]
    }
  }

  /**
    *
    */
  @js.native
  trait DescribeVirtualNodeInput extends js.Object {
    var meshName: ResourceName
    var virtualNodeName: ResourceName
  }

  object DescribeVirtualNodeInput {
    def apply(
        meshName: ResourceName,
        virtualNodeName: ResourceName
    ): DescribeVirtualNodeInput = {
      val __obj = js.Dictionary[js.Any](
        "meshName"        -> meshName.asInstanceOf[js.Any],
        "virtualNodeName" -> virtualNodeName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeVirtualNodeInput]
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
        virtualNode: js.UndefOr[VirtualNodeData] = js.undefined
    ): DescribeVirtualNodeOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      virtualNode.foreach(__v => __obj.update("virtualNode", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeVirtualNodeOutput]
    }
  }

  /**
    *
    */
  @js.native
  trait DescribeVirtualRouterInput extends js.Object {
    var meshName: ResourceName
    var virtualRouterName: ResourceName
  }

  object DescribeVirtualRouterInput {
    def apply(
        meshName: ResourceName,
        virtualRouterName: ResourceName
    ): DescribeVirtualRouterInput = {
      val __obj = js.Dictionary[js.Any](
        "meshName"          -> meshName.asInstanceOf[js.Any],
        "virtualRouterName" -> virtualRouterName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeVirtualRouterInput]
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
        virtualRouter: js.UndefOr[VirtualRouterData] = js.undefined
    ): DescribeVirtualRouterOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      virtualRouter.foreach(__v => __obj.update("virtualRouter", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeVirtualRouterOutput]
    }
  }

  /**
    * The DNS service discovery information for your virtual node.
    */
  @js.native
  trait DnsServiceDiscovery extends js.Object {
    var serviceName: js.UndefOr[ServiceName]
  }

  object DnsServiceDiscovery {
    def apply(
        serviceName: js.UndefOr[ServiceName] = js.undefined
    ): DnsServiceDiscovery = {
      val __obj = js.Dictionary.empty[js.Any]
      serviceName.foreach(__v => __obj.update("serviceName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DnsServiceDiscovery]
    }
  }

  /**
    * An object representing the health check policy for a virtual node's listener.
    */
  @js.native
  trait HealthCheckPolicy extends js.Object {
    var healthyThreshold: HealthCheckThreshold
    var intervalMillis: HealthCheckIntervalMillis
    var protocol: PortProtocol
    var timeoutMillis: HealthCheckTimeoutMillis
    var unhealthyThreshold: HealthCheckThreshold
    var path: js.UndefOr[String]
    var port: js.UndefOr[PortNumber]
  }

  object HealthCheckPolicy {
    def apply(
        healthyThreshold: HealthCheckThreshold,
        intervalMillis: HealthCheckIntervalMillis,
        protocol: PortProtocol,
        timeoutMillis: HealthCheckTimeoutMillis,
        unhealthyThreshold: HealthCheckThreshold,
        path: js.UndefOr[String] = js.undefined,
        port: js.UndefOr[PortNumber] = js.undefined
    ): HealthCheckPolicy = {
      val __obj = js.Dictionary[js.Any](
        "healthyThreshold"   -> healthyThreshold.asInstanceOf[js.Any],
        "intervalMillis"     -> intervalMillis.asInstanceOf[js.Any],
        "protocol"           -> protocol.asInstanceOf[js.Any],
        "timeoutMillis"      -> timeoutMillis.asInstanceOf[js.Any],
        "unhealthyThreshold" -> unhealthyThreshold.asInstanceOf[js.Any]
      )

      path.foreach(__v => __obj.update("path", __v.asInstanceOf[js.Any]))
      port.foreach(__v => __obj.update("port", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HealthCheckPolicy]
    }
  }

  /**
    * An object representing the HTTP routing specification for a route.
    */
  @js.native
  trait HttpRoute extends js.Object {
    var action: js.UndefOr[HttpRouteAction]
    var `match`: js.UndefOr[HttpRouteMatch]
  }

  object HttpRoute {
    def apply(
        action: js.UndefOr[HttpRouteAction] = js.undefined,
        `match`: js.UndefOr[HttpRouteMatch] = js.undefined
    ): HttpRoute = {
      val __obj = js.Dictionary.empty[js.Any]
      action.foreach(__v => __obj.update("action", __v.asInstanceOf[js.Any]))
      `match`.foreach(__v => __obj.update("match", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HttpRoute]
    }
  }

  /**
    * <p>An object representing the traffic distribution requirements for matched HTTP
    *          requests.</p>
    */
  @js.native
  trait HttpRouteAction extends js.Object {
    var weightedTargets: js.UndefOr[WeightedTargets]
  }

  object HttpRouteAction {
    def apply(
        weightedTargets: js.UndefOr[WeightedTargets] = js.undefined
    ): HttpRouteAction = {
      val __obj = js.Dictionary.empty[js.Any]
      weightedTargets.foreach(__v => __obj.update("weightedTargets", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HttpRouteAction]
    }
  }

  /**
    * <p>An object representing the requirements for a route to match HTTP requests for a virtual
    *          router.</p>
    */
  @js.native
  trait HttpRouteMatch extends js.Object {
    var prefix: js.UndefOr[String]
  }

  object HttpRouteMatch {
    def apply(
        prefix: js.UndefOr[String] = js.undefined
    ): HttpRouteMatch = {
      val __obj = js.Dictionary.empty[js.Any]
      prefix.foreach(__v => __obj.update("prefix", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HttpRouteMatch]
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
        nextToken: js.UndefOr[String] = js.undefined
    ): ListMeshesInput = {
      val __obj = js.Dictionary.empty[js.Any]
      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMeshesInput]
    }
  }

  /**
    *
    */
  @js.native
  trait ListMeshesOutput extends js.Object {
    var meshes: MeshList
    var nextToken: js.UndefOr[String]
  }

  object ListMeshesOutput {
    def apply(
        meshes: MeshList,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListMeshesOutput = {
      val __obj = js.Dictionary[js.Any](
        "meshes" -> meshes.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListMeshesOutput]
    }
  }

  /**
    *
    */
  @js.native
  trait ListRoutesInput extends js.Object {
    var meshName: ResourceName
    var virtualRouterName: ResourceName
    var limit: js.UndefOr[ListRoutesLimit]
    var nextToken: js.UndefOr[String]
  }

  object ListRoutesInput {
    def apply(
        meshName: ResourceName,
        virtualRouterName: ResourceName,
        limit: js.UndefOr[ListRoutesLimit] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListRoutesInput = {
      val __obj = js.Dictionary[js.Any](
        "meshName"          -> meshName.asInstanceOf[js.Any],
        "virtualRouterName" -> virtualRouterName.asInstanceOf[js.Any]
      )

      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRoutesInput]
    }
  }

  /**
    *
    */
  @js.native
  trait ListRoutesOutput extends js.Object {
    var routes: RouteList
    var nextToken: js.UndefOr[String]
  }

  object ListRoutesOutput {
    def apply(
        routes: RouteList,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListRoutesOutput = {
      val __obj = js.Dictionary[js.Any](
        "routes" -> routes.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRoutesOutput]
    }
  }

  /**
    *
    */
  @js.native
  trait ListVirtualNodesInput extends js.Object {
    var meshName: ResourceName
    var limit: js.UndefOr[ListVirtualNodesLimit]
    var nextToken: js.UndefOr[String]
  }

  object ListVirtualNodesInput {
    def apply(
        meshName: ResourceName,
        limit: js.UndefOr[ListVirtualNodesLimit] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListVirtualNodesInput = {
      val __obj = js.Dictionary[js.Any](
        "meshName" -> meshName.asInstanceOf[js.Any]
      )

      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVirtualNodesInput]
    }
  }

  /**
    *
    */
  @js.native
  trait ListVirtualNodesOutput extends js.Object {
    var virtualNodes: VirtualNodeList
    var nextToken: js.UndefOr[String]
  }

  object ListVirtualNodesOutput {
    def apply(
        virtualNodes: VirtualNodeList,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListVirtualNodesOutput = {
      val __obj = js.Dictionary[js.Any](
        "virtualNodes" -> virtualNodes.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVirtualNodesOutput]
    }
  }

  /**
    *
    */
  @js.native
  trait ListVirtualRoutersInput extends js.Object {
    var meshName: ResourceName
    var limit: js.UndefOr[ListVirtualRoutersLimit]
    var nextToken: js.UndefOr[String]
  }

  object ListVirtualRoutersInput {
    def apply(
        meshName: ResourceName,
        limit: js.UndefOr[ListVirtualRoutersLimit] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListVirtualRoutersInput = {
      val __obj = js.Dictionary[js.Any](
        "meshName" -> meshName.asInstanceOf[js.Any]
      )

      limit.foreach(__v => __obj.update("limit", __v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVirtualRoutersInput]
    }
  }

  /**
    *
    */
  @js.native
  trait ListVirtualRoutersOutput extends js.Object {
    var virtualRouters: VirtualRouterList
    var nextToken: js.UndefOr[String]
  }

  object ListVirtualRoutersOutput {
    def apply(
        virtualRouters: VirtualRouterList,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListVirtualRoutersOutput = {
      val __obj = js.Dictionary[js.Any](
        "virtualRouters" -> virtualRouters.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.update("nextToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVirtualRoutersOutput]
    }
  }

  /**
    * An object representing a listener for a virtual node.
    */
  @js.native
  trait Listener extends js.Object {
    var healthCheck: js.UndefOr[HealthCheckPolicy]
    var portMapping: js.UndefOr[PortMapping]
  }

  object Listener {
    def apply(
        healthCheck: js.UndefOr[HealthCheckPolicy] = js.undefined,
        portMapping: js.UndefOr[PortMapping] = js.undefined
    ): Listener = {
      val __obj = js.Dictionary.empty[js.Any]
      healthCheck.foreach(__v => __obj.update("healthCheck", __v.asInstanceOf[js.Any]))
      portMapping.foreach(__v => __obj.update("portMapping", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Listener]
    }
  }

  /**
    * An object representing a service mesh returned by a describe operation.
    */
  @js.native
  trait MeshData extends js.Object {
    var meshName: ResourceName
    var metadata: ResourceMetadata
    var status: js.UndefOr[MeshStatus]
  }

  object MeshData {
    def apply(
        meshName: ResourceName,
        metadata: ResourceMetadata,
        status: js.UndefOr[MeshStatus] = js.undefined
    ): MeshData = {
      val __obj = js.Dictionary[js.Any](
        "meshName" -> meshName.asInstanceOf[js.Any],
        "metadata" -> metadata.asInstanceOf[js.Any]
      )

      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MeshData]
    }
  }

  /**
    * An object representing a service mesh returned by a list operation.
    */
  @js.native
  trait MeshRef extends js.Object {
    var arn: js.UndefOr[Arn]
    var meshName: js.UndefOr[ResourceName]
  }

  object MeshRef {
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        meshName: js.UndefOr[ResourceName] = js.undefined
    ): MeshRef = {
      val __obj = js.Dictionary.empty[js.Any]
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      meshName.foreach(__v => __obj.update("meshName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MeshRef]
    }
  }

  /**
    * An object representing the status of a service mesh.
    */
  @js.native
  trait MeshStatus extends js.Object {
    var status: js.UndefOr[MeshStatusCode]
  }

  object MeshStatus {
    def apply(
        status: js.UndefOr[MeshStatusCode] = js.undefined
    ): MeshStatus = {
      val __obj = js.Dictionary.empty[js.Any]
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MeshStatus]
    }
  }

  object MeshStatusCodeEnum {
    val ACTIVE   = "ACTIVE"
    val DELETED  = "DELETED"
    val INACTIVE = "INACTIVE"

    val values = IndexedSeq(ACTIVE, DELETED, INACTIVE)
  }

  /**
    * An object representing a virtual node listener port mapping.
    */
  @js.native
  trait PortMapping extends js.Object {
    var port: js.UndefOr[PortNumber]
    var protocol: js.UndefOr[PortProtocol]
  }

  object PortMapping {
    def apply(
        port: js.UndefOr[PortNumber] = js.undefined,
        protocol: js.UndefOr[PortProtocol] = js.undefined
    ): PortMapping = {
      val __obj = js.Dictionary.empty[js.Any]
      port.foreach(__v => __obj.update("port", __v.asInstanceOf[js.Any]))
      protocol.foreach(__v => __obj.update("protocol", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[PortMapping]
    }
  }

  object PortProtocolEnum {
    val http = "http"
    val tcp  = "tcp"

    val values = IndexedSeq(http, tcp)
  }

  /**
    * An object representing metadata for a resource.
    */
  @js.native
  trait ResourceMetadata extends js.Object {
    var arn: js.UndefOr[Arn]
    var createdAt: js.UndefOr[Timestamp]
    var lastUpdatedAt: js.UndefOr[Timestamp]
    var uid: js.UndefOr[String]
    var version: js.UndefOr[Double]
  }

  object ResourceMetadata {
    def apply(
        arn: js.UndefOr[Arn] = js.undefined,
        createdAt: js.UndefOr[Timestamp] = js.undefined,
        lastUpdatedAt: js.UndefOr[Timestamp] = js.undefined,
        uid: js.UndefOr[String] = js.undefined,
        version: js.UndefOr[Double] = js.undefined
    ): ResourceMetadata = {
      val __obj = js.Dictionary.empty[js.Any]
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      createdAt.foreach(__v => __obj.update("createdAt", __v.asInstanceOf[js.Any]))
      lastUpdatedAt.foreach(__v => __obj.update("lastUpdatedAt", __v.asInstanceOf[js.Any]))
      uid.foreach(__v => __obj.update("uid", __v.asInstanceOf[js.Any]))
      version.foreach(__v => __obj.update("version", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ResourceMetadata]
    }
  }

  /**
    * An object representing a route returned by a describe operation.
    */
  @js.native
  trait RouteData extends js.Object {
    var meshName: ResourceName
    var routeName: ResourceName
    var virtualRouterName: ResourceName
    var metadata: js.UndefOr[ResourceMetadata]
    var spec: js.UndefOr[RouteSpec]
    var status: js.UndefOr[RouteStatus]
  }

  object RouteData {
    def apply(
        meshName: ResourceName,
        routeName: ResourceName,
        virtualRouterName: ResourceName,
        metadata: js.UndefOr[ResourceMetadata] = js.undefined,
        spec: js.UndefOr[RouteSpec] = js.undefined,
        status: js.UndefOr[RouteStatus] = js.undefined
    ): RouteData = {
      val __obj = js.Dictionary[js.Any](
        "meshName"          -> meshName.asInstanceOf[js.Any],
        "routeName"         -> routeName.asInstanceOf[js.Any],
        "virtualRouterName" -> virtualRouterName.asInstanceOf[js.Any]
      )

      metadata.foreach(__v => __obj.update("metadata", __v.asInstanceOf[js.Any]))
      spec.foreach(__v => __obj.update("spec", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RouteData]
    }
  }

  /**
    * An object representing a route returned by a list operation.
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
        virtualRouterName: js.UndefOr[ResourceName] = js.undefined
    ): RouteRef = {
      val __obj = js.Dictionary.empty[js.Any]
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      meshName.foreach(__v => __obj.update("meshName", __v.asInstanceOf[js.Any]))
      routeName.foreach(__v => __obj.update("routeName", __v.asInstanceOf[js.Any]))
      virtualRouterName.foreach(__v => __obj.update("virtualRouterName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RouteRef]
    }
  }

  /**
    * An object representing the specification of a route.
    */
  @js.native
  trait RouteSpec extends js.Object {
    var httpRoute: js.UndefOr[HttpRoute]
  }

  object RouteSpec {
    def apply(
        httpRoute: js.UndefOr[HttpRoute] = js.undefined
    ): RouteSpec = {
      val __obj = js.Dictionary.empty[js.Any]
      httpRoute.foreach(__v => __obj.update("httpRoute", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RouteSpec]
    }
  }

  /**
    * An object representing the current status of a route.
    */
  @js.native
  trait RouteStatus extends js.Object {
    var status: js.UndefOr[RouteStatusCode]
  }

  object RouteStatus {
    def apply(
        status: js.UndefOr[RouteStatusCode] = js.undefined
    ): RouteStatus = {
      val __obj = js.Dictionary.empty[js.Any]
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RouteStatus]
    }
  }

  object RouteStatusCodeEnum {
    val ACTIVE   = "ACTIVE"
    val DELETED  = "DELETED"
    val INACTIVE = "INACTIVE"

    val values = IndexedSeq(ACTIVE, DELETED, INACTIVE)
  }

  /**
    * An object representing the service discovery information for a virtual node.
    */
  @js.native
  trait ServiceDiscovery extends js.Object {
    var dns: js.UndefOr[DnsServiceDiscovery]
  }

  object ServiceDiscovery {
    def apply(
        dns: js.UndefOr[DnsServiceDiscovery] = js.undefined
    ): ServiceDiscovery = {
      val __obj = js.Dictionary.empty[js.Any]
      dns.foreach(__v => __obj.update("dns", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceDiscovery]
    }
  }

  /**
    *
    */
  @js.native
  trait UpdateRouteInput extends js.Object {
    var meshName: ResourceName
    var routeName: ResourceName
    var spec: RouteSpec
    var virtualRouterName: ResourceName
    var clientToken: js.UndefOr[String]
  }

  object UpdateRouteInput {
    def apply(
        meshName: ResourceName,
        routeName: ResourceName,
        spec: RouteSpec,
        virtualRouterName: ResourceName,
        clientToken: js.UndefOr[String] = js.undefined
    ): UpdateRouteInput = {
      val __obj = js.Dictionary[js.Any](
        "meshName"          -> meshName.asInstanceOf[js.Any],
        "routeName"         -> routeName.asInstanceOf[js.Any],
        "spec"              -> spec.asInstanceOf[js.Any],
        "virtualRouterName" -> virtualRouterName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.update("clientToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRouteInput]
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
        route: js.UndefOr[RouteData] = js.undefined
    ): UpdateRouteOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      route.foreach(__v => __obj.update("route", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRouteOutput]
    }
  }

  /**
    *
    */
  @js.native
  trait UpdateVirtualNodeInput extends js.Object {
    var meshName: ResourceName
    var spec: VirtualNodeSpec
    var virtualNodeName: ResourceName
    var clientToken: js.UndefOr[String]
  }

  object UpdateVirtualNodeInput {
    def apply(
        meshName: ResourceName,
        spec: VirtualNodeSpec,
        virtualNodeName: ResourceName,
        clientToken: js.UndefOr[String] = js.undefined
    ): UpdateVirtualNodeInput = {
      val __obj = js.Dictionary[js.Any](
        "meshName"        -> meshName.asInstanceOf[js.Any],
        "spec"            -> spec.asInstanceOf[js.Any],
        "virtualNodeName" -> virtualNodeName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.update("clientToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVirtualNodeInput]
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
        virtualNode: js.UndefOr[VirtualNodeData] = js.undefined
    ): UpdateVirtualNodeOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      virtualNode.foreach(__v => __obj.update("virtualNode", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVirtualNodeOutput]
    }
  }

  /**
    *
    */
  @js.native
  trait UpdateVirtualRouterInput extends js.Object {
    var meshName: ResourceName
    var spec: VirtualRouterSpec
    var virtualRouterName: ResourceName
    var clientToken: js.UndefOr[String]
  }

  object UpdateVirtualRouterInput {
    def apply(
        meshName: ResourceName,
        spec: VirtualRouterSpec,
        virtualRouterName: ResourceName,
        clientToken: js.UndefOr[String] = js.undefined
    ): UpdateVirtualRouterInput = {
      val __obj = js.Dictionary[js.Any](
        "meshName"          -> meshName.asInstanceOf[js.Any],
        "spec"              -> spec.asInstanceOf[js.Any],
        "virtualRouterName" -> virtualRouterName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.update("clientToken", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVirtualRouterInput]
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
        virtualRouter: js.UndefOr[VirtualRouterData] = js.undefined
    ): UpdateVirtualRouterOutput = {
      val __obj = js.Dictionary.empty[js.Any]
      virtualRouter.foreach(__v => __obj.update("virtualRouter", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVirtualRouterOutput]
    }
  }

  /**
    * An object representing a virtual node returned by a describe operation.
    */
  @js.native
  trait VirtualNodeData extends js.Object {
    var meshName: ResourceName
    var virtualNodeName: ResourceName
    var metadata: js.UndefOr[ResourceMetadata]
    var spec: js.UndefOr[VirtualNodeSpec]
    var status: js.UndefOr[VirtualNodeStatus]
  }

  object VirtualNodeData {
    def apply(
        meshName: ResourceName,
        virtualNodeName: ResourceName,
        metadata: js.UndefOr[ResourceMetadata] = js.undefined,
        spec: js.UndefOr[VirtualNodeSpec] = js.undefined,
        status: js.UndefOr[VirtualNodeStatus] = js.undefined
    ): VirtualNodeData = {
      val __obj = js.Dictionary[js.Any](
        "meshName"        -> meshName.asInstanceOf[js.Any],
        "virtualNodeName" -> virtualNodeName.asInstanceOf[js.Any]
      )

      metadata.foreach(__v => __obj.update("metadata", __v.asInstanceOf[js.Any]))
      spec.foreach(__v => __obj.update("spec", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualNodeData]
    }
  }

  /**
    * An object representing a virtual node returned by a list operation.
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
        virtualNodeName: js.UndefOr[ResourceName] = js.undefined
    ): VirtualNodeRef = {
      val __obj = js.Dictionary.empty[js.Any]
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      meshName.foreach(__v => __obj.update("meshName", __v.asInstanceOf[js.Any]))
      virtualNodeName.foreach(__v => __obj.update("virtualNodeName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualNodeRef]
    }
  }

  /**
    * An object representing the specification of a virtual node.
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
        serviceDiscovery: js.UndefOr[ServiceDiscovery] = js.undefined
    ): VirtualNodeSpec = {
      val __obj = js.Dictionary.empty[js.Any]
      backends.foreach(__v => __obj.update("backends", __v.asInstanceOf[js.Any]))
      listeners.foreach(__v => __obj.update("listeners", __v.asInstanceOf[js.Any]))
      serviceDiscovery.foreach(__v => __obj.update("serviceDiscovery", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualNodeSpec]
    }
  }

  /**
    * An object representing the current status of the virtual node.
    */
  @js.native
  trait VirtualNodeStatus extends js.Object {
    var status: js.UndefOr[VirtualNodeStatusCode]
  }

  object VirtualNodeStatus {
    def apply(
        status: js.UndefOr[VirtualNodeStatusCode] = js.undefined
    ): VirtualNodeStatus = {
      val __obj = js.Dictionary.empty[js.Any]
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualNodeStatus]
    }
  }

  object VirtualNodeStatusCodeEnum {
    val ACTIVE   = "ACTIVE"
    val DELETED  = "DELETED"
    val INACTIVE = "INACTIVE"

    val values = IndexedSeq(ACTIVE, DELETED, INACTIVE)
  }

  /**
    * An object representing a virtual router returned by a describe operation.
    */
  @js.native
  trait VirtualRouterData extends js.Object {
    var meshName: ResourceName
    var virtualRouterName: ResourceName
    var metadata: js.UndefOr[ResourceMetadata]
    var spec: js.UndefOr[VirtualRouterSpec]
    var status: js.UndefOr[VirtualRouterStatus]
  }

  object VirtualRouterData {
    def apply(
        meshName: ResourceName,
        virtualRouterName: ResourceName,
        metadata: js.UndefOr[ResourceMetadata] = js.undefined,
        spec: js.UndefOr[VirtualRouterSpec] = js.undefined,
        status: js.UndefOr[VirtualRouterStatus] = js.undefined
    ): VirtualRouterData = {
      val __obj = js.Dictionary[js.Any](
        "meshName"          -> meshName.asInstanceOf[js.Any],
        "virtualRouterName" -> virtualRouterName.asInstanceOf[js.Any]
      )

      metadata.foreach(__v => __obj.update("metadata", __v.asInstanceOf[js.Any]))
      spec.foreach(__v => __obj.update("spec", __v.asInstanceOf[js.Any]))
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualRouterData]
    }
  }

  /**
    * An object representing a virtual router returned by a list operation.
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
        virtualRouterName: js.UndefOr[ResourceName] = js.undefined
    ): VirtualRouterRef = {
      val __obj = js.Dictionary.empty[js.Any]
      arn.foreach(__v => __obj.update("arn", __v.asInstanceOf[js.Any]))
      meshName.foreach(__v => __obj.update("meshName", __v.asInstanceOf[js.Any]))
      virtualRouterName.foreach(__v => __obj.update("virtualRouterName", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualRouterRef]
    }
  }

  /**
    * An object representing the specification of a virtual router.
    */
  @js.native
  trait VirtualRouterSpec extends js.Object {
    var serviceNames: js.UndefOr[ServiceNames]
  }

  object VirtualRouterSpec {
    def apply(
        serviceNames: js.UndefOr[ServiceNames] = js.undefined
    ): VirtualRouterSpec = {
      val __obj = js.Dictionary.empty[js.Any]
      serviceNames.foreach(__v => __obj.update("serviceNames", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualRouterSpec]
    }
  }

  /**
    * An object representing the status of a virtual router.
    */
  @js.native
  trait VirtualRouterStatus extends js.Object {
    var status: js.UndefOr[VirtualRouterStatusCode]
  }

  object VirtualRouterStatus {
    def apply(
        status: js.UndefOr[VirtualRouterStatusCode] = js.undefined
    ): VirtualRouterStatus = {
      val __obj = js.Dictionary.empty[js.Any]
      status.foreach(__v => __obj.update("status", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualRouterStatus]
    }
  }

  object VirtualRouterStatusCodeEnum {
    val ACTIVE   = "ACTIVE"
    val DELETED  = "DELETED"
    val INACTIVE = "INACTIVE"

    val values = IndexedSeq(ACTIVE, DELETED, INACTIVE)
  }

  /**
    * <p>An object representing a target and its relative weight. Traffic is distributed across
    *          targets according to their relative weight. For example, a weighted target with a relative
    *          weight of 50 receives five times as much traffic as one with a relative weight of
    *          10.</p>
    */
  @js.native
  trait WeightedTarget extends js.Object {
    var virtualNode: js.UndefOr[ResourceName]
    var weight: js.UndefOr[PercentInt]
  }

  object WeightedTarget {
    def apply(
        virtualNode: js.UndefOr[ResourceName] = js.undefined,
        weight: js.UndefOr[PercentInt] = js.undefined
    ): WeightedTarget = {
      val __obj = js.Dictionary.empty[js.Any]
      virtualNode.foreach(__v => __obj.update("virtualNode", __v.asInstanceOf[js.Any]))
      weight.foreach(__v => __obj.update("weight", __v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[WeightedTarget]
    }
  }
}
