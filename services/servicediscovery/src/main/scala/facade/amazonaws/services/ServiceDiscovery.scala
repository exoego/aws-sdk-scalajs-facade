package facade.amazonaws.services

import scalajs._
import scalajs.js.annotation.JSImport
import scala.scalajs.js.|
import scala.concurrent.Future
import facade.amazonaws._
import net.exoego.scalajs.types.util.Factory

package object servicediscovery {
  type Arn                     = String
  type AttrKey                 = String
  type AttrValue               = String
  type Attributes              = js.Dictionary[AttrValue]
  type Code                    = String
  type DnsRecordList           = js.Array[DnsRecord]
  type FailureThreshold        = Int
  type FilterValue             = String
  type FilterValues            = js.Array[FilterValue]
  type HttpInstanceSummaryList = js.Array[HttpInstanceSummary]
  type InstanceHealthStatusMap = js.Dictionary[HealthStatus]
  type InstanceIdList          = js.Array[ResourceId]
  type InstanceSummaryList     = js.Array[InstanceSummary]
  type MaxResults              = Int
  type Message                 = String
  type NamespaceFilters        = js.Array[NamespaceFilter]
  type NamespaceName           = String
  type NamespaceSummariesList  = js.Array[NamespaceSummary]
  type NextToken               = String
  type OperationFilters        = js.Array[OperationFilter]
  type OperationId             = String
  type OperationSummaryList    = js.Array[OperationSummary]
  type OperationTargetsMap     = js.Dictionary[ResourceId]
  type RecordTTL               = Double
  type ResourceCount           = Int
  type ResourceDescription     = String
  type ResourceId              = String
  type ResourcePath            = String
  type ServiceFilters          = js.Array[ServiceFilter]
  type ServiceName             = String
  type ServiceSummariesList    = js.Array[ServiceSummary]
  type Timestamp               = js.Date

  implicit final class ServiceDiscoveryOps(private val service: ServiceDiscovery) extends AnyVal {

    @inline def createHttpNamespaceFuture(params: CreateHttpNamespaceRequest): Future[CreateHttpNamespaceResponse] =
      service.createHttpNamespace(params).promise().toFuture
    @inline def createPrivateDnsNamespaceFuture(
        params: CreatePrivateDnsNamespaceRequest
    ): Future[CreatePrivateDnsNamespaceResponse] = service.createPrivateDnsNamespace(params).promise().toFuture
    @inline def createPublicDnsNamespaceFuture(
        params: CreatePublicDnsNamespaceRequest
    ): Future[CreatePublicDnsNamespaceResponse] = service.createPublicDnsNamespace(params).promise().toFuture
    @inline def createServiceFuture(params: CreateServiceRequest): Future[CreateServiceResponse] =
      service.createService(params).promise().toFuture
    @inline def deleteNamespaceFuture(params: DeleteNamespaceRequest): Future[DeleteNamespaceResponse] =
      service.deleteNamespace(params).promise().toFuture
    @inline def deleteServiceFuture(params: DeleteServiceRequest): Future[DeleteServiceResponse] =
      service.deleteService(params).promise().toFuture
    @inline def deregisterInstanceFuture(params: DeregisterInstanceRequest): Future[DeregisterInstanceResponse] =
      service.deregisterInstance(params).promise().toFuture
    @inline def discoverInstancesFuture(params: DiscoverInstancesRequest): Future[DiscoverInstancesResponse] =
      service.discoverInstances(params).promise().toFuture
    @inline def getInstanceFuture(params: GetInstanceRequest): Future[GetInstanceResponse] =
      service.getInstance(params).promise().toFuture
    @inline def getInstancesHealthStatusFuture(
        params: GetInstancesHealthStatusRequest
    ): Future[GetInstancesHealthStatusResponse] = service.getInstancesHealthStatus(params).promise().toFuture
    @inline def getNamespaceFuture(params: GetNamespaceRequest): Future[GetNamespaceResponse] =
      service.getNamespace(params).promise().toFuture
    @inline def getOperationFuture(params: GetOperationRequest): Future[GetOperationResponse] =
      service.getOperation(params).promise().toFuture
    @inline def getServiceFuture(params: GetServiceRequest): Future[GetServiceResponse] =
      service.getService(params).promise().toFuture
    @inline def listInstancesFuture(params: ListInstancesRequest): Future[ListInstancesResponse] =
      service.listInstances(params).promise().toFuture
    @inline def listNamespacesFuture(params: ListNamespacesRequest): Future[ListNamespacesResponse] =
      service.listNamespaces(params).promise().toFuture
    @inline def listOperationsFuture(params: ListOperationsRequest): Future[ListOperationsResponse] =
      service.listOperations(params).promise().toFuture
    @inline def listServicesFuture(params: ListServicesRequest): Future[ListServicesResponse] =
      service.listServices(params).promise().toFuture
    @inline def registerInstanceFuture(params: RegisterInstanceRequest): Future[RegisterInstanceResponse] =
      service.registerInstance(params).promise().toFuture
    @inline def updateInstanceCustomHealthStatusFuture(
        params: UpdateInstanceCustomHealthStatusRequest
    ): Future[js.Object] = service.updateInstanceCustomHealthStatus(params).promise().toFuture
    @inline def updateServiceFuture(params: UpdateServiceRequest): Future[UpdateServiceResponse] =
      service.updateService(params).promise().toFuture
  }
}

package servicediscovery {
  @js.native
  @JSImport("aws-sdk", "ServiceDiscovery")
  class ServiceDiscovery() extends js.Object {
    def this(config: AWSConfig) = this()

    def createHttpNamespace(params: CreateHttpNamespaceRequest): Request[CreateHttpNamespaceResponse] = js.native
    def createPrivateDnsNamespace(
        params: CreatePrivateDnsNamespaceRequest
    ): Request[CreatePrivateDnsNamespaceResponse] = js.native
    def createPublicDnsNamespace(params: CreatePublicDnsNamespaceRequest): Request[CreatePublicDnsNamespaceResponse] =
      js.native
    def createService(params: CreateServiceRequest): Request[CreateServiceResponse]                = js.native
    def deleteNamespace(params: DeleteNamespaceRequest): Request[DeleteNamespaceResponse]          = js.native
    def deleteService(params: DeleteServiceRequest): Request[DeleteServiceResponse]                = js.native
    def deregisterInstance(params: DeregisterInstanceRequest): Request[DeregisterInstanceResponse] = js.native
    def discoverInstances(params: DiscoverInstancesRequest): Request[DiscoverInstancesResponse]    = js.native
    def getInstance(params: GetInstanceRequest): Request[GetInstanceResponse]                      = js.native
    def getInstancesHealthStatus(params: GetInstancesHealthStatusRequest): Request[GetInstancesHealthStatusResponse] =
      js.native
    def getNamespace(params: GetNamespaceRequest): Request[GetNamespaceResponse]             = js.native
    def getOperation(params: GetOperationRequest): Request[GetOperationResponse]             = js.native
    def getService(params: GetServiceRequest): Request[GetServiceResponse]                   = js.native
    def listInstances(params: ListInstancesRequest): Request[ListInstancesResponse]          = js.native
    def listNamespaces(params: ListNamespacesRequest): Request[ListNamespacesResponse]       = js.native
    def listOperations(params: ListOperationsRequest): Request[ListOperationsResponse]       = js.native
    def listServices(params: ListServicesRequest): Request[ListServicesResponse]             = js.native
    def registerInstance(params: RegisterInstanceRequest): Request[RegisterInstanceResponse] = js.native
    def updateInstanceCustomHealthStatus(params: UpdateInstanceCustomHealthStatusRequest): Request[js.Object] =
      js.native
    def updateService(params: UpdateServiceRequest): Request[UpdateServiceResponse] = js.native
  }

  @js.native
  @Factory
  trait CreateHttpNamespaceRequest extends js.Object {
    var Name: NamespaceName
    var CreatorRequestId: js.UndefOr[ResourceId]
    var Description: js.UndefOr[ResourceDescription]
  }

  @js.native
  @Factory
  trait CreateHttpNamespaceResponse extends js.Object {
    var OperationId: js.UndefOr[OperationId]
  }

  @js.native
  @Factory
  trait CreatePrivateDnsNamespaceRequest extends js.Object {
    var Name: NamespaceName
    var Vpc: ResourceId
    var CreatorRequestId: js.UndefOr[ResourceId]
    var Description: js.UndefOr[ResourceDescription]
  }

  @js.native
  @Factory
  trait CreatePrivateDnsNamespaceResponse extends js.Object {
    var OperationId: js.UndefOr[OperationId]
  }

  @js.native
  @Factory
  trait CreatePublicDnsNamespaceRequest extends js.Object {
    var Name: NamespaceName
    var CreatorRequestId: js.UndefOr[ResourceId]
    var Description: js.UndefOr[ResourceDescription]
  }

  @js.native
  @Factory
  trait CreatePublicDnsNamespaceResponse extends js.Object {
    var OperationId: js.UndefOr[OperationId]
  }

  @js.native
  @Factory
  trait CreateServiceRequest extends js.Object {
    var Name: ServiceName
    var CreatorRequestId: js.UndefOr[ResourceId]
    var Description: js.UndefOr[ResourceDescription]
    var DnsConfig: js.UndefOr[DnsConfig]
    var HealthCheckConfig: js.UndefOr[HealthCheckConfig]
    var HealthCheckCustomConfig: js.UndefOr[HealthCheckCustomConfig]
    var NamespaceId: js.UndefOr[ResourceId]
  }

  @js.native
  @Factory
  trait CreateServiceResponse extends js.Object {
    var Service: js.UndefOr[Service]
  }

  @js.native
  sealed trait CustomHealthStatus extends js.Any
  object CustomHealthStatus extends js.Object {
    val HEALTHY   = "HEALTHY".asInstanceOf[CustomHealthStatus]
    val UNHEALTHY = "UNHEALTHY".asInstanceOf[CustomHealthStatus]

    val values = js.Object.freeze(js.Array(HEALTHY, UNHEALTHY))
  }

  @js.native
  @Factory
  trait DeleteNamespaceRequest extends js.Object {
    var Id: ResourceId
  }

  @js.native
  @Factory
  trait DeleteNamespaceResponse extends js.Object {
    var OperationId: js.UndefOr[OperationId]
  }

  @js.native
  @Factory
  trait DeleteServiceRequest extends js.Object {
    var Id: ResourceId
  }

  @js.native
  @Factory
  trait DeleteServiceResponse extends js.Object {}

  @js.native
  @Factory
  trait DeregisterInstanceRequest extends js.Object {
    var InstanceId: ResourceId
    var ServiceId: ResourceId
  }

  @js.native
  @Factory
  trait DeregisterInstanceResponse extends js.Object {
    var OperationId: js.UndefOr[OperationId]
  }

  @js.native
  @Factory
  trait DiscoverInstancesRequest extends js.Object {
    var NamespaceName: NamespaceName
    var ServiceName: ServiceName
    var HealthStatus: js.UndefOr[HealthStatusFilter]
    var MaxResults: js.UndefOr[MaxResults]
    var QueryParameters: js.UndefOr[Attributes]
  }

  @js.native
  @Factory
  trait DiscoverInstancesResponse extends js.Object {
    var Instances: js.UndefOr[HttpInstanceSummaryList]
  }

  /**
    * A complex type that contains information about the Amazon Route 53 DNS records that you want AWS Cloud Map to create when you register an instance.
    */
  @js.native
  @Factory
  trait DnsConfig extends js.Object {
    var DnsRecords: DnsRecordList
    var NamespaceId: js.UndefOr[ResourceId]
    var RoutingPolicy: js.UndefOr[RoutingPolicy]
  }

  /**
    * A complex type that contains information about changes to the Route 53 DNS records that AWS Cloud Map creates when you register an instance.
    */
  @js.native
  @Factory
  trait DnsConfigChange extends js.Object {
    var DnsRecords: DnsRecordList
  }

  /**
    * A complex type that contains the ID for the Route 53 hosted zone that AWS Cloud Map creates when you create a namespace.
    */
  @js.native
  @Factory
  trait DnsProperties extends js.Object {
    var HostedZoneId: js.UndefOr[ResourceId]
  }

  /**
    * A complex type that contains information about the Route 53 DNS records that you want AWS Cloud Map to create when you register an instance.
    */
  @js.native
  @Factory
  trait DnsRecord extends js.Object {
    var TTL: RecordTTL
    var Type: RecordType
  }

  @js.native
  sealed trait FilterCondition extends js.Any
  object FilterCondition extends js.Object {
    val EQ      = "EQ".asInstanceOf[FilterCondition]
    val IN      = "IN".asInstanceOf[FilterCondition]
    val BETWEEN = "BETWEEN".asInstanceOf[FilterCondition]

    val values = js.Object.freeze(js.Array(EQ, IN, BETWEEN))
  }

  @js.native
  @Factory
  trait GetInstanceRequest extends js.Object {
    var InstanceId: ResourceId
    var ServiceId: ResourceId
  }

  @js.native
  @Factory
  trait GetInstanceResponse extends js.Object {
    var Instance: js.UndefOr[Instance]
  }

  @js.native
  @Factory
  trait GetInstancesHealthStatusRequest extends js.Object {
    var ServiceId: ResourceId
    var Instances: js.UndefOr[InstanceIdList]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait GetInstancesHealthStatusResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Status: js.UndefOr[InstanceHealthStatusMap]
  }

  @js.native
  @Factory
  trait GetNamespaceRequest extends js.Object {
    var Id: ResourceId
  }

  @js.native
  @Factory
  trait GetNamespaceResponse extends js.Object {
    var Namespace: js.UndefOr[Namespace]
  }

  @js.native
  @Factory
  trait GetOperationRequest extends js.Object {
    var OperationId: ResourceId
  }

  @js.native
  @Factory
  trait GetOperationResponse extends js.Object {
    var Operation: js.UndefOr[Operation]
  }

  @js.native
  @Factory
  trait GetServiceRequest extends js.Object {
    var Id: ResourceId
  }

  @js.native
  @Factory
  trait GetServiceResponse extends js.Object {
    var Service: js.UndefOr[Service]
  }

  /**
    * <i>Public DNS namespaces only.</i> A complex type that contains settings for an optional health check. If you specify settings for a health check, AWS Cloud Map associates the health check with the records that you specify in <code>DnsConfig</code>.
    *  <important> If you specify a health check configuration, you can specify either <code>HealthCheckCustomConfig</code> or <code>HealthCheckConfig</code> but not both.
    *  </important> Health checks are basic Route 53 health checks that monitor an AWS endpoint. For information about pricing for health checks, see [[http://aws.amazon.com/route53/pricing/|Amazon Route 53 Pricing]].
    *  Note the following about configuring health checks.
    *  ```A and AAAA records```
    *  If <code>DnsConfig</code> includes configurations for both A and AAAA records, AWS Cloud Map creates a health check that uses the IPv4 address to check the health of the resource. If the endpoint that is specified by the IPv4 address is unhealthy, Route 53 considers both the A and AAAA records to be unhealthy.
    *  ```CNAME records```
    *  You can't specify settings for <code>HealthCheckConfig</code> when the <code>DNSConfig</code> includes <code>CNAME</code> for the value of <code>Type</code>. If you do, the <code>CreateService</code> request will fail with an <code>InvalidInput</code> error.
    *  ```Request interval```
    *  A Route 53 health checker in each health-checking region sends a health check request to an endpoint every 30 seconds. On average, your endpoint receives a health check request about every two seconds. However, health checkers don't coordinate with one another, so you'll sometimes see several requests per second followed by a few seconds with no health checks at all.
    *  ```Health checking regions```
    *  Health checkers perform checks from all Route 53 health-checking regions. For a list of the current regions, see [[http://docs.aws.amazon.com/Route53/latest/APIReference/API_HealthCheckConfig.html#Route53-Type-HealthCheckConfig-Regions|Regions]].
    *  ```Alias records```
    *  When you register an instance, if you include the <code>AWS_ALIAS_DNS_NAME</code> attribute, AWS Cloud Map creates a Route 53 alias record. Note the following:
    * * Route 53 automatically sets <code>EvaluateTargetHealth</code> to true for alias records. When <code>EvaluateTargetHealth</code> is true, the alias record inherits the health of the referenced AWS resource. such as an ELB load balancer. For more information, see [[http://docs.aws.amazon.com/Route53/latest/APIReference/API_AliasTarget.html#Route53-Type-AliasTarget-EvaluateTargetHealth|EvaluateTargetHealth]].
    *  * If you include <code>HealthCheckConfig</code> and then use the service to register an instance that creates an alias record, Route 53 doesn't create the health check.
    * ```Charges for health checks```
    *  Health checks are basic Route 53 health checks that monitor an AWS endpoint. For information about pricing for health checks, see [[http://aws.amazon.com/route53/pricing/|Amazon Route 53 Pricing]].
    */
  @js.native
  @Factory
  trait HealthCheckConfig extends js.Object {
    var Type: HealthCheckType
    var FailureThreshold: js.UndefOr[FailureThreshold]
    var ResourcePath: js.UndefOr[ResourcePath]
  }

  /**
    * A complex type that contains information about an optional custom health check. A custom health check, which requires that you use a third-party health checker to evaluate the health of your resources, is useful in the following circumstances:
    * * You can't use a health check that is defined by <code>HealthCheckConfig</code> because the resource isn't available over the internet. For example, you can use a custom health check when the instance is in an Amazon VPC. (To check the health of resources in a VPC, the health checker must also be in the VPC.)
    *  * You want to use a third-party health checker regardless of where your resources are.
    * <important> If you specify a health check configuration, you can specify either <code>HealthCheckCustomConfig</code> or <code>HealthCheckConfig</code> but not both.
    *  </important> To change the status of a custom health check, submit an <code>UpdateInstanceCustomHealthStatus</code> request. Cloud Map doesn't monitor the status of the resource, it just keeps a record of the status specified in the most recent <code>UpdateInstanceCustomHealthStatus</code> request.
    *  Here's how custom health checks work:
    *  <ol> * You create a service and specify a value for <code>FailureThreshold</code>.
    *  The failure threshold indicates the number of 30-second intervals you want AWS Cloud Map to wait between the time that your application sends an <a>UpdateInstanceCustomHealthStatus</a> request and the time that AWS Cloud Map stops routing internet traffic to the corresponding resource.
    *  * You register an instance.
    *  <li> You configure a third-party health checker to monitor the resource that is associated with the new instance.
    *
    * '''Note:'''AWS Cloud Map doesn't check the health of the resource directly.
    * </li> * The third-party health-checker determines that the resource is unhealthy and notifies your application.
    *  * Your application submits an <code>UpdateInstanceCustomHealthStatus</code> request.
    *  * AWS Cloud Map waits for (<code>FailureThreshold</code> x 30) seconds.
    *  * If another <code>UpdateInstanceCustomHealthStatus</code> request doesn't arrive during that time to change the status back to healthy, AWS Cloud Map stops routing traffic to the resource.
    *  </ol> Note the following about configuring custom health checks.
    */
  @js.native
  @Factory
  trait HealthCheckCustomConfig extends js.Object {
    var FailureThreshold: js.UndefOr[FailureThreshold]
  }

  @js.native
  sealed trait HealthCheckType extends js.Any
  object HealthCheckType extends js.Object {
    val HTTP  = "HTTP".asInstanceOf[HealthCheckType]
    val HTTPS = "HTTPS".asInstanceOf[HealthCheckType]
    val TCP   = "TCP".asInstanceOf[HealthCheckType]

    val values = js.Object.freeze(js.Array(HTTP, HTTPS, TCP))
  }

  @js.native
  sealed trait HealthStatus extends js.Any
  object HealthStatus extends js.Object {
    val HEALTHY   = "HEALTHY".asInstanceOf[HealthStatus]
    val UNHEALTHY = "UNHEALTHY".asInstanceOf[HealthStatus]
    val UNKNOWN   = "UNKNOWN".asInstanceOf[HealthStatus]

    val values = js.Object.freeze(js.Array(HEALTHY, UNHEALTHY, UNKNOWN))
  }

  @js.native
  sealed trait HealthStatusFilter extends js.Any
  object HealthStatusFilter extends js.Object {
    val HEALTHY   = "HEALTHY".asInstanceOf[HealthStatusFilter]
    val UNHEALTHY = "UNHEALTHY".asInstanceOf[HealthStatusFilter]
    val ALL       = "ALL".asInstanceOf[HealthStatusFilter]

    val values = js.Object.freeze(js.Array(HEALTHY, UNHEALTHY, ALL))
  }

  /**
    * In a response to a <a>DiscoverInstance</a> request, <code>HttpInstanceSummary</code> contains information about one instance that matches the values that you specified in the request.
    */
  @js.native
  @Factory
  trait HttpInstanceSummary extends js.Object {
    var Attributes: js.UndefOr[Attributes]
    var HealthStatus: js.UndefOr[HealthStatus]
    var InstanceId: js.UndefOr[ResourceId]
    var NamespaceName: js.UndefOr[NamespaceName]
    var ServiceName: js.UndefOr[ServiceName]
  }

  /**
    * A complex type that contains the name of an HTTP namespace.
    */
  @js.native
  @Factory
  trait HttpProperties extends js.Object {
    var HttpName: js.UndefOr[NamespaceName]
  }

  /**
    * A complex type that contains information about an instance that AWS Cloud Map creates when you submit a <code>RegisterInstance</code> request.
    */
  @js.native
  @Factory
  trait Instance extends js.Object {
    var Id: ResourceId
    var Attributes: js.UndefOr[Attributes]
    var CreatorRequestId: js.UndefOr[ResourceId]
  }

  /**
    * A complex type that contains information about the instances that you registered by using a specified service.
    */
  @js.native
  @Factory
  trait InstanceSummary extends js.Object {
    var Attributes: js.UndefOr[Attributes]
    var Id: js.UndefOr[ResourceId]
  }

  @js.native
  @Factory
  trait ListInstancesRequest extends js.Object {
    var ServiceId: ResourceId
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListInstancesResponse extends js.Object {
    var Instances: js.UndefOr[InstanceSummaryList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListNamespacesRequest extends js.Object {
    var Filters: js.UndefOr[NamespaceFilters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListNamespacesResponse extends js.Object {
    var Namespaces: js.UndefOr[NamespaceSummariesList]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListOperationsRequest extends js.Object {
    var Filters: js.UndefOr[OperationFilters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListOperationsResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Operations: js.UndefOr[OperationSummaryList]
  }

  @js.native
  @Factory
  trait ListServicesRequest extends js.Object {
    var Filters: js.UndefOr[ServiceFilters]
    var MaxResults: js.UndefOr[MaxResults]
    var NextToken: js.UndefOr[NextToken]
  }

  @js.native
  @Factory
  trait ListServicesResponse extends js.Object {
    var NextToken: js.UndefOr[NextToken]
    var Services: js.UndefOr[ServiceSummariesList]
  }

  /**
    * A complex type that contains information about a specified namespace.
    */
  @js.native
  @Factory
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

  /**
    * A complex type that identifies the namespaces that you want to list. You can choose to list public or private namespaces.
    */
  @js.native
  @Factory
  trait NamespaceFilter extends js.Object {
    var Name: NamespaceFilterName
    var Values: FilterValues
    var Condition: js.UndefOr[FilterCondition]
  }

  @js.native
  sealed trait NamespaceFilterName extends js.Any
  object NamespaceFilterName extends js.Object {
    val TYPE = "TYPE".asInstanceOf[NamespaceFilterName]

    val values = js.Object.freeze(js.Array(TYPE))
  }

  /**
    * A complex type that contains information that is specific to the namespace type.
    */
  @js.native
  @Factory
  trait NamespaceProperties extends js.Object {
    var DnsProperties: js.UndefOr[DnsProperties]
    var HttpProperties: js.UndefOr[HttpProperties]
  }

  /**
    * A complex type that contains information about a namespace.
    */
  @js.native
  @Factory
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

  @js.native
  sealed trait NamespaceType extends js.Any
  object NamespaceType extends js.Object {
    val DNS_PUBLIC  = "DNS_PUBLIC".asInstanceOf[NamespaceType]
    val DNS_PRIVATE = "DNS_PRIVATE".asInstanceOf[NamespaceType]
    val HTTP        = "HTTP".asInstanceOf[NamespaceType]

    val values = js.Object.freeze(js.Array(DNS_PUBLIC, DNS_PRIVATE, HTTP))
  }

  /**
    * A complex type that contains information about a specified operation.
    */
  @js.native
  @Factory
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

  /**
    * A complex type that lets you select the operations that you want to list.
    */
  @js.native
  @Factory
  trait OperationFilter extends js.Object {
    var Name: OperationFilterName
    var Values: FilterValues
    var Condition: js.UndefOr[FilterCondition]
  }

  @js.native
  sealed trait OperationFilterName extends js.Any
  object OperationFilterName extends js.Object {
    val NAMESPACE_ID = "NAMESPACE_ID".asInstanceOf[OperationFilterName]
    val SERVICE_ID   = "SERVICE_ID".asInstanceOf[OperationFilterName]
    val STATUS       = "STATUS".asInstanceOf[OperationFilterName]
    val TYPE         = "TYPE".asInstanceOf[OperationFilterName]
    val UPDATE_DATE  = "UPDATE_DATE".asInstanceOf[OperationFilterName]

    val values = js.Object.freeze(js.Array(NAMESPACE_ID, SERVICE_ID, STATUS, TYPE, UPDATE_DATE))
  }

  @js.native
  sealed trait OperationStatus extends js.Any
  object OperationStatus extends js.Object {
    val SUBMITTED = "SUBMITTED".asInstanceOf[OperationStatus]
    val PENDING   = "PENDING".asInstanceOf[OperationStatus]
    val SUCCESS   = "SUCCESS".asInstanceOf[OperationStatus]
    val FAIL      = "FAIL".asInstanceOf[OperationStatus]

    val values = js.Object.freeze(js.Array(SUBMITTED, PENDING, SUCCESS, FAIL))
  }

  /**
    * A complex type that contains information about an operation that matches the criteria that you specified in a <a>ListOperations</a> request.
    */
  @js.native
  @Factory
  trait OperationSummary extends js.Object {
    var Id: js.UndefOr[OperationId]
    var Status: js.UndefOr[OperationStatus]
  }

  @js.native
  sealed trait OperationTargetType extends js.Any
  object OperationTargetType extends js.Object {
    val NAMESPACE = "NAMESPACE".asInstanceOf[OperationTargetType]
    val SERVICE   = "SERVICE".asInstanceOf[OperationTargetType]
    val INSTANCE  = "INSTANCE".asInstanceOf[OperationTargetType]

    val values = js.Object.freeze(js.Array(NAMESPACE, SERVICE, INSTANCE))
  }

  @js.native
  sealed trait OperationType extends js.Any
  object OperationType extends js.Object {
    val CREATE_NAMESPACE    = "CREATE_NAMESPACE".asInstanceOf[OperationType]
    val DELETE_NAMESPACE    = "DELETE_NAMESPACE".asInstanceOf[OperationType]
    val UPDATE_SERVICE      = "UPDATE_SERVICE".asInstanceOf[OperationType]
    val REGISTER_INSTANCE   = "REGISTER_INSTANCE".asInstanceOf[OperationType]
    val DEREGISTER_INSTANCE = "DEREGISTER_INSTANCE".asInstanceOf[OperationType]

    val values = js.Object.freeze(
      js.Array(CREATE_NAMESPACE, DELETE_NAMESPACE, UPDATE_SERVICE, REGISTER_INSTANCE, DEREGISTER_INSTANCE)
    )
  }

  @js.native
  sealed trait RecordType extends js.Any
  object RecordType extends js.Object {
    val SRV   = "SRV".asInstanceOf[RecordType]
    val A     = "A".asInstanceOf[RecordType]
    val AAAA  = "AAAA".asInstanceOf[RecordType]
    val CNAME = "CNAME".asInstanceOf[RecordType]

    val values = js.Object.freeze(js.Array(SRV, A, AAAA, CNAME))
  }

  @js.native
  @Factory
  trait RegisterInstanceRequest extends js.Object {
    var Attributes: Attributes
    var InstanceId: ResourceId
    var ServiceId: ResourceId
    var CreatorRequestId: js.UndefOr[ResourceId]
  }

  @js.native
  @Factory
  trait RegisterInstanceResponse extends js.Object {
    var OperationId: js.UndefOr[OperationId]
  }

  @js.native
  sealed trait RoutingPolicy extends js.Any
  object RoutingPolicy extends js.Object {
    val MULTIVALUE = "MULTIVALUE".asInstanceOf[RoutingPolicy]
    val WEIGHTED   = "WEIGHTED".asInstanceOf[RoutingPolicy]

    val values = js.Object.freeze(js.Array(MULTIVALUE, WEIGHTED))
  }

  /**
    * A complex type that contains information about the specified service.
    */
  @js.native
  @Factory
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

  /**
    * A complex type that contains changes to an existing service.
    */
  @js.native
  @Factory
  trait ServiceChange extends js.Object {
    var DnsConfig: DnsConfigChange
    var Description: js.UndefOr[ResourceDescription]
    var HealthCheckConfig: js.UndefOr[HealthCheckConfig]
  }

  /**
    * A complex type that lets you specify the namespaces that you want to list services for.
    */
  @js.native
  @Factory
  trait ServiceFilter extends js.Object {
    var Name: ServiceFilterName
    var Values: FilterValues
    var Condition: js.UndefOr[FilterCondition]
  }

  @js.native
  sealed trait ServiceFilterName extends js.Any
  object ServiceFilterName extends js.Object {
    val NAMESPACE_ID = "NAMESPACE_ID".asInstanceOf[ServiceFilterName]

    val values = js.Object.freeze(js.Array(NAMESPACE_ID))
  }

  /**
    * A complex type that contains information about a specified service.
    */
  @js.native
  @Factory
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

  @js.native
  @Factory
  trait UpdateInstanceCustomHealthStatusRequest extends js.Object {
    var InstanceId: ResourceId
    var ServiceId: ResourceId
    var Status: CustomHealthStatus
  }

  @js.native
  @Factory
  trait UpdateServiceRequest extends js.Object {
    var Id: ResourceId
    var Service: ServiceChange
  }

  @js.native
  @Factory
  trait UpdateServiceResponse extends js.Object {
    var OperationId: js.UndefOr[OperationId]
  }
}
