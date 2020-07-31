package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._

package object servicediscovery {
  type AmazonResourceName = String
  type Arn = String
  type AttrKey = String
  type AttrValue = String
  type Attributes = js.Dictionary[AttrValue]
  type Code = String
  type DiscoverMaxResults = Int
  type DnsRecordList = js.Array[DnsRecord]
  type FailureThreshold = Int
  type FilterValue = String
  type FilterValues = js.Array[FilterValue]
  type HttpInstanceSummaryList = js.Array[HttpInstanceSummary]
  type InstanceHealthStatusMap = js.Dictionary[HealthStatus]
  type InstanceIdList = js.Array[ResourceId]
  type InstanceSummaryList = js.Array[InstanceSummary]
  type MaxResults = Int
  type Message = String
  type NamespaceFilters = js.Array[NamespaceFilter]
  type NamespaceName = String
  type NamespaceSummariesList = js.Array[NamespaceSummary]
  type NextToken = String
  type OperationFilters = js.Array[OperationFilter]
  type OperationId = String
  type OperationSummaryList = js.Array[OperationSummary]
  type OperationTargetsMap = js.Dictionary[ResourceId]
  type RecordTTL = Double
  type ResourceCount = Int
  type ResourceDescription = String
  type ResourceId = String
  type ResourcePath = String
  type ServiceFilters = js.Array[ServiceFilter]
  type ServiceName = String
  type ServiceSummariesList = js.Array[ServiceSummary]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = String
  type Timestamp = js.Date

  implicit final class ServiceDiscoveryOps(private val service: ServiceDiscovery) extends AnyVal {

    @inline def createHttpNamespaceFuture(params: CreateHttpNamespaceRequest): Future[CreateHttpNamespaceResponse] = service.createHttpNamespace(params).promise().toFuture
    @inline def createPrivateDnsNamespaceFuture(params: CreatePrivateDnsNamespaceRequest): Future[CreatePrivateDnsNamespaceResponse] = service.createPrivateDnsNamespace(params).promise().toFuture
    @inline def createPublicDnsNamespaceFuture(params: CreatePublicDnsNamespaceRequest): Future[CreatePublicDnsNamespaceResponse] = service.createPublicDnsNamespace(params).promise().toFuture
    @inline def createServiceFuture(params: CreateServiceRequest): Future[CreateServiceResponse] = service.createService(params).promise().toFuture
    @inline def deleteNamespaceFuture(params: DeleteNamespaceRequest): Future[DeleteNamespaceResponse] = service.deleteNamespace(params).promise().toFuture
    @inline def deleteServiceFuture(params: DeleteServiceRequest): Future[DeleteServiceResponse] = service.deleteService(params).promise().toFuture
    @inline def deregisterInstanceFuture(params: DeregisterInstanceRequest): Future[DeregisterInstanceResponse] = service.deregisterInstance(params).promise().toFuture
    @inline def discoverInstancesFuture(params: DiscoverInstancesRequest): Future[DiscoverInstancesResponse] = service.discoverInstances(params).promise().toFuture
    @inline def getInstanceFuture(params: GetInstanceRequest): Future[GetInstanceResponse] = service.getInstance(params).promise().toFuture
    @inline def getInstancesHealthStatusFuture(params: GetInstancesHealthStatusRequest): Future[GetInstancesHealthStatusResponse] = service.getInstancesHealthStatus(params).promise().toFuture
    @inline def getNamespaceFuture(params: GetNamespaceRequest): Future[GetNamespaceResponse] = service.getNamespace(params).promise().toFuture
    @inline def getOperationFuture(params: GetOperationRequest): Future[GetOperationResponse] = service.getOperation(params).promise().toFuture
    @inline def getServiceFuture(params: GetServiceRequest): Future[GetServiceResponse] = service.getService(params).promise().toFuture
    @inline def listInstancesFuture(params: ListInstancesRequest): Future[ListInstancesResponse] = service.listInstances(params).promise().toFuture
    @inline def listNamespacesFuture(params: ListNamespacesRequest): Future[ListNamespacesResponse] = service.listNamespaces(params).promise().toFuture
    @inline def listOperationsFuture(params: ListOperationsRequest): Future[ListOperationsResponse] = service.listOperations(params).promise().toFuture
    @inline def listServicesFuture(params: ListServicesRequest): Future[ListServicesResponse] = service.listServices(params).promise().toFuture
    @inline def listTagsForResourceFuture(params: ListTagsForResourceRequest): Future[ListTagsForResourceResponse] = service.listTagsForResource(params).promise().toFuture
    @inline def registerInstanceFuture(params: RegisterInstanceRequest): Future[RegisterInstanceResponse] = service.registerInstance(params).promise().toFuture
    @inline def tagResourceFuture(params: TagResourceRequest): Future[TagResourceResponse] = service.tagResource(params).promise().toFuture
    @inline def untagResourceFuture(params: UntagResourceRequest): Future[UntagResourceResponse] = service.untagResource(params).promise().toFuture
    @inline def updateInstanceCustomHealthStatusFuture(params: UpdateInstanceCustomHealthStatusRequest): Future[js.Object] = service.updateInstanceCustomHealthStatus(params).promise().toFuture
    @inline def updateServiceFuture(params: UpdateServiceRequest): Future[UpdateServiceResponse] = service.updateService(params).promise().toFuture
  }
}

package servicediscovery {
  @js.native
  @JSImport("aws-sdk", "ServiceDiscovery", "AWS.ServiceDiscovery")
  class ServiceDiscovery() extends js.Object {
    def this(config: AWSConfig) = this()

    def createHttpNamespace(params: CreateHttpNamespaceRequest): Request[CreateHttpNamespaceResponse] = js.native
    def createPrivateDnsNamespace(params: CreatePrivateDnsNamespaceRequest): Request[CreatePrivateDnsNamespaceResponse] = js.native
    def createPublicDnsNamespace(params: CreatePublicDnsNamespaceRequest): Request[CreatePublicDnsNamespaceResponse] = js.native
    def createService(params: CreateServiceRequest): Request[CreateServiceResponse] = js.native
    def deleteNamespace(params: DeleteNamespaceRequest): Request[DeleteNamespaceResponse] = js.native
    def deleteService(params: DeleteServiceRequest): Request[DeleteServiceResponse] = js.native
    def deregisterInstance(params: DeregisterInstanceRequest): Request[DeregisterInstanceResponse] = js.native
    def discoverInstances(params: DiscoverInstancesRequest): Request[DiscoverInstancesResponse] = js.native
    def getInstance(params: GetInstanceRequest): Request[GetInstanceResponse] = js.native
    def getInstancesHealthStatus(params: GetInstancesHealthStatusRequest): Request[GetInstancesHealthStatusResponse] = js.native
    def getNamespace(params: GetNamespaceRequest): Request[GetNamespaceResponse] = js.native
    def getOperation(params: GetOperationRequest): Request[GetOperationResponse] = js.native
    def getService(params: GetServiceRequest): Request[GetServiceResponse] = js.native
    def listInstances(params: ListInstancesRequest): Request[ListInstancesResponse] = js.native
    def listNamespaces(params: ListNamespacesRequest): Request[ListNamespacesResponse] = js.native
    def listOperations(params: ListOperationsRequest): Request[ListOperationsResponse] = js.native
    def listServices(params: ListServicesRequest): Request[ListServicesResponse] = js.native
    def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse] = js.native
    def registerInstance(params: RegisterInstanceRequest): Request[RegisterInstanceResponse] = js.native
    def tagResource(params: TagResourceRequest): Request[TagResourceResponse] = js.native
    def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse] = js.native
    def updateInstanceCustomHealthStatus(params: UpdateInstanceCustomHealthStatusRequest): Request[js.Object] = js.native
    def updateService(params: UpdateServiceRequest): Request[UpdateServiceResponse] = js.native
  }

  @js.native
  trait CreateHttpNamespaceRequest extends js.Object {
    var Name: NamespaceName
    var CreatorRequestId: js.UndefOr[ResourceId]
    var Description: js.UndefOr[ResourceDescription]
    var Tags: js.UndefOr[TagList]
  }

  object CreateHttpNamespaceRequest {
    @inline
    def apply(
        Name: NamespaceName,
        CreatorRequestId: js.UndefOr[ResourceId] = js.undefined,
        Description: js.UndefOr[ResourceDescription] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateHttpNamespaceRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CreatorRequestId.foreach(__v => __obj.updateDynamic("CreatorRequestId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateHttpNamespaceRequest]
    }
  }

  @js.native
  trait CreateHttpNamespaceResponse extends js.Object {
    var OperationId: js.UndefOr[OperationId]
  }

  object CreateHttpNamespaceResponse {
    @inline
    def apply(
        OperationId: js.UndefOr[OperationId] = js.undefined
    ): CreateHttpNamespaceResponse = {
      val __obj = js.Dynamic.literal()
      OperationId.foreach(__v => __obj.updateDynamic("OperationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateHttpNamespaceResponse]
    }
  }

  @js.native
  trait CreatePrivateDnsNamespaceRequest extends js.Object {
    var Name: NamespaceName
    var Vpc: ResourceId
    var CreatorRequestId: js.UndefOr[ResourceId]
    var Description: js.UndefOr[ResourceDescription]
    var Tags: js.UndefOr[TagList]
  }

  object CreatePrivateDnsNamespaceRequest {
    @inline
    def apply(
        Name: NamespaceName,
        Vpc: ResourceId,
        CreatorRequestId: js.UndefOr[ResourceId] = js.undefined,
        Description: js.UndefOr[ResourceDescription] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreatePrivateDnsNamespaceRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Vpc" -> Vpc.asInstanceOf[js.Any]
      )

      CreatorRequestId.foreach(__v => __obj.updateDynamic("CreatorRequestId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePrivateDnsNamespaceRequest]
    }
  }

  @js.native
  trait CreatePrivateDnsNamespaceResponse extends js.Object {
    var OperationId: js.UndefOr[OperationId]
  }

  object CreatePrivateDnsNamespaceResponse {
    @inline
    def apply(
        OperationId: js.UndefOr[OperationId] = js.undefined
    ): CreatePrivateDnsNamespaceResponse = {
      val __obj = js.Dynamic.literal()
      OperationId.foreach(__v => __obj.updateDynamic("OperationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePrivateDnsNamespaceResponse]
    }
  }

  @js.native
  trait CreatePublicDnsNamespaceRequest extends js.Object {
    var Name: NamespaceName
    var CreatorRequestId: js.UndefOr[ResourceId]
    var Description: js.UndefOr[ResourceDescription]
    var Tags: js.UndefOr[TagList]
  }

  object CreatePublicDnsNamespaceRequest {
    @inline
    def apply(
        Name: NamespaceName,
        CreatorRequestId: js.UndefOr[ResourceId] = js.undefined,
        Description: js.UndefOr[ResourceDescription] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreatePublicDnsNamespaceRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CreatorRequestId.foreach(__v => __obj.updateDynamic("CreatorRequestId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePublicDnsNamespaceRequest]
    }
  }

  @js.native
  trait CreatePublicDnsNamespaceResponse extends js.Object {
    var OperationId: js.UndefOr[OperationId]
  }

  object CreatePublicDnsNamespaceResponse {
    @inline
    def apply(
        OperationId: js.UndefOr[OperationId] = js.undefined
    ): CreatePublicDnsNamespaceResponse = {
      val __obj = js.Dynamic.literal()
      OperationId.foreach(__v => __obj.updateDynamic("OperationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreatePublicDnsNamespaceResponse]
    }
  }

  @js.native
  trait CreateServiceRequest extends js.Object {
    var Name: ServiceName
    var CreatorRequestId: js.UndefOr[ResourceId]
    var Description: js.UndefOr[ResourceDescription]
    var DnsConfig: js.UndefOr[DnsConfig]
    var HealthCheckConfig: js.UndefOr[HealthCheckConfig]
    var HealthCheckCustomConfig: js.UndefOr[HealthCheckCustomConfig]
    var NamespaceId: js.UndefOr[ResourceId]
    var Tags: js.UndefOr[TagList]
  }

  object CreateServiceRequest {
    @inline
    def apply(
        Name: ServiceName,
        CreatorRequestId: js.UndefOr[ResourceId] = js.undefined,
        Description: js.UndefOr[ResourceDescription] = js.undefined,
        DnsConfig: js.UndefOr[DnsConfig] = js.undefined,
        HealthCheckConfig: js.UndefOr[HealthCheckConfig] = js.undefined,
        HealthCheckCustomConfig: js.UndefOr[HealthCheckCustomConfig] = js.undefined,
        NamespaceId: js.UndefOr[ResourceId] = js.undefined,
        Tags: js.UndefOr[TagList] = js.undefined
    ): CreateServiceRequest = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any]
      )

      CreatorRequestId.foreach(__v => __obj.updateDynamic("CreatorRequestId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DnsConfig.foreach(__v => __obj.updateDynamic("DnsConfig")(__v.asInstanceOf[js.Any]))
      HealthCheckConfig.foreach(__v => __obj.updateDynamic("HealthCheckConfig")(__v.asInstanceOf[js.Any]))
      HealthCheckCustomConfig.foreach(__v => __obj.updateDynamic("HealthCheckCustomConfig")(__v.asInstanceOf[js.Any]))
      NamespaceId.foreach(__v => __obj.updateDynamic("NamespaceId")(__v.asInstanceOf[js.Any]))
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateServiceRequest]
    }
  }

  @js.native
  trait CreateServiceResponse extends js.Object {
    var Service: js.UndefOr[Service]
  }

  object CreateServiceResponse {
    @inline
    def apply(
        Service: js.UndefOr[Service] = js.undefined
    ): CreateServiceResponse = {
      val __obj = js.Dynamic.literal()
      Service.foreach(__v => __obj.updateDynamic("Service")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[CreateServiceResponse]
    }
  }

  @js.native
  sealed trait CustomHealthStatus extends js.Any
  object CustomHealthStatus {
    val HEALTHY = "HEALTHY".asInstanceOf[CustomHealthStatus]
    val UNHEALTHY = "UNHEALTHY".asInstanceOf[CustomHealthStatus]

    @inline def values = js.Array(HEALTHY, UNHEALTHY)
  }

  @js.native
  trait DeleteNamespaceRequest extends js.Object {
    var Id: ResourceId
  }

  object DeleteNamespaceRequest {
    @inline
    def apply(
        Id: ResourceId
    ): DeleteNamespaceRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteNamespaceRequest]
    }
  }

  @js.native
  trait DeleteNamespaceResponse extends js.Object {
    var OperationId: js.UndefOr[OperationId]
  }

  object DeleteNamespaceResponse {
    @inline
    def apply(
        OperationId: js.UndefOr[OperationId] = js.undefined
    ): DeleteNamespaceResponse = {
      val __obj = js.Dynamic.literal()
      OperationId.foreach(__v => __obj.updateDynamic("OperationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeleteNamespaceResponse]
    }
  }

  @js.native
  trait DeleteServiceRequest extends js.Object {
    var Id: ResourceId
  }

  object DeleteServiceRequest {
    @inline
    def apply(
        Id: ResourceId
    ): DeleteServiceRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeleteServiceRequest]
    }
  }

  @js.native
  trait DeleteServiceResponse extends js.Object {}

  object DeleteServiceResponse {
    @inline
    def apply(
    ): DeleteServiceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[DeleteServiceResponse]
    }
  }

  @js.native
  trait DeregisterInstanceRequest extends js.Object {
    var InstanceId: ResourceId
    var ServiceId: ResourceId
  }

  object DeregisterInstanceRequest {
    @inline
    def apply(
        InstanceId: ResourceId,
        ServiceId: ResourceId
    ): DeregisterInstanceRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "ServiceId" -> ServiceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DeregisterInstanceRequest]
    }
  }

  @js.native
  trait DeregisterInstanceResponse extends js.Object {
    var OperationId: js.UndefOr[OperationId]
  }

  object DeregisterInstanceResponse {
    @inline
    def apply(
        OperationId: js.UndefOr[OperationId] = js.undefined
    ): DeregisterInstanceResponse = {
      val __obj = js.Dynamic.literal()
      OperationId.foreach(__v => __obj.updateDynamic("OperationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DeregisterInstanceResponse]
    }
  }

  @js.native
  trait DiscoverInstancesRequest extends js.Object {
    var NamespaceName: NamespaceName
    var ServiceName: ServiceName
    var HealthStatus: js.UndefOr[HealthStatusFilter]
    var MaxResults: js.UndefOr[DiscoverMaxResults]
    var QueryParameters: js.UndefOr[Attributes]
  }

  object DiscoverInstancesRequest {
    @inline
    def apply(
        NamespaceName: NamespaceName,
        ServiceName: ServiceName,
        HealthStatus: js.UndefOr[HealthStatusFilter] = js.undefined,
        MaxResults: js.UndefOr[DiscoverMaxResults] = js.undefined,
        QueryParameters: js.UndefOr[Attributes] = js.undefined
    ): DiscoverInstancesRequest = {
      val __obj = js.Dynamic.literal(
        "NamespaceName" -> NamespaceName.asInstanceOf[js.Any],
        "ServiceName" -> ServiceName.asInstanceOf[js.Any]
      )

      HealthStatus.foreach(__v => __obj.updateDynamic("HealthStatus")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      QueryParameters.foreach(__v => __obj.updateDynamic("QueryParameters")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DiscoverInstancesRequest]
    }
  }

  @js.native
  trait DiscoverInstancesResponse extends js.Object {
    var Instances: js.UndefOr[HttpInstanceSummaryList]
  }

  object DiscoverInstancesResponse {
    @inline
    def apply(
        Instances: js.UndefOr[HttpInstanceSummaryList] = js.undefined
    ): DiscoverInstancesResponse = {
      val __obj = js.Dynamic.literal()
      Instances.foreach(__v => __obj.updateDynamic("Instances")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DiscoverInstancesResponse]
    }
  }

  /**
    * A complex type that contains information about the Amazon Route 53 DNS records that you want AWS Cloud Map to create when you register an instance.
    */
  @js.native
  trait DnsConfig extends js.Object {
    var DnsRecords: DnsRecordList
    var NamespaceId: js.UndefOr[ResourceId]
    var RoutingPolicy: js.UndefOr[RoutingPolicy]
  }

  object DnsConfig {
    @inline
    def apply(
        DnsRecords: DnsRecordList,
        NamespaceId: js.UndefOr[ResourceId] = js.undefined,
        RoutingPolicy: js.UndefOr[RoutingPolicy] = js.undefined
    ): DnsConfig = {
      val __obj = js.Dynamic.literal(
        "DnsRecords" -> DnsRecords.asInstanceOf[js.Any]
      )

      NamespaceId.foreach(__v => __obj.updateDynamic("NamespaceId")(__v.asInstanceOf[js.Any]))
      RoutingPolicy.foreach(__v => __obj.updateDynamic("RoutingPolicy")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DnsConfig]
    }
  }

  /**
    * A complex type that contains information about changes to the Route 53 DNS records that AWS Cloud Map creates when you register an instance.
    */
  @js.native
  trait DnsConfigChange extends js.Object {
    var DnsRecords: DnsRecordList
  }

  object DnsConfigChange {
    @inline
    def apply(
        DnsRecords: DnsRecordList
    ): DnsConfigChange = {
      val __obj = js.Dynamic.literal(
        "DnsRecords" -> DnsRecords.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DnsConfigChange]
    }
  }

  /**
    * A complex type that contains the ID for the Route 53 hosted zone that AWS Cloud Map creates when you create a namespace.
    */
  @js.native
  trait DnsProperties extends js.Object {
    var HostedZoneId: js.UndefOr[ResourceId]
  }

  object DnsProperties {
    @inline
    def apply(
        HostedZoneId: js.UndefOr[ResourceId] = js.undefined
    ): DnsProperties = {
      val __obj = js.Dynamic.literal()
      HostedZoneId.foreach(__v => __obj.updateDynamic("HostedZoneId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[DnsProperties]
    }
  }

  /**
    * A complex type that contains information about the Route 53 DNS records that you want AWS Cloud Map to create when you register an instance.
    */
  @js.native
  trait DnsRecord extends js.Object {
    var TTL: RecordTTL
    var Type: RecordType
  }

  object DnsRecord {
    @inline
    def apply(
        TTL: RecordTTL,
        Type: RecordType
    ): DnsRecord = {
      val __obj = js.Dynamic.literal(
        "TTL" -> TTL.asInstanceOf[js.Any],
        "Type" -> Type.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[DnsRecord]
    }
  }

  @js.native
  sealed trait FilterCondition extends js.Any
  object FilterCondition {
    val EQ = "EQ".asInstanceOf[FilterCondition]
    val IN = "IN".asInstanceOf[FilterCondition]
    val BETWEEN = "BETWEEN".asInstanceOf[FilterCondition]

    @inline def values = js.Array(EQ, IN, BETWEEN)
  }

  @js.native
  trait GetInstanceRequest extends js.Object {
    var InstanceId: ResourceId
    var ServiceId: ResourceId
  }

  object GetInstanceRequest {
    @inline
    def apply(
        InstanceId: ResourceId,
        ServiceId: ResourceId
    ): GetInstanceRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "ServiceId" -> ServiceId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetInstanceRequest]
    }
  }

  @js.native
  trait GetInstanceResponse extends js.Object {
    var Instance: js.UndefOr[Instance]
  }

  object GetInstanceResponse {
    @inline
    def apply(
        Instance: js.UndefOr[Instance] = js.undefined
    ): GetInstanceResponse = {
      val __obj = js.Dynamic.literal()
      Instance.foreach(__v => __obj.updateDynamic("Instance")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInstanceResponse]
    }
  }

  @js.native
  trait GetInstancesHealthStatusRequest extends js.Object {
    var ServiceId: ResourceId
    var Instances: js.UndefOr[InstanceIdList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetInstancesHealthStatusRequest {
    @inline
    def apply(
        ServiceId: ResourceId,
        Instances: js.UndefOr[InstanceIdList] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): GetInstancesHealthStatusRequest = {
      val __obj = js.Dynamic.literal(
        "ServiceId" -> ServiceId.asInstanceOf[js.Any]
      )

      Instances.foreach(__v => __obj.updateDynamic("Instances")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInstancesHealthStatusRequest]
    }
  }

  @js.native
  trait GetInstancesHealthStatusResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Status: js.UndefOr[InstanceHealthStatusMap]
  }

  object GetInstancesHealthStatusResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Status: js.UndefOr[InstanceHealthStatusMap] = js.undefined
    ): GetInstancesHealthStatusResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetInstancesHealthStatusResponse]
    }
  }

  @js.native
  trait GetNamespaceRequest extends js.Object {
    var Id: ResourceId
  }

  object GetNamespaceRequest {
    @inline
    def apply(
        Id: ResourceId
    ): GetNamespaceRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetNamespaceRequest]
    }
  }

  @js.native
  trait GetNamespaceResponse extends js.Object {
    var Namespace: js.UndefOr[Namespace]
  }

  object GetNamespaceResponse {
    @inline
    def apply(
        Namespace: js.UndefOr[Namespace] = js.undefined
    ): GetNamespaceResponse = {
      val __obj = js.Dynamic.literal()
      Namespace.foreach(__v => __obj.updateDynamic("Namespace")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetNamespaceResponse]
    }
  }

  @js.native
  trait GetOperationRequest extends js.Object {
    var OperationId: ResourceId
  }

  object GetOperationRequest {
    @inline
    def apply(
        OperationId: ResourceId
    ): GetOperationRequest = {
      val __obj = js.Dynamic.literal(
        "OperationId" -> OperationId.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetOperationRequest]
    }
  }

  @js.native
  trait GetOperationResponse extends js.Object {
    var Operation: js.UndefOr[Operation]
  }

  object GetOperationResponse {
    @inline
    def apply(
        Operation: js.UndefOr[Operation] = js.undefined
    ): GetOperationResponse = {
      val __obj = js.Dynamic.literal()
      Operation.foreach(__v => __obj.updateDynamic("Operation")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetOperationResponse]
    }
  }

  @js.native
  trait GetServiceRequest extends js.Object {
    var Id: ResourceId
  }

  object GetServiceRequest {
    @inline
    def apply(
        Id: ResourceId
    ): GetServiceRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[GetServiceRequest]
    }
  }

  @js.native
  trait GetServiceResponse extends js.Object {
    var Service: js.UndefOr[Service]
  }

  object GetServiceResponse {
    @inline
    def apply(
        Service: js.UndefOr[Service] = js.undefined
    ): GetServiceResponse = {
      val __obj = js.Dynamic.literal()
      Service.foreach(__v => __obj.updateDynamic("Service")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[GetServiceResponse]
    }
  }

  /**
    * <i>Public DNS and HTTP namespaces only.</i> A complex type that contains settings for an optional health check. If you specify settings for a health check, AWS Cloud Map associates the health check with the records that you specify in <code>DnsConfig</code>.
    *  <important> If you specify a health check configuration, you can specify either <code>HealthCheckCustomConfig</code> or <code>HealthCheckConfig</code> but not both.
    *  </important> Health checks are basic Route 53 health checks that monitor an AWS endpoint. For information about pricing for health checks, see [[http://aws.amazon.com/route53/pricing/|Amazon Route 53 Pricing]].
    *  Note the following about configuring health checks.
    *  <b> <code>A</code> and <code>AAAA</code> records</b>
    *  If <code>DnsConfig</code> includes configurations for both <code>A</code> and <code>AAAA</code> records, AWS Cloud Map creates a health check that uses the IPv4 address to check the health of the resource. If the endpoint that is specified by the IPv4 address is unhealthy, Route 53 considers both the <code>A</code> and <code>AAAA</code> records to be unhealthy.
    *  <b> <code>CNAME</code> records</b>
    *  You can't specify settings for <code>HealthCheckConfig</code> when the <code>DNSConfig</code> includes <code>CNAME</code> for the value of <code>Type</code>. If you do, the <code>CreateService</code> request will fail with an <code>InvalidInput</code> error.
    *  ```Request interval```
    *  A Route 53 health checker in each health-checking region sends a health check request to an endpoint every 30 seconds. On average, your endpoint receives a health check request about every two seconds. However, health checkers don't coordinate with one another, so you'll sometimes see several requests per second followed by a few seconds with no health checks at all.
    *  ```Health checking regions```
    *  Health checkers perform checks from all Route 53 health-checking regions. For a list of the current regions, see [[https://docs.aws.amazon.com/Route53/latest/APIReference/API_HealthCheckConfig.html#Route53-Type-HealthCheckConfig-Regions|Regions]].
    *  ```Alias records```
    *  When you register an instance, if you include the <code>AWS_ALIAS_DNS_NAME</code> attribute, AWS Cloud Map creates a Route 53 alias record. Note the following:
    * * Route 53 automatically sets <code>EvaluateTargetHealth</code> to true for alias records. When <code>EvaluateTargetHealth</code> is true, the alias record inherits the health of the referenced AWS resource. such as an ELB load balancer. For more information, see [[https://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html#Route53-Type-AliasTarget-EvaluateTargetHealth|EvaluateTargetHealth]].
    *  * If you include <code>HealthCheckConfig</code> and then use the service to register an instance that creates an alias record, Route 53 doesn't create the health check.
    * ```Charges for health checks```
    *  Health checks are basic Route 53 health checks that monitor an AWS endpoint. For information about pricing for health checks, see [[http://aws.amazon.com/route53/pricing/|Amazon Route 53 Pricing]].
    */
  @js.native
  trait HealthCheckConfig extends js.Object {
    var Type: HealthCheckType
    var FailureThreshold: js.UndefOr[FailureThreshold]
    var ResourcePath: js.UndefOr[ResourcePath]
  }

  object HealthCheckConfig {
    @inline
    def apply(
        Type: HealthCheckType,
        FailureThreshold: js.UndefOr[FailureThreshold] = js.undefined,
        ResourcePath: js.UndefOr[ResourcePath] = js.undefined
    ): HealthCheckConfig = {
      val __obj = js.Dynamic.literal(
        "Type" -> Type.asInstanceOf[js.Any]
      )

      FailureThreshold.foreach(__v => __obj.updateDynamic("FailureThreshold")(__v.asInstanceOf[js.Any]))
      ResourcePath.foreach(__v => __obj.updateDynamic("ResourcePath")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HealthCheckConfig]
    }
  }

  /**
    * A complex type that contains information about an optional custom health check. A custom health check, which requires that you use a third-party health checker to evaluate the health of your resources, is useful in the following circumstances:
    * * You can't use a health check that is defined by <code>HealthCheckConfig</code> because the resource isn't available over the internet. For example, you can use a custom health check when the instance is in an Amazon VPC. (To check the health of resources in a VPC, the health checker must also be in the VPC.)
    *  * You want to use a third-party health checker regardless of where your resources are.
    * <important> If you specify a health check configuration, you can specify either <code>HealthCheckCustomConfig</code> or <code>HealthCheckConfig</code> but not both.
    *  </important> To change the status of a custom health check, submit an <code>UpdateInstanceCustomHealthStatus</code> request. AWS Cloud Map doesn't monitor the status of the resource, it just keeps a record of the status specified in the most recent <code>UpdateInstanceCustomHealthStatus</code> request.
    *  Here's how custom health checks work:
    *  <ol> * You create a service and specify a value for <code>FailureThreshold</code>.
    *  The failure threshold indicates the number of 30-second intervals you want AWS Cloud Map to wait between the time that your application sends an [[https://docs.aws.amazon.com/cloud-map/latest/api/API_UpdateInstanceCustomHealthStatus.html|UpdateInstanceCustomHealthStatus]] request and the time that AWS Cloud Map stops routing internet traffic to the corresponding resource.
    *  * You register an instance.
    *  <li> You configure a third-party health checker to monitor the resource that is associated with the new instance.
    *
    * '''Note:'''AWS Cloud Map doesn't check the health of the resource directly.
    * </li> * The third-party health-checker determines that the resource is unhealthy and notifies your application.
    *  * Your application submits an <code>UpdateInstanceCustomHealthStatus</code> request.
    *  * AWS Cloud Map waits for (<code>FailureThreshold</code> x 30) seconds.
    *  * If another <code>UpdateInstanceCustomHealthStatus</code> request doesn't arrive during that time to change the status back to healthy, AWS Cloud Map stops routing traffic to the resource.
    *  </ol>
    */
  @js.native
  trait HealthCheckCustomConfig extends js.Object {
    var FailureThreshold: js.UndefOr[FailureThreshold]
  }

  object HealthCheckCustomConfig {
    @inline
    def apply(
        FailureThreshold: js.UndefOr[FailureThreshold] = js.undefined
    ): HealthCheckCustomConfig = {
      val __obj = js.Dynamic.literal()
      FailureThreshold.foreach(__v => __obj.updateDynamic("FailureThreshold")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HealthCheckCustomConfig]
    }
  }

  @js.native
  sealed trait HealthCheckType extends js.Any
  object HealthCheckType {
    val HTTP = "HTTP".asInstanceOf[HealthCheckType]
    val HTTPS = "HTTPS".asInstanceOf[HealthCheckType]
    val TCP = "TCP".asInstanceOf[HealthCheckType]

    @inline def values = js.Array(HTTP, HTTPS, TCP)
  }

  @js.native
  sealed trait HealthStatus extends js.Any
  object HealthStatus {
    val HEALTHY = "HEALTHY".asInstanceOf[HealthStatus]
    val UNHEALTHY = "UNHEALTHY".asInstanceOf[HealthStatus]
    val UNKNOWN = "UNKNOWN".asInstanceOf[HealthStatus]

    @inline def values = js.Array(HEALTHY, UNHEALTHY, UNKNOWN)
  }

  @js.native
  sealed trait HealthStatusFilter extends js.Any
  object HealthStatusFilter {
    val HEALTHY = "HEALTHY".asInstanceOf[HealthStatusFilter]
    val UNHEALTHY = "UNHEALTHY".asInstanceOf[HealthStatusFilter]
    val ALL = "ALL".asInstanceOf[HealthStatusFilter]

    @inline def values = js.Array(HEALTHY, UNHEALTHY, ALL)
  }

  /**
    * In a response to a [[https://docs.aws.amazon.com/cloud-map/latest/api/API_DiscoverInstances.html|DiscoverInstances]] request, <code>HttpInstanceSummary</code> contains information about one instance that matches the values that you specified in the request.
    */
  @js.native
  trait HttpInstanceSummary extends js.Object {
    var Attributes: js.UndefOr[Attributes]
    var HealthStatus: js.UndefOr[HealthStatus]
    var InstanceId: js.UndefOr[ResourceId]
    var NamespaceName: js.UndefOr[NamespaceName]
    var ServiceName: js.UndefOr[ServiceName]
  }

  object HttpInstanceSummary {
    @inline
    def apply(
        Attributes: js.UndefOr[Attributes] = js.undefined,
        HealthStatus: js.UndefOr[HealthStatus] = js.undefined,
        InstanceId: js.UndefOr[ResourceId] = js.undefined,
        NamespaceName: js.UndefOr[NamespaceName] = js.undefined,
        ServiceName: js.UndefOr[ServiceName] = js.undefined
    ): HttpInstanceSummary = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      HealthStatus.foreach(__v => __obj.updateDynamic("HealthStatus")(__v.asInstanceOf[js.Any]))
      InstanceId.foreach(__v => __obj.updateDynamic("InstanceId")(__v.asInstanceOf[js.Any]))
      NamespaceName.foreach(__v => __obj.updateDynamic("NamespaceName")(__v.asInstanceOf[js.Any]))
      ServiceName.foreach(__v => __obj.updateDynamic("ServiceName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HttpInstanceSummary]
    }
  }

  /**
    * A complex type that contains the name of an HTTP namespace.
    */
  @js.native
  trait HttpProperties extends js.Object {
    var HttpName: js.UndefOr[NamespaceName]
  }

  object HttpProperties {
    @inline
    def apply(
        HttpName: js.UndefOr[NamespaceName] = js.undefined
    ): HttpProperties = {
      val __obj = js.Dynamic.literal()
      HttpName.foreach(__v => __obj.updateDynamic("HttpName")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[HttpProperties]
    }
  }

  /**
    * A complex type that contains information about an instance that AWS Cloud Map creates when you submit a <code>RegisterInstance</code> request.
    */
  @js.native
  trait Instance extends js.Object {
    var Id: ResourceId
    var Attributes: js.UndefOr[Attributes]
    var CreatorRequestId: js.UndefOr[ResourceId]
  }

  object Instance {
    @inline
    def apply(
        Id: ResourceId,
        Attributes: js.UndefOr[Attributes] = js.undefined,
        CreatorRequestId: js.UndefOr[ResourceId] = js.undefined
    ): Instance = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any]
      )

      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      CreatorRequestId.foreach(__v => __obj.updateDynamic("CreatorRequestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Instance]
    }
  }

  /**
    * A complex type that contains information about the instances that you registered by using a specified service.
    */
  @js.native
  trait InstanceSummary extends js.Object {
    var Attributes: js.UndefOr[Attributes]
    var Id: js.UndefOr[ResourceId]
  }

  object InstanceSummary {
    @inline
    def apply(
        Attributes: js.UndefOr[Attributes] = js.undefined,
        Id: js.UndefOr[ResourceId] = js.undefined
    ): InstanceSummary = {
      val __obj = js.Dynamic.literal()
      Attributes.foreach(__v => __obj.updateDynamic("Attributes")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[InstanceSummary]
    }
  }

  @js.native
  trait ListInstancesRequest extends js.Object {
    var ServiceId: ResourceId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListInstancesRequest {
    @inline
    def apply(
        ServiceId: ResourceId,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListInstancesRequest = {
      val __obj = js.Dynamic.literal(
        "ServiceId" -> ServiceId.asInstanceOf[js.Any]
      )

      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInstancesRequest]
    }
  }

  @js.native
  trait ListInstancesResponse extends js.Object {
    var Instances: js.UndefOr[InstanceSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListInstancesResponse {
    @inline
    def apply(
        Instances: js.UndefOr[InstanceSummaryList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListInstancesResponse = {
      val __obj = js.Dynamic.literal()
      Instances.foreach(__v => __obj.updateDynamic("Instances")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListInstancesResponse]
    }
  }

  @js.native
  trait ListNamespacesRequest extends js.Object {
    var Filters: js.UndefOr[NamespaceFilters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListNamespacesRequest {
    @inline
    def apply(
        Filters: js.UndefOr[NamespaceFilters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListNamespacesRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNamespacesRequest]
    }
  }

  @js.native
  trait ListNamespacesResponse extends js.Object {
    var Namespaces: js.UndefOr[NamespaceSummariesList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListNamespacesResponse {
    @inline
    def apply(
        Namespaces: js.UndefOr[NamespaceSummariesList] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListNamespacesResponse = {
      val __obj = js.Dynamic.literal()
      Namespaces.foreach(__v => __obj.updateDynamic("Namespaces")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListNamespacesResponse]
    }
  }

  @js.native
  trait ListOperationsRequest extends js.Object {
    var Filters: js.UndefOr[OperationFilters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListOperationsRequest {
    @inline
    def apply(
        Filters: js.UndefOr[OperationFilters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListOperationsRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOperationsRequest]
    }
  }

  @js.native
  trait ListOperationsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Operations: js.UndefOr[OperationSummaryList]
  }

  object ListOperationsResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Operations: js.UndefOr[OperationSummaryList] = js.undefined
    ): ListOperationsResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Operations.foreach(__v => __obj.updateDynamic("Operations")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListOperationsResponse]
    }
  }

  @js.native
  trait ListServicesRequest extends js.Object {
    var Filters: js.UndefOr[ServiceFilters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListServicesRequest {
    @inline
    def apply(
        Filters: js.UndefOr[ServiceFilters] = js.undefined,
        MaxResults: js.UndefOr[MaxResults] = js.undefined,
        NextToken: js.UndefOr[NextToken] = js.undefined
    ): ListServicesRequest = {
      val __obj = js.Dynamic.literal()
      Filters.foreach(__v => __obj.updateDynamic("Filters")(__v.asInstanceOf[js.Any]))
      MaxResults.foreach(__v => __obj.updateDynamic("MaxResults")(__v.asInstanceOf[js.Any]))
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServicesRequest]
    }
  }

  @js.native
  trait ListServicesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Services: js.UndefOr[ServiceSummariesList]
  }

  object ListServicesResponse {
    @inline
    def apply(
        NextToken: js.UndefOr[NextToken] = js.undefined,
        Services: js.UndefOr[ServiceSummariesList] = js.undefined
    ): ListServicesResponse = {
      val __obj = js.Dynamic.literal()
      NextToken.foreach(__v => __obj.updateDynamic("NextToken")(__v.asInstanceOf[js.Any]))
      Services.foreach(__v => __obj.updateDynamic("Services")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListServicesResponse]
    }
  }

  @js.native
  trait ListTagsForResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
  }

  object ListTagsForResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName
    ): ListTagsForResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[ListTagsForResourceRequest]
    }
  }

  @js.native
  trait ListTagsForResourceResponse extends js.Object {
    var Tags: js.UndefOr[TagList]
  }

  object ListTagsForResourceResponse {
    @inline
    def apply(
        Tags: js.UndefOr[TagList] = js.undefined
    ): ListTagsForResourceResponse = {
      val __obj = js.Dynamic.literal()
      Tags.foreach(__v => __obj.updateDynamic("Tags")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ListTagsForResourceResponse]
    }
  }

  /**
    * A complex type that contains information about a specified namespace.
    */
  @js.native
  trait Namespace extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreateDate: js.UndefOr[Timestamp]
    var CreatorRequestId: js.UndefOr[ResourceId]
    var Description: js.UndefOr[ResourceDescription]
    var Id: js.UndefOr[ResourceId]
    var Name: js.UndefOr[NamespaceName]
    var Properties: js.UndefOr[NamespaceProperties]
    var ServiceCount: js.UndefOr[ResourceCount]
    var Type: js.UndefOr[NamespaceType]
  }

  object Namespace {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreateDate: js.UndefOr[Timestamp] = js.undefined,
        CreatorRequestId: js.UndefOr[ResourceId] = js.undefined,
        Description: js.UndefOr[ResourceDescription] = js.undefined,
        Id: js.UndefOr[ResourceId] = js.undefined,
        Name: js.UndefOr[NamespaceName] = js.undefined,
        Properties: js.UndefOr[NamespaceProperties] = js.undefined,
        ServiceCount: js.UndefOr[ResourceCount] = js.undefined,
        Type: js.UndefOr[NamespaceType] = js.undefined
    ): Namespace = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreateDate.foreach(__v => __obj.updateDynamic("CreateDate")(__v.asInstanceOf[js.Any]))
      CreatorRequestId.foreach(__v => __obj.updateDynamic("CreatorRequestId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Properties.foreach(__v => __obj.updateDynamic("Properties")(__v.asInstanceOf[js.Any]))
      ServiceCount.foreach(__v => __obj.updateDynamic("ServiceCount")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Namespace]
    }
  }

  /**
    * A complex type that identifies the namespaces that you want to list. You can choose to list public or private namespaces.
    */
  @js.native
  trait NamespaceFilter extends js.Object {
    var Name: NamespaceFilterName
    var Values: FilterValues
    var Condition: js.UndefOr[FilterCondition]
  }

  object NamespaceFilter {
    @inline
    def apply(
        Name: NamespaceFilterName,
        Values: FilterValues,
        Condition: js.UndefOr[FilterCondition] = js.undefined
    ): NamespaceFilter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )

      Condition.foreach(__v => __obj.updateDynamic("Condition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NamespaceFilter]
    }
  }

  @js.native
  sealed trait NamespaceFilterName extends js.Any
  object NamespaceFilterName {
    val TYPE = "TYPE".asInstanceOf[NamespaceFilterName]

    @inline def values = js.Array(TYPE)
  }

  /**
    * A complex type that contains information that is specific to the namespace type.
    */
  @js.native
  trait NamespaceProperties extends js.Object {
    var DnsProperties: js.UndefOr[DnsProperties]
    var HttpProperties: js.UndefOr[HttpProperties]
  }

  object NamespaceProperties {
    @inline
    def apply(
        DnsProperties: js.UndefOr[DnsProperties] = js.undefined,
        HttpProperties: js.UndefOr[HttpProperties] = js.undefined
    ): NamespaceProperties = {
      val __obj = js.Dynamic.literal()
      DnsProperties.foreach(__v => __obj.updateDynamic("DnsProperties")(__v.asInstanceOf[js.Any]))
      HttpProperties.foreach(__v => __obj.updateDynamic("HttpProperties")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NamespaceProperties]
    }
  }

  /**
    * A complex type that contains information about a namespace.
    */
  @js.native
  trait NamespaceSummary extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreateDate: js.UndefOr[Timestamp]
    var Description: js.UndefOr[ResourceDescription]
    var Id: js.UndefOr[ResourceId]
    var Name: js.UndefOr[NamespaceName]
    var Properties: js.UndefOr[NamespaceProperties]
    var ServiceCount: js.UndefOr[ResourceCount]
    var Type: js.UndefOr[NamespaceType]
  }

  object NamespaceSummary {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreateDate: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[ResourceDescription] = js.undefined,
        Id: js.UndefOr[ResourceId] = js.undefined,
        Name: js.UndefOr[NamespaceName] = js.undefined,
        Properties: js.UndefOr[NamespaceProperties] = js.undefined,
        ServiceCount: js.UndefOr[ResourceCount] = js.undefined,
        Type: js.UndefOr[NamespaceType] = js.undefined
    ): NamespaceSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreateDate.foreach(__v => __obj.updateDynamic("CreateDate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      Properties.foreach(__v => __obj.updateDynamic("Properties")(__v.asInstanceOf[js.Any]))
      ServiceCount.foreach(__v => __obj.updateDynamic("ServiceCount")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[NamespaceSummary]
    }
  }

  @js.native
  sealed trait NamespaceType extends js.Any
  object NamespaceType {
    val DNS_PUBLIC = "DNS_PUBLIC".asInstanceOf[NamespaceType]
    val DNS_PRIVATE = "DNS_PRIVATE".asInstanceOf[NamespaceType]
    val HTTP = "HTTP".asInstanceOf[NamespaceType]

    @inline def values = js.Array(DNS_PUBLIC, DNS_PRIVATE, HTTP)
  }

  /**
    * A complex type that contains information about a specified operation.
    */
  @js.native
  trait Operation extends js.Object {
    var CreateDate: js.UndefOr[Timestamp]
    var ErrorCode: js.UndefOr[Code]
    var ErrorMessage: js.UndefOr[Message]
    var Id: js.UndefOr[OperationId]
    var Status: js.UndefOr[OperationStatus]
    var Targets: js.UndefOr[OperationTargetsMap]
    var Type: js.UndefOr[OperationType]
    var UpdateDate: js.UndefOr[Timestamp]
  }

  object Operation {
    @inline
    def apply(
        CreateDate: js.UndefOr[Timestamp] = js.undefined,
        ErrorCode: js.UndefOr[Code] = js.undefined,
        ErrorMessage: js.UndefOr[Message] = js.undefined,
        Id: js.UndefOr[OperationId] = js.undefined,
        Status: js.UndefOr[OperationStatus] = js.undefined,
        Targets: js.UndefOr[OperationTargetsMap] = js.undefined,
        Type: js.UndefOr[OperationType] = js.undefined,
        UpdateDate: js.UndefOr[Timestamp] = js.undefined
    ): Operation = {
      val __obj = js.Dynamic.literal()
      CreateDate.foreach(__v => __obj.updateDynamic("CreateDate")(__v.asInstanceOf[js.Any]))
      ErrorCode.foreach(__v => __obj.updateDynamic("ErrorCode")(__v.asInstanceOf[js.Any]))
      ErrorMessage.foreach(__v => __obj.updateDynamic("ErrorMessage")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      Targets.foreach(__v => __obj.updateDynamic("Targets")(__v.asInstanceOf[js.Any]))
      Type.foreach(__v => __obj.updateDynamic("Type")(__v.asInstanceOf[js.Any]))
      UpdateDate.foreach(__v => __obj.updateDynamic("UpdateDate")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Operation]
    }
  }

  /**
    * A complex type that lets you select the operations that you want to list.
    */
  @js.native
  trait OperationFilter extends js.Object {
    var Name: OperationFilterName
    var Values: FilterValues
    var Condition: js.UndefOr[FilterCondition]
  }

  object OperationFilter {
    @inline
    def apply(
        Name: OperationFilterName,
        Values: FilterValues,
        Condition: js.UndefOr[FilterCondition] = js.undefined
    ): OperationFilter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )

      Condition.foreach(__v => __obj.updateDynamic("Condition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OperationFilter]
    }
  }

  @js.native
  sealed trait OperationFilterName extends js.Any
  object OperationFilterName {
    val NAMESPACE_ID = "NAMESPACE_ID".asInstanceOf[OperationFilterName]
    val SERVICE_ID = "SERVICE_ID".asInstanceOf[OperationFilterName]
    val STATUS = "STATUS".asInstanceOf[OperationFilterName]
    val TYPE = "TYPE".asInstanceOf[OperationFilterName]
    val UPDATE_DATE = "UPDATE_DATE".asInstanceOf[OperationFilterName]

    @inline def values = js.Array(NAMESPACE_ID, SERVICE_ID, STATUS, TYPE, UPDATE_DATE)
  }

  @js.native
  sealed trait OperationStatus extends js.Any
  object OperationStatus {
    val SUBMITTED = "SUBMITTED".asInstanceOf[OperationStatus]
    val PENDING = "PENDING".asInstanceOf[OperationStatus]
    val SUCCESS = "SUCCESS".asInstanceOf[OperationStatus]
    val FAIL = "FAIL".asInstanceOf[OperationStatus]

    @inline def values = js.Array(SUBMITTED, PENDING, SUCCESS, FAIL)
  }

  /**
    * A complex type that contains information about an operation that matches the criteria that you specified in a [[https://docs.aws.amazon.com/cloud-map/latest/api/API_ListOperations.html|ListOperations]] request.
    */
  @js.native
  trait OperationSummary extends js.Object {
    var Id: js.UndefOr[OperationId]
    var Status: js.UndefOr[OperationStatus]
  }

  object OperationSummary {
    @inline
    def apply(
        Id: js.UndefOr[OperationId] = js.undefined,
        Status: js.UndefOr[OperationStatus] = js.undefined
    ): OperationSummary = {
      val __obj = js.Dynamic.literal()
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      Status.foreach(__v => __obj.updateDynamic("Status")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[OperationSummary]
    }
  }

  @js.native
  sealed trait OperationTargetType extends js.Any
  object OperationTargetType {
    val NAMESPACE = "NAMESPACE".asInstanceOf[OperationTargetType]
    val SERVICE = "SERVICE".asInstanceOf[OperationTargetType]
    val INSTANCE = "INSTANCE".asInstanceOf[OperationTargetType]

    @inline def values = js.Array(NAMESPACE, SERVICE, INSTANCE)
  }

  @js.native
  sealed trait OperationType extends js.Any
  object OperationType {
    val CREATE_NAMESPACE = "CREATE_NAMESPACE".asInstanceOf[OperationType]
    val DELETE_NAMESPACE = "DELETE_NAMESPACE".asInstanceOf[OperationType]
    val UPDATE_SERVICE = "UPDATE_SERVICE".asInstanceOf[OperationType]
    val REGISTER_INSTANCE = "REGISTER_INSTANCE".asInstanceOf[OperationType]
    val DEREGISTER_INSTANCE = "DEREGISTER_INSTANCE".asInstanceOf[OperationType]

    @inline def values = js.Array(CREATE_NAMESPACE, DELETE_NAMESPACE, UPDATE_SERVICE, REGISTER_INSTANCE, DEREGISTER_INSTANCE)
  }

  @js.native
  sealed trait RecordType extends js.Any
  object RecordType {
    val SRV = "SRV".asInstanceOf[RecordType]
    val A = "A".asInstanceOf[RecordType]
    val AAAA = "AAAA".asInstanceOf[RecordType]
    val CNAME = "CNAME".asInstanceOf[RecordType]

    @inline def values = js.Array(SRV, A, AAAA, CNAME)
  }

  @js.native
  trait RegisterInstanceRequest extends js.Object {
    var Attributes: Attributes
    var InstanceId: ResourceId
    var ServiceId: ResourceId
    var CreatorRequestId: js.UndefOr[ResourceId]
  }

  object RegisterInstanceRequest {
    @inline
    def apply(
        Attributes: Attributes,
        InstanceId: ResourceId,
        ServiceId: ResourceId,
        CreatorRequestId: js.UndefOr[ResourceId] = js.undefined
    ): RegisterInstanceRequest = {
      val __obj = js.Dynamic.literal(
        "Attributes" -> Attributes.asInstanceOf[js.Any],
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "ServiceId" -> ServiceId.asInstanceOf[js.Any]
      )

      CreatorRequestId.foreach(__v => __obj.updateDynamic("CreatorRequestId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterInstanceRequest]
    }
  }

  @js.native
  trait RegisterInstanceResponse extends js.Object {
    var OperationId: js.UndefOr[OperationId]
  }

  object RegisterInstanceResponse {
    @inline
    def apply(
        OperationId: js.UndefOr[OperationId] = js.undefined
    ): RegisterInstanceResponse = {
      val __obj = js.Dynamic.literal()
      OperationId.foreach(__v => __obj.updateDynamic("OperationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[RegisterInstanceResponse]
    }
  }

  @js.native
  sealed trait RoutingPolicy extends js.Any
  object RoutingPolicy {
    val MULTIVALUE = "MULTIVALUE".asInstanceOf[RoutingPolicy]
    val WEIGHTED = "WEIGHTED".asInstanceOf[RoutingPolicy]

    @inline def values = js.Array(MULTIVALUE, WEIGHTED)
  }

  /**
    * A complex type that contains information about the specified service.
    */
  @js.native
  trait Service extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreateDate: js.UndefOr[Timestamp]
    var CreatorRequestId: js.UndefOr[ResourceId]
    var Description: js.UndefOr[ResourceDescription]
    var DnsConfig: js.UndefOr[DnsConfig]
    var HealthCheckConfig: js.UndefOr[HealthCheckConfig]
    var HealthCheckCustomConfig: js.UndefOr[HealthCheckCustomConfig]
    var Id: js.UndefOr[ResourceId]
    var InstanceCount: js.UndefOr[ResourceCount]
    var Name: js.UndefOr[ServiceName]
    var NamespaceId: js.UndefOr[ResourceId]
  }

  object Service {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreateDate: js.UndefOr[Timestamp] = js.undefined,
        CreatorRequestId: js.UndefOr[ResourceId] = js.undefined,
        Description: js.UndefOr[ResourceDescription] = js.undefined,
        DnsConfig: js.UndefOr[DnsConfig] = js.undefined,
        HealthCheckConfig: js.UndefOr[HealthCheckConfig] = js.undefined,
        HealthCheckCustomConfig: js.UndefOr[HealthCheckCustomConfig] = js.undefined,
        Id: js.UndefOr[ResourceId] = js.undefined,
        InstanceCount: js.UndefOr[ResourceCount] = js.undefined,
        Name: js.UndefOr[ServiceName] = js.undefined,
        NamespaceId: js.UndefOr[ResourceId] = js.undefined
    ): Service = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreateDate.foreach(__v => __obj.updateDynamic("CreateDate")(__v.asInstanceOf[js.Any]))
      CreatorRequestId.foreach(__v => __obj.updateDynamic("CreatorRequestId")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DnsConfig.foreach(__v => __obj.updateDynamic("DnsConfig")(__v.asInstanceOf[js.Any]))
      HealthCheckConfig.foreach(__v => __obj.updateDynamic("HealthCheckConfig")(__v.asInstanceOf[js.Any]))
      HealthCheckCustomConfig.foreach(__v => __obj.updateDynamic("HealthCheckCustomConfig")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      InstanceCount.foreach(__v => __obj.updateDynamic("InstanceCount")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      NamespaceId.foreach(__v => __obj.updateDynamic("NamespaceId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[Service]
    }
  }

  /**
    * A complex type that contains changes to an existing service.
    */
  @js.native
  trait ServiceChange extends js.Object {
    var Description: js.UndefOr[ResourceDescription]
    var DnsConfig: js.UndefOr[DnsConfigChange]
    var HealthCheckConfig: js.UndefOr[HealthCheckConfig]
  }

  object ServiceChange {
    @inline
    def apply(
        Description: js.UndefOr[ResourceDescription] = js.undefined,
        DnsConfig: js.UndefOr[DnsConfigChange] = js.undefined,
        HealthCheckConfig: js.UndefOr[HealthCheckConfig] = js.undefined
    ): ServiceChange = {
      val __obj = js.Dynamic.literal()
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DnsConfig.foreach(__v => __obj.updateDynamic("DnsConfig")(__v.asInstanceOf[js.Any]))
      HealthCheckConfig.foreach(__v => __obj.updateDynamic("HealthCheckConfig")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceChange]
    }
  }

  /**
    * A complex type that lets you specify the namespaces that you want to list services for.
    */
  @js.native
  trait ServiceFilter extends js.Object {
    var Name: ServiceFilterName
    var Values: FilterValues
    var Condition: js.UndefOr[FilterCondition]
  }

  object ServiceFilter {
    @inline
    def apply(
        Name: ServiceFilterName,
        Values: FilterValues,
        Condition: js.UndefOr[FilterCondition] = js.undefined
    ): ServiceFilter = {
      val __obj = js.Dynamic.literal(
        "Name" -> Name.asInstanceOf[js.Any],
        "Values" -> Values.asInstanceOf[js.Any]
      )

      Condition.foreach(__v => __obj.updateDynamic("Condition")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceFilter]
    }
  }

  @js.native
  sealed trait ServiceFilterName extends js.Any
  object ServiceFilterName {
    val NAMESPACE_ID = "NAMESPACE_ID".asInstanceOf[ServiceFilterName]

    @inline def values = js.Array(NAMESPACE_ID)
  }

  /**
    * A complex type that contains information about a specified service.
    */
  @js.native
  trait ServiceSummary extends js.Object {
    var Arn: js.UndefOr[Arn]
    var CreateDate: js.UndefOr[Timestamp]
    var Description: js.UndefOr[ResourceDescription]
    var DnsConfig: js.UndefOr[DnsConfig]
    var HealthCheckConfig: js.UndefOr[HealthCheckConfig]
    var HealthCheckCustomConfig: js.UndefOr[HealthCheckCustomConfig]
    var Id: js.UndefOr[ResourceId]
    var InstanceCount: js.UndefOr[ResourceCount]
    var Name: js.UndefOr[ServiceName]
  }

  object ServiceSummary {
    @inline
    def apply(
        Arn: js.UndefOr[Arn] = js.undefined,
        CreateDate: js.UndefOr[Timestamp] = js.undefined,
        Description: js.UndefOr[ResourceDescription] = js.undefined,
        DnsConfig: js.UndefOr[DnsConfig] = js.undefined,
        HealthCheckConfig: js.UndefOr[HealthCheckConfig] = js.undefined,
        HealthCheckCustomConfig: js.UndefOr[HealthCheckCustomConfig] = js.undefined,
        Id: js.UndefOr[ResourceId] = js.undefined,
        InstanceCount: js.UndefOr[ResourceCount] = js.undefined,
        Name: js.UndefOr[ServiceName] = js.undefined
    ): ServiceSummary = {
      val __obj = js.Dynamic.literal()
      Arn.foreach(__v => __obj.updateDynamic("Arn")(__v.asInstanceOf[js.Any]))
      CreateDate.foreach(__v => __obj.updateDynamic("CreateDate")(__v.asInstanceOf[js.Any]))
      Description.foreach(__v => __obj.updateDynamic("Description")(__v.asInstanceOf[js.Any]))
      DnsConfig.foreach(__v => __obj.updateDynamic("DnsConfig")(__v.asInstanceOf[js.Any]))
      HealthCheckConfig.foreach(__v => __obj.updateDynamic("HealthCheckConfig")(__v.asInstanceOf[js.Any]))
      HealthCheckCustomConfig.foreach(__v => __obj.updateDynamic("HealthCheckCustomConfig")(__v.asInstanceOf[js.Any]))
      Id.foreach(__v => __obj.updateDynamic("Id")(__v.asInstanceOf[js.Any]))
      InstanceCount.foreach(__v => __obj.updateDynamic("InstanceCount")(__v.asInstanceOf[js.Any]))
      Name.foreach(__v => __obj.updateDynamic("Name")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[ServiceSummary]
    }
  }

  /**
    * A custom key-value pair associated with a resource.
    */
  @js.native
  trait Tag extends js.Object {
    var Key: TagKey
    var Value: TagValue
  }

  object Tag {
    @inline
    def apply(
        Key: TagKey,
        Value: TagValue
    ): Tag = {
      val __obj = js.Dynamic.literal(
        "Key" -> Key.asInstanceOf[js.Any],
        "Value" -> Value.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[Tag]
    }
  }

  @js.native
  trait TagResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
    var Tags: TagList
  }

  object TagResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
        Tags: TagList
    ): TagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "Tags" -> Tags.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[TagResourceRequest]
    }
  }

  @js.native
  trait TagResourceResponse extends js.Object {}

  object TagResourceResponse {
    @inline
    def apply(
    ): TagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[TagResourceResponse]
    }
  }

  @js.native
  trait UntagResourceRequest extends js.Object {
    var ResourceARN: AmazonResourceName
    var TagKeys: TagKeyList
  }

  object UntagResourceRequest {
    @inline
    def apply(
        ResourceARN: AmazonResourceName,
        TagKeys: TagKeyList
    ): UntagResourceRequest = {
      val __obj = js.Dynamic.literal(
        "ResourceARN" -> ResourceARN.asInstanceOf[js.Any],
        "TagKeys" -> TagKeys.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UntagResourceRequest]
    }
  }

  @js.native
  trait UntagResourceResponse extends js.Object {}

  object UntagResourceResponse {
    @inline
    def apply(
    ): UntagResourceResponse = {
      val __obj = js.Dynamic.literal()

      __obj.asInstanceOf[UntagResourceResponse]
    }
  }

  @js.native
  trait UpdateInstanceCustomHealthStatusRequest extends js.Object {
    var InstanceId: ResourceId
    var ServiceId: ResourceId
    var Status: CustomHealthStatus
  }

  object UpdateInstanceCustomHealthStatusRequest {
    @inline
    def apply(
        InstanceId: ResourceId,
        ServiceId: ResourceId,
        Status: CustomHealthStatus
    ): UpdateInstanceCustomHealthStatusRequest = {
      val __obj = js.Dynamic.literal(
        "InstanceId" -> InstanceId.asInstanceOf[js.Any],
        "ServiceId" -> ServiceId.asInstanceOf[js.Any],
        "Status" -> Status.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateInstanceCustomHealthStatusRequest]
    }
  }

  @js.native
  trait UpdateServiceRequest extends js.Object {
    var Id: ResourceId
    var Service: ServiceChange
  }

  object UpdateServiceRequest {
    @inline
    def apply(
        Id: ResourceId,
        Service: ServiceChange
    ): UpdateServiceRequest = {
      val __obj = js.Dynamic.literal(
        "Id" -> Id.asInstanceOf[js.Any],
        "Service" -> Service.asInstanceOf[js.Any]
      )

      __obj.asInstanceOf[UpdateServiceRequest]
    }
  }

  @js.native
  trait UpdateServiceResponse extends js.Object {
    var OperationId: js.UndefOr[OperationId]
  }

  object UpdateServiceResponse {
    @inline
    def apply(
        OperationId: js.UndefOr[OperationId] = js.undefined
    ): UpdateServiceResponse = {
      val __obj = js.Dynamic.literal()
      OperationId.foreach(__v => __obj.updateDynamic("OperationId")(__v.asInstanceOf[js.Any]))
      __obj.asInstanceOf[UpdateServiceResponse]
    }
  }
}
