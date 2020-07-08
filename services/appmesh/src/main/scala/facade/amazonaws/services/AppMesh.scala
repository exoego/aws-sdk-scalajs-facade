package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object appmesh {
  type AccountId = String
  type Arn = String
  type AwsCloudMapInstanceAttributeKey = String
  type AwsCloudMapInstanceAttributeValue = String
  type AwsCloudMapInstanceAttributes = js.Array[AwsCloudMapInstanceAttribute]
  type AwsCloudMapName = String
  type Backends = js.Array[Backend]
  type CertificateAuthorityArns = js.Array[Arn]
  type DurationValue = Double
  type FilePath = String
  type GrpcRetryPolicyEvents = js.Array[GrpcRetryPolicyEvent]
  type GrpcRouteMetadataList = js.Array[GrpcRouteMetadata]
  type HeaderMatch = String
  type HeaderName = String
  type HealthCheckIntervalMillis = Double
  type HealthCheckThreshold = Int
  type HealthCheckTimeoutMillis = Double
  type Hostname = String
  type HttpRetryPolicyEvent = String
  type HttpRetryPolicyEvents = js.Array[HttpRetryPolicyEvent]
  type HttpRouteHeaders = js.Array[HttpRouteHeader]
  type ListMeshesLimit = Int
  type ListRoutesLimit = Int
  type ListVirtualNodesLimit = Int
  type ListVirtualRoutersLimit = Int
  type ListVirtualServicesLimit = Int
  type Listeners = js.Array[Listener]
  type MaxRetries = Double
  type MeshList = js.Array[MeshRef]
  type MethodName = String
  type PercentInt = Int
  type PortNumber = Int
  type PortSet = js.Array[PortNumber]
  type ResourceName = String
  type RouteList = js.Array[RouteRef]
  type RoutePriority = Int
  type ServiceName = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[TagRef]
  type TagValue = String
  type TagsLimit = Int
  type TcpRetryPolicyEvents = js.Array[TcpRetryPolicyEvent]
  type Timestamp = js.Date
  type VirtualNodeList = js.Array[VirtualNodeRef]
  type VirtualRouterList = js.Array[VirtualRouterRef]
  type VirtualRouterListeners = js.Array[VirtualRouterListener]
  type VirtualServiceList = js.Array[VirtualServiceRef]
  type WeightedTargets = js.Array[WeightedTarget]

  implicit final class AppMeshOps(private val service: AppMesh) extends AnyVal {

    @inline def createMeshFuture(params: CreateMeshInput): Future[CreateMeshOutput] =
      service.createMesh(params).promise().toFuture
    @inline def createRouteFuture(params: CreateRouteInput): Future[CreateRouteOutput] =
      service.createRoute(params).promise().toFuture
    @inline def createVirtualNodeFuture(params: CreateVirtualNodeInput): Future[CreateVirtualNodeOutput] =
      service.createVirtualNode(params).promise().toFuture
    @inline def createVirtualRouterFuture(params: CreateVirtualRouterInput): Future[CreateVirtualRouterOutput] =
      service.createVirtualRouter(params).promise().toFuture
    @inline def createVirtualServiceFuture(params: CreateVirtualServiceInput): Future[CreateVirtualServiceOutput] =
      service.createVirtualService(params).promise().toFuture
    @inline def deleteMeshFuture(params: DeleteMeshInput): Future[DeleteMeshOutput] =
      service.deleteMesh(params).promise().toFuture
    @inline def deleteRouteFuture(params: DeleteRouteInput): Future[DeleteRouteOutput] =
      service.deleteRoute(params).promise().toFuture
    @inline def deleteVirtualNodeFuture(params: DeleteVirtualNodeInput): Future[DeleteVirtualNodeOutput] =
      service.deleteVirtualNode(params).promise().toFuture
    @inline def deleteVirtualRouterFuture(params: DeleteVirtualRouterInput): Future[DeleteVirtualRouterOutput] =
      service.deleteVirtualRouter(params).promise().toFuture
    @inline def deleteVirtualServiceFuture(params: DeleteVirtualServiceInput): Future[DeleteVirtualServiceOutput] =
      service.deleteVirtualService(params).promise().toFuture
    @inline def describeMeshFuture(params: DescribeMeshInput): Future[DescribeMeshOutput] =
      service.describeMesh(params).promise().toFuture
    @inline def describeRouteFuture(params: DescribeRouteInput): Future[DescribeRouteOutput] =
      service.describeRoute(params).promise().toFuture
    @inline def describeVirtualNodeFuture(params: DescribeVirtualNodeInput): Future[DescribeVirtualNodeOutput] =
      service.describeVirtualNode(params).promise().toFuture
    @inline def describeVirtualRouterFuture(params: DescribeVirtualRouterInput): Future[DescribeVirtualRouterOutput] =
      service.describeVirtualRouter(params).promise().toFuture
    @inline def describeVirtualServiceFuture(
        params: DescribeVirtualServiceInput
    ): Future[DescribeVirtualServiceOutput] = service.describeVirtualService(params).promise().toFuture
    @inline def listMeshesFuture(params: ListMeshesInput): Future[ListMeshesOutput] =
      service.listMeshes(params).promise().toFuture
    @inline def listRoutesFuture(params: ListRoutesInput): Future[ListRoutesOutput] =
      service.listRoutes(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] =
      service.listTagsForResource(params).promise().toFuture
    @inline def listVirtualNodesFuture(params: ListVirtualNodesInput): Future[ListVirtualNodesOutput] =
      service.listVirtualNodes(params).promise().toFuture
    @inline def listVirtualRoutersFuture(params: ListVirtualRoutersInput): Future[ListVirtualRoutersOutput] =
      service.listVirtualRouters(params).promise().toFuture
    @inline def listVirtualServicesFuture(params: ListVirtualServicesInput): Future[ListVirtualServicesOutput] =
      service.listVirtualServices(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceInput): Future[TagResourceOutput] =
      service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceInput): Future[UntagResourceOutput] =
      service.untagResource(params).promise().toFuture
    @inline def updateMeshFuture(params: UpdateMeshInput): Future[UpdateMeshOutput] =
      service.updateMesh(params).promise().toFuture
    @inline def updateRouteFuture(params: UpdateRouteInput): Future[UpdateRouteOutput] =
      service.updateRoute(params).promise().toFuture
    @inline def updateVirtualNodeFuture(params: UpdateVirtualNodeInput): Future[UpdateVirtualNodeOutput] =
      service.updateVirtualNode(params).promise().toFuture
    @inline def updateVirtualRouterFuture(params: UpdateVirtualRouterInput): Future[UpdateVirtualRouterOutput] =
      service.updateVirtualRouter(params).promise().toFuture
    @inline def updateVirtualServiceFuture(params: UpdateVirtualServiceInput): Future[UpdateVirtualServiceOutput] =
      service.updateVirtualService(params).promise().toFuture
  }
}

package appmesh {
  @js.native
  @JSImport("aws-sdk", "AppMesh")
  class AppMesh() extends js.Object {
    def this(config: AWSConfig) = this()

    def createMesh(params: CreateMeshInput): Request[CreateMeshOutput] = js.native
    def createRoute(params: CreateRouteInput): Request[CreateRouteOutput] = js.native
    def createVirtualNode(params: CreateVirtualNodeInput): Request[CreateVirtualNodeOutput] = js.native
    def createVirtualRouter(params: CreateVirtualRouterInput): Request[CreateVirtualRouterOutput] = js.native
    def createVirtualService(params: CreateVirtualServiceInput): Request[CreateVirtualServiceOutput] = js.native
    def deleteMesh(params: DeleteMeshInput): Request[DeleteMeshOutput] = js.native
    def deleteRoute(params: DeleteRouteInput): Request[DeleteRouteOutput] = js.native
    def deleteVirtualNode(params: DeleteVirtualNodeInput): Request[DeleteVirtualNodeOutput] = js.native
    def deleteVirtualRouter(params: DeleteVirtualRouterInput): Request[DeleteVirtualRouterOutput] = js.native
    def deleteVirtualService(params: DeleteVirtualServiceInput): Request[DeleteVirtualServiceOutput] = js.native
    def describeMesh(params: DescribeMeshInput): Request[DescribeMeshOutput] = js.native
    def describeRoute(params: DescribeRouteInput): Request[DescribeRouteOutput] = js.native
    def describeVirtualNode(params: DescribeVirtualNodeInput): Request[DescribeVirtualNodeOutput] = js.native
    def describeVirtualRouter(params: DescribeVirtualRouterInput): Request[DescribeVirtualRouterOutput] = js.native
    def describeVirtualService(params: DescribeVirtualServiceInput): Request[DescribeVirtualServiceOutput] = js.native
    def listMeshes(params: ListMeshesInput): Request[ListMeshesOutput] = js.native
    def listRoutes(params: ListRoutesInput): Request[ListRoutesOutput] = js.native
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput] = js.native
    def listVirtualNodes(params: ListVirtualNodesInput): Request[ListVirtualNodesOutput] = js.native
    def listVirtualRouters(params: ListVirtualRoutersInput): Request[ListVirtualRoutersOutput] = js.native
    def listVirtualServices(params: ListVirtualServicesInput): Request[ListVirtualServicesOutput] = js.native
    def tagResource(params: TagResourceInput): Request[TagResourceOutput] = js.native
    def untagResource(params: UntagResourceInput): Request[UntagResourceOutput] = js.native
    def updateMesh(params: UpdateMeshInput): Request[UpdateMeshOutput] = js.native
    def updateRoute(params: UpdateRouteInput): Request[UpdateRouteOutput] = js.native
    def updateVirtualNode(params: UpdateVirtualNodeInput): Request[UpdateVirtualNodeOutput] = js.native
    def updateVirtualRouter(params: UpdateVirtualRouterInput): Request[UpdateVirtualRouterOutput] = js.native
    def updateVirtualService(params: UpdateVirtualServiceInput): Request[UpdateVirtualServiceOutput] = js.native
  }

  /**
    * An object that represents the access logging information for a virtual node.
    */
  @js.native
  trait AccessLog extends js.Object {
    var file: js.UndefOr[FileAccessLog]
  }

  object AccessLog {
    @inline
    def apply(
        file: js.UndefOr[FileAccessLog] = js.undefined
    ): AccessLog = {
      val __obj = js.Dynamic.literal()
      file.foreach(__v => __obj.updateDynamic("file")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AccessLog]
    }
  }

  /**
    * <p>An object that represents the AWS Cloud Map attribute information for your virtual
    *          node.</p>
    */
  @js.native
  trait AwsCloudMapInstanceAttribute extends js.Object {
    var key: AwsCloudMapInstanceAttributeKey
    var value: AwsCloudMapInstanceAttributeValue
  }

  object AwsCloudMapInstanceAttribute {
    @inline
    def apply(
        key: AwsCloudMapInstanceAttributeKey,
        value: AwsCloudMapInstanceAttributeValue
    ): AwsCloudMapInstanceAttribute = {
      val __obj = js.Dynamic.literal(
        "key" -> key.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[AwsCloudMapInstanceAttribute]
    }
  }

  /**
    * <p>An object that represents the AWS Cloud Map service discovery information for your virtual
    *          node.</p>
    */
  @js.native
  trait AwsCloudMapServiceDiscovery extends js.Object {
    var namespaceName: AwsCloudMapName
    var serviceName: AwsCloudMapName
    var attributes: js.UndefOr[AwsCloudMapInstanceAttributes]
  }

  object AwsCloudMapServiceDiscovery {
    @inline
    def apply(
        namespaceName: AwsCloudMapName,
        serviceName: AwsCloudMapName,
        attributes: js.UndefOr[AwsCloudMapInstanceAttributes] = js.undefined
    ): AwsCloudMapServiceDiscovery = {
      val __obj = js.Dynamic.literal(
        "namespaceName" -> namespaceName.asInstanceOf[js.Any],
        "serviceName" -> serviceName.asInstanceOf[js.Any]
      )

      attributes.foreach(__v => __obj.updateDynamic("attributes")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[AwsCloudMapServiceDiscovery]
    }
  }

  /**
    * <p>An object that represents the backends that a virtual node is expected to send outbound
    *          traffic to. </p>
    */
  @js.native
  trait Backend extends js.Object {
    var virtualService: js.UndefOr[VirtualServiceBackend]
  }

  object Backend {
    @inline
    def apply(
        virtualService: js.UndefOr[VirtualServiceBackend] = js.undefined
    ): Backend = {
      val __obj = js.Dynamic.literal()
      virtualService.foreach(__v => __obj.updateDynamic("virtualService")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Backend]
    }
  }

  /**
    * An object that represents the default properties for a backend.
    */
  @js.native
  trait BackendDefaults extends js.Object {
    var clientPolicy: js.UndefOr[ClientPolicy]
  }

  object BackendDefaults {
    @inline
    def apply(
        clientPolicy: js.UndefOr[ClientPolicy] = js.undefined
    ): BackendDefaults = {
      val __obj = js.Dynamic.literal()
      clientPolicy.foreach(__v => __obj.updateDynamic("clientPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[BackendDefaults]
    }
  }

  /**
    * An object that represents a client policy.
    */
  @js.native
  trait ClientPolicy extends js.Object {
    var tls: js.UndefOr[ClientPolicyTls]
  }

  object ClientPolicy {
    @inline
    def apply(
        tls: js.UndefOr[ClientPolicyTls] = js.undefined
    ): ClientPolicy = {
      val __obj = js.Dynamic.literal()
      tls.foreach(__v => __obj.updateDynamic("tls")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClientPolicy]
    }
  }

  /**
    * An object that represents a Transport Layer Security (TLS) client policy.
    */
  @js.native
  trait ClientPolicyTls extends js.Object {
    var validation: TlsValidationContext
    var enforce: js.UndefOr[Boolean]
    var ports: js.UndefOr[PortSet]
  }

  object ClientPolicyTls {
    @inline
    def apply(
        validation: TlsValidationContext,
        enforce: js.UndefOr[Boolean] = js.undefined,
        ports: js.UndefOr[PortSet] = js.undefined
    ): ClientPolicyTls = {
      val __obj = js.Dynamic.literal(
        "validation" -> validation.asInstanceOf[js.Any]
      )

      enforce.foreach(__v => __obj.updateDynamic("enforce")(__v.asInstanceOf[js.Any]))
      ports.foreach(__v => __obj.updateDynamic("ports")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClientPolicyTls]
    }
  }

  /**
    */
  @js.native
  trait CreateMeshInput extends js.Object {
    var meshName: ResourceName
    var clientToken: js.UndefOr[String]
    var spec: js.UndefOr[MeshSpec]
    var tags: js.UndefOr[TagList]
  }

  object CreateMeshInput {
    @inline
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
    */
  @js.native
  trait CreateMeshOutput extends js.Object {
    var mesh: MeshData
  }

  object CreateMeshOutput {
    @inline
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
    */
  @js.native
  trait CreateRouteInput extends js.Object {
    var meshName: ResourceName
    var routeName: ResourceName
    var spec: RouteSpec
    var virtualRouterName: ResourceName
    var clientToken: js.UndefOr[String]
    var meshOwner: js.UndefOr[AccountId]
    var tags: js.UndefOr[TagList]
  }

  object CreateRouteInput {
    @inline
    def apply(
        meshName: ResourceName,
        routeName: ResourceName,
        spec: RouteSpec,
        virtualRouterName: ResourceName,
        clientToken: js.UndefOr[String] = js.undefined,
        meshOwner: js.UndefOr[AccountId] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateRouteInput = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any],
        "routeName" -> routeName.asInstanceOf[js.Any],
        "spec" -> spec.asInstanceOf[js.Any],
        "virtualRouterName" -> virtualRouterName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      meshOwner.foreach(__v => __obj.updateDynamic("meshOwner")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateRouteInput]
    }
  }

  /**
    */
  @js.native
  trait CreateRouteOutput extends js.Object {
    var route: RouteData
  }

  object CreateRouteOutput {
    @inline
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
    */
  @js.native
  trait CreateVirtualNodeInput extends js.Object {
    var meshName: ResourceName
    var spec: VirtualNodeSpec
    var virtualNodeName: ResourceName
    var clientToken: js.UndefOr[String]
    var meshOwner: js.UndefOr[AccountId]
    var tags: js.UndefOr[TagList]
  }

  object CreateVirtualNodeInput {
    @inline
    def apply(
        meshName: ResourceName,
        spec: VirtualNodeSpec,
        virtualNodeName: ResourceName,
        clientToken: js.UndefOr[String] = js.undefined,
        meshOwner: js.UndefOr[AccountId] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateVirtualNodeInput = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any],
        "spec" -> spec.asInstanceOf[js.Any],
        "virtualNodeName" -> virtualNodeName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      meshOwner.foreach(__v => __obj.updateDynamic("meshOwner")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVirtualNodeInput]
    }
  }

  /**
    */
  @js.native
  trait CreateVirtualNodeOutput extends js.Object {
    var virtualNode: VirtualNodeData
  }

  object CreateVirtualNodeOutput {
    @inline
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
    */
  @js.native
  trait CreateVirtualRouterInput extends js.Object {
    var meshName: ResourceName
    var spec: VirtualRouterSpec
    var virtualRouterName: ResourceName
    var clientToken: js.UndefOr[String]
    var meshOwner: js.UndefOr[AccountId]
    var tags: js.UndefOr[TagList]
  }

  object CreateVirtualRouterInput {
    @inline
    def apply(
        meshName: ResourceName,
        spec: VirtualRouterSpec,
        virtualRouterName: ResourceName,
        clientToken: js.UndefOr[String] = js.undefined,
        meshOwner: js.UndefOr[AccountId] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateVirtualRouterInput = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any],
        "spec" -> spec.asInstanceOf[js.Any],
        "virtualRouterName" -> virtualRouterName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      meshOwner.foreach(__v => __obj.updateDynamic("meshOwner")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVirtualRouterInput]
    }
  }

  /**
    */
  @js.native
  trait CreateVirtualRouterOutput extends js.Object {
    var virtualRouter: VirtualRouterData
  }

  object CreateVirtualRouterOutput {
    @inline
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
    */
  @js.native
  trait CreateVirtualServiceInput extends js.Object {
    var meshName: ResourceName
    var spec: VirtualServiceSpec
    var virtualServiceName: ServiceName
    var clientToken: js.UndefOr[String]
    var meshOwner: js.UndefOr[AccountId]
    var tags: js.UndefOr[TagList]
  }

  object CreateVirtualServiceInput {
    @inline
    def apply(
        meshName: ResourceName,
        spec: VirtualServiceSpec,
        virtualServiceName: ServiceName,
        clientToken: js.UndefOr[String] = js.undefined,
        meshOwner: js.UndefOr[AccountId] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateVirtualServiceInput = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any],
        "spec" -> spec.asInstanceOf[js.Any],
        "virtualServiceName" -> virtualServiceName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      meshOwner.foreach(__v => __obj.updateDynamic("meshOwner")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVirtualServiceInput]
    }
  }

  /**
    */
  @js.native
  trait CreateVirtualServiceOutput extends js.Object {
    var virtualService: VirtualServiceData
  }

  object CreateVirtualServiceOutput {
    @inline
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
    */
  @js.native
  trait DeleteMeshInput extends js.Object {
    var meshName: ResourceName
  }

  object DeleteMeshInput {
    @inline
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
    */
  @js.native
  trait DeleteMeshOutput extends js.Object {
    var mesh: MeshData
  }

  object DeleteMeshOutput {
    @inline
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
    */
  @js.native
  trait DeleteRouteInput extends js.Object {
    var meshName: ResourceName
    var routeName: ResourceName
    var virtualRouterName: ResourceName
    var meshOwner: js.UndefOr[AccountId]
  }

  object DeleteRouteInput {
    @inline
    def apply(
        meshName: ResourceName,
        routeName: ResourceName,
        virtualRouterName: ResourceName,
        meshOwner: js.UndefOr[AccountId] = js.undefined
    ): DeleteRouteInput = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any],
        "routeName" -> routeName.asInstanceOf[js.Any],
        "virtualRouterName" -> virtualRouterName.asInstanceOf[js.Any]
      )

      meshOwner.foreach(__v => __obj.updateDynamic("meshOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteRouteInput]
    }
  }

  /**
    */
  @js.native
  trait DeleteRouteOutput extends js.Object {
    var route: RouteData
  }

  object DeleteRouteOutput {
    @inline
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
    */
  @js.native
  trait DeleteVirtualNodeInput extends js.Object {
    var meshName: ResourceName
    var virtualNodeName: ResourceName
    var meshOwner: js.UndefOr[AccountId]
  }

  object DeleteVirtualNodeInput {
    @inline
    def apply(
        meshName: ResourceName,
        virtualNodeName: ResourceName,
        meshOwner: js.UndefOr[AccountId] = js.undefined
    ): DeleteVirtualNodeInput = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any],
        "virtualNodeName" -> virtualNodeName.asInstanceOf[js.Any]
      )

      meshOwner.foreach(__v => __obj.updateDynamic("meshOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteVirtualNodeInput]
    }
  }

  /**
    */
  @js.native
  trait DeleteVirtualNodeOutput extends js.Object {
    var virtualNode: VirtualNodeData
  }

  object DeleteVirtualNodeOutput {
    @inline
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
    */
  @js.native
  trait DeleteVirtualRouterInput extends js.Object {
    var meshName: ResourceName
    var virtualRouterName: ResourceName
    var meshOwner: js.UndefOr[AccountId]
  }

  object DeleteVirtualRouterInput {
    @inline
    def apply(
        meshName: ResourceName,
        virtualRouterName: ResourceName,
        meshOwner: js.UndefOr[AccountId] = js.undefined
    ): DeleteVirtualRouterInput = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any],
        "virtualRouterName" -> virtualRouterName.asInstanceOf[js.Any]
      )

      meshOwner.foreach(__v => __obj.updateDynamic("meshOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteVirtualRouterInput]
    }
  }

  /**
    */
  @js.native
  trait DeleteVirtualRouterOutput extends js.Object {
    var virtualRouter: VirtualRouterData
  }

  object DeleteVirtualRouterOutput {
    @inline
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
    */
  @js.native
  trait DeleteVirtualServiceInput extends js.Object {
    var meshName: ResourceName
    var virtualServiceName: ServiceName
    var meshOwner: js.UndefOr[AccountId]
  }

  object DeleteVirtualServiceInput {
    @inline
    def apply(
        meshName: ResourceName,
        virtualServiceName: ServiceName,
        meshOwner: js.UndefOr[AccountId] = js.undefined
    ): DeleteVirtualServiceInput = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any],
        "virtualServiceName" -> virtualServiceName.asInstanceOf[js.Any]
      )

      meshOwner.foreach(__v => __obj.updateDynamic("meshOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteVirtualServiceInput]
    }
  }

  /**
    */
  @js.native
  trait DeleteVirtualServiceOutput extends js.Object {
    var virtualService: VirtualServiceData
  }

  object DeleteVirtualServiceOutput {
    @inline
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
    */
  @js.native
  trait DescribeMeshInput extends js.Object {
    var meshName: ResourceName
    var meshOwner: js.UndefOr[AccountId]
  }

  object DescribeMeshInput {
    @inline
    def apply(
        meshName: ResourceName,
        meshOwner: js.UndefOr[AccountId] = js.undefined
    ): DescribeMeshInput = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any]
      )

      meshOwner.foreach(__v => __obj.updateDynamic("meshOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeMeshInput]
    }
  }

  /**
    */
  @js.native
  trait DescribeMeshOutput extends js.Object {
    var mesh: MeshData
  }

  object DescribeMeshOutput {
    @inline
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
    */
  @js.native
  trait DescribeRouteInput extends js.Object {
    var meshName: ResourceName
    var routeName: ResourceName
    var virtualRouterName: ResourceName
    var meshOwner: js.UndefOr[AccountId]
  }

  object DescribeRouteInput {
    @inline
    def apply(
        meshName: ResourceName,
        routeName: ResourceName,
        virtualRouterName: ResourceName,
        meshOwner: js.UndefOr[AccountId] = js.undefined
    ): DescribeRouteInput = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any],
        "routeName" -> routeName.asInstanceOf[js.Any],
        "virtualRouterName" -> virtualRouterName.asInstanceOf[js.Any]
      )

      meshOwner.foreach(__v => __obj.updateDynamic("meshOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeRouteInput]
    }
  }

  /**
    */
  @js.native
  trait DescribeRouteOutput extends js.Object {
    var route: RouteData
  }

  object DescribeRouteOutput {
    @inline
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
    */
  @js.native
  trait DescribeVirtualNodeInput extends js.Object {
    var meshName: ResourceName
    var virtualNodeName: ResourceName
    var meshOwner: js.UndefOr[AccountId]
  }

  object DescribeVirtualNodeInput {
    @inline
    def apply(
        meshName: ResourceName,
        virtualNodeName: ResourceName,
        meshOwner: js.UndefOr[AccountId] = js.undefined
    ): DescribeVirtualNodeInput = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any],
        "virtualNodeName" -> virtualNodeName.asInstanceOf[js.Any]
      )

      meshOwner.foreach(__v => __obj.updateDynamic("meshOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeVirtualNodeInput]
    }
  }

  /**
    */
  @js.native
  trait DescribeVirtualNodeOutput extends js.Object {
    var virtualNode: VirtualNodeData
  }

  object DescribeVirtualNodeOutput {
    @inline
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
    */
  @js.native
  trait DescribeVirtualRouterInput extends js.Object {
    var meshName: ResourceName
    var virtualRouterName: ResourceName
    var meshOwner: js.UndefOr[AccountId]
  }

  object DescribeVirtualRouterInput {
    @inline
    def apply(
        meshName: ResourceName,
        virtualRouterName: ResourceName,
        meshOwner: js.UndefOr[AccountId] = js.undefined
    ): DescribeVirtualRouterInput = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any],
        "virtualRouterName" -> virtualRouterName.asInstanceOf[js.Any]
      )

      meshOwner.foreach(__v => __obj.updateDynamic("meshOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeVirtualRouterInput]
    }
  }

  /**
    */
  @js.native
  trait DescribeVirtualRouterOutput extends js.Object {
    var virtualRouter: VirtualRouterData
  }

  object DescribeVirtualRouterOutput {
    @inline
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
    */
  @js.native
  trait DescribeVirtualServiceInput extends js.Object {
    var meshName: ResourceName
    var virtualServiceName: ServiceName
    var meshOwner: js.UndefOr[AccountId]
  }

  object DescribeVirtualServiceInput {
    @inline
    def apply(
        meshName: ResourceName,
        virtualServiceName: ServiceName,
        meshOwner: js.UndefOr[AccountId] = js.undefined
    ): DescribeVirtualServiceInput = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any],
        "virtualServiceName" -> virtualServiceName.asInstanceOf[js.Any]
      )

      meshOwner.foreach(__v => __obj.updateDynamic("meshOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeVirtualServiceInput]
    }
  }

  /**
    */
  @js.native
  trait DescribeVirtualServiceOutput extends js.Object {
    var virtualService: VirtualServiceData
  }

  object DescribeVirtualServiceOutput {
    @inline
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
    * <p>An object that represents the DNS service discovery information for your virtual
    *          node.</p>
    */
  @js.native
  trait DnsServiceDiscovery extends js.Object {
    var hostname: Hostname
  }

  object DnsServiceDiscovery {
    @inline
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
    * An object that represents a duration of time.
    */
  @js.native
  trait Duration extends js.Object {
    var unit: js.UndefOr[DurationUnit]
    var value: js.UndefOr[DurationValue]
  }

  object Duration {
    @inline
    def apply(
        unit: js.UndefOr[DurationUnit] = js.undefined,
        value: js.UndefOr[DurationValue] = js.undefined
    ): Duration = {
      val __obj = js.Dynamic.literal()
      unit.foreach(__v => __obj.updateDynamic("unit")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Duration]
    }
  }

  @js.native
  sealed trait DurationUnit extends js.Any
  object DurationUnit extends js.Object {
    val ms = "ms".asInstanceOf[DurationUnit]
    val s = "s".asInstanceOf[DurationUnit]

    val values = js.Object.freeze(js.Array(ms, s))
  }

  /**
    * An object that represents the egress filter rules for a service mesh.
    */
  @js.native
  trait EgressFilter extends js.Object {
    var `type`: EgressFilterType
  }

  object EgressFilter {
    @inline
    def apply(
        `type`: EgressFilterType
    ): EgressFilter = {
      val __obj = js.Dynamic.literal(
        "type" -> `type`.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[EgressFilter]
    }
  }

  @js.native
  sealed trait EgressFilterType extends js.Any
  object EgressFilterType extends js.Object {
    val ALLOW_ALL = "ALLOW_ALL".asInstanceOf[EgressFilterType]
    val DROP_ALL = "DROP_ALL".asInstanceOf[EgressFilterType]

    val values = js.Object.freeze(js.Array(ALLOW_ALL, DROP_ALL))
  }

  /**
    * An object that represents an access log file.
    */
  @js.native
  trait FileAccessLog extends js.Object {
    var path: FilePath
  }

  object FileAccessLog {
    @inline
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
    * An object that represents a retry policy. Specify at least one value for at least one of the types of <code>RetryEvents</code>, a value for <code>maxRetries</code>, and a value for <code>perRetryTimeout</code>.
    */
  @js.native
  trait GrpcRetryPolicy extends js.Object {
    var maxRetries: MaxRetries
    var perRetryTimeout: Duration
    var grpcRetryEvents: js.UndefOr[GrpcRetryPolicyEvents]
    var httpRetryEvents: js.UndefOr[HttpRetryPolicyEvents]
    var tcpRetryEvents: js.UndefOr[TcpRetryPolicyEvents]
  }

  object GrpcRetryPolicy {
    @inline
    def apply(
        maxRetries: MaxRetries,
        perRetryTimeout: Duration,
        grpcRetryEvents: js.UndefOr[GrpcRetryPolicyEvents] = js.undefined,
        httpRetryEvents: js.UndefOr[HttpRetryPolicyEvents] = js.undefined,
        tcpRetryEvents: js.UndefOr[TcpRetryPolicyEvents] = js.undefined
    ): GrpcRetryPolicy = {
      val __obj = js.Dynamic.literal(
        "maxRetries" -> maxRetries.asInstanceOf[js.Any],
        "perRetryTimeout" -> perRetryTimeout.asInstanceOf[js.Any]
      )

      grpcRetryEvents.foreach(__v => __obj.updateDynamic("grpcRetryEvents")(__v.asInstanceOf[js.Any]))
      httpRetryEvents.foreach(__v => __obj.updateDynamic("httpRetryEvents")(__v.asInstanceOf[js.Any]))
      tcpRetryEvents.foreach(__v => __obj.updateDynamic("tcpRetryEvents")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GrpcRetryPolicy]
    }
  }

  @js.native
  sealed trait GrpcRetryPolicyEvent extends js.Any
  object GrpcRetryPolicyEvent extends js.Object {
    val cancelled = "cancelled".asInstanceOf[GrpcRetryPolicyEvent]
    val `deadline-exceeded` = "deadline-exceeded".asInstanceOf[GrpcRetryPolicyEvent]
    val internal = "internal".asInstanceOf[GrpcRetryPolicyEvent]
    val `resource-exhausted` = "resource-exhausted".asInstanceOf[GrpcRetryPolicyEvent]
    val unavailable = "unavailable".asInstanceOf[GrpcRetryPolicyEvent]

    val values = js.Object.freeze(js.Array(cancelled, `deadline-exceeded`, internal, `resource-exhausted`, unavailable))
  }

  /**
    * An object that represents a gRPC route type.
    */
  @js.native
  trait GrpcRoute extends js.Object {
    var action: GrpcRouteAction
    var `match`: GrpcRouteMatch
    var retryPolicy: js.UndefOr[GrpcRetryPolicy]
    var timeout: js.UndefOr[GrpcTimeout]
  }

  object GrpcRoute {
    @inline
    def apply(
        action: GrpcRouteAction,
        `match`: GrpcRouteMatch,
        retryPolicy: js.UndefOr[GrpcRetryPolicy] = js.undefined,
        timeout: js.UndefOr[GrpcTimeout] = js.undefined
    ): GrpcRoute = {
      val __obj = js.Dynamic.literal(
        "action" -> action.asInstanceOf[js.Any],
        "match" -> `match`.asInstanceOf[js.Any]
      )

      retryPolicy.foreach(__v => __obj.updateDynamic("retryPolicy")(__v.asInstanceOf[js.Any]))
      timeout.foreach(__v => __obj.updateDynamic("timeout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GrpcRoute]
    }
  }

  /**
    * An object that represents the action to take if a match is determined.
    */
  @js.native
  trait GrpcRouteAction extends js.Object {
    var weightedTargets: WeightedTargets
  }

  object GrpcRouteAction {
    @inline
    def apply(
        weightedTargets: WeightedTargets
    ): GrpcRouteAction = {
      val __obj = js.Dynamic.literal(
        "weightedTargets" -> weightedTargets.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GrpcRouteAction]
    }
  }

  /**
    * An object that represents the criteria for determining a request match.
    */
  @js.native
  trait GrpcRouteMatch extends js.Object {
    var metadata: js.UndefOr[GrpcRouteMetadataList]
    var methodName: js.UndefOr[MethodName]
    var serviceName: js.UndefOr[ServiceName]
  }

  object GrpcRouteMatch {
    @inline
    def apply(
        metadata: js.UndefOr[GrpcRouteMetadataList] = js.undefined,
        methodName: js.UndefOr[MethodName] = js.undefined,
        serviceName: js.UndefOr[ServiceName] = js.undefined
    ): GrpcRouteMatch = {
      val __obj = js.Dynamic.literal()
      metadata.foreach(__v => __obj.updateDynamic("metadata")(__v.asInstanceOf[js.Any]))
      methodName.foreach(__v => __obj.updateDynamic("methodName")(__v.asInstanceOf[js.Any]))
      serviceName.foreach(__v => __obj.updateDynamic("serviceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GrpcRouteMatch]
    }
  }

  /**
    * An object that represents the match metadata for the route.
    */
  @js.native
  trait GrpcRouteMetadata extends js.Object {
    var name: HeaderName
    var invert: js.UndefOr[Boolean]
    var `match`: js.UndefOr[GrpcRouteMetadataMatchMethod]
  }

  object GrpcRouteMetadata {
    @inline
    def apply(
        name: HeaderName,
        invert: js.UndefOr[Boolean] = js.undefined,
        `match`: js.UndefOr[GrpcRouteMetadataMatchMethod] = js.undefined
    ): GrpcRouteMetadata = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      invert.foreach(__v => __obj.updateDynamic("invert")(__v.asInstanceOf[js.Any]))
      `match`.foreach(__v => __obj.updateDynamic("match")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GrpcRouteMetadata]
    }
  }

  /**
    * An object that represents the match method. Specify one of the match values.
    */
  @js.native
  trait GrpcRouteMetadataMatchMethod extends js.Object {
    var exact: js.UndefOr[HeaderMatch]
    var prefix: js.UndefOr[HeaderMatch]
    var range: js.UndefOr[MatchRange]
    var regex: js.UndefOr[HeaderMatch]
    var suffix: js.UndefOr[HeaderMatch]
  }

  object GrpcRouteMetadataMatchMethod {
    @inline
    def apply(
        exact: js.UndefOr[HeaderMatch] = js.undefined,
        prefix: js.UndefOr[HeaderMatch] = js.undefined,
        range: js.UndefOr[MatchRange] = js.undefined,
        regex: js.UndefOr[HeaderMatch] = js.undefined,
        suffix: js.UndefOr[HeaderMatch] = js.undefined
    ): GrpcRouteMetadataMatchMethod = {
      val __obj = js.Dynamic.literal()
      exact.foreach(__v => __obj.updateDynamic("exact")(__v.asInstanceOf[js.Any]))
      prefix.foreach(__v => __obj.updateDynamic("prefix")(__v.asInstanceOf[js.Any]))
      range.foreach(__v => __obj.updateDynamic("range")(__v.asInstanceOf[js.Any]))
      regex.foreach(__v => __obj.updateDynamic("regex")(__v.asInstanceOf[js.Any]))
      suffix.foreach(__v => __obj.updateDynamic("suffix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GrpcRouteMetadataMatchMethod]
    }
  }

  @js.native
  trait GrpcTimeout extends js.Object {
    var idle: js.UndefOr[Duration]
    var perRequest: js.UndefOr[Duration]
  }

  object GrpcTimeout {
    @inline
    def apply(
        idle: js.UndefOr[Duration] = js.undefined,
        perRequest: js.UndefOr[Duration] = js.undefined
    ): GrpcTimeout = {
      val __obj = js.Dynamic.literal()
      idle.foreach(__v => __obj.updateDynamic("idle")(__v.asInstanceOf[js.Any]))
      perRequest.foreach(__v => __obj.updateDynamic("perRequest")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GrpcTimeout]
    }
  }

  /**
    * <p>An object that represents the method and value to match with the header value sent in a
    *          request. Specify one match method.</p>
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
    @inline
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
    * An object that represents the health check policy for a virtual node's listener.
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
    @inline
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
        "healthyThreshold" -> healthyThreshold.asInstanceOf[js.Any],
        "intervalMillis" -> intervalMillis.asInstanceOf[js.Any],
        "protocol" -> protocol.asInstanceOf[js.Any],
        "timeoutMillis" -> timeoutMillis.asInstanceOf[js.Any],
        "unhealthyThreshold" -> unhealthyThreshold.asInstanceOf[js.Any]
      )

      path.foreach(__v => __obj.updateDynamic("path")(__v.asInstanceOf[js.Any]))
      port.foreach(__v => __obj.updateDynamic("port")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HealthCheckPolicy]
    }
  }

  @js.native
  sealed trait HttpMethod extends js.Any
  object HttpMethod extends js.Object {
    val CONNECT = "CONNECT".asInstanceOf[HttpMethod]
    val DELETE = "DELETE".asInstanceOf[HttpMethod]
    val GET = "GET".asInstanceOf[HttpMethod]
    val HEAD = "HEAD".asInstanceOf[HttpMethod]
    val OPTIONS = "OPTIONS".asInstanceOf[HttpMethod]
    val PATCH = "PATCH".asInstanceOf[HttpMethod]
    val POST = "POST".asInstanceOf[HttpMethod]
    val PUT = "PUT".asInstanceOf[HttpMethod]
    val TRACE = "TRACE".asInstanceOf[HttpMethod]

    val values = js.Object.freeze(js.Array(CONNECT, DELETE, GET, HEAD, OPTIONS, PATCH, POST, PUT, TRACE))
  }

  /**
    * An object that represents a retry policy. Specify at least one value for at least one of the types of <code>RetryEvents</code>, a value for <code>maxRetries</code>, and a value for <code>perRetryTimeout</code>.
    */
  @js.native
  trait HttpRetryPolicy extends js.Object {
    var maxRetries: MaxRetries
    var perRetryTimeout: Duration
    var httpRetryEvents: js.UndefOr[HttpRetryPolicyEvents]
    var tcpRetryEvents: js.UndefOr[TcpRetryPolicyEvents]
  }

  object HttpRetryPolicy {
    @inline
    def apply(
        maxRetries: MaxRetries,
        perRetryTimeout: Duration,
        httpRetryEvents: js.UndefOr[HttpRetryPolicyEvents] = js.undefined,
        tcpRetryEvents: js.UndefOr[TcpRetryPolicyEvents] = js.undefined
    ): HttpRetryPolicy = {
      val __obj = js.Dynamic.literal(
        "maxRetries" -> maxRetries.asInstanceOf[js.Any],
        "perRetryTimeout" -> perRetryTimeout.asInstanceOf[js.Any]
      )

      httpRetryEvents.foreach(__v => __obj.updateDynamic("httpRetryEvents")(__v.asInstanceOf[js.Any]))
      tcpRetryEvents.foreach(__v => __obj.updateDynamic("tcpRetryEvents")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HttpRetryPolicy]
    }
  }

  /**
    * An object that represents an HTTP or HTTP/2 route type.
    */
  @js.native
  trait HttpRoute extends js.Object {
    var action: HttpRouteAction
    var `match`: HttpRouteMatch
    var retryPolicy: js.UndefOr[HttpRetryPolicy]
    var timeout: js.UndefOr[HttpTimeout]
  }

  object HttpRoute {
    @inline
    def apply(
        action: HttpRouteAction,
        `match`: HttpRouteMatch,
        retryPolicy: js.UndefOr[HttpRetryPolicy] = js.undefined,
        timeout: js.UndefOr[HttpTimeout] = js.undefined
    ): HttpRoute = {
      val __obj = js.Dynamic.literal(
        "action" -> action.asInstanceOf[js.Any],
        "match" -> `match`.asInstanceOf[js.Any]
      )

      retryPolicy.foreach(__v => __obj.updateDynamic("retryPolicy")(__v.asInstanceOf[js.Any]))
      timeout.foreach(__v => __obj.updateDynamic("timeout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HttpRoute]
    }
  }

  /**
    * An object that represents the action to take if a match is determined.
    */
  @js.native
  trait HttpRouteAction extends js.Object {
    var weightedTargets: WeightedTargets
  }

  object HttpRouteAction {
    @inline
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
    * An object that represents the HTTP header in the request.
    */
  @js.native
  trait HttpRouteHeader extends js.Object {
    var name: HeaderName
    var invert: js.UndefOr[Boolean]
    var `match`: js.UndefOr[HeaderMatchMethod]
  }

  object HttpRouteHeader {
    @inline
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
    * <p>An object that represents the requirements for a route to match HTTP requests for a
    *          virtual router.</p>
    */
  @js.native
  trait HttpRouteMatch extends js.Object {
    var prefix: String
    var headers: js.UndefOr[HttpRouteHeaders]
    var method: js.UndefOr[HttpMethod]
    var scheme: js.UndefOr[HttpScheme]
  }

  object HttpRouteMatch {
    @inline
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

  @js.native
  sealed trait HttpScheme extends js.Any
  object HttpScheme extends js.Object {
    val http = "http".asInstanceOf[HttpScheme]
    val https = "https".asInstanceOf[HttpScheme]

    val values = js.Object.freeze(js.Array(http, https))
  }

  @js.native
  trait HttpTimeout extends js.Object {
    var idle: js.UndefOr[Duration]
    var perRequest: js.UndefOr[Duration]
  }

  object HttpTimeout {
    @inline
    def apply(
        idle: js.UndefOr[Duration] = js.undefined,
        perRequest: js.UndefOr[Duration] = js.undefined
    ): HttpTimeout = {
      val __obj = js.Dynamic.literal()
      idle.foreach(__v => __obj.updateDynamic("idle")(__v.asInstanceOf[js.Any]))
      perRequest.foreach(__v => __obj.updateDynamic("perRequest")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HttpTimeout]
    }
  }

  /**
    */
  @js.native
  trait ListMeshesInput extends js.Object {
    var limit: js.UndefOr[ListMeshesLimit]
    var nextToken: js.UndefOr[String]
  }

  object ListMeshesInput {
    @inline
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
    */
  @js.native
  trait ListMeshesOutput extends js.Object {
    var meshes: MeshList
    var nextToken: js.UndefOr[String]
  }

  object ListMeshesOutput {
    @inline
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
    */
  @js.native
  trait ListRoutesInput extends js.Object {
    var meshName: ResourceName
    var virtualRouterName: ResourceName
    var limit: js.UndefOr[ListRoutesLimit]
    var meshOwner: js.UndefOr[AccountId]
    var nextToken: js.UndefOr[String]
  }

  object ListRoutesInput {
    @inline
    def apply(
        meshName: ResourceName,
        virtualRouterName: ResourceName,
        limit: js.UndefOr[ListRoutesLimit] = js.undefined,
        meshOwner: js.UndefOr[AccountId] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListRoutesInput = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any],
        "virtualRouterName" -> virtualRouterName.asInstanceOf[js.Any]
      )

      limit.foreach(__v => __obj.updateDynamic("limit")(__v.asInstanceOf[js.Any]))
      meshOwner.foreach(__v => __obj.updateDynamic("meshOwner")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListRoutesInput]
    }
  }

  /**
    */
  @js.native
  trait ListRoutesOutput extends js.Object {
    var routes: RouteList
    var nextToken: js.UndefOr[String]
  }

  object ListRoutesOutput {
    @inline
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
    */
  @js.native
  trait ListTagsForResourceInput extends js.Object {
    var resourceArn: Arn
    var limit: js.UndefOr[TagsLimit]
    var nextToken: js.UndefOr[String]
  }

  object ListTagsForResourceInput {
    @inline
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
    */
  @js.native
  trait ListTagsForResourceOutput extends js.Object {
    var tags: TagList
    var nextToken: js.UndefOr[String]
  }

  object ListTagsForResourceOutput {
    @inline
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
    */
  @js.native
  trait ListVirtualNodesInput extends js.Object {
    var meshName: ResourceName
    var limit: js.UndefOr[ListVirtualNodesLimit]
    var meshOwner: js.UndefOr[AccountId]
    var nextToken: js.UndefOr[String]
  }

  object ListVirtualNodesInput {
    @inline
    def apply(
        meshName: ResourceName,
        limit: js.UndefOr[ListVirtualNodesLimit] = js.undefined,
        meshOwner: js.UndefOr[AccountId] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListVirtualNodesInput = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any]
      )

      limit.foreach(__v => __obj.updateDynamic("limit")(__v.asInstanceOf[js.Any]))
      meshOwner.foreach(__v => __obj.updateDynamic("meshOwner")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVirtualNodesInput]
    }
  }

  /**
    */
  @js.native
  trait ListVirtualNodesOutput extends js.Object {
    var virtualNodes: VirtualNodeList
    var nextToken: js.UndefOr[String]
  }

  object ListVirtualNodesOutput {
    @inline
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
    */
  @js.native
  trait ListVirtualRoutersInput extends js.Object {
    var meshName: ResourceName
    var limit: js.UndefOr[ListVirtualRoutersLimit]
    var meshOwner: js.UndefOr[AccountId]
    var nextToken: js.UndefOr[String]
  }

  object ListVirtualRoutersInput {
    @inline
    def apply(
        meshName: ResourceName,
        limit: js.UndefOr[ListVirtualRoutersLimit] = js.undefined,
        meshOwner: js.UndefOr[AccountId] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListVirtualRoutersInput = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any]
      )

      limit.foreach(__v => __obj.updateDynamic("limit")(__v.asInstanceOf[js.Any]))
      meshOwner.foreach(__v => __obj.updateDynamic("meshOwner")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVirtualRoutersInput]
    }
  }

  /**
    */
  @js.native
  trait ListVirtualRoutersOutput extends js.Object {
    var virtualRouters: VirtualRouterList
    var nextToken: js.UndefOr[String]
  }

  object ListVirtualRoutersOutput {
    @inline
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
    */
  @js.native
  trait ListVirtualServicesInput extends js.Object {
    var meshName: ResourceName
    var limit: js.UndefOr[ListVirtualServicesLimit]
    var meshOwner: js.UndefOr[AccountId]
    var nextToken: js.UndefOr[String]
  }

  object ListVirtualServicesInput {
    @inline
    def apply(
        meshName: ResourceName,
        limit: js.UndefOr[ListVirtualServicesLimit] = js.undefined,
        meshOwner: js.UndefOr[AccountId] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListVirtualServicesInput = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any]
      )

      limit.foreach(__v => __obj.updateDynamic("limit")(__v.asInstanceOf[js.Any]))
      meshOwner.foreach(__v => __obj.updateDynamic("meshOwner")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVirtualServicesInput]
    }
  }

  /**
    */
  @js.native
  trait ListVirtualServicesOutput extends js.Object {
    var virtualServices: VirtualServiceList
    var nextToken: js.UndefOr[String]
  }

  object ListVirtualServicesOutput {
    @inline
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
    * An object that represents a listener for a virtual node.
    */
  @js.native
  trait Listener extends js.Object {
    var portMapping: PortMapping
    var healthCheck: js.UndefOr[HealthCheckPolicy]
    var timeout: js.UndefOr[ListenerTimeout]
    var tls: js.UndefOr[ListenerTls]
  }

  object Listener {
    @inline
    def apply(
        portMapping: PortMapping,
        healthCheck: js.UndefOr[HealthCheckPolicy] = js.undefined,
        timeout: js.UndefOr[ListenerTimeout] = js.undefined,
        tls: js.UndefOr[ListenerTls] = js.undefined
    ): Listener = {
      val __obj = js.Dynamic.literal(
        "portMapping" -> portMapping.asInstanceOf[js.Any]
      )

      healthCheck.foreach(__v => __obj.updateDynamic("healthCheck")(__v.asInstanceOf[js.Any]))
      timeout.foreach(__v => __obj.updateDynamic("timeout")(__v.asInstanceOf[js.Any]))
      tls.foreach(__v => __obj.updateDynamic("tls")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Listener]
    }
  }

  @js.native
  trait ListenerTimeout extends js.Object {
    var grpc: js.UndefOr[GrpcTimeout]
    var http: js.UndefOr[HttpTimeout]
    var http2: js.UndefOr[HttpTimeout]
    var tcp: js.UndefOr[TcpTimeout]
  }

  object ListenerTimeout {
    @inline
    def apply(
        grpc: js.UndefOr[GrpcTimeout] = js.undefined,
        http: js.UndefOr[HttpTimeout] = js.undefined,
        http2: js.UndefOr[HttpTimeout] = js.undefined,
        tcp: js.UndefOr[TcpTimeout] = js.undefined
    ): ListenerTimeout = {
      val __obj = js.Dynamic.literal()
      grpc.foreach(__v => __obj.updateDynamic("grpc")(__v.asInstanceOf[js.Any]))
      http.foreach(__v => __obj.updateDynamic("http")(__v.asInstanceOf[js.Any]))
      http2.foreach(__v => __obj.updateDynamic("http2")(__v.asInstanceOf[js.Any]))
      tcp.foreach(__v => __obj.updateDynamic("tcp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListenerTimeout]
    }
  }

  /**
    * An object that represents the Transport Layer Security (TLS) properties for a listener.
    */
  @js.native
  trait ListenerTls extends js.Object {
    var certificate: ListenerTlsCertificate
    var mode: ListenerTlsMode
  }

  object ListenerTls {
    @inline
    def apply(
        certificate: ListenerTlsCertificate,
        mode: ListenerTlsMode
    ): ListenerTls = {
      val __obj = js.Dynamic.literal(
        "certificate" -> certificate.asInstanceOf[js.Any],
        "mode" -> mode.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListenerTls]
    }
  }

  /**
    * An object that represents an AWS Certicate Manager (ACM) certificate.
    */
  @js.native
  trait ListenerTlsAcmCertificate extends js.Object {
    var certificateArn: Arn
  }

  object ListenerTlsAcmCertificate {
    @inline
    def apply(
        certificateArn: Arn
    ): ListenerTlsAcmCertificate = {
      val __obj = js.Dynamic.literal(
        "certificateArn" -> certificateArn.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListenerTlsAcmCertificate]
    }
  }

  /**
    * An object that represents a listener's Transport Layer Security (TLS) certificate.
    */
  @js.native
  trait ListenerTlsCertificate extends js.Object {
    var acm: js.UndefOr[ListenerTlsAcmCertificate]
    var file: js.UndefOr[ListenerTlsFileCertificate]
  }

  object ListenerTlsCertificate {
    @inline
    def apply(
        acm: js.UndefOr[ListenerTlsAcmCertificate] = js.undefined,
        file: js.UndefOr[ListenerTlsFileCertificate] = js.undefined
    ): ListenerTlsCertificate = {
      val __obj = js.Dynamic.literal()
      acm.foreach(__v => __obj.updateDynamic("acm")(__v.asInstanceOf[js.Any]))
      file.foreach(__v => __obj.updateDynamic("file")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListenerTlsCertificate]
    }
  }

  /**
    * <p>An object that represents a local file certificate.
    *          The certificate must meet specific requirements and you must have proxy authorization enabled. For more information, see [[https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html#virtual-node-tls-prerequisites|Transport Layer Security (TLS)]].</p>
    */
  @js.native
  trait ListenerTlsFileCertificate extends js.Object {
    var certificateChain: FilePath
    var privateKey: FilePath
  }

  object ListenerTlsFileCertificate {
    @inline
    def apply(
        certificateChain: FilePath,
        privateKey: FilePath
    ): ListenerTlsFileCertificate = {
      val __obj = js.Dynamic.literal(
        "certificateChain" -> certificateChain.asInstanceOf[js.Any],
        "privateKey" -> privateKey.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListenerTlsFileCertificate]
    }
  }

  @js.native
  sealed trait ListenerTlsMode extends js.Any
  object ListenerTlsMode extends js.Object {
    val DISABLED = "DISABLED".asInstanceOf[ListenerTlsMode]
    val PERMISSIVE = "PERMISSIVE".asInstanceOf[ListenerTlsMode]
    val STRICT = "STRICT".asInstanceOf[ListenerTlsMode]

    val values = js.Object.freeze(js.Array(DISABLED, PERMISSIVE, STRICT))
  }

  /**
    * An object that represents the logging information for a virtual node.
    */
  @js.native
  trait Logging extends js.Object {
    var accessLog: js.UndefOr[AccessLog]
  }

  object Logging {
    @inline
    def apply(
        accessLog: js.UndefOr[AccessLog] = js.undefined
    ): Logging = {
      val __obj = js.Dynamic.literal()
      accessLog.foreach(__v => __obj.updateDynamic("accessLog")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Logging]
    }
  }

  /**
    * An object that represents the range of values to match on. The first character of the range is included in the range, though the last character is not. For example, if the range specified were 1-100, only values 1-99 would be matched.
    */
  @js.native
  trait MatchRange extends js.Object {
    var end: Double
    var start: Double
  }

  object MatchRange {
    @inline
    def apply(
        end: Double,
        start: Double
    ): MatchRange = {
      val __obj = js.Dynamic.literal(
        "end" -> end.asInstanceOf[js.Any],
        "start" -> start.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[MatchRange]
    }
  }

  /**
    * An object that represents a service mesh returned by a describe operation.
    */
  @js.native
  trait MeshData extends js.Object {
    var meshName: ResourceName
    var metadata: ResourceMetadata
    var spec: MeshSpec
    var status: MeshStatus
  }

  object MeshData {
    @inline
    def apply(
        meshName: ResourceName,
        metadata: ResourceMetadata,
        spec: MeshSpec,
        status: MeshStatus
    ): MeshData = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any],
        "metadata" -> metadata.asInstanceOf[js.Any],
        "spec" -> spec.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[MeshData]
    }
  }

  /**
    * An object that represents a service mesh returned by a list operation.
    */
  @js.native
  trait MeshRef extends js.Object {
    var arn: Arn
    var createdAt: Timestamp
    var lastUpdatedAt: Timestamp
    var meshName: ResourceName
    var meshOwner: AccountId
    var resourceOwner: AccountId
    var version: Double
  }

  object MeshRef {
    @inline
    def apply(
        arn: Arn,
        createdAt: Timestamp,
        lastUpdatedAt: Timestamp,
        meshName: ResourceName,
        meshOwner: AccountId,
        resourceOwner: AccountId,
        version: Double
    ): MeshRef = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "lastUpdatedAt" -> lastUpdatedAt.asInstanceOf[js.Any],
        "meshName" -> meshName.asInstanceOf[js.Any],
        "meshOwner" -> meshOwner.asInstanceOf[js.Any],
        "resourceOwner" -> resourceOwner.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[MeshRef]
    }
  }

  /**
    * An object that represents the specification of a service mesh.
    */
  @js.native
  trait MeshSpec extends js.Object {
    var egressFilter: js.UndefOr[EgressFilter]
  }

  object MeshSpec {
    @inline
    def apply(
        egressFilter: js.UndefOr[EgressFilter] = js.undefined
    ): MeshSpec = {
      val __obj = js.Dynamic.literal()
      egressFilter.foreach(__v => __obj.updateDynamic("egressFilter")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MeshSpec]
    }
  }

  /**
    * An object that represents the status of a service mesh.
    */
  @js.native
  trait MeshStatus extends js.Object {
    var status: js.UndefOr[MeshStatusCode]
  }

  object MeshStatus {
    @inline
    def apply(
        status: js.UndefOr[MeshStatusCode] = js.undefined
    ): MeshStatus = {
      val __obj = js.Dynamic.literal()
      status.foreach(__v => __obj.updateDynamic("status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[MeshStatus]
    }
  }

  @js.native
  sealed trait MeshStatusCode extends js.Any
  object MeshStatusCode extends js.Object {
    val ACTIVE = "ACTIVE".asInstanceOf[MeshStatusCode]
    val DELETED = "DELETED".asInstanceOf[MeshStatusCode]
    val INACTIVE = "INACTIVE".asInstanceOf[MeshStatusCode]

    val values = js.Object.freeze(js.Array(ACTIVE, DELETED, INACTIVE))
  }

  /**
    * An object that represents a port mapping.
    */
  @js.native
  trait PortMapping extends js.Object {
    var port: PortNumber
    var protocol: PortProtocol
  }

  object PortMapping {
    @inline
    def apply(
        port: PortNumber,
        protocol: PortProtocol
    ): PortMapping = {
      val __obj = js.Dynamic.literal(
        "port" -> port.asInstanceOf[js.Any],
        "protocol" -> protocol.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[PortMapping]
    }
  }

  @js.native
  sealed trait PortProtocol extends js.Any
  object PortProtocol extends js.Object {
    val grpc = "grpc".asInstanceOf[PortProtocol]
    val http = "http".asInstanceOf[PortProtocol]
    val http2 = "http2".asInstanceOf[PortProtocol]
    val tcp = "tcp".asInstanceOf[PortProtocol]

    val values = js.Object.freeze(js.Array(grpc, http, http2, tcp))
  }

  /**
    * An object that represents metadata for a resource.
    */
  @js.native
  trait ResourceMetadata extends js.Object {
    var arn: Arn
    var createdAt: Timestamp
    var lastUpdatedAt: Timestamp
    var meshOwner: AccountId
    var resourceOwner: AccountId
    var uid: String
    var version: Double
  }

  object ResourceMetadata {
    @inline
    def apply(
        arn: Arn,
        createdAt: Timestamp,
        lastUpdatedAt: Timestamp,
        meshOwner: AccountId,
        resourceOwner: AccountId,
        uid: String,
        version: Double
    ): ResourceMetadata = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "lastUpdatedAt" -> lastUpdatedAt.asInstanceOf[js.Any],
        "meshOwner" -> meshOwner.asInstanceOf[js.Any],
        "resourceOwner" -> resourceOwner.asInstanceOf[js.Any],
        "uid" -> uid.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ResourceMetadata]
    }
  }

  /**
    * An object that represents a route returned by a describe operation.
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
    @inline
    def apply(
        meshName: ResourceName,
        metadata: ResourceMetadata,
        routeName: ResourceName,
        spec: RouteSpec,
        status: RouteStatus,
        virtualRouterName: ResourceName
    ): RouteData = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any],
        "metadata" -> metadata.asInstanceOf[js.Any],
        "routeName" -> routeName.asInstanceOf[js.Any],
        "spec" -> spec.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "virtualRouterName" -> virtualRouterName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RouteData]
    }
  }

  /**
    * An object that represents a route returned by a list operation.
    */
  @js.native
  trait RouteRef extends js.Object {
    var arn: Arn
    var createdAt: Timestamp
    var lastUpdatedAt: Timestamp
    var meshName: ResourceName
    var meshOwner: AccountId
    var resourceOwner: AccountId
    var routeName: ResourceName
    var version: Double
    var virtualRouterName: ResourceName
  }

  object RouteRef {
    @inline
    def apply(
        arn: Arn,
        createdAt: Timestamp,
        lastUpdatedAt: Timestamp,
        meshName: ResourceName,
        meshOwner: AccountId,
        resourceOwner: AccountId,
        routeName: ResourceName,
        version: Double,
        virtualRouterName: ResourceName
    ): RouteRef = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "lastUpdatedAt" -> lastUpdatedAt.asInstanceOf[js.Any],
        "meshName" -> meshName.asInstanceOf[js.Any],
        "meshOwner" -> meshOwner.asInstanceOf[js.Any],
        "resourceOwner" -> resourceOwner.asInstanceOf[js.Any],
        "routeName" -> routeName.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any],
        "virtualRouterName" -> virtualRouterName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RouteRef]
    }
  }

  /**
    * An object that represents a route specification. Specify one route type.
    */
  @js.native
  trait RouteSpec extends js.Object {
    var grpcRoute: js.UndefOr[GrpcRoute]
    var http2Route: js.UndefOr[HttpRoute]
    var httpRoute: js.UndefOr[HttpRoute]
    var priority: js.UndefOr[RoutePriority]
    var tcpRoute: js.UndefOr[TcpRoute]
  }

  object RouteSpec {
    @inline
    def apply(
        grpcRoute: js.UndefOr[GrpcRoute] = js.undefined,
        http2Route: js.UndefOr[HttpRoute] = js.undefined,
        httpRoute: js.UndefOr[HttpRoute] = js.undefined,
        priority: js.UndefOr[RoutePriority] = js.undefined,
        tcpRoute: js.UndefOr[TcpRoute] = js.undefined
    ): RouteSpec = {
      val __obj = js.Dynamic.literal()
      grpcRoute.foreach(__v => __obj.updateDynamic("grpcRoute")(__v.asInstanceOf[js.Any]))
      http2Route.foreach(__v => __obj.updateDynamic("http2Route")(__v.asInstanceOf[js.Any]))
      httpRoute.foreach(__v => __obj.updateDynamic("httpRoute")(__v.asInstanceOf[js.Any]))
      priority.foreach(__v => __obj.updateDynamic("priority")(__v.asInstanceOf[js.Any]))
      tcpRoute.foreach(__v => __obj.updateDynamic("tcpRoute")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RouteSpec]
    }
  }

  /**
    * An object that represents the current status of a route.
    */
  @js.native
  trait RouteStatus extends js.Object {
    var status: RouteStatusCode
  }

  object RouteStatus {
    @inline
    def apply(
        status: RouteStatusCode
    ): RouteStatus = {
      val __obj = js.Dynamic.literal(
        "status" -> status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[RouteStatus]
    }
  }

  @js.native
  sealed trait RouteStatusCode extends js.Any
  object RouteStatusCode extends js.Object {
    val ACTIVE = "ACTIVE".asInstanceOf[RouteStatusCode]
    val DELETED = "DELETED".asInstanceOf[RouteStatusCode]
    val INACTIVE = "INACTIVE".asInstanceOf[RouteStatusCode]

    val values = js.Object.freeze(js.Array(ACTIVE, DELETED, INACTIVE))
  }

  /**
    * An object that represents the service discovery information for a virtual node.
    */
  @js.native
  trait ServiceDiscovery extends js.Object {
    var awsCloudMap: js.UndefOr[AwsCloudMapServiceDiscovery]
    var dns: js.UndefOr[DnsServiceDiscovery]
  }

  object ServiceDiscovery {
    @inline
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
    @inline
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
    */
  @js.native
  trait TagResourceInput extends js.Object {
    var resourceArn: Arn
    var tags: TagList
  }

  object TagResourceInput {
    @inline
    def apply(
        resourceArn: Arn,
        tags: TagList
    ): TagResourceInput = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tags" -> tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceInput]
    }
  }

  /**
    */
  @js.native
  trait TagResourceOutput extends js.Object {}

  object TagResourceOutput {
    @inline
    def apply(
    ): TagResourceOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagResourceOutput]
    }
  }

  @js.native
  sealed trait TcpRetryPolicyEvent extends js.Any
  object TcpRetryPolicyEvent extends js.Object {
    val `connection-error` = "connection-error".asInstanceOf[TcpRetryPolicyEvent]

    val values = js.Object.freeze(js.Array(`connection-error`))
  }

  /**
    * An object that represents a TCP route type.
    */
  @js.native
  trait TcpRoute extends js.Object {
    var action: TcpRouteAction
    var timeout: js.UndefOr[TcpTimeout]
  }

  object TcpRoute {
    @inline
    def apply(
        action: TcpRouteAction,
        timeout: js.UndefOr[TcpTimeout] = js.undefined
    ): TcpRoute = {
      val __obj = js.Dynamic.literal(
        "action" -> action.asInstanceOf[js.Any]
      )

      timeout.foreach(__v => __obj.updateDynamic("timeout")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TcpRoute]
    }
  }

  /**
    * An object that represents the action to take if a match is determined.
    */
  @js.native
  trait TcpRouteAction extends js.Object {
    var weightedTargets: WeightedTargets
  }

  object TcpRouteAction {
    @inline
    def apply(
        weightedTargets: WeightedTargets
    ): TcpRouteAction = {
      val __obj = js.Dynamic.literal(
        "weightedTargets" -> weightedTargets.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TcpRouteAction]
    }
  }

  @js.native
  trait TcpTimeout extends js.Object {
    var idle: js.UndefOr[Duration]
  }

  object TcpTimeout {
    @inline
    def apply(
        idle: js.UndefOr[Duration] = js.undefined
    ): TcpTimeout = {
      val __obj = js.Dynamic.literal()
      idle.foreach(__v => __obj.updateDynamic("idle")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TcpTimeout]
    }
  }

  /**
    * An object that represents a Transport Layer Security (TLS) validation context.
    */
  @js.native
  trait TlsValidationContext extends js.Object {
    var trust: TlsValidationContextTrust
  }

  object TlsValidationContext {
    @inline
    def apply(
        trust: TlsValidationContextTrust
    ): TlsValidationContext = {
      val __obj = js.Dynamic.literal(
        "trust" -> trust.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TlsValidationContext]
    }
  }

  /**
    * <p>An object that represents a TLS validation context trust for an AWS Certicate Manager (ACM)
    *          certificate.</p>
    */
  @js.native
  trait TlsValidationContextAcmTrust extends js.Object {
    var certificateAuthorityArns: CertificateAuthorityArns
  }

  object TlsValidationContextAcmTrust {
    @inline
    def apply(
        certificateAuthorityArns: CertificateAuthorityArns
    ): TlsValidationContextAcmTrust = {
      val __obj = js.Dynamic.literal(
        "certificateAuthorityArns" -> certificateAuthorityArns.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TlsValidationContextAcmTrust]
    }
  }

  /**
    * An object that represents a Transport Layer Security (TLS) validation context trust for a local file.
    */
  @js.native
  trait TlsValidationContextFileTrust extends js.Object {
    var certificateChain: FilePath
  }

  object TlsValidationContextFileTrust {
    @inline
    def apply(
        certificateChain: FilePath
    ): TlsValidationContextFileTrust = {
      val __obj = js.Dynamic.literal(
        "certificateChain" -> certificateChain.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TlsValidationContextFileTrust]
    }
  }

  /**
    * An object that represents a Transport Layer Security (TLS) validation context trust.
    */
  @js.native
  trait TlsValidationContextTrust extends js.Object {
    var acm: js.UndefOr[TlsValidationContextAcmTrust]
    var file: js.UndefOr[TlsValidationContextFileTrust]
  }

  object TlsValidationContextTrust {
    @inline
    def apply(
        acm: js.UndefOr[TlsValidationContextAcmTrust] = js.undefined,
        file: js.UndefOr[TlsValidationContextFileTrust] = js.undefined
    ): TlsValidationContextTrust = {
      val __obj = js.Dynamic.literal()
      acm.foreach(__v => __obj.updateDynamic("acm")(__v.asInstanceOf[js.Any]))
      file.foreach(__v => __obj.updateDynamic("file")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TlsValidationContextTrust]
    }
  }

  /**
    */
  @js.native
  trait UntagResourceInput extends js.Object {
    var resourceArn: Arn
    var tagKeys: TagKeyList
  }

  object UntagResourceInput {
    @inline
    def apply(
        resourceArn: Arn,
        tagKeys: TagKeyList
    ): UntagResourceInput = {
      val __obj = js.Dynamic.literal(
        "resourceArn" -> resourceArn.asInstanceOf[js.Any],
        "tagKeys" -> tagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceInput]
    }
  }

  /**
    */
  @js.native
  trait UntagResourceOutput extends js.Object {}

  object UntagResourceOutput {
    @inline
    def apply(
    ): UntagResourceOutput = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagResourceOutput]
    }
  }

  /**
    */
  @js.native
  trait UpdateMeshInput extends js.Object {
    var meshName: ResourceName
    var clientToken: js.UndefOr[String]
    var spec: js.UndefOr[MeshSpec]
  }

  object UpdateMeshInput {
    @inline
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
    */
  @js.native
  trait UpdateMeshOutput extends js.Object {
    var mesh: MeshData
  }

  object UpdateMeshOutput {
    @inline
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
    */
  @js.native
  trait UpdateRouteInput extends js.Object {
    var meshName: ResourceName
    var routeName: ResourceName
    var spec: RouteSpec
    var virtualRouterName: ResourceName
    var clientToken: js.UndefOr[String]
    var meshOwner: js.UndefOr[AccountId]
  }

  object UpdateRouteInput {
    @inline
    def apply(
        meshName: ResourceName,
        routeName: ResourceName,
        spec: RouteSpec,
        virtualRouterName: ResourceName,
        clientToken: js.UndefOr[String] = js.undefined,
        meshOwner: js.UndefOr[AccountId] = js.undefined
    ): UpdateRouteInput = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any],
        "routeName" -> routeName.asInstanceOf[js.Any],
        "spec" -> spec.asInstanceOf[js.Any],
        "virtualRouterName" -> virtualRouterName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      meshOwner.foreach(__v => __obj.updateDynamic("meshOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateRouteInput]
    }
  }

  /**
    */
  @js.native
  trait UpdateRouteOutput extends js.Object {
    var route: RouteData
  }

  object UpdateRouteOutput {
    @inline
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
    */
  @js.native
  trait UpdateVirtualNodeInput extends js.Object {
    var meshName: ResourceName
    var spec: VirtualNodeSpec
    var virtualNodeName: ResourceName
    var clientToken: js.UndefOr[String]
    var meshOwner: js.UndefOr[AccountId]
  }

  object UpdateVirtualNodeInput {
    @inline
    def apply(
        meshName: ResourceName,
        spec: VirtualNodeSpec,
        virtualNodeName: ResourceName,
        clientToken: js.UndefOr[String] = js.undefined,
        meshOwner: js.UndefOr[AccountId] = js.undefined
    ): UpdateVirtualNodeInput = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any],
        "spec" -> spec.asInstanceOf[js.Any],
        "virtualNodeName" -> virtualNodeName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      meshOwner.foreach(__v => __obj.updateDynamic("meshOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVirtualNodeInput]
    }
  }

  /**
    */
  @js.native
  trait UpdateVirtualNodeOutput extends js.Object {
    var virtualNode: VirtualNodeData
  }

  object UpdateVirtualNodeOutput {
    @inline
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
    */
  @js.native
  trait UpdateVirtualRouterInput extends js.Object {
    var meshName: ResourceName
    var spec: VirtualRouterSpec
    var virtualRouterName: ResourceName
    var clientToken: js.UndefOr[String]
    var meshOwner: js.UndefOr[AccountId]
  }

  object UpdateVirtualRouterInput {
    @inline
    def apply(
        meshName: ResourceName,
        spec: VirtualRouterSpec,
        virtualRouterName: ResourceName,
        clientToken: js.UndefOr[String] = js.undefined,
        meshOwner: js.UndefOr[AccountId] = js.undefined
    ): UpdateVirtualRouterInput = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any],
        "spec" -> spec.asInstanceOf[js.Any],
        "virtualRouterName" -> virtualRouterName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      meshOwner.foreach(__v => __obj.updateDynamic("meshOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVirtualRouterInput]
    }
  }

  /**
    */
  @js.native
  trait UpdateVirtualRouterOutput extends js.Object {
    var virtualRouter: VirtualRouterData
  }

  object UpdateVirtualRouterOutput {
    @inline
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
    */
  @js.native
  trait UpdateVirtualServiceInput extends js.Object {
    var meshName: ResourceName
    var spec: VirtualServiceSpec
    var virtualServiceName: ServiceName
    var clientToken: js.UndefOr[String]
    var meshOwner: js.UndefOr[AccountId]
  }

  object UpdateVirtualServiceInput {
    @inline
    def apply(
        meshName: ResourceName,
        spec: VirtualServiceSpec,
        virtualServiceName: ServiceName,
        clientToken: js.UndefOr[String] = js.undefined,
        meshOwner: js.UndefOr[AccountId] = js.undefined
    ): UpdateVirtualServiceInput = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any],
        "spec" -> spec.asInstanceOf[js.Any],
        "virtualServiceName" -> virtualServiceName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      meshOwner.foreach(__v => __obj.updateDynamic("meshOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVirtualServiceInput]
    }
  }

  /**
    */
  @js.native
  trait UpdateVirtualServiceOutput extends js.Object {
    var virtualService: VirtualServiceData
  }

  object UpdateVirtualServiceOutput {
    @inline
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
    * An object that represents a virtual node returned by a describe operation.
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
    @inline
    def apply(
        meshName: ResourceName,
        metadata: ResourceMetadata,
        spec: VirtualNodeSpec,
        status: VirtualNodeStatus,
        virtualNodeName: ResourceName
    ): VirtualNodeData = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any],
        "metadata" -> metadata.asInstanceOf[js.Any],
        "spec" -> spec.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "virtualNodeName" -> virtualNodeName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VirtualNodeData]
    }
  }

  /**
    * An object that represents a virtual node returned by a list operation.
    */
  @js.native
  trait VirtualNodeRef extends js.Object {
    var arn: Arn
    var createdAt: Timestamp
    var lastUpdatedAt: Timestamp
    var meshName: ResourceName
    var meshOwner: AccountId
    var resourceOwner: AccountId
    var version: Double
    var virtualNodeName: ResourceName
  }

  object VirtualNodeRef {
    @inline
    def apply(
        arn: Arn,
        createdAt: Timestamp,
        lastUpdatedAt: Timestamp,
        meshName: ResourceName,
        meshOwner: AccountId,
        resourceOwner: AccountId,
        version: Double,
        virtualNodeName: ResourceName
    ): VirtualNodeRef = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "lastUpdatedAt" -> lastUpdatedAt.asInstanceOf[js.Any],
        "meshName" -> meshName.asInstanceOf[js.Any],
        "meshOwner" -> meshOwner.asInstanceOf[js.Any],
        "resourceOwner" -> resourceOwner.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any],
        "virtualNodeName" -> virtualNodeName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VirtualNodeRef]
    }
  }

  /**
    * An object that represents a virtual node service provider.
    */
  @js.native
  trait VirtualNodeServiceProvider extends js.Object {
    var virtualNodeName: ResourceName
  }

  object VirtualNodeServiceProvider {
    @inline
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
    * An object that represents the specification of a virtual node.
    */
  @js.native
  trait VirtualNodeSpec extends js.Object {
    var backendDefaults: js.UndefOr[BackendDefaults]
    var backends: js.UndefOr[Backends]
    var listeners: js.UndefOr[Listeners]
    var logging: js.UndefOr[Logging]
    var serviceDiscovery: js.UndefOr[ServiceDiscovery]
  }

  object VirtualNodeSpec {
    @inline
    def apply(
        backendDefaults: js.UndefOr[BackendDefaults] = js.undefined,
        backends: js.UndefOr[Backends] = js.undefined,
        listeners: js.UndefOr[Listeners] = js.undefined,
        logging: js.UndefOr[Logging] = js.undefined,
        serviceDiscovery: js.UndefOr[ServiceDiscovery] = js.undefined
    ): VirtualNodeSpec = {
      val __obj = js.Dynamic.literal()
      backendDefaults.foreach(__v => __obj.updateDynamic("backendDefaults")(__v.asInstanceOf[js.Any]))
      backends.foreach(__v => __obj.updateDynamic("backends")(__v.asInstanceOf[js.Any]))
      listeners.foreach(__v => __obj.updateDynamic("listeners")(__v.asInstanceOf[js.Any]))
      logging.foreach(__v => __obj.updateDynamic("logging")(__v.asInstanceOf[js.Any]))
      serviceDiscovery.foreach(__v => __obj.updateDynamic("serviceDiscovery")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualNodeSpec]
    }
  }

  /**
    * An object that represents the current status of the virtual node.
    */
  @js.native
  trait VirtualNodeStatus extends js.Object {
    var status: VirtualNodeStatusCode
  }

  object VirtualNodeStatus {
    @inline
    def apply(
        status: VirtualNodeStatusCode
    ): VirtualNodeStatus = {
      val __obj = js.Dynamic.literal(
        "status" -> status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VirtualNodeStatus]
    }
  }

  @js.native
  sealed trait VirtualNodeStatusCode extends js.Any
  object VirtualNodeStatusCode extends js.Object {
    val ACTIVE = "ACTIVE".asInstanceOf[VirtualNodeStatusCode]
    val DELETED = "DELETED".asInstanceOf[VirtualNodeStatusCode]
    val INACTIVE = "INACTIVE".asInstanceOf[VirtualNodeStatusCode]

    val values = js.Object.freeze(js.Array(ACTIVE, DELETED, INACTIVE))
  }

  /**
    * An object that represents a virtual router returned by a describe operation.
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
    @inline
    def apply(
        meshName: ResourceName,
        metadata: ResourceMetadata,
        spec: VirtualRouterSpec,
        status: VirtualRouterStatus,
        virtualRouterName: ResourceName
    ): VirtualRouterData = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any],
        "metadata" -> metadata.asInstanceOf[js.Any],
        "spec" -> spec.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "virtualRouterName" -> virtualRouterName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VirtualRouterData]
    }
  }

  /**
    * An object that represents a virtual router listener.
    */
  @js.native
  trait VirtualRouterListener extends js.Object {
    var portMapping: PortMapping
  }

  object VirtualRouterListener {
    @inline
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
    * An object that represents a virtual router returned by a list operation.
    */
  @js.native
  trait VirtualRouterRef extends js.Object {
    var arn: Arn
    var createdAt: Timestamp
    var lastUpdatedAt: Timestamp
    var meshName: ResourceName
    var meshOwner: AccountId
    var resourceOwner: AccountId
    var version: Double
    var virtualRouterName: ResourceName
  }

  object VirtualRouterRef {
    @inline
    def apply(
        arn: Arn,
        createdAt: Timestamp,
        lastUpdatedAt: Timestamp,
        meshName: ResourceName,
        meshOwner: AccountId,
        resourceOwner: AccountId,
        version: Double,
        virtualRouterName: ResourceName
    ): VirtualRouterRef = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "lastUpdatedAt" -> lastUpdatedAt.asInstanceOf[js.Any],
        "meshName" -> meshName.asInstanceOf[js.Any],
        "meshOwner" -> meshOwner.asInstanceOf[js.Any],
        "resourceOwner" -> resourceOwner.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any],
        "virtualRouterName" -> virtualRouterName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VirtualRouterRef]
    }
  }

  /**
    * An object that represents a virtual node service provider.
    */
  @js.native
  trait VirtualRouterServiceProvider extends js.Object {
    var virtualRouterName: ResourceName
  }

  object VirtualRouterServiceProvider {
    @inline
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
    * An object that represents the specification of a virtual router.
    */
  @js.native
  trait VirtualRouterSpec extends js.Object {
    var listeners: js.UndefOr[VirtualRouterListeners]
  }

  object VirtualRouterSpec {
    @inline
    def apply(
        listeners: js.UndefOr[VirtualRouterListeners] = js.undefined
    ): VirtualRouterSpec = {
      val __obj = js.Dynamic.literal()
      listeners.foreach(__v => __obj.updateDynamic("listeners")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualRouterSpec]
    }
  }

  /**
    * An object that represents the status of a virtual router.
    */
  @js.native
  trait VirtualRouterStatus extends js.Object {
    var status: VirtualRouterStatusCode
  }

  object VirtualRouterStatus {
    @inline
    def apply(
        status: VirtualRouterStatusCode
    ): VirtualRouterStatus = {
      val __obj = js.Dynamic.literal(
        "status" -> status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VirtualRouterStatus]
    }
  }

  @js.native
  sealed trait VirtualRouterStatusCode extends js.Any
  object VirtualRouterStatusCode extends js.Object {
    val ACTIVE = "ACTIVE".asInstanceOf[VirtualRouterStatusCode]
    val DELETED = "DELETED".asInstanceOf[VirtualRouterStatusCode]
    val INACTIVE = "INACTIVE".asInstanceOf[VirtualRouterStatusCode]

    val values = js.Object.freeze(js.Array(ACTIVE, DELETED, INACTIVE))
  }

  /**
    * An object that represents a virtual service backend for a virtual node.
    */
  @js.native
  trait VirtualServiceBackend extends js.Object {
    var virtualServiceName: ServiceName
    var clientPolicy: js.UndefOr[ClientPolicy]
  }

  object VirtualServiceBackend {
    @inline
    def apply(
        virtualServiceName: ServiceName,
        clientPolicy: js.UndefOr[ClientPolicy] = js.undefined
    ): VirtualServiceBackend = {
      val __obj = js.Dynamic.literal(
        "virtualServiceName" -> virtualServiceName.asInstanceOf[js.Any]
      )

      clientPolicy.foreach(__v => __obj.updateDynamic("clientPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualServiceBackend]
    }
  }

  /**
    * An object that represents a virtual service returned by a describe operation.
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
    @inline
    def apply(
        meshName: ResourceName,
        metadata: ResourceMetadata,
        spec: VirtualServiceSpec,
        status: VirtualServiceStatus,
        virtualServiceName: ServiceName
    ): VirtualServiceData = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any],
        "metadata" -> metadata.asInstanceOf[js.Any],
        "spec" -> spec.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "virtualServiceName" -> virtualServiceName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VirtualServiceData]
    }
  }

  /**
    * An object that represents the provider for a virtual service.
    */
  @js.native
  trait VirtualServiceProvider extends js.Object {
    var virtualNode: js.UndefOr[VirtualNodeServiceProvider]
    var virtualRouter: js.UndefOr[VirtualRouterServiceProvider]
  }

  object VirtualServiceProvider {
    @inline
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
    * An object that represents a virtual service returned by a list operation.
    */
  @js.native
  trait VirtualServiceRef extends js.Object {
    var arn: Arn
    var createdAt: Timestamp
    var lastUpdatedAt: Timestamp
    var meshName: ResourceName
    var meshOwner: AccountId
    var resourceOwner: AccountId
    var version: Double
    var virtualServiceName: ServiceName
  }

  object VirtualServiceRef {
    @inline
    def apply(
        arn: Arn,
        createdAt: Timestamp,
        lastUpdatedAt: Timestamp,
        meshName: ResourceName,
        meshOwner: AccountId,
        resourceOwner: AccountId,
        version: Double,
        virtualServiceName: ServiceName
    ): VirtualServiceRef = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "lastUpdatedAt" -> lastUpdatedAt.asInstanceOf[js.Any],
        "meshName" -> meshName.asInstanceOf[js.Any],
        "meshOwner" -> meshOwner.asInstanceOf[js.Any],
        "resourceOwner" -> resourceOwner.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any],
        "virtualServiceName" -> virtualServiceName.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VirtualServiceRef]
    }
  }

  /**
    * An object that represents the specification of a virtual service.
    */
  @js.native
  trait VirtualServiceSpec extends js.Object {
    var provider: js.UndefOr[VirtualServiceProvider]
  }

  object VirtualServiceSpec {
    @inline
    def apply(
        provider: js.UndefOr[VirtualServiceProvider] = js.undefined
    ): VirtualServiceSpec = {
      val __obj = js.Dynamic.literal()
      provider.foreach(__v => __obj.updateDynamic("provider")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualServiceSpec]
    }
  }

  /**
    * An object that represents the status of a virtual service.
    */
  @js.native
  trait VirtualServiceStatus extends js.Object {
    var status: VirtualServiceStatusCode
  }

  object VirtualServiceStatus {
    @inline
    def apply(
        status: VirtualServiceStatusCode
    ): VirtualServiceStatus = {
      val __obj = js.Dynamic.literal(
        "status" -> status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[VirtualServiceStatus]
    }
  }

  @js.native
  sealed trait VirtualServiceStatusCode extends js.Any
  object VirtualServiceStatusCode extends js.Object {
    val ACTIVE = "ACTIVE".asInstanceOf[VirtualServiceStatusCode]
    val DELETED = "DELETED".asInstanceOf[VirtualServiceStatusCode]
    val INACTIVE = "INACTIVE".asInstanceOf[VirtualServiceStatusCode]

    val values = js.Object.freeze(js.Array(ACTIVE, DELETED, INACTIVE))
  }

  /**
    * <p>An object that represents a target and its relative weight. Traffic is distributed
    *          across targets according to their relative weight. For example, a weighted target with a
    *          relative weight of 50 receives five times as much traffic as one with a relative weight of
    *          10. The total weight for all targets combined must be less than or equal to 100.</p>
    */
  @js.native
  trait WeightedTarget extends js.Object {
    var virtualNode: ResourceName
    var weight: PercentInt
  }

  object WeightedTarget {
    @inline
    def apply(
        virtualNode: ResourceName,
        weight: PercentInt
    ): WeightedTarget = {
      val __obj = js.Dynamic.literal(
        "virtualNode" -> virtualNode.asInstanceOf[js.Any],
        "weight" -> weight.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[WeightedTarget]
    }
  }
}
