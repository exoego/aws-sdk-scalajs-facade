package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object appmesh {
  type Arn                               = String
  type AwsCloudMapInstanceAttributeKey   = String
  type AwsCloudMapInstanceAttributeValue = String
  type AwsCloudMapInstanceAttributes     = js.Array[AwsCloudMapInstanceAttribute]
  type AwsCloudMapName                   = String
  type Backends                          = js.Array[Backend]
  type DurationValue                     = Double
  type FilePath                          = String
  type GrpcRetryPolicyEvents             = js.Array[GrpcRetryPolicyEvent]
  type GrpcRouteMetadataList             = js.Array[GrpcRouteMetadata]
  type HeaderMatch                       = String
  type HeaderName                        = String
  type HealthCheckIntervalMillis         = Double
  type HealthCheckThreshold              = Int
  type HealthCheckTimeoutMillis          = Double
  type Hostname                          = String
  type HttpRetryPolicyEvent              = String
  type HttpRetryPolicyEvents             = js.Array[HttpRetryPolicyEvent]
  type HttpRouteHeaders                  = js.Array[HttpRouteHeader]
  type ListMeshesLimit                   = Int
  type ListRoutesLimit                   = Int
  type ListVirtualNodesLimit             = Int
  type ListVirtualRoutersLimit           = Int
  type ListVirtualServicesLimit          = Int
  type Listeners                         = js.Array[Listener]
  type MaxRetries                        = Double
  type MeshList                          = js.Array[MeshRef]
  type MethodName                        = String
  type PercentInt                        = Int
  type PortNumber                        = Int
  type ResourceName                      = String
  type RouteList                         = js.Array[RouteRef]
  type RoutePriority                     = Int
  type ServiceName                       = String
  type TagKey                            = String
  type TagKeyList                        = js.Array[TagKey]
  type TagList                           = js.Array[TagRef]
  type TagValue                          = String
  type TagsLimit                         = Int
  type TcpRetryPolicyEvents              = js.Array[TcpRetryPolicyEvent]
  type Timestamp                         = js.Date
  type VirtualNodeList                   = js.Array[VirtualNodeRef]
  type VirtualRouterList                 = js.Array[VirtualRouterRef]
  type VirtualRouterListeners            = js.Array[VirtualRouterListener]
  type VirtualServiceList                = js.Array[VirtualServiceRef]
  type WeightedTargets                   = js.Array[WeightedTarget]

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
    * An object that represents the access logging information for a virtual node.
    */
  @js.native
  @Factory
  trait AccessLog extends js.Object {
    var file: js.UndefOr[FileAccessLog]
  }

  /**
    * <p>An object that represents the AWS Cloud Map attribute information for your virtual
    *          node.</p>
    */
  @js.native
  @Factory
  trait AwsCloudMapInstanceAttribute extends js.Object {
    var key: AwsCloudMapInstanceAttributeKey
    var value: AwsCloudMapInstanceAttributeValue
  }

  /**
    * <p>An object that represents the AWS Cloud Map service discovery information for your virtual
    *          node.</p>
    */
  @js.native
  @Factory
  trait AwsCloudMapServiceDiscovery extends js.Object {
    var namespaceName: AwsCloudMapName
    var serviceName: AwsCloudMapName
    var attributes: js.UndefOr[AwsCloudMapInstanceAttributes]
  }

  /**
    * <p>An object that represents the backends that a virtual node is expected to send outbound
    *          traffic to. </p>
    */
  @js.native
  @Factory
  trait Backend extends js.Object {
    var virtualService: js.UndefOr[VirtualServiceBackend]
  }

  /**
    */
  @js.native
  @Factory
  trait CreateMeshInput extends js.Object {
    var meshName: ResourceName
    var clientToken: js.UndefOr[String]
    var spec: js.UndefOr[MeshSpec]
    var tags: js.UndefOr[TagList]
  }

  /**
    */
  @js.native
  @Factory
  trait CreateMeshOutput extends js.Object {
    var mesh: MeshData
  }

  /**
    */
  @js.native
  @Factory
  trait CreateRouteInput extends js.Object {
    var meshName: ResourceName
    var routeName: ResourceName
    var spec: RouteSpec
    var virtualRouterName: ResourceName
    var clientToken: js.UndefOr[String]
    var tags: js.UndefOr[TagList]
  }

  /**
    */
  @js.native
  @Factory
  trait CreateRouteOutput extends js.Object {
    var route: RouteData
  }

  /**
    */
  @js.native
  @Factory
  trait CreateVirtualNodeInput extends js.Object {
    var meshName: ResourceName
    var spec: VirtualNodeSpec
    var virtualNodeName: ResourceName
    var clientToken: js.UndefOr[String]
    var tags: js.UndefOr[TagList]
  }

  /**
    */
  @js.native
  @Factory
  trait CreateVirtualNodeOutput extends js.Object {
    var virtualNode: VirtualNodeData
  }

  /**
    */
  @js.native
  @Factory
  trait CreateVirtualRouterInput extends js.Object {
    var meshName: ResourceName
    var spec: VirtualRouterSpec
    var virtualRouterName: ResourceName
    var clientToken: js.UndefOr[String]
    var tags: js.UndefOr[TagList]
  }

  /**
    */
  @js.native
  @Factory
  trait CreateVirtualRouterOutput extends js.Object {
    var virtualRouter: VirtualRouterData
  }

  /**
    */
  @js.native
  @Factory
  trait CreateVirtualServiceInput extends js.Object {
    var meshName: ResourceName
    var spec: VirtualServiceSpec
    var virtualServiceName: ServiceName
    var clientToken: js.UndefOr[String]
    var tags: js.UndefOr[TagList]
  }

  /**
    */
  @js.native
  @Factory
  trait CreateVirtualServiceOutput extends js.Object {
    var virtualService: VirtualServiceData
  }

  /**
    */
  @js.native
  @Factory
  trait DeleteMeshInput extends js.Object {
    var meshName: ResourceName
  }

  /**
    */
  @js.native
  @Factory
  trait DeleteMeshOutput extends js.Object {
    var mesh: MeshData
  }

  /**
    */
  @js.native
  @Factory
  trait DeleteRouteInput extends js.Object {
    var meshName: ResourceName
    var routeName: ResourceName
    var virtualRouterName: ResourceName
  }

  /**
    */
  @js.native
  @Factory
  trait DeleteRouteOutput extends js.Object {
    var route: RouteData
  }

  /**
    */
  @js.native
  @Factory
  trait DeleteVirtualNodeInput extends js.Object {
    var meshName: ResourceName
    var virtualNodeName: ResourceName
  }

  /**
    */
  @js.native
  @Factory
  trait DeleteVirtualNodeOutput extends js.Object {
    var virtualNode: VirtualNodeData
  }

  /**
    */
  @js.native
  @Factory
  trait DeleteVirtualRouterInput extends js.Object {
    var meshName: ResourceName
    var virtualRouterName: ResourceName
  }

  /**
    */
  @js.native
  @Factory
  trait DeleteVirtualRouterOutput extends js.Object {
    var virtualRouter: VirtualRouterData
  }

  /**
    */
  @js.native
  @Factory
  trait DeleteVirtualServiceInput extends js.Object {
    var meshName: ResourceName
    var virtualServiceName: ServiceName
  }

  /**
    */
  @js.native
  @Factory
  trait DeleteVirtualServiceOutput extends js.Object {
    var virtualService: VirtualServiceData
  }

  /**
    */
  @js.native
  @Factory
  trait DescribeMeshInput extends js.Object {
    var meshName: ResourceName
  }

  /**
    */
  @js.native
  @Factory
  trait DescribeMeshOutput extends js.Object {
    var mesh: MeshData
  }

  /**
    */
  @js.native
  @Factory
  trait DescribeRouteInput extends js.Object {
    var meshName: ResourceName
    var routeName: ResourceName
    var virtualRouterName: ResourceName
  }

  /**
    */
  @js.native
  @Factory
  trait DescribeRouteOutput extends js.Object {
    var route: RouteData
  }

  /**
    */
  @js.native
  @Factory
  trait DescribeVirtualNodeInput extends js.Object {
    var meshName: ResourceName
    var virtualNodeName: ResourceName
  }

  /**
    */
  @js.native
  @Factory
  trait DescribeVirtualNodeOutput extends js.Object {
    var virtualNode: VirtualNodeData
  }

  /**
    */
  @js.native
  @Factory
  trait DescribeVirtualRouterInput extends js.Object {
    var meshName: ResourceName
    var virtualRouterName: ResourceName
  }

  /**
    */
  @js.native
  @Factory
  trait DescribeVirtualRouterOutput extends js.Object {
    var virtualRouter: VirtualRouterData
  }

  /**
    */
  @js.native
  @Factory
  trait DescribeVirtualServiceInput extends js.Object {
    var meshName: ResourceName
    var virtualServiceName: ServiceName
  }

  /**
    */
  @js.native
  @Factory
  trait DescribeVirtualServiceOutput extends js.Object {
    var virtualService: VirtualServiceData
  }

  /**
    * <p>An object that represents the DNS service discovery information for your virtual
    *          node.</p>
    */
  @js.native
  @Factory
  trait DnsServiceDiscovery extends js.Object {
    var hostname: Hostname
  }

  /**
    * An object that represents a duration of time.
    */
  @js.native
  @Factory
  trait Duration extends js.Object {
    var unit: js.UndefOr[DurationUnit]
    var value: js.UndefOr[DurationValue]
  }

  @js.native
  sealed trait DurationUnit extends js.Any
  object DurationUnit extends js.Object {
    val ms = "ms".asInstanceOf[DurationUnit]
    val s  = "s".asInstanceOf[DurationUnit]

    val values = js.Object.freeze(js.Array(ms, s))
  }

  /**
    * An object that represents the egress filter rules for a service mesh.
    */
  @js.native
  @Factory
  trait EgressFilter extends js.Object {
    var `type`: EgressFilterType
  }

  @js.native
  sealed trait EgressFilterType extends js.Any
  object EgressFilterType extends js.Object {
    val ALLOW_ALL = "ALLOW_ALL".asInstanceOf[EgressFilterType]
    val DROP_ALL  = "DROP_ALL".asInstanceOf[EgressFilterType]

    val values = js.Object.freeze(js.Array(ALLOW_ALL, DROP_ALL))
  }

  /**
    * An object that represents an access log file.
    */
  @js.native
  @Factory
  trait FileAccessLog extends js.Object {
    var path: FilePath
  }

  /**
    * An object that represents a retry policy. Specify at least one value for at least one of the types of <code>RetryEvents</code>, a value for <code>maxRetries</code>, and a value for <code>perRetryTimeout</code>.
    */
  @js.native
  @Factory
  trait GrpcRetryPolicy extends js.Object {
    var maxRetries: MaxRetries
    var perRetryTimeout: Duration
    var grpcRetryEvents: js.UndefOr[GrpcRetryPolicyEvents]
    var httpRetryEvents: js.UndefOr[HttpRetryPolicyEvents]
    var tcpRetryEvents: js.UndefOr[TcpRetryPolicyEvents]
  }

  @js.native
  sealed trait GrpcRetryPolicyEvent extends js.Any
  object GrpcRetryPolicyEvent extends js.Object {
    val cancelled            = "cancelled".asInstanceOf[GrpcRetryPolicyEvent]
    val `deadline-exceeded`  = "deadline-exceeded".asInstanceOf[GrpcRetryPolicyEvent]
    val internal             = "internal".asInstanceOf[GrpcRetryPolicyEvent]
    val `resource-exhausted` = "resource-exhausted".asInstanceOf[GrpcRetryPolicyEvent]
    val unavailable          = "unavailable".asInstanceOf[GrpcRetryPolicyEvent]

    val values = js.Object.freeze(js.Array(cancelled, `deadline-exceeded`, internal, `resource-exhausted`, unavailable))
  }

  /**
    * An object that represents a GRPC route type.
    */
  @js.native
  @Factory
  trait GrpcRoute extends js.Object {
    var action: GrpcRouteAction
    var `match`: GrpcRouteMatch
    var retryPolicy: js.UndefOr[GrpcRetryPolicy]
  }

  /**
    * An object that represents the action to take if a match is determined.
    */
  @js.native
  @Factory
  trait GrpcRouteAction extends js.Object {
    var weightedTargets: WeightedTargets
  }

  /**
    * An object that represents the criteria for determining a request match.
    */
  @js.native
  @Factory
  trait GrpcRouteMatch extends js.Object {
    var metadata: js.UndefOr[GrpcRouteMetadataList]
    var methodName: js.UndefOr[MethodName]
    var serviceName: js.UndefOr[ServiceName]
  }

  /**
    * An object that represents the match metadata for the route.
    */
  @js.native
  @Factory
  trait GrpcRouteMetadata extends js.Object {
    var name: HeaderName
    var invert: js.UndefOr[Boolean]
    var `match`: js.UndefOr[GrpcRouteMetadataMatchMethod]
  }

  /**
    * An object that represents the match method. Specify one of the match values.
    */
  @js.native
  @Factory
  trait GrpcRouteMetadataMatchMethod extends js.Object {
    var exact: js.UndefOr[HeaderMatch]
    var prefix: js.UndefOr[HeaderMatch]
    var range: js.UndefOr[MatchRange]
    var regex: js.UndefOr[HeaderMatch]
    var suffix: js.UndefOr[HeaderMatch]
  }

  /**
    * <p>An object that represents the method and value to match with the header value sent in a
    *          request. Specify one match method.</p>
    */
  @js.native
  @Factory
  trait HeaderMatchMethod extends js.Object {
    var exact: js.UndefOr[HeaderMatch]
    var prefix: js.UndefOr[HeaderMatch]
    var range: js.UndefOr[MatchRange]
    var regex: js.UndefOr[HeaderMatch]
    var suffix: js.UndefOr[HeaderMatch]
  }

  /**
    * An object that represents the health check policy for a virtual node's listener.
    */
  @js.native
  @Factory
  trait HealthCheckPolicy extends js.Object {
    var healthyThreshold: HealthCheckThreshold
    var intervalMillis: HealthCheckIntervalMillis
    var protocol: PortProtocol
    var timeoutMillis: HealthCheckTimeoutMillis
    var unhealthyThreshold: HealthCheckThreshold
    var path: js.UndefOr[String]
    var port: js.UndefOr[PortNumber]
  }

  @js.native
  sealed trait HttpMethod extends js.Any
  object HttpMethod extends js.Object {
    val CONNECT = "CONNECT".asInstanceOf[HttpMethod]
    val DELETE  = "DELETE".asInstanceOf[HttpMethod]
    val GET     = "GET".asInstanceOf[HttpMethod]
    val HEAD    = "HEAD".asInstanceOf[HttpMethod]
    val OPTIONS = "OPTIONS".asInstanceOf[HttpMethod]
    val PATCH   = "PATCH".asInstanceOf[HttpMethod]
    val POST    = "POST".asInstanceOf[HttpMethod]
    val PUT     = "PUT".asInstanceOf[HttpMethod]
    val TRACE   = "TRACE".asInstanceOf[HttpMethod]

    val values = js.Object.freeze(js.Array(CONNECT, DELETE, GET, HEAD, OPTIONS, PATCH, POST, PUT, TRACE))
  }

  /**
    * An object that represents a retry policy. Specify at least one value for at least one of the types of <code>RetryEvents</code>, a value for <code>maxRetries</code>, and a value for <code>perRetryTimeout</code>.
    */
  @js.native
  @Factory
  trait HttpRetryPolicy extends js.Object {
    var maxRetries: MaxRetries
    var perRetryTimeout: Duration
    var httpRetryEvents: js.UndefOr[HttpRetryPolicyEvents]
    var tcpRetryEvents: js.UndefOr[TcpRetryPolicyEvents]
  }

  /**
    * An object that represents an HTTP or HTTP2 route type.
    */
  @js.native
  @Factory
  trait HttpRoute extends js.Object {
    var action: HttpRouteAction
    var `match`: HttpRouteMatch
    var retryPolicy: js.UndefOr[HttpRetryPolicy]
  }

  /**
    * An object that represents the action to take if a match is determined.
    */
  @js.native
  @Factory
  trait HttpRouteAction extends js.Object {
    var weightedTargets: WeightedTargets
  }

  /**
    * An object that represents the HTTP header in the request.
    */
  @js.native
  @Factory
  trait HttpRouteHeader extends js.Object {
    var name: HeaderName
    var invert: js.UndefOr[Boolean]
    var `match`: js.UndefOr[HeaderMatchMethod]
  }

  /**
    * <p>An object that represents the requirements for a route to match HTTP requests for a virtual
    *          router.</p>
    */
  @js.native
  @Factory
  trait HttpRouteMatch extends js.Object {
    var prefix: String
    var headers: js.UndefOr[HttpRouteHeaders]
    var method: js.UndefOr[HttpMethod]
    var scheme: js.UndefOr[HttpScheme]
  }

  @js.native
  sealed trait HttpScheme extends js.Any
  object HttpScheme extends js.Object {
    val http  = "http".asInstanceOf[HttpScheme]
    val https = "https".asInstanceOf[HttpScheme]

    val values = js.Object.freeze(js.Array(http, https))
  }

  /**
    */
  @js.native
  @Factory
  trait ListMeshesInput extends js.Object {
    var limit: js.UndefOr[ListMeshesLimit]
    var nextToken: js.UndefOr[String]
  }

  /**
    */
  @js.native
  @Factory
  trait ListMeshesOutput extends js.Object {
    var meshes: MeshList
    var nextToken: js.UndefOr[String]
  }

  /**
    */
  @js.native
  @Factory
  trait ListRoutesInput extends js.Object {
    var meshName: ResourceName
    var virtualRouterName: ResourceName
    var limit: js.UndefOr[ListRoutesLimit]
    var nextToken: js.UndefOr[String]
  }

  /**
    */
  @js.native
  @Factory
  trait ListRoutesOutput extends js.Object {
    var routes: RouteList
    var nextToken: js.UndefOr[String]
  }

  /**
    */
  @js.native
  @Factory
  trait ListTagsForResourceInput extends js.Object {
    var resourceArn: Arn
    var limit: js.UndefOr[TagsLimit]
    var nextToken: js.UndefOr[String]
  }

  /**
    */
  @js.native
  @Factory
  trait ListTagsForResourceOutput extends js.Object {
    var tags: TagList
    var nextToken: js.UndefOr[String]
  }

  /**
    */
  @js.native
  @Factory
  trait ListVirtualNodesInput extends js.Object {
    var meshName: ResourceName
    var limit: js.UndefOr[ListVirtualNodesLimit]
    var nextToken: js.UndefOr[String]
  }

  /**
    */
  @js.native
  @Factory
  trait ListVirtualNodesOutput extends js.Object {
    var virtualNodes: VirtualNodeList
    var nextToken: js.UndefOr[String]
  }

  /**
    */
  @js.native
  @Factory
  trait ListVirtualRoutersInput extends js.Object {
    var meshName: ResourceName
    var limit: js.UndefOr[ListVirtualRoutersLimit]
    var nextToken: js.UndefOr[String]
  }

  /**
    */
  @js.native
  @Factory
  trait ListVirtualRoutersOutput extends js.Object {
    var virtualRouters: VirtualRouterList
    var nextToken: js.UndefOr[String]
  }

  /**
    */
  @js.native
  @Factory
  trait ListVirtualServicesInput extends js.Object {
    var meshName: ResourceName
    var limit: js.UndefOr[ListVirtualServicesLimit]
    var nextToken: js.UndefOr[String]
  }

  /**
    */
  @js.native
  @Factory
  trait ListVirtualServicesOutput extends js.Object {
    var virtualServices: VirtualServiceList
    var nextToken: js.UndefOr[String]
  }

  /**
    * An object that represents a listener for a virtual node.
    */
  @js.native
  @Factory
  trait Listener extends js.Object {
    var portMapping: PortMapping
    var healthCheck: js.UndefOr[HealthCheckPolicy]
  }

  /**
    * An object that represents the logging information for a virtual node.
    */
  @js.native
  @Factory
  trait Logging extends js.Object {
    var accessLog: js.UndefOr[AccessLog]
  }

  /**
    * An object that represents the range of values to match on. The first character of the range is included in the range, though the last character is not. For example, if the range specified were 1-100, only values 1-99 would be matched.
    */
  @js.native
  @Factory
  trait MatchRange extends js.Object {
    var end: Double
    var start: Double
  }

  /**
    * An object that represents a service mesh returned by a describe operation.
    */
  @js.native
  @Factory
  trait MeshData extends js.Object {
    var meshName: ResourceName
    var metadata: ResourceMetadata
    var spec: MeshSpec
    var status: MeshStatus
  }

  /**
    * An object that represents a service mesh returned by a list operation.
    */
  @js.native
  @Factory
  trait MeshRef extends js.Object {
    var arn: Arn
    var meshName: ResourceName
  }

  /**
    * An object that represents the specification of a service mesh.
    */
  @js.native
  @Factory
  trait MeshSpec extends js.Object {
    var egressFilter: js.UndefOr[EgressFilter]
  }

  /**
    * An object that represents the status of a service mesh.
    */
  @js.native
  @Factory
  trait MeshStatus extends js.Object {
    var status: js.UndefOr[MeshStatusCode]
  }

  @js.native
  sealed trait MeshStatusCode extends js.Any
  object MeshStatusCode extends js.Object {
    val ACTIVE   = "ACTIVE".asInstanceOf[MeshStatusCode]
    val DELETED  = "DELETED".asInstanceOf[MeshStatusCode]
    val INACTIVE = "INACTIVE".asInstanceOf[MeshStatusCode]

    val values = js.Object.freeze(js.Array(ACTIVE, DELETED, INACTIVE))
  }

  /**
    * An object that represents a port mapping.
    */
  @js.native
  @Factory
  trait PortMapping extends js.Object {
    var port: PortNumber
    var protocol: PortProtocol
  }

  @js.native
  sealed trait PortProtocol extends js.Any
  object PortProtocol extends js.Object {
    val grpc  = "grpc".asInstanceOf[PortProtocol]
    val http  = "http".asInstanceOf[PortProtocol]
    val http2 = "http2".asInstanceOf[PortProtocol]
    val tcp   = "tcp".asInstanceOf[PortProtocol]

    val values = js.Object.freeze(js.Array(grpc, http, http2, tcp))
  }

  /**
    * An object that represents metadata for a resource.
    */
  @js.native
  @Factory
  trait ResourceMetadata extends js.Object {
    var arn: Arn
    var createdAt: Timestamp
    var lastUpdatedAt: Timestamp
    var uid: String
    var version: Double
  }

  /**
    * An object that represents a route returned by a describe operation.
    */
  @js.native
  @Factory
  trait RouteData extends js.Object {
    var meshName: ResourceName
    var metadata: ResourceMetadata
    var routeName: ResourceName
    var spec: RouteSpec
    var status: RouteStatus
    var virtualRouterName: ResourceName
  }

  /**
    * An object that represents a route returned by a list operation.
    */
  @js.native
  @Factory
  trait RouteRef extends js.Object {
    var arn: Arn
    var meshName: ResourceName
    var routeName: ResourceName
    var virtualRouterName: ResourceName
  }

  /**
    * An object that represents a route specification. Specify one route type.
    */
  @js.native
  @Factory
  trait RouteSpec extends js.Object {
    var grpcRoute: js.UndefOr[GrpcRoute]
    var http2Route: js.UndefOr[HttpRoute]
    var httpRoute: js.UndefOr[HttpRoute]
    var priority: js.UndefOr[RoutePriority]
    var tcpRoute: js.UndefOr[TcpRoute]
  }

  /**
    * An object that represents the current status of a route.
    */
  @js.native
  @Factory
  trait RouteStatus extends js.Object {
    var status: RouteStatusCode
  }

  @js.native
  sealed trait RouteStatusCode extends js.Any
  object RouteStatusCode extends js.Object {
    val ACTIVE   = "ACTIVE".asInstanceOf[RouteStatusCode]
    val DELETED  = "DELETED".asInstanceOf[RouteStatusCode]
    val INACTIVE = "INACTIVE".asInstanceOf[RouteStatusCode]

    val values = js.Object.freeze(js.Array(ACTIVE, DELETED, INACTIVE))
  }

  /**
    * An object that represents the service discovery information for a virtual node.
    */
  @js.native
  @Factory
  trait ServiceDiscovery extends js.Object {
    var awsCloudMap: js.UndefOr[AwsCloudMapServiceDiscovery]
    var dns: js.UndefOr[DnsServiceDiscovery]
  }

  /**
    * <p>Optional metadata that you apply to a resource to assist with categorization and
    *          organization. Each tag consists of a key and an optional value, both of which you define.
    *          Tag keys can have a maximum character length of 128 characters, and tag values can have
    *             a maximum length of 256 characters.</p>
    */
  @js.native
  @Factory
  trait TagRef extends js.Object {
    var key: TagKey
    var value: js.UndefOr[TagValue]
  }

  /**
    */
  @js.native
  @Factory
  trait TagResourceInput extends js.Object {
    var resourceArn: Arn
    var tags: TagList
  }

  /**
    */
  @js.native
  @Factory
  trait TagResourceOutput extends js.Object {}

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
  @Factory
  trait TcpRoute extends js.Object {
    var action: TcpRouteAction
  }

  /**
    * An object that represents the action to take if a match is determined.
    */
  @js.native
  @Factory
  trait TcpRouteAction extends js.Object {
    var weightedTargets: WeightedTargets
  }

  /**
    */
  @js.native
  @Factory
  trait UntagResourceInput extends js.Object {
    var resourceArn: Arn
    var tagKeys: TagKeyList
  }

  /**
    */
  @js.native
  @Factory
  trait UntagResourceOutput extends js.Object {}

  /**
    */
  @js.native
  @Factory
  trait UpdateMeshInput extends js.Object {
    var meshName: ResourceName
    var clientToken: js.UndefOr[String]
    var spec: js.UndefOr[MeshSpec]
  }

  /**
    */
  @js.native
  @Factory
  trait UpdateMeshOutput extends js.Object {
    var mesh: MeshData
  }

  /**
    */
  @js.native
  @Factory
  trait UpdateRouteInput extends js.Object {
    var meshName: ResourceName
    var routeName: ResourceName
    var spec: RouteSpec
    var virtualRouterName: ResourceName
    var clientToken: js.UndefOr[String]
  }

  /**
    */
  @js.native
  @Factory
  trait UpdateRouteOutput extends js.Object {
    var route: RouteData
  }

  /**
    */
  @js.native
  @Factory
  trait UpdateVirtualNodeInput extends js.Object {
    var meshName: ResourceName
    var spec: VirtualNodeSpec
    var virtualNodeName: ResourceName
    var clientToken: js.UndefOr[String]
  }

  /**
    */
  @js.native
  @Factory
  trait UpdateVirtualNodeOutput extends js.Object {
    var virtualNode: VirtualNodeData
  }

  /**
    */
  @js.native
  @Factory
  trait UpdateVirtualRouterInput extends js.Object {
    var meshName: ResourceName
    var spec: VirtualRouterSpec
    var virtualRouterName: ResourceName
    var clientToken: js.UndefOr[String]
  }

  /**
    */
  @js.native
  @Factory
  trait UpdateVirtualRouterOutput extends js.Object {
    var virtualRouter: VirtualRouterData
  }

  /**
    */
  @js.native
  @Factory
  trait UpdateVirtualServiceInput extends js.Object {
    var meshName: ResourceName
    var spec: VirtualServiceSpec
    var virtualServiceName: ServiceName
    var clientToken: js.UndefOr[String]
  }

  /**
    */
  @js.native
  @Factory
  trait UpdateVirtualServiceOutput extends js.Object {
    var virtualService: VirtualServiceData
  }

  /**
    * An object that represents a virtual node returned by a describe operation.
    */
  @js.native
  @Factory
  trait VirtualNodeData extends js.Object {
    var meshName: ResourceName
    var metadata: ResourceMetadata
    var spec: VirtualNodeSpec
    var status: VirtualNodeStatus
    var virtualNodeName: ResourceName
  }

  /**
    * An object that represents a virtual node returned by a list operation.
    */
  @js.native
  @Factory
  trait VirtualNodeRef extends js.Object {
    var arn: Arn
    var meshName: ResourceName
    var virtualNodeName: ResourceName
  }

  /**
    * An object that represents a virtual node service provider.
    */
  @js.native
  @Factory
  trait VirtualNodeServiceProvider extends js.Object {
    var virtualNodeName: ResourceName
  }

  /**
    * An object that represents the specification of a virtual node.
    */
  @js.native
  @Factory
  trait VirtualNodeSpec extends js.Object {
    var backends: js.UndefOr[Backends]
    var listeners: js.UndefOr[Listeners]
    var logging: js.UndefOr[Logging]
    var serviceDiscovery: js.UndefOr[ServiceDiscovery]
  }

  /**
    * An object that represents the current status of the virtual node.
    */
  @js.native
  @Factory
  trait VirtualNodeStatus extends js.Object {
    var status: VirtualNodeStatusCode
  }

  @js.native
  sealed trait VirtualNodeStatusCode extends js.Any
  object VirtualNodeStatusCode extends js.Object {
    val ACTIVE   = "ACTIVE".asInstanceOf[VirtualNodeStatusCode]
    val DELETED  = "DELETED".asInstanceOf[VirtualNodeStatusCode]
    val INACTIVE = "INACTIVE".asInstanceOf[VirtualNodeStatusCode]

    val values = js.Object.freeze(js.Array(ACTIVE, DELETED, INACTIVE))
  }

  /**
    * An object that represents a virtual router returned by a describe operation.
    */
  @js.native
  @Factory
  trait VirtualRouterData extends js.Object {
    var meshName: ResourceName
    var metadata: ResourceMetadata
    var spec: VirtualRouterSpec
    var status: VirtualRouterStatus
    var virtualRouterName: ResourceName
  }

  /**
    * An object that represents a virtual router listener.
    */
  @js.native
  @Factory
  trait VirtualRouterListener extends js.Object {
    var portMapping: PortMapping
  }

  /**
    * An object that represents a virtual router returned by a list operation.
    */
  @js.native
  @Factory
  trait VirtualRouterRef extends js.Object {
    var arn: Arn
    var meshName: ResourceName
    var virtualRouterName: ResourceName
  }

  /**
    * An object that represents a virtual node service provider.
    */
  @js.native
  @Factory
  trait VirtualRouterServiceProvider extends js.Object {
    var virtualRouterName: ResourceName
  }

  /**
    * An object that represents the specification of a virtual router.
    */
  @js.native
  @Factory
  trait VirtualRouterSpec extends js.Object {
    var listeners: js.UndefOr[VirtualRouterListeners]
  }

  /**
    * An object that represents the status of a virtual router.
    */
  @js.native
  @Factory
  trait VirtualRouterStatus extends js.Object {
    var status: VirtualRouterStatusCode
  }

  @js.native
  sealed trait VirtualRouterStatusCode extends js.Any
  object VirtualRouterStatusCode extends js.Object {
    val ACTIVE   = "ACTIVE".asInstanceOf[VirtualRouterStatusCode]
    val DELETED  = "DELETED".asInstanceOf[VirtualRouterStatusCode]
    val INACTIVE = "INACTIVE".asInstanceOf[VirtualRouterStatusCode]

    val values = js.Object.freeze(js.Array(ACTIVE, DELETED, INACTIVE))
  }

  /**
    * An object that represents a virtual service backend for a virtual node.
    */
  @js.native
  @Factory
  trait VirtualServiceBackend extends js.Object {
    var virtualServiceName: ServiceName
  }

  /**
    * An object that represents a virtual service returned by a describe operation.
    */
  @js.native
  @Factory
  trait VirtualServiceData extends js.Object {
    var meshName: ResourceName
    var metadata: ResourceMetadata
    var spec: VirtualServiceSpec
    var status: VirtualServiceStatus
    var virtualServiceName: ServiceName
  }

  /**
    * An object that represents the provider for a virtual service.
    */
  @js.native
  @Factory
  trait VirtualServiceProvider extends js.Object {
    var virtualNode: js.UndefOr[VirtualNodeServiceProvider]
    var virtualRouter: js.UndefOr[VirtualRouterServiceProvider]
  }

  /**
    * An object that represents a virtual service returned by a list operation.
    */
  @js.native
  @Factory
  trait VirtualServiceRef extends js.Object {
    var arn: Arn
    var meshName: ResourceName
    var virtualServiceName: ServiceName
  }

  /**
    * An object that represents the specification of a virtual service.
    */
  @js.native
  @Factory
  trait VirtualServiceSpec extends js.Object {
    var provider: js.UndefOr[VirtualServiceProvider]
  }

  /**
    * An object that represents the status of a virtual service.
    */
  @js.native
  @Factory
  trait VirtualServiceStatus extends js.Object {
    var status: VirtualServiceStatusCode
  }

  @js.native
  sealed trait VirtualServiceStatusCode extends js.Any
  object VirtualServiceStatusCode extends js.Object {
    val ACTIVE   = "ACTIVE".asInstanceOf[VirtualServiceStatusCode]
    val DELETED  = "DELETED".asInstanceOf[VirtualServiceStatusCode]
    val INACTIVE = "INACTIVE".asInstanceOf[VirtualServiceStatusCode]

    val values = js.Object.freeze(js.Array(ACTIVE, DELETED, INACTIVE))
  }

  /**
    * <p>An object that represents a target and its relative weight. Traffic is distributed across
    *          targets according to their relative weight. For example, a weighted target with a relative
    *          weight of 50 receives five times as much traffic as one with a relative weight of
    *          10. The total weight for all targets combined must be less than or equal to 100.</p>
    */
  @js.native
  @Factory
  trait WeightedTarget extends js.Object {
    var virtualNode: ResourceName
    var weight: PercentInt
  }
}
