package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import io.scalajs.nodejs
import facade.amazonaws._

package object servicediscovery {
  type Arn = String
  type AttrKey = String
  type AttrValue = String
  type Attributes = js.Dictionary[AttrValue]
  type Code = String
  type CustomHealthStatus = String
  type DnsRecordList = js.Array[DnsRecord]
  type ErrorMessage = String
  type FailureThreshold = Int
  type FilterCondition = String
  type FilterValue = String
  type FilterValues = js.Array[FilterValue]
  type HealthCheckType = String
  type HealthStatus = String
  type InstanceHealthStatusMap = js.Dictionary[HealthStatus]
  type InstanceIdList = js.Array[ResourceId]
  type InstanceSummaryList = js.Array[InstanceSummary]
  type MaxResults = Int
  type Message = String
  type NamespaceFilterName = String
  type NamespaceFilters = js.Array[NamespaceFilter]
  type NamespaceName = String
  type NamespaceSummariesList = js.Array[NamespaceSummary]
  type NamespaceType = String
  type NextToken = String
  type OperationFilterName = String
  type OperationFilters = js.Array[OperationFilter]
  type OperationId = String
  type OperationStatus = String
  type OperationSummaryList = js.Array[OperationSummary]
  type OperationTargetType = String
  type OperationTargetsMap = js.Dictionary[ResourceId]
  type OperationType = String
  type RecordTTL = Double
  type RecordType = String
  type ResourceCount = Int
  type ResourceDescription = String
  type ResourceId = String
  type ResourcePath = String
  type RoutingPolicy = String
  type ServiceFilterName = String
  type ServiceFilters = js.Array[ServiceFilter]
  type ServiceName = String
  type ServiceSummariesList = js.Array[ServiceSummary]
  type Timestamp = js.Date
}

package servicediscovery {
  @js.native
  @JSImport("aws-sdk", "ServiceDiscovery")
  class ServiceDiscovery(config: AWSConfig) extends js.Object {
    def createPrivateDnsNamespace(params: CreatePrivateDnsNamespaceRequest): Request[CreatePrivateDnsNamespaceResponse] = js.native
    def createPublicDnsNamespace(params: CreatePublicDnsNamespaceRequest): Request[CreatePublicDnsNamespaceResponse] = js.native
    def createService(params: CreateServiceRequest): Request[CreateServiceResponse] = js.native
    def deleteNamespace(params: DeleteNamespaceRequest): Request[DeleteNamespaceResponse] = js.native
    def deleteService(params: DeleteServiceRequest): Request[DeleteServiceResponse] = js.native
    def deregisterInstance(params: DeregisterInstanceRequest): Request[DeregisterInstanceResponse] = js.native
    def getInstance(params: GetInstanceRequest): Request[GetInstanceResponse] = js.native
    def getInstancesHealthStatus(params: GetInstancesHealthStatusRequest): Request[GetInstancesHealthStatusResponse] = js.native
    def getNamespace(params: GetNamespaceRequest): Request[GetNamespaceResponse] = js.native
    def getOperation(params: GetOperationRequest): Request[GetOperationResponse] = js.native
    def getService(params: GetServiceRequest): Request[GetServiceResponse] = js.native
    def listInstances(params: ListInstancesRequest): Request[ListInstancesResponse] = js.native
    def listNamespaces(params: ListNamespacesRequest): Request[ListNamespacesResponse] = js.native
    def listOperations(params: ListOperationsRequest): Request[ListOperationsResponse] = js.native
    def listServices(params: ListServicesRequest): Request[ListServicesResponse] = js.native
    def registerInstance(params: RegisterInstanceRequest): Request[RegisterInstanceResponse] = js.native
    def updateInstanceCustomHealthStatus(params: UpdateInstanceCustomHealthStatusRequest): Request[js.Object] = js.native
    def updateService(params: UpdateServiceRequest): Request[UpdateServiceResponse] = js.native
  }

  @js.native
  trait CreatePrivateDnsNamespaceRequest extends js.Object {
    var Name: js.UndefOr[NamespaceName]
    var CreatorRequestId: js.UndefOr[ResourceId]
    var Description: js.UndefOr[ResourceDescription]
    var Vpc: js.UndefOr[ResourceId]
  }

  object CreatePrivateDnsNamespaceRequest {
    def apply(
      Name: js.UndefOr[NamespaceName] = js.undefined,
      CreatorRequestId: js.UndefOr[ResourceId] = js.undefined,
      Description: js.UndefOr[ResourceDescription] = js.undefined,
      Vpc: js.UndefOr[ResourceId] = js.undefined): CreatePrivateDnsNamespaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "CreatorRequestId" -> CreatorRequestId.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Vpc" -> Vpc.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePrivateDnsNamespaceRequest]
    }
  }

  @js.native
  trait CreatePrivateDnsNamespaceResponse extends js.Object {
    var OperationId: js.UndefOr[OperationId]
  }

  object CreatePrivateDnsNamespaceResponse {
    def apply(
      OperationId: js.UndefOr[OperationId] = js.undefined): CreatePrivateDnsNamespaceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OperationId" -> OperationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePrivateDnsNamespaceResponse]
    }
  }

  @js.native
  trait CreatePublicDnsNamespaceRequest extends js.Object {
    var Name: js.UndefOr[NamespaceName]
    var CreatorRequestId: js.UndefOr[ResourceId]
    var Description: js.UndefOr[ResourceDescription]
  }

  object CreatePublicDnsNamespaceRequest {
    def apply(
      Name: js.UndefOr[NamespaceName] = js.undefined,
      CreatorRequestId: js.UndefOr[ResourceId] = js.undefined,
      Description: js.UndefOr[ResourceDescription] = js.undefined): CreatePublicDnsNamespaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "CreatorRequestId" -> CreatorRequestId.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePublicDnsNamespaceRequest]
    }
  }

  @js.native
  trait CreatePublicDnsNamespaceResponse extends js.Object {
    var OperationId: js.UndefOr[OperationId]
  }

  object CreatePublicDnsNamespaceResponse {
    def apply(
      OperationId: js.UndefOr[OperationId] = js.undefined): CreatePublicDnsNamespaceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OperationId" -> OperationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreatePublicDnsNamespaceResponse]
    }
  }

  @js.native
  trait CreateServiceRequest extends js.Object {
    var Name: js.UndefOr[ServiceName]
    var Description: js.UndefOr[ResourceDescription]
    var DnsConfig: js.UndefOr[DnsConfig]
    var CreatorRequestId: js.UndefOr[ResourceId]
    var HealthCheckConfig: js.UndefOr[HealthCheckConfig]
    var HealthCheckCustomConfig: js.UndefOr[HealthCheckCustomConfig]
  }

  object CreateServiceRequest {
    def apply(
      Name: js.UndefOr[ServiceName] = js.undefined,
      Description: js.UndefOr[ResourceDescription] = js.undefined,
      DnsConfig: js.UndefOr[DnsConfig] = js.undefined,
      CreatorRequestId: js.UndefOr[ResourceId] = js.undefined,
      HealthCheckConfig: js.UndefOr[HealthCheckConfig] = js.undefined,
      HealthCheckCustomConfig: js.UndefOr[HealthCheckCustomConfig] = js.undefined): CreateServiceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "DnsConfig" -> DnsConfig.map { x => x.asInstanceOf[js.Any] },
        "CreatorRequestId" -> CreatorRequestId.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckConfig" -> HealthCheckConfig.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckCustomConfig" -> HealthCheckCustomConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateServiceRequest]
    }
  }

  @js.native
  trait CreateServiceResponse extends js.Object {
    var Service: js.UndefOr[Service]
  }

  object CreateServiceResponse {
    def apply(
      Service: js.UndefOr[Service] = js.undefined): CreateServiceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Service" -> Service.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[CreateServiceResponse]
    }
  }

  @js.native
  trait CustomHealthNotFoundException extends js.Object {
    val Message: ErrorMessage
  }

  object CustomHealthStatusEnum {
    val HEALTHY = "HEALTHY"
    val UNHEALTHY = "UNHEALTHY"

    val values = IndexedSeq(HEALTHY, UNHEALTHY)
  }

  @js.native
  trait DeleteNamespaceRequest extends js.Object {
    var Id: js.UndefOr[ResourceId]
  }

  object DeleteNamespaceRequest {
    def apply(
      Id: js.UndefOr[ResourceId] = js.undefined): DeleteNamespaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteNamespaceRequest]
    }
  }

  @js.native
  trait DeleteNamespaceResponse extends js.Object {
    var OperationId: js.UndefOr[OperationId]
  }

  object DeleteNamespaceResponse {
    def apply(
      OperationId: js.UndefOr[OperationId] = js.undefined): DeleteNamespaceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OperationId" -> OperationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteNamespaceResponse]
    }
  }

  @js.native
  trait DeleteServiceRequest extends js.Object {
    var Id: js.UndefOr[ResourceId]
  }

  object DeleteServiceRequest {
    def apply(
      Id: js.UndefOr[ResourceId] = js.undefined): DeleteServiceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteServiceRequest]
    }
  }

  @js.native
  trait DeleteServiceResponse extends js.Object {

  }

  object DeleteServiceResponse {
    def apply(): DeleteServiceResponse = {
      val _fields = IndexedSeq[(String, js.Any)]().filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeleteServiceResponse]
    }
  }

  @js.native
  trait DeregisterInstanceRequest extends js.Object {
    var ServiceId: js.UndefOr[ResourceId]
    var InstanceId: js.UndefOr[ResourceId]
  }

  object DeregisterInstanceRequest {
    def apply(
      ServiceId: js.UndefOr[ResourceId] = js.undefined,
      InstanceId: js.UndefOr[ResourceId] = js.undefined): DeregisterInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceId" -> ServiceId.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterInstanceRequest]
    }
  }

  @js.native
  trait DeregisterInstanceResponse extends js.Object {
    var OperationId: js.UndefOr[OperationId]
  }

  object DeregisterInstanceResponse {
    def apply(
      OperationId: js.UndefOr[OperationId] = js.undefined): DeregisterInstanceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OperationId" -> OperationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DeregisterInstanceResponse]
    }
  }

  /**
   * <p>A complex type that contains information about the records that you want Amazon Route 53 to create when you register an instance.</p>
   */
  @js.native
  trait DnsConfig extends js.Object {
    var NamespaceId: js.UndefOr[ResourceId]
    var RoutingPolicy: js.UndefOr[RoutingPolicy]
    var DnsRecords: js.UndefOr[DnsRecordList]
  }

  object DnsConfig {
    def apply(
      NamespaceId: js.UndefOr[ResourceId] = js.undefined,
      RoutingPolicy: js.UndefOr[RoutingPolicy] = js.undefined,
      DnsRecords: js.UndefOr[DnsRecordList] = js.undefined): DnsConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NamespaceId" -> NamespaceId.map { x => x.asInstanceOf[js.Any] },
        "RoutingPolicy" -> RoutingPolicy.map { x => x.asInstanceOf[js.Any] },
        "DnsRecords" -> DnsRecords.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DnsConfig]
    }
  }

  /**
   * <p>A complex type that contains information about changes to the records that Route 53 creates when you register an instance.</p>
   */
  @js.native
  trait DnsConfigChange extends js.Object {
    var DnsRecords: js.UndefOr[DnsRecordList]
  }

  object DnsConfigChange {
    def apply(
      DnsRecords: js.UndefOr[DnsRecordList] = js.undefined): DnsConfigChange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DnsRecords" -> DnsRecords.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DnsConfigChange]
    }
  }

  /**
   * <p>A complex type that contains the ID for the hosted zone that Route 53 creates when you create a namespace.</p>
   */
  @js.native
  trait DnsProperties extends js.Object {
    var HostedZoneId: js.UndefOr[ResourceId]
  }

  object DnsProperties {
    def apply(
      HostedZoneId: js.UndefOr[ResourceId] = js.undefined): DnsProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "HostedZoneId" -> HostedZoneId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DnsProperties]
    }
  }

  /**
   * <p>A complex type that contains information about the records that you want Route 53 to create when you register an instance.</p>
   */
  @js.native
  trait DnsRecord extends js.Object {
    var Type: js.UndefOr[RecordType]
    var TTL: js.UndefOr[RecordTTL]
  }

  object DnsRecord {
    def apply(
      Type: js.UndefOr[RecordType] = js.undefined,
      TTL: js.UndefOr[RecordTTL] = js.undefined): DnsRecord = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "TTL" -> TTL.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[DnsRecord]
    }
  }

  /**
   * <p>The operation is already in progress.</p>
   */
  @js.native
  trait DuplicateRequestException extends js.Object {
    val Message: ErrorMessage
  }

  object FilterConditionEnum {
    val EQ = "EQ"
    val IN = "IN"
    val BETWEEN = "BETWEEN"

    val values = IndexedSeq(EQ, IN, BETWEEN)
  }

  @js.native
  trait GetInstanceRequest extends js.Object {
    var ServiceId: js.UndefOr[ResourceId]
    var InstanceId: js.UndefOr[ResourceId]
  }

  object GetInstanceRequest {
    def apply(
      ServiceId: js.UndefOr[ResourceId] = js.undefined,
      InstanceId: js.UndefOr[ResourceId] = js.undefined): GetInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceId" -> ServiceId.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceRequest]
    }
  }

  @js.native
  trait GetInstanceResponse extends js.Object {
    var Instance: js.UndefOr[Instance]
  }

  object GetInstanceResponse {
    def apply(
      Instance: js.UndefOr[Instance] = js.undefined): GetInstanceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Instance" -> Instance.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstanceResponse]
    }
  }

  @js.native
  trait GetInstancesHealthStatusRequest extends js.Object {
    var ServiceId: js.UndefOr[ResourceId]
    var Instances: js.UndefOr[InstanceIdList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetInstancesHealthStatusRequest {
    def apply(
      ServiceId: js.UndefOr[ResourceId] = js.undefined,
      Instances: js.UndefOr[InstanceIdList] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): GetInstancesHealthStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceId" -> ServiceId.map { x => x.asInstanceOf[js.Any] },
        "Instances" -> Instances.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstancesHealthStatusRequest]
    }
  }

  @js.native
  trait GetInstancesHealthStatusResponse extends js.Object {
    var Status: js.UndefOr[InstanceHealthStatusMap]
    var NextToken: js.UndefOr[NextToken]
  }

  object GetInstancesHealthStatusResponse {
    def apply(
      Status: js.UndefOr[InstanceHealthStatusMap] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): GetInstancesHealthStatusResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetInstancesHealthStatusResponse]
    }
  }

  @js.native
  trait GetNamespaceRequest extends js.Object {
    var Id: js.UndefOr[ResourceId]
  }

  object GetNamespaceRequest {
    def apply(
      Id: js.UndefOr[ResourceId] = js.undefined): GetNamespaceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetNamespaceRequest]
    }
  }

  @js.native
  trait GetNamespaceResponse extends js.Object {
    var Namespace: js.UndefOr[Namespace]
  }

  object GetNamespaceResponse {
    def apply(
      Namespace: js.UndefOr[Namespace] = js.undefined): GetNamespaceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Namespace" -> Namespace.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetNamespaceResponse]
    }
  }

  @js.native
  trait GetOperationRequest extends js.Object {
    var OperationId: js.UndefOr[ResourceId]
  }

  object GetOperationRequest {
    def apply(
      OperationId: js.UndefOr[ResourceId] = js.undefined): GetOperationRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OperationId" -> OperationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOperationRequest]
    }
  }

  @js.native
  trait GetOperationResponse extends js.Object {
    var Operation: js.UndefOr[Operation]
  }

  object GetOperationResponse {
    def apply(
      Operation: js.UndefOr[Operation] = js.undefined): GetOperationResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Operation" -> Operation.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetOperationResponse]
    }
  }

  @js.native
  trait GetServiceRequest extends js.Object {
    var Id: js.UndefOr[ResourceId]
  }

  object GetServiceRequest {
    def apply(
      Id: js.UndefOr[ResourceId] = js.undefined): GetServiceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetServiceRequest]
    }
  }

  @js.native
  trait GetServiceResponse extends js.Object {
    var Service: js.UndefOr[Service]
  }

  object GetServiceResponse {
    def apply(
      Service: js.UndefOr[Service] = js.undefined): GetServiceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Service" -> Service.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[GetServiceResponse]
    }
  }

  /**
   * <p> <i>Public DNS namespaces only.</i> A complex type that contains settings for an optional health check. If you specify settings for a health check, Amazon Route 53 associates the health check with all the records that you specify in <code>DnsConfig</code>.</p> <p> <b>A and AAAA records</b> </p> <p>If <code>DnsConfig</code> includes configurations for both A and AAAA records, Route 53 creates a health check that uses the IPv4 address to check the health of the resource. If the endpoint that is specified by the IPv4 address is unhealthy, Route 53 considers both the A and AAAA records to be unhealthy. </p> <p> <b>CNAME records</b> </p> <p>You can't specify settings for <code>HealthCheckConfig</code> when the <code>DNSConfig</code> includes <code>CNAME</code> for the value of <code>Type</code>. If you do, the <code>CreateService</code> request will fail with an <code>InvalidInput</code> error.</p> <p> <b>Request interval</b> </p> <p>The health check uses 30 seconds as the request interval. This is the number of seconds between the time that each Route 53 health checker gets a response from your endpoint and the time that it sends the next health check request. A health checker in each data center around the world sends your endpoint a health check request every 30 seconds. On average, your endpoint receives a health check request about every two seconds. Health checkers in different data centers don't coordinate with one another, so you'll sometimes see several requests per second followed by a few seconds with no health checks at all.</p> <p> <b>Health checking regions</b> </p> <p>Health checkers perform checks from all Route 53 health-checking regions. For a list of the current regions, see <a href="http://docs.aws.amazon.com/Route53/latest/APIReference/API_HealthCheckConfig.html#Route53-Type-HealthCheckConfig-Regions">Regions</a>.</p> <p> <b>Alias records</b> </p> <p>When you register an instance, if you include the <code>AWS_ALIAS_DNS_NAME</code> attribute, Route 53 creates an alias record. Note the following:</p> <ul> <li> <p>Route 53 automatically sets <code>EvaluateTargetHealth</code> to true for alias records. When <code>EvaluateTargetHealth</code> is true, the alias record inherits the health of the referenced AWS resource. such as an ELB load balancer. For more information, see <a href="http://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html#Route53-Type-AliasTarget-EvaluateTargetHealth">EvaluateTargetHealth</a>.</p> </li> <li> <p>If you include <code>HealthCheckConfig</code> and then use the service to register an instance that creates an alias record, Route 53 doesn't create the health check.</p> </li> </ul> <p>For information about the charges for health checks, see <a href="http://aws.amazon.com/route53/pricing">Route 53 Pricing</a>.</p>
   */
  @js.native
  trait HealthCheckConfig extends js.Object {
    var Type: js.UndefOr[HealthCheckType]
    var ResourcePath: js.UndefOr[ResourcePath]
    var FailureThreshold: js.UndefOr[FailureThreshold]
  }

  object HealthCheckConfig {
    def apply(
      Type: js.UndefOr[HealthCheckType] = js.undefined,
      ResourcePath: js.UndefOr[ResourcePath] = js.undefined,
      FailureThreshold: js.UndefOr[FailureThreshold] = js.undefined): HealthCheckConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] },
        "ResourcePath" -> ResourcePath.map { x => x.asInstanceOf[js.Any] },
        "FailureThreshold" -> FailureThreshold.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HealthCheckConfig]
    }
  }

  @js.native
  trait HealthCheckCustomConfig extends js.Object {
    var FailureThreshold: js.UndefOr[FailureThreshold]
  }

  object HealthCheckCustomConfig {
    def apply(
      FailureThreshold: js.UndefOr[FailureThreshold] = js.undefined): HealthCheckCustomConfig = {
      val _fields = IndexedSeq[(String, js.Any)](
        "FailureThreshold" -> FailureThreshold.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[HealthCheckCustomConfig]
    }
  }

  object HealthCheckTypeEnum {
    val HTTP = "HTTP"
    val HTTPS = "HTTPS"
    val TCP = "TCP"

    val values = IndexedSeq(HTTP, HTTPS, TCP)
  }

  object HealthStatusEnum {
    val HEALTHY = "HEALTHY"
    val UNHEALTHY = "UNHEALTHY"
    val UNKNOWN = "UNKNOWN"

    val values = IndexedSeq(HEALTHY, UNHEALTHY, UNKNOWN)
  }

  /**
   * <p>A complex type that contains information about an instance that Amazon Route 53 creates when you submit a <code>RegisterInstance</code> request.</p>
   */
  @js.native
  trait Instance extends js.Object {
    var Id: js.UndefOr[ResourceId]
    var CreatorRequestId: js.UndefOr[ResourceId]
    var Attributes: js.UndefOr[Attributes]
  }

  object Instance {
    def apply(
      Id: js.UndefOr[ResourceId] = js.undefined,
      CreatorRequestId: js.UndefOr[ResourceId] = js.undefined,
      Attributes: js.UndefOr[Attributes] = js.undefined): Instance = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "CreatorRequestId" -> CreatorRequestId.map { x => x.asInstanceOf[js.Any] },
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Instance]
    }
  }

  /**
   * <p>No instance exists with the specified ID, or the instance was recently registered, and information about the instance hasn't propagated yet.</p>
   */
  @js.native
  trait InstanceNotFoundException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * <p>A complex type that contains information about the instances that you registered by using a specified service.</p>
   */
  @js.native
  trait InstanceSummary extends js.Object {
    var Id: js.UndefOr[ResourceId]
    var Attributes: js.UndefOr[Attributes]
  }

  object InstanceSummary {
    def apply(
      Id: js.UndefOr[ResourceId] = js.undefined,
      Attributes: js.UndefOr[Attributes] = js.undefined): InstanceSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[InstanceSummary]
    }
  }

  /**
   * <p>One or more specified values aren't valid. For example, when you're creating a namespace, the value of <code>Name</code> might not be a valid DNS name.</p>
   */
  @js.native
  trait InvalidInputException extends js.Object {
    val Message: ErrorMessage
  }

  @js.native
  trait ListInstancesRequest extends js.Object {
    var ServiceId: js.UndefOr[ResourceId]
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
  }

  object ListInstancesRequest {
    def apply(
      ServiceId: js.UndefOr[ResourceId] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined): ListInstancesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceId" -> ServiceId.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInstancesRequest]
    }
  }

  @js.native
  trait ListInstancesResponse extends js.Object {
    var Instances: js.UndefOr[InstanceSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListInstancesResponse {
    def apply(
      Instances: js.UndefOr[InstanceSummaryList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListInstancesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Instances" -> Instances.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListInstancesResponse]
    }
  }

  @js.native
  trait ListNamespacesRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
    var Filters: js.UndefOr[NamespaceFilters]
  }

  object ListNamespacesRequest {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      Filters: js.UndefOr[NamespaceFilters] = js.undefined): ListNamespacesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListNamespacesRequest]
    }
  }

  @js.native
  trait ListNamespacesResponse extends js.Object {
    var Namespaces: js.UndefOr[NamespaceSummariesList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListNamespacesResponse {
    def apply(
      Namespaces: js.UndefOr[NamespaceSummariesList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListNamespacesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Namespaces" -> Namespaces.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListNamespacesResponse]
    }
  }

  @js.native
  trait ListOperationsRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
    var Filters: js.UndefOr[OperationFilters]
  }

  object ListOperationsRequest {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      Filters: js.UndefOr[OperationFilters] = js.undefined): ListOperationsRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOperationsRequest]
    }
  }

  @js.native
  trait ListOperationsResponse extends js.Object {
    var Operations: js.UndefOr[OperationSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListOperationsResponse {
    def apply(
      Operations: js.UndefOr[OperationSummaryList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListOperationsResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Operations" -> Operations.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListOperationsResponse]
    }
  }

  @js.native
  trait ListServicesRequest extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var MaxResults: js.UndefOr[MaxResults]
    var Filters: js.UndefOr[ServiceFilters]
  }

  object ListServicesRequest {
    def apply(
      NextToken: js.UndefOr[NextToken] = js.undefined,
      MaxResults: js.UndefOr[MaxResults] = js.undefined,
      Filters: js.UndefOr[ServiceFilters] = js.undefined): ListServicesRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] },
        "MaxResults" -> MaxResults.map { x => x.asInstanceOf[js.Any] },
        "Filters" -> Filters.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListServicesRequest]
    }
  }

  @js.native
  trait ListServicesResponse extends js.Object {
    var Services: js.UndefOr[ServiceSummariesList]
    var NextToken: js.UndefOr[NextToken]
  }

  object ListServicesResponse {
    def apply(
      Services: js.UndefOr[ServiceSummariesList] = js.undefined,
      NextToken: js.UndefOr[NextToken] = js.undefined): ListServicesResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Services" -> Services.map { x => x.asInstanceOf[js.Any] },
        "NextToken" -> NextToken.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ListServicesResponse]
    }
  }

  /**
   * <p>A complex type that contains information about a specified namespace.</p>
   */
  @js.native
  trait Namespace extends js.Object {
    var Properties: js.UndefOr[NamespaceProperties]
    var Id: js.UndefOr[ResourceId]
    var Name: js.UndefOr[NamespaceName]
    var Description: js.UndefOr[ResourceDescription]
    var Arn: js.UndefOr[Arn]
    var CreateDate: js.UndefOr[Timestamp]
    var ServiceCount: js.UndefOr[ResourceCount]
    var CreatorRequestId: js.UndefOr[ResourceId]
    var Type: js.UndefOr[NamespaceType]
  }

  object Namespace {
    def apply(
      Properties: js.UndefOr[NamespaceProperties] = js.undefined,
      Id: js.UndefOr[ResourceId] = js.undefined,
      Name: js.UndefOr[NamespaceName] = js.undefined,
      Description: js.UndefOr[ResourceDescription] = js.undefined,
      Arn: js.UndefOr[Arn] = js.undefined,
      CreateDate: js.UndefOr[Timestamp] = js.undefined,
      ServiceCount: js.UndefOr[ResourceCount] = js.undefined,
      CreatorRequestId: js.UndefOr[ResourceId] = js.undefined,
      Type: js.UndefOr[NamespaceType] = js.undefined): Namespace = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Properties" -> Properties.map { x => x.asInstanceOf[js.Any] },
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "CreateDate" -> CreateDate.map { x => x.asInstanceOf[js.Any] },
        "ServiceCount" -> ServiceCount.map { x => x.asInstanceOf[js.Any] },
        "CreatorRequestId" -> CreatorRequestId.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Namespace]
    }
  }

  /**
   * <p>The namespace that you're trying to create already exists.</p>
   */
  @js.native
  trait NamespaceAlreadyExistsException extends js.Object {
    val Message: ErrorMessage
    val CreatorRequestId: ResourceId
    val NamespaceId: ResourceId
  }

  /**
   * <p>A complex type that identifies the namespaces that you want to list. You can choose to list public or private namespaces.</p>
   */
  @js.native
  trait NamespaceFilter extends js.Object {
    var Name: js.UndefOr[NamespaceFilterName]
    var Values: js.UndefOr[FilterValues]
    var Condition: js.UndefOr[FilterCondition]
  }

  object NamespaceFilter {
    def apply(
      Name: js.UndefOr[NamespaceFilterName] = js.undefined,
      Values: js.UndefOr[FilterValues] = js.undefined,
      Condition: js.UndefOr[FilterCondition] = js.undefined): NamespaceFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] },
        "Condition" -> Condition.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NamespaceFilter]
    }
  }

  object NamespaceFilterNameEnum {
    val TYPE = "TYPE"

    val values = IndexedSeq(TYPE)
  }

  /**
   * <p>No namespace exists with the specified ID.</p>
   */
  @js.native
  trait NamespaceNotFoundException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * <p>A complex type that contains information that is specific to the namespace type.</p>
   */
  @js.native
  trait NamespaceProperties extends js.Object {
    var DnsProperties: js.UndefOr[DnsProperties]
  }

  object NamespaceProperties {
    def apply(
      DnsProperties: js.UndefOr[DnsProperties] = js.undefined): NamespaceProperties = {
      val _fields = IndexedSeq[(String, js.Any)](
        "DnsProperties" -> DnsProperties.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NamespaceProperties]
    }
  }

  /**
   * <p>A complex type that contains information about a namespace.</p>
   */
  @js.native
  trait NamespaceSummary extends js.Object {
    var Id: js.UndefOr[ResourceId]
    var Arn: js.UndefOr[Arn]
    var Name: js.UndefOr[NamespaceName]
    var Type: js.UndefOr[NamespaceType]
  }

  object NamespaceSummary {
    def apply(
      Id: js.UndefOr[ResourceId] = js.undefined,
      Arn: js.UndefOr[Arn] = js.undefined,
      Name: js.UndefOr[NamespaceName] = js.undefined,
      Type: js.UndefOr[NamespaceType] = js.undefined): NamespaceSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[NamespaceSummary]
    }
  }

  object NamespaceTypeEnum {
    val DNS_PUBLIC = "DNS_PUBLIC"
    val DNS_PRIVATE = "DNS_PRIVATE"

    val values = IndexedSeq(DNS_PUBLIC, DNS_PRIVATE)
  }

  /**
   * <p>A complex type that contains information about a specified operation.</p>
   */
  @js.native
  trait Operation extends js.Object {
    var Id: js.UndefOr[OperationId]
    var ErrorCode: js.UndefOr[Code]
    var UpdateDate: js.UndefOr[Timestamp]
    var CreateDate: js.UndefOr[Timestamp]
    var Targets: js.UndefOr[OperationTargetsMap]
    var ErrorMessage: js.UndefOr[Message]
    var Status: js.UndefOr[OperationStatus]
    var Type: js.UndefOr[OperationType]
  }

  object Operation {
    def apply(
      Id: js.UndefOr[OperationId] = js.undefined,
      ErrorCode: js.UndefOr[Code] = js.undefined,
      UpdateDate: js.UndefOr[Timestamp] = js.undefined,
      CreateDate: js.UndefOr[Timestamp] = js.undefined,
      Targets: js.UndefOr[OperationTargetsMap] = js.undefined,
      ErrorMessage: js.UndefOr[Message] = js.undefined,
      Status: js.UndefOr[OperationStatus] = js.undefined,
      Type: js.UndefOr[OperationType] = js.undefined): Operation = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "ErrorCode" -> ErrorCode.map { x => x.asInstanceOf[js.Any] },
        "UpdateDate" -> UpdateDate.map { x => x.asInstanceOf[js.Any] },
        "CreateDate" -> CreateDate.map { x => x.asInstanceOf[js.Any] },
        "Targets" -> Targets.map { x => x.asInstanceOf[js.Any] },
        "ErrorMessage" -> ErrorMessage.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] },
        "Type" -> Type.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Operation]
    }
  }

  /**
   * <p>A complex type that lets you select the operations that you want to list.</p>
   */
  @js.native
  trait OperationFilter extends js.Object {
    var Name: js.UndefOr[OperationFilterName]
    var Values: js.UndefOr[FilterValues]
    var Condition: js.UndefOr[FilterCondition]
  }

  object OperationFilter {
    def apply(
      Name: js.UndefOr[OperationFilterName] = js.undefined,
      Values: js.UndefOr[FilterValues] = js.undefined,
      Condition: js.UndefOr[FilterCondition] = js.undefined): OperationFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] },
        "Condition" -> Condition.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OperationFilter]
    }
  }

  object OperationFilterNameEnum {
    val NAMESPACE_ID = "NAMESPACE_ID"
    val SERVICE_ID = "SERVICE_ID"
    val STATUS = "STATUS"
    val TYPE = "TYPE"
    val UPDATE_DATE = "UPDATE_DATE"

    val values = IndexedSeq(NAMESPACE_ID, SERVICE_ID, STATUS, TYPE, UPDATE_DATE)
  }

  /**
   * <p>No operation exists with the specified ID.</p>
   */
  @js.native
  trait OperationNotFoundException extends js.Object {
    val Message: ErrorMessage
  }

  object OperationStatusEnum {
    val SUBMITTED = "SUBMITTED"
    val PENDING = "PENDING"
    val SUCCESS = "SUCCESS"
    val FAIL = "FAIL"

    val values = IndexedSeq(SUBMITTED, PENDING, SUCCESS, FAIL)
  }

  /**
   * <p>A complex type that contains information about an operation that matches the criteria that you specified in a <a>ListOperations</a> request.</p>
   */
  @js.native
  trait OperationSummary extends js.Object {
    var Id: js.UndefOr[OperationId]
    var Status: js.UndefOr[OperationStatus]
  }

  object OperationSummary {
    def apply(
      Id: js.UndefOr[OperationId] = js.undefined,
      Status: js.UndefOr[OperationStatus] = js.undefined): OperationSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[OperationSummary]
    }
  }

  object OperationTargetTypeEnum {
    val NAMESPACE = "NAMESPACE"
    val SERVICE = "SERVICE"
    val INSTANCE = "INSTANCE"

    val values = IndexedSeq(NAMESPACE, SERVICE, INSTANCE)
  }

  object OperationTypeEnum {
    val CREATE_NAMESPACE = "CREATE_NAMESPACE"
    val DELETE_NAMESPACE = "DELETE_NAMESPACE"
    val UPDATE_SERVICE = "UPDATE_SERVICE"
    val REGISTER_INSTANCE = "REGISTER_INSTANCE"
    val DEREGISTER_INSTANCE = "DEREGISTER_INSTANCE"

    val values = IndexedSeq(CREATE_NAMESPACE, DELETE_NAMESPACE, UPDATE_SERVICE, REGISTER_INSTANCE, DEREGISTER_INSTANCE)
  }

  object RecordTypeEnum {
    val SRV = "SRV"
    val A = "A"
    val AAAA = "AAAA"
    val CNAME = "CNAME"

    val values = IndexedSeq(SRV, A, AAAA, CNAME)
  }

  @js.native
  trait RegisterInstanceRequest extends js.Object {
    var ServiceId: js.UndefOr[ResourceId]
    var InstanceId: js.UndefOr[ResourceId]
    var CreatorRequestId: js.UndefOr[ResourceId]
    var Attributes: js.UndefOr[Attributes]
  }

  object RegisterInstanceRequest {
    def apply(
      ServiceId: js.UndefOr[ResourceId] = js.undefined,
      InstanceId: js.UndefOr[ResourceId] = js.undefined,
      CreatorRequestId: js.UndefOr[ResourceId] = js.undefined,
      Attributes: js.UndefOr[Attributes] = js.undefined): RegisterInstanceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceId" -> ServiceId.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "CreatorRequestId" -> CreatorRequestId.map { x => x.asInstanceOf[js.Any] },
        "Attributes" -> Attributes.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterInstanceRequest]
    }
  }

  @js.native
  trait RegisterInstanceResponse extends js.Object {
    var OperationId: js.UndefOr[OperationId]
  }

  object RegisterInstanceResponse {
    def apply(
      OperationId: js.UndefOr[OperationId] = js.undefined): RegisterInstanceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OperationId" -> OperationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[RegisterInstanceResponse]
    }
  }

  /**
   * <p>The specified resource can't be deleted because it contains other resources. For example, you can't delete a service that contains any instances.</p>
   */
  @js.native
  trait ResourceInUseException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * <p>The resource can't be created because you've reached the limit on the number of resources.</p>
   */
  @js.native
  trait ResourceLimitExceededException extends js.Object {
    val Message: ErrorMessage
  }

  object RoutingPolicyEnum {
    val MULTIVALUE = "MULTIVALUE"
    val WEIGHTED = "WEIGHTED"

    val values = IndexedSeq(MULTIVALUE, WEIGHTED)
  }

  /**
   * <p>A complex type that contains information about the specified service.</p>
   */
  @js.native
  trait Service extends js.Object {
    var Id: js.UndefOr[ResourceId]
    var Name: js.UndefOr[ServiceName]
    var Description: js.UndefOr[ResourceDescription]
    var InstanceCount: js.UndefOr[ResourceCount]
    var DnsConfig: js.UndefOr[DnsConfig]
    var Arn: js.UndefOr[Arn]
    var CreateDate: js.UndefOr[Timestamp]
    var CreatorRequestId: js.UndefOr[ResourceId]
    var HealthCheckConfig: js.UndefOr[HealthCheckConfig]
    var HealthCheckCustomConfig: js.UndefOr[HealthCheckCustomConfig]
  }

  object Service {
    def apply(
      Id: js.UndefOr[ResourceId] = js.undefined,
      Name: js.UndefOr[ServiceName] = js.undefined,
      Description: js.UndefOr[ResourceDescription] = js.undefined,
      InstanceCount: js.UndefOr[ResourceCount] = js.undefined,
      DnsConfig: js.UndefOr[DnsConfig] = js.undefined,
      Arn: js.UndefOr[Arn] = js.undefined,
      CreateDate: js.UndefOr[Timestamp] = js.undefined,
      CreatorRequestId: js.UndefOr[ResourceId] = js.undefined,
      HealthCheckConfig: js.UndefOr[HealthCheckConfig] = js.undefined,
      HealthCheckCustomConfig: js.UndefOr[HealthCheckCustomConfig] = js.undefined): Service = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "InstanceCount" -> InstanceCount.map { x => x.asInstanceOf[js.Any] },
        "DnsConfig" -> DnsConfig.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] },
        "CreateDate" -> CreateDate.map { x => x.asInstanceOf[js.Any] },
        "CreatorRequestId" -> CreatorRequestId.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckConfig" -> HealthCheckConfig.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckCustomConfig" -> HealthCheckCustomConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[Service]
    }
  }

  /**
   * <p>The service can't be created because a service with the same name already exists.</p>
   */
  @js.native
  trait ServiceAlreadyExistsException extends js.Object {
    val Message: ErrorMessage
    val CreatorRequestId: ResourceId
    val ServiceId: ResourceId
  }

  /**
   * <p>A complex type that contains changes to an existing service.</p>
   */
  @js.native
  trait ServiceChange extends js.Object {
    var Description: js.UndefOr[ResourceDescription]
    var DnsConfig: js.UndefOr[DnsConfigChange]
    var HealthCheckConfig: js.UndefOr[HealthCheckConfig]
  }

  object ServiceChange {
    def apply(
      Description: js.UndefOr[ResourceDescription] = js.undefined,
      DnsConfig: js.UndefOr[DnsConfigChange] = js.undefined,
      HealthCheckConfig: js.UndefOr[HealthCheckConfig] = js.undefined): ServiceChange = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "DnsConfig" -> DnsConfig.map { x => x.asInstanceOf[js.Any] },
        "HealthCheckConfig" -> HealthCheckConfig.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServiceChange]
    }
  }

  /**
   * <p>A complex type that lets you specify the namespaces that you want to list services for.</p>
   */
  @js.native
  trait ServiceFilter extends js.Object {
    var Name: js.UndefOr[ServiceFilterName]
    var Values: js.UndefOr[FilterValues]
    var Condition: js.UndefOr[FilterCondition]
  }

  object ServiceFilter {
    def apply(
      Name: js.UndefOr[ServiceFilterName] = js.undefined,
      Values: js.UndefOr[FilterValues] = js.undefined,
      Condition: js.UndefOr[FilterCondition] = js.undefined): ServiceFilter = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Values" -> Values.map { x => x.asInstanceOf[js.Any] },
        "Condition" -> Condition.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServiceFilter]
    }
  }

  object ServiceFilterNameEnum {
    val NAMESPACE_ID = "NAMESPACE_ID"

    val values = IndexedSeq(NAMESPACE_ID)
  }

  /**
   * <p>No service exists with the specified ID.</p>
   */
  @js.native
  trait ServiceNotFoundException extends js.Object {
    val Message: ErrorMessage
  }

  /**
   * <p>A complex type that contains information about a specified service.</p>
   */
  @js.native
  trait ServiceSummary extends js.Object {
    var Id: js.UndefOr[ResourceId]
    var Name: js.UndefOr[ServiceName]
    var Description: js.UndefOr[ResourceDescription]
    var InstanceCount: js.UndefOr[ResourceCount]
    var Arn: js.UndefOr[Arn]
  }

  object ServiceSummary {
    def apply(
      Id: js.UndefOr[ResourceId] = js.undefined,
      Name: js.UndefOr[ServiceName] = js.undefined,
      Description: js.UndefOr[ResourceDescription] = js.undefined,
      InstanceCount: js.UndefOr[ResourceCount] = js.undefined,
      Arn: js.UndefOr[Arn] = js.undefined): ServiceSummary = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Name" -> Name.map { x => x.asInstanceOf[js.Any] },
        "Description" -> Description.map { x => x.asInstanceOf[js.Any] },
        "InstanceCount" -> InstanceCount.map { x => x.asInstanceOf[js.Any] },
        "Arn" -> Arn.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[ServiceSummary]
    }
  }

  @js.native
  trait UpdateInstanceCustomHealthStatusRequest extends js.Object {
    var ServiceId: js.UndefOr[ResourceId]
    var InstanceId: js.UndefOr[ResourceId]
    var Status: js.UndefOr[CustomHealthStatus]
  }

  object UpdateInstanceCustomHealthStatusRequest {
    def apply(
      ServiceId: js.UndefOr[ResourceId] = js.undefined,
      InstanceId: js.UndefOr[ResourceId] = js.undefined,
      Status: js.UndefOr[CustomHealthStatus] = js.undefined): UpdateInstanceCustomHealthStatusRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "ServiceId" -> ServiceId.map { x => x.asInstanceOf[js.Any] },
        "InstanceId" -> InstanceId.map { x => x.asInstanceOf[js.Any] },
        "Status" -> Status.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateInstanceCustomHealthStatusRequest]
    }
  }

  @js.native
  trait UpdateServiceRequest extends js.Object {
    var Id: js.UndefOr[ResourceId]
    var Service: js.UndefOr[ServiceChange]
  }

  object UpdateServiceRequest {
    def apply(
      Id: js.UndefOr[ResourceId] = js.undefined,
      Service: js.UndefOr[ServiceChange] = js.undefined): UpdateServiceRequest = {
      val _fields = IndexedSeq[(String, js.Any)](
        "Id" -> Id.map { x => x.asInstanceOf[js.Any] },
        "Service" -> Service.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateServiceRequest]
    }
  }

  @js.native
  trait UpdateServiceResponse extends js.Object {
    var OperationId: js.UndefOr[OperationId]
  }

  object UpdateServiceResponse {
    def apply(
      OperationId: js.UndefOr[OperationId] = js.undefined): UpdateServiceResponse = {
      val _fields = IndexedSeq[(String, js.Any)](
        "OperationId" -> OperationId.map { x => x.asInstanceOf[js.Any] }).filter(_._2 != (js.undefined: js.Any))

      js.Dynamic.literal.applyDynamicNamed("apply")(_fields: _*).asInstanceOf[UpdateServiceResponse]
    }
  }
}
