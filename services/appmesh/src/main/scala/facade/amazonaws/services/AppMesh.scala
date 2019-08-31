package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import io.scalajs.nodejs
import facade.amazonaws._

package object appmesh {
  type Arn                               = String
  type AwsCloudMapInstanceAttributeKey   = String
  type AwsCloudMapInstanceAttributeValue = String
  type AwsCloudMapInstanceAttributes     = js.Array[AwsCloudMapInstanceAttribute]
  type AwsCloudMapName                   = String
  type Backends                          = js.Array[Backend]
  type EgressFilterType                  = String
  type FilePath                          = String
  type HeaderMatch                       = String
  type HeaderName                        = String
  type HealthCheckIntervalMillis         = Double
  type HealthCheckThreshold              = Int
  type HealthCheckTimeoutMillis          = Double
  type Hostname                          = String
  type HttpMethod                        = String
  type HttpRouteHeaders                  = js.Array[HttpRouteHeader]
  type HttpScheme                        = String
  type ListMeshesLimit                   = Int
  type ListRoutesLimit                   = Int
  type ListVirtualNodesLimit             = Int
  type ListVirtualRoutersLimit           = Int
  type ListVirtualServicesLimit          = Int
  type Listeners                         = js.Array[Listener]
  type MeshList                          = js.Array[MeshRef]
  type MeshStatusCode                    = String
  type PercentInt                        = Int
  type PortNumber                        = Int
  type PortProtocol                      = String
  type ResourceName                      = String
  type RouteList                         = js.Array[RouteRef]
  type RoutePriority                     = Int
  type RouteStatusCode                   = String
  type ServiceName                       = String
  type TagKey                            = String
  type TagKeyList                        = js.Array[TagKey]
  type TagList                           = js.Array[TagRef]
  type TagValue                          = String
  type TagsLimit                         = Int
  type Timestamp                         = js.Date
  type VirtualNodeList                   = js.Array[VirtualNodeRef]
  type VirtualNodeStatusCode             = String
  type VirtualRouterList                 = js.Array[VirtualRouterRef]
  type VirtualRouterListeners            = js.Array[VirtualRouterListener]
  type VirtualRouterStatusCode           = String
  type VirtualServiceList                = js.Array[VirtualServiceRef]
  type VirtualServiceStatusCode          = String
  type WeightedTargets                   = js.Array[WeightedTarget]

  implicit final class AppMeshOps(private val service: AppMesh) extends AnyVal {

    def createMeshFuture(params: CreateMeshInput): Future[CreateMeshOutput] =
      service.createMesh(params).promise.toFuture
    def createRouteFuture(params: CreateRouteInput): Future[CreateRouteOutput] =
      service.createRoute(params).promise.toFuture
    def createVirtualNodeFuture(params: CreateVirtualNodeInput): Future[CreateVirtualNodeOutput] =
      service.createVirtualNode(params).promise.toFuture
    def createVirtualRouterFuture(params: CreateVirtualRouterInput): Future[CreateVirtualRouterOutput] =
      service.createVirtualRouter(params).promise.toFuture
    def createVirtualServiceFuture(params: CreateVirtualServiceInput): Future[CreateVirtualServiceOutput] =
      service.createVirtualService(params).promise.toFuture
    def deleteMeshFuture(params: DeleteMeshInput): Future[DeleteMeshOutput] =
      service.deleteMesh(params).promise.toFuture
    def deleteRouteFuture(params: DeleteRouteInput): Future[DeleteRouteOutput] =
      service.deleteRoute(params).promise.toFuture
    def deleteVirtualNodeFuture(params: DeleteVirtualNodeInput): Future[DeleteVirtualNodeOutput] =
      service.deleteVirtualNode(params).promise.toFuture
    def deleteVirtualRouterFuture(params: DeleteVirtualRouterInput): Future[DeleteVirtualRouterOutput] =
      service.deleteVirtualRouter(params).promise.toFuture
    def deleteVirtualServiceFuture(params: DeleteVirtualServiceInput): Future[DeleteVirtualServiceOutput] =
      service.deleteVirtualService(params).promise.toFuture
    def describeMeshFuture(params: DescribeMeshInput): Future[DescribeMeshOutput] =
      service.describeMesh(params).promise.toFuture
    def describeRouteFuture(params: DescribeRouteInput): Future[DescribeRouteOutput] =
      service.describeRoute(params).promise.toFuture
    def describeVirtualNodeFuture(params: DescribeVirtualNodeInput): Future[DescribeVirtualNodeOutput] =
      service.describeVirtualNode(params).promise.toFuture
    def describeVirtualRouterFuture(params: DescribeVirtualRouterInput): Future[DescribeVirtualRouterOutput] =
      service.describeVirtualRouter(params).promise.toFuture
    def describeVirtualServiceFuture(params: DescribeVirtualServiceInput): Future[DescribeVirtualServiceOutput] =
      service.describeVirtualService(params).promise.toFuture
    def listMeshesFuture(params: ListMeshesInput): Future[ListMeshesOutput] =
      service.listMeshes(params).promise.toFuture
    def listRoutesFuture(params: ListRoutesInput): Future[ListRoutesOutput] =
      service.listRoutes(params).promise.toFuture
    def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] =
      service.listTagsForResource(params).promise.toFuture
    def listVirtualNodesFuture(params: ListVirtualNodesInput): Future[ListVirtualNodesOutput] =
      service.listVirtualNodes(params).promise.toFuture
    def listVirtualRoutersFuture(params: ListVirtualRoutersInput): Future[ListVirtualRoutersOutput] =
      service.listVirtualRouters(params).promise.toFuture
    def listVirtualServicesFuture(params: ListVirtualServicesInput): Future[ListVirtualServicesOutput] =
      service.listVirtualServices(params).promise.toFuture
    def tagResourceFuture(params: TagResourceInput): Future[TagResourceOutput] =
      service.tagResource(params).promise.toFuture
    def untagResourceFuture(params: UntagResourceInput): Future[UntagResourceOutput] =
      service.untagResource(params).promise.toFuture
    def updateMeshFuture(params: UpdateMeshInput): Future[UpdateMeshOutput] =
      service.updateMesh(params).promise.toFuture
    def updateRouteFuture(params: UpdateRouteInput): Future[UpdateRouteOutput] =
      service.updateRoute(params).promise.toFuture
    def updateVirtualNodeFuture(params: UpdateVirtualNodeInput): Future[UpdateVirtualNodeOutput] =
      service.updateVirtualNode(params).promise.toFuture
    def updateVirtualRouterFuture(params: UpdateVirtualRouterInput): Future[UpdateVirtualRouterOutput] =
      service.updateVirtualRouter(params).promise.toFuture
    def updateVirtualServiceFuture(params: UpdateVirtualServiceInput): Future[UpdateVirtualServiceOutput] =
      service.updateVirtualService(params).promise.toFuture
  }
}

package appmesh {
  @js.native
  @JSImport("aws-sdk", "AppMesh")
  class AppMesh() extends js.Object {
    def this(config: AWSConfig) = this()

    def createMesh(params: CreateMeshInput): Request[CreateMeshOutput]                                     = js.native
    def createRoute(params: CreateRouteInput): Request[CreateRouteOutput]                                  = js.native
    def createVirtualNode(params: CreateVirtualNodeInput): Request[CreateVirtualNodeOutput]                = js.native
    def createVirtualRouter(params: CreateVirtualRouterInput): Request[CreateVirtualRouterOutput]          = js.native
    def createVirtualService(params: CreateVirtualServiceInput): Request[CreateVirtualServiceOutput]       = js.native
    def deleteMesh(params: DeleteMeshInput): Request[DeleteMeshOutput]                                     = js.native
    def deleteRoute(params: DeleteRouteInput): Request[DeleteRouteOutput]                                  = js.native
    def deleteVirtualNode(params: DeleteVirtualNodeInput): Request[DeleteVirtualNodeOutput]                = js.native
    def deleteVirtualRouter(params: DeleteVirtualRouterInput): Request[DeleteVirtualRouterOutput]          = js.native
    def deleteVirtualService(params: DeleteVirtualServiceInput): Request[DeleteVirtualServiceOutput]       = js.native
    def describeMesh(params: DescribeMeshInput): Request[DescribeMeshOutput]                               = js.native
    def describeRoute(params: DescribeRouteInput): Request[DescribeRouteOutput]                            = js.native
    def describeVirtualNode(params: DescribeVirtualNodeInput): Request[DescribeVirtualNodeOutput]          = js.native
    def describeVirtualRouter(params: DescribeVirtualRouterInput): Request[DescribeVirtualRouterOutput]    = js.native
    def describeVirtualService(params: DescribeVirtualServiceInput): Request[DescribeVirtualServiceOutput] = js.native
    def listMeshes(params: ListMeshesInput): Request[ListMeshesOutput]                                     = js.native
    def listRoutes(params: ListRoutesInput): Request[ListRoutesOutput]                                     = js.native
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput]          = js.native
    def listVirtualNodes(params: ListVirtualNodesInput): Request[ListVirtualNodesOutput]                   = js.native
    def listVirtualRouters(params: ListVirtualRoutersInput): Request[ListVirtualRoutersOutput]             = js.native
    def listVirtualServices(params: ListVirtualServicesInput): Request[ListVirtualServicesOutput]          = js.native
    def tagResource(params: TagResourceInput): Request[TagResourceOutput]                                  = js.native
    def untagResource(params: UntagResourceInput): Request[UntagResourceOutput]                            = js.native
    def updateMesh(params: UpdateMeshInput): Request[UpdateMeshOutput]                                     = js.native
    def updateRoute(params: UpdateRouteInput): Request[UpdateRouteOutput]                                  = js.native
    def updateVirtualNode(params: UpdateVirtualNodeInput): Request[UpdateVirtualNodeOutput]                = js.native
    def updateVirtualRouter(params: UpdateVirtualRouterInput): Request[UpdateVirtualRouterOutput]          = js.native
    def updateVirtualService(params: UpdateVirtualServiceInput): Request[UpdateVirtualServiceOutput]       = js.native
  }

  /**
    * An object representing the access logging information for a virtual node.
    */
  @js.native
  trait AccessLog extends js.Object {
    var file: js.UndefOr[FileAccessLog]
  }

  object AccessLog {
    def apply(
        file: js.UndefOr[FileAccessLog] = js.undefined
    ): AccessLog = {
      val __obj = js.Dynamic.literal()
      file.foreach(__v => __obj.updateDynamic("file")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccessLog]
    }
  }

  /**
    * An object representing the AWS Cloud Map attribute information for your virtual node.
    */
  @js.native
  trait AwsCloudMapInstanceAttribute extends js.Object {
    var key: AwsCloudMapInstanceAttributeKey
    var value: AwsCloudMapInstanceAttributeValue
  }

  object AwsCloudMapInstanceAttribute {
    def apply(
        key: AwsCloudMapInstanceAttributeKey,
        value: AwsCloudMapInstanceAttributeValue
    ): AwsCloudMapInstanceAttribute = {
      val __obj = js.Dynamic.literal(
        "key"   -> key.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AwsCloudMapInstanceAttribute]
    }
  }

  /**
    * <p>An object representing the AWS Cloud Map service discovery information for your virtual
    *          node.</p>
    */
  @js.native
  trait AwsCloudMapServiceDiscovery extends js.Object {
    var namespaceName: AwsCloudMapName
    var serviceName: AwsCloudMapName
    var attributes: js.UndefOr[AwsCloudMapInstanceAttributes]
  }

  object AwsCloudMapServiceDiscovery {
    def apply(
        namespaceName: AwsCloudMapName,
        serviceName: AwsCloudMapName,
        attributes: js.UndefOr[AwsCloudMapInstanceAttributes] = js.undefined
    ): AwsCloudMapServiceDiscovery = {
      val __obj = js.Dynamic.literal(
        "namespaceName" -> namespaceName.asInstanceOf[js.Any],
        "serviceName"   -> serviceName.asInstanceOf[js.Any]
      )

      attributes.foreach(__v => __obj.updateDynamic("attributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCloudMapServiceDiscovery]
    }
  }

  /**
    * <p>An object representing the backends that a virtual node is expected to send outbound
    *          traffic to. </p>
    */
  @js.native
  trait Backend extends js.Object {
    var virtualService: js.UndefOr[VirtualServiceBackend]
  }

  object Backend {
    def apply(
        virtualService: js.UndefOr[VirtualServiceBackend] = js.undefined
    ): Backend = {
      val __obj = js.Dynamic.literal()
      virtualService.foreach(__v => __obj.updateDynamic("virtualService")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Backend]
    }
  }

  /**
    *
    */
  @js.native
  trait CreateMeshInput extends js.Object {
    var meshName: ResourceName
    var clientToken: js.UndefOr[String]
    var spec: js.UndefOr[MeshSpec]
    var tags: js.UndefOr[TagList]
  }

  object CreateMeshInput {
    def apply(
        meshName: ResourceName,
        clientToken: js.UndefOr[String] = js.undefined,
        spec: js.UndefOr[MeshSpec] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateMeshInput = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      spec.foreach(__v => __obj.updateDynamic("spec")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateMeshInput]
    }
  }

  /**
    *
    */
  @js.native
  trait CreateMeshOutput extends js.Object {
    var mesh: MeshData
  }

  object CreateMeshOutput {
    def apply(
        mesh: MeshData
    ): CreateMeshOutput = {
      val __obj = js.Dynamic.literal(
        "mesh" -> mesh.asInstanceOf[js.Any]
      )

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
    var tags: js.UndefOr[TagList]
  }

  object CreateRouteInput {
    def apply(
        meshName: ResourceName,
        routeName: ResourceName,
        spec: RouteSpec,
        virtualRouterName: ResourceName,
        clientToken: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateRouteInput = {
      val __obj = js.Dynamic.literal(
        "meshName"          -> meshName.asInstanceOf[js.Any],
        "routeName"         -> routeName.asInstanceOf[js.Any],
        "spec"              -> spec.asInstanceOf[js.Any],
        "virtualRouterName" -> virtualRouterName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRouteInput]
    }
  }

  /**
    *
    */
  @js.native
  trait CreateRouteOutput extends js.Object {
    var route: RouteData
  }

  object CreateRouteOutput {
    def apply(
        route: RouteData
    ): CreateRouteOutput = {
      val __obj = js.Dynamic.literal(
        "route" -> route.asInstanceOf[js.Any]
      )

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
    var tags: js.UndefOr[TagList]
  }

  object CreateVirtualNodeInput {
    def apply(
        meshName: ResourceName,
        spec: VirtualNodeSpec,
        virtualNodeName: ResourceName,
        clientToken: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateVirtualNodeInput = {
      val __obj = js.Dynamic.literal(
        "meshName"        -> meshName.asInstanceOf[js.Any],
        "spec"            -> spec.asInstanceOf[js.Any],
        "virtualNodeName" -> virtualNodeName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVirtualNodeInput]
    }
  }

  /**
    *
    */
  @js.native
  trait CreateVirtualNodeOutput extends js.Object {
    var virtualNode: VirtualNodeData
  }

  object CreateVirtualNodeOutput {
    def apply(
        virtualNode: VirtualNodeData
    ): CreateVirtualNodeOutput = {
      val __obj = js.Dynamic.literal(
        "virtualNode" -> virtualNode.asInstanceOf[js.Any]
      )

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
    var tags: js.UndefOr[TagList]
  }

  object CreateVirtualRouterInput {
    def apply(
        meshName: ResourceName,
        spec: VirtualRouterSpec,
        virtualRouterName: ResourceName,
        clientToken: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateVirtualRouterInput = {
      val __obj = js.Dynamic.literal(
        "meshName"          -> meshName.asInstanceOf[js.Any],
        "spec"              -> spec.asInstanceOf[js.Any],
        "virtualRouterName" -> virtualRouterName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVirtualRouterInput]
    }
  }

  /**
    *
    */
  @js.native
  trait CreateVirtualRouterOutput extends js.Object {
    var virtualRouter: VirtualRouterData
  }

  object CreateVirtualRouterOutput {
    def apply(
        virtualRouter: VirtualRouterData
    ): CreateVirtualRouterOutput = {
      val __obj = js.Dynamic.literal(
        "virtualRouter" -> virtualRouter.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateVirtualRouterOutput]
    }
  }

  /**
    *
    */
  @js.native
  trait CreateVirtualServiceInput extends js.Object {
    var meshName: ResourceName
    var spec: VirtualServiceSpec
    var virtualServiceName: ServiceName
    var clientToken: js.UndefOr[String]
    var tags: js.UndefOr[TagList]
  }

  object CreateVirtualServiceInput {
    def apply(
        meshName: ResourceName,
        spec: VirtualServiceSpec,
        virtualServiceName: ServiceName,
        clientToken: js.UndefOr[String] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateVirtualServiceInput = {
      val __obj = js.Dynamic.literal(
        "meshName"           -> meshName.asInstanceOf[js.Any],
        "spec"               -> spec.asInstanceOf[js.Any],
        "virtualServiceName" -> virtualServiceName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVirtualServiceInput]
    }
  }

  /**
    *
    */
  @js.native
  trait CreateVirtualServiceOutput extends js.Object {
    var virtualService: VirtualServiceData
  }

  object CreateVirtualServiceOutput {
    def apply(
        virtualService: VirtualServiceData
    ): CreateVirtualServiceOutput = {
      val __obj = js.Dynamic.literal(
        "virtualService" -> virtualService.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[CreateVirtualServiceOutput]
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
      val __obj = js.Dynamic.literal(
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
    var mesh: MeshData
  }

  object DeleteMeshOutput {
    def apply(
        mesh: MeshData
    ): DeleteMeshOutput = {
      val __obj = js.Dynamic.literal(
        "mesh" -> mesh.asInstanceOf[js.Any]
      )

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
      val __obj = js.Dynamic.literal(
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
    var route: RouteData
  }

  object DeleteRouteOutput {
    def apply(
        route: RouteData
    ): DeleteRouteOutput = {
      val __obj = js.Dynamic.literal(
        "route" -> route.asInstanceOf[js.Any]
      )

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
      val __obj = js.Dynamic.literal(
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
    var virtualNode: VirtualNodeData
  }

  object DeleteVirtualNodeOutput {
    def apply(
        virtualNode: VirtualNodeData
    ): DeleteVirtualNodeOutput = {
      val __obj = js.Dynamic.literal(
        "virtualNode" -> virtualNode.asInstanceOf[js.Any]
      )

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
      val __obj = js.Dynamic.literal(
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
    var virtualRouter: VirtualRouterData
  }

  object DeleteVirtualRouterOutput {
    def apply(
        virtualRouter: VirtualRouterData
    ): DeleteVirtualRouterOutput = {
      val __obj = js.Dynamic.literal(
        "virtualRouter" -> virtualRouter.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteVirtualRouterOutput]
    }
  }

  /**
    *
    */
  @js.native
  trait DeleteVirtualServiceInput extends js.Object {
    var meshName: ResourceName
    var virtualServiceName: ServiceName
  }

  object DeleteVirtualServiceInput {
    def apply(
        meshName: ResourceName,
        virtualServiceName: ServiceName
    ): DeleteVirtualServiceInput = {
      val __obj = js.Dynamic.literal(
        "meshName"           -> meshName.asInstanceOf[js.Any],
        "virtualServiceName" -> virtualServiceName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteVirtualServiceInput]
    }
  }

  /**
    *
    */
  @js.native
  trait DeleteVirtualServiceOutput extends js.Object {
    var virtualService: VirtualServiceData
  }

  object DeleteVirtualServiceOutput {
    def apply(
        virtualService: VirtualServiceData
    ): DeleteVirtualServiceOutput = {
      val __obj = js.Dynamic.literal(
        "virtualService" -> virtualService.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteVirtualServiceOutput]
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
      val __obj = js.Dynamic.literal(
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
    var mesh: MeshData
  }

  object DescribeMeshOutput {
    def apply(
        mesh: MeshData
    ): DescribeMeshOutput = {
      val __obj = js.Dynamic.literal(
        "mesh" -> mesh.asInstanceOf[js.Any]
      )

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
      val __obj = js.Dynamic.literal(
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
    var route: RouteData
  }

  object DescribeRouteOutput {
    def apply(
        route: RouteData
    ): DescribeRouteOutput = {
      val __obj = js.Dynamic.literal(
        "route" -> route.asInstanceOf[js.Any]
      )

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
      val __obj = js.Dynamic.literal(
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
    var virtualNode: VirtualNodeData
  }

  object DescribeVirtualNodeOutput {
    def apply(
        virtualNode: VirtualNodeData
    ): DescribeVirtualNodeOutput = {
      val __obj = js.Dynamic.literal(
        "virtualNode" -> virtualNode.asInstanceOf[js.Any]
      )

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
      val __obj = js.Dynamic.literal(
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
    var virtualRouter: VirtualRouterData
  }

  object DescribeVirtualRouterOutput {
    def apply(
        virtualRouter: VirtualRouterData
    ): DescribeVirtualRouterOutput = {
      val __obj = js.Dynamic.literal(
        "virtualRouter" -> virtualRouter.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeVirtualRouterOutput]
    }
  }

  /**
    *
    */
  @js.native
  trait DescribeVirtualServiceInput extends js.Object {
    var meshName: ResourceName
    var virtualServiceName: ServiceName
  }

  object DescribeVirtualServiceInput {
    def apply(
        meshName: ResourceName,
        virtualServiceName: ServiceName
    ): DescribeVirtualServiceInput = {
      val __obj = js.Dynamic.literal(
        "meshName"           -> meshName.asInstanceOf[js.Any],
        "virtualServiceName" -> virtualServiceName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeVirtualServiceInput]
    }
  }

  /**
    *
    */
  @js.native
  trait DescribeVirtualServiceOutput extends js.Object {
    var virtualService: VirtualServiceData
  }

  object DescribeVirtualServiceOutput {
    def apply(
        virtualService: VirtualServiceData
    ): DescribeVirtualServiceOutput = {
      val __obj = js.Dynamic.literal(
        "virtualService" -> virtualService.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DescribeVirtualServiceOutput]
    }
  }

  /**
    * <p>An object representing the DNS service discovery information for your virtual
    *          node.</p>
    */
  @js.native
  trait DnsServiceDiscovery extends js.Object {
    var hostname: Hostname
  }

  object DnsServiceDiscovery {
    def apply(
        hostname: Hostname
    ): DnsServiceDiscovery = {
      val __obj = js.Dynamic.literal(
        "hostname" -> hostname.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DnsServiceDiscovery]
    }
  }

  /**
    * An object representing the egress filter rules for a service mesh.
    */
  @js.native
  trait EgressFilter extends js.Object {
    var `type`: EgressFilterType
  }

  object EgressFilter {
    def apply(
        `type`: EgressFilterType
    ): EgressFilter = {
      val __obj = js.Dynamic.literal(
        "type" -> `type`.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EgressFilter]
    }
  }

  object EgressFilterTypeEnum {
    val ALLOW_ALL = "ALLOW_ALL"
    val DROP_ALL  = "DROP_ALL"

    val values = js.Object.freeze(js.Array(ALLOW_ALL, DROP_ALL))
  }

  /**
    * An object representing an access log file.
    */
  @js.native
  trait FileAccessLog extends js.Object {
    var path: FilePath
  }

  object FileAccessLog {
    def apply(
        path: FilePath
    ): FileAccessLog = {
      val __obj = js.Dynamic.literal(
        "path" -> path.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[FileAccessLog]
    }
  }

  /**
    * An object representing the method and value to match the header value sent with a request. Specify one match method.
    */
  @js.native
  trait HeaderMatchMethod extends js.Object {
    var exact: js.UndefOr[HeaderMatch]
    var prefix: js.UndefOr[HeaderMatch]
    var range: js.UndefOr[MatchRange]
    var regex: js.UndefOr[HeaderMatch]
    var suffix: js.UndefOr[HeaderMatch]
  }

  object HeaderMatchMethod {
    def apply(
        exact: js.UndefOr[HeaderMatch] = js.undefined,
        prefix: js.UndefOr[HeaderMatch] = js.undefined,
        range: js.UndefOr[MatchRange] = js.undefined,
        regex: js.UndefOr[HeaderMatch] = js.undefined,
        suffix: js.UndefOr[HeaderMatch] = js.undefined
    ): HeaderMatchMethod = {
      val __obj = js.Dynamic.literal()
      exact.foreach(__v => __obj.updateDynamic("exact")(__v.asInstanceOf[js.Any]))
      prefix.foreach(__v => __obj.updateDynamic("prefix")(__v.asInstanceOf[js.Any]))
      range.foreach(__v => __obj.updateDynamic("range")(__v.asInstanceOf[js.Any]))
      regex.foreach(__v => __obj.updateDynamic("regex")(__v.asInstanceOf[js.Any]))
      suffix.foreach(__v => __obj.updateDynamic("suffix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HeaderMatchMethod]
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
      val __obj = js.Dynamic.literal(
        "healthyThreshold"   -> healthyThreshold.asInstanceOf[js.Any],
        "intervalMillis"     -> intervalMillis.asInstanceOf[js.Any],
        "protocol"           -> protocol.asInstanceOf[js.Any],
        "timeoutMillis"      -> timeoutMillis.asInstanceOf[js.Any],
        "unhealthyThreshold" -> unhealthyThreshold.asInstanceOf[js.Any]
      )

      path.foreach(__v => __obj.updateDynamic("path")(__v.asInstanceOf[js.Any]))
      port.foreach(__v => __obj.updateDynamic("port")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HealthCheckPolicy]
    }
  }

  object HttpMethodEnum {
    val CONNECT = "CONNECT"
    val DELETE  = "DELETE"
    val GET     = "GET"
    val HEAD    = "HEAD"
    val OPTIONS = "OPTIONS"
    val PATCH   = "PATCH"
    val POST    = "POST"
    val PUT     = "PUT"
    val TRACE   = "TRACE"

    val values = js.Object.freeze(js.Array(CONNECT, DELETE, GET, HEAD, OPTIONS, PATCH, POST, PUT, TRACE))
  }

  /**
    * An object representing the HTTP routing specification for a route.
    */
  @js.native
  trait HttpRoute extends js.Object {
    var action: HttpRouteAction
    var `match`: HttpRouteMatch
  }

  object HttpRoute {
    def apply(
        action: HttpRouteAction,
        `match`: HttpRouteMatch
    ): HttpRoute = {
      val __obj = js.Dynamic.literal(
        "action" -> action.asInstanceOf[js.Any],
        "match"  -> `match`.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[HttpRoute]
    }
  }

  /**
    * <p>An object representing the traffic distribution requirements for matched HTTP
    *          requests.</p>
    */
  @js.native
  trait HttpRouteAction extends js.Object {
    var weightedTargets: WeightedTargets
  }

  object HttpRouteAction {
    def apply(
        weightedTargets: WeightedTargets
    ): HttpRouteAction = {
      val __obj = js.Dynamic.literal(
        "weightedTargets" -> weightedTargets.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[HttpRouteAction]
    }
  }

  /**
    * An object representing the HTTP header in the request.
    */
  @js.native
  trait HttpRouteHeader extends js.Object {
    var name: HeaderName
    var invert: js.UndefOr[Boolean]
    var `match`: js.UndefOr[HeaderMatchMethod]
  }

  object HttpRouteHeader {
    def apply(
        name: HeaderName,
        invert: js.UndefOr[Boolean] = js.undefined,
        `match`: js.UndefOr[HeaderMatchMethod] = js.undefined
    ): HttpRouteHeader = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      invert.foreach(__v => __obj.updateDynamic("invert")(__v.asInstanceOf[js.Any]))
      `match`.foreach(__v => __obj.updateDynamic("match")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HttpRouteHeader]
    }
  }

  /**
    * <p>An object representing the requirements for a route to match HTTP requests for a virtual
    *          router.</p>
    */
  @js.native
  trait HttpRouteMatch extends js.Object {
    var prefix: String
    var headers: js.UndefOr[HttpRouteHeaders]
    var method: js.UndefOr[HttpMethod]
    var scheme: js.UndefOr[HttpScheme]
  }

  object HttpRouteMatch {
    def apply(
        prefix: String,
        headers: js.UndefOr[HttpRouteHeaders] = js.undefined,
        method: js.UndefOr[HttpMethod] = js.undefined,
        scheme: js.UndefOr[HttpScheme] = js.undefined
    ): HttpRouteMatch = {
      val __obj = js.Dynamic.literal(
        "prefix" -> prefix.asInstanceOf[js.Any]
      )

      headers.foreach(__v => __obj.updateDynamic("headers")(__v.asInstanceOf[js.Any]))
      method.foreach(__v => __obj.updateDynamic("method")(__v.asInstanceOf[js.Any]))
      scheme.foreach(__v => __obj.updateDynamic("scheme")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HttpRouteMatch]
    }
  }

  object HttpSchemeEnum {
    val http  = "http"
    val https = "https"

    val values = js.Object.freeze(js.Array(http, https))
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
      val __obj = js.Dynamic.literal()
      limit.foreach(__v => __obj.updateDynamic("limit")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
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
      val __obj = js.Dynamic.literal(
        "meshes" -> meshes.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
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
      val __obj = js.Dynamic.literal(
        "meshName"          -> meshName.asInstanceOf[js.Any],
        "virtualRouterName" -> virtualRouterName.asInstanceOf[js.Any]
      )

      limit.foreach(__v => __obj.updateDynamic("limit")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
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
      val __obj = js.Dynamic.literal(
        "routes" -> routes.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRoutesOutput]
    }
  }

  /**
    *
    */
  @js.native
  trait ListTagsForResourceInput extends js.Object {
    var resourceArn: Arn
    var limit: js.UndefOr[TagsLimit]
    var nextToken: js.UndefOr[String]
  }

  object ListTagsForResourceInput {
    def apply(
        resourceArn: Arn,
        limit: js.UndefOr[TagsLimit] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListTagsForResourceInput = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any]
      )

      limit.foreach(__v => __obj.updateDynamic("limit")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceInput]
    }
  }

  /**
    *
    */
  @js.native
  trait ListTagsForResourceOutput extends js.Object {
    var tags: TagList
    var nextToken: js.UndefOr[String]
  }

  object ListTagsForResourceOutput {
    def apply(
        tags: TagList,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListTagsForResourceOutput = {
      val __obj = js.Dynamic.literal(
        "tags" -> tags.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceOutput]
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
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any]
      )

      limit.foreach(__v => __obj.updateDynamic("limit")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
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
      val __obj = js.Dynamic.literal(
        "virtualNodes" -> virtualNodes.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
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
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any]
      )

      limit.foreach(__v => __obj.updateDynamic("limit")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
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
      val __obj = js.Dynamic.literal(
        "virtualRouters" -> virtualRouters.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVirtualRoutersOutput]
    }
  }

  /**
    *
    */
  @js.native
  trait ListVirtualServicesInput extends js.Object {
    var meshName: ResourceName
    var limit: js.UndefOr[ListVirtualServicesLimit]
    var nextToken: js.UndefOr[String]
  }

  object ListVirtualServicesInput {
    def apply(
        meshName: ResourceName,
        limit: js.UndefOr[ListVirtualServicesLimit] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListVirtualServicesInput = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any]
      )

      limit.foreach(__v => __obj.updateDynamic("limit")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVirtualServicesInput]
    }
  }

  /**
    *
    */
  @js.native
  trait ListVirtualServicesOutput extends js.Object {
    var virtualServices: VirtualServiceList
    var nextToken: js.UndefOr[String]
  }

  object ListVirtualServicesOutput {
    def apply(
        virtualServices: VirtualServiceList,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListVirtualServicesOutput = {
      val __obj = js.Dynamic.literal(
        "virtualServices" -> virtualServices.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVirtualServicesOutput]
    }
  }

  /**
    * An object representing a listener for a virtual node.
    */
  @js.native
  trait Listener extends js.Object {
    var portMapping: PortMapping
    var healthCheck: js.UndefOr[HealthCheckPolicy]
  }

  object Listener {
    def apply(
        portMapping: PortMapping,
        healthCheck: js.UndefOr[HealthCheckPolicy] = js.undefined
    ): Listener = {
      val __obj = js.Dynamic.literal(
        "portMapping" -> portMapping.asInstanceOf[js.Any]
      )

      healthCheck.foreach(__v => __obj.updateDynamic("healthCheck")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Listener]
    }
  }

  /**
    * An object representing the logging information for a virtual node.
    */
  @js.native
  trait Logging extends js.Object {
    var accessLog: js.UndefOr[AccessLog]
  }

  object Logging {
    def apply(
        accessLog: js.UndefOr[AccessLog] = js.undefined
    ): Logging = {
      val __obj = js.Dynamic.literal()
      accessLog.foreach(__v => __obj.updateDynamic("accessLog")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Logging]
    }
  }

  /**
    * The range of values to match on. The first character of the range is included in the range, though the last character is not. For example, if the range specified were 1-100, only values 1-99 would be matched.
    */
  @js.native
  trait MatchRange extends js.Object {
    var end: Double
    var start: Double
  }

  object MatchRange {
    def apply(
        end: Double,
        start: Double
    ): MatchRange = {
      val __obj = js.Dynamic.literal(
        "end"   -> end.asInstanceOf[js.Any],
        "start" -> start.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[MatchRange]
    }
  }

  /**
    * An object representing a service mesh returned by a describe operation.
    */
  @js.native
  trait MeshData extends js.Object {
    var meshName: ResourceName
    var metadata: ResourceMetadata
    var spec: MeshSpec
    var status: MeshStatus
  }

  object MeshData {
    def apply(
        meshName: ResourceName,
        metadata: ResourceMetadata,
        spec: MeshSpec,
        status: MeshStatus
    ): MeshData = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any],
        "metadata" -> metadata.asInstanceOf[js.Any],
        "spec"     -> spec.asInstanceOf[js.Any],
        "status"   -> status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[MeshData]
    }
  }

  /**
    * An object representing a service mesh returned by a list operation.
    */
  @js.native
  trait MeshRef extends js.Object {
    var arn: Arn
    var meshName: ResourceName
  }

  object MeshRef {
    def apply(
        arn: Arn,
        meshName: ResourceName
    ): MeshRef = {
      val __obj = js.Dynamic.literal(
        "arn"      -> arn.asInstanceOf[js.Any],
        "meshName" -> meshName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[MeshRef]
    }
  }

  /**
    * An object representing the specification of a service mesh.
    */
  @js.native
  trait MeshSpec extends js.Object {
    var egressFilter: js.UndefOr[EgressFilter]
  }

  object MeshSpec {
    def apply(
        egressFilter: js.UndefOr[EgressFilter] = js.undefined
    ): MeshSpec = {
      val __obj = js.Dynamic.literal()
      egressFilter.foreach(__v => __obj.updateDynamic("egressFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MeshSpec]
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
      val __obj = js.Dynamic.literal()
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MeshStatus]
    }
  }

  object MeshStatusCodeEnum {
    val ACTIVE   = "ACTIVE"
    val DELETED  = "DELETED"
    val INACTIVE = "INACTIVE"

    val values = js.Object.freeze(js.Array(ACTIVE, DELETED, INACTIVE))
  }

  /**
    * An object representing a virtual node or virtual router listener port mapping.
    */
  @js.native
  trait PortMapping extends js.Object {
    var port: PortNumber
    var protocol: PortProtocol
  }

  object PortMapping {
    def apply(
        port: PortNumber,
        protocol: PortProtocol
    ): PortMapping = {
      val __obj = js.Dynamic.literal(
        "port"     -> port.asInstanceOf[js.Any],
        "protocol" -> protocol.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PortMapping]
    }
  }

  object PortProtocolEnum {
    val http = "http"
    val tcp  = "tcp"

    val values = js.Object.freeze(js.Array(http, tcp))
  }

  /**
    * An object representing metadata for a resource.
    */
  @js.native
  trait ResourceMetadata extends js.Object {
    var arn: Arn
    var createdAt: Timestamp
    var lastUpdatedAt: Timestamp
    var uid: String
    var version: Double
  }

  object ResourceMetadata {
    def apply(
        arn: Arn,
        createdAt: Timestamp,
        lastUpdatedAt: Timestamp,
        uid: String,
        version: Double
    ): ResourceMetadata = {
      val __obj = js.Dynamic.literal(
        "arn"           -> arn.asInstanceOf[js.Any],
        "createdAt"     -> createdAt.asInstanceOf[js.Any],
        "lastUpdatedAt" -> lastUpdatedAt.asInstanceOf[js.Any],
        "uid"           -> uid.asInstanceOf[js.Any],
        "version"       -> version.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ResourceMetadata]
    }
  }

  /**
    * An object representing a route returned by a describe operation.
    */
  @js.native
  trait RouteData extends js.Object {
    var meshName: ResourceName
    var metadata: ResourceMetadata
    var routeName: ResourceName
    var spec: RouteSpec
    var status: RouteStatus
    var virtualRouterName: ResourceName
  }

  object RouteData {
    def apply(
        meshName: ResourceName,
        metadata: ResourceMetadata,
        routeName: ResourceName,
        spec: RouteSpec,
        status: RouteStatus,
        virtualRouterName: ResourceName
    ): RouteData = {
      val __obj = js.Dynamic.literal(
        "meshName"          -> meshName.asInstanceOf[js.Any],
        "metadata"          -> metadata.asInstanceOf[js.Any],
        "routeName"         -> routeName.asInstanceOf[js.Any],
        "spec"              -> spec.asInstanceOf[js.Any],
        "status"            -> status.asInstanceOf[js.Any],
        "virtualRouterName" -> virtualRouterName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RouteData]
    }
  }

  /**
    * An object representing a route returned by a list operation.
    */
  @js.native
  trait RouteRef extends js.Object {
    var arn: Arn
    var meshName: ResourceName
    var routeName: ResourceName
    var virtualRouterName: ResourceName
  }

  object RouteRef {
    def apply(
        arn: Arn,
        meshName: ResourceName,
        routeName: ResourceName,
        virtualRouterName: ResourceName
    ): RouteRef = {
      val __obj = js.Dynamic.literal(
        "arn"               -> arn.asInstanceOf[js.Any],
        "meshName"          -> meshName.asInstanceOf[js.Any],
        "routeName"         -> routeName.asInstanceOf[js.Any],
        "virtualRouterName" -> virtualRouterName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RouteRef]
    }
  }

  /**
    * An object representing the specification of a route.
    */
  @js.native
  trait RouteSpec extends js.Object {
    var httpRoute: js.UndefOr[HttpRoute]
    var priority: js.UndefOr[RoutePriority]
    var tcpRoute: js.UndefOr[TcpRoute]
  }

  object RouteSpec {
    def apply(
        httpRoute: js.UndefOr[HttpRoute] = js.undefined,
        priority: js.UndefOr[RoutePriority] = js.undefined,
        tcpRoute: js.UndefOr[TcpRoute] = js.undefined
    ): RouteSpec = {
      val __obj = js.Dynamic.literal()
      httpRoute.foreach(__v => __obj.updateDynamic("httpRoute")(__v.asInstanceOf[js.Any]))
      priority.foreach(__v => __obj.updateDynamic("priority")(__v.asInstanceOf[js.Any]))
      tcpRoute.foreach(__v => __obj.updateDynamic("tcpRoute")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RouteSpec]
    }
  }

  /**
    * An object representing the current status of a route.
    */
  @js.native
  trait RouteStatus extends js.Object {
    var status: RouteStatusCode
  }

  object RouteStatus {
    def apply(
        status: RouteStatusCode
    ): RouteStatus = {
      val __obj = js.Dynamic.literal(
        "status" -> status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RouteStatus]
    }
  }

  object RouteStatusCodeEnum {
    val ACTIVE   = "ACTIVE"
    val DELETED  = "DELETED"
    val INACTIVE = "INACTIVE"

    val values = js.Object.freeze(js.Array(ACTIVE, DELETED, INACTIVE))
  }

  /**
    * An object representing the service discovery information for a virtual node.
    */
  @js.native
  trait ServiceDiscovery extends js.Object {
    var awsCloudMap: js.UndefOr[AwsCloudMapServiceDiscovery]
    var dns: js.UndefOr[DnsServiceDiscovery]
  }

  object ServiceDiscovery {
    def apply(
        awsCloudMap: js.UndefOr[AwsCloudMapServiceDiscovery] = js.undefined,
        dns: js.UndefOr[DnsServiceDiscovery] = js.undefined
    ): ServiceDiscovery = {
      val __obj = js.Dynamic.literal()
      awsCloudMap.foreach(__v => __obj.updateDynamic("awsCloudMap")(__v.asInstanceOf[js.Any]))
      dns.foreach(__v => __obj.updateDynamic("dns")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceDiscovery]
    }
  }

  /**
    * <p>Optional metadata that you apply to a resource to assist with categorization and
    *          organization. Each tag consists of a key and an optional value, both of which you define.
    *          Tag keys can have a maximum character length of 128 characters, and tag values can have
    *             a maximum length of 256 characters.</p>
    */
  @js.native
  trait TagRef extends js.Object {
    var key: TagKey
    var value: js.UndefOr[TagValue]
  }

  object TagRef {
    def apply(
        key: TagKey,
        value: js.UndefOr[TagValue] = js.undefined
    ): TagRef = {
      val __obj = js.Dynamic.literal(
        "key" -> key.asInstanceOf[js.Any]
      )

      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TagRef]
    }
  }

  /**
    *
    */
  @js.native
  trait TagResourceInput extends js.Object {
    var resourceArn: Arn
    var tags: TagList
  }

  object TagResourceInput {
    def apply(
        resourceArn: Arn,
        tags: TagList
    ): TagResourceInput = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags"        -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceInput]
    }
  }

  /**
    *
    */
  @js.native
  trait TagResourceOutput extends js.Object {}

  object TagResourceOutput {
    def apply(
        ): TagResourceOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagResourceOutput]
    }
  }

  /**
    * An object representing the TCP routing specification for a route.
    */
  @js.native
  trait TcpRoute extends js.Object {
    var action: TcpRouteAction
  }

  object TcpRoute {
    def apply(
        action: TcpRouteAction
    ): TcpRoute = {
      val __obj = js.Dynamic.literal(
        "action" -> action.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TcpRoute]
    }
  }

  /**
    * <p>An object representing the traffic distribution requirements for matched TCP
    *          requests.</p>
    */
  @js.native
  trait TcpRouteAction extends js.Object {
    var weightedTargets: WeightedTargets
  }

  object TcpRouteAction {
    def apply(
        weightedTargets: WeightedTargets
    ): TcpRouteAction = {
      val __obj = js.Dynamic.literal(
        "weightedTargets" -> weightedTargets.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TcpRouteAction]
    }
  }

  /**
    *
    */
  @js.native
  trait UntagResourceInput extends js.Object {
    var resourceArn: Arn
    var tagKeys: TagKeyList
  }

  object UntagResourceInput {
    def apply(
        resourceArn: Arn,
        tagKeys: TagKeyList
    ): UntagResourceInput = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys"     -> tagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceInput]
    }
  }

  /**
    *
    */
  @js.native
  trait UntagResourceOutput extends js.Object {}

  object UntagResourceOutput {
    def apply(
        ): UntagResourceOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagResourceOutput]
    }
  }

  /**
    *
    */
  @js.native
  trait UpdateMeshInput extends js.Object {
    var meshName: ResourceName
    var clientToken: js.UndefOr[String]
    var spec: js.UndefOr[MeshSpec]
  }

  object UpdateMeshInput {
    def apply(
        meshName: ResourceName,
        clientToken: js.UndefOr[String] = js.undefined,
        spec: js.UndefOr[MeshSpec] = js.undefined
    ): UpdateMeshInput = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      spec.foreach(__v => __obj.updateDynamic("spec")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateMeshInput]
    }
  }

  /**
    *
    */
  @js.native
  trait UpdateMeshOutput extends js.Object {
    var mesh: MeshData
  }

  object UpdateMeshOutput {
    def apply(
        mesh: MeshData
    ): UpdateMeshOutput = {
      val __obj = js.Dynamic.literal(
        "mesh" -> mesh.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateMeshOutput]
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
      val __obj = js.Dynamic.literal(
        "meshName"          -> meshName.asInstanceOf[js.Any],
        "routeName"         -> routeName.asInstanceOf[js.Any],
        "spec"              -> spec.asInstanceOf[js.Any],
        "virtualRouterName" -> virtualRouterName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRouteInput]
    }
  }

  /**
    *
    */
  @js.native
  trait UpdateRouteOutput extends js.Object {
    var route: RouteData
  }

  object UpdateRouteOutput {
    def apply(
        route: RouteData
    ): UpdateRouteOutput = {
      val __obj = js.Dynamic.literal(
        "route" -> route.asInstanceOf[js.Any]
      )

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
      val __obj = js.Dynamic.literal(
        "meshName"        -> meshName.asInstanceOf[js.Any],
        "spec"            -> spec.asInstanceOf[js.Any],
        "virtualNodeName" -> virtualNodeName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVirtualNodeInput]
    }
  }

  /**
    *
    */
  @js.native
  trait UpdateVirtualNodeOutput extends js.Object {
    var virtualNode: VirtualNodeData
  }

  object UpdateVirtualNodeOutput {
    def apply(
        virtualNode: VirtualNodeData
    ): UpdateVirtualNodeOutput = {
      val __obj = js.Dynamic.literal(
        "virtualNode" -> virtualNode.asInstanceOf[js.Any]
      )

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
      val __obj = js.Dynamic.literal(
        "meshName"          -> meshName.asInstanceOf[js.Any],
        "spec"              -> spec.asInstanceOf[js.Any],
        "virtualRouterName" -> virtualRouterName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVirtualRouterInput]
    }
  }

  /**
    *
    */
  @js.native
  trait UpdateVirtualRouterOutput extends js.Object {
    var virtualRouter: VirtualRouterData
  }

  object UpdateVirtualRouterOutput {
    def apply(
        virtualRouter: VirtualRouterData
    ): UpdateVirtualRouterOutput = {
      val __obj = js.Dynamic.literal(
        "virtualRouter" -> virtualRouter.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateVirtualRouterOutput]
    }
  }

  /**
    *
    */
  @js.native
  trait UpdateVirtualServiceInput extends js.Object {
    var meshName: ResourceName
    var spec: VirtualServiceSpec
    var virtualServiceName: ServiceName
    var clientToken: js.UndefOr[String]
  }

  object UpdateVirtualServiceInput {
    def apply(
        meshName: ResourceName,
        spec: VirtualServiceSpec,
        virtualServiceName: ServiceName,
        clientToken: js.UndefOr[String] = js.undefined
    ): UpdateVirtualServiceInput = {
      val __obj = js.Dynamic.literal(
        "meshName"           -> meshName.asInstanceOf[js.Any],
        "spec"               -> spec.asInstanceOf[js.Any],
        "virtualServiceName" -> virtualServiceName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVirtualServiceInput]
    }
  }

  /**
    *
    */
  @js.native
  trait UpdateVirtualServiceOutput extends js.Object {
    var virtualService: VirtualServiceData
  }

  object UpdateVirtualServiceOutput {
    def apply(
        virtualService: VirtualServiceData
    ): UpdateVirtualServiceOutput = {
      val __obj = js.Dynamic.literal(
        "virtualService" -> virtualService.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateVirtualServiceOutput]
    }
  }

  /**
    * An object representing a virtual node returned by a describe operation.
    */
  @js.native
  trait VirtualNodeData extends js.Object {
    var meshName: ResourceName
    var metadata: ResourceMetadata
    var spec: VirtualNodeSpec
    var status: VirtualNodeStatus
    var virtualNodeName: ResourceName
  }

  object VirtualNodeData {
    def apply(
        meshName: ResourceName,
        metadata: ResourceMetadata,
        spec: VirtualNodeSpec,
        status: VirtualNodeStatus,
        virtualNodeName: ResourceName
    ): VirtualNodeData = {
      val __obj = js.Dynamic.literal(
        "meshName"        -> meshName.asInstanceOf[js.Any],
        "metadata"        -> metadata.asInstanceOf[js.Any],
        "spec"            -> spec.asInstanceOf[js.Any],
        "status"          -> status.asInstanceOf[js.Any],
        "virtualNodeName" -> virtualNodeName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VirtualNodeData]
    }
  }

  /**
    * An object representing a virtual node returned by a list operation.
    */
  @js.native
  trait VirtualNodeRef extends js.Object {
    var arn: Arn
    var meshName: ResourceName
    var virtualNodeName: ResourceName
  }

  object VirtualNodeRef {
    def apply(
        arn: Arn,
        meshName: ResourceName,
        virtualNodeName: ResourceName
    ): VirtualNodeRef = {
      val __obj = js.Dynamic.literal(
        "arn"             -> arn.asInstanceOf[js.Any],
        "meshName"        -> meshName.asInstanceOf[js.Any],
        "virtualNodeName" -> virtualNodeName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VirtualNodeRef]
    }
  }

  /**
    * An object representing a virtual node service provider.
    */
  @js.native
  trait VirtualNodeServiceProvider extends js.Object {
    var virtualNodeName: ResourceName
  }

  object VirtualNodeServiceProvider {
    def apply(
        virtualNodeName: ResourceName
    ): VirtualNodeServiceProvider = {
      val __obj = js.Dynamic.literal(
        "virtualNodeName" -> virtualNodeName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VirtualNodeServiceProvider]
    }
  }

  /**
    * An object representing the specification of a virtual node.
    */
  @js.native
  trait VirtualNodeSpec extends js.Object {
    var backends: js.UndefOr[Backends]
    var listeners: js.UndefOr[Listeners]
    var logging: js.UndefOr[Logging]
    var serviceDiscovery: js.UndefOr[ServiceDiscovery]
  }

  object VirtualNodeSpec {
    def apply(
        backends: js.UndefOr[Backends] = js.undefined,
        listeners: js.UndefOr[Listeners] = js.undefined,
        logging: js.UndefOr[Logging] = js.undefined,
        serviceDiscovery: js.UndefOr[ServiceDiscovery] = js.undefined
    ): VirtualNodeSpec = {
      val __obj = js.Dynamic.literal()
      backends.foreach(__v => __obj.updateDynamic("backends")(__v.asInstanceOf[js.Any]))
      listeners.foreach(__v => __obj.updateDynamic("listeners")(__v.asInstanceOf[js.Any]))
      logging.foreach(__v => __obj.updateDynamic("logging")(__v.asInstanceOf[js.Any]))
      serviceDiscovery.foreach(__v => __obj.updateDynamic("serviceDiscovery")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualNodeSpec]
    }
  }

  /**
    * An object representing the current status of the virtual node.
    */
  @js.native
  trait VirtualNodeStatus extends js.Object {
    var status: VirtualNodeStatusCode
  }

  object VirtualNodeStatus {
    def apply(
        status: VirtualNodeStatusCode
    ): VirtualNodeStatus = {
      val __obj = js.Dynamic.literal(
        "status" -> status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VirtualNodeStatus]
    }
  }

  object VirtualNodeStatusCodeEnum {
    val ACTIVE   = "ACTIVE"
    val DELETED  = "DELETED"
    val INACTIVE = "INACTIVE"

    val values = js.Object.freeze(js.Array(ACTIVE, DELETED, INACTIVE))
  }

  /**
    * An object representing a virtual router returned by a describe operation.
    */
  @js.native
  trait VirtualRouterData extends js.Object {
    var meshName: ResourceName
    var metadata: ResourceMetadata
    var spec: VirtualRouterSpec
    var status: VirtualRouterStatus
    var virtualRouterName: ResourceName
  }

  object VirtualRouterData {
    def apply(
        meshName: ResourceName,
        metadata: ResourceMetadata,
        spec: VirtualRouterSpec,
        status: VirtualRouterStatus,
        virtualRouterName: ResourceName
    ): VirtualRouterData = {
      val __obj = js.Dynamic.literal(
        "meshName"          -> meshName.asInstanceOf[js.Any],
        "metadata"          -> metadata.asInstanceOf[js.Any],
        "spec"              -> spec.asInstanceOf[js.Any],
        "status"            -> status.asInstanceOf[js.Any],
        "virtualRouterName" -> virtualRouterName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VirtualRouterData]
    }
  }

  /**
    * An object representing a virtual router listener.
    */
  @js.native
  trait VirtualRouterListener extends js.Object {
    var portMapping: PortMapping
  }

  object VirtualRouterListener {
    def apply(
        portMapping: PortMapping
    ): VirtualRouterListener = {
      val __obj = js.Dynamic.literal(
        "portMapping" -> portMapping.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VirtualRouterListener]
    }
  }

  /**
    * An object representing a virtual router returned by a list operation.
    */
  @js.native
  trait VirtualRouterRef extends js.Object {
    var arn: Arn
    var meshName: ResourceName
    var virtualRouterName: ResourceName
  }

  object VirtualRouterRef {
    def apply(
        arn: Arn,
        meshName: ResourceName,
        virtualRouterName: ResourceName
    ): VirtualRouterRef = {
      val __obj = js.Dynamic.literal(
        "arn"               -> arn.asInstanceOf[js.Any],
        "meshName"          -> meshName.asInstanceOf[js.Any],
        "virtualRouterName" -> virtualRouterName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VirtualRouterRef]
    }
  }

  /**
    * An object representing a virtual node service provider.
    */
  @js.native
  trait VirtualRouterServiceProvider extends js.Object {
    var virtualRouterName: ResourceName
  }

  object VirtualRouterServiceProvider {
    def apply(
        virtualRouterName: ResourceName
    ): VirtualRouterServiceProvider = {
      val __obj = js.Dynamic.literal(
        "virtualRouterName" -> virtualRouterName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VirtualRouterServiceProvider]
    }
  }

  /**
    * An object representing the specification of a virtual router.
    */
  @js.native
  trait VirtualRouterSpec extends js.Object {
    var listeners: js.UndefOr[VirtualRouterListeners]
  }

  object VirtualRouterSpec {
    def apply(
        listeners: js.UndefOr[VirtualRouterListeners] = js.undefined
    ): VirtualRouterSpec = {
      val __obj = js.Dynamic.literal()
      listeners.foreach(__v => __obj.updateDynamic("listeners")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualRouterSpec]
    }
  }

  /**
    * An object representing the status of a virtual router.
    */
  @js.native
  trait VirtualRouterStatus extends js.Object {
    var status: VirtualRouterStatusCode
  }

  object VirtualRouterStatus {
    def apply(
        status: VirtualRouterStatusCode
    ): VirtualRouterStatus = {
      val __obj = js.Dynamic.literal(
        "status" -> status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VirtualRouterStatus]
    }
  }

  object VirtualRouterStatusCodeEnum {
    val ACTIVE   = "ACTIVE"
    val DELETED  = "DELETED"
    val INACTIVE = "INACTIVE"

    val values = js.Object.freeze(js.Array(ACTIVE, DELETED, INACTIVE))
  }

  /**
    * An object representing a virtual service backend for a virtual node.
    */
  @js.native
  trait VirtualServiceBackend extends js.Object {
    var virtualServiceName: ServiceName
  }

  object VirtualServiceBackend {
    def apply(
        virtualServiceName: ServiceName
    ): VirtualServiceBackend = {
      val __obj = js.Dynamic.literal(
        "virtualServiceName" -> virtualServiceName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VirtualServiceBackend]
    }
  }

  /**
    * An object representing a virtual service returned by a describe operation.
    */
  @js.native
  trait VirtualServiceData extends js.Object {
    var meshName: ResourceName
    var metadata: ResourceMetadata
    var spec: VirtualServiceSpec
    var status: VirtualServiceStatus
    var virtualServiceName: ServiceName
  }

  object VirtualServiceData {
    def apply(
        meshName: ResourceName,
        metadata: ResourceMetadata,
        spec: VirtualServiceSpec,
        status: VirtualServiceStatus,
        virtualServiceName: ServiceName
    ): VirtualServiceData = {
      val __obj = js.Dynamic.literal(
        "meshName"           -> meshName.asInstanceOf[js.Any],
        "metadata"           -> metadata.asInstanceOf[js.Any],
        "spec"               -> spec.asInstanceOf[js.Any],
        "status"             -> status.asInstanceOf[js.Any],
        "virtualServiceName" -> virtualServiceName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VirtualServiceData]
    }
  }

  /**
    * An object representing the provider for a virtual service.
    */
  @js.native
  trait VirtualServiceProvider extends js.Object {
    var virtualNode: js.UndefOr[VirtualNodeServiceProvider]
    var virtualRouter: js.UndefOr[VirtualRouterServiceProvider]
  }

  object VirtualServiceProvider {
    def apply(
        virtualNode: js.UndefOr[VirtualNodeServiceProvider] = js.undefined,
        virtualRouter: js.UndefOr[VirtualRouterServiceProvider] = js.undefined
    ): VirtualServiceProvider = {
      val __obj = js.Dynamic.literal()
      virtualNode.foreach(__v => __obj.updateDynamic("virtualNode")(__v.asInstanceOf[js.Any]))
      virtualRouter.foreach(__v => __obj.updateDynamic("virtualRouter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualServiceProvider]
    }
  }

  /**
    * An object representing a virtual service returned by a list operation.
    */
  @js.native
  trait VirtualServiceRef extends js.Object {
    var arn: Arn
    var meshName: ResourceName
    var virtualServiceName: ServiceName
  }

  object VirtualServiceRef {
    def apply(
        arn: Arn,
        meshName: ResourceName,
        virtualServiceName: ServiceName
    ): VirtualServiceRef = {
      val __obj = js.Dynamic.literal(
        "arn"                -> arn.asInstanceOf[js.Any],
        "meshName"           -> meshName.asInstanceOf[js.Any],
        "virtualServiceName" -> virtualServiceName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VirtualServiceRef]
    }
  }

  /**
    * An object representing the specification of a virtual service.
    */
  @js.native
  trait VirtualServiceSpec extends js.Object {
    var provider: js.UndefOr[VirtualServiceProvider]
  }

  object VirtualServiceSpec {
    def apply(
        provider: js.UndefOr[VirtualServiceProvider] = js.undefined
    ): VirtualServiceSpec = {
      val __obj = js.Dynamic.literal()
      provider.foreach(__v => __obj.updateDynamic("provider")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualServiceSpec]
    }
  }

  /**
    * An object representing the status of a virtual service.
    */
  @js.native
  trait VirtualServiceStatus extends js.Object {
    var status: VirtualServiceStatusCode
  }

  object VirtualServiceStatus {
    def apply(
        status: VirtualServiceStatusCode
    ): VirtualServiceStatus = {
      val __obj = js.Dynamic.literal(
        "status" -> status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VirtualServiceStatus]
    }
  }

  object VirtualServiceStatusCodeEnum {
    val ACTIVE   = "ACTIVE"
    val DELETED  = "DELETED"
    val INACTIVE = "INACTIVE"

    val values = js.Object.freeze(js.Array(ACTIVE, DELETED, INACTIVE))
  }

  /**
    * <p>An object representing a target and its relative weight. Traffic is distributed across
    *          targets according to their relative weight. For example, a weighted target with a relative
    *          weight of 50 receives five times as much traffic as one with a relative weight of
    *          10.</p>
    */
  @js.native
  trait WeightedTarget extends js.Object {
    var virtualNode: ResourceName
    var weight: PercentInt
  }

  object WeightedTarget {
    def apply(
        virtualNode: ResourceName,
        weight: PercentInt
    ): WeightedTarget = {
      val __obj = js.Dynamic.literal(
        "virtualNode" -> virtualNode.asInstanceOf[js.Any],
        "weight"      -> weight.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[WeightedTarget]
    }
  }
}
