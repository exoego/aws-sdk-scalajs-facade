package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import scala.language.implicitConversions
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
  type ExactHostName = String
  type FilePath = String
  type GatewayRouteList = js.Array[GatewayRouteRef]
  type GatewayRoutePriority = Int
  type GrpcGatewayRouteMetadataList = js.Array[GrpcGatewayRouteMetadata]
  type GrpcRetryPolicyEvents = js.Array[GrpcRetryPolicyEvent]
  type GrpcRouteMetadataList = js.Array[GrpcRouteMetadata]
  type HeaderMatch = String
  type HeaderName = String
  type HealthCheckIntervalMillis = Double
  type HealthCheckThreshold = Int
  type HealthCheckTimeoutMillis = Double
  type Hostname = String
  type HttpGatewayRouteHeaders = js.Array[HttpGatewayRouteHeader]
  type HttpGatewayRoutePrefix = String
  type HttpPathExact = String
  type HttpPathRegex = String
  type HttpQueryParameters = js.Array[HttpQueryParameter]
  type HttpRetryPolicyEvent = String
  type HttpRetryPolicyEvents = js.Array[HttpRetryPolicyEvent]
  type HttpRouteHeaders = js.Array[HttpRouteHeader]
  type ListGatewayRoutesLimit = Int
  type ListMeshesLimit = Int
  type ListRoutesLimit = Int
  type ListVirtualGatewaysLimit = Int
  type ListVirtualNodesLimit = Int
  type ListVirtualRoutersLimit = Int
  type ListVirtualServicesLimit = Int
  type Listeners = js.Array[Listener]
  type MaxConnections = Int
  type MaxPendingRequests = Int
  type MaxRequests = Int
  type MaxRetries = Double
  type MeshList = js.Array[MeshRef]
  type MethodName = String
  type OutlierDetectionMaxEjectionPercent = Int
  type OutlierDetectionMaxServerErrors = Double
  type PercentInt = Int
  type PortNumber = Int
  type PortSet = js.Array[PortNumber]
  type QueryParameterName = String
  type ResourceName = String
  type RouteList = js.Array[RouteRef]
  type RoutePriority = Int
  type SdsSecretName = String
  type ServiceName = String
  type SubjectAlternativeName = String
  type SubjectAlternativeNameList = js.Array[SubjectAlternativeName]
  type SuffixHostname = String
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[TagRef]
  type TagValue = String
  type TagsLimit = Int
  type TcpRetryPolicyEvents = js.Array[TcpRetryPolicyEvent]
  type Timestamp = js.Date
  type VirtualGatewayCertificateAuthorityArns = js.Array[Arn]
  type VirtualGatewayHealthCheckIntervalMillis = Double
  type VirtualGatewayHealthCheckThreshold = Int
  type VirtualGatewayHealthCheckTimeoutMillis = Double
  type VirtualGatewayList = js.Array[VirtualGatewayRef]
  type VirtualGatewayListeners = js.Array[VirtualGatewayListener]
  type VirtualGatewaySdsSecretName = String
  type VirtualNodeList = js.Array[VirtualNodeRef]
  type VirtualRouterList = js.Array[VirtualRouterRef]
  type VirtualRouterListeners = js.Array[VirtualRouterListener]
  type VirtualServiceList = js.Array[VirtualServiceRef]
  type WeightedTargets = js.Array[WeightedTarget]

  final class AppMeshOps(private val service: AppMesh) extends AnyVal {

    @inline def createGatewayRouteFuture(params: CreateGatewayRouteInput): Future[CreateGatewayRouteOutput] = service.createGatewayRoute(params).promise().toFuture
    @inline def createMeshFuture(params: CreateMeshInput): Future[CreateMeshOutput] = service.createMesh(params).promise().toFuture
    @inline def createRouteFuture(params: CreateRouteInput): Future[CreateRouteOutput] = service.createRoute(params).promise().toFuture
    @inline def createVirtualGatewayFuture(params: CreateVirtualGatewayInput): Future[CreateVirtualGatewayOutput] = service.createVirtualGateway(params).promise().toFuture
    @inline def createVirtualNodeFuture(params: CreateVirtualNodeInput): Future[CreateVirtualNodeOutput] = service.createVirtualNode(params).promise().toFuture
    @inline def createVirtualRouterFuture(params: CreateVirtualRouterInput): Future[CreateVirtualRouterOutput] = service.createVirtualRouter(params).promise().toFuture
    @inline def createVirtualServiceFuture(params: CreateVirtualServiceInput): Future[CreateVirtualServiceOutput] = service.createVirtualService(params).promise().toFuture
    @inline def deleteGatewayRouteFuture(params: DeleteGatewayRouteInput): Future[DeleteGatewayRouteOutput] = service.deleteGatewayRoute(params).promise().toFuture
    @inline def deleteMeshFuture(params: DeleteMeshInput): Future[DeleteMeshOutput] = service.deleteMesh(params).promise().toFuture
    @inline def deleteRouteFuture(params: DeleteRouteInput): Future[DeleteRouteOutput] = service.deleteRoute(params).promise().toFuture
    @inline def deleteVirtualGatewayFuture(params: DeleteVirtualGatewayInput): Future[DeleteVirtualGatewayOutput] = service.deleteVirtualGateway(params).promise().toFuture
    @inline def deleteVirtualNodeFuture(params: DeleteVirtualNodeInput): Future[DeleteVirtualNodeOutput] = service.deleteVirtualNode(params).promise().toFuture
    @inline def deleteVirtualRouterFuture(params: DeleteVirtualRouterInput): Future[DeleteVirtualRouterOutput] = service.deleteVirtualRouter(params).promise().toFuture
    @inline def deleteVirtualServiceFuture(params: DeleteVirtualServiceInput): Future[DeleteVirtualServiceOutput] = service.deleteVirtualService(params).promise().toFuture
    @inline def describeGatewayRouteFuture(params: DescribeGatewayRouteInput): Future[DescribeGatewayRouteOutput] = service.describeGatewayRoute(params).promise().toFuture
    @inline def describeMeshFuture(params: DescribeMeshInput): Future[DescribeMeshOutput] = service.describeMesh(params).promise().toFuture
    @inline def describeRouteFuture(params: DescribeRouteInput): Future[DescribeRouteOutput] = service.describeRoute(params).promise().toFuture
    @inline def describeVirtualGatewayFuture(params: DescribeVirtualGatewayInput): Future[DescribeVirtualGatewayOutput] = service.describeVirtualGateway(params).promise().toFuture
    @inline def describeVirtualNodeFuture(params: DescribeVirtualNodeInput): Future[DescribeVirtualNodeOutput] = service.describeVirtualNode(params).promise().toFuture
    @inline def describeVirtualRouterFuture(params: DescribeVirtualRouterInput): Future[DescribeVirtualRouterOutput] = service.describeVirtualRouter(params).promise().toFuture
    @inline def describeVirtualServiceFuture(params: DescribeVirtualServiceInput): Future[DescribeVirtualServiceOutput] = service.describeVirtualService(params).promise().toFuture
    @inline def listGatewayRoutesFuture(params: ListGatewayRoutesInput): Future[ListGatewayRoutesOutput] = service.listGatewayRoutes(params).promise().toFuture
    @inline def listMeshesFuture(params: ListMeshesInput): Future[ListMeshesOutput] = service.listMeshes(params).promise().toFuture
    @inline def listRoutesFuture(params: ListRoutesInput): Future[ListRoutesOutput] = service.listRoutes(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceInput): Future[ListTagsForResourceOutput] = service.listTagsForResource(params).promise().toFuture
    @inline def listVirtualGatewaysFuture(params: ListVirtualGatewaysInput): Future[ListVirtualGatewaysOutput] = service.listVirtualGateways(params).promise().toFuture
    @inline def listVirtualNodesFuture(params: ListVirtualNodesInput): Future[ListVirtualNodesOutput] = service.listVirtualNodes(params).promise().toFuture
    @inline def listVirtualRoutersFuture(params: ListVirtualRoutersInput): Future[ListVirtualRoutersOutput] = service.listVirtualRouters(params).promise().toFuture
    @inline def listVirtualServicesFuture(params: ListVirtualServicesInput): Future[ListVirtualServicesOutput] = service.listVirtualServices(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceInput): Future[TagResourceOutput] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceInput): Future[UntagResourceOutput] = service.untagResource(params).promise().toFuture
    @inline def updateGatewayRouteFuture(params: UpdateGatewayRouteInput): Future[UpdateGatewayRouteOutput] = service.updateGatewayRoute(params).promise().toFuture
    @inline def updateMeshFuture(params: UpdateMeshInput): Future[UpdateMeshOutput] = service.updateMesh(params).promise().toFuture
    @inline def updateRouteFuture(params: UpdateRouteInput): Future[UpdateRouteOutput] = service.updateRoute(params).promise().toFuture
    @inline def updateVirtualGatewayFuture(params: UpdateVirtualGatewayInput): Future[UpdateVirtualGatewayOutput] = service.updateVirtualGateway(params).promise().toFuture
    @inline def updateVirtualNodeFuture(params: UpdateVirtualNodeInput): Future[UpdateVirtualNodeOutput] = service.updateVirtualNode(params).promise().toFuture
    @inline def updateVirtualRouterFuture(params: UpdateVirtualRouterInput): Future[UpdateVirtualRouterOutput] = service.updateVirtualRouter(params).promise().toFuture
    @inline def updateVirtualServiceFuture(params: UpdateVirtualServiceInput): Future[UpdateVirtualServiceOutput] = service.updateVirtualService(params).promise().toFuture

  }

  @js.native
  @JSImport("aws-sdk/clients/appmesh", JSImport.Namespace, "AWS.AppMesh")
  class AppMesh() extends js.Object {
    def this(config: AWSConfig) = this()

    def createGatewayRoute(params: CreateGatewayRouteInput): Request[CreateGatewayRouteOutput] = js.native
    def createMesh(params: CreateMeshInput): Request[CreateMeshOutput] = js.native
    def createRoute(params: CreateRouteInput): Request[CreateRouteOutput] = js.native
    def createVirtualGateway(params: CreateVirtualGatewayInput): Request[CreateVirtualGatewayOutput] = js.native
    def createVirtualNode(params: CreateVirtualNodeInput): Request[CreateVirtualNodeOutput] = js.native
    def createVirtualRouter(params: CreateVirtualRouterInput): Request[CreateVirtualRouterOutput] = js.native
    def createVirtualService(params: CreateVirtualServiceInput): Request[CreateVirtualServiceOutput] = js.native
    def deleteGatewayRoute(params: DeleteGatewayRouteInput): Request[DeleteGatewayRouteOutput] = js.native
    def deleteMesh(params: DeleteMeshInput): Request[DeleteMeshOutput] = js.native
    def deleteRoute(params: DeleteRouteInput): Request[DeleteRouteOutput] = js.native
    def deleteVirtualGateway(params: DeleteVirtualGatewayInput): Request[DeleteVirtualGatewayOutput] = js.native
    def deleteVirtualNode(params: DeleteVirtualNodeInput): Request[DeleteVirtualNodeOutput] = js.native
    def deleteVirtualRouter(params: DeleteVirtualRouterInput): Request[DeleteVirtualRouterOutput] = js.native
    def deleteVirtualService(params: DeleteVirtualServiceInput): Request[DeleteVirtualServiceOutput] = js.native
    def describeGatewayRoute(params: DescribeGatewayRouteInput): Request[DescribeGatewayRouteOutput] = js.native
    def describeMesh(params: DescribeMeshInput): Request[DescribeMeshOutput] = js.native
    def describeRoute(params: DescribeRouteInput): Request[DescribeRouteOutput] = js.native
    def describeVirtualGateway(params: DescribeVirtualGatewayInput): Request[DescribeVirtualGatewayOutput] = js.native
    def describeVirtualNode(params: DescribeVirtualNodeInput): Request[DescribeVirtualNodeOutput] = js.native
    def describeVirtualRouter(params: DescribeVirtualRouterInput): Request[DescribeVirtualRouterOutput] = js.native
    def describeVirtualService(params: DescribeVirtualServiceInput): Request[DescribeVirtualServiceOutput] = js.native
    def listGatewayRoutes(params: ListGatewayRoutesInput): Request[ListGatewayRoutesOutput] = js.native
    def listMeshes(params: ListMeshesInput): Request[ListMeshesOutput] = js.native
    def listRoutes(params: ListRoutesInput): Request[ListRoutesOutput] = js.native
    def listTagsForResource(params: ListTagsForResourceInput): Request[ListTagsForResourceOutput] = js.native
    def listVirtualGateways(params: ListVirtualGatewaysInput): Request[ListVirtualGatewaysOutput] = js.native
    def listVirtualNodes(params: ListVirtualNodesInput): Request[ListVirtualNodesOutput] = js.native
    def listVirtualRouters(params: ListVirtualRoutersInput): Request[ListVirtualRoutersOutput] = js.native
    def listVirtualServices(params: ListVirtualServicesInput): Request[ListVirtualServicesOutput] = js.native
    def tagResource(params: TagResourceInput): Request[TagResourceOutput] = js.native
    def untagResource(params: UntagResourceInput): Request[UntagResourceOutput] = js.native
    def updateGatewayRoute(params: UpdateGatewayRouteInput): Request[UpdateGatewayRouteOutput] = js.native
    def updateMesh(params: UpdateMeshInput): Request[UpdateMeshOutput] = js.native
    def updateRoute(params: UpdateRouteInput): Request[UpdateRouteOutput] = js.native
    def updateVirtualGateway(params: UpdateVirtualGatewayInput): Request[UpdateVirtualGatewayOutput] = js.native
    def updateVirtualNode(params: UpdateVirtualNodeInput): Request[UpdateVirtualNodeOutput] = js.native
    def updateVirtualRouter(params: UpdateVirtualRouterInput): Request[UpdateVirtualRouterOutput] = js.native
    def updateVirtualService(params: UpdateVirtualServiceInput): Request[UpdateVirtualServiceOutput] = js.native
  }
  object AppMesh {
    @inline implicit def toOps(service: AppMesh): AppMeshOps = {
      new AppMeshOps(service)
    }
  }

  /** An object that represents the access logging information for a virtual node.
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

  /** An object that represents the Cloud Map attribute information for your virtual node.
    *
    * '''Note:'''AWS Cloud Map is not available in the eu-south-1 Region.
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

  /** An object that represents the Cloud Map service discovery information for your virtual node.
    *
    * '''Note:'''Cloud Map is not available in the eu-south-1 Region.
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

  /** An object that represents the backends that a virtual node is expected to send outbound traffic to.
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

  /** An object that represents the default properties for a backend.
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

  /** An object that represents a client policy.
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

  /** A reference to an object that represents a Transport Layer Security (TLS) client policy.
    */
  @js.native
  trait ClientPolicyTls extends js.Object {
    var validation: TlsValidationContext
    var certificate: js.UndefOr[ClientTlsCertificate]
    var enforce: js.UndefOr[Boolean]
    var ports: js.UndefOr[PortSet]
  }

  object ClientPolicyTls {
    @inline
    def apply(
        validation: TlsValidationContext,
        certificate: js.UndefOr[ClientTlsCertificate] = js.undefined,
        enforce: js.UndefOr[Boolean] = js.undefined,
        ports: js.UndefOr[PortSet] = js.undefined
    ): ClientPolicyTls = {
      val __obj = js.Dynamic.literal(
        "validation" -> validation.asInstanceOf[js.Any]
      )

      certificate.foreach(__v => __obj.updateDynamic("certificate")(__v.asInstanceOf[js.Any]))
      enforce.foreach(__v => __obj.updateDynamic("enforce")(__v.asInstanceOf[js.Any]))
      ports.foreach(__v => __obj.updateDynamic("ports")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClientPolicyTls]
    }
  }

  /** An object that represents the client's certificate.
    */
  @js.native
  trait ClientTlsCertificate extends js.Object {
    var file: js.UndefOr[ListenerTlsFileCertificate]
    var sds: js.UndefOr[ListenerTlsSdsCertificate]
  }

  object ClientTlsCertificate {
    @inline
    def apply(
        file: js.UndefOr[ListenerTlsFileCertificate] = js.undefined,
        sds: js.UndefOr[ListenerTlsSdsCertificate] = js.undefined
    ): ClientTlsCertificate = {
      val __obj = js.Dynamic.literal()
      file.foreach(__v => __obj.updateDynamic("file")(__v.asInstanceOf[js.Any]))
      sds.foreach(__v => __obj.updateDynamic("sds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ClientTlsCertificate]
    }
  }

  @js.native
  trait CreateGatewayRouteInput extends js.Object {
    var gatewayRouteName: ResourceName
    var meshName: ResourceName
    var spec: GatewayRouteSpec
    var virtualGatewayName: ResourceName
    var clientToken: js.UndefOr[String]
    var meshOwner: js.UndefOr[AccountId]
    var tags: js.UndefOr[TagList]
  }

  object CreateGatewayRouteInput {
    @inline
    def apply(
        gatewayRouteName: ResourceName,
        meshName: ResourceName,
        spec: GatewayRouteSpec,
        virtualGatewayName: ResourceName,
        clientToken: js.UndefOr[String] = js.undefined,
        meshOwner: js.UndefOr[AccountId] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateGatewayRouteInput = {
      val __obj = js.Dynamic.literal(
        "gatewayRouteName" -> gatewayRouteName.asInstanceOf[js.Any],
        "meshName" -> meshName.asInstanceOf[js.Any],
        "spec" -> spec.asInstanceOf[js.Any],
        "virtualGatewayName" -> virtualGatewayName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      meshOwner.foreach(__v => __obj.updateDynamic("meshOwner")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateGatewayRouteInput]
    }
  }

  @js.native
  trait CreateGatewayRouteOutput extends js.Object {
    var gatewayRoute: GatewayRouteData
  }

  object CreateGatewayRouteOutput {
    @inline
    def apply(
        gatewayRoute: GatewayRouteData
    ): CreateGatewayRouteOutput = {
      val __obj = js.Dynamic.literal(
        "gatewayRoute" -> gatewayRoute.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateGatewayRouteOutput]
    }
  }

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  @js.native
  trait CreateVirtualGatewayInput extends js.Object {
    var meshName: ResourceName
    var spec: VirtualGatewaySpec
    var virtualGatewayName: ResourceName
    var clientToken: js.UndefOr[String]
    var meshOwner: js.UndefOr[AccountId]
    var tags: js.UndefOr[TagList]
  }

  object CreateVirtualGatewayInput {
    @inline
    def apply(
        meshName: ResourceName,
        spec: VirtualGatewaySpec,
        virtualGatewayName: ResourceName,
        clientToken: js.UndefOr[String] = js.undefined,
        meshOwner: js.UndefOr[AccountId] = js.undefined,
        tags: js.UndefOr[TagList] = js.undefined
    ): CreateVirtualGatewayInput = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any],
        "spec" -> spec.asInstanceOf[js.Any],
        "virtualGatewayName" -> virtualGatewayName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      meshOwner.foreach(__v => __obj.updateDynamic("meshOwner")(__v.asInstanceOf[js.Any]))
      tags.foreach(__v => __obj.updateDynamic("tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateVirtualGatewayInput]
    }
  }

  @js.native
  trait CreateVirtualGatewayOutput extends js.Object {
    var virtualGateway: VirtualGatewayData
  }

  object CreateVirtualGatewayOutput {
    @inline
    def apply(
        virtualGateway: VirtualGatewayData
    ): CreateVirtualGatewayOutput = {
      val __obj = js.Dynamic.literal(
        "virtualGateway" -> virtualGateway.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[CreateVirtualGatewayOutput]
    }
  }

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  @js.native
  trait DeleteGatewayRouteInput extends js.Object {
    var gatewayRouteName: ResourceName
    var meshName: ResourceName
    var virtualGatewayName: ResourceName
    var meshOwner: js.UndefOr[AccountId]
  }

  object DeleteGatewayRouteInput {
    @inline
    def apply(
        gatewayRouteName: ResourceName,
        meshName: ResourceName,
        virtualGatewayName: ResourceName,
        meshOwner: js.UndefOr[AccountId] = js.undefined
    ): DeleteGatewayRouteInput = {
      val __obj = js.Dynamic.literal(
        "gatewayRouteName" -> gatewayRouteName.asInstanceOf[js.Any],
        "meshName" -> meshName.asInstanceOf[js.Any],
        "virtualGatewayName" -> virtualGatewayName.asInstanceOf[js.Any]
      )

      meshOwner.foreach(__v => __obj.updateDynamic("meshOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteGatewayRouteInput]
    }
  }

  @js.native
  trait DeleteGatewayRouteOutput extends js.Object {
    var gatewayRoute: GatewayRouteData
  }

  object DeleteGatewayRouteOutput {
    @inline
    def apply(
        gatewayRoute: GatewayRouteData
    ): DeleteGatewayRouteOutput = {
      val __obj = js.Dynamic.literal(
        "gatewayRoute" -> gatewayRoute.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteGatewayRouteOutput]
    }
  }

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  @js.native
  trait DeleteVirtualGatewayInput extends js.Object {
    var meshName: ResourceName
    var virtualGatewayName: ResourceName
    var meshOwner: js.UndefOr[AccountId]
  }

  object DeleteVirtualGatewayInput {
    @inline
    def apply(
        meshName: ResourceName,
        virtualGatewayName: ResourceName,
        meshOwner: js.UndefOr[AccountId] = js.undefined
    ): DeleteVirtualGatewayInput = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any],
        "virtualGatewayName" -> virtualGatewayName.asInstanceOf[js.Any]
      )

      meshOwner.foreach(__v => __obj.updateDynamic("meshOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteVirtualGatewayInput]
    }
  }

  @js.native
  trait DeleteVirtualGatewayOutput extends js.Object {
    var virtualGateway: VirtualGatewayData
  }

  object DeleteVirtualGatewayOutput {
    @inline
    def apply(
        virtualGateway: VirtualGatewayData
    ): DeleteVirtualGatewayOutput = {
      val __obj = js.Dynamic.literal(
        "virtualGateway" -> virtualGateway.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DeleteVirtualGatewayOutput]
    }
  }

  /** Deletes a virtual node input.
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  @js.native
  trait DescribeGatewayRouteInput extends js.Object {
    var gatewayRouteName: ResourceName
    var meshName: ResourceName
    var virtualGatewayName: ResourceName
    var meshOwner: js.UndefOr[AccountId]
  }

  object DescribeGatewayRouteInput {
    @inline
    def apply(
        gatewayRouteName: ResourceName,
        meshName: ResourceName,
        virtualGatewayName: ResourceName,
        meshOwner: js.UndefOr[AccountId] = js.undefined
    ): DescribeGatewayRouteInput = {
      val __obj = js.Dynamic.literal(
        "gatewayRouteName" -> gatewayRouteName.asInstanceOf[js.Any],
        "meshName" -> meshName.asInstanceOf[js.Any],
        "virtualGatewayName" -> virtualGatewayName.asInstanceOf[js.Any]
      )

      meshOwner.foreach(__v => __obj.updateDynamic("meshOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeGatewayRouteInput]
    }
  }

  @js.native
  trait DescribeGatewayRouteOutput extends js.Object {
    var gatewayRoute: GatewayRouteData
  }

  object DescribeGatewayRouteOutput {
    @inline
    def apply(
        gatewayRoute: GatewayRouteData
    ): DescribeGatewayRouteOutput = {
      val __obj = js.Dynamic.literal(
        "gatewayRoute" -> gatewayRoute.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeGatewayRouteOutput]
    }
  }

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  @js.native
  trait DescribeVirtualGatewayInput extends js.Object {
    var meshName: ResourceName
    var virtualGatewayName: ResourceName
    var meshOwner: js.UndefOr[AccountId]
  }

  object DescribeVirtualGatewayInput {
    @inline
    def apply(
        meshName: ResourceName,
        virtualGatewayName: ResourceName,
        meshOwner: js.UndefOr[AccountId] = js.undefined
    ): DescribeVirtualGatewayInput = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any],
        "virtualGatewayName" -> virtualGatewayName.asInstanceOf[js.Any]
      )

      meshOwner.foreach(__v => __obj.updateDynamic("meshOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DescribeVirtualGatewayInput]
    }
  }

  @js.native
  trait DescribeVirtualGatewayOutput extends js.Object {
    var virtualGateway: VirtualGatewayData
  }

  object DescribeVirtualGatewayOutput {
    @inline
    def apply(
        virtualGateway: VirtualGatewayData
    ): DescribeVirtualGatewayOutput = {
      val __obj = js.Dynamic.literal(
        "virtualGateway" -> virtualGateway.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[DescribeVirtualGatewayOutput]
    }
  }

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** An object that represents the DNS service discovery information for your virtual node.
    */
  @js.native
  trait DnsServiceDiscovery extends js.Object {
    var hostname: Hostname
    var responseType: js.UndefOr[DnsResponseType]
  }

  object DnsServiceDiscovery {
    @inline
    def apply(
        hostname: Hostname,
        responseType: js.UndefOr[DnsResponseType] = js.undefined
    ): DnsServiceDiscovery = {
      val __obj = js.Dynamic.literal(
        "hostname" -> hostname.asInstanceOf[js.Any]
      )

      responseType.foreach(__v => __obj.updateDynamic("responseType")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DnsServiceDiscovery]
    }
  }

  /** An object that represents a duration of time.
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

  /** An object that represents the egress filter rules for a service mesh.
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

  /** An object that represents an access log file.
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

  /** An object that represents a gateway route returned by a describe operation.
    */
  @js.native
  trait GatewayRouteData extends js.Object {
    var gatewayRouteName: ResourceName
    var meshName: ResourceName
    var metadata: ResourceMetadata
    var spec: GatewayRouteSpec
    var status: GatewayRouteStatus
    var virtualGatewayName: ResourceName
  }

  object GatewayRouteData {
    @inline
    def apply(
        gatewayRouteName: ResourceName,
        meshName: ResourceName,
        metadata: ResourceMetadata,
        spec: GatewayRouteSpec,
        status: GatewayRouteStatus,
        virtualGatewayName: ResourceName
    ): GatewayRouteData = {
      val __obj = js.Dynamic.literal(
        "gatewayRouteName" -> gatewayRouteName.asInstanceOf[js.Any],
        "meshName" -> meshName.asInstanceOf[js.Any],
        "metadata" -> metadata.asInstanceOf[js.Any],
        "spec" -> spec.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "virtualGatewayName" -> virtualGatewayName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GatewayRouteData]
    }
  }

  /** An object representing the gateway route host name to match.
    */
  @js.native
  trait GatewayRouteHostnameMatch extends js.Object {
    var exact: js.UndefOr[ExactHostName]
    var suffix: js.UndefOr[SuffixHostname]
  }

  object GatewayRouteHostnameMatch {
    @inline
    def apply(
        exact: js.UndefOr[ExactHostName] = js.undefined,
        suffix: js.UndefOr[SuffixHostname] = js.undefined
    ): GatewayRouteHostnameMatch = {
      val __obj = js.Dynamic.literal()
      exact.foreach(__v => __obj.updateDynamic("exact")(__v.asInstanceOf[js.Any]))
      suffix.foreach(__v => __obj.updateDynamic("suffix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GatewayRouteHostnameMatch]
    }
  }

  /** An object representing the gateway route host name to rewrite.
    */
  @js.native
  trait GatewayRouteHostnameRewrite extends js.Object {
    var defaultTargetHostname: js.UndefOr[DefaultGatewayRouteRewrite]
  }

  object GatewayRouteHostnameRewrite {
    @inline
    def apply(
        defaultTargetHostname: js.UndefOr[DefaultGatewayRouteRewrite] = js.undefined
    ): GatewayRouteHostnameRewrite = {
      val __obj = js.Dynamic.literal()
      defaultTargetHostname.foreach(__v => __obj.updateDynamic("defaultTargetHostname")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GatewayRouteHostnameRewrite]
    }
  }

  /** An object that represents a gateway route returned by a list operation.
    */
  @js.native
  trait GatewayRouteRef extends js.Object {
    var arn: Arn
    var createdAt: Timestamp
    var gatewayRouteName: ResourceName
    var lastUpdatedAt: Timestamp
    var meshName: ResourceName
    var meshOwner: AccountId
    var resourceOwner: AccountId
    var version: Double
    var virtualGatewayName: ResourceName
  }

  object GatewayRouteRef {
    @inline
    def apply(
        arn: Arn,
        createdAt: Timestamp,
        gatewayRouteName: ResourceName,
        lastUpdatedAt: Timestamp,
        meshName: ResourceName,
        meshOwner: AccountId,
        resourceOwner: AccountId,
        version: Double,
        virtualGatewayName: ResourceName
    ): GatewayRouteRef = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "gatewayRouteName" -> gatewayRouteName.asInstanceOf[js.Any],
        "lastUpdatedAt" -> lastUpdatedAt.asInstanceOf[js.Any],
        "meshName" -> meshName.asInstanceOf[js.Any],
        "meshOwner" -> meshOwner.asInstanceOf[js.Any],
        "resourceOwner" -> resourceOwner.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any],
        "virtualGatewayName" -> virtualGatewayName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GatewayRouteRef]
    }
  }

  /** An object that represents a gateway route specification. Specify one gateway route type.
    */
  @js.native
  trait GatewayRouteSpec extends js.Object {
    var grpcRoute: js.UndefOr[GrpcGatewayRoute]
    var http2Route: js.UndefOr[HttpGatewayRoute]
    var httpRoute: js.UndefOr[HttpGatewayRoute]
    var priority: js.UndefOr[GatewayRoutePriority]
  }

  object GatewayRouteSpec {
    @inline
    def apply(
        grpcRoute: js.UndefOr[GrpcGatewayRoute] = js.undefined,
        http2Route: js.UndefOr[HttpGatewayRoute] = js.undefined,
        httpRoute: js.UndefOr[HttpGatewayRoute] = js.undefined,
        priority: js.UndefOr[GatewayRoutePriority] = js.undefined
    ): GatewayRouteSpec = {
      val __obj = js.Dynamic.literal()
      grpcRoute.foreach(__v => __obj.updateDynamic("grpcRoute")(__v.asInstanceOf[js.Any]))
      http2Route.foreach(__v => __obj.updateDynamic("http2Route")(__v.asInstanceOf[js.Any]))
      httpRoute.foreach(__v => __obj.updateDynamic("httpRoute")(__v.asInstanceOf[js.Any]))
      priority.foreach(__v => __obj.updateDynamic("priority")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GatewayRouteSpec]
    }
  }

  /** An object that represents the current status of a gateway route.
    */
  @js.native
  trait GatewayRouteStatus extends js.Object {
    var status: GatewayRouteStatusCode
  }

  object GatewayRouteStatus {
    @inline
    def apply(
        status: GatewayRouteStatusCode
    ): GatewayRouteStatus = {
      val __obj = js.Dynamic.literal(
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GatewayRouteStatus]
    }
  }

  /** An object that represents a gateway route target.
    */
  @js.native
  trait GatewayRouteTarget extends js.Object {
    var virtualService: GatewayRouteVirtualService
  }

  object GatewayRouteTarget {
    @inline
    def apply(
        virtualService: GatewayRouteVirtualService
    ): GatewayRouteTarget = {
      val __obj = js.Dynamic.literal(
        "virtualService" -> virtualService.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GatewayRouteTarget]
    }
  }

  /** An object that represents the virtual service that traffic is routed to.
    */
  @js.native
  trait GatewayRouteVirtualService extends js.Object {
    var virtualServiceName: ResourceName
  }

  object GatewayRouteVirtualService {
    @inline
    def apply(
        virtualServiceName: ResourceName
    ): GatewayRouteVirtualService = {
      val __obj = js.Dynamic.literal(
        "virtualServiceName" -> virtualServiceName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GatewayRouteVirtualService]
    }
  }

  /** An object that represents a gRPC gateway route.
    */
  @js.native
  trait GrpcGatewayRoute extends js.Object {
    var action: GrpcGatewayRouteAction
    var `match`: GrpcGatewayRouteMatch
  }

  object GrpcGatewayRoute {
    @inline
    def apply(
        action: GrpcGatewayRouteAction,
        `match`: GrpcGatewayRouteMatch
    ): GrpcGatewayRoute = {
      val __obj = js.Dynamic.literal(
        "action" -> action.asInstanceOf[js.Any],
        "match" -> `match`.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[GrpcGatewayRoute]
    }
  }

  /** An object that represents the action to take if a match is determined.
    */
  @js.native
  trait GrpcGatewayRouteAction extends js.Object {
    var target: GatewayRouteTarget
    var rewrite: js.UndefOr[GrpcGatewayRouteRewrite]
  }

  object GrpcGatewayRouteAction {
    @inline
    def apply(
        target: GatewayRouteTarget,
        rewrite: js.UndefOr[GrpcGatewayRouteRewrite] = js.undefined
    ): GrpcGatewayRouteAction = {
      val __obj = js.Dynamic.literal(
        "target" -> target.asInstanceOf[js.Any]
      )

      rewrite.foreach(__v => __obj.updateDynamic("rewrite")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GrpcGatewayRouteAction]
    }
  }

  /** An object that represents the criteria for determining a request match.
    */
  @js.native
  trait GrpcGatewayRouteMatch extends js.Object {
    var hostname: js.UndefOr[GatewayRouteHostnameMatch]
    var metadata: js.UndefOr[GrpcGatewayRouteMetadataList]
    var serviceName: js.UndefOr[ServiceName]
  }

  object GrpcGatewayRouteMatch {
    @inline
    def apply(
        hostname: js.UndefOr[GatewayRouteHostnameMatch] = js.undefined,
        metadata: js.UndefOr[GrpcGatewayRouteMetadataList] = js.undefined,
        serviceName: js.UndefOr[ServiceName] = js.undefined
    ): GrpcGatewayRouteMatch = {
      val __obj = js.Dynamic.literal()
      hostname.foreach(__v => __obj.updateDynamic("hostname")(__v.asInstanceOf[js.Any]))
      metadata.foreach(__v => __obj.updateDynamic("metadata")(__v.asInstanceOf[js.Any]))
      serviceName.foreach(__v => __obj.updateDynamic("serviceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GrpcGatewayRouteMatch]
    }
  }

  /** An object representing the metadata of the gateway route.
    */
  @js.native
  trait GrpcGatewayRouteMetadata extends js.Object {
    var name: HeaderName
    var invert: js.UndefOr[Boolean]
    var `match`: js.UndefOr[GrpcMetadataMatchMethod]
  }

  object GrpcGatewayRouteMetadata {
    @inline
    def apply(
        name: HeaderName,
        invert: js.UndefOr[Boolean] = js.undefined,
        `match`: js.UndefOr[GrpcMetadataMatchMethod] = js.undefined
    ): GrpcGatewayRouteMetadata = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      invert.foreach(__v => __obj.updateDynamic("invert")(__v.asInstanceOf[js.Any]))
      `match`.foreach(__v => __obj.updateDynamic("match")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GrpcGatewayRouteMetadata]
    }
  }

  /** An object that represents the gateway route to rewrite.
    */
  @js.native
  trait GrpcGatewayRouteRewrite extends js.Object {
    var hostname: js.UndefOr[GatewayRouteHostnameRewrite]
  }

  object GrpcGatewayRouteRewrite {
    @inline
    def apply(
        hostname: js.UndefOr[GatewayRouteHostnameRewrite] = js.undefined
    ): GrpcGatewayRouteRewrite = {
      val __obj = js.Dynamic.literal()
      hostname.foreach(__v => __obj.updateDynamic("hostname")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GrpcGatewayRouteRewrite]
    }
  }

  /** An object representing the method header to be matched.
    */
  @js.native
  trait GrpcMetadataMatchMethod extends js.Object {
    var exact: js.UndefOr[HeaderMatch]
    var prefix: js.UndefOr[HeaderMatch]
    var range: js.UndefOr[MatchRange]
    var regex: js.UndefOr[HeaderMatch]
    var suffix: js.UndefOr[HeaderMatch]
  }

  object GrpcMetadataMatchMethod {
    @inline
    def apply(
        exact: js.UndefOr[HeaderMatch] = js.undefined,
        prefix: js.UndefOr[HeaderMatch] = js.undefined,
        range: js.UndefOr[MatchRange] = js.undefined,
        regex: js.UndefOr[HeaderMatch] = js.undefined,
        suffix: js.UndefOr[HeaderMatch] = js.undefined
    ): GrpcMetadataMatchMethod = {
      val __obj = js.Dynamic.literal()
      exact.foreach(__v => __obj.updateDynamic("exact")(__v.asInstanceOf[js.Any]))
      prefix.foreach(__v => __obj.updateDynamic("prefix")(__v.asInstanceOf[js.Any]))
      range.foreach(__v => __obj.updateDynamic("range")(__v.asInstanceOf[js.Any]))
      regex.foreach(__v => __obj.updateDynamic("regex")(__v.asInstanceOf[js.Any]))
      suffix.foreach(__v => __obj.updateDynamic("suffix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GrpcMetadataMatchMethod]
    }
  }

  /** An object that represents a retry policy. Specify at least one value for at least one of the types of <code>RetryEvents</code>, a value for <code>maxRetries</code>, and a value for <code>perRetryTimeout</code>. Both <code>server-error</code> and <code>gateway-error</code> under <code>httpRetryEvents</code> include the Envoy <code>reset</code> policy. For more information on the <code>reset</code> policy, see the [[https://www.envoyproxy.io/docs/envoy/latest/configuration/http/http_filters/router_filter#x-envoy-retry-on|Envoy documentation]].
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

  /** An object that represents a gRPC route type.
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

  /** An object that represents the action to take if a match is determined.
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

  /** An object that represents the criteria for determining a request match.
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

  /** An object that represents the match metadata for the route.
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

  /** An object that represents the match method. Specify one of the match values.
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

  /** An object that represents types of timeouts.
    */
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

  /** An object that represents the method and value to match with the header value sent in a request. Specify one match method.
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

  /** An object that represents the health check policy for a virtual node's listener.
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

  /** An object that represents an HTTP gateway route.
    */
  @js.native
  trait HttpGatewayRoute extends js.Object {
    var action: HttpGatewayRouteAction
    var `match`: HttpGatewayRouteMatch
  }

  object HttpGatewayRoute {
    @inline
    def apply(
        action: HttpGatewayRouteAction,
        `match`: HttpGatewayRouteMatch
    ): HttpGatewayRoute = {
      val __obj = js.Dynamic.literal(
        "action" -> action.asInstanceOf[js.Any],
        "match" -> `match`.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[HttpGatewayRoute]
    }
  }

  /** An object that represents the action to take if a match is determined.
    */
  @js.native
  trait HttpGatewayRouteAction extends js.Object {
    var target: GatewayRouteTarget
    var rewrite: js.UndefOr[HttpGatewayRouteRewrite]
  }

  object HttpGatewayRouteAction {
    @inline
    def apply(
        target: GatewayRouteTarget,
        rewrite: js.UndefOr[HttpGatewayRouteRewrite] = js.undefined
    ): HttpGatewayRouteAction = {
      val __obj = js.Dynamic.literal(
        "target" -> target.asInstanceOf[js.Any]
      )

      rewrite.foreach(__v => __obj.updateDynamic("rewrite")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HttpGatewayRouteAction]
    }
  }

  /** An object that represents the HTTP header in the gateway route.
    */
  @js.native
  trait HttpGatewayRouteHeader extends js.Object {
    var name: HeaderName
    var invert: js.UndefOr[Boolean]
    var `match`: js.UndefOr[HeaderMatchMethod]
  }

  object HttpGatewayRouteHeader {
    @inline
    def apply(
        name: HeaderName,
        invert: js.UndefOr[Boolean] = js.undefined,
        `match`: js.UndefOr[HeaderMatchMethod] = js.undefined
    ): HttpGatewayRouteHeader = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      invert.foreach(__v => __obj.updateDynamic("invert")(__v.asInstanceOf[js.Any]))
      `match`.foreach(__v => __obj.updateDynamic("match")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HttpGatewayRouteHeader]
    }
  }

  /** An object that represents the criteria for determining a request match.
    */
  @js.native
  trait HttpGatewayRouteMatch extends js.Object {
    var headers: js.UndefOr[HttpGatewayRouteHeaders]
    var hostname: js.UndefOr[GatewayRouteHostnameMatch]
    var method: js.UndefOr[HttpMethod]
    var path: js.UndefOr[HttpPathMatch]
    var prefix: js.UndefOr[String]
    var queryParameters: js.UndefOr[HttpQueryParameters]
  }

  object HttpGatewayRouteMatch {
    @inline
    def apply(
        headers: js.UndefOr[HttpGatewayRouteHeaders] = js.undefined,
        hostname: js.UndefOr[GatewayRouteHostnameMatch] = js.undefined,
        method: js.UndefOr[HttpMethod] = js.undefined,
        path: js.UndefOr[HttpPathMatch] = js.undefined,
        prefix: js.UndefOr[String] = js.undefined,
        queryParameters: js.UndefOr[HttpQueryParameters] = js.undefined
    ): HttpGatewayRouteMatch = {
      val __obj = js.Dynamic.literal()
      headers.foreach(__v => __obj.updateDynamic("headers")(__v.asInstanceOf[js.Any]))
      hostname.foreach(__v => __obj.updateDynamic("hostname")(__v.asInstanceOf[js.Any]))
      method.foreach(__v => __obj.updateDynamic("method")(__v.asInstanceOf[js.Any]))
      path.foreach(__v => __obj.updateDynamic("path")(__v.asInstanceOf[js.Any]))
      prefix.foreach(__v => __obj.updateDynamic("prefix")(__v.asInstanceOf[js.Any]))
      queryParameters.foreach(__v => __obj.updateDynamic("queryParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HttpGatewayRouteMatch]
    }
  }

  /** An object that represents the path to rewrite.
    */
  @js.native
  trait HttpGatewayRoutePathRewrite extends js.Object {
    var exact: js.UndefOr[HttpPathExact]
  }

  object HttpGatewayRoutePathRewrite {
    @inline
    def apply(
        exact: js.UndefOr[HttpPathExact] = js.undefined
    ): HttpGatewayRoutePathRewrite = {
      val __obj = js.Dynamic.literal()
      exact.foreach(__v => __obj.updateDynamic("exact")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HttpGatewayRoutePathRewrite]
    }
  }

  /** An object representing the beginning characters of the route to rewrite.
    */
  @js.native
  trait HttpGatewayRoutePrefixRewrite extends js.Object {
    var defaultPrefix: js.UndefOr[DefaultGatewayRouteRewrite]
    var value: js.UndefOr[HttpGatewayRoutePrefix]
  }

  object HttpGatewayRoutePrefixRewrite {
    @inline
    def apply(
        defaultPrefix: js.UndefOr[DefaultGatewayRouteRewrite] = js.undefined,
        value: js.UndefOr[HttpGatewayRoutePrefix] = js.undefined
    ): HttpGatewayRoutePrefixRewrite = {
      val __obj = js.Dynamic.literal()
      defaultPrefix.foreach(__v => __obj.updateDynamic("defaultPrefix")(__v.asInstanceOf[js.Any]))
      value.foreach(__v => __obj.updateDynamic("value")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HttpGatewayRoutePrefixRewrite]
    }
  }

  /** An object representing the gateway route to rewrite.
    */
  @js.native
  trait HttpGatewayRouteRewrite extends js.Object {
    var hostname: js.UndefOr[GatewayRouteHostnameRewrite]
    var path: js.UndefOr[HttpGatewayRoutePathRewrite]
    var prefix: js.UndefOr[HttpGatewayRoutePrefixRewrite]
  }

  object HttpGatewayRouteRewrite {
    @inline
    def apply(
        hostname: js.UndefOr[GatewayRouteHostnameRewrite] = js.undefined,
        path: js.UndefOr[HttpGatewayRoutePathRewrite] = js.undefined,
        prefix: js.UndefOr[HttpGatewayRoutePrefixRewrite] = js.undefined
    ): HttpGatewayRouteRewrite = {
      val __obj = js.Dynamic.literal()
      hostname.foreach(__v => __obj.updateDynamic("hostname")(__v.asInstanceOf[js.Any]))
      path.foreach(__v => __obj.updateDynamic("path")(__v.asInstanceOf[js.Any]))
      prefix.foreach(__v => __obj.updateDynamic("prefix")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HttpGatewayRouteRewrite]
    }
  }

  /** An object representing the path to match in the request.
    */
  @js.native
  trait HttpPathMatch extends js.Object {
    var exact: js.UndefOr[HttpPathExact]
    var regex: js.UndefOr[HttpPathRegex]
  }

  object HttpPathMatch {
    @inline
    def apply(
        exact: js.UndefOr[HttpPathExact] = js.undefined,
        regex: js.UndefOr[HttpPathRegex] = js.undefined
    ): HttpPathMatch = {
      val __obj = js.Dynamic.literal()
      exact.foreach(__v => __obj.updateDynamic("exact")(__v.asInstanceOf[js.Any]))
      regex.foreach(__v => __obj.updateDynamic("regex")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HttpPathMatch]
    }
  }

  /** An object that represents the query parameter in the request.
    */
  @js.native
  trait HttpQueryParameter extends js.Object {
    var name: QueryParameterName
    var `match`: js.UndefOr[QueryParameterMatch]
  }

  object HttpQueryParameter {
    @inline
    def apply(
        name: QueryParameterName,
        `match`: js.UndefOr[QueryParameterMatch] = js.undefined
    ): HttpQueryParameter = {
      val __obj = js.Dynamic.literal(
        "name" -> name.asInstanceOf[js.Any]
      )

      `match`.foreach(__v => __obj.updateDynamic("match")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HttpQueryParameter]
    }
  }

  /** An object that represents a retry policy. Specify at least one value for at least one of the types of <code>RetryEvents</code>, a value for <code>maxRetries</code>, and a value for <code>perRetryTimeout</code>. Both <code>server-error</code> and <code>gateway-error</code> under <code>httpRetryEvents</code> include the Envoy <code>reset</code> policy. For more information on the <code>reset</code> policy, see the [[https://www.envoyproxy.io/docs/envoy/latest/configuration/http/http_filters/router_filter#x-envoy-retry-on|Envoy documentation]].
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

  /** An object that represents an HTTP or HTTP/2 route type.
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

  /** An object that represents the action to take if a match is determined.
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

  /** An object that represents the HTTP header in the request.
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

  /** An object that represents the requirements for a route to match HTTP requests for a virtual router.
    */
  @js.native
  trait HttpRouteMatch extends js.Object {
    var headers: js.UndefOr[HttpRouteHeaders]
    var method: js.UndefOr[HttpMethod]
    var path: js.UndefOr[HttpPathMatch]
    var prefix: js.UndefOr[String]
    var queryParameters: js.UndefOr[HttpQueryParameters]
    var scheme: js.UndefOr[HttpScheme]
  }

  object HttpRouteMatch {
    @inline
    def apply(
        headers: js.UndefOr[HttpRouteHeaders] = js.undefined,
        method: js.UndefOr[HttpMethod] = js.undefined,
        path: js.UndefOr[HttpPathMatch] = js.undefined,
        prefix: js.UndefOr[String] = js.undefined,
        queryParameters: js.UndefOr[HttpQueryParameters] = js.undefined,
        scheme: js.UndefOr[HttpScheme] = js.undefined
    ): HttpRouteMatch = {
      val __obj = js.Dynamic.literal()
      headers.foreach(__v => __obj.updateDynamic("headers")(__v.asInstanceOf[js.Any]))
      method.foreach(__v => __obj.updateDynamic("method")(__v.asInstanceOf[js.Any]))
      path.foreach(__v => __obj.updateDynamic("path")(__v.asInstanceOf[js.Any]))
      prefix.foreach(__v => __obj.updateDynamic("prefix")(__v.asInstanceOf[js.Any]))
      queryParameters.foreach(__v => __obj.updateDynamic("queryParameters")(__v.asInstanceOf[js.Any]))
      scheme.foreach(__v => __obj.updateDynamic("scheme")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HttpRouteMatch]
    }
  }

  /** An object that represents types of timeouts.
    */
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

  @js.native
  trait ListGatewayRoutesInput extends js.Object {
    var meshName: ResourceName
    var virtualGatewayName: ResourceName
    var limit: js.UndefOr[ListGatewayRoutesLimit]
    var meshOwner: js.UndefOr[AccountId]
    var nextToken: js.UndefOr[String]
  }

  object ListGatewayRoutesInput {
    @inline
    def apply(
        meshName: ResourceName,
        virtualGatewayName: ResourceName,
        limit: js.UndefOr[ListGatewayRoutesLimit] = js.undefined,
        meshOwner: js.UndefOr[AccountId] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListGatewayRoutesInput = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any],
        "virtualGatewayName" -> virtualGatewayName.asInstanceOf[js.Any]
      )

      limit.foreach(__v => __obj.updateDynamic("limit")(__v.asInstanceOf[js.Any]))
      meshOwner.foreach(__v => __obj.updateDynamic("meshOwner")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGatewayRoutesInput]
    }
  }

  @js.native
  trait ListGatewayRoutesOutput extends js.Object {
    var gatewayRoutes: GatewayRouteList
    var nextToken: js.UndefOr[String]
  }

  object ListGatewayRoutesOutput {
    @inline
    def apply(
        gatewayRoutes: GatewayRouteList,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListGatewayRoutesOutput = {
      val __obj = js.Dynamic.literal(
        "gatewayRoutes" -> gatewayRoutes.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListGatewayRoutesOutput]
    }
  }

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  @js.native
  trait ListVirtualGatewaysInput extends js.Object {
    var meshName: ResourceName
    var limit: js.UndefOr[ListVirtualGatewaysLimit]
    var meshOwner: js.UndefOr[AccountId]
    var nextToken: js.UndefOr[String]
  }

  object ListVirtualGatewaysInput {
    @inline
    def apply(
        meshName: ResourceName,
        limit: js.UndefOr[ListVirtualGatewaysLimit] = js.undefined,
        meshOwner: js.UndefOr[AccountId] = js.undefined,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListVirtualGatewaysInput = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any]
      )

      limit.foreach(__v => __obj.updateDynamic("limit")(__v.asInstanceOf[js.Any]))
      meshOwner.foreach(__v => __obj.updateDynamic("meshOwner")(__v.asInstanceOf[js.Any]))
      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVirtualGatewaysInput]
    }
  }

  @js.native
  trait ListVirtualGatewaysOutput extends js.Object {
    var virtualGateways: VirtualGatewayList
    var nextToken: js.UndefOr[String]
  }

  object ListVirtualGatewaysOutput {
    @inline
    def apply(
        virtualGateways: VirtualGatewayList,
        nextToken: js.UndefOr[String] = js.undefined
    ): ListVirtualGatewaysOutput = {
      val __obj = js.Dynamic.literal(
        "virtualGateways" -> virtualGateways.asInstanceOf[js.Any]
      )

      nextToken.foreach(__v => __obj.updateDynamic("nextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListVirtualGatewaysOutput]
    }
  }

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** An object that represents a listener for a virtual node.
    */
  @js.native
  trait Listener extends js.Object {
    var portMapping: PortMapping
    var connectionPool: js.UndefOr[VirtualNodeConnectionPool]
    var healthCheck: js.UndefOr[HealthCheckPolicy]
    var outlierDetection: js.UndefOr[OutlierDetection]
    var timeout: js.UndefOr[ListenerTimeout]
    var tls: js.UndefOr[ListenerTls]
  }

  object Listener {
    @inline
    def apply(
        portMapping: PortMapping,
        connectionPool: js.UndefOr[VirtualNodeConnectionPool] = js.undefined,
        healthCheck: js.UndefOr[HealthCheckPolicy] = js.undefined,
        outlierDetection: js.UndefOr[OutlierDetection] = js.undefined,
        timeout: js.UndefOr[ListenerTimeout] = js.undefined,
        tls: js.UndefOr[ListenerTls] = js.undefined
    ): Listener = {
      val __obj = js.Dynamic.literal(
        "portMapping" -> portMapping.asInstanceOf[js.Any]
      )

      connectionPool.foreach(__v => __obj.updateDynamic("connectionPool")(__v.asInstanceOf[js.Any]))
      healthCheck.foreach(__v => __obj.updateDynamic("healthCheck")(__v.asInstanceOf[js.Any]))
      outlierDetection.foreach(__v => __obj.updateDynamic("outlierDetection")(__v.asInstanceOf[js.Any]))
      timeout.foreach(__v => __obj.updateDynamic("timeout")(__v.asInstanceOf[js.Any]))
      tls.foreach(__v => __obj.updateDynamic("tls")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Listener]
    }
  }

  /** An object that represents timeouts for different protocols.
    */
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

  /** An object that represents the Transport Layer Security (TLS) properties for a listener.
    */
  @js.native
  trait ListenerTls extends js.Object {
    var certificate: ListenerTlsCertificate
    var mode: ListenerTlsMode
    var validation: js.UndefOr[ListenerTlsValidationContext]
  }

  object ListenerTls {
    @inline
    def apply(
        certificate: ListenerTlsCertificate,
        mode: ListenerTlsMode,
        validation: js.UndefOr[ListenerTlsValidationContext] = js.undefined
    ): ListenerTls = {
      val __obj = js.Dynamic.literal(
        "certificate" -> certificate.asInstanceOf[js.Any],
        "mode" -> mode.asInstanceOf[js.Any]
      )

      validation.foreach(__v => __obj.updateDynamic("validation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListenerTls]
    }
  }

  /** An object that represents an AWS Certicate Manager (ACM) certificate.
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

  /** An object that represents a listener's Transport Layer Security (TLS) certificate.
    */
  @js.native
  trait ListenerTlsCertificate extends js.Object {
    var acm: js.UndefOr[ListenerTlsAcmCertificate]
    var file: js.UndefOr[ListenerTlsFileCertificate]
    var sds: js.UndefOr[ListenerTlsSdsCertificate]
  }

  object ListenerTlsCertificate {
    @inline
    def apply(
        acm: js.UndefOr[ListenerTlsAcmCertificate] = js.undefined,
        file: js.UndefOr[ListenerTlsFileCertificate] = js.undefined,
        sds: js.UndefOr[ListenerTlsSdsCertificate] = js.undefined
    ): ListenerTlsCertificate = {
      val __obj = js.Dynamic.literal()
      acm.foreach(__v => __obj.updateDynamic("acm")(__v.asInstanceOf[js.Any]))
      file.foreach(__v => __obj.updateDynamic("file")(__v.asInstanceOf[js.Any]))
      sds.foreach(__v => __obj.updateDynamic("sds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListenerTlsCertificate]
    }
  }

  /** An object that represents a local file certificate. The certificate must meet specific requirements and you must have proxy authorization enabled. For more information, see [[https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html#virtual-node-tls-prerequisites|Transport Layer Security (TLS)]].
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

  /** An object that represents the listener's Secret Discovery Service certificate. The proxy must be configured with a local SDS provider via a Unix Domain Socket. See App Mesh [[https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html|TLS documentation]] for more info.
    */
  @js.native
  trait ListenerTlsSdsCertificate extends js.Object {
    var secretName: SdsSecretName
  }

  object ListenerTlsSdsCertificate {
    @inline
    def apply(
        secretName: SdsSecretName
    ): ListenerTlsSdsCertificate = {
      val __obj = js.Dynamic.literal(
        "secretName" -> secretName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[ListenerTlsSdsCertificate]
    }
  }

  /** An object that represents a listener's Transport Layer Security (TLS) validation context.
    */
  @js.native
  trait ListenerTlsValidationContext extends js.Object {
    var trust: ListenerTlsValidationContextTrust
    var subjectAlternativeNames: js.UndefOr[SubjectAlternativeNames]
  }

  object ListenerTlsValidationContext {
    @inline
    def apply(
        trust: ListenerTlsValidationContextTrust,
        subjectAlternativeNames: js.UndefOr[SubjectAlternativeNames] = js.undefined
    ): ListenerTlsValidationContext = {
      val __obj = js.Dynamic.literal(
        "trust" -> trust.asInstanceOf[js.Any]
      )

      subjectAlternativeNames.foreach(__v => __obj.updateDynamic("subjectAlternativeNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListenerTlsValidationContext]
    }
  }

  /** An object that represents a listener's Transport Layer Security (TLS) validation context trust.
    */
  @js.native
  trait ListenerTlsValidationContextTrust extends js.Object {
    var file: js.UndefOr[TlsValidationContextFileTrust]
    var sds: js.UndefOr[TlsValidationContextSdsTrust]
  }

  object ListenerTlsValidationContextTrust {
    @inline
    def apply(
        file: js.UndefOr[TlsValidationContextFileTrust] = js.undefined,
        sds: js.UndefOr[TlsValidationContextSdsTrust] = js.undefined
    ): ListenerTlsValidationContextTrust = {
      val __obj = js.Dynamic.literal()
      file.foreach(__v => __obj.updateDynamic("file")(__v.asInstanceOf[js.Any]))
      sds.foreach(__v => __obj.updateDynamic("sds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListenerTlsValidationContextTrust]
    }
  }

  /** An object that represents the logging information for a virtual node.
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

  /** An object that represents the range of values to match on. The first character of the range is included in the range, though the last character is not. For example, if the range specified were 1-100, only values 1-99 would be matched.
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

  /** An object that represents a service mesh returned by a describe operation.
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

  /** An object that represents a service mesh returned by a list operation.
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

  /** An object that represents the specification of a service mesh.
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

  /** An object that represents the status of a service mesh.
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

  /** An object that represents the outlier detection for a virtual node's listener.
    */
  @js.native
  trait OutlierDetection extends js.Object {
    var baseEjectionDuration: Duration
    var interval: Duration
    var maxEjectionPercent: OutlierDetectionMaxEjectionPercent
    var maxServerErrors: OutlierDetectionMaxServerErrors
  }

  object OutlierDetection {
    @inline
    def apply(
        baseEjectionDuration: Duration,
        interval: Duration,
        maxEjectionPercent: OutlierDetectionMaxEjectionPercent,
        maxServerErrors: OutlierDetectionMaxServerErrors
    ): OutlierDetection = {
      val __obj = js.Dynamic.literal(
        "baseEjectionDuration" -> baseEjectionDuration.asInstanceOf[js.Any],
        "interval" -> interval.asInstanceOf[js.Any],
        "maxEjectionPercent" -> maxEjectionPercent.asInstanceOf[js.Any],
        "maxServerErrors" -> maxServerErrors.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[OutlierDetection]
    }
  }

  /** An object that represents a port mapping.
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

  /** An object representing the query parameter to match.
    */
  @js.native
  trait QueryParameterMatch extends js.Object {
    var exact: js.UndefOr[String]
  }

  object QueryParameterMatch {
    @inline
    def apply(
        exact: js.UndefOr[String] = js.undefined
    ): QueryParameterMatch = {
      val __obj = js.Dynamic.literal()
      exact.foreach(__v => __obj.updateDynamic("exact")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[QueryParameterMatch]
    }
  }

  /** An object that represents metadata for a resource.
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

  /** An object that represents a route returned by a describe operation.
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

  /** An object that represents a route returned by a list operation.
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

  /** An object that represents a route specification. Specify one route type.
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

  /** An object that represents the current status of a route.
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

  /** An object that represents the service discovery information for a virtual node.
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

  /** An object that represents the methods by which a subject alternative name on a peer Transport Layer Security (TLS) certificate can be matched.
    */
  @js.native
  trait SubjectAlternativeNameMatchers extends js.Object {
    var exact: SubjectAlternativeNameList
  }

  object SubjectAlternativeNameMatchers {
    @inline
    def apply(
        exact: SubjectAlternativeNameList
    ): SubjectAlternativeNameMatchers = {
      val __obj = js.Dynamic.literal(
        "exact" -> exact.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SubjectAlternativeNameMatchers]
    }
  }

  /** An object that represents the subject alternative names secured by the certificate.
    */
  @js.native
  trait SubjectAlternativeNames extends js.Object {
    var `match`: SubjectAlternativeNameMatchers
  }

  object SubjectAlternativeNames {
    @inline
    def apply(
        `match`: SubjectAlternativeNameMatchers
    ): SubjectAlternativeNames = {
      val __obj = js.Dynamic.literal(
        "match" -> `match`.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[SubjectAlternativeNames]
    }
  }

  /** Optional metadata that you apply to a resource to assist with categorization and organization. Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
    */
  @js.native
  trait TagRef extends js.Object {
    var key: TagKey
    var value: TagValue
  }

  object TagRef {
    @inline
    def apply(
        key: TagKey,
        value: TagValue
    ): TagRef = {
      val __obj = js.Dynamic.literal(
        "key" -> key.asInstanceOf[js.Any],
        "value" -> value.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TagRef]
    }
  }

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
    */
  @js.native
  trait TagResourceOutput extends js.Object

  object TagResourceOutput {
    @inline
    def apply(): TagResourceOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagResourceOutput]
    }
  }

  /** An object that represents a TCP route type.
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

  /** An object that represents the action to take if a match is determined.
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

  /** An object that represents types of timeouts.
    */
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

  /** An object that represents how the proxy will validate its peer during Transport Layer Security (TLS) negotiation.
    */
  @js.native
  trait TlsValidationContext extends js.Object {
    var trust: TlsValidationContextTrust
    var subjectAlternativeNames: js.UndefOr[SubjectAlternativeNames]
  }

  object TlsValidationContext {
    @inline
    def apply(
        trust: TlsValidationContextTrust,
        subjectAlternativeNames: js.UndefOr[SubjectAlternativeNames] = js.undefined
    ): TlsValidationContext = {
      val __obj = js.Dynamic.literal(
        "trust" -> trust.asInstanceOf[js.Any]
      )

      subjectAlternativeNames.foreach(__v => __obj.updateDynamic("subjectAlternativeNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TlsValidationContext]
    }
  }

  /** An object that represents a Transport Layer Security (TLS) validation context trust for an Certificate Manager certificate.
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

  /** An object that represents a Transport Layer Security (TLS) validation context trust for a local file.
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

  /** An object that represents a Transport Layer Security (TLS) Secret Discovery Service validation context trust. The proxy must be configured with a local SDS provider via a Unix Domain Socket. See App Mesh [[https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html|TLS documentation]] for more info.
    */
  @js.native
  trait TlsValidationContextSdsTrust extends js.Object {
    var secretName: SdsSecretName
  }

  object TlsValidationContextSdsTrust {
    @inline
    def apply(
        secretName: SdsSecretName
    ): TlsValidationContextSdsTrust = {
      val __obj = js.Dynamic.literal(
        "secretName" -> secretName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[TlsValidationContextSdsTrust]
    }
  }

  /** An object that represents a Transport Layer Security (TLS) validation context trust.
    */
  @js.native
  trait TlsValidationContextTrust extends js.Object {
    var acm: js.UndefOr[TlsValidationContextAcmTrust]
    var file: js.UndefOr[TlsValidationContextFileTrust]
    var sds: js.UndefOr[TlsValidationContextSdsTrust]
  }

  object TlsValidationContextTrust {
    @inline
    def apply(
        acm: js.UndefOr[TlsValidationContextAcmTrust] = js.undefined,
        file: js.UndefOr[TlsValidationContextFileTrust] = js.undefined,
        sds: js.UndefOr[TlsValidationContextSdsTrust] = js.undefined
    ): TlsValidationContextTrust = {
      val __obj = js.Dynamic.literal()
      acm.foreach(__v => __obj.updateDynamic("acm")(__v.asInstanceOf[js.Any]))
      file.foreach(__v => __obj.updateDynamic("file")(__v.asInstanceOf[js.Any]))
      sds.foreach(__v => __obj.updateDynamic("sds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[TlsValidationContextTrust]
    }
  }

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
    */
  @js.native
  trait UntagResourceOutput extends js.Object

  object UntagResourceOutput {
    @inline
    def apply(): UntagResourceOutput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UntagResourceOutput]
    }
  }

  @js.native
  trait UpdateGatewayRouteInput extends js.Object {
    var gatewayRouteName: ResourceName
    var meshName: ResourceName
    var spec: GatewayRouteSpec
    var virtualGatewayName: ResourceName
    var clientToken: js.UndefOr[String]
    var meshOwner: js.UndefOr[AccountId]
  }

  object UpdateGatewayRouteInput {
    @inline
    def apply(
        gatewayRouteName: ResourceName,
        meshName: ResourceName,
        spec: GatewayRouteSpec,
        virtualGatewayName: ResourceName,
        clientToken: js.UndefOr[String] = js.undefined,
        meshOwner: js.UndefOr[AccountId] = js.undefined
    ): UpdateGatewayRouteInput = {
      val __obj = js.Dynamic.literal(
        "gatewayRouteName" -> gatewayRouteName.asInstanceOf[js.Any],
        "meshName" -> meshName.asInstanceOf[js.Any],
        "spec" -> spec.asInstanceOf[js.Any],
        "virtualGatewayName" -> virtualGatewayName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      meshOwner.foreach(__v => __obj.updateDynamic("meshOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateGatewayRouteInput]
    }
  }

  @js.native
  trait UpdateGatewayRouteOutput extends js.Object {
    var gatewayRoute: GatewayRouteData
  }

  object UpdateGatewayRouteOutput {
    @inline
    def apply(
        gatewayRoute: GatewayRouteData
    ): UpdateGatewayRouteOutput = {
      val __obj = js.Dynamic.literal(
        "gatewayRoute" -> gatewayRoute.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateGatewayRouteOutput]
    }
  }

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  @js.native
  trait UpdateVirtualGatewayInput extends js.Object {
    var meshName: ResourceName
    var spec: VirtualGatewaySpec
    var virtualGatewayName: ResourceName
    var clientToken: js.UndefOr[String]
    var meshOwner: js.UndefOr[AccountId]
  }

  object UpdateVirtualGatewayInput {
    @inline
    def apply(
        meshName: ResourceName,
        spec: VirtualGatewaySpec,
        virtualGatewayName: ResourceName,
        clientToken: js.UndefOr[String] = js.undefined,
        meshOwner: js.UndefOr[AccountId] = js.undefined
    ): UpdateVirtualGatewayInput = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any],
        "spec" -> spec.asInstanceOf[js.Any],
        "virtualGatewayName" -> virtualGatewayName.asInstanceOf[js.Any]
      )

      clientToken.foreach(__v => __obj.updateDynamic("clientToken")(__v.asInstanceOf[js.Any]))
      meshOwner.foreach(__v => __obj.updateDynamic("meshOwner")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateVirtualGatewayInput]
    }
  }

  @js.native
  trait UpdateVirtualGatewayOutput extends js.Object {
    var virtualGateway: VirtualGatewayData
  }

  object UpdateVirtualGatewayOutput {
    @inline
    def apply(
        virtualGateway: VirtualGatewayData
    ): UpdateVirtualGatewayOutput = {
      val __obj = js.Dynamic.literal(
        "virtualGateway" -> virtualGateway.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[UpdateVirtualGatewayOutput]
    }
  }

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** <zonbook></zonbook><xhtml></xhtml>
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

  /** The access log configuration for a virtual gateway.
    */
  @js.native
  trait VirtualGatewayAccessLog extends js.Object {
    var file: js.UndefOr[VirtualGatewayFileAccessLog]
  }

  object VirtualGatewayAccessLog {
    @inline
    def apply(
        file: js.UndefOr[VirtualGatewayFileAccessLog] = js.undefined
    ): VirtualGatewayAccessLog = {
      val __obj = js.Dynamic.literal()
      file.foreach(__v => __obj.updateDynamic("file")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualGatewayAccessLog]
    }
  }

  /** An object that represents the default properties for a backend.
    */
  @js.native
  trait VirtualGatewayBackendDefaults extends js.Object {
    var clientPolicy: js.UndefOr[VirtualGatewayClientPolicy]
  }

  object VirtualGatewayBackendDefaults {
    @inline
    def apply(
        clientPolicy: js.UndefOr[VirtualGatewayClientPolicy] = js.undefined
    ): VirtualGatewayBackendDefaults = {
      val __obj = js.Dynamic.literal()
      clientPolicy.foreach(__v => __obj.updateDynamic("clientPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualGatewayBackendDefaults]
    }
  }

  /** An object that represents a client policy.
    */
  @js.native
  trait VirtualGatewayClientPolicy extends js.Object {
    var tls: js.UndefOr[VirtualGatewayClientPolicyTls]
  }

  object VirtualGatewayClientPolicy {
    @inline
    def apply(
        tls: js.UndefOr[VirtualGatewayClientPolicyTls] = js.undefined
    ): VirtualGatewayClientPolicy = {
      val __obj = js.Dynamic.literal()
      tls.foreach(__v => __obj.updateDynamic("tls")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualGatewayClientPolicy]
    }
  }

  /** An object that represents a Transport Layer Security (TLS) client policy.
    */
  @js.native
  trait VirtualGatewayClientPolicyTls extends js.Object {
    var validation: VirtualGatewayTlsValidationContext
    var certificate: js.UndefOr[VirtualGatewayClientTlsCertificate]
    var enforce: js.UndefOr[Boolean]
    var ports: js.UndefOr[PortSet]
  }

  object VirtualGatewayClientPolicyTls {
    @inline
    def apply(
        validation: VirtualGatewayTlsValidationContext,
        certificate: js.UndefOr[VirtualGatewayClientTlsCertificate] = js.undefined,
        enforce: js.UndefOr[Boolean] = js.undefined,
        ports: js.UndefOr[PortSet] = js.undefined
    ): VirtualGatewayClientPolicyTls = {
      val __obj = js.Dynamic.literal(
        "validation" -> validation.asInstanceOf[js.Any]
      )

      certificate.foreach(__v => __obj.updateDynamic("certificate")(__v.asInstanceOf[js.Any]))
      enforce.foreach(__v => __obj.updateDynamic("enforce")(__v.asInstanceOf[js.Any]))
      ports.foreach(__v => __obj.updateDynamic("ports")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualGatewayClientPolicyTls]
    }
  }

  /** An object that represents the virtual gateway's client's Transport Layer Security (TLS) certificate.
    */
  @js.native
  trait VirtualGatewayClientTlsCertificate extends js.Object {
    var file: js.UndefOr[VirtualGatewayListenerTlsFileCertificate]
    var sds: js.UndefOr[VirtualGatewayListenerTlsSdsCertificate]
  }

  object VirtualGatewayClientTlsCertificate {
    @inline
    def apply(
        file: js.UndefOr[VirtualGatewayListenerTlsFileCertificate] = js.undefined,
        sds: js.UndefOr[VirtualGatewayListenerTlsSdsCertificate] = js.undefined
    ): VirtualGatewayClientTlsCertificate = {
      val __obj = js.Dynamic.literal()
      file.foreach(__v => __obj.updateDynamic("file")(__v.asInstanceOf[js.Any]))
      sds.foreach(__v => __obj.updateDynamic("sds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualGatewayClientTlsCertificate]
    }
  }

  /** An object that represents the type of virtual gateway connection pool. Only one protocol is used at a time and should be the same protocol as the one chosen under port mapping. If not present the default value for <code>maxPendingRequests</code> is <code>2147483647</code>.
    */
  @js.native
  trait VirtualGatewayConnectionPool extends js.Object {
    var grpc: js.UndefOr[VirtualGatewayGrpcConnectionPool]
    var http: js.UndefOr[VirtualGatewayHttpConnectionPool]
    var http2: js.UndefOr[VirtualGatewayHttp2ConnectionPool]
  }

  object VirtualGatewayConnectionPool {
    @inline
    def apply(
        grpc: js.UndefOr[VirtualGatewayGrpcConnectionPool] = js.undefined,
        http: js.UndefOr[VirtualGatewayHttpConnectionPool] = js.undefined,
        http2: js.UndefOr[VirtualGatewayHttp2ConnectionPool] = js.undefined
    ): VirtualGatewayConnectionPool = {
      val __obj = js.Dynamic.literal()
      grpc.foreach(__v => __obj.updateDynamic("grpc")(__v.asInstanceOf[js.Any]))
      http.foreach(__v => __obj.updateDynamic("http")(__v.asInstanceOf[js.Any]))
      http2.foreach(__v => __obj.updateDynamic("http2")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualGatewayConnectionPool]
    }
  }

  /** An object that represents a virtual gateway returned by a describe operation.
    */
  @js.native
  trait VirtualGatewayData extends js.Object {
    var meshName: ResourceName
    var metadata: ResourceMetadata
    var spec: VirtualGatewaySpec
    var status: VirtualGatewayStatus
    var virtualGatewayName: ResourceName
  }

  object VirtualGatewayData {
    @inline
    def apply(
        meshName: ResourceName,
        metadata: ResourceMetadata,
        spec: VirtualGatewaySpec,
        status: VirtualGatewayStatus,
        virtualGatewayName: ResourceName
    ): VirtualGatewayData = {
      val __obj = js.Dynamic.literal(
        "meshName" -> meshName.asInstanceOf[js.Any],
        "metadata" -> metadata.asInstanceOf[js.Any],
        "spec" -> spec.asInstanceOf[js.Any],
        "status" -> status.asInstanceOf[js.Any],
        "virtualGatewayName" -> virtualGatewayName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VirtualGatewayData]
    }
  }

  /** An object that represents an access log file.
    */
  @js.native
  trait VirtualGatewayFileAccessLog extends js.Object {
    var path: FilePath
  }

  object VirtualGatewayFileAccessLog {
    @inline
    def apply(
        path: FilePath
    ): VirtualGatewayFileAccessLog = {
      val __obj = js.Dynamic.literal(
        "path" -> path.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VirtualGatewayFileAccessLog]
    }
  }

  /** An object that represents a type of connection pool.
    */
  @js.native
  trait VirtualGatewayGrpcConnectionPool extends js.Object {
    var maxRequests: MaxRequests
  }

  object VirtualGatewayGrpcConnectionPool {
    @inline
    def apply(
        maxRequests: MaxRequests
    ): VirtualGatewayGrpcConnectionPool = {
      val __obj = js.Dynamic.literal(
        "maxRequests" -> maxRequests.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VirtualGatewayGrpcConnectionPool]
    }
  }

  /** An object that represents the health check policy for a virtual gateway's listener.
    */
  @js.native
  trait VirtualGatewayHealthCheckPolicy extends js.Object {
    var healthyThreshold: VirtualGatewayHealthCheckThreshold
    var intervalMillis: VirtualGatewayHealthCheckIntervalMillis
    var protocol: VirtualGatewayPortProtocol
    var timeoutMillis: VirtualGatewayHealthCheckTimeoutMillis
    var unhealthyThreshold: VirtualGatewayHealthCheckThreshold
    var path: js.UndefOr[String]
    var port: js.UndefOr[PortNumber]
  }

  object VirtualGatewayHealthCheckPolicy {
    @inline
    def apply(
        healthyThreshold: VirtualGatewayHealthCheckThreshold,
        intervalMillis: VirtualGatewayHealthCheckIntervalMillis,
        protocol: VirtualGatewayPortProtocol,
        timeoutMillis: VirtualGatewayHealthCheckTimeoutMillis,
        unhealthyThreshold: VirtualGatewayHealthCheckThreshold,
        path: js.UndefOr[String] = js.undefined,
        port: js.UndefOr[PortNumber] = js.undefined
    ): VirtualGatewayHealthCheckPolicy = {
      val __obj = js.Dynamic.literal(
        "healthyThreshold" -> healthyThreshold.asInstanceOf[js.Any],
        "intervalMillis" -> intervalMillis.asInstanceOf[js.Any],
        "protocol" -> protocol.asInstanceOf[js.Any],
        "timeoutMillis" -> timeoutMillis.asInstanceOf[js.Any],
        "unhealthyThreshold" -> unhealthyThreshold.asInstanceOf[js.Any]
      )

      path.foreach(__v => __obj.updateDynamic("path")(__v.asInstanceOf[js.Any]))
      port.foreach(__v => __obj.updateDynamic("port")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualGatewayHealthCheckPolicy]
    }
  }

  /** An object that represents a type of connection pool.
    */
  @js.native
  trait VirtualGatewayHttp2ConnectionPool extends js.Object {
    var maxRequests: MaxRequests
  }

  object VirtualGatewayHttp2ConnectionPool {
    @inline
    def apply(
        maxRequests: MaxRequests
    ): VirtualGatewayHttp2ConnectionPool = {
      val __obj = js.Dynamic.literal(
        "maxRequests" -> maxRequests.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VirtualGatewayHttp2ConnectionPool]
    }
  }

  /** An object that represents a type of connection pool.
    */
  @js.native
  trait VirtualGatewayHttpConnectionPool extends js.Object {
    var maxConnections: MaxConnections
    var maxPendingRequests: js.UndefOr[MaxPendingRequests]
  }

  object VirtualGatewayHttpConnectionPool {
    @inline
    def apply(
        maxConnections: MaxConnections,
        maxPendingRequests: js.UndefOr[MaxPendingRequests] = js.undefined
    ): VirtualGatewayHttpConnectionPool = {
      val __obj = js.Dynamic.literal(
        "maxConnections" -> maxConnections.asInstanceOf[js.Any]
      )

      maxPendingRequests.foreach(__v => __obj.updateDynamic("maxPendingRequests")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualGatewayHttpConnectionPool]
    }
  }

  /** An object that represents a listener for a virtual gateway.
    */
  @js.native
  trait VirtualGatewayListener extends js.Object {
    var portMapping: VirtualGatewayPortMapping
    var connectionPool: js.UndefOr[VirtualGatewayConnectionPool]
    var healthCheck: js.UndefOr[VirtualGatewayHealthCheckPolicy]
    var tls: js.UndefOr[VirtualGatewayListenerTls]
  }

  object VirtualGatewayListener {
    @inline
    def apply(
        portMapping: VirtualGatewayPortMapping,
        connectionPool: js.UndefOr[VirtualGatewayConnectionPool] = js.undefined,
        healthCheck: js.UndefOr[VirtualGatewayHealthCheckPolicy] = js.undefined,
        tls: js.UndefOr[VirtualGatewayListenerTls] = js.undefined
    ): VirtualGatewayListener = {
      val __obj = js.Dynamic.literal(
        "portMapping" -> portMapping.asInstanceOf[js.Any]
      )

      connectionPool.foreach(__v => __obj.updateDynamic("connectionPool")(__v.asInstanceOf[js.Any]))
      healthCheck.foreach(__v => __obj.updateDynamic("healthCheck")(__v.asInstanceOf[js.Any]))
      tls.foreach(__v => __obj.updateDynamic("tls")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualGatewayListener]
    }
  }

  /** An object that represents the Transport Layer Security (TLS) properties for a listener.
    */
  @js.native
  trait VirtualGatewayListenerTls extends js.Object {
    var certificate: VirtualGatewayListenerTlsCertificate
    var mode: VirtualGatewayListenerTlsMode
    var validation: js.UndefOr[VirtualGatewayListenerTlsValidationContext]
  }

  object VirtualGatewayListenerTls {
    @inline
    def apply(
        certificate: VirtualGatewayListenerTlsCertificate,
        mode: VirtualGatewayListenerTlsMode,
        validation: js.UndefOr[VirtualGatewayListenerTlsValidationContext] = js.undefined
    ): VirtualGatewayListenerTls = {
      val __obj = js.Dynamic.literal(
        "certificate" -> certificate.asInstanceOf[js.Any],
        "mode" -> mode.asInstanceOf[js.Any]
      )

      validation.foreach(__v => __obj.updateDynamic("validation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualGatewayListenerTls]
    }
  }

  /** An object that represents an Certificate Manager certificate.
    */
  @js.native
  trait VirtualGatewayListenerTlsAcmCertificate extends js.Object {
    var certificateArn: Arn
  }

  object VirtualGatewayListenerTlsAcmCertificate {
    @inline
    def apply(
        certificateArn: Arn
    ): VirtualGatewayListenerTlsAcmCertificate = {
      val __obj = js.Dynamic.literal(
        "certificateArn" -> certificateArn.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VirtualGatewayListenerTlsAcmCertificate]
    }
  }

  /** An object that represents a listener's Transport Layer Security (TLS) certificate.
    */
  @js.native
  trait VirtualGatewayListenerTlsCertificate extends js.Object {
    var acm: js.UndefOr[VirtualGatewayListenerTlsAcmCertificate]
    var file: js.UndefOr[VirtualGatewayListenerTlsFileCertificate]
    var sds: js.UndefOr[VirtualGatewayListenerTlsSdsCertificate]
  }

  object VirtualGatewayListenerTlsCertificate {
    @inline
    def apply(
        acm: js.UndefOr[VirtualGatewayListenerTlsAcmCertificate] = js.undefined,
        file: js.UndefOr[VirtualGatewayListenerTlsFileCertificate] = js.undefined,
        sds: js.UndefOr[VirtualGatewayListenerTlsSdsCertificate] = js.undefined
    ): VirtualGatewayListenerTlsCertificate = {
      val __obj = js.Dynamic.literal()
      acm.foreach(__v => __obj.updateDynamic("acm")(__v.asInstanceOf[js.Any]))
      file.foreach(__v => __obj.updateDynamic("file")(__v.asInstanceOf[js.Any]))
      sds.foreach(__v => __obj.updateDynamic("sds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualGatewayListenerTlsCertificate]
    }
  }

  /** An object that represents a local file certificate. The certificate must meet specific requirements and you must have proxy authorization enabled. For more information, see [[https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html#virtual-node-tls-prerequisites|Transport Layer Security (TLS)]].
    */
  @js.native
  trait VirtualGatewayListenerTlsFileCertificate extends js.Object {
    var certificateChain: FilePath
    var privateKey: FilePath
  }

  object VirtualGatewayListenerTlsFileCertificate {
    @inline
    def apply(
        certificateChain: FilePath,
        privateKey: FilePath
    ): VirtualGatewayListenerTlsFileCertificate = {
      val __obj = js.Dynamic.literal(
        "certificateChain" -> certificateChain.asInstanceOf[js.Any],
        "privateKey" -> privateKey.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VirtualGatewayListenerTlsFileCertificate]
    }
  }

  /** An object that represents the virtual gateway's listener's Secret Discovery Service certificate.The proxy must be configured with a local SDS provider via a Unix Domain Socket. See App Mesh[[https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html|TLS documentation]] for more info.
    */
  @js.native
  trait VirtualGatewayListenerTlsSdsCertificate extends js.Object {
    var secretName: VirtualGatewaySdsSecretName
  }

  object VirtualGatewayListenerTlsSdsCertificate {
    @inline
    def apply(
        secretName: VirtualGatewaySdsSecretName
    ): VirtualGatewayListenerTlsSdsCertificate = {
      val __obj = js.Dynamic.literal(
        "secretName" -> secretName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VirtualGatewayListenerTlsSdsCertificate]
    }
  }

  /** An object that represents a virtual gateway's listener's Transport Layer Security (TLS) validation context.
    */
  @js.native
  trait VirtualGatewayListenerTlsValidationContext extends js.Object {
    var trust: VirtualGatewayListenerTlsValidationContextTrust
    var subjectAlternativeNames: js.UndefOr[SubjectAlternativeNames]
  }

  object VirtualGatewayListenerTlsValidationContext {
    @inline
    def apply(
        trust: VirtualGatewayListenerTlsValidationContextTrust,
        subjectAlternativeNames: js.UndefOr[SubjectAlternativeNames] = js.undefined
    ): VirtualGatewayListenerTlsValidationContext = {
      val __obj = js.Dynamic.literal(
        "trust" -> trust.asInstanceOf[js.Any]
      )

      subjectAlternativeNames.foreach(__v => __obj.updateDynamic("subjectAlternativeNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualGatewayListenerTlsValidationContext]
    }
  }

  /** An object that represents a virtual gateway's listener's Transport Layer Security (TLS) validation context trust.
    */
  @js.native
  trait VirtualGatewayListenerTlsValidationContextTrust extends js.Object {
    var file: js.UndefOr[VirtualGatewayTlsValidationContextFileTrust]
    var sds: js.UndefOr[VirtualGatewayTlsValidationContextSdsTrust]
  }

  object VirtualGatewayListenerTlsValidationContextTrust {
    @inline
    def apply(
        file: js.UndefOr[VirtualGatewayTlsValidationContextFileTrust] = js.undefined,
        sds: js.UndefOr[VirtualGatewayTlsValidationContextSdsTrust] = js.undefined
    ): VirtualGatewayListenerTlsValidationContextTrust = {
      val __obj = js.Dynamic.literal()
      file.foreach(__v => __obj.updateDynamic("file")(__v.asInstanceOf[js.Any]))
      sds.foreach(__v => __obj.updateDynamic("sds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualGatewayListenerTlsValidationContextTrust]
    }
  }

  /** An object that represents logging information.
    */
  @js.native
  trait VirtualGatewayLogging extends js.Object {
    var accessLog: js.UndefOr[VirtualGatewayAccessLog]
  }

  object VirtualGatewayLogging {
    @inline
    def apply(
        accessLog: js.UndefOr[VirtualGatewayAccessLog] = js.undefined
    ): VirtualGatewayLogging = {
      val __obj = js.Dynamic.literal()
      accessLog.foreach(__v => __obj.updateDynamic("accessLog")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualGatewayLogging]
    }
  }

  /** An object that represents a port mapping.
    */
  @js.native
  trait VirtualGatewayPortMapping extends js.Object {
    var port: PortNumber
    var protocol: VirtualGatewayPortProtocol
  }

  object VirtualGatewayPortMapping {
    @inline
    def apply(
        port: PortNumber,
        protocol: VirtualGatewayPortProtocol
    ): VirtualGatewayPortMapping = {
      val __obj = js.Dynamic.literal(
        "port" -> port.asInstanceOf[js.Any],
        "protocol" -> protocol.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VirtualGatewayPortMapping]
    }
  }

  /** An object that represents a virtual gateway returned by a list operation.
    */
  @js.native
  trait VirtualGatewayRef extends js.Object {
    var arn: Arn
    var createdAt: Timestamp
    var lastUpdatedAt: Timestamp
    var meshName: ResourceName
    var meshOwner: AccountId
    var resourceOwner: AccountId
    var version: Double
    var virtualGatewayName: ResourceName
  }

  object VirtualGatewayRef {
    @inline
    def apply(
        arn: Arn,
        createdAt: Timestamp,
        lastUpdatedAt: Timestamp,
        meshName: ResourceName,
        meshOwner: AccountId,
        resourceOwner: AccountId,
        version: Double,
        virtualGatewayName: ResourceName
    ): VirtualGatewayRef = {
      val __obj = js.Dynamic.literal(
        "arn" -> arn.asInstanceOf[js.Any],
        "createdAt" -> createdAt.asInstanceOf[js.Any],
        "lastUpdatedAt" -> lastUpdatedAt.asInstanceOf[js.Any],
        "meshName" -> meshName.asInstanceOf[js.Any],
        "meshOwner" -> meshOwner.asInstanceOf[js.Any],
        "resourceOwner" -> resourceOwner.asInstanceOf[js.Any],
        "version" -> version.asInstanceOf[js.Any],
        "virtualGatewayName" -> virtualGatewayName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VirtualGatewayRef]
    }
  }

  /** An object that represents the specification of a service mesh resource.
    */
  @js.native
  trait VirtualGatewaySpec extends js.Object {
    var listeners: VirtualGatewayListeners
    var backendDefaults: js.UndefOr[VirtualGatewayBackendDefaults]
    var logging: js.UndefOr[VirtualGatewayLogging]
  }

  object VirtualGatewaySpec {
    @inline
    def apply(
        listeners: VirtualGatewayListeners,
        backendDefaults: js.UndefOr[VirtualGatewayBackendDefaults] = js.undefined,
        logging: js.UndefOr[VirtualGatewayLogging] = js.undefined
    ): VirtualGatewaySpec = {
      val __obj = js.Dynamic.literal(
        "listeners" -> listeners.asInstanceOf[js.Any]
      )

      backendDefaults.foreach(__v => __obj.updateDynamic("backendDefaults")(__v.asInstanceOf[js.Any]))
      logging.foreach(__v => __obj.updateDynamic("logging")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualGatewaySpec]
    }
  }

  /** An object that represents the status of the mesh resource.
    */
  @js.native
  trait VirtualGatewayStatus extends js.Object {
    var status: VirtualGatewayStatusCode
  }

  object VirtualGatewayStatus {
    @inline
    def apply(
        status: VirtualGatewayStatusCode
    ): VirtualGatewayStatus = {
      val __obj = js.Dynamic.literal(
        "status" -> status.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VirtualGatewayStatus]
    }
  }

  /** An object that represents a Transport Layer Security (TLS) validation context.
    */
  @js.native
  trait VirtualGatewayTlsValidationContext extends js.Object {
    var trust: VirtualGatewayTlsValidationContextTrust
    var subjectAlternativeNames: js.UndefOr[SubjectAlternativeNames]
  }

  object VirtualGatewayTlsValidationContext {
    @inline
    def apply(
        trust: VirtualGatewayTlsValidationContextTrust,
        subjectAlternativeNames: js.UndefOr[SubjectAlternativeNames] = js.undefined
    ): VirtualGatewayTlsValidationContext = {
      val __obj = js.Dynamic.literal(
        "trust" -> trust.asInstanceOf[js.Any]
      )

      subjectAlternativeNames.foreach(__v => __obj.updateDynamic("subjectAlternativeNames")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualGatewayTlsValidationContext]
    }
  }

  /** An object that represents a Transport Layer Security (TLS) validation context trust for an Certificate Manager certificate.
    */
  @js.native
  trait VirtualGatewayTlsValidationContextAcmTrust extends js.Object {
    var certificateAuthorityArns: VirtualGatewayCertificateAuthorityArns
  }

  object VirtualGatewayTlsValidationContextAcmTrust {
    @inline
    def apply(
        certificateAuthorityArns: VirtualGatewayCertificateAuthorityArns
    ): VirtualGatewayTlsValidationContextAcmTrust = {
      val __obj = js.Dynamic.literal(
        "certificateAuthorityArns" -> certificateAuthorityArns.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VirtualGatewayTlsValidationContextAcmTrust]
    }
  }

  /** An object that represents a Transport Layer Security (TLS) validation context trust for a local file.
    */
  @js.native
  trait VirtualGatewayTlsValidationContextFileTrust extends js.Object {
    var certificateChain: FilePath
  }

  object VirtualGatewayTlsValidationContextFileTrust {
    @inline
    def apply(
        certificateChain: FilePath
    ): VirtualGatewayTlsValidationContextFileTrust = {
      val __obj = js.Dynamic.literal(
        "certificateChain" -> certificateChain.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VirtualGatewayTlsValidationContextFileTrust]
    }
  }

  /** An object that represents a virtual gateway's listener's Transport Layer Security (TLS) Secret Discovery Service validation context trust. The proxy must be configured with a local SDS provider via a Unix Domain Socket. See App Mesh [[https://docs.aws.amazon.com/app-mesh/latest/userguide/tls.html|TLS documentation]] for more info.
    */
  @js.native
  trait VirtualGatewayTlsValidationContextSdsTrust extends js.Object {
    var secretName: VirtualGatewaySdsSecretName
  }

  object VirtualGatewayTlsValidationContextSdsTrust {
    @inline
    def apply(
        secretName: VirtualGatewaySdsSecretName
    ): VirtualGatewayTlsValidationContextSdsTrust = {
      val __obj = js.Dynamic.literal(
        "secretName" -> secretName.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VirtualGatewayTlsValidationContextSdsTrust]
    }
  }

  /** An object that represents a Transport Layer Security (TLS) validation context trust.
    */
  @js.native
  trait VirtualGatewayTlsValidationContextTrust extends js.Object {
    var acm: js.UndefOr[VirtualGatewayTlsValidationContextAcmTrust]
    var file: js.UndefOr[VirtualGatewayTlsValidationContextFileTrust]
    var sds: js.UndefOr[VirtualGatewayTlsValidationContextSdsTrust]
  }

  object VirtualGatewayTlsValidationContextTrust {
    @inline
    def apply(
        acm: js.UndefOr[VirtualGatewayTlsValidationContextAcmTrust] = js.undefined,
        file: js.UndefOr[VirtualGatewayTlsValidationContextFileTrust] = js.undefined,
        sds: js.UndefOr[VirtualGatewayTlsValidationContextSdsTrust] = js.undefined
    ): VirtualGatewayTlsValidationContextTrust = {
      val __obj = js.Dynamic.literal()
      acm.foreach(__v => __obj.updateDynamic("acm")(__v.asInstanceOf[js.Any]))
      file.foreach(__v => __obj.updateDynamic("file")(__v.asInstanceOf[js.Any]))
      sds.foreach(__v => __obj.updateDynamic("sds")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualGatewayTlsValidationContextTrust]
    }
  }

  /** An object that represents the type of virtual node connection pool. Only one protocol is used at a time and should be the same protocol as the one chosen under port mapping. If not present the default value for <code>maxPendingRequests</code> is <code>2147483647</code>. <p/>
    */
  @js.native
  trait VirtualNodeConnectionPool extends js.Object {
    var grpc: js.UndefOr[VirtualNodeGrpcConnectionPool]
    var http: js.UndefOr[VirtualNodeHttpConnectionPool]
    var http2: js.UndefOr[VirtualNodeHttp2ConnectionPool]
    var tcp: js.UndefOr[VirtualNodeTcpConnectionPool]
  }

  object VirtualNodeConnectionPool {
    @inline
    def apply(
        grpc: js.UndefOr[VirtualNodeGrpcConnectionPool] = js.undefined,
        http: js.UndefOr[VirtualNodeHttpConnectionPool] = js.undefined,
        http2: js.UndefOr[VirtualNodeHttp2ConnectionPool] = js.undefined,
        tcp: js.UndefOr[VirtualNodeTcpConnectionPool] = js.undefined
    ): VirtualNodeConnectionPool = {
      val __obj = js.Dynamic.literal()
      grpc.foreach(__v => __obj.updateDynamic("grpc")(__v.asInstanceOf[js.Any]))
      http.foreach(__v => __obj.updateDynamic("http")(__v.asInstanceOf[js.Any]))
      http2.foreach(__v => __obj.updateDynamic("http2")(__v.asInstanceOf[js.Any]))
      tcp.foreach(__v => __obj.updateDynamic("tcp")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualNodeConnectionPool]
    }
  }

  /** An object that represents a virtual node returned by a describe operation.
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

  /** An object that represents a type of connection pool.
    */
  @js.native
  trait VirtualNodeGrpcConnectionPool extends js.Object {
    var maxRequests: MaxRequests
  }

  object VirtualNodeGrpcConnectionPool {
    @inline
    def apply(
        maxRequests: MaxRequests
    ): VirtualNodeGrpcConnectionPool = {
      val __obj = js.Dynamic.literal(
        "maxRequests" -> maxRequests.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VirtualNodeGrpcConnectionPool]
    }
  }

  /** An object that represents a type of connection pool.
    */
  @js.native
  trait VirtualNodeHttp2ConnectionPool extends js.Object {
    var maxRequests: MaxRequests
  }

  object VirtualNodeHttp2ConnectionPool {
    @inline
    def apply(
        maxRequests: MaxRequests
    ): VirtualNodeHttp2ConnectionPool = {
      val __obj = js.Dynamic.literal(
        "maxRequests" -> maxRequests.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VirtualNodeHttp2ConnectionPool]
    }
  }

  /** An object that represents a type of connection pool.
    */
  @js.native
  trait VirtualNodeHttpConnectionPool extends js.Object {
    var maxConnections: MaxConnections
    var maxPendingRequests: js.UndefOr[MaxPendingRequests]
  }

  object VirtualNodeHttpConnectionPool {
    @inline
    def apply(
        maxConnections: MaxConnections,
        maxPendingRequests: js.UndefOr[MaxPendingRequests] = js.undefined
    ): VirtualNodeHttpConnectionPool = {
      val __obj = js.Dynamic.literal(
        "maxConnections" -> maxConnections.asInstanceOf[js.Any]
      )

      maxPendingRequests.foreach(__v => __obj.updateDynamic("maxPendingRequests")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[VirtualNodeHttpConnectionPool]
    }
  }

  /** An object that represents a virtual node returned by a list operation.
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

  /** An object that represents a virtual node service provider.
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

  /** An object that represents the specification of a virtual node.
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

  /** An object that represents the current status of the virtual node.
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

  /** An object that represents a type of connection pool.
    */
  @js.native
  trait VirtualNodeTcpConnectionPool extends js.Object {
    var maxConnections: MaxConnections
  }

  object VirtualNodeTcpConnectionPool {
    @inline
    def apply(
        maxConnections: MaxConnections
    ): VirtualNodeTcpConnectionPool = {
      val __obj = js.Dynamic.literal(
        "maxConnections" -> maxConnections.asInstanceOf[js.Any]
      )
      __obj.asInstanceOf[VirtualNodeTcpConnectionPool]
    }
  }

  /** An object that represents a virtual router returned by a describe operation.
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

  /** An object that represents a virtual router listener.
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

  /** An object that represents a virtual router returned by a list operation.
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

  /** An object that represents a virtual node service provider.
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

  /** An object that represents the specification of a virtual router.
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

  /** An object that represents the status of a virtual router.
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

  /** An object that represents a virtual service backend for a virtual node.
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

  /** An object that represents a virtual service returned by a describe operation.
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

  /** An object that represents the provider for a virtual service.
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

  /** An object that represents a virtual service returned by a list operation.
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

  /** An object that represents the specification of a virtual service.
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

  /** An object that represents the status of a virtual service.
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

  /** An object that represents a target and its relative weight. Traffic is distributed across targets according to their relative weight. For example, a weighted target with a relative weight of 50 receives five times as much traffic as one with a relative weight of 10. The total weight for all targets combined must be less than or equal to 100.
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
